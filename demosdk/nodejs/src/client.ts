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

// 1
export class TestDemo extends $tea.Model {
  // 1
  name?: string;
  // 1
  number?: number;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      number: 'number',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      number: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// Demo类1
export class DemoClass extends $tea.Model {
  // 字符串测试
  someString: string;
  // 日期测试
  someDate: string;
  // Boolean测试
  someBoolean: boolean;
  // 整数测试
  someInt: number;
  // 列表测试
  someList: string[];
  static names(): { [key: string]: string } {
    return {
      someString: 'some_string',
      someDate: 'some_date',
      someBoolean: 'some_boolean',
      someInt: 'some_int',
      someList: 'some_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      someString: 'string',
      someDate: 'string',
      someBoolean: 'boolean',
      someInt: 'number',
      someList: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 返回结果测试类
export class ResultTest extends $tea.Model {
  // 姓名
  name?: string;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// InitPack
export class InitPack extends $tea.Model {
  // 2022-11-07 14:48
  time?: string;
  // wanyi
  operator?: string;
  // 1
  count?: number;
  static names(): { [key: string]: string } {
    return {
      time: 'time',
      operator: 'operator',
      count: 'count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      time: 'string',
      operator: 'string',
      count: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 测试实体
export class SumBean extends $tea.Model {
  // 元素名称
  eName?: string;
  // 数量
  num?: number;
  static names(): { [key: string]: string } {
    return {
      eName: 'e_name',
      num: 'num',
    };
  }

  static types(): { [key: string]: any } {
    return {
      eName: 'string',
      num: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAaaSdkRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAaaSdkResponse extends $tea.Model {
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

export class BindAaaBbbCccRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 123
  date: string;
  // 123
  data: string;
  // 测试参数
  demoClass: DemoClass;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      date: 'date',
      data: 'data',
      demoClass: 'demo_class',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      date: 'string',
      data: 'string',
      demoClass: DemoClass,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BindAaaBbbCccResponse extends $tea.Model {
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

export class QueryAaaCcdRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 123
  test?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      test: 'test',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      test: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAaaCcdResponse extends $tea.Model {
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

export class BindXxxRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 123
  date: string;
  // 123
  data: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      date: 'date',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      date: 'string',
      data: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BindXxxResponse extends $tea.Model {
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

export class PublishWorkbenchOneRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时时间
  timeout: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      timeout: 'timeout',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      timeout: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PublishWorkbenchOneResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 状态
  msg?: string;
  // 状态码
  status?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      msg: 'msg',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      msg: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PublishWorkbenchTwoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时时间
  timeout: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      timeout: 'timeout',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      timeout: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PublishWorkbenchTwoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 状态
  msg?: string;
  // 状态码
  status?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      msg: 'msg',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      msg: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportTwiceThreeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时间
  timeout: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      timeout: 'timeout',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      timeout: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportTwiceThreeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 状态码
  stauts?: string;
  // 状态描述
  msg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      stauts: 'stauts',
      msg: 'msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      stauts: 'string',
      msg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PublishWorkbenchThreeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时时间
  timeout: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      timeout: 'timeout',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      timeout: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PublishWorkbenchThreeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 状态
  msg?: string;
  // 状态码
  status?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      msg: 'msg',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      msg: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PublishWorkbenchFourRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时时间
  timeout: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      timeout: 'timeout',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      timeout: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PublishWorkbenchFourResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 状态
  msg?: string;
  // 状态码
  status?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      msg: 'msg',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      msg: 'string',
      status: 'string',
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
          sdk_version: "1.3.39",
          _prod_code: "DEMOSDK",
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
   * Description: 这是测试的
   * Summary: 这是测试的
   */
  async queryAaaSdk(request: QueryAaaSdkRequest): Promise<QueryAaaSdkResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAaaSdkEx(request, headers, runtime);
  }

  /**
   * Description: 这是测试的
   * Summary: 这是测试的
   */
  async queryAaaSdkEx(request: QueryAaaSdkRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAaaSdkResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAaaSdkResponse>(await this.doRequest("1.0", "antchain.demosdk.aaa.sdk.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAaaSdkResponse({}));
  }

  /**
   * Description: 自动化测试创建test，请勿修改、删除
   * Summary: 自动化测试创建test，请勿修改、删除
   */
  async bindAaaBbbCcc(request: BindAaaBbbCccRequest): Promise<BindAaaBbbCccResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.bindAaaBbbCccEx(request, headers, runtime);
  }

  /**
   * Description: 自动化测试创建test，请勿修改、删除
   * Summary: 自动化测试创建test，请勿修改、删除
   */
  async bindAaaBbbCccEx(request: BindAaaBbbCccRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BindAaaBbbCccResponse> {
    Util.validateModel(request);
    return $tea.cast<BindAaaBbbCccResponse>(await this.doRequest("1.0", "antchain.demosdk.aaa.bbb.ccc.bind", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BindAaaBbbCccResponse({}));
  }

  /**
   * Description: 自动化测试创建test，请勿修改、删除
   * Summary: 自动化测试创建test，请勿修改、删除
   */
  async queryAaaCcd(request: QueryAaaCcdRequest): Promise<QueryAaaCcdResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAaaCcdEx(request, headers, runtime);
  }

  /**
   * Description: 自动化测试创建test，请勿修改、删除
   * Summary: 自动化测试创建test，请勿修改、删除
   */
  async queryAaaCcdEx(request: QueryAaaCcdRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAaaCcdResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAaaCcdResponse>(await this.doRequest("1.0", "antchain.demosdk.aaa.ccd.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAaaCcdResponse({}));
  }

  /**
   * Description: 自动化测试创建test，请勿修改、删除
   * Summary: 自动化测试创建test，请勿修改、删除
   */
  async bindXxx(request: BindXxxRequest): Promise<BindXxxResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.bindXxxEx(request, headers, runtime);
  }

  /**
   * Description: 自动化测试创建test，请勿修改、删除
   * Summary: 自动化测试创建test，请勿修改、删除
   */
  async bindXxxEx(request: BindXxxRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BindXxxResponse> {
    Util.validateModel(request);
    return $tea.cast<BindXxxResponse>(await this.doRequest("1.0", "antchain.demosdk.xxx.bind", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BindXxxResponse({}));
  }

  /**
   * Description: 个人工作台测试使用
   * Summary: 个人工作台测试使用
   */
  async publishWorkbenchOne(request: PublishWorkbenchOneRequest): Promise<PublishWorkbenchOneResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.publishWorkbenchOneEx(request, headers, runtime);
  }

  /**
   * Description: 个人工作台测试使用
   * Summary: 个人工作台测试使用
   */
  async publishWorkbenchOneEx(request: PublishWorkbenchOneRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PublishWorkbenchOneResponse> {
    Util.validateModel(request);
    return $tea.cast<PublishWorkbenchOneResponse>(await this.doRequest("1.0", "antchain.demosdk.workbench.one.publish", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PublishWorkbenchOneResponse({}));
  }

  /**
   * Description: 个人工作台测试
   * Summary: 个人工作台测试
   */
  async publishWorkbenchTwo(request: PublishWorkbenchTwoRequest): Promise<PublishWorkbenchTwoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.publishWorkbenchTwoEx(request, headers, runtime);
  }

  /**
   * Description: 个人工作台测试
   * Summary: 个人工作台测试
   */
  async publishWorkbenchTwoEx(request: PublishWorkbenchTwoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PublishWorkbenchTwoResponse> {
    Util.validateModel(request);
    return $tea.cast<PublishWorkbenchTwoResponse>(await this.doRequest("1.0", "antchain.demosdk.workbench.two.publish", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PublishWorkbenchTwoResponse({}));
  }

  /**
   * Description: 个人工作台二期预发测试
   * Summary: 个人工作台二期预发测试
   */
  async importTwiceThree(request: ImportTwiceThreeRequest): Promise<ImportTwiceThreeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.importTwiceThreeEx(request, headers, runtime);
  }

  /**
   * Description: 个人工作台二期预发测试
   * Summary: 个人工作台二期预发测试
   */
  async importTwiceThreeEx(request: ImportTwiceThreeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ImportTwiceThreeResponse> {
    Util.validateModel(request);
    return $tea.cast<ImportTwiceThreeResponse>(await this.doRequest("1.0", "antchain.demosdk.twice.three.import", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ImportTwiceThreeResponse({}));
  }

  /**
   * Description: 个人工作台测试使用
   * Summary: 个人工作台测试使用
   */
  async publishWorkbenchThree(request: PublishWorkbenchThreeRequest): Promise<PublishWorkbenchThreeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.publishWorkbenchThreeEx(request, headers, runtime);
  }

  /**
   * Description: 个人工作台测试使用
   * Summary: 个人工作台测试使用
   */
  async publishWorkbenchThreeEx(request: PublishWorkbenchThreeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PublishWorkbenchThreeResponse> {
    Util.validateModel(request);
    return $tea.cast<PublishWorkbenchThreeResponse>(await this.doRequest("1.0", "antchain.demosdk.workbench.three.publish", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PublishWorkbenchThreeResponse({}));
  }

  /**
   * Description: 个人工作台测试使用
   * Summary: 个人工作台测试使用
   */
  async publishWorkbenchFour(request: PublishWorkbenchFourRequest): Promise<PublishWorkbenchFourResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.publishWorkbenchFourEx(request, headers, runtime);
  }

  /**
   * Description: 个人工作台测试使用
   * Summary: 个人工作台测试使用
   */
  async publishWorkbenchFourEx(request: PublishWorkbenchFourRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PublishWorkbenchFourResponse> {
    Util.validateModel(request);
    return $tea.cast<PublishWorkbenchFourResponse>(await this.doRequest("1.0", "antchain.demosdk.workbench.four.publish", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PublishWorkbenchFourResponse({}));
  }

}
