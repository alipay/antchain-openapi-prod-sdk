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

export class GetAccountBalanceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 渠道来源： DEFAULT 官网 ANT_OPEN_SERVICE_MARKET 开放平-服务市场台 
  fromChannel: string;
  // 租户id,外部用户唯一id，如蚂蚁通行证id
  tenant: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      fromChannel: 'from_channel',
      tenant: 'tenant',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      fromChannel: 'string',
      tenant: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetAccountBalanceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 账户余额
  accountBalance?: string;
  // 可用余额
  availableBalance?: string;
  // 币种
  currencyValue?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      accountBalance: 'account_balance',
      availableBalance: 'available_balance',
      currencyValue: 'currency_value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      accountBalance: 'string',
      availableBalance: 'string',
      currencyValue: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ChargeAccountBalanceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // "10.11"代表10.11元,最小粒度到分，小数点后2位
  chargeAmt: string;
  // 币种,支付宝体系内一般存储币种值（156/840/...），156代表人民币
  currencyValue: string;
  // 渠道来源： ANTCLOUD_OFFICIAL 官网 ANT_OPEN_SERVICE_MARKET 开放平-服务市场台
  fromChannel: string;
  // 唤起收银台后，充值后回调url链接
  returnUrl: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      chargeAmt: 'charge_amt',
      currencyValue: 'currency_value',
      fromChannel: 'from_channel',
      returnUrl: 'return_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      chargeAmt: 'string',
      currencyValue: 'string',
      fromChannel: 'string',
      returnUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ChargeAccountBalanceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 支付宝网关
  alipayGateway?: string;
  // 字符编码格式   _input_charset
  inputCharset?: string;
  // 服务器异步通知页面路径
  notifyUrl?: string;
  // 商户网站唯一订单号
  outTradeNo?: string;
  // 收款方PID
  partner?: string;
  // 支付类型
  paymentType?: string;
  // 收银台发起页面跳转同步通知页面路径
  returnUrl?: string;
  // 收款方ID
  sellerId?: string;
  // 调用的接口名
  service?: string;
  // 签名
  sign?: string;
  // 签名类型
  signType?: string;
  // 商品名称
  subject?: string;
  // 交易金额
  totalFee?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      alipayGateway: 'alipay_gateway',
      inputCharset: 'input_charset',
      notifyUrl: 'notify_url',
      outTradeNo: 'out_trade_no',
      partner: 'partner',
      paymentType: 'payment_type',
      returnUrl: 'return_url',
      sellerId: 'seller_id',
      service: 'service',
      sign: 'sign',
      signType: 'sign_type',
      subject: 'subject',
      totalFee: 'total_fee',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      alipayGateway: 'string',
      inputCharset: 'string',
      notifyUrl: 'string',
      outTradeNo: 'string',
      partner: 'string',
      paymentType: 'string',
      returnUrl: 'string',
      sellerId: 'string',
      service: 'string',
      sign: 'string',
      signType: 'string',
      subject: 'string',
      totalFee: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetAccountUserRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // alipay托管子户ID
  alipayUserId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      alipayUserId: 'alipay_user_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      alipayUserId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetAccountUserResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 智能科技user_id
  tenantId?: string;
  // 登录名
  loginName?: string;
  // 用户的真实姓名
  realName?: string;
  // 手机号
  mobileNum?: string;
  // 公司名称
  firmName?: string;
  // 帐号类型，企业或者是个人
  //  ENTERPRISE("1","企业类型账号"),
  //  INDIVIDUAL("2","个人类型账号")
  userType?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      tenantId: 'tenant_id',
      loginName: 'login_name',
      realName: 'real_name',
      mobileNum: 'mobile_num',
      firmName: 'firm_name',
      userType: 'user_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      tenantId: 'string',
      loginName: 'string',
      realName: 'string',
      mobileNum: 'string',
      firmName: 'string',
      userType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateAcfeewebInstanceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 出账验证主键id
  id: string;
  // 计量域code
  domainCode: string;
  // 计量域名称
  domainName: string;
  // 计量域版本
  domainVersion: string;
  // 业务产品code
  productCode: string;
  // 业务产品名称
  productName: string;
  // 渠道产品code
  serviceCode: string;
  // 渠道产品名称
  serviceName: string;
  // 商品code
  offerCode: string;
  // 商品名称
  offerName: string;
  // 验证的计量数据
  omsData: string;
  // 计量数据业务幂等号
  omsBizNo: string;
  // 缓存报文
  verificationCache: string;
  // 缓存链接
  verificationUrl: string;
  // 审批流id
  bpmsId: string;
  // 配置报文
  configData: string;
  // 状态
  status: string;
  // 创建人
  creator: string;
  // 修改人
  modifor: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      id: 'id',
      domainCode: 'domain_code',
      domainName: 'domain_name',
      domainVersion: 'domain_version',
      productCode: 'product_code',
      productName: 'product_name',
      serviceCode: 'service_code',
      serviceName: 'service_name',
      offerCode: 'offer_code',
      offerName: 'offer_name',
      omsData: 'oms_data',
      omsBizNo: 'oms_biz_no',
      verificationCache: 'verification_cache',
      verificationUrl: 'verification_url',
      bpmsId: 'bpms_id',
      configData: 'config_data',
      status: 'status',
      creator: 'creator',
      modifor: 'modifor',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      id: 'string',
      domainCode: 'string',
      domainName: 'string',
      domainVersion: 'string',
      productCode: 'string',
      productName: 'string',
      serviceCode: 'string',
      serviceName: 'string',
      offerCode: 'string',
      offerName: 'string',
      omsData: 'string',
      omsBizNo: 'string',
      verificationCache: 'string',
      verificationUrl: 'string',
      bpmsId: 'string',
      configData: 'string',
      status: 'string',
      creator: 'string',
      modifor: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateAcfeewebInstanceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 审批流实例id
  processInstanceId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      processInstanceId: 'process_instance_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      processInstanceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateAcfeewebStateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 出账验证主键id
  id: string;
  // 计量域code
  domainCode: string;
  // 计量域名称
  domainName: string;
  // 计量域版本
  domainVersion: string;
  // 业务产品code
  productCode: string;
  // 业务产品名称
  productName: string;
  // 渠道产品code
  serviceCode: string;
  // 渠道产品名称
  serviceName: string;
  // 商品code
  offerCode: string;
  // 商品名称
  offerName: string;
  // 验证的计量数据
  omsData: string;
  // 计量数据业务幂等号
  omsBizNo: string;
  // 缓存报文
  verificationCache: string;
  // 缓存链接
  verificationUrl: string;
  // 审批流id
  bpmsId: string;
  // 配置报文
  configData: string;
  // 状态
  status: string;
  // 创建人
  creator: string;
  // 修改人
  modifor: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      id: 'id',
      domainCode: 'domain_code',
      domainName: 'domain_name',
      domainVersion: 'domain_version',
      productCode: 'product_code',
      productName: 'product_name',
      serviceCode: 'service_code',
      serviceName: 'service_name',
      offerCode: 'offer_code',
      offerName: 'offer_name',
      omsData: 'oms_data',
      omsBizNo: 'oms_biz_no',
      verificationCache: 'verification_cache',
      verificationUrl: 'verification_url',
      bpmsId: 'bpms_id',
      configData: 'config_data',
      status: 'status',
      creator: 'creator',
      modifor: 'modifor',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      id: 'string',
      domainCode: 'string',
      domainName: 'string',
      domainVersion: 'string',
      productCode: 'string',
      productName: 'string',
      serviceCode: 'string',
      serviceName: 'string',
      offerCode: 'string',
      offerName: 'string',
      omsData: 'string',
      omsBizNo: 'string',
      verificationCache: 'string',
      verificationUrl: 'string',
      bpmsId: 'string',
      configData: 'string',
      status: 'string',
      creator: 'string',
      modifor: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateAcfeewebStateResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 成功、失败
  syncResult?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      syncResult: 'sync_result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      syncResult: 'boolean',
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
          sdk_version: "1.3.0",
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
   * Description: 提供金融云账户余额、可用余额查询接口
   * Summary: 金融云账户余额查询
   */
  async getAccountBalance(request: GetAccountBalanceRequest): Promise<GetAccountBalanceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getAccountBalanceEx(request, headers, runtime);
  }

  /**
   * Description: 提供金融云账户余额、可用余额查询接口
   * Summary: 金融云账户余额查询
   */
  async getAccountBalanceEx(request: GetAccountBalanceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetAccountBalanceResponse> {
    Util.validateModel(request);
    return $tea.cast<GetAccountBalanceResponse>(await this.doRequest("1.0", "antcloud.billing.account.balance.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetAccountBalanceResponse({}));
  }

  /**
   * Description: 智能科技资金帐号充值参数，返回唤起收银台充值参数
   * Summary: 智能科技资金帐号充值参数组装
   */
  async chargeAccountBalance(request: ChargeAccountBalanceRequest): Promise<ChargeAccountBalanceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.chargeAccountBalanceEx(request, headers, runtime);
  }

  /**
   * Description: 智能科技资金帐号充值参数，返回唤起收银台充值参数
   * Summary: 智能科技资金帐号充值参数组装
   */
  async chargeAccountBalanceEx(request: ChargeAccountBalanceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ChargeAccountBalanceResponse> {
    Util.validateModel(request);
    return $tea.cast<ChargeAccountBalanceResponse>(await this.doRequest("1.0", "antcloud.billing.account.balance.charge", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ChargeAccountBalanceResponse({}));
  }

  /**
   * Description: 根据托管子户ID查询租户信息
   * Summary: 根据托管子户ID查询租户信息
   */
  async getAccountUser(request: GetAccountUserRequest): Promise<GetAccountUserResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getAccountUserEx(request, headers, runtime);
  }

  /**
   * Description: 根据托管子户ID查询租户信息
   * Summary: 根据托管子户ID查询租户信息
   */
  async getAccountUserEx(request: GetAccountUserRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetAccountUserResponse> {
    Util.validateModel(request);
    return $tea.cast<GetAccountUserResponse>(await this.doRequest("1.0", "antcloud.billing.account.user.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetAccountUserResponse({}));
  }

  /**
   * Description: 线下环境调用线上环境发起审批流
   * Summary: 创建审批流
   */
  async createAcfeewebInstance(request: CreateAcfeewebInstanceRequest): Promise<CreateAcfeewebInstanceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createAcfeewebInstanceEx(request, headers, runtime);
  }

  /**
   * Description: 线下环境调用线上环境发起审批流
   * Summary: 创建审批流
   */
  async createAcfeewebInstanceEx(request: CreateAcfeewebInstanceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateAcfeewebInstanceResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateAcfeewebInstanceResponse>(await this.doRequest("1.0", "antcloud.billing.acfeeweb.instance.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateAcfeewebInstanceResponse({}));
  }

  /**
   * Description: 同步线下接口(出账验证状态)
   * Summary: 同步出账验证状态
   */
  async updateAcfeewebState(request: UpdateAcfeewebStateRequest): Promise<UpdateAcfeewebStateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateAcfeewebStateEx(request, headers, runtime);
  }

  /**
   * Description: 同步线下接口(出账验证状态)
   * Summary: 同步出账验证状态
   */
  async updateAcfeewebStateEx(request: UpdateAcfeewebStateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateAcfeewebStateResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateAcfeewebStateResponse>(await this.doRequest("1.0", "antcloud.billing.acfeeweb.state.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateAcfeewebStateResponse({}));
  }

}
