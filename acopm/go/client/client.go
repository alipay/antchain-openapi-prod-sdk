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

// RateLimitEffectScopeValueDTO
type RateLimitEffectScopeValueDTO struct {
	// region
	Region *string `json:"region,omitempty" xml:"region,omitempty" require:"true"`
	// enabled
	Enabled *bool `json:"enabled,omitempty" xml:"enabled,omitempty" require:"true"`
	// limit
	Limit *int64 `json:"limit,omitempty" xml:"limit,omitempty" require:"true"`
	// timeDuration
	TimeDuration *string `json:"time_duration,omitempty" xml:"time_duration,omitempty" require:"true"`
}

func (s RateLimitEffectScopeValueDTO) String() string {
	return tea.Prettify(s)
}

func (s RateLimitEffectScopeValueDTO) GoString() string {
	return s.String()
}

func (s *RateLimitEffectScopeValueDTO) SetRegion(v string) *RateLimitEffectScopeValueDTO {
	s.Region = &v
	return s
}

func (s *RateLimitEffectScopeValueDTO) SetEnabled(v bool) *RateLimitEffectScopeValueDTO {
	s.Enabled = &v
	return s
}

func (s *RateLimitEffectScopeValueDTO) SetLimit(v int64) *RateLimitEffectScopeValueDTO {
	s.Limit = &v
	return s
}

func (s *RateLimitEffectScopeValueDTO) SetTimeDuration(v string) *RateLimitEffectScopeValueDTO {
	s.TimeDuration = &v
	return s
}

// RateLimitEffectScopeDTO
type RateLimitEffectScopeDTO struct {
	// RateLimitEffectScopeValueDTO list
	Values []*RateLimitEffectScopeValueDTO `json:"values,omitempty" xml:"values,omitempty" require:"true" type:"Repeated"`
}

func (s RateLimitEffectScopeDTO) String() string {
	return tea.Prettify(s)
}

func (s RateLimitEffectScopeDTO) GoString() string {
	return s.String()
}

func (s *RateLimitEffectScopeDTO) SetValues(v []*RateLimitEffectScopeValueDTO) *RateLimitEffectScopeDTO {
	s.Values = v
	return s
}

// 商业化规则项
type BusinessRuleItem struct {
	// 规则表达式
	Condition *string `json:"condition,omitempty" xml:"condition,omitempty" require:"true"`
	// 规则值
	Value *string `json:"value,omitempty" xml:"value,omitempty" require:"true"`
}

func (s BusinessRuleItem) String() string {
	return tea.Prettify(s)
}

func (s BusinessRuleItem) GoString() string {
	return s.String()
}

func (s *BusinessRuleItem) SetCondition(v string) *BusinessRuleItem {
	s.Condition = &v
	return s
}

func (s *BusinessRuleItem) SetValue(v string) *BusinessRuleItem {
	s.Value = &v
	return s
}

// updateScopeValue
type UpdateScopeValue struct {
	// CN-HANGZHOU-FINANCE
	Region *string `json:"region,omitempty" xml:"region,omitempty" require:"true"`
	// 限流值
	Limit *int64 `json:"limit,omitempty" xml:"limit,omitempty" require:"true"`
	// 生效与否
	Enabled *bool `json:"enabled,omitempty" xml:"enabled,omitempty" require:"true"`
	// 时间单位
	TimeDuration *string `json:"time_duration,omitempty" xml:"time_duration,omitempty" require:"true"`
}

func (s UpdateScopeValue) String() string {
	return tea.Prettify(s)
}

func (s UpdateScopeValue) GoString() string {
	return s.String()
}

func (s *UpdateScopeValue) SetRegion(v string) *UpdateScopeValue {
	s.Region = &v
	return s
}

func (s *UpdateScopeValue) SetLimit(v int64) *UpdateScopeValue {
	s.Limit = &v
	return s
}

func (s *UpdateScopeValue) SetEnabled(v bool) *UpdateScopeValue {
	s.Enabled = &v
	return s
}

func (s *UpdateScopeValue) SetTimeDuration(v string) *UpdateScopeValue {
	s.TimeDuration = &v
	return s
}

// 商业化规则
type BusinessRule struct {
	// 规则类型（BUSINESS/INSTANCE/TENANT_WHITELIST）
	RuleType *string `json:"rule_type,omitempty" xml:"rule_type,omitempty" require:"true"`
	// 规则项列表
	RuleItems []*BusinessRuleItem `json:"rule_items,omitempty" xml:"rule_items,omitempty" require:"true" type:"Repeated"`
}

func (s BusinessRule) String() string {
	return tea.Prettify(s)
}

func (s BusinessRule) GoString() string {
	return s.String()
}

func (s *BusinessRule) SetRuleType(v string) *BusinessRule {
	s.RuleType = &v
	return s
}

func (s *BusinessRule) SetRuleItems(v []*BusinessRuleItem) *BusinessRule {
	s.RuleItems = v
	return s
}

// sdk打包结果
type MultiSdkItem struct {
	// 任务id
	TaskUniqueId *string `json:"task_unique_id,omitempty" xml:"task_unique_id,omitempty" require:"true"`
	// 产品码
	ProdCode *string `json:"prod_code,omitempty" xml:"prod_code,omitempty" require:"true"`
	// sdk版本
	SaassdkVersion *string `json:"saassdk_version,omitempty" xml:"saassdk_version,omitempty" require:"true"`
	// sdk语言
	Lang *string `json:"lang,omitempty" xml:"lang,omitempty" require:"true"`
	// 发布仓库
	Repo *string `json:"repo,omitempty" xml:"repo,omitempty" require:"true"`
	// 发布地址
	Address *string `json:"address,omitempty" xml:"address,omitempty" require:"true"`
	// 开始时间
	StartTme *string `json:"start_tme,omitempty" xml:"start_tme,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 花费时间
	Cost *int64 `json:"cost,omitempty" xml:"cost,omitempty" require:"true"`
	// 结束时间
	EndTime *string `json:"end_time,omitempty" xml:"end_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 打包状态
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 查看链接
	PreviewLink *string `json:"preview_link,omitempty" xml:"preview_link,omitempty"`
	// 依赖
	Dependency *string `json:"dependency,omitempty" xml:"dependency,omitempty"`
}

func (s MultiSdkItem) String() string {
	return tea.Prettify(s)
}

func (s MultiSdkItem) GoString() string {
	return s.String()
}

func (s *MultiSdkItem) SetTaskUniqueId(v string) *MultiSdkItem {
	s.TaskUniqueId = &v
	return s
}

func (s *MultiSdkItem) SetProdCode(v string) *MultiSdkItem {
	s.ProdCode = &v
	return s
}

func (s *MultiSdkItem) SetSaassdkVersion(v string) *MultiSdkItem {
	s.SaassdkVersion = &v
	return s
}

func (s *MultiSdkItem) SetLang(v string) *MultiSdkItem {
	s.Lang = &v
	return s
}

func (s *MultiSdkItem) SetRepo(v string) *MultiSdkItem {
	s.Repo = &v
	return s
}

func (s *MultiSdkItem) SetAddress(v string) *MultiSdkItem {
	s.Address = &v
	return s
}

func (s *MultiSdkItem) SetStartTme(v string) *MultiSdkItem {
	s.StartTme = &v
	return s
}

func (s *MultiSdkItem) SetCost(v int64) *MultiSdkItem {
	s.Cost = &v
	return s
}

func (s *MultiSdkItem) SetEndTime(v string) *MultiSdkItem {
	s.EndTime = &v
	return s
}

func (s *MultiSdkItem) SetStatus(v string) *MultiSdkItem {
	s.Status = &v
	return s
}

func (s *MultiSdkItem) SetPreviewLink(v string) *MultiSdkItem {
	s.PreviewLink = &v
	return s
}

func (s *MultiSdkItem) SetDependency(v string) *MultiSdkItem {
	s.Dependency = &v
	return s
}

// UpdateRateLimit
type UpdateRateLimit struct {
	// api_name
	ApiName *string `json:"api_name,omitempty" xml:"api_name,omitempty" require:"true"`
	// provider_id
	ProviderId *string `json:"provider_id,omitempty" xml:"provider_id,omitempty" require:"true"`
	// update_scope_value
	UpdateScopeValue *UpdateScopeValue `json:"update_scope_value,omitempty" xml:"update_scope_value,omitempty" require:"true"`
}

func (s UpdateRateLimit) String() string {
	return tea.Prettify(s)
}

func (s UpdateRateLimit) GoString() string {
	return s.String()
}

func (s *UpdateRateLimit) SetApiName(v string) *UpdateRateLimit {
	s.ApiName = &v
	return s
}

func (s *UpdateRateLimit) SetProviderId(v string) *UpdateRateLimit {
	s.ProviderId = &v
	return s
}

func (s *UpdateRateLimit) SetUpdateScopeValue(v *UpdateScopeValue) *UpdateRateLimit {
	s.UpdateScopeValue = v
	return s
}

// api限流信息
type RateLimitDetail struct {
	// apiName
	ApiName *string `json:"api_name,omitempty" xml:"api_name,omitempty" require:"true"`
	// provider_id
	ProviderId *string `json:"provider_id,omitempty" xml:"provider_id,omitempty" require:"true"`
	// 租户ID
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 已使用量
	Used *int64 `json:"used,omitempty" xml:"used,omitempty"`
	// effectScope
	EffectScope *RateLimitEffectScopeDTO `json:"effect_scope,omitempty" xml:"effect_scope,omitempty"`
}

func (s RateLimitDetail) String() string {
	return tea.Prettify(s)
}

func (s RateLimitDetail) GoString() string {
	return s.String()
}

func (s *RateLimitDetail) SetApiName(v string) *RateLimitDetail {
	s.ApiName = &v
	return s
}

func (s *RateLimitDetail) SetProviderId(v string) *RateLimitDetail {
	s.ProviderId = &v
	return s
}

func (s *RateLimitDetail) SetTenantId(v string) *RateLimitDetail {
	s.TenantId = &v
	return s
}

func (s *RateLimitDetail) SetUsed(v int64) *RateLimitDetail {
	s.Used = &v
	return s
}

func (s *RateLimitDetail) SetEffectScope(v *RateLimitEffectScopeDTO) *RateLimitDetail {
	s.EffectScope = v
	return s
}

// user信息
type BucUser struct {
	// 工号
	EmpId *string `json:"emp_id,omitempty" xml:"emp_id,omitempty" require:"true"`
	// 域账号
	EmailPrefix *string `json:"email_prefix,omitempty" xml:"email_prefix,omitempty" require:"true"`
	// 花名
	NickName *string `json:"nick_name,omitempty" xml:"nick_name,omitempty"`
}

func (s BucUser) String() string {
	return tea.Prettify(s)
}

