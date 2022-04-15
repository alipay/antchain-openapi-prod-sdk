// This file is auto-generated, don't edit it. Thanks.
package client

import (
	rpcutil "github.com/alibabacloud-go/tea-rpc-utils/service"
	util "github.com/alibabacloud-go/tea-utils/service"
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
	RelevanceScore *int64 `json:"relevance_score,omitempty" xml:"relevance_score,omitempty"`
	// 相似文章数
	SimilarNumber *int64 `json:"similar_number,omitempty" xml:"similar_number,omitempty"`
	// 微博评论id
	WeiboCommentId *string `json:"weibo_comment_id,omitempty" xml:"weibo_comment_id,omitempty"`
	// 微博消息id
	WeiboMid *string `json:"weibo_mid,omitempty" xml:"weibo_mid,omitempty"`
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

func (s *YuqingMessage) SetRelevanceScore(v int64) *YuqingMessage {
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

// 查询结构体
type SearchCondition struct {
	// 搭配词
	AssKeywords *string `json:"ass_keywords,omitempty" xml:"ass_keywords,omitempty"`
	// 被@的用户名称
	AtAuthorName *string `json:"at_author_name,omitempty" xml:"at_author_name,omitempty"`
	// 作者名称
	AuthorName *string `json:"author_name,omitempty" xml:"author_name,omitempty"`
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
	DocId *string `json:"doc_id,omitempty" xml:"doc_id,omitempty"`
	// 是否去重
	DuplicateRemoval *bool `json:"duplicate_removal,omitempty" xml:"duplicate_removal,omitempty"`
	// 情感类型，1非负，-1负面
	EmotionType *int64 `json:"emotion_type,omitempty" xml:"emotion_type,omitempty"`
	// 是否高亮关键词
	EnableKeywordHighlight *bool `json:"enable_keyword_highlight,omitempty" xml:"enable_keyword_highlight,omitempty"`
	// 排除被@的用户名称
	ExcludeAtAuthorName *string `json:"exclude_at_author_name,omitempty" xml:"exclude_at_author_name,omitempty"`
	// 排除作者名称
	ExcludeAuthorName *string `json:"exclude_author_name,omitempty" xml:"exclude_author_name,omitempty"`
	// 排除网站域名
	ExcludeHostName *string `json:"exclude_host_name,omitempty" xml:"exclude_host_name,omitempty"`
	// 排除关键词标签Id列表
	ExcludeKeywordTagIds *string `json:"exclude_keyword_tag_ids,omitempty" xml:"exclude_keyword_tag_ids,omitempty"`
	// 排除词
	ExcludeKeywords *string `json:"exclude_keywords,omitempty" xml:"exclude_keywords,omitempty"`
	// 标题排除词
	ExcludeKeywordsInTitle *string `json:"exclude_keywords_in_title,omitempty" xml:"exclude_keywords_in_title,omitempty"`
	// 排除媒体库id列表
	ExcludeMediaLibraryIds *string `json:"exclude_media_library_ids,omitempty" xml:"exclude_media_library_ids,omitempty"`
	// 排除媒体名称
	ExcludeMediaName *string `json:"exclude_media_name,omitempty" xml:"exclude_media_name,omitempty"`
	// 排除媒体类型，枚举值
	ExcludeMediaType *string `json:"exclude_media_type,omitempty" xml:"exclude_media_type,omitempty"`
	// 排除消息类型，枚举值
	ExcludeMessageType *string `json:"exclude_message_type,omitempty" xml:"exclude_message_type,omitempty"`
	// 其他过滤条件
	FieldConditions *string `json:"field_conditions,omitempty" xml:"field_conditions,omitempty"`
	// 文章是否含有图片
	HasImage *bool `json:"has_image,omitempty" xml:"has_image,omitempty"`
	// 是否含有视频
	HasVideo *bool `json:"has_video,omitempty" xml:"has_video,omitempty"`
	// 网站域名
	HostName *string `json:"host_name,omitempty" xml:"host_name,omitempty"`
	// 关键词标签Id列表
	KeywordTagIds *string `json:"keyword_tag_ids,omitempty" xml:"keyword_tag_ids,omitempty"`
	// 点赞级别，1：100以内，2：100-1k，3：1k-1w以内，4：1w-10w，5，10w+
	LikesLevel *int64 `json:"likes_level,omitempty" xml:"likes_level,omitempty"`
	// 媒体库id列表
	MediaLibraryIds *string `json:"media_library_ids,omitempty" xml:"media_library_ids,omitempty"`
	// 媒体名称
	MediaName *string `json:"media_name,omitempty" xml:"media_name,omitempty"`
	// 体类型，枚举值
	MediaType *string `json:"media_type,omitempty" xml:"media_type,omitempty"`
	// 消息类型，枚举值
	MessageType *string `json:"message_type,omitempty" xml:"message_type,omitempty"`
	// 当前页
	PageNow *int64 `json:"page_now,omitempty" xml:"page_now,omitempty"`
	// 页大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// 舆情父文章的docId，一般用于查看某篇文章的评论
	ParentDocId *string `json:"parent_doc_id,omitempty" xml:"parent_doc_id,omitempty"`
	// 关键词
	PosKeywords *string `json:"pos_keywords,omitempty" xml:"pos_keywords,omitempty"`
	// 标题关键词
	PosKeywordsInTitle *string `json:"pos_keywords_in_title,omitempty" xml:"pos_keywords_in_title,omitempty"`
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
	Topics *string `json:"topics,omitempty" xml:"topics,omitempty"`
	// 舆情文章截止更新时间
	UpdateTimeEnd *int64 `json:"update_time_end,omitempty" xml:"update_time_end,omitempty"`
	// 舆情文章起始更新时间
	UpdateTimeStart *int64 `json:"update_time_start,omitempty" xml:"update_time_start,omitempty"`
}

func (s SearchCondition) String() string {
	return tea.Prettify(s)
}

func (s SearchCondition) GoString() string {
	return s.String()
}

func (s *SearchCondition) SetAssKeywords(v string) *SearchCondition {
	s.AssKeywords = &v
	return s
}

func (s *SearchCondition) SetAtAuthorName(v string) *SearchCondition {
	s.AtAuthorName = &v
	return s
}

func (s *SearchCondition) SetAuthorName(v string) *SearchCondition {
	s.AuthorName = &v
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

func (s *SearchCondition) SetDocId(v string) *SearchCondition {
	s.DocId = &v
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

func (s *SearchCondition) SetExcludeAtAuthorName(v string) *SearchCondition {
	s.ExcludeAtAuthorName = &v
	return s
}

func (s *SearchCondition) SetExcludeAuthorName(v string) *SearchCondition {
	s.ExcludeAuthorName = &v
	return s
}

func (s *SearchCondition) SetExcludeHostName(v string) *SearchCondition {
	s.ExcludeHostName = &v
	return s
}

func (s *SearchCondition) SetExcludeKeywordTagIds(v string) *SearchCondition {
	s.ExcludeKeywordTagIds = &v
	return s
}

func (s *SearchCondition) SetExcludeKeywords(v string) *SearchCondition {
	s.ExcludeKeywords = &v
	return s
}

func (s *SearchCondition) SetExcludeKeywordsInTitle(v string) *SearchCondition {
	s.ExcludeKeywordsInTitle = &v
	return s
}

func (s *SearchCondition) SetExcludeMediaLibraryIds(v string) *SearchCondition {
	s.ExcludeMediaLibraryIds = &v
	return s
}

func (s *SearchCondition) SetExcludeMediaName(v string) *SearchCondition {
	s.ExcludeMediaName = &v
	return s
}

func (s *SearchCondition) SetExcludeMediaType(v string) *SearchCondition {
	s.ExcludeMediaType = &v
	return s
}

func (s *SearchCondition) SetExcludeMessageType(v string) *SearchCondition {
	s.ExcludeMessageType = &v
	return s
}

func (s *SearchCondition) SetFieldConditions(v string) *SearchCondition {
	s.FieldConditions = &v
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

func (s *SearchCondition) SetHostName(v string) *SearchCondition {
	s.HostName = &v
	return s
}

func (s *SearchCondition) SetKeywordTagIds(v string) *SearchCondition {
	s.KeywordTagIds = &v
	return s
}

func (s *SearchCondition) SetLikesLevel(v int64) *SearchCondition {
	s.LikesLevel = &v
	return s
}

func (s *SearchCondition) SetMediaLibraryIds(v string) *SearchCondition {
	s.MediaLibraryIds = &v
	return s
}

func (s *SearchCondition) SetMediaName(v string) *SearchCondition {
	s.MediaName = &v
	return s
}

func (s *SearchCondition) SetMediaType(v string) *SearchCondition {
	s.MediaType = &v
	return s
}

func (s *SearchCondition) SetMessageType(v string) *SearchCondition {
	s.MessageType = &v
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

func (s *SearchCondition) SetPosKeywords(v string) *SearchCondition {
	s.PosKeywords = &v
	return s
}

func (s *SearchCondition) SetPosKeywordsInTitle(v string) *SearchCondition {
	s.PosKeywordsInTitle = &v
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

func (s *SearchCondition) SetTopics(v string) *SearchCondition {
	s.Topics = &v
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

type SaveAnalysisSubmitResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 分析任务ID
	AnalysisId *string `json:"analysis_id,omitempty" xml:"analysis_id,omitempty"`
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

func (s *SaveAnalysisSubmitResponse) SetAnalysisId(v string) *SaveAnalysisSubmitResponse {
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
	AnalysisId *string `json:"analysis_id,omitempty" xml:"analysis_id,omitempty" require:"true"`
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

func (s *QueryAnalysisQueryRequest) SetAnalysisId(v string) *QueryAnalysisQueryRequest {
	s.AnalysisId = &v
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
	AnalysisId *string `json:"analysis_id,omitempty" xml:"analysis_id,omitempty"`
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

func (s *QueryAnalysisQueryResponse) SetAnalysisId(v string) *QueryAnalysisQueryResponse {
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
	NoticeType *string `json:"notice_type,omitempty" xml:"notice_type,omitempty"`
	// 钉钉结构体
	DingTalkContent *DingTalkContent `json:"ding_talk_content,omitempty" xml:"ding_talk_content,omitempty"`
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

func (s *SendProductNoticeRequest) SetDingTalkContent(v *DingTalkContent) *SendProductNoticeRequest {
	s.DingTalkContent = v
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
		"timeouted":               "retry",
		"readTimeout":             tea.IntValue(util.DefaultNumber(runtime.ReadTimeout, client.ReadTimeout)),
		"connectTimeout":          tea.IntValue(util.DefaultNumber(runtime.ConnectTimeout, client.ConnectTimeout)),
		"httpProxy":               tea.StringValue(util.DefaultString(runtime.HttpProxy, client.HttpProxy)),
		"httpsProxy":              tea.StringValue(util.DefaultString(runtime.HttpsProxy, client.HttpsProxy)),
		"noProxy":                 tea.StringValue(util.DefaultString(runtime.NoProxy, client.NoProxy)),
		"maxIdleConns":            tea.IntValue(util.DefaultNumber(runtime.MaxIdleConns, client.MaxIdleConns)),
		"maxIdleTimeMillis":       tea.IntValue(client.MaxIdleTimeMillis),
		"keepAliveDurationMillis": tea.IntValue(client.KeepAliveDurationMillis),
		"maxRequests":             tea.IntValue(client.MaxRequests),
		"maxRequestsPerHost":      tea.IntValue(client.MaxRequestsPerHost),
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
				"sdk_version":      tea.String("1.1.8"),
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
			res := util.AssertAsMap(obj)
			resp := util.AssertAsMap(res["response"])
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
 * Description: 产品开通
 * Summary: 产品开通
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
 * Description: 产品开通
 * Summary: 产品开通
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
 * Description: 产品关闭
 * Summary: 产品关闭
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
 * Description: 产品关闭
 * Summary: 产品关闭
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
