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

// 分账通知明细
export class SettleOrderRoyaltyDetail extends $tea.Model {
  // 分账金额，单位：分
  /**
   * @example
   * 100
   */
  amount: number;
  // 分账执行时间
  /**
   * @example
   * 2021-07-30 12:00:00
   */
  executeTime: string;
  // 分账转出账号
  /**
   * @example
   * 2088111111111111
   */
  transOutAccount: string;
  // 分账转入账号
  /**
   * @example
   * 2088111111111111
   */
  transInAccount: string;
  static names(): { [key: string]: string } {
    return {
      amount: 'amount',
      executeTime: 'execute_time',
      transOutAccount: 'trans_out_account',
      transInAccount: 'trans_in_account',
    };
  }

  static types(): { [key: string]: any } {
    return {
      amount: 'number',
      executeTime: 'string',
      transOutAccount: 'string',
      transInAccount: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 发放订单明细
export class GrantOrderDetail extends $tea.Model {
  // 券编码
  /**
   * @example
   * 1798234932684395
   */
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

export class CallbackOrderSettlementRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // ASYNC_SETTLE_RESULT ：异步分账结果
  msgType: string;
  // 支付交易号
  tradeNo: string;
  // 分账金额，单位分
  splitAmount: number;
  // 分账受理单号
  settleNo: string;
  // 分账受理时间
  splitRequestTime: string;
  // 分账通知明细
  splitDetailList: SettleOrderRoyaltyDetail[];
  // 扩展参数
  extInfo?: string;
  // 消息唯一性判断，重试msgId不变
  msgId: string;
  // 外部订单号(同一个outProductId唯一)
  outOrderNo: string;
  // 分账状态，SUCCESS成功，FAIL失败
  splitStatus: string;
  // 分账失败原因，条件返回：splitStatus=FAIL 返回
  splitFailReason?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      msgType: 'msg_type',
      tradeNo: 'trade_no',
      splitAmount: 'split_amount',
      settleNo: 'settle_no',
      splitRequestTime: 'split_request_time',
      splitDetailList: 'split_detail_list',
      extInfo: 'ext_info',
      msgId: 'msg_id',
      outOrderNo: 'out_order_no',
      splitStatus: 'split_status',
      splitFailReason: 'split_fail_reason',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      msgType: 'string',
      tradeNo: 'string',
      splitAmount: 'number',
      settleNo: 'string',
      splitRequestTime: 'string',
      splitDetailList: { 'type': 'array', 'itemType': SettleOrderRoyaltyDetail },
      extInfo: 'string',
      msgId: 'string',
      outOrderNo: 'string',
      splitStatus: 'string',
      splitFailReason: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CallbackOrderSettlementResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 同步结果 success 同步成功,失败：fail
  result?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      result: 'result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      result: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushRightsprodVoucherRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 权益编码
  rightsCode: string;
  // 权益凭证编码/券码
  voucherCode: string;
  // 业务类型
  // GRANT：发放 
  // VERIFY：核销 GRANT_CANCEL：发放撤销 VERIFY_CANCEL：核销撤销 FREEZE：冻结
  // UNFREEZE：解冻  
  bizType: string;
  // FAIL：失败 
  // SUCCESS：成功 
  status?: string;
  // 外部订单号
  outTradeOrderNo?: string;
  // 失败信息
  failMsg?: string;
  // 外部发放调用时传入信息
  grantInfo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      rightsCode: 'rights_code',
      voucherCode: 'voucher_code',
      bizType: 'biz_type',
      status: 'status',
      outTradeOrderNo: 'out_trade_order_no',
      failMsg: 'fail_msg',
      grantInfo: 'grant_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      rightsCode: 'string',
      voucherCode: 'string',
      bizType: 'string',
      status: 'string',
      outTradeOrderNo: 'string',
      failMsg: 'string',
      grantInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushRightsprodVoucherResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 同步结果  success 同步成功 
  result?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      result: 'result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      result: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CallbackRightsprodStatusRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 权益编码
  rightsCode: string;
  // 券码
  voucherCode: string;
  // 券变更状态
  // V_USE（使用）
  // V_REFUND（退款）
  // V_EXPIRE（过期）
  // V_INVALID（作废）
  status: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      rightsCode: 'rights_code',
      voucherCode: 'voucher_code',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      rightsCode: 'string',
      voucherCode: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CallbackRightsprodStatusResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 同步结果 success 同步成功
  result?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      result: 'result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      result: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CallbackRightsprodOperationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 权益编码
  rightsCode: string;
  // 券码
  voucherCode: string;
  // 通知ID(幂等)
  notifyId: string;
  // 业务类型
  // V_REFUND（退款）
  // V_EXPIRE（过期）
  // V_INVALID（作废）
  // V_USE（使用）
  bizType: string;
  // 支付订单号
  payOrderNo?: string;
  // 券面额
  faceAmount?: string;
  // 流通金额（核销、退款时 金额）
  fluxAmount?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      rightsCode: 'rights_code',
      voucherCode: 'voucher_code',
      notifyId: 'notify_id',
      bizType: 'biz_type',
      payOrderNo: 'pay_order_no',
      faceAmount: 'face_amount',
      fluxAmount: 'flux_amount',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      rightsCode: 'string',
      voucherCode: 'string',
      notifyId: 'string',
      bizType: 'string',
      payOrderNo: 'string',
      faceAmount: 'string',
      fluxAmount: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CallbackRightsprodOperationResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 同步结果  
  // success 为同步成功其他均为失败
  result?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      result: 'result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      result: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushRightsprodGrantrightsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用户ID
  userId?: string;
  // 手机号
  phoneNumber?: string;
  // 商户编码
  merchantNo?: string;
  // 权益编码
  rightsCode: string;
  // 发放数量，可根据权益信息grantMulti判断是否可发多张
  grantNum?: number;
  // 外部发放订单号
  outGrantOrderNo: string;
  // 发放扩展信息，如活动ID等信息，暂时可以不传
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
      outGrantOrderNo: 'out_grant_order_no',
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
      outGrantOrderNo: 'string',
      grantInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushRightsprodGrantrightsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 发放状态：
  // GRANTING：发放处理中 GRANT_SUCCESS：发放成功 GRANT_FAIL：发放失败
  grantStatus?: string;
  // 过期时间 yyyy-MM-dd HH:mm:ss
  expireTime?: string;
  // 生效时间 yyyy-MM-dd HH:mm:ss
  effectTime?: string;
  // 发放订单明细数据
  orderDetails?: GrantOrderDetail[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      grantStatus: 'grant_status',
      expireTime: 'expire_time',
      effectTime: 'effect_time',
      orderDetails: 'order_details',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      grantStatus: 'string',
      expireTime: 'string',
      effectTime: 'string',
      orderDetails: { 'type': 'array', 'itemType': GrantOrderDetail },
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
          sdk_version: "1.1.3",
          _prod_code: "GESAAS_SPI",
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
   * Description: 分账结果通知第三方
   * Summary: 分账结果通知第三方
   */
  async callbackOrderSettlement(request: CallbackOrderSettlementRequest): Promise<CallbackOrderSettlementResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.callbackOrderSettlementEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 分账结果通知第三方
   * Summary: 分账结果通知第三方
   */
  async callbackOrderSettlementEx(request: CallbackOrderSettlementRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CallbackOrderSettlementResponse> {
    Util.validateModel(request);
    return $tea.cast<CallbackOrderSettlementResponse>(await this.doRequest("1.0", "antdigital.gesaasspi.order.settlement.callback", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CallbackOrderSettlementResponse({}));
  }

  /**
   * @remarks
   * Description: 权益中心权益券状态推送
   * Summary: 券状态推送
   */
  async pushRightsprodVoucher(request: PushRightsprodVoucherRequest): Promise<PushRightsprodVoucherResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pushRightsprodVoucherEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 权益中心权益券状态推送
   * Summary: 券状态推送
   */
  async pushRightsprodVoucherEx(request: PushRightsprodVoucherRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PushRightsprodVoucherResponse> {
    Util.validateModel(request);
    return $tea.cast<PushRightsprodVoucherResponse>(await this.doRequest("1.0", "antdigital.gesaasspi.rightsprod.voucher.push", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PushRightsprodVoucherResponse({}));
  }

  /**
   * @remarks
   * Description: 权益中心券状态变更回调通知
   * Summary: 权益中心券状态变更回调通知
   */
  async callbackRightsprodStatus(request: CallbackRightsprodStatusRequest): Promise<CallbackRightsprodStatusResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.callbackRightsprodStatusEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 权益中心券状态变更回调通知
   * Summary: 权益中心券状态变更回调通知
   */
  async callbackRightsprodStatusEx(request: CallbackRightsprodStatusRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CallbackRightsprodStatusResponse> {
    Util.validateModel(request);
    return $tea.cast<CallbackRightsprodStatusResponse>(await this.doRequest("1.0", "antdigital.gesaasspi.rightsprod.status.callback", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CallbackRightsprodStatusResponse({}));
  }

  /**
   * @remarks
   * Description: 券操作回调通知
   * Summary: 券操作回调通知
   */
  async callbackRightsprodOperation(request: CallbackRightsprodOperationRequest): Promise<CallbackRightsprodOperationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.callbackRightsprodOperationEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 券操作回调通知
   * Summary: 券操作回调通知
   */
  async callbackRightsprodOperationEx(request: CallbackRightsprodOperationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CallbackRightsprodOperationResponse> {
    Util.validateModel(request);
    return $tea.cast<CallbackRightsprodOperationResponse>(await this.doRequest("1.0", "antdigital.gesaasspi.rightsprod.operation.callback", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CallbackRightsprodOperationResponse({}));
  }

  /**
   * @remarks
   * Description: 权益供应商权益发放spi
   * Summary: 权益供应商权益发放spi
   */
  async pushRightsprodGrantrights(request: PushRightsprodGrantrightsRequest): Promise<PushRightsprodGrantrightsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pushRightsprodGrantrightsEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 权益供应商权益发放spi
   * Summary: 权益供应商权益发放spi
   */
  async pushRightsprodGrantrightsEx(request: PushRightsprodGrantrightsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PushRightsprodGrantrightsResponse> {
    Util.validateModel(request);
    return $tea.cast<PushRightsprodGrantrightsResponse>(await this.doRequest("1.0", "antdigital.gesaasspi.rightsprod.grantrights.push", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PushRightsprodGrantrightsResponse({}));
  }

}
