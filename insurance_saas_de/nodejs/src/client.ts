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

// 货物明细
export class CargoDetail extends $tea.Model {
  // 货物序号
  cargoSequenceNo: string;
  // 货物名称
  cargoName: string;
  // 货物规格
  cargoSpecification: string;
  // 货物数量
  cargoQuantity: string;
  // 货物单价，小数位只支持2位
  cargoUnitPrice: string;
  static names(): { [key: string]: string } {
    return {
      cargoSequenceNo: 'cargo_sequence_no',
      cargoName: 'cargo_name',
      cargoSpecification: 'cargo_specification',
      cargoQuantity: 'cargo_quantity',
      cargoUnitPrice: 'cargo_unit_price',
    };
  }

  static types(): { [key: string]: any } {
    return {
      cargoSequenceNo: 'string',
      cargoName: 'string',
      cargoSpecification: 'string',
      cargoQuantity: 'string',
      cargoUnitPrice: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyInsurglobifyprodOspiinsureRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 调用方生成的唯一编码，系统会根据该流水号做防重、幂等判断逻辑。当极端场景中，系统会返回处理中，错误码为2222，客户端应该保持该流水号不变，并使用原来的请求再次发送请求，系统会根据幂等逻辑返回处理结果；
  tradeNo: string;
  // 保司编码
  externalChannelCode: string;
  // 险种编码
  externalProductCode: string;
  // 保险方案名
  chSchemeName: string;
  // 保险项目名
  chProjectName: string;
  // 总保额，小数位只支持2位
  insuredAmount: string;
  // 保费，小数位只支持2位
  premium: string;
  // 总保费，小数位只支持2位
  totalPremium: string;
  // 币种，使用ISO 4217代码；
  // CNY：人民币
  // USD：美元
  // EUR：欧元
  // GBP：英镑
  // JPY：日元
  // CHF：瑞士法郎
  // SGD：新加坡元
  currency: string;
  // 关联的大保单编号
  bigPolNo: string;
  // 保险起期(ISO 8601格式，2026-01-11T14:30:00+02:00)
  insureStart: string;
  // 时区
  // Asia/Shanghai
  // Europe/Berlin
  // America/New_York
  // Pacific/Auckland
  // Europe/Berlin 
  timezone: string;
  // 投保人名称
  tbrName: string;
  // 投保人证件类型
  // // 个人
  // // 护照
  // PASSPORT
  // // 国民身份证
  // NATIONAL_ID
  // // 居留许可
  // RESIDENCE_PERMIT
  // // 个人税号
  // TAX_ID
  // // 企业
  // // 公司注册号（最常用）
  // COMPANY_REGISTRATION
  // // 增值税号
  // VAT_NUMBER
  // // 企业税号
  // TAX_ID
  tbrIdType: string;
  // 投保人证件号
  tbrIdNo: string;
  // 被保人名称
  bbrName: string;
  // 被保人证件类型
  // // 个人
  // // 护照
  // PASSPORT
  // // 国民身份证
  // NATIONAL_ID
  // // 居留许可
  // RESIDENCE_PERMIT
  // // 个人税号
  // TAX_ID
  // // 企业
  // // 公司注册号（最常用）
  // COMPANY_REGISTRATION
  // // 增值税号
  // VAT_NUMBER
  // // 企业税号
  // TAX_ID
  bbrIdType: string;
  // 被保人证件号
  bbrIdNo: string;
  // 订单号
  relaOrderNo: string;
  // 寄件时间(ISO 8601格式，2026-01-11T14:30:00+02:00)
  pickUpTime: string;
  // 快递公司名称
  courierCompany: string;
  // 快递单号
  courierNumber: string;
  // 货物大类
  cargoType: string;
  // 货物总数量（件）
  cargoTotalQuantity: string;
  // 货物总重量
  cargoTotalWeight: string;
  // 货物总价值，小数位只支持2位
  cargoTotalWorth: string;
  // 卖家脱敏唯一标识
  sellId: string;
  // 卖家NAIC代码
  sellNaicCode: string;
  // 出发地ISO国别
  startPlaceIsoCountry: string;
  // 出发地省市
  startPlaceProvinceCity: string;
  // 出发地详细地址
  startPlace: string;
  // 出发地邮编
  startPlacePostcode: string;
  // 买家脱敏唯一标识
  buyId: string;
  // 目的地ISO国别
  isoCountry: string;
  // 湖南省长沙市
  destinationProvinceCity: string;
  // 目的地详细地址
  destination: string;
  // 货物明细列表
  cargoDetails: CargoDetail[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tradeNo: 'trade_no',
      externalChannelCode: 'external_channel_code',
      externalProductCode: 'external_product_code',
      chSchemeName: 'ch_scheme_name',
      chProjectName: 'ch_project_name',
      insuredAmount: 'insured_amount',
      premium: 'premium',
      totalPremium: 'total_premium',
      currency: 'currency',
      bigPolNo: 'big_pol_no',
      insureStart: 'insure_start',
      timezone: 'timezone',
      tbrName: 'tbr_name',
      tbrIdType: 'tbr_id_type',
      tbrIdNo: 'tbr_id_no',
      bbrName: 'bbr_name',
      bbrIdType: 'bbr_id_type',
      bbrIdNo: 'bbr_id_no',
      relaOrderNo: 'rela_order_no',
      pickUpTime: 'pick_up_time',
      courierCompany: 'courier_company',
      courierNumber: 'courier_number',
      cargoType: 'cargo_type',
      cargoTotalQuantity: 'cargo_total_quantity',
      cargoTotalWeight: 'cargo_total_weight',
      cargoTotalWorth: 'cargo_total_worth',
      sellId: 'sell_id',
      sellNaicCode: 'sell_naic_code',
      startPlaceIsoCountry: 'start_place_iso_country',
      startPlaceProvinceCity: 'start_place_province_city',
      startPlace: 'start_place',
      startPlacePostcode: 'start_place_postcode',
      buyId: 'buy_id',
      isoCountry: 'iso_country',
      destinationProvinceCity: 'destination_province_city',
      destination: 'destination',
      cargoDetails: 'cargo_details',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tradeNo: 'string',
      externalChannelCode: 'string',
      externalProductCode: 'string',
      chSchemeName: 'string',
      chProjectName: 'string',
      insuredAmount: 'string',
      premium: 'string',
      totalPremium: 'string',
      currency: 'string',
      bigPolNo: 'string',
      insureStart: 'string',
      timezone: 'string',
      tbrName: 'string',
      tbrIdType: 'string',
      tbrIdNo: 'string',
      bbrName: 'string',
      bbrIdType: 'string',
      bbrIdNo: 'string',
      relaOrderNo: 'string',
      pickUpTime: 'string',
      courierCompany: 'string',
      courierNumber: 'string',
      cargoType: 'string',
      cargoTotalQuantity: 'string',
      cargoTotalWeight: 'string',
      cargoTotalWorth: 'string',
      sellId: 'string',
      sellNaicCode: 'string',
      startPlaceIsoCountry: 'string',
      startPlaceProvinceCity: 'string',
      startPlace: 'string',
      startPlacePostcode: 'string',
      buyId: 'string',
      isoCountry: 'string',
      destinationProvinceCity: 'string',
      destination: 'string',
      cargoDetails: { 'type': 'array', 'itemType': CargoDetail },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyInsurglobifyprodOspiinsureResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 交易流水号
  tradeNo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      tradeNo: 'trade_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      tradeNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyInsurglobifyprodOspiclaimRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 调用方生成的唯一编码，系统会根据该流水号做防重、幂等判断逻辑。当极端场景中，系统会返回处理中，错误码为2222，客户端应该保持该流水号不变，并使用原来的请求再次发送请求，系统会根据幂等逻辑返回处理结果；
  tradeNo: string;
  // 保司编码
  externalChannelCode: string;
  // 险种编码
  externalProductCode: string;
  // 大保单号
  bigPolNo: string;
  // 投保订单号
  relaOrderNo: string;
  // 受损货物名称
  damagedCargoName: string;
  // 出险原因
  incidentCause: string;
  // 出险日期(ISO 8601格式，2026-01-11T14:30:00+02:00)
  accidentTime: string;
  // 销售日期(ISO 8601格式，2026-01-11T14:30:00+02:00)
  saleDate: string;
  // 时区
  // Asia/Shanghai
  // Europe/Berlin
  // America/New_York
  // Pacific/Auckland
  // Europe/Berlin 
  timezone: string;
  // 索赔状态（Open / Under Review / In Payment Process / Closed / Rejected / Cancelled）
  claimStatus: string;
  // 货物大类
  cargoType: string;
  // 平台赔付日期(ISO 8601格式，2026-01-11T14:30:00+02:00)
  claimPaidTime: string;
  // 索赔类别(Valid / Fraudulent / Invalid
  claimCategory: string;
  // 索赔被拒原因
  claimPaidDesc: string;
  // 索赔总金额，小数位只支持2位
  claimPaidAmount: string;
  // 币种，使用ISO 4217代码；
  // CNY：人民币
  // USD：美元
  // EUR：欧元
  // GBP：英镑
  // JPY：日元
  // CHF：瑞士法郎
  // SGD：新加坡元
  currency: string;
  // 索赔事件类型(Loss / Theft / Breakage / Non-Delivery）
  claimIncidentType: string;
  // 索赔事件详情情况
  claimVerdictDesc: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tradeNo: 'trade_no',
      externalChannelCode: 'external_channel_code',
      externalProductCode: 'external_product_code',
      bigPolNo: 'big_pol_no',
      relaOrderNo: 'rela_order_no',
      damagedCargoName: 'damaged_cargo_name',
      incidentCause: 'incident_cause',
      accidentTime: 'accident_time',
      saleDate: 'sale_date',
      timezone: 'timezone',
      claimStatus: 'claim_status',
      cargoType: 'cargo_type',
      claimPaidTime: 'claim_paid_time',
      claimCategory: 'claim_category',
      claimPaidDesc: 'claim_paid_desc',
      claimPaidAmount: 'claim_paid_amount',
      currency: 'currency',
      claimIncidentType: 'claim_incident_type',
      claimVerdictDesc: 'claim_verdict_desc',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tradeNo: 'string',
      externalChannelCode: 'string',
      externalProductCode: 'string',
      bigPolNo: 'string',
      relaOrderNo: 'string',
      damagedCargoName: 'string',
      incidentCause: 'string',
      accidentTime: 'string',
      saleDate: 'string',
      timezone: 'string',
      claimStatus: 'string',
      cargoType: 'string',
      claimPaidTime: 'string',
      claimCategory: 'string',
      claimPaidDesc: 'string',
      claimPaidAmount: 'string',
      currency: 'string',
      claimIncidentType: 'string',
      claimVerdictDesc: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyInsurglobifyprodOspiclaimResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 交易流水号
  tradeNo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      tradeNo: 'trade_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      tradeNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadInsurglobifyprodMonthlypremiumbillRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 调用方生成的唯一编码，系统会根据该流水号做防重、幂等判断逻辑。当极端场景中，系统会返回处理中，错误码为2222，客户端应该保持该流水号不变，并使用原来的请求再次发送请求，系统会根据幂等逻辑返回处理结果；
  tradeNo: string;
  // 保司编码
  externalChannelCode: string;
  // 险种编码
  externalProductCode: string;
  // 保险方案名
  chSchemeName: string;
  // 关联的大保单号
  bigPolNo: string;
  // 账单年度
  billingYear: string;
  // 账单月份
  billingMonth: string;
  // 包裹总数
  packageCount: string;
  // 净保费，小数位只支持2位
  premium: string;
  // 税费，小数位只支持2位
  taxaAmount: string;
  // 总保费（含税费），小数位只支持2位
  totalPremium: string;
  // 币种，使用ISO 4217代码；
  // CNY：人民币
  // USD：美元
  // EUR：欧元
  // GBP：英镑
  // JPY：日元
  // CHF：瑞士法郎
  // SGD：新加坡元
  currency: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tradeNo: 'trade_no',
      externalChannelCode: 'external_channel_code',
      externalProductCode: 'external_product_code',
      chSchemeName: 'ch_scheme_name',
      bigPolNo: 'big_pol_no',
      billingYear: 'billing_year',
      billingMonth: 'billing_month',
      packageCount: 'package_count',
      premium: 'premium',
      taxaAmount: 'taxa_amount',
      totalPremium: 'total_premium',
      currency: 'currency',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tradeNo: 'string',
      externalChannelCode: 'string',
      externalProductCode: 'string',
      chSchemeName: 'string',
      bigPolNo: 'string',
      billingYear: 'string',
      billingMonth: 'string',
      packageCount: 'string',
      premium: 'string',
      taxaAmount: 'string',
      totalPremium: 'string',
      currency: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadInsurglobifyprodMonthlypremiumbillResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 交易流水号
  tradeNo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      tradeNo: 'trade_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      tradeNo: 'string',
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
          sdk_version: "1.0.7",
          _prod_code: "INSURANCE_SAAS_DE",
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
   * Description: 海外邮包险投保
   * Summary: 海外邮包险投保
   */
  async applyInsurglobifyprodOspiinsure(request: ApplyInsurglobifyprodOspiinsureRequest): Promise<ApplyInsurglobifyprodOspiinsureResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyInsurglobifyprodOspiinsureEx(request, headers, runtime);
  }

  /**
   * Description: 海外邮包险投保
   * Summary: 海外邮包险投保
   */
  async applyInsurglobifyprodOspiinsureEx(request: ApplyInsurglobifyprodOspiinsureRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyInsurglobifyprodOspiinsureResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyInsurglobifyprodOspiinsureResponse>(await this.doRequest("1.0", "antdigital.insurancesaasde.insurglobifyprod.ospiinsure.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyInsurglobifyprodOspiinsureResponse({}));
  }

  /**
   * Description: 海外邮包险理赔
   * Summary: 海外邮包险理赔
   */
  async applyInsurglobifyprodOspiclaim(request: ApplyInsurglobifyprodOspiclaimRequest): Promise<ApplyInsurglobifyprodOspiclaimResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyInsurglobifyprodOspiclaimEx(request, headers, runtime);
  }

  /**
   * Description: 海外邮包险理赔
   * Summary: 海外邮包险理赔
   */
  async applyInsurglobifyprodOspiclaimEx(request: ApplyInsurglobifyprodOspiclaimRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyInsurglobifyprodOspiclaimResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyInsurglobifyprodOspiclaimResponse>(await this.doRequest("1.0", "antdigital.insurancesaasde.insurglobifyprod.ospiclaim.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyInsurglobifyprodOspiclaimResponse({}));
  }

  /**
   * Description: 月度保费账单上传
   * Summary: 月度保费账单上传
   */
  async uploadInsurglobifyprodMonthlypremiumbill(request: UploadInsurglobifyprodMonthlypremiumbillRequest): Promise<UploadInsurglobifyprodMonthlypremiumbillResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.uploadInsurglobifyprodMonthlypremiumbillEx(request, headers, runtime);
  }

  /**
   * Description: 月度保费账单上传
   * Summary: 月度保费账单上传
   */
  async uploadInsurglobifyprodMonthlypremiumbillEx(request: UploadInsurglobifyprodMonthlypremiumbillRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UploadInsurglobifyprodMonthlypremiumbillResponse> {
    Util.validateModel(request);
    return $tea.cast<UploadInsurglobifyprodMonthlypremiumbillResponse>(await this.doRequest("1.0", "antdigital.insurancesaasde.insurglobifyprod.monthlypremiumbill.upload", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UploadInsurglobifyprodMonthlypremiumbillResponse({}));
  }

}
