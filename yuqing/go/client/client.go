// This file is auto-generated, don't edit it. Thanks.
package client

import (
	rpcutil "github.com/alibabacloud-go/tea-rpc-utils/service"
	util "github.com/alibabacloud-go/tea-utils/v2/service"
	"github.com/alibabacloud-go/tea/tea"
	antchainutil "github.com/antchain-openapi-sdk-go/antchain-util/service"
)

/**
 * Model for initing client
 */
type Config struct {
	// accesskey id
	AccessKeyId *string `json:"accessKeyId,omitempty" xml:"accessKeyId,omitempty"`
	// accesskey secret
	AccessKeySecret *string `json:"accessKeySecret,omitempty" xml:"accessKeySecret,omitempty"`
	// security token
	SecurityToken *string `json:"securityToken,omitempty" xml:"securityToken,omitempty"`
	// http protocol
	Protocol *string `json:"protocol,omitempty" xml:"protocol,omitempty"`
	// read timeout
	ReadTimeout *int `json:"readTimeout,omitempty" xml:"readTimeout,omitempty"`
	// connect timeout
	ConnectTimeout *int `json:"connectTimeout,omitempty" xml:"connectTimeout,omitempty"`
	// http proxy
	HttpProxy *string `json:"httpProxy,omitempty" xml:"httpProxy,omitempty"`
	// https proxy
	HttpsProxy *string `json:"httpsProxy,omitempty" xml:"httpsProxy,omitempty"`
	// endpoint
	Endpoint *string `json:"endpoint,omitempty" xml:"endpoint,omitempty"`
	// proxy white list
	NoProxy *string `json:"noProxy,omitempty" xml:"noProxy,omitempty"`
	// max idle conns
	MaxIdleConns *int `json:"maxIdleConns,omitempty" xml:"maxIdleConns,omitempty"`
	// user agent
	UserAgent *string `json:"userAgent,omitempty" xml:"userAgent,omitempty"`
	// socks5 proxy
	Socks5Proxy *string `json:"socks5Proxy,omitempty" xml:"socks5Proxy,omitempty"`
	// socks5 network
	Socks5NetWork *string `json:"socks5NetWork,omitempty" xml:"socks5NetWork,omitempty"`
	// 长链接最大空闲时长
	MaxIdleTimeMillis *int `json:"maxIdleTimeMillis,omitempty" xml:"maxIdleTimeMillis,omitempty"`
	// 长链接最大连接时长
	KeepAliveDurationMillis *int `json:"keepAliveDurationMillis,omitempty" xml:"keepAliveDurationMillis,omitempty"`
	// 最大连接数（长链接最大总数）
	MaxRequests *int `json:"maxRequests,omitempty" xml:"maxRequests,omitempty"`
	// 每个目标主机的最大连接数（分主机域名的长链接最大总数
	MaxRequestsPerHost *int `json:"maxRequestsPerHost,omitempty" xml:"maxRequestsPerHost,omitempty"`
}

func (s Config) String() string {
	return tea.Prettify(s)
}

func (s Config) GoString() string {
	return s.String()
}

func (s *Config) SetAccessKeyId(v string) *Config {
	s.AccessKeyId = &v
	return s
}

func (s *Config) SetAccessKeySecret(v string) *Config {
	s.AccessKeySecret = &v
	return s
}

func (s *Config) SetSecurityToken(v string) *Config {
	s.SecurityToken = &v
	return s
}

func (s *Config) SetProtocol(v string) *Config {
	s.Protocol = &v
	return s
}

func (s *Config) SetReadTimeout(v int) *Config {
	s.ReadTimeout = &v
	return s
}

func (s *Config) SetConnectTimeout(v int) *Config {
	s.ConnectTimeout = &v
	return s
}

func (s *Config) SetHttpProxy(v string) *Config {
	s.HttpProxy = &v
	return s
}

func (s *Config) SetHttpsProxy(v string) *Config {
	s.HttpsProxy = &v
	return s
}

func (s *Config) SetEndpoint(v string) *Config {
	s.Endpoint = &v
	return s
}

func (s *Config) SetNoProxy(v string) *Config {
	s.NoProxy = &v
	return s
}

func (s *Config) SetMaxIdleConns(v int) *Config {
	s.MaxIdleConns = &v
	return s
}

func (s *Config) SetUserAgent(v string) *Config {
	s.UserAgent = &v
	return s
}

func (s *Config) SetSocks5Proxy(v string) *Config {
	s.Socks5Proxy = &v
	return s
}

func (s *Config) SetSocks5NetWork(v string) *Config {
	s.Socks5NetWork = &v
	return s
}

func (s *Config) SetMaxIdleTimeMillis(v int) *Config {
	s.MaxIdleTimeMillis = &v
	return s
}

func (s *Config) SetKeepAliveDurationMillis(v int) *Config {
	s.KeepAliveDurationMillis = &v
	return s
}

func (s *Config) SetMaxRequests(v int) *Config {
	s.MaxRequests = &v
	return s
}

func (s *Config) SetMaxRequestsPerHost(v int) *Config {
	s.MaxRequestsPerHost = &v
	return s
}

// 钉钉链接消息
type Link struct {
	// 文字
	Text *string `json:"text,omitempty" xml:"text,omitempty"`
	// 标题
	Title *string `json:"title,omitempty" xml:"title,omitempty"`
	// 图片地址
	PicUrl *string `json:"pic_url,omitempty" xml:"pic_url,omitempty"`
	// 链接
	MessageUrl *string `json:"message_url,omitempty" xml:"message_url,omitempty"`
}

func (s Link) String() string {
	return tea.Prettify(s)
}

func (s Link) GoString() string {
	return s.String()
}

func (s *Link) SetText(v string) *Link {
	s.Text = &v
	return s
}

func (s *Link) SetTitle(v string) *Link {
	s.Title = &v
	return s
}

func (s *Link) SetPicUrl(v string) *Link {
	s.PicUrl = &v
	return s
}

func (s *Link) SetMessageUrl(v string) *Link {
	s.MessageUrl = &v
	return s
}

// 钉钉点击
type Btn struct {
	// 标题
	Title *string `json:"title,omitempty" xml:"title,omitempty"`
	// 动作地址
	ActionUrl *string `json:"action_url,omitempty" xml:"action_url,omitempty"`
}

func (s Btn) String() string {
	return tea.Prettify(s)
}

func (s Btn) GoString() string {
	return s.String()
}

func (s *Btn) SetTitle(v string) *Btn {
	s.Title = &v
	return s
}

func (s *Btn) SetActionUrl(v string) *Btn {
	s.ActionUrl = &v
	return s
}

// 與情信息扩展字段
type YuqingMessageExtInfo struct {
	// 媒体地域
	MediaAreaCountry *string `json:"media_area_country,omitempty" xml:"media_area_country,omitempty"`
	// 媒体地域省份
	MediaAreaProvince *string `json:"media_area_province,omitempty" xml:"media_area_province,omitempty"`
	// 媒体地域-市
	MediaAreaCity *string `json:"media_area_city,omitempty" xml:"media_area_city,omitempty"`
	// 内容风险
	GeneralModel *string `json:"general_model,omitempty" xml:"general_model,omitempty"`
}

func (s YuqingMessageExtInfo) String() string {
	return tea.Prettify(s)
}

func (s YuqingMessageExtInfo) GoString() string {
	return s.String()
}

func (s *YuqingMessageExtInfo) SetMediaAreaCountry(v string) *YuqingMessageExtInfo {
	s.MediaAreaCountry = &v
	return s
}

func (s *YuqingMessageExtInfo) SetMediaAreaProvince(v string) *YuqingMessageExtInfo {
	s.MediaAreaProvince = &v
	return s
}

func (s *YuqingMessageExtInfo) SetMediaAreaCity(v string) *YuqingMessageExtInfo {
	s.MediaAreaCity = &v
	return s
}

func (s *YuqingMessageExtInfo) SetGeneralModel(v string) *YuqingMessageExtInfo {
	s.GeneralModel = &v
	return s
}

// 消息填充内容
type Pair struct {
	// key
	Key *string `json:"key,omitempty" xml:"key,omitempty" require:"true"`
	// value
	Value *string `json:"value,omitempty" xml:"value,omitempty" require:"true"`
}

func (s Pair) String() string {
	return tea.Prettify(s)
}

func (s Pair) GoString() string {
	return s.String()
}

func (s *Pair) SetKey(v string) *Pair {
	s.Key = &v
	return s
}

func (s *Pair) SetValue(v string) *Pair {
	s.Value = &v
	return s
}

// 热搜结构体
type HotspotMessage struct {
	// 热搜/热榜/话题 对应用户id (可能为空)
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
	// 在榜总时间
	TotalExistTimestamp *int64 `json:"total_exist_timestamp,omitempty" xml:"total_exist_timestamp,omitempty" require:"true"`
	// 下榜时间
	LastExistDateFormat *string `json:"last_exist_date_format,omitempty" xml:"last_exist_date_format,omitempty" require:"true"`
	// 爬虫爬取的时间
	CrawlerTimeFmt *string `json:"crawler_time_fmt,omitempty" xml:"crawler_time_fmt,omitempty" require:"true"`
	// 第一次上榜的格式化时间
	FirstExistDateFormat *string `json:"first_exist_date_format,omitempty" xml:"first_exist_date_format,omitempty" require:"true"`
	// 最高排名的总时长
	MaxRankTotalTimestamp *int64 `json:"max_rank_total_timestamp,omitempty" xml:"max_rank_total_timestamp,omitempty" require:"true"`
	// 跟随量
	FollowersCount *int64 `json:"followers_count,omitempty" xml:"followers_count,omitempty" require:"true"`
	// 在榜单中的最高排名
	MaxRank *int64 `json:"max_rank,omitempty" xml:"max_rank,omitempty" require:"true"`
	// 阅读量
	ReadsCount *int64 `json:"reads_count,omitempty" xml:"reads_count,omitempty" require:"true"`
	// 评论数
	CommentsCount *int64 `json:"comments_count,omitempty" xml:"comments_count,omitempty" require:"true"`
	// 标题，例如话题的标题就是话题本身
	DocTitle *string `json:"doc_title,omitempty" xml:"doc_title,omitempty" require:"true"`
	// 首次上榜排名
	FirstRank *int64 `json:"first_rank,omitempty" xml:"first_rank,omitempty" require:"true"`
	// 原创人数
	OriginalCount *int64 `json:"original_count,omitempty" xml:"original_count,omitempty" require:"true"`
	// 主持人
	PresenterName *string `json:"presenter_name,omitempty" xml:"presenter_name,omitempty" require:"true"`
	// 热搜在热搜榜的位置
	Rank *int64 `json:"rank,omitempty" xml:"rank,omitempty" require:"true"`
	// 热点媒体类型
	MediaType *string `json:"media_type,omitempty" xml:"media_type,omitempty" require:"true"`
	// 文档id
	DocId *string `json:"doc_id,omitempty" xml:"doc_id,omitempty" require:"true"`
	// 类型
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 热度值
	HotValue *int64 `json:"hot_value,omitempty" xml:"hot_value,omitempty" require:"true"`
	// 内容，热榜数据中存在着文章，热文就是有内容的
	DocContent *string `json:"doc_content,omitempty" xml:"doc_content,omitempty" require:"true"`
	// 热搜/热榜/话题 对应用户名称 (可能为空)
	ScreenName *string `json:"screen_name,omitempty" xml:"screen_name,omitempty" require:"true"`
	// 热点媒体子类型
	MediaSubType *string `json:"media_sub_type,omitempty" xml:"media_sub_type,omitempty" require:"true"`
	// 讨论量
	DiscussesCount *int64 `json:"discusses_count,omitempty" xml:"discusses_count,omitempty" require:"true"`
	// 分类
	Category *string `json:"category,omitempty" xml:"category,omitempty" require:"true"`
	// 视频量
	VideoCount *int64 `json:"video_count,omitempty" xml:"video_count,omitempty" require:"true"`
	// 最高排名的格式化总时长
	MaxRankTotalTimeFormat *string `json:"max_rank_total_time_format,omitempty" xml:"max_rank_total_time_format,omitempty" require:"true"`
	// 省
	Province *string `json:"province,omitempty" xml:"province,omitempty" require:"true"`
	// 在榜格式化的总时间
	TotalExistTimeFormat *string `json:"total_exist_time_format,omitempty" xml:"total_exist_time_format,omitempty" require:"true"`
	// 第一次上最高排名的时间
	FirstTopExistTimestamp *int64 `json:"first_top_exist_timestamp,omitempty" xml:"first_top_exist_timestamp,omitempty" require:"true"`
	// 链接地址
	DocUrl *string `json:"doc_url,omitempty" xml:"doc_url,omitempty"`
	// 最大的热度值
	MaxHotValue *int64 `json:"max_hot_value,omitempty" xml:"max_hot_value,omitempty" require:"true"`
	// 市
	City *string `json:"city,omitempty" xml:"city,omitempty" require:"true"`
	// 最后一次上榜的时间
	LastExistTimestamp *int64 `json:"last_exist_timestamp,omitempty" xml:"last_exist_timestamp,omitempty" require:"true"`
	// 第一次上最高排名的时间
	FirstTopExistDateFormat *string `json:"first_top_exist_date_format,omitempty" xml:"first_top_exist_date_format,omitempty" require:"true"`
	// 下榜排名
	LastRank *int64 `json:"last_rank,omitempty" xml:"last_rank,omitempty" require:"true"`
	// 首次上榜热度
	FirstHotValue *int64 `json:"first_hot_value,omitempty" xml:"first_hot_value,omitempty" require:"true"`
	// 热搜类型
	HotspotType *string `json:"hotspot_type,omitempty" xml:"hotspot_type,omitempty" require:"true"`
	// 第一次上榜的时间
	FirstXxistTimestamp *int64 `json:"first_xxist_timestamp,omitempty" xml:"first_xxist_timestamp,omitempty" require:"true"`
	// 第一次上榜时间
	FirstExistTimestamp *int64 `json:"first_exist_timestamp,omitempty" xml:"first_exist_timestamp,omitempty"`
}

func (s HotspotMessage) String() string {
	return tea.Prettify(s)
}

func (s HotspotMessage) GoString() string {
	return s.String()
}

func (s *HotspotMessage) SetUserId(v string) *HotspotMessage {
	s.UserId = &v
	return s
}

func (s *HotspotMessage) SetTotalExistTimestamp(v int64) *HotspotMessage {
	s.TotalExistTimestamp = &v
	return s
}

func (s *HotspotMessage) SetLastExistDateFormat(v string) *HotspotMessage {
	s.LastExistDateFormat = &v
	return s
}

func (s *HotspotMessage) SetCrawlerTimeFmt(v string) *HotspotMessage {
	s.CrawlerTimeFmt = &v
	return s
}

func (s *HotspotMessage) SetFirstExistDateFormat(v string) *HotspotMessage {
	s.FirstExistDateFormat = &v
	return s
}

func (s *HotspotMessage) SetMaxRankTotalTimestamp(v int64) *HotspotMessage {
	s.MaxRankTotalTimestamp = &v
	return s
}

func (s *HotspotMessage) SetFollowersCount(v int64) *HotspotMessage {
	s.FollowersCount = &v
	return s
}

func (s *HotspotMessage) SetMaxRank(v int64) *HotspotMessage {
	s.MaxRank = &v
	return s
}

func (s *HotspotMessage) SetReadsCount(v int64) *HotspotMessage {
	s.ReadsCount = &v
	return s
}

func (s *HotspotMessage) SetCommentsCount(v int64) *HotspotMessage {
	s.CommentsCount = &v
	return s
}

func (s *HotspotMessage) SetDocTitle(v string) *HotspotMessage {
	s.DocTitle = &v
	return s
}

func (s *HotspotMessage) SetFirstRank(v int64) *HotspotMessage {
	s.FirstRank = &v
	return s
}

func (s *HotspotMessage) SetOriginalCount(v int64) *HotspotMessage {
	s.OriginalCount = &v
	return s
}

func (s *HotspotMessage) SetPresenterName(v string) *HotspotMessage {
	s.PresenterName = &v
	return s
}

func (s *HotspotMessage) SetRank(v int64) *HotspotMessage {
	s.Rank = &v
	return s
}

func (s *HotspotMessage) SetMediaType(v string) *HotspotMessage {
	s.MediaType = &v
	return s
}

func (s *HotspotMessage) SetDocId(v string) *HotspotMessage {
	s.DocId = &v
	return s
}

func (s *HotspotMessage) SetType(v string) *HotspotMessage {
	s.Type = &v
	return s
}

func (s *HotspotMessage) SetHotValue(v int64) *HotspotMessage {
	s.HotValue = &v
	return s
}

func (s *HotspotMessage) SetDocContent(v string) *HotspotMessage {
	s.DocContent = &v
	return s
}

func (s *HotspotMessage) SetScreenName(v string) *HotspotMessage {
	s.ScreenName = &v
	return s
}

func (s *HotspotMessage) SetMediaSubType(v string) *HotspotMessage {
	s.MediaSubType = &v
	return s
}

func (s *HotspotMessage) SetDiscussesCount(v int64) *HotspotMessage {
	s.DiscussesCount = &v
	return s
}

func (s *HotspotMessage) SetCategory(v string) *HotspotMessage {
	s.Category = &v
	return s
}

func (s *HotspotMessage) SetVideoCount(v int64) *HotspotMessage {
	s.VideoCount = &v
	return s
}

func (s *HotspotMessage) SetMaxRankTotalTimeFormat(v string) *HotspotMessage {
	s.MaxRankTotalTimeFormat = &v
	return s
}

