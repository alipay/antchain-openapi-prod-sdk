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

type GetCustomerRequest struct {
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 企业ID
	Customer *string `json:"customer,omitempty" xml:"customer,omitempty" require:"true"`
}

func (s GetCustomerRequest) String() string {
	return tea.Prettify(s)
}

func (s GetCustomerRequest) GoString() string {
	return s.String()
}

func (s *GetCustomerRequest) SetAuthToken(v string) *GetCustomerRequest {
	s.AuthToken = &v
	return s
}

func (s *GetCustomerRequest) SetCustomer(v string) *GetCustomerRequest {
	s.Customer = &v
	return s
}

type GetCustomerResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 创建时间，ISO8601格式
	CreateTime *string `json:"create_time,omitempty" xml:"create_time,omitempty"`
	// 企业ID
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 企业名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 最近一次修改时间，ISO8601格式
	UpdateTime *string `json:"update_time,omitempty" xml:"update_time,omitempty"`
}

func (s GetCustomerResponse) String() string {
	return tea.Prettify(s)
}

func (s GetCustomerResponse) GoString() string {
	return s.String()
}

func (s *GetCustomerResponse) SetReqMsgId(v string) *GetCustomerResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetCustomerResponse) SetResultCode(v string) *GetCustomerResponse {
	s.ResultCode = &v
	return s
}

func (s *GetCustomerResponse) SetResultMsg(v string) *GetCustomerResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetCustomerResponse) SetCreateTime(v string) *GetCustomerResponse {
	s.CreateTime = &v
	return s
}

func (s *GetCustomerResponse) SetId(v string) *GetCustomerResponse {
	s.Id = &v
	return s
}

func (s *GetCustomerResponse) SetName(v string) *GetCustomerResponse {
	s.Name = &v
	return s
}

func (s *GetCustomerResponse) SetUpdateTime(v string) *GetCustomerResponse {
	s.UpdateTime = &v
	return s
}

type GetOperatorRequest struct {
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 操作员登录名
	LoginName *string `json:"login_name,omitempty" xml:"login_name,omitempty"`
	// 金融云操作员id
	OperatorId *string `json:"operator_id,omitempty" xml:"operator_id,omitempty"`
}

func (s GetOperatorRequest) String() string {
	return tea.Prettify(s)
}

func (s GetOperatorRequest) GoString() string {
	return s.String()
}

func (s *GetOperatorRequest) SetAuthToken(v string) *GetOperatorRequest {
	s.AuthToken = &v
	return s
}

func (s *GetOperatorRequest) SetLoginName(v string) *GetOperatorRequest {
	s.LoginName = &v
	return s
}

func (s *GetOperatorRequest) SetOperatorId(v string) *GetOperatorRequest {
	s.OperatorId = &v
	return s
}

type GetOperatorResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 操作员创建时间，ISO8601格式
	CreateTime *string `json:"create_time,omitempty" xml:"create_time,omitempty"`
	// 操作员所在的企业
	Customer *string `json:"customer,omitempty" xml:"customer,omitempty" require:"true"`
	// 邮箱
	Email *string `json:"email,omitempty" xml:"email,omitempty" require:"true"`
	// 外部对接系统操作员ID
	ExternalId *string `json:"external_id,omitempty" xml:"external_id,omitempty" require:"true"`
	// 外部对接系统类型
	ExternalSystem *string `json:"external_system,omitempty" xml:"external_system,omitempty" require:"true"`
	// 操作员ID
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 登录名
	LoginName *string `json:"login_name,omitempty" xml:"login_name,omitempty" require:"true"`
	// 手机号
	Mobile *string `json:"mobile,omitempty" xml:"mobile,omitempty" require:"true"`
	// 昵称
	Nickname *string `json:"nickname,omitempty" xml:"nickname,omitempty" require:"true"`
	// 真实姓名
	RealName *string `json:"real_name,omitempty" xml:"real_name,omitempty" require:"true"`
	// 操作员状态(INACTIVE：未激活，NORMAL：正常状态，FROZEN：冻结状态)
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 用户加入的租户列表
	Tenants []*string `json:"tenants,omitempty" xml:"tenants,omitempty" require:"true" type:"Repeated"`
	// 操作员最近一次修改时间，ISO8601格式
	UpdateTime *string `json:"update_time,omitempty" xml:"update_time,omitempty"`
}

func (s GetOperatorResponse) String() string {
	return tea.Prettify(s)
}

func (s GetOperatorResponse) GoString() string {
	return s.String()
}

func (s *GetOperatorResponse) SetReqMsgId(v string) *GetOperatorResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetOperatorResponse) SetResultCode(v string) *GetOperatorResponse {
	s.ResultCode = &v
	return s
}

func (s *GetOperatorResponse) SetResultMsg(v string) *GetOperatorResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetOperatorResponse) SetCreateTime(v string) *GetOperatorResponse {
	s.CreateTime = &v
	return s
}

func (s *GetOperatorResponse) SetCustomer(v string) *GetOperatorResponse {
	s.Customer = &v
	return s
}

func (s *GetOperatorResponse) SetEmail(v string) *GetOperatorResponse {
	s.Email = &v
	return s
}

func (s *GetOperatorResponse) SetExternalId(v string) *GetOperatorResponse {
	s.ExternalId = &v
	return s
}

func (s *GetOperatorResponse) SetExternalSystem(v string) *GetOperatorResponse {
	s.ExternalSystem = &v
	return s
}

func (s *GetOperatorResponse) SetId(v string) *GetOperatorResponse {
	s.Id = &v
	return s
}

func (s *GetOperatorResponse) SetLoginName(v string) *GetOperatorResponse {
	s.LoginName = &v
	return s
}

func (s *GetOperatorResponse) SetMobile(v string) *GetOperatorResponse {
	s.Mobile = &v
	return s
}

func (s *GetOperatorResponse) SetNickname(v string) *GetOperatorResponse {
	s.Nickname = &v
	return s
}

func (s *GetOperatorResponse) SetRealName(v string) *GetOperatorResponse {
	s.RealName = &v
	return s
}

func (s *GetOperatorResponse) SetStatus(v string) *GetOperatorResponse {
	s.Status = &v
	return s
}

func (s *GetOperatorResponse) SetTenants(v []*string) *GetOperatorResponse {
	s.Tenants = v
	return s
}

func (s *GetOperatorResponse) SetUpdateTime(v string) *GetOperatorResponse {
	s.UpdateTime = &v
	return s
}

type QueryOperatorRequest struct {
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 企业ID
	Customer *string `json:"customer,omitempty" xml:"customer,omitempty" require:"true"`
	// 当前页，默认值为1
	PageNum *int64 `json:"page_num,omitempty" xml:"page_num,omitempty"`
	// 分页大小，默认值为10
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// 真实姓名
	RealName *string `json:"real_name,omitempty" xml:"real_name,omitempty"`
	// 租户唯一标识
	Tenant *string `json:"tenant,omitempty" xml:"tenant,omitempty"`
}

func (s QueryOperatorRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryOperatorRequest) GoString() string {
	return s.String()
}

func (s *QueryOperatorRequest) SetAuthToken(v string) *QueryOperatorRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryOperatorRequest) SetCustomer(v string) *QueryOperatorRequest {
	s.Customer = &v
	return s
}

func (s *QueryOperatorRequest) SetPageNum(v int64) *QueryOperatorRequest {
	s.PageNum = &v
	return s
}

func (s *QueryOperatorRequest) SetPageSize(v int64) *QueryOperatorRequest {
	s.PageSize = &v
	return s
}

func (s *QueryOperatorRequest) SetRealName(v string) *QueryOperatorRequest {
	s.RealName = &v
	return s
}

func (s *QueryOperatorRequest) SetTenant(v string) *QueryOperatorRequest {
	s.Tenant = &v
	return s
}

type QueryOperatorResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 操作员列表
	Operators []*Operator `json:"operators,omitempty" xml:"operators,omitempty" require:"true" type:"Repeated"`
	// 传入的页码, 如果没有传入, 则取默认值1
	PageNum *int64 `json:"page_num,omitempty" xml:"page_num,omitempty" require:"true"`
	// 传入的页大小, 如果没有传入, 则取默认值10
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
	// 查询结果的总条目数量
	TotalCount *int64 `json:"total_count,omitempty" xml:"total_count,omitempty" require:"true"`
}

func (s QueryOperatorResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryOperatorResponse) GoString() string {
	return s.String()
}

func (s *QueryOperatorResponse) SetReqMsgId(v string) *QueryOperatorResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryOperatorResponse) SetResultCode(v string) *QueryOperatorResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryOperatorResponse) SetResultMsg(v string) *QueryOperatorResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryOperatorResponse) SetOperators(v []*Operator) *QueryOperatorResponse {
	s.Operators = v
	return s
}

func (s *QueryOperatorResponse) SetPageNum(v int64) *QueryOperatorResponse {
	s.PageNum = &v
	return s
}

func (s *QueryOperatorResponse) SetPageSize(v int64) *QueryOperatorResponse {
	s.PageSize = &v
	return s
}

func (s *QueryOperatorResponse) SetTotalCount(v int64) *QueryOperatorResponse {
	s.TotalCount = &v
	return s
}

