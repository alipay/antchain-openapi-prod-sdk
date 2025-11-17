// This file is auto-generated, don't edit it
import AntchainUtil from '@antchain/alipay-util';
import Util, * as $Util from '@alicloud/tea-util';
import RPCUtil from '@alicloud/rpc-util';
import { Readable } from 'stream';
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

// 批处理结果
export class BatchResult extends $tea.Model {
  // 业务号
  bizNo: string;
  // 业务号类型
  bizNoType: string;
  // 结果
  result?: string;
  // 结果码
  resultCode?: string;
  static names(): { [key: string]: string } {
    return {
      bizNo: 'biz_no',
      bizNoType: 'biz_no_type',
      result: 'result',
      resultCode: 'result_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      bizNo: 'string',
      bizNoType: 'string',
      result: 'string',
      resultCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 任务详细结果包含任务的统计数据信息
export class TaskDetailResult extends $tea.Model {
  // 总数量
  totalCount?: number;
  // 成功数量
  successCount?: number;
  // 失败数量
  failCount?: number;
  // 处理中数量
  processingCount?: number;
  // 当状态为无效时，显示具体的错误信息
  errorInfo?: string;
  static names(): { [key: string]: string } {
    return {
      totalCount: 'total_count',
      successCount: 'success_count',
      failCount: 'fail_count',
      processingCount: 'processing_count',
      errorInfo: 'error_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      totalCount: 'number',
      successCount: 'number',
      failCount: 'number',
      processingCount: 'number',
      errorInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 地址，包含省、市、区(县)
export class Address extends $tea.Model {
  // 市级
  city: string;
  // 区、县级
  district?: string;
  static names(): { [key: string]: string } {
    return {
      city: 'city',
      district: 'district',
    };
  }

  static types(): { [key: string]: any } {
    return {
      city: 'string',
      district: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 业务号条件
export class BizNoCondition extends $tea.Model {
  // 枚举
  // CITY 城市
  // BLOCK 区县
  // AGE 年龄
  dimension: string;
  // 枚举范围，每个维度的值是或的关系,需要校验场景和取值范围是否匹配
  // CITY:区划码
  // BLOCK:区划码（底包暂不支持）
  // AGE:30+、40+、50+（底包暂不支持
  valueScope: string[];
  static names(): { [key: string]: string } {
    return {
      dimension: 'dimension',
      valueScope: 'value_scope',
    };
  }

  static types(): { [key: string]: any } {
    return {
      dimension: 'string',
      valueScope: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 键值对
export class XNameValuePair extends $tea.Model {
  // 键名
  name: string;
  // 键值
  value: string;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      value: 'value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      value: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class JudgeCrowdPrefermentRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 业务号：可以标识用户的编码，例如手机号，身份证号等，通过业务号类型来控制，与biz_no_type和encrypt_type共同确定编码形式。
  bizNo: string;
  // 业务号类型：1-手机号，2-支付宝用户id
  bizNoType: string;
  // 加密方式：0-不加密，1-SHA1，2-MD5
  encryptType: string;
  // json结构，可以传递自定义参数
  properties?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizNo: 'biz_no',
      bizNoType: 'biz_no_type',
      encryptType: 'encrypt_type',
      properties: 'properties',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizNo: 'string',
      bizNoType: 'string',
      encryptType: 'string',
      properties: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class JudgeCrowdPrefermentResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否优待群体：YES-是，NO-否
  isPreferment?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      isPreferment: 'is_preferment',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      isPreferment: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SubmitScenedataTaskRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 约定的场景枚举
  scene: string;
  // 枚举
  // PHONE_SHA1
  // PHONE_MD5
  bizNoType: string;
  // 适配客户的来源
  // 可能是客户的任务/AK
  sourceMark?: string;
  // 业务号预期条件
  expectCondition?: BizNoCondition[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      scene: 'scene',
      bizNoType: 'biz_no_type',
      sourceMark: 'source_mark',
      expectCondition: 'expect_condition',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      scene: 'string',
      bizNoType: 'string',
      sourceMark: 'string',
      expectCondition: { 'type': 'array', 'itemType': BizNoCondition },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SubmitScenedataTaskResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 创建任务成功后，返回批次号
  batchNo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      batchNo: 'batch_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      batchNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadScenedataFileRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 批次号
  batchNo: string;
  // 文件参数
  fileObject?: Readable;
  fileObjectName?: string;
  fileId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      batchNo: 'batch_no',
      fileObject: 'fileObject',
      fileObjectName: 'fileObjectName',
      fileId: 'file_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      batchNo: 'string',
      fileObject: 'Readable',
      fileObjectName: 'string',
      fileId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadScenedataFileResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // batchNo对应的任务状态，上传后，返回RECEIVED
  status?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchqueryScenedataTaskresultRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 批次号
  batchNo: string;
  // 游标，上一次的最后一条
  cursor?: string;
  // 本次同步数量
  syncNum?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      batchNo: 'batch_no',
      cursor: 'cursor',
      syncNum: 'sync_num',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      batchNo: 'string',
      cursor: 'string',
      syncNum: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchqueryScenedataTaskresultResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 0-未开始
  // 1-可继续
  // 2-结束
  syncStatus?: string;
  // 本次的最后一个游标，保存起来下一次使用
  lastCursor?: string;
  // 结果列表
  resultList?: BatchResult[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      syncStatus: 'sync_status',
      lastCursor: 'last_cursor',
      resultList: 'result_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      syncStatus: 'string',
      lastCursor: 'string',
      resultList: { 'type': 'array', 'itemType': BatchResult },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryScenedataOnlineRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 业务号，根据biz_no_type修改类型
  bizNo: string;
  // 业务号类型
  bizNoType: string;
  // 场景，根据此参数路由适配到不同数据源
  scene: string;
  // 来源标识
  sourceMark?: string;
  // 条件，目前只支持IN的逻辑
  condition?: BizNoCondition;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizNo: 'biz_no',
      bizNoType: 'biz_no_type',
      scene: 'scene',
      sourceMark: 'source_mark',
      condition: 'condition',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizNo: 'string',
      bizNoType: 'string',
      scene: 'string',
      sourceMark: 'string',
      condition: BizNoCondition,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryScenedataOnlineResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 结果字段，可以是Y/程度值/自定义加密串
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

export class QueryScenedataTaskinfoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 批次号
  batchNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      batchNo: 'batch_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      batchNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryScenedataTaskinfoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // -1-无效，0-待处理，1-处理中，2-处理完成
  taskStatus?: string;
  // 业务日期
  bizDate?: string;
  // 场景
  scene?: string;
  // 任务类型
  taskType?: string;
  // 批次所属租户id
  tenantId?: string;
  // 来源标识
  sourceMark?: string;
  // 任务创建时间
  createTime?: string;
  // 批次统计结果信息
  result?: TaskDetailResult;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      taskStatus: 'task_status',
      bizDate: 'biz_date',
      scene: 'scene',
      taskType: 'task_type',
      tenantId: 'tenant_id',
      sourceMark: 'source_mark',
      createTime: 'create_time',
      result: 'result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      taskStatus: 'string',
      bizDate: 'string',
      scene: 'string',
      taskType: 'string',
      tenantId: 'string',
      sourceMark: 'string',
      createTime: 'string',
      result: TaskDetailResult,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateAntcloudGatewayxFileUploadRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 上传文件作用的openapi method
  apiCode: string;
  // 文件标签，多个标签;分割
  fileLabel?: string;
  // 自定义的文件元数据
  fileMetadata?: string;
  // 文件名，不传则随机生成文件名
  fileName?: string;
  // 文件的多媒体类型
  mimeType?: string;
  // 产品方的api归属集群，即productInstanceId
  apiCluster?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      apiCode: 'api_code',
      fileLabel: 'file_label',
      fileMetadata: 'file_metadata',
      fileName: 'file_name',
      mimeType: 'mime_type',
      apiCluster: 'api_cluster',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      apiCode: 'string',
      fileLabel: 'string',
      fileMetadata: 'string',
      fileName: 'string',
      mimeType: 'string',
      apiCluster: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateAntcloudGatewayxFileUploadResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 上传有效期
  expiredTime?: string;
  // 32位文件唯一id
  fileId?: string;
  // 放入http请求头里
  uploadHeaders?: XNameValuePair[];
  // 文件上传地址
  uploadUrl?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      expiredTime: 'expired_time',
      fileId: 'file_id',
      uploadHeaders: 'upload_headers',
      uploadUrl: 'upload_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      expiredTime: 'string',
      fileId: 'string',
      uploadHeaders: { 'type': 'array', 'itemType': XNameValuePair },
      uploadUrl: 'string',
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
          sdk_version: "1.4.1",
          _prod_code: "SDS",
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
   * Description: 根据人维度的业务号和城市，决定是否优待人群，业务号可以是不同类型的，可以是手机号，也可以是证件号，如果业务号是敏感数据，可以选择算法类型加密传输。
   * Summary: 优待人群判断
   */
  async judgeCrowdPreferment(request: JudgeCrowdPrefermentRequest): Promise<JudgeCrowdPrefermentResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.judgeCrowdPrefermentEx(request, headers, runtime);
  }

  /**
   * Description: 根据人维度的业务号和城市，决定是否优待人群，业务号可以是不同类型的，可以是手机号，也可以是证件号，如果业务号是敏感数据，可以选择算法类型加密传输。
   * Summary: 优待人群判断
   */
  async judgeCrowdPrefermentEx(request: JudgeCrowdPrefermentRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<JudgeCrowdPrefermentResponse> {
    Util.validateModel(request);
    return $tea.cast<JudgeCrowdPrefermentResponse>(await this.doRequest("1.0", "antchain.sds.crowd.preferment.judge", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new JudgeCrowdPrefermentResponse({}));
  }

  /**
   * Description: 客户上传文件以及参数，创建任务，获取批次号异步查询处理结果。
   * Summary: 场景数据批处理任务提交
   */
  async submitScenedataTask(request: SubmitScenedataTaskRequest): Promise<SubmitScenedataTaskResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.submitScenedataTaskEx(request, headers, runtime);
  }

  /**
   * Description: 客户上传文件以及参数，创建任务，获取批次号异步查询处理结果。
   * Summary: 场景数据批处理任务提交
   */
  async submitScenedataTaskEx(request: SubmitScenedataTaskRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SubmitScenedataTaskResponse> {
    Util.validateModel(request);
    return $tea.cast<SubmitScenedataTaskResponse>(await this.doRequest("1.0", "antchain.sds.scenedata.task.submit", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SubmitScenedataTaskResponse({}));
  }

  /**
   * Description: 批次数据文件上传
   * Summary: 批次数据文件上传
   */
  async uploadScenedataFile(request: UploadScenedataFileRequest): Promise<UploadScenedataFileResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.uploadScenedataFileEx(request, headers, runtime);
  }

  /**
   * Description: 批次数据文件上传
   * Summary: 批次数据文件上传
   */
  async uploadScenedataFileEx(request: UploadScenedataFileRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UploadScenedataFileResponse> {
    if (!Util.isUnset(request.fileObject)) {
      let uploadReq = new CreateAntcloudGatewayxFileUploadRequest({
        authToken: request.authToken,
        apiCode: "antchain.sds.scenedata.file.upload",
        fileName: request.fileObjectName,
      });
      let uploadResp = await this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
      if (!AntchainUtil.isSuccess(uploadResp.resultCode, "ok")) {
        let uploadScenedataFileResponse = new UploadScenedataFileResponse({
          reqMsgId: uploadResp.reqMsgId,
          resultCode: uploadResp.resultCode,
          resultMsg: uploadResp.resultMsg,
        });
        return uploadScenedataFileResponse;
      }

      let uploadHeaders = AntchainUtil.parseUploadHeaders(uploadResp.uploadHeaders);
      await AntchainUtil.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
      request.fileId = uploadResp.fileId;
      request.fileObject = null;
    }

    Util.validateModel(request);
    return $tea.cast<UploadScenedataFileResponse>(await this.doRequest("1.0", "antchain.sds.scenedata.file.upload", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UploadScenedataFileResponse({}));
  }

  /**
   * Description: 场景数据SaaS第一天预处理客户提交的文件处理任务，第二天客户调该接口批量查询任务结果
   * Summary: 场景数据任务结果批量查询
   */
  async batchqueryScenedataTaskresult(request: BatchqueryScenedataTaskresultRequest): Promise<BatchqueryScenedataTaskresultResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchqueryScenedataTaskresultEx(request, headers, runtime);
  }

  /**
   * Description: 场景数据SaaS第一天预处理客户提交的文件处理任务，第二天客户调该接口批量查询任务结果
   * Summary: 场景数据任务结果批量查询
   */
  async batchqueryScenedataTaskresultEx(request: BatchqueryScenedataTaskresultRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchqueryScenedataTaskresultResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchqueryScenedataTaskresultResponse>(await this.doRequest("1.0", "antchain.sds.scenedata.taskresult.batchquery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchqueryScenedataTaskresultResponse({}));
  }

  /**
   * Description: 场景数据在线查询，仅支持单条匹配
   * Summary: 场景数据在线查询
   */
  async queryScenedataOnline(request: QueryScenedataOnlineRequest): Promise<QueryScenedataOnlineResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryScenedataOnlineEx(request, headers, runtime);
  }

  /**
   * Description: 场景数据在线查询，仅支持单条匹配
   * Summary: 场景数据在线查询
   */
  async queryScenedataOnlineEx(request: QueryScenedataOnlineRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryScenedataOnlineResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryScenedataOnlineResponse>(await this.doRequest("1.0", "antchain.sds.scenedata.online.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryScenedataOnlineResponse({}));
  }

  /**
   * Description: 通过批次号查询任务详细信息
   * Summary: 批次任务信息查询
   */
  async queryScenedataTaskinfo(request: QueryScenedataTaskinfoRequest): Promise<QueryScenedataTaskinfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryScenedataTaskinfoEx(request, headers, runtime);
  }

  /**
   * Description: 通过批次号查询任务详细信息
   * Summary: 批次任务信息查询
   */
  async queryScenedataTaskinfoEx(request: QueryScenedataTaskinfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryScenedataTaskinfoResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryScenedataTaskinfoResponse>(await this.doRequest("1.0", "antchain.sds.scenedata.taskinfo.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryScenedataTaskinfoResponse({}));
  }

  /**
   * Description: 创建HTTP PUT提交的文件上传
   * Summary: 文件上传创建
   */
  async createAntcloudGatewayxFileUpload(request: CreateAntcloudGatewayxFileUploadRequest): Promise<CreateAntcloudGatewayxFileUploadResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createAntcloudGatewayxFileUploadEx(request, headers, runtime);
  }

  /**
   * Description: 创建HTTP PUT提交的文件上传
   * Summary: 文件上传创建
   */
  async createAntcloudGatewayxFileUploadEx(request: CreateAntcloudGatewayxFileUploadRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateAntcloudGatewayxFileUploadResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateAntcloudGatewayxFileUploadResponse>(await this.doRequest("1.0", "antcloud.gatewayx.file.upload.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateAntcloudGatewayxFileUploadResponse({}));
  }

}
