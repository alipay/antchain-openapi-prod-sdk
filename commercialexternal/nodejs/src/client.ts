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

// 已售规格实例详细信息(用于开发商查询)
export class SoldSpecInstance extends $tea.Model {
  // 规格码
  specCode: string;
  // 规格实例id
  specInstanceId: string;
  // 规格实例运行状态. 
  // STARTED 正常有效、STOPPED 停服、STAETED_IN_ARR 欠费运行中......
  status: string;
  // 实例生效时间
  startTime?: string;
  // 实例计划停服时间
  planStopTime?: string;
  // 实例实际停服时间
  actualStopTime?: string;
  // 购买规格实例的商户id(商业中台用来唯一标识商户的id)
  merchantId: string;
  // 购买数量
  num: number;
  // 商品规格售卖类型：按量付费（POST）、资源包（BAG）、包年包月（PRE）
  specType: string;
  // 资源（包）code
  resCode?: string;
  // 其他上下文信息，kv结构，本先新增，后面有新新增可以放在这里面，不用再升级接口
  context?: string;
  static names(): { [key: string]: string } {
    return {
      specCode: 'spec_code',
      specInstanceId: 'spec_instance_id',
      status: 'status',
      startTime: 'start_time',
      planStopTime: 'plan_stop_time',
      actualStopTime: 'actual_stop_time',
      merchantId: 'merchant_id',
      num: 'num',
      specType: 'spec_type',
      resCode: 'res_code',
      context: 'context',
    };
  }