type SearchOperatorRequest struct {
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 企业ID
	Customer *string `json:"customer,omitempty" xml:"customer,omitempty" require:"true"`
	// 登录名
	LoginName *string `json:"login_name,omitempty" xml:"login_name,omitempty"`
	// 昵称
	Nickname *string `json:"nickname,omitempty" xml:"nickname,omitempty"`
	// 当前页，默认值为1
	PageNum *int64 `json:"page_num,omitempty" xml:"page_num,omitempty"`
	// 分页大小，默认值为10
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// 真实姓名
	RealName *string `json:"real_name,omitempty" xml:"real_name,omitempty"`
	// 租户唯一标识
	Tenant *string `json:"tenant,omitempty" xml:"tenant,omitempty"`
}

func (s SearchOperatorRequest) String() string {
	return tea.Prettify(s)
}

func (s SearchOperatorRequest) GoString() string {
	return s.String()
}

func (s *SearchOperatorRequest) SetAuthToken(v string) *SearchOperatorRequest {
	s.AuthToken = &v
	return s
}

func (s *SearchOperatorRequest) SetCustomer(v string) *SearchOperatorRequest {
	s.Customer = &v
	return s
}

func (s *SearchOperatorRequest) SetLoginName(v string) *SearchOperatorRequest {
	s.LoginName = &v
	return s
}

func (s *SearchOperatorRequest) SetNickname(v string) *SearchOperatorRequest {
	s.Nickname = &v
	return s
}

func (s *SearchOperatorRequest) SetPageNum(v int64) *SearchOperatorRequest {
	s.PageNum = &v
	return s
}

func (s *SearchOperatorRequest) SetPageSize(v int64) *SearchOperatorRequest {
	s.PageSize = &v
	return s
}

func (s *SearchOperatorRequest) SetRealName(v string) *SearchOperatorRequest {
	s.RealName = &v
	return s
}

func (s *SearchOperatorRequest) SetTenant(v string) *SearchOperatorRequest {
	s.Tenant = &v
	return s
}

type SearchOperatorResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 操作员列表
	Operators []*Operator `json:"operators,omitempty" xml:"operators,omitempty" require:"true" type:"Repeated"`
	// 传入的页码, 如果没有传入, 则取默认值1
	PageNum *int64 `json:"page_num,omitempty" xml:"page_num,omitempty" require:"true"`
	// 传入的页大小, 如果没有传入, 则取默认值10
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
	// 查询结果的总条目数量
	TotalCount *int64 `json:"total_count,omitempty" xml:"total_count,omitempty" require:"true"`
}

func (s SearchOperatorResponse) String() string {
	return tea.Prettify(s)
}

func (s SearchOperatorResponse) GoString() string {
	return s.String()
}

func (s *SearchOperatorResponse) SetReqMsgId(v string) *SearchOperatorResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SearchOperatorResponse) SetResultCode(v string) *SearchOperatorResponse {
	s.ResultCode = &v
	return s
}

func (s *SearchOperatorResponse) SetResultMsg(v string) *SearchOperatorResponse {
	s.ResultMsg = &v
	return s
}

func (s *SearchOperatorResponse) SetOperators(v []*Operator) *SearchOperatorResponse {
	s.Operators = v
	return s
}

func (s *SearchOperatorResponse) SetPageNum(v int64) *SearchOperatorResponse {
	s.PageNum = &v
	return s
}

func (s *SearchOperatorResponse) SetPageSize(v int64) *SearchOperatorResponse {
	s.PageSize = &v
	return s
}

func (s *SearchOperatorResponse) SetTotalCount(v int64) *SearchOperatorResponse {
	s.TotalCount = &v
	return s
}

type CreateOperatorRequest struct {
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 企业唯一标识
	Customer *string `json:"customer,omitempty" xml:"customer,omitempty"`
	// 外部对接系统操作员ID
	ExternalId *string `json:"external_id,omitempty" xml:"external_id,omitempty"`
	// 外部对接系统类型
	ExternalSystem *string `json:"external_system,omitempty" xml:"external_system,omitempty"`
	// 操作员唯一登录名
	LoginName *string `json:"login_name,omitempty" xml:"login_name,omitempty" require:"true"`
	// 手机号
	Mobile *string `json:"mobile,omitempty" xml:"mobile,omitempty"`
	// 操作员昵称
	Nickname *string `json:"nickname,omitempty" xml:"nickname,omitempty"`
	// 操作员真实姓名
	RealName *string `json:"real_name,omitempty" xml:"real_name,omitempty" require:"true"`
	// 租户唯一标识
	Tenant *string `json:"tenant,omitempty" xml:"tenant,omitempty"`
	// 业务场景码
	BussinessCode *string `json:"bussiness_code,omitempty" xml:"bussiness_code,omitempty"`
}

func (s CreateOperatorRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateOperatorRequest) GoString() string {
	return s.String()
}

func (s *CreateOperatorRequest) SetAuthToken(v string) *CreateOperatorRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateOperatorRequest) SetCustomer(v string) *CreateOperatorRequest {
	s.Customer = &v
	return s
}

func (s *CreateOperatorRequest) SetExternalId(v string) *CreateOperatorRequest {
	s.ExternalId = &v
	return s
}

func (s *CreateOperatorRequest) SetExternalSystem(v string) *CreateOperatorRequest {
	s.ExternalSystem = &v
	return s
}

func (s *CreateOperatorRequest) SetLoginName(v string) *CreateOperatorRequest {
	s.LoginName = &v
	return s
}

func (s *CreateOperatorRequest) SetMobile(v string) *CreateOperatorRequest {
	s.Mobile = &v
	return s
}

func (s *CreateOperatorRequest) SetNickname(v string) *CreateOperatorRequest {
	s.Nickname = &v
	return s
}

func (s *CreateOperatorRequest) SetRealName(v string) *CreateOperatorRequest {
	s.RealName = &v
	return s
}

func (s *CreateOperatorRequest) SetTenant(v string) *CreateOperatorRequest {
	s.Tenant = &v
	return s
}

func (s *CreateOperatorRequest) SetBussinessCode(v string) *CreateOperatorRequest {
	s.BussinessCode = &v
	return s
}

type CreateOperatorResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 操作员唯一ID
	OperatorId *string `json:"operator_id,omitempty" xml:"operator_id,omitempty"`
}

func (s CreateOperatorResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateOperatorResponse) GoString() string {
	return s.String()
}

func (s *CreateOperatorResponse) SetReqMsgId(v string) *CreateOperatorResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateOperatorResponse) SetResultCode(v string) *CreateOperatorResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateOperatorResponse) SetResultMsg(v string) *CreateOperatorResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateOperatorResponse) SetOperatorId(v string) *CreateOperatorResponse {
	s.OperatorId = &v
	return s
}

type UpdateOperatorRequest struct {
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 邮箱
	Email *string `json:"email,omitempty" xml:"email,omitempty"`
	// 手机号
	Mobile *string `json:"mobile,omitempty" xml:"mobile,omitempty"`
	// 操作员昵称
	Nickname *string `json:"nickname,omitempty" xml:"nickname,omitempty"`
	// 操作员唯一ID
	OperatorId *string `json:"operator_id,omitempty" xml:"operator_id,omitempty" require:"true"`
	// 操作员真实姓名
	RealName *string `json:"real_name,omitempty" xml:"real_name,omitempty"`
}

func (s UpdateOperatorRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateOperatorRequest) GoString() string {
	return s.String()
}

func (s *UpdateOperatorRequest) SetAuthToken(v string) *UpdateOperatorRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateOperatorRequest) SetEmail(v string) *UpdateOperatorRequest {
	s.Email = &v
	return s
}

func (s *UpdateOperatorRequest) SetMobile(v string) *UpdateOperatorRequest {
	s.Mobile = &v
	return s
}

func (s *UpdateOperatorRequest) SetNickname(v string) *UpdateOperatorRequest {
	s.Nickname = &v
	return s
}

func (s *UpdateOperatorRequest) SetOperatorId(v string) *UpdateOperatorRequest {
	s.OperatorId = &v
	return s
}

func (s *UpdateOperatorRequest) SetRealName(v string) *UpdateOperatorRequest {
	s.RealName = &v
	return s
}

type UpdateOperatorResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 操作员创建时间，ISO8601格式
	CreateTime *string `json:"create_time,omitempty" xml:"create_time,omitempty"`
	// 操作员所在的企业
	Customer *string `json:"customer,omitempty" xml:"customer,omitempty" require:"true"`
	// 邮箱
	Email *string `json:"email,omitempty" xml:"email,omitempty" require:"true"`
	// 操作员ID
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 登录名
	LoginName *string `json:"login_name,omitempty" xml:"login_name,omitempty" require:"true"`
	// 手机号
	Mobile *string `json:"mobile,omitempty" xml:"mobile,omitempty" require:"true"`
	// 昵称
	Nickname *string `json:"nickname,omitempty" xml:"nickname,omitempty" require:"true"`
	// 真实姓名
	RealName *string `json:"real_name,omitempty" xml:"real_name,omitempty" require:"true"`
	// 操作员状态(INACTIVE：未激活，NORMAL：正常状态，FROZEN：冻结状态)
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 用户加入的租户列表
	Tenants []*string `json:"tenants,omitempty" xml:"tenants,omitempty" require:"true" type:"Repeated"`
	// 操作员最近一次修改时间，ISO8601格式
	UpdateTime *string `json:"update_time,omitempty" xml:"update_time,omitempty"`
}

func (s UpdateOperatorResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateOperatorResponse) GoString() string {
	return s.String()
}

