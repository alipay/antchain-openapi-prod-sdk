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

// 本次搜索的上下文信息
type SearchContext struct {
	// 原始搜索内容
	// example:
	//
	// -
	OriginQuery *string `json:"origin_query,omitempty" xml:"origin_query,omitempty" require:"true"`
	// 实际执行的搜索类型，当前为 web
	// example:
	//
	// web
	SearchType *string `json:"search_type,omitempty" xml:"search_type,omitempty" require:"true"`
	// 实际执行的 AI 上下文档位；当前为 auto，后续可返回 fast 或 pro
	// example:
	//
	// auto
	Mode *string `json:"mode,omitempty" xml:"mode,omitempty" require:"true"`
}

func (s SearchContext) String() string {
	return tea.Prettify(s)
}

func (s SearchContext) GoString() string {
	return s.String()
}

func (s *SearchContext) SetOriginQuery(v string) *SearchContext {
	s.OriginQuery = &v
	return s
}

func (s *SearchContext) SetSearchType(v string) *SearchContext {
	s.SearchType = &v
	return s
}

func (s *SearchContext) SetMode(v string) *SearchContext {
	s.Mode = &v
	return s
}

// 网页搜索结果列表，对应请求中的 search_type=web
type WebItem struct {
	// 搜索结果唯一标识
	// example:
	//
	// -
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 内容唯一标识，用于内容去重与引用
	// example:
	//
	// -
	ContentId *string `json:"content_id,omitempty" xml:"content_id,omitempty" require:"true"`
	// 结果排序位置，从 1 开始
	// example:
	//
	// 1
	SortId *int64 `json:"sort_id,omitempty" xml:"sort_id,omitempty" require:"true"`
	// 结果标题
	// example:
	//
	// -
	Title *string `json:"title,omitempty" xml:"title,omitempty" require:"true"`
	// 来源站点名称
	// example:
	//
	// -
	SiteName *string `json:"site_name,omitempty" xml:"site_name,omitempty"`
	// 网页原文链接；PDF 等无原文链接的结果可能不返回该字段。filter.need_url 为预留参数，当前不生效
	// example:
	//
	// -
	Url *string `json:"url,omitempty" xml:"url,omitempty"`
	// 与 Query 相关的网页摘要，适合模型上下文
	// example:
	//
	// -
	Summary *string `json:"summary,omitempty" xml:"summary,omitempty" require:"true"`
	// 清洗后的网页正文，按 mode 返回；auto 默认返回可用正文，fast 预设不返回，pro 预设按需返回
	// example:
	//
	// -
	Content *string `json:"content,omitempty" xml:"content,omitempty"`
	// 网页发布时间，ISO 8601 格式
	// example:
	//
	// -
	PublishTime *string `json:"publish_time,omitempty" xml:"publish_time,omitempty"`
	// 作者或发布机构
	// example:
	//
	// -
	Author *string `json:"author,omitempty" xml:"author,omitempty"`
	// 来源站点图标链接
	// example:
	//
	// -
	LogoUrl *string `json:"logo_url,omitempty" xml:"logo_url,omitempty"`
	// 随 Content 返回正文实际格式，当前为 text；未返回 Content 时省略
	// example:
	//
	// -
	ContentFormats *string `json:"content_formats,omitempty" xml:"content_formats,omitempty"`
}

func (s WebItem) String() string {
	return tea.Prettify(s)
}

func (s WebItem) GoString() string {
	return s.String()
}

func (s *WebItem) SetId(v string) *WebItem {
	s.Id = &v
	return s
}

func (s *WebItem) SetContentId(v string) *WebItem {
	s.ContentId = &v
	return s
}

func (s *WebItem) SetSortId(v int64) *WebItem {
	s.SortId = &v
	return s
}

func (s *WebItem) SetTitle(v string) *WebItem {
	s.Title = &v
	return s
}

func (s *WebItem) SetSiteName(v string) *WebItem {
	s.SiteName = &v
	return s
}

func (s *WebItem) SetUrl(v string) *WebItem {
	s.Url = &v
	return s
}

func (s *WebItem) SetSummary(v string) *WebItem {
	s.Summary = &v
	return s
}

func (s *WebItem) SetContent(v string) *WebItem {
	s.Content = &v
	return s
}

func (s *WebItem) SetPublishTime(v string) *WebItem {
	s.PublishTime = &v
	return s
}