func (s *HotspotMessage) SetProvince(v string) *HotspotMessage {
	s.Province = &v
	return s
}

func (s *HotspotMessage) SetTotalExistTimeFormat(v string) *HotspotMessage {
	s.TotalExistTimeFormat = &v
	return s
}

func (s *HotspotMessage) SetFirstTopExistTimestamp(v int64) *HotspotMessage {
	s.FirstTopExistTimestamp = &v
	return s
}

func (s *HotspotMessage) SetDocUrl(v string) *HotspotMessage {
	s.DocUrl = &v
	return s
}

func (s *HotspotMessage) SetMaxHotValue(v int64) *HotspotMessage {
	s.MaxHotValue = &v
	return s
}

func (s *HotspotMessage) SetCity(v string) *HotspotMessage {
	s.City = &v
	return s
}

func (s *HotspotMessage) SetLastExistTimestamp(v int64) *HotspotMessage {
	s.LastExistTimestamp = &v
	return s
}

func (s *HotspotMessage) SetFirstTopExistDateFormat(v string) *HotspotMessage {
	s.FirstTopExistDateFormat = &v
	return s
}

func (s *HotspotMessage) SetLastRank(v int64) *HotspotMessage {
	s.LastRank = &v
	return s
}

func (s *HotspotMessage) SetFirstHotValue(v int64) *HotspotMessage {
	s.FirstHotValue = &v
	return s
}

func (s *HotspotMessage) SetHotspotType(v string) *HotspotMessage {
	s.HotspotType = &v
	return s
}

func (s *HotspotMessage) SetFirstXxistTimestamp(v int64) *HotspotMessage {
	s.FirstXxistTimestamp = &v
	return s
}

func (s *HotspotMessage) SetFirstExistTimestamp(v int64) *HotspotMessage {
	s.FirstExistTimestamp = &v
	return s
}

// 钉钉Markdown
type Markdown struct {
	// 标题
	Title *string `json:"title,omitempty" xml:"title,omitempty"`
	// 内容
	Text *string `json:"text,omitempty" xml:"text,omitempty"`
}

func (s Markdown) String() string {
	return tea.Prettify(s)
}

func (s Markdown) GoString() string {
	return s.String()
}

func (s *Markdown) SetTitle(v string) *Markdown {
	s.Title = &v
	return s
}

func (s *Markdown) SetText(v string) *Markdown {
	s.Text = &v
	return s
}

// 钉钉At
type At struct {
	// @手机号
	AtMobiles []*string `json:"at_mobiles,omitempty" xml:"at_mobiles,omitempty" type:"Repeated"`
	// @用户ID
	AtUserIds []*string `json:"at_user_ids,omitempty" xml:"at_user_ids,omitempty" type:"Repeated"`
	// @所有人
	IsAtAll *bool `json:"is_at_all,omitempty" xml:"is_at_all,omitempty"`
}

func (s At) String() string {
	return tea.Prettify(s)
}

func (s At) GoString() string {
	return s.String()
}

func (s *At) SetAtMobiles(v []*string) *At {
	s.AtMobiles = v
	return s
}

func (s *At) SetAtUserIds(v []*string) *At {
	s.AtUserIds = v
	return s
}

func (s *At) SetIsAtAll(v bool) *At {
	s.IsAtAll = &v
	return s
}

// YuqingMessage
type YuqingMessage struct {
	// 作者头像地址
	AuthorAvatarUrl *string `json:"author_avatar_url,omitempty" xml:"author_avatar_url,omitempty"`
	// 粉丝数
	AuthorFollowersCount *int64 `json:"author_followers_count,omitempty" xml:"author_followers_count,omitempty"`
	// 好友数
	AuthorFriendsCount *int64 `json:"author_friends_count,omitempty" xml:"author_friends_count,omitempty"`
	// 作者id
	AuthorId *string `json:"author_id,omitempty" xml:"author_id,omitempty"`
	// 作者名称
	AuthorName *string `json:"author_name,omitempty" xml:"author_name,omitempty"`
	// 发文数
	AuthorStatusesCount *int64 `json:"author_statuses_count,omitempty" xml:"author_statuses_count,omitempty"`
	// 作者认证类型
	AuthorVerifyType *string `json:"author_verify_type,omitempty" xml:"author_verify_type,omitempty"`
	// 舆情文章被抓取的时间戳
	CreateTime *int64 `json:"create_time,omitempty" xml:"create_time,omitempty"`
	// 文章正文内容
	DocContent *string `json:"doc_content,omitempty" xml:"doc_content,omitempty"`
	// 文章摘要
	DocContentBrief *string `json:"doc_content_brief,omitempty" xml:"doc_content_brief,omitempty"`
	// 文章内容签名，如果是转发微博或者其他有父内容的doc，计算的是父文章的得分。一般用于去重，相同的doc_content_sign说明内容相同
	DocContentSign *string `json:"doc_content_sign,omitempty" xml:"doc_content_sign,omitempty"`
	// 文章唯一docId
	DocId *string `json:"doc_id,omitempty" xml:"doc_id,omitempty"`
	// 文章自身的内容签名，转发微博计算的是转发内容的contentSign，与父微博无关
	DocSelfContentSign *string `json:"doc_self_content_sign,omitempty" xml:"doc_self_content_sign,omitempty"`
	// 文章标题
	DocTitle *string `json:"doc_title,omitempty" xml:"doc_title,omitempty"`
	// 原文地址
	DocUrl *string `json:"doc_url,omitempty" xml:"doc_url,omitempty"`
	// 情感的正负面，-1代表负面，1代表非负面
	EmotionType *int64 `json:"emotion_type,omitempty" xml:"emotion_type,omitempty"`
	// 命中的搜索词列表
	HighlightKeywords []*string `json:"highlight_keywords,omitempty" xml:"highlight_keywords,omitempty" type:"Repeated"`
	// 媒体类型，枚举值
	MediaType *string `json:"media_type,omitempty" xml:"media_type,omitempty"`
	// 舆情消息类型:转发,评论/回复, 原文,群聊等
	MessageType *string `json:"message_type,omitempty" xml:"message_type,omitempty"`
	// 文章的父docId，如被转发的文章docId
	ParentDocId *string `json:"parent_doc_id,omitempty" xml:"parent_doc_id,omitempty"`
	// 舆情文章的发布时间戳
	PublishTime *int64 `json:"publish_time,omitempty" xml:"publish_time,omitempty"`
	// 相关性得分
	RelevanceScore *string `json:"relevance_score,omitempty" xml:"relevance_score,omitempty"`
	// 相似文章数
	SimilarNumber *int64 `json:"similar_number,omitempty" xml:"similar_number,omitempty"`
	// 微博评论id
	WeiboCommentId *string `json:"weibo_comment_id,omitempty" xml:"weibo_comment_id,omitempty"`
	// 微博消息id
	WeiboMid *string `json:"weibo_mid,omitempty" xml:"weibo_mid,omitempty"`
	// 传播得分，0-10
	PropagationScore *string `json:"propagation_score,omitempty" xml:"propagation_score,omitempty"`
	// 情感得分
	EmotionScore *string `json:"emotion_score,omitempty" xml:"emotion_score,omitempty"`
	// 影响力得分
	InfluenceScore *string `json:"influence_score,omitempty" xml:"influence_score,omitempty"`
	// 提级地域列表
	DocAreas []*string `json:"doc_areas,omitempty" xml:"doc_areas,omitempty" type:"Repeated"`
	// 媒体名称
	MediaName *string `json:"media_name,omitempty" xml:"media_name,omitempty"`
	// 扩展信息
	ExtInfo *YuqingMessageExtInfo `json:"ext_info,omitempty" xml:"ext_info,omitempty"`
	// 文章转载自
	DocReprintName *string `json:"doc_reprint_name,omitempty" xml:"doc_reprint_name,omitempty"`
	// 视频列表地址
	ContentVideoUrls *string `json:"content_video_urls,omitempty" xml:"content_video_urls,omitempty"`
	// 图片列表地址
	ContentImageUrls *string `json:"content_image_urls,omitempty" xml:"content_image_urls,omitempty"`
	// 图片识别出来的文本
	ContentImageText *string `json:"content_image_text,omitempty" xml:"content_image_text,omitempty"`
	// 音频列表地址
	ContentAudioUrls *string `json:"content_audio_urls,omitempty" xml:"content_audio_urls,omitempty"`
	// 音频识别出来的文本
	ContentAudioText *string `json:"content_audio_text,omitempty" xml:"content_audio_text,omitempty"`
	// 视频识别出来的文本
	ContentVideoText *string `json:"content_video_text,omitempty" xml:"content_video_text,omitempty"`
	// 文章转发数
	DocRepostsCount *int64 `json:"doc_reposts_count,omitempty" xml:"doc_reposts_count,omitempty"`
	// 文章评论数
	DocCommentsCount *int64 `json:"doc_comments_count,omitempty" xml:"doc_comments_count,omitempty"`
	// 文章点赞数
	DocLikesCount *int64 `json:"doc_likes_count,omitempty" xml:"doc_likes_count,omitempty"`
	// 文章阅读数
	DocReadsCount *int64 `json:"doc_reads_count,omitempty" xml:"doc_reads_count,omitempty"`
	// 回答数
	DocAnswersCount *int64 `json:"doc_answers_count,omitempty" xml:"doc_answers_count,omitempty"`
}

func (s YuqingMessage) String() string {
	return tea.Prettify(s)
}

func (s YuqingMessage) GoString() string {
	return s.String()
}

func (s *YuqingMessage) SetAuthorAvatarUrl(v string) *YuqingMessage {
	s.AuthorAvatarUrl = &v
	return s
}

func (s *YuqingMessage) SetAuthorFollowersCount(v int64) *YuqingMessage {
	s.AuthorFollowersCount = &v
	return s
}

func (s *YuqingMessage) SetAuthorFriendsCount(v int64) *YuqingMessage {
	s.AuthorFriendsCount = &v
	return s
}

func (s *YuqingMessage) SetAuthorId(v string) *YuqingMessage {
	s.AuthorId = &v
	return s
}

func (s *YuqingMessage) SetAuthorName(v string) *YuqingMessage {
	s.AuthorName = &v
	return s
}

func (s *YuqingMessage) SetAuthorStatusesCount(v int64) *YuqingMessage {
	s.AuthorStatusesCount = &v
	return s
}

func (s *YuqingMessage) SetAuthorVerifyType(v string) *YuqingMessage {
	s.AuthorVerifyType = &v
	return s
}

func (s *YuqingMessage) SetCreateTime(v int64) *YuqingMessage {
	s.CreateTime = &v
	return s
}

func (s *YuqingMessage) SetDocContent(v string) *YuqingMessage {
	s.DocContent = &v
	return s
}

func (s *YuqingMessage) SetDocContentBrief(v string) *YuqingMessage {
	s.DocContentBrief = &v
	return s
}

func (s *YuqingMessage) SetDocContentSign(v string) *YuqingMessage {
	s.DocContentSign = &v
	return s
}

func (s *YuqingMessage) SetDocId(v string) *YuqingMessage {
	s.DocId = &v
	return s
}

func (s *YuqingMessage) SetDocSelfContentSign(v string) *YuqingMessage {
	s.DocSelfContentSign = &v
	return s
}

func (s *YuqingMessage) SetDocTitle(v string) *YuqingMessage {
	s.DocTitle = &v
	return s
}

func (s *YuqingMessage) SetDocUrl(v string) *YuqingMessage {
	s.DocUrl = &v
	return s
}

func (s *YuqingMessage) SetEmotionType(v int64) *YuqingMessage {
	s.EmotionType = &v
	return s
}

func (s *YuqingMessage) SetHighlightKeywords(v []*string) *YuqingMessage {
	s.HighlightKeywords = v
	return s
}

func (s *YuqingMessage) SetMediaType(v string) *YuqingMessage {
	s.MediaType = &v
	return s
}

func (s *YuqingMessage) SetMessageType(v string) *YuqingMessage {
	s.MessageType = &v
	return s
}

func (s *YuqingMessage) SetParentDocId(v string) *YuqingMessage {
	s.ParentDocId = &v
	return s
}

func (s *YuqingMessage) SetPublishTime(v int64) *YuqingMessage {
	s.PublishTime = &v
	return s
}

func (s *YuqingMessage) SetRelevanceScore(v string) *YuqingMessage {
	s.RelevanceScore = &v
	return s
}

func (s *YuqingMessage) SetSimilarNumber(v int64) *YuqingMessage {
	s.SimilarNumber = &v
	return s
}

func (s *YuqingMessage) SetWeiboCommentId(v string) *YuqingMessage {
	s.WeiboCommentId = &v
	return s
}

func (s *YuqingMessage) SetWeiboMid(v string) *YuqingMessage {
	s.WeiboMid = &v
	return s
}

func (s *YuqingMessage) SetPropagationScore(v string) *YuqingMessage {
	s.PropagationScore = &v
	return s
}

func (s *YuqingMessage) SetEmotionScore(v string) *YuqingMessage {
	s.EmotionScore = &v
	return s
}

func (s *YuqingMessage) SetInfluenceScore(v string) *YuqingMessage {
	s.InfluenceScore = &v
	return s
}

func (s *YuqingMessage) SetDocAreas(v []*string) *YuqingMessage {
	s.DocAreas = v
	return s
}

func (s *YuqingMessage) SetMediaName(v string) *YuqingMessage {
	s.MediaName = &v
	return s
}

func (s *YuqingMessage) SetExtInfo(v *YuqingMessageExtInfo) *YuqingMessage {
	s.ExtInfo = v
	return s
}

func (s *YuqingMessage) SetDocReprintName(v string) *YuqingMessage {
	s.DocReprintName = &v
	return s
}

func (s *YuqingMessage) SetContentVideoUrls(v string) *YuqingMessage {
	s.ContentVideoUrls = &v
	return s
}

func (s *YuqingMessage) SetContentImageUrls(v string) *YuqingMessage {
	s.ContentImageUrls = &v
	return s
}

func (s *YuqingMessage) SetContentImageText(v string) *YuqingMessage {
	s.ContentImageText = &v
	return s
}

func (s *YuqingMessage) SetContentAudioUrls(v string) *YuqingMessage {
	s.ContentAudioUrls = &v
	return s
}

func (s *YuqingMessage) SetContentAudioText(v string) *YuqingMessage {
	s.ContentAudioText = &v
	return s
}

func (s *YuqingMessage) SetContentVideoText(v string) *YuqingMessage {
	s.ContentVideoText = &v
	return s
}

func (s *YuqingMessage) SetDocRepostsCount(v int64) *YuqingMessage {
	s.DocRepostsCount = &v
	return s
}

func (s *YuqingMessage) SetDocCommentsCount(v int64) *YuqingMessage {
	s.DocCommentsCount = &v
	return s
}

func (s *YuqingMessage) SetDocLikesCount(v int64) *YuqingMessage {
	s.DocLikesCount = &v
	return s
}

func (s *YuqingMessage) SetDocReadsCount(v int64) *YuqingMessage {
	s.DocReadsCount = &v
	return s
}

func (s *YuqingMessage) SetDocAnswersCount(v int64) *YuqingMessage {
	s.DocAnswersCount = &v
	return s
}

// 钉钉动作卡片
type ActionCard struct {
	// 标题
	Title *string `json:"title,omitempty" xml:"title,omitempty"`
	// 内容
	Text *string `json:"text,omitempty" xml:"text,omitempty"`
	// btn_orientation
	BtnOrientation *string `json:"btn_orientation,omitempty" xml:"btn_orientation,omitempty"`
	// 简单标题
	SingleTitle *string `json:"single_title,omitempty" xml:"single_title,omitempty"`
	// 简单地址
	SingleUrl *string `json:"single_url,omitempty" xml:"single_url,omitempty"`
	// 点击
	Btns []*Btn `json:"btns,omitempty" xml:"btns,omitempty" type:"Repeated"`
}

func (s ActionCard) String() string {
	return tea.Prettify(s)
}

func (s ActionCard) GoString() string {
	return s.String()
}

func (s *ActionCard) SetTitle(v string) *ActionCard {
	s.Title = &v
	return s
}

func (s *ActionCard) SetText(v string) *ActionCard {
	s.Text = &v
	return s
}

func (s *ActionCard) SetBtnOrientation(v string) *ActionCard {
	s.BtnOrientation = &v
	return s
}

func (s *ActionCard) SetSingleTitle(v string) *ActionCard {
	s.SingleTitle = &v
	return s
}

func (s *ActionCard) SetSingleUrl(v string) *ActionCard {
	s.SingleUrl = &v
	return s
}

func (s *ActionCard) SetBtns(v []*Btn) *ActionCard {
	s.Btns = v
	return s
}

// 钉钉FeedCard
type FeedCard struct {
	// 卡片流
	Links []*Link `json:"links,omitempty" xml:"links,omitempty" type:"Repeated"`
}

func (s FeedCard) String() string {
	return tea.Prettify(s)
}

func (s FeedCard) GoString() string {
	return s.String()
}

func (s *FeedCard) SetLinks(v []*Link) *FeedCard {
	s.Links = v
	return s
}

// 钉钉文字消息
type Text struct {
	// 内容
	Content *string `json:"content,omitempty" xml:"content,omitempty"`
}

func (s Text) String() string {
	return tea.Prettify(s)
}

func (s Text) GoString() string {
	return s.String()
}

func (s *Text) SetContent(v string) *Text {
	s.Content = &v
	return s
}

