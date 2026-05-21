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

// 【固定折扣特定信息】 
export class FixedDiscountCoupon extends $tea.Model {
  // 【最高折扣金额】 最高折扣金额，单位分
  discountAmountMax: number;
  // 【折扣百分比】 折扣百分比，例如88-八八折
  discountPercent: number;
  // 【门槛】 使用券金额门槛，单位分
  transactionMinimum?: number;
  static names(): { [key: string]: string } {
    return {
      discountAmountMax: 'discount_amount_max',
      discountPercent: 'discount_percent',
      transactionMinimum: 'transaction_minimum',
    };
  }

  static types(): { [key: string]: any } {
    return {
      discountAmountMax: 'number',
      discountPercent: 'number',
      transactionMinimum: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 【固定面额批次特定信息】 固定面额发券或消费金批次特定信息。
export class FixedNormalCoupon extends $tea.Model {
  // 【面额】 面额，单位：分。
  couponAmount: number;
  // 【门槛】 使用券金额门槛，单位：分。
  transactionMinimum: number;
  static names(): { [key: string]: string } {
    return {
      couponAmount: 'coupon_amount',
      transactionMinimum: 'transaction_minimum',
    };
  }

  static types(): { [key: string]: any } {
    return {
      couponAmount: 'number',
      transactionMinimum: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 返回体度量
export class RultMetric extends $tea.Model {
  // 度量编码
  metricCode: string;
  // 度量聚合结果
  metricValue: string;
  static names(): { [key: string]: string } {
    return {
      metricCode: 'metric_code',
      metricValue: 'metric_value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      metricCode: 'string',
      metricValue: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 【减至批次特定信息】 单品优惠特定信息
export class CutToMessage extends $tea.Model {
  // 【可用优惠的商品最高单价】 可用优惠的商品最高单价，单位：分。
  singlePriceMax: number;
  // 【减至后的优惠单价】 减至后的优惠单价，单位：分。
  cutToPrice: number;
  static names(): { [key: string]: string } {
    return {
      singlePriceMax: 'single_price_max',
      cutToPrice: 'cut_to_price',
    };
  }

  static types(): { [key: string]: any } {
    return {
      singlePriceMax: 'number',
      cutToPrice: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 【消费金可用地域】 消费金可用地域
export class AvailableRegion extends $tea.Model {
  // 【类型】 消费金可用地域的类型，COUNTRY表示国家级别可用，PROVINCE表示省级可用，CITY表示市级可用，DISTRICT表示区级可用。
  // 可选取值
  // PROVINCE:  地域信息精确到省级
  // CITY:  地域信息精确到市级
  // DISTRICT:  地域信息精确到区级
  // COUNTRY:  地域信息精确到国家级
  type?: string;
  // 【省】 消费金可用省
  province?: string;
  // 【市】 消费金可用
  city?: string;
  // 【区】 消费金可用区
  district?: string;
  // 【国家】 消费金可用国家
  country?: string;
  static names(): { [key: string]: string } {
    return {
      type: 'type',
      province: 'province',
      city: 'city',
      district: 'district',
      country: 'country',
    };
  }

  static types(): { [key: string]: any } {
    return {
      type: 'string',
      province: 'string',
      city: 'string',
      district: 'string',
      country: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 维度
export class Dimension extends $tea.Model {
  // 维度
  dimension: string;
  // 维度值
  dimensionValue: string;
  static names(): { [key: string]: string } {
    return {
      dimension: 'dimension',
      dimensionValue: 'dimension_value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      dimension: 'string',
      dimensionValue: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 【满减券/消费金批次使用规则】 满减券或消费金批次特定信息。
export class StockUseRule extends $tea.Model {
  // 【发放总上限】 最大发券数
  maxCoupons: number;
  // 【总预算】 总消耗金额，单位：分。
  maxAmount: number;
  // 【单天发放上限金额】 单天最高消耗金额，单位：分。
  maxAmountByDay: number;
  // 【固定面额批次特定信息】 固定面额发券或消费金批次特定信息。
  fixedNormalCoupon: FixedNormalCoupon;
  // 【单个用户可领个数】 单个用户可领个数
  maxCouponsPerUser: number;
  // 【券或消费金类型】 券或消费金类型
  // 枚举值：
  // NORMAL：满减券
  // CUT_TO：减至券
  couponType?: string;
  // 【订单优惠标记】 订单优惠标记 (该字段暂未开放返回)
  // 特殊规则：单个优惠标记的字符长度为【1，128】,条目个数限制为【1，50】。
  goodsTag?: string[];
  // 【指定支付模式】默认不限制(该字段暂未开放返回)，枚举值：
  // 可选取值
  // MICROAPP:  小程序支付
  // APPPAY:  APP支付
  // PPAY:  免密支付
  // CARD:  刷卡支付
  // FACE:  人脸支付
  // OTHER:  其他支付，公众号、扫码等
  tradeType?: string[];
  // 【是否可叠加其他优惠】 枚举值：
  // true：是
  // false：否
  combineUse?: boolean;
  // 【固定折扣特定信息】
  fixedDiscountCoupon?: FixedDiscountCoupon;
  static names(): { [key: string]: string } {
    return {
      maxCoupons: 'max_coupons',
      maxAmount: 'max_amount',
      maxAmountByDay: 'max_amount_by_day',
      fixedNormalCoupon: 'fixed_normal_coupon',
      maxCouponsPerUser: 'max_coupons_per_user',
      couponType: 'coupon_type',
      goodsTag: 'goods_tag',
      tradeType: 'trade_type',
      combineUse: 'combine_use',
      fixedDiscountCoupon: 'fixed_discount_coupon',
    };
  }

  static types(): { [key: string]: any } {
    return {
      maxCoupons: 'number',
      maxAmount: 'number',
      maxAmountByDay: 'number',
      fixedNormalCoupon: FixedNormalCoupon,
      maxCouponsPerUser: 'number',
      couponType: 'string',
      goodsTag: { 'type': 'array', 'itemType': 'string' },
      tradeType: { 'type': 'array', 'itemType': 'string' },
      combineUse: 'boolean',
      fixedDiscountCoupon: FixedDiscountCoupon,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 【批次详情】 批次详情
export class WxStockData extends $tea.Model {
  // 【批次号】 微信为每个代金券批次分配的唯一id。
  stockId: string;
  // 【批次创建方商户号】 微信为创建方商户分配的商户号
  stockCreatorMchid: string;
  // 【批次名称】 批次名称
  stockName: string;
  // 【批次状态】 批次状态，枚举值：
  // unactivated：未激活
  // audit：审核中
  // running：运行中
  // stoped：已停止
  // paused：暂停发放
  status: string;
  // 【创建时间】 批次创建时间，遵循rfc3339标准格式，格式为yyyy-MM-DDTHH:mm:ss.sss+TIMEZONE，yyyy-MM-DD表示年月日，T出现在字符串中，表示time元素的开头，HH:mm:ss.sss表示时分秒毫秒，TIMEZONE表示时区（+08:00表示东八区时间，领先UTC 8小时，即北京时间）。例如：2015-05-20T13:29:35.120+08:00表示，北京时间2015年5月20日 13点29分35秒。
  createTime: string;
  // 【使用说明】 批次描述信息
  description: string;
  // 【满减券/消费金批次使用规则】 满减券或消费金批次特定信息。
  stockUseRule?: StockUseRule;
  // 【可用开始时间】 可用开始时间，遵循rfc3339标准格式，格式为yyyy-MM-DDTHH:mm:ss.sss+TIMEZONE，yyyy-MM-DD表示年月日，T出现在字符串中，表示time元素的开头，HH:mm:ss.sss表示时分秒毫秒，TIMEZONE表示时区（+08:00表示东八区时间，领先UTC 8小时，即北京时间）。例如：2015-05-20T13:29:35.120+08:00表示，北京时间2015年5月20日 13点29分35秒。
  availableBeginTime: string;
  // 【可用结束时间】 可用结束时间，遵循rfc3339标准格式，格式为yyyy-MM-DDTHH:mm:ss.sss+TIMEZONE，yyyy-MM-DD表示年月日，T出现在字符串中，表示time元素的开头，HH:mm:ss.sss表示时分秒毫秒，TIMEZONE表示时区（+08:00表示东八区时间，领先UTC 8小时，即北京时间）。例如：2015-05-20T13:29:35.120+08:00表示，北京时间2015年5月20日 13点29分35秒。
  availableEndTime: string;
  // 【已发券或消费金数量】 已发券或消费金数量
  distributedCoupons: number;
  // 【是否无资金流】 是否无资金流。枚举值：
  // true：是
  // false：否
  noCash: boolean;
  // 【激活批次的时间】 批次激活开启时间，遵循rfc3339标准格式，格式为yyyy-MM-DDTHH:mm:ss.sss+TIMEZONE，yyyy-MM-DD表示年月日，T出现在字符串中，表示time元素的开头，HH:mm:ss.sss表示时分秒毫秒，TIMEZONE表示时区（+08:00表示东八区时间，领先UTC 8小时，即北京时间）。例如：2015-05-20T13:29:35.120+08:00表示，北京时间2015年5月20日 13点29分35秒。
  startTime?: string;
  // 【终止批次的时间】 批次永久停止时间，遵循rfc3339标准格式，格式为yyyy-MM-DDTHH:mm:ss.sss+TIMEZONE，yyyy-MM-DD表示年月日，T出现在字符串中，表示time元素的开头，HH:mm:ss.sss表示时分秒毫秒，TIMEZONE表示时区（+08:00表示东八区时间，领先UTC 8小时，即北京时间）。例如：2015-05-20T13:29:35.120+08:00表示，北京时间2015年5月20日 13点29分35秒。
  stopTime?: string;
  // 【减至批次特定信息】 单品优惠特定信息
  cutToMessage?: CutToMessage;
  // 【是否单品优惠】 枚举值：
  // true：是
  // false：否
  singleitem: boolean;
  // 【批次类型】 批次类型
  // 枚举值：
  // NORMAL：代金券批次
  // DISCOUNT_CUT：立减与折扣
  // OTHER：其他
  stockType: string;
  // 【卡包ID】 微信卡包ID
  cardId?: string;
  // 【业务类型】 细分业务类型，仅有当business_type=MULTIUSE时，才会返回，枚举值：
  // MULTIUSE：消费金
  // 可选取值
  // MULTIUSE:  消费金类型
  businessType?: string;
  // 消费金可用地域列表，仅有当business_type=MULTIUSE时，才会返回
  availableRegionList?: AvailableRegion[];
  // 【消费金可用行业】 消费金可用行业列表，仅有当business_type=MULTIUSE时，才会返回
  availableIndustryList?: string[];
  static names(): { [key: string]: string } {
    return {
      stockId: 'stock_id',
      stockCreatorMchid: 'stock_creator_mchid',
      stockName: 'stock_name',
      status: 'status',
      createTime: 'create_time',
      description: 'description',
      stockUseRule: 'stock_use_rule',
      availableBeginTime: 'available_begin_time',
      availableEndTime: 'available_end_time',
      distributedCoupons: 'distributed_coupons',
      noCash: 'no_cash',
      startTime: 'start_time',
      stopTime: 'stop_time',
      cutToMessage: 'cut_to_message',
      singleitem: 'singleitem',
      stockType: 'stock_type',
      cardId: 'card_id',
      businessType: 'business_type',
      availableRegionList: 'available_region_list',
      availableIndustryList: 'available_industry_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      stockId: 'string',
      stockCreatorMchid: 'string',
      stockName: 'string',
      status: 'string',
      createTime: 'string',
      description: 'string',
      stockUseRule: StockUseRule,
      availableBeginTime: 'string',
      availableEndTime: 'string',
      distributedCoupons: 'number',
      noCash: 'boolean',
      startTime: 'string',
      stopTime: 'string',
      cutToMessage: CutToMessage,
      singleitem: 'boolean',
      stockType: 'string',
      cardId: 'string',
      businessType: 'string',
      availableRegionList: { 'type': 'array', 'itemType': AvailableRegion },
      availableIndustryList: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 度量
export class Metric extends $tea.Model {
  // 度量编码
  metricCode: string;
  // 计算列
  metricColumn: string;
  // 计算方式
  functionType?: string;
  static names(): { [key: string]: string } {
    return {
      metricCode: 'metric_code',
      metricColumn: 'metric_column',
      functionType: 'function_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      metricCode: 'string',
      metricColumn: 'string',
      functionType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 业务号条件
export class BizNoCondition extends $tea.Model {
  // 枚举
  // CITY 城市
  // BLOCK 区县
  // AGE 年龄
  dimension: string;
  // 枚举范围，每个维度的值是或的关系,需要校验场景和取值范围是否匹配
  // CITY:区划码
  // BLOCK:区划码（底包暂不支持）
  // AGE:30+、40+、50+（底包暂不支持
  valueScope: string[];
  static names(): { [key: string]: string } {
    return {
      dimension: 'dimension',
      valueScope: 'value_scope',
    };
  }

  static types(): { [key: string]: any } {
    return {
      dimension: 'string',
      valueScope: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 批处理结果
export class BatchResult extends $tea.Model {
  // 业务号
  bizNo: string;
  // 业务号类型
  bizNoType: string;
  // 结果
  result?: string;
  // 结果码
  resultCode?: string;
  static names(): { [key: string]: string } {
    return {
      bizNo: 'biz_no',
      bizNoType: 'biz_no_type',
      result: 'result',
      resultCode: 'result_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      bizNo: 'string',
      bizNoType: 'string',
      result: 'string',
      resultCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 任务详细结果包含任务的统计数据信息
export class TaskDetailResult extends $tea.Model {
  // 总数量
  totalCount?: number;
  // 成功数量
  successCount?: number;
  // 失败数量
  failCount?: number;
  // 处理中数量
  processingCount?: number;
  // 当状态为无效时，显示具体的错误信息
  errorInfo?: string;
  static names(): { [key: string]: string } {
    return {
      totalCount: 'total_count',
      successCount: 'success_count',
      failCount: 'fail_count',
      processingCount: 'processing_count',
      errorInfo: 'error_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      totalCount: 'number',
      successCount: 'number',
      failCount: 'number',
      processingCount: 'number',
      errorInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 聚合查询结果
export class DwsResult extends $tea.Model {
  // 维度列表
  dimensionList: Dimension[];
  // 度量列表
  metricList: RultMetric[];
  static names(): { [key: string]: string } {
    return {
      dimensionList: 'dimension_list',
      metricList: 'metric_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      dimensionList: { 'type': 'array', 'itemType': Dimension },
      metricList: { 'type': 'array', 'itemType': RultMetric },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 过滤条件
export class FilterCondition extends $tea.Model {
  // 过滤列
  filterColumn: string;
  // 过滤方式
  filterType?: string;
  // 值列表
  valueList: string[];
  static names(): { [key: string]: string } {
    return {
      filterColumn: 'filter_column',
      filterType: 'filter_type',
      valueList: 'value_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      filterColumn: 'string',
      filterType: 'string',
      valueList: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 地址，包含省、市、区(县)
export class Address extends $tea.Model {
  // 市级
  city: string;
  // 区、县级
  district?: string;
  static names(): { [key: string]: string } {
    return {
      city: 'city',
      district: 'district',
    };
  }

  static types(): { [key: string]: any } {
    return {
      city: 'string',
      district: 'string',
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

export class JudgeCrowdPrefermentRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 业务号：可以标识用户的编码，例如手机号，身份证号等，通过业务号类型来控制，与biz_no_type和encrypt_type共同确定编码形式。
  bizNo: string;
  // 业务号类型：1-手机号，2-支付宝用户id
  bizNoType: string;
  // 加密方式：0-不加密，1-SHA1，2-MD5
  encryptType: string;
  // json结构，可以传递自定义参数
  properties?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizNo: 'biz_no',
      bizNoType: 'biz_no_type',
      encryptType: 'encrypt_type',
      properties: 'properties',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizNo: 'string',
      bizNoType: 'string',
      encryptType: 'string',
      properties: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class JudgeCrowdPrefermentResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否优待群体：YES-是，NO-否
  isPreferment?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      isPreferment: 'is_preferment',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      isPreferment: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SubmitScenedataTaskRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 约定的场景枚举
  scene: string;
  // 枚举
  // PHONE_SHA1
  // PHONE_MD5
  bizNoType: string;
  // 适配客户的来源
  // 可能是客户的任务/AK
  sourceMark?: string;
  // 业务号预期条件
  expectCondition?: BizNoCondition[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      scene: 'scene',
      bizNoType: 'biz_no_type',
      sourceMark: 'source_mark',
      expectCondition: 'expect_condition',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      scene: 'string',
      bizNoType: 'string',
      sourceMark: 'string',
      expectCondition: { 'type': 'array', 'itemType': BizNoCondition },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SubmitScenedataTaskResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 创建任务成功后，返回批次号
  batchNo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      batchNo: 'batch_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      batchNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadScenedataFileRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 批次号
  batchNo: string;
  // 文件参数
  fileObject?: Readable;
  fileObjectName?: string;
  fileId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      batchNo: 'batch_no',
      fileObject: 'fileObject',
      fileObjectName: 'fileObjectName',
      fileId: 'file_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      batchNo: 'string',
      fileObject: 'Readable',
      fileObjectName: 'string',
      fileId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadScenedataFileResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // batchNo对应的任务状态，上传后，返回RECEIVED
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

export class BatchqueryScenedataTaskresultRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 批次号
  batchNo: string;
  // 游标，上一次的最后一条
  cursor?: string;
  // 本次同步数量
  syncNum?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      batchNo: 'batch_no',
      cursor: 'cursor',
      syncNum: 'sync_num',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      batchNo: 'string',
      cursor: 'string',
      syncNum: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchqueryScenedataTaskresultResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 0-未开始
  // 1-可继续
  // 2-结束
  syncStatus?: string;
  // 本次的最后一个游标，保存起来下一次使用
  lastCursor?: string;
  // 结果列表
  resultList?: BatchResult[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      syncStatus: 'sync_status',
      lastCursor: 'last_cursor',
      resultList: 'result_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      syncStatus: 'string',
      lastCursor: 'string',
      resultList: { 'type': 'array', 'itemType': BatchResult },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryScenedataOnlineRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 业务号，根据biz_no_type修改类型
  bizNo: string;
  // 业务号类型
  bizNoType: string;
  // 场景，根据此参数路由适配到不同数据源
  scene: string;
  // 来源标识
  sourceMark?: string;
  // 条件，目前只支持IN的逻辑
  condition?: BizNoCondition;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizNo: 'biz_no',
      bizNoType: 'biz_no_type',
      scene: 'scene',
      sourceMark: 'source_mark',
      condition: 'condition',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizNo: 'string',
      bizNoType: 'string',
      scene: 'string',
      sourceMark: 'string',
      condition: BizNoCondition,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryScenedataOnlineResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 结果字段，可以是Y/程度值/自定义加密串
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

export class QueryScenedataTaskinfoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 批次号
  batchNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      batchNo: 'batch_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      batchNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryScenedataTaskinfoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // -1-无效，0-待处理，1-处理中，2-处理完成
  taskStatus?: string;
  // 业务日期
  bizDate?: string;
  // 场景
  scene?: string;
  // 任务类型
  taskType?: string;
  // 批次所属租户id
  tenantId?: string;
  // 来源标识
  sourceMark?: string;
  // 任务创建时间
  createTime?: string;
  // 批次统计结果信息
  result?: TaskDetailResult;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      taskStatus: 'task_status',
      bizDate: 'biz_date',
      scene: 'scene',
      taskType: 'task_type',
      tenantId: 'tenant_id',
      sourceMark: 'source_mark',
      createTime: 'create_time',
      result: 'result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      taskStatus: 'string',
      bizDate: 'string',
      scene: 'string',
      taskType: 'string',
      tenantId: 'string',
      sourceMark: 'string',
      createTime: 'string',
      result: TaskDetailResult,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryScenedataDwsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 任务批次号
  batchNo: string;
  // 业务类型
  bizType: string;
  // 维度列表
  dimensionList: string[];
  // 度量列表
  metricList: Metric[];
  // 过滤条件列表
  filterConditionList?: FilterCondition[];
  // 页码,默认1
  pageNum?: number;
  // 每页数量,默认50
  pageSize?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      batchNo: 'batch_no',
      bizType: 'biz_type',
      dimensionList: 'dimension_list',
      metricList: 'metric_list',
      filterConditionList: 'filter_condition_list',
      pageNum: 'page_num',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      batchNo: 'string',
      bizType: 'string',
      dimensionList: { 'type': 'array', 'itemType': 'string' },
      metricList: { 'type': 'array', 'itemType': Metric },
      filterConditionList: { 'type': 'array', 'itemType': FilterCondition },
      pageNum: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryScenedataDwsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 总量
  totalSize?: number;
  // 页码
  pageNum?: number;
  // 每页数量
  pageSize?: number;
  // 结果列表
  resultList?: DwsResult[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      totalSize: 'total_size',
      pageNum: 'page_num',
      pageSize: 'page_size',
      resultList: 'result_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      totalSize: 'number',
      pageNum: 'number',
      pageSize: 'number',
      resultList: { 'type': 'array', 'itemType': DwsResult },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryFavorStocksRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 【分页页码】 页码从0开始，默认第0页
  offset: number;
  // 【分页大小】 分页大小，最大10
  limit: number;
  // 【创建批次的商户号】 批次创建方商户号。
  // 校验规则：接口传入的批次号需由stock_creator_mchid所创建。
  stockCreatorMchid: string;
  // 【起始时间】 起始创建时间，遵循rfc3339标准格式，格式为yyyy-MM-DDTHH:mm:ss+TIMEZONE，yyyy-MM-DD表示年月日，T出现在字符串中，表示time元素的开头，HH:mm:ss表示时分秒，TIMEZONE表示时区（+08:00表示东八区时间，领先UTC 8小时，即北京时间）。例如：2015-05-20T13:29:35+08:00表示，北京时间2015年5月20日 13点29分35秒。
  // 校验规则：get请求，参数在 url中，需要进行 url 编码传递
  createStartTime?: string;
  // 【终止时间】 终止创建时间，遵循rfc3339标准格式，格式为yyyy-MM-DDTHH:mm:ss+TIMEZONE，yyyy-MM-DD表示年月日，T出现在字符串中，表示time元素的开头，HH:mm:ss表示时分秒，TIMEZONE表示时区（+08:00表示东八区时间，领先UTC 8小时，即北京时间）。例如：2015-05-20T13:29:35+08:00表示，北京时间2015年5月20日 13点29分35秒。
  // 校验规则：get请求，参数在 url中，需要进行 url 编码传递
  createEndTime?: string;
  // 【批次状态】 批次状态，枚举值：
  // unactivated：未激活
  // audit：审核中
  // running：运行中
  // stoped：已停止
  // paused：暂停发放
  status?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      offset: 'offset',
      limit: 'limit',
      stockCreatorMchid: 'stock_creator_mchid',
      createStartTime: 'create_start_time',
      createEndTime: 'create_end_time',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      offset: 'number',
      limit: 'number',
      stockCreatorMchid: 'string',
      createStartTime: 'string',
      createEndTime: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryFavorStocksResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 【批次总数】 经过条件筛选，查询到的批次总数量。
  totalCount?: number;
  // 【批次详情】 批次详情
  data?: WxStockData[];
  // 【分页大小】 分页大小，最大10
  limit?: number;
  // 【分页页码】 页码从0开始，默认第0页
  offset?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      totalCount: 'total_count',
      data: 'data',
      limit: 'limit',
      offset: 'offset',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      totalCount: 'number',
      data: { 'type': 'array', 'itemType': WxStockData },
      limit: 'number',
      offset: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DownloadStockUseflowRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 格式：yyyy-MM-DD，仅支持近1年的日期账单数据下载，账单日期需早于当前日期，且在批次有效期内。
  billDate: string;
  // 【批次号】单次请求仅支持单批次，校验批次号合法性，需要为创建方创建的批次号，支持全场券、单品券、全场立减、全场折扣、单品立减
  stockId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      billDate: 'bill_date',
      stockId: 'stock_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      billDate: 'string',
      stockId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DownloadStockUseflowResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 【下载链接】流水文件下载链接，30s内有效
  url?: string;
  // 【核销批次账单文件摘要】默认算法SHA1
  stockUseflowHash?: string;
  // 【核销批次账单记录总条数】记录该批次在该请求日期下的核销记录条数
  stockUseflowCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      url: 'url',
      stockUseflowHash: 'stock_useflow_hash',
      stockUseflowCount: 'stock_useflow_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      url: 'string',
      stockUseflowHash: 'string',
      stockUseflowCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DownloadStockRefundflowRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 格式yyyy-MM- dd仅支持近1年的日期账单数据下载，账单日期需早于当前日期，且在批次有效期内。
  billDate: string;
  // 单次请求仅支持单批次，校验批次号合法性，需要为创建方创建的批次号，支持全场券、单品券、全场立减、全场折扣、单品立减。
  stockId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      billDate: 'bill_date',
      stockId: 'stock_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      billDate: 'string',
      stockId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DownloadStockRefundflowResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 【下载链接】流水文件下载链接，30s内有效
  url?: string;
  // 【退款批次账单文件摘要】默认算法SHA1
  stockRefundflowHash?: string;
  // 【退款批次账单记录总条数】记录该批次在请求日期下的退款记录条数
  stockRefundflowCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      url: 'url',
      stockRefundflowHash: 'stock_refundflow_hash',
      stockRefundflowCount: 'stock_refundflow_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      url: 'string',
      stockRefundflowHash: 'string',
      stockRefundflowCount: 'number',
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
          sdk_version: "1.6.0",
          _prod_code: "SDS",
          _prod_channel: "default",
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
   * Description: 根据人维度的业务号和城市，决定是否优待人群，业务号可以是不同类型的，可以是手机号，也可以是证件号，如果业务号是敏感数据，可以选择算法类型加密传输。
   * Summary: 优待人群判断
   */
  async judgeCrowdPreferment(request: JudgeCrowdPrefermentRequest): Promise<JudgeCrowdPrefermentResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.judgeCrowdPrefermentEx(request, headers, runtime);
  }

  /**
   * Description: 根据人维度的业务号和城市，决定是否优待人群，业务号可以是不同类型的，可以是手机号，也可以是证件号，如果业务号是敏感数据，可以选择算法类型加密传输。
   * Summary: 优待人群判断
   */
  async judgeCrowdPrefermentEx(request: JudgeCrowdPrefermentRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<JudgeCrowdPrefermentResponse> {
    Util.validateModel(request);
    return $tea.cast<JudgeCrowdPrefermentResponse>(await this.doRequest("1.0", "antchain.sds.crowd.preferment.judge", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new JudgeCrowdPrefermentResponse({}));
  }

  /**
   * Description: 客户上传文件以及参数，创建任务，获取批次号异步查询处理结果。
   * Summary: 场景数据批处理任务提交
   */
  async submitScenedataTask(request: SubmitScenedataTaskRequest): Promise<SubmitScenedataTaskResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.submitScenedataTaskEx(request, headers, runtime);
  }

  /**
   * Description: 客户上传文件以及参数，创建任务，获取批次号异步查询处理结果。
   * Summary: 场景数据批处理任务提交
   */
  async submitScenedataTaskEx(request: SubmitScenedataTaskRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SubmitScenedataTaskResponse> {
    Util.validateModel(request);
    return $tea.cast<SubmitScenedataTaskResponse>(await this.doRequest("1.0", "antchain.sds.scenedata.task.submit", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SubmitScenedataTaskResponse({}));
  }

  /**
   * Description: 批次数据文件上传
   * Summary: 批次数据文件上传
   */
  async uploadScenedataFile(request: UploadScenedataFileRequest): Promise<UploadScenedataFileResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.uploadScenedataFileEx(request, headers, runtime);
  }

  /**
   * Description: 批次数据文件上传
   * Summary: 批次数据文件上传
   */
  async uploadScenedataFileEx(request: UploadScenedataFileRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UploadScenedataFileResponse> {
    if (!Util.isUnset(request.fileObject)) {
      let uploadReq = new CreateAntcloudGatewayxFileUploadRequest({
        authToken: request.authToken,
        apiCode: "antchain.sds.scenedata.file.upload",
        fileName: request.fileObjectName,
      });
      let uploadResp = await this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
      if (!AntchainUtil.isSuccess(uploadResp.resultCode, "ok")) {
        let uploadScenedataFileResponse = new UploadScenedataFileResponse({
          reqMsgId: uploadResp.reqMsgId,
          resultCode: uploadResp.resultCode,
          resultMsg: uploadResp.resultMsg,
        });
        return uploadScenedataFileResponse;
      }

      let uploadHeaders = AntchainUtil.parseUploadHeaders(uploadResp.uploadHeaders);
      await AntchainUtil.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
      request.fileId = uploadResp.fileId;
      request.fileObject = null;
    }

    Util.validateModel(request);
    return $tea.cast<UploadScenedataFileResponse>(await this.doRequest("1.0", "antchain.sds.scenedata.file.upload", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UploadScenedataFileResponse({}));
  }

  /**
   * Description: 场景数据SaaS第一天预处理客户提交的文件处理任务，第二天客户调该接口批量查询任务结果
   * Summary: 场景数据任务结果批量查询
   */
  async batchqueryScenedataTaskresult(request: BatchqueryScenedataTaskresultRequest): Promise<BatchqueryScenedataTaskresultResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchqueryScenedataTaskresultEx(request, headers, runtime);
  }

  /**
   * Description: 场景数据SaaS第一天预处理客户提交的文件处理任务，第二天客户调该接口批量查询任务结果
   * Summary: 场景数据任务结果批量查询
   */
  async batchqueryScenedataTaskresultEx(request: BatchqueryScenedataTaskresultRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchqueryScenedataTaskresultResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchqueryScenedataTaskresultResponse>(await this.doRequest("1.0", "antchain.sds.scenedata.taskresult.batchquery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchqueryScenedataTaskresultResponse({}));
  }

  /**
   * Description: 场景数据在线查询，仅支持单条匹配
   * Summary: 场景数据在线查询
   */
  async queryScenedataOnline(request: QueryScenedataOnlineRequest): Promise<QueryScenedataOnlineResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryScenedataOnlineEx(request, headers, runtime);
  }

  /**
   * Description: 场景数据在线查询，仅支持单条匹配
   * Summary: 场景数据在线查询
   */
  async queryScenedataOnlineEx(request: QueryScenedataOnlineRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryScenedataOnlineResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryScenedataOnlineResponse>(await this.doRequest("1.0", "antchain.sds.scenedata.online.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryScenedataOnlineResponse({}));
  }

  /**
   * Description: 通过批次号查询任务详细信息
   * Summary: 批次任务信息查询
   */
  async queryScenedataTaskinfo(request: QueryScenedataTaskinfoRequest): Promise<QueryScenedataTaskinfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryScenedataTaskinfoEx(request, headers, runtime);
  }

  /**
   * Description: 通过批次号查询任务详细信息
   * Summary: 批次任务信息查询
   */
  async queryScenedataTaskinfoEx(request: QueryScenedataTaskinfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryScenedataTaskinfoResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryScenedataTaskinfoResponse>(await this.doRequest("1.0", "antchain.sds.scenedata.taskinfo.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryScenedataTaskinfoResponse({}));
  }

  /**
   * Description: 批次计算结果聚合，任务为ready状态时，返回分页列表数据
   * Summary: 批次结果聚合查询
   */
  async queryScenedataDws(request: QueryScenedataDwsRequest): Promise<QueryScenedataDwsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryScenedataDwsEx(request, headers, runtime);
  }

  /**
   * Description: 批次计算结果聚合，任务为ready状态时，返回分页列表数据
   * Summary: 批次结果聚合查询
   */
  async queryScenedataDwsEx(request: QueryScenedataDwsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryScenedataDwsResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryScenedataDwsResponse>(await this.doRequest("1.0", "antchain.sds.scenedata.dws.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryScenedataDwsResponse({}));
  }

  /**
   * Description: 微信批次分页条件查询。通过此接口可查询商家多个批次的信息，包括批次的配置信息以及批次概况数据。
   * Summary: 微信批次分页条件查询。通过此接口可查询商家多个批次的信息，包括批次的配置信息以及批次概况数据。
   */
  async queryFavorStocks(request: QueryFavorStocksRequest): Promise<QueryFavorStocksResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryFavorStocksEx(request, headers, runtime);
  }

  /**
   * Description: 微信批次分页条件查询。通过此接口可查询商家多个批次的信息，包括批次的配置信息以及批次概况数据。
   * Summary: 微信批次分页条件查询。通过此接口可查询商家多个批次的信息，包括批次的配置信息以及批次概况数据。
   */
  async queryFavorStocksEx(request: QueryFavorStocksRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryFavorStocksResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryFavorStocksResponse>(await this.doRequest("1.0", "antchain.sds.favor.stocks.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryFavorStocksResponse({}));
  }

  /**
   * Description: 微信核销账单接口
   * Summary: 微信核销账单接口
   */
  async downloadStockUseflow(request: DownloadStockUseflowRequest): Promise<DownloadStockUseflowResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.downloadStockUseflowEx(request, headers, runtime);
  }

  /**
   * Description: 微信核销账单接口
   * Summary: 微信核销账单接口
   */
  async downloadStockUseflowEx(request: DownloadStockUseflowRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DownloadStockUseflowResponse> {
    Util.validateModel(request);
    return $tea.cast<DownloadStockUseflowResponse>(await this.doRequest("1.0", "antchain.sds.stock.useflow.download", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DownloadStockUseflowResponse({}));
  }

  /**
   * Description: 微信退款账单接口
   * Summary: 微信退款账单接口
   */
  async downloadStockRefundflow(request: DownloadStockRefundflowRequest): Promise<DownloadStockRefundflowResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.downloadStockRefundflowEx(request, headers, runtime);
  }

  /**
   * Description: 微信退款账单接口
   * Summary: 微信退款账单接口
   */
  async downloadStockRefundflowEx(request: DownloadStockRefundflowRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DownloadStockRefundflowResponse> {
    Util.validateModel(request);
    return $tea.cast<DownloadStockRefundflowResponse>(await this.doRequest("1.0", "antchain.sds.stock.refundflow.download", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DownloadStockRefundflowResponse({}));
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