func (s *WebItem) SetAuthor(v string) *WebItem {
	s.Author = &v
	return s
}

func (s *WebItem) SetLogoUrl(v string) *WebItem {
	s.LogoUrl = &v
	return s
}

func (s *WebItem) SetContentFormats(v string) *WebItem {
	s.ContentFormats = &v
	return s
}

// 请求成功时返回搜索结果
type Result struct {
	// WebResults 实际返回的网页结果数量
	// example:
	//
	// 10
	ResultCount *int64 `json:"result_count,omitempty" xml:"result_count,omitempty" require:"true"`
	// 网页搜索结果列表，对应请求中的 search_type=web
	// example:
	//
	// undefined
	WebResults []*WebItem `json:"web_results,omitempty" xml:"web_results,omitempty" require:"true" type:"Repeated"`
	// 本次搜索的上下文信息
	// example:
	//
	// undefined
	SearchContext *SearchContext `json:"search_context,omitempty" xml:"search_context,omitempty" require:"true"`
}

func (s Result) String() string {
	return tea.Prettify(s)
}

func (s Result) GoString() string {
	return s.String()
}

func (s *Result) SetResultCount(v int64) *Result {
	s.ResultCount = &v
	return s
}

func (s *Result) SetWebResults(v []*WebItem) *Result {
	s.WebResults = v
	return s
}

func (s *Result) SetSearchContext(v *SearchContext) *Result {
	s.SearchContext = v
	return s
}

// 统一响应元信息
type ResponseMetadata struct {
	// 请求关联标识；优先回显合法 X-Request-Id，缺失或非法时由服务端生成；不用于幂等或去重
	// example:
	//
	// -
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty" require:"true"`
	// 接口版本
	// example:
	//
	// v1
	Version *string `json:"version,omitempty" xml:"version,omitempty" require:"true"`
	// 服务区域
	// example:
	//
	// cn-xx
	Region *string `json:"region,omitempty" xml:"region,omitempty" require:"true"`
	// 请求处理耗时，单位为毫秒
	// example:
	//
	// 1000
	TimeCost *int64 `json:"time_cost,omitempty" xml:"time_cost,omitempty" require:"true"`
}

func (s ResponseMetadata) String() string {
	return tea.Prettify(s)
}

func (s ResponseMetadata) GoString() string {
	return s.String()
}

func (s *ResponseMetadata) SetRequestId(v string) *ResponseMetadata {
	s.RequestId = &v
	return s
}

func (s *ResponseMetadata) SetVersion(v string) *ResponseMetadata {
	s.Version = &v
	return s
}

func (s *ResponseMetadata) SetRegion(v string) *ResponseMetadata {
	s.Region = &v
	return s
}

func (s *ResponseMetadata) SetTimeCost(v int64) *ResponseMetadata {
	s.TimeCost = &v
	return s
}

// 搜索结果过滤条件
type FilterModel struct {
	// 仅搜索指定网站。例如 ["gov.cn"] 表示只返回该域名下的内容；填写域名，不包含协议和路径
	// example:
	//
	// ["gov.cn"]
	IncludeDomains []*string `json:"include_domains,omitempty" xml:"include_domains,omitempty" type:"Repeated"`
	// 排除指定网站；填写域名，不包含协议和路径
	// example:
	//
	// undefined
	ExcludeDomains []*string `json:"exclude_domains,omitempty" xml:"exclude_domains,omitempty" type:"Repeated"`
	// 预留。计划用于按发布时间筛选，当前不生效
	// example:
	//
	// -
	TimeRange *string `json:"time_range,omitempty" xml:"time_range,omitempty"`
	// 是否同时查询行业垂类数据接口；命中结果通过 Result.IndustryData 独立返回
	// example:
	//
	// true
	NeedUrl *bool `json:"need_url,omitempty" xml:"need_url,omitempty"`
	// 预留。计划支持 news 等网页搜索领域，当前不生效
	// example:
	//
	// -
	Industry *string `json:"industry,omitempty" xml:"industry,omitempty"`
}

func (s FilterModel) String() string {
	return tea.Prettify(s)
}

func (s FilterModel) GoString() string {
	return s.String()
}

func (s *FilterModel) SetIncludeDomains(v []*string) *FilterModel {
	s.IncludeDomains = v
	return s
}

func (s *FilterModel) SetExcludeDomains(v []*string) *FilterModel {
	s.ExcludeDomains = v
	return s
}