// 其他过滤条件
type FieldCondition struct {
	// 字段名称
	FieldName *string `json:"field_name,omitempty" xml:"field_name,omitempty" require:"true"`
	// 复杂查询下，嵌套子条件字段jsonPath
	NestFieldPath *string `json:"nest_field_path,omitempty" xml:"nest_field_path,omitempty"`
	// 复杂查询下，嵌套子条件字段值
	NestFieldValue []*int64 `json:"nest_field_value,omitempty" xml:"nest_field_value,omitempty" type:"Repeated"`
	// 操作符
	OperateType *string `json:"operate_type,omitempty" xml:"operate_type,omitempty" require:"true"`
	// 关键字
	Value *string `json:"value,omitempty" xml:"value,omitempty" require:"true"`
}

func (s FieldCondition) String() string {
	return tea.Prettify(s)
}

func (s FieldCondition) GoString() string {
	return s.String()
}

func (s *FieldCondition) SetFieldName(v string) *FieldCondition {
	s.FieldName = &v
	return s
}

func (s *FieldCondition) SetNestFieldPath(v string) *FieldCondition {
	s.NestFieldPath = &v
	return s
}

func (s *FieldCondition) SetNestFieldValue(v []*int64) *FieldCondition {
	s.NestFieldValue = v
	return s
}

func (s *FieldCondition) SetOperateType(v string) *FieldCondition {
	s.OperateType = &v
	return s
}

func (s *FieldCondition) SetValue(v string) *FieldCondition {
	s.Value = &v
	return s
}

// 钉钉消息体
type DingTalkContent struct {
	// webHook
	WebHook *string `json:"web_hook,omitempty" xml:"web_hook,omitempty"`
	// 消息类型
	Msgtype *string `json:"msgtype,omitempty" xml:"msgtype,omitempty"`
	// 文字
	Text *Text `json:"text,omitempty" xml:"text,omitempty"`
	// 链接
	Link *Link `json:"link,omitempty" xml:"link,omitempty"`
	// markdown
	Markdown *Markdown `json:"markdown,omitempty" xml:"markdown,omitempty"`
	// actionCard
	ActionCard *ActionCard `json:"action_card,omitempty" xml:"action_card,omitempty"`
	// feedCard
	FeedCard *FeedCard `json:"feed_card,omitempty" xml:"feed_card,omitempty"`
	// at
	At *At `json:"at,omitempty" xml:"at,omitempty"`
}

func (s DingTalkContent) String() string {
	return tea.Prettify(s)
}

func (s DingTalkContent) GoString() string {
	return s.String()
}

func (s *DingTalkContent) SetWebHook(v string) *DingTalkContent {
	s.WebHook = &v
	return s
}

func (s *DingTalkContent) SetMsgtype(v string) *DingTalkContent {
	s.Msgtype = &v
	return s
}

func (s *DingTalkContent) SetText(v *Text) *DingTalkContent {
	s.Text = v
	return s
}

func (s *DingTalkContent) SetLink(v *Link) *DingTalkContent {
	s.Link = v
	return s
}

func (s *DingTalkContent) SetMarkdown(v *Markdown) *DingTalkContent {
	s.Markdown = v
	return s
}

func (s *DingTalkContent) SetActionCard(v *ActionCard) *DingTalkContent {
	s.ActionCard = v
	return s
}

func (s *DingTalkContent) SetFeedCard(v *FeedCard) *DingTalkContent {
	s.FeedCard = v
	return s
}

func (s *DingTalkContent) SetAt(v *At) *DingTalkContent {
	s.At = v
	return s
}

// 预警消息体
type Alarm struct {
	// 人工打的标签
	Tags []*string `json:"tags,omitempty" xml:"tags,omitempty" type:"Repeated"`
	// 预警内容摘要
	Content *string `json:"content,omitempty" xml:"content,omitempty"`
	// 预警时间戳
	AlarmTimestamp *int64 `json:"alarm_timestamp,omitempty" xml:"alarm_timestamp,omitempty"`
	// 舆情项目id
	ProjectId *int64 `json:"project_id,omitempty" xml:"project_id,omitempty"`
	// 修改人
	ModifierName *string `json:"modifier_name,omitempty" xml:"modifier_name,omitempty"`
	// 消息标题
	Title *string `json:"title,omitempty" xml:"title,omitempty"`
	// 消息id
	Id *int64 `json:"id,omitempty" xml:"id,omitempty"`
	// 作者名称
	AuthorName *string `json:"author_name,omitempty" xml:"author_name,omitempty"`
	// 预警规则id
	AlarmRuleId *int64 `json:"alarm_rule_id,omitempty" xml:"alarm_rule_id,omitempty"`
	// 预警规则类型
	Type *string `json:"type,omitempty" xml:"type,omitempty"`
	// 修改时间戳
	GmtModifiedTimestamp *int64 `json:"gmt_modified_timestamp,omitempty" xml:"gmt_modified_timestamp,omitempty"`
	// 完整消息
	Message *YuqingMessage `json:"message,omitempty" xml:"message,omitempty"`
	// project
	ProjectName *string `json:"project_name,omitempty" xml:"project_name,omitempty"`
	// alarm_rule_name
	AlarmRuleName *string `json:"alarm_rule_name,omitempty" xml:"alarm_rule_name,omitempty"`
	// alarm_level
	AlarmLevel *string `json:"alarm_level,omitempty" xml:"alarm_level,omitempty"`
	// doc_media_type
	DocMediaType *string `json:"doc_media_type,omitempty" xml:"doc_media_type,omitempty"`
	// status
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
}

func (s Alarm) String() string {
	return tea.Prettify(s)
}

func (s Alarm) GoString() string {
	return s.String()
}

func (s *Alarm) SetTags(v []*string) *Alarm {
	s.Tags = v
	return s
}

func (s *Alarm) SetContent(v string) *Alarm {
	s.Content = &v
	return s
}

func (s *Alarm) SetAlarmTimestamp(v int64) *Alarm {
	s.AlarmTimestamp = &v
	return s
}

func (s *Alarm) SetProjectId(v int64) *Alarm {
	s.ProjectId = &v
	return s
}

func (s *Alarm) SetModifierName(v string) *Alarm {
	s.ModifierName = &v
	return s
}

func (s *Alarm) SetTitle(v string) *Alarm {
	s.Title = &v
	return s
}

func (s *Alarm) SetId(v int64) *Alarm {
	s.Id = &v
	return s
}

func (s *Alarm) SetAuthorName(v string) *Alarm {
	s.AuthorName = &v
	return s
}

func (s *Alarm) SetAlarmRuleId(v int64) *Alarm {
	s.AlarmRuleId = &v
	return s
}

func (s *Alarm) SetType(v string) *Alarm {
	s.Type = &v
	return s
}

func (s *Alarm) SetGmtModifiedTimestamp(v int64) *Alarm {
	s.GmtModifiedTimestamp = &v
	return s
}

func (s *Alarm) SetMessage(v *YuqingMessage) *Alarm {
	s.Message = v
	return s
}

func (s *Alarm) SetProjectName(v string) *Alarm {
	s.ProjectName = &v
	return s
}

func (s *Alarm) SetAlarmRuleName(v string) *Alarm {
	s.AlarmRuleName = &v
	return s
}

func (s *Alarm) SetAlarmLevel(v string) *Alarm {
	s.AlarmLevel = &v
	return s
}

func (s *Alarm) SetDocMediaType(v string) *Alarm {
	s.DocMediaType = &v
	return s
}

func (s *Alarm) SetStatus(v string) *Alarm {
	s.Status = &v
	return s
}

// 深度分析配置
type AnalysisConfig struct {
	// 文章ID
	DocId *string `json:"doc_id,omitempty" xml:"doc_id,omitempty"`
	// 文章URL
	Url *string `json:"url,omitempty" xml:"url,omitempty"`
	// 项目ID
	ProjectId *int64 `json:"project_id,omitempty" xml:"project_id,omitempty"`
	// 模板ID
	FilterId *int64 `json:"filter_id,omitempty" xml:"filter_id,omitempty"`
	// 关键词列表
	PosKeywordList []*string `json:"pos_keyword_list,omitempty" xml:"pos_keyword_list,omitempty" type:"Repeated"`
	// 开始时间
	PublishTimeStart *int64 `json:"publish_time_start,omitempty" xml:"publish_time_start,omitempty"`
	// 结束时间
	PublishTimeEnd *int64 `json:"publish_time_end,omitempty" xml:"publish_time_end,omitempty"`
	// URL列表
	UrlList []*string `json:"url_list,omitempty" xml:"url_list,omitempty" type:"Repeated"`
}

func (s AnalysisConfig) String() string {
	return tea.Prettify(s)
}

func (s AnalysisConfig) GoString() string {
	return s.String()
}

func (s *AnalysisConfig) SetDocId(v string) *AnalysisConfig {
	s.DocId = &v
	return s
}

func (s *AnalysisConfig) SetUrl(v string) *AnalysisConfig {
	s.Url = &v
	return s
}

func (s *AnalysisConfig) SetProjectId(v int64) *AnalysisConfig {
	s.ProjectId = &v
	return s
}

func (s *AnalysisConfig) SetFilterId(v int64) *AnalysisConfig {
	s.FilterId = &v
	return s
}

func (s *AnalysisConfig) SetPosKeywordList(v []*string) *AnalysisConfig {
	s.PosKeywordList = v
	return s
}

func (s *AnalysisConfig) SetPublishTimeStart(v int64) *AnalysisConfig {
	s.PublishTimeStart = &v
	return s
}

func (s *AnalysisConfig) SetPublishTimeEnd(v int64) *AnalysisConfig {
	s.PublishTimeEnd = &v
	return s
}

func (s *AnalysisConfig) SetUrlList(v []*string) *AnalysisConfig {
	s.UrlList = v
	return s
}

// 热搜任务结构体
type HotspotTask struct {
	// 任务ID
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty" require:"true"`
	// 数量
	Count *int64 `json:"count,omitempty" xml:"count,omitempty" require:"true"`
	// 当前页
	PageNow *int64 `json:"page_now,omitempty" xml:"page_now,omitempty" require:"true"`
	// 每页数量
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
	// 数据
	Pages []*HotspotMessage `json:"pages,omitempty" xml:"pages,omitempty" require:"true" type:"Repeated"`
}

func (s HotspotTask) String() string {
	return tea.Prettify(s)
}

func (s HotspotTask) GoString() string {
	return s.String()
}

func (s *HotspotTask) SetTaskId(v string) *HotspotTask {
	s.TaskId = &v
	return s
}

func (s *HotspotTask) SetCount(v int64) *HotspotTask {
	s.Count = &v
	return s
}

func (s *HotspotTask) SetPageNow(v int64) *HotspotTask {
	s.PageNow = &v
	return s
}

func (s *HotspotTask) SetPageSize(v int64) *HotspotTask {
	s.PageSize = &v
	return s
}

func (s *HotspotTask) SetPages(v []*HotspotMessage) *HotspotTask {
	s.Pages = v
	return s
}

// 查询结构体
type SearchCondition struct {
	// 搭配词
	AssKeywordList []*string `json:"ass_keyword_list,omitempty" xml:"ass_keyword_list,omitempty" type:"Repeated"`
	// 被@的用户名称
	AtAuthorNameList []*string `json:"at_author_name_list,omitempty" xml:"at_author_name_list,omitempty" type:"Repeated"`
	// 作者名称
	AuthorNameList []*string `json:"author_name_list,omitempty" xml:"author_name_list,omitempty" type:"Repeated"`
	// 评论级别，1：100以内，2：100-1k，3：1k-1w以内，4：1w-10w，5，10w+
	CommentsLevel *int64 `json:"comments_level,omitempty" xml:"comments_level,omitempty"`
	// 内容长度级别，1：100以内，2：100-1k，3：1k-1w以内，4：1w-10w，5，10w+
	ContentLenLevel *string `json:"content_len_level,omitempty" xml:"content_len_level,omitempty"`
	// 抓取截止时间
	CreateTimeEnd *int64 `json:"create_time_end,omitempty" xml:"create_time_end,omitempty"`
	// 抓取起始时间
	CreateTimeStart *int64 `json:"create_time_start,omitempty" xml:"create_time_start,omitempty"`
	// 文章签名
	DocContentSign *string `json:"doc_content_sign,omitempty" xml:"doc_content_sign,omitempty"`
	// 舆情文章唯一docId
	DocIdList []*string `json:"doc_id_list,omitempty" xml:"doc_id_list,omitempty" type:"Repeated"`
	// 是否去重
	DuplicateRemoval *bool `json:"duplicate_removal,omitempty" xml:"duplicate_removal,omitempty"`
	// 情感类型，1非负，-1负面
	EmotionType *int64 `json:"emotion_type,omitempty" xml:"emotion_type,omitempty"`
	// 是否高亮关键词
	EnableKeywordHighlight *bool `json:"enable_keyword_highlight,omitempty" xml:"enable_keyword_highlight,omitempty"`
	// 排除被@的用户名称
	ExcludeAtAuthorNameList []*string `json:"exclude_at_author_name_list,omitempty" xml:"exclude_at_author_name_list,omitempty" type:"Repeated"`
	// 排除作者名称
	ExcludeAuthorNameList []*string `json:"exclude_author_name_list,omitempty" xml:"exclude_author_name_list,omitempty" type:"Repeated"`
	// 排除网站域名
	ExcludeHostNameList []*string `json:"exclude_host_name_list,omitempty" xml:"exclude_host_name_list,omitempty" type:"Repeated"`
	// 排除关键词标签Id列表
	ExcludeKeywordTagIds []*int64 `json:"exclude_keyword_tag_ids,omitempty" xml:"exclude_keyword_tag_ids,omitempty" type:"Repeated"`
	// 排除词
	ExcludeKeywordList []*string `json:"exclude_keyword_list,omitempty" xml:"exclude_keyword_list,omitempty" type:"Repeated"`
	// 标题排除词
	ExcludeKeywordListInTitle []*string `json:"exclude_keyword_list_in_title,omitempty" xml:"exclude_keyword_list_in_title,omitempty" type:"Repeated"`
	// 排除媒体库id列表
	ExcludeMediaLibraryIdList []*int64 `json:"exclude_media_library_id_list,omitempty" xml:"exclude_media_library_id_list,omitempty" type:"Repeated"`
	// 排除媒体名称
	ExcludeMediaNameList []*string `json:"exclude_media_name_list,omitempty" xml:"exclude_media_name_list,omitempty" type:"Repeated"`
	// 排除媒体类型，枚举值
	ExcludeMediaTypeList []*string `json:"exclude_media_type_list,omitempty" xml:"exclude_media_type_list,omitempty" type:"Repeated"`
	// 排除消息类型，枚举值
	ExcludeMessageTypeList []*string `json:"exclude_message_type_list,omitempty" xml:"exclude_message_type_list,omitempty" type:"Repeated"`
	// 文章是否含有图片
	HasImage *bool `json:"has_image,omitempty" xml:"has_image,omitempty"`
	// 是否含有视频
	HasVideo *bool `json:"has_video,omitempty" xml:"has_video,omitempty"`
	// 网站域名
	HostNameList []*string `json:"host_name_list,omitempty" xml:"host_name_list,omitempty" type:"Repeated"`
	// 关键词标签Id列表
	KeywordTagIds []*int64 `json:"keyword_tag_ids,omitempty" xml:"keyword_tag_ids,omitempty" type:"Repeated"`
	// 点赞级别，1：100以内，2：100-1k，3：1k-1w以内，4：1w-10w，5，10w+
	LikesLevel *int64 `json:"likes_level,omitempty" xml:"likes_level,omitempty"`
	// 媒体库id列表
	MediaLibraryIdList []*int64 `json:"media_library_id_list,omitempty" xml:"media_library_id_list,omitempty" type:"Repeated"`
	// 媒体名称
	MediaNameList []*string `json:"media_name_list,omitempty" xml:"media_name_list,omitempty" type:"Repeated"`
	// 体类型，枚举值
	MediaTypeList []*string `json:"media_type_list,omitempty" xml:"media_type_list,omitempty" type:"Repeated"`
	// 消息类型，枚举值
	MessageTypeList []*string `json:"message_type_list,omitempty" xml:"message_type_list,omitempty" type:"Repeated"`
	// 当前页
	PageNow *int64 `json:"page_now,omitempty" xml:"page_now,omitempty"`
	// 页大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// 舆情父文章的docId，一般用于查看某篇文章的评论
	ParentDocId *string `json:"parent_doc_id,omitempty" xml:"parent_doc_id,omitempty"`
	// 关键词
	PosKeywordList []*string `json:"pos_keyword_list,omitempty" xml:"pos_keyword_list,omitempty" type:"Repeated"`
	// 标题关键词
	PosKeywordListInTitle []*string `json:"pos_keyword_list_in_title,omitempty" xml:"pos_keyword_list_in_title,omitempty" type:"Repeated"`
	// 截止发布时间
	PublishTimeEnd *int64 `json:"publish_time_end,omitempty" xml:"publish_time_end,omitempty"`
	// 起始发布时间
	PublishTimeStart *int64 `json:"publish_time_start,omitempty" xml:"publish_time_start,omitempty"`
	// 阅读级别，1：100以内，2：100-1k，3：1k-1w以内，4：1w-10w，5，10w+
	ReadsLevel *int64 `json:"reads_level,omitempty" xml:"reads_level,omitempty"`
	// 相关性等级，1：低，2：中，3：高，4：低级别以上
	RelevanceLevel *int64 `json:"relevance_level,omitempty" xml:"relevance_level,omitempty"`
	// 转发级别，1：100以内，2：100-1k，3：1k-1w以内，4：1w-10w，5，10w+
	RepostLevel *int64 `json:"repost_level,omitempty" xml:"repost_level,omitempty"`
	// 排序字段
	SortBy *string `json:"sort_by,omitempty" xml:"sort_by,omitempty"`
	// 指定正反向排序
	SortByDirection *string `json:"sort_by_direction,omitempty" xml:"sort_by_direction,omitempty"`
	// #话题
	TopicList []*string `json:"topic_list,omitempty" xml:"topic_list,omitempty" type:"Repeated"`
	// 舆情文章截止更新时间
	UpdateTimeEnd *int64 `json:"update_time_end,omitempty" xml:"update_time_end,omitempty"`
	// 舆情文章起始更新时间
	UpdateTimeStart *int64 `json:"update_time_start,omitempty" xml:"update_time_start,omitempty"`
	// field_conditions
	FieldConditions []*FieldCondition `json:"field_conditions,omitempty" xml:"field_conditions,omitempty" type:"Repeated"`
	// 项目ID
	ProjectId *string `json:"project_id,omitempty" xml:"project_id,omitempty"`
}

