// This file is auto-generated, don't edit it. Thanks.
package client

import (
	rpcutil "github.com/alibabacloud-go/tea-rpc-utils/service"
	util "github.com/alibabacloud-go/tea-utils/v2/service"
	"github.com/alibabacloud-go/tea/tea"
	antchainutil "github.com/antchain-openapi-sdk-go/antchain-util/service"
)

// Description:
//
// Model for initing client
type Config struct {
	// accesskey id
	AccessKeyId *string `json:"accessKeyId,omitempty" xml:"accessKeyId,omitempty"`
	// accesskey secret
	AccessKeySecret *string `json:"accessKeySecret,omitempty" xml:"accessKeySecret,omitempty"`
	// security token
	SecurityToken *string `json:"securityToken,omitempty" xml:"securityToken,omitempty"`
	// http protocol
	//
	// example:
	//
	// http
	Protocol *string `json:"protocol,omitempty" xml:"protocol,omitempty"`
	// read timeout
	//
	// example:
	//
	// 10
	ReadTimeout *int `json:"readTimeout,omitempty" xml:"readTimeout,omitempty"`
	// connect timeout
	//
	// example:
	//
	// 10
	ConnectTimeout *int `json:"connectTimeout,omitempty" xml:"connectTimeout,omitempty"`
	// http proxy
	//
	// example:
	//
	// http://localhost
	HttpProxy *string `json:"httpProxy,omitempty" xml:"httpProxy,omitempty"`
	// https proxy
	//
	// example:
	//
	// https://localhost
	HttpsProxy *string `json:"httpsProxy,omitempty" xml:"httpsProxy,omitempty"`
	// endpoint
	//
	// example:
	//
	// cs.aliyuncs.com
	Endpoint *string `json:"endpoint,omitempty" xml:"endpoint,omitempty"`
	// proxy white list
	//
	// example:
	//
	// http://localhost
	NoProxy *string `json:"noProxy,omitempty" xml:"noProxy,omitempty"`
	// max idle conns
	//
	// example:
	//
	// 3
	MaxIdleConns *int `json:"maxIdleConns,omitempty" xml:"maxIdleConns,omitempty"`
	// user agent
	//
	// example:
	//
	// Alibabacloud/1
	UserAgent *string `json:"userAgent,omitempty" xml:"userAgent,omitempty"`
	// socks5 proxy
	Socks5Proxy *string `json:"socks5Proxy,omitempty" xml:"socks5Proxy,omitempty"`
	// socks5 network
	//
	// example:
	//
	// TCP
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

// 只计一次的请求级费用明细
type RequestItems struct {
	// 规则编码
	// example:
	//
	// 规则编码
	PriceRuleCode *string `json:"price_rule_code,omitempty" xml:"price_rule_code,omitempty"`
	// 收费项编码
	// example:
	//
	// 收费项编码
	ChargeItemCode *string `json:"charge_item_code,omitempty" xml:"charge_item_code,omitempty"`
	// 计量指标类型
	// example:
	//
	// 计量指标类型
	MetricType *string `json:"metric_type,omitempty" xml:"metric_type,omitempty"`
	// 原始计量数量
	// example:
	//
	// 原始计量数量
	Quantity *string `json:"quantity,omitempty" xml:"quantity,omitempty"`
	// 免费额度
	// example:
	//
	// 免费额度
	FreeQuota *string `json:"free_quota,omitempty" xml:"free_quota,omitempty"`
	// 计费数量(扣除免费额度后的值)
	// example:
	//
	// 计费数量(扣除免费额度后的值)
	BillableQuantity *string `json:"billable_quantity,omitempty" xml:"billable_quantity,omitempty"`
	// 计费单位大小
	// example:
	//
	// 计费单位大小
	UnitSize *string `json:"unit_size,omitempty" xml:"unit_size,omitempty"`
	// 单价
	// example:
	//
	// 单价
	UnitPrice *string `json:"unit_price,omitempty" xml:"unit_price,omitempty"`
	// 币种
	// example:
	//
	// 币种
	Currency *string `json:"currency,omitempty" xml:"currency,omitempty"`
	// 单项金额
	// example:
	//
	// 单项金额
	Amount *string `json:"amount,omitempty" xml:"amount,omitempty"`
}

func (s RequestItems) String() string {
	return tea.Prettify(s)
}

func (s RequestItems) GoString() string {
	return s.String()
}

func (s *RequestItems) SetPriceRuleCode(v string) *RequestItems {
	s.PriceRuleCode = &v
	return s
}

func (s *RequestItems) SetChargeItemCode(v string) *RequestItems {
	s.ChargeItemCode = &v
	return s
}

func (s *RequestItems) SetMetricType(v string) *RequestItems {
	s.MetricType = &v
	return s
}

func (s *RequestItems) SetQuantity(v string) *RequestItems {
	s.Quantity = &v
	return s
}

func (s *RequestItems) SetFreeQuota(v string) *RequestItems {
	s.FreeQuota = &v
	return s
}

func (s *RequestItems) SetBillableQuantity(v string) *RequestItems {
	s.BillableQuantity = &v
	return s
}

func (s *RequestItems) SetUnitSize(v string) *RequestItems {
	s.UnitSize = &v
	return s
}

func (s *RequestItems) SetUnitPrice(v string) *RequestItems {
	s.UnitPrice = &v
	return s
}

func (s *RequestItems) SetCurrency(v string) *RequestItems {
	s.Currency = &v
	return s
}

func (s *RequestItems) SetAmount(v string) *RequestItems {
	s.Amount = &v
	return s
}

// ContentUrl
type ContentUrl struct {
	// url
	// example:
	//
	// www.test.com/123
	Url *string `json:"url,omitempty" xml:"url,omitempty"`
}

func (s ContentUrl) String() string {
	return tea.Prettify(s)
}

func (s ContentUrl) GoString() string {
	return s.String()
}

func (s *ContentUrl) SetUrl(v string) *ContentUrl {
	s.Url = &v
	return s
}

// 生图任务， 图片 URL 列表
type ImageUrlsList struct {
	// 图片 URL 列表
	ImageUrls []*string `json:"image_urls,omitempty" xml:"image_urls,omitempty" type:"Repeated"`
}

func (s ImageUrlsList) String() string {
	return tea.Prettify(s)
}

func (s ImageUrlsList) GoString() string {
	return s.String()
}

func (s *ImageUrlsList) SetImageUrls(v []*string) *ImageUrlsList {
	s.ImageUrls = v
	return s
}

// 消耗
type ChatUsage struct {
	// 输入token数
	// example:
	//
	// 121212
	PromptTokens *string `json:"prompt_tokens,omitempty" xml:"prompt_tokens,omitempty"`
	// 输出token数
	// example:
	//
	// 1111
	CompletionTokens *string `json:"completion_tokens,omitempty" xml:"completion_tokens,omitempty"`
	// 总token数
	// example:
	//
	// 121212
	TotalTokens *string `json:"total_tokens,omitempty" xml:"total_tokens,omitempty"`
	// 本次调用实际消耗金额
	// example:
	//
	// 11.01
	OriginalPrice *string `json:"original_price,omitempty" xml:"original_price,omitempty"`
	// 币种
	// example:
	//
	// CNY
	Currency *string `json:"currency,omitempty" xml:"currency,omitempty"`
}

func (s ChatUsage) String() string {
	return tea.Prettify(s)
}

func (s ChatUsage) GoString() string {
	return s.String()
}

func (s *ChatUsage) SetPromptTokens(v string) *ChatUsage {
	s.PromptTokens = &v
	return s
}

func (s *ChatUsage) SetCompletionTokens(v string) *ChatUsage {
	s.CompletionTokens = &v
	return s
}

func (s *ChatUsage) SetTotalTokens(v string) *ChatUsage {
	s.TotalTokens = &v
	return s
}

func (s *ChatUsage) SetOriginalPrice(v string) *ChatUsage {
	s.OriginalPrice = &v
	return s
}

func (s *ChatUsage) SetCurrency(v string) *ChatUsage {
	s.Currency = &v
	return s
}

// 各输出单元的试算明细
type UnitEstimates struct {
	// 从0开始，与请求的 units[] 顺序一致
	// example:
	//
	// 1
	UnitIndex *int64 `json:"unit_index,omitempty" xml:"unit_index,omitempty"`
	// 当前单元是否命中
	// example:
	//
	// true
	Matched *bool `json:"matched,omitempty" xml:"matched,omitempty"`
	// 当前单元是否命中兜底规则
	// example:
	//
	// true
	Fallback *bool `json:"fallback,omitempty" xml:"fallback,omitempty"`
	// 规则编码
	// example:
	//
	// 规则编码
	PriceRuleCode *string `json:"price_rule_code,omitempty" xml:"price_rule_code,omitempty"`
	// 规则版本
	// example:
	//
	// 1
	MatchedRuleVersion *int64 `json:"matched_rule_version,omitempty" xml:"matched_rule_version,omitempty"`
	// 规则名称
	// example:
	//
	// 规则名称
	RuleName *string `json:"rule_name,omitempty" xml:"rule_name,omitempty"`
	// 规则优先级
	// example:
	//
	// 1
	Priority *int64 `json:"priority,omitempty" xml:"priority,omitempty"`
	// 费用明细
	// example:
	//
	// undefined
	Items []*RequestItems `json:"items,omitempty" xml:"items,omitempty" type:"Repeated"`
	// 当前单元金额
	// example:
	//
	// 当前单元金额
	Amount *string `json:"amount,omitempty" xml:"amount,omitempty"`
	// 未命中或部分命中时的提示
	// example:
	//
	// 未命中或部分命中时的提示
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
}

func (s UnitEstimates) String() string {
	return tea.Prettify(s)
}

func (s UnitEstimates) GoString() string {
	return s.String()
}

func (s *UnitEstimates) SetUnitIndex(v int64) *UnitEstimates {
	s.UnitIndex = &v
	return s
}

func (s *UnitEstimates) SetMatched(v bool) *UnitEstimates {
	s.Matched = &v
	return s
}

func (s *UnitEstimates) SetFallback(v bool) *UnitEstimates {
	s.Fallback = &v
	return s
}

func (s *UnitEstimates) SetPriceRuleCode(v string) *UnitEstimates {
	s.PriceRuleCode = &v
	return s
}

func (s *UnitEstimates) SetMatchedRuleVersion(v int64) *UnitEstimates {
	s.MatchedRuleVersion = &v
	return s
}

func (s *UnitEstimates) SetRuleName(v string) *UnitEstimates {
	s.RuleName = &v
	return s
}

func (s *UnitEstimates) SetPriority(v int64) *UnitEstimates {
	s.Priority = &v
	return s
}

func (s *UnitEstimates) SetItems(v []*RequestItems) *UnitEstimates {
	s.Items = v
	return s
}

func (s *UnitEstimates) SetAmount(v string) *UnitEstimates {
	s.Amount = &v
	return s
}

func (s *UnitEstimates) SetMessage(v string) *UnitEstimates {
	s.Message = &v
	return s
}

// 音频消耗
type AudioUsage struct {
	// 用量类型
	// example:
	//
	// AUDIO_GENERATION
	UsageType *string `json:"usage_type,omitempty" xml:"usage_type,omitempty"`
	// 计量单位
	// example:
	//
	// SECOND
	Unit *string `json:"unit,omitempty" xml:"unit,omitempty"`
	// 音频时长(s)
	// example:
	//
	// 10.6
	DurationSeconds *string `json:"duration_seconds,omitempty" xml:"duration_seconds,omitempty"`
	// 音频数量
	// example:
	//
	// 1
	Count *int64 `json:"count,omitempty" xml:"count,omitempty"`
	// 本次音频生成的实际消耗金额(必返)
	// example:
	//
	// 10.11
	OriginalPrice *string `json:"original_price,omitempty" xml:"original_price,omitempty"`
	// 币种
	// example:
	//
	// CNY
	Currency *string `json:"currency,omitempty" xml:"currency,omitempty"`
}

func (s AudioUsage) String() string {
	return tea.Prettify(s)
}

func (s AudioUsage) GoString() string {
	return s.String()
}

func (s *AudioUsage) SetUsageType(v string) *AudioUsage {
	s.UsageType = &v
	return s
}

func (s *AudioUsage) SetUnit(v string) *AudioUsage {
	s.Unit = &v
	return s
}

func (s *AudioUsage) SetDurationSeconds(v string) *AudioUsage {
	s.DurationSeconds = &v
	return s
}

func (s *AudioUsage) SetCount(v int64) *AudioUsage {
	s.Count = &v
	return s
}

func (s *AudioUsage) SetOriginalPrice(v string) *AudioUsage {
	s.OriginalPrice = &v
	return s
}

func (s *AudioUsage) SetCurrency(v string) *AudioUsage {
	s.Currency = &v
	return s
}

// 非空内容列表，至少含文本或素材
type ContentInfo struct {
	// 类型
	// example:
	//
	// text
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// type=text时提供，文本
	// example:
	//
	// 生成一只猫
	Text *string `json:"text,omitempty" xml:"text,omitempty"`
	// type=xxx_url时提供
	// example:
	//
	// www.test.com/123
	Url *ContentUrl `json:"url,omitempty" xml:"url,omitempty"`
	// 角色
	// example:
	//
	// reference_image
	Role *string `json:"role,omitempty" xml:"role,omitempty"`
}

func (s ContentInfo) String() string {
	return tea.Prettify(s)
}

func (s ContentInfo) GoString() string {
	return s.String()
}

func (s *ContentInfo) SetType(v string) *ContentInfo {
	s.Type = &v
	return s
}

func (s *ContentInfo) SetText(v string) *ContentInfo {
	s.Text = &v
	return s
}

func (s *ContentInfo) SetUrl(v *ContentUrl) *ContentInfo {
	s.Url = v
	return s
}

func (s *ContentInfo) SetRole(v string) *ContentInfo {
	s.Role = &v
	return s
}

// 视频生成返回
type VideoUsage struct {
	// 用量类型
	// example:
	//
	// VIDEO_GENERATION
	UsageType *string `json:"usage_type,omitempty" xml:"usage_type,omitempty"`
	// 计量单位
	// example:
	//
	// SECOND
	Unit *string `json:"unit,omitempty" xml:"unit,omitempty"`
	// 视频时长(s)
	// example:
	//
	// 10
	DurationSeconds *string `json:"duration_seconds,omitempty" xml:"duration_seconds,omitempty"`
	// 本次视频生成的实际消耗金额
	// example:
	//
	// 0.11
	OriginalPrice *string `json:"original_price,omitempty" xml:"original_price,omitempty"`
	// 币种
	// example:
	//
	// CNY
	Currency *string `json:"currency,omitempty" xml:"currency,omitempty"`
}

func (s VideoUsage) String() string {
	return tea.Prettify(s)
}

func (s VideoUsage) GoString() string {
	return s.String()
}

func (s *VideoUsage) SetUsageType(v string) *VideoUsage {
	s.UsageType = &v
	return s
}

func (s *VideoUsage) SetUnit(v string) *VideoUsage {
	s.Unit = &v
	return s
}

func (s *VideoUsage) SetDurationSeconds(v string) *VideoUsage {
	s.DurationSeconds = &v
	return s
}

func (s *VideoUsage) SetOriginalPrice(v string) *VideoUsage {
	s.OriginalPrice = &v
	return s
}

func (s *VideoUsage) SetCurrency(v string) *VideoUsage {
	s.Currency = &v
	return s
}

// 音频信息
type AudioList struct {
	// 音频 URL 列表
	// example:
	//
	// www.test.com/123
	AudioUrl *string `json:"audio_url,omitempty" xml:"audio_url,omitempty"`
	// 音频格式
	// example:
	//
	// wav
	AudioFormat *string `json:"audio_format,omitempty" xml:"audio_format,omitempty"`
	// 处理后播放时长（秒）
	// example:
	//
	// 10.6
	DurationSeconds *string `json:"duration_seconds,omitempty" xml:"duration_seconds,omitempty"`
}

func (s AudioList) String() string {
	return tea.Prettify(s)
}

func (s AudioList) GoString() string {
	return s.String()
}

func (s *AudioList) SetAudioUrl(v string) *AudioList {
	s.AudioUrl = &v
	return s
}

func (s *AudioList) SetAudioFormat(v string) *AudioList {
	s.AudioFormat = &v
	return s
}

func (s *AudioList) SetDurationSeconds(v string) *AudioList {
	s.DurationSeconds = &v
	return s
}

// 视频URL(成功时返回)
type VideoUrl struct {
	// 视频URL(成功时返回)
	// example:
	//
	// https://example.com/output.mp4
	VideoUrl *string `json:"video_url,omitempty" xml:"video_url,omitempty"`
}

func (s VideoUrl) String() string {
	return tea.Prettify(s)
}

func (s VideoUrl) GoString() string {
	return s.String()
}

func (s *VideoUrl) SetVideoUrl(v string) *VideoUrl {
	s.VideoUrl = &v
	return s
}

// 输出单元列表
type PriceUnits struct {
	// 当前输出单元定价维度
	// example:
	//
	// {"test":"1"}
	Dimensions *string `json:"dimensions,omitempty" xml:"dimensions,omitempty"`
	// 当前输出单元计量指标
	// example:
	//
	// {"test":"1"}
	Metrics *string `json:"metrics,omitempty" xml:"metrics,omitempty"`
}

func (s PriceUnits) String() string {
	return tea.Prettify(s)
}

func (s PriceUnits) GoString() string {
	return s.String()
}

func (s *PriceUnits) SetDimensions(v string) *PriceUnits {
	s.Dimensions = &v
	return s
}

func (s *PriceUnits) SetMetrics(v string) *PriceUnits {
	s.Metrics = &v
	return s
}

// 附加信息
type ExtraInfo struct {
	// 原厂任务ID
	// example:
	//
	// xxx-xxx-xxx
	OriginalTaskId *string `json:"original_task_id,omitempty" xml:"original_task_id,omitempty"`
	// 原厂视频输出URL
	// example:
	//
	// https://xxx
	OriginalVideoUrl *string `json:"original_video_url,omitempty" xml:"original_video_url,omitempty"`
	// 原厂响应体快照
	// example:
	//
	// "{"task_id":"csg-xxx-xx"...}"
	OriginalResponseSnapshot *string `json:"original_response_snapshot,omitempty" xml:"original_response_snapshot,omitempty"`
}

func (s ExtraInfo) String() string {
	return tea.Prettify(s)
}

func (s ExtraInfo) GoString() string {
	return s.String()
}

func (s *ExtraInfo) SetOriginalTaskId(v string) *ExtraInfo {
	s.OriginalTaskId = &v
	return s
}

func (s *ExtraInfo) SetOriginalVideoUrl(v string) *ExtraInfo {
	s.OriginalVideoUrl = &v
	return s
}

func (s *ExtraInfo) SetOriginalResponseSnapshot(v string) *ExtraInfo {
	s.OriginalResponseSnapshot = &v
	return s
}

// 处理失败时返回，包含code/message
type Error struct {
	// 错误码
	// example:
	//
	// INVALID_PARAMETER
	Code *string `json:"code,omitempty" xml:"code,omitempty"`
	// 错误信息
	// example:
	//
	// 参数无效
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
}

func (s Error) String() string {
	return tea.Prettify(s)
}

func (s Error) GoString() string {
	return s.String()
}

func (s *Error) SetCode(v string) *Error {
	s.Code = &v
	return s
}

func (s *Error) SetMessage(v string) *Error {
	s.Message = &v
	return s
}

// 1
type ImageUrl struct {
	// test
	// example:
	//
	// undefined
	ImageUrl *ContentUrl `json:"image_url,omitempty" xml:"image_url,omitempty"`
}

func (s ImageUrl) String() string {
	return tea.Prettify(s)
}

func (s ImageUrl) GoString() string {
	return s.String()
}

func (s *ImageUrl) SetImageUrl(v *ContentUrl) *ImageUrl {
	s.ImageUrl = v
	return s
}

// 非空消息列表
type ChatMessages struct {
	// 角色
	// example:
	//
	// user
	Role *string `json:"role,omitempty" xml:"role,omitempty" require:"true"`
	// 文本内容
	// example:
	//
	// 文本内容
	Content *string `json:"content,omitempty" xml:"content,omitempty" require:"true"`
}

func (s ChatMessages) String() string {
	return tea.Prettify(s)
}

func (s ChatMessages) GoString() string {
	return s.String()
}

func (s *ChatMessages) SetRole(v string) *ChatMessages {
	s.Role = &v
	return s
}

func (s *ChatMessages) SetContent(v string) *ChatMessages {
	s.Content = &v
	return s
}

// 用量数组
type ImageUsage struct {
	// 用量类型
	// example:
	//
	// IMAGE_GENERATION
	UsageType *string `json:"usage_type,omitempty" xml:"usage_type,omitempty"`
	// 计量单位
	// example:
	//
	// IMAGE_COUNT
	Unit *string `json:"unit,omitempty" xml:"unit,omitempty"`
	// 图片张数
	// example:
	//
	// 1
	ImageCount *int64 `json:"image_count,omitempty" xml:"image_count,omitempty"`
	// 本次图片生成的实际消耗金额
	// example:
	//
	// 10.11
	OriginalPrice *string `json:"original_price,omitempty" xml:"original_price,omitempty"`
	// 币种
	// example:
	//
	// CNY
	Currency *string `json:"currency,omitempty" xml:"currency,omitempty"`
}

func (s ImageUsage) String() string {
	return tea.Prettify(s)
}

func (s ImageUsage) GoString() string {
	return s.String()
}

func (s *ImageUsage) SetUsageType(v string) *ImageUsage {
	s.UsageType = &v
	return s
}

func (s *ImageUsage) SetUnit(v string) *ImageUsage {
	s.Unit = &v
	return s
}

func (s *ImageUsage) SetImageCount(v int64) *ImageUsage {
	s.ImageCount = &v
	return s
}

func (s *ImageUsage) SetOriginalPrice(v string) *ImageUsage {
	s.OriginalPrice = &v
	return s
}

func (s *ImageUsage) SetCurrency(v string) *ImageUsage {
	s.Currency = &v
	return s
}

// 用量信息
type Usage struct {
	// 分辨率
	// example:
	//
	// 720p、1080p
	Resolution *string `json:"resolution,omitempty" xml:"resolution,omitempty"`
	// 视频时长(s)
	// example:
	//
	// 15
	Duration *int64 `json:"duration,omitempty" xml:"duration,omitempty"`
	// 视频比例
	// example:
	//
	// 16:9
	Ratio *string `json:"ratio,omitempty" xml:"ratio,omitempty"`
	// 消耗token数
	// example:
	//
	// 10800
	CompletionTokens *int64 `json:"completion_tokens,omitempty" xml:"completion_tokens,omitempty"`
	// 消耗credit数
	// example:
	//
	// 7
	CompletionCredits *int64 `json:"completion_credits,omitempty" xml:"completion_credits,omitempty"`
}

func (s Usage) String() string {
	return tea.Prettify(s)
}

func (s Usage) GoString() string {
	return s.String()
}

func (s *Usage) SetResolution(v string) *Usage {
	s.Resolution = &v
	return s
}

func (s *Usage) SetDuration(v int64) *Usage {
	s.Duration = &v
	return s
}

func (s *Usage) SetRatio(v string) *Usage {
	s.Ratio = &v
	return s
}

func (s *Usage) SetCompletionTokens(v int64) *Usage {
	s.CompletionTokens = &v
	return s
}

func (s *Usage) SetCompletionCredits(v int64) *Usage {
	s.CompletionCredits = &v
	return s
}

type PushVideogenerationRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 模型标识，如 ：doubao-seedance-2-0-260128
	Model *string `json:"model,omitempty" xml:"model,omitempty" require:"true"`
	// 文本提示词
	Prompt *string `json:"prompt,omitempty" xml:"prompt,omitempty"`
	// 图生视频参考图片 URL
	ImageUrl []*string `json:"image_url,omitempty" xml:"image_url,omitempty" type:"Repeated"`
	// 视频参考/续写时传入视频 URL
	VideoUrl []*string `json:"video_url,omitempty" xml:"video_url,omitempty" type:"Repeated"`
	// 参考音频URL列表
	AudioUrl []*string `json:"audio_url,omitempty" xml:"audio_url,omitempty" type:"Repeated"`
	// 比例
	Ratio *string `json:"ratio,omitempty" xml:"ratio,omitempty"`
	// 视频时长（秒）
	Duration *int64 `json:"duration,omitempty" xml:"duration,omitempty"`
	// 请求追踪 ID，用于幂等去重
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
	// 扩展JSON
	Ext *string `json:"ext,omitempty" xml:"ext,omitempty"`
}

