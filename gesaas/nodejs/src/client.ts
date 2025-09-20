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

// 经营分账收入方列表
export class OperateDivideTransInModel extends $tea.Model {
  // 分账收入方支付宝用户id, 支付宝2088id
  transInUserId: string;
  // 分账金额，单位为分 大于0
  divideAmount: number;
  static names(): { [key: string]: string } {
    return {
      transInUserId: 'trans_in_user_id',
      divideAmount: 'divide_amount',
    };
  }

  static types(): { [key: string]: any } {
    return {
      transInUserId: 'string',
      divideAmount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 还款策略
export class RepayStrategy extends $tea.Model {
  // 应付租金时间，精确到天 格式为yyyy-MM-dd
  payDay: string;
  // 用户还款期数，从1开始
  termIndex: number;
  // 应付租金，精确到分，即1234表示12.34元 大于0
  rentaMoney: number;
  // 是否经营分账, Y-是、N-否 为空代表否
  operateDivideFlag?: string;
  // 经营分账收入方列表
  // 当operateDivideFlag 为Y时必填
  operateDivideTransInList: OperateDivideTransInModel[];
  static names(): { [key: string]: string } {
    return {
      payDay: 'pay_day',
      termIndex: 'term_index',
      rentaMoney: 'renta_money',
      operateDivideFlag: 'operate_divide_flag',
      operateDivideTransInList: 'operate_divide_trans_in_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      payDay: 'string',
      termIndex: 'number',
      rentaMoney: 'number',
      operateDivideFlag: 'string',
      operateDivideTransInList: { 'type': 'array', 'itemType': OperateDivideTransInModel },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 主订单信息
export class OrderInfoReq extends $tea.Model {
  // 订单创建时间
  orderCreateTime: string;
  // 订单付款主题
  orderPaySubject?: string;
  // 总租期
  // 总租期最小值为1
  // 总租期最大值为60
  rentTerm: number;
  // 租期单位
  // MONTH : 月 
  // DAY : 天
  rentUnit: string;
  // 租金总额 单位/分
  // 最小值为1
  totalRentMoney: number;
  static names(): { [key: string]: string } {
    return {
      orderCreateTime: 'order_create_time',
      orderPaySubject: 'order_pay_subject',
      rentTerm: 'rent_term',
      rentUnit: 'rent_unit',
      totalRentMoney: 'total_rent_money',
    };
  }

  static types(): { [key: string]: any } {
    return {
      orderCreateTime: 'string',
      orderPaySubject: 'string',
      rentTerm: 'number',
      rentUnit: 'string',
      totalRentMoney: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 订单还款计划
export class OrderPromise extends $tea.Model {
  // 宽限期/天
  // 不传默认为0
  gracePeriodDays?: number;
  // 罚息类型
  //  NONE : 没有罚息  PENALTY_FEE： 罚息（暂不支持）
  punishmentType: string;
  // 租期
  // 租期最小值为1
  payPeriod: number;
  // 租赁公司支付宝UID
  leaseAlipayUid: string;
  // 还款策略 
  // repayStrategyList长度 == payPeriod
  repayStrategyList: RepayStrategy[];
  static names(): { [key: string]: string } {
    return {
      gracePeriodDays: 'grace_period_days',
      punishmentType: 'punishment_type',
      payPeriod: 'pay_period',
      leaseAlipayUid: 'lease_alipay_uid',
      repayStrategyList: 'repay_strategy_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      gracePeriodDays: 'number',
      punishmentType: 'string',
      payPeriod: 'number',
      leaseAlipayUid: 'string',
      repayStrategyList: { 'type': 'array', 'itemType': RepayStrategy },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 订单详情列表
export class OrderDetail extends $tea.Model {
  // 凭证编号
  voucherCode: string;
  static names(): { [key: string]: string } {
    return {
      voucherCode: 'voucher_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      voucherCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 订单进件请求参数
export class OrderFullInfoReq extends $tea.Model {
  // 订单号
  // 
  orderId: string;
  // 手机号
  mobilePhone: string;
  // 产品ID=实际产品ID#版本 prod#1	
  // 
  productId: string;
  // 商户的统一社会信用代码
  merchantId: string;
  // 商户公司名字
  merchantName: string;
  // 业务场景 默认为CHARGING_BY_TERM 
  // CHARGING_BY_ORDER : 整单结算 
  // CHARGING_BY_TERM : 分期结算
  //  CHARGING_BY_TERM_INDIRECT : 间联模式使用，分期结算
  //  CHARGING_BY_PROFIT : 分润结算
  bizScene: string;
  // 业务类型 LEASE : 租赁 （默认） INSTALLMENT: 分期付款	
  // 
  bizType: string;
  // 签署模式 NONE : 灵活签约
  signMode: string;
  // 主订单信息
  orderInfo: OrderInfoReq;
  // 订单还款计划
  promiseInfo: OrderPromise;
  static names(): { [key: string]: string } {
    return {
      orderId: 'order_id',
      mobilePhone: 'mobile_phone',
      productId: 'product_id',
      merchantId: 'merchant_id',
      merchantName: 'merchant_name',
      bizScene: 'biz_scene',
      bizType: 'biz_type',
      signMode: 'sign_mode',
      orderInfo: 'order_info',
      promiseInfo: 'promise_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      orderId: 'string',
      mobilePhone: 'string',
      productId: 'string',
      merchantId: 'string',
      merchantName: 'string',
      bizScene: 'string',
      bizType: 'string',
      signMode: 'string',
      orderInfo: OrderInfoReq,
      promiseInfo: OrderPromise,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 响应结果基类
export class CommonResponse extends $tea.Model {
  // 结果码
  code: string;
  // 返回码描述
  msg: string;
  // 业务处理结果码
  // 
  subCode?: string;
  // 返回的提示信息
  subMsg?: string;
  // 可否重试
  retry?: boolean;
  static names(): { [key: string]: string } {
    return {
      code: 'code',
      msg: 'msg',
      subCode: 'sub_code',
      subMsg: 'sub_msg',
      retry: 'retry',
    };
  }

  static types(): { [key: string]: any } {
    return {
      code: 'string',
      msg: 'string',
      subCode: 'string',
      subMsg: 'string',
      retry: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 权益发放结果
export class RightsGrantResultVO extends $tea.Model {
  // 过期时间
  expireTime?: string;
  // 生效时间
  effectTime?: string;
  // 发放状态：
  // GRANTING：发放处理中 GRANT_SUCCESS：发放成功 GRANT_FAIL：发放失败
  grantStatus: string;
  // 订单详情列表
  orderDetails?: OrderDetail[];
  static names(): { [key: string]: string } {
    return {
      expireTime: 'expire_time',
      effectTime: 'effect_time',
      grantStatus: 'grant_status',
      orderDetails: 'order_details',
    };
  }

  static types(): { [key: string]: any } {
    return {
      expireTime: 'string',
      effectTime: 'string',
      grantStatus: 'string',
      orderDetails: { 'type': 'array', 'itemType': OrderDetail },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckOmngRiskRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单号
  orderId: string;
  // 手机号
  mobilePhone: string;
  // 产品ID=实际产品ID#版本
  // prod#1
  productId: string;
  // 商户的统一社会信用代码
  merchantId: string;
  // 商户公司名字
  merchantName: string;
  // 业务场景
  // 默认为CHARGING_BY_TERM
  // 
  //  CHARGING_BY_ORDER : 整单结算 
  // CHARGING_BY_TERM : 分期结算
  //  CHARGING_BY_TERM_INDIRECT : 间联模式使用，分期结算 
  // CHARGING_BY_PROFIT : 分润结算
  bizScene: string;
  // 业务类型
  // LEASE : 租赁 （默认） 
  // INSTALLMENT: 分期付款
  // 
  bizType: string;
  // 签署模式
  //  NONE : 灵活签约
  signMode: string;
  // 主订单信息
  orderInfo: OrderInfoReq;
  // 订单还款计划
  promiseInfo: OrderPromise;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      mobilePhone: 'mobile_phone',
      productId: 'product_id',
      merchantId: 'merchant_id',
      merchantName: 'merchant_name',
      bizScene: 'biz_scene',
      bizType: 'biz_type',
      signMode: 'sign_mode',
      orderInfo: 'order_info',
      promiseInfo: 'promise_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      mobilePhone: 'string',
      productId: 'string',
      merchantId: 'string',
      merchantName: 'string',
      bizScene: 'string',
      bizType: 'string',
      signMode: 'string',
      orderInfo: OrderInfoReq,
      promiseInfo: OrderPromise,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckOmngRiskResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 授权串
  infoStr?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      infoStr: 'info_str',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      infoStr: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SubmitRightsprodGrantRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 2088xxxx123
  userId?: string;
  // 用户手机号
  phoneNumber?: string;
  // 商户编号
  merchantNo?: string;
  // 权益编码
  rightsCode: string;
  // 发放数量
  grantNum: number;
  // 面额，动态面额类型必传
  faceValue?: string;
  // 外部发放订单号
  outGrantOrderNo: string;
  // 扩展信息
  extInfo?: string;
  // 发放信息,如活动ID等信息
  grantInfo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      userId: 'user_id',
      phoneNumber: 'phone_number',
      merchantNo: 'merchant_no',
      rightsCode: 'rights_code',
      grantNum: 'grant_num',
      faceValue: 'face_value',
      outGrantOrderNo: 'out_grant_order_no',
      extInfo: 'ext_info',
      grantInfo: 'grant_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      userId: 'string',
      phoneNumber: 'string',
      merchantNo: 'string',
      rightsCode: 'string',
      grantNum: 'number',
      faceValue: 'string',
      outGrantOrderNo: 'string',
      extInfo: 'string',
      grantInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SubmitRightsprodGrantResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 权益发放结果
  rightsGrantResult?: RightsGrantResultVO;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      rightsGrantResult: 'rights_grant_result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      rightsGrantResult: RightsGrantResultVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRightsprodGrantRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 外部发放订单号
  outGrantOrderNo: string;
  // 扩展信息
  extInfo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      outGrantOrderNo: 'out_grant_order_no',
      extInfo: 'ext_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      outGrantOrderNo: 'string',
      extInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRightsprodGrantResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 权益发放结果
  rightsGrantResult?: RightsGrantResultVO;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      rightsGrantResult: 'rights_grant_result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      rightsGrantResult: RightsGrantResultVO,
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
          sdk_version: "1.2.0",
          _prod_code: "GESAAS",
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
   * Description: 品牌会员签约鉴权产品链路风控鉴权
   * Summary: 风控鉴权
   */
  async checkOmngRisk(request: CheckOmngRiskRequest): Promise<CheckOmngRiskResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.checkOmngRiskEx(request, headers, runtime);
  }

  /**
   * Description: 品牌会员签约鉴权产品链路风控鉴权
   * Summary: 风控鉴权
   */
  async checkOmngRiskEx(request: CheckOmngRiskRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CheckOmngRiskResponse> {
    Util.validateModel(request);
    return $tea.cast<CheckOmngRiskResponse>(await this.doRequest("1.0", "antdigital.gesaas.omng.risk.check", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CheckOmngRiskResponse({}));
  }

  /**
   * Description: 权益中心权益发放
   * Summary: 权益发放
   */
  async submitRightsprodGrant(request: SubmitRightsprodGrantRequest): Promise<SubmitRightsprodGrantResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.submitRightsprodGrantEx(request, headers, runtime);
  }

  /**
   * Description: 权益中心权益发放
   * Summary: 权益发放
   */
  async submitRightsprodGrantEx(request: SubmitRightsprodGrantRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SubmitRightsprodGrantResponse> {
    Util.validateModel(request);
    return $tea.cast<SubmitRightsprodGrantResponse>(await this.doRequest("1.0", "antdigital.gesaas.rightsprod.grant.submit", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SubmitRightsprodGrantResponse({}));
  }

  /**
   * Description: 权益发放结果查询
   * Summary: 权益发放结果查询
   */
  async queryRightsprodGrant(request: QueryRightsprodGrantRequest): Promise<QueryRightsprodGrantResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryRightsprodGrantEx(request, headers, runtime);
  }

  /**
   * Description: 权益发放结果查询
   * Summary: 权益发放结果查询
   */
  async queryRightsprodGrantEx(request: QueryRightsprodGrantRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryRightsprodGrantResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryRightsprodGrantResponse>(await this.doRequest("1.0", "antdigital.gesaas.rightsprod.grant.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryRightsprodGrantResponse({}));
  }

}
