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

// 多币种金额
export class MultiCurrencyMoney extends $tea.Model {
  // 金额，以分为单位
  cent: string;
  // 币种编码
  currency: string;
  // 金额，以元为单位，保留2位小数
  amount: string;
  static names(): { [key: string]: string } {
    return {
      cent: 'cent',
      currency: 'currency',
      amount: 'amount',
    };
  }

  static types(): { [key: string]: any } {
    return {
      cent: 'string',
      currency: 'string',
      amount: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 内部投资者报表数据(资产包维度)
export class InvestmentReportByPackageInner extends $tea.Model {
  // 预期收益
  estimatedAnnualized: MultiCurrencyMoney;
  // 实际收益率(Annual Yield)
  actualAnnualizedYield: string;
  // 预期收益率（Expect Yield）
  estimatedAnnualizedYield: string;
  // 毛利吻合率（Gross Profit Conformity）
  matchRate: string;
  // 投资金额（Investment Allocation）
  investmentAmount: MultiCurrencyMoney;
  // 实际收益
  actualAnnualized: MultiCurrencyMoney;
  // 资产抵押率（Collateral Ratio）
  collateralRate: string;
  // 数据日期
  dt: string;
  // 现金流覆盖季度还款金额比例
  cashFlowCoverageQuarterlyRepaymentAmountRatio: string;
  // 现金流
  cashFlow: MultiCurrencyMoney;
  // 抵押物总值
  collateralTotalValue: MultiCurrencyMoney;
  static names(): { [key: string]: string } {
    return {
      estimatedAnnualized: 'estimated_annualized',
      actualAnnualizedYield: 'actual_annualized_yield',
      estimatedAnnualizedYield: 'estimated_annualized_yield',
      matchRate: 'match_rate',
      investmentAmount: 'investment_amount',
      actualAnnualized: 'actual_annualized',
      collateralRate: 'collateral_rate',
      dt: 'dt',
      cashFlowCoverageQuarterlyRepaymentAmountRatio: 'cash_flow_coverage_quarterly_repayment_amount_ratio',
      cashFlow: 'cash_flow',
      collateralTotalValue: 'collateral_total_value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      estimatedAnnualized: MultiCurrencyMoney,
      actualAnnualizedYield: 'string',
      estimatedAnnualizedYield: 'string',
      matchRate: 'string',
      investmentAmount: MultiCurrencyMoney,
      actualAnnualized: MultiCurrencyMoney,
      collateralRate: 'string',
      dt: 'string',
      cashFlowCoverageQuarterlyRepaymentAmountRatio: 'string',
      cashFlow: MultiCurrencyMoney,
      collateralTotalValue: MultiCurrencyMoney,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

//   内部投资者报表数据
export class InvestmentReportInner extends $tea.Model {
  // 预期收益
  // 
  estimatedAnnualized: MultiCurrencyMoney;
  // 实际收益率（Annual Yield）
  // 
  actualAnnualizedYield: string;
  // 预期收益率（Expect Yield）
  estimatedAnnualizedYield: string;
  // 毛利吻合率（Gross Profit Conformity）
  matchRate: string;
  // 投资金额（Investment Allocation）
  investmentAmount: MultiCurrencyMoney;
  // 实际收益
  actualAnnualized: MultiCurrencyMoney;
  // 资产抵押率（Collateral Ratio）
  collateralRate: string;
  // 数据日期
  dt: string;
  // 现金流覆盖季度还款金额比例
  cashFlowCoverageQuarterlyRepaymentAmountRatio: string;
  // 现金流
  cashFlow: MultiCurrencyMoney;
  // 初始资产总值
  initialAssetTotalValue: MultiCurrencyMoney;
  static names(): { [key: string]: string } {
    return {
      estimatedAnnualized: 'estimated_annualized',
      actualAnnualizedYield: 'actual_annualized_yield',
      estimatedAnnualizedYield: 'estimated_annualized_yield',
      matchRate: 'match_rate',
      investmentAmount: 'investment_amount',
      actualAnnualized: 'actual_annualized',
      collateralRate: 'collateral_rate',
      dt: 'dt',
      cashFlowCoverageQuarterlyRepaymentAmountRatio: 'cash_flow_coverage_quarterly_repayment_amount_ratio',
      cashFlow: 'cash_flow',
      initialAssetTotalValue: 'initial_asset_total_value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      estimatedAnnualized: MultiCurrencyMoney,
      actualAnnualizedYield: 'string',
      estimatedAnnualizedYield: 'string',
      matchRate: 'string',
      investmentAmount: MultiCurrencyMoney,
      actualAnnualized: MultiCurrencyMoney,
      collateralRate: 'string',
      dt: 'string',
      cashFlowCoverageQuarterlyRepaymentAmountRatio: 'string',
      cashFlow: MultiCurrencyMoney,
      initialAssetTotalValue: MultiCurrencyMoney,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryPlatformInvestmentreportRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 可信产业资产项目批次id
  projectExternalId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      projectExternalId: 'project_external_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      projectExternalId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryPlatformInvestmentreportResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 内部投资者报表数据
  data?: InvestmentReportInner;
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
      data: InvestmentReportInner,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryPlatformInvestmentreportbypackageRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 可信产业资产项目批次id
  projectExternalId: string;
  // 资产包id
  assetPackageId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      projectExternalId: 'project_external_id',
      assetPackageId: 'asset_package_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      projectExternalId: 'string',
      assetPackageId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryPlatformInvestmentreportbypackageResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 内部投资者报表数据(资产包维度)
  data?: InvestmentReportByPackageInner;
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
      data: InvestmentReportByPackageInner,
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
          sdk_version: "1.0.6",
          _prod_code: "WEBTRWATRADE_INNER",
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
   * Description: 投资者报表查询
   * Summary: 投资者报表查询
   */
  async queryPlatformInvestmentreport(request: QueryPlatformInvestmentreportRequest): Promise<QueryPlatformInvestmentreportResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPlatformInvestmentreportEx(request, headers, runtime);
  }

  /**
   * Description: 投资者报表查询
   * Summary: 投资者报表查询
   */
  async queryPlatformInvestmentreportEx(request: QueryPlatformInvestmentreportRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPlatformInvestmentreportResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPlatformInvestmentreportResponse>(await this.doRequest("1.0", "antdigital.webtrwatradeinner.platform.investmentreport.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPlatformInvestmentreportResponse({}));
  }

  /**
   * Description: 投资者报表查询(资产包维度)
   * Summary: 投资者报表查询(资产包维度)
   */
  async queryPlatformInvestmentreportbypackage(request: QueryPlatformInvestmentreportbypackageRequest): Promise<QueryPlatformInvestmentreportbypackageResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPlatformInvestmentreportbypackageEx(request, headers, runtime);
  }

  /**
   * Description: 投资者报表查询(资产包维度)
   * Summary: 投资者报表查询(资产包维度)
   */
  async queryPlatformInvestmentreportbypackageEx(request: QueryPlatformInvestmentreportbypackageRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPlatformInvestmentreportbypackageResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPlatformInvestmentreportbypackageResponse>(await this.doRequest("1.0", "antdigital.webtrwatradeinner.platform.investmentreportbypackage.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPlatformInvestmentreportbypackageResponse({}));
  }

}
