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

// 工具入参的json schema
export class JsonSchema extends $tea.Model {
  // 工具属性，Map<String, Object> 类型，适配网关透出，使用字符串方式存储
  propertiesJson: string;
  // 类型
  type: string;
  // 必填项
  required: string[];
  // 是否允许额外属性
  additionalProperties: boolean;
  static names(): { [key: string]: string } {
    return {
      propertiesJson: 'properties_json',
      type: 'type',
      required: 'required',
      additionalProperties: 'additional_properties',
    };
  }

  static types(): { [key: string]: any } {
    return {
      propertiesJson: 'string',
      type: 'string',
      required: { 'type': 'array', 'itemType': 'string' },
      additionalProperties: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 工具列表vo
export class ToolInfoVO extends $tea.Model {
  // 工具名称
  name: string;
  // 工具描述
  description: string;
  // 工具入参的json schema
  inputSchema: JsonSchema;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      description: 'description',
      inputSchema: 'input_schema',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      description: 'string',
      inputSchema: JsonSchema,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 异常对象
export class BizErrorInfo extends $tea.Model {
  // code
  code: string;
  // 异常信息
  errorMsg?: string;
  // params
  params?: string;
  static names(): { [key: string]: string } {
    return {
      code: 'code',
      errorMsg: 'error_msg',
      params: 'params',
    };
  }

  static types(): { [key: string]: any } {
    return {
      code: 'string',
      errorMsg: 'string',
      params: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 我的MCP详情VO
export class DigitalGatewayMCPDetailVO extends $tea.Model {
  // server_host
  serverHost: string;
  // server请求协议
  transportProtocol: string;
  // 网关请求令牌
  serverToken: string;
  // 空间id
  spaceId: string;
  // server_id
  serverId: string;
  // server_code
  serverCode: string;
  // server名称
  serverName: string;
  // icon
  icon: string;
  // server描述
  description: string;
  // mcp上架信息（富文本）
  docs: string;
  // 工具列表
  toolList: ToolInfoVO[];
  static names(): { [key: string]: string } {
    return {
      serverHost: 'server_host',
      transportProtocol: 'transport_protocol',
      serverToken: 'server_token',
      spaceId: 'space_id',
      serverId: 'server_id',
      serverCode: 'server_code',
      serverName: 'server_name',
      icon: 'icon',
      description: 'description',
      docs: 'docs',
      toolList: 'tool_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      serverHost: 'string',
      transportProtocol: 'string',
      serverToken: 'string',
      spaceId: 'string',
      serverId: 'string',
      serverCode: 'string',
      serverName: 'string',
      icon: 'string',
      description: 'string',
      docs: 'string',
      toolList: { 'type': 'array', 'itemType': ToolInfoVO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// MyMCP page分页内容信息
export class DigitalGatewayMCPPageVO extends $tea.Model {
  // 空间id
  spaceId: string;
  // server_id
  serverId: string;
  // server_code
  serverCode: string;
  // server_name
  serverName: string;
  // icon
  icon: string;
  // description
  description: string;
  //  mcp分类
  categories: string[];
  static names(): { [key: string]: string } {
    return {
      spaceId: 'space_id',
      serverId: 'server_id',
      serverCode: 'server_code',
      serverName: 'server_name',
      icon: 'icon',
      description: 'description',
      categories: 'categories',
    };
  }

  static types(): { [key: string]: any } {
    return {
      spaceId: 'string',
      serverId: 'string',
      serverCode: 'string',
      serverName: 'string',
      icon: 'string',
      description: 'string',
      categories: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// MCP已订阅清单Request
export class MCPServerQueryPageGatewayRequest extends $tea.Model {
  // 空间id
  spaceId: string;
  // 运行模式
  runMode?: string;
  // 来源
  source?: string;
  // 查询条件
  query?: string;
  // 页码
  pageNum: number;
  // 分页大小
  pageSize: number;
  static names(): { [key: string]: string } {
    return {
      spaceId: 'space_id',
      runMode: 'run_mode',
      source: 'source',
      query: 'query',
      pageNum: 'page_num',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      spaceId: 'string',
      runMode: 'string',
      source: 'string',
      query: 'string',
      pageNum: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// MCP详情查询返回Result对象
export class MCPDetailCommonResult extends $tea.Model {
  // MCP详情信息
  result: DigitalGatewayMCPDetailVO;
  // success
  success: boolean;
  // code
  code: string;
  // msg
  msg: string;
  // trace_id
  traceId: string;
  // req_id
  reqId: string;
  // 异常对象
  bizError: BizErrorInfo;
  static names(): { [key: string]: string } {
    return {
      result: 'result',
      success: 'success',
      code: 'code',
      msg: 'msg',
      traceId: 'trace_id',
      reqId: 'req_id',
      bizError: 'biz_error',
    };
  }

  static types(): { [key: string]: any } {
    return {
      result: DigitalGatewayMCPDetailVO,
      success: 'boolean',
      code: 'string',
      msg: 'string',
      traceId: 'string',
      reqId: 'string',
      bizError: BizErrorInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 我订阅的MCP分页对象
export class MyMcpPageRestult extends $tea.Model {
  // total_count
  totalCount: number;
  // current_page
  currentPage: number;
  // trace_id
  traceId: string;
  // success
  success: boolean;
  // code
  code: string;
  // msg
  msg: string;
  // req_id
  reqId: string;
  // MCP分页内容
  result: DigitalGatewayMCPPageVO[];
  static names(): { [key: string]: string } {
    return {
      totalCount: 'total_count',
      currentPage: 'current_page',
      traceId: 'trace_id',
      success: 'success',
      code: 'code',
      msg: 'msg',
      reqId: 'req_id',
      result: 'result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      totalCount: 'number',
      currentPage: 'number',
      traceId: 'string',
      success: 'boolean',
      code: 'string',
      msg: 'string',
      reqId: 'string',
      result: { 'type': 'array', 'itemType': DigitalGatewayMCPPageVO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartOpenaiChatRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 参数内容为 ChatCompletionRequest 的 JSON 字符串
  chatCompletionRequest: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      chatCompletionRequest: 'chat_completion_request',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      chatCompletionRequest: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartOpenaiChatResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 会话结果
  chatCompletionObject?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      chatCompletionObject: 'chat_completion_object',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      chatCompletionObject: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartAgentChatRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求内容，内容为 AgentChatReq 对象的json字符串
  agentChatRequest: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      agentChatRequest: 'agent_chat_request',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      agentChatRequest: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartAgentChatResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 会话结果
  chatCompletionObject?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      chatCompletionObject: 'chat_completion_object',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      chatCompletionObject: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartAgentCchatRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求内容，内容为 AgentChatReq 对象的json字符串
  agentChatRequest: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      agentChatRequest: 'agent_chat_request',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      agentChatRequest: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartAgentCchatResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 会话结果
  chatCompletionObject?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      chatCompletionObject: 'chat_completion_object',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      chatCompletionObject: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryAgentMcplistRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 空间ID
  spaceId: string;
  // 查询条件
  query?: string;
  // 页码
  pageNum: number;
  // 分页大小
  pageSize: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      spaceId: 'space_id',
      query: 'query',
      pageNum: 'page_num',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      spaceId: 'string',
      query: 'string',
      pageNum: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryAgentMcplistResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // MyMCP分页对象
  data?: MyMcpPageRestult;
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
      data: MyMcpPageRestult,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DetailAgentMcpRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 空间id
  spaceId: string;
  // 平台serverId
  serverId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      spaceId: 'space_id',
      serverId: 'server_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      spaceId: 'string',
      serverId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DetailAgentMcpResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // MCP详情接口返回Result
  data?: MCPDetailCommonResult;
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
      data: MCPDetailCommonResult,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartAgentTaskRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求内容，内容为 TaskChatReq 对象的json字符串
  taskChatReq: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      taskChatReq: 'task_chat_req',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      taskChatReq: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartAgentTaskResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 会话结果
  chatCompletionObject?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      chatCompletionObject: 'chat_completion_object',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      chatCompletionObject: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StopAgentTaskRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求内容，内容为 task_event_req 对象的json字符串
  taskEventReq: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      taskEventReq: 'task_event_req',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      taskEventReq: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StopAgentTaskResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // success
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OperateAgentTaskRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求内容，内容为 task_event_req 对象的json字符串
  taskEventReq: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      taskEventReq: 'task_event_req',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      taskEventReq: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OperateAgentTaskResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 会话结果
  // 
  taskMessages?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      taskMessages: 'task_messages',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      taskMessages: 'string',
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
          sdk_version: "1.3.1",
          _prod_code: "DTAIAGT",
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
   * Description: 大模型流式/同步对话接口
   * Summary: 大模型流式/同步对话接口
   */
  async startOpenaiChat(request: StartOpenaiChatRequest): Promise<StartOpenaiChatResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.startOpenaiChatEx(request, headers, runtime);
  }

  /**
   * Description: 大模型流式/同步对话接口
   * Summary: 大模型流式/同步对话接口
   */
  async startOpenaiChatEx(request: StartOpenaiChatRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<StartOpenaiChatResponse> {
    Util.validateModel(request);
    return $tea.cast<StartOpenaiChatResponse>(await this.doRequest("1.0", "antdigital.dtaiagt.openai.chat.start", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new StartOpenaiChatResponse({}));
  }

  /**
   * Description: 智能体流式对话接口
   * Summary: 智能体流式对话接口
   */
  async startAgentChat(request: StartAgentChatRequest): Promise<StartAgentChatResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.startAgentChatEx(request, headers, runtime);
  }

  /**
   * Description: 智能体流式对话接口
   * Summary: 智能体流式对话接口
   */
  async startAgentChatEx(request: StartAgentChatRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<StartAgentChatResponse> {
    Util.validateModel(request);
    return $tea.cast<StartAgentChatResponse>(await this.doRequest("1.0", "antdigital.dtaiagt.agent.chat.start", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new StartAgentChatResponse({}));
  }

  /**
   * Description: 智能体同步对话接口
   * Summary: 智能体同步对话接口
   */
  async startAgentCchat(request: StartAgentCchatRequest): Promise<StartAgentCchatResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.startAgentCchatEx(request, headers, runtime);
  }

  /**
   * Description: 智能体同步对话接口
   * Summary: 智能体同步对话接口
   */
  async startAgentCchatEx(request: StartAgentCchatRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<StartAgentCchatResponse> {
    Util.validateModel(request);
    return $tea.cast<StartAgentCchatResponse>(await this.doRequest("1.0", "antdigital.dtaiagt.agent.cchat.start", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new StartAgentCchatResponse({}));
  }

  /**
   * Description: 查询已订阅的mcp清单
   * Summary: 查询已订阅的mcp清单
   */
  async pagequeryAgentMcplist(request: PagequeryAgentMcplistRequest): Promise<PagequeryAgentMcplistResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pagequeryAgentMcplistEx(request, headers, runtime);
  }

  /**
   * Description: 查询已订阅的mcp清单
   * Summary: 查询已订阅的mcp清单
   */
  async pagequeryAgentMcplistEx(request: PagequeryAgentMcplistRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PagequeryAgentMcplistResponse> {
    Util.validateModel(request);
    return $tea.cast<PagequeryAgentMcplistResponse>(await this.doRequest("1.0", "antdigital.dtaiagt.agent.mcplist.pagequery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PagequeryAgentMcplistResponse({}));
  }

  /**
   * Description: mcp详情
   * Summary: mcp详情
   */
  async detailAgentMcp(request: DetailAgentMcpRequest): Promise<DetailAgentMcpResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.detailAgentMcpEx(request, headers, runtime);
  }

  /**
   * Description: mcp详情
   * Summary: mcp详情
   */
  async detailAgentMcpEx(request: DetailAgentMcpRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DetailAgentMcpResponse> {
    Util.validateModel(request);
    return $tea.cast<DetailAgentMcpResponse>(await this.doRequest("1.0", "antdigital.dtaiagt.agent.mcp.detail", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DetailAgentMcpResponse({}));
  }

  /**
   * Description: 长任务对话，发起任务&重连任务
   * Summary: 长任务对话
   */
  async startAgentTask(request: StartAgentTaskRequest): Promise<StartAgentTaskResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.startAgentTaskEx(request, headers, runtime);
  }

  /**
   * Description: 长任务对话，发起任务&重连任务
   * Summary: 长任务对话
   */
  async startAgentTaskEx(request: StartAgentTaskRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<StartAgentTaskResponse> {
    Util.validateModel(request);
    return $tea.cast<StartAgentTaskResponse>(await this.doRequest("1.0", "antdigital.dtaiagt.agent.task.start", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new StartAgentTaskResponse({}));
  }

  /**
   * Description: 终止任务
   * Summary: 终止任务
   */
  async stopAgentTask(request: StopAgentTaskRequest): Promise<StopAgentTaskResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.stopAgentTaskEx(request, headers, runtime);
  }

  /**
   * Description: 终止任务
   * Summary: 终止任务
   */
  async stopAgentTaskEx(request: StopAgentTaskRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<StopAgentTaskResponse> {
    Util.validateModel(request);
    return $tea.cast<StopAgentTaskResponse>(await this.doRequest("1.0", "antdigital.dtaiagt.agent.task.stop", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new StopAgentTaskResponse({}));
  }

  /**
   * Description: 获取前序消息流
   * Summary: 获取前序消息流
   */
  async operateAgentTask(request: OperateAgentTaskRequest): Promise<OperateAgentTaskResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.operateAgentTaskEx(request, headers, runtime);
  }

  /**
   * Description: 获取前序消息流
   * Summary: 获取前序消息流
   */
  async operateAgentTaskEx(request: OperateAgentTaskRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<OperateAgentTaskResponse> {
    Util.validateModel(request);
    return $tea.cast<OperateAgentTaskResponse>(await this.doRequest("1.0", "antdigital.dtaiagt.agent.task.operate", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new OperateAgentTaskResponse({}));
  }

}
