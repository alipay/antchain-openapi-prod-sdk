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

// 订单执行结果描述
type OrderResult struct {
	// 实例Id
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty" require:"true" maxLength:"10"`
	// 是否生成成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty" require:"true"`
}

func (s OrderResult) String() string {
	return tea.Prettify(s)
}

func (s OrderResult) GoString() string {
	return s.String()
}

func (s *OrderResult) SetInstanceId(v string) *OrderResult {
	s.InstanceId = &v
	return s
}

func (s *OrderResult) SetSuccess(v bool) *OrderResult {
	s.Success = &v
	return s
}

// 从产品动态加载返回结果集
type DiscreteValue struct {
	// 组件展示的内容
	Text *string `json:"text,omitempty" xml:"text,omitempty" require:"true"`
	// 组件的具体值
	Value *string `json:"value,omitempty" xml:"value,omitempty" require:"true"`
	// 组件值的单位
	Unit *string `json:"unit,omitempty" xml:"unit,omitempty"`
	// 组件选中值的说明/提示
	Tips *string `json:"tips,omitempty" xml:"tips,omitempty"`
	// 多个组件展示的顺序
	SortId *int64 `json:"sort_id,omitempty" xml:"sort_id,omitempty" require:"true"`
}

func (s DiscreteValue) String() string {
	return tea.Prettify(s)
}

func (s DiscreteValue) GoString() string {
	return s.String()
}

func (s *DiscreteValue) SetText(v string) *DiscreteValue {
	s.Text = &v
	return s
}

func (s *DiscreteValue) SetValue(v string) *DiscreteValue {
	s.Value = &v
	return s
}

func (s *DiscreteValue) SetUnit(v string) *DiscreteValue {
	s.Unit = &v
	return s
}

func (s *DiscreteValue) SetTips(v string) *DiscreteValue {
	s.Tips = &v
	return s
}

func (s *DiscreteValue) SetSortId(v int64) *DiscreteValue {
	s.SortId = &v
	return s
}

type UpdateAbilityChainAccountRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	ProductAccessCode *string `json:"product_access_code,omitempty" xml:"product_access_code,omitempty"`
	// 业务流水，请求幂等号
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 链id，每个合约独立的标识
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty" require:"true"`
	// 租户名。目前理解 chain_id + tenant_id + chain_user_id 能唯一标识某个合约上的某个账号
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 链上账号。链上唯一账号。某些特定场景（比如某个租户可以在一个合约上不同平台方参与分润），会需要合约账户id
	ChainUserId *string `json:"chain_user_id,omitempty" xml:"chain_user_id,omitempty"`
	// decrease 减少 increase 增加
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 金额，单位：分。
	Value *int64 `json:"value,omitempty" xml:"value,omitempty" require:"true"`
	// 扩展字段，json格式
	ExtendParams *string `json:"extend_params,omitempty" xml:"extend_params,omitempty"`
}

func (s UpdateAbilityChainAccountRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateAbilityChainAccountRequest) GoString() string {
	return s.String()
}

func (s *UpdateAbilityChainAccountRequest) SetAuthToken(v string) *UpdateAbilityChainAccountRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateAbilityChainAccountRequest) SetProductInstanceId(v string) *UpdateAbilityChainAccountRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateAbilityChainAccountRequest) SetProductAccessCode(v string) *UpdateAbilityChainAccountRequest {
	s.ProductAccessCode = &v
	return s
}

func (s *UpdateAbilityChainAccountRequest) SetBizId(v string) *UpdateAbilityChainAccountRequest {
	s.BizId = &v
	return s
}

func (s *UpdateAbilityChainAccountRequest) SetChainId(v string) *UpdateAbilityChainAccountRequest {
	s.ChainId = &v
	return s
}

func (s *UpdateAbilityChainAccountRequest) SetTenantId(v string) *UpdateAbilityChainAccountRequest {
	s.TenantId = &v
	return s
}

func (s *UpdateAbilityChainAccountRequest) SetChainUserId(v string) *UpdateAbilityChainAccountRequest {
	s.ChainUserId = &v
	return s
}

func (s *UpdateAbilityChainAccountRequest) SetType(v string) *UpdateAbilityChainAccountRequest {
	s.Type = &v
	return s
}

func (s *UpdateAbilityChainAccountRequest) SetValue(v int64) *UpdateAbilityChainAccountRequest {
	s.Value = &v
	return s
}

func (s *UpdateAbilityChainAccountRequest) SetExtendParams(v string) *UpdateAbilityChainAccountRequest {
	s.ExtendParams = &v
	return s
}

type UpdateAbilityChainAccountResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回值对象,json格式。
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s UpdateAbilityChainAccountResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateAbilityChainAccountResponse) GoString() string {
	return s.String()
}

func (s *UpdateAbilityChainAccountResponse) SetReqMsgId(v string) *UpdateAbilityChainAccountResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateAbilityChainAccountResponse) SetResultCode(v string) *UpdateAbilityChainAccountResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateAbilityChainAccountResponse) SetResultMsg(v string) *UpdateAbilityChainAccountResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateAbilityChainAccountResponse) SetData(v string) *UpdateAbilityChainAccountResponse {
	s.Data = &v
	return s
}

type UpdateAbilityChainAssetRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	ProductAccessCode *string `json:"product_access_code,omitempty" xml:"product_access_code,omitempty"`
	// 流水号
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 链id，链上合约id
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty" require:"true"`
	// 租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 链上用户id
	ChainUserId *string `json:"chain_user_id,omitempty" xml:"chain_user_id,omitempty"`
	// 链上token金额，价值现金。单元：分
	TokenAmount *int64 `json:"token_amount,omitempty" xml:"token_amount,omitempty" require:"true"`
	// token链上数量。与现金有一定的兑换率。
	TokenNumber *string `json:"token_number,omitempty" xml:"token_number,omitempty" require:"true"`
	// 扩展字段，json格式
	ExtendParams *string `json:"extend_params,omitempty" xml:"extend_params,omitempty"`
}

func (s UpdateAbilityChainAssetRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateAbilityChainAssetRequest) GoString() string {
	return s.String()
}

func (s *UpdateAbilityChainAssetRequest) SetAuthToken(v string) *UpdateAbilityChainAssetRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateAbilityChainAssetRequest) SetProductInstanceId(v string) *UpdateAbilityChainAssetRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateAbilityChainAssetRequest) SetProductAccessCode(v string) *UpdateAbilityChainAssetRequest {
	s.ProductAccessCode = &v
	return s
}

func (s *UpdateAbilityChainAssetRequest) SetBizId(v string) *UpdateAbilityChainAssetRequest {
	s.BizId = &v
	return s
}

