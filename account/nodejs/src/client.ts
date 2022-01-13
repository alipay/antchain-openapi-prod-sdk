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

// 金额类
export class MultiCurrencyMoneyOpenApi extends $tea.Model {
  // 最小币种单位
  cent: string;
  // 币种
  currencyValue: string;
  static names(): { [key: string]: string } {
    return {
      cent: 'cent',
      currencyValue: 'currency_value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      cent: 'string',
      currencyValue: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 测试
export class TestTv extends $tea.Model {
  // 租户ID
  tenantId: string;
  static names(): { [key: string]: string } {
    return {
      tenantId: 'tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      tenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 充值记录VO
export class ChargeRecordVO extends $tea.Model {
  // 充值凭证号
  voucherNo: string;
  // 外部单据号
  outBizNo: string;
  // 充值时间
  rechargeTime: string;
  // 支付状态（INIT-创建订单/SUCCESS-充值成功/FAIL-充值失败）
  rechargeStatus: string;
  // 金额
  multiCurrencyMoneyOpenApi: MultiCurrencyMoneyOpenApi;
  static names(): { [key: string]: string } {
    return {
      voucherNo: 'voucher_no',
      outBizNo: 'out_biz_no',
      rechargeTime: 'recharge_time',
      rechargeStatus: 'recharge_status',
      multiCurrencyMoneyOpenApi: 'multi_currency_money_open_api',
    };
  }

  static types(): { [key: string]: any } {
    return {
      voucherNo: 'string',
      outBizNo: 'string',
      rechargeTime: 'string',
      rechargeStatus: 'string',
      multiCurrencyMoneyOpenApi: MultiCurrencyMoneyOpenApi,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBalanceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 租户ID
  tenantId: string;
  // 调用系统来源
  source: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      tenantId: 'tenant_id',
      source: 'source',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      tenantId: 'string',
      source: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBalanceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 余额
  balance?: MultiCurrencyMoneyOpenApi;
  // ALIPAY-客资账户 FINANCE-财资账户
  accountType?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      balance: 'balance',
      accountType: 'account_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      balance: MultiCurrencyMoneyOpenApi,
      accountType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ChargeCustomerBalanceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 租户ID
  tenantId: string;
  // 充值金额，单位分
  rechargeAmt: string;
  // 币种
  currencyValue: string;
  // 用户充值后跳转的地址链接，若不填，则默认跳到中台费用中心页面
  returnUrl?: string;
  // 调用系统appName
  source: string;
  // 充值渠道，默认传"01"
  rechargeChannel: string;
  // 外部单据号，用于幂等
  outBizNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      tenantId: 'tenant_id',
      rechargeAmt: 'recharge_amt',
      currencyValue: 'currency_value',
      returnUrl: 'return_url',
      source: 'source',
      rechargeChannel: 'recharge_channel',
      outBizNo: 'out_biz_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      tenantId: 'string',
      rechargeAmt: 'string',
      currencyValue: 'string',
      returnUrl: 'string',
      source: 'string',
      rechargeChannel: 'string',
      outBizNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ChargeCustomerBalanceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 收银台URI
  cashierUrl?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      cashierUrl: 'cashier_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      cashierUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryInfoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 租户ID
  tenantId: string;
  // 调用系统名称
  source: string;
  // 主体信息，不填默认ZL6
  ou?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      tenantId: 'tenant_id',
      source: 'source',
      ou: 'ou',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      tenantId: 'string',
      source: 'string',
      ou: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryInfoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 用户的银行打款卡号
  cardId?: string;
  // 银行户名
  accountName?: string;
  // 开户银行
  bankName?: string;
  // 网点/支行 （客资特有）
  branchBankName?: string;
  // 联行号（客资特有）
  bankLineNumber?: string;
  // 开户地（客资特有）
  bankLocation?: string;
  // ALIPAY-客资账户 FINANCE-财资账户
  accountType?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      cardId: 'card_id',
      accountName: 'account_name',
      bankName: 'bank_name',
      branchBankName: 'branch_bank_name',
      bankLineNumber: 'bank_line_number',
      bankLocation: 'bank_location',
      accountType: 'account_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      cardId: 'string',
      accountName: 'string',
      bankName: 'string',
      branchBankName: 'string',
      bankLineNumber: 'string',
      bankLocation: 'string',
      accountType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCustomerChargeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 租户ID
  tenantId: string;
  // 若有，则返回相应的状态，INIT/SUCCESS/FAIL
  status?: string;
  // 访问的页码数
  pageNo: number;
  // 每页的数量
  pageSize: number;
  // 调用系统来源
  source: string;
  // 1- 按时间升序
  // 2-按时间倒序
  // 不填默认2
  sortType?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      tenantId: 'tenant_id',
      status: 'status',
      pageNo: 'page_no',
      pageSize: 'page_size',
      source: 'source',
      sortType: 'sort_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      tenantId: 'string',
      status: 'string',
      pageNo: 'number',
      pageSize: 'number',
      source: 'string',
      sortType: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCustomerChargeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 充值记录
  result?: ChargeRecordVO[];
  // 总的数量
  totalItems?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      result: 'result',
      totalItems: 'total_items',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      result: { 'type': 'array', 'itemType': ChargeRecordVO },
      totalItems: 'number',
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
          sdk_version: "1.0.9",
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
   * Description: 账户余额查询，根据租户ID判断是否支付宝账号，支付宝账号返回客资户余额，非支付宝账号返回财资户余额
   * Summary: 智能科技客资账户余额查询
   */
  async queryBalance(request: QueryBalanceRequest): Promise<QueryBalanceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryBalanceEx(request, headers, runtime);
  }

  /**
   * Description: 账户余额查询，根据租户ID判断是否支付宝账号，支付宝账号返回客资户余额，非支付宝账号返回财资户余额
   * Summary: 智能科技客资账户余额查询
   */
  async queryBalanceEx(request: QueryBalanceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryBalanceResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBalanceResponse>(await this.doRequest("1.0", "antcloud.account.balance.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryBalanceResponse({}));
  }

  /**
   * Description: 智能科技客资账号收银台充值
   * Summary: 智能科技客资账号收银台充值
   */
  async chargeCustomerBalance(request: ChargeCustomerBalanceRequest): Promise<ChargeCustomerBalanceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.chargeCustomerBalanceEx(request, headers, runtime);
  }

  /**
   * Description: 智能科技客资账号收银台充值
   * Summary: 智能科技客资账号收银台充值
   */
  async chargeCustomerBalanceEx(request: ChargeCustomerBalanceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ChargeCustomerBalanceResponse> {
    Util.validateModel(request);
    return $tea.cast<ChargeCustomerBalanceResponse>(await this.doRequest("1.0", "antcloud.account.customer.balance.charge", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ChargeCustomerBalanceResponse({}));
  }

  /**
   * Description: 根据租户ID判断，支付宝账号返回客资线下打款渠道，非支付宝账号返回财资线下打款渠道，展示的时候只展示非空的字段
   * Summary: 智能科技线下打款渠道查询
   */
  async queryInfo(request: QueryInfoRequest): Promise<QueryInfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryInfoEx(request, headers, runtime);
  }

  /**
   * Description: 根据租户ID判断，支付宝账号返回客资线下打款渠道，非支付宝账号返回财资线下打款渠道，展示的时候只展示非空的字段
   * Summary: 智能科技线下打款渠道查询
   */
  async queryInfoEx(request: QueryInfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryInfoResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryInfoResponse>(await this.doRequest("1.0", "antcloud.account.info.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryInfoResponse({}));
  }

  /**
   * Description: 仅有客资线上充值记录
   * Summary: 智能科技客资账户线上充值记录查询
   */
  async queryCustomerCharge(request: QueryCustomerChargeRequest): Promise<QueryCustomerChargeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryCustomerChargeEx(request, headers, runtime);
  }

  /**
   * Description: 仅有客资线上充值记录
   * Summary: 智能科技客资账户线上充值记录查询
   */
  async queryCustomerChargeEx(request: QueryCustomerChargeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryCustomerChargeResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryCustomerChargeResponse>(await this.doRequest("1.0", "antcloud.account.customer.charge.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryCustomerChargeResponse({}));
  }

}
