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

// 规则明细
export class RuleDetail extends $tea.Model {
  // 项目类别
  type: string;
  // 领域
  fieId: string;
  // 级别
  level: string;
  // 资质
  qualifications: string;
  // 保定报价
  priceBd: number;
  // 离岸价格
  fobPrice: number;
  // 离岸价格
  priceTj: number;
  // 北京报价
  priceBj: number;
  // 最少提供人数
  numpeople: number;
  static names(): { [key: string]: string } {
    return {
      type: 'type',
      fieId: 'fie_id',
      level: 'level',
      qualifications: 'qualifications',
      priceBd: 'price_bd',
      fobPrice: 'fob_price',
      priceTj: 'price_tj',
      priceBj: 'price_bj',
      numpeople: 'numpeople',
    };
  }

  static types(): { [key: string]: any } {
    return {
      type: 'string',
      fieId: 'string',
      level: 'string',
      qualifications: 'string',
      priceBd: 'number',
      fobPrice: 'number',
      priceTj: 'number',
      priceBj: 'number',
      numpeople: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 对账单
export class Reconciliation extends $tea.Model {
  // 供应商
  supCode: string;
  // 供应商名称
  supName: string;
  // 结算金额(单位分)
  settlementAmount: number;
  // 长城确认时间
  confirmDateGw: string;
  // 长城方确认人
  confirmerGw: string;
  // 长城确认状态
  confirmStateGw: string;
  // 服务方确认时间
  confirmDateSup: string;
  // 服务方确认人
  confirmerSup: string;
  // 服务方确认状态
  confirmStateSup: string;
  // 计算时间
  socreDate: string;
  static names(): { [key: string]: string } {
    return {
      supCode: 'sup_code',
      supName: 'sup_name',
      settlementAmount: 'settlement_amount',
      confirmDateGw: 'confirm_date_gw',
      confirmerGw: 'confirmer_gw',
      confirmStateGw: 'confirm_state_gw',
      confirmDateSup: 'confirm_date_sup',
      confirmerSup: 'confirmer_sup',
      confirmStateSup: 'confirm_state_sup',
      socreDate: 'socre_date',
    };
  }

  static types(): { [key: string]: any } {
    return {
      supCode: 'string',
      supName: 'string',
      settlementAmount: 'number',
      confirmDateGw: 'string',
      confirmerGw: 'string',
      confirmStateGw: 'string',
      confirmDateSup: 'string',
      confirmerSup: 'string',
      confirmStateSup: 'string',
      socreDate: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 供应商
export class SpProvider extends $tea.Model {
  // 供应商编号
  supCode: string;
  // 供应商名称
  supName: string;
  // 文件名称
  fileName: string;
  // 文件code
  fileCode: string;
  // hash的值
  hashCode: string;
  // 开始时间
  startDate: string;
  // 结束日期
  closingDate: string;
  // 文件路径
  filePath: string;
  // 2021-03-04 11:16:23
  createDate: string;
  // 创建者
  creator: string;
  static names(): { [key: string]: string } {
    return {
      supCode: 'sup_code',
      supName: 'sup_name',
      fileName: 'file_name',
      fileCode: 'file_code',
      hashCode: 'hash_code',
      startDate: 'start_date',
      closingDate: 'closing_date',
      filePath: 'file_path',
      createDate: 'create_date',
      creator: 'creator',
    };
  }

  static types(): { [key: string]: any } {
    return {
      supCode: 'string',
      supName: 'string',
      fileName: 'string',
      fileCode: 'string',
      hashCode: 'string',
      startDate: 'string',
      closingDate: 'string',
      filePath: 'string',
      createDate: 'string',
      creator: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyAntchainBbpContractRuleRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 服务提供商
  spProvider: SpProvider;
  // 明细
  ruleDetails: RuleDetail[];
  // confirmer
  confirmer: string;
  // 确认时间
  confirmDate: string;
  // confirm_status
  confirmStatus: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      spProvider: 'sp_provider',
      ruleDetails: 'rule_details',
      confirmer: 'confirmer',
      confirmDate: 'confirm_date',
      confirmStatus: 'confirm_status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      spProvider: SpProvider,
      ruleDetails: { 'type': 'array', 'itemType': RuleDetail },
      confirmer: 'string',
      confirmDate: 'string',
      confirmStatus: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyAntchainBbpContractRuleResponse extends $tea.Model {
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

export class QueryAntchainBbpContractReconciliationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 供应商code
  supCode: string;
  // 月份
  scoreDates: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      supCode: 'sup_code',
      scoreDates: 'score_dates',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      supCode: 'string',
      scoreDates: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntchainBbpContractReconciliationResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 结算单
  reconciliations?: Reconciliation[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      reconciliations: 'reconciliations',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      reconciliations: { 'type': 'array', 'itemType': Reconciliation },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDemoSaasTestTestaRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 张三
  name: string;
  // 12
  age: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      name: 'name',
      age: 'age',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      name: 'string',
      age: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDemoSaasTestTestaResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 男
  sex?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      sex: 'sex',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      sex: 'string',
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
   * Description: 定义外包的薪资方案接口,以【服务商、项目类别、领域、角色、资质】为unique
   * Summary: 外包薪资规则合约发布接口
   */
  async applyAntchainBbpContractRule(request: ApplyAntchainBbpContractRuleRequest): Promise<ApplyAntchainBbpContractRuleResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyAntchainBbpContractRuleEx(request, headers, runtime);
  }

  /**
   * Description: 定义外包的薪资方案接口,以【服务商、项目类别、领域、角色、资质】为unique
   * Summary: 外包薪资规则合约发布接口
   */
  async applyAntchainBbpContractRuleEx(request: ApplyAntchainBbpContractRuleRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyAntchainBbpContractRuleResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyAntchainBbpContractRuleResponse>(await this.doRequest("1.0", "antchain.bbp.contract.rule.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyAntchainBbpContractRuleResponse({}));
  }

  /**
   * Description: 查询结算单
   * Summary: 查询结算单
   */
  async queryAntchainBbpContractReconciliation(request: QueryAntchainBbpContractReconciliationRequest): Promise<QueryAntchainBbpContractReconciliationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAntchainBbpContractReconciliationEx(request, headers, runtime);
  }

  /**
   * Description: 查询结算单
   * Summary: 查询结算单
   */
  async queryAntchainBbpContractReconciliationEx(request: QueryAntchainBbpContractReconciliationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAntchainBbpContractReconciliationResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAntchainBbpContractReconciliationResponse>(await this.doRequest("1.0", "antchain.bbp.contract.reconciliation.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAntchainBbpContractReconciliationResponse({}));
  }

  /**
   * Description: testa
   * Summary: 测试用api
   */
  async queryDemoSaasTestTesta(request: QueryDemoSaasTestTestaRequest): Promise<QueryDemoSaasTestTestaResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDemoSaasTestTestaEx(request, headers, runtime);
  }

  /**
   * Description: testa
   * Summary: 测试用api
   */
  async queryDemoSaasTestTestaEx(request: QueryDemoSaasTestTestaRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDemoSaasTestTestaResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDemoSaasTestTestaResponse>(await this.doRequest("1.0", "demo.saas.test.testa.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDemoSaasTestTestaResponse({}));
  }

}
