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
  static names(): { [key: string]: string } {
    return {
      termIndex: 'term_index',
      rentalMoney: 'rental_money',
      payDay: 'pay_day',
    };
  }

  static types(): { [key: string]: any } {
    return {
      termIndex: 'number',
      rentalMoney: 'number',
      payDay: 'string',
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
  // 状态为逾期1天及以上的账单金额
  billAmountOverdueBy1dayOrMore: number;
  // 状态为逾期30天及以上的账单金额
  billAmountOverdueBy30DaysOrMore: number;
  // Y期的订单的账单金额
  totalBillAmountYPeriod: number;
  // 已到Y期订单中Y期平均期限(y期订单的平均期限)
  averageTermYPeriod: string;
  // Y期的订单中状态为取消的账单金额
  cancelledBillAmountYPeriod: number;
  // Y期的订单中状态为逾期1天及以上的账单金额
  billAmountOverdueBy1dayOrMoreYPeriod: number;
  // Y期的订单中状态为逾期30天及以上的账单金额
  billAmountOverdueBy30DaysOrMoreYPeriod: number;
  static names(): { [key: string]: string } {
    return {
      deliveryMonth: 'delivery_month',
      totalBillAmount: 'total_bill_amount',
      averageTerm: 'average_term',
      cancelledBillAmount: 'cancelled_bill_amount',
      billAmountOverdueBy1dayOrMore: 'bill_amount_overdue_by_1day_or_more',
      billAmountOverdueBy30DaysOrMore: 'bill_amount_overdue_by_30_days_or_more',
      totalBillAmountYPeriod: 'total_bill_amount_y_period',
      averageTermYPeriod: 'average_term_y_period',
      cancelledBillAmountYPeriod: 'cancelled_bill_amount_y_period',
      billAmountOverdueBy1dayOrMoreYPeriod: 'bill_amount_overdue_by_1day_or_more_y_period',
      billAmountOverdueBy30DaysOrMoreYPeriod: 'bill_amount_overdue_by_30_days_or_more_y_period',
    };
  }

  static types(): { [key: string]: any } {
    return {
      deliveryMonth: 'string',
      totalBillAmount: 'number',
      averageTerm: 'string',
      cancelledBillAmount: 'number',
      billAmountOverdueBy1dayOrMore: 'number',
      billAmountOverdueBy30DaysOrMore: 'number',
      totalBillAmountYPeriod: 'number',
      averageTermYPeriod: 'string',
      cancelledBillAmountYPeriod: 'number',
      billAmountOverdueBy1dayOrMoreYPeriod: 'number',
      billAmountOverdueBy30DaysOrMoreYPeriod: 'number',
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
  static names(): { [key: string]: string } {
    return {
      leaseTermIndex: 'lease_term_index',
      rentalReturnState: 'rental_return_state',
      realRepayMoney: 'real_repay_money',
      rentalMoney: 'rental_money',
      returnTime: 'return_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      leaseTermIndex: 'number',
      rentalReturnState: 'string',
      realRepayMoney: 'number',
      rentalMoney: 'number',
      returnTime: 'string',
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
  static names(): { [key: string]: string } {
    return {
      relationId: 'relation_id',
      companyName: 'company_name',
      merchantId: 'merchant_id',
      status: 'status',
      subjectMerchantId: 'subject_merchant_id',
      subjectCompanyName: 'subject_company_name',
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

// 应用信息
export class ApplicationInfo extends $tea.Model {
  // 应用场景
  // MINI_APP 小程序
  // APP 自有app
  // ALL 两种都有
  applicationScene: string;
  // 小程序id
  tinyAppId: string;
  // 小程序名称
  siteName: string;
  // 网站地址
  sitUrl: string;
  // 商户名称。
  // 修改后的商户名称，将同步支付宝代扣签约页面字段展示
  merchantName: string;
  // 商户服务名称。
  // 修改后的商户服务名称，将同步支付宝代扣签约页面字段展示
  merchantServiceName: string;
  // 商户服务描述。
  // 修改后的商户服务描述，将同步支付宝代扣签约页面字段展示
  merchantServiceDesc: string;
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
  static names(): { [key: string]: string } {
    return {
      sceneCode: 'scene_code',
      score: 'score',
      delinquencyRate: 'delinquency_rate',
      riskAdvice: 'risk_advice',
      riskRank: 'risk_rank',
      flowId: 'flow_id',
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
  companyMobile: string;
  // 公司联系地址
  companyAddress: string;
  // 联系人姓名
  contactName: string;
  // 联系人手机号码
  contactMobile: string;
  // 绑定企业支付宝账号
  bindAlipayNo: string;
  // 结算企业支付宝账号
  settleAlipayNo: string;
  // 绑定支付宝uid
  bindAlipayUid: string;
  static names(): { [key: string]: string } {
    return {
      businessLicenseFile: 'business_license_file',
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
      bindAlipayNo: 'bind_alipay_no',
      settleAlipayNo: 'settle_alipay_no',
      bindAlipayUid: 'bind_alipay_uid',
    };
  }

  static types(): { [key: string]: any } {
    return {
      businessLicenseFile: FileInfo,
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
      bindAlipayNo: 'string',
      settleAlipayNo: 'string',
      bindAlipayUid: 'string',
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
  static names(): { [key: string]: string } {
    return {
      eventId: 'event_id',
      type: 'type',
      status: 'status',
      contentSubject: 'content_subject',
      effectiveStartTime: 'effective_start_time',
      effectiveEndTime: 'effective_end_time',
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
  static names(): { [key: string]: string } {
    return {
      applicationScene: 'application_scene',
      tinyAppId: 'tiny_app_id',
      siteName: 'site_name',
      sitUrl: 'sit_url',
      merchantName: 'merchant_name',
      merchantServiceName: 'merchant_service_name',
      merchantServiceDesc: 'merchant_service_desc',
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

// 法人信息
export class LegalInfo extends $tea.Model {
  // 法人名称
  legalName: string;
  // 法人证件号
  legalCertNo: string;
  // 法人证件正面
  legalCertFrontFile: FileInfo;
  // 法人证件反面
  legalCertBackFile: FileInfo;
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

export class SyncFundSplittingRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 资方订单号
  fundNo: string;
  // 商户的订单号
  orderId: string;
  // 商户的数科租户ID
  merchantTenantId: string;
  // 第几期，例如：2表示第二期
  termNum: number;
  // 扣款时间， yyyy-MM-dd HH:mm:ss 格式
  deductionTime: string;
  // 扣款金额，单位精确到分， 例如：12462300为124623.00元
  deductionAmount: number;
  // 商户分账金额，单位精确到分，比如：666601 = 6666.01元
  merchantSplitAmount: number;
  // 资方分账金额，单位精确到分。比如：666610 = 6666.10元
  fundSplitAmount: number;
  // 其他参与方分账信息，JSON格式的数组，样例：
  // [{"participants":"参与方A","amount":666600,"accountNo":"777223","accountType":"ICBC"}]
  otherSplitInfo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      fundNo: 'fund_no',
      orderId: 'order_id',
      merchantTenantId: 'merchant_tenant_id',
      termNum: 'term_num',
      deductionTime: 'deduction_time',
      deductionAmount: 'deduction_amount',
      merchantSplitAmount: 'merchant_split_amount',
      fundSplitAmount: 'fund_split_amount',
      otherSplitInfo: 'other_split_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      fundNo: 'string',
      orderId: 'string',
      merchantTenantId: 'string',
      termNum: 'number',
      deductionTime: 'string',
      deductionAmount: 'number',
      merchantSplitAmount: 'number',
      fundSplitAmount: 'number',
      otherSplitInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncFundSplittingResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 流水同步描述信息
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

export class SyncFundOrderfinancialRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单号
  orderId: string;
  // 商户在数科的租户ID
  merchantTenantId: string;
  // 订单融资唯一标识
  applicationId: string;
  // 订单融资状态：1-成功；2-失败
  status: number;
  // 融资结果描述，长度不超过64
  reason?: string;
  // 额外信息
  extras?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      merchantTenantId: 'merchant_tenant_id',
      applicationId: 'application_id',
      status: 'status',
      reason: 'reason',
      extras: 'extras',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      merchantTenantId: 'string',
      applicationId: 'string',
      status: 'number',
      reason: 'string',
      extras: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncFundOrderfinancialResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 结果描述信息
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

export class SyncFundWithholdingcontractRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单号
  orderId: string;
  // 商家在数科注册的租户id
  merchantTenantId: string;
  // 代扣协议号
  withholdingContractId: string;
  // json的字符串，存储额外信息
  extraInfo?: string;
  // 签署状态：
  // - ACCEPT : 接受
  // - REFUSE : 拒绝
  // - TIMEOUT : 超时
  status: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      merchantTenantId: 'merchant_tenant_id',
      withholdingContractId: 'withholding_contract_id',
      extraInfo: 'extra_info',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      merchantTenantId: 'string',
      withholdingContractId: 'string',
      extraInfo: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncFundWithholdingcontractResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 存储成功
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

export class SyncFundOrderfulfillmentRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 商户id
  merchantTenantId: string;
  // 订单id
  orderId: string;
  // 租期编号
  leaseTermIndex: number;
  // 剩余归还期数
  remainTerm: number;
  // 总期数
  totalTerm: number;
  // 租金归还状态，
  // RETURN_FULL : 足额归还 【终态】
  // NOT_RETURN : 未归还
  // CANCEL : 取消 【终态】
  rentalReturnState: string;
  // 租金归还金额,精确到分，即1234表示12.34元
  rentalMoney: number;
  // 罚息金额，分，1234表示12.34元
  penaltyFeeMoney: number;
  // 总金额，单位分
  totalMoney: number;
  // 归还时间，格式为"2019-07-31 12:00:00"
  returnTime?: string;
  // 归还方式，
  // ANTDIGITAL： 数科代扣
  // FUND : 资方代扣
  // BANK : 银行转账
  // WECHAT : 微信支付
  returnWay?: string;
  // 还款凭证编号
  returnVoucherSerial?: string;
  // 银行名字
  bankName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      merchantTenantId: 'merchant_tenant_id',
      orderId: 'order_id',
      leaseTermIndex: 'lease_term_index',
      remainTerm: 'remain_term',
      totalTerm: 'total_term',
      rentalReturnState: 'rental_return_state',
      rentalMoney: 'rental_money',
      penaltyFeeMoney: 'penalty_fee_money',
      totalMoney: 'total_money',
      returnTime: 'return_time',
      returnWay: 'return_way',
      returnVoucherSerial: 'return_voucher_serial',
      bankName: 'bank_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      merchantTenantId: 'string',
      orderId: 'string',
      leaseTermIndex: 'number',
      remainTerm: 'number',
      totalTerm: 'number',
      rentalReturnState: 'string',
      rentalMoney: 'number',
      penaltyFeeMoney: 'number',
      totalMoney: 'number',
      returnTime: 'string',
      returnWay: 'string',
      returnVoucherSerial: 'string',
      bankName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncFundOrderfulfillmentResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 添加成功
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

export class GetFundOrderfulfillmentRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单id
  orderId: string;
  // 租赁订单所属商家租户id
  merchantTenantId: string;
  // 期数
  // 如果填入，获取term_idx下的履约记录
  // 如果不填入，获取order_id下的所有履约记录
  termIdx?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      merchantTenantId: 'merchant_tenant_id',
      termIdx: 'term_idx',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      merchantTenantId: 'string',
      termIdx: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetFundOrderfulfillmentResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 订单履约信息的列表数组
  // List<OrderFulfillment> 的jsonArray.toString
  orderFulfillmentDataList?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      orderFulfillmentDataList: 'order_fulfillment_data_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      orderFulfillmentDataList: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadFundFlowRequest extends $tea.Model {
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
  fileObject?: Readable;
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

export class UploadFundFlowResponse extends $tea.Model {
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

export class GetFundFlowRequest extends $tea.Model {
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

export class GetFundFlowResponse extends $tea.Model {
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

export class RefuseFundFlowRequest extends $tea.Model {
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

export class RefuseFundFlowResponse extends $tea.Model {
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

export class AuthFundFlowRequest extends $tea.Model {
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

export class AuthFundFlowResponse extends $tea.Model {
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

export class CancelFundPlanRequest extends $tea.Model {
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
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelFundPlanResponse extends $tea.Model {
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

export class CallbackFundNotifyRequest extends $tea.Model {
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

export class CallbackFundNotifyResponse extends $tea.Model {
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

export class SyncFundMerchantpromiseRequest extends $tea.Model {
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

export class SyncFundMerchantpromiseResponse extends $tea.Model {
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

export class SyncFundFinanceloanresultsRequest extends $tea.Model {
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

export class SyncFundFinanceloanresultsResponse extends $tea.Model {
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

export class GetFundUserpromiseRequest extends $tea.Model {
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

export class GetFundUserpromiseResponse extends $tea.Model {
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

export class GetFundUserperformanceRequest extends $tea.Model {
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

export class GetFundUserperformanceResponse extends $tea.Model {
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

export class GetFundMerchantperformanceRequest extends $tea.Model {
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

export class GetFundMerchantperformanceResponse extends $tea.Model {
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

export class GetFundOrderfullinfoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单Id
  orderId: string;
  // 订单所属商户的社会信用代码
  merchantId: string;
  // 订单所属商户的社会信用代码
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

export class GetFundOrderfullinfoResponse extends $tea.Model {
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

export class NotifyFundFlowRequest extends $tea.Model {
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

export class NotifyFundFlowResponse extends $tea.Model {
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

export class UploadFundCreditRequest extends $tea.Model {
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

export class UploadFundCreditResponse extends $tea.Model {
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

export class QueryFundCreditRequest extends $tea.Model {
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

export class QueryFundCreditResponse extends $tea.Model {
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

export class SyncFundFinanceprecheckresultRequest extends $tea.Model {
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

export class SyncFundFinanceprecheckresultResponse extends $tea.Model {
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

export class QueryFundCompensateaccountRequest extends $tea.Model {
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

export class QueryFundCompensateaccountResponse extends $tea.Model {
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

export class GetFundOrderfinanceinfoRequest extends $tea.Model {
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

export class GetFundOrderfinanceinfoResponse extends $tea.Model {
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

export class AddFundDividerelationRequest extends $tea.Model {
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

export class AddFundDividerelationResponse extends $tea.Model {
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

export class QueryFundDividerelationRequest extends $tea.Model {
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

export class QueryFundDividerelationResponse extends $tea.Model {
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

export class ApplyFundCreditutilizationRequest extends $tea.Model {
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

export class ApplyFundCreditutilizationResponse extends $tea.Model {
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

export class ApplyFundAssertorderRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 授权id
  authId: string;
  // 资方统一社会信用代码
  fundId: string;
  // 商户的租户id
  tenantId: string;
  // 商家统一社会信用代码
  merchantId: string;
  // 异步生成文件任务流水号
  bizNo: string;
  // 查询开始时间
  startTime: string;
  // 查询结束时间
  endTime: string;
  // 是否过滤被其他资方标记的订单（融资申请中+融资申请通过），默认值false
  filterFinancingStatus?: boolean;
  // 是否过滤已取消订单 （无剩余应还期数），默认值false
  filterCancel?: boolean;
  // 是否过滤提前结清订单,默认值false
  filterEarlySettlement?: boolean;
  // 是否过滤某一期已逾期的订单,默认值false
  filterOverdue?: boolean;
  // 是否过滤最新一期晚于计划扣款日的重试中订单 ,默认值false
  filterRetry?: boolean;
  // 是否过滤付款日为当日（查询日）的订单 （当日需执行扣款的）,默认值false
  filterTodayPay?: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      authId: 'auth_id',
      fundId: 'fund_id',
      tenantId: 'tenant_id',
      merchantId: 'merchant_id',
      bizNo: 'biz_no',
      startTime: 'start_time',
      endTime: 'end_time',
      filterFinancingStatus: 'filter_financing_status',
      filterCancel: 'filter_cancel',
      filterEarlySettlement: 'filter_early_settlement',
      filterOverdue: 'filter_overdue',
      filterRetry: 'filter_retry',
      filterTodayPay: 'filter_today_pay',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      authId: 'string',
      fundId: 'string',
      tenantId: 'string',
      merchantId: 'string',
      bizNo: 'string',
      startTime: 'string',
      endTime: 'string',
      filterFinancingStatus: 'boolean',
      filterCancel: 'boolean',
      filterEarlySettlement: 'boolean',
      filterOverdue: 'boolean',
      filterRetry: 'boolean',
      filterTodayPay: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyFundAssertorderResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 任务状态
  // ● RUNNING:生成中
  // ● SUCCESS:已生成
  // ● FAILED:失败
  taskStatus?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      taskStatus: 'task_status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      taskStatus: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryFundAssertorderRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 授权id
  authId: string;
  // 资方统一社会信用代码
  fundId: string;
  // 商户的租户id
  tenantId: string;
  // 商家统一社会信用代码
  merchantId: string;
  // 异步生成文件任务流水号
  bizNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      authId: 'auth_id',
      fundId: 'fund_id',
      tenantId: 'tenant_id',
      merchantId: 'merchant_id',
      bizNo: 'biz_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      authId: 'string',
      fundId: 'string',
      tenantId: 'string',
      merchantId: 'string',
      bizNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryFundAssertorderResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 用信订单履约信息
  data?: OrderPromiseExcelInfo[];
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
      data: { 'type': 'array', 'itemType': OrderPromiseExcelInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncFundCreditgrantingRequest extends $tea.Model {
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
  grantingLine: number;
  // 授信有效期开始时间(yyyy-MM-dd HH:mm:ss)
  effectStartTime: string;
  // 授信有效期结束时间(yyyy-MM-dd HH:mm:ss)
  effectEndTime: string;
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
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncFundCreditgrantingResponse extends $tea.Model {
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

export class AuthFundCreditgrantingRequest extends $tea.Model {
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

export class AuthFundCreditgrantingResponse extends $tea.Model {
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

export class QueryFundAssertreportRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 授权id
  authId: string;
  // 资方统一社会信用代码
  fundId: string;
  // 商户的租户id
  tenantId: string;
  // 商家统一社会信用代码
  merchantId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      authId: 'auth_id',
      fundId: 'fund_id',
      tenantId: 'tenant_id',
      merchantId: 'merchant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      authId: 'string',
      fundId: 'string',
      tenantId: 'string',
      merchantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryFundAssertreportResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 资产报告详情
  data?: FundAssertReport[];
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
      data: { 'type': 'array', 'itemType': FundAssertReport },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryFundCreditgrantingRequest extends $tea.Model {
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

export class QueryFundCreditgrantingResponse extends $tea.Model {
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
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryFundCreditauthRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 资方社会引用代码
  fundId: string;
  // 授权id
  authId: string;
  // 授权类型
  // CREDIT_GRANTING 授信
  // CREDIT_UTILIZATION 用信
  authType: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      fundId: 'fund_id',
      authId: 'auth_id',
      authType: 'auth_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      fundId: 'string',
      authId: 'string',
      authType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryFundCreditauthResponse extends $tea.Model {
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
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetInnerProductRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 商户在数科的租户id
  merchantTenantId: string;
  // 商户统一社会信用代码
  merchantId: string;
  // 商品id
  productId: string;
  // 商品版本
  productVersion: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      merchantTenantId: 'merchant_tenant_id',
      merchantId: 'merchant_id',
      productId: 'product_id',
      productVersion: 'product_version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      merchantTenantId: 'string',
      merchantId: 'string',
      productId: 'string',
      productVersion: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetInnerProductResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // {}json字符串
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

export class GetInnerTenantRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 商户在数科的租户id
  merchantTenantId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      merchantTenantId: 'merchant_tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      merchantTenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetInnerTenantResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // {}租户信息
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

export class SyncInnerMeterforwholeorderRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 商户租户id
  merchantTenantId: string;
  // 商户统一社会信用代码
  merchantId: string;
  // 商户购买的产品code
  meterProductCode: string;
  // 订单id
  orderId: string;
  // 订单总租期
  orderRentTerm: number;
  // 订单总租金，单位为分
  orderTotalMoney: number;
  // 系统名称
  sysName: string;
  // 订单产品的二级类目
  orderProductSubclass: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      merchantTenantId: 'merchant_tenant_id',
      merchantId: 'merchant_id',
      meterProductCode: 'meter_product_code',
      orderId: 'order_id',
      orderRentTerm: 'order_rent_term',
      orderTotalMoney: 'order_total_money',
      sysName: 'sys_name',
      orderProductSubclass: 'order_product_subclass',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      merchantTenantId: 'string',
      merchantId: 'string',
      meterProductCode: 'string',
      orderId: 'string',
      orderRentTerm: 'number',
      orderTotalMoney: 'number',
      sysName: 'string',
      orderProductSubclass: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncInnerMeterforwholeorderResponse extends $tea.Model {
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

export class SyncInnerMeterforagsignRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 商户租户id
  merchantTenantId: string;
  // 商户社会信用代码
  merchantId: string;
  // 计量上报Code
  meterProductCode: string;
  // 系统名字
  sysName: string;
  // 订单id
  orderId: string;
  // 合同编号
  signNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      merchantTenantId: 'merchant_tenant_id',
      merchantId: 'merchant_id',
      meterProductCode: 'meter_product_code',
      sysName: 'sys_name',
      orderId: 'order_id',
      signNo: 'sign_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      merchantTenantId: 'string',
      merchantId: 'string',
      meterProductCode: 'string',
      sysName: 'string',
      orderId: 'string',
      signNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncInnerMeterforagsignResponse extends $tea.Model {
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

export class AllInnerTemplateRequest extends $tea.Model {
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

export class AllInnerTemplateResponse extends $tea.Model {
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

export class ListInnerTemplateRequest extends $tea.Model {
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

export class ListInnerTemplateResponse extends $tea.Model {
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

export class DetailInnerTemplateRequest extends $tea.Model {
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

export class DetailInnerTemplateResponse extends $tea.Model {
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

export class CreateInnerTemplateRequest extends $tea.Model {
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

export class CreateInnerTemplateResponse extends $tea.Model {
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

export class SaveInnerTemplateRequest extends $tea.Model {
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

export class SaveInnerTemplateResponse extends $tea.Model {
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

export class SaveInnerSignfieldsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 商户对应租户ID
  tenantId: string;
  // 魔法库模板code
  templateCode: string;
  // 魔法库模板版本
  templateVersion: string;
  // 模板签署区列表
  signFieldList: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      templateCode: 'template_code',
      templateVersion: 'template_version',
      signFieldList: 'sign_field_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      templateCode: 'string',
      templateVersion: 'string',
      signFieldList: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveInnerSignfieldsResponse extends $tea.Model {
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

export class PublishInnerTemplateRequest extends $tea.Model {
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

export class PublishInnerTemplateResponse extends $tea.Model {
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

export class PreviewInnerTemplateRequest extends $tea.Model {
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

export class PreviewInnerTemplateResponse extends $tea.Model {
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

export class DeleteInnerTemplateRequest extends $tea.Model {
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

export class DeleteInnerTemplateResponse extends $tea.Model {
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

export class CloneInnerTemplateRequest extends $tea.Model {
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

export class CloneInnerTemplateResponse extends $tea.Model {
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

export class UploadInnerFileRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户8位id
  tenantId: string;
  // 文件名称
  fileName: string;
  // ● BUSINESS_LICENSE 营业执照
  // ● CARD_FRONT 身份证正面
  // ● CARD_BACK 身份证反面
  // ● SPLITTING 分账
  // ● CONTRACT_TEMPLATE 合同模板
  bizScene: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      fileName: 'file_name',
      bizScene: 'biz_scene',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      fileName: 'string',
      bizScene: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadInnerFileResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 临时上传地址
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

export class DownloadInnerFileRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户8位id
  tenantId: string;
  // 文件key
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

export class DownloadInnerFileResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 文件临时下载地址
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

export class GetInnerTemplateofficeurlRequest extends $tea.Model {
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

export class GetInnerTemplateofficeurlResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回值
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

export class RefreshInnerTemplatetokenRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 商户对应租户ID
  tenantId: string;
  // accessToken
  accessToken: string;
  // refreshToekn
  refreshToken: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      accessToken: 'access_token',
      refreshToken: 'refresh_token',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      accessToken: 'string',
      refreshToken: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RefreshInnerTemplatetokenResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回值
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

export class CreateInnerTemplatetextareaRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 商户对应租户ID
  tenantId: string;
  // 模板编码
  templateCode: string;
  // 模板版本号
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
  multiName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      templateCode: 'template_code',
      templateVersion: 'template_version',
      componentType: 'component_type',
      componentName: 'component_name',
      required: 'required',
      line: 'line',
      multiName: 'multi_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      templateCode: 'string',
      templateVersion: 'string',
      componentType: 'string',
      componentName: 'string',
      required: 'boolean',
      line: 'number',
      multiName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateInnerTemplatetextareaResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 创建成功的文本域组件信息
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

export class QueryInnerTemplateimageRequest extends $tea.Model {
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

export class QueryInnerTemplateimageResponse extends $tea.Model {
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

export class CreateInnerFunddividerelationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户8位id
  tenantId: string;
  // 第一次暂存或提交可以不传，由后端生成
  relationId?: string;
  // 分账公司名称
  companyName?: string;
  // 分账公司社会信用代码
  merchantId?: string;
  // 分账合同或协议
  contractFiles?: FileInfo[];
  // 分账关系说明
  desc?: string;
  // 分账方企业pid
  alipayPid?: string;
  // 分账方企业支付宝账号
  alipayAccount?: string;
  // 是否直接提交
  // SUBMITTED 直接提交
  // STAGE 暂存
  submit: string;
  // 操作人名称
  userName: string;
  // 商户公司社会统一信用代码, 
  // 如果expandMode=AGENT, 非空，长度不超过32位
  subjectMerchantId?: string;
  // 进件模式	:DIRECT(直连进件) ,AGENT(代理进件)
  // 默认值：DIRECT
  expandMode?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      relationId: 'relation_id',
      companyName: 'company_name',
      merchantId: 'merchant_id',
      contractFiles: 'contract_files',
      desc: 'desc',
      alipayPid: 'alipay_pid',
      alipayAccount: 'alipay_account',
      submit: 'submit',
      userName: 'user_name',
      subjectMerchantId: 'subject_merchant_id',
      expandMode: 'expand_mode',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      relationId: 'string',
      companyName: 'string',
      merchantId: 'string',
      contractFiles: { 'type': 'array', 'itemType': FileInfo },
      desc: 'string',
      alipayPid: 'string',
      alipayAccount: 'string',
      submit: 'string',
      userName: 'string',
      subjectMerchantId: 'string',
      expandMode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateInnerFunddividerelationResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 分账关系id
  relationId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      relationId: 'relation_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      relationId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SubmitInnerFunddividerelationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户8位id
  tenantId: string;
  // 分账关系id
  relationId: string;
  // 操作人名称
  userName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      relationId: 'relation_id',
      userName: 'user_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      relationId: 'string',
      userName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SubmitInnerFunddividerelationResponse extends $tea.Model {
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

export class QueryInnerFunddividerelationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户8位id
  tenantId: string;
  // 分账关系id
  relationId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      relationId: 'relation_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      relationId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryInnerFunddividerelationResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 分账公司名称
  companyName?: string;
  // 分账主体企业统一社会信用代码
  subjectMerchantId?: string;
  // 分账主体公司名称
  subjectCompanyName?: string;
  // 分账对象统一社会信用代码
  merchantId?: string;
  // 分账合同或协议
  contractFiles?: FileInfo[];
  // 分账关系说明
  desc?: string;
  // 分账方企业pid
  alipayPid?: string;
  // 分账方企业支付宝账号
  alipayAccount?: string;
  // 审核列表
  auditInfos?: AuditInfo[];
  // INIT:待提交 AUDIT:审批中 AUDIT_PASSED:审批通过 AUDIT_NOT_PASSED:审批不通过
  relationStatus?: string;
  // 分账关系绑定失败原因
  relationFailReason?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      companyName: 'company_name',
      subjectMerchantId: 'subject_merchant_id',
      subjectCompanyName: 'subject_company_name',
      merchantId: 'merchant_id',
      contractFiles: 'contract_files',
      desc: 'desc',
      alipayPid: 'alipay_pid',
      alipayAccount: 'alipay_account',
      auditInfos: 'audit_infos',
      relationStatus: 'relation_status',
      relationFailReason: 'relation_fail_reason',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      companyName: 'string',
      subjectMerchantId: 'string',
      subjectCompanyName: 'string',
      merchantId: 'string',
      contractFiles: { 'type': 'array', 'itemType': FileInfo },
      desc: 'string',
      alipayPid: 'string',
      alipayAccount: 'string',
      auditInfos: { 'type': 'array', 'itemType': AuditInfo },
      relationStatus: 'string',
      relationFailReason: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryInnerFunddividerelationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户8位id
  tenantId: string;
  // 分页查询对象
  pageInfo: PageQuery;
  // 商户公司社会统一信用代码
  subjectMerchantId?: string;
  // 商户公司名称
  subjectCompanyName?: string;
  // 状态
  // NIT:待提交 
  // AUDIT:审批中 AUDIT_PASSED:审批通过
  // AUDIT_NOT_PASSED:审批不通过
  status?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      pageInfo: 'page_info',
      subjectMerchantId: 'subject_merchant_id',
      subjectCompanyName: 'subject_company_name',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      pageInfo: PageQuery,
      subjectMerchantId: 'string',
      subjectCompanyName: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryInnerFunddividerelationResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 数据总量
  totalSize?: number;
  // 分账关系页对象列表
  relations?: RelationPage[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      totalSize: 'total_size',
      relations: 'relations',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      totalSize: 'number',
      relations: { 'type': 'array', 'itemType': RelationPage },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateInnerMerchantagreementRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户8位id
  tenantId: string;
  // 协议编号
  agreementId: string;
  // 签署动作
  signAction: string;
  // 操作人名称
  userName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      agreementId: 'agreement_id',
      signAction: 'sign_action',
      userName: 'user_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      agreementId: 'string',
      signAction: 'string',
      userName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateInnerMerchantagreementResponse extends $tea.Model {
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

export class QueryInnerMerchantagreementRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户8位id
  tenantId: string;
  // 协议id
  agreementId: string;
  // 租户账号
  userName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      agreementId: 'agreement_id',
      userName: 'user_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      agreementId: 'string',
      userName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryInnerMerchantagreementResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 签约状态 枚举
  // TOBE 待签
  // FAIL 签约失败
  // SUCCESS 签约成功
  signStatus?: string;
  // 签约时间
  signDateStr?: string;
  // 协议内容 富文本
  agreementContent?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      signStatus: 'sign_status',
      signDateStr: 'sign_date_str',
      agreementContent: 'agreement_content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      signStatus: 'string',
      signDateStr: 'string',
      agreementContent: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryInnerMerchantagreementRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户8位id
  tenantId: string;
  // 分页对象
  pageInfo: PageQuery;
  // 租户账号
  userName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      pageInfo: 'page_info',
      userName: 'user_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      pageInfo: PageQuery,
      userName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryInnerMerchantagreementResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 数据总量
  totalSize?: number;
  // 协议分页对象
  agreementPage?: AgreementPage[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      totalSize: 'total_size',
      agreementPage: 'agreement_page',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      totalSize: 'number',
      agreementPage: { 'type': 'array', 'itemType': AgreementPage },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateInnerMerchantpayexpandRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户ID
  tenantId: string;
  // 公司信息
  companyInfo: CompanyInfo;
  // 法人信息
  legalInfo: LegalInfo;
  // 应用信息
  applicationInfo: ApplicationInfo;
  // 是否直接提交
  // SUBMITTED 直接提交
  // STAGE 暂存
  submit: string;
  // 进件模式
  // DIRECT(直连进件)
  // AGENT(代理进件)
  expandMode: string;
  // expand_mode=_AGENT_ 必填
  subTenantId?: string;
  // 操作人名称
  userName: string;
  // 第一次暂存或保存可以不传，后端直接生成
  payExpandId?: string;
  // true允许重复进件，false不允许重复进件
  allowDuplicate?: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      companyInfo: 'company_info',
      legalInfo: 'legal_info',
      applicationInfo: 'application_info',
      submit: 'submit',
      expandMode: 'expand_mode',
      subTenantId: 'sub_tenant_id',
      userName: 'user_name',
      payExpandId: 'pay_expand_id',
      allowDuplicate: 'allow_duplicate',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      companyInfo: CompanyInfo,
      legalInfo: LegalInfo,
      applicationInfo: ApplicationInfo,
      submit: 'string',
      expandMode: 'string',
      subTenantId: 'string',
      userName: 'string',
      payExpandId: 'string',
      allowDuplicate: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateInnerMerchantpayexpandResponse extends $tea.Model {
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

export class SubmitInnerMerchantpayexpandRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户8位id
  tenantId: string;
  // 进件id
  payExpandId: string;
  // 操作人名称
  userName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      payExpandId: 'pay_expand_id',
      userName: 'user_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      payExpandId: 'string',
      userName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SubmitInnerMerchantpayexpandResponse extends $tea.Model {
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

export class QueryInnerMerchantpayexpandRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户8位id
  tenantId: string;
  // 进件id expand_mode=AGENT 必填 DIRECT可以根据tenant_id推断
  payExpandId?: string;
  // 进件模式 DIRECT(直连进件) AGENT(代理进件)
  expandMode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      payExpandId: 'pay_expand_id',
      expandMode: 'expand_mode',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      payExpandId: 'string',
      expandMode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryInnerMerchantpayexpandResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 公司信息
  companyInfo?: CompanyInfo;
  // 法人信息
  legalInfo?: LegalInfo;
  // 应用信息
  applicationInfo?: ApplicationInfo;
  // 审核列表
  auditInfos?: AuditInfo[];
  // 进件流水号
  payExpandId?: string;
  // 进件模式 DIRECT(直连进件) AGENT(代理进件)
  expandMode?: string;
  // INIT:草稿态 SUB_MERCHANT_CREDIT:二级户商户签约中 AUDIT:审核中 AUDIT_PASSED:进件成功 AUDIT_NOT_PASSED:进件失败 MERCHANT_CONFIRM:待商户确认
  expandStatus?: string;
  // 进件失败描述
  expandFailReason?: string;
  // 是否展示客服信息登记入口
  showCustomerServiceBanner?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      companyInfo: 'company_info',
      legalInfo: 'legal_info',
      applicationInfo: 'application_info',
      auditInfos: 'audit_infos',
      payExpandId: 'pay_expand_id',
      expandMode: 'expand_mode',
      expandStatus: 'expand_status',
      expandFailReason: 'expand_fail_reason',
      showCustomerServiceBanner: 'show_customer_service_banner',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      companyInfo: CompanyInfo,
      legalInfo: LegalInfo,
      applicationInfo: ApplicationInfo,
      auditInfos: { 'type': 'array', 'itemType': AuditInfo },
      payExpandId: 'string',
      expandMode: 'string',
      expandStatus: 'string',
      expandFailReason: 'string',
      showCustomerServiceBanner: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryInnerMerchantagentRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户8位id
  tenantId: string;
  // 代理商户名称
  agentName?: string;
  // 进件状态
  payExpandStatus?: string;
  // 分页对象
  pageInfo: PageQuery;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      agentName: 'agent_name',
      payExpandStatus: 'pay_expand_status',
      pageInfo: 'page_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      agentName: 'string',
      payExpandStatus: 'string',
      pageInfo: PageQuery,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryInnerMerchantagentResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 数据总量
  totalSize?: number;
  // 代理租户分页对象
  merchantAgentPage?: MerchantAgentPage[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      totalSize: 'total_size',
      merchantAgentPage: 'merchant_agent_page',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      totalSize: 'number',
      merchantAgentPage: { 'type': 'array', 'itemType': MerchantAgentPage },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CloneInnerTemplatefileaddressRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 商户对应租户ID
  tenantId: string;
  // 模板编码
  templateCode: string;
  // 文件key
  fileKey: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      templateCode: 'template_code',
      fileKey: 'file_key',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      templateCode: 'string',
      fileKey: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CloneInnerTemplatefileaddressResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 拷贝后的文件key
  fileKey?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      fileKey: 'file_key',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      fileKey: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryInnerSignfieldsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
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

export class QueryInnerSignfieldsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 签署区列表
  signFieldList?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      signFieldList: 'sign_field_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      signFieldList: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncInnerTemplateRequest extends $tea.Model {
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

export class SyncInnerTemplateResponse extends $tea.Model {
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

export class UpdateInnerTemplateRequest extends $tea.Model {
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

export class UpdateInnerTemplateResponse extends $tea.Model {
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

export class QueryInnerTemplateRequest extends $tea.Model {
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

export class QueryInnerTemplateResponse extends $tea.Model {
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

export class QueryInnerTemplateelementlinkRequest extends $tea.Model {
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

export class QueryInnerTemplateelementlinkResponse extends $tea.Model {
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

export class QueryInnerTemplateversionRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户id
  tenantId: string;
  // 模板编码
  templateCode: string;
  // 模板的版本号，示例：1、2、3等
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

export class QueryInnerTemplateversionResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 模板的版本详情信息
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

export class PagequeryInnerOrdermsgRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户8位id
  // 
  tenantId: string;
  // 订单ID
  orderId: string;
  // 消息类型
  msgPublishType?: string;
  // 消息创建时间起始
  msgCreateTimeFrom?: string;
  // 消息创建时间结束
  msgCreateTimeTo?: string;
  // SANDBOX 沙箱 ；PROD 生产
  env: string;
  // 分页查询对象
  pageInfo: PageQuery;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      orderId: 'order_id',
      msgPublishType: 'msg_publish_type',
      msgCreateTimeFrom: 'msg_create_time_from',
      msgCreateTimeTo: 'msg_create_time_to',
      env: 'env',
      pageInfo: 'page_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      orderId: 'string',
      msgPublishType: 'string',
      msgCreateTimeFrom: 'string',
      msgCreateTimeTo: 'string',
      env: 'string',
      pageInfo: PageQuery,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryInnerOrdermsgResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 数据总量
  totalSize?: number;
  // 消息内容列表
  orderMsgInfos?: OrderMsgInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      totalSize: 'total_size',
      orderMsgInfos: 'order_msg_infos',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      totalSize: 'number',
      orderMsgInfos: { 'type': 'array', 'itemType': OrderMsgInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RetryInnerOrdermsgRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户ID
  tenantId: string;
  // SANDBOX 沙箱 PROD 生产
  env: string;
  // 订单id
  // 
  orderId: string;
  // 消息ID
  // 
  msgId: string;
  // 使用租户新回调地址
  usingNewCallbackUrl: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      env: 'env',
      orderId: 'order_id',
      msgId: 'msg_id',
      usingNewCallbackUrl: 'using_new_callback_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      env: 'string',
      orderId: 'string',
      msgId: 'string',
      usingNewCallbackUrl: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RetryInnerOrdermsgResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 消息重试结果
  retryResult?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      retryResult: 'retry_result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      retryResult: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryInnerAuthorizationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 签署合同的流程id
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

export class QueryInnerAuthorizationResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // true代表需要进行授权询问
  // false代表不需要进行授权询问
  isNeedAskAuth?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      isNeedAskAuth: 'is_need_ask_auth',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      isNeedAskAuth: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SignInnerAuthorizationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 签署合同的流程id
  flowId: string;
  // true代表用户同意授权，
  // false代表不同意
  authResult: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      flowId: 'flow_id',
      authResult: 'auth_result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      flowId: 'string',
      authResult: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SignInnerAuthorizationResponse extends $tea.Model {
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

export class QueryInnerSupplementalRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 商户ID
  tenantId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryInnerSupplementalResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // true代表需要进行授权询问
  // false代表不需要进行授权询问
  isNeedAskAuth?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      isNeedAskAuth: 'is_need_ask_auth',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      isNeedAskAuth: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SignInnerSupplementalRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 商户ID
  tenantId: string;
  // 同意接受用户补充接口，目前取值只能为true
  authResult: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      authResult: 'auth_result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      authResult: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SignInnerSupplementalResponse extends $tea.Model {
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

export class QueryInnerWithholdplanRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 商户租户id
  merchantTenantId: string;
  // 订单id
  orderId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      merchantTenantId: 'merchant_tenant_id',
      orderId: 'order_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      merchantTenantId: 'string',
      orderId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryInnerWithholdplanResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 总金额，单位为分
  totalMoney?: number;
  // 总期数
  totalTerm?: number;
  // 用户履约信息列表
  payInfo?: UserPerformanceInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      totalMoney: 'total_money',
      totalTerm: 'total_term',
      payInfo: 'pay_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      totalMoney: 'number',
      totalTerm: 'number',
      payInfo: { 'type': 'array', 'itemType': UserPerformanceInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateInnerWithholdsignRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 商户租户id
  merchantTenantId: string;
  // 订单id
  orderId: string;
  // 用户支付宝2088uid
  alipayUserId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      merchantTenantId: 'merchant_tenant_id',
      orderId: 'order_id',
      alipayUserId: 'alipay_user_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      merchantTenantId: 'string',
      orderId: 'string',
      alipayUserId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateInnerWithholdsignResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 代扣签约串
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

export class QueryInnerWithholdsignRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 商户租户id
  merchantTenantId: string;
  // 订单id
  orderId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      merchantTenantId: 'merchant_tenant_id',
      orderId: 'order_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      merchantTenantId: 'string',
      orderId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryInnerWithholdsignResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 协议当前状态
  // 1. UNSIGNED：未签约
  // 2. SIGNED：已签约；
  // 3.APPLY_TERMINATE:申请解约
  // 4. TERMINATED：已解约
  // 5.TIMEOUT_CLOSE:超时关闭
  status?: string;
  // 支付宝代扣协议号
  agreementNo?: string;
  // 协议签署时间
  // yyyy-MM-dd HH:mm:ss 格式
  signTime?: string;
  // 协议生效时间
  // yyyy-MM-dd HH:mm:ss 格式
  validTime?: string;
  // 协议失效时间
  // yyyy-MM-dd HH:mm:ss 格式
  invalidTime?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      status: 'status',
      agreementNo: 'agreement_no',
      signTime: 'sign_time',
      validTime: 'valid_time',
      invalidTime: 'invalid_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      status: 'string',
      agreementNo: 'string',
      signTime: 'string',
      validTime: 'string',
      invalidTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetInnerMerchantstaticdataRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户id
  tenantId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetInnerMerchantstaticdataResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 商户入驻静态数据
  staticDataList?: StaticData[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      staticDataList: 'static_data_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      staticDataList: { 'type': 'array', 'itemType': StaticData },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetInnerFunddividemerchantRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户id
  tenantId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetInnerFunddividemerchantResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 分账方公司名称
  companyName?: string;
  // 分账方公司统一社会信用代码
  merchantId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      companyName: 'company_name',
      merchantId: 'merchant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      companyName: 'string',
      merchantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryInnerInsuresignRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 商户租户id
  merchantTenantId: string;
  // 保司社会统一信用代码
  insureMerchantId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      merchantTenantId: 'merchant_tenant_id',
      insureMerchantId: 'insure_merchant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      merchantTenantId: 'string',
      insureMerchantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryInnerInsuresignResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 商户社会统一信用代码
  merchantId?: string;
  // 保司社会统一信用代码
  insureMerchantId?: string;
  // 外部代扣协议号
  externalAgreementNo?: string;
  // 合同未签署：CONTRACT_UN_SIGNED
  // 合同已签署：CONTRACT_SIGNED
  // 代扣已签署：WITHHOLD_SIGNED
  // 代扣已解约：WITHHOLD_UN_SIGNED
  status?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      merchantId: 'merchant_id',
      insureMerchantId: 'insure_merchant_id',
      externalAgreementNo: 'external_agreement_no',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      merchantId: 'string',
      insureMerchantId: 'string',
      externalAgreementNo: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateInnerInsuresignRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 商户租户id
  merchantTenantId: string;
  // 外部代扣协议号
  externalAgreementNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      merchantTenantId: 'merchant_tenant_id',
      externalAgreementNo: 'external_agreement_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      merchantTenantId: 'string',
      externalAgreementNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateInnerInsuresignResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 签约链接
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

export class PagequeryInnerInsureorderRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户id
  // (商家后台接口特有)
  tenantId: string;
  // 商家订单ID
  orderId?: string;
  // 分页查询对象
  pageInfo: PageQuery;
  // 保司信息merchant_id
  insureMerchantId: string;
  // 投保状态枚举
  status?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      orderId: 'order_id',
      pageInfo: 'page_info',
      insureMerchantId: 'insure_merchant_id',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      orderId: 'string',
      pageInfo: PageQuery,
      insureMerchantId: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryInnerInsureorderResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 数据总量
  totalSize?: number;
  // 保单信息
  inusreOrderInfos?: InsureOrderInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      totalSize: 'total_size',
      inusreOrderInfos: 'inusre_order_infos',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      totalSize: 'number',
      inusreOrderInfos: { 'type': 'array', 'itemType': InsureOrderInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryInnerProductRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 商户租户id
  tenantId: string;
  // 商品名称
  productName?: string;
  // 商品id
  productId?: string;
  // 一级类目
  mainClass?: string;
  // 二级类目
  subClass?: string;
  // 品牌
  productBrand?: string;
  // 分页
  pageInfo: PageQuery;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      productName: 'product_name',
      productId: 'product_id',
      mainClass: 'main_class',
      subClass: 'sub_class',
      productBrand: 'product_brand',
      pageInfo: 'page_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      productName: 'string',
      productId: 'string',
      mainClass: 'string',
      subClass: 'string',
      productBrand: 'string',
      pageInfo: PageQuery,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryInnerProductResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 总量
  total?: number;
  // 商品列表
  productInfoList?: ProductInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      total: 'total',
      productInfoList: 'product_info_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      total: 'number',
      productInfoList: { 'type': 'array', 'itemType': ProductInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetInnerHomepagenoticeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 商户租户id
  tenantId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetInnerHomepagenoticeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 通知id
  noticeId?: number;
  // 通知标题
  title?: string;
  // 未读数量
  unreadCount?: number;
  // 是否未读
  unread?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      noticeId: 'notice_id',
      title: 'title',
      unreadCount: 'unread_count',
      unread: 'unread',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      noticeId: 'number',
      title: 'string',
      unreadCount: 'number',
      unread: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryInnerNoticeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 商户租户id
  tenantId: string;
  // 分页
  pageInfo: PageQuery;
  // 是否未读
  unread?: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      pageInfo: 'page_info',
      unread: 'unread',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      pageInfo: PageQuery,
      unread: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryInnerNoticeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 总量
  total?: number;
  // 商户通知信息
  noticeInfoList?: NoticeInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      total: 'total',
      noticeInfoList: 'notice_info_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      total: 'number',
      noticeInfoList: { 'type': 'array', 'itemType': NoticeInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DetailInnerNoticeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 商户租户id
  tenantId: string;
  // 通知id
  noticeId: number;
  // 是否未读
  unread: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      noticeId: 'notice_id',
      unread: 'unread',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      noticeId: 'number',
      unread: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DetailInnerNoticeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 通知标题
  title?: string;
  // 通知内容
  content?: string;
  // 通知创建时间
  noticeCreateTime?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      title: 'title',
      content: 'content',
      noticeCreateTime: 'notice_create_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      title: 'string',
      content: 'string',
      noticeCreateTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryInnerOrderRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 商户租户id
  tenantId: string;
  // 订单id
  orderId?: string;
  // 支付宝代扣协议号
  agreementNo?: string;
  // 订单创建时间开始
  orderCreateTimeStart?: string;
  // 订单创建时间结束
  orderCreateTimeEnd?: string;
  // 订单状态
  orderStatus?: string;
  // 分页
  pageInfo: PageQuery;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      orderId: 'order_id',
      agreementNo: 'agreement_no',
      orderCreateTimeStart: 'order_create_time_start',
      orderCreateTimeEnd: 'order_create_time_end',
      orderStatus: 'order_status',
      pageInfo: 'page_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      orderId: 'string',
      agreementNo: 'string',
      orderCreateTimeStart: 'string',
      orderCreateTimeEnd: 'string',
      orderStatus: 'string',
      pageInfo: PageQuery,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryInnerOrderResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 订单列表信息
  orderInfoList?: OrderSearchInfo[];
  // 总量
  total?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      orderInfoList: 'order_info_list',
      total: 'total',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      orderInfoList: { 'type': 'array', 'itemType': OrderSearchInfo },
      total: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DetailInnerOrderRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 商户租户id
  tenantId: string;
  // 订单id
  orderId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      orderId: 'order_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      orderId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DetailInnerOrderResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 订单id
  orderId?: string;
  // 支付宝代扣协议号
  agreementNo?: string;
  // 商品总数量
  productTotalCount?: number;
  // 订单基础信息
  orderInfo?: OrderInfo;
  // 用户信息
  orderUserInfo?: OrderUserInfo;
  // 订单履约
  orderFulfillmentInfoList?: OrderFulfillmentInfo[];
  // 订单还款承诺
  orderPromiseInfo?: OrderPromiseInfo;
  // 订单商品信息
  orderProductInfoList?: OrderProductInfo[];
  // 经营分账信息
  operateDivideInfoList?: OperateDivideInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      orderId: 'order_id',
      agreementNo: 'agreement_no',
      productTotalCount: 'product_total_count',
      orderInfo: 'order_info',
      orderUserInfo: 'order_user_info',
      orderFulfillmentInfoList: 'order_fulfillment_info_list',
      orderPromiseInfo: 'order_promise_info',
      orderProductInfoList: 'order_product_info_list',
      operateDivideInfoList: 'operate_divide_info_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      orderId: 'string',
      agreementNo: 'string',
      productTotalCount: 'number',
      orderInfo: OrderInfo,
      orderUserInfo: OrderUserInfo,
      orderFulfillmentInfoList: { 'type': 'array', 'itemType': OrderFulfillmentInfo },
      orderPromiseInfo: OrderPromiseInfo,
      orderProductInfoList: { 'type': 'array', 'itemType': OrderProductInfo },
      operateDivideInfoList: { 'type': 'array', 'itemType': OperateDivideInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RenderInnerTemplateinstanceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 商户对应租户ID
  tenantId: string;
  // 模板编码集，数组
  templateCodes: string[];
  // 幂等值
  idempotent: string;
  // 业务方id，唯一
  bizBusinessId: string;
  // 组件（文本域）的实际值
  componentInstDtos: TemplateComponent[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      templateCodes: 'template_codes',
      idempotent: 'idempotent',
      bizBusinessId: 'biz_business_id',
      componentInstDtos: 'component_inst_dtos',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      templateCodes: { 'type': 'array', 'itemType': 'string' },
      idempotent: 'string',
      bizBusinessId: 'string',
      componentInstDtos: { 'type': 'array', 'itemType': TemplateComponent },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RenderInnerTemplateinstanceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 实例化成功时返回唯一业务id
  businessId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      businessId: 'business_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      businessId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchqueryInnerMarketingscoreRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 营销分查询对象
  marketingScoreQueryInfos: MarketingScoreQueryInfo[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      marketingScoreQueryInfos: 'marketing_score_query_infos',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      marketingScoreQueryInfos: { 'type': 'array', 'itemType': MarketingScoreQueryInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchqueryInnerMarketingscoreResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 营销分返回对象
  marketingScoreInfo?: MarketingScoreInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      marketingScoreInfo: 'marketing_score_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      marketingScoreInfo: { 'type': 'array', 'itemType': MarketingScoreInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateInnerCustomerserviceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户id
  tenantId: string;
  // 公司社会统一信息代码,间联模式必传
  merchantId?: string;
  // 公司名称
  merchantName?: string;
  // 处理类型:
  // MERCHANT_PROCESS("MERCHANT_PROCESS", "商家处理"),
  // PROXY_PROCESS("PROXY_PROCESS", "服务商代处理"),
  processType: string;
  // 服务商名称
  serviceProviderName?: string;
  // 客诉处理员支付宝绑定手机号
  alipayBindMobile: string;
  // 客诉处理员支付宝账号
  alipayLogonId: string;
  // 客服电话
  customerServicePhone: string;
  // 客服人员名称
  customerServiceName: string;
  // 在线客服网址
  onlineSupportSiteUrl?: string;
  // 投诉问题
  customerComplaintIssues: string;
  // 进件类型
  // DIRECT("DIRECT", "直连进件模式"),
  // AGENT("AGENT", "代理商进件模式"),
  expandMode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      merchantId: 'merchant_id',
      merchantName: 'merchant_name',
      processType: 'process_type',
      serviceProviderName: 'service_provider_name',
      alipayBindMobile: 'alipay_bind_mobile',
      alipayLogonId: 'alipay_logon_id',
      customerServicePhone: 'customer_service_phone',
      customerServiceName: 'customer_service_name',
      onlineSupportSiteUrl: 'online_support_site_url',
      customerComplaintIssues: 'customer_complaint_issues',
      expandMode: 'expand_mode',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      merchantId: 'string',
      merchantName: 'string',
      processType: 'string',
      serviceProviderName: 'string',
      alipayBindMobile: 'string',
      alipayLogonId: 'string',
      customerServicePhone: 'string',
      customerServiceName: 'string',
      onlineSupportSiteUrl: 'string',
      customerComplaintIssues: 'string',
      expandMode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateInnerCustomerserviceResponse extends $tea.Model {
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

export class UpdateInnerCustomerserviceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户id
  tenantId: string;
  // 商家社会统一信用代码，间联模式必传
  merchantId?: string;
  // 公司名称
  merchantName: string;
  // 处理类型:
  // MERCHANT_PROCESS("MERCHANT_PROCESS", "商家处理"),
  // PROXY_PROCESS("PROXY_PROCESS", "服务商代处理"),
  processType: string;
  // 服务商名称
  serviceProviderName?: string;
  // 客诉处理员支付宝绑定手机号
  alipayBindMobile: string;
  // 客诉处理员支付宝账号
  alipayLogonId: string;
  // 客服电话
  customerServicePhone: string;
  // 客服人员名称
  customerServiceName: string;
  // 在线客服网址
  onlineSupportSiteUrl?: string;
  // 投诉问题
  customerComplaintIssues: string;
  // 进件类型 
  // DIRECT("DIRECT", "直连进件模式"), AGENT("AGENT", "代理商进件模式"),
  expandMode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      merchantId: 'merchant_id',
      merchantName: 'merchant_name',
      processType: 'process_type',
      serviceProviderName: 'service_provider_name',
      alipayBindMobile: 'alipay_bind_mobile',
      alipayLogonId: 'alipay_logon_id',
      customerServicePhone: 'customer_service_phone',
      customerServiceName: 'customer_service_name',
      onlineSupportSiteUrl: 'online_support_site_url',
      customerComplaintIssues: 'customer_complaint_issues',
      expandMode: 'expand_mode',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      merchantId: 'string',
      merchantName: 'string',
      processType: 'string',
      serviceProviderName: 'string',
      alipayBindMobile: 'string',
      alipayLogonId: 'string',
      customerServicePhone: 'string',
      customerServiceName: 'string',
      onlineSupportSiteUrl: 'string',
      customerComplaintIssues: 'string',
      expandMode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateInnerCustomerserviceResponse extends $tea.Model {
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

export class PagequeryInnerCustomerserviceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户id
  tenantId: string;
  // 分页信息
  pageInfo: PageQuery;
  // 处理类型:
  // MERCHANT_PROCESS("MERCHANT_PROCESS", "商家处理"),
  // PROXY_PROCESS("PROXY_PROCESS", "服务商代处理"),
  processType?: string;
  // 公司社会统一信息代码
  merchantId?: string;
  // 公司名称
  merchantName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      pageInfo: 'page_info',
      processType: 'process_type',
      merchantId: 'merchant_id',
      merchantName: 'merchant_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      pageInfo: PageQuery,
      processType: 'string',
      merchantId: 'string',
      merchantName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryInnerCustomerserviceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 总数
  total?: number;
  // 客服信息
  customerServiceInfoList?: CustomerServiceInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      total: 'total',
      customerServiceInfoList: 'customer_service_info_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      total: 'number',
      customerServiceInfoList: { 'type': 'array', 'itemType': CustomerServiceInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DetailInnerCustomerserviceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户id
  tenantId: string;
  // 公司社会统一信息代码，间联模式必传
  merchantId?: string;
  // 进件类型 
  // DIRECT("DIRECT", "直连进件模式"),
  // AGENT("AGENT", "代理商进件模式"),
  expandMode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      merchantId: 'merchant_id',
      expandMode: 'expand_mode',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      merchantId: 'string',
      expandMode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DetailInnerCustomerserviceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 公司社会统一信息代码
  merchantId?: string;
  // 公司名称
  merchantName?: string;
  // 处理类型:
  // MERCHANT_PROCESS("MERCHANT_PROCESS", "商家处理"),
  // PROXY_PROCESS("PROXY_PROCESS", "服务商代处理"),
  processType?: string;
  // 服务商名称
  serviceProviderName?: string;
  // 客诉处理员支付宝绑定手机号
  alipayBindMobile?: string;
  // 客诉处理员支付宝账号
  alipayLogonId?: string;
  // 客服电话
  customerServicePhone?: string;
  // 客服人员名称
  customerServiceName?: string;
  // 在线客服网址
  onlineSupportSiteUrl?: string;
  // 投诉问题
  customerComplaintIssues?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      merchantId: 'merchant_id',
      merchantName: 'merchant_name',
      processType: 'process_type',
      serviceProviderName: 'service_provider_name',
      alipayBindMobile: 'alipay_bind_mobile',
      alipayLogonId: 'alipay_logon_id',
      customerServicePhone: 'customer_service_phone',
      customerServiceName: 'customer_service_name',
      onlineSupportSiteUrl: 'online_support_site_url',
      customerComplaintIssues: 'customer_complaint_issues',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      merchantId: 'string',
      merchantName: 'string',
      processType: 'string',
      serviceProviderName: 'string',
      alipayBindMobile: 'string',
      alipayLogonId: 'string',
      customerServicePhone: 'string',
      customerServiceName: 'string',
      onlineSupportSiteUrl: 'string',
      customerComplaintIssues: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetInnerCustomerservicetemplateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户id
  tenantId: string;
  // 进件类型 
  // DIRECT("DIRECT", "直连进件模式")
  // AGENT("AGENT", "代理商进件模式")
  expandMode: string;
  // 处理类型:
  // MERCHANT_PROCESS("MERCHANT_PROCESS", "商家处理"),
  // PROXY_PROCESS("PROXY_PROCESS", "服务商代处理"),
  processType: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      expandMode: 'expand_mode',
      processType: 'process_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      expandMode: 'string',
      processType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetInnerCustomerservicetemplateResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 服务商名称
  serviceProviderName?: string;
  // 客诉处理员支付宝绑定手机号
  alipayBindMobile?: string;
  // 客诉处理员支付宝账号
  alipayLogonId?: string;
  // 客服电话
  customerServicePhone?: string;
  // 客服人员名称
  customerServiceName?: string;
  // 在线客服网址
  onlineSupportSiteUrl?: string;
  // 投诉问题
  customerComplaintIssues?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      serviceProviderName: 'service_provider_name',
      alipayBindMobile: 'alipay_bind_mobile',
      alipayLogonId: 'alipay_logon_id',
      customerServicePhone: 'customer_service_phone',
      customerServiceName: 'customer_service_name',
      onlineSupportSiteUrl: 'online_support_site_url',
      customerComplaintIssues: 'customer_complaint_issues',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      serviceProviderName: 'string',
      alipayBindMobile: 'string',
      alipayLogonId: 'string',
      customerServicePhone: 'string',
      customerServiceName: 'string',
      onlineSupportSiteUrl: 'string',
      customerComplaintIssues: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryInnerTemplateinstanceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户8位id
  tenantId: string;
  // 模板code
  templateCode: string;
  // 业务唯一实例id（模板实例化时的业务id）
  businessId: string;
  // 实例化文件是否需要pdf格式
  needPdfFile: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      templateCode: 'template_code',
      businessId: 'business_id',
      needPdfFile: 'need_pdf_file',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      templateCode: 'string',
      businessId: 'string',
      needPdfFile: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryInnerTemplateinstanceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 模板实例化后的信息
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

export class QueryInnerTenantindirectmainclassRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户id
  tenantId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryInnerTenantindirectmainclassResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 当前开通类目
  currentIndirectMainClassList?: string[];
  // 开通说明
  desc?: string;
  // 状态
  // INIT:初始化
  // AUDIT:审批中 
  // AUDIT_PASSED:审批通过
  // AUDIT_NOT_PASSED:审批不通过
  status?: string;
  // 审核拒绝原因
  failReason?: string;
  // 申请开通的类目
  changingIndirectMainClassList?: string[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      currentIndirectMainClassList: 'current_indirect_main_class_list',
      desc: 'desc',
      status: 'status',
      failReason: 'fail_reason',
      changingIndirectMainClassList: 'changing_indirect_main_class_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      currentIndirectMainClassList: { 'type': 'array', 'itemType': 'string' },
      desc: 'string',
      status: 'string',
      failReason: 'string',
      changingIndirectMainClassList: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateInnerTenantindirectmainclassRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户id
  tenantId: string;
  // 开通类目
  indirectMainClassList: string[];
  // 开通说明
  // 
  desc?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      indirectMainClassList: 'indirect_main_class_list',
      desc: 'desc',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      indirectMainClassList: { 'type': 'array', 'itemType': 'string' },
      desc: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateInnerTenantindirectmainclassResponse extends $tea.Model {
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

export class SubmitInnerTemplatesyncreviewRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 商户对应租户ID
  tenantId: string;
  // 来源魔法库模板code
  sourceTemplateCode: string;
  // 目标魔法库模板名称
  targetTemplateName: string;
  // 魔法库来源模板版本
  sourceTemplateVersion: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      sourceTemplateCode: 'source_template_code',
      targetTemplateName: 'target_template_name',
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
      sourceTemplateVersion: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SubmitInnerTemplatesyncreviewResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 提交同步上线审核的模板code
  sourceTemplateCode?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      sourceTemplateCode: 'source_template_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      sourceTemplateCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SubmitInnerPendingeventRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户id
  tenantId: string;
  // 待办事件id
  eventId: string;
  // 商家处理动作
  // REJECT拒绝，APPROVE 同意
  action: string;
  // 操作人
  operator: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      eventId: 'event_id',
      action: 'action',
      operator: 'operator',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      eventId: 'string',
      action: 'string',
      operator: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SubmitInnerPendingeventResponse extends $tea.Model {
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

export class DetailInnerPendingeventRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户id
  tenantId: string;
  // 事件id
  eventId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      eventId: 'event_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      eventId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DetailInnerPendingeventResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 事件id
  eventId?: string;
  // 通知:NOTIFICATION 
  // 确认函:CONFIRMATION
  type?: string;
  // ("PENDING","待办中"), ("CONFIRMED","确认"), ("REJECTED","已拒绝") ("FAILED","失败"),("EXPIRED","已过期");
  status?: string;
  // 待办内容主题
  contentSubject?: string;
  // 待办内容详情
  contentDetails?: string;
  // 待办处理页面操作按钮 
  // ACKNOWLEDGE 我已知晓
  //  CONFIRM 确认
  //  RETURN 返回 
  // REJECT 拒绝
  actionOptionsConfig?: string;
  // 事件有效期开始
  effectiveStartTime?: string;
  // 事件有效期结束
  effectiveEndTime?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      eventId: 'event_id',
      type: 'type',
      status: 'status',
      contentSubject: 'content_subject',
      contentDetails: 'content_details',
      actionOptionsConfig: 'action_options_config',
      effectiveStartTime: 'effective_start_time',
      effectiveEndTime: 'effective_end_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      eventId: 'string',
      type: 'string',
      status: 'string',
      contentSubject: 'string',
      contentDetails: 'string',
      actionOptionsConfig: 'string',
      effectiveStartTime: 'string',
      effectiveEndTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddInnerTemplateRequest extends $tea.Model {
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

export class AddInnerTemplateResponse extends $tea.Model {
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

export class PagequeryInnerPendingeventRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户id
  tenantId: string;
  // 待办状态
  statusList?: string[];
  // 事件类型
  // 通知:NOTIFICATION 
  // 确认函:CONFIRMATION
  type?: string;
  // 分页
  pageInfo: PageQuery;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      statusList: 'status_list',
      type: 'type',
      pageInfo: 'page_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      statusList: { 'type': 'array', 'itemType': 'string' },
      type: 'string',
      pageInfo: PageQuery,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryInnerPendingeventResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 总量
  total?: number;
  // 待办列表信息
  pendingEventInfoList?: PendingEventInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      total: 'total',
      pendingEventInfoList: 'pending_event_info_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      total: 'number',
      pendingEventInfoList: { 'type': 'array', 'itemType': PendingEventInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateInsureRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 商户的订单号，后续用作和保单结果交互
  orderId: string;
  // 风控业务流水号
  riskFlowId: string;
  // 保险公司枚举，PA：平安保险
  insureCompanyType: string;
  // 保险类型枚举，PERFORMANCE：履约
  insureProductType: string;
  // 投保商品信息列表
  productInfoList: InsureProductInfo[];
  // 发货方式枚举，可选值：
  // EXPRESS-物流发货
  // OFFLINE-线下交易
  deliveryType: string;
  // 公司联系人姓名，RSA 加密传输
  contactName: string;
  // 公司联系人手机号，RSA 加密传输
  contactMobile: string;
  // 实人认证业务流水号
  facevrfFlowId?: string;
  // 物流单号，非必填参数。如果选择的物流发货方式为 EXPRESS（物流发货），则该字段必填。
  logisticsNumber?: string;
  // 交易时间，非必填参数。如果发货方式为 OFFLINE（线下交易），则该字段必填。
  tradeTime?: string;
  // 公司地址信息，此处填写的地址信息为投保时最高优先级地址，其次为公司进件时填写的地址信息。如果取不到明确地址信息，投保会失败。
  address?: string;
  // 保险投保期数
  period?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      riskFlowId: 'risk_flow_id',
      insureCompanyType: 'insure_company_type',
      insureProductType: 'insure_product_type',
      productInfoList: 'product_info_list',
      deliveryType: 'delivery_type',
      contactName: 'contact_name',
      contactMobile: 'contact_mobile',
      facevrfFlowId: 'facevrf_flow_id',
      logisticsNumber: 'logistics_number',
      tradeTime: 'trade_time',
      address: 'address',
      period: 'period',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      riskFlowId: 'string',
      insureCompanyType: 'string',
      insureProductType: 'string',
      productInfoList: { 'type': 'array', 'itemType': InsureProductInfo },
      deliveryType: 'string',
      contactName: 'string',
      contactMobile: 'string',
      facevrfFlowId: 'string',
      logisticsNumber: 'string',
      tradeTime: 'string',
      address: 'string',
      period: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateInsureResponse extends $tea.Model {
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

export class QueryInsureRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 商户的订单号
  orderId: string;
  // 保险类型枚举，PERFORMANCE：履约
  insureProductType: string;
  // 保险公司枚举，PA：平安保险
  insureCompanyType: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      insureProductType: 'insure_product_type',
      insureCompanyType: 'insure_company_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      insureProductType: 'string',
      insureCompanyType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryInsureResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 商户的订单号
  orderId?: string;
  // 保单号
  insureId?: string;
  // 保险订单状态。TOBE_INSURE：待发起投保 ；INSUR_PRE_SUCC：投保成功。WITHHOLD_DEDUCTING：代扣中；WITHHOLD_SUCC：代扣成功。WITHHOLD_FAIL：代扣失败。INSUR_SUCC：承保成功
  status?: string;
  // 商品名称
  productName?: string;
  // 2024-09-24 20:04:35
  insureStartTime?: string;
  // 2024-12-24 20:04:35
  insureEndTime?: string;
  // 投保金额（保额），单位分。100代表1元
  insureAmount?: string;
  // 投保费用（保费），单位分。100代表1元
  insurePremium?: string;
  // 电子保单下载链接
  policyUrl?: string;
  // 验真码
  validateCode?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      orderId: 'order_id',
      insureId: 'insure_id',
      status: 'status',
      productName: 'product_name',
      insureStartTime: 'insure_start_time',
      insureEndTime: 'insure_end_time',
      insureAmount: 'insure_amount',
      insurePremium: 'insure_premium',
      policyUrl: 'policy_url',
      validateCode: 'validate_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      orderId: 'string',
      insureId: 'string',
      status: 'string',
      productName: 'string',
      insureStartTime: 'string',
      insureEndTime: 'string',
      insureAmount: 'string',
      insurePremium: 'string',
      policyUrl: 'string',
      validateCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RetryInsurePayRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 商户的订单号，后续用作和保单结果交互
  orderId: string;
  // 保险公司产品（险种）类型
  insureProductType: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      insureProductType: 'insure_product_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      insureProductType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RetryInsurePayResponse extends $tea.Model {
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

export class RegisterMerchantexpandMerchantRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 公司信息
  companyInfo: CompanyInfo;
  // 法人信息
  legalInfo: LegalInfo;
  // 应用信息
  applicationInfo: ApplicationInfo;
  // 进件模式 DIRECT(直连进件) AGENT(代理进件)
  expandMode: string;
  // expand_mode=_AGENT_ 必填
  subTenantId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      companyInfo: 'company_info',
      legalInfo: 'legal_info',
      applicationInfo: 'application_info',
      expandMode: 'expand_mode',
      subTenantId: 'sub_tenant_id',
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
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RegisterMerchantexpandMerchantResponse extends $tea.Model {
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

export class UploadMerchantexpandFileRequest extends $tea.Model {
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

export class UploadMerchantexpandFileResponse extends $tea.Model {
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

export class QueryMerchantexpandMerchantRequest extends $tea.Model {
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

export class QueryMerchantexpandMerchantResponse extends $tea.Model {
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
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      enrollmentStatus: 'enrollment_status',
      failReason: 'fail_reason',
      pendingEventLink: 'pending_event_link',
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
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateMerchantexpandMerchantRequest extends $tea.Model {
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

export class UpdateMerchantexpandMerchantResponse extends $tea.Model {
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

export class AddMerchantexpandDividerelationRequest extends $tea.Model {
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

export class AddMerchantexpandDividerelationResponse extends $tea.Model {
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

export class QueryMerchantexpandDividerelationRequest extends $tea.Model {
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

export class QueryMerchantexpandDividerelationResponse extends $tea.Model {
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

export class CreateRealpersonFacevrfRequest extends $tea.Model {
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

export class CreateRealpersonFacevrfResponse extends $tea.Model {
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

export class QueryRealpersonFacevrfRequest extends $tea.Model {
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

export class QueryRealpersonFacevrfResponse extends $tea.Model {
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

export class QueryRiskRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 枚举值：蚁盾版、智租版、旗舰版，蚁盾版代表仅调用蚁盾风控，智租版代表仅调用小程序云风控，旗舰版代表调用蚁盾+旗舰版风控接口
  productName: string;
  // 用户姓名
  userName: string;
  // 用户证件号码
  certNo: string;
  // 用户手机号码
  mobile: string;
  // 支付宝账户 UserId，智租版可选
  alipayUserId?: string;
  // 下单渠道，智租版必选。枚举值：支付宝-ALIPAY；微信-WECHAT；独立APP-APP；抖音-DOUYIN；美团-MEITUAN；其他:-OTHER
  source?: string;
  // 风险业务场景，智租版选填。默认值：PRE_RENT。
  // PRE_RENT - 3c租赁；PRE_RENT_3C - 3c租赁定制；PRE_RENT_PET - 宠物；PRE_RENT_EDU - 教培；PRE_RENT_BEAUTY - 美业；
  riskBizScene?: string;
  // 商品详情，智租版可选
  itemDetail?: ItemDetail;
  // 价格详情，智租版可选
  priceDetail?: PriceDetail;
  // 物流信息，智租版可选
  deliveryDetail?: DeliveryDetail;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      productName: 'product_name',
      userName: 'user_name',
      certNo: 'cert_no',
      mobile: 'mobile',
      alipayUserId: 'alipay_user_id',
      source: 'source',
      riskBizScene: 'risk_biz_scene',
      itemDetail: 'item_detail',
      priceDetail: 'price_detail',
      deliveryDetail: 'delivery_detail',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      productName: 'string',
      userName: 'string',
      certNo: 'string',
      mobile: 'string',
      alipayUserId: 'string',
      source: 'string',
      riskBizScene: 'string',
      itemDetail: ItemDetail,
      priceDetail: PriceDetail,
      deliveryDetail: DeliveryDetail,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRiskResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 模型结果详情
  models?: RiskModel[];
  // 智租风控-风控模型结果
  appletModel?: AppletRiskModel;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      models: 'models',
      appletModel: 'applet_model',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      models: { 'type': 'array', 'itemType': RiskModel },
      appletModel: AppletRiskModel,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRiskGoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 风险类型。枚举值：MARKETING_PURCHASE_COMMON 营销抢购风险识别；INDUSTRY_SCALPER_COMMON 行业黄牛风险识别；MARKETING_AWARDING_COMMON 营销发奖风险识别；INDUSTRY_FARMING_COMMON 行业刷单风险识别；INDUSTRY_BADDEBT_COMMON 履约坏账风险识别
  riskType: string;
  // 单次请求流水号，需要保证唯一
  flowId: string;
  // 调用行业，枚举值：
  // insurance 保险；retail 零售；finance 金融行业；logistics 物流行业；city_services 城市服务；medical 医疗服务；digital_media 数媒行业；recycle 回收行业；payment 缴费行业；vehicle 汽车；travel 旅游；air_travel 航旅行业；FMCG 快消零售；education 教育行业；fashion_retail 时尚零售；game_industry 文体行业；rental 租赁；advertisement 广告行业；restaurants 餐饮行业；ticket 票务行业；complexes 综合体行业
  businessCode: string;
  // 风险咨询对应的自身业务场景/环节，枚举值：
  // register 注册；order 下单；payment 支付；login 登录；offline_query 离线查询；inquery 查询；reserve 预约；invitation 邀请；other 其他
  scene: string;
  // 支付宝用户 2088 账号
  userId?: string;
  // 支付宝用户 open_id 账号。需要注意，user_id 和 open_id 不可同时为空，同时传入时，以 user_id 为准
  openId?: string;
  // 支付宝商家 pid，如果风险咨询对象是支付宝商家，则填写pid
  merPid?: string;
  // 手机号码，用于直接输入风险咨询对象的手机号码
  mobileNo?: string;
  // 身份证号码
  certNo?: string;
  // 账户登录 ip
  ip?: string;
  // 地理位置，用于输入用户产生交易时的地理位置信息
  lbs?: string;
  // 咨询方类型，填写风险咨询中对应的商户或服务商对于蚂蚁的类型。枚举值：direct_isv 直连服务商；indirect_isv 间连服务商；unconn_isv 无关服务商；direct_mer 直连商户；indirect_mer 间连商户；unconn_mer 无关联商户；unknown 其他
  role?: string;
  // 可填入活动id唯一值，或其他活动信息
  activityInfo?: string;
  // 营销抢购风险识别入参模型
  purchaseQueryModel?: PurchaseQueryModel;
  // 行业黄牛风险识别入参模型
  scalperQueryModel?: ScalperQueryModel;
  // 营销发奖风险识别入参模型
  awardingQueryModel?: AwardingQueryModel;
  // 行业刷单风险识别入参模型
  farmingQueryModel?: FarmingQueryModel;
  // 行业履约风险识别入参模型
  baddebtQueryModel?: BaddebtQueryModel;
  // 商户appId,当openId不为空时必填
  merchantAppId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      riskType: 'risk_type',
      flowId: 'flow_id',
      businessCode: 'business_code',
      scene: 'scene',
      userId: 'user_id',
      openId: 'open_id',
      merPid: 'mer_pid',
      mobileNo: 'mobile_no',
      certNo: 'cert_no',
      ip: 'ip',
      lbs: 'lbs',
      role: 'role',
      activityInfo: 'activity_info',
      purchaseQueryModel: 'purchase_query_model',
      scalperQueryModel: 'scalper_query_model',
      awardingQueryModel: 'awarding_query_model',
      farmingQueryModel: 'farming_query_model',
      baddebtQueryModel: 'baddebt_query_model',
      merchantAppId: 'merchant_app_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      riskType: 'string',
      flowId: 'string',
      businessCode: 'string',
      scene: 'string',
      userId: 'string',
      openId: 'string',
      merPid: 'string',
      mobileNo: 'string',
      certNo: 'string',
      ip: 'string',
      lbs: 'string',
      role: 'string',
      activityInfo: 'string',
      purchaseQueryModel: PurchaseQueryModel,
      scalperQueryModel: ScalperQueryModel,
      awardingQueryModel: AwardingQueryModel,
      farmingQueryModel: FarmingQueryModel,
      baddebtQueryModel: BaddebtQueryModel,
      merchantAppId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRiskGoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 风险查询结果
  model?: RiskGoModel;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      model: 'model',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      model: RiskGoModel,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadInnerRiskcallRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 幂等id
  idempotentId: string;
  // 商户的支付宝唯一id
  pid: string;
  // 计量值
  serviceAmount: number;
  // 上报的数据开始时间，格式 yyyy-MM-dd HH:mm:ss
  startTime: string;
  // 上报的数据结束时间，格式 yyyy-MM-dd HH:mm:ss
  endTime: string;
  // 支付宝开放平台购买的实例 id
  alipayInstanceId: string;
  // 扩展参数
  // jsonString
  extInfo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      idempotentId: 'idempotent_id',
      pid: 'pid',
      serviceAmount: 'service_amount',
      startTime: 'start_time',
      endTime: 'end_time',
      alipayInstanceId: 'alipay_instance_id',
      extInfo: 'ext_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      idempotentId: 'string',
      pid: 'string',
      serviceAmount: 'number',
      startTime: 'string',
      endTime: 'string',
      alipayInstanceId: 'string',
      extInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadInnerRiskcallResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 上报成功返回 true，否则返回 false
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

export class AllSignTemplateRequest extends $tea.Model {
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

export class AllSignTemplateResponse extends $tea.Model {
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

export class SubmitSignFlowRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单号
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
  userName: string;
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
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SubmitSignFlowResponse extends $tea.Model {
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

export class GetSignFlowRequest extends $tea.Model {
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

export class GetSignFlowResponse extends $tea.Model {
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

export class AuthSignFlowRequest extends $tea.Model {
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

export class AuthSignFlowResponse extends $tea.Model {
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

export class SubmitFrontSignRequest extends $tea.Model {
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
  merchantIdType: string;
  // 商户证件号，需要采用RSA加密传输
  merchantIdNumber: string;
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
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SubmitFrontSignResponse extends $tea.Model {
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

export class UploadSignFlowRequest extends $tea.Model {
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
  fileObject?: Readable;
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

export class UploadSignFlowResponse extends $tea.Model {
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

export class UploadSignTemplateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单所属商户的统一社会信用代码
  merchantId: string;
  // 合同类型
  contractType: string;
  // 模板类型
  agreementType: string;
  // 签署区坐标配置
  posConf: string;
  // 模板参数
  templateArgs?: string;
  // 上传的pdf文件，需要以.pdf后缀结尾
  fileObject?: Readable;
  fileObjectName?: string;
  fileId: string;
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
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadSignTemplateResponse extends $tea.Model {
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

export class UploadSignCreditRequest extends $tea.Model {
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
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadSignCreditResponse extends $tea.Model {
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

export class QuerySignCreditRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单号类型
  orderNoType: string;
  // 订单号，或资产包号
  orderNo: string;
  // 商户统一社会信用代码
  merchantId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderNoType: 'order_no_type',
      orderNo: 'order_no',
      merchantId: 'merchant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderNoType: 'string',
      orderNo: 'string',
      merchantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySignCreditResponse extends $tea.Model {
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

export class CancelSignFlowRequest extends $tea.Model {
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

export class CancelSignFlowResponse extends $tea.Model {
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

export class GetSignContractcertificateRequest extends $tea.Model {
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

export class GetSignContractcertificateResponse extends $tea.Model {
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

export class SyncTradeRequest extends $tea.Model {
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

export class SyncTradeResponse extends $tea.Model {
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

export class GetTradeRequest extends $tea.Model {
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

export class GetTradeResponse extends $tea.Model {
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

export class SyncFrontTradeRequest extends $tea.Model {
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

export class SyncFrontTradeResponse extends $tea.Model {
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

export class SyncTradeFinanceloanapplyRequest extends $tea.Model {
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

export class SyncTradeFinanceloanapplyResponse extends $tea.Model {
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

export class GetTradeMerchantfulfillmentRequest extends $tea.Model {
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

export class GetTradeMerchantfulfillmentResponse extends $tea.Model {
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

export class GetTradeUserperformanceRequest extends $tea.Model {
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

export class GetTradeUserperformanceResponse extends $tea.Model {
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

export class GetTradeMerchantperformanceRequest extends $tea.Model {
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

export class GetTradeMerchantperformanceResponse extends $tea.Model {
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

export class UpdateTradeUserpromiseRequest extends $tea.Model {
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

export class UpdateTradeUserpromiseResponse extends $tea.Model {
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

export class SyncFrontIndirectorderRequest extends $tea.Model {
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

export class SyncFrontIndirectorderResponse extends $tea.Model {
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

export class SyncTradeIndirectorderRequest extends $tea.Model {
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

export class SyncTradeIndirectorderResponse extends $tea.Model {
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

export class ReplaceTradeUserpromiseRequest extends $tea.Model {
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

export class ReplaceTradeUserpromiseResponse extends $tea.Model {
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

export class ApplyTradeFinanceprecheckRequest extends $tea.Model {
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

export class ApplyTradeFinanceprecheckResponse extends $tea.Model {
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

export class TransferTradeFinanceRequest extends $tea.Model {
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
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      merchantId: 'merchant_id',
      fundIdList: 'fund_id_list',
      fundSignMode: 'fund_sign_mode',
      divideStartTermIndex: 'divide_start_term_index',
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
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class TransferTradeFinanceResponse extends $tea.Model {
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

export class UpdateTradeOrderRequest extends $tea.Model {
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

export class UpdateTradeOrderResponse extends $tea.Model {
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

export class AddTradeFinanceprecheckRequest extends $tea.Model {
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

export class AddTradeFinanceprecheckResponse extends $tea.Model {
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

export class GetTradeOrderfinanceinfoRequest extends $tea.Model {
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

export class GetTradeOrderfinanceinfoResponse extends $tea.Model {
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

export class SyncTradeUserpromisedelayRequest extends $tea.Model {
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

export class SyncTradeUserpromisedelayResponse extends $tea.Model {
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

export class PauseTradeUserpromiseRequest extends $tea.Model {
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

export class PauseTradeUserpromiseResponse extends $tea.Model {
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

export class ResumeTradeUserpromiseRequest extends $tea.Model {
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

export class ResumeTradeUserpromiseResponse extends $tea.Model {
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

export class CreateWithholdSignRequest extends $tea.Model {
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
  // 支付宝uid，非必填
  alipayUserId?: string;
  // 签约完成后的跳转地址，注意只有在h5跳转场景下才有意义其他场景通过方法回调处理业务；无需使用此字段。
  returnUrl?: string;
  // 支付宝用户 open_id，非必填
  userOpenId?: string;
  // 商户支付宝应用 id
  merchantAppId?: string;
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
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateWithholdSignResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 签约字符串
  signStr?: string;
  // 签约字符串类型。SIGN_ONLY:仅签约;PAY_SIGN:支付并签约
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

export class QueryWithholdSignRequest extends $tea.Model {
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

export class QueryWithholdSignResponse extends $tea.Model {
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
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UnbindWithholdSignRequest extends $tea.Model {
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

export class UnbindWithholdSignResponse extends $tea.Model {
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

export class CancelWithholdPlanRequest extends $tea.Model {
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

export class CancelWithholdPlanResponse extends $tea.Model {
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

export class RepayWithholdPlanRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单id 长度不可超过50
  orderId: string;
  // 第几期，单期取消必填
  periodNum?: number;
  // 取消订单某一期代扣计划中以其他方式还款金额，单位为分，单期取消必填
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

export class RepayWithholdPlanResponse extends $tea.Model {
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

export class RetryWithholdPlanRequest extends $tea.Model {
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

export class RetryWithholdPlanResponse extends $tea.Model {
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

export class ConfirmWithholdSignasyncunsignRequest extends $tea.Model {
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

export class ConfirmWithholdSignasyncunsignResponse extends $tea.Model {
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

export class CreateWithholdActivepayRequest extends $tea.Model {
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
  payAmount?: number;
  // 经营分账标识Y/N
  // 当pay_type=BUYOUT、PENALTY必填。
  operationDivideFlag?: string;
  // 当operation_divide_flag=Y 必填
  // 经营分账收入列表，最多10条，分账比例与正常限制一致。
  operationDivideTransInList?: OperationDivideTransInModel[];
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
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateWithholdActivepayResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 支付宝支付订单号，用于拉起主动支付页面
  tradeNo?: string;
  // 签名字符串，用于APP支付场景，客户端唤起支付宝收银台使用。
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

export class QueryWithholdActivepayRequest extends $tea.Model {
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
  // 支付渠道，非必填。可选值：JSAPI-JSAPI支付，APP-APP支付。默认值：JSAPI
  payChannel?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      periodNum: 'period_num',
      tradeNo: 'trade_no',
      payType: 'pay_type',
      payChannel: 'pay_channel',
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
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryWithholdActivepayResponse extends $tea.Model {
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

export class CancelWithholdActivepayRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单id 长度不可超过50
  orderId: string;
  // 第几期
  periodNum: number;
  // 支付宝支付订单号，当传递此单号时，只会取消指定单据号，不传递时取消当前代扣
  tradeNo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      periodNum: 'period_num',
      tradeNo: 'trade_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      periodNum: 'number',
      tradeNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelWithholdActivepayResponse extends $tea.Model {
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

export class CreateWithholdRefundRequest extends $tea.Model {
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
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateWithholdRefundResponse extends $tea.Model {
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

export class QueryWithholdRefundRequest extends $tea.Model {
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
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      periodNum: 'period_num',
      refundRequestNo: 'refund_request_no',
      payType: 'pay_type',
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
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryWithholdRefundResponse extends $tea.Model {
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

export class QueryWithholdCompensateaccountRequest extends $tea.Model {
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

export class QueryWithholdCompensateaccountResponse extends $tea.Model {
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
          sdk_version: "1.14.9",
          _prod_code: "ATO",
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
   * Description: 分账流水同步
   * Summary: 【仅测试环境生效】分账流水同步
   */
  async syncFundSplitting(request: SyncFundSplittingRequest): Promise<SyncFundSplittingResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.syncFundSplittingEx(request, headers, runtime);
  }

  /**
   * Description: 分账流水同步
   * Summary: 【仅测试环境生效】分账流水同步
   */
  async syncFundSplittingEx(request: SyncFundSplittingRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SyncFundSplittingResponse> {
    Util.validateModel(request);
    return $tea.cast<SyncFundSplittingResponse>(await this.doRequest("1.0", "antchain.ato.fund.splitting.sync", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SyncFundSplittingResponse({}));
  }

  /**
   * Description: 提供给融资资金方，用以订单融资结果同步
   * Summary: 【废弃】订单融资结果同步
   */
  async syncFundOrderfinancial(request: SyncFundOrderfinancialRequest): Promise<SyncFundOrderfinancialResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.syncFundOrderfinancialEx(request, headers, runtime);
  }

  /**
   * Description: 提供给融资资金方，用以订单融资结果同步
   * Summary: 【废弃】订单融资结果同步
   */
  async syncFundOrderfinancialEx(request: SyncFundOrderfinancialRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SyncFundOrderfinancialResponse> {
    Util.validateModel(request);
    return $tea.cast<SyncFundOrderfinancialResponse>(await this.doRequest("1.0", "antchain.ato.fund.orderfinancial.sync", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SyncFundOrderfinancialResponse({}));
  }

  /**
   * Description: 同步租赁订单的代扣协议
   * Summary: 【仅测试环境生效】同步租赁订单的代扣协议
   */
  async syncFundWithholdingcontract(request: SyncFundWithholdingcontractRequest): Promise<SyncFundWithholdingcontractResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.syncFundWithholdingcontractEx(request, headers, runtime);
  }

  /**
   * Description: 同步租赁订单的代扣协议
   * Summary: 【仅测试环境生效】同步租赁订单的代扣协议
   */
  async syncFundWithholdingcontractEx(request: SyncFundWithholdingcontractRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SyncFundWithholdingcontractResponse> {
    Util.validateModel(request);
    return $tea.cast<SyncFundWithholdingcontractResponse>(await this.doRequest("1.0", "antchain.ato.fund.withholdingcontract.sync", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SyncFundWithholdingcontractResponse({}));
  }

  /**
   * Description: 资方回传一条订单还款履约信息
   * Summary: 【仅测试环境生效】同步订单还款履约信息
   */
  async syncFundOrderfulfillment(request: SyncFundOrderfulfillmentRequest): Promise<SyncFundOrderfulfillmentResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.syncFundOrderfulfillmentEx(request, headers, runtime);
  }

  /**
   * Description: 资方回传一条订单还款履约信息
   * Summary: 【仅测试环境生效】同步订单还款履约信息
   */
  async syncFundOrderfulfillmentEx(request: SyncFundOrderfulfillmentRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SyncFundOrderfulfillmentResponse> {
    Util.validateModel(request);
    return $tea.cast<SyncFundOrderfulfillmentResponse>(await this.doRequest("1.0", "antchain.ato.fund.orderfulfillment.sync", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SyncFundOrderfulfillmentResponse({}));
  }

  /**
   * Description: 获取订单的履约信息
   * Summary: 【仅测试环境生效】获取订单的履约信息
   */
  async getFundOrderfulfillment(request: GetFundOrderfulfillmentRequest): Promise<GetFundOrderfulfillmentResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getFundOrderfulfillmentEx(request, headers, runtime);
  }

  /**
   * Description: 获取订单的履约信息
   * Summary: 【仅测试环境生效】获取订单的履约信息
   */
  async getFundOrderfulfillmentEx(request: GetFundOrderfulfillmentRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetFundOrderfulfillmentResponse> {
    Util.validateModel(request);
    return $tea.cast<GetFundOrderfulfillmentResponse>(await this.doRequest("1.0", "antchain.ato.fund.orderfulfillment.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetFundOrderfulfillmentResponse({}));
  }

  /**
   * Description: 用于资方将盖章后的合同文件上传
   * Summary: 资方合同文件上传接口
   */
  async uploadFundFlow(request: UploadFundFlowRequest): Promise<UploadFundFlowResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.uploadFundFlowEx(request, headers, runtime);
  }

  /**
   * Description: 用于资方将盖章后的合同文件上传
   * Summary: 资方合同文件上传接口
   */
  async uploadFundFlowEx(request: UploadFundFlowRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UploadFundFlowResponse> {
    if (!Util.isUnset(request.fileObject)) {
      let uploadReq = new CreateAntcloudGatewayxFileUploadRequest({
        authToken: request.authToken,
        apiCode: "antchain.ato.fund.flow.upload",
        fileName: request.fileObjectName,
      });
      let uploadResp = await this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
      if (!AntchainUtil.isSuccess(uploadResp.resultCode, "ok")) {
        let uploadFundFlowResponse = new UploadFundFlowResponse({
          reqMsgId: uploadResp.reqMsgId,
          resultCode: uploadResp.resultCode,
          resultMsg: uploadResp.resultMsg,
        });
        return uploadFundFlowResponse;
      }

      let uploadHeaders = AntchainUtil.parseUploadHeaders(uploadResp.uploadHeaders);
      await AntchainUtil.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
      request.fileId = uploadResp.fileId;
      request.fileObject = null;
    }

    Util.validateModel(request);
    return $tea.cast<UploadFundFlowResponse>(await this.doRequest("1.0", "antchain.ato.fund.flow.upload", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UploadFundFlowResponse({}));
  }

  /**
   * Description: 获取商户签署后的合同文件，用于资方签署落章
   * Summary: 资方合同文件获取接口
   */
  async getFundFlow(request: GetFundFlowRequest): Promise<GetFundFlowResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getFundFlowEx(request, headers, runtime);
  }

  /**
   * Description: 获取商户签署后的合同文件，用于资方签署落章
   * Summary: 资方合同文件获取接口
   */
  async getFundFlowEx(request: GetFundFlowRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetFundFlowResponse> {
    Util.validateModel(request);
    return $tea.cast<GetFundFlowResponse>(await this.doRequest("1.0", "antchain.ato.fund.flow.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetFundFlowResponse({}));
  }

  /**
   * Description: 用户资方通知合同签署的状态，一般用于拒绝落章文件时，需要通知拒绝原因
   * Summary: 资方合同签署状态通知
   */
  async refuseFundFlow(request: RefuseFundFlowRequest): Promise<RefuseFundFlowResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.refuseFundFlowEx(request, headers, runtime);
  }

  /**
   * Description: 用户资方通知合同签署的状态，一般用于拒绝落章文件时，需要通知拒绝原因
   * Summary: 资方合同签署状态通知
   */
  async refuseFundFlowEx(request: RefuseFundFlowRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RefuseFundFlowResponse> {
    Util.validateModel(request);
    return $tea.cast<RefuseFundFlowResponse>(await this.doRequest("1.0", "antchain.ato.fund.flow.refuse", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RefuseFundFlowResponse({}));
  }

  /**
   * Description: 资方调用，授权通过e签宝进行落签
   * Summary: 资方e签宝落签接口
   */
  async authFundFlow(request: AuthFundFlowRequest): Promise<AuthFundFlowResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.authFundFlowEx(request, headers, runtime);
  }

  /**
   * Description: 资方调用，授权通过e签宝进行落签
   * Summary: 资方e签宝落签接口
   */
  async authFundFlowEx(request: AuthFundFlowRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AuthFundFlowResponse> {
    Util.validateModel(request);
    return $tea.cast<AuthFundFlowResponse>(await this.doRequest("1.0", "antchain.ato.fund.flow.auth", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AuthFundFlowResponse({}));
  }

  /**
   * Description: 资方调用，取消商户履约计划
   * Summary: 商户履约计划取消
   */
  async cancelFundPlan(request: CancelFundPlanRequest): Promise<CancelFundPlanResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.cancelFundPlanEx(request, headers, runtime);
  }

  /**
   * Description: 资方调用，取消商户履约计划
   * Summary: 商户履约计划取消
   */
  async cancelFundPlanEx(request: CancelFundPlanRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CancelFundPlanResponse> {
    Util.validateModel(request);
    return $tea.cast<CancelFundPlanResponse>(await this.doRequest("1.0", "antchain.ato.fund.plan.cancel", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CancelFundPlanResponse({}));
  }

  /**
   * Description: 通知回调
   * Summary: 通知回调
   */
  async callbackFundNotify(request: CallbackFundNotifyRequest): Promise<CallbackFundNotifyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.callbackFundNotifyEx(request, headers, runtime);
  }

  /**
   * Description: 通知回调
   * Summary: 通知回调
   */
  async callbackFundNotifyEx(request: CallbackFundNotifyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CallbackFundNotifyResponse> {
    Util.validateModel(request);
    return $tea.cast<CallbackFundNotifyResponse>(await this.doRequest("1.0", "antchain.ato.fund.notify.callback", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CallbackFundNotifyResponse({}));
  }

  /**
   * Description: 商户还款承诺同步
   * Summary: 商户还款承诺同步
   */
  async syncFundMerchantpromise(request: SyncFundMerchantpromiseRequest): Promise<SyncFundMerchantpromiseResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.syncFundMerchantpromiseEx(request, headers, runtime);
  }

  /**
   * Description: 商户还款承诺同步
   * Summary: 商户还款承诺同步
   */
  async syncFundMerchantpromiseEx(request: SyncFundMerchantpromiseRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SyncFundMerchantpromiseResponse> {
    Util.validateModel(request);
    return $tea.cast<SyncFundMerchantpromiseResponse>(await this.doRequest("1.0", "antchain.ato.fund.merchantpromise.sync", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SyncFundMerchantpromiseResponse({}));
  }

  /**
   * Description: 融资放款结果同步
   * Summary: 融资放款结果同步
   */
  async syncFundFinanceloanresults(request: SyncFundFinanceloanresultsRequest): Promise<SyncFundFinanceloanresultsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.syncFundFinanceloanresultsEx(request, headers, runtime);
  }

  /**
   * Description: 融资放款结果同步
   * Summary: 融资放款结果同步
   */
  async syncFundFinanceloanresultsEx(request: SyncFundFinanceloanresultsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SyncFundFinanceloanresultsResponse> {
    Util.validateModel(request);
    return $tea.cast<SyncFundFinanceloanresultsResponse>(await this.doRequest("1.0", "antchain.ato.fund.financeloanresults.sync", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SyncFundFinanceloanresultsResponse({}));
  }

  /**
   * Description: 查询用户承诺
   * Summary: 查询用户承诺
   */
  async getFundUserpromise(request: GetFundUserpromiseRequest): Promise<GetFundUserpromiseResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getFundUserpromiseEx(request, headers, runtime);
  }

  /**
   * Description: 查询用户承诺
   * Summary: 查询用户承诺
   */
  async getFundUserpromiseEx(request: GetFundUserpromiseRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetFundUserpromiseResponse> {
    Util.validateModel(request);
    return $tea.cast<GetFundUserpromiseResponse>(await this.doRequest("1.0", "antchain.ato.fund.userpromise.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetFundUserpromiseResponse({}));
  }

  /**
   * Description: 用户履约信息查询（履约承诺+履约记录）
   * Summary: 用户履约信息查询（履约承诺+履约记录）
   */
  async getFundUserperformance(request: GetFundUserperformanceRequest): Promise<GetFundUserperformanceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getFundUserperformanceEx(request, headers, runtime);
  }

  /**
   * Description: 用户履约信息查询（履约承诺+履约记录）
   * Summary: 用户履约信息查询（履约承诺+履约记录）
   */
  async getFundUserperformanceEx(request: GetFundUserperformanceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetFundUserperformanceResponse> {
    Util.validateModel(request);
    return $tea.cast<GetFundUserperformanceResponse>(await this.doRequest("1.0", "antchain.ato.fund.userperformance.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetFundUserperformanceResponse({}));
  }

  /**
   * Description: 商户履约信息查询（履约承诺+履约记录）
   * Summary: 商户履约信息查询（履约承诺+履约记录）
   */
  async getFundMerchantperformance(request: GetFundMerchantperformanceRequest): Promise<GetFundMerchantperformanceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getFundMerchantperformanceEx(request, headers, runtime);
  }

  /**
   * Description: 商户履约信息查询（履约承诺+履约记录）
   * Summary: 商户履约信息查询（履约承诺+履约记录）
   */
  async getFundMerchantperformanceEx(request: GetFundMerchantperformanceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetFundMerchantperformanceResponse> {
    Util.validateModel(request);
    return $tea.cast<GetFundMerchantperformanceResponse>(await this.doRequest("1.0", "antchain.ato.fund.merchantperformance.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetFundMerchantperformanceResponse({}));
  }

  /**
   * Description: 资方查询订单详情
   * Summary: 资方查询订单详情
   */
  async getFundOrderfullinfo(request: GetFundOrderfullinfoRequest): Promise<GetFundOrderfullinfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getFundOrderfullinfoEx(request, headers, runtime);
  }

  /**
   * Description: 资方查询订单详情
   * Summary: 资方查询订单详情
   */
  async getFundOrderfullinfoEx(request: GetFundOrderfullinfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetFundOrderfullinfoResponse> {
    Util.validateModel(request);
    return $tea.cast<GetFundOrderfullinfoResponse>(await this.doRequest("1.0", "antchain.ato.fund.orderfullinfo.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetFundOrderfullinfoResponse({}));
  }

  /**
   * Description: 用于资方将盖章后的合同文件上传给ISV后，ISV通过该接口通知资方已上传合同
   * Summary: 资方合同文件已上传确认接口
   */
  async notifyFundFlow(request: NotifyFundFlowRequest): Promise<NotifyFundFlowResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.notifyFundFlowEx(request, headers, runtime);
  }

  /**
   * Description: 用于资方将盖章后的合同文件上传给ISV后，ISV通过该接口通知资方已上传合同
   * Summary: 资方合同文件已上传确认接口
   */
  async notifyFundFlowEx(request: NotifyFundFlowRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<NotifyFundFlowResponse> {
    Util.validateModel(request);
    return $tea.cast<NotifyFundFlowResponse>(await this.doRequest("1.0", "antchain.ato.fund.flow.notify", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new NotifyFundFlowResponse({}));
  }

  /**
   * Description: 资方资产凭证上传，可以是文本或文件
   * Summary: 资方资产凭证上传
   */
  async uploadFundCredit(request: UploadFundCreditRequest): Promise<UploadFundCreditResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.uploadFundCreditEx(request, headers, runtime);
  }

  /**
   * Description: 资方资产凭证上传，可以是文本或文件
   * Summary: 资方资产凭证上传
   */
  async uploadFundCreditEx(request: UploadFundCreditRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UploadFundCreditResponse> {
    Util.validateModel(request);
    return $tea.cast<UploadFundCreditResponse>(await this.doRequest("1.0", "antchain.ato.fund.credit.upload", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UploadFundCreditResponse({}));
  }

  /**
   * Description: 资方资产凭证查询，需要提供订单号或资产包号
   * Summary: 资方资产凭证查询
   */
  async queryFundCredit(request: QueryFundCreditRequest): Promise<QueryFundCreditResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryFundCreditEx(request, headers, runtime);
  }

  /**
   * Description: 资方资产凭证查询，需要提供订单号或资产包号
   * Summary: 资方资产凭证查询
   */
  async queryFundCreditEx(request: QueryFundCreditRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryFundCreditResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryFundCreditResponse>(await this.doRequest("1.0", "antchain.ato.fund.credit.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryFundCreditResponse({}));
  }

  /**
   * Description: 融资预审结果同步
   * Summary: 融资预审结果同步
   */
  async syncFundFinanceprecheckresult(request: SyncFundFinanceprecheckresultRequest): Promise<SyncFundFinanceprecheckresultResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.syncFundFinanceprecheckresultEx(request, headers, runtime);
  }

  /**
   * Description: 融资预审结果同步
   * Summary: 融资预审结果同步
   */
  async syncFundFinanceprecheckresultEx(request: SyncFundFinanceprecheckresultRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SyncFundFinanceprecheckresultResponse> {
    Util.validateModel(request);
    return $tea.cast<SyncFundFinanceprecheckresultResponse>(await this.doRequest("1.0", "antchain.ato.fund.financeprecheckresult.sync", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SyncFundFinanceprecheckresultResponse({}));
  }

  /**
   * Description: 资方查询代偿户余额
   * Summary: 代偿户查询
   */
  async queryFundCompensateaccount(request: QueryFundCompensateaccountRequest): Promise<QueryFundCompensateaccountResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryFundCompensateaccountEx(request, headers, runtime);
  }

  /**
   * Description: 资方查询代偿户余额
   * Summary: 代偿户查询
   */
  async queryFundCompensateaccountEx(request: QueryFundCompensateaccountRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryFundCompensateaccountResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryFundCompensateaccountResponse>(await this.doRequest("1.0", "antchain.ato.fund.compensateaccount.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryFundCompensateaccountResponse({}));
  }

  /**
   * Description: 资方查询订单融资信息
   * Summary: 资方查询订单融资信息
   */
  async getFundOrderfinanceinfo(request: GetFundOrderfinanceinfoRequest): Promise<GetFundOrderfinanceinfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getFundOrderfinanceinfoEx(request, headers, runtime);
  }

  /**
   * Description: 资方查询订单融资信息
   * Summary: 资方查询订单融资信息
   */
  async getFundOrderfinanceinfoEx(request: GetFundOrderfinanceinfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetFundOrderfinanceinfoResponse> {
    Util.validateModel(request);
    return $tea.cast<GetFundOrderfinanceinfoResponse>(await this.doRequest("1.0", "antchain.ato.fund.orderfinanceinfo.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetFundOrderfinanceinfoResponse({}));
  }

  /**
   * Description: 添加分账绑定关系
   * Summary: 添加分账绑定关系
   */
  async addFundDividerelation(request: AddFundDividerelationRequest): Promise<AddFundDividerelationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.addFundDividerelationEx(request, headers, runtime);
  }

  /**
   * Description: 添加分账绑定关系
   * Summary: 添加分账绑定关系
   */
  async addFundDividerelationEx(request: AddFundDividerelationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AddFundDividerelationResponse> {
    Util.validateModel(request);
    return $tea.cast<AddFundDividerelationResponse>(await this.doRequest("1.0", "antchain.ato.fund.dividerelation.add", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AddFundDividerelationResponse({}));
  }

  /**
   * Description: 分账绑定关系查询
   * Summary: 分账绑定关系查询
   */
  async queryFundDividerelation(request: QueryFundDividerelationRequest): Promise<QueryFundDividerelationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryFundDividerelationEx(request, headers, runtime);
  }

  /**
   * Description: 分账绑定关系查询
   * Summary: 分账绑定关系查询
   */
  async queryFundDividerelationEx(request: QueryFundDividerelationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryFundDividerelationResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryFundDividerelationResponse>(await this.doRequest("1.0", "antchain.ato.fund.dividerelation.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryFundDividerelationResponse({}));
  }

  /**
   * Description: ● 本接口获取用信授权
  ● 本接口返回成功后，仅代表用信申请成功；不代表订单融资发起申请成功，融资申请结果通过异步消息通知
   * Summary: 用信申请接口
   */
  async applyFundCreditutilization(request: ApplyFundCreditutilizationRequest): Promise<ApplyFundCreditutilizationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyFundCreditutilizationEx(request, headers, runtime);
  }

  /**
   * Description: ● 本接口获取用信授权
  ● 本接口返回成功后，仅代表用信申请成功；不代表订单融资发起申请成功，融资申请结果通过异步消息通知
   * Summary: 用信申请接口
   */
  async applyFundCreditutilizationEx(request: ApplyFundCreditutilizationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyFundCreditutilizationResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyFundCreditutilizationResponse>(await this.doRequest("1.0", "antchain.ato.fund.creditutilization.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyFundCreditutilizationResponse({}));
  }

  /**
   * Description: 小贷融资用信申请订单履约信息
   * Summary: 用信申请订单履约信息
   */
  async applyFundAssertorder(request: ApplyFundAssertorderRequest): Promise<ApplyFundAssertorderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyFundAssertorderEx(request, headers, runtime);
  }

  /**
   * Description: 小贷融资用信申请订单履约信息
   * Summary: 用信申请订单履约信息
   */
  async applyFundAssertorderEx(request: ApplyFundAssertorderRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyFundAssertorderResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyFundAssertorderResponse>(await this.doRequest("1.0", "antchain.ato.fund.assertorder.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyFundAssertorderResponse({}));
  }

  /**
   * Description: 用信查询订单履约信息
   * Summary: 用信查询订单履约信息
   */
  async queryFundAssertorder(request: QueryFundAssertorderRequest): Promise<QueryFundAssertorderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryFundAssertorderEx(request, headers, runtime);
  }

  /**
   * Description: 用信查询订单履约信息
   * Summary: 用信查询订单履约信息
   */
  async queryFundAssertorderEx(request: QueryFundAssertorderRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryFundAssertorderResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryFundAssertorderResponse>(await this.doRequest("1.0", "antchain.ato.fund.assertorder.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryFundAssertorderResponse({}));
  }

  /**
   * Description: 调用说明：
  ● 本接口用于授信额度试算完成后同步授信结果。
   * Summary: 授信结果同步接口
   */
  async syncFundCreditgranting(request: SyncFundCreditgrantingRequest): Promise<SyncFundCreditgrantingResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.syncFundCreditgrantingEx(request, headers, runtime);
  }

  /**
   * Description: 调用说明：
  ● 本接口用于授信额度试算完成后同步授信结果。
   * Summary: 授信结果同步接口
   */
  async syncFundCreditgrantingEx(request: SyncFundCreditgrantingRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SyncFundCreditgrantingResponse> {
    Util.validateModel(request);
    return $tea.cast<SyncFundCreditgrantingResponse>(await this.doRequest("1.0", "antchain.ato.fund.creditgranting.sync", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SyncFundCreditgrantingResponse({}));
  }

  /**
   * Description: 本接口用于授信授权。本接口返回成功后，代表授权申请已发起。如果授权通过，会发送异步通知。
   * Summary: 授信授权申请接口
   */
  async authFundCreditgranting(request: AuthFundCreditgrantingRequest): Promise<AuthFundCreditgrantingResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.authFundCreditgrantingEx(request, headers, runtime);
  }

  /**
   * Description: 本接口用于授信授权。本接口返回成功后，代表授权申请已发起。如果授权通过，会发送异步通知。
   * Summary: 授信授权申请接口
   */
  async authFundCreditgrantingEx(request: AuthFundCreditgrantingRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AuthFundCreditgrantingResponse> {
    Util.validateModel(request);
    return $tea.cast<AuthFundCreditgrantingResponse>(await this.doRequest("1.0", "antchain.ato.fund.creditgranting.auth", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AuthFundCreditgrantingResponse({}));
  }

  /**
   * Description: 小贷融资查询资产报告
   * Summary: 查询资产报告
   */
  async queryFundAssertreport(request: QueryFundAssertreportRequest): Promise<QueryFundAssertreportResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryFundAssertreportEx(request, headers, runtime);
  }

  /**
   * Description: 小贷融资查询资产报告
   * Summary: 查询资产报告
   */
  async queryFundAssertreportEx(request: QueryFundAssertreportRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryFundAssertreportResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryFundAssertreportResponse>(await this.doRequest("1.0", "antchain.ato.fund.assertreport.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryFundAssertreportResponse({}));
  }

  /**
   * Description: 本接口用于查询授信结果
   * Summary: 授信结果查询
   */
  async queryFundCreditgranting(request: QueryFundCreditgrantingRequest): Promise<QueryFundCreditgrantingResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryFundCreditgrantingEx(request, headers, runtime);
  }

  /**
   * Description: 本接口用于查询授信结果
   * Summary: 授信结果查询
   */
  async queryFundCreditgrantingEx(request: QueryFundCreditgrantingRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryFundCreditgrantingResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryFundCreditgrantingResponse>(await this.doRequest("1.0", "antchain.ato.fund.creditgranting.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryFundCreditgrantingResponse({}));
  }

  /**
   * Description: 授权信息查询
   * Summary: 授权信息查询
   */
  async queryFundCreditauth(request: QueryFundCreditauthRequest): Promise<QueryFundCreditauthResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryFundCreditauthEx(request, headers, runtime);
  }

  /**
   * Description: 授权信息查询
   * Summary: 授权信息查询
   */
  async queryFundCreditauthEx(request: QueryFundCreditauthRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryFundCreditauthResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryFundCreditauthResponse>(await this.doRequest("1.0", "antchain.ato.fund.creditauth.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryFundCreditauthResponse({}));
  }

  /**
   * Description: 内部调用,商品信息获取
   * Summary: 商品信息获取
   */
  async getInnerProduct(request: GetInnerProductRequest): Promise<GetInnerProductResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getInnerProductEx(request, headers, runtime);
  }

  /**
   * Description: 内部调用,商品信息获取
   * Summary: 商品信息获取
   */
  async getInnerProductEx(request: GetInnerProductRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetInnerProductResponse> {
    Util.validateModel(request);
    return $tea.cast<GetInnerProductResponse>(await this.doRequest("1.0", "antchain.ato.inner.product.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetInnerProductResponse({}));
  }

  /**
   * Description: ato内部服务，客户系统不可访问；租户信息获取
   * Summary: 租户信息获取
   */
  async getInnerTenant(request: GetInnerTenantRequest): Promise<GetInnerTenantResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getInnerTenantEx(request, headers, runtime);
  }

  /**
   * Description: ato内部服务，客户系统不可访问；租户信息获取
   * Summary: 租户信息获取
   */
  async getInnerTenantEx(request: GetInnerTenantRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetInnerTenantResponse> {
    Util.validateModel(request);
    return $tea.cast<GetInnerTenantResponse>(await this.doRequest("1.0", "antchain.ato.inner.tenant.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetInnerTenantResponse({}));
  }

  /**
   * Description: 内部接口，客户系统不能调用。上报整单结算计量信息
   * Summary: 上报整单结算计量信息
   */
  async syncInnerMeterforwholeorder(request: SyncInnerMeterforwholeorderRequest): Promise<SyncInnerMeterforwholeorderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.syncInnerMeterforwholeorderEx(request, headers, runtime);
  }

  /**
   * Description: 内部接口，客户系统不能调用。上报整单结算计量信息
   * Summary: 上报整单结算计量信息
   */
  async syncInnerMeterforwholeorderEx(request: SyncInnerMeterforwholeorderRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SyncInnerMeterforwholeorderResponse> {
    Util.validateModel(request);
    return $tea.cast<SyncInnerMeterforwholeorderResponse>(await this.doRequest("1.0", "antchain.ato.inner.meterforwholeorder.sync", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SyncInnerMeterforwholeorderResponse({}));
  }

  /**
   * Description: 内部调用，合同签署计量上报接口
   * Summary: 合同签署计量上报同步接口
   */
  async syncInnerMeterforagsign(request: SyncInnerMeterforagsignRequest): Promise<SyncInnerMeterforagsignResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.syncInnerMeterforagsignEx(request, headers, runtime);
  }

  /**
   * Description: 内部调用，合同签署计量上报接口
   * Summary: 合同签署计量上报同步接口
   */
  async syncInnerMeterforagsignEx(request: SyncInnerMeterforagsignRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SyncInnerMeterforagsignResponse> {
    Util.validateModel(request);
    return $tea.cast<SyncInnerMeterforagsignResponse>(await this.doRequest("1.0", "antchain.ato.inner.meterforagsign.sync", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SyncInnerMeterforagsignResponse({}));
  }

  /**
   * Description: 内部接口，根据租户查询合同模板列表
   * Summary: 查询模板列表
   */
  async allInnerTemplate(request: AllInnerTemplateRequest): Promise<AllInnerTemplateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.allInnerTemplateEx(request, headers, runtime);
  }

  /**
   * Description: 内部接口，根据租户查询合同模板列表
   * Summary: 查询模板列表
   */
  async allInnerTemplateEx(request: AllInnerTemplateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AllInnerTemplateResponse> {
    Util.validateModel(request);
    return $tea.cast<AllInnerTemplateResponse>(await this.doRequest("1.0", "antchain.ato.inner.template.all", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AllInnerTemplateResponse({}));
  }

  /**
   * Description: 内部接口，根据模板code查询合同模板版本列表
   * Summary: 查询魔法库某一模板版本列表
   */
  async listInnerTemplate(request: ListInnerTemplateRequest): Promise<ListInnerTemplateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listInnerTemplateEx(request, headers, runtime);
  }

  /**
   * Description: 内部接口，根据模板code查询合同模板版本列表
   * Summary: 查询魔法库某一模板版本列表
   */
  async listInnerTemplateEx(request: ListInnerTemplateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListInnerTemplateResponse> {
    Util.validateModel(request);
    return $tea.cast<ListInnerTemplateResponse>(await this.doRequest("1.0", "antchain.ato.inner.template.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListInnerTemplateResponse({}));
  }

  /**
   * Description: 内部接口，根据模板code查询指定版本的模板详情
   * Summary: 查询魔法库模板详情
   */
  async detailInnerTemplate(request: DetailInnerTemplateRequest): Promise<DetailInnerTemplateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.detailInnerTemplateEx(request, headers, runtime);
  }

  /**
   * Description: 内部接口，根据模板code查询指定版本的模板详情
   * Summary: 查询魔法库模板详情
   */
  async detailInnerTemplateEx(request: DetailInnerTemplateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DetailInnerTemplateResponse> {
    Util.validateModel(request);
    return $tea.cast<DetailInnerTemplateResponse>(await this.doRequest("1.0", "antchain.ato.inner.template.detail", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DetailInnerTemplateResponse({}));
  }

  /**
   * Description: 内部接口，创建魔法库模板
   * Summary: 创建模板
   */
  async createInnerTemplate(request: CreateInnerTemplateRequest): Promise<CreateInnerTemplateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createInnerTemplateEx(request, headers, runtime);
  }

  /**
   * Description: 内部接口，创建魔法库模板
   * Summary: 创建模板
   */
  async createInnerTemplateEx(request: CreateInnerTemplateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateInnerTemplateResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateInnerTemplateResponse>(await this.doRequest("1.0", "antchain.ato.inner.template.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateInnerTemplateResponse({}));
  }

  /**
   * Description: 内部接口，保存魔法库模板
   * Summary: 保存魔法库模板
   */
  async saveInnerTemplate(request: SaveInnerTemplateRequest): Promise<SaveInnerTemplateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.saveInnerTemplateEx(request, headers, runtime);
  }

  /**
   * Description: 内部接口，保存魔法库模板
   * Summary: 保存魔法库模板
   */
  async saveInnerTemplateEx(request: SaveInnerTemplateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SaveInnerTemplateResponse> {
    Util.validateModel(request);
    return $tea.cast<SaveInnerTemplateResponse>(await this.doRequest("1.0", "antchain.ato.inner.template.save", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SaveInnerTemplateResponse({}));
  }

  /**
   * Description: 内部接口，保存魔法库模板签署区
   * Summary: 保存魔法库模板签署区
   */
  async saveInnerSignfields(request: SaveInnerSignfieldsRequest): Promise<SaveInnerSignfieldsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.saveInnerSignfieldsEx(request, headers, runtime);
  }

  /**
   * Description: 内部接口，保存魔法库模板签署区
   * Summary: 保存魔法库模板签署区
   */
  async saveInnerSignfieldsEx(request: SaveInnerSignfieldsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SaveInnerSignfieldsResponse> {
    Util.validateModel(request);
    return $tea.cast<SaveInnerSignfieldsResponse>(await this.doRequest("1.0", "antchain.ato.inner.signfields.save", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SaveInnerSignfieldsResponse({}));
  }

  /**
   * Description: 内部接口，发布魔法库模板
   * Summary: 发布魔法库模板
   */
  async publishInnerTemplate(request: PublishInnerTemplateRequest): Promise<PublishInnerTemplateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.publishInnerTemplateEx(request, headers, runtime);
  }

  /**
   * Description: 内部接口，发布魔法库模板
   * Summary: 发布魔法库模板
   */
  async publishInnerTemplateEx(request: PublishInnerTemplateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PublishInnerTemplateResponse> {
    Util.validateModel(request);
    return $tea.cast<PublishInnerTemplateResponse>(await this.doRequest("1.0", "antchain.ato.inner.template.publish", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PublishInnerTemplateResponse({}));
  }

  /**
   * Description: 内部接口，根据code预览对应魔法库模板
   * Summary: 预览魔法库模板
   */
  async previewInnerTemplate(request: PreviewInnerTemplateRequest): Promise<PreviewInnerTemplateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.previewInnerTemplateEx(request, headers, runtime);
  }

  /**
   * Description: 内部接口，根据code预览对应魔法库模板
   * Summary: 预览魔法库模板
   */
  async previewInnerTemplateEx(request: PreviewInnerTemplateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PreviewInnerTemplateResponse> {
    Util.validateModel(request);
    return $tea.cast<PreviewInnerTemplateResponse>(await this.doRequest("1.0", "antchain.ato.inner.template.preview", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PreviewInnerTemplateResponse({}));
  }

  /**
   * Description: 内部接口，根据code删除对应魔法库模板
   * Summary: 删除魔法库模板
   */
  async deleteInnerTemplate(request: DeleteInnerTemplateRequest): Promise<DeleteInnerTemplateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteInnerTemplateEx(request, headers, runtime);
  }

  /**
   * Description: 内部接口，根据code删除对应魔法库模板
   * Summary: 删除魔法库模板
   */
  async deleteInnerTemplateEx(request: DeleteInnerTemplateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteInnerTemplateResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteInnerTemplateResponse>(await this.doRequest("1.0", "antchain.ato.inner.template.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteInnerTemplateResponse({}));
  }

  /**
   * Description: 内部接口，复制一个魔法库模板
   * Summary: 复制魔法库模板
   */
  async cloneInnerTemplate(request: CloneInnerTemplateRequest): Promise<CloneInnerTemplateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.cloneInnerTemplateEx(request, headers, runtime);
  }

  /**
   * Description: 内部接口，复制一个魔法库模板
   * Summary: 复制魔法库模板
   */
  async cloneInnerTemplateEx(request: CloneInnerTemplateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CloneInnerTemplateResponse> {
    Util.validateModel(request);
    return $tea.cast<CloneInnerTemplateResponse>(await this.doRequest("1.0", "antchain.ato.inner.template.clone", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CloneInnerTemplateResponse({}));
  }

  /**
   * Description: ato文件上传
   * Summary: ato文件上传
   */
  async uploadInnerFile(request: UploadInnerFileRequest): Promise<UploadInnerFileResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.uploadInnerFileEx(request, headers, runtime);
  }

  /**
   * Description: ato文件上传
   * Summary: ato文件上传
   */
  async uploadInnerFileEx(request: UploadInnerFileRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UploadInnerFileResponse> {
    Util.validateModel(request);
    return $tea.cast<UploadInnerFileResponse>(await this.doRequest("1.0", "antchain.ato.inner.file.upload", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UploadInnerFileResponse({}));
  }

  /**
   * Description: ato文件下载
   * Summary: ato文件下载
   */
  async downloadInnerFile(request: DownloadInnerFileRequest): Promise<DownloadInnerFileResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.downloadInnerFileEx(request, headers, runtime);
  }

  /**
   * Description: ato文件下载
   * Summary: ato文件下载
   */
  async downloadInnerFileEx(request: DownloadInnerFileRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DownloadInnerFileResponse> {
    Util.validateModel(request);
    return $tea.cast<DownloadInnerFileResponse>(await this.doRequest("1.0", "antchain.ato.inner.file.download", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DownloadInnerFileResponse({}));
  }

  /**
   * Description: 获取 webofficeURL（透传）
   * Summary: 获取 webofficeURL
   */
  async getInnerTemplateofficeurl(request: GetInnerTemplateofficeurlRequest): Promise<GetInnerTemplateofficeurlResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getInnerTemplateofficeurlEx(request, headers, runtime);
  }

  /**
   * Description: 获取 webofficeURL（透传）
   * Summary: 获取 webofficeURL
   */
  async getInnerTemplateofficeurlEx(request: GetInnerTemplateofficeurlRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetInnerTemplateofficeurlResponse> {
    Util.validateModel(request);
    return $tea.cast<GetInnerTemplateofficeurlResponse>(await this.doRequest("1.0", "antchain.ato.inner.templateofficeurl.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetInnerTemplateofficeurlResponse({}));
  }

  /**
   * Description: 魔法库控制台刷新token
   * Summary: 刷新token
   */
  async refreshInnerTemplatetoken(request: RefreshInnerTemplatetokenRequest): Promise<RefreshInnerTemplatetokenResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.refreshInnerTemplatetokenEx(request, headers, runtime);
  }

  /**
   * Description: 魔法库控制台刷新token
   * Summary: 刷新token
   */
  async refreshInnerTemplatetokenEx(request: RefreshInnerTemplatetokenRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RefreshInnerTemplatetokenResponse> {
    Util.validateModel(request);
    return $tea.cast<RefreshInnerTemplatetokenResponse>(await this.doRequest("1.0", "antchain.ato.inner.templatetoken.refresh", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RefreshInnerTemplatetokenResponse({}));
  }

  /**
   * Description: 创建文本域（组件）
   * Summary: 创建文本域
   */
  async createInnerTemplatetextarea(request: CreateInnerTemplatetextareaRequest): Promise<CreateInnerTemplatetextareaResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createInnerTemplatetextareaEx(request, headers, runtime);
  }

  /**
   * Description: 创建文本域（组件）
   * Summary: 创建文本域
   */
  async createInnerTemplatetextareaEx(request: CreateInnerTemplatetextareaRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateInnerTemplatetextareaResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateInnerTemplatetextareaResponse>(await this.doRequest("1.0", "antchain.ato.inner.templatetextarea.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateInnerTemplatetextareaResponse({}));
  }

  /**
   * Description: 获取模板的图片列表
   * Summary: 获取模板的图片列表
   */
  async queryInnerTemplateimage(request: QueryInnerTemplateimageRequest): Promise<QueryInnerTemplateimageResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryInnerTemplateimageEx(request, headers, runtime);
  }

  /**
   * Description: 获取模板的图片列表
   * Summary: 获取模板的图片列表
   */
  async queryInnerTemplateimageEx(request: QueryInnerTemplateimageRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryInnerTemplateimageResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryInnerTemplateimageResponse>(await this.doRequest("1.0", "antchain.ato.inner.templateimage.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryInnerTemplateimageResponse({}));
  }

  /**
   * Description: 保存/编辑分账关系信息
   * Summary: 保存/编辑分账关系信息
   */
  async createInnerFunddividerelation(request: CreateInnerFunddividerelationRequest): Promise<CreateInnerFunddividerelationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createInnerFunddividerelationEx(request, headers, runtime);
  }

  /**
   * Description: 保存/编辑分账关系信息
   * Summary: 保存/编辑分账关系信息
   */
  async createInnerFunddividerelationEx(request: CreateInnerFunddividerelationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateInnerFunddividerelationResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateInnerFunddividerelationResponse>(await this.doRequest("1.0", "antchain.ato.inner.funddividerelation.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateInnerFunddividerelationResponse({}));
  }

  /**
   * Description: 提交分账关系信息
   * Summary: 提交分账关系信息
   */
  async submitInnerFunddividerelation(request: SubmitInnerFunddividerelationRequest): Promise<SubmitInnerFunddividerelationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.submitInnerFunddividerelationEx(request, headers, runtime);
  }

  /**
   * Description: 提交分账关系信息
   * Summary: 提交分账关系信息
   */
  async submitInnerFunddividerelationEx(request: SubmitInnerFunddividerelationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SubmitInnerFunddividerelationResponse> {
    Util.validateModel(request);
    return $tea.cast<SubmitInnerFunddividerelationResponse>(await this.doRequest("1.0", "antchain.ato.inner.funddividerelation.submit", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SubmitInnerFunddividerelationResponse({}));
  }

  /**
   * Description: 查询分账关系信息
   * Summary: 查询分账关系信息
   */
  async queryInnerFunddividerelation(request: QueryInnerFunddividerelationRequest): Promise<QueryInnerFunddividerelationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryInnerFunddividerelationEx(request, headers, runtime);
  }

  /**
   * Description: 查询分账关系信息
   * Summary: 查询分账关系信息
   */
  async queryInnerFunddividerelationEx(request: QueryInnerFunddividerelationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryInnerFunddividerelationResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryInnerFunddividerelationResponse>(await this.doRequest("1.0", "antchain.ato.inner.funddividerelation.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryInnerFunddividerelationResponse({}));
  }

  /**
   * Description: 查询分账关系分页列表
   * Summary: 查询分账关系分页列表
   */
  async pagequeryInnerFunddividerelation(request: PagequeryInnerFunddividerelationRequest): Promise<PagequeryInnerFunddividerelationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pagequeryInnerFunddividerelationEx(request, headers, runtime);
  }

  /**
   * Description: 查询分账关系分页列表
   * Summary: 查询分账关系分页列表
   */
  async pagequeryInnerFunddividerelationEx(request: PagequeryInnerFunddividerelationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PagequeryInnerFunddividerelationResponse> {
    Util.validateModel(request);
    return $tea.cast<PagequeryInnerFunddividerelationResponse>(await this.doRequest("1.0", "antchain.ato.inner.funddividerelation.pagequery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PagequeryInnerFunddividerelationResponse({}));
  }

  /**
   * Description: 保存租户签约信息
   * Summary: 保存租户签约信息
   */
  async createInnerMerchantagreement(request: CreateInnerMerchantagreementRequest): Promise<CreateInnerMerchantagreementResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createInnerMerchantagreementEx(request, headers, runtime);
  }

  /**
   * Description: 保存租户签约信息
   * Summary: 保存租户签约信息
   */
  async createInnerMerchantagreementEx(request: CreateInnerMerchantagreementRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateInnerMerchantagreementResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateInnerMerchantagreementResponse>(await this.doRequest("1.0", "antchain.ato.inner.merchantagreement.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateInnerMerchantagreementResponse({}));
  }

  /**
   * Description: 查询租户签约信息
   * Summary: 查询租户签约信息
   */
  async queryInnerMerchantagreement(request: QueryInnerMerchantagreementRequest): Promise<QueryInnerMerchantagreementResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryInnerMerchantagreementEx(request, headers, runtime);
  }

  /**
   * Description: 查询租户签约信息
   * Summary: 查询租户签约信息
   */
  async queryInnerMerchantagreementEx(request: QueryInnerMerchantagreementRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryInnerMerchantagreementResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryInnerMerchantagreementResponse>(await this.doRequest("1.0", "antchain.ato.inner.merchantagreement.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryInnerMerchantagreementResponse({}));
  }

  /**
   * Description: 查询租户签约协议分页列表
   * Summary: 查询租户签约协议分页列表
   */
  async pagequeryInnerMerchantagreement(request: PagequeryInnerMerchantagreementRequest): Promise<PagequeryInnerMerchantagreementResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pagequeryInnerMerchantagreementEx(request, headers, runtime);
  }

  /**
   * Description: 查询租户签约协议分页列表
   * Summary: 查询租户签约协议分页列表
   */
  async pagequeryInnerMerchantagreementEx(request: PagequeryInnerMerchantagreementRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PagequeryInnerMerchantagreementResponse> {
    Util.validateModel(request);
    return $tea.cast<PagequeryInnerMerchantagreementResponse>(await this.doRequest("1.0", "antchain.ato.inner.merchantagreement.pagequery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PagequeryInnerMerchantagreementResponse({}));
  }

  /**
   * Description: 保存/编辑进件信息
   * Summary: 保存/编辑进件信息
   */
  async createInnerMerchantpayexpand(request: CreateInnerMerchantpayexpandRequest): Promise<CreateInnerMerchantpayexpandResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createInnerMerchantpayexpandEx(request, headers, runtime);
  }

  /**
   * Description: 保存/编辑进件信息
   * Summary: 保存/编辑进件信息
   */
  async createInnerMerchantpayexpandEx(request: CreateInnerMerchantpayexpandRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateInnerMerchantpayexpandResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateInnerMerchantpayexpandResponse>(await this.doRequest("1.0", "antchain.ato.inner.merchantpayexpand.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateInnerMerchantpayexpandResponse({}));
  }

  /**
   * Description: 提交进件信息
   * Summary: 提交进件信息
   */
  async submitInnerMerchantpayexpand(request: SubmitInnerMerchantpayexpandRequest): Promise<SubmitInnerMerchantpayexpandResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.submitInnerMerchantpayexpandEx(request, headers, runtime);
  }

  /**
   * Description: 提交进件信息
   * Summary: 提交进件信息
   */
  async submitInnerMerchantpayexpandEx(request: SubmitInnerMerchantpayexpandRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SubmitInnerMerchantpayexpandResponse> {
    Util.validateModel(request);
    return $tea.cast<SubmitInnerMerchantpayexpandResponse>(await this.doRequest("1.0", "antchain.ato.inner.merchantpayexpand.submit", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SubmitInnerMerchantpayexpandResponse({}));
  }

  /**
   * Description: 查询进件信息
   * Summary: 查询进件信息
   */
  async queryInnerMerchantpayexpand(request: QueryInnerMerchantpayexpandRequest): Promise<QueryInnerMerchantpayexpandResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryInnerMerchantpayexpandEx(request, headers, runtime);
  }

  /**
   * Description: 查询进件信息
   * Summary: 查询进件信息
   */
  async queryInnerMerchantpayexpandEx(request: QueryInnerMerchantpayexpandRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryInnerMerchantpayexpandResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryInnerMerchantpayexpandResponse>(await this.doRequest("1.0", "antchain.ato.inner.merchantpayexpand.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryInnerMerchantpayexpandResponse({}));
  }

  /**
   * Description: 查询代理商户分页列表-间连商户使用
   * Summary: 查询代理商户分页列表-间连商户使用
   */
  async pagequeryInnerMerchantagent(request: PagequeryInnerMerchantagentRequest): Promise<PagequeryInnerMerchantagentResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pagequeryInnerMerchantagentEx(request, headers, runtime);
  }

  /**
   * Description: 查询代理商户分页列表-间连商户使用
   * Summary: 查询代理商户分页列表-间连商户使用
   */
  async pagequeryInnerMerchantagentEx(request: PagequeryInnerMerchantagentRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PagequeryInnerMerchantagentResponse> {
    Util.validateModel(request);
    return $tea.cast<PagequeryInnerMerchantagentResponse>(await this.doRequest("1.0", "antchain.ato.inner.merchantagent.pagequery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PagequeryInnerMerchantagentResponse({}));
  }

  /**
   * Description: 拷贝模板文件，可用于保存模板的入参
   * Summary: 拷贝模板文件
   */
  async cloneInnerTemplatefileaddress(request: CloneInnerTemplatefileaddressRequest): Promise<CloneInnerTemplatefileaddressResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.cloneInnerTemplatefileaddressEx(request, headers, runtime);
  }

  /**
   * Description: 拷贝模板文件，可用于保存模板的入参
   * Summary: 拷贝模板文件
   */
  async cloneInnerTemplatefileaddressEx(request: CloneInnerTemplatefileaddressRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CloneInnerTemplatefileaddressResponse> {
    Util.validateModel(request);
    return $tea.cast<CloneInnerTemplatefileaddressResponse>(await this.doRequest("1.0", "antchain.ato.inner.templatefileaddress.clone", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CloneInnerTemplatefileaddressResponse({}));
  }

  /**
   * Description: 查询签署区
   * Summary: 查询签署区
   */
  async queryInnerSignfields(request: QueryInnerSignfieldsRequest): Promise<QueryInnerSignfieldsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryInnerSignfieldsEx(request, headers, runtime);
  }

  /**
   * Description: 查询签署区
   * Summary: 查询签署区
   */
  async queryInnerSignfieldsEx(request: QueryInnerSignfieldsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryInnerSignfieldsResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryInnerSignfieldsResponse>(await this.doRequest("1.0", "antchain.ato.inner.signfields.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryInnerSignfieldsResponse({}));
  }

  /**
   * Description: 同步已发布的模板
   * Summary: 同步已发布的模板
   */
  async syncInnerTemplate(request: SyncInnerTemplateRequest): Promise<SyncInnerTemplateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.syncInnerTemplateEx(request, headers, runtime);
  }

  /**
   * Description: 同步已发布的模板
   * Summary: 同步已发布的模板
   */
  async syncInnerTemplateEx(request: SyncInnerTemplateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SyncInnerTemplateResponse> {
    Util.validateModel(request);
    return $tea.cast<SyncInnerTemplateResponse>(await this.doRequest("1.0", "antchain.ato.inner.template.sync", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SyncInnerTemplateResponse({}));
  }

  /**
   * Description: 更新魔法库模板基本信息
   * Summary: 更新魔法库模板基本信息
   */
  async updateInnerTemplate(request: UpdateInnerTemplateRequest): Promise<UpdateInnerTemplateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateInnerTemplateEx(request, headers, runtime);
  }

  /**
   * Description: 更新魔法库模板基本信息
   * Summary: 更新魔法库模板基本信息
   */
  async updateInnerTemplateEx(request: UpdateInnerTemplateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateInnerTemplateResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateInnerTemplateResponse>(await this.doRequest("1.0", "antchain.ato.inner.template.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateInnerTemplateResponse({}));
  }

  /**
   * Description: 通过模板code更新模板的基本信息，比如模板名称等
   * Summary: 查询模板的基本信息
   */
  async queryInnerTemplate(request: QueryInnerTemplateRequest): Promise<QueryInnerTemplateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryInnerTemplateEx(request, headers, runtime);
  }

  /**
   * Description: 通过模板code更新模板的基本信息，比如模板名称等
   * Summary: 查询模板的基本信息
   */
  async queryInnerTemplateEx(request: QueryInnerTemplateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryInnerTemplateResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryInnerTemplateResponse>(await this.doRequest("1.0", "antchain.ato.inner.template.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryInnerTemplateResponse({}));
  }

  /**
   * Description: 获取模板关联的元素列表信息，包括组件信息
   * Summary: 获取模板关联的元素列表信息
   */
  async queryInnerTemplateelementlink(request: QueryInnerTemplateelementlinkRequest): Promise<QueryInnerTemplateelementlinkResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryInnerTemplateelementlinkEx(request, headers, runtime);
  }

  /**
   * Description: 获取模板关联的元素列表信息，包括组件信息
   * Summary: 获取模板关联的元素列表信息
   */
  async queryInnerTemplateelementlinkEx(request: QueryInnerTemplateelementlinkRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryInnerTemplateelementlinkResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryInnerTemplateelementlinkResponse>(await this.doRequest("1.0", "antchain.ato.inner.templateelementlink.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryInnerTemplateelementlinkResponse({}));
  }

  /**
   * Description: 通过模板code、模板版本号获取模板某个版本的详情信息，包括id、文件地址等
   * Summary: 查询模板的版本详情
   */
  async queryInnerTemplateversion(request: QueryInnerTemplateversionRequest): Promise<QueryInnerTemplateversionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryInnerTemplateversionEx(request, headers, runtime);
  }

  /**
   * Description: 通过模板code、模板版本号获取模板某个版本的详情信息，包括id、文件地址等
   * Summary: 查询模板的版本详情
   */
  async queryInnerTemplateversionEx(request: QueryInnerTemplateversionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryInnerTemplateversionResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryInnerTemplateversionResponse>(await this.doRequest("1.0", "antchain.ato.inner.templateversion.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryInnerTemplateversionResponse({}));
  }

  /**
   * Description: 订单消息查询
   * Summary: 订单消息查询
   */
  async pagequeryInnerOrdermsg(request: PagequeryInnerOrdermsgRequest): Promise<PagequeryInnerOrdermsgResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pagequeryInnerOrdermsgEx(request, headers, runtime);
  }

  /**
   * Description: 订单消息查询
   * Summary: 订单消息查询
   */
  async pagequeryInnerOrdermsgEx(request: PagequeryInnerOrdermsgRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PagequeryInnerOrdermsgResponse> {
    Util.validateModel(request);
    return $tea.cast<PagequeryInnerOrdermsgResponse>(await this.doRequest("1.0", "antchain.ato.inner.ordermsg.pagequery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PagequeryInnerOrdermsgResponse({}));
  }

  /**
   * Description: 订单消息重试
   * Summary: 订单消息重试
   */
  async retryInnerOrdermsg(request: RetryInnerOrdermsgRequest): Promise<RetryInnerOrdermsgResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.retryInnerOrdermsgEx(request, headers, runtime);
  }

  /**
   * Description: 订单消息重试
   * Summary: 订单消息重试
   */
  async retryInnerOrdermsgEx(request: RetryInnerOrdermsgRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RetryInnerOrdermsgResponse> {
    Util.validateModel(request);
    return $tea.cast<RetryInnerOrdermsgResponse>(await this.doRequest("1.0", "antchain.ato.inner.ordermsg.retry", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RetryInnerOrdermsgResponse({}));
  }

  /**
   * Description: 法务协议授权-  签署合同代扣前置授权查询接口
   * Summary: 签署合同代扣前置授权查询接口
   */
  async queryInnerAuthorization(request: QueryInnerAuthorizationRequest): Promise<QueryInnerAuthorizationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryInnerAuthorizationEx(request, headers, runtime);
  }

  /**
   * Description: 法务协议授权-  签署合同代扣前置授权查询接口
   * Summary: 签署合同代扣前置授权查询接口
   */
  async queryInnerAuthorizationEx(request: QueryInnerAuthorizationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryInnerAuthorizationResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryInnerAuthorizationResponse>(await this.doRequest("1.0", "antchain.ato.inner.authorization.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryInnerAuthorizationResponse({}));
  }

  /**
   * Description: 法务协议授权 - 签署合同代扣前置同意授权接口
   * Summary: 签署合同代扣前置同意授权接口
   */
  async signInnerAuthorization(request: SignInnerAuthorizationRequest): Promise<SignInnerAuthorizationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.signInnerAuthorizationEx(request, headers, runtime);
  }

  /**
   * Description: 法务协议授权 - 签署合同代扣前置同意授权接口
   * Summary: 签署合同代扣前置同意授权接口
   */
  async signInnerAuthorizationEx(request: SignInnerAuthorizationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SignInnerAuthorizationResponse> {
    Util.validateModel(request);
    return $tea.cast<SignInnerAuthorizationResponse>(await this.doRequest("1.0", "antchain.ato.inner.authorization.sign", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SignInnerAuthorizationResponse({}));
  }

  /**
   * Description: 小程序法务授权 - 商户补充协议状态查询接口
   * Summary: 商户补充协议状态查询接口
   */
  async queryInnerSupplemental(request: QueryInnerSupplementalRequest): Promise<QueryInnerSupplementalResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryInnerSupplementalEx(request, headers, runtime);
  }

  /**
   * Description: 小程序法务授权 - 商户补充协议状态查询接口
   * Summary: 商户补充协议状态查询接口
   */
  async queryInnerSupplementalEx(request: QueryInnerSupplementalRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryInnerSupplementalResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryInnerSupplementalResponse>(await this.doRequest("1.0", "antchain.ato.inner.supplemental.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryInnerSupplementalResponse({}));
  }

  /**
   * Description: 法务协议授权 - 商户补充协议状态同意接口
   * Summary: 商户补充协议状态同意接口
   */
  async signInnerSupplemental(request: SignInnerSupplementalRequest): Promise<SignInnerSupplementalResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.signInnerSupplementalEx(request, headers, runtime);
  }

  /**
   * Description: 法务协议授权 - 商户补充协议状态同意接口
   * Summary: 商户补充协议状态同意接口
   */
  async signInnerSupplementalEx(request: SignInnerSupplementalRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SignInnerSupplementalResponse> {
    Util.validateModel(request);
    return $tea.cast<SignInnerSupplementalResponse>(await this.doRequest("1.0", "antchain.ato.inner.supplemental.sign", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SignInnerSupplementalResponse({}));
  }

  /**
   * Description: 查询代扣计划
   * Summary: 代扣计划查询
   */
  async queryInnerWithholdplan(request: QueryInnerWithholdplanRequest): Promise<QueryInnerWithholdplanResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryInnerWithholdplanEx(request, headers, runtime);
  }

  /**
   * Description: 查询代扣计划
   * Summary: 代扣计划查询
   */
  async queryInnerWithholdplanEx(request: QueryInnerWithholdplanRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryInnerWithholdplanResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryInnerWithholdplanResponse>(await this.doRequest("1.0", "antchain.ato.inner.withholdplan.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryInnerWithholdplanResponse({}));
  }

  /**
   * Description: 创建代扣协议
   * Summary: 创建代扣协议
   */
  async createInnerWithholdsign(request: CreateInnerWithholdsignRequest): Promise<CreateInnerWithholdsignResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createInnerWithholdsignEx(request, headers, runtime);
  }

  /**
   * Description: 创建代扣协议
   * Summary: 创建代扣协议
   */
  async createInnerWithholdsignEx(request: CreateInnerWithholdsignRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateInnerWithholdsignResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateInnerWithholdsignResponse>(await this.doRequest("1.0", "antchain.ato.inner.withholdsign.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateInnerWithholdsignResponse({}));
  }

  /**
   * Description: 代扣签约查询
   * Summary: 代扣签约查询
   */
  async queryInnerWithholdsign(request: QueryInnerWithholdsignRequest): Promise<QueryInnerWithholdsignResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryInnerWithholdsignEx(request, headers, runtime);
  }

  /**
   * Description: 代扣签约查询
   * Summary: 代扣签约查询
   */
  async queryInnerWithholdsignEx(request: QueryInnerWithholdsignRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryInnerWithholdsignResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryInnerWithholdsignResponse>(await this.doRequest("1.0", "antchain.ato.inner.withholdsign.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryInnerWithholdsignResponse({}));
  }

  /**
   * Description: 获取商户进件静态枚举数据
   * Summary: 获取商户进件静态枚举数据
   */
  async getInnerMerchantstaticdata(request: GetInnerMerchantstaticdataRequest): Promise<GetInnerMerchantstaticdataResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getInnerMerchantstaticdataEx(request, headers, runtime);
  }

  /**
   * Description: 获取商户进件静态枚举数据
   * Summary: 获取商户进件静态枚举数据
   */
  async getInnerMerchantstaticdataEx(request: GetInnerMerchantstaticdataRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetInnerMerchantstaticdataResponse> {
    Util.validateModel(request);
    return $tea.cast<GetInnerMerchantstaticdataResponse>(await this.doRequest("1.0", "antchain.ato.inner.merchantstaticdata.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetInnerMerchantstaticdataResponse({}));
  }

  /**
   * Description: 查询已有绑定关系分账方数据
  包括分账方名称，社会统一信用代码
   * Summary: 间连查询已有绑定关系分账方数据
   */
  async getInnerFunddividemerchant(request: GetInnerFunddividemerchantRequest): Promise<GetInnerFunddividemerchantResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getInnerFunddividemerchantEx(request, headers, runtime);
  }

  /**
   * Description: 查询已有绑定关系分账方数据
  包括分账方名称，社会统一信用代码
   * Summary: 间连查询已有绑定关系分账方数据
   */
  async getInnerFunddividemerchantEx(request: GetInnerFunddividemerchantRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetInnerFunddividemerchantResponse> {
    Util.validateModel(request);
    return $tea.cast<GetInnerFunddividemerchantResponse>(await this.doRequest("1.0", "antchain.ato.inner.funddividemerchant.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetInnerFunddividemerchantResponse({}));
  }

  /**
   * Description: 查询商户和保司协议签署信息
   * Summary: 查询商户和保司协议签署信息
   */
  async queryInnerInsuresign(request: QueryInnerInsuresignRequest): Promise<QueryInnerInsuresignResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryInnerInsuresignEx(request, headers, runtime);
  }

  /**
   * Description: 查询商户和保司协议签署信息
   * Summary: 查询商户和保司协议签署信息
   */
  async queryInnerInsuresignEx(request: QueryInnerInsuresignRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryInnerInsuresignResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryInnerInsuresignResponse>(await this.doRequest("1.0", "antchain.ato.inner.insuresign.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryInnerInsuresignResponse({}));
  }

  /**
   * Description: 生成商户和保司签约链接
   * Summary: 生成商户和保司签约链接
   */
  async createInnerInsuresign(request: CreateInnerInsuresignRequest): Promise<CreateInnerInsuresignResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createInnerInsuresignEx(request, headers, runtime);
  }

  /**
   * Description: 生成商户和保司签约链接
   * Summary: 生成商户和保司签约链接
   */
  async createInnerInsuresignEx(request: CreateInnerInsuresignRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateInnerInsuresignResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateInnerInsuresignResponse>(await this.doRequest("1.0", "antchain.ato.inner.insuresign.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateInnerInsuresignResponse({}));
  }

  /**
   * Description: 查询保单信息
   * Summary: 查询保单信息
   */
  async pagequeryInnerInsureorder(request: PagequeryInnerInsureorderRequest): Promise<PagequeryInnerInsureorderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pagequeryInnerInsureorderEx(request, headers, runtime);
  }

  /**
   * Description: 查询保单信息
   * Summary: 查询保单信息
   */
  async pagequeryInnerInsureorderEx(request: PagequeryInnerInsureorderRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PagequeryInnerInsureorderResponse> {
    Util.validateModel(request);
    return $tea.cast<PagequeryInnerInsureorderResponse>(await this.doRequest("1.0", "antchain.ato.inner.insureorder.pagequery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PagequeryInnerInsureorderResponse({}));
  }

  /**
   * Description: 商户控制台商品列表
   * Summary: 商品列表
   */
  async pagequeryInnerProduct(request: PagequeryInnerProductRequest): Promise<PagequeryInnerProductResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pagequeryInnerProductEx(request, headers, runtime);
  }

  /**
   * Description: 商户控制台商品列表
   * Summary: 商品列表
   */
  async pagequeryInnerProductEx(request: PagequeryInnerProductRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PagequeryInnerProductResponse> {
    Util.validateModel(request);
    return $tea.cast<PagequeryInnerProductResponse>(await this.doRequest("1.0", "antchain.ato.inner.product.pagequery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PagequeryInnerProductResponse({}));
  }

  /**
   * Description: 商户控制台首页通知栏
   * Summary: 首页通知栏
   */
  async getInnerHomepagenotice(request: GetInnerHomepagenoticeRequest): Promise<GetInnerHomepagenoticeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getInnerHomepagenoticeEx(request, headers, runtime);
  }

  /**
   * Description: 商户控制台首页通知栏
   * Summary: 首页通知栏
   */
  async getInnerHomepagenoticeEx(request: GetInnerHomepagenoticeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetInnerHomepagenoticeResponse> {
    Util.validateModel(request);
    return $tea.cast<GetInnerHomepagenoticeResponse>(await this.doRequest("1.0", "antchain.ato.inner.homepagenotice.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetInnerHomepagenoticeResponse({}));
  }

  /**
   * Description: 商户控制台通知列表
   * Summary: 通知列表
   */
  async pagequeryInnerNotice(request: PagequeryInnerNoticeRequest): Promise<PagequeryInnerNoticeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pagequeryInnerNoticeEx(request, headers, runtime);
  }

  /**
   * Description: 商户控制台通知列表
   * Summary: 通知列表
   */
  async pagequeryInnerNoticeEx(request: PagequeryInnerNoticeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PagequeryInnerNoticeResponse> {
    Util.validateModel(request);
    return $tea.cast<PagequeryInnerNoticeResponse>(await this.doRequest("1.0", "antchain.ato.inner.notice.pagequery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PagequeryInnerNoticeResponse({}));
  }

  /**
   * Description: 商户控制台通知详情
   * Summary: 通知详情
   */
  async detailInnerNotice(request: DetailInnerNoticeRequest): Promise<DetailInnerNoticeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.detailInnerNoticeEx(request, headers, runtime);
  }

  /**
   * Description: 商户控制台通知详情
   * Summary: 通知详情
   */
  async detailInnerNoticeEx(request: DetailInnerNoticeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DetailInnerNoticeResponse> {
    Util.validateModel(request);
    return $tea.cast<DetailInnerNoticeResponse>(await this.doRequest("1.0", "antchain.ato.inner.notice.detail", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DetailInnerNoticeResponse({}));
  }

  /**
   * Description: 商户控制台订单列表
   * Summary: 订单列表
   */
  async pagequeryInnerOrder(request: PagequeryInnerOrderRequest): Promise<PagequeryInnerOrderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pagequeryInnerOrderEx(request, headers, runtime);
  }

  /**
   * Description: 商户控制台订单列表
   * Summary: 订单列表
   */
  async pagequeryInnerOrderEx(request: PagequeryInnerOrderRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PagequeryInnerOrderResponse> {
    Util.validateModel(request);
    return $tea.cast<PagequeryInnerOrderResponse>(await this.doRequest("1.0", "antchain.ato.inner.order.pagequery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PagequeryInnerOrderResponse({}));
  }

  /**
   * Description: 订单详情
   * Summary: 订单详情
   */
  async detailInnerOrder(request: DetailInnerOrderRequest): Promise<DetailInnerOrderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.detailInnerOrderEx(request, headers, runtime);
  }

  /**
   * Description: 订单详情
   * Summary: 订单详情
   */
  async detailInnerOrderEx(request: DetailInnerOrderRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DetailInnerOrderResponse> {
    Util.validateModel(request);
    return $tea.cast<DetailInnerOrderResponse>(await this.doRequest("1.0", "antchain.ato.inner.order.detail", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DetailInnerOrderResponse({}));
  }

  /**
   * Description: 合同模板实例化渲染，文本域赋值
   * Summary: 合同模板实例化渲染
   */
  async renderInnerTemplateinstance(request: RenderInnerTemplateinstanceRequest): Promise<RenderInnerTemplateinstanceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.renderInnerTemplateinstanceEx(request, headers, runtime);
  }

  /**
   * Description: 合同模板实例化渲染，文本域赋值
   * Summary: 合同模板实例化渲染
   */
  async renderInnerTemplateinstanceEx(request: RenderInnerTemplateinstanceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RenderInnerTemplateinstanceResponse> {
    Util.validateModel(request);
    return $tea.cast<RenderInnerTemplateinstanceResponse>(await this.doRequest("1.0", "antchain.ato.inner.templateinstance.render", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RenderInnerTemplateinstanceResponse({}));
  }

  /**
   * Description: 批量查询营销分
   * Summary: 批量查询营销分
   */
  async batchqueryInnerMarketingscore(request: BatchqueryInnerMarketingscoreRequest): Promise<BatchqueryInnerMarketingscoreResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchqueryInnerMarketingscoreEx(request, headers, runtime);
  }

  /**
   * Description: 批量查询营销分
   * Summary: 批量查询营销分
   */
  async batchqueryInnerMarketingscoreEx(request: BatchqueryInnerMarketingscoreRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchqueryInnerMarketingscoreResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchqueryInnerMarketingscoreResponse>(await this.doRequest("1.0", "antchain.ato.inner.marketingscore.batchquery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchqueryInnerMarketingscoreResponse({}));
  }

  /**
   * Description: 创建客服信息
   * Summary: 创建客服信息
   */
  async createInnerCustomerservice(request: CreateInnerCustomerserviceRequest): Promise<CreateInnerCustomerserviceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createInnerCustomerserviceEx(request, headers, runtime);
  }

  /**
   * Description: 创建客服信息
   * Summary: 创建客服信息
   */
  async createInnerCustomerserviceEx(request: CreateInnerCustomerserviceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateInnerCustomerserviceResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateInnerCustomerserviceResponse>(await this.doRequest("1.0", "antchain.ato.inner.customerservice.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateInnerCustomerserviceResponse({}));
  }

  /**
   * Description: 更新客服信息
   * Summary: 更新客服信息
   */
  async updateInnerCustomerservice(request: UpdateInnerCustomerserviceRequest): Promise<UpdateInnerCustomerserviceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateInnerCustomerserviceEx(request, headers, runtime);
  }

  /**
   * Description: 更新客服信息
   * Summary: 更新客服信息
   */
  async updateInnerCustomerserviceEx(request: UpdateInnerCustomerserviceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateInnerCustomerserviceResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateInnerCustomerserviceResponse>(await this.doRequest("1.0", "antchain.ato.inner.customerservice.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateInnerCustomerserviceResponse({}));
  }

  /**
   * Description: 分页查询客服信息
   * Summary:  分页查询客服信息
   */
  async pagequeryInnerCustomerservice(request: PagequeryInnerCustomerserviceRequest): Promise<PagequeryInnerCustomerserviceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pagequeryInnerCustomerserviceEx(request, headers, runtime);
  }

  /**
   * Description: 分页查询客服信息
   * Summary:  分页查询客服信息
   */
  async pagequeryInnerCustomerserviceEx(request: PagequeryInnerCustomerserviceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PagequeryInnerCustomerserviceResponse> {
    Util.validateModel(request);
    return $tea.cast<PagequeryInnerCustomerserviceResponse>(await this.doRequest("1.0", "antchain.ato.inner.customerservice.pagequery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PagequeryInnerCustomerserviceResponse({}));
  }

  /**
   * Description: 获取客服信息详情
   * Summary: 获取客服信息详情
   */
  async detailInnerCustomerservice(request: DetailInnerCustomerserviceRequest): Promise<DetailInnerCustomerserviceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.detailInnerCustomerserviceEx(request, headers, runtime);
  }

  /**
   * Description: 获取客服信息详情
   * Summary: 获取客服信息详情
   */
  async detailInnerCustomerserviceEx(request: DetailInnerCustomerserviceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DetailInnerCustomerserviceResponse> {
    Util.validateModel(request);
    return $tea.cast<DetailInnerCustomerserviceResponse>(await this.doRequest("1.0", "antchain.ato.inner.customerservice.detail", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DetailInnerCustomerserviceResponse({}));
  }

  /**
   * Description: 获取代理商客服信息模版
   * Summary: 获取代理商客服信息模版
   */
  async getInnerCustomerservicetemplate(request: GetInnerCustomerservicetemplateRequest): Promise<GetInnerCustomerservicetemplateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getInnerCustomerservicetemplateEx(request, headers, runtime);
  }

  /**
   * Description: 获取代理商客服信息模版
   * Summary: 获取代理商客服信息模版
   */
  async getInnerCustomerservicetemplateEx(request: GetInnerCustomerservicetemplateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetInnerCustomerservicetemplateResponse> {
    Util.validateModel(request);
    return $tea.cast<GetInnerCustomerservicetemplateResponse>(await this.doRequest("1.0", "antchain.ato.inner.customerservicetemplate.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetInnerCustomerservicetemplateResponse({}));
  }

  /**
   * Description: 获取模板实例化后的模板信息，包括pdf下载链接
   * Summary: 获取模板实例化后的模板信息
   */
  async queryInnerTemplateinstance(request: QueryInnerTemplateinstanceRequest): Promise<QueryInnerTemplateinstanceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryInnerTemplateinstanceEx(request, headers, runtime);
  }

  /**
   * Description: 获取模板实例化后的模板信息，包括pdf下载链接
   * Summary: 获取模板实例化后的模板信息
   */
  async queryInnerTemplateinstanceEx(request: QueryInnerTemplateinstanceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryInnerTemplateinstanceResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryInnerTemplateinstanceResponse>(await this.doRequest("1.0", "antchain.ato.inner.templateinstance.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryInnerTemplateinstanceResponse({}));
  }

  /**
   * Description: 查询租户类目信息详情
   * Summary: 查询租户类目信息详情
   */
  async queryInnerTenantindirectmainclass(request: QueryInnerTenantindirectmainclassRequest): Promise<QueryInnerTenantindirectmainclassResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryInnerTenantindirectmainclassEx(request, headers, runtime);
  }

  /**
   * Description: 查询租户类目信息详情
   * Summary: 查询租户类目信息详情
   */
  async queryInnerTenantindirectmainclassEx(request: QueryInnerTenantindirectmainclassRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryInnerTenantindirectmainclassResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryInnerTenantindirectmainclassResponse>(await this.doRequest("1.0", "antchain.ato.inner.tenantindirectmainclass.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryInnerTenantindirectmainclassResponse({}));
  }

  /**
   * Description: 修改租户间联类目类目信息
   * Summary: 修改租户间联类目类目信息
   */
  async updateInnerTenantindirectmainclass(request: UpdateInnerTenantindirectmainclassRequest): Promise<UpdateInnerTenantindirectmainclassResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateInnerTenantindirectmainclassEx(request, headers, runtime);
  }

  /**
   * Description: 修改租户间联类目类目信息
   * Summary: 修改租户间联类目类目信息
   */
  async updateInnerTenantindirectmainclassEx(request: UpdateInnerTenantindirectmainclassRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateInnerTenantindirectmainclassResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateInnerTenantindirectmainclassResponse>(await this.doRequest("1.0", "antchain.ato.inner.tenantindirectmainclass.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateInnerTenantindirectmainclassResponse({}));
  }

  /**
   * Description: 模板同步上线时强管控字段校验未通过提交后台审核
   * Summary: 模板同步上线审核提交
   */
  async submitInnerTemplatesyncreview(request: SubmitInnerTemplatesyncreviewRequest): Promise<SubmitInnerTemplatesyncreviewResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.submitInnerTemplatesyncreviewEx(request, headers, runtime);
  }

  /**
   * Description: 模板同步上线时强管控字段校验未通过提交后台审核
   * Summary: 模板同步上线审核提交
   */
  async submitInnerTemplatesyncreviewEx(request: SubmitInnerTemplatesyncreviewRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SubmitInnerTemplatesyncreviewResponse> {
    Util.validateModel(request);
    return $tea.cast<SubmitInnerTemplatesyncreviewResponse>(await this.doRequest("1.0", "antchain.ato.inner.templatesyncreview.submit", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SubmitInnerTemplatesyncreviewResponse({}));
  }

  /**
   * Description: 待办事件处理
   * Summary: 待办事件处理
   */
  async submitInnerPendingevent(request: SubmitInnerPendingeventRequest): Promise<SubmitInnerPendingeventResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.submitInnerPendingeventEx(request, headers, runtime);
  }

  /**
   * Description: 待办事件处理
   * Summary: 待办事件处理
   */
  async submitInnerPendingeventEx(request: SubmitInnerPendingeventRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SubmitInnerPendingeventResponse> {
    Util.validateModel(request);
    return $tea.cast<SubmitInnerPendingeventResponse>(await this.doRequest("1.0", "antchain.ato.inner.pendingevent.submit", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SubmitInnerPendingeventResponse({}));
  }

  /**
   * Description: 待办事件详情查询
   * Summary: 待办事件详情查询
   */
  async detailInnerPendingevent(request: DetailInnerPendingeventRequest): Promise<DetailInnerPendingeventResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.detailInnerPendingeventEx(request, headers, runtime);
  }

  /**
   * Description: 待办事件详情查询
   * Summary: 待办事件详情查询
   */
  async detailInnerPendingeventEx(request: DetailInnerPendingeventRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DetailInnerPendingeventResponse> {
    Util.validateModel(request);
    return $tea.cast<DetailInnerPendingeventResponse>(await this.doRequest("1.0", "antchain.ato.inner.pendingevent.detail", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DetailInnerPendingeventResponse({}));
  }

  /**
   * Description: 合同模板制作根据已有模板新增合同模板文件
   * Summary: 根据已有模板新增合同模板文件
   */
  async addInnerTemplate(request: AddInnerTemplateRequest): Promise<AddInnerTemplateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.addInnerTemplateEx(request, headers, runtime);
  }

  /**
   * Description: 合同模板制作根据已有模板新增合同模板文件
   * Summary: 根据已有模板新增合同模板文件
   */
  async addInnerTemplateEx(request: AddInnerTemplateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AddInnerTemplateResponse> {
    Util.validateModel(request);
    return $tea.cast<AddInnerTemplateResponse>(await this.doRequest("1.0", "antchain.ato.inner.template.add", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AddInnerTemplateResponse({}));
  }

  /**
   * Description: 查询待办列表
   * Summary: 查询待办列表
   */
  async pagequeryInnerPendingevent(request: PagequeryInnerPendingeventRequest): Promise<PagequeryInnerPendingeventResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pagequeryInnerPendingeventEx(request, headers, runtime);
  }

  /**
   * Description: 查询待办列表
   * Summary: 查询待办列表
   */
  async pagequeryInnerPendingeventEx(request: PagequeryInnerPendingeventRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PagequeryInnerPendingeventResponse> {
    Util.validateModel(request);
    return $tea.cast<PagequeryInnerPendingeventResponse>(await this.doRequest("1.0", "antchain.ato.inner.pendingevent.pagequery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PagequeryInnerPendingeventResponse({}));
  }

  /**
   * Description: 一键投保
   * Summary: 投保
   */
  async createInsure(request: CreateInsureRequest): Promise<CreateInsureResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createInsureEx(request, headers, runtime);
  }

  /**
   * Description: 一键投保
   * Summary: 投保
   */
  async createInsureEx(request: CreateInsureRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateInsureResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateInsureResponse>(await this.doRequest("1.0", "antchain.ato.insure.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateInsureResponse({}));
  }

  /**
   * Description: 保单查询
   * Summary: 保单查询
   */
  async queryInsure(request: QueryInsureRequest): Promise<QueryInsureResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryInsureEx(request, headers, runtime);
  }

  /**
   * Description: 保单查询
   * Summary: 保单查询
   */
  async queryInsureEx(request: QueryInsureRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryInsureResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryInsureResponse>(await this.doRequest("1.0", "antchain.ato.insure.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryInsureResponse({}));
  }

  /**
   * Description: 保险代扣重试
   * Summary: 保险代扣重试
   */
  async retryInsurePay(request: RetryInsurePayRequest): Promise<RetryInsurePayResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.retryInsurePayEx(request, headers, runtime);
  }

  /**
   * Description: 保险代扣重试
   * Summary: 保险代扣重试
   */
  async retryInsurePayEx(request: RetryInsurePayRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RetryInsurePayResponse> {
    Util.validateModel(request);
    return $tea.cast<RetryInsurePayResponse>(await this.doRequest("1.0", "antchain.ato.insure.pay.retry", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RetryInsurePayResponse({}));
  }

  /**
   * Description: 商户入驻
   * Summary: 商户入驻
   */
  async registerMerchantexpandMerchant(request: RegisterMerchantexpandMerchantRequest): Promise<RegisterMerchantexpandMerchantResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.registerMerchantexpandMerchantEx(request, headers, runtime);
  }

  /**
   * Description: 商户入驻
   * Summary: 商户入驻
   */
  async registerMerchantexpandMerchantEx(request: RegisterMerchantexpandMerchantRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RegisterMerchantexpandMerchantResponse> {
    Util.validateModel(request);
    return $tea.cast<RegisterMerchantexpandMerchantResponse>(await this.doRequest("1.0", "antchain.ato.merchantexpand.merchant.register", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RegisterMerchantexpandMerchantResponse({}));
  }

  /**
   * Description: 获取临时上传文件链接
   * Summary: 获取临时上传文件链接
   */
  async uploadMerchantexpandFile(request: UploadMerchantexpandFileRequest): Promise<UploadMerchantexpandFileResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.uploadMerchantexpandFileEx(request, headers, runtime);
  }

  /**
   * Description: 获取临时上传文件链接
   * Summary: 获取临时上传文件链接
   */
  async uploadMerchantexpandFileEx(request: UploadMerchantexpandFileRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UploadMerchantexpandFileResponse> {
    Util.validateModel(request);
    return $tea.cast<UploadMerchantexpandFileResponse>(await this.doRequest("1.0", "antchain.ato.merchantexpand.file.upload", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UploadMerchantexpandFileResponse({}));
  }

  /**
   * Description: 商户入驻查询
   * Summary: 商户入驻查询
   */
  async queryMerchantexpandMerchant(request: QueryMerchantexpandMerchantRequest): Promise<QueryMerchantexpandMerchantResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryMerchantexpandMerchantEx(request, headers, runtime);
  }

  /**
   * Description: 商户入驻查询
   * Summary: 商户入驻查询
   */
  async queryMerchantexpandMerchantEx(request: QueryMerchantexpandMerchantRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryMerchantexpandMerchantResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryMerchantexpandMerchantResponse>(await this.doRequest("1.0", "antchain.ato.merchantexpand.merchant.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryMerchantexpandMerchantResponse({}));
  }

  /**
   * Description: 商家信息修改
   * Summary: 商家信息修改
   */
  async updateMerchantexpandMerchant(request: UpdateMerchantexpandMerchantRequest): Promise<UpdateMerchantexpandMerchantResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateMerchantexpandMerchantEx(request, headers, runtime);
  }

  /**
   * Description: 商家信息修改
   * Summary: 商家信息修改
   */
  async updateMerchantexpandMerchantEx(request: UpdateMerchantexpandMerchantRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateMerchantexpandMerchantResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateMerchantexpandMerchantResponse>(await this.doRequest("1.0", "antchain.ato.merchantexpand.merchant.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateMerchantexpandMerchantResponse({}));
  }

  /**
   * Description: 添加分账绑定关系
   * Summary: 添加分账绑定关系
   */
  async addMerchantexpandDividerelation(request: AddMerchantexpandDividerelationRequest): Promise<AddMerchantexpandDividerelationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.addMerchantexpandDividerelationEx(request, headers, runtime);
  }

  /**
   * Description: 添加分账绑定关系
   * Summary: 添加分账绑定关系
   */
  async addMerchantexpandDividerelationEx(request: AddMerchantexpandDividerelationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AddMerchantexpandDividerelationResponse> {
    Util.validateModel(request);
    return $tea.cast<AddMerchantexpandDividerelationResponse>(await this.doRequest("1.0", "antchain.ato.merchantexpand.dividerelation.add", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AddMerchantexpandDividerelationResponse({}));
  }

  /**
   * Description: 分账绑定关系查询
   * Summary: 分账绑定关系查询
   */
  async queryMerchantexpandDividerelation(request: QueryMerchantexpandDividerelationRequest): Promise<QueryMerchantexpandDividerelationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryMerchantexpandDividerelationEx(request, headers, runtime);
  }

  /**
   * Description: 分账绑定关系查询
   * Summary: 分账绑定关系查询
   */
  async queryMerchantexpandDividerelationEx(request: QueryMerchantexpandDividerelationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryMerchantexpandDividerelationResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryMerchantexpandDividerelationResponse>(await this.doRequest("1.0", "antchain.ato.merchantexpand.dividerelation.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryMerchantexpandDividerelationResponse({}));
  }

  /**
   * Description: 可信身份认证，创建认证
   * Summary: 创建认证
   */
  async createRealpersonFacevrf(request: CreateRealpersonFacevrfRequest): Promise<CreateRealpersonFacevrfResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createRealpersonFacevrfEx(request, headers, runtime);
  }

  /**
   * Description: 可信身份认证，创建认证
   * Summary: 创建认证
   */
  async createRealpersonFacevrfEx(request: CreateRealpersonFacevrfRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateRealpersonFacevrfResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateRealpersonFacevrfResponse>(await this.doRequest("1.0", "antchain.ato.realperson.facevrf.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateRealpersonFacevrfResponse({}));
  }

  /**
   * Description: 查询认证的结果和相关信息
   * Summary: 查询认证结果
   */
  async queryRealpersonFacevrf(request: QueryRealpersonFacevrfRequest): Promise<QueryRealpersonFacevrfResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryRealpersonFacevrfEx(request, headers, runtime);
  }

  /**
   * Description: 查询认证的结果和相关信息
   * Summary: 查询认证结果
   */
  async queryRealpersonFacevrfEx(request: QueryRealpersonFacevrfRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryRealpersonFacevrfResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryRealpersonFacevrfResponse>(await this.doRequest("1.0", "antchain.ato.realperson.facevrf.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryRealpersonFacevrfResponse({}));
  }

  /**
   * Description: 发起风控分析，获取风险分
   * Summary: 发起风控分析，获取风险分
   */
  async queryRisk(request: QueryRiskRequest): Promise<QueryRiskResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryRiskEx(request, headers, runtime);
  }

  /**
   * Description: 发起风控分析，获取风险分
   * Summary: 发起风控分析，获取风险分
   */
  async queryRiskEx(request: QueryRiskRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryRiskResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryRiskResponse>(await this.doRequest("1.0", "antchain.ato.risk.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryRiskResponse({}));
  }

  /**
   * Description: 云 api 发起风控分析，获取风险评估
   * Summary: 云 api 发起风控分析，获取风险评估
   */
  async queryRiskGo(request: QueryRiskGoRequest): Promise<QueryRiskGoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryRiskGoEx(request, headers, runtime);
  }

  /**
   * Description: 云 api 发起风控分析，获取风险评估
   * Summary: 云 api 发起风控分析，获取风险评估
   */
  async queryRiskGoEx(request: QueryRiskGoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryRiskGoResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryRiskGoResponse>(await this.doRequest("1.0", "antchain.ato.risk.go.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryRiskGoResponse({}));
  }

  /**
   * Description: 小程序云调用，上报计量信息
   * Summary: 小程序云调用，上报计量信息
   */
  async uploadInnerRiskcall(request: UploadInnerRiskcallRequest): Promise<UploadInnerRiskcallResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.uploadInnerRiskcallEx(request, headers, runtime);
  }

  /**
   * Description: 小程序云调用，上报计量信息
   * Summary: 小程序云调用，上报计量信息
   */
  async uploadInnerRiskcallEx(request: UploadInnerRiskcallRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UploadInnerRiskcallResponse> {
    Util.validateModel(request);
    return $tea.cast<UploadInnerRiskcallResponse>(await this.doRequest("1.0", "antchain.ato.inner.riskcall.upload", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UploadInnerRiskcallResponse({}));
  }

  /**
   * Description: 电子合同签署的合同模板查询服务
   * Summary: 电子合同签署的合同模板查询服务
   */
  async allSignTemplate(request: AllSignTemplateRequest): Promise<AllSignTemplateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.allSignTemplateEx(request, headers, runtime);
  }

  /**
   * Description: 电子合同签署的合同模板查询服务
   * Summary: 电子合同签署的合同模板查询服务
   */
  async allSignTemplateEx(request: AllSignTemplateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AllSignTemplateResponse> {
    Util.validateModel(request);
    return $tea.cast<AllSignTemplateResponse>(await this.doRequest("1.0", "antchain.ato.sign.template.all", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AllSignTemplateResponse({}));
  }

  /**
   * Description: 提交电子合同的签署流程(后置签署模式)
   * Summary: 提交电子合同的签署流程（后置签署模式）
   */
  async submitSignFlow(request: SubmitSignFlowRequest): Promise<SubmitSignFlowResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.submitSignFlowEx(request, headers, runtime);
  }

  /**
   * Description: 提交电子合同的签署流程(后置签署模式)
   * Summary: 提交电子合同的签署流程（后置签署模式）
   */
  async submitSignFlowEx(request: SubmitSignFlowRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SubmitSignFlowResponse> {
    Util.validateModel(request);
    return $tea.cast<SubmitSignFlowResponse>(await this.doRequest("1.0", "antchain.ato.sign.flow.submit", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SubmitSignFlowResponse({}));
  }

  /**
   * Description: 查询签署流程详情
   * Summary: 查询签署流程详情
   */
  async getSignFlow(request: GetSignFlowRequest): Promise<GetSignFlowResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getSignFlowEx(request, headers, runtime);
  }

  /**
   * Description: 查询签署流程详情
   * Summary: 查询签署流程详情
   */
  async getSignFlowEx(request: GetSignFlowRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetSignFlowResponse> {
    Util.validateModel(request);
    return $tea.cast<GetSignFlowResponse>(await this.doRequest("1.0", "antchain.ato.sign.flow.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetSignFlowResponse({}));
  }

  /**
   * Description: 电子合同签署模块，机构调用这个接口进行签署的授权落签
   * Summary: 电子合同签署流程落签操作
   */
  async authSignFlow(request: AuthSignFlowRequest): Promise<AuthSignFlowResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.authSignFlowEx(request, headers, runtime);
  }

  /**
   * Description: 电子合同签署模块，机构调用这个接口进行签署的授权落签
   * Summary: 电子合同签署流程落签操作
   */
  async authSignFlowEx(request: AuthSignFlowRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AuthSignFlowResponse> {
    Util.validateModel(request);
    return $tea.cast<AuthSignFlowResponse>(await this.doRequest("1.0", "antchain.ato.sign.flow.auth", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AuthSignFlowResponse({}));
  }

  /**
   * Description: 提交前置签署的电子合同签署流程（前置签署模式）
   * Summary: 提交签署的电子合同签署流程（前置签署）
   */
  async submitFrontSign(request: SubmitFrontSignRequest): Promise<SubmitFrontSignResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.submitFrontSignEx(request, headers, runtime);
  }

  /**
   * Description: 提交前置签署的电子合同签署流程（前置签署模式）
   * Summary: 提交签署的电子合同签署流程（前置签署）
   */
  async submitFrontSignEx(request: SubmitFrontSignRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SubmitFrontSignResponse> {
    Util.validateModel(request);
    return $tea.cast<SubmitFrontSignResponse>(await this.doRequest("1.0", "antchain.ato.front.sign.submit", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SubmitFrontSignResponse({}));
  }

  /**
   * Description: 调用该接口，追加上传无法在原有链路上签署的合同
   * Summary: 商户调用合同追加接口
   */
  async uploadSignFlow(request: UploadSignFlowRequest): Promise<UploadSignFlowResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.uploadSignFlowEx(request, headers, runtime);
  }

  /**
   * Description: 调用该接口，追加上传无法在原有链路上签署的合同
   * Summary: 商户调用合同追加接口
   */
  async uploadSignFlowEx(request: UploadSignFlowRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UploadSignFlowResponse> {
    if (!Util.isUnset(request.fileObject)) {
      let uploadReq = new CreateAntcloudGatewayxFileUploadRequest({
        authToken: request.authToken,
        apiCode: "antchain.ato.sign.flow.upload",
        fileName: request.fileObjectName,
      });
      let uploadResp = await this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
      if (!AntchainUtil.isSuccess(uploadResp.resultCode, "ok")) {
        let uploadSignFlowResponse = new UploadSignFlowResponse({
          reqMsgId: uploadResp.reqMsgId,
          resultCode: uploadResp.resultCode,
          resultMsg: uploadResp.resultMsg,
        });
        return uploadSignFlowResponse;
      }

      let uploadHeaders = AntchainUtil.parseUploadHeaders(uploadResp.uploadHeaders);
      await AntchainUtil.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
      request.fileId = uploadResp.fileId;
      request.fileObject = null;
    }

    Util.validateModel(request);
    return $tea.cast<UploadSignFlowResponse>(await this.doRequest("1.0", "antchain.ato.sign.flow.upload", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UploadSignFlowResponse({}));
  }

  /**
   * Description: 商户合同模板上传接口
   * Summary: 商户合同模板上传
   */
  async uploadSignTemplate(request: UploadSignTemplateRequest): Promise<UploadSignTemplateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.uploadSignTemplateEx(request, headers, runtime);
  }

  /**
   * Description: 商户合同模板上传接口
   * Summary: 商户合同模板上传
   */
  async uploadSignTemplateEx(request: UploadSignTemplateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UploadSignTemplateResponse> {
    if (!Util.isUnset(request.fileObject)) {
      let uploadReq = new CreateAntcloudGatewayxFileUploadRequest({
        authToken: request.authToken,
        apiCode: "antchain.ato.sign.template.upload",
        fileName: request.fileObjectName,
      });
      let uploadResp = await this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
      if (!AntchainUtil.isSuccess(uploadResp.resultCode, "ok")) {
        let uploadSignTemplateResponse = new UploadSignTemplateResponse({
          reqMsgId: uploadResp.reqMsgId,
          resultCode: uploadResp.resultCode,
          resultMsg: uploadResp.resultMsg,
        });
        return uploadSignTemplateResponse;
      }

      let uploadHeaders = AntchainUtil.parseUploadHeaders(uploadResp.uploadHeaders);
      await AntchainUtil.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
      request.fileId = uploadResp.fileId;
      request.fileObject = null;
    }

    Util.validateModel(request);
    return $tea.cast<UploadSignTemplateResponse>(await this.doRequest("1.0", "antchain.ato.sign.template.upload", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UploadSignTemplateResponse({}));
  }

  /**
   * Description: 商户资产凭证上传，可以是文本或文件
   * Summary: 商户资产凭证上传
   */
  async uploadSignCredit(request: UploadSignCreditRequest): Promise<UploadSignCreditResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.uploadSignCreditEx(request, headers, runtime);
  }

  /**
   * Description: 商户资产凭证上传，可以是文本或文件
   * Summary: 商户资产凭证上传
   */
  async uploadSignCreditEx(request: UploadSignCreditRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UploadSignCreditResponse> {
    Util.validateModel(request);
    return $tea.cast<UploadSignCreditResponse>(await this.doRequest("1.0", "antchain.ato.sign.credit.upload", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UploadSignCreditResponse({}));
  }

  /**
   * Description: 商户资产凭证查询，需要提供订单号或资产包号
   * Summary: 商户资产凭证查询
   */
  async querySignCredit(request: QuerySignCreditRequest): Promise<QuerySignCreditResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.querySignCreditEx(request, headers, runtime);
  }

  /**
   * Description: 商户资产凭证查询，需要提供订单号或资产包号
   * Summary: 商户资产凭证查询
   */
  async querySignCreditEx(request: QuerySignCreditRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QuerySignCreditResponse> {
    Util.validateModel(request);
    return $tea.cast<QuerySignCreditResponse>(await this.doRequest("1.0", "antchain.ato.sign.credit.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QuerySignCreditResponse({}));
  }

  /**
   * Description: 撤销签署流程
   * Summary: 撤销签署流程
   */
  async cancelSignFlow(request: CancelSignFlowRequest): Promise<CancelSignFlowResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.cancelSignFlowEx(request, headers, runtime);
  }

  /**
   * Description: 撤销签署流程
   * Summary: 撤销签署流程
   */
  async cancelSignFlowEx(request: CancelSignFlowRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CancelSignFlowResponse> {
    Util.validateModel(request);
    return $tea.cast<CancelSignFlowResponse>(await this.doRequest("1.0", "antchain.ato.sign.flow.cancel", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CancelSignFlowResponse({}));
  }

  /**
   * Description: 获取合同存证证明
   * Summary: 获取合同存证证明
   */
  async getSignContractcertificate(request: GetSignContractcertificateRequest): Promise<GetSignContractcertificateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getSignContractcertificateEx(request, headers, runtime);
  }

  /**
   * Description: 获取合同存证证明
   * Summary: 获取合同存证证明
   */
  async getSignContractcertificateEx(request: GetSignContractcertificateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetSignContractcertificateResponse> {
    Util.validateModel(request);
    return $tea.cast<GetSignContractcertificateResponse>(await this.doRequest("1.0", "antchain.ato.sign.contractcertificate.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetSignContractcertificateResponse({}));
  }

  /**
   * Description: 对账saas交易信息同步接口
   * Summary: 对账saas交易信息同步接口
   */
  async syncTrade(request: SyncTradeRequest): Promise<SyncTradeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.syncTradeEx(request, headers, runtime);
  }

  /**
   * Description: 对账saas交易信息同步接口
   * Summary: 对账saas交易信息同步接口
   */
  async syncTradeEx(request: SyncTradeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SyncTradeResponse> {
    Util.validateModel(request);
    return $tea.cast<SyncTradeResponse>(await this.doRequest("1.0", "antchain.ato.trade.sync", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SyncTradeResponse({}));
  }

  /**
   * Description: 获取详情
   * Summary: 获取详情
   */
  async getTrade(request: GetTradeRequest): Promise<GetTradeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getTradeEx(request, headers, runtime);
  }

  /**
   * Description: 获取详情
   * Summary: 获取详情
   */
  async getTradeEx(request: GetTradeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetTradeResponse> {
    Util.validateModel(request);
    return $tea.cast<GetTradeResponse>(await this.doRequest("1.0", "antchain.ato.trade.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetTradeResponse({}));
  }

  /**
   * Description: 订单创建，前置签署
   * Summary: 前置签署订单创建
   */
  async syncFrontTrade(request: SyncFrontTradeRequest): Promise<SyncFrontTradeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.syncFrontTradeEx(request, headers, runtime);
  }

  /**
   * Description: 订单创建，前置签署
   * Summary: 前置签署订单创建
   */
  async syncFrontTradeEx(request: SyncFrontTradeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SyncFrontTradeResponse> {
    Util.validateModel(request);
    return $tea.cast<SyncFrontTradeResponse>(await this.doRequest("1.0", "antchain.ato.front.trade.sync", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SyncFrontTradeResponse({}));
  }

  /**
   * Description: 融资放款申请接口
   * Summary: 融资放款申请接口
   */
  async syncTradeFinanceloanapply(request: SyncTradeFinanceloanapplyRequest): Promise<SyncTradeFinanceloanapplyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.syncTradeFinanceloanapplyEx(request, headers, runtime);
  }

  /**
   * Description: 融资放款申请接口
   * Summary: 融资放款申请接口
   */
  async syncTradeFinanceloanapplyEx(request: SyncTradeFinanceloanapplyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SyncTradeFinanceloanapplyResponse> {
    Util.validateModel(request);
    return $tea.cast<SyncTradeFinanceloanapplyResponse>(await this.doRequest("1.0", "antchain.ato.trade.financeloanapply.sync", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SyncTradeFinanceloanapplyResponse({}));
  }

  /**
   * Description: 商户履约查询
   * Summary: 商户履约查询
   */
  async getTradeMerchantfulfillment(request: GetTradeMerchantfulfillmentRequest): Promise<GetTradeMerchantfulfillmentResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getTradeMerchantfulfillmentEx(request, headers, runtime);
  }

  /**
   * Description: 商户履约查询
   * Summary: 商户履约查询
   */
  async getTradeMerchantfulfillmentEx(request: GetTradeMerchantfulfillmentRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetTradeMerchantfulfillmentResponse> {
    Util.validateModel(request);
    return $tea.cast<GetTradeMerchantfulfillmentResponse>(await this.doRequest("1.0", "antchain.ato.trade.merchantfulfillment.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetTradeMerchantfulfillmentResponse({}));
  }

  /**
   * Description: 用户履约信息查询（履约承诺+记录）
   * Summary: 用户履约信息查询（履约承诺+记录）
   */
  async getTradeUserperformance(request: GetTradeUserperformanceRequest): Promise<GetTradeUserperformanceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getTradeUserperformanceEx(request, headers, runtime);
  }

  /**
   * Description: 用户履约信息查询（履约承诺+记录）
   * Summary: 用户履约信息查询（履约承诺+记录）
   */
  async getTradeUserperformanceEx(request: GetTradeUserperformanceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetTradeUserperformanceResponse> {
    Util.validateModel(request);
    return $tea.cast<GetTradeUserperformanceResponse>(await this.doRequest("1.0", "antchain.ato.trade.userperformance.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetTradeUserperformanceResponse({}));
  }

  /**
   * Description: 商户履约信息查询（履约承诺+履约记录）
   * Summary: 商户履约信息查询（履约承诺+履约记录）
   */
  async getTradeMerchantperformance(request: GetTradeMerchantperformanceRequest): Promise<GetTradeMerchantperformanceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getTradeMerchantperformanceEx(request, headers, runtime);
  }

  /**
   * Description: 商户履约信息查询（履约承诺+履约记录）
   * Summary: 商户履约信息查询（履约承诺+履约记录）
   */
  async getTradeMerchantperformanceEx(request: GetTradeMerchantperformanceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetTradeMerchantperformanceResponse> {
    Util.validateModel(request);
    return $tea.cast<GetTradeMerchantperformanceResponse>(await this.doRequest("1.0", "antchain.ato.trade.merchantperformance.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetTradeMerchantperformanceResponse({}));
  }

  /**
   * Description: 商户调用，修改订单的用户还款承诺
   * Summary: 用户还款承诺信息修改
   */
  async updateTradeUserpromise(request: UpdateTradeUserpromiseRequest): Promise<UpdateTradeUserpromiseResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateTradeUserpromiseEx(request, headers, runtime);
  }

  /**
   * Description: 商户调用，修改订单的用户还款承诺
   * Summary: 用户还款承诺信息修改
   */
  async updateTradeUserpromiseEx(request: UpdateTradeUserpromiseRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateTradeUserpromiseResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateTradeUserpromiseResponse>(await this.doRequest("1.0", "antchain.ato.trade.userpromise.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateTradeUserpromiseResponse({}));
  }

  /**
   * Description: 前置签署间联模式订单进件
   * Summary: 前置签署间联模式订单进件
   */
  async syncFrontIndirectorder(request: SyncFrontIndirectorderRequest): Promise<SyncFrontIndirectorderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.syncFrontIndirectorderEx(request, headers, runtime);
  }

  /**
   * Description: 前置签署间联模式订单进件
   * Summary: 前置签署间联模式订单进件
   */
  async syncFrontIndirectorderEx(request: SyncFrontIndirectorderRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SyncFrontIndirectorderResponse> {
    Util.validateModel(request);
    return $tea.cast<SyncFrontIndirectorderResponse>(await this.doRequest("1.0", "antchain.ato.front.indirectorder.sync", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SyncFrontIndirectorderResponse({}));
  }

  /**
   * Description: 间联模式-后置模式订单进件
   * Summary: 间联模式-后置模式订单进件
   */
  async syncTradeIndirectorder(request: SyncTradeIndirectorderRequest): Promise<SyncTradeIndirectorderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.syncTradeIndirectorderEx(request, headers, runtime);
  }

  /**
   * Description: 间联模式-后置模式订单进件
   * Summary: 间联模式-后置模式订单进件
   */
  async syncTradeIndirectorderEx(request: SyncTradeIndirectorderRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SyncTradeIndirectorderResponse> {
    Util.validateModel(request);
    return $tea.cast<SyncTradeIndirectorderResponse>(await this.doRequest("1.0", "antchain.ato.trade.indirectorder.sync", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SyncTradeIndirectorderResponse({}));
  }

  /**
   * Description: 用户履约承诺替换更新
   * Summary: 用户履约承诺替换更新
   */
  async replaceTradeUserpromise(request: ReplaceTradeUserpromiseRequest): Promise<ReplaceTradeUserpromiseResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.replaceTradeUserpromiseEx(request, headers, runtime);
  }

  /**
   * Description: 用户履约承诺替换更新
   * Summary: 用户履约承诺替换更新
   */
  async replaceTradeUserpromiseEx(request: ReplaceTradeUserpromiseRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ReplaceTradeUserpromiseResponse> {
    Util.validateModel(request);
    return $tea.cast<ReplaceTradeUserpromiseResponse>(await this.doRequest("1.0", "antchain.ato.trade.userpromise.replace", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ReplaceTradeUserpromiseResponse({}));
  }

  /**
   * Description: 订单融资预审申请接口
   * Summary: 订单融资预审申请接口
   */
  async applyTradeFinanceprecheck(request: ApplyTradeFinanceprecheckRequest): Promise<ApplyTradeFinanceprecheckResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyTradeFinanceprecheckEx(request, headers, runtime);
  }

  /**
   * Description: 订单融资预审申请接口
   * Summary: 订单融资预审申请接口
   */
  async applyTradeFinanceprecheckEx(request: ApplyTradeFinanceprecheckRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyTradeFinanceprecheckResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyTradeFinanceprecheckResponse>(await this.doRequest("1.0", "antchain.ato.trade.financeprecheck.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyTradeFinanceprecheckResponse({}));
  }

  /**
   * Description: 非融转融资
   * Summary: 非融转融资
   */
  async transferTradeFinance(request: TransferTradeFinanceRequest): Promise<TransferTradeFinanceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.transferTradeFinanceEx(request, headers, runtime);
  }

  /**
   * Description: 非融转融资
   * Summary: 非融转融资
   */
  async transferTradeFinanceEx(request: TransferTradeFinanceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<TransferTradeFinanceResponse> {
    Util.validateModel(request);
    return $tea.cast<TransferTradeFinanceResponse>(await this.doRequest("1.0", "antchain.ato.trade.finance.transfer", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new TransferTradeFinanceResponse({}));
  }

  /**
   * Description: 更新订单信息
   * Summary: 更新订单信息
   */
  async updateTradeOrder(request: UpdateTradeOrderRequest): Promise<UpdateTradeOrderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateTradeOrderEx(request, headers, runtime);
  }

  /**
   * Description: 更新订单信息
   * Summary: 更新订单信息
   */
  async updateTradeOrderEx(request: UpdateTradeOrderRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateTradeOrderResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateTradeOrderResponse>(await this.doRequest("1.0", "antchain.ato.trade.order.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateTradeOrderResponse({}));
  }

  /**
   * Description: 融资订单追加预审资金方
   * Summary: 融资订单追加预审资金方
   */
  async addTradeFinanceprecheck(request: AddTradeFinanceprecheckRequest): Promise<AddTradeFinanceprecheckResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.addTradeFinanceprecheckEx(request, headers, runtime);
  }

  /**
   * Description: 融资订单追加预审资金方
   * Summary: 融资订单追加预审资金方
   */
  async addTradeFinanceprecheckEx(request: AddTradeFinanceprecheckRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AddTradeFinanceprecheckResponse> {
    Util.validateModel(request);
    return $tea.cast<AddTradeFinanceprecheckResponse>(await this.doRequest("1.0", "antchain.ato.trade.financeprecheck.add", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AddTradeFinanceprecheckResponse({}));
  }

  /**
   * Description: 订单融资信息查询接口
   * Summary: 订单融资信息查询接口
   */
  async getTradeOrderfinanceinfo(request: GetTradeOrderfinanceinfoRequest): Promise<GetTradeOrderfinanceinfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getTradeOrderfinanceinfoEx(request, headers, runtime);
  }

  /**
   * Description: 订单融资信息查询接口
   * Summary: 订单融资信息查询接口
   */
  async getTradeOrderfinanceinfoEx(request: GetTradeOrderfinanceinfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetTradeOrderfinanceinfoResponse> {
    Util.validateModel(request);
    return $tea.cast<GetTradeOrderfinanceinfoResponse>(await this.doRequest("1.0", "antchain.ato.trade.orderfinanceinfo.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetTradeOrderfinanceinfoResponse({}));
  }

  /**
   * Description: 订单代扣计划延期
   * Summary: 订单代扣计划延期
   */
  async syncTradeUserpromisedelay(request: SyncTradeUserpromisedelayRequest): Promise<SyncTradeUserpromisedelayResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.syncTradeUserpromisedelayEx(request, headers, runtime);
  }

  /**
   * Description: 订单代扣计划延期
   * Summary: 订单代扣计划延期
   */
  async syncTradeUserpromisedelayEx(request: SyncTradeUserpromisedelayRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SyncTradeUserpromisedelayResponse> {
    Util.validateModel(request);
    return $tea.cast<SyncTradeUserpromisedelayResponse>(await this.doRequest("1.0", "antchain.ato.trade.userpromisedelay.sync", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SyncTradeUserpromisedelayResponse({}));
  }

  /**
   * Description: 订单代扣计划暂停
   * Summary: 订单代扣计划暂停
   */
  async pauseTradeUserpromise(request: PauseTradeUserpromiseRequest): Promise<PauseTradeUserpromiseResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pauseTradeUserpromiseEx(request, headers, runtime);
  }

  /**
   * Description: 订单代扣计划暂停
   * Summary: 订单代扣计划暂停
   */
  async pauseTradeUserpromiseEx(request: PauseTradeUserpromiseRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PauseTradeUserpromiseResponse> {
    Util.validateModel(request);
    return $tea.cast<PauseTradeUserpromiseResponse>(await this.doRequest("1.0", "antchain.ato.trade.userpromise.pause", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PauseTradeUserpromiseResponse({}));
  }

  /**
   * Description: 代扣计划重启
   * Summary: 代扣计划重启
   */
  async resumeTradeUserpromise(request: ResumeTradeUserpromiseRequest): Promise<ResumeTradeUserpromiseResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.resumeTradeUserpromiseEx(request, headers, runtime);
  }

  /**
   * Description: 代扣计划重启
   * Summary: 代扣计划重启
   */
  async resumeTradeUserpromiseEx(request: ResumeTradeUserpromiseRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ResumeTradeUserpromiseResponse> {
    Util.validateModel(request);
    return $tea.cast<ResumeTradeUserpromiseResponse>(await this.doRequest("1.0", "antchain.ato.trade.userpromise.resume", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ResumeTradeUserpromiseResponse({}));
  }

  /**
   * Description: 代扣签约创建
   * Summary: 代扣签约
   */
  async createWithholdSign(request: CreateWithholdSignRequest): Promise<CreateWithholdSignResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createWithholdSignEx(request, headers, runtime);
  }

  /**
   * Description: 代扣签约创建
   * Summary: 代扣签约
   */
  async createWithholdSignEx(request: CreateWithholdSignRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateWithholdSignResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateWithholdSignResponse>(await this.doRequest("1.0", "antchain.ato.withhold.sign.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateWithholdSignResponse({}));
  }

  /**
   * Description: 代扣签约查询
   * Summary: 代扣签约查询
   */
  async queryWithholdSign(request: QueryWithholdSignRequest): Promise<QueryWithholdSignResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryWithholdSignEx(request, headers, runtime);
  }

  /**
   * Description: 代扣签约查询
   * Summary: 代扣签约查询
   */
  async queryWithholdSignEx(request: QueryWithholdSignRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryWithholdSignResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryWithholdSignResponse>(await this.doRequest("1.0", "antchain.ato.withhold.sign.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryWithholdSignResponse({}));
  }

  /**
   * Description: 订单关闭后,可以通过此接口解绑签约
   * Summary: 代扣签约解绑
   */
  async unbindWithholdSign(request: UnbindWithholdSignRequest): Promise<UnbindWithholdSignResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.unbindWithholdSignEx(request, headers, runtime);
  }

  /**
   * Description: 订单关闭后,可以通过此接口解绑签约
   * Summary: 代扣签约解绑
   */
  async unbindWithholdSignEx(request: UnbindWithholdSignRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UnbindWithholdSignResponse> {
    Util.validateModel(request);
    return $tea.cast<UnbindWithholdSignResponse>(await this.doRequest("1.0", "antchain.ato.withhold.sign.unbind", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UnbindWithholdSignResponse({}));
  }

  /**
   * Description: 取消代扣计划，将未扣款的全部代扣计划进行取消
   * Summary: 取消代扣计划
   */
  async cancelWithholdPlan(request: CancelWithholdPlanRequest): Promise<CancelWithholdPlanResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.cancelWithholdPlanEx(request, headers, runtime);
  }

  /**
   * Description: 取消代扣计划，将未扣款的全部代扣计划进行取消
   * Summary: 取消代扣计划
   */
  async cancelWithholdPlanEx(request: CancelWithholdPlanRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CancelWithholdPlanResponse> {
    Util.validateModel(request);
    return $tea.cast<CancelWithholdPlanResponse>(await this.doRequest("1.0", "antchain.ato.withhold.plan.cancel", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CancelWithholdPlanResponse({}));
  }

  /**
   * Description: 重要说明：
      1. 这个接口是取消订单某一、多期代扣计划中以其他方式还款的金额，取消之后代扣不再执行该期计划。
      2. 对通过其他方式还款的第三方单号留存;例如：银行流水号或微信流水号。
   * Summary: 单期多期代扣取消
   */
  async repayWithholdPlan(request: RepayWithholdPlanRequest): Promise<RepayWithholdPlanResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.repayWithholdPlanEx(request, headers, runtime);
  }

  /**
   * Description: 重要说明：
      1. 这个接口是取消订单某一、多期代扣计划中以其他方式还款的金额，取消之后代扣不再执行该期计划。
      2. 对通过其他方式还款的第三方单号留存;例如：银行流水号或微信流水号。
   * Summary: 单期多期代扣取消
   */
  async repayWithholdPlanEx(request: RepayWithholdPlanRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RepayWithholdPlanResponse> {
    Util.validateModel(request);
    return $tea.cast<RepayWithholdPlanResponse>(await this.doRequest("1.0", "antchain.ato.withhold.plan.repay", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RepayWithholdPlanResponse({}));
  }

  /**
   * Description: 当代扣未成功时，商户可与用户进行沟通补款到支付宝，补款完成后通过代扣重试能力实时触发重试扣款。
   * Summary: 扣款计划重试
   */
  async retryWithholdPlan(request: RetryWithholdPlanRequest): Promise<RetryWithholdPlanResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.retryWithholdPlanEx(request, headers, runtime);
  }

  /**
   * Description: 当代扣未成功时，商户可与用户进行沟通补款到支付宝，补款完成后通过代扣重试能力实时触发重试扣款。
   * Summary: 扣款计划重试
   */
  async retryWithholdPlanEx(request: RetryWithholdPlanRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RetryWithholdPlanResponse> {
    Util.validateModel(request);
    return $tea.cast<RetryWithholdPlanResponse>(await this.doRequest("1.0", "antchain.ato.withhold.plan.retry", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RetryWithholdPlanResponse({}));
  }

  /**
   * Description: 当代扣签约时，用户在支付宝侧发起异步解约，此时需要经过商户确认才可以完成解约。saas会通知商户用户的异步解约申请，由商户通过此接口确认是否解约
   * Summary: 代扣签约的异步解约确认
   */
  async confirmWithholdSignasyncunsign(request: ConfirmWithholdSignasyncunsignRequest): Promise<ConfirmWithholdSignasyncunsignResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.confirmWithholdSignasyncunsignEx(request, headers, runtime);
  }

  /**
   * Description: 当代扣签约时，用户在支付宝侧发起异步解约，此时需要经过商户确认才可以完成解约。saas会通知商户用户的异步解约申请，由商户通过此接口确认是否解约
   * Summary: 代扣签约的异步解约确认
   */
  async confirmWithholdSignasyncunsignEx(request: ConfirmWithholdSignasyncunsignRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ConfirmWithholdSignasyncunsignResponse> {
    Util.validateModel(request);
    return $tea.cast<ConfirmWithholdSignasyncunsignResponse>(await this.doRequest("1.0", "antchain.ato.withhold.signasyncunsign.confirm", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ConfirmWithholdSignasyncunsignResponse({}));
  }

  /**
   * Description: 代扣主动支付创建
   * Summary: 代扣主动支付创建
   */
  async createWithholdActivepay(request: CreateWithholdActivepayRequest): Promise<CreateWithholdActivepayResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createWithholdActivepayEx(request, headers, runtime);
  }

  /**
   * Description: 代扣主动支付创建
   * Summary: 代扣主动支付创建
   */
  async createWithholdActivepayEx(request: CreateWithholdActivepayRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateWithholdActivepayResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateWithholdActivepayResponse>(await this.doRequest("1.0", "antchain.ato.withhold.activepay.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateWithholdActivepayResponse({}));
  }

  /**
   * Description: 代扣主动支付查询
   * Summary: 代扣主动支付查询
   */
  async queryWithholdActivepay(request: QueryWithholdActivepayRequest): Promise<QueryWithholdActivepayResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryWithholdActivepayEx(request, headers, runtime);
  }

  /**
   * Description: 代扣主动支付查询
   * Summary: 代扣主动支付查询
   */
  async queryWithholdActivepayEx(request: QueryWithholdActivepayRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryWithholdActivepayResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryWithholdActivepayResponse>(await this.doRequest("1.0", "antchain.ato.withhold.activepay.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryWithholdActivepayResponse({}));
  }

  /**
   * Description: 代扣主动支付取消
   * Summary: 代扣主动支付取消
   */
  async cancelWithholdActivepay(request: CancelWithholdActivepayRequest): Promise<CancelWithholdActivepayResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.cancelWithholdActivepayEx(request, headers, runtime);
  }

  /**
   * Description: 代扣主动支付取消
   * Summary: 代扣主动支付取消
   */
  async cancelWithholdActivepayEx(request: CancelWithholdActivepayRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CancelWithholdActivepayResponse> {
    Util.validateModel(request);
    return $tea.cast<CancelWithholdActivepayResponse>(await this.doRequest("1.0", "antchain.ato.withhold.activepay.cancel", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CancelWithholdActivepayResponse({}));
  }

  /**
   * Description: 创建退款请求
   * Summary: 创建退款申请
   */
  async createWithholdRefund(request: CreateWithholdRefundRequest): Promise<CreateWithholdRefundResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createWithholdRefundEx(request, headers, runtime);
  }

  /**
   * Description: 创建退款请求
   * Summary: 创建退款申请
   */
  async createWithholdRefundEx(request: CreateWithholdRefundRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateWithholdRefundResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateWithholdRefundResponse>(await this.doRequest("1.0", "antchain.ato.withhold.refund.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateWithholdRefundResponse({}));
  }

  /**
   * Description: 退款申请结果查询
   * Summary: 退款申请结果查询
   */
  async queryWithholdRefund(request: QueryWithholdRefundRequest): Promise<QueryWithholdRefundResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryWithholdRefundEx(request, headers, runtime);
  }

  /**
   * Description: 退款申请结果查询
   * Summary: 退款申请结果查询
   */
  async queryWithholdRefundEx(request: QueryWithholdRefundRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryWithholdRefundResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryWithholdRefundResponse>(await this.doRequest("1.0", "antchain.ato.withhold.refund.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryWithholdRefundResponse({}));
  }

  /**
   * Description: 代偿户账户查询
   * Summary: 代偿户账户查询
   */
  async queryWithholdCompensateaccount(request: QueryWithholdCompensateaccountRequest): Promise<QueryWithholdCompensateaccountResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryWithholdCompensateaccountEx(request, headers, runtime);
  }

  /**
   * Description: 代偿户账户查询
   * Summary: 代偿户账户查询
   */
  async queryWithholdCompensateaccountEx(request: QueryWithholdCompensateaccountRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryWithholdCompensateaccountResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryWithholdCompensateaccountResponse>(await this.doRequest("1.0", "antchain.ato.withhold.compensateaccount.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryWithholdCompensateaccountResponse({}));
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
