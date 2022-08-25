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

// 大安全接口入参
export class RdsAnalyzeRequest extends $tea.Model {
  // 123
  appid: string;
  // 123
  bizNo?: string;
  // 213
  scene?: string;
  // 123
  token?: string;
  // 123
  data: string;
  // 123
  extra: string;
  static names(): { [key: string]: string } {
    return {
      appid: 'appid',
      bizNo: 'biz_no',
      scene: 'scene',
      token: 'token',
      data: 'data',
      extra: 'extra',
    };
  }

  static types(): { [key: string]: any } {
    return {
      appid: 'string',
      bizNo: 'string',
      scene: 'string',
      token: 'string',
      data: 'string',
      extra: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 大安全内容检测接口返回参数
export class ResultModel extends $tea.Model {
  // 返回结果
  code?: number;
  // 返回错误信息
  errMsg?: string;
  // 返回具体结果
  model?: string;
  static names(): { [key: string]: string } {
    return {
      code: 'code',
      errMsg: 'err_msg',
      model: 'model',
    };
  }

  static types(): { [key: string]: any } {
    return {
      code: 'number',
      errMsg: 'string',
      model: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 大安全接口入参
export class SecurityUniformRequest extends $tea.Model {
  // 123
  token: string;
  // 123
  bizId: string;
  // 132
  params: string;
  static names(): { [key: string]: string } {
    return {
      token: 'token',
      bizId: 'biz_id',
      params: 'params',
    };
  }

  static types(): { [key: string]: any } {
    return {
      token: 'string',
      bizId: 'string',
      params: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 键值对，兼容map用
export class KeyValuePair extends $tea.Model {
  // key
  key: string;
  // value
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

// 大安全接口返回
export class SecurityUniformResponse extends $tea.Model {
  // 是否成功
  success: boolean;
  // 123
  code?: string;
  // 123
  message?: string;
  // 123
  token?: string;
  // 123
  bizId?: string;
  // 123
  data?: string;
  static names(): { [key: string]: string } {
    return {
      success: 'success',
      code: 'code',
      message: 'message',
      token: 'token',
      bizId: 'biz_id',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      success: 'boolean',
      code: 'string',
      message: 'string',
      token: 'string',
      bizId: 'string',
      data: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 大安全人机识别相应
export class RdslibAntcaptchaservice extends $tea.Model {
  // 是否请求成功
  success: boolean;
  // 相应信息
  message?: string;
  // 返回数据
  data?: string;
  static names(): { [key: string]: string } {
    return {
      success: 'success',
      message: 'message',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      success: 'boolean',
      message: 'string',
      data: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RunAntchainSaasMarketServiceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 业务方传入，幂等用。
  bizId: string;
  // saas产品code
  productCode: string;
  // 服务code
  serviceCode: string;
  // 子服务code
  subServiceCode?: string;
  // 服务版本
  serviceVersion: string;
  // 业务参数，map格式
  params?: KeyValuePair[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizId: 'biz_id',
      productCode: 'product_code',
      serviceCode: 'service_code',
      subServiceCode: 'sub_service_code',
      serviceVersion: 'service_version',
      params: 'params',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizId: 'string',
      productCode: 'string',
      serviceCode: 'string',
      subServiceCode: 'string',
      serviceVersion: 'string',
      params: { 'type': 'array', 'itemType': KeyValuePair },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RunAntchainSaasMarketServiceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 服务调用结果
  resultData?: KeyValuePair[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      resultData: 'result_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      resultData: { 'type': 'array', 'itemType': KeyValuePair },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckSaasSecurityInfosecOpencheckservicecheckRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 以json格式输入想要检测的内容
  content: string;
  // 服务版本
  serviceVersion: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      content: 'content',
      serviceVersion: 'service_version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      content: 'string',
      serviceVersion: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckSaasSecurityInfosecOpencheckservicecheckResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 大安全内容检测接口返回参数
  data?: ResultModel;
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
      data: ResultModel,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySaasSecurityInfosecOpencheckservicequeryRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 查询参数
  event: string;
  // 服务版本
  serviceVersion: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      event: 'event',
      serviceVersion: 'service_version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      event: 'string',
      serviceVersion: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySaasSecurityInfosecOpencheckservicequeryResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 大安全内容检测接口返回结果
  data?: ResultModel;
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
      data: ResultModel,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckSaasSecurityRdsRdsserviceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 123
  rdsServiceCheckRequest: string;
  // 服务版本
  serviceVersion: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      rdsServiceCheckRequest: 'rds_service_check_request',
      serviceVersion: 'service_version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      rdsServiceCheckRequest: 'string',
      serviceVersion: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckSaasSecurityRdsRdsserviceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否是机器
  data?: number;
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
      data: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class VerifySaasSecurityRdslibAntcaptchaserviceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 123
  rdsAnalyzeRequest: RdsAnalyzeRequest;
  // 服务版本
  serviceVersion: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      rdsAnalyzeRequest: 'rds_analyze_request',
      serviceVersion: 'service_version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      rdsAnalyzeRequest: RdsAnalyzeRequest,
      serviceVersion: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class VerifySaasSecurityRdslibAntcaptchaserviceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否是机器人
  data?: RdslibAntcaptchaservice;
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
      data: RdslibAntcaptchaservice,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySaasSecuritySecuritycoreSecurityuniformserviceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 123
  securityUniformRequest: SecurityUniformRequest;
  // 123
  serviceVersion: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      securityUniformRequest: 'security_uniform_request',
      serviceVersion: 'service_version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      securityUniformRequest: SecurityUniformRequest,
      serviceVersion: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySaasSecuritySecuritycoreSecurityuniformserviceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回结果
  data?: SecurityUniformResponse;
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
      data: SecurityUniformResponse,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySaasSecurityTscenterUmidqueryserviceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用户token id
  tokenId: string;
  // 服务版本
  serviceVersion: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tokenId: 'token_id',
      serviceVersion: 'service_version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tokenId: 'string',
      serviceVersion: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySaasSecurityTscenterUmidqueryserviceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回的umid
  data?: string;
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
      data: 'string',
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
          sdk_version: "1.0.3",
          _prod_code: "ak_6efc6591476e4813ac8f7c9b6359c0b7",
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
   * Description: SaaS服务调用
   * Summary: SaaS服务调用
   */
  async runAntchainSaasMarketService(request: RunAntchainSaasMarketServiceRequest): Promise<RunAntchainSaasMarketServiceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.runAntchainSaasMarketServiceEx(request, headers, runtime);
  }

  /**
   * Description: SaaS服务调用
   * Summary: SaaS服务调用
   */
  async runAntchainSaasMarketServiceEx(request: RunAntchainSaasMarketServiceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RunAntchainSaasMarketServiceResponse> {
    Util.validateModel(request);
    return $tea.cast<RunAntchainSaasMarketServiceResponse>(await this.doRequest("1.0", "antchain.saas.market.service.run", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RunAntchainSaasMarketServiceResponse({}));
  }

  /**
   * Description: 大安全检验内容安全接口
   * Summary: 大安全检验内容安全接口
   */
  async checkSaasSecurityInfosecOpencheckservicecheck(request: CheckSaasSecurityInfosecOpencheckservicecheckRequest): Promise<CheckSaasSecurityInfosecOpencheckservicecheckResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.checkSaasSecurityInfosecOpencheckservicecheckEx(request, headers, runtime);
  }

  /**
   * Description: 大安全检验内容安全接口
   * Summary: 大安全检验内容安全接口
   */
  async checkSaasSecurityInfosecOpencheckservicecheckEx(request: CheckSaasSecurityInfosecOpencheckservicecheckRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CheckSaasSecurityInfosecOpencheckservicecheckResponse> {
    Util.validateModel(request);
    return $tea.cast<CheckSaasSecurityInfosecOpencheckservicecheckResponse>(await this.doRequest("1.0", "saas.security.infosec.opencheckservicecheck.check", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CheckSaasSecurityInfosecOpencheckservicecheckResponse({}));
  }

  /**
   * Description: 大安全内容检测结果查询接口
   * Summary: 大安全内容检测结果查询接口
   */
  async querySaasSecurityInfosecOpencheckservicequery(request: QuerySaasSecurityInfosecOpencheckservicequeryRequest): Promise<QuerySaasSecurityInfosecOpencheckservicequeryResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.querySaasSecurityInfosecOpencheckservicequeryEx(request, headers, runtime);
  }

  /**
   * Description: 大安全内容检测结果查询接口
   * Summary: 大安全内容检测结果查询接口
   */
  async querySaasSecurityInfosecOpencheckservicequeryEx(request: QuerySaasSecurityInfosecOpencheckservicequeryRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QuerySaasSecurityInfosecOpencheckservicequeryResponse> {
    Util.validateModel(request);
    return $tea.cast<QuerySaasSecurityInfosecOpencheckservicequeryResponse>(await this.doRequest("1.0", "saas.security.infosec.opencheckservicequery.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QuerySaasSecurityInfosecOpencheckservicequeryResponse({}));
  }

  /**
   * Description: 大安全接口
   * Summary: 大安全接口
   */
  async checkSaasSecurityRdsRdsservice(request: CheckSaasSecurityRdsRdsserviceRequest): Promise<CheckSaasSecurityRdsRdsserviceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.checkSaasSecurityRdsRdsserviceEx(request, headers, runtime);
  }

  /**
   * Description: 大安全接口
   * Summary: 大安全接口
   */
  async checkSaasSecurityRdsRdsserviceEx(request: CheckSaasSecurityRdsRdsserviceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CheckSaasSecurityRdsRdsserviceResponse> {
    Util.validateModel(request);
    return $tea.cast<CheckSaasSecurityRdsRdsserviceResponse>(await this.doRequest("1.0", "saas.security.rds.rdsservice.check", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CheckSaasSecurityRdsRdsserviceResponse({}));
  }

  /**
   * Description: 大安全接口
   * Summary: 大安全接口
   */
  async verifySaasSecurityRdslibAntcaptchaservice(request: VerifySaasSecurityRdslibAntcaptchaserviceRequest): Promise<VerifySaasSecurityRdslibAntcaptchaserviceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.verifySaasSecurityRdslibAntcaptchaserviceEx(request, headers, runtime);
  }

  /**
   * Description: 大安全接口
   * Summary: 大安全接口
   */
  async verifySaasSecurityRdslibAntcaptchaserviceEx(request: VerifySaasSecurityRdslibAntcaptchaserviceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<VerifySaasSecurityRdslibAntcaptchaserviceResponse> {
    Util.validateModel(request);
    return $tea.cast<VerifySaasSecurityRdslibAntcaptchaserviceResponse>(await this.doRequest("1.0", "saas.security.rdslib.antcaptchaservice.verify", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new VerifySaasSecurityRdslibAntcaptchaserviceResponse({}));
  }

  /**
   * Description: 大安全接口
   * Summary: 大安全接口
   */
  async querySaasSecuritySecuritycoreSecurityuniformservice(request: QuerySaasSecuritySecuritycoreSecurityuniformserviceRequest): Promise<QuerySaasSecuritySecuritycoreSecurityuniformserviceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.querySaasSecuritySecuritycoreSecurityuniformserviceEx(request, headers, runtime);
  }

  /**
   * Description: 大安全接口
   * Summary: 大安全接口
   */
  async querySaasSecuritySecuritycoreSecurityuniformserviceEx(request: QuerySaasSecuritySecuritycoreSecurityuniformserviceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QuerySaasSecuritySecuritycoreSecurityuniformserviceResponse> {
    Util.validateModel(request);
    return $tea.cast<QuerySaasSecuritySecuritycoreSecurityuniformserviceResponse>(await this.doRequest("1.0", "saas.security.securitycore.securityuniformservice.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QuerySaasSecuritySecuritycoreSecurityuniformserviceResponse({}));
  }

  /**
   * Description: 大安全接口
   * Summary: 大安全接口
   */
  async querySaasSecurityTscenterUmidqueryservice(request: QuerySaasSecurityTscenterUmidqueryserviceRequest): Promise<QuerySaasSecurityTscenterUmidqueryserviceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.querySaasSecurityTscenterUmidqueryserviceEx(request, headers, runtime);
  }

  /**
   * Description: 大安全接口
   * Summary: 大安全接口
   */
  async querySaasSecurityTscenterUmidqueryserviceEx(request: QuerySaasSecurityTscenterUmidqueryserviceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QuerySaasSecurityTscenterUmidqueryserviceResponse> {
    Util.validateModel(request);
    return $tea.cast<QuerySaasSecurityTscenterUmidqueryserviceResponse>(await this.doRequest("1.0", "saas.security.tscenter.umidqueryservice.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QuerySaasSecurityTscenterUmidqueryserviceResponse({}));
  }

}
