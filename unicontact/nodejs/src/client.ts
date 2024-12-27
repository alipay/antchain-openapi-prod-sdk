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

// 场景构建结果体
export class StrategyUploadResult extends $tea.Model {
  // 元数据id
  ruleMetaId: number;
  // 场景id
  sceneId: number;
  // 租户场景id
  tenantSceneId: number;
  // 圈客规则id
  decisionRuleId: number;
  // 场景策略id
  sceneStrategyId: number;
  static names(): { [key: string]: string } {
    return {
      ruleMetaId: 'rule_meta_id',
      sceneId: 'scene_id',
      tenantSceneId: 'tenant_scene_id',
      decisionRuleId: 'decision_rule_id',
      sceneStrategyId: 'scene_strategy_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      ruleMetaId: 'number',
      sceneId: 'number',
      tenantSceneId: 'number',
      decisionRuleId: 'number',
      sceneStrategyId: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CallbackSmsStatusRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // TEXT_SMS_REPORT
  type: string;
  // 手机号
  phoneNumber: string;
  // 发送时间
  sendTime: string;
  // 状态报告时间。
  reportTime: string;
  // 是否接收成功。取值：true：接收成功false：接收失败
  success: boolean;
  // 状态报告编码。发送成功情况下为“DELIVERED”
  errCode: string;
  // 状态报告说明。发送成功情况下为“用户接收成功”
  errMsg: string;
  // 短信长度。
  smsSize: string;
  // 发送回执ID，即发送流水号。
  bizId: string;
  // 业务扩展字段，回执时透传，JSON格式
  bizProperties: string;
  // 发送卡片短信时，文本短信状态报告中才会有该字段，且取值为CARD_SMS，发送纯文本短信时，状态报告中没有该字段
  smsType?: string;
  // 运营商
  serviceProvider: string;
  // 手机号归属地
  city: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      type: 'type',
      phoneNumber: 'phone_number',
      sendTime: 'send_time',
      reportTime: 'report_time',
      success: 'success',
      errCode: 'err_code',
      errMsg: 'err_msg',
      smsSize: 'sms_size',
      bizId: 'biz_id',
      bizProperties: 'biz_properties',
      smsType: 'sms_type',
      serviceProvider: 'service_provider',
      city: 'city',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      type: 'string',
      phoneNumber: 'string',
      sendTime: 'string',
      reportTime: 'string',
      success: 'boolean',
      errCode: 'string',
      errMsg: 'string',
      smsSize: 'string',
      bizId: 'string',
      bizProperties: 'string',
      smsType: 'string',
      serviceProvider: 'string',
      city: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CallbackSmsStatusResponse extends $tea.Model {
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

export class CallbackSmsUpRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 回执类型
  type: string;
  // 手机号码
  phoneNumber: string;
  // 发送时间
  sendTime: string;
  // 发送内容
  content: string;
  // 签名
  signName: string;
  // 由通信平台提供的短信发送账号ak
  appKey: string;
  // 上行短信扩展号码
  destCode: string;
  // 序列
  sequenceId: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      type: 'type',
      phoneNumber: 'phone_number',
      sendTime: 'send_time',
      content: 'content',
      signName: 'sign_name',
      appKey: 'app_key',
      destCode: 'dest_code',
      sequenceId: 'sequence_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      type: 'string',
      phoneNumber: 'string',
      sendTime: 'string',
      content: 'string',
      signName: 'string',
      appKey: 'string',
      destCode: 'string',
      sequenceId: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CallbackSmsUpResponse extends $tea.Model {
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

export class CallbackRobotcallRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 外呼号码，支持密文
  // 
  customerKey: string;
  // 当前呼叫次数 Integer
  // 
  currentCallTimes: number;
  // 号码的模版类型
  // 
  keyTemplate: string;
  // 导入号码时返回的批次号
  // 
  batchId: string;
  // 外呼类型 建议按照如下约定给到 2001:批量-预测外呼 ...
  // 
  callType: number;
  // 用户自定义标签
  // 
  tag?: string;
  // 外呼呼叫实例id
  // 
  callId: string;
  // 外呼任务编号
  // 
  taskId: number;
  // 外呼任务名称
  // 
  taskName: string;
  // 外呼的话术模板ID，可以为空
  // 
  templateId?: number;
  // 外呼状态编码
  // 
  statusCode: number;
  // 外呼状态编码对应描述
  // 
  statusDescription: string;
  // 转人工状态编码
  // 
  transferStatusCode: string;
  // 转人工状态编码对应描述
  // 
  transferStatus: string;
  // 分配坐席ID,可以为空
  // 
  agentId?: number;
  // 建议填写坐席在贵司业务系统唯一标识，用于查询对应agent...
  // 
  agentTag?: string;
  // 坐席分机号，可以为空
  // 
  agentExtension?: string;
  // 导入时间，格式:2019-01-09 14:14:19
  // 
  importTime: string;
  // 开始通话时间，格式：2019-01-09 14:14:19
  // 
  callBeginTime: string;
  // 振铃时长,单位毫秒
  // 
  ringTime: number;
  // 接通时间
  // 
  answerTime?: string;
  // 通话时长，单位：大于1分钟，显示分钟秒，小于1分钟，显示秒
  // 
  speakingTime: string;
  // 通话时长，单位：秒
  // 
  speakingDuration: number;
  // 通话挂断时间
  // 
  hangupTime: string;
  // 对话轮次
  // 
  speakingTurns: number;
  // 坐席通话时长，单位：大于1分钟，显示分钟秒，小于1分钟，显示秒
  // 
  agentSpeakingTime: string;
  // 坐席通话时长，单位：秒
  // 
  agentSpeakingDuration: number;
  // 意向标签
  // 
  intentTag: string;
  // 意向说明
  // 
  intentDescription: string;
  // 个性标签
  // 
  individualTag?: string;
  // 回复关键词
  // 
  keywords?: string;
  // 挂机方式
  // 1
  hungupType: number;
  // 挂机短信，1:发送，2:不发送
  // 
  sms: number;
  // 对话录音,url
  // 
  chatRecord?: string;
  // 对话记录
  // 
  chats?: string;
  // 0:不添加，1:添加
  // 
  addWx?: number;
  // 加微进度可选值：已申请、加微成功
  // 
  addWxStatus?: string;
  // 是否接通重呼 0正常外呼，1接通重呼
  // 
  answerRecall: number;
  // 导入号码时的参数值
  properties?: string;
  // 导入号码时的业务参数值
  // 
  bizProperties?: string;
  // 拦截原因 可选值：黑名单拦截，灰名单拦截，异常号码拦截
  // 
  interceptReason?: string;
  // 回调冗余字段
  // 
  extInfo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      customerKey: 'customer_key',
      currentCallTimes: 'current_call_times',
      keyTemplate: 'key_template',
      batchId: 'batch_id',
      callType: 'call_type',
      tag: 'tag',
      callId: 'call_id',
      taskId: 'task_id',
      taskName: 'task_name',
      templateId: 'template_id',
      statusCode: 'status_code',
      statusDescription: 'status_description',
      transferStatusCode: 'transfer_status_code',
      transferStatus: 'transfer_status',
      agentId: 'agent_id',
      agentTag: 'agent_tag',
      agentExtension: 'agent_extension',
      importTime: 'import_time',
      callBeginTime: 'call_begin_time',
      ringTime: 'ring_time',
      answerTime: 'answer_time',
      speakingTime: 'speaking_time',
      speakingDuration: 'speaking_duration',
      hangupTime: 'hangup_time',
      speakingTurns: 'speaking_turns',
      agentSpeakingTime: 'agent_speaking_time',
      agentSpeakingDuration: 'agent_speaking_duration',
      intentTag: 'intent_tag',
      intentDescription: 'intent_description',
      individualTag: 'individual_tag',
      keywords: 'keywords',
      hungupType: 'hungup_type',
      sms: 'sms',
      chatRecord: 'chat_record',
      chats: 'chats',
      addWx: 'add_wx',
      addWxStatus: 'add_wx_status',
      answerRecall: 'answer_recall',
      properties: 'properties',
      bizProperties: 'biz_properties',
      interceptReason: 'intercept_reason',
      extInfo: 'ext_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      customerKey: 'string',
      currentCallTimes: 'number',
      keyTemplate: 'string',
      batchId: 'string',
      callType: 'number',
      tag: 'string',
      callId: 'string',
      taskId: 'number',
      taskName: 'string',
      templateId: 'number',
      statusCode: 'number',
      statusDescription: 'string',
      transferStatusCode: 'string',
      transferStatus: 'string',
      agentId: 'number',
      agentTag: 'string',
      agentExtension: 'string',
      importTime: 'string',
      callBeginTime: 'string',
      ringTime: 'number',
      answerTime: 'string',
      speakingTime: 'string',
      speakingDuration: 'number',
      hangupTime: 'string',
      speakingTurns: 'number',
      agentSpeakingTime: 'string',
      agentSpeakingDuration: 'number',
      intentTag: 'string',
      intentDescription: 'string',
      individualTag: 'string',
      keywords: 'string',
      hungupType: 'number',
      sms: 'number',
      chatRecord: 'string',
      chats: 'string',
      addWx: 'number',
      addWxStatus: 'string',
      answerRecall: 'number',
      properties: 'string',
      bizProperties: 'string',
      interceptReason: 'string',
      extInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CallbackRobotcallResponse extends $tea.Model {
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

export class ImportInitUploadRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 需要刷新的key
  key: string;
  // 需要刷新的value，可能是json格式
  value: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      key: 'key',
      value: 'value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      key: 'string',
      value: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportInitUploadResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 请求结果
  success?: boolean;
  // 场景结构体
  uploadResult?: StrategyUploadResult;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      uploadResult: 'upload_result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
      uploadResult: StrategyUploadResult,
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
          sdk_version: "1.0.2",
          _prod_code: "UNICONTACT",
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
   * Description: 短信状态回执
   * Summary: 短信状态回执
   */
  async callbackSmsStatus(request: CallbackSmsStatusRequest): Promise<CallbackSmsStatusResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.callbackSmsStatusEx(request, headers, runtime);
  }

  /**
   * Description: 短信状态回执
   * Summary: 短信状态回执
   */
  async callbackSmsStatusEx(request: CallbackSmsStatusRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CallbackSmsStatusResponse> {
    Util.validateModel(request);
    return $tea.cast<CallbackSmsStatusResponse>(await this.doRequest("1.0", "antdigital.unicontact.sms.status.callback", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CallbackSmsStatusResponse({}));
  }

  /**
   * Description: 短信上行回执
   * Summary: 短信上行回执
   */
  async callbackSmsUp(request: CallbackSmsUpRequest): Promise<CallbackSmsUpResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.callbackSmsUpEx(request, headers, runtime);
  }

  /**
   * Description: 短信上行回执
   * Summary: 短信上行回执
   */
  async callbackSmsUpEx(request: CallbackSmsUpRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CallbackSmsUpResponse> {
    Util.validateModel(request);
    return $tea.cast<CallbackSmsUpResponse>(await this.doRequest("1.0", "antdigital.unicontact.sms.up.callback", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CallbackSmsUpResponse({}));
  }

  /**
   * Description: 外呼回执
   * Summary: 外呼回执
   */
  async callbackRobotcall(request: CallbackRobotcallRequest): Promise<CallbackRobotcallResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.callbackRobotcallEx(request, headers, runtime);
  }

  /**
   * Description: 外呼回执
   * Summary: 外呼回执
   */
  async callbackRobotcallEx(request: CallbackRobotcallRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CallbackRobotcallResponse> {
    Util.validateModel(request);
    return $tea.cast<CallbackRobotcallResponse>(await this.doRequest("1.0", "antdigital.unicontact.robotcall.callback", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CallbackRobotcallResponse({}));
  }

  /**
   * Description: 初始化数据上传or更新
   * Summary: 初始化数据上传or更新
   */
  async importInitUpload(request: ImportInitUploadRequest): Promise<ImportInitUploadResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.importInitUploadEx(request, headers, runtime);
  }

  /**
   * Description: 初始化数据上传or更新
   * Summary: 初始化数据上传or更新
   */
  async importInitUploadEx(request: ImportInitUploadRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ImportInitUploadResponse> {
    Util.validateModel(request);
    return $tea.cast<ImportInitUploadResponse>(await this.doRequest("1.0", "antdigital.unicontact.init.upload.import", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ImportInitUploadResponse({}));
  }

}
