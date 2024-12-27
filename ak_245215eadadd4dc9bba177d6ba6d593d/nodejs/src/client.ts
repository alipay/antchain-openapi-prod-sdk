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

// 字幕样式
export class CaptionsStyle extends $tea.Model {
  // 字体类型
  fontType: string;
  // 字体大小，像素单位
  fontSize: number;
  // 字体颜色
  fontColor: string;
  // 描边颜色
  strokeColor?: string;
  // 描边宽度
  strokeWidth?: number;
  // 字体背景颜色
  backgroundColor?: string;
  static names(): { [key: string]: string } {
    return {
      fontType: 'font_type',
      fontSize: 'font_size',
      fontColor: 'font_color',
      strokeColor: 'stroke_color',
      strokeWidth: 'stroke_width',
      backgroundColor: 'background_color',
    };
  }

  static types(): { [key: string]: any } {
    return {
      fontType: 'string',
      fontSize: 'number',
      fontColor: 'string',
      strokeColor: 'string',
      strokeWidth: 'number',
      backgroundColor: 'string',
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
  // 是否自定义字幕样式，默认为false
  customCaptions?: boolean;
  // 字幕自定义样式
  captionsStyle: CaptionsStyle;
  static names(): { [key: string]: string } {
    return {
      x: 'x',
      y: 'y',
      w: 'w',
      h: 'h',
      id: 'id',
      sentences: 'sentences',
      customCaptions: 'custom_captions',
      captionsStyle: 'captions_style',
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
      customCaptions: 'boolean',
      captionsStyle: CaptionsStyle,
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
  // 音量，[0.1, 3]，默认为1，通常保留一位小数即可
  volume?: string;
  // 音调，[0.1, 3]，默认为1，通常保留一位小数即可
  pitch?: string;
  static names(): { [key: string]: string } {
    return {
      voiceId: 'voice_id',
      text: 'text',
      speed: 'speed',
      audioUrl: 'audio_url',
      volume: 'volume',
      pitch: 'pitch',
    };
  }

  static types(): { [key: string]: any } {
    return {
      voiceId: 'string',
      text: 'string',
      speed: 'string',
      audioUrl: 'string',
      volume: 'string',
      pitch: 'string',
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

// 数字人动作序列
export class AvatarAction extends $tea.Model {
  // 动作序列id
  actionId: number;
  // 动作时长，单位毫秒
  duration: number;
  // 动作预览链接
  videoPath: string;
  static names(): { [key: string]: string } {
    return {
      actionId: 'action_id',
      duration: 'duration',
      videoPath: 'video_path',
    };
  }

  static types(): { [key: string]: any } {
    return {
      actionId: 'number',
      duration: 'number',
      videoPath: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 数字人训练结果
export class TrainingResult extends $tea.Model {
  // 数字人id
  modelId?: string;
  // 音色id
  voiceId?: string;
  static names(): { [key: string]: string } {
    return {
      modelId: 'model_id',
      voiceId: 'voice_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      modelId: 'string',
      voiceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 数字人克隆任务结果
export class CloneTask extends $tea.Model {
  // 数字人id
  modelId?: string;
  // 音色id
  voiceId?: string;
  // 初始化/训练队列中/声音克隆中/声音克隆完成/形象克隆中/形象克隆完成
  avatarStatus?: string;
  //  数字人训练失败会返回原因
  failReason?: string;
  static names(): { [key: string]: string } {
    return {
      modelId: 'model_id',
      voiceId: 'voice_id',
      avatarStatus: 'avatar_status',
      failReason: 'fail_reason',
    };
  }

  static types(): { [key: string]: any } {
    return {
      modelId: 'string',
      voiceId: 'string',
      avatarStatus: 'string',
      failReason: 'string',
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
  // 视频时长
  videoDuration?: number;
  static names(): { [key: string]: string } {
    return {
      state: 'state',
      videoUrl: 'video_url',
      videoDuration: 'video_duration',
    };
  }

  static types(): { [key: string]: any } {
    return {
      state: 'string',
      videoUrl: 'string',
      videoDuration: 'number',
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

// 音频合成任务返回结果
export class VoiceTask extends $tea.Model {
  // RUNNING, COMPLETE,FAIL
  state: string;
  // 音频地址
  audioUrl: string;
  // 音频时长
  audioTime: number;
  // 字幕信息
  captionsInfo?: CaptionsInfo;
  static names(): { [key: string]: string } {
    return {
      state: 'state',
      audioUrl: 'audio_url',
      audioTime: 'audio_time',
      captionsInfo: 'captions_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      state: 'string',
      audioUrl: 'string',
      audioTime: 'number',
      captionsInfo: CaptionsInfo,
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
  // 画布大小
  height?: number;
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
  // 画布大小
  width?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      height: 'height',
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
      width: 'width',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      height: 'number',
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
      width: 'number',
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

export class CloneUniversalsaasDigitalhumanAvatarRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 数字人训练视频url
  fileUrl: string;
  // 数字人名称
  name: string;
  // 是否克隆声音，默认为false
  cloneVoice?: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      fileUrl: 'file_url',
      name: 'name',
      cloneVoice: 'clone_voice',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      fileUrl: 'string',
      name: 'string',
      cloneVoice: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CloneUniversalsaasDigitalhumanAvatarResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 结果状态
  status?: boolean;
  // 训练结果，包含数字人id与音色id
  result?: TrainingResult;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      status: 'status',
      result: 'result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      status: 'boolean',
      result: TrainingResult,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CloneUniversalsaasDigitalhumanAvatarVoiceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 训练音频url
  voiceUrl: string;
  // 音频名称
  name: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      voiceUrl: 'voice_url',
      name: 'name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      voiceUrl: 'string',
      name: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CloneUniversalsaasDigitalhumanAvatarVoiceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 结果状态
  // 
  status?: boolean;
  // 音色id
  voiceId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      status: 'status',
      voiceId: 'voice_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      status: 'boolean',
      voiceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryUniversalsaasDigitalhumanCloneTaskRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 数字人id
  modelId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      modelId: 'model_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      modelId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryUniversalsaasDigitalhumanCloneTaskResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 结果状态
  status?: boolean;
  // 数字人克隆任务结果
  data?: CloneTask;
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
      data: CloneTask,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateUniversalsaasDigitalhumanVoiceTaskRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 话术脚本
  text: string;
  // 语速，支持 0.5-2 倍速
  speed: string;
  // 音调，[0.1, 3]，默认为1，通常保留一位小数即可
  pitch?: string;
  // [0.1, 3]，默认为1，通常保留一位小数即可
  volume?: string;
  // 音色id
  voiceId: string;
  // 是否返回字幕信息，默认不返回
  openCaption?: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      text: 'text',
      speed: 'speed',
      pitch: 'pitch',
      volume: 'volume',
      voiceId: 'voice_id',
      openCaption: 'open_caption',
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
      voiceId: 'string',
      openCaption: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateUniversalsaasDigitalhumanVoiceTaskResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 结果状态
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

export class QueryUniversalsaasDigitalhumanVoiceTaskRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 音频合成任务ID
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

export class QueryUniversalsaasDigitalhumanVoiceTaskResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 结果状态
  status?: boolean;
  // 音频生成返回结果
  data?: VoiceTask;
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
      data: VoiceTask,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryUniversalsaasDigitalhumanAvatarActionRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 数字人id
  avatarId: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      avatarId: 'avatar_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      avatarId: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryUniversalsaasDigitalhumanAvatarActionResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 动作序列列表
  data?: AvatarAction[];
  // 状态结果
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
      data: { 'type': 'array', 'itemType': AvatarAction },
      status: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SubmitUniversalsaasDigitalhumanOrderRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 渠道类型
  source: string;
  // 操作类型
  actionType: string;
  // 业务类型
  bizType: string;
  // 业务id
  bizId: string;
  // 业务自定义信息
  bizData: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      source: 'source',
      actionType: 'action_type',
      bizType: 'biz_type',
      bizId: 'biz_id',
      bizData: 'biz_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      source: 'string',
      actionType: 'string',
      bizType: 'string',
      bizId: 'string',
      bizData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SubmitUniversalsaasDigitalhumanOrderResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 订单记录code
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
          sdk_version: "1.2.2",
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
   * Description: 数字人短文本试听接口
   * Summary: 数字人短文本试听接口
   */
  async createUniversalsaasDigitalhumanVoice(request: CreateUniversalsaasDigitalhumanVoiceRequest): Promise<CreateUniversalsaasDigitalhumanVoiceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createUniversalsaasDigitalhumanVoiceEx(request, headers, runtime);
  }

  /**
   * Description: 数字人短文本试听接口
   * Summary: 数字人短文本试听接口
   */
  async createUniversalsaasDigitalhumanVoiceEx(request: CreateUniversalsaasDigitalhumanVoiceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateUniversalsaasDigitalhumanVoiceResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateUniversalsaasDigitalhumanVoiceResponse>(await this.doRequest("1.0", "universalsaas.digitalhuman.voice.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateUniversalsaasDigitalhumanVoiceResponse({}));
  }

  /**
   * Description: 极速训练数字人分身，返回modelId
   * Summary: 训练数字人分身
   */
  async cloneUniversalsaasDigitalhumanAvatar(request: CloneUniversalsaasDigitalhumanAvatarRequest): Promise<CloneUniversalsaasDigitalhumanAvatarResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.cloneUniversalsaasDigitalhumanAvatarEx(request, headers, runtime);
  }

  /**
   * Description: 极速训练数字人分身，返回modelId
   * Summary: 训练数字人分身
   */
  async cloneUniversalsaasDigitalhumanAvatarEx(request: CloneUniversalsaasDigitalhumanAvatarRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CloneUniversalsaasDigitalhumanAvatarResponse> {
    Util.validateModel(request);
    return $tea.cast<CloneUniversalsaasDigitalhumanAvatarResponse>(await this.doRequest("1.0", "universalsaas.digitalhuman.avatar.clone", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CloneUniversalsaasDigitalhumanAvatarResponse({}));
  }

  /**
   * Description: 音色克隆
   * Summary: 音色克隆
   */
  async cloneUniversalsaasDigitalhumanAvatarVoice(request: CloneUniversalsaasDigitalhumanAvatarVoiceRequest): Promise<CloneUniversalsaasDigitalhumanAvatarVoiceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.cloneUniversalsaasDigitalhumanAvatarVoiceEx(request, headers, runtime);
  }

  /**
   * Description: 音色克隆
   * Summary: 音色克隆
   */
  async cloneUniversalsaasDigitalhumanAvatarVoiceEx(request: CloneUniversalsaasDigitalhumanAvatarVoiceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CloneUniversalsaasDigitalhumanAvatarVoiceResponse> {
    Util.validateModel(request);
    return $tea.cast<CloneUniversalsaasDigitalhumanAvatarVoiceResponse>(await this.doRequest("1.0", "universalsaas.digitalhuman.avatar.voice.clone", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CloneUniversalsaasDigitalhumanAvatarVoiceResponse({}));
  }

  /**
   * Description: 训练数字人分身任务查询
   * Summary: 训练数字人分身任务查询
   */
  async queryUniversalsaasDigitalhumanCloneTask(request: QueryUniversalsaasDigitalhumanCloneTaskRequest): Promise<QueryUniversalsaasDigitalhumanCloneTaskResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryUniversalsaasDigitalhumanCloneTaskEx(request, headers, runtime);
  }

  /**
   * Description: 训练数字人分身任务查询
   * Summary: 训练数字人分身任务查询
   */
  async queryUniversalsaasDigitalhumanCloneTaskEx(request: QueryUniversalsaasDigitalhumanCloneTaskRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryUniversalsaasDigitalhumanCloneTaskResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryUniversalsaasDigitalhumanCloneTaskResponse>(await this.doRequest("1.0", "universalsaas.digitalhuman.clone.task.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryUniversalsaasDigitalhumanCloneTaskResponse({}));
  }

  /**
   * Description: 数字人音频生成接口
   * Summary: 数字人音频生成接口
   */
  async createUniversalsaasDigitalhumanVoiceTask(request: CreateUniversalsaasDigitalhumanVoiceTaskRequest): Promise<CreateUniversalsaasDigitalhumanVoiceTaskResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createUniversalsaasDigitalhumanVoiceTaskEx(request, headers, runtime);
  }

  /**
   * Description: 数字人音频生成接口
   * Summary: 数字人音频生成接口
   */
  async createUniversalsaasDigitalhumanVoiceTaskEx(request: CreateUniversalsaasDigitalhumanVoiceTaskRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateUniversalsaasDigitalhumanVoiceTaskResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateUniversalsaasDigitalhumanVoiceTaskResponse>(await this.doRequest("1.0", "universalsaas.digitalhuman.voice.task.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateUniversalsaasDigitalhumanVoiceTaskResponse({}));
  }

  /**
   * Description: 音频生成任务查询接口
   * Summary: 音频生成任务查询接口
   */
  async queryUniversalsaasDigitalhumanVoiceTask(request: QueryUniversalsaasDigitalhumanVoiceTaskRequest): Promise<QueryUniversalsaasDigitalhumanVoiceTaskResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryUniversalsaasDigitalhumanVoiceTaskEx(request, headers, runtime);
  }

  /**
   * Description: 音频生成任务查询接口
   * Summary: 音频生成任务查询接口
   */
  async queryUniversalsaasDigitalhumanVoiceTaskEx(request: QueryUniversalsaasDigitalhumanVoiceTaskRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryUniversalsaasDigitalhumanVoiceTaskResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryUniversalsaasDigitalhumanVoiceTaskResponse>(await this.doRequest("1.0", "universalsaas.digitalhuman.voice.task.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryUniversalsaasDigitalhumanVoiceTaskResponse({}));
  }

  /**
   * Description: 获取数字人动作序列接口
   * Summary: 获取数字人动作序列接口
   */
  async queryUniversalsaasDigitalhumanAvatarAction(request: QueryUniversalsaasDigitalhumanAvatarActionRequest): Promise<QueryUniversalsaasDigitalhumanAvatarActionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryUniversalsaasDigitalhumanAvatarActionEx(request, headers, runtime);
  }

  /**
   * Description: 获取数字人动作序列接口
   * Summary: 获取数字人动作序列接口
   */
  async queryUniversalsaasDigitalhumanAvatarActionEx(request: QueryUniversalsaasDigitalhumanAvatarActionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryUniversalsaasDigitalhumanAvatarActionResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryUniversalsaasDigitalhumanAvatarActionResponse>(await this.doRequest("1.0", "universalsaas.digitalhuman.avatar.action.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryUniversalsaasDigitalhumanAvatarActionResponse({}));
  }

  /**
   * Description: 数字人订单上报接口
   * Summary: 数字人订单上报接口
   */
  async submitUniversalsaasDigitalhumanOrder(request: SubmitUniversalsaasDigitalhumanOrderRequest): Promise<SubmitUniversalsaasDigitalhumanOrderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.submitUniversalsaasDigitalhumanOrderEx(request, headers, runtime);
  }

  /**
   * Description: 数字人订单上报接口
   * Summary: 数字人订单上报接口
   */
  async submitUniversalsaasDigitalhumanOrderEx(request: SubmitUniversalsaasDigitalhumanOrderRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SubmitUniversalsaasDigitalhumanOrderResponse> {
    Util.validateModel(request);
    return $tea.cast<SubmitUniversalsaasDigitalhumanOrderResponse>(await this.doRequest("1.0", "universalsaas.digitalhuman.order.submit", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SubmitUniversalsaasDigitalhumanOrderResponse({}));
  }

}
