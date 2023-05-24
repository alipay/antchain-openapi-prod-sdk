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

// 人脸盾结果
export class FaceShieldResult extends $tea.Model {
  // 设备token
  apdidToken: string;
  // 风险等级，-1参数异常，0无风险，1-3表示低、中、高
  riskLevel: number;
  // 风险描述，对风险等级的补充
  riskDesc: string;
  // 处理的建议，如PAAS
  sugAction: string;
  static names(): { [key: string]: string } {
    return {
      apdidToken: 'apdid_token',
      riskLevel: 'risk_level',
      riskDesc: 'risk_desc',
      sugAction: 'sug_action',
    };
  }

  static types(): { [key: string]: any } {
    return {
      apdidToken: 'string',
      riskLevel: 'number',
      riskDesc: 'string',
      sugAction: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 保单信息
export class InsureInfo extends $tea.Model {
  // 保单时间
  modifyTime: string;
  // 蚂蚁L5产品code
  productCode: string;
  // 保险产品code
  insureProduct: string;
  // 保险产品价格
  insurePrice: string;
  // 保险品种
  insureType: string;
  // 付款方式
  payType: string;
  // 保险期数
  insurePeriod: string;
  // 保单状态
  policyStatus: string;
  // 操作类型
  operateType: string;
  // 保司信用代码
  insureCompCreditNo: string;
  static names(): { [key: string]: string } {
    return {
      modifyTime: 'modify_time',
      productCode: 'product_code',
      insureProduct: 'insure_product',
      insurePrice: 'insure_price',
      insureType: 'insure_type',
      payType: 'pay_type',
      insurePeriod: 'insure_period',
      policyStatus: 'policy_status',
      operateType: 'operate_type',
      insureCompCreditNo: 'insure_comp_credit_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      modifyTime: 'string',
      productCode: 'string',
      insureProduct: 'string',
      insurePrice: 'string',
      insureType: 'string',
      payType: 'string',
      insurePeriod: 'string',
      policyStatus: 'string',
      operateType: 'string',
      insureCompCreditNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RunGeneralRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 业务请求数据，json格式
  request: string;
  // 要调用的具体的服务名称
  serviceName: string;
  // 扩展信息
  extInfo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      request: 'request',
      serviceName: 'service_name',
      extInfo: 'ext_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      request: 'string',
      serviceName: 'string',
      extInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RunGeneralResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 业务响应数据，json格式
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

export class ExecEkytInsureRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 保险信息，包含保单的所有信息
  insureInfo: string;
  // 投保人信息
  applicantInfo: string;
  // 被保人信息
  assuredInfo: string;
  // 数据签名
  signature: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      insureInfo: 'insure_info',
      applicantInfo: 'applicant_info',
      assuredInfo: 'assured_info',
      signature: 'signature',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      insureInfo: 'string',
      applicantInfo: 'string',
      assuredInfo: 'string',
      signature: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecEkytInsureResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否成功
  success?: string;
  // 返回结果描述
  message?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      message: 'message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'string',
      message: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateBssecpicRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 应用名
  appName?: string;
  // 客户名
  clientName: string;
  // 操作系统
  osType: string;
  // 包名
  packageName: string;
  // 签名信息
  certSign?: string;
  // 签名秘钥内容
  appKeyData?: string;
  // 加密秘钥内容
  securityData?: string;
  // 自定义秘钥内容
  extraData?: string;
  // 白盒秘钥内容
  whiteBoxData?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      appName: 'app_name',
      clientName: 'client_name',
      osType: 'os_type',
      packageName: 'package_name',
      certSign: 'cert_sign',
      appKeyData: 'app_key_data',
      securityData: 'security_data',
      extraData: 'extra_data',
      whiteBoxData: 'white_box_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      appName: 'string',
      clientName: 'string',
      osType: 'string',
      packageName: 'string',
      certSign: 'string',
      appKeyData: 'string',
      securityData: 'string',
      extraData: 'string',
      whiteBoxData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateBssecpicResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否成功
  success?: boolean;
  // 返回文件名
  fileName?: string;
  // 返回文件的内容base64
  bodyBase64?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      fileName: 'file_name',
      bodyBase64: 'body_base64',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
      fileName: 'string',
      bodyBase64: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateBlueshieldSecuritypictureRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 应用名
  appName?: string;
  // 客户名
  clientName: string;
  // 操作系统
  osType: string;
  // 包名
  packageName: string;
  // 签名信息
  certSign?: string;
  // 签名秘钥内容
  appKeyData?: string;
  // 加密秘钥内容
  securityData?: string;
  // 自定义秘钥内容
  extraData?: string;
  // 白盒秘钥内容
  whiteBoxData?: string;
  // raas产品码列表
  raasProducts: string;
  // 直接透传的二级租户，可选
  raasSecondTenant?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      appName: 'app_name',
      clientName: 'client_name',
      osType: 'os_type',
      packageName: 'package_name',
      certSign: 'cert_sign',
      appKeyData: 'app_key_data',
      securityData: 'security_data',
      extraData: 'extra_data',
      whiteBoxData: 'white_box_data',
      raasProducts: 'raas_products',
      raasSecondTenant: 'raas_second_tenant',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      appName: 'string',
      clientName: 'string',
      osType: 'string',
      packageName: 'string',
      certSign: 'string',
      appKeyData: 'string',
      securityData: 'string',
      extraData: 'string',
      whiteBoxData: 'string',
      raasProducts: 'string',
      raasSecondTenant: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateBlueshieldSecuritypictureResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 执行是否成功
  success?: boolean;
  // 生成的图片文件名
  fileName?: string;
  // body base 64
  bodyBase64?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      fileName: 'file_name',
      bodyBase64: 'body_base64',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
      fileName: 'string',
      bodyBase64: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryFaceshieldNativeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 客户id，标识客户来源
  clientId: string;
  // 设备token
  apdidToken?: string;
  // 切面数据（JSON，详见下方）
  // {
  // 	"sessionId": "zimId"	//人脸的bizID
  //   "rId": "rId"	//在获取活体方法人脸下发的bisToken
  //   "keyInfoHash": "keyInfoHash"	//关键信息hash
  //   "pictureHash": "人脸图片的hash"	//解密出来的人脸图片做hash
  //   "rData": "xxx"	//客户端在zimInit和zimValidate带上去的业务风险数据
  // }
  aopData?: string;
  // 否（和切面二选一即可）
  signature?: string;
  // 签名因子（和切面二选一即可）
  signFactor?: string;
  // RaaS租户
  raasProducts: string;
  // raas二级租户
  raasSecondTenant?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      clientId: 'client_id',
      apdidToken: 'apdid_token',
      aopData: 'aop_data',
      signature: 'signature',
      signFactor: 'sign_factor',
      raasProducts: 'raas_products',
      raasSecondTenant: 'raas_second_tenant',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      clientId: 'string',
      apdidToken: 'string',
      aopData: 'string',
      signature: 'string',
      signFactor: 'string',
      raasProducts: 'string',
      raasSecondTenant: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryFaceshieldNativeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // true成功，false失败
  success?: boolean;
  // 请求码，200成功，其他失败，具体见错误码
  code?: number;
  // 错误时的返回信息
  message?: string;
  // 请求时传入的，若没有传，则系统自动生成
  requestId?: string;
  // apdidToken	String	设备token
  // riskLevel	String	风险等级，-1参数异常，0无风险，1-3表示低、中、高
  // riskDesc	String	风险描述，对风险等级的补充
  // sugAction	String	处理的建议，如PAAS
  data?: FaceShieldResult;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      code: 'code',
      message: 'message',
      requestId: 'request_id',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
      code: 'number',
      message: 'string',
      requestId: 'string',
      data: FaceShieldResult,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryFaceshieldWebRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 客户id，标识客户来源
  clientId: string;
  // 设备token
  apdidToken?: string;
  // 切面数据（JSON，详见下方）
  aopData?: string;
  // RaaS租户
  // 
  raasProducts: string;
  // raas二级租户
  // 
  raasSecondTenant?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      clientId: 'client_id',
      apdidToken: 'apdid_token',
      aopData: 'aop_data',
      raasProducts: 'raas_products',
      raasSecondTenant: 'raas_second_tenant',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      clientId: 'string',
      apdidToken: 'string',
      aopData: 'string',
      raasProducts: 'string',
      raasSecondTenant: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryFaceshieldWebResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // true成功，false失败	
  // 
  success?: boolean;
  // 请求码，200成功，其他失败，具体见错误码
  // 
  code?: number;
  // 错误时的返回信息
  // 
  message?: string;
  // 请求时传入的，若没有传，则系统自动生成
  // 
  requestId?: string;
  // apdidToken String 设备token riskLevel String 风险等级，-1参数异常，0无风险，1-3表示低、中、高 riskDesc String 风险描述，对风险等级的补充 sugAction String 处理的建议，如PAAS
  data?: FaceShieldResult;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      code: 'code',
      message: 'message',
      requestId: 'request_id',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
      code: 'number',
      message: 'string',
      requestId: 'string',
      data: FaceShieldResult,
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
          sdk_version: "1.1.4",
          _prod_code: "SECURITYTECH",
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
   * Description: 安全科技网关通用运行接口
   * Summary: 安全科技网关通用运行接口
   */
  async runGeneral(request: RunGeneralRequest): Promise<RunGeneralResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.runGeneralEx(request, headers, runtime);
  }

  /**
   * Description: 安全科技网关通用运行接口
   * Summary: 安全科技网关通用运行接口
   */
  async runGeneralEx(request: RunGeneralRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RunGeneralResponse> {
    Util.validateModel(request);
    return $tea.cast<RunGeneralResponse>(await this.doRequest("1.0", "antsecuritytech.gateway.general.run", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RunGeneralResponse({}));
  }

  /**
   * Description: 租赁住房保险产品，开放接口
  调用方：上海远点网络科技有限公司
   * Summary: 租赁住房保险产品，接口开放给租房平台
   */
  async execEkytInsure(request: ExecEkytInsureRequest): Promise<ExecEkytInsureResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execEkytInsureEx(request, headers, runtime);
  }

  /**
   * Description: 租赁住房保险产品，开放接口
  调用方：上海远点网络科技有限公司
   * Summary: 租赁住房保险产品，接口开放给租房平台
   */
  async execEkytInsureEx(request: ExecEkytInsureRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecEkytInsureResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecEkytInsureResponse>(await this.doRequest("1.0", "antsecuritytech.gateway.ekyt.insure.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecEkytInsureResponse({}));
  }

  /**
   * Description: 蓝盾安全图片生成
   * Summary: 蓝盾安全图片生成
   */
  async createBssecpic(request: CreateBssecpicRequest): Promise<CreateBssecpicResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createBssecpicEx(request, headers, runtime);
  }

  /**
   * Description: 蓝盾安全图片生成
   * Summary: 蓝盾安全图片生成
   */
  async createBssecpicEx(request: CreateBssecpicRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateBssecpicResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateBssecpicResponse>(await this.doRequest("1.0", "antsecuritytech.gateway.bssecpic.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateBssecpicResponse({}));
  }

  /**
   * Description: 蓝盾安全图片生成
   * Summary: 蓝盾安全图片生成
   */
  async createBlueshieldSecuritypicture(request: CreateBlueshieldSecuritypictureRequest): Promise<CreateBlueshieldSecuritypictureResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createBlueshieldSecuritypictureEx(request, headers, runtime);
  }

  /**
   * Description: 蓝盾安全图片生成
   * Summary: 蓝盾安全图片生成
   */
  async createBlueshieldSecuritypictureEx(request: CreateBlueshieldSecuritypictureRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateBlueshieldSecuritypictureResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateBlueshieldSecuritypictureResponse>(await this.doRequest("1.0", "antsecuritytech.gateway.blueshield.securitypicture.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateBlueshieldSecuritypictureResponse({}));
  }

  /**
   * Description: 终端安全人脸盾Native查询
   * Summary: 人脸盾Native查询
   */
  async queryFaceshieldNative(request: QueryFaceshieldNativeRequest): Promise<QueryFaceshieldNativeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryFaceshieldNativeEx(request, headers, runtime);
  }

  /**
   * Description: 终端安全人脸盾Native查询
   * Summary: 人脸盾Native查询
   */
  async queryFaceshieldNativeEx(request: QueryFaceshieldNativeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryFaceshieldNativeResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryFaceshieldNativeResponse>(await this.doRequest("1.0", "antsecuritytech.gateway.faceshield.native.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryFaceshieldNativeResponse({}));
  }

  /**
   * Description: 终端安全人脸盾Web查询
   * Summary: 人脸盾Web查询
   */
  async queryFaceshieldWeb(request: QueryFaceshieldWebRequest): Promise<QueryFaceshieldWebResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryFaceshieldWebEx(request, headers, runtime);
  }

  /**
   * Description: 终端安全人脸盾Web查询
   * Summary: 人脸盾Web查询
   */
  async queryFaceshieldWebEx(request: QueryFaceshieldWebRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryFaceshieldWebResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryFaceshieldWebResponse>(await this.doRequest("1.0", "antsecuritytech.gateway.faceshield.web.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryFaceshieldWebResponse({}));
  }

}
