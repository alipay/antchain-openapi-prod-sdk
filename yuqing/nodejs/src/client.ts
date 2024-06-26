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

// 钉钉链接消息
export class Link extends $tea.Model {
  // 文字
  text?: string;
  // 标题
  title?: string;
  // 图片地址
  picUrl?: string;
  // 链接
  messageUrl?: string;
  static names(): { [key: string]: string } {
    return {
      text: 'text',
      title: 'title',
      picUrl: 'pic_url',
      messageUrl: 'message_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      text: 'string',
      title: 'string',
      picUrl: 'string',
      messageUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 钉钉点击
export class Btn extends $tea.Model {
  // 标题
  title?: string;
  // 动作地址
  actionUrl?: string;
  static names(): { [key: string]: string } {
    return {
      title: 'title',
      actionUrl: 'action_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      title: 'string',
      actionUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 與情信息扩展字段
export class YuqingMessageExtInfo extends $tea.Model {
  // 媒体地域
  mediaAreaCountry?: string;
  // 媒体地域省份
  mediaAreaProvince?: string;
  // 媒体地域-市
  mediaAreaCity?: string;
  // 内容风险
  generalModel?: string;
  static names(): { [key: string]: string } {
    return {
      mediaAreaCountry: 'media_area_country',
      mediaAreaProvince: 'media_area_province',
      mediaAreaCity: 'media_area_city',
      generalModel: 'general_model',
    };
  }

  static types(): { [key: string]: any } {
    return {
      mediaAreaCountry: 'string',
      mediaAreaProvince: 'string',
      mediaAreaCity: 'string',
      generalModel: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 消息填充内容
export class Pair extends $tea.Model {
  // key
  key: string;
  // value
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

// 热搜结构体
export class HotspotMessage extends $tea.Model {
  // 热搜/热榜/话题 对应用户id (可能为空)
  userId: string;
  // 在榜总时间
  totalExistTimestamp: number;
  // 下榜时间
  lastExistDateFormat: string;
  // 爬虫爬取的时间
  crawlerTimeFmt: string;
  // 第一次上榜的格式化时间
  firstExistDateFormat: string;
  // 最高排名的总时长
  maxRankTotalTimestamp: number;
  // 跟随量
  followersCount: number;
  // 在榜单中的最高排名
  maxRank: number;
  // 阅读量
  readsCount: number;
  // 评论数
  commentsCount: number;
  // 标题，例如话题的标题就是话题本身
  docTitle: string;
  // 首次上榜排名
  firstRank: number;
  // 原创人数
  originalCount: number;
  // 主持人
  presenterName: string;
  // 热搜在热搜榜的位置
  rank: number;
  // 热点媒体类型
  mediaType: string;
  // 文档id
  docId: string;
  // 类型
  type: string;
  // 热度值
  hotValue: number;
  // 内容，热榜数据中存在着文章，热文就是有内容的
  docContent: string;
  // 热搜/热榜/话题 对应用户名称 (可能为空)
  screenName: string;
  // 热点媒体子类型
  mediaSubType: string;
  // 讨论量
  discussesCount: number;
  // 分类
  category: string;
  // 视频量
  videoCount: number;
  // 最高排名的格式化总时长
  maxRankTotalTimeFormat: string;
  // 省
  province: string;
  // 在榜格式化的总时间
  totalExistTimeFormat: string;
  // 第一次上最高排名的时间
  firstTopExistTimestamp: number;
  // 链接地址
  docUrl?: string;
  // 最大的热度值
  maxHotValue: number;
  // 市
  city: string;
  // 最后一次上榜的时间
  lastExistTimestamp: number;
  // 第一次上最高排名的时间
  firstTopExistDateFormat: string;
  // 下榜排名
  lastRank: number;
  // 首次上榜热度
  firstHotValue: number;
  // 热搜类型
  hotspotType: string;
  // 第一次上榜的时间
  firstXxistTimestamp: number;
  static names(): { [key: string]: string } {
    return {
      userId: 'user_id',
      totalExistTimestamp: 'total_exist_timestamp',
      lastExistDateFormat: 'last_exist_date_format',
      crawlerTimeFmt: 'crawler_time_fmt',
      firstExistDateFormat: 'first_exist_date_format',
      maxRankTotalTimestamp: 'max_rank_total_timestamp',
      followersCount: 'followers_count',
      maxRank: 'max_rank',
      readsCount: 'reads_count',
      commentsCount: 'comments_count',
      docTitle: 'doc_title',
      firstRank: 'first_rank',
      originalCount: 'original_count',
      presenterName: 'presenter_name',
      rank: 'rank',
      mediaType: 'media_type',
      docId: 'doc_id',
      type: 'type',
      hotValue: 'hot_value',
      docContent: 'doc_content',
      screenName: 'screen_name',
      mediaSubType: 'media_sub_type',
      discussesCount: 'discusses_count',
      category: 'category',
      videoCount: 'video_count',
      maxRankTotalTimeFormat: 'max_rank_total_time_format',
      province: 'province',
      totalExistTimeFormat: 'total_exist_time_format',
      firstTopExistTimestamp: 'first_top_exist_timestamp',
      docUrl: 'doc_url',
      maxHotValue: 'max_hot_value',
      city: 'city',
      lastExistTimestamp: 'last_exist_timestamp',
      firstTopExistDateFormat: 'first_top_exist_date_format',
      lastRank: 'last_rank',
      firstHotValue: 'first_hot_value',
      hotspotType: 'hotspot_type',
      firstXxistTimestamp: 'first_xxist_timestamp',
    };
  }

  static types(): { [key: string]: any } {
    return {
      userId: 'string',
      totalExistTimestamp: 'number',
      lastExistDateFormat: 'string',
      crawlerTimeFmt: 'string',
      firstExistDateFormat: 'string',
      maxRankTotalTimestamp: 'number',
      followersCount: 'number',
      maxRank: 'number',
      readsCount: 'number',
      commentsCount: 'number',
      docTitle: 'string',
      firstRank: 'number',
      originalCount: 'number',
      presenterName: 'string',
      rank: 'number',
      mediaType: 'string',
      docId: 'string',
      type: 'string',
      hotValue: 'number',
      docContent: 'string',
      screenName: 'string',
      mediaSubType: 'string',
      discussesCount: 'number',
      category: 'string',
      videoCount: 'number',
      maxRankTotalTimeFormat: 'string',
      province: 'string',
      totalExistTimeFormat: 'string',
      firstTopExistTimestamp: 'number',
      docUrl: 'string',
      maxHotValue: 'number',
      city: 'string',
      lastExistTimestamp: 'number',
      firstTopExistDateFormat: 'string',
      lastRank: 'number',
      firstHotValue: 'number',
      hotspotType: 'string',
      firstXxistTimestamp: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 钉钉Markdown
export class Markdown extends $tea.Model {
  // 标题
  title?: string;
  // 内容
  text?: string;
  static names(): { [key: string]: string } {
    return {
      title: 'title',
      text: 'text',
    };
  }

  static types(): { [key: string]: any } {
    return {
      title: 'string',
      text: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 钉钉At
export class At extends $tea.Model {
  // @手机号
  atMobiles?: string[];
  // @用户ID
  atUserIds?: string[];
  // @所有人
  isAtAll?: boolean;
  static names(): { [key: string]: string } {
    return {
      atMobiles: 'at_mobiles',
      atUserIds: 'at_user_ids',
      isAtAll: 'is_at_all',
    };
  }

  static types(): { [key: string]: any } {
    return {
      atMobiles: { 'type': 'array', 'itemType': 'string' },
      atUserIds: { 'type': 'array', 'itemType': 'string' },
      isAtAll: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// YuqingMessage
export class YuqingMessage extends $tea.Model {
  // 作者头像地址
  authorAvatarUrl?: string;
  // 粉丝数
  authorFollowersCount?: number;
  // 好友数
  authorFriendsCount?: number;
  // 作者id
  authorId?: string;
  // 作者名称
  authorName?: string;
  // 发文数
  authorStatusesCount?: number;
  // 作者认证类型
  authorVerifyType?: string;
  // 舆情文章被抓取的时间戳
  createTime?: number;
  // 文章正文内容
  docContent?: string;
  // 文章摘要
  docContentBrief?: string;
  // 文章内容签名，如果是转发微博或者其他有父内容的doc，计算的是父文章的得分。一般用于去重，相同的doc_content_sign说明内容相同
  docContentSign?: string;
  // 文章唯一docId
  docId?: string;
  // 文章自身的内容签名，转发微博计算的是转发内容的contentSign，与父微博无关
  docSelfContentSign?: string;
  // 文章标题
  docTitle?: string;
  // 原文地址
  docUrl?: string;
  // 情感的正负面，-1代表负面，1代表非负面
  emotionType?: number;
  // 命中的搜索词列表
  highlightKeywords?: string[];
  // 媒体类型，枚举值
  mediaType?: string;
  // 舆情消息类型:转发,评论/回复, 原文,群聊等
  messageType?: string;
  // 文章的父docId，如被转发的文章docId
  parentDocId?: string;
  // 舆情文章的发布时间戳
  publishTime?: number;
  // 相关性得分
  relevanceScore?: string;
  // 相似文章数
  similarNumber?: number;
  // 微博评论id
  weiboCommentId?: string;
  // 微博消息id
  weiboMid?: string;
  // 传播得分，0-10
  propagationScore?: string;
  // 情感得分
  emotionScore?: string;
  // 影响力得分
  influenceScore?: string;
  // 提级地域列表
  docAreas?: string[];
  // 媒体名称
  mediaName?: string;
  // 扩展信息
  extInfo?: YuqingMessageExtInfo;
  // 文章转载自
  docReprintName?: string;
  // 视频列表地址
  contentVideoUrls?: string;
  // 图片列表地址
  contentImageUrls?: string;
  // 图片识别出来的文本
  contentImageText?: string;
  // 音频列表地址
  contentAudioUrls?: string;
  // 音频识别出来的文本
  contentAudioText?: string;
  // 视频识别出来的文本
  contentVideoText?: string;
  // 文章转发数
  docRepostsCount?: number;
  // 文章评论数
  docCommentsCount?: number;
  // 文章点赞数
  docLikesCount?: number;
  // 文章阅读数
  docReadsCount?: number;
  // 回答数
  docAnswersCount?: number;
  static names(): { [key: string]: string } {
    return {
      authorAvatarUrl: 'author_avatar_url',
      authorFollowersCount: 'author_followers_count',
      authorFriendsCount: 'author_friends_count',
      authorId: 'author_id',
      authorName: 'author_name',
      authorStatusesCount: 'author_statuses_count',
      authorVerifyType: 'author_verify_type',
      createTime: 'create_time',
      docContent: 'doc_content',
      docContentBrief: 'doc_content_brief',
      docContentSign: 'doc_content_sign',
      docId: 'doc_id',
      docSelfContentSign: 'doc_self_content_sign',
      docTitle: 'doc_title',
      docUrl: 'doc_url',
      emotionType: 'emotion_type',
      highlightKeywords: 'highlight_keywords',
      mediaType: 'media_type',
      messageType: 'message_type',
      parentDocId: 'parent_doc_id',
      publishTime: 'publish_time',
      relevanceScore: 'relevance_score',
      similarNumber: 'similar_number',
      weiboCommentId: 'weibo_comment_id',
      weiboMid: 'weibo_mid',
      propagationScore: 'propagation_score',
      emotionScore: 'emotion_score',
      influenceScore: 'influence_score',
      docAreas: 'doc_areas',
      mediaName: 'media_name',
      extInfo: 'ext_info',
      docReprintName: 'doc_reprint_name',
      contentVideoUrls: 'content_video_urls',
      contentImageUrls: 'content_image_urls',
      contentImageText: 'content_image_text',
      contentAudioUrls: 'content_audio_urls',
      contentAudioText: 'content_audio_text',
      contentVideoText: 'content_video_text',
      docRepostsCount: 'doc_reposts_count',
      docCommentsCount: 'doc_comments_count',
      docLikesCount: 'doc_likes_count',
      docReadsCount: 'doc_reads_count',
      docAnswersCount: 'doc_answers_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authorAvatarUrl: 'string',
      authorFollowersCount: 'number',
      authorFriendsCount: 'number',
      authorId: 'string',
      authorName: 'string',
      authorStatusesCount: 'number',
      authorVerifyType: 'string',
      createTime: 'number',
      docContent: 'string',
      docContentBrief: 'string',
      docContentSign: 'string',
      docId: 'string',
      docSelfContentSign: 'string',
      docTitle: 'string',
      docUrl: 'string',
      emotionType: 'number',
      highlightKeywords: { 'type': 'array', 'itemType': 'string' },
      mediaType: 'string',
      messageType: 'string',
      parentDocId: 'string',
      publishTime: 'number',
      relevanceScore: 'string',
      similarNumber: 'number',
      weiboCommentId: 'string',
      weiboMid: 'string',
      propagationScore: 'string',
      emotionScore: 'string',
      influenceScore: 'string',
      docAreas: { 'type': 'array', 'itemType': 'string' },
      mediaName: 'string',
      extInfo: YuqingMessageExtInfo,
      docReprintName: 'string',
      contentVideoUrls: 'string',
      contentImageUrls: 'string',
      contentImageText: 'string',
      contentAudioUrls: 'string',
      contentAudioText: 'string',
      contentVideoText: 'string',
      docRepostsCount: 'number',
      docCommentsCount: 'number',
      docLikesCount: 'number',
      docReadsCount: 'number',
      docAnswersCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 钉钉动作卡片
export class ActionCard extends $tea.Model {
  // 标题
  title?: string;
  // 内容
  text?: string;
  // btn_orientation
  btnOrientation?: string;
  // 简单标题
  singleTitle?: string;
  // 简单地址
  singleUrl?: string;
  // 点击
  btns?: Btn[];
  static names(): { [key: string]: string } {
    return {
      title: 'title',
      text: 'text',
      btnOrientation: 'btn_orientation',
      singleTitle: 'single_title',
      singleUrl: 'single_url',
      btns: 'btns',
    };
  }

  static types(): { [key: string]: any } {
    return {
      title: 'string',
      text: 'string',
      btnOrientation: 'string',
      singleTitle: 'string',
      singleUrl: 'string',
      btns: { 'type': 'array', 'itemType': Btn },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 钉钉FeedCard
export class FeedCard extends $tea.Model {
  // 卡片流
  links?: Link[];
  static names(): { [key: string]: string } {
    return {
      links: 'links',
    };
  }

  static types(): { [key: string]: any } {
    return {
      links: { 'type': 'array', 'itemType': Link },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 钉钉文字消息
export class Text extends $tea.Model {
  // 内容
  content?: string;
  static names(): { [key: string]: string } {
    return {
      content: 'content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      content: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 其他过滤条件
export class FieldCondition extends $tea.Model {
  // 字段名称
  fieldName: string;
  // 复杂查询下，嵌套子条件字段jsonPath
  nestFieldPath?: string;
  // 复杂查询下，嵌套子条件字段值
  nestFieldValue?: number[];
  // 操作符
  operateType: string;
  // 关键字	
  value: string;
  static names(): { [key: string]: string } {
    return {
      fieldName: 'field_name',
      nestFieldPath: 'nest_field_path',
      nestFieldValue: 'nest_field_value',
      operateType: 'operate_type',
      value: 'value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      fieldName: 'string',
      nestFieldPath: 'string',
      nestFieldValue: { 'type': 'array', 'itemType': 'number' },
      operateType: 'string',
      value: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 钉钉消息体
export class DingTalkContent extends $tea.Model {
  // webHook
  webHook?: string;
  // 消息类型
  msgtype?: string;
  // 文字
  text?: Text;
  // 链接
  link?: Link;
  // markdown
  markdown?: Markdown;
  // actionCard
  actionCard?: ActionCard;
  // feedCard
  feedCard?: FeedCard;
  // at
  at?: At;
  static names(): { [key: string]: string } {
    return {
      webHook: 'web_hook',
      msgtype: 'msgtype',
      text: 'text',
      link: 'link',
      markdown: 'markdown',
      actionCard: 'action_card',
      feedCard: 'feed_card',
      at: 'at',
    };
  }

  static types(): { [key: string]: any } {
    return {
      webHook: 'string',
      msgtype: 'string',
      text: Text,
      link: Link,
      markdown: Markdown,
      actionCard: ActionCard,
      feedCard: FeedCard,
      at: At,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 预警消息体
export class Alarm extends $tea.Model {
  // 人工打的标签
  tags?: string[];
  // 预警内容摘要
  content?: string;
  // 预警时间戳
  alarmTimestamp?: number;
  // 舆情项目id
  projectId?: number;
  // 修改人
  modifierName?: string;
  // 消息标题
  title?: string;
  // 消息id
  id?: number;
  // 作者名称
  authorName?: string;
  // 预警规则id
  alarmRuleId?: number;
  // 预警规则类型
  type?: string;
  // 修改时间戳
  gmtModifiedTimestamp?: number;
  // 完整消息
  message?: YuqingMessage;
  // project
  projectName?: string;
  // alarm_rule_name
  alarmRuleName?: string;
  // alarm_level
  alarmLevel?: string;
  // doc_media_type
  docMediaType?: string;
  // status
  status?: string;
  static names(): { [key: string]: string } {
    return {
      tags: 'tags',
      content: 'content',
      alarmTimestamp: 'alarm_timestamp',
      projectId: 'project_id',
      modifierName: 'modifier_name',
      title: 'title',
      id: 'id',
      authorName: 'author_name',
      alarmRuleId: 'alarm_rule_id',
      type: 'type',
      gmtModifiedTimestamp: 'gmt_modified_timestamp',
      message: 'message',
      projectName: 'project_name',
      alarmRuleName: 'alarm_rule_name',
      alarmLevel: 'alarm_level',
      docMediaType: 'doc_media_type',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      tags: { 'type': 'array', 'itemType': 'string' },
      content: 'string',
      alarmTimestamp: 'number',
      projectId: 'number',
      modifierName: 'string',
      title: 'string',
      id: 'number',
      authorName: 'string',
      alarmRuleId: 'number',
      type: 'string',
      gmtModifiedTimestamp: 'number',
      message: YuqingMessage,
      projectName: 'string',
      alarmRuleName: 'string',
      alarmLevel: 'string',
      docMediaType: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 深度分析配置
export class AnalysisConfig extends $tea.Model {
  // 文章ID
  docId?: string;
  // 文章URL
  url?: string;
  // 项目ID
  projectId?: number;
  // 模板ID
  filterId?: number;
  // 关键词列表
  posKeywordList?: string[];
  // 开始时间
  publishTimeStart?: number;
  // 结束时间
  publishTimeEnd?: number;
  // URL列表
  urlList?: string[];
  static names(): { [key: string]: string } {
    return {
      docId: 'doc_id',
      url: 'url',
      projectId: 'project_id',
      filterId: 'filter_id',
      posKeywordList: 'pos_keyword_list',
      publishTimeStart: 'publish_time_start',
      publishTimeEnd: 'publish_time_end',
      urlList: 'url_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      docId: 'string',
      url: 'string',
      projectId: 'number',
      filterId: 'number',
      posKeywordList: { 'type': 'array', 'itemType': 'string' },
      publishTimeStart: 'number',
      publishTimeEnd: 'number',
      urlList: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 热搜任务结构体
export class HotspotTask extends $tea.Model {
  // 任务ID
  taskId: string;
  // 数量
  count: number;
  // 当前页
  pageNow: number;
  // 每页数量
  pageSize: number;
  // 数据
  pages: HotspotMessage[];
  static names(): { [key: string]: string } {
    return {
      taskId: 'task_id',
      count: 'count',
      pageNow: 'page_now',
      pageSize: 'page_size',
      pages: 'pages',
    };
  }

  static types(): { [key: string]: any } {
    return {
      taskId: 'string',
      count: 'number',
      pageNow: 'number',
      pageSize: 'number',
      pages: { 'type': 'array', 'itemType': HotspotMessage },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 查询结构体
export class SearchCondition extends $tea.Model {
  // 搭配词
  assKeywordList?: string[];
  // 被@的用户名称
  atAuthorNameList?: string[];
  // 作者名称
  authorNameList?: string[];
  // 评论级别，1：100以内，2：100-1k，3：1k-1w以内，4：1w-10w，5，10w+
  commentsLevel?: number;
  // 内容长度级别，1：100以内，2：100-1k，3：1k-1w以内，4：1w-10w，5，10w+
  contentLenLevel?: string;
  // 抓取截止时间
  createTimeEnd?: number;
  // 抓取起始时间
  createTimeStart?: number;
  // 文章签名
  docContentSign?: string;
  // 舆情文章唯一docId
  docIdList?: string[];
  // 是否去重
  duplicateRemoval?: boolean;
  // 情感类型，1非负，-1负面
  emotionType?: number;
  // 是否高亮关键词
  enableKeywordHighlight?: boolean;
  // 排除被@的用户名称
  excludeAtAuthorNameList?: string[];
  // 排除作者名称
  excludeAuthorNameList?: string[];
  // 排除网站域名
  excludeHostNameList?: string[];
  // 排除关键词标签Id列表
  excludeKeywordTagIds?: number[];
  // 排除词
  excludeKeywordList?: string[];
  // 标题排除词
  excludeKeywordListInTitle?: string[];
  // 排除媒体库id列表
  excludeMediaLibraryIdList?: number[];
  // 排除媒体名称
  excludeMediaNameList?: string[];
  // 排除媒体类型，枚举值
  excludeMediaTypeList?: string[];
  // 排除消息类型，枚举值
  excludeMessageTypeList?: string[];
  // 文章是否含有图片
  hasImage?: boolean;
  // 是否含有视频
  hasVideo?: boolean;
  // 网站域名
  hostNameList?: string[];
  // 关键词标签Id列表
  keywordTagIds?: number[];
  // 点赞级别，1：100以内，2：100-1k，3：1k-1w以内，4：1w-10w，5，10w+
  likesLevel?: number;
  // 媒体库id列表
  mediaLibraryIdList?: number[];
  // 媒体名称
  mediaNameList?: string[];
  // 体类型，枚举值
  mediaTypeList?: string[];
  // 消息类型，枚举值
  messageTypeList?: string[];
  // 当前页
  pageNow?: number;
  // 页大小
  pageSize?: number;
  // 舆情父文章的docId，一般用于查看某篇文章的评论
  parentDocId?: string;
  // 关键词
  posKeywordList?: string[];
  // 标题关键词
  posKeywordListInTitle?: string[];
  // 截止发布时间
  publishTimeEnd?: number;
  // 起始发布时间
  publishTimeStart?: number;
  // 阅读级别，1：100以内，2：100-1k，3：1k-1w以内，4：1w-10w，5，10w+
  readsLevel?: number;
  // 相关性等级，1：低，2：中，3：高，4：低级别以上
  relevanceLevel?: number;
  // 转发级别，1：100以内，2：100-1k，3：1k-1w以内，4：1w-10w，5，10w+
  repostLevel?: number;
  // 排序字段
  sortBy?: string;
  // 指定正反向排序
  sortByDirection?: string;
  // #话题
  topicList?: string[];
  // 舆情文章截止更新时间
  updateTimeEnd?: number;
  // 舆情文章起始更新时间
  updateTimeStart?: number;
  // field_conditions
  fieldConditions?: FieldCondition[];
  // 项目ID
  projectId?: string;
  static names(): { [key: string]: string } {
    return {
      assKeywordList: 'ass_keyword_list',
      atAuthorNameList: 'at_author_name_list',
      authorNameList: 'author_name_list',
      commentsLevel: 'comments_level',
      contentLenLevel: 'content_len_level',
      createTimeEnd: 'create_time_end',
      createTimeStart: 'create_time_start',
      docContentSign: 'doc_content_sign',
      docIdList: 'doc_id_list',
      duplicateRemoval: 'duplicate_removal',
      emotionType: 'emotion_type',
      enableKeywordHighlight: 'enable_keyword_highlight',
      excludeAtAuthorNameList: 'exclude_at_author_name_list',
      excludeAuthorNameList: 'exclude_author_name_list',
      excludeHostNameList: 'exclude_host_name_list',
      excludeKeywordTagIds: 'exclude_keyword_tag_ids',
      excludeKeywordList: 'exclude_keyword_list',
      excludeKeywordListInTitle: 'exclude_keyword_list_in_title',
      excludeMediaLibraryIdList: 'exclude_media_library_id_list',
      excludeMediaNameList: 'exclude_media_name_list',
      excludeMediaTypeList: 'exclude_media_type_list',
      excludeMessageTypeList: 'exclude_message_type_list',
      hasImage: 'has_image',
      hasVideo: 'has_video',
      hostNameList: 'host_name_list',
      keywordTagIds: 'keyword_tag_ids',
      likesLevel: 'likes_level',
      mediaLibraryIdList: 'media_library_id_list',
      mediaNameList: 'media_name_list',
      mediaTypeList: 'media_type_list',
      messageTypeList: 'message_type_list',
      pageNow: 'page_now',
      pageSize: 'page_size',
      parentDocId: 'parent_doc_id',
      posKeywordList: 'pos_keyword_list',
      posKeywordListInTitle: 'pos_keyword_list_in_title',
      publishTimeEnd: 'publish_time_end',
      publishTimeStart: 'publish_time_start',
      readsLevel: 'reads_level',
      relevanceLevel: 'relevance_level',
      repostLevel: 'repost_level',
      sortBy: 'sort_by',
      sortByDirection: 'sort_by_direction',
      topicList: 'topic_list',
      updateTimeEnd: 'update_time_end',
      updateTimeStart: 'update_time_start',
      fieldConditions: 'field_conditions',
      projectId: 'project_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      assKeywordList: { 'type': 'array', 'itemType': 'string' },
      atAuthorNameList: { 'type': 'array', 'itemType': 'string' },
      authorNameList: { 'type': 'array', 'itemType': 'string' },
      commentsLevel: 'number',
      contentLenLevel: 'string',
      createTimeEnd: 'number',
      createTimeStart: 'number',
      docContentSign: 'string',
      docIdList: { 'type': 'array', 'itemType': 'string' },
      duplicateRemoval: 'boolean',
      emotionType: 'number',
      enableKeywordHighlight: 'boolean',
      excludeAtAuthorNameList: { 'type': 'array', 'itemType': 'string' },
      excludeAuthorNameList: { 'type': 'array', 'itemType': 'string' },
      excludeHostNameList: { 'type': 'array', 'itemType': 'string' },
      excludeKeywordTagIds: { 'type': 'array', 'itemType': 'number' },
      excludeKeywordList: { 'type': 'array', 'itemType': 'string' },
      excludeKeywordListInTitle: { 'type': 'array', 'itemType': 'string' },
      excludeMediaLibraryIdList: { 'type': 'array', 'itemType': 'number' },
      excludeMediaNameList: { 'type': 'array', 'itemType': 'string' },
      excludeMediaTypeList: { 'type': 'array', 'itemType': 'string' },
      excludeMessageTypeList: { 'type': 'array', 'itemType': 'string' },
      hasImage: 'boolean',
      hasVideo: 'boolean',
      hostNameList: { 'type': 'array', 'itemType': 'string' },
      keywordTagIds: { 'type': 'array', 'itemType': 'number' },
      likesLevel: 'number',
      mediaLibraryIdList: { 'type': 'array', 'itemType': 'number' },
      mediaNameList: { 'type': 'array', 'itemType': 'string' },
      mediaTypeList: { 'type': 'array', 'itemType': 'string' },
      messageTypeList: { 'type': 'array', 'itemType': 'string' },
      pageNow: 'number',
      pageSize: 'number',
      parentDocId: 'string',
      posKeywordList: { 'type': 'array', 'itemType': 'string' },
      posKeywordListInTitle: { 'type': 'array', 'itemType': 'string' },
      publishTimeEnd: 'number',
      publishTimeStart: 'number',
      readsLevel: 'number',
      relevanceLevel: 'number',
      repostLevel: 'number',
      sortBy: 'string',
      sortByDirection: 'string',
      topicList: { 'type': 'array', 'itemType': 'string' },
      updateTimeEnd: 'number',
      updateTimeStart: 'number',
      fieldConditions: { 'type': 'array', 'itemType': FieldCondition },
      projectId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 项目
export class Project extends $tea.Model {
  // 项目名字
  name: string;
  // 作者名称
  authorNameList?: string[];
  // 关键词
  posKeywordList: string[];
  // 标题包含词列表
  posKeywordListInTitle?: string[];
  // 排除关键词标签列表
  excludeKeywordTagIds?: string;
  // 修改人uid
  uidModified?: string;
  // 提级用户名，如@xxx
  atAuthorNameList?: string[];
  // 排除词
  excludeKeywordList?: string[];
  // 项目的分析页面id，关联hbase中的自定义页面表
  analyseCpId?: number;
  // 关键词标签列表
  keywordTagIds?: string[];
  // 搭配词
  assKeywordList?: string[];
  // 项目ID
  id?: number;
  // 默认搜索模板id
  defaultFilterId?: number;
  // 创建人名称
  unameCreate?: string;
  // 父项目id
  parentId?: number;
  // 创建时间
  gmtCreate?: number;
  // 修改人名称
  unameModified?: string;
  // 修改时间
  gmtModified?: number;
  // 项目分组id
  projectGroupId?: number;
  // 父文章id
  parentDocId?: number;
  // 文章id列表
  docIdList?: string[];
  // 话题词列表
  topicList?: string[];
  // 创建人UID
  uidCreate?: string;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      authorNameList: 'author_name_list',
      posKeywordList: 'pos_keyword_list',
      posKeywordListInTitle: 'pos_keyword_list_in_title',
      excludeKeywordTagIds: 'exclude_keyword_tag_ids',
      uidModified: 'uid_modified',
      atAuthorNameList: 'at_author_name_list',
      excludeKeywordList: 'exclude_keyword_list',
      analyseCpId: 'analyse_cp_id',
      keywordTagIds: 'keyword_tag_ids',
      assKeywordList: 'ass_keyword_list',
      id: 'id',
      defaultFilterId: 'default_filter_id',
      unameCreate: 'uname_create',
      parentId: 'parent_id',
      gmtCreate: 'gmt_create',
      unameModified: 'uname_modified',
      gmtModified: 'gmt_modified',
      projectGroupId: 'project_group_id',
      parentDocId: 'parent_doc_id',
      docIdList: 'doc_id_list',
      topicList: 'topic_list',
      uidCreate: 'uid_create',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      authorNameList: { 'type': 'array', 'itemType': 'string' },
      posKeywordList: { 'type': 'array', 'itemType': 'string' },
      posKeywordListInTitle: { 'type': 'array', 'itemType': 'string' },
      excludeKeywordTagIds: 'string',
      uidModified: 'string',
      atAuthorNameList: { 'type': 'array', 'itemType': 'string' },
      excludeKeywordList: { 'type': 'array', 'itemType': 'string' },
      analyseCpId: 'number',
      keywordTagIds: { 'type': 'array', 'itemType': 'string' },
      assKeywordList: { 'type': 'array', 'itemType': 'string' },
      id: 'number',
      defaultFilterId: 'number',
      unameCreate: 'string',
      parentId: 'number',
      gmtCreate: 'number',
      unameModified: 'string',
      gmtModified: 'number',
      projectGroupId: 'number',
      parentDocId: 'number',
      docIdList: { 'type': 'array', 'itemType': 'string' },
      topicList: { 'type': 'array', 'itemType': 'string' },
      uidCreate: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 短信消息体
export class SmsContent extends $tea.Model {
  // 模板
  serviceCode?: string;
  // 手机号
  mobile: string;
  // 开发者ID
  developerId?: string;
  // 填充内容
  arguments?: Pair[];
  static names(): { [key: string]: string } {
    return {
      serviceCode: 'service_code',
      mobile: 'mobile',
      developerId: 'developer_id',
      arguments: 'arguments',
    };
  }

  static types(): { [key: string]: any } {
    return {
      serviceCode: 'string',
      mobile: 'string',
      developerId: 'string',
      arguments: { 'type': 'array', 'itemType': Pair },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 邮箱数据
export class EmailContent extends $tea.Model {
  // code
  serviceCode?: string;
  // 开发者Id
  developerId?: string;
  // 邮箱
  email: string;
  // 参数
  arguments?: Pair[];
  static names(): { [key: string]: string } {
    return {
      serviceCode: 'service_code',
      developerId: 'developer_id',
      email: 'email',
      arguments: 'arguments',
    };
  }

  static types(): { [key: string]: any } {
    return {
      serviceCode: 'string',
      developerId: 'string',
      email: 'string',
      arguments: { 'type': 'array', 'itemType': Pair },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 商品规格
export class CommoditySpec extends $tea.Model {
  // 规格项枚举值
  specKey?: string;
  // 规格项默认值
  value?: string;
  static names(): { [key: string]: string } {
    return {
      specKey: 'spec_key',
      value: 'value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      specKey: 'string',
      value: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMessagesRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 查询条件
  searchCondition: SearchCondition;
  // 请求ID
  requestId?: string;
  // team_hash_id
  teamHashId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      searchCondition: 'search_condition',
      requestId: 'request_id',
      teamHashId: 'team_hash_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      searchCondition: SearchCondition,
      requestId: 'string',
      teamHashId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMessagesResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 数量
  totalCount?: number;
  // 舆情列表
  yuqingMessages?: YuqingMessage[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      totalCount: 'total_count',
      yuqingMessages: 'yuqing_messages',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      totalCount: 'number',
      yuqingMessages: { 'type': 'array', 'itemType': YuqingMessage },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveAnalysisSubmitRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 分析类型
  analyseType: string;
  // 查询条件
  searchCondition: SearchCondition;
  // team_hash_id
  teamHashId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      analyseType: 'analyse_type',
      searchCondition: 'search_condition',
      teamHashId: 'team_hash_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      analyseType: 'string',
      searchCondition: SearchCondition,
      teamHashId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveAnalysisSubmitResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 分析任务ID
  analysisId?: number;
  // 其他
  resultJson?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      analysisId: 'analysis_id',
      resultJson: 'result_json',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      analysisId: 'number',
      resultJson: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAnalysisQueryRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 分析任务ID
  analysisId: number;
  // team_hash_id
  teamHashId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      analysisId: 'analysis_id',
      teamHashId: 'team_hash_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      analysisId: 'number',
      teamHashId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAnalysisQueryResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 分析任务ID
  analysisId?: number;
  // 分析内容
  resultJson?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      analysisId: 'analysis_id',
      resultJson: 'result_json',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      analysisId: 'number',
      resultJson: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveProductOpenRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 业务号
  bizNo?: string;
  // 租户 ID
  tenantId?: string;
  // 实例 ID，兼容老模型的 tntInstId
  instanceId?: string;
  // 产品编码
  productCode?: string;
  // 模块唯一标识
  moduleKey?: string;
  // 操作类型
  operate?: string;
  // 操作来源渠道
  channel?: string;
  // 规格
  commoditySpecs?: CommoditySpec[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizNo: 'biz_no',
      tenantId: 'tenant_id',
      instanceId: 'instance_id',
      productCode: 'product_code',
      moduleKey: 'module_key',
      operate: 'operate',
      channel: 'channel',
      commoditySpecs: 'commodity_specs',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizNo: 'string',
      tenantId: 'string',
      instanceId: 'string',
      productCode: 'string',
      moduleKey: 'string',
      operate: 'string',
      channel: 'string',
      commoditySpecs: { 'type': 'array', 'itemType': CommoditySpec },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveProductOpenResponse extends $tea.Model {
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

export class SaveProductTopRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 业务号
  bizNo?: string;
  // 租户 ID
  tenantId?: string;
  // 实例 ID，兼容老模型的 tntInstId
  instanceId?: string;
  // 产品编码
  productCode?: string;
  // 模块唯一标识
  moduleKey?: string;
  // 操作类型
  operate?: string;
  // 操作来源渠道
  channel?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizNo: 'biz_no',
      tenantId: 'tenant_id',
      instanceId: 'instance_id',
      productCode: 'product_code',
      moduleKey: 'module_key',
      operate: 'operate',
      channel: 'channel',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizNo: 'string',
      tenantId: 'string',
      instanceId: 'string',
      productCode: 'string',
      moduleKey: 'string',
      operate: 'string',
      channel: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveProductTopResponse extends $tea.Model {
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

export class SetProductOperateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求入参
  inputJson: string;
  // 操作类型
  operateType: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      inputJson: 'input_json',
      operateType: 'operate_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      inputJson: 'string',
      operateType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SetProductOperateResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 输出返回
  outputJson?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      outputJson: 'output_json',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      outputJson: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SendProductNoticeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 提醒类型
  noticeType: string;
  // 租户ID
  tenantUid: string;
  // 钉钉结构体
  dingTalkContent?: DingTalkContent;
  // 短信内容
  smsContent?: SmsContent;
  // email结构体
  emailContent?: EmailContent;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      noticeType: 'notice_type',
      tenantUid: 'tenant_uid',
      dingTalkContent: 'ding_talk_content',
      smsContent: 'sms_content',
      emailContent: 'email_content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      noticeType: 'string',
      tenantUid: 'string',
      dingTalkContent: DingTalkContent,
      smsContent: SmsContent,
      emailContent: EmailContent,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SendProductNoticeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 推送返回
  operateResult?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      operateResult: 'operate_result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      operateResult: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveDeepanalysisSubmitRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 深度分析类型
  toolType: string;
  // 任务名称
  name: string;
  // 深度分析配置
  config: AnalysisConfig;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      toolType: 'tool_type',
      name: 'name',
      config: 'config',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      toolType: 'string',
      name: 'string',
      config: AnalysisConfig,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveDeepanalysisSubmitResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 深度分析任务ID
  analysisId?: number;
  // 其他返回
  resultJson?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      analysisId: 'analysis_id',
      resultJson: 'result_json',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      analysisId: 'number',
      resultJson: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDeepanalysisQueryRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 深度分析任务ID
  analysisId: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      analysisId: 'analysis_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      analysisId: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDeepanalysisQueryResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 深度分析任务ID
  analysisId?: number;
  // 分析内容
  resultJson?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      analysisId: 'analysis_id',
      resultJson: 'result_json',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      analysisId: 'number',
      resultJson: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetMessageRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求ID
  requestId?: string;
  // team_hash_id
  teamHashId?: string;
  // 文档唯一ID
  docId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      requestId: 'request_id',
      teamHashId: 'team_hash_id',
      docId: 'doc_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      requestId: 'string',
      teamHashId: 'string',
      docId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetMessageResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 與情内容
  yuqingMessage?: YuqingMessage;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      yuqingMessage: 'yuqing_message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      yuqingMessage: YuqingMessage,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryProjectRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 父亲项目的id: 负数表示不限
  parentId?: number;
  // uid
  uid?: string;
  // 排序字段名称，如gmt_create
  orderBy?: string;
  // 请求ID
  requestId?: string;
  // 名称
  name?: string;
  // 指定ID
  ids?: number[];
  // 当前页
  currentPage: number;
  // 所在项目组ID
  projectGroupId?: number;
  // 页面大小
  pageSize: number;
  // 排序方式：DESC降序，ASC升序
  sortType?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      parentId: 'parent_id',
      uid: 'uid',
      orderBy: 'order_by',
      requestId: 'request_id',
      name: 'name',
      ids: 'ids',
      currentPage: 'current_page',
      projectGroupId: 'project_group_id',
      pageSize: 'page_size',
      sortType: 'sort_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      parentId: 'number',
      uid: 'string',
      orderBy: 'string',
      requestId: 'string',
      name: 'string',
      ids: { 'type': 'array', 'itemType': 'number' },
      currentPage: 'number',
      projectGroupId: 'number',
      pageSize: 'number',
      sortType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryProjectResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 页面内容
  pages?: Project[];
  // 总条数
  totalCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      pages: 'pages',
      totalCount: 'total_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      pages: { 'type': 'array', 'itemType': Project },
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateProjectRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 创建内容
  createParam: Project;
  // requestId
  requestId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      createParam: 'create_param',
      requestId: 'request_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      createParam: Project,
      requestId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateProjectResponse extends $tea.Model {
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

export class DeleteProjectRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 项目ID
  id: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      id: 'id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      id: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteProjectResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 新增主键
  id?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      id: 'id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      id: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAlarmRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 规则id列表
  alarmRuleIds?: number[];
  // 排序字段名称，如gmt_create
  orderBy?: string;
  // 是否用更新时间筛选
  isQueryUpdateTime?: boolean;
  // 当前页
  currentPage?: number;
  // 页大小
  pageSize?: number;
  // 舆情项目id列表
  projectIds?: number[];
  // 预警时间下限
  endTime?: number;
  // 预警等级，如：P0
  levels?: string;
  // 预警时间上限
  startTime?: number;
  // 预警规则类型
  type?: string;
  // 预警消息id
  ids?: number[];
  // 标签id
  tagIds?: number[];
  // 媒体类型
  docMediaType?: string;
  // 消息状态，如：FINISHED
  status?: string[];
  // 文章docId列表
  docIdList?: string[];
  // 排序方向，DESC降序，ASC升序
  sortType?: string;
  // requestId
  requestId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      alarmRuleIds: 'alarm_rule_ids',
      orderBy: 'order_by',
      isQueryUpdateTime: 'is_query_update_time',
      currentPage: 'current_page',
      pageSize: 'page_size',
      projectIds: 'project_ids',
      endTime: 'end_time',
      levels: 'levels',
      startTime: 'start_time',
      type: 'type',
      ids: 'ids',
      tagIds: 'tag_ids',
      docMediaType: 'doc_media_type',
      status: 'status',
      docIdList: 'doc_id_list',
      sortType: 'sort_type',
      requestId: 'request_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      alarmRuleIds: { 'type': 'array', 'itemType': 'number' },
      orderBy: 'string',
      isQueryUpdateTime: 'boolean',
      currentPage: 'number',
      pageSize: 'number',
      projectIds: { 'type': 'array', 'itemType': 'number' },
      endTime: 'number',
      levels: 'string',
      startTime: 'number',
      type: 'string',
      ids: { 'type': 'array', 'itemType': 'number' },
      tagIds: { 'type': 'array', 'itemType': 'number' },
      docMediaType: 'string',
      status: { 'type': 'array', 'itemType': 'string' },
      docIdList: { 'type': 'array', 'itemType': 'string' },
      sortType: 'string',
      requestId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAlarmResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 预警消息
  pages?: Alarm[];
  // 总条数
  totalCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      pages: 'pages',
      totalCount: 'total_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      pages: { 'type': 'array', 'itemType': Alarm },
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryHotspotMessageRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 标题包含XX
  titleIncludingWordsIdx?: string;
  // 正向关键词（短语匹配）
  posKeywords?: string;
  // 标题完全相等的检索条件，与attributes.display_title字段对应
  wholeKeywords?: string;
  // 排序方式： 正序(+)、倒序(-)
  sortByDirection?: string;
  // 省份
  provinces?: string;
  // 爬取时间的最小值（含）
  crawlerTimeStartFilter?: number;
  // 页大小
  pageSize: number;
  // [媒体子类型
  mediaSubType?: string[];
  // 是否不指定关键词进行查询：\n 默认false，表示需要指定关键词来查询
  queryWithoutKeyword?: boolean;
  // 指定的id列表
  docIds?: string[];
  // 城市
  cities?: string[];
  // 爬取时间的最大值（不含）
  crawlerTimeEndFilter?: number;
  // 是否要进行关键词高亮显示
  enableKeywordHighlight?: boolean;
  // d当前页
  pageNow: number;
  // 是否当前在榜 true表示在榜，false或null表示不限
  fileId?: boolean;
  // 排序字段
  sortBy?: string;
  // 是否当前在榜
  active?: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      titleIncludingWordsIdx: 'title_including_words_idx',
      posKeywords: 'pos_keywords',
      wholeKeywords: 'whole_keywords',
      sortByDirection: 'sort_by_direction',
      provinces: 'provinces',
      crawlerTimeStartFilter: 'crawler_time_start_filter',
      pageSize: 'page_size',
      mediaSubType: 'media_sub_type',
      queryWithoutKeyword: 'query_without_keyword',
      docIds: 'doc_ids',
      cities: 'cities',
      crawlerTimeEndFilter: 'crawler_time_end_filter',
      enableKeywordHighlight: 'enable_keyword_highlight',
      pageNow: 'page_now',
      fileId: 'file_id',
      sortBy: 'sort_by',
      active: 'active',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      titleIncludingWordsIdx: 'string',
      posKeywords: 'string',
      wholeKeywords: 'string',
      sortByDirection: 'string',
      provinces: 'string',
      crawlerTimeStartFilter: 'number',
      pageSize: 'number',
      mediaSubType: { 'type': 'array', 'itemType': 'string' },
      queryWithoutKeyword: 'boolean',
      docIds: { 'type': 'array', 'itemType': 'string' },
      cities: { 'type': 'array', 'itemType': 'string' },
      crawlerTimeEndFilter: 'number',
      enableKeywordHighlight: 'boolean',
      pageNow: 'number',
      fileId: 'boolean',
      sortBy: 'string',
      active: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryHotspotMessageResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 热搜数据
  pages?: HotspotMessage[];
  // 总条数
  totalCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      pages: 'pages',
      totalCount: 'total_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      pages: { 'type': 'array', 'itemType': HotspotMessage },
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SubmitMessagesHistoryRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 查询条件
  searchCondition: SearchCondition;
  // 请求ID
  requestId?: string;
  // team_hash_id
  teamHashId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      searchCondition: 'search_condition',
      requestId: 'request_id',
      teamHashId: 'team_hash_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      searchCondition: SearchCondition,
      requestId: 'string',
      teamHashId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SubmitMessagesHistoryResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 查询ID
  submitId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      submitId: 'submit_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      submitId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetMessagesHistoryRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 历史数据提交的产物
  submitId: string;
  // request_id
  requestId?: string;
  // page_now
  pageNow: number;
  // page_size
  pageSize: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      submitId: 'submit_id',
      requestId: 'request_id',
      pageNow: 'page_now',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      submitId: 'string',
      requestId: 'string',
      pageNow: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetMessagesHistoryResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 总数
  totalCount?: number;
  // yuqing_messages
  yuqingMessages?: YuqingMessage[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      totalCount: 'total_count',
      yuqingMessages: 'yuqing_messages',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      totalCount: 'number',
      yuqingMessages: { 'type': 'array', 'itemType': YuqingMessage },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SubmitHotspotTaskRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 媒体类型
  mediaSubTypes: string[];
  // 任务过期时间,单位秒
  expiredTime: number;
  // 排序方式： 正序(+)、倒序(-)
  sortByDirection?: string;
  // 排序字段
  sortBy?: string;
  // 爬取开始时间过滤
  crawlerTimeStartFilter?: number;
  // 爬取结束时间过滤
  crawlerTimeEndFilter?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      mediaSubTypes: 'media_sub_types',
      expiredTime: 'expired_time',
      sortByDirection: 'sort_by_direction',
      sortBy: 'sort_by',
      crawlerTimeStartFilter: 'crawler_time_start_filter',
      crawlerTimeEndFilter: 'crawler_time_end_filter',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      mediaSubTypes: { 'type': 'array', 'itemType': 'string' },
      expiredTime: 'number',
      sortByDirection: 'string',
      sortBy: 'string',
      crawlerTimeStartFilter: 'number',
      crawlerTimeEndFilter: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SubmitHotspotTaskResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 任务ID
  taskIds?: string[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      taskIds: 'task_ids',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      taskIds: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetHotspotTaskRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 任务ID
  taskIds: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      taskIds: 'task_ids',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      taskIds: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetHotspotTaskResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 任务的结果
  hotspotTasks?: HotspotTask[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      hotspotTasks: 'hotspot_tasks',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      hotspotTasks: { 'type': 'array', 'itemType': HotspotTask },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetStsTokenRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 业务类型
  bizType: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizType: 'biz_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetStsTokenResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // AK
  accessKeyId?: string;
  // SK
  accessKeySecret?: string;
  // stsToken
  securityToken?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      accessKeyId: 'access_key_id',
      accessKeySecret: 'access_key_secret',
      securityToken: 'security_token',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      accessKeyId: 'string',
      accessKeySecret: 'string',
      securityToken: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OperateCommonInterfaceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 入参JSON
  paramJson: string;
  // 接口名称
  interfaceName: string;
  // 请求ID
  requestId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      paramJson: 'param_json',
      interfaceName: 'interface_name',
      requestId: 'request_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      paramJson: 'string',
      interfaceName: 'string',
      requestId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OperateCommonInterfaceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回JSON
  resultJson?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      resultJson: 'result_json',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      resultJson: 'string',
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
          sdk_version: "1.2.21",
          _prod_code: "YUQING",
          _prod_channel: "undefined",
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
   * Description: 查询舆情列表
   * Summary: 查询舆情列表
   */
  async queryMessages(request: QueryMessagesRequest): Promise<QueryMessagesResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryMessagesEx(request, headers, runtime);
  }

  /**
   * Description: 查询舆情列表
   * Summary: 查询舆情列表
   */
  async queryMessagesEx(request: QueryMessagesRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryMessagesResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryMessagesResponse>(await this.doRequest("1.0", "universalsaas.yuqing.messages.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryMessagesResponse({}));
  }

  /**
   * Description: 舆情分析任务提交
   * Summary: 舆情分析任务提交
   */
  async saveAnalysisSubmit(request: SaveAnalysisSubmitRequest): Promise<SaveAnalysisSubmitResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.saveAnalysisSubmitEx(request, headers, runtime);
  }

  /**
   * Description: 舆情分析任务提交
   * Summary: 舆情分析任务提交
   */
  async saveAnalysisSubmitEx(request: SaveAnalysisSubmitRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SaveAnalysisSubmitResponse> {
    Util.validateModel(request);
    return $tea.cast<SaveAnalysisSubmitResponse>(await this.doRequest("1.0", "universalsaas.yuqing.analysis.submit.save", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SaveAnalysisSubmitResponse({}));
  }

  /**
   * Description: 舆情分析任务查询
   * Summary: 舆情分析任务查询
   */
  async queryAnalysisQuery(request: QueryAnalysisQueryRequest): Promise<QueryAnalysisQueryResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAnalysisQueryEx(request, headers, runtime);
  }

  /**
   * Description: 舆情分析任务查询
   * Summary: 舆情分析任务查询
   */
  async queryAnalysisQueryEx(request: QueryAnalysisQueryRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAnalysisQueryResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAnalysisQueryResponse>(await this.doRequest("1.0", "universalsaas.yuqing.analysis.query.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAnalysisQueryResponse({}));
  }

  /**
   * Description: 废弃
   * Summary: 废弃
   */
  async saveProductOpen(request: SaveProductOpenRequest): Promise<SaveProductOpenResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.saveProductOpenEx(request, headers, runtime);
  }

  /**
   * Description: 废弃
   * Summary: 废弃
   */
  async saveProductOpenEx(request: SaveProductOpenRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SaveProductOpenResponse> {
    Util.validateModel(request);
    return $tea.cast<SaveProductOpenResponse>(await this.doRequest("1.0", "universalsaas.yuqing.product.open.save", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SaveProductOpenResponse({}));
  }

  /**
   * Description: 废弃
   * Summary: 废弃
   */
  async saveProductTop(request: SaveProductTopRequest): Promise<SaveProductTopResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.saveProductTopEx(request, headers, runtime);
  }

  /**
   * Description: 废弃
   * Summary: 废弃
   */
  async saveProductTopEx(request: SaveProductTopRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SaveProductTopResponse> {
    Util.validateModel(request);
    return $tea.cast<SaveProductTopResponse>(await this.doRequest("1.0", "universalsaas.yuqing.product.top.save", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SaveProductTopResponse({}));
  }

  /**
   * Description: 产品操作接口
   * Summary: 产品操作接口
   */
  async setProductOperate(request: SetProductOperateRequest): Promise<SetProductOperateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.setProductOperateEx(request, headers, runtime);
  }

  /**
   * Description: 产品操作接口
   * Summary: 产品操作接口
   */
  async setProductOperateEx(request: SetProductOperateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SetProductOperateResponse> {
    Util.validateModel(request);
    return $tea.cast<SetProductOperateResponse>(await this.doRequest("1.0", "universalsaas.yuqing.product.operate.set", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SetProductOperateResponse({}));
  }

  /**
   * Description: 发送提醒
   * Summary: 发送提醒
   */
  async sendProductNotice(request: SendProductNoticeRequest): Promise<SendProductNoticeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.sendProductNoticeEx(request, headers, runtime);
  }

  /**
   * Description: 发送提醒
   * Summary: 发送提醒
   */
  async sendProductNoticeEx(request: SendProductNoticeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SendProductNoticeResponse> {
    Util.validateModel(request);
    return $tea.cast<SendProductNoticeResponse>(await this.doRequest("1.0", "universalsaas.yuqing.product.notice.send", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SendProductNoticeResponse({}));
  }

  /**
   * Description: 创建深度分析
   * Summary: 创建深度分析
   */
  async saveDeepanalysisSubmit(request: SaveDeepanalysisSubmitRequest): Promise<SaveDeepanalysisSubmitResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.saveDeepanalysisSubmitEx(request, headers, runtime);
  }

  /**
   * Description: 创建深度分析
   * Summary: 创建深度分析
   */
  async saveDeepanalysisSubmitEx(request: SaveDeepanalysisSubmitRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SaveDeepanalysisSubmitResponse> {
    Util.validateModel(request);
    return $tea.cast<SaveDeepanalysisSubmitResponse>(await this.doRequest("1.0", "universalsaas.yuqing.deepanalysis.submit.save", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SaveDeepanalysisSubmitResponse({}));
  }

  /**
   * Description: 查询深度分析
   * Summary: 查询深度分析
   */
  async queryDeepanalysisQuery(request: QueryDeepanalysisQueryRequest): Promise<QueryDeepanalysisQueryResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDeepanalysisQueryEx(request, headers, runtime);
  }

  /**
   * Description: 查询深度分析
   * Summary: 查询深度分析
   */
  async queryDeepanalysisQueryEx(request: QueryDeepanalysisQueryRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDeepanalysisQueryResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDeepanalysisQueryResponse>(await this.doRequest("1.0", "universalsaas.yuqing.deepanalysis.query.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDeepanalysisQueryResponse({}));
  }

  /**
   * Description: 获取单个與情
   * Summary: 获取单个
   */
  async getMessage(request: GetMessageRequest): Promise<GetMessageResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getMessageEx(request, headers, runtime);
  }

  /**
   * Description: 获取单个與情
   * Summary: 获取单个
   */
  async getMessageEx(request: GetMessageRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetMessageResponse> {
    Util.validateModel(request);
    return $tea.cast<GetMessageResponse>(await this.doRequest("1.0", "universalsaas.yuqing.message.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetMessageResponse({}));
  }

  /**
   * Description: 查询與情项目
   * Summary: 查询與情项目
   */
  async queryProject(request: QueryProjectRequest): Promise<QueryProjectResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryProjectEx(request, headers, runtime);
  }

  /**
   * Description: 查询與情项目
   * Summary: 查询與情项目
   */
  async queryProjectEx(request: QueryProjectRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryProjectResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryProjectResponse>(await this.doRequest("1.0", "universalsaas.yuqing.project.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryProjectResponse({}));
  }

  /**
   * Description: 创建项目
   * Summary: 创建项目
   */
  async createProject(request: CreateProjectRequest): Promise<CreateProjectResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createProjectEx(request, headers, runtime);
  }

  /**
   * Description: 创建项目
   * Summary: 创建项目
   */
  async createProjectEx(request: CreateProjectRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateProjectResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateProjectResponse>(await this.doRequest("1.0", "universalsaas.yuqing.project.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateProjectResponse({}));
  }

  /**
   * Description: 删除项目
   * Summary: 删除项目
   */
  async deleteProject(request: DeleteProjectRequest): Promise<DeleteProjectResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteProjectEx(request, headers, runtime);
  }

  /**
   * Description: 删除项目
   * Summary: 删除项目
   */
  async deleteProjectEx(request: DeleteProjectRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteProjectResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteProjectResponse>(await this.doRequest("1.0", "universalsaas.yuqing.project.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteProjectResponse({}));
  }

  /**
   * Description: 查询预警消息列表
   * Summary: 查询预警消息列表
   */
  async queryAlarm(request: QueryAlarmRequest): Promise<QueryAlarmResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAlarmEx(request, headers, runtime);
  }

  /**
   * Description: 查询预警消息列表
   * Summary: 查询预警消息列表
   */
  async queryAlarmEx(request: QueryAlarmRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAlarmResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAlarmResponse>(await this.doRequest("1.0", "universalsaas.yuqing.alarm.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAlarmResponse({}));
  }

  /**
   * Description: 根据接口获取热搜数据
   * Summary: 與情热搜接口
   */
  async queryHotspotMessage(request: QueryHotspotMessageRequest): Promise<QueryHotspotMessageResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryHotspotMessageEx(request, headers, runtime);
  }

  /**
   * Description: 根据接口获取热搜数据
   * Summary: 與情热搜接口
   */
  async queryHotspotMessageEx(request: QueryHotspotMessageRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryHotspotMessageResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryHotspotMessageResponse>(await this.doRequest("1.0", "universalsaas.yuqing.hotspot.message.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryHotspotMessageResponse({}));
  }

  /**
   * Description: 與情历史数据异步查询接口
   * Summary: 與情历史数据异步查询接口
   */
  async submitMessagesHistory(request: SubmitMessagesHistoryRequest): Promise<SubmitMessagesHistoryResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.submitMessagesHistoryEx(request, headers, runtime);
  }

  /**
   * Description: 與情历史数据异步查询接口
   * Summary: 與情历史数据异步查询接口
   */
  async submitMessagesHistoryEx(request: SubmitMessagesHistoryRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SubmitMessagesHistoryResponse> {
    Util.validateModel(request);
    return $tea.cast<SubmitMessagesHistoryResponse>(await this.doRequest("1.0", "universalsaas.yuqing.messages.history.submit", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SubmitMessagesHistoryResponse({}));
  }

  /**
   * Description: 获取历史與情消息
   * Summary: 获取历史與情消息
   */
  async getMessagesHistory(request: GetMessagesHistoryRequest): Promise<GetMessagesHistoryResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getMessagesHistoryEx(request, headers, runtime);
  }

  /**
   * Description: 获取历史與情消息
   * Summary: 获取历史與情消息
   */
  async getMessagesHistoryEx(request: GetMessagesHistoryRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetMessagesHistoryResponse> {
    Util.validateModel(request);
    return $tea.cast<GetMessagesHistoryResponse>(await this.doRequest("1.0", "universalsaas.yuqing.messages.history.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetMessagesHistoryResponse({}));
  }

  /**
   * Description: 提交实时热搜任务
   * Summary: 提交实时热搜任务
   */
  async submitHotspotTask(request: SubmitHotspotTaskRequest): Promise<SubmitHotspotTaskResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.submitHotspotTaskEx(request, headers, runtime);
  }

  /**
   * Description: 提交实时热搜任务
   * Summary: 提交实时热搜任务
   */
  async submitHotspotTaskEx(request: SubmitHotspotTaskRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SubmitHotspotTaskResponse> {
    Util.validateModel(request);
    return $tea.cast<SubmitHotspotTaskResponse>(await this.doRequest("1.0", "universalsaas.yuqing.hotspot.task.submit", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SubmitHotspotTaskResponse({}));
  }

  /**
   * Description: 获取实时热搜任务结果
   * Summary: 获取实时热搜任务结果
   */
  async getHotspotTask(request: GetHotspotTaskRequest): Promise<GetHotspotTaskResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getHotspotTaskEx(request, headers, runtime);
  }

  /**
   * Description: 获取实时热搜任务结果
   * Summary: 获取实时热搜任务结果
   */
  async getHotspotTaskEx(request: GetHotspotTaskRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetHotspotTaskResponse> {
    Util.validateModel(request);
    return $tea.cast<GetHotspotTaskResponse>(await this.doRequest("1.0", "universalsaas.yuqing.hotspot.task.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetHotspotTaskResponse({}));
  }

  /**
   * Description: 获取stsToken，作用于通用SAAS业务
   * Summary: 获取stsToken
   */
  async getStsToken(request: GetStsTokenRequest): Promise<GetStsTokenResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getStsTokenEx(request, headers, runtime);
  }

  /**
   * Description: 获取stsToken，作用于通用SAAS业务
   * Summary: 获取stsToken
   */
  async getStsTokenEx(request: GetStsTokenRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetStsTokenResponse> {
    Util.validateModel(request);
    return $tea.cast<GetStsTokenResponse>(await this.doRequest("1.0", "universalsaas.yuqing.sts.token.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetStsTokenResponse({}));
  }

  /**
   * Description: 通用操作接口
   * Summary: 通用操作接口
   */
  async operateCommonInterface(request: OperateCommonInterfaceRequest): Promise<OperateCommonInterfaceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.operateCommonInterfaceEx(request, headers, runtime);
  }

  /**
   * Description: 通用操作接口
   * Summary: 通用操作接口
   */
  async operateCommonInterfaceEx(request: OperateCommonInterfaceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<OperateCommonInterfaceResponse> {
    Util.validateModel(request);
    return $tea.cast<OperateCommonInterfaceResponse>(await this.doRequest("1.0", "universalsaas.yuqing.common.interface.operate", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new OperateCommonInterfaceResponse({}));
  }

}