func (s *FilterModel) SetTimeRange(v string) *FilterModel {
	s.TimeRange = &v
	return s
}

func (s *FilterModel) SetNeedUrl(v bool) *FilterModel {
	s.NeedUrl = &v
	return s
}

func (s *FilterModel) SetIndustry(v string) *FilterModel {
	s.Industry = &v
	return s
}

// 网页读取与正文解析成功时返回
type FetchResult struct {
	// 本次 Fetch 结果唯一标识
	// example:
	//
	// fetch_req_b24edf30205c491b97ef1500a405b961
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 内容唯一标识，用于内容去重与引用
	// example:
	//
	// compensatory_e81c1f5749545c5f7d247b3a100ffe62
	ContentId *string `json:"content_id,omitempty" xml:"content_id,omitempty" require:"true"`
	// 原始网页链接
	// example:
	//
	// -
	Url *string `json:"url,omitempty" xml:"url,omitempty" require:"true"`
	// 网页标题
	// example:
	//
	// -
	Title *string `json:"title,omitempty" xml:"title,omitempty"`
	// 来源站点名称
	// example:
	//
	// -
	SiteName *string `json:"site_name,omitempty" xml:"site_name,omitempty"`
	// 网页声明的内容描述；来源于页面公开元信息，不是模型生成摘要
	// example:
	//
	// -
	Description *string `json:"description,omitempty" xml:"description,omitempty"`
	// 清洗后的网页主要正文
	// example:
	//
	// -
	Content *string `json:"content,omitempty" xml:"content,omitempty"`
	// 内容发布时间，ISO 8601 格式
	// example:
	//
	// -
	PublishTime *string `json:"publish_time,omitempty" xml:"publish_time,omitempty"`
	// 作者或发布机构
	// example:
	//
	// -
	Author *string `json:"author,omitempty" xml:"author,omitempty"`
	// 来源站点 Logo 链接
	// example:
	//
	// -
	LogoUrl *string `json:"logo_url,omitempty" xml:"logo_url,omitempty"`
	// 正文实际输出格式：text 或 markdown
	// example:
	//
	// text
	ContentFormats *string `json:"content_formats,omitempty" xml:"content_formats,omitempty"`
}

func (s FetchResult) String() string {
	return tea.Prettify(s)
}

func (s FetchResult) GoString() string {
	return s.String()
}

func (s *FetchResult) SetId(v string) *FetchResult {
	s.Id = &v
	return s
}

func (s *FetchResult) SetContentId(v string) *FetchResult {
	s.ContentId = &v
	return s
}

func (s *FetchResult) SetUrl(v string) *FetchResult {
	s.Url = &v
	return s
}

func (s *FetchResult) SetTitle(v string) *FetchResult {
	s.Title = &v
	return s
}

func (s *FetchResult) SetSiteName(v string) *FetchResult {
	s.SiteName = &v
	return s
}

func (s *FetchResult) SetDescription(v string) *FetchResult {
	s.Description = &v
	return s
}

func (s *FetchResult) SetContent(v string) *FetchResult {
	s.Content = &v
	return s
}

func (s *FetchResult) SetPublishTime(v string) *FetchResult {
	s.PublishTime = &v
	return s
}

func (s *FetchResult) SetAuthor(v string) *FetchResult {
	s.Author = &v
	return s
}

func (s *FetchResult) SetLogoUrl(v string) *FetchResult {
	s.LogoUrl = &v
	return s
}

func (s *FetchResult) SetContentFormats(v string) *FetchResult {
	s.ContentFormats = &v
	return s
}

// 行业数据检索结果列表；命中时返回，支持多个结果，一般仅返回 1 个
type IndustryDataItem struct {
	// 行业数据标题
	// example:
	//
	// -
	Title *string `json:"title,omitempty" xml:"title,omitempty" require:"true"`
	// 行业数据类型及结构标识，用于确定 CardData 的字段结构
	// example:
	//
	// -
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 行业结构化数据，字段随 Type 定义
	// example:
	//
	// -
	Result *string `json:"result,omitempty" xml:"result,omitempty" require:"true"`
}

func (s IndustryDataItem) String() string {
	return tea.Prettify(s)
}

func (s IndustryDataItem) GoString() string {
	return s.String()
}

func (s *IndustryDataItem) SetTitle(v string) *IndustryDataItem {
	s.Title = &v
	return s
}

func (s *IndustryDataItem) SetType(v string) *IndustryDataItem {
	s.Type = &v
	return s
}

