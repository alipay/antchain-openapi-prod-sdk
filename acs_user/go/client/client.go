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

// 功能点信息
type AuthAction struct {
	// 权限点编码
	ActionCode *string `json:"action_code,omitempty" xml:"action_code,omitempty" require:"true"`
	// 权限点名称
	ActionName *string `json:"action_name,omitempty" xml:"action_name,omitempty" require:"true"`
	// 归属产品码
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty" require:"true"`
	// 权限点级别
	ActionLevel *int64 `json:"action_level,omitempty" xml:"action_level,omitempty" require:"true"`
	// 是否展示
	IsShow *bool `json:"is_show,omitempty" xml:"is_show,omitempty" require:"true"`
	// 权限点描述信息
	ActionDescription *string `json:"action_description,omitempty" xml:"action_description,omitempty"`
	// 父权限点编码
	ParentActionCode *string `json:"parent_action_code,omitempty" xml:"parent_action_code,omitempty"`
}

func (s AuthAction) String() string {
	return tea.Prettify(s)
}

func (s AuthAction) GoString() string {
	return s.String()
}

func (s *AuthAction) SetActionCode(v string) *AuthAction {
	s.ActionCode = &v
	return s
}

func (s *AuthAction) SetActionName(v string) *AuthAction {
	s.ActionName = &v
	return s
}

func (s *AuthAction) SetProductCode(v string) *AuthAction {
	s.ProductCode = &v
	return s
}

func (s *AuthAction) SetActionLevel(v int64) *AuthAction {
	s.ActionLevel = &v
	return s
}

func (s *AuthAction) SetIsShow(v bool) *AuthAction {
	s.IsShow = &v
	return s
}

func (s *AuthAction) SetActionDescription(v string) *AuthAction {
	s.ActionDescription = &v
	return s
}

func (s *AuthAction) SetParentActionCode(v string) *AuthAction {
	s.ParentActionCode = &v
	return s
}

// AntChain Stack 用户角色
type ACSUserRole struct {
	// 角色归属产品
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty" require:"true"`
	// 角色编码
	ProductRole *string `json:"product_role,omitempty" xml:"product_role,omitempty" require:"true"`
	// 角色类型，SYSTEM：系统角色；USER_DEFINE：用户自定义角色
	RoleType *string `json:"role_type,omitempty" xml:"role_type,omitempty" require:"true"`
	// 角色名称
	RoleName *string `json:"role_name,omitempty" xml:"role_name,omitempty"`
	// 角色描述信息
	RoleDescription *string `json:"role_description,omitempty" xml:"role_description,omitempty"`
	// 权限点信息
	AuthActions []*AuthAction `json:"auth_actions,omitempty" xml:"auth_actions,omitempty" type:"Repeated"`
	// 角色code
	RoleCode *string `json:"role_code,omitempty" xml:"role_code,omitempty"`
	// 登陆用户名
	Userid *string `json:"userid,omitempty" xml:"userid,omitempty"`
}

func (s ACSUserRole) String() string {
	return tea.Prettify(s)
}

func (s ACSUserRole) GoString() string {
	return s.String()
}

func (s *ACSUserRole) SetProductCode(v string) *ACSUserRole {
	s.ProductCode = &v
	return s
}

func (s *ACSUserRole) SetProductRole(v string) *ACSUserRole {
	s.ProductRole = &v
	return s
}

func (s *ACSUserRole) SetRoleType(v string) *ACSUserRole {
	s.RoleType = &v
	return s
}

func (s *ACSUserRole) SetRoleName(v string) *ACSUserRole {
	s.RoleName = &v
	return s
}

func (s *ACSUserRole) SetRoleDescription(v string) *ACSUserRole {
	s.RoleDescription = &v
	return s
}

func (s *ACSUserRole) SetAuthActions(v []*AuthAction) *ACSUserRole {
	s.AuthActions = v
	return s
}

func (s *ACSUserRole) SetRoleCode(v string) *ACSUserRole {
	s.RoleCode = &v
	return s
}

func (s *ACSUserRole) SetUserid(v string) *ACSUserRole {
	s.Userid = &v
	return s
}