func (s *UpdateAbilityChainAssetRequest) SetChainId(v string) *UpdateAbilityChainAssetRequest {
	s.ChainId = &v
	return s
}

func (s *UpdateAbilityChainAssetRequest) SetTenantId(v string) *UpdateAbilityChainAssetRequest {
	s.TenantId = &v
	return s
}

func (s *UpdateAbilityChainAssetRequest) SetChainUserId(v string) *UpdateAbilityChainAssetRequest {
	s.ChainUserId = &v
	return s
}

func (s *UpdateAbilityChainAssetRequest) SetTokenAmount(v int64) *UpdateAbilityChainAssetRequest {
	s.TokenAmount = &v
	return s
}

func (s *UpdateAbilityChainAssetRequest) SetTokenNumber(v string) *UpdateAbilityChainAssetRequest {
	s.TokenNumber = &v
	return s
}

func (s *UpdateAbilityChainAssetRequest) SetExtendParams(v string) *UpdateAbilityChainAssetRequest {
	s.ExtendParams = &v
	return s
}

type UpdateAbilityChainAssetResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回json对象
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s UpdateAbilityChainAssetResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateAbilityChainAssetResponse) GoString() string {
	return s.String()
}

func (s *UpdateAbilityChainAssetResponse) SetReqMsgId(v string) *UpdateAbilityChainAssetResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateAbilityChainAssetResponse) SetResultCode(v string) *UpdateAbilityChainAssetResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateAbilityChainAssetResponse) SetResultMsg(v string) *UpdateAbilityChainAssetResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateAbilityChainAssetResponse) SetData(v string) *UpdateAbilityChainAssetResponse {
	s.Data = &v
	return s
}

type StopSpProductRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	ProductAccessCode *string `json:"product_access_code,omitempty" xml:"product_access_code,omitempty"`
	// 订单号用于业务串联，以及幂等。目前为纯数字。保留使用大小写英文字符可能。
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty" require:"true" maxLength:"64" minLength:"32"`
	// 产品码 全局唯一
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty" require:"true" maxLength:"20" minLength:"3"`
	// 产品实例Id
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty" require:"true" maxLength:"50" minLength:"20"`
	// 服务接入码，商品对接开通时关联的接入码，由产品方研发定义，并对应一个回调地址。
	AccessCode *string `json:"access_code,omitempty" xml:"access_code,omitempty" require:"true" maxLength:"24" minLength:"3"`
}

func (s StopSpProductRequest) String() string {
	return tea.Prettify(s)
}

func (s StopSpProductRequest) GoString() string {
	return s.String()
}

func (s *StopSpProductRequest) SetAuthToken(v string) *StopSpProductRequest {
	s.AuthToken = &v
	return s
}

func (s *StopSpProductRequest) SetProductInstanceId(v string) *StopSpProductRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *StopSpProductRequest) SetProductAccessCode(v string) *StopSpProductRequest {
	s.ProductAccessCode = &v
	return s
}

func (s *StopSpProductRequest) SetOrderNo(v string) *StopSpProductRequest {
	s.OrderNo = &v
	return s
}

func (s *StopSpProductRequest) SetProductCode(v string) *StopSpProductRequest {
	s.ProductCode = &v
	return s
}

func (s *StopSpProductRequest) SetInstanceId(v string) *StopSpProductRequest {
	s.InstanceId = &v
	return s
}

func (s *StopSpProductRequest) SetAccessCode(v string) *StopSpProductRequest {
	s.AccessCode = &v
	return s
}

type StopSpProductResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s StopSpProductResponse) String() string {
	return tea.Prettify(s)
}

func (s StopSpProductResponse) GoString() string {
	return s.String()
}

func (s *StopSpProductResponse) SetReqMsgId(v string) *StopSpProductResponse {
	s.ReqMsgId = &v
	return s
}

func (s *StopSpProductResponse) SetResultCode(v string) *StopSpProductResponse {
	s.ResultCode = &v
	return s
}

func (s *StopSpProductResponse) SetResultMsg(v string) *StopSpProductResponse {
	s.ResultMsg = &v
	return s
}

type ResumeSpProductRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	ProductAccessCode *string `json:"product_access_code,omitempty" xml:"product_access_code,omitempty"`
	// 订单号用于业务串联，以及幂等。目前为纯数字。保留使用大小写英文字符可能。
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty" require:"true" maxLength:"64" minLength:"32"`
	// 产品码 全局唯一
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty" require:"true" maxLength:"20" minLength:"3"`
	// 产品实例ID
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty" require:"true" maxLength:"50" minLength:"20"`
	// 服务接入码，商品对接开通时关联的接入码，由产品方研发定义，并对应一个回调地址。
	AccessCode *string `json:"access_code,omitempty" xml:"access_code,omitempty" require:"true" maxLength:"24" minLength:"3"`
}

func (s ResumeSpProductRequest) String() string {
	return tea.Prettify(s)
}

func (s ResumeSpProductRequest) GoString() string {
	return s.String()
}

func (s *ResumeSpProductRequest) SetAuthToken(v string) *ResumeSpProductRequest {
	s.AuthToken = &v
	return s
}

func (s *ResumeSpProductRequest) SetProductInstanceId(v string) *ResumeSpProductRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ResumeSpProductRequest) SetProductAccessCode(v string) *ResumeSpProductRequest {
	s.ProductAccessCode = &v
	return s
}

func (s *ResumeSpProductRequest) SetOrderNo(v string) *ResumeSpProductRequest {
	s.OrderNo = &v
	return s
}

func (s *ResumeSpProductRequest) SetProductCode(v string) *ResumeSpProductRequest {
	s.ProductCode = &v
	return s
}

func (s *ResumeSpProductRequest) SetInstanceId(v string) *ResumeSpProductRequest {
	s.InstanceId = &v
	return s
}

func (s *ResumeSpProductRequest) SetAccessCode(v string) *ResumeSpProductRequest {
	s.AccessCode = &v
	return s
}

type ResumeSpProductResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s ResumeSpProductResponse) String() string {
	return tea.Prettify(s)
}

func (s ResumeSpProductResponse) GoString() string {
	return s.String()
}

func (s *ResumeSpProductResponse) SetReqMsgId(v string) *ResumeSpProductResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ResumeSpProductResponse) SetResultCode(v string) *ResumeSpProductResponse {
	s.ResultCode = &v
	return s
}

func (s *ResumeSpProductResponse) SetResultMsg(v string) *ResumeSpProductResponse {
	s.ResultMsg = &v
	return s
}

type ProvisionSpProductRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	ProductAccessCode *string `json:"product_access_code,omitempty" xml:"product_access_code,omitempty"`
	// 订单号用于业务串联，以及幂等。目前为纯数字。保留使用大小写英文字符可能。
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty" require:"true" maxLength:"64" minLength:"32"`
	// 产品码 全局唯一
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty" require:"true" maxLength:"20" minLength:"3"`
	// 购买产品的租户
	Tenant *string `json:"tenant,omitempty" xml:"tenant,omitempty" require:"true" maxLength:"8" minLength:"8"`
	// 产品实例Id
	InstanceIds []*string `json:"instance_ids,omitempty" xml:"instance_ids,omitempty" require:"true" type:"Repeated"`
	// 具体规格配置信息（JSON格式）会按照key进行排序
	Specification *string `json:"specification,omitempty" xml:"specification,omitempty" require:"true"`
	// 部分产品创建时需要非生产规格的数据（JSON格式） 比如：ECS生产需要账号、密码等 会按照key进行排序
	CustomData *string `json:"custom_data,omitempty" xml:"custom_data,omitempty"`
	// 实例需要创建到租户的环境信息
	Workspace *string `json:"workspace,omitempty" xml:"workspace,omitempty"`
	// 实例需要创建到租户的地域
	Region *string `json:"region,omitempty" xml:"region,omitempty"`
	// 实例需要创建到租户的机房，可以有多个（冗灾场景）
	Zones []*string `json:"zones,omitempty" xml:"zones,omitempty" type:"Repeated"`
	// 购买产品的租户ID，格式为2088XXXXXXXXXXXX
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true" maxLength:"16" minLength:"16"`
	// 服务接入码，商品对接开通时关联的接入码，由产品方研发定义，并对应一个回调地址。
	AccessCode *string `json:"access_code,omitempty" xml:"access_code,omitempty" require:"true" maxLength:"24" minLength:"3"`
}

func (s ProvisionSpProductRequest) String() string {
	return tea.Prettify(s)
}

func (s ProvisionSpProductRequest) GoString() string {
	return s.String()
}

func (s *ProvisionSpProductRequest) SetAuthToken(v string) *ProvisionSpProductRequest {
	s.AuthToken = &v
	return s
}

func (s *ProvisionSpProductRequest) SetProductInstanceId(v string) *ProvisionSpProductRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ProvisionSpProductRequest) SetProductAccessCode(v string) *ProvisionSpProductRequest {
	s.ProductAccessCode = &v
	return s
}

func (s *ProvisionSpProductRequest) SetOrderNo(v string) *ProvisionSpProductRequest {
	s.OrderNo = &v
	return s
}

func (s *ProvisionSpProductRequest) SetProductCode(v string) *ProvisionSpProductRequest {
	s.ProductCode = &v
	return s
}

func (s *ProvisionSpProductRequest) SetTenant(v string) *ProvisionSpProductRequest {
	s.Tenant = &v
	return s
}

func (s *ProvisionSpProductRequest) SetInstanceIds(v []*string) *ProvisionSpProductRequest {
	s.InstanceIds = v
	return s
}

func (s *ProvisionSpProductRequest) SetSpecification(v string) *ProvisionSpProductRequest {
	s.Specification = &v
	return s
}

func (s *ProvisionSpProductRequest) SetCustomData(v string) *ProvisionSpProductRequest {
	s.CustomData = &v
	return s
}

func (s *ProvisionSpProductRequest) SetWorkspace(v string) *ProvisionSpProductRequest {
	s.Workspace = &v
	return s
}

func (s *ProvisionSpProductRequest) SetRegion(v string) *ProvisionSpProductRequest {
	s.Region = &v
	return s
}

func (s *ProvisionSpProductRequest) SetZones(v []*string) *ProvisionSpProductRequest {
	s.Zones = v
	return s
}

func (s *ProvisionSpProductRequest) SetTenantId(v string) *ProvisionSpProductRequest {
	s.TenantId = &v
	return s
}

func (s *ProvisionSpProductRequest) SetAccessCode(v string) *ProvisionSpProductRequest {
	s.AccessCode = &v
	return s
}

type ProvisionSpProductResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s ProvisionSpProductResponse) String() string {
	return tea.Prettify(s)
}

func (s ProvisionSpProductResponse) GoString() string {
	return s.String()
}

func (s *ProvisionSpProductResponse) SetReqMsgId(v string) *ProvisionSpProductResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ProvisionSpProductResponse) SetResultCode(v string) *ProvisionSpProductResponse {
	s.ResultCode = &v
	return s
}

func (s *ProvisionSpProductResponse) SetResultMsg(v string) *ProvisionSpProductResponse {
	s.ResultMsg = &v
	return s
}

type ModifySpProductRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	ProductAccessCode *string `json:"product_access_code,omitempty" xml:"product_access_code,omitempty"`
	// 订单号用于业务串联，以及幂等。目前为纯数字。保留使用大小写英文字符可能。
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty" require:"true" maxLength:"64" minLength:"32"`
	// 产品码 全局唯一
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty" require:"true" maxLength:"20" minLength:"3"`
	// 产品实例Id
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty" require:"true" maxLength:"50" minLength:"20"`
	// 具体规格配置信息（JSON格式）会按照key进行排序
	Specification *string `json:"specification,omitempty" xml:"specification,omitempty" require:"true"`
	// 服务接入码，商品对接开通时关联的接入码，由产品方研发定义，并对应一个回调地址。
	AccessCode *string `json:"access_code,omitempty" xml:"access_code,omitempty" require:"true" maxLength:"24" minLength:"3"`
}

func (s ModifySpProductRequest) String() string {
	return tea.Prettify(s)
}

func (s ModifySpProductRequest) GoString() string {
	return s.String()
}

func (s *ModifySpProductRequest) SetAuthToken(v string) *ModifySpProductRequest {
	s.AuthToken = &v
	return s
}

func (s *ModifySpProductRequest) SetProductInstanceId(v string) *ModifySpProductRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ModifySpProductRequest) SetProductAccessCode(v string) *ModifySpProductRequest {
	s.ProductAccessCode = &v
	return s
}

func (s *ModifySpProductRequest) SetOrderNo(v string) *ModifySpProductRequest {
	s.OrderNo = &v
	return s
}

func (s *ModifySpProductRequest) SetProductCode(v string) *ModifySpProductRequest {
	s.ProductCode = &v
	return s
}

func (s *ModifySpProductRequest) SetInstanceId(v string) *ModifySpProductRequest {
	s.InstanceId = &v
	return s
}

func (s *ModifySpProductRequest) SetSpecification(v string) *ModifySpProductRequest {
	s.Specification = &v
	return s
}