func (s BucUser) GoString() string {
	return s.String()
}

func (s *BucUser) SetEmpId(v string) *BucUser {
	s.EmpId = &v
	return s
}

func (s *BucUser) SetEmailPrefix(v string) *BucUser {
	s.EmailPrefix = &v
	return s
}

func (s *BucUser) SetNickName(v string) *BucUser {
	s.NickName = &v
	return s
}

// api信息结构体
type ApiInfoModel struct {
	// API名称
	ApiName *string `json:"api_name,omitempty" xml:"api_name,omitempty" require:"true"`
	// 网关产品码
	ProdCode *string `json:"prod_code,omitempty" xml:"prod_code,omitempty" require:"true"`
	// 是否是内部接口 0对外 1对内
	Internal *int64 `json:"internal,omitempty" xml:"internal,omitempty" require:"true"`
	// API版本号
	ApiVersion *string `json:"api_version,omitempty" xml:"api_version,omitempty" require:"true"`
	// API描述
	ApiDesc *string `json:"api_desc,omitempty" xml:"api_desc,omitempty" require:"true"`
	// api所属网关产品id
	ProviderId *string `json:"provider_id,omitempty" xml:"provider_id,omitempty" require:"true"`
}

func (s ApiInfoModel) String() string {
	return tea.Prettify(s)
}

func (s ApiInfoModel) GoString() string {
	return s.String()
}

func (s *ApiInfoModel) SetApiName(v string) *ApiInfoModel {
	s.ApiName = &v
	return s
}

func (s *ApiInfoModel) SetProdCode(v string) *ApiInfoModel {
	s.ProdCode = &v
	return s
}

func (s *ApiInfoModel) SetInternal(v int64) *ApiInfoModel {
	s.Internal = &v
	return s
}

func (s *ApiInfoModel) SetApiVersion(v string) *ApiInfoModel {
	s.ApiVersion = &v
	return s
}

func (s *ApiInfoModel) SetApiDesc(v string) *ApiInfoModel {
	s.ApiDesc = &v
	return s
}

func (s *ApiInfoModel) SetProviderId(v string) *ApiInfoModel {
	s.ProviderId = &v
	return s
}

// sdk的maven依赖信息
type SdkMavenDependencyInfo struct {
	// client端依赖
	ReferenceClient *string `json:"reference_client,omitempty" xml:"reference_client,omitempty" require:"true"`
	// server端依赖
	ReferencServer *string `json:"referenc_server,omitempty" xml:"referenc_server,omitempty" require:"true"`
	// client端maven仓库地址
	MavenLinkClient *string `json:"maven_link_client,omitempty" xml:"maven_link_client,omitempty" require:"true"`
	// server端maven仓库地址
	MavenLinkServer *string `json:"maven_link_server,omitempty" xml:"maven_link_server,omitempty" require:"true"`
}

func (s SdkMavenDependencyInfo) String() string {
	return tea.Prettify(s)
}

func (s SdkMavenDependencyInfo) GoString() string {
	return s.String()
}

func (s *SdkMavenDependencyInfo) SetReferenceClient(v string) *SdkMavenDependencyInfo {
	s.ReferenceClient = &v
	return s
}

func (s *SdkMavenDependencyInfo) SetReferencServer(v string) *SdkMavenDependencyInfo {
	s.ReferencServer = &v
	return s
}

func (s *SdkMavenDependencyInfo) SetMavenLinkClient(v string) *SdkMavenDependencyInfo {
	s.MavenLinkClient = &v
	return s
}

func (s *SdkMavenDependencyInfo) SetMavenLinkServer(v string) *SdkMavenDependencyInfo {
	s.MavenLinkServer = &v
	return s
}

// 产品信息
type ProductInfo struct {
	// 产品码
	ProdCode *string `json:"prod_code,omitempty" xml:"prod_code,omitempty" require:"true"`
	// sdk版本号
	SdkVersion *string `json:"sdk_version,omitempty" xml:"sdk_version,omitempty" require:"true"`
}

func (s ProductInfo) String() string {
	return tea.Prettify(s)
}

func (s ProductInfo) GoString() string {
	return s.String()
}

func (s *ProductInfo) SetProdCode(v string) *ProductInfo {
	s.ProdCode = &v
	return s
}

func (s *ProductInfo) SetSdkVersion(v string) *ProductInfo {
	s.SdkVersion = &v
	return s
}

type ListProductRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 用户域账号
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty"`
	// 产品关键字
	Keyword *string `json:"keyword,omitempty" xml:"keyword,omitempty"`
	// 每页记录
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// 当前页面
	CurrentPage *int64 `json:"current_page,omitempty" xml:"current_page,omitempty"`
}

func (s ListProductRequest) String() string {
	return tea.Prettify(s)
}

func (s ListProductRequest) GoString() string {
	return s.String()
}

func (s *ListProductRequest) SetAuthToken(v string) *ListProductRequest {
	s.AuthToken = &v
	return s
}

func (s *ListProductRequest) SetUserId(v string) *ListProductRequest {
	s.UserId = &v
	return s
}

func (s *ListProductRequest) SetKeyword(v string) *ListProductRequest {
	s.Keyword = &v
	return s
}

func (s *ListProductRequest) SetPageSize(v int64) *ListProductRequest {
	s.PageSize = &v
	return s
}

func (s *ListProductRequest) SetCurrentPage(v int64) *ListProductRequest {
	s.CurrentPage = &v
	return s
}

type ListProductResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 产品列表
	Products []*ProductInfo `json:"products,omitempty" xml:"products,omitempty" type:"Repeated"`
	// 记录总数
	TotalCount *int64 `json:"total_count,omitempty" xml:"total_count,omitempty"`
}

func (s ListProductResponse) String() string {
	return tea.Prettify(s)
}

func (s ListProductResponse) GoString() string {
	return s.String()
}

func (s *ListProductResponse) SetReqMsgId(v string) *ListProductResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListProductResponse) SetResultCode(v string) *ListProductResponse {
	s.ResultCode = &v
	return s
}

func (s *ListProductResponse) SetResultMsg(v string) *ListProductResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListProductResponse) SetProducts(v []*ProductInfo) *ListProductResponse {
	s.Products = v
	return s
}

func (s *ListProductResponse) SetTotalCount(v int64) *ListProductResponse {
	s.TotalCount = &v
	return s
}

type CallbackMultisdkRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 回调JSON报文
	Body *string `json:"body,omitempty" xml:"body,omitempty"`
}

func (s CallbackMultisdkRequest) String() string {
	return tea.Prettify(s)
}

func (s CallbackMultisdkRequest) GoString() string {
	return s.String()
}

func (s *CallbackMultisdkRequest) SetAuthToken(v string) *CallbackMultisdkRequest {
	s.AuthToken = &v
	return s
}

func (s *CallbackMultisdkRequest) SetBody(v string) *CallbackMultisdkRequest {
	s.Body = &v
	return s
}

type CallbackMultisdkResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CallbackMultisdkResponse) String() string {
	return tea.Prettify(s)
}

func (s CallbackMultisdkResponse) GoString() string {
	return s.String()
}

func (s *CallbackMultisdkResponse) SetReqMsgId(v string) *CallbackMultisdkResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CallbackMultisdkResponse) SetResultCode(v string) *CallbackMultisdkResponse {
	s.ResultCode = &v
	return s
}

func (s *CallbackMultisdkResponse) SetResultMsg(v string) *CallbackMultisdkResponse {
	s.ResultMsg = &v
	return s
}

type CreateProductRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 产品码
	ProdCode *string `json:"prod_code,omitempty" xml:"prod_code,omitempty" require:"true"`
	// 英文名
	NameEn *string `json:"name_en,omitempty" xml:"name_en,omitempty" require:"true"`
	// 中文名
	NameCn *string `json:"name_cn,omitempty" xml:"name_cn,omitempty" require:"true"`
	// 描述
	Description *string `json:"description,omitempty" xml:"description,omitempty" require:"true"`
	// zoujili.zjl
	OwnerId *string `json:"owner_id,omitempty" xml:"owner_id,omitempty" require:"true"`
	// 成员域账号，用于同步权限
	MemberList []*string `json:"member_list,omitempty" xml:"member_list,omitempty" type:"Repeated"`
}

func (s CreateProductRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateProductRequest) GoString() string {
	return s.String()
}

func (s *CreateProductRequest) SetAuthToken(v string) *CreateProductRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateProductRequest) SetProdCode(v string) *CreateProductRequest {
	s.ProdCode = &v
	return s
}

func (s *CreateProductRequest) SetNameEn(v string) *CreateProductRequest {
	s.NameEn = &v
	return s
}

func (s *CreateProductRequest) SetNameCn(v string) *CreateProductRequest {
	s.NameCn = &v
	return s
}

func (s *CreateProductRequest) SetDescription(v string) *CreateProductRequest {
	s.Description = &v
	return s
}

func (s *CreateProductRequest) SetOwnerId(v string) *CreateProductRequest {
	s.OwnerId = &v
	return s
}

func (s *CreateProductRequest) SetMemberList(v []*string) *CreateProductRequest {
	s.MemberList = v
	return s
}

type CreateProductResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CreateProductResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateProductResponse) GoString() string {
	return s.String()
}

func (s *CreateProductResponse) SetReqMsgId(v string) *CreateProductResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateProductResponse) SetResultCode(v string) *CreateProductResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateProductResponse) SetResultMsg(v string) *CreateProductResponse {
	s.ResultMsg = &v
	return s
}

type InitProductRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 产品码
	ProdCode *string `json:"prod_code,omitempty" xml:"prod_code,omitempty" require:"true"`
	// 品牌名
	FirstName *string `json:"first_name,omitempty" xml:"first_name,omitempty" require:"true"`
	// 产品标识
	SecondName *string `json:"second_name,omitempty" xml:"second_name,omitempty" require:"true"`
	// api类型，tr或http(不区分大小写)
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
}

func (s InitProductRequest) String() string {
	return tea.Prettify(s)
}

func (s InitProductRequest) GoString() string {
	return s.String()
}

func (s *InitProductRequest) SetAuthToken(v string) *InitProductRequest {
	s.AuthToken = &v
	return s
}

func (s *InitProductRequest) SetProdCode(v string) *InitProductRequest {
	s.ProdCode = &v
	return s
}

func (s *InitProductRequest) SetFirstName(v string) *InitProductRequest {
	s.FirstName = &v
	return s
}

func (s *InitProductRequest) SetSecondName(v string) *InitProductRequest {
	s.SecondName = &v
	return s
}

func (s *InitProductRequest) SetType(v string) *InitProductRequest {
	s.Type = &v
	return s
}

type InitProductResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s InitProductResponse) String() string {
	return tea.Prettify(s)
}

func (s InitProductResponse) GoString() string {
	return s.String()
}

func (s *InitProductResponse) SetReqMsgId(v string) *InitProductResponse {
	s.ReqMsgId = &v
	return s
}

func (s *InitProductResponse) SetResultCode(v string) *InitProductResponse {
	s.ResultCode = &v
	return s
}

func (s *InitProductResponse) SetResultMsg(v string) *InitProductResponse {
	s.ResultMsg = &v
	return s
}

type DeleteProductRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// YUNYOU
	ProdCode *string `json:"prod_code,omitempty" xml:"prod_code,omitempty" require:"true"`
}

func (s DeleteProductRequest) String() string {
	return tea.Prettify(s)
}

func (s DeleteProductRequest) GoString() string {
	return s.String()
}

func (s *DeleteProductRequest) SetAuthToken(v string) *DeleteProductRequest {
	s.AuthToken = &v
	return s
}

func (s *DeleteProductRequest) SetProdCode(v string) *DeleteProductRequest {
	s.ProdCode = &v
	return s
}

type DeleteProductResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s DeleteProductResponse) String() string {
	return tea.Prettify(s)
}

func (s DeleteProductResponse) GoString() string {
	return s.String()
}

func (s *DeleteProductResponse) SetReqMsgId(v string) *DeleteProductResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DeleteProductResponse) SetResultCode(v string) *DeleteProductResponse {
	s.ResultCode = &v
	return s
}

func (s *DeleteProductResponse) SetResultMsg(v string) *DeleteProductResponse {
	s.ResultMsg = &v
	return s
}

type PublishProductSdkRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 产品码
	ProdCode *string `json:"prod_code,omitempty" xml:"prod_code,omitempty" require:"true"`
	// 版本号。生成的sdk的最终版本号格式为<publish_version>.<platform_origin>
	PublishVersion *string `json:"publish_version,omitempty" xml:"publish_version,omitempty" require:"true"`
	// sdk发布请求来源。生成的sdk的最终版本号格式为<publish_version>.<platform_origin>。
	PlatformOrigin *string `json:"platform_origin,omitempty" xml:"platform_origin,omitempty" require:"true"`
}

func (s PublishProductSdkRequest) String() string {
	return tea.Prettify(s)
}

func (s PublishProductSdkRequest) GoString() string {
	return s.String()
}

func (s *PublishProductSdkRequest) SetAuthToken(v string) *PublishProductSdkRequest {
	s.AuthToken = &v
	return s
}

func (s *PublishProductSdkRequest) SetProdCode(v string) *PublishProductSdkRequest {
	s.ProdCode = &v
	return s
}

func (s *PublishProductSdkRequest) SetPublishVersion(v string) *PublishProductSdkRequest {
	s.PublishVersion = &v
	return s
}

func (s *PublishProductSdkRequest) SetPlatformOrigin(v string) *PublishProductSdkRequest {
	s.PlatformOrigin = &v
	return s
}

type PublishProductSdkResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// maven sdk依赖信息
	SdkMavenDependencyInfo *SdkMavenDependencyInfo `json:"sdk_maven_dependency_info,omitempty" xml:"sdk_maven_dependency_info,omitempty"`
}

func (s PublishProductSdkResponse) String() string {
	return tea.Prettify(s)
}

func (s PublishProductSdkResponse) GoString() string {
	return s.String()
}

func (s *PublishProductSdkResponse) SetReqMsgId(v string) *PublishProductSdkResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PublishProductSdkResponse) SetResultCode(v string) *PublishProductSdkResponse {
	s.ResultCode = &v
	return s
}

func (s *PublishProductSdkResponse) SetResultMsg(v string) *PublishProductSdkResponse {
	s.ResultMsg = &v
	return s
}

func (s *PublishProductSdkResponse) SetSdkMavenDependencyInfo(v *SdkMavenDependencyInfo) *PublishProductSdkResponse {
	s.SdkMavenDependencyInfo = v
	return s
}

type GetSdkRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 产品码
	ProdCode *string `json:"prod_code,omitempty" xml:"prod_code,omitempty" require:"true"`
	// 版本号
	ApiVersion *string `json:"api_version,omitempty" xml:"api_version,omitempty" require:"true"`
}

func (s GetSdkRequest) String() string {
	return tea.Prettify(s)
}

func (s GetSdkRequest) GoString() string {
	return s.String()
}

func (s *GetSdkRequest) SetAuthToken(v string) *GetSdkRequest {
	s.AuthToken = &v
	return s
}

func (s *GetSdkRequest) SetProdCode(v string) *GetSdkRequest {
	s.ProdCode = &v
	return s
}

func (s *GetSdkRequest) SetApiVersion(v string) *GetSdkRequest {
	s.ApiVersion = &v
	return s
}

type GetSdkResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// xml内容
	Content *string `json:"content,omitempty" xml:"content,omitempty"`
}

func (s GetSdkResponse) String() string {
	return tea.Prettify(s)
}

func (s GetSdkResponse) GoString() string {
	return s.String()
}

func (s *GetSdkResponse) SetReqMsgId(v string) *GetSdkResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetSdkResponse) SetResultCode(v string) *GetSdkResponse {
	s.ResultCode = &v
	return s
}

func (s *GetSdkResponse) SetResultMsg(v string) *GetSdkResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetSdkResponse) SetContent(v string) *GetSdkResponse {
	s.Content = &v
	return s
}

type PublishProductSaassdkRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 要发布的共享能力名称
	SaasCode *string `json:"saas_code,omitempty" xml:"saas_code,omitempty" require:"true"`
	// 本次打包的版本
	SaassdkVersion *string `json:"saassdk_version,omitempty" xml:"saassdk_version,omitempty" require:"true"`
	// 是否发布
	Publish *bool `json:"publish,omitempty" xml:"publish,omitempty" require:"true"`
}

func (s PublishProductSaassdkRequest) String() string {
	return tea.Prettify(s)
}

func (s PublishProductSaassdkRequest) GoString() string {
	return s.String()
}

func (s *PublishProductSaassdkRequest) SetAuthToken(v string) *PublishProductSaassdkRequest {
	s.AuthToken = &v
	return s
}

func (s *PublishProductSaassdkRequest) SetSaasCode(v string) *PublishProductSaassdkRequest {
	s.SaasCode = &v
	return s
}

func (s *PublishProductSaassdkRequest) SetSaassdkVersion(v string) *PublishProductSaassdkRequest {
	s.SaassdkVersion = &v
	return s
}

func (s *PublishProductSaassdkRequest) SetPublish(v bool) *PublishProductSaassdkRequest {
	s.Publish = &v
	return s
}

type PublishProductSaassdkResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s PublishProductSaassdkResponse) String() string {
	return tea.Prettify(s)
}

func (s PublishProductSaassdkResponse) GoString() string {
	return s.String()
}

func (s *PublishProductSaassdkResponse) SetReqMsgId(v string) *PublishProductSaassdkResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PublishProductSaassdkResponse) SetResultCode(v string) *PublishProductSaassdkResponse {
	s.ResultCode = &v
	return s
}

func (s *PublishProductSaassdkResponse) SetResultMsg(v string) *PublishProductSaassdkResponse {
	s.ResultMsg = &v
	return s
}

func (s *PublishProductSaassdkResponse) SetSuccess(v bool) *PublishProductSaassdkResponse {
	s.Success = &v
	return s
}

type GetProductSaassdkRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 共享能力码
	SaasCode *string `json:"saas_code,omitempty" xml:"saas_code,omitempty" require:"true"`
}

func (s GetProductSaassdkRequest) String() string {
	return tea.Prettify(s)
}

func (s GetProductSaassdkRequest) GoString() string {
	return s.String()
}

func (s *GetProductSaassdkRequest) SetAuthToken(v string) *GetProductSaassdkRequest {
	s.AuthToken = &v
	return s
}

func (s *GetProductSaassdkRequest) SetSaasCode(v string) *GetProductSaassdkRequest {
	s.SaasCode = &v
	return s
}

type GetProductSaassdkResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 当前的sdk版本
	CurrentVersion *string `json:"current_version,omitempty" xml:"current_version,omitempty"`
	// 要发布的版本
	PublishVersion *string `json:"publish_version,omitempty" xml:"publish_version,omitempty"`
	// 打包是否正在进行
	TaskRunning *bool `json:"task_running,omitempty" xml:"task_running,omitempty"`
	// 已经过发布的sdk
	PublishedSdks []*MultiSdkItem `json:"published_sdks,omitempty" xml:"published_sdks,omitempty" type:"Repeated"`
	// 任务状态
	TaskStatus *string `json:"task_status,omitempty" xml:"task_status,omitempty"`
	// 任务码
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty"`
}

func (s GetProductSaassdkResponse) String() string {
	return tea.Prettify(s)
}

func (s GetProductSaassdkResponse) GoString() string {
	return s.String()
}

func (s *GetProductSaassdkResponse) SetReqMsgId(v string) *GetProductSaassdkResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetProductSaassdkResponse) SetResultCode(v string) *GetProductSaassdkResponse {
	s.ResultCode = &v
	return s
}

func (s *GetProductSaassdkResponse) SetResultMsg(v string) *GetProductSaassdkResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetProductSaassdkResponse) SetCurrentVersion(v string) *GetProductSaassdkResponse {
	s.CurrentVersion = &v
	return s
}

func (s *GetProductSaassdkResponse) SetPublishVersion(v string) *GetProductSaassdkResponse {
	s.PublishVersion = &v
	return s
}

func (s *GetProductSaassdkResponse) SetTaskRunning(v bool) *GetProductSaassdkResponse {
	s.TaskRunning = &v
	return s
}

func (s *GetProductSaassdkResponse) SetPublishedSdks(v []*MultiSdkItem) *GetProductSaassdkResponse {
	s.PublishedSdks = v
	return s
}

func (s *GetProductSaassdkResponse) SetTaskStatus(v string) *GetProductSaassdkResponse {
	s.TaskStatus = &v
	return s
}

func (s *GetProductSaassdkResponse) SetTaskId(v string) *GetProductSaassdkResponse {
	s.TaskId = &v
	return s
}

type AddProductMemberRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// user_id
	MemberList []*string `json:"member_list,omitempty" xml:"member_list,omitempty" require:"true" type:"Repeated"`
	// 产品码
	ProdCode *string `json:"prod_code,omitempty" xml:"prod_code,omitempty" require:"true"`
}

func (s AddProductMemberRequest) String() string {
	return tea.Prettify(s)
}

func (s AddProductMemberRequest) GoString() string {
	return s.String()
}

