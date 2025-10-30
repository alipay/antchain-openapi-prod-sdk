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

export class QueryVoiceserviceQuerycalldetailRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 分配的租户id
  tenantId: string;
  // 分配的业务code
  instanceCode: string;
  // 通话的唯一识别 ID。调用外呼接口发起通话后，返回参数中会携带 CallId。
  callId: string;
  // 通话发生的时间。格式为 Unix 时间戳，单位：毫秒。
  queryDate: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      tenantId: 'tenant_id',
      instanceCode: 'instance_code',
      callId: 'call_id',
      queryDate: 'query_date',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      tenantId: 'string',
      instanceCode: 'string',
      callId: 'string',
      queryDate: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryVoiceserviceQuerycalldetailResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 请求状态码。
  // ● 返回 OK 代表请求成功。
  code?: string;
  // 状态码的描述。
  message?: string;
  // 返回的呼叫详情。JSON 格式。以下字段仅供参考，以具体返回详情为准。
  // ● caller：主叫号码。
  // ● startDate：通话开始时间。
  // ● stateDesc：通话状态描述。
  // ● duration：通话时长。单位：秒。0：用户未接通。
  // ● callerShowNumber：被叫显号。
  // ● gmtCreate：通话请求的接收时间。
  // ● state：通话状态。通话状态是运营商实时返回的，更多状态信息，请参见通话结果状态码。
  // ● endDate：通话结束时间。
  // ● calleeShowNumber：被叫显号。
  // ● callee：被叫号码。
  // ● aRingTime：a 路响铃开始时间。格式：yyyy-MM-dd HH:mm:ss。
  // ● aEndTime：a 路响铃结束时间。格式：yyyy-MM-dd HH:mm:ss。
  // （待确认）
  // ● bRingTime：b 路响铃开始时间。格式：yyyy-MM-dd HH:mm:ss。
  // ● bEndTime：b 路响铃结束时间。格式：yyyy-MM-dd HH:mm:ss。
  data?: string;
  // 本次调用请求的 ID，是由阿里云为该请求生成的唯一标识符，可用于排查和定位问题。
  requestId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      message: 'message',
      data: 'data',
      requestId: 'request_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'string',
      message: 'string',
      data: 'string',
      requestId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SendVoiceserviceSinglecallRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 分配的租户id
  tenantId: string;
  // 分配的业务code
  instanceCode: string;
  // 分配的主叫号码
  calledShowNumber: string;
  // 被叫用户号码
  calledNumber: string;
  // 播报文本内容
  context: string;
  // 录音字段
  voiceCode?: string;
  // TTS 变量播放时的声音风格。
  ttsStyle: string;
  // TTS 变量播放的音量。取值范围：0~100，默认值为 50。
  ttsVolume?: number;
  // TTS 变量播放时的声音速度。取值范围：0.5~2，默认值为 1。
  ttsSpeed?: number;
  // 播放次数。取值范围：1~3，默认取值 3。
  playTimes?: number;
  // 否	发起请求时预留给调用方的自定义 ID，最终会通过回执消息将此 ID 带回给调用方。
  // 字符串类型，长度限制为 1~128 个字符。
  outId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      tenantId: 'tenant_id',
      instanceCode: 'instance_code',
      calledShowNumber: 'called_show_number',
      calledNumber: 'called_number',
      context: 'context',
      voiceCode: 'voice_code',
      ttsStyle: 'tts_style',
      ttsVolume: 'tts_volume',
      ttsSpeed: 'tts_speed',
      playTimes: 'play_times',
      outId: 'out_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      tenantId: 'string',
      instanceCode: 'string',
      calledShowNumber: 'string',
      calledNumber: 'string',
      context: 'string',
      voiceCode: 'string',
      ttsStyle: 'string',
      ttsVolume: 'number',
      ttsSpeed: 'number',
      playTimes: 'number',
      outId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SendVoiceserviceSinglecallResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 请求状态码。
  // 返回 OK 代表请求成功。
  // 其他错误码，请参考API错误码
  code?: string;
  // 状态码的描述。
  message?: string;
  // 请求 ID
  requestId?: string;
  // 此次通话的唯一回执 ID。
  // 可以使用此 CallId，调用查询通话详情接口查询呼叫详情。
  callId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      message: 'message',
      requestId: 'request_id',
      callId: 'call_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'string',
      message: 'string',
      requestId: 'string',
      callId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SendVoiceserviceSmartcallRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 分配的租户id
  tenantId: string;
  // 分配的业务code
  instanceCode: string;
  // 分配的主叫号码
  calledShowNumber: string;
  // 被叫用户号码
  calledNumber: string;
  // 播报文本内容
  context: string;
  // code
  voiceCode?: string;
  // 停顿时长。用于设置用户停顿多久表示一句话结束。单位：毫秒，取值范围：300~1200。默认800。非特殊情况不建议调整
  pauseTime?: number;
  // 静音时长。用于设置用户多久不说话通话结束。单位：毫秒，取值范围：1000~20000。默认 10000
  muteTime?: number;
  // 当前返回的媒体文件是否可以被打断。默认取值为 true，即可被打断。
  // 如果为 false，即使下一个动作 action_break 为 true，也无法打断当前放音。
  actionCodeBreak?: boolean;
  // 基于用户持续说话时长打断。单位：毫秒。
  // 如果当前媒体文件 ActionCodeBreak 为 true，用户持续说话可以打断当前播放。不设置或者为 0，不生效。
  actionCodeTimeBreak?: number;
  // 最大通话时长，超时后自动挂断。单位：秒。
  sessionTimeout?: number;
  // TTS 变量播放时的声音风格。
  ttsStyle: string;
  // TTS 变量播放的音量。取值范围：0~100，默认值为 50。
  ttsVolume?: number;
  // TTS 变量播放时的声音速度。取值范围：0.5~2，默认值为 1。
  ttsSpeed?: number;
  // 用户和机器人对话时播放的背景语音文件 ID。
  backgroundFileCode?: string;
  // 否	发起请求时预留给调用方的自定义 ID，最终会通过回执消息将此 ID 带回给调用方。
  // 字符串类型，长度限制为 1~128 个字符。
  outId?: string;
  // 预留给调用方使用的动态扩展 ID。在回调地址中带回，用于客户的开发标识。
  dynamicId?: string;
  // 是否在后处理中执行 ITN。默认为 false，即不执行。
  // 设置为 true 时，中文数字将转为阿拉伯数字输出。
  enableITN?: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      tenantId: 'tenant_id',
      instanceCode: 'instance_code',
      calledShowNumber: 'called_show_number',
      calledNumber: 'called_number',
      context: 'context',
      voiceCode: 'voice_code',
      pauseTime: 'pause_time',
      muteTime: 'mute_time',
      actionCodeBreak: 'action_code_break',
      actionCodeTimeBreak: 'action_code_time_break',
      sessionTimeout: 'session_timeout',
      ttsStyle: 'tts_style',
      ttsVolume: 'tts_volume',
      ttsSpeed: 'tts_speed',
      backgroundFileCode: 'background_file_code',
      outId: 'out_id',
      dynamicId: 'dynamic_id',
      enableITN: 'enable_i_t_n',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      tenantId: 'string',
      instanceCode: 'string',
      calledShowNumber: 'string',
      calledNumber: 'string',
      context: 'string',
      voiceCode: 'string',
      pauseTime: 'number',
      muteTime: 'number',
      actionCodeBreak: 'boolean',
      actionCodeTimeBreak: 'number',
      sessionTimeout: 'number',
      ttsStyle: 'string',
      ttsVolume: 'number',
      ttsSpeed: 'number',
      backgroundFileCode: 'string',
      outId: 'string',
      dynamicId: 'string',
      enableITN: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SendVoiceserviceSmartcallResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 请求状态码。
  // ● 返回 OK 代表请求成功。
  code?: string;
  // 状态码的描述。
  message?: string;
  // 请求 ID。
  requestId?: string;
  // 此次通话的唯一回执 ID。
  // 可以使用此 CallId，调用查询通话详情接口查询呼叫详情。
  callId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      message: 'message',
      requestId: 'request_id',
      callId: 'call_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'string',
      message: 'string',
      requestId: 'string',
      callId: 'string',
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
          _prod_code: "DTCALLAGENT",
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
   * Description: 通过租户ID、业务Code、通话的唯一识别ID以及通话时间查询呼叫详情数据
   * Summary: 呼叫详情查询
   */
  async queryVoiceserviceQuerycalldetail(request: QueryVoiceserviceQuerycalldetailRequest): Promise<QueryVoiceserviceQuerycalldetailResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryVoiceserviceQuerycalldetailEx(request, headers, runtime);
  }

  /**
   * Description: 通过租户ID、业务Code、通话的唯一识别ID以及通话时间查询呼叫详情数据
   * Summary: 呼叫详情查询
   */
  async queryVoiceserviceQuerycalldetailEx(request: QueryVoiceserviceQuerycalldetailRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryVoiceserviceQuerycalldetailResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryVoiceserviceQuerycalldetailResponse>(await this.doRequest("1.0", "antcloud.dtcallagent.voiceservice.querycalldetail.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryVoiceserviceQuerycalldetailResponse({}));
  }

  /**
   * Description: 通知类外呼
   * Summary: 通知类外呼
   */
  async sendVoiceserviceSinglecall(request: SendVoiceserviceSinglecallRequest): Promise<SendVoiceserviceSinglecallResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.sendVoiceserviceSinglecallEx(request, headers, runtime);
  }

  /**
   * Description: 通知类外呼
   * Summary: 通知类外呼
   */
  async sendVoiceserviceSinglecallEx(request: SendVoiceserviceSinglecallRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SendVoiceserviceSinglecallResponse> {
    Util.validateModel(request);
    return $tea.cast<SendVoiceserviceSinglecallResponse>(await this.doRequest("1.0", "antcloud.dtcallagent.voiceservice.singlecall.send", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SendVoiceserviceSinglecallResponse({}));
  }

  /**
   * Description: 说明需要配合接入智能外呼回调接口联合使用，语音平台发起呼叫后会把转换后的语音文本回传给接入方，接入方把下一步的执行动作返回给语音平台
   * Summary: 交互类外呼
   */
  async sendVoiceserviceSmartcall(request: SendVoiceserviceSmartcallRequest): Promise<SendVoiceserviceSmartcallResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.sendVoiceserviceSmartcallEx(request, headers, runtime);
  }

  /**
   * Description: 说明需要配合接入智能外呼回调接口联合使用，语音平台发起呼叫后会把转换后的语音文本回传给接入方，接入方把下一步的执行动作返回给语音平台
   * Summary: 交互类外呼
   */
  async sendVoiceserviceSmartcallEx(request: SendVoiceserviceSmartcallRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SendVoiceserviceSmartcallResponse> {
    Util.validateModel(request);
    return $tea.cast<SendVoiceserviceSmartcallResponse>(await this.doRequest("1.0", "antcloud.dtcallagent.voiceservice.smartcall.send", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SendVoiceserviceSmartcallResponse({}));
  }

}
