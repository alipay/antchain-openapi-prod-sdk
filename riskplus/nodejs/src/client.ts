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

// 月供
export class TermDetail extends $tea.Model {
  // 期数
  term: string;
  // 期供金额
  termAmount: number;
  // 当期本金
  termPrincipal: number;
  // 当期利息（分期产生的利息/手续费）
  termFee: number;
  // 应还款日期
  settleDate: string;
  // 罚息
  penalty?: number;
  // 担保费
  guaranteeFee?: number;
  // 违约金
  liquidatedDamages?: number;
  // 服务费
  serverFee?: number;
  // 减免金额
  deductAmount?: number;
  static names(): { [key: string]: string } {
    return {
      term: 'term',
      termAmount: 'term_amount',
      termPrincipal: 'term_principal',
      termFee: 'term_fee',
      settleDate: 'settle_date',
      penalty: 'penalty',
      guaranteeFee: 'guarantee_fee',
      liquidatedDamages: 'liquidated_damages',
      serverFee: 'server_fee',
      deductAmount: 'deduct_amount',
    };
  }

  static types(): { [key: string]: any } {
    return {
      term: 'string',
      termAmount: 'number',
      termPrincipal: 'number',
      termFee: 'number',
      settleDate: 'string',
      penalty: 'number',
      guaranteeFee: 'number',
      liquidatedDamages: 'number',
      serverFee: 'number',
      deductAmount: 'number',
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

// 用户混合营销决策结果
export class RpspInfoModel extends $tea.Model {
  // 流量分层计划code
  planCode: string;
  // 场景策略Id
  sceneStrategyId: number;
  // 客群分层结果
  rpspResult: string;
  // 	
  // json 结构的营销额外输出信息
  rpspOutPutInfo: string;
  static names(): { [key: string]: string } {
    return {
      planCode: 'plan_code',
      sceneStrategyId: 'scene_strategy_id',
      rpspResult: 'rpsp_result',
      rpspOutPutInfo: 'rpsp_out_put_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      planCode: 'string',
      sceneStrategyId: 'number',
      rpspResult: 'string',
      rpspOutPutInfo: 'string',
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

// 补充信息
export class Additional extends $tea.Model {
  // 骑手标识；1-骑手
  deliveryman?: string;
  static names(): { [key: string]: string } {
    return {
      deliveryman: 'deliveryman',
    };
  }

  static types(): { [key: string]: any } {
    return {
      deliveryman: 'string',
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

// 测试
export class TestStruct extends $tea.Model {
  // 测试
  testField: SecurityScene[];
  static names(): { [key: string]: string } {
    return {
      testField: 'test_field',
    };
  }

  static types(): { [key: string]: any } {
    return {
      testField: { 'type': 'array', 'itemType': SecurityScene },
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

// 查询结果
export class CustomerRpspInfosModel extends $tea.Model {
  // 归属用户的混合分层决策结果
  rpspResults: RpspInfoModel[];
  // 用户凭证
  customerKey: string;
  static names(): { [key: string]: string } {
    return {
      rpspResults: 'rpsp_results',
      customerKey: 'customer_key',
    };
  }

  static types(): { [key: string]: any } {
    return {
      rpspResults: { 'type': 'array', 'itemType': RpspInfoModel },
      customerKey: 'string',
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

// 客群详细信息
export class CustomerInfo extends $tea.Model {
  // 查询的用户凭证列表
  customerKey: string;
  // 客户属性的额外信息
  properties?: string;
  static names(): { [key: string]: string } {
    return {
      customerKey: 'customer_key',
      properties: 'properties',
    };
  }

  static types(): { [key: string]: any } {
    return {
      customerKey: 'string',
      properties: 'string',
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

// 补充材料
export class SupplementFile extends $tea.Model {
  // 材料类型：
  // 301-行驶证正本
  // 302-行驶证副本
  // 303-车辆产证（摩托车二手车）
  // 
  fileType: string;
  // 材料url
  fileUrl: string;
  // 材料名称/描述
  fileDesc?: string;
  // 材料后缀，如png/jpg/jpeg
  fileSuffix?: string;
  static names(): { [key: string]: string } {
    return {
      fileType: 'file_type',
      fileUrl: 'file_url',
      fileDesc: 'file_desc',
      fileSuffix: 'file_suffix',
    };
  }

  static types(): { [key: string]: any } {
    return {
      fileType: 'string',
      fileUrl: 'string',
      fileDesc: 'string',
      fileSuffix: 'string',
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
  // 放款状态(0：放款成功 1：放款失败 2：放款异常 3：放款中）
  loanStatus?: string;
  // 业务类型 1：现金贷（默认）、2：分期付
  prodType?: string;
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
      loanStatus: 'loan_status',
      prodType: 'prod_type',
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
      loanStatus: 'string',
      prodType: 'string',
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

// 期数费用
export class InstallmentTrial extends $tea.Model {
  // 总期数
  totalPeriod: string;
  // 分期应还总金额
  totalAmount: number;
  // 总利息（分期产生的利息/手续费）
  totalFee: number;
  // 期费率，精确到小数点后四位0.1250，表示年利率为12.5%
  feeRate: number;
  // 年利率，精确到小数点后四位0.1250，表示年利率为12.5%
  yearRate: number;
  // 月供列表
  termDetailList: TermDetail[];
  // 是否最优标识
  optimal?: boolean;
  // 总罚息
  totalPenalty?: number;
  // 总担保费
  totalGuaranteeFee?: number;
  // 总违约金
  totalLiquidatedDamages?: number;
  // 总服务费
  totalServerFee?: number;
  // 费率折扣，0.95：九五折；0：免息；1/null：不打折
  discount?: number;
  // 总减免金额
  totalDeductAmount?: number;
  static names(): { [key: string]: string } {
    return {
      totalPeriod: 'total_period',
      totalAmount: 'total_amount',
      totalFee: 'total_fee',
      feeRate: 'fee_rate',
      yearRate: 'year_rate',
      termDetailList: 'term_detail_list',
      optimal: 'optimal',
      totalPenalty: 'total_penalty',
      totalGuaranteeFee: 'total_guarantee_fee',
      totalLiquidatedDamages: 'total_liquidated_damages',
      totalServerFee: 'total_server_fee',
      discount: 'discount',
      totalDeductAmount: 'total_deduct_amount',
    };
  }

  static types(): { [key: string]: any } {
    return {
      totalPeriod: 'string',
      totalAmount: 'number',
      totalFee: 'number',
      feeRate: 'number',
      yearRate: 'number',
      termDetailList: { 'type': 'array', 'itemType': TermDetail },
      optimal: 'boolean',
      totalPenalty: 'number',
      totalGuaranteeFee: 'number',
      totalLiquidatedDamages: 'number',
      totalServerFee: 'number',
      discount: 'number',
      totalDeductAmount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 营销盾离线圈客执行批次信息
export class UmktOfflineDecisionTaskExecBatchInfo extends $tea.Model {
  // 执行批次
  execBatch: string;
  // 批次下任务列表
  offlineDecisionTaskDetailInfoList: UmktOfflineDecisionTaskDetailInfo[];
  static names(): { [key: string]: string } {
    return {
      execBatch: 'exec_batch',
      offlineDecisionTaskDetailInfoList: 'offline_decision_task_detail_info_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      execBatch: 'string',
      offlineDecisionTaskDetailInfoList: { 'type': 'array', 'itemType': UmktOfflineDecisionTaskDetailInfo },
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

// 门店信息
export class StoreInfo extends $tea.Model {
  // 品牌
  storeBrand: string;
  // 门店ID
  storeId: string;
  // 门店名称
  storeName: string;
  // 统一社会信用代码
  usci: string;
  // 门店-省，浙江省
  province: string;
  // 门店-市，杭州市
  city: string;
  // 门店-区，滨江区
  district: string;
  // 门店-详细地址，
  // 望江路万达广场一层001号
  address: string;
  // 营业执照-开始时间，yyyy-MM-dd
  storeStartDate: string;
  // 营业执照-结束时间，yyyy-MM-dd，长期上送：9999-12-31
  storeEndDate: string;
  // 门店类型，
  // 个体、企业、其他
  storeType: string;
  // 法人-姓名
  legalPersonName: string;
  // 法人-身份证号
  legalPersonIdCard: string;
  // 法人-手机号
  legalPersonMobile: string;
  // 法人-身份证有效期，，身份证反面格式：如yyyy.MM.dd-长期
  effectiveDate: string;
  // 对公-开户行名称
  bankName?: string;
  // 对公-支行名称
  branchName?: string;
  // 对公-联行号
  cnapsCode?: string;
  // 对公-银行账户名称
  accountName?: string;
  // 对公-银行账户号
  accountNumber?: string;
  // 对公-开户行所在省，浙江
  bankProvince?: string;
  // 对公-开户行所在市，杭州
  bankCity?: string;
  // 对私-银行卡号
  payeeBankCard?: string;
  // 对私-银行名称
  payeeBankName?: string;
  // 蚂蚁数科入驻账号
  loginTenant?: string;
  // 入驻时间
  loginDate?: string;
  static names(): { [key: string]: string } {
    return {
      storeBrand: 'store_brand',
      storeId: 'store_id',
      storeName: 'store_name',
      usci: 'usci',
      province: 'province',
      city: 'city',
      district: 'district',
      address: 'address',
      storeStartDate: 'store_start_date',
      storeEndDate: 'store_end_date',
      storeType: 'store_type',
      legalPersonName: 'legal_person_name',
      legalPersonIdCard: 'legal_person_id_card',
      legalPersonMobile: 'legal_person_mobile',
      effectiveDate: 'effective_date',
      bankName: 'bank_name',
      branchName: 'branch_name',
      cnapsCode: 'cnaps_code',
      accountName: 'account_name',
      accountNumber: 'account_number',
      bankProvince: 'bank_province',
      bankCity: 'bank_city',
      payeeBankCard: 'payee_bank_card',
      payeeBankName: 'payee_bank_name',
      loginTenant: 'login_tenant',
      loginDate: 'login_date',
    };
  }

  static types(): { [key: string]: any } {
    return {
      storeBrand: 'string',
      storeId: 'string',
      storeName: 'string',
      usci: 'string',
      province: 'string',
      city: 'string',
      district: 'string',
      address: 'string',
      storeStartDate: 'string',
      storeEndDate: 'string',
      storeType: 'string',
      legalPersonName: 'string',
      legalPersonIdCard: 'string',
      legalPersonMobile: 'string',
      effectiveDate: 'string',
      bankName: 'string',
      branchName: 'string',
      cnapsCode: 'string',
      accountName: 'string',
      accountNumber: 'string',
      bankProvince: 'string',
      bankCity: 'string',
      payeeBankCard: 'string',
      payeeBankName: 'string',
      loginTenant: 'string',
      loginDate: 'string',
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

// 订单车辆信息
export class VehicleInfo extends $tea.Model {
  // 流量方购物订单号
  bizOrderNo: string;
  // 订单[分期]金额，单位：元
  tradeAmount: string;
  // 订单分期金额，单位：元
  installmentAmount?: string;
  // 首付金额，单位：元
  downPayment?: string;
  // pad设备提供
  wifiMac?: string;
  // SN码/中控号(授信后放款前)
  sn?: string;
  // 车驾号(授信后放款前)
  frameNo?: string;
  // SKU ID
  sku: string;
  // 颜色
  color?: string;
  // 车型关键词
  modelKeyword?: string;
  // 续航里程
  range?: string;
  // 新车指导价，单位：元
  guidePrice: string;
  // 售价，单位：元
  sellingPrice: string;
  // 品牌
  brand?: string;
  // 车型
  model?: string;
  // 年款，yyyy
  modelYear?: string;
  // 公里数，Odometer
  odo?: string;
  // 首次上牌时间
  firstRegDate?: string;
  // 过户次数，Ownership Transfer Records
  otr?: string;
  // 配件信息
  parts?: string;
  static names(): { [key: string]: string } {
    return {
      bizOrderNo: 'biz_order_no',
      tradeAmount: 'trade_amount',
      installmentAmount: 'installment_amount',
      downPayment: 'down_payment',
      wifiMac: 'wifi_mac',
      sn: 'sn',
      frameNo: 'frame_no',
      sku: 'sku',
      color: 'color',
      modelKeyword: 'model_keyword',
      range: 'range',
      guidePrice: 'guide_price',
      sellingPrice: 'selling_price',
      brand: 'brand',
      model: 'model',
      modelYear: 'model_year',
      odo: 'odo',
      firstRegDate: 'first_reg_date',
      otr: 'otr',
      parts: 'parts',
    };
  }

  static types(): { [key: string]: any } {
    return {
      bizOrderNo: 'string',
      tradeAmount: 'string',
      installmentAmount: 'string',
      downPayment: 'string',
      wifiMac: 'string',
      sn: 'string',
      frameNo: 'string',
      sku: 'string',
      color: 'string',
      modelKeyword: 'string',
      range: 'string',
      guidePrice: 'string',
      sellingPrice: 'string',
      brand: 'string',
      model: 'string',
      modelYear: 'string',
      odo: 'string',
      firstRegDate: 'string',
      otr: 'string',
      parts: 'string',
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

export class ReceiveBenefithubRiskPayRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 业务分配的平台code，8位纯大写字母code
  platformCode: string;
  // 产品code
  productCode: string;
  // 平台code、用户唯一ID 组合出全局唯一id
  userUniqueId: string;
  // 类型：订单支付结果类、订单退款类、续费扣款类、签约成功、解约成功、订单超时类型
  // 具体如下：
  // ODRDER_PAYMENT-订单支付结果类通知、ORDER_REFUND-订单退款、RENEWAL_DEDUCTION-续费扣款、CONTRACT_SIGNED-签约成功、CONTRACT_TERMINATED-解约成功、
  // ORDER_TIMEOUT-订单超时类型
  resultType: string;
  // 回调结果，json数据
  // 各个平台返回的支付结果、支付退款、续费结果通知、签约、解约、订单、超时关单
  callbackResult: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      platformCode: 'platform_code',
      productCode: 'product_code',
      userUniqueId: 'user_unique_id',
      resultType: 'result_type',
      callbackResult: 'callback_result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      platformCode: 'string',
      productCode: 'string',
      userUniqueId: 'string',
      resultType: 'string',
      callbackResult: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ReceiveBenefithubRiskPayResponse extends $tea.Model {
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

export class NotifyBenefithubRiskLoginRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 平台码
  // 注：不同平台的平台码都是固定好的，如果传入的平台码有误会抛出平台码错误的信息
  platformCode: string;
  // 用户id
  userUniqueId: string;
  // 渠道、平台方推送的手机号
  mobile: string;
  // 产品code必填，后续多产品时可以区分
  productCode?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      platformCode: 'platform_code',
      userUniqueId: 'user_unique_id',
      mobile: 'mobile',
      productCode: 'product_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      platformCode: 'string',
      userUniqueId: 'string',
      mobile: 'string',
      productCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class NotifyBenefithubRiskLoginResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // h5跳转链接
  h5Url?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      h5Url: 'h5_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      h5Url: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchqueryCreditshieldProductInfoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 查询编码： 1.还款概率评估 2.经济波动检测 3.触达前筛等
  queryCode: string;
  // 查询信息集合
  queryInfos?: QueryInfo[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      queryCode: 'query_code',
      queryInfos: 'query_infos',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      queryCode: 'string',
      queryInfos: { 'type': 'array', 'itemType': QueryInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchqueryCreditshieldProductInfoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 查询结果是否成功
  success?: boolean;
  // 查询结果
  queryResults?: QueryResult[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      queryResults: 'query_results',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
      queryResults: { 'type': 'array', 'itemType': QueryResult },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCreditshieldProductCallbackRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 查询编码 
  // 1.支付宝交易流水查询
  // 2.审批回调
  queryCode: string;
  // 查询信息集合
  queryInfos?: QueryInfo[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      queryCode: 'query_code',
      queryInfos: 'query_infos',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      queryCode: 'string',
      queryInfos: { 'type': 'array', 'itemType': QueryInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCreditshieldProductCallbackResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 接口请求是否成功
  success?: boolean;
  // 查询结果
  queryResults?: QueryResult[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      queryResults: 'query_results',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
      queryResults: { 'type': 'array', 'itemType': QueryResult },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySecurityPolicyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 风险类型：表示风险处理或风险咨询——process/advice
  riskType?: string;
  // 风险场景信息
  securityScene?: SecurityScene;
  // 服务上下文
  serviceContext?: ServiceContext;
  // 事件业务属性
  eventInfo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      riskType: 'risk_type',
      securityScene: 'security_scene',
      serviceContext: 'service_context',
      eventInfo: 'event_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      riskType: 'string',
      securityScene: SecurityScene,
      serviceContext: ServiceContext,
      eventInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySecurityPolicyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 反馈成功之后的id
  securityId?: string;
  // 安全处理结果，枚举值为：reject[拒绝],validate[校验],accept[放过]
  securityResult?: string;
  // 是否成功
  success: string;
  // native场景下的核身id
  verifyId?: string;
  // h5场景下的核身地址
  verifyUrl?: string;
  // 场景分
  modelDetails?: ModelDetails;
  // 输出变量
  variableDetails?: VariableDetails;
  // 策略详情
  strategyDetails?: StrategyDetails;
  // 场景决策
  sceneInfos?: SceneInfos;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      securityId: 'security_id',
      securityResult: 'security_result',
      success: 'success',
      verifyId: 'verify_id',
      verifyUrl: 'verify_url',
      modelDetails: 'model_details',
      variableDetails: 'variable_details',
      strategyDetails: 'strategy_details',
      sceneInfos: 'scene_infos',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      securityId: 'string',
      securityResult: 'string',
      success: 'string',
      verifyId: 'string',
      verifyUrl: 'string',
      modelDetails: ModelDetails,
      variableDetails: VariableDetails,
      strategyDetails: StrategyDetails,
      sceneInfos: SceneInfos,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SendSecurityDataRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 安全累计属性列表字段，安全属性列表
  securityContent: string;
  // 代码发送给安全核心的事件编码
  securitySign: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      securityContent: 'security_content',
      securitySign: 'security_sign',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      securityContent: 'string',
      securitySign: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SendSecurityDataResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否成功
  success: string;
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
      success: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ConfirmSecurityPolicyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 二次确认参数，防止篡改
  confirmParams: string;
  // 代码发送给安全核心的事件编码
  securityId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      confirmParams: 'confirm_params',
      securityId: 'security_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      confirmParams: 'string',
      securityId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ConfirmSecurityPolicyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否成功
  success: string;
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
      success: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckSecurityRdsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 输入大字段，具体见接入文档
  rdsContent: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      rdsContent: 'rds_content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      rdsContent: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckSecurityRdsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否成功
  result: number;
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
      result: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySecurityDataRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  reqInfo: SecurityDataQueryStruct[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      reqInfo: 'req_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      reqInfo: { 'type': 'array', 'itemType': SecurityDataQueryStruct },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySecurityDataResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否成功
  success: string;
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
      success: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckSecurityDataRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 入参为Map转换后的String
  reqInfo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      reqInfo: 'req_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      reqInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckSecurityDataResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // code表示状态，message为提示，data为返回结果
  response?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      response: 'response',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      response: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecSecurityRiskdataserviceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 风险数据服务请求事件属性详情
  eventInfo: string;
  // 反欺诈数据服务查询请求唯一凭证，为申请成功后得到，当请求类型是query时必填
  riskDataServiaceApplyId?: string;
  // 反欺诈风险数据服务请求类型（query or apply）
  riskDataServiceType: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      eventInfo: 'event_info',
      riskDataServiaceApplyId: 'risk_data_serviace_apply_id',
      riskDataServiceType: 'risk_data_service_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      eventInfo: 'string',
      riskDataServiaceApplyId: 'string',
      riskDataServiceType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecSecurityRiskdataserviceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 反欺诈风险数据服务申请成功时返回的查询凭证（申请请求时存在）
  riskDataServiceApplyId?: string;
  // 反欺诈风险数据服务查询请求结果中风险详细信息字段（查询请求时存在）
  riskInfos?: RiskInfo[];
  // 请求响应业务唯一id
  securityId?: string;
  // 反欺诈风险数据服务查询成功时得到风险建议结果信息（查询请求时存在）
  securityResultInfos?: SecurityResultInfos;
  // 请求是否成功
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      riskDataServiceApplyId: 'risk_data_service_apply_id',
      riskInfos: 'risk_infos',
      securityId: 'security_id',
      securityResultInfos: 'security_result_infos',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      riskDataServiceApplyId: 'string',
      riskInfos: { 'type': 'array', 'itemType': RiskInfo },
      securityId: 'string',
      securityResultInfos: SecurityResultInfos,
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySaasSecurityPolicyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 风控事件咨询查询入参
  eventInfo: EventInfo;
  // 请求处理方式
  riskType?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      eventInfo: 'event_info',
      riskType: 'risk_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      eventInfo: EventInfo,
      riskType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySaasSecurityPolicyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 场景分
  modelDetails?: ModelDetails[];
  // 安全请求id
  securityId?: string;
  // 策略结果
  securityResult?: string;
  // 策略结果详情
  strategyDetails?: StrategyDetails[];
  // 决策流信息
  dfSceneInfos?: DfSceneInfos[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      modelDetails: 'model_details',
      securityId: 'security_id',
      securityResult: 'security_result',
      strategyDetails: 'strategy_details',
      dfSceneInfos: 'df_scene_infos',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      modelDetails: { 'type': 'array', 'itemType': ModelDetails },
      securityId: 'string',
      securityResult: 'string',
      strategyDetails: { 'type': 'array', 'itemType': StrategyDetails },
      dfSceneInfos: { 'type': 'array', 'itemType': DfSceneInfos },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBatchSecurityPolicyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求事件编码
  eventCode: string;
  // 查询客户主体
  queryKeys: string[];
  // 用户凭证类型, 手机号/身份证号/加密类型等
  queryKeyType: string;
  // 额外的事件属性
  eventInfo: EventInfo[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      eventCode: 'event_code',
      queryKeys: 'query_keys',
      queryKeyType: 'query_key_type',
      eventInfo: 'event_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      eventCode: 'string',
      queryKeys: { 'type': 'array', 'itemType': 'string' },
      queryKeyType: 'string',
      eventInfo: { 'type': 'array', 'itemType': EventInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBatchSecurityPolicyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 查询结果是否成功
  success?: boolean;
  // 批量查询结果
  queryResults?: BatchQueryResult[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      queryResults: 'query_results',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
      queryResults: { 'type': 'array', 'itemType': BatchQueryResult },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCreditshieldProductBatchRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 查询编码：
  // 1.还款概率评估
  // 2.经济波动检测
  // 3.触达前筛
  queryCode: string;
  // 查询信息集合
  queryInfos?: QueryInfo[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      queryCode: 'query_code',
      queryInfos: 'query_infos',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      queryCode: 'string',
      queryInfos: { 'type': 'array', 'itemType': QueryInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCreditshieldProductBatchResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 查询结果是否成功
  success?: boolean;
  // 查询结果
  queryResults?: QueryResult[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      queryResults: 'query_results',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
      queryResults: { 'type': 'array', 'itemType': QueryResult },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDubheTestRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 测试id字段
  testid: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      testid: 'testid',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      testid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDubheTestResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 测试返回体
  testResponseStr?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      testResponseStr: 'test_response_str',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      testResponseStr: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDubheRouterFundrouterRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 身份证号(md5加密32位)
  cardNo: string;
  // 手机号（MD5加密，32位）
  mobile: string;
  // 客户姓名
  customName: string;
  // 合作方产品编号
  prodNo: string;
  // 渠道类型
  channelType?: string;
  // 客户类型
  customType?: string;
  // 导流平台
  trafficPlatform?: string;
  // 流量名称
  trafficSourceName?: string;
  // 广告位标志
  trafficAdId?: string;
  // 预留
  trafficMktId?: string;
  // 预留
  clickId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      cardNo: 'card_no',
      mobile: 'mobile',
      customName: 'custom_name',
      prodNo: 'prod_no',
      channelType: 'channel_type',
      customType: 'custom_type',
      trafficPlatform: 'traffic_platform',
      trafficSourceName: 'traffic_source_name',
      trafficAdId: 'traffic_ad_id',
      trafficMktId: 'traffic_mkt_id',
      clickId: 'click_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      cardNo: 'string',
      mobile: 'string',
      customName: 'string',
      prodNo: 'string',
      channelType: 'string',
      customType: 'string',
      trafficPlatform: 'string',
      trafficSourceName: 'string',
      trafficAdId: 'string',
      trafficMktId: 'string',
      clickId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDubheRouterFundrouterResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 资金方代码
  fundCode?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      fundCode: 'fund_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      fundCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyDubheCreditRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 基础信息
  personalInfo: PersonalInfo;
  // 资产方用户唯一标识
  openId: string;
  // 订单号
  orderNo: string;
  // 居住信息
  borrowerLiveInfo?: LiveInfo;
  // 工作信息
  borrowerEmpInfo?: JobInfo;
  // 产品编号
  prodNo: string;
  // 风险数据对象
  riskData?: RiskData;
  // 借款用途
  loanReason?: string;
  // 资料文件
  materials?: Material[];
  // 导流平台
  trafficPlatform?: string;
  // 流量名称
  trafficSourceName?: string;
  // 广告位标志
  trafficAdId?: string;
  // 预留
  trafficMktId?: string;
  // 预留
  clickId?: string;
  // 渠道类型
  channelType?: string;
  // 客户类型
  customType?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      personalInfo: 'personal_info',
      openId: 'open_id',
      orderNo: 'order_no',
      borrowerLiveInfo: 'borrower_live_info',
      borrowerEmpInfo: 'borrower_emp_info',
      prodNo: 'prod_no',
      riskData: 'risk_data',
      loanReason: 'loan_reason',
      materials: 'materials',
      trafficPlatform: 'traffic_platform',
      trafficSourceName: 'traffic_source_name',
      trafficAdId: 'traffic_ad_id',
      trafficMktId: 'traffic_mkt_id',
      clickId: 'click_id',
      channelType: 'channel_type',
      customType: 'custom_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      personalInfo: PersonalInfo,
      openId: 'string',
      orderNo: 'string',
      borrowerLiveInfo: LiveInfo,
      borrowerEmpInfo: JobInfo,
      prodNo: 'string',
      riskData: RiskData,
      loanReason: 'string',
      materials: { 'type': 'array', 'itemType': Material },
      trafficPlatform: 'string',
      trafficSourceName: 'string',
      trafficAdId: 'string',
      trafficMktId: 'string',
      clickId: 'string',
      channelType: 'string',
      customType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyDubheCreditResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 客户编号
  customNo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      customNo: 'custom_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      customNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDubheCreditStatusRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 授信申请订单号
  originalOrderNo: string;
  // 订单号
  orderNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      originalOrderNo: 'original_order_no',
      orderNo: 'order_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      originalOrderNo: 'string',
      orderNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDubheCreditStatusResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 授信状态（0-通过/1-不通过2-处理中）
  status?: string;
  // 拒绝原因
  msg?: string;
  // 授信额度
  creditAmt?: number;
  // 期数
  period?: number;
  // 还款方式
  repayType?: string;
  // 额度信息
  creditInfo?: CreditAmount;
  // 客户编号(该客户的唯一标识，后续接口需要用到)
  customNo?: string;
  // 授信申请编号
  applyNo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      status: 'status',
      msg: 'msg',
      creditAmt: 'credit_amt',
      period: 'period',
      repayType: 'repay_type',
      creditInfo: 'credit_info',
      customNo: 'custom_no',
      applyNo: 'apply_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      status: 'string',
      msg: 'string',
      creditAmt: 'number',
      period: 'number',
      repayType: 'string',
      creditInfo: CreditAmount,
      customNo: 'string',
      applyNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CountDubheRepayReftrialRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单号
  orderNo: string;
  // 授信申请订单号
  originalOrderNo: string;
  // 产品编号
  prodNo: string;
  // 借款金额
  applyAmount: number;
  // 借款期数
  applyPeriod: number;
  // 还款方式
  repayType: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderNo: 'order_no',
      originalOrderNo: 'original_order_no',
      prodNo: 'prod_no',
      applyAmount: 'apply_amount',
      applyPeriod: 'apply_period',
      repayType: 'repay_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderNo: 'string',
      originalOrderNo: 'string',
      prodNo: 'string',
      applyAmount: 'number',
      applyPeriod: 'number',
      repayType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CountDubheRepayReftrialResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 还款计划试算结果
  repayRefList?: RepayRef[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      repayRefList: 'repay_ref_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      repayRefList: { 'type': 'array', 'itemType': RepayRef },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDubheRepayListRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单号
  orderNo: string;
  // 用信申请订单号
  originalOrderNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderNo: 'order_no',
      originalOrderNo: 'original_order_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderNo: 'string',
      originalOrderNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDubheRepayListResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 还款计划查询结果
  repayRefList?: RepayRef[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      repayRefList: 'repay_ref_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      repayRefList: { 'type': 'array', 'itemType': RepayRef },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyDubheUsecreditRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 授信申请订单号
  originalOrderNo: string;
  // 用信金额
  loanAmount: number;
  // 期数
  period: number;
  // 资产方用户唯一标识
  openId: string;
  // 订单号
  orderOn: string;
  // 还款方式
  repayType: string;
  // 1：手机数码 2：旅游 3：装修 4：教育 5：婚庆 6：租房 7：家具家居 8：健康医疗 9：其他消费 10：家用电器
  loanWay: string;
  // 1: APP
  // 2: 支付宝小程序
  // 3：微信小程序
  // 4：微信公众号
  // 5：PC网页
  // 默认1
  channelType: string;
  // 1: 新增客户
  // 2：存量激活客户
  // 3：目标营销客户
  // 默认1
  customType: string;
  // 指定还款日（仅无在贷借据时生效）
  repayDate: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      originalOrderNo: 'original_order_no',
      loanAmount: 'loan_amount',
      period: 'period',
      openId: 'open_id',
      orderOn: 'order_on',
      repayType: 'repay_type',
      loanWay: 'loan_way',
      channelType: 'channel_type',
      customType: 'custom_type',
      repayDate: 'repay_date',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      originalOrderNo: 'string',
      loanAmount: 'number',
      period: 'number',
      openId: 'string',
      orderOn: 'string',
      repayType: 'string',
      loanWay: 'string',
      channelType: 'string',
      customType: 'string',
      repayDate: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyDubheUsecreditResponse extends $tea.Model {
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

export class QueryDubheUsecreditStatusRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用信申请订单号
  originalOrderNo: string;
  // 请求网络流水号
  orderOn: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      originalOrderNo: 'original_order_no',
      orderOn: 'order_on',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      originalOrderNo: 'string',
      orderOn: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDubheUsecreditStatusResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 用信状态（0-通过/1-不通过2-处理中）
  status?: string;
  // 拒绝原因
  msg?: string;
  // 借据信息
  receiptInfo?: ReceiptInfo;
  // 还款计划列表
  repayRef?: RepayRef[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      status: 'status',
      msg: 'msg',
      receiptInfo: 'receipt_info',
      repayRef: 'repay_ref',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      status: 'string',
      msg: 'string',
      receiptInfo: ReceiptInfo,
      repayRef: { 'type': 'array', 'itemType': RepayRef },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CountDubheRepayTrialRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用信申请订单号
  originalOrderNo: string;
  // 还款类型1:当期结清，2：正常还款3：全部结清
  repayType: string;
  // 订单号
  orderNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      originalOrderNo: 'original_order_no',
      repayType: 'repay_type',
      orderNo: 'order_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      originalOrderNo: 'string',
      repayType: 'string',
      orderNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CountDubheRepayTrialResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 还款本金
  realPrincipal?: number;
  // 还款利息
  realInterest?: number;
  // 还款费用
  realOverAmt?: number;
  // 服务费
  serviceCharge?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      realPrincipal: 'real_principal',
      realInterest: 'real_interest',
      realOverAmt: 'real_over_amt',
      serviceCharge: 'service_charge',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      realPrincipal: 'number',
      realInterest: 'number',
      realOverAmt: 'number',
      serviceCharge: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RepayDubheRepayCheckstandRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用信申请订单号
  originalOrderNo: string;
  // 还款类型1:当期结清，2：正常还款3：全部结清
  repayType: string;
  // 订单号
  orderNo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      originalOrderNo: 'original_order_no',
      repayType: 'repay_type',
      orderNo: 'order_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      originalOrderNo: 'string',
      repayType: 'string',
      orderNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RepayDubheRepayCheckstandResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 收银台地址(成功就有值)
  checkstandAddress?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      checkstandAddress: 'checkstand_address',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      checkstandAddress: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDubheRepayInfoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 原还款订单号
  originalOrderNo: string;
  // 订单号
  orderNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      originalOrderNo: 'original_order_no',
      orderNo: 'order_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      originalOrderNo: 'string',
      orderNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDubheRepayInfoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 还款编号
  repayNo?: string;
  // 借据编码
  receiptNo?: string;
  // 客户编号
  customNo?: string;
  // 客户名称
  customName?: string;
  // 还款类型1:提前还款，2：正常还款 3:批量还款 4：自由还款
  repayType?: string;
  // 还款标志1 线下还款 2 用户主动还款 3 系统代扣
  repaySign?: string;
  // 还款日期
  repayDate?: string;
  // 实还总额
  repayAmount?: number;
  // 实还本金
  repayPrincipal?: number;
  // 实还利息
  repayInterest?: number;
  // 实还通道手续费
  channelAmt?: number;
  // 实还手续费
  repayFee?: string;
  // 实收罚息
  repayPunish?: number;
  // 还款账户
  repayAccount?: string;
  // 还款账户名称
  repayAccountName?: string;
  // 还款账户的手机号
  repayMobile?: string;
  // 还款账户银行行号
  repayBankNo?: string;
  // 还款账户银行名称
  repayBankName?: string;
  // 还款状态0:失败 1成功 2-审批中 3-还款中
  repayStatus?: string;
  // 失败原因
  failReason?: string;
  // 授信申请编号
  applyNo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      repayNo: 'repay_no',
      receiptNo: 'receipt_no',
      customNo: 'custom_no',
      customName: 'custom_name',
      repayType: 'repay_type',
      repaySign: 'repay_sign',
      repayDate: 'repay_date',
      repayAmount: 'repay_amount',
      repayPrincipal: 'repay_principal',
      repayInterest: 'repay_interest',
      channelAmt: 'channel_amt',
      repayFee: 'repay_fee',
      repayPunish: 'repay_punish',
      repayAccount: 'repay_account',
      repayAccountName: 'repay_account_name',
      repayMobile: 'repay_mobile',
      repayBankNo: 'repay_bank_no',
      repayBankName: 'repay_bank_name',
      repayStatus: 'repay_status',
      failReason: 'fail_reason',
      applyNo: 'apply_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      repayNo: 'string',
      receiptNo: 'string',
      customNo: 'string',
      customName: 'string',
      repayType: 'string',
      repaySign: 'string',
      repayDate: 'string',
      repayAmount: 'number',
      repayPrincipal: 'number',
      repayInterest: 'number',
      channelAmt: 'number',
      repayFee: 'string',
      repayPunish: 'number',
      repayAccount: 'string',
      repayAccountName: 'string',
      repayMobile: 'string',
      repayBankNo: 'string',
      repayBankName: 'string',
      repayStatus: 'string',
      failReason: 'string',
      applyNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateDubheCustomerInfoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 客户姓名(可修改字段)
  customName?: string;
  // 户籍所在地(可修改字段)
  censusRegister?: string;
  // 证件号码(可修改字段)
  cardNo?: string;
  // 手机号码(可修改字段)
  mobile?: string;
  // 客户编号(唯一不变)
  customNo: string;
  // 订单号
  orderNo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      customName: 'custom_name',
      censusRegister: 'census_register',
      cardNo: 'card_no',
      mobile: 'mobile',
      customNo: 'custom_no',
      orderNo: 'order_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      customName: 'string',
      censusRegister: 'string',
      cardNo: 'string',
      mobile: 'string',
      customNo: 'string',
      orderNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateDubheCustomerInfoResponse extends $tea.Model {
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

export class ApplyDubheCustomerAgreementsignRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 客户编号
  customNo: string;
  // 订单号
  orderNo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      customNo: 'custom_no',
      orderNo: 'order_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      customNo: 'string',
      orderNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyDubheCustomerAgreementsignResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // sdkParams返回给商户app客户端，作为客户端唤起sdk的入参
  sdkParams?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      sdkParams: 'sdk_params',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      sdkParams: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDubheCustomerAgreementsignRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 客户编号
  customNo: string;
  // 订单号
  orderNo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      customNo: 'custom_no',
      orderNo: 'order_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      customNo: 'string',
      orderNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDubheCustomerAgreementsignResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 客户编号
  customNo?: string;
  // 流水号(代扣协议中标示用户的唯一签约号)
  transSerials?: string;
  // 协议签约状态(0-成功1-失败2-处理中)
  status?: string;
  // 协议签约时间(支付宝代扣协议的实际签约时间，格式为yyyy-MM-dd HH:mm:ss)
  signTime?: string;
  // 协议生效时间(用户代扣协议的实际生效时间，格式为yyyy-MM-dd HH:mm:ss)
  validTime?: string;
  // 协议失效时间(用户代扣协议的失效时间，格式为yyyy-MM-dd HH:mm:ss)
  invalidTime?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      customNo: 'custom_no',
      transSerials: 'trans_serials',
      status: 'status',
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
      customNo: 'string',
      transSerials: 'string',
      status: 'string',
      signTime: 'string',
      validTime: 'string',
      invalidTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RepayDubheRepayWithholdRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // originalOrderNo
  originalOrderNo: string;
  // 还款类型1:当期结清，2：正常还款3：全部结清
  repayType: string;
  // 订单号
  orderNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      originalOrderNo: 'original_order_no',
      repayType: 'repay_type',
      orderNo: 'order_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      originalOrderNo: 'string',
      repayType: 'string',
      orderNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RepayDubheRepayWithholdResponse extends $tea.Model {
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

export class QueryDubheSearchContractRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 原用信订单号
  originalOrderNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      originalOrderNo: 'original_order_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      originalOrderNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDubheSearchContractResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 关联编号（授信/用信）
  relationNo?: string;
  // 合同编号
  contractNo?: string;
  // 合同名称
  contractName?: string;
  // 合同类型
  contractType?: string;
  // 客户编号
  customNo?: string;
  // 下载地址
  savePath?: string;
  // 合同金额
  contractAmount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      relationNo: 'relation_no',
      contractNo: 'contract_no',
      contractName: 'contract_name',
      contractType: 'contract_type',
      customNo: 'custom_no',
      savePath: 'save_path',
      contractAmount: 'contract_amount',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      relationNo: 'string',
      contractNo: 'string',
      contractName: 'string',
      contractType: 'string',
      customNo: 'string',
      savePath: 'string',
      contractAmount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDubheReceiptOverdueRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 合同编号
  contractNo: string;
  // 渠道号
  channelCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      contractNo: 'contract_no',
      channelCode: 'channel_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      contractNo: 'string',
      channelCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDubheReceiptOverdueResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 逾期信息响应
  data?: OverdueInfoResponse;
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
      data: OverdueInfoResponse,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SendDubbridgeSmsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 接收短信的手机号码。支持对多个手机号码发送短信，手机号码之间以英文逗号（,）分隔。上限为1000个手机号码。批量调用相对于单条调用及时性稍有延迟。
  phoneNumbers: string;
  // 短信签名
  signName: string;
  // 短信模板CODE
  templateCode: string;
  // 短信模板变量对应的值，JSON格式
  templateParam?: string;
  // 上行短信扩展码
  smsUpExtendCode?: string;
  // 外部流水扩展
  outId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      phoneNumbers: 'phone_numbers',
      signName: 'sign_name',
      templateCode: 'template_code',
      templateParam: 'template_param',
      smsUpExtendCode: 'sms_up_extend_code',
      outId: 'out_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      phoneNumbers: 'string',
      signName: 'string',
      templateCode: 'string',
      templateParam: 'string',
      smsUpExtendCode: 'string',
      outId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SendDubbridgeSmsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 云通信发送结果
  response?: SmsReponse;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      response: 'response',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      response: SmsReponse,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SendDubbridgeSmsBatchRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 短信模板code
  templateCode: string;
  // 接收短信的手机号码，JSON数组格式
  phoneNumberJson: string;
  // 短信签名名称，JSON数组格式
  signNameJson: string;
  // 短信模板变量对应的实际值，JSON数组格式
  templateParamJson: string;
  // 上行短信扩展码，JSON数组格式。无特殊需要此字段的用户请忽略此字段
  smsUpExtendCodeJson: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      templateCode: 'template_code',
      phoneNumberJson: 'phone_number_json',
      signNameJson: 'sign_name_json',
      templateParamJson: 'template_param_json',
      smsUpExtendCodeJson: 'sms_up_extend_code_json',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      templateCode: 'string',
      phoneNumberJson: 'string',
      signNameJson: 'string',
      templateParamJson: 'string',
      smsUpExtendCodeJson: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SendDubbridgeSmsBatchResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 云通信短信发送结果
  response?: SmsReponse;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      response: 'response',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      response: SmsReponse,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDubbridgeRouterFundrouterRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单号
  orderNo?: string;
  // 1：现金贷（默认）
  // 2：分期付
  prodType?: string;
  // 资产方用户唯一标识
  openId?: string;
  // 手机号
  mobile?: string;
  // 资产方购物订单号，如二轮车/摩托车订单号；购物场景时传递
  bizOrderNo?: string;
  // 身份证号
  cardNo?: string;
  // 姓名
  customName?: string;
  // 默认：0
  // 0：明文
  // 1：md5
  mobileType?: string;
  // 默认：0
  // 0：明文
  // 1：md5
  cardNoType?: string;
  // 默认：0
  // 0：明文
  // 1：md5
  customNameType?: string;
  // 渠道类型
  channelType?: string;
  // 客户类型
  customType?: string;
  // 合作方产品编号
  prodNo?: string;
  // 授信过期的资金方编码
  expiredPlatformNo?: string;
  // 导流平台
  trafficPlatform?: string;
  // 流量名称
  trafficSourceName?: string;
  // 广告位标志
  trafficAdId?: string;
  // 预留
  trafficMktId?: string;
  // 预留
  clickId?: string;
  // 风险字段
  riskData?: string;
  // 扩展字段
  extInfo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderNo: 'order_no',
      prodType: 'prod_type',
      openId: 'open_id',
      mobile: 'mobile',
      bizOrderNo: 'biz_order_no',
      cardNo: 'card_no',
      customName: 'custom_name',
      mobileType: 'mobile_type',
      cardNoType: 'card_no_type',
      customNameType: 'custom_name_type',
      channelType: 'channel_type',
      customType: 'custom_type',
      prodNo: 'prod_no',
      expiredPlatformNo: 'expired_platform_no',
      trafficPlatform: 'traffic_platform',
      trafficSourceName: 'traffic_source_name',
      trafficAdId: 'traffic_ad_id',
      trafficMktId: 'traffic_mkt_id',
      clickId: 'click_id',
      riskData: 'risk_data',
      extInfo: 'ext_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderNo: 'string',
      prodType: 'string',
      openId: 'string',
      mobile: 'string',
      bizOrderNo: 'string',
      cardNo: 'string',
      customName: 'string',
      mobileType: 'string',
      cardNoType: 'string',
      customNameType: 'string',
      channelType: 'string',
      customType: 'string',
      prodNo: 'string',
      expiredPlatformNo: 'string',
      trafficPlatform: 'string',
      trafficSourceName: 'string',
      trafficAdId: 'string',
      trafficMktId: 'string',
      clickId: 'string',
      riskData: 'string',
      extInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDubbridgeRouterFundrouterResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 资金方代码
  fundCode?: string;
  // 资金方简称
  abbreFundName?: string;
  // 客户编号
  customerNo?: string;
  // 资金方列表
  fundList?: GwFundRouterResult[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      fundCode: 'fund_code',
      abbreFundName: 'abbre_fund_name',
      customerNo: 'customer_no',
      fundList: 'fund_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      fundCode: 'string',
      abbreFundName: 'string',
      customerNo: 'string',
      fundList: { 'type': 'array', 'itemType': GwFundRouterResult },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyDubbridgeCreditRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 基础信息
  personalInfo: PersonalInfo;
  // 资产方用户唯一标识
  openId: string;
  // 订单号
  orderNo: string;
  // 居住信息
  borrowerLiveInfo?: LiveInfo;
  // 工作信息
  borrowerEmpInfo?: JobInfo;
  // 产品编号
  prodNo?: string;
  // 风险数据对象json字符串
  riskData: string;
  // 借款用途
  loanReason?: string;
  // 资料文件
  materials?: Material[];
  // 导流平台
  trafficPlatform?: string;
  // 流量名称
  trafficSourceName?: string;
  // 广告位标志
  trafficAdId?: string;
  // 预留
  trafficMktId?: string;
  // 预留
  clickId?: string;
  // 渠道类型
  channelType?: string;
  // 客户类型
  customType?: string;
  // 资金方代码
  fundCode?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      personalInfo: 'personal_info',
      openId: 'open_id',
      orderNo: 'order_no',
      borrowerLiveInfo: 'borrower_live_info',
      borrowerEmpInfo: 'borrower_emp_info',
      prodNo: 'prod_no',
      riskData: 'risk_data',
      loanReason: 'loan_reason',
      materials: 'materials',
      trafficPlatform: 'traffic_platform',
      trafficSourceName: 'traffic_source_name',
      trafficAdId: 'traffic_ad_id',
      trafficMktId: 'traffic_mkt_id',
      clickId: 'click_id',
      channelType: 'channel_type',
      customType: 'custom_type',
      fundCode: 'fund_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      personalInfo: PersonalInfo,
      openId: 'string',
      orderNo: 'string',
      borrowerLiveInfo: LiveInfo,
      borrowerEmpInfo: JobInfo,
      prodNo: 'string',
      riskData: 'string',
      loanReason: 'string',
      materials: { 'type': 'array', 'itemType': Material },
      trafficPlatform: 'string',
      trafficSourceName: 'string',
      trafficAdId: 'string',
      trafficMktId: 'string',
      clickId: 'string',
      channelType: 'string',
      customType: 'string',
      fundCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyDubbridgeCreditResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 客户编号
  customNo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      customNo: 'custom_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      customNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadDubbridgeFileRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单号
  orderNo: string;
  // 渠道号
  channelCode: string;
  // 文件名
  fileName: string;
  // 文件id
  fileObject?: Readable;
  fileObjectName?: string;
  fileId: string;
  // 文件类型
  fileType: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderNo: 'order_no',
      channelCode: 'channel_code',
      fileName: 'file_name',
      fileObject: 'fileObject',
      fileObjectName: 'fileObjectName',
      fileId: 'file_id',
      fileType: 'file_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderNo: 'string',
      channelCode: 'string',
      fileName: 'string',
      fileObject: 'Readable',
      fileObjectName: 'string',
      fileId: 'string',
      fileType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadDubbridgeFileResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 文件信息
  fileInfo?: DubheFileInfo;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      fileInfo: 'file_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      fileInfo: DubheFileInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BindDubbridgeCustomerBankcardRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单号
  orderNo: string;
  // 客户编号
  customerNo: string;
  // 银行卡号
  bankCardNo: string;
  // 渠道描述，具体请见分配
  channelCode: string;
  // 客户名称
  customName?: string;
  // 资产方用户唯一标识
  openId?: string;
  // 身份证号
  cardNo?: string;
  // 手机号
  mobile?: string;
  // 银行名称
  bankName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderNo: 'order_no',
      customerNo: 'customer_no',
      bankCardNo: 'bank_card_no',
      channelCode: 'channel_code',
      customName: 'custom_name',
      openId: 'open_id',
      cardNo: 'card_no',
      mobile: 'mobile',
      bankName: 'bank_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderNo: 'string',
      customerNo: 'string',
      bankCardNo: 'string',
      channelCode: 'string',
      customName: 'string',
      openId: 'string',
      cardNo: 'string',
      mobile: 'string',
      bankName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BindDubbridgeCustomerBankcardResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 绑卡流水
  bindSerialNo?: string;
  // 客户号
  customerNo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      bindSerialNo: 'bind_serial_no',
      customerNo: 'customer_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      bindSerialNo: 'string',
      customerNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class VerifyDubbridgeCustomerBankcardRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单号
  orderNo?: string;
  // 客户号
  customerNo?: string;
  // 绑卡流水
  bindSerialNo: string;
  // 绑卡验证码
  bindValidCode: string;
  // 银行卡号
  bankCardNo: string;
  // 渠道号
  channelCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderNo: 'order_no',
      customerNo: 'customer_no',
      bindSerialNo: 'bind_serial_no',
      bindValidCode: 'bind_valid_code',
      bankCardNo: 'bank_card_no',
      channelCode: 'channel_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderNo: 'string',
      customerNo: 'string',
      bindSerialNo: 'string',
      bindValidCode: 'string',
      bankCardNo: 'string',
      channelCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class VerifyDubbridgeCustomerBankcardResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 绑卡流水
  bindSerialNo?: string;
  // 签约结果
  signResult?: string;
  // 客户号
  customerNo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      bindSerialNo: 'bind_serial_no',
      signResult: 'sign_result',
      customerNo: 'customer_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      bindSerialNo: 'string',
      signResult: 'string',
      customerNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class NotifyDubbridgeDefininnerchannelRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 调用流水
  seqNo: string;
  // 机构平台接口名
  apiName: string;
  // 机构编号
  instMemberCode: string;
  // 业务参数Json
  bizParam: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      seqNo: 'seq_no',
      apiName: 'api_name',
      instMemberCode: 'inst_member_code',
      bizParam: 'biz_param',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      seqNo: 'string',
      apiName: 'string',
      instMemberCode: 'string',
      bizParam: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class NotifyDubbridgeDefininnerchannelResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 处理结果
  data?: DefinInnerChannelNotifyResult;
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
      data: DefinInnerChannelNotifyResult,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDubbridgeCreditStatusRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 授信申请订单号	
  originalOrderNo?: string;
  // 订单号
  orderNo: string;
  // 三方客户id
  openId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      originalOrderNo: 'original_order_no',
      orderNo: 'order_no',
      openId: 'open_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      originalOrderNo: 'string',
      orderNo: 'string',
      openId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDubbridgeCreditStatusResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 授信状态（0-通过/1-不通过2-处理中）
  status?: string;
  // 拒绝原因
  msg?: string;
  // 授信额度
  creditAmt?: number;
  // 期数
  period?: number;
  // 还款方式
  repayType?: string;
  // 额度信息
  creditInfo?: CreditAmount;
  // 客户编号(该客户的唯一标识，后续接口需要用到)
  customNo?: string;
  // 授信申请编号
  applyNo?: string;
  // 资金方编号
  fundCode?: string;
  // 冷静期结束日期
  coolingPeriod?: string;
  // 资金源编码
  loanInstCode?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      status: 'status',
      msg: 'msg',
      creditAmt: 'credit_amt',
      period: 'period',
      repayType: 'repay_type',
      creditInfo: 'credit_info',
      customNo: 'custom_no',
      applyNo: 'apply_no',
      fundCode: 'fund_code',
      coolingPeriod: 'cooling_period',
      loanInstCode: 'loan_inst_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      status: 'string',
      msg: 'string',
      creditAmt: 'number',
      period: 'number',
      repayType: 'string',
      creditInfo: CreditAmount,
      customNo: 'string',
      applyNo: 'string',
      fundCode: 'string',
      coolingPeriod: 'string',
      loanInstCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDubbridgeRiskinfoEnterprisescoreRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 统一信用代码
  socialCreditCode: string;
  // 手机号
  mobile?: string;
  // 客户号
  customerNo: string;
  // 渠道号
  channelCode: string;
  //  手机号md5
  mobileMd5?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      socialCreditCode: 'social_credit_code',
      mobile: 'mobile',
      customerNo: 'customer_no',
      channelCode: 'channel_code',
      mobileMd5: 'mobile_md5',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      socialCreditCode: 'string',
      mobile: 'string',
      customerNo: 'string',
      channelCode: 'string',
      mobileMd5: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDubbridgeRiskinfoEnterprisescoreResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 小微分
  score?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      score: 'score',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      score: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDubbridgeRiskinfoCommonRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 查询id
  queryId: string;
  // 查询id类型
  idType: string;
  // 用户id
  openId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      queryId: 'query_id',
      idType: 'id_type',
      openId: 'open_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      queryId: 'string',
      idType: 'string',
      openId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDubbridgeRiskinfoCommonResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 风控信息Json字符串
  queryResult?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      queryResult: 'query_result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      queryResult: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateDubbridgeInstitutionCreditRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 机构请求流水号，用于幂等。行方需确保唯一性
  serialNo: string;
  // 授信编号，授信申请时同申请单号一致，调额等操作同前授信申请时的授信编号一致
  creditNo: string;
  // 客户姓名
  name: string;
  // 身份证号
  certNo: string;
  // ADJUST_AMT_APPLY|ADJUST_RATE_APPLY|CLEAR_UP_APPLY|FROZEN_APPLY|UN_FROZEN_APPLY
  applyType: string;
  // 基础固额-申请调整值，单位分，机构发起调额场景下有值
  creditAmount?: string;
  // 年利率-申请调整值，机构发起调价场景下有值
  creditRate?: string;
  // 申请来源
  source: string;
  // 机构申请原因码
  reasonCode: string;
  // 机构发起原因描述
  reasonMsg: string;
  // 透传授信阶段天枢字段，json格式
  extInfoTs: string;
  // 扩展信息，json格式
  extInfo: string;
  // 授信有效期-申请调整值，机构发起授信有效期更新场景下有值
  creditExpireDate?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      serialNo: 'serial_no',
      creditNo: 'credit_no',
      name: 'name',
      certNo: 'cert_no',
      applyType: 'apply_type',
      creditAmount: 'credit_amount',
      creditRate: 'credit_rate',
      source: 'source',
      reasonCode: 'reason_code',
      reasonMsg: 'reason_msg',
      extInfoTs: 'ext_info_ts',
      extInfo: 'ext_info',
      creditExpireDate: 'credit_expire_date',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      serialNo: 'string',
      creditNo: 'string',
      name: 'string',
      certNo: 'string',
      applyType: 'string',
      creditAmount: 'string',
      creditRate: 'string',
      source: 'string',
      reasonCode: 'string',
      reasonMsg: 'string',
      extInfoTs: 'string',
      extInfo: 'string',
      creditExpireDate: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateDubbridgeInstitutionCreditResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 蚂蚁端返回申请单号
  applyNo?: string;
  // 机构请求流水号，用于幂等
  serialNo?: string;
  // 业务响应码
  bizCode?: string;
  // 业务消息
  bizMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      applyNo: 'apply_no',
      serialNo: 'serial_no',
      bizCode: 'biz_code',
      bizMsg: 'biz_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      applyNo: 'string',
      serialNo: 'string',
      bizCode: 'string',
      bizMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDubbridgeRiskinfoBusinessinfoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 渠道号
  channelCode: string;
  // 客户号
  customerNo: string;
  // 统一社会信用代码
  socialCreditCode?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      channelCode: 'channel_code',
      customerNo: 'customer_no',
      socialCreditCode: 'social_credit_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      channelCode: 'string',
      customerNo: 'string',
      socialCreditCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDubbridgeRiskinfoBusinessinfoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 企业经营信息
  info?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      info: 'info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      info: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyDubbridgeCustomerAgreementsignRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单号
  orderNo: string;
  // 客户编号
  customNo: string;
  // 张三
  customName: string;
  // 110101xxxxxxxx
  cardNo: string;
  // 证件类型
  idType?: string;
  // 资金方编号
  fundCode?: string;
  // 渠道号
  channelCode?: string;
  // 项目编号
  projectCode?: string;
  // 渠道号
  orgCode?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderNo: 'order_no',
      customNo: 'custom_no',
      customName: 'custom_name',
      cardNo: 'card_no',
      idType: 'id_type',
      fundCode: 'fund_code',
      channelCode: 'channel_code',
      projectCode: 'project_code',
      orgCode: 'org_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderNo: 'string',
      customNo: 'string',
      customName: 'string',
      cardNo: 'string',
      idType: 'string',
      fundCode: 'string',
      channelCode: 'string',
      projectCode: 'string',
      orgCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyDubbridgeCustomerAgreementsignResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // sdkParams返回给商户app客户端，作为客户端唤起sdk的入参
  sdkParams?: string;
  // 客户编号
  customNo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      sdkParams: 'sdk_params',
      customNo: 'custom_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      sdkParams: 'string',
      customNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDubbridgeAccountStatusRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 客户编号（资产方用户唯一标记二选一）
  customNo?: string;
  // 资产方用户唯一标识（资产方用户唯一标记二选一）
  openId?: string;
  // 查询业务
  bizType: string;
  // 渠道号
  channelCode: string;
  // 渠道号
  orgCode?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      customNo: 'custom_no',
      openId: 'open_id',
      bizType: 'biz_type',
      channelCode: 'channel_code',
      orgCode: 'org_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      customNo: 'string',
      openId: 'string',
      bizType: 'string',
      channelCode: 'string',
      orgCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDubbridgeAccountStatusResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 授信申请状态
  data?: CustomStatus;
  // 支付账户签约结果
  payMethodLockResult?: PayMethodLockResult;
  // 支付账户锁定结果
  fundChainLockResult?: FundChainLockResult[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      payMethodLockResult: 'pay_method_lock_result',
      fundChainLockResult: 'fund_chain_lock_result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: CustomStatus,
      payMethodLockResult: PayMethodLockResult,
      fundChainLockResult: { 'type': 'array', 'itemType': FundChainLockResult },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDubbridgeAccountCustomRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 渠道号
  channelCode?: string;
  // 客户编码
  customNo?: string;
  // open_id
  openId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      channelCode: 'channel_code',
      customNo: 'custom_no',
      openId: 'open_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      channelCode: 'string',
      customNo: 'string',
      openId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDubbridgeAccountCustomResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否进行过授信申请
  data?: CustomRelationStatus;
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
      data: CustomRelationStatus,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateDubbridgeAccountCustomRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 渠道编码
  channelCode: string;
  // 新渠道id
  newOpenId: string;
  // 原渠道id
  sourceOpenId: string;
  // 客户号
  customerNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      channelCode: 'channel_code',
      newOpenId: 'new_open_id',
      sourceOpenId: 'source_open_id',
      customerNo: 'customer_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      channelCode: 'string',
      newOpenId: 'string',
      sourceOpenId: 'string',
      customerNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateDubbridgeAccountCustomResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 更新渠道返回体
  data?: UpdateCustomerRelationResponseData;
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
      data: UpdateCustomerRelationResponseData,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDubbridgeCustomerAgreementsignRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 客户编码
  customNo: string;
  // 订单号
  orderNo?: string;
  // 资金方编号
  fundCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      customNo: 'custom_no',
      orderNo: 'order_no',
      fundCode: 'fund_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      customNo: 'string',
      orderNo: 'string',
      fundCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDubbridgeCustomerAgreementsignResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 客户编号
  customNo?: string;
  // 流水号(代扣协议中标示用户的唯一签约号)
  transSerials?: string;
  // 协议签约状态(0-成功1-失败2-处理中)
  status?: string;
  // 协议签约时间(支付宝代扣协议的实际签约时间，格式为yyyy-MM-dd HH:mm:ss)
  signTime?: string;
  // 协议生效时间(用户代扣协议的实际生效时间，格式为yyyy-MM-dd HH:mm:ss)
  validTime?: string;
  // 协议失效时间(用户代扣协议的失效时间，格式为yyyy-MM-dd HH:mm:ss)
  invalidTime?: string;
  // 客户名称
  customName?: string;
  // 支付宝会员id
  alipayUserId?: string;
  // 用以唯一标识用户签约记录的编号
  protocolNo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      customNo: 'custom_no',
      transSerials: 'trans_serials',
      status: 'status',
      signTime: 'sign_time',
      validTime: 'valid_time',
      invalidTime: 'invalid_time',
      customName: 'custom_name',
      alipayUserId: 'alipay_user_id',
      protocolNo: 'protocol_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      customNo: 'string',
      transSerials: 'string',
      status: 'string',
      signTime: 'string',
      validTime: 'string',
      invalidTime: 'string',
      customName: 'string',
      alipayUserId: 'string',
      protocolNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateDubbridgeCustomerInfoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 客户姓名(可修改字段)
  customName?: string;
  // 户籍所在地(可修改字段)
  censusRegister?: string;
  // 证件号码(可修改字段)
  cardNo?: string;
  // 手机号码(可修改字段)
  mobile?: string;
  // 客户编号(唯一不变)
  customNo: string;
  // 订单号
  orderNo?: string;
  // 身份证有效期
  idValidDate?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      customName: 'custom_name',
      censusRegister: 'census_register',
      cardNo: 'card_no',
      mobile: 'mobile',
      customNo: 'custom_no',
      orderNo: 'order_no',
      idValidDate: 'id_valid_date',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      customName: 'string',
      censusRegister: 'string',
      cardNo: 'string',
      mobile: 'string',
      customNo: 'string',
      orderNo: 'string',
      idValidDate: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateDubbridgeCustomerInfoResponse extends $tea.Model {
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

export class QueryDubbridgeReceiptOverdueRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 合同编码
  contractNo: string;
  // 渠道编码
  channelCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      contractNo: 'contract_no',
      channelCode: 'channel_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      contractNo: 'string',
      channelCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDubbridgeReceiptOverdueResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 逾期信息响应
  data?: OverdueInfoResponse;
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
      data: OverdueInfoResponse,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RepayDubbridgeRepayCheckstandRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用信申请订单号
  originalOrderNo: string;
  // 还款类型1:当期结清，2：正常还款3：全部结清
  repayType: string;
  // 订单号
  orderNo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      originalOrderNo: 'original_order_no',
      repayType: 'repay_type',
      orderNo: 'order_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      originalOrderNo: 'string',
      repayType: 'string',
      orderNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RepayDubbridgeRepayCheckstandResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 收银台地址(成功就有值)
  checkstandAddress?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      checkstandAddress: 'checkstand_address',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      checkstandAddress: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDubbridgeRepayInfoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 原还款订单号
  originalOrderNo: string;
  // 订单号
  orderNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      originalOrderNo: 'original_order_no',
      orderNo: 'order_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      originalOrderNo: 'string',
      orderNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDubbridgeRepayInfoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 还款编号
  repayNo?: string;
  // 借据编码
  receiptNo?: string;
  // 客户编号
  customNo?: string;
  // 客户名称
  customName?: string;
  // 还款类型1:提前还款，2：正常还款 3:批量还款 4：自由还款
  repayType?: string;
  // repay_sign
  repaySign?: string;
  // 还款日期
  repayDate?: string;
  // 实还总额
  repayAmount?: number;
  // 实还本金
  repayPrincipal?: number;
  // 实还利息
  repayInterest?: number;
  // 实还通道手续费
  channelAmt?: number;
  // 实还手续费
  repayFee?: string;
  // 实收罚息
  repayPunish?: number;
  // 还款账户
  repayAccount?: string;
  // 还款账户名称
  repayAccountName?: string;
  // 还款账户的手机号
  repayMobile?: string;
  // 还款账户银行行号
  repayBankNo?: string;
  // 还款账户银行名称
  repayBankName?: string;
  // 还款状态0:失败 1成功 2-审批中 3-还款中
  repayStatus?: string;
  // 失败原因
  failReason?: string;
  // 授信申请编号
  applyNo?: string;
  // 担保费
  guaranteeFee?: number;
  // 违约金
  liquidatedDamages?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      repayNo: 'repay_no',
      receiptNo: 'receipt_no',
      customNo: 'custom_no',
      customName: 'custom_name',
      repayType: 'repay_type',
      repaySign: 'repay_sign',
      repayDate: 'repay_date',
      repayAmount: 'repay_amount',
      repayPrincipal: 'repay_principal',
      repayInterest: 'repay_interest',
      channelAmt: 'channel_amt',
      repayFee: 'repay_fee',
      repayPunish: 'repay_punish',
      repayAccount: 'repay_account',
      repayAccountName: 'repay_account_name',
      repayMobile: 'repay_mobile',
      repayBankNo: 'repay_bank_no',
      repayBankName: 'repay_bank_name',
      repayStatus: 'repay_status',
      failReason: 'fail_reason',
      applyNo: 'apply_no',
      guaranteeFee: 'guarantee_fee',
      liquidatedDamages: 'liquidated_damages',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      repayNo: 'string',
      receiptNo: 'string',
      customNo: 'string',
      customName: 'string',
      repayType: 'string',
      repaySign: 'string',
      repayDate: 'string',
      repayAmount: 'number',
      repayPrincipal: 'number',
      repayInterest: 'number',
      channelAmt: 'number',
      repayFee: 'string',
      repayPunish: 'number',
      repayAccount: 'string',
      repayAccountName: 'string',
      repayMobile: 'string',
      repayBankNo: 'string',
      repayBankName: 'string',
      repayStatus: 'string',
      failReason: 'string',
      applyNo: 'string',
      guaranteeFee: 'number',
      liquidatedDamages: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDubbridgeRepayListRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单号
  orderNo: string;
  // 用信申请订单号
  originalOrderNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderNo: 'order_no',
      originalOrderNo: 'original_order_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderNo: 'string',
      originalOrderNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDubbridgeRepayListResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 还款计划查询结果
  repayResultList?: RepayResult[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      repayResultList: 'repay_result_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      repayResultList: { 'type': 'array', 'itemType': RepayResult },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CountDubbridgeRepayReftrialRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单号
  orderNo: string;
  // 授信申请订单号
  originalOrderNo: string;
  // 产品编号
  prodNo?: string;
  // 借款金额
  applyAmount: number;
  // 借款期数
  applyPeriod: number;
  // 还款方式1：等额本息，2：等额本金
  repayType: string;
  // 还款日
  repayDate?: string;
  // 优惠券id
  couponId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderNo: 'order_no',
      originalOrderNo: 'original_order_no',
      prodNo: 'prod_no',
      applyAmount: 'apply_amount',
      applyPeriod: 'apply_period',
      repayType: 'repay_type',
      repayDate: 'repay_date',
      couponId: 'coupon_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderNo: 'string',
      originalOrderNo: 'string',
      prodNo: 'string',
      applyAmount: 'number',
      applyPeriod: 'number',
      repayType: 'string',
      repayDate: 'string',
      couponId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CountDubbridgeRepayReftrialResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 还款计划试算结果
  repayTrailList?: RepayTrail[];
  // 还款日
  repayDate?: string;
  // 还款账户
  repayAccount?: string;
  // 总利息
  totalInterest?: number;
  // 授信信息
  applyInfo?: ApplyInfo;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      repayTrailList: 'repay_trail_list',
      repayDate: 'repay_date',
      repayAccount: 'repay_account',
      totalInterest: 'total_interest',
      applyInfo: 'apply_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      repayTrailList: { 'type': 'array', 'itemType': RepayTrail },
      repayDate: 'string',
      repayAccount: 'string',
      totalInterest: 'number',
      applyInfo: ApplyInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CountDubbridgeRepayTrialRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用信申请订单号
  originalOrderNo: string;
  // 还款类型1:当期结清，2：正常还款3：全部结清
  repayType: string;
  // 订单号
  orderNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      originalOrderNo: 'original_order_no',
      repayType: 'repay_type',
      orderNo: 'order_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      originalOrderNo: 'string',
      repayType: 'string',
      orderNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CountDubbridgeRepayTrialResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 还款本金
  realPrincipal?: number;
  // 还款利息
  realInterest?: number;
  // 还款费用
  realOverAmt?: number;
  // 服务费
  serviceCharge?: number;
  // 担保费
  realGuaranteeFee?: number;
  // 违约金
  realLiquidatedDamages?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      realPrincipal: 'real_principal',
      realInterest: 'real_interest',
      realOverAmt: 'real_over_amt',
      serviceCharge: 'service_charge',
      realGuaranteeFee: 'real_guarantee_fee',
      realLiquidatedDamages: 'real_liquidated_damages',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      realPrincipal: 'number',
      realInterest: 'number',
      realOverAmt: 'number',
      serviceCharge: 'number',
      realGuaranteeFee: 'number',
      realLiquidatedDamages: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RepayDubbridgeRepayWithholdRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 授信申请订单号
  originalOrderNo: string;
  // 还款类型1:当期结清，2：正常还款3：全部结清
  repayType: string;
  // 订单号
  orderNo: string;
  // 校验还款金额
  validRepayAmount?: string;
  // 银行卡号
  bankCardNo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      originalOrderNo: 'original_order_no',
      repayType: 'repay_type',
      orderNo: 'order_no',
      validRepayAmount: 'valid_repay_amount',
      bankCardNo: 'bank_card_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      originalOrderNo: 'string',
      repayType: 'string',
      orderNo: 'string',
      validRepayAmount: 'string',
      bankCardNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RepayDubbridgeRepayWithholdResponse extends $tea.Model {
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

export class QueryDubbridgeSearchContractRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 原用信订单号
  originalOrderNo: string;
  // 客户号
  customerNo: string;
  // 合同类型
  contractType?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      originalOrderNo: 'original_order_no',
      customerNo: 'customer_no',
      contractType: 'contract_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      originalOrderNo: 'string',
      customerNo: 'string',
      contractType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDubbridgeSearchContractResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 合同信息列表
  contracts?: Contract[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      contracts: 'contracts',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      contracts: { 'type': 'array', 'itemType': Contract },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyDubbridgeUsecreditRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 授信申请订单号
  originalOrderNo: string;
  // 用信金额
  loanAmount: number;
  // 期数
  period: number;
  // 资产方用户唯一标识
  openId: string;
  // 订单号
  orderNo: string;
  // 还款方式:1：等额本息，2：等额本金
  repayType: string;
  // 1：手机数码 2：旅游 3：装修 4：教育 5：婚庆 6：租房 7：家具家居 8：健康医疗 9：其他消费 10：家用电器
  loanWay: string;
  // 还款日
  repayDate?: string;
  // 渠道类型
  channelType?: string;
  // 客户类型
  customType?: string;
  // 风险数据对象（json字符串）
  riskData?: string;
  // 资金源编码
  loanInstCode?: string;
  // 银行卡号
  bankCardNo?: string;
  // 影像件信息
  materials?: Material[];
  // 优惠券id
  couponId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      originalOrderNo: 'original_order_no',
      loanAmount: 'loan_amount',
      period: 'period',
      openId: 'open_id',
      orderNo: 'order_no',
      repayType: 'repay_type',
      loanWay: 'loan_way',
      repayDate: 'repay_date',
      channelType: 'channel_type',
      customType: 'custom_type',
      riskData: 'risk_data',
      loanInstCode: 'loan_inst_code',
      bankCardNo: 'bank_card_no',
      materials: 'materials',
      couponId: 'coupon_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      originalOrderNo: 'string',
      loanAmount: 'number',
      period: 'number',
      openId: 'string',
      orderNo: 'string',
      repayType: 'string',
      loanWay: 'string',
      repayDate: 'string',
      channelType: 'string',
      customType: 'string',
      riskData: 'string',
      loanInstCode: 'string',
      bankCardNo: 'string',
      materials: { 'type': 'array', 'itemType': Material },
      couponId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyDubbridgeUsecreditResponse extends $tea.Model {
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

export class QueryDubbridgeUsecreditStatusRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求网络流水号
  orderNo: string;
  // 1：现金贷（默认）
  // 2：分期付
  prodType?: string;
  // 天枢系统用信申请的订单号
  originalOrderNo?: string;
  // 购物订单号，如二轮车/摩托车订单号
  bizOrderNo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderNo: 'order_no',
      prodType: 'prod_type',
      originalOrderNo: 'original_order_no',
      bizOrderNo: 'biz_order_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderNo: 'string',
      prodType: 'string',
      originalOrderNo: 'string',
      bizOrderNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDubbridgeUsecreditStatusResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 用信状态（0-通过/1-不通过2-处理中）
  status?: string;
  // 拒绝原因
  msg?: string;
  // 借据信息
  receiptInfo?: ReceiptInfo;
  // 还款计划列表
  repayRef?: RepayRef[];
  // 用信合同编号
  disburseContractNo?: string;
  // 授信合同编号
  creditContractNo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      status: 'status',
      msg: 'msg',
      receiptInfo: 'receipt_info',
      repayRef: 'repay_ref',
      disburseContractNo: 'disburse_contract_no',
      creditContractNo: 'credit_contract_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      status: 'string',
      msg: 'string',
      receiptInfo: ReceiptInfo,
      repayRef: { 'type': 'array', 'itemType': RepayRef },
      disburseContractNo: 'string',
      creditContractNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDubbridgeReceiptStatusRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // open_id
  openId?: string;
  // 客户号
  customNo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      openId: 'open_id',
      customNo: 'custom_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      openId: 'string',
      customNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDubbridgeReceiptStatusResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否结清结构体
  data?: CustomReceiptStatus;
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
      data: CustomReceiptStatus,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDubbridgeCustomerCommonagreementsignRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单号
  orderNo: string;
  // 客户编号
  customNo: string;
  // 资金方编号
  fundCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderNo: 'order_no',
      customNo: 'custom_no',
      fundCode: 'fund_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderNo: 'string',
      customNo: 'string',
      fundCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDubbridgeCustomerCommonagreementsignResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 客户编号
  customNo?: string;
  // 客户名称
  customName?: string;
  // 流水号
  transSerials?: string;
  // 签约状态
  status?: string;
  // 签约用户唯一标识
  accountUserId?: string;
  // 脱敏的签约账号
  accountNo?: string;
  // 协议号
  protocolNo?: string;
  // 协议签约时间
  signTime?: string;
  // 协议生效时间
  validTime?: string;
  // 协议失效时间
  invalidTime?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      customNo: 'custom_no',
      customName: 'custom_name',
      transSerials: 'trans_serials',
      status: 'status',
      accountUserId: 'account_user_id',
      accountNo: 'account_no',
      protocolNo: 'protocol_no',
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
      customNo: 'string',
      customName: 'string',
      transSerials: 'string',
      status: 'string',
      accountUserId: 'string',
      accountNo: 'string',
      protocolNo: 'string',
      signTime: 'string',
      validTime: 'string',
      invalidTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateDubbridgeFileRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单号
  orderNo: string;
  // 授信申请订单号(资产方)
  originalOrderNo: string;
  // 客户编号
  customNo: string;
  // 资料文件
  materials: Material[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderNo: 'order_no',
      originalOrderNo: 'original_order_no',
      customNo: 'custom_no',
      materials: 'materials',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderNo: 'string',
      originalOrderNo: 'string',
      customNo: 'string',
      materials: { 'type': 'array', 'itemType': Material },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateDubbridgeFileResponse extends $tea.Model {
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

export class NotifyDubbridgeCallbackRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户id
  channelCode: string;
  // json参数
  bizParam: string;
  // 回调类型（1授信回调2用信回调）
  bizType: string;
  // 对应授信/用信传给三方留存单号
  seqNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      channelCode: 'channel_code',
      bizParam: 'biz_param',
      bizType: 'biz_type',
      seqNo: 'seq_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      channelCode: 'string',
      bizParam: 'string',
      bizType: 'string',
      seqNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class NotifyDubbridgeCallbackResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 	
  // 处理结果
  data?: CommonNotyfyResult;
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
      data: CommonNotyfyResult,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDubbridgeRepayResultRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单号
  orderNo: string;
  // 123
  originalOrderNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderNo: 'order_no',
      originalOrderNo: 'original_order_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderNo: 'string',
      originalOrderNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDubbridgeRepayResultResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 还款编号
  repayNo?: string;
  // 借据编号
  receiptNo?: string;
  // 客户编号
  customNo?: string;
  // 还款类型
  // 1: 全部结清，
  // 2：正常还款
  // 3：当期结清
  // 4：逾期还款
  // 
  repayType?: string;
  // 还款标志
  // 1 线下还款 
  // 2 用户主动还款
  // 3 系统代扣
  // 
  repaySign?: string;
  // 还款账户
  repayAccount?: string;
  // 还款状态
  repayStatus?: string;
  // 失败原因
  failReason?: string;
  // 还款信息列表
  repayInfos?: RepayInfos[];
  // 还款日期
  repayDate?: string;
  // 实还总额
  repayAmount?: number;
  // 实还总本金
  repayPrincipal?: number;
  // 实还总利息
  repayInterest?: number;
  // 实收总罚息
  repayPunish?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      repayNo: 'repay_no',
      receiptNo: 'receipt_no',
      customNo: 'custom_no',
      repayType: 'repay_type',
      repaySign: 'repay_sign',
      repayAccount: 'repay_account',
      repayStatus: 'repay_status',
      failReason: 'fail_reason',
      repayInfos: 'repay_infos',
      repayDate: 'repay_date',
      repayAmount: 'repay_amount',
      repayPrincipal: 'repay_principal',
      repayInterest: 'repay_interest',
      repayPunish: 'repay_punish',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      repayNo: 'string',
      receiptNo: 'string',
      customNo: 'string',
      repayType: 'string',
      repaySign: 'string',
      repayAccount: 'string',
      repayStatus: 'string',
      failReason: 'string',
      repayInfos: { 'type': 'array', 'itemType': RepayInfos },
      repayDate: 'string',
      repayAmount: 'number',
      repayPrincipal: 'number',
      repayInterest: 'number',
      repayPunish: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDubbridgeCreditPermitRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 身份证号
  cardNo?: string;
  // 手机号
  mobile: string;
  // 姓名
  customName?: string;
  // 合作方产品编号
  prodNo?: string;
  // 1:app
  // 2:H5
  channelType?: string;
  // 客户类型
  // ("1", "新增客户"),("2", "存量激活客户"),("3", "目标营销账户")
  customType?: string;
  // 导流平台
  trafficPlatform?: string;
  // 流量来源名称
  trafficSourceName?: string;
  // 广告位标志
  trafficAdId?: string;
  // 营销id
  trafficMktId?: string;
  // 点击id
  clickId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      cardNo: 'card_no',
      mobile: 'mobile',
      customName: 'custom_name',
      prodNo: 'prod_no',
      channelType: 'channel_type',
      customType: 'custom_type',
      trafficPlatform: 'traffic_platform',
      trafficSourceName: 'traffic_source_name',
      trafficAdId: 'traffic_ad_id',
      trafficMktId: 'traffic_mkt_id',
      clickId: 'click_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      cardNo: 'string',
      mobile: 'string',
      customName: 'string',
      prodNo: 'string',
      channelType: 'string',
      customType: 'string',
      trafficPlatform: 'string',
      trafficSourceName: 'string',
      trafficAdId: 'string',
      trafficMktId: 'string',
      clickId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDubbridgeCreditPermitResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // Y：准入
  // N：未准入
  enableApply?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      enableApply: 'enable_apply',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      enableApply: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDubbridgeUserUpgradestatusRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 资产方用户唯一标识
  openId?: string;
  // 天枢客户编号
  customerNo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      openId: 'open_id',
      customerNo: 'customer_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      openId: 'string',
      customerNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDubbridgeUserUpgradestatusResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 用户状态：0已升级，1未升级
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

export class QueryDubbridgeLoanUpgradestatusRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用信申请订单号(资产方)
  originalOrderNo?: string;
  // 借据编号
  receiptNo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      originalOrderNo: 'original_order_no',
      receiptNo: 'receipt_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      originalOrderNo: 'string',
      receiptNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDubbridgeLoanUpgradestatusResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 借据状态：0存量，1增量
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

export class QueryDubbridgeCustomerBankcardlistRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 客户号
  customerNo: string;
  // 资金方编号
  fundCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      customerNo: 'customer_no',
      fundCode: 'fund_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      customerNo: 'string',
      fundCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDubbridgeCustomerBankcardlistResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 用户绑定银行卡信息列表
  customerBankCardInfoList?: CustomerBankCardInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      customerBankCardInfoList: 'customer_bank_card_info_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      customerBankCardInfoList: { 'type': 'array', 'itemType': CustomerBankCardInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDubbridgeRouterUserselectRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单号
  orderNo: string;
  // 身份证号
  cardNo?: string;
  // 手机号
  mobile: string;
  // 姓名
  customName?: string;
  // 机构编码
  platformNo?: string;
  // 扩展信息JSON
  extInfo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderNo: 'order_no',
      cardNo: 'card_no',
      mobile: 'mobile',
      customName: 'custom_name',
      platformNo: 'platform_no',
      extInfo: 'ext_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderNo: 'string',
      cardNo: 'string',
      mobile: 'string',
      customName: 'string',
      platformNo: 'string',
      extInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDubbridgeRouterUserselectResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 用户分层信息
  userClassifyInfo?: UserClassifyInfo;
  // json字符串，预留扩展字段
  extInfo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      userClassifyInfo: 'user_classify_info',
      extInfo: 'ext_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      userClassifyInfo: UserClassifyInfo,
      extInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDubbridgeSettlementCertificateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单号
  orderNo: string;
  // 授信/用信申请订单号
  originalOrderNo: string;
  // 开具类型，授信：01，提现：02
  scene: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderNo: 'order_no',
      originalOrderNo: 'original_order_no',
      scene: 'scene',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderNo: 'string',
      originalOrderNo: 'string',
      scene: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDubbridgeSettlementCertificateResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 结清证明列表
  certificateInfoList?: CertificateInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      certificateInfoList: 'certificate_info_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      certificateInfoList: { 'type': 'array', 'itemType': CertificateInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDubbridgeAgreementPreviewRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 授信：apply
  // 借款：loan
  // 绑卡：bind
  bizType: string;
  // 资金方编号
  fundCode: string;
  // 客户号
  customerNo: string;
  // 借款金额
  loanAmount?: number;
  // 分期期数
  period?: number;
  // 银行编码
  bankCode?: string;
  // 还款方式
  repayType?: string;
  // 银行名称
  bankName?: string;
  // 银行卡号
  bankCardNo?: string;
  // 借据截至日期yyyy-MM-dd
  receiptEndDate?: string;
  // 借款用途
  loanWay?: string;
  // lpr
  lpr?: number;
  // LPR加点值
  lprPoint?: number;
  // LPR发布日期
  lprEffectDate?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizType: 'biz_type',
      fundCode: 'fund_code',
      customerNo: 'customer_no',
      loanAmount: 'loan_amount',
      period: 'period',
      bankCode: 'bank_code',
      repayType: 'repay_type',
      bankName: 'bank_name',
      bankCardNo: 'bank_card_no',
      receiptEndDate: 'receipt_end_date',
      loanWay: 'loan_way',
      lpr: 'lpr',
      lprPoint: 'lpr_point',
      lprEffectDate: 'lpr_effect_date',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizType: 'string',
      fundCode: 'string',
      customerNo: 'string',
      loanAmount: 'number',
      period: 'number',
      bankCode: 'string',
      repayType: 'string',
      bankName: 'string',
      bankCardNo: 'string',
      receiptEndDate: 'string',
      loanWay: 'string',
      lpr: 'number',
      lprPoint: 'number',
      lprEffectDate: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDubbridgeAgreementPreviewResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 协议列表
  agreementInfoList?: GetAgreementUrlResponseData[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      agreementInfoList: 'agreement_info_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      agreementInfoList: { 'type': 'array', 'itemType': GetAgreementUrlResponseData },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDubbridgeAccountUsecreditRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 渠道号
  channelCode: string;
  // 客户编码
  customNo?: string;
  // 资产方用户唯一标识
  openId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      channelCode: 'channel_code',
      customNo: 'custom_no',
      openId: 'open_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      channelCode: 'string',
      customNo: 'string',
      openId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDubbridgeAccountUsecreditResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 用户借款是否结清
  data?: CustomReceiptStatus;
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
      data: CustomReceiptStatus,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDubbridgeUserAggregationinfoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单号
  orderNo: string;
  // 资产方用户唯一标识
  openId?: string;
  // 客户编码
  customNo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderNo: 'order_no',
      openId: 'open_id',
      customNo: 'custom_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderNo: 'string',
      openId: 'string',
      customNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDubbridgeUserAggregationinfoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 用户聚合状态信息
  userAggregationInfo?: UserAggregationInfo;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      userAggregationInfo: 'user_aggregation_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      userAggregationInfo: UserAggregationInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDubbridgeMarketingCouponlistRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 客户号
  customerNo: string;
  // 优惠券状态
  status?: string;
  // 页码
  page?: number;
  // 每页数量
  pageSize?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      customerNo: 'customer_no',
      status: 'status',
      page: 'page',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      customerNo: 'string',
      status: 'string',
      page: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDubbridgeMarketingCouponlistResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 优惠券列表
  couponList?: CouponInfo[];
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
      couponList: { 'type': 'array', 'itemType': CouponInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDubbridgeRepaytypeInfoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 客户号
  customerNo: string;
  // 资金方编号
  fundCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      customerNo: 'customer_no',
      fundCode: 'fund_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      customerNo: 'string',
      fundCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDubbridgeRepaytypeInfoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 还款方式/借款期数集合
  repayTypeInfoList?: PlatformRepayTypeInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      repayTypeInfoList: 'repay_type_info_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      repayTypeInfoList: { 'type': 'array', 'itemType': PlatformRepayTypeInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDubbridgeInstallmentCreditamtRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单号：request请求单号，每次请求唯一，如uuid
  orderNo: string;
  // 1：现金贷、2：分期付
  prodType: string;
  // 资产方用户唯一标识
  openId: string;
  // 手机号
  mobile: string;
  // 项目编号
  projectCode: string;
  // 资产方购物订单号，如二轮车/摩托车订单号
  bizOrderNo?: string;
  // 身份证号
  cardNo?: string;
  // 交易金额，单位：元，如199.88（用于筛选额度充足的机构）
  tradeAmount?: string;
  // 客户姓名
  customerName?: string;
  // 导流平台
  trafficPlatform?: string;
  // 流量来源名称，导流平台背后具体的流量名称
  trafficSourceName?: string;
  // 广告位id，流量来源内各广告位标志
  trafficAdId?: string;
  // 营销活动编号
  trafficMktId?: string;
  // 点击id
  clickId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderNo: 'order_no',
      prodType: 'prod_type',
      openId: 'open_id',
      mobile: 'mobile',
      projectCode: 'project_code',
      bizOrderNo: 'biz_order_no',
      cardNo: 'card_no',
      tradeAmount: 'trade_amount',
      customerName: 'customer_name',
      trafficPlatform: 'traffic_platform',
      trafficSourceName: 'traffic_source_name',
      trafficAdId: 'traffic_ad_id',
      trafficMktId: 'traffic_mkt_id',
      clickId: 'click_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderNo: 'string',
      prodType: 'string',
      openId: 'string',
      mobile: 'string',
      projectCode: 'string',
      bizOrderNo: 'string',
      cardNo: 'string',
      tradeAmount: 'string',
      customerName: 'string',
      trafficPlatform: 'string',
      trafficSourceName: 'string',
      trafficAdId: 'string',
      trafficMktId: 'string',
      clickId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDubbridgeInstallmentCreditamtResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 授信申请状态：
  // 0- 通过 
  // 1- 拒绝 
  // 2- 审批中
  // 3- 失败
  // 
  applyStatus?: string;
  // 额度状态：
  // 0- 正常 
  // 1- 冻结 
  // 2- 过期
  creditStatus?: string;
  // 授信总额度，单位：元
  creditAmount?: number;
  // 可用余额
  restAmount?: number;
  // 发放日期，yyyy-MM-dd
  payDate?: string;
  // 到期日期，yyyy-MM-dd
  expireDate?: string;
  // 授信年利率。精确到小数点后四位0.1250，表示年利率为12.5%
  rateValue?: number;
  // 资金方编号
  fundCode?: string;
  // 资金方简称
  abbreFundName?: string;
  // 1：现金贷、2：分期付
  prodType?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      applyStatus: 'apply_status',
      creditStatus: 'credit_status',
      creditAmount: 'credit_amount',
      restAmount: 'rest_amount',
      payDate: 'pay_date',
      expireDate: 'expire_date',
      rateValue: 'rate_value',
      fundCode: 'fund_code',
      abbreFundName: 'abbre_fund_name',
      prodType: 'prod_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      applyStatus: 'string',
      creditStatus: 'string',
      creditAmount: 'number',
      restAmount: 'number',
      payDate: 'string',
      expireDate: 'string',
      rateValue: 'number',
      fundCode: 'string',
      abbreFundName: 'string',
      prodType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelDubbridgeInstallmentOrderRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单号：request请求单号，每次请求唯一，如uuid
  orderNo: string;
  // 1：现金贷、2：分期付
  // 
  prodType?: string;
  // 待支付的购物订单编号
  bizOrderNo: string;
  // 渠道方唯一标识
  openId?: string;
  // 天枢客户号
  customerNo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderNo: 'order_no',
      prodType: 'prod_type',
      bizOrderNo: 'biz_order_no',
      openId: 'open_id',
      customerNo: 'customer_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderNo: 'string',
      prodType: 'string',
      bizOrderNo: 'string',
      openId: 'string',
      customerNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelDubbridgeInstallmentOrderResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 订单取消请求接受结果：
  // Y: 成功; N: 失败
  cancelResult?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      cancelResult: 'cancel_result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      cancelResult: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushDubbridgeInstallmentSupplementRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单号：request请求单号，每次请求唯一，如uuid
  orderNo: string;
  // 资产方用户唯一标识
  openId: string;
  // 资产方购物订单号，如二轮车/摩托车订单号
  bizOrderNo: string;
  // 业务类型：1-现金贷；2-分期付
  // 
  prodType?: string;
  // 材料场景：2-支用前、3-支用后
  fileScene?: string;
  // 材料列表
  fileList?: SupplementFile[];
  // 门店信息
  storeInfo?: StoreInfo;
  // 订单车辆信息
  vehicleInfo?: VehicleInfo;
  // 补充信息
  additional?: Additional;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderNo: 'order_no',
      openId: 'open_id',
      bizOrderNo: 'biz_order_no',
      prodType: 'prod_type',
      fileScene: 'file_scene',
      fileList: 'file_list',
      storeInfo: 'store_info',
      vehicleInfo: 'vehicle_info',
      additional: 'additional',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderNo: 'string',
      openId: 'string',
      bizOrderNo: 'string',
      prodType: 'string',
      fileScene: 'string',
      fileList: { 'type': 'array', 'itemType': SupplementFile },
      storeInfo: StoreInfo,
      vehicleInfo: VehicleInfo,
      additional: Additional,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushDubbridgeInstallmentSupplementResponse extends $tea.Model {
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

export class QueryDubbridgeInstallmentTrialRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单号
  orderNo: string;
  // 业务类型，1：现金贷；2：分期付
  prodType: string;
  // 资产方购物订单号
  bizOrderNo: string;
  // 天枢客户号
  customerNo?: string;
  // 资产方用户唯一标识
  openId: string;
  // 资金方编码
  fundCode: string;
  // 订单交易金额
  tradeAmount: string;
  // 优惠券id
  couponId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderNo: 'order_no',
      prodType: 'prod_type',
      bizOrderNo: 'biz_order_no',
      customerNo: 'customer_no',
      openId: 'open_id',
      fundCode: 'fund_code',
      tradeAmount: 'trade_amount',
      couponId: 'coupon_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderNo: 'string',
      prodType: 'string',
      bizOrderNo: 'string',
      customerNo: 'string',
      openId: 'string',
      fundCode: 'string',
      tradeAmount: 'string',
      couponId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDubbridgeInstallmentTrialResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 授信额度
  creditAmount?: string;
  // 可用额度
  restAmount?: string;
  // 期数费用列表
  installmentList?: InstallmentTrial[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      creditAmount: 'credit_amount',
      restAmount: 'rest_amount',
      installmentList: 'installment_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      creditAmount: 'string',
      restAmount: 'string',
      installmentList: { 'type': 'array', 'itemType': InstallmentTrial },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class VerifyFinserviceZhimaIdentifyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 需要校验的人姓名
  legalPersonCertName: string;
  // 需要校验的人身份证号
  legalPersonCertNo: string;
  // 认证结束后的商户回调地址。
  merchantUrl: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      legalPersonCertName: 'legal_person_cert_name',
      legalPersonCertNo: 'legal_person_cert_no',
      merchantUrl: 'merchant_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      legalPersonCertName: 'string',
      legalPersonCertNo: 'string',
      merchantUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class VerifyFinserviceZhimaIdentifyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 本次认证的唯一标识，商户需要记录，后续的操作都需要用到。
  data?: ZhimaIdentifyResp;
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
      data: ZhimaIdentifyResp,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryFinserviceZhimaIdentifyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 初始化时候返回的唯一标识
  bizNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizNo: 'biz_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryFinserviceZhimaIdentifyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  //  
  data?: ZhimaQueryResp;
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
      data: ZhimaQueryResp,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMdipDataserviceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 服务编码
  serviceCode: string;
  // 服务参数
  serviceParam: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      serviceCode: 'service_code',
      serviceParam: 'service_param',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      serviceCode: 'string',
      serviceParam: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMdipDataserviceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 多源查询结果值
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

export class ReceiveMdipParamsFileRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // file_id
  fileObject?: Readable;
  fileObjectName?: string;
  fileId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      fileObject: 'fileObject',
      fileObjectName: 'fileObjectName',
      fileId: 'file_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      fileObject: 'Readable',
      fileObjectName: 'string',
      fileId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ReceiveMdipParamsFileResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 文件上传结果
  content?: RuntimeResult;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      content: 'content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      content: RuntimeResult,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ReceiveMdipParamsRbbfileRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // file_id
  fileObject?: Readable;
  fileObjectName?: string;
  fileId: string;
  // 文件名
  fileName: string;
  // 租户code
  tenantCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      fileObject: 'fileObject',
      fileObjectName: 'fileObjectName',
      fileId: 'file_id',
      fileName: 'file_name',
      tenantCode: 'tenant_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      fileObject: 'Readable',
      fileObjectName: 'string',
      fileId: 'string',
      fileName: 'string',
      tenantCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ReceiveMdipParamsRbbfileResponse extends $tea.Model {
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

export class CallbackMdipAuditRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 审批结果
  auditResult: string;
  // 工单流水号
  bizCode: string;
  // 额外信息
  extend?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      auditResult: 'audit_result',
      bizCode: 'biz_code',
      extend: 'extend',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      auditResult: 'string',
      bizCode: 'string',
      extend: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CallbackMdipAuditResponse extends $tea.Model {
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

export class QueryMdipDataservicePocRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 服务编码
  // 
  serviceCode: string;
  // 服务参数
  serviceParam: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      serviceCode: 'service_code',
      serviceParam: 'service_param',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      serviceCode: 'string',
      serviceParam: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMdipDataservicePocResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 	
  // 多源查询结果值
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

export class ListMdipDefaultSupplierRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // ANTCLOUD
  defaultTenant?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      defaultTenant: 'default_tenant',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      defaultTenant: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListMdipDefaultSupplierResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 供应商列表
  supplierList?: Supplier[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      supplierList: 'supplier_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      supplierList: { 'type': 'array', 'itemType': Supplier },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CallbackMdipYunfengdieParamsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 回调参数
  paramsMap: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      paramsMap: 'params_map',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      paramsMap: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CallbackMdipYunfengdieParamsResponse extends $tea.Model {
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

export class ApplyQmpRtBatchmarketingRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 场景策略id
  sceneStrategyId: number;
  // 外部流水号
  outSerialNo: string;
  // 用户标识类型
  paramType: string;
  // 批量透传字段
  outInfo?: string;
  // 用户凭证列表
  customerDetails: CustomerDetail[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      sceneStrategyId: 'scene_strategy_id',
      outSerialNo: 'out_serial_no',
      paramType: 'param_type',
      outInfo: 'out_info',
      customerDetails: 'customer_details',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      sceneStrategyId: 'number',
      outSerialNo: 'string',
      paramType: 'string',
      outInfo: 'string',
      customerDetails: { 'type': 'array', 'itemType': CustomerDetail },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyQmpRtBatchmarketingResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 批次流水号
  bizId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      bizId: 'biz_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      bizId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SendQmpTextsmsBatchRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // cpassAccessKey
  cpassAk?: string;
  // 行业标签
  industryTag: string;
  // 手机号json
  phoneNumberJson: string;
  // 签名信息
  signNameJson: string;
  // 文本短信模板code
  templateCode: string;
  // 文本短信模板参数
  templateParamJson: string;
  // 上行短信扩展码
  smsUpExtendCodeJson?: string;
  // 透传字段
  outId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      cpassAk: 'cpass_ak',
      industryTag: 'industry_tag',
      phoneNumberJson: 'phone_number_json',
      signNameJson: 'sign_name_json',
      templateCode: 'template_code',
      templateParamJson: 'template_param_json',
      smsUpExtendCodeJson: 'sms_up_extend_code_json',
      outId: 'out_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      cpassAk: 'string',
      industryTag: 'string',
      phoneNumberJson: 'string',
      signNameJson: 'string',
      templateCode: 'string',
      templateParamJson: 'string',
      smsUpExtendCodeJson: 'string',
      outId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SendQmpTextsmsBatchResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 回执id
  bizId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      bizId: 'biz_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      bizId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyQmpRobotcallRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 外部流水号
  outSerialNo: string;
  // 场景策略id
  sceneStrategyId: number;
  // 客户透传字段
  outInfo?: string;
  // 用户参数类型
  paramTemplate: string;
  // 每个手机号的详细参数
  customerDetails?: RobotCallCustomerParam[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      outSerialNo: 'out_serial_no',
      sceneStrategyId: 'scene_strategy_id',
      outInfo: 'out_info',
      paramTemplate: 'param_template',
      customerDetails: 'customer_details',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      outSerialNo: 'string',
      sceneStrategyId: 'number',
      outInfo: 'string',
      paramTemplate: 'string',
      customerDetails: { 'type': 'array', 'itemType': RobotCallCustomerParam },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyQmpRobotcallResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 呼叫记录id
  callId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      callId: 'call_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      callId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SendQmpCardsmsBatchRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // cpassAccessKey
  cpassAk?: string;
  // 行业标签
  industryTag: string;
  // 卡片短信模板
  cardTemplateCode: string;
  // 卡片短信模板参数json
  cardTemplateParamJson: string;
  // 手机号json
  phoneNumberJson: string;
  // ["蚂蚁营销"]
  signNameJson: string;
  // 上行短信扩展码
  smsUpExtendCodeJson?: string;
  // 回落类型
  fallbackType?: string;
  // 回落短信模版
  fallbackTemplateCode?: string;
  // 回落短信模版参数
  fallbackTemplateParamJson?: string;
  // 卡片短信对应的原始文本短信模板，不传则用默认文本
  templateCode: string;
  // 默认文本对应参数
  templateParamJson: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      cpassAk: 'cpass_ak',
      industryTag: 'industry_tag',
      cardTemplateCode: 'card_template_code',
      cardTemplateParamJson: 'card_template_param_json',
      phoneNumberJson: 'phone_number_json',
      signNameJson: 'sign_name_json',
      smsUpExtendCodeJson: 'sms_up_extend_code_json',
      fallbackType: 'fallback_type',
      fallbackTemplateCode: 'fallback_template_code',
      fallbackTemplateParamJson: 'fallback_template_param_json',
      templateCode: 'template_code',
      templateParamJson: 'template_param_json',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      cpassAk: 'string',
      industryTag: 'string',
      cardTemplateCode: 'string',
      cardTemplateParamJson: 'string',
      phoneNumberJson: 'string',
      signNameJson: 'string',
      smsUpExtendCodeJson: 'string',
      fallbackType: 'string',
      fallbackTemplateCode: 'string',
      fallbackTemplateParamJson: 'string',
      templateCode: 'string',
      templateParamJson: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SendQmpCardsmsBatchResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 卡片短信回执id
  bizCardId?: string;
  // 支持的手机号
  mediaMobiles?: string;
  // 不支持的手机号
  notMediaMobiles?: string;
  // 回落文本短信回执id
  bizId?: string;
  // 回落数字短信回执id
  bizDigitalId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      bizCardId: 'biz_card_id',
      mediaMobiles: 'media_mobiles',
      notMediaMobiles: 'not_media_mobiles',
      bizId: 'biz_id',
      bizDigitalId: 'biz_digital_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      bizCardId: 'string',
      mediaMobiles: 'string',
      notMediaMobiles: 'string',
      bizId: 'string',
      bizDigitalId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CallbackQmpSmsUpRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 回执类型
  type: string;
  // 手机号码
  phoneNumber: string;
  // 发送时间
  sendTime: string;
  // 发送内容
  content: string;
  // 签名信息
  signName: string;
  // 签名对应的客户ak
  appKey: string;
  // 行短信扩展号码
  destCode: string;
  // 序列号
  sequenceId: number;
  // 手机号模版类型
  // 
  keyTemplate?: string;
  // 原始手机号模版类型
  originKeyTemplate?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      type: 'type',
      phoneNumber: 'phone_number',
      sendTime: 'send_time',
      content: 'content',
      signName: 'sign_name',
      appKey: 'app_key',
      destCode: 'dest_code',
      sequenceId: 'sequence_id',
      keyTemplate: 'key_template',
      originKeyTemplate: 'origin_key_template',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      type: 'string',
      phoneNumber: 'string',
      sendTime: 'string',
      content: 'string',
      signName: 'string',
      appKey: 'string',
      destCode: 'string',
      sequenceId: 'number',
      keyTemplate: 'string',
      originKeyTemplate: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CallbackQmpSmsUpResponse extends $tea.Model {
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

export class CallbackQmpSmsReportRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 短信回执类型
  type: string;
  // 手机号码
  phoneNumber: string;
  // 发送时间
  sendTime: string;
  // 状态报告时间
  reportTime: string;
  // 是否接收成功。取值：true：接收成功false：接收失败
  success: boolean;
  // 状态报告编码
  errCode: string;
  // 状态报告说明
  errMsg: string;
  // 短信长度
  smsSize: string;
  // 发送回执ID，即发送流水号
  bizId: string;
  // 业务扩展字段，回执时透传，JSON格式
  bizProperties: string;
  // 发送卡片短信时，文本短信状态报告中才会有该字段，且取值为CARD_SMS，发送纯文本短信时，状态报告中没有该字段
  smsType?: string;
  // 运营商
  serviceProvider: string;
  // 手机号码所属城市
  city?: string;
  // 手机号模版类型
  keyTemplate?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      type: 'type',
      phoneNumber: 'phone_number',
      sendTime: 'send_time',
      reportTime: 'report_time',
      success: 'success',
      errCode: 'err_code',
      errMsg: 'err_msg',
      smsSize: 'sms_size',
      bizId: 'biz_id',
      bizProperties: 'biz_properties',
      smsType: 'sms_type',
      serviceProvider: 'service_provider',
      city: 'city',
      keyTemplate: 'key_template',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      type: 'string',
      phoneNumber: 'string',
      sendTime: 'string',
      reportTime: 'string',
      success: 'boolean',
      errCode: 'string',
      errMsg: 'string',
      smsSize: 'string',
      bizId: 'string',
      bizProperties: 'string',
      smsType: 'string',
      serviceProvider: 'string',
      city: 'string',
      keyTemplate: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CallbackQmpSmsReportResponse extends $tea.Model {
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

export class SendQmpDigitalsmsBatchRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // cpassAccessKey
  cpassAk?: string;
  // 行业标签
  industryTag: string;
  // 手机号列表以,分隔
  phoneNumbers: string;
  // 数字短信模板code
  templateCode: string;
  // 短信模板参数
  templateParam: string;
  // 透传字段
  outId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      cpassAk: 'cpass_ak',
      industryTag: 'industry_tag',
      phoneNumbers: 'phone_numbers',
      templateCode: 'template_code',
      templateParam: 'template_param',
      outId: 'out_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      cpassAk: 'string',
      industryTag: 'string',
      phoneNumbers: 'string',
      templateCode: 'string',
      templateParam: 'string',
      outId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SendQmpDigitalsmsBatchResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 回执id
  bizId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      bizId: 'biz_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      bizId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CallbackQmpRobotcallRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 外呼号码，支持密文
  customerKey: string;
  // 当前呼叫次数 Integer
  currentCallTimes: number;
  // 号码的模版类型
  keyTemplate: string;
  // 导入号码时返回的批次号
  batchId: string;
  // 外呼类型 建议按照如下约定给到 2001:批量-预测外呼 2002:批量-AI外呼-不转人工 2003:批量-AI外呼-接通转人工 2004: 批量-AI外呼-智能转人工 2005:批量-语音通知
  callType: number;
  // 用户自定义标签
  tag?: string;
  // 外呼呼叫实例id
  callId: string;
  // 外呼任务编号
  taskId: number;
  // 外呼任务名称
  taskName: string;
  // 外呼的话术模板ID，可以为空
  templateId?: number;
  // 外呼状态编码
  statusCode: number;
  // 外呼状态编码对应描述
  statusDescription: string;
  // 转人工状态编码
  transferStatusCode: string;
  // 转人工状态编码对应描述
  transferStatus: string;
  // 分配坐席ID,可以为空
  agentId?: number;
  // 建议填写坐席在贵司业务系统唯一标识，用于查询对应agentId；可以为空。
  agentTag?: string;
  // 坐席分机号，可以为空
  agentExtension?: string;
  // 导入时间，格式:2019-01-09 14:14:19
  importTime: string;
  // 开始通话时间，格式：2019-01-09 14:14:19
  callBeginTime: string;
  // 振铃时长,单位毫秒
  ringTime: number;
  // 接通时间
  answerTime?: string;
  // 通话时长，单位：大于1分钟，显示分钟秒，小于1分钟，显示秒
  speakingTime: string;
  // 通话时长，单位：秒
  speakingDuration: number;
  // 通话挂断时间
  hangupTime: string;
  // 对话轮次
  speakingTurns: number;
  // 坐席通话时长，单位：大于1分钟，显示分钟秒，小于1分钟，显示秒
  agentSpeakingTime: string;
  // 坐席通话时长，单位：秒
  agentSpeakingDuration: number;
  // 意向标签
  intentTag: string;
  // 意向说明
  intentDescription: string;
  // 个性标签
  individualTag?: string;
  // 回复关键词
  keywords?: string;
  // 挂机方式
  hungupType: number;
  // 挂机短信，1:发送，2:不发送
  sms: number;
  // 对话录音,url
  chatRecord?: string;
  // 对话记录
  chats?: string;
  // 0:不添加，1:添加
  addWx?: number;
  // 加微进度可选值：已申请、加微成功
  addWxStatus?: string;
  // 是否接通重呼 0正常外呼，1接通重呼
  answerRecall: number;
  // 导入号码时的参数值
  properties?: string;
  // 导入号码时的业务参数值
  bizProperties?: string;
  // 拦截原因 可选值：黑名单拦截，灰名单拦截，异常号码拦截
  interceptReason?: string;
  // 回调冗余字段
  extInfo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      customerKey: 'customer_key',
      currentCallTimes: 'current_call_times',
      keyTemplate: 'key_template',
      batchId: 'batch_id',
      callType: 'call_type',
      tag: 'tag',
      callId: 'call_id',
      taskId: 'task_id',
      taskName: 'task_name',
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
      extInfo: 'ext_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      customerKey: 'string',
      currentCallTimes: 'number',
      keyTemplate: 'string',
      batchId: 'string',
      callType: 'number',
      tag: 'string',
      callId: 'string',
      taskId: 'number',
      taskName: 'string',
      templateId: 'number',
      statusCode: 'number',
      statusDescription: 'string',
      transferStatusCode: 'string',
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
      sms: 'number',
      chatRecord: 'string',
      chats: 'string',
      addWx: 'number',
      addWxStatus: 'string',
      answerRecall: 'number',
      properties: 'string',
      bizProperties: 'string',
      interceptReason: 'string',
      extInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CallbackQmpRobotcallResponse extends $tea.Model {
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

export class QueryQmpRobotcallDetailRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 批次号
  bizId: string;
  // 手机号
  phoneNumber: string;
  // 手机号类型
  templateType: string;
  // 场景策略id
  sceneStrategyId: number;
  // 分流字段，行业标签区分哈啰流量归属于umkt或qmp
  industryTag?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizId: 'biz_id',
      phoneNumber: 'phone_number',
      templateType: 'template_type',
      sceneStrategyId: 'scene_strategy_id',
      industryTag: 'industry_tag',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizId: 'string',
      phoneNumber: 'string',
      templateType: 'string',
      sceneStrategyId: 'number',
      industryTag: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryQmpRobotcallDetailResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 请求时的透传字段
  outInfo?: string;
  // 请求时每个手机号的透传字段
  customerOutInfo?: string;
  // 外呼记录列表
  callInfo?: AICallbackMessage[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      outInfo: 'out_info',
      customerOutInfo: 'customer_out_info',
      callInfo: 'call_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      outInfo: 'string',
      customerOutInfo: 'string',
      callInfo: { 'type': 'array', 'itemType': AICallbackMessage },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryQmpDataaccessStatisticRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 查询回执统计的任务id
  taskId: number;
  // 分流字段，行业标签区分哈啰流量归属于umkt或qmp
  industryTag?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      taskId: 'task_id',
      industryTag: 'industry_tag',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      taskId: 'number',
      industryTag: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryQmpDataaccessStatisticResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 回执统计结果
  statisticResult?: StatisticResult;
  // 任务状态
  taskStatus?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      statisticResult: 'statistic_result',
      taskStatus: 'task_status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      statisticResult: StatisticResult,
      taskStatus: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryQmpRobotcallStatisticinfoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 场景策略id
  sceneStrategyId: number;
  // 客户透传字段
  outInfo: string;
  // 分流字段，行业标签区分哈啰流量归属于umkt或qmp
  industryTag?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      sceneStrategyId: 'scene_strategy_id',
      outInfo: 'out_info',
      industryTag: 'industry_tag',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      sceneStrategyId: 'number',
      outInfo: 'string',
      industryTag: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryQmpRobotcallStatisticinfoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 全量手机号数量
  totalCount?: number;
  // 累计拨打次数
  callCount?: number;
  // 已经拨打的手机号数量
  calleeCount?: number;
  // 已拨打次数中接通的数量
  connectCount?: number;
  // 拨打率
  callRate?: string;
  // 接通率
  connectRate?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      totalCount: 'total_count',
      callCount: 'call_count',
      calleeCount: 'callee_count',
      connectCount: 'connect_count',
      callRate: 'call_rate',
      connectRate: 'connect_rate',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      totalCount: 'number',
      callCount: 'number',
      calleeCount: 'number',
      connectCount: 'number',
      callRate: 'string',
      connectRate: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchqueryQmpTaskDetailRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 上传外呼任务返回的callId
  bizId: string;
  // 手机号列表
  customerKeys: string[];
  // 手机号类型
  keyTemplate: string;
  // 场景策略id
  sceneStrategyId: number;
  // 开始外呼时间，只可查询最近30天的日期
  callDate?: string;
  // 结束外呼时间
  endCallDate?: string;
  // 分流字段，行业标签区分哈啰流量归属于umkt或qmp
  industryTag?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizId: 'biz_id',
      customerKeys: 'customer_keys',
      keyTemplate: 'key_template',
      sceneStrategyId: 'scene_strategy_id',
      callDate: 'call_date',
      endCallDate: 'end_call_date',
      industryTag: 'industry_tag',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizId: 'string',
      customerKeys: { 'type': 'array', 'itemType': 'string' },
      keyTemplate: 'string',
      sceneStrategyId: 'number',
      callDate: 'string',
      endCallDate: 'string',
      industryTag: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchqueryQmpTaskDetailResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 客户请求时的透传字段
  outInfo?: string;
  // 外呼记录列表
  callInfo?: CommonRobotCallDetail[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      outInfo: 'out_info',
      callInfo: 'call_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      outInfo: 'string',
      callInfo: { 'type': 'array', 'itemType': CommonRobotCallDetail },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryQmpCardsmsSupportRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // cpassAccessKey
  cpassAk?: string;
  // 行业标签
  industryTag: string;
  // 卡片短信模板
  templateCode: string;
  // 手机号
  mobiles: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      cpassAk: 'cpass_ak',
      industryTag: 'industry_tag',
      templateCode: 'template_code',
      mobiles: 'mobiles',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      cpassAk: 'string',
      industryTag: 'string',
      templateCode: 'string',
      mobiles: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryQmpCardsmsSupportResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 手机号卡片短信支持信息
  datas?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      datas: 'datas',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      datas: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchqueryQmpActionplanDetailRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 场景策略id
  sceneStrategyId: number[];
  // 分流字段，行业标签区分哈啰流量归属于umkt或qmp
  industryTag?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      sceneStrategyId: 'scene_strategy_id',
      industryTag: 'industry_tag',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      sceneStrategyId: { 'type': 'array', 'itemType': 'number' },
      industryTag: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchqueryQmpActionplanDetailResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 触达策略详细信息
  actionPlanDetailInfo?: ActionPlanDetailInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      actionPlanDetailInfo: 'action_plan_detail_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      actionPlanDetailInfo: { 'type': 'array', 'itemType': ActionPlanDetailInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyQmpPhonenumberstatusforsmsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 12345
  customerKey: string;
  // 用户模版类型
  paramTemplate: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      customerKey: 'customer_key',
      paramTemplate: 'param_template',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      customerKey: 'string',
      paramTemplate: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyQmpPhonenumberstatusforsmsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 12345
  customerKey?: string;
  // 用户凭证状态
  status?: string;
  // 号码当前归属的基础运营商
  carrier?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      customerKey: 'customer_key',
      status: 'status',
      carrier: 'carrier',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      customerKey: 'string',
      status: 'string',
      carrier: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchqueryQmpTenantActionplaninfoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 渠道类型
  contentType: string;
  // 页码
  pageNum: number;
  // 页数
  pageSize: number;
  // 分流字段，行业标签区分哈啰流量归属于umkt或qmp
  industryTag?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      contentType: 'content_type',
      pageNum: 'page_num',
      pageSize: 'page_size',
      industryTag: 'industry_tag',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      contentType: 'string',
      pageNum: 'number',
      pageSize: 'number',
      industryTag: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchqueryQmpTenantActionplaninfoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 触达策略信息
  queryResult?: ActionPlanDetailInfo[];
  // 总数
  totalCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      queryResult: 'query_result',
      totalCount: 'total_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      queryResult: { 'type': 'array', 'itemType': ActionPlanDetailInfo },
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryQmpTenantActionplaninfoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 页码
  pageNum?: number;
  // 页容量
  pageSize?: number;
  // 渠道code
  channelType: string;
  // 分流字段，行业标签区分哈啰流量归属于umkt或qmp
  industryTag?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      pageNum: 'page_num',
      pageSize: 'page_size',
      channelType: 'channel_type',
      industryTag: 'industry_tag',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      pageNum: 'number',
      pageSize: 'number',
      channelType: 'string',
      industryTag: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryQmpTenantActionplaninfoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 租户策略信息列表
  queryResult?: TenantActionPlanInfo[];
  // 页码
  pageNum?: number;
  // 页容量
  pageSize?: number;
  // 总量
  totalCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      queryResult: 'query_result',
      pageNum: 'page_num',
      pageSize: 'page_size',
      totalCount: 'total_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      queryResult: { 'type': 'array', 'itemType': TenantActionPlanInfo },
      pageNum: 'number',
      pageSize: 'number',
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryQmpCpaassmsTemplateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 短信类型
  smsType: string;
  // 行业标签
  tenantIndustry: string;
  // 审批状态
  status?: string;
  // 页码
  pageNum?: number;
  // 每页记录数量
  pageSize?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      smsType: 'sms_type',
      tenantIndustry: 'tenant_industry',
      status: 'status',
      pageNum: 'page_num',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      smsType: 'string',
      tenantIndustry: 'string',
      status: 'string',
      pageNum: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryQmpCpaassmsTemplateResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 总数
  total?: number;
  // 每页记录数
  pageSize?: number;
  // 页码
  pageNum?: number;
  // 模板列表
  cpassSmsTemplates?: CpaasSmsTemplate[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      total: 'total',
      pageSize: 'page_size',
      pageNum: 'page_num',
      cpassSmsTemplates: 'cpass_sms_templates',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      total: 'number',
      pageSize: 'number',
      pageNum: 'number',
      cpassSmsTemplates: { 'type': 'array', 'itemType': CpaasSmsTemplate },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryQmpTextsmsTemplateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 短信类型
  smsType: string;
  // 行业标签
  tenantIndustry: string;
  // 页码
  pageNum?: number;
  // 每页记录数量
  pageSize?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      smsType: 'sms_type',
      tenantIndustry: 'tenant_industry',
      pageNum: 'page_num',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      smsType: 'string',
      tenantIndustry: 'string',
      pageNum: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryQmpTextsmsTemplateResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 总数
  total?: number;
  // 页码
  pageNum?: number;
  // 每页记录数
  pageSize?: number;
  // 扩展参数
  extInfo?: string;
  // 模板列表
  smsTemplates?: SmsTemplate[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      total: 'total',
      pageNum: 'page_num',
      pageSize: 'page_size',
      extInfo: 'ext_info',
      smsTemplates: 'sms_templates',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      total: 'number',
      pageNum: 'number',
      pageSize: 'number',
      extInfo: 'string',
      smsTemplates: { 'type': 'array', 'itemType': SmsTemplate },
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

export class PushQmpBackflowJsondataRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 回流事件id，对应租户回流事件id
  eventId: number;
  // 回流事件记录列表
  eventRecords: string;
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
      eventRecords: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushQmpBackflowJsondataResponse extends $tea.Model {
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

export class BatchqueryQmpRtMixedmarketingRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 圈客计划code列表
  planCodes: string[];
  // 计划集合code，对标圈客计划code列表，一般不可变
  planSetCode?: string;
  // 查询协议模版
  queryTemplate: string;
  // 客群凭证和其他信息
  customerDetails: CustomerInfo[];
  // 客群共用参数
  publicProperties?: string;
  // 外部业务流水号
  bizSerialNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      planCodes: 'plan_codes',
      planSetCode: 'plan_set_code',
      queryTemplate: 'query_template',
      customerDetails: 'customer_details',
      publicProperties: 'public_properties',
      bizSerialNo: 'biz_serial_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      planCodes: { 'type': 'array', 'itemType': 'string' },
      planSetCode: 'string',
      queryTemplate: 'string',
      customerDetails: { 'type': 'array', 'itemType': CustomerInfo },
      publicProperties: 'string',
      bizSerialNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchqueryQmpRtMixedmarketingResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 查询结果
  queryResults?: CustomerRpspInfosModel[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      queryResults: 'query_results',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      queryResults: { 'type': 'array', 'itemType': CustomerRpspInfosModel },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadQmpOfflinehostplanRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 文件上传后的fileId
  fileObject?: Readable;
  fileObjectName?: string;
  fileId: string;
  // MOBILE/MOBILE_MD5/OAID/IDFA/IMEI/CAID选择其中一种
  fileTemplate: string;
  // plancode，托管计划编码
  planCode: string;
  // properties的header,其他的为ext_info,
  properties?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      fileObject: 'fileObject',
      fileObjectName: 'fileObjectName',
      fileId: 'file_id',
      fileTemplate: 'file_template',
      planCode: 'plan_code',
      properties: 'properties',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      fileObject: 'Readable',
      fileObjectName: 'string',
      fileId: 'string',
      fileTemplate: 'string',
      planCode: 'string',
      properties: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadQmpOfflinehostplanResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 导入id，可以用该id来查询分层结果
  importId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      importId: 'import_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      importId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryQmpOfflinehostplanDecisionresultRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 文件上传时返回的导入id
  importId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      importId: 'import_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      importId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryQmpOfflinehostplanDecisionresultResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 安全托管计划编码
  planCode?: string;
  // EXECUTING/DECISI ON_SUCCESS/DECISION_FAIL/CANCEL。执行中/成功/失败/取消。
  status?: string;
  // 总托管数量
  totalNum?: number;
  // 分层结果数
  decisionNum?: number;
  // 分层结果的oss文件路径
  fileUrl?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      planCode: 'plan_code',
      status: 'status',
      totalNum: 'total_num',
      decisionNum: 'decision_num',
      fileUrl: 'file_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      planCode: 'string',
      status: 'string',
      totalNum: 'number',
      decisionNum: 'number',
      fileUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncRdaasTaxAuthinfoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 应用id
  appId: string;
  // 授权类型
  authType: string;
  // 税号
  nsrsbh: string;
  // 应用key
  appKey?: string;
  // 授权状态：Y-有效，N-无效
  authStatus?: string;
  // 省份编码
  proCode?: string;
  // 城市编码
  cityCode?: string;
  // 授权回调地址
  authCallbackUrl?: string;
  // 过期时间，格式: yyyy-MM-dd HH:mm:ss
  expireDate?: string;
  // 最近一次授权成功的订单号
  orderNo?: string;
  // 授权场景
  authScene?: string;
  // 授权成功时间,格式：yyyy-MM-dd HH:mm:ss
  authStartTime?: string;
  // 授权创建时间,格式: yyyy-MM-dd HH:mm:ss
  authCreateTime?: string;
  // 企业名称
  corpName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      appId: 'app_id',
      authType: 'auth_type',
      nsrsbh: 'nsrsbh',
      appKey: 'app_key',
      authStatus: 'auth_status',
      proCode: 'pro_code',
      cityCode: 'city_code',
      authCallbackUrl: 'auth_callback_url',
      expireDate: 'expire_date',
      orderNo: 'order_no',
      authScene: 'auth_scene',
      authStartTime: 'auth_start_time',
      authCreateTime: 'auth_create_time',
      corpName: 'corp_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      appId: 'string',
      authType: 'string',
      nsrsbh: 'string',
      appKey: 'string',
      authStatus: 'string',
      proCode: 'string',
      cityCode: 'string',
      authCallbackUrl: 'string',
      expireDate: 'string',
      orderNo: 'string',
      authScene: 'string',
      authStartTime: 'string',
      authCreateTime: 'string',
      corpName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncRdaasTaxAuthinfoResponse extends $tea.Model {
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

export class SyncRdaasTaxAuthorderRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户号
  instCode: string;
  // 授权类型
  authType: string;
  // 税号
  identityId?: string;
  // 授权因子
  factorValue?: string;
  // 第二授权因子
  secondFactorValue?: string;
  // 授权订单号
  orderNo: string;
  // 内容
  content?: string;
  // 过期时间
  expireTime?: string;
  // 授权场景
  authScene?: string;
  // 授权状态
  authStatus?: string;
  // 授权成功时间,格式：yyyy-MM-dd HH:mm:ss
  authStartTime?: string;
  // 授权创建时间,格式: yyyy-MM-dd HH:mm:ss
  authCreateTime?: string;
  // 名称
  identityName?: string;
  // 企业实际所属税局地区编码
  taxZoneCode?: string;
  // 失败原因
  failReason?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      instCode: 'inst_code',
      authType: 'auth_type',
      identityId: 'identity_id',
      factorValue: 'factor_value',
      secondFactorValue: 'second_factor_value',
      orderNo: 'order_no',
      content: 'content',
      expireTime: 'expire_time',
      authScene: 'auth_scene',
      authStatus: 'auth_status',
      authStartTime: 'auth_start_time',
      authCreateTime: 'auth_create_time',
      identityName: 'identity_name',
      taxZoneCode: 'tax_zone_code',
      failReason: 'fail_reason',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      instCode: 'string',
      authType: 'string',
      identityId: 'string',
      factorValue: 'string',
      secondFactorValue: 'string',
      orderNo: 'string',
      content: 'string',
      expireTime: 'string',
      authScene: 'string',
      authStatus: 'string',
      authStartTime: 'string',
      authCreateTime: 'string',
      identityName: 'string',
      taxZoneCode: 'string',
      failReason: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncRdaasTaxAuthorderResponse extends $tea.Model {
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

export class NotifyRdaasTaxCallbackRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 通知场景
  notifyScene: string;
  // 租户号
  instCode: string;
  // 解决方案id
  solutionId?: string;
  // 通知回调地址
  callbackUrl?: string;
  // 业务参数
  jsonBizParams?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      notifyScene: 'notify_scene',
      instCode: 'inst_code',
      solutionId: 'solution_id',
      callbackUrl: 'callback_url',
      jsonBizParams: 'json_biz_params',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      notifyScene: 'string',
      instCode: 'string',
      solutionId: 'string',
      callbackUrl: 'string',
      jsonBizParams: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class NotifyRdaasTaxCallbackResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 通知是否成功
  data?: boolean;
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
      data: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRdaasTaxRpadecisionserviceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 决策服务
  serviceName: string;
  // 决策租户
  decisionTenant: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      serviceName: 'service_name',
      decisionTenant: 'decision_tenant',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      serviceName: 'string',
      decisionTenant: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRdaasTaxRpadecisionserviceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 决策服务列表
  data?: RdaasTaxDecsionService[];
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
      data: { 'type': 'array', 'itemType': RdaasTaxDecsionService },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRdaasTaxRpadecisionindicatorRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 决策服务id
  serviceId: string;
  // 决策属性名称，目前一种属性: 比重-weight
  propertyName?: string;
  // 决策租户
  decisionTenant?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      serviceId: 'service_id',
      propertyName: 'property_name',
      decisionTenant: 'decision_tenant',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      serviceId: 'string',
      propertyName: 'string',
      decisionTenant: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRdaasTaxRpadecisionindicatorResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 决策指标
  data?: RdaasTaxDecsionServiceIndicator[];
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
      data: { 'type': 'array', 'itemType': RdaasTaxDecsionServiceIndicator },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRdaasTaxSimpleauthdecisionRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 决策租户
  decisionTenant: string;
  // 授权类型
  authType: string;
  // 省份
  provinceCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      decisionTenant: 'decision_tenant',
      authType: 'auth_type',
      provinceCode: 'province_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      decisionTenant: 'string',
      authType: 'string',
      provinceCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRdaasTaxSimpleauthdecisionResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // json决策结果
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

export class ReceiveRfcParamsFileRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 文件ID	
  // 
  fileObject?: Readable;
  fileObjectName?: string;
  fileId: string;
  // 参数，jsonString
  params: string;
  // 请求类型：示例 OCR_IDENTIFY-->OCR识别业务
  type: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      fileObject: 'fileObject',
      fileObjectName: 'fileObjectName',
      fileId: 'file_id',
      params: 'params',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      fileObject: 'Readable',
      fileObjectName: 'string',
      fileId: 'string',
      params: 'string',
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ReceiveRfcParamsFileResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 文件上传响应参数
  content?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      content: 'content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      content: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadRfcAiboundFileRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 文件ID
  fileObject?: Readable;
  fileObjectName?: string;
  fileId: string;
  // 参数，jsonString
  params: string;
  // 外呼为 AI_BOUND 
  type: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      fileObject: 'fileObject',
      fileObjectName: 'fileObjectName',
      fileId: 'file_id',
      params: 'params',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      fileObject: 'Readable',
      fileObjectName: 'string',
      fileId: 'string',
      params: 'string',
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadRfcAiboundFileResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 文件上传响应参数
  content?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      content: 'content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      content: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRfcOdpsLindormRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 服务编码
  bizCode: string;
  // 加密后的唯一id
  keyId: string;
  // 授权码
  authCode?: string;
  // 加密方式
  encryptType?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizCode: 'biz_code',
      keyId: 'key_id',
      authCode: 'auth_code',
      encryptType: 'encrypt_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizCode: 'string',
      keyId: 'string',
      authCode: 'string',
      encryptType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRfcOdpsLindormResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 查询结果
  jsonRes?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      jsonRes: 'json_res',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      jsonRes: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRbbGenericInvokeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // {"platformId":1234,"method":"riskQuery"}
  content: string;
  // 账号的所有权限点，逗号分隔
  permission: string;
  // 标题备用
  title: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      content: 'content',
      permission: 'permission',
      title: 'title',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      content: 'string',
      permission: 'string',
      title: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRbbGenericInvokeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回数据内容
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

export class CreateRbbTokenRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 扩展字段
  content: string;
  // 新人用户密码，用来做映射生成token
  password: string;
  // 用户
  username: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      content: 'content',
      password: 'password',
      username: 'username',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      content: 'string',
      password: 'string',
      username: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateRbbTokenResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回数据
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

export class CreateRbbApiGwtokenRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 扩展字段
  extension?: string;
  // 新人用户密码，用来做映射生成token
  password: string;
  // 用户
  username: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      extension: 'extension',
      password: 'password',
      username: 'username',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      extension: 'string',
      password: 'string',
      username: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateRbbApiGwtokenResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回登录token
  logintoken?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      logintoken: 'logintoken',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      logintoken: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRbbGeneralRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 额外参数json
  extension?: string;
  // 通用查询名称
  queryname: string;
  // 查询参数JSON字符串
  queryparas?: string;
  // 虚拟云租户code
  virtualCloudTenantCode?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      extension: 'extension',
      queryname: 'queryname',
      queryparas: 'queryparas',
      virtualCloudTenantCode: 'virtual_cloud_tenant_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      extension: 'string',
      queryname: 'string',
      queryparas: 'string',
      virtualCloudTenantCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRbbGeneralResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // json字符串表示的通用查询结果
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

export class GetRbbLoginTokenRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用户名
  username: string;
  // 密码
  password: string;
  // 扩展json字符串
  extension?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      username: 'username',
      password: 'password',
      extension: 'extension',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      username: 'string',
      password: 'string',
      extension: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetRbbLoginTokenResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 登录token，5分钟有效
  logintoken?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      logintoken: 'logintoken',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      logintoken: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateRbbTenantRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户过期时间，不填表示永不过期
  effectiveEndDate?: string;
  // 租户编码，必须全局唯一
  tenantCode: string;
  // 租户名称
  tenantName: string;
  // 租户自定义属性，JSON格式，可以为空
  tenantPropertyJson?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      effectiveEndDate: 'effective_end_date',
      tenantCode: 'tenant_code',
      tenantName: 'tenant_name',
      tenantPropertyJson: 'tenant_property_json',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      effectiveEndDate: 'string',
      tenantCode: 'string',
      tenantName: 'string',
      tenantPropertyJson: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateRbbTenantResponse extends $tea.Model {
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

export class CreateRbbUserRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用户邮箱，非必填
  email?: string;
  // 用户姓名、真实名称，不要求全局唯一
  fullName: string;
  // 用户密码
  password: string;
  // 用户电话号码，非必填
  phone?: string;
  // 用户所属租户编码
  tenantCode?: string;
  // 用户名，必须全局唯一
  userName: string;
  // 用户属性扩展字段，json格式，可以为空
  userPropertyJson?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      email: 'email',
      fullName: 'full_name',
      password: 'password',
      phone: 'phone',
      tenantCode: 'tenant_code',
      userName: 'user_name',
      userPropertyJson: 'user_property_json',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      email: 'string',
      fullName: 'string',
      password: 'string',
      phone: 'string',
      tenantCode: 'string',
      userName: 'string',
      userPropertyJson: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateRbbUserResponse extends $tea.Model {
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

export class ExecRbbCompanyGuardRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 企业名称或统一社会信用代码
  keyword: string;
  // 规则ID，在风险大脑系统中配置
  ruleId: number;
  // 额外参数，与规则有关
  params?: string;
  // 虚拟云租户code
  virtualCloudTenantCode?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      keyword: 'keyword',
      ruleId: 'rule_id',
      params: 'params',
      virtualCloudTenantCode: 'virtual_cloud_tenant_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      keyword: 'string',
      ruleId: 'number',
      params: 'string',
      virtualCloudTenantCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecRbbCompanyGuardResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 决策结果，ACCEPT/REJECT/TBD
  decision?: string;
  // 准入执行结果的快照
  results?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      decision: 'decision',
      results: 'results',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      decision: 'string',
      results: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyRbbCompanyCreditRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 企业名称、统一社会信用代码
  keyword: string;
  // 规则ID，需提前在蚁盾中进行配置
  ruleId: number;
  // 额外参数，与规则有关
  params?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      keyword: 'keyword',
      ruleId: 'rule_id',
      params: 'params',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      keyword: 'string',
      ruleId: 'number',
      params: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyRbbCompanyCreditResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 查询token，用于查询授信结果
  token?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      token: 'token',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      token: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRbbCompanyCreditRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 查询token，从apply接口获得
  token: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      token: 'token',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      token: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRbbCompanyCreditResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 授信额度，单位元
  creditAmount?: number;
  // 额外特征字段
  extra?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      creditAmount: 'credit_amount',
      extra: 'extra',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      creditAmount: 'number',
      extra: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRbbRegdatasyncPreparedRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 查询该bizDate数据分区的数据是否已经准备好
  bizDate: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizDate: 'biz_date',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizDate: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRbbRegdatasyncPreparedResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 指定时间分区的数据是否已经准备完毕
  prepared?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      prepared: 'prepared',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      prepared: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartRbbRegdatasyncScheduleRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 同步时间分区
  bizDate: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizDate: 'biz_date',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizDate: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartRbbRegdatasyncScheduleResponse extends $tea.Model {
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

export class FinishRbbRegdatasyncScheduleRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 时间分区
  bizDate: string;
  // 记录当前分区离线同步情况
  syncInfo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizDate: 'biz_date',
      syncInfo: 'sync_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizDate: 'string',
      syncInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class FinishRbbRegdatasyncScheduleResponse extends $tea.Model {
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

export class ApplyRbbCompanyGuardRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 企业名称、统一社会信用代码或注册号
  keyword: string;
  // 规则ID
  ruleId: number;
  // 额外参数，与具体规则相关
  params?: string;
  // 虚拟云租户code
  virtualCloudTenantCode?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      keyword: 'keyword',
      ruleId: 'rule_id',
      params: 'params',
      virtualCloudTenantCode: 'virtual_cloud_tenant_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      keyword: 'string',
      ruleId: 'number',
      params: 'string',
      virtualCloudTenantCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyRbbCompanyGuardResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 查询token
  token?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      token: 'token',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      token: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRbbCompanyGuardRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 查询token
  token: string;
  // 虚拟云租户code
  virtualCloudTenantCode?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      token: 'token',
      virtualCloudTenantCode: 'virtual_cloud_tenant_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      token: 'string',
      virtualCloudTenantCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRbbCompanyGuardResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 决策结果，ACCEPT/REJECT/TBD
  // 
  decision?: string;
  // 准入执行结果的快照
  // 
  results?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      decision: 'decision',
      results: 'results',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      decision: 'string',
      results: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRbbObtsZsearchRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 索引名称
  index: string;
  // 类型名称
  type?: string;
  // 操作方法
  operationMethod?: string;
  // 查询语句
  entityString?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      index: 'index',
      type: 'type',
      operationMethod: 'operation_method',
      entityString: 'entity_string',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      index: 'string',
      type: 'string',
      operationMethod: 'string',
      entityString: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRbbObtsZsearchResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // zsearch查询结果
  zsearchResult?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      zsearchResult: 'zsearch_result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      zsearchResult: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushRbbCustomerCompanyinfoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 企业的统一社会信用代码
  ucCode?: string;
  // 企业名称
  companyName?: string;
  // 企业信息的类型
  type: string;
  // 企业信息的内容
  content?: string;
  // 虚拟云租户code
  virtualCloudTenantCode?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      ucCode: 'uc_code',
      companyName: 'company_name',
      type: 'type',
      content: 'content',
      virtualCloudTenantCode: 'virtual_cloud_tenant_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      ucCode: 'string',
      companyName: 'string',
      type: 'string',
      content: 'string',
      virtualCloudTenantCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushRbbCustomerCompanyinfoResponse extends $tea.Model {
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

export class UploadRbbFileAmapRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 文件id
  fileObject?: Readable;
  fileObjectName?: string;
  fileId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      fileObject: 'fileObject',
      fileObjectName: 'fileObjectName',
      fileId: 'file_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      fileObject: 'Readable',
      fileObjectName: 'string',
      fileId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadRbbFileAmapResponse extends $tea.Model {
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

export class OperateRbbCreditRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 服务code
  serviceCode: string;
  // 服务参数
  serviceParams: string;
  // 步骤
  serviceStep: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      serviceCode: 'service_code',
      serviceParams: 'service_params',
      serviceStep: 'service_step',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      serviceCode: 'string',
      serviceParams: 'string',
      serviceStep: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OperateRbbCreditResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 结果数据
  resultData?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      resultData: 'result_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      resultData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushRbbCustomerInformationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 社会信用代码
  creditCode: string;
  // 公司名称
  companyName: string;
  // 法人姓名
  name: string;
  // 身份证号
  idCard: string;
  // 手机号
  phoneNumber: string;
  // 合作伙伴
  businessPartner: string;
  // 指定产品方
  productSide: string;
  // 账号
  account: string;
  // 密码
  password: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      creditCode: 'credit_code',
      companyName: 'company_name',
      name: 'name',
      idCard: 'id_card',
      phoneNumber: 'phone_number',
      businessPartner: 'business_partner',
      productSide: 'product_side',
      account: 'account',
      password: 'password',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      creditCode: 'string',
      companyName: 'string',
      name: 'string',
      idCard: 'string',
      phoneNumber: 'string',
      businessPartner: 'string',
      productSide: 'string',
      account: 'string',
      password: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushRbbCustomerInformationResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 地址
  resultUrl?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      resultUrl: 'result_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      resultUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetRbbTaxinvoiceDataRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 流水号
  serialNumber: string;
  // 社会新信用代码
  taxpayerId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      serialNumber: 'serial_number',
      taxpayerId: 'taxpayer_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      serialNumber: 'string',
      taxpayerId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetRbbTaxinvoiceDataResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 税票授权数据结果
  resultData?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      resultData: 'result_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      resultData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushRbbCustomerStatusRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 结果数据
  resultData: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      resultData: 'result_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      resultData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushRbbCustomerStatusResponse extends $tea.Model {
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

export class PushRbbInvoiceChargeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户码
  tenantCode: string;
  // 授权类型
  bizType: string;
  // 计费项,主租户：税号,子租户：子租户|税号
  customerId: string;
  // 请求id
  taskRequestId: string;
  // 利润共享方
  benefitSharePartner: string;
  // 计费时间
  feeTime: string;
  // 税号
  sharding: string;
  // true为接收侧提交账单，false接收侧不用提交账单
  receiverSubmitBill: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantCode: 'tenant_code',
      bizType: 'biz_type',
      customerId: 'customer_id',
      taskRequestId: 'task_request_id',
      benefitSharePartner: 'benefit_share_partner',
      feeTime: 'fee_time',
      sharding: 'sharding',
      receiverSubmitBill: 'receiver_submit_bill',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantCode: 'string',
      bizType: 'string',
      customerId: 'string',
      taskRequestId: 'string',
      benefitSharePartner: 'string',
      feeTime: 'string',
      sharding: 'string',
      receiverSubmitBill: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushRbbInvoiceChargeResponse extends $tea.Model {
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

export class ReceiveRbbParamsFileRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 文件ID
  fileObject?: Readable;
  fileObjectName?: string;
  fileId: string;
  // 参数，jsonString
  params: string;
  // 请求类型：示例 CREDIT_REPORTS-->征信报告上传
  type: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      fileObject: 'fileObject',
      fileObjectName: 'fileObjectName',
      fileId: 'file_id',
      params: 'params',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      fileObject: 'Readable',
      fileObjectName: 'string',
      fileId: 'string',
      params: 'string',
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ReceiveRbbParamsFileResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 文件上传结果
  content?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      content: 'content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      content: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ReceiveRbbOverseacompanyProfileRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // fileId
  fileObject?: Readable;
  fileObjectName?: string;
  fileId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      fileObject: 'fileObject',
      fileObjectName: 'fileObjectName',
      fileId: 'file_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      fileObject: 'Readable',
      fileObjectName: 'string',
      fileId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ReceiveRbbOverseacompanyProfileResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 文件url
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

export class PushRpaasReportAnswerRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // chat trace id
  chatTraceId: string;
  // 响应结果
  answer: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      chatTraceId: 'chat_trace_id',
      answer: 'answer',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      chatTraceId: 'string',
      answer: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushRpaasReportAnswerResponse extends $tea.Model {
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

export class QueryRpaasOpenServiceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 开放服务ID
  serviceId: string;
  // { "companyId": "2088" }
  params?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      serviceId: 'service_id',
      params: 'params',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      serviceId: 'string',
      params: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRpaasOpenServiceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 调用结果
  body?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      body: 'body',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      body: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRpgwSignUrlRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 企业标识，固定值
  companyCode: string;
  // 调用方平台用户id
  platformUserIdentification: string;
  // 手机号
  userCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      companyCode: 'company_code',
      platformUserIdentification: 'platform_user_identification',
      userCode: 'user_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      companyCode: 'string',
      platformUserIdentification: 'string',
      userCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRpgwSignUrlResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 签约地址
  resultData?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      resultData: 'result_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      resultData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RegisterRpgwUserEinvoiceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 企业标识，固定值
  companyCode: string;
  // 调用方平台用户id
  platformUserIdentification: string;
  // 身份证号码
  identificationNumber: string;
  // 用户手机号
  mobilePhone: string;
  // 用户姓名
  userName: string;
  // 身份证照片人像面照片url
  identityFrontPic: string;
  // 身份证照片国徽面url
  identityBackPic: string;
  // 身份证有效期开始时间，格式yyyy-MM-dd
  idcardValidityStart: string;
  // 身份证有效期结束时间，格式yyyy-MM-dd
  idcardValidityEnd: string;
  // 实名认证时间，格式yyyy-MM-dd HH:mm:ss
  identityTime: string;
  // 注册模式，固定值
  registerMode: string;
  // 注册时间，格式yyyy-MM-dd HH:mm:ss
  registerTime: string;
  // 用户人脸照片url
  facePic?: string;
  // 支付宝账号，实名认证的支付宝登录邮箱或手机登录，其账户姓名好和实人认证姓名一致
  alipayAccount?: string;
  // 微信支付个人账户（openid）
  wxpayAccount?: string;
  // 银行卡号，标准一类或二类卡格式，持卡人为本用户
  bankcardNo?: string;
  // 开户行名称
  bankName?: string;
  // 开户行归属地省市
  bankcardCity?: string;
  // 用户所在省市
  city?: string;
  // 拓展信息
  extJson?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      companyCode: 'company_code',
      platformUserIdentification: 'platform_user_identification',
      identificationNumber: 'identification_number',
      mobilePhone: 'mobile_phone',
      userName: 'user_name',
      identityFrontPic: 'identity_front_pic',
      identityBackPic: 'identity_back_pic',
      idcardValidityStart: 'idcard_validity_start',
      idcardValidityEnd: 'idcard_validity_end',
      identityTime: 'identity_time',
      registerMode: 'register_mode',
      registerTime: 'register_time',
      facePic: 'face_pic',
      alipayAccount: 'alipay_account',
      wxpayAccount: 'wxpay_account',
      bankcardNo: 'bankcard_no',
      bankName: 'bank_name',
      bankcardCity: 'bankcard_city',
      city: 'city',
      extJson: 'ext_json',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      companyCode: 'string',
      platformUserIdentification: 'string',
      identificationNumber: 'string',
      mobilePhone: 'string',
      userName: 'string',
      identityFrontPic: 'string',
      identityBackPic: 'string',
      idcardValidityStart: 'string',
      idcardValidityEnd: 'string',
      identityTime: 'string',
      registerMode: 'string',
      registerTime: 'string',
      facePic: 'string',
      alipayAccount: 'string',
      wxpayAccount: 'string',
      bankcardNo: 'string',
      bankName: 'string',
      bankcardCity: 'string',
      city: 'string',
      extJson: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RegisterRpgwUserEinvoiceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 用户在我方的id
  resultData?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      resultData: 'result_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      resultData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRpgwUserSignurlRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 企业标识，固定值
  companyCode: string;
  // 调用方平台用户id
  platformUserIdentification: string;
  // 手机号
  userCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      companyCode: 'company_code',
      platformUserIdentification: 'platform_user_identification',
      userCode: 'user_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      companyCode: 'string',
      platformUserIdentification: 'string',
      userCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRpgwUserSignurlResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 签约地址
  resultData?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      resultData: 'result_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      resultData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class WithdrawRpgwUserCommissionRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 提现业务单号
  orderNumber: string;
  // 任务单号
  userOrderNumbers: string;
  // 提现人id
  withdrawerId: string;
  // 提现人支付宝id
  withdrawerAlipayId: string;
  // 提现人姓名
  withdrawerName: string;
  // 提现人手机
  withdrawerPhoneNumber?: string;
  // 提现人身份证
  withdrawerIdNumber: string;
  // 提现金额
  withdrawAmount: string;
  // 提现附言
  orderTitle: string;
  // 业务备注
  remark: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderNumber: 'order_number',
      userOrderNumbers: 'user_order_numbers',
      withdrawerId: 'withdrawer_id',
      withdrawerAlipayId: 'withdrawer_alipay_id',
      withdrawerName: 'withdrawer_name',
      withdrawerPhoneNumber: 'withdrawer_phone_number',
      withdrawerIdNumber: 'withdrawer_id_number',
      withdrawAmount: 'withdraw_amount',
      orderTitle: 'order_title',
      remark: 'remark',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderNumber: 'string',
      userOrderNumbers: 'string',
      withdrawerId: 'string',
      withdrawerAlipayId: 'string',
      withdrawerName: 'string',
      withdrawerPhoneNumber: 'string',
      withdrawerIdNumber: 'string',
      withdrawAmount: 'string',
      orderTitle: 'string',
      remark: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class WithdrawRpgwUserCommissionResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 提现结果
  resultData?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      resultData: 'result_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      resultData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncRpgwUserOrderinfoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单号
  orderNumber: string;
  // REGISTER与PURCHASE二选一
  orderType: string;
  // 注册/下单总佣金
  orderAmount: string;
  // 时间，格式为yyyy-MM-dd HH:mm:ss
  orderTime: string;
  // 邀请人id
  inviterId: string;
  // 邀请人姓名
  inviterName: string;
  // 邀请人手机号
  inviterPhoneNumber: string;
  // 邀请人身份证号
  inviterIdNumber: string;
  // 邀请码
  invitationCode?: string;
  // 被邀请人id
  inviteeId: string;
  // 被邀请人姓名
  inviteeName?: string;
  // 被邀请人手机号
  inviteePhoneNumber: string;
  // 被邀请人身份证
  inviteeIdNumber?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderNumber: 'order_number',
      orderType: 'order_type',
      orderAmount: 'order_amount',
      orderTime: 'order_time',
      inviterId: 'inviter_id',
      inviterName: 'inviter_name',
      inviterPhoneNumber: 'inviter_phone_number',
      inviterIdNumber: 'inviter_id_number',
      invitationCode: 'invitation_code',
      inviteeId: 'invitee_id',
      inviteeName: 'invitee_name',
      inviteePhoneNumber: 'invitee_phone_number',
      inviteeIdNumber: 'invitee_id_number',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderNumber: 'string',
      orderType: 'string',
      orderAmount: 'string',
      orderTime: 'string',
      inviterId: 'string',
      inviterName: 'string',
      inviterPhoneNumber: 'string',
      inviterIdNumber: 'string',
      invitationCode: 'string',
      inviteeId: 'string',
      inviteeName: 'string',
      inviteePhoneNumber: 'string',
      inviteeIdNumber: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncRpgwUserOrderinfoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 同步结果
  resultData?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      resultData: 'result_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      resultData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class NotifyRpgwUserSignresultRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 调用方平台用户id
  platformUserIdentification: string;
  // 用户手机号
  userCode: string;
  // 签约结果，1成功，0失败
  signResult: string;
  // 失败原因描述
  resultDesc?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      platformUserIdentification: 'platform_user_identification',
      userCode: 'user_code',
      signResult: 'sign_result',
      resultDesc: 'result_desc',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      platformUserIdentification: 'string',
      userCode: 'string',
      signResult: 'string',
      resultDesc: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class NotifyRpgwUserSignresultResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 通知结果
  resultData?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      resultData: 'result_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      resultData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRtopCompanyOpinionRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 结束时间
  endTime: string;
  // 页码
  pageNum: number;
  // 一页的数量
  pageSize: number;
  // 所在地的名称
  placeName: string;
  // 地区类型
  placeType: string;
  // 开始时间
  startTime: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      endTime: 'end_time',
      pageNum: 'page_num',
      pageSize: 'page_size',
      placeName: 'place_name',
      placeType: 'place_type',
      startTime: 'start_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      endTime: 'string',
      pageNum: 'number',
      pageSize: 'number',
      placeName: 'string',
      placeType: 'string',
      startTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRtopCompanyOpinionResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  companyOpinionCount: RtopCompanyOpinionCount[];
  // 页码
  pageNum: number;
  // 一页的数量
  pageSize: number;
  // 总的记录数
  totalCount: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      companyOpinionCount: 'company_opinion_count',
      pageNum: 'page_num',
      pageSize: 'page_size',
      totalCount: 'total_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      companyOpinionCount: { 'type': 'array', 'itemType': RtopCompanyOpinionCount },
      pageNum: 'number',
      pageSize: 'number',
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListRtopCompanyOpinionsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 地区类型
  companyName: string;
  // 页码
  pageNum: number;
  // 一页的数量
  pageSize: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      companyName: 'company_name',
      pageNum: 'page_num',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      companyName: 'string',
      pageNum: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListRtopCompanyOpinionsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  companyOpinionDetails: RtopCompanyOpinionDetail[];
  // 页码
  pageNum: number;
  // 一页的数量
  pageSize: number;
  // 总的记录数
  totalCount: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      companyOpinionDetails: 'company_opinion_details',
      pageNum: 'page_num',
      pageSize: 'page_size',
      totalCount: 'total_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      companyOpinionDetails: { 'type': 'array', 'itemType': RtopCompanyOpinionDetail },
      pageNum: 'number',
      pageSize: 'number',
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetRtopCompanyMonitorRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 地区类型
  companyName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      companyName: 'company_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      companyName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetRtopCompanyMonitorResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 活跃市，不带国家和地区的代码
  activeCity: string;
  // 监测企业的行业
  companyCategory?: string;
  // 涉众风险类型
  crowdRiskType: string;
  features: RtopMonitorCompanyFeature[];
  // 影响金额
  moneyInvolved: number;
  monitorRiskTags: string[];
  // 监测企业的评分
  monitorScore: number;
  // 影响人数
  peopleInvolved: number;
  // 注册市，不带国家和地区的代码
  registeredCity: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      activeCity: 'active_city',
      companyCategory: 'company_category',
      crowdRiskType: 'crowd_risk_type',
      features: 'features',
      moneyInvolved: 'money_involved',
      monitorRiskTags: 'monitor_risk_tags',
      monitorScore: 'monitor_score',
      peopleInvolved: 'people_involved',
      registeredCity: 'registered_city',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      activeCity: 'string',
      companyCategory: 'string',
      crowdRiskType: 'string',
      features: { 'type': 'array', 'itemType': RtopMonitorCompanyFeature },
      moneyInvolved: 'number',
      monitorRiskTags: { 'type': 'array', 'itemType': 'string' },
      monitorScore: 'number',
      peopleInvolved: 'number',
      registeredCity: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRtopCrowdriskStatisticRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 结束时间
  endTime?: string;
  // 所在地的名称
  placeName?: string;
  // 地区类型
  placeType?: string;
  // 开始时间
  startTime?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      endTime: 'end_time',
      placeName: 'place_name',
      placeType: 'place_type',
      startTime: 'start_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      endTime: 'string',
      placeName: 'string',
      placeType: 'string',
      startTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRtopCrowdriskStatisticResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  levelDistribution?: RtopLevelDistribution[];
  // 按地区统计
  regionDistribution?: RtopRegionalDistribution[];
  typeDistribution?: RtopTypeDistribution[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      levelDistribution: 'level_distribution',
      regionDistribution: 'region_distribution',
      typeDistribution: 'type_distribution',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      levelDistribution: { 'type': 'array', 'itemType': RtopLevelDistribution },
      regionDistribution: { 'type': 'array', 'itemType': RtopRegionalDistribution },
      typeDistribution: { 'type': 'array', 'itemType': RtopTypeDistribution },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListRtopCrowdriskRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 活跃地筛选
  activePlaces?: string[];
  // 风险等级
  crowdRiskLevels?: string[];
  // 风险类型
  crowdRiskTypes?: string[];
  // 结束时间
  endTime?: string;
  // 页码
  pageNum?: number;
  // 每页条数
  pageSize?: number;
  // 所在地的名称
  placeName?: string;
  // 地区类型
  placeType?: string;
  // 注册地筛选
  regPlaces?: string[];
  // 排序字段
  sortBy?: string;
  // 排序方式
  sortType?: string;
  // 开始时间
  startTime?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      activePlaces: 'active_places',
      crowdRiskLevels: 'crowd_risk_levels',
      crowdRiskTypes: 'crowd_risk_types',
      endTime: 'end_time',
      pageNum: 'page_num',
      pageSize: 'page_size',
      placeName: 'place_name',
      placeType: 'place_type',
      regPlaces: 'reg_places',
      sortBy: 'sort_by',
      sortType: 'sort_type',
      startTime: 'start_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      activePlaces: { 'type': 'array', 'itemType': 'string' },
      crowdRiskLevels: { 'type': 'array', 'itemType': 'string' },
      crowdRiskTypes: { 'type': 'array', 'itemType': 'string' },
      endTime: 'string',
      pageNum: 'number',
      pageSize: 'number',
      placeName: 'string',
      placeType: 'string',
      regPlaces: { 'type': 'array', 'itemType': 'string' },
      sortBy: 'string',
      sortType: 'string',
      startTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListRtopCrowdriskResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 企业列表
  companys?: RtopCrowdRiskSummaryResp[];
  // 页码
  pageNum?: number;
  // 每页条数
  pageSize?: number;
  // 总数
  totalCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      companys: 'companys',
      pageNum: 'page_num',
      pageSize: 'page_size',
      totalCount: 'total_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      companys: { 'type': 'array', 'itemType': RtopCrowdRiskSummaryResp },
      pageNum: 'number',
      pageSize: 'number',
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRtopCrowdriskDetailRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 企业ID
  companyId?: string;
  // 所在地的名称
  placeName?: string;
  // 地区类型
  placeType?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      companyId: 'company_id',
      placeName: 'place_name',
      placeType: 'place_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      companyId: 'string',
      placeName: 'string',
      placeType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRtopCrowdriskDetailResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 活跃市
  activeCity?: string;
  // 活跃县
  activeCounty?: string;
  // 活跃省
  activeProvince?: string;
  // 年龄分布
  ageDistribution?: RtopAgeDistribution[];
  // 线索标签
  clueTags?: string[];
  // 报文
  conclusion?: string;
  // 风险等级
  crowdRiskLevel?: string;
  // 涉众风险分析的分数
  crowdRiskScore?: number;
  // 风险类型
  crowdRiskType?: string;
  // 发现时间
  detectedTime?: string;
  // 特征
  features?: RtopCrowdRiskFeatureResp[];
  // 性别分布
  genderDistribution?: RtopGenderDistribution[];
  // 上次活跃时间
  lastActiveTime?: string;
  // 涉案金额
  moneyInvolved?: number;
  // 影响金额的历史曲线
  moneyInvolvedHistory?: RtopDateDistribution[];
  // 涉案人数
  peopleInvolved?: number;
  // 影响人数的历史曲线
  peopleInvolvedHistory?: RtopDateDistribution[];
  // 影响的人数分布，key为地区城市，value为影响的人数
  populationDistribution?: RtopPopulationDistribution[];
  // 注册市
  registeredCity?: string;
  // 注册县
  registeredCounty?: string;
  // 注册省
  registeredProvince?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      activeCity: 'active_city',
      activeCounty: 'active_county',
      activeProvince: 'active_province',
      ageDistribution: 'age_distribution',
      clueTags: 'clue_tags',
      conclusion: 'conclusion',
      crowdRiskLevel: 'crowd_risk_level',
      crowdRiskScore: 'crowd_risk_score',
      crowdRiskType: 'crowd_risk_type',
      detectedTime: 'detected_time',
      features: 'features',
      genderDistribution: 'gender_distribution',
      lastActiveTime: 'last_active_time',
      moneyInvolved: 'money_involved',
      moneyInvolvedHistory: 'money_involved_history',
      peopleInvolved: 'people_involved',
      peopleInvolvedHistory: 'people_involved_history',
      populationDistribution: 'population_distribution',
      registeredCity: 'registered_city',
      registeredCounty: 'registered_county',
      registeredProvince: 'registered_province',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      activeCity: 'string',
      activeCounty: 'string',
      activeProvince: 'string',
      ageDistribution: { 'type': 'array', 'itemType': RtopAgeDistribution },
      clueTags: { 'type': 'array', 'itemType': 'string' },
      conclusion: 'string',
      crowdRiskLevel: 'string',
      crowdRiskScore: 'number',
      crowdRiskType: 'string',
      detectedTime: 'string',
      features: { 'type': 'array', 'itemType': RtopCrowdRiskFeatureResp },
      genderDistribution: { 'type': 'array', 'itemType': RtopGenderDistribution },
      lastActiveTime: 'string',
      moneyInvolved: 'number',
      moneyInvolvedHistory: { 'type': 'array', 'itemType': RtopDateDistribution },
      peopleInvolved: 'number',
      peopleInvolvedHistory: { 'type': 'array', 'itemType': RtopDateDistribution },
      populationDistribution: { 'type': 'array', 'itemType': RtopPopulationDistribution },
      registeredCity: 'string',
      registeredCounty: 'string',
      registeredProvince: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRtopRiskstormRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 企业ID
  companyId?: string;
  // 数据类型
  type?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      companyId: 'company_id',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      companyId: 'string',
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRtopRiskstormResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 年报数据
  annualReports?: RtopRiskStormCompanyAnnualReport[];
  // 风险标签数据
  riskLabels?: RiskStormLabelResp[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      annualReports: 'annual_reports',
      riskLabels: 'risk_labels',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      annualReports: { 'type': 'array', 'itemType': RtopRiskStormCompanyAnnualReport },
      riskLabels: { 'type': 'array', 'itemType': RiskStormLabelResp },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRtopCrowdriskSumRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 指定的企业ID列表，企业ID数量不超过100个。
  companyIds: string[];
  // 指定的地区名称，例如温州市、鹿城区等
  placeName: string;
  // 地区类型，PROVINCE表示省，CITY表示市，COUNTY表示县
  placeType: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      companyIds: 'company_ids',
      placeName: 'place_name',
      placeType: 'place_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      companyIds: { 'type': 'array', 'itemType': 'string' },
      placeName: 'string',
      placeType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRtopCrowdriskSumResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 查询企业的影响金额之和
  moneyInvolved?: number;
  // 查询企业的影响人数之和
  peopleInvolved?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      moneyInvolved: 'money_involved',
      peopleInvolved: 'people_involved',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      moneyInvolved: 'number',
      peopleInvolved: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetRtopCompanyDetailRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 企业ID
  companyId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      companyId: 'company_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      companyId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetRtopCompanyDetailResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 风险分数
  riskScore?: number;
  // 风险维度特征
  riskFeatures?: string;
  // 风险标签列表
  riskTags?: RtopRiskTag[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      riskScore: 'risk_score',
      riskFeatures: 'risk_features',
      riskTags: 'risk_tags',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      riskScore: 'number',
      riskFeatures: 'string',
      riskTags: { 'type': 'array', 'itemType': RtopRiskTag },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRtopCompanyRiskinfoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户access key
  ak: string;
  // 业务场景 ""
  bizType?: string;
  // 预留字段
  memo?: string;
  // 区域中文名称
  placeName: string;
  // 区域类型
  placeType: string;
  // 租户seceret key
  sk: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      ak: 'ak',
      bizType: 'biz_type',
      memo: 'memo',
      placeName: 'place_name',
      placeType: 'place_type',
      sk: 'sk',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      ak: 'string',
      bizType: 'string',
      memo: 'string',
      placeName: 'string',
      placeType: 'string',
      sk: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRtopCompanyRiskinfoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 企业列表
  data?: RtopCompanyRiskInfo[];
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
      data: { 'type': 'array', 'itemType': RtopCompanyRiskInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecRtopGenericInvokeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // {"platformId":1234}
  content: string;
  // 这个账号的所有权限点，逗号分隔
  permission: string;
  // title
  title: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      content: 'content',
      permission: 'permission',
      title: 'title',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      content: 'string',
      permission: 'string',
      title: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecRtopGenericInvokeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 接口数据
  data?: string;
  // response_code
  responseCode?: string;
  // 是否请求成功
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      responseCode: 'response_code',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: 'string',
      responseCode: 'string',
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateRtopTokenRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateRtopTokenResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回数据
  data?: string;
  // 返回码
  responseCode?: string;
  // 成功，失败
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      responseCode: 'response_code',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: 'string',
      responseCode: 'string',
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRtopRisklabelRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // pageNo
  pageNo: number;
  // pageSize
  pageSize: number;
  // scroll_id
  scrollId?: string;
  // mct_one_id  -- search after使用
  mctOneId?: string;
  // 数据更新日期
  updateDate: string;
  // tag_id  -- search after使用
  tagId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      pageNo: 'page_no',
      pageSize: 'page_size',
      scrollId: 'scroll_id',
      mctOneId: 'mct_one_id',
      updateDate: 'update_date',
      tagId: 'tag_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      pageNo: 'number',
      pageSize: 'number',
      scrollId: 'string',
      mctOneId: 'string',
      updateDate: 'string',
      tagId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRtopRisklabelResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回码
  responseCode?: string;
  // 标签信息
  riskLabelInfos?: RiskLabelInfo[];
  // scroll_id
  scrollId?: string;
  // 是否调用成功
  success?: boolean;
  // total
  total?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      responseCode: 'response_code',
      riskLabelInfos: 'risk_label_infos',
      scrollId: 'scroll_id',
      success: 'success',
      total: 'total',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      responseCode: 'string',
      riskLabelInfos: { 'type': 'array', 'itemType': RiskLabelInfo },
      scrollId: 'string',
      success: 'boolean',
      total: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRtopCompanyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 公司ID集合
  companyIds: string[];
  // 数据同步到公有云时间(业务上赋值当天)
  updateDate: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      companyIds: 'company_ids',
      updateDate: 'update_date',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      companyIds: { 'type': 'array', 'itemType': 'string' },
      updateDate: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRtopCompanyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 企业信息列表
  companyInfos?: CompanyInfo[];
  // 返回码
  responseCode?: string;
  // 是否调用成功
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      companyInfos: 'company_infos',
      responseCode: 'response_code',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      companyInfos: { 'type': 'array', 'itemType': CompanyInfo },
      responseCode: 'string',
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRtopRisklabelFilterRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // pageNo
  pageNo: number;
  // page_size
  pageSize: number;
  // 成都市
  placeName: string;
  // CITY
  placeType: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      pageNo: 'page_no',
      pageSize: 'page_size',
      placeName: 'place_name',
      placeType: 'place_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      pageNo: 'number',
      pageSize: 'number',
      placeName: 'string',
      placeType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRtopRisklabelFilterResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回码
  responseCode?: string;
  // 标签配置全量信息
  riskLabelFilterConfigInfo?: RiskLabelFilterConfigInfo[];
  // 是否调用成功
  success?: boolean;
  // 总数
  total?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      responseCode: 'response_code',
      riskLabelFilterConfigInfo: 'risk_label_filter_config_info',
      success: 'success',
      total: 'total',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      responseCode: 'string',
      riskLabelFilterConfigInfo: { 'type': 'array', 'itemType': RiskLabelFilterConfigInfo },
      success: 'boolean',
      total: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PullRegtechNewsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 表示本地数据库中舆情数据中的最大id
  newsMaxId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      newsMaxId: 'news_max_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      newsMaxId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PullRegtechNewsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回的数据体
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

export class QueryRtopCompanyFeedbackRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 当前是第几页
  pageNo: number;
  // 每一页的记录条数
  pageSize: number;
  // 用户属地
  userPlace: string;
  // 用户所在地类型
  userPlaceType: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      pageNo: 'page_no',
      pageSize: 'page_size',
      userPlace: 'user_place',
      userPlaceType: 'user_place_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      pageNo: 'number',
      pageSize: 'number',
      userPlace: 'string',
      userPlaceType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRtopCompanyFeedbackResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 企业反馈列表
  companyFeedbacks?: RtopCompanyFeedback[];
  // 返回码
  responseCode?: string;
  // 是否调用成功
  success?: boolean;
  // 总条数
  totalNum?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      companyFeedbacks: 'company_feedbacks',
      responseCode: 'response_code',
      success: 'success',
      totalNum: 'total_num',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      companyFeedbacks: { 'type': 'array', 'itemType': RtopCompanyFeedback },
      responseCode: 'string',
      success: 'boolean',
      totalNum: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRtopCompanyAlarmRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 数据的时间
  dataTime: string;
  // 当前是第几页
  pageNo: number;
  // 每一页的记录条数
  pageSize: number;
  // 用户属地
  userPlace: string;
  // 用户所在地类型
  userPlaceType: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      dataTime: 'data_time',
      pageNo: 'page_no',
      pageSize: 'page_size',
      userPlace: 'user_place',
      userPlaceType: 'user_place_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      dataTime: 'string',
      pageNo: 'number',
      pageSize: 'number',
      userPlace: 'string',
      userPlaceType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRtopCompanyAlarmResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 预警企业列表
  companyAlarms?: RtopCompanyAlarm[];
  // 返回码
  responseCode?: string;
  // 是否调用成功
  success?: boolean;
  // 总条数
  totalNum?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      companyAlarms: 'company_alarms',
      responseCode: 'response_code',
      success: 'success',
      totalNum: 'total_num',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      companyAlarms: { 'type': 'array', 'itemType': RtopCompanyAlarm },
      responseCode: 'string',
      success: 'boolean',
      totalNum: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRtopCompanyRiskyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 数据时间
  dataTime: string;
  // 全局态势中的列表 类型
  listType: string;
  // 当前是第几页
  pageNo: number;
  // 每一页的记录条数
  pageSize: number;
  // 全局动态类型
  type: string;
  // 用户属地
  userPlace: string;
  // 用户所在地类型
  userPlaceType: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      dataTime: 'data_time',
      listType: 'list_type',
      pageNo: 'page_no',
      pageSize: 'page_size',
      type: 'type',
      userPlace: 'user_place',
      userPlaceType: 'user_place_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      dataTime: 'string',
      listType: 'string',
      pageNo: 'number',
      pageSize: 'number',
      type: 'string',
      userPlace: 'string',
      userPlaceType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRtopCompanyRiskyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回码
  responseCode?: string;
  // 全局动态中的企业列表
  riskyCompanies?: RtopRiskyCompany[];
  // 是否调用成功
  success?: boolean;
  // 总条数
  totalNum?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      responseCode: 'response_code',
      riskyCompanies: 'risky_companies',
      success: 'success',
      totalNum: 'total_num',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      responseCode: 'string',
      riskyCompanies: { 'type': 'array', 'itemType': RtopRiskyCompany },
      success: 'boolean',
      totalNum: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRtopCompanyListRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 活跃地区
  activeAreas?: string[];
  // 企业类型
  categories?: string[];
  // 企业状态
  companyStates?: string[];
  // 反馈
  feedback?: string[];
  // 风险指数最大值
  maxRiskScore?: number;
  // 指数周波动最大值
  maxRiskScoreWeeklyFloat?: string;
  // 传播人次最大值
  maxSpreadNumber?: number;
  // 风险指数最小值
  minRiskScore?: number;
  // 指数周波动最小值
  minRiskScoreWeeklyFloat?: string;
  // 传播人次最小值
  minSpreadNumber?: number;
  // 正常营运状态
  normalOperation?: boolean;
  // 经营地区
  operateAreas?: string[];
  // 当前是第几页
  pageNo: number;
  // 每一页的记录条数
  pageSize: number;
  // 平台状态
  platformStates?: string[];
  // 注册地区
  registerAreas?: string[];
  // 高风险维度
  riskyDimensions?: string[];
  // 风险标签
  riskTags?: string[];
  // 风险定性
  riskTypes?: string[];
  // 排序字段
  sortField?: string;
  // 排序类型
  sortType?: string;
  // 用户属地
  userPlace: string;
  // 用户所在地类型
  userPlaceType: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      activeAreas: 'active_areas',
      categories: 'categories',
      companyStates: 'company_states',
      feedback: 'feedback',
      maxRiskScore: 'max_risk_score',
      maxRiskScoreWeeklyFloat: 'max_risk_score_weekly_float',
      maxSpreadNumber: 'max_spread_number',
      minRiskScore: 'min_risk_score',
      minRiskScoreWeeklyFloat: 'min_risk_score_weekly_float',
      minSpreadNumber: 'min_spread_number',
      normalOperation: 'normal_operation',
      operateAreas: 'operate_areas',
      pageNo: 'page_no',
      pageSize: 'page_size',
      platformStates: 'platform_states',
      registerAreas: 'register_areas',
      riskyDimensions: 'risky_dimensions',
      riskTags: 'risk_tags',
      riskTypes: 'risk_types',
      sortField: 'sort_field',
      sortType: 'sort_type',
      userPlace: 'user_place',
      userPlaceType: 'user_place_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      activeAreas: { 'type': 'array', 'itemType': 'string' },
      categories: { 'type': 'array', 'itemType': 'string' },
      companyStates: { 'type': 'array', 'itemType': 'string' },
      feedback: { 'type': 'array', 'itemType': 'string' },
      maxRiskScore: 'number',
      maxRiskScoreWeeklyFloat: 'string',
      maxSpreadNumber: 'number',
      minRiskScore: 'number',
      minRiskScoreWeeklyFloat: 'string',
      minSpreadNumber: 'number',
      normalOperation: 'boolean',
      operateAreas: { 'type': 'array', 'itemType': 'string' },
      pageNo: 'number',
      pageSize: 'number',
      platformStates: { 'type': 'array', 'itemType': 'string' },
      registerAreas: { 'type': 'array', 'itemType': 'string' },
      riskyDimensions: { 'type': 'array', 'itemType': 'string' },
      riskTags: { 'type': 'array', 'itemType': 'string' },
      riskTypes: { 'type': 'array', 'itemType': 'string' },
      sortField: 'string',
      sortType: 'string',
      userPlace: 'string',
      userPlaceType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRtopCompanyListResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 企业id列表
  companyIds?: string[];
  // 返回码
  responseCode?: string;
  // 是否调用成功
  success?: boolean;
  // 总条数
  totalNum?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      companyIds: 'company_ids',
      responseCode: 'response_code',
      success: 'success',
      totalNum: 'total_num',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      companyIds: { 'type': 'array', 'itemType': 'string' },
      responseCode: 'string',
      success: 'boolean',
      totalNum: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRtopRisklabelConfigRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // page_no
  pageNo: number;
  // page_size
  pageSize: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      pageNo: 'page_no',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      pageNo: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRtopRisklabelConfigResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回码	
  // 
  responseCode?: string;
  // 是否调用成功	
  // 
  success?: boolean;
  // 列表
  tagConfig?: RiskLabelConfigInfo[];
  // 总数
  total?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      responseCode: 'response_code',
      success: 'success',
      tagConfig: 'tag_config',
      total: 'total',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      responseCode: 'string',
      success: 'boolean',
      tagConfig: { 'type': 'array', 'itemType': RiskLabelConfigInfo },
      total: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRtopCompanyRiskRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 企业id
  companyId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      companyId: 'company_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      companyId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRtopCompanyRiskResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 风险维度
  riskFactors?: RtopCompanyRiskFactor[];
  // 风险等级
  riskLevel?: string;
  // 风险报文
  riskMessage?: string;
  // 风险分数
  riskScore?: number;
  // 风险标签
  riskTags?: string[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      riskFactors: 'risk_factors',
      riskLevel: 'risk_level',
      riskMessage: 'risk_message',
      riskScore: 'risk_score',
      riskTags: 'risk_tags',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      riskFactors: { 'type': 'array', 'itemType': RtopCompanyRiskFactor },
      riskLevel: 'string',
      riskMessage: 'string',
      riskScore: 'number',
      riskTags: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListRtopCompanyRelatedRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 企业id
  companyId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      companyId: 'company_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      companyId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListRtopCompanyRelatedResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // node
  companies?: RtopRiskGeneNode[];
  // 返回码
  // 
  responseCode?: string;
  // 是否调用成功
  // 
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      companies: 'companies',
      responseCode: 'response_code',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      companies: { 'type': 'array', 'itemType': RtopRiskGeneNode },
      responseCode: 'string',
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRtopTagImageRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 企业ID
  companyId: string;
  // 标签ID
  tagId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      companyId: 'company_id',
      tagId: 'tag_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      companyId: 'string',
      tagId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRtopTagImageResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 标签图片列表
  riskImages?: RtopTagImage[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      riskImages: 'risk_images',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      riskImages: { 'type': 'array', 'itemType': RtopTagImage },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListRtopStarCompanyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 页码
  pageNo: number;
  // 一页条数
  pageSize: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      pageNo: 'page_no',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      pageNo: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListRtopStarCompanyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 企业列表
  companyInfos?: RtopStarCompanyInfo[];
  // 页码
  pageNo?: number;
  // 一页条数
  pageSize?: number;
  // 总的记录数
  totalCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      companyInfos: 'company_infos',
      pageNo: 'page_no',
      pageSize: 'page_size',
      totalCount: 'total_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      companyInfos: { 'type': 'array', 'itemType': RtopStarCompanyInfo },
      pageNo: 'number',
      pageSize: 'number',
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRpSecurityPolicyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 风险类型：表示风险处理或风险咨询——process/advice
  riskType: string;
  // security_scene
  securityScene: SecurityScene;
  // service_context
  serviceContext: ServiceContext;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      riskType: 'risk_type',
      securityScene: 'security_scene',
      serviceContext: 'service_context',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      riskType: 'string',
      securityScene: SecurityScene,
      serviceContext: ServiceContext,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRpSecurityPolicyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 模型结果详情
  // 
  modelDetails?: ModelDetails[];
  // 反馈成功之后的id
  securityId?: string;
  // 安全处理结果，枚举值为：reject[拒绝],validate[校验],accept[放过]
  securityResult?: string;
  // 策略结果详情
  // 
  strategyDetails?: StrategyDetails[];
  // 决策流信息
  dfSceneInfos?: DfSceneInfos;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      modelDetails: 'model_details',
      securityId: 'security_id',
      securityResult: 'security_result',
      strategyDetails: 'strategy_details',
      dfSceneInfos: 'df_scene_infos',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      modelDetails: { 'type': 'array', 'itemType': ModelDetails },
      securityId: 'string',
      securityResult: 'string',
      strategyDetails: { 'type': 'array', 'itemType': StrategyDetails },
      dfSceneInfos: DfSceneInfos,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySnapshotEventRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 事件id
  eventId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      eventId: 'event_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      eventId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySnapshotEventResponse extends $tea.Model {
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

export class ApplyTdiquickmsgRtBatchmarketingRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 场景策略id
  sceneStrategyId: number;
  // 	
  // 外部流水号
  outSerialNo: string;
  // 	
  // 用户标识类型
  paramType: string;
  // 批量透传字段
  outInfo?: string;
  // 用户凭证列表
  customerDetails: CustomerDetail[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      sceneStrategyId: 'scene_strategy_id',
      outSerialNo: 'out_serial_no',
      paramType: 'param_type',
      outInfo: 'out_info',
      customerDetails: 'customer_details',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      sceneStrategyId: 'number',
      outSerialNo: 'string',
      paramType: 'string',
      outInfo: 'string',
      customerDetails: { 'type': 'array', 'itemType': CustomerDetail },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyTdiquickmsgRtBatchmarketingResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 批次流水号
  bizId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      bizId: 'biz_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      bizId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyTdiquickmsgRobotcallRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 外部流水号
  outSerialNo: string;
  // 场景策略id
  sceneStrategyId: number;
  // 客户透传字段
  outInfo?: string;
  // 用户参数类型
  paramTemplate: string;
  // 每个手机号的详细参数
  customerDetails: RobotCallCustomerParam;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      outSerialNo: 'out_serial_no',
      sceneStrategyId: 'scene_strategy_id',
      outInfo: 'out_info',
      paramTemplate: 'param_template',
      customerDetails: 'customer_details',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      outSerialNo: 'string',
      sceneStrategyId: 'number',
      outInfo: 'string',
      paramTemplate: 'string',
      customerDetails: RobotCallCustomerParam,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyTdiquickmsgRobotcallResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 呼叫记录id
  callId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      callId: 'call_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      callId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CallbackTdiquickmsgSmsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 短信回执类型
  // 
  type: string;
  // 手机号码
  // 
  phoneNumber: string;
  // 发送时间
  sendTime: string;
  // 状态报告时间
  reportTime: string;
  // 是否接收成功。取值：true：接收成功false：接收失败
  success: boolean;
  // 状态报告编码
  errCode: string;
  // 状态报告说明
  // 
  errMsg: string;
  // 短信长度
  smsSize: string;
  // 发送回执ID，即发送流水号
  bizId: string;
  // 业务扩展字段，回执时透传，JSON格式
  bizProperties: string;
  // 发送卡片短信时，文本短信状态报告中才会有该字段，且取值为CARD_SMS，发送纯文本短信时，状态报告中没有该字段
  smsType?: string;
  // 运营商
  serviceProvider: string;
  // 手机号码所属城市
  city?: string;
  // 手机号模版类型
  keyTemplate?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      type: 'type',
      phoneNumber: 'phone_number',
      sendTime: 'send_time',
      reportTime: 'report_time',
      success: 'success',
      errCode: 'err_code',
      errMsg: 'err_msg',
      smsSize: 'sms_size',
      bizId: 'biz_id',
      bizProperties: 'biz_properties',
      smsType: 'sms_type',
      serviceProvider: 'service_provider',
      city: 'city',
      keyTemplate: 'key_template',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      type: 'string',
      phoneNumber: 'string',
      sendTime: 'string',
      reportTime: 'string',
      success: 'boolean',
      errCode: 'string',
      errMsg: 'string',
      smsSize: 'string',
      bizId: 'string',
      bizProperties: 'string',
      smsType: 'string',
      serviceProvider: 'string',
      city: 'string',
      keyTemplate: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CallbackTdiquickmsgSmsResponse extends $tea.Model {
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

export class CallbackTdiquickmsgRobotcallRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 外呼号码，支持密文
  customerKey: string;
  // 当前呼叫次数 Integer
  currentCallTimes: number;
  // 号码的模版类型
  keyTemplate: string;
  // 导入号码时返回的批次号
  batchId: string;
  // 外呼类型 建议按照如下约定给到 2001:批量-预测外呼 2002:批量-AI外呼-不转人工 2003:批量-AI外呼-接通转人工 2004: 批量-AI外呼-智能转人工 2005:批量-语音通知
  callType: number;
  // 用户自定义标签
  tag?: string;
  // 外呼呼叫实例id
  callId: string;
  // 外呼任务编号
  taskId: number;
  // 外呼任务名称
  taskName: string;
  // 外呼的话术模板ID，可以为空
  templateId?: number;
  // 外呼状态编码
  statusCode: number;
  // 外呼状态编码对应描述
  statusDescription: string;
  // 转人工状态编码
  transferStatusCode: string;
  // 转人工状态编码对应描述
  transferStatus: string;
  // 分配坐席ID,可以为空
  agentId?: number;
  // 建议填写坐席在贵司业务系统唯一标识，用于查询对应agentId；可以为空。
  agentTag?: string;
  // 坐席分机号，可以为空
  agentExtension?: string;
  // 导入时间，格式:2019-01-09 14:14:19
  importTime: string;
  // 开始通话时间，格式：2019-01-09 14:14:19
  callBeginTime: string;
  // 振铃时长,单位毫秒
  ringTime: number;
  // 接通时间
  answerTime?: string;
  // 通话时长，单位：大于1分钟，显示分钟秒，小于1分钟，显示秒
  speakingTime: string;
  // 通话时长，单位：秒
  speakingDuration: number;
  // 通话挂断时间
  hangupTime: string;
  // 对话轮次
  speakingTurns: number;
  // 坐席通话时长，单位：大于1分钟，显示分钟秒，小于1分钟，显示秒
  agentSpeakingTime: string;
  // 坐席通话时长，单位：秒
  agentSpeakingDuration: number;
  // 意向标签
  intentTag: string;
  // 意向说明
  intentDescription: string;
  // 个性标签
  individualTag?: string;
  // 回复关键词
  keywords?: string;
  // 挂机方式
  hungupType: number;
  // 挂机短信，1:发送，2:不发送
  sms: number;
  // 对话录音,url
  chatRecord?: string;
  // 对话记录
  chats?: string;
  // 0:不添加，1:添加
  addWx?: number;
  // 加微进度可选值：已申请、加微成功
  addWxStatus?: string;
  // 是否接通重呼 0正常外呼，1接通重呼
  answerRecall: number;
  // 导入号码时的参数值
  properties?: string;
  // 导入号码时的业务参数值
  bizProperties?: string;
  // 拦截原因 可选值：黑名单拦截，灰名单拦截，异常号码拦截
  interceptReason?: string;
  // 回调冗余字段
  extInfo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      customerKey: 'customer_key',
      currentCallTimes: 'current_call_times',
      keyTemplate: 'key_template',
      batchId: 'batch_id',
      callType: 'call_type',
      tag: 'tag',
      callId: 'call_id',
      taskId: 'task_id',
      taskName: 'task_name',
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
      extInfo: 'ext_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      customerKey: 'string',
      currentCallTimes: 'number',
      keyTemplate: 'string',
      batchId: 'string',
      callType: 'number',
      tag: 'string',
      callId: 'string',
      taskId: 'number',
      taskName: 'string',
      templateId: 'number',
      statusCode: 'number',
      statusDescription: 'string',
      transferStatusCode: 'string',
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
      sms: 'number',
      chatRecord: 'string',
      chats: 'string',
      addWx: 'number',
      addWxStatus: 'string',
      answerRecall: 'number',
      properties: 'string',
      bizProperties: 'string',
      interceptReason: 'string',
      extInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CallbackTdiquickmsgRobotcallResponse extends $tea.Model {
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

export class CallbackTdiquickmsgSmsUpRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 回执类型
  type: string;
  // 手机号码
  phoneNumber: string;
  // 发送时间
  sendTime: string;
  // 发送内容
  content: string;
  // 签名信息
  signName: string;
  // 签名对应的客户ak
  appKey: string;
  // 行短信扩展号码
  destCode: string;
  // 序列号
  sequenceId: number;
  // 手机号模版类型
  keyTemplate?: string;
  // 原始手机号模版类型
  originKeyTemplate?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      type: 'type',
      phoneNumber: 'phone_number',
      sendTime: 'send_time',
      content: 'content',
      signName: 'sign_name',
      appKey: 'app_key',
      destCode: 'dest_code',
      sequenceId: 'sequence_id',
      keyTemplate: 'key_template',
      originKeyTemplate: 'origin_key_template',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      type: 'string',
      phoneNumber: 'string',
      sendTime: 'string',
      content: 'string',
      signName: 'string',
      appKey: 'string',
      destCode: 'string',
      sequenceId: 'number',
      keyTemplate: 'string',
      originKeyTemplate: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CallbackTdiquickmsgSmsUpResponse extends $tea.Model {
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

export class QueryTdiquickmsgRobotcallStatisticinfoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 场景策略id
  sceneStrategyId: number;
  // 客户透传字段
  outInfo: string;
  // 分流字段，行业标签区分哈啰流量归属于umkt或qmp
  industryTag?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      sceneStrategyId: 'scene_strategy_id',
      outInfo: 'out_info',
      industryTag: 'industry_tag',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      sceneStrategyId: 'number',
      outInfo: 'string',
      industryTag: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTdiquickmsgRobotcallStatisticinfoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 全量手机号数量
  totalCount?: number;
  // 累计拨打次数
  callCount?: number;
  // 已经拨打的手机号数量
  calleeCount?: string;
  // 已拨打次数中接通的数量
  connectCount?: number;
  // 拨打率
  callRate?: string;
  // 接通率
  connectRate?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      totalCount: 'total_count',
      callCount: 'call_count',
      calleeCount: 'callee_count',
      connectCount: 'connect_count',
      callRate: 'call_rate',
      connectRate: 'connect_rate',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      totalCount: 'number',
      callCount: 'number',
      calleeCount: 'string',
      connectCount: 'number',
      callRate: 'string',
      connectRate: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushTdiquickmsgBackflowEventRequest extends $tea.Model {
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

export class PushTdiquickmsgBackflowEventResponse extends $tea.Model {
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

export class PushTdiquickmsgBackflowJsondataRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 回流事件id，对应租户回流事件id
  eventId: number;
  // 回流事件记录列表
  eventRecords: string;
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
      eventRecords: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushTdiquickmsgBackflowJsondataResponse extends $tea.Model {
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

export class QueryTdisaasSecurityPolicyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 风控事件咨询查询入参
  eventInfo: EventInfo;
  // 请求处理方式
  riskType: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      eventInfo: 'event_info',
      riskType: 'risk_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      eventInfo: EventInfo,
      riskType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTdisaasSecurityPolicyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 场景分
  modelDetails?: ModelDetails[];
  // 安全请求id
  securityId?: string;
  // 策略结果
  securityResult?: string;
  // 策略结果详情
  strategyDetails?: StrategyDetails[];
  // 决策流信息
  dfSceneInfos?: DfSceneInfos[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      modelDetails: 'model_details',
      securityId: 'security_id',
      securityResult: 'security_result',
      strategyDetails: 'strategy_details',
      dfSceneInfos: 'df_scene_infos',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      modelDetails: { 'type': 'array', 'itemType': ModelDetails },
      securityId: 'string',
      securityResult: 'string',
      strategyDetails: { 'type': 'array', 'itemType': StrategyDetails },
      dfSceneInfos: { 'type': 'array', 'itemType': DfSceneInfos },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadUmktParamsFileRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // file_id
  fileObject?: Readable;
  fileObjectName?: string;
  fileId: string;
  // 场景策略id
  sceneStrategyId: number;
  // 预计执行时间，不设置则为立即执行
  execTime?: string;
  // 支持不同的文件模版：
  // MOBILE_MD5_WITH_MS_VARIABLE、MOBILE_MD5
  // 后续支持
  // DEVICE_MD5
  fileTemplate: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      fileObject: 'fileObject',
      fileObjectName: 'fileObjectName',
      fileId: 'file_id',
      sceneStrategyId: 'scene_strategy_id',
      execTime: 'exec_time',
      fileTemplate: 'file_template',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      fileObject: 'Readable',
      fileObjectName: 'string',
      fileId: 'string',
      sceneStrategyId: 'number',
      execTime: 'string',
      fileTemplate: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadUmktParamsFileResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 上传后返回的任务id
  taskId?: number;
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
      taskId: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchqueryUmktRtMarketingRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 场景营销策略id
  sceneStrategyId: number;
  // 用户列表传输模版
  queryTemplate?: string;
  // 用户查询凭证列表
  customerKeys: string[];
  // 业务方流水号
  bizSerialNo: string;
  // 访问类型，PROD/TEST，正式流量/测试流量
  visitType?: string;
  // 圈客阈值干预参数，json-map格式
  bizProperties?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      sceneStrategyId: 'scene_strategy_id',
      queryTemplate: 'query_template',
      customerKeys: 'customer_keys',
      bizSerialNo: 'biz_serial_no',
      visitType: 'visit_type',
      bizProperties: 'biz_properties',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      sceneStrategyId: 'number',
      queryTemplate: 'string',
      customerKeys: { 'type': 'array', 'itemType': 'string' },
      bizSerialNo: 'string',
      visitType: 'string',
      bizProperties: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchqueryUmktRtMarketingResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 处理是否成功
  success?: boolean;
  // 实时营销单条结果
  queryResult?: CustomerUmktInfoModel[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      queryResult: 'query_result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
      queryResult: { 'type': 'array', 'itemType': CustomerUmktInfoModel },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncUmktRtEventresultRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 详细事件明细
  detail: EventResultSyncDetail[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      detail: 'detail',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      detail: { 'type': 'array', 'itemType': EventResultSyncDetail },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncUmktRtEventresultResponse extends $tea.Model {
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

export class ImportUmktSceneUploadRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 需要刷新的key
  key: string;
  // 需要刷新的value，可能是json格式
  value: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      key: 'key',
      value: 'value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      key: 'string',
      value: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportUmktSceneUploadResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 请求结果
  success?: boolean;
  // 场景构建结果体
  uploadResult?: StrategyUploadResult;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      uploadResult: 'upload_result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
      uploadResult: StrategyUploadResult,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchqueryUmktRtTailmarketingRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 营销计划id
  planId: string;
  // 	
  // 用户列表传输模版
  queryTemplate: string;
  // 	
  // 用户查询凭证列表
  customerKeys: string[];
  // 业务方流水号
  bizSerialNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      planId: 'plan_id',
      queryTemplate: 'query_template',
      customerKeys: 'customer_keys',
      bizSerialNo: 'biz_serial_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      planId: 'string',
      queryTemplate: 'string',
      customerKeys: { 'type': 'array', 'itemType': 'string' },
      bizSerialNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchqueryUmktRtTailmarketingResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 	
  // 实时营销单条结果
  queryResult?: CustomerUmktInfoModel[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      queryResult: 'query_result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      queryResult: { 'type': 'array', 'itemType': CustomerUmktInfoModel },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryUmktScenestrategyTestRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 场景策略id
  sceneStrategyId: number;
  // 查询模版
  queryTemplate?: string;
  // 用户查询凭证列表
  // 
  customerKeys: string[];
  // 业务方流水号
  bizSerialNo: string;
  // 伪装租户id
  pretendTenant: string;
  // 圈客接口类型
  interfaceType?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      sceneStrategyId: 'scene_strategy_id',
      queryTemplate: 'query_template',
      customerKeys: 'customer_keys',
      bizSerialNo: 'biz_serial_no',
      pretendTenant: 'pretend_tenant',
      interfaceType: 'interface_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      sceneStrategyId: 'number',
      queryTemplate: 'string',
      customerKeys: { 'type': 'array', 'itemType': 'string' },
      bizSerialNo: 'string',
      pretendTenant: 'string',
      interfaceType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryUmktScenestrategyTestResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 处理结果
  success?: boolean;
  // 实时营销单条结果
  queryResult?: CustomerUmktInfoModel[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      queryResult: 'query_result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
      queryResult: { 'type': 'array', 'itemType': CustomerUmktInfoModel },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyUmktRobotcallRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 外部流水号
  outSerialNo: string;
  // 场景策略id
  sceneStrategyId: number;
  // 客户透传字段
  outInfo?: string;
  // 用户参数类型
  paramTemplate: string;
  // 每个手机号的详细参数
  customerDetails?: RobotCallCustomerParam[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      outSerialNo: 'out_serial_no',
      sceneStrategyId: 'scene_strategy_id',
      outInfo: 'out_info',
      paramTemplate: 'param_template',
      customerDetails: 'customer_details',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      outSerialNo: 'string',
      sceneStrategyId: 'number',
      outInfo: 'string',
      paramTemplate: 'string',
      customerDetails: { 'type': 'array', 'itemType': RobotCallCustomerParam },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyUmktRobotcallResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 呼叫记录id
  callId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      callId: 'call_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      callId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryUmktDataaccessStatisticRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 查询回执统计的任务id
  taskId: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      taskId: 'task_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      taskId: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryUmktDataaccessStatisticResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 回执统计结果
  statisticResult?: StatisticResult;
  // 任务状态
  taskStatus?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      statisticResult: 'statistic_result',
      taskStatus: 'task_status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      statisticResult: StatisticResult,
      taskStatus: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelUmktDataaccessOfflinetaskRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 离线批量任务id
  taskId: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      taskId: 'task_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      taskId: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelUmktDataaccessOfflinetaskResponse extends $tea.Model {
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

export class QueryUmktRtMarketingRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 场景策略id，决策重点
  sceneStrategyId: number;
  // 用户凭证模版
  queryTemplate: string;
  // 用户查询凭证
  customerKey: string;
  // 业务流水号
  bizSerialNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      sceneStrategyId: 'scene_strategy_id',
      queryTemplate: 'query_template',
      customerKey: 'customer_key',
      bizSerialNo: 'biz_serial_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      sceneStrategyId: 'number',
      queryTemplate: 'string',
      customerKey: 'string',
      bizSerialNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryUmktRtMarketingResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 实时单个营销结果
  queryResult?: CustomerUmktInfoModel;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      queryResult: 'query_result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      queryResult: CustomerUmktInfoModel,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushUmktBackflowEventRequest extends $tea.Model {
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

export class PushUmktBackflowEventResponse extends $tea.Model {
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

export class SendUmktCardsmsBatchRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // cpassAccessKey
  cpassAk?: string;
  // 行业标签
  industryTag: string;
  // 卡片短信模板
  cardTemplateCode: string;
  // {}
  cardTemplateParamJson: string;
  // ["13455","76898"]
  phoneNumberJson: string;
  // ["蚂蚁营销"]
  signNameJson: string;
  // 上行短信扩展码
  smsUpExtendCodeJson?: string;
  // 回落类型
  fallbackType?: string;
  // 回落短信模版
  fallbackTemplateCode?: string;
  // 回落短信模版参数
  fallbackTemplateParamJson?: string;
  // 卡片短信对应的原始文本短信模板，不传则用默认文本
  templateCode?: string;
  // 默认文本对应参数
  templateParamJson?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      cpassAk: 'cpass_ak',
      industryTag: 'industry_tag',
      cardTemplateCode: 'card_template_code',
      cardTemplateParamJson: 'card_template_param_json',
      phoneNumberJson: 'phone_number_json',
      signNameJson: 'sign_name_json',
      smsUpExtendCodeJson: 'sms_up_extend_code_json',
      fallbackType: 'fallback_type',
      fallbackTemplateCode: 'fallback_template_code',
      fallbackTemplateParamJson: 'fallback_template_param_json',
      templateCode: 'template_code',
      templateParamJson: 'template_param_json',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      cpassAk: 'string',
      industryTag: 'string',
      cardTemplateCode: 'string',
      cardTemplateParamJson: 'string',
      phoneNumberJson: 'string',
      signNameJson: 'string',
      smsUpExtendCodeJson: 'string',
      fallbackType: 'string',
      fallbackTemplateCode: 'string',
      fallbackTemplateParamJson: 'string',
      templateCode: 'string',
      templateParamJson: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SendUmktCardsmsBatchResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 卡片短信回执id
  bizCardId?: string;
  // 支持的手机号
  mediaMobiles?: string;
  // 不支持的手机号
  notMediaMobiles?: string;
  // 回落文本短信回执id
  bizId?: string;
  // 回落数字短信回执id
  bizDigitalId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      bizCardId: 'biz_card_id',
      mediaMobiles: 'media_mobiles',
      notMediaMobiles: 'not_media_mobiles',
      bizId: 'biz_id',
      bizDigitalId: 'biz_digital_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      bizCardId: 'string',
      mediaMobiles: 'string',
      notMediaMobiles: 'string',
      bizId: 'string',
      bizDigitalId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryUmktCardsmsSupportRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // cpassAccessKey
  cpassAk?: string;
  // 行业标签
  industryTag: string;
  // 卡片短信模板
  templateCode: string;
  // 手机号
  mobiles: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      cpassAk: 'cpass_ak',
      industryTag: 'industry_tag',
      templateCode: 'template_code',
      mobiles: 'mobiles',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      cpassAk: 'string',
      industryTag: 'string',
      templateCode: 'string',
      mobiles: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryUmktCardsmsSupportResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 手机号卡片短信支持信息
  datas?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      datas: 'datas',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      datas: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SendUmktTextsmsBatchRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // cpassAccessKey
  cpassAk?: string;
  // 行业标签
  industryTag: string;
  // 手机号json
  phoneNumberJson: string;
  // 签名信息
  signNameJson: string;
  // 文本短信模板code
  templateCode: string;
  // 文本短信模板参数
  templateParamJson: string;
  // 上行短信扩展码
  smsUpExtendCodeJson?: string;
  // 透传字段
  outId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      cpassAk: 'cpass_ak',
      industryTag: 'industry_tag',
      phoneNumberJson: 'phone_number_json',
      signNameJson: 'sign_name_json',
      templateCode: 'template_code',
      templateParamJson: 'template_param_json',
      smsUpExtendCodeJson: 'sms_up_extend_code_json',
      outId: 'out_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      cpassAk: 'string',
      industryTag: 'string',
      phoneNumberJson: 'string',
      signNameJson: 'string',
      templateCode: 'string',
      templateParamJson: 'string',
      smsUpExtendCodeJson: 'string',
      outId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SendUmktTextsmsBatchResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 回执id
  bizId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      bizId: 'biz_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      bizId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SendUmktDigitalsmsBatchRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // cpassAccessKey
  cpassAk?: string;
  // 行业标签
  industryTag: string;
  // 手机号列表以,分隔
  phoneNumbers: string;
  // 数字短信模板code
  templateCode: string;
  // 短信模板参数
  templateParam: string;
  // 透传字段
  outId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      cpassAk: 'cpass_ak',
      industryTag: 'industry_tag',
      phoneNumbers: 'phone_numbers',
      templateCode: 'template_code',
      templateParam: 'template_param',
      outId: 'out_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      cpassAk: 'string',
      industryTag: 'string',
      phoneNumbers: 'string',
      templateCode: 'string',
      templateParam: 'string',
      outId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SendUmktDigitalsmsBatchResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 回执id
  bizId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      bizId: 'biz_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      bizId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryUmktCpaassmsTemplateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 短信类型
  smsType: string;
  // 行业标签
  tenantIndustry: string;
  // 审批状态
  status?: string;
  // 页码
  pageNum?: number;
  // 每页记录数量
  pageSize?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      smsType: 'sms_type',
      tenantIndustry: 'tenant_industry',
      status: 'status',
      pageNum: 'page_num',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      smsType: 'string',
      tenantIndustry: 'string',
      status: 'string',
      pageNum: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryUmktCpaassmsTemplateResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 总数
  total?: number;
  // 每页记录数
  pageSize?: number;
  // 页码
  pageNum?: number;
  // 模板列表
  cpassSmsTemplates?: CpaasSmsTemplate[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      total: 'total',
      pageSize: 'page_size',
      pageNum: 'page_num',
      cpassSmsTemplates: 'cpass_sms_templates',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      total: 'number',
      pageSize: 'number',
      pageNum: 'number',
      cpassSmsTemplates: { 'type': 'array', 'itemType': CpaasSmsTemplate },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchqueryUmktRtMixedmarketingRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 场景策略id列表
  sceneStrategyIds: number[];
  // 场景策略集合code，对标场景策略id列表，一般不可变
  sceneStrategySetCode?: string;
  // 查询协议模版
  queryTemplate: string;
  // 查询的用户凭证列表
  customerKeys: string[];
  // 业务流水号，uuid
  bizSerialNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      sceneStrategyIds: 'scene_strategy_ids',
      sceneStrategySetCode: 'scene_strategy_set_code',
      queryTemplate: 'query_template',
      customerKeys: 'customer_keys',
      bizSerialNo: 'biz_serial_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      sceneStrategyIds: { 'type': 'array', 'itemType': 'number' },
      sceneStrategySetCode: 'string',
      queryTemplate: 'string',
      customerKeys: { 'type': 'array', 'itemType': 'string' },
      bizSerialNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchqueryUmktRtMixedmarketingResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 查询结果
  queryResults?: CustomerUmktInfosModel[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      queryResults: 'query_results',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      queryResults: { 'type': 'array', 'itemType': CustomerUmktInfosModel },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyUmktPhonenumberstatusforsmsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 12345
  customerKey: string;
  // 用户模版类型
  paramTemplate: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      customerKey: 'customer_key',
      paramTemplate: 'param_template',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      customerKey: 'string',
      paramTemplate: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyUmktPhonenumberstatusforsmsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 12345
  customerKey?: string;
  // 用户凭证状态
  status?: string;
  // 号码当前归属的基础运营商
  carrier?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      customerKey: 'customer_key',
      status: 'status',
      carrier: 'carrier',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      customerKey: 'string',
      status: 'string',
      carrier: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchqueryUmktRtTopnRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 场景策略id
  sceneStrategyId: number;
  // 用户列表传输模版
  queryTemplate: string;
  // 用户凭证信息
  customerKeys: string[];
  // 业务流水号
  bizSerialNo: string;
  // 访问类型，PROD/TEST，正式流量/测试流量
  visitType: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      sceneStrategyId: 'scene_strategy_id',
      queryTemplate: 'query_template',
      customerKeys: 'customer_keys',
      bizSerialNo: 'biz_serial_no',
      visitType: 'visit_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      sceneStrategyId: 'number',
      queryTemplate: 'string',
      customerKeys: { 'type': 'array', 'itemType': 'string' },
      bizSerialNo: 'string',
      visitType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchqueryUmktRtTopnResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 处理是否成功
  success?: boolean;
  // 实时营销单条结果
  queryResult?: CustomerUmktInfoModel[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      queryResult: 'query_result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
      queryResult: { 'type': 'array', 'itemType': CustomerUmktInfoModel },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryUmktRobotcallStatisticinfoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 场景策略id
  sceneStrategyId: number;
  // 客户透传字段
  outInfo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      sceneStrategyId: 'scene_strategy_id',
      outInfo: 'out_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      sceneStrategyId: 'number',
      outInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryUmktRobotcallStatisticinfoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 全量手机号数量
  totalCount?: number;
  // 累计拨打次数
  callCount?: number;
  // 已经拨打的手机号数量
  calleeCount?: number;
  // 已拨打次数中接通的数量
  connectCount?: number;
  // 拨打率
  callRate?: string;
  // 接通率
  connectRate?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      totalCount: 'total_count',
      callCount: 'call_count',
      calleeCount: 'callee_count',
      connectCount: 'connect_count',
      callRate: 'call_rate',
      connectRate: 'connect_rate',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      totalCount: 'number',
      callCount: 'number',
      calleeCount: 'number',
      connectCount: 'number',
      callRate: 'string',
      connectRate: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryUmktTenantActionplaninfoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 页码
  pageNum?: number;
  // 页容量
  pageSize?: number;
  // 渠道code
  channelType: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      pageNum: 'page_num',
      pageSize: 'page_size',
      channelType: 'channel_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      pageNum: 'number',
      pageSize: 'number',
      channelType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryUmktTenantActionplaninfoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 租户策略信息列表
  queryResult?: TenantActionPlanInfo[];
  // 页码
  pageNum?: number;
  // 页容量
  pageSize?: number;
  // 总量
  totalCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      queryResult: 'query_result',
      pageNum: 'page_num',
      pageSize: 'page_size',
      totalCount: 'total_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      queryResult: { 'type': 'array', 'itemType': TenantActionPlanInfo },
      pageNum: 'number',
      pageSize: 'number',
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryUmktRobotcallDetailRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 批次号
  bizId: string;
  // 手机号
  phoneNumber: string;
  // 手机号类型
  templateType: string;
  // 场景策略id
  sceneStrategyId: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizId: 'biz_id',
      phoneNumber: 'phone_number',
      templateType: 'template_type',
      sceneStrategyId: 'scene_strategy_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizId: 'string',
      phoneNumber: 'string',
      templateType: 'string',
      sceneStrategyId: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryUmktRobotcallDetailResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 请求时的透传字段
  outInfo?: string;
  // 请求时每个手机号的透传字段
  customerOutInfo?: string;
  // 外呼记录列表
  callInfo?: AICallbackMessage[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      outInfo: 'out_info',
      customerOutInfo: 'customer_out_info',
      callInfo: 'call_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      outInfo: 'string',
      customerOutInfo: 'string',
      callInfo: { 'type': 'array', 'itemType': AICallbackMessage },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyUmktRealtimemarketingRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 营销盾内部租户下的子租户
  subTenantId?: string;
  // 	
  // 场景策略id
  sceneStrategyId: number;
  // 外部流水号
  outSerialNo: string;
  // 	
  // 用户参数类型
  paramType: string;
  // 触达渠道配置
  channelParams?: string;
  // 扩展字段
  extInfo?: string;
  // 手机号/手机号md5
  customerKey: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      subTenantId: 'sub_tenant_id',
      sceneStrategyId: 'scene_strategy_id',
      outSerialNo: 'out_serial_no',
      paramType: 'param_type',
      channelParams: 'channel_params',
      extInfo: 'ext_info',
      customerKey: 'customer_key',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      subTenantId: 'string',
      sceneStrategyId: 'number',
      outSerialNo: 'string',
      paramType: 'string',
      channelParams: 'string',
      extInfo: 'string',
      customerKey: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyUmktRealtimemarketingResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回流水id
  bizId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      bizId: 'biz_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      bizId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyUmktRtBatchmarketingRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 场景策略id
  sceneStrategyId: number;
  // 外部流水号
  outSerialNo: string;
  // 用户标识类型
  paramType: string;
  // 批量透传字段
  outInfo?: string;
  // 用户凭证列表
  customerDetails: CustomerDetail[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      sceneStrategyId: 'scene_strategy_id',
      outSerialNo: 'out_serial_no',
      paramType: 'param_type',
      outInfo: 'out_info',
      customerDetails: 'customer_details',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      sceneStrategyId: 'number',
      outSerialNo: 'string',
      paramType: 'string',
      outInfo: 'string',
      customerDetails: { 'type': 'array', 'itemType': CustomerDetail },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyUmktRtBatchmarketingResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 批次流水号
  bizId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      bizId: 'biz_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      bizId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CallbackUmktRobotcallRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 外呼号码，支持密文
  customerKey: string;
  // 当前呼叫次数	     Integer
  currentCallTimes: number;
  // 号码的模版类型
  keyTemplate: string;
  // 导入号码时返回的批次号
  batchId: string;
  // 外呼类型
  // 建议按照如下约定给到
  // 2001:批量-预测外呼
  // 2002:批量-AI外呼-不转人工
  // 2003:批量-AI外呼-接通转人工
  // 2004: 批量-AI外呼-智能转人工
  // 2005:批量-语音通知
  callType: number;
  // 用户自定义标签
  tag?: string;
  // 外呼呼叫实例id
  callId: string;
  // 外呼任务编号
  taskId: number;
  // 外呼任务名称
  taskName: string;
  // 外呼的话术模板ID，可以为空
  templateId?: number;
  // 外呼状态编码
  statusCode: number;
  // 外呼状态编码对应描述
  statusDescription: string;
  // 转人工状态编码
  transferStatusCode: string;
  // 转人工状态编码对应描述
  transferStatus: string;
  // 分配坐席ID,可以为空
  agentId?: number;
  // 建议填写坐席在贵司业务系统唯一标识，用于查询对应agentId；可以为空。
  agentTag?: string;
  // 坐席分机号，可以为空
  agentExtension?: string;
  // 导入时间，格式:2019-01-09 14:14:19
  importTime: string;
  // 开始通话时间，格式：2019-01-09 14:14:19
  callBeginTime: string;
  // 振铃时长,单位毫秒
  ringTime: number;
  // 接通时间
  answerTime?: string;
  // 通话时长，单位：大于1分钟，显示分钟秒，小于1分钟，显示秒
  speakingTime: string;
  // 通话时长，单位：秒
  speakingDuration: number;
  // 通话挂断时间
  hangupTime: string;
  // 对话轮次
  speakingTurns: number;
  // 坐席通话时长，单位：大于1分钟，显示分钟秒，小于1分钟，显示秒
  agentSpeakingTime: string;
  // 坐席通话时长，单位：秒
  agentSpeakingDuration: number;
  // 意向标签
  intentTag: string;
  // 意向说明
  intentDescription: string;
  // 个性标签
  individualTag?: string;
  // 回复关键词
  keywords?: string;
  // 挂机方式
  hungupType: number;
  // 挂机短信，1:发送，2:不发送
  sms: number;
  // 对话录音,url
  chatRecord?: string;
  // 对话记录
  chats?: string;
  // 0:不添加，1:添加
  addWx?: number;
  // 加微进度可选值：已申请、加微成功
  addWxStatus?: string;
  // 是否接通重呼 0正常外呼，1接通重呼
  answerRecall: number;
  // 导入号码时的参数值
  properties?: string;
  // 导入号码时的业务参数值
  bizProperties?: string;
  // 拦截原因 可选值：黑名单拦截，灰名单拦截，异常号码拦截
  interceptReason?: string;
  // 回调冗余字段
  extInfo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      customerKey: 'customer_key',
      currentCallTimes: 'current_call_times',
      keyTemplate: 'key_template',
      batchId: 'batch_id',
      callType: 'call_type',
      tag: 'tag',
      callId: 'call_id',
      taskId: 'task_id',
      taskName: 'task_name',
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
      extInfo: 'ext_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      customerKey: 'string',
      currentCallTimes: 'number',
      keyTemplate: 'string',
      batchId: 'string',
      callType: 'number',
      tag: 'string',
      callId: 'string',
      taskId: 'number',
      taskName: 'string',
      templateId: 'number',
      statusCode: 'number',
      statusDescription: 'string',
      transferStatusCode: 'string',
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
      sms: 'number',
      chatRecord: 'string',
      chats: 'string',
      addWx: 'number',
      addWxStatus: 'string',
      answerRecall: 'number',
      properties: 'string',
      bizProperties: 'string',
      interceptReason: 'string',
      extInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CallbackUmktRobotcallResponse extends $tea.Model {
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

export class CallbackUmktSmsUpRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 回执类型
  type: string;
  // 手机号码
  phoneNumber: string;
  // 发送时间
  sendTime: string;
  // 发送内容
  content: string;
  // 签名信息
  signName: string;
  // 签名对应的客户ak
  appKey: string;
  // 上行短信扩展号码
  destCode: string;
  // 学历噩耗
  sequenceId: number;
  // 手机号模版类型
  keyTemplate?: string;
  // 原始手机号模版类型
  originKeyTemplate?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      type: 'type',
      phoneNumber: 'phone_number',
      sendTime: 'send_time',
      content: 'content',
      signName: 'sign_name',
      appKey: 'app_key',
      destCode: 'dest_code',
      sequenceId: 'sequence_id',
      keyTemplate: 'key_template',
      originKeyTemplate: 'origin_key_template',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      type: 'string',
      phoneNumber: 'string',
      sendTime: 'string',
      content: 'string',
      signName: 'string',
      appKey: 'string',
      destCode: 'string',
      sequenceId: 'number',
      keyTemplate: 'string',
      originKeyTemplate: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CallbackUmktSmsUpResponse extends $tea.Model {
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

export class CallbackUmktSmsReportRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 短信回执类型
  type: string;
  // 手机号码
  phoneNumber: string;
  // 发送时间
  sendTime: string;
  // 状态报告时间
  reportTime: string;
  // 是否接收成功。取值：true：接收成功false：接收失败
  success: boolean;
  // 状态报告编码
  errCode: string;
  // 状态报告说明
  errMsg: string;
  // 短信长度
  smsSize: string;
  // 发送回执ID，即发送流水号
  bizId: string;
  // 业务扩展字段，回执时透传，JSON格式
  bizProperties: string;
  // 发送卡片短信时，文本短信状态报告中才会有该字段，且取值为CARD_SMS，发送纯文本短信时，状态报告中没有该字段
  smsType?: string;
  // 运营商
  serviceProvider: string;
  // 手机号码所属城市
  city?: string;
  // 手机号模版类型
  keyTemplate?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      type: 'type',
      phoneNumber: 'phone_number',
      sendTime: 'send_time',
      reportTime: 'report_time',
      success: 'success',
      errCode: 'err_code',
      errMsg: 'err_msg',
      smsSize: 'sms_size',
      bizId: 'biz_id',
      bizProperties: 'biz_properties',
      smsType: 'sms_type',
      serviceProvider: 'service_provider',
      city: 'city',
      keyTemplate: 'key_template',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      type: 'string',
      phoneNumber: 'string',
      sendTime: 'string',
      reportTime: 'string',
      success: 'boolean',
      errCode: 'string',
      errMsg: 'string',
      smsSize: 'string',
      bizId: 'string',
      bizProperties: 'string',
      smsType: 'string',
      serviceProvider: 'string',
      city: 'string',
      keyTemplate: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CallbackUmktSmsReportResponse extends $tea.Model {
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

export class BatchqueryUmktTenantActionplaninfoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 渠道类型
  contentType: string;
  // 页码
  pageNum: number;
  // 页数
  pageSize: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      contentType: 'content_type',
      pageNum: 'page_num',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      contentType: 'string',
      pageNum: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchqueryUmktTenantActionplaninfoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 触达策略信息
  queryResult?: ActionPlanDetailInfo[];
  // 总数
  totalCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      queryResult: 'query_result',
      totalCount: 'total_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      queryResult: { 'type': 'array', 'itemType': ActionPlanDetailInfo },
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchqueryUmktRobotcallDetailRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 上传外呼任务返回的callId
  bizId: string;
  // 手机号
  phoneNumbers: string[];
  // 手机号类型
  templateType: string;
  // 场景策略id
  sceneStrategyId: number;
  // 意向标签
  intentTags?: string[];
  // 开始外呼时间
  callDate?: string;
  // 结束外呼时间
  endCallDate?: string;
  // 页码
  pageNum?: number;
  // 页数
  pageSize?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizId: 'biz_id',
      phoneNumbers: 'phone_numbers',
      templateType: 'template_type',
      sceneStrategyId: 'scene_strategy_id',
      intentTags: 'intent_tags',
      callDate: 'call_date',
      endCallDate: 'end_call_date',
      pageNum: 'page_num',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizId: 'string',
      phoneNumbers: { 'type': 'array', 'itemType': 'string' },
      templateType: 'string',
      sceneStrategyId: 'number',
      intentTags: { 'type': 'array', 'itemType': 'string' },
      callDate: 'string',
      endCallDate: 'string',
      pageNum: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchqueryUmktRobotcallDetailResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 客户请求时的透传字段
  outInfo?: string;
  // 外呼记录列表
  callInfo?: CommonRobotCallDetail[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      outInfo: 'out_info',
      callInfo: 'call_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      outInfo: 'string',
      callInfo: { 'type': 'array', 'itemType': CommonRobotCallDetail },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchqueryUmktActionplanDetailRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 场景策略id
  sceneStrategyId: number[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      sceneStrategyId: 'scene_strategy_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      sceneStrategyId: { 'type': 'array', 'itemType': 'number' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchqueryUmktActionplanDetailResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 触达策略详细信息
  actionPlanDetailInfo?: ActionPlanDetailInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      actionPlanDetailInfo: 'action_plan_detail_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      actionPlanDetailInfo: { 'type': 'array', 'itemType': ActionPlanDetailInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushRiskplusUmktCommonbackflowRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户id
  tenantId: number;
  // 回流模版ID
  backFlowTemplateId: number;
  // 回流信息描述
  backFlowDesc: string;
  // 回流属性
  properties: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      backFlowTemplateId: 'back_flow_template_id',
      backFlowDesc: 'back_flow_desc',
      properties: 'properties',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'number',
      backFlowTemplateId: 'number',
      backFlowDesc: 'string',
      properties: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushRiskplusUmktCommonbackflowResponse extends $tea.Model {
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

export class PushUmktCommonDataRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 数据推送事件ID
  eventId: number;
  // 数据推送属性数据
  properties: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      eventId: 'event_id',
      properties: 'properties',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      eventId: 'number',
      properties: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushUmktCommonDataResponse extends $tea.Model {
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

export class PushUmktCustomerGroupRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 事件ID
  eventId: string;
  // 数据属性
  properties: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      eventId: 'event_id',
      properties: 'properties',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      eventId: 'string',
      properties: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushUmktCustomerGroupResponse extends $tea.Model {
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

export class BatchqueryUmktTaskDetailRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 上传外呼任务返回的callId
  bizId: string;
  // 手机号列表
  customerKeys: string[];
  // 手机号类型
  keyTemplate: string;
  // 场景策略id
  sceneStrategyId: number;
  // 开始外呼时间，只可查询最近30天的日期
  callDate?: string;
  // 结束外呼时间
  endCallDate?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizId: 'biz_id',
      customerKeys: 'customer_keys',
      keyTemplate: 'key_template',
      sceneStrategyId: 'scene_strategy_id',
      callDate: 'call_date',
      endCallDate: 'end_call_date',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizId: 'string',
      customerKeys: { 'type': 'array', 'itemType': 'string' },
      keyTemplate: 'string',
      sceneStrategyId: 'number',
      callDate: 'string',
      endCallDate: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchqueryUmktTaskDetailResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 客户请求时的透传字段
  outInfo?: string;
  // 外呼记录列表
  callInfo?: CommonRobotCallDetail[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      outInfo: 'out_info',
      callInfo: 'call_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      outInfo: 'string',
      callInfo: { 'type': 'array', 'itemType': CommonRobotCallDetail },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushUmktBackflowJsondataRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 回流事件id，对应租户回流事件id
  // 
  eventId: number;
  // 回流事件记录列表
  // 
  eventRecords: string;
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
      eventRecords: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushUmktBackflowJsondataResponse extends $tea.Model {
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

export class QueryUmktCardsmsAnalysisRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户的卡片短信模板id
  cardTemplateCode: string;
  // 手机号列表,最多10个手机号
  phoneNumberJson: string;
  // 卡片短信模板参数
  cardTemplateParamJson: string;
  // 短信签名。当前只支持填入一个签名。
  signNameJson: string;
  // 外部流水扩展字段
  outId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      cardTemplateCode: 'card_template_code',
      phoneNumberJson: 'phone_number_json',
      cardTemplateParamJson: 'card_template_param_json',
      signNameJson: 'sign_name_json',
      outId: 'out_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      cardTemplateCode: 'string',
      phoneNumberJson: 'string',
      cardTemplateParamJson: 'string',
      signNameJson: 'string',
      outId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryUmktCardsmsAnalysisResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 卡片短信解析服务业务流水id，与渲染回执中的bizId保持一致
  bizCardId?: string;
  // 不支持卡片短信的手机号，以,分隔
  notMediaMobiles?: string;
  // 卡短解析短链返回参数
  shortUrlInfos?: ShortUrlInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      bizCardId: 'biz_card_id',
      notMediaMobiles: 'not_media_mobiles',
      shortUrlInfos: 'short_url_infos',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      bizCardId: 'string',
      notMediaMobiles: 'string',
      shortUrlInfos: { 'type': 'array', 'itemType': ShortUrlInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadUmktOfflinedecisionRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 离线圈客计划id
  offlineDecisionPlanId: number;
  // 文件模版信息
  fileTemplate: string;
  // 文件id，网关文件上传自动装填
  fileObject?: Readable;
  fileObjectName?: string;
  fileId: string;
  // 非必填, 默认OFFLINE_DECISION
  relationType?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      offlineDecisionPlanId: 'offline_decision_plan_id',
      fileTemplate: 'file_template',
      fileObject: 'fileObject',
      fileObjectName: 'fileObjectName',
      fileId: 'file_id',
      relationType: 'relation_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      offlineDecisionPlanId: 'number',
      fileTemplate: 'string',
      fileObject: 'Readable',
      fileObjectName: 'string',
      fileId: 'string',
      relationType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadUmktOfflinedecisionResponse extends $tea.Model {
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

export class QueryUmktOfflinedecisionResultRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 离线圈客计划id
  offlineDecisionPlanId: number;
  // 圈客结果的产出日期
  // 格式：yyyy-MM-dd
  // 默认当前时间的前一天
  resultDate?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      offlineDecisionPlanId: 'offline_decision_plan_id',
      resultDate: 'result_date',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      offlineDecisionPlanId: 'number',
      resultDate: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryUmktOfflinedecisionResultResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 已完成的计划策略集合
  decisionPlanIdList?: number[];
  // 批次维度圈客任务结果
  taskExecBatchInfo?: UmktOfflineDecisionTaskExecBatchInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      decisionPlanIdList: 'decision_plan_id_list',
      taskExecBatchInfo: 'task_exec_batch_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      decisionPlanIdList: { 'type': 'array', 'itemType': 'number' },
      taskExecBatchInfo: { 'type': 'array', 'itemType': UmktOfflineDecisionTaskExecBatchInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DownloadUmktOfflinedecisionResultRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 离线圈客计划id
  offlineDecisionPlanId: number;
  // 圈客计划id
  decisionPlanId: number;
  // 圈客结果的产出日期
  // 格式：yyyy-MM-dd
  // 默认当前时间的前一天
  resultDate?: string;
  // 离线圈客任务id
  taskId?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      offlineDecisionPlanId: 'offline_decision_plan_id',
      decisionPlanId: 'decision_plan_id',
      resultDate: 'result_date',
      taskId: 'task_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      offlineDecisionPlanId: 'number',
      decisionPlanId: 'number',
      resultDate: 'string',
      taskId: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DownloadUmktOfflinedecisionResultResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 文件url链接
  fileUrl?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      fileUrl: 'file_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      fileUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryUmktOfflinedecisionPlandetailsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 离线圈客配置的ID
  offlineDecisionPlanId: number;
  // 执行日期
  resultDate?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      offlineDecisionPlanId: 'offline_decision_plan_id',
      resultDate: 'result_date',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      offlineDecisionPlanId: 'number',
      resultDate: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryUmktOfflinedecisionPlandetailsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 离线圈客关联计划的个数
  offlineDecisionPlanCount?: number;
  // 离线圈客计划详细
  planDetailList?: OfflineDecisionPlanDetail[];
  // 执行批次维度任务详情信息
  taskExecBatchInfo?: UmktOfflineDecisionTaskExecBatchInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      offlineDecisionPlanCount: 'offline_decision_plan_count',
      planDetailList: 'plan_detail_list',
      taskExecBatchInfo: 'task_exec_batch_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      offlineDecisionPlanCount: 'number',
      planDetailList: { 'type': 'array', 'itemType': OfflineDecisionPlanDetail },
      taskExecBatchInfo: { 'type': 'array', 'itemType': UmktOfflineDecisionTaskExecBatchInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadUmktOfflineImportrecordRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 文件上传后返回的fileId
  fileObject?: Readable;
  fileObjectName?: string;
  fileId: string;
  // 文件内手机号类型 
  fileTemplate: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      fileObject: 'fileObject',
      fileObjectName: 'fileObjectName',
      fileId: 'file_id',
      fileTemplate: 'file_template',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      fileObject: 'Readable',
      fileObjectName: 'string',
      fileId: 'string',
      fileTemplate: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadUmktOfflineImportrecordResponse extends $tea.Model {
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
          sdk_version: "1.25.5",
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
   * Description: 支付成功、退款成功、续费扣款、超时关单、签约、解约，渠道方回调结果使用
   * Summary: 权益流量业务支付签约相关通知
   */
  async receiveBenefithubRiskPay(request: ReceiveBenefithubRiskPayRequest): Promise<ReceiveBenefithubRiskPayResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.receiveBenefithubRiskPayEx(request, headers, runtime);
  }

  /**
   * Description: 支付成功、退款成功、续费扣款、超时关单、签约、解约，渠道方回调结果使用
   * Summary: 权益流量业务支付签约相关通知
   */
  async receiveBenefithubRiskPayEx(request: ReceiveBenefithubRiskPayRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ReceiveBenefithubRiskPayResponse> {
    Util.validateModel(request);
    return $tea.cast<ReceiveBenefithubRiskPayResponse>(await this.doRequest("1.0", "riskplus.benefithub.risk.pay.receive", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ReceiveBenefithubRiskPayResponse({}));
  }

  /**
   * Description: 渠道、平台方，联合登陆推送登陆通知信息
   * Summary: 渠道/平台方推送的用户登陆信息
   */
  async notifyBenefithubRiskLogin(request: NotifyBenefithubRiskLoginRequest): Promise<NotifyBenefithubRiskLoginResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.notifyBenefithubRiskLoginEx(request, headers, runtime);
  }

  /**
   * Description: 渠道、平台方，联合登陆推送登陆通知信息
   * Summary: 渠道/平台方推送的用户登陆信息
   */
  async notifyBenefithubRiskLoginEx(request: NotifyBenefithubRiskLoginRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<NotifyBenefithubRiskLoginResponse> {
    Util.validateModel(request);
    return $tea.cast<NotifyBenefithubRiskLoginResponse>(await this.doRequest("1.0", "riskplus.benefithub.risk.login.notify", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new NotifyBenefithubRiskLoginResponse({}));
  }

  /**
   * Description: 信护盾产品批量查询
   * Summary: 信护盾产品批量查询
   */
  async batchqueryCreditshieldProductInfo(request: BatchqueryCreditshieldProductInfoRequest): Promise<BatchqueryCreditshieldProductInfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchqueryCreditshieldProductInfoEx(request, headers, runtime);
  }

  /**
   * Description: 信护盾产品批量查询
   * Summary: 信护盾产品批量查询
   */
  async batchqueryCreditshieldProductInfoEx(request: BatchqueryCreditshieldProductInfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchqueryCreditshieldProductInfoResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchqueryCreditshieldProductInfoResponse>(await this.doRequest("1.0", "riskplus.creditshield.product.info.batchquery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchqueryCreditshieldProductInfoResponse({}));
  }

  /**
   * Description: 信护盾amc机构回调通用接口
   * Summary: 信护盾amc机构回调通用接口
   */
  async queryCreditshieldProductCallback(request: QueryCreditshieldProductCallbackRequest): Promise<QueryCreditshieldProductCallbackResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryCreditshieldProductCallbackEx(request, headers, runtime);
  }

  /**
   * Description: 信护盾amc机构回调通用接口
   * Summary: 信护盾amc机构回调通用接口
   */
  async queryCreditshieldProductCallbackEx(request: QueryCreditshieldProductCallbackRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryCreditshieldProductCallbackResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryCreditshieldProductCallbackResponse>(await this.doRequest("1.0", "riskplus.creditshield.product.callback.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryCreditshieldProductCallbackResponse({}));
  }

  /**
   * Description: 风控云风险咨询接口
   * Summary: 风控云风险咨询接口
   */
  async querySecurityPolicy(request: QuerySecurityPolicyRequest): Promise<QuerySecurityPolicyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.querySecurityPolicyEx(request, headers, runtime);
  }

  /**
   * Description: 风控云风险咨询接口
   * Summary: 风控云风险咨询接口
   */
  async querySecurityPolicyEx(request: QuerySecurityPolicyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QuerySecurityPolicyResponse> {
    Util.validateModel(request);
    return $tea.cast<QuerySecurityPolicyResponse>(await this.doRequest("1.0", "riskplus.security.policy.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QuerySecurityPolicyResponse({}));
  }

  /**
   * Description: 向风控发送异步安全数据
   * Summary: 异步发送安全数据
   */
  async sendSecurityData(request: SendSecurityDataRequest): Promise<SendSecurityDataResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.sendSecurityDataEx(request, headers, runtime);
  }

  /**
   * Description: 向风控发送异步安全数据
   * Summary: 异步发送安全数据
   */
  async sendSecurityDataEx(request: SendSecurityDataRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SendSecurityDataResponse> {
    Util.validateModel(request);
    return $tea.cast<SendSecurityDataResponse>(await this.doRequest("1.0", "riskplus.security.data.send", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SendSecurityDataResponse({}));
  }

  /**
   * Description: 外部客户业务接入蚂蚁风控，进行风险识别和风险决策输出核身后，进行二次确认
   * Summary: 安全策略确认服务输出
   */
  async confirmSecurityPolicy(request: ConfirmSecurityPolicyRequest): Promise<ConfirmSecurityPolicyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.confirmSecurityPolicyEx(request, headers, runtime);
  }

  /**
   * Description: 外部客户业务接入蚂蚁风控，进行风险识别和风险决策输出核身后，进行二次确认
   * Summary: 安全策略确认服务输出
   */
  async confirmSecurityPolicyEx(request: ConfirmSecurityPolicyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ConfirmSecurityPolicyResponse> {
    Util.validateModel(request);
    return $tea.cast<ConfirmSecurityPolicyResponse>(await this.doRequest("1.0", "riskplus.security.policy.confirm", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ConfirmSecurityPolicyResponse({}));
  }

  /**
   * Description: 外部客户业务接入风控+，进行人机识别判断。
   * Summary: 策略咨询服务输出
   */
  async checkSecurityRds(request: CheckSecurityRdsRequest): Promise<CheckSecurityRdsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.checkSecurityRdsEx(request, headers, runtime);
  }

  /**
   * Description: 外部客户业务接入风控+，进行人机识别判断。
   * Summary: 策略咨询服务输出
   */
  async checkSecurityRdsEx(request: CheckSecurityRdsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CheckSecurityRdsResponse> {
    Util.validateModel(request);
    return $tea.cast<CheckSecurityRdsResponse>(await this.doRequest("1.0", "riskplus.security.rds.check", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CheckSecurityRdsResponse({}));
  }

  /**
   * Description: 外部客户业务接入风控+，请求安全数据如ip画像等。
   * Summary: 安全数据服务输出
   */
  async querySecurityData(request: QuerySecurityDataRequest): Promise<QuerySecurityDataResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.querySecurityDataEx(request, headers, runtime);
  }

  /**
   * Description: 外部客户业务接入风控+，请求安全数据如ip画像等。
   * Summary: 安全数据服务输出
   */
  async querySecurityDataEx(request: QuerySecurityDataRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QuerySecurityDataResponse> {
    Util.validateModel(request);
    return $tea.cast<QuerySecurityDataResponse>(await this.doRequest("1.0", "riskplus.security.data.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QuerySecurityDataResponse({}));
  }

  /**
   * Description: 外部客户数据校验接口，比如端防护
   * Summary: 安全数据服务校验
   */
  async checkSecurityData(request: CheckSecurityDataRequest): Promise<CheckSecurityDataResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.checkSecurityDataEx(request, headers, runtime);
  }

  /**
   * Description: 外部客户数据校验接口，比如端防护
   * Summary: 安全数据服务校验
   */
  async checkSecurityDataEx(request: CheckSecurityDataRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CheckSecurityDataResponse> {
    Util.validateModel(request);
    return $tea.cast<CheckSecurityDataResponse>(await this.doRequest("1.0", "riskplus.security.data.check", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CheckSecurityDataResponse({}));
  }

  /**
   * Description: 反欺诈风险数据服务请求执行
   * Summary: 反欺诈风险数据服务请求执行
   */
  async execSecurityRiskdataservice(request: ExecSecurityRiskdataserviceRequest): Promise<ExecSecurityRiskdataserviceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execSecurityRiskdataserviceEx(request, headers, runtime);
  }

  /**
   * Description: 反欺诈风险数据服务请求执行
   * Summary: 反欺诈风险数据服务请求执行
   */
  async execSecurityRiskdataserviceEx(request: ExecSecurityRiskdataserviceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecSecurityRiskdataserviceResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecSecurityRiskdataserviceResponse>(await this.doRequest("1.0", "riskplus.security.riskdataservice.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecSecurityRiskdataserviceResponse({}));
  }

  /**
   * Description: 风控云SaaS租户调用接口
   * Summary: 风控云SaaS租户调用接口
   */
  async querySaasSecurityPolicy(request: QuerySaasSecurityPolicyRequest): Promise<QuerySaasSecurityPolicyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.querySaasSecurityPolicyEx(request, headers, runtime);
  }

  /**
   * Description: 风控云SaaS租户调用接口
   * Summary: 风控云SaaS租户调用接口
   */
  async querySaasSecurityPolicyEx(request: QuerySaasSecurityPolicyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QuerySaasSecurityPolicyResponse> {
    Util.validateModel(request);
    return $tea.cast<QuerySaasSecurityPolicyResponse>(await this.doRequest("1.0", "riskplus.saas.security.policy.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QuerySaasSecurityPolicyResponse({}));
  }

  /**
   * Description: 批量决策
   * Summary: 批量决策查询
   */
  async queryBatchSecurityPolicy(request: QueryBatchSecurityPolicyRequest): Promise<QueryBatchSecurityPolicyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryBatchSecurityPolicyEx(request, headers, runtime);
  }

  /**
   * Description: 批量决策
   * Summary: 批量决策查询
   */
  async queryBatchSecurityPolicyEx(request: QueryBatchSecurityPolicyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryBatchSecurityPolicyResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBatchSecurityPolicyResponse>(await this.doRequest("1.0", "riskplus.batch.security.policy.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryBatchSecurityPolicyResponse({}));
  }

  /**
   * Description: 信护盾产品批量查询
   * Summary: 信护盾产品批量查询
   */
  async queryCreditshieldProductBatch(request: QueryCreditshieldProductBatchRequest): Promise<QueryCreditshieldProductBatchResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryCreditshieldProductBatchEx(request, headers, runtime);
  }

  /**
   * Description: 信护盾产品批量查询
   * Summary: 信护盾产品批量查询
   */
  async queryCreditshieldProductBatchEx(request: QueryCreditshieldProductBatchRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryCreditshieldProductBatchResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryCreditshieldProductBatchResponse>(await this.doRequest("1.0", "riskplus.creditshield.product.batch.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryCreditshieldProductBatchResponse({}));
  }

  /**
   * Description: 天枢信贷业务系统线下测试环境测试接口
   * Summary: 天枢信贷业务系统线下测试接口
   */
  async queryDubheTest(request: QueryDubheTestRequest): Promise<QueryDubheTestResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDubheTestEx(request, headers, runtime);
  }

  /**
   * Description: 天枢信贷业务系统线下测试环境测试接口
   * Summary: 天枢信贷业务系统线下测试接口
   */
  async queryDubheTestEx(request: QueryDubheTestRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDubheTestResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDubheTestResponse>(await this.doRequest("1.0", "riskplus.dubhe.test.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDubheTestResponse({}));
  }

  /**
   * Description: 通过客户三要素信息查询资金方代码(资金路由)
   * Summary: 天枢系统资金方代码(资金路由)查询
   */
  async queryDubheRouterFundrouter(request: QueryDubheRouterFundrouterRequest): Promise<QueryDubheRouterFundrouterResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDubheRouterFundrouterEx(request, headers, runtime);
  }

  /**
   * Description: 通过客户三要素信息查询资金方代码(资金路由)
   * Summary: 天枢系统资金方代码(资金路由)查询
   */
  async queryDubheRouterFundrouterEx(request: QueryDubheRouterFundrouterRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDubheRouterFundrouterResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDubheRouterFundrouterResponse>(await this.doRequest("1.0", "riskplus.dubhe.router.fundrouter.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDubheRouterFundrouterResponse({}));
  }

  /**
   * Description: 天枢系统授信申请接口
   * Summary: 天枢系统授信申请接口
   */
  async applyDubheCredit(request: ApplyDubheCreditRequest): Promise<ApplyDubheCreditResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyDubheCreditEx(request, headers, runtime);
  }

  /**
   * Description: 天枢系统授信申请接口
   * Summary: 天枢系统授信申请接口
   */
  async applyDubheCreditEx(request: ApplyDubheCreditRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyDubheCreditResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyDubheCreditResponse>(await this.doRequest("1.0", "riskplus.dubhe.credit.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyDubheCreditResponse({}));
  }

  /**
   * Description: 天枢系统授信额度查询接口
   * Summary: 天枢系统授信额度查询接口
   */
  async queryDubheCreditStatus(request: QueryDubheCreditStatusRequest): Promise<QueryDubheCreditStatusResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDubheCreditStatusEx(request, headers, runtime);
  }

  /**
   * Description: 天枢系统授信额度查询接口
   * Summary: 天枢系统授信额度查询接口
   */
  async queryDubheCreditStatusEx(request: QueryDubheCreditStatusRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDubheCreditStatusResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDubheCreditStatusResponse>(await this.doRequest("1.0", "riskplus.dubhe.credit.status.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDubheCreditStatusResponse({}));
  }

  /**
   * Description: 天枢系统还款计划试算，根据借款金额和期数计算还款计划
   * Summary: 天枢系统还款计划试算
   */
  async countDubheRepayReftrial(request: CountDubheRepayReftrialRequest): Promise<CountDubheRepayReftrialResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.countDubheRepayReftrialEx(request, headers, runtime);
  }

  /**
   * Description: 天枢系统还款计划试算，根据借款金额和期数计算还款计划
   * Summary: 天枢系统还款计划试算
   */
  async countDubheRepayReftrialEx(request: CountDubheRepayReftrialRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CountDubheRepayReftrialResponse> {
    Util.validateModel(request);
    return $tea.cast<CountDubheRepayReftrialResponse>(await this.doRequest("1.0", "riskplus.dubhe.repay.reftrial.count", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CountDubheRepayReftrialResponse({}));
  }

  /**
   * Description: 天枢系统还款计划查询，根据申请订单查询还款计划
   * Summary: 天枢系统还款计划查询
   */
  async queryDubheRepayList(request: QueryDubheRepayListRequest): Promise<QueryDubheRepayListResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDubheRepayListEx(request, headers, runtime);
  }

  /**
   * Description: 天枢系统还款计划查询，根据申请订单查询还款计划
   * Summary: 天枢系统还款计划查询
   */
  async queryDubheRepayListEx(request: QueryDubheRepayListRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDubheRepayListResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDubheRepayListResponse>(await this.doRequest("1.0", "riskplus.dubhe.repay.list.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDubheRepayListResponse({}));
  }

  /**
   * Description: 天枢系统用信申请接口
   * Summary: 天枢系统用信申请接口
   */
  async applyDubheUsecredit(request: ApplyDubheUsecreditRequest): Promise<ApplyDubheUsecreditResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyDubheUsecreditEx(request, headers, runtime);
  }

  /**
   * Description: 天枢系统用信申请接口
   * Summary: 天枢系统用信申请接口
   */
  async applyDubheUsecreditEx(request: ApplyDubheUsecreditRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyDubheUsecreditResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyDubheUsecreditResponse>(await this.doRequest("1.0", "riskplus.dubhe.usecredit.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyDubheUsecreditResponse({}));
  }

  /**
   * Description: 天枢系统用信申请状态查询，返回用信详情及还款计划
   * Summary: 天枢系统用信申请状态查询
   */
  async queryDubheUsecreditStatus(request: QueryDubheUsecreditStatusRequest): Promise<QueryDubheUsecreditStatusResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDubheUsecreditStatusEx(request, headers, runtime);
  }

  /**
   * Description: 天枢系统用信申请状态查询，返回用信详情及还款计划
   * Summary: 天枢系统用信申请状态查询
   */
  async queryDubheUsecreditStatusEx(request: QueryDubheUsecreditStatusRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDubheUsecreditStatusResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDubheUsecreditStatusResponse>(await this.doRequest("1.0", "riskplus.dubhe.usecredit.status.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDubheUsecreditStatusResponse({}));
  }

  /**
   * Description: 天枢系统还款试算，根据借据号计算还款金额
   * Summary: 天枢系统还款试算
   */
  async countDubheRepayTrial(request: CountDubheRepayTrialRequest): Promise<CountDubheRepayTrialResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.countDubheRepayTrialEx(request, headers, runtime);
  }

  /**
   * Description: 天枢系统还款试算，根据借据号计算还款金额
   * Summary: 天枢系统还款试算
   */
  async countDubheRepayTrialEx(request: CountDubheRepayTrialRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CountDubheRepayTrialResponse> {
    Util.validateModel(request);
    return $tea.cast<CountDubheRepayTrialResponse>(await this.doRequest("1.0", "riskplus.dubhe.repay.trial.count", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CountDubheRepayTrialResponse({}));
  }

  /**
   * Description: 天枢系统主动还款（收银台）接口
   * Summary: 天枢系统主动还款（收银台）接口
   */
  async repayDubheRepayCheckstand(request: RepayDubheRepayCheckstandRequest): Promise<RepayDubheRepayCheckstandResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.repayDubheRepayCheckstandEx(request, headers, runtime);
  }

  /**
   * Description: 天枢系统主动还款（收银台）接口
   * Summary: 天枢系统主动还款（收银台）接口
   */
  async repayDubheRepayCheckstandEx(request: RepayDubheRepayCheckstandRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RepayDubheRepayCheckstandResponse> {
    Util.validateModel(request);
    return $tea.cast<RepayDubheRepayCheckstandResponse>(await this.doRequest("1.0", "riskplus.dubhe.repay.checkstand.repay", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RepayDubheRepayCheckstandResponse({}));
  }

  /**
   * Description: 天枢系统还款信息查询
   * Summary: 天枢系统还款信息查询
   */
  async queryDubheRepayInfo(request: QueryDubheRepayInfoRequest): Promise<QueryDubheRepayInfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDubheRepayInfoEx(request, headers, runtime);
  }

  /**
   * Description: 天枢系统还款信息查询
   * Summary: 天枢系统还款信息查询
   */
  async queryDubheRepayInfoEx(request: QueryDubheRepayInfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDubheRepayInfoResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDubheRepayInfoResponse>(await this.doRequest("1.0", "riskplus.dubhe.repay.info.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDubheRepayInfoResponse({}));
  }

  /**
   * Description: 天枢系统客户信息变更接口（变更客户三要素信息）
   * Summary: 天枢系统客户信息变更接口
   */
  async updateDubheCustomerInfo(request: UpdateDubheCustomerInfoRequest): Promise<UpdateDubheCustomerInfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateDubheCustomerInfoEx(request, headers, runtime);
  }

  /**
   * Description: 天枢系统客户信息变更接口（变更客户三要素信息）
   * Summary: 天枢系统客户信息变更接口
   */
  async updateDubheCustomerInfoEx(request: UpdateDubheCustomerInfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateDubheCustomerInfoResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateDubheCustomerInfoResponse>(await this.doRequest("1.0", "riskplus.dubhe.customer.info.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateDubheCustomerInfoResponse({}));
  }

  /**
   * Description: 天枢系统协议签约申请(支付宝
   * Summary: 天枢系统协议签约申请(支付宝)
   */
  async applyDubheCustomerAgreementsign(request: ApplyDubheCustomerAgreementsignRequest): Promise<ApplyDubheCustomerAgreementsignResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyDubheCustomerAgreementsignEx(request, headers, runtime);
  }

  /**
   * Description: 天枢系统协议签约申请(支付宝
   * Summary: 天枢系统协议签约申请(支付宝)
   */
  async applyDubheCustomerAgreementsignEx(request: ApplyDubheCustomerAgreementsignRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyDubheCustomerAgreementsignResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyDubheCustomerAgreementsignResponse>(await this.doRequest("1.0", "riskplus.dubhe.customer.agreementsign.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyDubheCustomerAgreementsignResponse({}));
  }

  /**
   * Description: 天枢系统协议签约查询(支付宝)
   * Summary: 天枢系统协议签约查询(支付宝)
   */
  async queryDubheCustomerAgreementsign(request: QueryDubheCustomerAgreementsignRequest): Promise<QueryDubheCustomerAgreementsignResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDubheCustomerAgreementsignEx(request, headers, runtime);
  }

  /**
   * Description: 天枢系统协议签约查询(支付宝)
   * Summary: 天枢系统协议签约查询(支付宝)
   */
  async queryDubheCustomerAgreementsignEx(request: QueryDubheCustomerAgreementsignRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDubheCustomerAgreementsignResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDubheCustomerAgreementsignResponse>(await this.doRequest("1.0", "riskplus.dubhe.customer.agreementsign.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDubheCustomerAgreementsignResponse({}));
  }

  /**
   * Description: 天枢信贷业务系统主动还款（直接代扣）接口
   * Summary: 天枢信贷业务系统主动还款（直接代扣）接口
   */
  async repayDubheRepayWithhold(request: RepayDubheRepayWithholdRequest): Promise<RepayDubheRepayWithholdResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.repayDubheRepayWithholdEx(request, headers, runtime);
  }

  /**
   * Description: 天枢信贷业务系统主动还款（直接代扣）接口
   * Summary: 天枢信贷业务系统主动还款（直接代扣）接口
   */
  async repayDubheRepayWithholdEx(request: RepayDubheRepayWithholdRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RepayDubheRepayWithholdResponse> {
    Util.validateModel(request);
    return $tea.cast<RepayDubheRepayWithholdResponse>(await this.doRequest("1.0", "riskplus.dubhe.repay.withhold.repay", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RepayDubheRepayWithholdResponse({}));
  }

  /**
   * Description: 天枢系统合同获取
   * Summary: 天枢系统合同获取
   */
  async queryDubheSearchContract(request: QueryDubheSearchContractRequest): Promise<QueryDubheSearchContractResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDubheSearchContractEx(request, headers, runtime);
  }

  /**
   * Description: 天枢系统合同获取
   * Summary: 天枢系统合同获取
   */
  async queryDubheSearchContractEx(request: QueryDubheSearchContractRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDubheSearchContractResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDubheSearchContractResponse>(await this.doRequest("1.0", "riskplus.dubhe.search.contract.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDubheSearchContractResponse({}));
  }

  /**
   * Description: 天枢逾期信息查询接口
   * Summary: 逾期信息查询
   */
  async queryDubheReceiptOverdue(request: QueryDubheReceiptOverdueRequest): Promise<QueryDubheReceiptOverdueResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDubheReceiptOverdueEx(request, headers, runtime);
  }

  /**
   * Description: 天枢逾期信息查询接口
   * Summary: 逾期信息查询
   */
  async queryDubheReceiptOverdueEx(request: QueryDubheReceiptOverdueRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDubheReceiptOverdueResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDubheReceiptOverdueResponse>(await this.doRequest("1.0", "riskplus.dubhe.receipt.overdue.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDubheReceiptOverdueResponse({}));
  }

  /**
   * Description: 天枢发送短信接口，适用于一个模板相同参数
   * Summary: 天枢发送短信接口
   */
  async sendDubbridgeSms(request: SendDubbridgeSmsRequest): Promise<SendDubbridgeSmsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.sendDubbridgeSmsEx(request, headers, runtime);
  }

  /**
   * Description: 天枢发送短信接口，适用于一个模板相同参数
   * Summary: 天枢发送短信接口
   */
  async sendDubbridgeSmsEx(request: SendDubbridgeSmsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SendDubbridgeSmsResponse> {
    Util.validateModel(request);
    return $tea.cast<SendDubbridgeSmsResponse>(await this.doRequest("1.0", "riskplus.dubbridge.sms.send", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SendDubbridgeSmsResponse({}));
  }

  /**
   * Description: 天枢批量发送短信接口，适合一个短信模板多个不同参数场景
   * Summary: 天枢批量发送短信接口
   */
  async sendDubbridgeSmsBatch(request: SendDubbridgeSmsBatchRequest): Promise<SendDubbridgeSmsBatchResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.sendDubbridgeSmsBatchEx(request, headers, runtime);
  }

  /**
   * Description: 天枢批量发送短信接口，适合一个短信模板多个不同参数场景
   * Summary: 天枢批量发送短信接口
   */
  async sendDubbridgeSmsBatchEx(request: SendDubbridgeSmsBatchRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SendDubbridgeSmsBatchResponse> {
    Util.validateModel(request);
    return $tea.cast<SendDubbridgeSmsBatchResponse>(await this.doRequest("1.0", "riskplus.dubbridge.sms.batch.send", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SendDubbridgeSmsBatchResponse({}));
  }

  /**
   * Description: 资金路由接口，获取资金方编号
   * Summary: 天枢系统资金方代码(资金路由)查询
   */
  async queryDubbridgeRouterFundrouter(request: QueryDubbridgeRouterFundrouterRequest): Promise<QueryDubbridgeRouterFundrouterResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDubbridgeRouterFundrouterEx(request, headers, runtime);
  }

  /**
   * Description: 资金路由接口，获取资金方编号
   * Summary: 天枢系统资金方代码(资金路由)查询
   */
  async queryDubbridgeRouterFundrouterEx(request: QueryDubbridgeRouterFundrouterRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDubbridgeRouterFundrouterResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDubbridgeRouterFundrouterResponse>(await this.doRequest("1.0", "riskplus.dubbridge.router.fundrouter.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDubbridgeRouterFundrouterResponse({}));
  }

  /**
   * Description: 天枢系统授信申请接口
   * Summary: 天枢系统授信申请接口
   */
  async applyDubbridgeCredit(request: ApplyDubbridgeCreditRequest): Promise<ApplyDubbridgeCreditResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyDubbridgeCreditEx(request, headers, runtime);
  }

  /**
   * Description: 天枢系统授信申请接口
   * Summary: 天枢系统授信申请接口
   */
  async applyDubbridgeCreditEx(request: ApplyDubbridgeCreditRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyDubbridgeCreditResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyDubbridgeCreditResponse>(await this.doRequest("1.0", "riskplus.dubbridge.credit.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyDubbridgeCreditResponse({}));
  }

  /**
   * Description: 为流量方提供文件上传接口，用于申请件影像资料上传
   * Summary: 天枢文件上传
   */
  async uploadDubbridgeFile(request: UploadDubbridgeFileRequest): Promise<UploadDubbridgeFileResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.uploadDubbridgeFileEx(request, headers, runtime);
  }

  /**
   * Description: 为流量方提供文件上传接口，用于申请件影像资料上传
   * Summary: 天枢文件上传
   */
  async uploadDubbridgeFileEx(request: UploadDubbridgeFileRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UploadDubbridgeFileResponse> {
    if (!Util.isUnset(request.fileObject)) {
      let uploadReq = new CreateAntcloudGatewayxFileUploadRequest({
        authToken: request.authToken,
        apiCode: "riskplus.dubbridge.file.upload",
        fileName: request.fileObjectName,
      });
      let uploadResp = await this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
      if (!AntchainUtil.isSuccess(uploadResp.resultCode, "ok")) {
        let uploadDubbridgeFileResponse = new UploadDubbridgeFileResponse({
          reqMsgId: uploadResp.reqMsgId,
          resultCode: uploadResp.resultCode,
          resultMsg: uploadResp.resultMsg,
        });
        return uploadDubbridgeFileResponse;
      }

      let uploadHeaders = AntchainUtil.parseUploadHeaders(uploadResp.uploadHeaders);
      await AntchainUtil.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
      request.fileId = uploadResp.fileId;
      request.fileObject = null;
    }

    Util.validateModel(request);
    return $tea.cast<UploadDubbridgeFileResponse>(await this.doRequest("1.0", "riskplus.dubbridge.file.upload", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UploadDubbridgeFileResponse({}));
  }

  /**
   * Description: 代扣签约绑卡接口
   * Summary: 代扣协议签约申请(银行卡绑卡)
   */
  async bindDubbridgeCustomerBankcard(request: BindDubbridgeCustomerBankcardRequest): Promise<BindDubbridgeCustomerBankcardResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.bindDubbridgeCustomerBankcardEx(request, headers, runtime);
  }

  /**
   * Description: 代扣签约绑卡接口
   * Summary: 代扣协议签约申请(银行卡绑卡)
   */
  async bindDubbridgeCustomerBankcardEx(request: BindDubbridgeCustomerBankcardRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BindDubbridgeCustomerBankcardResponse> {
    Util.validateModel(request);
    return $tea.cast<BindDubbridgeCustomerBankcardResponse>(await this.doRequest("1.0", "riskplus.dubbridge.customer.bankcard.bind", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BindDubbridgeCustomerBankcardResponse({}));
  }

  /**
   * Description: 代扣协议签约提交(银行卡绑卡)
   * Summary: 代扣协议签约校验(银行卡绑卡)
   */
  async verifyDubbridgeCustomerBankcard(request: VerifyDubbridgeCustomerBankcardRequest): Promise<VerifyDubbridgeCustomerBankcardResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.verifyDubbridgeCustomerBankcardEx(request, headers, runtime);
  }

  /**
   * Description: 代扣协议签约提交(银行卡绑卡)
   * Summary: 代扣协议签约校验(银行卡绑卡)
   */
  async verifyDubbridgeCustomerBankcardEx(request: VerifyDubbridgeCustomerBankcardRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<VerifyDubbridgeCustomerBankcardResponse> {
    Util.validateModel(request);
    return $tea.cast<VerifyDubbridgeCustomerBankcardResponse>(await this.doRequest("1.0", "riskplus.dubbridge.customer.bankcard.verify", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new VerifyDubbridgeCustomerBankcardResponse({}));
  }

  /**
   * Description: 用于机构通道通用回调
   * Summary: 机构通道回调通用接口
   */
  async notifyDubbridgeDefininnerchannel(request: NotifyDubbridgeDefininnerchannelRequest): Promise<NotifyDubbridgeDefininnerchannelResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.notifyDubbridgeDefininnerchannelEx(request, headers, runtime);
  }

  /**
   * Description: 用于机构通道通用回调
   * Summary: 机构通道回调通用接口
   */
  async notifyDubbridgeDefininnerchannelEx(request: NotifyDubbridgeDefininnerchannelRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<NotifyDubbridgeDefininnerchannelResponse> {
    Util.validateModel(request);
    return $tea.cast<NotifyDubbridgeDefininnerchannelResponse>(await this.doRequest("1.0", "riskplus.dubbridge.defininnerchannel.notify", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new NotifyDubbridgeDefininnerchannelResponse({}));
  }

  /**
   * Description: 天枢系统授信额度查询接口
   * Summary: 天枢系统授信额度查询接口
   */
  async queryDubbridgeCreditStatus(request: QueryDubbridgeCreditStatusRequest): Promise<QueryDubbridgeCreditStatusResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDubbridgeCreditStatusEx(request, headers, runtime);
  }

  /**
   * Description: 天枢系统授信额度查询接口
   * Summary: 天枢系统授信额度查询接口
   */
  async queryDubbridgeCreditStatusEx(request: QueryDubbridgeCreditStatusRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDubbridgeCreditStatusResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDubbridgeCreditStatusResponse>(await this.doRequest("1.0", "riskplus.dubbridge.credit.status.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDubbridgeCreditStatusResponse({}));
  }

  /**
   * Description: 天枢系统企业小微分查询
   * Summary: 天枢系统企业小微分查询
   */
  async queryDubbridgeRiskinfoEnterprisescore(request: QueryDubbridgeRiskinfoEnterprisescoreRequest): Promise<QueryDubbridgeRiskinfoEnterprisescoreResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDubbridgeRiskinfoEnterprisescoreEx(request, headers, runtime);
  }

  /**
   * Description: 天枢系统企业小微分查询
   * Summary: 天枢系统企业小微分查询
   */
  async queryDubbridgeRiskinfoEnterprisescoreEx(request: QueryDubbridgeRiskinfoEnterprisescoreRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDubbridgeRiskinfoEnterprisescoreResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDubbridgeRiskinfoEnterprisescoreResponse>(await this.doRequest("1.0", "riskplus.dubbridge.riskinfo.enterprisescore.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDubbridgeRiskinfoEnterprisescoreResponse({}));
  }

  /**
   * Description: 天枢系统风控信息通用查询
   * Summary: 天枢系统风控信息通用查询
   */
  async queryDubbridgeRiskinfoCommon(request: QueryDubbridgeRiskinfoCommonRequest): Promise<QueryDubbridgeRiskinfoCommonResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDubbridgeRiskinfoCommonEx(request, headers, runtime);
  }

  /**
   * Description: 天枢系统风控信息通用查询
   * Summary: 天枢系统风控信息通用查询
   */
  async queryDubbridgeRiskinfoCommonEx(request: QueryDubbridgeRiskinfoCommonRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDubbridgeRiskinfoCommonResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDubbridgeRiskinfoCommonResponse>(await this.doRequest("1.0", "riskplus.dubbridge.riskinfo.common.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDubbridgeRiskinfoCommonResponse({}));
  }

  /**
   * Description: 额度、利率、状态调整
   * Summary: 调额申请
   */
  async updateDubbridgeInstitutionCredit(request: UpdateDubbridgeInstitutionCreditRequest): Promise<UpdateDubbridgeInstitutionCreditResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateDubbridgeInstitutionCreditEx(request, headers, runtime);
  }

  /**
   * Description: 额度、利率、状态调整
   * Summary: 调额申请
   */
  async updateDubbridgeInstitutionCreditEx(request: UpdateDubbridgeInstitutionCreditRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateDubbridgeInstitutionCreditResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateDubbridgeInstitutionCreditResponse>(await this.doRequest("1.0", "riskplus.dubbridge.institution.credit.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateDubbridgeInstitutionCreditResponse({}));
  }

  /**
   * Description: 天枢企业经营数据查询
   * Summary: 天枢企业经营数据查询
   */
  async queryDubbridgeRiskinfoBusinessinfo(request: QueryDubbridgeRiskinfoBusinessinfoRequest): Promise<QueryDubbridgeRiskinfoBusinessinfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDubbridgeRiskinfoBusinessinfoEx(request, headers, runtime);
  }

  /**
   * Description: 天枢企业经营数据查询
   * Summary: 天枢企业经营数据查询
   */
  async queryDubbridgeRiskinfoBusinessinfoEx(request: QueryDubbridgeRiskinfoBusinessinfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDubbridgeRiskinfoBusinessinfoResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDubbridgeRiskinfoBusinessinfoResponse>(await this.doRequest("1.0", "riskplus.dubbridge.riskinfo.businessinfo.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDubbridgeRiskinfoBusinessinfoResponse({}));
  }

  /**
   * Description: 天枢系统协议签约申请(支付宝）
   * Summary: 天枢系统协议签约申请(支付宝)
   */
  async applyDubbridgeCustomerAgreementsign(request: ApplyDubbridgeCustomerAgreementsignRequest): Promise<ApplyDubbridgeCustomerAgreementsignResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyDubbridgeCustomerAgreementsignEx(request, headers, runtime);
  }

  /**
   * Description: 天枢系统协议签约申请(支付宝）
   * Summary: 天枢系统协议签约申请(支付宝)
   */
  async applyDubbridgeCustomerAgreementsignEx(request: ApplyDubbridgeCustomerAgreementsignRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyDubbridgeCustomerAgreementsignResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyDubbridgeCustomerAgreementsignResponse>(await this.doRequest("1.0", "riskplus.dubbridge.customer.agreementsign.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyDubbridgeCustomerAgreementsignResponse({}));
  }

  /**
   * Description: 天枢系统是否授信查询
   * Summary: 天枢系统是否授信查询
   */
  async queryDubbridgeAccountStatus(request: QueryDubbridgeAccountStatusRequest): Promise<QueryDubbridgeAccountStatusResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDubbridgeAccountStatusEx(request, headers, runtime);
  }

  /**
   * Description: 天枢系统是否授信查询
   * Summary: 天枢系统是否授信查询
   */
  async queryDubbridgeAccountStatusEx(request: QueryDubbridgeAccountStatusRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDubbridgeAccountStatusResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDubbridgeAccountStatusResponse>(await this.doRequest("1.0", "riskplus.dubbridge.account.status.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDubbridgeAccountStatusResponse({}));
  }

  /**
   * Description: 天枢系统校验是否联登
   * Summary: 天枢系统校验是否联登
   */
  async queryDubbridgeAccountCustom(request: QueryDubbridgeAccountCustomRequest): Promise<QueryDubbridgeAccountCustomResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDubbridgeAccountCustomEx(request, headers, runtime);
  }

  /**
   * Description: 天枢系统校验是否联登
   * Summary: 天枢系统校验是否联登
   */
  async queryDubbridgeAccountCustomEx(request: QueryDubbridgeAccountCustomRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDubbridgeAccountCustomResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDubbridgeAccountCustomResponse>(await this.doRequest("1.0", "riskplus.dubbridge.account.custom.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDubbridgeAccountCustomResponse({}));
  }

  /**
   * Description: 天枢系统更新渠道
   * Summary: 天枢系统更新渠道
   */
  async updateDubbridgeAccountCustom(request: UpdateDubbridgeAccountCustomRequest): Promise<UpdateDubbridgeAccountCustomResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateDubbridgeAccountCustomEx(request, headers, runtime);
  }

  /**
   * Description: 天枢系统更新渠道
   * Summary: 天枢系统更新渠道
   */
  async updateDubbridgeAccountCustomEx(request: UpdateDubbridgeAccountCustomRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateDubbridgeAccountCustomResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateDubbridgeAccountCustomResponse>(await this.doRequest("1.0", "riskplus.dubbridge.account.custom.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateDubbridgeAccountCustomResponse({}));
  }

  /**
   * Description: 天枢系统协议签约查询(支付宝)
   * Summary: 天枢系统协议签约查询(支付宝)
   */
  async queryDubbridgeCustomerAgreementsign(request: QueryDubbridgeCustomerAgreementsignRequest): Promise<QueryDubbridgeCustomerAgreementsignResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDubbridgeCustomerAgreementsignEx(request, headers, runtime);
  }

  /**
   * Description: 天枢系统协议签约查询(支付宝)
   * Summary: 天枢系统协议签约查询(支付宝)
   */
  async queryDubbridgeCustomerAgreementsignEx(request: QueryDubbridgeCustomerAgreementsignRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDubbridgeCustomerAgreementsignResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDubbridgeCustomerAgreementsignResponse>(await this.doRequest("1.0", "riskplus.dubbridge.customer.agreementsign.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDubbridgeCustomerAgreementsignResponse({}));
  }

  /**
   * Description: 天枢系统客户信息变更接口（变更客户三要素信息）
   * Summary: 天枢系统客户信息变更接口
   */
  async updateDubbridgeCustomerInfo(request: UpdateDubbridgeCustomerInfoRequest): Promise<UpdateDubbridgeCustomerInfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateDubbridgeCustomerInfoEx(request, headers, runtime);
  }

  /**
   * Description: 天枢系统客户信息变更接口（变更客户三要素信息）
   * Summary: 天枢系统客户信息变更接口
   */
  async updateDubbridgeCustomerInfoEx(request: UpdateDubbridgeCustomerInfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateDubbridgeCustomerInfoResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateDubbridgeCustomerInfoResponse>(await this.doRequest("1.0", "riskplus.dubbridge.customer.info.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateDubbridgeCustomerInfoResponse({}));
  }

  /**
   * Description: 天枢逾期信息查询接口
   * Summary: 逾期信息查询
   */
  async queryDubbridgeReceiptOverdue(request: QueryDubbridgeReceiptOverdueRequest): Promise<QueryDubbridgeReceiptOverdueResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDubbridgeReceiptOverdueEx(request, headers, runtime);
  }

  /**
   * Description: 天枢逾期信息查询接口
   * Summary: 逾期信息查询
   */
  async queryDubbridgeReceiptOverdueEx(request: QueryDubbridgeReceiptOverdueRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDubbridgeReceiptOverdueResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDubbridgeReceiptOverdueResponse>(await this.doRequest("1.0", "riskplus.dubbridge.receipt.overdue.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDubbridgeReceiptOverdueResponse({}));
  }

  /**
   * Description: 天枢系统主动还款（收银台）接口
   * Summary: 天枢系统主动还款（收银台）接口
   */
  async repayDubbridgeRepayCheckstand(request: RepayDubbridgeRepayCheckstandRequest): Promise<RepayDubbridgeRepayCheckstandResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.repayDubbridgeRepayCheckstandEx(request, headers, runtime);
  }

  /**
   * Description: 天枢系统主动还款（收银台）接口
   * Summary: 天枢系统主动还款（收银台）接口
   */
  async repayDubbridgeRepayCheckstandEx(request: RepayDubbridgeRepayCheckstandRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RepayDubbridgeRepayCheckstandResponse> {
    Util.validateModel(request);
    return $tea.cast<RepayDubbridgeRepayCheckstandResponse>(await this.doRequest("1.0", "riskplus.dubbridge.repay.checkstand.repay", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RepayDubbridgeRepayCheckstandResponse({}));
  }

  /**
   * Description: 天枢系统还款信息查询
   * Summary: 天枢系统还款信息查询
   */
  async queryDubbridgeRepayInfo(request: QueryDubbridgeRepayInfoRequest): Promise<QueryDubbridgeRepayInfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDubbridgeRepayInfoEx(request, headers, runtime);
  }

  /**
   * Description: 天枢系统还款信息查询
   * Summary: 天枢系统还款信息查询
   */
  async queryDubbridgeRepayInfoEx(request: QueryDubbridgeRepayInfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDubbridgeRepayInfoResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDubbridgeRepayInfoResponse>(await this.doRequest("1.0", "riskplus.dubbridge.repay.info.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDubbridgeRepayInfoResponse({}));
  }

  /**
   * Description: 天枢系统还款计划查询，根据申请订单查询还款计划
   * Summary: 天枢系统还款计划查询
   */
  async queryDubbridgeRepayList(request: QueryDubbridgeRepayListRequest): Promise<QueryDubbridgeRepayListResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDubbridgeRepayListEx(request, headers, runtime);
  }

  /**
   * Description: 天枢系统还款计划查询，根据申请订单查询还款计划
   * Summary: 天枢系统还款计划查询
   */
  async queryDubbridgeRepayListEx(request: QueryDubbridgeRepayListRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDubbridgeRepayListResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDubbridgeRepayListResponse>(await this.doRequest("1.0", "riskplus.dubbridge.repay.list.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDubbridgeRepayListResponse({}));
  }

  /**
   * Description: 天枢系统还款计划试算，根据借款金额和期数计算还款计划
   * Summary: 天枢系统还款计划试算
   */
  async countDubbridgeRepayReftrial(request: CountDubbridgeRepayReftrialRequest): Promise<CountDubbridgeRepayReftrialResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.countDubbridgeRepayReftrialEx(request, headers, runtime);
  }

  /**
   * Description: 天枢系统还款计划试算，根据借款金额和期数计算还款计划
   * Summary: 天枢系统还款计划试算
   */
  async countDubbridgeRepayReftrialEx(request: CountDubbridgeRepayReftrialRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CountDubbridgeRepayReftrialResponse> {
    Util.validateModel(request);
    return $tea.cast<CountDubbridgeRepayReftrialResponse>(await this.doRequest("1.0", "riskplus.dubbridge.repay.reftrial.count", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CountDubbridgeRepayReftrialResponse({}));
  }

  /**
   * Description: 天枢系统还款试算，根据借据号计算还款金额
   * Summary: 天枢系统还款试算
   */
  async countDubbridgeRepayTrial(request: CountDubbridgeRepayTrialRequest): Promise<CountDubbridgeRepayTrialResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.countDubbridgeRepayTrialEx(request, headers, runtime);
  }

  /**
   * Description: 天枢系统还款试算，根据借据号计算还款金额
   * Summary: 天枢系统还款试算
   */
  async countDubbridgeRepayTrialEx(request: CountDubbridgeRepayTrialRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CountDubbridgeRepayTrialResponse> {
    Util.validateModel(request);
    return $tea.cast<CountDubbridgeRepayTrialResponse>(await this.doRequest("1.0", "riskplus.dubbridge.repay.trial.count", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CountDubbridgeRepayTrialResponse({}));
  }

  /**
   * Description: 天枢信贷业务系统主动还款（直接代扣）接口
   * Summary: 天枢信贷业务系统主动还款（直接代扣）接口
   */
  async repayDubbridgeRepayWithhold(request: RepayDubbridgeRepayWithholdRequest): Promise<RepayDubbridgeRepayWithholdResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.repayDubbridgeRepayWithholdEx(request, headers, runtime);
  }

  /**
   * Description: 天枢信贷业务系统主动还款（直接代扣）接口
   * Summary: 天枢信贷业务系统主动还款（直接代扣）接口
   */
  async repayDubbridgeRepayWithholdEx(request: RepayDubbridgeRepayWithholdRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RepayDubbridgeRepayWithholdResponse> {
    Util.validateModel(request);
    return $tea.cast<RepayDubbridgeRepayWithholdResponse>(await this.doRequest("1.0", "riskplus.dubbridge.repay.withhold.repay", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RepayDubbridgeRepayWithholdResponse({}));
  }

  /**
   * Description: 天枢系统合同获取
   * Summary: 天枢系统合同获取
   */
  async queryDubbridgeSearchContract(request: QueryDubbridgeSearchContractRequest): Promise<QueryDubbridgeSearchContractResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDubbridgeSearchContractEx(request, headers, runtime);
  }

  /**
   * Description: 天枢系统合同获取
   * Summary: 天枢系统合同获取
   */
  async queryDubbridgeSearchContractEx(request: QueryDubbridgeSearchContractRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDubbridgeSearchContractResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDubbridgeSearchContractResponse>(await this.doRequest("1.0", "riskplus.dubbridge.search.contract.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDubbridgeSearchContractResponse({}));
  }

  /**
   * Description: 天枢系统用信申请接口
   * Summary: 天枢系统用信申请接口
   */
  async applyDubbridgeUsecredit(request: ApplyDubbridgeUsecreditRequest): Promise<ApplyDubbridgeUsecreditResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyDubbridgeUsecreditEx(request, headers, runtime);
  }

  /**
   * Description: 天枢系统用信申请接口
   * Summary: 天枢系统用信申请接口
   */
  async applyDubbridgeUsecreditEx(request: ApplyDubbridgeUsecreditRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyDubbridgeUsecreditResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyDubbridgeUsecreditResponse>(await this.doRequest("1.0", "riskplus.dubbridge.usecredit.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyDubbridgeUsecreditResponse({}));
  }

  /**
   * Description: 天枢系统用信申请状态查询，返回用信详情及还款计划
   * Summary: 天枢系统用信申请状态查询
   */
  async queryDubbridgeUsecreditStatus(request: QueryDubbridgeUsecreditStatusRequest): Promise<QueryDubbridgeUsecreditStatusResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDubbridgeUsecreditStatusEx(request, headers, runtime);
  }

  /**
   * Description: 天枢系统用信申请状态查询，返回用信详情及还款计划
   * Summary: 天枢系统用信申请状态查询
   */
  async queryDubbridgeUsecreditStatusEx(request: QueryDubbridgeUsecreditStatusRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDubbridgeUsecreditStatusResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDubbridgeUsecreditStatusResponse>(await this.doRequest("1.0", "riskplus.dubbridge.usecredit.status.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDubbridgeUsecreditStatusResponse({}));
  }

  /**
   * Description: 天枢系统是否结清
   * Summary: 天枢系统借款是否结清
   */
  async queryDubbridgeReceiptStatus(request: QueryDubbridgeReceiptStatusRequest): Promise<QueryDubbridgeReceiptStatusResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDubbridgeReceiptStatusEx(request, headers, runtime);
  }

  /**
   * Description: 天枢系统是否结清
   * Summary: 天枢系统借款是否结清
   */
  async queryDubbridgeReceiptStatusEx(request: QueryDubbridgeReceiptStatusRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDubbridgeReceiptStatusResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDubbridgeReceiptStatusResponse>(await this.doRequest("1.0", "riskplus.dubbridge.receipt.status.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDubbridgeReceiptStatusResponse({}));
  }

  /**
   * Description: 天枢系统协议签约查询(通用)
   * Summary: 天枢系统协议签约查询(通用)
   */
  async queryDubbridgeCustomerCommonagreementsign(request: QueryDubbridgeCustomerCommonagreementsignRequest): Promise<QueryDubbridgeCustomerCommonagreementsignResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDubbridgeCustomerCommonagreementsignEx(request, headers, runtime);
  }

  /**
   * Description: 天枢系统协议签约查询(通用)
   * Summary: 天枢系统协议签约查询(通用)
   */
  async queryDubbridgeCustomerCommonagreementsignEx(request: QueryDubbridgeCustomerCommonagreementsignRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDubbridgeCustomerCommonagreementsignResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDubbridgeCustomerCommonagreementsignResponse>(await this.doRequest("1.0", "riskplus.dubbridge.customer.commonagreementsign.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDubbridgeCustomerCommonagreementsignResponse({}));
  }

  /**
   * Description: 客户影像信息更新
   * Summary: 客户影像信息更新
   */
  async updateDubbridgeFile(request: UpdateDubbridgeFileRequest): Promise<UpdateDubbridgeFileResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateDubbridgeFileEx(request, headers, runtime);
  }

  /**
   * Description: 客户影像信息更新
   * Summary: 客户影像信息更新
   */
  async updateDubbridgeFileEx(request: UpdateDubbridgeFileRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateDubbridgeFileResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateDubbridgeFileResponse>(await this.doRequest("1.0", "riskplus.dubbridge.file.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateDubbridgeFileResponse({}));
  }

  /**
   * Description: 天枢回调通用接口
   * Summary: 天枢回调通用接口
   */
  async notifyDubbridgeCallback(request: NotifyDubbridgeCallbackRequest): Promise<NotifyDubbridgeCallbackResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.notifyDubbridgeCallbackEx(request, headers, runtime);
  }

  /**
   * Description: 天枢回调通用接口
   * Summary: 天枢回调通用接口
   */
  async notifyDubbridgeCallbackEx(request: NotifyDubbridgeCallbackRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<NotifyDubbridgeCallbackResponse> {
    Util.validateModel(request);
    return $tea.cast<NotifyDubbridgeCallbackResponse>(await this.doRequest("1.0", "riskplus.dubbridge.callback.notify", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new NotifyDubbridgeCallbackResponse({}));
  }

  /**
   * Description: 2.12	天枢系统还款信息查询V2.0
   * Summary: 2.12 天枢系统还款信息查询V2.0
   */
  async queryDubbridgeRepayResult(request: QueryDubbridgeRepayResultRequest): Promise<QueryDubbridgeRepayResultResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDubbridgeRepayResultEx(request, headers, runtime);
  }

  /**
   * Description: 2.12	天枢系统还款信息查询V2.0
   * Summary: 2.12 天枢系统还款信息查询V2.0
   */
  async queryDubbridgeRepayResultEx(request: QueryDubbridgeRepayResultRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDubbridgeRepayResultResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDubbridgeRepayResultResponse>(await this.doRequest("1.0", "riskplus.dubbridge.repay.result.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDubbridgeRepayResultResponse({}));
  }

  /**
   * Description: 天枢准入接口
   * Summary: 天枢准入接口
   */
  async queryDubbridgeCreditPermit(request: QueryDubbridgeCreditPermitRequest): Promise<QueryDubbridgeCreditPermitResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDubbridgeCreditPermitEx(request, headers, runtime);
  }

  /**
   * Description: 天枢准入接口
   * Summary: 天枢准入接口
   */
  async queryDubbridgeCreditPermitEx(request: QueryDubbridgeCreditPermitRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDubbridgeCreditPermitResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDubbridgeCreditPermitResponse>(await this.doRequest("1.0", "riskplus.dubbridge.credit.permit.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDubbridgeCreditPermitResponse({}));
  }

  /**
   * Description: 用户状态判断
   * Summary: 用户状态判断
   */
  async queryDubbridgeUserUpgradestatus(request: QueryDubbridgeUserUpgradestatusRequest): Promise<QueryDubbridgeUserUpgradestatusResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDubbridgeUserUpgradestatusEx(request, headers, runtime);
  }

  /**
   * Description: 用户状态判断
   * Summary: 用户状态判断
   */
  async queryDubbridgeUserUpgradestatusEx(request: QueryDubbridgeUserUpgradestatusRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDubbridgeUserUpgradestatusResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDubbridgeUserUpgradestatusResponse>(await this.doRequest("1.0", "riskplus.dubbridge.user.upgradestatus.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDubbridgeUserUpgradestatusResponse({}));
  }

  /**
   * Description: 借据状态判断
   * Summary: 借据状态判断
   */
  async queryDubbridgeLoanUpgradestatus(request: QueryDubbridgeLoanUpgradestatusRequest): Promise<QueryDubbridgeLoanUpgradestatusResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDubbridgeLoanUpgradestatusEx(request, headers, runtime);
  }

  /**
   * Description: 借据状态判断
   * Summary: 借据状态判断
   */
  async queryDubbridgeLoanUpgradestatusEx(request: QueryDubbridgeLoanUpgradestatusRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDubbridgeLoanUpgradestatusResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDubbridgeLoanUpgradestatusResponse>(await this.doRequest("1.0", "riskplus.dubbridge.loan.upgradestatus.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDubbridgeLoanUpgradestatusResponse({}));
  }

  /**
   * Description: 支付签约查询(用户绑定银行卡列表)
   * Summary: 支付签约查询(用户绑定银行卡列表)
   */
  async queryDubbridgeCustomerBankcardlist(request: QueryDubbridgeCustomerBankcardlistRequest): Promise<QueryDubbridgeCustomerBankcardlistResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDubbridgeCustomerBankcardlistEx(request, headers, runtime);
  }

  /**
   * Description: 支付签约查询(用户绑定银行卡列表)
   * Summary: 支付签约查询(用户绑定银行卡列表)
   */
  async queryDubbridgeCustomerBankcardlistEx(request: QueryDubbridgeCustomerBankcardlistRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDubbridgeCustomerBankcardlistResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDubbridgeCustomerBankcardlistResponse>(await this.doRequest("1.0", "riskplus.dubbridge.customer.bankcardlist.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDubbridgeCustomerBankcardlistResponse({}));
  }

  /**
   * Description: 天枢系统用户前筛查询
   * Summary: 天枢系统用户前筛查询
   */
  async queryDubbridgeRouterUserselect(request: QueryDubbridgeRouterUserselectRequest): Promise<QueryDubbridgeRouterUserselectResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDubbridgeRouterUserselectEx(request, headers, runtime);
  }

  /**
   * Description: 天枢系统用户前筛查询
   * Summary: 天枢系统用户前筛查询
   */
  async queryDubbridgeRouterUserselectEx(request: QueryDubbridgeRouterUserselectRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDubbridgeRouterUserselectResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDubbridgeRouterUserselectResponse>(await this.doRequest("1.0", "riskplus.dubbridge.router.userselect.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDubbridgeRouterUserselectResponse({}));
  }

  /**
   * Description: 天枢系统开具结清证明
   * Summary: 天枢系统开具结清证明
   */
  async queryDubbridgeSettlementCertificate(request: QueryDubbridgeSettlementCertificateRequest): Promise<QueryDubbridgeSettlementCertificateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDubbridgeSettlementCertificateEx(request, headers, runtime);
  }

  /**
   * Description: 天枢系统开具结清证明
   * Summary: 天枢系统开具结清证明
   */
  async queryDubbridgeSettlementCertificateEx(request: QueryDubbridgeSettlementCertificateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDubbridgeSettlementCertificateResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDubbridgeSettlementCertificateResponse>(await this.doRequest("1.0", "riskplus.dubbridge.settlement.certificate.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDubbridgeSettlementCertificateResponse({}));
  }

  /**
   * Description: 天枢系统预览协议查询接口
   * Summary: 天枢系统预览协议查询接口
   */
  async queryDubbridgeAgreementPreview(request: QueryDubbridgeAgreementPreviewRequest): Promise<QueryDubbridgeAgreementPreviewResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDubbridgeAgreementPreviewEx(request, headers, runtime);
  }

  /**
   * Description: 天枢系统预览协议查询接口
   * Summary: 天枢系统预览协议查询接口
   */
  async queryDubbridgeAgreementPreviewEx(request: QueryDubbridgeAgreementPreviewRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDubbridgeAgreementPreviewResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDubbridgeAgreementPreviewResponse>(await this.doRequest("1.0", "riskplus.dubbridge.agreement.preview.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDubbridgeAgreementPreviewResponse({}));
  }

  /**
   * Description: 用户借款是否结清
   * Summary: 用户借款是否结清
   */
  async queryDubbridgeAccountUsecredit(request: QueryDubbridgeAccountUsecreditRequest): Promise<QueryDubbridgeAccountUsecreditResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDubbridgeAccountUsecreditEx(request, headers, runtime);
  }

  /**
   * Description: 用户借款是否结清
   * Summary: 用户借款是否结清
   */
  async queryDubbridgeAccountUsecreditEx(request: QueryDubbridgeAccountUsecreditRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDubbridgeAccountUsecreditResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDubbridgeAccountUsecreditResponse>(await this.doRequest("1.0", "riskplus.dubbridge.account.usecredit.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDubbridgeAccountUsecreditResponse({}));
  }

  /**
   * Description: 天枢用户聚合状态查询接口
   * Summary: 天枢用户聚合状态查询接口
   */
  async queryDubbridgeUserAggregationinfo(request: QueryDubbridgeUserAggregationinfoRequest): Promise<QueryDubbridgeUserAggregationinfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDubbridgeUserAggregationinfoEx(request, headers, runtime);
  }

  /**
   * Description: 天枢用户聚合状态查询接口
   * Summary: 天枢用户聚合状态查询接口
   */
  async queryDubbridgeUserAggregationinfoEx(request: QueryDubbridgeUserAggregationinfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDubbridgeUserAggregationinfoResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDubbridgeUserAggregationinfoResponse>(await this.doRequest("1.0", "riskplus.dubbridge.user.aggregationinfo.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDubbridgeUserAggregationinfoResponse({}));
  }

  /**
   * Description: 天枢系统优惠券列表查询接口
   * Summary: 天枢系统优惠券列表查询接口
   */
  async queryDubbridgeMarketingCouponlist(request: QueryDubbridgeMarketingCouponlistRequest): Promise<QueryDubbridgeMarketingCouponlistResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDubbridgeMarketingCouponlistEx(request, headers, runtime);
  }

  /**
   * Description: 天枢系统优惠券列表查询接口
   * Summary: 天枢系统优惠券列表查询接口
   */
  async queryDubbridgeMarketingCouponlistEx(request: QueryDubbridgeMarketingCouponlistRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDubbridgeMarketingCouponlistResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDubbridgeMarketingCouponlistResponse>(await this.doRequest("1.0", "riskplus.dubbridge.marketing.couponlist.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDubbridgeMarketingCouponlistResponse({}));
  }

  /**
   * Description: 天枢系统还款方式查询
   * Summary: 天枢系统还款方式查询
   */
  async queryDubbridgeRepaytypeInfo(request: QueryDubbridgeRepaytypeInfoRequest): Promise<QueryDubbridgeRepaytypeInfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDubbridgeRepaytypeInfoEx(request, headers, runtime);
  }

  /**
   * Description: 天枢系统还款方式查询
   * Summary: 天枢系统还款方式查询
   */
  async queryDubbridgeRepaytypeInfoEx(request: QueryDubbridgeRepaytypeInfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDubbridgeRepaytypeInfoResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDubbridgeRepaytypeInfoResponse>(await this.doRequest("1.0", "riskplus.dubbridge.repaytype.info.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDubbridgeRepaytypeInfoResponse({}));
  }

  /**
   * Description: 天枢系统授信额度查询接口-分期付
   * Summary: 天枢系统授信额度查询接口-分期付
   */
  async queryDubbridgeInstallmentCreditamt(request: QueryDubbridgeInstallmentCreditamtRequest): Promise<QueryDubbridgeInstallmentCreditamtResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDubbridgeInstallmentCreditamtEx(request, headers, runtime);
  }

  /**
   * Description: 天枢系统授信额度查询接口-分期付
   * Summary: 天枢系统授信额度查询接口-分期付
   */
  async queryDubbridgeInstallmentCreditamtEx(request: QueryDubbridgeInstallmentCreditamtRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDubbridgeInstallmentCreditamtResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDubbridgeInstallmentCreditamtResponse>(await this.doRequest("1.0", "riskplus.dubbridge.installment.creditamt.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDubbridgeInstallmentCreditamtResponse({}));
  }

  /**
   * Description: 天枢系统取消分期付订单-分期付
   * Summary: 天枢系统取消分期付订单-分期付
   */
  async cancelDubbridgeInstallmentOrder(request: CancelDubbridgeInstallmentOrderRequest): Promise<CancelDubbridgeInstallmentOrderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.cancelDubbridgeInstallmentOrderEx(request, headers, runtime);
  }

  /**
   * Description: 天枢系统取消分期付订单-分期付
   * Summary: 天枢系统取消分期付订单-分期付
   */
  async cancelDubbridgeInstallmentOrderEx(request: CancelDubbridgeInstallmentOrderRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CancelDubbridgeInstallmentOrderResponse> {
    Util.validateModel(request);
    return $tea.cast<CancelDubbridgeInstallmentOrderResponse>(await this.doRequest("1.0", "riskplus.dubbridge.installment.order.cancel", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CancelDubbridgeInstallmentOrderResponse({}));
  }

  /**
   * Description: 天枢系统支用后补充材料推送-分期付
   * Summary: 天枢系统支用后补充材料推送-分期付
   */
  async pushDubbridgeInstallmentSupplement(request: PushDubbridgeInstallmentSupplementRequest): Promise<PushDubbridgeInstallmentSupplementResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pushDubbridgeInstallmentSupplementEx(request, headers, runtime);
  }

  /**
   * Description: 天枢系统支用后补充材料推送-分期付
   * Summary: 天枢系统支用后补充材料推送-分期付
   */
  async pushDubbridgeInstallmentSupplementEx(request: PushDubbridgeInstallmentSupplementRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PushDubbridgeInstallmentSupplementResponse> {
    Util.validateModel(request);
    return $tea.cast<PushDubbridgeInstallmentSupplementResponse>(await this.doRequest("1.0", "riskplus.dubbridge.installment.supplement.push", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PushDubbridgeInstallmentSupplementResponse({}));
  }

  /**
   * Description: 天枢系统分期试算
   * Summary: 天枢系统分期试算
   */
  async queryDubbridgeInstallmentTrial(request: QueryDubbridgeInstallmentTrialRequest): Promise<QueryDubbridgeInstallmentTrialResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDubbridgeInstallmentTrialEx(request, headers, runtime);
  }

  /**
   * Description: 天枢系统分期试算
   * Summary: 天枢系统分期试算
   */
  async queryDubbridgeInstallmentTrialEx(request: QueryDubbridgeInstallmentTrialRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDubbridgeInstallmentTrialResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDubbridgeInstallmentTrialResponse>(await this.doRequest("1.0", "riskplus.dubbridge.installment.trial.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDubbridgeInstallmentTrialResponse({}));
  }

  /**
   * Description: 四要素认证首先调用此接口
   * Summary: 芝麻四要素接口
   */
  async verifyFinserviceZhimaIdentify(request: VerifyFinserviceZhimaIdentifyRequest): Promise<VerifyFinserviceZhimaIdentifyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.verifyFinserviceZhimaIdentifyEx(request, headers, runtime);
  }

  /**
   * Description: 四要素认证首先调用此接口
   * Summary: 芝麻四要素接口
   */
  async verifyFinserviceZhimaIdentifyEx(request: VerifyFinserviceZhimaIdentifyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<VerifyFinserviceZhimaIdentifyResponse> {
    Util.validateModel(request);
    return $tea.cast<VerifyFinserviceZhimaIdentifyResponse>(await this.doRequest("1.0", "riskplus.finservice.zhima.identify.verify", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new VerifyFinserviceZhimaIdentifyResponse({}));
  }

  /**
   * Description:  
   * Summary: 芝麻四要素认证结果查询
   */
  async queryFinserviceZhimaIdentify(request: QueryFinserviceZhimaIdentifyRequest): Promise<QueryFinserviceZhimaIdentifyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryFinserviceZhimaIdentifyEx(request, headers, runtime);
  }

  /**
   * Description:  
   * Summary: 芝麻四要素认证结果查询
   */
  async queryFinserviceZhimaIdentifyEx(request: QueryFinserviceZhimaIdentifyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryFinserviceZhimaIdentifyResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryFinserviceZhimaIdentifyResponse>(await this.doRequest("1.0", "riskplus.finservice.zhima.identify.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryFinserviceZhimaIdentifyResponse({}));
  }

  /**
   * Description: 多源融合平台的数据服务查询接口
   * Summary: 多源融合平台的数据服务查询接口
   */
  async queryMdipDataservice(request: QueryMdipDataserviceRequest): Promise<QueryMdipDataserviceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryMdipDataserviceEx(request, headers, runtime);
  }

  /**
   * Description: 多源融合平台的数据服务查询接口
   * Summary: 多源融合平台的数据服务查询接口
   */
  async queryMdipDataserviceEx(request: QueryMdipDataserviceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryMdipDataserviceResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryMdipDataserviceResponse>(await this.doRequest("1.0", "riskplus.mdip.dataservice.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryMdipDataserviceResponse({}));
  }

  /**
   * Description: 接受op的文件id,支持外网多源文件上传
   * Summary: 接受op的文件id,支持外网多源文件上传
   */
  async receiveMdipParamsFile(request: ReceiveMdipParamsFileRequest): Promise<ReceiveMdipParamsFileResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.receiveMdipParamsFileEx(request, headers, runtime);
  }

  /**
   * Description: 接受op的文件id,支持外网多源文件上传
   * Summary: 接受op的文件id,支持外网多源文件上传
   */
  async receiveMdipParamsFileEx(request: ReceiveMdipParamsFileRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ReceiveMdipParamsFileResponse> {
    if (!Util.isUnset(request.fileObject)) {
      let uploadReq = new CreateAntcloudGatewayxFileUploadRequest({
        authToken: request.authToken,
        apiCode: "riskplus.mdip.params.file.receive",
        fileName: request.fileObjectName,
      });
      let uploadResp = await this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
      if (!AntchainUtil.isSuccess(uploadResp.resultCode, "ok")) {
        let receiveMdipParamsFileResponse = new ReceiveMdipParamsFileResponse({
          reqMsgId: uploadResp.reqMsgId,
          resultCode: uploadResp.resultCode,
          resultMsg: uploadResp.resultMsg,
        });
        return receiveMdipParamsFileResponse;
      }

      let uploadHeaders = AntchainUtil.parseUploadHeaders(uploadResp.uploadHeaders);
      await AntchainUtil.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
      request.fileId = uploadResp.fileId;
      request.fileObject = null;
    }

    Util.validateModel(request);
    return $tea.cast<ReceiveMdipParamsFileResponse>(await this.doRequest("1.0", "riskplus.mdip.params.file.receive", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ReceiveMdipParamsFileResponse({}));
  }

  /**
   * Description: 接受op的文件id,支持风险大脑文件上传
   * Summary: 接受op的文件id,支持风险大脑文件上传
   */
  async receiveMdipParamsRbbfile(request: ReceiveMdipParamsRbbfileRequest): Promise<ReceiveMdipParamsRbbfileResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.receiveMdipParamsRbbfileEx(request, headers, runtime);
  }

  /**
   * Description: 接受op的文件id,支持风险大脑文件上传
   * Summary: 接受op的文件id,支持风险大脑文件上传
   */
  async receiveMdipParamsRbbfileEx(request: ReceiveMdipParamsRbbfileRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ReceiveMdipParamsRbbfileResponse> {
    if (!Util.isUnset(request.fileObject)) {
      let uploadReq = new CreateAntcloudGatewayxFileUploadRequest({
        authToken: request.authToken,
        apiCode: "riskplus.mdip.params.rbbfile.receive",
        fileName: request.fileObjectName,
      });
      let uploadResp = await this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
      if (!AntchainUtil.isSuccess(uploadResp.resultCode, "ok")) {
        let receiveMdipParamsRbbfileResponse = new ReceiveMdipParamsRbbfileResponse({
          reqMsgId: uploadResp.reqMsgId,
          resultCode: uploadResp.resultCode,
          resultMsg: uploadResp.resultMsg,
        });
        return receiveMdipParamsRbbfileResponse;
      }

      let uploadHeaders = AntchainUtil.parseUploadHeaders(uploadResp.uploadHeaders);
      await AntchainUtil.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
      request.fileId = uploadResp.fileId;
      request.fileObject = null;
    }

    Util.validateModel(request);
    return $tea.cast<ReceiveMdipParamsRbbfileResponse>(await this.doRequest("1.0", "riskplus.mdip.params.rbbfile.receive", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ReceiveMdipParamsRbbfileResponse({}));
  }

  /**
   * Description: 多源平台审批回调接口
   * Summary: 多源平台审批回调接口
   */
  async callbackMdipAudit(request: CallbackMdipAuditRequest): Promise<CallbackMdipAuditResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.callbackMdipAuditEx(request, headers, runtime);
  }

  /**
   * Description: 多源平台审批回调接口
   * Summary: 多源平台审批回调接口
   */
  async callbackMdipAuditEx(request: CallbackMdipAuditRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CallbackMdipAuditResponse> {
    Util.validateModel(request);
    return $tea.cast<CallbackMdipAuditResponse>(await this.doRequest("1.0", "riskplus.mdip.audit.callback", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CallbackMdipAuditResponse({}));
  }

  /**
   * Description: 该接口仅限于POC场景下使用， 关键时期会执行限流操作，并且不会通知到上游依赖服务。
   * Summary: 多源融合平台的POC数据服务查询接口
   */
  async queryMdipDataservicePoc(request: QueryMdipDataservicePocRequest): Promise<QueryMdipDataservicePocResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryMdipDataservicePocEx(request, headers, runtime);
  }

  /**
   * Description: 该接口仅限于POC场景下使用， 关键时期会执行限流操作，并且不会通知到上游依赖服务。
   * Summary: 多源融合平台的POC数据服务查询接口
   */
  async queryMdipDataservicePocEx(request: QueryMdipDataservicePocRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryMdipDataservicePocResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryMdipDataservicePocResponse>(await this.doRequest("1.0", "riskplus.mdip.dataservice.poc.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryMdipDataservicePocResponse({}));
  }

  /**
   * Description: 查询默认租户的供应商列表
   * Summary: 查询默认租户的供应商列表
   */
  async listMdipDefaultSupplier(request: ListMdipDefaultSupplierRequest): Promise<ListMdipDefaultSupplierResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listMdipDefaultSupplierEx(request, headers, runtime);
  }

  /**
   * Description: 查询默认租户的供应商列表
   * Summary: 查询默认租户的供应商列表
   */
  async listMdipDefaultSupplierEx(request: ListMdipDefaultSupplierRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListMdipDefaultSupplierResponse> {
    Util.validateModel(request);
    return $tea.cast<ListMdipDefaultSupplierResponse>(await this.doRequest("1.0", "riskplus.mdip.default.supplier.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListMdipDefaultSupplierResponse({}));
  }

  /**
   * Description: 数据回调
   * Summary: 云凤蝶回调参数
   */
  async callbackMdipYunfengdieParams(request: CallbackMdipYunfengdieParamsRequest): Promise<CallbackMdipYunfengdieParamsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.callbackMdipYunfengdieParamsEx(request, headers, runtime);
  }

  /**
   * Description: 数据回调
   * Summary: 云凤蝶回调参数
   */
  async callbackMdipYunfengdieParamsEx(request: CallbackMdipYunfengdieParamsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CallbackMdipYunfengdieParamsResponse> {
    Util.validateModel(request);
    return $tea.cast<CallbackMdipYunfengdieParamsResponse>(await this.doRequest("1.0", "riskplus.mdip.yunfengdie.params.callback", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CallbackMdipYunfengdieParamsResponse({}));
  }

  /**
   * Description: 批量实时触达接口
   * Summary: 发起触达任务
   */
  async applyQmpRtBatchmarketing(request: ApplyQmpRtBatchmarketingRequest): Promise<ApplyQmpRtBatchmarketingResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyQmpRtBatchmarketingEx(request, headers, runtime);
  }

  /**
   * Description: 批量实时触达接口
   * Summary: 发起触达任务
   */
  async applyQmpRtBatchmarketingEx(request: ApplyQmpRtBatchmarketingRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyQmpRtBatchmarketingResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyQmpRtBatchmarketingResponse>(await this.doRequest("1.0", "riskplus.qmp.rt.batchmarketing.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyQmpRtBatchmarketingResponse({}));
  }

  /**
   * Description: 文本短信批量发送接口
   * Summary: 文本短信批量发送接口
   */
  async sendQmpTextsmsBatch(request: SendQmpTextsmsBatchRequest): Promise<SendQmpTextsmsBatchResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.sendQmpTextsmsBatchEx(request, headers, runtime);
  }

  /**
   * Description: 文本短信批量发送接口
   * Summary: 文本短信批量发送接口
   */
  async sendQmpTextsmsBatchEx(request: SendQmpTextsmsBatchRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SendQmpTextsmsBatchResponse> {
    Util.validateModel(request);
    return $tea.cast<SendQmpTextsmsBatchResponse>(await this.doRequest("1.0", "riskplus.qmp.textsms.batch.send", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SendQmpTextsmsBatchResponse({}));
  }

  /**
   * Description: 发起AI外呼
   * Summary: 发起AI外呼
   */
  async applyQmpRobotcall(request: ApplyQmpRobotcallRequest): Promise<ApplyQmpRobotcallResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyQmpRobotcallEx(request, headers, runtime);
  }

  /**
   * Description: 发起AI外呼
   * Summary: 发起AI外呼
   */
  async applyQmpRobotcallEx(request: ApplyQmpRobotcallRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyQmpRobotcallResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyQmpRobotcallResponse>(await this.doRequest("1.0", "riskplus.qmp.robotcall.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyQmpRobotcallResponse({}));
  }

  /**
   * Description: 卡片短信批量发送接口
   * Summary: 卡片短信批量发送接口
   */
  async sendQmpCardsmsBatch(request: SendQmpCardsmsBatchRequest): Promise<SendQmpCardsmsBatchResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.sendQmpCardsmsBatchEx(request, headers, runtime);
  }

  /**
   * Description: 卡片短信批量发送接口
   * Summary: 卡片短信批量发送接口
   */
  async sendQmpCardsmsBatchEx(request: SendQmpCardsmsBatchRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SendQmpCardsmsBatchResponse> {
    Util.validateModel(request);
    return $tea.cast<SendQmpCardsmsBatchResponse>(await this.doRequest("1.0", "riskplus.qmp.cardsms.batch.send", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SendQmpCardsmsBatchResponse({}));
  }

  /**
   * Description: 上行短信回调
   * Summary: 上行短信回调
   */
  async callbackQmpSmsUp(request: CallbackQmpSmsUpRequest): Promise<CallbackQmpSmsUpResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.callbackQmpSmsUpEx(request, headers, runtime);
  }

  /**
   * Description: 上行短信回调
   * Summary: 上行短信回调
   */
  async callbackQmpSmsUpEx(request: CallbackQmpSmsUpRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CallbackQmpSmsUpResponse> {
    Util.validateModel(request);
    return $tea.cast<CallbackQmpSmsUpResponse>(await this.doRequest("1.0", "riskplus.qmp.sms.up.callback", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CallbackQmpSmsUpResponse({}));
  }

  /**
   * Description: 短信状态回调接口
   * Summary: 短信状态回调接口
   */
  async callbackQmpSmsReport(request: CallbackQmpSmsReportRequest): Promise<CallbackQmpSmsReportResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.callbackQmpSmsReportEx(request, headers, runtime);
  }

  /**
   * Description: 短信状态回调接口
   * Summary: 短信状态回调接口
   */
  async callbackQmpSmsReportEx(request: CallbackQmpSmsReportRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CallbackQmpSmsReportResponse> {
    Util.validateModel(request);
    return $tea.cast<CallbackQmpSmsReportResponse>(await this.doRequest("1.0", "riskplus.qmp.sms.report.callback", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CallbackQmpSmsReportResponse({}));
  }

  /**
   * Description: 数字短信批量发送接口（单模板）
   * Summary: 数字短信批量发送接口（单模板）
   */
  async sendQmpDigitalsmsBatch(request: SendQmpDigitalsmsBatchRequest): Promise<SendQmpDigitalsmsBatchResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.sendQmpDigitalsmsBatchEx(request, headers, runtime);
  }

  /**
   * Description: 数字短信批量发送接口（单模板）
   * Summary: 数字短信批量发送接口（单模板）
   */
  async sendQmpDigitalsmsBatchEx(request: SendQmpDigitalsmsBatchRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SendQmpDigitalsmsBatchResponse> {
    Util.validateModel(request);
    return $tea.cast<SendQmpDigitalsmsBatchResponse>(await this.doRequest("1.0", "riskplus.qmp.digitalsms.batch.send", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SendQmpDigitalsmsBatchResponse({}));
  }

  /**
   * Description: 新接入ai外呼服务商的回调接口
   * Summary:  ai外呼回调接口
   */
  async callbackQmpRobotcall(request: CallbackQmpRobotcallRequest): Promise<CallbackQmpRobotcallResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.callbackQmpRobotcallEx(request, headers, runtime);
  }

  /**
   * Description: 新接入ai外呼服务商的回调接口
   * Summary:  ai外呼回调接口
   */
  async callbackQmpRobotcallEx(request: CallbackQmpRobotcallRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CallbackQmpRobotcallResponse> {
    Util.validateModel(request);
    return $tea.cast<CallbackQmpRobotcallResponse>(await this.doRequest("1.0", "riskplus.qmp.robotcall.callback", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CallbackQmpRobotcallResponse({}));
  }

  /**
   * Description: 查询ai外呼任务详情
   * Summary:  查询ai外呼任务详情
   */
  async queryQmpRobotcallDetail(request: QueryQmpRobotcallDetailRequest): Promise<QueryQmpRobotcallDetailResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryQmpRobotcallDetailEx(request, headers, runtime);
  }

  /**
   * Description: 查询ai外呼任务详情
   * Summary:  查询ai外呼任务详情
   */
  async queryQmpRobotcallDetailEx(request: QueryQmpRobotcallDetailRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryQmpRobotcallDetailResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryQmpRobotcallDetailResponse>(await this.doRequest("1.0", "riskplus.qmp.robotcall.detail.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryQmpRobotcallDetailResponse({}));
  }

  /**
   * Description: 流量风控回执统计查询
   * Summary: 流量风控回执统计查询
   */
  async queryQmpDataaccessStatistic(request: QueryQmpDataaccessStatisticRequest): Promise<QueryQmpDataaccessStatisticResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryQmpDataaccessStatisticEx(request, headers, runtime);
  }

  /**
   * Description: 流量风控回执统计查询
   * Summary: 流量风控回执统计查询
   */
  async queryQmpDataaccessStatisticEx(request: QueryQmpDataaccessStatisticRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryQmpDataaccessStatisticResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryQmpDataaccessStatisticResponse>(await this.doRequest("1.0", "riskplus.qmp.dataaccess.statistic.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryQmpDataaccessStatisticResponse({}));
  }

  /**
   * Description: 外呼任务统计查询接口
   * Summary:  外呼任务统计查询接口
   */
  async queryQmpRobotcallStatisticinfo(request: QueryQmpRobotcallStatisticinfoRequest): Promise<QueryQmpRobotcallStatisticinfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryQmpRobotcallStatisticinfoEx(request, headers, runtime);
  }

  /**
   * Description: 外呼任务统计查询接口
   * Summary:  外呼任务统计查询接口
   */
  async queryQmpRobotcallStatisticinfoEx(request: QueryQmpRobotcallStatisticinfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryQmpRobotcallStatisticinfoResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryQmpRobotcallStatisticinfoResponse>(await this.doRequest("1.0", "riskplus.qmp.robotcall.statisticinfo.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryQmpRobotcallStatisticinfoResponse({}));
  }

  /**
   * Description: 触达执行任务详情查询
   * Summary: 触达执行任务详情查询
   */
  async batchqueryQmpTaskDetail(request: BatchqueryQmpTaskDetailRequest): Promise<BatchqueryQmpTaskDetailResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchqueryQmpTaskDetailEx(request, headers, runtime);
  }

  /**
   * Description: 触达执行任务详情查询
   * Summary: 触达执行任务详情查询
   */
  async batchqueryQmpTaskDetailEx(request: BatchqueryQmpTaskDetailRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchqueryQmpTaskDetailResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchqueryQmpTaskDetailResponse>(await this.doRequest("1.0", "riskplus.qmp.task.detail.batchquery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchqueryQmpTaskDetailResponse({}));
  }

  /**
   * Description: 卡片短信支持能力查询
   * Summary: 卡片短信支持能力查询
   */
  async queryQmpCardsmsSupport(request: QueryQmpCardsmsSupportRequest): Promise<QueryQmpCardsmsSupportResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryQmpCardsmsSupportEx(request, headers, runtime);
  }

  /**
   * Description: 卡片短信支持能力查询
   * Summary: 卡片短信支持能力查询
   */
  async queryQmpCardsmsSupportEx(request: QueryQmpCardsmsSupportRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryQmpCardsmsSupportResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryQmpCardsmsSupportResponse>(await this.doRequest("1.0", "riskplus.qmp.cardsms.support.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryQmpCardsmsSupportResponse({}));
  }

  /**
   * Description: 流量风控查询外呼策略详情
   * Summary: 流量风控查询外呼策略详情
   */
  async batchqueryQmpActionplanDetail(request: BatchqueryQmpActionplanDetailRequest): Promise<BatchqueryQmpActionplanDetailResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchqueryQmpActionplanDetailEx(request, headers, runtime);
  }

  /**
   * Description: 流量风控查询外呼策略详情
   * Summary: 流量风控查询外呼策略详情
   */
  async batchqueryQmpActionplanDetailEx(request: BatchqueryQmpActionplanDetailRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchqueryQmpActionplanDetailResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchqueryQmpActionplanDetailResponse>(await this.doRequest("1.0", "riskplus.qmp.actionplan.detail.batchquery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchqueryQmpActionplanDetailResponse({}));
  }

  /**
   * Description: 调用流量风控(原营销盾)空号检测
   * Summary: 调用流量风控(原营销盾)空号检测
   */
  async applyQmpPhonenumberstatusforsms(request: ApplyQmpPhonenumberstatusforsmsRequest): Promise<ApplyQmpPhonenumberstatusforsmsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyQmpPhonenumberstatusforsmsEx(request, headers, runtime);
  }

  /**
   * Description: 调用流量风控(原营销盾)空号检测
   * Summary: 调用流量风控(原营销盾)空号检测
   */
  async applyQmpPhonenumberstatusforsmsEx(request: ApplyQmpPhonenumberstatusforsmsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyQmpPhonenumberstatusforsmsResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyQmpPhonenumberstatusforsmsResponse>(await this.doRequest("1.0", "riskplus.qmp.phonenumberstatusforsms.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyQmpPhonenumberstatusforsmsResponse({}));
  }

  /**
   * Description: 分页查询租户外呼策略
   * Summary: 流量风控租户场景批量信息查询
   */
  async batchqueryQmpTenantActionplaninfo(request: BatchqueryQmpTenantActionplaninfoRequest): Promise<BatchqueryQmpTenantActionplaninfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchqueryQmpTenantActionplaninfoEx(request, headers, runtime);
  }

  /**
   * Description: 分页查询租户外呼策略
   * Summary: 流量风控租户场景批量信息查询
   */
  async batchqueryQmpTenantActionplaninfoEx(request: BatchqueryQmpTenantActionplaninfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchqueryQmpTenantActionplaninfoResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchqueryQmpTenantActionplaninfoResponse>(await this.doRequest("1.0", "riskplus.qmp.tenant.actionplaninfo.batchquery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchqueryQmpTenantActionplaninfoResponse({}));
  }

  /**
   * Description: 流量风控租户场景信息查询
   * Summary: 流量风控租户场景信息查询
   */
  async queryQmpTenantActionplaninfo(request: QueryQmpTenantActionplaninfoRequest): Promise<QueryQmpTenantActionplaninfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryQmpTenantActionplaninfoEx(request, headers, runtime);
  }

  /**
   * Description: 流量风控租户场景信息查询
   * Summary: 流量风控租户场景信息查询
   */
  async queryQmpTenantActionplaninfoEx(request: QueryQmpTenantActionplaninfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryQmpTenantActionplaninfoResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryQmpTenantActionplaninfoResponse>(await this.doRequest("1.0", "riskplus.qmp.tenant.actionplaninfo.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryQmpTenantActionplaninfoResponse({}));
  }

  /**
   * Description: 分页查询cpaas短信模板
   * Summary: cpaas短信模板分页查询
   */
  async queryQmpCpaassmsTemplate(request: QueryQmpCpaassmsTemplateRequest): Promise<QueryQmpCpaassmsTemplateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryQmpCpaassmsTemplateEx(request, headers, runtime);
  }

  /**
   * Description: 分页查询cpaas短信模板
   * Summary: cpaas短信模板分页查询
   */
  async queryQmpCpaassmsTemplateEx(request: QueryQmpCpaassmsTemplateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryQmpCpaassmsTemplateResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryQmpCpaassmsTemplateResponse>(await this.doRequest("1.0", "riskplus.qmp.cpaassms.template.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryQmpCpaassmsTemplateResponse({}));
  }

  /**
   * Description: 根据sceneStrategyId分页查询文本短信模板
   * Summary: 文本短信模板查询
   */
  async queryQmpTextsmsTemplate(request: QueryQmpTextsmsTemplateRequest): Promise<QueryQmpTextsmsTemplateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryQmpTextsmsTemplateEx(request, headers, runtime);
  }

  /**
   * Description: 根据sceneStrategyId分页查询文本短信模板
   * Summary: 文本短信模板查询
   */
  async queryQmpTextsmsTemplateEx(request: QueryQmpTextsmsTemplateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryQmpTextsmsTemplateResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryQmpTextsmsTemplateResponse>(await this.doRequest("1.0", "riskplus.qmp.textsms.template.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryQmpTextsmsTemplateResponse({}));
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

  /**
   * Description: 蚁盾数据回流推送，用于客户定制json数据
   * Summary: 蚁盾数据回流json格式推送
   */
  async pushQmpBackflowJsondata(request: PushQmpBackflowJsondataRequest): Promise<PushQmpBackflowJsondataResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pushQmpBackflowJsondataEx(request, headers, runtime);
  }

  /**
   * Description: 蚁盾数据回流推送，用于客户定制json数据
   * Summary: 蚁盾数据回流json格式推送
   */
  async pushQmpBackflowJsondataEx(request: PushQmpBackflowJsondataRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PushQmpBackflowJsondataResponse> {
    Util.validateModel(request);
    return $tea.cast<PushQmpBackflowJsondataResponse>(await this.doRequest("1.0", "riskplus.qmp.backflow.jsondata.push", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PushQmpBackflowJsondataResponse({}));
  }

  /**
   * Description: 智选平台混合策略批量分层服务
   * Summary: 智选平台-混合策略批量分层服务
   */
  async batchqueryQmpRtMixedmarketing(request: BatchqueryQmpRtMixedmarketingRequest): Promise<BatchqueryQmpRtMixedmarketingResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchqueryQmpRtMixedmarketingEx(request, headers, runtime);
  }

  /**
   * Description: 智选平台混合策略批量分层服务
   * Summary: 智选平台-混合策略批量分层服务
   */
  async batchqueryQmpRtMixedmarketingEx(request: BatchqueryQmpRtMixedmarketingRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchqueryQmpRtMixedmarketingResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchqueryQmpRtMixedmarketingResponse>(await this.doRequest("1.0", "riskplus.qmp.rt.mixedmarketing.batchquery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchqueryQmpRtMixedmarketingResponse({}));
  }

  /**
   * Description: 11
   * Summary: qmp离线托管文件导入
   */
  async uploadQmpOfflinehostplan(request: UploadQmpOfflinehostplanRequest): Promise<UploadQmpOfflinehostplanResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.uploadQmpOfflinehostplanEx(request, headers, runtime);
  }

  /**
   * Description: 11
   * Summary: qmp离线托管文件导入
   */
  async uploadQmpOfflinehostplanEx(request: UploadQmpOfflinehostplanRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UploadQmpOfflinehostplanResponse> {
    if (!Util.isUnset(request.fileObject)) {
      let uploadReq = new CreateAntcloudGatewayxFileUploadRequest({
        authToken: request.authToken,
        apiCode: "riskplus.qmp.offlinehostplan.upload",
        fileName: request.fileObjectName,
      });
      let uploadResp = await this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
      if (!AntchainUtil.isSuccess(uploadResp.resultCode, "ok")) {
        let uploadQmpOfflinehostplanResponse = new UploadQmpOfflinehostplanResponse({
          reqMsgId: uploadResp.reqMsgId,
          resultCode: uploadResp.resultCode,
          resultMsg: uploadResp.resultMsg,
        });
        return uploadQmpOfflinehostplanResponse;
      }

      let uploadHeaders = AntchainUtil.parseUploadHeaders(uploadResp.uploadHeaders);
      await AntchainUtil.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
      request.fileId = uploadResp.fileId;
      request.fileObject = null;
    }

    Util.validateModel(request);
    return $tea.cast<UploadQmpOfflinehostplanResponse>(await this.doRequest("1.0", "riskplus.qmp.offlinehostplan.upload", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UploadQmpOfflinehostplanResponse({}));
  }

  /**
   * Description: 安全托管分层结果查询接口
   * Summary: 安全托管分层结果查询接口
   */
  async queryQmpOfflinehostplanDecisionresult(request: QueryQmpOfflinehostplanDecisionresultRequest): Promise<QueryQmpOfflinehostplanDecisionresultResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryQmpOfflinehostplanDecisionresultEx(request, headers, runtime);
  }

  /**
   * Description: 安全托管分层结果查询接口
   * Summary: 安全托管分层结果查询接口
   */
  async queryQmpOfflinehostplanDecisionresultEx(request: QueryQmpOfflinehostplanDecisionresultRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryQmpOfflinehostplanDecisionresultResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryQmpOfflinehostplanDecisionresultResponse>(await this.doRequest("1.0", "riskplus.qmp.offlinehostplan.decisionresult.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryQmpOfflinehostplanDecisionresultResponse({}));
  }

  /**
   * Description: 企管盾票税交接授权信息表的同步
   * Summary: 企管盾票税交接授权信息表的同步
   */
  async syncRdaasTaxAuthinfo(request: SyncRdaasTaxAuthinfoRequest): Promise<SyncRdaasTaxAuthinfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.syncRdaasTaxAuthinfoEx(request, headers, runtime);
  }

  /**
   * Description: 企管盾票税交接授权信息表的同步
   * Summary: 企管盾票税交接授权信息表的同步
   */
  async syncRdaasTaxAuthinfoEx(request: SyncRdaasTaxAuthinfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SyncRdaasTaxAuthinfoResponse> {
    Util.validateModel(request);
    return $tea.cast<SyncRdaasTaxAuthinfoResponse>(await this.doRequest("1.0", "riskplus.rdaas.tax.authinfo.sync", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SyncRdaasTaxAuthinfoResponse({}));
  }

  /**
   * Description: 企管盾票税交接授权记录表的同步
   * Summary: 企管盾票税交接授权记录表的同步
   */
  async syncRdaasTaxAuthorder(request: SyncRdaasTaxAuthorderRequest): Promise<SyncRdaasTaxAuthorderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.syncRdaasTaxAuthorderEx(request, headers, runtime);
  }

  /**
   * Description: 企管盾票税交接授权记录表的同步
   * Summary: 企管盾票税交接授权记录表的同步
   */
  async syncRdaasTaxAuthorderEx(request: SyncRdaasTaxAuthorderRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SyncRdaasTaxAuthorderResponse> {
    Util.validateModel(request);
    return $tea.cast<SyncRdaasTaxAuthorderResponse>(await this.doRequest("1.0", "riskplus.rdaas.tax.authorder.sync", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SyncRdaasTaxAuthorderResponse({}));
  }

  /**
   * Description: 企管盾票税交接回调通知
   * Summary: 企管盾票税交接回调通知
   */
  async notifyRdaasTaxCallback(request: NotifyRdaasTaxCallbackRequest): Promise<NotifyRdaasTaxCallbackResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.notifyRdaasTaxCallbackEx(request, headers, runtime);
  }

  /**
   * Description: 企管盾票税交接回调通知
   * Summary: 企管盾票税交接回调通知
   */
  async notifyRdaasTaxCallbackEx(request: NotifyRdaasTaxCallbackRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<NotifyRdaasTaxCallbackResponse> {
    Util.validateModel(request);
    return $tea.cast<NotifyRdaasTaxCallbackResponse>(await this.doRequest("1.0", "riskplus.rdaas.tax.callback.notify", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new NotifyRdaasTaxCallbackResponse({}));
  }

  /**
   * Description: 企管盾票税交接RPA决策服务查询
   * Summary: 企管盾票税交接RPA决策服务查询
   */
  async queryRdaasTaxRpadecisionservice(request: QueryRdaasTaxRpadecisionserviceRequest): Promise<QueryRdaasTaxRpadecisionserviceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryRdaasTaxRpadecisionserviceEx(request, headers, runtime);
  }

  /**
   * Description: 企管盾票税交接RPA决策服务查询
   * Summary: 企管盾票税交接RPA决策服务查询
   */
  async queryRdaasTaxRpadecisionserviceEx(request: QueryRdaasTaxRpadecisionserviceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryRdaasTaxRpadecisionserviceResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryRdaasTaxRpadecisionserviceResponse>(await this.doRequest("1.0", "riskplus.rdaas.tax.rpadecisionservice.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryRdaasTaxRpadecisionserviceResponse({}));
  }

  /**
   * Description: 企管盾票税交接RPA决策服务指标查询
   * Summary: 企管盾票税交接RPA决策服务指标查询
   */
  async queryRdaasTaxRpadecisionindicator(request: QueryRdaasTaxRpadecisionindicatorRequest): Promise<QueryRdaasTaxRpadecisionindicatorResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryRdaasTaxRpadecisionindicatorEx(request, headers, runtime);
  }

  /**
   * Description: 企管盾票税交接RPA决策服务指标查询
   * Summary: 企管盾票税交接RPA决策服务指标查询
   */
  async queryRdaasTaxRpadecisionindicatorEx(request: QueryRdaasTaxRpadecisionindicatorRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryRdaasTaxRpadecisionindicatorResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryRdaasTaxRpadecisionindicatorResponse>(await this.doRequest("1.0", "riskplus.rdaas.tax.rpadecisionindicator.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryRdaasTaxRpadecisionindicatorResponse({}));
  }

  /**
   * Description: 企管盾票税交接要素授权决策查询
   * Summary: 企管盾票税交接要素授权决策查询
   */
  async queryRdaasTaxSimpleauthdecision(request: QueryRdaasTaxSimpleauthdecisionRequest): Promise<QueryRdaasTaxSimpleauthdecisionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryRdaasTaxSimpleauthdecisionEx(request, headers, runtime);
  }

  /**
   * Description: 企管盾票税交接要素授权决策查询
   * Summary: 企管盾票税交接要素授权决策查询
   */
  async queryRdaasTaxSimpleauthdecisionEx(request: QueryRdaasTaxSimpleauthdecisionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryRdaasTaxSimpleauthdecisionResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryRdaasTaxSimpleauthdecisionResponse>(await this.doRequest("1.0", "riskplus.rdaas.tax.simpleauthdecision.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryRdaasTaxSimpleauthdecisionResponse({}));
  }

  /**
   * Description: rfc外部文件上传
   * Summary: rfc外部文件上传
   */
  async receiveRfcParamsFile(request: ReceiveRfcParamsFileRequest): Promise<ReceiveRfcParamsFileResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.receiveRfcParamsFileEx(request, headers, runtime);
  }

  /**
   * Description: rfc外部文件上传
   * Summary: rfc外部文件上传
   */
  async receiveRfcParamsFileEx(request: ReceiveRfcParamsFileRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ReceiveRfcParamsFileResponse> {
    if (!Util.isUnset(request.fileObject)) {
      let uploadReq = new CreateAntcloudGatewayxFileUploadRequest({
        authToken: request.authToken,
        apiCode: "riskplus.rfc.params.file.receive",
        fileName: request.fileObjectName,
      });
      let uploadResp = await this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
      if (!AntchainUtil.isSuccess(uploadResp.resultCode, "ok")) {
        let receiveRfcParamsFileResponse = new ReceiveRfcParamsFileResponse({
          reqMsgId: uploadResp.reqMsgId,
          resultCode: uploadResp.resultCode,
          resultMsg: uploadResp.resultMsg,
        });
        return receiveRfcParamsFileResponse;
      }

      let uploadHeaders = AntchainUtil.parseUploadHeaders(uploadResp.uploadHeaders);
      await AntchainUtil.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
      request.fileId = uploadResp.fileId;
      request.fileObject = null;
    }

    Util.validateModel(request);
    return $tea.cast<ReceiveRfcParamsFileResponse>(await this.doRequest("1.0", "riskplus.rfc.params.file.receive", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ReceiveRfcParamsFileResponse({}));
  }

  /**
   * Description: rfc外呼名单文件上传接口
   * Summary: rfc外呼名单上传接口
   */
  async uploadRfcAiboundFile(request: UploadRfcAiboundFileRequest): Promise<UploadRfcAiboundFileResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.uploadRfcAiboundFileEx(request, headers, runtime);
  }

  /**
   * Description: rfc外呼名单文件上传接口
   * Summary: rfc外呼名单上传接口
   */
  async uploadRfcAiboundFileEx(request: UploadRfcAiboundFileRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UploadRfcAiboundFileResponse> {
    if (!Util.isUnset(request.fileObject)) {
      let uploadReq = new CreateAntcloudGatewayxFileUploadRequest({
        authToken: request.authToken,
        apiCode: "riskplus.rfc.aibound.file.upload",
        fileName: request.fileObjectName,
      });
      let uploadResp = await this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
      if (!AntchainUtil.isSuccess(uploadResp.resultCode, "ok")) {
        let uploadRfcAiboundFileResponse = new UploadRfcAiboundFileResponse({
          reqMsgId: uploadResp.reqMsgId,
          resultCode: uploadResp.resultCode,
          resultMsg: uploadResp.resultMsg,
        });
        return uploadRfcAiboundFileResponse;
      }

      let uploadHeaders = AntchainUtil.parseUploadHeaders(uploadResp.uploadHeaders);
      await AntchainUtil.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
      request.fileId = uploadResp.fileId;
      request.fileObject = null;
    }

    Util.validateModel(request);
    return $tea.cast<UploadRfcAiboundFileResponse>(await this.doRequest("1.0", "riskplus.rfc.aibound.file.upload", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UploadRfcAiboundFileResponse({}));
  }

  /**
   * Description: 提供给外部的数据服务接口内容获取
   * Summary: 提供给外部的数据服务接口内容获取
   */
  async queryRfcOdpsLindorm(request: QueryRfcOdpsLindormRequest): Promise<QueryRfcOdpsLindormResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryRfcOdpsLindormEx(request, headers, runtime);
  }

  /**
   * Description: 提供给外部的数据服务接口内容获取
   * Summary: 提供给外部的数据服务接口内容获取
   */
  async queryRfcOdpsLindormEx(request: QueryRfcOdpsLindormRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryRfcOdpsLindormResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryRfcOdpsLindormResponse>(await this.doRequest("1.0", "riskplus.rfc.odps.lindorm.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryRfcOdpsLindormResponse({}));
  }

  /**
   * Description: 风险大脑企业版通用查询接口
   * Summary: 【已废弃】
   */
  async queryRbbGenericInvoke(request: QueryRbbGenericInvokeRequest): Promise<QueryRbbGenericInvokeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryRbbGenericInvokeEx(request, headers, runtime);
  }

  /**
   * Description: 风险大脑企业版通用查询接口
   * Summary: 【已废弃】
   */
  async queryRbbGenericInvokeEx(request: QueryRbbGenericInvokeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryRbbGenericInvokeResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryRbbGenericInvokeResponse>(await this.doRequest("1.0", "riskplus.rbb.generic.invoke.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryRbbGenericInvokeResponse({}));
  }

  /**
   * Description: 风险大脑企业版token生成
   * Summary: 【已废弃】
   */
  async createRbbToken(request: CreateRbbTokenRequest): Promise<CreateRbbTokenResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createRbbTokenEx(request, headers, runtime);
  }

  /**
   * Description: 风险大脑企业版token生成
   * Summary: 【已废弃】
   */
  async createRbbTokenEx(request: CreateRbbTokenRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateRbbTokenResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateRbbTokenResponse>(await this.doRequest("1.0", "riskplus.rbb.token.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateRbbTokenResponse({}));
  }

  /**
   * Description: 获取风险大脑企业版登录token
   * Summary: 【已废弃】
   */
  async createRbbApiGwtoken(request: CreateRbbApiGwtokenRequest): Promise<CreateRbbApiGwtokenResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createRbbApiGwtokenEx(request, headers, runtime);
  }

  /**
   * Description: 获取风险大脑企业版登录token
   * Summary: 【已废弃】
   */
  async createRbbApiGwtokenEx(request: CreateRbbApiGwtokenRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateRbbApiGwtokenResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateRbbApiGwtokenResponse>(await this.doRequest("1.0", "riskplus.rbb.api.gwtoken.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateRbbApiGwtokenResponse({}));
  }

  /**
   * Description: 风险大脑企业版通用查询OpenAPI
   * Summary: 风险大脑企业版通用查询OpenAPI
   */
  async queryRbbGeneral(request: QueryRbbGeneralRequest): Promise<QueryRbbGeneralResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryRbbGeneralEx(request, headers, runtime);
  }

  /**
   * Description: 风险大脑企业版通用查询OpenAPI
   * Summary: 风险大脑企业版通用查询OpenAPI
   */
  async queryRbbGeneralEx(request: QueryRbbGeneralRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryRbbGeneralResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryRbbGeneralResponse>(await this.doRequest("1.0", "riskplus.rbb.general.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryRbbGeneralResponse({}));
  }

  /**
   * Description: 获取登录Token
   * Summary: 获取登录Token
   */
  async getRbbLoginToken(request: GetRbbLoginTokenRequest): Promise<GetRbbLoginTokenResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getRbbLoginTokenEx(request, headers, runtime);
  }

  /**
   * Description: 获取登录Token
   * Summary: 获取登录Token
   */
  async getRbbLoginTokenEx(request: GetRbbLoginTokenRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetRbbLoginTokenResponse> {
    Util.validateModel(request);
    return $tea.cast<GetRbbLoginTokenResponse>(await this.doRequest("1.0", "riskplus.rbb.login.token.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetRbbLoginTokenResponse({}));
  }

  /**
   * Description: 风险大脑企业版创建租户
   * Summary: 风险大脑企业版创建租户
   */
  async createRbbTenant(request: CreateRbbTenantRequest): Promise<CreateRbbTenantResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createRbbTenantEx(request, headers, runtime);
  }

  /**
   * Description: 风险大脑企业版创建租户
   * Summary: 风险大脑企业版创建租户
   */
  async createRbbTenantEx(request: CreateRbbTenantRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateRbbTenantResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateRbbTenantResponse>(await this.doRequest("1.0", "riskplus.rbb.tenant.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateRbbTenantResponse({}));
  }

  /**
   * Description: 风险大脑企业版创建用户
   * Summary: 风险大脑企业版创建用户
   */
  async createRbbUser(request: CreateRbbUserRequest): Promise<CreateRbbUserResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createRbbUserEx(request, headers, runtime);
  }

  /**
   * Description: 风险大脑企业版创建用户
   * Summary: 风险大脑企业版创建用户
   */
  async createRbbUserEx(request: CreateRbbUserRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateRbbUserResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateRbbUserResponse>(await this.doRequest("1.0", "riskplus.rbb.user.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateRbbUserResponse({}));
  }

  /**
   * Description: 企业准入接口
   * Summary: 企业准入
   */
  async execRbbCompanyGuard(request: ExecRbbCompanyGuardRequest): Promise<ExecRbbCompanyGuardResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execRbbCompanyGuardEx(request, headers, runtime);
  }

  /**
   * Description: 企业准入接口
   * Summary: 企业准入
   */
  async execRbbCompanyGuardEx(request: ExecRbbCompanyGuardRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecRbbCompanyGuardResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecRbbCompanyGuardResponse>(await this.doRequest("1.0", "riskplus.rbb.company.guard.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecRbbCompanyGuardResponse({}));
  }

  /**
   * Description: 提交授信申请
   * Summary: 企业授信申请
   */
  async applyRbbCompanyCredit(request: ApplyRbbCompanyCreditRequest): Promise<ApplyRbbCompanyCreditResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyRbbCompanyCreditEx(request, headers, runtime);
  }

  /**
   * Description: 提交授信申请
   * Summary: 企业授信申请
   */
  async applyRbbCompanyCreditEx(request: ApplyRbbCompanyCreditRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyRbbCompanyCreditResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyRbbCompanyCreditResponse>(await this.doRequest("1.0", "riskplus.rbb.company.credit.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyRbbCompanyCreditResponse({}));
  }

  /**
   * Description: 查询企业授信结果
   * Summary: 企业授信结果查询
   */
  async queryRbbCompanyCredit(request: QueryRbbCompanyCreditRequest): Promise<QueryRbbCompanyCreditResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryRbbCompanyCreditEx(request, headers, runtime);
  }

  /**
   * Description: 查询企业授信结果
   * Summary: 企业授信结果查询
   */
  async queryRbbCompanyCreditEx(request: QueryRbbCompanyCreditRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryRbbCompanyCreditResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryRbbCompanyCreditResponse>(await this.doRequest("1.0", "riskplus.rbb.company.credit.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryRbbCompanyCreditResponse({}));
  }

  /**
   * Description: 风险大脑-上交所数据离线同步数据准备状态，上交所本地部署鹰眼项目需要获取离线数据是否准备好的信息
   * Summary: 风险大脑-上交所数据离线同步数据准备状态
   */
  async queryRbbRegdatasyncPrepared(request: QueryRbbRegdatasyncPreparedRequest): Promise<QueryRbbRegdatasyncPreparedResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryRbbRegdatasyncPreparedEx(request, headers, runtime);
  }

  /**
   * Description: 风险大脑-上交所数据离线同步数据准备状态，上交所本地部署鹰眼项目需要获取离线数据是否准备好的信息
   * Summary: 风险大脑-上交所数据离线同步数据准备状态
   */
  async queryRbbRegdatasyncPreparedEx(request: QueryRbbRegdatasyncPreparedRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryRbbRegdatasyncPreparedResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryRbbRegdatasyncPreparedResponse>(await this.doRequest("1.0", "riskplus.rbb.regdatasync.prepared.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryRbbRegdatasyncPreparedResponse({}));
  }

  /**
   * Description: 风险大脑-上交所数据离线同步数据开始通知标识
   * Summary: 风险大脑-上交所数据离线同步数据开始通知
   */
  async startRbbRegdatasyncSchedule(request: StartRbbRegdatasyncScheduleRequest): Promise<StartRbbRegdatasyncScheduleResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.startRbbRegdatasyncScheduleEx(request, headers, runtime);
  }

  /**
   * Description: 风险大脑-上交所数据离线同步数据开始通知标识
   * Summary: 风险大脑-上交所数据离线同步数据开始通知
   */
  async startRbbRegdatasyncScheduleEx(request: StartRbbRegdatasyncScheduleRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<StartRbbRegdatasyncScheduleResponse> {
    Util.validateModel(request);
    return $tea.cast<StartRbbRegdatasyncScheduleResponse>(await this.doRequest("1.0", "riskplus.rbb.regdatasync.schedule.start", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new StartRbbRegdatasyncScheduleResponse({}));
  }

  /**
   * Description: 风险大脑-上交所数据离线同步数据完成记录 记录完成的状态
   * Summary: 风险大脑-上交所数据离线同步数据完成记录
   */
  async finishRbbRegdatasyncSchedule(request: FinishRbbRegdatasyncScheduleRequest): Promise<FinishRbbRegdatasyncScheduleResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.finishRbbRegdatasyncScheduleEx(request, headers, runtime);
  }

  /**
   * Description: 风险大脑-上交所数据离线同步数据完成记录 记录完成的状态
   * Summary: 风险大脑-上交所数据离线同步数据完成记录
   */
  async finishRbbRegdatasyncScheduleEx(request: FinishRbbRegdatasyncScheduleRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<FinishRbbRegdatasyncScheduleResponse> {
    Util.validateModel(request);
    return $tea.cast<FinishRbbRegdatasyncScheduleResponse>(await this.doRequest("1.0", "riskplus.rbb.regdatasync.schedule.finish", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new FinishRbbRegdatasyncScheduleResponse({}));
  }

  /**
   * Description: 提交准入规则的执行请求
   * Summary: 企业准入申请
   */
  async applyRbbCompanyGuard(request: ApplyRbbCompanyGuardRequest): Promise<ApplyRbbCompanyGuardResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyRbbCompanyGuardEx(request, headers, runtime);
  }

  /**
   * Description: 提交准入规则的执行请求
   * Summary: 企业准入申请
   */
  async applyRbbCompanyGuardEx(request: ApplyRbbCompanyGuardRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyRbbCompanyGuardResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyRbbCompanyGuardResponse>(await this.doRequest("1.0", "riskplus.rbb.company.guard.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyRbbCompanyGuardResponse({}));
  }

  /**
   * Description: 企业准入结果查询
   * Summary: 企业准入结果查询
   */
  async queryRbbCompanyGuard(request: QueryRbbCompanyGuardRequest): Promise<QueryRbbCompanyGuardResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryRbbCompanyGuardEx(request, headers, runtime);
  }

  /**
   * Description: 企业准入结果查询
   * Summary: 企业准入结果查询
   */
  async queryRbbCompanyGuardEx(request: QueryRbbCompanyGuardRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryRbbCompanyGuardResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryRbbCompanyGuardResponse>(await this.doRequest("1.0", "riskplus.rbb.company.guard.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryRbbCompanyGuardResponse({}));
  }

  /**
   * Description: 企业风控给上交所鹰眼使用的zsearch查询
   * Summary: 企业风控给鹰眼使用的zsearch查询
   */
  async queryRbbObtsZsearch(request: QueryRbbObtsZsearchRequest): Promise<QueryRbbObtsZsearchResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryRbbObtsZsearchEx(request, headers, runtime);
  }

  /**
   * Description: 企业风控给上交所鹰眼使用的zsearch查询
   * Summary: 企业风控给鹰眼使用的zsearch查询
   */
  async queryRbbObtsZsearchEx(request: QueryRbbObtsZsearchRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryRbbObtsZsearchResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryRbbObtsZsearchResponse>(await this.doRequest("1.0", "riskplus.rbb.obts.zsearch.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryRbbObtsZsearchResponse({}));
  }

  /**
   * Description: 企业风控客户推送的企业信息
   * Summary: 企业风控客户推送的企业信息
   */
  async pushRbbCustomerCompanyinfo(request: PushRbbCustomerCompanyinfoRequest): Promise<PushRbbCustomerCompanyinfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pushRbbCustomerCompanyinfoEx(request, headers, runtime);
  }

  /**
   * Description: 企业风控客户推送的企业信息
   * Summary: 企业风控客户推送的企业信息
   */
  async pushRbbCustomerCompanyinfoEx(request: PushRbbCustomerCompanyinfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PushRbbCustomerCompanyinfoResponse> {
    Util.validateModel(request);
    return $tea.cast<PushRbbCustomerCompanyinfoResponse>(await this.doRequest("1.0", "riskplus.rbb.customer.companyinfo.push", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PushRbbCustomerCompanyinfoResponse({}));
  }

  /**
   * Description: 企管盾给高德的文件上传，用于小微店铺分
   * Summary: 企管盾给高德的文件上传，用于小微店铺分
   */
  async uploadRbbFileAmap(request: UploadRbbFileAmapRequest): Promise<UploadRbbFileAmapResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.uploadRbbFileAmapEx(request, headers, runtime);
  }

  /**
   * Description: 企管盾给高德的文件上传，用于小微店铺分
   * Summary: 企管盾给高德的文件上传，用于小微店铺分
   */
  async uploadRbbFileAmapEx(request: UploadRbbFileAmapRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UploadRbbFileAmapResponse> {
    if (!Util.isUnset(request.fileObject)) {
      let uploadReq = new CreateAntcloudGatewayxFileUploadRequest({
        authToken: request.authToken,
        apiCode: "riskplus.rbb.file.amap.upload",
        fileName: request.fileObjectName,
      });
      let uploadResp = await this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
      if (!AntchainUtil.isSuccess(uploadResp.resultCode, "ok")) {
        let uploadRbbFileAmapResponse = new UploadRbbFileAmapResponse({
          reqMsgId: uploadResp.reqMsgId,
          resultCode: uploadResp.resultCode,
          resultMsg: uploadResp.resultMsg,
        });
        return uploadRbbFileAmapResponse;
      }

      let uploadHeaders = AntchainUtil.parseUploadHeaders(uploadResp.uploadHeaders);
      await AntchainUtil.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
      request.fileId = uploadResp.fileId;
      request.fileObject = null;
    }

    Util.validateModel(request);
    return $tea.cast<UploadRbbFileAmapResponse>(await this.doRequest("1.0", "riskplus.rbb.file.amap.upload", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UploadRbbFileAmapResponse({}));
  }

  /**
   * Description: 信贷操作接口
   * Summary: 信贷操作接口
   */
  async operateRbbCredit(request: OperateRbbCreditRequest): Promise<OperateRbbCreditResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.operateRbbCreditEx(request, headers, runtime);
  }

  /**
   * Description: 信贷操作接口
   * Summary: 信贷操作接口
   */
  async operateRbbCreditEx(request: OperateRbbCreditRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<OperateRbbCreditResponse> {
    Util.validateModel(request);
    return $tea.cast<OperateRbbCreditResponse>(await this.doRequest("1.0", "riskplus.rbb.credit.operate", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new OperateRbbCreditResponse({}));
  }

  /**
   * Description: 获取客户信息
   * Summary: 获取客户信息
   */
  async pushRbbCustomerInformation(request: PushRbbCustomerInformationRequest): Promise<PushRbbCustomerInformationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pushRbbCustomerInformationEx(request, headers, runtime);
  }

  /**
   * Description: 获取客户信息
   * Summary: 获取客户信息
   */
  async pushRbbCustomerInformationEx(request: PushRbbCustomerInformationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PushRbbCustomerInformationResponse> {
    Util.validateModel(request);
    return $tea.cast<PushRbbCustomerInformationResponse>(await this.doRequest("1.0", "riskplus.rbb.customer.information.push", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PushRbbCustomerInformationResponse({}));
  }

  /**
   * Description: 获取税票授权数据
   * Summary: 获取税票授权数据
   */
  async getRbbTaxinvoiceData(request: GetRbbTaxinvoiceDataRequest): Promise<GetRbbTaxinvoiceDataResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getRbbTaxinvoiceDataEx(request, headers, runtime);
  }

  /**
   * Description: 获取税票授权数据
   * Summary: 获取税票授权数据
   */
  async getRbbTaxinvoiceDataEx(request: GetRbbTaxinvoiceDataRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetRbbTaxinvoiceDataResponse> {
    Util.validateModel(request);
    return $tea.cast<GetRbbTaxinvoiceDataResponse>(await this.doRequest("1.0", "riskplus.rbb.taxinvoice.data.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetRbbTaxinvoiceDataResponse({}));
  }

  /**
   * Description: 客户实时状态通知
   * Summary: 客户实时状态通知
   */
  async pushRbbCustomerStatus(request: PushRbbCustomerStatusRequest): Promise<PushRbbCustomerStatusResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pushRbbCustomerStatusEx(request, headers, runtime);
  }

  /**
   * Description: 客户实时状态通知
   * Summary: 客户实时状态通知
   */
  async pushRbbCustomerStatusEx(request: PushRbbCustomerStatusRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PushRbbCustomerStatusResponse> {
    Util.validateModel(request);
    return $tea.cast<PushRbbCustomerStatusResponse>(await this.doRequest("1.0", "riskplus.rbb.customer.status.push", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PushRbbCustomerStatusResponse({}));
  }

  /**
   * Description: 票税计费处理推送，由票税侧请求
   * Summary: 票税计费处理推送
   */
  async pushRbbInvoiceCharge(request: PushRbbInvoiceChargeRequest): Promise<PushRbbInvoiceChargeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pushRbbInvoiceChargeEx(request, headers, runtime);
  }

  /**
   * Description: 票税计费处理推送，由票税侧请求
   * Summary: 票税计费处理推送
   */
  async pushRbbInvoiceChargeEx(request: PushRbbInvoiceChargeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PushRbbInvoiceChargeResponse> {
    Util.validateModel(request);
    return $tea.cast<PushRbbInvoiceChargeResponse>(await this.doRequest("1.0", "riskplus.rbb.invoice.charge.push", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PushRbbInvoiceChargeResponse({}));
  }

  /**
   * Description: 通过接口进行报告上传
   * Summary: 征信报告上传接口
   */
  async receiveRbbParamsFile(request: ReceiveRbbParamsFileRequest): Promise<ReceiveRbbParamsFileResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.receiveRbbParamsFileEx(request, headers, runtime);
  }

  /**
   * Description: 通过接口进行报告上传
   * Summary: 征信报告上传接口
   */
  async receiveRbbParamsFileEx(request: ReceiveRbbParamsFileRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ReceiveRbbParamsFileResponse> {
    if (!Util.isUnset(request.fileObject)) {
      let uploadReq = new CreateAntcloudGatewayxFileUploadRequest({
        authToken: request.authToken,
        apiCode: "riskplus.rbb.params.file.receive",
        fileName: request.fileObjectName,
      });
      let uploadResp = await this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
      if (!AntchainUtil.isSuccess(uploadResp.resultCode, "ok")) {
        let receiveRbbParamsFileResponse = new ReceiveRbbParamsFileResponse({
          reqMsgId: uploadResp.reqMsgId,
          resultCode: uploadResp.resultCode,
          resultMsg: uploadResp.resultMsg,
        });
        return receiveRbbParamsFileResponse;
      }

      let uploadHeaders = AntchainUtil.parseUploadHeaders(uploadResp.uploadHeaders);
      await AntchainUtil.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
      request.fileId = uploadResp.fileId;
      request.fileObject = null;
    }

    Util.validateModel(request);
    return $tea.cast<ReceiveRbbParamsFileResponse>(await this.doRequest("1.0", "riskplus.rbb.params.file.receive", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ReceiveRbbParamsFileResponse({}));
  }

  /**
   * Description: 境外企业画像数据接收
   * Summary: 境外企业画像数据接收
   */
  async receiveRbbOverseacompanyProfile(request: ReceiveRbbOverseacompanyProfileRequest): Promise<ReceiveRbbOverseacompanyProfileResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.receiveRbbOverseacompanyProfileEx(request, headers, runtime);
  }

  /**
   * Description: 境外企业画像数据接收
   * Summary: 境外企业画像数据接收
   */
  async receiveRbbOverseacompanyProfileEx(request: ReceiveRbbOverseacompanyProfileRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ReceiveRbbOverseacompanyProfileResponse> {
    if (!Util.isUnset(request.fileObject)) {
      let uploadReq = new CreateAntcloudGatewayxFileUploadRequest({
        authToken: request.authToken,
        apiCode: "riskplus.rbb.overseacompany.profile.receive",
        fileName: request.fileObjectName,
      });
      let uploadResp = await this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
      if (!AntchainUtil.isSuccess(uploadResp.resultCode, "ok")) {
        let receiveRbbOverseacompanyProfileResponse = new ReceiveRbbOverseacompanyProfileResponse({
          reqMsgId: uploadResp.reqMsgId,
          resultCode: uploadResp.resultCode,
          resultMsg: uploadResp.resultMsg,
        });
        return receiveRbbOverseacompanyProfileResponse;
      }

      let uploadHeaders = AntchainUtil.parseUploadHeaders(uploadResp.uploadHeaders);
      await AntchainUtil.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
      request.fileId = uploadResp.fileId;
      request.fileObject = null;
    }

    Util.validateModel(request);
    return $tea.cast<ReceiveRbbOverseacompanyProfileResponse>(await this.doRequest("1.0", "riskplus.rbb.overseacompany.profile.receive", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ReceiveRbbOverseacompanyProfileResponse({}));
  }

  /**
   * Description: 报告结果推送，算法调用
   * Summary: 报告结果推送
   */
  async pushRpaasReportAnswer(request: PushRpaasReportAnswerRequest): Promise<PushRpaasReportAnswerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pushRpaasReportAnswerEx(request, headers, runtime);
  }

  /**
   * Description: 报告结果推送，算法调用
   * Summary: 报告结果推送
   */
  async pushRpaasReportAnswerEx(request: PushRpaasReportAnswerRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PushRpaasReportAnswerResponse> {
    Util.validateModel(request);
    return $tea.cast<PushRpaasReportAnswerResponse>(await this.doRequest("1.0", "riskplus.rpaas.report.answer.push", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PushRpaasReportAnswerResponse({}));
  }

  /**
   * Description: 企管盾云开放平台服务调用
   * Summary: 企管盾云开放平台服务调用
   */
  async queryRpaasOpenService(request: QueryRpaasOpenServiceRequest): Promise<QueryRpaasOpenServiceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryRpaasOpenServiceEx(request, headers, runtime);
  }

  /**
   * Description: 企管盾云开放平台服务调用
   * Summary: 企管盾云开放平台服务调用
   */
  async queryRpaasOpenServiceEx(request: QueryRpaasOpenServiceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryRpaasOpenServiceResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryRpaasOpenServiceResponse>(await this.doRequest("1.0", "riskplus.rpaas.open.service.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryRpaasOpenServiceResponse({}));
  }

  /**
   * Description: 获取签约接口
   * Summary: 获取签约接口
   */
  async queryRpgwSignUrl(request: QueryRpgwSignUrlRequest): Promise<QueryRpgwSignUrlResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryRpgwSignUrlEx(request, headers, runtime);
  }

  /**
   * Description: 获取签约接口
   * Summary: 获取签约接口
   */
  async queryRpgwSignUrlEx(request: QueryRpgwSignUrlRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryRpgwSignUrlResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryRpgwSignUrlResponse>(await this.doRequest("1.0", "riskplus.rpgw.sign.url.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryRpgwSignUrlResponse({}));
  }

  /**
   * Description: 创建报税用户接口
   * Summary: 创建报税用户接口
   */
  async registerRpgwUserEinvoice(request: RegisterRpgwUserEinvoiceRequest): Promise<RegisterRpgwUserEinvoiceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.registerRpgwUserEinvoiceEx(request, headers, runtime);
  }

  /**
   * Description: 创建报税用户接口
   * Summary: 创建报税用户接口
   */
  async registerRpgwUserEinvoiceEx(request: RegisterRpgwUserEinvoiceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RegisterRpgwUserEinvoiceResponse> {
    Util.validateModel(request);
    return $tea.cast<RegisterRpgwUserEinvoiceResponse>(await this.doRequest("1.0", "riskplus.rpgw.user.einvoice.register", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RegisterRpgwUserEinvoiceResponse({}));
  }

  /**
   * Description: 查询签约接口
   * Summary: 获取签约接口
   */
  async queryRpgwUserSignurl(request: QueryRpgwUserSignurlRequest): Promise<QueryRpgwUserSignurlResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryRpgwUserSignurlEx(request, headers, runtime);
  }

  /**
   * Description: 查询签约接口
   * Summary: 获取签约接口
   */
  async queryRpgwUserSignurlEx(request: QueryRpgwUserSignurlRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryRpgwUserSignurlResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryRpgwUserSignurlResponse>(await this.doRequest("1.0", "riskplus.rpgw.user.signurl.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryRpgwUserSignurlResponse({}));
  }

  /**
   * Description: 提现
   * Summary: 提现
   */
  async withdrawRpgwUserCommission(request: WithdrawRpgwUserCommissionRequest): Promise<WithdrawRpgwUserCommissionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.withdrawRpgwUserCommissionEx(request, headers, runtime);
  }

  /**
   * Description: 提现
   * Summary: 提现
   */
  async withdrawRpgwUserCommissionEx(request: WithdrawRpgwUserCommissionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<WithdrawRpgwUserCommissionResponse> {
    Util.validateModel(request);
    return $tea.cast<WithdrawRpgwUserCommissionResponse>(await this.doRequest("1.0", "riskplus.rpgw.user.commission.withdraw", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new WithdrawRpgwUserCommissionResponse({}));
  }

  /**
   * Description: 信息同步
   * Summary: 下单等信息同步
   */
  async syncRpgwUserOrderinfo(request: SyncRpgwUserOrderinfoRequest): Promise<SyncRpgwUserOrderinfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.syncRpgwUserOrderinfoEx(request, headers, runtime);
  }

  /**
   * Description: 信息同步
   * Summary: 下单等信息同步
   */
  async syncRpgwUserOrderinfoEx(request: SyncRpgwUserOrderinfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SyncRpgwUserOrderinfoResponse> {
    Util.validateModel(request);
    return $tea.cast<SyncRpgwUserOrderinfoResponse>(await this.doRequest("1.0", "riskplus.rpgw.user.orderinfo.sync", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SyncRpgwUserOrderinfoResponse({}));
  }

  /**
   * Description: 签约结果通知
   * Summary: 签约结果通知
   */
  async notifyRpgwUserSignresult(request: NotifyRpgwUserSignresultRequest): Promise<NotifyRpgwUserSignresultResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.notifyRpgwUserSignresultEx(request, headers, runtime);
  }

  /**
   * Description: 签约结果通知
   * Summary: 签约结果通知
   */
  async notifyRpgwUserSignresultEx(request: NotifyRpgwUserSignresultRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<NotifyRpgwUserSignresultResponse> {
    Util.validateModel(request);
    return $tea.cast<NotifyRpgwUserSignresultResponse>(await this.doRequest("1.0", "riskplus.rpgw.user.signresult.notify", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new NotifyRpgwUserSignresultResponse({}));
  }

  /**
   * Description: 查询所在地的负面舆情企业列表
   * Summary: 查询所在地的负面舆情企业列表
   */
  async queryRtopCompanyOpinion(request: QueryRtopCompanyOpinionRequest): Promise<QueryRtopCompanyOpinionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryRtopCompanyOpinionEx(request, headers, runtime);
  }

  /**
   * Description: 查询所在地的负面舆情企业列表
   * Summary: 查询所在地的负面舆情企业列表
   */
  async queryRtopCompanyOpinionEx(request: QueryRtopCompanyOpinionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryRtopCompanyOpinionResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryRtopCompanyOpinionResponse>(await this.doRequest("1.0", "riskplus.rtop.company.opinion.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryRtopCompanyOpinionResponse({}));
  }

  /**
   * Description: 查询企业的舆情详情信息
   * Summary: 查询企业的舆情详情信息
   */
  async listRtopCompanyOpinions(request: ListRtopCompanyOpinionsRequest): Promise<ListRtopCompanyOpinionsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listRtopCompanyOpinionsEx(request, headers, runtime);
  }

  /**
   * Description: 查询企业的舆情详情信息
   * Summary: 查询企业的舆情详情信息
   */
  async listRtopCompanyOpinionsEx(request: ListRtopCompanyOpinionsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListRtopCompanyOpinionsResponse> {
    Util.validateModel(request);
    return $tea.cast<ListRtopCompanyOpinionsResponse>(await this.doRequest("1.0", "riskplus.rtop.company.opinions.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListRtopCompanyOpinionsResponse({}));
  }

  /**
   * Description: 查询监测企业的详情
   * Summary: 查询监测企业的详情
   */
  async getRtopCompanyMonitor(request: GetRtopCompanyMonitorRequest): Promise<GetRtopCompanyMonitorResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getRtopCompanyMonitorEx(request, headers, runtime);
  }

  /**
   * Description: 查询监测企业的详情
   * Summary: 查询监测企业的详情
   */
  async getRtopCompanyMonitorEx(request: GetRtopCompanyMonitorRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetRtopCompanyMonitorResponse> {
    Util.validateModel(request);
    return $tea.cast<GetRtopCompanyMonitorResponse>(await this.doRequest("1.0", "riskplus.rtop.company.monitor.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetRtopCompanyMonitorResponse({}));
  }

  /**
   * Description: 查询所在地的涉众风险企业统计信息
   * Summary: 查询所在地的涉众风险企业统计信息
   */
  async queryRtopCrowdriskStatistic(request: QueryRtopCrowdriskStatisticRequest): Promise<QueryRtopCrowdriskStatisticResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryRtopCrowdriskStatisticEx(request, headers, runtime);
  }

  /**
   * Description: 查询所在地的涉众风险企业统计信息
   * Summary: 查询所在地的涉众风险企业统计信息
   */
  async queryRtopCrowdriskStatisticEx(request: QueryRtopCrowdriskStatisticRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryRtopCrowdriskStatisticResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryRtopCrowdriskStatisticResponse>(await this.doRequest("1.0", "riskplus.rtop.crowdrisk.statistic.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryRtopCrowdriskStatisticResponse({}));
  }

  /**
   * Description: 查询涉众风险企业的列表
   * Summary: 查询涉众风险企业的列表
   */
  async listRtopCrowdrisk(request: ListRtopCrowdriskRequest): Promise<ListRtopCrowdriskResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listRtopCrowdriskEx(request, headers, runtime);
  }

  /**
   * Description: 查询涉众风险企业的列表
   * Summary: 查询涉众风险企业的列表
   */
  async listRtopCrowdriskEx(request: ListRtopCrowdriskRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListRtopCrowdriskResponse> {
    Util.validateModel(request);
    return $tea.cast<ListRtopCrowdriskResponse>(await this.doRequest("1.0", "riskplus.rtop.crowdrisk.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListRtopCrowdriskResponse({}));
  }

  /**
   * Description: 查询涉众风险企业的详细信息
   * Summary: 查询涉众风险企业的详细信息
   */
  async queryRtopCrowdriskDetail(request: QueryRtopCrowdriskDetailRequest): Promise<QueryRtopCrowdriskDetailResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryRtopCrowdriskDetailEx(request, headers, runtime);
  }

  /**
   * Description: 查询涉众风险企业的详细信息
   * Summary: 查询涉众风险企业的详细信息
   */
  async queryRtopCrowdriskDetailEx(request: QueryRtopCrowdriskDetailRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryRtopCrowdriskDetailResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryRtopCrowdriskDetailResponse>(await this.doRequest("1.0", "riskplus.rtop.crowdrisk.detail.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryRtopCrowdriskDetailResponse({}));
  }

  /**
   * Description: 查询风报的详细信息
   * Summary: 查询风报的详细信息
   */
  async queryRtopRiskstorm(request: QueryRtopRiskstormRequest): Promise<QueryRtopRiskstormResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryRtopRiskstormEx(request, headers, runtime);
  }

  /**
   * Description: 查询风报的详细信息
   * Summary: 查询风报的详细信息
   */
  async queryRtopRiskstormEx(request: QueryRtopRiskstormRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryRtopRiskstormResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryRtopRiskstormResponse>(await this.doRequest("1.0", "riskplus.rtop.riskstorm.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryRtopRiskstormResponse({}));
  }

  /**
   * Description: 监管涉众风险指定的一批企业的影响人数之和、影响金额之和
   * Summary: 监管涉众风险一批企业的影响人数影响金额
   */
  async queryRtopCrowdriskSum(request: QueryRtopCrowdriskSumRequest): Promise<QueryRtopCrowdriskSumResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryRtopCrowdriskSumEx(request, headers, runtime);
  }

  /**
   * Description: 监管涉众风险指定的一批企业的影响人数之和、影响金额之和
   * Summary: 监管涉众风险一批企业的影响人数影响金额
   */
  async queryRtopCrowdriskSumEx(request: QueryRtopCrowdriskSumRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryRtopCrowdriskSumResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryRtopCrowdriskSumResponse>(await this.doRequest("1.0", "riskplus.rtop.crowdrisk.sum.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryRtopCrowdriskSumResponse({}));
  }

  /**
   * Description: 监管企业详情获取，包括风险分数、风险标签。
   * Summary: 监管企业详情获取
   */
  async getRtopCompanyDetail(request: GetRtopCompanyDetailRequest): Promise<GetRtopCompanyDetailResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getRtopCompanyDetailEx(request, headers, runtime);
  }

  /**
   * Description: 监管企业详情获取，包括风险分数、风险标签。
   * Summary: 监管企业详情获取
   */
  async getRtopCompanyDetailEx(request: GetRtopCompanyDetailRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetRtopCompanyDetailResponse> {
    Util.validateModel(request);
    return $tea.cast<GetRtopCompanyDetailResponse>(await this.doRequest("1.0", "riskplus.rtop.company.detail.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetRtopCompanyDetailResponse({}));
  }

  /**
   * Description: 企业风险查询接口
   * Summary: 企业风险查询接口
   */
  async queryRtopCompanyRiskinfo(request: QueryRtopCompanyRiskinfoRequest): Promise<QueryRtopCompanyRiskinfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryRtopCompanyRiskinfoEx(request, headers, runtime);
  }

  /**
   * Description: 企业风险查询接口
   * Summary: 企业风险查询接口
   */
  async queryRtopCompanyRiskinfoEx(request: QueryRtopCompanyRiskinfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryRtopCompanyRiskinfoResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryRtopCompanyRiskinfoResponse>(await this.doRequest("1.0", "riskplus.rtop.company.riskinfo.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryRtopCompanyRiskinfoResponse({}));
  }

  /**
   * Description: 公有云通用风险信息接口
   * Summary: 公有云通用风险信息接口
   */
  async execRtopGenericInvoke(request: ExecRtopGenericInvokeRequest): Promise<ExecRtopGenericInvokeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execRtopGenericInvokeEx(request, headers, runtime);
  }

  /**
   * Description: 公有云通用风险信息接口
   * Summary: 公有云通用风险信息接口
   */
  async execRtopGenericInvokeEx(request: ExecRtopGenericInvokeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecRtopGenericInvokeResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecRtopGenericInvokeResponse>(await this.doRequest("1.0", "riskplus.rtop.generic.invoke.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecRtopGenericInvokeResponse({}));
  }

  /**
   * Description: 公有云生成token
   * Summary: 公有云生成token
   */
  async createRtopToken(request: CreateRtopTokenRequest): Promise<CreateRtopTokenResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createRtopTokenEx(request, headers, runtime);
  }

  /**
   * Description: 公有云生成token
   * Summary: 公有云生成token
   */
  async createRtopTokenEx(request: CreateRtopTokenRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateRtopTokenResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateRtopTokenResponse>(await this.doRequest("1.0", "riskplus.rtop.token.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateRtopTokenResponse({}));
  }

  /**
   * Description: 标签全量信息获取
   * Summary: 标签全量信息获取
   */
  async queryRtopRisklabel(request: QueryRtopRisklabelRequest): Promise<QueryRtopRisklabelResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryRtopRisklabelEx(request, headers, runtime);
  }

  /**
   * Description: 标签全量信息获取
   * Summary: 标签全量信息获取
   */
  async queryRtopRisklabelEx(request: QueryRtopRisklabelRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryRtopRisklabelResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryRtopRisklabelResponse>(await this.doRequest("1.0", "riskplus.rtop.risklabel.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryRtopRisklabelResponse({}));
  }

  /**
   * Description: 企业全量信息获取
   * Summary: 企业全量信息获取
   */
  async queryRtopCompany(request: QueryRtopCompanyRequest): Promise<QueryRtopCompanyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryRtopCompanyEx(request, headers, runtime);
  }

  /**
   * Description: 企业全量信息获取
   * Summary: 企业全量信息获取
   */
  async queryRtopCompanyEx(request: QueryRtopCompanyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryRtopCompanyResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryRtopCompanyResponse>(await this.doRequest("1.0", "riskplus.rtop.company.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryRtopCompanyResponse({}));
  }

  /**
   * Description: 标签配置全量信息获取
  rtop_company_tag_filter_config
   * Summary: 标签配置全量信息获取
   */
  async queryRtopRisklabelFilter(request: QueryRtopRisklabelFilterRequest): Promise<QueryRtopRisklabelFilterResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryRtopRisklabelFilterEx(request, headers, runtime);
  }

  /**
   * Description: 标签配置全量信息获取
  rtop_company_tag_filter_config
   * Summary: 标签配置全量信息获取
   */
  async queryRtopRisklabelFilterEx(request: QueryRtopRisklabelFilterRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryRtopRisklabelFilterResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryRtopRisklabelFilterResponse>(await this.doRequest("1.0", "riskplus.rtop.risklabel.filter.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryRtopRisklabelFilterResponse({}));
  }

  /**
   * Description: 用于鹰眼项目舆情同步
   * Summary: 鹰眼项目舆情同步
   */
  async pullRegtechNews(request: PullRegtechNewsRequest): Promise<PullRegtechNewsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pullRegtechNewsEx(request, headers, runtime);
  }

  /**
   * Description: 用于鹰眼项目舆情同步
   * Summary: 鹰眼项目舆情同步
   */
  async pullRegtechNewsEx(request: PullRegtechNewsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PullRegtechNewsResponse> {
    Util.validateModel(request);
    return $tea.cast<PullRegtechNewsResponse>(await this.doRequest("1.0", "riskplus.regtech.news.pull", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PullRegtechNewsResponse({}));
  }

  /**
   * Description: 查看企业反馈
   * Summary: 查看企业反馈
   */
  async queryRtopCompanyFeedback(request: QueryRtopCompanyFeedbackRequest): Promise<QueryRtopCompanyFeedbackResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryRtopCompanyFeedbackEx(request, headers, runtime);
  }

  /**
   * Description: 查看企业反馈
   * Summary: 查看企业反馈
   */
  async queryRtopCompanyFeedbackEx(request: QueryRtopCompanyFeedbackRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryRtopCompanyFeedbackResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryRtopCompanyFeedbackResponse>(await this.doRequest("1.0", "riskplus.rtop.company.feedback.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryRtopCompanyFeedbackResponse({}));
  }

  /**
   * Description: 全局动态中的预警企业详细列表查询
   * Summary: 全局动态中的预警企业详细列表查询
   */
  async queryRtopCompanyAlarm(request: QueryRtopCompanyAlarmRequest): Promise<QueryRtopCompanyAlarmResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryRtopCompanyAlarmEx(request, headers, runtime);
  }

  /**
   * Description: 全局动态中的预警企业详细列表查询
   * Summary: 全局动态中的预警企业详细列表查询
   */
  async queryRtopCompanyAlarmEx(request: QueryRtopCompanyAlarmRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryRtopCompanyAlarmResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryRtopCompanyAlarmResponse>(await this.doRequest("1.0", "riskplus.rtop.company.alarm.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryRtopCompanyAlarmResponse({}));
  }

  /**
   * Description: 查询全局动态中的企业列表里的全部列表
   * Summary: 查询全局动态中的企业列表里的全部列表
   */
  async queryRtopCompanyRisky(request: QueryRtopCompanyRiskyRequest): Promise<QueryRtopCompanyRiskyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryRtopCompanyRiskyEx(request, headers, runtime);
  }

  /**
   * Description: 查询全局动态中的企业列表里的全部列表
   * Summary: 查询全局动态中的企业列表里的全部列表
   */
  async queryRtopCompanyRiskyEx(request: QueryRtopCompanyRiskyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryRtopCompanyRiskyResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryRtopCompanyRiskyResponse>(await this.doRequest("1.0", "riskplus.rtop.company.risky.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryRtopCompanyRiskyResponse({}));
  }

  /**
   * Description: 查询企业列表
   * Summary: 查询企业列表
   */
  async queryRtopCompanyList(request: QueryRtopCompanyListRequest): Promise<QueryRtopCompanyListResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryRtopCompanyListEx(request, headers, runtime);
  }

  /**
   * Description: 查询企业列表
   * Summary: 查询企业列表
   */
  async queryRtopCompanyListEx(request: QueryRtopCompanyListRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryRtopCompanyListResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryRtopCompanyListResponse>(await this.doRequest("1.0", "riskplus.rtop.company.list.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryRtopCompanyListResponse({}));
  }

  /**
   * Description: 标签配置全量信息获取
   * Summary: 标签配置全量信息获取
   */
  async queryRtopRisklabelConfig(request: QueryRtopRisklabelConfigRequest): Promise<QueryRtopRisklabelConfigResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryRtopRisklabelConfigEx(request, headers, runtime);
  }

  /**
   * Description: 标签配置全量信息获取
   * Summary: 标签配置全量信息获取
   */
  async queryRtopRisklabelConfigEx(request: QueryRtopRisklabelConfigRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryRtopRisklabelConfigResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryRtopRisklabelConfigResponse>(await this.doRequest("1.0", "riskplus.rtop.risklabel.config.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryRtopRisklabelConfigResponse({}));
  }

  /**
   * Description: 企业风险标签信息查询
   * Summary: 企业风险标签信息查询
   */
  async queryRtopCompanyRisk(request: QueryRtopCompanyRiskRequest): Promise<QueryRtopCompanyRiskResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryRtopCompanyRiskEx(request, headers, runtime);
  }

  /**
   * Description: 企业风险标签信息查询
   * Summary: 企业风险标签信息查询
   */
  async queryRtopCompanyRiskEx(request: QueryRtopCompanyRiskRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryRtopCompanyRiskResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryRtopCompanyRiskResponse>(await this.doRequest("1.0", "riskplus.rtop.company.risk.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryRtopCompanyRiskResponse({}));
  }

  /**
   * Description: 查看重点关联企业
   * Summary: 重点关联企业
   */
  async listRtopCompanyRelated(request: ListRtopCompanyRelatedRequest): Promise<ListRtopCompanyRelatedResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listRtopCompanyRelatedEx(request, headers, runtime);
  }

  /**
   * Description: 查看重点关联企业
   * Summary: 重点关联企业
   */
  async listRtopCompanyRelatedEx(request: ListRtopCompanyRelatedRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListRtopCompanyRelatedResponse> {
    Util.validateModel(request);
    return $tea.cast<ListRtopCompanyRelatedResponse>(await this.doRequest("1.0", "riskplus.rtop.company.related.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListRtopCompanyRelatedResponse({}));
  }

  /**
   * Description: 风险标签图片查询
   * Summary: 风险标签图片查询
   */
  async queryRtopTagImage(request: QueryRtopTagImageRequest): Promise<QueryRtopTagImageResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryRtopTagImageEx(request, headers, runtime);
  }

  /**
   * Description: 风险标签图片查询
   * Summary: 风险标签图片查询
   */
  async queryRtopTagImageEx(request: QueryRtopTagImageRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryRtopTagImageResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryRtopTagImageResponse>(await this.doRequest("1.0", "riskplus.rtop.tag.image.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryRtopTagImageResponse({}));
  }

  /**
   * Description: 查询用户收藏企业列表
   * Summary: 查询用户收藏企业列表
   */
  async listRtopStarCompany(request: ListRtopStarCompanyRequest): Promise<ListRtopStarCompanyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listRtopStarCompanyEx(request, headers, runtime);
  }

  /**
   * Description: 查询用户收藏企业列表
   * Summary: 查询用户收藏企业列表
   */
  async listRtopStarCompanyEx(request: ListRtopStarCompanyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListRtopStarCompanyResponse> {
    Util.validateModel(request);
    return $tea.cast<ListRtopStarCompanyResponse>(await this.doRequest("1.0", "riskplus.rtop.star.company.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListRtopStarCompanyResponse({}));
  }

  /**
   * Description: 策略咨询服务输出(saas)
   * Summary: 策略咨询服务输出(saas)
   */
  async queryRpSecurityPolicy(request: QueryRpSecurityPolicyRequest): Promise<QueryRpSecurityPolicyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryRpSecurityPolicyEx(request, headers, runtime);
  }

  /**
   * Description: 策略咨询服务输出(saas)
   * Summary: 策略咨询服务输出(saas)
   */
  async queryRpSecurityPolicyEx(request: QueryRpSecurityPolicyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryRpSecurityPolicyResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryRpSecurityPolicyResponse>(await this.doRequest("1.0", "riskplus.rp.security.policy.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryRpSecurityPolicyResponse({}));
  }

  /**
   * Description: 风控快照查询
   * Summary: 风控事件快照查询
   */
  async querySnapshotEvent(request: QuerySnapshotEventRequest): Promise<QuerySnapshotEventResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.querySnapshotEventEx(request, headers, runtime);
  }

  /**
   * Description: 风控快照查询
   * Summary: 风控事件快照查询
   */
  async querySnapshotEventEx(request: QuerySnapshotEventRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QuerySnapshotEventResponse> {
    Util.validateModel(request);
    return $tea.cast<QuerySnapshotEventResponse>(await this.doRequest("1.0", "riskplus.snapshot.event.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QuerySnapshotEventResponse({}));
  }

  /**
   * Description: 批量实时触达接口
   * Summary: 发起触达任务
   */
  async applyTdiquickmsgRtBatchmarketing(request: ApplyTdiquickmsgRtBatchmarketingRequest): Promise<ApplyTdiquickmsgRtBatchmarketingResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyTdiquickmsgRtBatchmarketingEx(request, headers, runtime);
  }

  /**
   * Description: 批量实时触达接口
   * Summary: 发起触达任务
   */
  async applyTdiquickmsgRtBatchmarketingEx(request: ApplyTdiquickmsgRtBatchmarketingRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyTdiquickmsgRtBatchmarketingResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyTdiquickmsgRtBatchmarketingResponse>(await this.doRequest("1.0", "riskplus.tdiquickmsg.rt.batchmarketing.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyTdiquickmsgRtBatchmarketingResponse({}));
  }

  /**
   * Description: 发起AI外呼
   * Summary: 发起AI外呼
   */
  async applyTdiquickmsgRobotcall(request: ApplyTdiquickmsgRobotcallRequest): Promise<ApplyTdiquickmsgRobotcallResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyTdiquickmsgRobotcallEx(request, headers, runtime);
  }

  /**
   * Description: 发起AI外呼
   * Summary: 发起AI外呼
   */
  async applyTdiquickmsgRobotcallEx(request: ApplyTdiquickmsgRobotcallRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyTdiquickmsgRobotcallResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyTdiquickmsgRobotcallResponse>(await this.doRequest("1.0", "riskplus.tdiquickmsg.robotcall.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyTdiquickmsgRobotcallResponse({}));
  }

  /**
   * Description: 短信状态回调接口
   * Summary: 短信状态回调接口
   */
  async callbackTdiquickmsgSms(request: CallbackTdiquickmsgSmsRequest): Promise<CallbackTdiquickmsgSmsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.callbackTdiquickmsgSmsEx(request, headers, runtime);
  }

  /**
   * Description: 短信状态回调接口
   * Summary: 短信状态回调接口
   */
  async callbackTdiquickmsgSmsEx(request: CallbackTdiquickmsgSmsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CallbackTdiquickmsgSmsResponse> {
    Util.validateModel(request);
    return $tea.cast<CallbackTdiquickmsgSmsResponse>(await this.doRequest("1.0", "riskplus.tdiquickmsg.sms.callback", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CallbackTdiquickmsgSmsResponse({}));
  }

  /**
   * Description: 新接入ai外呼服务商的回调接口
   * Summary: ai外呼回调接口
   */
  async callbackTdiquickmsgRobotcall(request: CallbackTdiquickmsgRobotcallRequest): Promise<CallbackTdiquickmsgRobotcallResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.callbackTdiquickmsgRobotcallEx(request, headers, runtime);
  }

  /**
   * Description: 新接入ai外呼服务商的回调接口
   * Summary: ai外呼回调接口
   */
  async callbackTdiquickmsgRobotcallEx(request: CallbackTdiquickmsgRobotcallRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CallbackTdiquickmsgRobotcallResponse> {
    Util.validateModel(request);
    return $tea.cast<CallbackTdiquickmsgRobotcallResponse>(await this.doRequest("1.0", "riskplus.tdiquickmsg.robotcall.callback", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CallbackTdiquickmsgRobotcallResponse({}));
  }

  /**
   * Description: 上行短信回调
   * Summary: 上行短信回调
   */
  async callbackTdiquickmsgSmsUp(request: CallbackTdiquickmsgSmsUpRequest): Promise<CallbackTdiquickmsgSmsUpResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.callbackTdiquickmsgSmsUpEx(request, headers, runtime);
  }

  /**
   * Description: 上行短信回调
   * Summary: 上行短信回调
   */
  async callbackTdiquickmsgSmsUpEx(request: CallbackTdiquickmsgSmsUpRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CallbackTdiquickmsgSmsUpResponse> {
    Util.validateModel(request);
    return $tea.cast<CallbackTdiquickmsgSmsUpResponse>(await this.doRequest("1.0", "riskplus.tdiquickmsg.sms.up.callback", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CallbackTdiquickmsgSmsUpResponse({}));
  }

  /**
   * Description: 外呼任务统计查询接口
   * Summary: 外呼任务统计查询接口
   */
  async queryTdiquickmsgRobotcallStatisticinfo(request: QueryTdiquickmsgRobotcallStatisticinfoRequest): Promise<QueryTdiquickmsgRobotcallStatisticinfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryTdiquickmsgRobotcallStatisticinfoEx(request, headers, runtime);
  }

  /**
   * Description: 外呼任务统计查询接口
   * Summary: 外呼任务统计查询接口
   */
  async queryTdiquickmsgRobotcallStatisticinfoEx(request: QueryTdiquickmsgRobotcallStatisticinfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryTdiquickmsgRobotcallStatisticinfoResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTdiquickmsgRobotcallStatisticinfoResponse>(await this.doRequest("1.0", "riskplus.tdiquickmsg.robotcall.statisticinfo.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryTdiquickmsgRobotcallStatisticinfoResponse({}));
  }

  /**
   * Description: 蚁盾业务回流事件推送
   * Summary: 蚁盾业务回流事件推送
   */
  async pushTdiquickmsgBackflowEvent(request: PushTdiquickmsgBackflowEventRequest): Promise<PushTdiquickmsgBackflowEventResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pushTdiquickmsgBackflowEventEx(request, headers, runtime);
  }

  /**
   * Description: 蚁盾业务回流事件推送
   * Summary: 蚁盾业务回流事件推送
   */
  async pushTdiquickmsgBackflowEventEx(request: PushTdiquickmsgBackflowEventRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PushTdiquickmsgBackflowEventResponse> {
    Util.validateModel(request);
    return $tea.cast<PushTdiquickmsgBackflowEventResponse>(await this.doRequest("1.0", "riskplus.tdiquickmsg.backflow.event.push", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PushTdiquickmsgBackflowEventResponse({}));
  }

  /**
   * Description: 蚁盾数据回流推送，用于客户定制json数据
   * Summary: 蚁盾数据回流json格式推送
   */
  async pushTdiquickmsgBackflowJsondata(request: PushTdiquickmsgBackflowJsondataRequest): Promise<PushTdiquickmsgBackflowJsondataResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pushTdiquickmsgBackflowJsondataEx(request, headers, runtime);
  }

  /**
   * Description: 蚁盾数据回流推送，用于客户定制json数据
   * Summary: 蚁盾数据回流json格式推送
   */
  async pushTdiquickmsgBackflowJsondataEx(request: PushTdiquickmsgBackflowJsondataRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PushTdiquickmsgBackflowJsondataResponse> {
    Util.validateModel(request);
    return $tea.cast<PushTdiquickmsgBackflowJsondataResponse>(await this.doRequest("1.0", "riskplus.tdiquickmsg.backflow.jsondata.push", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PushTdiquickmsgBackflowJsondataResponse({}));
  }

  /**
   * Description: saas风险咨询，决策流模式
   * Summary: saas风险咨询
   */
  async queryTdisaasSecurityPolicy(request: QueryTdisaasSecurityPolicyRequest): Promise<QueryTdisaasSecurityPolicyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryTdisaasSecurityPolicyEx(request, headers, runtime);
  }

  /**
   * Description: saas风险咨询，决策流模式
   * Summary: saas风险咨询
   */
  async queryTdisaasSecurityPolicyEx(request: QueryTdisaasSecurityPolicyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryTdisaasSecurityPolicyResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTdisaasSecurityPolicyResponse>(await this.doRequest("1.0", "riskplus.tdisaas.security.policy.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryTdisaasSecurityPolicyResponse({}));
  }

  /**
   * Description: 营销盾批量参数文件上传接口
   * Summary: 营销盾参数文件上传
   */
  async uploadUmktParamsFile(request: UploadUmktParamsFileRequest): Promise<UploadUmktParamsFileResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.uploadUmktParamsFileEx(request, headers, runtime);
  }

  /**
   * Description: 营销盾批量参数文件上传接口
   * Summary: 营销盾参数文件上传
   */
  async uploadUmktParamsFileEx(request: UploadUmktParamsFileRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UploadUmktParamsFileResponse> {
    if (!Util.isUnset(request.fileObject)) {
      let uploadReq = new CreateAntcloudGatewayxFileUploadRequest({
        authToken: request.authToken,
        apiCode: "riskplus.umkt.params.file.upload",
        fileName: request.fileObjectName,
      });
      let uploadResp = await this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
      if (!AntchainUtil.isSuccess(uploadResp.resultCode, "ok")) {
        let uploadUmktParamsFileResponse = new UploadUmktParamsFileResponse({
          reqMsgId: uploadResp.reqMsgId,
          resultCode: uploadResp.resultCode,
          resultMsg: uploadResp.resultMsg,
        });
        return uploadUmktParamsFileResponse;
      }

      let uploadHeaders = AntchainUtil.parseUploadHeaders(uploadResp.uploadHeaders);
      await AntchainUtil.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
      request.fileId = uploadResp.fileId;
      request.fileObject = null;
    }

    Util.validateModel(request);
    return $tea.cast<UploadUmktParamsFileResponse>(await this.doRequest("1.0", "riskplus.umkt.params.file.upload", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UploadUmktParamsFileResponse({}));
  }

  /**
   * Description: 营销盾实时营销服务，支持批量
   * Summary: 营销盾实时营销服务
   */
  async batchqueryUmktRtMarketing(request: BatchqueryUmktRtMarketingRequest): Promise<BatchqueryUmktRtMarketingResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchqueryUmktRtMarketingEx(request, headers, runtime);
  }

  /**
   * Description: 营销盾实时营销服务，支持批量
   * Summary: 营销盾实时营销服务
   */
  async batchqueryUmktRtMarketingEx(request: BatchqueryUmktRtMarketingRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchqueryUmktRtMarketingResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchqueryUmktRtMarketingResponse>(await this.doRequest("1.0", "riskplus.umkt.rt.marketing.batchquery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchqueryUmktRtMarketingResponse({}));
  }

  /**
   * Description: 梦网富信投放事件通知
   * Summary: 梦网富信投放事件通知
   */
  async syncUmktRtEventresult(request: SyncUmktRtEventresultRequest): Promise<SyncUmktRtEventresultResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.syncUmktRtEventresultEx(request, headers, runtime);
  }

  /**
   * Description: 梦网富信投放事件通知
   * Summary: 梦网富信投放事件通知
   */
  async syncUmktRtEventresultEx(request: SyncUmktRtEventresultRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SyncUmktRtEventresultResponse> {
    Util.validateModel(request);
    return $tea.cast<SyncUmktRtEventresultResponse>(await this.doRequest("1.0", "riskplus.umkt.rt.eventresult.sync", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SyncUmktRtEventresultResponse({}));
  }

  /**
   * Description: 营销盾场景租户信息上传or更新
   * Summary: 营销盾场景租户信息上传or更新
   */
  async importUmktSceneUpload(request: ImportUmktSceneUploadRequest): Promise<ImportUmktSceneUploadResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.importUmktSceneUploadEx(request, headers, runtime);
  }

  /**
   * Description: 营销盾场景租户信息上传or更新
   * Summary: 营销盾场景租户信息上传or更新
   */
  async importUmktSceneUploadEx(request: ImportUmktSceneUploadRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ImportUmktSceneUploadResponse> {
    Util.validateModel(request);
    return $tea.cast<ImportUmktSceneUploadResponse>(await this.doRequest("1.0", "riskplus.umkt.scene.upload.import", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ImportUmktSceneUploadResponse({}));
  }

  /**
   * Description: 富信贴尾实时圈客
   * Summary: 富信贴尾实时圈客
   */
  async batchqueryUmktRtTailmarketing(request: BatchqueryUmktRtTailmarketingRequest): Promise<BatchqueryUmktRtTailmarketingResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchqueryUmktRtTailmarketingEx(request, headers, runtime);
  }

  /**
   * Description: 富信贴尾实时圈客
   * Summary: 富信贴尾实时圈客
   */
  async batchqueryUmktRtTailmarketingEx(request: BatchqueryUmktRtTailmarketingRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchqueryUmktRtTailmarketingResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchqueryUmktRtTailmarketingResponse>(await this.doRequest("1.0", "riskplus.umkt.rt.tailmarketing.batchquery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchqueryUmktRtTailmarketingResponse({}));
  }

  /**
   * Description: 实时圈客场景策略测试
   * Summary: 实时圈客场景策略测试功能
   */
  async queryUmktScenestrategyTest(request: QueryUmktScenestrategyTestRequest): Promise<QueryUmktScenestrategyTestResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryUmktScenestrategyTestEx(request, headers, runtime);
  }

  /**
   * Description: 实时圈客场景策略测试
   * Summary: 实时圈客场景策略测试功能
   */
  async queryUmktScenestrategyTestEx(request: QueryUmktScenestrategyTestRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryUmktScenestrategyTestResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryUmktScenestrategyTestResponse>(await this.doRequest("1.0", "riskplus.umkt.scenestrategy.test.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryUmktScenestrategyTestResponse({}));
  }

  /**
   * Description: 发起AI外呼
   * Summary: 发起AI外呼
   */
  async applyUmktRobotcall(request: ApplyUmktRobotcallRequest): Promise<ApplyUmktRobotcallResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyUmktRobotcallEx(request, headers, runtime);
  }

  /**
   * Description: 发起AI外呼
   * Summary: 发起AI外呼
   */
  async applyUmktRobotcallEx(request: ApplyUmktRobotcallRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyUmktRobotcallResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyUmktRobotcallResponse>(await this.doRequest("1.0", "riskplus.umkt.robotcall.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyUmktRobotcallResponse({}));
  }

  /**
   * Description: 营销盾查询回执统计数据接口
   * Summary: 营销盾回执统计查询
   */
  async queryUmktDataaccessStatistic(request: QueryUmktDataaccessStatisticRequest): Promise<QueryUmktDataaccessStatisticResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryUmktDataaccessStatisticEx(request, headers, runtime);
  }

  /**
   * Description: 营销盾查询回执统计数据接口
   * Summary: 营销盾回执统计查询
   */
  async queryUmktDataaccessStatisticEx(request: QueryUmktDataaccessStatisticRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryUmktDataaccessStatisticResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryUmktDataaccessStatisticResponse>(await this.doRequest("1.0", "riskplus.umkt.dataaccess.statistic.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryUmktDataaccessStatisticResponse({}));
  }

  /**
   * Description: 营销盾离线批量任务取消接口
   * Summary: 营销盾取消离线批量任务
   */
  async cancelUmktDataaccessOfflinetask(request: CancelUmktDataaccessOfflinetaskRequest): Promise<CancelUmktDataaccessOfflinetaskResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.cancelUmktDataaccessOfflinetaskEx(request, headers, runtime);
  }

  /**
   * Description: 营销盾离线批量任务取消接口
   * Summary: 营销盾取消离线批量任务
   */
  async cancelUmktDataaccessOfflinetaskEx(request: CancelUmktDataaccessOfflinetaskRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CancelUmktDataaccessOfflinetaskResponse> {
    Util.validateModel(request);
    return $tea.cast<CancelUmktDataaccessOfflinetaskResponse>(await this.doRequest("1.0", "riskplus.umkt.dataaccess.offlinetask.cancel", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CancelUmktDataaccessOfflinetaskResponse({}));
  }

  /**
   * Description: 营销盾实时单一凭证营销接口，服务于近rta的场景
   * Summary: 营销盾实时单一凭证营销接口
   */
  async queryUmktRtMarketing(request: QueryUmktRtMarketingRequest): Promise<QueryUmktRtMarketingResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryUmktRtMarketingEx(request, headers, runtime);
  }

  /**
   * Description: 营销盾实时单一凭证营销接口，服务于近rta的场景
   * Summary: 营销盾实时单一凭证营销接口
   */
  async queryUmktRtMarketingEx(request: QueryUmktRtMarketingRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryUmktRtMarketingResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryUmktRtMarketingResponse>(await this.doRequest("1.0", "riskplus.umkt.rt.marketing.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryUmktRtMarketingResponse({}));
  }

  /**
   * Description: 营销盾业务回流事件推送
   * Summary: 营销盾回流事件推送
   */
  async pushUmktBackflowEvent(request: PushUmktBackflowEventRequest): Promise<PushUmktBackflowEventResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pushUmktBackflowEventEx(request, headers, runtime);
  }

  /**
   * Description: 营销盾业务回流事件推送
   * Summary: 营销盾回流事件推送
   */
  async pushUmktBackflowEventEx(request: PushUmktBackflowEventRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PushUmktBackflowEventResponse> {
    Util.validateModel(request);
    return $tea.cast<PushUmktBackflowEventResponse>(await this.doRequest("1.0", "riskplus.umkt.backflow.event.push", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PushUmktBackflowEventResponse({}));
  }

  /**
   * Description: 卡片短信批量发送接口
   * Summary: 卡片短信批量发送接口
   */
  async sendUmktCardsmsBatch(request: SendUmktCardsmsBatchRequest): Promise<SendUmktCardsmsBatchResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.sendUmktCardsmsBatchEx(request, headers, runtime);
  }

  /**
   * Description: 卡片短信批量发送接口
   * Summary: 卡片短信批量发送接口
   */
  async sendUmktCardsmsBatchEx(request: SendUmktCardsmsBatchRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SendUmktCardsmsBatchResponse> {
    Util.validateModel(request);
    return $tea.cast<SendUmktCardsmsBatchResponse>(await this.doRequest("1.0", "riskplus.umkt.cardsms.batch.send", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SendUmktCardsmsBatchResponse({}));
  }

  /**
   * Description: 卡片短信支持能力查询
   * Summary: 卡片短信支持能力查询
   */
  async queryUmktCardsmsSupport(request: QueryUmktCardsmsSupportRequest): Promise<QueryUmktCardsmsSupportResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryUmktCardsmsSupportEx(request, headers, runtime);
  }

  /**
   * Description: 卡片短信支持能力查询
   * Summary: 卡片短信支持能力查询
   */
  async queryUmktCardsmsSupportEx(request: QueryUmktCardsmsSupportRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryUmktCardsmsSupportResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryUmktCardsmsSupportResponse>(await this.doRequest("1.0", "riskplus.umkt.cardsms.support.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryUmktCardsmsSupportResponse({}));
  }

  /**
   * Description: 文本短信批量发送接口
   * Summary: 文本短信批量发送接口
   */
  async sendUmktTextsmsBatch(request: SendUmktTextsmsBatchRequest): Promise<SendUmktTextsmsBatchResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.sendUmktTextsmsBatchEx(request, headers, runtime);
  }

  /**
   * Description: 文本短信批量发送接口
   * Summary: 文本短信批量发送接口
   */
  async sendUmktTextsmsBatchEx(request: SendUmktTextsmsBatchRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SendUmktTextsmsBatchResponse> {
    Util.validateModel(request);
    return $tea.cast<SendUmktTextsmsBatchResponse>(await this.doRequest("1.0", "riskplus.umkt.textsms.batch.send", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SendUmktTextsmsBatchResponse({}));
  }

  /**
   * Description: 数字短信批量发送接口（单模板）
   * Summary: 数字短信批量发送接口（单模板）
   */
  async sendUmktDigitalsmsBatch(request: SendUmktDigitalsmsBatchRequest): Promise<SendUmktDigitalsmsBatchResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.sendUmktDigitalsmsBatchEx(request, headers, runtime);
  }

  /**
   * Description: 数字短信批量发送接口（单模板）
   * Summary: 数字短信批量发送接口（单模板）
   */
  async sendUmktDigitalsmsBatchEx(request: SendUmktDigitalsmsBatchRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SendUmktDigitalsmsBatchResponse> {
    Util.validateModel(request);
    return $tea.cast<SendUmktDigitalsmsBatchResponse>(await this.doRequest("1.0", "riskplus.umkt.digitalsms.batch.send", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SendUmktDigitalsmsBatchResponse({}));
  }

  /**
   * Description: 分页查询cpaas短信模板
   * Summary: cpaas短信模板分页查询
   */
  async queryUmktCpaassmsTemplate(request: QueryUmktCpaassmsTemplateRequest): Promise<QueryUmktCpaassmsTemplateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryUmktCpaassmsTemplateEx(request, headers, runtime);
  }

  /**
   * Description: 分页查询cpaas短信模板
   * Summary: cpaas短信模板分页查询
   */
  async queryUmktCpaassmsTemplateEx(request: QueryUmktCpaassmsTemplateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryUmktCpaassmsTemplateResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryUmktCpaassmsTemplateResponse>(await this.doRequest("1.0", "riskplus.umkt.cpaassms.template.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryUmktCpaassmsTemplateResponse({}));
  }

  /**
   * Description: 实时混合批量营销圈客
   * Summary: 实时混合批量营销圈客
   */
  async batchqueryUmktRtMixedmarketing(request: BatchqueryUmktRtMixedmarketingRequest): Promise<BatchqueryUmktRtMixedmarketingResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchqueryUmktRtMixedmarketingEx(request, headers, runtime);
  }

  /**
   * Description: 实时混合批量营销圈客
   * Summary: 实时混合批量营销圈客
   */
  async batchqueryUmktRtMixedmarketingEx(request: BatchqueryUmktRtMixedmarketingRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchqueryUmktRtMixedmarketingResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchqueryUmktRtMixedmarketingResponse>(await this.doRequest("1.0", "riskplus.umkt.rt.mixedmarketing.batchquery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchqueryUmktRtMixedmarketingResponse({}));
  }

  /**
   * Description: 调用营销盾空号检测
   * Summary: 调用营销盾空号检测
   */
  async applyUmktPhonenumberstatusforsms(request: ApplyUmktPhonenumberstatusforsmsRequest): Promise<ApplyUmktPhonenumberstatusforsmsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyUmktPhonenumberstatusforsmsEx(request, headers, runtime);
  }

  /**
   * Description: 调用营销盾空号检测
   * Summary: 调用营销盾空号检测
   */
  async applyUmktPhonenumberstatusforsmsEx(request: ApplyUmktPhonenumberstatusforsmsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyUmktPhonenumberstatusforsmsResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyUmktPhonenumberstatusforsmsResponse>(await this.doRequest("1.0", "riskplus.umkt.phonenumberstatusforsms.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyUmktPhonenumberstatusforsmsResponse({}));
  }

  /**
   * Description: 营销实时topN圈客
   * Summary: 营销实时topN圈客
   */
  async batchqueryUmktRtTopn(request: BatchqueryUmktRtTopnRequest): Promise<BatchqueryUmktRtTopnResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchqueryUmktRtTopnEx(request, headers, runtime);
  }

  /**
   * Description: 营销实时topN圈客
   * Summary: 营销实时topN圈客
   */
  async batchqueryUmktRtTopnEx(request: BatchqueryUmktRtTopnRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchqueryUmktRtTopnResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchqueryUmktRtTopnResponse>(await this.doRequest("1.0", "riskplus.umkt.rt.topn.batchquery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchqueryUmktRtTopnResponse({}));
  }

  /**
   * Description: 外呼任务统计查询接口
   * Summary: 外呼任务统计查询接口
   */
  async queryUmktRobotcallStatisticinfo(request: QueryUmktRobotcallStatisticinfoRequest): Promise<QueryUmktRobotcallStatisticinfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryUmktRobotcallStatisticinfoEx(request, headers, runtime);
  }

  /**
   * Description: 外呼任务统计查询接口
   * Summary: 外呼任务统计查询接口
   */
  async queryUmktRobotcallStatisticinfoEx(request: QueryUmktRobotcallStatisticinfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryUmktRobotcallStatisticinfoResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryUmktRobotcallStatisticinfoResponse>(await this.doRequest("1.0", "riskplus.umkt.robotcall.statisticinfo.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryUmktRobotcallStatisticinfoResponse({}));
  }

  /**
   * Description: 营销盾租户场景信息查询
   * Summary: 营销盾租户场景信息查询
   */
  async queryUmktTenantActionplaninfo(request: QueryUmktTenantActionplaninfoRequest): Promise<QueryUmktTenantActionplaninfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryUmktTenantActionplaninfoEx(request, headers, runtime);
  }

  /**
   * Description: 营销盾租户场景信息查询
   * Summary: 营销盾租户场景信息查询
   */
  async queryUmktTenantActionplaninfoEx(request: QueryUmktTenantActionplaninfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryUmktTenantActionplaninfoResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryUmktTenantActionplaninfoResponse>(await this.doRequest("1.0", "riskplus.umkt.tenant.actionplaninfo.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryUmktTenantActionplaninfoResponse({}));
  }

  /**
   * Description: 查询ai外呼任务详情
   * Summary: 查询ai外呼任务详情
   */
  async queryUmktRobotcallDetail(request: QueryUmktRobotcallDetailRequest): Promise<QueryUmktRobotcallDetailResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryUmktRobotcallDetailEx(request, headers, runtime);
  }

  /**
   * Description: 查询ai外呼任务详情
   * Summary: 查询ai外呼任务详情
   */
  async queryUmktRobotcallDetailEx(request: QueryUmktRobotcallDetailRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryUmktRobotcallDetailResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryUmktRobotcallDetailResponse>(await this.doRequest("1.0", "riskplus.umkt.robotcall.detail.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryUmktRobotcallDetailResponse({}));
  }

  /**
   * Description: 发起触达营销任务 ---目前仅支持文本短信
   * Summary: 发起触达营销任务
   */
  async applyUmktRealtimemarketing(request: ApplyUmktRealtimemarketingRequest): Promise<ApplyUmktRealtimemarketingResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyUmktRealtimemarketingEx(request, headers, runtime);
  }

  /**
   * Description: 发起触达营销任务 ---目前仅支持文本短信
   * Summary: 发起触达营销任务
   */
  async applyUmktRealtimemarketingEx(request: ApplyUmktRealtimemarketingRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyUmktRealtimemarketingResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyUmktRealtimemarketingResponse>(await this.doRequest("1.0", "riskplus.umkt.realtimemarketing.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyUmktRealtimemarketingResponse({}));
  }

  /**
   * Description: 批量实时策略触达
   * Summary: 批量实时策略触达
   */
  async applyUmktRtBatchmarketing(request: ApplyUmktRtBatchmarketingRequest): Promise<ApplyUmktRtBatchmarketingResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyUmktRtBatchmarketingEx(request, headers, runtime);
  }

  /**
   * Description: 批量实时策略触达
   * Summary: 批量实时策略触达
   */
  async applyUmktRtBatchmarketingEx(request: ApplyUmktRtBatchmarketingRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyUmktRtBatchmarketingResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyUmktRtBatchmarketingResponse>(await this.doRequest("1.0", "riskplus.umkt.rt.batchmarketing.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyUmktRtBatchmarketingResponse({}));
  }

  /**
   * Description: 新接入ai外呼服务商的回调接口
   * Summary: ai外呼回调接口
   */
  async callbackUmktRobotcall(request: CallbackUmktRobotcallRequest): Promise<CallbackUmktRobotcallResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.callbackUmktRobotcallEx(request, headers, runtime);
  }

  /**
   * Description: 新接入ai外呼服务商的回调接口
   * Summary: ai外呼回调接口
   */
  async callbackUmktRobotcallEx(request: CallbackUmktRobotcallRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CallbackUmktRobotcallResponse> {
    Util.validateModel(request);
    return $tea.cast<CallbackUmktRobotcallResponse>(await this.doRequest("1.0", "riskplus.umkt.robotcall.callback", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CallbackUmktRobotcallResponse({}));
  }

  /**
   * Description: 营销盾上行短信回调接口
   * Summary: 营销盾上行短信回调
   */
  async callbackUmktSmsUp(request: CallbackUmktSmsUpRequest): Promise<CallbackUmktSmsUpResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.callbackUmktSmsUpEx(request, headers, runtime);
  }

  /**
   * Description: 营销盾上行短信回调接口
   * Summary: 营销盾上行短信回调
   */
  async callbackUmktSmsUpEx(request: CallbackUmktSmsUpRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CallbackUmktSmsUpResponse> {
    Util.validateModel(request);
    return $tea.cast<CallbackUmktSmsUpResponse>(await this.doRequest("1.0", "riskplus.umkt.sms.up.callback", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CallbackUmktSmsUpResponse({}));
  }

  /**
   * Description: 营销盾短信状态回调接口
   * Summary: 营销盾短信状态回调
   */
  async callbackUmktSmsReport(request: CallbackUmktSmsReportRequest): Promise<CallbackUmktSmsReportResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.callbackUmktSmsReportEx(request, headers, runtime);
  }

  /**
   * Description: 营销盾短信状态回调接口
   * Summary: 营销盾短信状态回调
   */
  async callbackUmktSmsReportEx(request: CallbackUmktSmsReportRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CallbackUmktSmsReportResponse> {
    Util.validateModel(request);
    return $tea.cast<CallbackUmktSmsReportResponse>(await this.doRequest("1.0", "riskplus.umkt.sms.report.callback", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CallbackUmktSmsReportResponse({}));
  }

  /**
   * Description: 分页查询租户外呼策略
   * Summary: 营销盾租户场景批量信息查询 
   */
  async batchqueryUmktTenantActionplaninfo(request: BatchqueryUmktTenantActionplaninfoRequest): Promise<BatchqueryUmktTenantActionplaninfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchqueryUmktTenantActionplaninfoEx(request, headers, runtime);
  }

  /**
   * Description: 分页查询租户外呼策略
   * Summary: 营销盾租户场景批量信息查询 
   */
  async batchqueryUmktTenantActionplaninfoEx(request: BatchqueryUmktTenantActionplaninfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchqueryUmktTenantActionplaninfoResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchqueryUmktTenantActionplaninfoResponse>(await this.doRequest("1.0", "riskplus.umkt.tenant.actionplaninfo.batchquery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchqueryUmktTenantActionplaninfoResponse({}));
  }

  /**
   * Description: 营销盾批次外呼内单个/多个手机号查询拨打情况
  (已下线)
   * Summary: 营销盾外呼详情查询接口
   */
  async batchqueryUmktRobotcallDetail(request: BatchqueryUmktRobotcallDetailRequest): Promise<BatchqueryUmktRobotcallDetailResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchqueryUmktRobotcallDetailEx(request, headers, runtime);
  }

  /**
   * Description: 营销盾批次外呼内单个/多个手机号查询拨打情况
  (已下线)
   * Summary: 营销盾外呼详情查询接口
   */
  async batchqueryUmktRobotcallDetailEx(request: BatchqueryUmktRobotcallDetailRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchqueryUmktRobotcallDetailResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchqueryUmktRobotcallDetailResponse>(await this.doRequest("1.0", "riskplus.umkt.robotcall.detail.batchquery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchqueryUmktRobotcallDetailResponse({}));
  }

  /**
   * Description: 营销盾查询外呼策略详情
   * Summary: 营销盾查询外呼策略详情
   */
  async batchqueryUmktActionplanDetail(request: BatchqueryUmktActionplanDetailRequest): Promise<BatchqueryUmktActionplanDetailResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchqueryUmktActionplanDetailEx(request, headers, runtime);
  }

  /**
   * Description: 营销盾查询外呼策略详情
   * Summary: 营销盾查询外呼策略详情
   */
  async batchqueryUmktActionplanDetailEx(request: BatchqueryUmktActionplanDetailRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchqueryUmktActionplanDetailResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchqueryUmktActionplanDetailResponse>(await this.doRequest("1.0", "riskplus.umkt.actionplan.detail.batchquery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchqueryUmktActionplanDetailResponse({}));
  }

  /**
   * Description: 营销盾通用回流推送服务
   * Summary: 营销盾通用回流推送服务
   */
  async pushRiskplusUmktCommonbackflow(request: PushRiskplusUmktCommonbackflowRequest): Promise<PushRiskplusUmktCommonbackflowResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pushRiskplusUmktCommonbackflowEx(request, headers, runtime);
  }

  /**
   * Description: 营销盾通用回流推送服务
   * Summary: 营销盾通用回流推送服务
   */
  async pushRiskplusUmktCommonbackflowEx(request: PushRiskplusUmktCommonbackflowRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PushRiskplusUmktCommonbackflowResponse> {
    Util.validateModel(request);
    return $tea.cast<PushRiskplusUmktCommonbackflowResponse>(await this.doRequest("1.0", "riskplus.riskplus.umkt.commonbackflow.push", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PushRiskplusUmktCommonbackflowResponse({}));
  }

  /**
   * Description: 营销盾通用数据推送服务
   * Summary: 营销盾通用数据推送服务
   */
  async pushUmktCommonData(request: PushUmktCommonDataRequest): Promise<PushUmktCommonDataResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pushUmktCommonDataEx(request, headers, runtime);
  }

  /**
   * Description: 营销盾通用数据推送服务
   * Summary: 营销盾通用数据推送服务
   */
  async pushUmktCommonDataEx(request: PushUmktCommonDataRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PushUmktCommonDataResponse> {
    Util.validateModel(request);
    return $tea.cast<PushUmktCommonDataResponse>(await this.doRequest("1.0", "riskplus.umkt.common.data.push", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PushUmktCommonDataResponse({}));
  }

  /**
   * Description: 营销盾客群推送服务
   * Summary: 营销盾客群推送服务
   */
  async pushUmktCustomerGroup(request: PushUmktCustomerGroupRequest): Promise<PushUmktCustomerGroupResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pushUmktCustomerGroupEx(request, headers, runtime);
  }

  /**
   * Description: 营销盾客群推送服务
   * Summary: 营销盾客群推送服务
   */
  async pushUmktCustomerGroupEx(request: PushUmktCustomerGroupRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PushUmktCustomerGroupResponse> {
    Util.validateModel(request);
    return $tea.cast<PushUmktCustomerGroupResponse>(await this.doRequest("1.0", "riskplus.umkt.customer.group.push", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PushUmktCustomerGroupResponse({}));
  }

  /**
   * Description: 触达执行任务详情查询
   * Summary: 触达执行任务详情查询
   */
  async batchqueryUmktTaskDetail(request: BatchqueryUmktTaskDetailRequest): Promise<BatchqueryUmktTaskDetailResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchqueryUmktTaskDetailEx(request, headers, runtime);
  }

  /**
   * Description: 触达执行任务详情查询
   * Summary: 触达执行任务详情查询
   */
  async batchqueryUmktTaskDetailEx(request: BatchqueryUmktTaskDetailRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchqueryUmktTaskDetailResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchqueryUmktTaskDetailResponse>(await this.doRequest("1.0", "riskplus.umkt.task.detail.batchquery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchqueryUmktTaskDetailResponse({}));
  }

  /**
   * Description: 营销盾数据回流推送，用于客户定制json数据
   * Summary: 营销盾数据回流json格式推送
   */
  async pushUmktBackflowJsondata(request: PushUmktBackflowJsondataRequest): Promise<PushUmktBackflowJsondataResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pushUmktBackflowJsondataEx(request, headers, runtime);
  }

  /**
   * Description: 营销盾数据回流推送，用于客户定制json数据
   * Summary: 营销盾数据回流json格式推送
   */
  async pushUmktBackflowJsondataEx(request: PushUmktBackflowJsondataRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PushUmktBackflowJsondataResponse> {
    Util.validateModel(request);
    return $tea.cast<PushUmktBackflowJsondataResponse>(await this.doRequest("1.0", "riskplus.umkt.backflow.jsondata.push", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PushUmktBackflowJsondataResponse({}));
  }

  /**
   * Description: 营销盾卡短解析服务能力提供接口
   * Summary: 营销盾卡短解析服务接口
   */
  async queryUmktCardsmsAnalysis(request: QueryUmktCardsmsAnalysisRequest): Promise<QueryUmktCardsmsAnalysisResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryUmktCardsmsAnalysisEx(request, headers, runtime);
  }

  /**
   * Description: 营销盾卡短解析服务能力提供接口
   * Summary: 营销盾卡短解析服务接口
   */
  async queryUmktCardsmsAnalysisEx(request: QueryUmktCardsmsAnalysisRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryUmktCardsmsAnalysisResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryUmktCardsmsAnalysisResponse>(await this.doRequest("1.0", "riskplus.umkt.cardsms.analysis.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryUmktCardsmsAnalysisResponse({}));
  }

  /**
   * Description: 营销盾离线圈客文件导入
   * Summary: 营销盾离线圈客文件导入
   */
  async uploadUmktOfflinedecision(request: UploadUmktOfflinedecisionRequest): Promise<UploadUmktOfflinedecisionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.uploadUmktOfflinedecisionEx(request, headers, runtime);
  }

  /**
   * Description: 营销盾离线圈客文件导入
   * Summary: 营销盾离线圈客文件导入
   */
  async uploadUmktOfflinedecisionEx(request: UploadUmktOfflinedecisionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UploadUmktOfflinedecisionResponse> {
    if (!Util.isUnset(request.fileObject)) {
      let uploadReq = new CreateAntcloudGatewayxFileUploadRequest({
        authToken: request.authToken,
        apiCode: "riskplus.umkt.offlinedecision.upload",
        fileName: request.fileObjectName,
      });
      let uploadResp = await this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
      if (!AntchainUtil.isSuccess(uploadResp.resultCode, "ok")) {
        let uploadUmktOfflinedecisionResponse = new UploadUmktOfflinedecisionResponse({
          reqMsgId: uploadResp.reqMsgId,
          resultCode: uploadResp.resultCode,
          resultMsg: uploadResp.resultMsg,
        });
        return uploadUmktOfflinedecisionResponse;
      }

      let uploadHeaders = AntchainUtil.parseUploadHeaders(uploadResp.uploadHeaders);
      await AntchainUtil.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
      request.fileId = uploadResp.fileId;
      request.fileObject = null;
    }

    Util.validateModel(request);
    return $tea.cast<UploadUmktOfflinedecisionResponse>(await this.doRequest("1.0", "riskplus.umkt.offlinedecision.upload", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UploadUmktOfflinedecisionResponse({}));
  }

  /**
   * Description: 营销盾查询可拉取圈客结果的计划集合
   * Summary: 营销盾查询可拉取圈客结果的计划集合
   */
  async queryUmktOfflinedecisionResult(request: QueryUmktOfflinedecisionResultRequest): Promise<QueryUmktOfflinedecisionResultResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryUmktOfflinedecisionResultEx(request, headers, runtime);
  }

  /**
   * Description: 营销盾查询可拉取圈客结果的计划集合
   * Summary: 营销盾查询可拉取圈客结果的计划集合
   */
  async queryUmktOfflinedecisionResultEx(request: QueryUmktOfflinedecisionResultRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryUmktOfflinedecisionResultResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryUmktOfflinedecisionResultResponse>(await this.doRequest("1.0", "riskplus.umkt.offlinedecision.result.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryUmktOfflinedecisionResultResponse({}));
  }

  /**
   * Description: 营销盾离线圈客结果文件拉取
   * Summary: 营销盾离线圈客结果文件拉取
   */
  async downloadUmktOfflinedecisionResult(request: DownloadUmktOfflinedecisionResultRequest): Promise<DownloadUmktOfflinedecisionResultResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.downloadUmktOfflinedecisionResultEx(request, headers, runtime);
  }

  /**
   * Description: 营销盾离线圈客结果文件拉取
   * Summary: 营销盾离线圈客结果文件拉取
   */
  async downloadUmktOfflinedecisionResultEx(request: DownloadUmktOfflinedecisionResultRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DownloadUmktOfflinedecisionResultResponse> {
    Util.validateModel(request);
    return $tea.cast<DownloadUmktOfflinedecisionResultResponse>(await this.doRequest("1.0", "riskplus.umkt.offlinedecision.result.download", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DownloadUmktOfflinedecisionResultResponse({}));
  }

  /**
   * Description: 包含离线圈客关联计划和任务状态详情
   * Summary: 营销盾离线圈客计划执行详情 
   */
  async queryUmktOfflinedecisionPlandetails(request: QueryUmktOfflinedecisionPlandetailsRequest): Promise<QueryUmktOfflinedecisionPlandetailsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryUmktOfflinedecisionPlandetailsEx(request, headers, runtime);
  }

  /**
   * Description: 包含离线圈客关联计划和任务状态详情
   * Summary: 营销盾离线圈客计划执行详情 
   */
  async queryUmktOfflinedecisionPlandetailsEx(request: QueryUmktOfflinedecisionPlandetailsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryUmktOfflinedecisionPlandetailsResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryUmktOfflinedecisionPlandetailsResponse>(await this.doRequest("1.0", "riskplus.umkt.offlinedecision.plandetails.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryUmktOfflinedecisionPlandetailsResponse({}));
  }

  /**
   * Description: 营销盾离线圈投一体文件上传
   * Summary: 营销盾离线圈投一体文件上传
   */
  async uploadUmktOfflineImportrecord(request: UploadUmktOfflineImportrecordRequest): Promise<UploadUmktOfflineImportrecordResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.uploadUmktOfflineImportrecordEx(request, headers, runtime);
  }

  /**
   * Description: 营销盾离线圈投一体文件上传
   * Summary: 营销盾离线圈投一体文件上传
   */
  async uploadUmktOfflineImportrecordEx(request: UploadUmktOfflineImportrecordRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UploadUmktOfflineImportrecordResponse> {
    if (!Util.isUnset(request.fileObject)) {
      let uploadReq = new CreateAntcloudGatewayxFileUploadRequest({
        authToken: request.authToken,
        apiCode: "riskplus.umkt.offline.importrecord.upload",
        fileName: request.fileObjectName,
      });
      let uploadResp = await this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
      if (!AntchainUtil.isSuccess(uploadResp.resultCode, "ok")) {
        let uploadUmktOfflineImportrecordResponse = new UploadUmktOfflineImportrecordResponse({
          reqMsgId: uploadResp.reqMsgId,
          resultCode: uploadResp.resultCode,
          resultMsg: uploadResp.resultMsg,
        });
        return uploadUmktOfflineImportrecordResponse;
      }

      let uploadHeaders = AntchainUtil.parseUploadHeaders(uploadResp.uploadHeaders);
      await AntchainUtil.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
      request.fileId = uploadResp.fileId;
      request.fileObject = null;
    }

    Util.validateModel(request);
    return $tea.cast<UploadUmktOfflineImportrecordResponse>(await this.doRequest("1.0", "riskplus.umkt.offline.importrecord.upload", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UploadUmktOfflineImportrecordResponse({}));
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
