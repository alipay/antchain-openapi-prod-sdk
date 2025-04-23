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

// api信息结构体
type ApiInfoModel struct {
	// api名称
	ApiName *string `json:"api_name,omitempty" xml:"api_name,omitempty" require:"true"`
	// API所属网关技术产品码
	ProdCode *string `json:"prod_code,omitempty" xml:"prod_code,omitempty" require:"true"`
	// 是否是内部接口 0对外 1对内
	Internal *int64 `json:"internal,omitempty" xml:"internal,omitempty" require:"true"`
	// api版本号
	ApiVersion *string `json:"api_version,omitempty" xml:"api_version,omitempty" require:"true"`
	// api描述
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

// 能力信息
type AbilityInfo struct {
	// 能力编号
	AbilityId *string `json:"ability_id,omitempty" xml:"ability_id,omitempty" require:"true"`
	// 能力名称
	AbilityName *string `json:"ability_name,omitempty" xml:"ability_name,omitempty" require:"true"`
	// 研发负责人
	DevOwner *string `json:"dev_owner,omitempty" xml:"dev_owner,omitempty" require:"true"`
	// 创建时间
	GmtCreate *string `json:"gmt_create,omitempty" xml:"gmt_create,omitempty" require:"true"`
	// 描述信息
	Description *string `json:"description,omitempty" xml:"description,omitempty" require:"true"`
	// 研发负责人邮箱前缀
	DevOwnerPrefixEmail *string `json:"dev_owner_prefix_email,omitempty" xml:"dev_owner_prefix_email,omitempty" require:"true"`
	// 产品负责人
	ProductOwner *string `json:"product_owner,omitempty" xml:"product_owner,omitempty" require:"true"`
	// 能力对应商业中台L5Code
	BusinessCode *string `json:"business_code,omitempty" xml:"business_code,omitempty"`
	// apiInfoModels列表
	ApiInfoModels []*ApiInfoModel `json:"api_info_models,omitempty" xml:"api_info_models,omitempty" require:"true" type:"Repeated"`
	// 能力sla看板url
	SlaUrl *string `json:"sla_url,omitempty" xml:"sla_url,omitempty"`
}

func (s AbilityInfo) String() string {
	return tea.Prettify(s)
}

func (s AbilityInfo) GoString() string {
	return s.String()
}

func (s *AbilityInfo) SetAbilityId(v string) *AbilityInfo {
	s.AbilityId = &v
	return s
}

func (s *AbilityInfo) SetAbilityName(v string) *AbilityInfo {
	s.AbilityName = &v
	return s
}

func (s *AbilityInfo) SetDevOwner(v string) *AbilityInfo {
	s.DevOwner = &v
	return s
}

func (s *AbilityInfo) SetGmtCreate(v string) *AbilityInfo {
	s.GmtCreate = &v
	return s
}

func (s *AbilityInfo) SetDescription(v string) *AbilityInfo {
	s.Description = &v
	return s
}

func (s *AbilityInfo) SetDevOwnerPrefixEmail(v string) *AbilityInfo {
	s.DevOwnerPrefixEmail = &v
	return s
}

func (s *AbilityInfo) SetProductOwner(v string) *AbilityInfo {
	s.ProductOwner = &v
	return s
}

func (s *AbilityInfo) SetBusinessCode(v string) *AbilityInfo {
	s.BusinessCode = &v
	return s
}

func (s *AbilityInfo) SetApiInfoModels(v []*ApiInfoModel) *AbilityInfo {
	s.ApiInfoModels = v
	return s
}

func (s *AbilityInfo) SetSlaUrl(v string) *AbilityInfo {
	s.SlaUrl = &v
	return s
}

type QueryAntchainAbcAbcdaAbcddaaRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s QueryAntchainAbcAbcdaAbcddaaRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAntchainAbcAbcdaAbcddaaRequest) GoString() string {
	return s.String()
}

func (s *QueryAntchainAbcAbcdaAbcddaaRequest) SetAuthToken(v string) *QueryAntchainAbcAbcdaAbcddaaRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAntchainAbcAbcdaAbcddaaRequest) SetProductInstanceId(v string) *QueryAntchainAbcAbcdaAbcddaaRequest {
	s.ProductInstanceId = &v
	return s
}