func (s SearchCondition) String() string {
	return tea.Prettify(s)
}

func (s SearchCondition) GoString() string {
	return s.String()
}

func (s *SearchCondition) SetAssKeywordList(v []*string) *SearchCondition {
	s.AssKeywordList = v
	return s
}

func (s *SearchCondition) SetAtAuthorNameList(v []*string) *SearchCondition {
	s.AtAuthorNameList = v
	return s
}

func (s *SearchCondition) SetAuthorNameList(v []*string) *SearchCondition {
	s.AuthorNameList = v
	return s
}

func (s *SearchCondition) SetCommentsLevel(v int64) *SearchCondition {
	s.CommentsLevel = &v
	return s
}

func (s *SearchCondition) SetContentLenLevel(v string) *SearchCondition {
	s.ContentLenLevel = &v
	return s
}

func (s *SearchCondition) SetCreateTimeEnd(v int64) *SearchCondition {
	s.CreateTimeEnd = &v
	return s
}

func (s *SearchCondition) SetCreateTimeStart(v int64) *SearchCondition {
	s.CreateTimeStart = &v
	return s
}

func (s *SearchCondition) SetDocContentSign(v string) *SearchCondition {
	s.DocContentSign = &v
	return s
}

func (s *SearchCondition) SetDocIdList(v []*string) *SearchCondition {
	s.DocIdList = v
	return s
}

func (s *SearchCondition) SetDuplicateRemoval(v bool) *SearchCondition {
	s.DuplicateRemoval = &v
	return s
}

func (s *SearchCondition) SetEmotionType(v int64) *SearchCondition {
	s.EmotionType = &v
	return s
}

func (s *SearchCondition) SetEnableKeywordHighlight(v bool) *SearchCondition {
	s.EnableKeywordHighlight = &v
	return s
}

func (s *SearchCondition) SetExcludeAtAuthorNameList(v []*string) *SearchCondition {
	s.ExcludeAtAuthorNameList = v
	return s
}

func (s *SearchCondition) SetExcludeAuthorNameList(v []*string) *SearchCondition {
	s.ExcludeAuthorNameList = v
	return s
}

func (s *SearchCondition) SetExcludeHostNameList(v []*string) *SearchCondition {
	s.ExcludeHostNameList = v
	return s
}

func (s *SearchCondition) SetExcludeKeywordTagIds(v []*int64) *SearchCondition {
	s.ExcludeKeywordTagIds = v
	return s
}

func (s *SearchCondition) SetExcludeKeywordList(v []*string) *SearchCondition {
	s.ExcludeKeywordList = v
	return s
}

func (s *SearchCondition) SetExcludeKeywordListInTitle(v []*string) *SearchCondition {
	s.ExcludeKeywordListInTitle = v
	return s
}

func (s *SearchCondition) SetExcludeMediaLibraryIdList(v []*int64) *SearchCondition {
	s.ExcludeMediaLibraryIdList = v
	return s
}

func (s *SearchCondition) SetExcludeMediaNameList(v []*string) *SearchCondition {
	s.ExcludeMediaNameList = v
	return s
}

func (s *SearchCondition) SetExcludeMediaTypeList(v []*string) *SearchCondition {
	s.ExcludeMediaTypeList = v
	return s
}

func (s *SearchCondition) SetExcludeMessageTypeList(v []*string) *SearchCondition {
	s.ExcludeMessageTypeList = v
	return s
}

func (s *SearchCondition) SetHasImage(v bool) *SearchCondition {
	s.HasImage = &v
	return s
}

func (s *SearchCondition) SetHasVideo(v bool) *SearchCondition {
	s.HasVideo = &v
	return s
}

func (s *SearchCondition) SetHostNameList(v []*string) *SearchCondition {
	s.HostNameList = v
	return s
}

func (s *SearchCondition) SetKeywordTagIds(v []*int64) *SearchCondition {
	s.KeywordTagIds = v
	return s
}

func (s *SearchCondition) SetLikesLevel(v int64) *SearchCondition {
	s.LikesLevel = &v
	return s
}

func (s *SearchCondition) SetMediaLibraryIdList(v []*int64) *SearchCondition {
	s.MediaLibraryIdList = v
	return s
}

func (s *SearchCondition) SetMediaNameList(v []*string) *SearchCondition {
	s.MediaNameList = v
	return s
}

func (s *SearchCondition) SetMediaTypeList(v []*string) *SearchCondition {
	s.MediaTypeList = v
	return s
}

func (s *SearchCondition) SetMessageTypeList(v []*string) *SearchCondition {
	s.MessageTypeList = v
	return s
}

func (s *SearchCondition) SetPageNow(v int64) *SearchCondition {
	s.PageNow = &v
	return s
}

func (s *SearchCondition) SetPageSize(v int64) *SearchCondition {
	s.PageSize = &v
	return s
}

func (s *SearchCondition) SetParentDocId(v string) *SearchCondition {
	s.ParentDocId = &v
	return s
}

func (s *SearchCondition) SetPosKeywordList(v []*string) *SearchCondition {
	s.PosKeywordList = v
	return s
}

func (s *SearchCondition) SetPosKeywordListInTitle(v []*string) *SearchCondition {
	s.PosKeywordListInTitle = v
	return s
}

func (s *SearchCondition) SetPublishTimeEnd(v int64) *SearchCondition {
	s.PublishTimeEnd = &v
	return s
}

func (s *SearchCondition) SetPublishTimeStart(v int64) *SearchCondition {
	s.PublishTimeStart = &v
	return s
}

func (s *SearchCondition) SetReadsLevel(v int64) *SearchCondition {
	s.ReadsLevel = &v
	return s
}

func (s *SearchCondition) SetRelevanceLevel(v int64) *SearchCondition {
	s.RelevanceLevel = &v
	return s
}

func (s *SearchCondition) SetRepostLevel(v int64) *SearchCondition {
	s.RepostLevel = &v
	return s
}

func (s *SearchCondition) SetSortBy(v string) *SearchCondition {
	s.SortBy = &v
	return s
}

func (s *SearchCondition) SetSortByDirection(v string) *SearchCondition {
	s.SortByDirection = &v
	return s
}

func (s *SearchCondition) SetTopicList(v []*string) *SearchCondition {
	s.TopicList = v
	return s
}

func (s *SearchCondition) SetUpdateTimeEnd(v int64) *SearchCondition {
	s.UpdateTimeEnd = &v
	return s
}

func (s *SearchCondition) SetUpdateTimeStart(v int64) *SearchCondition {
	s.UpdateTimeStart = &v
	return s
}

func (s *SearchCondition) SetFieldConditions(v []*FieldCondition) *SearchCondition {
	s.FieldConditions = v
	return s
}

func (s *SearchCondition) SetProjectId(v string) *SearchCondition {
	s.ProjectId = &v
	return s
}

// 项目
type Project struct {
	// 项目名字
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 作者名称
	AuthorNameList []*string `json:"author_name_list,omitempty" xml:"author_name_list,omitempty" type:"Repeated"`
	// 关键词
	PosKeywordList []*string `json:"pos_keyword_list,omitempty" xml:"pos_keyword_list,omitempty" require:"true" type:"Repeated"`
	// 标题包含词列表
	PosKeywordListInTitle []*string `json:"pos_keyword_list_in_title,omitempty" xml:"pos_keyword_list_in_title,omitempty" type:"Repeated"`
	// 排除关键词标签列表
	ExcludeKeywordTagIds *string `json:"exclude_keyword_tag_ids,omitempty" xml:"exclude_keyword_tag_ids,omitempty"`
	// 修改人uid
	UidModified *string `json:"uid_modified,omitempty" xml:"uid_modified,omitempty"`
	// 提级用户名，如@xxx
	AtAuthorNameList []*string `json:"at_author_name_list,omitempty" xml:"at_author_name_list,omitempty" type:"Repeated"`
	// 排除词
	ExcludeKeywordList []*string `json:"exclude_keyword_list,omitempty" xml:"exclude_keyword_list,omitempty" type:"Repeated"`
	// 项目的分析页面id，关联hbase中的自定义页面表
	AnalyseCpId *int64 `json:"analyse_cp_id,omitempty" xml:"analyse_cp_id,omitempty"`
	// 关键词标签列表
	KeywordTagIds []*string `json:"keyword_tag_ids,omitempty" xml:"keyword_tag_ids,omitempty" type:"Repeated"`
	// 搭配词
	AssKeywordList []*string `json:"ass_keyword_list,omitempty" xml:"ass_keyword_list,omitempty" type:"Repeated"`
	// 项目ID
	Id *int64 `json:"id,omitempty" xml:"id,omitempty"`
	// 默认搜索模板id
	DefaultFilterId *int64 `json:"default_filter_id,omitempty" xml:"default_filter_id,omitempty"`
	// 创建人名称
	UnameCreate *string `json:"uname_create,omitempty" xml:"uname_create,omitempty"`
	// 父项目id
	ParentId *int64 `json:"parent_id,omitempty" xml:"parent_id,omitempty"`
	// 创建时间
	GmtCreate *int64 `json:"gmt_create,omitempty" xml:"gmt_create,omitempty"`
	// 修改人名称
	UnameModified *string `json:"uname_modified,omitempty" xml:"uname_modified,omitempty"`
	// 修改时间
	GmtModified *int64 `json:"gmt_modified,omitempty" xml:"gmt_modified,omitempty"`
	// 项目分组id
	ProjectGroupId *int64 `json:"project_group_id,omitempty" xml:"project_group_id,omitempty"`
	// 父文章id
	ParentDocId *int64 `json:"parent_doc_id,omitempty" xml:"parent_doc_id,omitempty"`
	// 文章id列表
	DocIdList []*string `json:"doc_id_list,omitempty" xml:"doc_id_list,omitempty" type:"Repeated"`
	// 话题词列表
	TopicList []*string `json:"topic_list,omitempty" xml:"topic_list,omitempty" type:"Repeated"`
	// 创建人UID
	UidCreate *string `json:"uid_create,omitempty" xml:"uid_create,omitempty"`
}

func (s Project) String() string {
	return tea.Prettify(s)
}

func (s Project) GoString() string {
	return s.String()
}

func (s *Project) SetName(v string) *Project {
	s.Name = &v
	return s
}

func (s *Project) SetAuthorNameList(v []*string) *Project {
	s.AuthorNameList = v
	return s
}

func (s *Project) SetPosKeywordList(v []*string) *Project {
	s.PosKeywordList = v
	return s
}

func (s *Project) SetPosKeywordListInTitle(v []*string) *Project {
	s.PosKeywordListInTitle = v
	return s
}

func (s *Project) SetExcludeKeywordTagIds(v string) *Project {
	s.ExcludeKeywordTagIds = &v
	return s
}

func (s *Project) SetUidModified(v string) *Project {
	s.UidModified = &v
	return s
}

func (s *Project) SetAtAuthorNameList(v []*string) *Project {
	s.AtAuthorNameList = v
	return s
}

func (s *Project) SetExcludeKeywordList(v []*string) *Project {
	s.ExcludeKeywordList = v
	return s
}

func (s *Project) SetAnalyseCpId(v int64) *Project {
	s.AnalyseCpId = &v
	return s
}

func (s *Project) SetKeywordTagIds(v []*string) *Project {
	s.KeywordTagIds = v
	return s
}

func (s *Project) SetAssKeywordList(v []*string) *Project {
	s.AssKeywordList = v
	return s
}

func (s *Project) SetId(v int64) *Project {
	s.Id = &v
	return s
}

func (s *Project) SetDefaultFilterId(v int64) *Project {
	s.DefaultFilterId = &v
	return s
}

func (s *Project) SetUnameCreate(v string) *Project {
	s.UnameCreate = &v
	return s
}

func (s *Project) SetParentId(v int64) *Project {
	s.ParentId = &v
	return s
}

func (s *Project) SetGmtCreate(v int64) *Project {
	s.GmtCreate = &v
	return s
}

func (s *Project) SetUnameModified(v string) *Project {
	s.UnameModified = &v
	return s
}

func (s *Project) SetGmtModified(v int64) *Project {
	s.GmtModified = &v
	return s
}

func (s *Project) SetProjectGroupId(v int64) *Project {
	s.ProjectGroupId = &v
	return s
}

func (s *Project) SetParentDocId(v int64) *Project {
	s.ParentDocId = &v
	return s
}

func (s *Project) SetDocIdList(v []*string) *Project {
	s.DocIdList = v
	return s
}

func (s *Project) SetTopicList(v []*string) *Project {
	s.TopicList = v
	return s
}

func (s *Project) SetUidCreate(v string) *Project {
	s.UidCreate = &v
	return s
}

// 短信消息体
type SmsContent struct {
	// 模板
	ServiceCode *string `json:"service_code,omitempty" xml:"service_code,omitempty"`
	// 手机号
	Mobile *string `json:"mobile,omitempty" xml:"mobile,omitempty" require:"true"`
	// 开发者ID
	DeveloperId *string `json:"developer_id,omitempty" xml:"developer_id,omitempty"`
	// 填充内容
	Arguments []*Pair `json:"arguments,omitempty" xml:"arguments,omitempty" type:"Repeated"`
}

func (s SmsContent) String() string {
	return tea.Prettify(s)
}

func (s SmsContent) GoString() string {
	return s.String()
}

func (s *SmsContent) SetServiceCode(v string) *SmsContent {
	s.ServiceCode = &v
	return s
}

func (s *SmsContent) SetMobile(v string) *SmsContent {
	s.Mobile = &v
	return s
}

func (s *SmsContent) SetDeveloperId(v string) *SmsContent {
	s.DeveloperId = &v
	return s
}

func (s *SmsContent) SetArguments(v []*Pair) *SmsContent {
	s.Arguments = v
	return s
}

// 邮箱数据
type EmailContent struct {
	// code
	ServiceCode *string `json:"service_code,omitempty" xml:"service_code,omitempty"`
	// 开发者Id
	DeveloperId *string `json:"developer_id,omitempty" xml:"developer_id,omitempty"`
	// 邮箱
	Email *string `json:"email,omitempty" xml:"email,omitempty" require:"true"`
	// 参数
	Arguments []*Pair `json:"arguments,omitempty" xml:"arguments,omitempty" type:"Repeated"`
}

func (s EmailContent) String() string {
	return tea.Prettify(s)
}

func (s EmailContent) GoString() string {
	return s.String()
}

func (s *EmailContent) SetServiceCode(v string) *EmailContent {
	s.ServiceCode = &v
	return s
}

func (s *EmailContent) SetDeveloperId(v string) *EmailContent {
	s.DeveloperId = &v
	return s
}

func (s *EmailContent) SetEmail(v string) *EmailContent {
	s.Email = &v
	return s
}

func (s *EmailContent) SetArguments(v []*Pair) *EmailContent {
	s.Arguments = v
	return s
}

// 商品规格
type CommoditySpec struct {
	// 规格项枚举值
	SpecKey *string `json:"spec_key,omitempty" xml:"spec_key,omitempty"`
	// 规格项默认值
	Value *string `json:"value,omitempty" xml:"value,omitempty"`
}

func (s CommoditySpec) String() string {
	return tea.Prettify(s)
}

func (s CommoditySpec) GoString() string {
	return s.String()
}

func (s *CommoditySpec) SetSpecKey(v string) *CommoditySpec {
	s.SpecKey = &v
	return s
}

func (s *CommoditySpec) SetValue(v string) *CommoditySpec {
	s.Value = &v
	return s
}

type QueryMessagesRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 查询条件
	SearchCondition *SearchCondition `json:"search_condition,omitempty" xml:"search_condition,omitempty" require:"true"`
	// 请求ID
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
	// team_hash_id
	TeamHashId *string `json:"team_hash_id,omitempty" xml:"team_hash_id,omitempty"`
}

func (s QueryMessagesRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryMessagesRequest) GoString() string {
	return s.String()
}

func (s *QueryMessagesRequest) SetAuthToken(v string) *QueryMessagesRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryMessagesRequest) SetProductInstanceId(v string) *QueryMessagesRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryMessagesRequest) SetSearchCondition(v *SearchCondition) *QueryMessagesRequest {
	s.SearchCondition = v
	return s
}

func (s *QueryMessagesRequest) SetRequestId(v string) *QueryMessagesRequest {
	s.RequestId = &v
	return s
}

func (s *QueryMessagesRequest) SetTeamHashId(v string) *QueryMessagesRequest {
	s.TeamHashId = &v
	return s
}

type QueryMessagesResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 数量
	TotalCount *int64 `json:"total_count,omitempty" xml:"total_count,omitempty"`
	// 舆情列表
	YuqingMessages []*YuqingMessage `json:"yuqing_messages,omitempty" xml:"yuqing_messages,omitempty" type:"Repeated"`
}

