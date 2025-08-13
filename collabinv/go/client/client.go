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

// 聊天消息
type ChatMessageInfo struct {
	// 会话ID
	SessionId *string `json:"session_id,omitempty" xml:"session_id,omitempty" require:"true"`
	// 提问内容
	Query *string `json:"query,omitempty" xml:"query,omitempty"`
	// 恢复内容
	Answer *string `json:"answer,omitempty" xml:"answer,omitempty"`
	// 创建时间
	CreateDate *string `json:"create_date,omitempty" xml:"create_date,omitempty" require:"true"`
}

func (s ChatMessageInfo) String() string {
	return tea.Prettify(s)
}

func (s ChatMessageInfo) GoString() string {
	return s.String()
}

func (s *ChatMessageInfo) SetSessionId(v string) *ChatMessageInfo {
	s.SessionId = &v
	return s
}

func (s *ChatMessageInfo) SetQuery(v string) *ChatMessageInfo {
	s.Query = &v
	return s
}

func (s *ChatMessageInfo) SetAnswer(v string) *ChatMessageInfo {
	s.Answer = &v
	return s
}

func (s *ChatMessageInfo) SetCreateDate(v string) *ChatMessageInfo {
	s.CreateDate = &v
	return s
}

// 消费行业数据
type IndustryData struct {
	// 行业
	Industry *string `json:"industry,omitempty" xml:"industry,omitempty" require:"true"`
	// 区域
	Province *string `json:"province,omitempty" xml:"province,omitempty" require:"true"`
	// 日期
	TradeDate *string `json:"trade_date,omitempty" xml:"trade_date,omitempty" require:"true"`
	// 线上线下 1:线下，0:线上，-1:全部
	OfpType *string `json:"ofp_type,omitempty" xml:"ofp_type,omitempty" require:"true"`
	// 消费规模指数(销售金额)
	TradeScale *string `json:"trade_scale,omitempty" xml:"trade_scale,omitempty" require:"true"`
	// 交易活跃指数(次数)
	TradeActivity *string `json:"trade_activity,omitempty" xml:"trade_activity,omitempty" require:"true"`
	// 消费价值指数(金额/次数)
	TradeValue *string `json:"trade_value,omitempty" xml:"trade_value,omitempty" require:"true"`
	// 交易覆盖指数(去重人数)
	TradeCoverage *string `json:"trade_coverage,omitempty" xml:"trade_coverage,omitempty" require:"true"`
}

func (s IndustryData) String() string {
	return tea.Prettify(s)
}

func (s IndustryData) GoString() string {
	return s.String()
}

func (s *IndustryData) SetIndustry(v string) *IndustryData {
	s.Industry = &v
	return s
}

func (s *IndustryData) SetProvince(v string) *IndustryData {
	s.Province = &v
	return s
}

func (s *IndustryData) SetTradeDate(v string) *IndustryData {
	s.TradeDate = &v
	return s
}

func (s *IndustryData) SetOfpType(v string) *IndustryData {
	s.OfpType = &v
	return s
}

func (s *IndustryData) SetTradeScale(v string) *IndustryData {
	s.TradeScale = &v
	return s
}

func (s *IndustryData) SetTradeActivity(v string) *IndustryData {
	s.TradeActivity = &v
	return s
}

func (s *IndustryData) SetTradeValue(v string) *IndustryData {
	s.TradeValue = &v
	return s
}

func (s *IndustryData) SetTradeCoverage(v string) *IndustryData {
	s.TradeCoverage = &v
	return s
}

// agent会话信息
type ChatConversationInfo struct {
	// 会话ID
	SessionId *string `json:"session_id,omitempty" xml:"session_id,omitempty" require:"true"`
	// 用户ID
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
	// agent ID
	AgentId *string `json:"agent_id,omitempty" xml:"agent_id,omitempty" require:"true"`
	// 会话名称
	Title *string `json:"title,omitempty" xml:"title,omitempty"`
	// 创建时间
	CreateDate *string `json:"create_date,omitempty" xml:"create_date,omitempty" require:"true"`
}

func (s ChatConversationInfo) String() string {
	return tea.Prettify(s)
}

func (s ChatConversationInfo) GoString() string {
	return s.String()
}

func (s *ChatConversationInfo) SetSessionId(v string) *ChatConversationInfo {
	s.SessionId = &v
	return s
}

func (s *ChatConversationInfo) SetUserId(v string) *ChatConversationInfo {
	s.UserId = &v
	return s
}

func (s *ChatConversationInfo) SetAgentId(v string) *ChatConversationInfo {
	s.AgentId = &v
	return s
}

func (s *ChatConversationInfo) SetTitle(v string) *ChatConversationInfo {
	s.Title = &v
	return s
}

func (s *ChatConversationInfo) SetCreateDate(v string) *ChatConversationInfo {
	s.CreateDate = &v
	return s
}

// 特征集信息
type FeatureSetInfo struct {
	// 特征集编码
	FeaturesetCode *string `json:"featureset_code,omitempty" xml:"featureset_code,omitempty" require:"true"`
	// 名称
	FeaturesetName *string `json:"featureset_name,omitempty" xml:"featureset_name,omitempty" require:"true"`
	// 数量
	Nums *string `json:"nums,omitempty" xml:"nums,omitempty" require:"true"`
	// 描述
	Desc *string `json:"desc,omitempty" xml:"desc,omitempty" require:"true"`
}

func (s FeatureSetInfo) String() string {
	return tea.Prettify(s)
}

func (s FeatureSetInfo) GoString() string {
	return s.String()
}

func (s *FeatureSetInfo) SetFeaturesetCode(v string) *FeatureSetInfo {
	s.FeaturesetCode = &v
	return s
}

func (s *FeatureSetInfo) SetFeaturesetName(v string) *FeatureSetInfo {
	s.FeaturesetName = &v
	return s
}

func (s *FeatureSetInfo) SetNums(v string) *FeatureSetInfo {
	s.Nums = &v
	return s
}

func (s *FeatureSetInfo) SetDesc(v string) *FeatureSetInfo {
	s.Desc = &v
	return s
}

// 指标数据
type IndexData struct {
	// 月份
	//
	Month *string `json:"month,omitempty" xml:"month,omitempty" require:"true"`
	// 高低线
	CityTier *string `json:"city_tier,omitempty" xml:"city_tier,omitempty" require:"true"`
	// 省份编码
	ProvinceCode *string `json:"province_code,omitempty" xml:"province_code,omitempty" require:"true"`
	// 总交易笔数指数
	TotalCnt *string `json:"total_cnt,omitempty" xml:"total_cnt,omitempty" require:"true"`
	// 总交易金额指数
	TotalAmt *string `json:"total_amt,omitempty" xml:"total_amt,omitempty" require:"true"`
	// 总店铺数指数
	TotalShop *string `json:"total_shop,omitempty" xml:"total_shop,omitempty" require:"true"`
	// 去重用户数指数
	TotalCsm *string `json:"total_csm,omitempty" xml:"total_csm,omitempty" require:"true"`
	// 其中老店店铺总交易笔数指数
	ExistingCnt *string `json:"existing_cnt,omitempty" xml:"existing_cnt,omitempty" require:"true"`
	// 其中老店店铺总交易金额
	ExistingAmt *string `json:"existing_amt,omitempty" xml:"existing_amt,omitempty" require:"true"`
	// 其中老店店铺数量指数
	ExistingShop *string `json:"existing_shop,omitempty" xml:"existing_shop,omitempty" require:"true"`
	// 当月新增店铺数指数
	NewShop *string `json:"new_shop,omitempty" xml:"new_shop,omitempty" require:"true"`
	// 分金额段指数
	AmtRange *string `json:"amt_range,omitempty" xml:"amt_range,omitempty" require:"true"`
	// 店铺标签指数
	ShopTag *string `json:"shop_tag,omitempty" xml:"shop_tag,omitempty" require:"true"`
	// 品牌码
	BrandCode *string `json:"brand_code,omitempty" xml:"brand_code,omitempty" require:"true"`
	// 同店上年同期评分
	ExistingAmtLastYear *string `json:"existing_amt_last_year,omitempty" xml:"existing_amt_last_year,omitempty" require:"true"`
	// 年月日
	Date *string `json:"date,omitempty" xml:"date,omitempty" require:"true"`
}

func (s IndexData) String() string {
	return tea.Prettify(s)
}

func (s IndexData) GoString() string {
	return s.String()
}

func (s *IndexData) SetMonth(v string) *IndexData {
	s.Month = &v
	return s
}

func (s *IndexData) SetCityTier(v string) *IndexData {
	s.CityTier = &v
	return s
}

func (s *IndexData) SetProvinceCode(v string) *IndexData {
	s.ProvinceCode = &v
	return s
}

func (s *IndexData) SetTotalCnt(v string) *IndexData {
	s.TotalCnt = &v
	return s
}

func (s *IndexData) SetTotalAmt(v string) *IndexData {
	s.TotalAmt = &v
	return s
}

func (s *IndexData) SetTotalShop(v string) *IndexData {
	s.TotalShop = &v
	return s
}

func (s *IndexData) SetTotalCsm(v string) *IndexData {
	s.TotalCsm = &v
	return s
}

func (s *IndexData) SetExistingCnt(v string) *IndexData {
	s.ExistingCnt = &v
	return s
}

func (s *IndexData) SetExistingAmt(v string) *IndexData {
	s.ExistingAmt = &v
	return s
}

func (s *IndexData) SetExistingShop(v string) *IndexData {
	s.ExistingShop = &v
	return s
}

func (s *IndexData) SetNewShop(v string) *IndexData {
	s.NewShop = &v
	return s
}

func (s *IndexData) SetAmtRange(v string) *IndexData {
	s.AmtRange = &v
	return s
}

func (s *IndexData) SetShopTag(v string) *IndexData {
	s.ShopTag = &v
	return s
}

func (s *IndexData) SetBrandCode(v string) *IndexData {
	s.BrandCode = &v
	return s
}

func (s *IndexData) SetExistingAmtLastYear(v string) *IndexData {
	s.ExistingAmtLastYear = &v
	return s
}

func (s *IndexData) SetDate(v string) *IndexData {
	s.Date = &v
	return s
}

// 调用统计
type GwCallDataStats struct {
	// 租户
	InvokeTenant *string `json:"invoke_tenant,omitempty" xml:"invoke_tenant,omitempty"`
	// 租户ID
	InvokeTenantId *string `json:"invoke_tenant_id,omitempty" xml:"invoke_tenant_id,omitempty"`
	// 公key
	AccessKey *string `json:"access_key,omitempty" xml:"access_key,omitempty"`
	// 调用数量
	InvokeCount *string `json:"invoke_count,omitempty" xml:"invoke_count,omitempty"`
	// 调用查得统计
	SuccessCount *string `json:"success_count,omitempty" xml:"success_count,omitempty"`
	// id
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true"`
}

func (s GwCallDataStats) String() string {
	return tea.Prettify(s)
}

func (s GwCallDataStats) GoString() string {
	return s.String()
}

func (s *GwCallDataStats) SetInvokeTenant(v string) *GwCallDataStats {
	s.InvokeTenant = &v
	return s
}

func (s *GwCallDataStats) SetInvokeTenantId(v string) *GwCallDataStats {
	s.InvokeTenantId = &v
	return s
}

func (s *GwCallDataStats) SetAccessKey(v string) *GwCallDataStats {
	s.AccessKey = &v
	return s
}

func (s *GwCallDataStats) SetInvokeCount(v string) *GwCallDataStats {
	s.InvokeCount = &v
	return s
}

func (s *GwCallDataStats) SetSuccessCount(v string) *GwCallDataStats {
	s.SuccessCount = &v
	return s
}

func (s *GwCallDataStats) SetId(v string) *GwCallDataStats {
	s.Id = &v
	return s
}

// 分页信息
type PageInfo struct {
	// 总数量
	Total *int64 `json:"total,omitempty" xml:"total,omitempty"`
	// 当前页
	PageIndex *int64 `json:"page_index,omitempty" xml:"page_index,omitempty" require:"true"`
	// 页容量
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
}

func (s PageInfo) String() string {
	return tea.Prettify(s)
}

func (s PageInfo) GoString() string {
	return s.String()
}

func (s *PageInfo) SetTotal(v int64) *PageInfo {
	s.Total = &v
	return s
}

func (s *PageInfo) SetPageIndex(v int64) *PageInfo {
	s.PageIndex = &v
	return s
}