func (s *UpdateOperatorResponse) SetReqMsgId(v string) *UpdateOperatorResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateOperatorResponse) SetResultCode(v string) *UpdateOperatorResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateOperatorResponse) SetResultMsg(v string) *UpdateOperatorResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateOperatorResponse) SetCreateTime(v string) *UpdateOperatorResponse {
	s.CreateTime = &v
	return s
}

func (s *UpdateOperatorResponse) SetCustomer(v string) *UpdateOperatorResponse {
	s.Customer = &v
	return s
}

func (s *UpdateOperatorResponse) SetEmail(v string) *UpdateOperatorResponse {
	s.Email = &v
	return s
}

func (s *UpdateOperatorResponse) SetId(v string) *UpdateOperatorResponse {
	s.Id = &v
	return s
}

func (s *UpdateOperatorResponse) SetLoginName(v string) *UpdateOperatorResponse {
	s.LoginName = &v
	return s
}

func (s *UpdateOperatorResponse) SetMobile(v string) *UpdateOperatorResponse {
	s.Mobile = &v
	return s
}

func (s *UpdateOperatorResponse) SetNickname(v string) *UpdateOperatorResponse {
	s.Nickname = &v
	return s
}

func (s *UpdateOperatorResponse) SetRealName(v string) *UpdateOperatorResponse {
	s.RealName = &v
	return s
}

func (s *UpdateOperatorResponse) SetStatus(v string) *UpdateOperatorResponse {
	s.Status = &v
	return s
}

func (s *UpdateOperatorResponse) SetTenants(v []*string) *UpdateOperatorResponse {
	s.Tenants = v
	return s
}

func (s *UpdateOperatorResponse) SetUpdateTime(v string) *UpdateOperatorResponse {
	s.UpdateTime = &v
	return s
}

type DeleteOperatorRequest struct {
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 操作员唯一id
	OperatorId *string `json:"operator_id,omitempty" xml:"operator_id,omitempty" require:"true"`
}

func (s DeleteOperatorRequest) String() string {
	return tea.Prettify(s)
}

func (s DeleteOperatorRequest) GoString() string {
	return s.String()
}

func (s *DeleteOperatorRequest) SetAuthToken(v string) *DeleteOperatorRequest {
	s.AuthToken = &v
	return s
}

func (s *DeleteOperatorRequest) SetOperatorId(v string) *DeleteOperatorRequest {
	s.OperatorId = &v
	return s
}

type DeleteOperatorResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s DeleteOperatorResponse) String() string {
	return tea.Prettify(s)
}

func (s DeleteOperatorResponse) GoString() string {
	return s.String()
}

func (s *DeleteOperatorResponse) SetReqMsgId(v string) *DeleteOperatorResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DeleteOperatorResponse) SetResultCode(v string) *DeleteOperatorResponse {
	s.ResultCode = &v
	return s
}

func (s *DeleteOperatorResponse) SetResultMsg(v string) *DeleteOperatorResponse {
	s.ResultMsg = &v
	return s
}

type AddTenantMemberRequest struct {
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 操作员唯一id
	OperatorId *string `json:"operator_id,omitempty" xml:"operator_id,omitempty" require:"true"`
	// 操作员唯一id
	Tenant *string `json:"tenant,omitempty" xml:"tenant,omitempty" require:"true"`
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

func (s *AddTenantMemberRequest) SetTenant(v string) *AddTenantMemberRequest {
	s.Tenant = &v
	return s
}

type AddTenantMemberResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
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

type CreateTenantRequest struct {
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 蚂蚁通行证uid
	AntUid *string `json:"ant_uid,omitempty" xml:"ant_uid,omitempty" require:"true"`
	// 金融云官网:ANTCLOUD, 蚂蚁开放平台：ANTOPEN, 口碑：KOUBEI
	BusinessOwnerId *string `json:"business_owner_id,omitempty" xml:"business_owner_id,omitempty"`
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

func (s *CreateTenantRequest) SetAntUid(v string) *CreateTenantRequest {
	s.AntUid = &v
	return s
}

func (s *CreateTenantRequest) SetBusinessOwnerId(v string) *CreateTenantRequest {
	s.BusinessOwnerId = &v
	return s
}

type CreateTenantResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 租户唯一标识
	Tenant *string `json:"tenant,omitempty" xml:"tenant,omitempty" require:"true"`
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

func (s *CreateTenantResponse) SetTenant(v string) *CreateTenantResponse {
	s.Tenant = &v
	return s
}

type GetTenantRequest struct {
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 租户唯一标识
	Tenant *string `json:"tenant,omitempty" xml:"tenant,omitempty" require:"true"`
}

func (s GetTenantRequest) String() string {
	return tea.Prettify(s)
}

func (s GetTenantRequest) GoString() string {
	return s.String()
}

func (s *GetTenantRequest) SetAuthToken(v string) *GetTenantRequest {
	s.AuthToken = &v
	return s
}

func (s *GetTenantRequest) SetTenant(v string) *GetTenantRequest {
	s.Tenant = &v
	return s
}

type GetTenantResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 蚂蚁通行证签约账户
	AntAccount *string `json:"ant_account,omitempty" xml:"ant_account,omitempty" require:"true"`
	// 蚂蚁通行证uid
	AntUid *string `json:"ant_uid,omitempty" xml:"ant_uid,omitempty" require:"true"`
	// 金融云官网:ANTCLOUD,蚂蚁开放平台：ANTOPEN
	BusinessOwnerId *string `json:"business_owner_id,omitempty" xml:"business_owner_id,omitempty" require:"true"`
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
}

func (s GetTenantResponse) String() string {
	return tea.Prettify(s)
}

func (s GetTenantResponse) GoString() string {
	return s.String()
}

func (s *GetTenantResponse) SetReqMsgId(v string) *GetTenantResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetTenantResponse) SetResultCode(v string) *GetTenantResponse {
	s.ResultCode = &v
	return s
}

func (s *GetTenantResponse) SetResultMsg(v string) *GetTenantResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetTenantResponse) SetAntAccount(v string) *GetTenantResponse {
	s.AntAccount = &v
	return s
}

func (s *GetTenantResponse) SetAntUid(v string) *GetTenantResponse {
	s.AntUid = &v
	return s
}

func (s *GetTenantResponse) SetBusinessOwnerId(v string) *GetTenantResponse {
	s.BusinessOwnerId = &v
	return s
}

func (s *GetTenantResponse) SetCreateTime(v string) *GetTenantResponse {
	s.CreateTime = &v
	return s
}

func (s *GetTenantResponse) SetCustomer(v string) *GetTenantResponse {
	s.Customer = &v
	return s
}

func (s *GetTenantResponse) SetDescription(v string) *GetTenantResponse {
	s.Description = &v
	return s
}

func (s *GetTenantResponse) SetId(v string) *GetTenantResponse {
	s.Id = &v
	return s
}

func (s *GetTenantResponse) SetInternalId(v string) *GetTenantResponse {
	s.InternalId = &v
	return s
}

func (s *GetTenantResponse) SetName(v string) *GetTenantResponse {
	s.Name = &v
	return s
}

func (s *GetTenantResponse) SetUpdateTime(v string) *GetTenantResponse {
	s.UpdateTime = &v
	return s
}

type QueryTenantRequest struct {
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 企业唯一标识
	Customer *string `json:"customer,omitempty" xml:"customer,omitempty" require:"true"`
	// 当前页，默认值为1
	PageNum *int64 `json:"page_num,omitempty" xml:"page_num,omitempty"`
	// 分页大小，默认值为10
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
}

func (s QueryTenantRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryTenantRequest) GoString() string {
	return s.String()
}

func (s *QueryTenantRequest) SetAuthToken(v string) *QueryTenantRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryTenantRequest) SetCustomer(v string) *QueryTenantRequest {
	s.Customer = &v
	return s
}

func (s *QueryTenantRequest) SetPageNum(v int64) *QueryTenantRequest {
	s.PageNum = &v
	return s
}

func (s *QueryTenantRequest) SetPageSize(v int64) *QueryTenantRequest {
	s.PageSize = &v
	return s
}

type QueryTenantResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 传入的页码, 如果没有传入, 则取默认值1
	PageNum *int64 `json:"page_num,omitempty" xml:"page_num,omitempty" require:"true"`
	// 传入的页大小, 如果没有传入, 则取默认值10
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
	// 租户列表
	Tenants []*Tenant `json:"tenants,omitempty" xml:"tenants,omitempty" require:"true" type:"Repeated"`
	// 查询结果的总条目数量
	TotalCount *int64 `json:"total_count,omitempty" xml:"total_count,omitempty" require:"true"`
}

func (s QueryTenantResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryTenantResponse) GoString() string {
	return s.String()
}

func (s *QueryTenantResponse) SetReqMsgId(v string) *QueryTenantResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryTenantResponse) SetResultCode(v string) *QueryTenantResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryTenantResponse) SetResultMsg(v string) *QueryTenantResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryTenantResponse) SetPageNum(v int64) *QueryTenantResponse {
	s.PageNum = &v
	return s
}

func (s *QueryTenantResponse) SetPageSize(v int64) *QueryTenantResponse {
	s.PageSize = &v
	return s
}

func (s *QueryTenantResponse) SetTenants(v []*Tenant) *QueryTenantResponse {
	s.Tenants = v
	return s
}