func (s *AddProductMemberRequest) SetAuthToken(v string) *AddProductMemberRequest {
	s.AuthToken = &v
	return s
}

func (s *AddProductMemberRequest) SetMemberList(v []*string) *AddProductMemberRequest {
	s.MemberList = v
	return s
}

func (s *AddProductMemberRequest) SetProdCode(v string) *AddProductMemberRequest {
	s.ProdCode = &v
	return s
}

type AddProductMemberResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s AddProductMemberResponse) String() string {
	return tea.Prettify(s)
}

func (s AddProductMemberResponse) GoString() string {
	return s.String()
}

func (s *AddProductMemberResponse) SetReqMsgId(v string) *AddProductMemberResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AddProductMemberResponse) SetResultCode(v string) *AddProductMemberResponse {
	s.ResultCode = &v
	return s
}

func (s *AddProductMemberResponse) SetResultMsg(v string) *AddProductMemberResponse {
	s.ResultMsg = &v
	return s
}

type QueryApiRatelimitRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// api名
	ApiNameList []*string `json:"api_name_list,omitempty" xml:"api_name_list,omitempty" require:"true" type:"Repeated"`
}

func (s QueryApiRatelimitRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryApiRatelimitRequest) GoString() string {
	return s.String()
}

func (s *QueryApiRatelimitRequest) SetAuthToken(v string) *QueryApiRatelimitRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryApiRatelimitRequest) SetApiNameList(v []*string) *QueryApiRatelimitRequest {
	s.ApiNameList = v
	return s
}

type QueryApiRatelimitResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 限流信息
	RateLimitDetailList []*RateLimitDetail `json:"rate_limit_detail_list,omitempty" xml:"rate_limit_detail_list,omitempty" type:"Repeated"`
}

func (s QueryApiRatelimitResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryApiRatelimitResponse) GoString() string {
	return s.String()
}

func (s *QueryApiRatelimitResponse) SetReqMsgId(v string) *QueryApiRatelimitResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryApiRatelimitResponse) SetResultCode(v string) *QueryApiRatelimitResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryApiRatelimitResponse) SetResultMsg(v string) *QueryApiRatelimitResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryApiRatelimitResponse) SetRateLimitDetailList(v []*RateLimitDetail) *QueryApiRatelimitResponse {
	s.RateLimitDetailList = v
	return s
}

type QueryTenantRatelimitRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 租户id
	TenantIdList []*string `json:"tenant_id_list,omitempty" xml:"tenant_id_list,omitempty" require:"true" type:"Repeated"`
	// api名
	ApiNameList []*string `json:"api_name_list,omitempty" xml:"api_name_list,omitempty" require:"true" type:"Repeated"`
}

func (s QueryTenantRatelimitRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryTenantRatelimitRequest) GoString() string {
	return s.String()
}

func (s *QueryTenantRatelimitRequest) SetAuthToken(v string) *QueryTenantRatelimitRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryTenantRatelimitRequest) SetTenantIdList(v []*string) *QueryTenantRatelimitRequest {
	s.TenantIdList = v
	return s
}

func (s *QueryTenantRatelimitRequest) SetApiNameList(v []*string) *QueryTenantRatelimitRequest {
	s.ApiNameList = v
	return s
}

type QueryTenantRatelimitResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 限流信息
	RateLimitDetailList []*RateLimitDetail `json:"rate_limit_detail_list,omitempty" xml:"rate_limit_detail_list,omitempty" type:"Repeated"`
}

func (s QueryTenantRatelimitResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryTenantRatelimitResponse) GoString() string {
	return s.String()
}

func (s *QueryTenantRatelimitResponse) SetReqMsgId(v string) *QueryTenantRatelimitResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryTenantRatelimitResponse) SetResultCode(v string) *QueryTenantRatelimitResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryTenantRatelimitResponse) SetResultMsg(v string) *QueryTenantRatelimitResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryTenantRatelimitResponse) SetRateLimitDetailList(v []*RateLimitDetail) *QueryTenantRatelimitResponse {
	s.RateLimitDetailList = v
	return s
}

type UpdateApiRatelimitRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// update_limit_list
	UpdateLimitList []*UpdateRateLimit `json:"update_limit_list,omitempty" xml:"update_limit_list,omitempty" require:"true" type:"Repeated"`
}

func (s UpdateApiRatelimitRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateApiRatelimitRequest) GoString() string {
	return s.String()
}

func (s *UpdateApiRatelimitRequest) SetAuthToken(v string) *UpdateApiRatelimitRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateApiRatelimitRequest) SetUpdateLimitList(v []*UpdateRateLimit) *UpdateApiRatelimitRequest {
	s.UpdateLimitList = v
	return s
}

type UpdateApiRatelimitResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// result
	Result *string `json:"result,omitempty" xml:"result,omitempty"`
}

func (s UpdateApiRatelimitResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateApiRatelimitResponse) GoString() string {
	return s.String()
}

func (s *UpdateApiRatelimitResponse) SetReqMsgId(v string) *UpdateApiRatelimitResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateApiRatelimitResponse) SetResultCode(v string) *UpdateApiRatelimitResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateApiRatelimitResponse) SetResultMsg(v string) *UpdateApiRatelimitResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateApiRatelimitResponse) SetResult(v string) *UpdateApiRatelimitResponse {
	s.Result = &v
	return s
}

type UpdateTenantRatelimitRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 更新列表
	UpdateLimitList []*UpdateRateLimit `json:"update_limit_list,omitempty" xml:"update_limit_list,omitempty" require:"true" type:"Repeated"`
}

func (s UpdateTenantRatelimitRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateTenantRatelimitRequest) GoString() string {
	return s.String()
}

func (s *UpdateTenantRatelimitRequest) SetAuthToken(v string) *UpdateTenantRatelimitRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateTenantRatelimitRequest) SetTenantId(v string) *UpdateTenantRatelimitRequest {
	s.TenantId = &v
	return s
}

func (s *UpdateTenantRatelimitRequest) SetUpdateLimitList(v []*UpdateRateLimit) *UpdateTenantRatelimitRequest {
	s.UpdateLimitList = v
	return s
}

type UpdateTenantRatelimitResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// result
	Result *string `json:"result,omitempty" xml:"result,omitempty"`
}

func (s UpdateTenantRatelimitResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateTenantRatelimitResponse) GoString() string {
	return s.String()
}

func (s *UpdateTenantRatelimitResponse) SetReqMsgId(v string) *UpdateTenantRatelimitResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateTenantRatelimitResponse) SetResultCode(v string) *UpdateTenantRatelimitResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateTenantRatelimitResponse) SetResultMsg(v string) *UpdateTenantRatelimitResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateTenantRatelimitResponse) SetResult(v string) *UpdateTenantRatelimitResponse {
	s.Result = &v
	return s
}

type CallbackJiuzhouPlanRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 请求标识
	ExecId *string `json:"exec_id,omitempty" xml:"exec_id,omitempty" require:"true"`
	// 回调数据
	CallBackData *string `json:"call_back_data,omitempty" xml:"call_back_data,omitempty" require:"true"`
}

func (s CallbackJiuzhouPlanRequest) String() string {
	return tea.Prettify(s)
}

func (s CallbackJiuzhouPlanRequest) GoString() string {
	return s.String()
}

func (s *CallbackJiuzhouPlanRequest) SetAuthToken(v string) *CallbackJiuzhouPlanRequest {
	s.AuthToken = &v
	return s
}

func (s *CallbackJiuzhouPlanRequest) SetExecId(v string) *CallbackJiuzhouPlanRequest {
	s.ExecId = &v
	return s
}

func (s *CallbackJiuzhouPlanRequest) SetCallBackData(v string) *CallbackJiuzhouPlanRequest {
	s.CallBackData = &v
	return s
}

type CallbackJiuzhouPlanResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 请求标识
	ExecId *string `json:"exec_id,omitempty" xml:"exec_id,omitempty"`
	// 请求是否成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s CallbackJiuzhouPlanResponse) String() string {
	return tea.Prettify(s)
}

func (s CallbackJiuzhouPlanResponse) GoString() string {
	return s.String()
}

func (s *CallbackJiuzhouPlanResponse) SetReqMsgId(v string) *CallbackJiuzhouPlanResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CallbackJiuzhouPlanResponse) SetResultCode(v string) *CallbackJiuzhouPlanResponse {
	s.ResultCode = &v
	return s
}

func (s *CallbackJiuzhouPlanResponse) SetResultMsg(v string) *CallbackJiuzhouPlanResponse {
	s.ResultMsg = &v
	return s
}

func (s *CallbackJiuzhouPlanResponse) SetExecId(v string) *CallbackJiuzhouPlanResponse {
	s.ExecId = &v
	return s
}

func (s *CallbackJiuzhouPlanResponse) SetSuccess(v bool) *CallbackJiuzhouPlanResponse {
	s.Success = &v
	return s
}

type ExecRobotIntelligentRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 请求id
	TargetReqMsgId *string `json:"target_req_msg_id,omitempty" xml:"target_req_msg_id,omitempty" require:"true"`
	// 通知人
	SenderStaffId *string `json:"sender_staff_id,omitempty" xml:"sender_staff_id,omitempty"`
	// 回调通知接口
	CallUrl *string `json:"call_url,omitempty" xml:"call_url,omitempty"`
	// token
	RobotToken *string `json:"robot_token,omitempty" xml:"robot_token,omitempty"`
}

func (s ExecRobotIntelligentRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecRobotIntelligentRequest) GoString() string {
	return s.String()
}

func (s *ExecRobotIntelligentRequest) SetAuthToken(v string) *ExecRobotIntelligentRequest {
	s.AuthToken = &v
	return s
}

func (s *ExecRobotIntelligentRequest) SetTargetReqMsgId(v string) *ExecRobotIntelligentRequest {
	s.TargetReqMsgId = &v
	return s
}

func (s *ExecRobotIntelligentRequest) SetSenderStaffId(v string) *ExecRobotIntelligentRequest {
	s.SenderStaffId = &v
	return s
}

func (s *ExecRobotIntelligentRequest) SetCallUrl(v string) *ExecRobotIntelligentRequest {
	s.CallUrl = &v
	return s
}

func (s *ExecRobotIntelligentRequest) SetRobotToken(v string) *ExecRobotIntelligentRequest {
	s.RobotToken = &v
	return s
}

type ExecRobotIntelligentResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s ExecRobotIntelligentResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecRobotIntelligentResponse) GoString() string {
	return s.String()
}

func (s *ExecRobotIntelligentResponse) SetReqMsgId(v string) *ExecRobotIntelligentResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ExecRobotIntelligentResponse) SetResultCode(v string) *ExecRobotIntelligentResponse {
	s.ResultCode = &v
	return s
}

