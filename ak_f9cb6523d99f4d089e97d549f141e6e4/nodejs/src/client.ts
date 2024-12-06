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

// 返回详情
export class ReturnDetail extends $tea.Model {
  // 结果对象内容
  bizContent: string;
  // 返回形式
  returnType: string;
  // 文件列表
  fileUrls: string[];
  // 文件类型
  fileType: string;
  // 加密模式
  encryptModel: string;
  // 密钥信封
  secretEnvelope: string;
  static names(): { [key: string]: string } {
    return {
      bizContent: 'biz_content',
      returnType: 'return_type',
      fileUrls: 'file_urls',
      fileType: 'file_type',
      encryptModel: 'encrypt_model',
      secretEnvelope: 'secret_envelope',
    };
  }

  static types(): { [key: string]: any } {
    return {
      bizContent: 'string',
      returnType: 'string',
      fileUrls: { 'type': 'array', 'itemType': 'string' },
      fileType: 'string',
      encryptModel: 'string',
      secretEnvelope: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecBlockchainTaxIcmSyncgatheringRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 机构号码
  instCode: string;
  // 请求流水号(必填),调用方保证每次请求号唯一，受理方用来校验唯一性，同一受理号返回请求结果一致
  bizRequestId: string;
  // 纳税人识别号(必填)
  identityId: string;
  // 授权类型(必填)
  authType: string;
  // 订单号
  orderNo: string;
  // 补充内容,如果不动产中字段为空的话查的就是授权中的cityCode
  content: string;
  // 查询类型
  // NORMAL 正常调用
  // BATCH_HAND  批刷
  queryType?: string;
  // 子机构编码，字典由系统预设白名单
  subTenant?: string;
  // 优先级，越大优先级越高
  usePriority?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      instCode: 'inst_code',
      bizRequestId: 'biz_request_id',
      identityId: 'identity_id',
      authType: 'auth_type',
      orderNo: 'order_no',
      content: 'content',
      queryType: 'query_type',
      subTenant: 'sub_tenant',
      usePriority: 'use_priority',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      instCode: 'string',
      bizRequestId: 'string',
      identityId: 'string',
      authType: 'string',
      orderNo: 'string',
      content: 'string',
      queryType: 'string',
      subTenant: 'string',
      usePriority: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecBlockchainTaxIcmSyncgatheringResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回的请求对象jsonString
  bizContent?: string;
  // unix秒时间戳,查询时间，用来对账使用
  queryTime?: string;
  // 返回模式
  returnMode?: string;
  // 返回结果
  returnResult?: ReturnDetail[];
  // 是否查得
  nullDataFlag?: boolean;
  // 参考区块链给出的标准字段定义
  queryType?: string;
  // 是否需要重新授权
  reauth?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      bizContent: 'biz_content',
      queryTime: 'query_time',
      returnMode: 'return_mode',
      returnResult: 'return_result',
      nullDataFlag: 'null_data_flag',
      queryType: 'query_type',
      reauth: 'reauth',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      bizContent: 'string',
      queryTime: 'string',
      returnMode: 'string',
      returnResult: { 'type': 'array', 'itemType': ReturnDetail },
      nullDataFlag: 'boolean',
      queryType: 'string',
      reauth: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RunBlockchainTaxApiDataprocessRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求参数json
  bizParam: string;
  // 产品code
  productCode: string;
  // 调用的方法
  methodCode: string;
  // 租户编码
  instCode?: string;
  // RSA-DESede
  // 代表数字信封：采用 rsa 非对称算法，DESede 对称算法
  algorithm?: string;
  // 是否采用加密算法
  encryption?: boolean;
  // 对称秘钥加密后的数据
  encryptionKey?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizParam: 'biz_param',
      productCode: 'product_code',
      methodCode: 'method_code',
      instCode: 'inst_code',
      algorithm: 'algorithm',
      encryption: 'encryption',
      encryptionKey: 'encryption_key',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizParam: 'string',
      productCode: 'string',
      methodCode: 'string',
      instCode: 'string',
      algorithm: 'string',
      encryption: 'boolean',
      encryptionKey: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RunBlockchainTaxApiDataprocessResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回数据
  data?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
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
          sdk_version: "1.0.0",
          _prod_code: "ak_f9cb6523d99f4d089e97d549f141e6e4",
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
   * Description: 采集，不限制同步 异步
   * Summary: 采集
   */
  async execBlockchainTaxIcmSyncgathering(request: ExecBlockchainTaxIcmSyncgatheringRequest): Promise<ExecBlockchainTaxIcmSyncgatheringResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execBlockchainTaxIcmSyncgatheringEx(request, headers, runtime);
  }

  /**
   * Description: 采集，不限制同步 异步
   * Summary: 采集
   */
  async execBlockchainTaxIcmSyncgatheringEx(request: ExecBlockchainTaxIcmSyncgatheringRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecBlockchainTaxIcmSyncgatheringResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecBlockchainTaxIcmSyncgatheringResponse>(await this.doRequest("1.0", "blockchain.tax.icm.syncgathering.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecBlockchainTaxIcmSyncgatheringResponse({}));
  }

  /**
   * Description: 数据流转通用执行接口
   * Summary: 数据流转通用执行接口
   */
  async runBlockchainTaxApiDataprocess(request: RunBlockchainTaxApiDataprocessRequest): Promise<RunBlockchainTaxApiDataprocessResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.runBlockchainTaxApiDataprocessEx(request, headers, runtime);
  }

  /**
   * Description: 数据流转通用执行接口
   * Summary: 数据流转通用执行接口
   */
  async runBlockchainTaxApiDataprocessEx(request: RunBlockchainTaxApiDataprocessRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RunBlockchainTaxApiDataprocessResponse> {
    Util.validateModel(request);
    return $tea.cast<RunBlockchainTaxApiDataprocessResponse>(await this.doRequest("1.0", "blockchain.tax.api.dataprocess.run", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RunBlockchainTaxApiDataprocessResponse({}));
  }

}
