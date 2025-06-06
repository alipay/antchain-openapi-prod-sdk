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

type Condition struct {
	Key   *string `json:"key,omitempty" xml:"key,omitempty"`
	Value *string `json:"value,omitempty" xml:"value,omitempty"`
}

func (s Condition) String() string {
	return tea.Prettify(s)
}

func (s Condition) GoString() string {
	return s.String()
}

func (s *Condition) SetKey(v string) *Condition {
	s.Key = &v
	return s
}

func (s *Condition) SetValue(v string) *Condition {
	s.Value = &v
	return s
}

// 阿里云资源结构体
type AliyunResource struct {
	// resource_type/resource_id
	Resource *string `json:"resource,omitempty" xml:"resource,omitempty" require:"true"`
	// 资源所属的租户
	ResourceTenant *string `json:"resource_tenant,omitempty" xml:"resource_tenant,omitempty" require:"true"`
}

func (s AliyunResource) String() string {
	return tea.Prettify(s)
}

func (s AliyunResource) GoString() string {
	return s.String()
}

func (s *AliyunResource) SetResource(v string) *AliyunResource {
	s.Resource = &v
	return s
}

func (s *AliyunResource) SetResourceTenant(v string) *AliyunResource {
	s.ResourceTenant = &v
	return s
}

// 鉴权事件（蚂蚁侧）
type AuthenticateEvent struct {
	// 鉴权操作列表
	Actions []*string `json:"actions,omitempty" xml:"actions,omitempty" require:"true" type:"Repeated"`
	// 鉴权对象ID
	ActorId *string `json:"actor_id,omitempty" xml:"actor_id,omitempty" require:"true"`
	// 鉴权条件
	Conditions []*Condition `json:"conditions,omitempty" xml:"conditions,omitempty" type:"Repeated"`
	// 唯一ID
	Id *string `json:"id,omitempty" xml:"id,omitempty"`
}

func (s AuthenticateEvent) String() string {
	return tea.Prettify(s)
}

func (s AuthenticateEvent) GoString() string {
	return s.String()
}

func (s *AuthenticateEvent) SetActions(v []*string) *AuthenticateEvent {
	s.Actions = v
	return s
}

func (s *AuthenticateEvent) SetActorId(v string) *AuthenticateEvent {
	s.ActorId = &v
	return s
}

func (s *AuthenticateEvent) SetConditions(v []*Condition) *AuthenticateEvent {
	s.Conditions = v
	return s
}

func (s *AuthenticateEvent) SetId(v string) *AuthenticateEvent {
	s.Id = &v
	return s
}

// 来源为Onex的操作类型的额外信息
type OnexExtraInfo struct {
	// Onex接口路径
	Path *string `json:"path,omitempty" xml:"path,omitempty" require:"true"`
	// Onex接口的HTTP Method
	Method *string `json:"method,omitempty" xml:"method,omitempty" require:"true"`
}

func (s OnexExtraInfo) String() string {
	return tea.Prettify(s)
}

func (s OnexExtraInfo) GoString() string {
	return s.String()
}

func (s *OnexExtraInfo) SetPath(v string) *OnexExtraInfo {
	s.Path = &v
	return s
}

func (s *OnexExtraInfo) SetMethod(v string) *OnexExtraInfo {
	s.Method = &v
	return s
}

// 阿里云鉴权上下文
type AliyunRamAuthContext struct {
	// 操作名称
	Action *string `json:"action,omitempty" xml:"action,omitempty" require:"true"`
	// 条件
	Conditions []*Condition `json:"conditions,omitempty" xml:"conditions,omitempty" type:"Repeated"`
	// 唯一ID
	Id *string `json:"id,omitempty" xml:"id,omitempty"`
	// regionId
	RegionId *string `json:"region_id,omitempty" xml:"region_id,omitempty" require:"true"`
	// 资源
	Resources []*AliyunResource `json:"resources,omitempty" xml:"resources,omitempty" require:"true" type:"Repeated"`
	// 服务名称
	ServiceName *string `json:"service_name,omitempty" xml:"service_name,omitempty" require:"true"`
}

func (s AliyunRamAuthContext) String() string {
	return tea.Prettify(s)
}

func (s AliyunRamAuthContext) GoString() string {
	return s.String()
}

func (s *AliyunRamAuthContext) SetAction(v string) *AliyunRamAuthContext {
	s.Action = &v
	return s
}

func (s *AliyunRamAuthContext) SetConditions(v []*Condition) *AliyunRamAuthContext {
	s.Conditions = v
	return s
}

func (s *AliyunRamAuthContext) SetId(v string) *AliyunRamAuthContext {
	s.Id = &v
	return s
}

func (s *AliyunRamAuthContext) SetRegionId(v string) *AliyunRamAuthContext {
	s.RegionId = &v
	return s
}

func (s *AliyunRamAuthContext) SetResources(v []*AliyunResource) *AliyunRamAuthContext {
	s.Resources = v
	return s
}

func (s *AliyunRamAuthContext) SetServiceName(v string) *AliyunRamAuthContext {
	s.ServiceName = &v
	return s
}

type ScopeEntity struct {
	Key   *string `json:"key,omitempty" xml:"key,omitempty"`
	Value *string `json:"value,omitempty" xml:"value,omitempty"`
}

func (s ScopeEntity) String() string {
	return tea.Prettify(s)
}

func (s ScopeEntity) GoString() string {
	return s.String()
}

func (s *ScopeEntity) SetKey(v string) *ScopeEntity {
	s.Key = &v
	return s
}

func (s *ScopeEntity) SetValue(v string) *ScopeEntity {
	s.Value = &v
	return s
}

// 阿里云POP透传参数
type AliyunPopRequestInfo struct {
	// AccessKey
	AccessKeyId *string `json:"access_key_id,omitempty" xml:"access_key_id,omitempty"`
	// 是否开启MFA
	AkMfaPresent *bool `json:"ak_mfa_present,omitempty" xml:"ak_mfa_present,omitempty"`
	// Ak系统中记录的客户端代理信息，比如来源于Ecs控制台的请求取之就是EcsConsole
	AkProxy *string `json:"ak_proxy,omitempty" xml:"ak_proxy,omitempty"`
	// API名称
	ApiName *string `json:"api_name,omitempty" xml:"api_name,omitempty"`
	// 调用者IP
	//
	AppIp *string `json:"app_ip,omitempty" xml:"app_ip,omitempty"`
	// 调用者BID
	CallerBid *string `json:"caller_bid,omitempty" xml:"caller_bid,omitempty"`
	// 调用者主账号ID
	CallerParentId *string `json:"caller_parent_id,omitempty" xml:"caller_parent_id,omitempty"`
	// 调用者类型，支持partner, customer, sub, AssumedRoleUser
	CallerType *string `json:"caller_type,omitempty" xml:"caller_type,omitempty" require:"true"`
	// 调用者ID
	CallerUid *string `json:"caller_uid,omitempty" xml:"caller_uid,omitempty"`
	// 用户原始请求是否使用https
	ProxyOriginalSecurityTransport *bool `json:"proxy_original_security_transport,omitempty" xml:"proxy_original_security_transport,omitempty"`
	// 用户原始IP
	//
	ProxyOriginalSourceIp *string `json:"proxy_original_source_ip,omitempty" xml:"proxy_original_source_ip,omitempty"`
	// 提交给网关的原始IP等信息是否可信
	ProxyTrustTransportInfo *bool `json:"proxy_trust_transport_info,omitempty" xml:"proxy_trust_transport_info,omitempty"`
	// request_id
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
	// STS token
	SecurityToken *string `json:"security_token,omitempty" xml:"security_token,omitempty"`
	// security_transport
	SecurityTransport *bool `json:"security_transport,omitempty" xml:"security_transport,omitempty"`
	// 来源IP
	SourceIp *string `json:"source_ip,omitempty" xml:"source_ip,omitempty"`
	// StsTokenAccountBID，创建子账号的主账号 的BID。使用StsToken调用POP时才有此参数
	StsTokenCallerBid *string `json:"sts_token_caller_bid,omitempty" xml:"sts_token_caller_bid,omitempty"`
	// STS token调用者ID
	StsTokenCallerUid *string `json:"sts_token_caller_uid,omitempty" xml:"sts_token_caller_uid,omitempty"`
	// 子账号id:sessioname。调用者阿里云principalId，使用StsToken调用POP时才有此参数
	StsTokenPrincipalId *string `json:"sts_token_principal_id,omitempty" xml:"sts_token_principal_id,omitempty"`
	// 调用者阿里云roleId，使用StsToken调用POP时才有此参数
	//
	StsTokenRoleId *string `json:"sts_token_role_id,omitempty" xml:"sts_token_role_id,omitempty"`
	// STS token绑定用户ID
	StsTokenUserId *string `json:"sts_token_user_id,omitempty" xml:"sts_token_user_id,omitempty"`
	// 版本
	Version *string `json:"version,omitempty" xml:"version,omitempty"`
}

func (s AliyunPopRequestInfo) String() string {
	return tea.Prettify(s)
}

func (s AliyunPopRequestInfo) GoString() string {
	return s.String()
}

func (s *AliyunPopRequestInfo) SetAccessKeyId(v string) *AliyunPopRequestInfo {
	s.AccessKeyId = &v
	return s
}

func (s *AliyunPopRequestInfo) SetAkMfaPresent(v bool) *AliyunPopRequestInfo {
	s.AkMfaPresent = &v
	return s
}

func (s *AliyunPopRequestInfo) SetAkProxy(v string) *AliyunPopRequestInfo {
	s.AkProxy = &v
	return s
}

func (s *AliyunPopRequestInfo) SetApiName(v string) *AliyunPopRequestInfo {
	s.ApiName = &v
	return s
}

func (s *AliyunPopRequestInfo) SetAppIp(v string) *AliyunPopRequestInfo {
	s.AppIp = &v
	return s
}

func (s *AliyunPopRequestInfo) SetCallerBid(v string) *AliyunPopRequestInfo {
	s.CallerBid = &v
	return s
}

func (s *AliyunPopRequestInfo) SetCallerParentId(v string) *AliyunPopRequestInfo {
	s.CallerParentId = &v
	return s
}

func (s *AliyunPopRequestInfo) SetCallerType(v string) *AliyunPopRequestInfo {
	s.CallerType = &v
	return s
}

func (s *AliyunPopRequestInfo) SetCallerUid(v string) *AliyunPopRequestInfo {
	s.CallerUid = &v
	return s
}

func (s *AliyunPopRequestInfo) SetProxyOriginalSecurityTransport(v bool) *AliyunPopRequestInfo {
	s.ProxyOriginalSecurityTransport = &v
	return s
}

func (s *AliyunPopRequestInfo) SetProxyOriginalSourceIp(v string) *AliyunPopRequestInfo {
	s.ProxyOriginalSourceIp = &v
	return s
}

func (s *AliyunPopRequestInfo) SetProxyTrustTransportInfo(v bool) *AliyunPopRequestInfo {
	s.ProxyTrustTransportInfo = &v
	return s
}

func (s *AliyunPopRequestInfo) SetRequestId(v string) *AliyunPopRequestInfo {
	s.RequestId = &v
	return s
}

func (s *AliyunPopRequestInfo) SetSecurityToken(v string) *AliyunPopRequestInfo {
	s.SecurityToken = &v
	return s
}

func (s *AliyunPopRequestInfo) SetSecurityTransport(v bool) *AliyunPopRequestInfo {
	s.SecurityTransport = &v
	return s
}

func (s *AliyunPopRequestInfo) SetSourceIp(v string) *AliyunPopRequestInfo {
	s.SourceIp = &v
	return s
}

func (s *AliyunPopRequestInfo) SetStsTokenCallerBid(v string) *AliyunPopRequestInfo {
	s.StsTokenCallerBid = &v
	return s
}

func (s *AliyunPopRequestInfo) SetStsTokenCallerUid(v string) *AliyunPopRequestInfo {
	s.StsTokenCallerUid = &v
	return s
}

func (s *AliyunPopRequestInfo) SetStsTokenPrincipalId(v string) *AliyunPopRequestInfo {
	s.StsTokenPrincipalId = &v
	return s
}

func (s *AliyunPopRequestInfo) SetStsTokenRoleId(v string) *AliyunPopRequestInfo {
	s.StsTokenRoleId = &v
	return s
}

func (s *AliyunPopRequestInfo) SetStsTokenUserId(v string) *AliyunPopRequestInfo {
	s.StsTokenUserId = &v
	return s
}

func (s *AliyunPopRequestInfo) SetVersion(v string) *AliyunPopRequestInfo {
	s.Version = &v
	return s
}

// 虚拟身份受信关系
type StsActorBinding struct {
	// 虚拟身份ID
	ActorId *string `json:"actor_id,omitempty" xml:"actor_id,omitempty"`
	// 受信对象ID
	BindId *string `json:"bind_id,omitempty" xml:"bind_id,omitempty"`
	// 虚拟身份受信类型，可以为TENANT或者ALIYUN_SERVICE
	BindType *string `json:"bind_type,omitempty" xml:"bind_type,omitempty"`
}

func (s StsActorBinding) String() string {
	return tea.Prettify(s)
}

func (s StsActorBinding) GoString() string {
	return s.String()
}

func (s *StsActorBinding) SetActorId(v string) *StsActorBinding {
	s.ActorId = &v
	return s
}

func (s *StsActorBinding) SetBindId(v string) *StsActorBinding {
	s.BindId = &v
	return s
}

func (s *StsActorBinding) SetBindType(v string) *StsActorBinding {
	s.BindType = &v
	return s
}

// 操作点
type Action struct {
	// 操作点描述
	Description *string `json:"description,omitempty" xml:"description,omitempty"`
	// 操作点ID
	Id *string `json:"id,omitempty" xml:"id,omitempty"`
	// 操作点名称
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
}

func (s Action) String() string {
	return tea.Prettify(s)
}

func (s Action) GoString() string {
	return s.String()
}

func (s *Action) SetDescription(v string) *Action {
	s.Description = &v
	return s
}

func (s *Action) SetId(v string) *Action {
	s.Id = &v
	return s
}

func (s *Action) SetName(v string) *Action {
	s.Name = &v
	return s
}

// 操作类型
type OperationType struct {
	// 操作描述
	Description *string `json:"description,omitempty" xml:"description,omitempty" require:"true"`
	// 展示名称
	DisplayName *string `json:"display_name,omitempty" xml:"display_name,omitempty" require:"true"`
	// 是否启用
	Enabled *string `json:"enabled,omitempty" xml:"enabled,omitempty" require:"true"`
	// 操作名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 产品码
	Product *string `json:"product,omitempty" xml:"product,omitempty" require:"true"`
	// 操作来源
	Source *string `json:"source,omitempty" xml:"source,omitempty" require:"true"`
	// Onex接口额外信息
	OnexExtraInfo *OnexExtraInfo `json:"onex_extra_info,omitempty" xml:"onex_extra_info,omitempty"`
	// 资源类型
	ResourceType *string `json:"resource_type,omitempty" xml:"resource_type,omitempty"`
	// 资源表达式
	ResourceExp *string `json:"resource_exp,omitempty" xml:"resource_exp,omitempty"`
}

func (s OperationType) String() string {
	return tea.Prettify(s)
}

func (s OperationType) GoString() string {
	return s.String()
}

func (s *OperationType) SetDescription(v string) *OperationType {
	s.Description = &v
	return s
}

func (s *OperationType) SetDisplayName(v string) *OperationType {
	s.DisplayName = &v
	return s
}

func (s *OperationType) SetEnabled(v string) *OperationType {
	s.Enabled = &v
	return s
}

func (s *OperationType) SetName(v string) *OperationType {
	s.Name = &v
	return s
}

func (s *OperationType) SetProduct(v string) *OperationType {
	s.Product = &v
	return s
}

func (s *OperationType) SetSource(v string) *OperationType {
	s.Source = &v
	return s
}

func (s *OperationType) SetOnexExtraInfo(v *OnexExtraInfo) *OperationType {
	s.OnexExtraInfo = v
	return s
}

func (s *OperationType) SetResourceType(v string) *OperationType {
	s.ResourceType = &v
	return s
}

func (s *OperationType) SetResourceExp(v string) *OperationType {
	s.ResourceExp = &v
	return s
}

// 部门用户关系
type DepartmentUser struct {
	// 部门唯一码
	DepartmentCode *string `json:"department_code,omitempty" xml:"department_code,omitempty"`
	// 用户 id
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty"`
	// 部门成员类型，
	Type *string `json:"type,omitempty" xml:"type,omitempty"`
}

func (s DepartmentUser) String() string {
	return tea.Prettify(s)
}

func (s DepartmentUser) GoString() string {
	return s.String()
}

func (s *DepartmentUser) SetDepartmentCode(v string) *DepartmentUser {
	s.DepartmentCode = &v
	return s
}

func (s *DepartmentUser) SetUserId(v string) *DepartmentUser {
	s.UserId = &v
	return s
}

func (s *DepartmentUser) SetType(v string) *DepartmentUser {
	s.Type = &v
	return s
}

// 阿里云批量鉴权
type AliyunAuthenticateBatchEvent struct {
	// 金融云用户ID
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
	// 阿里云鉴权列表
	RamAuthContexts []*AliyunRamAuthContext `json:"ram_auth_contexts,omitempty" xml:"ram_auth_contexts,omitempty" require:"true" type:"Repeated"`
	// BSB透传下来的阿里云信息
	RequestInfo *AliyunPopRequestInfo `json:"request_info,omitempty" xml:"request_info,omitempty" require:"true"`
}

func (s AliyunAuthenticateBatchEvent) String() string {
	return tea.Prettify(s)
}

func (s AliyunAuthenticateBatchEvent) GoString() string {
	return s.String()
}

func (s *AliyunAuthenticateBatchEvent) SetUserId(v string) *AliyunAuthenticateBatchEvent {
	s.UserId = &v
	return s
}

func (s *AliyunAuthenticateBatchEvent) SetRamAuthContexts(v []*AliyunRamAuthContext) *AliyunAuthenticateBatchEvent {
	s.RamAuthContexts = v
	return s
}

func (s *AliyunAuthenticateBatchEvent) SetRequestInfo(v *AliyunPopRequestInfo) *AliyunAuthenticateBatchEvent {
	s.RequestInfo = v
	return s
}

// 鉴权结果
type Judgement struct {
	// 唯一ID
	Id *string `json:"id,omitempty" xml:"id,omitempty"`
	// 是否通过
	Pass *bool `json:"pass,omitempty" xml:"pass,omitempty" require:"true"`
	// 失败原因
	Reason *string `json:"reason,omitempty" xml:"reason,omitempty"`
	// 解决方案
	Solution *string `json:"solution,omitempty" xml:"solution,omitempty"`
}

func (s Judgement) String() string {
	return tea.Prettify(s)
}

func (s Judgement) GoString() string {
	return s.String()
}

func (s *Judgement) SetId(v string) *Judgement {
	s.Id = &v
	return s
}

func (s *Judgement) SetPass(v bool) *Judgement {
	s.Pass = &v
	return s
}

func (s *Judgement) SetReason(v string) *Judgement {
	s.Reason = &v
	return s
}

func (s *Judgement) SetSolution(v string) *Judgement {
	s.Solution = &v
	return s
}

// 角色
type Role struct {
	// 操作点列表
	Actions []*Action `json:"actions,omitempty" xml:"actions,omitempty" type:"Repeated"`
	// 创建时间，ISO8601格式
	CreateTime *string `json:"create_time,omitempty" xml:"create_time,omitempty"`
	// 角色描述
	Description *string `json:"description,omitempty" xml:"description,omitempty"`
	// 角色ID
	Id *string `json:"id,omitempty" xml:"id,omitempty"`
	// 角色名称
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 角色归属租户
	Tenant *string `json:"tenant,omitempty" xml:"tenant,omitempty"`
	// 角色类型，CUSTOM:自定义角色，COMMON:系统通用角色
	Type *string `json:"type,omitempty" xml:"type,omitempty"`
	// 更新时间，ISO8601格式
	UpdateTime *string `json:"update_time,omitempty" xml:"update_time,omitempty"`
}

func (s Role) String() string {
	return tea.Prettify(s)
}

func (s Role) GoString() string {
	return s.String()
}

func (s *Role) SetActions(v []*Action) *Role {
	s.Actions = v
	return s
}

func (s *Role) SetCreateTime(v string) *Role {
	s.CreateTime = &v
	return s
}

func (s *Role) SetDescription(v string) *Role {
	s.Description = &v
	return s
}

func (s *Role) SetId(v string) *Role {
	s.Id = &v
	return s
}

func (s *Role) SetName(v string) *Role {
	s.Name = &v
	return s
}

func (s *Role) SetTenant(v string) *Role {
	s.Tenant = &v
	return s
}

func (s *Role) SetType(v string) *Role {
	s.Type = &v
	return s
}

func (s *Role) SetUpdateTime(v string) *Role {
	s.UpdateTime = &v
	return s
}

// 授权组
type AuthGroup struct {
	// 创建时间，ISO8601格式
	CreationTime *string `json:"creation_time,omitempty" xml:"creation_time,omitempty"`
	// 授权组ID
	Id *string `json:"id,omitempty" xml:"id,omitempty"`
	// 授权组名称
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 更新时间，ISO8601格式
	UpdateTime *string `json:"update_time,omitempty" xml:"update_time,omitempty"`
}

func (s AuthGroup) String() string {
	return tea.Prettify(s)
}

func (s AuthGroup) GoString() string {
	return s.String()
}

func (s *AuthGroup) SetCreationTime(v string) *AuthGroup {
	s.CreationTime = &v
	return s
}

func (s *AuthGroup) SetId(v string) *AuthGroup {
	s.Id = &v
	return s
}

func (s *AuthGroup) SetName(v string) *AuthGroup {
	s.Name = &v
	return s
}

func (s *AuthGroup) SetUpdateTime(v string) *AuthGroup {
	s.UpdateTime = &v
	return s
}

// AccessKey
type AccessKey struct {
	// AccessKey创建时间，ISO8601格式
	CreateTime *string `json:"create_time,omitempty" xml:"create_time,omitempty"`
	// AccessKey唯一标识
	Id *string `json:"id,omitempty" xml:"id,omitempty"`
	// AccessKey的秘钥，加密传输，网关返回后，使用调用方的AccesSecret进行解密
	Secret *string `json:"secret,omitempty" xml:"secret,omitempty"`
	// 状态
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// AccessKey最近一次修改时间，ISO8601格式
	UpdateTime *string `json:"update_time,omitempty" xml:"update_time,omitempty"`
}

func (s AccessKey) String() string {
	return tea.Prettify(s)
}

func (s AccessKey) GoString() string {
	return s.String()
}

func (s *AccessKey) SetCreateTime(v string) *AccessKey {
	s.CreateTime = &v
	return s
}

func (s *AccessKey) SetId(v string) *AccessKey {
	s.Id = &v
	return s
}

func (s *AccessKey) SetSecret(v string) *AccessKey {
	s.Secret = &v
	return s
}

func (s *AccessKey) SetStatus(v string) *AccessKey {
	s.Status = &v
	return s
}

func (s *AccessKey) SetUpdateTime(v string) *AccessKey {
	s.UpdateTime = &v
	return s
}

// 虚拟身份
type StsActor struct {
	// 虚拟身份受信关系集合，通常只包含一个
	Bindings []*StsActorBinding `json:"bindings,omitempty" xml:"bindings,omitempty" require:"true" type:"Repeated"`
	// 针对虚拟身份的描述
	Description *string `json:"description,omitempty" xml:"description,omitempty"`
	// 虚拟身份名称，租户内唯一
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 虚拟身份所在租户
	Tenant *string `json:"tenant,omitempty" xml:"tenant,omitempty" require:"true"`
}

func (s StsActor) String() string {
	return tea.Prettify(s)
}

func (s StsActor) GoString() string {
	return s.String()
}

func (s *StsActor) SetBindings(v []*StsActorBinding) *StsActor {
	s.Bindings = v
	return s
}

func (s *StsActor) SetDescription(v string) *StsActor {
	s.Description = &v
	return s
}

func (s *StsActor) SetName(v string) *StsActor {
	s.Name = &v
	return s
}

func (s *StsActor) SetTenant(v string) *StsActor {
	s.Tenant = &v
	return s
}

// 授权策略
type AuthPolicy struct {
	// 授权能力Id
	AbilityId *string `json:"ability_id,omitempty" xml:"ability_id,omitempty"`
	// 授权能力类型（ROLE：角色，ACTION：操作）
	AbilityType *string `json:"ability_type,omitempty" xml:"ability_type,omitempty"`
	// 授权条件
	Conditions []*Condition `json:"conditions,omitempty" xml:"conditions,omitempty" type:"Repeated"`
	// 创建时间，ISO8601格式
	CreateTime *string `json:"create_time,omitempty" xml:"create_time,omitempty"`
	// 权限策略描述
	Description *string `json:"description,omitempty" xml:"description,omitempty"`
	// 授权策略ID
	Id *string `json:"id,omitempty" xml:"id,omitempty"`
	// 授权策略名称
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 授权条件
	ScopeEntities []*ScopeEntity `json:"scope_entities,omitempty" xml:"scope_entities,omitempty" type:"Repeated"`
	// 授权策略归属租户
	Tenant *string `json:"tenant,omitempty" xml:"tenant,omitempty"`
	// 授权策略类型（CUSTOM：自定义授权策略）
	Type *string `json:"type,omitempty" xml:"type,omitempty"`
	// 更新时间，ISO8601格式
	UpdateTime *string `json:"update_time,omitempty" xml:"update_time,omitempty"`
}

func (s AuthPolicy) String() string {
	return tea.Prettify(s)
}

func (s AuthPolicy) GoString() string {
	return s.String()
}

func (s *AuthPolicy) SetAbilityId(v string) *AuthPolicy {
	s.AbilityId = &v
	return s
}

func (s *AuthPolicy) SetAbilityType(v string) *AuthPolicy {
	s.AbilityType = &v
	return s
}

func (s *AuthPolicy) SetConditions(v []*Condition) *AuthPolicy {
	s.Conditions = v
	return s
}

func (s *AuthPolicy) SetCreateTime(v string) *AuthPolicy {
	s.CreateTime = &v
	return s
}

func (s *AuthPolicy) SetDescription(v string) *AuthPolicy {
	s.Description = &v
	return s
}

func (s *AuthPolicy) SetId(v string) *AuthPolicy {
	s.Id = &v
	return s
}

func (s *AuthPolicy) SetName(v string) *AuthPolicy {
	s.Name = &v
	return s
}

func (s *AuthPolicy) SetScopeEntities(v []*ScopeEntity) *AuthPolicy {
	s.ScopeEntities = v
	return s
}

func (s *AuthPolicy) SetTenant(v string) *AuthPolicy {
	s.Tenant = &v
	return s
}

func (s *AuthPolicy) SetType(v string) *AuthPolicy {
	s.Type = &v
	return s
}

func (s *AuthPolicy) SetUpdateTime(v string) *AuthPolicy {
	s.UpdateTime = &v
	return s
}

// 租户
type Tenant struct {
	// 蚂蚁通行证签约账户
	AntAccount *string `json:"ant_account,omitempty" xml:"ant_account,omitempty"`
	// 蚂蚁通行证uid
	AntUid *string `json:"ant_uid,omitempty" xml:"ant_uid,omitempty"`
	// 金融云官网:ANTCLOUD,蚂蚁开放平台：ANTOPEN
	BusinessOwnerId *string `json:"business_owner_id,omitempty" xml:"business_owner_id,omitempty"`
	// 租户创建时间，ISO8601格式
	CreateTime *string `json:"create_time,omitempty" xml:"create_time,omitempty"`
	// 租户所在的企业的唯一标识
	Customer *string `json:"customer,omitempty" xml:"customer,omitempty"`
	// 租户描述信息
	Description *string `json:"description,omitempty" xml:"description,omitempty"`
	// 租户唯一标识
	Id *string `json:"id,omitempty" xml:"id,omitempty"`
	// 租户内部id
	InternalId *string `json:"internal_id,omitempty" xml:"internal_id,omitempty"`
	// 租户显示名称
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 租户最近一次修改时间，ISO8601格式
	UpdateTime *string `json:"update_time,omitempty" xml:"update_time,omitempty"`
	// 标签
	Tags []*string `json:"tags,omitempty" xml:"tags,omitempty" type:"Repeated"`
}

func (s Tenant) String() string {
	return tea.Prettify(s)
}

func (s Tenant) GoString() string {
	return s.String()
}

func (s *Tenant) SetAntAccount(v string) *Tenant {
	s.AntAccount = &v
	return s
}

func (s *Tenant) SetAntUid(v string) *Tenant {
	s.AntUid = &v
	return s
}

func (s *Tenant) SetBusinessOwnerId(v string) *Tenant {
	s.BusinessOwnerId = &v
	return s
}

func (s *Tenant) SetCreateTime(v string) *Tenant {
	s.CreateTime = &v
	return s
}

func (s *Tenant) SetCustomer(v string) *Tenant {
	s.Customer = &v
	return s
}

func (s *Tenant) SetDescription(v string) *Tenant {
	s.Description = &v
	return s
}

func (s *Tenant) SetId(v string) *Tenant {
	s.Id = &v
	return s
}

func (s *Tenant) SetInternalId(v string) *Tenant {
	s.InternalId = &v
	return s
}

func (s *Tenant) SetName(v string) *Tenant {
	s.Name = &v
	return s
}

func (s *Tenant) SetUpdateTime(v string) *Tenant {
	s.UpdateTime = &v
	return s
}

func (s *Tenant) SetTags(v []*string) *Tenant {
	s.Tags = v
	return s
}

// 部门
type Department struct {
	// 部门唯一代码
	Code *string `json:"code,omitempty" xml:"code,omitempty"`
	// 部门名称
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 部门描述信息
	Description *string `json:"description,omitempty" xml:"description,omitempty"`
	// 父部门 code
	ParentCode *string `json:"parent_code,omitempty" xml:"parent_code,omitempty"`
	// 父部门一直到根节点的路径，例如：DP0000000001/DP0000000002
	ParentPath *string `json:"parent_path,omitempty" xml:"parent_path,omitempty"`
	// 企业 id
	CustomerId *string `json:"customer_id,omitempty" xml:"customer_id,omitempty"`
	// 是否为叶子结点
	IsLeaf *bool `json:"is_leaf,omitempty" xml:"is_leaf,omitempty"`
	// 创建时间，ISO8601格式
	CreationTime *string `json:"creation_time,omitempty" xml:"creation_time,omitempty"`
	// 更新时间，ISO8601格式
	UpdateTime *string `json:"update_time,omitempty" xml:"update_time,omitempty"`
}

