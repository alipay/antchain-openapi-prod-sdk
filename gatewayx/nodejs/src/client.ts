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

// 消息发送结果
export class XMessageResult extends $tea.Model {
  // 消息key
  msgKey: string;
  // 发送方租户
  providerId: string;
  // 接收方租户
  consumerId: string;
  // 发送结果
  status: string;
  // 发送次数（重试次数）
  pushTimes: number;
  // 发送内容
  bizContent: string;
  // 错误码
  errorCode: string;
  // 错误消息
  errorMsg?: string;
  // 发送地址
  targetUrl: string;
  // 消息唯一id
  uniqueId: string;
  static names(): { [key: string]: string } {
    return {
      msgKey: 'msg_key',
      providerId: 'provider_id',
      consumerId: 'consumer_id',
      status: 'status',
      pushTimes: 'push_times',
      bizContent: 'biz_content',
      errorCode: 'error_code',
      errorMsg: 'error_msg',
      targetUrl: 'target_url',
      uniqueId: 'unique_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      msgKey: 'string',
      providerId: 'string',
      consumerId: 'string',
      status: 'string',
      pushTimes: 'number',
      bizContent: 'string',
      errorCode: 'string',
      errorMsg: 'string',
      targetUrl: 'string',
      uniqueId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 消息详情
export class XMessageInfo extends $tea.Model {
  // 消息事件编码
  msgKey: string;
  // 消费方id，例如appId，tenantId
  consumerId: string;
  // 消费者类型，例如TENANT, APP
  consumerType: string;
  // 业务消息内容，json格式
  bizContent: string;
  // 消息发送过程中的唯一ID
  msgId: string;
  static names(): { [key: string]: string } {
    return {
      msgKey: 'msg_key',
      consumerId: 'consumer_id',
      consumerType: 'consumer_type',
      bizContent: 'biz_content',
      msgId: 'msg_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      msgKey: 'string',
      consumerId: 'string',
      consumerType: 'string',
      bizContent: 'string',
      msgId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 键值对
export class XNameValuePair extends $tea.Model {
  // 键名
  name: string;
  // 键值
  value: string;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      value: 'value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      value: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 调用者信息
export class XInvokerInfo extends $tea.Model {
  // 调用渠道
  invokeChannel: string;
  // 渠道的用户id
  invokeChannelUid: string;
  // 8位金融云租户ID
  invokeTenant: string;
  // 调用者用户金融云id
  invokeUserId: string;
  static names(): { [key: string]: string } {
    return {
      invokeChannel: 'invoke_channel',
      invokeChannelUid: 'invoke_channel_uid',
      invokeTenant: 'invoke_tenant',
      invokeUserId: 'invoke_user_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      invokeChannel: 'string',
      invokeChannelUid: 'string',
      invokeTenant: 'string',
      invokeUserId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateBizeventMessageRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 业务消息内容，json格式
  bizContent: string;
  // 日期对应的timestamp
  utcTimestamp: number;
  // 消息发送过程中的唯一ID
  msgId: string;
  // 消息事件编码
  msgKey: string;
  // 消费方id，例如appId，tenantId，可以多个，多个之间使用","分割
  consumerId: string;
  // 消费者类型，例如TENANT, APP
  consumerType: string;
  // 二级消息主题,订阅方可以过滤消息
  tags?: string;
  // 消息类型，1：点对点，2: 广播消息
  msgType: string;
  // 上下文透传的自定义header
  header?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      bizContent: 'biz_content',
      utcTimestamp: 'utc_timestamp',
      msgId: 'msg_id',
      msgKey: 'msg_key',
      consumerId: 'consumer_id',
      consumerType: 'consumer_type',
      tags: 'tags',
      msgType: 'msg_type',
      header: 'header',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      bizContent: 'string',
      utcTimestamp: 'number',
      msgId: 'string',
      msgKey: 'string',
      consumerId: 'string',
      consumerType: 'string',
      tags: 'string',
      msgType: 'string',
      header: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateBizeventMessageResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateFileUploadRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 上传文件作用的openapi method
  apiCode: string;
  // 文件标签，多个标签;分割
  fileLabel?: string;
  // 自定义的文件元数据
  fileMetadata?: string;
  // 文件名，不传则随机生成文件名
  fileName?: string;
  // 文件的多媒体类型
  mimeType?: string;
  // 产品方的api归属集群，即productInstanceId
  apiCluster?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      apiCode: 'api_code',
      fileLabel: 'file_label',
      fileMetadata: 'file_metadata',
      fileName: 'file_name',
      mimeType: 'mime_type',
      apiCluster: 'api_cluster',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      apiCode: 'string',
      fileLabel: 'string',
      fileMetadata: 'string',
      fileName: 'string',
      mimeType: 'string',
      apiCluster: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateFileUploadResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 上传有效期
  expiredTime?: string;
  // 32位文件唯一id
  fileId?: string;
  // 放入http请求头里
  uploadHeaders?: XNameValuePair[];
  // 文件上传地址
  uploadUrl?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      expiredTime: 'expired_time',
      fileId: 'file_id',
      uploadHeaders: 'upload_headers',
      uploadUrl: 'upload_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      expiredTime: 'string',
      fileId: 'string',
      uploadHeaders: { 'type': 'array', 'itemType': XNameValuePair },
      uploadUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetFileDownloadRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 文件唯一id
  fileId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      fileId: 'file_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      fileId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetFileDownloadResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 创建文件使用的apiCode
  apiCode?: string;
  // 文件下载地址
  downloadUrl?: string;
  // 下载超时时间
  expiredTime?: string;
  // 文件标签
  fileLabel?: string;
  // 请求上传时的自定义元数据
  fileMetadata?: string;
  // 文件名
  fileName?: string;
  // 文件路径
  filePath?: string;
  // 文件大小
  fileSize?: number;
  // 上传的调用者信息
  uploadInvoker?: XInvokerInfo;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      apiCode: 'api_code',
      downloadUrl: 'download_url',
      expiredTime: 'expired_time',
      fileLabel: 'file_label',
      fileMetadata: 'file_metadata',
      fileName: 'file_name',
      filePath: 'file_path',
      fileSize: 'file_size',
      uploadInvoker: 'upload_invoker',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      apiCode: 'string',
      downloadUrl: 'string',
      expiredTime: 'string',
      fileLabel: 'string',
      fileMetadata: 'string',
      fileName: 'string',
      filePath: 'string',
      fileSize: 'number',
      uploadInvoker: XInvokerInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMessageFailedRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 消息事件编码
  msgKey: string;
  // 消费方id，例如appId，tenantId 只支持单个传入
  consumerId?: string;
  // 消费者类型，例如TENANT, APP
  consumerType?: string;
  // 每页条数，最大1000条，不传则默认1000条
  pageSize?: number;
  // 第几页，从1开始，不传则默认为1
  pageNum?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      msgKey: 'msg_key',
      consumerId: 'consumer_id',
      consumerType: 'consumer_type',
      pageSize: 'page_size',
      pageNum: 'page_num',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      msgKey: 'string',
      consumerId: 'string',
      consumerType: 'string',
      pageSize: 'number',
      pageNum: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMessageFailedResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 每页条数
  pageSize?: string;
  // 第几页
  pageNum?: string;
  // 总条数
  totalNum?: string;
  // 最终失败的消息列表
  msgList?: XMessageInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      pageSize: 'page_size',
      pageNum: 'page_num',
      totalNum: 'total_num',
      msgList: 'msg_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      pageSize: 'string',
      pageNum: 'string',
      totalNum: 'string',
      msgList: { 'type': 'array', 'itemType': XMessageInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMessageResultRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 消息id
  msgId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      msgId: 'msg_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      msgId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMessageResultResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 消息列表
  messages?: XMessageResult[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      messages: 'messages',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      messages: { 'type': 'array', 'itemType': XMessageResult },
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
          sdk_version: "1.0.13",
          _prod_code: "GATEWAYX",
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
   * Description: 接收业务事件消息，并将相关消息投递给对应的接手方
   * Summary: 事件消息创建
   */
  async createBizeventMessage(request: CreateBizeventMessageRequest): Promise<CreateBizeventMessageResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createBizeventMessageEx(request, headers, runtime);
  }

  /**
   * Description: 接收业务事件消息，并将相关消息投递给对应的接手方
   * Summary: 事件消息创建
   */
  async createBizeventMessageEx(request: CreateBizeventMessageRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateBizeventMessageResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateBizeventMessageResponse>(await this.doRequest("1.0", "antcloud.gatewayx.bizevent.message.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateBizeventMessageResponse({}));
  }

  /**
   * Description: 创建HTTP PUT提交的文件上传
   * Summary: 文件上传创建
   */
  async createFileUpload(request: CreateFileUploadRequest): Promise<CreateFileUploadResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createFileUploadEx(request, headers, runtime);
  }

  /**
   * Description: 创建HTTP PUT提交的文件上传
   * Summary: 文件上传创建
   */
  async createFileUploadEx(request: CreateFileUploadRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateFileUploadResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateFileUploadResponse>(await this.doRequest("1.0", "antcloud.gatewayx.file.upload.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateFileUploadResponse({}));
  }

  /**
   * Description: 创建HTTP GET获取的文件下载
   * Summary: 下载地址获取
   */
  async getFileDownload(request: GetFileDownloadRequest): Promise<GetFileDownloadResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getFileDownloadEx(request, headers, runtime);
  }

  /**
   * Description: 创建HTTP GET获取的文件下载
   * Summary: 下载地址获取
   */
  async getFileDownloadEx(request: GetFileDownloadRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetFileDownloadResponse> {
    Util.validateModel(request);
    return $tea.cast<GetFileDownloadResponse>(await this.doRequest("1.0", "antcloud.gatewayx.file.download.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetFileDownloadResponse({}));
  }

  /**
   * Description: 查询最后一次发送仍然失败的消息，重试成功的消息不回在列表中展示
   * Summary: 查询最后一次发送仍然失败的消息
   */
  async queryMessageFailed(request: QueryMessageFailedRequest): Promise<QueryMessageFailedResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryMessageFailedEx(request, headers, runtime);
  }

  /**
   * Description: 查询最后一次发送仍然失败的消息，重试成功的消息不回在列表中展示
   * Summary: 查询最后一次发送仍然失败的消息
   */
  async queryMessageFailedEx(request: QueryMessageFailedRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryMessageFailedResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryMessageFailedResponse>(await this.doRequest("1.0", "antcloud.gatewayx.message.failed.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryMessageFailedResponse({}));
  }

  /**
   * Description: 消息发送结果查询
   * Summary: 消息发送结果查询
   */
  async queryMessageResult(request: QueryMessageResultRequest): Promise<QueryMessageResultResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryMessageResultEx(request, headers, runtime);
  }

  /**
   * Description: 消息发送结果查询
   * Summary: 消息发送结果查询
   */
  async queryMessageResultEx(request: QueryMessageResultRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryMessageResultResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryMessageResultResponse>(await this.doRequest("1.0", "antcloud.gatewayx.message.result.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryMessageResultResponse({}));
  }

}