func (s *ModifySpProductRequest) SetAccessCode(v string) *ModifySpProductRequest {
	s.AccessCode = &v
	return s
}

type ModifySpProductResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s ModifySpProductResponse) String() string {
	return tea.Prettify(s)
}

func (s ModifySpProductResponse) GoString() string {
	return s.String()
}

func (s *ModifySpProductResponse) SetReqMsgId(v string) *ModifySpProductResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ModifySpProductResponse) SetResultCode(v string) *ModifySpProductResponse {
	s.ResultCode = &v
	return s
}

func (s *ModifySpProductResponse) SetResultMsg(v string) *ModifySpProductResponse {
	s.ResultMsg = &v
	return s
}

type ReleaseSpProductRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	ProductAccessCode *string `json:"product_access_code,omitempty" xml:"product_access_code,omitempty"`
	// 订单号用于业务串联，以及幂等。目前为纯数字。保留使用大小写英文字符可能。
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty" require:"true" maxLength:"64" minLength:"32"`
	// 产品码 全局唯一
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty" require:"true" maxLength:"20" minLength:"3"`
	// 产品实例ID
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty" require:"true" maxLength:"50" minLength:"20"`
	// 服务接入码，商品对接开通时关联的接入码，由产品方研发定义，并对应一个回调地址
	AccessCode *string `json:"access_code,omitempty" xml:"access_code,omitempty" require:"true" maxLength:"24" minLength:"3"`
}

func (s ReleaseSpProductRequest) String() string {
	return tea.Prettify(s)
}

func (s ReleaseSpProductRequest) GoString() string {
	return s.String()
}

func (s *ReleaseSpProductRequest) SetAuthToken(v string) *ReleaseSpProductRequest {
	s.AuthToken = &v
	return s
}

func (s *ReleaseSpProductRequest) SetProductInstanceId(v string) *ReleaseSpProductRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ReleaseSpProductRequest) SetProductAccessCode(v string) *ReleaseSpProductRequest {
	s.ProductAccessCode = &v
	return s
}

func (s *ReleaseSpProductRequest) SetOrderNo(v string) *ReleaseSpProductRequest {
	s.OrderNo = &v
	return s
}

func (s *ReleaseSpProductRequest) SetProductCode(v string) *ReleaseSpProductRequest {
	s.ProductCode = &v
	return s
}

func (s *ReleaseSpProductRequest) SetInstanceId(v string) *ReleaseSpProductRequest {
	s.InstanceId = &v
	return s
}

func (s *ReleaseSpProductRequest) SetAccessCode(v string) *ReleaseSpProductRequest {
	s.AccessCode = &v
	return s
}

type ReleaseSpProductResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s ReleaseSpProductResponse) String() string {
	return tea.Prettify(s)
}

func (s ReleaseSpProductResponse) GoString() string {
	return s.String()
}

func (s *ReleaseSpProductResponse) SetReqMsgId(v string) *ReleaseSpProductResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ReleaseSpProductResponse) SetResultCode(v string) *ReleaseSpProductResponse {
	s.ResultCode = &v
	return s
}

func (s *ReleaseSpProductResponse) SetResultMsg(v string) *ReleaseSpProductResponse {
	s.ResultMsg = &v
	return s
}

type GetSpProductOrderRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	ProductAccessCode *string `json:"product_access_code,omitempty" xml:"product_access_code,omitempty"`
	// 订单号用于业务串联，以及幂等。目前为纯数字。保留使用大小写英文字符可能。
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty" require:"true" maxLength:"64" minLength:"32"`
	// 产品码 全局唯一
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty" require:"true" maxLength:"20" minLength:"3"`
}

func (s GetSpProductOrderRequest) String() string {
	return tea.Prettify(s)
}

func (s GetSpProductOrderRequest) GoString() string {
	return s.String()
}

func (s *GetSpProductOrderRequest) SetAuthToken(v string) *GetSpProductOrderRequest {
	s.AuthToken = &v
	return s
}

func (s *GetSpProductOrderRequest) SetProductInstanceId(v string) *GetSpProductOrderRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetSpProductOrderRequest) SetProductAccessCode(v string) *GetSpProductOrderRequest {
	s.ProductAccessCode = &v
	return s
}

func (s *GetSpProductOrderRequest) SetOrderNo(v string) *GetSpProductOrderRequest {
	s.OrderNo = &v
	return s
}

func (s *GetSpProductOrderRequest) SetProductCode(v string) *GetSpProductOrderRequest {
	s.ProductCode = &v
	return s
}

type GetSpProductOrderResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 结果
	OrderResults []*OrderResult `json:"order_results,omitempty" xml:"order_results,omitempty" require:"true" type:"Repeated"`
}

func (s GetSpProductOrderResponse) String() string {
	return tea.Prettify(s)
}

func (s GetSpProductOrderResponse) GoString() string {
	return s.String()
}

func (s *GetSpProductOrderResponse) SetReqMsgId(v string) *GetSpProductOrderResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetSpProductOrderResponse) SetResultCode(v string) *GetSpProductOrderResponse {
	s.ResultCode = &v
	return s
}

func (s *GetSpProductOrderResponse) SetResultMsg(v string) *GetSpProductOrderResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetSpProductOrderResponse) SetOrderResults(v []*OrderResult) *GetSpProductOrderResponse {
	s.OrderResults = v
	return s
}

type LoadSpProductOrderparameterRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	ProductAccessCode *string `json:"product_access_code,omitempty" xml:"product_access_code,omitempty"`
	// 加载业务的场景。具体内容同产品方定义，但产品下需保证唯一。
	BusinessAction *string `json:"business_action,omitempty" xml:"business_action,omitempty" require:"true"`
	// 用于加载对应场景数据的上下文（JSON格式具体同产品方定义）
	BusinessContext *string `json:"business_context,omitempty" xml:"business_context,omitempty" require:"true"`
	// 业务流水号。
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty"`
	// 产品code
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty" require:"true"`
	// 地域。支持不同地域显示不同内容。
	Region *string `json:"region,omitempty" xml:"region,omitempty"`
	// 租户id
	Tenant *string `json:"tenant,omitempty" xml:"tenant,omitempty" require:"true"`
}

func (s LoadSpProductOrderparameterRequest) String() string {
	return tea.Prettify(s)
}

func (s LoadSpProductOrderparameterRequest) GoString() string {
	return s.String()
}

func (s *LoadSpProductOrderparameterRequest) SetAuthToken(v string) *LoadSpProductOrderparameterRequest {
	s.AuthToken = &v
	return s
}

func (s *LoadSpProductOrderparameterRequest) SetProductInstanceId(v string) *LoadSpProductOrderparameterRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *LoadSpProductOrderparameterRequest) SetProductAccessCode(v string) *LoadSpProductOrderparameterRequest {
	s.ProductAccessCode = &v
	return s
}

