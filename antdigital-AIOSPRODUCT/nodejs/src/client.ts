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

}
