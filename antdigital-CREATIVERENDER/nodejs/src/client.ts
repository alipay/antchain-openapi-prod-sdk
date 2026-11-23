// This file is auto-generated, don't edit it
import AntchainUtil from '@antchain/alipay-util';
import Util, * as $Util from '@alicloud/tea-util';
import RPCUtil from '@alicloud/rpc-util';
import { Readable } from 'stream';
import * as $tea from '@alicloud/tea-typescript';

/**
 * @remarks
 * Model for initing client
 */
export class Config extends $tea.Model {
  /**
   * @remarks
   * accesskey id
   */
  accessKeyId?: string;
  /**
   * @remarks
   * accesskey secret
   */
  accessKeySecret?: string;
  /**
   * @remarks
   * security token
   */
  securityToken?: string;
  /**
   * @remarks
   * http protocol
   * 
   * @example
   * http
   */
  protocol?: string;
  /**
   * @remarks
   * read timeout
   * 
   * @example
   * 10
   */
  readTimeout?: number;
  /**
   * @remarks
   * connect timeout
   * 
   * @example
   * 10
   */
  connectTimeout?: number;
  /**
   * @remarks
   * http proxy
   * 
   * @example
   * http://localhost
   */
  httpProxy?: string;
  /**
   * @remarks
   * https proxy
   * 
   * @example
   * https://localhost
   */
  httpsProxy?: string;
  /**
   * @remarks
   * endpoint
   * 
   * @example
   * cs.aliyuncs.com
   */
  endpoint?: string;
  /**
   * @remarks
   * proxy white list
   * 
   * @example
   * http://localhost
   */
  noProxy?: string;
  /**
   * @remarks
   * max idle conns
   * 
   * @example
   * 3
   */
  maxIdleConns?: number;
  /**
   * @remarks
   * user agent
   * 
   * @example
   * Alibabacloud/1
   */
  userAgent?: string;
  /**
   * @remarks
   * socks5 proxy
   */
  socks5Proxy?: string;
  /**
   * @remarks
   * socks5 network
   * 
   * @example
   * TCP
   */
  socks5NetWork?: string;
  /**
   * @remarks
   * 长链接最大空闲时长
   */
  maxIdleTimeMillis?: number;
  /**
   * @remarks
   * 长链接最大连接时长
   */
  keepAliveDurationMillis?: number;
  /**
   * @remarks
   * 最大连接数（长链接最大总数）
   */
  maxRequests?: number;
  /**
   * @remarks
   * 每个目标主机的最大连接数（分主机域名的长链接最大总数
   */
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

// DataPart represents a structured blob.
export class DataPart extends $tea.Model {
  // A JSON object containing arbitrary data.
  /**
   * @example
   * data
   */
  data?: string;
  static names(): { [key: string]: string } {
    return {
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      data: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// Part represents a container for a section of communication content.
export class Part extends $tea.Model {
  // the string content of the text part.
  /**
   * @example
   * content
   */
  text?: string;
  // The structured data content.
  data?: DataPart;
  static names(): { [key: string]: string } {
    return {
      text: 'text',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      text: 'string',
      data: DataPart,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// Message is one unit of communication between client and server.
export class Message extends $tea.Model {
  // Parts is the container of the message content.
  parts?: Part[];
  // Identifies the sender of the message.
  // USER role refers to communication from the client to the server.
  // AGENT role refers to communication from the server to the client.
  /**
   * @example
   * USER
   */
  role?: string;
  // The context id of the message. This is optional and if set, the message will be associated with the given context(a specific conversation or session).
  /**
   * @example
   * contextid
   */
  contextId?: string;
  static names(): { [key: string]: string } {
    return {
      parts: 'parts',
      role: 'role',
      contextId: 'context_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      parts: { 'type': 'array', 'itemType': Part },
      role: 'string',
      contextId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 分镜信息
export class Shot extends $tea.Model {
  // 分镜编号
  /**
   * @example
   * 1
   */
  shotNumber: number;
  // 分镜时间
  /**
   * @example
   * 8
   */
  shotDuration: number;
  // 分镜详情
  /**
   * @example
   * 镜头1 [0-2s] 深夜后厨
   */
  shotDetail: string;
  static names(): { [key: string]: string } {
    return {
      shotNumber: 'shot_number',
      shotDuration: 'shot_duration',
      shotDetail: 'shot_detail',
    };
  }

  static types(): { [key: string]: any } {
    return {
      shotNumber: 'number',
      shotDuration: 'number',
      shotDetail: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 基金长图分段当前快照，包含头图和正文段图及其版本信息。
export class LongImageSegment extends $tea.Model {
  // 全局唯一的分段业务 ID。
  /**
   * @example
   * LS_xxx
   */
  segmentId?: string;
  // 分段类型：BANNER 为长图头图；CONTENT 为正文段图。
  /**
   * @example
   * BANNER
   */
  segmentType?: string;
  // 展示顺序，从 0 开始；头图固定为 0，正文从 1 开始，值越小越靠前。
  /**
   * @example
   * 0
   */
  sortNo?: number;
  // 首次生成该分段使用的原文，后续编辑或回滚不会修改。
  /**
   * @example
   * 基金投资亮点
   */
  sourceText?: string;
  // 当前分段版本 ID；仅在 current_status 为 SUCCESS 时可作为子图编辑来源。
  /**
   * @example
   * LV_xxx
   */
  currentVersionId?: string;
  // 当前版本状态：PROCESSING、SUCCESS、FAILED、CONFLICT。
  /**
   * @example
   * SUCCESS
   */
  currentStatus?: string;
  // 当前版本的图片地址。
  /**
   * @example
   * https://example.com/segment.png
   */
  currentImageUrl?: string;
  // 最近可用的成功版本 ID，可作为子图编辑来源；没有成功版本时为空。
  /**
   * @example
   * LV_xxx
   */
  lastSuccessVersionId?: string;
  // last_success_version_id 对应的图片地址；没有成功成果时为空。
  /**
   * @example
   * https://example.com/segment.png
   */
  lastSuccessImageUrl?: string;
  static names(): { [key: string]: string } {
    return {
      segmentId: 'segment_id',
      segmentType: 'segment_type',
      sortNo: 'sort_no',
      sourceText: 'source_text',
      currentVersionId: 'current_version_id',
      currentStatus: 'current_status',
      currentImageUrl: 'current_image_url',
      lastSuccessVersionId: 'last_success_version_id',
      lastSuccessImageUrl: 'last_success_image_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      segmentId: 'string',
      segmentType: 'string',
      sortNo: 'number',
      sourceText: 'string',
      currentVersionId: 'string',
      currentStatus: 'string',
      currentImageUrl: 'string',
      lastSuccessVersionId: 'string',
      lastSuccessImageUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 模版引用
export class CreativeTemplateAssetRef extends $tea.Model {
  // 与 prompt 里的 @{商品图,ref-01} 对应
  /**
   * @example
   * ref-01
   */
  entityId: string;
  // 对应列表类型：`IMAGE`、`AUDIO` 或 VIDEO
  /**
   * @example
   * IMAGE
   */
  materialType: string;
  // 来源类型：`MATERIAL`、`AFTS`、`OSS` 或 URL
  /**
   * @example
   * MATERIAL
   */
  sourceType: string;
  // 来源定位值；`sourceType=MATERIAL` 时填平台素材 ID
  /**
   * @example
   * material-image-demo-001
   */
  path: string;
  // 用途提示，可省略
  /**
   * @example
   * 参考商品外观
   */
  usageHint?: string;
  static names(): { [key: string]: string } {
    return {
      entityId: 'entity_id',
      materialType: 'material_type',
      sourceType: 'source_type',
      path: 'path',
      usageHint: 'usage_hint',
    };
  }

  static types(): { [key: string]: any } {
    return {
      entityId: 'string',
      materialType: 'string',
      sourceType: 'string',
      path: 'string',
      usageHint: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// Artifacts represent task outputs.
export class Artifact extends $tea.Model {
  // The content of the artifact. Must contain at least one part.
  parts?: Part[];
  static names(): { [key: string]: string } {
    return {
      parts: 'parts',
    };
  }

  static types(): { [key: string]: any } {
    return {
      parts: { 'type': 'array', 'itemType': Part },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// A container for the status of a task
export class TaskStatus extends $tea.Model {
  // The current state of this task.
  /**
   * @example
   * TASK_STATE_COMPLETED
   */
  state: string;
  // A message associated with the status.
  message: Message;
  static names(): { [key: string]: string } {
    return {
      state: 'state',
      message: 'message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      state: 'string',
      message: Message,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 分镜
export class Storyboard extends $tea.Model {
  // 分镜id集合
  /**
   * @example
   * ["shot-001"]
   */
  shotIds: string[];
  // 分镜集合
  /**
   * @example
   * undefined
   */
  shots: Shot[];
  static names(): { [key: string]: string } {
    return {
      shotIds: 'shot_ids',
      shots: 'shots',
    };
  }

  static types(): { [key: string]: any } {
    return {
      shotIds: { 'type': 'array', 'itemType': 'string' },
      shots: { 'type': 'array', 'itemType': Shot },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 素材模版数据
export class MaterialTemplateData extends $tea.Model {
  // prompt
  /**
   * @example
   * 参考 @{商品图,ref-01}，先拍全景，再切近景
   */
  prompt: string;
  // 生图模型id
  /**
   * @example
   * image-model-demo
   */
  imageModelId?: string;
  // 生视频模型id
  /**
   * @example
   * video-model-demo
   */
  videoModelId?: string;
  // 参考图片列表
  /**
   * @example
   * undefined
   */
  imageRefs?: CreativeTemplateAssetRef[];
  // 参考音频列表
  /**
   * @example
   * undefined
   */
  voiceRefs?: CreativeTemplateAssetRef[];
  // 参考视频列表
  /**
   * @example
   * undefined
   */
  videoRefs?: CreativeTemplateAssetRef[];
  static names(): { [key: string]: string } {
    return {
      prompt: 'prompt',
      imageModelId: 'image_model_id',
      videoModelId: 'video_model_id',
      imageRefs: 'image_refs',
      voiceRefs: 'voice_refs',
      videoRefs: 'video_refs',
    };
  }

  static types(): { [key: string]: any } {
    return {
      prompt: 'string',
      imageModelId: 'string',
      videoModelId: 'string',
      imageRefs: { 'type': 'array', 'itemType': CreativeTemplateAssetRef },
      voiceRefs: { 'type': 'array', 'itemType': CreativeTemplateAssetRef },
      videoRefs: { 'type': 'array', 'itemType': CreativeTemplateAssetRef },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 参考样式素材引用
export class CreativeAssetRef extends $tea.Model {
  // 素材来源
  /**
   * @example
   * URL
   */
  sourceType: string;
  // 素材ID，只有素材来源于creative的素材库中才需要填入
  /**
   * @example
   * 5bf62f7dd73b4efa8dea7a2665cd2173
   */
  materialId?: string;
  // 可公网访问的素材url地址
  /**
   * @example
   * https://mdn.alipayobjects.com/wofi_creative/afts/file/80mwSruGUE4AAAAAAAAAAAAA-FZ4AQJr
   */
  url?: string;
  // 使用提示
  /**
   * @example
   * 二维码保持清晰
   */
  usageHint?: string;
  static names(): { [key: string]: string } {
    return {
      sourceType: 'source_type',
      materialId: 'material_id',
      url: 'url',
      usageHint: 'usage_hint',
    };
  }

  static types(): { [key: string]: any } {
    return {
      sourceType: 'string',
      materialId: 'string',
      url: 'string',
      usageHint: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 视频输出结果
export class VideoOutput extends $tea.Model {
  // 产物类型
  /**
   * @example
   * video
   */
  type?: string;
  // 可下载的视频地址
  /**
   * @example
   * https://example.com/result.mp4
   */
  url?: string;
  // 产物 ID
  /**
   * @example
   * video-001
   */
  id?: string;
  // 实际视频时长，单位秒
  /**
   * @example
   * 15
   */
  duration?: number;
  // URL 过期时间，毫秒时间戳；能确定时返回
  /**
   * @example
   * 1790000000000
   */
  expireTime?: number;
  static names(): { [key: string]: string } {
    return {
      type: 'type',
      url: 'url',
      id: 'id',
      duration: 'duration',
      expireTime: 'expire_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      type: 'string',
      url: 'string',
      id: 'string',
      duration: 'number',
      expireTime: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// ASSISTANT 消息特有信息
export class AssistantExtra extends $tea.Model {
  // 任务id
  /**
   * @example
   * M_d3f7859e845a4ed58bedc446fec32427
   */
  taskId?: string;
  // 生图状态
  /**
   * @example
   * PROCESSING
   */
  renderStatus?: string;
  // 生图结果
  /**
   * @example
   * undefined
   */
  resultUrl?: string[];
  // 基金长图子图列表，仅在 return_sub_images 为 true 且长图生成完成时返回。
  /**
   * @example
   * undefined
   */
  subImages?: LongImageSegment[];
  static names(): { [key: string]: string } {
    return {
      taskId: 'task_id',
      renderStatus: 'render_status',
      resultUrl: 'result_url',
      subImages: 'sub_images',
    };
  }

  static types(): { [key: string]: any } {
    return {
      taskId: 'string',
      renderStatus: 'string',
      resultUrl: { 'type': 'array', 'itemType': 'string' },
      subImages: { 'type': 'array', 'itemType': LongImageSegment },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 视频多模态参考素材。source_type 支持 MATERIAL/AFTS/URL；URL 时 path 为外部可访问地址。entity_id 与 prompt 中 @{名称,entityId} 绑定。
export class CreativeVideoAssetRef extends $tea.Model {
  // prompt 中 @{名称,entityId} 对应的实体 ID；同一实体可跨图片、音频、视频复用。
  /**
   * @example
   * e-44b6e1086a08
   */
  entityId: string;
  // 素材类型：IMAGE、AUDIO、VIDEO。
  /**
   * @example
   * VIDEO
   */
  materialType: string;
  // 素材来源：MATERIAL（素材库）、AFTS（本地上传）、URL（外部可访问地址）。OpenAPI 支持 URL，与 input_elements 一致；后端需解析/转存后再交算法。
  /**
   * @example
   * URL
   */
  sourceType: string;
  // 由 source_type 决定：MATERIAL 传 materialId；AFTS 传 /creative/file/upload 返回的 fileId；URL 传外部可访问的绝对 http/https URL。
  /**
   * @example
   * https://example.com/ref.mp4
   */
  path: string;
  // 前端展示名称，不作为生成校验依据。
  /**
   * @example
   * 小王
   */
  name?: string;
  // 文件大小快照，单位字节；AFTS 来源必填，由前端传入。
  /**
   * @example
   * 1048576
   */
  sizeBytes?: number;
  // 音视频时长快照，单位秒；AFTS 音频、视频必填。
  /**
   * @example
   * 5.06
   */
  durationSeconds?: number;
  // 视频缩略图 AFTS 文件 ID，可由 /creative/file/upload 返回的 fileId 提供。
  /**
   * @example
   * thumb-file-id
   */
  thumbnailFileId?: string;
  static names(): { [key: string]: string } {
    return {
      entityId: 'entity_id',
      materialType: 'material_type',
      sourceType: 'source_type',
      path: 'path',
      name: 'name',
      sizeBytes: 'size_bytes',
      durationSeconds: 'duration_seconds',
      thumbnailFileId: 'thumbnail_file_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      entityId: 'string',
      materialType: 'string',
      sourceType: 'string',
      path: 'string',
      name: 'string',
      sizeBytes: 'number',
      durationSeconds: 'number',
      thumbnailFileId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// map结构体
export class MapStruct extends $tea.Model {
  // 生图数量
  /**
   * @example
   * generationCount
   */
  key: string;
  // key对应的值
  /**
   * @example
   * 1
   */
  value: string;
  static names(): { [key: string]: string } {
    return {
      key: 'key',
      value: 'value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      key: 'string',
      value: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 素材
export class CreativeMaterial extends $tea.Model {
  // Creative 行业产品代码：FUND / RETAIL，查询时缺省为 RETAIL
  /**
   * @example
   * RETAIL
   */
  productCode?: string;
  // 素材ID
  /**
   * @example
   * d55ad74641ce8895ad1321e8b36c4d70
   */
  materialId?: string;
  // 素材类型，如 IMAGE / ANIMATION / FONT
  /**
   * @example
   * IMAGE
   */
  materialType?: string;
  // 素材形式（SINGLE/PACKAGE）
  /**
   * @example
   * SINGLE
   */
  materialForm?: string;
  // 父素材ID
  /**
   * @example
   * c96a7673a96a4178809f6c0f4da40558
   */
  parentMaterialId?: string;
  // 是否为封面
  /**
   * @example
   * false
   */
  cover?: boolean;
  // 素材名称
  /**
   * @example
   * 海报
   */
  name?: string;
  // 素材文件URL
  /**
   * @example
   * creative/20260909/sample.jpg
   */
  fileUrl?: string;
  // 宽度（像素）
  /**
   * @example
   * 1080
   */
  width?: number;
  // 高度（像素）
  /**
   * @example
   * 1920
   */
  height?: number;
  // 字体族名（仅 FONT 类型）
  /**
   * @example
   * DEMO_FONT
   */
  fontFamily?: string;
  // 使用场景
  /**
   * @example
   * BANNER
   */
  scene?: string;
  // 素材用途：REFERENCE_STYLE=参考样式，INPUT_ELEMENT=输入元素
  /**
   * @example
   * REFERENCE_STYLE
   */
  materialUsage?: string;
  // RETAIL
  /**
   * @example
   * 行业
   */
  industry?: string;
  // 投放平台，多个值使用英文逗号分隔
  /**
   * @example
   * ALIPAY
   */
  publishPlatforms?: string;
  // 尺寸类型（16:9、9:16、1:1、4:3、3:4、OTHER）
  /**
   * @example
   * 9:16
   */
  materialSizeType?: string;
  // 空间类型：PERSONAL / ENTERPRISE
  /**
   * @example
   * ENTERPRISE
   */
  spaceType?: string;
  // 所有者名称
  /**
   * @example
   * name
   */
  ownerName?: string;
  // 创建时间，格式 yyyy-MM-dd HH:mm:ss
  /**
   * @example
   * 2026-09-21 12:00:00
   */
  gmtCreate?: string;
  static names(): { [key: string]: string } {
    return {
      productCode: 'product_code',
      materialId: 'material_id',
      materialType: 'material_type',
      materialForm: 'material_form',
      parentMaterialId: 'parent_material_id',
      cover: 'cover',
      name: 'name',
      fileUrl: 'file_url',
      width: 'width',
      height: 'height',
      fontFamily: 'font_family',
      scene: 'scene',
      materialUsage: 'material_usage',
      industry: 'industry',
      publishPlatforms: 'publish_platforms',
      materialSizeType: 'material_size_type',
      spaceType: 'space_type',
      ownerName: 'owner_name',
      gmtCreate: 'gmt_create',
    };
  }

  static types(): { [key: string]: any } {
    return {
      productCode: 'string',
      materialId: 'string',
      materialType: 'string',
      materialForm: 'string',
      parentMaterialId: 'string',
      cover: 'boolean',
      name: 'string',
      fileUrl: 'string',
      width: 'number',
      height: 'number',
      fontFamily: 'string',
      scene: 'string',
      materialUsage: 'string',
      industry: 'string',
      publishPlatforms: 'string',
      materialSizeType: 'string',
      spaceType: 'string',
      ownerName: 'string',
      gmtCreate: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// Task is the core unit of action for A2A. It has a current status and when results are created for the task they are stored in the artifact.
export class Task extends $tea.Model {
  // Unique identifier (e.g. UUID) for the task, generated by the server for a new task.
  /**
   * @example
   * 6c7a3d8f9e544c5ab3e17f2a1b9c4e8d
   */
  id: string;
  // Unique identifier (e.g. UUID) for the contextual collection of interactions (tasks and messages). Created by the A2A server.
  /**
   * @example
   * contextid
   */
  contextId?: string;
  // The current status of a Task, including state and a message.
  status: TaskStatus;
  // A set of output artifacts for a Task.
  artifacts: Artifact[];
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      contextId: 'context_id',
      status: 'status',
      artifacts: 'artifacts',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      contextId: 'string',
      status: TaskStatus,
      artifacts: { 'type': 'array', 'itemType': Artifact },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 键值对
export class XNameValuePair extends $tea.Model {
  // 键名
  /**
   * @example
   * key
   */
  name: string;
  // 键值
  /**
   * @example
   * value
   */
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

export class ExecAntcloudMarketingagentChatCreativeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 会话ID，如需支持多轮对话，需要传入之前的会话ID
  sessionId?: string;
  // 服务类型（默认IMAGE_RENDER）
  entryType?: string;
  // 表达用户意图
  prompt: string;
  // 参考样式
  referenceStyle?: CreativeAssetRef;
  // 输入元素
  inputElements?: CreativeAssetRef[];
  // 使用场景
  scene?: string;
  // 生图宽度
  width?: number;
  // 生图高度
  height?: number;
  // 扩展参数
  extraParams?: MapStruct[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      sessionId: 'session_id',
      entryType: 'entry_type',
      prompt: 'prompt',
      referenceStyle: 'reference_style',
      inputElements: 'input_elements',
      scene: 'scene',
      width: 'width',
      height: 'height',
      extraParams: 'extra_params',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      sessionId: 'string',
      entryType: 'string',
      prompt: 'string',
      referenceStyle: CreativeAssetRef,
      inputElements: { 'type': 'array', 'itemType': CreativeAssetRef },
      scene: 'string',
      width: 'number',
      height: 'number',
      extraParams: { 'type': 'array', 'itemType': MapStruct },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecAntcloudMarketingagentChatCreativeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 消息ID
  messageId?: string;
  // 所属会话ID
  sessionId?: string;
  // 消息角色
  role?: string;
  // 消息状态
  status?: string;
  // 消息内容
  content?: string;
  // ASSISTANT消息的额外信息
  assistantExtra?: AssistantExtra;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      messageId: 'message_id',
      sessionId: 'session_id',
      role: 'role',
      status: 'status',
      content: 'content',
      assistantExtra: 'assistant_extra',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      messageId: 'string',
      sessionId: 'string',
      role: 'string',
      status: 'string',
      content: 'string',
      assistantExtra: AssistantExtra,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecAntcloudMarketingagentCreativeChatRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 会话ID，如需支持多轮对话，需要传入之前的会话ID
  sessionId?: string;
  // 服务类型（默认IMAGE_RENDER）
  entryType?: string;
  // 表达用户意图
  prompt: string;
  // 参考样式
  referenceStyle?: CreativeAssetRef;
  // 输入元素
  inputElements?: AssistantExtra[];
  // 使用场景
  scene?: string;
  // 生图宽度
  width?: number;
  // 生图高度
  height?: number;
  // 额外参数
  extraParams?: MapStruct[];
  // 产品码
  productCode?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      sessionId: 'session_id',
      entryType: 'entry_type',
      prompt: 'prompt',
      referenceStyle: 'reference_style',
      inputElements: 'input_elements',
      scene: 'scene',
      width: 'width',
      height: 'height',
      extraParams: 'extra_params',
      productCode: 'product_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      sessionId: 'string',
      entryType: 'string',
      prompt: 'string',
      referenceStyle: CreativeAssetRef,
      inputElements: { 'type': 'array', 'itemType': AssistantExtra },
      scene: 'string',
      width: 'number',
      height: 'number',
      extraParams: { 'type': 'array', 'itemType': MapStruct },
      productCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecAntcloudMarketingagentCreativeChatResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 消息ID
  messageId?: string;
  // 所属会话ID
  sessionId?: string;
  // 消息角色
  role?: string;
  // 消息状态
  status?: string;
  // 消息内容
  content?: string;
  // ASSISTANT消息的额外信息
  assistantExtra?: AssistantExtra;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      messageId: 'message_id',
      sessionId: 'session_id',
      role: 'role',
      status: 'status',
      content: 'content',
      assistantExtra: 'assistant_extra',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      messageId: 'string',
      sessionId: 'string',
      role: 'string',
      status: 'string',
      content: 'string',
      assistantExtra: AssistantExtra,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntcloudMarketingagentCreativeResultRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 消息ID
  messageId: string;
  // 是否返回基金长图的子图列表，默认 false。为 true 时，在长图生成完成后返回 assistant_extra.sub_images；不影响长图生成流程。
  returnSubImages?: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      messageId: 'message_id',
      returnSubImages: 'return_sub_images',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      messageId: 'string',
      returnSubImages: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntcloudMarketingagentCreativeResultResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 会话ID
  sessionId?: string;
  // 消息ID
  messageId?: string;
  // 消息状态
  status?: string;
  // 消息内容
  content?: string;
  // agent消息扩展信息
  assistantExtra?: AssistantExtra;
  // 当前会话的 Credit 计费总数
  totalCredit?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      sessionId: 'session_id',
      messageId: 'message_id',
      status: 'status',
      content: 'content',
      assistantExtra: 'assistant_extra',
      totalCredit: 'total_credit',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      sessionId: 'string',
      messageId: 'string',
      status: 'string',
      content: 'string',
      assistantExtra: AssistantExtra,
      totalCredit: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntcloudMarketingagentTaskCreditRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 从问数接口返回trace_id值
  traceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      traceId: 'trace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      traceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntcloudMarketingagentTaskCreditResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // credit消耗
  credits?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      credits: 'credits',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      credits: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntcloudMarketingagentCreativeMaterialRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 页码，从1开始
  pageNum?: number;
  // 每页条数
  pageSize?: number;
  // Creative 行业产品代码：FUND / RETAIL，查询时缺省为 RETAIL
  productCode?: string;
  // 空间类型：PERSONAL / ENTERPRISE
  spaceType?: string;
  // 素材类型，如 IMAGE / ANIMATION / FONT
  materialType?: string;
  // 使用场景
  scene?: string;
  // 素材用途：REFERENCE_STYLE=参考样式，INPUT_ELEMENT=输入元素
  materialUsage?: string;
  // 行业
  industry?: string;
  // 投放平台，支持多选，多个值使用英文逗号分隔
  publishPlatforms?: string;
  // 尺寸类型（16:9、9:16、1:1、4:3、3:4、OTHER）
  materialSizeType?: string;
  // 搜索关键词
  keyword?: string;
  // 是否平铺展示（true 时展开素材包子素材，不返回素材包父记录）
  flatten?: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      pageNum: 'page_num',
      pageSize: 'page_size',
      productCode: 'product_code',
      spaceType: 'space_type',
      materialType: 'material_type',
      scene: 'scene',
      materialUsage: 'material_usage',
      industry: 'industry',
      publishPlatforms: 'publish_platforms',
      materialSizeType: 'material_size_type',
      keyword: 'keyword',
      flatten: 'flatten',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      pageNum: 'number',
      pageSize: 'number',
      productCode: 'string',
      spaceType: 'string',
      materialType: 'string',
      scene: 'string',
      materialUsage: 'string',
      industry: 'string',
      publishPlatforms: 'string',
      materialSizeType: 'string',
      keyword: 'string',
      flatten: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntcloudMarketingagentCreativeMaterialResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 总记录数
  totalCount?: number;
  // 当前页码
  pageNum?: number;
  // 每页条数
  pageSize?: number;
  // 总页数
  pageCount?: number;
  // 当前页素材列表
  materials?: CreativeMaterial[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      totalCount: 'total_count',
      pageNum: 'page_num',
      pageSize: 'page_size',
      pageCount: 'page_count',
      materials: 'materials',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      totalCount: 'number',
      pageNum: 'number',
      pageSize: 'number',
      pageCount: 'number',
      materials: { 'type': 'array', 'itemType': CreativeMaterial },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecAntcloudMarketingagentCreativeVideoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 视频描述，文生视频、图生视频均不能为空
  prompt: string;
  // 参考图片，最多 5 张；不传或空数组表示文生视频
  inputElements?: CreativeAssetRef[];
  // 模型标识，不传使用服务端默认模型；可用值需与上游确认
  model?: string;
  // STORE_VISIT_VIDEO：探店视频；PRODUCT_PROMOTION_VIDEO：带货视频
  scene?: string;
  // 支持 9:16、1:1、16:9、4:3、3:4，默认 9:16
  ratio?: string;
  // 视频时长，单位秒，4～30 的整数，默认 15
  duration?: number;
  // 分辨率，支持 480、720、1080，默认 720
  resolution?: number;
  // 是否生成音频，默认 true
  generateAudio?: boolean;
  // 是否扩写脚本，默认true
  expandScript?: boolean;
  // 是否生成字幕，默认 true
  generateSubtitle?: boolean;
  // 统一多模态参考素材；entity_id 与 prompt 中 @{名称,entityId} 对应。source_type 支持 MATERIAL、AFTS、URL；URL 时 path 传外部可访问的绝对 URL，与 input_elements 的外部 URL 用法一致。后端需校验 URL 并解析/转存供算法访问。与 input_elements 不可同时非空；支持图片、音频、视频及跨模态实体绑定。纯音频输入不支持，音频+视频可用。
  mediaRefs?: CreativeVideoAssetRef[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      prompt: 'prompt',
      inputElements: 'input_elements',
      model: 'model',
      scene: 'scene',
      ratio: 'ratio',
      duration: 'duration',
      resolution: 'resolution',
      generateAudio: 'generate_audio',
      expandScript: 'expand_script',
      generateSubtitle: 'generate_subtitle',
      mediaRefs: 'media_refs',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      prompt: 'string',
      inputElements: { 'type': 'array', 'itemType': CreativeAssetRef },
      model: 'string',
      scene: 'string',
      ratio: 'string',
      duration: 'number',
      resolution: 'number',
      generateAudio: 'boolean',
      expandScript: 'boolean',
      generateSubtitle: 'boolean',
      mediaRefs: { 'type': 'array', 'itemType': CreativeVideoAssetRef },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecAntcloudMarketingagentCreativeVideoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 本服务分配的稳定任务 ID，用于查询
  taskId?: string;
  // 视频任务状态
  status?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      taskId: 'task_id',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      taskId: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntcloudMarketingagentCreativeVideoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 创建接口返回的任务 ID
  taskId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      taskId: 'task_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      taskId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntcloudMarketingagentCreativeVideoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 视频任务 ID
  taskId?: string;
  // PENDING、PROCESSING、COMPLETED、FAILED
  status?: string;
  // 视频产物列表
  outputs?: VideoOutput[];
  // 扩写后的脚本，上游提供时返回
  script?: string;
  // 视频耗费credits
  credits?: string;
  // 任务失败原因
  errorMessage?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      taskId: 'task_id',
      status: 'status',
      outputs: 'outputs',
      script: 'script',
      credits: 'credits',
      errorMessage: 'error_message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      taskId: 'string',
      status: 'string',
      outputs: { 'type': 'array', 'itemType': VideoOutput },
      script: 'string',
      credits: 'string',
      errorMessage: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecAntcloudMarketingagentCreativeImageeditRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 产品代码，当前仅支持 FUND（基金）。
  productCode: string;
  // 来源子图成功版本 ID，必须属于当前调用用户及租户；可使用子图列表中的成功版本或上一轮编辑成功返回的新版本。
  segmentVersionId: string;
  // 本轮图片修改要求，不能为空。源图和输出宽高由服务端根据来源版本解析。
  prompt: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productCode: 'product_code',
      segmentVersionId: 'segment_version_id',
      prompt: 'prompt',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productCode: 'string',
      segmentVersionId: 'string',
      prompt: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecAntcloudMarketingagentCreativeImageeditResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 本次子图编辑任务的独立消息 ID，用于调用子图编辑查询接口获取进度和结果。
  messageId?: string;
  // 本次编辑新建的版本 ID。任务提交成功不代表图片生成成功；查询确认成功后可作为下一轮修改来源。
  segmentVersionId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      messageId: 'message_id',
      segmentVersionId: 'segment_version_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      messageId: 'string',
      segmentVersionId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntcloudMarketingagentCreativeImageeditRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 子图编辑接口返回的独立消息 ID，必须属于当前调用用户及租户。
  messageId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      messageId: 'message_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      messageId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntcloudMarketingagentCreativeImageeditResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 本次子图编辑任务的独立消息 ID。
  messageId?: string;
  // 本次编辑生成的新版本 ID，任务成功后可作为下一轮编辑的来源版本。
  segmentVersionId?: string;
  // 任务状态：PROCESSING（处理中）、COMPLETED（成功）、FAILED（失败）。查询接口调用成功不代表任务生成成功。
  status?: string;
  // 编辑成功后的图片地址，仅在 status 为 COMPLETED 时返回。
  resultUrl?: string;
  // 编辑失败原因，在 status 为 FAILED 时返回。
  failReason?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      messageId: 'message_id',
      segmentVersionId: 'segment_version_id',
      status: 'status',
      resultUrl: 'result_url',
      failReason: 'fail_reason',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      messageId: 'string',
      segmentVersionId: 'string',
      status: 'string',
      resultUrl: 'string',
      failReason: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecAntcloudMarketingagentFileUploadRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // string
  /**
   * @remarks
   * 待上传文件
   */
  fileObject?: Readable;
  /**
   * @remarks
   * 待上传文件名
   */
  fileObjectName?: string;
  fileId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      fileObject: 'fileObject',
      fileObjectName: 'fileObjectName',
      fileId: 'file_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      fileObject: 'Readable',
      fileObjectName: 'string',
      fileId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecAntcloudMarketingagentFileUploadResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 上传后的 AFTS 文件 ID
  fileId?: string;
  // OSS 对象路径
  ossFilePath?: string;
  // 图片访问地址，可用于视频生成 input_elements[].url
  accessUrl?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      fileId: 'file_id',
      ossFilePath: 'oss_file_path',
      accessUrl: 'access_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      fileId: 'string',
      ossFilePath: 'string',
      accessUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecAntcloudMarketingagentCreativeScriptRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 待扩写的原始脚本或简要描述，复用现有文生视频的脚本扩写逻辑
  prompt: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      prompt: 'prompt',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      prompt: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecAntcloudMarketingagentCreativeScriptResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 脚本扩写任务标识，用于查询扩写任务
  taskId?: string;
  // 脚本扩写任务状态，沿用现有任务状态体系
  status?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      taskId: 'task_id',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      taskId: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntcloudMarketingagentCreativeScriptRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 发起脚本扩写接口返回的任务标识
  taskId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      taskId: 'task_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      taskId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntcloudMarketingagentCreativeScriptResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 脚本扩写任务标识，用于查询扩写任务
  taskId?: string;
  // 脚本扩写任务状态，沿用现有任务状态体系
  status?: string;
  // 扩写后的脚本文本，任务成功时返回
  expandedScript?: string;
  // 脚本扩写任务失败码，失败时返回
  errorCode?: string;
  // 脚本扩写任务失败原因，失败时返回
  errorMessage?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      taskId: 'task_id',
      status: 'status',
      expandedScript: 'expanded_script',
      errorCode: 'error_code',
      errorMessage: 'error_message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      taskId: 'string',
      status: 'string',
      expandedScript: 'string',
      errorCode: 'string',
      errorMessage: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecAntcloudMarketingagentCreativeScriptexpandRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 待扩写的原始脚本或简要描述
  prompt: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      prompt: 'prompt',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      prompt: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecAntcloudMarketingagentCreativeScriptexpandResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 脚本扩写任务标识，用于查询
  taskId?: string;
  // 脚本扩写任务状态，沿用现有任务状态体系
  status?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      taskId: 'task_id',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      taskId: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntcloudMarketingagentCreativeScriptexpandRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 发起脚本扩写接口返回的任务标识
  taskId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      taskId: 'task_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      taskId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntcloudMarketingagentCreativeScriptexpandResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 脚本扩写任务标识，用于查询
  taskId?: string;
  // 脚本扩写任务状态
  status?: string;
  // 扩写后的脚本文本，成功时返回
  expandedScript?: string;
  // 任务失败码，失败时返回
  errorCode?: string;
  // 任务失败原因，失败时返回
  errorMessage?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      taskId: 'task_id',
      status: 'status',
      expandedScript: 'expanded_script',
      errorCode: 'error_code',
      errorMessage: 'error_message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      taskId: 'string',
      status: 'string',
      expandedScript: 'string',
      errorCode: 'string',
      errorMessage: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntcloudMarketingagentCreativeTemplateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 模板素材ID，对应creative_material.material_id；仅支持当前租户有权访问的图片或视频参考模板
  templateId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      templateId: 'template_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      templateId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntcloudMarketingagentCreativeTemplateResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 模板提示词，前端可据此回填生成输入
  templatePrompt?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      templatePrompt: 'template_prompt',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      templatePrompt: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecAntcloudMarketingagentCreativeStoryboardRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // string
  /**
   * @remarks
   * 待上传文件
   */
  fileObject?: Readable;
  /**
   * @remarks
   * 待上传文件名
   */
  fileObjectName?: string;
  fileId: string;
  // 拆解要求
  prompt: string;
  // 模型
  videoModel?: string;
  // 画幅
  ratio?: string;
  // 分辨率
  resolution?: number;
  // 原视频+替换图片
  mediaRefs: CreativeAssetRef;
  // 会话ID
  sessionId?: string;
  // 画布ID
  canvasId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      fileObject: 'fileObject',
      fileObjectName: 'fileObjectName',
      fileId: 'file_id',
      prompt: 'prompt',
      videoModel: 'video_model',
      ratio: 'ratio',
      resolution: 'resolution',
      mediaRefs: 'media_refs',
      sessionId: 'session_id',
      canvasId: 'canvas_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      fileObject: 'Readable',
      fileObjectName: 'string',
      fileId: 'string',
      prompt: 'string',
      videoModel: 'string',
      ratio: 'string',
      resolution: 'number',
      mediaRefs: CreativeAssetRef,
      sessionId: 'string',
      canvasId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecAntcloudMarketingagentCreativeStoryboardResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 拆解任务ID
  taskId?: string;
  // 会话ID，需要回传
  sessionId?: string;
  // PROCESSING受理成功/FAILED参数被拒
  status?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      taskId: 'task_id',
      sessionId: 'session_id',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      taskId: 'string',
      sessionId: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntcloudMarketingagentCreativeStoryboardRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // string
  /**
   * @remarks
   * 待上传文件
   */
  fileObject?: Readable;
  /**
   * @remarks
   * 待上传文件名
   */
  fileObjectName?: string;
  fileId: string;
  // 拆解任务id
  taskId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      fileObject: 'fileObject',
      fileObjectName: 'fileObjectName',
      fileId: 'file_id',
      taskId: 'task_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      fileObject: 'Readable',
      fileObjectName: 'string',
      fileId: 'string',
      taskId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntcloudMarketingagentCreativeStoryboardResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 任务id回显
  taskId?: string;
  // PROCESSING/COMPLETED/FAILED
  status?: string;
  // 剧集id
  episodeId?: string;
  // 拆解详情
  analysisDetail?: string;
  // 原片分镜
  originalStoryboards?: string;
  // 新分镜脚本
  newStoryboardScript?: string;
  // 本阶段费用
  currentCredit?: number;
  // COMPLETE / PENDING / MISSING_USAGE / INVALID_USAGE / NOT_BILLABLE
  creditStatus?: string;
  // 终态任务耗时（秒）
  taskDurationSeconds?: number;
  // FAILED 时返回的失败原因（脱敏文案）
  errorMessage?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      taskId: 'task_id',
      status: 'status',
      episodeId: 'episode_id',
      analysisDetail: 'analysis_detail',
      originalStoryboards: 'original_storyboards',
      newStoryboardScript: 'new_storyboard_script',
      currentCredit: 'current_credit',
      creditStatus: 'credit_status',
      taskDurationSeconds: 'task_duration_seconds',
      errorMessage: 'error_message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      taskId: 'string',
      status: 'string',
      episodeId: 'string',
      analysisDetail: 'string',
      originalStoryboards: 'string',
      newStoryboardScript: 'string',
      currentCredit: 'number',
      creditStatus: 'string',
      taskDurationSeconds: 'number',
      errorMessage: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecAntcloudMarketingagentCreativeRemakeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // string
  /**
   * @remarks
   * 待上传文件
   */
  fileObject?: Readable;
  /**
   * @remarks
   * 待上传文件名
   */
  fileObjectName?: string;
  fileId: string;
  // 阶段一 task_id（= 阶段一 messageId），后端据此反查阶段一全部快照
  storyboardMessageId: string;
  // 用户编辑后的新分镜脚本（纯字符串）；
  newStoryboardScript: string;
  // 拆解返回的会话id
  sessionId: string;
  // 画布id
  canvasId?: string;
  // 本轮 USER 消息展示文案
  prompt?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      fileObject: 'fileObject',
      fileObjectName: 'fileObjectName',
      fileId: 'file_id',
      storyboardMessageId: 'storyboard_message_id',
      newStoryboardScript: 'new_storyboard_script',
      sessionId: 'session_id',
      canvasId: 'canvas_id',
      prompt: 'prompt',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      fileObject: 'Readable',
      fileObjectName: 'string',
      fileId: 'string',
      storyboardMessageId: 'string',
      newStoryboardScript: 'string',
      sessionId: 'string',
      canvasId: 'string',
      prompt: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecAntcloudMarketingagentCreativeRemakeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 生视频任务id（内部 messageId
  taskId?: string;
  // PROCESSING / FAILED
  status?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      taskId: 'task_id',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      taskId: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntcloudMarketingagentCreativeRemakeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // string
  /**
   * @remarks
   * 待上传文件
   */
  fileObject?: Readable;
  /**
   * @remarks
   * 待上传文件名
   */
  fileObjectName?: string;
  fileId: string;
  // 生视频返回的task_id回传
  taskId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      fileObject: 'fileObject',
      fileObjectName: 'fileObjectName',
      fileId: 'file_id',
      taskId: 'task_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      fileObject: 'Readable',
      fileObjectName: 'string',
      fileId: 'string',
      taskId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntcloudMarketingagentCreativeRemakeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 任务id回显
  taskId?: string;
  // PROCESSING / COMPLETED / FAILED
  status?: string;
  // 视频产物列表，COMPLETED 时返回非空列表。
  outputs?: VideoOutput;
  // 本阶段视频费用
  currentCredit?: number;
  // COMPLETE / PENDING / MISSING_USAGE / INVALID_USAGE / NOT_BILLABLE
  creditStatus?: string;
  // 终态耗时（秒）
  taskDurationSeconds?: number;
  // FAILED 时返回的失败原因（脱敏文案）；
  errorMessage?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      taskId: 'task_id',
      status: 'status',
      outputs: 'outputs',
      currentCredit: 'current_credit',
      creditStatus: 'credit_status',
      taskDurationSeconds: 'task_duration_seconds',
      errorMessage: 'error_message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      taskId: 'string',
      status: 'string',
      outputs: VideoOutput,
      currentCredit: 'number',
      creditStatus: 'string',
      taskDurationSeconds: 'number',
      errorMessage: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushAntcloudMarketingagentCreativeMaterialRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // string
  /**
   * @remarks
   * 待上传文件
   */
  fileObject?: Readable;
  /**
   * @remarks
   * 待上传文件名
   */
  fileObjectName?: string;
  fileId: string;
  // 产品类型
  productCode: string;
  // 素材用途
  materialUsage: string;
  // 素材形式（单个素材还是素材包）
  materialForm: string;
  // 素材文件格式
  materialType: string;
  // 素材空间类型（平台空间、企业空间、个人空间），不同空间下权限不一样
  spaceType: string;
  // 后续要做 AI 解析就要传,单文件音视频时长
  durationSeconds?: string;
  // 素材名， 不传用文件名
  name?: string;
  // 使用场景编码
  scene?: string;
  // 行业编码
  industry?: string;
  // 多个投放平台编码用英文逗号分隔
  publishPlatforms?: string;
  // 生图模板复用时回填的提示词；仅 GENERATION_TEMPLATE 使用
  prompt?: string;
  // 单文件视频缩略图 AFTS fileId
  thumbnailFileid?: string;
  // 封面文件下标，从 0 开始；素材包默认 0
  coverIndex?: number;
  // 视频缩略图的受管 OSS 路径
  thumbnailOssPath?: string;
  // 逐文件媒体信息，传 JSON 数组字符串；素材包的时长和缩略图从这里取
  metadata?: string;
  // 从生成结果保存时必传
  sourceMessageId?: string;
  // 1，选第二个生成结果；默认 0
  sourceResultIndex?: number;
  // 来源消息保存时必传；普通上传选填
  templateData?: MaterialTemplateData;
  // 模版json
  itemTemplatesJson?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      fileObject: 'fileObject',
      fileObjectName: 'fileObjectName',
      fileId: 'file_id',
      productCode: 'product_code',
      materialUsage: 'material_usage',
      materialForm: 'material_form',
      materialType: 'material_type',
      spaceType: 'space_type',
      durationSeconds: 'duration_seconds',
      name: 'name',
      scene: 'scene',
      industry: 'industry',
      publishPlatforms: 'publish_platforms',
      prompt: 'prompt',
      thumbnailFileid: 'thumbnail_fileid',
      coverIndex: 'cover_index',
      thumbnailOssPath: 'thumbnail_oss_path',
      metadata: 'metadata',
      sourceMessageId: 'source_message_id',
      sourceResultIndex: 'source_result_index',
      templateData: 'template_data',
      itemTemplatesJson: 'item_templates_json',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      fileObject: 'Readable',
      fileObjectName: 'string',
      fileId: 'string',
      productCode: 'string',
      materialUsage: 'string',
      materialForm: 'string',
      materialType: 'string',
      spaceType: 'string',
      durationSeconds: 'string',
      name: 'string',
      scene: 'string',
      industry: 'string',
      publishPlatforms: 'string',
      prompt: 'string',
      thumbnailFileid: 'string',
      coverIndex: 'number',
      thumbnailOssPath: 'string',
      metadata: 'string',
      sourceMessageId: 'string',
      sourceResultIndex: 'number',
      templateData: MaterialTemplateData,
      itemTemplatesJson: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushAntcloudMarketingagentCreativeMaterialResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 素材id
  materialId?: string;
  // 产品码
  productCode?: string;
  // 素材格式类型
  materialType?: string;
  // 素材形式（素材包还是单素材）
  materialForm?: string;
  // 名称
  name?: string;
  // 素材大小
  sizeBytes?: number;
  // 文件url
  fileUrl?: string;
  // 模版元数据
  templateData?: MaterialTemplateData;
  // 时长，单位秒
  durationSeconds?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      materialId: 'material_id',
      productCode: 'product_code',
      materialType: 'material_type',
      materialForm: 'material_form',
      name: 'name',
      sizeBytes: 'size_bytes',
      fileUrl: 'file_url',
      templateData: 'template_data',
      durationSeconds: 'duration_seconds',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      materialId: 'string',
      productCode: 'string',
      materialType: 'string',
      materialForm: 'string',
      name: 'string',
      sizeBytes: 'number',
      fileUrl: 'string',
      templateData: MaterialTemplateData,
      durationSeconds: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecAntcloudMarketingagentTemplateAnalysisRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // string
  /**
   * @remarks
   * 待上传文件
   */
  fileObject?: Readable;
  /**
   * @remarks
   * 待上传文件名
   */
  fileObjectName?: string;
  fileId: string;
  // 视频素材id
  materialId: string;
  // 本次操作幂等键，最多64字符
  requestId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      fileObject: 'fileObject',
      fileObjectName: 'fileObjectName',
      fileId: 'file_id',
      materialId: 'material_id',
      requestId: 'request_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      fileObject: 'Readable',
      fileObjectName: 'string',
      fileId: 'string',
      materialId: 'string',
      requestId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecAntcloudMarketingagentTemplateAnalysisResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 任务id
  taskId?: string;
  // PROCESSING（受理成功）/ FAILED（参数被拒）
  status?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      taskId: 'task_id',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      taskId: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntcloudMarketingagentTemplateAnalysisRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // string
  /**
   * @remarks
   * 待上传文件
   */
  fileObject?: Readable;
  /**
   * @remarks
   * 待上传文件名
   */
  fileObjectName?: string;
  fileId: string;
  // 任务id
  taskId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      fileObject: 'fileObject',
      fileObjectName: 'fileObjectName',
      fileId: 'file_id',
      taskId: 'task_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      fileObject: 'Readable',
      fileObjectName: 'string',
      fileId: 'string',
      taskId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntcloudMarketingagentTemplateAnalysisResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 任务id回显
  taskId?: string;
  // PENDING / PROCESSING / COMPLETED / FAILED
  status?: string;
  // 拆解详情
  analysisDetail?: string;
  // 原片逐镜拆解
  originalStoryboards?: string;
  // 新分镜脚本
  newStoryboardScript?: string;
  // 本次费用
  currentCredit?: number;
  // COMPLETE / PENDING / MISSING_USAGE / INVALID_USAGE / NOT_BILLABLE
  creditStatus?: string;
  // FAILED 时返回的脱敏失败文案
  errorMessage?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      taskId: 'task_id',
      status: 'status',
      analysisDetail: 'analysis_detail',
      originalStoryboards: 'original_storyboards',
      newStoryboardScript: 'new_storyboard_script',
      currentCredit: 'current_credit',
      creditStatus: 'credit_status',
      errorMessage: 'error_message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      taskId: 'string',
      status: 'string',
      analysisDetail: 'string',
      originalStoryboards: 'string',
      newStoryboardScript: 'string',
      currentCredit: 'number',
      creditStatus: 'string',
      errorMessage: 'string',
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
   * @remarks
   * Init client with Config
   * 
   * @param config - config contains the necessary information to create a client
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
   * @remarks
   * Encapsulate the request and invoke the network
   * 
   * @param action - api name
   * @param protocol - http or https
   * @param method - e.g. GET
   * @param pathname - pathname of every api
   * @param request - which contains request params
   * @param runtime - which controls some details of call api, such as retry times
   * @returns the response
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
          sdk_version: "2.1.7",
          _prod_code: "CREATIVERENDER",
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
   * @remarks
   * Description: 创意素材中心chat生图接口
   * Summary: 创意素材中心chat生图接口
   */
  async execAntcloudMarketingagentChatCreative(request: ExecAntcloudMarketingagentChatCreativeRequest): Promise<ExecAntcloudMarketingagentChatCreativeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execAntcloudMarketingagentChatCreativeEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 创意素材中心chat生图接口
   * Summary: 创意素材中心chat生图接口
   */
  async execAntcloudMarketingagentChatCreativeEx(request: ExecAntcloudMarketingagentChatCreativeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecAntcloudMarketingagentChatCreativeResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecAntcloudMarketingagentChatCreativeResponse>(await this.doRequest("1.0", "antcloud.marketingagent.chat.creative.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecAntcloudMarketingagentChatCreativeResponse({}));
  }

  /**
   * @remarks
   * Description: 创意素材chat接口
   * Summary: 创意素材chat接口
   */
  async execAntcloudMarketingagentCreativeChat(request: ExecAntcloudMarketingagentCreativeChatRequest): Promise<ExecAntcloudMarketingagentCreativeChatResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execAntcloudMarketingagentCreativeChatEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 创意素材chat接口
   * Summary: 创意素材chat接口
   */
  async execAntcloudMarketingagentCreativeChatEx(request: ExecAntcloudMarketingagentCreativeChatRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecAntcloudMarketingagentCreativeChatResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecAntcloudMarketingagentCreativeChatResponse>(await this.doRequest("1.0", "antcloud.marketingagent.creative.chat.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecAntcloudMarketingagentCreativeChatResponse({}));
  }

  /**
   * @remarks
   * Description: chat结果查询接口
   * Summary: chat结果查询接口
   */
  async queryAntcloudMarketingagentCreativeResult(request: QueryAntcloudMarketingagentCreativeResultRequest): Promise<QueryAntcloudMarketingagentCreativeResultResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAntcloudMarketingagentCreativeResultEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: chat结果查询接口
   * Summary: chat结果查询接口
   */
  async queryAntcloudMarketingagentCreativeResultEx(request: QueryAntcloudMarketingagentCreativeResultRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAntcloudMarketingagentCreativeResultResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAntcloudMarketingagentCreativeResultResponse>(await this.doRequest("1.0", "antcloud.marketingagent.creative.result.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAntcloudMarketingagentCreativeResultResponse({}));
  }

  /**
   * @remarks
   * Description: credit查询
   * Summary: credit查询
   */
  async queryAntcloudMarketingagentTaskCredit(request: QueryAntcloudMarketingagentTaskCreditRequest): Promise<QueryAntcloudMarketingagentTaskCreditResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAntcloudMarketingagentTaskCreditEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: credit查询
   * Summary: credit查询
   */
  async queryAntcloudMarketingagentTaskCreditEx(request: QueryAntcloudMarketingagentTaskCreditRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAntcloudMarketingagentTaskCreditResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAntcloudMarketingagentTaskCreditResponse>(await this.doRequest("1.0", "antcloud.marketingagent.task.credit.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAntcloudMarketingagentTaskCreditResponse({}));
  }

  /**
   * @remarks
   * Description: 素材查询接口
   * Summary: 素材查询接口
   */
  async queryAntcloudMarketingagentCreativeMaterial(request: QueryAntcloudMarketingagentCreativeMaterialRequest): Promise<QueryAntcloudMarketingagentCreativeMaterialResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAntcloudMarketingagentCreativeMaterialEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 素材查询接口
   * Summary: 素材查询接口
   */
  async queryAntcloudMarketingagentCreativeMaterialEx(request: QueryAntcloudMarketingagentCreativeMaterialRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAntcloudMarketingagentCreativeMaterialResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAntcloudMarketingagentCreativeMaterialResponse>(await this.doRequest("1.0", "antcloud.marketingagent.creative.material.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAntcloudMarketingagentCreativeMaterialResponse({}));
  }

  /**
   * @remarks
   * Description: AI视频生成接口
   * Summary: AI视频生成接口
   */
  async execAntcloudMarketingagentCreativeVideo(request: ExecAntcloudMarketingagentCreativeVideoRequest): Promise<ExecAntcloudMarketingagentCreativeVideoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execAntcloudMarketingagentCreativeVideoEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: AI视频生成接口
   * Summary: AI视频生成接口
   */
  async execAntcloudMarketingagentCreativeVideoEx(request: ExecAntcloudMarketingagentCreativeVideoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecAntcloudMarketingagentCreativeVideoResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecAntcloudMarketingagentCreativeVideoResponse>(await this.doRequest("1.0", "antcloud.marketingagent.creative.video.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecAntcloudMarketingagentCreativeVideoResponse({}));
  }

  /**
   * @remarks
   * Description: 视频任务查询接口
   * Summary: 视频任务查询接口
   */
  async queryAntcloudMarketingagentCreativeVideo(request: QueryAntcloudMarketingagentCreativeVideoRequest): Promise<QueryAntcloudMarketingagentCreativeVideoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAntcloudMarketingagentCreativeVideoEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 视频任务查询接口
   * Summary: 视频任务查询接口
   */
  async queryAntcloudMarketingagentCreativeVideoEx(request: QueryAntcloudMarketingagentCreativeVideoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAntcloudMarketingagentCreativeVideoResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAntcloudMarketingagentCreativeVideoResponse>(await this.doRequest("1.0", "antcloud.marketingagent.creative.video.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAntcloudMarketingagentCreativeVideoResponse({}));
  }

  /**
   * @remarks
   * Description: 基于已有成功子图版本提交提示词编辑，异步生成修改后的图片。返回独立 messageId 和新 segmentVersionId，通过子图编辑查询接口获取任务进度及结果；成功版本可用于下一轮修改。
   * Summary: 基于已有成功子图版本提交提示词编辑，异步生成修改后的图片。返回独立 messageId 和新 segmentVersionId，通过子图编辑查询接口获取任务进度及结果；成功版本可用于下一轮修改。
   */
  async execAntcloudMarketingagentCreativeImageedit(request: ExecAntcloudMarketingagentCreativeImageeditRequest): Promise<ExecAntcloudMarketingagentCreativeImageeditResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execAntcloudMarketingagentCreativeImageeditEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 基于已有成功子图版本提交提示词编辑，异步生成修改后的图片。返回独立 messageId 和新 segmentVersionId，通过子图编辑查询接口获取任务进度及结果；成功版本可用于下一轮修改。
   * Summary: 基于已有成功子图版本提交提示词编辑，异步生成修改后的图片。返回独立 messageId 和新 segmentVersionId，通过子图编辑查询接口获取任务进度及结果；成功版本可用于下一轮修改。
   */
  async execAntcloudMarketingagentCreativeImageeditEx(request: ExecAntcloudMarketingagentCreativeImageeditRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecAntcloudMarketingagentCreativeImageeditResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecAntcloudMarketingagentCreativeImageeditResponse>(await this.doRequest("1.0", "antcloud.marketingagent.creative.imageedit.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecAntcloudMarketingagentCreativeImageeditResponse({}));
  }

  /**
   * @remarks
   * Description: 根据子图编辑接口返回的 message_id，查询当前调用用户及租户下的子图编辑任务进度和结果。返回新版本 ID、任务状态、成功图片地址或失败原因；查询成功不代表图片生成成功。
   * Summary: 根据子图编辑接口返回的 message_id，查询当前调用用户及租户下的子图编辑任务进度和结果。返回新版本 ID、任务状态、成功图片地址或失败原因；查询成功不代表图片生成成功。
   */
  async queryAntcloudMarketingagentCreativeImageedit(request: QueryAntcloudMarketingagentCreativeImageeditRequest): Promise<QueryAntcloudMarketingagentCreativeImageeditResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAntcloudMarketingagentCreativeImageeditEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 根据子图编辑接口返回的 message_id，查询当前调用用户及租户下的子图编辑任务进度和结果。返回新版本 ID、任务状态、成功图片地址或失败原因；查询成功不代表图片生成成功。
   * Summary: 根据子图编辑接口返回的 message_id，查询当前调用用户及租户下的子图编辑任务进度和结果。返回新版本 ID、任务状态、成功图片地址或失败原因；查询成功不代表图片生成成功。
   */
  async queryAntcloudMarketingagentCreativeImageeditEx(request: QueryAntcloudMarketingagentCreativeImageeditRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAntcloudMarketingagentCreativeImageeditResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAntcloudMarketingagentCreativeImageeditResponse>(await this.doRequest("1.0", "antcloud.marketingagent.creative.imageedit.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAntcloudMarketingagentCreativeImageeditResponse({}));
  }

  /**
   * @remarks
   * Description: 上传创意图片文件，返回文件 ID、OSS 路径和可访问 URL，供文生视频使用。支持 JPG、JPEG、PNG，文件最大 30 MiB。
   * Summary: 上传创意图片文件，返回文件 ID、OSS 路径和可访问 URL，供文生视频使用。支持 JPG、JPEG、PNG，文件最大 30 MiB。
   */
  async execAntcloudMarketingagentFileUpload(request: ExecAntcloudMarketingagentFileUploadRequest): Promise<ExecAntcloudMarketingagentFileUploadResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execAntcloudMarketingagentFileUploadEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 上传创意图片文件，返回文件 ID、OSS 路径和可访问 URL，供文生视频使用。支持 JPG、JPEG、PNG，文件最大 30 MiB。
   * Summary: 上传创意图片文件，返回文件 ID、OSS 路径和可访问 URL，供文生视频使用。支持 JPG、JPEG、PNG，文件最大 30 MiB。
   */
  async execAntcloudMarketingagentFileUploadEx(request: ExecAntcloudMarketingagentFileUploadRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecAntcloudMarketingagentFileUploadResponse> {
    if (!Util.isUnset(request.fileObject)) {
      let uploadReq = new CreateAntcloudGatewayxFileUploadRequest({
        authToken: request.authToken,
        apiCode: "antcloud.marketingagent.file.upload.exec",
        fileName: request.fileObjectName,
      });
      let uploadResp = await this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
      if (!AntchainUtil.isSuccess(uploadResp.resultCode, "ok")) {
        let execAntcloudMarketingagentFileUploadResponse = new ExecAntcloudMarketingagentFileUploadResponse({
          reqMsgId: uploadResp.reqMsgId,
          resultCode: uploadResp.resultCode,
          resultMsg: uploadResp.resultMsg,
        });
        return execAntcloudMarketingagentFileUploadResponse;
      }

      let uploadHeaders = AntchainUtil.parseUploadHeaders(uploadResp.uploadHeaders);
      await AntchainUtil.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
      request.fileId = uploadResp.fileId;
      request.fileObject = null;
    }

    Util.validateModel(request);
    return $tea.cast<ExecAntcloudMarketingagentFileUploadResponse>(await this.doRequest("1.0", "antcloud.marketingagent.file.upload.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecAntcloudMarketingagentFileUploadResponse({}));
  }

  /**
   * @remarks
   * Description: 发起脚本扩写，复用现有文生视频的脚本扩写逻辑，异步返回任务标识。现有文生视频接口保持不变。
   * Summary: 发起脚本扩写，复用现有文生视频的脚本扩写逻辑，异步返回任务标识。现有文生视频接口保持不变。
   */
  async execAntcloudMarketingagentCreativeScript(request: ExecAntcloudMarketingagentCreativeScriptRequest): Promise<ExecAntcloudMarketingagentCreativeScriptResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execAntcloudMarketingagentCreativeScriptEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 发起脚本扩写，复用现有文生视频的脚本扩写逻辑，异步返回任务标识。现有文生视频接口保持不变。
   * Summary: 发起脚本扩写，复用现有文生视频的脚本扩写逻辑，异步返回任务标识。现有文生视频接口保持不变。
   */
  async execAntcloudMarketingagentCreativeScriptEx(request: ExecAntcloudMarketingagentCreativeScriptRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecAntcloudMarketingagentCreativeScriptResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecAntcloudMarketingagentCreativeScriptResponse>(await this.doRequest("1.0", "antcloud.marketingagent.creative.script.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecAntcloudMarketingagentCreativeScriptResponse({}));
  }

  /**
   * @remarks
   * Description: 查询脚本扩写任务状态、扩写结果及失败信息。复用现有扩写逻辑，现有文生视频接口保持不变。
   * Summary: 查询脚本扩写任务状态、扩写结果及失败信息。复用现有扩写逻辑，现有文生视频接口保持不变。
   */
  async queryAntcloudMarketingagentCreativeScript(request: QueryAntcloudMarketingagentCreativeScriptRequest): Promise<QueryAntcloudMarketingagentCreativeScriptResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAntcloudMarketingagentCreativeScriptEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 查询脚本扩写任务状态、扩写结果及失败信息。复用现有扩写逻辑，现有文生视频接口保持不变。
   * Summary: 查询脚本扩写任务状态、扩写结果及失败信息。复用现有扩写逻辑，现有文生视频接口保持不变。
   */
  async queryAntcloudMarketingagentCreativeScriptEx(request: QueryAntcloudMarketingagentCreativeScriptRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAntcloudMarketingagentCreativeScriptResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAntcloudMarketingagentCreativeScriptResponse>(await this.doRequest("1.0", "antcloud.marketingagent.creative.script.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAntcloudMarketingagentCreativeScriptResponse({}));
  }

  /**
   * @remarks
   * Description: 发起脚本扩写，复用现有文生视频脚本扩写逻辑，异步返回任务标识。
   * Summary: 发起脚本扩写，复用现有文生视频脚本扩写逻辑，异步返回任务标识。
   */
  async execAntcloudMarketingagentCreativeScriptexpand(request: ExecAntcloudMarketingagentCreativeScriptexpandRequest): Promise<ExecAntcloudMarketingagentCreativeScriptexpandResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execAntcloudMarketingagentCreativeScriptexpandEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 发起脚本扩写，复用现有文生视频脚本扩写逻辑，异步返回任务标识。
   * Summary: 发起脚本扩写，复用现有文生视频脚本扩写逻辑，异步返回任务标识。
   */
  async execAntcloudMarketingagentCreativeScriptexpandEx(request: ExecAntcloudMarketingagentCreativeScriptexpandRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecAntcloudMarketingagentCreativeScriptexpandResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecAntcloudMarketingagentCreativeScriptexpandResponse>(await this.doRequest("1.0", "antcloud.marketingagent.creative.scriptexpand.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecAntcloudMarketingagentCreativeScriptexpandResponse({}));
  }

  /**
   * @remarks
   * Description: 查询脚本扩写任务状态、扩写结果及失败信息，复用现有扩写逻辑。
   * Summary: 查询脚本扩写任务状态、扩写结果及失败信息，复用现有扩写逻辑。
   */
  async queryAntcloudMarketingagentCreativeScriptexpand(request: QueryAntcloudMarketingagentCreativeScriptexpandRequest): Promise<QueryAntcloudMarketingagentCreativeScriptexpandResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAntcloudMarketingagentCreativeScriptexpandEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 查询脚本扩写任务状态、扩写结果及失败信息，复用现有扩写逻辑。
   * Summary: 查询脚本扩写任务状态、扩写结果及失败信息，复用现有扩写逻辑。
   */
  async queryAntcloudMarketingagentCreativeScriptexpandEx(request: QueryAntcloudMarketingagentCreativeScriptexpandRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAntcloudMarketingagentCreativeScriptexpandResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAntcloudMarketingagentCreativeScriptexpandResponse>(await this.doRequest("1.0", "antcloud.marketingagent.creative.scriptexpand.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAntcloudMarketingagentCreativeScriptexpandResponse({}));
  }

  /**
   * @remarks
   * Description: 按 templateId 查询参考样式图片或视频模板的提示词。templateId 对应模板素材 materialId，返回 templatePrompt；按调用方租户和素材权限校验。
   * Summary: 按 templateId 查询参考样式图片或视频模板的提示词。templateId 对应模板素材 materialId，返回 templatePrompt；按调用方租户和素材权限校验。
   */
  async queryAntcloudMarketingagentCreativeTemplate(request: QueryAntcloudMarketingagentCreativeTemplateRequest): Promise<QueryAntcloudMarketingagentCreativeTemplateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAntcloudMarketingagentCreativeTemplateEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 按 templateId 查询参考样式图片或视频模板的提示词。templateId 对应模板素材 materialId，返回 templatePrompt；按调用方租户和素材权限校验。
   * Summary: 按 templateId 查询参考样式图片或视频模板的提示词。templateId 对应模板素材 materialId，返回 templatePrompt；按调用方租户和素材权限校验。
   */
  async queryAntcloudMarketingagentCreativeTemplateEx(request: QueryAntcloudMarketingagentCreativeTemplateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAntcloudMarketingagentCreativeTemplateResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAntcloudMarketingagentCreativeTemplateResponse>(await this.doRequest("1.0", "antcloud.marketingagent.creative.template.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAntcloudMarketingagentCreativeTemplateResponse({}));
  }

  /**
   * @remarks
   * Description: 传入视频和修改图片以及要求返回拆解任务id
   * Summary: 传入视频和修改图片以及要求返回拆解任务id
   */
  async execAntcloudMarketingagentCreativeStoryboard(request: ExecAntcloudMarketingagentCreativeStoryboardRequest): Promise<ExecAntcloudMarketingagentCreativeStoryboardResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execAntcloudMarketingagentCreativeStoryboardEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 传入视频和修改图片以及要求返回拆解任务id
   * Summary: 传入视频和修改图片以及要求返回拆解任务id
   */
  async execAntcloudMarketingagentCreativeStoryboardEx(request: ExecAntcloudMarketingagentCreativeStoryboardRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecAntcloudMarketingagentCreativeStoryboardResponse> {
    if (!Util.isUnset(request.fileObject)) {
      let uploadReq = new CreateAntcloudGatewayxFileUploadRequest({
        authToken: request.authToken,
        apiCode: "antcloud.marketingagent.creative.storyboard.exec",
        fileName: request.fileObjectName,
      });
      let uploadResp = await this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
      if (!AntchainUtil.isSuccess(uploadResp.resultCode, "ok")) {
        let execAntcloudMarketingagentCreativeStoryboardResponse = new ExecAntcloudMarketingagentCreativeStoryboardResponse({
          reqMsgId: uploadResp.reqMsgId,
          resultCode: uploadResp.resultCode,
          resultMsg: uploadResp.resultMsg,
        });
        return execAntcloudMarketingagentCreativeStoryboardResponse;
      }

      let uploadHeaders = AntchainUtil.parseUploadHeaders(uploadResp.uploadHeaders);
      await AntchainUtil.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
      request.fileId = uploadResp.fileId;
      request.fileObject = null;
    }

    Util.validateModel(request);
    return $tea.cast<ExecAntcloudMarketingagentCreativeStoryboardResponse>(await this.doRequest("1.0", "antcloud.marketingagent.creative.storyboard.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecAntcloudMarketingagentCreativeStoryboardResponse({}));
  }

  /**
   * @remarks
   * Description: 查询拆解任务结果
   * Summary: 查询拆解任务结果
   */
  async queryAntcloudMarketingagentCreativeStoryboard(request: QueryAntcloudMarketingagentCreativeStoryboardRequest): Promise<QueryAntcloudMarketingagentCreativeStoryboardResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAntcloudMarketingagentCreativeStoryboardEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 查询拆解任务结果
   * Summary: 查询拆解任务结果
   */
  async queryAntcloudMarketingagentCreativeStoryboardEx(request: QueryAntcloudMarketingagentCreativeStoryboardRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAntcloudMarketingagentCreativeStoryboardResponse> {
    if (!Util.isUnset(request.fileObject)) {
      let uploadReq = new CreateAntcloudGatewayxFileUploadRequest({
        authToken: request.authToken,
        apiCode: "antcloud.marketingagent.creative.storyboard.query",
        fileName: request.fileObjectName,
      });
      let uploadResp = await this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
      if (!AntchainUtil.isSuccess(uploadResp.resultCode, "ok")) {
        let queryAntcloudMarketingagentCreativeStoryboardResponse = new QueryAntcloudMarketingagentCreativeStoryboardResponse({
          reqMsgId: uploadResp.reqMsgId,
          resultCode: uploadResp.resultCode,
          resultMsg: uploadResp.resultMsg,
        });
        return queryAntcloudMarketingagentCreativeStoryboardResponse;
      }

      let uploadHeaders = AntchainUtil.parseUploadHeaders(uploadResp.uploadHeaders);
      await AntchainUtil.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
      request.fileId = uploadResp.fileId;
      request.fileObject = null;
    }

    Util.validateModel(request);
    return $tea.cast<QueryAntcloudMarketingagentCreativeStoryboardResponse>(await this.doRequest("1.0", "antcloud.marketingagent.creative.storyboard.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAntcloudMarketingagentCreativeStoryboardResponse({}));
  }

  /**
   * @remarks
   * Description: 根据拆解结果和新分镜生成视频
   * Summary: 根据拆解结果和新分镜生成视频
   */
  async execAntcloudMarketingagentCreativeRemake(request: ExecAntcloudMarketingagentCreativeRemakeRequest): Promise<ExecAntcloudMarketingagentCreativeRemakeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execAntcloudMarketingagentCreativeRemakeEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 根据拆解结果和新分镜生成视频
   * Summary: 根据拆解结果和新分镜生成视频
   */
  async execAntcloudMarketingagentCreativeRemakeEx(request: ExecAntcloudMarketingagentCreativeRemakeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecAntcloudMarketingagentCreativeRemakeResponse> {
    if (!Util.isUnset(request.fileObject)) {
      let uploadReq = new CreateAntcloudGatewayxFileUploadRequest({
        authToken: request.authToken,
        apiCode: "antcloud.marketingagent.creative.remake.exec",
        fileName: request.fileObjectName,
      });
      let uploadResp = await this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
      if (!AntchainUtil.isSuccess(uploadResp.resultCode, "ok")) {
        let execAntcloudMarketingagentCreativeRemakeResponse = new ExecAntcloudMarketingagentCreativeRemakeResponse({
          reqMsgId: uploadResp.reqMsgId,
          resultCode: uploadResp.resultCode,
          resultMsg: uploadResp.resultMsg,
        });
        return execAntcloudMarketingagentCreativeRemakeResponse;
      }

      let uploadHeaders = AntchainUtil.parseUploadHeaders(uploadResp.uploadHeaders);
      await AntchainUtil.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
      request.fileId = uploadResp.fileId;
      request.fileObject = null;
    }

    Util.validateModel(request);
    return $tea.cast<ExecAntcloudMarketingagentCreativeRemakeResponse>(await this.doRequest("1.0", "antcloud.marketingagent.creative.remake.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecAntcloudMarketingagentCreativeRemakeResponse({}));
  }

  /**
   * @remarks
   * Description: 查询复刻视频生成结果
   * Summary: 查询复刻视频生成结果
   */
  async queryAntcloudMarketingagentCreativeRemake(request: QueryAntcloudMarketingagentCreativeRemakeRequest): Promise<QueryAntcloudMarketingagentCreativeRemakeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAntcloudMarketingagentCreativeRemakeEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 查询复刻视频生成结果
   * Summary: 查询复刻视频生成结果
   */
  async queryAntcloudMarketingagentCreativeRemakeEx(request: QueryAntcloudMarketingagentCreativeRemakeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAntcloudMarketingagentCreativeRemakeResponse> {
    if (!Util.isUnset(request.fileObject)) {
      let uploadReq = new CreateAntcloudGatewayxFileUploadRequest({
        authToken: request.authToken,
        apiCode: "antcloud.marketingagent.creative.remake.query",
        fileName: request.fileObjectName,
      });
      let uploadResp = await this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
      if (!AntchainUtil.isSuccess(uploadResp.resultCode, "ok")) {
        let queryAntcloudMarketingagentCreativeRemakeResponse = new QueryAntcloudMarketingagentCreativeRemakeResponse({
          reqMsgId: uploadResp.reqMsgId,
          resultCode: uploadResp.resultCode,
          resultMsg: uploadResp.resultMsg,
        });
        return queryAntcloudMarketingagentCreativeRemakeResponse;
      }

      let uploadHeaders = AntchainUtil.parseUploadHeaders(uploadResp.uploadHeaders);
      await AntchainUtil.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
      request.fileId = uploadResp.fileId;
      request.fileObject = null;
    }

    Util.validateModel(request);
    return $tea.cast<QueryAntcloudMarketingagentCreativeRemakeResponse>(await this.doRequest("1.0", "antcloud.marketingagent.creative.remake.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAntcloudMarketingagentCreativeRemakeResponse({}));
  }

  /**
   * @remarks
   * Description: 素材上传接口
   * Summary: 素材上传接口
   */
  async pushAntcloudMarketingagentCreativeMaterial(request: PushAntcloudMarketingagentCreativeMaterialRequest): Promise<PushAntcloudMarketingagentCreativeMaterialResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pushAntcloudMarketingagentCreativeMaterialEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 素材上传接口
   * Summary: 素材上传接口
   */
  async pushAntcloudMarketingagentCreativeMaterialEx(request: PushAntcloudMarketingagentCreativeMaterialRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PushAntcloudMarketingagentCreativeMaterialResponse> {
    if (!Util.isUnset(request.fileObject)) {
      let uploadReq = new CreateAntcloudGatewayxFileUploadRequest({
        authToken: request.authToken,
        apiCode: "antcloud.marketingagent.creative.material.push",
        fileName: request.fileObjectName,
      });
      let uploadResp = await this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
      if (!AntchainUtil.isSuccess(uploadResp.resultCode, "ok")) {
        let pushAntcloudMarketingagentCreativeMaterialResponse = new PushAntcloudMarketingagentCreativeMaterialResponse({
          reqMsgId: uploadResp.reqMsgId,
          resultCode: uploadResp.resultCode,
          resultMsg: uploadResp.resultMsg,
        });
        return pushAntcloudMarketingagentCreativeMaterialResponse;
      }

      let uploadHeaders = AntchainUtil.parseUploadHeaders(uploadResp.uploadHeaders);
      await AntchainUtil.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
      request.fileId = uploadResp.fileId;
      request.fileObject = null;
    }

    Util.validateModel(request);
    return $tea.cast<PushAntcloudMarketingagentCreativeMaterialResponse>(await this.doRequest("1.0", "antcloud.marketingagent.creative.material.push", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PushAntcloudMarketingagentCreativeMaterialResponse({}));
  }

  /**
   * @remarks
   * Description: 视频解析
   * Summary: 视频解析
   */
  async execAntcloudMarketingagentTemplateAnalysis(request: ExecAntcloudMarketingagentTemplateAnalysisRequest): Promise<ExecAntcloudMarketingagentTemplateAnalysisResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execAntcloudMarketingagentTemplateAnalysisEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 视频解析
   * Summary: 视频解析
   */
  async execAntcloudMarketingagentTemplateAnalysisEx(request: ExecAntcloudMarketingagentTemplateAnalysisRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecAntcloudMarketingagentTemplateAnalysisResponse> {
    if (!Util.isUnset(request.fileObject)) {
      let uploadReq = new CreateAntcloudGatewayxFileUploadRequest({
        authToken: request.authToken,
        apiCode: "antcloud.marketingagent.template.analysis.exec",
        fileName: request.fileObjectName,
      });
      let uploadResp = await this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
      if (!AntchainUtil.isSuccess(uploadResp.resultCode, "ok")) {
        let execAntcloudMarketingagentTemplateAnalysisResponse = new ExecAntcloudMarketingagentTemplateAnalysisResponse({
          reqMsgId: uploadResp.reqMsgId,
          resultCode: uploadResp.resultCode,
          resultMsg: uploadResp.resultMsg,
        });
        return execAntcloudMarketingagentTemplateAnalysisResponse;
      }

      let uploadHeaders = AntchainUtil.parseUploadHeaders(uploadResp.uploadHeaders);
      await AntchainUtil.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
      request.fileId = uploadResp.fileId;
      request.fileObject = null;
    }

    Util.validateModel(request);
    return $tea.cast<ExecAntcloudMarketingagentTemplateAnalysisResponse>(await this.doRequest("1.0", "antcloud.marketingagent.template.analysis.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecAntcloudMarketingagentTemplateAnalysisResponse({}));
  }

  /**
   * @remarks
   * Description: 视频拆解查询
   * Summary: 视频拆解查询
   */
  async queryAntcloudMarketingagentTemplateAnalysis(request: QueryAntcloudMarketingagentTemplateAnalysisRequest): Promise<QueryAntcloudMarketingagentTemplateAnalysisResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAntcloudMarketingagentTemplateAnalysisEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 视频拆解查询
   * Summary: 视频拆解查询
   */
  async queryAntcloudMarketingagentTemplateAnalysisEx(request: QueryAntcloudMarketingagentTemplateAnalysisRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAntcloudMarketingagentTemplateAnalysisResponse> {
    if (!Util.isUnset(request.fileObject)) {
      let uploadReq = new CreateAntcloudGatewayxFileUploadRequest({
        authToken: request.authToken,
        apiCode: "antcloud.marketingagent.template.analysis.query",
        fileName: request.fileObjectName,
      });
      let uploadResp = await this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
      if (!AntchainUtil.isSuccess(uploadResp.resultCode, "ok")) {
        let queryAntcloudMarketingagentTemplateAnalysisResponse = new QueryAntcloudMarketingagentTemplateAnalysisResponse({
          reqMsgId: uploadResp.reqMsgId,
          resultCode: uploadResp.resultCode,
          resultMsg: uploadResp.resultMsg,
        });
        return queryAntcloudMarketingagentTemplateAnalysisResponse;
      }

      let uploadHeaders = AntchainUtil.parseUploadHeaders(uploadResp.uploadHeaders);
      await AntchainUtil.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
      request.fileId = uploadResp.fileId;
      request.fileObject = null;
    }

    Util.validateModel(request);
    return $tea.cast<QueryAntcloudMarketingagentTemplateAnalysisResponse>(await this.doRequest("1.0", "antcloud.marketingagent.template.analysis.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAntcloudMarketingagentTemplateAnalysisResponse({}));
  }

  /**
   * @remarks
   * Description: 创建HTTP PUT提交的文件上传
   * Summary: 文件上传创建
   */
  async createAntcloudGatewayxFileUpload(request: CreateAntcloudGatewayxFileUploadRequest): Promise<CreateAntcloudGatewayxFileUploadResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createAntcloudGatewayxFileUploadEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 创建HTTP PUT提交的文件上传
   * Summary: 文件上传创建
   */
  async createAntcloudGatewayxFileUploadEx(request: CreateAntcloudGatewayxFileUploadRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateAntcloudGatewayxFileUploadResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateAntcloudGatewayxFileUploadResponse>(await this.doRequest("1.0", "antcloud.gatewayx.file.upload.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateAntcloudGatewayxFileUploadResponse({}));
  }

}
