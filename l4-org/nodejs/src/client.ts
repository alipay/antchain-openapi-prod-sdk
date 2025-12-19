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

// 权益智能体任务步骤对象
export class AgentTaskStepData extends $tea.Model {
  // 步骤id
  stepId: string;
  // 步骤名称
  stepName: string;
  //  PENDING,  RUNNING,COMPLETED,TERMINATED,FAILED
  status: string;
  // 更新时间
  updateTime: string;
  // 关联的消息id
  messageId: string;
  // 关联的异步任务id
  jobId: string;
  // 异步任务结果
  result: string;
  // 异步任务已读标识
  messageFlag: boolean;
  static names(): { [key: string]: string } {
    return {
      stepId: 'step_id',
      stepName: 'step_name',
      status: 'status',
      updateTime: 'update_time',
      messageId: 'message_id',
      jobId: 'job_id',
      result: 'result',
      messageFlag: 'message_flag',
    };
  }

  static types(): { [key: string]: any } {
    return {
      stepId: 'string',
      stepName: 'string',
      status: 'string',
      updateTime: 'string',
      messageId: 'string',
      jobId: 'string',
      result: 'string',
      messageFlag: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 权益智能体任务对象
export class AgentTaskData extends $tea.Model {
  // 任务名称
  taskName: string;
  // 任务类型
  taskType: string;
  // 任务状态
  taskStatus: string;
  // 是否有未读的消息
  messageFlag: boolean;
  // 最后更新时间
  updateTime: string;
  // 单步骤任务直接关联消息id
  messageId: string;
  // 附加信息
  extInfo: string;
  // 任务步骤列表
  stepList: AgentTaskStepData[];
  static names(): { [key: string]: string } {
    return {
      taskName: 'task_name',
      taskType: 'task_type',
      taskStatus: 'task_status',
      messageFlag: 'message_flag',
      updateTime: 'update_time',
      messageId: 'message_id',
      extInfo: 'ext_info',
      stepList: 'step_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      taskName: 'string',
      taskType: 'string',
      taskStatus: 'string',
      messageFlag: 'boolean',
      updateTime: 'string',
      messageId: 'string',
      extInfo: 'string',
      stepList: { 'type': 'array', 'itemType': AgentTaskStepData },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 权益智能体对话对象
export class AgentChatData extends $tea.Model {
  // 会话id	
  // 
  sessionId: string;
  // 消息id	
  // 
  messageId: string;
  // 是否已完成
  finished: boolean;
  // text: 文本 mage: 图片 stream：流式文本
  contentType: string;
  // 内容
  content: string;
  static names(): { [key: string]: string } {
    return {
      sessionId: 'session_id',
      messageId: 'message_id',
      finished: 'finished',
      contentType: 'content_type',
      content: 'content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      sessionId: 'string',
      messageId: 'string',
      finished: 'boolean',
      contentType: 'string',
      content: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 子指标结构体
export class SubMetricData extends $tea.Model {
  // 日期
  date: string;
  // 指标类型:OPERATING_INCOME, REPAY_AMOUNT, REPAY_NUMBER, REPAY_USER_NUMBER, REPAY_AVG_AMOUNT, ALI_DST_AMT,OPERATING_COST, GROSS_PROFIT_MARGIN,VOUCHER_CONVERSION, USER_CONVERSION
  type: string;
  // 指标值
  value: string;
  static names(): { [key: string]: string } {
    return {
      date: 'date',
      type: 'type',
      value: 'value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      date: 'string',
      type: 'string',
      value: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 交易区间数据
export class TradeRangeData extends $tea.Model {
  // 区间开始
  start: string;
  // 区间结束
  end: string;
  // 区间内统计值
  value: number;
  // 百分比
  rate: string;
  static names(): { [key: string]: string } {
    return {
      start: 'start',
      end: 'end',
      value: 'value',
      rate: 'rate',
    };
  }

  static types(): { [key: string]: any } {
    return {
      start: 'string',
      end: 'string',
      value: 'number',
      rate: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 机构趋势数据
export class OrgTrendData extends $tea.Model {
  // 日期
  date: string;
  // 还款金额
  repaymentAmt: string;
  // 预算金额
  budgetAmt: string;
  // 交易金额
  tradeAmt: string;
  static names(): { [key: string]: string } {
    return {
      date: 'date',
      repaymentAmt: 'repayment_amt',
      budgetAmt: 'budget_amt',
      tradeAmt: 'trade_amt',
    };
  }

  static types(): { [key: string]: any } {
    return {
      date: 'string',
      repaymentAmt: 'string',
      budgetAmt: 'string',
      tradeAmt: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 查询数据统计指标结果
export class MetricData extends $tea.Model {
  // 租户指标: OPERATING_INCOME, REPAY_AMOUNT, REPAY_NUMBER, REPAY_USER_NUMBER, REPAY_AVG_AMOUNT, ALI_DST_AMT
  type: string;
  // 指标值
  total: string;
  // 子指标列表
  subList: SubMetricData[];
  static names(): { [key: string]: string } {
    return {
      type: 'type',
      total: 'total',
      subList: 'sub_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      type: 'string',
      total: 'string',
      subList: { 'type': 'array', 'itemType': SubMetricData },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 转化统计数据
export class ConversionData extends $tea.Model {
  // 渠道
  channel: string;
  // 投放人数
  sendCnt: number;
  // 核销人数
  useCnt: number;
  // 核销率
  useRate: string;
  static names(): { [key: string]: string } {
    return {
      channel: 'channel',
      sendCnt: 'send_cnt',
      useCnt: 'use_cnt',
      useRate: 'use_rate',
    };
  }

  static types(): { [key: string]: any } {
    return {
      channel: 'string',
      sendCnt: 'number',
      useCnt: 'number',
      useRate: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 还款回调结果数据
export class RepayCallBackResData extends $tea.Model {
  // 状态
  status: boolean;
  static names(): { [key: string]: string } {
    return {
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      status: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 权益智能体会话消息对象
export class AgentSessionMessageData extends $tea.Model {
  // 会话id
  sessionId: string;
  // 消息编号
  messageId: string;
  // 创建时间
  gmtCreate: string;
  // 对话请求内容
  request: string;
  // 对话响应内容
  response: string;
  // 对话状态
  status: string;
  // 会话结果(错误)信息
  resultMsg: string;
  // 卡片编辑的业务数据
  customData: string;
  // 卡片编辑后的内容
  customResponse: string;
  // 是否可编辑
  editable: boolean;
  static names(): { [key: string]: string } {
    return {
      sessionId: 'session_id',
      messageId: 'message_id',
      gmtCreate: 'gmt_create',
      request: 'request',
      response: 'response',
      status: 'status',
      resultMsg: 'result_msg',
      customData: 'custom_data',
      customResponse: 'custom_response',
      editable: 'editable',
    };
  }

  static types(): { [key: string]: any } {
    return {
      sessionId: 'string',
      messageId: 'string',
      gmtCreate: 'string',
      request: 'string',
      response: 'string',
      status: 'string',
      resultMsg: 'string',
      customData: 'string',
      customResponse: 'string',
      editable: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 过程转化指标结果
export class ProcessConversionMetricData extends $tea.Model {
  // 发放数
  send: number;
  // 核销数
  used: number;
  // 核销转化率
  rate: string;
  static names(): { [key: string]: string } {
    return {
      send: 'send',
      used: 'used',
      rate: 'rate',
    };
  }

  static types(): { [key: string]: any } {
    return {
      send: 'number',
      used: 'number',
      rate: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 权益智能体会话对象
export class AgentSessionData extends $tea.Model {
  // 会话id
  sessionId: string;
  // 会话标题
  title: string;
  // 创建时间
  gmtCreated: string;
  // VALID("生效"),INVALID("失效"),RUNNING("进行中"),FAILED("失败"),TERMINATED("已终止"), COMPLETED("已完成");
  status: string;
  // 任务列表
  taskList?: AgentTaskData[];
  static names(): { [key: string]: string } {
    return {
      sessionId: 'session_id',
      title: 'title',
      gmtCreated: 'gmt_created',
      status: 'status',
      taskList: 'task_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      sessionId: 'string',
      title: 'string',
      gmtCreated: 'string',
      status: 'string',
      taskList: { 'type': 'array', 'itemType': AgentTaskData },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 人群信息
export class CrowdStrategyData extends $tea.Model {
  // 人群编码
  strategyCode: string;
  // 人群名称
  strategyName: string;
  // 状态
  status: string;
  // 人群数量
  strategyCount: number;
  // 用户数量
  userCount: number;
  // 机构名称
  instName?: string;
  // 日期
  gmtCreate: string;
  static names(): { [key: string]: string } {
    return {
      strategyCode: 'strategy_code',
      strategyName: 'strategy_name',
      status: 'status',
      strategyCount: 'strategy_count',
      userCount: 'user_count',
      instName: 'inst_name',
      gmtCreate: 'gmt_create',
    };
  }

  static types(): { [key: string]: any } {
    return {
      strategyCode: 'string',
      strategyName: 'string',
      status: 'string',
      strategyCount: 'number',
      userCount: 'number',
      instName: 'string',
      gmtCreate: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 券信息
export class VoucherInfo extends $tea.Model {
  // 券id
  voucherId: string;
  // 2088id
  userId: string;
  // 产品编码
  productCode: string;
  // 资产编码
  assetsCode: string;
  // 券名称
  name: string;
  // 券模板ID
  templateId: string;
  // 发行人id
  publisherUserId: string;
  // 状态
  status: string;
  // 券生效时间
  gmtActive: string;
  // 券失效时间
  gmtExpired: string;
  // 展期
  gmtExtend: string;
  // 面额
  totalAmount: string;
  // 门槛金额
  floorAmount: string;
  // 总次数
  totalCount: number;
  // 可用次数
  availableCount: number;
  // 已使用次数
  usedCount: number;
  // 券描述
  voucherDescription: string;
  // 券模板扩展信息
  extendTemplateInfo: string;
  // 扩展信息
  extendInfo: string;
  // 创建时间
  gmtCreate: string;
  // 修改时间
  gmtModified: string;
  // 业务类型
  bizCode: string;
  // 收银台展示分组
  groupCode: string;
  // 收银台展示分组名称
  groupCodeName: string;
  static names(): { [key: string]: string } {
    return {
      voucherId: 'voucher_id',
      userId: 'user_id',
      productCode: 'product_code',
      assetsCode: 'assets_code',
      name: 'name',
      templateId: 'template_id',
      publisherUserId: 'publisher_user_id',
      status: 'status',
      gmtActive: 'gmt_active',
      gmtExpired: 'gmt_expired',
      gmtExtend: 'gmt_extend',
      totalAmount: 'total_amount',
      floorAmount: 'floor_amount',
      totalCount: 'total_count',
      availableCount: 'available_count',
      usedCount: 'used_count',
      voucherDescription: 'voucher_description',
      extendTemplateInfo: 'extend_template_info',
      extendInfo: 'extend_info',
      gmtCreate: 'gmt_create',
      gmtModified: 'gmt_modified',
      bizCode: 'biz_code',
      groupCode: 'group_code',
      groupCodeName: 'group_code_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      voucherId: 'string',
      userId: 'string',
      productCode: 'string',
      assetsCode: 'string',
      name: 'string',
      templateId: 'string',
      publisherUserId: 'string',
      status: 'string',
      gmtActive: 'string',
      gmtExpired: 'string',
      gmtExtend: 'string',
      totalAmount: 'string',
      floorAmount: 'string',
      totalCount: 'number',
      availableCount: 'number',
      usedCount: 'number',
      voucherDescription: 'string',
      extendTemplateInfo: 'string',
      extendInfo: 'string',
      gmtCreate: 'string',
      gmtModified: 'string',
      bizCode: 'string',
      groupCode: 'string',
      groupCodeName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 机构订单交易记录对象
export class OrgTradeData extends $tea.Model {
  // 平台优惠金额。单位：元。
  discountAmount: string;
  // 买家实付金额，单位为元，两位小数。
  buyerPayAmount: string;
  // 买家在支付宝的用户id
  buyerUserId: string;
  // 支付宝交易号，交易单主键id
  outTradeNo: string;
  // 支付宝订单号
  tradeNo: string;
  // 本次交易打款给卖家的时间
  sendPayDate: string;
  // 交易状态：WAIT_BUYER_PAY（交易创建，等待买家付款）、TRADE_CLOSED（未付款交易超时关闭，或支付完成后全额退款）、TRADE_SUCCESS（交易支付成功）、TRADE_FINISHED（交易结束，不可退款）
  tradeStatus: string;
  // 实收金额，单位为元，两位小数。该金额为本笔交易，商户账户能够实际收到的金额
  receiptAmount: string;
  // 交易的订单金额，单位为元，两位小数。该参数的值为支付时传入的total_amount
  totalAmount: string;
  static names(): { [key: string]: string } {
    return {
      discountAmount: 'discount_amount',
      buyerPayAmount: 'buyer_pay_amount',
      buyerUserId: 'buyer_user_id',
      outTradeNo: 'out_trade_no',
      tradeNo: 'trade_no',
      sendPayDate: 'send_pay_date',
      tradeStatus: 'trade_status',
      receiptAmount: 'receipt_amount',
      totalAmount: 'total_amount',
    };
  }

  static types(): { [key: string]: any } {
    return {
      discountAmount: 'string',
      buyerPayAmount: 'string',
      buyerUserId: 'string',
      outTradeNo: 'string',
      tradeNo: 'string',
      sendPayDate: 'string',
      tradeStatus: 'string',
      receiptAmount: 'string',
      totalAmount: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 供应商打款记录
export class PaymentRecord extends $tea.Model {
  // 云上租户id	
  cloudTenantId: string;
  // 打款金额，单位分
  paymentAmount: number;
  // 服务商名称 - 即云租户名称，比如南京飞翰
  supplierName: string;
  // 打款日期
  paymentDate: string;
  // 唯一请求id，即payment_record_id
  requestUniqueId: string;
  static names(): { [key: string]: string } {
    return {
      cloudTenantId: 'cloud_tenant_id',
      paymentAmount: 'payment_amount',
      supplierName: 'supplier_name',
      paymentDate: 'payment_date',
      requestUniqueId: 'request_unique_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      cloudTenantId: 'string',
      paymentAmount: 'number',
      supplierName: 'string',
      paymentDate: 'string',
      requestUniqueId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// agent对话客户端返回结果
export class AgentChatCustomResponse extends $tea.Model {
  // 消息id
  messageId?: string;
  // 内容
  content?: string;
  static names(): { [key: string]: string } {
    return {
      messageId: 'message_id',
      content: 'content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      messageId: 'string',
      content: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 机构总览数据
export class OrgOverviewData extends $tea.Model {
  // 预算总金额
  totalBudgetAmt: string;
  // 花呗预算金额
  huabeiBudgetAmt: string;
  // 借呗预算金额
  jiebeiBudgetAmt: string;
  // 小微预算金额
  xiaoweiBudgetAmt: string;
  // 服务费预算金额
  serviceBudgetAmt: string;
  // 总回款金额
  totalRepaymentAmt: string;
  // 花呗回款金额
  huabeiRepaymentAmt: string;
  // 借呗回款金额
  jiebeiRepaymentAmt: string;
  // 小微回款金额
  xiaoweiRepaymentAmt: string;
  // 总交易金额
  totalTradeAmt: string;
  // 花呗交易金额
  huabeiTradeAmt: string;
  // 借呗交易金额
  jiebeiTradeAmt: string;
  // 小微交易金额
  xiaoweiTradeAmt: string;
  // 内部补贴金额
  internalSubsidyAmt: string;
  // 净回款额
  totalNetRepaymentAmt: string;
  // 活动roi
  activityRoi: string;
  // 花呗roi
  huabeiRoi: string;
  // 借呗roi
  jiebeiRoi: string;
  // 小微roi
  xiaoweiRoi: string;
  static names(): { [key: string]: string } {
    return {
      totalBudgetAmt: 'total_budget_amt',
      huabeiBudgetAmt: 'huabei_budget_amt',
      jiebeiBudgetAmt: 'jiebei_budget_amt',
      xiaoweiBudgetAmt: 'xiaowei_budget_amt',
      serviceBudgetAmt: 'service_budget_amt',
      totalRepaymentAmt: 'total_repayment_amt',
      huabeiRepaymentAmt: 'huabei_repayment_amt',
      jiebeiRepaymentAmt: 'jiebei_repayment_amt',
      xiaoweiRepaymentAmt: 'xiaowei_repayment_amt',
      totalTradeAmt: 'total_trade_amt',
      huabeiTradeAmt: 'huabei_trade_amt',
      jiebeiTradeAmt: 'jiebei_trade_amt',
      xiaoweiTradeAmt: 'xiaowei_trade_amt',
      internalSubsidyAmt: 'internal_subsidy_amt',
      totalNetRepaymentAmt: 'total_net_repayment_amt',
      activityRoi: 'activity_roi',
      huabeiRoi: 'huabei_roi',
      jiebeiRoi: 'jiebei_roi',
      xiaoweiRoi: 'xiaowei_roi',
    };
  }

  static types(): { [key: string]: any } {
    return {
      totalBudgetAmt: 'string',
      huabeiBudgetAmt: 'string',
      jiebeiBudgetAmt: 'string',
      xiaoweiBudgetAmt: 'string',
      serviceBudgetAmt: 'string',
      totalRepaymentAmt: 'string',
      huabeiRepaymentAmt: 'string',
      jiebeiRepaymentAmt: 'string',
      xiaoweiRepaymentAmt: 'string',
      totalTradeAmt: 'string',
      huabeiTradeAmt: 'string',
      jiebeiTradeAmt: 'string',
      xiaoweiTradeAmt: 'string',
      internalSubsidyAmt: 'string',
      totalNetRepaymentAmt: 'string',
      activityRoi: 'string',
      huabeiRoi: 'string',
      jiebeiRoi: 'string',
      xiaoweiRoi: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 权益智能体对话返回结构体
export class AgentChatResponse extends $tea.Model {
  // 是否结束
  success: boolean;
  // 对话data数据
  data: AgentChatData;
  static names(): { [key: string]: string } {
    return {
      success: 'success',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      success: 'boolean',
      data: AgentChatData,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 券咨询业务上下文
export class VoucherConsultBusinessContext extends $tea.Model {
  // 指定资产编码列表
  assetTypeCodeList: string[];
  // 订单金额
  orderAmount: string;
  // 收款账号
  payeeUserId: string;
  // 业务上下文信息
  bizContext: string;
  static names(): { [key: string]: string } {
    return {
      assetTypeCodeList: 'asset_type_code_list',
      orderAmount: 'order_amount',
      payeeUserId: 'payee_user_id',
      bizContext: 'biz_context',
    };
  }

  static types(): { [key: string]: any } {
    return {
      assetTypeCodeList: { 'type': 'array', 'itemType': 'string' },
      orderAmount: 'string',
      payeeUserId: 'string',
      bizContext: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 支付宝交易记录
export class OrgAlipayTradeData extends $tea.Model {
  // 支付宝订单号
  alipayOrderNo: string;
  // 交易创建时间
  gmtCreate: string;
  // 交易支付时间
  gmtPay: string;
  // 交易退款时间
  gmtRefund: string;
  // 商品备注信息
  goodsMemo?: string;
  // 机构名称
  goodsTitle: string;
  // 商户订单号，创建支付宝交易时传入的信息
  merchantOrderNo: string;
  // 商家优惠金额
  netMdiscount: string;
  // 对方账户
  otherAccount: string;
  // 订单退款金额
  refundAmount: string;
  // 服务费金额
  serviceFee: string;
  // 门店名称
  storeName?: string;
  // 门店编号
  storeNo?: string;
  // 订单金额
  totalAmount: string;
  // 订单状态(待付款,成功,关闭,待发货,待确认收货,已预付,进行中)
  tradeStatus: string;
  // 业务类型，帮助商户作为对账参考
  tradeType: string;
  static names(): { [key: string]: string } {
    return {
      alipayOrderNo: 'alipay_order_no',
      gmtCreate: 'gmt_create',
      gmtPay: 'gmt_pay',
      gmtRefund: 'gmt_refund',
      goodsMemo: 'goods_memo',
      goodsTitle: 'goods_title',
      merchantOrderNo: 'merchant_order_no',
      netMdiscount: 'net_mdiscount',
      otherAccount: 'other_account',
      refundAmount: 'refund_amount',
      serviceFee: 'service_fee',
      storeName: 'store_name',
      storeNo: 'store_no',
      totalAmount: 'total_amount',
      tradeStatus: 'trade_status',
      tradeType: 'trade_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      alipayOrderNo: 'string',
      gmtCreate: 'string',
      gmtPay: 'string',
      gmtRefund: 'string',
      goodsMemo: 'string',
      goodsTitle: 'string',
      merchantOrderNo: 'string',
      netMdiscount: 'string',
      otherAccount: 'string',
      refundAmount: 'string',
      serviceFee: 'string',
      storeName: 'string',
      storeNo: 'string',
      totalAmount: 'string',
      tradeStatus: 'string',
      tradeType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 核销明细月文件
export class BenefitWriteOffMonthFileData extends $tea.Model {
  // 所属月份
  billingMonth: string;
  // AFTS 上传到文件 id
  fileFiledId: string;
  static names(): { [key: string]: string } {
    return {
      billingMonth: 'billing_month',
      fileFiledId: 'file_filed_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      billingMonth: 'string',
      fileFiledId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CallbackAntdigitalAssetOrgoperationRepayRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户id
  tenantId: string;
  // 还款编号
  repayRecordNo: string;
  // 还款处理状态
  status: string;
  // 额外的信息
  extInfo?: string;
  // 请求唯一id，最长32字符	
  // 
  requestUniqueId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      repayRecordNo: 'repay_record_no',
      status: 'status',
      extInfo: 'ext_info',
      requestUniqueId: 'request_unique_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      repayRecordNo: 'string',
      status: 'string',
      extInfo: 'string',
      requestUniqueId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CallbackAntdigitalAssetOrgoperationRepayResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 还款回调结果
  data?: RepayCallBackResData;
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
      data: RepayCallBackResData,
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
          sdk_version: "2.0.0",
          _prod_code: "ORG",
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
   * Description: 机构权益运营还款回调
   * Summary: 机构权益运营还款回调
   */
  async callbackAntdigitalAssetOrgoperationRepay(request: CallbackAntdigitalAssetOrgoperationRepayRequest): Promise<CallbackAntdigitalAssetOrgoperationRepayResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.callbackAntdigitalAssetOrgoperationRepayEx(request, headers, runtime);
  }

  /**
   * Description: 机构权益运营还款回调
   * Summary: 机构权益运营还款回调
   */
  async callbackAntdigitalAssetOrgoperationRepayEx(request: CallbackAntdigitalAssetOrgoperationRepayRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CallbackAntdigitalAssetOrgoperationRepayResponse> {
    Util.validateModel(request);
    return $tea.cast<CallbackAntdigitalAssetOrgoperationRepayResponse>(await this.doRequest("1.0", "antdigital.asset.orgoperation.repay.callback", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CallbackAntdigitalAssetOrgoperationRepayResponse({}));
  }

}
