// This file is auto-generated, don't edit it
import AlipayUtil from '@antchain/alipay-util';
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
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDiRealpersonFacevrfServerRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 实人认证唯一标识
  certifyId?: string;
  // 预留扩展业务参数
  externParam?: string;
  // 认证材料（如人脸图像）的哈希
  materialHash?: string;
  // 外部唯一标识。用于定位。
  // 值为32位长度的字母数字组合前面几位字符是商户自定义的简称，中间可以使用一段时间，后段可以使用一个随机或递增序列
  outerOrderNo?: string;
  // 场景ID
  sceneId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      certifyId: 'certify_id',
      externParam: 'extern_param',
      materialHash: 'material_hash',
      outerOrderNo: 'outer_order_no',
      sceneId: 'scene_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      certifyId: 'string',
      externParam: 'string',
      materialHash: 'string',
      outerOrderNo: 'string',
      sceneId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDiRealpersonFacevrfServerResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 认证的主体信息，一般的认证场景返回为空
  identityInfo?: string;
  // 认证主体附件信息，一般的认证场景都是返回空
  materialInfo?: string;
  // 认证材料哈希是否匹配
  materialMatched?: string;
  // 是否通过，通过为T，不通过为F
  passed?: string;
  // 业务失败原因
  reason?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      identityInfo: 'identity_info',
      materialInfo: 'material_info',
      materialMatched: 'material_matched',
      passed: 'passed',
      reason: 'reason',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      identityInfo: 'string',
      materialInfo: 'string',
      materialMatched: 'string',
      passed: 'string',
      reason: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateDiRealpersonFacevrfServerRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 认证模式码
  bizCode?: string;
  // h5认证完成后，服务端回调此地址通知商户认证结果
  callbackUrl?: string;
  // 真实姓名
  certName?: string;
  // 证件号码
  certNo?: string;
  // 证件类型，如身份证
  certType?: string;
  // 预留扩展参数
  externParam?: string;
  // 自定义比对源人脸图像，base64编码格式
  facialPictureRef?: string;
  // 身份信息来源类型，如证件
  identityType?: string;
  // metainfo 环境参数，需要通过客户端 SDK 获取
  metaInfo?: string;
  // 外部唯一标识。用于定位。
  // 值为32位长度的字母数字组合前面几位字符是商户自定义的简称，中间可以使用一段时间，后段可以使用一个随机或递增序列
  outerOrderNo?: string;
  // 回跳地址
  returnUrl?: string;
  // 场景ID
  sceneId?: string;
  // 商户自定义的用户ID
  userId?: string;
  // 用户的IP
  userIp?: string;
  // 用户的手机号
  userMobile?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      bizCode: 'biz_code',
      callbackUrl: 'callback_url',
      certName: 'cert_name',
      certNo: 'cert_no',
      certType: 'cert_type',
      externParam: 'extern_param',
      facialPictureRef: 'facial_picture_ref',
      identityType: 'identity_type',
      metaInfo: 'meta_info',
      outerOrderNo: 'outer_order_no',
      returnUrl: 'return_url',
      sceneId: 'scene_id',
      userId: 'user_id',
      userIp: 'user_ip',
      userMobile: 'user_mobile',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      bizCode: 'string',
      callbackUrl: 'string',
      certName: 'string',
      certNo: 'string',
      certType: 'string',
      externParam: 'string',
      facialPictureRef: 'string',
      identityType: 'string',
      metaInfo: 'string',
      outerOrderNo: 'string',
      returnUrl: 'string',
      sceneId: 'string',
      userId: 'string',
      userIp: 'string',
      userMobile: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateDiRealpersonFacevrfServerResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 实人认证唯一标识
  certifyId?: string;
  // 认证地址。只在特定场景返回。
  certifyUrl?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      certifyId: 'certify_id',
      certifyUrl: 'certify_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      certifyId: 'string',
      certifyUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecDiRealpersonFacevrfServerRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 真实姓名
  certName?: string;
  // 证件号码
  certNo?: string;
  // 证件类型，如身份证
  certType?: string;
  // 预留扩展参数
  externParam?: string;
  // 待认证的人脸图像，base64编码格式
  facialPictureAuth?: string;
  // 自定义比对源人脸图像，base64编码格式
  facialPictureRef?: string;
  // 身份信息来源类型，如证件
  identityType?: string;
  // 外部唯一标识。用于定位。 值为32位长度的字母数字组合前面几位字符是商户自定义的简称，中间可以使用一段时间，后段可以使用一个随机或递增序列
  outerOrderNo?: string;
  // 场景ID
  sceneId?: string;
  // 商户自定义的用户ID
  userId?: string;
  // 用户的IP
  userIp?: string;
  // 用户的手机号（或其哈希值）
  userMobile?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      certName: 'cert_name',
      certNo: 'cert_no',
      certType: 'cert_type',
      externParam: 'extern_param',
      facialPictureAuth: 'facial_picture_auth',
      facialPictureRef: 'facial_picture_ref',
      identityType: 'identity_type',
      outerOrderNo: 'outer_order_no',
      sceneId: 'scene_id',
      userId: 'user_id',
      userIp: 'user_ip',
      userMobile: 'user_mobile',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      certName: 'string',
      certNo: 'string',
      certType: 'string',
      externParam: 'string',
      facialPictureAuth: 'string',
      facialPictureRef: 'string',
      identityType: 'string',
      outerOrderNo: 'string',
      sceneId: 'string',
      userId: 'string',
      userIp: 'string',
      userMobile: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecDiRealpersonFacevrfServerResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 认证ID
  certifyId?: string;
  // 是否通过，通过为T，不通过为F
  passed?: string;
  // 业务失败原因
  reason?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      certifyId: 'certify_id',
      passed: 'passed',
      reason: 'reason',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      certifyId: 'string',
      passed: 'string',
      reason: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetDiRealpersonFacevrfEvidenceRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 某次刷脸的certifyId
  certifyId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      certifyId: 'certify_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      certifyId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetDiRealpersonFacevrfEvidenceResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 刷脸的certifyId，原样返回
  certifyId?: string;
  // 统一证据ID，非SUCCESS状态为null，可在控制台中持统一证据ID验证pdf文件的正确性，法院方也可用此统一证据ID在司法链控制台进行核验pdf文件的正确性。
  onchainId?: string;
  // 上链状态，`SUCCESS`表示成功、`INIT`表示正在上链
  onchainStatus?: string;
  // 存证pdf文件内容的base64
  pdfContent?: string;
  // pdf存证是否已经过期，不支持超过6个月的存证获取
  pdfExpired?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      certifyId: 'certify_id',
      onchainId: 'onchain_id',
      onchainStatus: 'onchain_status',
      pdfContent: 'pdf_content',
      pdfExpired: 'pdf_expired',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      certifyId: 'string',
      onchainId: 'string',
      onchainStatus: 'string',
      pdfContent: 'string',
      pdfExpired: 'boolean',
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
    this._readTimeout = config.readTimeout;
    this._connectTimeout = config.connectTimeout;
    this._httpProxy = config.httpProxy;
    this._httpsProxy = config.httpsProxy;
    this._noProxy = config.noProxy;
    this._socks5Proxy = config.socks5Proxy;
    this._socks5NetWork = config.socks5NetWork;
    this._maxIdleConns = config.maxIdleConns;
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
  async doRequest(version: string, action: string, protocol: string, method: string, pathname: string, request: {[key: string]: any}, runtime: $Util.RuntimeOptions): Promise<{[key: string]: any}> {
    let _runtime: { [key: string]: any } = {
      timeouted: "retry",
      readTimeout: Util.defaultNumber(runtime.readTimeout, this._readTimeout),
      connectTimeout: Util.defaultNumber(runtime.connectTimeout, this._connectTimeout),
      httpProxy: Util.defaultString(runtime.httpProxy, this._httpProxy),
      httpsProxy: Util.defaultString(runtime.httpsProxy, this._httpsProxy),
      noProxy: Util.defaultString(runtime.noProxy, this._noProxy),
      maxIdleConns: Util.defaultNumber(runtime.maxIdleConns, this._maxIdleConns),
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
          req_time: AlipayUtil.getTimestamp(),
          req_msg_id: Util.getNonce(),
          access_key: this._accessKeyId,
          charset: "UTF-8",
          baseSdkVersion: "Tea-SDK",
          sdkVersion: "Tea-SDK-20201019",
        };
        if (!Util.empty(this._securityToken)) {
          request_.query["security_token"] = this._securityToken;
        }

        request_.headers = {
          host: this._endpoint,
          'user-agent': this.getUserAgent(),
        };
        let tmp = Util.anyifyMapValue(RPCUtil.query(request));
        request_.body = new $tea.BytesReadable(Util.toFormString(tmp));
        request_.headers["content-type"] = "application/x-www-form-urlencoded";
        let signedParam = {
          ...request_.query,
          ...RPCUtil.query(request),
        };
        request_.query["sign"] = AlipayUtil.getSignature(signedParam, this._accessKeySecret);
        _lastRequest = request_;
        let response_ = await $tea.doAction(request_, _runtime);

        let obj = await Util.readAsJSON(response_.body);
        let res = Util.assertAsMap(obj);
        let resp = Util.assertAsMap(res["response"]);
        if (AlipayUtil.hasError(res)) {
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
   * Get user agent
   * @return user agent
   */
  getUserAgent(): string {
    let userAgent = "TeaClient/1.0.0";
    return Util.getUserAgent(userAgent);
  }

  /**
   * Description: 查询认证的结果和相关信息
   * Summary: 认证查询
   */
  async queryDiRealpersonFacevrfServer(request: QueryDiRealpersonFacevrfServerRequest): Promise<QueryDiRealpersonFacevrfServerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.queryDiRealpersonFacevrfServerEx(request, runtime);
  }

  /**
   * Description: 查询认证的结果和相关信息
   * Summary: 认证查询
   */
  async queryDiRealpersonFacevrfServerEx(request: QueryDiRealpersonFacevrfServerRequest, runtime: $Util.RuntimeOptions): Promise<QueryDiRealpersonFacevrfServerResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDiRealpersonFacevrfServerResponse>(await this.doRequest("1.0", "di.realperson.facevrf.server.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new QueryDiRealpersonFacevrfServerResponse({}));
  }

  /**
   * Description: 服务端认证创建，传入认证信息，获取认证ID（和url）
   * Summary: 认证创建
   */
  async createDiRealpersonFacevrfServer(request: CreateDiRealpersonFacevrfServerRequest): Promise<CreateDiRealpersonFacevrfServerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.createDiRealpersonFacevrfServerEx(request, runtime);
  }

  /**
   * Description: 服务端认证创建，传入认证信息，获取认证ID（和url）
   * Summary: 认证创建
   */
  async createDiRealpersonFacevrfServerEx(request: CreateDiRealpersonFacevrfServerRequest, runtime: $Util.RuntimeOptions): Promise<CreateDiRealpersonFacevrfServerResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateDiRealpersonFacevrfServerResponse>(await this.doRequest("1.0", "di.realperson.facevrf.server.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new CreateDiRealpersonFacevrfServerResponse({}));
  }

  /**
   * Description: 纯服务端比对，直接输入待比对的图片，返回比对结果
   * Summary: 纯服务端比对
   */
  async execDiRealpersonFacevrfServer(request: ExecDiRealpersonFacevrfServerRequest): Promise<ExecDiRealpersonFacevrfServerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.execDiRealpersonFacevrfServerEx(request, runtime);
  }

  /**
   * Description: 纯服务端比对，直接输入待比对的图片，返回比对结果
   * Summary: 纯服务端比对
   */
  async execDiRealpersonFacevrfServerEx(request: ExecDiRealpersonFacevrfServerRequest, runtime: $Util.RuntimeOptions): Promise<ExecDiRealpersonFacevrfServerResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecDiRealpersonFacevrfServerResponse>(await this.doRequest("1.0", "di.realperson.facevrf.server.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new ExecDiRealpersonFacevrfServerResponse({}));
  }

  /**
   * Description: 传入某次刷脸的certifyID，获得刷脸存证的pdf文件和司法脸统一证据ID，这两份数据可以在司法链的控制台中进行核验存证是否被记录在区块链上从而证实其真实可信。
   * Summary: 商户获取司法链上刷脸存证和统一证据ID
   */
  async getDiRealpersonFacevrfEvidence(request: GetDiRealpersonFacevrfEvidenceRequest): Promise<GetDiRealpersonFacevrfEvidenceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.getDiRealpersonFacevrfEvidenceEx(request, runtime);
  }

  /**
   * Description: 传入某次刷脸的certifyID，获得刷脸存证的pdf文件和司法脸统一证据ID，这两份数据可以在司法链的控制台中进行核验存证是否被记录在区块链上从而证实其真实可信。
   * Summary: 商户获取司法链上刷脸存证和统一证据ID
   */
  async getDiRealpersonFacevrfEvidenceEx(request: GetDiRealpersonFacevrfEvidenceRequest, runtime: $Util.RuntimeOptions): Promise<GetDiRealpersonFacevrfEvidenceResponse> {
    Util.validateModel(request);
    return $tea.cast<GetDiRealpersonFacevrfEvidenceResponse>(await this.doRequest("1.0", "di.realperson.facevrf.evidence.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new GetDiRealpersonFacevrfEvidenceResponse({}));
  }

}