func (s PushVideogenerationRequest) String() string {
	return tea.Prettify(s)
}

func (s PushVideogenerationRequest) GoString() string {
	return s.String()
}

func (s *PushVideogenerationRequest) SetAuthToken(v string) *PushVideogenerationRequest {
	s.AuthToken = &v
	return s
}

func (s *PushVideogenerationRequest) SetProductInstanceId(v string) *PushVideogenerationRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PushVideogenerationRequest) SetModel(v string) *PushVideogenerationRequest {
	s.Model = &v
	return s
}

func (s *PushVideogenerationRequest) SetPrompt(v string) *PushVideogenerationRequest {
	s.Prompt = &v
	return s
}

func (s *PushVideogenerationRequest) SetImageUrl(v []*string) *PushVideogenerationRequest {
	s.ImageUrl = v
	return s
}

func (s *PushVideogenerationRequest) SetVideoUrl(v []*string) *PushVideogenerationRequest {
	s.VideoUrl = v
	return s
}

func (s *PushVideogenerationRequest) SetAudioUrl(v []*string) *PushVideogenerationRequest {
	s.AudioUrl = v
	return s
}

func (s *PushVideogenerationRequest) SetRatio(v string) *PushVideogenerationRequest {
	s.Ratio = &v
	return s
}

func (s *PushVideogenerationRequest) SetDuration(v int64) *PushVideogenerationRequest {
	s.Duration = &v
	return s
}

func (s *PushVideogenerationRequest) SetRequestId(v string) *PushVideogenerationRequest {
	s.RequestId = &v
	return s
}

func (s *PushVideogenerationRequest) SetExt(v string) *PushVideogenerationRequest {
	s.Ext = &v
	return s
}

type PushVideogenerationResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 任务 ID，后续查询结果通过此参数获取
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty"`
	// 任务状态：pending（等待中）、processing（处理中）、succeeded（已成功）、failed（已失败）
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 模型名称
	Model *string `json:"model,omitempty" xml:"model,omitempty"`
	// 扩展JSON
	Ext *string `json:"ext,omitempty" xml:"ext,omitempty"`
}

func (s PushVideogenerationResponse) String() string {
	return tea.Prettify(s)
}

func (s PushVideogenerationResponse) GoString() string {
	return s.String()
}

func (s *PushVideogenerationResponse) SetReqMsgId(v string) *PushVideogenerationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PushVideogenerationResponse) SetResultCode(v string) *PushVideogenerationResponse {
	s.ResultCode = &v
	return s
}

func (s *PushVideogenerationResponse) SetResultMsg(v string) *PushVideogenerationResponse {
	s.ResultMsg = &v
	return s
}

func (s *PushVideogenerationResponse) SetTaskId(v string) *PushVideogenerationResponse {
	s.TaskId = &v
	return s
}

func (s *PushVideogenerationResponse) SetStatus(v string) *PushVideogenerationResponse {
	s.Status = &v
	return s
}

func (s *PushVideogenerationResponse) SetModel(v string) *PushVideogenerationResponse {
	s.Model = &v
	return s
}

func (s *PushVideogenerationResponse) SetExt(v string) *PushVideogenerationResponse {
	s.Ext = &v
	return s
}

type QueryVideogenerationRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 查询的任务ID
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty" require:"true"`
}

func (s QueryVideogenerationRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryVideogenerationRequest) GoString() string {
	return s.String()
}

func (s *QueryVideogenerationRequest) SetAuthToken(v string) *QueryVideogenerationRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryVideogenerationRequest) SetProductInstanceId(v string) *QueryVideogenerationRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryVideogenerationRequest) SetTaskId(v string) *QueryVideogenerationRequest {
	s.TaskId = &v
	return s
}

type QueryVideogenerationResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 任务ID
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty"`
	// 任务状态
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 视频输出URL
	VideoUrl *string `json:"video_url,omitempty" xml:"video_url,omitempty"`
	// 错误码
	ErrorCode *string `json:"error_code,omitempty" xml:"error_code,omitempty"`
	// 错误信息
	ErrorMessage *string `json:"error_message,omitempty" xml:"error_message,omitempty"`
	// 用量信息
	Usage *Usage `json:"usage,omitempty" xml:"usage,omitempty"`
	// 附加信息
	ExtraInfo *ExtraInfo `json:"extra_info,omitempty" xml:"extra_info,omitempty"`
}

func (s QueryVideogenerationResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryVideogenerationResponse) GoString() string {
	return s.String()
}

func (s *QueryVideogenerationResponse) SetReqMsgId(v string) *QueryVideogenerationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryVideogenerationResponse) SetResultCode(v string) *QueryVideogenerationResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryVideogenerationResponse) SetResultMsg(v string) *QueryVideogenerationResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryVideogenerationResponse) SetTaskId(v string) *QueryVideogenerationResponse {
	s.TaskId = &v
	return s
}

func (s *QueryVideogenerationResponse) SetStatus(v string) *QueryVideogenerationResponse {
	s.Status = &v
	return s
}

func (s *QueryVideogenerationResponse) SetVideoUrl(v string) *QueryVideogenerationResponse {
	s.VideoUrl = &v
	return s
}

func (s *QueryVideogenerationResponse) SetErrorCode(v string) *QueryVideogenerationResponse {
	s.ErrorCode = &v
	return s
}

func (s *QueryVideogenerationResponse) SetErrorMessage(v string) *QueryVideogenerationResponse {
	s.ErrorMessage = &v
	return s
}

func (s *QueryVideogenerationResponse) SetUsage(v *Usage) *QueryVideogenerationResponse {
	s.Usage = v
	return s
}

func (s *QueryVideogenerationResponse) SetExtraInfo(v *ExtraInfo) *QueryVideogenerationResponse {
	s.ExtraInfo = v
	return s
}

type UploadAssetRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 资产类型
	AssetType *string `json:"asset_type,omitempty" xml:"asset_type,omitempty" require:"true"`
	// 公网可访问的文件URL
	FileUrl *string `json:"file_url,omitempty" xml:"file_url,omitempty" require:"true"`
	// 资产名称
	AssetName *string `json:"asset_name,omitempty" xml:"asset_name,omitempty" require:"true"`
	// 在这个模型上使用资产
	UseModel *string `json:"use_model,omitempty" xml:"use_model,omitempty"`
}

func (s UploadAssetRequest) String() string {
	return tea.Prettify(s)
}

func (s UploadAssetRequest) GoString() string {
	return s.String()
}

func (s *UploadAssetRequest) SetAuthToken(v string) *UploadAssetRequest {
	s.AuthToken = &v
	return s
}

func (s *UploadAssetRequest) SetProductInstanceId(v string) *UploadAssetRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UploadAssetRequest) SetAssetType(v string) *UploadAssetRequest {
	s.AssetType = &v
	return s
}

func (s *UploadAssetRequest) SetFileUrl(v string) *UploadAssetRequest {
	s.FileUrl = &v
	return s
}

func (s *UploadAssetRequest) SetAssetName(v string) *UploadAssetRequest {
	s.AssetName = &v
	return s
}

func (s *UploadAssetRequest) SetUseModel(v string) *UploadAssetRequest {
	s.UseModel = &v
	return s
}

type UploadAssetResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 资产ID
	AssetId *string `json:"asset_id,omitempty" xml:"asset_id,omitempty"`
	// 资产状态
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 资产类型
	AssetType *string `json:"asset_type,omitempty" xml:"asset_type,omitempty"`
}

func (s UploadAssetResponse) String() string {
	return tea.Prettify(s)
}

func (s UploadAssetResponse) GoString() string {
	return s.String()
}

func (s *UploadAssetResponse) SetReqMsgId(v string) *UploadAssetResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UploadAssetResponse) SetResultCode(v string) *UploadAssetResponse {
	s.ResultCode = &v
	return s
}

func (s *UploadAssetResponse) SetResultMsg(v string) *UploadAssetResponse {
	s.ResultMsg = &v
	return s
}

func (s *UploadAssetResponse) SetAssetId(v string) *UploadAssetResponse {
	s.AssetId = &v
	return s
}

func (s *UploadAssetResponse) SetStatus(v string) *UploadAssetResponse {
	s.Status = &v
	return s
}

func (s *UploadAssetResponse) SetAssetType(v string) *UploadAssetResponse {
	s.AssetType = &v
	return s
}

type QueryAssetRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 资产ID
	AssetId *string `json:"asset_id,omitempty" xml:"asset_id,omitempty" require:"true"`
}

func (s QueryAssetRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAssetRequest) GoString() string {
	return s.String()
}

func (s *QueryAssetRequest) SetAuthToken(v string) *QueryAssetRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAssetRequest) SetProductInstanceId(v string) *QueryAssetRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAssetRequest) SetAssetId(v string) *QueryAssetRequest {
	s.AssetId = &v
	return s
}

type QueryAssetResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 资产ID
	AssetId *string `json:"asset_id,omitempty" xml:"asset_id,omitempty"`
	// 资产状态
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 资产类型
	AssetType *string `json:"asset_type,omitempty" xml:"asset_type,omitempty"`
	// 资产类型
	AssetUrl *string `json:"asset_url,omitempty" xml:"asset_url,omitempty"`
	// 错误信息
	ErrorMessage *string `json:"error_message,omitempty" xml:"error_message,omitempty"`
	// 错误码
	ErrorCode *string `json:"error_code,omitempty" xml:"error_code,omitempty"`
}

func (s QueryAssetResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAssetResponse) GoString() string {
	return s.String()
}

func (s *QueryAssetResponse) SetReqMsgId(v string) *QueryAssetResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAssetResponse) SetResultCode(v string) *QueryAssetResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAssetResponse) SetResultMsg(v string) *QueryAssetResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAssetResponse) SetAssetId(v string) *QueryAssetResponse {
	s.AssetId = &v
	return s
}

func (s *QueryAssetResponse) SetStatus(v string) *QueryAssetResponse {
	s.Status = &v
	return s
}

func (s *QueryAssetResponse) SetAssetType(v string) *QueryAssetResponse {
	s.AssetType = &v
	return s
}

func (s *QueryAssetResponse) SetAssetUrl(v string) *QueryAssetResponse {
	s.AssetUrl = &v
	return s
}

func (s *QueryAssetResponse) SetErrorMessage(v string) *QueryAssetResponse {
	s.ErrorMessage = &v
	return s
}

func (s *QueryAssetResponse) SetErrorCode(v string) *QueryAssetResponse {
	s.ErrorCode = &v
	return s
}

type UploadMaasAssetRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 幂等标识，由客户端生成
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty" require:"true"`
	// 文件公网可访问URL
	FileUrl *string `json:"file_url,omitempty" xml:"file_url,omitempty" require:"true"`
	// 资产类型
	AssetType *string `json:"asset_type,omitempty" xml:"asset_type,omitempty" require:"true"`
	// 资产名称
	AssetName *string `json:"asset_name,omitempty" xml:"asset_name,omitempty" require:"true"`
}

func (s UploadMaasAssetRequest) String() string {
	return tea.Prettify(s)
}

func (s UploadMaasAssetRequest) GoString() string {
	return s.String()
}

func (s *UploadMaasAssetRequest) SetAuthToken(v string) *UploadMaasAssetRequest {
	s.AuthToken = &v
	return s
}

func (s *UploadMaasAssetRequest) SetProductInstanceId(v string) *UploadMaasAssetRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UploadMaasAssetRequest) SetRequestId(v string) *UploadMaasAssetRequest {
	s.RequestId = &v
	return s
}

func (s *UploadMaasAssetRequest) SetFileUrl(v string) *UploadMaasAssetRequest {
	s.FileUrl = &v
	return s
}

func (s *UploadMaasAssetRequest) SetAssetType(v string) *UploadMaasAssetRequest {
	s.AssetType = &v
	return s
}

func (s *UploadMaasAssetRequest) SetAssetName(v string) *UploadMaasAssetRequest {
	s.AssetName = &v
	return s
}

type UploadMaasAssetResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 平台素材ID
	AssetId *string `json:"asset_id,omitempty" xml:"asset_id,omitempty"`
	// 状态
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 资产类型
	AssetType *string `json:"asset_type,omitempty" xml:"asset_type,omitempty"`
}

func (s UploadMaasAssetResponse) String() string {
	return tea.Prettify(s)
}

func (s UploadMaasAssetResponse) GoString() string {
	return s.String()
}

func (s *UploadMaasAssetResponse) SetReqMsgId(v string) *UploadMaasAssetResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UploadMaasAssetResponse) SetResultCode(v string) *UploadMaasAssetResponse {
	s.ResultCode = &v
	return s
}

func (s *UploadMaasAssetResponse) SetResultMsg(v string) *UploadMaasAssetResponse {
	s.ResultMsg = &v
	return s
}

func (s *UploadMaasAssetResponse) SetAssetId(v string) *UploadMaasAssetResponse {
	s.AssetId = &v
	return s
}

func (s *UploadMaasAssetResponse) SetStatus(v string) *UploadMaasAssetResponse {
	s.Status = &v
	return s
}

func (s *UploadMaasAssetResponse) SetAssetType(v string) *UploadMaasAssetResponse {
	s.AssetType = &v
	return s
}

type QueryMaasAssetRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 资产ID
	AssetId *string `json:"asset_id,omitempty" xml:"asset_id,omitempty" require:"true"`
}

func (s QueryMaasAssetRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryMaasAssetRequest) GoString() string {
	return s.String()
}

func (s *QueryMaasAssetRequest) SetAuthToken(v string) *QueryMaasAssetRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryMaasAssetRequest) SetProductInstanceId(v string) *QueryMaasAssetRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryMaasAssetRequest) SetAssetId(v string) *QueryMaasAssetRequest {
	s.AssetId = &v
	return s
}

type QueryMaasAssetResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 资产ID
	AssetId *string `json:"asset_id,omitempty" xml:"asset_id,omitempty"`
	// 状态
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 资产类型
	AssetType *string `json:"asset_type,omitempty" xml:"asset_type,omitempty"`
	// 资产访问URL，仅在已取得可访问地址时返回
	Url *string `json:"url,omitempty" xml:"url,omitempty"`
	// 素材名称，可选
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 创建时间，Unix秒级时间戳，可选
	CreatedAt *string `json:"created_at,omitempty" xml:"created_at,omitempty"`
	// 更新时间，Unix秒级时间戳，可选
	UpdatedAt *string `json:"updated_at,omitempty" xml:"updated_at,omitempty"`
	// 处理失败时返回，包含code/message
	Error *Error `json:"error,omitempty" xml:"error,omitempty"`
}

func (s QueryMaasAssetResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryMaasAssetResponse) GoString() string {
	return s.String()
}

func (s *QueryMaasAssetResponse) SetReqMsgId(v string) *QueryMaasAssetResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryMaasAssetResponse) SetResultCode(v string) *QueryMaasAssetResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryMaasAssetResponse) SetResultMsg(v string) *QueryMaasAssetResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryMaasAssetResponse) SetAssetId(v string) *QueryMaasAssetResponse {
	s.AssetId = &v
	return s
}

func (s *QueryMaasAssetResponse) SetStatus(v string) *QueryMaasAssetResponse {
	s.Status = &v
	return s
}

func (s *QueryMaasAssetResponse) SetAssetType(v string) *QueryMaasAssetResponse {
	s.AssetType = &v
	return s
}

func (s *QueryMaasAssetResponse) SetUrl(v string) *QueryMaasAssetResponse {
	s.Url = &v
	return s
}

func (s *QueryMaasAssetResponse) SetName(v string) *QueryMaasAssetResponse {
	s.Name = &v
	return s
}

func (s *QueryMaasAssetResponse) SetCreatedAt(v string) *QueryMaasAssetResponse {
	s.CreatedAt = &v
	return s
}

func (s *QueryMaasAssetResponse) SetUpdatedAt(v string) *QueryMaasAssetResponse {
	s.UpdatedAt = &v
	return s
}

func (s *QueryMaasAssetResponse) SetError(v *Error) *QueryMaasAssetResponse {
	s.Error = v
	return s
}

type PushMaasVideoRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 幂等标识，由客户端生成
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty" require:"true"`
	// 视频模型编码
	Model *string `json:"model,omitempty" xml:"model,omitempty" require:"true"`
	// 类型
	CapabilityType *string `json:"capability_type,omitempty" xml:"capability_type,omitempty" require:"true"`
	// 非空内容列表，至少含文本或素材
	Content []*ContentInfo `json:"content,omitempty" xml:"content,omitempty" require:"true" type:"Repeated"`
	// 视频时长(s)
	Duration *string `json:"duration,omitempty" xml:"duration,omitempty"`
	// 宽高比，如16:9、9:16
	Ratio *string `json:"ratio,omitempty" xml:"ratio,omitempty"`
	// 分辨率，如720P、1080P
	Resolution *string `json:"resolution,omitempty" xml:"resolution,omitempty"`
	// 是否生成音轨，默认false
	GenerateAudio *bool `json:"generate_audio,omitempty" xml:"generate_audio,omitempty"`
	// 是否添加水印
	Watermark *bool `json:"watermark,omitempty" xml:"watermark,omitempty"`
	// 扩展参数JSON字符串
	ExtParams *string `json:"ext_params,omitempty" xml:"ext_params,omitempty"`
}

func (s PushMaasVideoRequest) String() string {
	return tea.Prettify(s)
}

func (s PushMaasVideoRequest) GoString() string {
	return s.String()
}

func (s *PushMaasVideoRequest) SetAuthToken(v string) *PushMaasVideoRequest {
	s.AuthToken = &v
	return s
}

func (s *PushMaasVideoRequest) SetProductInstanceId(v string) *PushMaasVideoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PushMaasVideoRequest) SetRequestId(v string) *PushMaasVideoRequest {
	s.RequestId = &v
	return s
}