func (s *PageInfo) SetPageSize(v int64) *PageInfo {
	s.PageSize = &v
	return s
}

type QueryAgentSseRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 用户ID
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
	// 会话id
	SessionId *string `json:"session_id,omitempty" xml:"session_id,omitempty" require:"true"`
	// 查询词条
	Query *string `json:"query,omitempty" xml:"query,omitempty" require:"true"`
	// 会话存活时长，单位毫秒，默认5分钟，最大不超过10分钟
	AliveTime *int64 `json:"alive_time,omitempty" xml:"alive_time,omitempty" require:"true"`
	// agent_id
	AgentId *string `json:"agent_id,omitempty" xml:"agent_id,omitempty" require:"true"`
}

func (s QueryAgentSseRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAgentSseRequest) GoString() string {
	return s.String()
}

func (s *QueryAgentSseRequest) SetAuthToken(v string) *QueryAgentSseRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAgentSseRequest) SetProductInstanceId(v string) *QueryAgentSseRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAgentSseRequest) SetUserId(v string) *QueryAgentSseRequest {
	s.UserId = &v
	return s
}

func (s *QueryAgentSseRequest) SetSessionId(v string) *QueryAgentSseRequest {
	s.SessionId = &v
	return s
}

func (s *QueryAgentSseRequest) SetQuery(v string) *QueryAgentSseRequest {
	s.Query = &v
	return s
}

func (s *QueryAgentSseRequest) SetAliveTime(v int64) *QueryAgentSseRequest {
	s.AliveTime = &v
	return s
}

func (s *QueryAgentSseRequest) SetAgentId(v string) *QueryAgentSseRequest {
	s.AgentId = &v
	return s
}

type QueryAgentSseResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 消息
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
}

func (s QueryAgentSseResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAgentSseResponse) GoString() string {
	return s.String()
}

func (s *QueryAgentSseResponse) SetReqMsgId(v string) *QueryAgentSseResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAgentSseResponse) SetResultCode(v string) *QueryAgentSseResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAgentSseResponse) SetResultMsg(v string) *QueryAgentSseResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAgentSseResponse) SetMessage(v string) *QueryAgentSseResponse {
	s.Message = &v
	return s
}

type ListAgentConversationRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 用户ID
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
	// agent id
	AgentId *string `json:"agent_id,omitempty" xml:"agent_id,omitempty" require:"true"`
	// page_info
	PageInfo *PageInfo `json:"page_info,omitempty" xml:"page_info,omitempty" require:"true"`
}

func (s ListAgentConversationRequest) String() string {
	return tea.Prettify(s)
}

func (s ListAgentConversationRequest) GoString() string {
	return s.String()
}

func (s *ListAgentConversationRequest) SetAuthToken(v string) *ListAgentConversationRequest {
	s.AuthToken = &v
	return s
}

func (s *ListAgentConversationRequest) SetProductInstanceId(v string) *ListAgentConversationRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListAgentConversationRequest) SetUserId(v string) *ListAgentConversationRequest {
	s.UserId = &v
	return s
}

func (s *ListAgentConversationRequest) SetAgentId(v string) *ListAgentConversationRequest {
	s.AgentId = &v
	return s
}

func (s *ListAgentConversationRequest) SetPageInfo(v *PageInfo) *ListAgentConversationRequest {
	s.PageInfo = v
	return s
}

type ListAgentConversationResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// page_info
	PageInfo *PageInfo `json:"page_info,omitempty" xml:"page_info,omitempty"`
	// 会话列表信息
	ConversationData []*ChatConversationInfo `json:"conversation_data,omitempty" xml:"conversation_data,omitempty" type:"Repeated"`
}

func (s ListAgentConversationResponse) String() string {
	return tea.Prettify(s)
}

func (s ListAgentConversationResponse) GoString() string {
	return s.String()
}

func (s *ListAgentConversationResponse) SetReqMsgId(v string) *ListAgentConversationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListAgentConversationResponse) SetResultCode(v string) *ListAgentConversationResponse {
	s.ResultCode = &v
	return s
}

func (s *ListAgentConversationResponse) SetResultMsg(v string) *ListAgentConversationResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListAgentConversationResponse) SetPageInfo(v *PageInfo) *ListAgentConversationResponse {
	s.PageInfo = v
	return s
}

func (s *ListAgentConversationResponse) SetConversationData(v []*ChatConversationInfo) *ListAgentConversationResponse {
	s.ConversationData = v
	return s
}

type DeleteAgentConversationRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 用户ID
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
	// 会话ID
	SessionId *string `json:"session_id,omitempty" xml:"session_id,omitempty" require:"true"`
}

func (s DeleteAgentConversationRequest) String() string {
	return tea.Prettify(s)
}

func (s DeleteAgentConversationRequest) GoString() string {
	return s.String()
}

func (s *DeleteAgentConversationRequest) SetAuthToken(v string) *DeleteAgentConversationRequest {
	s.AuthToken = &v
	return s
}

func (s *DeleteAgentConversationRequest) SetProductInstanceId(v string) *DeleteAgentConversationRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DeleteAgentConversationRequest) SetUserId(v string) *DeleteAgentConversationRequest {
	s.UserId = &v
	return s
}

func (s *DeleteAgentConversationRequest) SetSessionId(v string) *DeleteAgentConversationRequest {
	s.SessionId = &v
	return s
}

type DeleteAgentConversationResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 操作结果
	Result *bool `json:"result,omitempty" xml:"result,omitempty"`
}

func (s DeleteAgentConversationResponse) String() string {
	return tea.Prettify(s)
}

func (s DeleteAgentConversationResponse) GoString() string {
	return s.String()
}

func (s *DeleteAgentConversationResponse) SetReqMsgId(v string) *DeleteAgentConversationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DeleteAgentConversationResponse) SetResultCode(v string) *DeleteAgentConversationResponse {
	s.ResultCode = &v
	return s
}

func (s *DeleteAgentConversationResponse) SetResultMsg(v string) *DeleteAgentConversationResponse {
	s.ResultMsg = &v
	return s
}

func (s *DeleteAgentConversationResponse) SetResult(v bool) *DeleteAgentConversationResponse {
	s.Result = &v
	return s
}

type BatchdeleteAgentConversationRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 用户ID
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
}

func (s BatchdeleteAgentConversationRequest) String() string {
	return tea.Prettify(s)
}

func (s BatchdeleteAgentConversationRequest) GoString() string {
	return s.String()
}

func (s *BatchdeleteAgentConversationRequest) SetAuthToken(v string) *BatchdeleteAgentConversationRequest {
	s.AuthToken = &v
	return s
}

func (s *BatchdeleteAgentConversationRequest) SetProductInstanceId(v string) *BatchdeleteAgentConversationRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *BatchdeleteAgentConversationRequest) SetUserId(v string) *BatchdeleteAgentConversationRequest {
	s.UserId = &v
	return s
}

type BatchdeleteAgentConversationResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 操作结果
	Result *bool `json:"result,omitempty" xml:"result,omitempty"`
}

func (s BatchdeleteAgentConversationResponse) String() string {
	return tea.Prettify(s)
}

func (s BatchdeleteAgentConversationResponse) GoString() string {
	return s.String()
}

func (s *BatchdeleteAgentConversationResponse) SetReqMsgId(v string) *BatchdeleteAgentConversationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *BatchdeleteAgentConversationResponse) SetResultCode(v string) *BatchdeleteAgentConversationResponse {
	s.ResultCode = &v
	return s
}

func (s *BatchdeleteAgentConversationResponse) SetResultMsg(v string) *BatchdeleteAgentConversationResponse {
	s.ResultMsg = &v
	return s
}

func (s *BatchdeleteAgentConversationResponse) SetResult(v bool) *BatchdeleteAgentConversationResponse {
	s.Result = &v
	return s
}

type ListAgentMessageRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 用户id
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
	// 会话ID
	SessionId *string `json:"session_id,omitempty" xml:"session_id,omitempty" require:"true"`
	// page_info
	PageInfo *PageInfo `json:"page_info,omitempty" xml:"page_info,omitempty" require:"true"`
}

func (s ListAgentMessageRequest) String() string {
	return tea.Prettify(s)
}

func (s ListAgentMessageRequest) GoString() string {
	return s.String()
}

func (s *ListAgentMessageRequest) SetAuthToken(v string) *ListAgentMessageRequest {
	s.AuthToken = &v
	return s
}

func (s *ListAgentMessageRequest) SetProductInstanceId(v string) *ListAgentMessageRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListAgentMessageRequest) SetUserId(v string) *ListAgentMessageRequest {
	s.UserId = &v
	return s
}

func (s *ListAgentMessageRequest) SetSessionId(v string) *ListAgentMessageRequest {
	s.SessionId = &v
	return s
}

func (s *ListAgentMessageRequest) SetPageInfo(v *PageInfo) *ListAgentMessageRequest {
	s.PageInfo = v
	return s
}

type ListAgentMessageResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// page_info
	PageInfo *PageInfo `json:"page_info,omitempty" xml:"page_info,omitempty"`
	// 消息列表
	MessageData []*ChatMessageInfo `json:"message_data,omitempty" xml:"message_data,omitempty" type:"Repeated"`
}

func (s ListAgentMessageResponse) String() string {
	return tea.Prettify(s)
}

func (s ListAgentMessageResponse) GoString() string {
	return s.String()
}

func (s *ListAgentMessageResponse) SetReqMsgId(v string) *ListAgentMessageResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListAgentMessageResponse) SetResultCode(v string) *ListAgentMessageResponse {
	s.ResultCode = &v
	return s
}

func (s *ListAgentMessageResponse) SetResultMsg(v string) *ListAgentMessageResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListAgentMessageResponse) SetPageInfo(v *PageInfo) *ListAgentMessageResponse {
	s.PageInfo = v
	return s
}

func (s *ListAgentMessageResponse) SetMessageData(v []*ChatMessageInfo) *ListAgentMessageResponse {
	s.MessageData = v
	return s
}

type UpdateAgentConversationRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 用户ID
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
	// 会话ID
	SessionId *string `json:"session_id,omitempty" xml:"session_id,omitempty" require:"true"`
	// 会话名称
	Title *string `json:"title,omitempty" xml:"title,omitempty" require:"true"`
}

func (s UpdateAgentConversationRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateAgentConversationRequest) GoString() string {
	return s.String()
}

func (s *UpdateAgentConversationRequest) SetAuthToken(v string) *UpdateAgentConversationRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateAgentConversationRequest) SetProductInstanceId(v string) *UpdateAgentConversationRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateAgentConversationRequest) SetUserId(v string) *UpdateAgentConversationRequest {
	s.UserId = &v
	return s
}

func (s *UpdateAgentConversationRequest) SetSessionId(v string) *UpdateAgentConversationRequest {
	s.SessionId = &v
	return s
}

func (s *UpdateAgentConversationRequest) SetTitle(v string) *UpdateAgentConversationRequest {
	s.Title = &v
	return s
}

type UpdateAgentConversationResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 操作结果
	Result *bool `json:"result,omitempty" xml:"result,omitempty"`
}

func (s UpdateAgentConversationResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateAgentConversationResponse) GoString() string {
	return s.String()
}

func (s *UpdateAgentConversationResponse) SetReqMsgId(v string) *UpdateAgentConversationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateAgentConversationResponse) SetResultCode(v string) *UpdateAgentConversationResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateAgentConversationResponse) SetResultMsg(v string) *UpdateAgentConversationResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateAgentConversationResponse) SetResult(v bool) *UpdateAgentConversationResponse {
	s.Result = &v
	return s
}

type QueryAgentCompletionRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 用户ID
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
	// 会话id
	SessionId *string `json:"session_id,omitempty" xml:"session_id,omitempty" require:"true"`
	// 查询词条
	Query *string `json:"query,omitempty" xml:"query,omitempty" require:"true"`
	// 会话存活时长，单位毫秒，默认5分钟，最大不超过10分钟
	AliveTime *int64 `json:"alive_time,omitempty" xml:"alive_time,omitempty"`
	// agent_id
	AgentId *string `json:"agent_id,omitempty" xml:"agent_id,omitempty" require:"true"`
}

func (s QueryAgentCompletionRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAgentCompletionRequest) GoString() string {
	return s.String()
}

func (s *QueryAgentCompletionRequest) SetAuthToken(v string) *QueryAgentCompletionRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAgentCompletionRequest) SetProductInstanceId(v string) *QueryAgentCompletionRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAgentCompletionRequest) SetUserId(v string) *QueryAgentCompletionRequest {
	s.UserId = &v
	return s
}

