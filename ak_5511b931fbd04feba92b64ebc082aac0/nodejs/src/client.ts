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

export class InitAntchainEkycFaceauthWebsdkRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户请求的唯一标志，该标识作为对账的关键信息，商户要保证其唯一性
  bizId: string;
  // 预留扩展业务参数
  externParam?: string;
  // 用户身份信息
  identityParam?: string;
  // metainfo环境参数
  metainfo?: string;
  // 操作类型
  operationType?: string;
  // 比对源图片
  refImg?: string;
  // 比对源照片oss方式中转
  refImgOssObj?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizId: 'biz_id',
      externParam: 'extern_param',
      identityParam: 'identity_param',
      metainfo: 'metainfo',
      operationType: 'operation_type',
      refImg: 'ref_img',
      refImgOssObj: 'ref_img_oss_obj',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizId: 'string',
      externParam: 'string',
      identityParam: 'string',
      metainfo: 'string',
      operationType: 'string',
      refImg: 'string',
      refImgOssObj: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class InitAntchainEkycFaceauthWebsdkResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 实人认证id
  zimId?: string;
  // 预留扩展结果
  externInfo?: string;
  // 产品结果明细，不影响决策
  resultCodeSub?: string;
  // result_code_sub对应的文案
  resultMsgSub?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      zimId: 'zim_id',
      externInfo: 'extern_info',
      resultCodeSub: 'result_code_sub',
      resultMsgSub: 'result_msg_sub',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      zimId: 'string',
      externInfo: 'string',
      resultCodeSub: 'string',
      resultMsgSub: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class InitAntchainEkycSingleZimRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 环境参数
  metaInfo: string;
  // 实人认证id
  zimId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      metaInfo: 'meta_info',
      zimId: 'zim_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      metaInfo: 'string',
      zimId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class InitAntchainEkycSingleZimResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 预留扩展结果
  extParams?: string;
  // 协议
  protocol?: string;
  // 返回码
  retCode?: string;
  // 明细返回码
  retCodeSub?: string;
  // 明细返回码对应的文案
  retMessageSub?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      extParams: 'ext_params',
      protocol: 'protocol',
      retCode: 'ret_code',
      retCodeSub: 'ret_code_sub',
      retMessageSub: 'ret_message_sub',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      extParams: 'string',
      protocol: 'string',
      retCode: 'string',
      retCodeSub: 'string',
      retMessageSub: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class VerifyAntchainEkycSingleZimRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 扩展信息,Map的json格式
  externParam?: string;
  // 人脸业务参数
  zimData: string;
  // 实人认证id
  zimId: string;
  // zim_data可通过oss方式中转
  zimDataOssObj?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      externParam: 'extern_param',
      zimData: 'zim_data',
      zimId: 'zim_id',
      zimDataOssObj: 'zim_data_oss_obj',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      externParam: 'string',
      zimData: 'string',
      zimId: 'string',
      zimDataOssObj: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class VerifyAntchainEkycSingleZimResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 预留扩展结果
  extParams?: string;
  // 产品返回明细码
  productRetCode?: string;
  // 验证返回明细码
  validationRetCode?: string;
  // 明细返回码
  retCodeSub?: string;
  // 明细返回码对应的文案
  retMessageSub?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      extParams: 'ext_params',
      productRetCode: 'product_ret_code',
      validationRetCode: 'validation_ret_code',
      retCodeSub: 'ret_code_sub',
      retMessageSub: 'ret_message_sub',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      extParams: 'string',
      productRetCode: 'string',
      validationRetCode: 'string',
      retCodeSub: 'string',
      retMessageSub: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class InitAntchainEkycMultiZimRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 环境参数
  metaInfo: string;
  // 实人认证id
  certifyId: string;
  // 产品类型
  productType: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      metaInfo: 'meta_info',
      certifyId: 'certify_id',
      productType: 'product_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      metaInfo: 'string',
      certifyId: 'string',
      productType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class InitAntchainEkycMultiZimResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 预留扩展结果
  extParams?: string;
  // 协议
  protocol?: string;
  // 返回码
  retCode?: string;
  // 明细返回码
  retCodeSub?: string;
  // 明细返回码对应的文案
  retMessageSub?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      extParams: 'ext_params',
      protocol: 'protocol',
      retCode: 'ret_code',
      retCodeSub: 'ret_code_sub',
      retMessageSub: 'ret_message_sub',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      extParams: 'string',
      protocol: 'string',
      retCode: 'string',
      retCodeSub: 'string',
      retMessageSub: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class VerifyAntchainEkycMultiZimRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 扩展信息,Map的json格式
  externParam?: string;
  // 人脸业务参数
  zimData: string;
  // 实人认证id
  certifyId: string;
  // zim_data可通过oss方式中转
  zimDataOssObj?: string;
  // 产品类型
  productType?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      externParam: 'extern_param',
      zimData: 'zim_data',
      certifyId: 'certify_id',
      zimDataOssObj: 'zim_data_oss_obj',
      productType: 'product_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      externParam: 'string',
      zimData: 'string',
      certifyId: 'string',
      zimDataOssObj: 'string',
      productType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class VerifyAntchainEkycMultiZimResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 预留扩展结果
  extParams?: string;
  // 产品返回明细码
  productRetCode?: string;
  // 验证返回明细码
  validationRetCode?: string;
  // 明细返回码
  retCodeSub?: string;
  // 明细返回码对应的文案
  retMessageSub?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      extParams: 'ext_params',
      productRetCode: 'product_ret_code',
      validationRetCode: 'validation_ret_code',
      retCodeSub: 'ret_code_sub',
      retMessageSub: 'ret_message_sub',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      extParams: 'string',
      productRetCode: 'string',
      validationRetCode: 'string',
      retCodeSub: 'string',
      retMessageSub: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ConfirmAntchainEkycMultiZimRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 实人认证id
  certifyId: string;
  // 扩展信息,Map的json格式
  externParam?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      certifyId: 'certify_id',
      externParam: 'extern_param',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      certifyId: 'string',
      externParam: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ConfirmAntchainEkycMultiZimResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 预留扩展结果
  extParams?: string;
  // 明细返回码
  retCodeSub?: string;
  // 明细返回码对应的文案
  retMessageSub?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      extParams: 'ext_params',
      retCodeSub: 'ret_code_sub',
      retMessageSub: 'ret_message_sub',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      extParams: 'string',
      retCodeSub: 'string',
      retMessageSub: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class InitAntchainEkycVerificationWebsdkRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户请求的唯一标志，该标识作为对账的关键信息，商户要保证其唯一性
  bizId: string;
  // 场景ID
  sceneId?: string;
  // 预留扩展参数
  externParam?: string;
  // 用户身份信息
  identityParam?: string;
  // metainfo环境参数
  metainfo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizId: 'biz_id',
      sceneId: 'scene_id',
      externParam: 'extern_param',
      identityParam: 'identity_param',
      metainfo: 'metainfo',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizId: 'string',
      sceneId: 'string',
      externParam: 'string',
      identityParam: 'string',
      metainfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class InitAntchainEkycVerificationWebsdkResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 实人认证id
  certifyId?: string;
  // 预留扩展结果
  externInfo?: string;
  // 产品结果明细，不影响决策
  resultCodeSub?: string;
  // result_code_sub对应的文案
  resultMsgSub?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      certifyId: 'certify_id',
      externInfo: 'extern_info',
      resultCodeSub: 'result_code_sub',
      resultMsgSub: 'result_msg_sub',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      certifyId: 'string',
      externInfo: 'string',
      resultCodeSub: 'string',
      resultMsgSub: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class InitAntchainEkycVerificationNativeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户请求的唯一标志，该标识作为对账的关键信息，商户要保证其唯一性
  bizId: string;
  // 场景ID
  sceneId?: string;
  // 预留扩展参数
  externParam?: string;
  // 用户身份信息
  identityParam?: string;
  // metainfo环境参数
  metainfo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizId: 'biz_id',
      sceneId: 'scene_id',
      externParam: 'extern_param',
      identityParam: 'identity_param',
      metainfo: 'metainfo',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizId: 'string',
      sceneId: 'string',
      externParam: 'string',
      identityParam: 'string',
      metainfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class InitAntchainEkycVerificationNativeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 实人认证id
  certifyId?: string;
  // 预留扩展结果
  externInfo?: string;
  // 产品结果明细，不影响决策
  resultCodeSub?: string;
  // result_code_sub对应的文案
  resultMsgSub?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      certifyId: 'certify_id',
      externInfo: 'extern_info',
      resultCodeSub: 'result_code_sub',
      resultMsgSub: 'result_msg_sub',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      certifyId: 'string',
      externInfo: 'string',
      resultCodeSub: 'string',
      resultMsgSub: 'string',
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
          sdk_version: "1.0.0",
          _prod_code: "ak_5511b931fbd04feba92b64ebc082aac0",
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
   * Description: Web实人认证初始化
   * Summary: Web实人认证初始化
   */
  async initAntchainEkycFaceauthWebsdk(request: InitAntchainEkycFaceauthWebsdkRequest): Promise<InitAntchainEkycFaceauthWebsdkResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.initAntchainEkycFaceauthWebsdkEx(request, headers, runtime);
  }

  /**
   * Description: Web实人认证初始化
   * Summary: Web实人认证初始化
   */
  async initAntchainEkycFaceauthWebsdkEx(request: InitAntchainEkycFaceauthWebsdkRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<InitAntchainEkycFaceauthWebsdkResponse> {
    Util.validateModel(request);
    return $tea.cast<InitAntchainEkycFaceauthWebsdkResponse>(await this.doRequest("1.0", "antchain.ekyc.faceauth.websdk.init", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new InitAntchainEkycFaceauthWebsdkResponse({}));
  }

  /**
   * Description: 客户端单产品初始化接口
   * Summary: 客户端单产品初始化
   */
  async initAntchainEkycSingleZim(request: InitAntchainEkycSingleZimRequest): Promise<InitAntchainEkycSingleZimResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.initAntchainEkycSingleZimEx(request, headers, runtime);
  }

  /**
   * Description: 客户端单产品初始化接口
   * Summary: 客户端单产品初始化
   */
  async initAntchainEkycSingleZimEx(request: InitAntchainEkycSingleZimRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<InitAntchainEkycSingleZimResponse> {
    Util.validateModel(request);
    return $tea.cast<InitAntchainEkycSingleZimResponse>(await this.doRequest("1.0", "antchain.ekyc.single.zim.init", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new InitAntchainEkycSingleZimResponse({}));
  }

  /**
   * Description: 客户端单产品认证接口
   * Summary: 客户端单产品认证
   */
  async verifyAntchainEkycSingleZim(request: VerifyAntchainEkycSingleZimRequest): Promise<VerifyAntchainEkycSingleZimResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.verifyAntchainEkycSingleZimEx(request, headers, runtime);
  }

  /**
   * Description: 客户端单产品认证接口
   * Summary: 客户端单产品认证
   */
  async verifyAntchainEkycSingleZimEx(request: VerifyAntchainEkycSingleZimRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<VerifyAntchainEkycSingleZimResponse> {
    Util.validateModel(request);
    return $tea.cast<VerifyAntchainEkycSingleZimResponse>(await this.doRequest("1.0", "antchain.ekyc.single.zim.verify", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new VerifyAntchainEkycSingleZimResponse({}));
  }

  /**
   * Description: 客户端多产品初始化接口
   * Summary: 客户端多产品初始化
   */
  async initAntchainEkycMultiZim(request: InitAntchainEkycMultiZimRequest): Promise<InitAntchainEkycMultiZimResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.initAntchainEkycMultiZimEx(request, headers, runtime);
  }

  /**
   * Description: 客户端多产品初始化接口
   * Summary: 客户端多产品初始化
   */
  async initAntchainEkycMultiZimEx(request: InitAntchainEkycMultiZimRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<InitAntchainEkycMultiZimResponse> {
    Util.validateModel(request);
    return $tea.cast<InitAntchainEkycMultiZimResponse>(await this.doRequest("1.0", "antchain.ekyc.multi.zim.init", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new InitAntchainEkycMultiZimResponse({}));
  }

  /**
   * Description: 客户端多产品认证接口
   * Summary: 客户端多产品认证
   */
  async verifyAntchainEkycMultiZim(request: VerifyAntchainEkycMultiZimRequest): Promise<VerifyAntchainEkycMultiZimResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.verifyAntchainEkycMultiZimEx(request, headers, runtime);
  }

  /**
   * Description: 客户端多产品认证接口
   * Summary: 客户端多产品认证
   */
  async verifyAntchainEkycMultiZimEx(request: VerifyAntchainEkycMultiZimRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<VerifyAntchainEkycMultiZimResponse> {
    Util.validateModel(request);
    return $tea.cast<VerifyAntchainEkycMultiZimResponse>(await this.doRequest("1.0", "antchain.ekyc.multi.zim.verify", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new VerifyAntchainEkycMultiZimResponse({}));
  }

  /**
   * Description: 客户端多产品确认接口
   * Summary: 客户端多产品确认
   */
  async confirmAntchainEkycMultiZim(request: ConfirmAntchainEkycMultiZimRequest): Promise<ConfirmAntchainEkycMultiZimResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.confirmAntchainEkycMultiZimEx(request, headers, runtime);
  }

  /**
   * Description: 客户端多产品确认接口
   * Summary: 客户端多产品确认
   */
  async confirmAntchainEkycMultiZimEx(request: ConfirmAntchainEkycMultiZimRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ConfirmAntchainEkycMultiZimResponse> {
    Util.validateModel(request);
    return $tea.cast<ConfirmAntchainEkycMultiZimResponse>(await this.doRequest("1.0", "antchain.ekyc.multi.zim.confirm", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ConfirmAntchainEkycMultiZimResponse({}));
  }

  /**
   * Description: WebEkyc服务端初始化接口
   * Summary: WebEkyc服务端初始化
   */
  async initAntchainEkycVerificationWebsdk(request: InitAntchainEkycVerificationWebsdkRequest): Promise<InitAntchainEkycVerificationWebsdkResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.initAntchainEkycVerificationWebsdkEx(request, headers, runtime);
  }

  /**
   * Description: WebEkyc服务端初始化接口
   * Summary: WebEkyc服务端初始化
   */
  async initAntchainEkycVerificationWebsdkEx(request: InitAntchainEkycVerificationWebsdkRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<InitAntchainEkycVerificationWebsdkResponse> {
    Util.validateModel(request);
    return $tea.cast<InitAntchainEkycVerificationWebsdkResponse>(await this.doRequest("1.0", "antchain.ekyc.verification.websdk.init", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new InitAntchainEkycVerificationWebsdkResponse({}));
  }

  /**
   * Description: NativeEkyc服务端初始化接口
   * Summary: NativeEkyc服务端初始化
   */
  async initAntchainEkycVerificationNative(request: InitAntchainEkycVerificationNativeRequest): Promise<InitAntchainEkycVerificationNativeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.initAntchainEkycVerificationNativeEx(request, headers, runtime);
  }

  /**
   * Description: NativeEkyc服务端初始化接口
   * Summary: NativeEkyc服务端初始化
   */
  async initAntchainEkycVerificationNativeEx(request: InitAntchainEkycVerificationNativeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<InitAntchainEkycVerificationNativeResponse> {
    Util.validateModel(request);
    return $tea.cast<InitAntchainEkycVerificationNativeResponse>(await this.doRequest("1.0", "antchain.ekyc.verification.native.init", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new InitAntchainEkycVerificationNativeResponse({}));
  }

}
