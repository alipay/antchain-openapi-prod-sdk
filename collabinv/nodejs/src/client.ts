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

// 聊天消息
export class ChatMessageInfo extends $tea.Model {
  // 会话ID
  sessionId: string;
  // 提问内容
  query?: string;
  // 恢复内容
  answer?: string;
  // 创建时间
  createDate: string;
  static names(): { [key: string]: string } {
    return {
      sessionId: 'session_id',
      query: 'query',
      answer: 'answer',
      createDate: 'create_date',
    };
  }

  static types(): { [key: string]: any } {
    return {
      sessionId: 'string',
      query: 'string',
      answer: 'string',
      createDate: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 消费行业数据
export class IndustryData extends $tea.Model {
  // 行业
  industry: string;
  // 区域
  province: string;
  // 日期
  tradeDate: string;
  // 线上线下 1:线下，0:线上，-1:全部
  ofpType: string;
  // 消费规模指数(销售金额)
  tradeScale: string;
  // 交易活跃指数(次数)
  tradeActivity: string;
  // 消费价值指数(金额/次数)
  tradeValue: string;
  // 交易覆盖指数(去重人数)
  tradeCoverage: string;
  static names(): { [key: string]: string } {
    return {
      industry: 'industry',
      province: 'province',
      tradeDate: 'trade_date',
      ofpType: 'ofp_type',
      tradeScale: 'trade_scale',
      tradeActivity: 'trade_activity',
      tradeValue: 'trade_value',
      tradeCoverage: 'trade_coverage',
    };
  }

  static types(): { [key: string]: any } {
    return {
      industry: 'string',
      province: 'string',
      tradeDate: 'string',
      ofpType: 'string',
      tradeScale: 'string',
      tradeActivity: 'string',
      tradeValue: 'string',
      tradeCoverage: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// agent会话信息
export class ChatConversationInfo extends $tea.Model {
  // 会话ID
  sessionId: string;
  // 用户ID
  userId: string;
  // agent ID
  agentId: string;
  // 会话名称
  title?: string;
  // 创建时间
  createDate: string;
  static names(): { [key: string]: string } {
    return {
      sessionId: 'session_id',
      userId: 'user_id',
      agentId: 'agent_id',
      title: 'title',
      createDate: 'create_date',
    };
  }

  static types(): { [key: string]: any } {
    return {
      sessionId: 'string',
      userId: 'string',
      agentId: 'string',
      title: 'string',
      createDate: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 特征集信息
export class FeatureSetInfo extends $tea.Model {
  // 特征集编码
  featuresetCode: string;
  // 名称
  featuresetName: string;
  // 数量
  nums: string;
  // 描述
  desc: string;
  static names(): { [key: string]: string } {
    return {
      featuresetCode: 'featureset_code',
      featuresetName: 'featureset_name',
      nums: 'nums',
      desc: 'desc',
    };
  }

  static types(): { [key: string]: any } {
    return {
      featuresetCode: 'string',
      featuresetName: 'string',
      nums: 'string',
      desc: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 用户匹配信息
export class CarUserMatch extends $tea.Model {
  // 设备号或者手机号md5
  matchId: string;
  // 需要匹配的id类型：手机号md5、安卓设备号md5、ios设备号md5
  idType: string;
  static names(): { [key: string]: string } {
    return {
      matchId: 'match_id',
      idType: 'id_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      matchId: 'string',
      idType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 指标数据
export class IndexData extends $tea.Model {
  // 月份
  // 
  month: string;
  // 高低线
  cityTier: string;
  // 省份编码
  provinceCode: string;
  // 总交易笔数指数
  totalCnt: string;
  // 总交易金额指数
  totalAmt: string;
  // 总店铺数指数
  totalShop: string;
  // 去重用户数指数
  totalCsm: string;
  // 其中老店店铺总交易笔数指数
  existingCnt: string;
  // 其中老店店铺总交易金额
  existingAmt: string;
  // 其中老店店铺数量指数
  existingShop: string;
  // 当月新增店铺数指数
  newShop: string;
  // 分金额段指数
  amtRange: string;
  // 店铺标签指数
  shopTag: string;
  // 品牌码
  brandCode: string;
  // 同店上年同期评分
  existingAmtLastYear: string;
  // 年月日
  date: string;
  static names(): { [key: string]: string } {
    return {
      month: 'month',
      cityTier: 'city_tier',
      provinceCode: 'province_code',
      totalCnt: 'total_cnt',
      totalAmt: 'total_amt',
      totalShop: 'total_shop',
      totalCsm: 'total_csm',
      existingCnt: 'existing_cnt',
      existingAmt: 'existing_amt',
      existingShop: 'existing_shop',
      newShop: 'new_shop',
      amtRange: 'amt_range',
      shopTag: 'shop_tag',
      brandCode: 'brand_code',
      existingAmtLastYear: 'existing_amt_last_year',
      date: 'date',
    };
  }

  static types(): { [key: string]: any } {
    return {
      month: 'string',
      cityTier: 'string',
      provinceCode: 'string',
      totalCnt: 'string',
      totalAmt: 'string',
      totalShop: 'string',
      totalCsm: 'string',
      existingCnt: 'string',
      existingAmt: 'string',
      existingShop: 'string',
      newShop: 'string',
      amtRange: 'string',
      shopTag: 'string',
      brandCode: 'string',
      existingAmtLastYear: 'string',
      date: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 调用统计
export class GwCallDataStats extends $tea.Model {
  // 租户
  invokeTenant?: string;
  // 租户ID
  invokeTenantId?: string;
  // 公key
  accessKey?: string;
  // 调用数量
  invokeCount?: string;
  // 调用查得统计
  successCount?: string;
  // id
  id: string;
  static names(): { [key: string]: string } {
    return {
      invokeTenant: 'invoke_tenant',
      invokeTenantId: 'invoke_tenant_id',
      accessKey: 'access_key',
      invokeCount: 'invoke_count',
      successCount: 'success_count',
      id: 'id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      invokeTenant: 'string',
      invokeTenantId: 'string',
      accessKey: 'string',
      invokeCount: 'string',
      successCount: 'string',
      id: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 分页信息
export class PageInfo extends $tea.Model {
  // 总数量
  total?: number;
  // 当前页
  pageIndex: number;
  // 页容量
  pageSize: number;
  static names(): { [key: string]: string } {
    return {
      total: 'total',
      pageIndex: 'page_index',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      total: 'number',
      pageIndex: 'number',
      pageSize: 'number',
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

export class QueryAgentSseRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用户ID
  userId: string;
  // 会话id
  sessionId: string;
  // 查询词条
  query: string;
  // 会话存活时长，单位毫秒，默认5分钟，最大不超过10分钟
  aliveTime: number;
  // agent_id
  agentId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      userId: 'user_id',
      sessionId: 'session_id',
      query: 'query',
      aliveTime: 'alive_time',
      agentId: 'agent_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      userId: 'string',
      sessionId: 'string',
      query: 'string',
      aliveTime: 'number',
      agentId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAgentSseResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 消息
  message?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      message: 'message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      message: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListAgentConversationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用户ID
  userId: string;
  // agent id
  agentId: string;
  // page_info
  pageInfo: PageInfo;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      userId: 'user_id',
      agentId: 'agent_id',
      pageInfo: 'page_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      userId: 'string',
      agentId: 'string',
      pageInfo: PageInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListAgentConversationResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // page_info
  pageInfo?: PageInfo;
  // 会话列表信息
  conversationData?: ChatConversationInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      pageInfo: 'page_info',
      conversationData: 'conversation_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      pageInfo: PageInfo,
      conversationData: { 'type': 'array', 'itemType': ChatConversationInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteAgentConversationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用户ID
  userId: string;
  // 会话ID
  sessionId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      userId: 'user_id',
      sessionId: 'session_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      userId: 'string',
      sessionId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteAgentConversationResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 操作结果
  result?: boolean;
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
      result: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchdeleteAgentConversationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用户ID
  userId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      userId: 'user_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      userId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchdeleteAgentConversationResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 操作结果
  result?: boolean;
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
      result: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListAgentMessageRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用户id
  userId: string;
  // 会话ID
  sessionId: string;
  // page_info
  pageInfo: PageInfo;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      userId: 'user_id',
      sessionId: 'session_id',
      pageInfo: 'page_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      userId: 'string',
      sessionId: 'string',
      pageInfo: PageInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListAgentMessageResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // page_info
  pageInfo?: PageInfo;
  // 消息列表
  messageData?: ChatMessageInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      pageInfo: 'page_info',
      messageData: 'message_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      pageInfo: PageInfo,
      messageData: { 'type': 'array', 'itemType': ChatMessageInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateAgentConversationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用户ID
  userId: string;
  // 会话ID
  sessionId: string;
  // 会话名称
  title: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      userId: 'user_id',
      sessionId: 'session_id',
      title: 'title',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      userId: 'string',
      sessionId: 'string',
      title: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateAgentConversationResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 操作结果
  result?: boolean;
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
      result: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAgentCompletionRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用户ID
  userId: string;
  // 会话id
  sessionId: string;
  // 查询词条
  query: string;
  // 会话存活时长，单位毫秒，默认5分钟，最大不超过10分钟
  aliveTime?: number;
  // agent_id
  agentId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      userId: 'user_id',
      sessionId: 'session_id',
      query: 'query',
      aliveTime: 'alive_time',
      agentId: 'agent_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      userId: 'string',
      sessionId: 'string',
      query: 'string',
      aliveTime: 'number',
      agentId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAgentCompletionResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 消息
  message?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      message: 'message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      message: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class MatchCarloanUsersRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 需要匹配的值
  matchId: string;
  // 需要匹配的id类型：手机号md5、安卓设备号md5、ios设备号md5
  idType: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      matchId: 'match_id',
      idType: 'id_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      matchId: 'string',
      idType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class MatchCarloanUsersResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 成功或者失败
  isSuccess?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      isSuccess: 'is_success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      isSuccess: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchqueryCarloanUsersRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用户匹配数据
  userMatch: CarUserMatch[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      userMatch: 'user_match',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      userMatch: { 'type': 'array', 'itemType': CarUserMatch },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchqueryCarloanUsersResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 匹配成功的index
  matchResult?: number[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      matchResult: 'match_result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      matchResult: { 'type': 'array', 'itemType': 'number' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportCarloanUsersRequest extends $tea.Model {
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

export class ImportCarloanUsersResponse extends $tea.Model {
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

export class AddCaruserUsersRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 业务的id
  businessId: string[];
  // 数据的唯一code
  dataUniqloCode: string;
  // 批次数据编号
  dataPhaseCode: string;
  // 批次的数据量
  phaseDataNum: number;
  // 整体数据量
  uniqloDataNum: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      businessId: 'business_id',
      dataUniqloCode: 'data_uniqlo_code',
      dataPhaseCode: 'data_phase_code',
      phaseDataNum: 'phase_data_num',
      uniqloDataNum: 'uniqlo_data_num',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      businessId: { 'type': 'array', 'itemType': 'string' },
      dataUniqloCode: 'string',
      dataPhaseCode: 'string',
      phaseDataNum: 'number',
      uniqloDataNum: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddCaruserUsersResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 处理结果
  processResult?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      processResult: 'process_result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      processResult: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCarloanUsersRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 日期
  date: string;
  // 分页
  pageInfo: PageInfo;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      date: 'date',
      pageInfo: 'page_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      date: 'string',
      pageInfo: PageInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCarloanUsersResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 业务id
  data?: string[];
  // 分页
  pageInfo?: PageInfo;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      pageInfo: 'page_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: { 'type': 'array', 'itemType': 'string' },
      pageInfo: PageInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddCaruserTestRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 业务的id
  businessId: string[];
  // 数据的唯一code
  dataUniqloCode: string;
  // 批次数据编号
  datPhaseCode: string;
  // 批次的数据量
  dataNum: number;
  // 业务类型
  businessType: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      businessId: 'business_id',
      dataUniqloCode: 'data_uniqlo_code',
      datPhaseCode: 'dat_phase_code',
      dataNum: 'data_num',
      businessType: 'business_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      businessId: { 'type': 'array', 'itemType': 'string' },
      dataUniqloCode: 'string',
      datPhaseCode: 'string',
      dataNum: 'number',
      businessType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddCaruserTestResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 处理结果
  processResult?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      processResult: 'process_result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      processResult: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddCaruserPrdRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 业务的id
  businessId: string[];
  // 数据的唯一code
  dataUniqloCode: string;
  // 批次数据编号
  datPhaseCode: string;
  // 批次的数据量
  dataNum: number;
  // 业务类型
  businessType: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      businessId: 'business_id',
      dataUniqloCode: 'data_uniqlo_code',
      datPhaseCode: 'dat_phase_code',
      dataNum: 'data_num',
      businessType: 'business_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      businessId: { 'type': 'array', 'itemType': 'string' },
      dataUniqloCode: 'string',
      datPhaseCode: 'string',
      dataNum: 'number',
      businessType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddCaruserPrdResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 处理结果
  processResult?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      processResult: 'process_result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      processResult: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchqueryCarloanTestRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 日期
  date: string;
  // 查询条数
  dataNum: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      date: 'date',
      dataNum: 'data_num',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      date: 'string',
      dataNum: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchqueryCarloanTestResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 业务id
  businessIds?: string[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      businessIds: 'business_ids',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      businessIds: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchqueryCarloanPrdRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 日期
  date: string;
  // 查询条数
  dataNum: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      date: 'date',
      dataNum: 'data_num',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      date: 'string',
      dataNum: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchqueryCarloanPrdResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 业务id
  businessIds?: string[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      businessIds: 'business_ids',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      businessIds: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportIdmapSamplefileRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // oss文件名称
  fileName: string;
  // 项目ID
  projectInfoId: string;
  // 查询列
  paramType: string;
  // 结果列
  resultType: string;
  // 样本Code
  sampleCode: string;
  // 样本任务Code
  sampleTaskCode: string;
  // oss文件路径
  filePath: string;
  // 数据源code
  dataSource: string;
  // 结果加密方式
  encryptionMethod: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      fileName: 'file_name',
      projectInfoId: 'project_info_id',
      paramType: 'param_type',
      resultType: 'result_type',
      sampleCode: 'sample_code',
      sampleTaskCode: 'sample_task_code',
      filePath: 'file_path',
      dataSource: 'data_source',
      encryptionMethod: 'encryption_method',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      fileName: 'string',
      projectInfoId: 'string',
      paramType: 'string',
      resultType: 'string',
      sampleCode: 'string',
      sampleTaskCode: 'string',
      filePath: 'string',
      dataSource: 'string',
      encryptionMethod: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportIdmapSamplefileResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 上传结果地址路径
  resultFilePath?: string;
  // oss结果文件名称
  resultFileName?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      resultFilePath: 'result_file_path',
      resultFileName: 'result_file_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      resultFilePath: 'string',
      resultFileName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportIdmapPsiresultfileRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 文件路径
  filePath: string;
  // 文件名称
  fileName: string;
  // 项目唯一标识
  projectInfoId: string;
  // 样本编码
  sampleCode: string;
  // 样本任务编码
  sampleTaskCode: string;
  // 数据源编码
  dataSource: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      filePath: 'file_path',
      fileName: 'file_name',
      projectInfoId: 'project_info_id',
      sampleCode: 'sample_code',
      sampleTaskCode: 'sample_task_code',
      dataSource: 'data_source',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      filePath: 'string',
      fileName: 'string',
      projectInfoId: 'string',
      sampleCode: 'string',
      sampleTaskCode: 'string',
      dataSource: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportIdmapPsiresultfileResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 结果文件路径
  resultFilePath?: string;
  // 结果文件名称
  resultFileName?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      resultFilePath: 'result_file_path',
      resultFileName: 'result_file_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      resultFilePath: 'string',
      resultFileName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryIndexresearchBrandRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 品牌编码
  brandCode: string;
  // 时间月份yyyyMM
  month?: string;
  // test-测试数据。prod-正式数据
  dataType: string;
  // 时间频次 m-月/d-天
  timeType: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      brandCode: 'brand_code',
      month: 'month',
      dataType: 'data_type',
      timeType: 'time_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      brandCode: 'string',
      month: 'string',
      dataType: 'string',
      timeType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryIndexresearchBrandResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 指标数据
  indexData?: IndexData[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      indexData: 'index_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      indexData: { 'type': 'array', 'itemType': IndexData },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryIndexresearchBrandindexRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 品牌码
  brandCode?: string;
  // 店铺标签
  shopTag?: string;
  // 月份
  month?: string[];
  // 字段排序方式
  sort?: string[];
  // page_info
  pageInfo: PageInfo;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      brandCode: 'brand_code',
      shopTag: 'shop_tag',
      month: 'month',
      sort: 'sort',
      pageInfo: 'page_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      brandCode: 'string',
      shopTag: 'string',
      month: { 'type': 'array', 'itemType': 'string' },
      sort: { 'type': 'array', 'itemType': 'string' },
      pageInfo: PageInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryIndexresearchBrandindexResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // page_info
  pageInfo?: PageInfo;
  // index_data
  indexData?: IndexData[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      pageInfo: 'page_info',
      indexData: 'index_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      pageInfo: PageInfo,
      indexData: { 'type': 'array', 'itemType': IndexData },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryIndexresearchConsumeindustryRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 行业
  industry?: string;
  // 是否线上线下 1:线下，0:线上，-1:全部
  ofpType?: string;
  // 开始时间
  startTime?: string;
  // 结束时间
  endTime?: string;
  // 分页信息
  pageInfo: PageInfo;
  // 字段排序方式
  sort?: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      industry: 'industry',
      ofpType: 'ofp_type',
      startTime: 'start_time',
      endTime: 'end_time',
      pageInfo: 'page_info',
      sort: 'sort',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      industry: 'string',
      ofpType: 'string',
      startTime: 'string',
      endTime: 'string',
      pageInfo: PageInfo,
      sort: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryIndexresearchConsumeindustryResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 分页信息
  pageInfo?: PageInfo;
  // 消费行业数据
  industryData?: IndustryData[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      pageInfo: 'page_info',
      industryData: 'industry_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      pageInfo: PageInfo,
      industryData: { 'type': 'array', 'itemType': IndustryData },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryIndexresearchIndustryRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 行业
  industry?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      industry: 'industry',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      industry: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryIndexresearchIndustryResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 行业列表数据
  industryData?: string[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      industryData: 'industry_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      industryData: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryLocationInternalRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // md5加密的身份证号
  idNumber?: string;
  // md5加密的手机号
  phoneNo?: string;
  // 定位时间范围开始时间
  startTime: string;
  // 定位时间范围结束时间
  endTime: string;
  // 核查中心位置（经度,纬度）
  centerPosition?: string;
  // 核查省市区县范围
  distinctCounty?: string;
  // 协查类型：
  // 0: 为经纬度精准定位协查 (默认)
  // 1:  为区县定位 (省-市-区/县) 协查
  invType?: number;
  // 服务级别与结果值定义
  apiServiceLevel: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      idNumber: 'id_number',
      phoneNo: 'phone_no',
      startTime: 'start_time',
      endTime: 'end_time',
      centerPosition: 'center_position',
      distinctCounty: 'distinct_county',
      invType: 'inv_type',
      apiServiceLevel: 'api_service_level',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      idNumber: 'string',
      phoneNo: 'string',
      startTime: 'string',
      endTime: 'string',
      centerPosition: 'string',
      distinctCounty: 'string',
      invType: 'number',
      apiServiceLevel: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryLocationInternalResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 置信度取值：A/B/C
  confidenceValue?: string;
  // 扩展字段，其他信息
  extInfo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      confidenceValue: 'confidence_value',
      extInfo: 'ext_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      confidenceValue: 'string',
      extInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryLocationTradeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // md5加密的身份证号
  idNumber?: string;
  // md5加密的手机号
  phoneNo?: string;
  // 调用者用户ID（或外部系统业务ID）
  callerId: string;
  // 定位时间范围开始时间
  startTime: string;
  // 定位时间范围结束时间
  endTime: string;
  // 核查中心位置（经度,纬度）
  centerPosition?: string;
  // 核查省市区县范围
  distinctCounty?: string;
  // 协查类型：
  // 0: 为经纬度精准定位协查 (默认)
  // 1:  为区县定位 (省-市-区/县) 协查
  invType?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      idNumber: 'id_number',
      phoneNo: 'phone_no',
      callerId: 'caller_id',
      startTime: 'start_time',
      endTime: 'end_time',
      centerPosition: 'center_position',
      distinctCounty: 'distinct_county',
      invType: 'inv_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      idNumber: 'string',
      phoneNo: 'string',
      callerId: 'string',
      startTime: 'string',
      endTime: 'string',
      centerPosition: 'string',
      distinctCounty: 'string',
      invType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryLocationTradeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 置信度取值：A/B/C
  confidenceValue?: string;
  // 扩展字段，其他信息
  extInfo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      confidenceValue: 'confidence_value',
      extInfo: 'ext_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      confidenceValue: 'string',
      extInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushModelSamplefileRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户编码
  tenantCode: string;
  // 开始日期：示例 YYYYMMDD
  beginDate: string;
  // 样本内采样日期截止日：YYYYMMDD
  endDate: string;
  // 样本数据量
  orgNums: number;
  // 样本批次号，唯一，建议：租户code+时间戳
  sampleCode: string;
  // 文件路径，bucket 下路径
  filePath: string;
  // 文件名,以.csv结尾，分隔符为  ","号
  fileName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantCode: 'tenant_code',
      beginDate: 'begin_date',
      endDate: 'end_date',
      orgNums: 'org_nums',
      sampleCode: 'sample_code',
      filePath: 'file_path',
      fileName: 'file_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantCode: 'string',
      beginDate: 'string',
      endDate: 'string',
      orgNums: 'number',
      sampleCode: 'string',
      filePath: 'string',
      fileName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushModelSamplefileResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 轮训编码
  loopCode?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      loopCode: 'loop_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      loopCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecModelSampletaskRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户编码
  tenantCode: string;
  // 样本批次号，唯一，建议：租户code+时间戳
  sampleCode: string;
  // 特征集编码或模型编码，依据类型使用
  taskCode: string;
  // 任务类型：特征集 FEATURESET、模型分 MODEL
  taskType: string;
  // 本次事件序号编码
  sampleTaskCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantCode: 'tenant_code',
      sampleCode: 'sample_code',
      taskCode: 'task_code',
      taskType: 'task_type',
      sampleTaskCode: 'sample_task_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantCode: 'string',
      sampleCode: 'string',
      taskCode: 'string',
      taskType: 'string',
      sampleTaskCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecModelSampletaskResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 轮训编码
  loopCode?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      loopCode: 'loop_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      loopCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryModelSampletaskRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户编码
  tenantCode: string;
  // 事件查询序号编码，在有loop_code接口返回值的异步接口的值
  // 如：antchain.zkcollabinv.model.samplefile.push、antchain.zkcollabinv.model.sampletask.exec
  loopCode: string;
  // 阶段：poc_050 样本提交阶段，poc_500 任务跑批阶段
  phase: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantCode: 'tenant_code',
      loopCode: 'loop_code',
      phase: 'phase',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantCode: 'string',
      loopCode: 'string',
      phase: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryModelSampletaskResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 任务进度
  progress?: string;
  // 有输出的时候会有值
  files?: string[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      progress: 'progress',
      files: 'files',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      progress: 'string',
      files: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryModelFeaturesetRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户编码
  tenantCode: string;
  // 分页信息
  pageInfo: PageInfo;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantCode: 'tenant_code',
      pageInfo: 'page_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantCode: 'string',
      pageInfo: PageInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryModelFeaturesetResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 特征列表
  featuresets?: FeatureSetInfo[];
  // 分页信息
  pageInfo?: PageInfo;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      featuresets: 'featuresets',
      pageInfo: 'page_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      featuresets: { 'type': 'array', 'itemType': FeatureSetInfo },
      pageInfo: PageInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SubmitModelInstanceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户编码
  tenantCode: string;
  // 模型文件路径
  modelFilePath: string;
  // 特征集路径
  featuresFilePath: string;
  // 示例文件路径
  demoFilePath?: string;
  // 模型编码，同一租户下唯一，后续回溯生产调用标记
  modelCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantCode: 'tenant_code',
      modelFilePath: 'model_file_path',
      featuresFilePath: 'features_file_path',
      demoFilePath: 'demo_file_path',
      modelCode: 'model_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantCode: 'string',
      modelFilePath: 'string',
      featuresFilePath: 'string',
      demoFilePath: 'string',
      modelCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SubmitModelInstanceResponse extends $tea.Model {
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

export class QueryModelStatsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // yyyyMMdd
  invokeDay: string;
  // 类型：TENANT  租户；AK key维度
  type: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      invokeDay: 'invoke_day',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      invokeDay: 'string',
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryModelStatsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 数据
  datas?: GwCallDataStats[];
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
      datas: { 'type': 'array', 'itemType': GwCallDataStats },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryModelCommonscoreRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用户授权编码
  authNo: string;
  // 模型编码
  modelCode: string;
  // 用户id（客户身份证号/手机号的md5/sha256散列值）
  userId: string;
  // 用户id类型（身份证号：ID_NO；手机号：MOBILE_NO）
  userIdType: string;
  // user_id 散列类型: "MD5"：MD5（小写）, "SHA256" ： SHA256（小写）， "SM3"： SM3（小写）
  hashType: string;
  // 客户编码
  customerCode: string;
  // 流水号，串联链路用，非必填
  transNo?: string;
  // hash_type类型的散列后的操作，默认为空不加密。 如启用，需要对散列后的user_id 加密，可选用如下算法，类型1、AES/ECB/PKCS5PADDING 在加密后的二进制需要以字符集UTF-8，编码base64 方式赋值给user_id传输。 示例：AES秘钥：base64_aes_key = "CZqWzQ5JL8s5Zx2XVpGZGw=="，报文：plaintext = "Hello, 蚂蚁。" ，使用算法： AES/ECB/PKCS5PADDING ；密文：SI1wU1ePSFoMy5YzuxclFkbZ/FIXUHPRDbKBW85WolY=，配置了此项user_id应该传输此密文。
  userIdEncryptType?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      authNo: 'auth_no',
      modelCode: 'model_code',
      userId: 'user_id',
      userIdType: 'user_id_type',
      hashType: 'hash_type',
      customerCode: 'customer_code',
      transNo: 'trans_no',
      userIdEncryptType: 'user_id_encrypt_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      authNo: 'string',
      modelCode: 'string',
      userId: 'string',
      userIdType: 'string',
      hashType: 'string',
      customerCode: 'string',
      transNo: 'string',
      userIdEncryptType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryModelCommonscoreResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 模型分
  score?: string;
  // 流水号
  transNo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      score: 'score',
      transNo: 'trans_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      score: 'string',
      transNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchqueryModelCommonscoreRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用户ID
  userIds: string[];
  // 用户授权编码
  authNos?: string[];
  // 模型编码
  modelCode: string;
  // 用户id类型（身份证号：ID_NO；手机号：MOBILE_NO）
  userIdType: string;
  // user_id 散列类型: "MD5"：MD5（小写）, "SHA256" ： SHA256（小写）， "SM3"： SM3（小写）
  hashType: string;
  // 客户编码
  customerCode: string;
  // 流水号，串联链路用，非必填
  transNo?: string;
  // hash_type类型的散列后的操作，默认为空不加密。 如启用，需要对散列后的user_id 加密，可选用如下算法，类型1、AES/ECB/PKCS5PADDING 在加密后的二进制需要以字符集UTF-8，编码base64 方式赋值给user_id传输。 示例：AES秘钥：base64_aes_key = "CZqWzQ5JL8s5Zx2XVpGZGw=="，报文：plaintext = "Hello, 蚂蚁。" ，使用算法： AES/ECB/PKCS5PADDING ；密文：SI1wU1ePSFoMy5YzuxclFkbZ/FIXUHPRDbKBW85WolY=，配置了此项user_id应该传输此密文。
  userIdEncryptType?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      userIds: 'user_ids',
      authNos: 'auth_nos',
      modelCode: 'model_code',
      userIdType: 'user_id_type',
      hashType: 'hash_type',
      customerCode: 'customer_code',
      transNo: 'trans_no',
      userIdEncryptType: 'user_id_encrypt_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      userIds: { 'type': 'array', 'itemType': 'string' },
      authNos: { 'type': 'array', 'itemType': 'string' },
      modelCode: 'string',
      userIdType: 'string',
      hashType: 'string',
      customerCode: 'string',
      transNo: 'string',
      userIdEncryptType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchqueryModelCommonscoreResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 分数
  scores?: string[];
  // 意向
  ratings?: string[];
  // 流水号
  transNo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      scores: 'scores',
      ratings: 'ratings',
      transNo: 'trans_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      scores: { 'type': 'array', 'itemType': 'string' },
      ratings: { 'type': 'array', 'itemType': 'string' },
      transNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryModelMultiscoreRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用户授权编码（授权渠道）
  // 
  authNo: string;
  // 规格编码(相应对接人负责)
  specCode: string;
  // 用户id（客户身份证号/手机号的md5/sha256散列值）
  userId: string;
  // 用户id类型（身份证号：ID_NO；手机号：MOBILE_NO）
  userIdType: string;
  // user_id 散列类型: "MD5"：MD5（小写）, "SHA256" ： SHA256（小写）， "SM3"： SM3（小写）
  hashType: string;
  // 客户编码
  // 
  customerCode: string;
  // 流水号，串联链路用，非必填
  transNo?: string;
  // hash_type类型的散列后的操作，默认为空不加密。 如启用，需要对散列后的user_id 加密，可选用如下算法，类型1、AES/ECB/PKCS5PADDING 在加密后的二进制需要以字符集UTF-8，编码base64 方式赋值给user_id传输。 示例：AES秘钥：base64_aes_key = "CZqWzQ5JL8s5Zx2XVpGZGw=="，报文：plaintext = "Hello, 蚂蚁。" ，使用算法： AES/ECB/PKCS5PADDING ；密文：SI1wU1ePSFoMy5YzuxclFkbZ/FIXUHPRDbKBW85WolY=，配置了此项user_id应该传输此密文。
  userIdEncryptType?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      authNo: 'auth_no',
      specCode: 'spec_code',
      userId: 'user_id',
      userIdType: 'user_id_type',
      hashType: 'hash_type',
      customerCode: 'customer_code',
      transNo: 'trans_no',
      userIdEncryptType: 'user_id_encrypt_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      authNo: 'string',
      specCode: 'string',
      userId: 'string',
      userIdType: 'string',
      hashType: 'string',
      customerCode: 'string',
      transNo: 'string',
      userIdEncryptType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryModelMultiscoreResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 模型分
  score?: string;
  // 流水号
  transNo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      score: 'score',
      transNo: 'trans_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      score: 'string',
      transNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryModelFusionmodelRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 融合模型编码
  fusionModelCode: string;
  // 模型调用的id，一般是用户id 可能是用户手机号或者身份照号码的md5
  identity: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      fusionModelCode: 'fusion_model_code',
      identity: 'identity',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      fusionModelCode: 'string',
      identity: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryModelFusionmodelResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 融合模型调用结果
  result?: string;
  // 流水号
  transNo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      result: 'result',
      transNo: 'trans_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      result: 'string',
      transNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryModelWorkscoreRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用户名
  name: string;
  // 身份证号码
  cardNo: string;
  // 手机号
  phone: string;
  // 单位名称，以个体工商户、人才市场等方式缴纳的属于灵活就业人员，单位名称请填：GR
  enterpriseName: string;
  // 单位统一社会信用代码，
  // 单位名称为GR传空。
  organizationCode?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      name: 'name',
      cardNo: 'card_no',
      phone: 'phone',
      enterpriseName: 'enterprise_name',
      organizationCode: 'organization_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      name: 'string',
      cardNo: 'string',
      phone: 'string',
      enterpriseName: 'string',
      organizationCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryModelWorkscoreResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 交易流水号
  transNo?: string;
  // 用工评分
  score?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      transNo: 'trans_no',
      score: 'score',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      transNo: 'string',
      score: 'string',
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
          sdk_version: "1.0.58",
          _prod_code: "COLLABINV",
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
   * Description: sse查询
   * Summary: sse查询
   */
  async queryAgentSse(request: QueryAgentSseRequest): Promise<QueryAgentSseResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAgentSseEx(request, headers, runtime);
  }

  /**
   * Description: sse查询
   * Summary: sse查询
   */
  async queryAgentSseEx(request: QueryAgentSseRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAgentSseResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAgentSseResponse>(await this.doRequest("1.0", "antchain.zkcollabinv.agent.sse.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAgentSseResponse({}));
  }

  /**
   * Description: 根据用户id查询用户会话列表
   * Summary: 根据用户id查询用户会话列表
   */
  async listAgentConversation(request: ListAgentConversationRequest): Promise<ListAgentConversationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listAgentConversationEx(request, headers, runtime);
  }

  /**
   * Description: 根据用户id查询用户会话列表
   * Summary: 根据用户id查询用户会话列表
   */
  async listAgentConversationEx(request: ListAgentConversationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListAgentConversationResponse> {
    Util.validateModel(request);
    return $tea.cast<ListAgentConversationResponse>(await this.doRequest("1.0", "antchain.zkcollabinv.agent.conversation.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListAgentConversationResponse({}));
  }

  /**
   * Description: 根据用户Id会话ID删除会话
   * Summary: 删除会话
   */
  async deleteAgentConversation(request: DeleteAgentConversationRequest): Promise<DeleteAgentConversationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteAgentConversationEx(request, headers, runtime);
  }

  /**
   * Description: 根据用户Id会话ID删除会话
   * Summary: 删除会话
   */
  async deleteAgentConversationEx(request: DeleteAgentConversationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteAgentConversationResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteAgentConversationResponse>(await this.doRequest("1.0", "antchain.zkcollabinv.agent.conversation.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteAgentConversationResponse({}));
  }

  /**
   * Description: 删除用户所有会话
   * Summary: 删除用户所有会话
   */
  async batchdeleteAgentConversation(request: BatchdeleteAgentConversationRequest): Promise<BatchdeleteAgentConversationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchdeleteAgentConversationEx(request, headers, runtime);
  }

  /**
   * Description: 删除用户所有会话
   * Summary: 删除用户所有会话
   */
  async batchdeleteAgentConversationEx(request: BatchdeleteAgentConversationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchdeleteAgentConversationResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchdeleteAgentConversationResponse>(await this.doRequest("1.0", "antchain.zkcollabinv.agent.conversation.batchdelete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchdeleteAgentConversationResponse({}));
  }

  /**
   * Description: 获取会话消息列表
   * Summary: 获取会话消息列表
   */
  async listAgentMessage(request: ListAgentMessageRequest): Promise<ListAgentMessageResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listAgentMessageEx(request, headers, runtime);
  }

  /**
   * Description: 获取会话消息列表
   * Summary: 获取会话消息列表
   */
  async listAgentMessageEx(request: ListAgentMessageRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListAgentMessageResponse> {
    Util.validateModel(request);
    return $tea.cast<ListAgentMessageResponse>(await this.doRequest("1.0", "antchain.zkcollabinv.agent.message.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListAgentMessageResponse({}));
  }

  /**
   * Description: 编辑会话信息
   * Summary: 编辑会话信息
   */
  async updateAgentConversation(request: UpdateAgentConversationRequest): Promise<UpdateAgentConversationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateAgentConversationEx(request, headers, runtime);
  }

  /**
   * Description: 编辑会话信息
   * Summary: 编辑会话信息
   */
  async updateAgentConversationEx(request: UpdateAgentConversationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateAgentConversationResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateAgentConversationResponse>(await this.doRequest("1.0", "antchain.zkcollabinv.agent.conversation.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateAgentConversationResponse({}));
  }

  /**
   * Description: agent api 同步
   * Summary: agent api
   */
  async queryAgentCompletion(request: QueryAgentCompletionRequest): Promise<QueryAgentCompletionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAgentCompletionEx(request, headers, runtime);
  }

  /**
   * Description: agent api 同步
   * Summary: agent api
   */
  async queryAgentCompletionEx(request: QueryAgentCompletionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAgentCompletionResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAgentCompletionResponse>(await this.doRequest("1.0", "antchain.zkcollabinv.agent.completion.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAgentCompletionResponse({}));
  }

  /**
   * Description: 车抵贷人群匹配
   * Summary: 车抵贷人群匹配
   */
  async matchCarloanUsers(request: MatchCarloanUsersRequest): Promise<MatchCarloanUsersResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.matchCarloanUsersEx(request, headers, runtime);
  }

  /**
   * Description: 车抵贷人群匹配
   * Summary: 车抵贷人群匹配
   */
  async matchCarloanUsersEx(request: MatchCarloanUsersRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<MatchCarloanUsersResponse> {
    Util.validateModel(request);
    return $tea.cast<MatchCarloanUsersResponse>(await this.doRequest("1.0", "antchain.zkcollabinv.carloan.users.match", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new MatchCarloanUsersResponse({}));
  }

  /**
   * Description: 批量碰撞人群数据
   * Summary: 批量碰撞人群数据
   */
  async batchqueryCarloanUsers(request: BatchqueryCarloanUsersRequest): Promise<BatchqueryCarloanUsersResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchqueryCarloanUsersEx(request, headers, runtime);
  }

  /**
   * Description: 批量碰撞人群数据
   * Summary: 批量碰撞人群数据
   */
  async batchqueryCarloanUsersEx(request: BatchqueryCarloanUsersRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchqueryCarloanUsersResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchqueryCarloanUsersResponse>(await this.doRequest("1.0", "antchain.zkcollabinv.carloan.users.batchquery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchqueryCarloanUsersResponse({}));
  }

  /**
   * Description: 导入人群文件
   * Summary: 导入人群文件
   */
  async importCarloanUsers(request: ImportCarloanUsersRequest): Promise<ImportCarloanUsersResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.importCarloanUsersEx(request, headers, runtime);
  }

  /**
   * Description: 导入人群文件
   * Summary: 导入人群文件
   */
  async importCarloanUsersEx(request: ImportCarloanUsersRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ImportCarloanUsersResponse> {
    if (!Util.isUnset(request.fileObject)) {
      let uploadReq = new CreateAntcloudGatewayxFileUploadRequest({
        authToken: request.authToken,
        apiCode: "antchain.zkcollabinv.carloan.users.import",
        fileName: request.fileObjectName,
      });
      let uploadResp = await this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
      if (!AntchainUtil.isSuccess(uploadResp.resultCode, "ok")) {
        let importCarloanUsersResponse = new ImportCarloanUsersResponse({
          reqMsgId: uploadResp.reqMsgId,
          resultCode: uploadResp.resultCode,
          resultMsg: uploadResp.resultMsg,
        });
        return importCarloanUsersResponse;
      }

      let uploadHeaders = AntchainUtil.parseUploadHeaders(uploadResp.uploadHeaders);
      await AntchainUtil.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
      request.fileId = uploadResp.fileId;
      request.fileObject = null;
    }

    Util.validateModel(request);
    return $tea.cast<ImportCarloanUsersResponse>(await this.doRequest("1.0", "antchain.zkcollabinv.carloan.users.import", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ImportCarloanUsersResponse({}));
  }

  /**
   * Description: 添加用户
   * Summary: 添加天猫用户
   */
  async addCaruserUsers(request: AddCaruserUsersRequest): Promise<AddCaruserUsersResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.addCaruserUsersEx(request, headers, runtime);
  }

  /**
   * Description: 添加用户
   * Summary: 添加天猫用户
   */
  async addCaruserUsersEx(request: AddCaruserUsersRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AddCaruserUsersResponse> {
    Util.validateModel(request);
    return $tea.cast<AddCaruserUsersResponse>(await this.doRequest("1.0", "antchain.zkcollabinv.caruser.users.add", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AddCaruserUsersResponse({}));
  }

  /**
   * Description: 查询匹配结果
   * Summary: 查询结果
   */
  async queryCarloanUsers(request: QueryCarloanUsersRequest): Promise<QueryCarloanUsersResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryCarloanUsersEx(request, headers, runtime);
  }

  /**
   * Description: 查询匹配结果
   * Summary: 查询结果
   */
  async queryCarloanUsersEx(request: QueryCarloanUsersRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryCarloanUsersResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryCarloanUsersResponse>(await this.doRequest("1.0", "antchain.zkcollabinv.carloan.users.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryCarloanUsersResponse({}));
  }

  /**
   * Description: 测试接口添加用户
   * Summary: 测试接口添加用户
   */
  async addCaruserTest(request: AddCaruserTestRequest): Promise<AddCaruserTestResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.addCaruserTestEx(request, headers, runtime);
  }

  /**
   * Description: 测试接口添加用户
   * Summary: 测试接口添加用户
   */
  async addCaruserTestEx(request: AddCaruserTestRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AddCaruserTestResponse> {
    Util.validateModel(request);
    return $tea.cast<AddCaruserTestResponse>(await this.doRequest("1.0", "antchain.zkcollabinv.caruser.test.add", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AddCaruserTestResponse({}));
  }

  /**
   * Description: 生产接口增加人群
   * Summary: 生产接口增加人群
   */
  async addCaruserPrd(request: AddCaruserPrdRequest): Promise<AddCaruserPrdResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.addCaruserPrdEx(request, headers, runtime);
  }

  /**
   * Description: 生产接口增加人群
   * Summary: 生产接口增加人群
   */
  async addCaruserPrdEx(request: AddCaruserPrdRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AddCaruserPrdResponse> {
    Util.validateModel(request);
    return $tea.cast<AddCaruserPrdResponse>(await this.doRequest("1.0", "antchain.zkcollabinv.caruser.prd.add", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AddCaruserPrdResponse({}));
  }

  /**
   * Description: 碰撞人群数据测试接口碰撞人群数据
   * Summary: 测试接口碰撞人群数据
   */
  async batchqueryCarloanTest(request: BatchqueryCarloanTestRequest): Promise<BatchqueryCarloanTestResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchqueryCarloanTestEx(request, headers, runtime);
  }

  /**
   * Description: 碰撞人群数据测试接口碰撞人群数据
   * Summary: 测试接口碰撞人群数据
   */
  async batchqueryCarloanTestEx(request: BatchqueryCarloanTestRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchqueryCarloanTestResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchqueryCarloanTestResponse>(await this.doRequest("1.0", "antchain.zkcollabinv.carloan.test.batchquery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchqueryCarloanTestResponse({}));
  }

  /**
   * Description: 生产接口碰撞人群数据
   * Summary: 生产接口碰撞人群数据
   */
  async batchqueryCarloanPrd(request: BatchqueryCarloanPrdRequest): Promise<BatchqueryCarloanPrdResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchqueryCarloanPrdEx(request, headers, runtime);
  }

  /**
   * Description: 生产接口碰撞人群数据
   * Summary: 生产接口碰撞人群数据
   */
  async batchqueryCarloanPrdEx(request: BatchqueryCarloanPrdRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchqueryCarloanPrdResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchqueryCarloanPrdResponse>(await this.doRequest("1.0", "antchain.zkcollabinv.carloan.prd.batchquery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchqueryCarloanPrdResponse({}));
  }

  /**
   * Description: idMapping碰撞
   * Summary: idMapping碰撞
   */
  async importIdmapSamplefile(request: ImportIdmapSamplefileRequest): Promise<ImportIdmapSamplefileResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.importIdmapSamplefileEx(request, headers, runtime);
  }

  /**
   * Description: idMapping碰撞
   * Summary: idMapping碰撞
   */
  async importIdmapSamplefileEx(request: ImportIdmapSamplefileRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ImportIdmapSamplefileResponse> {
    Util.validateModel(request);
    return $tea.cast<ImportIdmapSamplefileResponse>(await this.doRequest("1.0", "antchain.zkcollabinv.idmap.samplefile.import", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ImportIdmapSamplefileResponse({}));
  }

  /**
   * Description: psi求交结果导入
   * Summary: psi求交结果导入
   */
  async importIdmapPsiresultfile(request: ImportIdmapPsiresultfileRequest): Promise<ImportIdmapPsiresultfileResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.importIdmapPsiresultfileEx(request, headers, runtime);
  }

  /**
   * Description: psi求交结果导入
   * Summary: psi求交结果导入
   */
  async importIdmapPsiresultfileEx(request: ImportIdmapPsiresultfileRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ImportIdmapPsiresultfileResponse> {
    Util.validateModel(request);
    return $tea.cast<ImportIdmapPsiresultfileResponse>(await this.doRequest("1.0", "antchain.zkcollabinv.idmap.psiresultfile.import", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ImportIdmapPsiresultfileResponse({}));
  }

  /**
   * Description: 投行研究，品牌调用
   * Summary: 投行研究，品牌调用
   */
  async queryIndexresearchBrand(request: QueryIndexresearchBrandRequest): Promise<QueryIndexresearchBrandResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryIndexresearchBrandEx(request, headers, runtime);
  }

  /**
   * Description: 投行研究，品牌调用
   * Summary: 投行研究，品牌调用
   */
  async queryIndexresearchBrandEx(request: QueryIndexresearchBrandRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryIndexresearchBrandResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryIndexresearchBrandResponse>(await this.doRequest("1.0", "antchain.zkcollabinv.indexresearch.brand.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryIndexresearchBrandResponse({}));
  }

  /**
   * Description: 投行研究，查询品牌指标结果
   * Summary: 查询品牌指标
   */
  async queryIndexresearchBrandindex(request: QueryIndexresearchBrandindexRequest): Promise<QueryIndexresearchBrandindexResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryIndexresearchBrandindexEx(request, headers, runtime);
  }

  /**
   * Description: 投行研究，查询品牌指标结果
   * Summary: 查询品牌指标
   */
  async queryIndexresearchBrandindexEx(request: QueryIndexresearchBrandindexRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryIndexresearchBrandindexResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryIndexresearchBrandindexResponse>(await this.doRequest("1.0", "antchain.zkcollabinv.indexresearch.brandindex.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryIndexresearchBrandindexResponse({}));
  }

  /**
   * Description: 消费行业报告查询
   * Summary: 消费行业报告查询
   */
  async queryIndexresearchConsumeindustry(request: QueryIndexresearchConsumeindustryRequest): Promise<QueryIndexresearchConsumeindustryResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryIndexresearchConsumeindustryEx(request, headers, runtime);
  }

  /**
   * Description: 消费行业报告查询
   * Summary: 消费行业报告查询
   */
  async queryIndexresearchConsumeindustryEx(request: QueryIndexresearchConsumeindustryRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryIndexresearchConsumeindustryResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryIndexresearchConsumeindustryResponse>(await this.doRequest("1.0", "antchain.zkcollabinv.indexresearch.consumeindustry.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryIndexresearchConsumeindustryResponse({}));
  }

  /**
   * Description: 消费行业报告行业查询
   * Summary: 消费行业报告行业查询
   */
  async queryIndexresearchIndustry(request: QueryIndexresearchIndustryRequest): Promise<QueryIndexresearchIndustryResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryIndexresearchIndustryEx(request, headers, runtime);
  }

  /**
   * Description: 消费行业报告行业查询
   * Summary: 消费行业报告行业查询
   */
  async queryIndexresearchIndustryEx(request: QueryIndexresearchIndustryRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryIndexresearchIndustryResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryIndexresearchIndustryResponse>(await this.doRequest("1.0", "antchain.zkcollabinv.indexresearch.industry.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryIndexresearchIndustryResponse({}));
  }

  /**
   * Description: 基于交易数据的定位信息协查
   * Summary: 定位协查
   */
  async queryLocationInternal(request: QueryLocationInternalRequest): Promise<QueryLocationInternalResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryLocationInternalEx(request, headers, runtime);
  }

  /**
   * Description: 基于交易数据的定位信息协查
   * Summary: 定位协查
   */
  async queryLocationInternalEx(request: QueryLocationInternalRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryLocationInternalResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryLocationInternalResponse>(await this.doRequest("1.0", "antchain.zkcollabinv.location.internal.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryLocationInternalResponse({}));
  }

  /**
   * Description: 基于交易数据的定位信息协查对外接口
   * Summary: 定位协查对外接口
   */
  async queryLocationTrade(request: QueryLocationTradeRequest): Promise<QueryLocationTradeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryLocationTradeEx(request, headers, runtime);
  }

  /**
   * Description: 基于交易数据的定位信息协查对外接口
   * Summary: 定位协查对外接口
   */
  async queryLocationTradeEx(request: QueryLocationTradeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryLocationTradeResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryLocationTradeResponse>(await this.doRequest("1.0", "antchain.zkcollabinv.location.trade.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryLocationTradeResponse({}));
  }

  /**
   * Description: 样本文件摘要
   * Summary: 样本文件摘要
   */
  async pushModelSamplefile(request: PushModelSamplefileRequest): Promise<PushModelSamplefileResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pushModelSamplefileEx(request, headers, runtime);
  }

  /**
   * Description: 样本文件摘要
   * Summary: 样本文件摘要
   */
  async pushModelSamplefileEx(request: PushModelSamplefileRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PushModelSamplefileResponse> {
    Util.validateModel(request);
    return $tea.cast<PushModelSamplefileResponse>(await this.doRequest("1.0", "antchain.zkcollabinv.model.samplefile.push", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PushModelSamplefileResponse({}));
  }

  /**
   * Description: 样本任务执行
   * Summary: 样本任务执行
   */
  async execModelSampletask(request: ExecModelSampletaskRequest): Promise<ExecModelSampletaskResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execModelSampletaskEx(request, headers, runtime);
  }

  /**
   * Description: 样本任务执行
   * Summary: 样本任务执行
   */
  async execModelSampletaskEx(request: ExecModelSampletaskRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecModelSampletaskResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecModelSampletaskResponse>(await this.doRequest("1.0", "antchain.zkcollabinv.model.sampletask.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecModelSampletaskResponse({}));
  }

  /**
   * Description: 任务状态查询
   * Summary: 任务状态查询
   */
  async queryModelSampletask(request: QueryModelSampletaskRequest): Promise<QueryModelSampletaskResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryModelSampletaskEx(request, headers, runtime);
  }

  /**
   * Description: 任务状态查询
   * Summary: 任务状态查询
   */
  async queryModelSampletaskEx(request: QueryModelSampletaskRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryModelSampletaskResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryModelSampletaskResponse>(await this.doRequest("1.0", "antchain.zkcollabinv.model.sampletask.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryModelSampletaskResponse({}));
  }

  /**
   * Description: 特征集查询
   * Summary: 特征集查询
   */
  async queryModelFeatureset(request: QueryModelFeaturesetRequest): Promise<QueryModelFeaturesetResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryModelFeaturesetEx(request, headers, runtime);
  }

  /**
   * Description: 特征集查询
   * Summary: 特征集查询
   */
  async queryModelFeaturesetEx(request: QueryModelFeaturesetRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryModelFeaturesetResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryModelFeaturesetResponse>(await this.doRequest("1.0", "antchain.zkcollabinv.model.featureset.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryModelFeaturesetResponse({}));
  }

  /**
   * Description: 模型保存
   * Summary: 模型保存
   */
  async submitModelInstance(request: SubmitModelInstanceRequest): Promise<SubmitModelInstanceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.submitModelInstanceEx(request, headers, runtime);
  }

  /**
   * Description: 模型保存
   * Summary: 模型保存
   */
  async submitModelInstanceEx(request: SubmitModelInstanceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SubmitModelInstanceResponse> {
    Util.validateModel(request);
    return $tea.cast<SubmitModelInstanceResponse>(await this.doRequest("1.0", "antchain.zkcollabinv.model.instance.submit", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SubmitModelInstanceResponse({}));
  }

  /**
   * Description: 模型调用统计查询
   * Summary: 模型调用统计查询
   */
  async queryModelStats(request: QueryModelStatsRequest): Promise<QueryModelStatsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryModelStatsEx(request, headers, runtime);
  }

  /**
   * Description: 模型调用统计查询
   * Summary: 模型调用统计查询
   */
  async queryModelStatsEx(request: QueryModelStatsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryModelStatsResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryModelStatsResponse>(await this.doRequest("1.0", "antchain.zkcollabinv.model.stats.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryModelStatsResponse({}));
  }

  /**
   * Description: 通用查询
   * Summary: 通用查询
   */
  async queryModelCommonscore(request: QueryModelCommonscoreRequest): Promise<QueryModelCommonscoreResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryModelCommonscoreEx(request, headers, runtime);
  }

  /**
   * Description: 通用查询
   * Summary: 通用查询
   */
  async queryModelCommonscoreEx(request: QueryModelCommonscoreRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryModelCommonscoreResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryModelCommonscoreResponse>(await this.doRequest("1.0", "antchain.zkcollabinv.model.commonscore.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryModelCommonscoreResponse({}));
  }

  /**
   * Description: 通用查询批次，仅针对外部使用PIR场景
   * Summary: 通用查询批次
   */
  async batchqueryModelCommonscore(request: BatchqueryModelCommonscoreRequest): Promise<BatchqueryModelCommonscoreResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchqueryModelCommonscoreEx(request, headers, runtime);
  }

  /**
   * Description: 通用查询批次，仅针对外部使用PIR场景
   * Summary: 通用查询批次
   */
  async batchqueryModelCommonscoreEx(request: BatchqueryModelCommonscoreRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchqueryModelCommonscoreResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchqueryModelCommonscoreResponse>(await this.doRequest("1.0", "antchain.zkcollabinv.model.commonscore.batchquery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchqueryModelCommonscoreResponse({}));
  }

  /**
   * Description: 多模型预测值
   * Summary: 多模型预测值
   */
  async queryModelMultiscore(request: QueryModelMultiscoreRequest): Promise<QueryModelMultiscoreResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryModelMultiscoreEx(request, headers, runtime);
  }

  /**
   * Description: 多模型预测值
   * Summary: 多模型预测值
   */
  async queryModelMultiscoreEx(request: QueryModelMultiscoreRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryModelMultiscoreResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryModelMultiscoreResponse>(await this.doRequest("1.0", "antchain.zkcollabinv.model.multiscore.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryModelMultiscoreResponse({}));
  }

  /**
   * Description: 融合模型的调用
   * Summary: 融合模型调用
   */
  async queryModelFusionmodel(request: QueryModelFusionmodelRequest): Promise<QueryModelFusionmodelResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryModelFusionmodelEx(request, headers, runtime);
  }

  /**
   * Description: 融合模型的调用
   * Summary: 融合模型调用
   */
  async queryModelFusionmodelEx(request: QueryModelFusionmodelRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryModelFusionmodelResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryModelFusionmodelResponse>(await this.doRequest("1.0", "antchain.zkcollabinv.model.fusionmodel.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryModelFusionmodelResponse({}));
  }

  /**
   * Description: 用工分
   * Summary: 用工分调用
   */
  async queryModelWorkscore(request: QueryModelWorkscoreRequest): Promise<QueryModelWorkscoreResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryModelWorkscoreEx(request, headers, runtime);
  }

  /**
   * Description: 用工分
   * Summary: 用工分调用
   */
  async queryModelWorkscoreEx(request: QueryModelWorkscoreRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryModelWorkscoreResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryModelWorkscoreResponse>(await this.doRequest("1.0", "antchain.zkcollabinv.model.workscore.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryModelWorkscoreResponse({}));
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
