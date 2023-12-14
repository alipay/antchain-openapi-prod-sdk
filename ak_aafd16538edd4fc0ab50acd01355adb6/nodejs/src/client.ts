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

// 协议扩展
export class RiskEvaluationAgreementExtRequest extends $tea.Model {
  // URL：文件地址
  // CONTENT:Base64的文件流
  // 
  type: string;
  // 文件类型
  // PDF
  fileType?: string;
  // type为url是传入文件地址
  // type为CONTENT时传入Base64文件内容编码
  // 
  content: string;
  static names(): { [key: string]: string } {
    return {
      type: 'type',
      fileType: 'file_type',
      content: 'content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      type: 'string',
      fileType: 'string',
      content: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 地区
export class RiskEvaluationDistrictExtRequest extends $tea.Model {
  // 地区编码
  cityCode: string;
  // 省级编码
  provCode: string;
  static names(): { [key: string]: string } {
    return {
      cityCode: 'city_code',
      provCode: 'prov_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      cityCode: 'string',
      provCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 扩展信息
export class RiskEvaluationExtendInfoRequest extends $tea.Model {
  // 协议集合
  agreementList: RiskEvaluationAgreementExtRequest[];
  // 地区请求
  districtExt: RiskEvaluationDistrictExtRequest;
  static names(): { [key: string]: string } {
    return {
      agreementList: 'agreement_list',
      districtExt: 'district_ext',
    };
  }

  static types(): { [key: string]: any } {
    return {
      agreementList: { 'type': 'array', 'itemType': RiskEvaluationAgreementExtRequest },
      districtExt: RiskEvaluationDistrictExtRequest,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportDataBccCompanyPersonRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 姓名
  xm?: string;
  // 身份证号
  sfzh?: string;
  // 数据更新时间
  sjgxsj?: string;
  // 数据目录名称
  sjmlmc?: string;
  // 数据所属部门
  sjssbm?: string;
  // 从业资格证号
  cyzgzh?: string;
  // 从业类别
  cylb?: string;
  // 聘用单位
  pydw?: string;
  // 公告事由
  ggsy?: string;
  // 公告日期起
  ggrqq?: string;
  // 公告日期止
  ggrqz?: string;
  // 企信链所需---企信链控制台数据管理列表页中每个数据的唯一码
  dataName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      xm: 'xm',
      sfzh: 'sfzh',
      sjgxsj: 'sjgxsj',
      sjmlmc: 'sjmlmc',
      sjssbm: 'sjssbm',
      cyzgzh: 'cyzgzh',
      cylb: 'cylb',
      pydw: 'pydw',
      ggsy: 'ggsy',
      ggrqq: 'ggrqq',
      ggrqz: 'ggrqz',
      dataName: 'data_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      xm: 'string',
      sfzh: 'string',
      sjgxsj: 'string',
      sjmlmc: 'string',
      sjssbm: 'string',
      cyzgzh: 'string',
      cylb: 'string',
      pydw: 'string',
      ggsy: 'string',
      ggrqq: 'string',
      ggrqz: 'string',
      dataName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportDataBccCompanyPersonResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 数据模型唯一key
  dataKey?: string;
  // 模型码
  dataCode?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      dataKey: 'data_key',
      dataCode: 'data_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      dataKey: 'string',
      dataCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AuthBlockchainTaxRiskEvaluationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 个人身份证号
  identityId: string;
  // 个人姓名
  identityName?: string;
  // 企业的统一社会信用编码
  enterpriseId?: string;
  // 企业的名称
  enterpriseName?: string;
  // 企业或者个人企业：ENTERPRISE  个人：PERSONAL
  // 
  identityType: string;
  // 授权的业务类型
  authType: string;
  // 授权订单号
  orderNo: string;
  // 子渠道渠道编码，需要同步蚂蚁，由蚂蚁设置。如果是银行本身，可不填
  // 备注：如果同一信贷客户在不同银行的调用需要严格区分，分别授权
  // 
  subTenant?: string;
  //  扩展信息
  extendInfo: RiskEvaluationExtendInfoRequest;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      identityId: 'identity_id',
      identityName: 'identity_name',
      enterpriseId: 'enterprise_id',
      enterpriseName: 'enterprise_name',
      identityType: 'identity_type',
      authType: 'auth_type',
      orderNo: 'order_no',
      subTenant: 'sub_tenant',
      extendInfo: 'extend_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      identityId: 'string',
      identityName: 'string',
      enterpriseId: 'string',
      enterpriseName: 'string',
      identityType: 'string',
      authType: 'string',
      orderNo: 'string',
      subTenant: 'string',
      extendInfo: RiskEvaluationExtendInfoRequest,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AuthBlockchainTaxRiskEvaluationResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 授权订单订单号
  orderNo?: string;
  // 是否授权成功true是，false否
  authSuccess?: boolean;
  // 过期时间，unix时间戳 毫秒
  expireTime?: number;
  // 授权时间，unix时间戳 毫秒
  authTime?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      orderNo: 'order_no',
      authSuccess: 'auth_success',
      expireTime: 'expire_time',
      authTime: 'auth_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      orderNo: 'string',
      authSuccess: 'boolean',
      expireTime: 'number',
      authTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBlockchainTaxRiskEvaluationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求流水号(必填),调用方保证每次请求号唯一，受理方用来校验唯一性，同一受理号返回请求结果一致
  bizRequestId: string;
  // 信贷用户的纳税人识别号或者身份证号
  identityId: string;
  // 授权类型
  authType: string;
  // 授权订单号
  orderNo: string;
  // 机构编码
  instCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizRequestId: 'biz_request_id',
      identityId: 'identity_id',
      authType: 'auth_type',
      orderNo: 'order_no',
      instCode: 'inst_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizRequestId: 'string',
      identityId: 'string',
      authType: 'string',
      orderNo: 'string',
      instCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBlockchainTaxRiskEvaluationResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // unix秒时间戳,查询时间，用来对账使用
  queryTime?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      queryTime: 'query_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      queryTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncBlockchainTaxRiskEvaluationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求流水号(必填),调用方保证每次请求号唯一，受理方用来校验唯一性，同一受理号返回请求结果一致
  bizRequestId: string;
  // 信贷用户的纳税人识别号或者身份证号
  identityId: string;
  // 授权类型
  authType: string;
  // 授权订单号
  orderNo: string;
  // 机构编码
  instCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizRequestId: 'biz_request_id',
      identityId: 'identity_id',
      authType: 'auth_type',
      orderNo: 'order_no',
      instCode: 'inst_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizRequestId: 'string',
      identityId: 'string',
      authType: 'string',
      orderNo: 'string',
      instCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncBlockchainTaxRiskEvaluationResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 1322324243	unix秒时间戳,查询时间，用来对账使用
  queryTime?: string;
  // 内容，List<JsonObject>
  bizContent?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      queryTime: 'query_time',
      bizContent: 'biz_content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      queryTime: 'string',
      bizContent: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartBlockchainTaxRiskEvaluationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 个人身份证号
  identityId: string;
  // 个人姓名
  identityName?: string;
  // 企业的统一社会信用编码
  enterpriseId?: string;
  // 某某某公司
  enterpriseName?: string;
  // 企业或者个人企业：ENTERPRISE 个人：PERSONAL
  identityType: string;
  // 101
  authType: string;
  // 授权订单号
  orderNo: string;
  // 请求流水号(必填),调用 方保证每次请求号唯   一，受理方用来校验唯 一性，同一受理号返回 请求结果一致
  bizRequestId: string;
  // 子渠道渠道编码，需要同步蚂蚁，由蚂蚁设置。如果是银行本身，可不填 备注：如果同一信贷客户在不同银行的调用需要严格区分，分别授权
  subTenant: string;
  // 扩展信息
  extendInfo: RiskEvaluationExtendInfoRequest;
  // 查询模式，SINGLE_CITY 查到第一个城市就结束，ALL_CITY 查询所有城市，默认ALL_CITY
  searchModel?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      identityId: 'identity_id',
      identityName: 'identity_name',
      enterpriseId: 'enterprise_id',
      enterpriseName: 'enterprise_name',
      identityType: 'identity_type',
      authType: 'auth_type',
      orderNo: 'order_no',
      bizRequestId: 'biz_request_id',
      subTenant: 'sub_tenant',
      extendInfo: 'extend_info',
      searchModel: 'search_model',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      identityId: 'string',
      identityName: 'string',
      enterpriseId: 'string',
      enterpriseName: 'string',
      identityType: 'string',
      authType: 'string',
      orderNo: 'string',
      bizRequestId: 'string',
      subTenant: 'string',
      extendInfo: RiskEvaluationExtendInfoRequest,
      searchModel: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartBlockchainTaxRiskEvaluationResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 授权订单订单号
  orderNo?: string;
  // 是否授权成功true是，false否
  authSuccess?: string;
  // 过期时间，unix时间戳 毫秒
  expireTime?: number;
  // 授权时间，unix时间戳 毫秒
  authTime?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      orderNo: 'order_no',
      authSuccess: 'auth_success',
      expireTime: 'expire_time',
      authTime: 'auth_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      orderNo: 'string',
      authSuccess: 'string',
      expireTime: 'number',
      authTime: 'number',
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
          sdk_version: "1.1.0",
          _prod_code: "ak_aafd16538edd4fc0ab50acd01355adb6",
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
   * Description: 个人信息
   * Summary: 个人信息
   */
  async importDataBccCompanyPerson(request: ImportDataBccCompanyPersonRequest): Promise<ImportDataBccCompanyPersonResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.importDataBccCompanyPersonEx(request, headers, runtime);
  }

  /**
   * Description: 个人信息
   * Summary: 个人信息
   */
  async importDataBccCompanyPersonEx(request: ImportDataBccCompanyPersonRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ImportDataBccCompanyPersonResponse> {
    Util.validateModel(request);
    return $tea.cast<ImportDataBccCompanyPersonResponse>(await this.doRequest("1.0", "data.bcc.company.person.import", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ImportDataBccCompanyPersonResponse({}));
  }

  /**
   * Description: 授权接口
   * Summary: 授权接口
   */
  async authBlockchainTaxRiskEvaluation(request: AuthBlockchainTaxRiskEvaluationRequest): Promise<AuthBlockchainTaxRiskEvaluationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.authBlockchainTaxRiskEvaluationEx(request, headers, runtime);
  }

  /**
   * Description: 授权接口
   * Summary: 授权接口
   */
  async authBlockchainTaxRiskEvaluationEx(request: AuthBlockchainTaxRiskEvaluationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AuthBlockchainTaxRiskEvaluationResponse> {
    Util.validateModel(request);
    return $tea.cast<AuthBlockchainTaxRiskEvaluationResponse>(await this.doRequest("1.0", "blockchain.tax.risk.evaluation.auth", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AuthBlockchainTaxRiskEvaluationResponse({}));
  }

  /**
   * Description: 查询
   * Summary: 查询
   */
  async queryBlockchainTaxRiskEvaluation(request: QueryBlockchainTaxRiskEvaluationRequest): Promise<QueryBlockchainTaxRiskEvaluationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryBlockchainTaxRiskEvaluationEx(request, headers, runtime);
  }

  /**
   * Description: 查询
   * Summary: 查询
   */
  async queryBlockchainTaxRiskEvaluationEx(request: QueryBlockchainTaxRiskEvaluationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryBlockchainTaxRiskEvaluationResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBlockchainTaxRiskEvaluationResponse>(await this.doRequest("1.0", "blockchain.tax.risk.evaluation.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryBlockchainTaxRiskEvaluationResponse({}));
  }

  /**
   * Description: 查询-同步返回提额数据
   * Summary: 查询-同步提额数据返回
   */
  async syncBlockchainTaxRiskEvaluation(request: SyncBlockchainTaxRiskEvaluationRequest): Promise<SyncBlockchainTaxRiskEvaluationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.syncBlockchainTaxRiskEvaluationEx(request, headers, runtime);
  }

  /**
   * Description: 查询-同步返回提额数据
   * Summary: 查询-同步提额数据返回
   */
  async syncBlockchainTaxRiskEvaluationEx(request: SyncBlockchainTaxRiskEvaluationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SyncBlockchainTaxRiskEvaluationResponse> {
    Util.validateModel(request);
    return $tea.cast<SyncBlockchainTaxRiskEvaluationResponse>(await this.doRequest("1.0", "blockchain.tax.risk.evaluation.sync", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SyncBlockchainTaxRiskEvaluationResponse({}));
  }

  /**
   * Description: 提额资质评估授权并查询,支持省级查询
   * Summary: 提额资质评估授权并查询
   */
  async startBlockchainTaxRiskEvaluation(request: StartBlockchainTaxRiskEvaluationRequest): Promise<StartBlockchainTaxRiskEvaluationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.startBlockchainTaxRiskEvaluationEx(request, headers, runtime);
  }

  /**
   * Description: 提额资质评估授权并查询,支持省级查询
   * Summary: 提额资质评估授权并查询
   */
  async startBlockchainTaxRiskEvaluationEx(request: StartBlockchainTaxRiskEvaluationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<StartBlockchainTaxRiskEvaluationResponse> {
    Util.validateModel(request);
    return $tea.cast<StartBlockchainTaxRiskEvaluationResponse>(await this.doRequest("1.0", "blockchain.tax.risk.evaluation.start", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new StartBlockchainTaxRiskEvaluationResponse({}));
  }

}
