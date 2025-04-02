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

// 企业风险等级分布统计
export class RtopLevelDistribution extends $tea.Model {
  // 统计值
  count: number;
  // 等级
  level: string;
  static names(): { [key: string]: string } {
    return {
      count: 'count',
      level: 'level',
    };
  }

  static types(): { [key: string]: any } {
    return {
      count: 'number',
      level: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// infocode
export class InfoCodes extends $tea.Model {
  // infocode
  name: string;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 删除参数
export class OutParams extends $tea.Model {
  // 输出参数
  name: string;
  // 参数描述
  desc: string;
  // 参数值
  value: string;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      desc: 'desc',
      value: 'value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      desc: 'string',
      value: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 天枢系统Contact结构体
export class Contact extends $tea.Model {
  // 联系人类型
  // 1配偶
  // 2父母
  // 3子女
  // 4兄弟
  // 5姐妹
  // 6朋友
  // 7其他
  kind: string;
  // 联系人姓名
  name: string;
  // 联系人手机号
  mobile: string;
  static names(): { [key: string]: string } {
    return {
      kind: 'kind',
      name: 'name',
      mobile: 'mobile',
    };
  }

  static types(): { [key: string]: any } {
    return {
      kind: 'string',
      name: 'string',
      mobile: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 批量查询输出模型分
export class BatchQueryOutputModelInfo extends $tea.Model {
  // 变量名称
  name: string;
  // 变量值
  value: string;
  // 变量值类型
  valueType: string;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      value: 'value',
      valueType: 'value_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      value: 'string',
      valueType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 反欺诈风险数据服务风险规则详情
export class RiskDetail extends $tea.Model {
  // 反欺诈风险数据服务命中规则风险权重
  ruleWeight: string;
  // 反欺诈风险数据服务命中规则名称
  ruleName: string;
  static names(): { [key: string]: string } {
    return {
      ruleWeight: 'rule_weight',
      ruleName: 'rule_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      ruleWeight: 'string',
      ruleName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 回流事件记录属性项
export class BackflowEventRecordProperty extends $tea.Model {
  // 属性code
  key: string;
  // 属性value，统一为字符串
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

// 营销盾批量查询单条结果
export class BaseCustomerUmktInfoModel extends $tea.Model {
  // 用户凭证
  customerKey?: string;
  // 输入模板
  queryTemplate?: string;
  // 实时营销结果
  umktResult?: number;
  static names(): { [key: string]: string } {
    return {
      customerKey: 'customer_key',
      queryTemplate: 'query_template',
      umktResult: 'umkt_result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      customerKey: 'string',
      queryTemplate: 'string',
      umktResult: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 企业类型分布统计
export class RtopTypeDistribution extends $tea.Model {
  // 统计值
  count: number;
  // 当前类型下的等级分布
  levelDistribution: RtopLevelDistribution[];
  // 类型
  type: string;
  static names(): { [key: string]: string } {
    return {
      count: 'count',
      levelDistribution: 'levelDistribution',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      count: 'number',
      levelDistribution: { 'type': 'array', 'itemType': RtopLevelDistribution },
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 营销盾触达媒介参数信息
export class ActionParamInfo extends $tea.Model {
  // 触达媒介类型
  contentType: string;
  // 触达媒介参数列表
  actionParam: string[];
  static names(): { [key: string]: string } {
    return {
      contentType: 'content_type',
      actionParam: 'action_param',
    };
  }

  static types(): { [key: string]: any } {
    return {
      contentType: 'string',
      actionParam: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 涉众风险企业特征
export class RtopCrowdRiskFeatureTag extends $tea.Model {
  // 标签描述
  tagExplanation: string;
  // 标签名称
  tagName: string;
  static names(): { [key: string]: string } {
    return {
      tagExplanation: 'tag_explanation',
      tagName: 'tag_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      tagExplanation: 'string',
      tagName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 决策流
export class DecisionFlow extends $tea.Model {
  // 输出参数
  decisionFlow?: OutParams;
  // 决策结果
  decision: string;
  // infocodes
  infoCodes?: InfoCodes;
  static names(): { [key: string]: string } {
    return {
      decisionFlow: 'decision_flow',
      decision: 'decision',
      infoCodes: 'info_codes',
    };
  }

  static types(): { [key: string]: any } {
    return {
      decisionFlow: OutParams,
      decision: 'string',
      infoCodes: InfoCodes,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 优惠券信息
export class CouponInfo extends $tea.Model {
  // 优惠券Id
  couponId: string;
  // 优惠券名称
  couponName: string;
  // 优惠券状态
  // unUsed-未使用
  // Used-已使用
  // Expired-过期
  status: string;
  // 使用场景
  // 01-提款使用
  // 02-还款使用
  useCondition: string;
  // 优惠码
  couponCode?: string;
  // 优惠券类型
  // 01-金额优惠
  // 02-天数优惠
  // 03-折扣优惠
  // 04-期数优惠
  // 05-固定利率
  couponType?: string;
  // 优惠券面额
  // coupon_type=01 时为优惠金额
  // coupon_type=02 时为减免天数
  // coupon_type=03 时为折扣值（如6 折）
  // coupon_type=04 时为减免期数
  // coupon_type=05 时为折扣值（如 8.88 为利率8.88%）
  couponValue?: string;
  // 当 coupon_type=01 时，才会有优惠金额
  couponAmount?: string;
  // 过期时间yyyy-MM-dd HH:mm:ss
  expiredTime?: string;
  // 生效时间yyyy-MM-dd HH:mm:ss
  effectiveTime?: string;
  // 使用规则
  useDetail?: string;
  // 贷款最低金额
  minAmount?: string;
  // 贷款最高金额
  maxAmount?: string;
  // 最低贷款期数
  minPeriod?: string;
  // 最高贷款期数
  maxPeriod?: string;
  // 贷款最低期限天数
  minDay?: string;
  // 还款方式
  // 1-等额本息
  // 2-等额本金
  // 3-等本等费
  // 4-按期付息到期还本
  // 5-到期一次性还本付息
  // 6-等本等费-总费率
  // 7-等额本息(长期)
  repaymentMethod?: string;
  // 是否有贷款期数要求
  // 0：否
  // 1：是
  isPeriodLimit?: string;
  // 贷款期限要求还款条件
  // 01：可提前还款
  // 02：不可提前还款
  // isPeriodLimit=1 && repayCondition=01 代表：有可提前还款锁期
  // isPeriodLimit=1 && repayCondition=02 代表：有不可提前还款锁期
  repayCondition?: string;
  // 还款场景
  // 01-到期还款
  // 02-即期还款
  repayWays?: string;
  // 优惠模板Id
  couponModelNo?: string;
  // 至到期:X年X月X日
  // 0：不是至到期券 
  // 1：是至到期券
  toMaturity?: string;
  static names(): { [key: string]: string } {
    return {
      couponId: 'coupon_id',
      couponName: 'coupon_name',
      status: 'status',
      useCondition: 'use_condition',
      couponCode: 'coupon_code',
      couponType: 'coupon_type',
      couponValue: 'coupon_value',
      couponAmount: 'coupon_amount',
      expiredTime: 'expired_time',
      effectiveTime: 'effective_time',
      useDetail: 'use_detail',
      minAmount: 'min_amount',
      maxAmount: 'max_amount',
      minPeriod: 'min_period',
      maxPeriod: 'max_period',
      minDay: 'min_day',
      repaymentMethod: 'repayment_method',
      isPeriodLimit: 'is_period_limit',
      repayCondition: 'repay_condition',
      repayWays: 'repay_ways',
      couponModelNo: 'coupon_model_no',
      toMaturity: 'to_maturity',
    };
  }

  static types(): { [key: string]: any } {
    return {
      couponId: 'string',
      couponName: 'string',
      status: 'string',
      useCondition: 'string',
      couponCode: 'string',
      couponType: 'string',
      couponValue: 'string',
      couponAmount: 'string',
      expiredTime: 'string',
      effectiveTime: 'string',
      useDetail: 'string',
      minAmount: 'string',
      maxAmount: 'string',
      minPeriod: 'string',
      maxPeriod: 'string',
      minDay: 'string',
      repaymentMethod: 'string',
      isPeriodLimit: 'string',
      repayCondition: 'string',
      repayWays: 'string',
      couponModelNo: 'string',
      toMaturity: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 用户的混合策略圈客结果
export class UmktInfoModel extends $tea.Model {
  // 场景策略id
  sceneStrategyId: number;
  // 实时营销结果
  umktResult: number;
  // json 结构的营销额外输出信息
  umktOutPutInfo: string;
  static names(): { [key: string]: string } {
    return {
      sceneStrategyId: 'scene_strategy_id',
      umktResult: 'umkt_result',
      umktOutPutInfo: 'umkt_out_put_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      sceneStrategyId: 'number',
      umktResult: 'number',
      umktOutPutInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 监管风险标签
export class RtopRiskTag extends $tea.Model {
  // 标签ID
  tagId: string;
  // 标签名称
  tagName: string;
  // 标签类型
  tagType?: string;
  // 标签文本
  tagText?: string;
  // 线索概览
  tagClue?: string;
  // 线索明细类型
  clueDetailType?: string;
  // 线索明细
  tagClueDetail?: string;
  static names(): { [key: string]: string } {
    return {
      tagId: 'tag_id',
      tagName: 'tag_name',
      tagType: 'tag_type',
      tagText: 'tag_text',
      tagClue: 'tag_clue',
      clueDetailType: 'clue_detail_type',
      tagClueDetail: 'tag_clue_detail',
    };
  }

  static types(): { [key: string]: any } {
    return {
      tagId: 'string',
      tagName: 'string',
      tagType: 'string',
      tagText: 'string',
      tagClue: 'string',
      clueDetailType: 'string',
      tagClueDetail: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 回执统计数据详情
export class StatisticInfoDetail extends $tea.Model {
  // actionDriverCode类型
  actionDriverCode?: number;
  // 成功数
  successCount?: number;
  // 失败数
  failCount?: number;
  // 待触达的手机号数
  waitingSubTaskCount?: number;
  // 已收到的回执数
  totalCount?: number;
  static names(): { [key: string]: string } {
    return {
      actionDriverCode: 'action_driver_code',
      successCount: 'success_count',
      failCount: 'fail_count',
      waitingSubTaskCount: 'waiting_sub_task_count',
      totalCount: 'total_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      actionDriverCode: 'number',
      successCount: 'number',
      failCount: 'number',
      waitingSubTaskCount: 'number',
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 反欺诈风险数据服务规则细节信息
export class RuleDetail extends $tea.Model {
  // 规则细节名称
  name: string;
  // 规则细节值
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

// 安全场景参数
export class SecurityScene extends $tea.Model {
  // 接入渠道
  accessChannel?: string;
  // 事件信息
  ctuParams?: string;
  // 产品名称
  productName?: string;
  // 产品节点
  productNode?: string;
  // 扩展参数
  securitySceneParams?: string;
  // 系统名称
  systemName?: string;
  // 总金额
  totalFee?: string;
  static names(): { [key: string]: string } {
    return {
      accessChannel: 'access_channel',
      ctuParams: 'ctu_params',
      productName: 'product_name',
      productNode: 'product_node',
      securitySceneParams: 'security_scene_params',
      systemName: 'system_name',
      totalFee: 'total_fee',
    };
  }

  static types(): { [key: string]: any } {
    return {
      accessChannel: 'string',
      ctuParams: 'string',
      productName: 'string',
      productNode: 'string',
      securitySceneParams: 'string',
      systemName: 'string',
      totalFee: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 天枢系统专用RepayResult结构体
export class RepayResult extends $tea.Model {
  // 客户编码
  customNo: string;
  // 当前期数
  period: string;
  // 应还总额
  needAmount: number;
  // 应还本金
  needCorpus: number;
  // 应还利息
  needAccrual: number;
  // 应还手续费
  needFee: number;
  // 已还总额
  alreadyAmount: number;
  // 已还本金
  alreadyCorpus: number;
  // 已还逾期本金
  alreadyOvercorpus: number;
  // 已还利息
  alreadyAccrual: number;
  // 已还逾期息
  alreadyPunish: number;
  // 已还手续费
  alreadyFee: number;
  // 利率
  rate: number;
  // 罚息率
  penaltyValue: number;
  // 当期剩余总额
  restAmount: number;
  // 当期剩余本金
  restCorpus: number;
  // 当期剩余利息
  restAccrual: number;
  // 当期剩余罚息
  restPunish: number;
  // 期末本金
  remainCorpus: number;
  // 借据编号
  receiptNo: string;
  // 还款状态1：已还清 2 未还 3 部分还款
  status: string;
  // 应还日期
  settleDate: string;
  // 还款日期
  tradeDate: string;
  // 已还担保费
  alreadyGuaranteeFee: number;
  // 已还违约金
  alreadyLiquidatedDamages: number;
  // 当期剩余担保费
  restGuaranteeFee: number;
  // 当期剩余违约金
  restLiquidatedDamages: number;
  // 应还担保费
  needGuaranteeFee: number;
  // 应还违约金
  needLiquidatedDamages: number;
  // 逾期天数
  overdueDays: number;
  static names(): { [key: string]: string } {
    return {
      customNo: 'custom_no',
      period: 'period',
      needAmount: 'need_amount',
      needCorpus: 'need_corpus',
      needAccrual: 'need_accrual',
      needFee: 'need_fee',
      alreadyAmount: 'already_amount',
      alreadyCorpus: 'already_corpus',
      alreadyOvercorpus: 'already_overcorpus',
      alreadyAccrual: 'already_accrual',
      alreadyPunish: 'already_punish',
      alreadyFee: 'already_fee',
      rate: 'rate',
      penaltyValue: 'penalty_value',
      restAmount: 'rest_amount',
      restCorpus: 'rest_corpus',
      restAccrual: 'rest_accrual',
      restPunish: 'rest_punish',
      remainCorpus: 'remain_corpus',
      receiptNo: 'receipt_no',
      status: 'status',
      settleDate: 'settle_date',
      tradeDate: 'trade_date',
      alreadyGuaranteeFee: 'already_guarantee_fee',
      alreadyLiquidatedDamages: 'already_liquidated_damages',
      restGuaranteeFee: 'rest_guarantee_fee',
      restLiquidatedDamages: 'rest_liquidated_damages',
      needGuaranteeFee: 'need_guarantee_fee',
      needLiquidatedDamages: 'need_liquidated_damages',
      overdueDays: 'overdue_days',
    };
  }

  static types(): { [key: string]: any } {
    return {
      customNo: 'string',
      period: 'string',
      needAmount: 'number',
      needCorpus: 'number',
      needAccrual: 'number',
      needFee: 'number',
      alreadyAmount: 'number',
      alreadyCorpus: 'number',
      alreadyOvercorpus: 'number',
      alreadyAccrual: 'number',
      alreadyPunish: 'number',
      alreadyFee: 'number',
      rate: 'number',
      penaltyValue: 'number',
      restAmount: 'number',
      restCorpus: 'number',
      restAccrual: 'number',
      restPunish: 'number',
      remainCorpus: 'number',
      receiptNo: 'string',
      status: 'string',
      settleDate: 'string',
      tradeDate: 'string',
      alreadyGuaranteeFee: 'number',
      alreadyLiquidatedDamages: 'number',
      restGuaranteeFee: 'number',
      restLiquidatedDamages: 'number',
      needGuaranteeFee: 'number',
      needLiquidatedDamages: 'number',
      overdueDays: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 反欺诈风险数据服务风险信息
export class RiskInfo extends $tea.Model {
  // 反欺诈风险数据服务风险组描述
  riskGroupDesc: string;
  // 反欺诈风险数据服务风险组名
  riskGroup: string;
  // 反欺诈风险数据服务风险组类别
  riskGroupCategory: string;
  // 反欺诈风险数据服务风险组信息
  riskDetails: RiskDetail[];
  static names(): { [key: string]: string } {
    return {
      riskGroupDesc: 'risk_group_desc',
      riskGroup: 'risk_group',
      riskGroupCategory: 'risk_group_category',
      riskDetails: 'risk_details',
    };
  }

  static types(): { [key: string]: any } {
    return {
      riskGroupDesc: 'string',
      riskGroup: 'string',
      riskGroupCategory: 'string',
      riskDetails: { 'type': 'array', 'itemType': RiskDetail },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 天枢更新渠道返回
export class UpdateCustomerRelationResponseData extends $tea.Model {
  // id
  id?: number;
  // 渠道编码
  channelCode?: string;
  // 渠道id
  channelNo?: string;
  // 客户号
  customerNo?: string;
  // 创建时间
  createTime?: string;
  // 更新时间
  updateTime?: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      channelCode: 'channel_code',
      channelNo: 'channel_no',
      customerNo: 'customer_no',
      createTime: 'create_time',
      updateTime: 'update_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'number',
      channelCode: 'string',
      channelNo: 'string',
      customerNo: 'string',
      createTime: 'string',
      updateTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 短信模板
export class SmsTemplate extends $tea.Model {
  // 场景策略ID
  sceneStrategyId: string;
  // 计划名称
  sceneStrategyName: string;
  // 模板内容
  templateContent: string;
  static names(): { [key: string]: string } {
    return {
      sceneStrategyId: 'scene_strategy_id',
      sceneStrategyName: 'scene_strategy_name',
      templateContent: 'template_content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      sceneStrategyId: 'string',
      sceneStrategyName: 'string',
      templateContent: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 回流事件记录
export class BackflowEventRecord extends $tea.Model {
  // 回流事件部分分组后的记录list
  properties: BackflowEventRecordProperty[];
  static names(): { [key: string]: string } {
    return {
      properties: 'properties',
    };
  }

  static types(): { [key: string]: any } {
    return {
      properties: { 'type': 'array', 'itemType': BackflowEventRecordProperty },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 风险维度
export class RtopCompanyRiskFactor extends $tea.Model {
  // 维度名称
  name?: string;
  // 维度分数
  score?: number;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      score: 'score',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      score: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 天枢系统专用Material结构体
export class Material extends $tea.Model {
  // 资料类型0-风控报告1-合同2-图片3-附件
  mType: string;
  // 大类编码00-风控报告10-合同20身份证图片26人脸图片30-附件
  bigCode: string;
  // 小类编码
  // 201-身份证人脸面202身份证国徽面212-活体人脸图片
  smallCode: string;
  // 资料名称
  meterialName: string;
  // 文件地址
  filePath: string;
  static names(): { [key: string]: string } {
    return {
      mType: 'm_type',
      bigCode: 'big_code',
      smallCode: 'small_code',
      meterialName: 'meterial_name',
      filePath: 'file_path',
    };
  }

  static types(): { [key: string]: any } {
    return {
      mType: 'string',
      bigCode: 'string',
      smallCode: 'string',
      meterialName: 'string',
      filePath: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 用户借款是否结清
export class CustomReceiptStatus extends $tea.Model {
  // 是否结清
  receiptFlag?: boolean;
  static names(): { [key: string]: string } {
    return {
      receiptFlag: 'receipt_flag',
    };
  }

  static types(): { [key: string]: any } {
    return {
      receiptFlag: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 天枢系统RiskData结构体
export class RiskData extends $tea.Model {
  // 联系人信息列表
  contacts: Contact[];
  // 人脸对比分
  facePoint?: string;
  // 活体供应商
  faceSource?: string;
  static names(): { [key: string]: string } {
    return {
      contacts: 'contacts',
      facePoint: 'face_point',
      faceSource: 'face_source',
    };
  }

  static types(): { [key: string]: any } {
    return {
      contacts: { 'type': 'array', 'itemType': Contact },
      facePoint: 'string',
      faceSource: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 还款信息列表
export class RepayInfos extends $tea.Model {
  // 期次
  period: number;
  // 实还总额
  amount: number;
  // 实还本金
  principal: number;
  // 实还利息
  interest: number;
  // 实还通道手续费
  channelAmt: number;
  // 实还手续费
  fee: number;
  // 实收罚息
  punish: number;
  // 担保费
  guaranteeFee: number;
  // 违约金
  liquidatedDamages: number;
  static names(): { [key: string]: string } {
    return {
      period: 'period',
      amount: 'amount',
      principal: 'principal',
      interest: 'interest',
      channelAmt: 'channel_amt',
      fee: 'fee',
      punish: 'punish',
      guaranteeFee: 'guarantee_fee',
      liquidatedDamages: 'liquidated_damages',
    };
  }

  static types(): { [key: string]: any } {
    return {
      period: 'number',
      amount: 'number',
      principal: 'number',
      interest: 'number',
      channelAmt: 'number',
      fee: 'number',
      punish: 'number',
      guaranteeFee: 'number',
      liquidatedDamages: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 安全数据服务请求参数
export class SecurityDataQueryStruct extends $tea.Model {
  // 请求数据参数
  params: string;
  // 请求数据类型
  type: string;
  // 请求数据版本
  version: string;
  static names(): { [key: string]: string } {
    return {
      params: 'params',
      type: 'type',
      version: 'version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      params: 'string',
      type: 'string',
      version: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 天枢用户聚合状态信息
export class UserAggregationInfo extends $tea.Model {
  // 状态
  // 0: 未授信
  // 1: 授信中
  // 2: 已授信未支用
  // 3: 支用中
  // 4: 已支用
  // 5: 借据逾期
  // 6: 授信过期
  // 7: 授信冻结
  // 8: 可重新授信
  // 9: 授信拒绝
  status: string;
  // 总额度
  creditAmount?: number;
  // 可用额度
  availableAmount?: number;
  // 待还总金额
  shouldPayAmount?: number;
  // 逾期总金额
  overdueAmount?: number;
  // 下一期应还金额
  nextPeriodAmount?: number;
  // 下一期还款时间yyyy-MM-dd
  nextPeriodRepayTime?: string;
  // 下次可授信时间yyyy-MM-dd
  nextApplyTime?: string;
  // 优惠券列表
  couponList?: CouponInfo[];
  static names(): { [key: string]: string } {
    return {
      status: 'status',
      creditAmount: 'credit_amount',
      availableAmount: 'available_amount',
      shouldPayAmount: 'should_pay_amount',
      overdueAmount: 'overdue_amount',
      nextPeriodAmount: 'next_period_amount',
      nextPeriodRepayTime: 'next_period_repay_time',
      nextApplyTime: 'next_apply_time',
      couponList: 'coupon_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      status: 'string',
      creditAmount: 'number',
      availableAmount: 'number',
      shouldPayAmount: 'number',
      overdueAmount: 'number',
      nextPeriodAmount: 'number',
      nextPeriodRepayTime: 'string',
      nextApplyTime: 'string',
      couponList: { 'type': 'array', 'itemType': CouponInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 场景决策列表
export class SceneInfos extends $tea.Model {
  // 决策结果
  decision: string;
  // 场景code
  sceneCode: string;
  static names(): { [key: string]: string } {
    return {
      decision: 'decision',
      sceneCode: 'scene_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      decision: 'string',
      sceneCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 触达策略信息
export class ActionPlanDetailInfo extends $tea.Model {
  // 场景策略id
  sceneStrategyId: number;
  // 场景策略名称
  sceneStrategyName: string;
  // 场景策略状态
  sceneStrategyStatus: string;
  // 创建时间
  gmtCreate: string;
  // 修改时间
  gmtModified: string;
  // 触达媒介参数信息
  actionParamInfo: ActionParamInfo[];
  static names(): { [key: string]: string } {
    return {
      sceneStrategyId: 'scene_strategy_id',
      sceneStrategyName: 'scene_strategy_name',
      sceneStrategyStatus: 'scene_strategy_status',
      gmtCreate: 'gmt_create',
      gmtModified: 'gmt_modified',
      actionParamInfo: 'action_param_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      sceneStrategyId: 'number',
      sceneStrategyName: 'string',
      sceneStrategyStatus: 'string',
      gmtCreate: 'string',
      gmtModified: 'string',
      actionParamInfo: { 'type': 'array', 'itemType': ActionParamInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 标签信息
export class RiskLabelInfo extends $tea.Model {
  // 线索明细类型(字段停用)
  clueDetailType: string;
  // odps数据产出时间，冗余字段，业务上不需要，以备错误排查
  dt?: string;
  // 数据产生时间
  gmtCreate: string;
  // 记录唯一ID
  id: number;
  // 0-正常 1-删除
  isDeleted: number;
  // 企业ID
  mctOneId: string;
  // 操作人ID
  operatorId: string;
  // 操作类型
  // add、delete、update
  opType: string;
  // 企业名称
  orgName: string;
  // 线索类型
  riskDetailType: string;
  // 风险维度
  // 
  riskDimensionType: string;
  // 线索概览
  tagClue: string;
  // 线索明细
  tagClueDetail: string;
  // 标签ID
  tagId: string;
  // 线索列表表头，英文逗号分隔
  // 
  tagListHeaders: string;
  // 标签列表，排序字段
  tagListOrderColumn: string;
  // 标签列表排序方式
  tagListOrderType: string;
  // 标签文本
  tagText: string;
  // 趋势图表名
  tagTrendChartName: string;
  // 数据同步到公有云时间(业务上赋值当天)
  updateDate: string;
  static names(): { [key: string]: string } {
    return {
      clueDetailType: 'clue_detail_type',
      dt: 'dt',
      gmtCreate: 'gmt_create',
      id: 'id',
      isDeleted: 'is_deleted',
      mctOneId: 'mct_one_id',
      operatorId: 'operator_id',
      opType: 'op_type',
      orgName: 'org_name',
      riskDetailType: 'risk_detail_type',
      riskDimensionType: 'risk_dimension_type',
      tagClue: 'tag_clue',
      tagClueDetail: 'tag_clue_detail',
      tagId: 'tag_id',
      tagListHeaders: 'tag_list_headers',
      tagListOrderColumn: 'tag_list_order_column',
      tagListOrderType: 'tag_list_order_type',
      tagText: 'tag_text',
      tagTrendChartName: 'tag_trend_chart_name',
      updateDate: 'update_date',
    };
  }

  static types(): { [key: string]: any } {
    return {
      clueDetailType: 'string',
      dt: 'string',
      gmtCreate: 'string',
      id: 'number',
      isDeleted: 'number',
      mctOneId: 'string',
      operatorId: 'string',
      opType: 'string',
      orgName: 'string',
      riskDetailType: 'string',
      riskDimensionType: 'string',
      tagClue: 'string',
      tagClueDetail: 'string',
      tagId: 'string',
      tagListHeaders: 'string',
      tagListOrderColumn: 'string',
      tagListOrderType: 'string',
      tagText: 'string',
      tagTrendChartName: 'string',
      updateDate: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 企业反馈
export class RtopCompanyFeedback extends $tea.Model {
  // 主键
  id: number;
  // 企业ID
  companyId: string;
  // 反馈原因
  feedbackReason: string;
  // 反馈原因详情
  feedbackReasonDetail: string;
  // 评论
  comment: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      companyId: 'company_id',
      feedbackReason: 'feedback_reason',
      feedbackReasonDetail: 'feedback_reason_detail',
      comment: 'comment',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'number',
      companyId: 'string',
      feedbackReason: 'string',
      feedbackReasonDetail: 'string',
      comment: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 上传文件运行结果
export class RuntimeResult extends $tea.Model {
  // 上传成功
  code: number;
  // true代表上传成功，false代表上传失败
  success: boolean;
  // 上文件传成功
  resultmsg: string;
  // 文件上传结果
  data: string;
  static names(): { [key: string]: string } {
    return {
      code: 'code',
      success: 'success',
      resultmsg: 'resultmsg',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      code: 'number',
      success: 'boolean',
      resultmsg: 'string',
      data: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 监测企业的特征信息
export class RtopMonitorCompanyFeature extends $tea.Model {
  // 特征的描述
  description?: string;
  // 特征的名称
  name: string;
  // 特征里的风险标签列表
  riskTags?: string[];
  // 特征的评分
  score: number;
  static names(): { [key: string]: string } {
    return {
      description: 'description',
      name: 'name',
      riskTags: 'risk_tags',
      score: 'score',
    };
  }

  static types(): { [key: string]: any } {
    return {
      description: 'string',
      name: 'string',
      riskTags: { 'type': 'array', 'itemType': 'string' },
      score: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 风报接口返回结构体
export class RtopCompanyRiskInfo extends $tea.Model {
  // 区域类型
  placeType?: string;
  // 区域
  placeName?: string;
  // 企业唯一id
  mctOneId?: string;
  // 企业统一社会信用代码
  ucCode?: string;
  // 工商注册号
  regNo?: string;
  // 组织机构代码
  orgCode?: string;
  // 企业名
  orgName?: string;
  // 风险评分
  riskScore?: string;
  // 风险变化程度排序，根据分值波动大小，标签变更次数排序
  riskShiftRank?: string;
  // 风险定性
  riskType?: string;
  // 风险标签id列表
  riskTagsId?: string[];
  // 线索
  tagsClue?: string;
  // 风险线索明细
  tagsClueDetail?: string;
  static names(): { [key: string]: string } {
    return {
      placeType: 'place_type',
      placeName: 'place_name',
      mctOneId: 'mct_one_id',
      ucCode: 'uc_code',
      regNo: 'reg_no',
      orgCode: 'org_code',
      orgName: 'org_name',
      riskScore: 'risk_score',
      riskShiftRank: 'risk_shift_rank',
      riskType: 'risk_type',
      riskTagsId: 'risk_tags_id',
      tagsClue: 'tags_clue',
      tagsClueDetail: 'tags_clue_detail',
    };
  }

  static types(): { [key: string]: any } {
    return {
      placeType: 'string',
      placeName: 'string',
      mctOneId: 'string',
      ucCode: 'string',
      regNo: 'string',
      orgCode: 'string',
      orgName: 'string',
      riskScore: 'string',
      riskShiftRank: 'string',
      riskType: 'string',
      riskTagsId: { 'type': 'array', 'itemType': 'string' },
      tagsClue: 'string',
      tagsClueDetail: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 企业年报信息
export class RtopRiskStormCompanyAnnualReport extends $tea.Model {
  // 年报个数
  annualReportCount?: number;
  // 年报是否发生股权转让
  annualReportHasEquityTransfer?: boolean;
  // 年报是否对外提供担保
  annualReportHasExternalGuarantee?: boolean;
  // 年报是否对外投资
  annualReportHasExternalInvest?: boolean;
  // 营业总收入中主营业务收入
  annualReportMainBusinessIncome?: string;
  // 年报净利润
  annualReportNetProfit?: string;
  // 年报发布日期
  annualReportReleaseDate?: string;
  // 年报股东实缴出资额（万元（实缴出资额用两个冒号::分割）
  annualReportShActualPaid?: string;
  // 年报公司人数
  annualReportStaffCount?: number;
  // 资产总额
  annualReportTotalAssets?: string;
  // 负债总额
  annualReportTotalLiabilities?: string;
  // 营业总收入
  annualReportTotalOperatingIncome?: string;
  // 年报所有者权益合计
  annualReportTotalOwnerEquity?: string;
  // 年报利润总额
  annualReportTotalProfit?: string;
  // 纳税总额
  annualReportTotalTax?: string;
  // 年报报送年度
  annualReportYear?: string;
  static names(): { [key: string]: string } {
    return {
      annualReportCount: 'annual_report_count',
      annualReportHasEquityTransfer: 'annual_report_has_equity_transfer',
      annualReportHasExternalGuarantee: 'annual_report_has_external_guarantee',
      annualReportHasExternalInvest: 'annual_report_has_external_invest',
      annualReportMainBusinessIncome: 'annual_report_main_business_income',
      annualReportNetProfit: 'annual_report_net_profit',
      annualReportReleaseDate: 'annual_report_release_date',
      annualReportShActualPaid: 'annual_report_sh_actual_paid',
      annualReportStaffCount: 'annual_report_staff_count',
      annualReportTotalAssets: 'annual_report_total_assets',
      annualReportTotalLiabilities: 'annual_report_total_liabilities',
      annualReportTotalOperatingIncome: 'annual_report_total_operating_income',
      annualReportTotalOwnerEquity: 'annual_report_total_owner_equity',
      annualReportTotalProfit: 'annual_report_total_profit',
      annualReportTotalTax: 'annual_report_total_tax',
      annualReportYear: 'annual_report_year',
    };
  }

  static types(): { [key: string]: any } {
    return {
      annualReportCount: 'number',
      annualReportHasEquityTransfer: 'boolean',
      annualReportHasExternalGuarantee: 'boolean',
      annualReportHasExternalInvest: 'boolean',
      annualReportMainBusinessIncome: 'string',
      annualReportNetProfit: 'string',
      annualReportReleaseDate: 'string',
      annualReportShActualPaid: 'string',
      annualReportStaffCount: 'number',
      annualReportTotalAssets: 'string',
      annualReportTotalLiabilities: 'string',
      annualReportTotalOperatingIncome: 'string',
      annualReportTotalOwnerEquity: 'string',
      annualReportTotalProfit: 'string',
      annualReportTotalTax: 'string',
      annualReportYear: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 信护盾产品查询信息
export class QueryInfo extends $tea.Model {
  // key
  key?: string;
  // value
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

// 营销盾场景策略上传结果
export class StrategyUploadResult extends $tea.Model {
  // 元数据id
  ruleMetaId?: number;
  // 场景id
  sceneId?: number;
  // 租户场景id
  tenantSceneId?: number;
  // 圈客规则id
  decisionRuleId?: number;
  // 场景策略id
  sceneStrategyId?: number;
  static names(): { [key: string]: string } {
    return {
      ruleMetaId: 'rule_meta_id',
      sceneId: 'scene_id',
      tenantSceneId: 'tenant_scene_id',
      decisionRuleId: 'decision_rule_id',
      sceneStrategyId: 'scene_strategy_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      ruleMetaId: 'number',
      sceneId: 'number',
      tenantSceneId: 'number',
      decisionRuleId: 'number',
      sceneStrategyId: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 全局动态中的企业
export class RtopRiskyCompany extends $tea.Model {
  // 企业ID
  companyId: string;
  // 异动分数
  changeScore: string;
  // 异动程度
  changeLevel: string;
  // 新增企业的时间
  newAddedTime: string;
  // 总公司注册地
  headRegisterPlace: string;
  // 数据的时间
  dataTime: string;
  static names(): { [key: string]: string } {
    return {
      companyId: 'company_id',
      changeScore: 'change_score',
      changeLevel: 'change_level',
      newAddedTime: 'new_added_time',
      headRegisterPlace: 'head_register_place',
      dataTime: 'data_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      companyId: 'string',
      changeScore: 'string',
      changeLevel: 'string',
      newAddedTime: 'string',
      headRegisterPlace: 'string',
      dataTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// zhima.customer.ep.identification.query
// 在认证完成后,商户可以查询认证的状态和结果
// 
export class ZhimaQueryResp extends $tea.Model {
  // 认证的企业证件号
  epCertNo?: string;
  // 认证的企业名
  epName?: string;
  // 认证不通过的错误码
  failedCode?: string;
  // 认证是否通过，通过为true，不通过为false
  passed?: string;
  //  10000是成功，其余是失败
  resultCode: string;
  //  
  resultMsg: string;
  //  
  subCode?: string;
  //  
  subMsg?: string;
  static names(): { [key: string]: string } {
    return {
      epCertNo: 'ep_cert_no',
      epName: 'ep_name',
      failedCode: 'failed_code',
      passed: 'passed',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      subCode: 'sub_code',
      subMsg: 'sub_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      epCertNo: 'string',
      epName: 'string',
      failedCode: 'string',
      passed: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      subCode: 'string',
      subMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 企业涉众风险详细信息
export class RtopCrowdRiskSummaryResp extends $tea.Model {
  // 活跃市
  activeCity?: string;
  // 活跃县
  activeCounty?: string;
  // 活跃省
  activeProvince?: string;
  // 风险标签
  clueTags?: string[];
  // 企业ID
  companyId: string;
  // 企业名称
  companyName: string;
  // 风险等级
  crowdRiskLevel?: string;
  // 涉众风险分数
  crowdRiskScore?: number;
  // 涉众风险类型
  crowdRiskType?: string;
  // 发现时间
  detectedTime?: string;
  // 影响金额
  moneyInvolved?: number;
  // 影响人数
  peopleInvolved?: number;
  // 注册市
  registeredCity?: string;
  // 注册县
  registeredCounty?: string;
  // 注册省
  registeredProvince?: string;
  static names(): { [key: string]: string } {
    return {
      activeCity: 'active_city',
      activeCounty: 'active_county',
      activeProvince: 'active_province',
      clueTags: 'clue_tags',
      companyId: 'company_id',
      companyName: 'company_name',
      crowdRiskLevel: 'crowd_risk_level',
      crowdRiskScore: 'crowd_risk_score',
      crowdRiskType: 'crowd_risk_type',
      detectedTime: 'detected_time',
      moneyInvolved: 'money_involved',
      peopleInvolved: 'people_involved',
      registeredCity: 'registered_city',
      registeredCounty: 'registered_county',
      registeredProvince: 'registered_province',
    };
  }

  static types(): { [key: string]: any } {
    return {
      activeCity: 'string',
      activeCounty: 'string',
      activeProvince: 'string',
      clueTags: { 'type': 'array', 'itemType': 'string' },
      companyId: 'string',
      companyName: 'string',
      crowdRiskLevel: 'string',
      crowdRiskScore: 'number',
      crowdRiskType: 'string',
      detectedTime: 'string',
      moneyInvolved: 'number',
      peopleInvolved: 'number',
      registeredCity: 'string',
      registeredCounty: 'string',
      registeredProvince: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 回执统计结果
export class StatisticResult extends $tea.Model {
  // 有效任务总数量
  validCount: number;
  // 各类actionDriverCode的统计结果集合
  statisticInfoDetailList: StatisticInfoDetail[];
  static names(): { [key: string]: string } {
    return {
      validCount: 'valid_count',
      statisticInfoDetailList: 'statistic_info_detail_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      validCount: 'number',
      statisticInfoDetailList: { 'type': 'array', 'itemType': StatisticInfoDetail },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 标签配置全量信息
export class RiskLabelConfigInfo extends $tea.Model {
  // id
  id: number;
  // 线索ID
  tagId: string;
  // 标签文本
  tagText: string;
  // 风险维度
  riskDimensionType: string;
  // 线索类型
  riskDetailType: string;
  // 趋势图表名
  tagTrendChartName: string;
  // 线索列表表头，英文逗号分隔
  tagListHeaders: string;
  // 标签列表，排序字段
  tagListOrderColumn: string;
  // 标签列表排序方式
  tagListOrderType: string;
  // 标记删除
  isDelete: number;
  // 创建时间
  gmtCreate: string;
  // 修改时间
  gmtModified: string;
  // 操作人ID
  operatorId: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      tagId: 'tag_id',
      tagText: 'tag_text',
      riskDimensionType: 'risk_dimension_type',
      riskDetailType: 'risk_detail_type',
      tagTrendChartName: 'tag_trend_chart_name',
      tagListHeaders: 'tag_list_headers',
      tagListOrderColumn: 'tag_list_order_column',
      tagListOrderType: 'tag_list_order_type',
      isDelete: 'is_delete',
      gmtCreate: 'gmt_create',
      gmtModified: 'gmt_modified',
      operatorId: 'operator_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'number',
      tagId: 'string',
      tagText: 'string',
      riskDimensionType: 'string',
      riskDetailType: 'string',
      tagTrendChartName: 'string',
      tagListHeaders: 'string',
      tagListOrderColumn: 'string',
      tagListOrderType: 'string',
      isDelete: 'number',
      gmtCreate: 'string',
      gmtModified: 'string',
      operatorId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 策略详情
export class StrategyDetails extends $tea.Model {
  // 策略id
  id: string;
  // 策略名称
  name: string;
  // 决策结果
  decision: string;
  // 场景码
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

// 反欺诈风险数据服务决策结果
export class SecurityResultInfos extends $tea.Model {
  // 反欺诈风险数据服务风险建议决策
  decision: string;
  // 反欺诈风险数据服务风险分
  riskScore: number;
  // 反欺诈风险数据服务场景码
  sceneCode: string;
  static names(): { [key: string]: string } {
    return {
      decision: 'decision',
      riskScore: 'risk_score',
      sceneCode: 'scene_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      decision: 'string',
      riskScore: 'number',
      sceneCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 企业影响人数年龄分布统计
export class RtopAgeDistribution extends $tea.Model {
  // 年龄
  age: string;
  // 统计值
  count: number;
  static names(): { [key: string]: string } {
    return {
      age: 'age',
      count: 'count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      age: 'string',
      count: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 企业信息
export class CompanyInfo extends $tea.Model {
  // 活跃地json
  activeAddrJson: string;
  // 活跃市(字段停用)
  activeCity: string;
  // 活跃县(字段停用)
  activeCounty: string;
  // 活跃省(字段停用)
  activeProvince: string;
  // 类经融行业分类
  categories: string;
  // 核准日期
  checkDate: string;
  // 删除标志
  delFlag: string;
  // odps数据产生时间，业务上不关心
  dt: string;
  // 企业曾用名
  formerOrgNames: string;
  // {"mct_one_id":"ID1","org_name":"总公司名称1"}
  headOffice: string;
  // 记录ID
  id: number;
  // 影响金额
  involvedAmount: number;
  // 影响人数
  involvedPeople: number;
  // 重要关联企业,json格式
  keyRelaOrgs: string;
  // 法人
  legalRepresentative: string;
  // 企业ID
  mctOneId: string;
  // 经营地json
  operatingAddrJson: string;
  // 经营市(字段停用)
  operatingCity: string;
  // 经营县(字段停用)
  operatingCounty: string;
  // 经营地址(字段停用)
  operatingPlace: string;
  // 经营省(字段停用)
  operatingProvince: string;
  // 营运状态(1:营运0:不营运)
  oprtActvState: string;
  // 经营期限至
  oprtEndDate: string;
  // 经营范围
  oprtScope: string;
  // 经营期限自
  oprtStartDate: string;
  // 操作类型
  // 
  opType: string;
  // 组织机构代码
  orgCode: string;
  // 电子邮箱
  orgEmail: string;
  // 企业名
  orgName: string;
  // 注册资本折人民币(万元)
  orgRegCptlRmb: string;
  // 企业状态
  orgState: string;
  // 联系电话
  orgTel: string;
  // 企业类型
  orgType: string;
  // 平台名
  platformName: string;
  // 平台状态
  platformStates: string;
  // 注册资本币种
  registerCapitalCurrency: string;
  // 注册资本值
  registerCapitalValue: string;
  // 注册市
  registerCity: string;
  // 注册区县
  registerCounty: string;
  // 注册时间
  registerDate: string;
  // 注册地址
  registerPlace: string;
  // 注册省
  registerProvince: string;
  // 登记机关
  registrationAuthority: string;
  // 工商注册号
  regNo: string;
  // 风报企业ID
  riskstormCompanyId: string;
  // 风险维度
  riskFactors: string;
  // 风险图谱可视化数据
  riskGraphJson: string;
  // 风险报文
  riskMessage: string;
  // 风险指数
  riskScore: number;
  // 风险指数，按日的趋势图
  riskScoreTrend: string;
  // 风险指数周波动
  riskScoreWeeklyFloat: number;
  // 风险标签(字段停用)
  riskTags: string;
  // 风险标签ID
  riskTagsId: string;
  // 风险定性
  riskType: string;
  // 搜索内容
  searchContent: string;
  // 传播人次
  spreadNumber: number;
  // 影响地区人次分布,json格式如下
  spreadNumDistribution: string;
  // 社会统一信用代码
  ucCode: string;
  // 公有云数据库产生时间
  updateDate: string;
  // 平台json  
  platform: string;
  static names(): { [key: string]: string } {
    return {
      activeAddrJson: 'active_addr_json',
      activeCity: 'active_city',
      activeCounty: 'active_county',
      activeProvince: 'active_province',
      categories: 'categories',
      checkDate: 'check_date',
      delFlag: 'del_flag',
      dt: 'dt',
      formerOrgNames: 'former_org_names',
      headOffice: 'head_office',
      id: 'id',
      involvedAmount: 'involved_amount',
      involvedPeople: 'involved_people',
      keyRelaOrgs: 'key_rela_orgs',
      legalRepresentative: 'legal_representative',
      mctOneId: 'mct_one_id',
      operatingAddrJson: 'operating_addr_json',
      operatingCity: 'operating_city',
      operatingCounty: 'operating_county',
      operatingPlace: 'operating_place',
      operatingProvince: 'operating_province',
      oprtActvState: 'oprt_actv_state',
      oprtEndDate: 'oprt_end_date',
      oprtScope: 'oprt_scope',
      oprtStartDate: 'oprt_start_date',
      opType: 'op_type',
      orgCode: 'org_code',
      orgEmail: 'org_email',
      orgName: 'org_name',
      orgRegCptlRmb: 'org_reg_cptl_rmb',
      orgState: 'org_state',
      orgTel: 'org_tel',
      orgType: 'org_type',
      platformName: 'platform_name',
      platformStates: 'platform_states',
      registerCapitalCurrency: 'register_capital_currency',
      registerCapitalValue: 'register_capital_value',
      registerCity: 'register_city',
      registerCounty: 'register_county',
      registerDate: 'register_date',
      registerPlace: 'register_place',
      registerProvince: 'register_province',
      registrationAuthority: 'registration_authority',
      regNo: 'reg_no',
      riskstormCompanyId: 'riskstorm_company_id',
      riskFactors: 'risk_factors',
      riskGraphJson: 'risk_graph_json',
      riskMessage: 'risk_message',
      riskScore: 'risk_score',
      riskScoreTrend: 'risk_score_trend',
      riskScoreWeeklyFloat: 'risk_score_weekly_float',
      riskTags: 'risk_tags',
      riskTagsId: 'risk_tags_id',
      riskType: 'risk_type',
      searchContent: 'search_content',
      spreadNumber: 'spread_number',
      spreadNumDistribution: 'spread_num_distribution',
      ucCode: 'uc_code',
      updateDate: 'update_date',
      platform: 'platform',
    };
  }

  static types(): { [key: string]: any } {
    return {
      activeAddrJson: 'string',
      activeCity: 'string',
      activeCounty: 'string',
      activeProvince: 'string',
      categories: 'string',
      checkDate: 'string',
      delFlag: 'string',
      dt: 'string',
      formerOrgNames: 'string',
      headOffice: 'string',
      id: 'number',
      involvedAmount: 'number',
      involvedPeople: 'number',
      keyRelaOrgs: 'string',
      legalRepresentative: 'string',
      mctOneId: 'string',
      operatingAddrJson: 'string',
      operatingCity: 'string',
      operatingCounty: 'string',
      operatingPlace: 'string',
      operatingProvince: 'string',
      oprtActvState: 'string',
      oprtEndDate: 'string',
      oprtScope: 'string',
      oprtStartDate: 'string',
      opType: 'string',
      orgCode: 'string',
      orgEmail: 'string',
      orgName: 'string',
      orgRegCptlRmb: 'string',
      orgState: 'string',
      orgTel: 'string',
      orgType: 'string',
      platformName: 'string',
      platformStates: 'string',
      registerCapitalCurrency: 'string',
      registerCapitalValue: 'string',
      registerCity: 'string',
      registerCounty: 'string',
      registerDate: 'string',
      registerPlace: 'string',
      registerProvince: 'string',
      registrationAuthority: 'string',
      regNo: 'string',
      riskstormCompanyId: 'string',
      riskFactors: 'string',
      riskGraphJson: 'string',
      riskMessage: 'string',
      riskScore: 'number',
      riskScoreTrend: 'string',
      riskScoreWeeklyFloat: 'number',
      riskTags: 'string',
      riskTagsId: 'string',
      riskType: 'string',
      searchContent: 'string',
      spreadNumber: 'number',
      spreadNumDistribution: 'string',
      ucCode: 'string',
      updateDate: 'string',
      platform: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 营销盾离线圈客任务详细信息
export class UmktOfflineDecisionTaskDetailInfo extends $tea.Model {
  // 任务id
  taskId: number;
  // 圈客计划id
  decisionPlanId: number;
  // 圈客结果状态
  decisionResultStatus: string;
  // 圈客结果状态描述
  statusRemark: string;
  static names(): { [key: string]: string } {
    return {
      taskId: 'task_id',
      decisionPlanId: 'decision_plan_id',
      decisionResultStatus: 'decision_result_status',
      statusRemark: 'status_remark',
    };
  }

  static types(): { [key: string]: any } {
    return {
      taskId: 'number',
      decisionPlanId: 'number',
      decisionResultStatus: 'string',
      statusRemark: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 营销盾事件信息同步详情
export class EventResultSyncDetail extends $tea.Model {
  // 事件唯一id（单个租户全局唯一）
  eventId: string;
  // 营销计划id
  planId: string;
  // 消息id
  msgId: string;
  // 事件时间
  eventTime: string;
  // 事件类型：1为富信贴尾
  eventType: number;
  // 1为成功 2为失败
  state: number;
  // 用户key类型
  keyType: string;
  // 手机号
  customerKey: string;
  // 扩展字段
  extData: string;
  static names(): { [key: string]: string } {
    return {
      eventId: 'event_id',
      planId: 'plan_id',
      msgId: 'msg_id',
      eventTime: 'event_time',
      eventType: 'event_type',
      state: 'state',
      keyType: 'key_type',
      customerKey: 'customer_key',
      extData: 'ext_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      eventId: 'string',
      planId: 'string',
      msgId: 'string',
      eventTime: 'string',
      eventType: 'number',
      state: 'number',
      keyType: 'string',
      customerKey: 'string',
      extData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 通用响应结构体
export class RpcommonResp extends $tea.Model {
  // 调用是否成功
  success: boolean;
  // 结果描述
  resultMsg: string;
  // 结果码
  responseCode: string;
  // 具体返回值.jsonString形式
  data: string;
  static names(): { [key: string]: string } {
    return {
      success: 'success',
      resultMsg: 'result_msg',
      responseCode: 'response_code',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      success: 'boolean',
      resultMsg: 'string',
      responseCode: 'string',
      data: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 客户信息结果
export class CustomInfoResult extends $tea.Model {
  // 社会信用代码
  creditCode: string;
  // 公司名称
  companyName: string;
  // 法人姓名
  legalName: string;
  // 身份证号
  idCard: string;
  // 手机号
  phoneNumber: string;
  // 账号
  account: string;
  // 密码
  password: string;
  static names(): { [key: string]: string } {
    return {
      creditCode: 'credit_code',
      companyName: 'company_name',
      legalName: 'legal_name',
      idCard: 'id_card',
      phoneNumber: 'phone_number',
      account: 'account',
      password: 'password',
    };
  }

  static types(): { [key: string]: any } {
    return {
      creditCode: 'string',
      companyName: 'string',
      legalName: 'string',
      idCard: 'string',
      phoneNumber: 'string',
      account: 'string',
      password: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 标签图片
export class RtopTagImage extends $tea.Model {
  // 标签图片表主键
  id: number;
  // 图片
  image?: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      image: 'image',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'number',
      image: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 授信信息
export class ApplyInfo extends $tea.Model {
  // 授信编号
  applyNo?: string;
  // 资金方编号
  fundCode?: string;
  // 资金方名称
  fundName?: string;
  // 贷款利率
  rateValue?: number;
  // 贷款日利率
  rateValueDay?: number;
  // 年天数
  daysNumYear?: number;
  // 总授信额度
  totalAmount?: number;
  // 可用额度
  balanceAmount?: number;
  static names(): { [key: string]: string } {
    return {
      applyNo: 'apply_no',
      fundCode: 'fund_code',
      fundName: 'fund_name',
      rateValue: 'rate_value',
      rateValueDay: 'rate_value_day',
      daysNumYear: 'days_num_year',
      totalAmount: 'total_amount',
      balanceAmount: 'balance_amount',
    };
  }

  static types(): { [key: string]: any } {
    return {
      applyNo: 'string',
      fundCode: 'string',
      fundName: 'string',
      rateValue: 'number',
      rateValueDay: 'number',
      daysNumYear: 'number',
      totalAmount: 'number',
      balanceAmount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 风险基因-点
export class RtopRiskGeneNode extends $tea.Model {
  // 主企业唯一ID
  mainCompanyId?: string;
  // 主企业名称
  mainCompanyName?: string;
  // 节点唯一ID
  nodeId?: string;
  // 节点名称
  nodeName?: string;
  // 节点证件号码
  nodeCertNo?: string;
  // 节点类型，枚举值
  nodeType?: string;
  // 节点扩展信息
  nodeExtJson?: string;
  // 基因模式
  riskLabel?: string;
  // 基因模式
  riskMode?: string;
  static names(): { [key: string]: string } {
    return {
      mainCompanyId: 'main_company_id',
      mainCompanyName: 'main_company_name',
      nodeId: 'node_id',
      nodeName: 'node_name',
      nodeCertNo: 'node_cert_no',
      nodeType: 'node_type',
      nodeExtJson: 'node_ext_json',
      riskLabel: 'risk_label',
      riskMode: 'risk_mode',
    };
  }

  static types(): { [key: string]: any } {
    return {
      mainCompanyId: 'string',
      mainCompanyName: 'string',
      nodeId: 'string',
      nodeName: 'string',
      nodeCertNo: 'string',
      nodeType: 'string',
      nodeExtJson: 'string',
      riskLabel: 'string',
      riskMode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 企业影响人数分布统计
export class RtopPopulationDistribution extends $tea.Model {
  // 市
  city: string;
  // 统计值
  count: number;
  static names(): { [key: string]: string } {
    return {
      city: 'city',
      count: 'count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      city: 'string',
      count: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 天枢文件信息统一结构体
export class DubheFileInfo extends $tea.Model {
  // 文件访问路径
  filePath: string;
  static names(): { [key: string]: string } {
    return {
      filePath: 'file_path',
    };
  }

  static types(): { [key: string]: any } {
    return {
      filePath: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 混合批量营销圈客结果
export class CustomerUmktInfosModel extends $tea.Model {
  // 归属用户的混合营销决策结果
  umktResults: UmktInfoModel[];
  // 用户凭证
  customerKey: string;
  static names(): { [key: string]: string } {
    return {
      umktResults: 'umkt_results',
      customerKey: 'customer_key',
    };
  }

  static types(): { [key: string]: any } {
    return {
      umktResults: { 'type': 'array', 'itemType': UmktInfoModel },
      customerKey: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 模型结果详情
// 
export class ModelDetails extends $tea.Model {
  // 风险场景编码
  sceneCode: string;
  // 该风险场景的风险分值
  // 
  score: string;
  static names(): { [key: string]: string } {
    return {
      sceneCode: 'scene_code',
      score: 'score',
    };
  }

  static types(): { [key: string]: any } {
    return {
      sceneCode: 'string',
      score: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 资金方信息
export class GwFundRouterResult extends $tea.Model {
  // 资金方代码
  fundCode: string;
  // 资金方简称
  abbreFundName: string;
  static names(): { [key: string]: string } {
    return {
      fundCode: 'fund_code',
      abbreFundName: 'abbre_fund_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      fundCode: 'string',
      abbreFundName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 标签过滤配置
export class RiskLabelFilterConfigInfo extends $tea.Model {
  // 创建时间
  gmtCreate: string;
  // 修改时间
  gmtModified: string;
  // id
  id: number;
  // 是否为基本筛选标签
  isBase: number;
  // 标记删除
  isDelete: number;
  // 操作人员ID
  operatorId: string;
  // 地区名
  placeName: string;
  // 地区类型
  placeType: string;
  // 标签ID
  tagId: string;
  static names(): { [key: string]: string } {
    return {
      gmtCreate: 'gmt_create',
      gmtModified: 'gmt_modified',
      id: 'id',
      isBase: 'is_base',
      isDelete: 'is_delete',
      operatorId: 'operator_id',
      placeName: 'place_name',
      placeType: 'place_type',
      tagId: 'tag_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      gmtCreate: 'string',
      gmtModified: 'string',
      id: 'number',
      isBase: 'number',
      isDelete: 'number',
      operatorId: 'string',
      placeName: 'string',
      placeType: 'string',
      tagId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// AI外呼每个用户维度的参数信息
export class RobotCallCustomerParam extends $tea.Model {
  // 手机号/手机号md5
  customerKey: string;
  // 用户维度透传字段
  customerOutInfo?: string;
  // 外呼话术变量字段
  properties?: string;
  static names(): { [key: string]: string } {
    return {
      customerKey: 'customer_key',
      customerOutInfo: 'customer_out_info',
      properties: 'properties',
    };
  }

  static types(): { [key: string]: any } {
    return {
      customerKey: 'string',
      customerOutInfo: 'string',
      properties: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 天枢系统职业信息
export class JobInfo extends $tea.Model {
  // 职业
  jobType?: string;
  // 职务
  workPosition?: string;
  // 工作年限
  jobLife?: string;
  // 本单位工作年限
  currentJobLife?: number;
  // 公司名称
  companyName?: string;
  // 公司行业类型
  companyIndustryType?: string;
  // 公司电话
  companyTel?: string;
  // 公司省份
  companyProvince?: string;
  // 公司城市
  companyCity?: string;
  // 公司区域
  companyArea?: string;
  // 公司街道
  companyStreet?: string;
  // 公司详细地址
  companyAddress?: string;
  // 年收入
  yearSalary?: number;
  static names(): { [key: string]: string } {
    return {
      jobType: 'job_type',
      workPosition: 'work_position',
      jobLife: 'job_life',
      currentJobLife: 'current_job_life',
      companyName: 'company_name',
      companyIndustryType: 'company_industry_type',
      companyTel: 'company_tel',
      companyProvince: 'company_province',
      companyCity: 'company_city',
      companyArea: 'company_area',
      companyStreet: 'company_street',
      companyAddress: 'company_address',
      yearSalary: 'year_salary',
    };
  }

  static types(): { [key: string]: any } {
    return {
      jobType: 'string',
      workPosition: 'string',
      jobLife: 'string',
      currentJobLife: 'number',
      companyName: 'string',
      companyIndustryType: 'string',
      companyTel: 'string',
      companyProvince: 'string',
      companyCity: 'string',
      companyArea: 'string',
      companyStreet: 'string',
      companyAddress: 'string',
      yearSalary: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 天枢系统居住信息结构体
export class LiveInfo extends $tea.Model {
  // 居住省份
  liveProvince?: string;
  // 居住城市
  liveCity?: string;
  // 居住区域
  liveArea?: string;
  // 居住街道
  liveStreet?: string;
  // 居住详细地址
  liveAddress?: string;
  // 居住年限
  liveYears?: number;
  static names(): { [key: string]: string } {
    return {
      liveProvince: 'live_province',
      liveCity: 'live_city',
      liveArea: 'live_area',
      liveStreet: 'live_street',
      liveAddress: 'live_address',
      liveYears: 'live_years',
    };
  }

  static types(): { [key: string]: any } {
    return {
      liveProvince: 'string',
      liveCity: 'string',
      liveArea: 'string',
      liveStreet: 'string',
      liveAddress: 'string',
      liveYears: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 风报风险标签统计
export class RiskStormLabelResp extends $tea.Model {
  // 标签次数
  labelCount: number;
  // 标签id
  labelId: string;
  // 标签名称
  labelName: string;
  static names(): { [key: string]: string } {
    return {
      labelCount: 'label_count',
      labelId: 'label_id',
      labelName: 'label_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      labelCount: 'number',
      labelId: 'string',
      labelName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 芝麻四要素认证接口
export class ZhimaIdentifyResp extends $tea.Model {
  // 唯一ID，接口正常的话有此字段
  bizNo?: string;
  // 带参数的回调地址，接口正常的话有此字段
  certifyUrl?: string;
  // 蚂蚁调用芝麻的错误码
  resultCode: string;
  // 蚂蚁调用芝麻的结果描述
  resultMsg: string;
  // 蚂蚁调用芝麻的错误码
  subCode?: string;
  // 蚂蚁调用芝麻信息
  subMsg?: string;
  static names(): { [key: string]: string } {
    return {
      bizNo: 'biz_no',
      certifyUrl: 'certify_url',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      subCode: 'sub_code',
      subMsg: 'sub_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      bizNo: 'string',
      certifyUrl: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      subCode: 'string',
      subMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 短信模板内容
export class CpaasSmsTemplate extends $tea.Model {
  // 模板类型
  templateType?: string;
  // 模板名称
  templateName?: string;
  // 模板内容
  templateContent?: string;
  // 审批状态
  status?: string;
  // 模版code
  templateCode?: string;
  // 审核未通过原因
  failReason?: string;
  // 短信创建时间
  createTime?: string;
  static names(): { [key: string]: string } {
    return {
      templateType: 'template_type',
      templateName: 'template_name',
      templateContent: 'template_content',
      status: 'status',
      templateCode: 'template_code',
      failReason: 'fail_reason',
      createTime: 'create_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      templateType: 'string',
      templateName: 'string',
      templateContent: 'string',
      status: 'string',
      templateCode: 'string',
      failReason: 'string',
      createTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 输出变量列表
export class VariableDetails extends $tea.Model {
  // 输出变量名称
  variableName: string;
  // 输出变量值
  variableValue: string;
  // 输出变量值类型
  variableType: string;
  static names(): { [key: string]: string } {
    return {
      variableName: 'variable_name',
      variableValue: 'variable_value',
      variableType: 'variable_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      variableName: 'string',
      variableValue: 'string',
      variableType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 舆情的详情
export class RtopCompanyOpinionDetail extends $tea.Model {
  // 具体的舆情内容
  docContent: string;
  // 舆情的id
  docId: string;
  // 舆情的标题
  docTitle: string;
  // 舆情的url
  docUrl: string;
  // 情感得分
  emotionScore?: string;
  // 实体相关度得分
  entityRelevancyScore?: string;
  // 命中的关键词
  hitKeywords?: string;
  // 媒体影响力得分
  mediaInfluenceScore?: string;
  // 来源媒体
  mediaName: string;
  // 媒体传播得分
  mediaPropagationScore?: string;
  // 舆情的发布时间
  publishTime: string;
  // 相似文章数
  similarDocs?: number;
  static names(): { [key: string]: string } {
    return {
      docContent: 'doc_content',
      docId: 'doc_id',
      docTitle: 'doc_title',
      docUrl: 'doc_url',
      emotionScore: 'emotion_score',
      entityRelevancyScore: 'entity_relevancy_score',
      hitKeywords: 'hit_keywords',
      mediaInfluenceScore: 'media_influence_score',
      mediaName: 'media_name',
      mediaPropagationScore: 'media_propagation_score',
      publishTime: 'publish_time',
      similarDocs: 'similar_docs',
    };
  }

  static types(): { [key: string]: any } {
    return {
      docContent: 'string',
      docId: 'string',
      docTitle: 'string',
      docUrl: 'string',
      emotionScore: 'string',
      entityRelevancyScore: 'string',
      hitKeywords: 'string',
      mediaInfluenceScore: 'string',
      mediaName: 'string',
      mediaPropagationScore: 'string',
      publishTime: 'string',
      similarDocs: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 云通信短信发送结果
export class SmsReponse extends $tea.Model {
  // 发送回执ID
  bizId: string;
  // 请求状态码; OK表示成功, 其他表示失败
  code: string;
  // 是否调用接口成功的描述
  message: string;
  // 请求ID
  requestId: string;
  static names(): { [key: string]: string } {
    return {
      bizId: 'biz_id',
      code: 'code',
      message: 'message',
      requestId: 'request_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      bizId: 'string',
      code: 'string',
      message: 'string',
      requestId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 天枢系统专用ReceiptInfo结构体
export class ReceiptInfo extends $tea.Model {
  // 客户名
  customName: string;
  // 证件号码
  cardNo: string;
  // 手机号
  mobile: string;
  // 贷款金额
  applyAmount: number;
  // 发放金额
  loanAmount: number;
  // 期数
  period: number;
  // 当前期数
  curPeriod: number;
  // 还款方式1：等额本息，2：等额本金，3：按月付息到期还本，4：利随本清，5：自由还款
  repayType: string;
  // 还款日
  repayDate: string;
  // 放款时间
  loanTime: string;
  // 借据状态0：未还清，1：已还清，2：已提前还清
  status: string;
  // 已还本金
  alreadyCorpus: number;
  // 已还利息
  alreadyAccrual: number;
  // 结清日期
  alreadyDate: string;
  // 审批状态0：通过 1：拒绝 2：审批中 3：失败
  workflowStatus: string;
  // 借据编号
  receiptNo: string;
  static names(): { [key: string]: string } {
    return {
      customName: 'custom_name',
      cardNo: 'card_no',
      mobile: 'mobile',
      applyAmount: 'apply_amount',
      loanAmount: 'loan_amount',
      period: 'period',
      curPeriod: 'cur_period',
      repayType: 'repay_type',
      repayDate: 'repay_date',
      loanTime: 'loan_time',
      status: 'status',
      alreadyCorpus: 'already_corpus',
      alreadyAccrual: 'already_accrual',
      alreadyDate: 'already_date',
      workflowStatus: 'workflow_status',
      receiptNo: 'receipt_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      customName: 'string',
      cardNo: 'string',
      mobile: 'string',
      applyAmount: 'number',
      loanAmount: 'number',
      period: 'number',
      curPeriod: 'number',
      repayType: 'string',
      repayDate: 'string',
      loanTime: 'string',
      status: 'string',
      alreadyCorpus: 'number',
      alreadyAccrual: 'number',
      alreadyDate: 'string',
      workflowStatus: 'string',
      receiptNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 天枢系统专用RepayRef结构体
export class RepayRef extends $tea.Model {
  // 客户编码
  customNo: string;
  // 当前期数
  period: string;
  // 应还总额
  needAmount: number;
  // 应还本金
  needCorpus: number;
  // 应还利息
  needAccrual: number;
  // 应还手续费
  needFee: number;
  // 已还总额
  alreadyAmount: number;
  // 已还本金
  alreadyCorpus: number;
  // 已还逾期本金
  alreadyOvercorpus: number;
  // 已还利息
  alreadyAccrual: number;
  // 已还逾期息
  alreadyPunish: number;
  // 已还手续费
  alreadyFee: number;
  // 利率
  rate: number;
  // 罚息率
  penaltyValue: number;
  // 当期剩余总额
  restAmount: number;
  // 当期剩余本金
  restCorpus: number;
  // 当期剩余利息
  restAccrual: number;
  // 当期剩余罚息
  restPunish: number;
  // 期末本金
  remainCorpus: number;
  // 借据编号
  receiptNo: string;
  // 还款状态1：已还清 2 未还 3 部分还款
  status: string;
  // 应还日期
  settleDate: string;
  // 还款日期
  tradeDate: string;
  static names(): { [key: string]: string } {
    return {
      customNo: 'custom_no',
      period: 'period',
      needAmount: 'need_amount',
      needCorpus: 'need_corpus',
      needAccrual: 'need_accrual',
      needFee: 'need_fee',
      alreadyAmount: 'already_amount',
      alreadyCorpus: 'already_corpus',
      alreadyOvercorpus: 'already_overcorpus',
      alreadyAccrual: 'already_accrual',
      alreadyPunish: 'already_punish',
      alreadyFee: 'already_fee',
      rate: 'rate',
      penaltyValue: 'penalty_value',
      restAmount: 'rest_amount',
      restCorpus: 'rest_corpus',
      restAccrual: 'rest_accrual',
      restPunish: 'rest_punish',
      remainCorpus: 'remain_corpus',
      receiptNo: 'receipt_no',
      status: 'status',
      settleDate: 'settle_date',
      tradeDate: 'trade_date',
    };
  }

  static types(): { [key: string]: any } {
    return {
      customNo: 'string',
      period: 'string',
      needAmount: 'number',
      needCorpus: 'number',
      needAccrual: 'number',
      needFee: 'number',
      alreadyAmount: 'number',
      alreadyCorpus: 'number',
      alreadyOvercorpus: 'number',
      alreadyAccrual: 'number',
      alreadyPunish: 'number',
      alreadyFee: 'number',
      rate: 'number',
      penaltyValue: 'number',
      restAmount: 'number',
      restCorpus: 'number',
      restAccrual: 'number',
      restPunish: 'number',
      remainCorpus: 'number',
      receiptNo: 'string',
      status: 'string',
      settleDate: 'string',
      tradeDate: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 回调通用返回体
export class CommonNotyfyResult extends $tea.Model {
  // 请求id
  requestId: string;
  // 业务响应Json
  bizResponse: string;
  static names(): { [key: string]: string } {
    return {
      requestId: 'request_id',
      bizResponse: 'biz_response',
    };
  }

  static types(): { [key: string]: any } {
    return {
      requestId: 'string',
      bizResponse: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 收藏的企业信息
export class RtopStarCompanyInfo extends $tea.Model {
  // 行业
  categories?: string[];
  // 经营地址
  operatingPlace?: string;
  // 经营省份
  operatingProvince?: string;
  // 企业名称
  orgName?: string;
  // 风险分数
  riskScore?: number;
  // 风险标签
  riskTags?: string[];
  // 风险线索
  riskTagDetails?: RtopRiskTag[];
  // 风险标签Id集合
  riskTagIds?: string[];
  // 统一社会信用代码
  ucCode?: string;
  static names(): { [key: string]: string } {
    return {
      categories: 'categories',
      operatingPlace: 'operating_place',
      operatingProvince: 'operating_province',
      orgName: 'org_name',
      riskScore: 'risk_score',
      riskTags: 'risk_tags',
      riskTagDetails: 'risk_tag_details',
      riskTagIds: 'risk_tag_ids',
      ucCode: 'uc_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      categories: { 'type': 'array', 'itemType': 'string' },
      operatingPlace: 'string',
      operatingProvince: 'string',
      orgName: 'string',
      riskScore: 'number',
      riskTags: { 'type': 'array', 'itemType': 'string' },
      riskTagDetails: { 'type': 'array', 'itemType': RtopRiskTag },
      riskTagIds: { 'type': 'array', 'itemType': 'string' },
      ucCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 还款方式/借款期数信息
export class PlatformRepayTypeInfo extends $tea.Model {
  // 1：等额本息
  // 2：等额本金
  // 3：按期付息到期还本（先息后本）
  repayType: string;
  // {”1“，”2“}
  periods: string[];
  static names(): { [key: string]: string } {
    return {
      repayType: 'repay_type',
      periods: 'periods',
    };
  }

  static types(): { [key: string]: any } {
    return {
      repayType: 'string',
      periods: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 企业日期趋势统计
export class RtopDateDistribution extends $tea.Model {
  // 统计值
  count: number;
  // 年龄
  date: string;
  static names(): { [key: string]: string } {
    return {
      count: 'count',
      date: 'date',
    };
  }

  static types(): { [key: string]: any } {
    return {
      count: 'number',
      date: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 天枢系统个人信息结构体
export class PersonalInfo extends $tea.Model {
  // 客户姓名
  customName: string;
  // 身份证号码(18位)
  cardNo: string;
  // 1-身份证
  idType: string;
  // 证件开始日期(格式：YYYY-MM-DD)
  // 
  certSignDate: string;
  // 格式：YYYY-MM-DD，身份证有效期为长期的送: 9999-12-31
  certValidate: string;
  // 证件地址
  certAdr: string;
  // 手机号
  mobile: string;
  // 学历
  education?: string;
  // 所在省份 汉字
  province?: string;
  // 所在城市 汉字
  city?: string;
  // 地区名称 汉字
  area?: string;
  // 详细地址
  address?: string;
  // 性别M-男
  // F-女
  sex?: string;
  // 民族
  nation?: string;
  // 婚姻状态：00-未婚，01-已婚，02-离婚，03-丧偶，99-未知
  maritalStatus?: string;
  static names(): { [key: string]: string } {
    return {
      customName: 'custom_name',
      cardNo: 'card_no',
      idType: 'id_type',
      certSignDate: 'cert_sign_date',
      certValidate: 'cert_validate',
      certAdr: 'cert_adr',
      mobile: 'mobile',
      education: 'education',
      province: 'province',
      city: 'city',
      area: 'area',
      address: 'address',
      sex: 'sex',
      nation: 'nation',
      maritalStatus: 'marital_status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      customName: 'string',
      cardNo: 'string',
      idType: 'string',
      certSignDate: 'string',
      certValidate: 'string',
      certAdr: 'string',
      mobile: 'string',
      education: 'string',
      province: 'string',
      city: 'string',
      area: 'string',
      address: 'string',
      sex: 'string',
      nation: 'string',
      maritalStatus: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 策略流信息
export class DfSceneInfos extends $tea.Model {
  // scene_code
  sceneCode: string;
  // 拒绝
  sceneDecision: string;
  // decision_flow
  decisionFlow: DecisionFlow;
  static names(): { [key: string]: string } {
    return {
      sceneCode: 'scene_code',
      sceneDecision: 'scene_decision',
      decisionFlow: 'decision_flow',
    };
  }

  static types(): { [key: string]: any } {
    return {
      sceneCode: 'string',
      sceneDecision: 'string',
      decisionFlow: DecisionFlow,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 用户凭证信息
export class CustomerDetail extends $tea.Model {
  // 用户标识
  customerKey: string;
  // 渠道参数
  channelParams: string;
  // 用户透传字段
  extInfo: string;
  static names(): { [key: string]: string } {
    return {
      customerKey: 'customer_key',
      channelParams: 'channel_params',
      extInfo: 'ext_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      customerKey: 'string',
      channelParams: 'string',
      extInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 用户绑定银行卡列表
export class CustomerBankCardInfo extends $tea.Model {
  // 银行名称
  bankName: string;
  // 银行编码
  bankCode: string;
  // 银行卡号
  bankCardNo: string;
  // 是否已签约
  signed?: string;
  // 是否为账户代扣银行卡
  acctBankCard?: string;
  static names(): { [key: string]: string } {
    return {
      bankName: 'bank_name',
      bankCode: 'bank_code',
      bankCardNo: 'bank_card_no',
      signed: 'signed',
      acctBankCard: 'acct_bank_card',
    };
  }

  static types(): { [key: string]: any } {
    return {
      bankName: 'string',
      bankCode: 'string',
      bankCardNo: 'string',
      signed: 'string',
      acctBankCard: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 供应商
export class Supplier extends $tea.Model {
  // 供应商id
  supplierId: string;
  // 供应商名字
  supplierName: string;
  static names(): { [key: string]: string } {
    return {
      supplierId: 'supplier_id',
      supplierName: 'supplier_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      supplierId: 'string',
      supplierName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 查询结果
export class QueryResult extends $tea.Model {
  // key
  key?: string;
  // value
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

// 逾期信息查询响应
export class OverdueInfoResponse extends $tea.Model {
  // 逾期标识
  // true：逾期
  // false：未逾期
  overDueFlag: boolean;
  // 逾期天数
  overDays: number;
  // 逾期金额在50元以上的客户的逾期天数
  valuableOverDays: number;
  // 逾期期数
  overPeriodCount: number;
  // 逾期本金
  overPrincipal: number;
  // 逾期利息
  overInterest: number;
  // 应还罚息
  overPunish: number;
  // 应还逾期总额
  needOverdueAmount: number;
  // 当前应还总额
  currentNeedAmount: number;
  // 总剩余应还
  totalAmount: number;
  // 数据日期
  settleDate: string;
  // 借款唯一编号
  receiptNo: string;
  // 已还期数
  alreadyRepayPeriodCount: number;
  // 贷款期数
  loanPeriodCount: number;
  // 未还本金
  outstandingPrincipal: number;
  // 放款日期
  loanTime: string;
  // 结清标志
  settleFlag: boolean;
  // 最近一次还款日期
  nearestRepayTime: string;
  static names(): { [key: string]: string } {
    return {
      overDueFlag: 'over_due_flag',
      overDays: 'over_days',
      valuableOverDays: 'valuable_over_days',
      overPeriodCount: 'over_period_count',
      overPrincipal: 'over_principal',
      overInterest: 'over_interest',
      overPunish: 'over_punish',
      needOverdueAmount: 'need_overdue_amount',
      currentNeedAmount: 'current_need_amount',
      totalAmount: 'total_amount',
      settleDate: 'settle_date',
      receiptNo: 'receipt_no',
      alreadyRepayPeriodCount: 'already_repay_period_count',
      loanPeriodCount: 'loan_period_count',
      outstandingPrincipal: 'outstanding_principal',
      loanTime: 'loan_time',
      settleFlag: 'settle_flag',
      nearestRepayTime: 'nearest_repay_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      overDueFlag: 'boolean',
      overDays: 'number',
      valuableOverDays: 'number',
      overPeriodCount: 'number',
      overPrincipal: 'number',
      overInterest: 'number',
      overPunish: 'number',
      needOverdueAmount: 'number',
      currentNeedAmount: 'number',
      totalAmount: 'number',
      settleDate: 'string',
      receiptNo: 'string',
      alreadyRepayPeriodCount: 'number',
      loanPeriodCount: 'number',
      outstandingPrincipal: 'number',
      loanTime: 'string',
      settleFlag: 'boolean',
      nearestRepayTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 企管盾票税交接决策服务指标
export class RdaasTaxDecsionServiceIndicator extends $tea.Model {
  // 决策指标id
  id: string;
  // 决策服务id
  serviceId: string;
  // 属性名
  propertyName: string;
  // 属性值或指标值
  propertyValue?: string;
  // 决策租户
  decisionTenant?: string;
  // 创建时间，格式:yyyy-MM-dd HH:mm:ss
  createTime?: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      serviceId: 'service_id',
      propertyName: 'property_name',
      propertyValue: 'property_value',
      decisionTenant: 'decision_tenant',
      createTime: 'create_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      serviceId: 'string',
      propertyName: 'string',
      propertyValue: 'string',
      decisionTenant: 'string',
      createTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 天枢预览协议信息
export class GetAgreementUrlResponseData extends $tea.Model {
  // 协议标题
  title: string;
  // 协议地址
  agreementUrl?: string;
  // 协议文件Base64
  fileBase64?: string;
  // 协议图片文件base64集合
  picFileBase64List?: string[];
  // 图片文件oss集合
  picOssPathList?: string[];
  // 机构名称
  organizationName: string;
  // 协议类型-code
  fileType: string;
  // 协议类型-名称
  fileTypeName: string;
  static names(): { [key: string]: string } {
    return {
      title: 'title',
      agreementUrl: 'agreement_url',
      fileBase64: 'file_base64',
      picFileBase64List: 'pic_file_base64_list',
      picOssPathList: 'pic_oss_path_list',
      organizationName: 'organization_name',
      fileType: 'file_type',
      fileTypeName: 'file_type_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      title: 'string',
      agreementUrl: 'string',
      fileBase64: 'string',
      picFileBase64List: { 'type': 'array', 'itemType': 'string' },
      picOssPathList: { 'type': 'array', 'itemType': 'string' },
      organizationName: 'string',
      fileType: 'string',
      fileTypeName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 机构平台通知响应结果
export class DefinInnerChannelNotifyResult extends $tea.Model {
  // 请求编号
  requestId: string;
  // 业务响应Json
  bizResponse: string;
  static names(): { [key: string]: string } {
    return {
      requestId: 'request_id',
      bizResponse: 'biz_response',
    };
  }

  static types(): { [key: string]: any } {
    return {
      requestId: 'string',
      bizResponse: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 批量决策单主体查询结果
export class BatchQueryResult extends $tea.Model {
  // 查询主体
  queryKey: string;
  // 单用户决策结果
  decision: string;
  // 输出变量信息
  outputInfo: BatchQueryOutputModelInfo;
  static names(): { [key: string]: string } {
    return {
      queryKey: 'query_key',
      decision: 'decision',
      outputInfo: 'output_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      queryKey: 'string',
      decision: 'string',
      outputInfo: BatchQueryOutputModelInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 营销盾外呼记录
export class CommonRobotCallDetail extends $tea.Model {
  // 客户请求时的透传字段
  extInfo: string;
  // 成功触达：OK；未触达：AI_ROBOT_CALL_REQUEST_NOT_EXIST
  resultCode: string;
  // 外呼号码
  customerKey: string;
  // 呼叫次数
  currentCallTimes: number;
  // 号码模版
  keyTemplate: string;
  // 导入号码时返回的批次号
  batchId: string;
  // 2001:批量-预测外呼，2002:批量-AI外呼-不转人工，2003:批量-AI外呼-接通转人工，2004: 批量-AI外呼-智能转人工,2005:批量-语音通知
  callType: number;
  // 用户自定义标签
  tag?: string;
  // 外呼id
  callId: string;
  // 外呼任务编号
  taskId: number;
  // AI话术ID
  templateId?: number;
  // 外呼状态编码
  statusCode: number;
  // 外呼状态描述
  statusDescription: string;
  // 转人工状态编码
  transferStatusCode: number;
  // 转人工状态
  transferStatus: string;
  // 分配坐席ID
  agentId?: number;
  // 坐席在贵司业务系统唯一标识，用于查询对应agentId；可以为空。
  agentTag?: string;
  // 坐席分机号
  agentExtension?: string;
  // 导入时间
  importTime: string;
  // 开始通话时间
  callBeginTime: string;
  // 振铃时长，单位ms
  ringTime: number;
  // 接通时间
  answerTime?: string;
  // 通话时长，单位：大于1分钟，显示分钟秒，小于1分钟，显示秒
  speakingTime: string;
  // 通话时长，单位：秒
  speakingDuration: number;
  // 挂断时间
  hangupTime: string;
  // 对话轮次
  speakingTurns: number;
  // 人工通话时长，单位：大于1分钟，显示分钟秒，小于1分钟，显示秒
  agentSpeakingTime: string;
  // 人工通话时长，单位：秒
  agentSpeakingDuration: number;
  // 意向标签
  intentTag: string;
  // 意向说明
  intentDescription: string;
  // 个性标签
  individualTag?: string;
  // 回复关键词
  keywords?: string;
  // 挂机方式，AI挂机1，坐席挂机2，客户挂机3
  hungupType: number;
  // 挂机短信，可选值：1、2
  // 1:发送，2:不发送
  sms: string;
  // 对话录音，URL，可以为空
  chatRecord?: string;
  // 聊天记录，可以为空
  chats?: string;
  // 可选值：0、1
  // 0:不添加，1:添加
  addWx?: number;
  // 加微进度，可选值：已申请、加微成功
  addWxStatus?: string;
  // 是否接通重呼，可选值：0、1
  // 0正常外呼，1接通重呼
  answerRecall: number;
  // 导入号码时的参数值
  properties?: string;
  // 导入号码时的业务参数值，原样返回
  bizProperties?: string;
  // 拦截原因：当状态为已拦截时，可选值：黑名单拦截，灰名单拦截，异常号码拦截
  interceptReason?: string;
  static names(): { [key: string]: string } {
    return {
      extInfo: 'ext_info',
      resultCode: 'result_code',
      customerKey: 'customer_key',
      currentCallTimes: 'current_call_times',
      keyTemplate: 'key_template',
      batchId: 'batch_id',
      callType: 'call_type',
      tag: 'tag',
      callId: 'call_id',
      taskId: 'task_id',
      templateId: 'template_id',
      statusCode: 'status_code',
      statusDescription: 'status_description',
      transferStatusCode: 'transfer_status_code',
      transferStatus: 'transfer_status',
      agentId: 'agent_id',
      agentTag: 'agent_tag',
      agentExtension: 'agent_extension',
      importTime: 'import_time',
      callBeginTime: 'call_begin_time',
      ringTime: 'ring_time',
      answerTime: 'answer_time',
      speakingTime: 'speaking_time',
      speakingDuration: 'speaking_duration',
      hangupTime: 'hangup_time',
      speakingTurns: 'speaking_turns',
      agentSpeakingTime: 'agent_speaking_time',
      agentSpeakingDuration: 'agent_speaking_duration',
      intentTag: 'intent_tag',
      intentDescription: 'intent_description',
      individualTag: 'individual_tag',
      keywords: 'keywords',
      hungupType: 'hungup_type',
      sms: 'sms',
      chatRecord: 'chat_record',
      chats: 'chats',
      addWx: 'add_wx',
      addWxStatus: 'add_wx_status',
      answerRecall: 'answer_recall',
      properties: 'properties',
      bizProperties: 'biz_properties',
      interceptReason: 'intercept_reason',
    };
  }

  static types(): { [key: string]: any } {
    return {
      extInfo: 'string',
      resultCode: 'string',
      customerKey: 'string',
      currentCallTimes: 'number',
      keyTemplate: 'string',
      batchId: 'string',
      callType: 'number',
      tag: 'string',
      callId: 'string',
      taskId: 'number',
      templateId: 'number',
      statusCode: 'number',
      statusDescription: 'string',
      transferStatusCode: 'number',
      transferStatus: 'string',
      agentId: 'number',
      agentTag: 'string',
      agentExtension: 'string',
      importTime: 'string',
      callBeginTime: 'string',
      ringTime: 'number',
      answerTime: 'string',
      speakingTime: 'string',
      speakingDuration: 'number',
      hangupTime: 'string',
      speakingTurns: 'number',
      agentSpeakingTime: 'string',
      agentSpeakingDuration: 'number',
      intentTag: 'string',
      intentDescription: 'string',
      individualTag: 'string',
      keywords: 'string',
      hungupType: 'number',
      sms: 'string',
      chatRecord: 'string',
      chats: 'string',
      addWx: 'number',
      addWxStatus: 'string',
      answerRecall: 'number',
      properties: 'string',
      bizProperties: 'string',
      interceptReason: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 支付方式锁定结果
export class PayMethodLockResult extends $tea.Model {
  // 签约结果
  signStatus: string;
  // 账号
  accountId: string;
  // 登录号
  loginId: string;
  // 支付公司
  payChannel: string;
  // 绑定账号名称
  accountName: string;
  static names(): { [key: string]: string } {
    return {
      signStatus: 'sign_status',
      accountId: 'account_id',
      loginId: 'login_id',
      payChannel: 'pay_channel',
      accountName: 'account_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      signStatus: 'string',
      accountId: 'string',
      loginId: 'string',
      payChannel: 'string',
      accountName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 天枢合同
export class Contract extends $tea.Model {
  // 关联编号
  relationNo: string;
  // 合同编号
  contractNo: string;
  // 合同名称
  contractName: string;
  // 合同类型
  contractType: string;
  // 客户编号
  customNo: string;
  // 合同存放目录
  savePath: string;
  // 合同金额
  contractAmount: number;
  // 用信合同编号
  disburseContractNo: string;
  // 授信合同编号
  creditContractNo: string;
  static names(): { [key: string]: string } {
    return {
      relationNo: 'relation_no',
      contractNo: 'contract_no',
      contractName: 'contract_name',
      contractType: 'contract_type',
      customNo: 'custom_no',
      savePath: 'save_path',
      contractAmount: 'contract_amount',
      disburseContractNo: 'disburse_contract_no',
      creditContractNo: 'credit_contract_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      relationNo: 'string',
      contractNo: 'string',
      contractName: 'string',
      contractType: 'string',
      customNo: 'string',
      savePath: 'string',
      contractAmount: 'number',
      disburseContractNo: 'string',
      creditContractNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// ai外呼回调详情
export class AICallbackMessage extends $tea.Model {
  // 批次号
  batchId?: string;
  // 用户标签
  tag: string;
  // 外呼id
  callId: string;
  // 外呼的话术模板Id
  templateId?: number;
  // 外呼状态编码
  statusCode: number;
  // 外呼状态描述
  statusDescription: string;
  // 导入时间
  importTime: string;
  // 开始通话时间
  callBeginTime: string;
  // 振铃时长, 单位毫秒
  ringTime: number;
  // 接通时间
  answerTime: string;
  // AI通话时长,单位s
  speakingDuration: number;
  // 挂断时间
  hangupTime: string;
  // 对话轮次
  speakingTurns: number;
  // 意向标签
  intentTag: string;
  // 意向说明
  intentDescription: string;
  // 个性标签
  individualTag: string;
  // 回复关键词
  keywords: string;
  // 对话录音
  chatRecord?: string;
  // 参数值
  properties: string;
  static names(): { [key: string]: string } {
    return {
      batchId: 'batch_id',
      tag: 'tag',
      callId: 'call_id',
      templateId: 'template_id',
      statusCode: 'status_code',
      statusDescription: 'status_description',
      importTime: 'import_time',
      callBeginTime: 'call_begin_time',
      ringTime: 'ring_time',
      answerTime: 'answer_time',
      speakingDuration: 'speaking_duration',
      hangupTime: 'hangup_time',
      speakingTurns: 'speaking_turns',
      intentTag: 'intent_tag',
      intentDescription: 'intent_description',
      individualTag: 'individual_tag',
      keywords: 'keywords',
      chatRecord: 'chat_record',
      properties: 'properties',
    };
  }

  static types(): { [key: string]: any } {
    return {
      batchId: 'string',
      tag: 'string',
      callId: 'string',
      templateId: 'number',
      statusCode: 'number',
      statusDescription: 'string',
      importTime: 'string',
      callBeginTime: 'string',
      ringTime: 'number',
      answerTime: 'string',
      speakingDuration: 'number',
      hangupTime: 'string',
      speakingTurns: 'number',
      intentTag: 'string',
      intentDescription: 'string',
      individualTag: 'string',
      keywords: 'string',
      chatRecord: 'string',
      properties: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 预警企业
export class RtopCompanyAlarm extends $tea.Model {
  // 企业ID
  companyId: string;
  // 预警类型
  alarmType: string;
  // 预警序号
  alarmIdx: string;
  // 预警日期
  alarmDate: string;
  // 预警标识，是否需要预警
  alarmFlag: string;
  static names(): { [key: string]: string } {
    return {
      companyId: 'company_id',
      alarmType: 'alarm_type',
      alarmIdx: 'alarm_idx',
      alarmDate: 'alarm_date',
      alarmFlag: 'alarm_flag',
    };
  }

  static types(): { [key: string]: any } {
    return {
      companyId: 'string',
      alarmType: 'string',
      alarmIdx: 'string',
      alarmDate: 'string',
      alarmFlag: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 企业影响人数性别分布统计
export class RtopGenderDistribution extends $tea.Model {
  // 统计值
  count: number;
  // 性别
  gender: string;
  static names(): { [key: string]: string } {
    return {
      count: 'count',
      gender: 'gender',
    };
  }

  static types(): { [key: string]: any } {
    return {
      count: 'number',
      gender: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 卡短解析服务返回参数
export class ShortUrlInfo extends $tea.Model {
  // 支持卡片短信的手机号
  mobile: string;
  // 解析生成的短链
  shortUrl: string;
  static names(): { [key: string]: string } {
    return {
      mobile: 'mobile',
      shortUrl: 'short_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      mobile: 'string',
      shortUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 是否联登结构体
export class CustomRelationStatus extends $tea.Model {
  // 是否联登
  regFlag?: boolean;
  static names(): { [key: string]: string } {
    return {
      regFlag: 'reg_flag',
    };
  }

  static types(): { [key: string]: any } {
    return {
      regFlag: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 企管盾票税决策服务
export class RdaasTaxDecsionService extends $tea.Model {
  // 决策服务id
  id: string;
  // 产品编码
  serviceName: string;
  // 区域编码
  serviceZone?: string;
  // 渠道
  channel?: string;
  // 决策租户
  decisionTenant?: string;
  // 是否启用
  status?: string;
  // 创建时间，格式:yyyy-MM-dd HH:mm:ss
  createTime?: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      serviceName: 'service_name',
      serviceZone: 'service_zone',
      channel: 'channel',
      decisionTenant: 'decision_tenant',
      status: 'status',
      createTime: 'create_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      serviceName: 'string',
      serviceZone: 'string',
      channel: 'string',
      decisionTenant: 'string',
      status: 'string',
      createTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 服务上下文包括环境信息和用户信息
export class ServiceContext extends $tea.Model {
  // 客户端IP
  clientIp?: string;
  // 客户端UMID
  clientPcidguid?: string;
  // 服务器名
  serverName?: string;
  // 会话ID
  sessionId?: string;
  // 用户ID
  userId?: string;
  static names(): { [key: string]: string } {
    return {
      clientIp: 'client_ip',
      clientPcidguid: 'client_pcidguid',
      serverName: 'server_name',
      sessionId: 'session_id',
      userId: 'user_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      clientIp: 'string',
      clientPcidguid: 'string',
      serverName: 'string',
      sessionId: 'string',
      userId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 营销盾实时圈客结果返回model
export class CustomerUmktInfoModel extends $tea.Model {
  // 基本圈客结果信息
  baseInfo: BaseCustomerUmktInfoModel;
  // 额外的营销分结果
  umktOutPutInfo?: string;
  static names(): { [key: string]: string } {
    return {
      baseInfo: 'base_info',
      umktOutPutInfo: 'umkt_out_put_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      baseInfo: BaseCustomerUmktInfoModel,
      umktOutPutInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 企业舆情数量
export class RtopCompanyOpinionCount extends $tea.Model {
  // 企业名称
  companyName: string;
  // 企业对应的舆情数量
  count: number;
  static names(): { [key: string]: string } {
    return {
      companyName: 'company_name',
      count: 'count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      companyName: 'string',
      count: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 商户资金链锁定结果
export class FundChainLockResult extends $tea.Model {
  // 店铺名称
  name: string;
  // 店铺id
  id: string;
  // 0:成功
  // 1:失败
  // 2:处理中
  status: string;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      id: 'id',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      id: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 企业地区分布统计
export class RtopRegionalDistribution extends $tea.Model {
  // 统计值
  count: number;
  // 地区
  place: string;
  // 当前地区的涉众风险类型分布，即非法集资有多少企业，传销有多少企业
  typeDistribution?: RtopTypeDistribution[];
  static names(): { [key: string]: string } {
    return {
      count: 'count',
      place: 'place',
      typeDistribution: 'type_distribution',
    };
  }

  static types(): { [key: string]: any } {
    return {
      count: 'number',
      place: 'string',
      typeDistribution: { 'type': 'array', 'itemType': RtopTypeDistribution },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 结清证明响应实体
export class CertificateInfo extends $tea.Model {
  // 结清证明开具结果，0：有结清证明、1：无结清证明、2：开具中、3：暂不支持开具
  status: string;
  // 用信申请订单号
  relationNo?: string;
  // 结清证明url
  certificateUrl?: string;
  // 结清证明文件Base64
  certificateBase64?: string;
  // 说明
  message?: string;
  static names(): { [key: string]: string } {
    return {
      status: 'status',
      relationNo: 'relation_no',
      certificateUrl: 'certificate_url',
      certificateBase64: 'certificate_base64',
      message: 'message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      status: 'string',
      relationNo: 'string',
      certificateUrl: 'string',
      certificateBase64: 'string',
      message: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 涉众风险企业特征
export class RtopCrowdRiskFeatureResp extends $tea.Model {
  // 特征标签列表
  clueTags?: RtopCrowdRiskFeatureTag[];
  // 特征名称
  featureName: string;
  // 特征​分数
  score: number;
  static names(): { [key: string]: string } {
    return {
      clueTags: 'clue_tags',
      featureName: 'feature_name',
      score: 'score',
    };
  }

  static types(): { [key: string]: any } {
    return {
      clueTags: { 'type': 'array', 'itemType': RtopCrowdRiskFeatureTag },
      featureName: 'string',
      score: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 离线圈客计划详细
export class OfflineDecisionPlanDetail extends $tea.Model {
  // 圈客计划ID
  decisionPlanId: string;
  // 离线圈客执行任务状态
  decisionResultStatus: string;
  static names(): { [key: string]: string } {
    return {
      decisionPlanId: 'decision_plan_id',
      decisionResultStatus: 'decision_result_status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      decisionPlanId: 'string',
      decisionResultStatus: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 用户分层信息
export class UserClassifyInfo extends $tea.Model {
  // 版本号
  version: string;
  // 流量分层
  rateClassify: string;
  // 流量扩展分层1
  classifyExt1?: string;
  // 流量扩展分层2
  classifyExt2?: string;
  static names(): { [key: string]: string } {
    return {
      version: 'version',
      rateClassify: 'rate_classify',
      classifyExt1: 'classify_ext1',
      classifyExt2: 'classify_ext2',
    };
  }

  static types(): { [key: string]: any } {
    return {
      version: 'string',
      rateClassify: 'string',
      classifyExt1: 'string',
      classifyExt2: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 待还款信息
export class RepayInfo extends $tea.Model {
  // true：逾期
  // false：未逾期
  overdueFlag: boolean;
  // 逾期天数
  overDays: number;
  // 逾期金额在50元以上的客户的逾期天数
  valuableOverDays: number;
  // 逾期期数
  overPeriodCount: number;
  // 逾期本金
  overPrincipal: number;
  // 逾期利息
  overInterest: number;
  // 应还罚息
  overPunish: number;
  // 应还逾期总额
  needOverdueAmount: number;
  // 当前应还总额（包含逾期和当前期）
  currentNeedAmount: number;
  // 总剩余应还
  totalAmount: number;
  static names(): { [key: string]: string } {
    return {
      overdueFlag: 'overdue_flag',
      overDays: 'over_days',
      valuableOverDays: 'valuable_over_days',
      overPeriodCount: 'over_period_count',
      overPrincipal: 'over_principal',
      overInterest: 'over_interest',
      overPunish: 'over_punish',
      needOverdueAmount: 'need_overdue_amount',
      currentNeedAmount: 'current_need_amount',
      totalAmount: 'total_amount',
    };
  }

  static types(): { [key: string]: any } {
    return {
      overdueFlag: 'boolean',
      overDays: 'number',
      valuableOverDays: 'number',
      overPeriodCount: 'number',
      overPrincipal: 'number',
      overInterest: 'number',
      overPunish: 'number',
      needOverdueAmount: 'number',
      currentNeedAmount: 'number',
      totalAmount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 天枢系统专用CreditAmount结构体
export class CreditAmount extends $tea.Model {
  // 授信额度
  creditAmount: number;
  // 授信余额
  restAmount: number;
  // 发放日期
  payDate: string;
  // 到期日期
  expireDate: string;
  // 利率单位(1:年，2：月，3：日)
  rateUnit: string;
  // 执行利率,利率值，单位%
  // 年化5%，rateValue=5
  // 
  rateValue: number;
  // 还款方式1等额本息2等额本金3先息后本4一次性利随本清5只还本金6等本等息
  repayWay: string;
  // 状态0-正常 1-冻结 2-终止
  status: string;
  // 发放日期（兼容字段）
  payDateSup?: string;
  // 到期日期（兼容字段）
  expireDateSup?: string;
  static names(): { [key: string]: string } {
    return {
      creditAmount: 'credit_amount',
      restAmount: 'rest_amount',
      payDate: 'pay_date',
      expireDate: 'expire_date',
      rateUnit: 'rate_unit',
      rateValue: 'rate_value',
      repayWay: 'repay_way',
      status: 'status',
      payDateSup: 'pay_date_sup',
      expireDateSup: 'expire_date_sup',
    };
  }

  static types(): { [key: string]: any } {
    return {
      creditAmount: 'number',
      restAmount: 'number',
      payDate: 'string',
      expireDate: 'string',
      rateUnit: 'string',
      rateValue: 'number',
      repayWay: 'string',
      status: 'string',
      payDateSup: 'string',
      expireDateSup: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 风控事件咨询查询入参
export class EventInfo extends $tea.Model {
  // 事件编码
  eventCode: string;
  // 事件产生时间
  gmtOccur: string;
  static names(): { [key: string]: string } {
    return {
      eventCode: 'event_code',
      gmtOccur: 'gmt_occur',
    };
  }

  static types(): { [key: string]: any } {
    return {
      eventCode: 'string',
      gmtOccur: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 天枢专用RepayTrail结构体
export class RepayTrail extends $tea.Model {
  // 期数
  period: string;
  // 每期应还金额
  needAmt: number;
  // 每期已还金额
  alreadyAmt: number;
  // 每期应还本金
  transPrincipal: number;
  // 每期应还利息
  transInterest: number;
  // 每期还款费用
  transFee: number;
  // 剩余本金
  remainPrincipal: number;
  // 还款时间
  repayTime: string;
  // 计息开始时间
  startTime: string;
  // 计息结束时间
  endTime: string;
  // 试算编号
  trialNo: string;
  // 优惠后应还金额
  discountAfterNeedAmt?: number;
  // 优惠后应还利息
  discountAfterInterest?: number;
  // 优惠利息
  discountInterest?: number;
  static names(): { [key: string]: string } {
    return {
      period: 'period',
      needAmt: 'need_amt',
      alreadyAmt: 'already_amt',
      transPrincipal: 'trans_principal',
      transInterest: 'trans_interest',
      transFee: 'trans_fee',
      remainPrincipal: 'remain_principal',
      repayTime: 'repay_time',
      startTime: 'start_time',
      endTime: 'end_time',
      trialNo: 'trial_no',
      discountAfterNeedAmt: 'discount_after_need_amt',
      discountAfterInterest: 'discount_after_interest',
      discountInterest: 'discount_interest',
    };
  }

  static types(): { [key: string]: any } {
    return {
      period: 'string',
      needAmt: 'number',
      alreadyAmt: 'number',
      transPrincipal: 'number',
      transInterest: 'number',
      transFee: 'number',
      remainPrincipal: 'number',
      repayTime: 'string',
      startTime: 'string',
      endTime: 'string',
      trialNo: 'string',
      discountAfterNeedAmt: 'number',
      discountAfterInterest: 'number',
      discountInterest: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 授信状态
export class CustomStatus extends $tea.Model {
  // 是否进行过授信申请
  applyFlag?: boolean;
  // 0:通过； 1:拒绝； 2:处理中；
  status?: string;
  // 拒绝原因
  msg?: string;
  static names(): { [key: string]: string } {
    return {
      applyFlag: 'apply_flag',
      status: 'status',
      msg: 'msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      applyFlag: 'boolean',
      status: 'string',
      msg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 营销盾租户触达策略计划信息
export class TenantActionPlanInfo extends $tea.Model {
  // 场景策略id
  sceneStrategyId: number;
  // 营销名称
  sceneStrategyName: string;
  // 营销状态
  sceneStrategyStatus: string;
  // 渠道id
  actionDriverCode: number;
  // 渠道类型
  channelCode: string;
  // 创建时间
  gmtCreate: string;
  // 修改时间
  gmtModified: string;
  // 场景策略入参名
  actionParamInfo?: string[];
  // 参数查询是否完成
  isParamQueryDone?: boolean;
  static names(): { [key: string]: string } {
    return {
      sceneStrategyId: 'scene_strategy_id',
      sceneStrategyName: 'scene_strategy_name',
      sceneStrategyStatus: 'scene_strategy_status',
      actionDriverCode: 'action_driver_code',
      channelCode: 'channel_code',
      gmtCreate: 'gmt_create',
      gmtModified: 'gmt_modified',
      actionParamInfo: 'action_param_info',
      isParamQueryDone: 'is_param_query_done',
    };
  }

  static types(): { [key: string]: any } {
    return {
      sceneStrategyId: 'number',
      sceneStrategyName: 'string',
      sceneStrategyStatus: 'string',
      actionDriverCode: 'number',
      channelCode: 'string',
      gmtCreate: 'string',
      gmtModified: 'string',
      actionParamInfo: { 'type': 'array', 'itemType': 'string' },
      isParamQueryDone: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushQmpBackflowEventRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 回流事件id，对应租户回流事件id
  eventId: number;
  // 回流事件记录列表
  eventRecords: BackflowEventRecord[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      eventId: 'event_id',
      eventRecords: 'event_records',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      eventId: 'number',
      eventRecords: { 'type': 'array', 'itemType': BackflowEventRecord },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushQmpBackflowEventResponse extends $tea.Model {
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
          sdk_version: "1.0.1",
          _prod_code: "RISKPLUS",
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
   * Description: 蚁盾业务回流事件推送
   * Summary: 蚁盾业务回流事件推送
   */
  async pushQmpBackflowEvent(request: PushQmpBackflowEventRequest): Promise<PushQmpBackflowEventResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pushQmpBackflowEventEx(request, headers, runtime);
  }

  /**
   * Description: 蚁盾业务回流事件推送
   * Summary: 蚁盾业务回流事件推送
   */
  async pushQmpBackflowEventEx(request: PushQmpBackflowEventRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PushQmpBackflowEventResponse> {
    Util.validateModel(request);
    return $tea.cast<PushQmpBackflowEventResponse>(await this.doRequest("1.0", "riskplus.qmp.backflow.event.push", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PushQmpBackflowEventResponse({}));
  }

}