func (s Department) String() string {
	return tea.Prettify(s)
}

func (s Department) GoString() string {
	return s.String()
}

func (s *Department) SetCode(v string) *Department {
	s.Code = &v
	return s
}

func (s *Department) SetName(v string) *Department {
	s.Name = &v
	return s
}

func (s *Department) SetDescription(v string) *Department {
	s.Description = &v
	return s
}

func (s *Department) SetParentCode(v string) *Department {
	s.ParentCode = &v
	return s
}

func (s *Department) SetParentPath(v string) *Department {
	s.ParentPath = &v
	return s
}

func (s *Department) SetCustomerId(v string) *Department {
	s.CustomerId = &v
	return s
}

func (s *Department) SetIsLeaf(v bool) *Department {
	s.IsLeaf = &v
	return s
}

func (s *Department) SetCreationTime(v string) *Department {
	s.CreationTime = &v
	return s
}

func (s *Department) SetUpdateTime(v string) *Department {
	s.UpdateTime = &v
	return s
}

// 批量鉴权对象
type AuthenticateBatchEvent struct {
	// 鉴权事件列表
	Events []*AuthenticateEvent `json:"events,omitempty" xml:"events,omitempty" require:"true" type:"Repeated"`
}

func (s AuthenticateBatchEvent) String() string {
	return tea.Prettify(s)
}

func (s AuthenticateBatchEvent) GoString() string {
	return s.String()
}

func (s *AuthenticateBatchEvent) SetEvents(v []*AuthenticateEvent) *AuthenticateBatchEvent {
	s.Events = v
	return s
}

// 访问IaaS层的身份
type Accessor struct {
	// Accessor关联的AccessKey
	AccessKey *string `json:"access_key,omitempty" xml:"access_key,omitempty"`
	// Accessor关联的AccessKey的密钥，加密传输，网关返回后，使用调用方的AccessSecret进行解密
	AccessSecret *string `json:"access_secret,omitempty" xml:"access_secret,omitempty"`
	// AccessKey的密钥，加密传输，网关返回后，使用调用方的AccessSecret进行解密
	Account *string `json:"account,omitempty" xml:"account,omitempty"`
	// AccessKey创建时间，ISO8601格式
	CreateTime *string `json:"create_time,omitempty" xml:"create_time,omitempty"`
	// Accessor唯一标识
	Id *string `json:"id,omitempty" xml:"id,omitempty"`
	// Accessor类型(RAM/ACCOUNT)
	Type *string `json:"type,omitempty" xml:"type,omitempty"`
}

func (s Accessor) String() string {
	return tea.Prettify(s)
}

func (s Accessor) GoString() string {
	return s.String()
}

func (s *Accessor) SetAccessKey(v string) *Accessor {
	s.AccessKey = &v
	return s
}

func (s *Accessor) SetAccessSecret(v string) *Accessor {
	s.AccessSecret = &v
	return s
}

func (s *Accessor) SetAccount(v string) *Accessor {
	s.Account = &v
	return s
}

func (s *Accessor) SetCreateTime(v string) *Accessor {
	s.CreateTime = &v
	return s
}

func (s *Accessor) SetId(v string) *Accessor {
	s.Id = &v
	return s
}

func (s *Accessor) SetType(v string) *Accessor {
	s.Type = &v
	return s
}

// 企业
type Customer struct {
	// 企业创建时间，ISO8601格式
	CreateTime *string `json:"create_time,omitempty" xml:"create_time,omitempty"`
	// 企业ID
	Id *string `json:"id,omitempty" xml:"id,omitempty"`
	// 企业名称
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 企业最近一次修改时间，ISO8601格式
	UpdateTime *string `json:"update_time,omitempty" xml:"update_time,omitempty"`
}

func (s Customer) String() string {
	return tea.Prettify(s)
}

func (s Customer) GoString() string {
	return s.String()
}

func (s *Customer) SetCreateTime(v string) *Customer {
	s.CreateTime = &v
	return s
}

func (s *Customer) SetId(v string) *Customer {
	s.Id = &v
	return s
}

func (s *Customer) SetName(v string) *Customer {
	s.Name = &v
	return s
}

func (s *Customer) SetUpdateTime(v string) *Customer {
	s.UpdateTime = &v
	return s
}

// Mfa 配置
type MfaConfig struct {
	// 用户id
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty"`
	// MFA状态, 取值范围：ENABLED, DISABLED
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// MFA类型，取值范围：SELF(自有MFA), SYMANTEC(赛门铁克MFA)
	Type *string `json:"type,omitempty" xml:"type,omitempty"`
	// 密钥
	SecretKey *string `json:"secret_key,omitempty" xml:"secret_key,omitempty"`
	// 最后一次密钥生成时间
	LastGeneratedTime *string `json:"last_generated_time,omitempty" xml:"last_generated_time,omitempty"`
	// (校验失败时)重试校验的次数, 0 代表不限次数
	VerifyAttempts *int64 `json:"verify_attempts,omitempty" xml:"verify_attempts,omitempty"`
	// 第一次校验失败时间, ISO8601格式
	FirstFailureTime *string `json:"first_failure_time,omitempty" xml:"first_failure_time,omitempty"`
}

func (s MfaConfig) String() string {
	return tea.Prettify(s)
}

func (s MfaConfig) GoString() string {
	return s.String()
}

func (s *MfaConfig) SetUserId(v string) *MfaConfig {
	s.UserId = &v
	return s
}

func (s *MfaConfig) SetStatus(v string) *MfaConfig {
	s.Status = &v
	return s
}

func (s *MfaConfig) SetType(v string) *MfaConfig {
	s.Type = &v
	return s
}

func (s *MfaConfig) SetSecretKey(v string) *MfaConfig {
	s.SecretKey = &v
	return s
}

func (s *MfaConfig) SetLastGeneratedTime(v string) *MfaConfig {
	s.LastGeneratedTime = &v
	return s
}

func (s *MfaConfig) SetVerifyAttempts(v int64) *MfaConfig {
	s.VerifyAttempts = &v
	return s
}

func (s *MfaConfig) SetFirstFailureTime(v string) *MfaConfig {
	s.FirstFailureTime = &v
	return s
}

// 成员组
type Group struct {
	// 成员组ID
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 成员组名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 成员组描述
	Description *string `json:"description,omitempty" xml:"description,omitempty" require:"true"`
}

func (s Group) String() string {
	return tea.Prettify(s)
}

func (s Group) GoString() string {
	return s.String()
}

func (s *Group) SetId(v string) *Group {
	s.Id = &v
	return s
}

func (s *Group) SetName(v string) *Group {
	s.Name = &v
	return s
}

func (s *Group) SetDescription(v string) *Group {
	s.Description = &v
	return s
}

// 操作员
type Operator struct {
	// 操作员创建时间，ISO8601格式
	CreateTime *string `json:"create_time,omitempty" xml:"create_time,omitempty"`
	// 操作员所在的企业
	Customer *string `json:"customer,omitempty" xml:"customer,omitempty"`
	// 邮箱
	Email *string `json:"email,omitempty" xml:"email,omitempty"`
	// 外部对接系统操作员id
	ExternalId *string `json:"external_id,omitempty" xml:"external_id,omitempty"`
	// 外部对接系统类型
	ExternalSystem *string `json:"external_system,omitempty" xml:"external_system,omitempty"`
	// 操作员ID
	Id *string `json:"id,omitempty" xml:"id,omitempty"`
	// 是否是主账号
	IsMaster *bool `json:"is_master,omitempty" xml:"is_master,omitempty"`
	// 登录名
	LoginName *string `json:"login_name,omitempty" xml:"login_name,omitempty"`
	// 手机号
	Mobile *string `json:"mobile,omitempty" xml:"mobile,omitempty"`
	// 昵称
	Nickname *string `json:"nickname,omitempty" xml:"nickname,omitempty"`
	// 真实姓名
	RealName *string `json:"real_name,omitempty" xml:"real_name,omitempty"`
	// 操作员状态(INACTIVE：未激活，NORMAL：正常状态，FROZEN：冻结状态)
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 操作员加入的租户列表
	Tenants []*string `json:"tenants,omitempty" xml:"tenants,omitempty" type:"Repeated"`
	// 操作员最近一次修改时间，ISO8601格式
	UpdateTime *string `json:"update_time,omitempty" xml:"update_time,omitempty"`
	// 操作员工号
	WorkNo *string `json:"work_no,omitempty" xml:"work_no,omitempty"`
	// 部门唯一码
	DepartmentCode *string `json:"department_code,omitempty" xml:"department_code,omitempty"`
	// 最近一次登录时间，为空则代表没有登录过，ISO8601格式，
	LastLoginTime *string `json:"last_login_time,omitempty" xml:"last_login_time,omitempty"`
}

func (s Operator) String() string {
	return tea.Prettify(s)
}

func (s Operator) GoString() string {
	return s.String()
}

func (s *Operator) SetCreateTime(v string) *Operator {
	s.CreateTime = &v
	return s
}

func (s *Operator) SetCustomer(v string) *Operator {
	s.Customer = &v
	return s
}

func (s *Operator) SetEmail(v string) *Operator {
	s.Email = &v
	return s
}

func (s *Operator) SetExternalId(v string) *Operator {
	s.ExternalId = &v
	return s
}

func (s *Operator) SetExternalSystem(v string) *Operator {
	s.ExternalSystem = &v
	return s
}

func (s *Operator) SetId(v string) *Operator {
	s.Id = &v
	return s
}

func (s *Operator) SetIsMaster(v bool) *Operator {
	s.IsMaster = &v
	return s
}

func (s *Operator) SetLoginName(v string) *Operator {
	s.LoginName = &v
	return s
}

func (s *Operator) SetMobile(v string) *Operator {
	s.Mobile = &v
	return s
}

func (s *Operator) SetNickname(v string) *Operator {
	s.Nickname = &v
	return s
}

func (s *Operator) SetRealName(v string) *Operator {
	s.RealName = &v
	return s
}

func (s *Operator) SetStatus(v string) *Operator {
	s.Status = &v
	return s
}

func (s *Operator) SetTenants(v []*string) *Operator {
	s.Tenants = v
	return s
}

func (s *Operator) SetUpdateTime(v string) *Operator {
	s.UpdateTime = &v
	return s
}

func (s *Operator) SetWorkNo(v string) *Operator {
	s.WorkNo = &v
	return s
}

func (s *Operator) SetDepartmentCode(v string) *Operator {
	s.DepartmentCode = &v
	return s
}

func (s *Operator) SetLastLoginTime(v string) *Operator {
	s.LastLoginTime = &v
	return s
}

type GetRoleRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 角色ID
	RoleId *string `json:"role_id,omitempty" xml:"role_id,omitempty" require:"true"`
}

func (s GetRoleRequest) String() string {
	return tea.Prettify(s)
}

func (s GetRoleRequest) GoString() string {
	return s.String()
}

func (s *GetRoleRequest) SetAuthToken(v string) *GetRoleRequest {
	s.AuthToken = &v
	return s
}

func (s *GetRoleRequest) SetRoleId(v string) *GetRoleRequest {
	s.RoleId = &v
	return s
}

type GetRoleResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 角色所包含的操作点
	Actions []*Action `json:"actions,omitempty" xml:"actions,omitempty" type:"Repeated"`
	// 创建时间,ISO8601格式
	CreateTime *string `json:"create_time,omitempty" xml:"create_time,omitempty"`
	// 角色描述
	Description *string `json:"description,omitempty" xml:"description,omitempty"`
	// 角色Id
	Id *string `json:"id,omitempty" xml:"id,omitempty"`
	// 角色名称
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 角色归属租户
	Tenant *string `json:"tenant,omitempty" xml:"tenant,omitempty"`
	// 角色类型，CUSTOM:自定义角色，COMMON:系统通用角色
	Type *string `json:"type,omitempty" xml:"type,omitempty"`
	// 更新时间,ISO8601格式
	UpdateTime *string `json:"update_time,omitempty" xml:"update_time,omitempty"`
}

func (s GetRoleResponse) String() string {
	return tea.Prettify(s)
}

func (s GetRoleResponse) GoString() string {
	return s.String()
}

func (s *GetRoleResponse) SetReqMsgId(v string) *GetRoleResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetRoleResponse) SetResultCode(v string) *GetRoleResponse {
	s.ResultCode = &v
	return s
}

func (s *GetRoleResponse) SetResultMsg(v string) *GetRoleResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetRoleResponse) SetActions(v []*Action) *GetRoleResponse {
	s.Actions = v
	return s
}

func (s *GetRoleResponse) SetCreateTime(v string) *GetRoleResponse {
	s.CreateTime = &v
	return s
}

func (s *GetRoleResponse) SetDescription(v string) *GetRoleResponse {
	s.Description = &v
	return s
}

func (s *GetRoleResponse) SetId(v string) *GetRoleResponse {
	s.Id = &v
	return s
}

func (s *GetRoleResponse) SetName(v string) *GetRoleResponse {
	s.Name = &v
	return s
}

func (s *GetRoleResponse) SetTenant(v string) *GetRoleResponse {
	s.Tenant = &v
	return s
}

func (s *GetRoleResponse) SetType(v string) *GetRoleResponse {
	s.Type = &v
	return s
}

func (s *GetRoleResponse) SetUpdateTime(v string) *GetRoleResponse {
	s.UpdateTime = &v
	return s
}

type QueryPolicyRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 授权对象id
	ActorId *string `json:"actor_id,omitempty" xml:"actor_id,omitempty" require:"true"`
	// 授权对象类型
	ActorType *string `json:"actor_type,omitempty" xml:"actor_type,omitempty" require:"true"`
	// 当前页，默认值为1
	PageNum *int `json:"page_num,omitempty" xml:"page_num,omitempty"`
	// 分页大小，默认值为10
	PageSize *int `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// 授权策略所属租户
	Tenant *string `json:"tenant,omitempty" xml:"tenant,omitempty" require:"true"`
}

func (s QueryPolicyRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryPolicyRequest) GoString() string {
	return s.String()
}

func (s *QueryPolicyRequest) SetAuthToken(v string) *QueryPolicyRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryPolicyRequest) SetActorId(v string) *QueryPolicyRequest {
	s.ActorId = &v
	return s
}

func (s *QueryPolicyRequest) SetActorType(v string) *QueryPolicyRequest {
	s.ActorType = &v
	return s
}

func (s *QueryPolicyRequest) SetPageNum(v int) *QueryPolicyRequest {
	s.PageNum = &v
	return s
}

func (s *QueryPolicyRequest) SetPageSize(v int) *QueryPolicyRequest {
	s.PageSize = &v
	return s
}

func (s *QueryPolicyRequest) SetTenant(v string) *QueryPolicyRequest {
	s.Tenant = &v
	return s
}

type QueryPolicyResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 传入的页码, 如果没有传入, 则取默认值1
	PageNum *int `json:"page_num,omitempty" xml:"page_num,omitempty" require:"true"`
	// 传入的页大小, 如果没有传入, 则取默认值10
	PageSize *int `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
	// 授权策略列表
	Policies []*AuthPolicy `json:"policies,omitempty" xml:"policies,omitempty" require:"true" type:"Repeated"`
	// 查询结果的总条目数量
	TotalCount *int `json:"total_count,omitempty" xml:"total_count,omitempty" require:"true"`
}

func (s QueryPolicyResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryPolicyResponse) GoString() string {
	return s.String()
}

func (s *QueryPolicyResponse) SetReqMsgId(v string) *QueryPolicyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryPolicyResponse) SetResultCode(v string) *QueryPolicyResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryPolicyResponse) SetResultMsg(v string) *QueryPolicyResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryPolicyResponse) SetPageNum(v int) *QueryPolicyResponse {
	s.PageNum = &v
	return s
}

func (s *QueryPolicyResponse) SetPageSize(v int) *QueryPolicyResponse {
	s.PageSize = &v
	return s
}

func (s *QueryPolicyResponse) SetPolicies(v []*AuthPolicy) *QueryPolicyResponse {
	s.Policies = v
	return s
}

func (s *QueryPolicyResponse) SetTotalCount(v int) *QueryPolicyResponse {
	s.TotalCount = &v
	return s
}

type QueryGroupRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 授权组成员ID。授权组成员是操作员
	MemberId *string `json:"member_id,omitempty" xml:"member_id,omitempty"`
	// 授权组名称
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 当前页码，默认为1
	PageNum *int `json:"page_num,omitempty" xml:"page_num,omitempty"`
	// 分页大小，默认10
	PageSize *int `json:"page_size,omitempty" xml:"page_size,omitempty"`
}

func (s QueryGroupRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryGroupRequest) GoString() string {
	return s.String()
}

func (s *QueryGroupRequest) SetAuthToken(v string) *QueryGroupRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryGroupRequest) SetMemberId(v string) *QueryGroupRequest {
	s.MemberId = &v
	return s
}

func (s *QueryGroupRequest) SetName(v string) *QueryGroupRequest {
	s.Name = &v
	return s
}

func (s *QueryGroupRequest) SetPageNum(v int) *QueryGroupRequest {
	s.PageNum = &v
	return s
}

func (s *QueryGroupRequest) SetPageSize(v int) *QueryGroupRequest {
	s.PageSize = &v
	return s
}

type QueryGroupResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 授权组列表
	Groups []*AuthGroup `json:"groups,omitempty" xml:"groups,omitempty" require:"true" type:"Repeated"`
	// 当前页码
	PageNum *int `json:"page_num,omitempty" xml:"page_num,omitempty" require:"true"`
	// 分页大小
	PageSize *int `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
	// 应用总数
	TotalCount *int `json:"total_count,omitempty" xml:"total_count,omitempty" require:"true"`
}

func (s QueryGroupResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryGroupResponse) GoString() string {
	return s.String()
}

func (s *QueryGroupResponse) SetReqMsgId(v string) *QueryGroupResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryGroupResponse) SetResultCode(v string) *QueryGroupResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryGroupResponse) SetResultMsg(v string) *QueryGroupResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryGroupResponse) SetGroups(v []*AuthGroup) *QueryGroupResponse {
	s.Groups = v
	return s
}

func (s *QueryGroupResponse) SetPageNum(v int) *QueryGroupResponse {
	s.PageNum = &v
	return s
}

func (s *QueryGroupResponse) SetPageSize(v int) *QueryGroupResponse {
	s.PageSize = &v
	return s
}

func (s *QueryGroupResponse) SetTotalCount(v int) *QueryGroupResponse {
	s.TotalCount = &v
	return s
}

type CreatePolicyRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 角色Id
	AbilityId *string `json:"ability_id,omitempty" xml:"ability_id,omitempty" require:"true"`
	// 授权能力类型（ROLE：角色)
	AbilityType *string `json:"ability_type,omitempty" xml:"ability_type,omitempty" require:"true"`
	// 授权策略的限制条件
	Conditons []*Condition `json:"conditons,omitempty" xml:"conditons,omitempty" type:"Repeated"`
	// 策略的描述
	Description *string `json:"description,omitempty" xml:"description,omitempty"`
	// 授权策略名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 八位租户ID
	Tenant *string `json:"tenant,omitempty" xml:"tenant,omitempty" require:"true"`
}

func (s CreatePolicyRequest) String() string {
	return tea.Prettify(s)
}

func (s CreatePolicyRequest) GoString() string {
	return s.String()
}

func (s *CreatePolicyRequest) SetAuthToken(v string) *CreatePolicyRequest {
	s.AuthToken = &v
	return s
}

func (s *CreatePolicyRequest) SetAbilityId(v string) *CreatePolicyRequest {
	s.AbilityId = &v
	return s
}

func (s *CreatePolicyRequest) SetAbilityType(v string) *CreatePolicyRequest {
	s.AbilityType = &v
	return s
}

func (s *CreatePolicyRequest) SetConditons(v []*Condition) *CreatePolicyRequest {
	s.Conditons = v
	return s
}

func (s *CreatePolicyRequest) SetDescription(v string) *CreatePolicyRequest {
	s.Description = &v
	return s
}

func (s *CreatePolicyRequest) SetName(v string) *CreatePolicyRequest {
	s.Name = &v
	return s
}

func (s *CreatePolicyRequest) SetTenant(v string) *CreatePolicyRequest {
	s.Tenant = &v
	return s
}

type CreatePolicyResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 授权策略id
	PolicyId *string `json:"policy_id,omitempty" xml:"policy_id,omitempty" require:"true"`
}

func (s CreatePolicyResponse) String() string {
	return tea.Prettify(s)
}

func (s CreatePolicyResponse) GoString() string {
	return s.String()
}

func (s *CreatePolicyResponse) SetReqMsgId(v string) *CreatePolicyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreatePolicyResponse) SetResultCode(v string) *CreatePolicyResponse {
	s.ResultCode = &v
	return s
}

func (s *CreatePolicyResponse) SetResultMsg(v string) *CreatePolicyResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreatePolicyResponse) SetPolicyId(v string) *CreatePolicyResponse {
	s.PolicyId = &v
	return s
}

type DeletePolicyRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 授权策略Id
	PolicyId *string `json:"policy_id,omitempty" xml:"policy_id,omitempty" require:"true"`
}

func (s DeletePolicyRequest) String() string {
	return tea.Prettify(s)
}

func (s DeletePolicyRequest) GoString() string {
	return s.String()
}

func (s *DeletePolicyRequest) SetAuthToken(v string) *DeletePolicyRequest {
	s.AuthToken = &v
	return s
}

func (s *DeletePolicyRequest) SetPolicyId(v string) *DeletePolicyRequest {
	s.PolicyId = &v
	return s
}

type DeletePolicyResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s DeletePolicyResponse) String() string {
	return tea.Prettify(s)
}

func (s DeletePolicyResponse) GoString() string {
	return s.String()
}

func (s *DeletePolicyResponse) SetReqMsgId(v string) *DeletePolicyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DeletePolicyResponse) SetResultCode(v string) *DeletePolicyResponse {
	s.ResultCode = &v
	return s
}

func (s *DeletePolicyResponse) SetResultMsg(v string) *DeletePolicyResponse {
	s.ResultMsg = &v
	return s
}

type AttachPolicyRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 授权对象Id
	ActorId *string `json:"actor_id,omitempty" xml:"actor_id,omitempty"`
	// 授权对象类型
	ActorType *string `json:"actor_type,omitempty" xml:"actor_type,omitempty"`
	// 授权策略Id
	PolicyId *string `json:"policy_id,omitempty" xml:"policy_id,omitempty"`
	// 授权操作员的登录名，当配置actor_id与actor_type时可不填
	LoginName *string `json:"login_name,omitempty" xml:"login_name,omitempty"`
	// 授权策略的唯一名称，当配置policy_id时可不填
	PolicyName *string `json:"policy_name,omitempty" xml:"policy_name,omitempty"`
}

func (s AttachPolicyRequest) String() string {
	return tea.Prettify(s)
}

func (s AttachPolicyRequest) GoString() string {
	return s.String()
}

func (s *AttachPolicyRequest) SetAuthToken(v string) *AttachPolicyRequest {
	s.AuthToken = &v
	return s
}

func (s *AttachPolicyRequest) SetActorId(v string) *AttachPolicyRequest {
	s.ActorId = &v
	return s
}

func (s *AttachPolicyRequest) SetActorType(v string) *AttachPolicyRequest {
	s.ActorType = &v
	return s
}

func (s *AttachPolicyRequest) SetPolicyId(v string) *AttachPolicyRequest {
	s.PolicyId = &v
	return s
}

func (s *AttachPolicyRequest) SetLoginName(v string) *AttachPolicyRequest {
	s.LoginName = &v
	return s
}

func (s *AttachPolicyRequest) SetPolicyName(v string) *AttachPolicyRequest {
	s.PolicyName = &v
	return s
}

type AttachPolicyResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s AttachPolicyResponse) String() string {
	return tea.Prettify(s)
}

func (s AttachPolicyResponse) GoString() string {
	return s.String()
}

func (s *AttachPolicyResponse) SetReqMsgId(v string) *AttachPolicyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AttachPolicyResponse) SetResultCode(v string) *AttachPolicyResponse {
	s.ResultCode = &v
	return s
}

func (s *AttachPolicyResponse) SetResultMsg(v string) *AttachPolicyResponse {
	s.ResultMsg = &v
	return s
}

type DetachPolicyRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 授权对象Id
	ActorId *string `json:"actor_id,omitempty" xml:"actor_id,omitempty"`
	// 授权对象类型
	ActorType *string `json:"actor_type,omitempty" xml:"actor_type,omitempty"`
	// 授权策略Id
	PolicyId *string `json:"policy_id,omitempty" xml:"policy_id,omitempty"`
	// 授权操作员的登录名，当配置actor_id与actor_type时可不填
	LoginName *string `json:"login_name,omitempty" xml:"login_name,omitempty"`
	// 授权策略的唯一名称，当配置policy_id时可不填
	PolicyName *string `json:"policy_name,omitempty" xml:"policy_name,omitempty"`
}

func (s DetachPolicyRequest) String() string {
	return tea.Prettify(s)
}

func (s DetachPolicyRequest) GoString() string {
	return s.String()
}

func (s *DetachPolicyRequest) SetAuthToken(v string) *DetachPolicyRequest {
	s.AuthToken = &v
	return s
}

func (s *DetachPolicyRequest) SetActorId(v string) *DetachPolicyRequest {
	s.ActorId = &v
	return s
}

func (s *DetachPolicyRequest) SetActorType(v string) *DetachPolicyRequest {
	s.ActorType = &v
	return s
}

func (s *DetachPolicyRequest) SetPolicyId(v string) *DetachPolicyRequest {
	s.PolicyId = &v
	return s
}

func (s *DetachPolicyRequest) SetLoginName(v string) *DetachPolicyRequest {
	s.LoginName = &v
	return s
}

func (s *DetachPolicyRequest) SetPolicyName(v string) *DetachPolicyRequest {
	s.PolicyName = &v
	return s
}

type DetachPolicyResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s DetachPolicyResponse) String() string {
	return tea.Prettify(s)
}

func (s DetachPolicyResponse) GoString() string {
	return s.String()
}

func (s *DetachPolicyResponse) SetReqMsgId(v string) *DetachPolicyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DetachPolicyResponse) SetResultCode(v string) *DetachPolicyResponse {
	s.ResultCode = &v
	return s
}

func (s *DetachPolicyResponse) SetResultMsg(v string) *DetachPolicyResponse {
	s.ResultMsg = &v
	return s
}

type ListPolicyRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 授权对象id
	ActorId *string `json:"actor_id,omitempty" xml:"actor_id,omitempty" require:"true"`
	// 授权对象类型
	ActorType *string `json:"actor_type,omitempty" xml:"actor_type,omitempty" require:"true"`
	// 授权策略所属租户
	Tenant *string `json:"tenant,omitempty" xml:"tenant,omitempty"`
}

func (s ListPolicyRequest) String() string {
	return tea.Prettify(s)
}

func (s ListPolicyRequest) GoString() string {
	return s.String()
}

func (s *ListPolicyRequest) SetAuthToken(v string) *ListPolicyRequest {
	s.AuthToken = &v
	return s
}

func (s *ListPolicyRequest) SetActorId(v string) *ListPolicyRequest {
	s.ActorId = &v
	return s
}

func (s *ListPolicyRequest) SetActorType(v string) *ListPolicyRequest {
	s.ActorType = &v
	return s
}

func (s *ListPolicyRequest) SetTenant(v string) *ListPolicyRequest {
	s.Tenant = &v
	return s
}

type ListPolicyResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 授权策略列表
	Policies []*AuthPolicy `json:"policies,omitempty" xml:"policies,omitempty" require:"true" type:"Repeated"`
}

func (s ListPolicyResponse) String() string {
	return tea.Prettify(s)
}

func (s ListPolicyResponse) GoString() string {
	return s.String()
}

func (s *ListPolicyResponse) SetReqMsgId(v string) *ListPolicyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListPolicyResponse) SetResultCode(v string) *ListPolicyResponse {
	s.ResultCode = &v
	return s
}

func (s *ListPolicyResponse) SetResultMsg(v string) *ListPolicyResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListPolicyResponse) SetPolicies(v []*AuthPolicy) *ListPolicyResponse {
	s.Policies = v
	return s
}

type JudgeAuthorityRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 操作点id
	ActionId *string `json:"action_id,omitempty" xml:"action_id,omitempty" require:"true"`
	// 鉴权条件
	Conditions []*Condition `json:"conditions,omitempty" xml:"conditions,omitempty" type:"Repeated"`
	// 鉴权对象id
	OperatorId *string `json:"operator_id,omitempty" xml:"operator_id,omitempty" require:"true"`
}

func (s JudgeAuthorityRequest) String() string {
	return tea.Prettify(s)
}

func (s JudgeAuthorityRequest) GoString() string {
	return s.String()
}

func (s *JudgeAuthorityRequest) SetAuthToken(v string) *JudgeAuthorityRequest {
	s.AuthToken = &v
	return s
}

func (s *JudgeAuthorityRequest) SetActionId(v string) *JudgeAuthorityRequest {
	s.ActionId = &v
	return s
}

func (s *JudgeAuthorityRequest) SetConditions(v []*Condition) *JudgeAuthorityRequest {
	s.Conditions = v
	return s
}

func (s *JudgeAuthorityRequest) SetOperatorId(v string) *JudgeAuthorityRequest {
	s.OperatorId = &v
	return s
}

type JudgeAuthorityResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 判断结果。true：鉴权通过；false：鉴权未通过
	Result *string `json:"result,omitempty" xml:"result,omitempty" require:"true"`
}

func (s JudgeAuthorityResponse) String() string {
	return tea.Prettify(s)
}

func (s JudgeAuthorityResponse) GoString() string {
	return s.String()
}

func (s *JudgeAuthorityResponse) SetReqMsgId(v string) *JudgeAuthorityResponse {
	s.ReqMsgId = &v
	return s
}

func (s *JudgeAuthorityResponse) SetResultCode(v string) *JudgeAuthorityResponse {
	s.ResultCode = &v
	return s
}

func (s *JudgeAuthorityResponse) SetResultMsg(v string) *JudgeAuthorityResponse {
	s.ResultMsg = &v
	return s
}

func (s *JudgeAuthorityResponse) SetResult(v string) *JudgeAuthorityResponse {
	s.Result = &v
	return s
}

type CreateProductActionRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 操作点ID
	ActionId *string `json:"action_id,omitempty" xml:"action_id,omitempty" require:"true"`
	// 操作点所属功能分类ID
	CategoryId *string `json:"category_id,omitempty" xml:"category_id,omitempty"`
	// 操作点描述
	Description *string `json:"description,omitempty" xml:"description,omitempty"`
	// 操作点名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 操作点所属产品
	Product *string `json:"product,omitempty" xml:"product,omitempty" require:"true"`
}

func (s CreateProductActionRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateProductActionRequest) GoString() string {
	return s.String()
}

func (s *CreateProductActionRequest) SetAuthToken(v string) *CreateProductActionRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateProductActionRequest) SetActionId(v string) *CreateProductActionRequest {
	s.ActionId = &v
	return s
}

func (s *CreateProductActionRequest) SetCategoryId(v string) *CreateProductActionRequest {
	s.CategoryId = &v
	return s
}

func (s *CreateProductActionRequest) SetDescription(v string) *CreateProductActionRequest {
	s.Description = &v
	return s
}

func (s *CreateProductActionRequest) SetName(v string) *CreateProductActionRequest {
	s.Name = &v
	return s
}

func (s *CreateProductActionRequest) SetProduct(v string) *CreateProductActionRequest {
	s.Product = &v
	return s
}

type CreateProductActionResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CreateProductActionResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateProductActionResponse) GoString() string {
	return s.String()
}

func (s *CreateProductActionResponse) SetReqMsgId(v string) *CreateProductActionResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateProductActionResponse) SetResultCode(v string) *CreateProductActionResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateProductActionResponse) SetResultMsg(v string) *CreateProductActionResponse {
	s.ResultMsg = &v
	return s
}

type VerifyOauthTokenRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// token值
	AccessToken *string `json:"access_token,omitempty" xml:"access_token,omitempty" require:"true"`
	// 是否刷新access_token有限期
	Extend *bool `json:"extend,omitempty" xml:"extend,omitempty"`
	// token应用场景，LOGIN或AUTH
	Scene *string `json:"scene,omitempty" xml:"scene,omitempty" require:"true"`
}

func (s VerifyOauthTokenRequest) String() string {
	return tea.Prettify(s)
}

func (s VerifyOauthTokenRequest) GoString() string {
	return s.String()
}

func (s *VerifyOauthTokenRequest) SetAuthToken(v string) *VerifyOauthTokenRequest {
	s.AuthToken = &v
	return s
}

func (s *VerifyOauthTokenRequest) SetAccessToken(v string) *VerifyOauthTokenRequest {
	s.AccessToken = &v
	return s
}

func (s *VerifyOauthTokenRequest) SetExtend(v bool) *VerifyOauthTokenRequest {
	s.Extend = &v
	return s
}

func (s *VerifyOauthTokenRequest) SetScene(v string) *VerifyOauthTokenRequest {
	s.Scene = &v
	return s
}

type VerifyOauthTokenResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// token关联的用户id
	Id *string `json:"id,omitempty" xml:"id,omitempty"`
	// token关联的用户类型
	Type *string `json:"type,omitempty" xml:"type,omitempty"`
}

func (s VerifyOauthTokenResponse) String() string {
	return tea.Prettify(s)
}

func (s VerifyOauthTokenResponse) GoString() string {
	return s.String()
}

func (s *VerifyOauthTokenResponse) SetReqMsgId(v string) *VerifyOauthTokenResponse {
	s.ReqMsgId = &v
	return s
}

func (s *VerifyOauthTokenResponse) SetResultCode(v string) *VerifyOauthTokenResponse {
	s.ResultCode = &v
	return s
}

func (s *VerifyOauthTokenResponse) SetResultMsg(v string) *VerifyOauthTokenResponse {
	s.ResultMsg = &v
	return s
}

func (s *VerifyOauthTokenResponse) SetId(v string) *VerifyOauthTokenResponse {
	s.Id = &v
	return s
}

func (s *VerifyOauthTokenResponse) SetType(v string) *VerifyOauthTokenResponse {
	s.Type = &v
	return s
}

type VerifySessionTokenRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// token值
	Token *string `json:"token,omitempty" xml:"token,omitempty" require:"true"`
}

func (s VerifySessionTokenRequest) String() string {
	return tea.Prettify(s)
}

func (s VerifySessionTokenRequest) GoString() string {
	return s.String()
}

func (s *VerifySessionTokenRequest) SetAuthToken(v string) *VerifySessionTokenRequest {
	s.AuthToken = &v
	return s
}

func (s *VerifySessionTokenRequest) SetToken(v string) *VerifySessionTokenRequest {
	s.Token = &v
	return s
}

type VerifySessionTokenResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 用户所在企业的唯一标识
	Customer *string `json:"customer,omitempty" xml:"customer,omitempty"`
	// 登录名
	LoginName *string `json:"login_name,omitempty" xml:"login_name,omitempty"`
	// 用户加入的租户ID列表
	Tenants []*string `json:"tenants,omitempty" xml:"tenants,omitempty" type:"Repeated"`
	// session关联的用户id
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty"`
	// 租户详情列表
	TenantDetails []*Tenant `json:"tenant_details,omitempty" xml:"tenant_details,omitempty" type:"Repeated"`
}

