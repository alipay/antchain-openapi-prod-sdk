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

// 通用资源差量包信息
export class GeneralResourcePatch extends $tea.Model {
  // 差量包文件下载地址
  url: string;
  // 差量包的旧版本号
  oldVersion: number;
  // md5摘要值
  md5: string;
  // 差量包文件大小
  size: number;
  static names(): { [key: string]: string } {
    return {
      url: 'url',
      oldVersion: 'old_version',
      md5: 'md5',
      size: 'size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      url: 'string',
      oldVersion: 'number',
      md5: 'string',
      size: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PublishMerchantDiyskuRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 业务请求id，用来做业务上的幂等。后面查询状态也是此字段
  bizNo: string;
  // 调用渠道
  // PET 宠物
  // MEMBER 会员
  channel: string;
  // 领取数字藏品的用户ID，支持2088/手机号/1322
  userId: string;
  // 支付宝2088账号：ALIPAY_UID
  // 手机号：PHONE_NO
  // 鲸探1322账号：FANS_UID
  userType: string;
  // 需要发放的SKUID编码
  skuId: string;
  // 一期仅支持图片：IMAGE
  skuType: string;
  // 数字藏品的缩略图地址，可与原图相同也可不同，需要校验长宽比为1:1
  thumbnailUrl: string;
  // 数字藏品的原图地址，需要校验长宽比为1:1
  originalUrl: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizNo: 'biz_no',
      channel: 'channel',
      userId: 'user_id',
      userType: 'user_type',
      skuId: 'sku_id',
      skuType: 'sku_type',
      thumbnailUrl: 'thumbnail_url',
      originalUrl: 'original_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizNo: 'string',
      channel: 'string',
      userId: 'string',
      userType: 'string',
      skuId: 'string',
      skuType: 'string',
      thumbnailUrl: 'string',
      originalUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PublishMerchantDiyskuResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 生成的nftid结果
  nftId?: string;
  // 获得时间
  receiveTime?: string;
  // 发放状态
  // AUDIT_SUBMIT("审核中"),
  // AUDIT_SUCCESS("审核通过"),
  // AUDIT_FAIL("审核未通过"),
  // TRANSFER_UNKNOWN("发放结果未知"),
  // TRANSFER_SUCCESS("发放成功"),
  // TRANSFER_FAILED("发放失败"),
  // SHIELD("屏蔽"),
  // RECYCLE("回收"),
  sendStatus?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      nftId: 'nft_id',
      receiveTime: 'receive_time',
      sendStatus: 'send_status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      nftId: 'string',
      receiveTime: 'string',
      sendStatus: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMerchantDiyskuRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 业务请求id，用来做业务上的幂等
  bizNo: string;
  // 领取数字藏品的用户ID，支持2088/手机号/1322
  userId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizNo: 'biz_no',
      userId: 'user_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizNo: 'string',
      userId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMerchantDiyskuResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 生成的nftid结果
  nftId?: string;
  // 获得时间
  receiveTime?: string;
  // 发放状态
  // AUDIT_SUBMIT("审核中"),
  // AUDIT_SUCCESS("审核通过"),
  // AUDIT_FAIL("审核未通过"),
  // TRANSFER_UNKNOWN("发放结果未知"),
  // TRANSFER_SUCCESS("发放成功"),
  // TRANSFER_FAILED("发放失败"),
  // SHIELD("屏蔽"),
  // RECYCLE("回收"),
  sendStatus?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      nftId: 'nft_id',
      receiveTime: 'receive_time',
      sendStatus: 'send_status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      nftId: 'string',
      receiveTime: 'string',
      sendStatus: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMerchantUgcimagesRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // ugc资产铸造记录id列表
  recordIdList: string[];
  // 场景
  bizScene: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      recordIdList: 'record_id_list',
      bizScene: 'biz_scene',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      recordIdList: { 'type': 'array', 'itemType': 'string' },
      bizScene: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMerchantUgcimagesResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 入参中id对应的图片列表
  imgList?: string[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      imgList: 'img_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      imgList: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateResourceGeneralresourceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 小程序的APP ID
  appId: string;
  // 业务幂等ID
  bizId: string;
  // 是否需要生成差量包
  needPatch: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      appId: 'app_id',
      bizId: 'biz_id',
      needPatch: 'need_patch',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      appId: 'string',
      bizId: 'string',
      needPatch: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateResourceGeneralresourceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 资源ID
  resourceId?: string;
  // 文件上传地址
  url?: string;
  // 资源上传的授权token，上传文件时需要将该值放入header中进行鉴权
  maasToken?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      resourceId: 'resource_id',
      url: 'url',
      maasToken: 'maas_token',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      resourceId: 'string',
      url: 'string',
      maasToken: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BindResourceGeneralresourcefileRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 小程序的APP ID
  appId: string;
  // 资源ID
  resourceId: string;
  // 文件ID
  fileId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      appId: 'app_id',
      resourceId: 'resource_id',
      fileId: 'file_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      appId: 'string',
      resourceId: 'string',
      fileId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BindResourceGeneralresourcefileResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 版本号
  version?: number;
  // 文件下载地址
  url?: string;
  // md5摘要值
  md5?: string;
  // 文件大小
  size?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      version: 'version',
      url: 'url',
      md5: 'md5',
      size: 'size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      version: 'number',
      url: 'string',
      md5: 'string',
      size: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PublishResourceGeneralresourcefileRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 小程序的APP ID
  appId: string;
  // 业务幂等ID
  bizId: string;
  // 资源ID
  resourceId: string;
  // 版本号
  fileVersion: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      appId: 'app_id',
      bizId: 'biz_id',
      resourceId: 'resource_id',
      fileVersion: 'file_version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      appId: 'string',
      bizId: 'string',
      resourceId: 'string',
      fileVersion: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PublishResourceGeneralresourcefileResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 版本号
  version?: number;
  // 资源文件下载地址
  url?: string;
  // md5摘要值
  md5?: string;
  // 文件大小
  size?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      version: 'version',
      url: 'url',
      md5: 'md5',
      size: 'size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      version: 'number',
      url: 'string',
      md5: 'string',
      size: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryResourcePatchlistRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 小程序的APP ID
  appId: string;
  // 资源ID
  resourceId: string;
  // 版本号
  fileVersion: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      appId: 'app_id',
      resourceId: 'resource_id',
      fileVersion: 'file_version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      appId: 'string',
      resourceId: 'string',
      fileVersion: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryResourcePatchlistResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 差量包生成状态，包括PATCHING（生成中）和FINISHED（生成完成）
  patchStatus?: string;
  // 全量包下载地址
  url?: string;
  // 资源ID
  resourceId?: string;
  // 全量包版本号
  version?: number;
  // 全量包md5摘要值
  md5?: string;
  // 全量包文件大小
  size?: number;
  // 差量包文件信息列表
  patchList?: GeneralResourcePatch[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      patchStatus: 'patch_status',
      url: 'url',
      resourceId: 'resource_id',
      version: 'version',
      md5: 'md5',
      size: 'size',
      patchList: 'patch_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      patchStatus: 'string',
      url: 'string',
      resourceId: 'string',
      version: 'number',
      md5: 'string',
      size: 'number',
      patchList: { 'type': 'array', 'itemType': GeneralResourcePatch },
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
          _prod_code: "NFTC",
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
   * Description: DIY藏品发放
   * Summary: DIY藏品发放
   */
  async publishMerchantDiysku(request: PublishMerchantDiyskuRequest): Promise<PublishMerchantDiyskuResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.publishMerchantDiyskuEx(request, headers, runtime);
  }

  /**
   * Description: DIY藏品发放
   * Summary: DIY藏品发放
   */
  async publishMerchantDiyskuEx(request: PublishMerchantDiyskuRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PublishMerchantDiyskuResponse> {
    Util.validateModel(request);
    return $tea.cast<PublishMerchantDiyskuResponse>(await this.doRequest("1.0", "antchain.nftc.merchant.diysku.publish", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PublishMerchantDiyskuResponse({}));
  }

  /**
   * Description: DIY藏品发放查询
   * Summary: DIY藏品发放查询
   */
  async queryMerchantDiysku(request: QueryMerchantDiyskuRequest): Promise<QueryMerchantDiyskuResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryMerchantDiyskuEx(request, headers, runtime);
  }

  /**
   * Description: DIY藏品发放查询
   * Summary: DIY藏品发放查询
   */
  async queryMerchantDiyskuEx(request: QueryMerchantDiyskuRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryMerchantDiyskuResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryMerchantDiyskuResponse>(await this.doRequest("1.0", "antchain.nftc.merchant.diysku.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryMerchantDiyskuResponse({}));
  }

  /**
   * Description: 提供ISV  ugc铸造图片查询的openapi服务
   * Summary: ugc铸造图片查询的openapi接口
   */
  async queryMerchantUgcimages(request: QueryMerchantUgcimagesRequest): Promise<QueryMerchantUgcimagesResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryMerchantUgcimagesEx(request, headers, runtime);
  }

  /**
   * Description: 提供ISV  ugc铸造图片查询的openapi服务
   * Summary: ugc铸造图片查询的openapi接口
   */
  async queryMerchantUgcimagesEx(request: QueryMerchantUgcimagesRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryMerchantUgcimagesResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryMerchantUgcimagesResponse>(await this.doRequest("1.0", "antchain.nftc.merchant.ugcimages.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryMerchantUgcimagesResponse({}));
  }

  /**
   * Description: 创建通用资源
   * Summary: 创建通用资源
   */
  async createResourceGeneralresource(request: CreateResourceGeneralresourceRequest): Promise<CreateResourceGeneralresourceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createResourceGeneralresourceEx(request, headers, runtime);
  }

  /**
   * Description: 创建通用资源
   * Summary: 创建通用资源
   */
  async createResourceGeneralresourceEx(request: CreateResourceGeneralresourceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateResourceGeneralresourceResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateResourceGeneralresourceResponse>(await this.doRequest("1.0", "antchain.nftc.resource.generalresource.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateResourceGeneralresourceResponse({}));
  }

  /**
   * Description: 绑定文件到通用资源ID
   * Summary: 绑定文件到通用资源ID
   */
  async bindResourceGeneralresourcefile(request: BindResourceGeneralresourcefileRequest): Promise<BindResourceGeneralresourcefileResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.bindResourceGeneralresourcefileEx(request, headers, runtime);
  }

  /**
   * Description: 绑定文件到通用资源ID
   * Summary: 绑定文件到通用资源ID
   */
  async bindResourceGeneralresourcefileEx(request: BindResourceGeneralresourcefileRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BindResourceGeneralresourcefileResponse> {
    Util.validateModel(request);
    return $tea.cast<BindResourceGeneralresourcefileResponse>(await this.doRequest("1.0", "antchain.nftc.resource.generalresourcefile.bind", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BindResourceGeneralresourcefileResponse({}));
  }

  /**
   * Description: 发布通用资源文件
   * Summary: 发布通用资源文件
   */
  async publishResourceGeneralresourcefile(request: PublishResourceGeneralresourcefileRequest): Promise<PublishResourceGeneralresourcefileResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.publishResourceGeneralresourcefileEx(request, headers, runtime);
  }

  /**
   * Description: 发布通用资源文件
   * Summary: 发布通用资源文件
   */
  async publishResourceGeneralresourcefileEx(request: PublishResourceGeneralresourcefileRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PublishResourceGeneralresourcefileResponse> {
    Util.validateModel(request);
    return $tea.cast<PublishResourceGeneralresourcefileResponse>(await this.doRequest("1.0", "antchain.nftc.resource.generalresourcefile.publish", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PublishResourceGeneralresourcefileResponse({}));
  }

  /**
   * Description: 查询资源文件差量包列表
   * Summary: 查询资源文件差量包列表
   */
  async queryResourcePatchlist(request: QueryResourcePatchlistRequest): Promise<QueryResourcePatchlistResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryResourcePatchlistEx(request, headers, runtime);
  }

  /**
   * Description: 查询资源文件差量包列表
   * Summary: 查询资源文件差量包列表
   */
  async queryResourcePatchlistEx(request: QueryResourcePatchlistRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryResourcePatchlistResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryResourcePatchlistResponse>(await this.doRequest("1.0", "antchain.nftc.resource.patchlist.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryResourcePatchlistResponse({}));
  }

}
