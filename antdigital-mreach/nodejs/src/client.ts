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

// 短信发送详情
export class SmsSendDetail extends $tea.Model {
  // 错误码
  errCode: string;
  // 接受日期
  receiveDate: string;
  // 发送日期
  sendDate: string;
  // 接收短信的手机号码
  phoneNumber: string;
  // 短信内容
  content: string;
  // 模板id
  templateId: string;
  // 短信发送状态：1-等待回执，2-发送失败，3-发送成功。
  status: number;
  static names(): { [key: string]: string } {
    return {
      errCode: 'err_code',
      receiveDate: 'receive_date',
      sendDate: 'send_date',
      phoneNumber: 'phone_number',
      content: 'content',
      templateId: 'template_id',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      errCode: 'string',
      receiveDate: 'string',
      sendDate: 'string',
      phoneNumber: 'string',
      content: 'string',
      templateId: 'string',
      status: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 卡片短信查询结果
export class CradSmsSendDetail extends $tea.Model {
  // 消息ID
  messageId: string;
  // 接收手机号
  phoneNumber: string;
  // 卡片短信模板ID
  templateId: string;
  // 最终接收类型: CARD_SMS-卡片短信送达, SMS-回落为普通短信送达。
  finalReceiveType: string;
  // 短信发送状态。1-等待回执，2-发送失败，3-发送成功。
  status: number;
  // 错误码（发送失败时返回）
  errorCode: string;
  // 错误描述（发送失败时返回）
  errorMessage: string;
  // 回执时间,yyyy-MM-dd HH:mm:ss格式
  reportTime: string;
  // 回落短信正文（仅 finalReceiveType=SMS 时有值）
  content?: string;
  static names(): { [key: string]: string } {
    return {
      messageId: 'message_id',
      phoneNumber: 'phone_number',
      templateId: 'template_id',
      finalReceiveType: 'final_receive_type',
      status: 'status',
      errorCode: 'error_code',
      errorMessage: 'error_message',
      reportTime: 'report_time',
      content: 'content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      messageId: 'string',
      phoneNumber: 'string',
      templateId: 'string',
      finalReceiveType: 'string',
      status: 'number',
      errorCode: 'string',
      errorMessage: 'string',
      reportTime: 'string',
      content: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushSmsDomesticRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 业务流水号，最长64字符
  bizId: string;
  // 接收手机号列表
  phoneNumbers: string[];
  // 模板ID
  templateId: string;
  // 短信签名
  signName: string;
  // 模板参数
  templateParams?: string;
  // 扩展参数
  extraParams?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizId: 'biz_id',
      phoneNumbers: 'phone_numbers',
      templateId: 'template_id',
      signName: 'sign_name',
      templateParams: 'template_params',
      extraParams: 'extra_params',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizId: 'string',
      phoneNumbers: { 'type': 'array', 'itemType': 'string' },
      templateId: 'string',
      signName: 'string',
      templateParams: 'string',
      extraParams: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushSmsDomesticResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 消息id
  messageId?: string;
  // 短信发送状态。1-等待回执，2-发送失败，3-发送成功。
  status?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      messageId: 'message_id',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      messageId: 'string',
      status: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySmsDomesticRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 消息id
  messageId: string;
  // 接收短信的手机号码
  phoneNumber?: string;
  // 短信发送日期，支持查询最近 30 天的记录。格式：yyyyMMdd。
  sendDate: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      messageId: 'message_id',
      phoneNumber: 'phone_number',
      sendDate: 'send_date',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      messageId: 'string',
      phoneNumber: 'string',
      sendDate: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySmsDomesticResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 短信发送详情
  sendDatals?: SmsSendDetail[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      sendDatals: 'send_datals',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      sendDatals: { 'type': 'array', 'itemType': SmsSendDetail },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushCardsmsDomesticRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 业务流水号，最长64字符
  bizId: string;
  // 接收手机号列表
  phoneNumbers: string[];
  // 卡片短信模版ID
  templateId: string;
  // 卡片短信签名
  signName: string;
  // 卡片动参
  cardParams?: string;
  // 回落类型: SMS-回落为普通短信, NONE-不回落。
  fallbackType?: string;
  // 回落普通短信的平台模板编码。
  fallbackTemplateId?: string;
  // 回落普通短信的模板参数，键值对形式Str
  fallbackParams?: string;
  // 卡片短信渲染失败后跳转链接
  customUrl?: string;
  // 扩展参数
  extraParams?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizId: 'biz_id',
      phoneNumbers: 'phone_numbers',
      templateId: 'template_id',
      signName: 'sign_name',
      cardParams: 'card_params',
      fallbackType: 'fallback_type',
      fallbackTemplateId: 'fallback_template_id',
      fallbackParams: 'fallback_params',
      customUrl: 'custom_url',
      extraParams: 'extra_params',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizId: 'string',
      phoneNumbers: { 'type': 'array', 'itemType': 'string' },
      templateId: 'string',
      signName: 'string',
      cardParams: 'string',
      fallbackType: 'string',
      fallbackTemplateId: 'string',
      fallbackParams: 'string',
      customUrl: 'string',
      extraParams: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushCardsmsDomesticResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 卡片消息ID
  messageId?: string;
  // 短信发送状态。1-等待回执，2-发送失败，3-发送成功。
  status?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      messageId: 'message_id',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      messageId: 'string',
      status: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCardsmsDomesticRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 消息ID
  messageId: string;
  // 接收短信的手机号码
  phoneNumber: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      messageId: 'message_id',
      phoneNumber: 'phone_number',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      messageId: 'string',
      phoneNumber: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCardsmsDomesticResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 短信发送详情
  sendDatals?: CradSmsSendDetail[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      sendDatals: 'send_datals',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      sendDatals: { 'type': 'array', 'itemType': CradSmsSendDetail },
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
          sdk_version: "1.1.1",
          _prod_code: "MREACH",
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
   * Description: 短信发送API
   * Summary: 短信发送API
   */
  async pushSmsDomestic(request: PushSmsDomesticRequest): Promise<PushSmsDomesticResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pushSmsDomesticEx(request, headers, runtime);
  }

  /**
   * Description: 短信发送API
   * Summary: 短信发送API
   */
  async pushSmsDomesticEx(request: PushSmsDomesticRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PushSmsDomesticResponse> {
    Util.validateModel(request);
    return $tea.cast<PushSmsDomesticResponse>(await this.doRequest("1.0", "antdigital.mreach.sms.domestic.push", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PushSmsDomesticResponse({}));
  }

  /**
   * Description: 查询短信发送详情
   * Summary: 查询短信发送详情
   */
  async querySmsDomestic(request: QuerySmsDomesticRequest): Promise<QuerySmsDomesticResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.querySmsDomesticEx(request, headers, runtime);
  }

  /**
   * Description: 查询短信发送详情
   * Summary: 查询短信发送详情
   */
  async querySmsDomesticEx(request: QuerySmsDomesticRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QuerySmsDomesticResponse> {
    Util.validateModel(request);
    return $tea.cast<QuerySmsDomesticResponse>(await this.doRequest("1.0", "antdigital.mreach.sms.domestic.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QuerySmsDomesticResponse({}));
  }

  /**
   * Description: mreach卡片短信发送接口
   * Summary: mreach卡片短信发送接口
   */
  async pushCardsmsDomestic(request: PushCardsmsDomesticRequest): Promise<PushCardsmsDomesticResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pushCardsmsDomesticEx(request, headers, runtime);
  }

  /**
   * Description: mreach卡片短信发送接口
   * Summary: mreach卡片短信发送接口
   */
  async pushCardsmsDomesticEx(request: PushCardsmsDomesticRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PushCardsmsDomesticResponse> {
    Util.validateModel(request);
    return $tea.cast<PushCardsmsDomesticResponse>(await this.doRequest("1.0", "antdigital.mreach.cardsms.domestic.push", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PushCardsmsDomesticResponse({}));
  }

  /**
   * Description: mreach卡片短信查询接口
   * Summary: mreach卡片短信查询接口
   */
  async queryCardsmsDomestic(request: QueryCardsmsDomesticRequest): Promise<QueryCardsmsDomesticResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryCardsmsDomesticEx(request, headers, runtime);
  }

  /**
   * Description: mreach卡片短信查询接口
   * Summary: mreach卡片短信查询接口
   */
  async queryCardsmsDomesticEx(request: QueryCardsmsDomesticRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryCardsmsDomesticResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryCardsmsDomesticResponse>(await this.doRequest("1.0", "antdigital.mreach.cardsms.domestic.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryCardsmsDomesticResponse({}));
  }

}
