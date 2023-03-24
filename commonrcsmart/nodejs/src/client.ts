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

// 审核结果详情
export class ContentRiskDetailVO extends $tea.Model {
  // 风险等级
  riskLevel?: string;
  // 风险提示
  notice?: string;
  // 命中词
  violaWords?: string;
  static names(): { [key: string]: string } {
    return {
      riskLevel: 'risk_level',
      notice: 'notice',
      violaWords: 'viola_words',
    };
  }

  static types(): { [key: string]: any } {
    return {
      riskLevel: 'string',
      notice: 'string',
      violaWords: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 审核文本内容
export class TextDataVO extends $tea.Model {
  // 审核文本内容
  text: string;
  static names(): { [key: string]: string } {
    return {
      text: 'text',
    };
  }

  static types(): { [key: string]: any } {
    return {
      text: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 通用版图片审核结果
export class ImageApprovalResultVO extends $tea.Model {
  // 机审结果
  result: string;
  // 图片审核结果的url
  resultUrl?: string;
  // 审核结果详情
  riskDetailVoList?: ContentRiskDetailVO[];
  static names(): { [key: string]: string } {
    return {
      result: 'result',
      resultUrl: 'result_url',
      riskDetailVoList: 'risk_detail_vo_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      result: 'string',
      resultUrl: 'string',
      riskDetailVoList: { 'type': 'array', 'itemType': ContentRiskDetailVO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 图片、音频、视频、文件信息
export class DataVo extends $tea.Model {
  // 文件审核地址
  url: string;
  // 文件类型
  fileType?: string;
  static names(): { [key: string]: string } {
    return {
      url: 'url',
      fileType: 'file_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      url: 'string',
      fileType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 审核结果基类
export class RcSmartResponse extends $tea.Model {
  // 结果码
  code: string;
  // 返回码描述
  msg: string;
  // 业务处理结果码
  subCode?: string;
  // 返回的提示信息
  subMsg?: string;
  // 可否重试
  retry?: boolean;
  static names(): { [key: string]: string } {
    return {
      code: 'code',
      msg: 'msg',
      subCode: 'sub_code',
      subMsg: 'sub_msg',
      retry: 'retry',
    };
  }

  static types(): { [key: string]: any } {
    return {
      code: 'string',
      msg: 'string',
      subCode: 'string',
      subMsg: 'string',
      retry: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 通用版文本审核结果
export class MessageApprovalResultVO extends $tea.Model {
  // 机审结果
  result: string;
  // 审核结果详情
  riskDetailVoList: ContentRiskDetailVO[];
  static names(): { [key: string]: string } {
    return {
      result: 'result',
      riskDetailVoList: 'risk_detail_vo_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      result: 'string',
      riskDetailVoList: { 'type': 'array', 'itemType': ContentRiskDetailVO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ConfirmRcApprovalMessageRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求ID
  requestId: string;
  // 审核场景列表
  scenes: string[];
  // 审核文本内容
  textData: TextDataVO;
  // 登录账号，默认使用主账号
  loginName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      requestId: 'request_id',
      scenes: 'scenes',
      textData: 'text_data',
      loginName: 'login_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      requestId: 'string',
      scenes: { 'type': 'array', 'itemType': 'string' },
      textData: TextDataVO,
      loginName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ConfirmRcApprovalMessageResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 审核结果基类
  rcSmartResponse?: RcSmartResponse;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      rcSmartResponse: 'rc_smart_response',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      rcSmartResponse: RcSmartResponse,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRcApprovalMessageRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 原审核请求ID
  origRequestId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      origRequestId: 'orig_request_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      origRequestId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRcApprovalMessageResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 审核结果基类
  rcSmartResponse?: RcSmartResponse;
  // 通用版文本审核结果
  resultVo?: MessageApprovalResultVO;
  // 审核结果页
  pageUrl?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      rcSmartResponse: 'rc_smart_response',
      resultVo: 'result_vo',
      pageUrl: 'page_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      rcSmartResponse: RcSmartResponse,
      resultVo: MessageApprovalResultVO,
      pageUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ConfirmRcApprovalImageRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求ID
  requestId: string;
  // 审核场景列表
  scenes: string[];
  // 审核文件内容
  dataVo: DataVo;
  // 登录账号；默认使用主账号
  loginName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      requestId: 'request_id',
      scenes: 'scenes',
      dataVo: 'data_vo',
      loginName: 'login_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      requestId: 'string',
      scenes: { 'type': 'array', 'itemType': 'string' },
      dataVo: DataVo,
      loginName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ConfirmRcApprovalImageResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 审核结果基类
  rcSmartResponse?: RcSmartResponse;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      rcSmartResponse: 'rc_smart_response',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      rcSmartResponse: RcSmartResponse,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRcApprovalImageRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 原审核请求ID
  origRequestId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      origRequestId: 'orig_request_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      origRequestId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRcApprovalImageResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 审核结果基类
  rcSmartResponse?: RcSmartResponse;
  // 通用版图片审核结果
  resultVo?: ImageApprovalResultVO;
  // 审核结果页
  pageUrl?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      rcSmartResponse: 'rc_smart_response',
      resultVo: 'result_vo',
      pageUrl: 'page_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      rcSmartResponse: RcSmartResponse,
      resultVo: ImageApprovalResultVO,
      pageUrl: 'string',
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
          sdk_version: "1.0.2",
          _prod_code: "COMMONRCSMART",
          _prod_channel: "undefined",
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
   * Description: 通用版文本审核接口
   * Summary: 通用版文本审核接口
   */
  async confirmRcApprovalMessage(request: ConfirmRcApprovalMessageRequest): Promise<ConfirmRcApprovalMessageResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.confirmRcApprovalMessageEx(request, headers, runtime);
  }

  /**
   * Description: 通用版文本审核接口
   * Summary: 通用版文本审核接口
   */
  async confirmRcApprovalMessageEx(request: ConfirmRcApprovalMessageRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ConfirmRcApprovalMessageResponse> {
    Util.validateModel(request);
    return $tea.cast<ConfirmRcApprovalMessageResponse>(await this.doRequest("1.0", "commonrcsmart.rc.approval.message.confirm", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ConfirmRcApprovalMessageResponse({}));
  }

  /**
   * Description: 通用版查询文本审核结果
   * Summary: 通用版查询文本审核结果
   */
  async queryRcApprovalMessage(request: QueryRcApprovalMessageRequest): Promise<QueryRcApprovalMessageResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryRcApprovalMessageEx(request, headers, runtime);
  }

  /**
   * Description: 通用版查询文本审核结果
   * Summary: 通用版查询文本审核结果
   */
  async queryRcApprovalMessageEx(request: QueryRcApprovalMessageRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryRcApprovalMessageResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryRcApprovalMessageResponse>(await this.doRequest("1.0", "commonrcsmart.rc.approval.message.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryRcApprovalMessageResponse({}));
  }

  /**
   * Description: 通用版图片审核接口
   * Summary: 通用版图片审核接口
   */
  async confirmRcApprovalImage(request: ConfirmRcApprovalImageRequest): Promise<ConfirmRcApprovalImageResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.confirmRcApprovalImageEx(request, headers, runtime);
  }

  /**
   * Description: 通用版图片审核接口
   * Summary: 通用版图片审核接口
   */
  async confirmRcApprovalImageEx(request: ConfirmRcApprovalImageRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ConfirmRcApprovalImageResponse> {
    Util.validateModel(request);
    return $tea.cast<ConfirmRcApprovalImageResponse>(await this.doRequest("1.0", "commonrcsmart.rc.approval.image.confirm", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ConfirmRcApprovalImageResponse({}));
  }

  /**
   * Description: 通用版图片审核结果查询接口
   * Summary: 通用版图片审核结果查询接口
   */
  async queryRcApprovalImage(request: QueryRcApprovalImageRequest): Promise<QueryRcApprovalImageResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryRcApprovalImageEx(request, headers, runtime);
  }

  /**
   * Description: 通用版图片审核结果查询接口
   * Summary: 通用版图片审核结果查询接口
   */
  async queryRcApprovalImageEx(request: QueryRcApprovalImageRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryRcApprovalImageResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryRcApprovalImageResponse>(await this.doRequest("1.0", "commonrcsmart.rc.approval.image.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryRcApprovalImageResponse({}));
  }

}
