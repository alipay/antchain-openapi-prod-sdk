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

// 账号
export class AccountVO extends $tea.Model {
  // 账号
  accountNo: string;
  // 户名
  accountName: string;
  // 开户网点
  officalName: string;
  // 联行号
  officalNumber: string;
  // 账号状态
  // 
  status: string;
  // 分类 BUYER付款账户； SELLER收款账户
  category?: string[];
  // 上次支付是否失败
  lastPayFail?: boolean;
  // 支付方式 BALANCE余额账户；BILL票据账户
  payMethod?: string[];
  // 账户类型 MAIN 对公账户；ECOLLECTION e收宝
  type?: string;
  static names(): { [key: string]: string } {
    return {
      accountNo: 'account_no',
      accountName: 'account_name',
      officalName: 'offical_name',
      officalNumber: 'offical_number',
      status: 'status',
      category: 'category',
      lastPayFail: 'last_pay_fail',
      payMethod: 'pay_method',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      accountNo: 'string',
      accountName: 'string',
      officalName: 'string',
      officalNumber: 'string',
      status: 'string',
      category: { 'type': 'array', 'itemType': 'string' },
      lastPayFail: 'boolean',
      payMethod: { 'type': 'array', 'itemType': 'string' },
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 账号模型
export class AccountDTO extends $tea.Model {
  // 账号
  accountNo: string;
  // 户名
  accountName: string;
  // 开户网点
  officalName?: string;
  // 联行号
  officalNumber?: string;
  static names(): { [key: string]: string } {
    return {
      accountNo: 'account_no',
      accountName: 'account_name',
      officalName: 'offical_name',
      officalNumber: 'offical_number',
    };
  }

  static types(): { [key: string]: any } {
    return {
      accountNo: 'string',
      accountName: 'string',
      officalName: 'string',
      officalNumber: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 账户查询结果
export class AccountQueryResult extends $tea.Model {
  // 外部业务平台会员ID
  outMemberId: string;
  // 账号列表
  accounts?: AccountVO[];
  // 业务错误码(为空表示成功，否则为业务错误码)
  subCode?: string;
  // 业务错误描述
  subMsg?: string;
  static names(): { [key: string]: string } {
    return {
      outMemberId: 'out_member_id',
      accounts: 'accounts',
      subCode: 'sub_code',
      subMsg: 'sub_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      outMemberId: 'string',
      accounts: { 'type': 'array', 'itemType': AccountVO },
      subCode: 'string',
      subMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 支付请款结果
export class PaymentCaptureResult extends $tea.Model {
  // 外部业务平台原始交易号
  outOrderId: string;
  // 描述资金流的模型，通常资金流分为：SALE 销售模；AUTH_CAPTURE 预授权模式；
  // 
  fundMode?: string;
  // 交易状态。PAYING(支付处理中);PAY_SUCCESS(支付成功);PAY_FAIL(支付失败); CAPTURING(请款中);CAPTURE_SUCCESS(请款成功);CAPTURE_FAIL(请款失败); REFUNDING(退款中);REFUND_SUCCESS(退款成功);REFUND_FAIL(退款失败); CLOSING(关单中);CLOSE_SUCCESS(关单成功);CLOSE_FAIL(关单失败);
  orderState?: string;
  // 可用金额，单位为元。可用金额=总金额-已请款金额-已撤销金额。精确到小数点后两位，取值范围[0.01,100000000]
  availableAmount?: number;
  // 支付币种三位字母编码。（编码规则遵循https://zh.wikipedia.org/wiki/ISO_4217）
  availableCurrency?: string;
  // 资金操作状态。PROCESSING(处理中);SUCCESS(成功);FAIL(失败);
  state?: string;
  // 外部请求ID，需要支持部分请款/退款的平台必填
  // 
  outRequestId?: string;
  // 业务错误码(为空表示成功，否则为业务错误码)
  subCode?: string;
  // 业务错误描述
  subMsg?: string;
  static names(): { [key: string]: string } {
    return {
      outOrderId: 'out_order_id',
      fundMode: 'fund_mode',
      orderState: 'order_state',
      availableAmount: 'available_amount',
      availableCurrency: 'available_currency',
      state: 'state',
      outRequestId: 'out_request_id',
      subCode: 'sub_code',
      subMsg: 'sub_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      outOrderId: 'string',
      fundMode: 'string',
      orderState: 'string',
      availableAmount: 'number',
      availableCurrency: 'string',
      state: 'string',
      outRequestId: 'string',
      subCode: 'string',
      subMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 机构代码查询结果
export class InstCodeResult extends $tea.Model {
  // 机构编码
  // 
  channelMemberCode?: string;
  // 机构网点联行号
  // 
  channelOfficialNumber?: string;
  // 业务错误码(为空表示成功，否则为业务错误码)
  subCode?: string;
  // 业务错误描述
  subMsg?: string;
  static names(): { [key: string]: string } {
    return {
      channelMemberCode: 'channel_member_code',
      channelOfficialNumber: 'channel_official_number',
      subCode: 'sub_code',
      subMsg: 'sub_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      channelMemberCode: 'string',
      channelOfficialNumber: 'string',
      subCode: 'string',
      subMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 创建交易结果
export class PaymentCreateResult extends $tea.Model {
  // 	
  // 会员所属业务平台在智能科技的会员ID
  platformMemberId: string;
  // 付款方在外部业务平台的用户ID
  outPayerId: string;
  // 收款方外部业务平台会员ID，收单场景表示卖家，纯资金场景表示收款方
  outPayeeId?: string;
  // 外部业务平台原始交易号
  outOrderId: string;
  // 交易状态。PAYING(支付处理中);PAY_SUCCESS(支付成功);PAY_FAIL(支付失败); CAPTURING(请款中);CAPTURE_SUCCESS(请款成功);CAPTURE_FAIL(请款失败); REFUNDING(退款中);REFUND_SUCCESS(退款成功);REFUND_FAIL(退款失败); CLOSING(关单中);CLOSE_SUCCESS(关单成功);CLOSE_FAIL(关单失败);
  orderState?: string;
  // 描述资金流的模型，通常资金流分为：SALE 销售模；AUTH_CAPTURE 预授权模式；
  fundMode?: string;
  // 收款方账号
  payeeAccount?: AccountDTO;
  // 业务错误码(为空表示成功，否则为业务错误码)
  subCode?: string;
  // 业务错误描述
  subMsg?: string;
  static names(): { [key: string]: string } {
    return {
      platformMemberId: 'platform_member_id',
      outPayerId: 'out_payer_id',
      outPayeeId: 'out_payee_id',
      outOrderId: 'out_order_id',
      orderState: 'order_state',
      fundMode: 'fund_mode',
      payeeAccount: 'payee_account',
      subCode: 'sub_code',
      subMsg: 'sub_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      platformMemberId: 'string',
      outPayerId: 'string',
      outPayeeId: 'string',
      outOrderId: 'string',
      orderState: 'string',
      fundMode: 'string',
      payeeAccount: AccountDTO,
      subCode: 'string',
      subMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 交易查询结果
export class PaymentQueryResult extends $tea.Model {
  // 会员所属业务平台在智能科技的会员ID
  platformMemberId: string;
  // 付款方在外部业务平台的用户ID
  outPayerId: string;
  // 收款方在外部业务平台的用户ID；收单场景表示卖家，纯资金场景表示收款方
  outPayeeId?: string;
  // 外部业务平台原始交易号
  outOrderId: string;
  // 描述资金流的模型，通常资金流分为：SALE 销售模；AUTH_CAPTURE 预授权模式；
  fundMode?: string;
  // 交易状态。INIT(初始创建);PAYING(支付处理中);PAY_SUCCESS(支付成功);PAY_FAIL(支付失败); CAPTURING(请款中);CAPTURE_SUCCESS(请款成功);CAPTURE_FAIL(请款失败); REFUNDING(退款中);REFUND_SUCCESS(退款成功);REFUND_FAIL(退款失败); CLOSING(关单中);CLOSE_SUCCESS(关单成功);CLOSE_FAIL(关单失败);PART_PROCESSING(部分处理中);PART_SUCCESS(部分请款部分退款)
  orderState?: string;
  // 银行或其他支付服务提供方结果码
  paymentResultCode?: string;
  // 银行或其他支付服务提供方支付结果描述
  paymentResultMessage?: string;
  // 业务错误码(为空表示成功，否则为业务错误码)
  subCode?: string;
  // 业务错误描述
  subMsg?: string;
  static names(): { [key: string]: string } {
    return {
      platformMemberId: 'platform_member_id',
      outPayerId: 'out_payer_id',
      outPayeeId: 'out_payee_id',
      outOrderId: 'out_order_id',
      fundMode: 'fund_mode',
      orderState: 'order_state',
      paymentResultCode: 'payment_result_code',
      paymentResultMessage: 'payment_result_message',
      subCode: 'sub_code',
      subMsg: 'sub_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      platformMemberId: 'string',
      outPayerId: 'string',
      outPayeeId: 'string',
      outOrderId: 'string',
      fundMode: 'string',
      orderState: 'string',
      paymentResultCode: 'string',
      paymentResultMessage: 'string',
      subCode: 'string',
      subMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 客户产品签约结果
export class AgreementQueryResult extends $tea.Model {
  // 会员所属业务平台在智能科技的会员ID
  platformMemberId: string;
  // 外部业务平台的用户ID
  outMemberId: string;
  // 签约产品的产品码
  productCode?: string;
  // 签约产品的产品名称
  productName?: string;
  // 签约的产品类型
  // 
  productType?: string;
  // 签约时间
  // 
  signingTime?: string;
  // 到期时间
  endTime?: string;
  // 是否有效
  // 
  activeFlag?: boolean;
  // 业务错误码(为空表示成功，否则为业务错误码)
  subCode?: string;
  // 业务错误描述
  subMsg?: string;
  static names(): { [key: string]: string } {
    return {
      platformMemberId: 'platform_member_id',
      outMemberId: 'out_member_id',
      productCode: 'product_code',
      productName: 'product_name',
      productType: 'product_type',
      signingTime: 'signing_time',
      endTime: 'end_time',
      activeFlag: 'active_flag',
      subCode: 'sub_code',
      subMsg: 'sub_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      platformMemberId: 'string',
      outMemberId: 'string',
      productCode: 'string',
      productName: 'string',
      productType: 'string',
      signingTime: 'string',
      endTime: 'string',
      activeFlag: 'boolean',
      subCode: 'string',
      subMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 资金操作明细查询结果
export class FundItemQueryResult extends $tea.Model {
  // 会员所属业务平台在智能科技的会员ID
  platformMemberId: string;
  // 外部业务平台原始交易号
  outOrderId: string;
  // 外部请求ID
  // 
  outRequestId?: string;
  // 资金操作类型。CAPTURE(请款);CANCEL(撤销/退款);
  fundType: string;
  // 资金操作状态。PROCESSING(处理中);SUCCESS(成功);FAIL(失败);
  state?: string;
  // 本次请求金额，单位为元。
  requestAmount?: number;
  // 支付币种三位字母编码。（编码规则遵循https://zh.wikipedia.org/wiki/ISO_4217）
  requestCurrency?: string;
  // 业务错误码(为空表示成功，否则为业务错误码)
  subCode?: string;
  // 业务错误描述
  subMsg?: string;
  static names(): { [key: string]: string } {
    return {
      platformMemberId: 'platform_member_id',
      outOrderId: 'out_order_id',
      outRequestId: 'out_request_id',
      fundType: 'fund_type',
      state: 'state',
      requestAmount: 'request_amount',
      requestCurrency: 'request_currency',
      subCode: 'sub_code',
      subMsg: 'sub_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      platformMemberId: 'string',
      outOrderId: 'string',
      outRequestId: 'string',
      fundType: 'string',
      state: 'string',
      requestAmount: 'number',
      requestCurrency: 'string',
      subCode: 'string',
      subMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 交易撤销结果
export class PaymentCancelResult extends $tea.Model {
  // 外部业务平台原始交易号
  outOrderId: string;
  // 描述资金流的模型，通常资金流分为：SALE 销售模；AUTH_CAPTURE 预授权模式；
  // 
  fundMode?: string;
  // 交易状态。PAYING(支付处理中);PAY_SUCCESS(支付成功);PAY_FAIL(支付失败); CAPTURING(请款中);CAPTURE_SUCCESS(请款成功);CAPTURE_FAIL(请款失败); REFUNDING(退款中);REFUND_SUCCESS(退款成功);REFUND_FAIL(退款失败); CLOSING(关单中);CLOSE_SUCCESS(关单成功);CLOSE_FAIL(关单失败);
  orderState?: string;
  // 可用金额，单位为元。可用金额=总金额-已请款金额-已撤销金额。精确到小数点后两位，取值范围[0.01,100000000]
  availableAmount?: number;
  // 支付币种三位字母编码。（编码规则遵循https://zh.wikipedia.org/wiki/ISO_4217）
  availableCurrency?: string;
  // 资金操作状态。PROCESSING(处理中);SUCCESS(成功);FAIL(失败);
  state?: string;
  // 外部请求ID，需要支持部分请款/退款的平台必填
  // 
  outRequestId?: string;
  // 业务错误码(为空表示成功，否则为业务错误码)
  subCode?: string;
  // 业务错误描述
  subMsg?: string;
  static names(): { [key: string]: string } {
    return {
      outOrderId: 'out_order_id',
      fundMode: 'fund_mode',
      orderState: 'order_state',
      availableAmount: 'available_amount',
      availableCurrency: 'available_currency',
      state: 'state',
      outRequestId: 'out_request_id',
      subCode: 'sub_code',
      subMsg: 'sub_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      outOrderId: 'string',
      fundMode: 'string',
      orderState: 'string',
      availableAmount: 'number',
      availableCurrency: 'string',
      state: 'string',
      outRequestId: 'string',
      subCode: 'string',
      subMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 创建交易前检查结果
export class PaymentCreateCheckResult extends $tea.Model {
  // 检查是否通过。PASS(检查通过);NOT_PASS(检查不通过)
  result: string;
  // 业务错误码(为空表示成功，否则为业务错误码)
  subCode?: string;
  // 业务错误描述
  subMsg?: string;
  static names(): { [key: string]: string } {
    return {
      result: 'result',
      subCode: 'sub_code',
      subMsg: 'sub_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      result: 'string',
      subCode: 'string',
      subMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySaasPaymentRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // json请求参数
  bizContent: string;
  // 编排版本
  serviceVersion: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizContent: 'biz_content',
      serviceVersion: 'service_version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizContent: 'string',
      serviceVersion: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySaasPaymentResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 交易查询结果
  data?: PaymentQueryResult;
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
      data: PaymentQueryResult,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckSaasPaymentRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // json请求参数
  bizContent: string;
  // 版本号
  serviceVersion: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizContent: 'biz_content',
      serviceVersion: 'service_version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizContent: 'string',
      serviceVersion: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckSaasPaymentResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 交易前检查结果
  data?: PaymentCreateCheckResult;
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
      data: PaymentCreateCheckResult,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateSaasPaymentRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // json请求参数
  bizContent: string;
  // 版本号
  serviceVersion: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizContent: 'biz_content',
      serviceVersion: 'service_version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizContent: 'string',
      serviceVersion: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateSaasPaymentResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 交易创建结果
  data?: PaymentCreateResult;
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
      data: PaymentCreateResult,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelSaasPaymentRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // json请求参数
  bizContent: string;
  // 版本号
  serviceVersion: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizContent: 'biz_content',
      serviceVersion: 'service_version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizContent: 'string',
      serviceVersion: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelSaasPaymentResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 交易撤销结果
  data?: PaymentCancelResult;
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
      data: PaymentCancelResult,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySaasAccountRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // json请求参数
  bizContent: string;
  // 版本号
  serviceVersion: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizContent: 'biz_content',
      serviceVersion: 'service_version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizContent: 'string',
      serviceVersion: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySaasAccountResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 账户查询结果
  data?: AccountQueryResult;
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
      data: AccountQueryResult,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySaasFunditemRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // json请求参数
  bizContent: string;
  // 版本号
  serviceVersion: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizContent: 'biz_content',
      serviceVersion: 'service_version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizContent: 'string',
      serviceVersion: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySaasFunditemResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 资金操作明细查询结果
  data?: FundItemQueryResult;
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
      data: FundItemQueryResult,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySaasAgreementRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // json请求参数
  bizContent: string;
  // 版本号
  serviceVersion: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizContent: 'biz_content',
      serviceVersion: 'service_version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizContent: 'string',
      serviceVersion: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySaasAgreementResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 客户产品签约结果
  // 
  data?: AgreementQueryResult;
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
      data: AgreementQueryResult,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CaptureSaasPaymentRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // json请求参数
  bizContent: string;
  // 版本号
  serviceVersion: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizContent: 'biz_content',
      serviceVersion: 'service_version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizContent: 'string',
      serviceVersion: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CaptureSaasPaymentResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 支付请款结果
  // 
  data?: PaymentCaptureResult;
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
      data: PaymentCaptureResult,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySaasInstRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // json请求参数
  bizContent: string;
  // 版本号
  serviceVersion: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizContent: 'biz_content',
      serviceVersion: 'service_version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizContent: 'string',
      serviceVersion: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySaasInstResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 机构代码查询结果
  // 
  data?: InstCodeResult;
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
      data: InstCodeResult,
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
          sdk_version: "1.0.5",
          _prod_code: "DEFINCASHIER",
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
   * Description: 适用于创建交易后，查询交易详情。
   * Summary: B2B资金服务查询交易
   */
  async querySaasPayment(request: QuerySaasPaymentRequest): Promise<QuerySaasPaymentResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.querySaasPaymentEx(request, headers, runtime);
  }

  /**
   * Description: 适用于创建交易后，查询交易详情。
   * Summary: B2B资金服务查询交易
   */
  async querySaasPaymentEx(request: QuerySaasPaymentRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QuerySaasPaymentResponse> {
    Util.validateModel(request);
    return $tea.cast<QuerySaasPaymentResponse>(await this.doRequest("1.0", "antchain.defincashier.saas.payment.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QuerySaasPaymentResponse({}));
  }

  /**
   * Description: B2B支付场景，创建交易前检查
   * Summary: B2B资金服务交易前检查
   */
  async checkSaasPayment(request: CheckSaasPaymentRequest): Promise<CheckSaasPaymentResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.checkSaasPaymentEx(request, headers, runtime);
  }

  /**
   * Description: B2B支付场景，创建交易前检查
   * Summary: B2B资金服务交易前检查
   */
  async checkSaasPaymentEx(request: CheckSaasPaymentRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CheckSaasPaymentResponse> {
    Util.validateModel(request);
    return $tea.cast<CheckSaasPaymentResponse>(await this.doRequest("1.0", "antchain.defincashier.saas.payment.check", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CheckSaasPaymentResponse({}));
  }

  /**
   * Description: B2B支付场景，创建交易服务
   * Summary: B2B资金服务创建交易
   */
  async createSaasPayment(request: CreateSaasPaymentRequest): Promise<CreateSaasPaymentResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createSaasPaymentEx(request, headers, runtime);
  }

  /**
   * Description: B2B支付场景，创建交易服务
   * Summary: B2B资金服务创建交易
   */
  async createSaasPaymentEx(request: CreateSaasPaymentRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateSaasPaymentResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateSaasPaymentResponse>(await this.doRequest("1.0", "antchain.defincashier.saas.payment.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateSaasPaymentResponse({}));
  }

  /**
   * Description: 撤销适用于商户、用户创建交易后，业务上不需要继续完成支付或放款。由业务平台或商户发起交易撤销动作，当交易未支付成功时，直接关单；当担保交易模式预授权成功时，完成预授权资金的解冻或退回。系统内部同步受理，异步处理，以异步处理结果为准。未支付交易只能撤销一次，已支付交易支持部分金额撤销，总撤销金额不超过支付金额。
   * Summary: B2B资金服务交易撤销
   */
  async cancelSaasPayment(request: CancelSaasPaymentRequest): Promise<CancelSaasPaymentResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.cancelSaasPaymentEx(request, headers, runtime);
  }

  /**
   * Description: 撤销适用于商户、用户创建交易后，业务上不需要继续完成支付或放款。由业务平台或商户发起交易撤销动作，当交易未支付成功时，直接关单；当担保交易模式预授权成功时，完成预授权资金的解冻或退回。系统内部同步受理，异步处理，以异步处理结果为准。未支付交易只能撤销一次，已支付交易支持部分金额撤销，总撤销金额不超过支付金额。
   * Summary: B2B资金服务交易撤销
   */
  async cancelSaasPaymentEx(request: CancelSaasPaymentRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CancelSaasPaymentResponse> {
    Util.validateModel(request);
    return $tea.cast<CancelSaasPaymentResponse>(await this.doRequest("1.0", "antchain.defincashier.saas.payment.cancel", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CancelSaasPaymentResponse({}));
  }

  /**
   * Description: 用于外部业务平台会员查询已绑定账号
   * Summary: B2B资金服务账号查询
   */
  async querySaasAccount(request: QuerySaasAccountRequest): Promise<QuerySaasAccountResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.querySaasAccountEx(request, headers, runtime);
  }

  /**
   * Description: 用于外部业务平台会员查询已绑定账号
   * Summary: B2B资金服务账号查询
   */
  async querySaasAccountEx(request: QuerySaasAccountRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QuerySaasAccountResponse> {
    Util.validateModel(request);
    return $tea.cast<QuerySaasAccountResponse>(await this.doRequest("1.0", "antchain.defincashier.saas.account.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QuerySaasAccountResponse({}));
  }

  /**
   * Description: 可以根据流水号查询请款，退款等资金操作明细
   * Summary: B2B资金服务交易资金操作明细查询
   */
  async querySaasFunditem(request: QuerySaasFunditemRequest): Promise<QuerySaasFunditemResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.querySaasFunditemEx(request, headers, runtime);
  }

  /**
   * Description: 可以根据流水号查询请款，退款等资金操作明细
   * Summary: B2B资金服务交易资金操作明细查询
   */
  async querySaasFunditemEx(request: QuerySaasFunditemRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QuerySaasFunditemResponse> {
    Util.validateModel(request);
    return $tea.cast<QuerySaasFunditemResponse>(await this.doRequest("1.0", "antchain.defincashier.saas.funditem.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QuerySaasFunditemResponse({}));
  }

  /**
   * Description: 查询会员的产品签约协议
   * Summary: B2B资金服务签约查询
   */
  async querySaasAgreement(request: QuerySaasAgreementRequest): Promise<QuerySaasAgreementResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.querySaasAgreementEx(request, headers, runtime);
  }

  /**
   * Description: 查询会员的产品签约协议
   * Summary: B2B资金服务签约查询
   */
  async querySaasAgreementEx(request: QuerySaasAgreementRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QuerySaasAgreementResponse> {
    Util.validateModel(request);
    return $tea.cast<QuerySaasAgreementResponse>(await this.doRequest("1.0", "antchain.defincashier.saas.agreement.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QuerySaasAgreementResponse({}));
  }

  /**
   * Description: 请款适用于商户、用户创建担保交易(预授权资金模式)，用户预授权成功完成资金冻结后，由业务平台确认到达打款给商户的时机后发起请款。完成预授权冻结资金解冻，并打款给商户。系统内部同步受理，异步处理，以异步交易结果通知为准。每笔交易支持多次部分请款，总请款金额不超过支付金额。
   * Summary: B2B资金服务交易请款
   */
  async captureSaasPayment(request: CaptureSaasPaymentRequest): Promise<CaptureSaasPaymentResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.captureSaasPaymentEx(request, headers, runtime);
  }

  /**
   * Description: 请款适用于商户、用户创建担保交易(预授权资金模式)，用户预授权成功完成资金冻结后，由业务平台确认到达打款给商户的时机后发起请款。完成预授权冻结资金解冻，并打款给商户。系统内部同步受理，异步处理，以异步交易结果通知为准。每笔交易支持多次部分请款，总请款金额不超过支付金额。
   * Summary: B2B资金服务交易请款
   */
  async captureSaasPaymentEx(request: CaptureSaasPaymentRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CaptureSaasPaymentResponse> {
    Util.validateModel(request);
    return $tea.cast<CaptureSaasPaymentResponse>(await this.doRequest("1.0", "antchain.defincashier.saas.payment.capture", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CaptureSaasPaymentResponse({}));
  }

  /**
   * Description: 用于外部业务平台会员查询机构（银行）的联行号和机构编码
   * Summary: B2B资金服务机构信息查询
   */
  async querySaasInst(request: QuerySaasInstRequest): Promise<QuerySaasInstResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.querySaasInstEx(request, headers, runtime);
  }

  /**
   * Description: 用于外部业务平台会员查询机构（银行）的联行号和机构编码
   * Summary: B2B资金服务机构信息查询
   */
  async querySaasInstEx(request: QuerySaasInstRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QuerySaasInstResponse> {
    Util.validateModel(request);
    return $tea.cast<QuerySaasInstResponse>(await this.doRequest("1.0", "antchain.defincashier.saas.inst.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QuerySaasInstResponse({}));
  }

}
