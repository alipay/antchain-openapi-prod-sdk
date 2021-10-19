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

// 修复数据
export class RepairData extends $tea.Model {
  // 修复结果状态：“RPS001”: 不可外呼，”RPS002":可以 外呼
  repairStatus: string;
  // 身份证号
  idCard: string;
  // 姓名：显示的姓名为修复请求的 待修复人名
  userName: string;
  // 案件编号，特定使用运营商页面平台产生
  caseNo?: string;
  // 修复号码数量
  resultListNumber: number;
  static names(): { [key: string]: string } {
    return {
      repairStatus: 'repair_status',
      idCard: 'id_card',
      userName: 'user_name',
      caseNo: 'case_no',
      resultListNumber: 'result_list_number',
    };
  }

  static types(): { [key: string]: any } {
    return {
      repairStatus: 'string',
      idCard: 'string',
      userName: 'string',
      caseNo: 'string',
      resultListNumber: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 预测请求结构体
export class PredictRequest extends $tea.Model {
  // 资产明细ID
  assetDetailId?: string;
  // 身份证号码MD5
  certNoMd5: string;
  // 已还总额,默认0
  paybackAmount?: number;
  // 已还期数，默认0
  paybackNum?: number;
  // 逾期月数
  overdueMonth?: number;
  // 债务人信用分数，由系统计算得出，无须传入。
  predictionScore?: string;
  // 手机号码MD5
  mobileMd5?: string;
  static names(): { [key: string]: string } {
    return {
      assetDetailId: 'asset_detail_id',
      certNoMd5: 'cert_no_md5',
      paybackAmount: 'payback_amount',
      paybackNum: 'payback_num',
      overdueMonth: 'overdue_month',
      predictionScore: 'prediction_score',
      mobileMd5: 'mobile_md5',
    };
  }

  static types(): { [key: string]: any } {
    return {
      assetDetailId: 'string',
      certNoMd5: 'string',
      paybackAmount: 'number',
      paybackNum: 'number',
      overdueMonth: 'number',
      predictionScore: 'string',
      mobileMd5: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 预测结果响应体
export class PredictResponse extends $tea.Model {
  // 资产明细ID
  assetDetailId?: string;
  // 反向指标
  probability0?: string;
  // 正向指标
  probability1?: string;
  // 身份证号码MD5
  certNoMd5?: string;
  // 身份证号码MD5
  mobileMd5?: string;
  // 可选值，A,B,C
  level?: string;
  static names(): { [key: string]: string } {
    return {
      assetDetailId: 'asset_detail_id',
      probability0: 'probability0',
      probability1: 'probability1',
      certNoMd5: 'cert_no_md5',
      mobileMd5: 'mobile_md5',
      level: 'level',
    };
  }

  static types(): { [key: string]: any } {
    return {
      assetDetailId: 'string',
      probability0: 'string',
      probability1: 'string',
      certNoMd5: 'string',
      mobileMd5: 'string',
      level: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 修复批次状态
export class BatchRepairData extends $tea.Model {
  // "RPBS001":待修复,"RPBS002": 修 复 中 "RPBS003": 已 修 复,"RPBS004":修复失败
  repairBatchStatus: string;
  // 修复时间
  repairTime: string;
  // 参见RepairData
  repairDatas: RepairData[];
  static names(): { [key: string]: string } {
    return {
      repairBatchStatus: 'repair_batch_status',
      repairTime: 'repair_time',
      repairDatas: 'repair_datas',
    };
  }

  static types(): { [key: string]: any } {
    return {
      repairBatchStatus: 'string',
      repairTime: 'string',
      repairDatas: { 'type': 'array', 'itemType': RepairData },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 绑定接口返回的绑定信息
export class BindData extends $tea.Model {
  // 虚拟小号（实际拨打以返回的 telX 为主）
  telX: string;
  // 该次绑定唯一 id
  bindId: string;
  static names(): { [key: string]: string } {
    return {
      telX: 'tel_x',
      bindId: 'bind_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      telX: 'string',
      bindId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 发起修复的响应对象，
export class BatchInfo extends $tea.Model {
  // 修复的批次号
  batchId: string;
  static names(): { [key: string]: string } {
    return {
      batchId: 'batch_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      batchId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 待修复的债务人信息
export class PersonData extends $tea.Model {
  // 姓名
  userName: string;
  // 待修复 sha256 加密身份证号
  idCard: string;
  // 手机号
  phone?: string;
  static names(): { [key: string]: string } {
    return {
      userName: 'user_name',
      idCard: 'id_card',
      phone: 'phone',
    };
  }

  static types(): { [key: string]: any } {
    return {
      userName: 'string',
      idCard: 'string',
      phone: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryPredictRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 待预测请求体列表
  data: PredictRequest[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      data: { 'type': 'array', 'itemType': PredictRequest },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryPredictResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 预测结果返回列表
  data?: PredictResponse[];
  // 资产包的回款率
  returnRate?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      returnRate: 'return_rate',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: { 'type': 'array', 'itemType': PredictResponse },
      returnRate: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartSlxfRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 待修复人list
  data: PersonData[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      data: { 'type': 'array', 'itemType': PersonData },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartSlxfResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回批次，JSON对象， 比如：{batchId:xxxxx}
  data?: BatchInfo;
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
      data: BatchInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PullSlxfRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // {"batchId":"xxx"}
  batchId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      batchId: 'batch_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      batchId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PullSlxfResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 参考结构体类型
  data?: BatchRepairData;
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
      data: BatchRepairData,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySlxfRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 修复批次号
  batchId: string;
  // Sha256 加密后的身 份证号
  idCard: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      batchId: 'batch_id',
      idCard: 'id_card',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      batchId: 'string',
      idCard: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySlxfResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 其中数组中的每一项 为 脱 敏 手 机 号 码 unicomCustomerId ，请求外呼 时使用
  data?: string[];
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
      data: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BindSlxfRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 修复批次号
  batchId: string;
  // 待 修 复 sha256 加 密身份证号
  idCard: string;
  // 脱敏后手机号码加密串， 需要拨打的该手机号码
  unicomCustomerId: string;
  // 主叫号码，号码要求备案
  seatNumber: string;
  // 外显号，外显号要求在外 显号池中
  showNumber: string;
  // 虚拟小号， 线下分 配
  telX: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      batchId: 'batch_id',
      idCard: 'id_card',
      unicomCustomerId: 'unicom_customer_id',
      seatNumber: 'seat_number',
      showNumber: 'show_number',
      telX: 'tel_x',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      batchId: 'string',
      idCard: 'string',
      unicomCustomerId: 'string',
      seatNumber: 'string',
      showNumber: 'string',
      telX: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BindSlxfResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // "data": {"telX": "xxx","bindId": "xxx" }
  data?: BindData;
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
      data: BindData,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UnbindSlxfRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 绑定唯一 id
  bindId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bindId: 'bind_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bindId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UnbindSlxfResponse extends $tea.Model {
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
          sdk_version: "1.0.12",
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
   * Description: 资产定价处置预测 
   * Summary: 资产定价处置预测
   */
  async queryPredict(request: QueryPredictRequest): Promise<QueryPredictResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPredictEx(request, headers, runtime);
  }

  /**
   * Description: 资产定价处置预测 
   * Summary: 资产定价处置预测
   */
  async queryPredictEx(request: QueryPredictRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPredictResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPredictResponse>(await this.doRequest("1.0", "antchain.donpa.predict.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPredictResponse({}));
  }

  /**
   * Description: 失联修复发起API接口
   * Summary: 失联修复发起API接口
   */
  async startSlxf(request: StartSlxfRequest): Promise<StartSlxfResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.startSlxfEx(request, headers, runtime);
  }

  /**
   * Description: 失联修复发起API接口
   * Summary: 失联修复发起API接口
   */
  async startSlxfEx(request: StartSlxfRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<StartSlxfResponse> {
    Util.validateModel(request);
    return $tea.cast<StartSlxfResponse>(await this.doRequest("1.0", "antchain.donpa.slxf.start", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new StartSlxfResponse({}));
  }

  /**
   * Description: 通过修复批次号获取修复结果，判断是否可以外呼。修复是异步的，一般需要 2 个小时。建议客户半小时 定时轮询一次，直至批次状态为终态（已修复或者修 复失败）
   * Summary: 获取修复结果接口
   */
  async pullSlxf(request: PullSlxfRequest): Promise<PullSlxfResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pullSlxfEx(request, headers, runtime);
  }

  /**
   * Description: 通过修复批次号获取修复结果，判断是否可以外呼。修复是异步的，一般需要 2 个小时。建议客户半小时 定时轮询一次，直至批次状态为终态（已修复或者修 复失败）
   * Summary: 获取修复结果接口
   */
  async pullSlxfEx(request: PullSlxfRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PullSlxfResponse> {
    Util.validateModel(request);
    return $tea.cast<PullSlxfResponse>(await this.doRequest("1.0", "antchain.donpa.slxf.pull", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PullSlxfResponse({}));
  }

  /**
   * Description: 根据身份证号查询修复的脱敏手机号码
   * Summary: 查询修复结果
   */
  async querySlxf(request: QuerySlxfRequest): Promise<QuerySlxfResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.querySlxfEx(request, headers, runtime);
  }

  /**
   * Description: 根据身份证号查询修复的脱敏手机号码
   * Summary: 查询修复结果
   */
  async querySlxfEx(request: QuerySlxfRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QuerySlxfResponse> {
    Util.validateModel(request);
    return $tea.cast<QuerySlxfResponse>(await this.doRequest("1.0", "antchain.donpa.slxf.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QuerySlxfResponse({}));
  }

  /**
   * Description: 绑定虚拟小号，绑定的虚拟小号失效时间为 1 个小时，1 个小时后自动解绑
   * Summary: 绑定虚拟小号接口
   */
  async bindSlxf(request: BindSlxfRequest): Promise<BindSlxfResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.bindSlxfEx(request, headers, runtime);
  }

  /**
   * Description: 绑定虚拟小号，绑定的虚拟小号失效时间为 1 个小时，1 个小时后自动解绑
   * Summary: 绑定虚拟小号接口
   */
  async bindSlxfEx(request: BindSlxfRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BindSlxfResponse> {
    Util.validateModel(request);
    return $tea.cast<BindSlxfResponse>(await this.doRequest("1.0", "antchain.donpa.slxf.bind", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BindSlxfResponse({}));
  }

  /**
   * Description: 解绑虚拟小号
   * Summary: 解绑虚拟小号接口
   */
  async unbindSlxf(request: UnbindSlxfRequest): Promise<UnbindSlxfResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.unbindSlxfEx(request, headers, runtime);
  }

  /**
   * Description: 解绑虚拟小号
   * Summary: 解绑虚拟小号接口
   */
  async unbindSlxfEx(request: UnbindSlxfRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UnbindSlxfResponse> {
    Util.validateModel(request);
    return $tea.cast<UnbindSlxfResponse>(await this.doRequest("1.0", "antchain.donpa.slxf.unbind", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UnbindSlxfResponse({}));
  }

}