func (s QueryMessagesResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryMessagesResponse) GoString() string {
	return s.String()
}

func (s *QueryMessagesResponse) SetReqMsgId(v string) *QueryMessagesResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryMessagesResponse) SetResultCode(v string) *QueryMessagesResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryMessagesResponse) SetResultMsg(v string) *QueryMessagesResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryMessagesResponse) SetTotalCount(v int64) *QueryMessagesResponse {
	s.TotalCount = &v
	return s
}

func (s *QueryMessagesResponse) SetYuqingMessages(v []*YuqingMessage) *QueryMessagesResponse {
	s.YuqingMessages = v
	return s
}

type SaveAnalysisSubmitRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 分析类型
	AnalyseType *string `json:"analyse_type,omitempty" xml:"analyse_type,omitempty" require:"true"`
	// 查询条件
	SearchCondition *SearchCondition `json:"search_condition,omitempty" xml:"search_condition,omitempty" require:"true"`
	// team_hash_id
	TeamHashId *string `json:"team_hash_id,omitempty" xml:"team_hash_id,omitempty" require:"true"`
}

func (s SaveAnalysisSubmitRequest) String() string {
	return tea.Prettify(s)
}

func (s SaveAnalysisSubmitRequest) GoString() string {
	return s.String()
}

func (s *SaveAnalysisSubmitRequest) SetAuthToken(v string) *SaveAnalysisSubmitRequest {
	s.AuthToken = &v
	return s
}

func (s *SaveAnalysisSubmitRequest) SetProductInstanceId(v string) *SaveAnalysisSubmitRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SaveAnalysisSubmitRequest) SetAnalyseType(v string) *SaveAnalysisSubmitRequest {
	s.AnalyseType = &v
	return s
}

func (s *SaveAnalysisSubmitRequest) SetSearchCondition(v *SearchCondition) *SaveAnalysisSubmitRequest {
	s.SearchCondition = v
	return s
}

func (s *SaveAnalysisSubmitRequest) SetTeamHashId(v string) *SaveAnalysisSubmitRequest {
	s.TeamHashId = &v
	return s
}

type SaveAnalysisSubmitResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 分析任务ID
	AnalysisId *int64 `json:"analysis_id,omitempty" xml:"analysis_id,omitempty"`
	// 其他
	ResultJson *string `json:"result_json,omitempty" xml:"result_json,omitempty"`
}

func (s SaveAnalysisSubmitResponse) String() string {
	return tea.Prettify(s)
}

func (s SaveAnalysisSubmitResponse) GoString() string {
	return s.String()
}

func (s *SaveAnalysisSubmitResponse) SetReqMsgId(v string) *SaveAnalysisSubmitResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SaveAnalysisSubmitResponse) SetResultCode(v string) *SaveAnalysisSubmitResponse {
	s.ResultCode = &v
	return s
}

func (s *SaveAnalysisSubmitResponse) SetResultMsg(v string) *SaveAnalysisSubmitResponse {
	s.ResultMsg = &v
	return s
}

func (s *SaveAnalysisSubmitResponse) SetAnalysisId(v int64) *SaveAnalysisSubmitResponse {
	s.AnalysisId = &v
	return s
}

func (s *SaveAnalysisSubmitResponse) SetResultJson(v string) *SaveAnalysisSubmitResponse {
	s.ResultJson = &v
	return s
}

type QueryAnalysisQueryRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 分析任务ID
	AnalysisId *int64 `json:"analysis_id,omitempty" xml:"analysis_id,omitempty" require:"true"`
	// team_hash_id
	TeamHashId *string `json:"team_hash_id,omitempty" xml:"team_hash_id,omitempty"`
}

func (s QueryAnalysisQueryRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAnalysisQueryRequest) GoString() string {
	return s.String()
}

func (s *QueryAnalysisQueryRequest) SetAuthToken(v string) *QueryAnalysisQueryRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAnalysisQueryRequest) SetProductInstanceId(v string) *QueryAnalysisQueryRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAnalysisQueryRequest) SetAnalysisId(v int64) *QueryAnalysisQueryRequest {
	s.AnalysisId = &v
	return s
}

func (s *QueryAnalysisQueryRequest) SetTeamHashId(v string) *QueryAnalysisQueryRequest {
	s.TeamHashId = &v
	return s
}

type QueryAnalysisQueryResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 分析任务ID
	AnalysisId *int64 `json:"analysis_id,omitempty" xml:"analysis_id,omitempty"`
	// 分析内容
	ResultJson *string `json:"result_json,omitempty" xml:"result_json,omitempty"`
}

func (s QueryAnalysisQueryResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAnalysisQueryResponse) GoString() string {
	return s.String()
}

func (s *QueryAnalysisQueryResponse) SetReqMsgId(v string) *QueryAnalysisQueryResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAnalysisQueryResponse) SetResultCode(v string) *QueryAnalysisQueryResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAnalysisQueryResponse) SetResultMsg(v string) *QueryAnalysisQueryResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAnalysisQueryResponse) SetAnalysisId(v int64) *QueryAnalysisQueryResponse {
	s.AnalysisId = &v
	return s
}

func (s *QueryAnalysisQueryResponse) SetResultJson(v string) *QueryAnalysisQueryResponse {
	s.ResultJson = &v
	return s
}

type SaveProductOpenRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 业务号
	BizNo *string `json:"biz_no,omitempty" xml:"biz_no,omitempty"`
	// 租户 ID
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 实例 ID，兼容老模型的 tntInstId
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty"`
	// 产品编码
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty"`
	// 模块唯一标识
	ModuleKey *string `json:"module_key,omitempty" xml:"module_key,omitempty"`
	// 操作类型
	Operate *string `json:"operate,omitempty" xml:"operate,omitempty"`
	// 操作来源渠道
	Channel *string `json:"channel,omitempty" xml:"channel,omitempty"`
	// 规格
	CommoditySpecs []*CommoditySpec `json:"commodity_specs,omitempty" xml:"commodity_specs,omitempty" type:"Repeated"`
}

func (s SaveProductOpenRequest) String() string {
	return tea.Prettify(s)
}

func (s SaveProductOpenRequest) GoString() string {
	return s.String()
}

func (s *SaveProductOpenRequest) SetAuthToken(v string) *SaveProductOpenRequest {
	s.AuthToken = &v
	return s
}

func (s *SaveProductOpenRequest) SetProductInstanceId(v string) *SaveProductOpenRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SaveProductOpenRequest) SetBizNo(v string) *SaveProductOpenRequest {
	s.BizNo = &v
	return s
}

func (s *SaveProductOpenRequest) SetTenantId(v string) *SaveProductOpenRequest {
	s.TenantId = &v
	return s
}

func (s *SaveProductOpenRequest) SetInstanceId(v string) *SaveProductOpenRequest {
	s.InstanceId = &v
	return s
}

func (s *SaveProductOpenRequest) SetProductCode(v string) *SaveProductOpenRequest {
	s.ProductCode = &v
	return s
}

func (s *SaveProductOpenRequest) SetModuleKey(v string) *SaveProductOpenRequest {
	s.ModuleKey = &v
	return s
}

func (s *SaveProductOpenRequest) SetOperate(v string) *SaveProductOpenRequest {
	s.Operate = &v
	return s
}

func (s *SaveProductOpenRequest) SetChannel(v string) *SaveProductOpenRequest {
	s.Channel = &v
	return s
}

func (s *SaveProductOpenRequest) SetCommoditySpecs(v []*CommoditySpec) *SaveProductOpenRequest {
	s.CommoditySpecs = v
	return s
}

type SaveProductOpenResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s SaveProductOpenResponse) String() string {
	return tea.Prettify(s)
}

func (s SaveProductOpenResponse) GoString() string {
	return s.String()
}

func (s *SaveProductOpenResponse) SetReqMsgId(v string) *SaveProductOpenResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SaveProductOpenResponse) SetResultCode(v string) *SaveProductOpenResponse {
	s.ResultCode = &v
	return s
}

func (s *SaveProductOpenResponse) SetResultMsg(v string) *SaveProductOpenResponse {
	s.ResultMsg = &v
	return s
}

type SaveProductTopRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 业务号
	BizNo *string `json:"biz_no,omitempty" xml:"biz_no,omitempty"`
	// 租户 ID
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 实例 ID，兼容老模型的 tntInstId
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty"`
	// 产品编码
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty"`
	// 模块唯一标识
	ModuleKey *string `json:"module_key,omitempty" xml:"module_key,omitempty"`
	// 操作类型
	Operate *string `json:"operate,omitempty" xml:"operate,omitempty"`
	// 操作来源渠道
	Channel *string `json:"channel,omitempty" xml:"channel,omitempty"`
}

func (s SaveProductTopRequest) String() string {
	return tea.Prettify(s)
}

func (s SaveProductTopRequest) GoString() string {
	return s.String()
}

func (s *SaveProductTopRequest) SetAuthToken(v string) *SaveProductTopRequest {
	s.AuthToken = &v
	return s
}

func (s *SaveProductTopRequest) SetProductInstanceId(v string) *SaveProductTopRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SaveProductTopRequest) SetBizNo(v string) *SaveProductTopRequest {
	s.BizNo = &v
	return s
}

func (s *SaveProductTopRequest) SetTenantId(v string) *SaveProductTopRequest {
	s.TenantId = &v
	return s
}

func (s *SaveProductTopRequest) SetInstanceId(v string) *SaveProductTopRequest {
	s.InstanceId = &v
	return s
}

func (s *SaveProductTopRequest) SetProductCode(v string) *SaveProductTopRequest {
	s.ProductCode = &v
	return s
}

func (s *SaveProductTopRequest) SetModuleKey(v string) *SaveProductTopRequest {
	s.ModuleKey = &v
	return s
}

func (s *SaveProductTopRequest) SetOperate(v string) *SaveProductTopRequest {
	s.Operate = &v
	return s
}

func (s *SaveProductTopRequest) SetChannel(v string) *SaveProductTopRequest {
	s.Channel = &v
	return s
}

type SaveProductTopResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s SaveProductTopResponse) String() string {
	return tea.Prettify(s)
}

func (s SaveProductTopResponse) GoString() string {
	return s.String()
}

func (s *SaveProductTopResponse) SetReqMsgId(v string) *SaveProductTopResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SaveProductTopResponse) SetResultCode(v string) *SaveProductTopResponse {
	s.ResultCode = &v
	return s
}

func (s *SaveProductTopResponse) SetResultMsg(v string) *SaveProductTopResponse {
	s.ResultMsg = &v
	return s
}

type SetProductOperateRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 请求入参
	InputJson *string `json:"input_json,omitempty" xml:"input_json,omitempty" require:"true"`
	// 操作类型
	OperateType *string `json:"operate_type,omitempty" xml:"operate_type,omitempty" require:"true"`
}

func (s SetProductOperateRequest) String() string {
	return tea.Prettify(s)
}

func (s SetProductOperateRequest) GoString() string {
	return s.String()
}

func (s *SetProductOperateRequest) SetAuthToken(v string) *SetProductOperateRequest {
	s.AuthToken = &v
	return s
}

func (s *SetProductOperateRequest) SetProductInstanceId(v string) *SetProductOperateRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SetProductOperateRequest) SetInputJson(v string) *SetProductOperateRequest {
	s.InputJson = &v
	return s
}

func (s *SetProductOperateRequest) SetOperateType(v string) *SetProductOperateRequest {
	s.OperateType = &v
	return s
}

type SetProductOperateResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 输出返回
	OutputJson *string `json:"output_json,omitempty" xml:"output_json,omitempty"`
}

func (s SetProductOperateResponse) String() string {
	return tea.Prettify(s)
}

func (s SetProductOperateResponse) GoString() string {
	return s.String()
}

func (s *SetProductOperateResponse) SetReqMsgId(v string) *SetProductOperateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SetProductOperateResponse) SetResultCode(v string) *SetProductOperateResponse {
	s.ResultCode = &v
	return s
}

func (s *SetProductOperateResponse) SetResultMsg(v string) *SetProductOperateResponse {
	s.ResultMsg = &v
	return s
}

func (s *SetProductOperateResponse) SetOutputJson(v string) *SetProductOperateResponse {
	s.OutputJson = &v
	return s
}

type SendProductNoticeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 提醒类型
	NoticeType *string `json:"notice_type,omitempty" xml:"notice_type,omitempty" require:"true"`
	// 租户ID
	TenantUid *string `json:"tenant_uid,omitempty" xml:"tenant_uid,omitempty" require:"true"`
	// 钉钉结构体
	DingTalkContent *DingTalkContent `json:"ding_talk_content,omitempty" xml:"ding_talk_content,omitempty"`
	// 短信内容
	SmsContent *SmsContent `json:"sms_content,omitempty" xml:"sms_content,omitempty"`
	// email结构体
	EmailContent *EmailContent `json:"email_content,omitempty" xml:"email_content,omitempty"`
}

func (s SendProductNoticeRequest) String() string {
	return tea.Prettify(s)
}

func (s SendProductNoticeRequest) GoString() string {
	return s.String()
}

func (s *SendProductNoticeRequest) SetAuthToken(v string) *SendProductNoticeRequest {
	s.AuthToken = &v
	return s
}

func (s *SendProductNoticeRequest) SetProductInstanceId(v string) *SendProductNoticeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SendProductNoticeRequest) SetNoticeType(v string) *SendProductNoticeRequest {
	s.NoticeType = &v
	return s
}

func (s *SendProductNoticeRequest) SetTenantUid(v string) *SendProductNoticeRequest {
	s.TenantUid = &v
	return s
}

func (s *SendProductNoticeRequest) SetDingTalkContent(v *DingTalkContent) *SendProductNoticeRequest {
	s.DingTalkContent = v
	return s
}

func (s *SendProductNoticeRequest) SetSmsContent(v *SmsContent) *SendProductNoticeRequest {
	s.SmsContent = v
	return s
}

func (s *SendProductNoticeRequest) SetEmailContent(v *EmailContent) *SendProductNoticeRequest {
	s.EmailContent = v
	return s
}

type SendProductNoticeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 推送返回
	OperateResult *bool `json:"operate_result,omitempty" xml:"operate_result,omitempty"`
}

func (s SendProductNoticeResponse) String() string {
	return tea.Prettify(s)
}

func (s SendProductNoticeResponse) GoString() string {
	return s.String()
}

func (s *SendProductNoticeResponse) SetReqMsgId(v string) *SendProductNoticeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SendProductNoticeResponse) SetResultCode(v string) *SendProductNoticeResponse {
	s.ResultCode = &v
	return s
}

func (s *SendProductNoticeResponse) SetResultMsg(v string) *SendProductNoticeResponse {
	s.ResultMsg = &v
	return s
}

func (s *SendProductNoticeResponse) SetOperateResult(v bool) *SendProductNoticeResponse {
	s.OperateResult = &v
	return s
}

type SaveDeepanalysisSubmitRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 深度分析类型
	ToolType *string `json:"tool_type,omitempty" xml:"tool_type,omitempty" require:"true"`
	// 任务名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 深度分析配置
	Config *AnalysisConfig `json:"config,omitempty" xml:"config,omitempty" require:"true"`
}

func (s SaveDeepanalysisSubmitRequest) String() string {
	return tea.Prettify(s)
}

func (s SaveDeepanalysisSubmitRequest) GoString() string {
	return s.String()
}

func (s *SaveDeepanalysisSubmitRequest) SetAuthToken(v string) *SaveDeepanalysisSubmitRequest {
	s.AuthToken = &v
	return s
}

func (s *SaveDeepanalysisSubmitRequest) SetProductInstanceId(v string) *SaveDeepanalysisSubmitRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SaveDeepanalysisSubmitRequest) SetToolType(v string) *SaveDeepanalysisSubmitRequest {
	s.ToolType = &v
	return s
}

func (s *SaveDeepanalysisSubmitRequest) SetName(v string) *SaveDeepanalysisSubmitRequest {
	s.Name = &v
	return s
}

func (s *SaveDeepanalysisSubmitRequest) SetConfig(v *AnalysisConfig) *SaveDeepanalysisSubmitRequest {
	s.Config = v
	return s
}

type SaveDeepanalysisSubmitResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 深度分析任务ID
	AnalysisId *int64 `json:"analysis_id,omitempty" xml:"analysis_id,omitempty"`
	// 其他返回
	ResultJson *string `json:"result_json,omitempty" xml:"result_json,omitempty"`
}

func (s SaveDeepanalysisSubmitResponse) String() string {
	return tea.Prettify(s)
}

func (s SaveDeepanalysisSubmitResponse) GoString() string {
	return s.String()
}

func (s *SaveDeepanalysisSubmitResponse) SetReqMsgId(v string) *SaveDeepanalysisSubmitResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SaveDeepanalysisSubmitResponse) SetResultCode(v string) *SaveDeepanalysisSubmitResponse {
	s.ResultCode = &v
	return s
}

func (s *SaveDeepanalysisSubmitResponse) SetResultMsg(v string) *SaveDeepanalysisSubmitResponse {
	s.ResultMsg = &v
	return s
}

func (s *SaveDeepanalysisSubmitResponse) SetAnalysisId(v int64) *SaveDeepanalysisSubmitResponse {
	s.AnalysisId = &v
	return s
}

func (s *SaveDeepanalysisSubmitResponse) SetResultJson(v string) *SaveDeepanalysisSubmitResponse {
	s.ResultJson = &v
	return s
}

type QueryDeepanalysisQueryRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 深度分析任务ID
	AnalysisId *int64 `json:"analysis_id,omitempty" xml:"analysis_id,omitempty" require:"true"`
}

func (s QueryDeepanalysisQueryRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDeepanalysisQueryRequest) GoString() string {
	return s.String()
}

func (s *QueryDeepanalysisQueryRequest) SetAuthToken(v string) *QueryDeepanalysisQueryRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDeepanalysisQueryRequest) SetProductInstanceId(v string) *QueryDeepanalysisQueryRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryDeepanalysisQueryRequest) SetAnalysisId(v int64) *QueryDeepanalysisQueryRequest {
	s.AnalysisId = &v
	return s
}

type QueryDeepanalysisQueryResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 深度分析任务ID
	AnalysisId *int64 `json:"analysis_id,omitempty" xml:"analysis_id,omitempty"`
	// 分析内容
	ResultJson *string `json:"result_json,omitempty" xml:"result_json,omitempty"`
}

func (s QueryDeepanalysisQueryResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDeepanalysisQueryResponse) GoString() string {
	return s.String()
}

func (s *QueryDeepanalysisQueryResponse) SetReqMsgId(v string) *QueryDeepanalysisQueryResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDeepanalysisQueryResponse) SetResultCode(v string) *QueryDeepanalysisQueryResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDeepanalysisQueryResponse) SetResultMsg(v string) *QueryDeepanalysisQueryResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDeepanalysisQueryResponse) SetAnalysisId(v int64) *QueryDeepanalysisQueryResponse {
	s.AnalysisId = &v
	return s
}

func (s *QueryDeepanalysisQueryResponse) SetResultJson(v string) *QueryDeepanalysisQueryResponse {
	s.ResultJson = &v
	return s
}

type GetMessageRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 请求ID
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
	// team_hash_id
	TeamHashId *string `json:"team_hash_id,omitempty" xml:"team_hash_id,omitempty"`
	// 文档唯一ID
	DocId *string `json:"doc_id,omitempty" xml:"doc_id,omitempty" require:"true"`
}

func (s GetMessageRequest) String() string {
	return tea.Prettify(s)
}

func (s GetMessageRequest) GoString() string {
	return s.String()
}

func (s *GetMessageRequest) SetAuthToken(v string) *GetMessageRequest {
	s.AuthToken = &v
	return s
}

func (s *GetMessageRequest) SetProductInstanceId(v string) *GetMessageRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetMessageRequest) SetRequestId(v string) *GetMessageRequest {
	s.RequestId = &v
	return s
}

func (s *GetMessageRequest) SetTeamHashId(v string) *GetMessageRequest {
	s.TeamHashId = &v
	return s
}

func (s *GetMessageRequest) SetDocId(v string) *GetMessageRequest {
	s.DocId = &v
	return s
}

type GetMessageResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 與情内容
	YuqingMessage *YuqingMessage `json:"yuqing_message,omitempty" xml:"yuqing_message,omitempty"`
}

func (s GetMessageResponse) String() string {
	return tea.Prettify(s)
}

func (s GetMessageResponse) GoString() string {
	return s.String()
}

func (s *GetMessageResponse) SetReqMsgId(v string) *GetMessageResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetMessageResponse) SetResultCode(v string) *GetMessageResponse {
	s.ResultCode = &v
	return s
}

func (s *GetMessageResponse) SetResultMsg(v string) *GetMessageResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetMessageResponse) SetYuqingMessage(v *YuqingMessage) *GetMessageResponse {
	s.YuqingMessage = v
	return s
}

type QueryProjectRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 父亲项目的id: 负数表示不限
	ParentId *int64 `json:"parent_id,omitempty" xml:"parent_id,omitempty"`
	// uid
	Uid *string `json:"uid,omitempty" xml:"uid,omitempty"`
	// 排序字段名称，如gmt_create
	OrderBy *string `json:"order_by,omitempty" xml:"order_by,omitempty"`
	// 请求ID
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
	// 名称
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 指定ID
	Ids []*int64 `json:"ids,omitempty" xml:"ids,omitempty" type:"Repeated"`
	// 当前页
	CurrentPage *int64 `json:"current_page,omitempty" xml:"current_page,omitempty" require:"true"`
	// 所在项目组ID
	ProjectGroupId *int64 `json:"project_group_id,omitempty" xml:"project_group_id,omitempty"`
	// 页面大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
	// 排序方式：DESC降序，ASC升序
	SortType *string `json:"sort_type,omitempty" xml:"sort_type,omitempty"`
}

func (s QueryProjectRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryProjectRequest) GoString() string {
	return s.String()
}

func (s *QueryProjectRequest) SetAuthToken(v string) *QueryProjectRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryProjectRequest) SetProductInstanceId(v string) *QueryProjectRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryProjectRequest) SetParentId(v int64) *QueryProjectRequest {
	s.ParentId = &v
	return s
}

func (s *QueryProjectRequest) SetUid(v string) *QueryProjectRequest {
	s.Uid = &v
	return s
}

func (s *QueryProjectRequest) SetOrderBy(v string) *QueryProjectRequest {
	s.OrderBy = &v
	return s
}

func (s *QueryProjectRequest) SetRequestId(v string) *QueryProjectRequest {
	s.RequestId = &v
	return s
}

func (s *QueryProjectRequest) SetName(v string) *QueryProjectRequest {
	s.Name = &v
	return s
}

func (s *QueryProjectRequest) SetIds(v []*int64) *QueryProjectRequest {
	s.Ids = v
	return s
}

func (s *QueryProjectRequest) SetCurrentPage(v int64) *QueryProjectRequest {
	s.CurrentPage = &v
	return s
}

func (s *QueryProjectRequest) SetProjectGroupId(v int64) *QueryProjectRequest {
	s.ProjectGroupId = &v
	return s
}

func (s *QueryProjectRequest) SetPageSize(v int64) *QueryProjectRequest {
	s.PageSize = &v
	return s
}

func (s *QueryProjectRequest) SetSortType(v string) *QueryProjectRequest {
	s.SortType = &v
	return s
}

type QueryProjectResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 页面内容
	Pages []*Project `json:"pages,omitempty" xml:"pages,omitempty" type:"Repeated"`
	// 总条数
	TotalCount *int64 `json:"total_count,omitempty" xml:"total_count,omitempty"`
}

func (s QueryProjectResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryProjectResponse) GoString() string {
	return s.String()
}

func (s *QueryProjectResponse) SetReqMsgId(v string) *QueryProjectResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryProjectResponse) SetResultCode(v string) *QueryProjectResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryProjectResponse) SetResultMsg(v string) *QueryProjectResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryProjectResponse) SetPages(v []*Project) *QueryProjectResponse {
	s.Pages = v
	return s
}

func (s *QueryProjectResponse) SetTotalCount(v int64) *QueryProjectResponse {
	s.TotalCount = &v
	return s
}

type CreateProjectRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 创建内容
	CreateParam *Project `json:"create_param,omitempty" xml:"create_param,omitempty" require:"true"`
	// requestId
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
}

func (s CreateProjectRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateProjectRequest) GoString() string {
	return s.String()
}

func (s *CreateProjectRequest) SetAuthToken(v string) *CreateProjectRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateProjectRequest) SetProductInstanceId(v string) *CreateProjectRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateProjectRequest) SetCreateParam(v *Project) *CreateProjectRequest {
	s.CreateParam = v
	return s
}

func (s *CreateProjectRequest) SetRequestId(v string) *CreateProjectRequest {
	s.RequestId = &v
	return s
}

type CreateProjectResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CreateProjectResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateProjectResponse) GoString() string {
	return s.String()
}

func (s *CreateProjectResponse) SetReqMsgId(v string) *CreateProjectResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateProjectResponse) SetResultCode(v string) *CreateProjectResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateProjectResponse) SetResultMsg(v string) *CreateProjectResponse {
	s.ResultMsg = &v
	return s
}

type DeleteProjectRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 项目ID
	Id *int64 `json:"id,omitempty" xml:"id,omitempty" require:"true"`
}

func (s DeleteProjectRequest) String() string {
	return tea.Prettify(s)
}

func (s DeleteProjectRequest) GoString() string {
	return s.String()
}

func (s *DeleteProjectRequest) SetAuthToken(v string) *DeleteProjectRequest {
	s.AuthToken = &v
	return s
}

func (s *DeleteProjectRequest) SetProductInstanceId(v string) *DeleteProjectRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DeleteProjectRequest) SetId(v int64) *DeleteProjectRequest {
	s.Id = &v
	return s
}

type DeleteProjectResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 新增主键
	Id *int64 `json:"id,omitempty" xml:"id,omitempty"`
}

func (s DeleteProjectResponse) String() string {
	return tea.Prettify(s)
}

func (s DeleteProjectResponse) GoString() string {
	return s.String()
}

func (s *DeleteProjectResponse) SetReqMsgId(v string) *DeleteProjectResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DeleteProjectResponse) SetResultCode(v string) *DeleteProjectResponse {
	s.ResultCode = &v
	return s
}

func (s *DeleteProjectResponse) SetResultMsg(v string) *DeleteProjectResponse {
	s.ResultMsg = &v
	return s
}

func (s *DeleteProjectResponse) SetId(v int64) *DeleteProjectResponse {
	s.Id = &v
	return s
}

type QueryAlarmRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 规则id列表
	AlarmRuleIds []*int64 `json:"alarm_rule_ids,omitempty" xml:"alarm_rule_ids,omitempty" type:"Repeated"`
	// 排序字段名称，如gmt_create
	OrderBy *string `json:"order_by,omitempty" xml:"order_by,omitempty"`
	// 是否用更新时间筛选
	IsQueryUpdateTime *bool `json:"is_query_update_time,omitempty" xml:"is_query_update_time,omitempty"`
	// 当前页
	CurrentPage *int64 `json:"current_page,omitempty" xml:"current_page,omitempty"`
	// 页大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// 舆情项目id列表
	ProjectIds []*int64 `json:"project_ids,omitempty" xml:"project_ids,omitempty" type:"Repeated"`
	// 预警时间下限
	EndTime *int64 `json:"end_time,omitempty" xml:"end_time,omitempty"`
	// 预警等级，如：P0
	Levels *string `json:"levels,omitempty" xml:"levels,omitempty"`
	// 预警时间上限
	StartTime *int64 `json:"start_time,omitempty" xml:"start_time,omitempty"`
	// 预警规则类型
	Type *string `json:"type,omitempty" xml:"type,omitempty"`
	// 预警消息id
	Ids []*int64 `json:"ids,omitempty" xml:"ids,omitempty" type:"Repeated"`
	// 标签id
	TagIds []*int64 `json:"tag_ids,omitempty" xml:"tag_ids,omitempty" type:"Repeated"`
	// 媒体类型
	DocMediaType *string `json:"doc_media_type,omitempty" xml:"doc_media_type,omitempty"`
	// 消息状态，如：FINISHED
	Status []*string `json:"status,omitempty" xml:"status,omitempty" type:"Repeated"`
	// 文章docId列表
	DocIdList []*string `json:"doc_id_list,omitempty" xml:"doc_id_list,omitempty" type:"Repeated"`
	// 排序方向，DESC降序，ASC升序
	SortType *string `json:"sort_type,omitempty" xml:"sort_type,omitempty"`
	// requestId
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
}

func (s QueryAlarmRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAlarmRequest) GoString() string {
	return s.String()
}

func (s *QueryAlarmRequest) SetAuthToken(v string) *QueryAlarmRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAlarmRequest) SetProductInstanceId(v string) *QueryAlarmRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAlarmRequest) SetAlarmRuleIds(v []*int64) *QueryAlarmRequest {
	s.AlarmRuleIds = v
	return s
}

func (s *QueryAlarmRequest) SetOrderBy(v string) *QueryAlarmRequest {
	s.OrderBy = &v
	return s
}

func (s *QueryAlarmRequest) SetIsQueryUpdateTime(v bool) *QueryAlarmRequest {
	s.IsQueryUpdateTime = &v
	return s
}

func (s *QueryAlarmRequest) SetCurrentPage(v int64) *QueryAlarmRequest {
	s.CurrentPage = &v
	return s
}

func (s *QueryAlarmRequest) SetPageSize(v int64) *QueryAlarmRequest {
	s.PageSize = &v
	return s
}

func (s *QueryAlarmRequest) SetProjectIds(v []*int64) *QueryAlarmRequest {
	s.ProjectIds = v
	return s
}

func (s *QueryAlarmRequest) SetEndTime(v int64) *QueryAlarmRequest {
	s.EndTime = &v
	return s
}

func (s *QueryAlarmRequest) SetLevels(v string) *QueryAlarmRequest {
	s.Levels = &v
	return s
}

func (s *QueryAlarmRequest) SetStartTime(v int64) *QueryAlarmRequest {
	s.StartTime = &v
	return s
}

func (s *QueryAlarmRequest) SetType(v string) *QueryAlarmRequest {
	s.Type = &v
	return s
}

func (s *QueryAlarmRequest) SetIds(v []*int64) *QueryAlarmRequest {
	s.Ids = v
	return s
}

func (s *QueryAlarmRequest) SetTagIds(v []*int64) *QueryAlarmRequest {
	s.TagIds = v
	return s
}

func (s *QueryAlarmRequest) SetDocMediaType(v string) *QueryAlarmRequest {
	s.DocMediaType = &v
	return s
}

func (s *QueryAlarmRequest) SetStatus(v []*string) *QueryAlarmRequest {
	s.Status = v
	return s
}

func (s *QueryAlarmRequest) SetDocIdList(v []*string) *QueryAlarmRequest {
	s.DocIdList = v
	return s
}

func (s *QueryAlarmRequest) SetSortType(v string) *QueryAlarmRequest {
	s.SortType = &v
	return s
}

func (s *QueryAlarmRequest) SetRequestId(v string) *QueryAlarmRequest {
	s.RequestId = &v
	return s
}

type QueryAlarmResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 预警消息
	Pages []*Alarm `json:"pages,omitempty" xml:"pages,omitempty" type:"Repeated"`
	// 总条数
	TotalCount *int64 `json:"total_count,omitempty" xml:"total_count,omitempty"`
}

func (s QueryAlarmResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAlarmResponse) GoString() string {
	return s.String()
}

func (s *QueryAlarmResponse) SetReqMsgId(v string) *QueryAlarmResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAlarmResponse) SetResultCode(v string) *QueryAlarmResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAlarmResponse) SetResultMsg(v string) *QueryAlarmResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAlarmResponse) SetPages(v []*Alarm) *QueryAlarmResponse {
	s.Pages = v
	return s
}

func (s *QueryAlarmResponse) SetTotalCount(v int64) *QueryAlarmResponse {
	s.TotalCount = &v
	return s
}

type QueryHotspotMessageRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 标题包含XX
	TitleIncludingWordsIdx *string `json:"title_including_words_idx,omitempty" xml:"title_including_words_idx,omitempty"`
	// 正向关键词（短语匹配）
	PosKeywords *string `json:"pos_keywords,omitempty" xml:"pos_keywords,omitempty"`
	// 标题完全相等的检索条件，与attributes.display_title字段对应
	WholeKeywords *string `json:"whole_keywords,omitempty" xml:"whole_keywords,omitempty"`
	// 排序方式： 正序(+)、倒序(-)
	SortByDirection *string `json:"sort_by_direction,omitempty" xml:"sort_by_direction,omitempty"`
	// 省份
	Provinces *string `json:"provinces,omitempty" xml:"provinces,omitempty"`
	// 爬取时间的最小值（含）
	CrawlerTimeStartFilter *int64 `json:"crawler_time_start_filter,omitempty" xml:"crawler_time_start_filter,omitempty"`
	// 页大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
	// [媒体子类型
	MediaSubType []*string `json:"media_sub_type,omitempty" xml:"media_sub_type,omitempty" type:"Repeated"`
	// 是否不指定关键词进行查询：\n 默认false，表示需要指定关键词来查询
	QueryWithoutKeyword *bool `json:"query_without_keyword,omitempty" xml:"query_without_keyword,omitempty"`
	// 指定的id列表
	DocIds []*string `json:"doc_ids,omitempty" xml:"doc_ids,omitempty" type:"Repeated"`
	// 城市
	Cities []*string `json:"cities,omitempty" xml:"cities,omitempty" type:"Repeated"`
	// 爬取时间的最大值（不含）
	CrawlerTimeEndFilter *int64 `json:"crawler_time_end_filter,omitempty" xml:"crawler_time_end_filter,omitempty"`
	// 是否要进行关键词高亮显示
	EnableKeywordHighlight *bool `json:"enable_keyword_highlight,omitempty" xml:"enable_keyword_highlight,omitempty"`
	// d当前页
	PageNow *int64 `json:"page_now,omitempty" xml:"page_now,omitempty" require:"true"`
	// 是否当前在榜 true表示在榜，false或null表示不限
	FileId *bool `json:"file_id,omitempty" xml:"file_id,omitempty"`
	// 排序字段
	SortBy *string `json:"sort_by,omitempty" xml:"sort_by,omitempty"`
	// 是否当前在榜
	Active *bool `json:"active,omitempty" xml:"active,omitempty"`
}

func (s QueryHotspotMessageRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryHotspotMessageRequest) GoString() string {
	return s.String()
}

func (s *QueryHotspotMessageRequest) SetAuthToken(v string) *QueryHotspotMessageRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryHotspotMessageRequest) SetProductInstanceId(v string) *QueryHotspotMessageRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryHotspotMessageRequest) SetTitleIncludingWordsIdx(v string) *QueryHotspotMessageRequest {
	s.TitleIncludingWordsIdx = &v
	return s
}

