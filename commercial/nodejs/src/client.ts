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

// 定价约束信息VO
export class PriceConstraintVO extends $tea.Model {
  // 规格条件Code
  specConditionCode: string;
  // 当前规格条件下可选值
  targetValue: string;
  // 基础价格
  basePrice: string;
  // bd价格
  bdPrice: string;
  // 成本价格
  costPrice: string;
  static names(): { [key: string]: string } {
    return {
      specConditionCode: 'spec_condition_code',
      targetValue: 'target_value',
      basePrice: 'base_price',
      bdPrice: 'bd_price',
      costPrice: 'cost_price',
    };
  }

  static types(): { [key: string]: any } {
    return {
      specConditionCode: 'string',
      targetValue: 'string',
      basePrice: 'string',
      bdPrice: 'string',
      costPrice: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 政策信息
export class Policy extends $tea.Model {
  // 政策id
  policyId: string;
  // 政策名称
  policyName: string;
  // 政策类型
  policyType: string;
  // 政策生效时间
  startTime: string;
  // 政策失效时间
  endTime: string;
  // 下架时间
  offlineTime?: string;
  // 政策状态
  policyStatus: string;
  // 创建者
  creator: string;
  // 修改者
  modifier: string;
  // 创建时间
  gmtCreate: string;
  // 修改时间
  gmtModified: string;
  static names(): { [key: string]: string } {
    return {
      policyId: 'policy_id',
      policyName: 'policy_name',
      policyType: 'policy_type',
      startTime: 'start_time',
      endTime: 'end_time',
      offlineTime: 'offline_time',
      policyStatus: 'policy_status',
      creator: 'creator',
      modifier: 'modifier',
      gmtCreate: 'gmt_create',
      gmtModified: 'gmt_modified',
    };
  }

  static types(): { [key: string]: any } {
    return {
      policyId: 'string',
      policyName: 'string',
      policyType: 'string',
      startTime: 'string',
      endTime: 'string',
      offlineTime: 'string',
      policyStatus: 'string',
      creator: 'string',
      modifier: 'string',
      gmtCreate: 'string',
      gmtModified: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 政策关联商品信息
export class PolicyCommodity extends $tea.Model {
  // 政策id
  policyId: string;
  // 商品code
  commodityCode: string;
  // 商品名称
  commodityName: string;
  // 商品描述
  commodityDesc?: string;
  static names(): { [key: string]: string } {
    return {
      policyId: 'policy_id',
      commodityCode: 'commodity_code',
      commodityName: 'commodity_name',
      commodityDesc: 'commodity_desc',
    };
  }

  static types(): { [key: string]: any } {
    return {
      policyId: 'string',
      commodityCode: 'string',
      commodityName: 'string',
      commodityDesc: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 类目信息
export class Catalog extends $tea.Model {
  // 类目id
  catalogId: number;
  // 类目名称
  catalogName: string;
  static names(): { [key: string]: string } {
    return {
      catalogId: 'catalog_id',
      catalogName: 'catalog_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      catalogId: 'number',
      catalogName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 定价计划信息VO
export class PricePlanVO extends $tea.Model {
  // 规格Code
  specCode: string;
  // 定价类型
  priceType: string;
  // 定价计划描述
  pricePlanDesc: string;
  // 定价约束列表
  priceConstraint: PriceConstraintVO[];
  static names(): { [key: string]: string } {
    return {
      specCode: 'spec_code',
      priceType: 'price_type',
      pricePlanDesc: 'price_plan_desc',
      priceConstraint: 'price_constraint',
    };
  }

  static types(): { [key: string]: any } {
    return {
      specCode: 'string',
      priceType: 'string',
      pricePlanDesc: 'string',
      priceConstraint: { 'type': 'array', 'itemType': PriceConstraintVO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// Pair
export class Pair extends $tea.Model {
  // key
  key: string;
  // value
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

// MultiCurrencyMoneyVO
export class MultiCurrencyMoneyVO extends $tea.Model {
  // amount
  amt: string;
  // ccy
  ccy: string;
  static names(): { [key: string]: string } {
    return {
      amt: 'amt',
      ccy: 'ccy',
    };
  }

  static types(): { [key: string]: any } {
    return {
      amt: 'string',
      ccy: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 发票电子邮箱
export class InvoiceEmail extends $tea.Model {
  // 电子邮箱
  email?: string;
  // 主键id
  id?: number;
  // 唯一id
  uniqueId?: string;
  static names(): { [key: string]: string } {
    return {
      email: 'email',
      id: 'id',
      uniqueId: 'unique_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      email: 'string',
      id: 'number',
      uniqueId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 政策信息扩展
export class PolicyDTO extends $tea.Model {
  // 政策信息
  policy: Policy;
  // 政策关联商品
  policyCommodity: PolicyCommodity;
  // 合同id
  agreementId?: string;
  // 签约状态
  signStatus: string;
  static names(): { [key: string]: string } {
    return {
      policy: 'policy',
      policyCommodity: 'policy_commodity',
      agreementId: 'agreement_id',
      signStatus: 'sign_status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      policy: Policy,
      policyCommodity: PolicyCommodity,
      agreementId: 'string',
      signStatus: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 规格信息VO
export class SpecVO extends $tea.Model {
  // 规格code
  specCode: string;
  // 规格名称
  specName: string;
  // 主要付款方式
  mainPayMethod: string;
  // 售卖模式
  salesMode: string;
  // 规格状态
  specStatus: string;
  // 规格描述
  desc: string;
  static names(): { [key: string]: string } {
    return {
      specCode: 'spec_code',
      specName: 'spec_name',
      mainPayMethod: 'main_pay_method',
      salesMode: 'sales_mode',
      specStatus: 'spec_status',
      desc: 'desc',
    };
  }

  static types(): { [key: string]: any } {
    return {
      specCode: 'string',
      specName: 'string',
      mainPayMethod: 'string',
      salesMode: 'string',
      specStatus: 'string',
      desc: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 产品信息VO
export class ProductVO extends $tea.Model {
  // 商品Code
  productCode: string;
  // 产品名称
  productName: string;
  // 产品oxm类型
  oxmType: string;
  // 产品描述
  desc: string;
  static names(): { [key: string]: string } {
    return {
      productCode: 'product_code',
      productName: 'product_name',
      oxmType: 'oxm_type',
      desc: 'desc',
    };
  }

  static types(): { [key: string]: any } {
    return {
      productCode: 'string',
      productName: 'string',
      oxmType: 'string',
      desc: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 发票寄送地址
export class InvoiceAddress extends $tea.Model {
  // 主键id
  id?: number;
  // 用户id
  userId: string;
  // 收件人
  addressee: string;
  // 地区
  area: string;
  // 地址
  address: string;
  // 电话
  telephone: string;
  // 邮编
  postCode: string;
  // 修改时间
  gmtModified?: string;
  // 创建时间
  gmtCreate?: string;
  // 唯一id
  uniqueId?: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      userId: 'user_id',
      addressee: 'addressee',
      area: 'area',
      address: 'address',
      telephone: 'telephone',
      postCode: 'post_code',
      gmtModified: 'gmt_modified',
      gmtCreate: 'gmt_create',
      uniqueId: 'unique_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'number',
      userId: 'string',
      addressee: 'string',
      area: 'string',
      address: 'string',
      telephone: 'string',
      postCode: 'string',
      gmtModified: 'string',
      gmtCreate: 'string',
      uniqueId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 新增规格VO
export class SpecAddVO extends $tea.Model {
  // 规格code
  specCode: string;
  // 产品Code
  productCode: string;
  // 商品code
  commodityCode: string;
  // 售卖模式
  salesMode: string;
  // 付费方式
  mainPayMethod: string;
  // 规格描述
  specDesc: string;
  // 规格名称
  specName: string;
  // 定价计划
  pricePlan: PricePlanVO;
  static names(): { [key: string]: string } {
    return {
      specCode: 'spec_code',
      productCode: 'product_code',
      commodityCode: 'commodity_code',
      salesMode: 'sales_mode',
      mainPayMethod: 'main_pay_method',
      specDesc: 'spec_desc',
      specName: 'spec_name',
      pricePlan: 'price_plan',
    };
  }

  static types(): { [key: string]: any } {
    return {
      specCode: 'string',
      productCode: 'string',
      commodityCode: 'string',
      salesMode: 'string',
      mainPayMethod: 'string',
      specDesc: 'string',
      specName: 'string',
      pricePlan: PricePlanVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 类目VO
export class CatalogVO extends $tea.Model {
  // 类目Id
  catalogId: number;
  // 类目名称
  catalogName: string;
  // 子类目列表
  childCatalogs: Catalog[];
  static names(): { [key: string]: string } {
    return {
      catalogId: 'catalog_id',
      catalogName: 'catalog_name',
      childCatalogs: 'child_catalogs',
    };
  }

  static types(): { [key: string]: any } {
    return {
      catalogId: 'number',
      catalogName: 'string',
      childCatalogs: { 'type': 'array', 'itemType': Catalog },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 规格售卖模式
export class SpecSalesMode extends $tea.Model {
  // 规格售卖模式
  salesModeCode: string;
  // 售卖模式
  salesModeName: string;
  static names(): { [key: string]: string } {
    return {
      salesModeCode: 'sales_mode_code',
      salesModeName: 'sales_mode_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      salesModeCode: 'string',
      salesModeName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 产品信息扩展
export class ProductDTO extends $tea.Model {
  // 产品信息
  productCode: string;
  // 产品名称
  productName: string;
  // 产品oxm类型
  oxmType: string;
  // 产品一级类目
  l1CatalogId: number;
  // 产品二级类目
  l2CatalogId: number;
  // 产品描述
  desc: string;
  static names(): { [key: string]: string } {
    return {
      productCode: 'product_code',
      productName: 'product_name',
      oxmType: 'oxm_type',
      l1CatalogId: 'l1_catalog_id',
      l2CatalogId: 'l2_catalog_id',
      desc: 'desc',
    };
  }

  static types(): { [key: string]: any } {
    return {
      productCode: 'string',
      productName: 'string',
      oxmType: 'string',
      l1CatalogId: 'number',
      l2CatalogId: 'number',
      desc: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 签约信息
export class PartnerPolicyRelation extends $tea.Model {
  // 合同id
  agreementId: string;
  // 服务商id
  spId: string;
  // 合同生效时间
  startTime: string;
  // 合同失效时间
  endTime: string;
  // 合同取消时间
  cancelTime?: string;
  // 政策id
  policyId: string;
  // 政策名称
  policyName: string;
  // 政策类型
  policyType: string;
  // 政策link
  policyLink?: string;
  // 政策所属ou
  policyOu?: string;
  // 结算类型
  settleType: string;
  // 修改时间
  gmtModified: string;
  // 创建时间
  gmtCreate: string;
  static names(): { [key: string]: string } {
    return {
      agreementId: 'agreement_id',
      spId: 'sp_id',
      startTime: 'start_time',
      endTime: 'end_time',
      cancelTime: 'cancel_time',
      policyId: 'policy_id',
      policyName: 'policy_name',
      policyType: 'policy_type',
      policyLink: 'policy_link',
      policyOu: 'policy_ou',
      settleType: 'settle_type',
      gmtModified: 'gmt_modified',
      gmtCreate: 'gmt_create',
    };
  }

  static types(): { [key: string]: any } {
    return {
      agreementId: 'string',
      spId: 'string',
      startTime: 'string',
      endTime: 'string',
      cancelTime: 'string',
      policyId: 'string',
      policyName: 'string',
      policyType: 'string',
      policyLink: 'string',
      policyOu: 'string',
      settleType: 'string',
      gmtModified: 'string',
      gmtCreate: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 发票信息
export class Invoice extends $tea.Model {
  // 主键id
  id?: number;
  // 用户id
  userId: string;
  // 纳税人类型
  taxpayerType: string;
  // 纳税人名称
  taxpayerName?: string;
  // 纳税人识别号
  taxpayerNo?: string;
  // 开户行名称
  bankName?: string;
  // 开户行账号
  bankAccount?: string;
  // 开户行地址
  address?: string;
  // 开户行电话
  telephone?: string;
  // 修改时间
  gmtModified?: string;
  // 创建时间
  gmtCreate?: string;
  // 唯一id
  uniqueId?: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      userId: 'user_id',
      taxpayerType: 'taxpayer_type',
      taxpayerName: 'taxpayer_name',
      taxpayerNo: 'taxpayer_no',
      bankName: 'bank_name',
      bankAccount: 'bank_account',
      address: 'address',
      telephone: 'telephone',
      gmtModified: 'gmt_modified',
      gmtCreate: 'gmt_create',
      uniqueId: 'unique_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'number',
      userId: 'string',
      taxpayerType: 'string',
      taxpayerName: 'string',
      taxpayerNo: 'string',
      bankName: 'string',
      bankAccount: 'string',
      address: 'string',
      telephone: 'string',
      gmtModified: 'string',
      gmtCreate: 'string',
      uniqueId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 已购买的规格实例信息(用于控制台查询)
export class PaidSpecInstance extends $tea.Model {
  // 规格实例id
  specInstanceId: string;
  // 规格名称
  specName: string;
  // 规格配置(描述)
  specConf?: string;
  // 实例开始时间
  startTime?: string;
  // 实例到期时间
  endTime?: string;
  // 规格实例的运行状态
  status: string;
  static names(): { [key: string]: string } {
    return {
      specInstanceId: 'spec_instance_id',
      specName: 'spec_name',
      specConf: 'spec_conf',
      startTime: 'start_time',
      endTime: 'end_time',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      specInstanceId: 'string',
      specName: 'string',
      specConf: 'string',
      startTime: 'string',
      endTime: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 订单信息VO
export class MainOrderVO extends $tea.Model {
  // order_no
  orderNo: string;
  // buyer
  buyer: string;
  // seller
  seller: string;
  // sp_id
  spId: string;
  // login_account
  loginAccount: string;
  // product_name
  productName: string;
  // money
  money: MultiCurrencyMoneyVO;
  // gmt_create
  gmtCreate: string;
  // gmt_modified
  gmtModified: string;
  // gmt_close
  gmtClose: string;
  // gmt_pay_success
  gmtPaySuccess: string;
  // order_status
  orderStatus: string;
  // order_type
  orderType: string;
  // order_origin
  orderOrigin: string;
  // order_level
  orderLevel: string;
  // pay_method
  payMethod: string;
  // orde_duration
  orderDuration: string;
  // parent_order_no
  parentOrderNo: string;
  // commodity_name
  commodityName: string;
  // spec_code
  specCode: string;
  // spec_name
  specName: string;
  // spec_desc
  specDesc: string;
  // order_detail
  orderDetail: string;
  // sub_order_include
  subOrderInclude: boolean;
  // spec_props
  specProps: Pair[];
  // ext_params
  extParams: Pair[];
  static names(): { [key: string]: string } {
    return {
      orderNo: 'order_no',
      buyer: 'buyer',
      seller: 'seller',
      spId: 'sp_id',
      loginAccount: 'login_account',
      productName: 'product_name',
      money: 'money',
      gmtCreate: 'gmt_create',
      gmtModified: 'gmt_modified',
      gmtClose: 'gmt_close',
      gmtPaySuccess: 'gmt_pay_success',
      orderStatus: 'order_status',
      orderType: 'order_type',
      orderOrigin: 'order_origin',
      orderLevel: 'order_level',
      payMethod: 'pay_method',
      orderDuration: 'order_duration',
      parentOrderNo: 'parent_order_no',
      commodityName: 'commodity_name',
      specCode: 'spec_code',
      specName: 'spec_name',
      specDesc: 'spec_desc',
      orderDetail: 'order_detail',
      subOrderInclude: 'sub_order_include',
      specProps: 'spec_props',
      extParams: 'ext_params',
    };
  }

  static types(): { [key: string]: any } {
    return {
      orderNo: 'string',
      buyer: 'string',
      seller: 'string',
      spId: 'string',
      loginAccount: 'string',
      productName: 'string',
      money: MultiCurrencyMoneyVO,
      gmtCreate: 'string',
      gmtModified: 'string',
      gmtClose: 'string',
      gmtPaySuccess: 'string',
      orderStatus: 'string',
      orderType: 'string',
      orderOrigin: 'string',
      orderLevel: 'string',
      payMethod: 'string',
      orderDuration: 'string',
      parentOrderNo: 'string',
      commodityName: 'string',
      specCode: 'string',
      specName: 'string',
      specDesc: 'string',
      orderDetail: 'string',
      subOrderInclude: 'boolean',
      specProps: { 'type': 'array', 'itemType': Pair },
      extParams: { 'type': 'array', 'itemType': Pair },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 商品信息VO
export class CommodityVO extends $tea.Model {
  // 商品Code
  commodityCode: string;
  // 商品名称
  commodityName: string;
  // 商品服务类型
  serviceType: string;
  // 商品来源
  sourceType: string;
  // 商品描述
  desc: string;
  static names(): { [key: string]: string } {
    return {
      commodityCode: 'commodity_code',
      commodityName: 'commodity_name',
      serviceType: 'service_type',
      sourceType: 'source_type',
      desc: 'desc',
    };
  }

  static types(): { [key: string]: any } {
    return {
      commodityCode: 'string',
      commodityName: 'string',
      serviceType: 'string',
      sourceType: 'string',
      desc: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 财务ap账单
export class ApBill extends $tea.Model {
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

// 纳税信息
export class TaxInfo extends $tea.Model {
  // 纳税人名称
  taxpayerName: string;
  // 纳税人识别号
  taxpayerNo: string;
  // 开户行名称
  bankName?: string;
  // 开户行账号
  bankAccount?: string;
  // 开户行地址
  address?: string;
  // 开户行电话
  telephone?: string;
  static names(): { [key: string]: string } {
    return {
      taxpayerName: 'taxpayer_name',
      taxpayerNo: 'taxpayer_no',
      bankName: 'bank_name',
      bankAccount: 'bank_account',
      address: 'address',
      telephone: 'telephone',
    };
  }

  static types(): { [key: string]: any } {
    return {
      taxpayerName: 'string',
      taxpayerNo: 'string',
      bankName: 'string',
      bankAccount: 'string',
      address: 'string',
      telephone: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 服务商开票信息
export class InvoiceInfo extends $tea.Model {
  // 发票类型
  invoiceType: string;
  // 发票编码
  invoiceCode: string;
  // 开票日期
  invoiceDate: string;
  // 发票信息槽
  invoiceSlots: string;
  // 税价合计
  totalAmt: string;
  static names(): { [key: string]: string } {
    return {
      invoiceType: 'invoice_type',
      invoiceCode: 'invoice_code',
      invoiceDate: 'invoice_date',
      invoiceSlots: 'invoice_slots',
      totalAmt: 'total_amt',
    };
  }

  static types(): { [key: string]: any } {
    return {
      invoiceType: 'string',
      invoiceCode: 'string',
      invoiceDate: 'string',
      invoiceSlots: 'string',
      totalAmt: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 产品code列表
export class ProductCodes extends $tea.Model {
  // 产品code列表
  productCodes: string[];
  static names(): { [key: string]: string } {
    return {
      productCodes: 'product_codes',
    };
  }

  static types(): { [key: string]: any } {
    return {
      productCodes: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 已售规格实例详细信息(用于开发商查询)
export class SoldSpecInstance extends $tea.Model {
  // 规格码
  specCode: string;
  // 规格实例id
  specInstanceId: string;
  // 规格实例运行状态.
  // 实例状态 STARTED 正常有效、STOPPED 停服、STAETED_IN_ARR 欠费运行中
  status: string;
  // 实例生效时间
  startTime?: string;
  // 实例计划停服时间
  planStopTime?: string;
  // 实例实际停服时间
  actualStopTime?: string;
  // 购买规格实例的商户id(商业中台用来唯一标识商户的id)
  merchantId: string;
  static names(): { [key: string]: string } {
    return {
      specCode: 'spec_code',
      specInstanceId: 'spec_instance_id',
      status: 'status',
      startTime: 'start_time',
      planStopTime: 'plan_stop_time',
      actualStopTime: 'actual_stop_time',
      merchantId: 'merchant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      specCode: 'string',
      specInstanceId: 'string',
      status: 'string',
      startTime: 'string',
      planStopTime: 'string',
      actualStopTime: 'string',
      merchantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 商品来源
export class CommoditySourceType extends $tea.Model {
  // 商品来源code
  typeCode: string;
  // 商品来源描述
  typeDesc: string;
  static names(): { [key: string]: string } {
    return {
      typeCode: 'type_code',
      typeDesc: 'type_desc',
    };
  }

  static types(): { [key: string]: any } {
    return {
      typeCode: 'string',
      typeDesc: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBillingcoreInvoiceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBillingcoreInvoiceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 发票信息
  invoice?: Invoice;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      invoice: 'invoice',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      invoice: Invoice,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBillingcoreInvoicelocRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBillingcoreInvoicelocResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 发票信息
  invoice?: Invoice;
  // 发票寄送地址
  invoiceAddress?: InvoiceAddress;
  // 发票电子邮箱
  invoiceEmail?: InvoiceEmail;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      invoice: 'invoice',
      invoiceAddress: 'invoice_address',
      invoiceEmail: 'invoice_email',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      invoice: Invoice,
      invoiceAddress: InvoiceAddress,
      invoiceEmail: InvoiceEmail,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddBillingcoreInvoiceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 请求唯一id，可以是时间戳
  requestUniqueId?: string;
  // 发票信息
  invoice: Invoice;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      requestUniqueId: 'request_unique_id',
      invoice: 'invoice',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      requestUniqueId: 'string',
      invoice: Invoice,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddBillingcoreInvoiceResponse extends $tea.Model {
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

export class UpdateBillingcoreInvoiceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 请求唯一id，可以是时间戳
  requestUniqueId?: string;
  // 发票信息
  invoice: Invoice;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      requestUniqueId: 'request_unique_id',
      invoice: 'invoice',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      requestUniqueId: 'string',
      invoice: Invoice,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateBillingcoreInvoiceResponse extends $tea.Model {
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

export class AddBillingcoreInvoiceaddressRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 请求唯一id，可以是时间戳
  requestUniqueId?: string;
  // 发票寄送地址
  invoiceAddress: InvoiceAddress;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      requestUniqueId: 'request_unique_id',
      invoiceAddress: 'invoice_address',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      requestUniqueId: 'string',
      invoiceAddress: InvoiceAddress,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddBillingcoreInvoiceaddressResponse extends $tea.Model {
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

export class UpdateBillingcoreInvoiceaddressRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 发票寄送地址
  invoiceAddress: InvoiceAddress;
  // 请求唯一id，可以是时间戳
  requestUniqueId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      invoiceAddress: 'invoice_address',
      requestUniqueId: 'request_unique_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      invoiceAddress: InvoiceAddress,
      requestUniqueId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateBillingcoreInvoiceaddressResponse extends $tea.Model {
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

export class AddBillingcoreInvoiceemailRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 请求唯一id，可以是时间戳
  requestUniqueId?: string;
  // 发票电子邮箱
  invoiceEmail: InvoiceEmail;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      requestUniqueId: 'request_unique_id',
      invoiceEmail: 'invoice_email',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      requestUniqueId: 'string',
      invoiceEmail: InvoiceEmail,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddBillingcoreInvoiceemailResponse extends $tea.Model {
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

export class UpdateBillingcoreInvoiceemailRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 请求唯一id，可以是时间戳
  requestUniqueId?: string;
  // 发票电子邮件信息
  invoiceEmail: InvoiceEmail;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      requestUniqueId: 'request_unique_id',
      invoiceEmail: 'invoice_email',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      requestUniqueId: 'string',
      invoiceEmail: InvoiceEmail,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateBillingcoreInvoiceemailResponse extends $tea.Model {
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

export class ApplyBillingcoreMerchantinvoiceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 订单号
  orderNo: string;
  // 发票信息
  invoice: Invoice;
  // 发票寄送地址
  invoiceAddress?: InvoiceAddress;
  // 发票电子邮箱
  invoiceEmail?: InvoiceEmail;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      orderNo: 'order_no',
      invoice: 'invoice',
      invoiceAddress: 'invoice_address',
      invoiceEmail: 'invoice_email',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      orderNo: 'string',
      invoice: Invoice,
      invoiceAddress: InvoiceAddress,
      invoiceEmail: InvoiceEmail,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyBillingcoreMerchantinvoiceResponse extends $tea.Model {
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

export class QueryBillingcoreMerchantinvoiceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 订单号
  orderNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      orderNo: 'order_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      orderNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBillingcoreMerchantinvoiceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 主键id
  id?: number;
  // 商户id
  merchantId?: string;
  // 订单号
  orderNo?: string;
  // 订单金额
  orderAmt?: string;
  // 币种
  ccy?: string;
  // 发票信息
  invoice?: Invoice;
  // 发票寄送地址
  invoiceAddress?: InvoiceAddress;
  // 发票电子邮箱
  invoiceEmail?: InvoiceEmail;
  // 创建时间
  gmtCreate?: string;
  // 修改时间
  gmtModified?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      id: 'id',
      merchantId: 'merchant_id',
      orderNo: 'order_no',
      orderAmt: 'order_amt',
      ccy: 'ccy',
      invoice: 'invoice',
      invoiceAddress: 'invoice_address',
      invoiceEmail: 'invoice_email',
      gmtCreate: 'gmt_create',
      gmtModified: 'gmt_modified',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      id: 'number',
      merchantId: 'string',
      orderNo: 'string',
      orderAmt: 'string',
      ccy: 'string',
      invoice: Invoice,
      invoiceAddress: InvoiceAddress,
      invoiceEmail: InvoiceEmail,
      gmtCreate: 'string',
      gmtModified: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBillingcoreSpbillRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 账单id
  billId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      billId: 'bill_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      billId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBillingcoreSpbillResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // ap账单
  apBill?: ApBill;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      apBill: 'ap_bill',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      apBill: ApBill,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryBillingcoreSpbillRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 当前页码
  current: number;
  // 每页记录数
  pageSize: number;
  // 开始时间
  startDate: string;
  // 结束时间
  endDate: string;
  // 账单状态
  status?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      current: 'current',
      pageSize: 'page_size',
      startDate: 'start_date',
      endDate: 'end_date',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      current: 'number',
      pageSize: 'number',
      startDate: 'string',
      endDate: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryBillingcoreSpbillResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 总页数
  totalPages?: number;
  // 当前页码
  current?: number;
  // 每页记录数
  pageSize?: number;
  // 总记录数
  total?: number;
  // 账单列表
  data?: ApBill;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      totalPages: 'total_pages',
      current: 'current',
      pageSize: 'page_size',
      total: 'total',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      totalPages: 'number',
      current: 'number',
      pageSize: 'number',
      total: 'number',
      data: ApBill,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyBillingcoreSpinvoiceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 账单号，多个时逗号分隔
  billNos: string;
  // 账单总金额
  billAmt: string;
  // 币种
  ccy: string;
  // 销售方信息
  sellerInfo: TaxInfo;
  // 购买方信息
  buyerInfo: TaxInfo;
  // 发票信息
  invoiceInfos: InvoiceInfo[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      billNos: 'bill_nos',
      billAmt: 'bill_amt',
      ccy: 'ccy',
      sellerInfo: 'seller_info',
      buyerInfo: 'buyer_info',
      invoiceInfos: 'invoice_infos',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      billNos: 'string',
      billAmt: 'string',
      ccy: 'string',
      sellerInfo: TaxInfo,
      buyerInfo: TaxInfo,
      invoiceInfos: { 'type': 'array', 'itemType': InvoiceInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyBillingcoreSpinvoiceResponse extends $tea.Model {
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

export class AllCommercialcoreCatalogRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AllCommercialcoreCatalogResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 全部类目树结构体
  catalogTrees?: CatalogVO[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      catalogTrees: 'catalog_trees',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      catalogTrees: { 'type': 'array', 'itemType': CatalogVO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListCommercialcoreProductRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 类目id
  catalogId: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      catalogId: 'catalog_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      catalogId: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListCommercialcoreProductResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 产品列表
  products?: ProductVO[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      products: 'products',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      products: { 'type': 'array', 'itemType': ProductVO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListCommercialcoreCommodityRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 商品code
  productCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productCode: 'product_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListCommercialcoreCommodityResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 商品列表
  commodities?: CommodityVO[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      commodities: 'commodities',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      commodities: { 'type': 'array', 'itemType': CommodityVO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListCommercialcoreSpecRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 商品code
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

export class ListCommercialcoreSpecResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 规格列表
  specs?: SpecVO[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      specs: 'specs',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      specs: { 'type': 'array', 'itemType': SpecVO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCommercialcoreSpecRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 规格code
  specCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      specCode: 'spec_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      specCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCommercialcoreSpecResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 定价计划
  pricePlan?: PricePlanVO;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      pricePlan: 'price_plan',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      pricePlan: PricePlanVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddCommercialcoreProductRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 产品code
  productCode: string;
  // 产品名称
  productName: string;
  // 产品oxm类型
  oxmType: string;
  // 产品一级类目
  l1CatalogId: number;
  // 产品二级类目
  l2CatalogId: number;
  // 产品描述
  desc?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productCode: 'product_code',
      productName: 'product_name',
      oxmType: 'oxm_type',
      l1CatalogId: 'l1_catalog_id',
      l2CatalogId: 'l2_catalog_id',
      desc: 'desc',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productCode: 'string',
      productName: 'string',
      oxmType: 'string',
      l1CatalogId: 'number',
      l2CatalogId: 'number',
      desc: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddCommercialcoreProductResponse extends $tea.Model {
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

export class UpdateCommercialcoreProductRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 产品code
  productCode: string;
  // 产品名称
  productName: string;
  // 产品oxm类型
  oxmType: string;
  // 产品一级类目
  l1CatalogId: number;
  // 产品二级类目
  l2CatalogId: number;
  // 产品描述xxx
  desc?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productCode: 'product_code',
      productName: 'product_name',
      oxmType: 'oxm_type',
      l1CatalogId: 'l1_catalog_id',
      l2CatalogId: 'l2_catalog_id',
      desc: 'desc',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productCode: 'string',
      productName: 'string',
      oxmType: 'string',
      l1CatalogId: 'number',
      l2CatalogId: 'number',
      desc: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateCommercialcoreProductResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 成功
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

export class BatchqueryCommercialcoreProductRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchqueryCommercialcoreProductResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 产品code列表
  productCodes?: string[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      productCodes: 'product_codes',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      productCodes: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCommercialcoreProductRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 产品code
  productCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productCode: 'product_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCommercialcoreProductResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 产品信息
  product?: ProductDTO;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      product: 'product',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      product: ProductDTO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCommercialcoreCommodityRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 产品code
  productCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productCode: 'product_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCommercialcoreCommodityResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 商品来源列表
  sourceTypes?: CommoditySourceType[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      sourceTypes: 'source_types',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      sourceTypes: { 'type': 'array', 'itemType': CommoditySourceType },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddCommercialcoreCommodityRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 商品code
  commodityCode: string;
  // 产品code
  productCode: string;
  // 商品名称
  commodityName: string;
  // 商品服务类型
  serviceType: string;
  // 商品来源
  sourceType: string;
  // 商品描述
  desc?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      commodityCode: 'commodity_code',
      productCode: 'product_code',
      commodityName: 'commodity_name',
      serviceType: 'service_type',
      sourceType: 'source_type',
      desc: 'desc',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      commodityCode: 'string',
      productCode: 'string',
      commodityName: 'string',
      serviceType: 'string',
      sourceType: 'string',
      desc: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddCommercialcoreCommodityResponse extends $tea.Model {
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

export class UpdateCommercialcoreCommodityRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 商品code
  commodityCode: string;
  // 产品code
  productCode: string;
  // 商品名称
  commodityName: string;
  // 商品服务类型
  serviceType: string;
  // 商品来源
  sourceType: string;
  // 商品描述
  desc?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      commodityCode: 'commodity_code',
      productCode: 'product_code',
      commodityName: 'commodity_name',
      serviceType: 'service_type',
      sourceType: 'source_type',
      desc: 'desc',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      commodityCode: 'string',
      productCode: 'string',
      commodityName: 'string',
      serviceType: 'string',
      sourceType: 'string',
      desc: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateCommercialcoreCommodityResponse extends $tea.Model {
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

export class BatchqueryCommercialcoreSpecRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 商品code
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

export class BatchqueryCommercialcoreSpecResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 规格售卖模式列表
  salesModes?: SpecSalesMode[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      salesModes: 'sales_modes',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      salesModes: { 'type': 'array', 'itemType': SpecSalesMode },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddCommercialcoreSpecRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 规格code
  specCode: string;
  // 产品code
  productCode: string;
  // 商品code
  commodityCode: string;
  // 售卖模式
  salesMode: string;
  // 主要付款方式
  mainPayMethod: string;
  // 规格描述
  specDesc?: string;
  // 规格名称
  specName: string;
  // 定价计划
  pricePlan: PricePlanVO;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      specCode: 'spec_code',
      productCode: 'product_code',
      commodityCode: 'commodity_code',
      salesMode: 'sales_mode',
      mainPayMethod: 'main_pay_method',
      specDesc: 'spec_desc',
      specName: 'spec_name',
      pricePlan: 'price_plan',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      specCode: 'string',
      productCode: 'string',
      commodityCode: 'string',
      salesMode: 'string',
      mainPayMethod: 'string',
      specDesc: 'string',
      specName: 'string',
      pricePlan: PricePlanVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddCommercialcoreSpecResponse extends $tea.Model {
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

export class UpdateCommercialcoreSpecRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 规格code
  specCode: string;
  // 规格名称
  specName: string;
  // 主要付款方式
  mainPayMethod?: string;
  // 售卖模式
  salesMode?: string;
  // 规格描述
  desc?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      specCode: 'spec_code',
      specName: 'spec_name',
      mainPayMethod: 'main_pay_method',
      salesMode: 'sales_mode',
      desc: 'desc',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      specCode: 'string',
      specName: 'string',
      mainPayMethod: 'string',
      salesMode: 'string',
      desc: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateCommercialcoreSpecResponse extends $tea.Model {
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

export class AuthCommercialcoreSpecRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 规格code
  specCode: string;
  // 规格状态
  specStatus: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      specCode: 'spec_code',
      specStatus: 'spec_status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      specCode: 'string',
      specStatus: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AuthCommercialcoreSpecResponse extends $tea.Model {
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

export class CheckCommercialcoreProductRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 产品code
  productCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productCode: 'product_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckCommercialcoreProductResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // true: code已存在 ；false : code不存在
  isDuplicate?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      isDuplicate: 'is_duplicate',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      isDuplicate: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddPartnercoreSignRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 政策id
  policyId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      policyId: 'policy_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      policyId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddPartnercoreSignResponse extends $tea.Model {
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

export class QueryPartnercorePolicyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 政策id
  policyId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      policyId: 'policy_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      policyId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryPartnercorePolicyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 政策信息扩展
  policyDto?: PolicyDTO;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      policyDto: 'policy_dto',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      policyDto: PolicyDTO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryPartnercorePolicyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 政策名称（字段保留） 不做调用
  policyName?: string;
  // 政策状态（字段保留） 不做调用
  policyStatus?: string;
  // 签约状态 SIGNED已签约 UNSIGNED 待签约
  signStatus?: string;
  // 当前页码
  current: number;
  // 每页记录数
  pageSize: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      policyName: 'policy_name',
      policyStatus: 'policy_status',
      signStatus: 'sign_status',
      current: 'current',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      policyName: 'string',
      policyStatus: 'string',
      signStatus: 'string',
      current: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryPartnercorePolicyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 政策信息扩展
  data?: PolicyDTO[];
  // 当前页码
  current?: number;
  // 每页记录数
  pageSize?: number;
  // 总记录数
  total?: number;
  // 总页数
  totalPages?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      current: 'current',
      pageSize: 'page_size',
      total: 'total',
      totalPages: 'total_pages',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: { 'type': 'array', 'itemType': PolicyDTO },
      current: 'number',
      pageSize: 'number',
      total: 'number',
      totalPages: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryPartnercoreSignRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 合同id
  agreementId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      agreementId: 'agreement_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      agreementId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryPartnercoreSignResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 合同信息
  partnerPolicyRelation?: PartnerPolicyRelation;
  // 政策信息扩展
  policyDto?: PolicyDTO;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      partnerPolicyRelation: 'partner_policy_relation',
      policyDto: 'policy_dto',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      partnerPolicyRelation: PartnerPolicyRelation,
      policyDto: PolicyDTO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchqueryTradecorePaidspecinstanceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 商业中台用来唯一标记商户的id
  merchantId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      merchantId: 'merchant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      merchantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchqueryTradecorePaidspecinstanceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 所有符合条件的规格实例的部分信息
  paidSpecInstances?: PaidSpecInstance[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      paidSpecInstances: 'paid_spec_instances',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      paidSpecInstances: { 'type': 'array', 'itemType': PaidSpecInstance },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchqueryTradecoreSoldspecinstanceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 商业中台用来唯一标记商户的id
  // merchant_id 与 merchant_login_main_id至少填一个
  merchantId?: string;
  // 商户(买家)登录主账号
  // merchant_id 与 merchant_login_main_id至少填一个
  merchantLoginMainId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      merchantId: 'merchant_id',
      merchantLoginMainId: 'merchant_login_main_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      merchantId: 'string',
      merchantLoginMainId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchqueryTradecoreSoldspecinstanceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 某开发商已售给某商户的所有规格实例信息
  soldSpecInstances?: SoldSpecInstance[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      soldSpecInstances: 'sold_spec_instances',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      soldSpecInstances: { 'type': 'array', 'itemType': SoldSpecInstance },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTradecoreMerchantinfoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 商业中台唯一标识商户的id
  merchantId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      merchantId: 'merchant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      merchantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTradecoreMerchantinfoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 商户的名称
  merchantName?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      merchantName: 'merchant_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      merchantName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateTradecorePayRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 订单编号
  orderNo: string;
  // 交易渠道编号
  channelNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      orderNo: 'order_no',
      channelNo: 'channel_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      orderNo: 'string',
      channelNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateTradecorePayResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // form表单信息
  formData?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      formData: 'form_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      formData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ReceiveTradecorePayRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 支付宝回调参数，参数可能变化，返回字符串
  notifyData: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      notifyData: 'notify_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      notifyData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ReceiveTradecorePayResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回success表示成功，否则失败
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

export class CancelTradecoreOrderRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 订单号
  orderNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      orderNo: 'order_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      orderNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelTradecoreOrderResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // main_order
  mainOrder?: MainOrderVO;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      mainOrder: 'main_order',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      mainOrder: MainOrderVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateTradecoreOrderRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // seller
  seller: string;
  // 开发环境可以用：0016010039
  spId: string;
  // product_name
  productName: string;
  // 开发环境可以用：3000.00  单位是元
  amt: string;
  // ccy
  ccy?: string;
  // 固定填写OFFICIAL_SITE
  orderOrigin: string;
  // LICENSE(软件许可),RENEW(软件许可更新和技术支持),SUBSCRIBE(软件订阅),PRE(包年包月),POST(按量付费),SERVICE(服务型)
  payMethod: string;
  // order_duration
  orderDuration: string;
  // commodity_name
  commodityName: string;
  // 开发环境可以用：10007
  specCode: string;
  // spec_name
  specName: string;
  // spec_desc
  specDesc?: string;
  // order_detail
  orderDetail?: string;
  // spec_props
  specProps: Pair[];
  // ext_params
  extParams?: Pair[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      seller: 'seller',
      spId: 'sp_id',
      productName: 'product_name',
      amt: 'amt',
      ccy: 'ccy',
      orderOrigin: 'order_origin',
      payMethod: 'pay_method',
      orderDuration: 'order_duration',
      commodityName: 'commodity_name',
      specCode: 'spec_code',
      specName: 'spec_name',
      specDesc: 'spec_desc',
      orderDetail: 'order_detail',
      specProps: 'spec_props',
      extParams: 'ext_params',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      seller: 'string',
      spId: 'string',
      productName: 'string',
      amt: 'string',
      ccy: 'string',
      orderOrigin: 'string',
      payMethod: 'string',
      orderDuration: 'string',
      commodityName: 'string',
      specCode: 'string',
      specName: 'string',
      specDesc: 'string',
      orderDetail: 'string',
      specProps: { 'type': 'array', 'itemType': Pair },
      extParams: { 'type': 'array', 'itemType': Pair },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateTradecoreOrderResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // main_order
  mainOrder?: MainOrderVO;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      mainOrder: 'main_order',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      mainOrder: MainOrderVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTradecoreOrderRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 订单号
  orderNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      orderNo: 'order_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      orderNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTradecoreOrderResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // main_order
  mainOrder?: MainOrderVO;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      mainOrder: 'main_order',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      mainOrder: MainOrderVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryTradecoreOrderRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 取值范围：NEW
  orderType?: string;
  // 取值范围：INIT、PAY_SUCCESS、CLOSED
  orderStatus?: string;
  // 取值范围：GMT_CREATE（订单创建时间）、GMT_PAY_SUCCESS（订单支付成功时间）
  sortColumn?: string;
  // 取值范围：ASC（升序）、DESC（降序）
  sortType?: string;
  // page_num
  pageNum?: number;
  // page_size
  pageSize?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      orderType: 'order_type',
      orderStatus: 'order_status',
      sortColumn: 'sort_column',
      sortType: 'sort_type',
      pageNum: 'page_num',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      orderType: 'string',
      orderStatus: 'string',
      sortColumn: 'string',
      sortType: 'string',
      pageNum: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryTradecoreOrderResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 总页数
  pages?: number;
  // 当前页码
  pageNum?: number;
  // page_size
  pageSize?: number;
  // total
  total?: number;
  // order_list
  orderList?: MainOrderVO[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      pages: 'pages',
      pageNum: 'page_num',
      pageSize: 'page_size',
      total: 'total',
      orderList: 'order_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      pages: 'number',
      pageNum: 'number',
      pageSize: 'number',
      total: 'number',
      orderList: { 'type': 'array', 'itemType': MainOrderVO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckTradecoreSpRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 服务商id
  spId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      spId: 'sp_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      spId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckTradecoreSpResponse extends $tea.Model {
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
          sdk_version: "1.0.26",
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
   * Description: 发票信息查询
   * Summary: 发票信息查询
   */
  async queryBillingcoreInvoice(request: QueryBillingcoreInvoiceRequest): Promise<QueryBillingcoreInvoiceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryBillingcoreInvoiceEx(request, headers, runtime);
  }

  /**
   * Description: 发票信息查询
   * Summary: 发票信息查询
   */
  async queryBillingcoreInvoiceEx(request: QueryBillingcoreInvoiceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryBillingcoreInvoiceResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBillingcoreInvoiceResponse>(await this.doRequest("1.0", "antcloud.commercial.billingcore.invoice.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryBillingcoreInvoiceResponse({}));
  }

  /**
   * Description: 发票地址信息查询
   * Summary: 发票地址信息查询
   */
  async queryBillingcoreInvoiceloc(request: QueryBillingcoreInvoicelocRequest): Promise<QueryBillingcoreInvoicelocResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryBillingcoreInvoicelocEx(request, headers, runtime);
  }

  /**
   * Description: 发票地址信息查询
   * Summary: 发票地址信息查询
   */
  async queryBillingcoreInvoicelocEx(request: QueryBillingcoreInvoicelocRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryBillingcoreInvoicelocResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBillingcoreInvoicelocResponse>(await this.doRequest("1.0", "antcloud.commercial.billingcore.invoiceloc.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryBillingcoreInvoicelocResponse({}));
  }

  /**
   * Description: 新增发票信息
   * Summary: 新增发票信息
   */
  async addBillingcoreInvoice(request: AddBillingcoreInvoiceRequest): Promise<AddBillingcoreInvoiceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.addBillingcoreInvoiceEx(request, headers, runtime);
  }

  /**
   * Description: 新增发票信息
   * Summary: 新增发票信息
   */
  async addBillingcoreInvoiceEx(request: AddBillingcoreInvoiceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AddBillingcoreInvoiceResponse> {
    Util.validateModel(request);
    return $tea.cast<AddBillingcoreInvoiceResponse>(await this.doRequest("1.0", "antcloud.commercial.billingcore.invoice.add", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AddBillingcoreInvoiceResponse({}));
  }

  /**
   * Description: 更新发票信息
   * Summary: 更新发票信息
   */
  async updateBillingcoreInvoice(request: UpdateBillingcoreInvoiceRequest): Promise<UpdateBillingcoreInvoiceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateBillingcoreInvoiceEx(request, headers, runtime);
  }

  /**
   * Description: 更新发票信息
   * Summary: 更新发票信息
   */
  async updateBillingcoreInvoiceEx(request: UpdateBillingcoreInvoiceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateBillingcoreInvoiceResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateBillingcoreInvoiceResponse>(await this.doRequest("1.0", "antcloud.commercial.billingcore.invoice.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateBillingcoreInvoiceResponse({}));
  }

  /**
   * Description: 新增发票地址
   * Summary: 新增发票地址
   */
  async addBillingcoreInvoiceaddress(request: AddBillingcoreInvoiceaddressRequest): Promise<AddBillingcoreInvoiceaddressResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.addBillingcoreInvoiceaddressEx(request, headers, runtime);
  }

  /**
   * Description: 新增发票地址
   * Summary: 新增发票地址
   */
  async addBillingcoreInvoiceaddressEx(request: AddBillingcoreInvoiceaddressRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AddBillingcoreInvoiceaddressResponse> {
    Util.validateModel(request);
    return $tea.cast<AddBillingcoreInvoiceaddressResponse>(await this.doRequest("1.0", "antcloud.commercial.billingcore.invoiceaddress.add", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AddBillingcoreInvoiceaddressResponse({}));
  }

  /**
   * Description: 更新发票地址信息
   * Summary: 更新发票地址信息
   */
  async updateBillingcoreInvoiceaddress(request: UpdateBillingcoreInvoiceaddressRequest): Promise<UpdateBillingcoreInvoiceaddressResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateBillingcoreInvoiceaddressEx(request, headers, runtime);
  }

  /**
   * Description: 更新发票地址信息
   * Summary: 更新发票地址信息
   */
  async updateBillingcoreInvoiceaddressEx(request: UpdateBillingcoreInvoiceaddressRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateBillingcoreInvoiceaddressResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateBillingcoreInvoiceaddressResponse>(await this.doRequest("1.0", "antcloud.commercial.billingcore.invoiceaddress.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateBillingcoreInvoiceaddressResponse({}));
  }

  /**
   * Description: 新增发票电子邮箱
   * Summary: 新增发票电子邮箱
   */
  async addBillingcoreInvoiceemail(request: AddBillingcoreInvoiceemailRequest): Promise<AddBillingcoreInvoiceemailResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.addBillingcoreInvoiceemailEx(request, headers, runtime);
  }

  /**
   * Description: 新增发票电子邮箱
   * Summary: 新增发票电子邮箱
   */
  async addBillingcoreInvoiceemailEx(request: AddBillingcoreInvoiceemailRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AddBillingcoreInvoiceemailResponse> {
    Util.validateModel(request);
    return $tea.cast<AddBillingcoreInvoiceemailResponse>(await this.doRequest("1.0", "antcloud.commercial.billingcore.invoiceemail.add", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AddBillingcoreInvoiceemailResponse({}));
  }

  /**
   * Description: 更新发票电子邮箱
   * Summary: 更新发票电子邮箱
   */
  async updateBillingcoreInvoiceemail(request: UpdateBillingcoreInvoiceemailRequest): Promise<UpdateBillingcoreInvoiceemailResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateBillingcoreInvoiceemailEx(request, headers, runtime);
  }

  /**
   * Description: 更新发票电子邮箱
   * Summary: 更新发票电子邮箱
   */
  async updateBillingcoreInvoiceemailEx(request: UpdateBillingcoreInvoiceemailRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateBillingcoreInvoiceemailResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateBillingcoreInvoiceemailResponse>(await this.doRequest("1.0", "antcloud.commercial.billingcore.invoiceemail.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateBillingcoreInvoiceemailResponse({}));
  }

  /**
   * Description: 商户开票申请
   * Summary: 商户开票申请
   */
  async applyBillingcoreMerchantinvoice(request: ApplyBillingcoreMerchantinvoiceRequest): Promise<ApplyBillingcoreMerchantinvoiceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyBillingcoreMerchantinvoiceEx(request, headers, runtime);
  }

  /**
   * Description: 商户开票申请
   * Summary: 商户开票申请
   */
  async applyBillingcoreMerchantinvoiceEx(request: ApplyBillingcoreMerchantinvoiceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyBillingcoreMerchantinvoiceResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyBillingcoreMerchantinvoiceResponse>(await this.doRequest("1.0", "antcloud.commercial.billingcore.merchantinvoice.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyBillingcoreMerchantinvoiceResponse({}));
  }

  /**
   * Description: 商户开票查询
   * Summary: 商户开票查询
   */
  async queryBillingcoreMerchantinvoice(request: QueryBillingcoreMerchantinvoiceRequest): Promise<QueryBillingcoreMerchantinvoiceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryBillingcoreMerchantinvoiceEx(request, headers, runtime);
  }

  /**
   * Description: 商户开票查询
   * Summary: 商户开票查询
   */
  async queryBillingcoreMerchantinvoiceEx(request: QueryBillingcoreMerchantinvoiceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryBillingcoreMerchantinvoiceResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBillingcoreMerchantinvoiceResponse>(await this.doRequest("1.0", "antcloud.commercial.billingcore.merchantinvoice.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryBillingcoreMerchantinvoiceResponse({}));
  }

  /**
   * Description: 查询服务商账单
   * Summary: 查询服务商账单
   */
  async queryBillingcoreSpbill(request: QueryBillingcoreSpbillRequest): Promise<QueryBillingcoreSpbillResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryBillingcoreSpbillEx(request, headers, runtime);
  }

  /**
   * Description: 查询服务商账单
   * Summary: 查询服务商账单
   */
  async queryBillingcoreSpbillEx(request: QueryBillingcoreSpbillRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryBillingcoreSpbillResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBillingcoreSpbillResponse>(await this.doRequest("1.0", "antcloud.commercial.billingcore.spbill.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryBillingcoreSpbillResponse({}));
  }

  /**
   * Description: 分页查询服务商账单
   * Summary: 分页查询服务商账单
   */
  async pagequeryBillingcoreSpbill(request: PagequeryBillingcoreSpbillRequest): Promise<PagequeryBillingcoreSpbillResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pagequeryBillingcoreSpbillEx(request, headers, runtime);
  }

  /**
   * Description: 分页查询服务商账单
   * Summary: 分页查询服务商账单
   */
  async pagequeryBillingcoreSpbillEx(request: PagequeryBillingcoreSpbillRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PagequeryBillingcoreSpbillResponse> {
    Util.validateModel(request);
    return $tea.cast<PagequeryBillingcoreSpbillResponse>(await this.doRequest("1.0", "antcloud.commercial.billingcore.spbill.pagequery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PagequeryBillingcoreSpbillResponse({}));
  }

  /**
   * Description: 服务商结算申请
   * Summary: 服务商结算申请
   */
  async applyBillingcoreSpinvoice(request: ApplyBillingcoreSpinvoiceRequest): Promise<ApplyBillingcoreSpinvoiceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyBillingcoreSpinvoiceEx(request, headers, runtime);
  }

  /**
   * Description: 服务商结算申请
   * Summary: 服务商结算申请
   */
  async applyBillingcoreSpinvoiceEx(request: ApplyBillingcoreSpinvoiceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyBillingcoreSpinvoiceResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyBillingcoreSpinvoiceResponse>(await this.doRequest("1.0", "antcloud.commercial.billingcore.spinvoice.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyBillingcoreSpinvoiceResponse({}));
  }

  /**
   * Description: 查询所有类目树
   * Summary: 查询所有类目树
   */
  async allCommercialcoreCatalog(request: AllCommercialcoreCatalogRequest): Promise<AllCommercialcoreCatalogResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.allCommercialcoreCatalogEx(request, headers, runtime);
  }

  /**
   * Description: 查询所有类目树
   * Summary: 查询所有类目树
   */
  async allCommercialcoreCatalogEx(request: AllCommercialcoreCatalogRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AllCommercialcoreCatalogResponse> {
    Util.validateModel(request);
    return $tea.cast<AllCommercialcoreCatalogResponse>(await this.doRequest("1.0", "antcloud.commercial.commercialcore.catalog.all", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AllCommercialcoreCatalogResponse({}));
  }

  /**
   * Description: 根据类目id查询产品列表
   * Summary: 查询产品列表
   */
  async listCommercialcoreProduct(request: ListCommercialcoreProductRequest): Promise<ListCommercialcoreProductResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listCommercialcoreProductEx(request, headers, runtime);
  }

  /**
   * Description: 根据类目id查询产品列表
   * Summary: 查询产品列表
   */
  async listCommercialcoreProductEx(request: ListCommercialcoreProductRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListCommercialcoreProductResponse> {
    Util.validateModel(request);
    return $tea.cast<ListCommercialcoreProductResponse>(await this.doRequest("1.0", "antcloud.commercial.commercialcore.product.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListCommercialcoreProductResponse({}));
  }

  /**
   * Description: 根据产品Code查询商品列表
   * Summary: 查询商品列表
   */
  async listCommercialcoreCommodity(request: ListCommercialcoreCommodityRequest): Promise<ListCommercialcoreCommodityResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listCommercialcoreCommodityEx(request, headers, runtime);
  }

  /**
   * Description: 根据产品Code查询商品列表
   * Summary: 查询商品列表
   */
  async listCommercialcoreCommodityEx(request: ListCommercialcoreCommodityRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListCommercialcoreCommodityResponse> {
    Util.validateModel(request);
    return $tea.cast<ListCommercialcoreCommodityResponse>(await this.doRequest("1.0", "antcloud.commercial.commercialcore.commodity.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListCommercialcoreCommodityResponse({}));
  }

  /**
   * Description: 根据商品code查询规格列表
   * Summary: 查询规格列表
   */
  async listCommercialcoreSpec(request: ListCommercialcoreSpecRequest): Promise<ListCommercialcoreSpecResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listCommercialcoreSpecEx(request, headers, runtime);
  }

  /**
   * Description: 根据商品code查询规格列表
   * Summary: 查询规格列表
   */
  async listCommercialcoreSpecEx(request: ListCommercialcoreSpecRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListCommercialcoreSpecResponse> {
    Util.validateModel(request);
    return $tea.cast<ListCommercialcoreSpecResponse>(await this.doRequest("1.0", "antcloud.commercial.commercialcore.spec.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListCommercialcoreSpecResponse({}));
  }

  /**
   * Description: 根据规格code查询规格定价计划
   * Summary: 查询规格定价计划
   */
  async queryCommercialcoreSpec(request: QueryCommercialcoreSpecRequest): Promise<QueryCommercialcoreSpecResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryCommercialcoreSpecEx(request, headers, runtime);
  }

  /**
   * Description: 根据规格code查询规格定价计划
   * Summary: 查询规格定价计划
   */
  async queryCommercialcoreSpecEx(request: QueryCommercialcoreSpecRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryCommercialcoreSpecResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryCommercialcoreSpecResponse>(await this.doRequest("1.0", "antcloud.commercial.commercialcore.spec.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryCommercialcoreSpecResponse({}));
  }

  /**
   * Description: 新增产品
   * Summary: 新增产品
   */
  async addCommercialcoreProduct(request: AddCommercialcoreProductRequest): Promise<AddCommercialcoreProductResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.addCommercialcoreProductEx(request, headers, runtime);
  }

  /**
   * Description: 新增产品
   * Summary: 新增产品
   */
  async addCommercialcoreProductEx(request: AddCommercialcoreProductRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AddCommercialcoreProductResponse> {
    Util.validateModel(request);
    return $tea.cast<AddCommercialcoreProductResponse>(await this.doRequest("1.0", "antcloud.commercial.commercialcore.product.add", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AddCommercialcoreProductResponse({}));
  }

  /**
   * Description: 更新产品
   * Summary: 更新产品
   */
  async updateCommercialcoreProduct(request: UpdateCommercialcoreProductRequest): Promise<UpdateCommercialcoreProductResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateCommercialcoreProductEx(request, headers, runtime);
  }

  /**
   * Description: 更新产品
   * Summary: 更新产品
   */
  async updateCommercialcoreProductEx(request: UpdateCommercialcoreProductRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateCommercialcoreProductResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateCommercialcoreProductResponse>(await this.doRequest("1.0", "antcloud.commercial.commercialcore.product.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateCommercialcoreProductResponse({}));
  }

  /**
   * Description: 查询产品code列表
   * Summary: 查询产品code列表
   */
  async batchqueryCommercialcoreProduct(request: BatchqueryCommercialcoreProductRequest): Promise<BatchqueryCommercialcoreProductResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchqueryCommercialcoreProductEx(request, headers, runtime);
  }

  /**
   * Description: 查询产品code列表
   * Summary: 查询产品code列表
   */
  async batchqueryCommercialcoreProductEx(request: BatchqueryCommercialcoreProductRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchqueryCommercialcoreProductResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchqueryCommercialcoreProductResponse>(await this.doRequest("1.0", "antcloud.commercial.commercialcore.product.batchquery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchqueryCommercialcoreProductResponse({}));
  }

  /**
   * Description: 根据产品code查询产品信息
   * Summary: 查询产品
   */
  async queryCommercialcoreProduct(request: QueryCommercialcoreProductRequest): Promise<QueryCommercialcoreProductResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryCommercialcoreProductEx(request, headers, runtime);
  }

  /**
   * Description: 根据产品code查询产品信息
   * Summary: 查询产品
   */
  async queryCommercialcoreProductEx(request: QueryCommercialcoreProductRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryCommercialcoreProductResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryCommercialcoreProductResponse>(await this.doRequest("1.0", "antcloud.commercial.commercialcore.product.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryCommercialcoreProductResponse({}));
  }

  /**
   * Description: 根据产品code查询商品来源
   * Summary: 查询商品来源
   */
  async queryCommercialcoreCommodity(request: QueryCommercialcoreCommodityRequest): Promise<QueryCommercialcoreCommodityResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryCommercialcoreCommodityEx(request, headers, runtime);
  }

  /**
   * Description: 根据产品code查询商品来源
   * Summary: 查询商品来源
   */
  async queryCommercialcoreCommodityEx(request: QueryCommercialcoreCommodityRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryCommercialcoreCommodityResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryCommercialcoreCommodityResponse>(await this.doRequest("1.0", "antcloud.commercial.commercialcore.commodity.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryCommercialcoreCommodityResponse({}));
  }

  /**
   * Description: 新增商品
   * Summary: 新增商品
   */
  async addCommercialcoreCommodity(request: AddCommercialcoreCommodityRequest): Promise<AddCommercialcoreCommodityResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.addCommercialcoreCommodityEx(request, headers, runtime);
  }

  /**
   * Description: 新增商品
   * Summary: 新增商品
   */
  async addCommercialcoreCommodityEx(request: AddCommercialcoreCommodityRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AddCommercialcoreCommodityResponse> {
    Util.validateModel(request);
    return $tea.cast<AddCommercialcoreCommodityResponse>(await this.doRequest("1.0", "antcloud.commercial.commercialcore.commodity.add", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AddCommercialcoreCommodityResponse({}));
  }

  /**
   * Description: 更新商品
   * Summary: 更新商品
   */
  async updateCommercialcoreCommodity(request: UpdateCommercialcoreCommodityRequest): Promise<UpdateCommercialcoreCommodityResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateCommercialcoreCommodityEx(request, headers, runtime);
  }

  /**
   * Description: 更新商品
   * Summary: 更新商品
   */
  async updateCommercialcoreCommodityEx(request: UpdateCommercialcoreCommodityRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateCommercialcoreCommodityResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateCommercialcoreCommodityResponse>(await this.doRequest("1.0", "antcloud.commercial.commercialcore.commodity.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateCommercialcoreCommodityResponse({}));
  }

  /**
   * Description: 根据商品code查询规格售卖模式
   * Summary: 查询规格售卖模式
   */
  async batchqueryCommercialcoreSpec(request: BatchqueryCommercialcoreSpecRequest): Promise<BatchqueryCommercialcoreSpecResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchqueryCommercialcoreSpecEx(request, headers, runtime);
  }

  /**
   * Description: 根据商品code查询规格售卖模式
   * Summary: 查询规格售卖模式
   */
  async batchqueryCommercialcoreSpecEx(request: BatchqueryCommercialcoreSpecRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchqueryCommercialcoreSpecResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchqueryCommercialcoreSpecResponse>(await this.doRequest("1.0", "antcloud.commercial.commercialcore.spec.batchquery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchqueryCommercialcoreSpecResponse({}));
  }

  /**
   * Description: 新增规格与定价计划
   * Summary: 新增规格与定价计划
   */
  async addCommercialcoreSpec(request: AddCommercialcoreSpecRequest): Promise<AddCommercialcoreSpecResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.addCommercialcoreSpecEx(request, headers, runtime);
  }

  /**
   * Description: 新增规格与定价计划
   * Summary: 新增规格与定价计划
   */
  async addCommercialcoreSpecEx(request: AddCommercialcoreSpecRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AddCommercialcoreSpecResponse> {
    Util.validateModel(request);
    return $tea.cast<AddCommercialcoreSpecResponse>(await this.doRequest("1.0", "antcloud.commercial.commercialcore.spec.add", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AddCommercialcoreSpecResponse({}));
  }

  /**
   * Description: 更新规格
   * Summary: 更新规格
   */
  async updateCommercialcoreSpec(request: UpdateCommercialcoreSpecRequest): Promise<UpdateCommercialcoreSpecResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateCommercialcoreSpecEx(request, headers, runtime);
  }

  /**
   * Description: 更新规格
   * Summary: 更新规格
   */
  async updateCommercialcoreSpecEx(request: UpdateCommercialcoreSpecRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateCommercialcoreSpecResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateCommercialcoreSpecResponse>(await this.doRequest("1.0", "antcloud.commercial.commercialcore.spec.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateCommercialcoreSpecResponse({}));
  }

  /**
   * Description: 修改规格状态
   * Summary: 修改规格状态
   */
  async authCommercialcoreSpec(request: AuthCommercialcoreSpecRequest): Promise<AuthCommercialcoreSpecResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.authCommercialcoreSpecEx(request, headers, runtime);
  }

  /**
   * Description: 修改规格状态
   * Summary: 修改规格状态
   */
  async authCommercialcoreSpecEx(request: AuthCommercialcoreSpecRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AuthCommercialcoreSpecResponse> {
    Util.validateModel(request);
    return $tea.cast<AuthCommercialcoreSpecResponse>(await this.doRequest("1.0", "antcloud.commercial.commercialcore.spec.auth", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AuthCommercialcoreSpecResponse({}));
  }

  /**
   * Description: 产品code查重校验
   * Summary: 产品code查重校验
   */
  async checkCommercialcoreProduct(request: CheckCommercialcoreProductRequest): Promise<CheckCommercialcoreProductResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.checkCommercialcoreProductEx(request, headers, runtime);
  }

  /**
   * Description: 产品code查重校验
   * Summary: 产品code查重校验
   */
  async checkCommercialcoreProductEx(request: CheckCommercialcoreProductRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CheckCommercialcoreProductResponse> {
    Util.validateModel(request);
    return $tea.cast<CheckCommercialcoreProductResponse>(await this.doRequest("1.0", "antcloud.commercial.commercialcore.product.check", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CheckCommercialcoreProductResponse({}));
  }

  /**
   * Description: 新增签约接口
   * Summary: 新增签约接口
   */
  async addPartnercoreSign(request: AddPartnercoreSignRequest): Promise<AddPartnercoreSignResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.addPartnercoreSignEx(request, headers, runtime);
  }

  /**
   * Description: 新增签约接口
   * Summary: 新增签约接口
   */
  async addPartnercoreSignEx(request: AddPartnercoreSignRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AddPartnercoreSignResponse> {
    Util.validateModel(request);
    return $tea.cast<AddPartnercoreSignResponse>(await this.doRequest("1.0", "antcloud.commercial.partnercore.sign.add", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AddPartnercoreSignResponse({}));
  }

  /**
   * Description: 政策详情查询
   * Summary: 政策详情查询
   */
  async queryPartnercorePolicy(request: QueryPartnercorePolicyRequest): Promise<QueryPartnercorePolicyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPartnercorePolicyEx(request, headers, runtime);
  }

  /**
   * Description: 政策详情查询
   * Summary: 政策详情查询
   */
  async queryPartnercorePolicyEx(request: QueryPartnercorePolicyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPartnercorePolicyResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPartnercorePolicyResponse>(await this.doRequest("1.0", "antcloud.commercial.partnercore.policy.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPartnercorePolicyResponse({}));
  }

  /**
   * Description: 政策分页查询
   * Summary: 政策分页查询
   */
  async pagequeryPartnercorePolicy(request: PagequeryPartnercorePolicyRequest): Promise<PagequeryPartnercorePolicyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pagequeryPartnercorePolicyEx(request, headers, runtime);
  }

  /**
   * Description: 政策分页查询
   * Summary: 政策分页查询
   */
  async pagequeryPartnercorePolicyEx(request: PagequeryPartnercorePolicyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PagequeryPartnercorePolicyResponse> {
    Util.validateModel(request);
    return $tea.cast<PagequeryPartnercorePolicyResponse>(await this.doRequest("1.0", "antcloud.commercial.partnercore.policy.pagequery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PagequeryPartnercorePolicyResponse({}));
  }

  /**
   * Description: 签约信息查询
   * Summary: 签约信息查询
   */
  async queryPartnercoreSign(request: QueryPartnercoreSignRequest): Promise<QueryPartnercoreSignResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPartnercoreSignEx(request, headers, runtime);
  }

  /**
   * Description: 签约信息查询
   * Summary: 签约信息查询
   */
  async queryPartnercoreSignEx(request: QueryPartnercoreSignRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPartnercoreSignResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPartnercoreSignResponse>(await this.doRequest("1.0", "antcloud.commercial.partnercore.sign.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPartnercoreSignResponse({}));
  }

  /**
   * Description: 根具商户id获取商户已购的规格实例的详细信息(包含规格名称、描述等)；该接口用与商户控制台显示商户已购规格信息
   * Summary: 批量获取商户已购规格实例信息-控制台用
   */
  async batchqueryTradecorePaidspecinstance(request: BatchqueryTradecorePaidspecinstanceRequest): Promise<BatchqueryTradecorePaidspecinstanceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchqueryTradecorePaidspecinstanceEx(request, headers, runtime);
  }

  /**
   * Description: 根具商户id获取商户已购的规格实例的详细信息(包含规格名称、描述等)；该接口用与商户控制台显示商户已购规格信息
   * Summary: 批量获取商户已购规格实例信息-控制台用
   */
  async batchqueryTradecorePaidspecinstanceEx(request: BatchqueryTradecorePaidspecinstanceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchqueryTradecorePaidspecinstanceResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchqueryTradecorePaidspecinstanceResponse>(await this.doRequest("1.0", "antcloud.commercial.tradecore.paidspecinstance.batchquery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchqueryTradecorePaidspecinstanceResponse({}));
  }

  /**
   * Description: 根据商户id和开发商id获取已售给某商户的所有规格实例的详细信息(不包含规格名称、描述等)；该接口用于开发商查询
   * Summary: 获取已售给商户的规格实例信息-开发商用 
   */
  async batchqueryTradecoreSoldspecinstance(request: BatchqueryTradecoreSoldspecinstanceRequest): Promise<BatchqueryTradecoreSoldspecinstanceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchqueryTradecoreSoldspecinstanceEx(request, headers, runtime);
  }

  /**
   * Description: 根据商户id和开发商id获取已售给某商户的所有规格实例的详细信息(不包含规格名称、描述等)；该接口用于开发商查询
   * Summary: 获取已售给商户的规格实例信息-开发商用 
   */
  async batchqueryTradecoreSoldspecinstanceEx(request: BatchqueryTradecoreSoldspecinstanceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchqueryTradecoreSoldspecinstanceResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchqueryTradecoreSoldspecinstanceResponse>(await this.doRequest("1.0", "antcloud.commercial.tradecore.soldspecinstance.batchquery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchqueryTradecoreSoldspecinstanceResponse({}));
  }

  /**
   * Description: 根据商户id、开发商id获取存在服务关系的商户信息(开发商用)
   * Summary: 获取商户信息-开发商用
   */
  async queryTradecoreMerchantinfo(request: QueryTradecoreMerchantinfoRequest): Promise<QueryTradecoreMerchantinfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryTradecoreMerchantinfoEx(request, headers, runtime);
  }

  /**
   * Description: 根据商户id、开发商id获取存在服务关系的商户信息(开发商用)
   * Summary: 获取商户信息-开发商用
   */
  async queryTradecoreMerchantinfoEx(request: QueryTradecoreMerchantinfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryTradecoreMerchantinfoResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTradecoreMerchantinfoResponse>(await this.doRequest("1.0", "antcloud.commercial.tradecore.merchantinfo.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryTradecoreMerchantinfoResponse({}));
  }

  /**
   * Description: 创建支付单，调用支付宝接口获取收银台触发表单
   * Summary: 支付创建
   */
  async createTradecorePay(request: CreateTradecorePayRequest): Promise<CreateTradecorePayResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createTradecorePayEx(request, headers, runtime);
  }

  /**
   * Description: 创建支付单，调用支付宝接口获取收银台触发表单
   * Summary: 支付创建
   */
  async createTradecorePayEx(request: CreateTradecorePayRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateTradecorePayResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateTradecorePayResponse>(await this.doRequest("1.0", "antcloud.commercial.tradecore.pay.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateTradecorePayResponse({}));
  }

  /**
   * Description: 支付宝支付结果回调
   * Summary: 支付结果回调
   */
  async receiveTradecorePay(request: ReceiveTradecorePayRequest): Promise<ReceiveTradecorePayResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.receiveTradecorePayEx(request, headers, runtime);
  }

  /**
   * Description: 支付宝支付结果回调
   * Summary: 支付结果回调
   */
  async receiveTradecorePayEx(request: ReceiveTradecorePayRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ReceiveTradecorePayResponse> {
    Util.validateModel(request);
    return $tea.cast<ReceiveTradecorePayResponse>(await this.doRequest("1.0", "antcloud.commercial.tradecore.pay.receive", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ReceiveTradecorePayResponse({}));
  }

  /**
   * Description: 订单取消
   * Summary: 订单取消
   */
  async cancelTradecoreOrder(request: CancelTradecoreOrderRequest): Promise<CancelTradecoreOrderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.cancelTradecoreOrderEx(request, headers, runtime);
  }

  /**
   * Description: 订单取消
   * Summary: 订单取消
   */
  async cancelTradecoreOrderEx(request: CancelTradecoreOrderRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CancelTradecoreOrderResponse> {
    Util.validateModel(request);
    return $tea.cast<CancelTradecoreOrderResponse>(await this.doRequest("1.0", "antcloud.commercial.tradecore.order.cancel", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CancelTradecoreOrderResponse({}));
  }

  /**
   * Description: 订单创建
   * Summary: 订单创建
   */
  async createTradecoreOrder(request: CreateTradecoreOrderRequest): Promise<CreateTradecoreOrderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createTradecoreOrderEx(request, headers, runtime);
  }

  /**
   * Description: 订单创建
   * Summary: 订单创建
   */
  async createTradecoreOrderEx(request: CreateTradecoreOrderRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateTradecoreOrderResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateTradecoreOrderResponse>(await this.doRequest("1.0", "antcloud.commercial.tradecore.order.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateTradecoreOrderResponse({}));
  }

  /**
   * Description: 订单查询
   * Summary: 订单查询
   */
  async queryTradecoreOrder(request: QueryTradecoreOrderRequest): Promise<QueryTradecoreOrderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryTradecoreOrderEx(request, headers, runtime);
  }

  /**
   * Description: 订单查询
   * Summary: 订单查询
   */
  async queryTradecoreOrderEx(request: QueryTradecoreOrderRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryTradecoreOrderResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTradecoreOrderResponse>(await this.doRequest("1.0", "antcloud.commercial.tradecore.order.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryTradecoreOrderResponse({}));
  }

  /**
   * Description: 订单分页查询
   * Summary: 订单分页查询
   */
  async pagequeryTradecoreOrder(request: PagequeryTradecoreOrderRequest): Promise<PagequeryTradecoreOrderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pagequeryTradecoreOrderEx(request, headers, runtime);
  }

  /**
   * Description: 订单分页查询
   * Summary: 订单分页查询
   */
  async pagequeryTradecoreOrderEx(request: PagequeryTradecoreOrderRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PagequeryTradecoreOrderResponse> {
    Util.validateModel(request);
    return $tea.cast<PagequeryTradecoreOrderResponse>(await this.doRequest("1.0", "antcloud.commercial.tradecore.order.pagequery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PagequeryTradecoreOrderResponse({}));
  }

  /**
   * Description: 服务商信息校验
   * Summary: 服务商信息校验
   */
  async checkTradecoreSp(request: CheckTradecoreSpRequest): Promise<CheckTradecoreSpResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.checkTradecoreSpEx(request, headers, runtime);
  }

  /**
   * Description: 服务商信息校验
   * Summary: 服务商信息校验
   */
  async checkTradecoreSpEx(request: CheckTradecoreSpRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CheckTradecoreSpResponse> {
    Util.validateModel(request);
    return $tea.cast<CheckTradecoreSpResponse>(await this.doRequest("1.0", "antcloud.commercial.tradecore.sp.check", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CheckTradecoreSpResponse({}));
  }

}
