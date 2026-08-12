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

// 分账通知明细
export class SettleOrderRoyaltyDetail extends $tea.Model {
  // 分账金额，单位：分
  /**
   * @example
   * 100
   */
  amount: number;
  // 分账执行时间
  /**
   * @example
   * 2021-07-30 12:00:00
   */
  executeTime: string;
  // 分账转出账号
  /**
   * @example
   * 2088111111111111
   */
  transOutAccount: string;
  // 分账转入账号
  /**
   * @example
   * 2088111111111111
   */
  transInAccount: string;
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

// 发放订单明细
export class GrantOrderDetail extends $tea.Model {
  // 券编码
  /**
   * @example
   * 1798234932684395
   */
  voucherCode: string;
  // 发放扩展信息
  /**
   * @example
   * {"supplierSettlePrice": 10.00,"supplierChannelNo": "alipay","rightsName": "28元抵扣券","outRightsCode": "1767506545030770701"}
   */
  extInfo?: string;
  static names(): { [key: string]: string } {
    return {
      voucherCode: 'voucher_code',
      extInfo: 'ext_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      voucherCode: 'string',
      extInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CallbackOrderSettlementRequest extends $tea.Model {
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

export class CallbackOrderSettlementResponse extends $tea.Model {
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

export class CallbackGesaasOrderRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // PAY_RESULT_MSG：支付结果通知
  // SETTLE_SPLIT_RESULT_MSG ：分账结果通知
  // REFUND_SPLIT_RESULT_MSG：退款退分账结果通知
  msgType: string;
  // 消息唯一性判断，失败重试msgId不变
  // 即使消息重投、该字段也不会变动
  msgId: string;
  // traceId， 每一次投递生成唯一id
  // 消息重投后、该字段会变化
  traceId: string;
  // 订单所属商户的社会信用代码
  merchantId: string;
  // 类型；JSONString字符串
  // 说明：根据不同的msgType类型，messageBody说明如下
  messageBody: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      msgType: 'msg_type',
      msgId: 'msg_id',
      traceId: 'trace_id',
      merchantId: 'merchant_id',
      messageBody: 'message_body',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      msgType: 'string',
      msgId: 'string',
      traceId: 'string',
      merchantId: 'string',
      messageBody: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CallbackGesaasOrderResponse extends $tea.Model {
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

export class PushRightsprodVoucherRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 权益编码
  rightsCode: string;
  // 权益凭证编码/券码
  voucherCode: string;
  // 业务类型
  // GRANT：发放 
  // VERIFY：核销 GRANT_CANCEL：发放撤销 VERIFY_CANCEL：核销撤销 FREEZE：冻结
  // UNFREEZE：解冻  
  bizType: string;
  // FAIL：失败 
  // SUCCESS：成功 
  status?: string;
  // 外部订单号
  outTradeOrderNo?: string;
  // 失败信息
  failMsg?: string;
  // 外部发放调用时传入信息
  grantInfo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      rightsCode: 'rights_code',
      voucherCode: 'voucher_code',
      bizType: 'biz_type',
      status: 'status',
      outTradeOrderNo: 'out_trade_order_no',
      failMsg: 'fail_msg',
      grantInfo: 'grant_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      rightsCode: 'string',
      voucherCode: 'string',
      bizType: 'string',
      status: 'string',
      outTradeOrderNo: 'string',
      failMsg: 'string',
      grantInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushRightsprodVoucherResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 同步结果  success 同步成功 
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

export class CallbackRightsprodStatusRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 权益编码
  rightsCode: string;
  // 券码
  voucherCode: string;
  // 券变更状态
  // V_USE（使用）
  // V_REFUND（退款）
  // V_EXPIRE（过期）
  // V_INVALID（作废）
  status: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      rightsCode: 'rights_code',
      voucherCode: 'voucher_code',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      rightsCode: 'string',
      voucherCode: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CallbackRightsprodStatusResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 同步结果 success 同步成功
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

export class CallbackRightsprodOperationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 权益编码
  rightsCode: string;
  // 券码
  voucherCode: string;
  // 通知ID(幂等)
  notifyId: string;
  // 业务类型
  // V_REFUND（退款）
  // V_EXPIRE（过期）
  // V_INVALID（作废）
  // V_USE（使用）
  bizType: string;
  // 支付订单号
  payOrderNo?: string;
  // 券面额
  faceAmount?: string;
  // 流通金额（核销、退款时 金额）
  fluxAmount?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      rightsCode: 'rights_code',
      voucherCode: 'voucher_code',
      notifyId: 'notify_id',
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
      rightsCode: 'string',
      voucherCode: 'string',
      notifyId: 'string',
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

export class PushRightsprodGrantrightsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用户ID
  userId?: string;
  // 手机号
  phoneNumber?: string;
  // 商户编码
  merchantNo?: string;
  // 权益编码
  supplyRightsCode: string;
  // 发放数量，可根据权益信息grantMulti判断是否可发多张
  grantNum?: number;
  // 外部发放订单号
  outGrantOrderNo: string;
  // 发放扩展信息，如活动ID等信息，暂时可以不传
  grantInfo?: string;
  // 208898234892XXX01
  openId?: string;
  // 应用ID
  appId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      userId: 'user_id',
      phoneNumber: 'phone_number',
      merchantNo: 'merchant_no',
      supplyRightsCode: 'supply_rights_code',
      grantNum: 'grant_num',
      outGrantOrderNo: 'out_grant_order_no',
      grantInfo: 'grant_info',
      openId: 'open_id',
      appId: 'app_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      userId: 'string',
      phoneNumber: 'string',
      merchantNo: 'string',
      supplyRightsCode: 'string',
      grantNum: 'number',
      outGrantOrderNo: 'string',
      grantInfo: 'string',
      openId: 'string',
      appId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushRightsprodGrantrightsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 发放状态：
  // GRANTING：发放处理中 GRANT_SUCCESS：发放成功 GRANT_FAIL：发放失败
  grantStatus?: string;
  // 过期时间 yyyy-MM-dd HH:mm:ss
  expireTime?: string;
  // 生效时间 yyyy-MM-dd HH:mm:ss
  effectTime?: string;
  // 发放订单明细数据
  orderDetails?: GrantOrderDetail[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      grantStatus: 'grant_status',
      expireTime: 'expire_time',
      effectTime: 'effect_time',
      orderDetails: 'order_details',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      grantStatus: 'string',
      expireTime: 'string',
      effectTime: 'string',
      orderDetails: { 'type': 'array', 'itemType': GrantOrderDetail },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRightsprodConfigRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 权益供应商供应权益编码
  supplyRightsCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      supplyRightsCode: 'supply_rights_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      supplyRightsCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRightsprodConfigResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 供应权益编码
  supplyRightsCode?: string;
  // 权益名称
  rightsName?: string;
  // 权益类型
  // 满减券:FULL_REDUCTION_COUPON 
  // 每满减券:EVERY_FULL_REDUCTION_COUPON
  // 折扣券:DISCOUNT_COUPON
  rightsType?: string;
  // 待发布:INIT
  // 已上线:ONLINE
  // 已暂停:PAUSED
  // 已下线:OFFLINE
  status?: string;
  // 权益创建时间格式为yyyy-MM-dd HH:mm:ss
  createTime?: string;
  // 权益发放开始时间
  grantStartTime?: string;
  // 权益发放截止时间
  grantEndTime?: string;
  // 生效时间类型 固定时间:1;领券后:0
  validityTimeType?: string;
  // 生效时间 格式为yyyy-MM-dd HH:mm:ss
  // 生效时间类型为 1 固定时间是必传
  voucherStartTime?: string;
  // 过期时间 格式为yyyy-MM-dd HH:mm:ss
  // 生效时间类型为 1 固定时间是必传
  voucherEndTime?: string;
  // 生效时间类型：DAY/HOUR
  // 当生效时间类型为0时 必传
  validityTimeFormat?: string;
  // 生效时间数
  // 生效时间类型 0时 必传
  validityTime?: number;
  // 权益面额 单位：元
  faceAmount?: string;
  // 门槛金额单位：元
  sillAmount?: string;
  // 折扣数 88折 对应为8.8
  discount?: string;
  // 最大优惠金额
  maxDiscountAmount?: string;
  // 券原始库存（最大发券数）
  rightsNum?: number;
  // 总预算金额
  totalBudget?: string;
  // 使用描述
  description?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      supplyRightsCode: 'supply_rights_code',
      rightsName: 'rights_name',
      rightsType: 'rights_type',
      status: 'status',
      createTime: 'create_time',
      grantStartTime: 'grant_start_time',
      grantEndTime: 'grant_end_time',
      validityTimeType: 'validity_time_type',
      voucherStartTime: 'voucher_start_time',
      voucherEndTime: 'voucher_end_time',
      validityTimeFormat: 'validity_time_format',
      validityTime: 'validity_time',
      faceAmount: 'face_amount',
      sillAmount: 'sill_amount',
      discount: 'discount',
      maxDiscountAmount: 'max_discount_amount',
      rightsNum: 'rights_num',
      totalBudget: 'total_budget',
      description: 'description',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      supplyRightsCode: 'string',
      rightsName: 'string',
      rightsType: 'string',
      status: 'string',
      createTime: 'string',
      grantStartTime: 'string',
      grantEndTime: 'string',
      validityTimeType: 'string',
      voucherStartTime: 'string',
      voucherEndTime: 'string',
      validityTimeFormat: 'string',
      validityTime: 'number',
      faceAmount: 'string',
      sillAmount: 'string',
      discount: 'string',
      maxDiscountAmount: 'string',
      rightsNum: 'number',
      totalBudget: 'string',
      description: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRightsprodVoucherRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 供应商权益编码
  supplyRightsCode: string;
  // 权益实例
  voucherCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      supplyRightsCode: 'supply_rights_code',
      voucherCode: 'voucher_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      supplyRightsCode: 'string',
      voucherCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRightsprodVoucherResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 用户ID
  userId?: string;
  // 用户手机号
  phoneNumber?: string;
  // 用户openId
  openId?: string;
  // 应用ID
  appId?: string;
  // 供应商权益编码
  supplyRightsCode?: string;
  // 权益实例ID
  voucherCode?: string;
  // 权益名称
  rightsName?: string;
  // 权益面额
  faceAmount?: string;
  // 剩余可用金额
  availableAmount?: string;
  // 权益实例状态
  status?: string;
  // 过期时间
  expireTime?: string;
  // 生效时间
  effectTime?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      userId: 'user_id',
      phoneNumber: 'phone_number',
      openId: 'open_id',
      appId: 'app_id',
      supplyRightsCode: 'supply_rights_code',
      voucherCode: 'voucher_code',
      rightsName: 'rights_name',
      faceAmount: 'face_amount',
      availableAmount: 'available_amount',
      status: 'status',
      expireTime: 'expire_time',
      effectTime: 'effect_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      userId: 'string',
      phoneNumber: 'string',
      openId: 'string',
      appId: 'string',
      supplyRightsCode: 'string',
      voucherCode: 'string',
      rightsName: 'string',
      faceAmount: 'string',
      availableAmount: 'string',
      status: 'string',
      expireTime: 'string',
      effectTime: 'string',
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
          sdk_version: "1.1.12",
          _prod_code: "GESAAS_SPI",
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
   * Description: 分账结果通知第三方(废弃)
   * Summary: 分账结果通知第三方(废弃)
   */
  async callbackOrderSettlement(request: CallbackOrderSettlementRequest): Promise<CallbackOrderSettlementResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.callbackOrderSettlementEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 分账结果通知第三方(废弃)
   * Summary: 分账结果通知第三方(废弃)
   */
  async callbackOrderSettlementEx(request: CallbackOrderSettlementRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CallbackOrderSettlementResponse> {
    Util.validateModel(request);
    return $tea.cast<CallbackOrderSettlementResponse>(await this.doRequest("1.0", "antdigital.gesaasspi.order.settlement.callback", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CallbackOrderSettlementResponse({}));
  }

  /**
   * @remarks
   * Description: 权益SaaS-订单回调通知SPI
   * Summary: 权益SaaS-订单回调通知SPI
   */
  async callbackGesaasOrder(request: CallbackGesaasOrderRequest): Promise<CallbackGesaasOrderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.callbackGesaasOrderEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 权益SaaS-订单回调通知SPI
   * Summary: 权益SaaS-订单回调通知SPI
   */
  async callbackGesaasOrderEx(request: CallbackGesaasOrderRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CallbackGesaasOrderResponse> {
    Util.validateModel(request);
    return $tea.cast<CallbackGesaasOrderResponse>(await this.doRequest("1.0", "antdigital.gesaasspi.gesaas.order.callback", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CallbackGesaasOrderResponse({}));
  }

  /**
   * @remarks
   * Description: 权益中心权益券状态推送
   * Summary: 券状态推送
   */
  async pushRightsprodVoucher(request: PushRightsprodVoucherRequest): Promise<PushRightsprodVoucherResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pushRightsprodVoucherEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 权益中心权益券状态推送
   * Summary: 券状态推送
   */
  async pushRightsprodVoucherEx(request: PushRightsprodVoucherRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PushRightsprodVoucherResponse> {
    Util.validateModel(request);
    return $tea.cast<PushRightsprodVoucherResponse>(await this.doRequest("1.0", "antdigital.gesaasspi.rightsprod.voucher.push", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PushRightsprodVoucherResponse({}));
  }

  /**
   * @remarks
   * Description: 权益中心券状态变更回调通知
   * Summary: 权益中心券状态变更回调通知
   */
  async callbackRightsprodStatus(request: CallbackRightsprodStatusRequest): Promise<CallbackRightsprodStatusResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.callbackRightsprodStatusEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 权益中心券状态变更回调通知
   * Summary: 权益中心券状态变更回调通知
   */
  async callbackRightsprodStatusEx(request: CallbackRightsprodStatusRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CallbackRightsprodStatusResponse> {
    Util.validateModel(request);
    return $tea.cast<CallbackRightsprodStatusResponse>(await this.doRequest("1.0", "antdigital.gesaasspi.rightsprod.status.callback", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CallbackRightsprodStatusResponse({}));
  }

  /**
   * @remarks
   * Description: 券操作回调通知
   * Summary: 券操作回调通知
   */
  async callbackRightsprodOperation(request: CallbackRightsprodOperationRequest): Promise<CallbackRightsprodOperationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.callbackRightsprodOperationEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 券操作回调通知
   * Summary: 券操作回调通知
   */
  async callbackRightsprodOperationEx(request: CallbackRightsprodOperationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CallbackRightsprodOperationResponse> {
    Util.validateModel(request);
    return $tea.cast<CallbackRightsprodOperationResponse>(await this.doRequest("1.0", "antdigital.gesaasspi.rightsprod.operation.callback", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CallbackRightsprodOperationResponse({}));
  }

  /**
   * @remarks
   * Description: 权益供应商权益发放spi
   * Summary: 权益供应商权益发放spi
   */
  async pushRightsprodGrantrights(request: PushRightsprodGrantrightsRequest): Promise<PushRightsprodGrantrightsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pushRightsprodGrantrightsEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 权益供应商权益发放spi
   * Summary: 权益供应商权益发放spi
   */
  async pushRightsprodGrantrightsEx(request: PushRightsprodGrantrightsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PushRightsprodGrantrightsResponse> {
    Util.validateModel(request);
    return $tea.cast<PushRightsprodGrantrightsResponse>(await this.doRequest("1.0", "antdigital.gesaasspi.rightsprod.grantrights.push", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PushRightsprodGrantrightsResponse({}));
  }

  /**
   * @remarks
   * Description: 权益供应商 权益配置基本信息查询接口
   * Summary: 权益供应商 权益配置基本信息查询接口
   */
  async queryRightsprodConfig(request: QueryRightsprodConfigRequest): Promise<QueryRightsprodConfigResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryRightsprodConfigEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 权益供应商 权益配置基本信息查询接口
   * Summary: 权益供应商 权益配置基本信息查询接口
   */
  async queryRightsprodConfigEx(request: QueryRightsprodConfigRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryRightsprodConfigResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryRightsprodConfigResponse>(await this.doRequest("1.0", "antdigital.gesaasspi.rightsprod.config.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryRightsprodConfigResponse({}));
  }

  /**
   * @remarks
   * Description: 获取具体权益实例的实时状态与基本信息
   * Summary: 获取具体权益实例的实时状态与基本信息
   */
  async queryRightsprodVoucher(request: QueryRightsprodVoucherRequest): Promise<QueryRightsprodVoucherResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryRightsprodVoucherEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 获取具体权益实例的实时状态与基本信息
   * Summary: 获取具体权益实例的实时状态与基本信息
   */
  async queryRightsprodVoucherEx(request: QueryRightsprodVoucherRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryRightsprodVoucherResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryRightsprodVoucherResponse>(await this.doRequest("1.0", "antdigital.gesaasspi.rightsprod.voucher.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryRightsprodVoucherResponse({}));
  }

}
