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

// 场所信息
export class SceneInfo extends $tea.Model {
  // 场所名称
  sceneName?: string;
  // 场所码
  sceneCode?: string;
  static names(): { [key: string]: string } {
    return {
      sceneName: 'scene_name',
      sceneCode: 'scene_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      sceneName: 'string',
      sceneCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 疫苗接种信息
export class VaccinationInfo extends $tea.Model {
  // 疫苗接种信息：
  // 0:查询失败 
  // 1:未接种
  // 2:已接种一针
  // 3:完成接种
  vaccinationCode?: string;
  // 疫苗接种信息
  vaccinationDesc?: string;
  // 疫苗接种时间戳（单位：ms）
  vaccinationTimestamp?: number;
  static names(): { [key: string]: string } {
    return {
      vaccinationCode: 'vaccination_code',
      vaccinationDesc: 'vaccination_desc',
      vaccinationTimestamp: 'vaccination_timestamp',
    };
  }

  static types(): { [key: string]: any } {
    return {
      vaccinationCode: 'string',
      vaccinationDesc: 'string',
      vaccinationTimestamp: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 行程信息
export class TravelInfo extends $tea.Model {
  // 行程码信息
  // 1:没去过疫情区，绿码;
  // 2:去过疫情区，红码;
  // 3:其他，黄码;
  // 0:行程信息不全;
  // -1:查询失败
  travelCode?: string;
  // 行程码异常原因
  travelFactor?: string;
  static names(): { [key: string]: string } {
    return {
      travelCode: 'travel_code',
      travelFactor: 'travel_factor',
    };
  }

  static types(): { [key: string]: any } {
    return {
      travelCode: 'string',
      travelFactor: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 抗原信息
export class AntigenInfo extends $tea.Model {
  // 抗原检测状态
  antigenResult?: string;
  // 抗原检测时间戳
  antigenTimestamp?: number;
  static names(): { [key: string]: string } {
    return {
      antigenResult: 'antigen_result',
      antigenTimestamp: 'antigen_timestamp',
    };
  }

  static types(): { [key: string]: any } {
    return {
      antigenResult: 'string',
      antigenTimestamp: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 健康码信息
export class HealthInfo extends $tea.Model {
  // 健康码编码：
  // 1:绿色 ，
  // 2:黄色 ，
  // 3:红色 ，
  // 4.灰码 。
  healthCode?: string;
  // 健康码红色原因
  healthFactor?: string;
  static names(): { [key: string]: string } {
    return {
      healthCode: 'health_code',
      healthFactor: 'health_factor',
    };
  }

  static types(): { [key: string]: any } {
    return {
      healthCode: 'string',
      healthFactor: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 核酸信息
export class NucleicAcidInfo extends $tea.Model {
  // 检测类型
  reportType?: string;
  // 检测结果
  reportResult?: string;
  // 检测机构
  reportOrganization?: string;
  // 检测时间戳(单位: ms)
  reportTimestamp?: number;
  static names(): { [key: string]: string } {
    return {
      reportType: 'report_type',
      reportResult: 'report_result',
      reportOrganization: 'report_organization',
      reportTimestamp: 'report_timestamp',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reportType: 'string',
      reportResult: 'string',
      reportOrganization: 'string',
      reportTimestamp: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryHealthinfoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 设备SN
  serialNo: string;
  // 设备厂商
  corpName: string;
  // 被查询人姓名
  name: string;
  // 被查询人身份证号
  certNo: string;
  // 防疫信息类型,枚举值如下：
  // 健康信息 health ,
  // 疫苗信息 vaccination ,
  // 核酸信息 nucleicAcid ,
  // 行程信息 travel ,
  // 抗原信息 antigen ,
  // 场景信息  scene .
  // 需要有多项信息类型时，用"|"分隔开。eg: "health|nucleicAcid"
  healthTypes: string;
  // 通行记录ID
  passId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      serialNo: 'serial_no',
      corpName: 'corp_name',
      name: 'name',
      certNo: 'cert_no',
      healthTypes: 'health_types',
      passId: 'pass_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      serialNo: 'string',
      corpName: 'string',
      name: 'string',
      certNo: 'string',
      healthTypes: 'string',
      passId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryHealthinfoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 健康信息
  healthInfo?: HealthInfo;
  // 核酸信息
  nucleicAcidInfo?: NucleicAcidInfo;
  // 行程信息
  // 
  travelInfo?: TravelInfo;
  // 疫苗接种信息
  vaccinationInfo?: VaccinationInfo;
  // 抗原信息
  antigenInfo?: AntigenInfo;
  // 场所信息
  sceneInfo?: SceneInfo;
  // 通行记录ID
  passId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      healthInfo: 'health_info',
      nucleicAcidInfo: 'nucleic_acid_info',
      travelInfo: 'travel_info',
      vaccinationInfo: 'vaccination_info',
      antigenInfo: 'antigen_info',
      sceneInfo: 'scene_info',
      passId: 'pass_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      healthInfo: HealthInfo,
      nucleicAcidInfo: NucleicAcidInfo,
      travelInfo: TravelInfo,
      vaccinationInfo: VaccinationInfo,
      antigenInfo: AntigenInfo,
      sceneInfo: SceneInfo,
      passId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushHealthinfologRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 通行记录ID
  passId: string;
  // 设备SN
  serialNo: string;
  // 设备厂商
  // 
  corpName: string;
  // 通行时长(ms)
  costTime: number;
  // 通行结果
  passResult?: string;
  // 被查询人姓名
  // 
  name?: string;
  // 被查询人身份证号
  certNo?: string;
  // 异常类型
  errorType?: string;
  // 错误码
  errorCode?: string;
  // 错误信息
  errorMsg?: string;
  // 体温
  temperature?: string;
  // 健康信息
  healthInfo?: HealthInfo;
  // 核酸信息
  nucleicAcidInfo?: NucleicAcidInfo;
  // 行程信息
  // 
  travelInfo?: TravelInfo;
  // 疫苗接种信息
  vaccinationInfo?: VaccinationInfo;
  // 抗原信息
  antigenInfo?: AntigenInfo;
  // 场所信息
  // 
  sceneInfo?: SceneInfo;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      passId: 'pass_id',
      serialNo: 'serial_no',
      corpName: 'corp_name',
      costTime: 'cost_time',
      passResult: 'pass_result',
      name: 'name',
      certNo: 'cert_no',
      errorType: 'error_type',
      errorCode: 'error_code',
      errorMsg: 'error_msg',
      temperature: 'temperature',
      healthInfo: 'health_info',
      nucleicAcidInfo: 'nucleic_acid_info',
      travelInfo: 'travel_info',
      vaccinationInfo: 'vaccination_info',
      antigenInfo: 'antigen_info',
      sceneInfo: 'scene_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      passId: 'string',
      serialNo: 'string',
      corpName: 'string',
      costTime: 'number',
      passResult: 'string',
      name: 'string',
      certNo: 'string',
      errorType: 'string',
      errorCode: 'string',
      errorMsg: 'string',
      temperature: 'string',
      healthInfo: HealthInfo,
      nucleicAcidInfo: NucleicAcidInfo,
      travelInfo: TravelInfo,
      vaccinationInfo: VaccinationInfo,
      antigenInfo: AntigenInfo,
      sceneInfo: SceneInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushHealthinfologResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 通行记录ID
  passId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      passId: 'pass_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      passId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetHealthinfoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 设备SN
  // 
  serialNo: string;
  // 设备厂商
  // 
  corpName: string;
  // 健康身份二维码
  qrCode: string;
  // 防疫信息类型,枚举值如下： 健康信息 health , 疫苗信息 vaccination , 核酸信息 nucleicAcid , 行程信息 travel , 抗原信息 antigen , 场景信息 scene . 需要有多项信息类型时，用"|"分隔开。eg: "health|nucleicAcid"
  healthTypes: string;
  // 通行记录ID
  // 
  passId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      serialNo: 'serial_no',
      corpName: 'corp_name',
      qrCode: 'qr_code',
      healthTypes: 'health_types',
      passId: 'pass_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      serialNo: 'string',
      corpName: 'string',
      qrCode: 'string',
      healthTypes: 'string',
      passId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetHealthinfoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 健康信息
  // 
  healthInfo?: HealthInfo;
  // 核酸信息
  // 
  nucleicAcidInfo?: NucleicAcidInfo;
  // 行程信息
  // 
  travelInfo?: TravelInfo;
  // 疫苗接种信息
  // 
  vaccinationInfo?: VaccinationInfo;
  // 抗原信息
  // 
  antigenInfo?: AntigenInfo;
  // 场所信息
  // 
  sceneInfo?: SceneInfo;
  // 被查询人姓名
  name?: string;
  // 被查询人身份证号
  // 
  certNo?: string;
  // 通行记录ID
  passId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      healthInfo: 'health_info',
      nucleicAcidInfo: 'nucleic_acid_info',
      travelInfo: 'travel_info',
      vaccinationInfo: 'vaccination_info',
      antigenInfo: 'antigen_info',
      sceneInfo: 'scene_info',
      name: 'name',
      certNo: 'cert_no',
      passId: 'pass_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      healthInfo: HealthInfo,
      nucleicAcidInfo: NucleicAcidInfo,
      travelInfo: TravelInfo,
      vaccinationInfo: VaccinationInfo,
      antigenInfo: AntigenInfo,
      sceneInfo: SceneInfo,
      name: 'string',
      certNo: 'string',
      passId: 'string',
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
          sdk_version: "1.0.3",
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
   * Description: 查询防疫健康信息
   * Summary: 查询防疫健康信息
   */
  async queryHealthinfo(request: QueryHealthinfoRequest): Promise<QueryHealthinfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryHealthinfoEx(request, headers, runtime);
  }

  /**
   * Description: 查询防疫健康信息
   * Summary: 查询防疫健康信息
   */
  async queryHealthinfoEx(request: QueryHealthinfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryHealthinfoResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryHealthinfoResponse>(await this.doRequest("1.0", "antchain.antim.healthinfo.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryHealthinfoResponse({}));
  }

  /**
   * Description: 上报通行记录
   * Summary: 上报通行记录
   */
  async pushHealthinfolog(request: PushHealthinfologRequest): Promise<PushHealthinfologResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pushHealthinfologEx(request, headers, runtime);
  }

  /**
   * Description: 上报通行记录
   * Summary: 上报通行记录
   */
  async pushHealthinfologEx(request: PushHealthinfologRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PushHealthinfologResponse> {
    Util.validateModel(request);
    return $tea.cast<PushHealthinfologResponse>(await this.doRequest("1.0", "antchain.antim.healthinfolog.push", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PushHealthinfologResponse({}));
  }

  /**
   * Description: 健康身份二维码反查防疫健康信息
   * Summary: 健康身份二维码反查防疫健康信息
   */
  async getHealthinfo(request: GetHealthinfoRequest): Promise<GetHealthinfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getHealthinfoEx(request, headers, runtime);
  }

  /**
   * Description: 健康身份二维码反查防疫健康信息
   * Summary: 健康身份二维码反查防疫健康信息
   */
  async getHealthinfoEx(request: GetHealthinfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetHealthinfoResponse> {
    Util.validateModel(request);
    return $tea.cast<GetHealthinfoResponse>(await this.doRequest("1.0", "antchain.antim.healthinfo.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetHealthinfoResponse({}));
  }

}