func (s *PushMaasVideoRequest) SetModel(v string) *PushMaasVideoRequest {
	s.Model = &v
	return s
}

func (s *PushMaasVideoRequest) SetCapabilityType(v string) *PushMaasVideoRequest {
	s.CapabilityType = &v
	return s
}

func (s *PushMaasVideoRequest) SetContent(v []*ContentInfo) *PushMaasVideoRequest {
	s.Content = v
	return s
}

func (s *PushMaasVideoRequest) SetDuration(v string) *PushMaasVideoRequest {
	s.Duration = &v
	return s
}

func (s *PushMaasVideoRequest) SetRatio(v string) *PushMaasVideoRequest {
	s.Ratio = &v
	return s
}

func (s *PushMaasVideoRequest) SetResolution(v string) *PushMaasVideoRequest {
	s.Resolution = &v
	return s
}

func (s *PushMaasVideoRequest) SetGenerateAudio(v bool) *PushMaasVideoRequest {
	s.GenerateAudio = &v
	return s
}

func (s *PushMaasVideoRequest) SetWatermark(v bool) *PushMaasVideoRequest {
	s.Watermark = &v
	return s
}

func (s *PushMaasVideoRequest) SetExtParams(v string) *PushMaasVideoRequest {
	s.ExtParams = &v
	return s
}

type PushMaasVideoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 视频任务ID
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty"`
	// 任务状态
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 实际使用的模型
	Model *string `json:"model,omitempty" xml:"model,omitempty"`
}

func (s PushMaasVideoResponse) String() string {
	return tea.Prettify(s)
}

func (s PushMaasVideoResponse) GoString() string {
	return s.String()
}

func (s *PushMaasVideoResponse) SetReqMsgId(v string) *PushMaasVideoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PushMaasVideoResponse) SetResultCode(v string) *PushMaasVideoResponse {
	s.ResultCode = &v
	return s
}

func (s *PushMaasVideoResponse) SetResultMsg(v string) *PushMaasVideoResponse {
	s.ResultMsg = &v
	return s
}

func (s *PushMaasVideoResponse) SetTaskId(v string) *PushMaasVideoResponse {
	s.TaskId = &v
	return s
}

func (s *PushMaasVideoResponse) SetStatus(v string) *PushMaasVideoResponse {
	s.Status = &v
	return s
}

func (s *PushMaasVideoResponse) SetModel(v string) *PushMaasVideoResponse {
	s.Model = &v
	return s
}

type QueryMaasVideoRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 视频任务ID
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty" require:"true"`
}

func (s QueryMaasVideoRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryMaasVideoRequest) GoString() string {
	return s.String()
}

func (s *QueryMaasVideoRequest) SetAuthToken(v string) *QueryMaasVideoRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryMaasVideoRequest) SetProductInstanceId(v string) *QueryMaasVideoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryMaasVideoRequest) SetTaskId(v string) *QueryMaasVideoRequest {
	s.TaskId = &v
	return s
}

type QueryMaasVideoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 视频任务ID
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty"`
	// 任务状态
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 实际使用的模型
	Model *string `json:"model,omitempty" xml:"model,omitempty"`
	// 创建时间，Unix秒级时间戳
	CreatedAt *string `json:"created_at,omitempty" xml:"created_at,omitempty"`
	// 更新时间，Unix秒级时间戳
	UpdatedAt *string `json:"updated_at,omitempty" xml:"updated_at,omitempty"`
	// 视频URL(成功时返回)
	Content *VideoUrl `json:"content,omitempty" xml:"content,omitempty"`
	// 视频时长(s)
	Duration *string `json:"duration,omitempty" xml:"duration,omitempty"`
	// 宽高比
	Ratio *string `json:"ratio,omitempty" xml:"ratio,omitempty"`
	// 分辨率
	Resolution *string `json:"resolution,omitempty" xml:"resolution,omitempty"`
	// 是否生成音轨
	GenerateAudio *bool `json:"generate_audio,omitempty" xml:"generate_audio,omitempty"`
	// 用量数组
	Usage []*VideoUsage `json:"usage,omitempty" xml:"usage,omitempty" type:"Repeated"`
	// 非标准化补充信息，JSON 字符串
	ExtraInfo *string `json:"extra_info,omitempty" xml:"extra_info,omitempty"`
	// 失败时返回
	Error *Error `json:"error,omitempty" xml:"error,omitempty"`
}

func (s QueryMaasVideoResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryMaasVideoResponse) GoString() string {
	return s.String()
}

func (s *QueryMaasVideoResponse) SetReqMsgId(v string) *QueryMaasVideoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryMaasVideoResponse) SetResultCode(v string) *QueryMaasVideoResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryMaasVideoResponse) SetResultMsg(v string) *QueryMaasVideoResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryMaasVideoResponse) SetTaskId(v string) *QueryMaasVideoResponse {
	s.TaskId = &v
	return s
}

func (s *QueryMaasVideoResponse) SetStatus(v string) *QueryMaasVideoResponse {
	s.Status = &v
	return s
}

func (s *QueryMaasVideoResponse) SetModel(v string) *QueryMaasVideoResponse {
	s.Model = &v
	return s
}

func (s *QueryMaasVideoResponse) SetCreatedAt(v string) *QueryMaasVideoResponse {
	s.CreatedAt = &v
	return s
}

func (s *QueryMaasVideoResponse) SetUpdatedAt(v string) *QueryMaasVideoResponse {
	s.UpdatedAt = &v
	return s
}

func (s *QueryMaasVideoResponse) SetContent(v *VideoUrl) *QueryMaasVideoResponse {
	s.Content = v
	return s
}

func (s *QueryMaasVideoResponse) SetDuration(v string) *QueryMaasVideoResponse {
	s.Duration = &v
	return s
}

func (s *QueryMaasVideoResponse) SetRatio(v string) *QueryMaasVideoResponse {
	s.Ratio = &v
	return s
}

func (s *QueryMaasVideoResponse) SetResolution(v string) *QueryMaasVideoResponse {
	s.Resolution = &v
	return s
}

func (s *QueryMaasVideoResponse) SetGenerateAudio(v bool) *QueryMaasVideoResponse {
	s.GenerateAudio = &v
	return s
}

func (s *QueryMaasVideoResponse) SetUsage(v []*VideoUsage) *QueryMaasVideoResponse {
	s.Usage = v
	return s
}

func (s *QueryMaasVideoResponse) SetExtraInfo(v string) *QueryMaasVideoResponse {
	s.ExtraInfo = &v
	return s
}

func (s *QueryMaasVideoResponse) SetError(v *Error) *QueryMaasVideoResponse {
	s.Error = v
	return s
}

type PushMaasImageRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 幂等标识，由客户端生成
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty" require:"true"`
	// 图片模型编码
	Model *string `json:"model,omitempty" xml:"model,omitempty" require:"true"`
	// 类型
	CapabilityType *string `json:"capability_type,omitempty" xml:"capability_type,omitempty" require:"true"`
	// 生成模式
	GenerateMode *string `json:"generate_mode,omitempty" xml:"generate_mode,omitempty"`
	// 图片生成或编辑提示词
	Prompt *string `json:"prompt,omitempty" xml:"prompt,omitempty" require:"true"`
	// 图片地址
	ImageUrls []*string `json:"image_urls,omitempty" xml:"image_urls,omitempty" type:"Repeated"`
	// 图片尺寸
	Size *string `json:"size,omitempty" xml:"size,omitempty"`
	// 图片张数
	N *int64 `json:"n,omitempty" xml:"n,omitempty"`
	// 扩展参数JSON字符串
	ExtParams *string `json:"ext_params,omitempty" xml:"ext_params,omitempty"`
}

func (s PushMaasImageRequest) String() string {
	return tea.Prettify(s)
}

func (s PushMaasImageRequest) GoString() string {
	return s.String()
}

func (s *PushMaasImageRequest) SetAuthToken(v string) *PushMaasImageRequest {
	s.AuthToken = &v
	return s
}

func (s *PushMaasImageRequest) SetProductInstanceId(v string) *PushMaasImageRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PushMaasImageRequest) SetRequestId(v string) *PushMaasImageRequest {
	s.RequestId = &v
	return s
}

func (s *PushMaasImageRequest) SetModel(v string) *PushMaasImageRequest {
	s.Model = &v
	return s
}

func (s *PushMaasImageRequest) SetCapabilityType(v string) *PushMaasImageRequest {
	s.CapabilityType = &v
	return s
}

func (s *PushMaasImageRequest) SetGenerateMode(v string) *PushMaasImageRequest {
	s.GenerateMode = &v
	return s
}

func (s *PushMaasImageRequest) SetPrompt(v string) *PushMaasImageRequest {
	s.Prompt = &v
	return s
}

func (s *PushMaasImageRequest) SetImageUrls(v []*string) *PushMaasImageRequest {
	s.ImageUrls = v
	return s
}

func (s *PushMaasImageRequest) SetSize(v string) *PushMaasImageRequest {
	s.Size = &v
	return s
}

func (s *PushMaasImageRequest) SetN(v int64) *PushMaasImageRequest {
	s.N = &v
	return s
}

func (s *PushMaasImageRequest) SetExtParams(v string) *PushMaasImageRequest {
	s.ExtParams = &v
	return s
}

type PushMaasImageResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 图片任务ID
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty"`
	// 任务状态
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 实际使用的模型
	Model *string `json:"model,omitempty" xml:"model,omitempty"`
	// 图片URL列表
	Content *ImageUrlsList `json:"content,omitempty" xml:"content,omitempty"`
	// 用量数组
	Usage []*ImageUsage `json:"usage,omitempty" xml:"usage,omitempty" type:"Repeated"`
	// 失败时返回
	Error *Error `json:"error,omitempty" xml:"error,omitempty"`
	// 非标准化补充信息，JSON字符串
	ExtraInfo *string `json:"extra_info,omitempty" xml:"extra_info,omitempty"`
}

func (s PushMaasImageResponse) String() string {
	return tea.Prettify(s)
}

func (s PushMaasImageResponse) GoString() string {
	return s.String()
}

func (s *PushMaasImageResponse) SetReqMsgId(v string) *PushMaasImageResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PushMaasImageResponse) SetResultCode(v string) *PushMaasImageResponse {
	s.ResultCode = &v
	return s
}

func (s *PushMaasImageResponse) SetResultMsg(v string) *PushMaasImageResponse {
	s.ResultMsg = &v
	return s
}

func (s *PushMaasImageResponse) SetTaskId(v string) *PushMaasImageResponse {
	s.TaskId = &v
	return s
}

func (s *PushMaasImageResponse) SetStatus(v string) *PushMaasImageResponse {
	s.Status = &v
	return s
}

func (s *PushMaasImageResponse) SetModel(v string) *PushMaasImageResponse {
	s.Model = &v
	return s
}

func (s *PushMaasImageResponse) SetContent(v *ImageUrlsList) *PushMaasImageResponse {
	s.Content = v
	return s
}

func (s *PushMaasImageResponse) SetUsage(v []*ImageUsage) *PushMaasImageResponse {
	s.Usage = v
	return s
}

func (s *PushMaasImageResponse) SetError(v *Error) *PushMaasImageResponse {
	s.Error = v
	return s
}

func (s *PushMaasImageResponse) SetExtraInfo(v string) *PushMaasImageResponse {
	s.ExtraInfo = &v
	return s
}

type QueryMaasImageRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 图片任务ID
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty" require:"true"`
}

func (s QueryMaasImageRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryMaasImageRequest) GoString() string {
	return s.String()
}

func (s *QueryMaasImageRequest) SetAuthToken(v string) *QueryMaasImageRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryMaasImageRequest) SetProductInstanceId(v string) *QueryMaasImageRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryMaasImageRequest) SetTaskId(v string) *QueryMaasImageRequest {
	s.TaskId = &v
	return s
}

type QueryMaasImageResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 图片任务ID
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty"`
	// 任务状态
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 实际使用的模型
	Model *string `json:"model,omitempty" xml:"model,omitempty"`
	// 创建时间，Unix 秒级时间戳
	CreatedAt *string `json:"created_at,omitempty" xml:"created_at,omitempty"`
	// 图片URL列表(成功时返回)
	Content *ImageUrlsList `json:"content,omitempty" xml:"content,omitempty"`
	// 用量数组
	Usage []*ImageUsage `json:"usage,omitempty" xml:"usage,omitempty" type:"Repeated"`
	// 非标准化补充信息，JSON字符串
	ExtraInfo *string `json:"extra_info,omitempty" xml:"extra_info,omitempty"`
	// 失败时返回
	Error *Error `json:"error,omitempty" xml:"error,omitempty"`
}

func (s QueryMaasImageResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryMaasImageResponse) GoString() string {
	return s.String()
}

func (s *QueryMaasImageResponse) SetReqMsgId(v string) *QueryMaasImageResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryMaasImageResponse) SetResultCode(v string) *QueryMaasImageResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryMaasImageResponse) SetResultMsg(v string) *QueryMaasImageResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryMaasImageResponse) SetTaskId(v string) *QueryMaasImageResponse {
	s.TaskId = &v
	return s
}

func (s *QueryMaasImageResponse) SetStatus(v string) *QueryMaasImageResponse {
	s.Status = &v
	return s
}

func (s *QueryMaasImageResponse) SetModel(v string) *QueryMaasImageResponse {
	s.Model = &v
	return s
}

func (s *QueryMaasImageResponse) SetCreatedAt(v string) *QueryMaasImageResponse {
	s.CreatedAt = &v
	return s
}

func (s *QueryMaasImageResponse) SetContent(v *ImageUrlsList) *QueryMaasImageResponse {
	s.Content = v
	return s
}

func (s *QueryMaasImageResponse) SetUsage(v []*ImageUsage) *QueryMaasImageResponse {
	s.Usage = v
	return s
}

func (s *QueryMaasImageResponse) SetExtraInfo(v string) *QueryMaasImageResponse {
	s.ExtraInfo = &v
	return s
}

func (s *QueryMaasImageResponse) SetError(v *Error) *QueryMaasImageResponse {
	s.Error = v
	return s
}

type PushMaasAudioRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 幂等标识，由客户端生成
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty" require:"true"`
	// 音频模型编码
	Model *string `json:"model,omitempty" xml:"model,omitempty" require:"true"`
	// 类型
	CapabilityType *string `json:"capability_type,omitempty" xml:"capability_type,omitempty" require:"true"`
	// 音频生成提示词
	Prompt *string `json:"prompt,omitempty" xml:"prompt,omitempty" require:"true"`
	// 需要朗读的文本，仅支持该参数的模型使用
	Text *string `json:"text,omitempty" xml:"text,omitempty"`
	// 音频链接，REFERENCE_TO_AUDIO时非空
	AudioUrls []*string `json:"audio_urls,omitempty" xml:"audio_urls,omitempty" type:"Repeated"`
	// 图片链接，IMAGE_TO_AUDIO时非空
	ImageUrls []*string `json:"image_urls,omitempty" xml:"image_urls,omitempty" type:"Repeated"`
	// 扩展参数JSON字符串，内容按模型扩展参数对象组织
	ExtParams *string `json:"ext_params,omitempty" xml:"ext_params,omitempty"`
}

func (s PushMaasAudioRequest) String() string {
	return tea.Prettify(s)
}

func (s PushMaasAudioRequest) GoString() string {
	return s.String()
}

func (s *PushMaasAudioRequest) SetAuthToken(v string) *PushMaasAudioRequest {
	s.AuthToken = &v
	return s
}

func (s *PushMaasAudioRequest) SetProductInstanceId(v string) *PushMaasAudioRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PushMaasAudioRequest) SetRequestId(v string) *PushMaasAudioRequest {
	s.RequestId = &v
	return s
}

func (s *PushMaasAudioRequest) SetModel(v string) *PushMaasAudioRequest {
	s.Model = &v
	return s
}

func (s *PushMaasAudioRequest) SetCapabilityType(v string) *PushMaasAudioRequest {
	s.CapabilityType = &v
	return s
}

func (s *PushMaasAudioRequest) SetPrompt(v string) *PushMaasAudioRequest {
	s.Prompt = &v
	return s
}

func (s *PushMaasAudioRequest) SetText(v string) *PushMaasAudioRequest {
	s.Text = &v
	return s
}

func (s *PushMaasAudioRequest) SetAudioUrls(v []*string) *PushMaasAudioRequest {
	s.AudioUrls = v
	return s
}

func (s *PushMaasAudioRequest) SetImageUrls(v []*string) *PushMaasAudioRequest {
	s.ImageUrls = v
	return s
}

func (s *PushMaasAudioRequest) SetExtParams(v string) *PushMaasAudioRequest {
	s.ExtParams = &v
	return s
}

type PushMaasAudioResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 音频任务ID
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty"`
	// 任务状态
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 实际使用的模型
	Model *string `json:"model,omitempty" xml:"model,omitempty"`
}

func (s PushMaasAudioResponse) String() string {
	return tea.Prettify(s)
}

func (s PushMaasAudioResponse) GoString() string {
	return s.String()
}

func (s *PushMaasAudioResponse) SetReqMsgId(v string) *PushMaasAudioResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PushMaasAudioResponse) SetResultCode(v string) *PushMaasAudioResponse {
	s.ResultCode = &v
	return s
}

func (s *PushMaasAudioResponse) SetResultMsg(v string) *PushMaasAudioResponse {
	s.ResultMsg = &v
	return s
}

func (s *PushMaasAudioResponse) SetTaskId(v string) *PushMaasAudioResponse {
	s.TaskId = &v
	return s
}

func (s *PushMaasAudioResponse) SetStatus(v string) *PushMaasAudioResponse {
	s.Status = &v
	return s
}

func (s *PushMaasAudioResponse) SetModel(v string) *PushMaasAudioResponse {
	s.Model = &v
	return s
}

type QueryMaasAudioRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 音频任务ID
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty"`
}

func (s QueryMaasAudioRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryMaasAudioRequest) GoString() string {
	return s.String()
}

func (s *QueryMaasAudioRequest) SetAuthToken(v string) *QueryMaasAudioRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryMaasAudioRequest) SetProductInstanceId(v string) *QueryMaasAudioRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryMaasAudioRequest) SetTaskId(v string) *QueryMaasAudioRequest {
	s.TaskId = &v
	return s
}

type QueryMaasAudioResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 音频任务ID
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty"`
	// 任务状态
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 实际使用的模型
	Model *string `json:"model,omitempty" xml:"model,omitempty"`
	// 创建时间，Unix秒级时间戳
	CreatedAt *string `json:"created_at,omitempty" xml:"created_at,omitempty"`
	// 音频信息
	Content []*AudioList `json:"content,omitempty" xml:"content,omitempty" type:"Repeated"`
	// 用量
	Usage []*AudioUsage `json:"usage,omitempty" xml:"usage,omitempty" type:"Repeated"`
	// 非标准化补充信息，JSON字符串
	ExtraInfo *string `json:"extra_info,omitempty" xml:"extra_info,omitempty"`
	// 失败时返回
	Error *Error `json:"error,omitempty" xml:"error,omitempty"`
}

func (s QueryMaasAudioResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryMaasAudioResponse) GoString() string {
	return s.String()
}

func (s *QueryMaasAudioResponse) SetReqMsgId(v string) *QueryMaasAudioResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryMaasAudioResponse) SetResultCode(v string) *QueryMaasAudioResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryMaasAudioResponse) SetResultMsg(v string) *QueryMaasAudioResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryMaasAudioResponse) SetTaskId(v string) *QueryMaasAudioResponse {
	s.TaskId = &v
	return s
}

func (s *QueryMaasAudioResponse) SetStatus(v string) *QueryMaasAudioResponse {
	s.Status = &v
	return s
}

func (s *QueryMaasAudioResponse) SetModel(v string) *QueryMaasAudioResponse {
	s.Model = &v
	return s
}

func (s *QueryMaasAudioResponse) SetCreatedAt(v string) *QueryMaasAudioResponse {
	s.CreatedAt = &v
	return s
}

func (s *QueryMaasAudioResponse) SetContent(v []*AudioList) *QueryMaasAudioResponse {
	s.Content = v
	return s
}

func (s *QueryMaasAudioResponse) SetUsage(v []*AudioUsage) *QueryMaasAudioResponse {
	s.Usage = v
	return s
}

func (s *QueryMaasAudioResponse) SetExtraInfo(v string) *QueryMaasAudioResponse {
	s.ExtraInfo = &v
	return s
}

func (s *QueryMaasAudioResponse) SetError(v *Error) *QueryMaasAudioResponse {
	s.Error = v
	return s
}

type ExecMaasChatsyncRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 幂等标识，由客户端生成
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty" require:"true"`
	// 文本模型编码
	Model *string `json:"model,omitempty" xml:"model,omitempty" require:"true"`
	// 非空消息列表
	Messages []*ChatMessages `json:"messages,omitempty" xml:"messages,omitempty" require:"true" type:"Repeated"`
	// 模型参数JSON字符串
	ExtParams *string `json:"ext_params,omitempty" xml:"ext_params,omitempty"`
}

func (s ExecMaasChatsyncRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecMaasChatsyncRequest) GoString() string {
	return s.String()
}

func (s *ExecMaasChatsyncRequest) SetAuthToken(v string) *ExecMaasChatsyncRequest {
	s.AuthToken = &v
	return s
}

func (s *ExecMaasChatsyncRequest) SetProductInstanceId(v string) *ExecMaasChatsyncRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ExecMaasChatsyncRequest) SetRequestId(v string) *ExecMaasChatsyncRequest {
	s.RequestId = &v
	return s
}

func (s *ExecMaasChatsyncRequest) SetModel(v string) *ExecMaasChatsyncRequest {
	s.Model = &v
	return s
}

func (s *ExecMaasChatsyncRequest) SetMessages(v []*ChatMessages) *ExecMaasChatsyncRequest {
	s.Messages = v
	return s
}

func (s *ExecMaasChatsyncRequest) SetExtParams(v string) *ExecMaasChatsyncRequest {
	s.ExtParams = &v
	return s
}

type ExecMaasChatsyncResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 本次模型调用ID
	Id *string `json:"id,omitempty" xml:"id,omitempty"`
	// 实际使用的模型
	Model *string `json:"model,omitempty" xml:"model,omitempty"`
	// 完整文本
	Content *string `json:"content,omitempty" xml:"content,omitempty"`
	// 结束原因
	FinishReason *string `json:"finish_reason,omitempty" xml:"finish_reason,omitempty"`
	// 用量
	Usage *ChatUsage `json:"usage,omitempty" xml:"usage,omitempty"`
}

func (s ExecMaasChatsyncResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecMaasChatsyncResponse) GoString() string {
	return s.String()
}

func (s *ExecMaasChatsyncResponse) SetReqMsgId(v string) *ExecMaasChatsyncResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ExecMaasChatsyncResponse) SetResultCode(v string) *ExecMaasChatsyncResponse {
	s.ResultCode = &v
	return s
}

func (s *ExecMaasChatsyncResponse) SetResultMsg(v string) *ExecMaasChatsyncResponse {
	s.ResultMsg = &v
	return s
}

func (s *ExecMaasChatsyncResponse) SetId(v string) *ExecMaasChatsyncResponse {
	s.Id = &v
	return s
}

func (s *ExecMaasChatsyncResponse) SetModel(v string) *ExecMaasChatsyncResponse {
	s.Model = &v
	return s
}

func (s *ExecMaasChatsyncResponse) SetContent(v string) *ExecMaasChatsyncResponse {
	s.Content = &v
	return s
}

func (s *ExecMaasChatsyncResponse) SetFinishReason(v string) *ExecMaasChatsyncResponse {
	s.FinishReason = &v
	return s
}

func (s *ExecMaasChatsyncResponse) SetUsage(v *ChatUsage) *ExecMaasChatsyncResponse {
	s.Usage = v
	return s
}

type ExecMaasPriceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 模型名称
	ModelName *string `json:"model_name,omitempty" xml:"model_name,omitempty" require:"true"`
	// 请求级定价维度
	RequestDimensions *string `json:"request_dimensions,omitempty" xml:"request_dimensions,omitempty"`
	// 请求级计量指标
	RequestMetrics *string `json:"request_metrics,omitempty" xml:"request_metrics,omitempty"`
	// 输出单元列表
	Units []*PriceUnits `json:"units,omitempty" xml:"units,omitempty" type:"Repeated"`
}

func (s ExecMaasPriceRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecMaasPriceRequest) GoString() string {
	return s.String()
}

func (s *ExecMaasPriceRequest) SetAuthToken(v string) *ExecMaasPriceRequest {
	s.AuthToken = &v
	return s
}

func (s *ExecMaasPriceRequest) SetProductInstanceId(v string) *ExecMaasPriceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ExecMaasPriceRequest) SetModelName(v string) *ExecMaasPriceRequest {
	s.ModelName = &v
	return s
}

func (s *ExecMaasPriceRequest) SetRequestDimensions(v string) *ExecMaasPriceRequest {
	s.RequestDimensions = &v
	return s
}

func (s *ExecMaasPriceRequest) SetRequestMetrics(v string) *ExecMaasPriceRequest {
	s.RequestMetrics = &v
	return s
}

func (s *ExecMaasPriceRequest) SetUnits(v []*PriceUnits) *ExecMaasPriceRequest {
	s.Units = v
	return s
}

type ExecMaasPriceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 至少一个输出单元命中
	Matched *bool `json:"matched,omitempty" xml:"matched,omitempty"`
	// 首个输出单元是否命中兜底规则
	Fallback *bool `json:"fallback,omitempty" xml:"fallback,omitempty"`
	// 命中规则编码
	PriceRuleCode *string `json:"price_rule_code,omitempty" xml:"price_rule_code,omitempty"`
	// 规则版本
	MatchedRuleVersion *int64 `json:"matched_rule_version,omitempty" xml:"matched_rule_version,omitempty"`
	// 规则名称
	RuleName *string `json:"rule_name,omitempty" xml:"rule_name,omitempty"`
	// 规则优先级
	Priority *int64 `json:"priority,omitempty" xml:"priority,omitempty"`
	// 只计一次的请求级费用明细
	RequestItems []*RequestItems `json:"request_items,omitempty" xml:"request_items,omitempty" type:"Repeated"`
	// 各输出单元的试算明细
	UnitEstimates []*UnitEstimates `json:"unit_estimates,omitempty" xml:"unit_estimates,omitempty" type:"Repeated"`
	// 试算总金额
	TotalAmount *string `json:"total_amount,omitempty" xml:"total_amount,omitempty"`
	// 币种
	Currency *string `json:"currency,omitempty" xml:"currency,omitempty"`
	// 未命中或部分命中时的提示
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
}

func (s ExecMaasPriceResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecMaasPriceResponse) GoString() string {
	return s.String()
}

func (s *ExecMaasPriceResponse) SetReqMsgId(v string) *ExecMaasPriceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ExecMaasPriceResponse) SetResultCode(v string) *ExecMaasPriceResponse {
	s.ResultCode = &v
	return s
}

func (s *ExecMaasPriceResponse) SetResultMsg(v string) *ExecMaasPriceResponse {
	s.ResultMsg = &v
	return s
}

func (s *ExecMaasPriceResponse) SetMatched(v bool) *ExecMaasPriceResponse {
	s.Matched = &v
	return s
}

func (s *ExecMaasPriceResponse) SetFallback(v bool) *ExecMaasPriceResponse {
	s.Fallback = &v
	return s
}

func (s *ExecMaasPriceResponse) SetPriceRuleCode(v string) *ExecMaasPriceResponse {
	s.PriceRuleCode = &v
	return s
}

func (s *ExecMaasPriceResponse) SetMatchedRuleVersion(v int64) *ExecMaasPriceResponse {
	s.MatchedRuleVersion = &v
	return s
}

func (s *ExecMaasPriceResponse) SetRuleName(v string) *ExecMaasPriceResponse {
	s.RuleName = &v
	return s
}

func (s *ExecMaasPriceResponse) SetPriority(v int64) *ExecMaasPriceResponse {
	s.Priority = &v
	return s
}

