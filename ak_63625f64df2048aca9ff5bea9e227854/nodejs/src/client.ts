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

// 键值对
export class Map extends $tea.Model {
  // 键
  key: string;
  // 值
  value?: string;
  static names(): { [key: string]: string } {
    return {
      key: 'key',
      value: 'value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      key: 'string',
      value: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckDemoAicoguardcoreAicoguardrailsQuestionRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 当前提问内容
  question: string;
  // 当前提问格式
  questionFormat?: string;
  // 应用名
  appCode: string;
  // 会话ID
  sessionId: string;
  // 唯一定位一个问答对
  requestId: string;
  // 场景code，走SOP流程申请
  sceneCode: string;
  // 当前固定填入：TJ_QUESTION_BASIC
  serviceCode: string;
  // Agent标识
  agentCode: string;
  // 大模型Code，区分大模型类型和版本，比如bailing_10b_0229、bailing_65b_0315
  modelCode?: string;
  // 用户ID，用于主体风险判断
  userId?: string;
  // 扩展信息，会透传到业务属性中
  businessProperties?: Map;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      question: 'question',
      questionFormat: 'question_format',
      appCode: 'app_code',
      sessionId: 'session_id',
      requestId: 'request_id',
      sceneCode: 'scene_code',
      serviceCode: 'service_code',
      agentCode: 'agent_code',
      modelCode: 'model_code',
      userId: 'user_id',
      businessProperties: 'business_properties',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      question: 'string',
      questionFormat: 'string',
      appCode: 'string',
      sessionId: 'string',
      requestId: 'string',
      sceneCode: 'string',
      serviceCode: 'string',
      agentCode: 'string',
      modelCode: 'string',
      userId: 'string',
      businessProperties: Map,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckDemoAicoguardcoreAicoguardrailsQuestionResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否安全无风险 true：安全无风险 false：有风险
  safe?: boolean;
  // 安全动作 BLOCK：拦截  SECURITY_ANSWER：安全代答  SECURITY_PROMPT：安全提示增强
  actionCode?: string;
  // 安全动作相关文案，比如安全提示增强的文案、安全代答的回答、回答里补充的安全提示
  actionMsg?: string;
  // 会话动作. END_SESSION：终止会话.  RECALL_QUERY：撤回提问
  sessionAction?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      safe: 'safe',
      actionCode: 'action_code',
      actionMsg: 'action_msg',
      sessionAction: 'session_action',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      safe: 'boolean',
      actionCode: 'string',
      actionMsg: 'string',
      sessionAction: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckAntcloudAitechguardAicoguardrailsAskRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 数据唯一标识，能够根据该值定位到该条数据
  requestId: string;
  // 会话ID，用于匹配多轮对话上下文
  sessionId: string;
  // 应用名，蚂蚁侧提供
  appCode: string;
  // 场景code，走SOP流程申请
  sceneCode: string;
  // 当前提问内容
  question: string;
  // 当前提问格式，默认PLAINTEXT，详见3.2 questionFormat&answerFormat说明
  questionFormat: string;
  // 安全能力类型，0-知识库+天鉴兜底，1-纯知识库
  type: number;
  // 加密的uid，仅用于唯一标示调用方
  userId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      requestId: 'request_id',
      sessionId: 'session_id',
      appCode: 'app_code',
      sceneCode: 'scene_code',
      question: 'question',
      questionFormat: 'question_format',
      type: 'type',
      userId: 'user_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      requestId: 'string',
      sessionId: 'string',
      appCode: 'string',
      sceneCode: 'string',
      question: 'string',
      questionFormat: 'string',
      type: 'number',
      userId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckAntcloudAitechguardAicoguardrailsAskResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 会话ID，用于匹配多轮对话上下文
  sessionId?: string;
  // 唯一定位一个问答对
  requestId?: string;
  // 是否安全无风险. true：安全无风险. false：有风险
  safe?: boolean;
  // 安全动作
  // 提问场景
  //    BLOCK：拦截
  //    SECURITY_ANSWER：安全代答
  //    SECURITY_PROMPT：安全提示增强
  actionCode?: string;
  // 安全代答的回答
  securityAnswer?: string;
  // 有安全风险时的提问改写
  securityPrompt?: string;
  // 有风险时的风险标签
  riskLabel?: string;
  // 会话动作
  //    END_SESSION：终止会话
  //    RECALL_QUERY：撤回提问
  sessionAction?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      sessionId: 'session_id',
      requestId: 'request_id',
      safe: 'safe',
      actionCode: 'action_code',
      securityAnswer: 'security_answer',
      securityPrompt: 'security_prompt',
      riskLabel: 'risk_label',
      sessionAction: 'session_action',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      sessionId: 'string',
      requestId: 'string',
      safe: 'boolean',
      actionCode: 'string',
      securityAnswer: 'string',
      securityPrompt: 'string',
      riskLabel: 'string',
      sessionAction: 'string',
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
          sdk_version: "1.0.0",
          _prod_code: "ak_63625f64df2048aca9ff5bea9e227854",
          _prod_channel: "saas",
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
   * Description: 大模型护栏多轮对话提问检测 测试
   * Summary: 大模型护栏多轮对话提问检测
   */
  async checkDemoAicoguardcoreAicoguardrailsQuestion(request: CheckDemoAicoguardcoreAicoguardrailsQuestionRequest): Promise<CheckDemoAicoguardcoreAicoguardrailsQuestionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.checkDemoAicoguardcoreAicoguardrailsQuestionEx(request, headers, runtime);
  }

  /**
   * Description: 大模型护栏多轮对话提问检测 测试
   * Summary: 大模型护栏多轮对话提问检测
   */
  async checkDemoAicoguardcoreAicoguardrailsQuestionEx(request: CheckDemoAicoguardcoreAicoguardrailsQuestionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CheckDemoAicoguardcoreAicoguardrailsQuestionResponse> {
    Util.validateModel(request);
    return $tea.cast<CheckDemoAicoguardcoreAicoguardrailsQuestionResponse>(await this.doRequest("1.0", "demo.aicoguardcore.aicoguardrails.question.check", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CheckDemoAicoguardcoreAicoguardrailsQuestionResponse({}));
  }

  /**
   * Description: 提问检测服务接口
   * Summary: 提问检测服务接口
   */
  async checkAntcloudAitechguardAicoguardrailsAsk(request: CheckAntcloudAitechguardAicoguardrailsAskRequest): Promise<CheckAntcloudAitechguardAicoguardrailsAskResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.checkAntcloudAitechguardAicoguardrailsAskEx(request, headers, runtime);
  }

  /**
   * Description: 提问检测服务接口
   * Summary: 提问检测服务接口
   */
  async checkAntcloudAitechguardAicoguardrailsAskEx(request: CheckAntcloudAitechguardAicoguardrailsAskRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CheckAntcloudAitechguardAicoguardrailsAskResponse> {
    Util.validateModel(request);
    return $tea.cast<CheckAntcloudAitechguardAicoguardrailsAskResponse>(await this.doRequest("1.0", "antcloud.aitechguard.aicoguardrails.ask.check", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CheckAntcloudAitechguardAicoguardrailsAskResponse({}));
  }

}