// AntChain Stack 用户信息
type ACSUserInfo struct {
	// 用户ID
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty"`
	// 用户名称
	UserName *string `json:"user_name,omitempty" xml:"user_name,omitempty"`
	// 用户类型，OPERATOR：登录用户；SERVICE：服务用户
	UserType *string `json:"user_type,omitempty" xml:"user_type,omitempty"`
	// 是否已失效
	Expired *bool `json:"expired,omitempty" xml:"expired,omitempty"`
	// 是否被禁用
	Disabled *bool `json:"disabled,omitempty" xml:"disabled,omitempty"`
	// 邮箱
	Email *string `json:"email,omitempty" xml:"email,omitempty"`
	// 手机号码
	Phone *string `json:"phone,omitempty" xml:"phone,omitempty"`
	// 失效时间
	ExpiredTime *string `json:"expired_time,omitempty" xml:"expired_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 创建时间
	CreateTime *string `json:"create_time,omitempty" xml:"create_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 更新时间
	UpdateTime *string `json:"update_time,omitempty" xml:"update_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 用户角色
	UserRoles []*ACSUserRole `json:"user_roles,omitempty" xml:"user_roles,omitempty" type:"Repeated"`
	// 账户密码
	Password *string `json:"password,omitempty" xml:"password,omitempty"`
}

func (s ACSUserInfo) String() string {
	return tea.Prettify(s)
}

func (s ACSUserInfo) GoString() string {
	return s.String()
}

func (s *ACSUserInfo) SetUserId(v string) *ACSUserInfo {
	s.UserId = &v
	return s
}

func (s *ACSUserInfo) SetUserName(v string) *ACSUserInfo {
	s.UserName = &v
	return s
}

func (s *ACSUserInfo) SetUserType(v string) *ACSUserInfo {
	s.UserType = &v
	return s
}

func (s *ACSUserInfo) SetExpired(v bool) *ACSUserInfo {
	s.Expired = &v
	return s
}

func (s *ACSUserInfo) SetDisabled(v bool) *ACSUserInfo {
	s.Disabled = &v
	return s
}

func (s *ACSUserInfo) SetEmail(v string) *ACSUserInfo {
	s.Email = &v
	return s
}

func (s *ACSUserInfo) SetPhone(v string) *ACSUserInfo {
	s.Phone = &v
	return s
}

func (s *ACSUserInfo) SetExpiredTime(v string) *ACSUserInfo {
	s.ExpiredTime = &v
	return s
}

func (s *ACSUserInfo) SetCreateTime(v string) *ACSUserInfo {
	s.CreateTime = &v
	return s
}

func (s *ACSUserInfo) SetUpdateTime(v string) *ACSUserInfo {
	s.UpdateTime = &v
	return s
}

func (s *ACSUserInfo) SetUserRoles(v []*ACSUserRole) *ACSUserInfo {
	s.UserRoles = v
	return s
}

func (s *ACSUserInfo) SetPassword(v string) *ACSUserInfo {
	s.Password = &v
	return s
}

// 角色信息
type ACSRole struct {
	// 角色归属产品
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty" require:"true"`
	// 角色编码
	ProductRole *string `json:"product_role,omitempty" xml:"product_role,omitempty" require:"true"`
	// 角色编码
	RoleCode *string `json:"role_code,omitempty" xml:"role_code,omitempty" require:"true"`
	// 角色名称
	RoleName *string `json:"role_name,omitempty" xml:"role_name,omitempty" require:"true"`
	// 角色描述信息
	RoleDescription *string `json:"role_description,omitempty" xml:"role_description,omitempty"`
	// 角色类型，SYSTEM：系统角色；USER_DEFINE：用户自定义角色
	RoleType *string `json:"role_type,omitempty" xml:"role_type,omitempty"`
}

func (s ACSRole) String() string {
	return tea.Prettify(s)
}

func (s ACSRole) GoString() string {
	return s.String()
}

func (s *ACSRole) SetProductCode(v string) *ACSRole {
	s.ProductCode = &v
	return s
}

func (s *ACSRole) SetProductRole(v string) *ACSRole {
	s.ProductRole = &v
	return s
}

func (s *ACSRole) SetRoleCode(v string) *ACSRole {
	s.RoleCode = &v
	return s
}

func (s *ACSRole) SetRoleName(v string) *ACSRole {
	s.RoleName = &v
	return s
}

func (s *ACSRole) SetRoleDescription(v string) *ACSRole {
	s.RoleDescription = &v
	return s
}

func (s *ACSRole) SetRoleType(v string) *ACSRole {
	s.RoleType = &v
	return s
}

type QueryAccessorRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 网关调用的服务access key
	UserAccessKey *string `json:"user_access_key,omitempty" xml:"user_access_key,omitempty" require:"true"`
}

func (s QueryAccessorRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAccessorRequest) GoString() string {
	return s.String()
}

func (s *QueryAccessorRequest) SetAuthToken(v string) *QueryAccessorRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAccessorRequest) SetProductInstanceId(v string) *QueryAccessorRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAccessorRequest) SetUserAccessKey(v string) *QueryAccessorRequest {
	s.UserAccessKey = &v
	return s
}

type QueryAccessorResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 用户ID
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty"`
	// 用户名称
	UserName *string `json:"user_name,omitempty" xml:"user_name,omitempty"`
	// SERVICE:服务账号
	// MASTER:登录账号
	UserType *string `json:"user_type,omitempty" xml:"user_type,omitempty"`
	// 服务账号
	AccessKey *string `json:"access_key,omitempty" xml:"access_key,omitempty"`
	// 服务账号对应的密钥
	AccessSecret *string `json:"access_secret,omitempty" xml:"access_secret,omitempty"`
}

func (s QueryAccessorResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAccessorResponse) GoString() string {
	return s.String()
}

func (s *QueryAccessorResponse) SetReqMsgId(v string) *QueryAccessorResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAccessorResponse) SetResultCode(v string) *QueryAccessorResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAccessorResponse) SetResultMsg(v string) *QueryAccessorResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAccessorResponse) SetUserId(v string) *QueryAccessorResponse {
	s.UserId = &v
	return s
}

func (s *QueryAccessorResponse) SetUserName(v string) *QueryAccessorResponse {
	s.UserName = &v
	return s
}

func (s *QueryAccessorResponse) SetUserType(v string) *QueryAccessorResponse {
	s.UserType = &v
	return s
}

func (s *QueryAccessorResponse) SetAccessKey(v string) *QueryAccessorResponse {
	s.AccessKey = &v
	return s
}

func (s *QueryAccessorResponse) SetAccessSecret(v string) *QueryAccessorResponse {
	s.AccessSecret = &v
	return s
}

type ListUserwithroleRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 产品CODE
	ProdCode *string `json:"prod_code,omitempty" xml:"prod_code,omitempty"`
	// 产品内的角色信息
	ProductRole *string `json:"product_role,omitempty" xml:"product_role,omitempty"`
	// 分页开始序号，默认第一个开始
	CurrentPage *int64 `json:"current_page,omitempty" xml:"current_page,omitempty"`
	// 分页大小，未传默认是100
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
}

func (s ListUserwithroleRequest) String() string {
	return tea.Prettify(s)
}

func (s ListUserwithroleRequest) GoString() string {
	return s.String()
}

func (s *ListUserwithroleRequest) SetAuthToken(v string) *ListUserwithroleRequest {
	s.AuthToken = &v
	return s
}

func (s *ListUserwithroleRequest) SetProductInstanceId(v string) *ListUserwithroleRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListUserwithroleRequest) SetProdCode(v string) *ListUserwithroleRequest {
	s.ProdCode = &v
	return s
}

func (s *ListUserwithroleRequest) SetProductRole(v string) *ListUserwithroleRequest {
	s.ProductRole = &v
	return s
}

func (s *ListUserwithroleRequest) SetCurrentPage(v int64) *ListUserwithroleRequest {
	s.CurrentPage = &v
	return s
}

func (s *ListUserwithroleRequest) SetPageSize(v int64) *ListUserwithroleRequest {
	s.PageSize = &v
	return s
}

type ListUserwithroleResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 当前页码
	CurrentPage *int64 `json:"current_page,omitempty" xml:"current_page,omitempty"`
	// 页面大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// 总页数
	TotalPage *int64 `json:"total_page,omitempty" xml:"total_page,omitempty"`
	// 用户信息列表
	UserInfos []*ACSUserInfo `json:"user_infos,omitempty" xml:"user_infos,omitempty" type:"Repeated"`
}

func (s ListUserwithroleResponse) String() string {
	return tea.Prettify(s)
}

func (s ListUserwithroleResponse) GoString() string {
	return s.String()
}

func (s *ListUserwithroleResponse) SetReqMsgId(v string) *ListUserwithroleResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListUserwithroleResponse) SetResultCode(v string) *ListUserwithroleResponse {
	s.ResultCode = &v
	return s
}

func (s *ListUserwithroleResponse) SetResultMsg(v string) *ListUserwithroleResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListUserwithroleResponse) SetCurrentPage(v int64) *ListUserwithroleResponse {
	s.CurrentPage = &v
	return s
}

func (s *ListUserwithroleResponse) SetPageSize(v int64) *ListUserwithroleResponse {
	s.PageSize = &v
	return s
}

func (s *ListUserwithroleResponse) SetTotalPage(v int64) *ListUserwithroleResponse {
	s.TotalPage = &v
	return s
}

