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

export class QueryGwdefaultChatstreamRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用户标识
  userId: string;
  // 租户标识
  tenantId?: string;
  // 业务配置标识（必传），决定模型、策略、提示词
  agentCode: string;
  // 用户输入
  message: string;
  // 会话标识（可选），新会话不传，继续会话传
  sessionId?: string;
  // 扩展字段（可选），用于后端服务直接调用时指定技术参数
  extInfo?: string;
  // 标签过滤字段（可选），用于按标签过滤生效的 expertAgents/skills/tools。
  tagInfo?: string;
  // 由业务指定不同的 gateway_code
  gatewayCode?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      userId: 'user_id',
      tenantId: 'tenant_id',
      agentCode: 'agent_code',
      message: 'message',
      sessionId: 'session_id',
      extInfo: 'ext_info',
      tagInfo: 'tag_info',
      gatewayCode: 'gateway_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      userId: 'string',
      tenantId: 'string',
      agentCode: 'string',
      message: 'string',
      sessionId: 'string',
      extInfo: 'string',
      tagInfo: 'string',
      gatewayCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryGwdefaultChatstreamResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 会话id
  sessionId?: string;
  // 整体成功标志，默认 true
  success?: boolean;
  // 固定chat_result
  type?: string;
  // 查询 ID；多为空串
  queryId?: string;
  // true=流式中间批次；false=收尾批次
  hasStream?: boolean;
  // 正文流
  chatList?: string;
  // 推荐问题（SUG），仅收尾批次非空
  sugList?: string;
  // 全量引用（REF），仅收尾批次非空
  refList?: string;
  // 页脚卡片（FOOTER_CARD 已改写为 CARD），仅收尾批次非空
  footerList?: string;
  // token/耗时信息；仅携带 callbackInfo 的批次才有
  callBackInfo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      sessionId: 'session_id',
      success: 'success',
      type: 'type',
      queryId: 'query_id',
      hasStream: 'has_stream',
      chatList: 'chat_list',
      sugList: 'sug_list',
      refList: 'ref_list',
      footerList: 'footer_list',
      callBackInfo: 'call_back_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      sessionId: 'string',
      success: 'boolean',
      type: 'string',
      queryId: 'string',
      hasStream: 'boolean',
      chatList: 'string',
      sugList: 'string',
      refList: 'string',
      footerList: 'string',
      callBackInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryGwdefaultChatRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用户标识
  userId: string;
  // 租户标识
  tenantId: string;
  // 业务配置标识（必传），决定模型、策略、提示词
  agentCode: string;
  // 用户输入
  message: string;
  // 会话标识（可选），新会话不传，继续会话传
  sessionId?: string;
  // 扩展字段（可选），用于后端服务直接调用时指定技术参数
  extInfo?: string;
  // 标签过滤字段（可选），用于按标签过滤生效的 expertAgents/skills/tools
  tagInfo?: string;
  // 由业务指定不同的 gateway_code
  gatewayCode?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      userId: 'user_id',
      tenantId: 'tenant_id',
      agentCode: 'agent_code',
      message: 'message',
      sessionId: 'session_id',
      extInfo: 'ext_info',
      tagInfo: 'tag_info',
      gatewayCode: 'gateway_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      userId: 'string',
      tenantId: 'string',
      agentCode: 'string',
      message: 'string',
      sessionId: 'string',
      extInfo: 'string',
      tagInfo: 'string',
      gatewayCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryGwdefaultChatResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 会话id
  sessionId?: string;
  // 业务配置标识（必传），决定模型、策略、提示词
  agentCode?: string;
  // 回答
  answer?: string;
  // 链路id
  traceId?: string;
  // 附加信息
  metadata?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      sessionId: 'session_id',
      agentCode: 'agent_code',
      answer: 'answer',
      traceId: 'trace_id',
      metadata: 'metadata',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      sessionId: 'string',
      agentCode: 'string',
      answer: 'string',
      traceId: 'string',
      metadata: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryGwchildinsuranceChatstreamRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用户标识
  userId: string;
  // 租户标识
  tenantId?: string;
  // 业务配置标识（必传），决定模型、策略、提示词
  agentCode: string;
  // 用户输入
  message: string;
  // 会话标识（可选），新会话不传，继续会话传
  sessionId?: string;
  // 扩展字段（可选），用于后端服务直接调用时指定技术参数
  extInfo?: string;
  // 标签过滤字段（可选），用于按标签过滤生效的 expertAgents/skills/tools
  tagInfo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      userId: 'user_id',
      tenantId: 'tenant_id',
      agentCode: 'agent_code',
      message: 'message',
      sessionId: 'session_id',
      extInfo: 'ext_info',
      tagInfo: 'tag_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      userId: 'string',
      tenantId: 'string',
      agentCode: 'string',
      message: 'string',
      sessionId: 'string',
      extInfo: 'string',
      tagInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryGwchildinsuranceChatstreamResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 会话id
  sessionId?: string;
  // 整体成功标志，默认 true
  success?: boolean;
  // 固定chat_result
  type?: string;
  // 查询 ID；多为空串
  queryId?: string;
  // true=流式中间批次；false=收尾批次
  hasStream?: boolean;
  // 正文流
  chatList?: string;
  // 推荐问题（SUG），仅收尾批次非空
  sugList?: string;
  // 全量引用（REF），仅收尾批次非空
  refList?: string;
  // 页脚卡片（FOOTER_CARD 已改写为 CARD），仅收尾批次非空
  footerList?: string;
  // token/耗时信息；仅携带 callbackInfo 的批次才有
  callBackInfo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      sessionId: 'session_id',
      success: 'success',
      type: 'type',
      queryId: 'query_id',
      hasStream: 'has_stream',
      chatList: 'chat_list',
      sugList: 'sug_list',
      refList: 'ref_list',
      footerList: 'footer_list',
      callBackInfo: 'call_back_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      sessionId: 'string',
      success: 'boolean',
      type: 'string',
      queryId: 'string',
      hasStream: 'boolean',
      chatList: 'string',
      sugList: 'string',
      refList: 'string',
      footerList: 'string',
      callBackInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryGwchildinsuranceChatRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用户标识
  userId: string;
  // 租户标识
  tenantId: string;
  // 业务配置标识（必传），决定模型、策略、提示词
  agentCode: string;
  // 用户输入
  message: string;
  // 会话标识（可选），新会话不传，继续会话传
  sessionId?: string;
  // 扩展字段（可选），用于后端服务直接调用时指定技术参数
  extInfo?: string;
  // 标签过滤字段（可选），用于按标签过滤生效的 expertAgents/skills/tools
  tagInfo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      userId: 'user_id',
      tenantId: 'tenant_id',
      agentCode: 'agent_code',
      message: 'message',
      sessionId: 'session_id',
      extInfo: 'ext_info',
      tagInfo: 'tag_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      userId: 'string',
      tenantId: 'string',
      agentCode: 'string',
      message: 'string',
      sessionId: 'string',
      extInfo: 'string',
      tagInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryGwchildinsuranceChatResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 会话id
  sessionId?: string;
  // 业务配置标识（必传），决定模型、策略、提示词
  agentCode?: string;
  // 回答
  answer?: string;
  // 链路id
  traceId?: string;
  // 附加信息
  metadata?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      sessionId: 'session_id',
      agentCode: 'agent_code',
      answer: 'answer',
      traceId: 'trace_id',
      metadata: 'metadata',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      sessionId: 'string',
      agentCode: 'string',
      answer: 'string',
      traceId: 'string',
      metadata: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryGwchildinsuranceProfilelatestRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 当前联调租户；必须精确命中 finaigateway 发布白名单
  tenantId: string;
  // 请求输入
  requestData: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      requestData: 'request_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      requestData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryGwchildinsuranceProfilelatestResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 接口返回数据对象
  data?: string;
  // 消息
  message?: string;
  // 接口整体执行情况
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      message: 'message',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: 'string',
      message: 'string',
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryGwchildinsuranceProfiledetailRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 当前联调租户；必须精确命中 finaigateway 发布白名单
  tenantId: string;
  // 输入参数
  requestData: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      requestData: 'request_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      requestData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryGwchildinsuranceProfiledetailResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 接口返回数据对象
  data?: string;
  // 消息
  message?: string;
  // 接口整体执行情况
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      message: 'message',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: 'string',
      message: 'string',
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveGwchildinsuranceProfileRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 仅供 finaigateway 白名单校验和建立租户 Header，转发前删除
  tenantId: string;
  // 请求参数
  requestData: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      requestData: 'request_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      requestData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveGwchildinsuranceProfileResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: string;
  // 消息
  message?: string;
  // 接口整体执行情况
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      message: 'message',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: 'string',
      message: 'string',
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryGwchildinsuranceSolutionkycdetailRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 当前联调租户；必须精确命中 finaigateway 发布白名单
  tenantId: string;
  // 输入参数
  requestData: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      requestData: 'request_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      requestData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryGwchildinsuranceSolutionkycdetailResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 业务数据 JSON 字符串
  data?: string;
  // 成功时允许为 null，失败时返回可理解原因
  message?: string;
  // 业务处理是否成功
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      message: 'message',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: 'string',
      message: 'string',
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveGwchildinsuranceSolutionkycRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户标识；当前联调必须命中 finaigateway 发布白名单
  tenantId: string;
  // 当前业务请求对象的 JSON 字符串
  requestData: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      requestData: 'request_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      requestData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveGwchildinsuranceSolutionkycResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 业务数据 JSON 字符串
  data?: string;
  // 成功时允许为 null，失败时返回可理解原因
  message?: string;
  // 业务处理是否成功
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      message: 'message',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: 'string',
      message: 'string',
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryGwmcpdefaultChatRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用户标识
  userId: string;
  // 租户标识
  tenantId: string;
  // 业务配置标识（必传），决定模型、策略、提示词
  agentCode: string;
  // 用户输入
  message: string;
  // 会话标识（可选），新会话不传，继续会话传
  sessionId?: string;
  // 扩展字段（可选），用于后端服务直接调用时指定技术参数
  extInfo?: string;
  // 标签过滤字段（可选），用于按标签过滤生效的 expertAgents/skills/tools
  tagInfo?: string;
  // 由业务指定不同的 gateway_code
  gatewayCode?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      userId: 'user_id',
      tenantId: 'tenant_id',
      agentCode: 'agent_code',
      message: 'message',
      sessionId: 'session_id',
      extInfo: 'ext_info',
      tagInfo: 'tag_info',
      gatewayCode: 'gateway_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      userId: 'string',
      tenantId: 'string',
      agentCode: 'string',
      message: 'string',
      sessionId: 'string',
      extInfo: 'string',
      tagInfo: 'string',
      gatewayCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryGwmcpdefaultChatResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 会话id
  sessionId?: string;
  // 业务配置标识（必传），决定模型、策略、提示词
  agentCode?: string;
  // 回答
  answer?: string;
  // 链路id
  traceId?: string;
  // 附加信息
  metadata?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      sessionId: 'session_id',
      agentCode: 'agent_code',
      answer: 'answer',
      traceId: 'trace_id',
      metadata: 'metadata',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      sessionId: 'string',
      agentCode: 'string',
      answer: 'string',
      traceId: 'string',
      metadata: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveGwchildinsurancePlanningtargetsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户标识，沿用已发布 Profile API 的租户校验。
  tenantId: string;
  // JSON 字符串形式的业务请求；必须是单层 JSON 字符串，不能再次序列化成二层 JSON 字符串。
  requestData: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      requestData: 'request_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      requestData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveGwchildinsurancePlanningtargetsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 业务数据 JSON 字符串；内容为 Planning Targets 业务对象
  data?: string;
  // 成功时允许为 `null`，失败时返回可理解原因。
  message?: string;
  // 业务处理是否成功
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      message: 'message',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: 'string',
      message: 'string',
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryGwchildinsurancePlanningtargetsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户标识，当前使用 CONSOLE_DEFAULT
  tenantId: string;
  // JSON 字符串形式的业务请求
  requestData: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      requestData: 'request_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      requestData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryGwchildinsurancePlanningtargetsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 业务数据 JSON 字符串
  data?: string;
  // 成功时允许为 null，失败时返回可理解原因
  message?: string;
  // 业务处理是否成功
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      message: 'message',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: 'string',
      message: 'string',
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryGwchildinsurancePlanningtargetslatestRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户标识，沿用已发布 Profile API 的租户校验。
  tenantId: string;
  // JSON 字符串形式的业务请求；必须是单层 JSON 字符串，不能再次序列化成二层 JSON 字符串。
  requestData: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      requestData: 'request_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      requestData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryGwchildinsurancePlanningtargetslatestResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 业务数据 JSON 字符串；内容为 Planning Targets 业务对象。
  data?: string;
  // 成功时允许为 null，失败时返回可理解原因。
  message?: string;
  // 业务处理是否成功。
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      message: 'message',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: 'string',
      message: 'string',
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryGwchildinsuranceRecommendationplandetailRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 当前联调租户；必须精确命中 finaigateway 发布白名单
  tenantId: string;
  // 输入参数
  requestData: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      requestData: 'request_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      requestData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryGwchildinsuranceRecommendationplandetailResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 业务数据 JSON 字符串
  data?: string;
  // 成功时允许为 null，失败时返回可理解原因
  message?: string;
  // 业务处理是否成功
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      message: 'message',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: 'string',
      message: 'string',
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveGwchildinsuranceRecommendationplanadjustRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 当前联调租户；必须精确命中 finaigateway 发布白名单
  tenantId: string;
  // 输入参数
  requestData: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      requestData: 'request_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      requestData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveGwchildinsuranceRecommendationplanadjustResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 业务数据 JSON 字符串
  data?: string;
  // 成功时允许为 null，失败时返回可理解原因
  message?: string;
  // 业务处理是否成功
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      message: 'message',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: 'string',
      message: 'string',
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveGwchildinsuranceRecommendationplanconfirmRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 当前联调租户；必须精确命中 finaigateway 发布白名单
  tenantId: string;
  // 输入参数
  requestData: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      requestData: 'request_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      requestData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveGwchildinsuranceRecommendationplanconfirmResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 业务数据 JSON 字符串
  data?: string;
  // 成功时允许为 null，失败时返回可理解原因
  message?: string;
  // 业务处理是否成功
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      message: 'message',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: 'string',
      message: 'string',
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryGwchildinsuranceRecommendationplanhistoryRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 当前联调租户；必须精确命中 finaigateway 发布白名单
  tenantId: string;
  // 输入参数
  requestData: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      requestData: 'request_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      requestData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryGwchildinsuranceRecommendationplanhistoryResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 业务数据 JSON 字符串
  data?: string;
  // 成功时允许为 null，失败时返回可理解原因
  message?: string;
  // 业务处理是否成功
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      message: 'message',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: 'string',
      message: 'string',
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveGwchildinsuranceActivetargetRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 当前联调租户；必须精确命中 finaigateway 发布白名单
  tenantId: string;
  // 输入参数
  requestData: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      requestData: 'request_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      requestData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveGwchildinsuranceActivetargetResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 业务数据 JSON 字符串
  data?: string;
  // 成功时允许为 null，失败时返回可理解原因
  message?: string;
  // 业务处理是否成功
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      message: 'message',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: 'string',
      message: 'string',
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryGwchildinsuranceActivetargetRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 当前联调租户；必须精确命中 finaigateway 发布白名单
  tenantId: string;
  // 输入参数
  requestData: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      requestData: 'request_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      requestData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryGwchildinsuranceActivetargetResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 业务数据 JSON 字符串
  data?: string;
  // 成功时允许为 null，失败时返回可理解原因
  message?: string;
  // 业务处理是否成功
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      message: 'message',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: 'string',
      message: 'string',
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryGwchildinsuranceRecommendationcandidateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户
  tenantId: string;
  // 请求
  requestData: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      requestData: 'request_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      requestData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryGwchildinsuranceRecommendationcandidateResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 业务数据 JSON 字符串
  data?: string;
  // 成功时允许为 null，失败时返回可理解原因
  message?: string;
  // 业务处理是否成功
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      message: 'message',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: 'string',
      message: 'string',
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ResetGwchildinsuranceRecommendationcandidateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 当前联调租户；必须精确命中 finaigateway 发布白名单
  tenantId: string;
  // 输入参数
  requestData: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      requestData: 'request_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      requestData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ResetGwchildinsuranceRecommendationcandidateResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 业务数据 JSON 字符串
  data?: string;
  // 成功时允许为 null，失败时返回可理解原因
  message?: string;
  // 业务处理是否成功
  success?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      message: 'message',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: 'string',
      message: 'string',
      success: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryGwchildinsuranceCompareproductlistRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 当前联调租户；必须精确命中 finaigateway 发布白名单
  tenantId: string;
  // 输入参数
  requestData?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      requestData: 'request_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      requestData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryGwchildinsuranceCompareproductlistResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 业务数据 JSON 字符串
  data?: string;
  // 成功时允许为 null，失败时返回可理解原因
  message?: string;
  // 业务处理是否成功
  success?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      message: 'message',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: 'string',
      message: 'string',
      success: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryGwchildinsuranceCompareproductdetailRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 当前联调租户；必须精确命中 finaigateway 发布白名单
  tenantId?: string;
  // 输入参数
  requestData?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      requestData: 'request_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      requestData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryGwchildinsuranceCompareproductdetailResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 业务数据 JSON 字符串
  data?: string;
  // 成功时允许为 null，失败时返回可理解原因
  message?: string;
  // 业务处理是否成功
  success?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      message: 'message',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: 'string',
      message: 'string',
      success: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryGwchildinsuranceCompareproductlistidsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 当前联调租户；必须精确命中 finaigateway 发布白名单
  tenantId: string;
  // 输入参数
  requestData: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      requestData: 'request_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      requestData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryGwchildinsuranceCompareproductlistidsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 业务数据 JSON 字符串
  data?: string;
  // 成功时允许为 null，失败时返回可理解原因
  message?: string;
  // 业务处理是否成功
  success?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      message: 'message',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: 'string',
      message: 'string',
      success: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryGwchildinsuranceCompareproductbyidsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 当前联调租户；必须精确命中 finaigateway 发布白名单
  tenantId: string;
  // 输入参数
  requestData: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      requestData: 'request_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      requestData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryGwchildinsuranceCompareproductbyidsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 业务数据 JSON 字符串
  data?: string;
  // 成功时允许为 null，失败时返回可理解原因
  message?: string;
  // 业务处理是否成功
  success?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      message: 'message',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: 'string',
      message: 'string',
      success: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DetailGwchildinsuranceOptionalresponsibilityplanRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 当前联调租户；必须精确命中 finaigateway 发布白名单
  tenantId: string;
  // 输入参数
  requestData: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      requestData: 'request_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      requestData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DetailGwchildinsuranceOptionalresponsibilityplanResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 业务数据 JSON 字符串
  data?: string;
  // 成功时允许为 null，失败时返回可理解原因
  message?: string;
  // 业务处理是否成功
  success?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      message: 'message',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: 'string',
      message: 'string',
      success: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ResolveGwchildinsuranceOptionalresponsibilityplanRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 当前联调租户；必须精确命中 finaigateway 发布白名单
  tenantId: string;
  // 输入参数
  requestData: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      requestData: 'request_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      requestData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ResolveGwchildinsuranceOptionalresponsibilityplanResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 业务数据 JSON 字符串
  data?: string;
  // 成功时允许为 null，失败时返回可理解原因
  message?: string;
  // 业务处理是否成功
  success?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      message: 'message',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: 'string',
      message: 'string',
      success: 'string',
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
          sdk_version: "1.0.16",
          _prod_code: "AIOSPRODUCT",
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
   * Description: AIOS GwDefault流式输出
   * Summary: AIOS GwDefault流式输出
   */
  async queryGwdefaultChatstream(request: QueryGwdefaultChatstreamRequest): Promise<QueryGwdefaultChatstreamResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryGwdefaultChatstreamEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: AIOS GwDefault流式输出
   * Summary: AIOS GwDefault流式输出
   */
  async queryGwdefaultChatstreamEx(request: QueryGwdefaultChatstreamRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryGwdefaultChatstreamResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryGwdefaultChatstreamResponse>(await this.doRequest("1.0", "antdigital.aiosproduct.gwdefault.chatstream.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryGwdefaultChatstreamResponse({}));
  }

  /**
   * @remarks
   * Description: AIOS同步对话
   * Summary: AIOS同步对话
   */
  async queryGwdefaultChat(request: QueryGwdefaultChatRequest): Promise<QueryGwdefaultChatResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryGwdefaultChatEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: AIOS同步对话
   * Summary: AIOS同步对话
   */
  async queryGwdefaultChatEx(request: QueryGwdefaultChatRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryGwdefaultChatResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryGwdefaultChatResponse>(await this.doRequest("1.0", "antdigital.aiosproduct.gwdefault.chat.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryGwdefaultChatResponse({}));
  }

  /**
   * @remarks
   * Description: AIOS 少儿保险 流式对话
   * Summary: AIOS 少儿保险 流式对话
   */
  async queryGwchildinsuranceChatstream(request: QueryGwchildinsuranceChatstreamRequest): Promise<QueryGwchildinsuranceChatstreamResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryGwchildinsuranceChatstreamEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: AIOS 少儿保险 流式对话
   * Summary: AIOS 少儿保险 流式对话
   */
  async queryGwchildinsuranceChatstreamEx(request: QueryGwchildinsuranceChatstreamRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryGwchildinsuranceChatstreamResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryGwchildinsuranceChatstreamResponse>(await this.doRequest("1.0", "antdigital.aiosproduct.gwchildinsurance.chatstream.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryGwchildinsuranceChatstreamResponse({}));
  }

  /**
   * @remarks
   * Description: AIOS 少儿保险 非流式对话
   * Summary: AIOS 少儿保险 非流式对话
   */
  async queryGwchildinsuranceChat(request: QueryGwchildinsuranceChatRequest): Promise<QueryGwchildinsuranceChatResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryGwchildinsuranceChatEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: AIOS 少儿保险 非流式对话
   * Summary: AIOS 少儿保险 非流式对话
   */
  async queryGwchildinsuranceChatEx(request: QueryGwchildinsuranceChatRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryGwchildinsuranceChatResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryGwchildinsuranceChatResponse>(await this.doRequest("1.0", "antdigital.aiosproduct.gwchildinsurance.chat.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryGwchildinsuranceChatResponse({}));
  }

  /**
   * @remarks
   * Description: 少儿保险最近档案查询
   * Summary: 少儿保险最近档案查询
   */
  async queryGwchildinsuranceProfilelatest(request: QueryGwchildinsuranceProfilelatestRequest): Promise<QueryGwchildinsuranceProfilelatestResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryGwchildinsuranceProfilelatestEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 少儿保险最近档案查询
   * Summary: 少儿保险最近档案查询
   */
  async queryGwchildinsuranceProfilelatestEx(request: QueryGwchildinsuranceProfilelatestRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryGwchildinsuranceProfilelatestResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryGwchildinsuranceProfilelatestResponse>(await this.doRequest("1.0", "antdigital.aiosproduct.gwchildinsurance.profilelatest.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryGwchildinsuranceProfilelatestResponse({}));
  }

  /**
   * @remarks
   * Description: 少儿保险当前会话档案查询
   * Summary: 少儿保险当前会话档案查询
   */
  async queryGwchildinsuranceProfiledetail(request: QueryGwchildinsuranceProfiledetailRequest): Promise<QueryGwchildinsuranceProfiledetailResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryGwchildinsuranceProfiledetailEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 少儿保险当前会话档案查询
   * Summary: 少儿保险当前会话档案查询
   */
  async queryGwchildinsuranceProfiledetailEx(request: QueryGwchildinsuranceProfiledetailRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryGwchildinsuranceProfiledetailResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryGwchildinsuranceProfiledetailResponse>(await this.doRequest("1.0", "antdigital.aiosproduct.gwchildinsurance.profiledetail.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryGwchildinsuranceProfiledetailResponse({}));
  }

  /**
   * @remarks
   * Description: 少儿保险家庭与孩子档案保存
   * Summary: 少儿保险家庭与孩子档案保存
   */
  async saveGwchildinsuranceProfile(request: SaveGwchildinsuranceProfileRequest): Promise<SaveGwchildinsuranceProfileResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.saveGwchildinsuranceProfileEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 少儿保险家庭与孩子档案保存
   * Summary: 少儿保险家庭与孩子档案保存
   */
  async saveGwchildinsuranceProfileEx(request: SaveGwchildinsuranceProfileRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SaveGwchildinsuranceProfileResponse> {
    Util.validateModel(request);
    return $tea.cast<SaveGwchildinsuranceProfileResponse>(await this.doRequest("1.0", "antdigital.aiosproduct.gwchildinsurance.profile.save", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SaveGwchildinsuranceProfileResponse({}));
  }

  /**
   * @remarks
   * Description: 少儿保险 KYC 查询
   * Summary: 少儿保险 KYC 查询
   */
  async queryGwchildinsuranceSolutionkycdetail(request: QueryGwchildinsuranceSolutionkycdetailRequest): Promise<QueryGwchildinsuranceSolutionkycdetailResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryGwchildinsuranceSolutionkycdetailEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 少儿保险 KYC 查询
   * Summary: 少儿保险 KYC 查询
   */
  async queryGwchildinsuranceSolutionkycdetailEx(request: QueryGwchildinsuranceSolutionkycdetailRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryGwchildinsuranceSolutionkycdetailResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryGwchildinsuranceSolutionkycdetailResponse>(await this.doRequest("1.0", "antdigital.aiosproduct.gwchildinsurance.solutionkycdetail.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryGwchildinsuranceSolutionkycdetailResponse({}));
  }

  /**
   * @remarks
   * Description: 少儿保险 KYC 保存
   * Summary: 少儿保险 KYC 保存
   */
  async saveGwchildinsuranceSolutionkyc(request: SaveGwchildinsuranceSolutionkycRequest): Promise<SaveGwchildinsuranceSolutionkycResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.saveGwchildinsuranceSolutionkycEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 少儿保险 KYC 保存
   * Summary: 少儿保险 KYC 保存
   */
  async saveGwchildinsuranceSolutionkycEx(request: SaveGwchildinsuranceSolutionkycRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SaveGwchildinsuranceSolutionkycResponse> {
    Util.validateModel(request);
    return $tea.cast<SaveGwchildinsuranceSolutionkycResponse>(await this.doRequest("1.0", "antdigital.aiosproduct.gwchildinsurance.solutionkyc.save", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SaveGwchildinsuranceSolutionkycResponse({}));
  }

  /**
   * @remarks
   * Description: mcp网关调用
   * Summary: mcp网关调用
   */
  async queryGwmcpdefaultChat(request: QueryGwmcpdefaultChatRequest): Promise<QueryGwmcpdefaultChatResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryGwmcpdefaultChatEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: mcp网关调用
   * Summary: mcp网关调用
   */
  async queryGwmcpdefaultChatEx(request: QueryGwmcpdefaultChatRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryGwmcpdefaultChatResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryGwmcpdefaultChatResponse>(await this.doRequest("1.0", "antdigital.aiosproduct.gwmcpdefault.chat.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryGwmcpdefaultChatResponse({}));
  }

  /**
   * @remarks
   * Description: 根据最新画像版本，保存指定用户、指定会话参与保险规划的稳定 `childIds`，并返回最新规划上下文。调用方必须传 `profileVersion`、`childIds`、`idempotencyKey`；不按昵称或数组位置选择。
   * Summary: 根据最新画像版本，保存指定用户、指定会话参与保险规划的稳定 `childIds`，并返回最新规划上下文。调用方必须传 `profileVersion`、`childIds`、`idempotencyKey`；不按昵称或数组位置选择。
   */
  async saveGwchildinsurancePlanningtargets(request: SaveGwchildinsurancePlanningtargetsRequest): Promise<SaveGwchildinsurancePlanningtargetsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.saveGwchildinsurancePlanningtargetsEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 根据最新画像版本，保存指定用户、指定会话参与保险规划的稳定 `childIds`，并返回最新规划上下文。调用方必须传 `profileVersion`、`childIds`、`idempotencyKey`；不按昵称或数组位置选择。
   * Summary: 根据最新画像版本，保存指定用户、指定会话参与保险规划的稳定 `childIds`，并返回最新规划上下文。调用方必须传 `profileVersion`、`childIds`、`idempotencyKey`；不按昵称或数组位置选择。
   */
  async saveGwchildinsurancePlanningtargetsEx(request: SaveGwchildinsurancePlanningtargetsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SaveGwchildinsurancePlanningtargetsResponse> {
    Util.validateModel(request);
    return $tea.cast<SaveGwchildinsurancePlanningtargetsResponse>(await this.doRequest("1.0", "antdigital.aiosproduct.gwchildinsurance.planningtargets.save", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SaveGwchildinsurancePlanningtargetsResponse({}));
  }

  /**
   * @remarks
   * Description: 查询指定用户和会话当前生效的少儿保险规划目标。
   * Summary: 查询指定用户和会话当前生效的少儿保险规划目标。
   */
  async queryGwchildinsurancePlanningtargets(request: QueryGwchildinsurancePlanningtargetsRequest): Promise<QueryGwchildinsurancePlanningtargetsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryGwchildinsurancePlanningtargetsEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 查询指定用户和会话当前生效的少儿保险规划目标。
   * Summary: 查询指定用户和会话当前生效的少儿保险规划目标。
   */
  async queryGwchildinsurancePlanningtargetsEx(request: QueryGwchildinsurancePlanningtargetsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryGwchildinsurancePlanningtargetsResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryGwchildinsurancePlanningtargetsResponse>(await this.doRequest("1.0", "antdigital.aiosproduct.gwchildinsurance.planningtargets.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryGwchildinsurancePlanningtargetsResponse({}));
  }

  /**
   * @remarks
   * Description: 查询最近选择的孩子
   * Summary: 查询最近选择的孩子
   */
  async queryGwchildinsurancePlanningtargetslatest(request: QueryGwchildinsurancePlanningtargetslatestRequest): Promise<QueryGwchildinsurancePlanningtargetslatestResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryGwchildinsurancePlanningtargetslatestEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 查询最近选择的孩子
   * Summary: 查询最近选择的孩子
   */
  async queryGwchildinsurancePlanningtargetslatestEx(request: QueryGwchildinsurancePlanningtargetslatestRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryGwchildinsurancePlanningtargetslatestResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryGwchildinsurancePlanningtargetslatestResponse>(await this.doRequest("1.0", "antdigital.aiosproduct.gwchildinsurance.planningtargetslatest.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryGwchildinsurancePlanningtargetslatestResponse({}));
  }

  /**
   * @remarks
   * Description: 查询推荐方案详情
   * Summary: 查询推荐方案详情
   */
  async queryGwchildinsuranceRecommendationplandetail(request: QueryGwchildinsuranceRecommendationplandetailRequest): Promise<QueryGwchildinsuranceRecommendationplandetailResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryGwchildinsuranceRecommendationplandetailEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 查询推荐方案详情
   * Summary: 查询推荐方案详情
   */
  async queryGwchildinsuranceRecommendationplandetailEx(request: QueryGwchildinsuranceRecommendationplandetailRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryGwchildinsuranceRecommendationplandetailResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryGwchildinsuranceRecommendationplandetailResponse>(await this.doRequest("1.0", "antdigital.aiosproduct.gwchildinsurance.recommendationplandetail.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryGwchildinsuranceRecommendationplandetailResponse({}));
  }

  /**
   * @remarks
   * Description: 保存H5调整后的方案版本
   * Summary: 保存H5调整后的方案版本
   */
  async saveGwchildinsuranceRecommendationplanadjust(request: SaveGwchildinsuranceRecommendationplanadjustRequest): Promise<SaveGwchildinsuranceRecommendationplanadjustResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.saveGwchildinsuranceRecommendationplanadjustEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 保存H5调整后的方案版本
   * Summary: 保存H5调整后的方案版本
   */
  async saveGwchildinsuranceRecommendationplanadjustEx(request: SaveGwchildinsuranceRecommendationplanadjustRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SaveGwchildinsuranceRecommendationplanadjustResponse> {
    Util.validateModel(request);
    return $tea.cast<SaveGwchildinsuranceRecommendationplanadjustResponse>(await this.doRequest("1.0", "antdigital.aiosproduct.gwchildinsurance.recommendationplanadjust.save", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SaveGwchildinsuranceRecommendationplanadjustResponse({}));
  }

  /**
   * @remarks
   * Description: 确认方案及最终价格
   * Summary: 确认方案及最终价格
   */
  async saveGwchildinsuranceRecommendationplanconfirm(request: SaveGwchildinsuranceRecommendationplanconfirmRequest): Promise<SaveGwchildinsuranceRecommendationplanconfirmResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.saveGwchildinsuranceRecommendationplanconfirmEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 确认方案及最终价格
   * Summary: 确认方案及最终价格
   */
  async saveGwchildinsuranceRecommendationplanconfirmEx(request: SaveGwchildinsuranceRecommendationplanconfirmRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SaveGwchildinsuranceRecommendationplanconfirmResponse> {
    Util.validateModel(request);
    return $tea.cast<SaveGwchildinsuranceRecommendationplanconfirmResponse>(await this.doRequest("1.0", "antdigital.aiosproduct.gwchildinsurance.recommendationplanconfirm.save", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SaveGwchildinsuranceRecommendationplanconfirmResponse({}));
  }

  /**
   * @remarks
   * Description: 查询历史推荐方案
   * Summary: 查询历史推荐方案
   */
  async queryGwchildinsuranceRecommendationplanhistory(request: QueryGwchildinsuranceRecommendationplanhistoryRequest): Promise<QueryGwchildinsuranceRecommendationplanhistoryResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryGwchildinsuranceRecommendationplanhistoryEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 查询历史推荐方案
   * Summary: 查询历史推荐方案
   */
  async queryGwchildinsuranceRecommendationplanhistoryEx(request: QueryGwchildinsuranceRecommendationplanhistoryRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryGwchildinsuranceRecommendationplanhistoryResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryGwchildinsuranceRecommendationplanhistoryResponse>(await this.doRequest("1.0", "antdigital.aiosproduct.gwchildinsurance.recommendationplanhistory.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryGwchildinsuranceRecommendationplanhistoryResponse({}));
  }

  /**
   * @remarks
   * Description: 少儿保险当前孩子设置
   * Summary: 少儿保险当前孩子设置
   */
  async saveGwchildinsuranceActivetarget(request: SaveGwchildinsuranceActivetargetRequest): Promise<SaveGwchildinsuranceActivetargetResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.saveGwchildinsuranceActivetargetEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 少儿保险当前孩子设置
   * Summary: 少儿保险当前孩子设置
   */
  async saveGwchildinsuranceActivetargetEx(request: SaveGwchildinsuranceActivetargetRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SaveGwchildinsuranceActivetargetResponse> {
    Util.validateModel(request);
    return $tea.cast<SaveGwchildinsuranceActivetargetResponse>(await this.doRequest("1.0", "antdigital.aiosproduct.gwchildinsurance.activetarget.save", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SaveGwchildinsuranceActivetargetResponse({}));
  }

  /**
   * @remarks
   * Description: 少儿保险当前孩子查询
   * Summary: 少儿保险当前孩子查询
   */
  async queryGwchildinsuranceActivetarget(request: QueryGwchildinsuranceActivetargetRequest): Promise<QueryGwchildinsuranceActivetargetResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryGwchildinsuranceActivetargetEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 少儿保险当前孩子查询
   * Summary: 少儿保险当前孩子查询
   */
  async queryGwchildinsuranceActivetargetEx(request: QueryGwchildinsuranceActivetargetRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryGwchildinsuranceActivetargetResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryGwchildinsuranceActivetargetResponse>(await this.doRequest("1.0", "antdigital.aiosproduct.gwchildinsurance.activetarget.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryGwchildinsuranceActivetargetResponse({}));
  }

  /**
   * @remarks
   * Description: 少儿保险推荐候选详情查询
   * Summary: 少儿保险推荐候选详情查询
   */
  async queryGwchildinsuranceRecommendationcandidate(request: QueryGwchildinsuranceRecommendationcandidateRequest): Promise<QueryGwchildinsuranceRecommendationcandidateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryGwchildinsuranceRecommendationcandidateEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 少儿保险推荐候选详情查询
   * Summary: 少儿保险推荐候选详情查询
   */
  async queryGwchildinsuranceRecommendationcandidateEx(request: QueryGwchildinsuranceRecommendationcandidateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryGwchildinsuranceRecommendationcandidateResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryGwchildinsuranceRecommendationcandidateResponse>(await this.doRequest("1.0", "antdigital.aiosproduct.gwchildinsurance.recommendationcandidate.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryGwchildinsuranceRecommendationcandidateResponse({}));
  }

  /**
   * @remarks
   * Description: 选择预览
   * Summary: 选择预览
   */
  async resetGwchildinsuranceRecommendationcandidate(request: ResetGwchildinsuranceRecommendationcandidateRequest): Promise<ResetGwchildinsuranceRecommendationcandidateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.resetGwchildinsuranceRecommendationcandidateEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 选择预览
   * Summary: 选择预览
   */
  async resetGwchildinsuranceRecommendationcandidateEx(request: ResetGwchildinsuranceRecommendationcandidateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ResetGwchildinsuranceRecommendationcandidateResponse> {
    Util.validateModel(request);
    return $tea.cast<ResetGwchildinsuranceRecommendationcandidateResponse>(await this.doRequest("1.0", "antdigital.aiosproduct.gwchildinsurance.recommendationcandidate.reset", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ResetGwchildinsuranceRecommendationcandidateResponse({}));
  }

  /**
   * @remarks
   * Description: 商品对比列表查询
   * Summary: 商品对比列表查询
   */
  async queryGwchildinsuranceCompareproductlist(request: QueryGwchildinsuranceCompareproductlistRequest): Promise<QueryGwchildinsuranceCompareproductlistResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryGwchildinsuranceCompareproductlistEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 商品对比列表查询
   * Summary: 商品对比列表查询
   */
  async queryGwchildinsuranceCompareproductlistEx(request: QueryGwchildinsuranceCompareproductlistRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryGwchildinsuranceCompareproductlistResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryGwchildinsuranceCompareproductlistResponse>(await this.doRequest("1.0", "antdigital.aiosproduct.gwchildinsurance.compareproductlist.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryGwchildinsuranceCompareproductlistResponse({}));
  }

  /**
   * @remarks
   * Description: 商品对比详情查询
   * Summary: 商品对比详情查询
   */
  async queryGwchildinsuranceCompareproductdetail(request: QueryGwchildinsuranceCompareproductdetailRequest): Promise<QueryGwchildinsuranceCompareproductdetailResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryGwchildinsuranceCompareproductdetailEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 商品对比详情查询
   * Summary: 商品对比详情查询
   */
  async queryGwchildinsuranceCompareproductdetailEx(request: QueryGwchildinsuranceCompareproductdetailRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryGwchildinsuranceCompareproductdetailResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryGwchildinsuranceCompareproductdetailResponse>(await this.doRequest("1.0", "antdigital.aiosproduct.gwchildinsurance.compareproductdetail.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryGwchildinsuranceCompareproductdetailResponse({}));
  }

  /**
   * @remarks
   * Description: 产品对比 ID 列表查询
   * Summary: 产品对比 ID 列表查询
   */
  async queryGwchildinsuranceCompareproductlistids(request: QueryGwchildinsuranceCompareproductlistidsRequest): Promise<QueryGwchildinsuranceCompareproductlistidsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryGwchildinsuranceCompareproductlistidsEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 产品对比 ID 列表查询
   * Summary: 产品对比 ID 列表查询
   */
  async queryGwchildinsuranceCompareproductlistidsEx(request: QueryGwchildinsuranceCompareproductlistidsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryGwchildinsuranceCompareproductlistidsResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryGwchildinsuranceCompareproductlistidsResponse>(await this.doRequest("1.0", "antdigital.aiosproduct.gwchildinsurance.compareproductlistids.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryGwchildinsuranceCompareproductlistidsResponse({}));
  }

  /**
   * @remarks
   * Description: 按 ID 获取产品对比数据
   * Summary: 按 ID 获取产品对比数据
   */
  async queryGwchildinsuranceCompareproductbyids(request: QueryGwchildinsuranceCompareproductbyidsRequest): Promise<QueryGwchildinsuranceCompareproductbyidsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryGwchildinsuranceCompareproductbyidsEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 按 ID 获取产品对比数据
   * Summary: 按 ID 获取产品对比数据
   */
  async queryGwchildinsuranceCompareproductbyidsEx(request: QueryGwchildinsuranceCompareproductbyidsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryGwchildinsuranceCompareproductbyidsResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryGwchildinsuranceCompareproductbyidsResponse>(await this.doRequest("1.0", "antdigital.aiosproduct.gwchildinsurance.compareproductbyids.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryGwchildinsuranceCompareproductbyidsResponse({}));
  }

  /**
   * @remarks
   * Description: 可选责任计划详情查询
   * Summary: 可选责任计划详情查询
   */
  async detailGwchildinsuranceOptionalresponsibilityplan(request: DetailGwchildinsuranceOptionalresponsibilityplanRequest): Promise<DetailGwchildinsuranceOptionalresponsibilityplanResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.detailGwchildinsuranceOptionalresponsibilityplanEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 可选责任计划详情查询
   * Summary: 可选责任计划详情查询
   */
  async detailGwchildinsuranceOptionalresponsibilityplanEx(request: DetailGwchildinsuranceOptionalresponsibilityplanRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DetailGwchildinsuranceOptionalresponsibilityplanResponse> {
    Util.validateModel(request);
    return $tea.cast<DetailGwchildinsuranceOptionalresponsibilityplanResponse>(await this.doRequest("1.0", "antdigital.aiosproduct.gwchildinsurance.optionalresponsibilityplan.detail", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DetailGwchildinsuranceOptionalresponsibilityplanResponse({}));
  }

  /**
   * @remarks
   * Description: 可选责任计划按因子反查
   * Summary: 可选责任计划按因子反查
   */
  async resolveGwchildinsuranceOptionalresponsibilityplan(request: ResolveGwchildinsuranceOptionalresponsibilityplanRequest): Promise<ResolveGwchildinsuranceOptionalresponsibilityplanResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.resolveGwchildinsuranceOptionalresponsibilityplanEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 可选责任计划按因子反查
   * Summary: 可选责任计划按因子反查
   */
  async resolveGwchildinsuranceOptionalresponsibilityplanEx(request: ResolveGwchildinsuranceOptionalresponsibilityplanRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ResolveGwchildinsuranceOptionalresponsibilityplanResponse> {
    Util.validateModel(request);
    return $tea.cast<ResolveGwchildinsuranceOptionalresponsibilityplanResponse>(await this.doRequest("1.0", "antdigital.aiosproduct.gwchildinsurance.optionalresponsibilityplan.resolve", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ResolveGwchildinsuranceOptionalresponsibilityplanResponse({}));
  }

}
