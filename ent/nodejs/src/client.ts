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

// 收益模型
export class Revenue extends $tea.Model {
  // 收益币种，目前仅支持CNY
  currency: string;
  // 收益金额，单位为分
  value: number;
  static names(): { [key: string]: string } {
    return {
      currency: 'currency',
      value: 'value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      currency: 'string',
      value: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 交易订单信息
export class TradeOrder extends $tea.Model {
  // 订单唯一编号
  orderNo: string;
  // 订单原始金额，单位分
  originalTotalAmount: number;
  // 订单实付金额，单位分
  actualTotalAmount: number;
  // 数量
  itemCount: number;
  // 币种，暂时只支持人民币 CNY
  currency?: string;
  static names(): { [key: string]: string } {
    return {
      orderNo: 'order_no',
      originalTotalAmount: 'original_total_amount',
      actualTotalAmount: 'actual_total_amount',
      itemCount: 'item_count',
      currency: 'currency',
    };
  }

  static types(): { [key: string]: any } {
    return {
      orderNo: 'string',
      originalTotalAmount: 'number',
      actualTotalAmount: 'number',
      itemCount: 'number',
      currency: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 发放区间信息
export class Stage extends $tea.Model {
  // 票数区间上限
  upperLimit: number;
  // 票数区间下限
  lowerLimit: number;
  // 当前区间粉丝粒数量，单位分个
  tokenAmount: number;
  // 当前区间粉丝粒价格，单位分
  tokenPrice: number;
  static names(): { [key: string]: string } {
    return {
      upperLimit: 'upper_limit',
      lowerLimit: 'lower_limit',
      tokenAmount: 'token_amount',
      tokenPrice: 'token_price',
    };
  }

  static types(): { [key: string]: any } {
    return {
      upperLimit: 'number',
      lowerLimit: 'number',
      tokenAmount: 'number',
      tokenPrice: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 项目
export class Project extends $tea.Model {
  // 项目对应的合约 ID
  contractId?: string;
  // 项目结束时间，精确到毫秒，FILM类型订单必填
  projectEndTime?: string;
  // 项目ID
  projectId: string;
  // 项目名称
  projectName?: string;
  // 项目开始时间，精确到毫秒，FILM类型订单必填
  projectStartTime?: string;
  // 项目类型，目前支持FILM：电影，CAR：汽车
  projectType: string;
  static names(): { [key: string]: string } {
    return {
      contractId: 'contract_id',
      projectEndTime: 'project_end_time',
      projectId: 'project_id',
      projectName: 'project_name',
      projectStartTime: 'project_start_time',
      projectType: 'project_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      contractId: 'string',
      projectEndTime: 'string',
      projectId: 'string',
      projectName: 'string',
      projectStartTime: 'string',
      projectType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 粉丝粒操作流水
export class TokenOperationDetail extends $tea.Model {
  // 粉丝粒操作流水状态，pending：发放中，confirmed：已到账，canceled：已取消
  status: string;
  // 粉丝粒数量，单位分个
  tokenAmount: number;
  // 明细发生时间
  time: string;
  // 明细信息
  info: string;
  // 唯一业务单号
  bizId: string;
  // 订单编号
  orderNo: string;
  static names(): { [key: string]: string } {
    return {
      status: 'status',
      tokenAmount: 'token_amount',
      time: 'time',
      info: 'info',
      bizId: 'biz_id',
      orderNo: 'order_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      status: 'string',
      tokenAmount: 'number',
      time: 'string',
      info: 'string',
      bizId: 'string',
      orderNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 用户收益明细
export class UserRevenueDetail extends $tea.Model {
  // 累计收益
  accumulativeRevenue: Revenue;
  // 待发放粉丝粒数量，单位分个。
  pendingTokenAmount: number;
  // 作品名称
  projectName: string;
  // 可兑现粉丝粒数量，单位分个。
  redeemableTokenAmount: number;
  // 已兑现粉丝粒数量，单位分个
  redeemedTokenAmount: number;
  // 已发放粉丝粒数量，单位分个。
  releasedTokenAmount: number;
  // 粉丝粒单价，单位分
  tokenPrice: number;
  // 可零收益
  withdrawRevenue: Revenue;
  static names(): { [key: string]: string } {
    return {
      accumulativeRevenue: 'accumulative_revenue',
      pendingTokenAmount: 'pending_token_amount',
      projectName: 'project_name',
      redeemableTokenAmount: 'redeemable_token_amount',
      redeemedTokenAmount: 'redeemed_token_amount',
      releasedTokenAmount: 'released_token_amount',
      tokenPrice: 'token_price',
      withdrawRevenue: 'withdraw_revenue',
    };
  }

  static types(): { [key: string]: any } {
    return {
      accumulativeRevenue: Revenue,
      pendingTokenAmount: 'number',
      projectName: 'string',
      redeemableTokenAmount: 'number',
      redeemedTokenAmount: 'number',
      releasedTokenAmount: 'number',
      tokenPrice: 'number',
      withdrawRevenue: Revenue,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 用户资产明细
export class UserAssetDetail extends $tea.Model {
  // 粉丝粒变化数量，带符号整数，单位分个。
  asset: number;
  // 资产类型：PRE_ALLOCATION（待发放），RELEASED（已到账），CANCELLED（已取消），REDEEMING（兑现中），REDEEMED（已兑现）
  assetType: string;
  // 业务单号
  bizNo: string;
  // 事件时间，时区GMT+8，精确到毫秒。
  eventTime: string;
  // 备注信息
  memo: string;
  // 项目名称
  projectName: string;
  // 收益变化额度，单位为分。
  revenue: Revenue;
  static names(): { [key: string]: string } {
    return {
      asset: 'asset',
      assetType: 'asset_type',
      bizNo: 'biz_no',
      eventTime: 'event_time',
      memo: 'memo',
      projectName: 'project_name',
      revenue: 'revenue',
    };
  }

  static types(): { [key: string]: any } {
    return {
      asset: 'number',
      assetType: 'string',
      bizNo: 'string',
      eventTime: 'string',
      memo: 'string',
      projectName: 'string',
      revenue: Revenue,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 用户资产信息
export class AssetDetail extends $tea.Model {
  // Token获得类型
  gainType: string;
  // Token发放状态
  status: string;
  // 购票数
  ticketNumber: number;
  // Token数，单位为分个，1分个=0.01个
  token: number;
  // Token展示数
  tokenDisplay: string;
  // 用户昵称
  nickname: string;
  static names(): { [key: string]: string } {
    return {
      gainType: 'gain_type',
      status: 'status',
      ticketNumber: 'ticket_number',
      token: 'token',
      tokenDisplay: 'token_display',
      nickname: 'nickname',
    };
  }

  static types(): { [key: string]: any } {
    return {
      gainType: 'string',
      status: 'string',
      ticketNumber: 'number',
      token: 'number',
      tokenDisplay: 'string',
      nickname: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 订单详情
export class Order extends $tea.Model {
  // 实付金额，单位分
  actualTotalAmount: number;
  // 币种，目前仅支持 CNY
  currency?: string;
  // 数量
  itemCount: number;
  // 唯一订单号
  orderNo: string;
  // 订单状态，ORDER_CREATE：订单创建，ORDER_CANCEL：订单取消
  orderStatus: string;
  // 原始金额，单位分
  originalTotalAmount: number;
  // 确认类型，DIRECT：直接发放，TWO_STEP：两部发放。该字段可为空，默认为 TWO_STEP
  confirmType?: string;
  static names(): { [key: string]: string } {
    return {
      actualTotalAmount: 'actual_total_amount',
      currency: 'currency',
      itemCount: 'item_count',
      orderNo: 'order_no',
      orderStatus: 'order_status',
      originalTotalAmount: 'original_total_amount',
      confirmType: 'confirm_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      actualTotalAmount: 'number',
      currency: 'string',
      itemCount: 'number',
      orderNo: 'string',
      orderStatus: 'string',
      originalTotalAmount: 'number',
      confirmType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 金额模型
export class Money extends $tea.Model {
  // 金额，单位分
  value: number;
  // 币种，暂只支持人民币CNY
  currency: string;
  static names(): { [key: string]: string } {
    return {
      value: 'value',
      currency: 'currency',
    };
  }

  static types(): { [key: string]: any } {
    return {
      value: 'number',
      currency: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 当前用户收益
export class CurrentRevenue extends $tea.Model {
  // 币种，当前仅支持CNY
  currency: string;
  // 金额，单位为分
  value: number;
  static names(): { [key: string]: string } {
    return {
      currency: 'currency',
      value: 'value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      currency: 'string',
      value: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 累计全部参与收益
export class AccumulativeRevenue extends $tea.Model {
  // 币种，当前仅支持 CNY
  currency: string;
  // 金额，单位为分
  value: number;
  static names(): { [key: string]: string } {
    return {
      currency: 'currency',
      value: 'value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      currency: 'string',
      value: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 用户结构体
export class User extends $tea.Model {
  // 用户账户，手机号格式为： +区号-手机号，分享码：6位字母，支付宝登录账号：手机号/邮箱
  userIdNo: string;
  // 用户账号类型，当前仅支持手机号和分享码，PHONE：手机号，SHARE_CODE：分享码，
  // ALIPAY_LOGON_ID：支付宝登录账号
  userIdType: string;
  static names(): { [key: string]: string } {
    return {
      userIdNo: 'user_id_no',
      userIdType: 'user_id_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      userIdNo: 'string',
      userIdType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCustomerProjectRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 登录支付宝账号，手机号或者邮箱地址
  logonId: string;
  // 登录账号类型，PHONE 为手机号，EMAIL 为邮箱地址。
  logonIdType: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      logonId: 'logon_id',
      logonIdType: 'logon_id_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      logonId: 'string',
      logonIdType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCustomerProjectResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 项目列表，元素为项目名称。
  projects?: Project[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      projects: 'projects',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      projects: { 'type': 'array', 'itemType': Project },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCustomerDataRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 资产类型：PRE_ALLOCATION（待发放），RELEASED（已到账），CANCELLED（已取消），REDEEMING（兑现中），REDEEMED（已兑现）
  assetType?: string;
  // 合约ID
  contractId?: string;
  // 数据类型，ASSET：资产信息， REVENUE：收益信息
  dataType: string;
  // 截止时间，时区GMT+8，精确到毫秒
  endTime?: string;
  // 登录支付宝的账号，手机号或者邮箱
  logonId: string;
  // 登录账号类型，PHONE：手机号， EMAIL：邮箱地址
  logonIdType: string;
  // 排序方式，ASC：升序， DESC：降序，默认按照时间降序
  orderBy?: string;
  // 页码
  pageNum?: number;
  // 页面大小
  pageSize?: number;
  // 起始时间，时区GMT+8，精确到毫秒
  startTime?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      assetType: 'asset_type',
      contractId: 'contract_id',
      dataType: 'data_type',
      endTime: 'end_time',
      logonId: 'logon_id',
      logonIdType: 'logon_id_type',
      orderBy: 'order_by',
      pageNum: 'page_num',
      pageSize: 'page_size',
      startTime: 'start_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      assetType: 'string',
      contractId: 'string',
      dataType: 'string',
      endTime: 'string',
      logonId: 'string',
      logonIdType: 'string',
      orderBy: 'string',
      pageNum: 'number',
      pageSize: 'number',
      startTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCustomerDataResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 数据类型，ASSET：资产信息， REVENUE：收益信息
  dataType?: string;
  // 登录支付宝的账号，手机号或者邮箱地址
  logonId?: string;
  // 登录账号类型，PHONE：手机号， EMAIL：电子邮箱
  logonIdType?: string;
  // 页码
  pageNum?: number;
  // 页面大小
  pageSize?: number;
  // 总数
  totalCount?: number;
  // 用户资产信息列表
  userAssetDetails?: UserAssetDetail[];
  // 用户收益信息
  userRevenueData?: UserRevenueDetail;
  // 用户虚拟唯一标识
  vid?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      dataType: 'data_type',
      logonId: 'logon_id',
      logonIdType: 'logon_id_type',
      pageNum: 'page_num',
      pageSize: 'page_size',
      totalCount: 'total_count',
      userAssetDetails: 'user_asset_details',
      userRevenueData: 'user_revenue_data',
      vid: 'vid',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      dataType: 'string',
      logonId: 'string',
      logonIdType: 'string',
      pageNum: 'number',
      pageSize: 'number',
      totalCount: 'number',
      userAssetDetails: { 'type': 'array', 'itemType': UserAssetDetail },
      userRevenueData: UserRevenueDetail,
      vid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetUserSharecodeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 分享者账号，如果账号类型为手机号则格式如 +86-11 位手机号，如果账号类型为支付宝账号，则填写邮箱地址或者 11 位手机号
  sharerId: string;
  // 分享者账号类型，PHONE：手机号，ALIPAY_LOGON_ID：支付宝账号
  sharerIdType: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      sharerId: 'sharer_id',
      sharerIdType: 'sharer_id_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      sharerId: 'string',
      sharerIdType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetUserSharecodeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 分享码
  shareCode?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      shareCode: 'share_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      shareCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SendUserProjectordermsgRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 购买者
  buyer: User;
  // 链ID
  chainId: string;
  // 订单详情
  order: Order;
  // 项目信息
  project: Project;
  // 分享者
  sharer: User;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      buyer: 'buyer',
      chainId: 'chain_id',
      order: 'order',
      project: 'project',
      sharer: 'sharer',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      buyer: User,
      chainId: 'string',
      order: Order,
      project: Project,
      sharer: User,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SendUserProjectordermsgResponse extends $tea.Model {
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

export class QueryProjectInfoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 项目ID
  projectId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      projectId: 'project_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      projectId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryProjectInfoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 项目名称
  projectName?: string;
  // 总粉丝粒数，单位分个
  totalTokenAmount?: number;
  // 未发放粉丝粒数，单位分个
  remainingTokenAmount?: number;
  // 已发放粉丝粒数，单位分个
  releasedTokenAmount?: number;
  // 已提现粉丝粒数，单位分个
  redeemedTokenAmount?: number;
  // 总资金金额，单位分
  totalPrizeAmount?: Money;
  // 未消耗资金金额，单位分
  unusedPrizeAmount?: Money;
  // 已消耗资金金额，单位分
  usedPrizeAmount?: Money;
  // 开始发放时间
  allocationStartTime?: string;
  // 停止发放时间
  allocationEndTime?: string;
  // 开始兑现时间
  redeemStartTime?: string;
  // 停止兑现时间
  redeemEndTime?: string;
  // 发放该项目粉丝粒的订单内票数总和
  ticketNumber?: number;
  // 当前粉丝粒单价，单位分
  currentTokenPrice?: Money;
  // 粉丝粒保底价格，单位分
  minTokenPrice?: Money;
  // 发放区间信息
  currentStage?: Stage;
  // 所有发放区间信息
  allStages?: Stage[];
  // 项目参与用户数
  projectUserNum?: number;
  // 项目订单总数
  projectOrderNum?: number;
  // 项目已售商品总数
  projectItemNum?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      projectName: 'project_name',
      totalTokenAmount: 'total_token_amount',
      remainingTokenAmount: 'remaining_token_amount',
      releasedTokenAmount: 'released_token_amount',
      redeemedTokenAmount: 'redeemed_token_amount',
      totalPrizeAmount: 'total_prize_amount',
      unusedPrizeAmount: 'unused_prize_amount',
      usedPrizeAmount: 'used_prize_amount',
      allocationStartTime: 'allocation_start_time',
      allocationEndTime: 'allocation_end_time',
      redeemStartTime: 'redeem_start_time',
      redeemEndTime: 'redeem_end_time',
      ticketNumber: 'ticket_number',
      currentTokenPrice: 'current_token_price',
      minTokenPrice: 'min_token_price',
      currentStage: 'current_stage',
      allStages: 'all_stages',
      projectUserNum: 'project_user_num',
      projectOrderNum: 'project_order_num',
      projectItemNum: 'project_item_num',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      projectName: 'string',
      totalTokenAmount: 'number',
      remainingTokenAmount: 'number',
      releasedTokenAmount: 'number',
      redeemedTokenAmount: 'number',
      totalPrizeAmount: Money,
      unusedPrizeAmount: Money,
      usedPrizeAmount: Money,
      allocationStartTime: 'string',
      allocationEndTime: 'string',
      redeemStartTime: 'string',
      redeemEndTime: 'string',
      ticketNumber: 'number',
      currentTokenPrice: Money,
      minTokenPrice: Money,
      currentStage: Stage,
      allStages: { 'type': 'array', 'itemType': Stage },
      projectUserNum: 'number',
      projectOrderNum: 'number',
      projectItemNum: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryUserInfoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 项目唯一编码
  projectId: string;
  // 用户账号信息
  user: User;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      projectId: 'project_id',
      user: 'user',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      projectId: 'string',
      user: User,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryUserInfoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 项目名称
  projectName?: string;
  // 已获得粉丝粒总数，单位分个
  gainedTokenAmount?: number;
  // 当前粉丝粒持有数量，单位分个
  currentTokenAmount?: number;
  // 已兑现粉丝粒数量，单位分个
  redeemedTokenAmount?: number;
  // 累计获得奖金
  accumulativeRevenue?: Revenue;
  // 当前可兑奖金
  currentRevenue?: Revenue;
  // 已兑现奖金
  redeemedRevenue?: Revenue;
  // 自购商品数量
  buyAmountFromSelf?: number;
  // 分享购买商品数量
  buyAmountFromShare?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      projectName: 'project_name',
      gainedTokenAmount: 'gained_token_amount',
      currentTokenAmount: 'current_token_amount',
      redeemedTokenAmount: 'redeemed_token_amount',
      accumulativeRevenue: 'accumulative_revenue',
      currentRevenue: 'current_revenue',
      redeemedRevenue: 'redeemed_revenue',
      buyAmountFromSelf: 'buy_amount_from_self',
      buyAmountFromShare: 'buy_amount_from_share',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      projectName: 'string',
      gainedTokenAmount: 'number',
      currentTokenAmount: 'number',
      redeemedTokenAmount: 'number',
      accumulativeRevenue: Revenue,
      currentRevenue: Revenue,
      redeemedRevenue: Revenue,
      buyAmountFromSelf: 'number',
      buyAmountFromShare: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryUserTokenallocationdetailRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 项目唯一编码
  projectId: string;
  // 用户账户信息
  user: User;
  // 页码
  pageNum: number;
  // 页面大小
  pageSize: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      projectId: 'project_id',
      user: 'user',
      pageNum: 'page_num',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      projectId: 'string',
      user: User,
      pageNum: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryUserTokenallocationdetailResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 粉丝粒操作流水
  allocationDetail?: TokenOperationDetail[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      allocationDetail: 'allocation_detail',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      allocationDetail: { 'type': 'array', 'itemType': TokenOperationDetail },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryUserTokenredeemdetailRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 项目唯一编码
  projectId: string;
  // 用户账户信息
  user: User;
  // 页码
  pageNum: number;
  // 页面大小
  pageSize: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      projectId: 'project_id',
      user: 'user',
      pageNum: 'page_num',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      projectId: 'string',
      user: User,
      pageNum: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryUserTokenredeemdetailResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 兑现流水
  redeemDetail?: TokenOperationDetail[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      redeemDetail: 'redeem_detail',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      redeemDetail: { 'type': 'array', 'itemType': TokenOperationDetail },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecEventReportRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 事件类型，目前支持类型 VISIT：访问事件，TRADE：交易事件，SHARE：分享事件
  eventType: string;
  // 事件实例编码，目前支持访问事件，VISIT类别包括MINI_HOME_PAGE：访问首页，CONTRACT_DETAIL_OAGE：访问项目详情页，SHARE_LANDING_PAGE：访问分享页，TRADE类别包括TRADE_SUCCESS：购买成功，REFUND_SUCCESS: 退货成功，SHARE类别包括SHARE_FROM_MERCHANT
  eventInstanceCode: string;
  // 购买人或者访问者
  eventChild?: User;
  // 分享者
  eventParent?: User;
  // 唯一业务单号
  requestId: string;
  // 项目唯一编号，访问详情页和回流页、购买事件必填
  projectId?: string;
  // 到账类型，DIRECT：直接到账， TWO_STEP_MANUAL：手动到账，TWO_STEP：定时到账
  confirmType?: string;
  // 到账时间。当到账类型为定时到账时，该字段必填。
  confirmTime?: string;
  // 交易订单数据
  tradeOrder?: TradeOrder;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      eventType: 'event_type',
      eventInstanceCode: 'event_instance_code',
      eventChild: 'event_child',
      eventParent: 'event_parent',
      requestId: 'request_id',
      projectId: 'project_id',
      confirmType: 'confirm_type',
      confirmTime: 'confirm_time',
      tradeOrder: 'trade_order',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      eventType: 'string',
      eventInstanceCode: 'string',
      eventChild: User,
      eventParent: User,
      requestId: 'string',
      projectId: 'string',
      confirmType: 'string',
      confirmTime: 'string',
      tradeOrder: TradeOrder,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecEventReportResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 事件唯一标识
  eventId?: string;
  // 事件状态，REPORTED：已上报，PROCESSING：处理中，PROCESSED： 处理完毕，NEED_RETRY：需要重试，EVENT_NOT_SUPPORTED：项目暂不支持该事件
  eventStatus?: string;
  // token状态，TOKEN_SUCCESS：token发放成功，TOKEN_PROCESSING：token发放中，TOKEN_FAILED：token发放失败，NO_NEED_ALLOCATION：无需发放
  tokenStatus?: string;
  // 购买者/访问者获得token数量
  tokenAmount?: number;
  // 提示信息
  message?: string;
  // 分享人获得token数
  parentTokenAmount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      eventId: 'event_id',
      eventStatus: 'event_status',
      tokenStatus: 'token_status',
      tokenAmount: 'token_amount',
      message: 'message',
      parentTokenAmount: 'parent_token_amount',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      eventId: 'string',
      eventStatus: 'string',
      tokenStatus: 'string',
      tokenAmount: 'number',
      message: 'string',
      parentTokenAmount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryEventInfoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 事件唯一标识
  eventId: string;
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

export class QueryEventInfoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 事件唯一标识
  eventId?: string;
  // 事件状态
  eventStatus?: string;
  // token发放状态
  tokenStatus?: string;
  // token数量
  tokenAmount?: number;
  // 事件上报时间
  eventTime?: string;
  // 事件处理结果提示信息
  message?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      eventId: 'event_id',
      eventStatus: 'event_status',
      tokenStatus: 'token_status',
      tokenAmount: 'token_amount',
      eventTime: 'event_time',
      message: 'message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      eventId: 'string',
      eventStatus: 'string',
      tokenStatus: 'string',
      tokenAmount: 'number',
      eventTime: 'string',
      message: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportNftMetaRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 在外部渠道的全局唯一id
  projectId: string;
  // nft资产标题
  title: string;
  // 缩略图OSS文件名
  miniImageUrl: string;
  // 原图地址
  originImageUrl: string;
  // 创作者
  author: string;
  // 作品简介信息文字描述
  description?: string;
  // 商品详情页url
  itemUrl: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      projectId: 'project_id',
      title: 'title',
      miniImageUrl: 'mini_image_url',
      originImageUrl: 'origin_image_url',
      author: 'author',
      description: 'description',
      itemUrl: 'item_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      projectId: 'string',
      title: 'string',
      miniImageUrl: 'string',
      originImageUrl: 'string',
      author: 'string',
      description: 'string',
      itemUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportNftMetaResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // nft_id资产id
  nftId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      nftId: 'nft_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      nftId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecNftTransferRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 支付用户uid
  alipayUid: string;
  // 在外部渠道的全局唯一id
  projectId: string;
  // 外部订单号（阿里拍卖成功的订单号）
  orderNo: string;
  // 拍品成交价（单位：分）
  priceCent: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      alipayUid: 'alipay_uid',
      projectId: 'project_id',
      orderNo: 'order_no',
      priceCent: 'price_cent',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      alipayUid: 'string',
      projectId: 'string',
      orderNo: 'string',
      priceCent: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecNftTransferResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 内部流水id
  transferId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      transferId: 'transfer_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      transferId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetIsvSharecodeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 电话号码/邮箱等登陆名
  logonId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      logonId: 'logon_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      logonId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetIsvSharecodeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 生成的ISV用户邀请码
  shareCode?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      shareCode: 'share_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      shareCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddProvisionRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 业务单号
  bizId: string;
  // 链 ID
  chainId: string;
  // 合约 ID
  contractId: string;
  // 调用方，例如租户 ID
  source: string;
  // 金额，单位为分
  value: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizId: 'biz_id',
      chainId: 'chain_id',
      contractId: 'contract_id',
      source: 'source',
      value: 'value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizId: 'string',
      chainId: 'string',
      contractId: 'string',
      source: 'string',
      value: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddProvisionResponse extends $tea.Model {
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

export class ReclaimProvisionExtraprovisionRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 业务单号
  bizId: string;
  // 链 ID
  chainId: string;
  // 合约 ID
  contractId: string;
  // 调用方，例如租户 ID
  source: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizId: 'biz_id',
      chainId: 'chain_id',
      contractId: 'contract_id',
      source: 'source',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizId: 'string',
      chainId: 'string',
      contractId: 'string',
      source: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ReclaimProvisionExtraprovisionResponse extends $tea.Model {
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

export class ExecTokenRedeemRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 业务单号
  bizId: string;
  // 链 ID
  chainId: string;
  // 合约 ID
  contractId: string;
  // 币种，目前仅支持 CNY
  currency: string;
  // 调用方
  source: string;
  // 要兑现的用户VID
  targetUser: string;
  // Token总金额，token_price*token_number 的结果，单位为分
  tokenAmount: number;
  // 兑现的Token数目
  tokenNumber: number;
  // 兑现的Token单价，单位为分
  tokenPrice: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizId: 'biz_id',
      chainId: 'chain_id',
      contractId: 'contract_id',
      currency: 'currency',
      source: 'source',
      targetUser: 'target_user',
      tokenAmount: 'token_amount',
      tokenNumber: 'token_number',
      tokenPrice: 'token_price',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizId: 'string',
      chainId: 'string',
      contractId: 'string',
      currency: 'string',
      source: 'string',
      targetUser: 'string',
      tokenAmount: 'number',
      tokenNumber: 'number',
      tokenPrice: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecTokenRedeemResponse extends $tea.Model {
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

export class GetTppSharecodeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 分享人在淘票票端绑定的支付宝UID
  alipayUid: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      alipayUid: 'alipay_uid',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      alipayUid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetTppSharecodeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 专属邀请码
  shareCode?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      shareCode: 'share_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      shareCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTppAllinfoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 支付宝UID
  alipayUid: string;
  // 排序方式，默认降序
  orderBy?: string;
  // 页码
  pageId: number;
  // 页面大小
  pageSize: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      alipayUid: 'alipay_uid',
      orderBy: 'order_by',
      pageId: 'page_id',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      alipayUid: 'string',
      orderBy: 'string',
      pageId: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTppAllinfoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 累计全部参与收益
  accumulativeRevenue?: Revenue;
  // 累计参与用书
  accumulativeUsers?: number;
  // 用户资产详情列表
  assetDetailList?: AssetDetail[];
  // 用户当前累计收益
  currentAccumulativeRevenue?: Revenue;
  // 当前用户收益
  currentRevenue?: Revenue;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      accumulativeRevenue: 'accumulative_revenue',
      accumulativeUsers: 'accumulative_users',
      assetDetailList: 'asset_detail_list',
      currentAccumulativeRevenue: 'current_accumulative_revenue',
      currentRevenue: 'current_revenue',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      accumulativeRevenue: Revenue,
      accumulativeUsers: 'number',
      assetDetailList: { 'type': 'array', 'itemType': AssetDetail },
      currentAccumulativeRevenue: Revenue,
      currentRevenue: Revenue,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTppParticipationinfoRequest extends $tea.Model {
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

export class QueryTppParticipationinfoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 累计参与用户数
  accumulativeUsers?: number;
  // 累计全部参与收益
  accumulativeRevenue?: AccumulativeRevenue;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      accumulativeUsers: 'accumulative_users',
      accumulativeRevenue: 'accumulative_revenue',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      accumulativeUsers: 'number',
      accumulativeRevenue: AccumulativeRevenue,
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
          sdk_version: "1.4.6",
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
   * Description: 查询用户参与的所有项目
   * Summary: 用户参与的项目查询
   */
  async queryCustomerProject(request: QueryCustomerProjectRequest): Promise<QueryCustomerProjectResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryCustomerProjectEx(request, headers, runtime);
  }

  /**
   * Description: 查询用户参与的所有项目
   * Summary: 用户参与的项目查询
   */
  async queryCustomerProjectEx(request: QueryCustomerProjectRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryCustomerProjectResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryCustomerProjectResponse>(await this.doRequest("1.0", "antchain.ent.customer.project.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryCustomerProjectResponse({}));
  }

  /**
   * Description: 查询用户数据的接口
   * Summary: 用户数据查询接口
   */
  async queryCustomerData(request: QueryCustomerDataRequest): Promise<QueryCustomerDataResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryCustomerDataEx(request, headers, runtime);
  }

  /**
   * Description: 查询用户数据的接口
   * Summary: 用户数据查询接口
   */
  async queryCustomerDataEx(request: QueryCustomerDataRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryCustomerDataResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryCustomerDataResponse>(await this.doRequest("1.0", "antchain.ent.customer.data.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryCustomerDataResponse({}));
  }

  /**
   * Description: 为用户创建分享码
   * Summary: 用户分享码创建接口
   */
  async getUserSharecode(request: GetUserSharecodeRequest): Promise<GetUserSharecodeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getUserSharecodeEx(request, headers, runtime);
  }

  /**
   * Description: 为用户创建分享码
   * Summary: 用户分享码创建接口
   */
  async getUserSharecodeEx(request: GetUserSharecodeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetUserSharecodeResponse> {
    Util.validateModel(request);
    return $tea.cast<GetUserSharecodeResponse>(await this.doRequest("1.0", "antchain.ent.user.sharecode.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetUserSharecodeResponse({}));
  }

  /**
   * Description: 发送用户的项目订单数据
   * Summary: 用户项目订单消息发送接口
   */
  async sendUserProjectordermsg(request: SendUserProjectordermsgRequest): Promise<SendUserProjectordermsgResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.sendUserProjectordermsgEx(request, headers, runtime);
  }

  /**
   * Description: 发送用户的项目订单数据
   * Summary: 用户项目订单消息发送接口
   */
  async sendUserProjectordermsgEx(request: SendUserProjectordermsgRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SendUserProjectordermsgResponse> {
    Util.validateModel(request);
    return $tea.cast<SendUserProjectordermsgResponse>(await this.doRequest("1.0", "antchain.ent.user.projectordermsg.send", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SendUserProjectordermsgResponse({}));
  }

  /**
   * Description: 查询项目信息查询
   * Summary: 项目信息查询接口
   */
  async queryProjectInfo(request: QueryProjectInfoRequest): Promise<QueryProjectInfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryProjectInfoEx(request, headers, runtime);
  }

  /**
   * Description: 查询项目信息查询
   * Summary: 项目信息查询接口
   */
  async queryProjectInfoEx(request: QueryProjectInfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryProjectInfoResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryProjectInfoResponse>(await this.doRequest("1.0", "antchain.ent.project.info.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryProjectInfoResponse({}));
  }

  /**
   * Description: 查询用户信息
   * Summary: 用户信息查询接口
   */
  async queryUserInfo(request: QueryUserInfoRequest): Promise<QueryUserInfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryUserInfoEx(request, headers, runtime);
  }

  /**
   * Description: 查询用户信息
   * Summary: 用户信息查询接口
   */
  async queryUserInfoEx(request: QueryUserInfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryUserInfoResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryUserInfoResponse>(await this.doRequest("1.0", "antchain.ent.user.info.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryUserInfoResponse({}));
  }

  /**
   * Description: 查询用户粉丝粒获得明细
   * Summary: 用户粉丝粒获得明细查询接口
   */
  async queryUserTokenallocationdetail(request: QueryUserTokenallocationdetailRequest): Promise<QueryUserTokenallocationdetailResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryUserTokenallocationdetailEx(request, headers, runtime);
  }

  /**
   * Description: 查询用户粉丝粒获得明细
   * Summary: 用户粉丝粒获得明细查询接口
   */
  async queryUserTokenallocationdetailEx(request: QueryUserTokenallocationdetailRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryUserTokenallocationdetailResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryUserTokenallocationdetailResponse>(await this.doRequest("1.0", "antchain.ent.user.tokenallocationdetail.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryUserTokenallocationdetailResponse({}));
  }

  /**
   * Description: 查询用户粉丝粒兑现明细
   * Summary: 用户粉丝粒兑现明细查询接口
   */
  async queryUserTokenredeemdetail(request: QueryUserTokenredeemdetailRequest): Promise<QueryUserTokenredeemdetailResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryUserTokenredeemdetailEx(request, headers, runtime);
  }

  /**
   * Description: 查询用户粉丝粒兑现明细
   * Summary: 用户粉丝粒兑现明细查询接口
   */
  async queryUserTokenredeemdetailEx(request: QueryUserTokenredeemdetailRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryUserTokenredeemdetailResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryUserTokenredeemdetailResponse>(await this.doRequest("1.0", "antchain.ent.user.tokenredeemdetail.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryUserTokenredeemdetailResponse({}));
  }

  /**
   * Description: 上报事件
   * Summary: 事件上报
   */
  async execEventReport(request: ExecEventReportRequest): Promise<ExecEventReportResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execEventReportEx(request, headers, runtime);
  }

  /**
   * Description: 上报事件
   * Summary: 事件上报
   */
  async execEventReportEx(request: ExecEventReportRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecEventReportResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecEventReportResponse>(await this.doRequest("1.0", "antchain.ent.event.report.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecEventReportResponse({}));
  }

  /**
   * Description: 查询事件信息
   * Summary: 事件信息查询
   */
  async queryEventInfo(request: QueryEventInfoRequest): Promise<QueryEventInfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryEventInfoEx(request, headers, runtime);
  }

  /**
   * Description: 查询事件信息
   * Summary: 事件信息查询
   */
  async queryEventInfoEx(request: QueryEventInfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryEventInfoResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryEventInfoResponse>(await this.doRequest("1.0", "antchain.ent.event.info.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryEventInfoResponse({}));
  }

  /**
   * Description: 阿里拍卖nft资产元数据导入
   * Summary: 阿里拍卖nft资产元数据导入
   */
  async importNftMeta(request: ImportNftMetaRequest): Promise<ImportNftMetaResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.importNftMetaEx(request, headers, runtime);
  }

  /**
   * Description: 阿里拍卖nft资产元数据导入
   * Summary: 阿里拍卖nft资产元数据导入
   */
  async importNftMetaEx(request: ImportNftMetaRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ImportNftMetaResponse> {
    Util.validateModel(request);
    return $tea.cast<ImportNftMetaResponse>(await this.doRequest("1.0", "antchain.ent.nft.meta.import", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ImportNftMetaResponse({}));
  }

  /**
   * Description: nft资产订单落库，链上流转
   * Summary: nft资产流转
   */
  async execNftTransfer(request: ExecNftTransferRequest): Promise<ExecNftTransferResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execNftTransferEx(request, headers, runtime);
  }

  /**
   * Description: nft资产订单落库，链上流转
   * Summary: nft资产流转
   */
  async execNftTransferEx(request: ExecNftTransferRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecNftTransferResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecNftTransferResponse>(await this.doRequest("1.0", "antchain.ent.nft.transfer.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecNftTransferResponse({}));
  }

  /**
   * Description: 外部ISV获取分享码接口
   * Summary: 获得ISV分享码
   */
  async getIsvSharecode(request: GetIsvSharecodeRequest): Promise<GetIsvSharecodeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getIsvSharecodeEx(request, headers, runtime);
  }

  /**
   * Description: 外部ISV获取分享码接口
   * Summary: 获得ISV分享码
   */
  async getIsvSharecodeEx(request: GetIsvSharecodeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetIsvSharecodeResponse> {
    Util.validateModel(request);
    return $tea.cast<GetIsvSharecodeResponse>(await this.doRequest("1.0", "antchain.ent.isv.sharecode.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetIsvSharecodeResponse({}));
  }

  /**
   * Description: 备付金追加接口
   * Summary: 备付金追加接口
   */
  async addProvision(request: AddProvisionRequest): Promise<AddProvisionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.addProvisionEx(request, headers, runtime);
  }

  /**
   * Description: 备付金追加接口
   * Summary: 备付金追加接口
   */
  async addProvisionEx(request: AddProvisionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AddProvisionResponse> {
    Util.validateModel(request);
    return $tea.cast<AddProvisionResponse>(await this.doRequest("1.0", "antchain.ent.provision.add", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AddProvisionResponse({}));
  }

  /**
   * Description: 赎回链上多余备付金
   * Summary: 赎回链上多余备付金
   */
  async reclaimProvisionExtraprovision(request: ReclaimProvisionExtraprovisionRequest): Promise<ReclaimProvisionExtraprovisionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.reclaimProvisionExtraprovisionEx(request, headers, runtime);
  }

  /**
   * Description: 赎回链上多余备付金
   * Summary: 赎回链上多余备付金
   */
  async reclaimProvisionExtraprovisionEx(request: ReclaimProvisionExtraprovisionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ReclaimProvisionExtraprovisionResponse> {
    Util.validateModel(request);
    return $tea.cast<ReclaimProvisionExtraprovisionResponse>(await this.doRequest("1.0", "antchain.ent.provision.extraprovision.reclaim", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ReclaimProvisionExtraprovisionResponse({}));
  }

  /**
   * Description: 链上Token兑现接口
   * Summary: 链上Token兑现接口
   */
  async execTokenRedeem(request: ExecTokenRedeemRequest): Promise<ExecTokenRedeemResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execTokenRedeemEx(request, headers, runtime);
  }

  /**
   * Description: 链上Token兑现接口
   * Summary: 链上Token兑现接口
   */
  async execTokenRedeemEx(request: ExecTokenRedeemRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecTokenRedeemResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecTokenRedeemResponse>(await this.doRequest("1.0", "antchain.ent.token.redeem.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecTokenRedeemResponse({}));
  }

  /**
   * Description: 针对淘票票的获取专属邀请码获取接口
   * Summary: 淘票票专属邀请码获取接口
   */
  async getTppSharecode(request: GetTppSharecodeRequest): Promise<GetTppSharecodeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getTppSharecodeEx(request, headers, runtime);
  }

  /**
   * Description: 针对淘票票的获取专属邀请码获取接口
   * Summary: 淘票票专属邀请码获取接口
   */
  async getTppSharecodeEx(request: GetTppSharecodeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetTppSharecodeResponse> {
    Util.validateModel(request);
    return $tea.cast<GetTppSharecodeResponse>(await this.doRequest("1.0", "antchain.ent.tpp.sharecode.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetTppSharecodeResponse({}));
  }

  /**
   * Description: 针对淘票票的查询全部必要信息的接口
   * Summary: 淘票票查询全部必要信息接口
   */
  async queryTppAllinfo(request: QueryTppAllinfoRequest): Promise<QueryTppAllinfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryTppAllinfoEx(request, headers, runtime);
  }

  /**
   * Description: 针对淘票票的查询全部必要信息的接口
   * Summary: 淘票票查询全部必要信息接口
   */
  async queryTppAllinfoEx(request: QueryTppAllinfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryTppAllinfoResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTppAllinfoResponse>(await this.doRequest("1.0", "antchain.ent.tpp.allinfo.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryTppAllinfoResponse({}));
  }

  /**
   * Description: 针对淘票票的参与信息查询接口
   * Summary: 淘票票参与信息查询接口
   */
  async queryTppParticipationinfo(request: QueryTppParticipationinfoRequest): Promise<QueryTppParticipationinfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryTppParticipationinfoEx(request, headers, runtime);
  }

  /**
   * Description: 针对淘票票的参与信息查询接口
   * Summary: 淘票票参与信息查询接口
   */
  async queryTppParticipationinfoEx(request: QueryTppParticipationinfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryTppParticipationinfoResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTppParticipationinfoResponse>(await this.doRequest("1.0", "antchain.ent.tpp.participationinfo.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryTppParticipationinfoResponse({}));
  }

}