type QueryAntchainAbcAbcdaAbcddaaResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s QueryAntchainAbcAbcdaAbcddaaResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAntchainAbcAbcdaAbcddaaResponse) GoString() string {
	return s.String()
}

func (s *QueryAntchainAbcAbcdaAbcddaaResponse) SetReqMsgId(v string) *QueryAntchainAbcAbcdaAbcddaaResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAntchainAbcAbcdaAbcddaaResponse) SetResultCode(v string) *QueryAntchainAbcAbcdaAbcddaaResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAntchainAbcAbcdaAbcddaaResponse) SetResultMsg(v string) *QueryAntchainAbcAbcdaAbcddaaResponse {
	s.ResultMsg = &v
	return s
}

type BindDemoAaaBbbCccRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 123
	Date *string `json:"date,omitempty" xml:"date,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 123
	Data *string `json:"data,omitempty" xml:"data,omitempty" require:"true"`
}

func (s BindDemoAaaBbbCccRequest) String() string {
	return tea.Prettify(s)
}

func (s BindDemoAaaBbbCccRequest) GoString() string {
	return s.String()
}

func (s *BindDemoAaaBbbCccRequest) SetAuthToken(v string) *BindDemoAaaBbbCccRequest {
	s.AuthToken = &v
	return s
}

func (s *BindDemoAaaBbbCccRequest) SetProductInstanceId(v string) *BindDemoAaaBbbCccRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *BindDemoAaaBbbCccRequest) SetDate(v string) *BindDemoAaaBbbCccRequest {
	s.Date = &v
	return s
}

func (s *BindDemoAaaBbbCccRequest) SetData(v string) *BindDemoAaaBbbCccRequest {
	s.Data = &v
	return s
}

type BindDemoAaaBbbCccResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s BindDemoAaaBbbCccResponse) String() string {
	return tea.Prettify(s)
}

func (s BindDemoAaaBbbCccResponse) GoString() string {
	return s.String()
}

func (s *BindDemoAaaBbbCccResponse) SetReqMsgId(v string) *BindDemoAaaBbbCccResponse {
	s.ReqMsgId = &v
	return s
}

func (s *BindDemoAaaBbbCccResponse) SetResultCode(v string) *BindDemoAaaBbbCccResponse {
	s.ResultCode = &v
	return s
}

func (s *BindDemoAaaBbbCccResponse) SetResultMsg(v string) *BindDemoAaaBbbCccResponse {
	s.ResultMsg = &v
	return s
}

type BindAntchainSaasAbilityRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// api名称
	ApiName *string `json:"api_name,omitempty" xml:"api_name,omitempty" require:"true"`
	// 能力id列表
	AbilityIds []*string `json:"ability_ids,omitempty" xml:"ability_ids,omitempty" require:"true" type:"Repeated"`
	// 操作人的域账号
	OperatorId *string `json:"operator_id,omitempty" xml:"operator_id,omitempty" require:"true"`
	// api信息
	ApiInfoModel *ApiInfoModel `json:"api_info_model,omitempty" xml:"api_info_model,omitempty" require:"true"`
}

func (s BindAntchainSaasAbilityRequest) String() string {
	return tea.Prettify(s)
}

func (s BindAntchainSaasAbilityRequest) GoString() string {
	return s.String()
}

func (s *BindAntchainSaasAbilityRequest) SetAuthToken(v string) *BindAntchainSaasAbilityRequest {
	s.AuthToken = &v
	return s
}

func (s *BindAntchainSaasAbilityRequest) SetProductInstanceId(v string) *BindAntchainSaasAbilityRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *BindAntchainSaasAbilityRequest) SetApiName(v string) *BindAntchainSaasAbilityRequest {
	s.ApiName = &v
	return s
}

func (s *BindAntchainSaasAbilityRequest) SetAbilityIds(v []*string) *BindAntchainSaasAbilityRequest {
	s.AbilityIds = v
	return s
}

func (s *BindAntchainSaasAbilityRequest) SetOperatorId(v string) *BindAntchainSaasAbilityRequest {
	s.OperatorId = &v
	return s
}

func (s *BindAntchainSaasAbilityRequest) SetApiInfoModel(v *ApiInfoModel) *BindAntchainSaasAbilityRequest {
	s.ApiInfoModel = v
	return s
}

type BindAntchainSaasAbilityResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s BindAntchainSaasAbilityResponse) String() string {
	return tea.Prettify(s)
}

func (s BindAntchainSaasAbilityResponse) GoString() string {
	return s.String()
}

func (s *BindAntchainSaasAbilityResponse) SetReqMsgId(v string) *BindAntchainSaasAbilityResponse {
	s.ReqMsgId = &v
	return s
}

func (s *BindAntchainSaasAbilityResponse) SetResultCode(v string) *BindAntchainSaasAbilityResponse {
	s.ResultCode = &v
	return s
}

func (s *BindAntchainSaasAbilityResponse) SetResultMsg(v string) *BindAntchainSaasAbilityResponse {
	s.ResultMsg = &v
	return s
}

type QueryDemoAbcAbcAbcRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s QueryDemoAbcAbcAbcRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDemoAbcAbcAbcRequest) GoString() string {
	return s.String()
}

func (s *QueryDemoAbcAbcAbcRequest) SetAuthToken(v string) *QueryDemoAbcAbcAbcRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDemoAbcAbcAbcRequest) SetProductInstanceId(v string) *QueryDemoAbcAbcAbcRequest {
	s.ProductInstanceId = &v
	return s
}

type QueryDemoAbcAbcAbcResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s QueryDemoAbcAbcAbcResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDemoAbcAbcAbcResponse) GoString() string {
	return s.String()
}

func (s *QueryDemoAbcAbcAbcResponse) SetReqMsgId(v string) *QueryDemoAbcAbcAbcResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDemoAbcAbcAbcResponse) SetResultCode(v string) *QueryDemoAbcAbcAbcResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDemoAbcAbcAbcResponse) SetResultMsg(v string) *QueryDemoAbcAbcAbcResponse {
	s.ResultMsg = &v
	return s
}

type CallbackAntchainSaasAbilityRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// api名称集合
	ApiNames []*string `json:"api_names,omitempty" xml:"api_names,omitempty" require:"true" type:"Repeated"`
}

func (s CallbackAntchainSaasAbilityRequest) String() string {
	return tea.Prettify(s)
}

func (s CallbackAntchainSaasAbilityRequest) GoString() string {
	return s.String()
}

func (s *CallbackAntchainSaasAbilityRequest) SetAuthToken(v string) *CallbackAntchainSaasAbilityRequest {
	s.AuthToken = &v
	return s
}

func (s *CallbackAntchainSaasAbilityRequest) SetProductInstanceId(v string) *CallbackAntchainSaasAbilityRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CallbackAntchainSaasAbilityRequest) SetApiNames(v []*string) *CallbackAntchainSaasAbilityRequest {
	s.ApiNames = v
	return s
}

type CallbackAntchainSaasAbilityResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CallbackAntchainSaasAbilityResponse) String() string {
	return tea.Prettify(s)
}

func (s CallbackAntchainSaasAbilityResponse) GoString() string {
	return s.String()
}

func (s *CallbackAntchainSaasAbilityResponse) SetReqMsgId(v string) *CallbackAntchainSaasAbilityResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CallbackAntchainSaasAbilityResponse) SetResultCode(v string) *CallbackAntchainSaasAbilityResponse {
	s.ResultCode = &v
	return s
}

func (s *CallbackAntchainSaasAbilityResponse) SetResultMsg(v string) *CallbackAntchainSaasAbilityResponse {
	s.ResultMsg = &v
	return s
}

type BindAntchainSaasAbilityApiRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 共享能力id
	AbilityId *string `json:"ability_id,omitempty" xml:"ability_id,omitempty" require:"true"`
	// qiujianglong.qjl
	OperatorId *string `json:"operator_id,omitempty" xml:"operator_id,omitempty" require:"true"`
	// api模型集合
	ApiInfoModels []*ApiInfoModel `json:"api_info_models,omitempty" xml:"api_info_models,omitempty" require:"true" type:"Repeated"`
}

func (s BindAntchainSaasAbilityApiRequest) String() string {
	return tea.Prettify(s)
}

func (s BindAntchainSaasAbilityApiRequest) GoString() string {
	return s.String()
}

func (s *BindAntchainSaasAbilityApiRequest) SetAuthToken(v string) *BindAntchainSaasAbilityApiRequest {
	s.AuthToken = &v
	return s
}

func (s *BindAntchainSaasAbilityApiRequest) SetProductInstanceId(v string) *BindAntchainSaasAbilityApiRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *BindAntchainSaasAbilityApiRequest) SetAbilityId(v string) *BindAntchainSaasAbilityApiRequest {
	s.AbilityId = &v
	return s
}

func (s *BindAntchainSaasAbilityApiRequest) SetOperatorId(v string) *BindAntchainSaasAbilityApiRequest {
	s.OperatorId = &v
	return s
}

func (s *BindAntchainSaasAbilityApiRequest) SetApiInfoModels(v []*ApiInfoModel) *BindAntchainSaasAbilityApiRequest {
	s.ApiInfoModels = v
	return s
}

type BindAntchainSaasAbilityApiResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s BindAntchainSaasAbilityApiResponse) String() string {
	return tea.Prettify(s)
}

func (s BindAntchainSaasAbilityApiResponse) GoString() string {
	return s.String()
}

func (s *BindAntchainSaasAbilityApiResponse) SetReqMsgId(v string) *BindAntchainSaasAbilityApiResponse {
	s.ReqMsgId = &v
	return s
}

func (s *BindAntchainSaasAbilityApiResponse) SetResultCode(v string) *BindAntchainSaasAbilityApiResponse {
	s.ResultCode = &v
	return s
}

func (s *BindAntchainSaasAbilityApiResponse) SetResultMsg(v string) *BindAntchainSaasAbilityApiResponse {
	s.ResultMsg = &v
	return s
}

type QueryAntchainSaasAbilityBusinesscodeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 能力id
	AbilityId *string `json:"ability_id,omitempty" xml:"ability_id,omitempty" require:"true"`
}

func (s QueryAntchainSaasAbilityBusinesscodeRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAntchainSaasAbilityBusinesscodeRequest) GoString() string {
	return s.String()
}

func (s *QueryAntchainSaasAbilityBusinesscodeRequest) SetAuthToken(v string) *QueryAntchainSaasAbilityBusinesscodeRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAntchainSaasAbilityBusinesscodeRequest) SetProductInstanceId(v string) *QueryAntchainSaasAbilityBusinesscodeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAntchainSaasAbilityBusinesscodeRequest) SetAbilityId(v string) *QueryAntchainSaasAbilityBusinesscodeRequest {
	s.AbilityId = &v
	return s
}

type QueryAntchainSaasAbilityBusinesscodeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 能力信息
	AbilityInfo *AbilityInfo `json:"ability_info,omitempty" xml:"ability_info,omitempty"`
}

func (s QueryAntchainSaasAbilityBusinesscodeResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAntchainSaasAbilityBusinesscodeResponse) GoString() string {
	return s.String()
}

func (s *QueryAntchainSaasAbilityBusinesscodeResponse) SetReqMsgId(v string) *QueryAntchainSaasAbilityBusinesscodeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAntchainSaasAbilityBusinesscodeResponse) SetResultCode(v string) *QueryAntchainSaasAbilityBusinesscodeResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAntchainSaasAbilityBusinesscodeResponse) SetResultMsg(v string) *QueryAntchainSaasAbilityBusinesscodeResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAntchainSaasAbilityBusinesscodeResponse) SetAbilityInfo(v *AbilityInfo) *QueryAntchainSaasAbilityBusinesscodeResponse {
	s.AbilityInfo = v
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
				"sdk_version":      tea.String("1.0.9"),
				"_prod_code":       tea.String("ak_a1f82644937c486c81a62b0e5a6b4fbe"),
				"_prod_channel":    tea.String("saas"),
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
 * Description: 调试a s dddd
 * Summary: 调试1
 */
func (client *Client) QueryAntchainAbcAbcdaAbcddaa(request *QueryAntchainAbcAbcdaAbcddaaRequest) (_result *QueryAntchainAbcAbcdaAbcddaaResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAntchainAbcAbcdaAbcddaaResponse{}
	_body, _err := client.QueryAntchainAbcAbcdaAbcddaaEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 调试a s dddd
 * Summary: 调试1
 */
func (client *Client) QueryAntchainAbcAbcdaAbcddaaEx(request *QueryAntchainAbcAbcdaAbcddaaRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAntchainAbcAbcdaAbcddaaResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAntchainAbcAbcdaAbcddaaResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.abc.abcda.abcddaa.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 自动化测试创建test，请勿修改、删除
 * Summary: 自动化测试创建test1
 */
func (client *Client) BindDemoAaaBbbCcc(request *BindDemoAaaBbbCccRequest) (_result *BindDemoAaaBbbCccResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &BindDemoAaaBbbCccResponse{}
	_body, _err := client.BindDemoAaaBbbCccEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 自动化测试创建test，请勿修改、删除
 * Summary: 自动化测试创建test1
 */
func (client *Client) BindDemoAaaBbbCccEx(request *BindDemoAaaBbbCccRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *BindDemoAaaBbbCccResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &BindDemoAaaBbbCccResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.aaa.bbb.ccc.bind"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 绑定API
 * Summary: 绑定能力与API关系
 */
func (client *Client) BindAntchainSaasAbility(request *BindAntchainSaasAbilityRequest) (_result *BindAntchainSaasAbilityResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &BindAntchainSaasAbilityResponse{}
	_body, _err := client.BindAntchainSaasAbilityEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 绑定API
 * Summary: 绑定能力与API关系
 */
func (client *Client) BindAntchainSaasAbilityEx(request *BindAntchainSaasAbilityRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *BindAntchainSaasAbilityResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &BindAntchainSaasAbilityResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.saas.ability.bind"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 自动化测试创建,用于测试API的修改
 * Summary: 自动化测试创建,用于测试API的修改勿动
 */
func (client *Client) QueryDemoAbcAbcAbc(request *QueryDemoAbcAbcAbcRequest) (_result *QueryDemoAbcAbcAbcResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDemoAbcAbcAbcResponse{}
	_body, _err := client.QueryDemoAbcAbcAbcEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 自动化测试创建,用于测试API的修改
 * Summary: 自动化测试创建,用于测试API的修改勿动
 */
func (client *Client) QueryDemoAbcAbcAbcEx(request *QueryDemoAbcAbcAbcRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDemoAbcAbcAbcResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDemoAbcAbcAbcResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.abc.abc.abc.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: api上线回调接口
 * Summary: api上线回调接口
 */
func (client *Client) CallbackAntchainSaasAbility(request *CallbackAntchainSaasAbilityRequest) (_result *CallbackAntchainSaasAbilityResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CallbackAntchainSaasAbilityResponse{}
	_body, _err := client.CallbackAntchainSaasAbilityEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: api上线回调接口
 * Summary: api上线回调接口
 */
func (client *Client) CallbackAntchainSaasAbilityEx(request *CallbackAntchainSaasAbilityRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CallbackAntchainSaasAbilityResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CallbackAntchainSaasAbilityResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.saas.ability.callback"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 绑定能力的api信息
 * Summary: 绑定能力的api信息
 */
func (client *Client) BindAntchainSaasAbilityApi(request *BindAntchainSaasAbilityApiRequest) (_result *BindAntchainSaasAbilityApiResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &BindAntchainSaasAbilityApiResponse{}
	_body, _err := client.BindAntchainSaasAbilityApiEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 绑定能力的api信息
 * Summary: 绑定能力的api信息
 */
func (client *Client) BindAntchainSaasAbilityApiEx(request *BindAntchainSaasAbilityApiRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *BindAntchainSaasAbilityApiResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &BindAntchainSaasAbilityApiResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.saas.ability.api.bind"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 根据能力id查询能力信息
 * Summary: 根据能力id查询能力信息
 */
func (client *Client) QueryAntchainSaasAbilityBusinesscode(request *QueryAntchainSaasAbilityBusinesscodeRequest) (_result *QueryAntchainSaasAbilityBusinesscodeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAntchainSaasAbilityBusinesscodeResponse{}
	_body, _err := client.QueryAntchainSaasAbilityBusinesscodeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 根据能力id查询能力信息
 * Summary: 根据能力id查询能力信息
 */
func (client *Client) QueryAntchainSaasAbilityBusinesscodeEx(request *QueryAntchainSaasAbilityBusinesscodeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAntchainSaasAbilityBusinesscodeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAntchainSaasAbilityBusinesscodeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.saas.ability.businesscode.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
