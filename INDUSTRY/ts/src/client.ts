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

// 银行卡信息
export class CardInfo extends $tea.Model {
  // 卡户名
  accountHolderName: string;
  // 卡号
  accountNo: string;
  // 银行名称
  accountInstName: string;
  // 银行缩写
  accountInstId: string;
  // 联行号
  bankCode?: string;
  // 开户行所在省份
  accountInstProvince: string;
  // 开户行所在城市
  accountInstCity: string;
  // 开户行支行名称
  accountBranchName: string;
  static names(): { [key: string]: string } {
    return {
      accountHolderName: 'account_holder_name',
      accountNo: 'account_no',
      accountInstName: 'account_inst_name',
      accountInstId: 'account_inst_id',
      bankCode: 'bank_code',
      accountInstProvince: 'account_inst_province',
      accountInstCity: 'account_inst_city',
      accountBranchName: 'account_branch_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      accountHolderName: 'string',
      accountNo: 'string',
      accountInstName: 'string',
      accountInstId: 'string',
      bankCode: 'string',
      accountInstProvince: 'string',
      accountInstCity: 'string',
      accountBranchName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 地址信息
export class AddressInfo extends $tea.Model {
  // 省份编码
  provinceCode: string;
  // 城市编码
  cityCode: string;
  // 区域编码
  districtCode: string;
  // 详细地址
  address: string;
  static names(): { [key: string]: string } {
    return {
      provinceCode: 'province_code',
      cityCode: 'city_code',
      districtCode: 'district_code',
      address: 'address',
    };
  }

  static types(): { [key: string]: any } {
    return {
      provinceCode: 'string',
      cityCode: 'string',
      districtCode: 'string',
      address: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 结算规则
export class SettleRule extends $tea.Model {
  // 结算类型， bankCard-表示结算到银行卡；alipayAccount-表示结算到支付宝账号
  defaultSettleType: string;
  // 结算目标
  // 如果settle_type = bankCard, 这里填写银行卡卡号;
  // 如果settle_type = alipayAccount, 这里填写支付宝账号登录号, 且要求与商户名称name同名
  defaultSettleTarget: string;
  static names(): { [key: string]: string } {
    return {
      defaultSettleType: 'default_settle_type',
      defaultSettleTarget: 'default_settle_target',
    };
  }

  static types(): { [key: string]: any } {
    return {
      defaultSettleType: 'string',
      defaultSettleTarget: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 联系人信息
export class ContactInfo extends $tea.Model {
  // 联系人姓名
  name: string;
  // 联系人手机号码
  mobile: string;
  // 联系人电话号码
  phone?: string;
  // 联系人类型, LEGAL_PERSON-法人；CONTROLLER-实际控制人；AGENT-代理人；OTHER-其他
  type: string;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      mobile: 'mobile',
      phone: 'phone',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      mobile: 'string',
      phone: 'string',
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 二级商户进件申请单
export class MerchantOrderInfo extends $tea.Model {
  // 申请单id
  orderId: string;
  // 平台方的用户id, 保持唯一
  merchantUserId: string;
  // 申请状态 99-已完结;-1-失败;031-审核中
  status: string;
  static names(): { [key: string]: string } {
    return {
      orderId: 'order_id',
      merchantUserId: 'merchant_user_id',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      orderId: 'string',
      merchantUserId: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 站点信息
export class SiteInfo extends $tea.Model {
  // 站点类型 网站-01 APP-02 服务窗-03 公众号-04 其他-05 支付宝小程序-06
  siteType: string;
  // 站点名称
  siteName?: string;
  // 站点地址
  siteUrl: string;
  static names(): { [key: string]: string } {
    return {
      siteType: 'site_type',
      siteName: 'site_name',
      siteUrl: 'site_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      siteType: 'string',
      siteName: 'string',
      siteUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateMerchantSellerRequest extends $tea.Model {
  authToken?: string;
  // source, 由中台为业务方分配, 作为业务来源标识
  source: string;
  // 平台方下的用户id, 唯一， 跟merchant_login_name不能同时为空
  merchantUserId?: string;
  // 商户登录账号, 跟merchant_user_id不能同时为空
  merchantLoginName?: string;
  // 商户别名, 会展示在账单以及支付结果页中
  merchantAliasName: string;
  // 商户类别码mcc，参见https://gw.alipayobjects.com/os/bmw-prod/05c9a32e-42d1-436b-ace7-13101d91f672.xlsx
  mcc?: string;
  // 法人姓名，merchant_type = 01时必填
  legalName?: string;
  // 商户法人身份证号码, merchant_type = 01时必填
  legalCertNo?: string;
  // 商户经营地址
  businessAddress: AddressInfo;
  // 商户联系人信息
  contactInfos: ContactInfo[];
  // 商户使用服务 当面付、app支付、wap支付、电脑支付
  service: string[];
  // 默认结算规则
  defaultSettleRule: SettleRule;
  // 银行卡结算信息, 结算到银行卡时必填, 当前仅支持填入一张卡
  bizCards?: CardInfo;
  // 请求单据号，32位。
  requestId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      source: 'source',
      merchantUserId: 'merchant_user_id',
      merchantLoginName: 'merchant_login_name',
      merchantAliasName: 'merchant_alias_name',
      mcc: 'mcc',
      legalName: 'legal_name',
      legalCertNo: 'legal_cert_no',
      businessAddress: 'business_address',
      contactInfos: 'contact_infos',
      service: 'service',
      defaultSettleRule: 'default_settle_rule',
      bizCards: 'biz_cards',
      requestId: 'request_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      source: 'string',
      merchantUserId: 'string',
      merchantLoginName: 'string',
      merchantAliasName: 'string',
      mcc: 'string',
      legalName: 'string',
      legalCertNo: 'string',
      businessAddress: AddressInfo,
      contactInfos: { 'type': 'array', 'itemType': ContactInfo },
      service: { 'type': 'array', 'itemType': 'string' },
      defaultSettleRule: SettleRule,
      bizCards: CardInfo,
      requestId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateMerchantSellerResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 申请单id
  orderId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      orderId: 'order_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      orderId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMerchantSignRequest extends $tea.Model {
  authToken?: string;
  // source, 由中台为业务方分配, 标识业务来源
  source: string;
  // 申请单id, 跟merchant_user_id不能同时为空
  orderId?: string;
  // 平台方下的用户id, 保持唯一，跟order_id不能同时为空; 如果只传该字段, 获取该用户id的最新一次进件结果
  merchantUserId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      source: 'source',
      orderId: 'order_id',
      merchantUserId: 'merchant_user_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      source: 'string',
      orderId: 'string',
      merchantUserId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMerchantSignResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 进件申请单信息
  orderInfo?: MerchantOrderInfo;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      orderInfo: 'order_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      orderInfo: MerchantOrderInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PayTradePageRequest extends $tea.Model {
  authToken?: string;
  // 来源场景码,IP版权默认传IP_COPYRIGHT
  source: string;
  // 渠道 自营平台、第三方平台等
  channel: string;
  // 支付成功后returl地址
  returnUrl: string;
  // 外部单据号。32 个字符以内的大小，仅支持字母、数字。需保证该参数在业务侧不重复。
  merchantOrderNo: string;
  // 收单金额，"10.11"代表10.11元,最小粒度到分,小数点后2位，不支持高精度和负数
  totalAmount: string;
  // 交易标题等。注意：不可使用特殊字符，如 /，=，& 等。不超过256
  subject: string;
  // 支付渠道产品码；
  // 目前只支持直付通，code= ZFT;
  payProductCode: string;
  // 默认：人民币（156）
  transCurrency?: string;
  // 平台方下的用户id (即商家id)
  merchantUserId: string;
  // 订单描述。不超过128长度
  body?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      source: 'source',
      channel: 'channel',
      returnUrl: 'return_url',
      merchantOrderNo: 'merchant_order_no',
      totalAmount: 'total_amount',
      subject: 'subject',
      payProductCode: 'pay_product_code',
      transCurrency: 'trans_currency',
      merchantUserId: 'merchant_user_id',
      body: 'body',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      source: 'string',
      channel: 'string',
      returnUrl: 'string',
      merchantOrderNo: 'string',
      totalAmount: 'string',
      subject: 'string',
      payProductCode: 'string',
      transCurrency: 'string',
      merchantUserId: 'string',
      body: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PayTradePageResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 收银台页面String
  form?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      form: 'form',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      form: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTradeOrderRequest extends $tea.Model {
  authToken?: string;
  // 中台颁发的场景码，IP_COPYRIGHT
  source: string;
  // 外部商户订单号，不超32位
  merchantOrderNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      source: 'source',
      merchantOrderNo: 'merchant_order_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      source: 'string',
      merchantOrderNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTradeOrderResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 支付宝交易号
  tradeNo?: string;
  // 交易状态：WAIT_BUYER_PAY（交易创建，等待买家付款）、TRADE_CLOSED（未付款交易超时关闭，或支付完成后全额退款）、TRADE_SUCCESS（交易支付成功）
  tradeStatus?: string;
  // 交易金额，"10.11"
  totalAmount?: string;
  // 商户订单号out_trade_no
  outTradeNo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      tradeNo: 'trade_no',
      tradeStatus: 'trade_status',
      totalAmount: 'total_amount',
      outTradeNo: 'out_trade_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      tradeNo: 'string',
      tradeStatus: 'string',
      totalAmount: 'string',
      outTradeNo: 'string',
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
          sdk_version: "1.0.7",
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
   * Description: 商业卖家商户注册
   * Summary: 行业卖家商户注册
   */
  async createMerchantSeller(request: CreateMerchantSellerRequest): Promise<CreateMerchantSellerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createMerchantSellerEx(request, headers, runtime);
  }

  /**
   * Description: 商业卖家商户注册
   * Summary: 行业卖家商户注册
   */
  async createMerchantSellerEx(request: CreateMerchantSellerRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateMerchantSellerResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateMerchantSellerResponse>(await this.doRequest("1.0", "antcloud.industry.merchant.seller.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateMerchantSellerResponse({}));
  }

  /**
   * Description: 行业卖家商户注册结果查询服务
   * Summary: 行业卖家商户注册结果查询服务
   */
  async queryMerchantSign(request: QueryMerchantSignRequest): Promise<QueryMerchantSignResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryMerchantSignEx(request, headers, runtime);
  }

  /**
   * Description: 行业卖家商户注册结果查询服务
   * Summary: 行业卖家商户注册结果查询服务
   */
  async queryMerchantSignEx(request: QueryMerchantSignRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryMerchantSignResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryMerchantSignResponse>(await this.doRequest("1.0", "antcloud.industry.merchant.sign.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryMerchantSignResponse({}));
  }

  /**
   * Description: 买家卖家收单交易，直接收款给卖家过渡户
   * Summary: 买家卖家收单交易
   */
  async payTradePage(request: PayTradePageRequest): Promise<PayTradePageResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.payTradePageEx(request, headers, runtime);
  }

  /**
   * Description: 买家卖家收单交易，直接收款给卖家过渡户
   * Summary: 买家卖家收单交易
   */
  async payTradePageEx(request: PayTradePageRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PayTradePageResponse> {
    Util.validateModel(request);
    return $tea.cast<PayTradePageResponse>(await this.doRequest("1.0", "antcloud.industry.trade.page.pay", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PayTradePageResponse({}));
  }

  /**
   * Description: 交易支付结果查询接口
   * Summary: 交易结果查询
   */
  async queryTradeOrder(request: QueryTradeOrderRequest): Promise<QueryTradeOrderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryTradeOrderEx(request, headers, runtime);
  }

  /**
   * Description: 交易支付结果查询接口
   * Summary: 交易结果查询
   */
  async queryTradeOrderEx(request: QueryTradeOrderRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryTradeOrderResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTradeOrderResponse>(await this.doRequest("1.0", "antcloud.industry.trade.order.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryTradeOrderResponse({}));
  }

}