func (s *ListUserwithroleResponse) SetUserInfos(v []*ACSUserInfo) *ListUserwithroleResponse {
	s.UserInfos = v
	return s
}

type VerifySessionTokenRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 用户登录态信息
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

func (s *VerifySessionTokenRequest) SetProductInstanceId(v string) *VerifySessionTokenRequest {
	s.ProductInstanceId = &v
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
	// 用户ID
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty"`
	// 用户名称
	UserName *string `json:"user_name,omitempty" xml:"user_name,omitempty"`
	// 私有化中的租户ID（0表示适用所有租户）
	TenantId *int64 `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 用户类型，OPERATOR：登录账号；SERVICE：服务账号
	UserType *string `json:"user_type,omitempty" xml:"user_type,omitempty"`
	// 是否已失效
	Expired *bool `json:"expired,omitempty" xml:"expired,omitempty"`
	// 是否已冻结
	Disabled *bool `json:"disabled,omitempty" xml:"disabled,omitempty"`
	// 邮箱地址
	Email *string `json:"email,omitempty" xml:"email,omitempty"`
	// 电话号码
	Phone *string `json:"phone,omitempty" xml:"phone,omitempty"`
	// 失效时间
	ExpiredTime *string `json:"expired_time,omitempty" xml:"expired_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 是否需要修改密码
	ChangeRequired *bool `json:"change_required,omitempty" xml:"change_required,omitempty"`
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

func (s *VerifySessionTokenResponse) SetUserId(v string) *VerifySessionTokenResponse {
	s.UserId = &v
	return s
}

func (s *VerifySessionTokenResponse) SetUserName(v string) *VerifySessionTokenResponse {
	s.UserName = &v
	return s
}

func (s *VerifySessionTokenResponse) SetTenantId(v int64) *VerifySessionTokenResponse {
	s.TenantId = &v
	return s
}

func (s *VerifySessionTokenResponse) SetUserType(v string) *VerifySessionTokenResponse {
	s.UserType = &v
	return s
}

func (s *VerifySessionTokenResponse) SetExpired(v bool) *VerifySessionTokenResponse {
	s.Expired = &v
	return s
}

func (s *VerifySessionTokenResponse) SetDisabled(v bool) *VerifySessionTokenResponse {
	s.Disabled = &v
	return s
}

func (s *VerifySessionTokenResponse) SetEmail(v string) *VerifySessionTokenResponse {
	s.Email = &v
	return s
}

func (s *VerifySessionTokenResponse) SetPhone(v string) *VerifySessionTokenResponse {
	s.Phone = &v
	return s
}

func (s *VerifySessionTokenResponse) SetExpiredTime(v string) *VerifySessionTokenResponse {
	s.ExpiredTime = &v
	return s
}

func (s *VerifySessionTokenResponse) SetChangeRequired(v bool) *VerifySessionTokenResponse {
	s.ChangeRequired = &v
	return s
}

type JudgeAuthorityRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 用户id，和参数token二者必须有一个不能为空
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty"`
	// 用户登录token，和user_id二者必须有一个不能为空，当token不为空时，会先判断token 是否有效，然后进行权限判断
	Token *string `json:"token,omitempty" xml:"token,omitempty"`
	// 产品编码
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty" require:"true"`
	// 对应的权限码或者是角色编码
	ActionCode *string `json:"action_code,omitempty" xml:"action_code,omitempty" require:"true"`
	// 鉴权类型，ROLE：角色鉴权；ACTION：权限点鉴权
	ActionType *string `json:"action_type,omitempty" xml:"action_type,omitempty" require:"true"`
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

func (s *JudgeAuthorityRequest) SetProductInstanceId(v string) *JudgeAuthorityRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *JudgeAuthorityRequest) SetUserId(v string) *JudgeAuthorityRequest {
	s.UserId = &v
	return s
}

func (s *JudgeAuthorityRequest) SetToken(v string) *JudgeAuthorityRequest {
	s.Token = &v
	return s
}

func (s *JudgeAuthorityRequest) SetProductCode(v string) *JudgeAuthorityRequest {
	s.ProductCode = &v
	return s
}

func (s *JudgeAuthorityRequest) SetActionCode(v string) *JudgeAuthorityRequest {
	s.ActionCode = &v
	return s
}

func (s *JudgeAuthorityRequest) SetActionType(v string) *JudgeAuthorityRequest {
	s.ActionType = &v
	return s
}

type JudgeAuthorityResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// true：有权限；false：无权限
	JudgeResult *bool `json:"judge_result,omitempty" xml:"judge_result,omitempty"`
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

func (s *JudgeAuthorityResponse) SetJudgeResult(v bool) *JudgeAuthorityResponse {
	s.JudgeResult = &v
	return s
}

type ListPolicyRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 用户id，和token二者其中一个必须输入
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty"`
	// 用户登录token，和user_id二者其中一个必须，如果token不为空，则会先进行登录态的检查，没有查到，则返回失败，否则返回用户的权限信息
	Token *string `json:"token,omitempty" xml:"token,omitempty"`
	// 产品编码，不传入，返回用户拥有的所有权限，传入则返回用户当前产品的权限信息
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty"`
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

func (s *ListPolicyRequest) SetProductInstanceId(v string) *ListPolicyRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListPolicyRequest) SetUserId(v string) *ListPolicyRequest {
	s.UserId = &v
	return s
}

func (s *ListPolicyRequest) SetToken(v string) *ListPolicyRequest {
	s.Token = &v
	return s
}

func (s *ListPolicyRequest) SetProductCode(v string) *ListPolicyRequest {
	s.ProductCode = &v
	return s
}

type ListPolicyResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 用户的权限角色信息
	AuthRoles []*ACSUserRole `json:"auth_roles,omitempty" xml:"auth_roles,omitempty" type:"Repeated"`
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

func (s *ListPolicyResponse) SetAuthRoles(v []*ACSUserRole) *ListPolicyResponse {
	s.AuthRoles = v
	return s
}

type QueryUserRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 用户名称，模糊查询
	UserName *string `json:"user_name,omitempty" xml:"user_name,omitempty"`
	// 产品编码，表示查询拥有该产品权限的用户列表，为空查询所有有效用户
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty"`
	// 分页查询页数，默认第一页
	PageNum *int64 `json:"page_num,omitempty" xml:"page_num,omitempty"`
	// 分页大小，默认20
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
}

func (s QueryUserRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryUserRequest) GoString() string {
	return s.String()
}

func (s *QueryUserRequest) SetAuthToken(v string) *QueryUserRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryUserRequest) SetProductInstanceId(v string) *QueryUserRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryUserRequest) SetUserName(v string) *QueryUserRequest {
	s.UserName = &v
	return s
}

func (s *QueryUserRequest) SetProductCode(v string) *QueryUserRequest {
	s.ProductCode = &v
	return s
}

func (s *QueryUserRequest) SetPageNum(v int64) *QueryUserRequest {
	s.PageNum = &v
	return s
}

func (s *QueryUserRequest) SetPageSize(v int64) *QueryUserRequest {
	s.PageSize = &v
	return s
}

type QueryUserResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 用户列表
	UserInfos []*ACSUserInfo `json:"user_infos,omitempty" xml:"user_infos,omitempty" type:"Repeated"`
	// 传入的页码，没有传入，则取默认值1
	PageNum *int64 `json:"page_num,omitempty" xml:"page_num,omitempty"`
	// 传入的页大小，如果没有传入，则取默认值20
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// 查询结果的总条目数量
	TotalCount *int64 `json:"total_count,omitempty" xml:"total_count,omitempty"`
}

func (s QueryUserResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryUserResponse) GoString() string {
	return s.String()
}

func (s *QueryUserResponse) SetReqMsgId(v string) *QueryUserResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryUserResponse) SetResultCode(v string) *QueryUserResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryUserResponse) SetResultMsg(v string) *QueryUserResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryUserResponse) SetUserInfos(v []*ACSUserInfo) *QueryUserResponse {
	s.UserInfos = v
	return s
}

func (s *QueryUserResponse) SetPageNum(v int64) *QueryUserResponse {
	s.PageNum = &v
	return s
}

func (s *QueryUserResponse) SetPageSize(v int64) *QueryUserResponse {
	s.PageSize = &v
	return s
}

func (s *QueryUserResponse) SetTotalCount(v int64) *QueryUserResponse {
	s.TotalCount = &v
	return s
}

type CreateTenantRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户编码
	TenantCode *string `json:"tenant_code,omitempty" xml:"tenant_code,omitempty" require:"true"`
	// 租户名称
	TenantName *string `json:"tenant_name,omitempty" xml:"tenant_name,omitempty"`
}

func (s CreateTenantRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateTenantRequest) GoString() string {
	return s.String()
}

func (s *CreateTenantRequest) SetAuthToken(v string) *CreateTenantRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateTenantRequest) SetProductInstanceId(v string) *CreateTenantRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateTenantRequest) SetTenantCode(v string) *CreateTenantRequest {
	s.TenantCode = &v
	return s
}

func (s *CreateTenantRequest) SetTenantName(v string) *CreateTenantRequest {
	s.TenantName = &v
	return s
}

type CreateTenantResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 租户ID
	TenantId *int64 `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 租户编码
	TenantCode *string `json:"tenant_code,omitempty" xml:"tenant_code,omitempty"`
	// 租户名称
	TenantName *string `json:"tenant_name,omitempty" xml:"tenant_name,omitempty"`
}

func (s CreateTenantResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateTenantResponse) GoString() string {
	return s.String()
}

func (s *CreateTenantResponse) SetReqMsgId(v string) *CreateTenantResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateTenantResponse) SetResultCode(v string) *CreateTenantResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateTenantResponse) SetResultMsg(v string) *CreateTenantResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateTenantResponse) SetTenantId(v int64) *CreateTenantResponse {
	s.TenantId = &v
	return s
}

func (s *CreateTenantResponse) SetTenantCode(v string) *CreateTenantResponse {
	s.TenantCode = &v
	return s
}

func (s *CreateTenantResponse) SetTenantName(v string) *CreateTenantResponse {
	s.TenantName = &v
	return s
}

type ListAuthActionRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 产品CODE
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty" require:"true"`
}

func (s ListAuthActionRequest) String() string {
	return tea.Prettify(s)
}

func (s ListAuthActionRequest) GoString() string {
	return s.String()
}

func (s *ListAuthActionRequest) SetAuthToken(v string) *ListAuthActionRequest {
	s.AuthToken = &v
	return s
}

func (s *ListAuthActionRequest) SetProductInstanceId(v string) *ListAuthActionRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListAuthActionRequest) SetProductCode(v string) *ListAuthActionRequest {
	s.ProductCode = &v
	return s
}

type ListAuthActionResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 权限点列表
	ActionList []*AuthAction `json:"action_list,omitempty" xml:"action_list,omitempty" type:"Repeated"`
}

func (s ListAuthActionResponse) String() string {
	return tea.Prettify(s)
}

func (s ListAuthActionResponse) GoString() string {
	return s.String()
}

func (s *ListAuthActionResponse) SetReqMsgId(v string) *ListAuthActionResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListAuthActionResponse) SetResultCode(v string) *ListAuthActionResponse {
	s.ResultCode = &v
	return s
}

func (s *ListAuthActionResponse) SetResultMsg(v string) *ListAuthActionResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListAuthActionResponse) SetActionList(v []*AuthAction) *ListAuthActionResponse {
	s.ActionList = v
	return s
}

type ListRoleRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 分页查询页数，默认第一页
	PageNum *int64 `json:"page_num,omitempty" xml:"page_num,omitempty"`
	// 分页大小，默认500
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
}

func (s ListRoleRequest) String() string {
	return tea.Prettify(s)
}

func (s ListRoleRequest) GoString() string {
	return s.String()
}

func (s *ListRoleRequest) SetAuthToken(v string) *ListRoleRequest {
	s.AuthToken = &v
	return s
}

func (s *ListRoleRequest) SetProductInstanceId(v string) *ListRoleRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListRoleRequest) SetPageNum(v int64) *ListRoleRequest {
	s.PageNum = &v
	return s
}

func (s *ListRoleRequest) SetPageSize(v int64) *ListRoleRequest {
	s.PageSize = &v
	return s
}

type ListRoleResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 分页查询，当前页
	CurrentPage *int64 `json:"current_page,omitempty" xml:"current_page,omitempty"`
	// 每页包含条数
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// 共10页
	TotalPage *int64 `json:"total_page,omitempty" xml:"total_page,omitempty"`
	// 角色列表
	Roles []*ACSRole `json:"roles,omitempty" xml:"roles,omitempty" type:"Repeated"`
}

func (s ListRoleResponse) String() string {
	return tea.Prettify(s)
}

func (s ListRoleResponse) GoString() string {
	return s.String()
}

func (s *ListRoleResponse) SetReqMsgId(v string) *ListRoleResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListRoleResponse) SetResultCode(v string) *ListRoleResponse {
	s.ResultCode = &v
	return s
}

func (s *ListRoleResponse) SetResultMsg(v string) *ListRoleResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListRoleResponse) SetCurrentPage(v int64) *ListRoleResponse {
	s.CurrentPage = &v
	return s
}

func (s *ListRoleResponse) SetPageSize(v int64) *ListRoleResponse {
	s.PageSize = &v
	return s
}

func (s *ListRoleResponse) SetTotalPage(v int64) *ListRoleResponse {
	s.TotalPage = &v
	return s
}

