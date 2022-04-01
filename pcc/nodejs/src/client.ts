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

// 约束条件列表
export class PriceConstraintConditionVO extends $tea.Model {
  // 约束ID
  id: number;
  // 价格约束ID
  priceConstraintId: number;
  // 规格条件CODE
  specConditionCode?: string;
  // 条件关系比较符
  operator?: string;
  // 待比较对象的值
  targetValue?: string;
  // 特定场景下set才会有值
  specConditionName?: string;
  // 特定场景下set才会有值
  targetValueName?: string;
  // 描述
  description?: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      priceConstraintId: 'price_constraint_id',
      specConditionCode: 'spec_condition_code',
      operator: 'operator',
      targetValue: 'target_value',
      specConditionName: 'spec_condition_name',
      targetValueName: 'target_value_name',
      description: 'description',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'number',
      priceConstraintId: 'number',
      specConditionCode: 'string',
      operator: 'string',
      targetValue: 'string',
      specConditionName: 'string',
      targetValueName: 'string',
      description: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// l5数据
export class OfferMaster extends $tea.Model {
  // 内部商品码
  innerCode: string;
  // 用于展示的格式化商品编码
  formatCode: string;
  // 外部商品编码
  outerCode: string;
  // 商品名称
  name: string;
  // 商品描述
  description: string;
  // 产品code
  productCode: string;
  // 渠道产品编码
  serviceCode: string;
  // l4编码
  spuCode: string;
  static names(): { [key: string]: string } {
    return {
      innerCode: 'inner_code',
      formatCode: 'format_code',
      outerCode: 'outer_code',
      name: 'name',
      description: 'description',
      productCode: 'product_code',
      serviceCode: 'service_code',
      spuCode: 'spu_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      innerCode: 'string',
      formatCode: 'string',
      outerCode: 'string',
      name: 'string',
      description: 'string',
      productCode: 'string',
      serviceCode: 'string',
      spuCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 约束结果
export class PriceConstraintResultVO extends $tea.Model {
  // 价格id
  id: number;
  // 价格约束ID
  priceConstraintId: number;
  // 基础价格费率
  basePrice?: string;
  // 基础保底价
  adjustPrice?: string;
  // BD销售最低价费率
  bdPrice?: string;
  // 成本价费率
  costPrice?: string;
  // 阶梯区间最小值
  ladderStart?: string;
  // 阶梯区间结束值
  ladderEnd?: string;
  // 价格单位，例如：元/每次
  priceUnit?: string;
  // 是否阶梯固定价
  ladderPriceFixed?: boolean;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      priceConstraintId: 'price_constraint_id',
      basePrice: 'base_price',
      adjustPrice: 'adjust_price',
      bdPrice: 'bd_price',
      costPrice: 'cost_price',
      ladderStart: 'ladder_start',
      ladderEnd: 'ladder_end',
      priceUnit: 'price_unit',
      ladderPriceFixed: 'ladder_price_fixed',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'number',
      priceConstraintId: 'number',
      basePrice: 'string',
      adjustPrice: 'string',
      bdPrice: 'string',
      costPrice: 'string',
      ladderStart: 'string',
      ladderEnd: 'string',
      priceUnit: 'string',
      ladderPriceFixed: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 潜客接受度市场逻辑明细
export class AcceptanceDetail extends $tea.Model {
  // 客户名称
  name?: string;
  // 客户价格
  price?: string;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      price: 'price',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      price: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 基于竞品及加成市场逻辑明细
export class AdditionDetail extends $tea.Model {
  // 友商名称
  name?: string;
  // 友商价格
  profit?: string;
  // 技术分调整
  technicalScore?: string;
  // 品牌分调整
  brandScore?: string;
  // BD权限价预估
  bdPricePredict?: string;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      profit: 'profit',
      technicalScore: 'technical_score',
      brandScore: 'brand_score',
      bdPricePredict: 'bd_price_predict',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      profit: 'string',
      technicalScore: 'string',
      brandScore: 'string',
      bdPricePredict: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 成本法信息
export class CostInfo extends $tea.Model {
  // 成本法原因
  costReason?: string;
  // 预期毛利率
  predictProfit?: string;
  static names(): { [key: string]: string } {
    return {
      costReason: 'cost_reason',
      predictProfit: 'predict_profit',
    };
  }

  static types(): { [key: string]: any } {
    return {
      costReason: 'string',
      predictProfit: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 定价计划对应的约束
export class PriceConstraintVO extends $tea.Model {
  // 定价计划ID
  id: number;
  // 定价计划ID
  pricePlanId: number;
  // 定价计划名称
  name?: string;
  // 描述
  description?: string;
  // 约束条件列表
  priceConstraintConditionVoList?: PriceConstraintConditionVO[];
  // 约束结果列表
  priceConstraintResultVoList?: PriceConstraintResultVO[];
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      pricePlanId: 'price_plan_id',
      name: 'name',
      description: 'description',
      priceConstraintConditionVoList: 'price_constraint_condition_vo_list',
      priceConstraintResultVoList: 'price_constraint_result_vo_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'number',
      pricePlanId: 'number',
      name: 'string',
      description: 'string',
      priceConstraintConditionVoList: { 'type': 'array', 'itemType': PriceConstraintConditionVO },
      priceConstraintResultVoList: { 'type': 'array', 'itemType': PriceConstraintResultVO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 客户价价值法信息
export class CustomerValueDetail extends $tea.Model {
  // 名称
  name?: string;
  // 友商价格
  profit?: string;
  // 蚂蚁收益
  antDivide?: string;
  // BD权限价预估
  bdPricePredict?: string;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      profit: 'profit',
      antDivide: 'ant_divide',
      bdPricePredict: 'bd_price_predict',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      profit: 'string',
      antDivide: 'string',
      bdPricePredict: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 价格限制策略
// 目前只支持保底价格配置
export class PriceLimitStrategyDTO extends $tea.Model {
  // 创建人
  creator?: string;
  // 修改人
  modifier?: string;
  // 是否删除
  deleted?: boolean;
  // 定价计划ID
  pricePlanId: number;
  // 保底周期,year年、month月
  durationType?: string;
  // 保底价格
  guaranteePrice?: string;
  // 产品成本
  guaranteeCostPrice?: string;
  static names(): { [key: string]: string } {
    return {
      creator: 'creator',
      modifier: 'modifier',
      deleted: 'deleted',
      pricePlanId: 'price_plan_id',
      durationType: 'duration_type',
      guaranteePrice: 'guarantee_price',
      guaranteeCostPrice: 'guarantee_cost_price',
    };
  }

  static types(): { [key: string]: any } {
    return {
      creator: 'string',
      modifier: 'string',
      deleted: 'boolean',
      pricePlanId: 'number',
      durationType: 'string',
      guaranteePrice: 'string',
      guaranteeCostPrice: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 市场法信息
export class MarketInfo extends $tea.Model {
  // 市场逻辑
  marketLogic?: string;
  // 潜客接受度
  acceptanceDetails?: AcceptanceDetail[];
  // 基于竞品及加成
  additionDetails?: AdditionDetail[];
  static names(): { [key: string]: string } {
    return {
      marketLogic: 'market_logic',
      acceptanceDetails: 'acceptance_details',
      additionDetails: 'addition_details',
    };
  }

  static types(): { [key: string]: any } {
    return {
      marketLogic: 'string',
      acceptanceDetails: { 'type': 'array', 'itemType': AcceptanceDetail },
      additionDetails: { 'type': 'array', 'itemType': AdditionDetail },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 产品线SPU
export class ProductSpu extends $tea.Model {
  // SPU编码
  spuCode: string;
  // SPU名称
  spuName: string;
  // spu描述
  spuDesc: string;
  // 交付模式，ONLINE/OFFLINE
  deliveryMode: string;
  // 归属产品码
  productCode: string;
  // 是否涉及一方化 
  involvedOneParty: boolean;
  // technical_product:技术产品，technical_service:技术服务，solution_se:标准解决方案，saas:标准化SaaS，saas+:SaaS +，trading_network:交易网络
  segment: string;
  // sku数据
  offerMaster: OfferMaster[];
  static names(): { [key: string]: string } {
    return {
      spuCode: 'spu_code',
      spuName: 'spu_name',
      spuDesc: 'spu_desc',
      deliveryMode: 'delivery_mode',
      productCode: 'product_code',
      involvedOneParty: 'involved_one_party',
      segment: 'segment',
      offerMaster: 'offer_master',
    };
  }

  static types(): { [key: string]: any } {
    return {
      spuCode: 'string',
      spuName: 'string',
      spuDesc: 'string',
      deliveryMode: 'string',
      productCode: 'string',
      involvedOneParty: 'boolean',
      segment: 'string',
      offerMaster: { 'type': 'array', 'itemType': OfferMaster },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// L3
export class BusinessProduct extends $tea.Model {
  // 业务产品code
  code: string;
  // 产品线名称
  name: string;
  // 归属业务线
  businessLine: string;
  // 归属产品线
  productLine: string;
  // spu列表
  productSpu: ProductSpu[];
  static names(): { [key: string]: string } {
    return {
      code: 'code',
      name: 'name',
      businessLine: 'business_line',
      productLine: 'product_line',
      productSpu: 'product_spu',
    };
  }

  static types(): { [key: string]: any } {
    return {
      code: 'string',
      name: 'string',
      businessLine: 'string',
      productLine: 'string',
      productSpu: { 'type': 'array', 'itemType': ProductSpu },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 定价计划
export class PricePlanVO extends $tea.Model {
  // 定价计划ID
  id: number;
  // 商品CODE
  commodityCode: string;
  // 定价对象CODE
  priceObjectCode: string;
  // 定价计划名称
  name: string;
  // 定价计划类型
  type: string;
  // 租户ID
  tenantId?: string;
  // 合同ID
  contractId?: string;
  // 政策ID
  policyId?: string;
  // 商务项目ID
  businessProjectId?: string;
  // 执行条件
  executeCondition?: string;
  // 优先级
  priority: number;
  // 价格匹配不到处理策略：抛异常，继续询价
  noMatchRule?: string;
  // 计价模式：公式、阶梯、自定义
  pricingMode?: string;
  // 计价方法：具体公式、阶梯方法、自定义
  pricingMethod?: string;
  // 阶梯区间类型，左开右闭/左闭右开
  ladderIntervalType?: string;
  // 父定价计划ID
  parentPricePlanId?: number;
  // 定价计划状态，编辑中、预发生效、线上生效、失效
  status: string;
  // 生效起始时间
  startTime?: string;
  // 生效结束时间
  endTime?: string;
  // 创建者
  creator?: string;
  // 修改者
  modifier?: string;
  // 创建时间
  gmtCreate: string;
  // 修改时间
  gmtModified: string;
  // 是否是基础价格
  basis?: string;
  // 价格条件，多个以分号分隔
  priceConditionCodes?: string;
  // 价格安全区间，格式 min,max如0,100
  priceSafeArea: string;
  // 关联模板
  templateCode?: string;
  // 关联审批流程
  bpmsProcessId?: string;
  // 定价策略
  strategy?: string;
  // 定价阶段
  priceStage?: string;
  // 定价计划对应的约束，只有在明确需要查询定价约束时才会手动set进去
  priceConstraintVoList?: PriceConstraintVO[];
  // 价格限制策略
  priceLimitStrategyDto?: PriceLimitStrategyDTO[];
  // 销售渠道
  saleChannel?: string[];
  // 官网售卖折扣设置
  officialSellDiscount?: string;
  // 客户法详情
  customerValueInfo?: CustomerValueDetail;
  // 市场法详情
  marketInfo?: MarketInfo;
  // 成本法详情
  costInfo?: CostInfo;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      commodityCode: 'commodity_code',
      priceObjectCode: 'price_object_code',
      name: 'name',
      type: 'type',
      tenantId: 'tenant_id',
      contractId: 'contract_id',
      policyId: 'policy_id',
      businessProjectId: 'business_project_id',
      executeCondition: 'execute_condition',
      priority: 'priority',
      noMatchRule: 'no_match_rule',
      pricingMode: 'pricing_mode',
      pricingMethod: 'pricing_method',
      ladderIntervalType: 'ladder_interval_type',
      parentPricePlanId: 'parent_price_plan_id',
      status: 'status',
      startTime: 'start_time',
      endTime: 'end_time',
      creator: 'creator',
      modifier: 'modifier',
      gmtCreate: 'gmt_create',
      gmtModified: 'gmt_modified',
      basis: 'basis',
      priceConditionCodes: 'price_condition_codes',
      priceSafeArea: 'price_safe_area',
      templateCode: 'template_code',
      bpmsProcessId: 'bpms_process_id',
      strategy: 'strategy',
      priceStage: 'price_stage',
      priceConstraintVoList: 'price_constraint_vo_list',
      priceLimitStrategyDto: 'price_limit_strategy_dto',
      saleChannel: 'sale_channel',
      officialSellDiscount: 'official_sell_discount',
      customerValueInfo: 'customer_value_info',
      marketInfo: 'market_info',
      costInfo: 'cost_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'number',
      commodityCode: 'string',
      priceObjectCode: 'string',
      name: 'string',
      type: 'string',
      tenantId: 'string',
      contractId: 'string',
      policyId: 'string',
      businessProjectId: 'string',
      executeCondition: 'string',
      priority: 'number',
      noMatchRule: 'string',
      pricingMode: 'string',
      pricingMethod: 'string',
      ladderIntervalType: 'string',
      parentPricePlanId: 'number',
      status: 'string',
      startTime: 'string',
      endTime: 'string',
      creator: 'string',
      modifier: 'string',
      gmtCreate: 'string',
      gmtModified: 'string',
      basis: 'string',
      priceConditionCodes: 'string',
      priceSafeArea: 'string',
      templateCode: 'string',
      bpmsProcessId: 'string',
      strategy: 'string',
      priceStage: 'string',
      priceConstraintVoList: { 'type': 'array', 'itemType': PriceConstraintVO },
      priceLimitStrategyDto: { 'type': 'array', 'itemType': PriceLimitStrategyDTO },
      saleChannel: { 'type': 'array', 'itemType': 'string' },
      officialSellDiscount: 'string',
      customerValueInfo: CustomerValueDetail,
      marketInfo: MarketInfo,
      costInfo: CostInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// L2
export class ProductLine extends $tea.Model {
  // 溯源产品
  code: string;
  // 产品线名称
  name: string;
  // 业务产品线code
  businessLineCode: string;
  // l3
  businessProduct: BusinessProduct[];
  static names(): { [key: string]: string } {
    return {
      code: 'code',
      name: 'name',
      businessLineCode: 'business_line_code',
      businessProduct: 'business_product',
    };
  }

  static types(): { [key: string]: any } {
    return {
      code: 'string',
      name: 'string',
      businessLineCode: 'string',
      businessProduct: { 'type': 'array', 'itemType': BusinessProduct },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 收费项结果明细
export class PriceObjectFee extends $tea.Model {
  // 收费项CODE
  priceObjectCode?: string;
  // 收费项名称
  priceObjectName?: string;
  // 高精度价格12位
  price?: string;
  // 价格类型，标准价格，一客一价
  priceType?: string;
  // 结算信息
  settleType?: string;
  // 币种
  currency?: string;
  // 命中的定价计划
  pricePlanVo?: PricePlanVO;
  // 命中的定价计划约束
  priceConstraintVo?: PriceConstraintVO;
  // 扩展信息
  extendsMap?: string;
  // BD销售价格区间
  bdPrice?: string;
  // 最低成本价
  costPrice?: string;
  static names(): { [key: string]: string } {
    return {
      priceObjectCode: 'price_object_code',
      priceObjectName: 'price_object_name',
      price: 'price',
      priceType: 'price_type',
      settleType: 'settle_type',
      currency: 'currency',
      pricePlanVo: 'price_plan_vo',
      priceConstraintVo: 'price_constraint_vo',
      extendsMap: 'extends_map',
      bdPrice: 'bd_price',
      costPrice: 'cost_price',
    };
  }

  static types(): { [key: string]: any } {
    return {
      priceObjectCode: 'string',
      priceObjectName: 'string',
      price: 'string',
      priceType: 'string',
      settleType: 'string',
      currency: 'string',
      pricePlanVo: PricePlanVO,
      priceConstraintVo: PriceConstraintVO,
      extendsMap: 'string',
      bdPrice: 'string',
      costPrice: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// Product基础信息，包含 code(产品码) ,name(产品名称),name_en(产品英文名)
export class ProductBaseInfo extends $tea.Model {
  // 产品码，系统内部识别
  code: string;
  // 产品名称
  name: string;
  // 产品英文名称
  nameEn?: string;
  // 产品短码，管理维度识别
  shortCode: string;
  static names(): { [key: string]: string } {
    return {
      code: 'code',
      name: 'name',
      nameEn: 'name_en',
      shortCode: 'short_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      code: 'string',
      name: 'string',
      nameEn: 'string',
      shortCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// L1
export class BusinessLine extends $tea.Model {
  // 产品线code
  code: string;
  // 1级产品线name
  name: string;
  // L2
  productLine: ProductLine[];
  static names(): { [key: string]: string } {
    return {
      code: 'code',
      name: 'name',
      productLine: 'product_line',
    };
  }

  static types(): { [key: string]: any } {
    return {
      code: 'string',
      name: 'string',
      productLine: { 'type': 'array', 'itemType': ProductLine },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 客户价值法信息
export class CustomerValueInfo extends $tea.Model {
  // 客户价价值法信息
  customerValueDetails?: CustomerValueDetail[];
  static names(): { [key: string]: string } {
    return {
      customerValueDetails: 'customer_value_details',
    };
  }

  static types(): { [key: string]: any } {
    return {
      customerValueDetails: { 'type': 'array', 'itemType': CustomerValueDetail },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 返回高精度12位价格,其他精度可使用工具类处理
export class InquiryPriceResponse extends $tea.Model {
  // 高精度12位价格
  price?: string;
  // 币种
  currency?: string;
  // BD销售价格(高精度12位)
  bdPrice?: string;
  // 最低成本价(高精度12位)
  costPrice?: string;
  // 收费项结果明细列表
  priceObjectFeeList?: PriceObjectFee[];
  static names(): { [key: string]: string } {
    return {
      price: 'price',
      currency: 'currency',
      bdPrice: 'bd_price',
      costPrice: 'cost_price',
      priceObjectFeeList: 'price_object_fee_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      price: 'string',
      currency: 'string',
      bdPrice: 'string',
      costPrice: 'string',
      priceObjectFeeList: { 'type': 'array', 'itemType': PriceObjectFee },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 商品结构
export class Commodity extends $tea.Model {
  // 商品编码
  code: string;
  // 商品名称
  name: string;
  // 商品状态
  status: string;
  static names(): { [key: string]: string } {
    return {
      code: 'code',
      name: 'name',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      code: 'string',
      name: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryProductRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 产品码,可以为空
  code?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      code: 'code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      code: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryProductResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 产品列表
  productArray?: ProductBaseInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      productArray: 'product_array',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      productArray: { 'type': 'array', 'itemType': ProductBaseInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExportCommodityConfigRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 商品编码
  commodityCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      commodityCode: 'commodity_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      commodityCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExportCommodityConfigResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 导出的商品配置数据
  config?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      config: 'config',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      config: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryCommodityRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 业务产品编码
  productCode?: string;
  // 商品状态
  status?: string;
  // 页数，不填则默认1
  pageNo?: number;
  // 每页页数，不填则默认20
  pageSize?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productCode: 'product_code',
      status: 'status',
      pageNo: 'page_no',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productCode: 'string',
      status: 'string',
      pageNo: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryCommodityResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 商品列表
  commodities?: Commodity[];
  // 商品总数
  totalCount?: number;
  // 当前页数
  pageNo?: number;
  // 每页页数
  pageSize?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      commodities: 'commodities',
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
      commodities: { 'type': 'array', 'itemType': Commodity },
      totalCount: 'number',
      pageNo: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportProductRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 幂等编码，需要唯一
  bizNo: string;
  // 所属业务线
  businessLine: string;
  // 所属产品线
  productLine: string;
  // 产品名称
  name: string;
  // 产品描述
  description: string;
  // pd
  pds: string[];
  // pd负责人
  pdLeaders: string[];
  // 研发负责人
  devLeaders: string[];
  // 研发人员
  devs?: string[];
  // 操作人
  operator: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      bizNo: 'biz_no',
      businessLine: 'business_line',
      productLine: 'product_line',
      name: 'name',
      description: 'description',
      pds: 'pds',
      pdLeaders: 'pd_leaders',
      devLeaders: 'dev_leaders',
      devs: 'devs',
      operator: 'operator',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      bizNo: 'string',
      businessLine: 'string',
      productLine: 'string',
      name: 'string',
      description: 'string',
      pds: { 'type': 'array', 'itemType': 'string' },
      pdLeaders: { 'type': 'array', 'itemType': 'string' },
      devLeaders: { 'type': 'array', 'itemType': 'string' },
      devs: { 'type': 'array', 'itemType': 'string' },
      operator: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportProductResponse extends $tea.Model {
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

export class QueryCommodityRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 关键词，模糊查询商品名称、商品code、商品格式化编码
  keyword: string;
  // 搜索返回条数限制
  limit?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      keyword: 'keyword',
      limit: 'limit',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      keyword: 'string',
      limit: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCommodityResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 商品列表
  commoditys?: Commodity[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      commoditys: 'commoditys',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      commoditys: { 'type': 'array', 'itemType': Commodity },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BindCommodityAccessRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 商品编码
  commodityCode: string;
  // 服务接入码
  accessCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      commodityCode: 'commodity_code',
      accessCode: 'access_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      commodityCode: 'string',
      accessCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BindCommodityAccessResponse extends $tea.Model {
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

export class QueryProductLineRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 是否查询l3级产品
  needProduct: boolean;
  // 是否查询l5
  needSku: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      needProduct: 'need_product',
      needSku: 'need_sku',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      needProduct: 'boolean',
      needSku: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryProductLineResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 产品树JSON字符串
  productTree?: BusinessLine[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      productTree: 'product_tree',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      productTree: { 'type': 'array', 'itemType': BusinessLine },
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
          sdk_version: "1.3.7",
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
   * Description: 产品列表查询接口
   * Summary: 产品列表查询接口
   */
  async queryProduct(request: QueryProductRequest): Promise<QueryProductResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryProductEx(request, headers, runtime);
  }

  /**
   * Description: 产品列表查询接口
   * Summary: 产品列表查询接口
   */
  async queryProductEx(request: QueryProductRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryProductResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryProductResponse>(await this.doRequest("1.0", "antcloud.pcc.product.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryProductResponse({}));
  }

  /**
   * Description: 导出商品配置数据，用于同步线上数据到线下
   * Summary: 导出商品配置数据
   */
  async exportCommodityConfig(request: ExportCommodityConfigRequest): Promise<ExportCommodityConfigResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.exportCommodityConfigEx(request, headers, runtime);
  }

  /**
   * Description: 导出商品配置数据，用于同步线上数据到线下
   * Summary: 导出商品配置数据
   */
  async exportCommodityConfigEx(request: ExportCommodityConfigRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExportCommodityConfigResponse> {
    Util.validateModel(request);
    return $tea.cast<ExportCommodityConfigResponse>(await this.doRequest("1.0", "antcloud.pcc.commodity.config.export", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExportCommodityConfigResponse({}));
  }

  /**
   * Description: 分页查询智科商品列表
   * Summary: 分页查询智科商品列表
   */
  async pagequeryCommodity(request: PagequeryCommodityRequest): Promise<PagequeryCommodityResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pagequeryCommodityEx(request, headers, runtime);
  }

  /**
   * Description: 分页查询智科商品列表
   * Summary: 分页查询智科商品列表
   */
  async pagequeryCommodityEx(request: PagequeryCommodityRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PagequeryCommodityResponse> {
    Util.validateModel(request);
    return $tea.cast<PagequeryCommodityResponse>(await this.doRequest("1.0", "antcloud.pcc.commodity.pagequery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PagequeryCommodityResponse({}));
  }

  /**
   * Description: 外部调用创建l3
   * Summary: 外部调用创建l3
   */
  async importProduct(request: ImportProductRequest): Promise<ImportProductResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.importProductEx(request, headers, runtime);
  }

  /**
   * Description: 外部调用创建l3
   * Summary: 外部调用创建l3
   */
  async importProductEx(request: ImportProductRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ImportProductResponse> {
    Util.validateModel(request);
    return $tea.cast<ImportProductResponse>(await this.doRequest("1.0", "antcloud.pcc.product.import", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ImportProductResponse({}));
  }

  /**
   * Description: 按照商品名称，编码模糊搜索商品，默认20条，最多100条
   * Summary: 按照商品名称模糊搜索商品
   */
  async queryCommodity(request: QueryCommodityRequest): Promise<QueryCommodityResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryCommodityEx(request, headers, runtime);
  }

  /**
   * Description: 按照商品名称，编码模糊搜索商品，默认20条，最多100条
   * Summary: 按照商品名称模糊搜索商品
   */
  async queryCommodityEx(request: QueryCommodityRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryCommodityResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryCommodityResponse>(await this.doRequest("1.0", "antcloud.pcc.commodity.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryCommodityResponse({}));
  }

  /**
   * Description: 商品绑定服务接入码access_code
   * Summary: 商品绑定服务接入码
   */
  async bindCommodityAccess(request: BindCommodityAccessRequest): Promise<BindCommodityAccessResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.bindCommodityAccessEx(request, headers, runtime);
  }

  /**
   * Description: 商品绑定服务接入码access_code
   * Summary: 商品绑定服务接入码
   */
  async bindCommodityAccessEx(request: BindCommodityAccessRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BindCommodityAccessResponse> {
    Util.validateModel(request);
    return $tea.cast<BindCommodityAccessResponse>(await this.doRequest("1.0", "antcloud.pcc.commodity.access.bind", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BindCommodityAccessResponse({}));
  }

  /**
   * Description: 查询产品树，可以查询 L1/L2 ，L1/L2/L3，L1/L2/L3/L4/L5
   * Summary: 查询产品树
   */
  async queryProductLine(request: QueryProductLineRequest): Promise<QueryProductLineResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryProductLineEx(request, headers, runtime);
  }

  /**
   * Description: 查询产品树，可以查询 L1/L2 ，L1/L2/L3，L1/L2/L3/L4/L5
   * Summary: 查询产品树
   */
  async queryProductLineEx(request: QueryProductLineRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryProductLineResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryProductLineResponse>(await this.doRequest("1.0", "antcloud.pcc.product.line.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryProductLineResponse({}));
  }

}