  static types(): { [key: string]: any } {
    return {
      specCode: 'string',
      specInstanceId: 'string',
      status: 'string',
      startTime: 'string',
      planStopTime: 'string',
      actualStopTime: 'string',
      merchantId: 'string',
      num: 'number',
      specType: 'string',
      resCode: 'string',
      context: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushMeterPeriodicusageRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 计量域编码
  domainCode: string;
  // 规格编码
  specCode: string;
  // 	
  // 资源编码
  resourceCode: string;
  // 规格实例id
  specInstanceId: string;
  // 计量数据，json string格式字符串
  data: string;
  // 计量数据对应的发生周期开始时间yyyyMMddHHmmss格式
  gmtMeterBegin: string;
  // 计量数据对应的发生周期开始时间yyyyMMddHHmmss格式
  gmtMeterEnd: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      domainCode: 'domain_code',
      specCode: 'spec_code',
      resourceCode: 'resource_code',
      specInstanceId: 'spec_instance_id',
      data: 'data',
      gmtMeterBegin: 'gmt_meter_begin',
      gmtMeterEnd: 'gmt_meter_end',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      domainCode: 'string',
      specCode: 'string',
      resourceCode: 'string',
      specInstanceId: 'string',
      data: 'string',
      gmtMeterBegin: 'string',
      gmtMeterEnd: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushMeterPeriodicusageResponse extends $tea.Model {
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

export class PushMeterRealtimeusageRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 请求id，防重用
  requestId: string;
  // 计量域编码
  domainCode: string;
  // 规格编码
  specCode: string;
  // 资源编码
  resourceCode: string;
  // 规格实例id
  specInstanceId: string;
  // 计量数据，json string格式字符串
  data: string;
  // 计量数据发生时间
  gmtMeter: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      requestId: 'request_id',
      domainCode: 'domain_code',
      specCode: 'spec_code',
      resourceCode: 'resource_code',
      specInstanceId: 'spec_instance_id',
      data: 'data',
      gmtMeter: 'gmt_meter',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      requestId: 'string',
      domainCode: 'string',
      specCode: 'string',
      resourceCode: 'string',
      specInstanceId: 'string',
      data: 'string',
      gmtMeter: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushMeterRealtimeusageResponse extends $tea.Model {
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

export class QueryTradecoreMerchantinfoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 商业中台唯一标识商户的id
  merchantId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      merchantId: 'merchant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      merchantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTradecoreMerchantinfoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 商户的名称
  merchantName?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      merchantName: 'merchant_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      merchantName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchqueryTradecoreSoldspecinstanceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 商业中台用来唯一标记商户的id merchant_id 与 merchant_login_main_id至少填一个
  merchantId?: string;
  // 商户(买家)登录主账号user_id， merchant_id 与 merchant_login_main_id至少填一个
  merchantLoginMainId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      merchantId: 'merchant_id',
      merchantLoginMainId: 'merchant_login_main_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      merchantId: 'string',
      merchantLoginMainId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchqueryTradecoreSoldspecinstanceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 某开发商已售给某商户的所有规格实例信息
  soldSpecInstances?: SoldSpecInstance[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      soldSpecInstances: 'sold_spec_instances',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      soldSpecInstances: { 'type': 'array', 'itemType': SoldSpecInstance },
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
          sdk_version: "1.0.7",
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
   * Description: 
  计量数据周期推送
   * Summary:  计量数据周期推送
   */
  async pushMeterPeriodicusage(request: PushMeterPeriodicusageRequest): Promise<PushMeterPeriodicusageResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pushMeterPeriodicusageEx(request, headers, runtime);
  }

  /**
   * Description: 
  计量数据周期推送
   * Summary:  计量数据周期推送
   */
  async pushMeterPeriodicusageEx(request: PushMeterPeriodicusageRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PushMeterPeriodicusageResponse> {
    Util.validateModel(request);
    return $tea.cast<PushMeterPeriodicusageResponse>(await this.doRequest("1.0", "antcloud.commercialexternal.meter.periodicusage.push", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PushMeterPeriodicusageResponse({}));
  }

  /**
   * Description: 实时用量推送，每调用一次推送一次
   * Summary: 实时用量推送，每调用一次推送一次
   */
  async pushMeterRealtimeusage(request: PushMeterRealtimeusageRequest): Promise<PushMeterRealtimeusageResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pushMeterRealtimeusageEx(request, headers, runtime);
  }

  /**
   * Description: 实时用量推送，每调用一次推送一次
   * Summary: 实时用量推送，每调用一次推送一次
   */
  async pushMeterRealtimeusageEx(request: PushMeterRealtimeusageRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PushMeterRealtimeusageResponse> {
    Util.validateModel(request);
    return $tea.cast<PushMeterRealtimeusageResponse>(await this.doRequest("1.0", "antcloud.commercialexternal.meter.realtimeusage.push", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PushMeterRealtimeusageResponse({}));
  }

  /**
   * Description: 根据商户id、开发商id获取存在服务关系的商户信息(开发商用)
   * Summary: 获取商户信息-开发商用
   */
  async queryTradecoreMerchantinfo(request: QueryTradecoreMerchantinfoRequest): Promise<QueryTradecoreMerchantinfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryTradecoreMerchantinfoEx(request, headers, runtime);
  }

  /**
   * Description: 根据商户id、开发商id获取存在服务关系的商户信息(开发商用)
   * Summary: 获取商户信息-开发商用
   */
  async queryTradecoreMerchantinfoEx(request: QueryTradecoreMerchantinfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryTradecoreMerchantinfoResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTradecoreMerchantinfoResponse>(await this.doRequest("1.0", "antcloud.commercialexternal.tradecore.merchantinfo.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryTradecoreMerchantinfoResponse({}));
  }

  /**
   * Description: 根据商户id和开发商id获取已售给某商户的所有规格实例的详细信息(不包含规格名称、描述等)；该接口用于开发商查询
   * Summary: 获取已售给商户的规格实例信息-开发商用
   */
  async batchqueryTradecoreSoldspecinstance(request: BatchqueryTradecoreSoldspecinstanceRequest): Promise<BatchqueryTradecoreSoldspecinstanceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchqueryTradecoreSoldspecinstanceEx(request, headers, runtime);
  }

  /**
   * Description: 根据商户id和开发商id获取已售给某商户的所有规格实例的详细信息(不包含规格名称、描述等)；该接口用于开发商查询
   * Summary: 获取已售给商户的规格实例信息-开发商用
   */
  async batchqueryTradecoreSoldspecinstanceEx(request: BatchqueryTradecoreSoldspecinstanceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchqueryTradecoreSoldspecinstanceResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchqueryTradecoreSoldspecinstanceResponse>(await this.doRequest("1.0", "antcloud.commercialexternal.tradecore.soldspecinstance.batchquery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchqueryTradecoreSoldspecinstanceResponse({}));
  }

}