func (s *ExecRobotIntelligentResponse) SetResultMsg(v string) *ExecRobotIntelligentResponse {
	s.ResultMsg = &v
	return s
}

type UpdateApisStatusRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 待更新的api数组
	Apis []*string `json:"apis,omitempty" xml:"apis,omitempty" require:"true" type:"Repeated"`
	// 产品码，原字段废弃
	NewProductCode *string `json:"new_product_code,omitempty" xml:"new_product_code,omitempty" require:"true"`
}

func (s UpdateApisStatusRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateApisStatusRequest) GoString() string {
	return s.String()
}

func (s *UpdateApisStatusRequest) SetAuthToken(v string) *UpdateApisStatusRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateApisStatusRequest) SetApis(v []*string) *UpdateApisStatusRequest {
	s.Apis = v
	return s
}

func (s *UpdateApisStatusRequest) SetNewProductCode(v string) *UpdateApisStatusRequest {
	s.NewProductCode = &v
	return s
}

type UpdateApisStatusResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s UpdateApisStatusResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateApisStatusResponse) GoString() string {
	return s.String()
}

func (s *UpdateApisStatusResponse) SetReqMsgId(v string) *UpdateApisStatusResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateApisStatusResponse) SetResultCode(v string) *UpdateApisStatusResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateApisStatusResponse) SetResultMsg(v string) *UpdateApisStatusResponse {
	s.ResultMsg = &v
	return s
}

type QuerySdkApiRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 商业能力id
	AbilityId *string `json:"ability_id,omitempty" xml:"ability_id,omitempty" require:"true"`
	// 发布版本号
	PublishVersion *string `json:"publish_version,omitempty" xml:"publish_version,omitempty" require:"true"`
}

func (s QuerySdkApiRequest) String() string {
	return tea.Prettify(s)
}

func (s QuerySdkApiRequest) GoString() string {
	return s.String()
}

func (s *QuerySdkApiRequest) SetAuthToken(v string) *QuerySdkApiRequest {
	s.AuthToken = &v
	return s
}

func (s *QuerySdkApiRequest) SetAbilityId(v string) *QuerySdkApiRequest {
	s.AbilityId = &v
	return s
}

func (s *QuerySdkApiRequest) SetPublishVersion(v string) *QuerySdkApiRequest {
	s.PublishVersion = &v
	return s
}

type QuerySdkApiResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 当前版本sdk包含api信息列表
	ApiInfoModels []*ApiInfoModel `json:"api_info_models,omitempty" xml:"api_info_models,omitempty" type:"Repeated"`
}

func (s QuerySdkApiResponse) String() string {
	return tea.Prettify(s)
}

func (s QuerySdkApiResponse) GoString() string {
	return s.String()
}

func (s *QuerySdkApiResponse) SetReqMsgId(v string) *QuerySdkApiResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QuerySdkApiResponse) SetResultCode(v string) *QuerySdkApiResponse {
	s.ResultCode = &v
	return s
}

func (s *QuerySdkApiResponse) SetResultMsg(v string) *QuerySdkApiResponse {
	s.ResultMsg = &v
	return s
}

func (s *QuerySdkApiResponse) SetApiInfoModels(v []*ApiInfoModel) *QuerySdkApiResponse {
	s.ApiInfoModels = v
	return s
}

type ExecRobotBaasplusRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 目标请求id
	TargetReqId *string `json:"target_req_id,omitempty" xml:"target_req_id,omitempty"`
	// 目标请求参数
	TargetParam *string `json:"target_param,omitempty" xml:"target_param,omitempty"`
	// 是否重试
	RetryFlag *bool `json:"retry_flag,omitempty" xml:"retry_flag,omitempty" require:"true"`
}

func (s ExecRobotBaasplusRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecRobotBaasplusRequest) GoString() string {
	return s.String()
}

func (s *ExecRobotBaasplusRequest) SetAuthToken(v string) *ExecRobotBaasplusRequest {
	s.AuthToken = &v
	return s
}

func (s *ExecRobotBaasplusRequest) SetTargetReqId(v string) *ExecRobotBaasplusRequest {
	s.TargetReqId = &v
	return s
}

func (s *ExecRobotBaasplusRequest) SetTargetParam(v string) *ExecRobotBaasplusRequest {
	s.TargetParam = &v
	return s
}

func (s *ExecRobotBaasplusRequest) SetRetryFlag(v bool) *ExecRobotBaasplusRequest {
	s.RetryFlag = &v
	return s
}

type ExecRobotBaasplusResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 请求数据json字符串数组
	ReqJsonString []*string `json:"req_json_string,omitempty" xml:"req_json_string,omitempty" type:"Repeated"`
}

func (s ExecRobotBaasplusResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecRobotBaasplusResponse) GoString() string {
	return s.String()
}

func (s *ExecRobotBaasplusResponse) SetReqMsgId(v string) *ExecRobotBaasplusResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ExecRobotBaasplusResponse) SetResultCode(v string) *ExecRobotBaasplusResponse {
	s.ResultCode = &v
	return s
}

func (s *ExecRobotBaasplusResponse) SetResultMsg(v string) *ExecRobotBaasplusResponse {
	s.ResultMsg = &v
	return s
}

func (s *ExecRobotBaasplusResponse) SetReqJsonString(v []*string) *ExecRobotBaasplusResponse {
	s.ReqJsonString = v
	return s
}

type QueryApiDetailRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// demo
	TargetProd *string `json:"target_prod,omitempty" xml:"target_prod,omitempty" require:"true"`
	// demo
	TargetApi *string `json:"target_api,omitempty" xml:"target_api,omitempty" require:"true"`
}

func (s QueryApiDetailRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryApiDetailRequest) GoString() string {
	return s.String()
}

func (s *QueryApiDetailRequest) SetAuthToken(v string) *QueryApiDetailRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryApiDetailRequest) SetTargetProd(v string) *QueryApiDetailRequest {
	s.TargetProd = &v
	return s
}

func (s *QueryApiDetailRequest) SetTargetApi(v string) *QueryApiDetailRequest {
	s.TargetApi = &v
	return s
}

type QueryApiDetailResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// json
	ApiDetailJson *string `json:"api_detail_json,omitempty" xml:"api_detail_json,omitempty"`
}

func (s QueryApiDetailResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryApiDetailResponse) GoString() string {
	return s.String()
}

func (s *QueryApiDetailResponse) SetReqMsgId(v string) *QueryApiDetailResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryApiDetailResponse) SetResultCode(v string) *QueryApiDetailResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryApiDetailResponse) SetResultMsg(v string) *QueryApiDetailResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryApiDetailResponse) SetApiDetailJson(v string) *QueryApiDetailResponse {
	s.ApiDetailJson = &v
	return s
}

type QueryApiOwnerRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 网关产品码
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty" require:"true"`
	// api方法信息
	Api *string `json:"api,omitempty" xml:"api,omitempty" require:"true"`
}

func (s QueryApiOwnerRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryApiOwnerRequest) GoString() string {
	return s.String()
}

func (s *QueryApiOwnerRequest) SetAuthToken(v string) *QueryApiOwnerRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryApiOwnerRequest) SetProductCode(v string) *QueryApiOwnerRequest {
	s.ProductCode = &v
	return s
}

func (s *QueryApiOwnerRequest) SetApi(v string) *QueryApiOwnerRequest {
	s.Api = &v
	return s
}

type QueryApiOwnerResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// buc用户信息
	BucUser *BucUser `json:"buc_user,omitempty" xml:"buc_user,omitempty"`
}

func (s QueryApiOwnerResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryApiOwnerResponse) GoString() string {
	return s.String()
}

func (s *QueryApiOwnerResponse) SetReqMsgId(v string) *QueryApiOwnerResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryApiOwnerResponse) SetResultCode(v string) *QueryApiOwnerResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryApiOwnerResponse) SetResultMsg(v string) *QueryApiOwnerResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryApiOwnerResponse) SetBucUser(v *BucUser) *QueryApiOwnerResponse {
	s.BucUser = v
	return s
}

type UpdateGwCacheRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 刷新缓存的key
	CacheKey *string `json:"cache_key,omitempty" xml:"cache_key,omitempty" require:"true"`
}

func (s UpdateGwCacheRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateGwCacheRequest) GoString() string {
	return s.String()
}

func (s *UpdateGwCacheRequest) SetAuthToken(v string) *UpdateGwCacheRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateGwCacheRequest) SetCacheKey(v string) *UpdateGwCacheRequest {
	s.CacheKey = &v
	return s
}

type UpdateGwCacheResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s UpdateGwCacheResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateGwCacheResponse) GoString() string {
	return s.String()
}

func (s *UpdateGwCacheResponse) SetReqMsgId(v string) *UpdateGwCacheResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateGwCacheResponse) SetResultCode(v string) *UpdateGwCacheResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateGwCacheResponse) SetResultMsg(v string) *UpdateGwCacheResponse {
	s.ResultMsg = &v
	return s
}

type CreateBusinessruleOperateRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// api名称
	ApiName *string `json:"api_name,omitempty" xml:"api_name,omitempty" require:"true"`
	// 规则列表
	Rules []*BusinessRule `json:"rules,omitempty" xml:"rules,omitempty" require:"true" type:"Repeated"`
	// api版本（可选，传递则表示导入）
	RuleVersion *string `json:"rule_version,omitempty" xml:"rule_version,omitempty"`
}

func (s CreateBusinessruleOperateRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateBusinessruleOperateRequest) GoString() string {
	return s.String()
}

func (s *CreateBusinessruleOperateRequest) SetAuthToken(v string) *CreateBusinessruleOperateRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateBusinessruleOperateRequest) SetApiName(v string) *CreateBusinessruleOperateRequest {
	s.ApiName = &v
	return s
}

func (s *CreateBusinessruleOperateRequest) SetRules(v []*BusinessRule) *CreateBusinessruleOperateRequest {
	s.Rules = v
	return s
}

func (s *CreateBusinessruleOperateRequest) SetRuleVersion(v string) *CreateBusinessruleOperateRequest {
	s.RuleVersion = &v
	return s
}

type CreateBusinessruleOperateResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 版本号
	Version *string `json:"version,omitempty" xml:"version,omitempty"`
}

func (s CreateBusinessruleOperateResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateBusinessruleOperateResponse) GoString() string {
	return s.String()
}

