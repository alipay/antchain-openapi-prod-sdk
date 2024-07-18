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

// 字幕单句配置
export class Sentence extends $tea.Model {
  // 字幕单句文本
  text: string;
  // 字幕单句开始时间
  beginTime: number;
  // 字幕单句结束时间
  endTime: number;
  static names(): { [key: string]: string } {
    return {
      text: 'text',
      beginTime: 'begin_time',
      endTime: 'end_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      text: 'string',
      beginTime: 'number',
      endTime: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 数字人形象
export class AvatarProfile extends $tea.Model {
  // 190087
  avatarId: string;
  // 数字人形象名称
  name: string;
  // CUSTOM---定制；
  // PRESET---预置
  type: string;
  // 位置信息等配置信息
  conf?: string;
  // 数字人形象图片
  picUrl: string;
  // 背景图片地址
  bgUrl?: string;
  // 形象thumb图Url
  thumbUrl?: string;
  static names(): { [key: string]: string } {
    return {
      avatarId: 'avatar_id',
      name: 'name',
      type: 'type',
      conf: 'conf',
      picUrl: 'pic_url',
      bgUrl: 'bg_url',
      thumbUrl: 'thumb_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      avatarId: 'string',
      name: 'string',
      type: 'string',
      conf: 'string',
      picUrl: 'string',
      bgUrl: 'string',
      thumbUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 视频贴片信息
export class Paster extends $tea.Model {
  //  贴片元素离画面位置x坐标
  x: number;
  //  贴片元素离画面位置y坐标
  y: number;
  //  贴片元素 url,支持 gif png jpg等图片格式
  srcUrl: string;
  // 贴片元素缩放比例
  scale: string;
  static names(): { [key: string]: string } {
    return {
      x: 'x',
      y: 'y',
      srcUrl: 'src_url',
      scale: 'scale',
    };
  }

  static types(): { [key: string]: any } {
    return {
      x: 'number',
      y: 'number',
      srcUrl: 'string',
      scale: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 脚本语音配置
export class ScriptVoiceConfig extends $tea.Model {
  // 音色id，合成驱动选择text时必填
  voiceId?: string;
  // 话术脚本内容，合成驱动选择text时必填
  text?: string;
  // 0.5～2，语速，合成驱动选择text时必填
  speed?: string;
  // 音频URL，合成驱动选择audio时必填
  audioUrl?: string;
  static names(): { [key: string]: string } {
    return {
      voiceId: 'voice_id',
      text: 'text',
      speed: 'speed',
      audioUrl: 'audio_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      voiceId: 'string',
      text: 'string',
      speed: 'string',
      audioUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 数字人音色
export class AvatarVoice extends $tea.Model {
  // 音色名称
  name: string;
  // 音色代码
  code: string;
  // CLONE--克隆音色；
  // PRESET--预置；
  // CUSTOM--自定义，暂时不采用。
  type: string;
  // 音色形象url
  picUrl: string;
  // 试听音频片段
  demoUrl: string;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      code: 'code',
      type: 'type',
      picUrl: 'pic_url',
      demoUrl: 'demo_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      code: 'string',
      type: 'string',
      picUrl: 'string',
      demoUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 字幕信息
export class CaptionsInfo extends $tea.Model {
  // 字幕画面位置x坐标，距左侧
  x: number;
  // 字幕画面位置y坐标，距上侧
  y: number;
  // 字幕框宽度
  w: number;
  // 字幕框高度
  h: number;
  // 字幕id
  id?: string;
  // 字幕句子时间节点信息
  sentences: Sentence[];
  static names(): { [key: string]: string } {
    return {
      x: 'x',
      y: 'y',
      w: 'w',
      h: 'h',
      id: 'id',
      sentences: 'sentences',
    };
  }

  static types(): { [key: string]: any } {
    return {
      x: 'number',
      y: 'number',
      w: 'number',
      h: 'number',
      id: 'string',
      sentences: { 'type': 'array', 'itemType': Sentence },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 数字人形象集合
export class AvatarProfileResult extends $tea.Model {
  // 数字人形象数量
  total: number;
  // 查询页面索引，不分页无
  pageIndex?: number;
  // 数字人形象列表
  itemList: AvatarProfile[];
  static names(): { [key: string]: string } {
    return {
      total: 'total',
      pageIndex: 'page_index',
      itemList: 'item_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      total: 'number',
      pageIndex: 'number',
      itemList: { 'type': 'array', 'itemType': AvatarProfile },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 数字人形象设置
export class ProfileInfo extends $tea.Model {
  // 数字人离画面位置坐标,可以为负数或者出画
  //  数字人在视频生成中的位置
  x: number;
  // 数字人离画面位置坐标,可以为负数或者出画
  //  数字人在视频生成中的位置
  y: number;
  // 数字人视频大小,初始大小为训练素材整体大小非数字人在框选大小
  w: number;
  // 数字人视频大小,初始大小为训练素材整体大小非数字人在框选大小
  h: number;
  // 数字人视频大小缩放,实际大小为  scale*w   scale*h 
  scale?: string;
  static names(): { [key: string]: string } {
    return {
      x: 'x',
      y: 'y',
      w: 'w',
      h: 'h',
      scale: 'scale',
    };
  }

  static types(): { [key: string]: any } {
    return {
      x: 'number',
      y: 'number',
      w: 'number',
      h: 'number',
      scale: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 合成任务
export class VideoTask extends $tea.Model {
  // RUNNING, COMPLETE,FAIL
  state: string;
  // 完成状态，会返回视频地址
  videoUrl?: string;
  static names(): { [key: string]: string } {
    return {
      state: 'state',
      videoUrl: 'video_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      state: 'string',
      videoUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 背景设置
// 
export class Background extends $tea.Model {
  // 背景元素，支持 gif png jpg mp4等格式
  srcUrl: string;
  // 背景缩放比例
  scale: string;
  // 背景图片x坐标位置，距左侧
  x: number;
  // 背景图片y坐标位置，距上侧
  y: number;
  static names(): { [key: string]: string } {
    return {
      srcUrl: 'src_url',
      scale: 'scale',
      x: 'x',
      y: 'y',
    };
  }

  static types(): { [key: string]: any } {
    return {
      srcUrl: 'string',
      scale: 'string',
      x: 'number',
      y: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListUniversalsaasDigitalhumanVideoVoiceRequest extends $tea.Model {
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

export class ListUniversalsaasDigitalhumanVideoVoiceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 结果状态
  status?: boolean;
  // 音色列表
  data?: AvatarVoice[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      status: 'status',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      status: 'boolean',
      data: { 'type': 'array', 'itemType': AvatarVoice },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListUniversalsaasDigitalhumanVideoProfileRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 2D_PRESET---2d预置；
  // 3D_PRESET---3d预置；
  // 2D_CUSTOM--2d定制；
  // 3D_CUSTOM--3d定制；
  // 
  type: string;
  // 分页查询页面索引，传值为空不分页
  // 索引从0开始。
  pageIndex?: number;
  // 分页页面大小，默认10
  pageSize?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      type: 'type',
      pageIndex: 'page_index',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      type: 'string',
      pageIndex: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListUniversalsaasDigitalhumanVideoProfileResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 查询结果状态
  status?: boolean;
  // 数字人形象集合
  data?: AvatarProfileResult;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      status: 'status',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      status: 'boolean',
      data: AvatarProfileResult,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateUniversalsaasDigitalhumanVideoTaskRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 数字人id
  avatarId: string;
  // text/audio, 合成驱动--文本/音频
  driverType: string;
  // 形象设置
  profileInfo?: ProfileInfo;
  // 话术脚本语音配置
  scriptVoiceConfig: ScriptVoiceConfig;
  // 是否开启字幕
  openCaptions: boolean;
  // 字幕配置
  captionsInfo?: CaptionsInfo;
  // 是否替换字幕敏感词
  replaceSensitive?: boolean;
  // 背景信息
  background?: Background;
  // 贴片元素信息
  pasters?: Paster[];
  // 数字人视频生成格式，默认不填
  format?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      avatarId: 'avatar_id',
      driverType: 'driver_type',
      profileInfo: 'profile_info',
      scriptVoiceConfig: 'script_voice_config',
      openCaptions: 'open_captions',
      captionsInfo: 'captions_info',
      replaceSensitive: 'replace_sensitive',
      background: 'background',
      pasters: 'pasters',
      format: 'format',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      avatarId: 'string',
      driverType: 'string',
      profileInfo: ProfileInfo,
      scriptVoiceConfig: ScriptVoiceConfig,
      openCaptions: 'boolean',
      captionsInfo: CaptionsInfo,
      replaceSensitive: 'boolean',
      background: Background,
      pasters: { 'type': 'array', 'itemType': Paster },
      format: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateUniversalsaasDigitalhumanVideoTaskResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回结果状态
  status?: boolean;
  // taskId
  data?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      status: 'status',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      status: 'boolean',
      data: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryUniversalsaasDigitalhumanVideoTaskRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 视频合成任务ID
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

export class QueryUniversalsaasDigitalhumanVideoTaskResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 结果状态
  status?: boolean;
  // 合成结果
  data?: VideoTask;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      status: 'status',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      status: 'boolean',
      data: VideoTask,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateUniversalsaasDigitalhumanVoiceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 需要转语音的文字
  text: string;
  // 语速，[0.5,2.0]，默认1.0
  speed?: string;
  // 音调，[0.1,3.0]，默认1.0
  pitch?: string;
  // 音量，[0.1,3.0]，默认1.0
  volume?: string;
  // 音色id
  voice: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      text: 'text',
      speed: 'speed',
      pitch: 'pitch',
      volume: 'volume',
      voice: 'voice',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      text: 'string',
      speed: 'string',
      pitch: 'string',
      volume: 'string',
      voice: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateUniversalsaasDigitalhumanVoiceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 音频url
  data?: string;
  // 结果状态
  status?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: 'string',
      status: 'boolean',
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
          sdk_version: "1.1.0",
          _prod_code: "ak_245215eadadd4dc9bba177d6ba6d593d",
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
   * Description: 数字人音色列表
   * Summary: 数字人音色列表
   */
  async listUniversalsaasDigitalhumanVideoVoice(request: ListUniversalsaasDigitalhumanVideoVoiceRequest): Promise<ListUniversalsaasDigitalhumanVideoVoiceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listUniversalsaasDigitalhumanVideoVoiceEx(request, headers, runtime);
  }

  /**
   * Description: 数字人音色列表
   * Summary: 数字人音色列表
   */
  async listUniversalsaasDigitalhumanVideoVoiceEx(request: ListUniversalsaasDigitalhumanVideoVoiceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListUniversalsaasDigitalhumanVideoVoiceResponse> {
    Util.validateModel(request);
    return $tea.cast<ListUniversalsaasDigitalhumanVideoVoiceResponse>(await this.doRequest("1.0", "universalsaas.digitalhuman.video.voice.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListUniversalsaasDigitalhumanVideoVoiceResponse({}));
  }

  /**
   * Description: 数字人短视频形象列表
   * Summary: 数字人短视频形象列表
   */
  async listUniversalsaasDigitalhumanVideoProfile(request: ListUniversalsaasDigitalhumanVideoProfileRequest): Promise<ListUniversalsaasDigitalhumanVideoProfileResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listUniversalsaasDigitalhumanVideoProfileEx(request, headers, runtime);
  }

  /**
   * Description: 数字人短视频形象列表
   * Summary: 数字人短视频形象列表
   */
  async listUniversalsaasDigitalhumanVideoProfileEx(request: ListUniversalsaasDigitalhumanVideoProfileRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListUniversalsaasDigitalhumanVideoProfileResponse> {
    Util.validateModel(request);
    return $tea.cast<ListUniversalsaasDigitalhumanVideoProfileResponse>(await this.doRequest("1.0", "universalsaas.digitalhuman.video.profile.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListUniversalsaasDigitalhumanVideoProfileResponse({}));
  }

  /**
   * Description: 视频合成任务生成
   * Summary: 视频合成任务生成
   */
  async createUniversalsaasDigitalhumanVideoTask(request: CreateUniversalsaasDigitalhumanVideoTaskRequest): Promise<CreateUniversalsaasDigitalhumanVideoTaskResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createUniversalsaasDigitalhumanVideoTaskEx(request, headers, runtime);
  }

  /**
   * Description: 视频合成任务生成
   * Summary: 视频合成任务生成
   */
  async createUniversalsaasDigitalhumanVideoTaskEx(request: CreateUniversalsaasDigitalhumanVideoTaskRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateUniversalsaasDigitalhumanVideoTaskResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateUniversalsaasDigitalhumanVideoTaskResponse>(await this.doRequest("1.0", "universalsaas.digitalhuman.video.task.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateUniversalsaasDigitalhumanVideoTaskResponse({}));
  }

  /**
   * Description: 视频合成任务查询
   * Summary: 视频合成任务查询
   */
  async queryUniversalsaasDigitalhumanVideoTask(request: QueryUniversalsaasDigitalhumanVideoTaskRequest): Promise<QueryUniversalsaasDigitalhumanVideoTaskResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryUniversalsaasDigitalhumanVideoTaskEx(request, headers, runtime);
  }

  /**
   * Description: 视频合成任务查询
   * Summary: 视频合成任务查询
   */
  async queryUniversalsaasDigitalhumanVideoTaskEx(request: QueryUniversalsaasDigitalhumanVideoTaskRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryUniversalsaasDigitalhumanVideoTaskResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryUniversalsaasDigitalhumanVideoTaskResponse>(await this.doRequest("1.0", "universalsaas.digitalhuman.video.task.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryUniversalsaasDigitalhumanVideoTaskResponse({}));
  }

  /**
   * Description: 数字人tts接口
   * Summary: 数字人tts接口
   */
  async createUniversalsaasDigitalhumanVoice(request: CreateUniversalsaasDigitalhumanVoiceRequest): Promise<CreateUniversalsaasDigitalhumanVoiceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createUniversalsaasDigitalhumanVoiceEx(request, headers, runtime);
  }

  /**
   * Description: 数字人tts接口
   * Summary: 数字人tts接口
   */
  async createUniversalsaasDigitalhumanVoiceEx(request: CreateUniversalsaasDigitalhumanVoiceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateUniversalsaasDigitalhumanVoiceResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateUniversalsaasDigitalhumanVoiceResponse>(await this.doRequest("1.0", "universalsaas.digitalhuman.voice.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateUniversalsaasDigitalhumanVoiceResponse({}));
  }

}