func (s *QueryHotspotMessageRequest) SetPosKeywords(v string) *QueryHotspotMessageRequest {
	s.PosKeywords = &v
	return s
}

func (s *QueryHotspotMessageRequest) SetWholeKeywords(v string) *QueryHotspotMessageRequest {
	s.WholeKeywords = &v
	return s
}

func (s *QueryHotspotMessageRequest) SetSortByDirection(v string) *QueryHotspotMessageRequest {
	s.SortByDirection = &v
	return s
}

func (s *QueryHotspotMessageRequest) SetProvinces(v string) *QueryHotspotMessageRequest {
	s.Provinces = &v
	return s
}

func (s *QueryHotspotMessageRequest) SetCrawlerTimeStartFilter(v int64) *QueryHotspotMessageRequest {
	s.CrawlerTimeStartFilter = &v
	return s
}

func (s *QueryHotspotMessageRequest) SetPageSize(v int64) *QueryHotspotMessageRequest {
	s.PageSize = &v
	return s
}

func (s *QueryHotspotMessageRequest) SetMediaSubType(v []*string) *QueryHotspotMessageRequest {
	s.MediaSubType = v
	return s
}

func (s *QueryHotspotMessageRequest) SetQueryWithoutKeyword(v bool) *QueryHotspotMessageRequest {
	s.QueryWithoutKeyword = &v
	return s
}

func (s *QueryHotspotMessageRequest) SetDocIds(v []*string) *QueryHotspotMessageRequest {
	s.DocIds = v
	return s
}

func (s *QueryHotspotMessageRequest) SetCities(v []*string) *QueryHotspotMessageRequest {
	s.Cities = v
	return s
}

func (s *QueryHotspotMessageRequest) SetCrawlerTimeEndFilter(v int64) *QueryHotspotMessageRequest {
	s.CrawlerTimeEndFilter = &v
	return s
}

func (s *QueryHotspotMessageRequest) SetEnableKeywordHighlight(v bool) *QueryHotspotMessageRequest {
	s.EnableKeywordHighlight = &v
	return s
}

func (s *QueryHotspotMessageRequest) SetPageNow(v int64) *QueryHotspotMessageRequest {
	s.PageNow = &v
	return s
}

func (s *QueryHotspotMessageRequest) SetFileId(v bool) *QueryHotspotMessageRequest {
	s.FileId = &v
	return s
}

func (s *QueryHotspotMessageRequest) SetSortBy(v string) *QueryHotspotMessageRequest {
	s.SortBy = &v
	return s
}

func (s *QueryHotspotMessageRequest) SetActive(v bool) *QueryHotspotMessageRequest {
	s.Active = &v
	return s
}

type QueryHotspotMessageResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 热搜数据
	Pages []*HotspotMessage `json:"pages,omitempty" xml:"pages,omitempty" type:"Repeated"`
	// 总条数
	TotalCount *int64 `json:"total_count,omitempty" xml:"total_count,omitempty"`
}

func (s QueryHotspotMessageResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryHotspotMessageResponse) GoString() string {
	return s.String()
}

func (s *QueryHotspotMessageResponse) SetReqMsgId(v string) *QueryHotspotMessageResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryHotspotMessageResponse) SetResultCode(v string) *QueryHotspotMessageResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryHotspotMessageResponse) SetResultMsg(v string) *QueryHotspotMessageResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryHotspotMessageResponse) SetPages(v []*HotspotMessage) *QueryHotspotMessageResponse {
	s.Pages = v
	return s
}

func (s *QueryHotspotMessageResponse) SetTotalCount(v int64) *QueryHotspotMessageResponse {
	s.TotalCount = &v
	return s
}

type SubmitMessagesHistoryRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 查询条件
	SearchCondition *SearchCondition `json:"search_condition,omitempty" xml:"search_condition,omitempty" require:"true"`
	// 请求ID
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
	// team_hash_id
	TeamHashId *string `json:"team_hash_id,omitempty" xml:"team_hash_id,omitempty"`
}

func (s SubmitMessagesHistoryRequest) String() string {
	return tea.Prettify(s)
}

func (s SubmitMessagesHistoryRequest) GoString() string {
	return s.String()
}

func (s *SubmitMessagesHistoryRequest) SetAuthToken(v string) *SubmitMessagesHistoryRequest {
	s.AuthToken = &v
	return s
}

func (s *SubmitMessagesHistoryRequest) SetProductInstanceId(v string) *SubmitMessagesHistoryRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SubmitMessagesHistoryRequest) SetSearchCondition(v *SearchCondition) *SubmitMessagesHistoryRequest {
	s.SearchCondition = v
	return s
}

func (s *SubmitMessagesHistoryRequest) SetRequestId(v string) *SubmitMessagesHistoryRequest {
	s.RequestId = &v
	return s
}

func (s *SubmitMessagesHistoryRequest) SetTeamHashId(v string) *SubmitMessagesHistoryRequest {
	s.TeamHashId = &v
	return s
}

type SubmitMessagesHistoryResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 查询ID
	SubmitId *string `json:"submit_id,omitempty" xml:"submit_id,omitempty"`
}

func (s SubmitMessagesHistoryResponse) String() string {
	return tea.Prettify(s)
}

func (s SubmitMessagesHistoryResponse) GoString() string {
	return s.String()
}

func (s *SubmitMessagesHistoryResponse) SetReqMsgId(v string) *SubmitMessagesHistoryResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SubmitMessagesHistoryResponse) SetResultCode(v string) *SubmitMessagesHistoryResponse {
	s.ResultCode = &v
	return s
}

func (s *SubmitMessagesHistoryResponse) SetResultMsg(v string) *SubmitMessagesHistoryResponse {
	s.ResultMsg = &v
	return s
}

func (s *SubmitMessagesHistoryResponse) SetSubmitId(v string) *SubmitMessagesHistoryResponse {
	s.SubmitId = &v
	return s
}

type GetMessagesHistoryRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 历史数据提交的产物
	SubmitId *string `json:"submit_id,omitempty" xml:"submit_id,omitempty" require:"true"`
	// request_id
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
	// page_now
	PageNow *int64 `json:"page_now,omitempty" xml:"page_now,omitempty" require:"true"`
	// page_size
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
}

func (s GetMessagesHistoryRequest) String() string {
	return tea.Prettify(s)
}

func (s GetMessagesHistoryRequest) GoString() string {
	return s.String()
}

func (s *GetMessagesHistoryRequest) SetAuthToken(v string) *GetMessagesHistoryRequest {
	s.AuthToken = &v
	return s
}

func (s *GetMessagesHistoryRequest) SetProductInstanceId(v string) *GetMessagesHistoryRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetMessagesHistoryRequest) SetSubmitId(v string) *GetMessagesHistoryRequest {
	s.SubmitId = &v
	return s
}

func (s *GetMessagesHistoryRequest) SetRequestId(v string) *GetMessagesHistoryRequest {
	s.RequestId = &v
	return s
}

func (s *GetMessagesHistoryRequest) SetPageNow(v int64) *GetMessagesHistoryRequest {
	s.PageNow = &v
	return s
}

func (s *GetMessagesHistoryRequest) SetPageSize(v int64) *GetMessagesHistoryRequest {
	s.PageSize = &v
	return s
}

type GetMessagesHistoryResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 总数
	TotalCount *int64 `json:"total_count,omitempty" xml:"total_count,omitempty"`
	// yuqing_messages
	YuqingMessages []*YuqingMessage `json:"yuqing_messages,omitempty" xml:"yuqing_messages,omitempty" type:"Repeated"`
}

func (s GetMessagesHistoryResponse) String() string {
	return tea.Prettify(s)
}

func (s GetMessagesHistoryResponse) GoString() string {
	return s.String()
}

func (s *GetMessagesHistoryResponse) SetReqMsgId(v string) *GetMessagesHistoryResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetMessagesHistoryResponse) SetResultCode(v string) *GetMessagesHistoryResponse {
	s.ResultCode = &v
	return s
}

func (s *GetMessagesHistoryResponse) SetResultMsg(v string) *GetMessagesHistoryResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetMessagesHistoryResponse) SetTotalCount(v int64) *GetMessagesHistoryResponse {
	s.TotalCount = &v
	return s
}

func (s *GetMessagesHistoryResponse) SetYuqingMessages(v []*YuqingMessage) *GetMessagesHistoryResponse {
	s.YuqingMessages = v
	return s
}

type SubmitHotspotTaskRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 媒体类型
	MediaSubTypes []*string `json:"media_sub_types,omitempty" xml:"media_sub_types,omitempty" require:"true" type:"Repeated"`
	// 任务过期时间,单位秒
	ExpiredTime *int64 `json:"expired_time,omitempty" xml:"expired_time,omitempty" require:"true"`
	// 排序方式： 正序(+)、倒序(-)
	SortByDirection *string `json:"sort_by_direction,omitempty" xml:"sort_by_direction,omitempty"`
	// 排序字段
	SortBy *string `json:"sort_by,omitempty" xml:"sort_by,omitempty"`
	// 爬取开始时间过滤
	CrawlerTimeStartFilter *int64 `json:"crawler_time_start_filter,omitempty" xml:"crawler_time_start_filter,omitempty"`
	// 爬取结束时间过滤
	CrawlerTimeEndFilter *int64 `json:"crawler_time_end_filter,omitempty" xml:"crawler_time_end_filter,omitempty"`
}

func (s SubmitHotspotTaskRequest) String() string {
	return tea.Prettify(s)
}

func (s SubmitHotspotTaskRequest) GoString() string {
	return s.String()
}

func (s *SubmitHotspotTaskRequest) SetAuthToken(v string) *SubmitHotspotTaskRequest {
	s.AuthToken = &v
	return s
}

func (s *SubmitHotspotTaskRequest) SetProductInstanceId(v string) *SubmitHotspotTaskRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SubmitHotspotTaskRequest) SetMediaSubTypes(v []*string) *SubmitHotspotTaskRequest {
	s.MediaSubTypes = v
	return s
}

func (s *SubmitHotspotTaskRequest) SetExpiredTime(v int64) *SubmitHotspotTaskRequest {
	s.ExpiredTime = &v
	return s
}

func (s *SubmitHotspotTaskRequest) SetSortByDirection(v string) *SubmitHotspotTaskRequest {
	s.SortByDirection = &v
	return s
}

func (s *SubmitHotspotTaskRequest) SetSortBy(v string) *SubmitHotspotTaskRequest {
	s.SortBy = &v
	return s
}

func (s *SubmitHotspotTaskRequest) SetCrawlerTimeStartFilter(v int64) *SubmitHotspotTaskRequest {
	s.CrawlerTimeStartFilter = &v
	return s
}

func (s *SubmitHotspotTaskRequest) SetCrawlerTimeEndFilter(v int64) *SubmitHotspotTaskRequest {
	s.CrawlerTimeEndFilter = &v
	return s
}

type SubmitHotspotTaskResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 任务ID
	TaskIds []*string `json:"task_ids,omitempty" xml:"task_ids,omitempty" type:"Repeated"`
}

func (s SubmitHotspotTaskResponse) String() string {
	return tea.Prettify(s)
}

func (s SubmitHotspotTaskResponse) GoString() string {
	return s.String()
}

func (s *SubmitHotspotTaskResponse) SetReqMsgId(v string) *SubmitHotspotTaskResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SubmitHotspotTaskResponse) SetResultCode(v string) *SubmitHotspotTaskResponse {
	s.ResultCode = &v
	return s
}

func (s *SubmitHotspotTaskResponse) SetResultMsg(v string) *SubmitHotspotTaskResponse {
	s.ResultMsg = &v
	return s
}

func (s *SubmitHotspotTaskResponse) SetTaskIds(v []*string) *SubmitHotspotTaskResponse {
	s.TaskIds = v
	return s
}

type GetHotspotTaskRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 任务ID
	TaskIds []*string `json:"task_ids,omitempty" xml:"task_ids,omitempty" require:"true" type:"Repeated"`
}

func (s GetHotspotTaskRequest) String() string {
	return tea.Prettify(s)
}

func (s GetHotspotTaskRequest) GoString() string {
	return s.String()
}

func (s *GetHotspotTaskRequest) SetAuthToken(v string) *GetHotspotTaskRequest {
	s.AuthToken = &v
	return s
}

func (s *GetHotspotTaskRequest) SetProductInstanceId(v string) *GetHotspotTaskRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetHotspotTaskRequest) SetTaskIds(v []*string) *GetHotspotTaskRequest {
	s.TaskIds = v
	return s
}

type GetHotspotTaskResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 任务的结果
	HotspotTasks []*HotspotTask `json:"hotspot_tasks,omitempty" xml:"hotspot_tasks,omitempty" type:"Repeated"`
}

func (s GetHotspotTaskResponse) String() string {
	return tea.Prettify(s)
}

func (s GetHotspotTaskResponse) GoString() string {
	return s.String()
}

func (s *GetHotspotTaskResponse) SetReqMsgId(v string) *GetHotspotTaskResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetHotspotTaskResponse) SetResultCode(v string) *GetHotspotTaskResponse {
	s.ResultCode = &v
	return s
}

func (s *GetHotspotTaskResponse) SetResultMsg(v string) *GetHotspotTaskResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetHotspotTaskResponse) SetHotspotTasks(v []*HotspotTask) *GetHotspotTaskResponse {
	s.HotspotTasks = v
	return s
}

type GetStsTokenRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 业务类型
	BizType *string `json:"biz_type,omitempty" xml:"biz_type,omitempty" require:"true"`
}

func (s GetStsTokenRequest) String() string {
	return tea.Prettify(s)
}

func (s GetStsTokenRequest) GoString() string {
	return s.String()
}

func (s *GetStsTokenRequest) SetAuthToken(v string) *GetStsTokenRequest {
	s.AuthToken = &v
	return s
}

func (s *GetStsTokenRequest) SetProductInstanceId(v string) *GetStsTokenRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetStsTokenRequest) SetBizType(v string) *GetStsTokenRequest {
	s.BizType = &v
	return s
}

type GetStsTokenResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// AK
	AccessKeyId *string `json:"access_key_id,omitempty" xml:"access_key_id,omitempty"`
	// SK
	AccessKeySecret *string `json:"access_key_secret,omitempty" xml:"access_key_secret,omitempty"`
	// stsToken
	SecurityToken *string `json:"security_token,omitempty" xml:"security_token,omitempty"`
}

func (s GetStsTokenResponse) String() string {
	return tea.Prettify(s)
}

func (s GetStsTokenResponse) GoString() string {
	return s.String()
}

func (s *GetStsTokenResponse) SetReqMsgId(v string) *GetStsTokenResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetStsTokenResponse) SetResultCode(v string) *GetStsTokenResponse {
	s.ResultCode = &v
	return s
}

func (s *GetStsTokenResponse) SetResultMsg(v string) *GetStsTokenResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetStsTokenResponse) SetAccessKeyId(v string) *GetStsTokenResponse {
	s.AccessKeyId = &v
	return s
}

func (s *GetStsTokenResponse) SetAccessKeySecret(v string) *GetStsTokenResponse {
	s.AccessKeySecret = &v
	return s
}

func (s *GetStsTokenResponse) SetSecurityToken(v string) *GetStsTokenResponse {
	s.SecurityToken = &v
	return s
}

type OperateCommonInterfaceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 入参JSON
	ParamJson *string `json:"param_json,omitempty" xml:"param_json,omitempty" require:"true"`
	// 接口名称
	InterfaceName *string `json:"interface_name,omitempty" xml:"interface_name,omitempty" require:"true"`
	// 请求ID
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
}

func (s OperateCommonInterfaceRequest) String() string {
	return tea.Prettify(s)
}

func (s OperateCommonInterfaceRequest) GoString() string {
	return s.String()
}

func (s *OperateCommonInterfaceRequest) SetAuthToken(v string) *OperateCommonInterfaceRequest {
	s.AuthToken = &v
	return s
}

func (s *OperateCommonInterfaceRequest) SetProductInstanceId(v string) *OperateCommonInterfaceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *OperateCommonInterfaceRequest) SetParamJson(v string) *OperateCommonInterfaceRequest {
	s.ParamJson = &v
	return s
}

func (s *OperateCommonInterfaceRequest) SetInterfaceName(v string) *OperateCommonInterfaceRequest {
	s.InterfaceName = &v
	return s
}

func (s *OperateCommonInterfaceRequest) SetRequestId(v string) *OperateCommonInterfaceRequest {
	s.RequestId = &v
	return s
}

type OperateCommonInterfaceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回JSON
	ResultJson *string `json:"result_json,omitempty" xml:"result_json,omitempty"`
}

func (s OperateCommonInterfaceResponse) String() string {
	return tea.Prettify(s)
}

func (s OperateCommonInterfaceResponse) GoString() string {
	return s.String()
}

func (s *OperateCommonInterfaceResponse) SetReqMsgId(v string) *OperateCommonInterfaceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *OperateCommonInterfaceResponse) SetResultCode(v string) *OperateCommonInterfaceResponse {
	s.ResultCode = &v
	return s
}

func (s *OperateCommonInterfaceResponse) SetResultMsg(v string) *OperateCommonInterfaceResponse {
	s.ResultMsg = &v
	return s
}

func (s *OperateCommonInterfaceResponse) SetResultJson(v string) *OperateCommonInterfaceResponse {
	s.ResultJson = &v
	return s
}

