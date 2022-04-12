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

// 附件上传
export class UploadRequest extends $tea.Model {
  // 文件流/文件地址
  stream: string;
  // 文件名称
  filename: string;
  // 内外工号
  user: string;
  // 附件的关联对象类型
  targetType: string;
  // 附件的关联对象ID
  targetId: number;
  static names(): { [key: string]: string } {
    return {
      stream: 'stream',
      filename: 'filename',
      user: 'user',
      targetType: 'target_type',
      targetId: 'target_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      stream: 'string',
      filename: 'string',
      user: 'string',
      targetType: 'string',
      targetId: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 返回结果
export class ResultMap extends $tea.Model {
  // name
  name: string;
  // value
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

// ACES系统接收的项目信息
export class AcesProject extends $tea.Model {
  // 项目id
  projectId: string;
  // 项目名称
  projectName: string;
  // 客户id
  customerId: string;
  // 客户名称
  customerName: string;
  // 产品线
  projectLine?: string;
  // 业务线
  workLine?: string;
  // 业务分类
  bizType?: string;
  // 项目大阶段
  projectBigStage?: string;
  // 转维状态
  opStatus?: string;
  // 交付阶段
  deliver?: string;
  // 是否售后
  afterSale?: boolean;
  static names(): { [key: string]: string } {
    return {
      projectId: 'project_id',
      projectName: 'project_name',
      customerId: 'customer_id',
      customerName: 'customer_name',
      projectLine: 'project_line',
      workLine: 'work_line',
      bizType: 'biz_type',
      projectBigStage: 'project_big_stage',
      opStatus: 'op_status',
      deliver: 'deliver',
      afterSale: 'after_sale',
    };
  }

  static types(): { [key: string]: any } {
    return {
      projectId: 'string',
      projectName: 'string',
      customerId: 'string',
      customerName: 'string',
      projectLine: 'string',
      workLine: 'string',
      bizType: 'string',
      projectBigStage: 'string',
      opStatus: 'string',
      deliver: 'string',
      afterSale: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 文件集合
export class UploadRequestArray extends $tea.Model {
  // 文件数据
  uploadArray: UploadRequest;
  static names(): { [key: string]: string } {
    return {
      uploadArray: 'upload_array',
    };
  }

  static types(): { [key: string]: any } {
    return {
      uploadArray: UploadRequest,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 返回结构
export class ResultData extends $tea.Model {
  // data
  data: ResultMap;
  static names(): { [key: string]: string } {
    return {
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      data: ResultMap,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 返回值
export class ResultArray extends $tea.Model {
  // 数组
  resultArray: string[];
  static names(): { [key: string]: string } {
    return {
      resultArray: 'result_array',
    };
  }

  static types(): { [key: string]: any } {
    return {
      resultArray: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCustomRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 分页页码
  pageNo: number;
  // 分页长度，最大不超过50
  pageSize: number;
  // 项目id，非必填；可通过项目id查询单个项目
  projectId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      pageNo: 'page_no',
      pageSize: 'page_size',
      projectId: 'project_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      pageNo: 'number',
      pageSize: 'number',
      projectId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCustomResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 调用结果是否成功标识
  success?: boolean;
  // 项目数组
  data?: AcesProject[];
  // 项目总数
  total?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      data: 'data',
      total: 'total',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
      data: { 'type': 'array', 'itemType': AcesProject },
      total: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveAoneRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 产品线
  productLine: string;
  // 产品名称
  productName: string;
  // 问题类型
  issueType: string;
  // 期望日期
  expectedAt?: string;
  // 创建者的工号
  author: string;
  // 解决者/指派者的工号
  assignedTo: string;
  // 标题
  subject: string;
  // 描述
  description: string;
  // 跟踪者的工号
  watcherUsers: string[];
  // 优先级
  priorityId: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productLine: 'product_line',
      productName: 'product_name',
      issueType: 'issue_type',
      expectedAt: 'expected_at',
      author: 'author',
      assignedTo: 'assigned_to',
      subject: 'subject',
      description: 'description',
      watcherUsers: 'watcher_users',
      priorityId: 'priority_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productLine: 'string',
      productName: 'string',
      issueType: 'string',
      expectedAt: 'string',
      author: 'string',
      assignedTo: 'string',
      subject: 'string',
      description: 'string',
      watcherUsers: { 'type': 'array', 'itemType': 'string' },
      priorityId: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveAoneResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回数据
  result?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      result: 'result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      result: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAoneRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 项目id
  id: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      id: 'id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      id: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAoneResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回值
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

export class SaveAoneNeedsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 产品线
  productLine: string;
  // 产品名称
  productName: string;
  // 问题类型
  issueType: string;
  // 期望日期
  expectedAt?: string;
  // 创建者的工号
  author: string;
  // 解决者/指派者的工号
  assignedTo: string;
  // 标题
  subject: string;
  // 描述
  description: string;
  // 跟踪者的工号
  watcherUsers: string[];
  // 优先级
  priorityId: number;
  // 上传文件集合
  uploadlist?: UploadRequestArray;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productLine: 'product_line',
      productName: 'product_name',
      issueType: 'issue_type',
      expectedAt: 'expected_at',
      author: 'author',
      assignedTo: 'assigned_to',
      subject: 'subject',
      description: 'description',
      watcherUsers: 'watcher_users',
      priorityId: 'priority_id',
      uploadlist: 'uploadlist',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productLine: 'string',
      productName: 'string',
      issueType: 'string',
      expectedAt: 'string',
      author: 'string',
      assignedTo: 'string',
      subject: 'string',
      description: 'string',
      watcherUsers: { 'type': 'array', 'itemType': 'string' },
      priorityId: 'number',
      uploadlist: UploadRequestArray,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveAoneNeedsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回数据
  result?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      result: 'result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      result: 'string',
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
          sdk_version: "1.0.18",
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
   * Description: 查询售后中心项目信息
   * Summary: 查询售后中心项目信息
   */
  async queryCustom(request: QueryCustomRequest): Promise<QueryCustomResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryCustomEx(request, headers, runtime);
  }

  /**
   * Description: 查询售后中心项目信息
   * Summary: 查询售后中心项目信息
   */
  async queryCustomEx(request: QueryCustomRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryCustomResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryCustomResponse>(await this.doRequest("1.0", "antcloud.tam.custom.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryCustomResponse({}));
  }

  /**
   * Description: 提交到aone
   * Summary: 提交到aone
   */
  async saveAone(request: SaveAoneRequest): Promise<SaveAoneResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.saveAoneEx(request, headers, runtime);
  }

  /**
   * Description: 提交到aone
   * Summary: 提交到aone
   */
  async saveAoneEx(request: SaveAoneRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SaveAoneResponse> {
    Util.validateModel(request);
    return $tea.cast<SaveAoneResponse>(await this.doRequest("1.0", "antcloud.tam.aone.save", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SaveAoneResponse({}));
  }

  /**
   * Description: 查询aone详情
   * Summary: 查询aone详情
   */
  async queryAone(request: QueryAoneRequest): Promise<QueryAoneResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAoneEx(request, headers, runtime);
  }

  /**
   * Description: 查询aone详情
   * Summary: 查询aone详情
   */
  async queryAoneEx(request: QueryAoneRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAoneResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAoneResponse>(await this.doRequest("1.0", "antcloud.tam.aone.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAoneResponse({}));
  }

  /**
   * Description: 提交客户项目需求
   * Summary: 提交项目需求
   */
  async saveAoneNeeds(request: SaveAoneNeedsRequest): Promise<SaveAoneNeedsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.saveAoneNeedsEx(request, headers, runtime);
  }

  /**
   * Description: 提交客户项目需求
   * Summary: 提交项目需求
   */
  async saveAoneNeedsEx(request: SaveAoneNeedsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SaveAoneNeedsResponse> {
    Util.validateModel(request);
    return $tea.cast<SaveAoneNeedsResponse>(await this.doRequest("1.0", "antcloud.tam.aone.needs.save", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SaveAoneNeedsResponse({}));
  }

}
