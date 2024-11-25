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

// 子指标结构体
export class SubMetricData extends $tea.Model {
  // 日期
  date: string;
  // 指标类型:OPERATING_INCOME, REPAY_AMOUNT, REPAY_NUMBER, REPAY_USER_NUMBER, REPAY_AVG_AMOUNT, ALI_DST_AMT,OPERATING_COST, GROSS_PROFIT_MARGIN,VOUCHER_CONVERSION, USER_CONVERSION
  type: string;
  // 指标值
  value: string;
  static names(): { [key: string]: string } {
    return {
      date: 'date',
      type: 'type',
      value: 'value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      date: 'string',
      type: 'string',
      value: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 查询数据统计指标结果
export class MetricData extends $tea.Model {
  // 租户指标: OPERATING_INCOME, REPAY_AMOUNT, REPAY_NUMBER, REPAY_USER_NUMBER, REPAY_AVG_AMOUNT, ALI_DST_AMT
  type: string;
  // 指标值
  total: string;
  // 子指标列表
  subList: SubMetricData[];
  static names(): { [key: string]: string } {
    return {
      type: 'type',
      total: 'total',
      subList: 'sub_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      type: 'string',
      total: 'string',
      subList: { 'type': 'array', 'itemType': SubMetricData },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 过程转化指标结果
export class ProcessConversionMetricData extends $tea.Model {
  // 发放数
  send: number;
  // 核销数
  used: number;
  // 核销转化率
  rate: string;
  static names(): { [key: string]: string } {
    return {
      send: 'send',
      used: 'used',
      rate: 'rate',
    };
  }

  static types(): { [key: string]: any } {
    return {
      send: 'number',
      used: 'number',
      rate: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 核销明细月文件
export class BenefitWriteOffMonthFileData extends $tea.Model {
  // 所属月份
  billingMonth: string;
  // AFTS 上传到文件 id
  fileFiledId: string;
  static names(): { [key: string]: string } {
    return {
      billingMonth: 'billing_month',
      fileFiledId: 'file_filed_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      billingMonth: 'string',
      fileFiledId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySupplierMonthwriteofffileRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 云站租户 id
  cloudTenantId: string;
  // 请求唯一id	
  // 
  requestUniqueId?: string;
  // 202408
  billingMonth?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      cloudTenantId: 'cloud_tenant_id',
      requestUniqueId: 'request_unique_id',
      billingMonth: 'billing_month',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      cloudTenantId: 'string',
      requestUniqueId: 'string',
      billingMonth: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySupplierMonthwriteofffileResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 月度核销文件列表
  data?: BenefitWriteOffMonthFileData[];
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
      data: { 'type': 'array', 'itemType': BenefitWriteOffMonthFileData },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySupplierFundamtRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求唯一id	
  // 
  requestUniqueId?: string;
  // 云站供应商 租户 id
  cloudTenantId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      requestUniqueId: 'request_unique_id',
      cloudTenantId: 'cloud_tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      requestUniqueId: 'string',
      cloudTenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySupplierFundamtResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 出资账户
  fundAccount?: string;
  // 核销金额
  writeOffAmount?: number;
  // 供应商被占用总金额，单位分
  totalAmount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      fundAccount: 'fund_account',
      writeOffAmount: 'write_off_amount',
      totalAmount: 'total_amount',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      fundAccount: 'string',
      writeOffAmount: 'number',
      totalAmount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddSupplierPaymentRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 云上租户id 
  cloudTenantId: string;
  // 打款金额，单位分
  paymentAmount: number;
  // 服务商名称 - 即云租户名称，比如南京飞翰
  supplierName: string;
  // 打款日期
  paymentDate: string;
  // 唯一请求id
  requestUniqueId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      cloudTenantId: 'cloud_tenant_id',
      paymentAmount: 'payment_amount',
      supplierName: 'supplier_name',
      paymentDate: 'payment_date',
      requestUniqueId: 'request_unique_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      cloudTenantId: 'string',
      paymentAmount: 'number',
      supplierName: 'string',
      paymentDate: 'string',
      requestUniqueId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddSupplierPaymentResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 添加打款记录成功
  data?: boolean;
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
      data: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryStatisticsBudgetRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户id
  // 
  tenantId: string;
  // 请求唯一id
  requestUniqueId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      requestUniqueId: 'request_unique_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      requestUniqueId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryStatisticsBudgetResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 当前租户总预算金额
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

export class QueryStatisticsMetricsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户id
  tenantId: string;
  // 请求唯一id
  requestUniqueId?: string;
  // 租户指标: OPERATING_INCOME, REPAY_AMOUNT, REPAY_NUMBER, REPAY_USER_NUMBER, REPAY_AVG_AMOUNT, ALI_DST_AMT
  type: string;
  // 查询开始时间: DAY:20240911; MONTH:202409
  startDate: string;
  // 查询结束日期
  endDate: string;
  // 日期单位: DAY,MONTH
  dateUnit: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      requestUniqueId: 'request_unique_id',
      type: 'type',
      startDate: 'start_date',
      endDate: 'end_date',
      dateUnit: 'date_unit',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      requestUniqueId: 'string',
      type: 'string',
      startDate: 'string',
      endDate: 'string',
      dateUnit: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryStatisticsMetricsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 统计指标结果
  data?: MetricData;
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
      data: MetricData,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryStatisticsConversionmetricsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户id
  // 
  tenantId: string;
  // 请求唯一id
  // 
  requestUniqueId?: string;
  // VOUCHER_CONVERSION, USER_CONVERSION
  type: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      requestUniqueId: 'request_unique_id',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      requestUniqueId: 'string',
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryStatisticsConversionmetricsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 统计过程转化指标结果
  data?: ProcessConversionMetricData;
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
      data: ProcessConversionMetricData,
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
          sdk_version: "1.0.12",
          _prod_code: "ASSET",
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
   * Description: 获取核销明细文件
   * Summary: 获取核销明细文件
   */
  async querySupplierMonthwriteofffile(request: QuerySupplierMonthwriteofffileRequest): Promise<QuerySupplierMonthwriteofffileResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.querySupplierMonthwriteofffileEx(request, headers, runtime);
  }

  /**
   * Description: 获取核销明细文件
   * Summary: 获取核销明细文件
   */
  async querySupplierMonthwriteofffileEx(request: QuerySupplierMonthwriteofffileRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QuerySupplierMonthwriteofffileResponse> {
    Util.validateModel(request);
    return $tea.cast<QuerySupplierMonthwriteofffileResponse>(await this.doRequest("1.0", "antdigital.asset.supplier.monthwriteofffile.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QuerySupplierMonthwriteofffileResponse({}));
  }

  /**
   * Description: 供应商资金池金额明细
   * Summary: 供应商资金池金额明细
   */
  async querySupplierFundamt(request: QuerySupplierFundamtRequest): Promise<QuerySupplierFundamtResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.querySupplierFundamtEx(request, headers, runtime);
  }

  /**
   * Description: 供应商资金池金额明细
   * Summary: 供应商资金池金额明细
   */
  async querySupplierFundamtEx(request: QuerySupplierFundamtRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QuerySupplierFundamtResponse> {
    Util.validateModel(request);
    return $tea.cast<QuerySupplierFundamtResponse>(await this.doRequest("1.0", "antdigital.asset.supplier.fundamt.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QuerySupplierFundamtResponse({}));
  }

  /**
   * Description: 用于录入供应商打款金额
   * Summary: 供应商资金打款接口
   */
  async addSupplierPayment(request: AddSupplierPaymentRequest): Promise<AddSupplierPaymentResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.addSupplierPaymentEx(request, headers, runtime);
  }

  /**
   * Description: 用于录入供应商打款金额
   * Summary: 供应商资金打款接口
   */
  async addSupplierPaymentEx(request: AddSupplierPaymentRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AddSupplierPaymentResponse> {
    Util.validateModel(request);
    return $tea.cast<AddSupplierPaymentResponse>(await this.doRequest("1.0", "antdigital.asset.supplier.payment.add", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AddSupplierPaymentResponse({}));
  }

  /**
   * Description: 查询数据统计预算金额
   * Summary: 查询数据统计预算金额
   */
  async queryStatisticsBudget(request: QueryStatisticsBudgetRequest): Promise<QueryStatisticsBudgetResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryStatisticsBudgetEx(request, headers, runtime);
  }

  /**
   * Description: 查询数据统计预算金额
   * Summary: 查询数据统计预算金额
   */
  async queryStatisticsBudgetEx(request: QueryStatisticsBudgetRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryStatisticsBudgetResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryStatisticsBudgetResponse>(await this.doRequest("1.0", "antdigital.asset.statistics.budget.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryStatisticsBudgetResponse({}));
  }

  /**
   * Description: 查询数据统计指标
   * Summary: 查询数据统计指标
   */
  async queryStatisticsMetrics(request: QueryStatisticsMetricsRequest): Promise<QueryStatisticsMetricsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryStatisticsMetricsEx(request, headers, runtime);
  }

  /**
   * Description: 查询数据统计指标
   * Summary: 查询数据统计指标
   */
  async queryStatisticsMetricsEx(request: QueryStatisticsMetricsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryStatisticsMetricsResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryStatisticsMetricsResponse>(await this.doRequest("1.0", "antdigital.asset.statistics.metrics.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryStatisticsMetricsResponse({}));
  }

  /**
   * Description: 查询数据统计过程转化指标
   * Summary: 统计过程转化指标
   */
  async queryStatisticsConversionmetrics(request: QueryStatisticsConversionmetricsRequest): Promise<QueryStatisticsConversionmetricsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryStatisticsConversionmetricsEx(request, headers, runtime);
  }

  /**
   * Description: 查询数据统计过程转化指标
   * Summary: 统计过程转化指标
   */
  async queryStatisticsConversionmetricsEx(request: QueryStatisticsConversionmetricsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryStatisticsConversionmetricsResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryStatisticsConversionmetricsResponse>(await this.doRequest("1.0", "antdigital.asset.statistics.conversionmetrics.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryStatisticsConversionmetricsResponse({}));
  }

}