func (s *QueryAgentCompletionRequest) SetSessionId(v string) *QueryAgentCompletionRequest {
	s.SessionId = &v
	return s
}

func (s *QueryAgentCompletionRequest) SetQuery(v string) *QueryAgentCompletionRequest {
	s.Query = &v
	return s
}

func (s *QueryAgentCompletionRequest) SetAliveTime(v int64) *QueryAgentCompletionRequest {
	s.AliveTime = &v
	return s
}

func (s *QueryAgentCompletionRequest) SetAgentId(v string) *QueryAgentCompletionRequest {
	s.AgentId = &v
	return s
}

type QueryAgentCompletionResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 消息
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
}

func (s QueryAgentCompletionResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAgentCompletionResponse) GoString() string {
	return s.String()
}

func (s *QueryAgentCompletionResponse) SetReqMsgId(v string) *QueryAgentCompletionResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAgentCompletionResponse) SetResultCode(v string) *QueryAgentCompletionResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAgentCompletionResponse) SetResultMsg(v string) *QueryAgentCompletionResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAgentCompletionResponse) SetMessage(v string) *QueryAgentCompletionResponse {
	s.Message = &v
	return s
}

type ImportIdmapSamplefileRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// oss文件名称
	FileName *string `json:"file_name,omitempty" xml:"file_name,omitempty" require:"true"`
	// 项目ID
	ProjectInfoId *string `json:"project_info_id,omitempty" xml:"project_info_id,omitempty" require:"true"`
	// 查询列
	ParamType *string `json:"param_type,omitempty" xml:"param_type,omitempty" require:"true"`
	// 结果列
	ResultType *string `json:"result_type,omitempty" xml:"result_type,omitempty" require:"true"`
	// 样本Code
	SampleCode *string `json:"sample_code,omitempty" xml:"sample_code,omitempty" require:"true"`
	// 样本任务Code
	SampleTaskCode *string `json:"sample_task_code,omitempty" xml:"sample_task_code,omitempty" require:"true"`
	// oss文件路径
	FilePath *string `json:"file_path,omitempty" xml:"file_path,omitempty" require:"true"`
	// 数据源code
	DataSource *string `json:"data_source,omitempty" xml:"data_source,omitempty" require:"true"`
	// 结果加密方式
	EncryptionMethod *string `json:"encryption_method,omitempty" xml:"encryption_method,omitempty" require:"true"`
}

func (s ImportIdmapSamplefileRequest) String() string {
	return tea.Prettify(s)
}

func (s ImportIdmapSamplefileRequest) GoString() string {
	return s.String()
}

func (s *ImportIdmapSamplefileRequest) SetAuthToken(v string) *ImportIdmapSamplefileRequest {
	s.AuthToken = &v
	return s
}

func (s *ImportIdmapSamplefileRequest) SetProductInstanceId(v string) *ImportIdmapSamplefileRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ImportIdmapSamplefileRequest) SetFileName(v string) *ImportIdmapSamplefileRequest {
	s.FileName = &v
	return s
}

func (s *ImportIdmapSamplefileRequest) SetProjectInfoId(v string) *ImportIdmapSamplefileRequest {
	s.ProjectInfoId = &v
	return s
}

func (s *ImportIdmapSamplefileRequest) SetParamType(v string) *ImportIdmapSamplefileRequest {
	s.ParamType = &v
	return s
}

func (s *ImportIdmapSamplefileRequest) SetResultType(v string) *ImportIdmapSamplefileRequest {
	s.ResultType = &v
	return s
}

func (s *ImportIdmapSamplefileRequest) SetSampleCode(v string) *ImportIdmapSamplefileRequest {
	s.SampleCode = &v
	return s
}

func (s *ImportIdmapSamplefileRequest) SetSampleTaskCode(v string) *ImportIdmapSamplefileRequest {
	s.SampleTaskCode = &v
	return s
}

func (s *ImportIdmapSamplefileRequest) SetFilePath(v string) *ImportIdmapSamplefileRequest {
	s.FilePath = &v
	return s
}

func (s *ImportIdmapSamplefileRequest) SetDataSource(v string) *ImportIdmapSamplefileRequest {
	s.DataSource = &v
	return s
}

func (s *ImportIdmapSamplefileRequest) SetEncryptionMethod(v string) *ImportIdmapSamplefileRequest {
	s.EncryptionMethod = &v
	return s
}

type ImportIdmapSamplefileResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 上传结果地址路径
	ResultFilePath *string `json:"result_file_path,omitempty" xml:"result_file_path,omitempty"`
	// oss结果文件名称
	ResultFileName *string `json:"result_file_name,omitempty" xml:"result_file_name,omitempty"`
}

func (s ImportIdmapSamplefileResponse) String() string {
	return tea.Prettify(s)
}

func (s ImportIdmapSamplefileResponse) GoString() string {
	return s.String()
}

func (s *ImportIdmapSamplefileResponse) SetReqMsgId(v string) *ImportIdmapSamplefileResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ImportIdmapSamplefileResponse) SetResultCode(v string) *ImportIdmapSamplefileResponse {
	s.ResultCode = &v
	return s
}

func (s *ImportIdmapSamplefileResponse) SetResultMsg(v string) *ImportIdmapSamplefileResponse {
	s.ResultMsg = &v
	return s
}

func (s *ImportIdmapSamplefileResponse) SetResultFilePath(v string) *ImportIdmapSamplefileResponse {
	s.ResultFilePath = &v
	return s
}

func (s *ImportIdmapSamplefileResponse) SetResultFileName(v string) *ImportIdmapSamplefileResponse {
	s.ResultFileName = &v
	return s
}

type ImportIdmapPsiresultfileRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 文件路径
	FilePath *string `json:"file_path,omitempty" xml:"file_path,omitempty" require:"true"`
	// 文件名称
	FileName *string `json:"file_name,omitempty" xml:"file_name,omitempty" require:"true"`
	// 项目唯一标识
	ProjectInfoId *string `json:"project_info_id,omitempty" xml:"project_info_id,omitempty" require:"true"`
	// 样本编码
	SampleCode *string `json:"sample_code,omitempty" xml:"sample_code,omitempty" require:"true"`
	// 样本任务编码
	SampleTaskCode *string `json:"sample_task_code,omitempty" xml:"sample_task_code,omitempty" require:"true"`
	// 数据源编码
	DataSource *string `json:"data_source,omitempty" xml:"data_source,omitempty" require:"true"`
}

func (s ImportIdmapPsiresultfileRequest) String() string {
	return tea.Prettify(s)
}

func (s ImportIdmapPsiresultfileRequest) GoString() string {
	return s.String()
}

func (s *ImportIdmapPsiresultfileRequest) SetAuthToken(v string) *ImportIdmapPsiresultfileRequest {
	s.AuthToken = &v
	return s
}

func (s *ImportIdmapPsiresultfileRequest) SetProductInstanceId(v string) *ImportIdmapPsiresultfileRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ImportIdmapPsiresultfileRequest) SetFilePath(v string) *ImportIdmapPsiresultfileRequest {
	s.FilePath = &v
	return s
}

func (s *ImportIdmapPsiresultfileRequest) SetFileName(v string) *ImportIdmapPsiresultfileRequest {
	s.FileName = &v
	return s
}

func (s *ImportIdmapPsiresultfileRequest) SetProjectInfoId(v string) *ImportIdmapPsiresultfileRequest {
	s.ProjectInfoId = &v
	return s
}

func (s *ImportIdmapPsiresultfileRequest) SetSampleCode(v string) *ImportIdmapPsiresultfileRequest {
	s.SampleCode = &v
	return s
}

func (s *ImportIdmapPsiresultfileRequest) SetSampleTaskCode(v string) *ImportIdmapPsiresultfileRequest {
	s.SampleTaskCode = &v
	return s
}

func (s *ImportIdmapPsiresultfileRequest) SetDataSource(v string) *ImportIdmapPsiresultfileRequest {
	s.DataSource = &v
	return s
}

type ImportIdmapPsiresultfileResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 结果文件路径
	ResultFilePath *string `json:"result_file_path,omitempty" xml:"result_file_path,omitempty"`
	// 结果文件名称
	ResultFileName *string `json:"result_file_name,omitempty" xml:"result_file_name,omitempty"`
}

func (s ImportIdmapPsiresultfileResponse) String() string {
	return tea.Prettify(s)
}

func (s ImportIdmapPsiresultfileResponse) GoString() string {
	return s.String()
}

func (s *ImportIdmapPsiresultfileResponse) SetReqMsgId(v string) *ImportIdmapPsiresultfileResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ImportIdmapPsiresultfileResponse) SetResultCode(v string) *ImportIdmapPsiresultfileResponse {
	s.ResultCode = &v
	return s
}

func (s *ImportIdmapPsiresultfileResponse) SetResultMsg(v string) *ImportIdmapPsiresultfileResponse {
	s.ResultMsg = &v
	return s
}

func (s *ImportIdmapPsiresultfileResponse) SetResultFilePath(v string) *ImportIdmapPsiresultfileResponse {
	s.ResultFilePath = &v
	return s
}

func (s *ImportIdmapPsiresultfileResponse) SetResultFileName(v string) *ImportIdmapPsiresultfileResponse {
	s.ResultFileName = &v
	return s
}

type QueryIndexresearchBrandRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 品牌编码
	BrandCode *string `json:"brand_code,omitempty" xml:"brand_code,omitempty" require:"true"`
	// 时间月份yyyyMM
	Month *string `json:"month,omitempty" xml:"month,omitempty"`
	// test-测试数据。prod-正式数据
	DataType *string `json:"data_type,omitempty" xml:"data_type,omitempty" require:"true"`
	// 时间频次 m-月/d-天
	TimeType *string `json:"time_type,omitempty" xml:"time_type,omitempty" require:"true"`
}

func (s QueryIndexresearchBrandRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryIndexresearchBrandRequest) GoString() string {
	return s.String()
}

func (s *QueryIndexresearchBrandRequest) SetAuthToken(v string) *QueryIndexresearchBrandRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryIndexresearchBrandRequest) SetProductInstanceId(v string) *QueryIndexresearchBrandRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryIndexresearchBrandRequest) SetBrandCode(v string) *QueryIndexresearchBrandRequest {
	s.BrandCode = &v
	return s
}

func (s *QueryIndexresearchBrandRequest) SetMonth(v string) *QueryIndexresearchBrandRequest {
	s.Month = &v
	return s
}

func (s *QueryIndexresearchBrandRequest) SetDataType(v string) *QueryIndexresearchBrandRequest {
	s.DataType = &v
	return s
}

func (s *QueryIndexresearchBrandRequest) SetTimeType(v string) *QueryIndexresearchBrandRequest {
	s.TimeType = &v
	return s
}

type QueryIndexresearchBrandResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 指标数据
	IndexData []*IndexData `json:"index_data,omitempty" xml:"index_data,omitempty" type:"Repeated"`
}

func (s QueryIndexresearchBrandResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryIndexresearchBrandResponse) GoString() string {
	return s.String()
}

func (s *QueryIndexresearchBrandResponse) SetReqMsgId(v string) *QueryIndexresearchBrandResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryIndexresearchBrandResponse) SetResultCode(v string) *QueryIndexresearchBrandResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryIndexresearchBrandResponse) SetResultMsg(v string) *QueryIndexresearchBrandResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryIndexresearchBrandResponse) SetIndexData(v []*IndexData) *QueryIndexresearchBrandResponse {
	s.IndexData = v
	return s
}

type QueryIndexresearchBrandindexRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 品牌码
	BrandCode *string `json:"brand_code,omitempty" xml:"brand_code,omitempty"`
	// 店铺标签
	ShopTag *string `json:"shop_tag,omitempty" xml:"shop_tag,omitempty"`
	// 月份
	Month []*string `json:"month,omitempty" xml:"month,omitempty" type:"Repeated"`
	// 字段排序方式
	Sort []*string `json:"sort,omitempty" xml:"sort,omitempty" type:"Repeated"`
	// page_info
	PageInfo *PageInfo `json:"page_info,omitempty" xml:"page_info,omitempty" require:"true"`
}

func (s QueryIndexresearchBrandindexRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryIndexresearchBrandindexRequest) GoString() string {
	return s.String()
}