func (s *QueryTenantResponse) SetTotalCount(v int64) *QueryTenantResponse {
	s.TotalCount = &v
	return s
}

type GetAntpassportTenantRequest struct {
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 蚂蚁通行证uid
	AntUid *string `json:"ant_uid,omitempty" xml:"ant_uid,omitempty" require:"true"`
}

func (s GetAntpassportTenantRequest) String() string {
	return tea.Prettify(s)
}

func (s GetAntpassportTenantRequest) GoString() string {
	return s.String()
}

func (s *GetAntpassportTenantRequest) SetAuthToken(v string) *GetAntpassportTenantRequest {
	s.AuthToken = &v
	return s
}

func (s *GetAntpassportTenantRequest) SetAntUid(v string) *GetAntpassportTenantRequest {
	s.AntUid = &v
	return s
}

type GetAntpassportTenantResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	Tenant     *string `json:"tenant,omitempty" xml:"tenant,omitempty" require:"true"`
}

func (s GetAntpassportTenantResponse) String() string {
	return tea.Prettify(s)
}

func (s GetAntpassportTenantResponse) GoString() string {
	return s.String()
}

func (s *GetAntpassportTenantResponse) SetReqMsgId(v string) *GetAntpassportTenantResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetAntpassportTenantResponse) SetResultCode(v string) *GetAntpassportTenantResponse {
	s.ResultCode = &v
	return s
}

func (s *GetAntpassportTenantResponse) SetResultMsg(v string) *GetAntpassportTenantResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetAntpassportTenantResponse) SetTenant(v string) *GetAntpassportTenantResponse {
	s.Tenant = &v
	return s
}

type ListAccesskeyRequest struct {
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 操作员或服务账号唯一ID
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
}

func (s ListAccesskeyRequest) String() string {
	return tea.Prettify(s)
}

func (s ListAccesskeyRequest) GoString() string {
	return s.String()
}

func (s *ListAccesskeyRequest) SetAuthToken(v string) *ListAccesskeyRequest {
	s.AuthToken = &v
	return s
}

func (s *ListAccesskeyRequest) SetUserId(v string) *ListAccesskeyRequest {
	s.UserId = &v
	return s
}

type ListAccesskeyResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// AccessKey列表
	AccessKeys []*AccessKey `json:"access_keys,omitempty" xml:"access_keys,omitempty" require:"true" type:"Repeated"`
}

func (s ListAccesskeyResponse) String() string {
	return tea.Prettify(s)
}

func (s ListAccesskeyResponse) GoString() string {
	return s.String()
}

func (s *ListAccesskeyResponse) SetReqMsgId(v string) *ListAccesskeyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListAccesskeyResponse) SetResultCode(v string) *ListAccesskeyResponse {
	s.ResultCode = &v
	return s
}

func (s *ListAccesskeyResponse) SetResultMsg(v string) *ListAccesskeyResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListAccesskeyResponse) SetAccessKeys(v []*AccessKey) *ListAccesskeyResponse {
	s.AccessKeys = v
	return s
}

type GetCurrentidRequest struct {
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
}

func (s GetCurrentidRequest) String() string {
	return tea.Prettify(s)
}

func (s GetCurrentidRequest) GoString() string {
	return s.String()
}

func (s *GetCurrentidRequest) SetAuthToken(v string) *GetCurrentidRequest {
	s.AuthToken = &v
	return s
}

type GetCurrentidResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 创建时间，ISO8601格式
	CreateTime *string `json:"create_time,omitempty" xml:"create_time,omitempty" require:"true"`
	// 身份实体所属企业
	Customer *string `json:"customer,omitempty" xml:"customer,omitempty" require:"true"`
	// 身份实体ID
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 身份实体类型，OPERATOR(操作员)或SERVICE(服务账号)
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 最近一次修改时间，ISO8601格式
	UpdateTime *string `json:"update_time,omitempty" xml:"update_time,omitempty" require:"true"`
}

func (s GetCurrentidResponse) String() string {
	return tea.Prettify(s)
}

func (s GetCurrentidResponse) GoString() string {
	return s.String()
}

func (s *GetCurrentidResponse) SetReqMsgId(v string) *GetCurrentidResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetCurrentidResponse) SetResultCode(v string) *GetCurrentidResponse {
	s.ResultCode = &v
	return s
}

func (s *GetCurrentidResponse) SetResultMsg(v string) *GetCurrentidResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetCurrentidResponse) SetCreateTime(v string) *GetCurrentidResponse {
	s.CreateTime = &v
	return s
}

func (s *GetCurrentidResponse) SetCustomer(v string) *GetCurrentidResponse {
	s.Customer = &v
	return s
}

func (s *GetCurrentidResponse) SetId(v string) *GetCurrentidResponse {
	s.Id = &v
	return s
}

func (s *GetCurrentidResponse) SetType(v string) *GetCurrentidResponse {
	s.Type = &v
	return s
}

func (s *GetCurrentidResponse) SetUpdateTime(v string) *GetCurrentidResponse {
	s.UpdateTime = &v
	return s
}

type GetAccessorRequest struct {
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// Accessor关联的accessKey
	AccessKeyId *string `json:"access_key_id,omitempty" xml:"access_key_id,omitempty"`
	// 租户唯一标识
	Tenant *string `json:"tenant,omitempty" xml:"tenant,omitempty"`
	// 操作员或服务账号唯一ID
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty"`
}

func (s GetAccessorRequest) String() string {
	return tea.Prettify(s)
}

func (s GetAccessorRequest) GoString() string {
	return s.String()
}

func (s *GetAccessorRequest) SetAuthToken(v string) *GetAccessorRequest {
	s.AuthToken = &v
	return s
}

func (s *GetAccessorRequest) SetAccessKeyId(v string) *GetAccessorRequest {
	s.AccessKeyId = &v
	return s
}

func (s *GetAccessorRequest) SetTenant(v string) *GetAccessorRequest {
	s.Tenant = &v
	return s
}

func (s *GetAccessorRequest) SetUserId(v string) *GetAccessorRequest {
	s.UserId = &v
	return s
}

type GetAccessorResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
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
	// 关联的租户
	Tenant *string `json:"tenant,omitempty" xml:"tenant,omitempty"`
	// Accessor类型(RAM/ACCOUNT)
	Type *string `json:"type,omitempty" xml:"type,omitempty"`
	// 关联的用户ID
	UserId *string `json:"userId,omitempty" xml:"userId,omitempty"`
}

func (s GetAccessorResponse) String() string {
	return tea.Prettify(s)
}

func (s GetAccessorResponse) GoString() string {
	return s.String()
}

func (s *GetAccessorResponse) SetReqMsgId(v string) *GetAccessorResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetAccessorResponse) SetResultCode(v string) *GetAccessorResponse {
	s.ResultCode = &v
	return s
}

func (s *GetAccessorResponse) SetResultMsg(v string) *GetAccessorResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetAccessorResponse) SetAccessKey(v string) *GetAccessorResponse {
	s.AccessKey = &v
	return s
}

func (s *GetAccessorResponse) SetAccessSecret(v string) *GetAccessorResponse {
	s.AccessSecret = &v
	return s
}

func (s *GetAccessorResponse) SetAccount(v string) *GetAccessorResponse {
	s.Account = &v
	return s
}

func (s *GetAccessorResponse) SetCreateTime(v string) *GetAccessorResponse {
	s.CreateTime = &v
	return s
}

func (s *GetAccessorResponse) SetId(v string) *GetAccessorResponse {
	s.Id = &v
	return s
}

func (s *GetAccessorResponse) SetTenant(v string) *GetAccessorResponse {
	s.Tenant = &v
	return s
}

func (s *GetAccessorResponse) SetType(v string) *GetAccessorResponse {
	s.Type = &v
	return s
}

func (s *GetAccessorResponse) SetUserId(v string) *GetAccessorResponse {
	s.UserId = &v
	return s
}

type GetTenantDingtokenRequest struct {
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 入驻金融云的产品码
	Product *string `json:"product,omitempty" xml:"product,omitempty" require:"true"`
	// 租户唯一标识
	Tenant *string `json:"tenant,omitempty" xml:"tenant,omitempty" require:"true"`
}

func (s GetTenantDingtokenRequest) String() string {
	return tea.Prettify(s)
}

func (s GetTenantDingtokenRequest) GoString() string {
	return s.String()
}

func (s *GetTenantDingtokenRequest) SetAuthToken(v string) *GetTenantDingtokenRequest {
	s.AuthToken = &v
	return s
}

func (s *GetTenantDingtokenRequest) SetProduct(v string) *GetTenantDingtokenRequest {
	s.Product = &v
	return s
}

func (s *GetTenantDingtokenRequest) SetTenant(v string) *GetTenantDingtokenRequest {
	s.Tenant = &v
	return s
}

type GetTenantDingtokenResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 钉钉企业授权token
	AccessToken *string `json:"access_token,omitempty" xml:"access_token,omitempty" require:"true"`
	// 	钉钉企业授权应用ID
	AgentId *string `json:"agent_id,omitempty" xml:"agent_id,omitempty" require:"true"`
	// 钉钉企业ID
	CorpId *string `json:"corp_id,omitempty" xml:"corp_id,omitempty" require:"true"`
	// 创建时间，ISO8601格式
	CreateTime *string `json:"create_time,omitempty" xml:"create_time,omitempty"`
	// 前端授权ticket
	JsTicket *string `json:"js_ticket,omitempty" xml:"js_ticket,omitempty" require:"true"`
	// 最近一次修改时间，ISO8601格式
	UpdateTime *string `json:"update_time,omitempty" xml:"update_time,omitempty"`
}