func (s VerifySessionTokenResponse) String() string {
	return tea.Prettify(s)
}

func (s VerifySessionTokenResponse) GoString() string {
	return s.String()
}

func (s *VerifySessionTokenResponse) SetReqMsgId(v string) *VerifySessionTokenResponse {
	s.ReqMsgId = &v
	return s
}

func (s *VerifySessionTokenResponse) SetResultCode(v string) *VerifySessionTokenResponse {
	s.ResultCode = &v
	return s
}

func (s *VerifySessionTokenResponse) SetResultMsg(v string) *VerifySessionTokenResponse {
	s.ResultMsg = &v
	return s
}

func (s *VerifySessionTokenResponse) SetCustomer(v string) *VerifySessionTokenResponse {
	s.Customer = &v
	return s
}

func (s *VerifySessionTokenResponse) SetLoginName(v string) *VerifySessionTokenResponse {
	s.LoginName = &v
	return s
}

func (s *VerifySessionTokenResponse) SetTenants(v []*string) *VerifySessionTokenResponse {
	s.Tenants = v
	return s
}

func (s *VerifySessionTokenResponse) SetUserId(v string) *VerifySessionTokenResponse {
	s.UserId = &v
	return s
}

func (s *VerifySessionTokenResponse) SetTenantDetails(v []*Tenant) *VerifySessionTokenResponse {
	s.TenantDetails = v
	return s
}

type ListRoleOperatorRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 角色ID
	RoleId *string `json:"role_id,omitempty" xml:"role_id,omitempty" require:"true"`
	// 租户信息
	Tenant *string `json:"tenant,omitempty" xml:"tenant,omitempty" require:"true"`
}

func (s ListRoleOperatorRequest) String() string {
	return tea.Prettify(s)
}

func (s ListRoleOperatorRequest) GoString() string {
	return s.String()
}

func (s *ListRoleOperatorRequest) SetAuthToken(v string) *ListRoleOperatorRequest {
	s.AuthToken = &v
	return s
}

func (s *ListRoleOperatorRequest) SetRoleId(v string) *ListRoleOperatorRequest {
	s.RoleId = &v
	return s
}

func (s *ListRoleOperatorRequest) SetTenant(v string) *ListRoleOperatorRequest {
	s.Tenant = &v
	return s
}

type ListRoleOperatorResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 操作员列表
	Operators []*Operator `json:"operators,omitempty" xml:"operators,omitempty" require:"true" type:"Repeated"`
}

func (s ListRoleOperatorResponse) String() string {
	return tea.Prettify(s)
}

func (s ListRoleOperatorResponse) GoString() string {
	return s.String()
}

func (s *ListRoleOperatorResponse) SetReqMsgId(v string) *ListRoleOperatorResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListRoleOperatorResponse) SetResultCode(v string) *ListRoleOperatorResponse {
	s.ResultCode = &v
	return s
}

func (s *ListRoleOperatorResponse) SetResultMsg(v string) *ListRoleOperatorResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListRoleOperatorResponse) SetOperators(v []*Operator) *ListRoleOperatorResponse {
	s.Operators = v
	return s
}

type ApplyTrustloginUrlRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 	跳转地址
	GotoUrl *string `json:"goto_url,omitempty" xml:"goto_url,omitempty" require:"true"`
	// 	操作员id
	OperatorId *string `json:"operator_id,omitempty" xml:"operator_id,omitempty" require:"true"`
}

func (s ApplyTrustloginUrlRequest) String() string {
	return tea.Prettify(s)
}

func (s ApplyTrustloginUrlRequest) GoString() string {
	return s.String()
}

func (s *ApplyTrustloginUrlRequest) SetAuthToken(v string) *ApplyTrustloginUrlRequest {
	s.AuthToken = &v
	return s
}

func (s *ApplyTrustloginUrlRequest) SetGotoUrl(v string) *ApplyTrustloginUrlRequest {
	s.GotoUrl = &v
	return s
}

func (s *ApplyTrustloginUrlRequest) SetOperatorId(v string) *ApplyTrustloginUrlRequest {
	s.OperatorId = &v
	return s
}

type ApplyTrustloginUrlResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 信登URL
	TrustLoginUrl *string `json:"trust_login_url,omitempty" xml:"trust_login_url,omitempty"`
}

func (s ApplyTrustloginUrlResponse) String() string {
	return tea.Prettify(s)
}

func (s ApplyTrustloginUrlResponse) GoString() string {
	return s.String()
}

func (s *ApplyTrustloginUrlResponse) SetReqMsgId(v string) *ApplyTrustloginUrlResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ApplyTrustloginUrlResponse) SetResultCode(v string) *ApplyTrustloginUrlResponse {
	s.ResultCode = &v
	return s
}

func (s *ApplyTrustloginUrlResponse) SetResultMsg(v string) *ApplyTrustloginUrlResponse {
	s.ResultMsg = &v
	return s
}

func (s *ApplyTrustloginUrlResponse) SetTrustLoginUrl(v string) *ApplyTrustloginUrlResponse {
	s.TrustLoginUrl = &v
	return s
}

type AssumeStsRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 虚拟身份唯一名称
	ActorName *string `json:"actor_name,omitempty" xml:"actor_name,omitempty" require:"true"`
	// 虚拟身份所属租户
	ActorTenant *string `json:"actor_tenant,omitempty" xml:"actor_tenant,omitempty" require:"true"`
	// 过期时间，单位为秒，范围900-3600，默认为3600
	DurationSeconds *int `json:"duration_seconds,omitempty" xml:"duration_seconds,omitempty"`
	// 会话名称
	SessionName *string `json:"session_name,omitempty" xml:"session_name,omitempty" require:"true"`
}

func (s AssumeStsRequest) String() string {
	return tea.Prettify(s)
}

func (s AssumeStsRequest) GoString() string {
	return s.String()
}

func (s *AssumeStsRequest) SetAuthToken(v string) *AssumeStsRequest {
	s.AuthToken = &v
	return s
}

func (s *AssumeStsRequest) SetActorName(v string) *AssumeStsRequest {
	s.ActorName = &v
	return s
}

func (s *AssumeStsRequest) SetActorTenant(v string) *AssumeStsRequest {
	s.ActorTenant = &v
	return s
}

func (s *AssumeStsRequest) SetDurationSeconds(v int) *AssumeStsRequest {
	s.DurationSeconds = &v
	return s
}

func (s *AssumeStsRequest) SetSessionName(v string) *AssumeStsRequest {
	s.SessionName = &v
	return s
}

type AssumeStsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 安全令牌accessKey
	AccessKey *string `json:"access_key,omitempty" xml:"access_key,omitempty"`
	// 安全令牌accessSecret
	AccessSecret *string `json:"access_secret,omitempty" xml:"access_secret,omitempty"`
	// 过期时间戳，单位为毫秒
	ExpiredTime *int64 `json:"expired_time,omitempty" xml:"expired_time,omitempty"`
	// 安全令牌
	SecurityToken *string `json:"security_token,omitempty" xml:"security_token,omitempty"`
}

func (s AssumeStsResponse) String() string {
	return tea.Prettify(s)
}

func (s AssumeStsResponse) GoString() string {
	return s.String()
}

func (s *AssumeStsResponse) SetReqMsgId(v string) *AssumeStsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AssumeStsResponse) SetResultCode(v string) *AssumeStsResponse {
	s.ResultCode = &v
	return s
}

func (s *AssumeStsResponse) SetResultMsg(v string) *AssumeStsResponse {
	s.ResultMsg = &v
	return s
}

func (s *AssumeStsResponse) SetAccessKey(v string) *AssumeStsResponse {
	s.AccessKey = &v
	return s
}

func (s *AssumeStsResponse) SetAccessSecret(v string) *AssumeStsResponse {
	s.AccessSecret = &v
	return s
}

func (s *AssumeStsResponse) SetExpiredTime(v int64) *AssumeStsResponse {
	s.ExpiredTime = &v
	return s
}

func (s *AssumeStsResponse) SetSecurityToken(v string) *AssumeStsResponse {
	s.SecurityToken = &v
	return s
}

type CreateStsActorRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 虚拟身份受信关系集合，通常只包含一个
	Bindings []*StsActorBinding `json:"bindings,omitempty" xml:"bindings,omitempty" require:"true" type:"Repeated"`
	// 针对虚拟身份的描述
	Description *string `json:"description,omitempty" xml:"description,omitempty"`
	// 虚拟身份名称，租户内唯一
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
}

func (s CreateStsActorRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateStsActorRequest) GoString() string {
	return s.String()
}

func (s *CreateStsActorRequest) SetAuthToken(v string) *CreateStsActorRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateStsActorRequest) SetBindings(v []*StsActorBinding) *CreateStsActorRequest {
	s.Bindings = v
	return s
}

func (s *CreateStsActorRequest) SetDescription(v string) *CreateStsActorRequest {
	s.Description = &v
	return s
}

func (s *CreateStsActorRequest) SetName(v string) *CreateStsActorRequest {
	s.Name = &v
	return s
}

type CreateStsActorResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 虚拟身份ID
	ActorId *string `json:"actor_id,omitempty" xml:"actor_id,omitempty"`
}

func (s CreateStsActorResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateStsActorResponse) GoString() string {
	return s.String()
}

func (s *CreateStsActorResponse) SetReqMsgId(v string) *CreateStsActorResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateStsActorResponse) SetResultCode(v string) *CreateStsActorResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateStsActorResponse) SetResultMsg(v string) *CreateStsActorResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateStsActorResponse) SetActorId(v string) *CreateStsActorResponse {
	s.ActorId = &v
	return s
}

type DeleteStsActorRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 虚拟身份ID，与虚拟身份名称两个参数二选一传入
	ActorId *string `json:"actor_id,omitempty" xml:"actor_id,omitempty"`
	// 虚拟身份名称，与虚拟身份名称两个参数二选一传入
	ActorName *string `json:"actor_name,omitempty" xml:"actor_name,omitempty"`
}

func (s DeleteStsActorRequest) String() string {
	return tea.Prettify(s)
}

func (s DeleteStsActorRequest) GoString() string {
	return s.String()
}

func (s *DeleteStsActorRequest) SetAuthToken(v string) *DeleteStsActorRequest {
	s.AuthToken = &v
	return s
}

func (s *DeleteStsActorRequest) SetActorId(v string) *DeleteStsActorRequest {
	s.ActorId = &v
	return s
}

func (s *DeleteStsActorRequest) SetActorName(v string) *DeleteStsActorRequest {
	s.ActorName = &v
	return s
}

type DeleteStsActorResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s DeleteStsActorResponse) String() string {
	return tea.Prettify(s)
}

func (s DeleteStsActorResponse) GoString() string {
	return s.String()
}

func (s *DeleteStsActorResponse) SetReqMsgId(v string) *DeleteStsActorResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DeleteStsActorResponse) SetResultCode(v string) *DeleteStsActorResponse {
	s.ResultCode = &v
	return s
}

func (s *DeleteStsActorResponse) SetResultMsg(v string) *DeleteStsActorResponse {
	s.ResultMsg = &v
	return s
}

type GetStsActorRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 虚拟身份ID，与虚拟身份名称两个参数二选一传入
	ActorId *string `json:"actor_id,omitempty" xml:"actor_id,omitempty"`
	// 虚拟身份名称，与虚拟身份名称两个参数二选一传入
	ActorName *string `json:"actor_name,omitempty" xml:"actor_name,omitempty"`
}

func (s GetStsActorRequest) String() string {
	return tea.Prettify(s)
}

func (s GetStsActorRequest) GoString() string {
	return s.String()
}

func (s *GetStsActorRequest) SetAuthToken(v string) *GetStsActorRequest {
	s.AuthToken = &v
	return s
}

func (s *GetStsActorRequest) SetActorId(v string) *GetStsActorRequest {
	s.ActorId = &v
	return s
}

func (s *GetStsActorRequest) SetActorName(v string) *GetStsActorRequest {
	s.ActorName = &v
	return s
}

type GetStsActorResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 虚拟身份受信关系集合，通常只包含一个
	Bindings []*StsActorBinding `json:"bindings,omitempty" xml:"bindings,omitempty" type:"Repeated"`
	// 针对虚拟身份的描述
	Description *string `json:"description,omitempty" xml:"description,omitempty"`
	// 虚拟身份ID
	Id *string `json:"id,omitempty" xml:"id,omitempty"`
	// 虚拟身份名称，租户内唯一
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 虚拟身份所在租户
	Tenant *string `json:"tenant,omitempty" xml:"tenant,omitempty"`
}

func (s GetStsActorResponse) String() string {
	return tea.Prettify(s)
}

func (s GetStsActorResponse) GoString() string {
	return s.String()
}

func (s *GetStsActorResponse) SetReqMsgId(v string) *GetStsActorResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetStsActorResponse) SetResultCode(v string) *GetStsActorResponse {
	s.ResultCode = &v
	return s
}

func (s *GetStsActorResponse) SetResultMsg(v string) *GetStsActorResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetStsActorResponse) SetBindings(v []*StsActorBinding) *GetStsActorResponse {
	s.Bindings = v
	return s
}

func (s *GetStsActorResponse) SetDescription(v string) *GetStsActorResponse {
	s.Description = &v
	return s
}

func (s *GetStsActorResponse) SetId(v string) *GetStsActorResponse {
	s.Id = &v
	return s
}

func (s *GetStsActorResponse) SetName(v string) *GetStsActorResponse {
	s.Name = &v
	return s
}

func (s *GetStsActorResponse) SetTenant(v string) *GetStsActorResponse {
	s.Tenant = &v
	return s
}

type ListStsActorRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
}

func (s ListStsActorRequest) String() string {
	return tea.Prettify(s)
}

func (s ListStsActorRequest) GoString() string {
	return s.String()
}

func (s *ListStsActorRequest) SetAuthToken(v string) *ListStsActorRequest {
	s.AuthToken = &v
	return s
}

type ListStsActorResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 虚拟身份列表
	Actors []*StsActor `json:"actors,omitempty" xml:"actors,omitempty" type:"Repeated"`
}

func (s ListStsActorResponse) String() string {
	return tea.Prettify(s)
}

func (s ListStsActorResponse) GoString() string {
	return s.String()
}

func (s *ListStsActorResponse) SetReqMsgId(v string) *ListStsActorResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListStsActorResponse) SetResultCode(v string) *ListStsActorResponse {
	s.ResultCode = &v
	return s
}

func (s *ListStsActorResponse) SetResultMsg(v string) *ListStsActorResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListStsActorResponse) SetActors(v []*StsActor) *ListStsActorResponse {
	s.Actors = v
	return s
}

type UpdateStsActorRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 虚拟身份ID
	ActorId *string `json:"actor_id,omitempty" xml:"actor_id,omitempty" require:"true"`
	// 针对虚拟身份的描述
	Description *string `json:"description,omitempty" xml:"description,omitempty"`
}

func (s UpdateStsActorRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateStsActorRequest) GoString() string {
	return s.String()
}

func (s *UpdateStsActorRequest) SetAuthToken(v string) *UpdateStsActorRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateStsActorRequest) SetActorId(v string) *UpdateStsActorRequest {
	s.ActorId = &v
	return s
}

func (s *UpdateStsActorRequest) SetDescription(v string) *UpdateStsActorRequest {
	s.Description = &v
	return s
}

type UpdateStsActorResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 虚拟身份受信关系集合，通常只包含一个
	Bindings []*StsActorBinding `json:"bindings,omitempty" xml:"bindings,omitempty" type:"Repeated"`
	// 针对虚拟身份的描述
	Description *string `json:"description,omitempty" xml:"description,omitempty"`
	// 虚拟身份ID
	Id *string `json:"id,omitempty" xml:"id,omitempty"`
	// 虚拟身份名称，租户内唯一
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 虚拟身份所在租户
	Tenant *string `json:"tenant,omitempty" xml:"tenant,omitempty"`
}

func (s UpdateStsActorResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateStsActorResponse) GoString() string {
	return s.String()
}

func (s *UpdateStsActorResponse) SetReqMsgId(v string) *UpdateStsActorResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateStsActorResponse) SetResultCode(v string) *UpdateStsActorResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateStsActorResponse) SetResultMsg(v string) *UpdateStsActorResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateStsActorResponse) SetBindings(v []*StsActorBinding) *UpdateStsActorResponse {
	s.Bindings = v
	return s
}

func (s *UpdateStsActorResponse) SetDescription(v string) *UpdateStsActorResponse {
	s.Description = &v
	return s
}

func (s *UpdateStsActorResponse) SetId(v string) *UpdateStsActorResponse {
	s.Id = &v
	return s
}

func (s *UpdateStsActorResponse) SetName(v string) *UpdateStsActorResponse {
	s.Name = &v
	return s
}

func (s *UpdateStsActorResponse) SetTenant(v string) *UpdateStsActorResponse {
	s.Tenant = &v
	return s
}

type QueryRoleRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 角色名称
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 当前页,默认1
	PageNum *int64 `json:"page_num,omitempty" xml:"page_num,omitempty"`
	// 分页大小，取值范围[1~50],默认10
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// 是否分页，默认true
	Paging *bool `json:"paging,omitempty" xml:"paging,omitempty"`
	// 角色类型，自定义角色为CUSTOM或者系统角色为COMMON
	Type *string `json:"type,omitempty" xml:"type,omitempty"`
}

func (s QueryRoleRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryRoleRequest) GoString() string {
	return s.String()
}

func (s *QueryRoleRequest) SetAuthToken(v string) *QueryRoleRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryRoleRequest) SetName(v string) *QueryRoleRequest {
	s.Name = &v
	return s
}

func (s *QueryRoleRequest) SetPageNum(v int64) *QueryRoleRequest {
	s.PageNum = &v
	return s
}

func (s *QueryRoleRequest) SetPageSize(v int64) *QueryRoleRequest {
	s.PageSize = &v
	return s
}

func (s *QueryRoleRequest) SetPaging(v bool) *QueryRoleRequest {
	s.Paging = &v
	return s
}

func (s *QueryRoleRequest) SetType(v string) *QueryRoleRequest {
	s.Type = &v
	return s
}

type QueryRoleResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 当前页
	PageNum *int64 `json:"page_num,omitempty" xml:"page_num,omitempty"`
	// 分页大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// 角色列表
	Roles []*Role `json:"roles,omitempty" xml:"roles,omitempty" type:"Repeated"`
	// 记录总数
	TotalCount *int64 `json:"total_count,omitempty" xml:"total_count,omitempty"`
}

func (s QueryRoleResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryRoleResponse) GoString() string {
	return s.String()
}

func (s *QueryRoleResponse) SetReqMsgId(v string) *QueryRoleResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryRoleResponse) SetResultCode(v string) *QueryRoleResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryRoleResponse) SetResultMsg(v string) *QueryRoleResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryRoleResponse) SetPageNum(v int64) *QueryRoleResponse {
	s.PageNum = &v
	return s
}

func (s *QueryRoleResponse) SetPageSize(v int64) *QueryRoleResponse {
	s.PageSize = &v
	return s
}

func (s *QueryRoleResponse) SetRoles(v []*Role) *QueryRoleResponse {
	s.Roles = v
	return s
}

func (s *QueryRoleResponse) SetTotalCount(v int64) *QueryRoleResponse {
	s.TotalCount = &v
	return s
}

type GetIaasaccountBaseinfoRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
}

func (s GetIaasaccountBaseinfoRequest) String() string {
	return tea.Prettify(s)
}

func (s GetIaasaccountBaseinfoRequest) GoString() string {
	return s.String()
}

func (s *GetIaasaccountBaseinfoRequest) SetAuthToken(v string) *GetIaasaccountBaseinfoRequest {
	s.AuthToken = &v
	return s
}

type GetIaasaccountBaseinfoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 账号名称
	Account *string `json:"account,omitempty" xml:"account,omitempty"`
	// 账号ID
	Id *string `json:"id,omitempty" xml:"id,omitempty"`
	// iaas账号类型
	// ALIYUN_BID: 阿里云BID类型
	// ALIYUN_BID_MIG: 原本是阿里云BID类型，迁移后可两侧登录
	// ALIYUN_MPK: 阿里云MPK类型
	// ALIYUN_LOCALIZATION: 阿里云一方化类型
	SourceType *string `json:"source_type,omitempty" xml:"source_type,omitempty"`
}

func (s GetIaasaccountBaseinfoResponse) String() string {
	return tea.Prettify(s)
}

func (s GetIaasaccountBaseinfoResponse) GoString() string {
	return s.String()
}

func (s *GetIaasaccountBaseinfoResponse) SetReqMsgId(v string) *GetIaasaccountBaseinfoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetIaasaccountBaseinfoResponse) SetResultCode(v string) *GetIaasaccountBaseinfoResponse {
	s.ResultCode = &v
	return s
}

func (s *GetIaasaccountBaseinfoResponse) SetResultMsg(v string) *GetIaasaccountBaseinfoResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetIaasaccountBaseinfoResponse) SetAccount(v string) *GetIaasaccountBaseinfoResponse {
	s.Account = &v
	return s
}

func (s *GetIaasaccountBaseinfoResponse) SetId(v string) *GetIaasaccountBaseinfoResponse {
	s.Id = &v
	return s
}

func (s *GetIaasaccountBaseinfoResponse) SetSourceType(v string) *GetIaasaccountBaseinfoResponse {
	s.SourceType = &v
	return s
}

type VerifyPasswordRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 加密过的密码值，使用AccessSecret进行3DES加密
	EncryptedPassword *string `json:"encrypted_password,omitempty" xml:"encrypted_password,omitempty" require:"true"`
	// 登录名
	LoginName *string `json:"login_name,omitempty" xml:"login_name,omitempty" require:"true"`
}

func (s VerifyPasswordRequest) String() string {
	return tea.Prettify(s)
}

func (s VerifyPasswordRequest) GoString() string {
	return s.String()
}

func (s *VerifyPasswordRequest) SetAuthToken(v string) *VerifyPasswordRequest {
	s.AuthToken = &v
	return s
}

func (s *VerifyPasswordRequest) SetEncryptedPassword(v string) *VerifyPasswordRequest {
	s.EncryptedPassword = &v
	return s
}

func (s *VerifyPasswordRequest) SetLoginName(v string) *VerifyPasswordRequest {
	s.LoginName = &v
	return s
}

type VerifyPasswordResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s VerifyPasswordResponse) String() string {
	return tea.Prettify(s)
}

func (s VerifyPasswordResponse) GoString() string {
	return s.String()
}

func (s *VerifyPasswordResponse) SetReqMsgId(v string) *VerifyPasswordResponse {
	s.ReqMsgId = &v
	return s
}

func (s *VerifyPasswordResponse) SetResultCode(v string) *VerifyPasswordResponse {
	s.ResultCode = &v
	return s
}

func (s *VerifyPasswordResponse) SetResultMsg(v string) *VerifyPasswordResponse {
	s.ResultMsg = &v
	return s
}

type UpdateOperatorStatusRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 操作员ID
	OperatorId *string `json:"operator_id,omitempty" xml:"operator_id,omitempty" require:"true"`
	// 要更新到的状态，FROZEN为冻结，NORMAL为正常
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
}

func (s UpdateOperatorStatusRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateOperatorStatusRequest) GoString() string {
	return s.String()
}

func (s *UpdateOperatorStatusRequest) SetAuthToken(v string) *UpdateOperatorStatusRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateOperatorStatusRequest) SetOperatorId(v string) *UpdateOperatorStatusRequest {
	s.OperatorId = &v
	return s
}

func (s *UpdateOperatorStatusRequest) SetStatus(v string) *UpdateOperatorStatusRequest {
	s.Status = &v
	return s
}

type UpdateOperatorStatusResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s UpdateOperatorStatusResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateOperatorStatusResponse) GoString() string {
	return s.String()
}

func (s *UpdateOperatorStatusResponse) SetReqMsgId(v string) *UpdateOperatorStatusResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateOperatorStatusResponse) SetResultCode(v string) *UpdateOperatorStatusResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateOperatorStatusResponse) SetResultMsg(v string) *UpdateOperatorStatusResponse {
	s.ResultMsg = &v
	return s
}

type FreezeOperatorRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 操作员ID
	OperatorId *string `json:"operator_id,omitempty" xml:"operator_id,omitempty" require:"true"`
}

func (s FreezeOperatorRequest) String() string {
	return tea.Prettify(s)
}

func (s FreezeOperatorRequest) GoString() string {
	return s.String()
}

func (s *FreezeOperatorRequest) SetAuthToken(v string) *FreezeOperatorRequest {
	s.AuthToken = &v
	return s
}

func (s *FreezeOperatorRequest) SetOperatorId(v string) *FreezeOperatorRequest {
	s.OperatorId = &v
	return s
}

type FreezeOperatorResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s FreezeOperatorResponse) String() string {
	return tea.Prettify(s)
}

func (s FreezeOperatorResponse) GoString() string {
	return s.String()
}

