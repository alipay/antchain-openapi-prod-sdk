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

// 消息发送状态
export class SmsSendStatus extends $tea.Model {
  // 手机号
  phoneNo: string;
  // 发送状态
  status: string;
  // 发送状态描述
  detailMsg: string;
  static names(): { [key: string]: string } {
    return {
      phoneNo: 'phone_no',
      status: 'status',
      detailMsg: 'detail_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      phoneNo: 'string',
      status: 'string',
      detailMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 彩信模版创建返回体
export class SmsTempCreateData extends $tea.Model {
  // 模版id
  templateId: string;
  static names(): { [key: string]: string } {
    return {
      templateId: 'template_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      templateId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 批量发送任务结果
export class BatchSendTaskData extends $tea.Model {
  // 批量发送任务id
  batchTaskId: string;
  static names(): { [key: string]: string } {
    return {
      batchTaskId: 'batch_task_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      batchTaskId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 发送内容
export class ContentSend extends $tea.Model {
  // 单条手机号
  mobile: string;
  // 最多支持 10 个变量
  // 文字变量在使用时有长度限制： 
  // “纯中文变量 不超过 10 个字”
  // “数字 字母 英文符号 不超过 20 位” 
  // “纯数字 不超过 20 位”
  // 有序的变量列表，按顺序替换报备的模板彩信文本帧中的变量，列表长度和变量个数不一致会导致替换变量错误
  templateParamList: string[];
  static names(): { [key: string]: string } {
    return {
      mobile: 'mobile',
      templateParamList: 'template_param_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      mobile: 'string',
      templateParamList: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 彩信素材
export class SmsMaterial extends $tea.Model {
  // 素材名称
  materialName?: string;
  // 素材类型
  materialType: string;
  // 素材内容
  materialContent: string;
  static names(): { [key: string]: string } {
    return {
      materialName: 'material_name',
      materialType: 'material_type',
      materialContent: 'material_content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      materialName: 'string',
      materialType: 'string',
      materialContent: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 查询模版状态响应
export class QueryTemplateStatusResponse extends $tea.Model {
  // 彩信模版id
  templateId: string;
  // 模版名称
  templateName: string;
  // 模板状态
  templateStatus: string;
  // 审核信息
  censorResult: string;
  static names(): { [key: string]: string } {
    return {
      templateId: 'template_id',
      templateName: 'template_name',
      templateStatus: 'template_status',
      censorResult: 'censor_result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      templateId: 'string',
      templateName: 'string',
      templateStatus: 'string',
      censorResult: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 上行内容
export class ContentReply extends $tea.Model {
  // 手机号
  phone: string;
  // 用户是否已经退订过
  reject: boolean;
  // 用户最新回复内容
  content: string;
  // 用户回复时间
  replyTime: string;
  // 拓展字段
  extInfo?: string;
  static names(): { [key: string]: string } {
    return {
      phone: 'phone',
      reject: 'reject',
      content: 'content',
      replyTime: 'reply_time',
      extInfo: 'ext_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      phone: 'string',
      reject: 'boolean',
      content: 'string',
      replyTime: 'string',
      extInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntdigitalMediasmsReplyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户id
  tenantId: string;
  // 手机号列表
  phoneNoList: string[];
  // 拓展字段
  extInfo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      phoneNoList: 'phone_no_list',
      extInfo: 'ext_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      phoneNoList: { 'type': 'array', 'itemType': 'string' },
      extInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntdigitalMediasmsReplyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 用户回复结果
  data?: ContentReply[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: { 'type': 'array', 'itemType': ContentReply },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateAntdigitalMediasmsTemplateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户id
  tenantId: string;
  // 请求唯一id
  requestUniqueId: string;
  // 是否变量模版
  variableTemplate: boolean;
  // 彩信标题，不超过50个长度，收件人可感知
  smsTitle: string;
  // 签名名称
  signName: string;
  // 扩展字段
  extInfo?: string;
  // 素材内容
  material: SmsMaterial[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      requestUniqueId: 'request_unique_id',
      variableTemplate: 'variable_template',
      smsTitle: 'sms_title',
      signName: 'sign_name',
      extInfo: 'ext_info',
      material: 'material',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      requestUniqueId: 'string',
      variableTemplate: 'boolean',
      smsTitle: 'string',
      signName: 'string',
      extInfo: 'string',
      material: { 'type': 'array', 'itemType': SmsMaterial },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateAntdigitalMediasmsTemplateResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 模版创建响应体
  data?: SmsTempCreateData;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: SmsTempCreateData,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntdigitalMediasmsTemplateStatusRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户id
  tenantId: string;
  // 彩信模版id
  templateId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      templateId: 'template_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      templateId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntdigitalMediasmsTemplateStatusResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 彩信模版状态查询结果
  data?: QueryTemplateStatusResponse;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: QueryTemplateStatusResponse,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateAntdigitalMediasmsBatchSendRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 群发任务id，不超过70个长度，用于幂等
  massTaskId: string;
  // 模板id
  templateId: string;
  // 变量值需要按模板定义时的变量顺序传递且个数需要对等
  contentList: ContentSend[];
  // 是否立即发送
  sendNow: boolean;
  // 立即发送时，该字段不消费
  sendTime: string;
  // 租户id
  tenantId: string;
  // 拓展字段
  extInfo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      massTaskId: 'mass_task_id',
      templateId: 'template_id',
      contentList: 'content_list',
      sendNow: 'send_now',
      sendTime: 'send_time',
      tenantId: 'tenant_id',
      extInfo: 'ext_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      massTaskId: 'string',
      templateId: 'string',
      contentList: { 'type': 'array', 'itemType': ContentSend },
      sendNow: 'boolean',
      sendTime: 'string',
      tenantId: 'string',
      extInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateAntdigitalMediasmsBatchSendResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 批量任务id
  data?: BatchSendTaskData;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: BatchSendTaskData,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntdigitalMediasmsMsgStatusRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 群发任务id
  batchTaskId: string;
  // 手机号列表
  phoneNoList: string[];
  // 租户id
  tenantId: string;
  // 拓展信息
  extInfo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      batchTaskId: 'batch_task_id',
      phoneNoList: 'phone_no_list',
      tenantId: 'tenant_id',
      extInfo: 'ext_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      batchTaskId: 'string',
      phoneNoList: { 'type': 'array', 'itemType': 'string' },
      tenantId: 'string',
      extInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntdigitalMediasmsMsgStatusResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 信息发送状态
  data?: SmsSendStatus;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: SmsSendStatus,
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
          sdk_version: "1.0.0",
          _prod_code: "ak_d7c024d004594db188cee2346b384a48",
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
   * Description: 上行内容查询
   * Summary: 上行内容查询
   */
  async queryAntdigitalMediasmsReply(request: QueryAntdigitalMediasmsReplyRequest): Promise<QueryAntdigitalMediasmsReplyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAntdigitalMediasmsReplyEx(request, headers, runtime);
  }

  /**
   * Description: 上行内容查询
   * Summary: 上行内容查询
   */
  async queryAntdigitalMediasmsReplyEx(request: QueryAntdigitalMediasmsReplyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAntdigitalMediasmsReplyResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAntdigitalMediasmsReplyResponse>(await this.doRequest("1.0", "antdigital.mediasms.reply.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAntdigitalMediasmsReplyResponse({}));
  }

  /**
   * Description: 彩信模版创建
   * Summary: 彩信模版创建
   */
  async createAntdigitalMediasmsTemplate(request: CreateAntdigitalMediasmsTemplateRequest): Promise<CreateAntdigitalMediasmsTemplateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createAntdigitalMediasmsTemplateEx(request, headers, runtime);
  }

  /**
   * Description: 彩信模版创建
   * Summary: 彩信模版创建
   */
  async createAntdigitalMediasmsTemplateEx(request: CreateAntdigitalMediasmsTemplateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateAntdigitalMediasmsTemplateResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateAntdigitalMediasmsTemplateResponse>(await this.doRequest("1.0", "antdigital.mediasms.template.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateAntdigitalMediasmsTemplateResponse({}));
  }

  /**
   * Description: 彩信模版状态查询
   * Summary: 彩信模版状态查询
   */
  async queryAntdigitalMediasmsTemplateStatus(request: QueryAntdigitalMediasmsTemplateStatusRequest): Promise<QueryAntdigitalMediasmsTemplateStatusResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAntdigitalMediasmsTemplateStatusEx(request, headers, runtime);
  }

  /**
   * Description: 彩信模版状态查询
   * Summary: 彩信模版状态查询
   */
  async queryAntdigitalMediasmsTemplateStatusEx(request: QueryAntdigitalMediasmsTemplateStatusRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAntdigitalMediasmsTemplateStatusResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAntdigitalMediasmsTemplateStatusResponse>(await this.doRequest("1.0", "antdigital.mediasms.template.status.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAntdigitalMediasmsTemplateStatusResponse({}));
  }

  /**
   * Description: 信息批量发送任务创建
   * Summary: 信息批量发送任务创建
   */
  async createAntdigitalMediasmsBatchSend(request: CreateAntdigitalMediasmsBatchSendRequest): Promise<CreateAntdigitalMediasmsBatchSendResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createAntdigitalMediasmsBatchSendEx(request, headers, runtime);
  }

  /**
   * Description: 信息批量发送任务创建
   * Summary: 信息批量发送任务创建
   */
  async createAntdigitalMediasmsBatchSendEx(request: CreateAntdigitalMediasmsBatchSendRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateAntdigitalMediasmsBatchSendResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateAntdigitalMediasmsBatchSendResponse>(await this.doRequest("1.0", "antdigital.mediasms.batch.send.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateAntdigitalMediasmsBatchSendResponse({}));
  }

  /**
   * Description: 短信发送状态查询
   * Summary: 短信发送状态查询
   */
  async queryAntdigitalMediasmsMsgStatus(request: QueryAntdigitalMediasmsMsgStatusRequest): Promise<QueryAntdigitalMediasmsMsgStatusResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAntdigitalMediasmsMsgStatusEx(request, headers, runtime);
  }

  /**
   * Description: 短信发送状态查询
   * Summary: 短信发送状态查询
   */
  async queryAntdigitalMediasmsMsgStatusEx(request: QueryAntdigitalMediasmsMsgStatusRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAntdigitalMediasmsMsgStatusResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAntdigitalMediasmsMsgStatusResponse>(await this.doRequest("1.0", "antdigital.mediasms.msg.status.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAntdigitalMediasmsMsgStatusResponse({}));
  }

}