func (s *ListRoleResponse) SetRoles(v []*ACSRole) *ListRoleResponse {
	s.Roles = v
	return s
}

type CreateUserRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 用户信息
	User *ACSUserInfo `json:"user,omitempty" xml:"user,omitempty" require:"true"`
	// 用户登陆名
	Userid *string `json:"userid,omitempty" xml:"userid,omitempty"`
}

func (s CreateUserRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateUserRequest) GoString() string {
	return s.String()
}

func (s *CreateUserRequest) SetAuthToken(v string) *CreateUserRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateUserRequest) SetProductInstanceId(v string) *CreateUserRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateUserRequest) SetUser(v *ACSUserInfo) *CreateUserRequest {
	s.User = v
	return s
}

func (s *CreateUserRequest) SetUserid(v string) *CreateUserRequest {
	s.Userid = &v
	return s
}

type CreateUserResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 用户信息
	User *ACSUserInfo `json:"user,omitempty" xml:"user,omitempty"`
}

func (s CreateUserResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateUserResponse) GoString() string {
	return s.String()
}

func (s *CreateUserResponse) SetReqMsgId(v string) *CreateUserResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateUserResponse) SetResultCode(v string) *CreateUserResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateUserResponse) SetResultMsg(v string) *CreateUserResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateUserResponse) SetUser(v *ACSUserInfo) *CreateUserResponse {
	s.User = v
	return s
}

type UpdateUserRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 用户信息
	User *ACSUserInfo `json:"user,omitempty" xml:"user,omitempty" require:"true"`
	// 用户登陆名
	Userid *string `json:"userid,omitempty" xml:"userid,omitempty"`
}

func (s UpdateUserRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateUserRequest) GoString() string {
	return s.String()
}

func (s *UpdateUserRequest) SetAuthToken(v string) *UpdateUserRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateUserRequest) SetProductInstanceId(v string) *UpdateUserRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateUserRequest) SetUser(v *ACSUserInfo) *UpdateUserRequest {
	s.User = v
	return s
}

func (s *UpdateUserRequest) SetUserid(v string) *UpdateUserRequest {
	s.Userid = &v
	return s
}

type UpdateUserResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 用户信息
	User *ACSUserInfo `json:"user,omitempty" xml:"user,omitempty"`
}

func (s UpdateUserResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateUserResponse) GoString() string {
	return s.String()
}

func (s *UpdateUserResponse) SetReqMsgId(v string) *UpdateUserResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateUserResponse) SetResultCode(v string) *UpdateUserResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateUserResponse) SetResultMsg(v string) *UpdateUserResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateUserResponse) SetUser(v *ACSUserInfo) *UpdateUserResponse {
	s.User = v
	return s
}

type DeleteUserRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 用户登陆账号
	Userid *string `json:"userid,omitempty" xml:"userid,omitempty" require:"true"`
}

func (s DeleteUserRequest) String() string {
	return tea.Prettify(s)
}

func (s DeleteUserRequest) GoString() string {
	return s.String()
}

func (s *DeleteUserRequest) SetAuthToken(v string) *DeleteUserRequest {
	s.AuthToken = &v
	return s
}

func (s *DeleteUserRequest) SetProductInstanceId(v string) *DeleteUserRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DeleteUserRequest) SetUserid(v string) *DeleteUserRequest {
	s.Userid = &v
	return s
}

type DeleteUserResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 删除的结果
	Result *bool `json:"result,omitempty" xml:"result,omitempty"`
}

func (s DeleteUserResponse) String() string {
	return tea.Prettify(s)
}

func (s DeleteUserResponse) GoString() string {
	return s.String()
}

func (s *DeleteUserResponse) SetReqMsgId(v string) *DeleteUserResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DeleteUserResponse) SetResultCode(v string) *DeleteUserResponse {
	s.ResultCode = &v
	return s
}

func (s *DeleteUserResponse) SetResultMsg(v string) *DeleteUserResponse {
	s.ResultMsg = &v
	return s
}

