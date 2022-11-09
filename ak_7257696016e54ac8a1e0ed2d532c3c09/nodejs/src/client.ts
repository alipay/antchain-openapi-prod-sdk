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

// 授权列表键值对
export class AuthorizeRecordsPairs extends $tea.Model {
  // 授权业务
  authBusinessCode: string;
  // 授权密钥
  authBusinessSecret: string;
  static names(): { [key: string]: string } {
    return {
      authBusinessCode: 'auth_business_code',
      authBusinessSecret: 'auth_business_secret',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authBusinessCode: 'string',
      authBusinessSecret: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OperateAntchainBbpInsuranceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 保司编码
  mechanismCode: string;
  // 保单加密信息
  policyEncryptionContext: string;
  // 保单号
  policyNo: string;
  // 保险产品SKU
  thirdpartSku: string;
  // 保险公司名称
  mechanismName?: string;
  // 保单种类，险种
  insuranceType?: string;
  // 来源uid，此处指天猫id
  sourceUid?: string;
  // 订单来源
  source?: string;
  // 投保人
  userName?: string;
  // 投保人类型  自然人/公司
  userType: string;
  // 投保人电话号码
  userPhonenumber?: string;
  // 投保人证件号
  userCertNo?: string;
  // 拓展信息
  extend?: string;
  // 保单生效时间（毫秒值）
  policyEffectTime: number;
  // 保单失效时间（毫秒值）
  policyInvalidTime: number;
  // 订单总金额 BigDecimal
  policyTotalAmount: number;
  // 订单总期数（一次性付款用1）
  policyTotalStage: number;
  // 保费支付日期（毫秒值）
  policyPayDate: number;
  // 已支付保费期数（1代表1期）
  policyPaidStage?: number;
  // 每一期保费金额BigDecimal
  policyStageAverAmount?: number;
  // 订单时间（毫秒值）
  orderTime?: number;
  // 操作类型
  // 下单 支付 理赔 退单
  operation?: string;
  // 赔付单号(对于赔付操作来说是必填项)
  claimOrderNo?: string;
  // 理赔申请时间 理赔操作必填
  claimApplyTime?: number;
  // 理赔赔付时间 理赔操作必填
  claimPayTime?: number;
  // 理赔申请金额BigDecimal，单位元，保留小数点两位  理赔操作必填
  claimApplyAmount?: number;
  // 理赔金额BigDecimal，理赔操作必填
  claimAmount?: number;
  // 授权列表
  authorizeRecords?: AuthorizeRecordsPairs[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      mechanismCode: 'mechanism_code',
      policyEncryptionContext: 'policy_encryption_context',
      policyNo: 'policy_no',
      thirdpartSku: 'thirdpart_sku',
      mechanismName: 'mechanism_name',
      insuranceType: 'insurance_type',
      sourceUid: 'source_uid',
      source: 'source',
      userName: 'user_name',
      userType: 'user_type',
      userPhonenumber: 'user_phonenumber',
      userCertNo: 'user_cert_no',
      extend: 'extend',
      policyEffectTime: 'policy_effect_time',
      policyInvalidTime: 'policy_invalid_time',
      policyTotalAmount: 'policy_total_amount',
      policyTotalStage: 'policy_total_stage',
      policyPayDate: 'policy_pay_date',
      policyPaidStage: 'policy_paid_stage',
      policyStageAverAmount: 'policy_stage_aver_amount',
      orderTime: 'order_time',
      operation: 'operation',
      claimOrderNo: 'claim_order_no',
      claimApplyTime: 'claim_apply_time',
      claimPayTime: 'claim_pay_time',
      claimApplyAmount: 'claim_apply_amount',
      claimAmount: 'claim_amount',
      authorizeRecords: 'authorize_records',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      mechanismCode: 'string',
      policyEncryptionContext: 'string',
      policyNo: 'string',
      thirdpartSku: 'string',
      mechanismName: 'string',
      insuranceType: 'string',
      sourceUid: 'string',
      source: 'string',
      userName: 'string',
      userType: 'string',
      userPhonenumber: 'string',
      userCertNo: 'string',
      extend: 'string',
      policyEffectTime: 'number',
      policyInvalidTime: 'number',
      policyTotalAmount: 'number',
      policyTotalStage: 'number',
      policyPayDate: 'number',
      policyPaidStage: 'number',
      policyStageAverAmount: 'number',
      orderTime: 'number',
      operation: 'string',
      claimOrderNo: 'string',
      claimApplyTime: 'number',
      claimPayTime: 'number',
      claimApplyAmount: 'number',
      claimAmount: 'number',
      authorizeRecords: { 'type': 'array', 'itemType': AuthorizeRecordsPairs },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OperateAntchainBbpInsuranceResponse extends $tea.Model {
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
          sdk_version: "1.0.1",
          _prod_code: "ak_7257696016e54ac8a1e0ed2d532c3c09",
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
   * Description: 保单信息上链，保单信息同步
   * Summary: 保单信息上链
   */
  async operateAntchainBbpInsurance(request: OperateAntchainBbpInsuranceRequest): Promise<OperateAntchainBbpInsuranceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.operateAntchainBbpInsuranceEx(request, headers, runtime);
  }

  /**
   * Description: 保单信息上链，保单信息同步
   * Summary: 保单信息上链
   */
  async operateAntchainBbpInsuranceEx(request: OperateAntchainBbpInsuranceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<OperateAntchainBbpInsuranceResponse> {
    Util.validateModel(request);
    return $tea.cast<OperateAntchainBbpInsuranceResponse>(await this.doRequest("1.0", "antchain.bbp.insurance.operate", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new OperateAntchainBbpInsuranceResponse({}));
  }

}