func (s *FreezeOperatorResponse) SetReqMsgId(v string) *FreezeOperatorResponse {
	s.ReqMsgId = &v
	return s
}

func (s *FreezeOperatorResponse) SetResultCode(v string) *FreezeOperatorResponse {
	s.ResultCode = &v
	return s
}

func (s *FreezeOperatorResponse) SetResultMsg(v string) *FreezeOperatorResponse {
	s.ResultMsg = &v
	return s
}

type UnfreezeOperatorRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 操作员ID
	OperatorId *string `json:"operator_id,omitempty" xml:"operator_id,omitempty" require:"true"`
}

func (s UnfreezeOperatorRequest) String() string {
	return tea.Prettify(s)
}

func (s UnfreezeOperatorRequest) GoString() string {
	return s.String()
}

func (s *UnfreezeOperatorRequest) SetAuthToken(v string) *UnfreezeOperatorRequest {
	s.AuthToken = &v
	return s
}

func (s *UnfreezeOperatorRequest) SetOperatorId(v string) *UnfreezeOperatorRequest {
	s.OperatorId = &v
	return s
}

type UnfreezeOperatorResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s UnfreezeOperatorResponse) String() string {
	return tea.Prettify(s)
}

func (s UnfreezeOperatorResponse) GoString() string {
	return s.String()
}

func (s *UnfreezeOperatorResponse) SetReqMsgId(v string) *UnfreezeOperatorResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UnfreezeOperatorResponse) SetResultCode(v string) *UnfreezeOperatorResponse {
	s.ResultCode = &v
	return s
}

func (s *UnfreezeOperatorResponse) SetResultMsg(v string) *UnfreezeOperatorResponse {
	s.ResultMsg = &v
	return s
}

type GetInternalMasterRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 阿里云PK
	IaasId *string `json:"iaas_id,omitempty" xml:"iaas_id,omitempty"`
	// 主账号ID
	MasterId *string `json:"master_id,omitempty" xml:"master_id,omitempty"`
	// 来源系统，例如MAYI，ALBABACLOUD
	SourceSystem *string `json:"source_system,omitempty" xml:"source_system,omitempty"`
}

func (s GetInternalMasterRequest) String() string {
	return tea.Prettify(s)
}

func (s GetInternalMasterRequest) GoString() string {
	return s.String()
}

func (s *GetInternalMasterRequest) SetAuthToken(v string) *GetInternalMasterRequest {
	s.AuthToken = &v
	return s
}

func (s *GetInternalMasterRequest) SetIaasId(v string) *GetInternalMasterRequest {
	s.IaasId = &v
	return s
}

func (s *GetInternalMasterRequest) SetMasterId(v string) *GetInternalMasterRequest {
	s.MasterId = &v
	return s
}

func (s *GetInternalMasterRequest) SetSourceSystem(v string) *GetInternalMasterRequest {
	s.SourceSystem = &v
	return s
}

type GetInternalMasterResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 证件ID
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty"`
	// 证件类型
	CertType *string `json:"cert_type,omitempty" xml:"cert_type,omitempty"`
	// 所属客户ID
	CustomerId *string `json:"customer_id,omitempty" xml:"customer_id,omitempty"`
	// 邮箱
	Email *string `json:"email,omitempty" xml:"email,omitempty"`
	// 企业认证名称
	FirmName *string `json:"firm_name,omitempty" xml:"firm_name,omitempty"`
	// havanaId
	HavanaId *string `json:"havana_id,omitempty" xml:"havana_id,omitempty"`
	// 主账号ID
	Id *string `json:"id,omitempty" xml:"id,omitempty"`
	// 登录名
	LoginName *string `json:"login_name,omitempty" xml:"login_name,omitempty"`
	// 手机
	Mobile *string `json:"mobile,omitempty" xml:"mobile,omitempty"`
	// 真实姓名
	RealName *string `json:"real_name,omitempty" xml:"real_name,omitempty"`
	// 来源用户类型，CUSTOMER（企业用户），PERSONAL（个人用户）
	SourceUserType *string `json:"source_user_type,omitempty" xml:"source_user_type,omitempty"`
	// 主账号行业标签，I表示金融机构，C表示特殊机构，N表示非金融机构
	IndustryLabel *string `json:"industry_label,omitempty" xml:"industry_label,omitempty"`
}

func (s GetInternalMasterResponse) String() string {
	return tea.Prettify(s)
}

func (s GetInternalMasterResponse) GoString() string {
	return s.String()
}

func (s *GetInternalMasterResponse) SetReqMsgId(v string) *GetInternalMasterResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetInternalMasterResponse) SetResultCode(v string) *GetInternalMasterResponse {
	s.ResultCode = &v
	return s
}

func (s *GetInternalMasterResponse) SetResultMsg(v string) *GetInternalMasterResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetInternalMasterResponse) SetCertNo(v string) *GetInternalMasterResponse {
	s.CertNo = &v
	return s
}

func (s *GetInternalMasterResponse) SetCertType(v string) *GetInternalMasterResponse {
	s.CertType = &v
	return s
}

func (s *GetInternalMasterResponse) SetCustomerId(v string) *GetInternalMasterResponse {
	s.CustomerId = &v
	return s
}

func (s *GetInternalMasterResponse) SetEmail(v string) *GetInternalMasterResponse {
	s.Email = &v
	return s
}

func (s *GetInternalMasterResponse) SetFirmName(v string) *GetInternalMasterResponse {
	s.FirmName = &v
	return s
}

func (s *GetInternalMasterResponse) SetHavanaId(v string) *GetInternalMasterResponse {
	s.HavanaId = &v
	return s
}

func (s *GetInternalMasterResponse) SetId(v string) *GetInternalMasterResponse {
	s.Id = &v
	return s
}

func (s *GetInternalMasterResponse) SetLoginName(v string) *GetInternalMasterResponse {
	s.LoginName = &v
	return s
}

func (s *GetInternalMasterResponse) SetMobile(v string) *GetInternalMasterResponse {
	s.Mobile = &v
	return s
}

func (s *GetInternalMasterResponse) SetRealName(v string) *GetInternalMasterResponse {
	s.RealName = &v
	return s
}

func (s *GetInternalMasterResponse) SetSourceUserType(v string) *GetInternalMasterResponse {
	s.SourceUserType = &v
	return s
}

func (s *GetInternalMasterResponse) SetIndustryLabel(v string) *GetInternalMasterResponse {
	s.IndustryLabel = &v
	return s
}

type GetAliyunUserRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 阿里云用户ID
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
}

func (s GetAliyunUserRequest) String() string {
	return tea.Prettify(s)
}

func (s GetAliyunUserRequest) GoString() string {
	return s.String()
}

func (s *GetAliyunUserRequest) SetAuthToken(v string) *GetAliyunUserRequest {
	s.AuthToken = &v
	return s
}

func (s *GetAliyunUserRequest) SetUserId(v string) *GetAliyunUserRequest {
	s.UserId = &v
	return s
}

type GetAliyunUserResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 阿里云用户ID
	Id *string `json:"id,omitempty" xml:"id,omitempty"`
	// 主账号类型下有值，即type为ENTERPRISE和PERSONAL时有值
	LoginName *string `json:"login_name,omitempty" xml:"login_name,omitempty"`
	// 用户名称，ENTERPRISE类型为企业名称，PERSONAL为个人姓名，RAM为唯一名称
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// RAM子账号的显示名称
	RamDisplayName *string `json:"ram_display_name,omitempty" xml:"ram_display_name,omitempty"`
	// 用户所属租户
	Tenant *string `json:"tenant,omitempty" xml:"tenant,omitempty"`
	// 阿里云用户类型，分为主账号企业（ENTERPRISE），主账号个人（PERSONAL），和子账号（RAM）
	Type *string `json:"type,omitempty" xml:"type,omitempty"`
	// 显示名
	DisplayName *string `json:"display_name,omitempty" xml:"display_name,omitempty"`
}

func (s GetAliyunUserResponse) String() string {
	return tea.Prettify(s)
}

func (s GetAliyunUserResponse) GoString() string {
	return s.String()
}

func (s *GetAliyunUserResponse) SetReqMsgId(v string) *GetAliyunUserResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetAliyunUserResponse) SetResultCode(v string) *GetAliyunUserResponse {
	s.ResultCode = &v
	return s
}

func (s *GetAliyunUserResponse) SetResultMsg(v string) *GetAliyunUserResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetAliyunUserResponse) SetId(v string) *GetAliyunUserResponse {
	s.Id = &v
	return s
}

func (s *GetAliyunUserResponse) SetLoginName(v string) *GetAliyunUserResponse {
	s.LoginName = &v
	return s
}

func (s *GetAliyunUserResponse) SetName(v string) *GetAliyunUserResponse {
	s.Name = &v
	return s
}

func (s *GetAliyunUserResponse) SetRamDisplayName(v string) *GetAliyunUserResponse {
	s.RamDisplayName = &v
	return s
}

func (s *GetAliyunUserResponse) SetTenant(v string) *GetAliyunUserResponse {
	s.Tenant = &v
	return s
}

func (s *GetAliyunUserResponse) SetType(v string) *GetAliyunUserResponse {
	s.Type = &v
	return s
}

func (s *GetAliyunUserResponse) SetDisplayName(v string) *GetAliyunUserResponse {
	s.DisplayName = &v
	return s
}

type JudgeAliyunAuthorityRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 阿里云POP API名称
	Action *string `json:"action,omitempty" xml:"action,omitempty" require:"true"`
	// 阿里云资源描述数组
	AliyunResources []*AliyunResource `json:"aliyun_resources,omitempty" xml:"aliyun_resources,omitempty" require:"true" type:"Repeated"`
	// 自定义条件
	Conditions []*Condition `json:"conditions,omitempty" xml:"conditions,omitempty" type:"Repeated"`
	// regionId
	RegionId *string `json:"region_id,omitempty" xml:"region_id,omitempty" require:"true"`
	// 阿里云POP透传参数
	RequestInfo *AliyunPopRequestInfo `json:"request_info,omitempty" xml:"request_info,omitempty" require:"true"`
	// 阿里云服务名称
	ServiceName *string `json:"service_name,omitempty" xml:"service_name,omitempty" require:"true"`
	// 0000000001
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
}

func (s JudgeAliyunAuthorityRequest) String() string {
	return tea.Prettify(s)
}

func (s JudgeAliyunAuthorityRequest) GoString() string {
	return s.String()
}

func (s *JudgeAliyunAuthorityRequest) SetAuthToken(v string) *JudgeAliyunAuthorityRequest {
	s.AuthToken = &v
	return s
}

func (s *JudgeAliyunAuthorityRequest) SetAction(v string) *JudgeAliyunAuthorityRequest {
	s.Action = &v
	return s
}

func (s *JudgeAliyunAuthorityRequest) SetAliyunResources(v []*AliyunResource) *JudgeAliyunAuthorityRequest {
	s.AliyunResources = v
	return s
}

func (s *JudgeAliyunAuthorityRequest) SetConditions(v []*Condition) *JudgeAliyunAuthorityRequest {
	s.Conditions = v
	return s
}

func (s *JudgeAliyunAuthorityRequest) SetRegionId(v string) *JudgeAliyunAuthorityRequest {
	s.RegionId = &v
	return s
}

func (s *JudgeAliyunAuthorityRequest) SetRequestInfo(v *AliyunPopRequestInfo) *JudgeAliyunAuthorityRequest {
	s.RequestInfo = v
	return s
}

func (s *JudgeAliyunAuthorityRequest) SetServiceName(v string) *JudgeAliyunAuthorityRequest {
	s.ServiceName = &v
	return s
}

func (s *JudgeAliyunAuthorityRequest) SetUserId(v string) *JudgeAliyunAuthorityRequest {
	s.UserId = &v
	return s
}

type JudgeAliyunAuthorityResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 权限校验是否通过
	Result *bool `json:"result,omitempty" xml:"result,omitempty"`
	// 失败原因
	Reason *string `json:"reason,omitempty" xml:"reason,omitempty"`
	// 解决方案
	Solution *string `json:"solution,omitempty" xml:"solution,omitempty"`
}

func (s JudgeAliyunAuthorityResponse) String() string {
	return tea.Prettify(s)
}

func (s JudgeAliyunAuthorityResponse) GoString() string {
	return s.String()
}

func (s *JudgeAliyunAuthorityResponse) SetReqMsgId(v string) *JudgeAliyunAuthorityResponse {
	s.ReqMsgId = &v
	return s
}

func (s *JudgeAliyunAuthorityResponse) SetResultCode(v string) *JudgeAliyunAuthorityResponse {
	s.ResultCode = &v
	return s
}

func (s *JudgeAliyunAuthorityResponse) SetResultMsg(v string) *JudgeAliyunAuthorityResponse {
	s.ResultMsg = &v
	return s
}

func (s *JudgeAliyunAuthorityResponse) SetResult(v bool) *JudgeAliyunAuthorityResponse {
	s.Result = &v
	return s
}

func (s *JudgeAliyunAuthorityResponse) SetReason(v string) *JudgeAliyunAuthorityResponse {
	s.Reason = &v
	return s
}

func (s *JudgeAliyunAuthorityResponse) SetSolution(v string) *JudgeAliyunAuthorityResponse {
	s.Solution = &v
	return s
}

type GetSessionAccessorRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 登录态
	Authorization *string `json:"authorization,omitempty" xml:"authorization,omitempty" require:"true"`
	// 用户所属租户
	UserTenant *string `json:"user_tenant,omitempty" xml:"user_tenant,omitempty" require:"true"`
}

func (s GetSessionAccessorRequest) String() string {
	return tea.Prettify(s)
}

func (s GetSessionAccessorRequest) GoString() string {
	return s.String()
}

func (s *GetSessionAccessorRequest) SetAuthToken(v string) *GetSessionAccessorRequest {
	s.AuthToken = &v
	return s
}

func (s *GetSessionAccessorRequest) SetAuthorization(v string) *GetSessionAccessorRequest {
	s.Authorization = &v
	return s
}

func (s *GetSessionAccessorRequest) SetUserTenant(v string) *GetSessionAccessorRequest {
	s.UserTenant = &v
	return s
}

type GetSessionAccessorResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// access_key
	AccessKey *string `json:"access_key,omitempty" xml:"access_key,omitempty"`
	// access_secret
	AccessSecret *string `json:"access_secret,omitempty" xml:"access_secret,omitempty"`
	// 关联租户名称
	Tenant *string `json:"tenant,omitempty" xml:"tenant,omitempty"`
	// 用户ID
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty"`
}

func (s GetSessionAccessorResponse) String() string {
	return tea.Prettify(s)
}

func (s GetSessionAccessorResponse) GoString() string {
	return s.String()
}

func (s *GetSessionAccessorResponse) SetReqMsgId(v string) *GetSessionAccessorResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetSessionAccessorResponse) SetResultCode(v string) *GetSessionAccessorResponse {
	s.ResultCode = &v
	return s
}

func (s *GetSessionAccessorResponse) SetResultMsg(v string) *GetSessionAccessorResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetSessionAccessorResponse) SetAccessKey(v string) *GetSessionAccessorResponse {
	s.AccessKey = &v
	return s
}

func (s *GetSessionAccessorResponse) SetAccessSecret(v string) *GetSessionAccessorResponse {
	s.AccessSecret = &v
	return s
}

func (s *GetSessionAccessorResponse) SetTenant(v string) *GetSessionAccessorResponse {
	s.Tenant = &v
	return s
}

func (s *GetSessionAccessorResponse) SetUserId(v string) *GetSessionAccessorResponse {
	s.UserId = &v
	return s
}

type UpdatePasswordRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 登录名
	LoginName *string `json:"login_name,omitempty" xml:"login_name,omitempty" require:"true"`
	// 加密过的新密码值，使用AccessSecret进行3DES加密
	//
	NewEncryptedPassword *string `json:"new_encrypted_password,omitempty" xml:"new_encrypted_password,omitempty" require:"true"`
	// 加密过的旧密码值，使用AccessSecret进行DES加密
	//
	OldEncryptedPassword *string `json:"old_encrypted_password,omitempty" xml:"old_encrypted_password,omitempty" require:"true"`
}

func (s UpdatePasswordRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdatePasswordRequest) GoString() string {
	return s.String()
}

func (s *UpdatePasswordRequest) SetAuthToken(v string) *UpdatePasswordRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdatePasswordRequest) SetLoginName(v string) *UpdatePasswordRequest {
	s.LoginName = &v
	return s
}

func (s *UpdatePasswordRequest) SetNewEncryptedPassword(v string) *UpdatePasswordRequest {
	s.NewEncryptedPassword = &v
	return s
}

func (s *UpdatePasswordRequest) SetOldEncryptedPassword(v string) *UpdatePasswordRequest {
	s.OldEncryptedPassword = &v
	return s
}

type UpdatePasswordResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s UpdatePasswordResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdatePasswordResponse) GoString() string {
	return s.String()
}

func (s *UpdatePasswordResponse) SetReqMsgId(v string) *UpdatePasswordResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdatePasswordResponse) SetResultCode(v string) *UpdatePasswordResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdatePasswordResponse) SetResultMsg(v string) *UpdatePasswordResponse {
	s.ResultMsg = &v
	return s
}

type JudgeMultiauthorityRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 批量鉴权对象
	BatchEvent *AuthenticateBatchEvent `json:"batch_event,omitempty" xml:"batch_event,omitempty" require:"true"`
	// 上下文信息
	Context *string `json:"context,omitempty" xml:"context,omitempty"`
}

func (s JudgeMultiauthorityRequest) String() string {
	return tea.Prettify(s)
}

func (s JudgeMultiauthorityRequest) GoString() string {
	return s.String()
}

func (s *JudgeMultiauthorityRequest) SetAuthToken(v string) *JudgeMultiauthorityRequest {
	s.AuthToken = &v
	return s
}

func (s *JudgeMultiauthorityRequest) SetBatchEvent(v *AuthenticateBatchEvent) *JudgeMultiauthorityRequest {
	s.BatchEvent = v
	return s
}

func (s *JudgeMultiauthorityRequest) SetContext(v string) *JudgeMultiauthorityRequest {
	s.Context = &v
	return s
}

type JudgeMultiauthorityResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 鉴权结果列表
	Judgements []*Judgement `json:"judgements,omitempty" xml:"judgements,omitempty" type:"Repeated"`
}

func (s JudgeMultiauthorityResponse) String() string {
	return tea.Prettify(s)
}

func (s JudgeMultiauthorityResponse) GoString() string {
	return s.String()
}

func (s *JudgeMultiauthorityResponse) SetReqMsgId(v string) *JudgeMultiauthorityResponse {
	s.ReqMsgId = &v
	return s
}

func (s *JudgeMultiauthorityResponse) SetResultCode(v string) *JudgeMultiauthorityResponse {
	s.ResultCode = &v
	return s
}

func (s *JudgeMultiauthorityResponse) SetResultMsg(v string) *JudgeMultiauthorityResponse {
	s.ResultMsg = &v
	return s
}

func (s *JudgeMultiauthorityResponse) SetJudgements(v []*Judgement) *JudgeMultiauthorityResponse {
	s.Judgements = v
	return s
}

type JudgeAliyunMultiauthorityRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 阿里云批量鉴权
	BatchEvent *AliyunAuthenticateBatchEvent `json:"batch_event,omitempty" xml:"batch_event,omitempty" require:"true"`
	// 上下文信息
	Context *string `json:"context,omitempty" xml:"context,omitempty"`
}

func (s JudgeAliyunMultiauthorityRequest) String() string {
	return tea.Prettify(s)
}

func (s JudgeAliyunMultiauthorityRequest) GoString() string {
	return s.String()
}

func (s *JudgeAliyunMultiauthorityRequest) SetAuthToken(v string) *JudgeAliyunMultiauthorityRequest {
	s.AuthToken = &v
	return s
}

func (s *JudgeAliyunMultiauthorityRequest) SetBatchEvent(v *AliyunAuthenticateBatchEvent) *JudgeAliyunMultiauthorityRequest {
	s.BatchEvent = v
	return s
}

func (s *JudgeAliyunMultiauthorityRequest) SetContext(v string) *JudgeAliyunMultiauthorityRequest {
	s.Context = &v
	return s
}

type JudgeAliyunMultiauthorityResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 鉴权结果列表
	Judgements []*Judgement `json:"judgements,omitempty" xml:"judgements,omitempty" type:"Repeated"`
}

func (s JudgeAliyunMultiauthorityResponse) String() string {
	return tea.Prettify(s)
}

func (s JudgeAliyunMultiauthorityResponse) GoString() string {
	return s.String()
}

func (s *JudgeAliyunMultiauthorityResponse) SetReqMsgId(v string) *JudgeAliyunMultiauthorityResponse {
	s.ReqMsgId = &v
	return s
}

func (s *JudgeAliyunMultiauthorityResponse) SetResultCode(v string) *JudgeAliyunMultiauthorityResponse {
	s.ResultCode = &v
	return s
}

func (s *JudgeAliyunMultiauthorityResponse) SetResultMsg(v string) *JudgeAliyunMultiauthorityResponse {
	s.ResultMsg = &v
	return s
}

func (s *JudgeAliyunMultiauthorityResponse) SetJudgements(v []*Judgement) *JudgeAliyunMultiauthorityResponse {
	s.Judgements = v
	return s
}

type GetAccessorCurrentRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
}

func (s GetAccessorCurrentRequest) String() string {
	return tea.Prettify(s)
}

func (s GetAccessorCurrentRequest) GoString() string {
	return s.String()
}

func (s *GetAccessorCurrentRequest) SetAuthToken(v string) *GetAccessorCurrentRequest {
	s.AuthToken = &v
	return s
}

type GetAccessorCurrentResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 一方化链路为阿里云用户ID，蚂蚁链路为金融云用户ID
	Id *string `json:"id,omitempty" xml:"id,omitempty"`
	// 登录名
	LoginName *string `json:"login_name,omitempty" xml:"login_name,omitempty"`
	// 一方化链路：
	// 用户名称，ENTERPRISE类型为企业名称，PERSONAL为个人姓名，RAM为唯一名称
	// 蚂蚁链路：
	// 用户真实姓名
	//
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 当前AK所属租户
	Tenant *string `json:"tenant,omitempty" xml:"tenant,omitempty"`
	// 一方化链路：
	// 阿里云用户类型，主账号为CUSTOMER，操作员为SUB，RAM角色为RAM_ROLE
	// 蚂蚁链路：
	// 主账号为MASTER，操作员为OPERATOR，服务账号为SERVICE
	Type *string `json:"type,omitempty" xml:"type,omitempty"`
}

func (s GetAccessorCurrentResponse) String() string {
	return tea.Prettify(s)
}

func (s GetAccessorCurrentResponse) GoString() string {
	return s.String()
}

func (s *GetAccessorCurrentResponse) SetReqMsgId(v string) *GetAccessorCurrentResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetAccessorCurrentResponse) SetResultCode(v string) *GetAccessorCurrentResponse {
	s.ResultCode = &v
	return s
}

func (s *GetAccessorCurrentResponse) SetResultMsg(v string) *GetAccessorCurrentResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetAccessorCurrentResponse) SetId(v string) *GetAccessorCurrentResponse {
	s.Id = &v
	return s
}

func (s *GetAccessorCurrentResponse) SetLoginName(v string) *GetAccessorCurrentResponse {
	s.LoginName = &v
	return s
}

func (s *GetAccessorCurrentResponse) SetName(v string) *GetAccessorCurrentResponse {
	s.Name = &v
	return s
}

func (s *GetAccessorCurrentResponse) SetTenant(v string) *GetAccessorCurrentResponse {
	s.Tenant = &v
	return s
}

func (s *GetAccessorCurrentResponse) SetType(v string) *GetAccessorCurrentResponse {
	s.Type = &v
	return s
}

type GetServiceaccountRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 服务账号名称
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 服务账号ID
	ServiceAccountId *string `json:"service_account_id,omitempty" xml:"service_account_id,omitempty"`
}

func (s GetServiceaccountRequest) String() string {
	return tea.Prettify(s)
}

func (s GetServiceaccountRequest) GoString() string {
	return s.String()
}

func (s *GetServiceaccountRequest) SetAuthToken(v string) *GetServiceaccountRequest {
	s.AuthToken = &v
	return s
}

func (s *GetServiceaccountRequest) SetName(v string) *GetServiceaccountRequest {
	s.Name = &v
	return s
}

func (s *GetServiceaccountRequest) SetServiceAccountId(v string) *GetServiceaccountRequest {
	s.ServiceAccountId = &v
	return s
}

type GetServiceaccountResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 服务账号别名
	Alias *string `json:"alias,omitempty" xml:"alias,omitempty"`
	// 服务账号描述
	Description *string `json:"description,omitempty" xml:"description,omitempty"`
	// 服务账号ID
	Id *string `json:"id,omitempty" xml:"id,omitempty"`
	// 服务账号名称
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 服务账号所属租户
	Tenant *string `json:"tenant,omitempty" xml:"tenant,omitempty"`
}

func (s GetServiceaccountResponse) String() string {
	return tea.Prettify(s)
}

func (s GetServiceaccountResponse) GoString() string {
	return s.String()
}

func (s *GetServiceaccountResponse) SetReqMsgId(v string) *GetServiceaccountResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetServiceaccountResponse) SetResultCode(v string) *GetServiceaccountResponse {
	s.ResultCode = &v
	return s
}

func (s *GetServiceaccountResponse) SetResultMsg(v string) *GetServiceaccountResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetServiceaccountResponse) SetAlias(v string) *GetServiceaccountResponse {
	s.Alias = &v
	return s
}

func (s *GetServiceaccountResponse) SetDescription(v string) *GetServiceaccountResponse {
	s.Description = &v
	return s
}

func (s *GetServiceaccountResponse) SetId(v string) *GetServiceaccountResponse {
	s.Id = &v
	return s
}

func (s *GetServiceaccountResponse) SetName(v string) *GetServiceaccountResponse {
	s.Name = &v
	return s
}

func (s *GetServiceaccountResponse) SetTenant(v string) *GetServiceaccountResponse {
	s.Tenant = &v
	return s
}

type CreateServiceaccountRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 服务账号描述
	Description *string `json:"description,omitempty" xml:"description,omitempty"`
	// 服务账号别名
	Alias *string `json:"alias,omitempty" xml:"alias,omitempty" require:"true"`
}

func (s CreateServiceaccountRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateServiceaccountRequest) GoString() string {
	return s.String()
}

func (s *CreateServiceaccountRequest) SetAuthToken(v string) *CreateServiceaccountRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateServiceaccountRequest) SetDescription(v string) *CreateServiceaccountRequest {
	s.Description = &v
	return s
}

func (s *CreateServiceaccountRequest) SetAlias(v string) *CreateServiceaccountRequest {
	s.Alias = &v
	return s
}

type CreateServiceaccountResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 服务账号AK
	AccessKey *string `json:"access_key,omitempty" xml:"access_key,omitempty"`
	// 服务账号SK
	AccessSecret *string `json:"access_secret,omitempty" xml:"access_secret,omitempty"`
	// 服务账号别名
	Alias *string `json:"alias,omitempty" xml:"alias,omitempty"`
	// 服务账号描述
	Description *string `json:"description,omitempty" xml:"description,omitempty"`
	// 服务账号ID
	Id *string `json:"id,omitempty" xml:"id,omitempty"`
	// 服务账号名称
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 服务账号所属租户
	Tenant *string `json:"tenant,omitempty" xml:"tenant,omitempty"`
}

func (s CreateServiceaccountResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateServiceaccountResponse) GoString() string {
	return s.String()
}

func (s *CreateServiceaccountResponse) SetReqMsgId(v string) *CreateServiceaccountResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateServiceaccountResponse) SetResultCode(v string) *CreateServiceaccountResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateServiceaccountResponse) SetResultMsg(v string) *CreateServiceaccountResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateServiceaccountResponse) SetAccessKey(v string) *CreateServiceaccountResponse {
	s.AccessKey = &v
	return s
}

func (s *CreateServiceaccountResponse) SetAccessSecret(v string) *CreateServiceaccountResponse {
	s.AccessSecret = &v
	return s
}

func (s *CreateServiceaccountResponse) SetAlias(v string) *CreateServiceaccountResponse {
	s.Alias = &v
	return s
}

func (s *CreateServiceaccountResponse) SetDescription(v string) *CreateServiceaccountResponse {
	s.Description = &v
	return s
}

func (s *CreateServiceaccountResponse) SetId(v string) *CreateServiceaccountResponse {
	s.Id = &v
	return s
}

func (s *CreateServiceaccountResponse) SetName(v string) *CreateServiceaccountResponse {
	s.Name = &v
	return s
}

func (s *CreateServiceaccountResponse) SetTenant(v string) *CreateServiceaccountResponse {
	s.Tenant = &v
	return s
}

type DeleteServiceaccountRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 服务账号名称
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 服务账号ID
	ServiceAccountId *string `json:"service_account_id,omitempty" xml:"service_account_id,omitempty"`
}

func (s DeleteServiceaccountRequest) String() string {
	return tea.Prettify(s)
}

func (s DeleteServiceaccountRequest) GoString() string {
	return s.String()
}

func (s *DeleteServiceaccountRequest) SetAuthToken(v string) *DeleteServiceaccountRequest {
	s.AuthToken = &v
	return s
}

func (s *DeleteServiceaccountRequest) SetName(v string) *DeleteServiceaccountRequest {
	s.Name = &v
	return s
}

func (s *DeleteServiceaccountRequest) SetServiceAccountId(v string) *DeleteServiceaccountRequest {
	s.ServiceAccountId = &v
	return s
}

type DeleteServiceaccountResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s DeleteServiceaccountResponse) String() string {
	return tea.Prettify(s)
}

func (s DeleteServiceaccountResponse) GoString() string {
	return s.String()
}

func (s *DeleteServiceaccountResponse) SetReqMsgId(v string) *DeleteServiceaccountResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DeleteServiceaccountResponse) SetResultCode(v string) *DeleteServiceaccountResponse {
	s.ResultCode = &v
	return s
}

func (s *DeleteServiceaccountResponse) SetResultMsg(v string) *DeleteServiceaccountResponse {
	s.ResultMsg = &v
	return s
}

type UpdateServiceaccountRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 服务账号别名
	Alias *string `json:"alias,omitempty" xml:"alias,omitempty"`
	// 服务账号描述
	Description *string `json:"description,omitempty" xml:"description,omitempty"`
	// 服务账号名称，与服务账号ID任选其一传入
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 服务账号ID
	ServiceAccountId *string `json:"service_account_id,omitempty" xml:"service_account_id,omitempty"`
}

func (s UpdateServiceaccountRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateServiceaccountRequest) GoString() string {
	return s.String()
}

func (s *UpdateServiceaccountRequest) SetAuthToken(v string) *UpdateServiceaccountRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateServiceaccountRequest) SetAlias(v string) *UpdateServiceaccountRequest {
	s.Alias = &v
	return s
}

func (s *UpdateServiceaccountRequest) SetDescription(v string) *UpdateServiceaccountRequest {
	s.Description = &v
	return s
}

func (s *UpdateServiceaccountRequest) SetName(v string) *UpdateServiceaccountRequest {
	s.Name = &v
	return s
}

func (s *UpdateServiceaccountRequest) SetServiceAccountId(v string) *UpdateServiceaccountRequest {
	s.ServiceAccountId = &v
	return s
}

type UpdateServiceaccountResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s UpdateServiceaccountResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateServiceaccountResponse) GoString() string {
	return s.String()
}

func (s *UpdateServiceaccountResponse) SetReqMsgId(v string) *UpdateServiceaccountResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateServiceaccountResponse) SetResultCode(v string) *UpdateServiceaccountResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateServiceaccountResponse) SetResultMsg(v string) *UpdateServiceaccountResponse {
	s.ResultMsg = &v
	return s
}

type RemoveTenantMemberRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 操作员ID
	OperatorId *string `json:"operator_id,omitempty" xml:"operator_id,omitempty" require:"true"`
}

func (s RemoveTenantMemberRequest) String() string {
	return tea.Prettify(s)
}

func (s RemoveTenantMemberRequest) GoString() string {
	return s.String()
}

func (s *RemoveTenantMemberRequest) SetAuthToken(v string) *RemoveTenantMemberRequest {
	s.AuthToken = &v
	return s
}

func (s *RemoveTenantMemberRequest) SetOperatorId(v string) *RemoveTenantMemberRequest {
	s.OperatorId = &v
	return s
}

type RemoveTenantMemberResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s RemoveTenantMemberResponse) String() string {
	return tea.Prettify(s)
}

func (s RemoveTenantMemberResponse) GoString() string {
	return s.String()
}

func (s *RemoveTenantMemberResponse) SetReqMsgId(v string) *RemoveTenantMemberResponse {
	s.ReqMsgId = &v
	return s
}

func (s *RemoveTenantMemberResponse) SetResultCode(v string) *RemoveTenantMemberResponse {
	s.ResultCode = &v
	return s
}

func (s *RemoveTenantMemberResponse) SetResultMsg(v string) *RemoveTenantMemberResponse {
	s.ResultMsg = &v
	return s
}

type CreateGroupRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 描述
	Description *string `json:"description,omitempty" xml:"description,omitempty"`
}

func (s CreateGroupRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateGroupRequest) GoString() string {
	return s.String()
}

func (s *CreateGroupRequest) SetAuthToken(v string) *CreateGroupRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateGroupRequest) SetName(v string) *CreateGroupRequest {
	s.Name = &v
	return s
}

func (s *CreateGroupRequest) SetDescription(v string) *CreateGroupRequest {
	s.Description = &v
	return s
}

type CreateGroupResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 成员组ID
	Id *string `json:"id,omitempty" xml:"id,omitempty"`
}

func (s CreateGroupResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateGroupResponse) GoString() string {
	return s.String()
}

func (s *CreateGroupResponse) SetReqMsgId(v string) *CreateGroupResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateGroupResponse) SetResultCode(v string) *CreateGroupResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateGroupResponse) SetResultMsg(v string) *CreateGroupResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateGroupResponse) SetId(v string) *CreateGroupResponse {
	s.Id = &v
	return s
}

type DeleteGroupRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 成员组ID
	GroupId *string `json:"group_id,omitempty" xml:"group_id,omitempty" require:"true"`
}

func (s DeleteGroupRequest) String() string {
	return tea.Prettify(s)
}

func (s DeleteGroupRequest) GoString() string {
	return s.String()
}

func (s *DeleteGroupRequest) SetAuthToken(v string) *DeleteGroupRequest {
	s.AuthToken = &v
	return s
}

func (s *DeleteGroupRequest) SetGroupId(v string) *DeleteGroupRequest {
	s.GroupId = &v
	return s
}

type DeleteGroupResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s DeleteGroupResponse) String() string {
	return tea.Prettify(s)
}

func (s DeleteGroupResponse) GoString() string {
	return s.String()
}

func (s *DeleteGroupResponse) SetReqMsgId(v string) *DeleteGroupResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DeleteGroupResponse) SetResultCode(v string) *DeleteGroupResponse {
	s.ResultCode = &v
	return s
}

func (s *DeleteGroupResponse) SetResultMsg(v string) *DeleteGroupResponse {
	s.ResultMsg = &v
	return s
}

type UpdateGroupRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 成员组ID
	GroupId *string `json:"group_id,omitempty" xml:"group_id,omitempty" require:"true"`
	// 名称
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 描述
	Description *string `json:"description,omitempty" xml:"description,omitempty"`
}

func (s UpdateGroupRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateGroupRequest) GoString() string {
	return s.String()
}

func (s *UpdateGroupRequest) SetAuthToken(v string) *UpdateGroupRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateGroupRequest) SetGroupId(v string) *UpdateGroupRequest {
	s.GroupId = &v
	return s
}

func (s *UpdateGroupRequest) SetName(v string) *UpdateGroupRequest {
	s.Name = &v
	return s
}

func (s *UpdateGroupRequest) SetDescription(v string) *UpdateGroupRequest {
	s.Description = &v
	return s
}

type UpdateGroupResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s UpdateGroupResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateGroupResponse) GoString() string {
	return s.String()
}

func (s *UpdateGroupResponse) SetReqMsgId(v string) *UpdateGroupResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateGroupResponse) SetResultCode(v string) *UpdateGroupResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateGroupResponse) SetResultMsg(v string) *UpdateGroupResponse {
	s.ResultMsg = &v
	return s
}

type AddGroupMemberRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 成员组ID
	GroupId *string `json:"group_id,omitempty" xml:"group_id,omitempty" require:"true"`
	// 操作员ID
	OperatorIds []*string `json:"operator_ids,omitempty" xml:"operator_ids,omitempty" require:"true" type:"Repeated"`
}

func (s AddGroupMemberRequest) String() string {
	return tea.Prettify(s)
}

func (s AddGroupMemberRequest) GoString() string {
	return s.String()
}

func (s *AddGroupMemberRequest) SetAuthToken(v string) *AddGroupMemberRequest {
	s.AuthToken = &v
	return s
}

func (s *AddGroupMemberRequest) SetGroupId(v string) *AddGroupMemberRequest {
	s.GroupId = &v
	return s
}

func (s *AddGroupMemberRequest) SetOperatorIds(v []*string) *AddGroupMemberRequest {
	s.OperatorIds = v
	return s
}

type AddGroupMemberResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s AddGroupMemberResponse) String() string {
	return tea.Prettify(s)
}

func (s AddGroupMemberResponse) GoString() string {
	return s.String()
}

func (s *AddGroupMemberResponse) SetReqMsgId(v string) *AddGroupMemberResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AddGroupMemberResponse) SetResultCode(v string) *AddGroupMemberResponse {
	s.ResultCode = &v
	return s
}

func (s *AddGroupMemberResponse) SetResultMsg(v string) *AddGroupMemberResponse {
	s.ResultMsg = &v
	return s
}

type RemoveGroupMemberRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 成员组ID
	GroupId *string `json:"group_id,omitempty" xml:"group_id,omitempty" require:"true"`
	// 操作员ID
	OperatorIds []*string `json:"operator_ids,omitempty" xml:"operator_ids,omitempty" require:"true" type:"Repeated"`
}

func (s RemoveGroupMemberRequest) String() string {
	return tea.Prettify(s)
}

func (s RemoveGroupMemberRequest) GoString() string {
	return s.String()
}

func (s *RemoveGroupMemberRequest) SetAuthToken(v string) *RemoveGroupMemberRequest {
	s.AuthToken = &v
	return s
}

func (s *RemoveGroupMemberRequest) SetGroupId(v string) *RemoveGroupMemberRequest {
	s.GroupId = &v
	return s
}

func (s *RemoveGroupMemberRequest) SetOperatorIds(v []*string) *RemoveGroupMemberRequest {
	s.OperatorIds = v
	return s
}

type RemoveGroupMemberResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s RemoveGroupMemberResponse) String() string {
	return tea.Prettify(s)
}

func (s RemoveGroupMemberResponse) GoString() string {
	return s.String()
}

func (s *RemoveGroupMemberResponse) SetReqMsgId(v string) *RemoveGroupMemberResponse {
	s.ReqMsgId = &v
	return s
}

func (s *RemoveGroupMemberResponse) SetResultCode(v string) *RemoveGroupMemberResponse {
	s.ResultCode = &v
	return s
}

func (s *RemoveGroupMemberResponse) SetResultMsg(v string) *RemoveGroupMemberResponse {
	s.ResultMsg = &v
	return s
}

type GetGroupRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 成员组ID
	GroupId *string `json:"group_id,omitempty" xml:"group_id,omitempty" require:"true"`
}

func (s GetGroupRequest) String() string {
	return tea.Prettify(s)
}

func (s GetGroupRequest) GoString() string {
	return s.String()
}

func (s *GetGroupRequest) SetAuthToken(v string) *GetGroupRequest {
	s.AuthToken = &v
	return s
}

func (s *GetGroupRequest) SetGroupId(v string) *GetGroupRequest {
	s.GroupId = &v
	return s
}

type GetGroupResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 成员组ID
	Id *string `json:"id,omitempty" xml:"id,omitempty"`
	// 名称
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 描述
	Description *string `json:"description,omitempty" xml:"description,omitempty"`
}

func (s GetGroupResponse) String() string {
	return tea.Prettify(s)
}

func (s GetGroupResponse) GoString() string {
	return s.String()
}

func (s *GetGroupResponse) SetReqMsgId(v string) *GetGroupResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetGroupResponse) SetResultCode(v string) *GetGroupResponse {
	s.ResultCode = &v
	return s
}

func (s *GetGroupResponse) SetResultMsg(v string) *GetGroupResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetGroupResponse) SetId(v string) *GetGroupResponse {
	s.Id = &v
	return s
}

func (s *GetGroupResponse) SetName(v string) *GetGroupResponse {
	s.Name = &v
	return s
}

func (s *GetGroupResponse) SetDescription(v string) *GetGroupResponse {
	s.Description = &v
	return s
}

type QueryGroupMemberRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 成员组ID
	GroupId *string `json:"group_id,omitempty" xml:"group_id,omitempty" require:"true"`
	// 页大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" maximum:"100" minimum:"10"`
	// 当前页
	CurrentPage *int64 `json:"current_page,omitempty" xml:"current_page,omitempty" minimum:"1"`
}

func (s QueryGroupMemberRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryGroupMemberRequest) GoString() string {
	return s.String()
}

func (s *QueryGroupMemberRequest) SetAuthToken(v string) *QueryGroupMemberRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryGroupMemberRequest) SetGroupId(v string) *QueryGroupMemberRequest {
	s.GroupId = &v
	return s
}

func (s *QueryGroupMemberRequest) SetPageSize(v int64) *QueryGroupMemberRequest {
	s.PageSize = &v
	return s
}

func (s *QueryGroupMemberRequest) SetCurrentPage(v int64) *QueryGroupMemberRequest {
	s.CurrentPage = &v
	return s
}

type QueryGroupMemberResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 成员列表
	Operators []*Operator `json:"operators,omitempty" xml:"operators,omitempty" type:"Repeated"`
	// 当前页
	CurrentPage *int64 `json:"current_page,omitempty" xml:"current_page,omitempty"`
	// 页大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// 总计
	TotalCount *int64 `json:"total_count,omitempty" xml:"total_count,omitempty"`
}

func (s QueryGroupMemberResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryGroupMemberResponse) GoString() string {
	return s.String()
}

func (s *QueryGroupMemberResponse) SetReqMsgId(v string) *QueryGroupMemberResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryGroupMemberResponse) SetResultCode(v string) *QueryGroupMemberResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryGroupMemberResponse) SetResultMsg(v string) *QueryGroupMemberResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryGroupMemberResponse) SetOperators(v []*Operator) *QueryGroupMemberResponse {
	s.Operators = v
	return s
}

func (s *QueryGroupMemberResponse) SetCurrentPage(v int64) *QueryGroupMemberResponse {
	s.CurrentPage = &v
	return s
}

func (s *QueryGroupMemberResponse) SetPageSize(v int64) *QueryGroupMemberResponse {
	s.PageSize = &v
	return s
}

func (s *QueryGroupMemberResponse) SetTotalCount(v int64) *QueryGroupMemberResponse {
	s.TotalCount = &v
	return s
}

type ListOperatorGroupRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 操作员ID
	OperatorId *string `json:"operator_id,omitempty" xml:"operator_id,omitempty" require:"true"`
}

func (s ListOperatorGroupRequest) String() string {
	return tea.Prettify(s)
}

func (s ListOperatorGroupRequest) GoString() string {
	return s.String()
}

func (s *ListOperatorGroupRequest) SetAuthToken(v string) *ListOperatorGroupRequest {
	s.AuthToken = &v
	return s
}

func (s *ListOperatorGroupRequest) SetOperatorId(v string) *ListOperatorGroupRequest {
	s.OperatorId = &v
	return s
}

type ListOperatorGroupResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 成员组列表
	Groups []*Group `json:"groups,omitempty" xml:"groups,omitempty" type:"Repeated"`
}

func (s ListOperatorGroupResponse) String() string {
	return tea.Prettify(s)
}

func (s ListOperatorGroupResponse) GoString() string {
	return s.String()
}

func (s *ListOperatorGroupResponse) SetReqMsgId(v string) *ListOperatorGroupResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListOperatorGroupResponse) SetResultCode(v string) *ListOperatorGroupResponse {
	s.ResultCode = &v
	return s
}

func (s *ListOperatorGroupResponse) SetResultMsg(v string) *ListOperatorGroupResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListOperatorGroupResponse) SetGroups(v []*Group) *ListOperatorGroupResponse {
	s.Groups = v
	return s
}

type AddRoleActionRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 角色ID
	RoleId *string `json:"role_id,omitempty" xml:"role_id,omitempty" require:"true"`
	// 权限码
	Actions []*string `json:"actions,omitempty" xml:"actions,omitempty" require:"true" type:"Repeated"`
}

func (s AddRoleActionRequest) String() string {
	return tea.Prettify(s)
}

func (s AddRoleActionRequest) GoString() string {
	return s.String()
}

func (s *AddRoleActionRequest) SetAuthToken(v string) *AddRoleActionRequest {
	s.AuthToken = &v
	return s
}

func (s *AddRoleActionRequest) SetRoleId(v string) *AddRoleActionRequest {
	s.RoleId = &v
	return s
}

func (s *AddRoleActionRequest) SetActions(v []*string) *AddRoleActionRequest {
	s.Actions = v
	return s
}

type AddRoleActionResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s AddRoleActionResponse) String() string {
	return tea.Prettify(s)
}

func (s AddRoleActionResponse) GoString() string {
	return s.String()
}

func (s *AddRoleActionResponse) SetReqMsgId(v string) *AddRoleActionResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AddRoleActionResponse) SetResultCode(v string) *AddRoleActionResponse {
	s.ResultCode = &v
	return s
}

func (s *AddRoleActionResponse) SetResultMsg(v string) *AddRoleActionResponse {
	s.ResultMsg = &v
	return s
}

type RemoveRoleActionRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 角色ID
	RoleId *string `json:"role_id,omitempty" xml:"role_id,omitempty" require:"true"`
	// 权限码
	Actions []*string `json:"actions,omitempty" xml:"actions,omitempty" require:"true" type:"Repeated"`
}

func (s RemoveRoleActionRequest) String() string {
	return tea.Prettify(s)
}

func (s RemoveRoleActionRequest) GoString() string {
	return s.String()
}

func (s *RemoveRoleActionRequest) SetAuthToken(v string) *RemoveRoleActionRequest {
	s.AuthToken = &v
	return s
}

func (s *RemoveRoleActionRequest) SetRoleId(v string) *RemoveRoleActionRequest {
	s.RoleId = &v
	return s
}

func (s *RemoveRoleActionRequest) SetActions(v []*string) *RemoveRoleActionRequest {
	s.Actions = v
	return s
}

type RemoveRoleActionResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s RemoveRoleActionResponse) String() string {
	return tea.Prettify(s)
}

func (s RemoveRoleActionResponse) GoString() string {
	return s.String()
}

func (s *RemoveRoleActionResponse) SetReqMsgId(v string) *RemoveRoleActionResponse {
	s.ReqMsgId = &v
	return s
}

func (s *RemoveRoleActionResponse) SetResultCode(v string) *RemoveRoleActionResponse {
	s.ResultCode = &v
	return s
}

func (s *RemoveRoleActionResponse) SetResultMsg(v string) *RemoveRoleActionResponse {
	s.ResultMsg = &v
	return s
}

type CreateRoleRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 描述
	Description *string `json:"description,omitempty" xml:"description,omitempty"`
	// 权限码列表
	Actions []*string `json:"actions,omitempty" xml:"actions,omitempty" type:"Repeated"`
}

func (s CreateRoleRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateRoleRequest) GoString() string {
	return s.String()
}

func (s *CreateRoleRequest) SetAuthToken(v string) *CreateRoleRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateRoleRequest) SetName(v string) *CreateRoleRequest {
	s.Name = &v
	return s
}

func (s *CreateRoleRequest) SetDescription(v string) *CreateRoleRequest {
	s.Description = &v
	return s
}

func (s *CreateRoleRequest) SetActions(v []*string) *CreateRoleRequest {
	s.Actions = v
	return s
}

type CreateRoleResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 角色ID
	Id *string `json:"id,omitempty" xml:"id,omitempty"`
}

func (s CreateRoleResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateRoleResponse) GoString() string {
	return s.String()
}

func (s *CreateRoleResponse) SetReqMsgId(v string) *CreateRoleResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateRoleResponse) SetResultCode(v string) *CreateRoleResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateRoleResponse) SetResultMsg(v string) *CreateRoleResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateRoleResponse) SetId(v string) *CreateRoleResponse {
	s.Id = &v
	return s
}

type DeleteRoleRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 角色ID
	RoleId *string `json:"role_id,omitempty" xml:"role_id,omitempty" require:"true"`
}

func (s DeleteRoleRequest) String() string {
	return tea.Prettify(s)
}

func (s DeleteRoleRequest) GoString() string {
	return s.String()
}

func (s *DeleteRoleRequest) SetAuthToken(v string) *DeleteRoleRequest {
	s.AuthToken = &v
	return s
}

func (s *DeleteRoleRequest) SetRoleId(v string) *DeleteRoleRequest {
	s.RoleId = &v
	return s
}

type DeleteRoleResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s DeleteRoleResponse) String() string {
	return tea.Prettify(s)
}

func (s DeleteRoleResponse) GoString() string {
	return s.String()
}

func (s *DeleteRoleResponse) SetReqMsgId(v string) *DeleteRoleResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DeleteRoleResponse) SetResultCode(v string) *DeleteRoleResponse {
	s.ResultCode = &v
	return s
}

func (s *DeleteRoleResponse) SetResultMsg(v string) *DeleteRoleResponse {
	s.ResultMsg = &v
	return s
}

type UpdateRoleRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 角色ID
	RoleId *string `json:"role_id,omitempty" xml:"role_id,omitempty" require:"true"`
	// 名称
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 描述
	Description *string `json:"description,omitempty" xml:"description,omitempty"`
}

func (s UpdateRoleRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateRoleRequest) GoString() string {
	return s.String()
}

func (s *UpdateRoleRequest) SetAuthToken(v string) *UpdateRoleRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateRoleRequest) SetRoleId(v string) *UpdateRoleRequest {
	s.RoleId = &v
	return s
}

func (s *UpdateRoleRequest) SetName(v string) *UpdateRoleRequest {
	s.Name = &v
	return s
}

func (s *UpdateRoleRequest) SetDescription(v string) *UpdateRoleRequest {
	s.Description = &v
	return s
}

type UpdateRoleResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s UpdateRoleResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateRoleResponse) GoString() string {
	return s.String()
}

func (s *UpdateRoleResponse) SetReqMsgId(v string) *UpdateRoleResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateRoleResponse) SetResultCode(v string) *UpdateRoleResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateRoleResponse) SetResultMsg(v string) *UpdateRoleResponse {
	s.ResultMsg = &v
	return s
}

type GetDepartmentRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 部门唯一代码
	Code *string `json:"code,omitempty" xml:"code,omitempty" require:"true"`
}

func (s GetDepartmentRequest) String() string {
	return tea.Prettify(s)
}

func (s GetDepartmentRequest) GoString() string {
	return s.String()
}

func (s *GetDepartmentRequest) SetAuthToken(v string) *GetDepartmentRequest {
	s.AuthToken = &v
	return s
}

func (s *GetDepartmentRequest) SetCode(v string) *GetDepartmentRequest {
	s.Code = &v
	return s
}

type GetDepartmentResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 部门唯一代码
	Code *string `json:"code,omitempty" xml:"code,omitempty"`
	// 部门名称
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 部门描述信息
	Description *string `json:"description,omitempty" xml:"description,omitempty"`
	// 父部门 code
	ParentCode *string `json:"parent_code,omitempty" xml:"parent_code,omitempty"`
	// 企业 id
	CustomerId *string `json:"customer_id,omitempty" xml:"customer_id,omitempty"`
	// 是否为叶子结点
	IsLeaf *bool `json:"is_leaf,omitempty" xml:"is_leaf,omitempty"`
	// 创建时间，ISO8601格式
	CreationTime *string `json:"creation_time,omitempty" xml:"creation_time,omitempty"`
	// 更新时间，ISO8601格式
	UpdateTime *string `json:"update_time,omitempty" xml:"update_time,omitempty"`
}

func (s GetDepartmentResponse) String() string {
	return tea.Prettify(s)
}

func (s GetDepartmentResponse) GoString() string {
	return s.String()
}

func (s *GetDepartmentResponse) SetReqMsgId(v string) *GetDepartmentResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetDepartmentResponse) SetResultCode(v string) *GetDepartmentResponse {
	s.ResultCode = &v
	return s
}

func (s *GetDepartmentResponse) SetResultMsg(v string) *GetDepartmentResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetDepartmentResponse) SetCode(v string) *GetDepartmentResponse {
	s.Code = &v
	return s
}

func (s *GetDepartmentResponse) SetName(v string) *GetDepartmentResponse {
	s.Name = &v
	return s
}

func (s *GetDepartmentResponse) SetDescription(v string) *GetDepartmentResponse {
	s.Description = &v
	return s
}

func (s *GetDepartmentResponse) SetParentCode(v string) *GetDepartmentResponse {
	s.ParentCode = &v
	return s
}

func (s *GetDepartmentResponse) SetCustomerId(v string) *GetDepartmentResponse {
	s.CustomerId = &v
	return s
}

func (s *GetDepartmentResponse) SetIsLeaf(v bool) *GetDepartmentResponse {
	s.IsLeaf = &v
	return s
}

func (s *GetDepartmentResponse) SetCreationTime(v string) *GetDepartmentResponse {
	s.CreationTime = &v
	return s
}

func (s *GetDepartmentResponse) SetUpdateTime(v string) *GetDepartmentResponse {
	s.UpdateTime = &v
	return s
}

type CreateDepartmentRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 部门唯一码
	Code *string `json:"code,omitempty" xml:"code,omitempty" require:"true"`
	// 部门名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 部门描述信息
	Description *string `json:"description,omitempty" xml:"description,omitempty"`
	// 父部门 code，如果需要创建根部门，需填：ROOT
	ParentCode *string `json:"parent_code,omitempty" xml:"parent_code,omitempty" require:"true"`
}

func (s CreateDepartmentRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateDepartmentRequest) GoString() string {
	return s.String()
}

func (s *CreateDepartmentRequest) SetAuthToken(v string) *CreateDepartmentRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateDepartmentRequest) SetCode(v string) *CreateDepartmentRequest {
	s.Code = &v
	return s
}

func (s *CreateDepartmentRequest) SetName(v string) *CreateDepartmentRequest {
	s.Name = &v
	return s
}

func (s *CreateDepartmentRequest) SetDescription(v string) *CreateDepartmentRequest {
	s.Description = &v
	return s
}

func (s *CreateDepartmentRequest) SetParentCode(v string) *CreateDepartmentRequest {
	s.ParentCode = &v
	return s
}

type CreateDepartmentResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CreateDepartmentResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateDepartmentResponse) GoString() string {
	return s.String()
}

func (s *CreateDepartmentResponse) SetReqMsgId(v string) *CreateDepartmentResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateDepartmentResponse) SetResultCode(v string) *CreateDepartmentResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateDepartmentResponse) SetResultMsg(v string) *CreateDepartmentResponse {
	s.ResultMsg = &v
	return s
}

type UpdateDepartmentRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 部门唯一码
	Code *string `json:"code,omitempty" xml:"code,omitempty" require:"true"`
	// 部门名称
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 部门描述信息
	Description *string `json:"description,omitempty" xml:"description,omitempty"`
	// 父部们唯一码
	ParentCode *string `json:"parent_code,omitempty" xml:"parent_code,omitempty"`
}

func (s UpdateDepartmentRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateDepartmentRequest) GoString() string {
	return s.String()
}

func (s *UpdateDepartmentRequest) SetAuthToken(v string) *UpdateDepartmentRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateDepartmentRequest) SetCode(v string) *UpdateDepartmentRequest {
	s.Code = &v
	return s
}

func (s *UpdateDepartmentRequest) SetName(v string) *UpdateDepartmentRequest {
	s.Name = &v
	return s
}

func (s *UpdateDepartmentRequest) SetDescription(v string) *UpdateDepartmentRequest {
	s.Description = &v
	return s
}

func (s *UpdateDepartmentRequest) SetParentCode(v string) *UpdateDepartmentRequest {
	s.ParentCode = &v
	return s
}

type UpdateDepartmentResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s UpdateDepartmentResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateDepartmentResponse) GoString() string {
	return s.String()
}

func (s *UpdateDepartmentResponse) SetReqMsgId(v string) *UpdateDepartmentResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateDepartmentResponse) SetResultCode(v string) *UpdateDepartmentResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateDepartmentResponse) SetResultMsg(v string) *UpdateDepartmentResponse {
	s.ResultMsg = &v
	return s
}

type DeleteDepartmentRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 部门唯一码
	Code *string `json:"code,omitempty" xml:"code,omitempty" require:"true"`
}

func (s DeleteDepartmentRequest) String() string {
	return tea.Prettify(s)
}

func (s DeleteDepartmentRequest) GoString() string {
	return s.String()
}

func (s *DeleteDepartmentRequest) SetAuthToken(v string) *DeleteDepartmentRequest {
	s.AuthToken = &v
	return s
}

func (s *DeleteDepartmentRequest) SetCode(v string) *DeleteDepartmentRequest {
	s.Code = &v
	return s
}

type DeleteDepartmentResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s DeleteDepartmentResponse) String() string {
	return tea.Prettify(s)
}

func (s DeleteDepartmentResponse) GoString() string {
	return s.String()
}

func (s *DeleteDepartmentResponse) SetReqMsgId(v string) *DeleteDepartmentResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DeleteDepartmentResponse) SetResultCode(v string) *DeleteDepartmentResponse {
	s.ResultCode = &v
	return s
}

func (s *DeleteDepartmentResponse) SetResultMsg(v string) *DeleteDepartmentResponse {
	s.ResultMsg = &v
	return s
}

type PagequeryDepartmentRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 部门唯一码
	Code *string `json:"code,omitempty" xml:"code,omitempty"`
	// 部门名称
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 部门描述信息
	Description *string `json:"description,omitempty" xml:"description,omitempty"`
	// 父部门唯一码
	ParentCode *string `json:"parent_code,omitempty" xml:"parent_code,omitempty"`
	// 分页大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// 当前页
	PageNum *int64 `json:"page_num,omitempty" xml:"page_num,omitempty"`
}

func (s PagequeryDepartmentRequest) String() string {
	return tea.Prettify(s)
}

func (s PagequeryDepartmentRequest) GoString() string {
	return s.String()
}

func (s *PagequeryDepartmentRequest) SetAuthToken(v string) *PagequeryDepartmentRequest {
	s.AuthToken = &v
	return s
}

func (s *PagequeryDepartmentRequest) SetCode(v string) *PagequeryDepartmentRequest {
	s.Code = &v
	return s
}

func (s *PagequeryDepartmentRequest) SetName(v string) *PagequeryDepartmentRequest {
	s.Name = &v
	return s
}

func (s *PagequeryDepartmentRequest) SetDescription(v string) *PagequeryDepartmentRequest {
	s.Description = &v
	return s
}

func (s *PagequeryDepartmentRequest) SetParentCode(v string) *PagequeryDepartmentRequest {
	s.ParentCode = &v
	return s
}

func (s *PagequeryDepartmentRequest) SetPageSize(v int64) *PagequeryDepartmentRequest {
	s.PageSize = &v
	return s
}

func (s *PagequeryDepartmentRequest) SetPageNum(v int64) *PagequeryDepartmentRequest {
	s.PageNum = &v
	return s
}

type PagequeryDepartmentResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 部门列表
	Departments []*Department `json:"departments,omitempty" xml:"departments,omitempty" type:"Repeated"`
	// 当前页码
	PageNum *int64 `json:"page_num,omitempty" xml:"page_num,omitempty"`
	// 分页大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// 总数
	TotalCount *int64 `json:"total_count,omitempty" xml:"total_count,omitempty"`
}

func (s PagequeryDepartmentResponse) String() string {
	return tea.Prettify(s)
}