func (s *ExecMaasPriceResponse) SetRequestItems(v []*RequestItems) *ExecMaasPriceResponse {
	s.RequestItems = v
	return s
}

func (s *ExecMaasPriceResponse) SetUnitEstimates(v []*UnitEstimates) *ExecMaasPriceResponse {
	s.UnitEstimates = v
	return s
}

func (s *ExecMaasPriceResponse) SetTotalAmount(v string) *ExecMaasPriceResponse {
	s.TotalAmount = &v
	return s
}

func (s *ExecMaasPriceResponse) SetCurrency(v string) *ExecMaasPriceResponse {
	s.Currency = &v
	return s
}

func (s *ExecMaasPriceResponse) SetMessage(v string) *ExecMaasPriceResponse {
	s.Message = &v
	return s
}

type ExecMaasChatstreamRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 幂等标识，由客户端生成
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty" require:"true"`
	// 文本模型编码
	Model *string `json:"model,omitempty" xml:"model,omitempty" require:"true"`
	// 非空消息列表
	Messages []*ChatMessages `json:"messages,omitempty" xml:"messages,omitempty" require:"true" type:"Repeated"`
	// 模型参数 JSON 字符串
	ExtParams *string `json:"ext_params,omitempty" xml:"ext_params,omitempty"`
}

func (s ExecMaasChatstreamRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecMaasChatstreamRequest) GoString() string {
	return s.String()
}

func (s *ExecMaasChatstreamRequest) SetAuthToken(v string) *ExecMaasChatstreamRequest {
	s.AuthToken = &v
	return s
}

func (s *ExecMaasChatstreamRequest) SetProductInstanceId(v string) *ExecMaasChatstreamRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ExecMaasChatstreamRequest) SetRequestId(v string) *ExecMaasChatstreamRequest {
	s.RequestId = &v
	return s
}

func (s *ExecMaasChatstreamRequest) SetModel(v string) *ExecMaasChatstreamRequest {
	s.Model = &v
	return s
}

func (s *ExecMaasChatstreamRequest) SetMessages(v []*ChatMessages) *ExecMaasChatstreamRequest {
	s.Messages = v
	return s
}

func (s *ExecMaasChatstreamRequest) SetExtParams(v string) *ExecMaasChatstreamRequest {
	s.ExtParams = &v
	return s
}

type ExecMaasChatstreamResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s ExecMaasChatstreamResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecMaasChatstreamResponse) GoString() string {
	return s.String()
}

func (s *ExecMaasChatstreamResponse) SetReqMsgId(v string) *ExecMaasChatstreamResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ExecMaasChatstreamResponse) SetResultCode(v string) *ExecMaasChatstreamResponse {
	s.ResultCode = &v
	return s
}

func (s *ExecMaasChatstreamResponse) SetResultMsg(v string) *ExecMaasChatstreamResponse {
	s.ResultMsg = &v
	return s
}

type PushArkassetRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// {"GroupId":"group-20240514212750-b5e9m","URL":"https://example-tos.cn-beijing.volcengine.com/asset-20240514212750-a3f8k.jpg","Name":"demo-portrait-image","AssetType":"Image","ProjectName":"default"}
	RequestBody *string `json:"request_body,omitempty" xml:"request_body,omitempty" require:"true"`
}

func (s PushArkassetRequest) String() string {
	return tea.Prettify(s)
}

func (s PushArkassetRequest) GoString() string {
	return s.String()
}

func (s *PushArkassetRequest) SetAuthToken(v string) *PushArkassetRequest {
	s.AuthToken = &v
	return s
}

func (s *PushArkassetRequest) SetProductInstanceId(v string) *PushArkassetRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PushArkassetRequest) SetRequestBody(v string) *PushArkassetRequest {
	s.RequestBody = &v
	return s
}

type PushArkassetResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// {"ResponseMetadata":{"RequestId":"20240514212750A1B2C3D4E5F6789ABC","Action":"CreateAsset","Version":"2024-01-01","Service":"ark","Region":"cn-beijing"},"Result":{"Id":"asset-20240514212750-a3f8k"}}
	ResponseBody *string `json:"response_body,omitempty" xml:"response_body,omitempty"`
}

func (s PushArkassetResponse) String() string {
	return tea.Prettify(s)
}

func (s PushArkassetResponse) GoString() string {
	return s.String()
}

func (s *PushArkassetResponse) SetReqMsgId(v string) *PushArkassetResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PushArkassetResponse) SetResultCode(v string) *PushArkassetResponse {
	s.ResultCode = &v
	return s
}

func (s *PushArkassetResponse) SetResultMsg(v string) *PushArkassetResponse {
	s.ResultMsg = &v
	return s
}

func (s *PushArkassetResponse) SetResponseBody(v string) *PushArkassetResponse {
	s.ResponseBody = &v
	return s
}

type QueryArkassetRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// {"Id":"asset-20240514212750-a3f8k","ProjectName":"default"}
	RequestBody *string `json:"request_body,omitempty" xml:"request_body,omitempty" require:"true"`
}

func (s QueryArkassetRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryArkassetRequest) GoString() string {
	return s.String()
}

func (s *QueryArkassetRequest) SetAuthToken(v string) *QueryArkassetRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryArkassetRequest) SetProductInstanceId(v string) *QueryArkassetRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryArkassetRequest) SetRequestBody(v string) *QueryArkassetRequest {
	s.RequestBody = &v
	return s
}

type QueryArkassetResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// {"ResponseMetadata":{"RequestId":"20240514213000E5F6789ABCDEF01234","Action":"GetAsset","Version":"2024-01-01","Service":"ark","Region":"cn-beijing"},"Result":{"Id":"asset-20240514212750-a3f8k","Name":"demo-portrait-image","URL":"https://ark-asset.cn-beijing.volcengine.com/asset-20240514212750-a3f8k.jpg?X-Amz-Expires=43200","AssetType":"Image","GroupId":"group-20240514212750-b5e9m","Status":"Active","Moderation":{"Strategy":"Default"},"Error":{"Code":"","Message":""},"CreateTime":"2024-05-14T21:27:50Z","UpdateTime":"2024-05-14T21:30:00Z","LastInferenceTime":"2024-05-14T22:15:30Z","ProjectName":"default"}}
	ResponseBody *string `json:"response_body,omitempty" xml:"response_body,omitempty"`
}

func (s QueryArkassetResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryArkassetResponse) GoString() string {
	return s.String()
}

func (s *QueryArkassetResponse) SetReqMsgId(v string) *QueryArkassetResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryArkassetResponse) SetResultCode(v string) *QueryArkassetResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryArkassetResponse) SetResultMsg(v string) *QueryArkassetResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryArkassetResponse) SetResponseBody(v string) *QueryArkassetResponse {
	s.ResponseBody = &v
	return s
}

type QueryArkassetListRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// {"Filter":{"GroupIds":["group-20240514212750-b5e9m"],"GroupType":"AIGC","Statuses":["Active"]},"MaxResults":1,"SortBy":"CreateTime","SortOrder":"Desc","ProjectName":"default"}
	RequestBody *string `json:"request_body,omitempty" xml:"request_body,omitempty" require:"true"`
}

func (s QueryArkassetListRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryArkassetListRequest) GoString() string {
	return s.String()
}

func (s *QueryArkassetListRequest) SetAuthToken(v string) *QueryArkassetListRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryArkassetListRequest) SetProductInstanceId(v string) *QueryArkassetListRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryArkassetListRequest) SetRequestBody(v string) *QueryArkassetListRequest {
	s.RequestBody = &v
	return s
}

type QueryArkassetListResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// {"ResponseMetadata":{"RequestId":"202405142130001A2B3C4D5E6F708192","Action":"ListAssets","Version":"2024-01-01","Service":"ark","Region":"cn-beijing"},"Result":{"Items":[{"Id":"asset-20240514212750-a3f8k","Name":"demo-portrait-image","URL":"https://ark-asset.cn-beijing.volcengine.com/asset-20240514212750-a3f8k.jpg?X-Amz-Expires=43200","GroupId":"group-20240514212750-b5e9m","AssetType":"Image","Status":"Active","Moderation":{"Strategy":"Default"},"Error":{"Code":"","Message":""},"ProjectName":"default","CreateTime":"2024-05-14T21:27:50Z","UpdateTime":"2024-05-14T21:30:00Z","LastInferenceTime":"2024-05-14T22:15:30Z"}],"NextToken":"****bmNyeXB0ZWRfY3Vyc29yIjoiLi4****"}}
	ResponseBody *string `json:"response_body,omitempty" xml:"response_body,omitempty"`
}

func (s QueryArkassetListResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryArkassetListResponse) GoString() string {
	return s.String()
}

func (s *QueryArkassetListResponse) SetReqMsgId(v string) *QueryArkassetListResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryArkassetListResponse) SetResultCode(v string) *QueryArkassetListResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryArkassetListResponse) SetResultMsg(v string) *QueryArkassetListResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryArkassetListResponse) SetResponseBody(v string) *QueryArkassetListResponse {
	s.ResponseBody = &v
	return s
}

type ResetArkassetRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// {"Id":"asset-20240514212750-a3f8k","Name":"demo-portrait-image-renamed","ProjectName":"default"}
	RequestBody *string `json:"request_body,omitempty" xml:"request_body,omitempty" require:"true"`
}

func (s ResetArkassetRequest) String() string {
	return tea.Prettify(s)
}

func (s ResetArkassetRequest) GoString() string {
	return s.String()
}

func (s *ResetArkassetRequest) SetAuthToken(v string) *ResetArkassetRequest {
	s.AuthToken = &v
	return s
}

func (s *ResetArkassetRequest) SetProductInstanceId(v string) *ResetArkassetRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ResetArkassetRequest) SetRequestBody(v string) *ResetArkassetRequest {
	s.RequestBody = &v
	return s
}

type ResetArkassetResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// {"ResponseMetadata":{"RequestId":"202405142130003C4D5E6F708192031A","Action":"UpdateAsset","Version":"2024-01-01","Service":"ark","Region":"cn-beijing"},"Result":{"Id":"asset-20240514212750-a3f8k"}}
	ResponseBody *string `json:"response_body,omitempty" xml:"response_body,omitempty"`
}

func (s ResetArkassetResponse) String() string {
	return tea.Prettify(s)
}

func (s ResetArkassetResponse) GoString() string {
	return s.String()
}

func (s *ResetArkassetResponse) SetReqMsgId(v string) *ResetArkassetResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ResetArkassetResponse) SetResultCode(v string) *ResetArkassetResponse {
	s.ResultCode = &v
	return s
}

func (s *ResetArkassetResponse) SetResultMsg(v string) *ResetArkassetResponse {
	s.ResultMsg = &v
	return s
}

func (s *ResetArkassetResponse) SetResponseBody(v string) *ResetArkassetResponse {
	s.ResponseBody = &v
	return s
}

type DeleteArkassetRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// {"Id":"asset-20240514212750-a3f8k","ProjectName":"default"}
	RequestBody *string `json:"request_body,omitempty" xml:"request_body,omitempty" require:"true"`
}

func (s DeleteArkassetRequest) String() string {
	return tea.Prettify(s)
}

func (s DeleteArkassetRequest) GoString() string {
	return s.String()
}

func (s *DeleteArkassetRequest) SetAuthToken(v string) *DeleteArkassetRequest {
	s.AuthToken = &v
	return s
}

func (s *DeleteArkassetRequest) SetProductInstanceId(v string) *DeleteArkassetRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DeleteArkassetRequest) SetRequestBody(v string) *DeleteArkassetRequest {
	s.RequestBody = &v
	return s
}

type DeleteArkassetResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// {"ResponseMetadata":{"RequestId":"20240514213000C3D4E5F6789ABCDEF0","Action":"DeleteAsset","Version":"2024-01-01","Service":"ark","Region":"cn-beijing"},"Result":{}}
	ResponseBody *string `json:"response_body,omitempty" xml:"response_body,omitempty"`
}

func (s DeleteArkassetResponse) String() string {
	return tea.Prettify(s)
}

func (s DeleteArkassetResponse) GoString() string {
	return s.String()
}

func (s *DeleteArkassetResponse) SetReqMsgId(v string) *DeleteArkassetResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DeleteArkassetResponse) SetResultCode(v string) *DeleteArkassetResponse {
	s.ResultCode = &v
	return s
}

func (s *DeleteArkassetResponse) SetResultMsg(v string) *DeleteArkassetResponse {
	s.ResultMsg = &v
	return s
}

func (s *DeleteArkassetResponse) SetResponseBody(v string) *DeleteArkassetResponse {
	s.ResponseBody = &v
	return s
}

type PushArkassetgroupRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// {"Name":"demo-portrait-group","Description":"虚拟人像素材组示例","GroupType":"AIGC","ProjectName":"default"}
	RequestBody *string `json:"request_body,omitempty" xml:"request_body,omitempty" require:"true"`
}

func (s PushArkassetgroupRequest) String() string {
	return tea.Prettify(s)
}

func (s PushArkassetgroupRequest) GoString() string {
	return s.String()
}

func (s *PushArkassetgroupRequest) SetAuthToken(v string) *PushArkassetgroupRequest {
	s.AuthToken = &v
	return s
}

func (s *PushArkassetgroupRequest) SetProductInstanceId(v string) *PushArkassetgroupRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PushArkassetgroupRequest) SetRequestBody(v string) *PushArkassetgroupRequest {
	s.RequestBody = &v
	return s
}

type PushArkassetgroupResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// {"ResponseMetadata":{"RequestId":"20240514212750B2C3D4E5F6789ABCDE","Action":"CreateAssetGroup","Version":"2024-01-01","Service":"ark","Region":"cn-beijing"},"Result":{"Id":"group-20240514212750-b5e9m"}}
	ResponseBody *string `json:"response_body,omitempty" xml:"response_body,omitempty"`
}

func (s PushArkassetgroupResponse) String() string {
	return tea.Prettify(s)
}

func (s PushArkassetgroupResponse) GoString() string {
	return s.String()
}

func (s *PushArkassetgroupResponse) SetReqMsgId(v string) *PushArkassetgroupResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PushArkassetgroupResponse) SetResultCode(v string) *PushArkassetgroupResponse {
	s.ResultCode = &v
	return s
}