func (s GetTenantDingtokenResponse) String() string {
	return tea.Prettify(s)
}

func (s GetTenantDingtokenResponse) GoString() string {
	return s.String()
}

func (s *GetTenantDingtokenResponse) SetReqMsgId(v string) *GetTenantDingtokenResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetTenantDingtokenResponse) SetResultCode(v string) *GetTenantDingtokenResponse {
	s.ResultCode = &v
	return s
}

func (s *GetTenantDingtokenResponse) SetResultMsg(v string) *GetTenantDingtokenResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetTenantDingtokenResponse) SetAccessToken(v string) *GetTenantDingtokenResponse {
	s.AccessToken = &v
	return s
}

func (s *GetTenantDingtokenResponse) SetAgentId(v string) *GetTenantDingtokenResponse {
	s.AgentId = &v
	return s
}

func (s *GetTenantDingtokenResponse) SetCorpId(v string) *GetTenantDingtokenResponse {
	s.CorpId = &v
	return s
}

func (s *GetTenantDingtokenResponse) SetCreateTime(v string) *GetTenantDingtokenResponse {
	s.CreateTime = &v
	return s
}

func (s *GetTenantDingtokenResponse) SetJsTicket(v string) *GetTenantDingtokenResponse {
	s.JsTicket = &v
	return s
}

func (s *GetTenantDingtokenResponse) SetUpdateTime(v string) *GetTenantDingtokenResponse {
	s.UpdateTime = &v
	return s
}

type QueryAdminRequest struct {
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 租户唯一标识
	Tenant *string `json:"tenant,omitempty" xml:"tenant,omitempty" require:"true"`
}

func (s QueryAdminRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAdminRequest) GoString() string {
	return s.String()
}

func (s *QueryAdminRequest) SetAuthToken(v string) *QueryAdminRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAdminRequest) SetTenant(v string) *QueryAdminRequest {
	s.Tenant = &v
	return s
}

type QueryAdminResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 操作员列表
	Operators []*Operator `json:"operators,omitempty" xml:"operators,omitempty" require:"true" type:"Repeated"`
}

func (s QueryAdminResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAdminResponse) GoString() string {
	return s.String()
}

func (s *QueryAdminResponse) SetReqMsgId(v string) *QueryAdminResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAdminResponse) SetResultCode(v string) *QueryAdminResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAdminResponse) SetResultMsg(v string) *QueryAdminResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAdminResponse) SetOperators(v []*Operator) *QueryAdminResponse {
	s.Operators = v
	return s
}

type GetTenantIaasaccountRequest struct {
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 租户唯一标识
	Tenant *string `json:"tenant,omitempty" xml:"tenant,omitempty" require:"true"`
}

func (s GetTenantIaasaccountRequest) String() string {
	return tea.Prettify(s)
}

func (s GetTenantIaasaccountRequest) GoString() string {
	return s.String()
}

func (s *GetTenantIaasaccountRequest) SetAuthToken(v string) *GetTenantIaasaccountRequest {
	s.AuthToken = &v
	return s
}

func (s *GetTenantIaasaccountRequest) SetTenant(v string) *GetTenantIaasaccountRequest {
	s.Tenant = &v
	return s
}

type GetTenantIaasaccountResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 账户关联的AccessKey
	AccessKey *string `json:"access_key,omitempty" xml:"access_key,omitempty"`
	// 账户关联的AccessSecret
	AccessSecret *string `json:"access_secret,omitempty" xml:"access_secret,omitempty"`
	// IaaS账户名
	Account *string `json:"account,omitempty" xml:"account,omitempty"`
	// 创建时间，ISO8601格式
	CreateTime *string `json:"create_time,omitempty" xml:"create_time,omitempty"`
	// IaaS账户id
	Id *string `json:"id,omitempty" xml:"id,omitempty"`
}

func (s GetTenantIaasaccountResponse) String() string {
	return tea.Prettify(s)
}

func (s GetTenantIaasaccountResponse) GoString() string {
	return s.String()
}

func (s *GetTenantIaasaccountResponse) SetReqMsgId(v string) *GetTenantIaasaccountResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetTenantIaasaccountResponse) SetResultCode(v string) *GetTenantIaasaccountResponse {
	s.ResultCode = &v
	return s
}

func (s *GetTenantIaasaccountResponse) SetResultMsg(v string) *GetTenantIaasaccountResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetTenantIaasaccountResponse) SetAccessKey(v string) *GetTenantIaasaccountResponse {
	s.AccessKey = &v
	return s
}

func (s *GetTenantIaasaccountResponse) SetAccessSecret(v string) *GetTenantIaasaccountResponse {
	s.AccessSecret = &v
	return s
}

func (s *GetTenantIaasaccountResponse) SetAccount(v string) *GetTenantIaasaccountResponse {
	s.Account = &v
	return s
}

func (s *GetTenantIaasaccountResponse) SetCreateTime(v string) *GetTenantIaasaccountResponse {
	s.CreateTime = &v
	return s
}

func (s *GetTenantIaasaccountResponse) SetId(v string) *GetTenantIaasaccountResponse {
	s.Id = &v
	return s
}

type ListCustomerRequest struct {
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
}

func (s ListCustomerRequest) String() string {
	return tea.Prettify(s)
}

func (s ListCustomerRequest) GoString() string {
	return s.String()
}

func (s *ListCustomerRequest) SetAuthToken(v string) *ListCustomerRequest {
	s.AuthToken = &v
	return s
}

type ListCustomerResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 企业列表
	Customers []*Customer `json:"customers,omitempty" xml:"customers,omitempty" require:"true" type:"Repeated"`
}

func (s ListCustomerResponse) String() string {
	return tea.Prettify(s)
}

func (s ListCustomerResponse) GoString() string {
	return s.String()
}

func (s *ListCustomerResponse) SetReqMsgId(v string) *ListCustomerResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListCustomerResponse) SetResultCode(v string) *ListCustomerResponse {
	s.ResultCode = &v
	return s
}

func (s *ListCustomerResponse) SetResultMsg(v string) *ListCustomerResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListCustomerResponse) SetCustomers(v []*Customer) *ListCustomerResponse {
	s.Customers = v
	return s
}

type CheckAlipayTenantRequest struct {
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 支付宝账号关联的证件号
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty"`
	// 渠道编码 ，新接入时需要申请
	ChannelCode *string `json:"channel_code,omitempty" xml:"channel_code,omitempty" require:"true"`
	// 企业名称
	FirmName *string `json:"firm_name,omitempty" xml:"firm_name,omitempty"`
	// 法人姓名
	RealName *string `json:"real_name,omitempty" xml:"real_name,omitempty"`
	// 业务场景编码
	SceneCode *string `json:"scene_code,omitempty" xml:"scene_code,omitempty" require:"true"`
	// 智科租户id(支付宝账号会员id）
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
}

func (s CheckAlipayTenantRequest) String() string {
	return tea.Prettify(s)
}

func (s CheckAlipayTenantRequest) GoString() string {
	return s.String()
}

func (s *CheckAlipayTenantRequest) SetAuthToken(v string) *CheckAlipayTenantRequest {
	s.AuthToken = &v
	return s
}

func (s *CheckAlipayTenantRequest) SetCertNo(v string) *CheckAlipayTenantRequest {
	s.CertNo = &v
	return s
}

func (s *CheckAlipayTenantRequest) SetChannelCode(v string) *CheckAlipayTenantRequest {
	s.ChannelCode = &v
	return s
}

func (s *CheckAlipayTenantRequest) SetFirmName(v string) *CheckAlipayTenantRequest {
	s.FirmName = &v
	return s
}

func (s *CheckAlipayTenantRequest) SetRealName(v string) *CheckAlipayTenantRequest {
	s.RealName = &v
	return s
}

func (s *CheckAlipayTenantRequest) SetSceneCode(v string) *CheckAlipayTenantRequest {
	s.SceneCode = &v
	return s
}

func (s *CheckAlipayTenantRequest) SetTenantId(v string) *CheckAlipayTenantRequest {
	s.TenantId = &v
	return s
}

type CheckAlipayTenantResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 智科租户id(支付宝会员id)
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
}

func (s CheckAlipayTenantResponse) String() string {
	return tea.Prettify(s)
}

func (s CheckAlipayTenantResponse) GoString() string {
	return s.String()
}

func (s *CheckAlipayTenantResponse) SetReqMsgId(v string) *CheckAlipayTenantResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CheckAlipayTenantResponse) SetResultCode(v string) *CheckAlipayTenantResponse {
	s.ResultCode = &v
	return s
}

func (s *CheckAlipayTenantResponse) SetResultMsg(v string) *CheckAlipayTenantResponse {
	s.ResultMsg = &v
	return s
}

func (s *CheckAlipayTenantResponse) SetTenantId(v string) *CheckAlipayTenantResponse {
	s.TenantId = &v
	return s
}

type QueryTenantStatusRequest struct {
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 渠道码，接入时需要申请
	ChannelCode *string `json:"channel_code,omitempty" xml:"channel_code,omitempty" require:"true"`
	// 业务场景码，接入时需要申请
	SceneCode *string `json:"scene_code,omitempty" xml:"scene_code,omitempty" require:"true"`
	// 智科租户id（支付宝会员id)
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
}

