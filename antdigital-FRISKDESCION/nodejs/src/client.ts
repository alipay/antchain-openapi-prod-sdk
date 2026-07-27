// This file is auto-generated, don't edit it
import AntchainUtil from '@antchain/alipay-util';
import Util, * as $Util from '@alicloud/tea-util';
import RPCUtil from '@alicloud/rpc-util';
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

// air引擎输出infoCode
export class AirInfoCodes extends $tea.Model {
  // infoCode
  /**
   * @example
   * name
   */
  name?: string;
  // infoCode描述
  /**
   * @example
   * xxx
   */
  description?: string;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      description: 'description',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      description: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 企业风险等级分布统计
export class RtopLevelDistribution extends $tea.Model {
  // 统计值
  /**
   * @example
   * 10
   */
  count: number;
  // 等级
  /**
   * @example
   * EX_HIGH_RISK
   */
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
  /**
   * @example
   * infocode
   */
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

// air引擎决策流输出信息
export class AirDecisionFlows extends $tea.Model {
  // 决策结果
  /**
   * @example
   * review
   */
  decision?: string;
  // air引擎输出的infoCodes信息
  /**
   * @example
   * info_codes
   */
  infoCodes?: AirInfoCodes[];
  // 策略名称
  /**
   * @example
   * name
   */
  name?: string;
  static names(): { [key: string]: string } {
    return {
      decision: 'decision',
      infoCodes: 'info_codes',
      name: 'name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      decision: 'string',
      infoCodes: { 'type': 'array', 'itemType': AirInfoCodes },
      name: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 营销盾半圈投返回节点关联任务信息
export class UmktCampaignRelationTaskInfo extends $tea.Model {
  // 关联资源id
  /**
   * @example
   * bizCode1
   */
  resourceId: string;
  // 任务状态
  // WFE-待执行
  // D - 已完成
  // ECN - 执行中
  // C - 取消
  // F - 执行失败
  /**
   * @example
   * D
   */
  taskStatus: string;
  // 错误信息
  /**
   * @example
   * odps2oss执行失败
   */
  errMsg: string;
  static names(): { [key: string]: string } {
    return {
      resourceId: 'resource_id',
      taskStatus: 'task_status',
      errMsg: 'err_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      resourceId: 'string',
      taskStatus: 'string',
      errMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 删除参数
export class OutParams extends $tea.Model {
  // 输出参数
  /**
   * @example
   * rate
   */
  name: string;
  // 参数描述
  /**
   * @example
   * 率利
   */
  desc: string;
  // 参数值
  /**
   * @example
   * accept
   */
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
  /**
   * @example
   * web
   */
  accessChannel?: string;
  // 事件信息
  ctuParams?: string;
  // 产品名称
  /**
   * @example
   * mobile_cashier
   */
  productName?: string;
  // 产品节点
  /**
   * @example
   * code
   */
  productNode?: string;
  // 扩展参数
  /**
   * @example
   * 1234
   */
  securitySceneParams?: string;
  // 系统名称
  /**
   * @example
   * mobilecashier
   */
  systemName?: string;
  // 总金额
  /**
   * @example
   * 10.0
   */
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
  /**
   * @example
   * 1
   */
  kind: string;
  // 联系人姓名
  /**
   * @example
   * 张三
   */
  name: string;
  // 联系人手机号
  /**
   * @example
   * 12345
   */
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
  /**
   * @example
   * aft_v3
   */
  name: string;
  // 变量值
  /**
   * @example
   * 4.0
   */
  value: string;
  // 变量值类型
  /**
   * @example
   * Double
   */
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
  /**
   * @example
   * 1
   */
  ruleWeight: string;
  // 反欺诈风险数据服务命中规则名称
  /**
   * @example
   * 贷款车辆厂商指导价与实际不符
   */
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

// 经营数据
export class EcMonthData extends $tea.Model {
  // 月份格式为YYYYMM
  /**
   * @example
   * 202210
   */
  month: string;
  // 实际结算金额/销售收入 单位：元，格式：数字，小数点后两位
  /**
   * @example
   * 22300000.00
   */
  purchaseAmount: number;
  // GMV，单位：元，格式：数字，小数点后两位
  /**
   * @example
   * 22300000.00
   */
  gmv: number;
  // 退货率。单位：%，格式：数字，小数点后两位
  /**
   * @example
   * 3.08
   */
  retRate: number;
  static names(): { [key: string]: string } {
    return {
      month: 'month',
      purchaseAmount: 'purchase_amount',
      gmv: 'gmv',
      retRate: 'ret_rate',
    };
  }

  static types(): { [key: string]: any } {
    return {
      month: 'string',
      purchaseAmount: 'number',
      gmv: 'number',
      retRate: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 回流事件记录属性项
export class BackflowEventRecordProperty extends $tea.Model {
  // 属性code
  /**
   * @example
   * mobile
   */
  key: string;
  // 属性value，统一为字符串
  /**
   * @example
   * 18941147005
   */
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
  /**
   * @example
   * 1
   */
  term: string;
  // 期供金额
  /**
   * @example
   * 1999.98
   */
  termAmount: number;
  // 当期本金
  /**
   * @example
   * 1999.98
   */
  termPrincipal: number;
  // 当期利息（分期产生的利息/手续费）
  /**
   * @example
   * 1999.98
   */
  termFee: number;
  // 应还款日期
  /**
   * @example
   * yyyy-MM-dd
   */
  settleDate: string;
  // 罚息
  /**
   * @example
   * 1999.98
   */
  penalty?: number;
  // 担保费
  /**
   * @example
   * 1999.98
   */
  guaranteeFee?: number;
  // 违约金
  /**
   * @example
   * 1999.98
   */
  liquidatedDamages?: number;
  // 服务费
  /**
   * @example
   * 1999.98
   */
  serverFee?: number;
  // 减免金额
  /**
   * @example
   * 1999.98
   */
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
  /**
   * @example
   * 15011111605
   */
  customerKey?: string;
  // 输入模板
  /**
   * @example
   * MOBILE
   */
  queryTemplate?: string;
  // 实时营销结果
  /**
   * @example
   * 1
   */
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

// 营销盾半圈投节点任务信息
export class UmktCampaignNodeTaskInfo extends $tea.Model {
  // 节点id
  /**
   * @example
   * xxxxx
   */
  nodeId: string;
  // 节点任务状态
  /**
   * @example
   * D
   */
  nodeTaskStatus: string;
  // 节点任务执行日期 yyyy-MM-dd格式
  /**
   * @example
   * 2025-12-25
   */
  execDate: string;
  // 节点任务关联资源任务列表
  /**
   * @example
   * [{"resourceId":"bizCode","taskStatus":"D"}]
   */
  relTaskList: UmktCampaignRelationTaskInfo[];
  static names(): { [key: string]: string } {
    return {
      nodeId: 'node_id',
      nodeTaskStatus: 'node_task_status',
      execDate: 'exec_date',
      relTaskList: 'rel_task_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      nodeId: 'string',
      nodeTaskStatus: 'string',
      execDate: 'string',
      relTaskList: { 'type': 'array', 'itemType': UmktCampaignRelationTaskInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 企业类型分布统计
export class RtopTypeDistribution extends $tea.Model {
  // 统计值
  /**
   * @example
   * 10
   */
  count: number;
  // 当前类型下的等级分布
  /**
   * @example
   * undefined
   */
  levelDistribution: RtopLevelDistribution[];
  // 类型
  /**
   * @example
   * MLM
   */
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
  /**
   * @example
   * 1
   */
  taskId: number;
  // 圈客计划id
  decisionPlanId: number;
  // 圈客结果状态
  /**
   * @example
   * D
   */
  decisionResultStatus: string;
  // 圈客结果状态描述
  /**
   * @example
   * 已完成
   */
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

// 还款账单明细Object
export class BillDetail extends $tea.Model {
  // 对账流水号，在扣款回盘文件中返回，用于对账
  /**
   * @example
   * xxxx
   */
  serialNumber?: string;
  // 还款期数
  /**
   * @example
   * 1
   */
  rpyTerm: number;
  // 账单维度的还款总额（单位：分），单笔账单本利罚之和
  /**
   * @example
   * 1999.98
   */
  rpyAmt: number;
  // 实还本金（单位：分）
  /**
   * @example
   * 1999.98
   */
  rpyPrincipal: number;
  // 实还利息（单位：分）
  /**
   * @example
   * 1999.98
   */
  rpyFeeAmt: number;
  // 实还罚息（单位：分）
  /**
   * @example
   * 1999.98
   */
  rpyMuclt: number;
  // 其他科目金额，可能会其他类型的金额,用json数组的格式提高扩展性，涉及到保费和咨询服务费的项目，需要提供此字段。
  // 
  /**
   * @example
   * [{"fee":"费用（单位：分）","type":"（费用大项）1:保费, 2:信用评估费类","subType":"费用子项） 57:担保咨询服务费（属于信用评估费类型）  50:信用评估费（属于信用评估费类型）  40保费","insureMode":"分期乐内部担保模式号"}]
   */
  otherInfo?: string;
  // 用户实还日，用户主动发起是当前日；定时扣款是应还日，格式=yyyy-MM-dd
  /**
   * @example
   * yyyy-MM-dd
   */
  rpyDate?: string;
  static names(): { [key: string]: string } {
    return {
      serialNumber: 'serial_number',
      rpyTerm: 'rpy_term',
      rpyAmt: 'rpy_amt',
      rpyPrincipal: 'rpy_principal',
      rpyFeeAmt: 'rpy_fee_amt',
      rpyMuclt: 'rpy_muclt',
      otherInfo: 'other_info',
      rpyDate: 'rpy_date',
    };
  }

  static types(): { [key: string]: any } {
    return {
      serialNumber: 'string',
      rpyTerm: 'number',
      rpyAmt: 'number',
      rpyPrincipal: 'number',
      rpyFeeAmt: 'number',
      rpyMuclt: 'number',
      otherInfo: 'string',
      rpyDate: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 电商支用订单详情
export class EcLoanAppls extends $tea.Model {
  // 客户ID
  /**
   * @example
   * 232
   */
  userId: string;
  // 申请单号 系统的申请单号
  /**
   * @example
   * 1232
   */
  orderNo: string;
  // 提款单状态
  /**
   * @example
   * 1
   */
  orderStatus: string;
  // 借据号
  /**
   * @example
   * 123
   */
  loanNo: string;
  static names(): { [key: string]: string } {
    return {
      userId: 'user_id',
      orderNo: 'order_no',
      orderStatus: 'order_status',
      loanNo: 'loan_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      userId: 'string',
      orderNo: 'string',
      orderStatus: 'string',
      loanNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 营销盾触达媒介参数信息
export class ActionParamInfo extends $tea.Model {
  // 触达媒介类型
  /**
   * @example
   * ROBOT_CALL
   */
  contentType: string;
  // 触达媒介参数列表
  /**
   * @example
   * ["a","b"]
   */
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
  /**
   * @example
   * XXX公司法人发生变更
   */
  tagExplanation: string;
  // 标签名称
  /**
   * @example
   * 法人变更
   */
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
  /**
   * @example
   * reject
   */
  decision: string;
  // infocodes
  /**
   * @example
   * infocodes
   */
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
  /**
   * @example
   * planCode1
   */
  planCode: string;
  // 场景策略Id
  /**
   * @example
   * 15000
   */
  sceneStrategyId: number;
  // 客群分层结果
  /**
   * @example
   * 1
   */
  rpspResult: string;
  // 	
  // json 结构的营销额外输出信息
  /**
   * @example
   * {"f_01":"95.0"}
   */
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

// 客户历史交易信息
export class HisTranInfo extends $tea.Model {
  // 维修单号
  repairNo?: string;
  // 购买日期
  buyDate?: string;
  // 商品型号
  commType?: string;
  // 商品金额
  commAmount?: string;
  // 维修时间
  repairTime?: string;
  // 是否联保
  isJoint?: string;
  // 合计费用(每笔历史交易的合计费用)
  totalCost?: string;
  static names(): { [key: string]: string } {
    return {
      repairNo: 'repair_no',
      buyDate: 'buy_date',
      commType: 'comm_type',
      commAmount: 'comm_amount',
      repairTime: 'repair_time',
      isJoint: 'is_joint',
      totalCost: 'total_cost',
    };
  }

  static types(): { [key: string]: any } {
    return {
      repairNo: 'string',
      buyDate: 'string',
      commType: 'string',
      commAmount: 'string',
      repairTime: 'string',
      isJoint: 'string',
      totalCost: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 优惠券信息
export class CouponInfo extends $tea.Model {
  // 优惠券Id
  /**
   * @example
   * 123
   */
  couponId: string;
  // 优惠券名称
  /**
   * @example
   * 折扣券
   */
  couponName: string;
  // 优惠券状态
  // unUsed-未使用
  // Used-已使用
  // Expired-过期
  /**
   * @example
   * 0
   */
  status: string;
  // 使用场景
  // 01-提款使用
  // 02-还款使用
  /**
   * @example
   * 01
   */
  useCondition: string;
  // 优惠码
  /**
   * @example
   * 123
   */
  couponCode?: string;
  // 优惠券类型
  // 01-金额优惠
  // 02-天数优惠
  // 03-折扣优惠
  // 04-期数优惠
  // 05-固定利率
  /**
   * @example
   * 03
   */
  couponType?: string;
  // 优惠券面额
  // coupon_type=01 时为优惠金额
  // coupon_type=02 时为减免天数
  // coupon_type=03 时为折扣值（如6 折）
  // coupon_type=04 时为减免期数
  // coupon_type=05 时为折扣值（如 8.88 为利率8.88%）
  /**
   * @example
   * 01
   */
  couponValue?: string;
  // 当 coupon_type=01 时，才会有优惠金额
  /**
   * @example
   * 1
   */
  couponAmount?: string;
  // 过期时间yyyy-MM-dd HH:mm:ss
  /**
   * @example
   * yyyy-MM-dd HH:mm:ss
   */
  expiredTime?: string;
  // 生效时间yyyy-MM-dd HH:mm:ss
  /**
   * @example
   * yyyy-MM-dd HH:mm:ss
   */
  effectiveTime?: string;
  // 使用规则
  /**
   * @example
   * 使用规则
   */
  useDetail?: string;
  // 贷款最低金额
  /**
   * @example
   * 10
   */
  minAmount?: string;
  // 贷款最高金额
  /**
   * @example
   * 100
   */
  maxAmount?: string;
  // 最低贷款期数
  /**
   * @example
   * 1
   */
  minPeriod?: string;
  // 最高贷款期数
  /**
   * @example
   * 12
   */
  maxPeriod?: string;
  // 贷款最低期限天数
  /**
   * @example
   * 30
   */
  minDay?: string;
  // 还款方式
  // 1-等额本息
  // 2-等额本金
  // 3-等本等费
  // 4-按期付息到期还本
  // 5-到期一次性还本付息
  // 6-等本等费-总费率
  // 7-等额本息(长期)
  /**
   * @example
   * 1
   */
  repaymentMethod?: string;
  // 是否有贷款期数要求
  // 0：否
  // 1：是
  /**
   * @example
   * 0
   */
  isPeriodLimit?: string;
  // 贷款期限要求还款条件
  // 01：可提前还款
  // 02：不可提前还款
  // isPeriodLimit=1 && repayCondition=01 代表：有可提前还款锁期
  // isPeriodLimit=1 && repayCondition=02 代表：有不可提前还款锁期
  /**
   * @example
   * 01
   */
  repayCondition?: string;
  // 还款场景
  // 01-到期还款
  // 02-即期还款
  /**
   * @example
   * 01
   */
  repayWays?: string;
  // 优惠模板Id
  /**
   * @example
   * 123
   */
  couponModelNo?: string;
  // 至到期:X年X月X日
  // 0：不是至到期券 
  // 1：是至到期券
  /**
   * @example
   * X年X月X日
   */
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
  /**
   * @example
   * 1
   */
  sceneStrategyId: number;
  // 实时营销结果
  /**
   * @example
   * 1
   */
  umktResult: number;
  // json 结构的营销额外输出信息
  /**
   * @example
   * {"f_01":"95.0"}
   */
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
  /**
   * @example
   * CMN00010
   */
  tagId: string;
  // 标签名称
  /**
   * @example
   * 网站失联
   */
  tagName: string;
  // 标签类型
  /**
   * @example
   * CMN
   */
  tagType?: string;
  // 标签文本
  /**
   * @example
   * 网站失联
   */
  tagText?: string;
  // 线索概览
  /**
   * @example
   * 企业已列入经营异常名录
   */
  tagClue?: string;
  // 线索明细类型
  /**
   * @example
   * 01
   */
  clueDetailType?: string;
  // 线索明细
  /**
   * @example
   * 通过登记的住所或者经营场所无法联系
   */
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
  /**
   * @example
   * 1
   */
  actionDriverCode?: number;
  // 成功数
  /**
   * @example
   * 123
   */
  successCount?: number;
  // 失败数
  /**
   * @example
   * 123
   */
  failCount?: number;
  // 待触达的手机号数
  /**
   * @example
   * 0
   */
  waitingSubTaskCount?: number;
  // 已收到的回执数
  /**
   * @example
   * 10
   */
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

// air引擎输出的决策域信息
export class AirDomainInfos extends $tea.Model {
  // 决策域信息
  /**
   * @example
   * air_domain
   */
  domainCode?: string;
  // 决策域信息
  /**
   * @example
   * review
   */
  domainDecision?: string;
  // 决策流输出
  /**
   * @example
   * [{"decision":"review","name":"租赁测试策略"}]
   */
  decisionFlows?: AirDecisionFlows[];
  static names(): { [key: string]: string } {
    return {
      domainCode: 'domain_code',
      domainDecision: 'domain_decision',
      decisionFlows: 'decision_flows',
    };
  }

  static types(): { [key: string]: any } {
    return {
      domainCode: 'string',
      domainDecision: 'string',
      decisionFlows: { 'type': 'array', 'itemType': AirDecisionFlows },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 反欺诈风险数据服务规则细节信息
export class RuleDetail extends $tea.Model {
  // 规则细节名称
  /**
   * @example
   * 出现次数
   */
  name: string;
  // 规则细节值
  /**
   * @example
   * 19
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

// Flow 成功后的产出列表。运行中或失败时为空。
export class FlowRunOutput extends $tea.Model {
  // Flow 输出定义中的稳定字段标识。
  /**
   * @example
   * summary
   */
  outputKey: string;
  // 输出类型，支持 STRING、NUMBER、BOOLEAN、JSON、FILE。
  /**
   * @example
   * STRING
   */
  outputType: string;
  // 输出值。FILE 类型直接返回短期下载地址；JSON 类型返回 JSON 字符串；其他类型返回对应值的字符串形式。
  /**
   * @example
   * 风险较低
   */
  value: string;
  static names(): { [key: string]: string } {
    return {
      outputKey: 'output_key',
      outputType: 'output_type',
      value: 'value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      outputKey: 'string',
      outputType: 'string',
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
  /**
   * @example
   * 1
   */
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
  /**
   * @example
   * xxx
   */
  customNo: string;
  // 当前期数
  /**
   * @example
   * 1
   */
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
  /**
   * @example
   * sss
   */
  receiptNo: string;
  // 还款状态1：已还清 2 未还 3 部分还款
  /**
   * @example
   * 1
   */
  status: string;
  // 应还日期
  /**
   * @example
   * 2018-10-10T10:10:00Z
   */
  settleDate: string;
  // 还款日期
  /**
   * @example
   * 2018-10-10T10:10:00Z
   */
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
  /**
   * @example
   * 贷款车辆存在异常关联记录
   */
  riskGroupDesc: string;
  // 反欺诈风险数据服务风险组名
  /**
   * @example
   * 存在异常关联
   */
  riskGroup: string;
  // 反欺诈风险数据服务风险组类别
  /**
   * @example
   * 车辆风险
   */
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
  /**
   * @example
   * 123
   */
  id?: number;
  // 渠道编码
  /**
   * @example
   * 123
   */
  channelCode?: string;
  // 渠道id
  /**
   * @example
   * 123AA
   */
  channelNo?: string;
  // 客户号
  /**
   * @example
   * PCM123
   */
  customerNo?: string;
  // 创建时间
  /**
   * @example
   * 2018-10-10T10:10:00Z
   */
  createTime?: string;
  // 更新时间
  /**
   * @example
   * 2018-10-10T10:10:00Z
   */
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
  /**
   * @example
   * 5617
   */
  sceneStrategyId: string;
  // 计划名称
  /**
   * @example
   * 测试计划名称
   */
  sceneStrategyName: string;
  // 模板内容
  /**
   * @example
   * 测试模版内容
   */
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
  /**
   * @example
   * 1
   */
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
  /**
   * @example
   * 0
   */
  mType: string;
  // 大类编码00-风控报告10-合同20身份证图片26人脸图片30-附件
  /**
   * @example
   * 00
   */
  bigCode: string;
  // 小类编码
  // 201-身份证人脸面202身份证国徽面212-活体人脸图片
  /**
   * @example
   * 201
   */
  smallCode: string;
  // 资料名称
  /**
   * @example
   * 资料名称
   */
  meterialName: string;
  // 文件地址
  /**
   * @example
   * 文件地址
   */
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
  /**
   * @example
   * true, false
   */
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
  /**
   * @example
   * [{}]
   */
  contacts: Contact[];
  // 人脸对比分
  /**
   * @example
   * x
   */
  facePoint?: string;
  // 活体供应商
  /**
   * @example
   * 活体供应商
   */
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
  /**
   * @example
   * 1
   */
  period: number;
  // 实还总额
  /**
   * @example
   * 1
   */
  amount: number;
  // 实还本金
  /**
   * @example
   * 1
   */
  principal: number;
  // 实还利息
  /**
   * @example
   * 1
   */
  interest: number;
  // 实还通道手续费
  /**
   * @example
   * 1
   */
  channelAmt: number;
  // 实还手续费
  /**
   * @example
   * 1
   */
  fee: number;
  // 实收罚息
  /**
   * @example
   * 1
   */
  punish: number;
  // 担保费
  /**
   * @example
   * 1
   */
  guaranteeFee: number;
  // 违约金
  /**
   * @example
   * 1
   */
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
  /**
   * @example
   * {}
   */
  params: string;
  // 请求数据类型
  /**
   * @example
   * IP
   */
  type: string;
  // 请求数据版本
  /**
   * @example
   * 1.0
   */
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
  /**
   * @example
   * 0
   */
  status: string;
  // 总额度
  /**
   * @example
   * 100
   */
  creditAmount?: number;
  // 可用额度
  /**
   * @example
   * 100
   */
  availableAmount?: number;
  // 待还总金额
  /**
   * @example
   * 100
   */
  shouldPayAmount?: number;
  // 逾期总金额
  overdueAmount?: number;
  // 下一期应还金额
  nextPeriodAmount?: number;
  // 下一期还款时间yyyy-MM-dd
  /**
   * @example
   * yyyy-MM-dd
   */
  nextPeriodRepayTime?: string;
  // 下次可授信时间yyyy-MM-dd
  /**
   * @example
   * yyyy-MM-dd
   */
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
  /**
   * @example
   * accept
   */
  decision: string;
  // 场景code
  /**
   * @example
   * ANFAPP
   */
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
  /**
   * @example
   * 1
   */
  sceneStrategyId: number;
  // 场景策略名称
  /**
   * @example
   * 蚂蚁营销
   */
  sceneStrategyName: string;
  // 场景策略状态
  /**
   * @example
   * ONLINE
   */
  sceneStrategyStatus: string;
  // 创建时间
  /**
   * @example
   * 2018-10-10T10:10:00Z
   */
  gmtCreate: string;
  // 修改时间
  /**
   * @example
   * 2018-10-10T10:10:00Z
   */
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
  /**
   * @example
   * s d d f d f
   */
  clueDetailType: string;
  // odps数据产出时间，冗余字段，业务上不需要，以备错误排查
  /**
   * @example
   * 20190823
   */
  dt?: string;
  // 数据产生时间
  /**
   * @example
   * yyyy-MM-dd hh:mm:ss
   */
  gmtCreate: string;
  // 记录唯一ID
  /**
   * @example
   * 1
   */
  id: number;
  // 0-正常 1-删除
  /**
   * @example
   * is_deleted
   */
  isDeleted: number;
  // 企业ID
  /**
   * @example
   * A123445
   */
  mctOneId: string;
  // 操作人ID
  /**
   * @example
   * 123
   */
  operatorId: string;
  // 操作类型
  // add、delete、update
  /**
   * @example
   * add
   */
  opType: string;
  // 企业名称
  /**
   * @example
   * 东方财富公司
   */
  orgName: string;
  // 线索类型
  /**
   * @example
   * 列表
   */
  riskDetailType: string;
  // 风险维度
  // 
  /**
   * @example
   * 风险维度
   */
  riskDimensionType: string;
  // 线索概览
  /**
   * @example
   * s d f g
   */
  tagClue: string;
  // 线索明细
  /**
   * @example
   * 11
   */
  tagClueDetail: string;
  // 标签ID
  /**
   * @example
   * NM23
   */
  tagId: string;
  // 线索列表表头，英文逗号分隔
  // 
  /**
   * @example
   * 日期
   */
  tagListHeaders: string;
  // 标签列表，排序字段
  /**
   * @example
   * 日期
   */
  tagListOrderColumn: string;
  // 标签列表排序方式
  /**
   * @example
   * 顺序
   */
  tagListOrderType: string;
  // 标签文本
  /**
   * @example
   * 1233
   */
  tagText: string;
  // 趋势图表名
  /**
   * @example
   * XX趋势图 
   */
  tagTrendChartName: string;
  // 数据同步到公有云时间(业务上赋值当天)
  /**
   * @example
   * 20190823
   */
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

// 二级商户入驻结果
export class SubMerchantOrder extends $tea.Model {
  // 是否开通线上预授权，
  // TRUE/FALSE
  /**
   * @example
   * xxxx
   */
  appPreAuth?: string;
  // 申请单创建时间
  /**
   * @example
   * xxxx
   */
  applyTime: string;
  // 本申请单的请求类型，
  // 商户预校验: ZHIFUTONG_CONSULT
  // 商户创建: ZHIFUTONG_CREATE
  // 商户修改: ZHIFUTONG_MODIFY
  // 
  /**
   * @example
   * xxxx
   */
  applyType: string;
  // 进件生成的卡编号，在发起结算时可以作为结算账号
  /**
   * @example
   * xxxx
   */
  cardAliasNo?: string;
  // 外部商户id
  /**
   * @example
   * xxxx
   */
  externalId: string;
  // 是否开通线下预授权，
  // TRUE/FALSE
  /**
   * @example
   * xxxx
   */
  facePreAuth?: string;
  // 风控审核状态，
  // CREATE: 已创建待审批
  // SKIP: 跳过风控审批步骤
  // PASS: 风控审核通过
  // REJECT: 风控审批拒绝
  // 
  /**
   * @example
   * xxxx
   */
  fkAudit?: string;
  // 风控审批备注
  /**
   * @example
   * xxxx
   */
  fkAuditMemo?: string;
  // 判断个人当面付权限版本，
  // TRUE: 表示是标准版
  // FALSE: 表示受限版
  // 
  /**
   * @example
   * xxxx
   */
  isFaceLimit?: string;
  // 客资审核状态，
  // CREATE: 已创建待审批
  // SKIP: 跳过客资审批步骤
  // PASS: 客资审核通过
  // REJECT: 客资审批拒绝
  /**
   * @example
   * xxxx
   */
  kzAudit?: string;
  // 客资审批备注
  /**
   * @example
   * xxxx
   */
  kzAuditMemo?: string;
  // 进件时填写的商户名称
  /**
   * @example
   * xxxx
   */
  merchantName?: string;
  // 入驻申请单号
  /**
   * @example
   * xxxx
   */
  orderId: string;
  // 申请单处理失败时，通过此此段返回具体的失败理由，
  // 与kf_audit_memo和kz_audit_memo配合使用
  /**
   * @example
   * xxxx
   */
  reason?: string;
  // 签约支付宝账号（脱敏）
  /**
   * @example
   * xxxx
   */
  safeBindingLogonId?: string;
  // 二级商户id，当总体申请状态status为99时，smid才算进件完成
  /**
   * @example
   * xxxx
   */
  smid?: string;
  // 申请总体状态，
  // 99: 已完结
  // -1: 失败
  // 031: 审核中
  /**
   * @example
   * xxxx
   */
  status: string;
  // 二级商户确认状态，
  // CREATE: 已发起二级商户确认
  // SKIP: 无需确认
  // FAIL: 签约失败
  // NOT_CONFIRM: 商户未确认
  // FINISH: 签约完成
  /**
   * @example
   * xxxx
   */
  subConfirm?: string;
  static names(): { [key: string]: string } {
    return {
      appPreAuth: 'app_pre_auth',
      applyTime: 'apply_time',
      applyType: 'apply_type',
      cardAliasNo: 'card_alias_no',
      externalId: 'external_id',
      facePreAuth: 'face_pre_auth',
      fkAudit: 'fk_audit',
      fkAuditMemo: 'fk_audit_memo',
      isFaceLimit: 'is_face_limit',
      kzAudit: 'kz_audit',
      kzAuditMemo: 'kz_audit_memo',
      merchantName: 'merchant_name',
      orderId: 'order_id',
      reason: 'reason',
      safeBindingLogonId: 'safe_binding_logon_id',
      smid: 'smid',
      status: 'status',
      subConfirm: 'sub_confirm',
    };
  }

  static types(): { [key: string]: any } {
    return {
      appPreAuth: 'string',
      applyTime: 'string',
      applyType: 'string',
      cardAliasNo: 'string',
      externalId: 'string',
      facePreAuth: 'string',
      fkAudit: 'string',
      fkAuditMemo: 'string',
      isFaceLimit: 'string',
      kzAudit: 'string',
      kzAuditMemo: 'string',
      merchantName: 'string',
      orderId: 'string',
      reason: 'string',
      safeBindingLogonId: 'string',
      smid: 'string',
      status: 'string',
      subConfirm: 'string',
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
  /**
   * @example
   * 1
   */
  companyId: string;
  // 反馈原因
  /**
   * @example
   * 1
   */
  feedbackReason: string;
  // 反馈原因详情
  /**
   * @example
   * 1
   */
  feedbackReasonDetail: string;
  // 评论
  /**
   * @example
   * 1
   */
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
  /**
   * @example
   * 0
   */
  code: number;
  // true代表上传成功，false代表上传失败
  /**
   * @example
   * true, false
   */
  success: boolean;
  // 上文件传成功
  /**
   * @example
   * OK
   */
  resultmsg: string;
  // 文件上传结果
  /**
   * @example
   * [fileInfoReceive api success!]
   */
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

// qmp分层信息
export class DecisionInfo extends $tea.Model {
  // 状态
  /**
   * @example
   * DECISION_SUCCESS
   */
  status: string;
  // 计划配置ID
  /**
   * @example
   * 1
   */
  offlineDecisionPlanId: number;
  // 总数量
  /**
   * @example
   * 111
   */
  totalNum: number;
  // 分层结果数
  /**
   * @example
   * 12
   */
  decisionNum: number;
  // 文件路径
  /**
   * @example
   * https://test-oss.oss-cn-shang
   */
  fileUrl: string;
  // 返回结果节点id
  /**
   * @example
   * 123
   */
  returnResultId?: number;
  static names(): { [key: string]: string } {
    return {
      status: 'status',
      offlineDecisionPlanId: 'offline_decision_plan_id',
      totalNum: 'total_num',
      decisionNum: 'decision_num',
      fileUrl: 'file_url',
      returnResultId: 'return_result_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      status: 'string',
      offlineDecisionPlanId: 'number',
      totalNum: 'number',
      decisionNum: 'number',
      fileUrl: 'string',
      returnResultId: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 监测企业的特征信息
export class RtopMonitorCompanyFeature extends $tea.Model {
  // 特征的描述
  /**
   * @example
   * 有企业地址变更历史，变更过经营范围
   */
  description?: string;
  // 特征的名称
  /**
   * @example
   * 关联风险
   */
  name: string;
  // 特征里的风险标签列表
  riskTags?: string[];
  // 特征的评分
  /**
   * @example
   * 80
   */
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
  /**
   * @example
   * place_type
   */
  placeType?: string;
  // 区域
  /**
   * @example
   * 天津市
   */
  placeName?: string;
  // 企业唯一id
  /**
   * @example
   * mct_one_id
   */
  mctOneId?: string;
  // 企业统一社会信用代码
  /**
   * @example
   * uc_code
   */
  ucCode?: string;
  // 工商注册号
  /**
   * @example
   * reg_no
   */
  regNo?: string;
  // 组织机构代码
  /**
   * @example
   * org_code
   */
  orgCode?: string;
  // 企业名
  /**
   * @example
   * org_name
   */
  orgName?: string;
  // 风险评分
  /**
   * @example
   * risk_score
   */
  riskScore?: string;
  // 风险变化程度排序，根据分值波动大小，标签变更次数排序
  /**
   * @example
   * risk_shift_rank
   */
  riskShiftRank?: string;
  // 风险定性
  /**
   * @example
   * risk_type
   */
  riskType?: string;
  // 风险标签id列表
  riskTagsId?: string[];
  // 线索
  /**
   * @example
   * tags_clue
   */
  tagsClue?: string;
  // 风险线索明细
  /**
   * @example
   * tags_clue_detail
   */
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
  /**
   * @example
   * 2
   */
  annualReportCount?: number;
  // 年报是否发生股权转让
  /**
   * @example
   * true
   */
  annualReportHasEquityTransfer?: boolean;
  // 年报是否对外提供担保
  /**
   * @example
   * true
   */
  annualReportHasExternalGuarantee?: boolean;
  // 年报是否对外投资
  /**
   * @example
   * true
   */
  annualReportHasExternalInvest?: boolean;
  // 营业总收入中主营业务收入
  /**
   * @example
   * 1000
   */
  annualReportMainBusinessIncome?: string;
  // 年报净利润
  /**
   * @example
   * 1000
   */
  annualReportNetProfit?: string;
  // 年报发布日期
  /**
   * @example
   * 2018-09-09
   */
  annualReportReleaseDate?: string;
  // 年报股东实缴出资额（万元（实缴出资额用两个冒号::分割）
  /**
   * @example
   * 100::200:2
   */
  annualReportShActualPaid?: string;
  // 年报公司人数
  /**
   * @example
   * 200
   */
  annualReportStaffCount?: number;
  // 资产总额
  /**
   * @example
   * 1000
   */
  annualReportTotalAssets?: string;
  // 负债总额
  /**
   * @example
   * 1000
   */
  annualReportTotalLiabilities?: string;
  // 营业总收入
  /**
   * @example
   * 1000
   */
  annualReportTotalOperatingIncome?: string;
  // 年报所有者权益合计
  /**
   * @example
   * 1000
   */
  annualReportTotalOwnerEquity?: string;
  // 年报利润总额
  /**
   * @example
   * 1000
   */
  annualReportTotalProfit?: string;
  // 纳税总额
  /**
   * @example
   * 1000
   */
  annualReportTotalTax?: string;
  // 年报报送年度
  /**
   * @example
   * 2018
   */
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
  /**
   * @example
   * 8002c3d97e7d4d20a0647c75dfab1efe
   */
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
  /**
   * @example
   * key
   */
  key?: string;
  // value
  /**
   * @example
   * value
   */
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
  /**
   * @example
   * 1
   */
  companyId: string;
  // 异动分数
  /**
   * @example
   * 1
   */
  changeScore: string;
  // 异动程度
  /**
   * @example
   * 1
   */
  changeLevel: string;
  // 新增企业的时间
  /**
   * @example
   * 2018-10-10T10:10:00Z
   */
  newAddedTime: string;
  // 总公司注册地
  /**
   * @example
   * 1
   */
  headRegisterPlace: string;
  // 数据的时间
  /**
   * @example
   * 1
   */
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
  /**
   * @example
   * 91330000327827106L
   */
  epCertNo?: string;
  // 认证的企业名
  /**
   * @example
   * 芝麻信用管理有限公司
   */
  epName?: string;
  // 认证不通过的错误码
  /**
   * @example
   * BIZ_LICENSE_LEGAL_INFO_NO_MATCH
   */
  failedCode?: string;
  // 认证是否通过，通过为true，不通过为false
  /**
   * @example
   * “true“,”false”
   */
  passed?: string;
  //  10000是成功，其余是失败
  /**
   * @example
   * OK/40002
   */
  resultCode: string;
  //  
  /**
   * @example
   * Success/Invalid Arguments
   */
  resultMsg: string;
  //  
  /**
   * @example
   * isv.invalid-app-id
   */
  subCode?: string;
  //  
  /**
   * @example
   * 无效的AppID参数
   */
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
  /**
   * @example
   * 杭州市
   */
  activeCity?: string;
  // 活跃县
  /**
   * @example
   * 西湖区
   */
  activeCounty?: string;
  // 活跃省
  /**
   * @example
   * 浙江省
   */
  activeProvince?: string;
  // 风险标签
  clueTags?: string[];
  // 企业ID
  /**
   * @example
   * 123456789
   */
  companyId: string;
  // 企业名称
  /**
   * @example
   * XXXXX有限公司
   */
  companyName: string;
  // 风险等级
  /**
   * @example
   * EX_HIGH_RISK
   */
  crowdRiskLevel?: string;
  // 涉众风险分数
  /**
   * @example
   * 80
   */
  crowdRiskScore?: number;
  // 涉众风险类型
  /**
   * @example
   * MLM
   */
  crowdRiskType?: string;
  // 发现时间
  /**
   * @example
   * 2018-07-15
   */
  detectedTime?: string;
  // 影响金额
  /**
   * @example
   * 100
   */
  moneyInvolved?: number;
  // 影响人数
  /**
   * @example
   * 100
   */
  peopleInvolved?: number;
  // 注册市
  /**
   * @example
   * 杭州市
   */
  registeredCity?: string;
  // 注册县
  /**
   * @example
   * 西湖区
   */
  registeredCounty?: string;
  // 注册省
  /**
   * @example
   * 浙江省
   */
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

// 天枢-电商-申请人信息
export class EcApplicantPersonInfo extends $tea.Model {
  // 如果合作方传输，会在我行H5进件页面反显展示
  /**
   * @example
   * 张三
   */
  applicantName?: string;
  // 申请人身份证号码
  /**
   * @example
   * 6230582100000003260
   */
  idNo?: string;
  static names(): { [key: string]: string } {
    return {
      applicantName: 'applicant_name',
      idNo: 'id_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      applicantName: 'string',
      idNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 回执统计结果
export class StatisticResult extends $tea.Model {
  // 有效任务总数量
  /**
   * @example
   * 123
   */
  validCount: number;
  // 各类actionDriverCode的统计结果集合
  /**
   * @example
   * List<StatisticInfoDetail> 
   */
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
  /**
   * @example
   * 1
   */
  id: number;
  // 线索ID
  /**
   * @example
   * 124
   */
  tagId: string;
  // 标签文本
  /**
   * @example
   * 233444
   */
  tagText: string;
  // 风险维度
  /**
   * @example
   * 风险维度
   */
  riskDimensionType: string;
  // 线索类型
  /**
   * @example
   * 列表
   */
  riskDetailType: string;
  // 趋势图表名
  /**
   * @example
   * XX趋势图
   */
  tagTrendChartName: string;
  // 线索列表表头，英文逗号分隔
  /**
   * @example
   * 日期
   */
  tagListHeaders: string;
  // 标签列表，排序字段
  /**
   * @example
   * 日期
   */
  tagListOrderColumn: string;
  // 标签列表排序方式
  /**
   * @example
   * 顺序
   */
  tagListOrderType: string;
  // 标记删除
  /**
   * @example
   * 0
   */
  isDelete: number;
  // 创建时间
  /**
   * @example
   * 2018-10-10T10:10:00Z
   */
  gmtCreate: string;
  // 修改时间
  /**
   * @example
   * 2018-10-10T10:10:00Z
   */
  gmtModified: string;
  // 操作人ID
  /**
   * @example
   * 1233
   */
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

// 输出参数
export class OutParam extends $tea.Model {
  // 输出参数名称
  /**
   * @example
   * creditLimit
   */
  name?: string;
  // 输出参数值
  /**
   * @example
   * 19000
   */
  value?: string;
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

// 策略详情
export class StrategyDetails extends $tea.Model {
  // 策略id
  /**
   * @example
   * 1
   */
  id: string;
  // 策略名称
  /**
   * @example
   * 策略名称
   */
  name: string;
  // 决策结果
  /**
   * @example
   * accept
   */
  decision: string;
  // 场景码
  /**
   * @example
   * scene_code
   */
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
  /**
   * @example
   * reject
   */
  decision: string;
  // 反欺诈风险数据服务风险分
  /**
   * @example
   * 100.0
   */
  riskScore: number;
  // 反欺诈风险数据服务场景码
  /**
   * @example
   * EC_TEST
   */
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
  /**
   * @example
   * above20
   */
  age: string;
  // 统计值
  /**
   * @example
   * 10
   */
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
  /**
   * @example
   * 15022321363
   */
  customerKey: string;
  // 客户属性的额外信息
  /**
   * @example
   * {"test_score": 22.0}
   */
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
  /**
   * @example
   * 活跃地json
   */
  activeAddrJson: string;
  // 活跃市(字段停用)
  /**
   * @example
   * 活跃市(字段停用)
   */
  activeCity: string;
  // 活跃县(字段停用)
  /**
   * @example
   * 活跃县(字段停用)
   */
  activeCounty: string;
  // 活跃省(字段停用)
  /**
   * @example
   * 活跃省(字段停用)
   */
  activeProvince: string;
  // 类经融行业分类
  /**
   * @example
   * 类金融
   */
  categories: string;
  // 核准日期
  /**
   * @example
   * 20191023
   */
  checkDate: string;
  // 删除标志
  /**
   * @example
   * 0
   */
  delFlag: string;
  // odps数据产生时间，业务上不关心
  /**
   * @example
   * 20190922
   */
  dt: string;
  // 企业曾用名
  /**
   * @example
   * [123,45tee]
   */
  formerOrgNames: string;
  // {"mct_one_id":"ID1","org_name":"总公司名称1"}
  /**
   * @example
   * 总公司,json格式
   */
  headOffice: string;
  // 记录ID
  /**
   * @example
   * 1
   */
  id: number;
  // 影响金额
  /**
   * @example
   * 300
   */
  involvedAmount: number;
  // 影响人数
  /**
   * @example
   * 100
   */
  involvedPeople: number;
  // 重要关联企业,json格式
  /**
   * @example
   * [{"mct_one_id":"ID1","org_name":"企业名称1","relation_desc":"关联描述1"},{"mct_one_id":"ID2","org_name":"企业名称2","relation_desc":"关联描述2"}]
   */
  keyRelaOrgs: string;
  // 法人
  /**
   * @example
   * 张三
   */
  legalRepresentative: string;
  // 企业ID
  /**
   * @example
   * 12
   */
  mctOneId: string;
  // 经营地json
  /**
   * @example
   * 经营地json
   */
  operatingAddrJson: string;
  // 经营市(字段停用)
  /**
   * @example
   * 经营市(字段停用)
   */
  operatingCity: string;
  // 经营县(字段停用)
  /**
   * @example
   * 经营县(字段停用)
   */
  operatingCounty: string;
  // 经营地址(字段停用)
  /**
   * @example
   * 经营地址(字段停用)
   */
  operatingPlace: string;
  // 经营省(字段停用)
  /**
   * @example
   * operating_province
   */
  operatingProvince: string;
  // 营运状态(1:营运0:不营运)
  /**
   * @example
   * 1
   */
  oprtActvState: string;
  // 经营期限至
  /**
   * @example
   * 20210201
   */
  oprtEndDate: string;
  // 经营范围
  /**
   * @example
   * 工商
   */
  oprtScope: string;
  // 经营期限自
  /**
   * @example
   * 20190201
   */
  oprtStartDate: string;
  // 操作类型
  // 
  /**
   * @example
   * add、delete、update
   */
  opType: string;
  // 组织机构代码
  /**
   * @example
   * 246667
   */
  orgCode: string;
  // 电子邮箱
  /**
   * @example
   * werr@163.com
   */
  orgEmail: string;
  // 企业名
  /**
   * @example
   * 恒生电子
   */
  orgName: string;
  // 注册资本折人民币(万元)
  /**
   * @example
   * 3000000000
   */
  orgRegCptlRmb: string;
  // 企业状态
  /**
   * @example
   * 正常
   */
  orgState: string;
  // 联系电话
  /**
   * @example
   * 1234567
   */
  orgTel: string;
  // 企业类型
  /**
   * @example
   * 工商
   */
  orgType: string;
  // 平台名
  /**
   * @example
   * p2p平台
   */
  platformName: string;
  // 平台状态
  /**
   * @example
   * 平台状态
   */
  platformStates: string;
  // 注册资本币种
  /**
   * @example
   * 人名币
   */
  registerCapitalCurrency: string;
  // 注册资本值
  /**
   * @example
   * 2300000
   */
  registerCapitalValue: string;
  // 注册市
  /**
   * @example
   * 宣城市
   */
  registerCity: string;
  // 注册区县
  /**
   * @example
   * 南海区
   */
  registerCounty: string;
  // 注册时间
  /**
   * @example
   * 20110203
   */
  registerDate: string;
  // 注册地址
  /**
   * @example
   * 江苏省
   */
  registerPlace: string;
  // 注册省
  /**
   * @example
   * 安徽省
   */
  registerProvince: string;
  // 登记机关
  /**
   * @example
   * XX金融办
   */
  registrationAuthority: string;
  // 工商注册号
  /**
   * @example
   * 23456667
   */
  regNo: string;
  // 风报企业ID
  /**
   * @example
   * 1234
   */
  riskstormCompanyId: string;
  // 风险维度
  /**
   * @example
   * 风险维度
   */
  riskFactors: string;
  // 风险图谱可视化数据
  /**
   * @example
   * 风险图谱可视化数据
   */
  riskGraphJson: string;
  // 风险报文
  /**
   * @example
   * 风险报文
   */
  riskMessage: string;
  // 风险指数
  /**
   * @example
   * 80
   */
  riskScore: number;
  // 风险指数，按日的趋势图
  /**
   * @example
   * 风险指数
   */
  riskScoreTrend: string;
  // 风险指数周波动
  /**
   * @example
   * 2.3
   */
  riskScoreWeeklyFloat: number;
  // 风险标签(字段停用)
  /**
   * @example
   * 经营异常
   */
  riskTags: string;
  // 风险标签ID
  /**
   * @example
   * NM12,NM34
   */
  riskTagsId: string;
  // 风险定性
  /**
   * @example
   * 风险定性
   */
  riskType: string;
  // 搜索内容
  /**
   * @example
   * 隐隐科技
   */
  searchContent: string;
  // 传播人次
  /**
   * @example
   * 传播人次
   */
  spreadNumber: number;
  // 影响地区人次分布,json格式如下
  /**
   * @example
   * [{"place_type":"prov","active_info":[{"place_name":"省1","num":3690},{"place_name":"省2","num":3680}]},{"place_type":"city","active_info":[{"place_name":"市1","num":3690},{"place_name":"市2","num":3680}]}]
   */
  spreadNumDistribution: string;
  // 社会统一信用代码
  /**
   * @example
   * 2456787878
   */
  ucCode: string;
  // 公有云数据库产生时间
  /**
   * @example
   * 20190923
   */
  updateDate: string;
  // 平台json  
  /**
   * @example
   *  [{"platform_name":"ptp","platform_states":"平台状态"}]
   */
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
  /**
   * @example
   * 12345
   */
  eventId: string;
  // 营销计划id
  /**
   * @example
   * 12345
   */
  planId: string;
  // 消息id
  /**
   * @example
   * 1122
   */
  msgId: string;
  // 事件时间
  /**
   * @example
   * yyyy-MM-dd HH:mm:ss.SSS 
   */
  eventTime: string;
  // 事件类型：1为富信贴尾
  /**
   * @example
   * 1
   */
  eventType: number;
  // 1为成功 2为失败
  /**
   * @example
   * 1
   */
  state: number;
  // 用户key类型
  /**
   * @example
   * MOBILE
   */
  keyType: string;
  // 手机号
  /**
   * @example
   * 15012340000
   */
  customerKey: string;
  // 扩展字段
  /**
   * @example
   * {"operator":"CMCC"}
   */
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
  /**
   * @example
   * true, false
   */
  success: boolean;
  // 结果描述
  /**
   * @example
   * success
   */
  resultMsg: string;
  // 结果码
  /**
   * @example
   * 0
   */
  responseCode: string;
  // 具体返回值.jsonString形式
  /**
   * @example
   * {"a":1}
   */
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

// 渠道扩展信息
export class PetCashierApplyExtInfo extends $tea.Model {
  // 门店名称
  storeName?: string;
  // 门店id
  storeId?: string;
  // 门店社会统一信用代码
  storeSocialCode?: string;
  // 门店地址
  storeAddress?: string;
  // 门店地址省
  storeAddrProv?: string;
  // 门店地址市
  storeAddrCity?: string;
  // 门店地址区
  storeAddrDstc?: string;
  // 厂商社会信用代码
  vendorSocialCode: string;
  // 厂商名称
  vendorName: string;
  // 商品型号
  commModel: string;
  // 商品总价(包含定金)	String
  totalPrice?: string;
  // 已付定金
  firstPayAmount?: string;
  // 已付货款
  orderPaidAmount?: string;
  // 客户历史交易信息
  hisTranInfo?: HisTranInfo[];
  static names(): { [key: string]: string } {
    return {
      storeName: 'store_name',
      storeId: 'store_id',
      storeSocialCode: 'store_social_code',
      storeAddress: 'store_address',
      storeAddrProv: 'store_addr_prov',
      storeAddrCity: 'store_addr_city',
      storeAddrDstc: 'store_addr_dstc',
      vendorSocialCode: 'vendor_social_code',
      vendorName: 'vendor_name',
      commModel: 'comm_model',
      totalPrice: 'total_price',
      firstPayAmount: 'first_pay_amount',
      orderPaidAmount: 'order_paid_amount',
      hisTranInfo: 'his_tran_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      storeName: 'string',
      storeId: 'string',
      storeSocialCode: 'string',
      storeAddress: 'string',
      storeAddrProv: 'string',
      storeAddrCity: 'string',
      storeAddrDstc: 'string',
      vendorSocialCode: 'string',
      vendorName: 'string',
      commModel: 'string',
      totalPrice: 'string',
      firstPayAmount: 'string',
      orderPaidAmount: 'string',
      hisTranInfo: { 'type': 'array', 'itemType': HisTranInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 申请人信息
export class ApplicantPersonInfo extends $tea.Model {
  // 申请人姓名
  /**
   * @example
   * 张三
   */
  applicantName?: string;
  // 申请人身份证号码
  /**
   * @example
   * 6230582100000003260
   */
  idNo?: string;
  static names(): { [key: string]: string } {
    return {
      applicantName: 'applicant_name',
      idNo: 'id_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      applicantName: 'string',
      idNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 门店账户信息
export class StoreAccountInfo extends $tea.Model {
  // 结算银行卡号
  /**
   * @example
   * 2023343380112
   */
  bankCardNo: string;
  // 结算银行账户名称
  /**
   * @example
   * 交通银行
   */
  bankAccountName: string;
  // 结算银行code
  /**
   * @example
   * ICBC
   */
  bankCode: string;
  // 商户号(支付通道给的商户编号)
  /**
   * @example
   * 202334332380
   */
  merchantNo: string;
  // 银行虚拟户卡号(监管户的账户信息)
  /**
   * @example
   * 3242352345234
   */
  eVirtualBankCardNo: string;
  // 银行虚拟户账户名称(监管户的账户信息)
  /**
   * @example
   * 账户1
   */
  eVirtualBankAccountName: string;
  // 银行虚拟户银行code(监管户的账户信息)
  /**
   * @example
   * SEFG
   */
  eVirtualBankCode: string;
  static names(): { [key: string]: string } {
    return {
      bankCardNo: 'bank_card_no',
      bankAccountName: 'bank_account_name',
      bankCode: 'bank_code',
      merchantNo: 'merchant_no',
      eVirtualBankCardNo: 'e_virtual_bank_card_no',
      eVirtualBankAccountName: 'e_virtual_bank_account_name',
      eVirtualBankCode: 'e_virtual_bank_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      bankCardNo: 'string',
      bankAccountName: 'string',
      bankCode: 'string',
      merchantNo: 'string',
      eVirtualBankCardNo: 'string',
      eVirtualBankAccountName: 'string',
      eVirtualBankCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 客户信息结果
export class CustomInfoResult extends $tea.Model {
  // 社会信用代码
  /**
   * @example
   * 923231293311125216
   */
  creditCode: string;
  // 公司名称
  /**
   * @example
   * 测试查询科技有限公司
   */
  companyName: string;
  // 法人姓名
  /**
   * @example
   * 王华
   */
  legalName: string;
  // 身份证号
  /**
   * @example
   * 320101111111111111
   */
  idCard: string;
  // 手机号
  /**
   * @example
   * 15899998888
   */
  phoneNumber: string;
  // 账号
  /**
   * @example
   * 111111111
   */
  account: string;
  // 密码
  /**
   * @example
   * 1111111
   */
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
  /**
   * @example
   * 1
   */
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
  /**
   * @example
   * xxxxx
   */
  applyNo?: string;
  // 资金方编号
  /**
   * @example
   * xxxxx
   */
  fundCode?: string;
  // 资金方名称
  /**
   * @example
   * xxxxx
   */
  fundName?: string;
  // 贷款利率
  /**
   * @example
   * xxxxx
   */
  rateValue?: number;
  // 贷款日利率
  /**
   * @example
   * xxxxx
   */
  rateValueDay?: number;
  // 年天数
  /**
   * @example
   * xxxxx
   */
  daysNumYear?: number;
  // 总授信额度
  /**
   * @example
   * xxxxx
   */
  totalAmount?: number;
  // 可用额度
  /**
   * @example
   * xxxxx
   */
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

// 退款订单信息
export class RefoundGoodOrderInfo extends $tea.Model {
  // 商城订单号
  /**
   * @example
   * 2023343380112
   */
  goodsOrderNo: string;
  // 退款金额
  /**
   * @example
   * 1000.00
   */
  amount: string;
  static names(): { [key: string]: string } {
    return {
      goodsOrderNo: 'goods_order_no',
      amount: 'amount',
    };
  }

  static types(): { [key: string]: any } {
    return {
      goodsOrderNo: 'string',
      amount: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 风险基因-点
export class RtopRiskGeneNode extends $tea.Model {
  // 主企业唯一ID
  /**
   * @example
   * 1
   */
  mainCompanyId?: string;
  // 主企业名称
  /**
   * @example
   * 1
   */
  mainCompanyName?: string;
  // 节点唯一ID
  /**
   * @example
   * 1
   */
  nodeId?: string;
  // 节点名称
  /**
   * @example
   * 1
   */
  nodeName?: string;
  // 节点证件号码
  /**
   * @example
   * 1
   */
  nodeCertNo?: string;
  // 节点类型，枚举值
  /**
   * @example
   * company
   */
  nodeType?: string;
  // 节点扩展信息
  /**
   * @example
   * 节点扩展信息
   */
  nodeExtJson?: string;
  // 基因模式
  /**
   * @example
   * risk_label
   */
  riskLabel?: string;
  // 基因模式
  /**
   * @example
   * 基因模式
   */
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
  /**
   * @example
   * 杭州市
   */
  city: string;
  // 统计值
  /**
   * @example
   * 10
   */
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

// 天枢-电商-授信补充-拓展字段
export class EcBizContend extends $tea.Model {
  // 企业名称
  /**
   * @example
   * 张三的贸易有限公司
   */
  dtEnterpriseName: string;
  // 企业社会信用代码
  /**
   * @example
   * 91234500123400000R
   */
  dtSocialCreditno: string;
  // 是否有关联关系Y/N
  /**
   * @example
   * Y
   */
  dtContractFlag: string;
  // 固定经营场所地址
  /**
   * @example
   * 广东省深圳市区福田区
   */
  dtFixedManageArea?: string;
  // 近1个月商户在电商平台的交易额（GMV）
  /**
   * @example
   * 10000234
   */
  dtMerchtAtEmrchPlfLimitLt1m?: string;
  // 近6个月的月均GMV
  /**
   * @example
   * 10000234
   */
  dtAvgGmvLt6m: string;
  // 近6个月平均退货率
  /**
   * @example
   * 8
   */
  dtAvgRetRateLt6m: string;
  // 近12个月平均退货率
  /**
   * @example
   * 10
   */
  dtAvgRetRateLt12m: string;
  // 退货率的季度均值
  /**
   * @example
   * 10
   */
  dtRetRateQtrAvgVal?: string;
  // 近3个月累计违规处罚金额
  /**
   * @example
   * 200.00
   */
  dtAccuFoulPunishAmtLt3m: string;
  // 是否有重大违规或交易违约
  /**
   * @example
   * Y
   */
  dtIsHaveMajorFoulOrTxnDeflt: string;
  // 过往是否有刷单等虚假贸易记录
  /**
   * @example
   * Y
   */
  dtHisHaveSngEtcVtlFakeTradeRcrd: string;
  // 合作时长表
  /**
   * @example
   * 抖音：24；天猫：12
   */
  dtCoDuranTab: string;
  // 店铺经营品类（准入非翡翠/玉石类、黄金／彩宝／钻石／珍珠类、钟表类、珠宝／文玩类、房产/汽车、汽车售后服务、奢侈品、虚拟/服务、二手、到店美食、物流服务类）
  /**
   * @example
   * 玉石类
   */
  dtEntCustSeg: string;
  // 店铺名称
  /**
   * @example
   * 张三的抖音小店
   */
  dtShopName: string;
  // 近12个月经营数据
  monthData: EcMonthData[];
  static names(): { [key: string]: string } {
    return {
      dtEnterpriseName: 'dt_enterprise_name',
      dtSocialCreditno: 'dt_social_creditno',
      dtContractFlag: 'dt_contract_flag',
      dtFixedManageArea: 'dt_fixed_manage_area',
      dtMerchtAtEmrchPlfLimitLt1m: 'dt_mercht_at_emrch_plf_limit_lt_1m',
      dtAvgGmvLt6m: 'dt_avg_gmv_lt_6m',
      dtAvgRetRateLt6m: 'dt_avg_ret_rate_lt_6m',
      dtAvgRetRateLt12m: 'dt_avg_ret_rate_lt_12m',
      dtRetRateQtrAvgVal: 'dt_ret_rate_qtr_avg_val',
      dtAccuFoulPunishAmtLt3m: 'dt_accu_foul_punish_amt_lt_3m',
      dtIsHaveMajorFoulOrTxnDeflt: 'dt_is_have_major_foul_or_txn_deflt',
      dtHisHaveSngEtcVtlFakeTradeRcrd: 'dt_his_have_sng_etc_vtl_fake_trade_rcrd',
      dtCoDuranTab: 'dt_co_duran_tab',
      dtEntCustSeg: 'dt_ent_cust_seg',
      dtShopName: 'dt_shop_name',
      monthData: 'month_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      dtEnterpriseName: 'string',
      dtSocialCreditno: 'string',
      dtContractFlag: 'string',
      dtFixedManageArea: 'string',
      dtMerchtAtEmrchPlfLimitLt1m: 'string',
      dtAvgGmvLt6m: 'string',
      dtAvgRetRateLt6m: 'string',
      dtAvgRetRateLt12m: 'string',
      dtRetRateQtrAvgVal: 'string',
      dtAccuFoulPunishAmtLt3m: 'string',
      dtIsHaveMajorFoulOrTxnDeflt: 'string',
      dtHisHaveSngEtcVtlFakeTradeRcrd: 'string',
      dtCoDuranTab: 'string',
      dtEntCustSeg: 'string',
      dtShopName: 'string',
      monthData: { 'type': 'array', 'itemType': EcMonthData },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 天枢文件信息统一结构体
export class DubheFileInfo extends $tea.Model {
  // 文件访问路径
  /**
   * @example
   * https://aa.bb.png?expiredtime=xx
   */
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
  /**
   * @example
   * 8002c3d97e7d4d20a0647c75dfab1efe
   */
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
  /**
   * @example
   * scene_code
   */
  sceneCode: string;
  // 该风险场景的风险分值
  // 
  /**
   * @example
   * 90
   */
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
  /**
   * @example
   * D2024082100001
   */
  fundCode: string;
  // 资金方简称
  /**
   * @example
   * 杭银消金
   */
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
  /**
   * @example
   * 2018-10-10T10:10:00Z
   */
  gmtCreate: string;
  // 修改时间
  /**
   * @example
   * 2018-10-10T10:10:00Z
   */
  gmtModified: string;
  // id
  /**
   * @example
   * 1
   */
  id: number;
  // 是否为基本筛选标签
  /**
   * @example
   * 1
   */
  isBase: number;
  // 标记删除
  /**
   * @example
   * 0
   */
  isDelete: number;
  // 操作人员ID
  /**
   * @example
   * 1
   */
  operatorId: string;
  // 地区名
  /**
   * @example
   * place_name
   */
  placeName: string;
  // 地区类型
  /**
   * @example
   * place_type
   */
  placeType: string;
  // 标签ID
  /**
   * @example
   * 1
   */
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
  /**
   * @example
   * 12345
   */
  customerKey: string;
  // 用户维度透传字段
  /**
   * @example
   * 12345
   */
  customerOutInfo?: string;
  // 外呼话术变量字段
  /**
   * @example
   * {"key1":"v1"}
   */
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
  /**
   * @example
   * xxx
   */
  jobType?: string;
  // 职务
  /**
   * @example
   * xxx
   */
  workPosition?: string;
  // 工作年限
  /**
   * @example
   * 2
   */
  jobLife?: string;
  // 本单位工作年限
  /**
   * @example
   * 1
   */
  currentJobLife?: number;
  // 公司名称
  /**
   * @example
   * xxx
   */
  companyName?: string;
  // 公司行业类型
  /**
   * @example
   * xx
   */
  companyIndustryType?: string;
  // 公司电话
  /**
   * @example
   * 111
   */
  companyTel?: string;
  // 公司省份
  /**
   * @example
   * 浙江
   */
  companyProvince?: string;
  // 公司城市
  /**
   * @example
   * 公司城市
   */
  companyCity?: string;
  // 公司区域
  /**
   * @example
   * 公司区域
   */
  companyArea?: string;
  // 公司街道
  /**
   * @example
   * 公司街道
   */
  companyStreet?: string;
  // 公司详细地址
  /**
   * @example
   * 公司详细地址
   */
  companyAddress?: string;
  // 年收入
  /**
   * @example
   * 年收入
   */
  yearSalary?: number;
  // 贷款用户所属行业类别
  /**
   * @example
   * 1
   */
  induInvol?: string;
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
      induInvol: 'indu_invol',
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
      induInvol: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 天枢系统居住信息结构体
export class LiveInfo extends $tea.Model {
  // 居住省份
  /**
   * @example
   * 居住省份
   */
  liveProvince?: string;
  // 居住城市
  /**
   * @example
   * 居住城市
   */
  liveCity?: string;
  // 居住区域
  /**
   * @example
   * 居住区域
   */
  liveArea?: string;
  // 居住街道
  /**
   * @example
   * 居住街道
   */
  liveStreet?: string;
  // 居住详细地址
  /**
   * @example
   * 居住详细地址
   */
  liveAddress?: string;
  // 居住年限
  /**
   * @example
   * 居住年限
   */
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
  /**
   * @example
   * 10
   */
  labelCount: number;
  // 标签id
  /**
   * @example
   * cancelled
   */
  labelId: string;
  // 标签名称
  /**
   * @example
   * 注销
   */
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
  /**
   * @example
   * xxx
   */
  fileType: string;
  // 材料url
  /**
   * @example
   * xxx
   */
  fileUrl: string;
  // 材料名称/描述
  /**
   * @example
   * xxx
   */
  fileDesc?: string;
  // 材料后缀，如png/jpg/jpeg
  /**
   * @example
   * png
   */
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
  /**
   * @example
   * ZM201505190ad422641448624704506270407
   */
  bizNo?: string;
  // 带参数的回调地址，接口正常的话有此字段
  /**
   * @example
   * http://zmmcportal.stable.zhimaxy.net/index.htm?biz_content=%7B%22biz_no%22%3A%225f491814480fafe7dc0779a1c452c9f7%22%7D&sign=dsgdsfhgdsfh
   */
  certifyUrl?: string;
  // 蚂蚁调用芝麻的错误码
  /**
   * @example
   * OK
   */
  resultCode: string;
  // 蚂蚁调用芝麻的结果描述
  /**
   * @example
   * Success/Invalid Arguments
   */
  resultMsg: string;
  // 蚂蚁调用芝麻的错误码
  /**
   * @example
   * isv.invalid-app-id
   */
  subCode?: string;
  // 蚂蚁调用芝麻信息
  /**
   * @example
   * 无效的AppID参数
   */
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
  /**
   * @example
   * SMS_NOTIFICATION
   */
  templateType?: string;
  // 模板名称
  /**
   * @example
   * 扩展码测试
   */
  templateName?: string;
  // 模板内容
  /**
   * @example
   * 扩展码测试
   */
  templateContent?: string;
  // 审批状态
  /**
   * @example
   * APPROVED
   */
  status?: string;
  // 模版code
  /**
   * @example
   * SMS_2306XXXX
   */
  templateCode?: string;
  // 审核未通过原因
  /**
   * @example
   * 失败原因
   */
  failReason?: string;
  // 短信创建时间
  /**
   * @example
   * 短信创建时间
   */
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
  /**
   * @example
   * yidun_aft_v3
   */
  variableName: string;
  // 输出变量值
  /**
   * @example
   * 66.6
   */
  variableValue: string;
  // 输出变量值类型
  /**
   * @example
   * Double
   */
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
  /**
   * @example
   * 行业整体趋势仍向好,白酒2Q18营收增速略回落,大众品龙头竞争力强化
   */
  docContent: string;
  // 舆情的id
  /**
   * @example
   * 1843266597720304871
   */
  docId: string;
  // 舆情的标题
  /**
   * @example
   * 扫IC网获金证引擎战略投资;产业+互联网+金融;推进电子产业资源整合_搜狐科技_搜狐网
   */
  docTitle: string;
  // 舆情的url
  /**
   * @example
   * http://istock.jrj.com.cn/article,yanbao,30483668.html
   */
  docUrl: string;
  // 情感得分
  /**
   * @example
   * 2.80
   */
  emotionScore?: string;
  // 实体相关度得分
  /**
   * @example
   * 0.71
   */
  entityRelevancyScore?: string;
  // 命中的关键词
  hitKeywords?: string;
  // 媒体影响力得分
  /**
   * @example
   * 6.90
   */
  mediaInfluenceScore?: string;
  // 来源媒体
  /**
   * @example
   * 东方媒体
   */
  mediaName: string;
  // 媒体传播得分
  /**
   * @example
   * 0.60
   */
  mediaPropagationScore?: string;
  // 舆情的发布时间
  /**
   * @example
   * 2018-07-15
   */
  publishTime: string;
  // 相似文章数
  /**
   * @example
   * 2
   */
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
  /**
   * @example
   * 696108134003934432^0
   */
  bizId: string;
  // 请求状态码; OK表示成功, 其他表示失败
  /**
   * @example
   * OK
   */
  code: string;
  // 是否调用接口成功的描述
  /**
   * @example
   * OK
   */
  message: string;
  // 请求ID
  /**
   * @example
   * EF2DE797-B632-5DCF-8502-600959436E77
   */
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

// 营销盾圈投任务信息
export class UmktCampaignTaskInfo extends $tea.Model {
  // 任务唯一id
  /**
   * @example
   * xxx-xxx-xxx
   */
  taskId: string;
  // 圈投任务执行日期，yyyy-MM-dd格式
  /**
   * @example
   * 2025-12-25
   */
  execDate: string;
  // 圈投任务执行批次
  /**
   * @example
   * 202512250020
   */
  execBatch: string;
  // 圈投任务状态
  /**
   * @example
   * D
   */
  campaignTaskStatus: string;
  // 节点任务列表
  /**
   * @example
   * [{"nodeId":"35d2171b68fd472c8f4cc5c293985d37","execDate":"","nodeTaskStatus":"F","relTaskList":[{"resourceId":"1007", "taskStatus":"F","errMsg":"上游节点执行失败"}]}
   */
  nodeTaskList: UmktCampaignNodeTaskInfo[];
  static names(): { [key: string]: string } {
    return {
      taskId: 'task_id',
      execDate: 'exec_date',
      execBatch: 'exec_batch',
      campaignTaskStatus: 'campaign_task_status',
      nodeTaskList: 'node_task_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      taskId: 'string',
      execDate: 'string',
      execBatch: 'string',
      campaignTaskStatus: 'string',
      nodeTaskList: { 'type': 'array', 'itemType': UmktCampaignNodeTaskInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 天枢系统专用ReceiptInfo结构体
export class ReceiptInfo extends $tea.Model {
  // 客户名
  /**
   * @example
   * XXX
   */
  customName: string;
  // 证件号码
  /**
   * @example
   * xxx
   */
  cardNo: string;
  // 手机号
  /**
   * @example
   * 166****1234
   */
  mobile: string;
  // 贷款金额
  /**
   * @example
   * 1234
   */
  applyAmount: number;
  // 发放金额
  /**
   * @example
   * 1234
   */
  loanAmount: number;
  // 期数
  /**
   * @example
   * 12
   */
  period: number;
  // 当前期数
  /**
   * @example
   * 12
   */
  curPeriod: number;
  // 还款方式1：等额本息，2：等额本金，3：按月付息到期还本，4：利随本清，5：自由还款
  /**
   * @example
   * 1
   */
  repayType: string;
  // 还款日
  /**
   * @example
   * XXXX.XX.XX
   */
  repayDate: string;
  // 放款时间
  /**
   * @example
   * 2018-10-10T10:10:00Z
   */
  loanTime: string;
  // 借据状态0：未还清，1：已还清，2：已提前还清
  /**
   * @example
   * 0
   */
  status: string;
  // 已还本金
  /**
   * @example
   * 1234
   */
  alreadyCorpus: number;
  // 已还利息
  /**
   * @example
   * 50
   */
  alreadyAccrual: number;
  // 结清日期
  /**
   * @example
   * 2018-10-10T10:10:00Z
   */
  alreadyDate: string;
  // 审批状态0：通过 1：拒绝 2：审批中 3：失败
  /**
   * @example
   * 0
   */
  workflowStatus: string;
  // 借据编号
  /**
   * @example
   * 145785
   */
  receiptNo: string;
  // 放款状态(0：放款成功 1：放款失败 2：放款异常 3：放款中）
  /**
   * @example
   * 0
   */
  loanStatus?: string;
  // 业务类型 1：现金贷（默认）、2：分期付
  /**
   * @example
   * 1
   */
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
  /**
   * @example
   * xxx
   */
  customNo: string;
  // 当前期数
  /**
   * @example
   * xx
   */
  period: string;
  // 应还总额
  /**
   * @example
   * 1
   */
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
  /**
   * @example
   * xx
   */
  receiptNo: string;
  // 还款状态1：已还清 2 未还 3 部分还款
  /**
   * @example
   * 1
   */
  status: string;
  // 应还日期
  /**
   * @example
   * 2018-10-10T10:10:00Z
   */
  settleDate: string;
  // 还款日期
  /**
   * @example
   * 2018-10-10T10:10:00Z
   */
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
  /**
   * @example
   * 123AA
   */
  requestId: string;
  // 业务响应Json
  /**
   * @example
   * {"a":"b"} 
   */
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
  /**
   * @example
   * 广东省珠海市前山金鸡西路
   */
  operatingPlace?: string;
  // 经营省份
  /**
   * @example
   * 湖北省
   */
  operatingProvince?: string;
  // 企业名称
  /**
   * @example
   * 珠海格力电器股份有限公司
   */
  orgName?: string;
  // 风险分数
  /**
   * @example
   * 80
   */
  riskScore?: number;
  // 风险标签
  /**
   * @example
   * ["内部被投诉","法定代表人名下企业超过6家"]
   */
  riskTags?: string[];
  // 风险线索
  riskTagDetails?: RtopRiskTag[];
  // 风险标签Id集合
  /**
   * @example
   * ["CMN00025", "CMN00011"]
   */
  riskTagIds?: string[];
  // 统一社会信用代码
  /**
   * @example
   * 91440400192548256N
   */
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
  /**
   * @example
   * 1
   */
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
  /**
   * @example
   * 10
   */
  count: number;
  // 年龄
  /**
   * @example
   * 2018-09-09
   */
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
  /**
   * @example
   * 张三
   */
  customName: string;
  // 身份证号码(18位)
  /**
   * @example
   * 1234555
   */
  cardNo: string;
  // 1-身份证
  /**
   * @example
   * 1
   */
  idType: string;
  // 证件开始日期(格式：YYYY-MM-DD)
  // 
  /**
   * @example
   * YYYY-MM-DD
   */
  certSignDate: string;
  // 格式：YYYY-MM-DD，身份证有效期为长期的送: 9999-12-31
  /**
   * @example
   * YYYY-MM-DD
   */
  certValidate: string;
  // 证件地址
  /**
   * @example
   * 浙江
   */
  certAdr: string;
  // 手机号
  /**
   * @example
   * 12344
   */
  mobile: string;
  // 学历
  /**
   * @example
   * 本科
   */
  education?: string;
  // 所在省份 汉字
  /**
   * @example
   * 浙江
   */
  province?: string;
  // 所在城市 汉字
  /**
   * @example
   * 杭州
   */
  city?: string;
  // 地区名称 汉字
  /**
   * @example
   * xxx
   */
  area?: string;
  // 详细地址
  /**
   * @example
   * xxx
   */
  address?: string;
  // 性别M-男
  // F-女
  /**
   * @example
   * M
   */
  sex?: string;
  // 民族
  /**
   * @example
   * 汉
   */
  nation?: string;
  // 婚姻状态：00-未婚，01-已婚，02-离婚，03-丧偶，99-未知
  /**
   * @example
   * 00
   */
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
  /**
   * @example
   * 场景code
   */
  sceneCode: string;
  // 拒绝
  /**
   * @example
   * reject
   */
  sceneDecision: string;
  // decision_flow
  /**
   * @example
   * decision_flow
   */
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
  /**
   * @example
   * "186123456789"
   */
  customerKey: string;
  // 渠道参数
  /**
   * @example
   * "{"name":"苹果","code":"5643","num":"5"}"
   */
  channelParams: string;
  // 用户透传字段
  /**
   * @example
   * "[{"name":"zhangshan"}]"
   */
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
  /**
   * @example
   * 工商银行
   */
  bankName: string;
  // 银行编码
  /**
   * @example
   * ICBC
   */
  bankCode: string;
  // 银行卡号
  /**
   * @example
   * 6226211215645646
   */
  bankCardNo: string;
  // 是否已签约
  /**
   * @example
   * Y/N
   */
  signed?: string;
  // 是否为账户代扣银行卡
  /**
   * @example
   * Y/N
   */
  acctBankCard?: string;
  // 协议号
  /**
   * @example
   * 202515300000000000000158463
   */
  protocolNo?: string;
  static names(): { [key: string]: string } {
    return {
      bankName: 'bank_name',
      bankCode: 'bank_code',
      bankCardNo: 'bank_card_no',
      signed: 'signed',
      acctBankCard: 'acct_bank_card',
      protocolNo: 'protocol_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      bankName: 'string',
      bankCode: 'string',
      bankCardNo: 'string',
      signed: 'string',
      acctBankCard: 'string',
      protocolNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 期数费用
export class InstallmentTrial extends $tea.Model {
  // 总期数
  /**
   * @example
   * 12
   */
  totalPeriod: string;
  // 分期应还总金额
  /**
   * @example
   * 1999.98
   */
  totalAmount: number;
  // 总利息（分期产生的利息/手续费）
  /**
   * @example
   * 1999.98
   */
  totalFee: number;
  // 期费率，精确到小数点后四位0.1250，表示年利率为12.5%
  /**
   * @example
   * 0.1250
   */
  feeRate: number;
  // 年利率，精确到小数点后四位0.1250，表示年利率为12.5%
  /**
   * @example
   * 0.1250
   */
  yearRate: number;
  // 月供列表
  termDetailList: TermDetail[];
  // 是否最优标识
  /**
   * @example
   * true, false
   */
  optimal?: boolean;
  // 总罚息
  /**
   * @example
   * 1999.98
   */
  totalPenalty?: number;
  // 总担保费
  /**
   * @example
   * 1999.98
   */
  totalGuaranteeFee?: number;
  // 总违约金
  /**
   * @example
   * 1999.98
   */
  totalLiquidatedDamages?: number;
  // 总服务费
  /**
   * @example
   * 1999.98
   */
  totalServerFee?: number;
  // 费率折扣，0.95：九五折；0：免息；1/null：不打折
  /**
   * @example
   * 0.95
   */
  discount?: number;
  // 总减免金额
  /**
   * @example
   * 1999.98
   */
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

// 天枢-电商-借据详情
export class EcLoanDetail extends $tea.Model {
  // 借据号
  /**
   * @example
   * ACCAL202301120798255316102054428
   */
  loanAcctNo: string;
  // 贷款金额
  /**
   * @example
   * 1.23
   */
  loanAmt: number;
  // 贷款发放日
  /**
   * @example
   * 2023/05/01
   */
  loanStartDate: string;
  // 贷款到期日
  /**
   * @example
   * 2023/05/01
   */
  loanEndDate: string;
  // 利率类型
  /**
   * @example
   * 1
   */
  rateType: string;
  // 利率单位
  /**
   * @example
   * 1
   */
  rateUnit: string;
  // 贷款利率 年化利率(%)
  /**
   * @example
   * 1.23
   */
  loanIntRate: string;
  // 当前剩余本金
  /**
   * @example
   * 1.23
   */
  currRemainCorpus: string;
  // 还款方式
  /**
   * @example
   * 1
   */
  loanRepayType: string;
  // 最后一次计息日
  /**
   * @example
   * 2023/05/01
   */
  lastCountIntDate: string;
  // 当前期数
  /**
   * @example
   * 25
   */
  currentTerm: string;
  // 当期应还日期
  /**
   * @example
   * 2023/05/01
   */
  curRepayDay: string;
  // 对应期次应还金额
  /**
   * @example
   * 1.23
   */
  curRemainAmt: number;
  // 当期已还总额
  /**
   * @example
   * 1.23
   */
  currentPaidAmt: number;
  // 对应期次应还本金
  /**
   * @example
   * 1.23
   */
  curPrincipalAmount: number;
  // 对应期次已还本金
  /**
   * @example
   * 1.23
   */
  actPrincipalAmount: number;
  // 对应期次应还利息
  /**
   * @example
   * 1.23
   */
  curInterestAmount: number;
  // 对应期次已还利息
  /**
   * @example
   * 1.23
   */
  actInterestAmount: number;
  // 对应期次应还正常利息
  /**
   * @example
   * 1.23
   */
  curNormalInterestAmt: number;
  // 对应期次已还正常利息 
  /**
   * @example
   * 1.23
   */
  actCurNormalInterestAmt: number;
  // 对应期次应还罚息
  /**
   * @example
   * 1.23
   */
  curPrincipalPenaltyAmt: number;
  // 对应期次已还罚息
  /**
   * @example
   * 1.23
   */
  actCurPrincipalPenaltyAmt: number;
  // 对应期次应还复利
  /**
   * @example
   * 1.23
   */
  curInterestPenaltyAmt: number;
  // 对应期次已还复利
  /**
   * @example
   * 1.23
   */
  actCurInterestPenaltyAmt: number;
  // 总期数
  /**
   * @example
   * 1
   */
  totalNum: string;
  // 借据状态
  /**
   * @example
   * 1
   */
  loanStatus: string;
  // 总欠款本息
  /**
   * @example
   * 1.23
   */
  totalOweCorpusInterest: string;
  static names(): { [key: string]: string } {
    return {
      loanAcctNo: 'loan_acct_no',
      loanAmt: 'loan_amt',
      loanStartDate: 'loan_start_date',
      loanEndDate: 'loan_end_date',
      rateType: 'rate_type',
      rateUnit: 'rate_unit',
      loanIntRate: 'loan_int_rate',
      currRemainCorpus: 'curr_remain_corpus',
      loanRepayType: 'loan_repay_type',
      lastCountIntDate: 'last_count_int_date',
      currentTerm: 'current_term',
      curRepayDay: 'cur_repay_day',
      curRemainAmt: 'cur_remain_amt',
      currentPaidAmt: 'current_paid_amt',
      curPrincipalAmount: 'cur_principal_amount',
      actPrincipalAmount: 'act_principal_amount',
      curInterestAmount: 'cur_interest_amount',
      actInterestAmount: 'act_interest_amount',
      curNormalInterestAmt: 'cur_normal_interest_amt',
      actCurNormalInterestAmt: 'act_cur_normal_interest_amt',
      curPrincipalPenaltyAmt: 'cur_principal_penalty_amt',
      actCurPrincipalPenaltyAmt: 'act_cur_principal_penalty_amt',
      curInterestPenaltyAmt: 'cur_interest_penalty_amt',
      actCurInterestPenaltyAmt: 'act_cur_interest_penalty_amt',
      totalNum: 'total_num',
      loanStatus: 'loan_status',
      totalOweCorpusInterest: 'total_owe_corpus_interest',
    };
  }

  static types(): { [key: string]: any } {
    return {
      loanAcctNo: 'string',
      loanAmt: 'number',
      loanStartDate: 'string',
      loanEndDate: 'string',
      rateType: 'string',
      rateUnit: 'string',
      loanIntRate: 'string',
      currRemainCorpus: 'string',
      loanRepayType: 'string',
      lastCountIntDate: 'string',
      currentTerm: 'string',
      curRepayDay: 'string',
      curRemainAmt: 'number',
      currentPaidAmt: 'number',
      curPrincipalAmount: 'number',
      actPrincipalAmount: 'number',
      curInterestAmount: 'number',
      actInterestAmount: 'number',
      curNormalInterestAmt: 'number',
      actCurNormalInterestAmt: 'number',
      curPrincipalPenaltyAmt: 'number',
      actCurPrincipalPenaltyAmt: 'number',
      curInterestPenaltyAmt: 'number',
      actCurInterestPenaltyAmt: 'number',
      totalNum: 'string',
      loanStatus: 'string',
      totalOweCorpusInterest: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 营销盾离线圈客执行批次信息
export class UmktOfflineDecisionTaskExecBatchInfo extends $tea.Model {
  // 执行批次
  /**
   * @example
   * 202501011930
   */
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
  /**
   * @example
   * 111
   */
  supplierId: string;
  // 供应商名字
  /**
   * @example
   * ANTCLOUD
   */
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
  /**
   * @example
   * key
   */
  key?: string;
  // value
  /**
   * @example
   * value
   */
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
  /**
   * @example
   * true
   */
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
  /**
   * @example
   * R2022xxxxxx
   */
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
  /**
   * @example
   * true, false
   */
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
  /**
   * @example
   * 决策指标id
   */
  id: string;
  // 决策服务id
  /**
   * @example
   * 700002
   */
  serviceId: string;
  // 属性名
  /**
   * @example
   * weight
   */
  propertyName: string;
  // 属性值或指标值
  /**
   * @example
   * 100
   */
  propertyValue?: string;
  // 决策租户
  /**
   * @example
   * DEFAULT
   */
  decisionTenant?: string;
  // 创建时间，格式:yyyy-MM-dd HH:mm:ss
  /**
   * @example
   * 创建时间，格式:yyyy-MM-dd HH:mm:ss
   */
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
  /**
   * @example
   * 授信协议
   */
  title: string;
  // 协议地址
  /**
   * @example
   * http:xxxxxxxx
   */
  agreementUrl?: string;
  // 协议文件Base64
  /**
   * @example
   * 111
   */
  fileBase64?: string;
  // 协议图片文件base64集合
  /**
   * @example
   * 111111
   */
  picFileBase64List?: string[];
  // 图片文件oss集合
  picOssPathList?: string[];
  // 机构名称
  /**
   * @example
   * 杭银
   */
  organizationName: string;
  // 协议类型-code
  /**
   * @example
   * APPLY
   */
  fileType: string;
  // 协议类型-名称
  /**
   * @example
   * 授信协议
   */
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

// 贷后异常监控
export class LoanMonitorCust extends $tea.Model {
  // 合同编号
  /**
   * @example
   * CONT20230314000000143225
   */
  contractNo: string;
  // 商户GMV 单位：元
  /**
   * @example
   * 5000000.00
   */
  grossMercVolume: string;
  // 实际销售结算金额 单位：元，格式：数字，小数点后两位
  /**
   * @example
   * 5000000.00
   */
  actSaleAmt: string;
  // 退货率 单位：%
  /**
   * @example
   * 20
   */
  returnRate: string;
  // 已发货未收款金额 单位：元，格式：数字，小数点后两位
  /**
   * @example
   * 5000000.00
   */
  accountsReceivable: string;
  static names(): { [key: string]: string } {
    return {
      contractNo: 'contract_no',
      grossMercVolume: 'gross_merc_volume',
      actSaleAmt: 'act_sale_amt',
      returnRate: 'return_rate',
      accountsReceivable: 'accounts_receivable',
    };
  }

  static types(): { [key: string]: any } {
    return {
      contractNo: 'string',
      grossMercVolume: 'string',
      actSaleAmt: 'string',
      returnRate: 'string',
      accountsReceivable: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 天枢-电商-企业信息
export class EcEnterpriseInfo extends $tea.Model {
  // 企业名称
  /**
   * @example
   * 张三的贸易有限公司
   */
  entName: string;
  // 申请企业证件类型
  /**
   * @example
   * Ent04
   */
  entIdType: string;
  // 客户企业的统一社会信用代码，有企业信息则必输
  /**
   * @example
   * 91234500123400000R
   */
  entIdNo: string;
  static names(): { [key: string]: string } {
    return {
      entName: 'ent_name',
      entIdType: 'ent_id_type',
      entIdNo: 'ent_id_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      entName: 'string',
      entIdType: 'string',
      entIdNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 机构平台通知响应结果
export class DefinInnerChannelNotifyResult extends $tea.Model {
  // 请求编号
  /**
   * @example
   * aaaa
   */
  requestId: string;
  // 业务响应Json
  /**
   * @example
   * {"a":"b"}
   */
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
  /**
   * @example
   * xxx
   */
  storeBrand: string;
  // 品牌，商户入驻时需填写，
  // TBJHF: 赛鸽出行
  // AIJNBJ: 智迈电动车
  // KJOKJBO: 金箭出行
  // IFJRJTIJ: 骑士智行
  // KVMPOH: 巨龙智行
  // NPGBRVBO: 摩生态A
  /**
   * @example
   * IFJRJTIJ
   */
  trafficPlatform?: string;
  // 门店ID
  /**
   * @example
   * xxxx
   */
  storeId: string;
  // 门店名称
  /**
   * @example
   * xxxx
   */
  storeName: string;
  // 统一社会信用代码
  /**
   * @example
   * xxx
   */
  usci: string;
  // 门店-省，浙江省
  /**
   * @example
   * 浙江省
   */
  province: string;
  // 省编码
  /**
   * @example
   * 100001
   */
  provinceCode?: string;
  // 门店-市，杭州市
  /**
   * @example
   * 杭州市
   */
  city: string;
  // 市编码
  /**
   * @example
   * xxxx
   */
  cityCode?: string;
  // 门店-区，滨江区
  /**
   * @example
   * 滨江区
   */
  district: string;
  // 区编码
  /**
   * @example
   * xxx
   */
  districtCode?: string;
  // 门店-详细地址，
  // 望江路万达广场一层001号
  /**
   * @example
   * 望江路万达广场一层001号
   */
  address: string;
  // 门店-经度
  /**
   * @example
   * xxxx
   */
  longitude?: string;
  // 门店-纬度
  /**
   * @example
   * xxxx
   */
  latitude?: string;
  // 营业执照-开始时间，yyyy-MM-dd
  /**
   * @example
   * yyyy-MM-dd
   */
  storeStartDate: string;
  // 营业执照-结束时间，yyyy-MM-dd，长期上送：9999-12-31
  /**
   * @example
   * yyyy-MM-dd
   */
  storeEndDate: string;
  // 门店类型，
  // 个体: 个体工商户；企业
  /**
   * @example
   * 个体
   */
  storeType: string;
  // 法人-姓名
  /**
   * @example
   * xxx
   */
  legalPersonName: string;
  // 法人-身份证号
  /**
   * @example
   * xxx
   */
  legalPersonIdCard: string;
  // 法人-手机号
  /**
   * @example
   * xxx
   */
  legalPersonMobile: string;
  // 法人-身份证有效期，，身份证反面格式：如yyyy.MM.dd-长期
  /**
   * @example
   * yyyy.MM.dd-长期
   */
  effectiveDate: string;
  // 对公-开户行名称
  /**
   * @example
   * xxx
   */
  bankName?: string;
  // 对公-开户行编码
  /**
   * @example
   * ICBC
   */
  bankCode?: string;
  // 对公-支行名称
  /**
   * @example
   * xxx
   */
  branchName?: string;
  // 对公-联行号
  /**
   * @example
   * xxx
   */
  cnapsCode?: string;
  // 对公-银行账户名称
  /**
   * @example
   * xxx
   */
  accountName?: string;
  // 对公-银行账户号
  /**
   * @example
   * xxx
   */
  accountNumber?: string;
  // 对公-开户行所在省，浙江
  /**
   * @example
   * 浙江
   */
  bankProvince?: string;
  // 对公-开户行所在市，杭州
  /**
   * @example
   * 杭州
   */
  bankCity?: string;
  // 对私-银行卡号
  /**
   * @example
   * xxxx
   */
  payeeBankCard?: string;
  // 对私-银行名称
  /**
   * @example
   * xxx
   */
  payeeBankName?: string;
  // 对私-银行编码
  /**
   * @example
   * ICBC
   */
  payeeBankCode?: string;
  // 蚂蚁数科入驻账号
  /**
   * @example
   * xxxx
   */
  loginTenant?: string;
  // 入驻时间
  /**
   * @example
   * yyyy-MM-dd
   */
  loginDate?: string;
  // 结算支付宝账户，交易资金结算的具体支付宝账号，商户入驻时必填
  /**
   * @example
   * xxxx@126.com
   */
  alipayLogonId?: string;
  // 支付宝openId
  /**
   * @example
   * xxxx
   */
  infoSourceOpenId?: string;
  // 签约支付宝账户，商户入驻时必填（接收支付宝下发的签约协议）
  /**
   * @example
   * xxx
   */
  bindingAlipayLogonId?: string;
  static names(): { [key: string]: string } {
    return {
      storeBrand: 'store_brand',
      trafficPlatform: 'traffic_platform',
      storeId: 'store_id',
      storeName: 'store_name',
      usci: 'usci',
      province: 'province',
      provinceCode: 'province_code',
      city: 'city',
      cityCode: 'city_code',
      district: 'district',
      districtCode: 'district_code',
      address: 'address',
      longitude: 'longitude',
      latitude: 'latitude',
      storeStartDate: 'store_start_date',
      storeEndDate: 'store_end_date',
      storeType: 'store_type',
      legalPersonName: 'legal_person_name',
      legalPersonIdCard: 'legal_person_id_card',
      legalPersonMobile: 'legal_person_mobile',
      effectiveDate: 'effective_date',
      bankName: 'bank_name',
      bankCode: 'bank_code',
      branchName: 'branch_name',
      cnapsCode: 'cnaps_code',
      accountName: 'account_name',
      accountNumber: 'account_number',
      bankProvince: 'bank_province',
      bankCity: 'bank_city',
      payeeBankCard: 'payee_bank_card',
      payeeBankName: 'payee_bank_name',
      payeeBankCode: 'payee_bank_code',
      loginTenant: 'login_tenant',
      loginDate: 'login_date',
      alipayLogonId: 'alipay_logon_id',
      infoSourceOpenId: 'info_source_open_id',
      bindingAlipayLogonId: 'binding_alipay_logon_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      storeBrand: 'string',
      trafficPlatform: 'string',
      storeId: 'string',
      storeName: 'string',
      usci: 'string',
      province: 'string',
      provinceCode: 'string',
      city: 'string',
      cityCode: 'string',
      district: 'string',
      districtCode: 'string',
      address: 'string',
      longitude: 'string',
      latitude: 'string',
      storeStartDate: 'string',
      storeEndDate: 'string',
      storeType: 'string',
      legalPersonName: 'string',
      legalPersonIdCard: 'string',
      legalPersonMobile: 'string',
      effectiveDate: 'string',
      bankName: 'string',
      bankCode: 'string',
      branchName: 'string',
      cnapsCode: 'string',
      accountName: 'string',
      accountNumber: 'string',
      bankProvince: 'string',
      bankCity: 'string',
      payeeBankCard: 'string',
      payeeBankName: 'string',
      payeeBankCode: 'string',
      loginTenant: 'string',
      loginDate: 'string',
      alipayLogonId: 'string',
      infoSourceOpenId: 'string',
      bindingAlipayLogonId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 批量回溯结果内容
export class ResultItem extends $tea.Model {
  // dataId
  /**
   * @example
   * 46052e46721417297df682ef88a8ab91
   */
  dataId: string;
  // 分值
  /**
   * @example
   * 0.32223
   */
  score: string;
  // 特征值
  /**
   * @example
   * {"feature1":0.223,"feature2":0.33,"feature3":0.323}
   */
  featureJson?: string;
  // 单调样本数据处理结果
  // 初始化/处理中/成功/失败
  /**
   * @example
   * INIT/PROCESS/SUCCESS/FAIL
   */
  status?: string;
  // 各个子分
  /**
   * @example
   * {"score1":0.22233,"score2":0.34234,"score3":0.34343}
   */
  scoreJson: string;
  static names(): { [key: string]: string } {
    return {
      dataId: 'data_id',
      score: 'score',
      featureJson: 'feature_json',
      status: 'status',
      scoreJson: 'score_json',
    };
  }

  static types(): { [key: string]: any } {
    return {
      dataId: 'string',
      score: 'string',
      featureJson: 'string',
      status: 'string',
      scoreJson: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 批量决策单主体查询结果
export class BatchQueryResult extends $tea.Model {
  // 查询主体
  /**
   * @example
   * test
   */
  queryKey: string;
  // 单用户决策结果
  /**
   * @example
   * accept
   */
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
  /**
   * @example
   * 请求透传字段
   */
  extInfo: string;
  // 成功触达：OK；未触达：AI_ROBOT_CALL_REQUEST_NOT_EXIST
  /**
   * @example
   * OK
   */
  resultCode: string;
  // 外呼号码
  /**
   * @example
   * 130XXXXXX
   */
  customerKey: string;
  // 呼叫次数
  /**
   * @example
   * 1
   */
  currentCallTimes: number;
  // 号码模版
  /**
   * @example
   * MOBILE/MOBILE/CUSTOMER_ENCRY
   */
  keyTemplate: string;
  // 导入号码时返回的批次号
  /**
   * @example
   * 1
   */
  batchId: string;
  // 2001:批量-预测外呼，2002:批量-AI外呼-不转人工，2003:批量-AI外呼-接通转人工，2004: 批量-AI外呼-智能转人工,2005:批量-语音通知
  /**
   * @example
   * 2001
   */
  callType: number;
  // 用户自定义标签
  /**
   * @example
   * tag
   */
  tag?: string;
  // 外呼id
  /**
   * @example
   * 9b2eb6b8
   */
  callId: string;
  // 外呼任务编号
  /**
   * @example
   * 1
   */
  taskId: number;
  // AI话术ID
  /**
   * @example
   * 1
   */
  templateId?: number;
  // 外呼状态编码
  /**
   * @example
   * 1
   */
  statusCode: number;
  // 外呼状态描述
  /**
   * @example
   * 1
   */
  statusDescription: string;
  // 转人工状态编码
  /**
   * @example
   * 1
   */
  transferStatusCode: number;
  // 转人工状态
  /**
   * @example
   * 0
   */
  transferStatus: string;
  // 分配坐席ID
  agentId?: number;
  // 坐席在贵司业务系统唯一标识，用于查询对应agentId；可以为空。
  /**
   * @example
   * a
   */
  agentTag?: string;
  // 坐席分机号
  /**
   * @example
   * a
   */
  agentExtension?: string;
  // 导入时间
  /**
   * @example
   * 2019-01-09 14:14:19
   */
  importTime: string;
  // 开始通话时间
  /**
   * @example
   * 2019-01-09 14:14:19
   */
  callBeginTime: string;
  // 振铃时长，单位ms
  /**
   * @example
   * 10
   */
  ringTime: number;
  // 接通时间
  /**
   * @example
   * 2019-01-09 14:14:19
   */
  answerTime?: string;
  // 通话时长，单位：大于1分钟，显示分钟秒，小于1分钟，显示秒
  /**
   * @example
   * 1
   */
  speakingTime: string;
  // 通话时长，单位：秒
  /**
   * @example
   * 1
   */
  speakingDuration: number;
  // 挂断时间
  /**
   * @example
   * 2019-01-09 14:14:19
   */
  hangupTime: string;
  // 对话轮次
  /**
   * @example
   * 1
   */
  speakingTurns: number;
  // 人工通话时长，单位：大于1分钟，显示分钟秒，小于1分钟，显示秒
  /**
   * @example
   * 1
   */
  agentSpeakingTime: string;
  // 人工通话时长，单位：秒
  /**
   * @example
   * 1
   */
  agentSpeakingDuration: number;
  // 意向标签
  /**
   * @example
   * C
   */
  intentTag: string;
  // 意向说明
  /**
   * @example
   * 确认本人,未承诺还款
   */
  intentDescription: string;
  // 个性标签
  /**
   * @example
   * 投诉,非本人
   */
  individualTag?: string;
  // 回复关键词
  /**
   * @example
   * 链接,利息
   */
  keywords?: string;
  // 挂机方式，AI挂机1，坐席挂机2，客户挂机3
  /**
   * @example
   * 1
   */
  hungupType: number;
  // 挂机短信，可选值：1、2
  // 1:发送，2:不发送
  /**
   * @example
   * 1
   */
  sms: string;
  // 对话录音，URL，可以为空
  /**
   * @example
   * 1
   */
  chatRecord?: string;
  // 聊天记录，可以为空
  /**
   * @example
   * {}
   */
  chats?: string;
  // 可选值：0、1
  // 0:不添加，1:添加
  /**
   * @example
   * 1
   */
  addWx?: number;
  // 加微进度，可选值：已申请、加微成功
  /**
   * @example
   * 已申请
   */
  addWxStatus?: string;
  // 是否接通重呼，可选值：0、1
  // 0正常外呼，1接通重呼
  /**
   * @example
   * 1
   */
  answerRecall: number;
  // 导入号码时的参数值
  /**
   * @example
   * {"电话号码":"13100000000"}
   */
  properties?: string;
  // 导入号码时的业务参数值，原样返回
  /**
   * @example
   * a
   */
  bizProperties?: string;
  // 拦截原因：当状态为已拦截时，可选值：黑名单拦截，灰名单拦截，异常号码拦截
  /**
   * @example
   * 黑名单拦截
   */
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

// 商城订单信息
export class GoodsOrderInfo extends $tea.Model {
  // 商城订单号
  /**
   * @example
   * 2023343380112
   */
  goodsOrderNo: string;
  // 消费金额
  /**
   * @example
   * 1000.00
   */
  amount: string;
  static names(): { [key: string]: string } {
    return {
      goodsOrderNo: 'goods_order_no',
      amount: 'amount',
    };
  }

  static types(): { [key: string]: any } {
    return {
      goodsOrderNo: 'string',
      amount: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 支付方式锁定结果
export class PayMethodLockResult extends $tea.Model {
  // 签约结果
  /**
   * @example
   * 0、1
   */
  signStatus: string;
  // 账号
  /**
   * @example
   * userId
   */
  accountId: string;
  // 登录号
  /**
   * @example
   * userIdA
   */
  loginId: string;
  // 支付公司
  /**
   * @example
   * AliPay
   */
  payChannel: string;
  // 绑定账号名称
  /**
   * @example
   * someName
   */
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
  /**
   * @example
   * 123123
   */
  relationNo: string;
  // 合同编号
  /**
   * @example
   * 123123
   */
  contractNo: string;
  // 合同名称
  /**
   * @example
   * 用信合同
   */
  contractName: string;
  // 合同类型
  /**
   * @example
   * 0
   */
  contractType: string;
  // 客户编号
  /**
   * @example
   * PCM123xxxx
   */
  customNo: string;
  // 合同存放目录
  /**
   * @example
   * https://11111
   */
  savePath: string;
  // 合同金额
  contractAmount: number;
  // 用信合同编号
  /**
   * @example
   * 123123
   */
  disburseContractNo: string;
  // 授信合同编号
  /**
   * @example
   * 123123
   */
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

// 批量请求响应的结构体
export class ResItem extends $tea.Model {
  // 客户侧样本唯一id用于映射
  /**
   * @example
   * 077e5fc68135bd8e8223a094029d4cee
   */
  sampleId: string;
  // 蚂蚁侧对应样本唯一id，与客户侧形成映射关系，查询时需要携带该id
  /**
   * @example
   * 46052e46721417297df682ef88a8ab91
   */
  dataId: string;
  static names(): { [key: string]: string } {
    return {
      sampleId: 'sample_id',
      dataId: 'data_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      sampleId: 'string',
      dataId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 代扣明细
export class WithholdDetailItem extends $tea.Model {
  // 贷款申请编号
  /**
   * @example
   * xxxx
   */
  assetId: string;
  // 放款编号/借据号
  /**
   * @example
   * xxxx
   */
  capitalLoanNo: string;
  // 订单维度的实还总额,保留两位有效数字
  // 单笔订单代扣的总额(单位:分)
  /**
   * @example
   * 1999.98
   */
  rpyTotalAmt: number;
  // 还款类型，0-待还、1-正常还款、2-部分提前还、 3-逾期还款 、4-全部提前还 、5-坏账代偿、 6-回购
  /**
   * @example
   * 1
   */
  rpyTpe: number;
  // 代扣日期，用户实还日，用户主动发起是当前日；定时扣款是应还日，格式=yyyy-MM-dd
  /**
   * @example
   * yyyy-MM-dd
   */
  rpyDate: string;
  // 还款账单明细,如果是提前结清,会有多条
  /**
   * @example
   * [{}]
   */
  billDetails: BillDetail[];
  static names(): { [key: string]: string } {
    return {
      assetId: 'asset_id',
      capitalLoanNo: 'capital_loan_no',
      rpyTotalAmt: 'rpy_total_amt',
      rpyTpe: 'rpy_tpe',
      rpyDate: 'rpy_date',
      billDetails: 'bill_details',
    };
  }

  static types(): { [key: string]: any } {
    return {
      assetId: 'string',
      capitalLoanNo: 'string',
      rpyTotalAmt: 'number',
      rpyTpe: 'number',
      rpyDate: 'string',
      billDetails: { 'type': 'array', 'itemType': BillDetail },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 天枢-电商-跳转链接
export class EcLinkUrl extends $tea.Model {
  // 根据传输的操作类型，返回对应的URL地址
  /**
   * @example
   * SQ202301291615023
   */
  urlId?: string;
  // 免登场景下，给到开放银行和对公认证中心的链接ID,如果对方没有，没办法以免登的形式进入银行页面。
  /**
   * @example
   * APPL20200826000000250721
   */
  h5id?: string;
  // 免登场景下，给到对公认证中心的数据，后续KYB需要拿到这个数据进行校验，否则会无法跳转指定地址。
  /**
   * @example
   * 1
   */
  state?: string;
  static names(): { [key: string]: string } {
    return {
      urlId: 'url_id',
      h5id: 'h5id',
      state: 'state',
    };
  }

  static types(): { [key: string]: any } {
    return {
      urlId: 'string',
      h5id: 'string',
      state: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// ai外呼回调详情
export class AICallbackMessage extends $tea.Model {
  // 批次号
  /**
   * @example
   * 5de2ccbf87914544afb57a77e39ec023
   */
  batchId?: string;
  // 用户标签
  /**
   * @example
   * 阿松大
   */
  tag: string;
  // 外呼id
  /**
   * @example
   * CALLID
   */
  callId: string;
  // 外呼的话术模板Id
  /**
   * @example
   * 7
   */
  templateId?: number;
  // 外呼状态编码
  /**
   * @example
   * 1
   */
  statusCode: number;
  // 外呼状态描述
  /**
   * @example
   * 已接听
   */
  statusDescription: string;
  // 导入时间
  /**
   * @example
   * 2019-11-23 14:47:06
   */
  importTime: string;
  // 开始通话时间
  /**
   * @example
   * 2019-11-23 14:47:06
   */
  callBeginTime: string;
  // 振铃时长, 单位毫秒
  /**
   * @example
   * 2000
   */
  ringTime: number;
  // 接通时间
  /**
   * @example
   * 2019-01-09 14:14:19
   */
  answerTime: string;
  // AI通话时长,单位s
  /**
   * @example
   * 20
   */
  speakingDuration: number;
  // 挂断时间
  /**
   * @example
   * 2019-01-09 14:14:19
   */
  hangupTime: string;
  // 对话轮次
  /**
   * @example
   * 5
   */
  speakingTurns: number;
  // 意向标签
  /**
   * @example
   * C
   */
  intentTag: string;
  // 意向说明
  /**
   * @example
   * 确认本人,未承诺还款
   */
  intentDescription: string;
  // 个性标签
  /**
   * @example
   * a
   */
  individualTag: string;
  // 回复关键词
  /**
   * @example
   * 利息
   */
  keywords: string;
  // 对话录音
  /**
   * @example
   * 录音url
   */
  chatRecord?: string;
  // 参数值
  /**
   * @example
   * {"电话号码":"13100000000"}
   */
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

// 天枢-电商-还款试算结果
export class EcRepayTrial extends $tea.Model {
  // 合同编号
  /**
   * @example
   * 123
   */
  contractNo?: string;
  // 数字格式,精确到分。借据已结清,会返回还款总金额为0
  /**
   * @example
   * 23
   */
  totalAmount?: string;
  // 利息数字格式,精确到分
  /**
   * @example
   * 1.23
   */
  interestAmount?: string;
  // 本金 数字格式,精确到分
  /**
   * @example
   * 2.35
   */
  principalAmount?: string;
  // 罚息 数字格式,精确到分
  /**
   * @example
   * 1.23
   */
  penaltyInterestAmount?: string;
  // 复利 数字格式,精确到分
  /**
   * @example
   * 1.23
   */
  compoundInterestAmount?: string;
  static names(): { [key: string]: string } {
    return {
      contractNo: 'contract_no',
      totalAmount: 'total_amount',
      interestAmount: 'interest_amount',
      principalAmount: 'principal_amount',
      penaltyInterestAmount: 'penalty_interest_amount',
      compoundInterestAmount: 'compound_interest_amount',
    };
  }

  static types(): { [key: string]: any } {
    return {
      contractNo: 'string',
      totalAmount: 'string',
      interestAmount: 'string',
      principalAmount: 'string',
      penaltyInterestAmount: 'string',
      compoundInterestAmount: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 决策场景信息
export class AirDfSceneInfos extends $tea.Model {
  // 决策场景结果
  /**
   * @example
   * review
   */
  sceneDecision?: string;
  // 决策场景
  /**
   * @example
   * air_scene
   */
  sceneCode?: string;
  // 决策域信息
  /**
   * @example
   * [{"decision_flows":[{"decision":"review","name":"租赁测试策略"}],"domain_decision":"review","domain_code":"lease_domain"}]
   */
  domainInfos?: AirDomainInfos[];
  static names(): { [key: string]: string } {
    return {
      sceneDecision: 'scene_decision',
      sceneCode: 'scene_code',
      domainInfos: 'domain_infos',
    };
  }

  static types(): { [key: string]: any } {
    return {
      sceneDecision: 'string',
      sceneCode: 'string',
      domainInfos: { 'type': 'array', 'itemType': AirDomainInfos },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 预警企业
export class RtopCompanyAlarm extends $tea.Model {
  // 企业ID
  /**
   * @example
   * 1
   */
  companyId: string;
  // 预警类型
  /**
   * @example
   * 1
   */
  alarmType: string;
  // 预警序号
  /**
   * @example
   * 1
   */
  alarmIdx: string;
  // 预警日期
  /**
   * @example
   * 1
   */
  alarmDate: string;
  // 预警标识，是否需要预警
  /**
   * @example
   * 1
   */
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

// 天枢-电商-还款明细查询
export class EcRepayQuery extends $tea.Model {
  // 合同编号
  /**
   * @example
   * 91234500123400000R
   */
  contractNo: string;
  // 借据号
  /**
   * @example
   * 91234500123400000R
   */
  loanNo: string;
  // 贷款金额
  /**
   * @example
   * 25.34
   */
  loanamt: string;
  // 实时借据状态
  /**
   * @example
   * 1
   */
  loanStatus: string;
  // 总期次
  /**
   * @example
   * 25
   */
  totalNum: string;
  // 还款方式
  /**
   * @example
   * 1
   */
  repayType?: string;
  // 应还总金额
  /**
   * @example
   * 25.34
   */
  repayAmount?: string;
  // 实还总金额
  /**
   * @example
   * 2.34
   */
  actualSum?: string;
  // 这笔借据所在期次的还款日。格式:yyyy/MM/dd
  /**
   * @example
   * 2023/05/01
   */
  duedate?: string;
  // 实还日期 格式:yyyy/MM/dd
  /**
   * @example
   * 2023/05/01
   */
  actualpayDate?: string;
  // 应还本金 单位:元,格式:数字,小数点后两位
  /**
   * @example
   * 1.23
   */
  corpus?: string;
  // 实还本金 单位:元,格式:数字,小数点后两位
  /**
   * @example
   * 1.23
   */
  actualPayprincipalAmt?: string;
  // 应还利息 单位:元,格式:数字,小数点后两位
  /**
   * @example
   * 1.23
   */
  interest?: string;
  // 实还利息 单位:元,格式:数字,小数点后两位
  /**
   * @example
   * 1.23
   */
  actualPayinterestAmt?: string;
  // 应还罚息 单位:元,格式:数字,小数点后两位
  /**
   * @example
   * 1.23
   */
  payPrincipalPenaltyAmt?: string;
  // 实还罚息 单位:元,格式:数字,小数点后两位
  /**
   * @example
   * 1.23
   */
  actualPayprincipalPenaltyAmt?: string;
  // 应还复利 单位:元,格式:数字,小数点后两位
  /**
   * @example
   * 1.23
   */
  payInterestPenaltyAmt?: string;
  // 实还复利 单位:元,格式:数字,小数点后两位
  /**
   * @example
   * 1.23
   */
  actualPayinterestPenaltyAmt?: string;
  // 应还贴息利息 单位:元,格式:数字,小数点后两位
  /**
   * @example
   * 1.23
   */
  paySplitinterestAmt?: string;
  // 实还贴息利息 单位:元,格式:数字,小数点后两位
  /**
   * @example
   * 1.23
   */
  actualPaysplitinterestAmt?: string;
  // 币种
  /**
   * @example
   * RMB
   */
  currency?: string;
  // 还款期次 这笔还款对应期次。单位:整数
  /**
   * @example
   * 25
   */
  repaymentNum?: string;
  // 优惠金额 单位:元,格式:数字,小数点后两位
  /**
   * @example
   * 1.23
   */
  reduceAmt?: string;
  // 还款类型
  /**
   * @example
   * 1
   */
  billType?: string;
  // 流水号
  /**
   * @example
   * PANO124414515555
   */
  transactionNo: string;
  // 还款交易流水号 若为还款，则与还款通知流水保持一致
  /**
   * @example
   * PANO124414515555
   */
  transactionSerialno: string;
  // 是否附言还款
  /**
   * @example
   * 1
   */
  remark?: string;
  static names(): { [key: string]: string } {
    return {
      contractNo: 'contract_no',
      loanNo: 'loan_no',
      loanamt: 'loanamt',
      loanStatus: 'loan_status',
      totalNum: 'total_num',
      repayType: 'repay_type',
      repayAmount: 'repay_amount',
      actualSum: 'actual_sum',
      duedate: 'duedate',
      actualpayDate: 'actualpay_date',
      corpus: 'corpus',
      actualPayprincipalAmt: 'actual_payprincipal_amt',
      interest: 'interest',
      actualPayinterestAmt: 'actual_payinterest_amt',
      payPrincipalPenaltyAmt: 'pay_principal_penalty_amt',
      actualPayprincipalPenaltyAmt: 'actual_payprincipal_penalty_amt',
      payInterestPenaltyAmt: 'pay_interest_penalty_amt',
      actualPayinterestPenaltyAmt: 'actual_payinterest_penalty_amt',
      paySplitinterestAmt: 'pay_splitinterest_amt',
      actualPaysplitinterestAmt: 'actual_paysplitinterest_amt',
      currency: 'currency',
      repaymentNum: 'repayment_num',
      reduceAmt: 'reduce_amt',
      billType: 'bill_type',
      transactionNo: 'transaction_no',
      transactionSerialno: 'transaction_serialno',
      remark: 'remark',
    };
  }

  static types(): { [key: string]: any } {
    return {
      contractNo: 'string',
      loanNo: 'string',
      loanamt: 'string',
      loanStatus: 'string',
      totalNum: 'string',
      repayType: 'string',
      repayAmount: 'string',
      actualSum: 'string',
      duedate: 'string',
      actualpayDate: 'string',
      corpus: 'string',
      actualPayprincipalAmt: 'string',
      interest: 'string',
      actualPayinterestAmt: 'string',
      payPrincipalPenaltyAmt: 'string',
      actualPayprincipalPenaltyAmt: 'string',
      payInterestPenaltyAmt: 'string',
      actualPayinterestPenaltyAmt: 'string',
      paySplitinterestAmt: 'string',
      actualPaysplitinterestAmt: 'string',
      currency: 'string',
      repaymentNum: 'string',
      reduceAmt: 'string',
      billType: 'string',
      transactionNo: 'string',
      transactionSerialno: 'string',
      remark: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 流量方还款计划通知Object
export class RepayPlanNotifyItem extends $tea.Model {
  // 当前期数
  /**
   * @example
   * 1
   */
  loanTerm: number;
  // 应还日，yyyy-MM-dd
  /**
   * @example
   * yyyy-MM-dd
   */
  expectRepayDate: string;
  // 应还总额(元)
  /**
   * @example
   * 1999.98
   */
  expectRepayAmount: number;
  // 应还本金(元)
  /**
   * @example
   * 1999.98
   */
  expectRepayPrincipal: number;
  // 应还利息(元)
  /**
   * @example
   * 1999.98
   */
  expectRepayInterest: number;
  // 应还担保费(元)
  /**
   * @example
   * 1999.98
   */
  expectRepayGuarantee?: number;
  // 起息日，格式 YYYY-MM-DD
  /**
   * @example
   * yyyy-MM-dd
   */
  interestStartDate?: string;
  // 实还总额(元)，如未还则传0
  /**
   * @example
   * 1999.98
   */
  repayAmount?: number;
  // 已还本金(元)，如未还则传0
  /**
   * @example
   * 1999.98
   */
  repaidPrincipal?: number;
  // 已还利息(元)，如未还则传0
  /**
   * @example
   * 1999.98
   */
  repaidInterest?: number;
  // 应还罚息(元)，
  /**
   * @example
   * 1999.98
   */
  expectRepayMuclt?: number;
  // 已还罚息(元)，如未还则传0
  /**
   * @example
   * 1999.98
   */
  repaidPenalty?: number;
  // 状态标志 
  // 0-正常未到期 
  // 1-正常已还清 
  // 2-逾期
  /**
   * @example
   * 0
   */
  scheduleStatus?: string;
  static names(): { [key: string]: string } {
    return {
      loanTerm: 'loan_term',
      expectRepayDate: 'expect_repay_date',
      expectRepayAmount: 'expect_repay_amount',
      expectRepayPrincipal: 'expect_repay_principal',
      expectRepayInterest: 'expect_repay_interest',
      expectRepayGuarantee: 'expect_repay_guarantee',
      interestStartDate: 'interest_start_date',
      repayAmount: 'repay_amount',
      repaidPrincipal: 'repaid_principal',
      repaidInterest: 'repaid_interest',
      expectRepayMuclt: 'expect_repay_muclt',
      repaidPenalty: 'repaid_penalty',
      scheduleStatus: 'schedule_status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      loanTerm: 'number',
      expectRepayDate: 'string',
      expectRepayAmount: 'number',
      expectRepayPrincipal: 'number',
      expectRepayInterest: 'number',
      expectRepayGuarantee: 'number',
      interestStartDate: 'string',
      repayAmount: 'number',
      repaidPrincipal: 'number',
      repaidInterest: 'number',
      expectRepayMuclt: 'number',
      repaidPenalty: 'number',
      scheduleStatus: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 天枢系统-二级商户交易退款查询结果-分期付
export class TradeRefundResult extends $tea.Model {
  // 退款请求编号
  /**
   * @example
   * 20880002000001
   */
  requestNo: string;
  // 退款金额
  /**
   * @example
   * 30
   */
  refundAmount: number;
  // 退款原因
  /**
   * @example
   * 不想要了
   */
  refundReason: string;
  // 退款状态
  /**
   * @example
   * REFUND_SUCCESS
   */
  refundStatus: string;
  // 退款失败原因
  /**
   * @example
   * 参数异常
   */
  refundFailReason: string;
  static names(): { [key: string]: string } {
    return {
      requestNo: 'request_no',
      refundAmount: 'refund_amount',
      refundReason: 'refund_reason',
      refundStatus: 'refund_status',
      refundFailReason: 'refund_fail_reason',
    };
  }

  static types(): { [key: string]: any } {
    return {
      requestNo: 'string',
      refundAmount: 'number',
      refundReason: 'string',
      refundStatus: 'string',
      refundFailReason: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 企业影响人数性别分布统计
export class RtopGenderDistribution extends $tea.Model {
  // 统计值
  /**
   * @example
   * 10
   */
  count: number;
  // 性别
  /**
   * @example
   * MALE
   */
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

// 天枢-电商-额度返回
export class DubheEcQuota extends $tea.Model {
  // 交易流水号,与上面的交易流水号一致
  /**
   * @example
   * JJBH136433239635646977
   */
  transactionNo: string;
  // 业务状态同步接口中，客户签约成功后的合同编号，在后续查询类接口都需要使用。
  /**
   * @example
   * CONT20230213000000146577
   */
  contractNo: string;
  // 客户对应合同的总额度，单位：元，格式：数字，小数点后两位。
  /**
   * @example
   * 1
   */
  amt: number;
  // 客户对应合同的可用额度，单位：元，格式：数字，小数点后两位
  /**
   * @example
   * 1
   */
  availCreditAmt: number;
  // 客户对应合同的已用额度，单位：元，格式：数字，小数点后两位
  /**
   * @example
   * 1.01
   */
  engrossAmt: number;
  // 合同目前的额度状态 
  /**
   * @example
   * 1
   */
  creditStatus: string;
  // 授信开始时间  格式: yyyy/MM/dd。额度有效时返回
  /**
   * @example
   * 2023/02/01
   */
  contractEffectDate?: string;
  // 授信结束时间 格式:yyyy/MM/dd。额度有效时返回
  /**
   * @example
   * 2023/05/01
   */
  maturityDate?: string;
  static names(): { [key: string]: string } {
    return {
      transactionNo: 'transaction_no',
      contractNo: 'contract_no',
      amt: 'amt',
      availCreditAmt: 'avail_credit_amt',
      engrossAmt: 'engross_amt',
      creditStatus: 'credit_status',
      contractEffectDate: 'contract_effect_date',
      maturityDate: 'maturity_date',
    };
  }

  static types(): { [key: string]: any } {
    return {
      transactionNo: 'string',
      contractNo: 'string',
      amt: 'number',
      availCreditAmt: 'number',
      engrossAmt: 'number',
      creditStatus: 'string',
      contractEffectDate: 'string',
      maturityDate: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 卡短解析服务返回参数
export class ShortUrlInfo extends $tea.Model {
  // 支持卡片短信的手机号
  /**
   * @example
   * 15012345678
   */
  mobile: string;
  // 解析生成的短链
  /**
   * @example
   * https://www.alipay.com/F49v0ifM
   */
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
  /**
   * @example
   * true, false
   */
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
  /**
   * @example
   * xxxx
   */
  bizOrderNo: string;
  // 订单[分期]金额，单位：元
  /**
   * @example
   * 199.88
   */
  tradeAmount: string;
  // 订单分期金额，单位：元
  /**
   * @example
   * 188.88
   */
  installmentAmount?: string;
  // 首付金额，单位：元
  /**
   * @example
   * 199.00
   */
  downPayment?: string;
  // pad设备提供
  /**
   * @example
   * xxx
   */
  wifiMac?: string;
  // pad-经度
  /**
   * @example
   * xxxx
   */
  longitude?: string;
  // pad-纬度
  /**
   * @example
   * xxx
   */
  latitude?: string;
  // 车辆类型（摩托车）：1-新车、0-二手车
  /**
   * @example
   * 0
   */
  vehicleType?: string;
  // SN码/中控号(授信后放款前)
  /**
   * @example
   * xxx
   */
  sn?: string;
  // 车驾号(授信后放款前)
  /**
   * @example
   * xxx
   */
  frameNo?: string;
  // SKU ID
  /**
   * @example
   * xxxx
   */
  sku: string;
  // 颜色
  /**
   * @example
   * xxxx
   */
  color?: string;
  // 车型关键词
  /**
   * @example
   * xxx
   */
  modelKeyword?: string;
  // 续航里程
  /**
   * @example
   * 1024
   */
  range?: string;
  // 新车指导价，单位：元
  /**
   * @example
   * 199.88
   */
  guidePrice: string;
  // 售价，单位：元
  /**
   * @example
   * 1999.98
   */
  sellingPrice: string;
  // 品牌
  /**
   * @example
   * xxxx
   */
  brand?: string;
  // 车型
  /**
   * @example
   * xxxx
   */
  model?: string;
  // 年款，yyyy
  /**
   * @example
   * yyyy
   */
  modelYear?: string;
  // 公里数，Odometer
  /**
   * @example
   * xxxx
   */
  odo?: string;
  // 首次上牌时间
  /**
   * @example
   * xxxx
   */
  firstRegDate?: string;
  // 过户次数，Ownership Transfer Records
  /**
   * @example
   * xxxx
   */
  otr?: string;
  // 配件信息
  /**
   * @example
   * xxxx
   */
  parts?: string;
  static names(): { [key: string]: string } {
    return {
      bizOrderNo: 'biz_order_no',
      tradeAmount: 'trade_amount',
      installmentAmount: 'installment_amount',
      downPayment: 'down_payment',
      wifiMac: 'wifi_mac',
      longitude: 'longitude',
      latitude: 'latitude',
      vehicleType: 'vehicle_type',
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
      longitude: 'string',
      latitude: 'string',
      vehicleType: 'string',
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
  /**
   * @example
   * 1
   */
  id: string;
  // 产品编码
  /**
   * @example
   * 13
   */
  serviceName: string;
  // 区域编码
  /**
   * @example
   * SJ_ALL
   */
  serviceZone?: string;
  // 渠道
  /**
   * @example
   * HZSZKJ
   */
  channel?: string;
  // 决策租户
  /**
   * @example
   * DEFAULT
   */
  decisionTenant?: string;
  // 是否启用
  /**
   * @example
   * enabled
   */
  status?: string;
  // 创建时间，格式:yyyy-MM-dd HH:mm:ss
  /**
   * @example
   * 创建时间，格式:yyyy-MM-dd HH:mm:ss
   */
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
  /**
   * @example
   * 10.214.138.14
   */
  clientIp?: string;
  // 客户端UMID
  /**
   * @example
   * WV1bz5927da956db072d3001792dcc67e
   */
  clientPcidguid?: string;
  // 服务器名
  /**
   * @example
   * server
   */
  serverName?: string;
  // 会话ID
  /**
   * @example
   * RZ1 2cz9oSg1GTGtGp9CwYtBbZMcD8DmobilecashierRZ12
   */
  sessionId?: string;
  // 用户ID
  /**
   * @example
   * 2088522384403582
   */
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

// 天枢-电商-授信查询
export class EcCreditQuery extends $tea.Model {
  // 外部申请编号
  /**
   * @example
   * SQ202301291615023
   */
  thirdApplyNo?: string;
  // 银行审批流水号
  /**
   * @example
   * APPL20200826000000250721
   */
  applyNo?: string;
  // 业务审批状态
  /**
   * @example
   * APPROVING
   */
  applyStatus: string;
  // 合同编号
  /**
   * @example
   * CONT20230314000000143225
   */
  contractNo?: string;
  // 授信开始时间 格式yyyyMMdd
  /**
   * @example
   * 20221010
   */
  amountStartDate?: string;
  // 授信结束时间 yyyyMMdd
  /**
   * @example
   * 20231010
   */
  amountEndDate?: string;
  // 审批金额
  /**
   * @example
   * 5000000.00
   */
  approveAmount?: string;
  // 否决原因
  /**
   * @example
   * 审批否决
   */
  denyReason?: string;
  // 提还款账号
  /**
   * @example
   * 6230580199590683459
   */
  bankCardNo?: string;
  // 提还款账号联行号
  /**
   * @example
   * 307331002509
   */
  bankCardBranchCode?: string;
  // 账号开户行行名称
  /**
   * @example
   * 平安银行杭州分行
   */
  publicAccountBankname?: string;
  // 审批通过时间 审批通过必填(格式: yyyy-MM-dd HH:mm:ss)
  /**
   * @example
   * 2023-05-01 01:01:01
   */
  approveTime?: string;
  static names(): { [key: string]: string } {
    return {
      thirdApplyNo: 'third_apply_no',
      applyNo: 'apply_no',
      applyStatus: 'apply_status',
      contractNo: 'contract_no',
      amountStartDate: 'amount_start_date',
      amountEndDate: 'amount_end_date',
      approveAmount: 'approve_amount',
      denyReason: 'deny_reason',
      bankCardNo: 'bank_card_no',
      bankCardBranchCode: 'bank_card_branch_code',
      publicAccountBankname: 'public_account_bankname',
      approveTime: 'approve_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      thirdApplyNo: 'string',
      applyNo: 'string',
      applyStatus: 'string',
      contractNo: 'string',
      amountStartDate: 'string',
      amountEndDate: 'string',
      approveAmount: 'string',
      denyReason: 'string',
      bankCardNo: 'string',
      bankCardBranchCode: 'string',
      publicAccountBankname: 'string',
      approveTime: 'string',
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
  /**
   * @example
   * {"f_01":"95.0"}
   */
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
  /**
   * @example
   * 福州北辰智创投资中心
   */
  companyName: string;
  // 企业对应的舆情数量
  /**
   * @example
   * 10
   */
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
  /**
   * @example
   * 某店铺
   */
  name: string;
  // 店铺id
  /**
   * @example
   * 2022091300001
   */
  id: string;
  // 0:成功
  // 1:失败
  // 2:处理中
  /**
   * @example
   * 0
   */
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
  /**
   * @example
   * 10
   */
  count: number;
  // 地区
  /**
   * @example
   * ​西湖区
   */
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
  /**
   * @example
   * 0
   */
  status: string;
  // 用信申请订单号
  /**
   * @example
   * 123123
   */
  relationNo?: string;
  // 结清证明url
  /**
   * @example
   * https://www.example.com/ffff.pdf?expire=111111
   */
  certificateUrl?: string;
  // 结清证明文件Base64
  /**
   * @example
   * BEAKENMCT...
   */
  certificateBase64?: string;
  // 说明
  /**
   * @example
   * 已开具
   */
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

// 机构侧最高可用额度
export class FundInfo extends $tea.Model {
  // 资金方编号
  /**
   * @example
   * D20250701000000001
   */
  fundCode: string;
  // 资金方简称
  /**
   * @example
   * 科融
   */
  abbreFundName: string;
  // 额度状态
  /**
   * @example
   * 0
   */
  creditStatus: string;
  // 授信总额度
  /**
   * @example
   * 200000
   */
  creditAmount?: string;
  // 剩余可用余额
  /**
   * @example
   * 200000
   */
  restAmount?: string;
  // 年利率
  /**
   * @example
   * 0.1250
   */
  yearInterestRate?: string;
  static names(): { [key: string]: string } {
    return {
      fundCode: 'fund_code',
      abbreFundName: 'abbre_fund_name',
      creditStatus: 'credit_status',
      creditAmount: 'credit_amount',
      restAmount: 'rest_amount',
      yearInterestRate: 'year_interest_rate',
    };
  }

  static types(): { [key: string]: any } {
    return {
      fundCode: 'string',
      abbreFundName: 'string',
      creditStatus: 'string',
      creditAmount: 'string',
      restAmount: 'string',
      yearInterestRate: 'string',
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
  /**
   * @example
   * 工商风险维度
   */
  featureName: string;
  // 特征​分数
  /**
   * @example
   * 10
   */
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
  /**
   * @example
   * 1032
   */
  decisionPlanId: string;
  // 离线圈客执行任务状态
  /**
   * @example
   * ECN
   */
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

// 批量样本三要素
export class Item extends $tea.Model {
  // 样本唯一id
  /**
   * @example
   * 7ef15c83-57b4-4932-9180-35b11b102075
   */
  sampleId: string;
  // 小写加密身份证（身份证如果有X，要大写再生成MD5）
  /**
   * @example
   * 51db170b113f8c57533ae28605f2b76b
   */
  certNo: string;
  // 手机号加密
  /**
   * @example
   * 077e5fc68135bd8e8223a094029d4cee
   */
  mobile: string;
  // 回溯日期（yyyyMMdd格式）
  /**
   * @example
   * 20260620
   */
  sampleBackDate?: string;
  static names(): { [key: string]: string } {
    return {
      sampleId: 'sample_id',
      certNo: 'cert_no',
      mobile: 'mobile',
      sampleBackDate: 'sample_back_date',
    };
  }

  static types(): { [key: string]: any } {
    return {
      sampleId: 'string',
      certNo: 'string',
      mobile: 'string',
      sampleBackDate: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 用户分层信息
export class UserClassifyInfo extends $tea.Model {
  // 版本号
  /**
   * @example
   * V1
   */
  version: string;
  // 流量分层
  /**
   * @example
   * A: <6% B: 6%~12% C:12%~18% D:18%~24% E:24%~36% F:>36% R:不分发（黑名单类）
   */
  rateClassify: string;
  // 流量扩展分层1
  /**
   * @example
   * 123123
   */
  classifyExt1?: string;
  // 流量扩展分层2
  /**
   * @example
   * 123
   */
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
  /**
   * @example
   * true, false
   */
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

// 可信联系方式查询
export class CreditShieldFixContactResult extends $tea.Model {
  // 1-查得，0-未查得
  /**
   * @example
   * 1
   */
  result: string;
  // 查得手机号md5
  /**
   * @example
   * [手机号md5]
   */
  phones?: string[];
  static names(): { [key: string]: string } {
    return {
      result: 'result',
      phones: 'phones',
    };
  }

  static types(): { [key: string]: any } {
    return {
      result: 'string',
      phones: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 天枢系统专用CreditAmount结构体
export class CreditAmount extends $tea.Model {
  // 授信额度
  /**
   * @example
   * 1
   */
  creditAmount: number;
  // 授信余额
  /**
   * @example
   * 1
   */
  restAmount: number;
  // 发放日期
  payDate: string;
  // 到期日期
  expireDate: string;
  // 利率单位(1:年，2：月，3：日)
  /**
   * @example
   * 1
   */
  rateUnit: string;
  // 执行利率,利率值，单位%
  // 年化5%，rateValue=5
  // 
  rateValue: number;
  // 还款方式1等额本息2等额本金3先息后本4一次性利随本清5只还本金6等本等息
  /**
   * @example
   * 1
   */
  repayWay: string;
  // 状态0-正常 1-冻结 2-终止
  /**
   * @example
   * 0
   */
  status: string;
  // 发放日期（兼容字段）
  /**
   * @example
   * yyyy-MM-dd
   */
  payDateSup?: string;
  // 到期日期（兼容字段）
  /**
   * @example
   * yyyy-MM-dd
   */
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

// 天枢-电商-支用查询
export class EcLoanQuery extends $tea.Model {
  // 总条数
  /**
   * @example
   * 25
   */
  totalCount: string;
  // 订单数组
  loanAppls: EcLoanAppls[];
  static names(): { [key: string]: string } {
    return {
      totalCount: 'total_count',
      loanAppls: 'loan_appls',
    };
  }

  static types(): { [key: string]: any } {
    return {
      totalCount: 'string',
      loanAppls: { 'type': 'array', 'itemType': EcLoanAppls },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 风控事件咨询查询入参
export class EventInfo extends $tea.Model {
  // 事件编码
  /**
   * @example
   * face_attack_strategy
   */
  eventCode: string;
  // 事件产生时间
  /**
   * @example
   * 1686215967914
   */
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
  /**
   * @example
   * 1
   */
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
  /**
   * @example
   * 2018-10-10T10:10:00Z
   */
  repayTime: string;
  // 计息开始时间
  /**
   * @example
   * 2018-10-10T10:10:00Z
   */
  startTime: string;
  // 计息结束时间
  /**
   * @example
   * 2018-10-10T10:10:00Z
   */
  endTime: string;
  // 试算编号
  /**
   * @example
   * ss
   */
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
  /**
   * @example
   * true, false
   */
  applyFlag?: boolean;
  // 0:通过； 1:拒绝； 2:处理中；
  /**
   * @example
   * 0
   */
  status?: string;
  // 拒绝原因
  /**
   * @example
   * xxxxxxxx
   */
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
  /**
   * @example
   * 1
   */
  sceneStrategyId: number;
  // 营销名称
  /**
   * @example
   * 蚂蚁营销
   */
  sceneStrategyName: string;
  // 营销状态
  /**
   * @example
   * PASS
   */
  sceneStrategyStatus: string;
  // 渠道id
  /**
   * @example
   * 3
   */
  actionDriverCode: number;
  // 渠道类型
  /**
   * @example
   * ROBOT_CALL
   */
  channelCode: string;
  // 创建时间
  /**
   * @example
   * 2018-10-10T10:10:00Z
   */
  gmtCreate: string;
  // 修改时间
  gmtModified: string;
  // 场景策略入参名
  actionParamInfo?: string[];
  // 参数查询是否完成
  /**
   * @example
   * true, false
   */
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

export class PushRiskplusTdiaiworkshopcloudTestRequest extends $tea.Model {
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

export class PushRiskplusTdiaiworkshopcloudTestResponse extends $tea.Model {
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

export class QueryRiskplusTdiaiworkshopcloudBatchRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 商品码（事件码）蚂蚁侧提供
  eventCode: string;
  // 产品code
  dispModelCode: string;
  // 要查询的dataIdList
  queryDataIdList: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      eventCode: 'event_code',
      dispModelCode: 'disp_model_code',
      queryDataIdList: 'query_data_id_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      eventCode: 'string',
      dispModelCode: 'string',
      queryDataIdList: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRiskplusTdiaiworkshopcloudBatchResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 样本回溯结果
  sampleResult?: ResultItem[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      sampleResult: 'sample_result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      sampleResult: { 'type': 'array', 'itemType': ResultItem },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushRiskplusTdiaiworkshopcloudBatchRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 商品码（事件码）
  eventCode: string;
  // 产品码
  dispModelCode: string;
  // 业务码
  businessType: string;
  // 加密方式
  hashType: string;
  // 请求唯一id，幂等设计
  requestId: string;
  // 样本结构体
  sampleList: Item[];
  // 回溯日期
  backDate?: string;
  // 回调地址
  callbackUrl?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      eventCode: 'event_code',
      dispModelCode: 'disp_model_code',
      businessType: 'business_type',
      hashType: 'hash_type',
      requestId: 'request_id',
      sampleList: 'sample_list',
      backDate: 'back_date',
      callbackUrl: 'callback_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      eventCode: 'string',
      dispModelCode: 'string',
      businessType: 'string',
      hashType: 'string',
      requestId: 'string',
      sampleList: { 'type': 'array', 'itemType': Item },
      backDate: 'string',
      callbackUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushRiskplusTdiaiworkshopcloudBatchResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 批量请求响应结果
  sampleIdList?: ResItem[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      sampleIdList: 'sample_id_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      sampleIdList: { 'type': 'array', 'itemType': ResItem },
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
          sdk_version: "1.0.3",
          _prod_code: "FRISKDESCION",
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
   * @remarks
   * Description: 接口创建测试
   * Summary: 接口创建测试
   */
  async pushRiskplusTdiaiworkshopcloudTest(request: PushRiskplusTdiaiworkshopcloudTestRequest): Promise<PushRiskplusTdiaiworkshopcloudTestResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pushRiskplusTdiaiworkshopcloudTestEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 接口创建测试
   * Summary: 接口创建测试
   */
  async pushRiskplusTdiaiworkshopcloudTestEx(request: PushRiskplusTdiaiworkshopcloudTestRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PushRiskplusTdiaiworkshopcloudTestResponse> {
    Util.validateModel(request);
    return $tea.cast<PushRiskplusTdiaiworkshopcloudTestResponse>(await this.doRequest("1.0", "riskplus.tdiaiworkshopcloud.test.push", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PushRiskplusTdiaiworkshopcloudTestResponse({}));
  }

  /**
   * @remarks
   * Description: 风控离线批量样本数据查询接口
   * Summary: 风控离线批量样本数据查询接口
   */
  async queryRiskplusTdiaiworkshopcloudBatch(request: QueryRiskplusTdiaiworkshopcloudBatchRequest): Promise<QueryRiskplusTdiaiworkshopcloudBatchResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryRiskplusTdiaiworkshopcloudBatchEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 风控离线批量样本数据查询接口
   * Summary: 风控离线批量样本数据查询接口
   */
  async queryRiskplusTdiaiworkshopcloudBatchEx(request: QueryRiskplusTdiaiworkshopcloudBatchRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryRiskplusTdiaiworkshopcloudBatchResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryRiskplusTdiaiworkshopcloudBatchResponse>(await this.doRequest("1.0", "riskplus.tdiaiworkshopcloud.batch.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryRiskplusTdiaiworkshopcloudBatchResponse({}));
  }

  /**
   * @remarks
   * Description: 风控离线批量样本数据上传接口
   * Summary: 风控离线批量样本数据上传接口
   */
  async pushRiskplusTdiaiworkshopcloudBatch(request: PushRiskplusTdiaiworkshopcloudBatchRequest): Promise<PushRiskplusTdiaiworkshopcloudBatchResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pushRiskplusTdiaiworkshopcloudBatchEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 风控离线批量样本数据上传接口
   * Summary: 风控离线批量样本数据上传接口
   */
  async pushRiskplusTdiaiworkshopcloudBatchEx(request: PushRiskplusTdiaiworkshopcloudBatchRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PushRiskplusTdiaiworkshopcloudBatchResponse> {
    Util.validateModel(request);
    return $tea.cast<PushRiskplusTdiaiworkshopcloudBatchResponse>(await this.doRequest("1.0", "riskplus.tdiaiworkshopcloud.batch.push", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PushRiskplusTdiaiworkshopcloudBatchResponse({}));
  }

}
