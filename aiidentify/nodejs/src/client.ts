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

// 提交AI鉴定时鉴定点信息
export class IdentifyPointReq extends $tea.Model {
  // 鉴定点名称
  identifyPointName: string;
  // 鉴定点编号
  identifyPointCode: string;
  // 鉴定商品此鉴定点的图片
  identifyPointImg: string;
  static names(): { [key: string]: string } {
    return {
      identifyPointName: 'identify_point_name',
      identifyPointCode: 'identify_point_code',
      identifyPointImg: 'identify_point_img',
    };
  }

  static types(): { [key: string]: any } {
    return {
      identifyPointName: 'string',
      identifyPointCode: 'string',
      identifyPointImg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 鉴定点信息
export class IdentifyPointResp extends $tea.Model {
  // 鉴定点名称
  identifyPointName: string;
  // 鉴定点序号
  order: number;
  // 鉴定点编号
  identifyPointCode: string;
  // 标签图片oss链接
  labelImg: string;
  // 示例图片oss链接
  exampleImg: string;
  // 是否必传鉴定点
  isRequired: boolean;
  static names(): { [key: string]: string } {
    return {
      identifyPointName: 'identify_point_name',
      order: 'order',
      identifyPointCode: 'identify_point_code',
      labelImg: 'label_img',
      exampleImg: 'example_img',
      isRequired: 'is_required',
    };
  }

  static types(): { [key: string]: any } {
    return {
      identifyPointName: 'string',
      order: 'number',
      identifyPointCode: 'string',
      labelImg: 'string',
      exampleImg: 'string',
      isRequired: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 鉴定点结果
export class IdentifyPointResultResp extends $tea.Model {
  // 234
  identifyPointName: string;
  // 鉴定点唯一编号
  identifyPointCode: string;
  // 鉴定点图片
  identifyPointImg: string;
  // 鉴定点的鉴定结果
  // SUCCESS：符合鉴定标准
  // FAILED：不符合鉴定标准
  // NOT_IDENTIFY：无法鉴定
  identifyPointResult: string;
  static names(): { [key: string]: string } {
    return {
      identifyPointName: 'identify_point_name',
      identifyPointCode: 'identify_point_code',
      identifyPointImg: 'identify_point_img',
      identifyPointResult: 'identify_point_result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      identifyPointName: 'string',
      identifyPointCode: 'string',
      identifyPointImg: 'string',
      identifyPointResult: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryIdentifypointRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 品类名称
  categoryName: string;
  // 品牌名称
  brandName: string;
  // 款式名称
  styleName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      categoryName: 'category_name',
      brandName: 'brand_name',
      styleName: 'style_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      categoryName: 'string',
      brandName: 'string',
      styleName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryIdentifypointResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 品类名称
  categoryName?: string;
  // 品牌名称
  brandName?: string;
  // 款式名称
  styleName?: string;
  // 款式编号
  styleCode?: string;
  // 至少上传鉴定点数量
  atLeastNum?: number;
  // 鉴定点信息列表
  identifyPointList?: IdentifyPointResp[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      categoryName: 'category_name',
      brandName: 'brand_name',
      styleName: 'style_name',
      styleCode: 'style_code',
      atLeastNum: 'at_least_num',
      identifyPointList: 'identify_point_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      categoryName: 'string',
      brandName: 'string',
      styleName: 'string',
      styleCode: 'string',
      atLeastNum: 'number',
      identifyPointList: { 'type': 'array', 'itemType': IdentifyPointResp },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OperateIdentifyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 品类名称
  categoryName: string;
  // 品牌名称
  brandName: string;
  // 款式名称
  styleName: string;
  // 款式编号
  styleCode?: string;
  // 鉴定点信息列表
  identifyPointList?: IdentifyPointReq[];
  // 鉴定点图片列表，当不能提供完整鉴定点信息列表时，可根据鉴定点查询接口出参中order字段将图片直接放入列表中
  identifyPointImgList?: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      categoryName: 'category_name',
      brandName: 'brand_name',
      styleName: 'style_name',
      styleCode: 'style_code',
      identifyPointList: 'identify_point_list',
      identifyPointImgList: 'identify_point_img_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      categoryName: 'string',
      brandName: 'string',
      styleName: 'string',
      styleCode: 'string',
      identifyPointList: { 'type': 'array', 'itemType': IdentifyPointReq },
      identifyPointImgList: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OperateIdentifyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 鉴定单编号
  identifyNumber?: string;
  // 品类名称
  categoryName?: string;
  // 品牌名称
  brandName?: string;
  // 款式名称
  styleName?: string;
  //  整体鉴定结果
  // SUCCESS：符合鉴定标准
  // FAILED：不符合鉴定标准
  // NOT_IDENTIFY：无法鉴定
  identifyResult?: string;
  // 鉴定描述
  identifyDesc?: string;
  // 鉴定点结果列表
  identifyPointResultList?: IdentifyPointResultResp[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      identifyNumber: 'identify_number',
      categoryName: 'category_name',
      brandName: 'brand_name',
      styleName: 'style_name',
      identifyResult: 'identify_result',
      identifyDesc: 'identify_desc',
      identifyPointResultList: 'identify_point_result_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      identifyNumber: 'string',
      categoryName: 'string',
      brandName: 'string',
      styleName: 'string',
      identifyResult: 'string',
      identifyDesc: 'string',
      identifyPointResultList: { 'type': 'array', 'itemType': IdentifyPointResultResp },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OperateFileuploadGetsignedurlRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OperateFileuploadGetsignedurlResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 文件ID(用于 提交数据进行AI鉴定 时图片对应的属性值)
  fileId?: string;
  // oss上传文件链接
  ossUrl?: string;
  // oss上传文件时的ossKey值 
  ossKey?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      fileId: 'file_id',
      ossUrl: 'oss_url',
      ossKey: 'oss_key',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      fileId: 'string',
      ossUrl: 'string',
      ossKey: 'string',
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
          sdk_version: "1.0.4",
          _prod_code: "AIIDENTIFY",
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
   * Description: 查询AI鉴定点
   * Summary: 查询AI鉴定点
   */
  async queryIdentifypoint(request: QueryIdentifypointRequest): Promise<QueryIdentifypointResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryIdentifypointEx(request, headers, runtime);
  }

  /**
   * Description: 查询AI鉴定点
   * Summary: 查询AI鉴定点
   */
  async queryIdentifypointEx(request: QueryIdentifypointRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryIdentifypointResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryIdentifypointResponse>(await this.doRequest("1.0", "antchain.aiidentify.identifypoint.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryIdentifypointResponse({}));
  }

  /**
   * Description: 提交数据进行AI鉴定
   * Summary: 提交数据进行AI鉴定
   */
  async operateIdentify(request: OperateIdentifyRequest): Promise<OperateIdentifyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.operateIdentifyEx(request, headers, runtime);
  }

  /**
   * Description: 提交数据进行AI鉴定
   * Summary: 提交数据进行AI鉴定
   */
  async operateIdentifyEx(request: OperateIdentifyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<OperateIdentifyResponse> {
    Util.validateModel(request);
    return $tea.cast<OperateIdentifyResponse>(await this.doRequest("1.0", "antchain.aiidentify.identify.operate", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new OperateIdentifyResponse({}));
  }

  /**
   * Description: 获取oss文件上传签名URL，可通过此url跟oss交互上传文件
   * Summary: 获取oss文件上传签名URL
   */
  async operateFileuploadGetsignedurl(request: OperateFileuploadGetsignedurlRequest): Promise<OperateFileuploadGetsignedurlResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.operateFileuploadGetsignedurlEx(request, headers, runtime);
  }

  /**
   * Description: 获取oss文件上传签名URL，可通过此url跟oss交互上传文件
   * Summary: 获取oss文件上传签名URL
   */
  async operateFileuploadGetsignedurlEx(request: OperateFileuploadGetsignedurlRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<OperateFileuploadGetsignedurlResponse> {
    Util.validateModel(request);
    return $tea.cast<OperateFileuploadGetsignedurlResponse>(await this.doRequest("1.0", "antchain.aiidentify.fileupload.getsignedurl.operate", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new OperateFileuploadGetsignedurlResponse({}));
  }

}
