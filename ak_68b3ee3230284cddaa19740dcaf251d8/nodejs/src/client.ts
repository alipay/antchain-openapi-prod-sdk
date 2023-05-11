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
  // 产品码
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
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 能力与API关联信息
export class AbilityApiRelation extends $tea.Model {
  // api名称
  apiName: string;
  // 能力列表
  abilityInfoList: AbilityInfo[];
  static names(): { [key: string]: string } {
    return {
      apiName: 'api_name',
      abilityInfoList: 'ability_info_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      apiName: 'string',
      abilityInfoList: { 'type': 'array', 'itemType': AbilityInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// api 信息
export class ApiInfo extends $tea.Model {
  // 查询不动产接口
  apiCode: string;
  // api pb文件定义
  apiProtobufDefinition: string;
  static names(): { [key: string]: string } {
    return {
      apiCode: 'api_code',
      apiProtobufDefinition: 'api_protobuf_definition',
    };
  }

  static types(): { [key: string]: any } {
    return {
      apiCode: 'string',
      apiProtobufDefinition: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PublishDemoSaasTestTestcRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 张三
  name: string;
  // 14
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

export class PublishDemoSaasTestTestcResponse extends $tea.Model {
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

export class QueryAntchainSaasAbilityWithapinameRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // api名称列表
  apiNameList: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      apiNameList: 'api_name_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      apiNameList: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntchainSaasAbilityWithapinameResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // api与能力信息关联列表
  abilityApiRelationList?: AbilityApiRelation[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      abilityApiRelationList: 'ability_api_relation_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      abilityApiRelationList: { 'type': 'array', 'itemType': AbilityApiRelation },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BindDemoCenterAbilityRequest extends $tea.Model {
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

export class BindDemoCenterAbilityResponse extends $tea.Model {
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

export class BindDemoMoreAbilityTestabcRequest extends $tea.Model {
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

export class BindDemoMoreAbilityTestabcResponse extends $tea.Model {
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

export class QueryAntchainSaasFoundationProtobufRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 产品码
  productCode: string;
  // api code列表信息
  apiCodeList: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      productCode: 'product_code',
      apiCodeList: 'api_code_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      productCode: 'string',
      apiCodeList: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntchainSaasFoundationProtobufResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // api probuf信息
  apiInfoList?: ApiInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      apiInfoList: 'api_info_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      apiInfoList: { 'type': 'array', 'itemType': ApiInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntchainSaasAbilityResultcodeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 1-INTERNAL_ERROR，2-TOO_MANY_REQUESTS，3-UNKNOW_ERROR，4-ACCESS_DENIED，5-OK，6-CUSTOM_RESULT_CODE_ONE，7-CUSTOM_RESULT_CODE_TWO
  index: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      index: 'index',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      index: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntchainSaasAbilityResultcodeResponse extends $tea.Model {
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
          _prod_code: "ak_68b3ee3230284cddaa19740dcaf251d8",
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
   * Description: testc
   * Summary: 测试用api
   */
  async publishDemoSaasTestTestc(request: PublishDemoSaasTestTestcRequest): Promise<PublishDemoSaasTestTestcResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.publishDemoSaasTestTestcEx(request, headers, runtime);
  }

  /**
   * Description: testc
   * Summary: 测试用api
   */
  async publishDemoSaasTestTestcEx(request: PublishDemoSaasTestTestcRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PublishDemoSaasTestTestcResponse> {
    Util.validateModel(request);
    return $tea.cast<PublishDemoSaasTestTestcResponse>(await this.doRequest("1.0", "demo.saas.test.testc.publish", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PublishDemoSaasTestTestcResponse({}));
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
   * Description: 根据api名称列表查询能力标签列表
   * Summary: 根据api名称列表查询能力标签列表
   */
  async queryAntchainSaasAbilityWithapiname(request: QueryAntchainSaasAbilityWithapinameRequest): Promise<QueryAntchainSaasAbilityWithapinameResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAntchainSaasAbilityWithapinameEx(request, headers, runtime);
  }

  /**
   * Description: 根据api名称列表查询能力标签列表
   * Summary: 根据api名称列表查询能力标签列表
   */
  async queryAntchainSaasAbilityWithapinameEx(request: QueryAntchainSaasAbilityWithapinameRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAntchainSaasAbilityWithapinameResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAntchainSaasAbilityWithapinameResponse>(await this.doRequest("1.0", "antchain.saas.ability.withapiname.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAntchainSaasAbilityWithapinameResponse({}));
  }

  /**
   * Description: 测试能力中心九期API打标&能力绑定API使用
   * Summary: 能力中心九期测试
   */
  async bindDemoCenterAbility(request: BindDemoCenterAbilityRequest): Promise<BindDemoCenterAbilityResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.bindDemoCenterAbilityEx(request, headers, runtime);
  }

  /**
   * Description: 测试能力中心九期API打标&能力绑定API使用
   * Summary: 能力中心九期测试
   */
  async bindDemoCenterAbilityEx(request: BindDemoCenterAbilityRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BindDemoCenterAbilityResponse> {
    Util.validateModel(request);
    return $tea.cast<BindDemoCenterAbilityResponse>(await this.doRequest("1.0", "demo.center.ability.bind", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BindDemoCenterAbilityResponse({}));
  }

  /**
   * Description: 测试API绑定多个标签时的情况
   * Summary: API绑定多个标签
   */
  async bindDemoMoreAbilityTestabc(request: BindDemoMoreAbilityTestabcRequest): Promise<BindDemoMoreAbilityTestabcResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.bindDemoMoreAbilityTestabcEx(request, headers, runtime);
  }

  /**
   * Description: 测试API绑定多个标签时的情况
   * Summary: API绑定多个标签
   */
  async bindDemoMoreAbilityTestabcEx(request: BindDemoMoreAbilityTestabcRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BindDemoMoreAbilityTestabcResponse> {
    Util.validateModel(request);
    return $tea.cast<BindDemoMoreAbilityTestabcResponse>(await this.doRequest("1.0", "demo.more.ability.testabc.bind", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BindDemoMoreAbilityTestabcResponse({}));
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
   * Description: 根据产品码+api code查询api protobuf信息
   * Summary: 查询api protobuf信息（勿删）
   */
  async queryAntchainSaasFoundationProtobuf(request: QueryAntchainSaasFoundationProtobufRequest): Promise<QueryAntchainSaasFoundationProtobufResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAntchainSaasFoundationProtobufEx(request, headers, runtime);
  }

  /**
   * Description: 根据产品码+api code查询api protobuf信息
   * Summary: 查询api protobuf信息（勿删）
   */
  async queryAntchainSaasFoundationProtobufEx(request: QueryAntchainSaasFoundationProtobufRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAntchainSaasFoundationProtobufResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAntchainSaasFoundationProtobufResponse>(await this.doRequest("1.0", "antchain.saas.foundation.protobuf.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAntchainSaasFoundationProtobufResponse({}));
  }

  /**
   * Description: 测试网关结果码和计量接口
   * Summary: 网关结果码测试接口
   */
  async queryAntchainSaasAbilityResultcode(request: QueryAntchainSaasAbilityResultcodeRequest): Promise<QueryAntchainSaasAbilityResultcodeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAntchainSaasAbilityResultcodeEx(request, headers, runtime);
  }

  /**
   * Description: 测试网关结果码和计量接口
   * Summary: 网关结果码测试接口
   */
  async queryAntchainSaasAbilityResultcodeEx(request: QueryAntchainSaasAbilityResultcodeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAntchainSaasAbilityResultcodeResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAntchainSaasAbilityResultcodeResponse>(await this.doRequest("1.0", "antchain.saas.ability.resultcode.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAntchainSaasAbilityResultcodeResponse({}));
  }

}
