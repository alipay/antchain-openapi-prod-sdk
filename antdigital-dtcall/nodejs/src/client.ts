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

// 外呼任务简单对象
export class OutcallTask extends $tea.Model {
  // 任务编码
  code: string;
  // 任务名称
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
  phoneNumber: string;
  // 用户业务 ID，回执中透出，需保证唯一
  bizId: string;
  // 扩展业务字段，可用于变量参数和回执透出 json格式字符串
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

export class QueryAntcloudDtcallagentTaskRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 租户id
  tenantId: string;
  // 实例编码
  instanceCode: string;
  // 任务名称，支持模糊匹配
  name?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      tenantId: 'tenant_id',
      instanceCode: 'instance_code',
      name: 'name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      tenantId: 'string',
      instanceCode: 'string',
      name: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntcloudDtcallagentTaskResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 请求唯一id
  requestId?: string;
  // 是否成功
  success?: boolean;
  // 任务列表
  data?: OutcallTask[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      requestId: 'request_id',
      success: 'success',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      requestId: 'string',
      success: 'boolean',
      data: { 'type': 'array', 'itemType': OutcallTask },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportAntcloudDtcallagentDispatcherOrderRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 请求唯一 ID，建议全局唯一
  requestId: string;
  // 租户id
  tenantId: string;
  // 实例code
  instanceCode: string;
  // 外呼任务编码
  taskCode: string;
  // 外呼调度时间，实际拨打时间大于等于该时间，建议格式：yyyy-MM-dd HH:mm:ss
  callTime: string;
  // 失效时间，建议格式：yyyy-MM-dd HH:mm:ss，默认 7 天
  expirationTime?: string;
  // 触达用户列表，单次上限 100
  customerList: Customer[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      requestId: 'request_id',
      tenantId: 'tenant_id',
      instanceCode: 'instance_code',
      taskCode: 'task_code',
      callTime: 'call_time',
      expirationTime: 'expiration_time',
      customerList: 'customer_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      requestId: 'string',
      tenantId: 'string',
      instanceCode: 'string',
      taskCode: 'string',
      callTime: 'string',
      expirationTime: 'string',
      customerList: { 'type': 'array', 'itemType': Customer },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportAntcloudDtcallagentDispatcherOrderResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 请求唯一 ID
  requestId?: string;
  // 是否成功
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      requestId: 'request_id',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      requestId: 'string',
      success: 'boolean',
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
          sdk_version: "1.0.1",
          _prod_code: "DTCALL",
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
   * Description: 外呼任务查询接口
   * Summary: 外呼任务查询接口
   */
  async queryAntcloudDtcallagentTask(request: QueryAntcloudDtcallagentTaskRequest): Promise<QueryAntcloudDtcallagentTaskResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAntcloudDtcallagentTaskEx(request, headers, runtime);
  }

  /**
   * Description: 外呼任务查询接口
   * Summary: 外呼任务查询接口
   */
  async queryAntcloudDtcallagentTaskEx(request: QueryAntcloudDtcallagentTaskRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAntcloudDtcallagentTaskResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAntcloudDtcallagentTaskResponse>(await this.doRequest("1.0", "antcloud.dtcallagent.task.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAntcloudDtcallagentTaskResponse({}));
  }

  /**
   * Description: 对外批量收单接口
   * Summary: 对外批量收单接口
   */
  async importAntcloudDtcallagentDispatcherOrder(request: ImportAntcloudDtcallagentDispatcherOrderRequest): Promise<ImportAntcloudDtcallagentDispatcherOrderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.importAntcloudDtcallagentDispatcherOrderEx(request, headers, runtime);
  }

  /**
   * Description: 对外批量收单接口
   * Summary: 对外批量收单接口
   */
  async importAntcloudDtcallagentDispatcherOrderEx(request: ImportAntcloudDtcallagentDispatcherOrderRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ImportAntcloudDtcallagentDispatcherOrderResponse> {
    Util.validateModel(request);
    return $tea.cast<ImportAntcloudDtcallagentDispatcherOrderResponse>(await this.doRequest("1.0", "antcloud.dtcallagent.dispatcher.order.import", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ImportAntcloudDtcallagentDispatcherOrderResponse({}));
  }

}
