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

export class AAARequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AAAResponse extends $tea.Model {
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

export class BBBRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BBBResponse extends $tea.Model {
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

export class QueryDebugPassedRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 入参
  param: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      param: 'param',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      param: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDebugPassedResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // OK
  status?: string;
  // success
  msg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      status: 'status',
      msg: 'msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      status: 'string',
      msg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryInternalFailureRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 入参
  param: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      param: 'param',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      param: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryInternalFailureResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // OK
  status?: string;
  // success
  msg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      status: 'status',
      msg: 'msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      status: 'string',
      msg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryExternalFailureRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 入参
  param: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      param: 'param',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      param: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryExternalFailureResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // OK
  status?: string;
  // success
  msg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      status: 'status',
      msg: 'msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      status: 'string',
      msg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class VvvLiuyzTestRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class VvvLiuyzTestResponse extends $tea.Model {
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

export class AaawTestLiuyzRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AaawTestLiuyzResponse extends $tea.Model {
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

export class TestTrPaiRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class TestTrPaiResponse extends $tea.Model {
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
          sdk_version: "2.0.0",
          _prod_code: "TRTESTDEMO",
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
   * Description: a
   * Summary: a
   */
  async aAA(request: AAARequest): Promise<AAAResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.aAAEx(request, headers, runtime);
  }

  /**
   * Description: a
   * Summary: a
   */
  async aAAEx(request: AAARequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AAAResponse> {
    Util.validateModel(request);
    return $tea.cast<AAAResponse>(await this.doRequest("1.0", "antcloud.trtestdemo.a.a.a", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AAAResponse({}));
  }

  /**
   * Description: b
   * Summary: b
   */
  async bBB(request: BBBRequest): Promise<BBBResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.bBBEx(request, headers, runtime);
  }

  /**
   * Description: b
   * Summary: b
   */
  async bBBEx(request: BBBRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BBBResponse> {
    Util.validateModel(request);
    return $tea.cast<BBBResponse>(await this.doRequest("1.0", "antcloud.trtestdemo.b.b.b", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BBBResponse({}));
  }

  /**
   * Description: tr协议测试使用，调用通过
   * Summary: tr协议测试使用，调用通过
   */
  async queryDebugPassed(request: QueryDebugPassedRequest): Promise<QueryDebugPassedResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDebugPassedEx(request, headers, runtime);
  }

  /**
   * Description: tr协议测试使用，调用通过
   * Summary: tr协议测试使用，调用通过
   */
  async queryDebugPassedEx(request: QueryDebugPassedRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDebugPassedResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDebugPassedResponse>(await this.doRequest("1.0", "antcloud.trtestdemo.debug.passed.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDebugPassedResponse({}));
  }

  /**
   * Description: tr协议测试使用，内部接口且调用不通过
   * Summary: tr协议测试使用，内部接口且调用不通过
   */
  async queryInternalFailure(request: QueryInternalFailureRequest): Promise<QueryInternalFailureResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryInternalFailureEx(request, headers, runtime);
  }

  /**
   * Description: tr协议测试使用，内部接口且调用不通过
   * Summary: tr协议测试使用，内部接口且调用不通过
   */
  async queryInternalFailureEx(request: QueryInternalFailureRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryInternalFailureResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryInternalFailureResponse>(await this.doRequest("1.0", "antcloud.trtestdemo.internal.failure.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryInternalFailureResponse({}));
  }

  /**
   * Description: tr协议测试使用，外部接口且调用不通过
   * Summary: tr协议测试使用，外部接口且调用不通过
   */
  async queryExternalFailure(request: QueryExternalFailureRequest): Promise<QueryExternalFailureResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryExternalFailureEx(request, headers, runtime);
  }

  /**
   * Description: tr协议测试使用，外部接口且调用不通过
   * Summary: tr协议测试使用，外部接口且调用不通过
   */
  async queryExternalFailureEx(request: QueryExternalFailureRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryExternalFailureResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryExternalFailureResponse>(await this.doRequest("1.0", "antcloud.trtestdemo.external.failure.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryExternalFailureResponse({}));
  }

  /**
   * Description: test
   * Summary: test
   */
  async vvvLiuyzTest(request: VvvLiuyzTestRequest): Promise<VvvLiuyzTestResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.vvvLiuyzTestEx(request, headers, runtime);
  }

  /**
   * Description: test
   * Summary: test
   */
  async vvvLiuyzTestEx(request: VvvLiuyzTestRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<VvvLiuyzTestResponse> {
    Util.validateModel(request);
    return $tea.cast<VvvLiuyzTestResponse>(await this.doRequest("1.0", "antcloud.trtestdemo.liuyz.test.vvv", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new VvvLiuyzTestResponse({}));
  }

  /**
   * Description: test
   * Summary: test
   */
  async aaawTestLiuyz(request: AaawTestLiuyzRequest): Promise<AaawTestLiuyzResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.aaawTestLiuyzEx(request, headers, runtime);
  }

  /**
   * Description: test
   * Summary: test
   */
  async aaawTestLiuyzEx(request: AaawTestLiuyzRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AaawTestLiuyzResponse> {
    Util.validateModel(request);
    return $tea.cast<AaawTestLiuyzResponse>(await this.doRequest("1.0", "antcloud.trtestdemo.test.liuyz.aaaw", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AaawTestLiuyzResponse({}));
  }

  /**
   * Description: test
   * Summary: test
   */
  async testTrPai(request: TestTrPaiRequest): Promise<TestTrPaiResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.testTrPaiEx(request, headers, runtime);
  }

  /**
   * Description: test
   * Summary: test
   */
  async testTrPaiEx(request: TestTrPaiRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<TestTrPaiResponse> {
    Util.validateModel(request);
    return $tea.cast<TestTrPaiResponse>(await this.doRequest("1.0", "antcloud.trtestdemo.tr.pai.test", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new TestTrPaiResponse({}));
  }

}