func (s *LoadSpProductOrderparameterRequest) SetBusinessAction(v string) *LoadSpProductOrderparameterRequest {
	s.BusinessAction = &v
	return s
}

func (s *LoadSpProductOrderparameterRequest) SetBusinessContext(v string) *LoadSpProductOrderparameterRequest {
	s.BusinessContext = &v
	return s
}

func (s *LoadSpProductOrderparameterRequest) SetOrderNo(v string) *LoadSpProductOrderparameterRequest {
	s.OrderNo = &v
	return s
}

func (s *LoadSpProductOrderparameterRequest) SetProductCode(v string) *LoadSpProductOrderparameterRequest {
	s.ProductCode = &v
	return s
}

func (s *LoadSpProductOrderparameterRequest) SetRegion(v string) *LoadSpProductOrderparameterRequest {
	s.Region = &v
	return s
}

func (s *LoadSpProductOrderparameterRequest) SetTenant(v string) *LoadSpProductOrderparameterRequest {
	s.Tenant = &v
	return s
}

type LoadSpProductOrderparameterResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 首页页面产品自定义展示内容加载结果
	DiscreteValues []*DiscreteValue `json:"discrete_values,omitempty" xml:"discrete_values,omitempty" type:"Repeated"`
}

func (s LoadSpProductOrderparameterResponse) String() string {
	return tea.Prettify(s)
}

func (s LoadSpProductOrderparameterResponse) GoString() string {
	return s.String()
}

func (s *LoadSpProductOrderparameterResponse) SetReqMsgId(v string) *LoadSpProductOrderparameterResponse {
	s.ReqMsgId = &v
	return s
}

func (s *LoadSpProductOrderparameterResponse) SetResultCode(v string) *LoadSpProductOrderparameterResponse {
	s.ResultCode = &v
	return s
}

func (s *LoadSpProductOrderparameterResponse) SetResultMsg(v string) *LoadSpProductOrderparameterResponse {
	s.ResultMsg = &v
	return s
}

func (s *LoadSpProductOrderparameterResponse) SetDiscreteValues(v []*DiscreteValue) *LoadSpProductOrderparameterResponse {
	s.DiscreteValues = v
	return s
}

type SyncIndustryTradeResultRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	ProductAccessCode *string `json:"product_access_code,omitempty" xml:"product_access_code,omitempty"`
	// 外部商户订单号，不超过32位
	MerchantOrderNo *string `json:"merchant_order_no,omitempty" xml:"merchant_order_no,omitempty" require:"true"`
	// 原支付请求的商户订单号
	OutTradeNo *string `json:"out_trade_no,omitempty" xml:"out_trade_no,omitempty" require:"true"`
	// 支付宝交易号
	TradeNo *string `json:"trade_no,omitempty" xml:"trade_no,omitempty" require:"true"`
	// 交易状态。
	// WAIT_BUYER_PAY	交易创建，等待买家付款。
	// TRADE_CLOSED	未付款交易超时关闭，或支付完成后全额退款。
	// TRADE_SUCCESS	交易支付成功。
	TradeStatus *string `json:"trade_status,omitempty" xml:"trade_status,omitempty" require:"true"`
	// 错误码。
	ErrorCode *string `json:"error_code,omitempty" xml:"error_code,omitempty"`
	// 错误原因
	ErrorMsg *string `json:"error_msg,omitempty" xml:"error_msg,omitempty"`
	// 渠道 自营平台、第三方平台等
	Channel *string `json:"channel,omitempty" xml:"channel,omitempty" require:"true"`
}

func (s SyncIndustryTradeResultRequest) String() string {
	return tea.Prettify(s)
}

func (s SyncIndustryTradeResultRequest) GoString() string {
	return s.String()
}

func (s *SyncIndustryTradeResultRequest) SetAuthToken(v string) *SyncIndustryTradeResultRequest {
	s.AuthToken = &v
	return s
}

func (s *SyncIndustryTradeResultRequest) SetProductInstanceId(v string) *SyncIndustryTradeResultRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SyncIndustryTradeResultRequest) SetProductAccessCode(v string) *SyncIndustryTradeResultRequest {
	s.ProductAccessCode = &v
	return s
}

func (s *SyncIndustryTradeResultRequest) SetMerchantOrderNo(v string) *SyncIndustryTradeResultRequest {
	s.MerchantOrderNo = &v
	return s
}

func (s *SyncIndustryTradeResultRequest) SetOutTradeNo(v string) *SyncIndustryTradeResultRequest {
	s.OutTradeNo = &v
	return s
}

func (s *SyncIndustryTradeResultRequest) SetTradeNo(v string) *SyncIndustryTradeResultRequest {
	s.TradeNo = &v
	return s
}

func (s *SyncIndustryTradeResultRequest) SetTradeStatus(v string) *SyncIndustryTradeResultRequest {
	s.TradeStatus = &v
	return s
}

func (s *SyncIndustryTradeResultRequest) SetErrorCode(v string) *SyncIndustryTradeResultRequest {
	s.ErrorCode = &v
	return s
}

func (s *SyncIndustryTradeResultRequest) SetErrorMsg(v string) *SyncIndustryTradeResultRequest {
	s.ErrorMsg = &v
	return s
}

func (s *SyncIndustryTradeResultRequest) SetChannel(v string) *SyncIndustryTradeResultRequest {
	s.Channel = &v
	return s
}

type SyncIndustryTradeResultResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s SyncIndustryTradeResultResponse) String() string {
	return tea.Prettify(s)
}

func (s SyncIndustryTradeResultResponse) GoString() string {
	return s.String()
}

func (s *SyncIndustryTradeResultResponse) SetReqMsgId(v string) *SyncIndustryTradeResultResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SyncIndustryTradeResultResponse) SetResultCode(v string) *SyncIndustryTradeResultResponse {
	s.ResultCode = &v
	return s
}

func (s *SyncIndustryTradeResultResponse) SetResultMsg(v string) *SyncIndustryTradeResultResponse {
	s.ResultMsg = &v
	return s
}

type SyncMerchantSignResultRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	ProductAccessCode *string `json:"product_access_code,omitempty" xml:"product_access_code,omitempty"`
	// 本次关联注册失败错误原因。
	ErrorMsg *string `json:"error_msg,omitempty" xml:"error_msg,omitempty"`
	// 商家注册(进件)受理单号
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
	// 商家注册（包括进件）结果。99:已完结;-1:失败;
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 二级商户id
	Smid *string `json:"smid,omitempty" xml:"smid,omitempty" require:"true"`
	// 商户租户id
	MerchantUserId *string `json:"merchant_user_id,omitempty" xml:"merchant_user_id,omitempty" require:"true"`
	// 商户名称
	MerchantName *string `json:"merchant_name,omitempty" xml:"merchant_name,omitempty"`
	// 八位数的商户租户名称
	MerchantUserName *string `json:"merchant_user_name,omitempty" xml:"merchant_user_name,omitempty"`
}

