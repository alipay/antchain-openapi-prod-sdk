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

export class UploadAppmarketOcrfileRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 所购商品实例id
  instanceId: string;
  // 文件名
  fileName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      instanceId: 'instance_id',
      fileName: 'file_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      instanceId: 'string',
      fileName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadAppmarketOcrfileResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 文件上传url
  uploadUrl?: string;
  // 文件key
  fileKey?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      uploadUrl: 'upload_url',
      fileKey: 'file_key',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      uploadUrl: 'string',
      fileKey: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecAppmarketBusinesslicenseocrRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 商品实例id
  instanceId: string;
  // 文件key
  fileKey?: string;
  // 文件url
  fileUrl?: string;
  // 扩展信息
  ext?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      instanceId: 'instance_id',
      fileKey: 'file_key',
      fileUrl: 'file_url',
      ext: 'ext',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      instanceId: 'string',
      fileKey: 'string',
      fileUrl: 'string',
      ext: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecAppmarketBusinesslicenseocrResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 地址
  address?: string;
  // 经营范围
  business?: string;
  // 注册资本
  captial?: string;
  // 企业成立日期
  establishDate?: string;
  // 名称，控股股东名称
  name?: string;
  // 法定代表人
  person?: string;
  // 统一社会信用代码，控股股东证件号码
  regNum?: string;
  // 印章
  stamp?: string;
  // 类型，如：有限责任公司(自然人独资)
  type?: string;
  // 营业期限，营业执照有效期，控股股东证件有效期
  validPeriod?: string;
  // 标题，如"营业执照"
  title?: string;
  // 颁发日期
  date?: string;
  // 编号
  num?: string;
  // 投资人
  investors?: string;
  // 组成形式
  formation?: string;
  // 注册日期
  dateOfRegistration?: string;
  // 经营者
  operators?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      address: 'address',
      business: 'business',
      captial: 'captial',
      establishDate: 'establish_date',
      name: 'name',
      person: 'person',
      regNum: 'reg_num',
      stamp: 'stamp',
      type: 'type',
      validPeriod: 'valid_period',
      title: 'title',
      date: 'date',
      num: 'num',
      investors: 'investors',
      formation: 'formation',
      dateOfRegistration: 'date_of_registration',
      operators: 'operators',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      address: 'string',
      business: 'string',
      captial: 'string',
      establishDate: 'string',
      name: 'string',
      person: 'string',
      regNum: 'string',
      stamp: 'string',
      type: 'string',
      validPeriod: 'string',
      title: 'string',
      date: 'string',
      num: 'string',
      investors: 'string',
      formation: 'string',
      dateOfRegistration: 'string',
      operators: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAppmarketPrivacyresultRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 商品实例id
  instanceId: string;
  // 执行记录id
  recordId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      instanceId: 'instance_id',
      recordId: 'record_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      instanceId: 'string',
      recordId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAppmarketPrivacyresultResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 隐私计算模型执行状态
  status?: string;
  // 结果文件路径
  resultUrl?: string;
  // 失败的原因
  failedReason?: string;
  // 结构化出参
  structOutput?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      status: 'status',
      resultUrl: 'result_url',
      failedReason: 'failed_reason',
      structOutput: 'struct_output',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      status: 'string',
      resultUrl: 'string',
      failedReason: 'string',
      structOutput: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadAppmarketFileRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 所购商品实例id
  instanceId: string;
  // 文件标识，用作文件名
  fileId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      instanceId: 'instance_id',
      fileId: 'file_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      instanceId: 'string',
      fileId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadAppmarketFileResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 文件上传url
  uploadUrl?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      uploadUrl: 'upload_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      uploadUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecAppmarketPrivacymodelRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 商品实例id
  instanceId: string;
  // 文件标识，文件上传时的入参
  fileId?: string;
  // 结构化入参
  structInput?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      instanceId: 'instance_id',
      fileId: 'file_id',
      structInput: 'struct_input',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      instanceId: 'string',
      fileId: 'string',
      structInput: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecAppmarketPrivacymodelResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 执行状态
  status?: string;
  // 结果文件url
  resultUrl?: string;
  // 执行失败原因
  failedReason?: string;
  // 结构化出参
  structOutput?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      status: 'status',
      resultUrl: 'result_url',
      failedReason: 'failed_reason',
      structOutput: 'struct_output',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      status: 'string',
      resultUrl: 'string',
      failedReason: 'string',
      structOutput: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SubmitAppmarketPrivacymodelRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 商品实例id
  instanceId: string;
  // 文件名称
  fileId?: string;
  // 结构化入参
  structInput?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      instanceId: 'instance_id',
      fileId: 'file_id',
      structInput: 'struct_input',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      instanceId: 'string',
      fileId: 'string',
      structInput: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SubmitAppmarketPrivacymodelResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 异步提交执行记录id
  recordId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      recordId: 'record_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      recordId: 'string',
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
          sdk_version: "1.1.6",
          _prod_code: "ADOM",
          _prod_channel: "undefined",
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
   * Description: 应用开放市场OCR服务-文件上传
   * Summary: 应用开放市场OCR服务-文件上传
   */
  async uploadAppmarketOcrfile(request: UploadAppmarketOcrfileRequest): Promise<UploadAppmarketOcrfileResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.uploadAppmarketOcrfileEx(request, headers, runtime);
  }

  /**
   * Description: 应用开放市场OCR服务-文件上传
   * Summary: 应用开放市场OCR服务-文件上传
   */
  async uploadAppmarketOcrfileEx(request: UploadAppmarketOcrfileRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UploadAppmarketOcrfileResponse> {
    Util.validateModel(request);
    return $tea.cast<UploadAppmarketOcrfileResponse>(await this.doRequest("1.0", "antcloud.adom.appmarket.ocrfile.upload", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UploadAppmarketOcrfileResponse({}));
  }

  /**
   * Description: 应用开放市场OCR服务-营业执照识别
   * Summary: 应用开放市场OCR服务-营业执照识别
   */
  async execAppmarketBusinesslicenseocr(request: ExecAppmarketBusinesslicenseocrRequest): Promise<ExecAppmarketBusinesslicenseocrResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execAppmarketBusinesslicenseocrEx(request, headers, runtime);
  }

  /**
   * Description: 应用开放市场OCR服务-营业执照识别
   * Summary: 应用开放市场OCR服务-营业执照识别
   */
  async execAppmarketBusinesslicenseocrEx(request: ExecAppmarketBusinesslicenseocrRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecAppmarketBusinesslicenseocrResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecAppmarketBusinesslicenseocrResponse>(await this.doRequest("1.0", "antcloud.adom.appmarket.businesslicenseocr.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecAppmarketBusinesslicenseocrResponse({}));
  }

  /**
   * Description: 应用开放市场隐私模型运行时链路-结果查询
   * Summary: 应用开放市场隐私模型运行时链路-结果查询
   */
  async queryAppmarketPrivacyresult(request: QueryAppmarketPrivacyresultRequest): Promise<QueryAppmarketPrivacyresultResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAppmarketPrivacyresultEx(request, headers, runtime);
  }

  /**
   * Description: 应用开放市场隐私模型运行时链路-结果查询
   * Summary: 应用开放市场隐私模型运行时链路-结果查询
   */
  async queryAppmarketPrivacyresultEx(request: QueryAppmarketPrivacyresultRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAppmarketPrivacyresultResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAppmarketPrivacyresultResponse>(await this.doRequest("1.0", "antcloud.adom.appmarket.privacyresult.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAppmarketPrivacyresultResponse({}));
  }

  /**
   * Description: 应用开放市场隐私模型运行时链路-文件上传
   * Summary: 应用开放市场隐私模型运行时链路-文件上传
   */
  async uploadAppmarketFile(request: UploadAppmarketFileRequest): Promise<UploadAppmarketFileResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.uploadAppmarketFileEx(request, headers, runtime);
  }

  /**
   * Description: 应用开放市场隐私模型运行时链路-文件上传
   * Summary: 应用开放市场隐私模型运行时链路-文件上传
   */
  async uploadAppmarketFileEx(request: UploadAppmarketFileRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UploadAppmarketFileResponse> {
    Util.validateModel(request);
    return $tea.cast<UploadAppmarketFileResponse>(await this.doRequest("1.0", "antcloud.adom.appmarket.file.upload", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UploadAppmarketFileResponse({}));
  }

  /**
   * Description: 应用开放市场隐私模型运行时链路-同步执行
   * Summary: 应用开放市场隐私模型运行时链路-同步执行
   */
  async execAppmarketPrivacymodel(request: ExecAppmarketPrivacymodelRequest): Promise<ExecAppmarketPrivacymodelResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execAppmarketPrivacymodelEx(request, headers, runtime);
  }

  /**
   * Description: 应用开放市场隐私模型运行时链路-同步执行
   * Summary: 应用开放市场隐私模型运行时链路-同步执行
   */
  async execAppmarketPrivacymodelEx(request: ExecAppmarketPrivacymodelRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecAppmarketPrivacymodelResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecAppmarketPrivacymodelResponse>(await this.doRequest("1.0", "antcloud.adom.appmarket.privacymodel.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecAppmarketPrivacymodelResponse({}));
  }

  /**
   * Description: 应用开放市场隐私模型运行时链路-提交执行
   * Summary: 应用开放市场隐私模型运行时链路-提交执行
   */
  async submitAppmarketPrivacymodel(request: SubmitAppmarketPrivacymodelRequest): Promise<SubmitAppmarketPrivacymodelResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.submitAppmarketPrivacymodelEx(request, headers, runtime);
  }

  /**
   * Description: 应用开放市场隐私模型运行时链路-提交执行
   * Summary: 应用开放市场隐私模型运行时链路-提交执行
   */
  async submitAppmarketPrivacymodelEx(request: SubmitAppmarketPrivacymodelRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SubmitAppmarketPrivacymodelResponse> {
    Util.validateModel(request);
    return $tea.cast<SubmitAppmarketPrivacymodelResponse>(await this.doRequest("1.0", "antcloud.adom.appmarket.privacymodel.submit", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SubmitAppmarketPrivacymodelResponse({}));
  }

}