func (s PagequeryDepartmentResponse) GoString() string {
	return s.String()
}

func (s *PagequeryDepartmentResponse) SetReqMsgId(v string) *PagequeryDepartmentResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PagequeryDepartmentResponse) SetResultCode(v string) *PagequeryDepartmentResponse {
	s.ResultCode = &v
	return s
}

func (s *PagequeryDepartmentResponse) SetResultMsg(v string) *PagequeryDepartmentResponse {
	s.ResultMsg = &v
	return s
}

func (s *PagequeryDepartmentResponse) SetDepartments(v []*Department) *PagequeryDepartmentResponse {
	s.Departments = v
	return s
}

func (s *PagequeryDepartmentResponse) SetPageNum(v int64) *PagequeryDepartmentResponse {
	s.PageNum = &v
	return s
}

func (s *PagequeryDepartmentResponse) SetPageSize(v int64) *PagequeryDepartmentResponse {
	s.PageSize = &v
	return s
}

func (s *PagequeryDepartmentResponse) SetTotalCount(v int64) *PagequeryDepartmentResponse {
	s.TotalCount = &v
	return s
}

type BatchqueryDepartmentRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 部门唯一码
	Codes []*string `json:"codes,omitempty" xml:"codes,omitempty" type:"Repeated"`
}

func (s BatchqueryDepartmentRequest) String() string {
	return tea.Prettify(s)
}

func (s BatchqueryDepartmentRequest) GoString() string {
	return s.String()
}

func (s *BatchqueryDepartmentRequest) SetAuthToken(v string) *BatchqueryDepartmentRequest {
	s.AuthToken = &v
	return s
}

func (s *BatchqueryDepartmentRequest) SetCodes(v []*string) *BatchqueryDepartmentRequest {
	s.Codes = v
	return s
}

type BatchqueryDepartmentResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 部门列表
	Departments []*Department `json:"departments,omitempty" xml:"departments,omitempty" type:"Repeated"`
}

func (s BatchqueryDepartmentResponse) String() string {
	return tea.Prettify(s)
}

func (s BatchqueryDepartmentResponse) GoString() string {
	return s.String()
}

func (s *BatchqueryDepartmentResponse) SetReqMsgId(v string) *BatchqueryDepartmentResponse {
	s.ReqMsgId = &v
	return s
}

func (s *BatchqueryDepartmentResponse) SetResultCode(v string) *BatchqueryDepartmentResponse {
	s.ResultCode = &v
	return s
}

func (s *BatchqueryDepartmentResponse) SetResultMsg(v string) *BatchqueryDepartmentResponse {
	s.ResultMsg = &v
	return s
}

func (s *BatchqueryDepartmentResponse) SetDepartments(v []*Department) *BatchqueryDepartmentResponse {
	s.Departments = v
	return s
}

type SaveDepartmentUserRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 待添加或更新的部门成员关系列表
	DepartmentUsers []*DepartmentUser `json:"department_users,omitempty" xml:"department_users,omitempty" require:"true" type:"Repeated"`
}

func (s SaveDepartmentUserRequest) String() string {
	return tea.Prettify(s)
}

func (s SaveDepartmentUserRequest) GoString() string {
	return s.String()
}

func (s *SaveDepartmentUserRequest) SetAuthToken(v string) *SaveDepartmentUserRequest {
	s.AuthToken = &v
	return s
}

func (s *SaveDepartmentUserRequest) SetDepartmentUsers(v []*DepartmentUser) *SaveDepartmentUserRequest {
	s.DepartmentUsers = v
	return s
}

type SaveDepartmentUserResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s SaveDepartmentUserResponse) String() string {
	return tea.Prettify(s)
}

func (s SaveDepartmentUserResponse) GoString() string {
	return s.String()
}

func (s *SaveDepartmentUserResponse) SetReqMsgId(v string) *SaveDepartmentUserResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SaveDepartmentUserResponse) SetResultCode(v string) *SaveDepartmentUserResponse {
	s.ResultCode = &v
	return s
}

func (s *SaveDepartmentUserResponse) SetResultMsg(v string) *SaveDepartmentUserResponse {
	s.ResultMsg = &v
	return s
}

type RemoveDepartmentUserRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 待删除的部门成员关系列表
	DepartmentUsers []*DepartmentUser `json:"department_users,omitempty" xml:"department_users,omitempty" require:"true" type:"Repeated"`
}

func (s RemoveDepartmentUserRequest) String() string {
	return tea.Prettify(s)
}

func (s RemoveDepartmentUserRequest) GoString() string {
	return s.String()
}

func (s *RemoveDepartmentUserRequest) SetAuthToken(v string) *RemoveDepartmentUserRequest {
	s.AuthToken = &v
	return s
}

func (s *RemoveDepartmentUserRequest) SetDepartmentUsers(v []*DepartmentUser) *RemoveDepartmentUserRequest {
	s.DepartmentUsers = v
	return s
}

type RemoveDepartmentUserResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s RemoveDepartmentUserResponse) String() string {
	return tea.Prettify(s)
}

func (s RemoveDepartmentUserResponse) GoString() string {
	return s.String()
}

func (s *RemoveDepartmentUserResponse) SetReqMsgId(v string) *RemoveDepartmentUserResponse {
	s.ReqMsgId = &v
	return s
}

func (s *RemoveDepartmentUserResponse) SetResultCode(v string) *RemoveDepartmentUserResponse {
	s.ResultCode = &v
	return s
}

func (s *RemoveDepartmentUserResponse) SetResultMsg(v string) *RemoveDepartmentUserResponse {
	s.ResultMsg = &v
	return s
}

type QueryDepartmentUserRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 部门唯一码
	DepartmentCode *string `json:"department_code,omitempty" xml:"department_code,omitempty"`
	// 用户 id
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty"`
	// 部门成员类型
	Type *string `json:"type,omitempty" xml:"type,omitempty"`
	// 分页大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// 当前页
	PageNum *int64 `json:"page_num,omitempty" xml:"page_num,omitempty"`
}

func (s QueryDepartmentUserRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDepartmentUserRequest) GoString() string {
	return s.String()
}

func (s *QueryDepartmentUserRequest) SetAuthToken(v string) *QueryDepartmentUserRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDepartmentUserRequest) SetDepartmentCode(v string) *QueryDepartmentUserRequest {
	s.DepartmentCode = &v
	return s
}

func (s *QueryDepartmentUserRequest) SetUserId(v string) *QueryDepartmentUserRequest {
	s.UserId = &v
	return s
}

func (s *QueryDepartmentUserRequest) SetType(v string) *QueryDepartmentUserRequest {
	s.Type = &v
	return s
}

func (s *QueryDepartmentUserRequest) SetPageSize(v int64) *QueryDepartmentUserRequest {
	s.PageSize = &v
	return s
}

func (s *QueryDepartmentUserRequest) SetPageNum(v int64) *QueryDepartmentUserRequest {
	s.PageNum = &v
	return s
}

type QueryDepartmentUserResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 部门成员列表
	DepartmentUsers []*DepartmentUser `json:"department_users,omitempty" xml:"department_users,omitempty" type:"Repeated"`
	// 当前页码
	PageNum *int64 `json:"page_num,omitempty" xml:"page_num,omitempty"`
	// 分页大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// 总数
	TotalCount *int64 `json:"total_count,omitempty" xml:"total_count,omitempty"`
}

func (s QueryDepartmentUserResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDepartmentUserResponse) GoString() string {
	return s.String()
}

func (s *QueryDepartmentUserResponse) SetReqMsgId(v string) *QueryDepartmentUserResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDepartmentUserResponse) SetResultCode(v string) *QueryDepartmentUserResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDepartmentUserResponse) SetResultMsg(v string) *QueryDepartmentUserResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDepartmentUserResponse) SetDepartmentUsers(v []*DepartmentUser) *QueryDepartmentUserResponse {
	s.DepartmentUsers = v
	return s
}

func (s *QueryDepartmentUserResponse) SetPageNum(v int64) *QueryDepartmentUserResponse {
	s.PageNum = &v
	return s
}

func (s *QueryDepartmentUserResponse) SetPageSize(v int64) *QueryDepartmentUserResponse {
	s.PageSize = &v
	return s
}

func (s *QueryDepartmentUserResponse) SetTotalCount(v int64) *QueryDepartmentUserResponse {
	s.TotalCount = &v
	return s
}

type GetLoginconfigRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
}

func (s GetLoginconfigRequest) String() string {
	return tea.Prettify(s)
}

func (s GetLoginconfigRequest) GoString() string {
	return s.String()
}

func (s *GetLoginconfigRequest) SetAuthToken(v string) *GetLoginconfigRequest {
	s.AuthToken = &v
	return s
}

type GetLoginconfigResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 密码最小长度
	PasswordMinLength *int64 `json:"password_min_length,omitempty" xml:"password_min_length,omitempty"`
	// 密码最大长度
	PasswordMaxLength *int64 `json:"password_max_length,omitempty" xml:"password_max_length,omitempty"`
	// 密码是否必须包含小写字母
	PasswordLowercaseLetter *bool `json:"password_lowercase_letter,omitempty" xml:"password_lowercase_letter,omitempty"`
	// 密码是否必须包含大写字母
	PasswordUppercaseLetter *bool `json:"password_uppercase_letter,omitempty" xml:"password_uppercase_letter,omitempty"`
	// 密码是否必须包含字母
	PasswordLetter *bool `json:"password_letter,omitempty" xml:"password_letter,omitempty"`
	// 密码是否必须包含数字
	PasswordDigit *bool `json:"password_digit,omitempty" xml:"password_digit,omitempty"`
	// 密码是否必须包含特殊字符
	PasswordSpecialChar *bool `json:"password_special_char,omitempty" xml:"password_special_char,omitempty"`
	// 是否检查密码有效
	PasswordValidCheck *bool `json:"password_valid_check,omitempty" xml:"password_valid_check,omitempty"`
	// 密码有效期
	PasswordValidPeriod *int64 `json:"password_valid_period,omitempty" xml:"password_valid_period,omitempty"`
	// 密码过期后是否允许登录
	PasswordExpiredLogin *bool `json:"password_expired_login,omitempty" xml:"password_expired_login,omitempty"`
	// 是否检查密码历史
	PasswordHistoryCheck *bool `json:"password_history_check,omitempty" xml:"password_history_check,omitempty"`
	// 密码历史个数
	PasswordHistoryNum *int64 `json:"password_history_num,omitempty" xml:"password_history_num,omitempty"`
	// 重试校验是否触发锁定
	VerifyAttemptsCheck *bool `json:"verify_attempts_check,omitempty" xml:"verify_attempts_check,omitempty"`
	// 重试校验窗口
	VerifyAttemptsWindow *int64 `json:"verify_attempts_window,omitempty" xml:"verify_attempts_window,omitempty"`
	// 重试校验触发锁定阈值
	VerifyAttemptsThreshold *int64 `json:"verify_attempts_threshold,omitempty" xml:"verify_attempts_threshold,omitempty"`
	// 锁定时间
	LockoutDuration *int64 `json:"lockout_duration,omitempty" xml:"lockout_duration,omitempty"`
	// 是否检查账户活跃
	ActiveCheck *bool `json:"active_check,omitempty" xml:"active_check,omitempty"`
	// 活跃周期，非活跃时锁定登录
	ActivePeriod *int64 `json:"active_period,omitempty" xml:"active_period,omitempty"`
	// 是否允许自主管理密码
	PasswordSelfManage *bool `json:"password_self_manage,omitempty" xml:"password_self_manage,omitempty"`
	// 是否允许自主管理MFA
	MfaSelfManage *bool `json:"mfa_self_manage,omitempty" xml:"mfa_self_manage,omitempty"`
	// 状态, 取值范围：NORMAL(正常状态), LOCK(锁定), ONE_PARTY_MIGRATING(一方化迁移中), ONE_PARTY_MIGRATION_LOCK(一方化迁移完成，禁用蚂蚁登录)
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 并发登录的ip数量，小于1表示不限制
	ConcurrentIpCount *int64 `json:"concurrent_ip_count,omitempty" xml:"concurrent_ip_count,omitempty"`
}

func (s GetLoginconfigResponse) String() string {
	return tea.Prettify(s)
}

func (s GetLoginconfigResponse) GoString() string {
	return s.String()
}

func (s *GetLoginconfigResponse) SetReqMsgId(v string) *GetLoginconfigResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetLoginconfigResponse) SetResultCode(v string) *GetLoginconfigResponse {
	s.ResultCode = &v
	return s
}

func (s *GetLoginconfigResponse) SetResultMsg(v string) *GetLoginconfigResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetLoginconfigResponse) SetPasswordMinLength(v int64) *GetLoginconfigResponse {
	s.PasswordMinLength = &v
	return s
}

func (s *GetLoginconfigResponse) SetPasswordMaxLength(v int64) *GetLoginconfigResponse {
	s.PasswordMaxLength = &v
	return s
}

func (s *GetLoginconfigResponse) SetPasswordLowercaseLetter(v bool) *GetLoginconfigResponse {
	s.PasswordLowercaseLetter = &v
	return s
}

func (s *GetLoginconfigResponse) SetPasswordUppercaseLetter(v bool) *GetLoginconfigResponse {
	s.PasswordUppercaseLetter = &v
	return s
}

func (s *GetLoginconfigResponse) SetPasswordLetter(v bool) *GetLoginconfigResponse {
	s.PasswordLetter = &v
	return s
}

func (s *GetLoginconfigResponse) SetPasswordDigit(v bool) *GetLoginconfigResponse {
	s.PasswordDigit = &v
	return s
}

func (s *GetLoginconfigResponse) SetPasswordSpecialChar(v bool) *GetLoginconfigResponse {
	s.PasswordSpecialChar = &v
	return s
}

func (s *GetLoginconfigResponse) SetPasswordValidCheck(v bool) *GetLoginconfigResponse {
	s.PasswordValidCheck = &v
	return s
}

func (s *GetLoginconfigResponse) SetPasswordValidPeriod(v int64) *GetLoginconfigResponse {
	s.PasswordValidPeriod = &v
	return s
}

func (s *GetLoginconfigResponse) SetPasswordExpiredLogin(v bool) *GetLoginconfigResponse {
	s.PasswordExpiredLogin = &v
	return s
}

func (s *GetLoginconfigResponse) SetPasswordHistoryCheck(v bool) *GetLoginconfigResponse {
	s.PasswordHistoryCheck = &v
	return s
}

func (s *GetLoginconfigResponse) SetPasswordHistoryNum(v int64) *GetLoginconfigResponse {
	s.PasswordHistoryNum = &v
	return s
}

func (s *GetLoginconfigResponse) SetVerifyAttemptsCheck(v bool) *GetLoginconfigResponse {
	s.VerifyAttemptsCheck = &v
	return s
}

func (s *GetLoginconfigResponse) SetVerifyAttemptsWindow(v int64) *GetLoginconfigResponse {
	s.VerifyAttemptsWindow = &v
	return s
}

func (s *GetLoginconfigResponse) SetVerifyAttemptsThreshold(v int64) *GetLoginconfigResponse {
	s.VerifyAttemptsThreshold = &v
	return s
}

func (s *GetLoginconfigResponse) SetLockoutDuration(v int64) *GetLoginconfigResponse {
	s.LockoutDuration = &v
	return s
}

func (s *GetLoginconfigResponse) SetActiveCheck(v bool) *GetLoginconfigResponse {
	s.ActiveCheck = &v
	return s
}

func (s *GetLoginconfigResponse) SetActivePeriod(v int64) *GetLoginconfigResponse {
	s.ActivePeriod = &v
	return s
}

func (s *GetLoginconfigResponse) SetPasswordSelfManage(v bool) *GetLoginconfigResponse {
	s.PasswordSelfManage = &v
	return s
}

func (s *GetLoginconfigResponse) SetMfaSelfManage(v bool) *GetLoginconfigResponse {
	s.MfaSelfManage = &v
	return s
}

func (s *GetLoginconfigResponse) SetStatus(v string) *GetLoginconfigResponse {
	s.Status = &v
	return s
}

func (s *GetLoginconfigResponse) SetConcurrentIpCount(v int64) *GetLoginconfigResponse {
	s.ConcurrentIpCount = &v
	return s
}

type UpdateLoginconfigRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 密码最小长度
	PasswordMinLength *int64 `json:"password_min_length,omitempty" xml:"password_min_length,omitempty"`
	// 密码最大长度
	PasswordMaxLength *int64 `json:"password_max_length,omitempty" xml:"password_max_length,omitempty"`
	// 密码是否必须包含小写字母
	PasswordLowercaseLetter *bool `json:"password_lowercase_letter,omitempty" xml:"password_lowercase_letter,omitempty"`
	// 密码是否必须包含大写字母
	PasswordUppercaseLetter *bool `json:"password_uppercase_letter,omitempty" xml:"password_uppercase_letter,omitempty"`
	// 密码是否必须包含字母
	PasswordLetter *bool `json:"password_letter,omitempty" xml:"password_letter,omitempty"`
	// 密码是否必须包含数字
	PasswordDigit *bool `json:"password_digit,omitempty" xml:"password_digit,omitempty"`
	// 密码是否必须包含特殊字符
	PasswordSpecialChar *bool `json:"password_special_char,omitempty" xml:"password_special_char,omitempty"`
	// 是否检查密码有效
	PasswordValidCheck *bool `json:"password_valid_check,omitempty" xml:"password_valid_check,omitempty"`
	// 密码有效期
	PasswordValidPeriod *int64 `json:"password_valid_period,omitempty" xml:"password_valid_period,omitempty"`
	// 密码过期后是否允许登录
	PasswordExpiredLogin *bool `json:"password_expired_login,omitempty" xml:"password_expired_login,omitempty"`
	// 是否检查密码历史
	PasswordHistoryCheck *bool `json:"password_history_check,omitempty" xml:"password_history_check,omitempty"`
	// 密码历史个数
	PasswordHistoryNum *int64 `json:"password_history_num,omitempty" xml:"password_history_num,omitempty"`
	// 重试校验是否触发锁定
	VerifyAttemptsCheck *bool `json:"verify_attempts_check,omitempty" xml:"verify_attempts_check,omitempty"`
	// 重试校验窗口
	VerifyAttemptsWindow *int64 `json:"verify_attempts_window,omitempty" xml:"verify_attempts_window,omitempty"`
	// 重试校验触发锁定阈值
	VerifyAttemptsThreshold *int64 `json:"verify_attempts_threshold,omitempty" xml:"verify_attempts_threshold,omitempty"`
	// 锁定时间
	LockoutDuration *int64 `json:"lockout_duration,omitempty" xml:"lockout_duration,omitempty"`
	// 是否检查账户活跃
	ActiveCheck *bool `json:"active_check,omitempty" xml:"active_check,omitempty"`
	// 活跃周期，非活跃时锁定登录
	ActivePeriod *int64 `json:"active_period,omitempty" xml:"active_period,omitempty"`
	// 是否允许自主管理密码
	PasswordSelfManage *bool `json:"password_self_manage,omitempty" xml:"password_self_manage,omitempty"`
	// 是否允许自主管理MFA
	MfaSelfManage *bool `json:"mfa_self_manage,omitempty" xml:"mfa_self_manage,omitempty"`
	// 并发登录的ip数量，小于1表示不限制
	ConcurrentIpCount *int64 `json:"concurrent_ip_count,omitempty" xml:"concurrent_ip_count,omitempty"`
}

func (s UpdateLoginconfigRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateLoginconfigRequest) GoString() string {
	return s.String()
}

func (s *UpdateLoginconfigRequest) SetAuthToken(v string) *UpdateLoginconfigRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateLoginconfigRequest) SetPasswordMinLength(v int64) *UpdateLoginconfigRequest {
	s.PasswordMinLength = &v
	return s
}

func (s *UpdateLoginconfigRequest) SetPasswordMaxLength(v int64) *UpdateLoginconfigRequest {
	s.PasswordMaxLength = &v
	return s
}

func (s *UpdateLoginconfigRequest) SetPasswordLowercaseLetter(v bool) *UpdateLoginconfigRequest {
	s.PasswordLowercaseLetter = &v
	return s
}

func (s *UpdateLoginconfigRequest) SetPasswordUppercaseLetter(v bool) *UpdateLoginconfigRequest {
	s.PasswordUppercaseLetter = &v
	return s
}

func (s *UpdateLoginconfigRequest) SetPasswordLetter(v bool) *UpdateLoginconfigRequest {
	s.PasswordLetter = &v
	return s
}

func (s *UpdateLoginconfigRequest) SetPasswordDigit(v bool) *UpdateLoginconfigRequest {
	s.PasswordDigit = &v
	return s
}

func (s *UpdateLoginconfigRequest) SetPasswordSpecialChar(v bool) *UpdateLoginconfigRequest {
	s.PasswordSpecialChar = &v
	return s
}

func (s *UpdateLoginconfigRequest) SetPasswordValidCheck(v bool) *UpdateLoginconfigRequest {
	s.PasswordValidCheck = &v
	return s
}

func (s *UpdateLoginconfigRequest) SetPasswordValidPeriod(v int64) *UpdateLoginconfigRequest {
	s.PasswordValidPeriod = &v
	return s
}

func (s *UpdateLoginconfigRequest) SetPasswordExpiredLogin(v bool) *UpdateLoginconfigRequest {
	s.PasswordExpiredLogin = &v
	return s
}

func (s *UpdateLoginconfigRequest) SetPasswordHistoryCheck(v bool) *UpdateLoginconfigRequest {
	s.PasswordHistoryCheck = &v
	return s
}

func (s *UpdateLoginconfigRequest) SetPasswordHistoryNum(v int64) *UpdateLoginconfigRequest {
	s.PasswordHistoryNum = &v
	return s
}

func (s *UpdateLoginconfigRequest) SetVerifyAttemptsCheck(v bool) *UpdateLoginconfigRequest {
	s.VerifyAttemptsCheck = &v
	return s
}

func (s *UpdateLoginconfigRequest) SetVerifyAttemptsWindow(v int64) *UpdateLoginconfigRequest {
	s.VerifyAttemptsWindow = &v
	return s
}

func (s *UpdateLoginconfigRequest) SetVerifyAttemptsThreshold(v int64) *UpdateLoginconfigRequest {
	s.VerifyAttemptsThreshold = &v
	return s
}

func (s *UpdateLoginconfigRequest) SetLockoutDuration(v int64) *UpdateLoginconfigRequest {
	s.LockoutDuration = &v
	return s
}

func (s *UpdateLoginconfigRequest) SetActiveCheck(v bool) *UpdateLoginconfigRequest {
	s.ActiveCheck = &v
	return s
}

func (s *UpdateLoginconfigRequest) SetActivePeriod(v int64) *UpdateLoginconfigRequest {
	s.ActivePeriod = &v
	return s
}

func (s *UpdateLoginconfigRequest) SetPasswordSelfManage(v bool) *UpdateLoginconfigRequest {
	s.PasswordSelfManage = &v
	return s
}

func (s *UpdateLoginconfigRequest) SetMfaSelfManage(v bool) *UpdateLoginconfigRequest {
	s.MfaSelfManage = &v
	return s
}

func (s *UpdateLoginconfigRequest) SetConcurrentIpCount(v int64) *UpdateLoginconfigRequest {
	s.ConcurrentIpCount = &v
	return s
}

type UpdateLoginconfigResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s UpdateLoginconfigResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateLoginconfigResponse) GoString() string {
	return s.String()
}

func (s *UpdateLoginconfigResponse) SetReqMsgId(v string) *UpdateLoginconfigResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateLoginconfigResponse) SetResultCode(v string) *UpdateLoginconfigResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateLoginconfigResponse) SetResultMsg(v string) *UpdateLoginconfigResponse {
	s.ResultMsg = &v
	return s
}

type GetMfaStatusRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 用户id
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
}

func (s GetMfaStatusRequest) String() string {
	return tea.Prettify(s)
}

func (s GetMfaStatusRequest) GoString() string {
	return s.String()
}

func (s *GetMfaStatusRequest) SetAuthToken(v string) *GetMfaStatusRequest {
	s.AuthToken = &v
	return s
}

func (s *GetMfaStatusRequest) SetUserId(v string) *GetMfaStatusRequest {
	s.UserId = &v
	return s
}

type GetMfaStatusResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// MFA状态, 取值范围：ENABLED, DISABLED
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
}

func (s GetMfaStatusResponse) String() string {
	return tea.Prettify(s)
}

func (s GetMfaStatusResponse) GoString() string {
	return s.String()
}

func (s *GetMfaStatusResponse) SetReqMsgId(v string) *GetMfaStatusResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetMfaStatusResponse) SetResultCode(v string) *GetMfaStatusResponse {
	s.ResultCode = &v
	return s
}

func (s *GetMfaStatusResponse) SetResultMsg(v string) *GetMfaStatusResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetMfaStatusResponse) SetStatus(v string) *GetMfaStatusResponse {
	s.Status = &v
	return s
}

type EnableMfaRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 用户 id
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
	// 验证码
	VerificationCode *int64 `json:"verification_code,omitempty" xml:"verification_code,omitempty" require:"true"`
}

func (s EnableMfaRequest) String() string {
	return tea.Prettify(s)
}

func (s EnableMfaRequest) GoString() string {
	return s.String()
}

func (s *EnableMfaRequest) SetAuthToken(v string) *EnableMfaRequest {
	s.AuthToken = &v
	return s
}

func (s *EnableMfaRequest) SetUserId(v string) *EnableMfaRequest {
	s.UserId = &v
	return s
}

func (s *EnableMfaRequest) SetVerificationCode(v int64) *EnableMfaRequest {
	s.VerificationCode = &v
	return s
}

type EnableMfaResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s EnableMfaResponse) String() string {
	return tea.Prettify(s)
}

func (s EnableMfaResponse) GoString() string {
	return s.String()
}

func (s *EnableMfaResponse) SetReqMsgId(v string) *EnableMfaResponse {
	s.ReqMsgId = &v
	return s
}

func (s *EnableMfaResponse) SetResultCode(v string) *EnableMfaResponse {
	s.ResultCode = &v
	return s
}

func (s *EnableMfaResponse) SetResultMsg(v string) *EnableMfaResponse {
	s.ResultMsg = &v
	return s
}

type DisableMfaRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 用户 id
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
	// 验证码
	VerificationCode *int64 `json:"verification_code,omitempty" xml:"verification_code,omitempty"`
}

func (s DisableMfaRequest) String() string {
	return tea.Prettify(s)
}

func (s DisableMfaRequest) GoString() string {
	return s.String()
}

func (s *DisableMfaRequest) SetAuthToken(v string) *DisableMfaRequest {
	s.AuthToken = &v
	return s
}

func (s *DisableMfaRequest) SetUserId(v string) *DisableMfaRequest {
	s.UserId = &v
	return s
}

func (s *DisableMfaRequest) SetVerificationCode(v int64) *DisableMfaRequest {
	s.VerificationCode = &v
	return s
}

type DisableMfaResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s DisableMfaResponse) String() string {
	return tea.Prettify(s)
}

func (s DisableMfaResponse) GoString() string {
	return s.String()
}

func (s *DisableMfaResponse) SetReqMsgId(v string) *DisableMfaResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DisableMfaResponse) SetResultCode(v string) *DisableMfaResponse {
	s.ResultCode = &v
	return s
}

func (s *DisableMfaResponse) SetResultMsg(v string) *DisableMfaResponse {
	s.ResultMsg = &v
	return s
}

type InitMfaRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 用户 id
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
}

func (s InitMfaRequest) String() string {
	return tea.Prettify(s)
}

func (s InitMfaRequest) GoString() string {
	return s.String()
}

func (s *InitMfaRequest) SetAuthToken(v string) *InitMfaRequest {
	s.AuthToken = &v
	return s
}

func (s *InitMfaRequest) SetUserId(v string) *InitMfaRequest {
	s.UserId = &v
	return s
}

type InitMfaResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 密钥
	SecretKey *string `json:"secret_key,omitempty" xml:"secret_key,omitempty"`
}

func (s InitMfaResponse) String() string {
	return tea.Prettify(s)
}

func (s InitMfaResponse) GoString() string {
	return s.String()
}

func (s *InitMfaResponse) SetReqMsgId(v string) *InitMfaResponse {
	s.ReqMsgId = &v
	return s
}

func (s *InitMfaResponse) SetResultCode(v string) *InitMfaResponse {
	s.ResultCode = &v
	return s
}

func (s *InitMfaResponse) SetResultMsg(v string) *InitMfaResponse {
	s.ResultMsg = &v
	return s
}

func (s *InitMfaResponse) SetSecretKey(v string) *InitMfaResponse {
	s.SecretKey = &v
	return s
}

type VerifyMfaRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 用户 id
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
	// 验证码
	VerificationCode *int64 `json:"verification_code,omitempty" xml:"verification_code,omitempty" require:"true"`
}

func (s VerifyMfaRequest) String() string {
	return tea.Prettify(s)
}

func (s VerifyMfaRequest) GoString() string {
	return s.String()
}

func (s *VerifyMfaRequest) SetAuthToken(v string) *VerifyMfaRequest {
	s.AuthToken = &v
	return s
}

func (s *VerifyMfaRequest) SetUserId(v string) *VerifyMfaRequest {
	s.UserId = &v
	return s
}

func (s *VerifyMfaRequest) SetVerificationCode(v int64) *VerifyMfaRequest {
	s.VerificationCode = &v
	return s
}

type VerifyMfaResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 校验结果
	Result *bool `json:"result,omitempty" xml:"result,omitempty"`
}

func (s VerifyMfaResponse) String() string {
	return tea.Prettify(s)
}

func (s VerifyMfaResponse) GoString() string {
	return s.String()
}

func (s *VerifyMfaResponse) SetReqMsgId(v string) *VerifyMfaResponse {
	s.ReqMsgId = &v
	return s
}

func (s *VerifyMfaResponse) SetResultCode(v string) *VerifyMfaResponse {
	s.ResultCode = &v
	return s
}

func (s *VerifyMfaResponse) SetResultMsg(v string) *VerifyMfaResponse {
	s.ResultMsg = &v
	return s
}

func (s *VerifyMfaResponse) SetResult(v bool) *VerifyMfaResponse {
	s.Result = &v
	return s
}

type GetMfaRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 用户 id
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
}

func (s GetMfaRequest) String() string {
	return tea.Prettify(s)
}

