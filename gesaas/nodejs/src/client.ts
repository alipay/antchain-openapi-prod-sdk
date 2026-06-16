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

// 经营分账收入方列表
export class OperateDivideTransInModel extends $tea.Model {
  // 分账收入方支付宝用户id, 支付宝2088id
  /**
   * @example
   * 2088id
   */
  transInUserId: string;
  // 分账金额，单位为分 大于0
  /**
   * @example
   * 12324
   */
  divideAmount: number;
  static names(): { [key: string]: string } {
    return {
      transInUserId: 'trans_in_user_id',
      divideAmount: 'divide_amount',
    };
  }

  static types(): { [key: string]: any } {
    return {
      transInUserId: 'string',
      divideAmount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 还款策略
export class RepayStrategy extends $tea.Model {
  // 应付租金时间，精确到天 格式为yyyy-MM-dd
  /**
   * @example
   * 2025-09-19
   */
  payDay: string;
  // 用户还款期数，从1开始
  /**
   * @example
   * 1
   */
  termIndex: number;
  // 应付租金，精确到分，即1234表示12.34元 大于0
  /**
   * @example
   * 1234
   */
  rentalMoney: number;
  // 是否经营分账, Y-是、N-否 为空代表否
  /**
   * @example
   * Y
   */
  operateDivideFlag?: string;
  // 经营分账收入方列表
  // 当operateDivideFlag 为Y时必填
  operateDivideTransInList?: OperateDivideTransInModel[];
  // 是否停止数科代扣自动执行
  // 
  // Y：停止；由商户调用接口「支付相关接入 - 代扣计划重试」触发代扣；否则代扣不会被执行、到逾期时间后会被逾期
  // 
  // N : 不停止；保持数科自动代扣（默认）
  /**
   * @example
   * N
   */
  noNeedAutoDeduction?: string;
  static names(): { [key: string]: string } {
    return {
      payDay: 'pay_day',
      termIndex: 'term_index',
      rentalMoney: 'rental_money',
      operateDivideFlag: 'operate_divide_flag',
      operateDivideTransInList: 'operate_divide_trans_in_list',
      noNeedAutoDeduction: 'no_need_auto_deduction',
    };
  }

  static types(): { [key: string]: any } {
    return {
      payDay: 'string',
      termIndex: 'number',
      rentalMoney: 'number',
      operateDivideFlag: 'string',
      operateDivideTransInList: { 'type': 'array', 'itemType': OperateDivideTransInModel },
      noNeedAutoDeduction: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 主订单信息
export class OrderInfoReq extends $tea.Model {
  // 订单创建时间
  /**
   * @example
   * 2018-10-10T10:10:00Z
   */
  orderCreateTime: string;
  // 订单付款主题
  /**
   * @example
   * 退订、续订,人工客服电话:4006476616商家订单号：
   */
  orderPaySubject: string;
  // 总租期
  // 总租期最小值为1
  // 总租期最大值为60
  /**
   * @example
   * 12
   */
  rentTerm: number;
  // 租期单位
  // MONTH : 月 
  // DAY : 天
  /**
   * @example
   * MONTH
   */
  rentUnit?: string;
  // 租金总额 单位/分
  // 最小值为1
  /**
   * @example
   * 1234
   */
  totalRentMoney: number;
  static names(): { [key: string]: string } {
    return {
      orderCreateTime: 'order_create_time',
      orderPaySubject: 'order_pay_subject',
      rentTerm: 'rent_term',
      rentUnit: 'rent_unit',
      totalRentMoney: 'total_rent_money',
    };
  }

  static types(): { [key: string]: any } {
    return {
      orderCreateTime: 'string',
      orderPaySubject: 'string',
      rentTerm: 'number',
      rentUnit: 'string',
      totalRentMoney: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 订单还款计划
export class OrderPromise extends $tea.Model {
  // 宽限期/天
  // 不传默认为0
  /**
   * @example
   * 1233
   */
  gracePeriodDays?: number;
  // 罚息类型
  //  NONE : 没有罚息  PENALTY_FEE： 罚息（暂不支持）
  /**
   * @example
   * NONE
   */
  punishmentType?: string;
  // 租期
  // 租期最小值为1
  /**
   * @example
   * 11
   */
  payPeriod: number;
  // 租赁公司支付宝UID
  /**
   * @example
   * 2088Id
   */
  leaseAlipayUid: string;
  // 还款策略 
  // repayStrategyList长度 == payPeriod
  repayStrategyList: RepayStrategy[];
  static names(): { [key: string]: string } {
    return {
      gracePeriodDays: 'grace_period_days',
      punishmentType: 'punishment_type',
      payPeriod: 'pay_period',
      leaseAlipayUid: 'lease_alipay_uid',
      repayStrategyList: 'repay_strategy_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      gracePeriodDays: 'number',
      punishmentType: 'string',
      payPeriod: 'number',
      leaseAlipayUid: 'string',
      repayStrategyList: { 'type': 'array', 'itemType': RepayStrategy },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 订单详情列表
export class OrderDetail extends $tea.Model {
  // 凭证编号
  /**
   * @example
   * 1798234932684395
   */
  voucherCode: string;
  static names(): { [key: string]: string } {
    return {
      voucherCode: 'voucher_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      voucherCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 结算订单分账明细对象
export class SettleOrderRoyaltyDetail extends $tea.Model {
  // 分账金额，单位：分
  /**
   * @example
   * 1000
   */
  amount?: number;
  // 分账执行时间
  /**
   * @example
   * 2021-07-30 12:00:00
   */
  executeTime?: string;
  // 分账转出账号
  /**
   * @example
   * 2088111111111111
   */
  transOutAccount?: string;
  // 分账转入账号
  /**
   * @example
   * 2088111111111111
   */
  transInAccount?: string;
  static names(): { [key: string]: string } {
    return {
      amount: 'amount',
      executeTime: 'execute_time',
      transOutAccount: 'trans_out_account',
      transInAccount: 'trans_in_account',
    };
  }

  static types(): { [key: string]: any } {
    return {
      amount: 'number',
      executeTime: 'string',
      transOutAccount: 'string',
      transInAccount: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 订单进件请求参数
export class OrderFullInfoReq extends $tea.Model {
  // 订单号
  // 
  /**
   * @example
   * 1798234932684395
   */
  orderId: string;
  // 手机号
  /**
   * @example
   * 15629827201
   */
  mobilePhone: string;
  // 产品ID=实际产品ID#版本 prod#1	
  // 
  /**
   * @example
   * prod#1
   */
  productId: string;
  // 商户的统一社会信用代码
  /**
   * @example
   * 2088xxx
   */
  merchantId: string;
  // 商户公司名字
  /**
   * @example
   * 蚂蚁云创xxx有限公司
   */
  merchantName: string;
  // 业务场景 默认为CHARGING_BY_TERM 
  // CHARGING_BY_ORDER : 整单结算 
  // CHARGING_BY_TERM : 分期结算
  //  CHARGING_BY_TERM_INDIRECT : 间联模式使用，分期结算
  //  CHARGING_BY_PROFIT : 分润结算
  /**
   * @example
   * CHARGING_BY_TERM
   */
  bizScene: string;
  // 业务类型 LEASE : 租赁 （默认） INSTALLMENT: 分期付款	
  // 
  /**
   * @example
   * INSTALLMENT
   */
  bizType: string;
  // 签署模式 NONE : 灵活签约
  /**
   * @example
   * NONE
   */
  signMode: string;
  // 主订单信息
  orderInfo: OrderInfoReq;
  // 订单还款计划
  promiseInfo: OrderPromise;
  static names(): { [key: string]: string } {
    return {
      orderId: 'order_id',
      mobilePhone: 'mobile_phone',
      productId: 'product_id',
      merchantId: 'merchant_id',
      merchantName: 'merchant_name',
      bizScene: 'biz_scene',
      bizType: 'biz_type',
      signMode: 'sign_mode',
      orderInfo: 'order_info',
      promiseInfo: 'promise_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      orderId: 'string',
      mobilePhone: 'string',
      productId: 'string',
      merchantId: 'string',
      merchantName: 'string',
      bizScene: 'string',
      bizType: 'string',
      signMode: 'string',
      orderInfo: OrderInfoReq,
      promiseInfo: OrderPromise,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 响应结果基类
export class CommonResponse extends $tea.Model {
  // 结果码
  /**
   * @example
   * 100001
   */
  code: string;
  // 返回码描述
  /**
   * @example
   * 成功
   */
  msg: string;
  // 业务处理结果码
  // 
  /**
   * @example
   * fail
   */
  subCode?: string;
  // 返回的提示信息
  /**
   * @example
   * 失败
   */
  subMsg?: string;
  // 可否重试
  /**
   * @example
   * true, false
   */
  retry?: boolean;
  static names(): { [key: string]: string } {
    return {
      code: 'code',
      msg: 'msg',
      subCode: 'sub_code',
      subMsg: 'sub_msg',
      retry: 'retry',
    };
  }

  static types(): { [key: string]: any } {
    return {
      code: 'string',
      msg: 'string',
      subCode: 'string',
      subMsg: 'string',
      retry: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 权益发放结果
export class RightsGrantResultVO extends $tea.Model {
  // 过期时间
  /**
   * @example
   * 2018-10-10T10:10:00Z
   */
  expireTime?: string;
  // 生效时间
  effectTime?: string;
  // 发放状态：
  // GRANTING：发放处理中 GRANT_SUCCESS：发放成功 GRANT_FAIL：发放失败
  /**
   * @example
   * GRANTING
   */
  grantStatus: string;
  // 订单详情列表
  orderDetails?: OrderDetail[];
  static names(): { [key: string]: string } {
    return {
      expireTime: 'expire_time',
      effectTime: 'effect_time',
      grantStatus: 'grant_status',
      orderDetails: 'order_details',
    };
  }

  static types(): { [key: string]: any } {
    return {
      expireTime: 'string',
      effectTime: 'string',
      grantStatus: 'string',
      orderDetails: { 'type': 'array', 'itemType': OrderDetail },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 券基本信息
export class VoucherBaseInfoVO extends $tea.Model {
  // 2088xxxxxx0001
  /**
   * @example
   * 用户ID
   */
  userId?: string;
  // 手机号
  /**
   * @example
   * 15700001111
   */
  phoneNumber?: string;
  // 权益编号
  /**
   * @example
   * RC188955110502576765
   */
  rightsCode: string;
  // 权益名称
  /**
   * @example
   * 满10元减2元
   */
  rightsName: string;
  // 券码
  /**
   * @example
   * 202601160007300227760ZT3CMQY
   */
  voucherCode: string;
  // 券状态
  // WAIT_EFFECT：待生效 
  // WAIT_VERIFY：待核销 
  // EXPIRED：已过期 
  // VERIFY_SUCCESS：核销成功（已核销） 
  // 公域场景下只会包含以上四种状态，私域场景会包含下方状态基
  // FREEZE：已冻结 
  // VERIFYING：核销处理中 
  // VERIFY_FAIL：核销失败 
  // VERIFY_CANCELING：核销撤销中
  // INVALID：已失效 
  // NO_NEED_VERIFY：无需核销 
  /**
   * @example
   * WAIT_VERIFY
   */
  status: string;
  static names(): { [key: string]: string } {
    return {
      userId: 'user_id',
      phoneNumber: 'phone_number',
      rightsCode: 'rights_code',
      rightsName: 'rights_name',
      voucherCode: 'voucher_code',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      userId: 'string',
      phoneNumber: 'string',
      rightsCode: 'string',
      rightsName: 'string',
      voucherCode: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 退款账户明细信息
export class RefundDetail extends $tea.Model {
  // 支出方账户ID，如果是支付宝：以2088开头的纯16位数字
  /**
   * @example
   * 2088101126765726
   */
  transOutAccount?: string;
  // 分账的金额，单位为分
  /**
   * @example
   * 990
   */
  amount?: number;
  static names(): { [key: string]: string } {
    return {
      transOutAccount: 'trans_out_account',
      amount: 'amount',
    };
  }

  static types(): { [key: string]: any } {
    return {
      transOutAccount: 'string',
      amount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushOrderSettlementRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 商家产品唯一编码，64个字符以内
  outProductId: string;
  // 外部订单号(同一个outProductId保证唯一性)，需保证在商家端不重复，64个字符以内
  outOrderNo: string;
  // 支付宝/微信/其他  平台订单号
  tradeNo: string;
  // 支付渠道类型，枚举值：ALIPAY / WECHAT
  orderType: string;
  // 订单金额，单位：分（如 990 表示 9.90元）
  orderAmount: number;
  // 扩展参数，JSONString格式
  extInfo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      outProductId: 'out_product_id',
      outOrderNo: 'out_order_no',
      tradeNo: 'trade_no',
      orderType: 'order_type',
      orderAmount: 'order_amount',
      extInfo: 'ext_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      outProductId: 'string',
      outOrderNo: 'string',
      tradeNo: 'string',
      orderType: 'string',
      orderAmount: 'number',
      extInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushOrderSettlementResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 支付宝/微信/其他 平台订单号
  tradeNo?: string;
  // 分账单号，可以根据该单号查询单次分账请求执行结果
  settleNo?: string;
  // 外部订单号(商家)
  outOrderNo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      tradeNo: 'trade_no',
      settleNo: 'settle_no',
      outOrderNo: 'out_order_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      tradeNo: 'string',
      settleNo: 'string',
      outOrderNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryOrderSettlementRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 分账请求单号
  settleNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      settleNo: 'settle_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      settleNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryOrderSettlementResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 分账受理时间，格式为yyyy-MM-dd HH:mm:ss
  splitRequestTime?: string;
  // 分账明细
  splitDetailList?: SettleOrderRoyaltyDetail[];
  // 支付宝 平台订单号
  tradeNo?: string;
  // 外部订单号(同一个outProductId唯一)
  outOrderNo?: string;
  // 分账状态，SUCCESS成功，FAIL失败，PROCESSING处理中
  splitStatus?: string;
  // 分账失败原因
  splitFailReason?: string;
  // 分账单号
  settleNo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      splitRequestTime: 'split_request_time',
      splitDetailList: 'split_detail_list',
      tradeNo: 'trade_no',
      outOrderNo: 'out_order_no',
      splitStatus: 'split_status',
      splitFailReason: 'split_fail_reason',
      settleNo: 'settle_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      splitRequestTime: 'string',
      splitDetailList: { 'type': 'array', 'itemType': SettleOrderRoyaltyDetail },
      tradeNo: 'string',
      outOrderNo: 'string',
      splitStatus: 'string',
      splitFailReason: 'string',
      settleNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class WithdrawOrderSettlementRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 退分账金额，单位：分
  refundAmount: number;
  // 分账单号
  settleNo: string;
  // 退款原因说明。 商家自定义，将在会在商户和用户的pc退款账单详情中展示
  refundReason?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      refundAmount: 'refund_amount',
      settleNo: 'settle_no',
      refundReason: 'refund_reason',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      refundAmount: 'number',
      settleNo: 'string',
      refundReason: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class WithdrawOrderSettlementResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 支付交易号
  tradeNo?: string;
  // 外部订单号(同一个outProductId唯一)
  outOrderNo?: string;
  // 退分账时间，格式为yyyy-MM-dd HH:mm:ss
  refundTime?: string;
  // 分账账单
  settleNo?: string;
  // 退分账唯一编号
  refundNo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      tradeNo: 'trade_no',
      outOrderNo: 'out_order_no',
      refundTime: 'refund_time',
      settleNo: 'settle_no',
      refundNo: 'refund_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      tradeNo: 'string',
      outOrderNo: 'string',
      refundTime: 'string',
      settleNo: 'string',
      refundNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryOrderWithdrawRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 支付宝 平台订单号
  tradeNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tradeNo: 'trade_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tradeNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryOrderWithdrawResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 支付交易号
  tradeNo?: string;
  // 退分账明细
  refundDetailItemList?: SettleOrderRoyaltyDetail;
  // 交易退分账总金额，单位：分
  // 明细单金额总和
  tradeRefundAmount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      tradeNo: 'trade_no',
      refundDetailItemList: 'refund_detail_item_list',
      tradeRefundAmount: 'trade_refund_amount',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      tradeNo: 'string',
      refundDetailItemList: SettleOrderRoyaltyDetail,
      tradeRefundAmount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckOmngRiskRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单号
  orderId: string;
  // 手机号
  mobilePhone: string;
  // 产品ID=实际产品ID#版本
  // prod#1
  productId: string;
  // 商户的统一社会信用代码
  merchantId: string;
  // 商户公司名字
  merchantName: string;
  // 业务场景
  // 默认为CHARGING_BY_TERM
  // 
  //  CHARGING_BY_ORDER : 整单结算 
  // CHARGING_BY_TERM : 分期结算
  //  CHARGING_BY_TERM_INDIRECT : 间联模式使用，分期结算 
  // CHARGING_BY_PROFIT : 分润结算
  bizScene?: string;
  // 业务类型
  // LEASE : 租赁 （默认） 
  // INSTALLMENT: 分期付款
  // 
  bizType?: string;
  // 签署模式
  //  NONE : 灵活签约
  signMode?: string;
  // 主订单信息
  orderInfo: OrderInfoReq;
  // 订单还款计划
  promiseInfo: OrderPromise;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      mobilePhone: 'mobile_phone',
      productId: 'product_id',
      merchantId: 'merchant_id',
      merchantName: 'merchant_name',
      bizScene: 'biz_scene',
      bizType: 'biz_type',
      signMode: 'sign_mode',
      orderInfo: 'order_info',
      promiseInfo: 'promise_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      mobilePhone: 'string',
      productId: 'string',
      merchantId: 'string',
      merchantName: 'string',
      bizScene: 'string',
      bizType: 'string',
      signMode: 'string',
      orderInfo: OrderInfoReq,
      promiseInfo: OrderPromise,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckOmngRiskResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 授权串
  infoStr?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      infoStr: 'info_str',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      infoStr: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SubmitRightsprodGrantRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 2088xxxx123
  userId?: string;
  // 用户手机号
  phoneNumber?: string;
  // 商户编号
  merchantNo?: string;
  // 权益编码
  rightsCode: string;
  // 发放数量
  grantNum: number;
  // 面额，动态面额类型必传
  faceValue?: string;
  // 外部发放订单号
  outGrantOrderNo: string;
  // 扩展信息
  extInfo?: string;
  // 发放信息,如活动ID等信息
  grantInfo?: string;
  // 技术租户ID、当开通权益中心产品在非数科的应用租户下时需要填写对应的技术租户ID（涉及到时技术对接时 技术会分配，如未分配则不需要传参数）
  techTenantId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      userId: 'user_id',
      phoneNumber: 'phone_number',
      merchantNo: 'merchant_no',
      rightsCode: 'rights_code',
      grantNum: 'grant_num',
      faceValue: 'face_value',
      outGrantOrderNo: 'out_grant_order_no',
      extInfo: 'ext_info',
      grantInfo: 'grant_info',
      techTenantId: 'tech_tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      userId: 'string',
      phoneNumber: 'string',
      merchantNo: 'string',
      rightsCode: 'string',
      grantNum: 'number',
      faceValue: 'string',
      outGrantOrderNo: 'string',
      extInfo: 'string',
      grantInfo: 'string',
      techTenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SubmitRightsprodGrantResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 权益发放结果
  rightsGrantResult?: RightsGrantResultVO;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      rightsGrantResult: 'rights_grant_result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      rightsGrantResult: RightsGrantResultVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRightsprodGrantRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 外部发放订单号
  outGrantOrderNo: string;
  // 技术租户ID、当开通权益中心产品在非数科的应用租户下时需要填写对应的技术租户ID（涉及到时技术对接时 技术会分配，如未分配则不需要传值）
  techTenantId?: string;
  // 扩展信息
  extInfo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      outGrantOrderNo: 'out_grant_order_no',
      techTenantId: 'tech_tenant_id',
      extInfo: 'ext_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      outGrantOrderNo: 'string',
      techTenantId: 'string',
      extInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRightsprodGrantResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 权益发放结果
  rightsGrantResult?: RightsGrantResultVO;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      rightsGrantResult: 'rights_grant_result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      rightsGrantResult: RightsGrantResultVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchqueryRightsprodVoucherRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 券编码（券实例）列表
  voucherCodeList: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      voucherCodeList: 'voucher_code_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      voucherCodeList: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchqueryRightsprodVoucherResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 券基本信息列表
  list?: VoucherBaseInfoVO[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      list: 'list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      list: { 'type': 'array', 'itemType': VoucherBaseInfoVO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CallbackRightsprodOperationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 通知ID(幂等)
  notifyId: string;
  // 权益编号
  rightsCode: string;
  // 凭证编号
  voucherCode: string;
  // 业务类型
  // V_REFUND（退款）
  // V_EXPIRE（过期）
  // V_INVALID（作废）
  // V_USE（核销）
  // V_PUBLISH（发放）
  bizType: string;
  // 支付订单号（使用和退款 时用于判断是否为重复核销、退款通知）
  payOrderNo?: string;
  // 券面额
  faceAmount?: string;
  // 流通金额（核销、退款时 金额）
  fluxAmount?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      notifyId: 'notify_id',
      rightsCode: 'rights_code',
      voucherCode: 'voucher_code',
      bizType: 'biz_type',
      payOrderNo: 'pay_order_no',
      faceAmount: 'face_amount',
      fluxAmount: 'flux_amount',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      notifyId: 'string',
      rightsCode: 'string',
      voucherCode: 'string',
      bizType: 'string',
      payOrderNo: 'string',
      faceAmount: 'string',
      fluxAmount: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CallbackRightsprodOperationResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 同步结果  
  // success 为同步成功其他均为失败
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

export class CallbackRightsprodOperationdataRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 通知ID(幂等)
  notifyId: string;
  // 权益编号
  rightsCode: string;
  // 凭证编号
  voucherCode: string;
  // 业务类型 V_REFUND（退款） V_EXPIRE（过期） V_INVALID（作废） V_USE（核销） V_PUBLISH（发放）
  bizType: string;
  // 支付订单号（使用和退款 时用于判断是否为重复核销、退款通知）
  payOrderNo?: string;
  // 券面额
  faceAmount?: string;
  // 流通金额（核销、退款时 金额）
  fluxAmount?: string;
  // 业务发生时间
  bizTime: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      notifyId: 'notify_id',
      rightsCode: 'rights_code',
      voucherCode: 'voucher_code',
      bizType: 'biz_type',
      payOrderNo: 'pay_order_no',
      faceAmount: 'face_amount',
      fluxAmount: 'flux_amount',
      bizTime: 'biz_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      notifyId: 'string',
      rightsCode: 'string',
      voucherCode: 'string',
      bizType: 'string',
      payOrderNo: 'string',
      faceAmount: 'string',
      fluxAmount: 'string',
      bizTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CallbackRightsprodOperationdataResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 同步结果 success 为同步成功其他均为失败
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
          sdk_version: "1.3.7",
          _prod_code: "GESAAS",
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
   * @remarks
   * Description: 分账订单推送
   * Summary: 分账订单推送
   */
  async pushOrderSettlement(request: PushOrderSettlementRequest): Promise<PushOrderSettlementResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pushOrderSettlementEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 分账订单推送
   * Summary: 分账订单推送
   */
  async pushOrderSettlementEx(request: PushOrderSettlementRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PushOrderSettlementResponse> {
    Util.validateModel(request);
    return $tea.cast<PushOrderSettlementResponse>(await this.doRequest("1.0", "antdigital.gesaas.order.settlement.push", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PushOrderSettlementResponse({}));
  }

  /**
   * @remarks
   * Description: 分账订单查询
   * Summary: 分账订单查询
   */
  async queryOrderSettlement(request: QueryOrderSettlementRequest): Promise<QueryOrderSettlementResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryOrderSettlementEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 分账订单查询
   * Summary: 分账订单查询
   */
  async queryOrderSettlementEx(request: QueryOrderSettlementRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryOrderSettlementResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryOrderSettlementResponse>(await this.doRequest("1.0", "antdigital.gesaas.order.settlement.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryOrderSettlementResponse({}));
  }

  /**
   * @remarks
   * Description: 退分账接口
   * Summary: 退分账接口
   */
  async withdrawOrderSettlement(request: WithdrawOrderSettlementRequest): Promise<WithdrawOrderSettlementResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.withdrawOrderSettlementEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 退分账接口
   * Summary: 退分账接口
   */
  async withdrawOrderSettlementEx(request: WithdrawOrderSettlementRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<WithdrawOrderSettlementResponse> {
    Util.validateModel(request);
    return $tea.cast<WithdrawOrderSettlementResponse>(await this.doRequest("1.0", "antdigital.gesaas.order.settlement.withdraw", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new WithdrawOrderSettlementResponse({}));
  }

  /**
   * @remarks
   * Description: 退分账查询接口
   * Summary: 退分账查询接口
   */
  async queryOrderWithdraw(request: QueryOrderWithdrawRequest): Promise<QueryOrderWithdrawResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryOrderWithdrawEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 退分账查询接口
   * Summary: 退分账查询接口
   */
  async queryOrderWithdrawEx(request: QueryOrderWithdrawRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryOrderWithdrawResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryOrderWithdrawResponse>(await this.doRequest("1.0", "antdigital.gesaas.order.withdraw.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryOrderWithdrawResponse({}));
  }

  /**
   * @remarks
   * Description: 品牌会员签约鉴权产品链路风控鉴权
   * Summary: 风控鉴权
   */
  async checkOmngRisk(request: CheckOmngRiskRequest): Promise<CheckOmngRiskResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.checkOmngRiskEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 品牌会员签约鉴权产品链路风控鉴权
   * Summary: 风控鉴权
   */
  async checkOmngRiskEx(request: CheckOmngRiskRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CheckOmngRiskResponse> {
    Util.validateModel(request);
    return $tea.cast<CheckOmngRiskResponse>(await this.doRequest("1.0", "antdigital.gesaas.omng.risk.check", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CheckOmngRiskResponse({}));
  }

  /**
   * @remarks
   * Description: 权益中心权益发放
   * Summary: 权益发放
   */
  async submitRightsprodGrant(request: SubmitRightsprodGrantRequest): Promise<SubmitRightsprodGrantResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.submitRightsprodGrantEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 权益中心权益发放
   * Summary: 权益发放
   */
  async submitRightsprodGrantEx(request: SubmitRightsprodGrantRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SubmitRightsprodGrantResponse> {
    Util.validateModel(request);
    return $tea.cast<SubmitRightsprodGrantResponse>(await this.doRequest("1.0", "antdigital.gesaas.rightsprod.grant.submit", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SubmitRightsprodGrantResponse({}));
  }

  /**
   * @remarks
   * Description: 权益发放结果查询
   * Summary: 权益发放结果查询
   */
  async queryRightsprodGrant(request: QueryRightsprodGrantRequest): Promise<QueryRightsprodGrantResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryRightsprodGrantEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 权益发放结果查询
   * Summary: 权益发放结果查询
   */
  async queryRightsprodGrantEx(request: QueryRightsprodGrantRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryRightsprodGrantResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryRightsprodGrantResponse>(await this.doRequest("1.0", "antdigital.gesaas.rightsprod.grant.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryRightsprodGrantResponse({}));
  }

  /**
   * @remarks
   * Description: 券基本信息批量查询
   * Summary: 券基本信息批量查询
   */
  async batchqueryRightsprodVoucher(request: BatchqueryRightsprodVoucherRequest): Promise<BatchqueryRightsprodVoucherResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchqueryRightsprodVoucherEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 券基本信息批量查询
   * Summary: 券基本信息批量查询
   */
  async batchqueryRightsprodVoucherEx(request: BatchqueryRightsprodVoucherRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchqueryRightsprodVoucherResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchqueryRightsprodVoucherResponse>(await this.doRequest("1.0", "antdigital.gesaas.rightsprod.voucher.batchquery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchqueryRightsprodVoucherResponse({}));
  }

  /**
   * @remarks
   * Description: 权益中心数据流回调 API
   * Summary: 权益中心数据流回调 API
   */
  async callbackRightsprodOperation(request: CallbackRightsprodOperationRequest): Promise<CallbackRightsprodOperationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.callbackRightsprodOperationEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 权益中心数据流回调 API
   * Summary: 权益中心数据流回调 API
   */
  async callbackRightsprodOperationEx(request: CallbackRightsprodOperationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CallbackRightsprodOperationResponse> {
    Util.validateModel(request);
    return $tea.cast<CallbackRightsprodOperationResponse>(await this.doRequest("1.0", "antdigital.gesaas.rightsprod.operation.callback", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CallbackRightsprodOperationResponse({}));
  }

  /**
   * @remarks
   * Description: 权益中心API
   * Summary: 权益中心API
   */
  async callbackRightsprodOperationdata(request: CallbackRightsprodOperationdataRequest): Promise<CallbackRightsprodOperationdataResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.callbackRightsprodOperationdataEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 权益中心API
   * Summary: 权益中心API
   */
  async callbackRightsprodOperationdataEx(request: CallbackRightsprodOperationdataRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CallbackRightsprodOperationdataResponse> {
    Util.validateModel(request);
    return $tea.cast<CallbackRightsprodOperationdataResponse>(await this.doRequest("1.0", "antdigital.gesaas.rightsprod.operationdata.callback", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CallbackRightsprodOperationdataResponse({}));
  }

}