func (s *QueryIndexresearchBrandindexRequest) SetAuthToken(v string) *QueryIndexresearchBrandindexRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryIndexresearchBrandindexRequest) SetProductInstanceId(v string) *QueryIndexresearchBrandindexRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryIndexresearchBrandindexRequest) SetBrandCode(v string) *QueryIndexresearchBrandindexRequest {
	s.BrandCode = &v
	return s
}

func (s *QueryIndexresearchBrandindexRequest) SetShopTag(v string) *QueryIndexresearchBrandindexRequest {
	s.ShopTag = &v
	return s
}

func (s *QueryIndexresearchBrandindexRequest) SetMonth(v []*string) *QueryIndexresearchBrandindexRequest {
	s.Month = v
	return s
}

func (s *QueryIndexresearchBrandindexRequest) SetSort(v []*string) *QueryIndexresearchBrandindexRequest {
	s.Sort = v
	return s
}

func (s *QueryIndexresearchBrandindexRequest) SetPageInfo(v *PageInfo) *QueryIndexresearchBrandindexRequest {
	s.PageInfo = v
	return s
}

type QueryIndexresearchBrandindexResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// page_info
	PageInfo *PageInfo `json:"page_info,omitempty" xml:"page_info,omitempty"`
	// index_data
	IndexData []*IndexData `json:"index_data,omitempty" xml:"index_data,omitempty" type:"Repeated"`
}

func (s QueryIndexresearchBrandindexResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryIndexresearchBrandindexResponse) GoString() string {
	return s.String()
}

func (s *QueryIndexresearchBrandindexResponse) SetReqMsgId(v string) *QueryIndexresearchBrandindexResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryIndexresearchBrandindexResponse) SetResultCode(v string) *QueryIndexresearchBrandindexResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryIndexresearchBrandindexResponse) SetResultMsg(v string) *QueryIndexresearchBrandindexResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryIndexresearchBrandindexResponse) SetPageInfo(v *PageInfo) *QueryIndexresearchBrandindexResponse {
	s.PageInfo = v
	return s
}

func (s *QueryIndexresearchBrandindexResponse) SetIndexData(v []*IndexData) *QueryIndexresearchBrandindexResponse {
	s.IndexData = v
	return s
}

type QueryIndexresearchConsumeindustryRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 行业
	Industry *string `json:"industry,omitempty" xml:"industry,omitempty"`
	// 是否线上线下 1:线下，0:线上，-1:全部
	OfpType *string `json:"ofp_type,omitempty" xml:"ofp_type,omitempty"`
	// 开始时间
	StartTime *string `json:"start_time,omitempty" xml:"start_time,omitempty"`
	// 结束时间
	EndTime *string `json:"end_time,omitempty" xml:"end_time,omitempty"`
	// 分页信息
	PageInfo *PageInfo `json:"page_info,omitempty" xml:"page_info,omitempty" require:"true"`
	// 字段排序方式
	Sort []*string `json:"sort,omitempty" xml:"sort,omitempty" type:"Repeated"`
}

func (s QueryIndexresearchConsumeindustryRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryIndexresearchConsumeindustryRequest) GoString() string {
	return s.String()
}

func (s *QueryIndexresearchConsumeindustryRequest) SetAuthToken(v string) *QueryIndexresearchConsumeindustryRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryIndexresearchConsumeindustryRequest) SetProductInstanceId(v string) *QueryIndexresearchConsumeindustryRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryIndexresearchConsumeindustryRequest) SetIndustry(v string) *QueryIndexresearchConsumeindustryRequest {
	s.Industry = &v
	return s
}

func (s *QueryIndexresearchConsumeindustryRequest) SetOfpType(v string) *QueryIndexresearchConsumeindustryRequest {
	s.OfpType = &v
	return s
}

func (s *QueryIndexresearchConsumeindustryRequest) SetStartTime(v string) *QueryIndexresearchConsumeindustryRequest {
	s.StartTime = &v
	return s
}

func (s *QueryIndexresearchConsumeindustryRequest) SetEndTime(v string) *QueryIndexresearchConsumeindustryRequest {
	s.EndTime = &v
	return s
}

func (s *QueryIndexresearchConsumeindustryRequest) SetPageInfo(v *PageInfo) *QueryIndexresearchConsumeindustryRequest {
	s.PageInfo = v
	return s
}

func (s *QueryIndexresearchConsumeindustryRequest) SetSort(v []*string) *QueryIndexresearchConsumeindustryRequest {
	s.Sort = v
	return s
}

type QueryIndexresearchConsumeindustryResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 分页信息
	PageInfo *PageInfo `json:"page_info,omitempty" xml:"page_info,omitempty"`
	// 消费行业数据
	IndustryData []*IndustryData `json:"industry_data,omitempty" xml:"industry_data,omitempty" type:"Repeated"`
}

func (s QueryIndexresearchConsumeindustryResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryIndexresearchConsumeindustryResponse) GoString() string {
	return s.String()
}

func (s *QueryIndexresearchConsumeindustryResponse) SetReqMsgId(v string) *QueryIndexresearchConsumeindustryResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryIndexresearchConsumeindustryResponse) SetResultCode(v string) *QueryIndexresearchConsumeindustryResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryIndexresearchConsumeindustryResponse) SetResultMsg(v string) *QueryIndexresearchConsumeindustryResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryIndexresearchConsumeindustryResponse) SetPageInfo(v *PageInfo) *QueryIndexresearchConsumeindustryResponse {
	s.PageInfo = v
	return s
}

func (s *QueryIndexresearchConsumeindustryResponse) SetIndustryData(v []*IndustryData) *QueryIndexresearchConsumeindustryResponse {
	s.IndustryData = v
	return s
}

type QueryIndexresearchIndustryRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 行业
	Industry *string `json:"industry,omitempty" xml:"industry,omitempty"`
}

func (s QueryIndexresearchIndustryRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryIndexresearchIndustryRequest) GoString() string {
	return s.String()
}

func (s *QueryIndexresearchIndustryRequest) SetAuthToken(v string) *QueryIndexresearchIndustryRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryIndexresearchIndustryRequest) SetProductInstanceId(v string) *QueryIndexresearchIndustryRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryIndexresearchIndustryRequest) SetIndustry(v string) *QueryIndexresearchIndustryRequest {
	s.Industry = &v
	return s
}

type QueryIndexresearchIndustryResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 行业列表数据
	IndustryData []*string `json:"industry_data,omitempty" xml:"industry_data,omitempty" type:"Repeated"`
}

func (s QueryIndexresearchIndustryResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryIndexresearchIndustryResponse) GoString() string {
	return s.String()
}

func (s *QueryIndexresearchIndustryResponse) SetReqMsgId(v string) *QueryIndexresearchIndustryResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryIndexresearchIndustryResponse) SetResultCode(v string) *QueryIndexresearchIndustryResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryIndexresearchIndustryResponse) SetResultMsg(v string) *QueryIndexresearchIndustryResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryIndexresearchIndustryResponse) SetIndustryData(v []*string) *QueryIndexresearchIndustryResponse {
	s.IndustryData = v
	return s
}

type QueryLocationInternalRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// md5加密的身份证号
	IdNumber *string `json:"id_number,omitempty" xml:"id_number,omitempty"`
	// md5加密的手机号
	PhoneNo *string `json:"phone_no,omitempty" xml:"phone_no,omitempty"`
	// 定位时间范围开始时间
	StartTime *string `json:"start_time,omitempty" xml:"start_time,omitempty" require:"true"`
	// 定位时间范围结束时间
	EndTime *string `json:"end_time,omitempty" xml:"end_time,omitempty" require:"true"`
	// 核查中心位置（经度,纬度）
	CenterPosition *string `json:"center_position,omitempty" xml:"center_position,omitempty"`
	// 核查省市区县范围
	DistinctCounty *string `json:"distinct_county,omitempty" xml:"distinct_county,omitempty"`
	// 协查类型：
	// 0: 为经纬度精准定位协查 (默认)
	// 1:  为区县定位 (省-市-区/县) 协查
	InvType *int64 `json:"inv_type,omitempty" xml:"inv_type,omitempty"`
	// 服务级别与结果值定义
	ApiServiceLevel *string `json:"api_service_level,omitempty" xml:"api_service_level,omitempty" require:"true"`
}

func (s QueryLocationInternalRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryLocationInternalRequest) GoString() string {
	return s.String()
}

func (s *QueryLocationInternalRequest) SetAuthToken(v string) *QueryLocationInternalRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryLocationInternalRequest) SetProductInstanceId(v string) *QueryLocationInternalRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryLocationInternalRequest) SetIdNumber(v string) *QueryLocationInternalRequest {
	s.IdNumber = &v
	return s
}

func (s *QueryLocationInternalRequest) SetPhoneNo(v string) *QueryLocationInternalRequest {
	s.PhoneNo = &v
	return s
}

func (s *QueryLocationInternalRequest) SetStartTime(v string) *QueryLocationInternalRequest {
	s.StartTime = &v
	return s
}

func (s *QueryLocationInternalRequest) SetEndTime(v string) *QueryLocationInternalRequest {
	s.EndTime = &v
	return s
}

func (s *QueryLocationInternalRequest) SetCenterPosition(v string) *QueryLocationInternalRequest {
	s.CenterPosition = &v
	return s
}

func (s *QueryLocationInternalRequest) SetDistinctCounty(v string) *QueryLocationInternalRequest {
	s.DistinctCounty = &v
	return s
}

func (s *QueryLocationInternalRequest) SetInvType(v int64) *QueryLocationInternalRequest {
	s.InvType = &v
	return s
}

func (s *QueryLocationInternalRequest) SetApiServiceLevel(v string) *QueryLocationInternalRequest {
	s.ApiServiceLevel = &v
	return s
}

type QueryLocationInternalResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 置信度取值：A/B/C
	ConfidenceValue *string `json:"confidence_value,omitempty" xml:"confidence_value,omitempty"`
	// 扩展字段，其他信息
	ExtInfo *string `json:"ext_info,omitempty" xml:"ext_info,omitempty"`
}

func (s QueryLocationInternalResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryLocationInternalResponse) GoString() string {
	return s.String()
}

func (s *QueryLocationInternalResponse) SetReqMsgId(v string) *QueryLocationInternalResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryLocationInternalResponse) SetResultCode(v string) *QueryLocationInternalResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryLocationInternalResponse) SetResultMsg(v string) *QueryLocationInternalResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryLocationInternalResponse) SetConfidenceValue(v string) *QueryLocationInternalResponse {
	s.ConfidenceValue = &v
	return s
}

func (s *QueryLocationInternalResponse) SetExtInfo(v string) *QueryLocationInternalResponse {
	s.ExtInfo = &v
	return s
}

type QueryLocationTradeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// md5加密的身份证号
	IdNumber *string `json:"id_number,omitempty" xml:"id_number,omitempty" maxLength:"32"`
	// md5加密的手机号
	PhoneNo *string `json:"phone_no,omitempty" xml:"phone_no,omitempty" maxLength:"32"`
	// 调用者用户ID（或外部系统业务ID）
	CallerId *string `json:"caller_id,omitempty" xml:"caller_id,omitempty" require:"true" maxLength:"128"`
	// 定位时间范围开始时间
	StartTime *string `json:"start_time,omitempty" xml:"start_time,omitempty" require:"true" maxLength:"19"`
	// 定位时间范围结束时间
	EndTime *string `json:"end_time,omitempty" xml:"end_time,omitempty" require:"true" maxLength:"19"`
	// 核查中心位置（经度,纬度）
	CenterPosition *string `json:"center_position,omitempty" xml:"center_position,omitempty" maxLength:"64"`
	// 核查省市区县范围
	DistinctCounty *string `json:"distinct_county,omitempty" xml:"distinct_county,omitempty" maxLength:"128"`
	// 协查类型：
	// 0: 为经纬度精准定位协查 (默认)
	// 1:  为区县定位 (省-市-区/县) 协查
	InvType *string `json:"inv_type,omitempty" xml:"inv_type,omitempty" maxLength:"2"`
}

func (s QueryLocationTradeRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryLocationTradeRequest) GoString() string {
	return s.String()
}

func (s *QueryLocationTradeRequest) SetAuthToken(v string) *QueryLocationTradeRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryLocationTradeRequest) SetProductInstanceId(v string) *QueryLocationTradeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryLocationTradeRequest) SetIdNumber(v string) *QueryLocationTradeRequest {
	s.IdNumber = &v
	return s
}

