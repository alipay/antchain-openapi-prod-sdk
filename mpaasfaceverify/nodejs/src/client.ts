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

export class InitFaceauthRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户请求的唯一标志，该标识作为对账的关键信息，商户要保证其唯一性
  bizId: string;
  // 预留扩展业务参数
  externParam?: string;
  // 用户身份信息
  identityParam: string;
  // metainfo环境参数
  metainfo?: string;
  // 操作类型
  // 
  operationType?: string;
  // 比对源图片
  // 
  refImg?: string;
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
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class InitFaceauthResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 预留扩展结果
  externInfo?: string;
  // 产品结果明细，不影响决策
  resultCodeSub?: string;
  // result_code_sub对应的文案
  // 
  resultMsgSub?: string;
  // 实人认证id
  zimId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      externInfo: 'extern_info',
      resultCodeSub: 'result_code_sub',
      resultMsgSub: 'result_msg_sub',
      zimId: 'zim_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      externInfo: 'string',
      resultCodeSub: 'string',
      resultMsgSub: 'string',
      zimId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryFaceauthRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 业务单据号，用于核对和排查
  bizId: string;
  // 预留扩展业务参数
  externParam?: string;
  // zimId，用于查询认证结果
  zimId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizId: 'biz_id',
      externParam: 'extern_param',
      zimId: 'zim_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizId: 'string',
      externParam: 'string',
      zimId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryFaceauthResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
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
      externInfo: 'string',
      resultCodeSub: 'string',
      resultMsgSub: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class InitFaceplusRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 业务唯一单号
  bizId: string;
  // 身份，需要公钥加密
  identityParam: string;
  // 客户端采集
  metainfo: string;
  // 外部参数
  externParam?: string;
  // 操作类型
  operationType?: string;
  // 比对源图片
  refImg?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizId: 'biz_id',
      identityParam: 'identity_param',
      metainfo: 'metainfo',
      externParam: 'extern_param',
      operationType: 'operation_type',
      refImg: 'ref_img',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizId: 'string',
      identityParam: 'string',
      metainfo: 'string',
      externParam: 'string',
      operationType: 'string',
      refImg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class InitFaceplusResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 认证会话唯一标识
  zimId?: string;
  // 结果码
  resultCodeSub?: string;
  // 结果信息
  // 
  resultMsgSub?: string;
  // 外部参数
  externInfo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      zimId: 'zim_id',
      resultCodeSub: 'result_code_sub',
      resultMsgSub: 'result_msg_sub',
      externInfo: 'extern_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      zimId: 'string',
      resultCodeSub: 'string',
      resultMsgSub: 'string',
      externInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryFaceplusRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 认证会话唯一标识
  zimId: string;
  // 唯一单号
  bizId: string;
  // 外部参数
  // 
  externParam?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      zimId: 'zim_id',
      bizId: 'biz_id',
      externParam: 'extern_param',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      zimId: 'string',
      bizId: 'string',
      externParam: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryFaceplusResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 结果码
  resultCodeSub?: string;
  // 结果信息
  resultMsgSub?: string;
  // 外部参数
  // 
  externInfo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      resultCodeSub: 'result_code_sub',
      resultMsgSub: 'result_msg_sub',
      externInfo: 'extern_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      resultCodeSub: 'string',
      resultMsgSub: 'string',
      externInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryFaceauthFileRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // zoloz认证会话主键
  zimId: string;
  // 预留扩展业务参数
  externParam?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      zimId: 'zim_id',
      externParam: 'extern_param',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      zimId: 'string',
      externParam: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryFaceauthFileResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 预留扩展结果
  externInfo?: string;
  // 结果码
  resultCodeSub?: string;
  // result_code_sub对应的文案
  resultMsgSub?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
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
      externInfo: 'string',
      resultCodeSub: 'string',
      resultMsgSub: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CertifyServermodeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户请求的唯一标志，该标识作为对账的关键信息，商户要保证其唯一性
  bizId: string;
  // 预留扩展业务参数
  externParam: string;
  // 用户身份信息
  identityParam: string;
  // 待认证图片，默认base64格式
  authImg: string;
  // 待认证图片类型，不传默认为base64后的图片，可以扩展Blob/video等类型
  authImgType?: string;
  // 操作类型，operation_type为custom时表示自定义模式，需要用户上传比对源图片
  operationType?: string;
  // 比对源图片
  refImg?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizId: 'biz_id',
      externParam: 'extern_param',
      identityParam: 'identity_param',
      authImg: 'auth_img',
      authImgType: 'auth_img_type',
      operationType: 'operation_type',
      refImg: 'ref_img',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizId: 'string',
      externParam: 'string',
      identityParam: 'string',
      authImg: 'string',
      authImgType: 'string',
      operationType: 'string',
      refImg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CertifyServermodeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
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
      externInfo: 'string',
      resultCodeSub: 'string',
      resultMsgSub: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class InitCertifyrecordRealpersonRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户请求的唯一标志，该标识作为对账的关键信息，商户要保证其唯一性
  bizId: string;
  // 计费规则码
  chargeCode: string;
  // 	
  // 预留扩展业务参数
  externParam?: string;
  // 用户身份信息
  identityParam: string;
  // metainfo环境参数
  metainfo?: string;
  // 操作类型
  operationType?: string;
  // 比对源图片
  refImg?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizId: 'biz_id',
      chargeCode: 'charge_code',
      externParam: 'extern_param',
      identityParam: 'identity_param',
      metainfo: 'metainfo',
      operationType: 'operation_type',
      refImg: 'ref_img',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizId: 'string',
      chargeCode: 'string',
      externParam: 'string',
      identityParam: 'string',
      metainfo: 'string',
      operationType: 'string',
      refImg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class InitCertifyrecordRealpersonResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 预留扩展结果
  externInfo?: string;
  // 产品结果明细，不影响决策
  resultCodeSub?: string;
  // result_code_sub对应的文案
  resultMsgSub?: string;
  // 认证单据号
  certifyId?: string;
  // 认证h5 url
  certifyUrl?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      externInfo: 'extern_info',
      resultCodeSub: 'result_code_sub',
      resultMsgSub: 'result_msg_sub',
      certifyId: 'certify_id',
      certifyUrl: 'certify_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      externInfo: 'string',
      resultCodeSub: 'string',
      resultMsgSub: 'string',
      certifyId: 'string',
      certifyUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class InitCertifyrecordRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户请求的唯一标志，该标识作为对账的关键信息，商户要保证其唯一性
  bizId: string;
  // 计费规则码
  chargeCode: string;
  // 预留扩展业务参数
  externParam?: string;
  // metainfo环境参数
  metainfo?: string;
  // 操作类型
  operationType?: string;
  // 比对源图片
  refImg?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizId: 'biz_id',
      chargeCode: 'charge_code',
      externParam: 'extern_param',
      metainfo: 'metainfo',
      operationType: 'operation_type',
      refImg: 'ref_img',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizId: 'string',
      chargeCode: 'string',
      externParam: 'string',
      metainfo: 'string',
      operationType: 'string',
      refImg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class InitCertifyrecordResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 预留扩展结果
  externInfo?: string;
  // 产品结果明细，不影响决策
  resultCodeSub?: string;
  // result_code_sub对应的文案
  resultMsgSub?: string;
  // 认证单据号
  certifyId?: string;
  // 认证h5 url
  certifyUrl?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      externInfo: 'extern_info',
      resultCodeSub: 'result_code_sub',
      resultMsgSub: 'result_msg_sub',
      certifyId: 'certify_id',
      certifyUrl: 'certify_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      externInfo: 'string',
      resultCodeSub: 'string',
      resultMsgSub: 'string',
      certifyId: 'string',
      certifyUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCertifyrecordRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 预留扩展业务参数
  externParam?: string;
  // certifyId，用于查询认证结果
  certifyId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      externParam: 'extern_param',
      certifyId: 'certify_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      externParam: 'string',
      certifyId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCertifyrecordResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
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
          sdk_version: "1.1.11",
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
   * Description: 调用“实人认证初始化”接口初始化认证服务并得到zimId，zimId用于唯一标识一次认证请求，后续通过zimId可以查询本次实人认证的结果
   * Summary: 实人认证初始化
   */
  async initFaceauth(request: InitFaceauthRequest): Promise<InitFaceauthResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.initFaceauthEx(request, headers, runtime);
  }

  /**
   * Description: 调用“实人认证初始化”接口初始化认证服务并得到zimId，zimId用于唯一标识一次认证请求，后续通过zimId可以查询本次实人认证的结果
   * Summary: 实人认证初始化
   */
  async initFaceauthEx(request: InitFaceauthRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<InitFaceauthResponse> {
    Util.validateModel(request);
    return $tea.cast<InitFaceauthResponse>(await this.doRequest("1.0", "antfin.mpaasfaceverify.faceauth.init", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new InitFaceauthResponse({}));
  }

  /**
   * Description: 调用“实人认证结果查询”接口可以通过zimId查询当次认证的结果
   * Summary: 实人认证查询
   */
  async queryFaceauth(request: QueryFaceauthRequest): Promise<QueryFaceauthResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryFaceauthEx(request, headers, runtime);
  }

  /**
   * Description: 调用“实人认证结果查询”接口可以通过zimId查询当次认证的结果
   * Summary: 实人认证查询
   */
  async queryFaceauthEx(request: QueryFaceauthRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryFaceauthResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryFaceauthResponse>(await this.doRequest("1.0", "antfin.mpaasfaceverify.faceauth.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryFaceauthResponse({}));
  }

  /**
   * Description: 人脸双因子认证服务端初始化
   * Summary: 人脸双因子认证服务端初始化
   */
  async initFaceplus(request: InitFaceplusRequest): Promise<InitFaceplusResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.initFaceplusEx(request, headers, runtime);
  }

  /**
   * Description: 人脸双因子认证服务端初始化
   * Summary: 人脸双因子认证服务端初始化
   */
  async initFaceplusEx(request: InitFaceplusRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<InitFaceplusResponse> {
    Util.validateModel(request);
    return $tea.cast<InitFaceplusResponse>(await this.doRequest("1.0", "antfin.mpaasfaceverify.faceplus.init", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new InitFaceplusResponse({}));
  }

  /**
   * Description: 人脸双因子认证服务端查询
   * Summary: 人脸双因子认证服务端查询
   */
  async queryFaceplus(request: QueryFaceplusRequest): Promise<QueryFaceplusResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryFaceplusEx(request, headers, runtime);
  }

  /**
   * Description: 人脸双因子认证服务端查询
   * Summary: 人脸双因子认证服务端查询
   */
  async queryFaceplusEx(request: QueryFaceplusRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryFaceplusResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryFaceplusResponse>(await this.doRequest("1.0", "antfin.mpaasfaceverify.faceplus.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryFaceplusResponse({}));
  }

  /**
   * Description: zoloz提供具备权限控制的人脸图片获取接口，提供于支付宝会员等上游，控制数据风险
   * Summary: 获取认证资料
   */
  async queryFaceauthFile(request: QueryFaceauthFileRequest): Promise<QueryFaceauthFileResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryFaceauthFileEx(request, headers, runtime);
  }

  /**
   * Description: zoloz提供具备权限控制的人脸图片获取接口，提供于支付宝会员等上游，控制数据风险
   * Summary: 获取认证资料
   */
  async queryFaceauthFileEx(request: QueryFaceauthFileRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryFaceauthFileResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryFaceauthFileResponse>(await this.doRequest("1.0", "antfin.mpaasfaceverify.faceauth.file.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryFaceauthFileResponse({}));
  }

  /**
   * Description: 调用”实人认证核验源服务“接口，可获取权威源的人脸比对结果，认证链路不依赖客户端
   * Summary: 实人认证核验源服务
   */
  async certifyServermode(request: CertifyServermodeRequest): Promise<CertifyServermodeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.certifyServermodeEx(request, headers, runtime);
  }

  /**
   * Description: 调用”实人认证核验源服务“接口，可获取权威源的人脸比对结果，认证链路不依赖客户端
   * Summary: 实人认证核验源服务
   */
  async certifyServermodeEx(request: CertifyServermodeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CertifyServermodeResponse> {
    Util.validateModel(request);
    return $tea.cast<CertifyServermodeResponse>(await this.doRequest("1.0", "antfin.mpaasfaceverify.servermode.certify", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CertifyServermodeResponse({}));
  }

  /**
   * Description: 调用”实人认证单据初始化服务“接口，生成业务认证单据，返回单据号
   * Summary: 实人认证单据初始化服务
   */
  async initCertifyrecordRealperson(request: InitCertifyrecordRealpersonRequest): Promise<InitCertifyrecordRealpersonResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.initCertifyrecordRealpersonEx(request, headers, runtime);
  }

  /**
   * Description: 调用”实人认证单据初始化服务“接口，生成业务认证单据，返回单据号
   * Summary: 实人认证单据初始化服务
   */
  async initCertifyrecordRealpersonEx(request: InitCertifyrecordRealpersonRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<InitCertifyrecordRealpersonResponse> {
    Util.validateModel(request);
    return $tea.cast<InitCertifyrecordRealpersonResponse>(await this.doRequest("1.0", "antfin.mpaasfaceverify.certifyrecord.realperson.init", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new InitCertifyrecordRealpersonResponse({}));
  }

  /**
   * Description: 调用”认证单据初始化服务“接口，生成业务认证单据，返回单据号
   * Summary: 认证单据初始化服务(无身份)
   */
  async initCertifyrecord(request: InitCertifyrecordRequest): Promise<InitCertifyrecordResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.initCertifyrecordEx(request, headers, runtime);
  }

  /**
   * Description: 调用”认证单据初始化服务“接口，生成业务认证单据，返回单据号
   * Summary: 认证单据初始化服务(无身份)
   */
  async initCertifyrecordEx(request: InitCertifyrecordRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<InitCertifyrecordResponse> {
    Util.validateModel(request);
    return $tea.cast<InitCertifyrecordResponse>(await this.doRequest("1.0", "antfin.mpaasfaceverify.certifyrecord.init", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new InitCertifyrecordResponse({}));
  }

  /**
   * Description: 调用“实人认证结果查询(certifyId)”接口可以通过certifyId查询当次认证的结果
   * Summary: 实人认证查询(certifyId)
   */
  async queryCertifyrecord(request: QueryCertifyrecordRequest): Promise<QueryCertifyrecordResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryCertifyrecordEx(request, headers, runtime);
  }

  /**
   * Description: 调用“实人认证结果查询(certifyId)”接口可以通过certifyId查询当次认证的结果
   * Summary: 实人认证查询(certifyId)
   */
  async queryCertifyrecordEx(request: QueryCertifyrecordRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryCertifyrecordResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryCertifyrecordResponse>(await this.doRequest("1.0", "antfin.mpaasfaceverify.certifyrecord.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryCertifyrecordResponse({}));
  }

}