func (s SyncMerchantSignResultRequest) String() string {
	return tea.Prettify(s)
}

func (s SyncMerchantSignResultRequest) GoString() string {
	return s.String()
}

func (s *SyncMerchantSignResultRequest) SetAuthToken(v string) *SyncMerchantSignResultRequest {
	s.AuthToken = &v
	return s
}

func (s *SyncMerchantSignResultRequest) SetProductInstanceId(v string) *SyncMerchantSignResultRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SyncMerchantSignResultRequest) SetProductAccessCode(v string) *SyncMerchantSignResultRequest {
	s.ProductAccessCode = &v
	return s
}

func (s *SyncMerchantSignResultRequest) SetErrorMsg(v string) *SyncMerchantSignResultRequest {
	s.ErrorMsg = &v
	return s
}

func (s *SyncMerchantSignResultRequest) SetOrderId(v string) *SyncMerchantSignResultRequest {
	s.OrderId = &v
	return s
}

func (s *SyncMerchantSignResultRequest) SetStatus(v string) *SyncMerchantSignResultRequest {
	s.Status = &v
	return s
}

func (s *SyncMerchantSignResultRequest) SetSmid(v string) *SyncMerchantSignResultRequest {
	s.Smid = &v
	return s
}

func (s *SyncMerchantSignResultRequest) SetMerchantUserId(v string) *SyncMerchantSignResultRequest {
	s.MerchantUserId = &v
	return s
}

func (s *SyncMerchantSignResultRequest) SetMerchantName(v string) *SyncMerchantSignResultRequest {
	s.MerchantName = &v
	return s
}

func (s *SyncMerchantSignResultRequest) SetMerchantUserName(v string) *SyncMerchantSignResultRequest {
	s.MerchantUserName = &v
	return s
}

type SyncMerchantSignResultResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s SyncMerchantSignResultResponse) String() string {
	return tea.Prettify(s)
}

func (s SyncMerchantSignResultResponse) GoString() string {
	return s.String()
}

func (s *SyncMerchantSignResultResponse) SetReqMsgId(v string) *SyncMerchantSignResultResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SyncMerchantSignResultResponse) SetResultCode(v string) *SyncMerchantSignResultResponse {
	s.ResultCode = &v
	return s
}

func (s *SyncMerchantSignResultResponse) SetResultMsg(v string) *SyncMerchantSignResultResponse {
	s.ResultMsg = &v
	return s
}

type OpenSpProductRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	ProductAccessCode *string `json:"product_access_code,omitempty" xml:"product_access_code,omitempty"`
	// 订单号用于业务串联，以及幂等。目前为纯数字。保留使用大小写英文字符可能。
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty" require:"true" maxLength:"64" minLength:"32"`
	// 产品码 全局唯一
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty" require:"true" maxLength:"20" minLength:"3"`
	// 开通产品的租户
	Tenant *string `json:"tenant,omitempty" xml:"tenant,omitempty" require:"true" maxLength:"8" minLength:"8"`
	// 产品实例ID
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty" require:"true" maxLength:"50" minLength:"20"`
	// 支持透传给产品非生产规格的自定义数据（JSON格式并按key排序）
	CustomData *string `json:"custom_data,omitempty" xml:"custom_data,omitempty"`
	// 开通产品的租户ID，格式为2088XXXXXXXXXXXX
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true" maxLength:"16" minLength:"16"`
	// 服务接入码，产品对接开通时关联的接入码，由产品方研发定义，并对应一个回调地址。
	AccessCode *string `json:"access_code,omitempty" xml:"access_code,omitempty" require:"true" maxLength:"24" minLength:"3"`
}

func (s OpenSpProductRequest) String() string {
	return tea.Prettify(s)
}

func (s OpenSpProductRequest) GoString() string {
	return s.String()
}

func (s *OpenSpProductRequest) SetAuthToken(v string) *OpenSpProductRequest {
	s.AuthToken = &v
	return s
}

func (s *OpenSpProductRequest) SetProductInstanceId(v string) *OpenSpProductRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *OpenSpProductRequest) SetProductAccessCode(v string) *OpenSpProductRequest {
	s.ProductAccessCode = &v
	return s
}

func (s *OpenSpProductRequest) SetOrderNo(v string) *OpenSpProductRequest {
	s.OrderNo = &v
	return s
}

func (s *OpenSpProductRequest) SetProductCode(v string) *OpenSpProductRequest {
	s.ProductCode = &v
	return s
}

func (s *OpenSpProductRequest) SetTenant(v string) *OpenSpProductRequest {
	s.Tenant = &v
	return s
}

func (s *OpenSpProductRequest) SetInstanceId(v string) *OpenSpProductRequest {
	s.InstanceId = &v
	return s
}

func (s *OpenSpProductRequest) SetCustomData(v string) *OpenSpProductRequest {
	s.CustomData = &v
	return s
}

func (s *OpenSpProductRequest) SetTenantId(v string) *OpenSpProductRequest {
	s.TenantId = &v
	return s
}

func (s *OpenSpProductRequest) SetAccessCode(v string) *OpenSpProductRequest {
	s.AccessCode = &v
	return s
}

type OpenSpProductResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s OpenSpProductResponse) String() string {
	return tea.Prettify(s)
}

func (s OpenSpProductResponse) GoString() string {
	return s.String()
}

func (s *OpenSpProductResponse) SetReqMsgId(v string) *OpenSpProductResponse {
	s.ReqMsgId = &v
	return s
}

func (s *OpenSpProductResponse) SetResultCode(v string) *OpenSpProductResponse {
	s.ResultCode = &v
	return s
}

