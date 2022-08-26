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

export class AuthBlockchainTaxIcmInvoiceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求号，调用方企业保证每次调用唯一，蚂蚁发票平台通过该字段和app_id两个字段做幂等判断
  requestId: string;
  // 查询的企业纳税人识别号
  // 
  nsrsbh: string;
  // 企业名称
  corpName: string;
  // 身份证号
  identityNumber: string;
  // 已认证的法人手机号
  cognizantMobile: string;
  // 已认证的法人姓名
  cognizantName: string;
  // 透传字段
  bizContext?: string;
  // 授权业务类型
  authType: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      requestId: 'request_id',
      nsrsbh: 'nsrsbh',
      corpName: 'corp_name',
      identityNumber: 'identity_number',
      cognizantMobile: 'cognizant_mobile',
      cognizantName: 'cognizant_name',
      bizContext: 'biz_context',
      authType: 'auth_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      requestId: 'string',
      nsrsbh: 'string',
      corpName: 'string',
      identityNumber: 'string',
      cognizantMobile: 'string',
      cognizantName: 'string',
      bizContext: 'string',
      authType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AuthBlockchainTaxIcmInvoiceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 授权是否成功：true：成功 false：失败
  success?: string;
  // 透传字段
  bizContext?: string;
  // 纳税人识别号
  nsrsbh?: string;
  // 过期时间
  expiredTime?: string;
  // 业务请求id
  requestId?: string;
  // 错误码
  errorCode?: string;
  // 错误信息
  errorMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      bizContext: 'biz_context',
      nsrsbh: 'nsrsbh',
      expiredTime: 'expired_time',
      requestId: 'request_id',
      errorCode: 'error_code',
      errorMsg: 'error_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'string',
      bizContext: 'string',
      nsrsbh: 'string',
      expiredTime: 'string',
      requestId: 'string',
      errorCode: 'string',
      errorMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBlockchainTaxIcmInvoiceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // ISV名称，用于标识合作的企业
  appId: string;
  // 授权类型
  // 01:发票归集授权; 02:记账; 03:报销; 11:发票贷授权; （0X发票相关授权，1X金融类授权）
  authType: string;
  //  数据通知地址接口 (当type=02或者03时必填) 用于数据采集完毕后通知该接口如何取发票数据
  // 
  callbackUrl?: string;
  // java long型
  // 起始金额，当type=03（报销查询）时必填
  endAmount?: number;
  // 查询起始时间(当auth_type=02或者03时必填)
  // 当auth_type=02(记账查询)时，查询起始时间和查询截止时间必须在同一个月内，如查询起始日期是6.31，截止日期为7.1，则会提示查询时间不能跨月，最长时间为一个月
  // 最大查询范围为6.1-6.30
  endDate?: string;
  // 非必填，不填则查询所有类型发票
  // "01": "增值税专用发票"
  // "04": "增值税普通发票"
  // "10": "增值税电子普通发票"
  invoiceType?: string;
  // 查询的企业纳税人识别号
  nsrsbh: string;
  // 请求号，调用方企业保证每次调用唯一，蚂蚁发票平台通过该字段和app_id两个字段做幂等判断
  requestId: string;
  // java long型
  // 起始金额，当type=03（报销查询）时必填
  startAmount?: number;
  // 查询起始时间(当auth_type=02或者03时必填)
  // 当auth_type=02(记账查询)时，查询起始时间和查询截止时间必须在同一个月内，如查询起始日期是6.31，截止日期为7.1，则会提示查询时间不能跨月，最长时间为一个月
  // 最大查询范围为6.1-6.30
  startDate?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      appId: 'app_id',
      authType: 'auth_type',
      callbackUrl: 'callback_url',
      endAmount: 'end_amount',
      endDate: 'end_date',
      invoiceType: 'invoice_type',
      nsrsbh: 'nsrsbh',
      requestId: 'request_id',
      startAmount: 'start_amount',
      startDate: 'start_date',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      appId: 'string',
      authType: 'string',
      callbackUrl: 'string',
      endAmount: 'number',
      endDate: 'string',
      invoiceType: 'string',
      nsrsbh: 'string',
      requestId: 'string',
      startAmount: 'number',
      startDate: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBlockchainTaxIcmInvoiceResponse extends $tea.Model {
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
          sdk_version: "1.0.0",
          _prod_code: "ak_faa507f3bcf74109812a97f8296f54ca",
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
   * Description: 区块链银行接口-该接口为支持贷后授权接口，授权结果以同步方式返回
   * Summary: 区块链银行授权接口
   */
  async authBlockchainTaxIcmInvoice(request: AuthBlockchainTaxIcmInvoiceRequest): Promise<AuthBlockchainTaxIcmInvoiceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.authBlockchainTaxIcmInvoiceEx(request, headers, runtime);
  }

  /**
   * Description: 区块链银行接口-该接口为支持贷后授权接口，授权结果以同步方式返回
   * Summary: 区块链银行授权接口
   */
  async authBlockchainTaxIcmInvoiceEx(request: AuthBlockchainTaxIcmInvoiceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AuthBlockchainTaxIcmInvoiceResponse> {
    Util.validateModel(request);
    return $tea.cast<AuthBlockchainTaxIcmInvoiceResponse>(await this.doRequest("1.0", "blockchain.tax.icm.invoice.auth", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AuthBlockchainTaxIcmInvoiceResponse({}));
  }

  /**
   * Description: 区块链发票信息查询接口-该接口为异步查询接口，查询结果通过回调调用方提供的callUrl方式进行通知
   * Summary:  区块链发票信息查询
   */
  async queryBlockchainTaxIcmInvoice(request: QueryBlockchainTaxIcmInvoiceRequest): Promise<QueryBlockchainTaxIcmInvoiceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryBlockchainTaxIcmInvoiceEx(request, headers, runtime);
  }

  /**
   * Description: 区块链发票信息查询接口-该接口为异步查询接口，查询结果通过回调调用方提供的callUrl方式进行通知
   * Summary:  区块链发票信息查询
   */
  async queryBlockchainTaxIcmInvoiceEx(request: QueryBlockchainTaxIcmInvoiceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryBlockchainTaxIcmInvoiceResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBlockchainTaxIcmInvoiceResponse>(await this.doRequest("1.0", "blockchain.tax.icm.invoice.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryBlockchainTaxIcmInvoiceResponse({}));
  }

}
