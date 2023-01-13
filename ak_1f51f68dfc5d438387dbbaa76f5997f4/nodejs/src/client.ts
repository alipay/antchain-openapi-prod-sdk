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

// 上传者信息
export class UploaderInfo extends $tea.Model {
  // 上传者证书hash
  certHash: string;
  // 上传者身份证明
  uploader: string;
  // 上传时间
  uploadTime: number;
  // 经度
  longitude?: string;
  // 纬度
  latitude?: string;
  static names(): { [key: string]: string } {
    return {
      certHash: 'cert_hash',
      uploader: 'uploader',
      uploadTime: 'upload_time',
      longitude: 'longitude',
      latitude: 'latitude',
    };
  }

  static types(): { [key: string]: any } {
    return {
      certHash: 'string',
      uploader: 'string',
      uploadTime: 'number',
      longitude: 'string',
      latitude: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 环节项
export class PhaseItem extends $tea.Model {
  // 标题
  title: string;
  // 类型
  // TEXT: 文本，
  // IMAGE： 图片,
  // VIDEO:  视频,
  // LONGTEXT: 长文本,
  // MAP: 地图,
  // BANNER: 广告位,
  // PDF: pdf文件,
  // CERTIFICATE: 认证信息
  // NESTED： 嵌套类型
  // CUSTOMIZE： 自定义类型
  type: string;
  // 值
  value: string;
  // 扩展信息
  extInfo: string;
  static names(): { [key: string]: string } {
    return {
      title: 'title',
      type: 'type',
      value: 'value',
      extInfo: 'ext_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      title: 'string',
      type: 'string',
      value: 'string',
      extInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 区块信息
export class BlockInfo extends $tea.Model {
  // 块高度
  blockHeight: number;
  // 成块时间戳
  timestamp: number;
  // 交易摘要
  txHash: string;
  static names(): { [key: string]: string } {
    return {
      blockHeight: 'block_height',
      timestamp: 'timestamp',
      txHash: 'tx_hash',
    };
  }

  static types(): { [key: string]: any } {
    return {
      blockHeight: 'number',
      timestamp: 'number',
      txHash: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 用户扫码信息
export class ScanUserInfo extends $tea.Model {
  // 用户昵称
  nick: string;
  // 用户ID
  userId: string;
  // 经度
  longitude: number;
  // 纬度
  latitude: number;
  // 用户来源
  srcType: string;
  // 扫码时间
  scanTime?: number;
  static names(): { [key: string]: string } {
    return {
      nick: 'nick',
      userId: 'user_id',
      longitude: 'longitude',
      latitude: 'latitude',
      srcType: 'src_type',
      scanTime: 'scan_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      nick: 'string',
      userId: 'string',
      longitude: 'number',
      latitude: 'number',
      srcType: 'string',
      scanTime: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 首次扫描信息
export class ScanHeadInfo extends $tea.Model {
  // 扫描时间
  scanTime: number;
  // 扫码次数
  scanCount: number;
  // 扫码地址
  scanAddr: string;
  static names(): { [key: string]: string } {
    return {
      scanTime: 'scan_time',
      scanCount: 'scan_count',
      scanAddr: 'scan_addr',
    };
  }

  static types(): { [key: string]: any } {
    return {
      scanTime: 'number',
      scanCount: 'number',
      scanAddr: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 环节信息
export class PhaseInfo extends $tea.Model {
  // 环节名称
  name: string;
  // 环节项
  items: PhaseItem[];
  // 上传者信息
  uploadInfo: UploaderInfo;
  // 区块信息
  blockInfo: BlockInfo;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      items: 'items',
      uploadInfo: 'upload_info',
      blockInfo: 'block_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      items: { 'type': 'array', 'itemType': PhaseItem },
      uploadInfo: UploaderInfo,
      blockInfo: BlockInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntchainMytcMiniCertRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 溯源码信息
  code: string;
  // 交易哈希
  txHash: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      code: 'code',
      txHash: 'tx_hash',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      code: 'string',
      txHash: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntchainMytcMiniCertResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 区块信息
  blockInfo?: BlockInfo;
  // 上传者信息
  uploadInfo?: UploaderInfo;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      blockInfo: 'block_info',
      uploadInfo: 'upload_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      blockInfo: BlockInfo,
      uploadInfo: UploaderInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntchainMytcMiniCodeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 溯源码
  code: string;
  // 用户信息
  userInfo?: ScanUserInfo;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      code: 'code',
      userInfo: 'user_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      code: 'string',
      userInfo: ScanUserInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntchainMytcMiniCodeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 首次扫描信息
  scanInfo?: ScanHeadInfo;
  // 溯源环节信息列表
  phaseInfos?: PhaseInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      scanInfo: 'scan_info',
      phaseInfos: 'phase_infos',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      scanInfo: ScanHeadInfo,
      phaseInfos: { 'type': 'array', 'itemType': PhaseInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class VerifyAntchainMytcMiniNfcRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 动态秘钥字符串信息
  code: string;
  // NFC UID
  uid?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      code: 'code',
      uid: 'uid',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      code: 'string',
      uid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class VerifyAntchainMytcMiniNfcResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 校验结果
  status?: string;
  // 校验信息
  message?: string;
  // 校验解析溯源码
  code?: string;
  // NFC UID
  uid?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      status: 'status',
      message: 'message',
      code: 'code',
      uid: 'uid',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      status: 'string',
      message: 'string',
      code: 'string',
      uid: 'string',
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
          sdk_version: "1.0.0",
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
   * Description: 溯源证书查询
   * Summary: 溯源证书查询
   */
  async queryAntchainMytcMiniCert(request: QueryAntchainMytcMiniCertRequest): Promise<QueryAntchainMytcMiniCertResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAntchainMytcMiniCertEx(request, headers, runtime);
  }

  /**
   * Description: 溯源证书查询
   * Summary: 溯源证书查询
   */
  async queryAntchainMytcMiniCertEx(request: QueryAntchainMytcMiniCertRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAntchainMytcMiniCertResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAntchainMytcMiniCertResponse>(await this.doRequest("1.0", "antchain.mytc.mini.cert.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAntchainMytcMiniCertResponse({}));
  }

  /**
   * Description: 溯源码详情查询
   * Summary: 溯源码详情查询
   */
  async queryAntchainMytcMiniCode(request: QueryAntchainMytcMiniCodeRequest): Promise<QueryAntchainMytcMiniCodeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAntchainMytcMiniCodeEx(request, headers, runtime);
  }

  /**
   * Description: 溯源码详情查询
   * Summary: 溯源码详情查询
   */
  async queryAntchainMytcMiniCodeEx(request: QueryAntchainMytcMiniCodeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAntchainMytcMiniCodeResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAntchainMytcMiniCodeResponse>(await this.doRequest("1.0", "antchain.mytc.mini.code.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAntchainMytcMiniCodeResponse({}));
  }

  /**
   * Description: 动态秘钥NFC二维码校验
   * Summary: 动态秘钥NFC二维码校验
   */
  async verifyAntchainMytcMiniNfc(request: VerifyAntchainMytcMiniNfcRequest): Promise<VerifyAntchainMytcMiniNfcResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.verifyAntchainMytcMiniNfcEx(request, headers, runtime);
  }

  /**
   * Description: 动态秘钥NFC二维码校验
   * Summary: 动态秘钥NFC二维码校验
   */
  async verifyAntchainMytcMiniNfcEx(request: VerifyAntchainMytcMiniNfcRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<VerifyAntchainMytcMiniNfcResponse> {
    Util.validateModel(request);
    return $tea.cast<VerifyAntchainMytcMiniNfcResponse>(await this.doRequest("1.0", "antchain.mytc.mini.nfc.verify", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new VerifyAntchainMytcMiniNfcResponse({}));
  }

}
