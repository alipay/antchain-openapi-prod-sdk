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

// api信息结构体
export class ApiInfoModel extends $tea.Model {
  // api名称
  apiName: string;
  // API所属网关技术产品码
  prodCode: string;
  // 是否是内部接口 0对外 1对内
  internal: number;
  // api版本号
  apiVersion: string;
  // api描述
  apiDesc: string;
  // api所属网关产品id
  providerId: string;
  static names(): { [key: string]: string } {
    return {
      apiName: 'api_name',
      prodCode: 'prod_code',
      internal: 'internal',
      apiVersion: 'api_version',
      apiDesc: 'api_desc',
      providerId: 'provider_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      apiName: 'string',
      prodCode: 'string',
      internal: 'number',
      apiVersion: 'string',
      apiDesc: 'string',
      providerId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 能力信息
export class AbilityInfo extends $tea.Model {
  // 能力编号
  abilityId: string;
  // 能力名称
  abilityName: string;
  // 研发负责人
  devOwner: string;
  // 创建时间
  gmtCreate: string;
  // 描述信息
  description: string;
  // 研发负责人邮箱前缀
  devOwnerPrefixEmail: string;
  // 产品负责人
  productOwner: string;
  // 能力对应商业中台L5Code
  businessCode?: string;
  // apiInfoModels列表
  apiInfoModels: ApiInfoModel[];
  // 能力sla看板url
  slaUrl?: string;
  static names(): { [key: string]: string } {
    return {
      abilityId: 'ability_id',
      abilityName: 'ability_name',
      devOwner: 'dev_owner',
      gmtCreate: 'gmt_create',
      description: 'description',
      devOwnerPrefixEmail: 'dev_owner_prefix_email',
      productOwner: 'product_owner',
      businessCode: 'business_code',
      apiInfoModels: 'api_info_models',
      slaUrl: 'sla_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      abilityId: 'string',
      abilityName: 'string',
      devOwner: 'string',
      gmtCreate: 'string',
      description: 'string',
      devOwnerPrefixEmail: 'string',
      productOwner: 'string',
      businessCode: 'string',
      apiInfoModels: { 'type': 'array', 'itemType': ApiInfoModel },
      slaUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntchainAbcAbcdaAbcddaaRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntchainAbcAbcdaAbcddaaResponse extends $tea.Model {
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

export class BindDemoAaaBbbCccRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 123
  date: string;
  // 123
  data: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      date: 'date',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      date: 'string',
      data: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BindDemoAaaBbbCccResponse extends $tea.Model {
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

export class BindAntchainSaasAbilityRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // api名称
  apiName: string;
  // 能力id列表
  abilityIds: string[];
  // 操作人的域账号
  operatorId: string;
  // api信息
  apiInfoModel: ApiInfoModel;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      apiName: 'api_name',
      abilityIds: 'ability_ids',
      operatorId: 'operator_id',
      apiInfoModel: 'api_info_model',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      apiName: 'string',
      abilityIds: { 'type': 'array', 'itemType': 'string' },
      operatorId: 'string',
      apiInfoModel: ApiInfoModel,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BindAntchainSaasAbilityResponse extends $tea.Model {
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

export class QueryDemoAbcAbcAbcRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDemoAbcAbcAbcResponse extends $tea.Model {
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

export class CallbackAntchainSaasAbilityRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // api名称集合
  apiNames: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      apiNames: 'api_names',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      apiNames: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CallbackAntchainSaasAbilityResponse extends $tea.Model {
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

export class BindAntchainSaasAbilityApiRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 共享能力id
  abilityId: string;
  // qiujianglong.qjl
  operatorId: string;
  // api模型集合
  apiInfoModels: ApiInfoModel[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      abilityId: 'ability_id',
      operatorId: 'operator_id',
      apiInfoModels: 'api_info_models',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      abilityId: 'string',
      operatorId: 'string',
      apiInfoModels: { 'type': 'array', 'itemType': ApiInfoModel },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BindAntchainSaasAbilityApiResponse extends $tea.Model {
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

export class QueryAntchainSaasAbilityBusinesscodeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 能力id
  abilityId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      abilityId: 'ability_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      abilityId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntchainSaasAbilityBusinesscodeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 能力信息
  abilityInfo?: AbilityInfo;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      abilityInfo: 'ability_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      abilityInfo: AbilityInfo,
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
          sdk_version: "1.0.10",
          _prod_code: "ak_a1f82644937c486c81a62b0e5a6b4fbe",
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
   * Description: 调试a s dddd
   * Summary: 调试1
   */
  async queryAntchainAbcAbcdaAbcddaa(request: QueryAntchainAbcAbcdaAbcddaaRequest): Promise<QueryAntchainAbcAbcdaAbcddaaResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAntchainAbcAbcdaAbcddaaEx(request, headers, runtime);
  }

  /**
   * Description: 调试a s dddd
   * Summary: 调试1
   */
  async queryAntchainAbcAbcdaAbcddaaEx(request: QueryAntchainAbcAbcdaAbcddaaRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAntchainAbcAbcdaAbcddaaResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAntchainAbcAbcdaAbcddaaResponse>(await this.doRequest("1.0", "antchain.abc.abcda.abcddaa.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAntchainAbcAbcdaAbcddaaResponse({}));
  }

  /**
   * Description: 自动化测试创建test，请勿修改、删除
   * Summary: 自动化测试创建test1
   */
  async bindDemoAaaBbbCcc(request: BindDemoAaaBbbCccRequest): Promise<BindDemoAaaBbbCccResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.bindDemoAaaBbbCccEx(request, headers, runtime);
  }

  /**
   * Description: 自动化测试创建test，请勿修改、删除
   * Summary: 自动化测试创建test1
   */
  async bindDemoAaaBbbCccEx(request: BindDemoAaaBbbCccRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BindDemoAaaBbbCccResponse> {
    Util.validateModel(request);
    return $tea.cast<BindDemoAaaBbbCccResponse>(await this.doRequest("1.0", "demo.aaa.bbb.ccc.bind", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BindDemoAaaBbbCccResponse({}));
  }

  /**
   * Description: 绑定API
   * Summary: 绑定能力与API关系
   */
  async bindAntchainSaasAbility(request: BindAntchainSaasAbilityRequest): Promise<BindAntchainSaasAbilityResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.bindAntchainSaasAbilityEx(request, headers, runtime);
  }

  /**
   * Description: 绑定API
   * Summary: 绑定能力与API关系
   */
  async bindAntchainSaasAbilityEx(request: BindAntchainSaasAbilityRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BindAntchainSaasAbilityResponse> {
    Util.validateModel(request);
    return $tea.cast<BindAntchainSaasAbilityResponse>(await this.doRequest("1.0", "antchain.saas.ability.bind", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BindAntchainSaasAbilityResponse({}));
  }

  /**
   * Description: 自动化测试创建,用于测试API的修改
   * Summary: 自动化测试创建,用于测试API的修改勿动
   */
  async queryDemoAbcAbcAbc(request: QueryDemoAbcAbcAbcRequest): Promise<QueryDemoAbcAbcAbcResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDemoAbcAbcAbcEx(request, headers, runtime);
  }

  /**
   * Description: 自动化测试创建,用于测试API的修改
   * Summary: 自动化测试创建,用于测试API的修改勿动
   */
  async queryDemoAbcAbcAbcEx(request: QueryDemoAbcAbcAbcRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDemoAbcAbcAbcResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDemoAbcAbcAbcResponse>(await this.doRequest("1.0", "demo.abc.abc.abc.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDemoAbcAbcAbcResponse({}));
  }

  /**
   * Description: api上线回调接口
   * Summary: api上线回调接口
   */
  async callbackAntchainSaasAbility(request: CallbackAntchainSaasAbilityRequest): Promise<CallbackAntchainSaasAbilityResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.callbackAntchainSaasAbilityEx(request, headers, runtime);
  }

  /**
   * Description: api上线回调接口
   * Summary: api上线回调接口
   */
  async callbackAntchainSaasAbilityEx(request: CallbackAntchainSaasAbilityRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CallbackAntchainSaasAbilityResponse> {
    Util.validateModel(request);
    return $tea.cast<CallbackAntchainSaasAbilityResponse>(await this.doRequest("1.0", "antchain.saas.ability.callback", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CallbackAntchainSaasAbilityResponse({}));
  }

  /**
   * Description: 绑定能力的api信息
   * Summary: 绑定能力的api信息
   */
  async bindAntchainSaasAbilityApi(request: BindAntchainSaasAbilityApiRequest): Promise<BindAntchainSaasAbilityApiResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.bindAntchainSaasAbilityApiEx(request, headers, runtime);
  }

  /**
   * Description: 绑定能力的api信息
   * Summary: 绑定能力的api信息
   */
  async bindAntchainSaasAbilityApiEx(request: BindAntchainSaasAbilityApiRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BindAntchainSaasAbilityApiResponse> {
    Util.validateModel(request);
    return $tea.cast<BindAntchainSaasAbilityApiResponse>(await this.doRequest("1.0", "antchain.saas.ability.api.bind", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BindAntchainSaasAbilityApiResponse({}));
  }

  /**
   * Description: 根据能力id查询能力信息
   * Summary: 根据能力id查询能力信息
   */
  async queryAntchainSaasAbilityBusinesscode(request: QueryAntchainSaasAbilityBusinesscodeRequest): Promise<QueryAntchainSaasAbilityBusinesscodeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAntchainSaasAbilityBusinesscodeEx(request, headers, runtime);
  }

  /**
   * Description: 根据能力id查询能力信息
   * Summary: 根据能力id查询能力信息
   */
  async queryAntchainSaasAbilityBusinesscodeEx(request: QueryAntchainSaasAbilityBusinesscodeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAntchainSaasAbilityBusinesscodeResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAntchainSaasAbilityBusinesscodeResponse>(await this.doRequest("1.0", "antchain.saas.ability.businesscode.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAntchainSaasAbilityBusinesscodeResponse({}));
  }

}