func (s QueryTenantStatusRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryTenantStatusRequest) GoString() string {
	return s.String()
}

func (s *QueryTenantStatusRequest) SetAuthToken(v string) *QueryTenantStatusRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryTenantStatusRequest) SetChannelCode(v string) *QueryTenantStatusRequest {
	s.ChannelCode = &v
	return s
}

func (s *QueryTenantStatusRequest) SetSceneCode(v string) *QueryTenantStatusRequest {
	s.SceneCode = &v
	return s
}

func (s *QueryTenantStatusRequest) SetTenantId(v string) *QueryTenantStatusRequest {
	s.TenantId = &v
	return s
}

type QueryTenantStatusResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 租户入住状态
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 智科租户id（支付宝会员id）
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
}

func (s QueryTenantStatusResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryTenantStatusResponse) GoString() string {
	return s.String()
}

func (s *QueryTenantStatusResponse) SetReqMsgId(v string) *QueryTenantStatusResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryTenantStatusResponse) SetResultCode(v string) *QueryTenantStatusResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryTenantStatusResponse) SetResultMsg(v string) *QueryTenantStatusResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryTenantStatusResponse) SetStatus(v string) *QueryTenantStatusResponse {
	s.Status = &v
	return s
}

func (s *QueryTenantStatusResponse) SetTenantId(v string) *QueryTenantStatusResponse {
	s.TenantId = &v
	return s
}

type CreateAntchainTenantRequest struct {
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 企业名称或个人名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 客户类型
	// PERSON("个人","1"),
	// ENTERPRISE("企业","2")
	UserType *string `json:"user_type,omitempty" xml:"user_type,omitempty" require:"true"`
	// 证件号
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty"`
	// 证件类型
	CertType *string `json:"cert_type,omitempty" xml:"cert_type,omitempty"`
	// 法人姓名
	RealName *string `json:"real_name,omitempty" xml:"real_name,omitempty"`
	// 法人证件号
	ArtificialPersonCertNo *string `json:"artificial_person_cert_no,omitempty" xml:"artificial_person_cert_no,omitempty"`
	// 法人证件类型
	ArtificialPersonCertType *string `json:"artificial_person_cert_type,omitempty" xml:"artificial_person_cert_type,omitempty"`
	// 支付宝登录号
	LoginName *string `json:"login_name,omitempty" xml:"login_name,omitempty"`
	// 支付宝uid(租户id)
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 业务场景码
	BussinessCode *string `json:"bussiness_code,omitempty" xml:"bussiness_code,omitempty" require:"true"`
	// 在平台上的角色，比如服务提供方，服务消费方，合作机构，资金提供方
	BussinessRole *string `json:"bussiness_role,omitempty" xml:"bussiness_role,omitempty"`
	// 是否支付宝账户入驻
	IsAlipayTenant *bool `json:"is_alipay_tenant,omitempty" xml:"is_alipay_tenant,omitempty" require:"true"`
	// 是否认证过，不填默认未认证
	AntchainCertified *bool `json:"antchain_certified,omitempty" xml:"antchain_certified,omitempty"`
}

func (s CreateAntchainTenantRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateAntchainTenantRequest) GoString() string {
	return s.String()
}

func (s *CreateAntchainTenantRequest) SetAuthToken(v string) *CreateAntchainTenantRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateAntchainTenantRequest) SetName(v string) *CreateAntchainTenantRequest {
	s.Name = &v
	return s
}

func (s *CreateAntchainTenantRequest) SetUserType(v string) *CreateAntchainTenantRequest {
	s.UserType = &v
	return s
}

func (s *CreateAntchainTenantRequest) SetCertNo(v string) *CreateAntchainTenantRequest {
	s.CertNo = &v
	return s
}

func (s *CreateAntchainTenantRequest) SetCertType(v string) *CreateAntchainTenantRequest {
	s.CertType = &v
	return s
}

func (s *CreateAntchainTenantRequest) SetRealName(v string) *CreateAntchainTenantRequest {
	s.RealName = &v
	return s
}

func (s *CreateAntchainTenantRequest) SetArtificialPersonCertNo(v string) *CreateAntchainTenantRequest {
	s.ArtificialPersonCertNo = &v
	return s
}

func (s *CreateAntchainTenantRequest) SetArtificialPersonCertType(v string) *CreateAntchainTenantRequest {
	s.ArtificialPersonCertType = &v
	return s
}

func (s *CreateAntchainTenantRequest) SetLoginName(v string) *CreateAntchainTenantRequest {
	s.LoginName = &v
	return s
}

func (s *CreateAntchainTenantRequest) SetTenantId(v string) *CreateAntchainTenantRequest {
	s.TenantId = &v
	return s
}

func (s *CreateAntchainTenantRequest) SetBussinessCode(v string) *CreateAntchainTenantRequest {
	s.BussinessCode = &v
	return s
}

func (s *CreateAntchainTenantRequest) SetBussinessRole(v string) *CreateAntchainTenantRequest {
	s.BussinessRole = &v
	return s
}

func (s *CreateAntchainTenantRequest) SetIsAlipayTenant(v bool) *CreateAntchainTenantRequest {
	s.IsAlipayTenant = &v
	return s
}

func (s *CreateAntchainTenantRequest) SetAntchainCertified(v bool) *CreateAntchainTenantRequest {
	s.AntchainCertified = &v
	return s
}

type CreateAntchainTenantResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 客户id
	CustomerId *string `json:"customer_id,omitempty" xml:"customer_id,omitempty"`
}

func (s CreateAntchainTenantResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateAntchainTenantResponse) GoString() string {
	return s.String()
}

func (s *CreateAntchainTenantResponse) SetReqMsgId(v string) *CreateAntchainTenantResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateAntchainTenantResponse) SetResultCode(v string) *CreateAntchainTenantResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateAntchainTenantResponse) SetResultMsg(v string) *CreateAntchainTenantResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateAntchainTenantResponse) SetTenantId(v string) *CreateAntchainTenantResponse {
	s.TenantId = &v
	return s
}

func (s *CreateAntchainTenantResponse) SetCustomerId(v string) *CreateAntchainTenantResponse {
	s.CustomerId = &v
	return s
}

type UpdateCustomerIdentityRequest struct {
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 客户id
	CustomerId *string `json:"customer_id,omitempty" xml:"customer_id,omitempty"`
	// 企业名称或个人名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 证件号
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty" require:"true"`
	// 证件类型
	CertType *string `json:"cert_type,omitempty" xml:"cert_type,omitempty" require:"true"`
	// 法人姓名
	RealName *string `json:"real_name,omitempty" xml:"real_name,omitempty"`
	// 法人证件号码
	ArtificialPersonCertNo *string `json:"artificial_person_cert_no,omitempty" xml:"artificial_person_cert_no,omitempty"`
	// 法人证件类型
	ArtificialPersonCertType *string `json:"artificial_person_cert_type,omitempty" xml:"artificial_person_cert_type,omitempty"`
	// 业务场景码
	BusinessCode *string `json:"business_code,omitempty" xml:"business_code,omitempty" require:"true"`
	// 业务角色
	BussinessRole *string `json:"bussiness_role,omitempty" xml:"bussiness_role,omitempty"`
}

func (s UpdateCustomerIdentityRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateCustomerIdentityRequest) GoString() string {
	return s.String()
}

func (s *UpdateCustomerIdentityRequest) SetAuthToken(v string) *UpdateCustomerIdentityRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateCustomerIdentityRequest) SetCustomerId(v string) *UpdateCustomerIdentityRequest {
	s.CustomerId = &v
	return s
}

func (s *UpdateCustomerIdentityRequest) SetName(v string) *UpdateCustomerIdentityRequest {
	s.Name = &v
	return s
}

func (s *UpdateCustomerIdentityRequest) SetTenantId(v string) *UpdateCustomerIdentityRequest {
	s.TenantId = &v
	return s
}

func (s *UpdateCustomerIdentityRequest) SetCertNo(v string) *UpdateCustomerIdentityRequest {
	s.CertNo = &v
	return s
}

func (s *UpdateCustomerIdentityRequest) SetCertType(v string) *UpdateCustomerIdentityRequest {
	s.CertType = &v
	return s
}

func (s *UpdateCustomerIdentityRequest) SetRealName(v string) *UpdateCustomerIdentityRequest {
	s.RealName = &v
	return s
}

func (s *UpdateCustomerIdentityRequest) SetArtificialPersonCertNo(v string) *UpdateCustomerIdentityRequest {
	s.ArtificialPersonCertNo = &v
	return s
}

func (s *UpdateCustomerIdentityRequest) SetArtificialPersonCertType(v string) *UpdateCustomerIdentityRequest {
	s.ArtificialPersonCertType = &v
	return s
}

func (s *UpdateCustomerIdentityRequest) SetBusinessCode(v string) *UpdateCustomerIdentityRequest {
	s.BusinessCode = &v
	return s
}

func (s *UpdateCustomerIdentityRequest) SetBussinessRole(v string) *UpdateCustomerIdentityRequest {
	s.BussinessRole = &v
	return s
}

type UpdateCustomerIdentityResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回客户id
	CustomerId *string `json:"customer_id,omitempty" xml:"customer_id,omitempty"`
}

func (s UpdateCustomerIdentityResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateCustomerIdentityResponse) GoString() string {
	return s.String()
}

func (s *UpdateCustomerIdentityResponse) SetReqMsgId(v string) *UpdateCustomerIdentityResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateCustomerIdentityResponse) SetResultCode(v string) *UpdateCustomerIdentityResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateCustomerIdentityResponse) SetResultMsg(v string) *UpdateCustomerIdentityResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateCustomerIdentityResponse) SetCustomerId(v string) *UpdateCustomerIdentityResponse {
	s.CustomerId = &v
	return s
}

type CheckLoginIdRequest struct {
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 登录id
	LoginName *string `json:"login_name,omitempty" xml:"login_name,omitempty" require:"true"`
}

func (s CheckLoginIdRequest) String() string {
	return tea.Prettify(s)
}

func (s CheckLoginIdRequest) GoString() string {
	return s.String()
}

func (s *CheckLoginIdRequest) SetAuthToken(v string) *CheckLoginIdRequest {
	s.AuthToken = &v
	return s
}

func (s *CheckLoginIdRequest) SetLoginName(v string) *CheckLoginIdRequest {
	s.LoginName = &v
	return s
}

type CheckLoginIdResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否存在
	Exist *bool `json:"exist,omitempty" xml:"exist,omitempty"`
	// 所属的租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
}

func (s CheckLoginIdResponse) String() string {
	return tea.Prettify(s)
}

func (s CheckLoginIdResponse) GoString() string {
	return s.String()
}

func (s *CheckLoginIdResponse) SetReqMsgId(v string) *CheckLoginIdResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CheckLoginIdResponse) SetResultCode(v string) *CheckLoginIdResponse {
	s.ResultCode = &v
	return s
}

func (s *CheckLoginIdResponse) SetResultMsg(v string) *CheckLoginIdResponse {
	s.ResultMsg = &v
	return s
}

func (s *CheckLoginIdResponse) SetExist(v bool) *CheckLoginIdResponse {
	s.Exist = &v
	return s
}

func (s *CheckLoginIdResponse) SetTenantId(v string) *CheckLoginIdResponse {
	s.TenantId = &v
	return s
}

type GetMasterTenantRequest struct {
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 主账号id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
}

func (s GetMasterTenantRequest) String() string {
	return tea.Prettify(s)
}

func (s GetMasterTenantRequest) GoString() string {
	return s.String()
}

func (s *GetMasterTenantRequest) SetAuthToken(v string) *GetMasterTenantRequest {
	s.AuthToken = &v
	return s
}

func (s *GetMasterTenantRequest) SetTenantId(v string) *GetMasterTenantRequest {
	s.TenantId = &v
	return s
}

type GetMasterTenantResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 蚂蚁通行证签约账户
	LoginName *string `json:"login_name,omitempty" xml:"login_name,omitempty"`
	// 租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 租户创建时间，ISO8601格式
	CreateTime *string `json:"create_time,omitempty" xml:"create_time,omitempty"`
	// 客户id
	CustomerId *string `json:"customer_id,omitempty" xml:"customer_id,omitempty"`
	// 租户描述信息
	Description *string `json:"description,omitempty" xml:"description,omitempty"`
	// 租户名称
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 租户最近一次修改时间，ISO8601格式
	UpdateTime *string `json:"update_time,omitempty" xml:"update_time,omitempty"`
	// 用户类型
	UserType *string `json:"user_type,omitempty" xml:"user_type,omitempty"`
}

func (s GetMasterTenantResponse) String() string {
	return tea.Prettify(s)
}

func (s GetMasterTenantResponse) GoString() string {
	return s.String()
}

func (s *GetMasterTenantResponse) SetReqMsgId(v string) *GetMasterTenantResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetMasterTenantResponse) SetResultCode(v string) *GetMasterTenantResponse {
	s.ResultCode = &v
	return s
}

func (s *GetMasterTenantResponse) SetResultMsg(v string) *GetMasterTenantResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetMasterTenantResponse) SetLoginName(v string) *GetMasterTenantResponse {
	s.LoginName = &v
	return s
}

func (s *GetMasterTenantResponse) SetTenantId(v string) *GetMasterTenantResponse {
	s.TenantId = &v
	return s
}

func (s *GetMasterTenantResponse) SetCreateTime(v string) *GetMasterTenantResponse {
	s.CreateTime = &v
	return s
}

func (s *GetMasterTenantResponse) SetCustomerId(v string) *GetMasterTenantResponse {
	s.CustomerId = &v
	return s
}

func (s *GetMasterTenantResponse) SetDescription(v string) *GetMasterTenantResponse {
	s.Description = &v
	return s
}

func (s *GetMasterTenantResponse) SetName(v string) *GetMasterTenantResponse {
	s.Name = &v
	return s
}

func (s *GetMasterTenantResponse) SetUpdateTime(v string) *GetMasterTenantResponse {
	s.UpdateTime = &v
	return s
}

func (s *GetMasterTenantResponse) SetUserType(v string) *GetMasterTenantResponse {
	s.UserType = &v
	return s
}

type CheckLoginnameRequest struct {
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 邮箱名称
	LoginName *string `json:"login_name,omitempty" xml:"login_name,omitempty" require:"true"`
}

func (s CheckLoginnameRequest) String() string {
	return tea.Prettify(s)
}

func (s CheckLoginnameRequest) GoString() string {
	return s.String()
}

func (s *CheckLoginnameRequest) SetAuthToken(v string) *CheckLoginnameRequest {
	s.AuthToken = &v
	return s
}

func (s *CheckLoginnameRequest) SetLoginName(v string) *CheckLoginnameRequest {
	s.LoginName = &v
	return s
}

type CheckLoginnameResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否存在
	Exist *bool `json:"exist,omitempty" xml:"exist,omitempty"`
	// 所属租户ID
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
}

func (s CheckLoginnameResponse) String() string {
	return tea.Prettify(s)
}

func (s CheckLoginnameResponse) GoString() string {
	return s.String()
}

func (s *CheckLoginnameResponse) SetReqMsgId(v string) *CheckLoginnameResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CheckLoginnameResponse) SetResultCode(v string) *CheckLoginnameResponse {
	s.ResultCode = &v
	return s
}

func (s *CheckLoginnameResponse) SetResultMsg(v string) *CheckLoginnameResponse {
	s.ResultMsg = &v
	return s
}

func (s *CheckLoginnameResponse) SetExist(v bool) *CheckLoginnameResponse {
	s.Exist = &v
	return s
}

