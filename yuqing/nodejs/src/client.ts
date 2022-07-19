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
  relevanceScore?: number;
  // 相似文章数
  similarNumber?: number;
  // 微博评论id
  weiboCommentId?: string;
  // 微博消息id
  weiboMid?: string;
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
      relevanceScore: 'number',
      similarNumber: 'number',
      weiboCommentId: 'string',
      weiboMid: 'string',
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
          sdk_version: "1.1.14",
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

}