func (s *OpenSpProductResponse) SetResultMsg(v string) *OpenSpProductResponse {
	s.ResultMsg = &v
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
				"sdk_version":      tea.String("4.1.4"),
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
 * Description: 更新链上账户余额
 * Summary: 更新链上账户余额
 */
func (client *Client) UpdateAbilityChainAccount(request *UpdateAbilityChainAccountRequest) (_result *UpdateAbilityChainAccountResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateAbilityChainAccountResponse{}
	_body, _err := client.UpdateAbilityChainAccountEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 更新链上账户余额
 * Summary: 更新链上账户余额
 */
func (client *Client) UpdateAbilityChainAccountEx(request *UpdateAbilityChainAccountRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateAbilityChainAccountResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateAbilityChainAccountResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloudspi.ability.chain.account.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 链上资产核销、确认核销成功
 * Summary: 链上资产核销确认
 */
func (client *Client) UpdateAbilityChainAsset(request *UpdateAbilityChainAssetRequest) (_result *UpdateAbilityChainAssetResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateAbilityChainAssetResponse{}
	_body, _err := client.UpdateAbilityChainAssetEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 链上资产核销、确认核销成功
 * Summary: 链上资产核销确认
 */
func (client *Client) UpdateAbilityChainAssetEx(request *UpdateAbilityChainAssetRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateAbilityChainAssetResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateAbilityChainAssetResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloudspi.ability.chain.asset.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 用户资源到期或欠费情况下会对资源先进行停服操作，用于限制用户使用但不能删除用户数据！不同的产品可以根据自身的功能进行不同的限制。
停服属于通知类指令，即平台只负责通知到产品，不关心产品的业务处理结果。因为网络问题或者产品系统的故障导致的消息响应失败，平台会间隔1分钟持续通知（限制100次）。
注意：如果产品的停服为耗时操作，在收到通知后需要自行存储消息异步处理，不能阻塞通知请求导致网络超时（超时时间10s）。
 * Summary: SPI-停止服务
*/
func (client *Client) StopSpProduct(request *StopSpProductRequest) (_result *StopSpProductResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &StopSpProductResponse{}
	_body, _err := client.StopSpProductEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 用户资源到期或欠费情况下会对资源先进行停服操作，用于限制用户使用但不能删除用户数据！不同的产品可以根据自身的功能进行不同的限制。
停服属于通知类指令，即平台只负责通知到产品，不关心产品的业务处理结果。因为网络问题或者产品系统的故障导致的消息响应失败，平台会间隔1分钟持续通知（限制100次）。
注意：如果产品的停服为耗时操作，在收到通知后需要自行存储消息异步处理，不能阻塞通知请求导致网络超时（超时时间10s）。
 * Summary: SPI-停止服务
*/
func (client *Client) StopSpProductEx(request *StopSpProductRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *StopSpProductResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &StopSpProductResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloudspi.sp.product.stop"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 用户对欠费或者到期实例进行续费操作后，平台会通知产品解除对用户指定实例的操作限制。即恢复正常服务能力。
恢复指令同样属于通知类指令，即平台只负责通知到产品，不关心产品的业务处理结果。因为网络问题或者产品系统的故障导致的消息响应失败，平台会间隔1分钟持续通知（限制100次）。
注意：如果产品的恢复为耗时操作，在收到通知后需要自行存储消息异步处理，不能阻塞通知请求导致网络超时（超时时间10s）。
 * Summary: SPI-恢复服务
*/
func (client *Client) ResumeSpProduct(request *ResumeSpProductRequest) (_result *ResumeSpProductResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ResumeSpProductResponse{}
	_body, _err := client.ResumeSpProductEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 用户对欠费或者到期实例进行续费操作后，平台会通知产品解除对用户指定实例的操作限制。即恢复正常服务能力。
恢复指令同样属于通知类指令，即平台只负责通知到产品，不关心产品的业务处理结果。因为网络问题或者产品系统的故障导致的消息响应失败，平台会间隔1分钟持续通知（限制100次）。
注意：如果产品的恢复为耗时操作，在收到通知后需要自行存储消息异步处理，不能阻塞通知请求导致网络超时（超时时间10s）。
 * Summary: SPI-恢复服务
*/
func (client *Client) ResumeSpProductEx(request *ResumeSpProductRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ResumeSpProductResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ResumeSpProductResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloudspi.sp.product.resume"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建产品实例（带配置）支持相同配置一次创建多个实例（最大10个）。比如：用户购买一台ECS，就是创建一个ECS实例。
创建产品会生成产品实例Id，后续变配、释放、停服、恢复服务操作都是通过实例Id作为标识。
异步接口 能力产品收到指令后需要自行落库（如果创建过程比较耗时），并记录执行结果。创建完成后结果通过openAPI通知平台，超时未收到结果平台将主动查询SPI。
注意：中台会通知能力产品指定集群，如果同步返回结果失败平台会重试调用（最多3次），需要根据订单号order_no做好幂等判断。
 * Summary: SPI-创建产品实例
*/
func (client *Client) ProvisionSpProduct(request *ProvisionSpProductRequest) (_result *ProvisionSpProductResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ProvisionSpProductResponse{}
	_body, _err := client.ProvisionSpProductEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建产品实例（带配置）支持相同配置一次创建多个实例（最大10个）。比如：用户购买一台ECS，就是创建一个ECS实例。
创建产品会生成产品实例Id，后续变配、释放、停服、恢复服务操作都是通过实例Id作为标识。
异步接口 能力产品收到指令后需要自行落库（如果创建过程比较耗时），并记录执行结果。创建完成后结果通过openAPI通知平台，超时未收到结果平台将主动查询SPI。
注意：中台会通知能力产品指定集群，如果同步返回结果失败平台会重试调用（最多3次），需要根据订单号order_no做好幂等判断。
 * Summary: SPI-创建产品实例
*/
func (client *Client) ProvisionSpProductEx(request *ProvisionSpProductRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ProvisionSpProductResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ProvisionSpProductResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloudspi.sp.product.provision"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 对已有的实例进行规格变更操作。
异步接口 能力产品收到指令后需要自行落库（如果创建过程比较耗时），并记录执行结果。创建完成后结果通过openAPI通知平台，超时未收到结果平台将主动查询SPI。
注意：中台会通知能力产品指定集群，如果同步返回结果失败平台会重试调用（最多3次），需要根据订单号order_no做好幂等判断。
 * Summary: SPI-变更产品实例配置
*/
func (client *Client) ModifySpProduct(request *ModifySpProductRequest) (_result *ModifySpProductResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ModifySpProductResponse{}
	_body, _err := client.ModifySpProductEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 对已有的实例进行规格变更操作。
异步接口 能力产品收到指令后需要自行落库（如果创建过程比较耗时），并记录执行结果。创建完成后结果通过openAPI通知平台，超时未收到结果平台将主动查询SPI。
注意：中台会通知能力产品指定集群，如果同步返回结果失败平台会重试调用（最多3次），需要根据订单号order_no做好幂等判断。
 * Summary: SPI-变更产品实例配置
*/
func (client *Client) ModifySpProductEx(request *ModifySpProductRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ModifySpProductResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ModifySpProductResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloudspi.sp.product.modify"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 用户主动删除实例或欠费逾期平台按照约定进行强制删除。
释放操作属于通知类指令，即平台只负责通知到产品，不关心产品的业务处理结果。产品方应保证快速响应。因为网络问题或者产品系统的故障导致的消息响应失败，平台会间隔2分钟持续通知（限制100次）
注意：如果产品的释放为耗时操作，在收到通知后需要自行存储消息异步处理，不能阻塞通知请求导致网络超时（超时时间5s)
 * Summary: SPI-释放产品实例
*/
func (client *Client) ReleaseSpProduct(request *ReleaseSpProductRequest) (_result *ReleaseSpProductResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ReleaseSpProductResponse{}
	_body, _err := client.ReleaseSpProductEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 用户主动删除实例或欠费逾期平台按照约定进行强制删除。
释放操作属于通知类指令，即平台只负责通知到产品，不关心产品的业务处理结果。产品方应保证快速响应。因为网络问题或者产品系统的故障导致的消息响应失败，平台会间隔2分钟持续通知（限制100次）
注意：如果产品的释放为耗时操作，在收到通知后需要自行存储消息异步处理，不能阻塞通知请求导致网络超时（超时时间5s)
 * Summary: SPI-释放产品实例
*/
func (client *Client) ReleaseSpProductEx(request *ReleaseSpProductRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ReleaseSpProductResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ReleaseSpProductResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloudspi.sp.product.release"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 对于操作型指令（创建、变配）平台用来查询底层对指定订单的生产结果（如果超过规定时间没有主动告知平台结果）。
注意：平台根据 order_no 查询，需要根据order_no做好结果保存。一般不会查询历史订单执行记录，主要用于在规定的生产时间内，底层因为网络、超时等问题导致没有能够将结果”通知“给平台。在产品上架时允许自定义操作指令的超时时间（默认最大120分钟）。建议可以控制产品生产时间的情况下配置一个合理的超时时间，便于及时定位异常问题，减少用户页面等待时间。如需要配置联系平台。
接口为同步，最大超时时间5s，失败尝试3次（间隔2s）。
 * Summary: SPI-获取产品订单结果
*/
func (client *Client) GetSpProductOrder(request *GetSpProductOrderRequest) (_result *GetSpProductOrderResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetSpProductOrderResponse{}
	_body, _err := client.GetSpProductOrderEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 对于操作型指令（创建、变配）平台用来查询底层对指定订单的生产结果（如果超过规定时间没有主动告知平台结果）。
注意：平台根据 order_no 查询，需要根据order_no做好结果保存。一般不会查询历史订单执行记录，主要用于在规定的生产时间内，底层因为网络、超时等问题导致没有能够将结果”通知“给平台。在产品上架时允许自定义操作指令的超时时间（默认最大120分钟）。建议可以控制产品生产时间的情况下配置一个合理的超时时间，便于及时定位异常问题，减少用户页面等待时间。如需要配置联系平台。
接口为同步，最大超时时间5s，失败尝试3次（间隔2s）。
 * Summary: SPI-获取产品订单结果
*/
func (client *Client) GetSpProductOrderEx(request *GetSpProductOrderRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetSpProductOrderResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetSpProductOrderResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloudspi.sp.product.order.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 提供订单系统渲染购买页，从产品方加载部分个性化的展示内容。
 * Summary: 从产品方加载购买页参数
 */
func (client *Client) LoadSpProductOrderparameter(request *LoadSpProductOrderparameterRequest) (_result *LoadSpProductOrderparameterResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &LoadSpProductOrderparameterResponse{}
	_body, _err := client.LoadSpProductOrderparameterEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 提供订单系统渲染购买页，从产品方加载部分个性化的展示内容。
 * Summary: 从产品方加载购买页参数
 */
func (client *Client) LoadSpProductOrderparameterEx(request *LoadSpProductOrderparameterRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *LoadSpProductOrderparameterResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &LoadSpProductOrderparameterResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloudspi.sp.product.orderparameter.load"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 交易结果通知
 * Summary: 交易结果通知
 */
func (client *Client) SyncIndustryTradeResult(request *SyncIndustryTradeResultRequest) (_result *SyncIndustryTradeResultResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SyncIndustryTradeResultResponse{}
	_body, _err := client.SyncIndustryTradeResultEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 交易结果通知
 * Summary: 交易结果通知
 */
func (client *Client) SyncIndustryTradeResultEx(request *SyncIndustryTradeResultRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SyncIndustryTradeResultResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SyncIndustryTradeResultResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloudspi.industry.trade.result.sync"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 商家注册结果通知
 * Summary: 商家注册结果通知
 */
func (client *Client) SyncMerchantSignResult(request *SyncMerchantSignResultRequest) (_result *SyncMerchantSignResultResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SyncMerchantSignResultResponse{}
	_body, _err := client.SyncMerchantSignResultEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 商家注册结果通知
 * Summary: 商家注册结果通知
 */
func (client *Client) SyncMerchantSignResultEx(request *SyncMerchantSignResultRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SyncMerchantSignResultResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SyncMerchantSignResultResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloudspi.merchant.sign.result.sync"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 产品开通指令。即租户开通了指定产品（比如：开通实人认证）。对于能力产品可能需要初始化操作。
开通会生成产品实例ID，作为后续生命周期SPI管理资源的标识。用户开通一个产品会生成一个产品实例ID，如果后面欠费释放后再次开通会生成新的产品实例ID。
目前开通只支持同步操作（目前超时最大5s），对于操作需要进行内部初始化的场景暂不支持。
注意：开通操作中台会通知能力产品所有集群，如果其中一个集群失败，用户可以重试开通-触发中台重复通知（集群）。需要根据订单号order_no做好幂等判断。
 * Summary: SPI-开通产品
*/
func (client *Client) OpenSpProduct(request *OpenSpProductRequest) (_result *OpenSpProductResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &OpenSpProductResponse{}
	_body, _err := client.OpenSpProductEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 产品开通指令。即租户开通了指定产品（比如：开通实人认证）。对于能力产品可能需要初始化操作。
开通会生成产品实例ID，作为后续生命周期SPI管理资源的标识。用户开通一个产品会生成一个产品实例ID，如果后面欠费释放后再次开通会生成新的产品实例ID。
目前开通只支持同步操作（目前超时最大5s），对于操作需要进行内部初始化的场景暂不支持。
注意：开通操作中台会通知能力产品所有集群，如果其中一个集群失败，用户可以重试开通-触发中台重复通知（集群）。需要根据订单号order_no做好幂等判断。
 * Summary: SPI-开通产品
*/
func (client *Client) OpenSpProductEx(request *OpenSpProductRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *OpenSpProductResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &OpenSpProductResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloudspi.sp.product.open"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