func (s GetMfaRequest) GoString() string {
	return s.String()
}

func (s *GetMfaRequest) SetAuthToken(v string) *GetMfaRequest {
	s.AuthToken = &v
	return s
}

func (s *GetMfaRequest) SetUserId(v string) *GetMfaRequest {
	s.UserId = &v
	return s
}

type GetMfaResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 用户 id
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty"`
	// MFA状态, 取值范围：ENABLED, DISABLED
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 密钥
	SecretKey *string `json:"secret_key,omitempty" xml:"secret_key,omitempty"`
	// 最后一次密钥生成时间
	LastGeneratedTime *string `json:"last_generated_time,omitempty" xml:"last_generated_time,omitempty"`
	// (校验失败时)重试校验的次数
	VerifyAttempts *int64 `json:"verify_attempts,omitempty" xml:"verify_attempts,omitempty"`
	// 第一次校验失败时间
	FirstFailureTime *string `json:"first_failure_time,omitempty" xml:"first_failure_time,omitempty"`
}

func (s GetMfaResponse) String() string {
	return tea.Prettify(s)
}

func (s GetMfaResponse) GoString() string {
	return s.String()
}

func (s *GetMfaResponse) SetReqMsgId(v string) *GetMfaResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetMfaResponse) SetResultCode(v string) *GetMfaResponse {
	s.ResultCode = &v
	return s
}

func (s *GetMfaResponse) SetResultMsg(v string) *GetMfaResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetMfaResponse) SetUserId(v string) *GetMfaResponse {
	s.UserId = &v
	return s
}

func (s *GetMfaResponse) SetStatus(v string) *GetMfaResponse {
	s.Status = &v
	return s
}

func (s *GetMfaResponse) SetSecretKey(v string) *GetMfaResponse {
	s.SecretKey = &v
	return s
}

func (s *GetMfaResponse) SetLastGeneratedTime(v string) *GetMfaResponse {
	s.LastGeneratedTime = &v
	return s
}

func (s *GetMfaResponse) SetVerifyAttempts(v int64) *GetMfaResponse {
	s.VerifyAttempts = &v
	return s
}

func (s *GetMfaResponse) SetFirstFailureTime(v string) *GetMfaResponse {
	s.FirstFailureTime = &v
	return s
}

type UpdateOperatorPasswordRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 登录名
	LoginName *string `json:"login_name,omitempty" xml:"login_name,omitempty" require:"true"`
	// 加密过的新密码值，使用AccessSecret进行3DES加密
	NewEncryptedPassword *string `json:"new_encrypted_password,omitempty" xml:"new_encrypted_password,omitempty" require:"true"`
	// 加密过的旧密码值，使用AccessSecret进行DES加密
	OldEncryptedPassword *string `json:"old_encrypted_password,omitempty" xml:"old_encrypted_password,omitempty" require:"true"`
}

func (s UpdateOperatorPasswordRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateOperatorPasswordRequest) GoString() string {
	return s.String()
}

func (s *UpdateOperatorPasswordRequest) SetAuthToken(v string) *UpdateOperatorPasswordRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateOperatorPasswordRequest) SetLoginName(v string) *UpdateOperatorPasswordRequest {
	s.LoginName = &v
	return s
}

func (s *UpdateOperatorPasswordRequest) SetNewEncryptedPassword(v string) *UpdateOperatorPasswordRequest {
	s.NewEncryptedPassword = &v
	return s
}

func (s *UpdateOperatorPasswordRequest) SetOldEncryptedPassword(v string) *UpdateOperatorPasswordRequest {
	s.OldEncryptedPassword = &v
	return s
}

type UpdateOperatorPasswordResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s UpdateOperatorPasswordResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateOperatorPasswordResponse) GoString() string {
	return s.String()
}

func (s *UpdateOperatorPasswordResponse) SetReqMsgId(v string) *UpdateOperatorPasswordResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateOperatorPasswordResponse) SetResultCode(v string) *UpdateOperatorPasswordResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateOperatorPasswordResponse) SetResultMsg(v string) *UpdateOperatorPasswordResponse {
	s.ResultMsg = &v
	return s
}

type ResetOperatorPasswordRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 登录名
	LoginName *string `json:"login_name,omitempty" xml:"login_name,omitempty" require:"true"`
	// 加密过的新密码值，使用AccessSecret进行3DES加密
	NewEncryptedPassword *string `json:"new_encrypted_password,omitempty" xml:"new_encrypted_password,omitempty" require:"true"`
	// 登录凭证状态，取值范围：NORMAL, EXPIRED
	//
	// 默认为 NORMAL，设为 EXPIRED 用户登录时会要求重置密码
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
}

func (s ResetOperatorPasswordRequest) String() string {
	return tea.Prettify(s)
}

func (s ResetOperatorPasswordRequest) GoString() string {
	return s.String()
}

func (s *ResetOperatorPasswordRequest) SetAuthToken(v string) *ResetOperatorPasswordRequest {
	s.AuthToken = &v
	return s
}

func (s *ResetOperatorPasswordRequest) SetLoginName(v string) *ResetOperatorPasswordRequest {
	s.LoginName = &v
	return s
}

func (s *ResetOperatorPasswordRequest) SetNewEncryptedPassword(v string) *ResetOperatorPasswordRequest {
	s.NewEncryptedPassword = &v
	return s
}

func (s *ResetOperatorPasswordRequest) SetStatus(v string) *ResetOperatorPasswordRequest {
	s.Status = &v
	return s
}

type ResetOperatorPasswordResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s ResetOperatorPasswordResponse) String() string {
	return tea.Prettify(s)
}

func (s ResetOperatorPasswordResponse) GoString() string {
	return s.String()
}

func (s *ResetOperatorPasswordResponse) SetReqMsgId(v string) *ResetOperatorPasswordResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ResetOperatorPasswordResponse) SetResultCode(v string) *ResetOperatorPasswordResponse {
	s.ResultCode = &v
	return s
}

func (s *ResetOperatorPasswordResponse) SetResultMsg(v string) *ResetOperatorPasswordResponse {
	s.ResultMsg = &v
	return s
}

type BatchqueryOperatorRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 用户id列表
	OperatorIds []*string `json:"operator_ids,omitempty" xml:"operator_ids,omitempty" type:"Repeated"`
}

func (s BatchqueryOperatorRequest) String() string {
	return tea.Prettify(s)
}

func (s BatchqueryOperatorRequest) GoString() string {
	return s.String()
}

func (s *BatchqueryOperatorRequest) SetAuthToken(v string) *BatchqueryOperatorRequest {
	s.AuthToken = &v
	return s
}

func (s *BatchqueryOperatorRequest) SetOperatorIds(v []*string) *BatchqueryOperatorRequest {
	s.OperatorIds = v
	return s
}

type BatchqueryOperatorResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 操作员列表
	Operators []*Operator `json:"operators,omitempty" xml:"operators,omitempty" type:"Repeated"`
}

func (s BatchqueryOperatorResponse) String() string {
	return tea.Prettify(s)
}

func (s BatchqueryOperatorResponse) GoString() string {
	return s.String()
}

func (s *BatchqueryOperatorResponse) SetReqMsgId(v string) *BatchqueryOperatorResponse {
	s.ReqMsgId = &v
	return s
}

func (s *BatchqueryOperatorResponse) SetResultCode(v string) *BatchqueryOperatorResponse {
	s.ResultCode = &v
	return s
}

func (s *BatchqueryOperatorResponse) SetResultMsg(v string) *BatchqueryOperatorResponse {
	s.ResultMsg = &v
	return s
}

func (s *BatchqueryOperatorResponse) SetOperators(v []*Operator) *BatchqueryOperatorResponse {
	s.Operators = v
	return s
}

type PushOperationRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// {产品}.{资源}.{子资源}.{操作}
	OperationCode *string `json:"operation_code,omitempty" xml:"operation_code,omitempty" require:"true"`
	// 操作参数
	Params *string `json:"params,omitempty" xml:"params,omitempty" require:"true"`
	// 可用区域信息，非必填
	Region *string `json:"region,omitempty" xml:"region,omitempty"`
	// 资源ID
	ResourceId *string `json:"resource_id,omitempty" xml:"resource_id,omitempty"`
	// 资源类型
	ResourceType *string `json:"resource_type,omitempty" xml:"resource_type,omitempty"`
	// 相应结果
	Response *string `json:"response,omitempty" xml:"response,omitempty"`
	// 操作来源，由接入方上报自身系统host
	Source *string `json:"source,omitempty" xml:"source,omitempty"`
	// 操作来源IP，由接入方上报
	SourceIpAddress *string `json:"source_ip_address,omitempty" xml:"source_ip_address,omitempty"`
	// 触发时间
	Time *string `json:"time,omitempty" xml:"time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// TraceId用于事件追踪
	TraceId *string `json:"trace_id,omitempty" xml:"trace_id,omitempty"`
	// agent信息
	UserAgent *string `json:"user_agent,omitempty" xml:"user_agent,omitempty"`
	// 用户ID
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
	// 租户8位ID
	UserTenant *string `json:"user_tenant,omitempty" xml:"user_tenant,omitempty" require:"true"`
}

func (s PushOperationRequest) String() string {
	return tea.Prettify(s)
}

func (s PushOperationRequest) GoString() string {
	return s.String()
}

func (s *PushOperationRequest) SetAuthToken(v string) *PushOperationRequest {
	s.AuthToken = &v
	return s
}

func (s *PushOperationRequest) SetOperationCode(v string) *PushOperationRequest {
	s.OperationCode = &v
	return s
}

func (s *PushOperationRequest) SetParams(v string) *PushOperationRequest {
	s.Params = &v
	return s
}

func (s *PushOperationRequest) SetRegion(v string) *PushOperationRequest {
	s.Region = &v
	return s
}

func (s *PushOperationRequest) SetResourceId(v string) *PushOperationRequest {
	s.ResourceId = &v
	return s
}

func (s *PushOperationRequest) SetResourceType(v string) *PushOperationRequest {
	s.ResourceType = &v
	return s
}

func (s *PushOperationRequest) SetResponse(v string) *PushOperationRequest {
	s.Response = &v
	return s
}

func (s *PushOperationRequest) SetSource(v string) *PushOperationRequest {
	s.Source = &v
	return s
}

func (s *PushOperationRequest) SetSourceIpAddress(v string) *PushOperationRequest {
	s.SourceIpAddress = &v
	return s
}

func (s *PushOperationRequest) SetTime(v string) *PushOperationRequest {
	s.Time = &v
	return s
}

func (s *PushOperationRequest) SetTraceId(v string) *PushOperationRequest {
	s.TraceId = &v
	return s
}

func (s *PushOperationRequest) SetUserAgent(v string) *PushOperationRequest {
	s.UserAgent = &v
	return s
}

func (s *PushOperationRequest) SetUserId(v string) *PushOperationRequest {
	s.UserId = &v
	return s
}

func (s *PushOperationRequest) SetUserTenant(v string) *PushOperationRequest {
	s.UserTenant = &v
	return s
}

type PushOperationResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 事件唯一ID
	UniqueId *string `json:"unique_id,omitempty" xml:"unique_id,omitempty"`
}

func (s PushOperationResponse) String() string {
	return tea.Prettify(s)
}

func (s PushOperationResponse) GoString() string {
	return s.String()
}

func (s *PushOperationResponse) SetReqMsgId(v string) *PushOperationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PushOperationResponse) SetResultCode(v string) *PushOperationResponse {
	s.ResultCode = &v
	return s
}

func (s *PushOperationResponse) SetResultMsg(v string) *PushOperationResponse {
	s.ResultMsg = &v
	return s
}

func (s *PushOperationResponse) SetUniqueId(v string) *PushOperationResponse {
	s.UniqueId = &v
	return s
}

type QueryOperationtypeRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 产品码
	Product *string `json:"product,omitempty" xml:"product,omitempty" require:"true"`
	// 来源信息
	Source *string `json:"source,omitempty" xml:"source,omitempty"`
}

func (s QueryOperationtypeRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryOperationtypeRequest) GoString() string {
	return s.String()
}

func (s *QueryOperationtypeRequest) SetAuthToken(v string) *QueryOperationtypeRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryOperationtypeRequest) SetProduct(v string) *QueryOperationtypeRequest {
	s.Product = &v
	return s
}

func (s *QueryOperationtypeRequest) SetSource(v string) *QueryOperationtypeRequest {
	s.Source = &v
	return s
}

type QueryOperationtypeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 操作类型列表
	OperationTypes []*OperationType `json:"operation_types,omitempty" xml:"operation_types,omitempty" type:"Repeated"`
}

func (s QueryOperationtypeResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryOperationtypeResponse) GoString() string {
	return s.String()
}

func (s *QueryOperationtypeResponse) SetReqMsgId(v string) *QueryOperationtypeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryOperationtypeResponse) SetResultCode(v string) *QueryOperationtypeResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryOperationtypeResponse) SetResultMsg(v string) *QueryOperationtypeResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryOperationtypeResponse) SetOperationTypes(v []*OperationType) *QueryOperationtypeResponse {
	s.OperationTypes = v
	return s
}

type GetOperationtypeRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 操作类型名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
}

func (s GetOperationtypeRequest) String() string {
	return tea.Prettify(s)
}

func (s GetOperationtypeRequest) GoString() string {
	return s.String()
}

func (s *GetOperationtypeRequest) SetAuthToken(v string) *GetOperationtypeRequest {
	s.AuthToken = &v
	return s
}

func (s *GetOperationtypeRequest) SetName(v string) *GetOperationtypeRequest {
	s.Name = &v
	return s
}

type GetOperationtypeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 操作类型
	Data *OperationType `json:"data,omitempty" xml:"data,omitempty"`
}

func (s GetOperationtypeResponse) String() string {
	return tea.Prettify(s)
}

func (s GetOperationtypeResponse) GoString() string {
	return s.String()
}

func (s *GetOperationtypeResponse) SetReqMsgId(v string) *GetOperationtypeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetOperationtypeResponse) SetResultCode(v string) *GetOperationtypeResponse {
	s.ResultCode = &v
	return s
}

func (s *GetOperationtypeResponse) SetResultMsg(v string) *GetOperationtypeResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetOperationtypeResponse) SetData(v *OperationType) *GetOperationtypeResponse {
	s.Data = v
	return s
}

type AddTenantMemberRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 操作员唯一id
	OperatorId *string `json:"operator_id,omitempty" xml:"operator_id,omitempty" require:"true"`
}

func (s AddTenantMemberRequest) String() string {
	return tea.Prettify(s)
}

func (s AddTenantMemberRequest) GoString() string {
	return s.String()
}

func (s *AddTenantMemberRequest) SetAuthToken(v string) *AddTenantMemberRequest {
	s.AuthToken = &v
	return s
}

func (s *AddTenantMemberRequest) SetOperatorId(v string) *AddTenantMemberRequest {
	s.OperatorId = &v
	return s
}

type AddTenantMemberResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// Accessor关联的AccessKey
	AccessKey *string `json:"access_key,omitempty" xml:"access_key,omitempty"`
	// Accessor关联的AccessKey的密钥
	AccessSecret *string `json:"access_secret,omitempty" xml:"access_secret,omitempty"`
}

func (s AddTenantMemberResponse) String() string {
	return tea.Prettify(s)
}

func (s AddTenantMemberResponse) GoString() string {
	return s.String()
}

func (s *AddTenantMemberResponse) SetReqMsgId(v string) *AddTenantMemberResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AddTenantMemberResponse) SetResultCode(v string) *AddTenantMemberResponse {
	s.ResultCode = &v
	return s
}

func (s *AddTenantMemberResponse) SetResultMsg(v string) *AddTenantMemberResponse {
	s.ResultMsg = &v
	return s
}

func (s *AddTenantMemberResponse) SetAccessKey(v string) *AddTenantMemberResponse {
	s.AccessKey = &v
	return s
}

func (s *AddTenantMemberResponse) SetAccessSecret(v string) *AddTenantMemberResponse {
	s.AccessSecret = &v
	return s
}

type GetOperatorLogintokenRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
}

func (s GetOperatorLogintokenRequest) String() string {
	return tea.Prettify(s)
}

func (s GetOperatorLogintokenRequest) GoString() string {
	return s.String()
}

func (s *GetOperatorLogintokenRequest) SetAuthToken(v string) *GetOperatorLogintokenRequest {
	s.AuthToken = &v
	return s
}

type GetOperatorLogintokenResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 一次性登录认证 token
	LoginToken *string `json:"login_token,omitempty" xml:"login_token,omitempty"`
}

func (s GetOperatorLogintokenResponse) String() string {
	return tea.Prettify(s)
}

func (s GetOperatorLogintokenResponse) GoString() string {
	return s.String()
}

func (s *GetOperatorLogintokenResponse) SetReqMsgId(v string) *GetOperatorLogintokenResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetOperatorLogintokenResponse) SetResultCode(v string) *GetOperatorLogintokenResponse {
	s.ResultCode = &v
	return s
}

func (s *GetOperatorLogintokenResponse) SetResultMsg(v string) *GetOperatorLogintokenResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetOperatorLogintokenResponse) SetLoginToken(v string) *GetOperatorLogintokenResponse {
	s.LoginToken = &v
	return s
}

type ApplyTrustloginTokenRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 用户ID
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
	// 系统来源
	SourceSystem *string `json:"source_system,omitempty" xml:"source_system,omitempty" require:"true"`
	// 登录账号
	LoginName *string `json:"login_name,omitempty" xml:"login_name,omitempty"`
}

func (s ApplyTrustloginTokenRequest) String() string {
	return tea.Prettify(s)
}

func (s ApplyTrustloginTokenRequest) GoString() string {
	return s.String()
}

func (s *ApplyTrustloginTokenRequest) SetAuthToken(v string) *ApplyTrustloginTokenRequest {
	s.AuthToken = &v
	return s
}

func (s *ApplyTrustloginTokenRequest) SetUserId(v string) *ApplyTrustloginTokenRequest {
	s.UserId = &v
	return s
}

func (s *ApplyTrustloginTokenRequest) SetSourceSystem(v string) *ApplyTrustloginTokenRequest {
	s.SourceSystem = &v
	return s
}

func (s *ApplyTrustloginTokenRequest) SetLoginName(v string) *ApplyTrustloginTokenRequest {
	s.LoginName = &v
	return s
}

type ApplyTrustloginTokenResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 用于登录的token
	AccessToken *string `json:"access_token,omitempty" xml:"access_token,omitempty"`
	// 用户ID
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty"`
}

func (s ApplyTrustloginTokenResponse) String() string {
	return tea.Prettify(s)
}

func (s ApplyTrustloginTokenResponse) GoString() string {
	return s.String()
}

func (s *ApplyTrustloginTokenResponse) SetReqMsgId(v string) *ApplyTrustloginTokenResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ApplyTrustloginTokenResponse) SetResultCode(v string) *ApplyTrustloginTokenResponse {
	s.ResultCode = &v
	return s
}

func (s *ApplyTrustloginTokenResponse) SetResultMsg(v string) *ApplyTrustloginTokenResponse {
	s.ResultMsg = &v
	return s
}

func (s *ApplyTrustloginTokenResponse) SetAccessToken(v string) *ApplyTrustloginTokenResponse {
	s.AccessToken = &v
	return s
}

func (s *ApplyTrustloginTokenResponse) SetUserId(v string) *ApplyTrustloginTokenResponse {
	s.UserId = &v
	return s
}

type VerifyTrustloginTokenRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 用户ID
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
	// 系统来源
	SourceSystem *string `json:"source_system,omitempty" xml:"source_system,omitempty" require:"true"`
	// 申请免密登录时获取的token
	AccessToken *string `json:"access_token,omitempty" xml:"access_token,omitempty" require:"true"`
}

func (s VerifyTrustloginTokenRequest) String() string {
	return tea.Prettify(s)
}

func (s VerifyTrustloginTokenRequest) GoString() string {
	return s.String()
}

func (s *VerifyTrustloginTokenRequest) SetAuthToken(v string) *VerifyTrustloginTokenRequest {
	s.AuthToken = &v
	return s
}

func (s *VerifyTrustloginTokenRequest) SetUserId(v string) *VerifyTrustloginTokenRequest {
	s.UserId = &v
	return s
}

func (s *VerifyTrustloginTokenRequest) SetSourceSystem(v string) *VerifyTrustloginTokenRequest {
	s.SourceSystem = &v
	return s
}

func (s *VerifyTrustloginTokenRequest) SetAccessToken(v string) *VerifyTrustloginTokenRequest {
	s.AccessToken = &v
	return s
}

type VerifyTrustloginTokenResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 用户ID
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty"`
	// 验证结果，valid有效，invalid无效
	Result *string `json:"result,omitempty" xml:"result,omitempty"`
}

func (s VerifyTrustloginTokenResponse) String() string {
	return tea.Prettify(s)
}

func (s VerifyTrustloginTokenResponse) GoString() string {
	return s.String()
}

func (s *VerifyTrustloginTokenResponse) SetReqMsgId(v string) *VerifyTrustloginTokenResponse {
	s.ReqMsgId = &v
	return s
}

func (s *VerifyTrustloginTokenResponse) SetResultCode(v string) *VerifyTrustloginTokenResponse {
	s.ResultCode = &v
	return s
}

func (s *VerifyTrustloginTokenResponse) SetResultMsg(v string) *VerifyTrustloginTokenResponse {
	s.ResultMsg = &v
	return s
}

func (s *VerifyTrustloginTokenResponse) SetUserId(v string) *VerifyTrustloginTokenResponse {
	s.UserId = &v
	return s
}

