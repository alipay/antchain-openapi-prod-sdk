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

// 分类碳排放量
export class EmissionsCategoryStatistics extends $tea.Model {
  // 排放类型编码
  emissionDategoryNo: string;
  // 排放类型名称
  emissionCategoryName: string;
  // 排放量
  emissions: number;
  static names(): { [key: string]: string } {
    return {
      emissionDategoryNo: 'emission_dategory_no',
      emissionCategoryName: 'emission_category_name',
      emissions: 'emissions',
    };
  }

  static types(): { [key: string]: any } {
    return {
      emissionDategoryNo: 'string',
      emissionCategoryName: 'string',
      emissions: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 减排情况统计
export class EmissionsReductionStatistics extends $tea.Model {
  // 减排措施类型，可选值：EnergySubstitution-能源替代，SelfDefining-自定义
  reductionType: string;
  // 减排措施名称
  reductionMeasureName: string;
  // 减排方案编码
  reductionProposalNo: string;
  // 减排量
  reductionEmissions: number;
  // 减排量单位
  unit: string;
  static names(): { [key: string]: string } {
    return {
      reductionType: 'reduction_type',
      reductionMeasureName: 'reduction_measure_name',
      reductionProposalNo: 'reduction_proposal_no',
      reductionEmissions: 'reduction_emissions',
      unit: 'unit',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reductionType: 'string',
      reductionMeasureName: 'string',
      reductionProposalNo: 'string',
      reductionEmissions: 'number',
      unit: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 每日碳排放量
export class DailyEmissions extends $tea.Model {
  // 日期
  date: string;
  // 排放量值
  value: number;
  static names(): { [key: string]: string } {
    return {
      date: 'date',
      value: 'value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      date: 'string',
      value: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 排放范围排放数据统计
export class EmissionsScopeStatistics extends $tea.Model {
  // 盘查范围编码
  inventoryScopeNo: string;
  // 盘查范围名称
  inventoryScopeName: string;
  // 碳排放量
  emissions: number;
  // 排放占比
  percentage: number;
  // 范围下各分类排放数据
  categoryEmissionsList: EmissionsCategoryStatistics[];
  static names(): { [key: string]: string } {
    return {
      inventoryScopeNo: 'inventory_scope_no',
      inventoryScopeName: 'inventory_scope_name',
      emissions: 'emissions',
      percentage: 'percentage',
      categoryEmissionsList: 'category_emissions_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      inventoryScopeNo: 'string',
      inventoryScopeName: 'string',
      emissions: 'number',
      percentage: 'number',
      categoryEmissionsList: { 'type': 'array', 'itemType': EmissionsCategoryStatistics },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DescribeAcarActivityRequest extends $tea.Model {
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

export class DescribeAcarActivityResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 活动主办方名称
  sponsor?: string;
  // 大型活动名称
  activityName?: string;
  // 当前开展的活动主体名称
  enterpriseName?: string;
  // 当前活动主体编码
  enterpriseNo?: string;
  // 当前主体活动开始日期
  enterpriseStartDate?: string;
  // 当前主体活动结束日期
  enterpriseEndDate?: string;
  // 当前活动是否已经经过碳排放认证
  authed?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      sponsor: 'sponsor',
      activityName: 'activity_name',
      enterpriseName: 'enterprise_name',
      enterpriseNo: 'enterprise_no',
      enterpriseStartDate: 'enterprise_start_date',
      enterpriseEndDate: 'enterprise_end_date',
      authed: 'authed',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      sponsor: 'string',
      activityName: 'string',
      enterpriseName: 'string',
      enterpriseNo: 'string',
      enterpriseStartDate: 'string',
      enterpriseEndDate: 'string',
      authed: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DescribeAcarDailyemissionsRequest extends $tea.Model {
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

export class DescribeAcarDailyemissionsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 净排放量
  netEmissions?: number;
  // 累计到当前时间的总碳排放量
  totalEmissions?: number;
  // 排放量单位
  unit?: string;
  //  当前计算完成时间
  finishTimestamp?: string;
  // 活动期间每日累计的总碳排放量
  dailyEmissionsList?: DailyEmissions[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      netEmissions: 'net_emissions',
      totalEmissions: 'total_emissions',
      unit: 'unit',
      finishTimestamp: 'finish_timestamp',
      dailyEmissionsList: 'daily_emissions_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      netEmissions: 'number',
      totalEmissions: 'number',
      unit: 'string',
      finishTimestamp: 'string',
      dailyEmissionsList: { 'type': 'array', 'itemType': DailyEmissions },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DescribeAcarScopemissionRequest extends $tea.Model {
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

export class DescribeAcarScopemissionResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 总排放量
  totalEmissions?: number;
  // 单位
  unit?: string;
  // 各范围的排放情况列表
  scopeEmissionsList?: EmissionsScopeStatistics[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      totalEmissions: 'total_emissions',
      unit: 'unit',
      scopeEmissionsList: 'scope_emissions_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      totalEmissions: 'number',
      unit: 'string',
      scopeEmissionsList: { 'type': 'array', 'itemType': EmissionsScopeStatistics },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DescribeAcarReductionemissionsRequest extends $tea.Model {
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

export class DescribeAcarReductionemissionsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 减排情况列表
  list?: EmissionsReductionStatistics[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      list: 'list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      list: { 'type': 'array', 'itemType': EmissionsReductionStatistics },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DescribeAcarLastemissiondataRequest extends $tea.Model {
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

export class DescribeAcarLastemissiondataResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 主体活动编码
  enterpriseNo?: string;
  // 盘查范围编码
  inventoryScopeNo?: string;
  // 盘查范围名称
  inventoryScopeName?: string;
  // 排放类型编码
  emissionCategoryNo?: string;
  // 排放类型名称
  emissionCategoryName?: string;
  // 排放源编码
  emissionSourceNo?: string;
  // 排放源名称
  emissionSourceName?: string;
  // 活动场馆编码
  enterpriseWorkspaceNo?: string;
  // 活动场馆名称
  enterpriseWorkspaceName?: string;
  // 排放量计算要素编码
  emissionsAnalysisFactorNo?: string;
  // 排放量计算要素值
  emissionsAnalysisFactorValue?: string;
  // 发生日期
  occurrenceDate?: string;
  // 排放数据录入明细编码
  emissionDataEntryItemNo?: string;
  // 排放源用量
  emissionDourceDosage?: number;
  // 用量单位：
  // WNm3("万Nm3","天然气消耗用量单位"),
  // GJ("GJ","燃烧产生的热量单位或外购热力单位"),
  // t("t","制冷剂、灭火器填充剂、化石燃料消耗的质量单位，或者化粪池BOD产生量单位"),
  // MWh("MWh","外购电力或数据中心用电量单位"),
  // km("km","公里，通勤用车或员工差旅旅程单位"),
  // tCO2e("tCO2e","吨二氧化碳当量，排放气体产生的二氧化碳当量"),
  // PCT("%","百分比，如碳氧化率，或者气体逸散率");
  dosageUnit?: string;
  // 数据录入人账号
  submitterNo?: string;
  // 提交人姓名
  submitterName?: string;
  // 数据录入时间
  submissionTime?: string;
  // 盘查排放类型的数据录入方式：
  // ManualEntry("手动录入方式"),
  // FileUpload("文件导入方式"),
  // AutoGeneration("自动产生");
  dataEntryType?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      enterpriseNo: 'enterprise_no',
      inventoryScopeNo: 'inventory_scope_no',
      inventoryScopeName: 'inventory_scope_name',
      emissionCategoryNo: 'emission_category_no',
      emissionCategoryName: 'emission_category_name',
      emissionSourceNo: 'emission_source_no',
      emissionSourceName: 'emission_source_name',
      enterpriseWorkspaceNo: 'enterprise_workspace_no',
      enterpriseWorkspaceName: 'enterprise_workspace_name',
      emissionsAnalysisFactorNo: 'emissions_analysis_factor_no',
      emissionsAnalysisFactorValue: 'emissions_analysis_factor_value',
      occurrenceDate: 'occurrence_date',
      emissionDataEntryItemNo: 'emission_data_entry_item_no',
      emissionDourceDosage: 'emission_dource_dosage',
      dosageUnit: 'dosage_unit',
      submitterNo: 'submitter_no',
      submitterName: 'submitter_name',
      submissionTime: 'submission_time',
      dataEntryType: 'data_entry_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      enterpriseNo: 'string',
      inventoryScopeNo: 'string',
      inventoryScopeName: 'string',
      emissionCategoryNo: 'string',
      emissionCategoryName: 'string',
      emissionSourceNo: 'string',
      emissionSourceName: 'string',
      enterpriseWorkspaceNo: 'string',
      enterpriseWorkspaceName: 'string',
      emissionsAnalysisFactorNo: 'string',
      emissionsAnalysisFactorValue: 'string',
      occurrenceDate: 'string',
      emissionDataEntryItemNo: 'string',
      emissionDourceDosage: 'number',
      dosageUnit: 'string',
      submitterNo: 'string',
      submitterName: 'string',
      submissionTime: 'string',
      dataEntryType: 'string',
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
   * Description: 查询活动资料描述信息，包括大型会展信息及当前开展的活动日期等等
   * Summary: 查询当前活动资料信息
   */
  async describeAcarActivity(request: DescribeAcarActivityRequest): Promise<DescribeAcarActivityResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.describeAcarActivityEx(request, headers, runtime);
  }

  /**
   * Description: 查询活动资料描述信息，包括大型会展信息及当前开展的活动日期等等
   * Summary: 查询当前活动资料信息
   */
  async describeAcarActivityEx(request: DescribeAcarActivityRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DescribeAcarActivityResponse> {
    Util.validateModel(request);
    return $tea.cast<DescribeAcarActivityResponse>(await this.doRequest("1.0", "antchain.carbon.acar.activity.describe", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DescribeAcarActivityResponse({}));
  }

  /**
   * Description: 返回当前活动累计的碳排放量，以及每日累计的总排放量。
   * Summary: 查询当前活动的每日碳排放量
   */
  async describeAcarDailyemissions(request: DescribeAcarDailyemissionsRequest): Promise<DescribeAcarDailyemissionsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.describeAcarDailyemissionsEx(request, headers, runtime);
  }

  /**
   * Description: 返回当前活动累计的碳排放量，以及每日累计的总排放量。
   * Summary: 查询当前活动的每日碳排放量
   */
  async describeAcarDailyemissionsEx(request: DescribeAcarDailyemissionsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DescribeAcarDailyemissionsResponse> {
    Util.validateModel(request);
    return $tea.cast<DescribeAcarDailyemissionsResponse>(await this.doRequest("1.0", "antchain.carbon.acar.dailyemissions.describe", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DescribeAcarDailyemissionsResponse({}));
  }

  /**
   * Description: 查询当前活动各范围的碳排放量，返回各范围的排放占比，以及范围下各分类的碳排放量。
   * Summary: 查询当前活动各范围的碳排放量
   */
  async describeAcarScopemission(request: DescribeAcarScopemissionRequest): Promise<DescribeAcarScopemissionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.describeAcarScopemissionEx(request, headers, runtime);
  }

  /**
   * Description: 查询当前活动各范围的碳排放量，返回各范围的排放占比，以及范围下各分类的碳排放量。
   * Summary: 查询当前活动各范围的碳排放量
   */
  async describeAcarScopemissionEx(request: DescribeAcarScopemissionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DescribeAcarScopemissionResponse> {
    Util.validateModel(request);
    return $tea.cast<DescribeAcarScopemissionResponse>(await this.doRequest("1.0", "antchain.carbon.acar.scopemission.describe", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DescribeAcarScopemissionResponse({}));
  }

  /**
   * Description: 获取减排情况，返回多项减排方案实施下相关的减排情况
   * Summary: 获取减排情况
   */
  async describeAcarReductionemissions(request: DescribeAcarReductionemissionsRequest): Promise<DescribeAcarReductionemissionsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.describeAcarReductionemissionsEx(request, headers, runtime);
  }

  /**
   * Description: 获取减排情况，返回多项减排方案实施下相关的减排情况
   * Summary: 获取减排情况
   */
  async describeAcarReductionemissionsEx(request: DescribeAcarReductionemissionsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DescribeAcarReductionemissionsResponse> {
    Util.validateModel(request);
    return $tea.cast<DescribeAcarReductionemissionsResponse>(await this.doRequest("1.0", "antchain.carbon.acar.reductionemissions.describe", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DescribeAcarReductionemissionsResponse({}));
  }

  /**
   * Description: 查询最近排放数据，返回最近排放数据信息
   * Summary: 查询最近排放数据
   */
  async describeAcarLastemissiondata(request: DescribeAcarLastemissiondataRequest): Promise<DescribeAcarLastemissiondataResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.describeAcarLastemissiondataEx(request, headers, runtime);
  }

  /**
   * Description: 查询最近排放数据，返回最近排放数据信息
   * Summary: 查询最近排放数据
   */
  async describeAcarLastemissiondataEx(request: DescribeAcarLastemissiondataRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DescribeAcarLastemissiondataResponse> {
    Util.validateModel(request);
    return $tea.cast<DescribeAcarLastemissiondataResponse>(await this.doRequest("1.0", "antchain.carbon.acar.lastemissiondata.describe", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DescribeAcarLastemissiondataResponse({}));
  }

}