func (s *QueryLocationTradeRequest) SetPhoneNo(v string) *QueryLocationTradeRequest {
	s.PhoneNo = &v
	return s
}

func (s *QueryLocationTradeRequest) SetCallerId(v string) *QueryLocationTradeRequest {
	s.CallerId = &v
	return s
}

func (s *QueryLocationTradeRequest) SetStartTime(v string) *QueryLocationTradeRequest {
	s.StartTime = &v
	return s
}

func (s *QueryLocationTradeRequest) SetEndTime(v string) *QueryLocationTradeRequest {
	s.EndTime = &v
	return s
}

func (s *QueryLocationTradeRequest) SetCenterPosition(v string) *QueryLocationTradeRequest {
	s.CenterPosition = &v
	return s
}

func (s *QueryLocationTradeRequest) SetDistinctCounty(v string) *QueryLocationTradeRequest {
	s.DistinctCounty = &v
	return s
}

func (s *QueryLocationTradeRequest) SetInvType(v string) *QueryLocationTradeRequest {
	s.InvType = &v
	return s
}

type QueryLocationTradeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 置信度取值：A/B/C
	ConfidenceValue *string `json:"confidence_value,omitempty" xml:"confidence_value,omitempty"`
	// 扩展字段，其他信息
	ExtInfo *string `json:"ext_info,omitempty" xml:"ext_info,omitempty"`
}

func (s QueryLocationTradeResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryLocationTradeResponse) GoString() string {
	return s.String()
}

func (s *QueryLocationTradeResponse) SetReqMsgId(v string) *QueryLocationTradeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryLocationTradeResponse) SetResultCode(v string) *QueryLocationTradeResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryLocationTradeResponse) SetResultMsg(v string) *QueryLocationTradeResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryLocationTradeResponse) SetConfidenceValue(v string) *QueryLocationTradeResponse {
	s.ConfidenceValue = &v
	return s
}

func (s *QueryLocationTradeResponse) SetExtInfo(v string) *QueryLocationTradeResponse {
	s.ExtInfo = &v
	return s
}

type PushModelSamplefileRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户编码
	TenantCode *string `json:"tenant_code,omitempty" xml:"tenant_code,omitempty" require:"true"`
	// 开始日期：示例 YYYYMMDD
	BeginDate *string `json:"begin_date,omitempty" xml:"begin_date,omitempty" require:"true"`
	// 样本内采样日期截止日：YYYYMMDD
	EndDate *string `json:"end_date,omitempty" xml:"end_date,omitempty" require:"true"`
	// 样本数据量
	OrgNums *int64 `json:"org_nums,omitempty" xml:"org_nums,omitempty" require:"true"`
	// 样本批次号，唯一，建议：租户code+时间戳
	SampleCode *string `json:"sample_code,omitempty" xml:"sample_code,omitempty" require:"true"`
	// 文件路径，bucket 下路径
	FilePath *string `json:"file_path,omitempty" xml:"file_path,omitempty" require:"true"`
	// 文件名,以.csv结尾，分隔符为  ","号
	FileName *string `json:"file_name,omitempty" xml:"file_name,omitempty" require:"true"`
}

func (s PushModelSamplefileRequest) String() string {
	return tea.Prettify(s)
}

func (s PushModelSamplefileRequest) GoString() string {
	return s.String()
}

func (s *PushModelSamplefileRequest) SetAuthToken(v string) *PushModelSamplefileRequest {
	s.AuthToken = &v
	return s
}

func (s *PushModelSamplefileRequest) SetProductInstanceId(v string) *PushModelSamplefileRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PushModelSamplefileRequest) SetTenantCode(v string) *PushModelSamplefileRequest {
	s.TenantCode = &v
	return s
}

func (s *PushModelSamplefileRequest) SetBeginDate(v string) *PushModelSamplefileRequest {
	s.BeginDate = &v
	return s
}

func (s *PushModelSamplefileRequest) SetEndDate(v string) *PushModelSamplefileRequest {
	s.EndDate = &v
	return s
}

func (s *PushModelSamplefileRequest) SetOrgNums(v int64) *PushModelSamplefileRequest {
	s.OrgNums = &v
	return s
}

func (s *PushModelSamplefileRequest) SetSampleCode(v string) *PushModelSamplefileRequest {
	s.SampleCode = &v
	return s
}

func (s *PushModelSamplefileRequest) SetFilePath(v string) *PushModelSamplefileRequest {
	s.FilePath = &v
	return s
}

func (s *PushModelSamplefileRequest) SetFileName(v string) *PushModelSamplefileRequest {
	s.FileName = &v
	return s
}

type PushModelSamplefileResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 轮训编码
	LoopCode *string `json:"loop_code,omitempty" xml:"loop_code,omitempty"`
}

func (s PushModelSamplefileResponse) String() string {
	return tea.Prettify(s)
}

func (s PushModelSamplefileResponse) GoString() string {
	return s.String()
}

func (s *PushModelSamplefileResponse) SetReqMsgId(v string) *PushModelSamplefileResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PushModelSamplefileResponse) SetResultCode(v string) *PushModelSamplefileResponse {
	s.ResultCode = &v
	return s
}

func (s *PushModelSamplefileResponse) SetResultMsg(v string) *PushModelSamplefileResponse {
	s.ResultMsg = &v
	return s
}

func (s *PushModelSamplefileResponse) SetLoopCode(v string) *PushModelSamplefileResponse {
	s.LoopCode = &v
	return s
}

type ExecModelSampletaskRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户编码
	TenantCode *string `json:"tenant_code,omitempty" xml:"tenant_code,omitempty" require:"true"`
	// 样本批次号，唯一，建议：租户code+时间戳
	SampleCode *string `json:"sample_code,omitempty" xml:"sample_code,omitempty" require:"true"`
	// 特征集编码或模型编码，依据类型使用
	TaskCode *string `json:"task_code,omitempty" xml:"task_code,omitempty" require:"true"`
	// 任务类型：特征集 FEATURESET、模型分 MODEL
	TaskType *string `json:"task_type,omitempty" xml:"task_type,omitempty" require:"true"`
	// 本次事件序号编码
	SampleTaskCode *string `json:"sample_task_code,omitempty" xml:"sample_task_code,omitempty" require:"true"`
}

func (s ExecModelSampletaskRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecModelSampletaskRequest) GoString() string {
	return s.String()
}

func (s *ExecModelSampletaskRequest) SetAuthToken(v string) *ExecModelSampletaskRequest {
	s.AuthToken = &v
	return s
}

func (s *ExecModelSampletaskRequest) SetProductInstanceId(v string) *ExecModelSampletaskRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ExecModelSampletaskRequest) SetTenantCode(v string) *ExecModelSampletaskRequest {
	s.TenantCode = &v
	return s
}

func (s *ExecModelSampletaskRequest) SetSampleCode(v string) *ExecModelSampletaskRequest {
	s.SampleCode = &v
	return s
}

func (s *ExecModelSampletaskRequest) SetTaskCode(v string) *ExecModelSampletaskRequest {
	s.TaskCode = &v
	return s
}

func (s *ExecModelSampletaskRequest) SetTaskType(v string) *ExecModelSampletaskRequest {
	s.TaskType = &v
	return s
}

func (s *ExecModelSampletaskRequest) SetSampleTaskCode(v string) *ExecModelSampletaskRequest {
	s.SampleTaskCode = &v
	return s
}

type ExecModelSampletaskResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 轮训编码
	LoopCode *string `json:"loop_code,omitempty" xml:"loop_code,omitempty"`
}

func (s ExecModelSampletaskResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecModelSampletaskResponse) GoString() string {
	return s.String()
}

func (s *ExecModelSampletaskResponse) SetReqMsgId(v string) *ExecModelSampletaskResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ExecModelSampletaskResponse) SetResultCode(v string) *ExecModelSampletaskResponse {
	s.ResultCode = &v
	return s
}

func (s *ExecModelSampletaskResponse) SetResultMsg(v string) *ExecModelSampletaskResponse {
	s.ResultMsg = &v
	return s
}

func (s *ExecModelSampletaskResponse) SetLoopCode(v string) *ExecModelSampletaskResponse {
	s.LoopCode = &v
	return s
}

type QueryModelSampletaskRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户编码
	TenantCode *string `json:"tenant_code,omitempty" xml:"tenant_code,omitempty" require:"true"`
	// 事件查询序号编码，在有loop_code接口返回值的异步接口的值
	// 如：antchain.zkcollabinv.model.samplefile.push、antchain.zkcollabinv.model.sampletask.exec
	LoopCode *string `json:"loop_code,omitempty" xml:"loop_code,omitempty" require:"true"`
	// 阶段：poc_050 样本提交阶段，poc_500 任务跑批阶段
	Phase *string `json:"phase,omitempty" xml:"phase,omitempty" require:"true"`
}

func (s QueryModelSampletaskRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryModelSampletaskRequest) GoString() string {
	return s.String()
}

func (s *QueryModelSampletaskRequest) SetAuthToken(v string) *QueryModelSampletaskRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryModelSampletaskRequest) SetProductInstanceId(v string) *QueryModelSampletaskRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryModelSampletaskRequest) SetTenantCode(v string) *QueryModelSampletaskRequest {
	s.TenantCode = &v
	return s
}

func (s *QueryModelSampletaskRequest) SetLoopCode(v string) *QueryModelSampletaskRequest {
	s.LoopCode = &v
	return s
}

func (s *QueryModelSampletaskRequest) SetPhase(v string) *QueryModelSampletaskRequest {
	s.Phase = &v
	return s
}

type QueryModelSampletaskResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 任务进度
	Progress *string `json:"progress,omitempty" xml:"progress,omitempty"`
	// 有输出的时候会有值
	Files []*string `json:"files,omitempty" xml:"files,omitempty" type:"Repeated"`
}

func (s QueryModelSampletaskResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryModelSampletaskResponse) GoString() string {
	return s.String()
}

func (s *QueryModelSampletaskResponse) SetReqMsgId(v string) *QueryModelSampletaskResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryModelSampletaskResponse) SetResultCode(v string) *QueryModelSampletaskResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryModelSampletaskResponse) SetResultMsg(v string) *QueryModelSampletaskResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryModelSampletaskResponse) SetProgress(v string) *QueryModelSampletaskResponse {
	s.Progress = &v
	return s
}

func (s *QueryModelSampletaskResponse) SetFiles(v []*string) *QueryModelSampletaskResponse {
	s.Files = v
	return s
}

type QueryModelFeaturesetRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户编码
	TenantCode *string `json:"tenant_code,omitempty" xml:"tenant_code,omitempty" require:"true"`
	// 分页信息
	PageInfo *PageInfo `json:"page_info,omitempty" xml:"page_info,omitempty" require:"true"`
}

func (s QueryModelFeaturesetRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryModelFeaturesetRequest) GoString() string {
	return s.String()
}

func (s *QueryModelFeaturesetRequest) SetAuthToken(v string) *QueryModelFeaturesetRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryModelFeaturesetRequest) SetProductInstanceId(v string) *QueryModelFeaturesetRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryModelFeaturesetRequest) SetTenantCode(v string) *QueryModelFeaturesetRequest {
	s.TenantCode = &v
	return s
}

func (s *QueryModelFeaturesetRequest) SetPageInfo(v *PageInfo) *QueryModelFeaturesetRequest {
	s.PageInfo = v
	return s
}

type QueryModelFeaturesetResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 特征列表
	Featuresets []*FeatureSetInfo `json:"featuresets,omitempty" xml:"featuresets,omitempty" type:"Repeated"`
	// 分页信息
	PageInfo *PageInfo `json:"page_info,omitempty" xml:"page_info,omitempty"`
}

func (s QueryModelFeaturesetResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryModelFeaturesetResponse) GoString() string {
	return s.String()
}

func (s *QueryModelFeaturesetResponse) SetReqMsgId(v string) *QueryModelFeaturesetResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryModelFeaturesetResponse) SetResultCode(v string) *QueryModelFeaturesetResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryModelFeaturesetResponse) SetResultMsg(v string) *QueryModelFeaturesetResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryModelFeaturesetResponse) SetFeaturesets(v []*FeatureSetInfo) *QueryModelFeaturesetResponse {
	s.Featuresets = v
	return s
}

func (s *QueryModelFeaturesetResponse) SetPageInfo(v *PageInfo) *QueryModelFeaturesetResponse {
	s.PageInfo = v
	return s
}

type SubmitModelInstanceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户编码
	TenantCode *string `json:"tenant_code,omitempty" xml:"tenant_code,omitempty" require:"true"`
	// 模型文件路径
	ModelFilePath *string `json:"model_file_path,omitempty" xml:"model_file_path,omitempty" require:"true"`
	// 特征集路径
	FeaturesFilePath *string `json:"features_file_path,omitempty" xml:"features_file_path,omitempty" require:"true"`
	// 示例文件路径
	DemoFilePath *string `json:"demo_file_path,omitempty" xml:"demo_file_path,omitempty"`
	// 模型编码，同一租户下唯一，后续回溯生产调用标记
	ModelCode *string `json:"model_code,omitempty" xml:"model_code,omitempty" require:"true"`
}

func (s SubmitModelInstanceRequest) String() string {
	return tea.Prettify(s)
}

func (s SubmitModelInstanceRequest) GoString() string {
	return s.String()
}

func (s *SubmitModelInstanceRequest) SetAuthToken(v string) *SubmitModelInstanceRequest {
	s.AuthToken = &v
	return s
}

func (s *SubmitModelInstanceRequest) SetProductInstanceId(v string) *SubmitModelInstanceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SubmitModelInstanceRequest) SetTenantCode(v string) *SubmitModelInstanceRequest {
	s.TenantCode = &v
	return s
}

func (s *SubmitModelInstanceRequest) SetModelFilePath(v string) *SubmitModelInstanceRequest {
	s.ModelFilePath = &v
	return s
}

func (s *SubmitModelInstanceRequest) SetFeaturesFilePath(v string) *SubmitModelInstanceRequest {
	s.FeaturesFilePath = &v
	return s
}

func (s *SubmitModelInstanceRequest) SetDemoFilePath(v string) *SubmitModelInstanceRequest {
	s.DemoFilePath = &v
	return s
}

func (s *SubmitModelInstanceRequest) SetModelCode(v string) *SubmitModelInstanceRequest {
	s.ModelCode = &v
	return s
}

type SubmitModelInstanceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s SubmitModelInstanceResponse) String() string {
	return tea.Prettify(s)
}

func (s SubmitModelInstanceResponse) GoString() string {
	return s.String()
}

func (s *SubmitModelInstanceResponse) SetReqMsgId(v string) *SubmitModelInstanceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SubmitModelInstanceResponse) SetResultCode(v string) *SubmitModelInstanceResponse {
	s.ResultCode = &v
	return s
}

func (s *SubmitModelInstanceResponse) SetResultMsg(v string) *SubmitModelInstanceResponse {
	s.ResultMsg = &v
	return s
}

type QueryModelStatsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// yyyyMMdd
	InvokeDay *string `json:"invoke_day,omitempty" xml:"invoke_day,omitempty" require:"true"`
	// 类型：TENANT  租户；AK key维度
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
}

func (s QueryModelStatsRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryModelStatsRequest) GoString() string {
	return s.String()
}

func (s *QueryModelStatsRequest) SetAuthToken(v string) *QueryModelStatsRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryModelStatsRequest) SetProductInstanceId(v string) *QueryModelStatsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryModelStatsRequest) SetInvokeDay(v string) *QueryModelStatsRequest {
	s.InvokeDay = &v
	return s
}

func (s *QueryModelStatsRequest) SetType(v string) *QueryModelStatsRequest {
	s.Type = &v
	return s
}

type QueryModelStatsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 数据
	Datas []*GwCallDataStats `json:"datas,omitempty" xml:"datas,omitempty" type:"Repeated"`
}

func (s QueryModelStatsResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryModelStatsResponse) GoString() string {
	return s.String()
}

func (s *QueryModelStatsResponse) SetReqMsgId(v string) *QueryModelStatsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryModelStatsResponse) SetResultCode(v string) *QueryModelStatsResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryModelStatsResponse) SetResultMsg(v string) *QueryModelStatsResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryModelStatsResponse) SetDatas(v []*GwCallDataStats) *QueryModelStatsResponse {
	s.Datas = v
	return s
}

type QueryModelCommonscoreRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 用户授权编码
	AuthNo *string `json:"auth_no,omitempty" xml:"auth_no,omitempty" require:"true"`
	// 模型编码
	ModelCode *string `json:"model_code,omitempty" xml:"model_code,omitempty" require:"true"`
	// 用户id（客户身份证号/手机号的md5/sha256散列值）
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
	// 用户id类型（身份证号：ID_NO；手机号：MOBILE_NO）
	UserIdType *string `json:"user_id_type,omitempty" xml:"user_id_type,omitempty" require:"true"`
	// user_id 散列类型: "MD5"：MD5（小写）, "SHA256" ： SHA256（小写）， "SM3"： SM3（小写）
	HashType *string `json:"hash_type,omitempty" xml:"hash_type,omitempty" require:"true"`
	// 客户编码
	CustomerCode *string `json:"customer_code,omitempty" xml:"customer_code,omitempty" require:"true"`
	// 流水号，串联链路用，非必填
	TransNo *string `json:"trans_no,omitempty" xml:"trans_no,omitempty"`
	// hash_type类型的散列后的操作，默认为空不加密。 如启用，需要对散列后的user_id 加密，可选用如下算法，类型1、AES/ECB/PKCS5PADDING 在加密后的二进制需要以字符集UTF-8，编码base64 方式赋值给user_id传输。 示例：AES秘钥：base64_aes_key = "CZqWzQ5JL8s5Zx2XVpGZGw=="，报文：plaintext = "Hello, 蚂蚁。" ，使用算法： AES/ECB/PKCS5PADDING ；密文：SI1wU1ePSFoMy5YzuxclFkbZ/FIXUHPRDbKBW85WolY=，配置了此项user_id应该传输此密文。
	UserIdEncryptType *string `json:"user_id_encrypt_type,omitempty" xml:"user_id_encrypt_type,omitempty"`
}

func (s QueryModelCommonscoreRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryModelCommonscoreRequest) GoString() string {
	return s.String()
}

func (s *QueryModelCommonscoreRequest) SetAuthToken(v string) *QueryModelCommonscoreRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryModelCommonscoreRequest) SetProductInstanceId(v string) *QueryModelCommonscoreRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryModelCommonscoreRequest) SetAuthNo(v string) *QueryModelCommonscoreRequest {
	s.AuthNo = &v
	return s
}

func (s *QueryModelCommonscoreRequest) SetModelCode(v string) *QueryModelCommonscoreRequest {
	s.ModelCode = &v
	return s
}

func (s *QueryModelCommonscoreRequest) SetUserId(v string) *QueryModelCommonscoreRequest {
	s.UserId = &v
	return s
}

func (s *QueryModelCommonscoreRequest) SetUserIdType(v string) *QueryModelCommonscoreRequest {
	s.UserIdType = &v
	return s
}

func (s *QueryModelCommonscoreRequest) SetHashType(v string) *QueryModelCommonscoreRequest {
	s.HashType = &v
	return s
}

func (s *QueryModelCommonscoreRequest) SetCustomerCode(v string) *QueryModelCommonscoreRequest {
	s.CustomerCode = &v
	return s
}

func (s *QueryModelCommonscoreRequest) SetTransNo(v string) *QueryModelCommonscoreRequest {
	s.TransNo = &v
	return s
}

func (s *QueryModelCommonscoreRequest) SetUserIdEncryptType(v string) *QueryModelCommonscoreRequest {
	s.UserIdEncryptType = &v
	return s
}

type QueryModelCommonscoreResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 模型分
	Score *string `json:"score,omitempty" xml:"score,omitempty"`
	// 流水号
	TransNo *string `json:"trans_no,omitempty" xml:"trans_no,omitempty"`
}

func (s QueryModelCommonscoreResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryModelCommonscoreResponse) GoString() string {
	return s.String()
}

func (s *QueryModelCommonscoreResponse) SetReqMsgId(v string) *QueryModelCommonscoreResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryModelCommonscoreResponse) SetResultCode(v string) *QueryModelCommonscoreResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryModelCommonscoreResponse) SetResultMsg(v string) *QueryModelCommonscoreResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryModelCommonscoreResponse) SetScore(v string) *QueryModelCommonscoreResponse {
	s.Score = &v
	return s
}

func (s *QueryModelCommonscoreResponse) SetTransNo(v string) *QueryModelCommonscoreResponse {
	s.TransNo = &v
	return s
}

type BatchqueryModelCommonscoreRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 用户ID
	UserIds []*string `json:"user_ids,omitempty" xml:"user_ids,omitempty" require:"true" type:"Repeated"`
	// 用户授权编码
	AuthNos []*string `json:"auth_nos,omitempty" xml:"auth_nos,omitempty" type:"Repeated"`
	// 模型编码
	ModelCode *string `json:"model_code,omitempty" xml:"model_code,omitempty" require:"true"`
	// 用户id类型（身份证号：ID_NO；手机号：MOBILE_NO）
	UserIdType *string `json:"user_id_type,omitempty" xml:"user_id_type,omitempty" require:"true"`
	// user_id 散列类型: "MD5"：MD5（小写）, "SHA256" ： SHA256（小写）， "SM3"： SM3（小写）
	HashType *string `json:"hash_type,omitempty" xml:"hash_type,omitempty" require:"true"`
	// 客户编码
	CustomerCode *string `json:"customer_code,omitempty" xml:"customer_code,omitempty" require:"true"`
	// 流水号，串联链路用，非必填
	TransNo *string `json:"trans_no,omitempty" xml:"trans_no,omitempty"`
	// hash_type类型的散列后的操作，默认为空不加密。 如启用，需要对散列后的user_id 加密，可选用如下算法，类型1、AES/ECB/PKCS5PADDING 在加密后的二进制需要以字符集UTF-8，编码base64 方式赋值给user_id传输。 示例：AES秘钥：base64_aes_key = "CZqWzQ5JL8s5Zx2XVpGZGw=="，报文：plaintext = "Hello, 蚂蚁。" ，使用算法： AES/ECB/PKCS5PADDING ；密文：SI1wU1ePSFoMy5YzuxclFkbZ/FIXUHPRDbKBW85WolY=，配置了此项user_id应该传输此密文。
	UserIdEncryptType *string `json:"user_id_encrypt_type,omitempty" xml:"user_id_encrypt_type,omitempty"`
}

func (s BatchqueryModelCommonscoreRequest) String() string {
	return tea.Prettify(s)
}

func (s BatchqueryModelCommonscoreRequest) GoString() string {
	return s.String()
}

func (s *BatchqueryModelCommonscoreRequest) SetAuthToken(v string) *BatchqueryModelCommonscoreRequest {
	s.AuthToken = &v
	return s
}

func (s *BatchqueryModelCommonscoreRequest) SetProductInstanceId(v string) *BatchqueryModelCommonscoreRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *BatchqueryModelCommonscoreRequest) SetUserIds(v []*string) *BatchqueryModelCommonscoreRequest {
	s.UserIds = v
	return s
}

func (s *BatchqueryModelCommonscoreRequest) SetAuthNos(v []*string) *BatchqueryModelCommonscoreRequest {
	s.AuthNos = v
	return s
}

func (s *BatchqueryModelCommonscoreRequest) SetModelCode(v string) *BatchqueryModelCommonscoreRequest {
	s.ModelCode = &v
	return s
}

func (s *BatchqueryModelCommonscoreRequest) SetUserIdType(v string) *BatchqueryModelCommonscoreRequest {
	s.UserIdType = &v
	return s
}

func (s *BatchqueryModelCommonscoreRequest) SetHashType(v string) *BatchqueryModelCommonscoreRequest {
	s.HashType = &v
	return s
}

func (s *BatchqueryModelCommonscoreRequest) SetCustomerCode(v string) *BatchqueryModelCommonscoreRequest {
	s.CustomerCode = &v
	return s
}

func (s *BatchqueryModelCommonscoreRequest) SetTransNo(v string) *BatchqueryModelCommonscoreRequest {
	s.TransNo = &v
	return s
}

func (s *BatchqueryModelCommonscoreRequest) SetUserIdEncryptType(v string) *BatchqueryModelCommonscoreRequest {
	s.UserIdEncryptType = &v
	return s
}

type BatchqueryModelCommonscoreResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 分数
	Scores []*string `json:"scores,omitempty" xml:"scores,omitempty" type:"Repeated"`
	// 意向
	Ratings []*string `json:"ratings,omitempty" xml:"ratings,omitempty" type:"Repeated"`
	// 流水号
	TransNo *string `json:"trans_no,omitempty" xml:"trans_no,omitempty"`
}

