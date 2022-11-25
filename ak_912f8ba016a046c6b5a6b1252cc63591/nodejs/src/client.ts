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

// 客户认证结果
export class CustomerAuthResult extends $tea.Model {
  // 账户ID
  accId?: string;
  // 返回code 0:核验成功 1:企业信息有误 2:企业非正常营业
  code: string;
  // 客户ID
  customerId?: string;
  // 客户did
  did?: string;
  // 验证状态
  enterpriseStatus?: string;
  // 开业时间
  openTime: string;
  // 认证结果，是否通过
  pass: boolean;
  // 业务ID
  disReqMsgId?: string;
  static names(): { [key: string]: string } {
    return {
      accId: 'acc_id',
      code: 'code',
      customerId: 'customer_id',
      did: 'did',
      enterpriseStatus: 'enterprise_status',
      openTime: 'open_time',
      pass: 'pass',
      disReqMsgId: 'dis_req_msg_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      accId: 'string',
      code: 'string',
      customerId: 'string',
      did: 'string',
      enterpriseStatus: 'string',
      openTime: 'string',
      pass: 'boolean',
      disReqMsgId: 'string',
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

export class StatusDemoGatewayCheckRequest extends $tea.Model {
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

export class StatusDemoGatewayCheckResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // OK
  status?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AuthAntchainBbpCustomerRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 预留业务code
  bizCode?: string;
  // 企业名称
  epCertName: string;
  // 企业证件号码
  epCertNo: string;
  // 企业证件号码类型，枚举值参考：com.alipay.fc.common.lang.enums.CertTypeEnum
  epCertNoType: string;
  // 法人姓名
  legalPersonCertName?: string;
  // 法人证件号码
  legalPersonCertNo?: string;
  // 法人证件号码类型，枚举值参考：com.alipay.fc.common.lang.enums.CertTypeEnum	
  // 
  legalPersonCertNoType?: string;
  // 系统名称
  ownerName?: string;
  // 系统租户ID
  ownerUid?: string;
  // 业务唯一ID
  bizId: string;
  // 业务渠道，需提前申请产品码
  channel: string;
  // 认证类型：ENTERPRISE-企业, PERSON-个人
  certifyEnum: string;
  // 客户支付宝ID，如有则填。
  alipayUid?: string;
  // 个人姓名，用于个人认证
  personName?: string;
  // 个人证件号码
  personCertNo?: string;
  // 个人证件类型，枚举值参考：com.alipay.fc.common.lang.enums.CertTypeEnum
  personCertType?: string;
  // 扩展信息
  extensionInfo?: NameValuePair[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizCode: 'biz_code',
      epCertName: 'ep_cert_name',
      epCertNo: 'ep_cert_no',
      epCertNoType: 'ep_cert_no_type',
      legalPersonCertName: 'legal_person_cert_name',
      legalPersonCertNo: 'legal_person_cert_no',
      legalPersonCertNoType: 'legal_person_cert_no_type',
      ownerName: 'owner_name',
      ownerUid: 'owner_uid',
      bizId: 'biz_id',
      channel: 'channel',
      certifyEnum: 'certify_enum',
      alipayUid: 'alipay_uid',
      personName: 'person_name',
      personCertNo: 'person_cert_no',
      personCertType: 'person_cert_type',
      extensionInfo: 'extension_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizCode: 'string',
      epCertName: 'string',
      epCertNo: 'string',
      epCertNoType: 'string',
      legalPersonCertName: 'string',
      legalPersonCertNo: 'string',
      legalPersonCertNoType: 'string',
      ownerName: 'string',
      ownerUid: 'string',
      bizId: 'string',
      channel: 'string',
      certifyEnum: 'string',
      alipayUid: 'string',
      personName: 'string',
      personCertNo: 'string',
      personCertType: 'string',
      extensionInfo: { 'type': 'array', 'itemType': NameValuePair },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AuthAntchainBbpCustomerResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 客户认证结果
  result?: CustomerAuthResult;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      result: 'result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      result: CustomerAuthResult,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntchainBbpGwtestRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时时间 毫秒
  timeout?: number;
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
      timeout: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntchainBbpGwtestResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 结果码
  stauts?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      stauts: 'stauts',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      stauts: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDemoSaasTestTestaRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 张三
  name: string;
  // 12
  age: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      name: 'name',
      age: 'age',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      name: 'string',
      age: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDemoSaasTestTestaResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 男
  sex?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      sex: 'sex',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      sex: 'string',
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
          sdk_version: "1.0.2",
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
   * Description: Demo接口，返回当前服务器当前状态1
   * Summary: 检查服务状态
   */
  async statusDemoGatewayCheck(request: StatusDemoGatewayCheckRequest): Promise<StatusDemoGatewayCheckResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.statusDemoGatewayCheckEx(request, headers, runtime);
  }

  /**
   * Description: Demo接口，返回当前服务器当前状态1
   * Summary: 检查服务状态
   */
  async statusDemoGatewayCheckEx(request: StatusDemoGatewayCheckRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<StatusDemoGatewayCheckResponse> {
    Util.validateModel(request);
    return $tea.cast<StatusDemoGatewayCheckResponse>(await this.doRequest("1.0", "demo.gateway.check.status", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new StatusDemoGatewayCheckResponse({}));
  }

  /**
   * Description: 对企业/个人进行身份认证
   * Summary: 统一客户认证接口
   */
  async authAntchainBbpCustomer(request: AuthAntchainBbpCustomerRequest): Promise<AuthAntchainBbpCustomerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.authAntchainBbpCustomerEx(request, headers, runtime);
  }

  /**
   * Description: 对企业/个人进行身份认证
   * Summary: 统一客户认证接口
   */
  async authAntchainBbpCustomerEx(request: AuthAntchainBbpCustomerRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AuthAntchainBbpCustomerResponse> {
    Util.validateModel(request);
    return $tea.cast<AuthAntchainBbpCustomerResponse>(await this.doRequest("1.0", "antchain.bbp.customer.auth", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AuthAntchainBbpCustomerResponse({}));
  }

  /**
   * Description: 网关测试
   * Summary: 网关测试
   */
  async queryAntchainBbpGwtest(request: QueryAntchainBbpGwtestRequest): Promise<QueryAntchainBbpGwtestResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAntchainBbpGwtestEx(request, headers, runtime);
  }

  /**
   * Description: 网关测试
   * Summary: 网关测试
   */
  async queryAntchainBbpGwtestEx(request: QueryAntchainBbpGwtestRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAntchainBbpGwtestResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAntchainBbpGwtestResponse>(await this.doRequest("1.0", "antchain.bbp.gwtest.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAntchainBbpGwtestResponse({}));
  }

  /**
   * Description: testa
   * Summary: 测试用api
   */
  async queryDemoSaasTestTesta(request: QueryDemoSaasTestTestaRequest): Promise<QueryDemoSaasTestTestaResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDemoSaasTestTestaEx(request, headers, runtime);
  }

  /**
   * Description: testa
   * Summary: 测试用api
   */
  async queryDemoSaasTestTestaEx(request: QueryDemoSaasTestTestaRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDemoSaasTestTestaResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDemoSaasTestTestaResponse>(await this.doRequest("1.0", "demo.saas.test.testa.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDemoSaasTestTestaResponse({}));
  }

}
