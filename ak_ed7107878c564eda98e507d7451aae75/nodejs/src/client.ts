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

// 数字人平台--角色信息
export class AvatarHumanInfo extends $tea.Model {
  // 数字人角色id
  id: number;
  // 数字人角色名
  humanName: string;
  // 数字人形象id
  modelId: number;
  // 数字人音色编码
  voiceCode: string;
  // 数字人音色名
  voiceName?: string;
  // 数字人音色预览图
  voiceImage?: string;
  // 语速
  speechRate?: number;
  // 音调
  pitchRate?: string;
  // 音量
  volume?: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      humanName: 'human_name',
      modelId: 'model_id',
      voiceCode: 'voice_code',
      voiceName: 'voice_name',
      voiceImage: 'voice_image',
      speechRate: 'speech_rate',
      pitchRate: 'pitch_rate',
      volume: 'volume',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'number',
      humanName: 'string',
      modelId: 'number',
      voiceCode: 'string',
      voiceName: 'string',
      voiceImage: 'string',
      speechRate: 'number',
      pitchRate: 'string',
      volume: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 数字人平台--知识库信息
export class AvatarLibraryInfo extends $tea.Model {
  // 知识点数量
  questionCount: number;
  // 知识库id
  id: number;
  // 知识库名称
  title: string;
  // 数字人角色信息
  humanInfo: AvatarHumanInfo;
  static names(): { [key: string]: string } {
    return {
      questionCount: 'question_count',
      id: 'id',
      title: 'title',
      humanInfo: 'human_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      questionCount: 'number',
      id: 'number',
      title: 'string',
      humanInfo: AvatarHumanInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 数字人平台--大模型对话配置信息
export class AvatarLlmChatInfo extends $tea.Model {
  // 大模型对话配置编码
  llmChatCode: string;
  // 大模型对话配置名
  llmChatName: string;
  // 描述
  description?: string;
  // 模型配置名
  modelName: string;
  // 模型配置编码
  modelCode: string;
  // 模型配置id
  modelId: string;
  // 大模型对话自定义配置信息
  config?: string;
  static names(): { [key: string]: string } {
    return {
      llmChatCode: 'llm_chat_code',
      llmChatName: 'llm_chat_name',
      description: 'description',
      modelName: 'model_name',
      modelCode: 'model_code',
      modelId: 'model_id',
      config: 'config',
    };
  }

  static types(): { [key: string]: any } {
    return {
      llmChatCode: 'string',
      llmChatName: 'string',
      description: 'string',
      modelName: 'string',
      modelCode: 'string',
      modelId: 'string',
      config: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 数字人平台--自定义组件信息
export class AvatarComponentInfo extends $tea.Model {
  // 组件标题
  title: string;
  // 组件编码
  code: string;
  // 组件值
  value: string;
  static names(): { [key: string]: string } {
    return {
      title: 'title',
      code: 'code',
      value: 'value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      title: 'string',
      code: 'string',
      value: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 数字人平台--形象信息
export class AvatarModelInfo extends $tea.Model {
  // 数字人形象id
  modelId: number;
  // 数字人形象名
  modelName: string;
  // 数字人形象默认音色列表
  voiceList: string[];
  // 数字人形象预览图
  image: string;
  static names(): { [key: string]: string } {
    return {
      modelId: 'model_id',
      modelName: 'model_name',
      voiceList: 'voice_list',
      image: 'image',
    };
  }

  static types(): { [key: string]: any } {
    return {
      modelId: 'number',
      modelName: 'string',
      voiceList: { 'type': 'array', 'itemType': 'string' },
      image: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 数字人平台--音色信息
export class AvatarVoiceInfo extends $tea.Model {
  // 音色id
  voiceId: string;
  // 音色编码
  voiceCode: string;
  // 音色名
  voiceName: string;
  // 预览图
  image?: string;
  // 音色性别
  gender?: string;
  // 音色类型
  voiceType?: string;
  // 音色试听链接列表
  auditionList?: string[];
  static names(): { [key: string]: string } {
    return {
      voiceId: 'voice_id',
      voiceCode: 'voice_code',
      voiceName: 'voice_name',
      image: 'image',
      gender: 'gender',
      voiceType: 'voice_type',
      auditionList: 'audition_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      voiceId: 'string',
      voiceCode: 'string',
      voiceName: 'string',
      image: 'string',
      gender: 'string',
      voiceType: 'string',
      auditionList: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 数字人平台--气泡按钮信息
export class AvatarBubbleInfo extends $tea.Model {
  // 气泡标题
  title: string;
  // 气泡类型
  type: string;
  // 知识点id
  knowId?: string;
  // 电话号码
  tel?: string;
  // 外部链接
  link?: string;
  static names(): { [key: string]: string } {
    return {
      title: 'title',
      type: 'type',
      knowId: 'know_id',
      tel: 'tel',
      link: 'link',
    };
  }

  static types(): { [key: string]: any } {
    return {
      title: 'string',
      type: 'string',
      knowId: 'string',
      tel: 'string',
      link: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 流信息
export class AvatarStreamInfo extends $tea.Model {
  // 形象id
  modelId?: string;
  // 音色编码
  voiceCode?: string;
  // 背景信息
  background?: string;
  // 流id
  streamId: string;
  static names(): { [key: string]: string } {
    return {
      modelId: 'model_id',
      voiceCode: 'voice_code',
      background: 'background',
      streamId: 'stream_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      modelId: 'string',
      voiceCode: 'string',
      background: 'string',
      streamId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 知识点批量导入任务结果
export class ImportTaskResult extends $tea.Model {
  // 任务状态
  status: string;
  // 进度值
  progress?: number;
  // 错误日志
  errorMessage?: string;
  // 导入日志文件url
  fileUrl?: string;
  static names(): { [key: string]: string } {
    return {
      status: 'status',
      progress: 'progress',
      errorMessage: 'error_message',
      fileUrl: 'file_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      status: 'string',
      progress: 'number',
      errorMessage: 'string',
      fileUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 数字人平台--交互配置信息
export class AvatarConfigInfo extends $tea.Model {
  // 交互配置id
  id: number;
  // 交互配置名
  configName: string;
  // 交互配置编码
  virtualCode: string;
  // 数字人角色id
  humanId: number;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      configName: 'config_name',
      virtualCode: 'virtual_code',
      humanId: 'human_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'number',
      configName: 'string',
      virtualCode: 'string',
      humanId: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 数字人平台--话术配置信息
export class AvatarScriptConfigInfo extends $tea.Model {
  // 唤醒词列表
  wakeWords?: string[];
  // 欢迎语列表
  welcomePhrases?: string[];
  // 兜底语列表
  fallbackPhrases?: string[];
  static names(): { [key: string]: string } {
    return {
      wakeWords: 'wake_words',
      welcomePhrases: 'welcome_phrases',
      fallbackPhrases: 'fallback_phrases',
    };
  }

  static types(): { [key: string]: any } {
    return {
      wakeWords: { 'type': 'array', 'itemType': 'string' },
      welcomePhrases: { 'type': 'array', 'itemType': 'string' },
      fallbackPhrases: { 'type': 'array', 'itemType': 'string' },
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

export class ListUniversalsaasDigitalhumanHumanRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户编码
  tenantCode: string;
  // 获取数字人角色的类型
  classification: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantCode: 'tenant_code',
      classification: 'classification',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantCode: 'string',
      classification: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListUniversalsaasDigitalhumanHumanResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 数字人角色列表
  itemList?: AvatarHumanInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      itemList: 'item_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      itemList: { 'type': 'array', 'itemType': AvatarHumanInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListUniversalsaasDigitalhumanLibraryRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户编码
  tenantCode: string;
  // 知识库类型
  classification: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantCode: 'tenant_code',
      classification: 'classification',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantCode: 'string',
      classification: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListUniversalsaasDigitalhumanLibraryResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 知识库列表
  itemList?: AvatarLibraryInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      itemList: 'item_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      itemList: { 'type': 'array', 'itemType': AvatarLibraryInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddUniversalsaasDigitalhumanLibraryRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户编码
  tenantCode: string;
  // 知识库类型
  classification: string;
  // 角色id
  humanId: number;
  // 知识库名称
  title: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantCode: 'tenant_code',
      classification: 'classification',
      humanId: 'human_id',
      title: 'title',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantCode: 'string',
      classification: 'string',
      humanId: 'number',
      title: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddUniversalsaasDigitalhumanLibraryResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 知识库id
  data?: number;
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
      data: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateUniversalsaasDigitalhumanLibraryRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户编码
  tenantCode: string;
  // 知识库id
  id: number;
  // 知识库名称
  title: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantCode: 'tenant_code',
      id: 'id',
      title: 'title',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantCode: 'string',
      id: 'number',
      title: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateUniversalsaasDigitalhumanLibraryResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteUniversalsaasDigitalhumanLibraryRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户编码
  tenantCode: string;
  // 知识库id
  id: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantCode: 'tenant_code',
      id: 'id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantCode: 'string',
      id: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteUniversalsaasDigitalhumanLibraryResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddUniversalsaasDigitalhumanKnowledgeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户编码
  tenantCode: string;
  // 知识库id
  libraryId: number;
  // 标问标题
  questionTitle: string;
  // 问法列表
  sentenceList: string[];
  // 答案文案
  content: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantCode: 'tenant_code',
      libraryId: 'library_id',
      questionTitle: 'question_title',
      sentenceList: 'sentence_list',
      content: 'content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantCode: 'string',
      libraryId: 'number',
      questionTitle: 'string',
      sentenceList: { 'type': 'array', 'itemType': 'string' },
      content: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddUniversalsaasDigitalhumanKnowledgeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 知识点id
  data?: number;
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
      data: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateUniversalsaasDigitalhumanKnowledgeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户编码
  tenantCode: string;
  // 知识库ID
  libraryId: number;
  // 知识点id
  id: number;
  // 标问标题
  questionTitle: string;
  // 问法列表
  sentenceList: string[];
  // 答案文案
  content: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantCode: 'tenant_code',
      libraryId: 'library_id',
      id: 'id',
      questionTitle: 'question_title',
      sentenceList: 'sentence_list',
      content: 'content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantCode: 'string',
      libraryId: 'number',
      id: 'number',
      questionTitle: 'string',
      sentenceList: { 'type': 'array', 'itemType': 'string' },
      content: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateUniversalsaasDigitalhumanKnowledgeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OnlineUniversalsaasDigitalhumanKnowledgeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户编码
  tenantCode: string;
  // 知识库id
  libraryId: number;
  // 知识点id列表
  ids: number[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantCode: 'tenant_code',
      libraryId: 'library_id',
      ids: 'ids',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantCode: 'string',
      libraryId: 'number',
      ids: { 'type': 'array', 'itemType': 'number' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OnlineUniversalsaasDigitalhumanKnowledgeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OfflineUniversalsaasDigitalhumanKnowledgeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户编码
  tenantCode: string;
  // 知识库ID
  libraryId: number;
  // 知识点id列表
  ids: number[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantCode: 'tenant_code',
      libraryId: 'library_id',
      ids: 'ids',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantCode: 'string',
      libraryId: 'number',
      ids: { 'type': 'array', 'itemType': 'number' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OfflineUniversalsaasDigitalhumanKnowledgeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListUniversalsaasDigitalhumanLlmChatRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户编码
  tenantCode: string;
  // 页码
  pageNum?: number;
  // 页面大小
  pageSize?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantCode: 'tenant_code',
      pageNum: 'page_num',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantCode: 'string',
      pageNum: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListUniversalsaasDigitalhumanLlmChatResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 大模型对话列表
  itemList?: AvatarLlmChatInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      itemList: 'item_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      itemList: { 'type': 'array', 'itemType': AvatarLlmChatInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddUniversalsaasDigitalhumanChatSettingRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户编码
  tenantCode: string;
  // 交互配置名称
  configName: string;
  // 角色id
  humanId: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantCode: 'tenant_code',
      configName: 'config_name',
      humanId: 'human_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantCode: 'string',
      configName: 'string',
      humanId: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddUniversalsaasDigitalhumanChatSettingResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 交互配置信息
  data?: AvatarConfigInfo;
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
      data: AvatarConfigInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SetUniversalsaasDigitalhumanChatSettingRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户编码
  tenantCode: string;
  // 交互配置ID
  id: number;
  // 交互配置名
  title?: string;
  // 背景图片url
  bgImg?: string;
  // logo图片url
  logoImg?: string;
  // 气泡配置
  bubbleConfig?: AvatarBubbleInfo[];
  // 自定义组件配置
  componentConfig?: AvatarComponentInfo[];
  // 关联大模型对话配置编码
  llmCode?: string;
  // 关联知识库列表
  libraryIds?: number[];
  // 话术配置
  scriptConfig?: AvatarScriptConfigInfo;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantCode: 'tenant_code',
      id: 'id',
      title: 'title',
      bgImg: 'bg_img',
      logoImg: 'logo_img',
      bubbleConfig: 'bubble_config',
      componentConfig: 'component_config',
      llmCode: 'llm_code',
      libraryIds: 'library_ids',
      scriptConfig: 'script_config',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantCode: 'string',
      id: 'number',
      title: 'string',
      bgImg: 'string',
      logoImg: 'string',
      bubbleConfig: { 'type': 'array', 'itemType': AvatarBubbleInfo },
      componentConfig: { 'type': 'array', 'itemType': AvatarComponentInfo },
      llmCode: 'string',
      libraryIds: { 'type': 'array', 'itemType': 'number' },
      scriptConfig: AvatarScriptConfigInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SetUniversalsaasDigitalhumanChatSettingResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteUniversalsaasDigitalhumanChatSettingRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户编码
  tenantCode: string;
  // 交互配置id
  id: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantCode: 'tenant_code',
      id: 'id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantCode: 'string',
      id: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteUniversalsaasDigitalhumanChatSettingResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OnlineUniversalsaasDigitalhumanChatSettingRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户编码
  tenantCode: string;
  // 交互配置id
  id: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantCode: 'tenant_code',
      id: 'id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantCode: 'string',
      id: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OnlineUniversalsaasDigitalhumanChatSettingResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OfflineUniversalsaasDigitalhumanChatSettingRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户编码
  tenantCode: string;
  // 交互配置id
  id: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantCode: 'tenant_code',
      id: 'id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantCode: 'string',
      id: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OfflineUniversalsaasDigitalhumanChatSettingResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListUniversalsaasDigitalhumanModelRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户编码
  tenantCode: string;
  // common---内置形象
  // custom--我的形象
  type: string;
  // 2d---2d形象
  // 3d---3d形象
  classification: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantCode: 'tenant_code',
      type: 'type',
      classification: 'classification',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantCode: 'string',
      type: 'string',
      classification: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListUniversalsaasDigitalhumanModelResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 数字人形象信息列表
  itemList?: AvatarModelInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      itemList: 'item_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      itemList: { 'type': 'array', 'itemType': AvatarModelInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListUniversalsaasDigitalhumanVoiceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户编码
  tenantCode: string;
  // common---内置音色
  // custom--我的音色
  type: string;
  // 2d---2d音色
  // 3d---3d音色
  classification: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantCode: 'tenant_code',
      type: 'type',
      classification: 'classification',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantCode: 'string',
      type: 'string',
      classification: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListUniversalsaasDigitalhumanVoiceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 数字人平台音色信息列表
  itemList?: AvatarVoiceInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      itemList: 'item_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      itemList: { 'type': 'array', 'itemType': AvatarVoiceInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PreviewUniversalsaasDigitalhumanVoiceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户编码
  tenantCode: string;
  // 2d---2d音色
  // 3d---3d音色
  classification: string;
  // 音色编码
  voiceCode: string;
  // 试听文案
  text: string;
  // 语速
  speed?: number;
  // 音调
  pitch?: number;
  // 音量
  volume?: number;
  // 数字人角色id
  humanId?: number;
  // 数字人形象id
  modelId?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantCode: 'tenant_code',
      classification: 'classification',
      voiceCode: 'voice_code',
      text: 'text',
      speed: 'speed',
      pitch: 'pitch',
      volume: 'volume',
      humanId: 'human_id',
      modelId: 'model_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantCode: 'string',
      classification: 'string',
      voiceCode: 'string',
      text: 'string',
      speed: 'number',
      pitch: 'number',
      volume: 'number',
      humanId: 'number',
      modelId: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PreviewUniversalsaasDigitalhumanVoiceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 试听音频链接
  data?: string;
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
      data: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateUniversalsaasDigitalhumanHumanRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户编码
  tenantCode: string;
  // 数字人形象id
  modelId: number;
  // 音色编码
  voiceCode: string;
  // 数字人角色名
  humanName?: string;
  // 语速
  speed?: number;
  // 音调
  pitch?: number;
  // 音量
  volume?: number;
  // 数字人角色id
  humanId?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantCode: 'tenant_code',
      modelId: 'model_id',
      voiceCode: 'voice_code',
      humanName: 'human_name',
      speed: 'speed',
      pitch: 'pitch',
      volume: 'volume',
      humanId: 'human_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantCode: 'string',
      modelId: 'number',
      voiceCode: 'string',
      humanName: 'string',
      speed: 'number',
      pitch: 'number',
      volume: 'number',
      humanId: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateUniversalsaasDigitalhumanHumanResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 数字人角色信息
  data?: AvatarHumanInfo;
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
      data: AvatarHumanInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteUniversalsaasDigitalhumanHumanRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户编码
  tenantCode: string;
  // 数字人角色id
  humanId: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantCode: 'tenant_code',
      humanId: 'human_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantCode: 'string',
      humanId: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteUniversalsaasDigitalhumanHumanResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteUniversalsaasDigitalhumanKnowledgeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户编码
  tenantCode: string;
  // 知识点id列表
  ids: number[];
  // 知识库id
  libraryId: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantCode: 'tenant_code',
      ids: 'ids',
      libraryId: 'library_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantCode: 'string',
      ids: { 'type': 'array', 'itemType': 'number' },
      libraryId: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteUniversalsaasDigitalhumanKnowledgeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateUniversalsaasDigitalhumanKnowledgeImporttaskRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 知识点excel文件
  fileObject?: Readable;
  fileObjectName?: string;
  fileId: string;
  // 租户编码
  tenantCode: string;
  // 知识库id
  libraryId: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      fileObject: 'fileObject',
      fileObjectName: 'fileObjectName',
      fileId: 'file_id',
      tenantCode: 'tenant_code',
      libraryId: 'library_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      fileObject: 'Readable',
      fileObjectName: 'string',
      fileId: 'string',
      tenantCode: 'string',
      libraryId: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateUniversalsaasDigitalhumanKnowledgeImporttaskResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 任务id
  taskId?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      taskId: 'task_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      taskId: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryUniversalsaasDigitalhumanKnowledgeImporttaskRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户编码
  tenantCode: string;
  // 导入任务id
  taskId: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantCode: 'tenant_code',
      taskId: 'task_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantCode: 'string',
      taskId: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryUniversalsaasDigitalhumanKnowledgeImporttaskResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 批量导入任务结果
  data?: ImportTaskResult;
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
      data: ImportTaskResult,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExportUniversalsaasDigitalhumanKnowledgeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户编码
  tenantCode: string;
  // 知识库id
  libraryId: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantCode: 'tenant_code',
      libraryId: 'library_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantCode: 'string',
      libraryId: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExportUniversalsaasDigitalhumanKnowledgeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // excel文件url
  data?: string;
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
      data: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListUniversalsaasDigitalhumanStreamRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户编码
  tenantCode: string;
  // appId
  appId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantCode: 'tenant_code',
      appId: 'app_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantCode: 'string',
      appId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListUniversalsaasDigitalhumanStreamResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 实时流信息列表
  data?: AvatarStreamInfo[];
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
      data: { 'type': 'array', 'itemType': AvatarStreamInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StopUniversalsaasDigitalhumanStreamRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户编码
  tenantCode: string;
  // app_id
  appId: string;
  // 流Id
  streamId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantCode: 'tenant_code',
      appId: 'app_id',
      streamId: 'stream_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantCode: 'string',
      appId: 'string',
      streamId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StopUniversalsaasDigitalhumanStreamResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
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
          sdk_version: "1.1.6",
          _prod_code: "ak_ed7107878c564eda98e507d7451aae75",
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
   * Description: 数字人角色列表查询接口
   * Summary: 数字人角色列表查询接口
   */
  async listUniversalsaasDigitalhumanHuman(request: ListUniversalsaasDigitalhumanHumanRequest): Promise<ListUniversalsaasDigitalhumanHumanResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listUniversalsaasDigitalhumanHumanEx(request, headers, runtime);
  }

  /**
   * Description: 数字人角色列表查询接口
   * Summary: 数字人角色列表查询接口
   */
  async listUniversalsaasDigitalhumanHumanEx(request: ListUniversalsaasDigitalhumanHumanRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListUniversalsaasDigitalhumanHumanResponse> {
    Util.validateModel(request);
    return $tea.cast<ListUniversalsaasDigitalhumanHumanResponse>(await this.doRequest("1.0", "universalsaas.digitalhuman.human.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListUniversalsaasDigitalhumanHumanResponse({}));
  }

  /**
   * Description: 知识库列表查询接口
   * Summary: 知识库列表查询接口
   */
  async listUniversalsaasDigitalhumanLibrary(request: ListUniversalsaasDigitalhumanLibraryRequest): Promise<ListUniversalsaasDigitalhumanLibraryResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listUniversalsaasDigitalhumanLibraryEx(request, headers, runtime);
  }

  /**
   * Description: 知识库列表查询接口
   * Summary: 知识库列表查询接口
   */
  async listUniversalsaasDigitalhumanLibraryEx(request: ListUniversalsaasDigitalhumanLibraryRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListUniversalsaasDigitalhumanLibraryResponse> {
    Util.validateModel(request);
    return $tea.cast<ListUniversalsaasDigitalhumanLibraryResponse>(await this.doRequest("1.0", "universalsaas.digitalhuman.library.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListUniversalsaasDigitalhumanLibraryResponse({}));
  }

  /**
   * Description: 创建知识库接口
   * Summary: 创建知识库接口
   */
  async addUniversalsaasDigitalhumanLibrary(request: AddUniversalsaasDigitalhumanLibraryRequest): Promise<AddUniversalsaasDigitalhumanLibraryResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.addUniversalsaasDigitalhumanLibraryEx(request, headers, runtime);
  }

  /**
   * Description: 创建知识库接口
   * Summary: 创建知识库接口
   */
  async addUniversalsaasDigitalhumanLibraryEx(request: AddUniversalsaasDigitalhumanLibraryRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AddUniversalsaasDigitalhumanLibraryResponse> {
    Util.validateModel(request);
    return $tea.cast<AddUniversalsaasDigitalhumanLibraryResponse>(await this.doRequest("1.0", "universalsaas.digitalhuman.library.add", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AddUniversalsaasDigitalhumanLibraryResponse({}));
  }

  /**
   * Description: 编辑知识库接口
   * Summary: 编辑知识库接口
   */
  async updateUniversalsaasDigitalhumanLibrary(request: UpdateUniversalsaasDigitalhumanLibraryRequest): Promise<UpdateUniversalsaasDigitalhumanLibraryResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateUniversalsaasDigitalhumanLibraryEx(request, headers, runtime);
  }

  /**
   * Description: 编辑知识库接口
   * Summary: 编辑知识库接口
   */
  async updateUniversalsaasDigitalhumanLibraryEx(request: UpdateUniversalsaasDigitalhumanLibraryRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateUniversalsaasDigitalhumanLibraryResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateUniversalsaasDigitalhumanLibraryResponse>(await this.doRequest("1.0", "universalsaas.digitalhuman.library.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateUniversalsaasDigitalhumanLibraryResponse({}));
  }

  /**
   * Description: 删除知识库接口
   * Summary: 删除知识库接口
   */
  async deleteUniversalsaasDigitalhumanLibrary(request: DeleteUniversalsaasDigitalhumanLibraryRequest): Promise<DeleteUniversalsaasDigitalhumanLibraryResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteUniversalsaasDigitalhumanLibraryEx(request, headers, runtime);
  }

  /**
   * Description: 删除知识库接口
   * Summary: 删除知识库接口
   */
  async deleteUniversalsaasDigitalhumanLibraryEx(request: DeleteUniversalsaasDigitalhumanLibraryRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteUniversalsaasDigitalhumanLibraryResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteUniversalsaasDigitalhumanLibraryResponse>(await this.doRequest("1.0", "universalsaas.digitalhuman.library.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteUniversalsaasDigitalhumanLibraryResponse({}));
  }

  /**
   * Description: 新增知识点接口
   * Summary: 新增知识点接口
   */
  async addUniversalsaasDigitalhumanKnowledge(request: AddUniversalsaasDigitalhumanKnowledgeRequest): Promise<AddUniversalsaasDigitalhumanKnowledgeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.addUniversalsaasDigitalhumanKnowledgeEx(request, headers, runtime);
  }

  /**
   * Description: 新增知识点接口
   * Summary: 新增知识点接口
   */
  async addUniversalsaasDigitalhumanKnowledgeEx(request: AddUniversalsaasDigitalhumanKnowledgeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AddUniversalsaasDigitalhumanKnowledgeResponse> {
    Util.validateModel(request);
    return $tea.cast<AddUniversalsaasDigitalhumanKnowledgeResponse>(await this.doRequest("1.0", "universalsaas.digitalhuman.knowledge.add", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AddUniversalsaasDigitalhumanKnowledgeResponse({}));
  }

  /**
   * Description: 编辑知识点接口
   * Summary: 编辑知识点接口
   */
  async updateUniversalsaasDigitalhumanKnowledge(request: UpdateUniversalsaasDigitalhumanKnowledgeRequest): Promise<UpdateUniversalsaasDigitalhumanKnowledgeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateUniversalsaasDigitalhumanKnowledgeEx(request, headers, runtime);
  }

  /**
   * Description: 编辑知识点接口
   * Summary: 编辑知识点接口
   */
  async updateUniversalsaasDigitalhumanKnowledgeEx(request: UpdateUniversalsaasDigitalhumanKnowledgeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateUniversalsaasDigitalhumanKnowledgeResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateUniversalsaasDigitalhumanKnowledgeResponse>(await this.doRequest("1.0", "universalsaas.digitalhuman.knowledge.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateUniversalsaasDigitalhumanKnowledgeResponse({}));
  }

  /**
   * Description: 发布知识点接口
   * Summary: 发布知识点接口
   */
  async onlineUniversalsaasDigitalhumanKnowledge(request: OnlineUniversalsaasDigitalhumanKnowledgeRequest): Promise<OnlineUniversalsaasDigitalhumanKnowledgeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.onlineUniversalsaasDigitalhumanKnowledgeEx(request, headers, runtime);
  }

  /**
   * Description: 发布知识点接口
   * Summary: 发布知识点接口
   */
  async onlineUniversalsaasDigitalhumanKnowledgeEx(request: OnlineUniversalsaasDigitalhumanKnowledgeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<OnlineUniversalsaasDigitalhumanKnowledgeResponse> {
    Util.validateModel(request);
    return $tea.cast<OnlineUniversalsaasDigitalhumanKnowledgeResponse>(await this.doRequest("1.0", "universalsaas.digitalhuman.knowledge.online", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new OnlineUniversalsaasDigitalhumanKnowledgeResponse({}));
  }

  /**
   * Description: 下线知识点接口
   * Summary: 下线知识点接口
   */
  async offlineUniversalsaasDigitalhumanKnowledge(request: OfflineUniversalsaasDigitalhumanKnowledgeRequest): Promise<OfflineUniversalsaasDigitalhumanKnowledgeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.offlineUniversalsaasDigitalhumanKnowledgeEx(request, headers, runtime);
  }

  /**
   * Description: 下线知识点接口
   * Summary: 下线知识点接口
   */
  async offlineUniversalsaasDigitalhumanKnowledgeEx(request: OfflineUniversalsaasDigitalhumanKnowledgeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<OfflineUniversalsaasDigitalhumanKnowledgeResponse> {
    Util.validateModel(request);
    return $tea.cast<OfflineUniversalsaasDigitalhumanKnowledgeResponse>(await this.doRequest("1.0", "universalsaas.digitalhuman.knowledge.offline", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new OfflineUniversalsaasDigitalhumanKnowledgeResponse({}));
  }

  /**
   * Description: 查询大模型对话列表接口
   * Summary: 查询大模型对话列表接口
   */
  async listUniversalsaasDigitalhumanLlmChat(request: ListUniversalsaasDigitalhumanLlmChatRequest): Promise<ListUniversalsaasDigitalhumanLlmChatResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listUniversalsaasDigitalhumanLlmChatEx(request, headers, runtime);
  }

  /**
   * Description: 查询大模型对话列表接口
   * Summary: 查询大模型对话列表接口
   */
  async listUniversalsaasDigitalhumanLlmChatEx(request: ListUniversalsaasDigitalhumanLlmChatRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListUniversalsaasDigitalhumanLlmChatResponse> {
    Util.validateModel(request);
    return $tea.cast<ListUniversalsaasDigitalhumanLlmChatResponse>(await this.doRequest("1.0", "universalsaas.digitalhuman.llm.chat.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListUniversalsaasDigitalhumanLlmChatResponse({}));
  }

  /**
   * Description: 新增交互配置接口
   * Summary: 新增交互配置接口
   */
  async addUniversalsaasDigitalhumanChatSetting(request: AddUniversalsaasDigitalhumanChatSettingRequest): Promise<AddUniversalsaasDigitalhumanChatSettingResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.addUniversalsaasDigitalhumanChatSettingEx(request, headers, runtime);
  }

  /**
   * Description: 新增交互配置接口
   * Summary: 新增交互配置接口
   */
  async addUniversalsaasDigitalhumanChatSettingEx(request: AddUniversalsaasDigitalhumanChatSettingRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AddUniversalsaasDigitalhumanChatSettingResponse> {
    Util.validateModel(request);
    return $tea.cast<AddUniversalsaasDigitalhumanChatSettingResponse>(await this.doRequest("1.0", "universalsaas.digitalhuman.chat.setting.add", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AddUniversalsaasDigitalhumanChatSettingResponse({}));
  }

  /**
   * Description: 编辑交互配置接口
   * Summary: 编辑交互配置接口
   */
  async setUniversalsaasDigitalhumanChatSetting(request: SetUniversalsaasDigitalhumanChatSettingRequest): Promise<SetUniversalsaasDigitalhumanChatSettingResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.setUniversalsaasDigitalhumanChatSettingEx(request, headers, runtime);
  }

  /**
   * Description: 编辑交互配置接口
   * Summary: 编辑交互配置接口
   */
  async setUniversalsaasDigitalhumanChatSettingEx(request: SetUniversalsaasDigitalhumanChatSettingRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SetUniversalsaasDigitalhumanChatSettingResponse> {
    Util.validateModel(request);
    return $tea.cast<SetUniversalsaasDigitalhumanChatSettingResponse>(await this.doRequest("1.0", "universalsaas.digitalhuman.chat.setting.set", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SetUniversalsaasDigitalhumanChatSettingResponse({}));
  }

  /**
   * Description: 删除交互配置接口
   * Summary: 删除交互配置接口
   */
  async deleteUniversalsaasDigitalhumanChatSetting(request: DeleteUniversalsaasDigitalhumanChatSettingRequest): Promise<DeleteUniversalsaasDigitalhumanChatSettingResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteUniversalsaasDigitalhumanChatSettingEx(request, headers, runtime);
  }

  /**
   * Description: 删除交互配置接口
   * Summary: 删除交互配置接口
   */
  async deleteUniversalsaasDigitalhumanChatSettingEx(request: DeleteUniversalsaasDigitalhumanChatSettingRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteUniversalsaasDigitalhumanChatSettingResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteUniversalsaasDigitalhumanChatSettingResponse>(await this.doRequest("1.0", "universalsaas.digitalhuman.chat.setting.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteUniversalsaasDigitalhumanChatSettingResponse({}));
  }

  /**
   * Description: 发布交互配置接口
   * Summary: 发布交互配置接口
   */
  async onlineUniversalsaasDigitalhumanChatSetting(request: OnlineUniversalsaasDigitalhumanChatSettingRequest): Promise<OnlineUniversalsaasDigitalhumanChatSettingResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.onlineUniversalsaasDigitalhumanChatSettingEx(request, headers, runtime);
  }

  /**
   * Description: 发布交互配置接口
   * Summary: 发布交互配置接口
   */
  async onlineUniversalsaasDigitalhumanChatSettingEx(request: OnlineUniversalsaasDigitalhumanChatSettingRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<OnlineUniversalsaasDigitalhumanChatSettingResponse> {
    Util.validateModel(request);
    return $tea.cast<OnlineUniversalsaasDigitalhumanChatSettingResponse>(await this.doRequest("1.0", "universalsaas.digitalhuman.chat.setting.online", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new OnlineUniversalsaasDigitalhumanChatSettingResponse({}));
  }

  /**
   * Description: 下线交互配置接口
   * Summary: 下线交互配置接口
   */
  async offlineUniversalsaasDigitalhumanChatSetting(request: OfflineUniversalsaasDigitalhumanChatSettingRequest): Promise<OfflineUniversalsaasDigitalhumanChatSettingResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.offlineUniversalsaasDigitalhumanChatSettingEx(request, headers, runtime);
  }

  /**
   * Description: 下线交互配置接口
   * Summary: 下线交互配置接口
   */
  async offlineUniversalsaasDigitalhumanChatSettingEx(request: OfflineUniversalsaasDigitalhumanChatSettingRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<OfflineUniversalsaasDigitalhumanChatSettingResponse> {
    Util.validateModel(request);
    return $tea.cast<OfflineUniversalsaasDigitalhumanChatSettingResponse>(await this.doRequest("1.0", "universalsaas.digitalhuman.chat.setting.offline", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new OfflineUniversalsaasDigitalhumanChatSettingResponse({}));
  }

  /**
   * Description: 数字人形象列表接口
   * Summary: 数字人形象列表接口
   */
  async listUniversalsaasDigitalhumanModel(request: ListUniversalsaasDigitalhumanModelRequest): Promise<ListUniversalsaasDigitalhumanModelResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listUniversalsaasDigitalhumanModelEx(request, headers, runtime);
  }

  /**
   * Description: 数字人形象列表接口
   * Summary: 数字人形象列表接口
   */
  async listUniversalsaasDigitalhumanModelEx(request: ListUniversalsaasDigitalhumanModelRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListUniversalsaasDigitalhumanModelResponse> {
    Util.validateModel(request);
    return $tea.cast<ListUniversalsaasDigitalhumanModelResponse>(await this.doRequest("1.0", "universalsaas.digitalhuman.model.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListUniversalsaasDigitalhumanModelResponse({}));
  }

  /**
   * Description: 数字人平台音色列表
   * Summary: 数字人平台音色列表
   */
  async listUniversalsaasDigitalhumanVoice(request: ListUniversalsaasDigitalhumanVoiceRequest): Promise<ListUniversalsaasDigitalhumanVoiceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listUniversalsaasDigitalhumanVoiceEx(request, headers, runtime);
  }

  /**
   * Description: 数字人平台音色列表
   * Summary: 数字人平台音色列表
   */
  async listUniversalsaasDigitalhumanVoiceEx(request: ListUniversalsaasDigitalhumanVoiceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListUniversalsaasDigitalhumanVoiceResponse> {
    Util.validateModel(request);
    return $tea.cast<ListUniversalsaasDigitalhumanVoiceResponse>(await this.doRequest("1.0", "universalsaas.digitalhuman.voice.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListUniversalsaasDigitalhumanVoiceResponse({}));
  }

  /**
   * Description: 数字人平台音色试听接口
   * Summary: 数字人平台音色试听接口
   */
  async previewUniversalsaasDigitalhumanVoice(request: PreviewUniversalsaasDigitalhumanVoiceRequest): Promise<PreviewUniversalsaasDigitalhumanVoiceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.previewUniversalsaasDigitalhumanVoiceEx(request, headers, runtime);
  }

  /**
   * Description: 数字人平台音色试听接口
   * Summary: 数字人平台音色试听接口
   */
  async previewUniversalsaasDigitalhumanVoiceEx(request: PreviewUniversalsaasDigitalhumanVoiceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PreviewUniversalsaasDigitalhumanVoiceResponse> {
    Util.validateModel(request);
    return $tea.cast<PreviewUniversalsaasDigitalhumanVoiceResponse>(await this.doRequest("1.0", "universalsaas.digitalhuman.voice.preview", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PreviewUniversalsaasDigitalhumanVoiceResponse({}));
  }

  /**
   * Description: 数字人平台角色创建与更新接口
   * Summary: 数字人平台角色创建与更新接口
   */
  async updateUniversalsaasDigitalhumanHuman(request: UpdateUniversalsaasDigitalhumanHumanRequest): Promise<UpdateUniversalsaasDigitalhumanHumanResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateUniversalsaasDigitalhumanHumanEx(request, headers, runtime);
  }

  /**
   * Description: 数字人平台角色创建与更新接口
   * Summary: 数字人平台角色创建与更新接口
   */
  async updateUniversalsaasDigitalhumanHumanEx(request: UpdateUniversalsaasDigitalhumanHumanRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateUniversalsaasDigitalhumanHumanResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateUniversalsaasDigitalhumanHumanResponse>(await this.doRequest("1.0", "universalsaas.digitalhuman.human.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateUniversalsaasDigitalhumanHumanResponse({}));
  }

  /**
   * Description: 删除数字人角色接口
   * Summary: 删除数字人角色接口
   */
  async deleteUniversalsaasDigitalhumanHuman(request: DeleteUniversalsaasDigitalhumanHumanRequest): Promise<DeleteUniversalsaasDigitalhumanHumanResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteUniversalsaasDigitalhumanHumanEx(request, headers, runtime);
  }

  /**
   * Description: 删除数字人角色接口
   * Summary: 删除数字人角色接口
   */
  async deleteUniversalsaasDigitalhumanHumanEx(request: DeleteUniversalsaasDigitalhumanHumanRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteUniversalsaasDigitalhumanHumanResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteUniversalsaasDigitalhumanHumanResponse>(await this.doRequest("1.0", "universalsaas.digitalhuman.human.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteUniversalsaasDigitalhumanHumanResponse({}));
  }

  /**
   * Description: 删除知识点接口
   * Summary: 删除知识点接口
   */
  async deleteUniversalsaasDigitalhumanKnowledge(request: DeleteUniversalsaasDigitalhumanKnowledgeRequest): Promise<DeleteUniversalsaasDigitalhumanKnowledgeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteUniversalsaasDigitalhumanKnowledgeEx(request, headers, runtime);
  }

  /**
   * Description: 删除知识点接口
   * Summary: 删除知识点接口
   */
  async deleteUniversalsaasDigitalhumanKnowledgeEx(request: DeleteUniversalsaasDigitalhumanKnowledgeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteUniversalsaasDigitalhumanKnowledgeResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteUniversalsaasDigitalhumanKnowledgeResponse>(await this.doRequest("1.0", "universalsaas.digitalhuman.knowledge.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteUniversalsaasDigitalhumanKnowledgeResponse({}));
  }

  /**
   * Description: 创建批量导入任务
   * Summary: 创建批量导入任务
   */
  async createUniversalsaasDigitalhumanKnowledgeImporttask(request: CreateUniversalsaasDigitalhumanKnowledgeImporttaskRequest): Promise<CreateUniversalsaasDigitalhumanKnowledgeImporttaskResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createUniversalsaasDigitalhumanKnowledgeImporttaskEx(request, headers, runtime);
  }

  /**
   * Description: 创建批量导入任务
   * Summary: 创建批量导入任务
   */
  async createUniversalsaasDigitalhumanKnowledgeImporttaskEx(request: CreateUniversalsaasDigitalhumanKnowledgeImporttaskRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateUniversalsaasDigitalhumanKnowledgeImporttaskResponse> {
    if (!Util.isUnset(request.fileObject)) {
      let uploadReq = new CreateAntcloudGatewayxFileUploadRequest({
        authToken: request.authToken,
        apiCode: "universalsaas.digitalhuman.knowledge.importtask.create",
        fileName: request.fileObjectName,
      });
      let uploadResp = await this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
      if (!AntchainUtil.isSuccess(uploadResp.resultCode, "ok")) {
        let createUniversalsaasDigitalhumanKnowledgeImporttaskResponse = new CreateUniversalsaasDigitalhumanKnowledgeImporttaskResponse({
          reqMsgId: uploadResp.reqMsgId,
          resultCode: uploadResp.resultCode,
          resultMsg: uploadResp.resultMsg,
        });
        return createUniversalsaasDigitalhumanKnowledgeImporttaskResponse;
      }

      let uploadHeaders = AntchainUtil.parseUploadHeaders(uploadResp.uploadHeaders);
      await AntchainUtil.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
      request.fileId = uploadResp.fileId;
      request.fileObject = null;
    }

    Util.validateModel(request);
    return $tea.cast<CreateUniversalsaasDigitalhumanKnowledgeImporttaskResponse>(await this.doRequest("1.0", "universalsaas.digitalhuman.knowledge.importtask.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateUniversalsaasDigitalhumanKnowledgeImporttaskResponse({}));
  }

  /**
   * Description: 查询批量导入任务
   * Summary: 查询批量导入任务
   */
  async queryUniversalsaasDigitalhumanKnowledgeImporttask(request: QueryUniversalsaasDigitalhumanKnowledgeImporttaskRequest): Promise<QueryUniversalsaasDigitalhumanKnowledgeImporttaskResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryUniversalsaasDigitalhumanKnowledgeImporttaskEx(request, headers, runtime);
  }

  /**
   * Description: 查询批量导入任务
   * Summary: 查询批量导入任务
   */
  async queryUniversalsaasDigitalhumanKnowledgeImporttaskEx(request: QueryUniversalsaasDigitalhumanKnowledgeImporttaskRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryUniversalsaasDigitalhumanKnowledgeImporttaskResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryUniversalsaasDigitalhumanKnowledgeImporttaskResponse>(await this.doRequest("1.0", "universalsaas.digitalhuman.knowledge.importtask.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryUniversalsaasDigitalhumanKnowledgeImporttaskResponse({}));
  }

  /**
   * Description: 知识点批量导出
   * Summary: 知识点批量导出
   */
  async exportUniversalsaasDigitalhumanKnowledge(request: ExportUniversalsaasDigitalhumanKnowledgeRequest): Promise<ExportUniversalsaasDigitalhumanKnowledgeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.exportUniversalsaasDigitalhumanKnowledgeEx(request, headers, runtime);
  }

  /**
   * Description: 知识点批量导出
   * Summary: 知识点批量导出
   */
  async exportUniversalsaasDigitalhumanKnowledgeEx(request: ExportUniversalsaasDigitalhumanKnowledgeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExportUniversalsaasDigitalhumanKnowledgeResponse> {
    Util.validateModel(request);
    return $tea.cast<ExportUniversalsaasDigitalhumanKnowledgeResponse>(await this.doRequest("1.0", "universalsaas.digitalhuman.knowledge.export", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExportUniversalsaasDigitalhumanKnowledgeResponse({}));
  }

  /**
   * Description: 获取实时流列表接口
   * Summary: 获取实时流列表接口
   */
  async listUniversalsaasDigitalhumanStream(request: ListUniversalsaasDigitalhumanStreamRequest): Promise<ListUniversalsaasDigitalhumanStreamResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listUniversalsaasDigitalhumanStreamEx(request, headers, runtime);
  }

  /**
   * Description: 获取实时流列表接口
   * Summary: 获取实时流列表接口
   */
  async listUniversalsaasDigitalhumanStreamEx(request: ListUniversalsaasDigitalhumanStreamRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListUniversalsaasDigitalhumanStreamResponse> {
    Util.validateModel(request);
    return $tea.cast<ListUniversalsaasDigitalhumanStreamResponse>(await this.doRequest("1.0", "universalsaas.digitalhuman.stream.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListUniversalsaasDigitalhumanStreamResponse({}));
  }

  /**
   * Description: 关闭实时流接口
   * Summary: 关闭实时流接口
   */
  async stopUniversalsaasDigitalhumanStream(request: StopUniversalsaasDigitalhumanStreamRequest): Promise<StopUniversalsaasDigitalhumanStreamResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.stopUniversalsaasDigitalhumanStreamEx(request, headers, runtime);
  }

  /**
   * Description: 关闭实时流接口
   * Summary: 关闭实时流接口
   */
  async stopUniversalsaasDigitalhumanStreamEx(request: StopUniversalsaasDigitalhumanStreamRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<StopUniversalsaasDigitalhumanStreamResponse> {
    Util.validateModel(request);
    return $tea.cast<StopUniversalsaasDigitalhumanStreamResponse>(await this.doRequest("1.0", "universalsaas.digitalhuman.stream.stop", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new StopUniversalsaasDigitalhumanStreamResponse({}));
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
