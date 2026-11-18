// This file is auto-generated, don't edit it
import AntchainUtil from '@antchain/alipay-util';
import Util, * as $Util from '@alicloud/tea-util';
import RPCUtil from '@alicloud/rpc-util';
import * as $tea from '@alicloud/tea-typescript';

/**
 * @remarks
 * Model for initing client
 */
export class Config extends $tea.Model {
  /**
   * @remarks
   * accesskey id
   */
  accessKeyId?: string;
  /**
   * @remarks
   * accesskey secret
   */
  accessKeySecret?: string;
  /**
   * @remarks
   * security token
   */
  securityToken?: string;
  /**
   * @remarks
   * http protocol
   * 
   * @example
   * http
   */
  protocol?: string;
  /**
   * @remarks
   * read timeout
   * 
   * @example
   * 10
   */
  readTimeout?: number;
  /**
   * @remarks
   * connect timeout
   * 
   * @example
   * 10
   */
  connectTimeout?: number;
  /**
   * @remarks
   * http proxy
   * 
   * @example
   * http://localhost
   */
  httpProxy?: string;
  /**
   * @remarks
   * https proxy
   * 
   * @example
   * https://localhost
   */
  httpsProxy?: string;
  /**
   * @remarks
   * endpoint
   * 
   * @example
   * cs.aliyuncs.com
   */
  endpoint?: string;
  /**
   * @remarks
   * proxy white list
   * 
   * @example
   * http://localhost
   */
  noProxy?: string;
  /**
   * @remarks
   * max idle conns
   * 
   * @example
   * 3
   */
  maxIdleConns?: number;
  /**
   * @remarks
   * user agent
   * 
   * @example
   * Alibabacloud/1
   */
  userAgent?: string;
  /**
   * @remarks
   * socks5 proxy
   */
  socks5Proxy?: string;
  /**
   * @remarks
   * socks5 network
   * 
   * @example
   * TCP
   */
  socks5NetWork?: string;
  /**
   * @remarks
   * 长链接最大空闲时长
   */
  maxIdleTimeMillis?: number;
  /**
   * @remarks
   * 长链接最大连接时长
   */
  keepAliveDurationMillis?: number;
  /**
   * @remarks
   * 最大连接数（长链接最大总数）
   */
  maxRequests?: number;
  /**
   * @remarks
   * 每个目标主机的最大连接数（分主机域名的长链接最大总数
   */
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

export class ImportTaskBatchRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 批次号
  batchNo: string;
  // 导入名单列表
  list: string[];
  // 任务id
  taskId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      batchNo: 'batch_no',
      list: 'list',
      taskId: 'task_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      batchNo: 'string',
      list: { 'type': 'array', 'itemType': 'string' },
      taskId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportTaskBatchResponse extends $tea.Model {
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

export class ImportTaskRateinfoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 客户号
  cusNo: string;
  // 借据信息
  loanInfoList: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      cusNo: 'cus_no',
      loanInfoList: 'loan_info_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      cusNo: 'string',
      loanInfoList: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportTaskRateinfoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // S:成功,F:失败
  flag?: string;
  // 0:成功,1:失败
  code?: number;
  // 成功or失败
  msg?: string;
  // data
  data?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      flag: 'flag',
      code: 'code',
      msg: 'msg',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      flag: 'string',
      code: 'number',
      msg: 'string',
      data: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCustomerOverdueRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 客户号
  customerAccount: string;
  // 产品类型
  productType: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      customerAccount: 'customer_account',
      productType: 'product_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      customerAccount: 'string',
      productType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCustomerOverdueResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // S:成功,F:失败
  flag?: string;
  // 0:成功,1:失败
  code?: number;
  // 成功or失败
  msg?: string;
  // true : 逾期 false: 不逾期
  data?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      flag: 'flag',
      code: 'code',
      msg: 'msg',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      flag: 'string',
      code: 'number',
      msg: 'string',
      data: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushCustomerLogininfoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 客户号
  custNo: string;
  // 客户行为
  actionInfo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      custNo: 'cust_no',
      actionInfo: 'action_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      custNo: 'string',
      actionInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushCustomerLogininfoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // S:成功,F:失败
  flag?: string;
  // 0:成功,1:失败
  code?: number;
  // 成功or失败
  msg?: string;
  // 结果信息
  data?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      flag: 'flag',
      code: 'code',
      msg: 'msg',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      flag: 'string',
      code: 'number',
      msg: 'string',
      data: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportCommonCustomerRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 批次号
  batchId: string;
  // 导入名单
  list: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      batchId: 'batch_id',
      list: 'list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      batchId: 'string',
      list: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportCommonCustomerResponse extends $tea.Model {
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

export class ImportCustomerRealtimeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 批次幂等键（≤64 字符)
  requestId: string;
  // 挂靠的任务 ID
  taskId: string;
  // 名单行 JSON 数组，每个元素为一名单行 JSON 字符串
  custInfo: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      requestId: 'request_id',
      taskId: 'task_id',
      custInfo: 'cust_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      requestId: 'string',
      taskId: 'string',
      custInfo: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportCustomerRealtimeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 原样回传请求中的 requestId
  requestId?: string;
  // 我方生成的批次流水号，用于对账与追踪
  providerBatchId?: string;
  // 名单行总数（= custInfo 行数）
  totalCount?: number;
  // 受理成功、进入外呼队列的行数
  acceptedCount?: number;
  // 校验未通过被拒绝的行数
  rejectedCount?: number;
  // 受理成功的 serialNo 列表
  acceptedSerialNos?: string[];
  // 被拒绝的 serialNo → 拒绝原因
  rejectedItems?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      requestId: 'request_id',
      providerBatchId: 'provider_batch_id',
      totalCount: 'total_count',
      acceptedCount: 'accepted_count',
      rejectedCount: 'rejected_count',
      acceptedSerialNos: 'accepted_serial_nos',
      rejectedItems: 'rejected_items',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      requestId: 'string',
      providerBatchId: 'string',
      totalCount: 'number',
      acceptedCount: 'number',
      rejectedCount: 'number',
      acceptedSerialNos: { 'type': 'array', 'itemType': 'string' },
      rejectedItems: 'string',
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
   * @remarks
   * Init client with Config
   * 
   * @param config - config contains the necessary information to create a client
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
   * @remarks
   * Encapsulate the request and invoke the network
   * 
   * @param action - api name
   * @param protocol - http or https
   * @param method - e.g. GET
   * @param pathname - pathname of every api
   * @param request - which contains request params
   * @param runtime - which controls some details of call api, such as retry times
   * @returns the response
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
          sdk_version: "2.1.0",
          _prod_code: "RESOLVEAGENT",
          _prod_channel: "default",
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
   * @remarks
   * Description: 贷后催调智能体批量名单导入接口
   * Summary: 贷后催调智能体批量名单导入接口
   */
  async importTaskBatch(request: ImportTaskBatchRequest): Promise<ImportTaskBatchResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.importTaskBatchEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 贷后催调智能体批量名单导入接口
   * Summary: 贷后催调智能体批量名单导入接口
   */
  async importTaskBatchEx(request: ImportTaskBatchRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ImportTaskBatchResponse> {
    Util.validateModel(request);
    return $tea.cast<ImportTaskBatchResponse>(await this.doRequest("1.0", "antdigital.resolveagent.task.batch.import", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ImportTaskBatchResponse({}));
  }

  /**
   * @remarks
   * Description: 贷后对接360利率信息导入
   * Summary: 贷后对接360利率信息导入
   */
  async importTaskRateinfo(request: ImportTaskRateinfoRequest): Promise<ImportTaskRateinfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.importTaskRateinfoEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 贷后对接360利率信息导入
   * Summary: 贷后对接360利率信息导入
   */
  async importTaskRateinfoEx(request: ImportTaskRateinfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ImportTaskRateinfoResponse> {
    Util.validateModel(request);
    return $tea.cast<ImportTaskRateinfoResponse>(await this.doRequest("1.0", "antdigital.resolveagent.task.rateinfo.import", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ImportTaskRateinfoResponse({}));
  }

  /**
   * @remarks
   * Description: 贷后360客户是否逾期查询接口
   * Summary: 贷后360客户是否逾期查询接口
   */
  async queryCustomerOverdue(request: QueryCustomerOverdueRequest): Promise<QueryCustomerOverdueResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryCustomerOverdueEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 贷后360客户是否逾期查询接口
   * Summary: 贷后360客户是否逾期查询接口
   */
  async queryCustomerOverdueEx(request: QueryCustomerOverdueRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryCustomerOverdueResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryCustomerOverdueResponse>(await this.doRequest("1.0", "antdigital.resolveagent.customer.overdue.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryCustomerOverdueResponse({}));
  }

  /**
   * @remarks
   * Description: 360站内信用户信息推送
   * Summary: 360站内信用户信息推送
   */
  async pushCustomerLogininfo(request: PushCustomerLogininfoRequest): Promise<PushCustomerLogininfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pushCustomerLogininfoEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 360站内信用户信息推送
   * Summary: 360站内信用户信息推送
   */
  async pushCustomerLogininfoEx(request: PushCustomerLogininfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PushCustomerLogininfoResponse> {
    Util.validateModel(request);
    return $tea.cast<PushCustomerLogininfoResponse>(await this.doRequest("1.0", "antdigital.resolveagent.customer.logininfo.push", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PushCustomerLogininfoResponse({}));
  }

  /**
   * @remarks
   * Description: 贷后催调通用导入接口
   * Summary: 贷后催调通用导入接口
   */
  async importCommonCustomer(request: ImportCommonCustomerRequest): Promise<ImportCommonCustomerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.importCommonCustomerEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 贷后催调通用导入接口
   * Summary: 贷后催调通用导入接口
   */
  async importCommonCustomerEx(request: ImportCommonCustomerRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ImportCommonCustomerResponse> {
    Util.validateModel(request);
    return $tea.cast<ImportCommonCustomerResponse>(await this.doRequest("1.0", "antdigital.resolveagent.common.customer.import", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ImportCommonCustomerResponse({}));
  }

  /**
   * @remarks
   * Description: 贷后催调实时导入接口
   * Summary: 贷后催调实时导入接口
   */
  async importCustomerRealtime(request: ImportCustomerRealtimeRequest): Promise<ImportCustomerRealtimeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.importCustomerRealtimeEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 贷后催调实时导入接口
   * Summary: 贷后催调实时导入接口
   */
  async importCustomerRealtimeEx(request: ImportCustomerRealtimeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ImportCustomerRealtimeResponse> {
    Util.validateModel(request);
    return $tea.cast<ImportCustomerRealtimeResponse>(await this.doRequest("1.0", "antdigital.resolveagent.customer.realtime.import", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ImportCustomerRealtimeResponse({}));
  }

}