func (s *PushArkassetgroupResponse) SetResultMsg(v string) *PushArkassetgroupResponse {
	s.ResultMsg = &v
	return s
}

func (s *PushArkassetgroupResponse) SetResponseBody(v string) *PushArkassetgroupResponse {
	s.ResponseBody = &v
	return s
}

type QueryArkassetgroupRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// {"Id":"group-20240514212750-b5e9m","ProjectName":"default"}
	RequestBody *string `json:"request_body,omitempty" xml:"request_body,omitempty" require:"true"`
}

func (s QueryArkassetgroupRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryArkassetgroupRequest) GoString() string {
	return s.String()
}

func (s *QueryArkassetgroupRequest) SetAuthToken(v string) *QueryArkassetgroupRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryArkassetgroupRequest) SetProductInstanceId(v string) *QueryArkassetgroupRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryArkassetgroupRequest) SetRequestBody(v string) *QueryArkassetgroupRequest {
	s.RequestBody = &v
	return s
}

type QueryArkassetgroupResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// {"ResponseMetadata":{"RequestId":"20240514213000F6789ABCDEF0123456","Action":"GetAssetGroup","Version":"2024-01-01","Service":"ark","Region":"cn-beijing"},"Result":{"Id":"group-20240514212750-b5e9m","Name":"demo-portrait-group","Description":"虚拟人像素材组示例","GroupType":"AIGC","ProjectName":"default","CreateTime":"2024-05-14T21:27:50Z","UpdateTime":"2024-05-14T21:30:00Z"}}
	ResponseBody *string `json:"response_body,omitempty" xml:"response_body,omitempty"`
}

func (s QueryArkassetgroupResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryArkassetgroupResponse) GoString() string {
	return s.String()
}

func (s *QueryArkassetgroupResponse) SetReqMsgId(v string) *QueryArkassetgroupResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryArkassetgroupResponse) SetResultCode(v string) *QueryArkassetgroupResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryArkassetgroupResponse) SetResultMsg(v string) *QueryArkassetgroupResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryArkassetgroupResponse) SetResponseBody(v string) *QueryArkassetgroupResponse {
	s.ResponseBody = &v
	return s
}

type QueryArkassetgroupListRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// {"Filter":{"GroupIds":["group-20240514212750-b5e9m","group-20240514212810-c7n2p"],"GroupType":"AIGC"},"MaxResults":1,"SortBy":"CreateTime","SortOrder":"Desc","ProjectName":"default"}
	RequestBody *string `json:"request_body,omitempty" xml:"request_body,omitempty" require:"true"`
}

func (s QueryArkassetgroupListRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryArkassetgroupListRequest) GoString() string {
	return s.String()
}

func (s *QueryArkassetgroupListRequest) SetAuthToken(v string) *QueryArkassetgroupListRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryArkassetgroupListRequest) SetProductInstanceId(v string) *QueryArkassetgroupListRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryArkassetgroupListRequest) SetRequestBody(v string) *QueryArkassetgroupListRequest {
	s.RequestBody = &v
	return s
}

type QueryArkassetgroupListResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// {"ResponseMetadata":{"RequestId":"202405142130002B3C4D5E6F70819203","Action":"ListAssetGroups","Version":"2024-01-01","Service":"ark","Region":"cn-beijing"},"Result":{"Items":[{"Id":"group-20240514212750-b5e9m","Name":"demo-portrait-group","Description":"虚拟人像素材组示例","GroupType":"AIGC","ProjectName":"default","CreateTime":"2024-05-14T21:27:50Z","UpdateTime":"2024-05-14T21:30:00Z"}],"NextToken":"****bmNyeXB0ZWRfY3Vyc29yIjoiLi4****"}}
	ResponseBody *string `json:"response_body,omitempty" xml:"response_body,omitempty"`
}

func (s QueryArkassetgroupListResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryArkassetgroupListResponse) GoString() string {
	return s.String()
}

func (s *QueryArkassetgroupListResponse) SetReqMsgId(v string) *QueryArkassetgroupListResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryArkassetgroupListResponse) SetResultCode(v string) *QueryArkassetgroupListResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryArkassetgroupListResponse) SetResultMsg(v string) *QueryArkassetgroupListResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryArkassetgroupListResponse) SetResponseBody(v string) *QueryArkassetgroupListResponse {
	s.ResponseBody = &v
	return s
}

type ResetArkassetgroupRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// {"Id":"group-20240514212750-b5e9m","Name":"demo-portrait-group-renamed","Description":"更新后的虚拟人像素材组描述","ProjectName":"default"}
	RequestBody *string `json:"request_body,omitempty" xml:"request_body,omitempty" require:"true"`
}

func (s ResetArkassetgroupRequest) String() string {
	return tea.Prettify(s)
}

func (s ResetArkassetgroupRequest) GoString() string {
	return s.String()
}

func (s *ResetArkassetgroupRequest) SetAuthToken(v string) *ResetArkassetgroupRequest {
	s.AuthToken = &v
	return s
}

func (s *ResetArkassetgroupRequest) SetProductInstanceId(v string) *ResetArkassetgroupRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ResetArkassetgroupRequest) SetRequestBody(v string) *ResetArkassetgroupRequest {
	s.RequestBody = &v
	return s
}

type ResetArkassetgroupResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// {"ResponseMetadata":{"RequestId":"202405142130004D5E6F708192031A2B","Action":"UpdateAssetGroup","Version":"2024-01-01","Service":"ark","Region":"cn-beijing"},"Result":{"Id":"group-20240514212750-b5e9m"}}
	ResponseBody *string `json:"response_body,omitempty" xml:"response_body,omitempty"`
}

func (s ResetArkassetgroupResponse) String() string {
	return tea.Prettify(s)
}

func (s ResetArkassetgroupResponse) GoString() string {
	return s.String()
}

func (s *ResetArkassetgroupResponse) SetReqMsgId(v string) *ResetArkassetgroupResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ResetArkassetgroupResponse) SetResultCode(v string) *ResetArkassetgroupResponse {
	s.ResultCode = &v
	return s
}

func (s *ResetArkassetgroupResponse) SetResultMsg(v string) *ResetArkassetgroupResponse {
	s.ResultMsg = &v
	return s
}

func (s *ResetArkassetgroupResponse) SetResponseBody(v string) *ResetArkassetgroupResponse {
	s.ResponseBody = &v
	return s
}

type DeleteArkassetgroupRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// {"Id":"group-20240514212750-b5e9m","ProjectName":"default"}
	RequestBody *string `json:"request_body,omitempty" xml:"request_body,omitempty" require:"true"`
}

func (s DeleteArkassetgroupRequest) String() string {
	return tea.Prettify(s)
}

func (s DeleteArkassetgroupRequest) GoString() string {
	return s.String()
}

func (s *DeleteArkassetgroupRequest) SetAuthToken(v string) *DeleteArkassetgroupRequest {
	s.AuthToken = &v
	return s
}

func (s *DeleteArkassetgroupRequest) SetProductInstanceId(v string) *DeleteArkassetgroupRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DeleteArkassetgroupRequest) SetRequestBody(v string) *DeleteArkassetgroupRequest {
	s.RequestBody = &v
	return s
}

type DeleteArkassetgroupResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// {"ResponseMetadata":{"RequestId":"20240514213000D4E5F6789ABCDEF012","Action":"DeleteAssetGroup","Version":"2024-01-01","Service":"ark","Region":"cn-beijing"},"Result":{}}
	ResponseBody *string `json:"response_body,omitempty" xml:"response_body,omitempty"`
}

func (s DeleteArkassetgroupResponse) String() string {
	return tea.Prettify(s)
}

func (s DeleteArkassetgroupResponse) GoString() string {
	return s.String()
}

func (s *DeleteArkassetgroupResponse) SetReqMsgId(v string) *DeleteArkassetgroupResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DeleteArkassetgroupResponse) SetResultCode(v string) *DeleteArkassetgroupResponse {
	s.ResultCode = &v
	return s
}

func (s *DeleteArkassetgroupResponse) SetResultMsg(v string) *DeleteArkassetgroupResponse {
	s.ResultMsg = &v
	return s
}

func (s *DeleteArkassetgroupResponse) SetResponseBody(v string) *DeleteArkassetgroupResponse {
	s.ResponseBody = &v
	return s
}

type PushArkassetvisualRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 请求参数
	RequestBody *string `json:"request_body,omitempty" xml:"request_body,omitempty" require:"true"`
}

func (s PushArkassetvisualRequest) String() string {
	return tea.Prettify(s)
}

func (s PushArkassetvisualRequest) GoString() string {
	return s.String()
}

func (s *PushArkassetvisualRequest) SetAuthToken(v string) *PushArkassetvisualRequest {
	s.AuthToken = &v
	return s
}

func (s *PushArkassetvisualRequest) SetProductInstanceId(v string) *PushArkassetvisualRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PushArkassetvisualRequest) SetRequestBody(v string) *PushArkassetvisualRequest {
	s.RequestBody = &v
	return s
}

type PushArkassetvisualResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 响应参数
	ResponseBody *string `json:"response_body,omitempty" xml:"response_body,omitempty"`
}

func (s PushArkassetvisualResponse) String() string {
	return tea.Prettify(s)
}

func (s PushArkassetvisualResponse) GoString() string {
	return s.String()
}

func (s *PushArkassetvisualResponse) SetReqMsgId(v string) *PushArkassetvisualResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PushArkassetvisualResponse) SetResultCode(v string) *PushArkassetvisualResponse {
	s.ResultCode = &v
	return s
}

func (s *PushArkassetvisualResponse) SetResultMsg(v string) *PushArkassetvisualResponse {
	s.ResultMsg = &v
	return s
}

func (s *PushArkassetvisualResponse) SetResponseBody(v string) *PushArkassetvisualResponse {
	s.ResponseBody = &v
	return s
}

type QueryArkassetvisualRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 请求参数
	RequestBody *string `json:"request_body,omitempty" xml:"request_body,omitempty" require:"true"`
}

func (s QueryArkassetvisualRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryArkassetvisualRequest) GoString() string {
	return s.String()
}

func (s *QueryArkassetvisualRequest) SetAuthToken(v string) *QueryArkassetvisualRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryArkassetvisualRequest) SetProductInstanceId(v string) *QueryArkassetvisualRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryArkassetvisualRequest) SetRequestBody(v string) *QueryArkassetvisualRequest {
	s.RequestBody = &v
	return s
}

type QueryArkassetvisualResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 响应参数
	ResponseBody *string `json:"response_body,omitempty" xml:"response_body,omitempty"`
}

func (s QueryArkassetvisualResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryArkassetvisualResponse) GoString() string {
	return s.String()
}

func (s *QueryArkassetvisualResponse) SetReqMsgId(v string) *QueryArkassetvisualResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryArkassetvisualResponse) SetResultCode(v string) *QueryArkassetvisualResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryArkassetvisualResponse) SetResultMsg(v string) *QueryArkassetvisualResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryArkassetvisualResponse) SetResponseBody(v string) *QueryArkassetvisualResponse {
	s.ResponseBody = &v
	return s
}

type QueryVideogenerationTaskRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 任务ID
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty" require:"true"`
}

func (s QueryVideogenerationTaskRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryVideogenerationTaskRequest) GoString() string {
	return s.String()
}

func (s *QueryVideogenerationTaskRequest) SetAuthToken(v string) *QueryVideogenerationTaskRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryVideogenerationTaskRequest) SetProductInstanceId(v string) *QueryVideogenerationTaskRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryVideogenerationTaskRequest) SetTaskId(v string) *QueryVideogenerationTaskRequest {
	s.TaskId = &v
	return s
}

type QueryVideogenerationTaskResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 任务id
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty"`
	// 状态
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 模型
	Model *string `json:"model,omitempty" xml:"model,omitempty"`
	// 错误原因编码
	ErrorCode *string `json:"error_code,omitempty" xml:"error_code,omitempty"`
	// 错误原因详情
	ErrorMessage *string `json:"error_message,omitempty" xml:"error_message,omitempty"`
	// 供应商任务id
	Id *string `json:"id,omitempty" xml:"id,omitempty"`
	// 供应商原始快照
	OriginalSnapshot *string `json:"original_snapshot,omitempty" xml:"original_snapshot,omitempty"`
}

func (s QueryVideogenerationTaskResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryVideogenerationTaskResponse) GoString() string {
	return s.String()
}

func (s *QueryVideogenerationTaskResponse) SetReqMsgId(v string) *QueryVideogenerationTaskResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryVideogenerationTaskResponse) SetResultCode(v string) *QueryVideogenerationTaskResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryVideogenerationTaskResponse) SetResultMsg(v string) *QueryVideogenerationTaskResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryVideogenerationTaskResponse) SetTaskId(v string) *QueryVideogenerationTaskResponse {
	s.TaskId = &v
	return s
}

func (s *QueryVideogenerationTaskResponse) SetStatus(v string) *QueryVideogenerationTaskResponse {
	s.Status = &v
	return s
}

func (s *QueryVideogenerationTaskResponse) SetModel(v string) *QueryVideogenerationTaskResponse {
	s.Model = &v
	return s
}

func (s *QueryVideogenerationTaskResponse) SetErrorCode(v string) *QueryVideogenerationTaskResponse {
	s.ErrorCode = &v
	return s
}

func (s *QueryVideogenerationTaskResponse) SetErrorMessage(v string) *QueryVideogenerationTaskResponse {
	s.ErrorMessage = &v
	return s
}

func (s *QueryVideogenerationTaskResponse) SetId(v string) *QueryVideogenerationTaskResponse {
	s.Id = &v
	return s
}

