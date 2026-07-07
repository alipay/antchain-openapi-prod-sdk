// This file is auto-generated, don't edit it
import AntchainUtil from '@antchain/alipay-util';
import Util, * as $Util from '@alicloud/tea-util';
import RPCUtil from '@alicloud/rpc-util';
import * as $tea from '@alicloud/tea-typescript';

/**
 * @remarks
 * Model for initing client
 */
export class Config extends $tea.Model {
  /**
   * @remarks
   * accesskey id
   */
  accessKeyId?: string;
  /**
   * @remarks
   * accesskey secret
   */
  accessKeySecret?: string;
  /**
   * @remarks
   * security token
   */
  securityToken?: string;
  /**
   * @remarks
   * http protocol
   * 
   * @example
   * http
   */
  protocol?: string;
  /**
   * @remarks
   * read timeout
   * 
   * @example
   * 10
   */
  readTimeout?: number;
  /**
   * @remarks
   * connect timeout
   * 
   * @example
   * 10
   */
  connectTimeout?: number;
  /**
   * @remarks
   * http proxy
   * 
   * @example
   * http://localhost
   */
  httpProxy?: string;
  /**
   * @remarks
   * https proxy
   * 
   * @example
   * https://localhost
   */
  httpsProxy?: string;
  /**
   * @remarks
   * endpoint
   * 
   * @example
   * cs.aliyuncs.com
   */
  endpoint?: string;
  /**
   * @remarks
   * proxy white list
   * 
   * @example
   * http://localhost
   */
  noProxy?: string;
  /**
   * @remarks
   * max idle conns
   * 
   * @example
   * 3
   */
  maxIdleConns?: number;
  /**
   * @remarks
   * user agent
   * 
   * @example
   * Alibabacloud/1
   */
  userAgent?: string;
  /**
   * @remarks
   * socks5 proxy
   */
  socks5Proxy?: string;
  /**
   * @remarks
   * socks5 network
   * 
   * @example
   * TCP
   */
  socks5NetWork?: string;
  /**
   * @remarks
   * 长链接最大空闲时长
   */
  maxIdleTimeMillis?: number;
  /**
   * @remarks
   * 长链接最大连接时长
   */
  keepAliveDurationMillis?: number;
  /**
   * @remarks
   * 最大连接数（长链接最大总数）
   */
  maxRequests?: number;
  /**
   * @remarks
   * 每个目标主机的最大连接数（分主机域名的长链接最大总数
   */
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

export class QueryCustomerOverdueRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 客户号
  customerAccount: string;
  // 产品类型
  productType: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      customerAccount: 'customer_account',
      productType: 'product_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      customerAccount: 'string',
      productType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCustomerOverdueResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // S:成功,F:失败
  flag?: string;
  // 0:成功,1:失败
  code?: number;
  // 成功or失败
  msg?: string;
  // true : 逾期 false: 不逾期
  data?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      flag: 'flag',
      code: 'code',
      msg: 'msg',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      flag: 'string',
      code: 'number',
      msg: 'string',
      data: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCustomerRepaylinkRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 客户号
  custNo: string;
  // 模版编号
  smsTemplateNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      custNo: 'cust_no',
      smsTemplateNo: 'sms_template_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      custNo: 'string',
      smsTemplateNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCustomerRepaylinkResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // S:成功,F:失败
  flag?: string;
  // 0:成功,1:失败
  code?: number;
  // 成功or失败
  msg?: string;
  // 生成的链接码，如果生成失败返回null , shortLink-短信链接，checkCode-校验码
  // eg：
  // {"custNo":"CT001","shortLink":"https://lawyer.360-jr.com/common/index","checkCode":"awdwa232"}
  data?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      flag: 'flag',
      code: 'code',
      msg: 'msg',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      flag: 'string',
      code: 'number',
      msg: 'string',
      data: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCustomerWxleadlinkRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 客户号
  custNo: string;
  // 案件号
  caseCode: string;
  // AES加密手机号
  phone: string;
  // 产品类型
  productType: string;
  // 约定固定值-一般是对应平台的缩写
  createBy: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      custNo: 'cust_no',
      caseCode: 'case_code',
      phone: 'phone',
      productType: 'product_type',
      createBy: 'create_by',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      custNo: 'string',
      caseCode: 'string',
      phone: 'string',
      productType: 'string',
      createBy: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCustomerWxleadlinkResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // S:成功,F:失败
  flag?: string;
  // 0:成功,1:失败
  code?: number;
  // 成功or失败
  msg?: string;
  // 生成的链接码，如果生成失败返回null , qwshortLink-短信链接，checkCode-校验码
  // eg：
  // {"custNo":"CT001","qwshortLink":"https://lawyer.360-jr.com/common/index","checkCode":"awdwa232"}
  data?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      flag: 'flag',
      code: 'code',
      msg: 'msg',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      flag: 'string',
      code: 'number',
      msg: 'string',
      data: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCustomerTransartificialRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 客户号
  custNo: string;
  // 案件号
  caseCode?: string;
  // 产品类型
  productType?: string;
  // 约定固定值-一般是对应平台的缩写
  createBy?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      custNo: 'cust_no',
      caseCode: 'case_code',
      productType: 'product_type',
      createBy: 'create_by',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      custNo: 'string',
      caseCode: 'string',
      productType: 'string',
      createBy: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCustomerTransartificialResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // S:成功,F:失败
  flag?: string;
  // 0:成功,1:失败
  code?: number;
  // 成功or失败
  msg?: string;
  // SON字符串，返回是否可提前转人工
  // transArtificial : 默认N-不转人工，Y-转人工
  // eg：
  // {"custNo":"CT001","transArtificial":"Y"}
  data?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      flag: 'flag',
      code: 'code',
      msg: 'msg',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      flag: 'string',
      code: 'number',
      msg: 'string',
      data: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CallbackTaskCallresultRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 错误编码(0: 正确)
  errorCode: string;
  // 通话结果
  dialResult: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      errorCode: 'error_code',
      dialResult: 'dial_result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      errorCode: 'string',
      dialResult: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CallbackTaskCallresultResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // S:成功,F:失败
  flag?: string;
  // 0:成功,1:失败
  code?: number;
  // 成功or失败
  msg?: string;
  // 结果说明
  data?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      flag: 'flag',
      code: 'code',
      msg: 'msg',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      flag: 'string',
      code: 'number',
      msg: 'string',
      data: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CallbackTaskSmsresultRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 客户号
  aCaseId: string;
  // 批次号
  batchNo: string;
  // 案件主联系人姓名 AES加密
  collectedName: string;
  // 联系人姓名 AES加密
  contactName: string;
  // 联系人号码 AES加密
  contactPhone: string;
  // 联系人状态（有意愿还款之类）
  contactStatus: string;
  // 短信内容
  content: string;
  // 还款日
  overdueDate: string;
  // 备注
  remark?: string;
  // 发送结果 21:客户回复接收成功 10:失败 11:成功
  sendResult: string;
  // 发送方式：如果是系统发送，那么为必填(1-短信，2-语音，3-智能语音)
  sendWay: number;
  // 唯一标识(可用来判重)
  sessionId: string;
  // 发送时间(毫秒)
  time: number;
  // 1 发送 2 接收 -客户回复
  type: string;
  // 约定固定值-一般是对应平台的缩写
  createBy: string;
  // 短信模板
  templateNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      aCaseId: 'a_case_id',
      batchNo: 'batch_no',
      collectedName: 'collected_name',
      contactName: 'contact_name',
      contactPhone: 'contact_phone',
      contactStatus: 'contact_status',
      content: 'content',
      overdueDate: 'overdue_date',
      remark: 'remark',
      sendResult: 'send_result',
      sendWay: 'send_way',
      sessionId: 'session_id',
      time: 'time',
      type: 'type',
      createBy: 'create_by',
      templateNo: 'template_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      aCaseId: 'string',
      batchNo: 'string',
      collectedName: 'string',
      contactName: 'string',
      contactPhone: 'string',
      contactStatus: 'string',
      content: 'string',
      overdueDate: 'string',
      remark: 'string',
      sendResult: 'string',
      sendWay: 'number',
      sessionId: 'string',
      time: 'number',
      type: 'string',
      createBy: 'string',
      templateNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CallbackTaskSmsresultResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // S:成功,F:失败
  flag?: string;
  // 0:成功,1:失败
  code?: number;
  // 成功or失败
  msg?: string;
  // 结果说明
  data?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      flag: 'flag',
      code: 'code',
      msg: 'msg',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      flag: 'string',
      code: 'number',
      msg: 'string',
      data: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushCustomerInternalmsgRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 客户号
  custNo: string;
  // 模版信息
  templateInfo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      custNo: 'cust_no',
      templateInfo: 'template_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      custNo: 'string',
      templateInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushCustomerInternalmsgResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // S:成功,F:失败
  flag?: string;
  // 0:成功,1:失败
  code?: number;
  // 成功or失败
  msg?: string;
  // 结果说明
  data?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      flag: 'flag',
      code: 'code',
      msg: 'msg',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      flag: 'string',
      code: 'number',
      msg: 'string',
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
   * @remarks
   * Init client with Config
   * 
   * @param config - config contains the necessary information to create a client
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
   * @remarks
   * Encapsulate the request and invoke the network
   * 
   * @param action - api name
   * @param protocol - http or https
   * @param method - e.g. GET
   * @param pathname - pathname of every api
   * @param request - which contains request params
   * @param runtime - which controls some details of call api, such as retry times
   * @returns the response
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
          sdk_version: "1.0.0",
          _prod_code: "RESOLVESERVICE",
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
   * @remarks
   * Description: 查询360客户是否逾期
   * Summary: 查询360客户是否逾期
   */
  async queryCustomerOverdue(request: QueryCustomerOverdueRequest): Promise<QueryCustomerOverdueResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryCustomerOverdueEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 查询360客户是否逾期
   * Summary: 查询360客户是否逾期
   */
  async queryCustomerOverdueEx(request: QueryCustomerOverdueRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryCustomerOverdueResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryCustomerOverdueResponse>(await this.doRequest("1.0", "antdigital.resolveservice.customer.overdue.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryCustomerOverdueResponse({}));
  }

  /**
   * @remarks
   * Description: 查询360客户快捷还款预链接码
   * Summary: 查询360客户快捷还款预链接码
   */
  async queryCustomerRepaylink(request: QueryCustomerRepaylinkRequest): Promise<QueryCustomerRepaylinkResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryCustomerRepaylinkEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 查询360客户快捷还款预链接码
   * Summary: 查询360客户快捷还款预链接码
   */
  async queryCustomerRepaylinkEx(request: QueryCustomerRepaylinkRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryCustomerRepaylinkResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryCustomerRepaylinkResponse>(await this.doRequest("1.0", "antdigital.resolveservice.customer.repaylink.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryCustomerRepaylinkResponse({}));
  }

  /**
   * @remarks
   * Description: 查询360客户微信获客链接
   * Summary: 查询360客户微信获客链接
   */
  async queryCustomerWxleadlink(request: QueryCustomerWxleadlinkRequest): Promise<QueryCustomerWxleadlinkResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryCustomerWxleadlinkEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 查询360客户微信获客链接
   * Summary: 查询360客户微信获客链接
   */
  async queryCustomerWxleadlinkEx(request: QueryCustomerWxleadlinkRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryCustomerWxleadlinkResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryCustomerWxleadlinkResponse>(await this.doRequest("1.0", "antdigital.resolveservice.customer.wxleadlink.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryCustomerWxleadlinkResponse({}));
  }

  /**
   * @remarks
   * Description: 查询360客户次日是否提前转人工
   * Summary: 查询360客户次日是否提前转人工
   */
  async queryCustomerTransartificial(request: QueryCustomerTransartificialRequest): Promise<QueryCustomerTransartificialResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryCustomerTransartificialEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 查询360客户次日是否提前转人工
   * Summary: 查询360客户次日是否提前转人工
   */
  async queryCustomerTransartificialEx(request: QueryCustomerTransartificialRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryCustomerTransartificialResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryCustomerTransartificialResponse>(await this.doRequest("1.0", "antdigital.resolveservice.customer.transartificial.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryCustomerTransartificialResponse({}));
  }

  /**
   * @remarks
   * Description: 94拨打结果回传
   * Summary: 94拨打结果回传
   */
  async callbackTaskCallresult(request: CallbackTaskCallresultRequest): Promise<CallbackTaskCallresultResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.callbackTaskCallresultEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 94拨打结果回传
   * Summary: 94拨打结果回传
   */
  async callbackTaskCallresultEx(request: CallbackTaskCallresultRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CallbackTaskCallresultResponse> {
    Util.validateModel(request);
    return $tea.cast<CallbackTaskCallresultResponse>(await this.doRequest("1.0", "antdigital.resolveservice.task.callresult.callback", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CallbackTaskCallresultResponse({}));
  }

  /**
   * @remarks
   * Description: 94短信结果回传
   * Summary: 94短信结果回传
   */
  async callbackTaskSmsresult(request: CallbackTaskSmsresultRequest): Promise<CallbackTaskSmsresultResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.callbackTaskSmsresultEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 94短信结果回传
   * Summary: 94短信结果回传
   */
  async callbackTaskSmsresultEx(request: CallbackTaskSmsresultRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CallbackTaskSmsresultResponse> {
    Util.validateModel(request);
    return $tea.cast<CallbackTaskSmsresultResponse>(await this.doRequest("1.0", "antdigital.resolveservice.task.smsresult.callback", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CallbackTaskSmsresultResponse({}));
  }

  /**
   * @remarks
   * Description: 94回推360客户行为接口
   * Summary: 94回推360客户行为接口
   */
  async pushCustomerInternalmsg(request: PushCustomerInternalmsgRequest): Promise<PushCustomerInternalmsgResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pushCustomerInternalmsgEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 94回推360客户行为接口
   * Summary: 94回推360客户行为接口
   */
  async pushCustomerInternalmsgEx(request: PushCustomerInternalmsgRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PushCustomerInternalmsgResponse> {
    Util.validateModel(request);
    return $tea.cast<PushCustomerInternalmsgResponse>(await this.doRequest("1.0", "antdigital.resolveservice.customer.internalmsg.push", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PushCustomerInternalmsgResponse({}));
  }

}