func (s *IndustryDataItem) SetResult(v string) *IndustryDataItem {
	s.Result = &v
	return s
}

type QueryMcpGetcurtimeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s QueryMcpGetcurtimeRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryMcpGetcurtimeRequest) GoString() string {
	return s.String()
}

func (s *QueryMcpGetcurtimeRequest) SetAuthToken(v string) *QueryMcpGetcurtimeRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryMcpGetcurtimeRequest) SetProductInstanceId(v string) *QueryMcpGetcurtimeRequest {
	s.ProductInstanceId = &v
	return s
}

type QueryMcpGetcurtimeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 当前日期时间
	Datetime *string `json:"datetime,omitempty" xml:"datetime,omitempty"`
	// 周几
	WeekDay *string `json:"week_day,omitempty" xml:"week_day,omitempty"`
	// 是否交易日
	IfTradingDay *string `json:"if_trading_day,omitempty" xml:"if_trading_day,omitempty"`
	// 是否周最后交易日
	IfWeekEnd *string `json:"if_week_end,omitempty" xml:"if_week_end,omitempty"`
	// 是否月最后交易日
	IfMonthEnd *string `json:"if_month_end,omitempty" xml:"if_month_end,omitempty"`
	// 是否季最后交易日
	IfQuarterEnd *string `json:"if_quarter_end,omitempty" xml:"if_quarter_end,omitempty"`
	// 是否年最后交易日
	IfYearEnd *string `json:"if_year_end,omitempty" xml:"if_year_end,omitempty"`
}

func (s QueryMcpGetcurtimeResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryMcpGetcurtimeResponse) GoString() string {
	return s.String()
}

func (s *QueryMcpGetcurtimeResponse) SetReqMsgId(v string) *QueryMcpGetcurtimeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryMcpGetcurtimeResponse) SetResultCode(v string) *QueryMcpGetcurtimeResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryMcpGetcurtimeResponse) SetResultMsg(v string) *QueryMcpGetcurtimeResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryMcpGetcurtimeResponse) SetDatetime(v string) *QueryMcpGetcurtimeResponse {
	s.Datetime = &v
	return s
}

func (s *QueryMcpGetcurtimeResponse) SetWeekDay(v string) *QueryMcpGetcurtimeResponse {
	s.WeekDay = &v
	return s
}

func (s *QueryMcpGetcurtimeResponse) SetIfTradingDay(v string) *QueryMcpGetcurtimeResponse {
	s.IfTradingDay = &v
	return s
}

func (s *QueryMcpGetcurtimeResponse) SetIfWeekEnd(v string) *QueryMcpGetcurtimeResponse {
	s.IfWeekEnd = &v
	return s
}

func (s *QueryMcpGetcurtimeResponse) SetIfMonthEnd(v string) *QueryMcpGetcurtimeResponse {
	s.IfMonthEnd = &v
	return s
}

func (s *QueryMcpGetcurtimeResponse) SetIfQuarterEnd(v string) *QueryMcpGetcurtimeResponse {
	s.IfQuarterEnd = &v
	return s
}

func (s *QueryMcpGetcurtimeResponse) SetIfYearEnd(v string) *QueryMcpGetcurtimeResponse {
	s.IfYearEnd = &v
	return s
}

type QueryMcpAssetRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 板块名称
	PlateObject *string `json:"plate_object,omitempty" xml:"plate_object,omitempty" require:"true"`
}

func (s QueryMcpAssetRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryMcpAssetRequest) GoString() string {
	return s.String()
}

func (s *QueryMcpAssetRequest) SetAuthToken(v string) *QueryMcpAssetRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryMcpAssetRequest) SetProductInstanceId(v string) *QueryMcpAssetRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryMcpAssetRequest) SetPlateObject(v string) *QueryMcpAssetRequest {
	s.PlateObject = &v
	return s
}

type QueryMcpAssetResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 资产类别
	AssetType *string `json:"asset_type,omitempty" xml:"asset_type,omitempty"`
	// 资产名称
	AssetName *string `json:"asset_name,omitempty" xml:"asset_name,omitempty"`
	// 跟踪指数代码
	TrackIndexCode *string `json:"track_index_code,omitempty" xml:"track_index_code,omitempty"`
	// 跟踪指数简称
	TrackIndexAbbr *string `json:"track_index_abbr,omitempty" xml:"track_index_abbr,omitempty"`
	// 排序
	SortOrder *int64 `json:"sort_order,omitempty" xml:"sort_order,omitempty"`
}

