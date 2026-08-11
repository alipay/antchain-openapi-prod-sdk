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

// DataPart represents a structured blob.
export class DataPart extends $tea.Model {
  // A JSON object containing arbitrary data.
  /**
   * @example
   * data
   */
  data?: string;
  static names(): { [key: string]: string } {
    return {
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      data: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// Part represents a container for a section of communication content.
export class Part extends $tea.Model {
  // the string content of the text part.
  /**
   * @example
   * content
   */
  text?: string;
  // The structured data content.
  data?: DataPart;
  static names(): { [key: string]: string } {
    return {
      text: 'text',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      text: 'string',
      data: DataPart,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// Message is one unit of communication between client and server.
export class Message extends $tea.Model {
  // Parts is the container of the message content.
  parts?: Part[];
  // Identifies the sender of the message.
  // USER role refers to communication from the client to the server.
  // AGENT role refers to communication from the server to the client.
  /**
   * @example
   * USER
   */
  role?: string;
  // The context id of the message. This is optional and if set, the message will be associated with the given context(a specific conversation or session).
  /**
   * @example
   * contextid
   */
  contextId?: string;
  static names(): { [key: string]: string } {
    return {
      parts: 'parts',
      role: 'role',
      contextId: 'context_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      parts: { 'type': 'array', 'itemType': Part },
      role: 'string',
      contextId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// Artifacts represent task outputs.
export class Artifact extends $tea.Model {
  // The content of the artifact. Must contain at least one part.
  parts?: Part[];
  static names(): { [key: string]: string } {
    return {
      parts: 'parts',
    };
  }

  static types(): { [key: string]: any } {
    return {
      parts: { 'type': 'array', 'itemType': Part },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// A container for the status of a task
export class TaskStatus extends $tea.Model {
  // The current state of this task.
  /**
   * @example
   * TASK_STATE_COMPLETED
   */
  state: string;
  // A message associated with the status.
  message: Message;
  static names(): { [key: string]: string } {
    return {
      state: 'state',
      message: 'message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      state: 'string',
      message: Message,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// ASSISTANT 消息特有信息
export class AssistantExtra extends $tea.Model {
  // 任务id
  /**
   * @example
   * M_d3f7859e845a4ed58bedc446fec32427
   */
  taskId?: string;
  // 生图状态
  /**
   * @example
   * PROCESSING
   */
  renderStatus?: string;
  // 生图结果
  /**
   * @example
   * undefined
   */
  resultUrl?: string[];
  static names(): { [key: string]: string } {
    return {
      taskId: 'task_id',
      renderStatus: 'render_status',
      resultUrl: 'result_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      taskId: 'string',
      renderStatus: 'string',
      resultUrl: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 参考样式素材引用
export class CreativeAssetRef extends $tea.Model {
  // 素材来源
  /**
   * @example
   * URL
   */
  sourceType: string;
  // 素材ID，只有素材来源于creative的素材库中才需要填入
  /**
   * @example
   * 5bf62f7dd73b4efa8dea7a2665cd2173
   */
  materialId?: string;
  // 可公网访问的素材url地址
  /**
   * @example
   * https://mdn.alipayobjects.com/wofi_creative/afts/file/80mwSruGUE4AAAAAAAAAAAAA-FZ4AQJr
   */
  url?: string;
  // 使用提示
  /**
   * @example
   * 二维码保持清晰
   */
  usageHint?: string;
  static names(): { [key: string]: string } {
    return {
      sourceType: 'source_type',
      materialId: 'material_id',
      url: 'url',
      usageHint: 'usage_hint',
    };
  }

  static types(): { [key: string]: any } {
    return {
      sourceType: 'string',
      materialId: 'string',
      url: 'string',
      usageHint: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// Task is the core unit of action for A2A. It has a current status and when results are created for the task they are stored in the artifact.
export class Task extends $tea.Model {
  // Unique identifier (e.g. UUID) for the task, generated by the server for a new task.
  /**
   * @example
   * 6c7a3d8f9e544c5ab3e17f2a1b9c4e8d
   */
  id: string;
  // Unique identifier (e.g. UUID) for the contextual collection of interactions (tasks and messages). Created by the A2A server.
  /**
   * @example
   * contextid
   */
  contextId?: string;
  // The current status of a Task, including state and a message.
  status: TaskStatus;
  // A set of output artifacts for a Task.
  artifacts: Artifact[];
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      contextId: 'context_id',
      status: 'status',
      artifacts: 'artifacts',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      contextId: 'string',
      status: TaskStatus,
      artifacts: { 'type': 'array', 'itemType': Artifact },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecAntcloudMarketingagentChatCreativeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 会话ID，如需支持多轮对话，需要传入之前的会话ID
  sessionId?: string;
  // 服务类型（默认IMAGE_RENDER）
  entryType?: string;
  // 表达用户意图
  prompt: string;
  // 参考样式
  referenceStyle?: CreativeAssetRef;
  // 输入元素
  inputElements?: CreativeAssetRef[];
  // 使用场景
  scene?: string;
  // 生图宽度
  width?: number;
  // 生图高度
  height?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      sessionId: 'session_id',
      entryType: 'entry_type',
      prompt: 'prompt',
      referenceStyle: 'reference_style',
      inputElements: 'input_elements',
      scene: 'scene',
      width: 'width',
      height: 'height',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      sessionId: 'string',
      entryType: 'string',
      prompt: 'string',
      referenceStyle: CreativeAssetRef,
      inputElements: { 'type': 'array', 'itemType': CreativeAssetRef },
      scene: 'string',
      width: 'number',
      height: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecAntcloudMarketingagentChatCreativeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 消息ID
  messageId?: string;
  // 所属会话ID
  sessionId?: string;
  // 消息角色
  role?: string;
  // 消息状态
  status?: string;
  // 消息内容
  content?: string;
  // ASSISTANT消息的额外信息
  assistantExtra?: AssistantExtra;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      messageId: 'message_id',
      sessionId: 'session_id',
      role: 'role',
      status: 'status',
      content: 'content',
      assistantExtra: 'assistant_extra',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      messageId: 'string',
      sessionId: 'string',
      role: 'string',
      status: 'string',
      content: 'string',
      assistantExtra: AssistantExtra,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecAntcloudMarketingagentCreativeChatRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 会话ID，如需支持多轮对话，需要传入之前的会话ID
  sessionId?: string;
  // 服务类型（默认IMAGE_RENDER）
  entryType?: string;
  // 表达用户意图
  prompt: string;
  // 参考样式
  referenceStyle?: CreativeAssetRef;
  // 输入元素
  inputElements?: AssistantExtra[];
  // 使用场景
  scene?: string;
  // 生图宽度
  width?: number;
  // 生图高度
  height?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      sessionId: 'session_id',
      entryType: 'entry_type',
      prompt: 'prompt',
      referenceStyle: 'reference_style',
      inputElements: 'input_elements',
      scene: 'scene',
      width: 'width',
      height: 'height',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      sessionId: 'string',
      entryType: 'string',
      prompt: 'string',
      referenceStyle: CreativeAssetRef,
      inputElements: { 'type': 'array', 'itemType': AssistantExtra },
      scene: 'string',
      width: 'number',
      height: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecAntcloudMarketingagentCreativeChatResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 消息ID
  messageId?: string;
  // 所属会话ID
  sessionId?: string;
  // 消息角色
  role?: string;
  // 消息状态
  status?: string;
  // 消息内容
  content?: string;
  // ASSISTANT消息的额外信息
  assistantExtra?: AssistantExtra;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      messageId: 'message_id',
      sessionId: 'session_id',
      role: 'role',
      status: 'status',
      content: 'content',
      assistantExtra: 'assistant_extra',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      messageId: 'string',
      sessionId: 'string',
      role: 'string',
      status: 'string',
      content: 'string',
      assistantExtra: AssistantExtra,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntcloudMarketingagentCreativeResultRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 消息ID
  messageId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      messageId: 'message_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      messageId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntcloudMarketingagentCreativeResultResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 会话ID
  sessionId?: string;
  // 消息ID
  messageId?: string;
  // 消息状态
  status?: string;
  // 消息内容
  content?: string;
  // agent消息扩展信息
  assistantExtra?: AssistantExtra;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      sessionId: 'session_id',
      messageId: 'message_id',
      status: 'status',
      content: 'content',
      assistantExtra: 'assistant_extra',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      sessionId: 'string',
      messageId: 'string',
      status: 'string',
      content: 'string',
      assistantExtra: AssistantExtra,
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
          sdk_version: "2.0.4",
          _prod_code: "CREATIVERENDER",
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
   * Description: 创意素材中心chat生图接口
   * Summary: 创意素材中心chat生图接口
   */
  async execAntcloudMarketingagentChatCreative(request: ExecAntcloudMarketingagentChatCreativeRequest): Promise<ExecAntcloudMarketingagentChatCreativeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execAntcloudMarketingagentChatCreativeEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 创意素材中心chat生图接口
   * Summary: 创意素材中心chat生图接口
   */
  async execAntcloudMarketingagentChatCreativeEx(request: ExecAntcloudMarketingagentChatCreativeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecAntcloudMarketingagentChatCreativeResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecAntcloudMarketingagentChatCreativeResponse>(await this.doRequest("1.0", "antcloud.marketingagent.chat.creative.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecAntcloudMarketingagentChatCreativeResponse({}));
  }

  /**
   * @remarks
   * Description: 创意素材chat接口
   * Summary: 创意素材chat接口
   */
  async execAntcloudMarketingagentCreativeChat(request: ExecAntcloudMarketingagentCreativeChatRequest): Promise<ExecAntcloudMarketingagentCreativeChatResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execAntcloudMarketingagentCreativeChatEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 创意素材chat接口
   * Summary: 创意素材chat接口
   */
  async execAntcloudMarketingagentCreativeChatEx(request: ExecAntcloudMarketingagentCreativeChatRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecAntcloudMarketingagentCreativeChatResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecAntcloudMarketingagentCreativeChatResponse>(await this.doRequest("1.0", "antcloud.marketingagent.creative.chat.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecAntcloudMarketingagentCreativeChatResponse({}));
  }

  /**
   * @remarks
   * Description: chat结果查询接口
   * Summary: chat结果查询接口
   */
  async queryAntcloudMarketingagentCreativeResult(request: QueryAntcloudMarketingagentCreativeResultRequest): Promise<QueryAntcloudMarketingagentCreativeResultResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAntcloudMarketingagentCreativeResultEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: chat结果查询接口
   * Summary: chat结果查询接口
   */
  async queryAntcloudMarketingagentCreativeResultEx(request: QueryAntcloudMarketingagentCreativeResultRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAntcloudMarketingagentCreativeResultResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAntcloudMarketingagentCreativeResultResponse>(await this.doRequest("1.0", "antcloud.marketingagent.creative.result.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAntcloudMarketingagentCreativeResultResponse({}));
  }

}