func (s *VerifyTrustloginTokenResponse) SetResult(v string) *VerifyTrustloginTokenResponse {
	s.Result = &v
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
				"sdk_version":      tea.String("3.13.1"),
				"_prod_code":       tea.String("IAM"),
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
 * Description: 获取Role
 * Summary: 获取角色
 */
func (client *Client) GetRole(request *GetRoleRequest) (_result *GetRoleResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetRoleResponse{}
	_body, _err := client.GetRoleEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取Role
 * Summary: 获取角色
 */
func (client *Client) GetRoleEx(request *GetRoleRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetRoleResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetRoleResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.iam.role.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询授权对象在指定租户下的所有授权策略
 * Summary: 查询授权
 */
func (client *Client) QueryPolicy(request *QueryPolicyRequest) (_result *QueryPolicyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryPolicyResponse{}
	_body, _err := client.QueryPolicyEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询授权对象在指定租户下的所有授权策略
 * Summary: 查询授权
 */
func (client *Client) QueryPolicyEx(request *QueryPolicyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryPolicyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryPolicyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.iam.policy.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询租户下的权限组
 * Summary: 查询授权组
 */
func (client *Client) QueryGroup(request *QueryGroupRequest) (_result *QueryGroupResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryGroupResponse{}
	_body, _err := client.QueryGroupEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询租户下的权限组
 * Summary: 查询授权组
 */
func (client *Client) QueryGroupEx(request *QueryGroupRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryGroupResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryGroupResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.iam.group.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建授权策略
 * Summary: 创建授权策略
 */
func (client *Client) CreatePolicy(request *CreatePolicyRequest) (_result *CreatePolicyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreatePolicyResponse{}
	_body, _err := client.CreatePolicyEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建授权策略
 * Summary: 创建授权策略
 */
func (client *Client) CreatePolicyEx(request *CreatePolicyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreatePolicyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreatePolicyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.iam.policy.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 删除授权策略
 * Summary: 删除授权策略
 */
func (client *Client) DeletePolicy(request *DeletePolicyRequest) (_result *DeletePolicyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DeletePolicyResponse{}
	_body, _err := client.DeletePolicyEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 删除授权策略
 * Summary: 删除授权策略
 */
func (client *Client) DeletePolicyEx(request *DeletePolicyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DeletePolicyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DeletePolicyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.iam.policy.delete"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 授权策略赋予某个对象
 * Summary: 添加授权
 */
func (client *Client) AttachPolicy(request *AttachPolicyRequest) (_result *AttachPolicyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AttachPolicyResponse{}
	_body, _err := client.AttachPolicyEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 授权策略赋予某个对象
 * Summary: 添加授权
 */
func (client *Client) AttachPolicyEx(request *AttachPolicyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AttachPolicyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AttachPolicyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.iam.policy.attach"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 解除授权对象的授权策略
 * Summary: 解除授权
 */
func (client *Client) DetachPolicy(request *DetachPolicyRequest) (_result *DetachPolicyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DetachPolicyResponse{}
	_body, _err := client.DetachPolicyEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 解除授权对象的授权策略
 * Summary: 解除授权
 */
func (client *Client) DetachPolicyEx(request *DetachPolicyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DetachPolicyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DetachPolicyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.iam.policy.detach"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询授权对象在指定租户下的所有授权策略,如果是操作员，包含其所在组的授权
 * Summary: 查询授权
 */
func (client *Client) ListPolicy(request *ListPolicyRequest) (_result *ListPolicyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListPolicyResponse{}
	_body, _err := client.ListPolicyEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询授权对象在指定租户下的所有授权策略,如果是操作员，包含其所在组的授权
 * Summary: 查询授权
 */
func (client *Client) ListPolicyEx(request *ListPolicyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListPolicyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListPolicyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.iam.policy.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 授权对象的权限校验
 * Summary: 校验权限
 */
func (client *Client) JudgeAuthority(request *JudgeAuthorityRequest) (_result *JudgeAuthorityResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &JudgeAuthorityResponse{}
	_body, _err := client.JudgeAuthorityEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 授权对象的权限校验
 * Summary: 校验权限
 */
func (client *Client) JudgeAuthorityEx(request *JudgeAuthorityRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *JudgeAuthorityResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &JudgeAuthorityResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.iam.authority.judge"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 添加产品操作元数据
 * Summary: 创建产品操作点
 */
func (client *Client) CreateProductAction(request *CreateProductActionRequest) (_result *CreateProductActionResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateProductActionResponse{}
	_body, _err := client.CreateProductActionEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 添加产品操作元数据
 * Summary: 创建产品操作点
 */
func (client *Client) CreateProductActionEx(request *CreateProductActionRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateProductActionResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateProductActionResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.iam.product.action.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 校验token合法性
 * Summary: 校验token合法性
 */
func (client *Client) VerifyOauthToken(request *VerifyOauthTokenRequest) (_result *VerifyOauthTokenResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &VerifyOauthTokenResponse{}
	_body, _err := client.VerifyOauthTokenEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 校验token合法性
 * Summary: 校验token合法性
 */
func (client *Client) VerifyOauthTokenEx(request *VerifyOauthTokenRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *VerifyOauthTokenResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &VerifyOauthTokenResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.iam.oauth.token.verify"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 校验中枢登录态合法性
 * Summary: 校验中枢登录态合法性
 */
func (client *Client) VerifySessionToken(request *VerifySessionTokenRequest) (_result *VerifySessionTokenResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &VerifySessionTokenResponse{}
	_body, _err := client.VerifySessionTokenEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 校验中枢登录态合法性
 * Summary: 校验中枢登录态合法性
 */
func (client *Client) VerifySessionTokenEx(request *VerifySessionTokenRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *VerifySessionTokenResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &VerifySessionTokenResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.iam.session.token.verify"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取授予角色的操作员列表
 * Summary: 授予角色的操作员列表
 */
func (client *Client) ListRoleOperator(request *ListRoleOperatorRequest) (_result *ListRoleOperatorResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListRoleOperatorResponse{}
	_body, _err := client.ListRoleOperatorEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取授予角色的操作员列表
 * Summary: 授予角色的操作员列表
 */
func (client *Client) ListRoleOperatorEx(request *ListRoleOperatorRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListRoleOperatorResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListRoleOperatorResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.iam.role.operator.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 申请信任登录URL
 * Summary: 申请信任登录URL
 */
func (client *Client) ApplyTrustloginUrl(request *ApplyTrustloginUrlRequest) (_result *ApplyTrustloginUrlResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ApplyTrustloginUrlResponse{}
	_body, _err := client.ApplyTrustloginUrlEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 申请信任登录URL
 * Summary: 申请信任登录URL
 */
func (client *Client) ApplyTrustloginUrlEx(request *ApplyTrustloginUrlRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ApplyTrustloginUrlResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ApplyTrustloginUrlResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.iam.trustlogin.url.apply"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 扮演虚拟身份，获取安全令牌
 * Summary: 扮演虚拟身份，获取安全令牌
 */
func (client *Client) AssumeSts(request *AssumeStsRequest) (_result *AssumeStsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AssumeStsResponse{}
	_body, _err := client.AssumeStsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 扮演虚拟身份，获取安全令牌
 * Summary: 扮演虚拟身份，获取安全令牌
 */
func (client *Client) AssumeStsEx(request *AssumeStsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AssumeStsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AssumeStsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.iam.sts.assume"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建虚拟身份
 * Summary: 创建虚拟身份
 */
func (client *Client) CreateStsActor(request *CreateStsActorRequest) (_result *CreateStsActorResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateStsActorResponse{}
	_body, _err := client.CreateStsActorEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建虚拟身份
 * Summary: 创建虚拟身份
 */
func (client *Client) CreateStsActorEx(request *CreateStsActorRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateStsActorResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateStsActorResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.iam.sts.actor.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 删除虚拟身份
 * Summary: 删除虚拟身份
 */
func (client *Client) DeleteStsActor(request *DeleteStsActorRequest) (_result *DeleteStsActorResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DeleteStsActorResponse{}
	_body, _err := client.DeleteStsActorEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 删除虚拟身份
 * Summary: 删除虚拟身份
 */
func (client *Client) DeleteStsActorEx(request *DeleteStsActorRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DeleteStsActorResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DeleteStsActorResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.iam.sts.actor.delete"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 唯一查询虚拟身份
 * Summary: 唯一查询虚拟身份
 */
func (client *Client) GetStsActor(request *GetStsActorRequest) (_result *GetStsActorResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetStsActorResponse{}
	_body, _err := client.GetStsActorEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 唯一查询虚拟身份
 * Summary: 唯一查询虚拟身份
 */
func (client *Client) GetStsActorEx(request *GetStsActorRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetStsActorResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetStsActorResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.iam.sts.actor.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取租户内的虚拟身份
 * Summary: 获取租户内的虚拟身份
 */
func (client *Client) ListStsActor(request *ListStsActorRequest) (_result *ListStsActorResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListStsActorResponse{}
	_body, _err := client.ListStsActorEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取租户内的虚拟身份
 * Summary: 获取租户内的虚拟身份
 */
func (client *Client) ListStsActorEx(request *ListStsActorRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListStsActorResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListStsActorResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.iam.sts.actor.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 更新虚拟身份
 * Summary: 更新虚拟身份
 */
func (client *Client) UpdateStsActor(request *UpdateStsActorRequest) (_result *UpdateStsActorResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateStsActorResponse{}
	_body, _err := client.UpdateStsActorEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 更新虚拟身份
 * Summary: 更新虚拟身份
 */
func (client *Client) UpdateStsActorEx(request *UpdateStsActorRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateStsActorResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateStsActorResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.iam.sts.actor.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询租户内可见的角色
 * Summary: 角色查询
 */
func (client *Client) QueryRole(request *QueryRoleRequest) (_result *QueryRoleResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryRoleResponse{}
	_body, _err := client.QueryRoleEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询租户内可见的角色
 * Summary: 角色查询
 */
func (client *Client) QueryRoleEx(request *QueryRoleRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryRoleResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryRoleResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.iam.role.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取租户Iaas账号基本信息
 * Summary: 获取租户Iaas账号基本信息
 */
func (client *Client) GetIaasaccountBaseinfo(request *GetIaasaccountBaseinfoRequest) (_result *GetIaasaccountBaseinfoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetIaasaccountBaseinfoResponse{}
	_body, _err := client.GetIaasaccountBaseinfoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取租户Iaas账号基本信息
 * Summary: 获取租户Iaas账号基本信息
 */
func (client *Client) GetIaasaccountBaseinfoEx(request *GetIaasaccountBaseinfoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetIaasaccountBaseinfoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetIaasaccountBaseinfoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.iam.iaasaccount.baseinfo.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 内部接口，用于校验密码是否正确，公有云环境只适用于操作员
 * Summary: 校验密码是否正确
 */
func (client *Client) VerifyPassword(request *VerifyPasswordRequest) (_result *VerifyPasswordResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &VerifyPasswordResponse{}
	_body, _err := client.VerifyPasswordEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 内部接口，用于校验密码是否正确，公有云环境只适用于操作员
 * Summary: 校验密码是否正确
 */
func (client *Client) VerifyPasswordEx(request *VerifyPasswordRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *VerifyPasswordResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &VerifyPasswordResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.iam.password.verify"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 更显操作员状态，NORMAL为正常状态，FROZEN为冻结状态，INACTIVE为未激活状态
 * Summary: 更新操作员状态
 */
func (client *Client) UpdateOperatorStatus(request *UpdateOperatorStatusRequest) (_result *UpdateOperatorStatusResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateOperatorStatusResponse{}
	_body, _err := client.UpdateOperatorStatusEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 更显操作员状态，NORMAL为正常状态，FROZEN为冻结状态，INACTIVE为未激活状态
 * Summary: 更新操作员状态
 */
func (client *Client) UpdateOperatorStatusEx(request *UpdateOperatorStatusRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateOperatorStatusResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateOperatorStatusResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.iam.operator.status.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 冻结操作员
 * Summary: 冻结操作员
 */
func (client *Client) FreezeOperator(request *FreezeOperatorRequest) (_result *FreezeOperatorResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &FreezeOperatorResponse{}
	_body, _err := client.FreezeOperatorEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 冻结操作员
 * Summary: 冻结操作员
 */
func (client *Client) FreezeOperatorEx(request *FreezeOperatorRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *FreezeOperatorResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &FreezeOperatorResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.iam.operator.freeze"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 解冻操作员
 * Summary: 解冻操作员
 */
func (client *Client) UnfreezeOperator(request *UnfreezeOperatorRequest) (_result *UnfreezeOperatorResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UnfreezeOperatorResponse{}
	_body, _err := client.UnfreezeOperatorEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 解冻操作员
 * Summary: 解冻操作员
 */
func (client *Client) UnfreezeOperatorEx(request *UnfreezeOperatorRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UnfreezeOperatorResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UnfreezeOperatorResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.iam.operator.unfreeze"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取主账号信息
 * Summary: 获取主账号信息
 */
func (client *Client) GetInternalMaster(request *GetInternalMasterRequest) (_result *GetInternalMasterResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetInternalMasterResponse{}
	_body, _err := client.GetInternalMasterEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取主账号信息
 * Summary: 获取主账号信息
 */
func (client *Client) GetInternalMasterEx(request *GetInternalMasterRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetInternalMasterResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetInternalMasterResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.iam.internal.master.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 公有云一方化场景下，获取用户信息，内部接口，专为一方化设计
 * Summary: 获取阿里云用户信息
 */
func (client *Client) GetAliyunUser(request *GetAliyunUserRequest) (_result *GetAliyunUserResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetAliyunUserResponse{}
	_body, _err := client.GetAliyunUserEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 公有云一方化场景下，获取用户信息，内部接口，专为一方化设计
 * Summary: 获取阿里云用户信息
 */
func (client *Client) GetAliyunUserEx(request *GetAliyunUserRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetAliyunUserResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetAliyunUserResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.iam.aliyun.user.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 阿里云RAM权限校验
 * Summary: 阿里云RAM权限校验
 */
func (client *Client) JudgeAliyunAuthority(request *JudgeAliyunAuthorityRequest) (_result *JudgeAliyunAuthorityResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &JudgeAliyunAuthorityResponse{}
	_body, _err := client.JudgeAliyunAuthorityEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 阿里云RAM权限校验
 * Summary: 阿里云RAM权限校验
 */
func (client *Client) JudgeAliyunAuthorityEx(request *JudgeAliyunAuthorityRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *JudgeAliyunAuthorityResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &JudgeAliyunAuthorityResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.iam.aliyun.authority.judge"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 根据登录态获取ak
 * Summary: 根据登录态获取ak
 */
func (client *Client) GetSessionAccessor(request *GetSessionAccessorRequest) (_result *GetSessionAccessorResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetSessionAccessorResponse{}
	_body, _err := client.GetSessionAccessorEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 根据登录态获取ak
 * Summary: 根据登录态获取ak
 */
func (client *Client) GetSessionAccessorEx(request *GetSessionAccessorRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetSessionAccessorResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetSessionAccessorResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.iam.session.accessor.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 更新密码
 * Summary: 更新密码
 */
func (client *Client) UpdatePassword(request *UpdatePasswordRequest) (_result *UpdatePasswordResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdatePasswordResponse{}
	_body, _err := client.UpdatePasswordEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 更新密码
 * Summary: 更新密码
 */
func (client *Client) UpdatePasswordEx(request *UpdatePasswordRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdatePasswordResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdatePasswordResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.iam.password.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 蚂蚁侧批量鉴权
 * Summary: 蚂蚁侧批量鉴权
 */
func (client *Client) JudgeMultiauthority(request *JudgeMultiauthorityRequest) (_result *JudgeMultiauthorityResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &JudgeMultiauthorityResponse{}
	_body, _err := client.JudgeMultiauthorityEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 蚂蚁侧批量鉴权
 * Summary: 蚂蚁侧批量鉴权
 */
func (client *Client) JudgeMultiauthorityEx(request *JudgeMultiauthorityRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *JudgeMultiauthorityResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &JudgeMultiauthorityResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.iam.multiauthority.judge"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 阿里云批量鉴权
 * Summary: 阿里云批量鉴权
 */
func (client *Client) JudgeAliyunMultiauthority(request *JudgeAliyunMultiauthorityRequest) (_result *JudgeAliyunMultiauthorityResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &JudgeAliyunMultiauthorityResponse{}
	_body, _err := client.JudgeAliyunMultiauthorityEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 阿里云批量鉴权
 * Summary: 阿里云批量鉴权
 */
func (client *Client) JudgeAliyunMultiauthorityEx(request *JudgeAliyunMultiauthorityRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *JudgeAliyunMultiauthorityResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &JudgeAliyunMultiauthorityResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.iam.aliyun.multiauthority.judge"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 辰霖
 * Summary: 获取当前AK关联的用户实体信息
 */
func (client *Client) GetAccessorCurrent(request *GetAccessorCurrentRequest) (_result *GetAccessorCurrentResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetAccessorCurrentResponse{}
	_body, _err := client.GetAccessorCurrentEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 辰霖
 * Summary: 获取当前AK关联的用户实体信息
 */
func (client *Client) GetAccessorCurrentEx(request *GetAccessorCurrentRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetAccessorCurrentResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetAccessorCurrentResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.iam.accessor.current.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取单个服务账号信息
 * Summary: 获取单个服务账号信息
 */
func (client *Client) GetServiceaccount(request *GetServiceaccountRequest) (_result *GetServiceaccountResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetServiceaccountResponse{}
	_body, _err := client.GetServiceaccountEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取单个服务账号信息
 * Summary: 获取单个服务账号信息
 */
func (client *Client) GetServiceaccountEx(request *GetServiceaccountRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetServiceaccountResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetServiceaccountResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.iam.serviceaccount.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建服务账号
 * Summary: 创建服务账号
 */
func (client *Client) CreateServiceaccount(request *CreateServiceaccountRequest) (_result *CreateServiceaccountResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateServiceaccountResponse{}
	_body, _err := client.CreateServiceaccountEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建服务账号
 * Summary: 创建服务账号
 */
func (client *Client) CreateServiceaccountEx(request *CreateServiceaccountRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateServiceaccountResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateServiceaccountResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.iam.serviceaccount.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 删除服务账号
 * Summary: 删除服务账号
 */
func (client *Client) DeleteServiceaccount(request *DeleteServiceaccountRequest) (_result *DeleteServiceaccountResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DeleteServiceaccountResponse{}
	_body, _err := client.DeleteServiceaccountEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 删除服务账号
 * Summary: 删除服务账号
 */
func (client *Client) DeleteServiceaccountEx(request *DeleteServiceaccountRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DeleteServiceaccountResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DeleteServiceaccountResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.iam.serviceaccount.delete"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 更新服务账号信息
 * Summary: 更新服务账号信息
 */
func (client *Client) UpdateServiceaccount(request *UpdateServiceaccountRequest) (_result *UpdateServiceaccountResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateServiceaccountResponse{}
	_body, _err := client.UpdateServiceaccountEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 更新服务账号信息
 * Summary: 更新服务账号信息
 */
func (client *Client) UpdateServiceaccountEx(request *UpdateServiceaccountRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateServiceaccountResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateServiceaccountResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.iam.serviceaccount.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 移除租户成员
 * Summary: 移除租户成员
 */
func (client *Client) RemoveTenantMember(request *RemoveTenantMemberRequest) (_result *RemoveTenantMemberResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &RemoveTenantMemberResponse{}
	_body, _err := client.RemoveTenantMemberEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 移除租户成员
 * Summary: 移除租户成员
 */
func (client *Client) RemoveTenantMemberEx(request *RemoveTenantMemberRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *RemoveTenantMemberResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &RemoveTenantMemberResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.iam.tenant.member.remove"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建成员组
 * Summary: 创建成员组
 */
func (client *Client) CreateGroup(request *CreateGroupRequest) (_result *CreateGroupResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateGroupResponse{}
	_body, _err := client.CreateGroupEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建成员组
 * Summary: 创建成员组
 */
func (client *Client) CreateGroupEx(request *CreateGroupRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateGroupResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateGroupResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.iam.group.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 删除成员组
 * Summary: 删除成员组
 */
func (client *Client) DeleteGroup(request *DeleteGroupRequest) (_result *DeleteGroupResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DeleteGroupResponse{}
	_body, _err := client.DeleteGroupEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 删除成员组
 * Summary: 删除成员组
 */
func (client *Client) DeleteGroupEx(request *DeleteGroupRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DeleteGroupResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DeleteGroupResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.iam.group.delete"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 更新成员组
 * Summary: 更新成员组
 */
func (client *Client) UpdateGroup(request *UpdateGroupRequest) (_result *UpdateGroupResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateGroupResponse{}
	_body, _err := client.UpdateGroupEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 更新成员组
 * Summary: 更新成员组
 */
func (client *Client) UpdateGroupEx(request *UpdateGroupRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateGroupResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateGroupResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.iam.group.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 添加成员组成员
 * Summary: 添加成员组成员
 */
func (client *Client) AddGroupMember(request *AddGroupMemberRequest) (_result *AddGroupMemberResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AddGroupMemberResponse{}
	_body, _err := client.AddGroupMemberEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 添加成员组成员
 * Summary: 添加成员组成员
 */
func (client *Client) AddGroupMemberEx(request *AddGroupMemberRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AddGroupMemberResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AddGroupMemberResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.iam.group.member.add"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 移除成员组成员
 * Summary: 移除成员组成员
 */
func (client *Client) RemoveGroupMember(request *RemoveGroupMemberRequest) (_result *RemoveGroupMemberResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &RemoveGroupMemberResponse{}
	_body, _err := client.RemoveGroupMemberEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 移除成员组成员
 * Summary: 移除成员组成员
 */
func (client *Client) RemoveGroupMemberEx(request *RemoveGroupMemberRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *RemoveGroupMemberResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &RemoveGroupMemberResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.iam.group.member.remove"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 成员组基本信息查询
 * Summary: 成员组基本信息查询
 */
func (client *Client) GetGroup(request *GetGroupRequest) (_result *GetGroupResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetGroupResponse{}
	_body, _err := client.GetGroupEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 成员组基本信息查询
 * Summary: 成员组基本信息查询
 */
func (client *Client) GetGroupEx(request *GetGroupRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetGroupResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetGroupResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.iam.group.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 成员组成员查询
 * Summary: 成员组成员查询
 */
func (client *Client) QueryGroupMember(request *QueryGroupMemberRequest) (_result *QueryGroupMemberResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryGroupMemberResponse{}
	_body, _err := client.QueryGroupMemberEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 成员组成员查询
 * Summary: 成员组成员查询
 */
func (client *Client) QueryGroupMemberEx(request *QueryGroupMemberRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryGroupMemberResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryGroupMemberResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.iam.group.member.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取用户所在成员组
 * Summary: 获取用户所在成员组
 */
func (client *Client) ListOperatorGroup(request *ListOperatorGroupRequest) (_result *ListOperatorGroupResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListOperatorGroupResponse{}
	_body, _err := client.ListOperatorGroupEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取用户所在成员组
 * Summary: 获取用户所在成员组
 */
func (client *Client) ListOperatorGroupEx(request *ListOperatorGroupRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListOperatorGroupResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListOperatorGroupResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.iam.operator.group.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 为角色添加权限码
 * Summary: 为角色添加权限码
 */
func (client *Client) AddRoleAction(request *AddRoleActionRequest) (_result *AddRoleActionResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AddRoleActionResponse{}
	_body, _err := client.AddRoleActionEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 为角色添加权限码
 * Summary: 为角色添加权限码
 */
func (client *Client) AddRoleActionEx(request *AddRoleActionRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AddRoleActionResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AddRoleActionResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.iam.role.action.add"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 移除角色权限
 * Summary: 移除角色权限
 */
func (client *Client) RemoveRoleAction(request *RemoveRoleActionRequest) (_result *RemoveRoleActionResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &RemoveRoleActionResponse{}
	_body, _err := client.RemoveRoleActionEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 移除角色权限
 * Summary: 移除角色权限
 */
func (client *Client) RemoveRoleActionEx(request *RemoveRoleActionRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *RemoveRoleActionResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &RemoveRoleActionResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.iam.role.action.remove"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建自定义角色
 * Summary: 创建自定义角色
 */
func (client *Client) CreateRole(request *CreateRoleRequest) (_result *CreateRoleResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateRoleResponse{}
	_body, _err := client.CreateRoleEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建自定义角色
 * Summary: 创建自定义角色
 */
func (client *Client) CreateRoleEx(request *CreateRoleRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateRoleResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateRoleResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.iam.role.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 删除角色
 * Summary: 删除角色
 */
func (client *Client) DeleteRole(request *DeleteRoleRequest) (_result *DeleteRoleResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DeleteRoleResponse{}
	_body, _err := client.DeleteRoleEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 删除角色
 * Summary: 删除角色
 */
func (client *Client) DeleteRoleEx(request *DeleteRoleRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DeleteRoleResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DeleteRoleResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.iam.role.delete"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 更新角色
 * Summary: 更新角色
 */
func (client *Client) UpdateRole(request *UpdateRoleRequest) (_result *UpdateRoleResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateRoleResponse{}
	_body, _err := client.UpdateRoleEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 更新角色
 * Summary: 更新角色
 */
func (client *Client) UpdateRoleEx(request *UpdateRoleRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateRoleResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateRoleResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.iam.role.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取单个部门信息
 * Summary: 获取单个部门信息
 */
func (client *Client) GetDepartment(request *GetDepartmentRequest) (_result *GetDepartmentResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetDepartmentResponse{}
	_body, _err := client.GetDepartmentEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取单个部门信息
 * Summary: 获取单个部门信息
 */
func (client *Client) GetDepartmentEx(request *GetDepartmentRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetDepartmentResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetDepartmentResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.iam.department.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建部门
 * Summary: 创建部门
 */
func (client *Client) CreateDepartment(request *CreateDepartmentRequest) (_result *CreateDepartmentResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateDepartmentResponse{}
	_body, _err := client.CreateDepartmentEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建部门
 * Summary: 创建部门
 */
func (client *Client) CreateDepartmentEx(request *CreateDepartmentRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateDepartmentResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateDepartmentResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.iam.department.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 更新部门信息
 * Summary: 更新部门信息
 */
func (client *Client) UpdateDepartment(request *UpdateDepartmentRequest) (_result *UpdateDepartmentResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateDepartmentResponse{}
	_body, _err := client.UpdateDepartmentEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 更新部门信息
 * Summary: 更新部门信息
 */
func (client *Client) UpdateDepartmentEx(request *UpdateDepartmentRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateDepartmentResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateDepartmentResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.iam.department.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 删除部门
 * Summary: 删除部门
 */
func (client *Client) DeleteDepartment(request *DeleteDepartmentRequest) (_result *DeleteDepartmentResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DeleteDepartmentResponse{}
	_body, _err := client.DeleteDepartmentEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 删除部门
 * Summary: 删除部门
 */
func (client *Client) DeleteDepartmentEx(request *DeleteDepartmentRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DeleteDepartmentResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DeleteDepartmentResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.iam.department.delete"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 分页查询部门信息
 * Summary: 分页查询部门信息
 */
func (client *Client) PagequeryDepartment(request *PagequeryDepartmentRequest) (_result *PagequeryDepartmentResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PagequeryDepartmentResponse{}
	_body, _err := client.PagequeryDepartmentEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 分页查询部门信息
 * Summary: 分页查询部门信息
 */
func (client *Client) PagequeryDepartmentEx(request *PagequeryDepartmentRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PagequeryDepartmentResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PagequeryDepartmentResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.iam.department.pagequery"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 批量查询部门
 * Summary: 批量查询部门
 */
func (client *Client) BatchqueryDepartment(request *BatchqueryDepartmentRequest) (_result *BatchqueryDepartmentResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &BatchqueryDepartmentResponse{}
	_body, _err := client.BatchqueryDepartmentEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 批量查询部门
 * Summary: 批量查询部门
 */
func (client *Client) BatchqueryDepartmentEx(request *BatchqueryDepartmentRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *BatchqueryDepartmentResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &BatchqueryDepartmentResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.iam.department.batchquery"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 添加或更新部门成员
 * Summary: 添加或更新部门成员
 */
func (client *Client) SaveDepartmentUser(request *SaveDepartmentUserRequest) (_result *SaveDepartmentUserResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SaveDepartmentUserResponse{}
	_body, _err := client.SaveDepartmentUserEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 添加或更新部门成员
 * Summary: 添加或更新部门成员
 */
func (client *Client) SaveDepartmentUserEx(request *SaveDepartmentUserRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SaveDepartmentUserResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SaveDepartmentUserResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.iam.department.user.save"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 移除部门成员
 * Summary: 移除部门成员
 */
func (client *Client) RemoveDepartmentUser(request *RemoveDepartmentUserRequest) (_result *RemoveDepartmentUserResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &RemoveDepartmentUserResponse{}
	_body, _err := client.RemoveDepartmentUserEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 移除部门成员
 * Summary: 移除部门成员
 */
func (client *Client) RemoveDepartmentUserEx(request *RemoveDepartmentUserRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *RemoveDepartmentUserResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &RemoveDepartmentUserResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.iam.department.user.remove"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 分页查询部门成员信息
 * Summary: 分页查询部门成员信息
 */
func (client *Client) QueryDepartmentUser(request *QueryDepartmentUserRequest) (_result *QueryDepartmentUserResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDepartmentUserResponse{}
	_body, _err := client.QueryDepartmentUserEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 分页查询部门成员信息
 * Summary: 分页查询部门成员信息
 */
func (client *Client) QueryDepartmentUserEx(request *QueryDepartmentUserRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDepartmentUserResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDepartmentUserResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.iam.department.user.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取租户级安全设置
 * Summary: 获取租户级安全设置
 */
func (client *Client) GetLoginconfig(request *GetLoginconfigRequest) (_result *GetLoginconfigResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetLoginconfigResponse{}
	_body, _err := client.GetLoginconfigEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取租户级安全设置
 * Summary: 获取租户级安全设置
 */
func (client *Client) GetLoginconfigEx(request *GetLoginconfigRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetLoginconfigResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetLoginconfigResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.iam.loginconfig.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 更新租户级安全设置
 * Summary: 更新租户级安全设置
 */
func (client *Client) UpdateLoginconfig(request *UpdateLoginconfigRequest) (_result *UpdateLoginconfigResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateLoginconfigResponse{}
	_body, _err := client.UpdateLoginconfigEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 更新租户级安全设置
 * Summary: 更新租户级安全设置
 */
func (client *Client) UpdateLoginconfigEx(request *UpdateLoginconfigRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateLoginconfigResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateLoginconfigResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.iam.loginconfig.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 唯一条件查询MFA状态
 * Summary: 唯一条件查询MFA状态
 */
func (client *Client) GetMfaStatus(request *GetMfaStatusRequest) (_result *GetMfaStatusResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetMfaStatusResponse{}
	_body, _err := client.GetMfaStatusEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 唯一条件查询MFA状态
 * Summary: 唯一条件查询MFA状态
 */
func (client *Client) GetMfaStatusEx(request *GetMfaStatusRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetMfaStatusResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetMfaStatusResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.iam.mfa.status.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 开启MFA
 * Summary: 开启MFA
 */
func (client *Client) EnableMfa(request *EnableMfaRequest) (_result *EnableMfaResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &EnableMfaResponse{}
	_body, _err := client.EnableMfaEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 开启MFA
 * Summary: 开启MFA
 */
func (client *Client) EnableMfaEx(request *EnableMfaRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *EnableMfaResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &EnableMfaResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.iam.mfa.enable"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 关闭MFA
 * Summary: 关闭MFA
 */
func (client *Client) DisableMfa(request *DisableMfaRequest) (_result *DisableMfaResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DisableMfaResponse{}
	_body, _err := client.DisableMfaEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 关闭MFA
 * Summary: 关闭MFA
 */
func (client *Client) DisableMfaEx(request *DisableMfaRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DisableMfaResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DisableMfaResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.iam.mfa.disable"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 初始化MFA
 * Summary: 初始化MFA
 */
func (client *Client) InitMfa(request *InitMfaRequest) (_result *InitMfaResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &InitMfaResponse{}
	_body, _err := client.InitMfaEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 初始化MFA
 * Summary: 初始化MFA
 */
func (client *Client) InitMfaEx(request *InitMfaRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *InitMfaResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &InitMfaResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.iam.mfa.init"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 校验 MFA
 * Summary: 校验 MFA
 */
func (client *Client) VerifyMfa(request *VerifyMfaRequest) (_result *VerifyMfaResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &VerifyMfaResponse{}
	_body, _err := client.VerifyMfaEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 校验 MFA
 * Summary: 校验 MFA
 */
func (client *Client) VerifyMfaEx(request *VerifyMfaRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *VerifyMfaResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &VerifyMfaResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.iam.mfa.verify"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 唯一条件查询MFA配置
 * Summary: 唯一条件查询MFA配置
 */
func (client *Client) GetMfa(request *GetMfaRequest) (_result *GetMfaResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetMfaResponse{}
	_body, _err := client.GetMfaEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 唯一条件查询MFA配置
 * Summary: 唯一条件查询MFA配置
 */
func (client *Client) GetMfaEx(request *GetMfaRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetMfaResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetMfaResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.iam.mfa.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 更新密码
 * Summary: 更新密码
 */
func (client *Client) UpdateOperatorPassword(request *UpdateOperatorPasswordRequest) (_result *UpdateOperatorPasswordResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateOperatorPasswordResponse{}
	_body, _err := client.UpdateOperatorPasswordEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 更新密码
 * Summary: 更新密码
 */
func (client *Client) UpdateOperatorPasswordEx(request *UpdateOperatorPasswordRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateOperatorPasswordResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateOperatorPasswordResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.iam.operator.password.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 重置账号密码
 * Summary: 重置账号密码
 */
func (client *Client) ResetOperatorPassword(request *ResetOperatorPasswordRequest) (_result *ResetOperatorPasswordResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ResetOperatorPasswordResponse{}
	_body, _err := client.ResetOperatorPasswordEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 重置账号密码
 * Summary: 重置账号密码
 */
func (client *Client) ResetOperatorPasswordEx(request *ResetOperatorPasswordRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ResetOperatorPasswordResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ResetOperatorPasswordResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.iam.operator.password.reset"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 批量查询操作员
 * Summary: 批量查询操作员
 */
func (client *Client) BatchqueryOperator(request *BatchqueryOperatorRequest) (_result *BatchqueryOperatorResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &BatchqueryOperatorResponse{}
	_body, _err := client.BatchqueryOperatorEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 批量查询操作员
 * Summary: 批量查询操作员
 */
func (client *Client) BatchqueryOperatorEx(request *BatchqueryOperatorRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *BatchqueryOperatorResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &BatchqueryOperatorResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.iam.operator.batchquery"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 推送操作事件，事件需要事先定义
 * Summary: 推送操作事件
 */
func (client *Client) PushOperation(request *PushOperationRequest) (_result *PushOperationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PushOperationResponse{}
	_body, _err := client.PushOperationEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 推送操作事件，事件需要事先定义
 * Summary: 推送操作事件
 */
func (client *Client) PushOperationEx(request *PushOperationRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PushOperationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PushOperationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.iam.operation.push"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询操作类型
 * Summary: 查询操作类型
 */
func (client *Client) QueryOperationtype(request *QueryOperationtypeRequest) (_result *QueryOperationtypeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryOperationtypeResponse{}
	_body, _err := client.QueryOperationtypeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询操作类型
 * Summary: 查询操作类型
 */
func (client *Client) QueryOperationtypeEx(request *QueryOperationtypeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryOperationtypeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryOperationtypeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.iam.operationtype.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 唯一查询操作类型
 * Summary: 唯一查询操作类型
 */
func (client *Client) GetOperationtype(request *GetOperationtypeRequest) (_result *GetOperationtypeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetOperationtypeResponse{}
	_body, _err := client.GetOperationtypeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 唯一查询操作类型
 * Summary: 唯一查询操作类型
 */
func (client *Client) GetOperationtypeEx(request *GetOperationtypeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetOperationtypeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetOperationtypeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.iam.operationtype.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 添加租户成员
 * Summary: 添加租户成员
 */
func (client *Client) AddTenantMember(request *AddTenantMemberRequest) (_result *AddTenantMemberResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AddTenantMemberResponse{}
	_body, _err := client.AddTenantMemberEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 添加租户成员
 * Summary: 添加租户成员
 */
func (client *Client) AddTenantMemberEx(request *AddTenantMemberRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AddTenantMemberResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AddTenantMemberResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.iam.tenant.member.add"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取 logintoken，该 token 为一次性使用，且过期时间短。
 * Summary: 获取操作员 signtoken
 */
func (client *Client) GetOperatorLogintoken(request *GetOperatorLogintokenRequest) (_result *GetOperatorLogintokenResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetOperatorLogintokenResponse{}
	_body, _err := client.GetOperatorLogintokenEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取 logintoken，该 token 为一次性使用，且过期时间短。
 * Summary: 获取操作员 signtoken
 */
func (client *Client) GetOperatorLogintokenEx(request *GetOperatorLogintokenRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetOperatorLogintokenResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetOperatorLogintokenResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.iam.operator.logintoken.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: token用于三方会员免密登录，与数科官网token不通用
 * Summary: 三方会员免密登录token申请
 */
func (client *Client) ApplyTrustloginToken(request *ApplyTrustloginTokenRequest) (_result *ApplyTrustloginTokenResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ApplyTrustloginTokenResponse{}
	_body, _err := client.ApplyTrustloginTokenEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: token用于三方会员免密登录，与数科官网token不通用
 * Summary: 三方会员免密登录token申请
 */
func (client *Client) ApplyTrustloginTokenEx(request *ApplyTrustloginTokenRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ApplyTrustloginTokenResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ApplyTrustloginTokenResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.iam.trustlogin.token.apply"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 三方会员免密登录token校验，与数科官网token不通用
 * Summary: 三方会员免密登录token校验
 */
func (client *Client) VerifyTrustloginToken(request *VerifyTrustloginTokenRequest) (_result *VerifyTrustloginTokenResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &VerifyTrustloginTokenResponse{}
	_body, _err := client.VerifyTrustloginTokenEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 三方会员免密登录token校验，与数科官网token不通用
 * Summary: 三方会员免密登录token校验
 */
func (client *Client) VerifyTrustloginTokenEx(request *VerifyTrustloginTokenRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *VerifyTrustloginTokenResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &VerifyTrustloginTokenResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.iam.trustlogin.token.verify"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
