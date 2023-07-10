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

// result.resultData
export class DeviceRiskReportResultData extends $tea.Model {
  // webrtc_url
  webrtcUrl: string;
  // a_dynamic_swi
  aDynamicSwi: string;
  // dynamic_interval
  dynamicInterval: string;
  // color
  color: string;
  // os
  os: string;
  // dynamic_cmd
  dynamicCmd: string;
  // time_interval
  timeInterval: string;
  // dynamic_trace
  dynamicTrace: string;
  // dynamic_num
  dynamicNum: string;
  // result_type
  resultType: string;
  static names(): { [key: string]: string } {
    return {
      webrtcUrl: 'webrtc_url',
      aDynamicSwi: 'a_dynamic_swi',
      dynamicInterval: 'dynamic_interval',
      color: 'color',
      os: 'os',
      dynamicCmd: 'dynamic_cmd',
      timeInterval: 'time_interval',
      dynamicTrace: 'dynamic_trace',
      dynamicNum: 'dynamic_num',
      resultType: 'result_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      webrtcUrl: 'string',
      aDynamicSwi: 'string',
      dynamicInterval: 'string',
      color: 'string',
      os: 'string',
      dynamicCmd: 'string',
      timeInterval: 'string',
      dynamicTrace: 'string',
      dynamicNum: 'string',
      resultType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 设备风险查询data
export class DeviceRiskResp extends $tea.Model {
  // apdid
  apdid: string;
  // apdid
  apdidToken: string;
  // riskLevel
  riskLevel: number;
  // risk_desc
  riskDesc: string;
  // sug_action
  sugAction: string;
  // risk_labels
  riskLabels: string[];
  static names(): { [key: string]: string } {
    return {
      apdid: 'apdid',
      apdidToken: 'apdid_token',
      riskLevel: 'risk_level',
      riskDesc: 'risk_desc',
      sugAction: 'sug_action',
      riskLabels: 'risk_labels',
    };
  }

  static types(): { [key: string]: any } {
    return {
      apdid: 'string',
      apdidToken: 'string',
      riskLevel: 'number',
      riskDesc: 'string',
      sugAction: 'string',
      riskLabels: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryHksecuritytechGatewayDeviceriskFingerRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // apdid_token
  apdidToken: string;
  // client_id
  clientId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      apdidToken: 'apdid_token',
      clientId: 'client_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      apdidToken: 'string',
      clientId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryHksecuritytechGatewayDeviceriskFingerResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // code
  code?: number;
  // message
  message?: string;
  // request_id
  requestId?: string;
  // success
  success?: boolean;
  // data
  data?: DeviceRiskResp;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      message: 'message',
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
      code: 'number',
      message: 'string',
      requestId: 'string',
      success: 'boolean',
      data: DeviceRiskResp,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryHksecuritytechGatewayDeviceriskDeviceriskRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // apdid_token
  apdidToken: string;
  // client_id
  clientId?: string;
  // app_id
  appId?: string;
  // env_id
  envId?: string;
  // tenant_id
  tenantId?: string;
  // merchant_id
  merchantId?: string;
  // app_name
  appName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      apdidToken: 'apdid_token',
      clientId: 'client_id',
      appId: 'app_id',
      envId: 'env_id',
      tenantId: 'tenant_id',
      merchantId: 'merchant_id',
      appName: 'app_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      apdidToken: 'string',
      clientId: 'string',
      appId: 'string',
      envId: 'string',
      tenantId: 'string',
      merchantId: 'string',
      appName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryHksecuritytechGatewayDeviceriskDeviceriskResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // code
  code?: number;
  // message
  message?: string;
  // request_id
  requestId?: string;
  // success
  success?: boolean;
  // data
  data?: DeviceRiskResp;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      message: 'message',
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
      code: 'number',
      message: 'string',
      requestId: 'string',
      success: 'boolean',
      data: DeviceRiskResp,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SubmitHksecuritytechGatewayDeviceriskReportRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // request_data
  requestData: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      requestData: 'request_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      requestData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SubmitHksecuritytechGatewayDeviceriskReportResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // success
  success?: boolean;
  // apdid
  apdid?: string;
  // token
  token?: string;
  // current_time
  currentTime?: string;
  // version
  version?: string;
  // vkey_switch
  vkeySwitch?: string;
  // bug_track_switch
  bugTrackSwitch?: string;
  // app_list_ver
  appListVer?: string;
  // dynamic_key
  dynamicKey?: string;
  // result_data
  resultData?: DeviceRiskReportResultData;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      apdid: 'apdid',
      token: 'token',
      currentTime: 'current_time',
      version: 'version',
      vkeySwitch: 'vkey_switch',
      bugTrackSwitch: 'bug_track_switch',
      appListVer: 'app_list_ver',
      dynamicKey: 'dynamic_key',
      resultData: 'result_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
      apdid: 'string',
      token: 'string',
      currentTime: 'string',
      version: 'string',
      vkeySwitch: 'string',
      bugTrackSwitch: 'string',
      appListVer: 'string',
      dynamicKey: 'string',
      resultData: DeviceRiskReportResultData,
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
          sdk_version: "1.0.4",
          _prod_code: "ak_8146025f0aa2474a88d81f508253e029",
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
   * Description: 设备风险查询
   * Summary: 设备风险查询
   */
  async queryHksecuritytechGatewayDeviceriskFinger(request: QueryHksecuritytechGatewayDeviceriskFingerRequest): Promise<QueryHksecuritytechGatewayDeviceriskFingerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryHksecuritytechGatewayDeviceriskFingerEx(request, headers, runtime);
  }

  /**
   * Description: 设备风险查询
   * Summary: 设备风险查询
   */
  async queryHksecuritytechGatewayDeviceriskFingerEx(request: QueryHksecuritytechGatewayDeviceriskFingerRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryHksecuritytechGatewayDeviceriskFingerResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryHksecuritytechGatewayDeviceriskFingerResponse>(await this.doRequest("1.0", "hksecuritytech.gateway.devicerisk.finger.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryHksecuritytechGatewayDeviceriskFingerResponse({}));
  }

  /**
   * Description: 终端安全-设备风险查询
   * Summary: 设备风险查询
   */
  async queryHksecuritytechGatewayDeviceriskDevicerisk(request: QueryHksecuritytechGatewayDeviceriskDeviceriskRequest): Promise<QueryHksecuritytechGatewayDeviceriskDeviceriskResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryHksecuritytechGatewayDeviceriskDeviceriskEx(request, headers, runtime);
  }

  /**
   * Description: 终端安全-设备风险查询
   * Summary: 设备风险查询
   */
  async queryHksecuritytechGatewayDeviceriskDeviceriskEx(request: QueryHksecuritytechGatewayDeviceriskDeviceriskRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryHksecuritytechGatewayDeviceriskDeviceriskResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryHksecuritytechGatewayDeviceriskDeviceriskResponse>(await this.doRequest("1.0", "hksecuritytech.gateway.devicerisk.devicerisk.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryHksecuritytechGatewayDeviceriskDeviceriskResponse({}));
  }

  /**
   * Description: 终端安全 设备信息上报
   * Summary: 设备信息上报
   */
  async submitHksecuritytechGatewayDeviceriskReport(request: SubmitHksecuritytechGatewayDeviceriskReportRequest): Promise<SubmitHksecuritytechGatewayDeviceriskReportResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.submitHksecuritytechGatewayDeviceriskReportEx(request, headers, runtime);
  }

  /**
   * Description: 终端安全 设备信息上报
   * Summary: 设备信息上报
   */
  async submitHksecuritytechGatewayDeviceriskReportEx(request: SubmitHksecuritytechGatewayDeviceriskReportRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SubmitHksecuritytechGatewayDeviceriskReportResponse> {
    Util.validateModel(request);
    return $tea.cast<SubmitHksecuritytechGatewayDeviceriskReportResponse>(await this.doRequest("1.0", "hksecuritytech.gateway.devicerisk.report.submit", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SubmitHksecuritytechGatewayDeviceriskReportResponse({}));
  }

}
