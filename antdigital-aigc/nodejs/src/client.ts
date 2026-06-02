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

// 子任务列表
export class SubTasks extends $tea.Model {
  // 子任务ID
  subTaskId: number;
  // 子任务名称
  subTaskName: string;
  // 目标翻译语言
  targetLanguage: string;
  // 子任务状态包括：PENDING（待执行）、EXECUTING（执行中）、FAILED（失败）、COMPLETED（已完成）
  status: string;
  // 源语言
  sourceLanguage: string;
  // 翻译后视频地址
  outputVideoUrl?: string;
  // 翻译前字幕文件地址
  originalSubtitleUrl?: string;
  // 翻译后字幕文件地址
  translatedSubtitleUrl?: string;
  // 视频时长（秒）
  durationSeconds?: number;
  // 错误信息
  errorMessage?: string;
  static names(): { [key: string]: string } {
    return {
      subTaskId: 'sub_task_id',
      subTaskName: 'sub_task_name',
      targetLanguage: 'target_language',
      status: 'status',
      sourceLanguage: 'source_language',
      outputVideoUrl: 'output_video_url',
      originalSubtitleUrl: 'original_subtitle_url',
      translatedSubtitleUrl: 'translated_subtitle_url',
      durationSeconds: 'duration_seconds',
      errorMessage: 'error_message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      subTaskId: 'number',
      subTaskName: 'string',
      targetLanguage: 'string',
      status: 'string',
      sourceLanguage: 'string',
      outputVideoUrl: 'string',
      originalSubtitleUrl: 'string',
      translatedSubtitleUrl: 'string',
      durationSeconds: 'number',
      errorMessage: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushVideoCreatetaskRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 模型标识，如 ：doubao-seedance-2-0-260128
  model: string;
  // 文本提示词
  prompt: string;
  // 图生视频参考图片 URL
  imageUrl?: string[];
  // 视频参考/续写时传入视频 URL
  videoUrl?: string[];
  // 参考音频URL列表
  audioUrl?: string[];
  // 比例
  ratio?: string;
  // 视频时长（秒）
  duration?: string;
  // 请求追踪 ID，用于幂等去重
  requestId?: string;
  // 扩展JSON
  ext?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      model: 'model',
      prompt: 'prompt',
      imageUrl: 'image_url',
      videoUrl: 'video_url',
      audioUrl: 'audio_url',
      ratio: 'ratio',
      duration: 'duration',
      requestId: 'request_id',
      ext: 'ext',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      model: 'string',
      prompt: 'string',
      imageUrl: { 'type': 'array', 'itemType': 'string' },
      videoUrl: { 'type': 'array', 'itemType': 'string' },
      audioUrl: { 'type': 'array', 'itemType': 'string' },
      ratio: 'string',
      duration: 'string',
      requestId: 'string',
      ext: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushVideoCreatetaskResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 任务 ID，后续查询结果通过此参数获取
  taskId?: string;
  // 任务状态：pending（等待中）、processing（处理中）、succeeded（已成功）、failed（已失败）
  status?: string;
  // 模型名称
  model?: string;
  // 扩展JSON
  ext?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      taskId: 'task_id',
      status: 'status',
      model: 'model',
      ext: 'ext',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      taskId: 'string',
      status: 'string',
      model: 'string',
      ext: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryVideoQuerytaskRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 查询的任务ID
  taskId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      taskId: 'task_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      taskId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryVideoQuerytaskResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 任务ID
  taskId?: string;
  // 任务状态
  status?: string;
  // 模型名称
  model?: string;
  // 视频输出URL
  videoUrl?: string;
  // 错误码
  errorCode?: string;
  // 错误信息
  errorMessage?: string;
  // 扩展信息
  ext?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      taskId: 'task_id',
      status: 'status',
      model: 'model',
      videoUrl: 'video_url',
      errorCode: 'error_code',
      errorMessage: 'error_message',
      ext: 'ext',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      taskId: 'string',
      status: 'string',
      model: 'string',
      videoUrl: 'string',
      errorCode: 'string',
      errorMessage: 'string',
      ext: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushVideotranslateCreatetaskRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 视频URL
  videoUrl: string;
  // 视频名称
  videoName: string;
  // 翻译类型：VOICE(语音级翻译)、SUBTITLE(字幕级翻译)、FACE(面容级翻译)，二次翻译仅支持VOICE
  translateType: string;
  // 字幕级翻译支持的源语言：zh(中文), en(英文)
  //   
  // 语音级翻译支持的源语言：zh(中文), en(英语), ja(日语), ko(韩语), yue(粤语), de(德语), fr(法语), es(西班牙语), ar(阿拉伯语), it(意大利语), pt(葡萄牙语), ru(俄语), hi(印地语), id(印度尼西亚语), ms(马来语), 
  // nl(荷兰语), pl(波兰语), no(挪威语), da(丹麦语),hu(匈牙利语), cs(捷克语), ro(罗马尼亚语), bg(保加利亚语), sk(斯洛伐克语), sl(斯洛文尼亚语), lt(立陶宛语), lv(拉脱维亚语), et(爱沙尼亚语),
  // is(冰岛语), sq(阿尔巴尼亚语), az(阿塞拜疆语), be(白俄罗斯语), bs(波斯尼亚语), bn(孟加拉语),cy(威尔士语), fa(波斯语), hbs(克罗地亚语), mn(蒙古语), mr(马拉地语), mt(马耳他语), mi(毛利语),ne(尼泊尔语)
  // 
  // 面容级翻译支持的源语言：与 VOICE 源语言完全一致（42种）
  sourceLanguage: string;
  // 字幕级翻译支持的目标语言：zh(中文), zh-tw(中文-繁体), en(英语), ja(日语), ko(韩语), id(印度尼西亚语), es(西班牙语), pt(葡萄牙语), ar(阿拉伯语), fr(法语), tr(土耳其语), de(德语), ru(俄语), th(泰语), vi(越南语), ms(马来语), yue(粤语), sichuan(四川话),dongbei(东北话), henan(河南话), shanghai(上海话), tianjin(天津话), beijing(北京话), chongqing(重庆话), hunan(湖南话),taiwan(台湾话), shanxi(山西话), shaanxi(陕西话)
  // 
  // 语音级翻译支持的目标语言：zh(中文), zh-tw(中文-繁体), en(英语), ja(日语), ko(韩语), yue(粤语), de(德语), fr(法语), es(西班牙语), ar(阿拉伯语), tr(土耳其语), ru(俄语), pt(葡萄牙语), vi(越南语), ms(马来语), th(泰语), id(印度尼西亚语), sichuan(四川话),
  //   tianjin(天津话)
  // 
  // 面容级翻译支持的目标语言：en(英语)
  targetLanguages: string;
  // 字幕文件格式如下：
  // 1
  // 00:00:07,000 --> 00:00:08,300
  // 流产手术需要监护人
  // An abortion requires a guardian
  // 
  // 2
  // 00:00:08,300 --> 00:00:09,100
  // 签字才能做
  // to sign before it_s done
  // 
  // 3
  // 00:00:11,700 --> 00:00:12,800
  // 你看看咱们家
  // Look at our family
  // 
  // 4
  // 00:00:12,900 --> 00:00:13,700
  // 那么困难
  // we_re barely getting by
  // 
  // 5
  // 00:00:13,700 --> 00:00:14,700
  // 你爸又生病
  // Your father is sick again
  // 
  // 6
  // 00:00:14,700 --> 00:00:16,100
  // 我一把屎一把尿
  // I raised you from infancy
  // 
  // 7
  // 00:00:16,100 --> 00:00:16,700
  // 把你养大
  // got you this far
  // 
  // 8
  // 00:00:16,900 --> 00:00:17,800
  // 让你上学
  // and put you through school
  subtitleUrl?: string;
  // 子任务ID，二次翻译时必填
  subTaskId?: number;
  // 是否擦除字幕
  eraseSubtitle: boolean;
  // 是否嵌入字幕
  embedSubtitle: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      videoUrl: 'video_url',
      videoName: 'video_name',
      translateType: 'translate_type',
      sourceLanguage: 'source_language',
      targetLanguages: 'target_languages',
      subtitleUrl: 'subtitle_url',
      subTaskId: 'sub_task_id',
      eraseSubtitle: 'erase_subtitle',
      embedSubtitle: 'embed_subtitle',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      videoUrl: 'string',
      videoName: 'string',
      translateType: 'string',
      sourceLanguage: 'string',
      targetLanguages: 'string',
      subtitleUrl: 'string',
      subTaskId: 'number',
      eraseSubtitle: 'boolean',
      embedSubtitle: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushVideotranslateCreatetaskResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 任务ID
  taskId?: number;
  // 任务名称
  taskName?: string;
  // 子任务数量
  subTaskCount?: number;
  // 任务状态：PENDING-待执行、EXECUTING-执行中、COMPLETED-已完成
  status?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      taskId: 'task_id',
      taskName: 'task_name',
      subTaskCount: 'sub_task_count',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      taskId: 'number',
      taskName: 'string',
      subTaskCount: 'number',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryVideotranslateQuerytaskRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 任务ID
  taskId: number;
  // 子任务ID，不传则查询所有子任务
  subTaskId?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      taskId: 'task_id',
      subTaskId: 'sub_task_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      taskId: 'number',
      subTaskId: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryVideotranslateQuerytaskResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 任务ID
  taskId?: number;
  // 任务名称
  taskName?: string;
  // 任务状态包括：PENDING（待执行）、EXECUTING（执行中）、COMPLETED（已完成）
  status?: string;
  // 子任务列表
  subTasks?: SubTasks[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      taskId: 'task_id',
      taskName: 'task_name',
      status: 'status',
      subTasks: 'sub_tasks',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      taskId: 'number',
      taskName: 'string',
      status: 'string',
      subTasks: { 'type': 'array', 'itemType': SubTasks },
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
          sdk_version: "1.1.2",
          _prod_code: "AIGC",
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
   * Description: 创建aigc视频生成任务
   * Summary: 创建aigc视频生成任务
   */
  async pushVideoCreatetask(request: PushVideoCreatetaskRequest): Promise<PushVideoCreatetaskResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pushVideoCreatetaskEx(request, headers, runtime);
  }

  /**
   * Description: 创建aigc视频生成任务
   * Summary: 创建aigc视频生成任务
   */
  async pushVideoCreatetaskEx(request: PushVideoCreatetaskRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PushVideoCreatetaskResponse> {
    Util.validateModel(request);
    return $tea.cast<PushVideoCreatetaskResponse>(await this.doRequest("1.0", "antdigital.aigc.video.createtask.push", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PushVideoCreatetaskResponse({}));
  }

  /**
   * Description: AIGC视频任务查询
   * Summary: AIGC视频任务查询
   */
  async queryVideoQuerytask(request: QueryVideoQuerytaskRequest): Promise<QueryVideoQuerytaskResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryVideoQuerytaskEx(request, headers, runtime);
  }

  /**
   * Description: AIGC视频任务查询
   * Summary: AIGC视频任务查询
   */
  async queryVideoQuerytaskEx(request: QueryVideoQuerytaskRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryVideoQuerytaskResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryVideoQuerytaskResponse>(await this.doRequest("1.0", "antdigital.aigc.video.querytask.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryVideoQuerytaskResponse({}));
  }

  /**
   * Description: 提交视频翻译任务
   * Summary: 提交视频翻译任务
   */
  async pushVideotranslateCreatetask(request: PushVideotranslateCreatetaskRequest): Promise<PushVideotranslateCreatetaskResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pushVideotranslateCreatetaskEx(request, headers, runtime);
  }

  /**
   * Description: 提交视频翻译任务
   * Summary: 提交视频翻译任务
   */
  async pushVideotranslateCreatetaskEx(request: PushVideotranslateCreatetaskRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PushVideotranslateCreatetaskResponse> {
    Util.validateModel(request);
    return $tea.cast<PushVideotranslateCreatetaskResponse>(await this.doRequest("1.0", "antdigital.aigc.videotranslate.createtask.push", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PushVideotranslateCreatetaskResponse({}));
  }

  /**
   * Description: 查询视频翻译任务
   * Summary: 查询视频翻译任务
   */
  async queryVideotranslateQuerytask(request: QueryVideotranslateQuerytaskRequest): Promise<QueryVideotranslateQuerytaskResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryVideotranslateQuerytaskEx(request, headers, runtime);
  }

  /**
   * Description: 查询视频翻译任务
   * Summary: 查询视频翻译任务
   */
  async queryVideotranslateQuerytaskEx(request: QueryVideotranslateQuerytaskRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryVideotranslateQuerytaskResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryVideotranslateQuerytaskResponse>(await this.doRequest("1.0", "antdigital.aigc.videotranslate.querytask.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryVideotranslateQuerytaskResponse({}));
  }

}
