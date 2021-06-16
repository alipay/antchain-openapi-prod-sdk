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

// nft发行的文件
export class File extends $tea.Model {
  // 文件的可访问路径
  path: string;
  // 文件名称
  name: string;
  // IMAGE("IMAGE","图片"),
  // VIDEO("VIDEO","视频"),
  // ;
  type: string;
  static names(): { [key: string]: string } {
    return {
      path: 'path',
      name: 'name',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      path: 'string',
      name: 'string',
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportNftCreateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 对端自己的项目id；用作幂等字段
  projectId: string;
  // NFT艺术品的名称
  skuName: string;
  // IMAGE("IMAGE","图片"),
  // VIDEO("VIDEO","视频"),
  // ;
  skuType: string;
  // 发行数量
  quantity: number;
  // 是否支持C2C流转：true是可流转，false是不可流转；
  enableC2c: boolean;
  // 艺术品作者
  author: string;
  // 艺术品拥有者
  owner: string;
  // 艺术品创作时间
  createTime: string;
  // 用于标识NFT资产来自特定的产品，用作特殊的交互跳转需求，非必填字段
  bizType?: string;
  // nft简介信息
  description: string;
  // 跳转链接
  jumpUrl?: string;
  // nft发行的艺术品文件
  files: File[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      projectId: 'project_id',
      skuName: 'sku_name',
      skuType: 'sku_type',
      quantity: 'quantity',
      enableC2c: 'enable_c2c',
      author: 'author',
      owner: 'owner',
      createTime: 'create_time',
      bizType: 'biz_type',
      description: 'description',
      jumpUrl: 'jump_url',
      files: 'files',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      projectId: 'string',
      skuName: 'string',
      skuType: 'string',
      quantity: 'number',
      enableC2c: 'boolean',
      author: 'string',
      owner: 'string',
      createTime: 'string',
      bizType: 'string',
      description: 'string',
      jumpUrl: 'string',
      files: { 'type': 'array', 'itemType': File },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportNftCreateResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // NFT发行成功的商品id
  skuId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      skuId: 'sku_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      skuId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryNftCreateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 对端自己的项目id；NFT发行时用作幂等字段
  projectId: string;
  // NFT发行成功的商品id，传入sku_id时以此为准做查询
  skuId?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      projectId: 'project_id',
      skuId: 'sku_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      projectId: 'string',
      skuId: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryNftCreateResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // NFT发行成功的商品id
  skuId?: string;
  // INIT("INIT", "初始化"),
  // PROCESSING("PROCESSING", "资产创建中"),
  // FINISH("FINISH", "资产初始化完毕"),
  // ;
  skuStatus?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      skuId: 'sku_id',
      skuStatus: 'sku_status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      skuId: 'string',
      skuStatus: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecNftTransferRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // NFT发行成功的商品id
  skuId: number;
  // C端用户的支付宝uid
  toIdNo: string;
  // C端用户的支付宝账号类型
  toIdType: string;
  // 用户在商户购买的订单号，用作幂等字段
  orderNo: string;
  // 用户购买订单的时间
  orderTime: string;
  // 用户购买订单的价格，可以为0；用户的购买历史记录会展示
  priceCent?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      skuId: 'sku_id',
      toIdNo: 'to_id_no',
      toIdType: 'to_id_type',
      orderNo: 'order_no',
      orderTime: 'order_time',
      priceCent: 'price_cent',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      skuId: 'number',
      toIdNo: 'string',
      toIdType: 'string',
      orderNo: 'string',
      orderTime: 'string',
      priceCent: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecNftTransferResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // NFT发行成功的商品id
  skuId?: number;
  // NFT发行成功的商品，其中转给C端用户的特定一个token
  nftId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      skuId: 'sku_id',
      nftId: 'nft_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      skuId: 'number',
      nftId: 'string',
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
          sdk_version: "1.0.5",
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
   * Description: B端商户的NFT发行
   * Summary: B端商户的NFT发行
   */
  async importNftCreate(request: ImportNftCreateRequest): Promise<ImportNftCreateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.importNftCreateEx(request, headers, runtime);
  }

  /**
   * Description: B端商户的NFT发行
   * Summary: B端商户的NFT发行
   */
  async importNftCreateEx(request: ImportNftCreateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ImportNftCreateResponse> {
    Util.validateModel(request);
    return $tea.cast<ImportNftCreateResponse>(await this.doRequest("1.0", "antchain.nftx.nft.create.import", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ImportNftCreateResponse({}));
  }

  /**
   * Description: B端商户的NFT发行后查询
   * Summary: B端商户的NFT发行后查询
   */
  async queryNftCreate(request: QueryNftCreateRequest): Promise<QueryNftCreateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryNftCreateEx(request, headers, runtime);
  }

  /**
   * Description: B端商户的NFT发行后查询
   * Summary: B端商户的NFT发行后查询
   */
  async queryNftCreateEx(request: QueryNftCreateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryNftCreateResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryNftCreateResponse>(await this.doRequest("1.0", "antchain.nftx.nft.create.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryNftCreateResponse({}));
  }

  /**
   * Description: 单个token由B端商户转C端用户
   * Summary: 单个token由B端商户转C端用户
   */
  async execNftTransfer(request: ExecNftTransferRequest): Promise<ExecNftTransferResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execNftTransferEx(request, headers, runtime);
  }

  /**
   * Description: 单个token由B端商户转C端用户
   * Summary: 单个token由B端商户转C端用户
   */
  async execNftTransferEx(request: ExecNftTransferRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecNftTransferResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecNftTransferResponse>(await this.doRequest("1.0", "antchain.nftx.nft.transfer.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecNftTransferResponse({}));
  }

}