func (s QueryMcpAssetResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryMcpAssetResponse) GoString() string {
	return s.String()
}

func (s *QueryMcpAssetResponse) SetReqMsgId(v string) *QueryMcpAssetResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryMcpAssetResponse) SetResultCode(v string) *QueryMcpAssetResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryMcpAssetResponse) SetResultMsg(v string) *QueryMcpAssetResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryMcpAssetResponse) SetAssetType(v string) *QueryMcpAssetResponse {
	s.AssetType = &v
	return s
}

func (s *QueryMcpAssetResponse) SetAssetName(v string) *QueryMcpAssetResponse {
	s.AssetName = &v
	return s
}

func (s *QueryMcpAssetResponse) SetTrackIndexCode(v string) *QueryMcpAssetResponse {
	s.TrackIndexCode = &v
	return s
}

func (s *QueryMcpAssetResponse) SetTrackIndexAbbr(v string) *QueryMcpAssetResponse {
	s.TrackIndexAbbr = &v
	return s
}

func (s *QueryMcpAssetResponse) SetSortOrder(v int64) *QueryMcpAssetResponse {
	s.SortOrder = &v
	return s
}

type QueryAntsearchSearchRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 搜索内容，不能为空；建议不超过 200 个字符
	Query *string `json:"query,omitempty" xml:"query,omitempty" require:"true"`
	// AI 上下文档位，协议预设 fast、auto、pro，用于控制检索深度、内容密度和 Token 规模；当前仅支持 auto，传入其他值将返回参数错误
	Mode *string `json:"mode,omitempty" xml:"mode,omitempty"`
	// 搜索类型，当前仅支持 web；后续可扩展 image
	SearchType *string `json:"search_type,omitempty" xml:"search_type,omitempty"`
	// 网页结果最大返回数量，取值范围 1～30；不包含 IndustryData
	Count *int64 `json:"count,omitempty" xml:"count,omitempty"`
	// 正文格式。当前支持 text；markdown 为预留值，暂不支持
	ContentFormat *string `json:"content_format,omitempty" xml:"content_format,omitempty"`
	// 仅搜索指定网站。例如gov.cn表示只返回该域名下的内容；填写域名，不包含协议和路径,如果有多个，使用英文逗号(,)隔开
	FilterIncludeDomains *string `json:"filter_include_domains,omitempty" xml:"filter_include_domains,omitempty"`
	// 排除指定网站；填写域名，不包含协议和路径,如果有多个，使用英文逗号(,)隔开
	FilterExcludeDomains *string `json:"filter_exclude_domains,omitempty" xml:"filter_exclude_domains,omitempty"`
	// 预留。计划用于按发布时间筛选，当前不生效
	FilterTimeRange *string `json:"filter_time_range,omitempty" xml:"filter_time_range,omitempty"`
	// 是否同时查询行业垂类数据接口；命中结果通过 Result.IndustryData 独立返回
	FilterNeedUrl *bool `json:"filter_need_url,omitempty" xml:"filter_need_url,omitempty"`
	// 预留。计划支持 news 等网页搜索领域，当前不生效
	FilterIndustry *string `json:"filter_industry,omitempty" xml:"filter_industry,omitempty"`
	// 是否返回 IndustryData
	FilterEnableIndustryDataSearch *bool `json:"filter_enable_industry_data_search,omitempty" xml:"filter_enable_industry_data_search,omitempty"`
}

func (s QueryAntsearchSearchRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAntsearchSearchRequest) GoString() string {
	return s.String()
}

func (s *QueryAntsearchSearchRequest) SetAuthToken(v string) *QueryAntsearchSearchRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAntsearchSearchRequest) SetProductInstanceId(v string) *QueryAntsearchSearchRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAntsearchSearchRequest) SetQuery(v string) *QueryAntsearchSearchRequest {
	s.Query = &v
	return s
}

func (s *QueryAntsearchSearchRequest) SetMode(v string) *QueryAntsearchSearchRequest {
	s.Mode = &v
	return s
}

func (s *QueryAntsearchSearchRequest) SetSearchType(v string) *QueryAntsearchSearchRequest {
	s.SearchType = &v
	return s
}

func (s *QueryAntsearchSearchRequest) SetCount(v int64) *QueryAntsearchSearchRequest {
	s.Count = &v
	return s
}

