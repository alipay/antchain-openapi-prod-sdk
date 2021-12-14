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

// 任务统计
export class TaskCount extends $tea.Model {
  // 总数量
  totalCount: number;
  // 成功数量
  successCount: number;
  // 处理中的数量
  processingCount: number;
  // 失败数量
  failureCount: number;
  static names(): { [key: string]: string } {
    return {
      totalCount: 'total_count',
      successCount: 'success_count',
      processingCount: 'processing_count',
      failureCount: 'failure_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      totalCount: 'number',
      successCount: 'number',
      processingCount: 'number',
      failureCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 事件租户
export class EventTenant extends $tea.Model {
  // 智科租户2088 ID，tenant_id/tenant_name二选一
  tenantId?: string;
  // 租户8位字母，tenant_id/tenant_name二选一
  tenantName?: string;
  static names(): { [key: string]: string } {
    return {
      tenantId: 'tenant_id',
      tenantName: 'tenant_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      tenantId: 'string',
      tenantName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 事件资源
export class EventResource extends $tea.Model {
  // 资源类型
  type: string;
  // 实例ID
  value: string;
  static names(): { [key: string]: string } {
    return {
      type: 'type',
      value: 'value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      type: 'string',
      value: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 键值对
export class KeyValuePair extends $tea.Model {
  // 键
  key: string;
  // 值
  value: string;
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

// 事件接收人
export class EventReceiver extends $tea.Model {
  // 接收人的有效联系方式
  receiver: string;
  // 接收人联系方式的类型
  receiverType: string;
  // 消息发送类型
  msgType: string;
  static names(): { [key: string]: string } {
    return {
      receiver: 'receiver',
      receiverType: 'receiver_type',
      msgType: 'msg_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      receiver: 'string',
      receiverType: 'string',
      msgType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportEventMetadataRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 元数据文本
  content: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      content: 'content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      content: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportEventMetadataResponse extends $tea.Model {
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

export class ExportEventMetadataRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 事件码
  eventCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      eventCode: 'event_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      eventCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExportEventMetadataResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 事件码元数据
  content?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      content: 'content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      content: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SendEventAsyncRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 事件码
  eventCode: string;
  // 事件上下文，用于填充消息模板里的参数
  eventParams?: KeyValuePair[];
  // 消息接收人，对应自定义人群
  eventReceivers?: EventReceiver[];
  // 租户信息，对应智科用户群组
  eventTenant?: EventTenant;
  // 事件资源，据此查询相关的内部小二群组
  eventResources?: EventResource[];
  // 发送方，用于查询结果，可以是系统名、产品码、员工工号等等
  sender: string;
  // 描述sender
  senderName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      eventCode: 'event_code',
      eventParams: 'event_params',
      eventReceivers: 'event_receivers',
      eventTenant: 'event_tenant',
      eventResources: 'event_resources',
      sender: 'sender',
      senderName: 'sender_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      eventCode: 'string',
      eventParams: { 'type': 'array', 'itemType': KeyValuePair },
      eventReceivers: { 'type': 'array', 'itemType': EventReceiver },
      eventTenant: EventTenant,
      eventResources: { 'type': 'array', 'itemType': EventResource },
      sender: 'string',
      senderName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SendEventAsyncResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 事件ID
  taskId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      taskId: 'task_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      taskId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SendEventDirectRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 事件码
  eventCode: string;
  // 事件参数
  eventParams?: KeyValuePair[];
  // 接收者
  eventReceiver: EventReceiver;
  // 发送方，用于查询结果，可以是系统名、产品码、员工工号等等
  sender: string;
  // 用于描述sender
  senderName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      eventCode: 'event_code',
      eventParams: 'event_params',
      eventReceiver: 'event_receiver',
      sender: 'sender',
      senderName: 'sender_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      eventCode: 'string',
      eventParams: { 'type': 'array', 'itemType': KeyValuePair },
      eventReceiver: EventReceiver,
      sender: 'string',
      senderName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SendEventDirectResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 事件ID
  taskId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      taskId: 'task_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      taskId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CountTaskMessageRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 24位任务id
  taskId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      taskId: 'task_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      taskId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CountTaskMessageResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 事件码
  eventCode?: string;
  // 任务状态
  taskState?: string;
  // 消息发送统计
  messageCount?: TaskCount;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      eventCode: 'event_code',
      taskState: 'task_state',
      messageCount: 'message_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      eventCode: 'string',
      taskState: 'string',
      messageCount: TaskCount,
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
          sdk_version: "1.0.4",
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
   * Description: 事件元数据导入
   * Summary: 事件元数据导入
   */
  async importEventMetadata(request: ImportEventMetadataRequest): Promise<ImportEventMetadataResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.importEventMetadataEx(request, headers, runtime);
  }

  /**
   * Description: 事件元数据导入
   * Summary: 事件元数据导入
   */
  async importEventMetadataEx(request: ImportEventMetadataRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ImportEventMetadataResponse> {
    Util.validateModel(request);
    return $tea.cast<ImportEventMetadataResponse>(await this.doRequest("1.0", "antcloud.notification.event.metadata.import", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ImportEventMetadataResponse({}));
  }

  /**
   * Description: 事件元数据导出
   * Summary: 事件元数据导出
   */
  async exportEventMetadata(request: ExportEventMetadataRequest): Promise<ExportEventMetadataResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.exportEventMetadataEx(request, headers, runtime);
  }

  /**
   * Description: 事件元数据导出
   * Summary: 事件元数据导出
   */
  async exportEventMetadataEx(request: ExportEventMetadataRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExportEventMetadataResponse> {
    Util.validateModel(request);
    return $tea.cast<ExportEventMetadataResponse>(await this.doRequest("1.0", "antcloud.notification.event.metadata.export", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExportEventMetadataResponse({}));
  }

  /**
   * Description: 发送事件(异步执行)
   * Summary: 发送事件(异步执行)
   */
  async sendEventAsync(request: SendEventAsyncRequest): Promise<SendEventAsyncResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.sendEventAsyncEx(request, headers, runtime);
  }

  /**
   * Description: 发送事件(异步执行)
   * Summary: 发送事件(异步执行)
   */
  async sendEventAsyncEx(request: SendEventAsyncRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SendEventAsyncResponse> {
    Util.validateModel(request);
    return $tea.cast<SendEventAsyncResponse>(await this.doRequest("1.0", "antcloud.notification.event.async.send", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SendEventAsyncResponse({}));
  }

  /**
   * Description: 直发事件(同步调用)
   * Summary: 直发事件(同步调用)
   */
  async sendEventDirect(request: SendEventDirectRequest): Promise<SendEventDirectResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.sendEventDirectEx(request, headers, runtime);
  }

  /**
   * Description: 直发事件(同步调用)
   * Summary: 直发事件(同步调用)
   */
  async sendEventDirectEx(request: SendEventDirectRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SendEventDirectResponse> {
    Util.validateModel(request);
    return $tea.cast<SendEventDirectResponse>(await this.doRequest("1.0", "antcloud.notification.event.direct.send", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SendEventDirectResponse({}));
  }

  /**
   * Description: 获取事件发送结果
   * Summary: 获取事件发送结果
   */
  async countTaskMessage(request: CountTaskMessageRequest): Promise<CountTaskMessageResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.countTaskMessageEx(request, headers, runtime);
  }

  /**
   * Description: 获取事件发送结果
   * Summary: 获取事件发送结果
   */
  async countTaskMessageEx(request: CountTaskMessageRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CountTaskMessageResponse> {
    Util.validateModel(request);
    return $tea.cast<CountTaskMessageResponse>(await this.doRequest("1.0", "antcloud.notification.task.message.count", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CountTaskMessageResponse({}));
  }

}
