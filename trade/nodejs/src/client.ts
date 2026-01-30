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

// 定价条件
export class PriceConditionAttr extends $tea.Model {
  // 属性code
  attrCode: string;
  // 属性值code
  attrValueCode: string;
  // 属性值名称
  attrValueName: string;
  // 运算符，只有在约束条件中会出现
  operator?: string;
  static names(): { [key: string]: string } {
    return {
      attrCode: 'attr_code',
      attrValueCode: 'attr_value_code',
      attrValueName: 'attr_value_name',
      operator: 'operator',
    };
  }

  static types(): { [key: string]: any } {
    return {
      attrCode: 'string',
      attrValueCode: 'string',
      attrValueName: 'string',
      operator: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 商品属性结构
export class CommodityAttribute extends $tea.Model {
  // 属性编码
  code: string;
  // 属性名
  name: string;
  // 默认值
  defaultValue: string;
  // 属性值类型，离散值：DISCRETE，数值：NUMBER
  valueType: string;
  // 当是离散值类型时，为多个离散值逗号分隔
  // 当是数值类型时，为JSON，结构为{"rangeType":"open", "min":1, "max": 100, "step:1}
  valueRange: string;
  // 展示类型
  displayType: string;
  // 提示文案
  tips: string;
  // 单位
  unit: string;
  static names(): { [key: string]: string } {
    return {
      code: 'code',
      name: 'name',
      defaultValue: 'default_value',
      valueType: 'value_type',
      valueRange: 'value_range',
      displayType: 'display_type',
      tips: 'tips',
      unit: 'unit',
    };
  }

  static types(): { [key: string]: any } {
    return {
      code: 'string',
      name: 'string',
      defaultValue: 'string',
      valueType: 'string',
      valueRange: 'string',
      displayType: 'string',
      tips: 'string',
      unit: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 非继承型一客一价
export class NoExtendPrice extends $tea.Model {
  // 定价条件
  conditionAttrs?: PriceConditionAttr[];
  // 阶梯开始
  ladderStart: string;
  // 阶梯结束
  ladderEnd: string;
  // 签约价
  price: string;
  // 计价方法：具体公式、阶梯方法、自定义
  pricingMethod: string;
  // 阶梯区间类型，左开右闭/左闭右开
  ladderIntervalType: string;
  // 定价对象code
  priceObjectCode: string;
  // 计价模式：公式、阶梯、自定义
  pricingMode: string;
  // 价格单位
  unit: string;
  // 是否阶梯总价
  ladderPriceFixed?: boolean;
  static names(): { [key: string]: string } {
    return {
      conditionAttrs: 'condition_attrs',
      ladderStart: 'ladder_start',
      ladderEnd: 'ladder_end',
      price: 'price',
      pricingMethod: 'pricing_method',
      ladderIntervalType: 'ladder_interval_type',
      priceObjectCode: 'price_object_code',
      pricingMode: 'pricing_mode',
      unit: 'unit',
      ladderPriceFixed: 'ladder_price_fixed',
    };
  }

  static types(): { [key: string]: any } {
    return {
      conditionAttrs: { 'type': 'array', 'itemType': PriceConditionAttr },
      ladderStart: 'string',
      ladderEnd: 'string',
      price: 'string',
      pricingMethod: 'string',
      ladderIntervalType: 'string',
      priceObjectCode: 'string',
      pricingMode: 'string',
      unit: 'string',
      ladderPriceFixed: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 订单周期结构
export class OrderDuration extends $tea.Model {
  // 周期类型，YEAR：年；MONTH：月；DAY：日
  durationType: string;
  // 订购周期值
  durationValue: number;
  static names(): { [key: string]: string } {
    return {
      durationType: 'duration_type',
      durationValue: 'duration_value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      durationType: 'string',
      durationValue: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 后付商品签约价，用于在履约阶段生成一客一价
export class PostPayPrice extends $tea.Model {
  //  币种单位值，156（CNY)
  currencyValue?: string;
  //  价格周期
  duration?: OrderDuration;
  // 非继承型一客一价
  noExtendPrices?: NoExtendPrice[];
  static names(): { [key: string]: string } {
    return {
      currencyValue: 'currency_value',
      duration: 'duration',
      noExtendPrices: 'no_extend_prices',
    };
  }

  static types(): { [key: string]: any } {
    return {
      currencyValue: 'string',
      duration: OrderDuration,
      noExtendPrices: { 'type': 'array', 'itemType': NoExtendPrice },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 商品订购属性结构
export class CommodityOrderAttribute extends $tea.Model {
  // 属性编码
  code: string;
  // 属性值
  value: string;
  // 属性值单位，部分数值型属性有多种单位，需要填入；其他情况不需要填
  valueUnit: string;
  static names(): { [key: string]: string } {
    return {
      code: 'code',
      value: 'value',
      valueUnit: 'value_unit',
    };
  }

  static types(): { [key: string]: any } {
    return {
      code: 'string',
      value: 'string',
      valueUnit: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 预付金额
export class PrepayAmount extends $tea.Model {
  // 指定预付费金额
  amount: string;
  // 币种单位，CNY\USD等标准币种单位编码
  currency: string;
  static names(): { [key: string]: string } {
    return {
      amount: 'amount',
      currency: 'currency',
    };
  }

  static types(): { [key: string]: any } {
    return {
      amount: 'string',
      currency: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 履约选项
export class FulfillmentOptions extends $tea.Model {
  // 是否延迟履约，默认false
  deplay?: boolean;
  // 实际履约开始时间，默认支付完成时间；只有deplay=true时，start_time才生效
  startTime?: string;
  // 跳过SPI回调，默认false，优先级高于商品上默认的接入属性
  spiSkip?: boolean;
  static names(): { [key: string]: string } {
    return {
      deplay: 'deplay',
      startTime: 'start_time',
      spiSkip: 'spi_skip',
    };
  }

  static types(): { [key: string]: any } {
    return {
      deplay: 'boolean',
      startTime: 'string',
      spiSkip: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 套餐内商品订单结构
export class ComboCommodityOrder extends $tea.Model {
  // 商品编码
  commodityCode: string;
  // 状态
  status: string;
  // 实例ID列表
  instanceIds: string[];
  static names(): { [key: string]: string } {
    return {
      commodityCode: 'commodity_code',
      status: 'status',
      instanceIds: 'instance_ids',
    };
  }

  static types(): { [key: string]: any } {
    return {
      commodityCode: 'string',
      status: 'string',
      instanceIds: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 套餐内商品结构
export class ComboCommodity extends $tea.Model {
  // 商品名称
  name: string;
  // 商品在套餐中的唯一编码，当一个套餐中存在两个一样的商品时，编码会不一样
  uniqueCode: string;
  // 商品主数据编码
  innerCode: string;
  // 商品类型，资源包：attach
  type: string;
  // 付费方式，预付：PREPAY，按量付费：POSTPAY
  chargeType: string;
  // 销售属性列表
  attrs: CommodityAttribute[];
  // 商品数量
  quantity: number;
  // 扩展信息，JSON结构，包含标签、个性化配置等数据
  extendsConfig: string;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      uniqueCode: 'unique_code',
      innerCode: 'inner_code',
      type: 'type',
      chargeType: 'charge_type',
      attrs: 'attrs',
      quantity: 'quantity',
      extendsConfig: 'extends_config',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      uniqueCode: 'string',
      innerCode: 'string',
      type: 'string',
      chargeType: 'string',
      attrs: { 'type': 'array', 'itemType': CommodityAttribute },
      quantity: 'number',
      extendsConfig: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 支付选项
export class PayOptions extends $tea.Model {
  // 系统自动会根据账号类型、当前OU进行付费渠道判定；如果传入的付款渠道不满足，则报错
  payChannel?: string;
  // 支付方式，例如：直付通
  paymentMethod?: string;
  static names(): { [key: string]: string } {
    return {
      payChannel: 'pay_channel',
      paymentMethod: 'payment_method',
    };
  }

  static types(): { [key: string]: any } {
    return {
      payChannel: 'string',
      paymentMethod: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 履约开通参数
export class ProvisionOption extends $tea.Model {
  // 订单开始时间 (ISO 8601 UTC)，可自定义覆盖默认值
  orderStartTime?: string;
  static names(): { [key: string]: string } {
    return {
      orderStartTime: 'order_start_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      orderStartTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 资源包结构
export class InstanceCapacity extends $tea.Model {
  // 实例ID
  instanceId: string;
  // 当前剩余容量
  currentCapacity: string;
  // 初始容量
  initialCapacity: string;
  // 起始时间
  startTime: string;
  // 截止时间
  endTime: string;
  // Valid：有效；Closed：已用完；Expired:已到期
  status: string;
  // 资源包对应商品码
  commodityCode: string;
  // 关联按量商品码
  relPostpayCommodity: string;
  static names(): { [key: string]: string } {
    return {
      instanceId: 'instance_id',
      currentCapacity: 'current_capacity',
      initialCapacity: 'initial_capacity',
      startTime: 'start_time',
      endTime: 'end_time',
      status: 'status',
      commodityCode: 'commodity_code',
      relPostpayCommodity: 'rel_postpay_commodity',
    };
  }

  static types(): { [key: string]: any } {
    return {
      instanceId: 'string',
      currentCapacity: 'string',
      initialCapacity: 'string',
      startTime: 'string',
      endTime: 'string',
      status: 'string',
      commodityCode: 'string',
      relPostpayCommodity: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 商品同步common_buy内容
export class CommoditySyncCommonBuyInfo extends $tea.Model {
  // 商品列表配置 ListJson字符串
  commonBuySaleGroupListJson: string[];
  // 规格配置 ListJson字符串
  offerAttrListJson: string[];
  // Region配置 ListJson字符串
  prodOfferRegionListJson: string[];
  // 费用项配置 ListJson字符串
  offerAttrGroupListJson: string[];
  // 属性配置 ListJson字符串
  offerExtendAttrListJson: string[];
  // 界面归类配置 ListJson字符串
  offerCommonBuyGroupListJson: string[];
  // 规格约束配置 ListJson字符串
  offerAttrConstraintsListFson: string[];
  // 售卖规则配置 ListJson字符串
  offerRuleGroupListJson: string[];
  static names(): { [key: string]: string } {
    return {
      commonBuySaleGroupListJson: 'common_buy_sale_group_list_json',
      offerAttrListJson: 'offer_attr_list_json',
      prodOfferRegionListJson: 'prod_offer_region_list_json',
      offerAttrGroupListJson: 'offer_attr_group_list_json',
      offerExtendAttrListJson: 'offer_extend_attr_list_json',
      offerCommonBuyGroupListJson: 'offer_common_buy_group_list_json',
      offerAttrConstraintsListFson: 'offer_attr_constraints_list_fson',
      offerRuleGroupListJson: 'offer_rule_group_list_json',
    };
  }

  static types(): { [key: string]: any } {
    return {
      commonBuySaleGroupListJson: { 'type': 'array', 'itemType': 'string' },
      offerAttrListJson: { 'type': 'array', 'itemType': 'string' },
      prodOfferRegionListJson: { 'type': 'array', 'itemType': 'string' },
      offerAttrGroupListJson: { 'type': 'array', 'itemType': 'string' },
      offerExtendAttrListJson: { 'type': 'array', 'itemType': 'string' },
      offerCommonBuyGroupListJson: { 'type': 'array', 'itemType': 'string' },
      offerAttrConstraintsListFson: { 'type': 'array', 'itemType': 'string' },
      offerRuleGroupListJson: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 商品实例
export class CommodityInstance extends $tea.Model {
  // 订单号
  bizNo?: string;
  // 商品编码
  commodityCode: string;
  // 销售主体，不传默认ZL6
  ou?: string;
  // 订单类型，NEW：新购；RENEW：续费； MODIFY：变配 不填默认新购
  orderType?: string;
  // 订购时长
  duration?: OrderDuration;
  // 优惠券ID
  couponId?: string;
  // 数量，不填默认1
  quantity?: number;
  // 	
  // 商品订购属性，开通型商品部需要填写
  commodityAttrs?: CommodityOrderAttribute[];
  // 履约选项
  fulfillmentOptions?: FulfillmentOptions;
  // 实例ID，续费/变配场景必传
  instanceId?: string;
  // 预付费订单金额。仅白名单商品且batchBizNo是合法的合同ID的情况，才允许指定预付订单金额
  prepayAmount?: PrepayAmount;
  // 后付商品签约价，用于在履约阶段生成一客一价
  postPayPrice?: PostPayPrice;
  static names(): { [key: string]: string } {
    return {
      bizNo: 'biz_no',
      commodityCode: 'commodity_code',
      ou: 'ou',
      orderType: 'order_type',
      duration: 'duration',
      couponId: 'coupon_id',
      quantity: 'quantity',
      commodityAttrs: 'commodity_attrs',
      fulfillmentOptions: 'fulfillment_options',
      instanceId: 'instance_id',
      prepayAmount: 'prepay_amount',
      postPayPrice: 'post_pay_price',
    };
  }

  static types(): { [key: string]: any } {
    return {
      bizNo: 'string',
      commodityCode: 'string',
      ou: 'string',
      orderType: 'string',
      duration: OrderDuration,
      couponId: 'string',
      quantity: 'number',
      commodityAttrs: { 'type': 'array', 'itemType': CommodityOrderAttribute },
      fulfillmentOptions: FulfillmentOptions,
      instanceId: 'string',
      prepayAmount: PrepayAmount,
      postPayPrice: PostPayPrice,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 优惠券模型
export class Coupon extends $tea.Model {
  // 优惠券ID	
  // 
  id: number;
  // 优惠券名称,前端展示	
  // 
  displayName: string;
  // 优惠券模板名称	
  // 
  name: string;
  // 优惠券类型，VOUCHER：抵用券;CERTAIN：满减券；DISCOUNT：折扣券	
  // 
  type: string;
  // 优惠券总金额，单位（分）。可使用金额需要根据 amount - usedAmount 得出
  // 
  amountInCent?: string;
  // 已使用金额，单位(分）
  // 
  usedAmountInCent?: string;
  // 状态，AVAILABLE-有效/EXPIRED-已过期/EXHAUSTED-已用完/ABANDONED-已作废	
  // 
  status: string;
  // 有效期开始时间	
  // 
  startTime: string;
  // 有效期结束时间	
  // 
  endTime: string;
  // 模板id	
  // 
  youhuiTemplateId: number;
  // 优惠券=折扣券时使用，如0.75	
  // 
  discountRate?: string;
  // 优惠券类型=满减券时使用，如满200000分
  // 
  fullAmountInCent?: string;
  // 可以使用的总次数	
  // 
  usageCount: number;
  // 已使用次数（冻结次数）	
  // 
  usedCount: number;
  // 适用产品：通用/ECS/RDS
  productList: string;
  // 适用订单类型	
  // 
  orderTypeList: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      displayName: 'display_name',
      name: 'name',
      type: 'type',
      amountInCent: 'amount_in_cent',
      usedAmountInCent: 'used_amount_in_cent',
      status: 'status',
      startTime: 'start_time',
      endTime: 'end_time',
      youhuiTemplateId: 'youhui_template_id',
      discountRate: 'discount_rate',
      fullAmountInCent: 'full_amount_in_cent',
      usageCount: 'usage_count',
      usedCount: 'used_count',
      productList: 'product_list',
      orderTypeList: 'order_type_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'number',
      displayName: 'string',
      name: 'string',
      type: 'string',
      amountInCent: 'string',
      usedAmountInCent: 'string',
      status: 'string',
      startTime: 'string',
      endTime: 'string',
      youhuiTemplateId: 'number',
      discountRate: 'string',
      fullAmountInCent: 'string',
      usageCount: 'number',
      usedCount: 'number',
      productList: 'string',
      orderTypeList: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 套餐订单结构
export class ComboOrder extends $tea.Model {
  // 租户ID
  tenantId: string;
  // 业务流水号
  bizNo: string;
  // 套餐订单号
  orderId: string;
  // 套餐编码
  comboCode: string;
  // 套餐名称，下单时的套餐名称
  comboName: string;
  // 订单状态，CREATED：创建；CANCEL：取消；PAYING：支付中；PAID：支付完成
  status: string;
  // 履约生产状态，INCOMPLETE:未完成、COMPLETED:完成
  provisionStatus: string;
  // 订单原始金额
  originalAmount: string;
  // 折扣金额
  discountAmount: string;
  // 优惠金额
  couponAmount: string;
  // 实付金额
  payAmount: string;
  // 下单时间
  gmtCreate: string;
  // 套餐内商品订单列表
  commodityOrders: ComboCommodityOrder[];
  // 支付完成时间
  payTime: string;
  // 支付渠道
  payChannel: string;
  static names(): { [key: string]: string } {
    return {
      tenantId: 'tenant_id',
      bizNo: 'biz_no',
      orderId: 'order_id',
      comboCode: 'combo_code',
      comboName: 'combo_name',
      status: 'status',
      provisionStatus: 'provision_status',
      originalAmount: 'original_amount',
      discountAmount: 'discount_amount',
      couponAmount: 'coupon_amount',
      payAmount: 'pay_amount',
      gmtCreate: 'gmt_create',
      commodityOrders: 'commodity_orders',
      payTime: 'pay_time',
      payChannel: 'pay_channel',
    };
  }

  static types(): { [key: string]: any } {
    return {
      tenantId: 'string',
      bizNo: 'string',
      orderId: 'string',
      comboCode: 'string',
      comboName: 'string',
      status: 'string',
      provisionStatus: 'string',
      originalAmount: 'string',
      discountAmount: 'string',
      couponAmount: 'string',
      payAmount: 'string',
      gmtCreate: 'string',
      commodityOrders: { 'type': 'array', 'itemType': ComboCommodityOrder },
      payTime: 'string',
      payChannel: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 商品定价结构
export class CommodityPricing extends $tea.Model {
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

// 标签对象
export class InstanceLabel extends $tea.Model {
  // 标签名。
  // 传递isvId
  instanceKey: string;
  // 标签值
  instanceValue: string;
  static names(): { [key: string]: string } {
    return {
      instanceKey: 'instance_key',
      instanceValue: 'instance_value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      instanceKey: 'string',
      instanceValue: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 价格策略
export class PriceStrategy extends $tea.Model {
  // 继承租户在商品下的价格，仅后付费商品生效
  followTenantId?: string;
  static names(): { [key: string]: string } {
    return {
      followTenantId: 'follow_tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      followTenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 商品同步common_buy内容
export class OfferSyncCommonBuyInfo extends $tea.Model {
  // 商品列表配置 ListJson字符串
  commonBuySaleGroupListJson: string[];
  // 规格配置 ListJson字符串
  offerAttrListJson: string[];
  // Region配置 ListJson字符串
  prodOfferRegionListJson: string[];
  // 费用项配置 ListJson字符串
  offerAttrGroupListJson: string[];
  // 属性配置 ListJson字符串
  offerExtendAttrListJson: string[];
  // 界面归类配置 ListJson字符串
  offerCommonBuyGroupListJson: string[];
  // 规格约束配置 ListJson字符串
  offerAttrConstraintsListJson: string[];
  // 售卖规则配置 ListJson字符串
  offerRuleGroupListJson: string[];
  static names(): { [key: string]: string } {
    return {
      commonBuySaleGroupListJson: 'common_buy_sale_group_list_json',
      offerAttrListJson: 'offer_attr_list_json',
      prodOfferRegionListJson: 'prod_offer_region_list_json',
      offerAttrGroupListJson: 'offer_attr_group_list_json',
      offerExtendAttrListJson: 'offer_extend_attr_list_json',
      offerCommonBuyGroupListJson: 'offer_common_buy_group_list_json',
      offerAttrConstraintsListJson: 'offer_attr_constraints_list_json',
      offerRuleGroupListJson: 'offer_rule_group_list_json',
    };
  }

  static types(): { [key: string]: any } {
    return {
      commonBuySaleGroupListJson: { 'type': 'array', 'itemType': 'string' },
      offerAttrListJson: { 'type': 'array', 'itemType': 'string' },
      prodOfferRegionListJson: { 'type': 'array', 'itemType': 'string' },
      offerAttrGroupListJson: { 'type': 'array', 'itemType': 'string' },
      offerExtendAttrListJson: { 'type': 'array', 'itemType': 'string' },
      offerCommonBuyGroupListJson: { 'type': 'array', 'itemType': 'string' },
      offerAttrConstraintsListJson: { 'type': 'array', 'itemType': 'string' },
      offerRuleGroupListJson: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 创建订单返回结果
export class CreateTradeOrderResult extends $tea.Model {
  // 订单号
  orderId: string;
  // 下单时的订单号
  bizNo: string;
  // 实例ID列表
  instanceIds?: string[];
  // 订单状态
  payStatus: string;
  // 订购错误码
  orderErrorCode?: string;
  // 订购错误描述	
  orderErrorDescription?: string;
  static names(): { [key: string]: string } {
    return {
      orderId: 'order_id',
      bizNo: 'biz_no',
      instanceIds: 'instance_ids',
      payStatus: 'pay_status',
      orderErrorCode: 'order_error_code',
      orderErrorDescription: 'order_error_description',
    };
  }

  static types(): { [key: string]: any } {
    return {
      orderId: 'string',
      bizNo: 'string',
      instanceIds: { 'type': 'array', 'itemType': 'string' },
      payStatus: 'string',
      orderErrorCode: 'string',
      orderErrorDescription: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 商品询价结构
export class CommodityEnquiryPrice extends $tea.Model {
  // 商品主数据编码
  commodityCode: string;
  // 商品名称
  commodityName: string;
  // 预付-支付金额
  payAmount: string;
  // 预付费-原始金额
  originalAmount: string;
  // 预付费-折扣金额
  discountAmount: string;
  // 预付费-优惠券抵扣金额
  couponAmount: string;
  // 原订购剩余价值，用于变配场景
  subscriptionUnusedAmount: string;
  // 命中的活动编码
  activityCode: string;
  // 命中的活动名称
  activityName: string;
  // 命中的定价计划ID
  pricePlanId: number;
  // 命中的定价约束ID
  priceConstraintId: number;
  // 币种，元：CNY
  currency: string;
  // 基于剩余价值变配场景下，预测的支付金额正常的最小订购周期
  minDurationOfValidPayAmount?: OrderDuration;
  // 预付费-折扣率
  discountRate: string;
  // 原始BD权限价金额，白名单商品会返回此价格
  originalBdAmount?: string;
  // 原始成本价金额，白名单商品会返回此价格
  originalCostAmount?: string;
  static names(): { [key: string]: string } {
    return {
      commodityCode: 'commodity_code',
      commodityName: 'commodity_name',
      payAmount: 'pay_amount',
      originalAmount: 'original_amount',
      discountAmount: 'discount_amount',
      couponAmount: 'coupon_amount',
      subscriptionUnusedAmount: 'subscription_unused_amount',
      activityCode: 'activity_code',
      activityName: 'activity_name',
      pricePlanId: 'price_plan_id',
      priceConstraintId: 'price_constraint_id',
      currency: 'currency',
      minDurationOfValidPayAmount: 'min_duration_of_valid_pay_amount',
      discountRate: 'discount_rate',
      originalBdAmount: 'original_bd_amount',
      originalCostAmount: 'original_cost_amount',
    };
  }

  static types(): { [key: string]: any } {
    return {
      commodityCode: 'string',
      commodityName: 'string',
      payAmount: 'string',
      originalAmount: 'string',
      discountAmount: 'string',
      couponAmount: 'string',
      subscriptionUnusedAmount: 'string',
      activityCode: 'string',
      activityName: 'string',
      pricePlanId: 'number',
      priceConstraintId: 'number',
      currency: 'string',
      minDurationOfValidPayAmount: OrderDuration,
      discountRate: 'string',
      originalBdAmount: 'string',
      originalCostAmount: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 套餐结构
export class Combo extends $tea.Model {
  // 套餐名称
  code: string;
  // 套餐编码
  name: string;
  // 套餐版本号
  vid: string;
  // 套餐描述
  description: string;
  // 扩展信息，JSON结构，包含标签、个性化配置等数据
  extendsConfig: string;
  // 状态
  status: string;
  // 套餐内商品列表
  commodities: ComboCommodity[];
  static names(): { [key: string]: string } {
    return {
      code: 'code',
      name: 'name',
      vid: 'vid',
      description: 'description',
      extendsConfig: 'extends_config',
      status: 'status',
      commodities: 'commodities',
    };
  }

  static types(): { [key: string]: any } {
    return {
      code: 'string',
      name: 'string',
      vid: 'string',
      description: 'string',
      extendsConfig: 'string',
      status: 'string',
      commodities: { 'type': 'array', 'itemType': ComboCommodity },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 实例
export class Instance extends $tea.Model {
  // 租户id
  tenantId: string;
  // 实例id
  instanceId: string;
  // 商品code
  productName: string;
  // 付费类型 PREPAY_BY_MONTH 预付 AFTER_PAY_BY_HOUR 后付 MIX_PAY 混合付
  chargeType: string;
  // 状态 CREATING 创建中 FAILED 创建失败  STARTED 运行中 STOPPED 已停服  RELEASED 已释放
  status: string;
  static names(): { [key: string]: string } {
    return {
      tenantId: 'tenant_id',
      instanceId: 'instance_id',
      productName: 'product_name',
      chargeType: 'charge_type',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      tenantId: 'string',
      instanceId: 'string',
      productName: 'string',
      chargeType: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 下单返回接口
export class CreateOrderResult extends $tea.Model {
  // 下单时指定的业务流水号。二级订单号
  bsnNo: string;
  // 一级订单号
  orderId: string;
  // 二级订单号
  normalOrderLineId: string;
  // 订单状态
  orderStatus: string;
  // 实例列表
  instanceIds: string;
  // 订购错误码
  orderErrorCode: string;
  // 订购错误描述
  orderErrorDescription: string;
  static names(): { [key: string]: string } {
    return {
      bsnNo: 'bsn_no',
      orderId: 'order_id',
      normalOrderLineId: 'normal_order_line_id',
      orderStatus: 'order_status',
      instanceIds: 'instance_ids',
      orderErrorCode: 'order_error_code',
      orderErrorDescription: 'order_error_description',
    };
  }

  static types(): { [key: string]: any } {
    return {
      bsnNo: 'string',
      orderId: 'string',
      normalOrderLineId: 'string',
      orderStatus: 'string',
      instanceIds: 'string',
      orderErrorCode: 'string',
      orderErrorDescription: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryInstanceCapacityRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 租户ID，和租户名称二选一必填	
  tenantId?: string;
  // 8位租户名，和租户ID二选一必填	
  tenantName?: string;
  // 资源包状态，不传则默认查询有效；Valid：有效；Closed：已用完；Expired：已到期	
  // 
  status?: string;
  // 资源包商品码
  commodityCode?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      tenantId: 'tenant_id',
      tenantName: 'tenant_name',
      status: 'status',
      commodityCode: 'commodity_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      tenantId: 'string',
      tenantName: 'string',
      status: 'string',
      commodityCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryInstanceCapacityResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 实例容量列表
  instanceCapacitys?: InstanceCapacity[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      instanceCapacitys: 'instance_capacitys',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      instanceCapacitys: { 'type': 'array', 'itemType': InstanceCapacity },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMarketingCouponRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 租户ID
  tenantId: string;
  // 商品code
  productCodes: string[];
  // 优惠券类型:VOUCHER 抵用券, CERTAIN 满减券,DISCOUNT 折扣券
  couponType?: string;
  // 业务发生时间
  bizTime: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      tenantId: 'tenant_id',
      productCodes: 'product_codes',
      couponType: 'coupon_type',
      bizTime: 'biz_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      tenantId: 'string',
      productCodes: { 'type': 'array', 'itemType': 'string' },
      couponType: 'string',
      bizTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMarketingCouponResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 优惠券列表
  couponList?: Coupon[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      couponList: 'coupon_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      couponList: { 'type': 'array', 'itemType': Coupon },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SendMarketingCouponRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 外部业务流水号，用于幂等判断
  // 
  bizNo: string;
  // 租户ID
  // 
  tenantId: string;
  // 优惠券模板ID，营销后台申请获取
  // 
  templateId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      bizNo: 'biz_no',
      tenantId: 'tenant_id',
      templateId: 'template_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      bizNo: 'string',
      tenantId: 'string',
      templateId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SendMarketingCouponResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 优惠券id
  // 
  couponId?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      couponId: 'coupon_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      couponId: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncOfferCommonbuyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 请求id offerCode_yyyyMMddHHm0(最后一位固定为0幂等用，请求10分钟内只能触发一次)
  requestId: string;
  // 需要同步的商品code
  offerCode: string;
  // 操作人工号
  requestWorkNo: string;
  // 商品同步commonBuy的配置列表对应json
  offerCommonBuySyncInfo: OfferSyncCommonBuyInfo;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      requestId: 'request_id',
      offerCode: 'offer_code',
      requestWorkNo: 'request_work_no',
      offerCommonBuySyncInfo: 'offer_common_buy_sync_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      requestId: 'string',
      offerCode: 'string',
      requestWorkNo: 'string',
      offerCommonBuySyncInfo: OfferSyncCommonBuyInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncOfferCommonbuyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否触发同步商品信息异步处理
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

export class CreateOrderAfterRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 待开通类商品列表
  productList: string[];
  // 租户id
  tenantId: string;
  // 下单交易流水号，唯一
  bizNo: string;
  // 标签对象
  instanceLabels?: InstanceLabel[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productList: 'product_list',
      tenantId: 'tenant_id',
      bizNo: 'biz_no',
      instanceLabels: 'instance_labels',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productList: { 'type': 'array', 'itemType': 'string' },
      tenantId: 'string',
      bizNo: 'string',
      instanceLabels: { 'type': 'array', 'itemType': InstanceLabel },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateOrderAfterResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 业务流水号
  bizNo?: string;
  // 下单返回值。里面有实例id和二级订单号等关键字段。
  createOrderResponseList?: CreateOrderResult[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      bizNo: 'biz_no',
      createOrderResponseList: 'create_order_response_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      bizNo: 'string',
      createOrderResponseList: { 'type': 'array', 'itemType': CreateOrderResult },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateOrderWorkflowRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 待开通类商品列表
  productList: string[];
  // 租户id
  tenantId: string;
  // 下单交易流水号，唯一
  bizNo: string;
  // 标签对象
  instanceLabels: InstanceLabel[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productList: 'product_list',
      tenantId: 'tenant_id',
      bizNo: 'biz_no',
      instanceLabels: 'instance_labels',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productList: { 'type': 'array', 'itemType': 'string' },
      tenantId: 'string',
      bizNo: 'string',
      instanceLabels: { 'type': 'array', 'itemType': InstanceLabel },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateOrderWorkflowResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 下单返回值。里面有实例id和二级订单号等关键字段。
  createOrderResponseList?: CreateOrderResult[];
  // 下单流水号
  bizNo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      createOrderResponseList: 'create_order_response_list',
      bizNo: 'biz_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      createOrderResponseList: { 'type': 'array', 'itemType': CreateOrderResult },
      bizNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetComboRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 套餐编码
  comboCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      comboCode: 'combo_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      comboCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetComboResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 套餐结构
  combo?: Combo;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      combo: 'combo',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      combo: Combo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryComboPriceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 套餐编码
  comboCode: string;
  // 租户ID，和租户名二选一必填
  tenantId?: string;
  // 8位租户名，和租户ID二选一必填
  tenantName?: string;
  // 订单类型，新购：NEW，不填则默认NEW
  orderType?: string;
  // 优惠券ID
  couponId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      comboCode: 'combo_code',
      tenantId: 'tenant_id',
      tenantName: 'tenant_name',
      orderType: 'order_type',
      couponId: 'coupon_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      comboCode: 'string',
      tenantId: 'string',
      tenantName: 'string',
      orderType: 'string',
      couponId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryComboPriceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 套餐付款金额
  comboPayAmount?: string;
  // 套餐优惠金额
  comboCouponAmount?: string;
  // 套餐折扣金额
  comboDiscountAmount?: string;
  // 套餐原始金额
  comboOriginalAmount?: string;
  // 币种，元：CNY
  currency?: string;
  // 商品询价明细
  commodityEnquiryPrices?: CommodityEnquiryPrice[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      comboPayAmount: 'combo_pay_amount',
      comboCouponAmount: 'combo_coupon_amount',
      comboDiscountAmount: 'combo_discount_amount',
      comboOriginalAmount: 'combo_original_amount',
      currency: 'currency',
      commodityEnquiryPrices: 'commodity_enquiry_prices',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      comboPayAmount: 'string',
      comboCouponAmount: 'string',
      comboDiscountAmount: 'string',
      comboOriginalAmount: 'string',
      currency: 'string',
      commodityEnquiryPrices: { 'type': 'array', 'itemType': CommodityEnquiryPrice },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateComboOrderRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 场景接入码，中台分配
  sceneCode: string;
  // 业务流水号，用于幂等
  bizNo: string;
  // 套餐编码
  comboCode: string;
  // 租户ID，和租户名二选一必填
  // 
  tenantId?: string;
  // 8位租户名，和租户ID二选一必填
  // 
  tenantName?: string;
  // 操作人ID，为空则等于当前租户ID
  operatorId?: string;
  // 订购周期，当套餐中包含包周期型的商品，必填
  duration?: OrderDuration;
  // 优惠券ID
  couponId?: string;
  // [{"instance_key":"isvId","instance_value":"邀请码},{"instance_key":"policyId","instance_value":"政策id}]
  instanceLabels?: InstanceLabel[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      sceneCode: 'scene_code',
      bizNo: 'biz_no',
      comboCode: 'combo_code',
      tenantId: 'tenant_id',
      tenantName: 'tenant_name',
      operatorId: 'operator_id',
      duration: 'duration',
      couponId: 'coupon_id',
      instanceLabels: 'instance_labels',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      sceneCode: 'string',
      bizNo: 'string',
      comboCode: 'string',
      tenantId: 'string',
      tenantName: 'string',
      operatorId: 'string',
      duration: OrderDuration,
      couponId: 'string',
      instanceLabels: { 'type': 'array', 'itemType': InstanceLabel },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateComboOrderResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 套餐下单订单号
  comboOrderId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      comboOrderId: 'combo_order_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      comboOrderId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryComboOrderRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 租户ID，租户ID和租户名称二选一必填
  tenantId?: string;
  // 租户名称，租户ID和租户名称二选一必填
  tenantName?: string;
  // 订单状态
  status?: string;
  // 套餐编码
  comboCode?: string;
  // 下单开始时间
  beginTime?: string;
  // 下单结束时间
  endTime?: string;
  // 每页数量，不传默认20
  pageSize?: number;
  // 当前页数，不传则默认1
  pageNo?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      tenantId: 'tenant_id',
      tenantName: 'tenant_name',
      status: 'status',
      comboCode: 'combo_code',
      beginTime: 'begin_time',
      endTime: 'end_time',
      pageSize: 'page_size',
      pageNo: 'page_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      tenantId: 'string',
      tenantName: 'string',
      status: 'string',
      comboCode: 'string',
      beginTime: 'string',
      endTime: 'string',
      pageSize: 'number',
      pageNo: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryComboOrderResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 套餐订单列表
  orders?: ComboOrder[];
  // 总数
  totalCount?: number;
  // 当前页数
  pageNo?: number;
  // 每页数量
  pageSize?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      orders: 'orders',
      totalCount: 'total_count',
      pageNo: 'page_no',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      orders: { 'type': 'array', 'itemType': ComboOrder },
      totalCount: 'number',
      pageNo: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryComboRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 类目编码
  categoryCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      categoryCode: 'category_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      categoryCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryComboResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 套餐列表
  combos?: Combo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      combos: 'combos',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      combos: { 'type': 'array', 'itemType': Combo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PayComboOrderRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 套餐订单号
  comboOrderId: string;
  // 支付渠道，客资：FINANCIAL_FUND；财资：CUSTOMER_FUND；支付通：ALIPAY
  payChannel: string;
  // 支付模式，PAGE：页面确认支付；AUTO：系统自动扣款
  // 支付通模式只支持PAGE
  payMode: string;
  // 支付回跳地址，当pay_mode=PAGE时，必传
  payReturnUrl?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      comboOrderId: 'combo_order_id',
      payChannel: 'pay_channel',
      payMode: 'pay_mode',
      payReturnUrl: 'pay_return_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      comboOrderId: 'string',
      payChannel: 'string',
      payMode: 'string',
      payReturnUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PayComboOrderResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 页面支付地址
  payUrl?: string;
  // 支付订单号
  payOrderId?: string;
  // 支付状态，
  // SUCCESS：已支付;
  // INIT：未支付;
  // PROCESS：支付中;
  // CANCEL：取消支付;
  payStatus?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      payUrl: 'pay_url',
      payOrderId: 'pay_order_id',
      payStatus: 'pay_status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      payUrl: 'string',
      payOrderId: 'string',
      payStatus: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateOrderRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 业务流水号，调用方指定，幂等号
  bizNo: string;
  // 租户ID，和租户名称二选一必填
  tenantId?: string;
  // 租户名称，和租户ID二选一必填
  tenantName?: string;
  // 操作人ID，不填则默认和租户ID一致
  operatorId?: string;
  // 商品编码
  commodityCode: string;
  // 销售主体，不传默认ZL6
  ou?: string;
  // 订单类型，NEW：新购；RENEW：续费； MODIFY：变配
  // 不填默认新购
  orderType?: string;
  // 订购周期对象，当商品是周期订阅类型时，必填
  duration?: OrderDuration;
  // 优惠券ID
  couponId?: string;
  // 数量，不填默认1
  quantity?: number;
  // 商品订购属性，开通型商品部需要填写
  commodityAttrs?: CommodityOrderAttribute[];
  // 履约选项
  fulfillmentOptions?: FulfillmentOptions;
  // 支付选项
  payOptions?: PayOptions;
  // 价格策略
  priceStrategy?: PriceStrategy;
  // 实例ID，续费/变配场景必传
  instanceId?: string;
  // 售卖市场。10100000：鹊凿市场；12000002：国际ZAN市场；其他市场编码请联系中台获取
  saleMarket: string;
  // 扩展属性，JSON字符串
  extendedProperties?: string;
  // 批次流水号，外部合同下单场景，传入向中台申请的合同ID
  batchBizNo?: string;
  // 预付费订单金额。仅白名单商品且batchBizNo是合法的合同ID的情况，才允许指定预付订单金额
  prepayAmount?: PrepayAmount;
  // 后付商品签约价，用于在履约阶段生成一客一价
  postPayPrice?: PostPayPrice;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      bizNo: 'biz_no',
      tenantId: 'tenant_id',
      tenantName: 'tenant_name',
      operatorId: 'operator_id',
      commodityCode: 'commodity_code',
      ou: 'ou',
      orderType: 'order_type',
      duration: 'duration',
      couponId: 'coupon_id',
      quantity: 'quantity',
      commodityAttrs: 'commodity_attrs',
      fulfillmentOptions: 'fulfillment_options',
      payOptions: 'pay_options',
      priceStrategy: 'price_strategy',
      instanceId: 'instance_id',
      saleMarket: 'sale_market',
      extendedProperties: 'extended_properties',
      batchBizNo: 'batch_biz_no',
      prepayAmount: 'prepay_amount',
      postPayPrice: 'post_pay_price',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      bizNo: 'string',
      tenantId: 'string',
      tenantName: 'string',
      operatorId: 'string',
      commodityCode: 'string',
      ou: 'string',
      orderType: 'string',
      duration: OrderDuration,
      couponId: 'string',
      quantity: 'number',
      commodityAttrs: { 'type': 'array', 'itemType': CommodityOrderAttribute },
      fulfillmentOptions: FulfillmentOptions,
      payOptions: PayOptions,
      priceStrategy: PriceStrategy,
      instanceId: 'string',
      saleMarket: 'string',
      extendedProperties: 'string',
      batchBizNo: 'string',
      prepayAmount: PrepayAmount,
      postPayPrice: PostPayPrice,
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
  // 订单号
  orderId?: string;
  // 实例ID列表
  instanceIds?: string[];
  // 支付状态
  payStatus?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      orderId: 'order_id',
      instanceIds: 'instance_ids',
      payStatus: 'pay_status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      orderId: 'string',
      instanceIds: { 'type': 'array', 'itemType': 'string' },
      payStatus: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetComboOrderRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 套餐订单ID
  comboOrderId: string;
  // 是否包含履约信息
  includeFulfillInfo: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      comboOrderId: 'combo_order_id',
      includeFulfillInfo: 'include_fulfill_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      comboOrderId: 'string',
      includeFulfillInfo: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetComboOrderResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 套餐订单详情
  order?: ComboOrder;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      order: 'order',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      order: ComboOrder,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelOrderRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 订单ID
  // 
  orderId: string;
  // 下单时的租户ID
  tenantId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      orderId: 'order_id',
      tenantId: 'tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      orderId: 'string',
      tenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelOrderResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否取消成功
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

export class BatchcreateOrderRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  //  批量下单场景编码 BatchOrderSceneEnum.online_acboss.getCode()
  batchOrderScene: string;
  //  批量下单批次号
  batchOrderBsnNo: string;
  // 销售市场 com.antgroup.actradeprod.common.service.model.order.enums.SaleMarketEnum
  saleMarket: string;
  // 租户Id
  tenantId?: string;
  // 租户名称
  tenantName?: string;
  // 操作人ID，不填则默认和租户ID一致
  operatorId?: string;
  // 支付选项
  payOptions?: PayOptions;
  // 商品实例列表
  commodityInstanceList: CommodityInstance[];
  // 扩展属性，JSON字符串
  extendedProperties: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      batchOrderScene: 'batch_order_scene',
      batchOrderBsnNo: 'batch_order_bsn_no',
      saleMarket: 'sale_market',
      tenantId: 'tenant_id',
      tenantName: 'tenant_name',
      operatorId: 'operator_id',
      payOptions: 'pay_options',
      commodityInstanceList: 'commodity_instance_list',
      extendedProperties: 'extended_properties',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      batchOrderScene: 'string',
      batchOrderBsnNo: 'string',
      saleMarket: 'string',
      tenantId: 'string',
      tenantName: 'string',
      operatorId: 'string',
      payOptions: PayOptions,
      commodityInstanceList: { 'type': 'array', 'itemType': CommodityInstance },
      extendedProperties: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchcreateOrderResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 支付状态
  payStatus?: string;
  // 批量下单列表返回
  createTradeOrderResults?: CreateTradeOrderResult[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      payStatus: 'pay_status',
      createTradeOrderResults: 'create_trade_order_results',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      payStatus: 'string',
      createTradeOrderResults: { 'type': 'array', 'itemType': CreateTradeOrderResult },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchcancelOrderRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 批次号
  batchOrderBsnNo: string;
  // 租户Id
  tenantId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      batchOrderBsnNo: 'batch_order_bsn_no',
      tenantId: 'tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      batchOrderBsnNo: 'string',
      tenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchcancelOrderResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否取消成功
  // 
  result?: boolean;
  // 取消订单结果
  createTradeOrderResult?: CreateTradeOrderResult[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      result: 'result',
      createTradeOrderResult: 'create_trade_order_result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      result: 'boolean',
      createTradeOrderResult: { 'type': 'array', 'itemType': CreateTradeOrderResult },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecOrderRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 订单号
  orderId: string;
  // 租户标识
  tenantId: string;
  // 开通参数
  provisionOptions?: ProvisionOption;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      orderId: 'order_id',
      tenantId: 'tenant_id',
      provisionOptions: 'provision_options',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      orderId: 'string',
      tenantId: 'string',
      provisionOptions: ProvisionOption,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecOrderResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 执行结果
  success?: boolean;
  // 实例ID列表
  instanceIds?: string[];
  // 操作订单状态
  orderStatus?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      instanceIds: 'instance_ids',
      orderStatus: 'order_status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
      instanceIds: { 'type': 'array', 'itemType': 'string' },
      orderStatus: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RefundOrderRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 订单号
  orderId: string;
  // 租户标识
  tenantId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      orderId: 'order_id',
      tenantId: 'tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      orderId: 'string',
      tenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RefundOrderResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 订单号
  orderId?: string;
  // 执行结果
  success?: boolean;
  // 操作订单状态
  orderStatus?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      orderId: 'order_id',
      success: 'success',
      orderStatus: 'order_status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      orderId: 'string',
      success: 'boolean',
      orderStatus: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExistPricePersonalizedRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 租户ID
  tenantId: string;
  // 商品code
  productCode: string;
  // 收费项编码，只有当商品存在多收费项的时候需要传入
  priceObjectCode?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      tenantId: 'tenant_id',
      productCode: 'product_code',
      priceObjectCode: 'price_object_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      tenantId: 'string',
      productCode: 'string',
      priceObjectCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExistPricePersonalizedResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否存在
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

export class QueryPriceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 商品主数据编码
  commodityCode: string;
  // 租户ID，和租户名称二选一必填
  tenantId?: string;
  // 8位租户名，和租户ID二选一必选
  tenantName?: string;
  // 商品数量，不传则默认1
  quantity?: number;
  // 业务发生时间，不传则默认当前时间
  bizTime?: string;
  // 订购周期，基于周期定价的商品必填
  orderDuration?: OrderDuration;
  // 商品规格列表，按实际商品定义的和价格相关的属性传入
  // 1.续费询价不需要传
  // 2.变配询价需要传入变化的规格属性
  commodityOrderAttrs?: CommodityOrderAttribute[];
  // 币种，元：CNY，不传默认CNY
  currency?: string;
  // 优惠券ID
  couponId?: string;
  // 不填默认为NEW；NEW：新购；RENEW：续费；MODIFY：变配
  orderType?: string;
  // 实例ID，续费/变配场景必传
  instanceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      commodityCode: 'commodity_code',
      tenantId: 'tenant_id',
      tenantName: 'tenant_name',
      quantity: 'quantity',
      bizTime: 'biz_time',
      orderDuration: 'order_duration',
      commodityOrderAttrs: 'commodity_order_attrs',
      currency: 'currency',
      couponId: 'coupon_id',
      orderType: 'order_type',
      instanceId: 'instance_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      commodityCode: 'string',
      tenantId: 'string',
      tenantName: 'string',
      quantity: 'number',
      bizTime: 'string',
      orderDuration: OrderDuration,
      commodityOrderAttrs: { 'type': 'array', 'itemType': CommodityOrderAttribute },
      currency: 'string',
      couponId: 'string',
      orderType: 'string',
      instanceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryPriceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 商品询价结果
  commodityEnquiryPrice?: CommodityEnquiryPrice;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      commodityEnquiryPrice: 'commodity_enquiry_price',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      commodityEnquiryPrice: CommodityEnquiryPrice,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryWareslifeInstanceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 租户id
  tenantId: string;
  // 商品code
  productCodes: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      tenantId: 'tenant_id',
      productCodes: 'product_codes',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      tenantId: 'string',
      productCodes: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryWareslifeInstanceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 实例列表
  instances?: Instance[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      instances: 'instances',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      instances: { 'type': 'array', 'itemType': Instance },
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
          sdk_version: "3.15.4",
          _prod_code: "TRADE",
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
   * Description: 查询租户实例容量信息
   * Summary: 查询租户实例容量信息
   */
  async queryInstanceCapacity(request: QueryInstanceCapacityRequest): Promise<QueryInstanceCapacityResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryInstanceCapacityEx(request, headers, runtime);
  }

  /**
   * Description: 查询租户实例容量信息
   * Summary: 查询租户实例容量信息
   */
  async queryInstanceCapacityEx(request: QueryInstanceCapacityRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryInstanceCapacityResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryInstanceCapacityResponse>(await this.doRequest("1.0", "antcloud.trade.instance.capacity.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryInstanceCapacityResponse({}));
  }

  /**
   * Description: 优惠券列表查询接口
   * Summary: 优惠券列表查询接口
   */
  async queryMarketingCoupon(request: QueryMarketingCouponRequest): Promise<QueryMarketingCouponResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryMarketingCouponEx(request, headers, runtime);
  }

  /**
   * Description: 优惠券列表查询接口
   * Summary: 优惠券列表查询接口
   */
  async queryMarketingCouponEx(request: QueryMarketingCouponRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryMarketingCouponResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryMarketingCouponResponse>(await this.doRequest("1.0", "antcloud.trade.marketing.coupon.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryMarketingCouponResponse({}));
  }

  /**
   * Description: 优惠券发放接口，基于模板ID发送优惠券
   * Summary: 优惠券发放接口
   */
  async sendMarketingCoupon(request: SendMarketingCouponRequest): Promise<SendMarketingCouponResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.sendMarketingCouponEx(request, headers, runtime);
  }

  /**
   * Description: 优惠券发放接口，基于模板ID发送优惠券
   * Summary: 优惠券发放接口
   */
  async sendMarketingCouponEx(request: SendMarketingCouponRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SendMarketingCouponResponse> {
    Util.validateModel(request);
    return $tea.cast<SendMarketingCouponResponse>(await this.doRequest("1.0", "antcloud.trade.marketing.coupon.send", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SendMarketingCouponResponse({}));
  }

  /**
   * Description: 用于线下sit调试完成的商品commonBuy信息一件上线
   * Summary: 商品commonBuy配置信息同步
   */
  async syncOfferCommonbuy(request: SyncOfferCommonbuyRequest): Promise<SyncOfferCommonbuyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.syncOfferCommonbuyEx(request, headers, runtime);
  }

  /**
   * Description: 用于线下sit调试完成的商品commonBuy信息一件上线
   * Summary: 商品commonBuy配置信息同步
   */
  async syncOfferCommonbuyEx(request: SyncOfferCommonbuyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SyncOfferCommonbuyResponse> {
    Util.validateModel(request);
    return $tea.cast<SyncOfferCommonbuyResponse>(await this.doRequest("1.0", "antcloud.trade.offer.commonbuy.sync", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SyncOfferCommonbuyResponse({}));
  }

  /**
   * Description: 开通类商品自动下单接口，仅仅针对其下后付开通类商品。预付等涉及金额暂不支持。
   * Summary: 开通类商品自动下单接口
   */
  async createOrderAfter(request: CreateOrderAfterRequest): Promise<CreateOrderAfterResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createOrderAfterEx(request, headers, runtime);
  }

  /**
   * Description: 开通类商品自动下单接口，仅仅针对其下后付开通类商品。预付等涉及金额暂不支持。
   * Summary: 开通类商品自动下单接口
   */
  async createOrderAfterEx(request: CreateOrderAfterRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateOrderAfterResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateOrderAfterResponse>(await this.doRequest("1.0", "antcloud.trade.order.after.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateOrderAfterResponse({}));
  }

  /**
   * Description: 流程编排，创建商品开通接口
   * Summary: 能力编排-商品开通
   */
  async createOrderWorkflow(request: CreateOrderWorkflowRequest): Promise<CreateOrderWorkflowResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createOrderWorkflowEx(request, headers, runtime);
  }

  /**
   * Description: 流程编排，创建商品开通接口
   * Summary: 能力编排-商品开通
   */
  async createOrderWorkflowEx(request: CreateOrderWorkflowRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateOrderWorkflowResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateOrderWorkflowResponse>(await this.doRequest("1.0", "antcloud.trade.order.workflow.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateOrderWorkflowResponse({}));
  }

  /**
   * Description: 获取套餐详情接口
   * Summary: 获取套餐详情
   */
  async getCombo(request: GetComboRequest): Promise<GetComboResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getComboEx(request, headers, runtime);
  }

  /**
   * Description: 获取套餐详情接口
   * Summary: 获取套餐详情
   */
  async getComboEx(request: GetComboRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetComboResponse> {
    Util.validateModel(request);
    return $tea.cast<GetComboResponse>(await this.doRequest("1.0", "antcloud.trade.combo.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetComboResponse({}));
  }

  /**
   * Description: 套餐询价接口
   * Summary: 套餐询价接口
   */
  async queryComboPrice(request: QueryComboPriceRequest): Promise<QueryComboPriceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryComboPriceEx(request, headers, runtime);
  }

  /**
   * Description: 套餐询价接口
   * Summary: 套餐询价接口
   */
  async queryComboPriceEx(request: QueryComboPriceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryComboPriceResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryComboPriceResponse>(await this.doRequest("1.0", "antcloud.trade.combo.price.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryComboPriceResponse({}));
  }

  /**
   * Description: 套餐下单接口，支持部分渠道的自动支付
   * Summary: 套餐下单接口
   */
  async createComboOrder(request: CreateComboOrderRequest): Promise<CreateComboOrderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createComboOrderEx(request, headers, runtime);
  }

  /**
   * Description: 套餐下单接口，支持部分渠道的自动支付
   * Summary: 套餐下单接口
   */
  async createComboOrderEx(request: CreateComboOrderRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateComboOrderResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateComboOrderResponse>(await this.doRequest("1.0", "antcloud.trade.combo.order.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateComboOrderResponse({}));
  }

  /**
   * Description: 套餐订单列表分页查询接口
   * Summary: 套餐订单列表分页查询接口
   */
  async queryComboOrder(request: QueryComboOrderRequest): Promise<QueryComboOrderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryComboOrderEx(request, headers, runtime);
  }

  /**
   * Description: 套餐订单列表分页查询接口
   * Summary: 套餐订单列表分页查询接口
   */
  async queryComboOrderEx(request: QueryComboOrderRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryComboOrderResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryComboOrderResponse>(await this.doRequest("1.0", "antcloud.trade.combo.order.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryComboOrderResponse({}));
  }

  /**
   * Description: 查询套餐列表，支持分页查询
   * Summary: 查询套餐列表
   */
  async queryCombo(request: QueryComboRequest): Promise<QueryComboResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryComboEx(request, headers, runtime);
  }

  /**
   * Description: 查询套餐列表，支持分页查询
   * Summary: 查询套餐列表
   */
  async queryComboEx(request: QueryComboRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryComboResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryComboResponse>(await this.doRequest("1.0", "antcloud.trade.combo.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryComboResponse({}));
  }

  /**
   * Description: 套餐订单支付接口
   * Summary: 套餐订单支付接口
   */
  async payComboOrder(request: PayComboOrderRequest): Promise<PayComboOrderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.payComboOrderEx(request, headers, runtime);
  }

  /**
   * Description: 套餐订单支付接口
   * Summary: 套餐订单支付接口
   */
  async payComboOrderEx(request: PayComboOrderRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PayComboOrderResponse> {
    Util.validateModel(request);
    return $tea.cast<PayComboOrderResponse>(await this.doRequest("1.0", "antcloud.trade.combo.order.pay", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PayComboOrderResponse({}));
  }

  /**
   * Description: 单商品通用下单接口
   * Summary: 通用下单接口
   */
  async createOrder(request: CreateOrderRequest): Promise<CreateOrderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createOrderEx(request, headers, runtime);
  }

  /**
   * Description: 单商品通用下单接口
   * Summary: 通用下单接口
   */
  async createOrderEx(request: CreateOrderRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateOrderResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateOrderResponse>(await this.doRequest("1.0", "antcloud.trade.order.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateOrderResponse({}));
  }

  /**
   * Description: 套餐订单详情查询接口
   * Summary: 套餐订单详情查询接口
   */
  async getComboOrder(request: GetComboOrderRequest): Promise<GetComboOrderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getComboOrderEx(request, headers, runtime);
  }

  /**
   * Description: 套餐订单详情查询接口
   * Summary: 套餐订单详情查询接口
   */
  async getComboOrderEx(request: GetComboOrderRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetComboOrderResponse> {
    Util.validateModel(request);
    return $tea.cast<GetComboOrderResponse>(await this.doRequest("1.0", "antcloud.trade.combo.order.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetComboOrderResponse({}));
  }

  /**
   * Description: 取消下单接口
   * Summary: 取消下单接口
   */
  async cancelOrder(request: CancelOrderRequest): Promise<CancelOrderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.cancelOrderEx(request, headers, runtime);
  }

  /**
   * Description: 取消下单接口
   * Summary: 取消下单接口
   */
  async cancelOrderEx(request: CancelOrderRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CancelOrderResponse> {
    Util.validateModel(request);
    return $tea.cast<CancelOrderResponse>(await this.doRequest("1.0", "antcloud.trade.order.cancel", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CancelOrderResponse({}));
  }

  /**
   * Description: 商品通用批量下单接口
   * Summary: 通用批量下单接口
   */
  async batchcreateOrder(request: BatchcreateOrderRequest): Promise<BatchcreateOrderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchcreateOrderEx(request, headers, runtime);
  }

  /**
   * Description: 商品通用批量下单接口
   * Summary: 通用批量下单接口
   */
  async batchcreateOrderEx(request: BatchcreateOrderRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchcreateOrderResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchcreateOrderResponse>(await this.doRequest("1.0", "antcloud.trade.order.batchcreate", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchcreateOrderResponse({}));
  }

  /**
   * Description: 通用订单批量取消接口
   * Summary: 通用订单批量取消接口
   */
  async batchcancelOrder(request: BatchcancelOrderRequest): Promise<BatchcancelOrderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchcancelOrderEx(request, headers, runtime);
  }

  /**
   * Description: 通用订单批量取消接口
   * Summary: 通用订单批量取消接口
   */
  async batchcancelOrderEx(request: BatchcancelOrderRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchcancelOrderResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchcancelOrderResponse>(await this.doRequest("1.0", "antcloud.trade.order.batchcancel", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchcancelOrderResponse({}));
  }

  /**
   * Description: 在订单非自动履约场景，手动触发执行
   * Summary: 触发订单的履约执行
   */
  async execOrder(request: ExecOrderRequest): Promise<ExecOrderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execOrderEx(request, headers, runtime);
  }

  /**
   * Description: 在订单非自动履约场景，手动触发执行
   * Summary: 触发订单的履约执行
   */
  async execOrderEx(request: ExecOrderRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecOrderResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecOrderResponse>(await this.doRequest("1.0", "antcloud.trade.order.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecOrderResponse({}));
  }

  /**
   * Description: 在订单非自动履约场景，撤销订单并退款
   * Summary: 订单退款
   */
  async refundOrder(request: RefundOrderRequest): Promise<RefundOrderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.refundOrderEx(request, headers, runtime);
  }

  /**
   * Description: 在订单非自动履约场景，撤销订单并退款
   * Summary: 订单退款
   */
  async refundOrderEx(request: RefundOrderRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RefundOrderResponse> {
    Util.validateModel(request);
    return $tea.cast<RefundOrderResponse>(await this.doRequest("1.0", "antcloud.trade.order.refund", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RefundOrderResponse({}));
  }

  /**
   * Description: 仅支持查询租户在后付费商品下，是否存在个性化定价
   * Summary: 判断租户是否存在个性化定价
   */
  async existPricePersonalized(request: ExistPricePersonalizedRequest): Promise<ExistPricePersonalizedResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.existPricePersonalizedEx(request, headers, runtime);
  }

  /**
   * Description: 仅支持查询租户在后付费商品下，是否存在个性化定价
   * Summary: 判断租户是否存在个性化定价
   */
  async existPricePersonalizedEx(request: ExistPricePersonalizedRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExistPricePersonalizedResponse> {
    Util.validateModel(request);
    return $tea.cast<ExistPricePersonalizedResponse>(await this.doRequest("1.0", "antcloud.trade.price.personalized.exist", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExistPricePersonalizedResponse({}));
  }

  /**
   * Description: 单商品询价接口，支持抵扣优惠券和命中折扣活动
   * Summary: 商品询价接口
   */
  async queryPrice(request: QueryPriceRequest): Promise<QueryPriceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPriceEx(request, headers, runtime);
  }

  /**
   * Description: 单商品询价接口，支持抵扣优惠券和命中折扣活动
   * Summary: 商品询价接口
   */
  async queryPriceEx(request: QueryPriceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPriceResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPriceResponse>(await this.doRequest("1.0", "antcloud.trade.price.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPriceResponse({}));
  }

  /**
   * Description: 实例接口查询
   * Summary: 实例接口查询
   */
  async queryWareslifeInstance(request: QueryWareslifeInstanceRequest): Promise<QueryWareslifeInstanceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryWareslifeInstanceEx(request, headers, runtime);
  }

  /**
   * Description: 实例接口查询
   * Summary: 实例接口查询
   */
  async queryWareslifeInstanceEx(request: QueryWareslifeInstanceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryWareslifeInstanceResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryWareslifeInstanceResponse>(await this.doRequest("1.0", "antcloud.trade.wareslife.instance.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryWareslifeInstanceResponse({}));
  }

}