func (s BatchqueryModelCommonscoreResponse) String() string {
	return tea.Prettify(s)
}

func (s BatchqueryModelCommonscoreResponse) GoString() string {
	return s.String()
}

func (s *BatchqueryModelCommonscoreResponse) SetReqMsgId(v string) *BatchqueryModelCommonscoreResponse {
	s.ReqMsgId = &v
	return s
}

func (s *BatchqueryModelCommonscoreResponse) SetResultCode(v string) *BatchqueryModelCommonscoreResponse {
	s.ResultCode = &v
	return s
}

func (s *BatchqueryModelCommonscoreResponse) SetResultMsg(v string) *BatchqueryModelCommonscoreResponse {
	s.ResultMsg = &v
	return s
}

func (s *BatchqueryModelCommonscoreResponse) SetScores(v []*string) *BatchqueryModelCommonscoreResponse {
	s.Scores = v
	return s
}

func (s *BatchqueryModelCommonscoreResponse) SetRatings(v []*string) *BatchqueryModelCommonscoreResponse {
	s.Ratings = v
	return s
}

func (s *BatchqueryModelCommonscoreResponse) SetTransNo(v string) *BatchqueryModelCommonscoreResponse {
	s.TransNo = &v
	return s
}

type QueryModelMultiscoreRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 用户授权编码（授权渠道）
	//
	AuthNo *string `json:"auth_no,omitempty" xml:"auth_no,omitempty" require:"true"`
	// 规格编码(相应对接人负责)
	SpecCode *string `json:"spec_code,omitempty" xml:"spec_code,omitempty" require:"true"`
	// 用户id（客户身份证号/手机号的md5/sha256散列值）
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
	// 用户id类型（身份证号：ID_NO；手机号：MOBILE_NO）
	UserIdType *string `json:"user_id_type,omitempty" xml:"user_id_type,omitempty" require:"true"`
	// user_id 散列类型: "MD5"：MD5（小写）, "SHA256" ： SHA256（小写）， "SM3"： SM3（小写）
	HashType *string `json:"hash_type,omitempty" xml:"hash_type,omitempty" require:"true"`
	// 客户编码
	//
	CustomerCode *string `json:"customer_code,omitempty" xml:"customer_code,omitempty" require:"true"`
	// 流水号，串联链路用，非必填
	TransNo *string `json:"trans_no,omitempty" xml:"trans_no,omitempty"`
	// hash_type类型的散列后的操作，默认为空不加密。 如启用，需要对散列后的user_id 加密，可选用如下算法，类型1、AES/ECB/PKCS5PADDING 在加密后的二进制需要以字符集UTF-8，编码base64 方式赋值给user_id传输。 示例：AES秘钥：base64_aes_key = "CZqWzQ5JL8s5Zx2XVpGZGw=="，报文：plaintext = "Hello, 蚂蚁。" ，使用算法： AES/ECB/PKCS5PADDING ；密文：SI1wU1ePSFoMy5YzuxclFkbZ/FIXUHPRDbKBW85WolY=，配置了此项user_id应该传输此密文。
	UserIdEncryptType *string `json:"user_id_encrypt_type,omitempty" xml:"user_id_encrypt_type,omitempty"`
}

func (s QueryModelMultiscoreRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryModelMultiscoreRequest) GoString() string {
	return s.String()
}

func (s *QueryModelMultiscoreRequest) SetAuthToken(v string) *QueryModelMultiscoreRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryModelMultiscoreRequest) SetProductInstanceId(v string) *QueryModelMultiscoreRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryModelMultiscoreRequest) SetAuthNo(v string) *QueryModelMultiscoreRequest {
	s.AuthNo = &v
	return s
}

func (s *QueryModelMultiscoreRequest) SetSpecCode(v string) *QueryModelMultiscoreRequest {
	s.SpecCode = &v
	return s
}

func (s *QueryModelMultiscoreRequest) SetUserId(v string) *QueryModelMultiscoreRequest {
	s.UserId = &v
	return s
}

func (s *QueryModelMultiscoreRequest) SetUserIdType(v string) *QueryModelMultiscoreRequest {
	s.UserIdType = &v
	return s
}

func (s *QueryModelMultiscoreRequest) SetHashType(v string) *QueryModelMultiscoreRequest {
	s.HashType = &v
	return s
}

func (s *QueryModelMultiscoreRequest) SetCustomerCode(v string) *QueryModelMultiscoreRequest {
	s.CustomerCode = &v
	return s
}

func (s *QueryModelMultiscoreRequest) SetTransNo(v string) *QueryModelMultiscoreRequest {
	s.TransNo = &v
	return s
}

func (s *QueryModelMultiscoreRequest) SetUserIdEncryptType(v string) *QueryModelMultiscoreRequest {
	s.UserIdEncryptType = &v
	return s
}

type QueryModelMultiscoreResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 模型分
	Score *string `json:"score,omitempty" xml:"score,omitempty"`
	// 流水号
	TransNo *string `json:"trans_no,omitempty" xml:"trans_no,omitempty"`
}

func (s QueryModelMultiscoreResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryModelMultiscoreResponse) GoString() string {
	return s.String()
}

func (s *QueryModelMultiscoreResponse) SetReqMsgId(v string) *QueryModelMultiscoreResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryModelMultiscoreResponse) SetResultCode(v string) *QueryModelMultiscoreResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryModelMultiscoreResponse) SetResultMsg(v string) *QueryModelMultiscoreResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryModelMultiscoreResponse) SetScore(v string) *QueryModelMultiscoreResponse {
	s.Score = &v
	return s
}

func (s *QueryModelMultiscoreResponse) SetTransNo(v string) *QueryModelMultiscoreResponse {
	s.TransNo = &v
	return s
}

type QueryModelFusionmodelRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 融合模型编码
	FusionModelCode *string `json:"fusion_model_code,omitempty" xml:"fusion_model_code,omitempty" require:"true"`
	// 模型调用的id，一般是用户id 可能是用户手机号或者身份照号码的md5
	Identity *string `json:"identity,omitempty" xml:"identity,omitempty" require:"true"`
}

func (s QueryModelFusionmodelRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryModelFusionmodelRequest) GoString() string {
	return s.String()
}

func (s *QueryModelFusionmodelRequest) SetAuthToken(v string) *QueryModelFusionmodelRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryModelFusionmodelRequest) SetProductInstanceId(v string) *QueryModelFusionmodelRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryModelFusionmodelRequest) SetFusionModelCode(v string) *QueryModelFusionmodelRequest {
	s.FusionModelCode = &v
	return s
}

func (s *QueryModelFusionmodelRequest) SetIdentity(v string) *QueryModelFusionmodelRequest {
	s.Identity = &v
	return s
}

type QueryModelFusionmodelResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 融合模型调用结果
	Result *string `json:"result,omitempty" xml:"result,omitempty"`
	// 流水号
	TransNo *string `json:"trans_no,omitempty" xml:"trans_no,omitempty"`
}

func (s QueryModelFusionmodelResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryModelFusionmodelResponse) GoString() string {
	return s.String()
}

func (s *QueryModelFusionmodelResponse) SetReqMsgId(v string) *QueryModelFusionmodelResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryModelFusionmodelResponse) SetResultCode(v string) *QueryModelFusionmodelResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryModelFusionmodelResponse) SetResultMsg(v string) *QueryModelFusionmodelResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryModelFusionmodelResponse) SetResult(v string) *QueryModelFusionmodelResponse {
	s.Result = &v
	return s
}

func (s *QueryModelFusionmodelResponse) SetTransNo(v string) *QueryModelFusionmodelResponse {
	s.TransNo = &v
	return s
}

type QueryModelWorkscoreRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 用户名
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 身份证号码
	CardNo *string `json:"card_no,omitempty" xml:"card_no,omitempty" require:"true"`
	// 手机号
	Phone *string `json:"phone,omitempty" xml:"phone,omitempty" require:"true"`
	// 单位名称，以个体工商户、人才市场等方式缴纳的属于灵活就业人员，单位名称请填：GR
	EnterpriseName *string `json:"enterprise_name,omitempty" xml:"enterprise_name,omitempty" require:"true"`
	// 单位统一社会信用代码，
	// 单位名称为GR传空。
	OrganizationCode *string `json:"organization_code,omitempty" xml:"organization_code,omitempty"`
}

func (s QueryModelWorkscoreRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryModelWorkscoreRequest) GoString() string {
	return s.String()
}

func (s *QueryModelWorkscoreRequest) SetAuthToken(v string) *QueryModelWorkscoreRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryModelWorkscoreRequest) SetProductInstanceId(v string) *QueryModelWorkscoreRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryModelWorkscoreRequest) SetName(v string) *QueryModelWorkscoreRequest {
	s.Name = &v
	return s
}

func (s *QueryModelWorkscoreRequest) SetCardNo(v string) *QueryModelWorkscoreRequest {
	s.CardNo = &v
	return s
}

func (s *QueryModelWorkscoreRequest) SetPhone(v string) *QueryModelWorkscoreRequest {
	s.Phone = &v
	return s
}

func (s *QueryModelWorkscoreRequest) SetEnterpriseName(v string) *QueryModelWorkscoreRequest {
	s.EnterpriseName = &v
	return s
}

func (s *QueryModelWorkscoreRequest) SetOrganizationCode(v string) *QueryModelWorkscoreRequest {
	s.OrganizationCode = &v
	return s
}

type QueryModelWorkscoreResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 交易流水号
	TransNo *string `json:"trans_no,omitempty" xml:"trans_no,omitempty"`
	// 用工评分
	Score *string `json:"score,omitempty" xml:"score,omitempty"`
}

func (s QueryModelWorkscoreResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryModelWorkscoreResponse) GoString() string {
	return s.String()
}

func (s *QueryModelWorkscoreResponse) SetReqMsgId(v string) *QueryModelWorkscoreResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryModelWorkscoreResponse) SetResultCode(v string) *QueryModelWorkscoreResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryModelWorkscoreResponse) SetResultMsg(v string) *QueryModelWorkscoreResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryModelWorkscoreResponse) SetTransNo(v string) *QueryModelWorkscoreResponse {
	s.TransNo = &v
	return s
}

