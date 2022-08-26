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

// 阿里云链节点信息
export class ALiYunChainNodeInfo extends $tea.Model {
  // block_height
  blockHeight?: number;
  // node_name
  nodeName?: string;
  // status
  status?: boolean;
  // version
  version?: string;
  // 节点id
  nodeId?: string;
  // 节点ip
  nodeIp?: string;
  // 节点的端口
  nodePort?: string;
  // 节点类型
  nodeType?: string;
  // 节点状态
  nodeState?: string;
  // 节点来源
  nodeSource?: string;
  // 节点存储空间使用量
  diskUse?: string;
  // 节点存储总空间大小
  diskTotal?: string;
  // 节点公钥
  publicKey?: string;
  static names(): { [key: string]: string } {
    return {
      blockHeight: 'block_height',
      nodeName: 'node_name',
      status: 'status',
      version: 'version',
      nodeId: 'node_id',
      nodeIp: 'node_ip',
      nodePort: 'node_port',
      nodeType: 'node_type',
      nodeState: 'node_state',
      nodeSource: 'node_source',
      diskUse: 'disk_use',
      diskTotal: 'disk_total',
      publicKey: 'public_key',
    };
  }

  static types(): { [key: string]: any } {
    return {
      blockHeight: 'number',
      nodeName: 'string',
      status: 'boolean',
      version: 'string',
      nodeId: 'string',
      nodeIp: 'string',
      nodePort: 'string',
      nodeType: 'string',
      nodeState: 'string',
      nodeSource: 'string',
      diskUse: 'string',
      diskTotal: 'string',
      publicKey: 'string',
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

// 阿里云联盟成员信息
export class ALiYunMember extends $tea.Model {
  // 加入时间
  joinTime?: number;
  // 成员id
  memberId?: string;
  // 成员名称
  memberName?: string;
  // 角色
  role?: string;
  // 状态
  status?: string;
  static names(): { [key: string]: string } {
    return {
      joinTime: 'join_time',
      memberId: 'member_id',
      memberName: 'member_name',
      role: 'role',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      joinTime: 'number',
      memberId: 'string',
      memberName: 'string',
      role: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 阿里云子链检查结果
export class ALiYunChainSubnetCheck extends $tea.Model {
  // 检查结果
  checkResult?: string;
  // 子链成员列表
  consortiumMemberList?: string[];
  // 节点信息列表
  chainNodeInfoList?: ALiYunChainNodeInfo[];
  // 联盟管理员
  consortiumAdmin?: boolean;
  // 子链成员列表
  consortiumMemberInfoList?: ALiYunMember[];
  // 分页信息
  pagination?: ALiYunPagination;
  static names(): { [key: string]: string } {
    return {
      checkResult: 'check_result',
      consortiumMemberList: 'consortium_member_list',
      chainNodeInfoList: 'chain_node_info_list',
      consortiumAdmin: 'consortium_admin',
      consortiumMemberInfoList: 'consortium_member_info_list',
      pagination: 'pagination',
    };
  }

  static types(): { [key: string]: any } {
    return {
      checkResult: 'string',
      consortiumMemberList: { 'type': 'array', 'itemType': 'string' },
      chainNodeInfoList: { 'type': 'array', 'itemType': ALiYunChainNodeInfo },
      consortiumAdmin: 'boolean',
      consortiumMemberInfoList: { 'type': 'array', 'itemType': ALiYunMember },
      pagination: ALiYunPagination,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBaasChainNodeAntRequest extends $tea.Model {
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

export class QueryBaasChainNodeAntResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // result
  result?: string[];
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
      result: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddBaasChainSubnetNodeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 子链节点
  antChainId?: string;
  // 联盟id
  consortiumId?: string;
  // 节点id
  nodeId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      antChainId: 'ant_chain_id',
      consortiumId: 'consortium_id',
      nodeId: 'node_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      antChainId: 'string',
      consortiumId: 'string',
      nodeId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddBaasChainSubnetNodeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 添加节点的结果
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

export class CheckBaasChainSubnetNodeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 子链id
  antChainId?: string;
  // 联盟id
  consortiumId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      antChainId: 'ant_chain_id',
      consortiumId: 'consortium_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      antChainId: 'string',
      consortiumId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckBaasChainSubnetNodeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 阿里云节点信息列表
  result?: ALiYunChainNodeInfo[];
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
      result: { 'type': 'array', 'itemType': ALiYunChainNodeInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteBaasChainSubnetNodeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 子链id
  antChainId?: string;
  // 联盟id
  consortiumId?: string;
  // 待删除的节点id
  nodeId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      antChainId: 'ant_chain_id',
      consortiumId: 'consortium_id',
      nodeId: 'node_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      antChainId: 'string',
      consortiumId: 'string',
      nodeId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteBaasChainSubnetNodeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 删除节点的结果
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

export class QueryBaasChainSubnetNodeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 子链id
  antChainId?: string;
  // 联盟id
  consortiumId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      antChainId: 'ant_chain_id',
      consortiumId: 'consortium_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      antChainId: 'string',
      consortiumId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBaasChainSubnetNodeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 子链节点信息列表
  result?: ALiYunChainSubnetCheck;
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
      result: ALiYunChainSubnetCheck,
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
          _prod_code: "ak_2069749a63f8412b8e528747be987d84",
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
   * Description: 阿里云链节点查询
   * Summary: 阿里云链节点查询
   */
  async queryBaasChainNodeAnt(request: QueryBaasChainNodeAntRequest): Promise<QueryBaasChainNodeAntResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryBaasChainNodeAntEx(request, headers, runtime);
  }

  /**
   * Description: 阿里云链节点查询
   * Summary: 阿里云链节点查询
   */
  async queryBaasChainNodeAntEx(request: QueryBaasChainNodeAntRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryBaasChainNodeAntResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBaasChainNodeAntResponse>(await this.doRequest("1.0", "baas.chain.node.ant.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryBaasChainNodeAntResponse({}));
  }

  /**
   * Description: 阿里云子链节点添加
   * Summary: 阿里云子链节点添加
   */
  async addBaasChainSubnetNode(request: AddBaasChainSubnetNodeRequest): Promise<AddBaasChainSubnetNodeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.addBaasChainSubnetNodeEx(request, headers, runtime);
  }

  /**
   * Description: 阿里云子链节点添加
   * Summary: 阿里云子链节点添加
   */
  async addBaasChainSubnetNodeEx(request: AddBaasChainSubnetNodeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AddBaasChainSubnetNodeResponse> {
    Util.validateModel(request);
    return $tea.cast<AddBaasChainSubnetNodeResponse>(await this.doRequest("1.0", "baas.chain.subnet.node.add", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AddBaasChainSubnetNodeResponse({}));
  }

  /**
   * Description: 阿里云子链节点添加的前置检查
   * Summary: 阿里云子链节点添加的前置检查
   */
  async checkBaasChainSubnetNode(request: CheckBaasChainSubnetNodeRequest): Promise<CheckBaasChainSubnetNodeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.checkBaasChainSubnetNodeEx(request, headers, runtime);
  }

  /**
   * Description: 阿里云子链节点添加的前置检查
   * Summary: 阿里云子链节点添加的前置检查
   */
  async checkBaasChainSubnetNodeEx(request: CheckBaasChainSubnetNodeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CheckBaasChainSubnetNodeResponse> {
    Util.validateModel(request);
    return $tea.cast<CheckBaasChainSubnetNodeResponse>(await this.doRequest("1.0", "baas.chain.subnet.node.check", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CheckBaasChainSubnetNodeResponse({}));
  }

  /**
   * Description: 阿里云子链的节点删除
   * Summary: 阿里云子链的节点删除
   */
  async deleteBaasChainSubnetNode(request: DeleteBaasChainSubnetNodeRequest): Promise<DeleteBaasChainSubnetNodeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteBaasChainSubnetNodeEx(request, headers, runtime);
  }

  /**
   * Description: 阿里云子链的节点删除
   * Summary: 阿里云子链的节点删除
   */
  async deleteBaasChainSubnetNodeEx(request: DeleteBaasChainSubnetNodeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteBaasChainSubnetNodeResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteBaasChainSubnetNodeResponse>(await this.doRequest("1.0", "baas.chain.subnet.node.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteBaasChainSubnetNodeResponse({}));
  }

  /**
   * Description: 阿里云子链节点信息查询
   * Summary: 阿里云子链节点信息查询
   */
  async queryBaasChainSubnetNode(request: QueryBaasChainSubnetNodeRequest): Promise<QueryBaasChainSubnetNodeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryBaasChainSubnetNodeEx(request, headers, runtime);
  }

  /**
   * Description: 阿里云子链节点信息查询
   * Summary: 阿里云子链节点信息查询
   */
  async queryBaasChainSubnetNodeEx(request: QueryBaasChainSubnetNodeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryBaasChainSubnetNodeResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBaasChainSubnetNodeResponse>(await this.doRequest("1.0", "baas.chain.subnet.node.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryBaasChainSubnetNodeResponse({}));
  }

}
