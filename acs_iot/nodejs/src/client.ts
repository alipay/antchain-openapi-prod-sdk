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

// 收集信息
export class CollectContent extends $tea.Model {
  // 链上设备Id
  // 
  chainDeviceId: string;
  // 收集的内容
  // 
  content: string;
  // 对内容的签名
  // 
  signature: string;
  // 服务端发送的扩展数据（非可信设备直接产生的数据）
  extraData?: string;
  static names(): { [key: string]: string } {
    return {
      chainDeviceId: 'chain_device_id',
      content: 'content',
      signature: 'signature',
      extraData: 'extra_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      chainDeviceId: 'string',
      content: 'string',
      signature: 'string',
      extraData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 收集数据(免签名)
export class CollectContentNoSign extends $tea.Model {
  // 链上设备Id
  // 
  chainDeviceId: string;
  // 收集内容
  content: string;
  // 服务端发送的扩展数据（非可信设备直接产生的数据）
  extraData?: string;
  static names(): { [key: string]: string } {
    return {
      chainDeviceId: 'chain_device_id',
      content: 'content',
      extraData: 'extra_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      chainDeviceId: 'string',
      content: 'string',
      extraData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 收集数据返回的上链结果
export class SendCollectorResult extends $tea.Model {
  // 数据内容content的上链交易哈希
  txHash: string;
  static names(): { [key: string]: string } {
    return {
      txHash: 'tx_hash',
    };
  }

  static types(): { [key: string]: any } {
    return {
      txHash: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 收集标签数据
export class CollectLabelContent extends $tea.Model {
  // 链上设备ID
  chainDeviceId: string;
  // 1.设备端上报数据内容 2.与设备上报的数据一致，服务...
  // 
  content: string;
  // content的签名 与设备上报的签名保持一致，服务端不可修改
  signature: string;
  // 未经设备签名的附加数据JSON String 注意：如果 content 批量解析 ，extraData也会批量复制融入解析后的content
  extraData?: string;
  static names(): { [key: string]: string } {
    return {
      chainDeviceId: 'chain_device_id',
      content: 'content',
      signature: 'signature',
      extraData: 'extra_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      chainDeviceId: 'string',
      content: 'string',
      signature: 'string',
      extraData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateDeviceBydeviceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 设备ID
  deviceId: string;
  // 项目编码 -对应acs iot管控后台项目code
  projectCode: string;
  // 设备类型编码-对应acs iot管控后台设备类型code
  classCode: string;
  // 注册内容
  content: string;
  // 设备名称
  deviceName: string;
  // 设备单价 单位：分
  // 
  initialPrice?: number;
  // 出厂时间
  factoryTime?: string;
  // 投放时间
  releaseTime?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      deviceId: 'device_id',
      projectCode: 'project_code',
      classCode: 'class_code',
      content: 'content',
      deviceName: 'device_name',
      initialPrice: 'initial_price',
      factoryTime: 'factory_time',
      releaseTime: 'release_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      deviceId: 'string',
      projectCode: 'string',
      classCode: 'string',
      content: 'string',
      deviceName: 'string',
      initialPrice: 'number',
      factoryTime: 'string',
      releaseTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateDeviceBydeviceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 链上唯一身份ID
  chainDeviceDid?: string;
  // 设备激活文本-设备直连上链方式使用
  // 
  activeData?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      chainDeviceDid: 'chain_device_did',
      activeData: 'active_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      chainDeviceDid: 'string',
      activeData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateDeviceBychainidRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 设备ID
  deviceId: string;
  // 项目编码-对应acs iot管控后台项目code
  projectCode: string;
  // 设备类型编码-对应acs iot管控后台设备类型code
  classCode: string;
  // 设备注册内容
  content: string;
  // 设备注册内容签名
  signature: string;
  // 设备名称
  deviceName: string;
  // 设备单价 单位：分
  // 
  initialPrice?: number;
  // 设备出厂时间
  factoryTime?: string;
  // 设备投放时间
  releaseTime?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      deviceId: 'device_id',
      projectCode: 'project_code',
      classCode: 'class_code',
      content: 'content',
      signature: 'signature',
      deviceName: 'device_name',
      initialPrice: 'initial_price',
      factoryTime: 'factory_time',
      releaseTime: 'release_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      deviceId: 'string',
      projectCode: 'string',
      classCode: 'string',
      content: 'string',
      signature: 'string',
      deviceName: 'string',
      initialPrice: 'number',
      factoryTime: 'string',
      releaseTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateDeviceBychainidResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 设备链上ID
  // 
  chainDeviceId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      chainDeviceId: 'chain_device_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      chainDeviceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SendCollectorBychainidRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 设备链id
  chainDeviceId: string;
  // [{"name","1"},{"name","1"}]
  collectContentList: CollectContent[];
  // 随机数，防重放
  // 
  nonce: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      chainDeviceId: 'chain_device_id',
      collectContentList: 'collect_content_list',
      nonce: 'nonce',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      chainDeviceId: 'string',
      collectContentList: { 'type': 'array', 'itemType': CollectContent },
      nonce: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SendCollectorBychainidResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 收集数据返回的上链结果
  resultList?: SendCollectorResult[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      resultList: 'result_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      resultList: { 'type': 'array', 'itemType': SendCollectorResult },
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
          sdk_version: "1.0.1",
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
   * Description: biot设备注册-创建设备链账号
   * Summary: biot设备注册-创建设备链账号
   */
  async createDeviceBydevice(request: CreateDeviceBydeviceRequest): Promise<CreateDeviceBydeviceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createDeviceBydeviceEx(request, headers, runtime);
  }

  /**
   * Description: biot设备注册-创建设备链账号
   * Summary: biot设备注册-创建设备链账号
   */
  async createDeviceBydeviceEx(request: CreateDeviceBydeviceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateDeviceBydeviceResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateDeviceBydeviceResponse>(await this.doRequest("1.0", "acs.iot.device.bydevice.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateDeviceBydeviceResponse({}));
  }

  /**
   * Description: biot设备注册-通过项目链账号上链
   * Summary: biot设备注册-通过项目链账号上链
   */
  async createDeviceBychainid(request: CreateDeviceBychainidRequest): Promise<CreateDeviceBychainidResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createDeviceBychainidEx(request, headers, runtime);
  }

  /**
   * Description: biot设备注册-通过项目链账号上链
   * Summary: biot设备注册-通过项目链账号上链
   */
  async createDeviceBychainidEx(request: CreateDeviceBychainidRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateDeviceBychainidResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateDeviceBychainidResponse>(await this.doRequest("1.0", "acs.iot.device.bychainid.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateDeviceBychainidResponse({}));
  }

  /**
   * Description: biot 私有化 业务数据上报
   * Summary: biot 私有化 业务数据上报
   */
  async sendCollectorBychainid(request: SendCollectorBychainidRequest): Promise<SendCollectorBychainidResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.sendCollectorBychainidEx(request, headers, runtime);
  }

  /**
   * Description: biot 私有化 业务数据上报
   * Summary: biot 私有化 业务数据上报
   */
  async sendCollectorBychainidEx(request: SendCollectorBychainidRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SendCollectorBychainidResponse> {
    Util.validateModel(request);
    return $tea.cast<SendCollectorBychainidResponse>(await this.doRequest("1.0", "acs.iot.collector.bychainid.send", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SendCollectorBychainidResponse({}));
  }

}
