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

// 阿里云合约工程信息
export class ALiYunContractProject extends $tea.Model {
  // consortium_id
  consortiumId?: string;
  // create_time
  createTime?: number;
  // project_description
  projectDescription?: string;
  // project_id
  projectId?: string;
  // project_name
  projectName?: string;
  // project_version
  projectVersion?: string;
  // update_time
  updateTime?: number;
  static names(): { [key: string]: string } {
    return {
      consortiumId: 'consortium_id',
      createTime: 'create_time',
      projectDescription: 'project_description',
      projectId: 'project_id',
      projectName: 'project_name',
      projectVersion: 'project_version',
      updateTime: 'update_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      consortiumId: 'string',
      createTime: 'number',
      projectDescription: 'string',
      projectId: 'string',
      projectName: 'string',
      projectVersion: 'string',
      updateTime: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 复制阿里云合约工程信息
export class ALiYunContractProjectDuplicate extends $tea.Model {
  // consortium_id
  consortiumId?: string;
  // description
  description?: string;
  // gmt_create
  gmtCreate?: number;
  // gmt_modified
  gmtModified?: number;
  // id
  id?: string;
  // name
  name?: string;
  // version
  version?: string;
  static names(): { [key: string]: string } {
    return {
      consortiumId: 'consortium_id',
      description: 'description',
      gmtCreate: 'gmt_create',
      gmtModified: 'gmt_modified',
      id: 'id',
      name: 'name',
      version: 'version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      consortiumId: 'string',
      description: 'string',
      gmtCreate: 'number',
      gmtModified: 'number',
      id: 'string',
      name: 'string',
      version: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 阿里云合约工程信息查询
export class ALiYunContractProjects extends $tea.Model {
  // contract_projects
  contractProjects?: ALiYunContractProject[];
  // pagination
  pagination?: ALiYunPagination;
  static names(): { [key: string]: string } {
    return {
      contractProjects: 'contract_projects',
      pagination: 'pagination',
    };
  }

  static types(): { [key: string]: any } {
    return {
      contractProjects: { 'type': 'array', 'itemType': ALiYunContractProject },
      pagination: ALiYunPagination,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CloneBaasChainContractProjectRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // consortium_id
  consortiumId: string;
  // project_description
  projectDescription: string;
  // project_id
  projectId: string;
  // project_name
  projectName: string;
  // project_version
  projectVersion: string;
  // region_id
  regionId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      consortiumId: 'consortium_id',
      projectDescription: 'project_description',
      projectId: 'project_id',
      projectName: 'project_name',
      projectVersion: 'project_version',
      regionId: 'region_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      consortiumId: 'string',
      projectDescription: 'string',
      projectId: 'string',
      projectName: 'string',
      projectVersion: 'string',
      regionId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CloneBaasChainContractProjectResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // result
  result?: ALiYunContractProject;
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
      result: ALiYunContractProject,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateBaasChainContractProjectRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // consortium_id
  consortiumId?: string;
  // project_description
  projectDescription?: string;
  // project_name
  projectName?: string;
  // project_version
  projectVersion?: string;
  // region_id
  regionId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      consortiumId: 'consortium_id',
      projectDescription: 'project_description',
      projectName: 'project_name',
      projectVersion: 'project_version',
      regionId: 'region_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      consortiumId: 'string',
      projectDescription: 'string',
      projectName: 'string',
      projectVersion: 'string',
      regionId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateBaasChainContractProjectResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // result
  result?: ALiYunContractProject;
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
      result: ALiYunContractProject,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteBaasChainContractProjectRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // consortium_id
  consortiumId?: string;
  // project_id
  projectId?: string;
  // region_id
  regionId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      consortiumId: 'consortium_id',
      projectId: 'project_id',
      regionId: 'region_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      consortiumId: 'string',
      projectId: 'string',
      regionId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteBaasChainContractProjectResponse extends $tea.Model {
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

export class QueryBaasChainContractProjectRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // consortium_id
  consortiumId: string;
  // page_number
  pageNumber: number;
  // page_size
  pageSize: number;
  // region_id
  regionId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      consortiumId: 'consortium_id',
      pageNumber: 'page_number',
      pageSize: 'page_size',
      regionId: 'region_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      consortiumId: 'string',
      pageNumber: 'number',
      pageSize: 'number',
      regionId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBaasChainContractProjectResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // result
  result?: ALiYunContractProjects;
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
      result: ALiYunContractProjects,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RetryBaasChainContractProjectRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // consortium_id
  consortiumId: string;
  // description
  description?: string;
  // name
  name?: string;
  // project_id
  projectId?: string;
  // project_version
  projectVersion?: string;
  // region_id
  regionId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      consortiumId: 'consortium_id',
      description: 'description',
      name: 'name',
      projectId: 'project_id',
      projectVersion: 'project_version',
      regionId: 'region_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      consortiumId: 'string',
      description: 'string',
      name: 'string',
      projectId: 'string',
      projectVersion: 'string',
      regionId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RetryBaasChainContractProjectResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // result
  result?: ALiYunContractProjectDuplicate;
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
      result: ALiYunContractProjectDuplicate,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateBaasChainContractProjectRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // consortium_id
  consortiumId: string;
  // project_description
  projectDescription?: string;
  // project_id
  projectId: string;
  // project_name
  projectName?: string;
  // project_version
  projectVersion?: string;
  // region_id
  regionId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      consortiumId: 'consortium_id',
      projectDescription: 'project_description',
      projectId: 'project_id',
      projectName: 'project_name',
      projectVersion: 'project_version',
      regionId: 'region_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      consortiumId: 'string',
      projectDescription: 'string',
      projectId: 'string',
      projectName: 'string',
      projectVersion: 'string',
      regionId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateBaasChainContractProjectResponse extends $tea.Model {
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
          _prod_code: "ak_d55db67c8e5a4e799ff51ac9e5bcede3",
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
   * Description: 复制阿里云合约工程
   * Summary: 复制阿里云合约工程
   */
  async cloneBaasChainContractProject(request: CloneBaasChainContractProjectRequest): Promise<CloneBaasChainContractProjectResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.cloneBaasChainContractProjectEx(request, headers, runtime);
  }

  /**
   * Description: 复制阿里云合约工程
   * Summary: 复制阿里云合约工程
   */
  async cloneBaasChainContractProjectEx(request: CloneBaasChainContractProjectRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CloneBaasChainContractProjectResponse> {
    Util.validateModel(request);
    return $tea.cast<CloneBaasChainContractProjectResponse>(await this.doRequest("1.0", "baas.chain.contract.project.clone", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CloneBaasChainContractProjectResponse({}));
  }

  /**
   * Description: 阿里云合约工程创建
   * Summary: 阿里云合约工程创建
   */
  async createBaasChainContractProject(request: CreateBaasChainContractProjectRequest): Promise<CreateBaasChainContractProjectResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createBaasChainContractProjectEx(request, headers, runtime);
  }

  /**
   * Description: 阿里云合约工程创建
   * Summary: 阿里云合约工程创建
   */
  async createBaasChainContractProjectEx(request: CreateBaasChainContractProjectRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateBaasChainContractProjectResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateBaasChainContractProjectResponse>(await this.doRequest("1.0", "baas.chain.contract.project.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateBaasChainContractProjectResponse({}));
  }

  /**
   * Description: 阿里云合约工程删除
   * Summary: 阿里云合约工程删除
   */
  async deleteBaasChainContractProject(request: DeleteBaasChainContractProjectRequest): Promise<DeleteBaasChainContractProjectResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteBaasChainContractProjectEx(request, headers, runtime);
  }

  /**
   * Description: 阿里云合约工程删除
   * Summary: 阿里云合约工程删除
   */
  async deleteBaasChainContractProjectEx(request: DeleteBaasChainContractProjectRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteBaasChainContractProjectResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteBaasChainContractProjectResponse>(await this.doRequest("1.0", "baas.chain.contract.project.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteBaasChainContractProjectResponse({}));
  }

  /**
   * Description: 阿里云合约工程信息查询
   * Summary: 阿里云合约工程信息查询
   */
  async queryBaasChainContractProject(request: QueryBaasChainContractProjectRequest): Promise<QueryBaasChainContractProjectResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryBaasChainContractProjectEx(request, headers, runtime);
  }

  /**
   * Description: 阿里云合约工程信息查询
   * Summary: 阿里云合约工程信息查询
   */
  async queryBaasChainContractProjectEx(request: QueryBaasChainContractProjectRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryBaasChainContractProjectResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBaasChainContractProjectResponse>(await this.doRequest("1.0", "baas.chain.contract.project.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryBaasChainContractProjectResponse({}));
  }

  /**
   * Description: 复制阿里云合约工程
   * Summary: 复制阿里云合约工程
   */
  async retryBaasChainContractProject(request: RetryBaasChainContractProjectRequest): Promise<RetryBaasChainContractProjectResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.retryBaasChainContractProjectEx(request, headers, runtime);
  }

  /**
   * Description: 复制阿里云合约工程
   * Summary: 复制阿里云合约工程
   */
  async retryBaasChainContractProjectEx(request: RetryBaasChainContractProjectRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RetryBaasChainContractProjectResponse> {
    Util.validateModel(request);
    return $tea.cast<RetryBaasChainContractProjectResponse>(await this.doRequest("1.0", "baas.chain.contract.project.retry", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RetryBaasChainContractProjectResponse({}));
  }

  /**
   * Description: 更新阿里云区块链的合约工程
   * Summary: 更新阿里云区块链的合约工程
   */
  async updateBaasChainContractProject(request: UpdateBaasChainContractProjectRequest): Promise<UpdateBaasChainContractProjectResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateBaasChainContractProjectEx(request, headers, runtime);
  }

  /**
   * Description: 更新阿里云区块链的合约工程
   * Summary: 更新阿里云区块链的合约工程
   */
  async updateBaasChainContractProjectEx(request: UpdateBaasChainContractProjectRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateBaasChainContractProjectResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateBaasChainContractProjectResponse>(await this.doRequest("1.0", "baas.chain.contract.project.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateBaasChainContractProjectResponse({}));
  }

}