func (s *QueryModelWorkscoreResponse) SetScore(v string) *QueryModelWorkscoreResponse {
	s.Score = &v
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
				"sdk_version":      tea.String("1.0.46"),
				"_prod_code":       tea.String("COLLABINV"),
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

/**
 * Description: sse查询
 * Summary: sse查询
 */
func (client *Client) QueryAgentSse(request *QueryAgentSseRequest) (_result *QueryAgentSseResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAgentSseResponse{}
	_body, _err := client.QueryAgentSseEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: sse查询
 * Summary: sse查询
 */
func (client *Client) QueryAgentSseEx(request *QueryAgentSseRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAgentSseResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAgentSseResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.zkcollabinv.agent.sse.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 根据用户id查询用户会话列表
 * Summary: 根据用户id查询用户会话列表
 */
func (client *Client) ListAgentConversation(request *ListAgentConversationRequest) (_result *ListAgentConversationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListAgentConversationResponse{}
	_body, _err := client.ListAgentConversationEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 根据用户id查询用户会话列表
 * Summary: 根据用户id查询用户会话列表
 */
func (client *Client) ListAgentConversationEx(request *ListAgentConversationRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListAgentConversationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListAgentConversationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.zkcollabinv.agent.conversation.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 根据用户Id会话ID删除会话
 * Summary: 删除会话
 */
func (client *Client) DeleteAgentConversation(request *DeleteAgentConversationRequest) (_result *DeleteAgentConversationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DeleteAgentConversationResponse{}
	_body, _err := client.DeleteAgentConversationEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 根据用户Id会话ID删除会话
 * Summary: 删除会话
 */
func (client *Client) DeleteAgentConversationEx(request *DeleteAgentConversationRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DeleteAgentConversationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DeleteAgentConversationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.zkcollabinv.agent.conversation.delete"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 删除用户所有会话
 * Summary: 删除用户所有会话
 */
func (client *Client) BatchdeleteAgentConversation(request *BatchdeleteAgentConversationRequest) (_result *BatchdeleteAgentConversationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &BatchdeleteAgentConversationResponse{}
	_body, _err := client.BatchdeleteAgentConversationEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 删除用户所有会话
 * Summary: 删除用户所有会话
 */
func (client *Client) BatchdeleteAgentConversationEx(request *BatchdeleteAgentConversationRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *BatchdeleteAgentConversationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &BatchdeleteAgentConversationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.zkcollabinv.agent.conversation.batchdelete"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取会话消息列表
 * Summary: 获取会话消息列表
 */
func (client *Client) ListAgentMessage(request *ListAgentMessageRequest) (_result *ListAgentMessageResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListAgentMessageResponse{}
	_body, _err := client.ListAgentMessageEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取会话消息列表
 * Summary: 获取会话消息列表
 */
func (client *Client) ListAgentMessageEx(request *ListAgentMessageRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListAgentMessageResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListAgentMessageResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.zkcollabinv.agent.message.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 编辑会话信息
 * Summary: 编辑会话信息
 */
func (client *Client) UpdateAgentConversation(request *UpdateAgentConversationRequest) (_result *UpdateAgentConversationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateAgentConversationResponse{}
	_body, _err := client.UpdateAgentConversationEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 编辑会话信息
 * Summary: 编辑会话信息
 */
func (client *Client) UpdateAgentConversationEx(request *UpdateAgentConversationRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateAgentConversationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateAgentConversationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.zkcollabinv.agent.conversation.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: agent api 同步
 * Summary: agent api
 */
func (client *Client) QueryAgentCompletion(request *QueryAgentCompletionRequest) (_result *QueryAgentCompletionResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAgentCompletionResponse{}
	_body, _err := client.QueryAgentCompletionEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: agent api 同步
 * Summary: agent api
 */
func (client *Client) QueryAgentCompletionEx(request *QueryAgentCompletionRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAgentCompletionResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAgentCompletionResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.zkcollabinv.agent.completion.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: idMapping碰撞
 * Summary: idMapping碰撞
 */
func (client *Client) ImportIdmapSamplefile(request *ImportIdmapSamplefileRequest) (_result *ImportIdmapSamplefileResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ImportIdmapSamplefileResponse{}
	_body, _err := client.ImportIdmapSamplefileEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: idMapping碰撞
 * Summary: idMapping碰撞
 */
func (client *Client) ImportIdmapSamplefileEx(request *ImportIdmapSamplefileRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ImportIdmapSamplefileResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ImportIdmapSamplefileResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.zkcollabinv.idmap.samplefile.import"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: psi求交结果导入
 * Summary: psi求交结果导入
 */
func (client *Client) ImportIdmapPsiresultfile(request *ImportIdmapPsiresultfileRequest) (_result *ImportIdmapPsiresultfileResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ImportIdmapPsiresultfileResponse{}
	_body, _err := client.ImportIdmapPsiresultfileEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: psi求交结果导入
 * Summary: psi求交结果导入
 */
func (client *Client) ImportIdmapPsiresultfileEx(request *ImportIdmapPsiresultfileRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ImportIdmapPsiresultfileResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ImportIdmapPsiresultfileResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.zkcollabinv.idmap.psiresultfile.import"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 投行研究，品牌调用
 * Summary: 投行研究，品牌调用
 */
func (client *Client) QueryIndexresearchBrand(request *QueryIndexresearchBrandRequest) (_result *QueryIndexresearchBrandResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryIndexresearchBrandResponse{}
	_body, _err := client.QueryIndexresearchBrandEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 投行研究，品牌调用
 * Summary: 投行研究，品牌调用
 */
func (client *Client) QueryIndexresearchBrandEx(request *QueryIndexresearchBrandRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryIndexresearchBrandResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryIndexresearchBrandResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.zkcollabinv.indexresearch.brand.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 投行研究，查询品牌指标结果
 * Summary: 查询品牌指标
 */
func (client *Client) QueryIndexresearchBrandindex(request *QueryIndexresearchBrandindexRequest) (_result *QueryIndexresearchBrandindexResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryIndexresearchBrandindexResponse{}
	_body, _err := client.QueryIndexresearchBrandindexEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 投行研究，查询品牌指标结果
 * Summary: 查询品牌指标
 */
func (client *Client) QueryIndexresearchBrandindexEx(request *QueryIndexresearchBrandindexRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryIndexresearchBrandindexResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryIndexresearchBrandindexResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.zkcollabinv.indexresearch.brandindex.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 消费行业报告查询
 * Summary: 消费行业报告查询
 */
func (client *Client) QueryIndexresearchConsumeindustry(request *QueryIndexresearchConsumeindustryRequest) (_result *QueryIndexresearchConsumeindustryResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryIndexresearchConsumeindustryResponse{}
	_body, _err := client.QueryIndexresearchConsumeindustryEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 消费行业报告查询
 * Summary: 消费行业报告查询
 */
func (client *Client) QueryIndexresearchConsumeindustryEx(request *QueryIndexresearchConsumeindustryRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryIndexresearchConsumeindustryResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryIndexresearchConsumeindustryResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.zkcollabinv.indexresearch.consumeindustry.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 消费行业报告行业查询
 * Summary: 消费行业报告行业查询
 */
func (client *Client) QueryIndexresearchIndustry(request *QueryIndexresearchIndustryRequest) (_result *QueryIndexresearchIndustryResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryIndexresearchIndustryResponse{}
	_body, _err := client.QueryIndexresearchIndustryEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 消费行业报告行业查询
 * Summary: 消费行业报告行业查询
 */
func (client *Client) QueryIndexresearchIndustryEx(request *QueryIndexresearchIndustryRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryIndexresearchIndustryResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryIndexresearchIndustryResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.zkcollabinv.indexresearch.industry.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 基于交易数据的定位信息协查
 * Summary: 定位协查
 */
func (client *Client) QueryLocationInternal(request *QueryLocationInternalRequest) (_result *QueryLocationInternalResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryLocationInternalResponse{}
	_body, _err := client.QueryLocationInternalEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 基于交易数据的定位信息协查
 * Summary: 定位协查
 */
func (client *Client) QueryLocationInternalEx(request *QueryLocationInternalRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryLocationInternalResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryLocationInternalResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.zkcollabinv.location.internal.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 基于交易数据的定位信息协查对外接口
 * Summary: 定位协查对外接口
 */
func (client *Client) QueryLocationTrade(request *QueryLocationTradeRequest) (_result *QueryLocationTradeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryLocationTradeResponse{}
	_body, _err := client.QueryLocationTradeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 基于交易数据的定位信息协查对外接口
 * Summary: 定位协查对外接口
 */
func (client *Client) QueryLocationTradeEx(request *QueryLocationTradeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryLocationTradeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryLocationTradeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.zkcollabinv.location.trade.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 样本文件摘要
 * Summary: 样本文件摘要
 */
func (client *Client) PushModelSamplefile(request *PushModelSamplefileRequest) (_result *PushModelSamplefileResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PushModelSamplefileResponse{}
	_body, _err := client.PushModelSamplefileEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 样本文件摘要
 * Summary: 样本文件摘要
 */
func (client *Client) PushModelSamplefileEx(request *PushModelSamplefileRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PushModelSamplefileResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PushModelSamplefileResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.zkcollabinv.model.samplefile.push"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 样本任务执行
 * Summary: 样本任务执行
 */
func (client *Client) ExecModelSampletask(request *ExecModelSampletaskRequest) (_result *ExecModelSampletaskResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ExecModelSampletaskResponse{}
	_body, _err := client.ExecModelSampletaskEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 样本任务执行
 * Summary: 样本任务执行
 */
func (client *Client) ExecModelSampletaskEx(request *ExecModelSampletaskRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ExecModelSampletaskResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecModelSampletaskResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.zkcollabinv.model.sampletask.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 任务状态查询
 * Summary: 任务状态查询
 */
func (client *Client) QueryModelSampletask(request *QueryModelSampletaskRequest) (_result *QueryModelSampletaskResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryModelSampletaskResponse{}
	_body, _err := client.QueryModelSampletaskEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 任务状态查询
 * Summary: 任务状态查询
 */
func (client *Client) QueryModelSampletaskEx(request *QueryModelSampletaskRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryModelSampletaskResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryModelSampletaskResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.zkcollabinv.model.sampletask.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 特征集查询
 * Summary: 特征集查询
 */
func (client *Client) QueryModelFeatureset(request *QueryModelFeaturesetRequest) (_result *QueryModelFeaturesetResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryModelFeaturesetResponse{}
	_body, _err := client.QueryModelFeaturesetEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 特征集查询
 * Summary: 特征集查询
 */
func (client *Client) QueryModelFeaturesetEx(request *QueryModelFeaturesetRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryModelFeaturesetResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryModelFeaturesetResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.zkcollabinv.model.featureset.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 模型保存
 * Summary: 模型保存
 */
func (client *Client) SubmitModelInstance(request *SubmitModelInstanceRequest) (_result *SubmitModelInstanceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SubmitModelInstanceResponse{}
	_body, _err := client.SubmitModelInstanceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 模型保存
 * Summary: 模型保存
 */
func (client *Client) SubmitModelInstanceEx(request *SubmitModelInstanceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SubmitModelInstanceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SubmitModelInstanceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.zkcollabinv.model.instance.submit"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 模型调用统计查询
 * Summary: 模型调用统计查询
 */
func (client *Client) QueryModelStats(request *QueryModelStatsRequest) (_result *QueryModelStatsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryModelStatsResponse{}
	_body, _err := client.QueryModelStatsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 模型调用统计查询
 * Summary: 模型调用统计查询
 */
func (client *Client) QueryModelStatsEx(request *QueryModelStatsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryModelStatsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryModelStatsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.zkcollabinv.model.stats.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 通用查询
 * Summary: 通用查询
 */
func (client *Client) QueryModelCommonscore(request *QueryModelCommonscoreRequest) (_result *QueryModelCommonscoreResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryModelCommonscoreResponse{}
	_body, _err := client.QueryModelCommonscoreEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 通用查询
 * Summary: 通用查询
 */
func (client *Client) QueryModelCommonscoreEx(request *QueryModelCommonscoreRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryModelCommonscoreResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryModelCommonscoreResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.zkcollabinv.model.commonscore.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 通用查询批次，仅针对外部使用PIR场景
 * Summary: 通用查询批次
 */
func (client *Client) BatchqueryModelCommonscore(request *BatchqueryModelCommonscoreRequest) (_result *BatchqueryModelCommonscoreResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &BatchqueryModelCommonscoreResponse{}
	_body, _err := client.BatchqueryModelCommonscoreEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 通用查询批次，仅针对外部使用PIR场景
 * Summary: 通用查询批次
 */
func (client *Client) BatchqueryModelCommonscoreEx(request *BatchqueryModelCommonscoreRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *BatchqueryModelCommonscoreResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &BatchqueryModelCommonscoreResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.zkcollabinv.model.commonscore.batchquery"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 多模型预测值
 * Summary: 多模型预测值
 */
func (client *Client) QueryModelMultiscore(request *QueryModelMultiscoreRequest) (_result *QueryModelMultiscoreResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryModelMultiscoreResponse{}
	_body, _err := client.QueryModelMultiscoreEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 多模型预测值
 * Summary: 多模型预测值
 */
func (client *Client) QueryModelMultiscoreEx(request *QueryModelMultiscoreRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryModelMultiscoreResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryModelMultiscoreResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.zkcollabinv.model.multiscore.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 融合模型的调用
 * Summary: 融合模型调用
 */
func (client *Client) QueryModelFusionmodel(request *QueryModelFusionmodelRequest) (_result *QueryModelFusionmodelResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryModelFusionmodelResponse{}
	_body, _err := client.QueryModelFusionmodelEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 融合模型的调用
 * Summary: 融合模型调用
 */
func (client *Client) QueryModelFusionmodelEx(request *QueryModelFusionmodelRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryModelFusionmodelResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryModelFusionmodelResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.zkcollabinv.model.fusionmodel.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 用工分
 * Summary: 用工分调用
 */
func (client *Client) QueryModelWorkscore(request *QueryModelWorkscoreRequest) (_result *QueryModelWorkscoreResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryModelWorkscoreResponse{}
	_body, _err := client.QueryModelWorkscoreEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 用工分
 * Summary: 用工分调用
 */
func (client *Client) QueryModelWorkscoreEx(request *QueryModelWorkscoreRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryModelWorkscoreResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryModelWorkscoreResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.zkcollabinv.model.workscore.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
