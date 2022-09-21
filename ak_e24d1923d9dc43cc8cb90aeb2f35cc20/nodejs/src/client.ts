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

// 键值对，兼容map用
export class NameValuePair extends $tea.Model {
  // 键名
  name: string;
  // 键值
  value: string;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      value: 'value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      value: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// Map<String,Object> 集合
export class QueryMap extends $tea.Model {
  // 键值
  name: string;
  // 额外用户信息
  value?: NameValuePair[];
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      value: 'value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      value: { 'type': 'array', 'itemType': NameValuePair },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BindDemoAaaBbbCccRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 123
  data: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      data: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BindDemoAaaBbbCccResponse extends $tea.Model {
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

export class QueryDemoAaaBbbCccRequest extends $tea.Model {
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

export class QueryDemoAaaBbbCccResponse extends $tea.Model {
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

export class QueryDemoAdAsdAsdRequest extends $tea.Model {
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

export class QueryDemoAdAsdAsdResponse extends $tea.Model {
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

export class InitDemoBbpInsuranceUserRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 保司编码
  businessCode: string;
  // 第三方id，此处为天猫uid
  thirdPartId: string;
  // 来源渠道
  channel: string;
  // 埋点信息
  burieds?: QueryMap;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      businessCode: 'business_code',
      thirdPartId: 'third_part_id',
      channel: 'channel',
      burieds: 'burieds',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      businessCode: 'string',
      thirdPartId: 'string',
      channel: 'string',
      burieds: QueryMap,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class InitDemoBbpInsuranceUserResponse extends $tea.Model {
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

export class QueryDemoGatewayMyRequest extends $tea.Model {
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

export class QueryDemoGatewayMyResponse extends $tea.Model {
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

export class QueryDemoGongxiangTestDemoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 验证字符
  character1: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      character1: 'character1',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      character1: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDemoGongxiangTestDemoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // aaaaaa
  character1?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      character1: 'character1',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      character1: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RegisterDemoTestBizeventMessageRequest extends $tea.Model {
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

export class RegisterDemoTestBizeventMessageResponse extends $tea.Model {
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

export class QueryDemoTestTestRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  //  
  acpmpcore: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      acpmpcore: 'acpmpcore',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      acpmpcore: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDemoTestTestResponse extends $tea.Model {
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

export class BindDemoTestTestTestRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // test
  test: string;
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

export class BindDemoTestTestTestResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // test
  test?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      test: 'test',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      test: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDemoTestTestobjectBbbRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 测试入参
  requestParam1: string;
  // 测试入参2
  requestParam2: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      requestParam1: 'request_param1',
      requestParam2: 'request_param2',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      requestParam1: 'string',
      requestParam2: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDemoTestTestobjectBbbResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 测试返回参数
  response?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      response: 'response',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      response: 'string',
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
          sdk_version: "1.0.1",
          _prod_code: "ak_e24d1923d9dc43cc8cb90aeb2f35cc20",
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
   * Description: 自动化测试创建，用于测试新建&修改功能
   * Summary: 自动化测试创建，用于测试新建&修改功能
   */
  async bindDemoAaaBbbCcc(request: BindDemoAaaBbbCccRequest): Promise<BindDemoAaaBbbCccResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.bindDemoAaaBbbCccEx(request, headers, runtime);
  }

  /**
   * Description: 自动化测试创建，用于测试新建&修改功能
   * Summary: 自动化测试创建，用于测试新建&修改功能
   */
  async bindDemoAaaBbbCccEx(request: BindDemoAaaBbbCccRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BindDemoAaaBbbCccResponse> {
    Util.validateModel(request);
    return $tea.cast<BindDemoAaaBbbCccResponse>(await this.doRequest("1.0", "demo.aaa.bbb.ccc.bind", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BindDemoAaaBbbCccResponse({}));
  }

  /**
   * Description: 自动化测试创建1
   * Summary: 自动化测试创建（勿动）
   */
  async queryDemoAaaBbbCcc(request: QueryDemoAaaBbbCccRequest): Promise<QueryDemoAaaBbbCccResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDemoAaaBbbCccEx(request, headers, runtime);
  }

  /**
   * Description: 自动化测试创建1
   * Summary: 自动化测试创建（勿动）
   */
  async queryDemoAaaBbbCccEx(request: QueryDemoAaaBbbCccRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDemoAaaBbbCccResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDemoAaaBbbCccResponse>(await this.doRequest("1.0", "demo.aaa.bbb.ccc.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDemoAaaBbbCccResponse({}));
  }

  /**
   * Description: asd
   * Summary: asd
   */
  async queryDemoAdAsdAsd(request: QueryDemoAdAsdAsdRequest): Promise<QueryDemoAdAsdAsdResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDemoAdAsdAsdEx(request, headers, runtime);
  }

  /**
   * Description: asd
   * Summary: asd
   */
  async queryDemoAdAsdAsdEx(request: QueryDemoAdAsdAsdRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDemoAdAsdAsdResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDemoAdAsdAsdResponse>(await this.doRequest("1.0", "demo.ad.asd.asd.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDemoAdAsdAsdResponse({}));
  }

  /**
   * Description: 保司用户埋点信息
   * Summary: 用户登陆页面埋点
   */
  async initDemoBbpInsuranceUser(request: InitDemoBbpInsuranceUserRequest): Promise<InitDemoBbpInsuranceUserResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.initDemoBbpInsuranceUserEx(request, headers, runtime);
  }

  /**
   * Description: 保司用户埋点信息
   * Summary: 用户登陆页面埋点
   */
  async initDemoBbpInsuranceUserEx(request: InitDemoBbpInsuranceUserRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<InitDemoBbpInsuranceUserResponse> {
    Util.validateModel(request);
    return $tea.cast<InitDemoBbpInsuranceUserResponse>(await this.doRequest("1.0", "demo.bbp.insurance.user.init", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new InitDemoBbpInsuranceUserResponse({}));
  }

  /**
   * Description: aaa
   * Summary: 测试demo
   */
  async queryDemoGatewayMy(request: QueryDemoGatewayMyRequest): Promise<QueryDemoGatewayMyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDemoGatewayMyEx(request, headers, runtime);
  }

  /**
   * Description: aaa
   * Summary: 测试demo
   */
  async queryDemoGatewayMyEx(request: QueryDemoGatewayMyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDemoGatewayMyResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDemoGatewayMyResponse>(await this.doRequest("1.0", "demo.gateway.my.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDemoGatewayMyResponse({}));
  }

  /**
   * Description: 共享能力中心六期回归验证创建使用
   * Summary: 共享能力中心六期回归验证创建
   */
  async queryDemoGongxiangTestDemo(request: QueryDemoGongxiangTestDemoRequest): Promise<QueryDemoGongxiangTestDemoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDemoGongxiangTestDemoEx(request, headers, runtime);
  }

  /**
   * Description: 共享能力中心六期回归验证创建使用
   * Summary: 共享能力中心六期回归验证创建
   */
  async queryDemoGongxiangTestDemoEx(request: QueryDemoGongxiangTestDemoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDemoGongxiangTestDemoResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDemoGongxiangTestDemoResponse>(await this.doRequest("1.0", "demo.gongxiang.test.demo.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDemoGongxiangTestDemoResponse({}));
  }

  /**
   * Description: 随机测试
   * Summary: 消息发送及消费
   */
  async registerDemoTestBizeventMessage(request: RegisterDemoTestBizeventMessageRequest): Promise<RegisterDemoTestBizeventMessageResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.registerDemoTestBizeventMessageEx(request, headers, runtime);
  }

  /**
   * Description: 随机测试
   * Summary: 消息发送及消费
   */
  async registerDemoTestBizeventMessageEx(request: RegisterDemoTestBizeventMessageRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RegisterDemoTestBizeventMessageResponse> {
    Util.validateModel(request);
    return $tea.cast<RegisterDemoTestBizeventMessageResponse>(await this.doRequest("1.0", "demo.test.bizevent.message.register", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RegisterDemoTestBizeventMessageResponse({}));
  }

  /**
   * Description: 的
   * Summary: 下载地址创建
   */
  async queryDemoTestTest(request: QueryDemoTestTestRequest): Promise<QueryDemoTestTestResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDemoTestTestEx(request, headers, runtime);
  }

  /**
   * Description: 的
   * Summary: 下载地址创建
   */
  async queryDemoTestTestEx(request: QueryDemoTestTestRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDemoTestTestResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDemoTestTestResponse>(await this.doRequest("1.0", "demo.test.test.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDemoTestTestResponse({}));
  }

  /**
   * Description: testaaa
   * Summary: test
   */
  async bindDemoTestTestTest(request: BindDemoTestTestTestRequest): Promise<BindDemoTestTestTestResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.bindDemoTestTestTestEx(request, headers, runtime);
  }

  /**
   * Description: testaaa
   * Summary: test
   */
  async bindDemoTestTestTestEx(request: BindDemoTestTestTestRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BindDemoTestTestTestResponse> {
    Util.validateModel(request);
    return $tea.cast<BindDemoTestTestTestResponse>(await this.doRequest("1.0", "demo.test.test.test.bind", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BindDemoTestTestTestResponse({}));
  }

  /**
   * Description: 测试添加api
   * Summary: 测试用api
   */
  async queryDemoTestTestobjectBbb(request: QueryDemoTestTestobjectBbbRequest): Promise<QueryDemoTestTestobjectBbbResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDemoTestTestobjectBbbEx(request, headers, runtime);
  }

  /**
   * Description: 测试添加api
   * Summary: 测试用api
   */
  async queryDemoTestTestobjectBbbEx(request: QueryDemoTestTestobjectBbbRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDemoTestTestobjectBbbResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDemoTestTestobjectBbbResponse>(await this.doRequest("1.0", "demo.test.testobject.bbb.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDemoTestTestobjectBbbResponse({}));
  }

}
