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

export class ImportProductRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 商业化状态
  businessStatus: string;
  // 是否已上架蚂蚁链官网
  productPutAntOfficial: string;
  // 产品名称
  name: string;
  // 橡实立项code
  xsCode: string;
  // 上线时间
  startTime: string;
  // 产品经理
  pd: string;
  // 产品经理负责人
  pdLeader: string;
  // 产品研发负责人
  devLeader?: string;
  // 产品研发
  dev?: string;
  // 产品描述
  description: string;
  // 操作员
  operator: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      businessStatus: 'business_status',
      productPutAntOfficial: 'product_put_ant_official',
      name: 'name',
      xsCode: 'xs_code',
      startTime: 'start_time',
      pd: 'pd',
      pdLeader: 'pd_leader',
      devLeader: 'dev_leader',
      dev: 'dev',
      description: 'description',
      operator: 'operator',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      businessStatus: 'string',
      productPutAntOfficial: 'string',
      name: 'string',
      xsCode: 'string',
      startTime: 'string',
      pd: 'string',
      pdLeader: 'string',
      devLeader: 'string',
      dev: 'string',
      description: 'string',
      operator: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportProductResponse extends $tea.Model {
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

export class OperateApprovalCallbackRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 审批流Id
  processId: string;
  // 审批状态(PASS\UNPASS\CANCEL)
  auditStatus: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      processId: 'process_id',
      auditStatus: 'audit_status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      processId: 'string',
      auditStatus: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OperateApprovalCallbackResponse extends $tea.Model {
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

export class UpdateProductRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 产品线code
  productCode: string;
  // L1code
  businessLine: string;
  // L2code
  productLine: string;
  // 研发负责人
  devLeader?: string;
  // 研发参与人
  devs?: string;
  // 产品负责人
  pdLeader?: string;
  // 产品参与人
  pds?: string;
  // 财务负责人
  finance?: string;
  // 法务负责人
  legalOwner?: string;
  // 产管
  productAssistant?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      productCode: 'product_code',
      businessLine: 'business_line',
      productLine: 'product_line',
      devLeader: 'dev_leader',
      devs: 'devs',
      pdLeader: 'pd_leader',
      pds: 'pds',
      finance: 'finance',
      legalOwner: 'legal_owner',
      productAssistant: 'product_assistant',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      productCode: 'string',
      businessLine: 'string',
      productLine: 'string',
      devLeader: 'string',
      devs: 'string',
      pdLeader: 'string',
      pds: 'string',
      finance: 'string',
      legalOwner: 'string',
      productAssistant: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateProductResponse extends $tea.Model {
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
          sdk_version: "1.1.2",
          _prod_code: "INTLCOMMONCENTER",
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
   * Description: 外部调用创建l3
   * Summary: 橡实调用创建
   */
  async importProduct(request: ImportProductRequest): Promise<ImportProductResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.importProductEx(request, headers, runtime);
  }

  /**
   * Description: 外部调用创建l3
   * Summary: 橡实调用创建
   */
  async importProductEx(request: ImportProductRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ImportProductResponse> {
    Util.validateModel(request);
    return $tea.cast<ImportProductResponse>(await this.doRequest("1.0", "antchain.intlcommoncenter.product.import", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ImportProductResponse({}));
  }

  /**
   * Description: 国际产商品审批流是通过国内产商品实现的，需要开放OpenApi供国内产商品 审批回调 国际产商品修改审批状态
   * Summary: 审批回调
   */
  async operateApprovalCallback(request: OperateApprovalCallbackRequest): Promise<OperateApprovalCallbackResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.operateApprovalCallbackEx(request, headers, runtime);
  }

  /**
   * Description: 国际产商品审批流是通过国内产商品实现的，需要开放OpenApi供国内产商品 审批回调 国际产商品修改审批状态
   * Summary: 审批回调
   */
  async operateApprovalCallbackEx(request: OperateApprovalCallbackRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<OperateApprovalCallbackResponse> {
    Util.validateModel(request);
    return $tea.cast<OperateApprovalCallbackResponse>(await this.doRequest("1.0", "antchain.intlcommoncenter.approval.callback.operate", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new OperateApprovalCallbackResponse({}));
  }

  /**
   * Description: L3更新同步
   * Summary: L3更新同步
   */
  async updateProduct(request: UpdateProductRequest): Promise<UpdateProductResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateProductEx(request, headers, runtime);
  }

  /**
   * Description: L3更新同步
   * Summary: L3更新同步
   */
  async updateProductEx(request: UpdateProductRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateProductResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateProductResponse>(await this.doRequest("1.0", "antchain.intlcommoncenter.product.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateProductResponse({}));
  }

}