func (s *CreateBusinessruleOperateResponse) SetReqMsgId(v string) *CreateBusinessruleOperateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateBusinessruleOperateResponse) SetResultCode(v string) *CreateBusinessruleOperateResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateBusinessruleOperateResponse) SetResultMsg(v string) *CreateBusinessruleOperateResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateBusinessruleOperateResponse) SetVersion(v string) *CreateBusinessruleOperateResponse {
	s.Version = &v
	return s
}

type EnableBusinessruleOperateRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// api名称
	ApiName *string `json:"api_name,omitempty" xml:"api_name,omitempty" require:"true"`
	// 环境
	Env *string `json:"env,omitempty" xml:"env,omitempty"`
	// 版本（不传为创建新版）
	RuleVersion *string `json:"rule_version,omitempty" xml:"rule_version,omitempty" require:"true"`
}

func (s EnableBusinessruleOperateRequest) String() string {
	return tea.Prettify(s)
}

func (s EnableBusinessruleOperateRequest) GoString() string {
	return s.String()
}

func (s *EnableBusinessruleOperateRequest) SetAuthToken(v string) *EnableBusinessruleOperateRequest {
	s.AuthToken = &v
	return s
}

func (s *EnableBusinessruleOperateRequest) SetApiName(v string) *EnableBusinessruleOperateRequest {
	s.ApiName = &v
	return s
}

func (s *EnableBusinessruleOperateRequest) SetEnv(v string) *EnableBusinessruleOperateRequest {
	s.Env = &v
	return s
}

func (s *EnableBusinessruleOperateRequest) SetRuleVersion(v string) *EnableBusinessruleOperateRequest {
	s.RuleVersion = &v
	return s
}

type EnableBusinessruleOperateResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 版本号
	Version *string `json:"version,omitempty" xml:"version,omitempty"`
}

func (s EnableBusinessruleOperateResponse) String() string {
	return tea.Prettify(s)
}

func (s EnableBusinessruleOperateResponse) GoString() string {
	return s.String()
}

func (s *EnableBusinessruleOperateResponse) SetReqMsgId(v string) *EnableBusinessruleOperateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *EnableBusinessruleOperateResponse) SetResultCode(v string) *EnableBusinessruleOperateResponse {
	s.ResultCode = &v
	return s
}

func (s *EnableBusinessruleOperateResponse) SetResultMsg(v string) *EnableBusinessruleOperateResponse {
	s.ResultMsg = &v
	return s
}

func (s *EnableBusinessruleOperateResponse) SetVersion(v string) *EnableBusinessruleOperateResponse {
	s.Version = &v
	return s
}

type QueryBusinessruleMatchRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 请求的reqMsgId
	RequestMsgId *string `json:"request_msg_id,omitempty" xml:"request_msg_id,omitempty" require:"true"`
}

func (s QueryBusinessruleMatchRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryBusinessruleMatchRequest) GoString() string {
	return s.String()
}

func (s *QueryBusinessruleMatchRequest) SetAuthToken(v string) *QueryBusinessruleMatchRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryBusinessruleMatchRequest) SetRequestMsgId(v string) *QueryBusinessruleMatchRequest {
	s.RequestMsgId = &v
	return s
}

type QueryBusinessruleMatchResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 最终匹配结果
	MatchResult *string `json:"match_result,omitempty" xml:"match_result,omitempty"`
	// 出入参信息
	HttpContent *string `json:"http_content,omitempty" xml:"http_content,omitempty"`
	// 防控结果
	PreventResult *string `json:"prevent_result,omitempty" xml:"prevent_result,omitempty"`
	// 匹配到的L5
	MatchBusinessCode *string `json:"match_business_code,omitempty" xml:"match_business_code,omitempty"`
	// 匹配到的实例id
	MatchInstanceId *string `json:"match_instance_id,omitempty" xml:"match_instance_id,omitempty"`
	// 规则引擎耗时
	EngineTime *string `json:"engine_time,omitempty" xml:"engine_time,omitempty"`
}

func (s QueryBusinessruleMatchResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryBusinessruleMatchResponse) GoString() string {
	return s.String()
}

func (s *QueryBusinessruleMatchResponse) SetReqMsgId(v string) *QueryBusinessruleMatchResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryBusinessruleMatchResponse) SetResultCode(v string) *QueryBusinessruleMatchResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryBusinessruleMatchResponse) SetResultMsg(v string) *QueryBusinessruleMatchResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryBusinessruleMatchResponse) SetMatchResult(v string) *QueryBusinessruleMatchResponse {
	s.MatchResult = &v
	return s
}

func (s *QueryBusinessruleMatchResponse) SetHttpContent(v string) *QueryBusinessruleMatchResponse {
	s.HttpContent = &v
	return s
}

func (s *QueryBusinessruleMatchResponse) SetPreventResult(v string) *QueryBusinessruleMatchResponse {
	s.PreventResult = &v
	return s
}

func (s *QueryBusinessruleMatchResponse) SetMatchBusinessCode(v string) *QueryBusinessruleMatchResponse {
	s.MatchBusinessCode = &v
	return s
}

func (s *QueryBusinessruleMatchResponse) SetMatchInstanceId(v string) *QueryBusinessruleMatchResponse {
	s.MatchInstanceId = &v
	return s
}

func (s *QueryBusinessruleMatchResponse) SetEngineTime(v string) *QueryBusinessruleMatchResponse {
	s.EngineTime = &v
	return s
}

type QueryBusinessruleServicesRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 提交人域账号
	SubmitterId *string `json:"submitter_id,omitempty" xml:"submitter_id,omitempty" require:"true"`
}

func (s QueryBusinessruleServicesRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryBusinessruleServicesRequest) GoString() string {
	return s.String()
}

func (s *QueryBusinessruleServicesRequest) SetAuthToken(v string) *QueryBusinessruleServicesRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryBusinessruleServicesRequest) SetSubmitterId(v string) *QueryBusinessruleServicesRequest {
	s.SubmitterId = &v
	return s
}

type QueryBusinessruleServicesResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// api服务列表
	ServiceList []*ApiInfoModel `json:"service_list,omitempty" xml:"service_list,omitempty" type:"Repeated"`
}

func (s QueryBusinessruleServicesResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryBusinessruleServicesResponse) GoString() string {
	return s.String()
}

func (s *QueryBusinessruleServicesResponse) SetReqMsgId(v string) *QueryBusinessruleServicesResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryBusinessruleServicesResponse) SetResultCode(v string) *QueryBusinessruleServicesResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryBusinessruleServicesResponse) SetResultMsg(v string) *QueryBusinessruleServicesResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryBusinessruleServicesResponse) SetServiceList(v []*ApiInfoModel) *QueryBusinessruleServicesResponse {
	s.ServiceList = v
	return s
}

type GetBusinessruleServicesRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// api名称
	ApiName *string `json:"api_name,omitempty" xml:"api_name,omitempty" require:"true"`
	// 版本号（可不填）
	ApiVersion *string `json:"api_version,omitempty" xml:"api_version,omitempty"`
}

func (s GetBusinessruleServicesRequest) String() string {
	return tea.Prettify(s)
}

func (s GetBusinessruleServicesRequest) GoString() string {
	return s.String()
}

func (s *GetBusinessruleServicesRequest) SetAuthToken(v string) *GetBusinessruleServicesRequest {
	s.AuthToken = &v
	return s
}

func (s *GetBusinessruleServicesRequest) SetApiName(v string) *GetBusinessruleServicesRequest {
	s.ApiName = &v
	return s
}

func (s *GetBusinessruleServicesRequest) SetApiVersion(v string) *GetBusinessruleServicesRequest {
	s.ApiVersion = &v
	return s
}

type GetBusinessruleServicesResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// api元数据（参照facade包中的cn.com.antcloud.opm.service.model.apimng.response.ExportApiResponse结构）
	ApiMeta *string `json:"api_meta,omitempty" xml:"api_meta,omitempty"`
}

func (s GetBusinessruleServicesResponse) String() string {
	return tea.Prettify(s)
}

func (s GetBusinessruleServicesResponse) GoString() string {
	return s.String()
}

func (s *GetBusinessruleServicesResponse) SetReqMsgId(v string) *GetBusinessruleServicesResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetBusinessruleServicesResponse) SetResultCode(v string) *GetBusinessruleServicesResponse {
	s.ResultCode = &v
	return s
}

func (s *GetBusinessruleServicesResponse) SetResultMsg(v string) *GetBusinessruleServicesResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetBusinessruleServicesResponse) SetApiMeta(v string) *GetBusinessruleServicesResponse {
	s.ApiMeta = &v
	return s
}

type UpdateInstanceRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 实例ID
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty" require:"true"`
	// 需变更的实例状态
	InstanceStatus *string `json:"instance_status,omitempty" xml:"instance_status,omitempty" require:"true"`
	// 履约幂等号
	BizNo *string `json:"biz_no,omitempty" xml:"biz_no,omitempty" require:"true"`
	// L5商品编号
	BusinessCode *string `json:"business_code,omitempty" xml:"business_code,omitempty" require:"true"`
	// 规格属性
	Specification *string `json:"specification,omitempty" xml:"specification,omitempty"`
	// 扩展信息
	ExtensionInfo *string `json:"extension_info,omitempty" xml:"extension_info,omitempty"`
	// 修改时间戳
	VersionTimestamp *string `json:"version_timestamp,omitempty" xml:"version_timestamp,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
}

func (s UpdateInstanceRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateInstanceRequest) GoString() string {
	return s.String()
}

func (s *UpdateInstanceRequest) SetAuthToken(v string) *UpdateInstanceRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateInstanceRequest) SetInstanceId(v string) *UpdateInstanceRequest {
	s.InstanceId = &v
	return s
}

func (s *UpdateInstanceRequest) SetInstanceStatus(v string) *UpdateInstanceRequest {
	s.InstanceStatus = &v
	return s
}

func (s *UpdateInstanceRequest) SetBizNo(v string) *UpdateInstanceRequest {
	s.BizNo = &v
	return s
}

func (s *UpdateInstanceRequest) SetBusinessCode(v string) *UpdateInstanceRequest {
	s.BusinessCode = &v
	return s
}

func (s *UpdateInstanceRequest) SetSpecification(v string) *UpdateInstanceRequest {
	s.Specification = &v
	return s
}

func (s *UpdateInstanceRequest) SetExtensionInfo(v string) *UpdateInstanceRequest {
	s.ExtensionInfo = &v
	return s
}

func (s *UpdateInstanceRequest) SetVersionTimestamp(v string) *UpdateInstanceRequest {
	s.VersionTimestamp = &v
	return s
}

type UpdateInstanceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s UpdateInstanceResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateInstanceResponse) GoString() string {
	return s.String()
}

func (s *UpdateInstanceResponse) SetReqMsgId(v string) *UpdateInstanceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateInstanceResponse) SetResultCode(v string) *UpdateInstanceResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateInstanceResponse) SetResultMsg(v string) *UpdateInstanceResponse {
	s.ResultMsg = &v
	return s
}

type UpdateInstanceTenantRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 实例ID
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty" require:"true"`
	// 履约幂等号
	BizNo *string `json:"biz_no,omitempty" xml:"biz_no,omitempty" require:"true"`
	// 租户ID
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 租户操作
	TenantOperatorEnum *string `json:"tenant_operator_enum,omitempty" xml:"tenant_operator_enum,omitempty" require:"true"`
	// 扩展信息
	ExtensionInfo *string `json:"extension_info,omitempty" xml:"extension_info,omitempty"`
	// 修改时间戳
	VersionTimestamp *string `json:"version_timestamp,omitempty" xml:"version_timestamp,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
}

func (s UpdateInstanceTenantRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateInstanceTenantRequest) GoString() string {
	return s.String()
}

func (s *UpdateInstanceTenantRequest) SetAuthToken(v string) *UpdateInstanceTenantRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateInstanceTenantRequest) SetInstanceId(v string) *UpdateInstanceTenantRequest {
	s.InstanceId = &v
	return s
}

func (s *UpdateInstanceTenantRequest) SetBizNo(v string) *UpdateInstanceTenantRequest {
	s.BizNo = &v
	return s
}

func (s *UpdateInstanceTenantRequest) SetTenantId(v string) *UpdateInstanceTenantRequest {
	s.TenantId = &v
	return s
}

func (s *UpdateInstanceTenantRequest) SetTenantOperatorEnum(v string) *UpdateInstanceTenantRequest {
	s.TenantOperatorEnum = &v
	return s
}

func (s *UpdateInstanceTenantRequest) SetExtensionInfo(v string) *UpdateInstanceTenantRequest {
	s.ExtensionInfo = &v
	return s
}

func (s *UpdateInstanceTenantRequest) SetVersionTimestamp(v string) *UpdateInstanceTenantRequest {
	s.VersionTimestamp = &v
	return s
}

type UpdateInstanceTenantResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s UpdateInstanceTenantResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateInstanceTenantResponse) GoString() string {
	return s.String()
}

func (s *UpdateInstanceTenantResponse) SetReqMsgId(v string) *UpdateInstanceTenantResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateInstanceTenantResponse) SetResultCode(v string) *UpdateInstanceTenantResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateInstanceTenantResponse) SetResultMsg(v string) *UpdateInstanceTenantResponse {
	s.ResultMsg = &v
	return s
}

type CallbackMultiSdkRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	//
	// 回调JSON报文
	Body *string `json:"body,omitempty" xml:"body,omitempty"`
}

func (s CallbackMultiSdkRequest) String() string {
	return tea.Prettify(s)
}

func (s CallbackMultiSdkRequest) GoString() string {
	return s.String()
}

func (s *CallbackMultiSdkRequest) SetAuthToken(v string) *CallbackMultiSdkRequest {
	s.AuthToken = &v
	return s
}

func (s *CallbackMultiSdkRequest) SetBody(v string) *CallbackMultiSdkRequest {
	s.Body = &v
	return s
}

type CallbackMultiSdkResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CallbackMultiSdkResponse) String() string {
	return tea.Prettify(s)
}

func (s CallbackMultiSdkResponse) GoString() string {
	return s.String()
}

func (s *CallbackMultiSdkResponse) SetReqMsgId(v string) *CallbackMultiSdkResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CallbackMultiSdkResponse) SetResultCode(v string) *CallbackMultiSdkResponse {
	s.ResultCode = &v
	return s
}

func (s *CallbackMultiSdkResponse) SetResultMsg(v string) *CallbackMultiSdkResponse {
	s.ResultMsg = &v
	return s
}

type ResetProductRedisRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 要刷新的产品码类型
	Products []*string `json:"products,omitempty" xml:"products,omitempty" require:"true" type:"Repeated"`
}

func (s ResetProductRedisRequest) String() string {
	return tea.Prettify(s)
}

func (s ResetProductRedisRequest) GoString() string {
	return s.String()
}

func (s *ResetProductRedisRequest) SetAuthToken(v string) *ResetProductRedisRequest {
	s.AuthToken = &v
	return s
}

func (s *ResetProductRedisRequest) SetProducts(v []*string) *ResetProductRedisRequest {
	s.Products = v
	return s
}

type ResetProductRedisResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 结果
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
}

func (s ResetProductRedisResponse) String() string {
	return tea.Prettify(s)
}

func (s ResetProductRedisResponse) GoString() string {
	return s.String()
}

func (s *ResetProductRedisResponse) SetReqMsgId(v string) *ResetProductRedisResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ResetProductRedisResponse) SetResultCode(v string) *ResetProductRedisResponse {
	s.ResultCode = &v
	return s
}

func (s *ResetProductRedisResponse) SetResultMsg(v string) *ResetProductRedisResponse {
	s.ResultMsg = &v
	return s
}

func (s *ResetProductRedisResponse) SetMsg(v string) *ResetProductRedisResponse {
	s.Msg = &v
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
				"sdk_version":      tea.String("1.3.44"),
				"_prod_code":       tea.String("ACOPM"),
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
 * Description: 获取产品列表
 * Summary: 获取产品列表
 */
func (client *Client) ListProduct(request *ListProductRequest) (_result *ListProductResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListProductResponse{}
	_body, _err := client.ListProductEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取产品列表
 * Summary: 获取产品列表
 */
func (client *Client) ListProductEx(request *ListProductRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListProductResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListProductResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.acopm.product.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 阿里云Tea多语言SDK生成回调
 * Summary: 阿里云Tea多语言SDK生成回调
 */
func (client *Client) CallbackMultisdk(request *CallbackMultisdkRequest) (_result *CallbackMultisdkResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CallbackMultisdkResponse{}
	_body, _err := client.CallbackMultisdkEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 阿里云Tea多语言SDK生成回调
 * Summary: 阿里云Tea多语言SDK生成回调
 */
func (client *Client) CallbackMultisdkEx(request *CallbackMultisdkRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CallbackMultisdkResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CallbackMultisdkResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.acopm.multisdk.callback"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建产品
 * Summary: 创建产品
 */
func (client *Client) CreateProduct(request *CreateProductRequest) (_result *CreateProductResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateProductResponse{}
	_body, _err := client.CreateProductEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建产品
 * Summary: 创建产品
 */
func (client *Client) CreateProductEx(request *CreateProductRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateProductResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateProductResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.acopm.product.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: api初始化
 * Summary: api初始化
 */
func (client *Client) InitProduct(request *InitProductRequest) (_result *InitProductResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &InitProductResponse{}
	_body, _err := client.InitProductEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: api初始化
 * Summary: api初始化
 */
func (client *Client) InitProductEx(request *InitProductRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *InitProductResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &InitProductResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.acopm.product.init"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 删除产品
 * Summary: 删除产品
 */
func (client *Client) DeleteProduct(request *DeleteProductRequest) (_result *DeleteProductResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DeleteProductResponse{}
	_body, _err := client.DeleteProductEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 删除产品
 * Summary: 删除产品
 */
func (client *Client) DeleteProductEx(request *DeleteProductRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DeleteProductResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DeleteProductResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.acopm.product.delete"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 发布sdk
 * Summary: 发布sdk
 */
func (client *Client) PublishProductSdk(request *PublishProductSdkRequest) (_result *PublishProductSdkResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PublishProductSdkResponse{}
	_body, _err := client.PublishProductSdkEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 发布sdk
 * Summary: 发布sdk
 */
func (client *Client) PublishProductSdkEx(request *PublishProductSdkRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PublishProductSdkResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PublishProductSdkResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.acopm.product.sdk.publish"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取sdk元数据snapshot
 * Summary: 获取sdk元数据snapshot
 */
func (client *Client) GetSdk(request *GetSdkRequest) (_result *GetSdkResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetSdkResponse{}
	_body, _err := client.GetSdkEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取sdk元数据snapshot
 * Summary: 获取sdk元数据snapshot
 */
func (client *Client) GetSdkEx(request *GetSdkRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetSdkResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetSdkResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.acopm.sdk.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 发布共享能力中心sdk
 * Summary: 共享能力中心sdk发布
 */
func (client *Client) PublishProductSaassdk(request *PublishProductSaassdkRequest) (_result *PublishProductSaassdkResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PublishProductSaassdkResponse{}
	_body, _err := client.PublishProductSaassdkEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 发布共享能力中心sdk
 * Summary: 共享能力中心sdk发布
 */
func (client *Client) PublishProductSaassdkEx(request *PublishProductSaassdkRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PublishProductSaassdkResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PublishProductSaassdkResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.acopm.product.saassdk.publish"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 共享能力中心获取sdk打包结果
 * Summary: 共享能力中心获取sdk打包结果
 */
func (client *Client) GetProductSaassdk(request *GetProductSaassdkRequest) (_result *GetProductSaassdkResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetProductSaassdkResponse{}
	_body, _err := client.GetProductSaassdkEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 共享能力中心获取sdk打包结果
 * Summary: 共享能力中心获取sdk打包结果
 */
func (client *Client) GetProductSaassdkEx(request *GetProductSaassdkRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetProductSaassdkResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetProductSaassdkResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.acopm.product.saassdk.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 同步产品成员权限
 * Summary: 同步产品成员权限
 */
func (client *Client) AddProductMember(request *AddProductMemberRequest) (_result *AddProductMemberResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AddProductMemberResponse{}
	_body, _err := client.AddProductMemberEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 同步产品成员权限
 * Summary: 同步产品成员权限
 */
func (client *Client) AddProductMemberEx(request *AddProductMemberRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AddProductMemberResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AddProductMemberResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.acopm.product.member.add"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询api限流信息
 * Summary: 查询api限流信息（api）
 */
func (client *Client) QueryApiRatelimit(request *QueryApiRatelimitRequest) (_result *QueryApiRatelimitResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryApiRatelimitResponse{}
	_body, _err := client.QueryApiRatelimitEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询api限流信息
 * Summary: 查询api限流信息（api）
 */
func (client *Client) QueryApiRatelimitEx(request *QueryApiRatelimitRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryApiRatelimitResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryApiRatelimitResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.acopm.api.ratelimit.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description:  查询api限流信息
 * Summary:  查询api限流信息（租户维度）
 */
func (client *Client) QueryTenantRatelimit(request *QueryTenantRatelimitRequest) (_result *QueryTenantRatelimitResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryTenantRatelimitResponse{}
	_body, _err := client.QueryTenantRatelimitEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description:  查询api限流信息
 * Summary:  查询api限流信息（租户维度）
 */
func (client *Client) QueryTenantRatelimitEx(request *QueryTenantRatelimitRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryTenantRatelimitResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryTenantRatelimitResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.acopm.tenant.ratelimit.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: api限流更新
 * Summary: api限流更新（api维度）
 */
func (client *Client) UpdateApiRatelimit(request *UpdateApiRatelimitRequest) (_result *UpdateApiRatelimitResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateApiRatelimitResponse{}
	_body, _err := client.UpdateApiRatelimitEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: api限流更新
 * Summary: api限流更新（api维度）
 */
func (client *Client) UpdateApiRatelimitEx(request *UpdateApiRatelimitRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateApiRatelimitResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateApiRatelimitResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.acopm.api.ratelimit.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: api限流更新
 * Summary: api限流更新（租户维度）
 */
func (client *Client) UpdateTenantRatelimit(request *UpdateTenantRatelimitRequest) (_result *UpdateTenantRatelimitResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateTenantRatelimitResponse{}
	_body, _err := client.UpdateTenantRatelimitEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: api限流更新
 * Summary: api限流更新（租户维度）
 */
func (client *Client) UpdateTenantRatelimitEx(request *UpdateTenantRatelimitRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateTenantRatelimitResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateTenantRatelimitResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.acopm.tenant.ratelimit.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 九州工单回调接口
 * Summary: 九州工单回调接口
 */
func (client *Client) CallbackJiuzhouPlan(request *CallbackJiuzhouPlanRequest) (_result *CallbackJiuzhouPlanResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CallbackJiuzhouPlanResponse{}
	_body, _err := client.CallbackJiuzhouPlanEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 九州工单回调接口
 * Summary: 九州工单回调接口
 */
func (client *Client) CallbackJiuzhouPlanEx(request *CallbackJiuzhouPlanRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CallbackJiuzhouPlanResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CallbackJiuzhouPlanResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.acopm.jiuzhou.plan.callback"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 智能排障机器人接口
 * Summary: 排障机器人接口
 */
func (client *Client) ExecRobotIntelligent(request *ExecRobotIntelligentRequest) (_result *ExecRobotIntelligentResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ExecRobotIntelligentResponse{}
	_body, _err := client.ExecRobotIntelligentEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 智能排障机器人接口
 * Summary: 排障机器人接口
 */
func (client *Client) ExecRobotIntelligentEx(request *ExecRobotIntelligentRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ExecRobotIntelligentResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecRobotIntelligentResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.acopm.robot.intelligent.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 生产环境api状态更新
 * Summary: 生产环境api状态更新
 */
func (client *Client) UpdateApisStatus(request *UpdateApisStatusRequest) (_result *UpdateApisStatusResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateApisStatusResponse{}
	_body, _err := client.UpdateApisStatusEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 生产环境api状态更新
 * Summary: 生产环境api状态更新
 */
func (client *Client) UpdateApisStatusEx(request *UpdateApisStatusRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateApisStatusResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateApisStatusResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.acopm.apis.status.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询商业产品sdk版本api信息
 * Summary: 查询商业产品sdk版本api信息
 */
func (client *Client) QuerySdkApi(request *QuerySdkApiRequest) (_result *QuerySdkApiResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QuerySdkApiResponse{}
	_body, _err := client.QuerySdkApiEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询商业产品sdk版本api信息
 * Summary: 查询商业产品sdk版本api信息
 */
func (client *Client) QuerySdkApiEx(request *QuerySdkApiRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QuerySdkApiResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QuerySdkApiResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.acopm.sdk.api.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 企业认证排障
 * Summary: 企业认证排障
 */
func (client *Client) ExecRobotBaasplus(request *ExecRobotBaasplusRequest) (_result *ExecRobotBaasplusResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ExecRobotBaasplusResponse{}
	_body, _err := client.ExecRobotBaasplusEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 企业认证排障
 * Summary: 企业认证排障
 */
func (client *Client) ExecRobotBaasplusEx(request *ExecRobotBaasplusRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ExecRobotBaasplusResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecRobotBaasplusResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.acopm.robot.baasplus.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: api数据获取
 * Summary: api数据获取
 */
func (client *Client) QueryApiDetail(request *QueryApiDetailRequest) (_result *QueryApiDetailResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryApiDetailResponse{}
	_body, _err := client.QueryApiDetailEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: api数据获取
 * Summary: api数据获取
 */
func (client *Client) QueryApiDetailEx(request *QueryApiDetailRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryApiDetailResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryApiDetailResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.acopm.api.detail.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询api负责人信息
 * Summary: 查询api负责人信息
 */
func (client *Client) QueryApiOwner(request *QueryApiOwnerRequest) (_result *QueryApiOwnerResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryApiOwnerResponse{}
	_body, _err := client.QueryApiOwnerEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询api负责人信息
 * Summary: 查询api负责人信息
 */
func (client *Client) QueryApiOwnerEx(request *QueryApiOwnerRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryApiOwnerResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryApiOwnerResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.acopm.api.owner.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 请求刷新gw的缓存
 * Summary: 网关运行态gw cache刷新
 */
func (client *Client) UpdateGwCache(request *UpdateGwCacheRequest) (_result *UpdateGwCacheResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateGwCacheResponse{}
	_body, _err := client.UpdateGwCacheEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 请求刷新gw的缓存
 * Summary: 网关运行态gw cache刷新
 */
func (client *Client) UpdateGwCacheEx(request *UpdateGwCacheRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateGwCacheResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateGwCacheResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.acopm.gw.cache.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 商业化规则创建
 * Summary: 商业化规则创建
 */
func (client *Client) CreateBusinessruleOperate(request *CreateBusinessruleOperateRequest) (_result *CreateBusinessruleOperateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateBusinessruleOperateResponse{}
	_body, _err := client.CreateBusinessruleOperateEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 商业化规则创建
 * Summary: 商业化规则创建
 */
func (client *Client) CreateBusinessruleOperateEx(request *CreateBusinessruleOperateRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateBusinessruleOperateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateBusinessruleOperateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.acopm.businessrule.operate.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 生效商业化规则
 * Summary: 生效商业化规则
 */
func (client *Client) EnableBusinessruleOperate(request *EnableBusinessruleOperateRequest) (_result *EnableBusinessruleOperateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &EnableBusinessruleOperateResponse{}
	_body, _err := client.EnableBusinessruleOperateEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 生效商业化规则
 * Summary: 生效商业化规则
 */
func (client *Client) EnableBusinessruleOperateEx(request *EnableBusinessruleOperateRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *EnableBusinessruleOperateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &EnableBusinessruleOperateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.acopm.businessrule.operate.enable"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询规则匹配情况
 * Summary: 查询规则匹配情况
 */
func (client *Client) QueryBusinessruleMatch(request *QueryBusinessruleMatchRequest) (_result *QueryBusinessruleMatchResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryBusinessruleMatchResponse{}
	_body, _err := client.QueryBusinessruleMatchEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询规则匹配情况
 * Summary: 查询规则匹配情况
 */
func (client *Client) QueryBusinessruleMatchEx(request *QueryBusinessruleMatchRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryBusinessruleMatchResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryBusinessruleMatchResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.acopm.businessrule.match.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询当前登录人有权限的服务列表
 * Summary: 查询当前登录人有权限的服务列表
 */
func (client *Client) QueryBusinessruleServices(request *QueryBusinessruleServicesRequest) (_result *QueryBusinessruleServicesResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryBusinessruleServicesResponse{}
	_body, _err := client.QueryBusinessruleServicesEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询当前登录人有权限的服务列表
 * Summary: 查询当前登录人有权限的服务列表
 */
func (client *Client) QueryBusinessruleServicesEx(request *QueryBusinessruleServicesRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryBusinessruleServicesResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryBusinessruleServicesResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.acopm.businessrule.services.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询单个服务的参数/返回等元信息
 * Summary: 查询单个服务的参数/返回等元信息
 */
func (client *Client) GetBusinessruleServices(request *GetBusinessruleServicesRequest) (_result *GetBusinessruleServicesResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetBusinessruleServicesResponse{}
	_body, _err := client.GetBusinessruleServicesEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询单个服务的参数/返回等元信息
 * Summary: 查询单个服务的参数/返回等元信息
 */
func (client *Client) GetBusinessruleServicesEx(request *GetBusinessruleServicesRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetBusinessruleServicesResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetBusinessruleServicesResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.acopm.businessrule.services.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 实例更新
 * Summary: 实例更新
 */
func (client *Client) UpdateInstance(request *UpdateInstanceRequest) (_result *UpdateInstanceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateInstanceResponse{}
	_body, _err := client.UpdateInstanceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 实例更新
 * Summary: 实例更新
 */
func (client *Client) UpdateInstanceEx(request *UpdateInstanceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateInstanceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateInstanceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.acopm.instance.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 租户实例更新
 * Summary: 租户实例更新
 */
func (client *Client) UpdateInstanceTenant(request *UpdateInstanceTenantRequest) (_result *UpdateInstanceTenantResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateInstanceTenantResponse{}
	_body, _err := client.UpdateInstanceTenantEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 租户实例更新
 * Summary: 租户实例更新
 */
func (client *Client) UpdateInstanceTenantEx(request *UpdateInstanceTenantRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateInstanceTenantResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateInstanceTenantResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.acopm.instance.tenant.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 个人工作台-阿里云Tea多语言SDK生成回调
 * Summary: 阿里云Tea多语言SDK生成回调
 */
func (client *Client) CallbackMultiSdk(request *CallbackMultiSdkRequest) (_result *CallbackMultiSdkResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CallbackMultiSdkResponse{}
	_body, _err := client.CallbackMultiSdkEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 个人工作台-阿里云Tea多语言SDK生成回调
 * Summary: 阿里云Tea多语言SDK生成回调
 */
func (client *Client) CallbackMultiSdkEx(request *CallbackMultiSdkRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CallbackMultiSdkResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CallbackMultiSdkResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.acopm.multi.sdk.callback"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 产品码redis刷新
 * Summary: 产品码redis刷新
 */
func (client *Client) ResetProductRedis(request *ResetProductRedisRequest) (_result *ResetProductRedisResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ResetProductRedisResponse{}
	_body, _err := client.ResetProductRedisEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 产品码redis刷新
 * Summary: 产品码redis刷新
 */
func (client *Client) ResetProductRedisEx(request *ResetProductRedisRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ResetProductRedisResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ResetProductRedisResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.acopm.product.redis.reset"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