func (s *CheckLoginnameResponse) SetTenantId(v string) *CheckLoginnameResponse {
	s.TenantId = &v
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
				"sdk_version":      tea.String("1.0.17"),
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
 * Description: 查询企业详情
 * Summary: 获取企业
 */
func (client *Client) GetCustomer(request *GetCustomerRequest) (_result *GetCustomerResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetCustomerResponse{}
	_body, _err := client.GetCustomerEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询企业详情
 * Summary: 获取企业
 */
func (client *Client) GetCustomerEx(request *GetCustomerRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetCustomerResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetCustomerResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.acm.customer.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询一个操作员的详情
 * Summary: 获取操作员
 */
func (client *Client) GetOperator(request *GetOperatorRequest) (_result *GetOperatorResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetOperatorResponse{}
	_body, _err := client.GetOperatorEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询一个操作员的详情
 * Summary: 获取操作员
 */
func (client *Client) GetOperatorEx(request *GetOperatorRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetOperatorResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetOperatorResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.acm.operator.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询操作员列表
 * Summary: 查询操作员
 */
func (client *Client) QueryOperator(request *QueryOperatorRequest) (_result *QueryOperatorResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryOperatorResponse{}
	_body, _err := client.QueryOperatorEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询操作员列表
 * Summary: 查询操作员
 */
func (client *Client) QueryOperatorEx(request *QueryOperatorRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryOperatorResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryOperatorResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.acm.operator.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 搜索操作员
 * Summary: 搜索操作员
 */
func (client *Client) SearchOperator(request *SearchOperatorRequest) (_result *SearchOperatorResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SearchOperatorResponse{}
	_body, _err := client.SearchOperatorEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 搜索操作员
 * Summary: 搜索操作员
 */
func (client *Client) SearchOperatorEx(request *SearchOperatorRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SearchOperatorResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SearchOperatorResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.acm.operator.search"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建操作员
 * Summary: 创建操作员
 */
func (client *Client) CreateOperator(request *CreateOperatorRequest) (_result *CreateOperatorResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateOperatorResponse{}
	_body, _err := client.CreateOperatorEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建操作员
 * Summary: 创建操作员
 */
func (client *Client) CreateOperatorEx(request *CreateOperatorRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateOperatorResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateOperatorResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.acm.operator.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 更新操作员
 * Summary: 更新操作员
 */
func (client *Client) UpdateOperator(request *UpdateOperatorRequest) (_result *UpdateOperatorResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateOperatorResponse{}
	_body, _err := client.UpdateOperatorEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 更新操作员
 * Summary: 更新操作员
 */
func (client *Client) UpdateOperatorEx(request *UpdateOperatorRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateOperatorResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateOperatorResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.acm.operator.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 删除操作员
 * Summary: 删除操作员
 */
func (client *Client) DeleteOperator(request *DeleteOperatorRequest) (_result *DeleteOperatorResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DeleteOperatorResponse{}
	_body, _err := client.DeleteOperatorEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 删除操作员
 * Summary: 删除操作员
 */
func (client *Client) DeleteOperatorEx(request *DeleteOperatorRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DeleteOperatorResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DeleteOperatorResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.acm.operator.delete"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.acm.tenant.member.add"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 初始化租户
 * Summary: 初始化租户
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
 * Description: 初始化租户
 * Summary: 初始化租户
 */
func (client *Client) CreateTenantEx(request *CreateTenantRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateTenantResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateTenantResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.acm.tenant.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询租户详情
 * Summary: 获取租户
 */
func (client *Client) GetTenant(request *GetTenantRequest) (_result *GetTenantResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetTenantResponse{}
	_body, _err := client.GetTenantEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询租户详情
 * Summary: 获取租户
 */
func (client *Client) GetTenantEx(request *GetTenantRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetTenantResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetTenantResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.acm.tenant.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询租户列表
 * Summary: 查询租户列表
 */
func (client *Client) QueryTenant(request *QueryTenantRequest) (_result *QueryTenantResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryTenantResponse{}
	_body, _err := client.QueryTenantEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询租户列表
 * Summary: 查询租户列表
 */
func (client *Client) QueryTenantEx(request *QueryTenantRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryTenantResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryTenantResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.acm.tenant.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 根据蚂蚁通行证uid查询租户id
 * Summary: 查询租户ID
 */
func (client *Client) GetAntpassportTenant(request *GetAntpassportTenantRequest) (_result *GetAntpassportTenantResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetAntpassportTenantResponse{}
	_body, _err := client.GetAntpassportTenantEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 根据蚂蚁通行证uid查询租户id
 * Summary: 查询租户ID
 */
func (client *Client) GetAntpassportTenantEx(request *GetAntpassportTenantRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetAntpassportTenantResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetAntpassportTenantResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.acm.antpassport.tenant.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取用户AccessKey信息
 * Summary: 获取用户AccessKey信息
 */
func (client *Client) ListAccesskey(request *ListAccesskeyRequest) (_result *ListAccesskeyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListAccesskeyResponse{}
	_body, _err := client.ListAccesskeyEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取用户AccessKey信息
 * Summary: 获取用户AccessKey信息
 */
func (client *Client) ListAccesskeyEx(request *ListAccesskeyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListAccesskeyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListAccesskeyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.acm.accesskey.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取调用接口所使用AccessKey对应的身份实体信息
 * Summary: 获取调用接口所使用AccessKey对应的身份实体信息
 */
func (client *Client) GetCurrentid(request *GetCurrentidRequest) (_result *GetCurrentidResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetCurrentidResponse{}
	_body, _err := client.GetCurrentidEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取调用接口所使用AccessKey对应的身份实体信息
 * Summary: 获取调用接口所使用AccessKey对应的身份实体信息
 */
func (client *Client) GetCurrentidEx(request *GetCurrentidRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetCurrentidResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetCurrentidResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.acm.currentid.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取用户Accessor信息
 * Summary: 获取用户Accessor信息
 */
func (client *Client) GetAccessor(request *GetAccessorRequest) (_result *GetAccessorResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetAccessorResponse{}
	_body, _err := client.GetAccessorEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取用户Accessor信息
 * Summary: 获取用户Accessor信息
 */
func (client *Client) GetAccessorEx(request *GetAccessorRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetAccessorResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetAccessorResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.acm.accessor.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取租户对应的钉钉授权token信息，内部接口
 * Summary: 获取租户的钉钉授权
 */
func (client *Client) GetTenantDingtoken(request *GetTenantDingtokenRequest) (_result *GetTenantDingtokenResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetTenantDingtokenResponse{}
	_body, _err := client.GetTenantDingtokenEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取租户对应的钉钉授权token信息，内部接口
 * Summary: 获取租户的钉钉授权
 */
func (client *Client) GetTenantDingtokenEx(request *GetTenantDingtokenRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetTenantDingtokenResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetTenantDingtokenResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.acm.tenant.dingtoken.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 分页查询管理员，内部接口
 * Summary: 分页查询管理员
 */
func (client *Client) QueryAdmin(request *QueryAdminRequest) (_result *QueryAdminResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAdminResponse{}
	_body, _err := client.QueryAdminEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 分页查询管理员，内部接口
 * Summary: 分页查询管理员
 */
func (client *Client) QueryAdminEx(request *QueryAdminRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAdminResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAdminResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.acm.admin.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取租户的IaaS账号
 * Summary: 获取租户的IaaS账号
 */
func (client *Client) GetTenantIaasaccount(request *GetTenantIaasaccountRequest) (_result *GetTenantIaasaccountResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetTenantIaasaccountResponse{}
	_body, _err := client.GetTenantIaasaccountEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取租户的IaaS账号
 * Summary: 获取租户的IaaS账号
 */
func (client *Client) GetTenantIaasaccountEx(request *GetTenantIaasaccountRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetTenantIaasaccountResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetTenantIaasaccountResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.acm.tenant.iaasaccount.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询企业列表(内部接口,私有云开放)
 * Summary: 查询企业列表
 */
func (client *Client) ListCustomer(request *ListCustomerRequest) (_result *ListCustomerResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListCustomerResponse{}
	_body, _err := client.ListCustomerEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询企业列表(内部接口,私有云开放)
 * Summary: 查询企业列表
 */
func (client *Client) ListCustomerEx(request *ListCustomerRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListCustomerResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListCustomerResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.acm.customer.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 支付宝账号证书信息校验及校验、入驻、打标
 * Summary: 支付宝账号证书信息校验、入驻、打标
 */
func (client *Client) CheckAlipayTenant(request *CheckAlipayTenantRequest) (_result *CheckAlipayTenantResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CheckAlipayTenantResponse{}
	_body, _err := client.CheckAlipayTenantEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 支付宝账号证书信息校验及校验、入驻、打标
 * Summary: 支付宝账号证书信息校验、入驻、打标
 */
func (client *Client) CheckAlipayTenantEx(request *CheckAlipayTenantRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CheckAlipayTenantResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CheckAlipayTenantResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.acm.alipay.tenant.check"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 租户入住状态查询
 * Summary: 租户入住状态查询
 */
func (client *Client) QueryTenantStatus(request *QueryTenantStatusRequest) (_result *QueryTenantStatusResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryTenantStatusResponse{}
	_body, _err := client.QueryTenantStatusEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 租户入住状态查询
 * Summary: 租户入住状态查询
 */
func (client *Client) QueryTenantStatusEx(request *QueryTenantStatusRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryTenantStatusResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryTenantStatusResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.acm.tenant.status.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 账号创建
 * Summary: 账号创建
 */
func (client *Client) CreateAntchainTenant(request *CreateAntchainTenantRequest) (_result *CreateAntchainTenantResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateAntchainTenantResponse{}
	_body, _err := client.CreateAntchainTenantEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 账号创建
 * Summary: 账号创建
 */
func (client *Client) CreateAntchainTenantEx(request *CreateAntchainTenantRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateAntchainTenantResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateAntchainTenantResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.acm.antchain.tenant.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 客户认证信息更新
 * Summary: 客户认证信息更新
 */
func (client *Client) UpdateCustomerIdentity(request *UpdateCustomerIdentityRequest) (_result *UpdateCustomerIdentityResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateCustomerIdentityResponse{}
	_body, _err := client.UpdateCustomerIdentityEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 客户认证信息更新
 * Summary: 客户认证信息更新
 */
func (client *Client) UpdateCustomerIdentityEx(request *UpdateCustomerIdentityRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateCustomerIdentityResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateCustomerIdentityResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.acm.customer.identity.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 校验邮箱是否可以创建账号
 * Summary: 校验邮箱是否可以创建账号
 */
func (client *Client) CheckLoginId(request *CheckLoginIdRequest) (_result *CheckLoginIdResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CheckLoginIdResponse{}
	_body, _err := client.CheckLoginIdEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 校验邮箱是否可以创建账号
 * Summary: 校验邮箱是否可以创建账号
 */
func (client *Client) CheckLoginIdEx(request *CheckLoginIdRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CheckLoginIdResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CheckLoginIdResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.acm.login.id.check"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 使用租户ID查询租户信息
 * Summary: 使用租户ID查询租户信息
 */
func (client *Client) GetMasterTenant(request *GetMasterTenantRequest) (_result *GetMasterTenantResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetMasterTenantResponse{}
	_body, _err := client.GetMasterTenantEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 使用租户ID查询租户信息
 * Summary: 使用租户ID查询租户信息
 */
func (client *Client) GetMasterTenantEx(request *GetMasterTenantRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetMasterTenantResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetMasterTenantResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.acm.master.tenant.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 检查邮箱是否可以用来注册
 * Summary: 检查邮箱是否可以用来注册
 */
func (client *Client) CheckLoginname(request *CheckLoginnameRequest) (_result *CheckLoginnameResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CheckLoginnameResponse{}
	_body, _err := client.CheckLoginnameEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 检查邮箱是否可以用来注册
 * Summary: 检查邮箱是否可以用来注册
 */
func (client *Client) CheckLoginnameEx(request *CheckLoginnameRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CheckLoginnameResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CheckLoginnameResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.acm.loginname.check"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