func (s *QueryVideogenerationTaskResponse) SetOriginalSnapshot(v string) *QueryVideogenerationTaskResponse {
	s.OriginalSnapshot = &v
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

// Description:
//
// # Init client with Config
//
// @param config - config contains the necessary information to create a client
func NewClient(config *Config) (*Client, error) {
	client := new(Client)
	err := client.Init(config)
	return client, err
}

func (client *Client) Init(config *Config) (_err error) {
	if tea.BoolValue(util.IsUnset(config)) {
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

// Description:
//
// # Encapsulate the request and invoke the network
//
// @param action - api name
//
// @param protocol - http or https
//
// @param method - e.g. GET
//
// @param pathname - pathname of every api
//
// @param request - which contains request params
//
// @param runtime - which controls some details of call api, such as retry times
//
// @return the response
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
				"sdk_version":      tea.String("1.2.5"),
				"_prod_code":       tea.String("CREATIVE"),
				"_prod_channel":    tea.String("default"),
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

// Description:
//
// Description: 内容创作平台-视频生成-推送
//
// Summary: 内容创作平台-视频生成-推送
func (client *Client) PushVideogeneration(request *PushVideogenerationRequest) (_result *PushVideogenerationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PushVideogenerationResponse{}
	_body, _err := client.PushVideogenerationEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 内容创作平台-视频生成-推送
//
// Summary: 内容创作平台-视频生成-推送
func (client *Client) PushVideogenerationEx(request *PushVideogenerationRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PushVideogenerationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PushVideogenerationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.creative.videogeneration.push"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 视频创作接口查询
//
// Summary: 视频创作接口查询
func (client *Client) QueryVideogeneration(request *QueryVideogenerationRequest) (_result *QueryVideogenerationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryVideogenerationResponse{}
	_body, _err := client.QueryVideogenerationEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 视频创作接口查询
//
// Summary: 视频创作接口查询
func (client *Client) QueryVideogenerationEx(request *QueryVideogenerationRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryVideogenerationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryVideogenerationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.creative.videogeneration.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 资产上传接口
//
// Summary: 资产上传接口
func (client *Client) UploadAsset(request *UploadAssetRequest) (_result *UploadAssetResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UploadAssetResponse{}
	_body, _err := client.UploadAssetEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 资产上传接口
//
// Summary: 资产上传接口
func (client *Client) UploadAssetEx(request *UploadAssetRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UploadAssetResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UploadAssetResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.creative.asset.upload"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 资产查询接口
//
// Summary: 资产查询接口
func (client *Client) QueryAsset(request *QueryAssetRequest) (_result *QueryAssetResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAssetResponse{}
	_body, _err := client.QueryAssetEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 资产查询接口
//
// Summary: 资产查询接口
func (client *Client) QueryAssetEx(request *QueryAssetRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAssetResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAssetResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.creative.asset.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 上传资产
//
// Summary: 上传资产
func (client *Client) UploadMaasAsset(request *UploadMaasAssetRequest) (_result *UploadMaasAssetResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UploadMaasAssetResponse{}
	_body, _err := client.UploadMaasAssetEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 上传资产
//
// Summary: 上传资产
func (client *Client) UploadMaasAssetEx(request *UploadMaasAssetRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UploadMaasAssetResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UploadMaasAssetResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.creative.maas.asset.upload"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 查询资产
//
// Summary: 查询资产
func (client *Client) QueryMaasAsset(request *QueryMaasAssetRequest) (_result *QueryMaasAssetResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryMaasAssetResponse{}
	_body, _err := client.QueryMaasAssetEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 查询资产
//
// Summary: 查询资产
func (client *Client) QueryMaasAssetEx(request *QueryMaasAssetRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryMaasAssetResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryMaasAssetResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.creative.maas.asset.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 创建视频任务
//
// Summary: 创建视频任务
func (client *Client) PushMaasVideo(request *PushMaasVideoRequest) (_result *PushMaasVideoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PushMaasVideoResponse{}
	_body, _err := client.PushMaasVideoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 创建视频任务
//
// Summary: 创建视频任务
func (client *Client) PushMaasVideoEx(request *PushMaasVideoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PushMaasVideoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PushMaasVideoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.creative.maas.video.push"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 查询视频任务
//
// Summary: 查询视频任务
func (client *Client) QueryMaasVideo(request *QueryMaasVideoRequest) (_result *QueryMaasVideoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryMaasVideoResponse{}
	_body, _err := client.QueryMaasVideoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 查询视频任务
//
// Summary: 查询视频任务
func (client *Client) QueryMaasVideoEx(request *QueryMaasVideoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryMaasVideoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryMaasVideoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.creative.maas.video.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 生成图片
//
// Summary: 生成图片
func (client *Client) PushMaasImage(request *PushMaasImageRequest) (_result *PushMaasImageResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PushMaasImageResponse{}
	_body, _err := client.PushMaasImageEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 生成图片
//
// Summary: 生成图片
func (client *Client) PushMaasImageEx(request *PushMaasImageRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PushMaasImageResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PushMaasImageResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.creative.maas.image.push"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 查询图片任务
//
// Summary: 查询图片任务
func (client *Client) QueryMaasImage(request *QueryMaasImageRequest) (_result *QueryMaasImageResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryMaasImageResponse{}
	_body, _err := client.QueryMaasImageEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 查询图片任务
//
// Summary: 查询图片任务
func (client *Client) QueryMaasImageEx(request *QueryMaasImageRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryMaasImageResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryMaasImageResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.creative.maas.image.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 创建音频任务
//
// Summary: 创建音频任务
func (client *Client) PushMaasAudio(request *PushMaasAudioRequest) (_result *PushMaasAudioResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PushMaasAudioResponse{}
	_body, _err := client.PushMaasAudioEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 创建音频任务
//
// Summary: 创建音频任务
func (client *Client) PushMaasAudioEx(request *PushMaasAudioRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PushMaasAudioResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PushMaasAudioResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.creative.maas.audio.push"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 查询音频任务
//
// Summary: 查询音频任务
func (client *Client) QueryMaasAudio(request *QueryMaasAudioRequest) (_result *QueryMaasAudioResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryMaasAudioResponse{}
	_body, _err := client.QueryMaasAudioEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 查询音频任务
//
// Summary: 查询音频任务
func (client *Client) QueryMaasAudioEx(request *QueryMaasAudioRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryMaasAudioResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryMaasAudioResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.creative.maas.audio.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 文本同步调用
//
// Summary: 文本同步调用
func (client *Client) ExecMaasChatsync(request *ExecMaasChatsyncRequest) (_result *ExecMaasChatsyncResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ExecMaasChatsyncResponse{}
	_body, _err := client.ExecMaasChatsyncEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 文本同步调用
//
// Summary: 文本同步调用
func (client *Client) ExecMaasChatsyncEx(request *ExecMaasChatsyncRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ExecMaasChatsyncResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecMaasChatsyncResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.creative.maas.chatsync.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 价格试算
//
// Summary: 价格试算
func (client *Client) ExecMaasPrice(request *ExecMaasPriceRequest) (_result *ExecMaasPriceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ExecMaasPriceResponse{}
	_body, _err := client.ExecMaasPriceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 价格试算
//
// Summary: 价格试算
func (client *Client) ExecMaasPriceEx(request *ExecMaasPriceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ExecMaasPriceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecMaasPriceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.creative.maas.price.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 文本流式调用
//
// Summary: 文本流式调用
func (client *Client) ExecMaasChatstream(request *ExecMaasChatstreamRequest) (_result *ExecMaasChatstreamResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ExecMaasChatstreamResponse{}
	_body, _err := client.ExecMaasChatstreamEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 文本流式调用
//
// Summary: 文本流式调用
func (client *Client) ExecMaasChatstreamEx(request *ExecMaasChatstreamRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ExecMaasChatstreamResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecMaasChatstreamResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.creative.maas.chatstream.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 创建素材资产
//
// Summary: 创建素材资产
func (client *Client) PushArkasset(request *PushArkassetRequest) (_result *PushArkassetResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PushArkassetResponse{}
	_body, _err := client.PushArkassetEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 创建素材资产
//
// Summary: 创建素材资产
func (client *Client) PushArkassetEx(request *PushArkassetRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PushArkassetResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PushArkassetResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.creative.arkasset.push"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 查询素材资产信息
//
// Summary: 查询素材资产信息
func (client *Client) QueryArkasset(request *QueryArkassetRequest) (_result *QueryArkassetResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryArkassetResponse{}
	_body, _err := client.QueryArkassetEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 查询素材资产信息
//
// Summary: 查询素材资产信息
func (client *Client) QueryArkassetEx(request *QueryArkassetRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryArkassetResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryArkassetResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.creative.arkasset.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 查询素材资产列表
//
// Summary: 查询素材资产列表
func (client *Client) QueryArkassetList(request *QueryArkassetListRequest) (_result *QueryArkassetListResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryArkassetListResponse{}
	_body, _err := client.QueryArkassetListEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 查询素材资产列表
//
// Summary: 查询素材资产列表
func (client *Client) QueryArkassetListEx(request *QueryArkassetListRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryArkassetListResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryArkassetListResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.creative.arkasset.list.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 更新素材资产信息
//
// Summary: 更新素材资产信息
func (client *Client) ResetArkasset(request *ResetArkassetRequest) (_result *ResetArkassetResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ResetArkassetResponse{}
	_body, _err := client.ResetArkassetEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 更新素材资产信息
//
// Summary: 更新素材资产信息
func (client *Client) ResetArkassetEx(request *ResetArkassetRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ResetArkassetResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ResetArkassetResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.creative.arkasset.reset"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 删除素材资产
//
// Summary: 删除素材资产
func (client *Client) DeleteArkasset(request *DeleteArkassetRequest) (_result *DeleteArkassetResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DeleteArkassetResponse{}
	_body, _err := client.DeleteArkassetEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 删除素材资产
//
// Summary: 删除素材资产
func (client *Client) DeleteArkassetEx(request *DeleteArkassetRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DeleteArkassetResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DeleteArkassetResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.creative.arkasset.delete"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 创建素材资产组合
//
// Summary: 创建素材资产组合
func (client *Client) PushArkassetgroup(request *PushArkassetgroupRequest) (_result *PushArkassetgroupResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PushArkassetgroupResponse{}
	_body, _err := client.PushArkassetgroupEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 创建素材资产组合
//
// Summary: 创建素材资产组合
func (client *Client) PushArkassetgroupEx(request *PushArkassetgroupRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PushArkassetgroupResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PushArkassetgroupResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.creative.arkassetgroup.push"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 查询素材资产组合信息
//
// Summary: 查询素材资产组合信息
func (client *Client) QueryArkassetgroup(request *QueryArkassetgroupRequest) (_result *QueryArkassetgroupResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryArkassetgroupResponse{}
	_body, _err := client.QueryArkassetgroupEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 查询素材资产组合信息
//
// Summary: 查询素材资产组合信息
func (client *Client) QueryArkassetgroupEx(request *QueryArkassetgroupRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryArkassetgroupResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryArkassetgroupResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.creative.arkassetgroup.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 查询素材资产组合列表
//
// Summary: 查询素材资产组合列表
func (client *Client) QueryArkassetgroupList(request *QueryArkassetgroupListRequest) (_result *QueryArkassetgroupListResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryArkassetgroupListResponse{}
	_body, _err := client.QueryArkassetgroupListEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 查询素材资产组合列表
//
// Summary: 查询素材资产组合列表
func (client *Client) QueryArkassetgroupListEx(request *QueryArkassetgroupListRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryArkassetgroupListResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryArkassetgroupListResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.creative.arkassetgroup.list.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 更新素材资产组合信息
//
// Summary: 更新素材资产组合信息
func (client *Client) ResetArkassetgroup(request *ResetArkassetgroupRequest) (_result *ResetArkassetgroupResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ResetArkassetgroupResponse{}
	_body, _err := client.ResetArkassetgroupEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 更新素材资产组合信息
//
// Summary: 更新素材资产组合信息
func (client *Client) ResetArkassetgroupEx(request *ResetArkassetgroupRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ResetArkassetgroupResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ResetArkassetgroupResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.creative.arkassetgroup.reset"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 删除素材资产组
//
// Summary: 删除素材资产组
func (client *Client) DeleteArkassetgroup(request *DeleteArkassetgroupRequest) (_result *DeleteArkassetgroupResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DeleteArkassetgroupResponse{}
	_body, _err := client.DeleteArkassetgroupEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 删除素材资产组
//
// Summary: 删除素材资产组
func (client *Client) DeleteArkassetgroupEx(request *DeleteArkassetgroupRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DeleteArkassetgroupResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DeleteArkassetgroupResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.creative.arkassetgroup.delete"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 创建真人人像素材组
//
// Summary: 创建真人人像素材组
func (client *Client) PushArkassetvisual(request *PushArkassetvisualRequest) (_result *PushArkassetvisualResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PushArkassetvisualResponse{}
	_body, _err := client.PushArkassetvisualEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 创建真人人像素材组
//
// Summary: 创建真人人像素材组
func (client *Client) PushArkassetvisualEx(request *PushArkassetvisualRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PushArkassetvisualResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PushArkassetvisualResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.creative.arkassetvisual.push"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 获取真人 Asset Group ID
//
// Summary: 获取真人 Asset Group ID
func (client *Client) QueryArkassetvisual(request *QueryArkassetvisualRequest) (_result *QueryArkassetvisualResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryArkassetvisualResponse{}
	_body, _err := client.QueryArkassetvisualEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 获取真人 Asset Group ID
//
// Summary: 获取真人 Asset Group ID
func (client *Client) QueryArkassetvisualEx(request *QueryArkassetvisualRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryArkassetvisualResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryArkassetvisualResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.creative.arkassetvisual.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 新增视频生成任务查询接口
//
// Summary: 新增视频生成任务查询接口
func (client *Client) QueryVideogenerationTask(request *QueryVideogenerationTaskRequest) (_result *QueryVideogenerationTaskResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryVideogenerationTaskResponse{}
	_body, _err := client.QueryVideogenerationTaskEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 新增视频生成任务查询接口
//
// Summary: 新增视频生成任务查询接口
func (client *Client) QueryVideogenerationTaskEx(request *QueryVideogenerationTaskRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryVideogenerationTaskResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryVideogenerationTaskResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.creative.videogeneration.task.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
