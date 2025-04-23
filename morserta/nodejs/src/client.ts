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

export class FeedbackReportDataRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 广告主账号ID
  accountId: string;
  // 报表类型级别
  level: string;
  // 回传数据明细，类型json array
  feedbackData: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      accountId: 'account_id',
      level: 'level',
      feedbackData: 'feedback_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      accountId: 'string',
      level: 'string',
      feedbackData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class FeedbackReportDataResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否成功
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ConvertAdDataRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 广告主id
  accountId: number;
  // ios/android
  deviceOsType?: string;
  // 设备ID（imei或idfa的加密值）
  muid: string;
  // 点击ID
  clickId: string;
  // 点击时间
  clickTime?: number;
  // 曝光时间
  impressionTime?: number;
  // 手机号MD5
  mobileMd5?: string;
  // 区分投放渠道来源weixin\youlianghui\chuanshanjia\douyin
  platform?: string;
  // 事件类型，枚举值如下：
  // submit-提交表单
  // pay-付费
  // renewal-续费
  // m2_renewal-m2续期
  // surrender-退保
  eventCode: string;
  // 转化事件时间
  eventTime: number;
  // 设备oaid
  oaid?: string;
  // oaid_md5
  oaidMd5?: string;
  // caid
  caid?: string;
  // caid_md5
  caidMd5?: string;
  // android_id
  androidId?: string;
  // imei
  imei?: string;
  // imei_md5
  imeiMd5?: string;
  // idfa
  idfa?: string;
  // idfa_md5
  idfaMd5?: string;
  // 首次支付保费(蚂蚁数科定义)，用户首次支付保险的费用。单位元
  firstPayAmount?: number;
  // 升级支付保费(蚂蚁数科定义)，用户支付后进行保险升级的支付费用。单位元
  upgradePayAmount?: number;
  // 续费保费(蚂蚁数科定义)，用户M2进行保险续费的费用。
  upgradeRenewvalAmount?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      accountId: 'account_id',
      deviceOsType: 'device_os_type',
      muid: 'muid',
      clickId: 'click_id',
      clickTime: 'click_time',
      impressionTime: 'impression_time',
      mobileMd5: 'mobile_md5',
      platform: 'platform',
      eventCode: 'event_code',
      eventTime: 'event_time',
      oaid: 'oaid',
      oaidMd5: 'oaid_md5',
      caid: 'caid',
      caidMd5: 'caid_md5',
      androidId: 'android_id',
      imei: 'imei',
      imeiMd5: 'imei_md5',
      idfa: 'idfa',
      idfaMd5: 'idfa_md5',
      firstPayAmount: 'first_pay_amount',
      upgradePayAmount: 'upgrade_pay_amount',
      upgradeRenewvalAmount: 'upgrade_renewval_amount',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      accountId: 'number',
      deviceOsType: 'string',
      muid: 'string',
      clickId: 'string',
      clickTime: 'number',
      impressionTime: 'number',
      mobileMd5: 'string',
      platform: 'string',
      eventCode: 'string',
      eventTime: 'number',
      oaid: 'string',
      oaidMd5: 'string',
      caid: 'string',
      caidMd5: 'string',
      androidId: 'string',
      imei: 'string',
      imeiMd5: 'string',
      idfa: 'string',
      idfaMd5: 'string',
      firstPayAmount: 'number',
      upgradePayAmount: 'number',
      upgradeRenewvalAmount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ConvertAdDataResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 调用是否成功
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ClickAdDataRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 广告主id
  accountId: number;
  // 渠道，支持TENCENT
  channel: string;
  // 点击明细json string
  data: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      accountId: 'account_id',
      channel: 'channel',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      accountId: 'number',
      channel: 'string',
      data: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ClickAdDataResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 调用是否成功
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ReportAdDataRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 广告主账号Id
  accountId: string;
  // 报表级别level
  level: string;
  // 回传数据，json array
  data: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      accountId: 'account_id',
      level: 'level',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      accountId: 'string',
      level: 'string',
      data: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ReportAdDataResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否成功
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
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
          sdk_version: "2.0.7",
          _prod_code: "MORSERTA",
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
   * Description: RTA广告主数据回传
   * Summary: RTA广告主数据回传
   */
  async feedbackReportData(request: FeedbackReportDataRequest): Promise<FeedbackReportDataResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.feedbackReportDataEx(request, headers, runtime);
  }

  /**
   * Description: RTA广告主数据回传
   * Summary: RTA广告主数据回传
   */
  async feedbackReportDataEx(request: FeedbackReportDataRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<FeedbackReportDataResponse> {
    Util.validateModel(request);
    return $tea.cast<FeedbackReportDataResponse>(await this.doRequest("1.0", "antcloud.morserta.report.data.feedback", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new FeedbackReportDataResponse({}));
  }

  /**
   * Description: 转化数据回传接口
   * Summary: 转化数据回传接口
   */
  async convertAdData(request: ConvertAdDataRequest): Promise<ConvertAdDataResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.convertAdDataEx(request, headers, runtime);
  }

  /**
   * Description: 转化数据回传接口
   * Summary: 转化数据回传接口
   */
  async convertAdDataEx(request: ConvertAdDataRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ConvertAdDataResponse> {
    Util.validateModel(request);
    return $tea.cast<ConvertAdDataResponse>(await this.doRequest("1.0", "antcloud.morserta.ad.data.convert", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ConvertAdDataResponse({}));
  }

  /**
   * Description: 点击数据回传接口
   * Summary: 点击数据回传接口
   */
  async clickAdData(request: ClickAdDataRequest): Promise<ClickAdDataResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.clickAdDataEx(request, headers, runtime);
  }

  /**
   * Description: 点击数据回传接口
   * Summary: 点击数据回传接口
   */
  async clickAdDataEx(request: ClickAdDataRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ClickAdDataResponse> {
    Util.validateModel(request);
    return $tea.cast<ClickAdDataResponse>(await this.doRequest("1.0", "antcloud.morserta.ad.data.click", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ClickAdDataResponse({}));
  }

  /**
   * Description: 广告汇总数据
   * Summary: 广告汇总数据
   */
  async reportAdData(request: ReportAdDataRequest): Promise<ReportAdDataResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.reportAdDataEx(request, headers, runtime);
  }

  /**
   * Description: 广告汇总数据
   * Summary: 广告汇总数据
   */
  async reportAdDataEx(request: ReportAdDataRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ReportAdDataResponse> {
    Util.validateModel(request);
    return $tea.cast<ReportAdDataResponse>(await this.doRequest("1.0", "antcloud.morserta.ad.data.report", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ReportAdDataResponse({}));
  }

}
