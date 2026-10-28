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

// 外呼任务简单对象
export class OutcallTask extends $tea.Model {
  // 任务编码
  /**
   * @example
   * task_123
   */
  code: string;
  // 任务名称
  /**
   * @example
   * 催收外呼任务
   */
  name: string;
  static names(): { [key: string]: string } {
    return {
      code: 'code',
      name: 'name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      code: 'string',
      name: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 触达用户
export class Customer extends $tea.Model {
  // 用户手机号
  /**
   * @example
   * 0571****5678
   */
  phoneNumber: string;
  // 用户业务 ID，回执中透出，需保证唯一
  /**
   * @example
   * 12313156789654
   */
  bizId: string;
  // 扩展业务字段，可用于变量参数和回执透出 json格式字符串
  /**
   * @example
   * {"name":"张三"}
   */
  bizProperties?: string;
  static names(): { [key: string]: string } {
    return {
      phoneNumber: 'phone_number',
      bizId: 'biz_id',
      bizProperties: 'biz_properties',
    };
  }

  static types(): { [key: string]: any } {
    return {
      phoneNumber: 'string',
      bizId: 'string',
      bizProperties: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 客户号码列表
export class CustomerItem extends $tea.Model {
  // 客户业务键
  /**
   * @example
   * 客户业务键
   */
  bizId?: string;
  // 手机号
  /**
   * @example
   * 12233332222
   */
  phoneNumber: string;
  // 业务属性
  /**
   * @example
   * {"姓名":"张","customerId":"Z3gnNptlEf7FyNGsD3o1mg","性别":"1","issue":"1","effectTime":"1","price":"1"}
   */
  bizProperties?: string;
  static names(): { [key: string]: string } {
    return {
      bizId: 'biz_id',
      phoneNumber: 'phone_number',
      bizProperties: 'biz_properties',
    };
  }

  static types(): { [key: string]: any } {
    return {
      bizId: 'string',
      phoneNumber: 'string',
      bizProperties: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecuteAntcloudDtcallagentVoiceinspectionRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 租户 ID
  tenantId: string;
  // 业务空间实例编码，如 demo
  instanceCode: string;
  // 质检规则集 ID，如 qc-heiniu-v1
  qcRuleSetId: string;
  // 对话文本
  voiceText: string;
  // 录音地址
  voiceUrl?: string;
  // 调用方批次 ID
  batchId?: string;
  // 调用方通话唯一标识
  externalCallId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      tenantId: 'tenant_id',
      instanceCode: 'instance_code',
      qcRuleSetId: 'qc_rule_set_id',
      voiceText: 'voice_text',
      voiceUrl: 'voice_url',
      batchId: 'batch_id',
      externalCallId: 'external_call_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      tenantId: 'string',
      instanceCode: 'string',
      qcRuleSetId: 'string',
      voiceText: 'string',
      voiceUrl: 'string',
      batchId: 'string',
      externalCallId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecuteAntcloudDtcallagentVoiceinspectionResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 质检记录 ID
  qcRecordId?: string;
  // ACCEPTED 表示异步任务已受理
  status?: string;
  // 本次提交的批次 ID
  batchId?: string;
  // 外部通话唯一标识
  externalCallId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      qcRecordId: 'qc_record_id',
      status: 'status',
      batchId: 'batch_id',
      externalCallId: 'external_call_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      qcRecordId: 'string',
      status: 'string',
      batchId: 'string',
      externalCallId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntcloudDtcallagentVoiceinspectionRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 租户 ID
  tenantId: string;
  // 业务空间实例编码
  instanceCode: string;
  // execute 接口返回的质检记录 ID
  qcRecordId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      tenantId: 'tenant_id',
      instanceCode: 'instance_code',
      qcRecordId: 'qc_record_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      tenantId: 'string',
      instanceCode: 'string',
      qcRecordId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntcloudDtcallagentVoiceinspectionResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // qc_record_id
  qcRecordId?: string;
  // 异步任务状态，如 PROCESSING、COMPLETED、FAILED
  status?: string;
  // 100 分制总分
  totalScore?: number;
  // result
  result?: string;
  // 质检规则命中明细
  checklist?: string[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      qcRecordId: 'qc_record_id',
      status: 'status',
      totalScore: 'total_score',
      result: 'result',
      checklist: 'checklist',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      qcRecordId: 'string',
      status: 'string',
      totalScore: 'number',
      result: 'string',
      checklist: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportOrderRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 投放任务ID
  strategyTaskId: number;
  // 客户请求流水号
  requestNo: string;
  // 客户号码列表
  customers: CustomerItem[];
  // 手机号传入格式:PLAIN明文 / MD5 / SHA256，不填即为默认PLAIN
  mobileFormat?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      strategyTaskId: 'strategy_task_id',
      requestNo: 'request_no',
      customers: 'customers',
      mobileFormat: 'mobile_format',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      strategyTaskId: 'number',
      requestNo: 'string',
      customers: { 'type': 'array', 'itemType': CustomerItem },
      mobileFormat: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportOrderResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否受理成功
  success?: string;
  // 平台批次号
  batchNo?: string;
  // 同步段状态
  status?: string;
  // 失败原因码
  failReason?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      batchNo: 'batch_no',
      status: 'status',
      failReason: 'fail_reason',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'string',
      batchNo: 'string',
      status: 'string',
      failReason: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CallbackRobotcallRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 外呼号码，支持密文
  customerKey: string;
  // 当前呼叫次数 Integer
  currentCallTimes: number;
  // 号码的模版类型
  keyTemplate: string;
  // 导入号码时返回的批次号
  batchId: string;
  // 外呼类型 建议按照如下约定给到 2001:批量-预测外呼 2002:批量-AI外呼-不转人工 2003:批量-AI外呼-接通转人工 2004: 批量-AI外呼-智能转人工 2005:批量-语音通知
  callType: number;
  // 用户自定义标签
  tag?: string;
  // 外呼呼叫实例id
  callId: string;
  // 外呼任务编号
  taskId: number;
  // 外呼任务名称
  taskName: string;
  // 外呼的话术模板ID，可以为空
  templateId?: number;
  // 外呼状态编码
  statusCode: number;
  // 外呼状态编码对应描述
  statusDescription: string;
  // 转人工状态编码
  transferStatusCode: string;
  // 转人工状态编码对应描述
  transferStatus: string;
  // 分配坐席ID,可以为空
  agentId?: number;
  // 建议填写坐席在贵司业务系统唯一标识，用于查询对应agentId；可以为空。
  agentTag?: string;
  // 坐席分机号，可以为空
  agentExtension?: string;
  // 导入时间，格式:2019-01-09 14:14:19
  importTime: string;
  // 开始通话时间，格式：2019-01-09 14:14:19
  callBeginTime: string;
  // 振铃时长,单位毫秒
  ringTime: number;
  // 接通时间
  answerTime?: string;
  // 通话时长，单位：大于1分钟，显示分钟秒，小于1分钟，显示秒
  speakingTime: string;
  // 通话时长，单位：秒
  speakingDuration: number;
  // 通话挂断时间
  hangupTime: string;
  // 对话轮次
  speakingTurns: number;
  // 坐席通话时长，单位：大于1分钟，显示分钟秒，小于1分钟，显示秒
  agentSpeakingTime: string;
  // 坐席通话时长，单位：秒
  agentSpeakingDuration: number;
  // 意向标签
  intentTag: string;
  // 意向说明
  intentDescription: string;
  // 个性标签
  individualTag?: string;
  // 回复关键词
  keywords?: string;
  // 挂机方式
  hungupType: number;
  // 挂机短信，1:发送，2:不发送
  sms: number;
  // 对话录音,url
  chatRecord?: string;
  // 对话记录
  chats?: string;
  // 0:不添加，1:添加
  addWx?: number;
  // 加微进度可选值：已申请、加微成功
  addWxStatus?: string;
  // 是否接通重呼 0正常外呼，1接通重呼
  answerRecall: number;
  // 导入号码时的参数值
  properties?: string;
  // 导入号码时的业务参数值
  bizProperties?: string;
  // 拦截原因 可选值：黑名单拦截，灰名单拦截，异常号码拦截
  interceptReason?: string;
  // 回调冗余字段
  extInfo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
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
          sdk_version: "1.0.7",
          _prod_code: "AICONUMDECISION",
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
   * Description: 黑牛质检接口
   * Summary: 黑牛质检接口
   */
  async executeAntcloudDtcallagentVoiceinspection(request: ExecuteAntcloudDtcallagentVoiceinspectionRequest): Promise<ExecuteAntcloudDtcallagentVoiceinspectionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.executeAntcloudDtcallagentVoiceinspectionEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 黑牛质检接口
   * Summary: 黑牛质检接口
   */
  async executeAntcloudDtcallagentVoiceinspectionEx(request: ExecuteAntcloudDtcallagentVoiceinspectionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecuteAntcloudDtcallagentVoiceinspectionResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecuteAntcloudDtcallagentVoiceinspectionResponse>(await this.doRequest("1.0", "antcloud.dtcallagent.voiceinspection.execute", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecuteAntcloudDtcallagentVoiceinspectionResponse({}));
  }

  /**
   * @remarks
   * Description: 黑牛质检接口查询结果
   * Summary: 黑牛质检接口查询结果
   */
  async queryAntcloudDtcallagentVoiceinspection(request: QueryAntcloudDtcallagentVoiceinspectionRequest): Promise<QueryAntcloudDtcallagentVoiceinspectionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAntcloudDtcallagentVoiceinspectionEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 黑牛质检接口查询结果
   * Summary: 黑牛质检接口查询结果
   */
  async queryAntcloudDtcallagentVoiceinspectionEx(request: QueryAntcloudDtcallagentVoiceinspectionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAntcloudDtcallagentVoiceinspectionResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAntcloudDtcallagentVoiceinspectionResponse>(await this.doRequest("1.0", "antcloud.dtcallagent.voiceinspection.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAntcloudDtcallagentVoiceinspectionResponse({}));
  }

  /**
   * @remarks
   * Description: 云通信号码决策平台收单
   * Summary: 云通信号码决策平台收单
   */
  async importOrder(request: ImportOrderRequest): Promise<ImportOrderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.importOrderEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 云通信号码决策平台收单
   * Summary: 云通信号码决策平台收单
   */
  async importOrderEx(request: ImportOrderRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ImportOrderResponse> {
    Util.validateModel(request);
    return $tea.cast<ImportOrderResponse>(await this.doRequest("1.0", "antcloud.aiconumdecision.order.import", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ImportOrderResponse({}));
  }

  /**
   * @remarks
   * Description: 外呼回执
   * Summary: 外呼回执
   */
  async callbackRobotcall(request: CallbackRobotcallRequest): Promise<CallbackRobotcallResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.callbackRobotcallEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 外呼回执
   * Summary: 外呼回执
   */
  async callbackRobotcallEx(request: CallbackRobotcallRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CallbackRobotcallResponse> {
    Util.validateModel(request);
    return $tea.cast<CallbackRobotcallResponse>(await this.doRequest("1.0", "antcloud.aiconumdecision.robotcall.callback", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CallbackRobotcallResponse({}));
  }

}
