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

// 分页属性
export class ALiYunPagination extends $tea.Model {
  // 分页大小
  pageSize?: number;
  // 分页编号
  pageNumber?: number;
  // 总数大小
  totalCount?: number;
  static names(): { [key: string]: string } {
    return {
      pageSize: 'page_size',
      pageNumber: 'page_number',
      totalCount: 'total_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      pageSize: 'number',
      pageNumber: 'number',
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 阿里云蚂蚁区块链证书信息
export class ALiYunCertificateApplication extends $tea.Model {
  // ant_chain_id
  antChainId?: string;
  // bid
  bid?: string;
  // createtime
  createtime?: number;
  // status
  status?: string;
  // updatetime
  updatetime?: number;
  // username
  username?: string;
  static names(): { [key: string]: string } {
    return {
      antChainId: 'ant_chain_id',
      bid: 'bid',
      createtime: 'createtime',
      status: 'status',
      updatetime: 'updatetime',
      username: 'username',
    };
  }

  static types(): { [key: string]: any } {
    return {
      antChainId: 'string',
      bid: 'string',
      createtime: 'number',
      status: 'string',
      updatetime: 'number',
      username: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 阿里云蚂蚁链相关下载链接
export class ALiYunDownloadPath extends $tea.Model {
  // ca_crt_url
  caCrtUrl?: string;
  // client_crt_url
  clientCrtUrl?: string;
  // sdk_url
  sdkUrl?: string;
  // trust_ca_url
  trustCaUrl?: string;
  static names(): { [key: string]: string } {
    return {
      caCrtUrl: 'ca_crt_url',
      clientCrtUrl: 'client_crt_url',
      sdkUrl: 'sdk_url',
      trustCaUrl: 'trust_ca_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      caCrtUrl: 'string',
      clientCrtUrl: 'string',
      sdkUrl: 'string',
      trustCaUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 阿里云蚂蚁区块链相关下载结果
export class ALiYunChainDownload extends $tea.Model {
  // download_path
  downloadPath?: ALiYunDownloadPath;
  // private_key
  privateKey?: string;
  static names(): { [key: string]: string } {
    return {
      downloadPath: 'download_path',
      privateKey: 'private_key',
    };
  }

  static types(): { [key: string]: any } {
    return {
      downloadPath: ALiYunDownloadPath,
      privateKey: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 阿里云蚂蚁区块链证书列表信息
export class ALiYunCertificateApplications extends $tea.Model {
  // certificate_application
  certificateApplications?: ALiYunCertificateApplication[];
  // pagination
  pagination?: ALiYunPagination;
  static names(): { [key: string]: string } {
    return {
      certificateApplications: 'certificate_applications',
      pagination: 'pagination',
    };
  }

  static types(): { [key: string]: any } {
    return {
      certificateApplications: { 'type': 'array', 'itemType': ALiYunCertificateApplication },
      pagination: ALiYunPagination,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyBaasChainCertAntRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // ant_chain_id
  antChainId: string;
  // common_name
  commonName: string;
  // consortium_id
  consortiumId: string;
  // country_name
  countryName: string;
  // locality_name
  localityName: string;
  // organization_name
  organizationName: string;
  // organization_unit_name
  organizationUnitName: string;
  // password
  password: string;
  // region_id
  regionId?: string;
  // state_or_province_name
  stateOrProvinceName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      antChainId: 'ant_chain_id',
      commonName: 'common_name',
      consortiumId: 'consortium_id',
      countryName: 'country_name',
      localityName: 'locality_name',
      organizationName: 'organization_name',
      organizationUnitName: 'organization_unit_name',
      password: 'password',
      regionId: 'region_id',
      stateOrProvinceName: 'state_or_province_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      antChainId: 'string',
      commonName: 'string',
      consortiumId: 'string',
      countryName: 'string',
      localityName: 'string',
      organizationName: 'string',
      organizationUnitName: 'string',
      password: 'string',
      regionId: 'string',
      stateOrProvinceName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyBaasChainCertAntResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // result
  result?: ALiYunChainDownload;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      result: 'result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      result: ALiYunChainDownload,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateBaasChainCertAntRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // ant_chain_id
  antChainId: string;
  // region_id
  regionId?: string;
  // upload_req
  uploadReq: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      antChainId: 'ant_chain_id',
      regionId: 'region_id',
      uploadReq: 'upload_req',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      antChainId: 'string',
      regionId: 'string',
      uploadReq: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateBaasChainCertAntResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // result
  result?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      result: 'result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      result: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DownloadBaasChainCertAntRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // ant_chain_id
  antChainId: string;
  // region_id
  regionId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      antChainId: 'ant_chain_id',
      regionId: 'region_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      antChainId: 'string',
      regionId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DownloadBaasChainCertAntResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // result
  result?: ALiYunDownloadPath;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      result: 'result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      result: ALiYunDownloadPath,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBaasChainCertAntRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // ant_chain_id
  antChainId: string;
  // page_number
  pageNumber: number;
  // page_size
  pageSize: number;
  // region_id
  regionId?: string;
  // status
  status: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      antChainId: 'ant_chain_id',
      pageNumber: 'page_number',
      pageSize: 'page_size',
      regionId: 'region_id',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      antChainId: 'string',
      pageNumber: 'number',
      pageSize: 'number',
      regionId: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBaasChainCertAntResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // result
  result?: ALiYunCertificateApplications;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      result: 'result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      result: ALiYunCertificateApplications,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ReinitBaasChainCertAntRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // ant_chain_id
  antChainId: string;
  // region_id
  regionId?: string;
  // username
  username?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      antChainId: 'ant_chain_id',
      regionId: 'region_id',
      username: 'username',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      antChainId: 'string',
      regionId: 'string',
      username: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ReinitBaasChainCertAntResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // result
  result?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      result: 'result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      result: 'string',
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
          sdk_version: "1.0.0",
          _prod_code: "ak_6f72e7df0c87441c84120631f5b37b12",
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
   * Description: 自动申请区块链证书
   * Summary: 自动申请区块链证书
   */
  async applyBaasChainCertAnt(request: ApplyBaasChainCertAntRequest): Promise<ApplyBaasChainCertAntResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyBaasChainCertAntEx(request, headers, runtime);
  }

  /**
   * Description: 自动申请区块链证书
   * Summary: 自动申请区块链证书
   */
  async applyBaasChainCertAntEx(request: ApplyBaasChainCertAntRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyBaasChainCertAntResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyBaasChainCertAntResponse>(await this.doRequest("1.0", "baas.chain.cert.ant.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyBaasChainCertAntResponse({}));
  }

  /**
   * Description: 手工创建区块链证书
   * Summary: 手工创建区块链证书
   */
  async createBaasChainCertAnt(request: CreateBaasChainCertAntRequest): Promise<CreateBaasChainCertAntResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createBaasChainCertAntEx(request, headers, runtime);
  }

  /**
   * Description: 手工创建区块链证书
   * Summary: 手工创建区块链证书
   */
  async createBaasChainCertAntEx(request: CreateBaasChainCertAntRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateBaasChainCertAntResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateBaasChainCertAntResponse>(await this.doRequest("1.0", "baas.chain.cert.ant.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateBaasChainCertAntResponse({}));
  }

  /**
   * Description: 区块链证书下载
   * Summary: 区块链证书下载
   */
  async downloadBaasChainCertAnt(request: DownloadBaasChainCertAntRequest): Promise<DownloadBaasChainCertAntResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.downloadBaasChainCertAntEx(request, headers, runtime);
  }

  /**
   * Description: 区块链证书下载
   * Summary: 区块链证书下载
   */
  async downloadBaasChainCertAntEx(request: DownloadBaasChainCertAntRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DownloadBaasChainCertAntResponse> {
    Util.validateModel(request);
    return $tea.cast<DownloadBaasChainCertAntResponse>(await this.doRequest("1.0", "baas.chain.cert.ant.download", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DownloadBaasChainCertAntResponse({}));
  }

  /**
   * Description: 区块链证书查询
   * Summary: 区块链证书查询
   */
  async queryBaasChainCertAnt(request: QueryBaasChainCertAntRequest): Promise<QueryBaasChainCertAntResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryBaasChainCertAntEx(request, headers, runtime);
  }

  /**
   * Description: 区块链证书查询
   * Summary: 区块链证书查询
   */
  async queryBaasChainCertAntEx(request: QueryBaasChainCertAntRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryBaasChainCertAntResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBaasChainCertAntResponse>(await this.doRequest("1.0", "baas.chain.cert.ant.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryBaasChainCertAntResponse({}));
  }

  /**
   * Description: 区块链证书重置
   * Summary: 区块链证书重置
   */
  async reinitBaasChainCertAnt(request: ReinitBaasChainCertAntRequest): Promise<ReinitBaasChainCertAntResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.reinitBaasChainCertAntEx(request, headers, runtime);
  }

  /**
   * Description: 区块链证书重置
   * Summary: 区块链证书重置
   */
  async reinitBaasChainCertAntEx(request: ReinitBaasChainCertAntRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ReinitBaasChainCertAntResponse> {
    Util.validateModel(request);
    return $tea.cast<ReinitBaasChainCertAntResponse>(await this.doRequest("1.0", "baas.chain.cert.ant.reinit", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ReinitBaasChainCertAntResponse({}));
  }

}
