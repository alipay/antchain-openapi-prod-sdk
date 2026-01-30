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

export class SyncAntchainAtoFundSplittingRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 资方订单号
  fundNo: string;
  // 商户的订单号
  orderId: string;
  // 商户的数科租户ID
  merchantTenantId: string;
  // 第几期，例如：2表示第二期
  termNum: number;
  // 扣款时间， yyyy-MM-dd HH:mm:ss 格式
  deductionTime: string;
  // 扣款金额，单位精确到分， 例如：12462300为124623.00元
  deductionAmount: number;
  // 商户分账金额，单位精确到分，比如：666601 = 6666.01元
  merchantSplitAmount: number;
  // 资方分账金额，单位精确到分。比如：666610 = 6666.10元
  fundSplitAmount: number;
  // 其他参与方分账信息，JSON格式的数组，样例：
  // [{"participants":"参与方A","amount":666600,"accountNo":"777223","accountType":"ICBC"}]
  otherSplitInfo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      fundNo: 'fund_no',
      orderId: 'order_id',
      merchantTenantId: 'merchant_tenant_id',
      termNum: 'term_num',
      deductionTime: 'deduction_time',
      deductionAmount: 'deduction_amount',
      merchantSplitAmount: 'merchant_split_amount',
      fundSplitAmount: 'fund_split_amount',
      otherSplitInfo: 'other_split_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      fundNo: 'string',
      orderId: 'string',
      merchantTenantId: 'string',
      termNum: 'number',
      deductionTime: 'string',
      deductionAmount: 'number',
      merchantSplitAmount: 'number',
      fundSplitAmount: 'number',
      otherSplitInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncAntchainAtoFundSplittingResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 流水同步描述信息
  responseData?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      responseData: 'response_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      responseData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncAntchainAtoFundOrderfinancialRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单号
  orderId: string;
  // 商户在数科的租户ID
  merchantTenantId: string;
  // 订单融资唯一标识
  applicationId: string;
  // 订单融资状态：1-成功；2-失败
  status: number;
  // 融资结果描述，长度不超过64
  reason?: string;
  // 额外信息
  extras?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      merchantTenantId: 'merchant_tenant_id',
      applicationId: 'application_id',
      status: 'status',
      reason: 'reason',
      extras: 'extras',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      merchantTenantId: 'string',
      applicationId: 'string',
      status: 'number',
      reason: 'string',
      extras: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncAntchainAtoFundOrderfinancialResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 结果描述信息
  responseData?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      responseData: 'response_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      responseData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncAntchainAtoFundWithholdingcontractRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单号
  orderId: string;
  // 商家在数科注册的租户id
  merchantTenantId: string;
  // 代扣协议号
  withholdingContractId: string;
  // json的字符串，存储额外信息
  extraInfo?: string;
  // 签署状态：
  // - ACCEPT : 接受
  // - REFUSE : 拒绝
  // - TIMEOUT : 超时
  status: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      merchantTenantId: 'merchant_tenant_id',
      withholdingContractId: 'withholding_contract_id',
      extraInfo: 'extra_info',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      merchantTenantId: 'string',
      withholdingContractId: 'string',
      extraInfo: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncAntchainAtoFundWithholdingcontractResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 存储成功
  responseData?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      responseData: 'response_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      responseData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncAntchainAtoFundOrderfulfillmentRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 商户id
  merchantTenantId: string;
  // 订单id
  orderId: string;
  // 租期编号
  leaseTermIndex: number;
  // 剩余归还期数
  remainTerm: number;
  // 总期数
  totalTerm: number;
  // 租金归还状态，
  // RETURN_FULL : 足额归还 【终态】
  // NOT_RETURN : 未归还
  // CANCEL : 取消 【终态】
  rentalReturnState: string;
  // 租金归还金额,精确到分，即1234表示12.34元
  rentalMoney: number;
  // 罚息金额，分，1234表示12.34元
  penaltyFeeMoney: number;
  // 总金额，单位分
  totalMoney: number;
  // 归还时间，格式为"2019-07-31 12:00:00"
  returnTime?: string;
  // 归还方式，
  // ANTDIGITAL： 数科代扣
  // FUND : 资方代扣
  // BANK : 银行转账
  // WECHAT : 微信支付
  returnWay?: string;
  // 还款凭证编号
  returnVoucherSerial?: string;
  // 银行名字
  bankName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      merchantTenantId: 'merchant_tenant_id',
      orderId: 'order_id',
      leaseTermIndex: 'lease_term_index',
      remainTerm: 'remain_term',
      totalTerm: 'total_term',
      rentalReturnState: 'rental_return_state',
      rentalMoney: 'rental_money',
      penaltyFeeMoney: 'penalty_fee_money',
      totalMoney: 'total_money',
      returnTime: 'return_time',
      returnWay: 'return_way',
      returnVoucherSerial: 'return_voucher_serial',
      bankName: 'bank_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      merchantTenantId: 'string',
      orderId: 'string',
      leaseTermIndex: 'number',
      remainTerm: 'number',
      totalTerm: 'number',
      rentalReturnState: 'string',
      rentalMoney: 'number',
      penaltyFeeMoney: 'number',
      totalMoney: 'number',
      returnTime: 'string',
      returnWay: 'string',
      returnVoucherSerial: 'string',
      bankName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncAntchainAtoFundOrderfulfillmentResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 添加成功
  responseData?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      responseData: 'response_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      responseData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetAntchainAtoFundOrderfulfillmentRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单id
  orderId: string;
  // 租赁订单所属商家租户id
  merchantTenantId: string;
  // 期数
  // 如果填入，获取term_idx下的履约记录
  // 如果不填入，获取order_id下的所有履约记录
  termIdx?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      merchantTenantId: 'merchant_tenant_id',
      termIdx: 'term_idx',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      merchantTenantId: 'string',
      termIdx: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetAntchainAtoFundOrderfulfillmentResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 订单履约信息的列表数组
  // List<OrderFulfillment> 的jsonArray.toString
  orderFulfillmentDataList?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      orderFulfillmentDataList: 'order_fulfillment_data_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      orderFulfillmentDataList: 'string',
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
          sdk_version: "1.1.1",
          _prod_code: "ak_2abe765c32934341bd9bb6cc1c8ff589",
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
   * Description: 分账流水同步
   * Summary: 【仅测试环境生效】分账流水同步
   */
  async syncAntchainAtoFundSplitting(request: SyncAntchainAtoFundSplittingRequest): Promise<SyncAntchainAtoFundSplittingResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.syncAntchainAtoFundSplittingEx(request, headers, runtime);
  }

  /**
   * Description: 分账流水同步
   * Summary: 【仅测试环境生效】分账流水同步
   */
  async syncAntchainAtoFundSplittingEx(request: SyncAntchainAtoFundSplittingRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SyncAntchainAtoFundSplittingResponse> {
    Util.validateModel(request);
    return $tea.cast<SyncAntchainAtoFundSplittingResponse>(await this.doRequest("1.0", "antchain.ato.fund.splitting.sync", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SyncAntchainAtoFundSplittingResponse({}));
  }

  /**
   * Description: 提供给融资资金方，用以订单融资结果同步
   * Summary: 【废弃】订单融资结果同步
   */
  async syncAntchainAtoFundOrderfinancial(request: SyncAntchainAtoFundOrderfinancialRequest): Promise<SyncAntchainAtoFundOrderfinancialResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.syncAntchainAtoFundOrderfinancialEx(request, headers, runtime);
  }

  /**
   * Description: 提供给融资资金方，用以订单融资结果同步
   * Summary: 【废弃】订单融资结果同步
   */
  async syncAntchainAtoFundOrderfinancialEx(request: SyncAntchainAtoFundOrderfinancialRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SyncAntchainAtoFundOrderfinancialResponse> {
    Util.validateModel(request);
    return $tea.cast<SyncAntchainAtoFundOrderfinancialResponse>(await this.doRequest("1.0", "antchain.ato.fund.orderfinancial.sync", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SyncAntchainAtoFundOrderfinancialResponse({}));
  }

  /**
   * Description: 同步租赁订单的代扣协议
   * Summary: 【仅测试环境生效】同步租赁订单的代扣协议
   */
  async syncAntchainAtoFundWithholdingcontract(request: SyncAntchainAtoFundWithholdingcontractRequest): Promise<SyncAntchainAtoFundWithholdingcontractResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.syncAntchainAtoFundWithholdingcontractEx(request, headers, runtime);
  }

  /**
   * Description: 同步租赁订单的代扣协议
   * Summary: 【仅测试环境生效】同步租赁订单的代扣协议
   */
  async syncAntchainAtoFundWithholdingcontractEx(request: SyncAntchainAtoFundWithholdingcontractRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SyncAntchainAtoFundWithholdingcontractResponse> {
    Util.validateModel(request);
    return $tea.cast<SyncAntchainAtoFundWithholdingcontractResponse>(await this.doRequest("1.0", "antchain.ato.fund.withholdingcontract.sync", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SyncAntchainAtoFundWithholdingcontractResponse({}));
  }

  /**
   * Description: 资方回传一条订单还款履约信息
   * Summary: 【仅测试环境生效】同步订单还款履约信息
   */
  async syncAntchainAtoFundOrderfulfillment(request: SyncAntchainAtoFundOrderfulfillmentRequest): Promise<SyncAntchainAtoFundOrderfulfillmentResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.syncAntchainAtoFundOrderfulfillmentEx(request, headers, runtime);
  }

  /**
   * Description: 资方回传一条订单还款履约信息
   * Summary: 【仅测试环境生效】同步订单还款履约信息
   */
  async syncAntchainAtoFundOrderfulfillmentEx(request: SyncAntchainAtoFundOrderfulfillmentRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SyncAntchainAtoFundOrderfulfillmentResponse> {
    Util.validateModel(request);
    return $tea.cast<SyncAntchainAtoFundOrderfulfillmentResponse>(await this.doRequest("1.0", "antchain.ato.fund.orderfulfillment.sync", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SyncAntchainAtoFundOrderfulfillmentResponse({}));
  }

  /**
   * Description: 获取订单的履约信息
   * Summary: 【仅测试环境生效】获取订单的履约信息
   */
  async getAntchainAtoFundOrderfulfillment(request: GetAntchainAtoFundOrderfulfillmentRequest): Promise<GetAntchainAtoFundOrderfulfillmentResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getAntchainAtoFundOrderfulfillmentEx(request, headers, runtime);
  }

  /**
   * Description: 获取订单的履约信息
   * Summary: 【仅测试环境生效】获取订单的履约信息
   */
  async getAntchainAtoFundOrderfulfillmentEx(request: GetAntchainAtoFundOrderfulfillmentRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetAntchainAtoFundOrderfulfillmentResponse> {
    Util.validateModel(request);
    return $tea.cast<GetAntchainAtoFundOrderfulfillmentResponse>(await this.doRequest("1.0", "antchain.ato.fund.orderfulfillment.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetAntchainAtoFundOrderfulfillmentResponse({}));
  }

}