func (s *DeleteUserResponse) SetResult(v bool) *DeleteUserResponse {
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
				"sdk_version":      tea.String("1.3.3"),
				"_prod_code":       tea.String("ACS_USER"),
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
 * Description: acsgw来根据ak查询accessor的信息
 * Summary: 根据ak查询accessor信息
 */
func (client *Client) QueryAccessor(request *QueryAccessorRequest) (_result *QueryAccessorResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAccessorResponse{}
	_body, _err := client.QueryAccessorEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: acsgw来根据ak查询accessor的信息
 * Summary: 根据ak查询accessor信息
 */
func (client *Client) QueryAccessorEx(request *QueryAccessorRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAccessorResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAccessorResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("acs.user.accessor.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询所有的用户与权限关系列表
 * Summary: 获取用户角色信息列表
 */
func (client *Client) ListUserwithrole(request *ListUserwithroleRequest) (_result *ListUserwithroleResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListUserwithroleResponse{}
	_body, _err := client.ListUserwithroleEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询所有的用户与权限关系列表
 * Summary: 获取用户角色信息列表
 */
func (client *Client) ListUserwithroleEx(request *ListUserwithroleRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListUserwithroleResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListUserwithroleResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("acs.user.userwithrole.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 私有化场景用户登录态验证
 * Summary: 私有化场景用户登录态验证
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
 * Description: 私有化场景用户登录态验证
 * Summary: 私有化场景用户登录态验证
 */
func (client *Client) VerifySessionTokenEx(request *VerifySessionTokenRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *VerifySessionTokenResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &VerifySessionTokenResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("acs.user.session.token.verify"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 用户权限校验
 * Summary: 用户权限校验
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
 * Description: 用户权限校验
 * Summary: 用户权限校验
 */
func (client *Client) JudgeAuthorityEx(request *JudgeAuthorityRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *JudgeAuthorityResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &JudgeAuthorityResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("acs.user.authority.judge"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询某个用户的权限
 * Summary: 用户权限查询
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
 * Description: 查询某个用户的权限
 * Summary: 用户权限查询
 */
func (client *Client) ListPolicyEx(request *ListPolicyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListPolicyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListPolicyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("acs.user.policy.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 用户信息查询
 * Summary: 用户信息查询
 */
func (client *Client) QueryUser(request *QueryUserRequest) (_result *QueryUserResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryUserResponse{}
	_body, _err := client.QueryUserEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 用户信息查询
 * Summary: 用户信息查询
 */
func (client *Client) QueryUserEx(request *QueryUserRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryUserResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryUserResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("acs.user.user.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 租户创建
 * Summary: 租户创建
 */
func (client *Client) CreateTenant(request *CreateTenantRequest) (_result *CreateTenantResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateTenantResponse{}
	_body, _err := client.CreateTenantEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 租户创建
 * Summary: 租户创建
 */
func (client *Client) CreateTenantEx(request *CreateTenantRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateTenantResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateTenantResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("acs.user.tenant.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取归属某个产品的有效权限点列表
 * Summary: 获取归属某个产品的有效权限点列表
 */
func (client *Client) ListAuthAction(request *ListAuthActionRequest) (_result *ListAuthActionResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListAuthActionResponse{}
	_body, _err := client.ListAuthActionEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取归属某个产品的有效权限点列表
 * Summary: 获取归属某个产品的有效权限点列表
 */
func (client *Client) ListAuthActionEx(request *ListAuthActionRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListAuthActionResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListAuthActionResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("acs.user.auth.action.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询角色列表
 * Summary: 角色列表
 */
func (client *Client) ListRole(request *ListRoleRequest) (_result *ListRoleResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListRoleResponse{}
	_body, _err := client.ListRoleEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询角色列表
 * Summary: 角色列表
 */
func (client *Client) ListRoleEx(request *ListRoleRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListRoleResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListRoleResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("acs.user.role.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 添加用户
 * Summary: 添加用户
 */
func (client *Client) CreateUser(request *CreateUserRequest) (_result *CreateUserResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateUserResponse{}
	_body, _err := client.CreateUserEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 添加用户
 * Summary: 添加用户
 */
func (client *Client) CreateUserEx(request *CreateUserRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateUserResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateUserResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("acs.user.user.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 更新用户角色
 * Summary: 更新用户角色
 */
func (client *Client) UpdateUser(request *UpdateUserRequest) (_result *UpdateUserResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateUserResponse{}
	_body, _err := client.UpdateUserEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 更新用户角色
 * Summary: 更新用户角色
 */
func (client *Client) UpdateUserEx(request *UpdateUserRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateUserResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateUserResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("acs.user.user.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 删除用户
 * Summary: 删除用户
 */
func (client *Client) DeleteUser(request *DeleteUserRequest) (_result *DeleteUserResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DeleteUserResponse{}
	_body, _err := client.DeleteUserEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 删除用户
 * Summary: 删除用户
 */
func (client *Client) DeleteUserEx(request *DeleteUserRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DeleteUserResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DeleteUserResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("acs.user.user.delete"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