func (s *QueryAntsearchSearchRequest) SetContentFormat(v string) *QueryAntsearchSearchRequest {
	s.ContentFormat = &v
	return s
}

func (s *QueryAntsearchSearchRequest) SetFilterIncludeDomains(v string) *QueryAntsearchSearchRequest {
	s.FilterIncludeDomains = &v
	return s
}

func (s *QueryAntsearchSearchRequest) SetFilterExcludeDomains(v string) *QueryAntsearchSearchRequest {
	s.FilterExcludeDomains = &v
	return s
}

func (s *QueryAntsearchSearchRequest) SetFilterTimeRange(v string) *QueryAntsearchSearchRequest {
	s.FilterTimeRange = &v
	return s
}

func (s *QueryAntsearchSearchRequest) SetFilterNeedUrl(v bool) *QueryAntsearchSearchRequest {
	s.FilterNeedUrl = &v
	return s
}

func (s *QueryAntsearchSearchRequest) SetFilterIndustry(v string) *QueryAntsearchSearchRequest {
	s.FilterIndustry = &v
	return s
}

func (s *QueryAntsearchSearchRequest) SetFilterEnableIndustryDataSearch(v bool) *QueryAntsearchSearchRequest {
	s.FilterEnableIndustryDataSearch = &v
	return s
}

type QueryAntsearchSearchResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 统一响应元信息
	ResponseMetadata *ResponseMetadata `json:"response_metadata,omitempty" xml:"response_metadata,omitempty"`
	// 本次的搜索结果
	Result *Result `json:"result,omitempty" xml:"result,omitempty"`
	// 行业数据检索结果列表；命中时返回，支持多个结果，一般仅返回 1 个
	IndustryData []*IndustryDataItem `json:"industry_data,omitempty" xml:"industry_data,omitempty" type:"Repeated"`
}

func (s QueryAntsearchSearchResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAntsearchSearchResponse) GoString() string {
	return s.String()
}

func (s *QueryAntsearchSearchResponse) SetReqMsgId(v string) *QueryAntsearchSearchResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAntsearchSearchResponse) SetResultCode(v string) *QueryAntsearchSearchResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAntsearchSearchResponse) SetResultMsg(v string) *QueryAntsearchSearchResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAntsearchSearchResponse) SetResponseMetadata(v *ResponseMetadata) *QueryAntsearchSearchResponse {
	s.ResponseMetadata = v
	return s
}

func (s *QueryAntsearchSearchResponse) SetResult(v *Result) *QueryAntsearchSearchResponse {
	s.Result = v
	return s
}

func (s *QueryAntsearchSearchResponse) SetIndustryData(v []*IndustryDataItem) *QueryAntsearchSearchResponse {
	s.IndustryData = v
	return s
}

type QueryAntsearchFetchRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 需要读取的公开网页 URL。每次请求仅支持一个 URL，协议须为 http 或 https
	Url *string `json:"url,omitempty" xml:"url,omitempty" require:"true"`
	// 正文输出格式：text 或 markdown
	ContentFormat *string `json:"content_format,omitempty" xml:"content_format,omitempty"`
	// 网页读取最大等待时间，单位为秒，取值范围 1～60；超时后返回 IsSuccess=false 和 ErrorCode=FETCH_TIMEOUT
	Timeout *int64 `json:"timeout,omitempty" xml:"timeout,omitempty"`
}

func (s QueryAntsearchFetchRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAntsearchFetchRequest) GoString() string {
	return s.String()
}

func (s *QueryAntsearchFetchRequest) SetAuthToken(v string) *QueryAntsearchFetchRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAntsearchFetchRequest) SetProductInstanceId(v string) *QueryAntsearchFetchRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAntsearchFetchRequest) SetUrl(v string) *QueryAntsearchFetchRequest {
	s.Url = &v
	return s
}

func (s *QueryAntsearchFetchRequest) SetContentFormat(v string) *QueryAntsearchFetchRequest {
	s.ContentFormat = &v
	return s
}

func (s *QueryAntsearchFetchRequest) SetTimeout(v int64) *QueryAntsearchFetchRequest {
	s.Timeout = &v
	return s
}

type QueryAntsearchFetchResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 网页读取和正文解析是否成功
	IsSuccess *bool `json:"is_success,omitempty" xml:"is_success,omitempty"`
	// 失败原因标识，仅失败时返回
	ErrorCode *string `json:"error_code,omitempty" xml:"error_code,omitempty"`
	// 可读的失败原因，仅失败时返回
	ErrorMessage *string `json:"error_message,omitempty" xml:"error_message,omitempty"`
	// 请求元信息
	ResponseMetadata *ResponseMetadata `json:"response_metadata,omitempty" xml:"response_metadata,omitempty"`
	// 网页读取与正文解析成功时返回
	Result *FetchResult `json:"result,omitempty" xml:"result,omitempty"`
}

func (s QueryAntsearchFetchResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAntsearchFetchResponse) GoString() string {
	return s.String()
}

func (s *QueryAntsearchFetchResponse) SetReqMsgId(v string) *QueryAntsearchFetchResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAntsearchFetchResponse) SetResultCode(v string) *QueryAntsearchFetchResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAntsearchFetchResponse) SetResultMsg(v string) *QueryAntsearchFetchResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAntsearchFetchResponse) SetIsSuccess(v bool) *QueryAntsearchFetchResponse {
	s.IsSuccess = &v
	return s
}

func (s *QueryAntsearchFetchResponse) SetErrorCode(v string) *QueryAntsearchFetchResponse {
	s.ErrorCode = &v
	return s
}

func (s *QueryAntsearchFetchResponse) SetErrorMessage(v string) *QueryAntsearchFetchResponse {
	s.ErrorMessage = &v
	return s
}

func (s *QueryAntsearchFetchResponse) SetResponseMetadata(v *ResponseMetadata) *QueryAntsearchFetchResponse {
	s.ResponseMetadata = v
	return s
}

func (s *QueryAntsearchFetchResponse) SetResult(v *FetchResult) *QueryAntsearchFetchResponse {
	s.Result = v
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
				"sdk_version":      tea.String("1.0.8"),
				"_prod_code":       tea.String("FINMATERIAL"),
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
// Description: 获取当前时间
//
// Summary: 获取当前时间
func (client *Client) QueryMcpGetcurtime(request *QueryMcpGetcurtimeRequest) (_result *QueryMcpGetcurtimeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryMcpGetcurtimeResponse{}
	_body, _err := client.QueryMcpGetcurtimeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 获取当前时间
//
// Summary: 获取当前时间
func (client *Client) QueryMcpGetcurtimeEx(request *QueryMcpGetcurtimeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryMcpGetcurtimeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryMcpGetcurtimeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.finmaterial.mcp.getcurtime.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 查询板块信息
//
// Summary: 查询板块信息
func (client *Client) QueryMcpAsset(request *QueryMcpAssetRequest) (_result *QueryMcpAssetResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryMcpAssetResponse{}
	_body, _err := client.QueryMcpAssetEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 查询板块信息
//
// Summary: 查询板块信息
func (client *Client) QueryMcpAssetEx(request *QueryMcpAssetRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryMcpAssetResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryMcpAssetResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.finmaterial.mcp.asset.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 全网搜主搜接口
//
// Summary: 全网搜主搜接口
func (client *Client) QueryAntsearchSearch(request *QueryAntsearchSearchRequest) (_result *QueryAntsearchSearchResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAntsearchSearchResponse{}
	_body, _err := client.QueryAntsearchSearchEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 全网搜主搜接口
//
// Summary: 全网搜主搜接口
func (client *Client) QueryAntsearchSearchEx(request *QueryAntsearchSearchRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAntsearchSearchResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAntsearchSearchResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.finmaterial.antsearch.search.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: Fetch API 适用于搜索结果补全、网页阅读、知识入库、引用核验和 Agent 工具调用。
//
// Summary: Fetch API 适用于搜索结果补全、网页阅读、知识入库、引用核验和 Agent 工具调用。
func (client *Client) QueryAntsearchFetch(request *QueryAntsearchFetchRequest) (_result *QueryAntsearchFetchResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAntsearchFetchResponse{}
	_body, _err := client.QueryAntsearchFetchEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: Fetch API 适用于搜索结果补全、网页阅读、知识入库、引用核验和 Agent 工具调用。
//
// Summary: Fetch API 适用于搜索结果补全、网页阅读、知识入库、引用核验和 Agent 工具调用。
func (client *Client) QueryAntsearchFetchEx(request *QueryAntsearchFetchRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAntsearchFetchResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAntsearchFetchResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.finmaterial.antsearch.fetch.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
