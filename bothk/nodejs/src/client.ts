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

// 事件数据
export class EventData extends $tea.Model {
  // 数据内容
  content: string;
  // 可信设备ID
  trustIotDeviceId?: number;
  // 业务ID
  bizId?: string;
  // 数据签名
  signature?: string;
  // 设备数据间接上报时，服务端补充数据
  extraData?: string;
  static names(): { [key: string]: string } {
    return {
      content: 'content',
      trustIotDeviceId: 'trust_iot_device_id',
      bizId: 'biz_id',
      signature: 'signature',
      extraData: 'extra_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      content: 'string',
      trustIotDeviceId: 'number',
      bizId: 'string',
      signature: 'string',
      extraData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 事件数据领域参数
export class EventSpecs extends $tea.Model {
  // 物模型事件ID
  eventModelId: string;
  // 业务数据标识
  bizType?: string;
  // 
  // submit_date	STRING	否	2024-08-15		
  // 
  submitDate?: string;
  // 冗余字段，请忽略
  returnHash?: boolean;
  static names(): { [key: string]: string } {
    return {
      eventModelId: 'event_model_id',
      bizType: 'biz_type',
      submitDate: 'submit_date',
      returnHash: 'return_hash',
    };
  }

  static types(): { [key: string]: any } {
    return {
      eventModelId: 'string',
      bizType: 'string',
      submitDate: 'string',
      returnHash: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 可信设备ID及其关联的设备ID
export class TrustiotDeviceIdMap extends $tea.Model {
  // 可信设备ID
  trustiotDeviceId: number;
  // 设备ID
  deviceId: string;
  static names(): { [key: string]: string } {
    return {
      trustiotDeviceId: 'trustiot_device_id',
      deviceId: 'device_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      trustiotDeviceId: 'number',
      deviceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 通过设备ID注册发行时的设备参数
export class RegByDeviceIdParm extends $tea.Model {
  // 一般是业务上唯一的设备ID/资产编码
  deviceId: string;
  // 物模型事件ID
  deviceDataModelId?: string;
  // 固定填写RAW_DATA
  deviceFeature?: string;
  // true : 设备ID已存在时返回存在的设备关联字段; false : 设备ID已存在时直接抛出异常；
  withExistDeviceId?: boolean;
  // 设备类型编码，联系蚂蚁侧获取设备类型编码
  deviceTypeCode: number;
  // 设备单价 单位：分
  initialPrice?: number;
  // 出厂时间
  factoryTime?: string;
  // 投放时间
  releaseTime?: string;
  // 额外信息，联系蚂蚁侧获取参数格式
  extraInfo?: string;
  // 资产所有人标识（统一社会信用代码）
  owner?: string;
  // 资产所有人名称
  ownerName?: string;
  // 设备IMEI
  deviceImei?: string;
  // 设备名称/设备型号
  deviceName?: string;
  // 生产厂商名
  corpName?: string;
  static names(): { [key: string]: string } {
    return {
      deviceId: 'device_id',
      deviceDataModelId: 'device_data_model_id',
      deviceFeature: 'device_feature',
      withExistDeviceId: 'with_exist_device_id',
      deviceTypeCode: 'device_type_code',
      initialPrice: 'initial_price',
      factoryTime: 'factory_time',
      releaseTime: 'release_time',
      extraInfo: 'extra_info',
      owner: 'owner',
      ownerName: 'owner_name',
      deviceImei: 'device_imei',
      deviceName: 'device_name',
      corpName: 'corp_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      deviceId: 'string',
      deviceDataModelId: 'string',
      deviceFeature: 'string',
      withExistDeviceId: 'boolean',
      deviceTypeCode: 'number',
      initialPrice: 'number',
      factoryTime: 'string',
      releaseTime: 'string',
      extraInfo: 'string',
      owner: 'string',
      ownerName: 'string',
      deviceImei: 'string',
      deviceName: 'string',
      corpName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 通过设备注册发行时的设备参数 （与RegByDeviceIdParam的区别在于设备端有无植入蚂蚁SDK或模组）
export class RegByDeviceParm extends $tea.Model {
  // 一般是业务上唯一的设备ID/资产编码
  deviceId: string;
  // 物模型事件ID
  deviceDataModelId?: string;
  // 设备端经过蚂蚁SDK或模组初始化得到的注册信息
  deviceRegContent: string;
  // 蚂蚁侧SDK或模组对device_reg_content的签名
  deviceRegSignature: string;
  // sdk版本号，由蚂蚁侧提供
  sdkId: string;
  // 设备类型编码，联系蚂蚁侧获取设备类型编码
  deviceTypeCode: number;
  // 设备单价 单位：分
  initialPrice?: number;
  // 出厂时间
  factoryTime?: string;
  // 投放时间
  releaseTime?: string;
  // 额外信息，联系蚂蚁侧获取参数格式
  extraInfo?: string;
  // 资产所有人标识（统一社会信用代码）
  owner?: string;
  // 资产所有人名称
  ownerName?: string;
  // 设备名称/型号
  deviceName?: string;
  // 设备IMEI
  deviceImei?: string;
  static names(): { [key: string]: string } {
    return {
      deviceId: 'device_id',
      deviceDataModelId: 'device_data_model_id',
      deviceRegContent: 'device_reg_content',
      deviceRegSignature: 'device_reg_signature',
      sdkId: 'sdk_id',
      deviceTypeCode: 'device_type_code',
      initialPrice: 'initial_price',
      factoryTime: 'factory_time',
      releaseTime: 'release_time',
      extraInfo: 'extra_info',
      owner: 'owner',
      ownerName: 'owner_name',
      deviceName: 'device_name',
      deviceImei: 'device_imei',
    };
  }

  static types(): { [key: string]: any } {
    return {
      deviceId: 'string',
      deviceDataModelId: 'string',
      deviceRegContent: 'string',
      deviceRegSignature: 'string',
      sdkId: 'string',
      deviceTypeCode: 'number',
      initialPrice: 'number',
      factoryTime: 'string',
      releaseTime: 'string',
      extraInfo: 'string',
      owner: 'string',
      ownerName: 'string',
      deviceName: 'string',
      deviceImei: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 设备信息
export class Device extends $tea.Model {
  // 设备ID，一般是设备的出厂编码或业务上的资产ID
  deviceId: string;
  // 物模型事件ID
  deviceDataModelId: string;
  // 场景码
  scene: string;
  // imei号
  deviceImei: string;
  // 设备名称
  deviceName?: string;
  // 设备厂商名称
  corpName?: string;
  // 设备ICCID
  deviceIccid?: string;
  // 设备扩展信息
  extraInfo?: string;
  // 设备类型编码
  deviceTypeCode: string;
  // 单价
  initialPrice: number;
  // 投放时间
  releaseTime: string;
  // 出厂时间
  factoryTime: string;
  // 设备状态，取值范围：NORMAL、OFFLINE、UNREGISTER
  deviceStatus?: string;
  // 可信设备ID
  trustiotDeviceId: number;
  static names(): { [key: string]: string } {
    return {
      deviceId: 'device_id',
      deviceDataModelId: 'device_data_model_id',
      scene: 'scene',
      deviceImei: 'device_imei',
      deviceName: 'device_name',
      corpName: 'corp_name',
      deviceIccid: 'device_iccid',
      extraInfo: 'extra_info',
      deviceTypeCode: 'device_type_code',
      initialPrice: 'initial_price',
      releaseTime: 'release_time',
      factoryTime: 'factory_time',
      deviceStatus: 'device_status',
      trustiotDeviceId: 'trustiot_device_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      deviceId: 'string',
      deviceDataModelId: 'string',
      scene: 'string',
      deviceImei: 'string',
      deviceName: 'string',
      corpName: 'string',
      deviceIccid: 'string',
      extraInfo: 'string',
      deviceTypeCode: 'string',
      initialPrice: 'number',
      releaseTime: 'string',
      factoryTime: 'string',
      deviceStatus: 'string',
      trustiotDeviceId: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 收集数据返回的上链结果
export class SendCollectorResult extends $tea.Model {
  // 原入参的数组索引
  // 
  originalIndex: number;
  // 失败数据对应的异常码，成功时该字段为空
  errorCode?: string;
  // 异常信息
  errorMsg?: string;
  // 返回的扩展信息
  extraInfo?: string;
  static names(): { [key: string]: string } {
    return {
      originalIndex: 'original_index',
      errorCode: 'error_code',
      errorMsg: 'error_msg',
      extraInfo: 'extra_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      originalIndex: 'number',
      errorCode: 'string',
      errorMsg: 'string',
      extraInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateDistributedeviceBydeviceidmulRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 场景码
  scene: string;
  // 设备注册信息集合
  deviceParamList: RegByDeviceIdParm[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      scene: 'scene',
      deviceParamList: 'device_param_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      scene: 'string',
      deviceParamList: { 'type': 'array', 'itemType': RegByDeviceIdParm },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateDistributedeviceBydeviceidmulResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 可信设备ID集合
  trustiotDeviceIdList?: TrustiotDeviceIdMap[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      trustiotDeviceIdList: 'trustiot_device_id_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      trustiotDeviceIdList: { 'type': 'array', 'itemType': TrustiotDeviceIdMap },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateDistributedeviceBydevicemulRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 场景码，由蚂蚁侧定义
  scene: string;
  // 设备注册信息集合, 数组长度不超过50
  deviceParamList: RegByDeviceParm[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      scene: 'scene',
      deviceParamList: 'device_param_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      scene: 'string',
      deviceParamList: { 'type': 'array', 'itemType': RegByDeviceParm },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateDistributedeviceBydevicemulResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 可信设备ID集合
  trustiotDeviceIdList?: TrustiotDeviceIdMap[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      trustiotDeviceIdList: 'trustiot_device_id_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      trustiotDeviceIdList: { 'type': 'array', 'itemType': TrustiotDeviceIdMap },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SendEventDataRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 场景码
  scene: string;
  // 事件数据列表
  eventDataList: EventData[];
  // 事件数据领域参数
  eventSpecs: EventSpecs;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      scene: 'scene',
      eventDataList: 'event_data_list',
      eventSpecs: 'event_specs',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      scene: 'string',
      eventDataList: { 'type': 'array', 'itemType': EventData },
      eventSpecs: EventSpecs,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SendEventDataResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 上报数据返回的上链结果
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

export class GetDeviceBydeviceidRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 设备id集合
  deviceIdList: string[];
  // 场景码
  scene: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      deviceIdList: 'device_id_list',
      scene: 'scene',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      deviceIdList: { 'type': 'array', 'itemType': 'string' },
      scene: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetDeviceBydeviceidResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 设备详情
  deviceList?: Device[];
  // 设备信息不存在的deviceId集合
  missDeviceIdList?: string[];
  // 成功获取到设备信息的deviceid集合
  successDeviceIdList?: string[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      deviceList: 'device_list',
      missDeviceIdList: 'miss_device_id_list',
      successDeviceIdList: 'success_device_id_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      deviceList: { 'type': 'array', 'itemType': Device },
      missDeviceIdList: { 'type': 'array', 'itemType': 'string' },
      successDeviceIdList: { 'type': 'array', 'itemType': 'string' },
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
          sdk_version: "1.0.1",
          _prod_code: "BOTHK",
          _prod_channel: "default",
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
   * Description: 通过设备ID异步批量发行设备
   * Summary: 通过设备ID异步批量发行设备
   */
  async createDistributedeviceBydeviceidmul(request: CreateDistributedeviceBydeviceidmulRequest): Promise<CreateDistributedeviceBydeviceidmulResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createDistributedeviceBydeviceidmulEx(request, headers, runtime);
  }

  /**
   * Description: 通过设备ID异步批量发行设备
   * Summary: 通过设备ID异步批量发行设备
   */
  async createDistributedeviceBydeviceidmulEx(request: CreateDistributedeviceBydeviceidmulRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateDistributedeviceBydeviceidmulResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateDistributedeviceBydeviceidmulResponse>(await this.doRequest("1.0", "antdigital.bothk.distributedevice.bydeviceidmul.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateDistributedeviceBydeviceidmulResponse({}));
  }

  /**
   * Description: 通过设备异步批量发行设备
   * Summary: 通过设备异步批量发行设备
   */
  async createDistributedeviceBydevicemul(request: CreateDistributedeviceBydevicemulRequest): Promise<CreateDistributedeviceBydevicemulResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createDistributedeviceBydevicemulEx(request, headers, runtime);
  }

  /**
   * Description: 通过设备异步批量发行设备
   * Summary: 通过设备异步批量发行设备
   */
  async createDistributedeviceBydevicemulEx(request: CreateDistributedeviceBydevicemulRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateDistributedeviceBydevicemulResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateDistributedeviceBydevicemulResponse>(await this.doRequest("1.0", "antdigital.bothk.distributedevice.bydevicemul.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateDistributedeviceBydevicemulResponse({}));
  }

  /**
   * Description: 事件数据上报整合接口
   * Summary: 事件数据上报整合接口
   */
  async sendEventData(request: SendEventDataRequest): Promise<SendEventDataResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.sendEventDataEx(request, headers, runtime);
  }

  /**
   * Description: 事件数据上报整合接口
   * Summary: 事件数据上报整合接口
   */
  async sendEventDataEx(request: SendEventDataRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SendEventDataResponse> {
    Util.validateModel(request);
    return $tea.cast<SendEventDataResponse>(await this.doRequest("1.0", "antdigital.bothk.event.data.send", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SendEventDataResponse({}));
  }

  /**
   * Description: 通过deviceId获取设备详情
   * Summary: 通过deviceId获取设备详情
   */
  async getDeviceBydeviceid(request: GetDeviceBydeviceidRequest): Promise<GetDeviceBydeviceidResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getDeviceBydeviceidEx(request, headers, runtime);
  }

  /**
   * Description: 通过deviceId获取设备详情
   * Summary: 通过deviceId获取设备详情
   */
  async getDeviceBydeviceidEx(request: GetDeviceBydeviceidRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetDeviceBydeviceidResponse> {
    Util.validateModel(request);
    return $tea.cast<GetDeviceBydeviceidResponse>(await this.doRequest("1.0", "antdigital.bothk.device.bydeviceid.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetDeviceBydeviceidResponse({}));
  }

}