type Client struct {
	Endpoint                *string
	RegionId                *string
	AccessKeyId             *string
	AccessKeySecret         *string
	Protocol                *string
	UserAgent               *string
	ReadTimeout             *int
	ConnectTimeout          *int
	HttpProxy               *string
	HttpsProxy              *string
	Socks5Proxy             *string
	Socks5NetWork           *string
	NoProxy                 *string
	MaxIdleConns            *int
	SecurityToken           *string
	MaxIdleTimeMillis       *int
	KeepAliveDurationMillis *int
	MaxRequests             *int
	MaxRequestsPerHost      *int
}

/**
 * Init client with Config
 * @param config config contains the necessary information to create a client
 */
func NewClient(config *Config) (*Client, error) {
	client := new(Client)
	err := client.Init(config)
	return client, err
}

func (client *Client) Init(config *Config) (_err error) {
	if tea.BoolValue(util.IsUnset(tea.ToMap(config))) {
		_err = tea.NewSDKError(map[string]interface{}{
			"code":    "ParameterMissing",
			"message": "'config' can not be unset",
		})
		return _err
	}

	client.AccessKeyId = config.AccessKeyId
	client.AccessKeySecret = config.AccessKeySecret
	client.SecurityToken = config.SecurityToken
	client.Endpoint = config.Endpoint
	client.Protocol = config.Protocol
	client.UserAgent = config.UserAgent
	client.ReadTimeout = util.DefaultNumber(config.ReadTimeout, tea.Int(20000))
	client.ConnectTimeout = util.DefaultNumber(config.ConnectTimeout, tea.Int(20000))
	client.HttpProxy = config.HttpProxy
	client.HttpsProxy = config.HttpsProxy
	client.NoProxy = config.NoProxy
	client.Socks5Proxy = config.Socks5Proxy
	client.Socks5NetWork = config.Socks5NetWork
	client.MaxIdleConns = util.DefaultNumber(config.MaxIdleConns, tea.Int(60000))
	client.MaxIdleTimeMillis = util.DefaultNumber(config.MaxIdleTimeMillis, tea.Int(5))
	client.KeepAliveDurationMillis = util.DefaultNumber(config.KeepAliveDurationMillis, tea.Int(5000))
	client.MaxRequests = util.DefaultNumber(config.MaxRequests, tea.Int(100))
	client.MaxRequestsPerHost = util.DefaultNumber(config.MaxRequestsPerHost, tea.Int(100))
	return nil
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
func (client *Client) DoRequest(version *string, action *string, protocol *string, method *string, pathname *string, request map[string]interface{}, headers map[string]*string, runtime *util.RuntimeOptions) (_result map[string]interface{}, _err error) {
	_err = tea.Validate(runtime)
	if _err != nil {
		return _result, _err
	}
	_runtime := map[string]interface{}{
		"timeouted":          "retry",
		"readTimeout":        tea.IntValue(util.DefaultNumber(runtime.ReadTimeout, client.ReadTimeout)),
		"connectTimeout":     tea.IntValue(util.DefaultNumber(runtime.ConnectTimeout, client.ConnectTimeout)),
		"httpProxy":          tea.StringValue(util.DefaultString(runtime.HttpProxy, client.HttpProxy)),
		"httpsProxy":         tea.StringValue(util.DefaultString(runtime.HttpsProxy, client.HttpsProxy)),
		"noProxy":            tea.StringValue(util.DefaultString(runtime.NoProxy, client.NoProxy)),
		"maxIdleConns":       tea.IntValue(util.DefaultNumber(runtime.MaxIdleConns, client.MaxIdleConns)),
		"maxIdleTimeMillis":  tea.IntValue(client.MaxIdleTimeMillis),
		"keepAliveDuration":  tea.IntValue(client.KeepAliveDurationMillis),
		"maxRequests":        tea.IntValue(client.MaxRequests),
		"maxRequestsPerHost": tea.IntValue(client.MaxRequestsPerHost),
		"retry": map[string]interface{}{
			"retryable":   tea.BoolValue(runtime.Autoretry),
			"maxAttempts": tea.IntValue(util.DefaultNumber(runtime.MaxAttempts, tea.Int(3))),
		},
		"backoff": map[string]interface{}{
			"policy": tea.StringValue(util.DefaultString(runtime.BackoffPolicy, tea.String("no"))),
			"period": tea.IntValue(util.DefaultNumber(runtime.BackoffPeriod, tea.Int(1))),
		},
		"ignoreSSL": tea.BoolValue(runtime.IgnoreSSL),
	}

	_resp := make(map[string]interface{})
	for _retryTimes := 0; tea.BoolValue(tea.AllowRetry(_runtime["retry"], tea.Int(_retryTimes))); _retryTimes++ {
		if _retryTimes > 0 {
			_backoffTime := tea.GetBackoffTime(_runtime["backoff"], tea.Int(_retryTimes))
			if tea.IntValue(_backoffTime) > 0 {
				tea.Sleep(_backoffTime)
			}
		}

		_resp, _err = func() (map[string]interface{}, error) {
			request_ := tea.NewRequest()
			request_.Protocol = util.DefaultString(client.Protocol, protocol)
			request_.Method = method
			request_.Pathname = pathname
			request_.Query = map[string]*string{
				"method":           action,
				"version":          version,
				"sign_type":        tea.String("HmacSHA1"),
				"req_time":         antchainutil.GetTimestamp(),
				"req_msg_id":       antchainutil.GetNonce(),
				"access_key":       client.AccessKeyId,
				"base_sdk_version": tea.String("TeaSDK-2.0"),
				"sdk_version":      tea.String("1.2.29"),
				"_prod_code":       tea.String("YUQING"),
				"_prod_channel":    tea.String("undefined"),
			}
			if !tea.BoolValue(util.Empty(client.SecurityToken)) {
				request_.Query["security_token"] = client.SecurityToken
			}

			request_.Headers = tea.Merge(map[string]*string{
				"host":       util.DefaultString(client.Endpoint, tea.String("openapi.antchain.antgroup.com")),
				"user-agent": util.GetUserAgent(client.UserAgent),
			}, headers)
			tmp := util.AnyifyMapValue(rpcutil.Query(request))
			request_.Body = tea.ToReader(util.ToFormString(tmp))
			request_.Headers["content-type"] = tea.String("application/x-www-form-urlencoded")
			signedParam := tea.Merge(request_.Query,
				rpcutil.Query(request))
			request_.Query["sign"] = antchainutil.GetSignature(signedParam, client.AccessKeySecret)
			response_, _err := tea.DoRequest(request_, _runtime)
			if _err != nil {
				return _result, _err
			}
			raw, _err := util.ReadAsString(response_.Body)
			if _err != nil {
				return _result, _err
			}

			obj := util.ParseJSON(raw)
			res, _err := util.AssertAsMap(obj)
			if _err != nil {
				return _result, _err
			}

			resp, _err := util.AssertAsMap(res["response"])
			if _err != nil {
				return _result, _err
			}

			if tea.BoolValue(antchainutil.HasError(raw, client.AccessKeySecret)) {
				_err = tea.NewSDKError(map[string]interface{}{
					"message": resp["result_msg"],
					"data":    resp,
					"code":    resp["result_code"],
				})
				return _result, _err
			}

			_result = resp
			return _result, _err
		}()
		if !tea.BoolValue(tea.Retryable(_err)) {
			break
		}
	}

	return _resp, _err
}

/**
 * Description: 查询舆情列表
 * Summary: 查询舆情列表
 */
func (client *Client) QueryMessages(request *QueryMessagesRequest) (_result *QueryMessagesResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryMessagesResponse{}
	_body, _err := client.QueryMessagesEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询舆情列表
 * Summary: 查询舆情列表
 */
func (client *Client) QueryMessagesEx(request *QueryMessagesRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryMessagesResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryMessagesResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("universalsaas.yuqing.messages.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 舆情分析任务提交
 * Summary: 舆情分析任务提交
 */
func (client *Client) SaveAnalysisSubmit(request *SaveAnalysisSubmitRequest) (_result *SaveAnalysisSubmitResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SaveAnalysisSubmitResponse{}
	_body, _err := client.SaveAnalysisSubmitEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 舆情分析任务提交
 * Summary: 舆情分析任务提交
 */
func (client *Client) SaveAnalysisSubmitEx(request *SaveAnalysisSubmitRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SaveAnalysisSubmitResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SaveAnalysisSubmitResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("universalsaas.yuqing.analysis.submit.save"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 舆情分析任务查询
 * Summary: 舆情分析任务查询
 */
func (client *Client) QueryAnalysisQuery(request *QueryAnalysisQueryRequest) (_result *QueryAnalysisQueryResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAnalysisQueryResponse{}
	_body, _err := client.QueryAnalysisQueryEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 舆情分析任务查询
 * Summary: 舆情分析任务查询
 */
func (client *Client) QueryAnalysisQueryEx(request *QueryAnalysisQueryRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAnalysisQueryResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAnalysisQueryResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("universalsaas.yuqing.analysis.query.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 废弃
 * Summary: 废弃
 */
func (client *Client) SaveProductOpen(request *SaveProductOpenRequest) (_result *SaveProductOpenResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SaveProductOpenResponse{}
	_body, _err := client.SaveProductOpenEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 废弃
 * Summary: 废弃
 */
func (client *Client) SaveProductOpenEx(request *SaveProductOpenRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SaveProductOpenResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SaveProductOpenResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("universalsaas.yuqing.product.open.save"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 废弃
 * Summary: 废弃
 */
func (client *Client) SaveProductTop(request *SaveProductTopRequest) (_result *SaveProductTopResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SaveProductTopResponse{}
	_body, _err := client.SaveProductTopEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 废弃
 * Summary: 废弃
 */
func (client *Client) SaveProductTopEx(request *SaveProductTopRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SaveProductTopResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SaveProductTopResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("universalsaas.yuqing.product.top.save"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 产品操作接口
 * Summary: 产品操作接口
 */
func (client *Client) SetProductOperate(request *SetProductOperateRequest) (_result *SetProductOperateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SetProductOperateResponse{}
	_body, _err := client.SetProductOperateEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 产品操作接口
 * Summary: 产品操作接口
 */
func (client *Client) SetProductOperateEx(request *SetProductOperateRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SetProductOperateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SetProductOperateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("universalsaas.yuqing.product.operate.set"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 发送提醒
 * Summary: 发送提醒
 */
func (client *Client) SendProductNotice(request *SendProductNoticeRequest) (_result *SendProductNoticeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SendProductNoticeResponse{}
	_body, _err := client.SendProductNoticeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 发送提醒
 * Summary: 发送提醒
 */
func (client *Client) SendProductNoticeEx(request *SendProductNoticeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SendProductNoticeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SendProductNoticeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("universalsaas.yuqing.product.notice.send"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建深度分析
 * Summary: 创建深度分析
 */
func (client *Client) SaveDeepanalysisSubmit(request *SaveDeepanalysisSubmitRequest) (_result *SaveDeepanalysisSubmitResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SaveDeepanalysisSubmitResponse{}
	_body, _err := client.SaveDeepanalysisSubmitEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建深度分析
 * Summary: 创建深度分析
 */
func (client *Client) SaveDeepanalysisSubmitEx(request *SaveDeepanalysisSubmitRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SaveDeepanalysisSubmitResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SaveDeepanalysisSubmitResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("universalsaas.yuqing.deepanalysis.submit.save"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询深度分析
 * Summary: 查询深度分析
 */
func (client *Client) QueryDeepanalysisQuery(request *QueryDeepanalysisQueryRequest) (_result *QueryDeepanalysisQueryResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDeepanalysisQueryResponse{}
	_body, _err := client.QueryDeepanalysisQueryEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询深度分析
 * Summary: 查询深度分析
 */
func (client *Client) QueryDeepanalysisQueryEx(request *QueryDeepanalysisQueryRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDeepanalysisQueryResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDeepanalysisQueryResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("universalsaas.yuqing.deepanalysis.query.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取单个與情
 * Summary: 获取单个
 */
func (client *Client) GetMessage(request *GetMessageRequest) (_result *GetMessageResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetMessageResponse{}
	_body, _err := client.GetMessageEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取单个與情
 * Summary: 获取单个
 */
func (client *Client) GetMessageEx(request *GetMessageRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetMessageResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetMessageResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("universalsaas.yuqing.message.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询與情项目
 * Summary: 查询與情项目
 */
func (client *Client) QueryProject(request *QueryProjectRequest) (_result *QueryProjectResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryProjectResponse{}
	_body, _err := client.QueryProjectEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询與情项目
 * Summary: 查询與情项目
 */
func (client *Client) QueryProjectEx(request *QueryProjectRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryProjectResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryProjectResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("universalsaas.yuqing.project.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建项目
 * Summary: 创建项目
 */
func (client *Client) CreateProject(request *CreateProjectRequest) (_result *CreateProjectResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateProjectResponse{}
	_body, _err := client.CreateProjectEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建项目
 * Summary: 创建项目
 */
func (client *Client) CreateProjectEx(request *CreateProjectRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateProjectResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateProjectResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("universalsaas.yuqing.project.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 删除项目
 * Summary: 删除项目
 */
func (client *Client) DeleteProject(request *DeleteProjectRequest) (_result *DeleteProjectResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DeleteProjectResponse{}
	_body, _err := client.DeleteProjectEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 删除项目
 * Summary: 删除项目
 */
func (client *Client) DeleteProjectEx(request *DeleteProjectRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DeleteProjectResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DeleteProjectResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("universalsaas.yuqing.project.delete"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询预警消息列表
 * Summary: 查询预警消息列表
 */
func (client *Client) QueryAlarm(request *QueryAlarmRequest) (_result *QueryAlarmResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAlarmResponse{}
	_body, _err := client.QueryAlarmEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询预警消息列表
 * Summary: 查询预警消息列表
 */
func (client *Client) QueryAlarmEx(request *QueryAlarmRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAlarmResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAlarmResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("universalsaas.yuqing.alarm.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 根据接口获取热搜数据
 * Summary: 與情热搜接口
 */
func (client *Client) QueryHotspotMessage(request *QueryHotspotMessageRequest) (_result *QueryHotspotMessageResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryHotspotMessageResponse{}
	_body, _err := client.QueryHotspotMessageEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 根据接口获取热搜数据
 * Summary: 與情热搜接口
 */
func (client *Client) QueryHotspotMessageEx(request *QueryHotspotMessageRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryHotspotMessageResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryHotspotMessageResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("universalsaas.yuqing.hotspot.message.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 與情历史数据异步查询接口
 * Summary: 與情历史数据异步查询接口
 */
func (client *Client) SubmitMessagesHistory(request *SubmitMessagesHistoryRequest) (_result *SubmitMessagesHistoryResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SubmitMessagesHistoryResponse{}
	_body, _err := client.SubmitMessagesHistoryEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 與情历史数据异步查询接口
 * Summary: 與情历史数据异步查询接口
 */
func (client *Client) SubmitMessagesHistoryEx(request *SubmitMessagesHistoryRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SubmitMessagesHistoryResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SubmitMessagesHistoryResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("universalsaas.yuqing.messages.history.submit"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取历史與情消息
 * Summary: 获取历史與情消息
 */
func (client *Client) GetMessagesHistory(request *GetMessagesHistoryRequest) (_result *GetMessagesHistoryResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetMessagesHistoryResponse{}
	_body, _err := client.GetMessagesHistoryEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取历史與情消息
 * Summary: 获取历史與情消息
 */
func (client *Client) GetMessagesHistoryEx(request *GetMessagesHistoryRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetMessagesHistoryResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetMessagesHistoryResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("universalsaas.yuqing.messages.history.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 提交实时热搜任务
 * Summary: 提交实时热搜任务
 */
func (client *Client) SubmitHotspotTask(request *SubmitHotspotTaskRequest) (_result *SubmitHotspotTaskResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SubmitHotspotTaskResponse{}
	_body, _err := client.SubmitHotspotTaskEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 提交实时热搜任务
 * Summary: 提交实时热搜任务
 */
func (client *Client) SubmitHotspotTaskEx(request *SubmitHotspotTaskRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SubmitHotspotTaskResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SubmitHotspotTaskResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("universalsaas.yuqing.hotspot.task.submit"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取实时热搜任务结果
 * Summary: 获取实时热搜任务结果
 */
func (client *Client) GetHotspotTask(request *GetHotspotTaskRequest) (_result *GetHotspotTaskResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetHotspotTaskResponse{}
	_body, _err := client.GetHotspotTaskEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取实时热搜任务结果
 * Summary: 获取实时热搜任务结果
 */
func (client *Client) GetHotspotTaskEx(request *GetHotspotTaskRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetHotspotTaskResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetHotspotTaskResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("universalsaas.yuqing.hotspot.task.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取stsToken，作用于通用SAAS业务
 * Summary: 获取stsToken
 */
func (client *Client) GetStsToken(request *GetStsTokenRequest) (_result *GetStsTokenResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetStsTokenResponse{}
	_body, _err := client.GetStsTokenEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取stsToken，作用于通用SAAS业务
 * Summary: 获取stsToken
 */
func (client *Client) GetStsTokenEx(request *GetStsTokenRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetStsTokenResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetStsTokenResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("universalsaas.yuqing.sts.token.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 通用操作接口
 * Summary: 通用操作接口
 */
func (client *Client) OperateCommonInterface(request *OperateCommonInterfaceRequest) (_result *OperateCommonInterfaceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &OperateCommonInterfaceResponse{}
	_body, _err := client.OperateCommonInterfaceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 通用操作接口
 * Summary: 通用操作接口
 */
func (client *Client) OperateCommonInterfaceEx(request *OperateCommonInterfaceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *OperateCommonInterfaceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &OperateCommonInterfaceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("universalsaas.yuqing.common.interface.operate"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
