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

// 用户信息
export class CarUserInfo extends $tea.Model {
  // 唯一标识用户的id
  userId: string;
  // 手机号
  phoneNum: string;
  // 城市编码
  cityCode: string;
  // 姓名
  userCertName?: string;
  // 证件号码
  userCertNo?: string;
  // 性别
  userGender?: string;
  // 昵称
  nick?: string;
  static names(): { [key: string]: string } {
    return {
      userId: 'user_id',
      phoneNum: 'phone_num',
      cityCode: 'city_code',
      userCertName: 'user_cert_name',
      userCertNo: 'user_cert_no',
      userGender: 'user_gender',
      nick: 'nick',
    };
  }

  static types(): { [key: string]: any } {
    return {
      userId: 'string',
      phoneNum: 'string',
      cityCode: 'string',
      userCertName: 'string',
      userCertNo: 'string',
      userGender: 'string',
      nick: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 新车线索集合
export class NewCarInfo extends $tea.Model {
  // 车系
  carSeries: string;
  // 金融方案
  finaicalPlan?: string;
  // 车系id
  carSeriesId?: string;
  // 请求提交唯一id
  submitId?: string;
  // 预计购买时间
  purcharseTime?: string;
  // 用户信息
  userInfo: CarUserInfo;
  // 懂车帝或者汽车之家
  matchSource?: string;
  // 汽车之家车型id
  qcCarSeriesId?: string;
  static names(): { [key: string]: string } {
    return {
      carSeries: 'car_series',
      finaicalPlan: 'finaical_plan',
      carSeriesId: 'car_series_id',
      submitId: 'submit_id',
      purcharseTime: 'purcharse_time',
      userInfo: 'user_info',
      matchSource: 'match_source',
      qcCarSeriesId: 'qc_car_series_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      carSeries: 'string',
      finaicalPlan: 'string',
      carSeriesId: 'string',
      submitId: 'string',
      purcharseTime: 'string',
      userInfo: CarUserInfo,
      matchSource: 'string',
      qcCarSeriesId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 车信息
export class BasicCarInfo extends $tea.Model {
  // 车牌号
  licenseNo: string;
  // 车架号
  vin: string;
  // 发动机号
  engineNo: string;
  // 初登日期
  registerDate: string;
  // 车辆型号
  modelCode: string;
  // 营运性质
  useNatureCode: string;
  // 是否抵押
  mortgage?: boolean;
  static names(): { [key: string]: string } {
    return {
      licenseNo: 'license_no',
      vin: 'vin',
      engineNo: 'engine_no',
      registerDate: 'register_date',
      modelCode: 'model_code',
      useNatureCode: 'use_nature_code',
      mortgage: 'mortgage',
    };
  }

  static types(): { [key: string]: any } {
    return {
      licenseNo: 'string',
      vin: 'string',
      engineNo: 'string',
      registerDate: 'string',
      modelCode: 'string',
      useNatureCode: 'string',
      mortgage: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 用户基本信息
export class CarOwnerUserInfo extends $tea.Model {
  // 用户id
  userId: string;
  // 手机号
  phoneNum: string;
  static names(): { [key: string]: string } {
    return {
      userId: 'user_id',
      phoneNum: 'phone_num',
    };
  }

  static types(): { [key: string]: any } {
    return {
      userId: 'string',
      phoneNum: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 批量提交结果
export class BatchSubmitCarResult extends $tea.Model {
  // 提交线索唯一请求id
  submitId: string;
  // 是否成功
  isSuccess: boolean;
  // OK NO_DEMAND 无线索需求，需要重试 INVALID 无效，不要重试
  pushResultCode: string;
  static names(): { [key: string]: string } {
    return {
      submitId: 'submit_id',
      isSuccess: 'is_success',
      pushResultCode: 'push_result_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      submitId: 'string',
      isSuccess: 'boolean',
      pushResultCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 车辆信息
export class CarInfo extends $tea.Model {
  // 车牌号
  licenseNo: string;
  // 车架号
  vin: string;
  // 发动机号
  engineNo: string;
  // 注册日期
  registerDate: string;
  // 车型
  modelCode: string;
  static names(): { [key: string]: string } {
    return {
      licenseNo: 'license_no',
      vin: 'vin',
      engineNo: 'engine_no',
      registerDate: 'register_date',
      modelCode: 'model_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      licenseNo: 'string',
      vin: 'string',
      engineNo: 'string',
      registerDate: 'string',
      modelCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushCarloanRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 车信息
  basicCarInfo: BasicCarInfo;
  // 用户信息
  userInfo: CarUserInfo;
  // 场景码
  sceneCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      basicCarInfo: 'basic_car_info',
      userInfo: 'user_info',
      sceneCode: 'scene_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      basicCarInfo: BasicCarInfo,
      userInfo: CarUserInfo,
      sceneCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushCarloanResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否推送成功
  pushSuccess?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      pushSuccess: 'push_success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      pushSuccess: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RegisterCarownerRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 唯一场景码
  sceneCode: string;
  // 用户基本信息
  userInfo: CarOwnerUserInfo;
  // 车辆信息
  carInfo: CarInfo;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      sceneCode: 'scene_code',
      userInfo: 'user_info',
      carInfo: 'car_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      sceneCode: 'string',
      userInfo: CarOwnerUserInfo,
      carInfo: CarInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RegisterCarownerResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否成功
  pushSuccess?: boolean;
  // token
  token?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      pushSuccess: 'push_success',
      token: 'token',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      pushSuccess: 'boolean',
      token: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchcreateNewcarRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // testchannleCode
  sceneCode: string;
  // 新车线索集合
  newCarInfo: NewCarInfo[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      sceneCode: 'scene_code',
      newCarInfo: 'new_car_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      sceneCode: 'string',
      newCarInfo: { 'type': 'array', 'itemType': NewCarInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchcreateNewcarResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 批量提交结果
  batchSubmitCarResult?: BatchSubmitCarResult[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      batchSubmitCarResult: 'batch_submit_car_result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      batchSubmitCarResult: { 'type': 'array', 'itemType': BatchSubmitCarResult },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SubmitNewcarRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 场景码
  sceneCode: string;
  // 用户信息
  userInfo: CarUserInfo;
  // 车系
  carSeries: string;
  // 金融方案
  finaicalPlan?: string;
  // 	
  // 预计购买时间
  purcharseTime?: string;
  // xxxx
  carSeriesId?: string;
  // 提交线索的唯一id
  submitId?: string;
  // 汽车之家车系id
  qcCarSeriesId?: string;
  // 匹配源
  matchSource?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      sceneCode: 'scene_code',
      userInfo: 'user_info',
      carSeries: 'car_series',
      finaicalPlan: 'finaical_plan',
      purcharseTime: 'purcharse_time',
      carSeriesId: 'car_series_id',
      submitId: 'submit_id',
      qcCarSeriesId: 'qc_car_series_id',
      matchSource: 'match_source',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      sceneCode: 'string',
      userInfo: CarUserInfo,
      carSeries: 'string',
      finaicalPlan: 'string',
      purcharseTime: 'string',
      carSeriesId: 'string',
      submitId: 'string',
      qcCarSeriesId: 'string',
      matchSource: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SubmitNewcarResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // OK NO_DEMAND 无线索需求，需要重试 INVALID 无效，不要重试
  pushResultCode?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      pushResultCode: 'push_result_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      pushResultCode: 'string',
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
          sdk_version: "1.0.4",
          _prod_code: "INTELLICAR",
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
   * Description: 推送星贷车信息
   * Summary: 推送星贷车信息
   */
  async pushCarloan(request: PushCarloanRequest): Promise<PushCarloanResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pushCarloanEx(request, headers, runtime);
  }

  /**
   * Description: 推送星贷车信息
   * Summary: 推送星贷车信息
   */
  async pushCarloanEx(request: PushCarloanRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PushCarloanResponse> {
    Util.validateModel(request);
    return $tea.cast<PushCarloanResponse>(await this.doRequest("1.0", "antdigital.intellicar.carloan.push", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PushCarloanResponse({}));
  }

  /**
   * Description: 车主信息提交
   * Summary:  车主信息提交
   */
  async registerCarowner(request: RegisterCarownerRequest): Promise<RegisterCarownerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.registerCarownerEx(request, headers, runtime);
  }

  /**
   * Description: 车主信息提交
   * Summary:  车主信息提交
   */
  async registerCarownerEx(request: RegisterCarownerRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RegisterCarownerResponse> {
    Util.validateModel(request);
    return $tea.cast<RegisterCarownerResponse>(await this.doRequest("1.0", "antdigital.intellicar.carowner.register", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RegisterCarownerResponse({}));
  }

  /**
   * Description: 新车线索批量提交
   * Summary: 新车线索批量提交
   */
  async batchcreateNewcar(request: BatchcreateNewcarRequest): Promise<BatchcreateNewcarResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchcreateNewcarEx(request, headers, runtime);
  }

  /**
   * Description: 新车线索批量提交
   * Summary: 新车线索批量提交
   */
  async batchcreateNewcarEx(request: BatchcreateNewcarRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchcreateNewcarResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchcreateNewcarResponse>(await this.doRequest("1.0", "antdigital.intellicar.newcar.batchcreate", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchcreateNewcarResponse({}));
  }

  /**
   * Description: 提交新车线索
   * Summary:  提交新车线索
   */
  async submitNewcar(request: SubmitNewcarRequest): Promise<SubmitNewcarResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.submitNewcarEx(request, headers, runtime);
  }

  /**
   * Description: 提交新车线索
   * Summary:  提交新车线索
   */
  async submitNewcarEx(request: SubmitNewcarRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SubmitNewcarResponse> {
    Util.validateModel(request);
    return $tea.cast<SubmitNewcarResponse>(await this.doRequest("1.0", "antdigital.intellicar.newcar.submit", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SubmitNewcarResponse({}));
  }

}
