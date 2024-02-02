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

// 匹配规则
type ItemMatchingRule struct {
	// 计量项匹配规则
	MeteringMatchingRule *string `json:"metering_matching_rule,omitempty" xml:"metering_matching_rule,omitempty"`
	// 1
	MeteringValue *string `json:"metering_value,omitempty" xml:"metering_value,omitempty" require:"true"`
}

func (s ItemMatchingRule) String() string {
	return tea.Prettify(s)
}

func (s ItemMatchingRule) GoString() string {
	return s.String()
}

func (s *ItemMatchingRule) SetMeteringMatchingRule(v string) *ItemMatchingRule {
	s.MeteringMatchingRule = &v
	return s
}

func (s *ItemMatchingRule) SetMeteringValue(v string) *ItemMatchingRule {
	s.MeteringValue = &v
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

// 能力与API关联信息
type AbilityApiRelation struct {
	// api名称
	ApiName *string `json:"api_name,omitempty" xml:"api_name,omitempty" require:"true"`
	// 能力列表
	AbilityInfoList []*AbilityInfo `json:"ability_info_list,omitempty" xml:"ability_info_list,omitempty" require:"true" type:"Repeated"`
}

func (s AbilityApiRelation) String() string {
	return tea.Prettify(s)
}

func (s AbilityApiRelation) GoString() string {
	return s.String()
}

func (s *AbilityApiRelation) SetApiName(v string) *AbilityApiRelation {
	s.ApiName = &v
	return s
}

func (s *AbilityApiRelation) SetAbilityInfoList(v []*AbilityInfo) *AbilityApiRelation {
	s.AbilityInfoList = v
	return s
}

// 计量项
type ItemRule struct {
	// 上报次数
	MeteringItem *string `json:"metering_item,omitempty" xml:"metering_item,omitempty" require:"true"`
	// 计量项列表
	ItemMatchingRules []*ItemMatchingRule `json:"item_matching_rules,omitempty" xml:"item_matching_rules,omitempty" require:"true" type:"Repeated"`
}

func (s ItemRule) String() string {
	return tea.Prettify(s)
}

func (s ItemRule) GoString() string {
	return s.String()
}

func (s *ItemRule) SetMeteringItem(v string) *ItemRule {
	s.MeteringItem = &v
	return s
}

func (s *ItemRule) SetItemMatchingRules(v []*ItemMatchingRule) *ItemRule {
	s.ItemMatchingRules = v
	return s
}

// api 信息
type ApiInfo struct {
	// 查询不动产接口
	ApiCode *string `json:"api_code,omitempty" xml:"api_code,omitempty" require:"true"`
	// api pb文件定义
	ApiProtobufDefinition *string `json:"api_protobuf_definition,omitempty" xml:"api_protobuf_definition,omitempty" require:"true"`
}

func (s ApiInfo) String() string {
	return tea.Prettify(s)
}

func (s ApiInfo) GoString() string {
	return s.String()
}

func (s *ApiInfo) SetApiCode(v string) *ApiInfo {
	s.ApiCode = &v
	return s
}

func (s *ApiInfo) SetApiProtobufDefinition(v string) *ApiInfo {
	s.ApiProtobufDefinition = &v
	return s
}

// 干系人
type RelUser struct {
	// 工号
	EmpId *string `json:"emp_id,omitempty" xml:"emp_id,omitempty" require:"true"`
	// 域账号
	LoginName *string `json:"login_name,omitempty" xml:"login_name,omitempty" require:"true"`
	// 花名
	NickName *string `json:"nick_name,omitempty" xml:"nick_name,omitempty" require:"true"`
	// 角色，PD-产品经理，DEV-研发
	Role *string `json:"role,omitempty" xml:"role,omitempty" require:"true"`
}

func (s RelUser) String() string {
	return tea.Prettify(s)
}

func (s RelUser) GoString() string {
	return s.String()
}

func (s *RelUser) SetEmpId(v string) *RelUser {
	s.EmpId = &v
	return s
}

func (s *RelUser) SetLoginName(v string) *RelUser {
	s.LoginName = &v
	return s
}

func (s *RelUser) SetNickName(v string) *RelUser {
	s.NickName = &v
	return s
}

func (s *RelUser) SetRole(v string) *RelUser {
	s.Role = &v
	return s
}

//  计量规则
type MethodMatchingRule struct {
	// 网关api
	Method *string `json:"method,omitempty" xml:"method,omitempty" require:"true"`
	// 匹配规则
	MatchingRule *string `json:"matching_rule,omitempty" xml:"matching_rule,omitempty" require:"true"`
}

func (s MethodMatchingRule) String() string {
	return tea.Prettify(s)
}

func (s MethodMatchingRule) GoString() string {
	return s.String()
}

func (s *MethodMatchingRule) SetMethod(v string) *MethodMatchingRule {
	s.Method = &v
	return s
}

func (s *MethodMatchingRule) SetMatchingRule(v string) *MethodMatchingRule {
	s.MatchingRule = &v
	return s
}

// sdk的maven依赖信息
type SdkMavenDependencyInfo struct {
	// client端maven依赖，包含蚂蚁链版本和金融云版本依赖信息
	ReferenceClient *string `json:"reference_client,omitempty" xml:"reference_client,omitempty" require:"true"`
	// 客户端server端依赖，产品api基于技术产品纬度使用技术客户端sdk构建，此处依赖基本使用不到
	ReferencServer *string `json:"referenc_server,omitempty" xml:"referenc_server,omitempty"`
	// client端maven仓库地址
	MavenLinkClient *string `json:"maven_link_client,omitempty" xml:"maven_link_client,omitempty" require:"true"`
	// server端maven仓库地址
	MavenLinkServer *string `json:"maven_link_server,omitempty" xml:"maven_link_server,omitempty"`
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

// 键值对，兼容map用
type KeyValuePair struct {
	// key
	Key *string `json:"key,omitempty" xml:"key,omitempty" require:"true"`
	// value
	Value *string `json:"value,omitempty" xml:"value,omitempty"`
}

func (s KeyValuePair) String() string {
	return tea.Prettify(s)
}

func (s KeyValuePair) GoString() string {
	return s.String()
}

func (s *KeyValuePair) SetKey(v string) *KeyValuePair {
	s.Key = &v
	return s
}

func (s *KeyValuePair) SetValue(v string) *KeyValuePair {
	s.Value = &v
	return s
}

type RunMarketServiceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 业务方传入，幂等用。
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// saas产品code
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty" require:"true"`
	// 服务code
	ServiceCode *string `json:"service_code,omitempty" xml:"service_code,omitempty" require:"true"`
	// 子服务code
	SubServiceCode *string `json:"sub_service_code,omitempty" xml:"sub_service_code,omitempty"`
	// 服务版本
	ServiceVersion *string `json:"service_version,omitempty" xml:"service_version,omitempty" require:"true"`
	// 业务参数，map格式
	Params []*KeyValuePair `json:"params,omitempty" xml:"params,omitempty" type:"Repeated"`
}

func (s RunMarketServiceRequest) String() string {
	return tea.Prettify(s)
}

func (s RunMarketServiceRequest) GoString() string {
	return s.String()
}

func (s *RunMarketServiceRequest) SetAuthToken(v string) *RunMarketServiceRequest {
	s.AuthToken = &v
	return s
}

func (s *RunMarketServiceRequest) SetProductInstanceId(v string) *RunMarketServiceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *RunMarketServiceRequest) SetBizId(v string) *RunMarketServiceRequest {
	s.BizId = &v
	return s
}

func (s *RunMarketServiceRequest) SetProductCode(v string) *RunMarketServiceRequest {
	s.ProductCode = &v
	return s
}

func (s *RunMarketServiceRequest) SetServiceCode(v string) *RunMarketServiceRequest {
	s.ServiceCode = &v
	return s
}

func (s *RunMarketServiceRequest) SetSubServiceCode(v string) *RunMarketServiceRequest {
	s.SubServiceCode = &v
	return s
}

func (s *RunMarketServiceRequest) SetServiceVersion(v string) *RunMarketServiceRequest {
	s.ServiceVersion = &v
	return s
}

func (s *RunMarketServiceRequest) SetParams(v []*KeyValuePair) *RunMarketServiceRequest {
	s.Params = v
	return s
}

type RunMarketServiceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 服务调用结果
	ResultData []*KeyValuePair `json:"result_data,omitempty" xml:"result_data,omitempty" type:"Repeated"`
}

func (s RunMarketServiceResponse) String() string {
	return tea.Prettify(s)
}

func (s RunMarketServiceResponse) GoString() string {
	return s.String()
}

func (s *RunMarketServiceResponse) SetReqMsgId(v string) *RunMarketServiceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *RunMarketServiceResponse) SetResultCode(v string) *RunMarketServiceResponse {
	s.ResultCode = &v
	return s
}

func (s *RunMarketServiceResponse) SetResultMsg(v string) *RunMarketServiceResponse {
	s.ResultMsg = &v
	return s
}

func (s *RunMarketServiceResponse) SetResultData(v []*KeyValuePair) *RunMarketServiceResponse {
	s.ResultData = v
	return s
}

type QueryMarketSolutionRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 解决方案code
	SolutionCode *string `json:"solution_code,omitempty" xml:"solution_code,omitempty" require:"true"`
}

func (s QueryMarketSolutionRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryMarketSolutionRequest) GoString() string {
	return s.String()
}

func (s *QueryMarketSolutionRequest) SetAuthToken(v string) *QueryMarketSolutionRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryMarketSolutionRequest) SetProductInstanceId(v string) *QueryMarketSolutionRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryMarketSolutionRequest) SetSolutionCode(v string) *QueryMarketSolutionRequest {
	s.SolutionCode = &v
	return s
}

type QueryMarketSolutionResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 查询结果
	ResultData []*KeyValuePair `json:"result_data,omitempty" xml:"result_data,omitempty" type:"Repeated"`
}

func (s QueryMarketSolutionResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryMarketSolutionResponse) GoString() string {
	return s.String()
}

func (s *QueryMarketSolutionResponse) SetReqMsgId(v string) *QueryMarketSolutionResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryMarketSolutionResponse) SetResultCode(v string) *QueryMarketSolutionResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryMarketSolutionResponse) SetResultMsg(v string) *QueryMarketSolutionResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryMarketSolutionResponse) SetResultData(v []*KeyValuePair) *QueryMarketSolutionResponse {
	s.ResultData = v
	return s
}

type QueryAbilityWithproductRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 产品编码，源自于开放平台OPM定义的技术产品编码
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty" require:"true"`
}

func (s QueryAbilityWithproductRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAbilityWithproductRequest) GoString() string {
	return s.String()
}

func (s *QueryAbilityWithproductRequest) SetAuthToken(v string) *QueryAbilityWithproductRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAbilityWithproductRequest) SetProductInstanceId(v string) *QueryAbilityWithproductRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAbilityWithproductRequest) SetProductCode(v string) *QueryAbilityWithproductRequest {
	s.ProductCode = &v
	return s
}

type QueryAbilityWithproductResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 能力列表
	AbilityInfoList []*AbilityInfo `json:"ability_info_list,omitempty" xml:"ability_info_list,omitempty" type:"Repeated"`
}

func (s QueryAbilityWithproductResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAbilityWithproductResponse) GoString() string {
	return s.String()
}

func (s *QueryAbilityWithproductResponse) SetReqMsgId(v string) *QueryAbilityWithproductResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAbilityWithproductResponse) SetResultCode(v string) *QueryAbilityWithproductResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAbilityWithproductResponse) SetResultMsg(v string) *QueryAbilityWithproductResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAbilityWithproductResponse) SetAbilityInfoList(v []*AbilityInfo) *QueryAbilityWithproductResponse {
	s.AbilityInfoList = v
	return s
}

type PagequeryAbilityRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 当前页码
	Current *int64 `json:"current,omitempty" xml:"current,omitempty" require:"true"`
	// 每页大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
	// 用于能力的搜索标签
	Keyword *string `json:"keyword,omitempty" xml:"keyword,omitempty"`
	// 网关产品码
	GwProdCode *string `json:"gw_prod_code,omitempty" xml:"gw_prod_code,omitempty"`
}

func (s PagequeryAbilityRequest) String() string {
	return tea.Prettify(s)
}

func (s PagequeryAbilityRequest) GoString() string {
	return s.String()
}

func (s *PagequeryAbilityRequest) SetAuthToken(v string) *PagequeryAbilityRequest {
	s.AuthToken = &v
	return s
}

func (s *PagequeryAbilityRequest) SetProductInstanceId(v string) *PagequeryAbilityRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PagequeryAbilityRequest) SetCurrent(v int64) *PagequeryAbilityRequest {
	s.Current = &v
	return s
}

func (s *PagequeryAbilityRequest) SetPageSize(v int64) *PagequeryAbilityRequest {
	s.PageSize = &v
	return s
}

func (s *PagequeryAbilityRequest) SetKeyword(v string) *PagequeryAbilityRequest {
	s.Keyword = &v
	return s
}

func (s *PagequeryAbilityRequest) SetGwProdCode(v string) *PagequeryAbilityRequest {
	s.GwProdCode = &v
	return s
}

type PagequeryAbilityResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 当前页码
	Current *int64 `json:"current,omitempty" xml:"current,omitempty"`
	// 当前页大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// 总数
	Total *int64 `json:"total,omitempty" xml:"total,omitempty"`
	// 能力信息列表
	AbilityInfoList []*AbilityInfo `json:"ability_info_list,omitempty" xml:"ability_info_list,omitempty" type:"Repeated"`
}

func (s PagequeryAbilityResponse) String() string {
	return tea.Prettify(s)
}

func (s PagequeryAbilityResponse) GoString() string {
	return s.String()
}

func (s *PagequeryAbilityResponse) SetReqMsgId(v string) *PagequeryAbilityResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PagequeryAbilityResponse) SetResultCode(v string) *PagequeryAbilityResponse {
	s.ResultCode = &v
	return s
}

func (s *PagequeryAbilityResponse) SetResultMsg(v string) *PagequeryAbilityResponse {
	s.ResultMsg = &v
	return s
}

func (s *PagequeryAbilityResponse) SetCurrent(v int64) *PagequeryAbilityResponse {
	s.Current = &v
	return s
}

func (s *PagequeryAbilityResponse) SetPageSize(v int64) *PagequeryAbilityResponse {
	s.PageSize = &v
	return s
}

func (s *PagequeryAbilityResponse) SetTotal(v int64) *PagequeryAbilityResponse {
	s.Total = &v
	return s
}

func (s *PagequeryAbilityResponse) SetAbilityInfoList(v []*AbilityInfo) *PagequeryAbilityResponse {
	s.AbilityInfoList = v
	return s
}

type BindAbilityRequest struct {
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

func (s BindAbilityRequest) String() string {
	return tea.Prettify(s)
}

func (s BindAbilityRequest) GoString() string {
	return s.String()
}

func (s *BindAbilityRequest) SetAuthToken(v string) *BindAbilityRequest {
	s.AuthToken = &v
	return s
}

func (s *BindAbilityRequest) SetProductInstanceId(v string) *BindAbilityRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *BindAbilityRequest) SetApiName(v string) *BindAbilityRequest {
	s.ApiName = &v
	return s
}

func (s *BindAbilityRequest) SetAbilityIds(v []*string) *BindAbilityRequest {
	s.AbilityIds = v
	return s
}

func (s *BindAbilityRequest) SetOperatorId(v string) *BindAbilityRequest {
	s.OperatorId = &v
	return s
}

func (s *BindAbilityRequest) SetApiInfoModel(v *ApiInfoModel) *BindAbilityRequest {
	s.ApiInfoModel = v
	return s
}

type BindAbilityResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s BindAbilityResponse) String() string {
	return tea.Prettify(s)
}

func (s BindAbilityResponse) GoString() string {
	return s.String()
}

func (s *BindAbilityResponse) SetReqMsgId(v string) *BindAbilityResponse {
	s.ReqMsgId = &v
	return s
}

func (s *BindAbilityResponse) SetResultCode(v string) *BindAbilityResponse {
	s.ResultCode = &v
	return s
}

func (s *BindAbilityResponse) SetResultMsg(v string) *BindAbilityResponse {
	s.ResultMsg = &v
	return s
}

type QueryAbilityWithapinameRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// api名称列表
	ApiNameList []*string `json:"api_name_list,omitempty" xml:"api_name_list,omitempty" require:"true" type:"Repeated"`
}

func (s QueryAbilityWithapinameRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAbilityWithapinameRequest) GoString() string {
	return s.String()
}

func (s *QueryAbilityWithapinameRequest) SetAuthToken(v string) *QueryAbilityWithapinameRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAbilityWithapinameRequest) SetProductInstanceId(v string) *QueryAbilityWithapinameRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAbilityWithapinameRequest) SetApiNameList(v []*string) *QueryAbilityWithapinameRequest {
	s.ApiNameList = v
	return s
}

type QueryAbilityWithapinameResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// api与能力信息关联列表
	AbilityApiRelationList []*AbilityApiRelation `json:"ability_api_relation_list,omitempty" xml:"ability_api_relation_list,omitempty" type:"Repeated"`
}

func (s QueryAbilityWithapinameResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAbilityWithapinameResponse) GoString() string {
	return s.String()
}

func (s *QueryAbilityWithapinameResponse) SetReqMsgId(v string) *QueryAbilityWithapinameResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAbilityWithapinameResponse) SetResultCode(v string) *QueryAbilityWithapinameResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAbilityWithapinameResponse) SetResultMsg(v string) *QueryAbilityWithapinameResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAbilityWithapinameResponse) SetAbilityApiRelationList(v []*AbilityApiRelation) *QueryAbilityWithapinameResponse {
	s.AbilityApiRelationList = v
	return s
}

type CallbackAbilityRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// api名称集合
	ApiNames []*string `json:"api_names,omitempty" xml:"api_names,omitempty" require:"true" type:"Repeated"`
}

func (s CallbackAbilityRequest) String() string {
	return tea.Prettify(s)
}

func (s CallbackAbilityRequest) GoString() string {
	return s.String()
}

func (s *CallbackAbilityRequest) SetAuthToken(v string) *CallbackAbilityRequest {
	s.AuthToken = &v
	return s
}

func (s *CallbackAbilityRequest) SetProductInstanceId(v string) *CallbackAbilityRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CallbackAbilityRequest) SetApiNames(v []*string) *CallbackAbilityRequest {
	s.ApiNames = v
	return s
}

type CallbackAbilityResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CallbackAbilityResponse) String() string {
	return tea.Prettify(s)
}

func (s CallbackAbilityResponse) GoString() string {
	return s.String()
}

func (s *CallbackAbilityResponse) SetReqMsgId(v string) *CallbackAbilityResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CallbackAbilityResponse) SetResultCode(v string) *CallbackAbilityResponse {
	s.ResultCode = &v
	return s
}

func (s *CallbackAbilityResponse) SetResultMsg(v string) *CallbackAbilityResponse {
	s.ResultMsg = &v
	return s
}

type QueryFoundationProtobufRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 产品码
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty" require:"true"`
	// api code列表信息
	ApiCodeList []*string `json:"api_code_list,omitempty" xml:"api_code_list,omitempty" require:"true" type:"Repeated"`
}

func (s QueryFoundationProtobufRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryFoundationProtobufRequest) GoString() string {
	return s.String()
}

func (s *QueryFoundationProtobufRequest) SetAuthToken(v string) *QueryFoundationProtobufRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryFoundationProtobufRequest) SetProductInstanceId(v string) *QueryFoundationProtobufRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryFoundationProtobufRequest) SetProductCode(v string) *QueryFoundationProtobufRequest {
	s.ProductCode = &v
	return s
}

func (s *QueryFoundationProtobufRequest) SetApiCodeList(v []*string) *QueryFoundationProtobufRequest {
	s.ApiCodeList = v
	return s
}

type QueryFoundationProtobufResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// api probuf信息
	ApiInfoList []*ApiInfo `json:"api_info_list,omitempty" xml:"api_info_list,omitempty" type:"Repeated"`
}

func (s QueryFoundationProtobufResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryFoundationProtobufResponse) GoString() string {
	return s.String()
}

func (s *QueryFoundationProtobufResponse) SetReqMsgId(v string) *QueryFoundationProtobufResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryFoundationProtobufResponse) SetResultCode(v string) *QueryFoundationProtobufResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryFoundationProtobufResponse) SetResultMsg(v string) *QueryFoundationProtobufResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryFoundationProtobufResponse) SetApiInfoList(v []*ApiInfo) *QueryFoundationProtobufResponse {
	s.ApiInfoList = v
	return s
}

type QueryAbilityResultcodeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 1-INTERNAL_ERROR，2-TOO_MANY_REQUESTS，3-UNKNOW_ERROR，4-ACCESS_DENIED，5-OK，6-CUSTOM_RESULT_CODE_ONE，7-CUSTOM_RESULT_CODE_TWO
	Index *int64 `json:"index,omitempty" xml:"index,omitempty" require:"true"`
}

func (s QueryAbilityResultcodeRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAbilityResultcodeRequest) GoString() string {
	return s.String()
}

func (s *QueryAbilityResultcodeRequest) SetAuthToken(v string) *QueryAbilityResultcodeRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAbilityResultcodeRequest) SetProductInstanceId(v string) *QueryAbilityResultcodeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAbilityResultcodeRequest) SetIndex(v int64) *QueryAbilityResultcodeRequest {
	s.Index = &v
	return s
}

type QueryAbilityResultcodeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s QueryAbilityResultcodeResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAbilityResultcodeResponse) GoString() string {
	return s.String()
}

func (s *QueryAbilityResultcodeResponse) SetReqMsgId(v string) *QueryAbilityResultcodeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAbilityResultcodeResponse) SetResultCode(v string) *QueryAbilityResultcodeResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAbilityResultcodeResponse) SetResultMsg(v string) *QueryAbilityResultcodeResponse {
	s.ResultMsg = &v
	return s
}

type BindAbilityApiRequest struct {
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

func (s BindAbilityApiRequest) String() string {
	return tea.Prettify(s)
}

func (s BindAbilityApiRequest) GoString() string {
	return s.String()
}

func (s *BindAbilityApiRequest) SetAuthToken(v string) *BindAbilityApiRequest {
	s.AuthToken = &v
	return s
}

func (s *BindAbilityApiRequest) SetProductInstanceId(v string) *BindAbilityApiRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *BindAbilityApiRequest) SetAbilityId(v string) *BindAbilityApiRequest {
	s.AbilityId = &v
	return s
}

func (s *BindAbilityApiRequest) SetOperatorId(v string) *BindAbilityApiRequest {
	s.OperatorId = &v
	return s
}

func (s *BindAbilityApiRequest) SetApiInfoModels(v []*ApiInfoModel) *BindAbilityApiRequest {
	s.ApiInfoModels = v
	return s
}

type BindAbilityApiResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s BindAbilityApiResponse) String() string {
	return tea.Prettify(s)
}

func (s BindAbilityApiResponse) GoString() string {
	return s.String()
}

func (s *BindAbilityApiResponse) SetReqMsgId(v string) *BindAbilityApiResponse {
	s.ReqMsgId = &v
	return s
}

func (s *BindAbilityApiResponse) SetResultCode(v string) *BindAbilityApiResponse {
	s.ResultCode = &v
	return s
}

func (s *BindAbilityApiResponse) SetResultMsg(v string) *BindAbilityApiResponse {
	s.ResultMsg = &v
	return s
}

type QueryAbilityBusinesscodeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 能力id
	AbilityId *string `json:"ability_id,omitempty" xml:"ability_id,omitempty" require:"true"`
}

func (s QueryAbilityBusinesscodeRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAbilityBusinesscodeRequest) GoString() string {
	return s.String()
}

func (s *QueryAbilityBusinesscodeRequest) SetAuthToken(v string) *QueryAbilityBusinesscodeRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAbilityBusinesscodeRequest) SetProductInstanceId(v string) *QueryAbilityBusinesscodeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAbilityBusinesscodeRequest) SetAbilityId(v string) *QueryAbilityBusinesscodeRequest {
	s.AbilityId = &v
	return s
}

type QueryAbilityBusinesscodeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 能力信息
	AbilityInfo *AbilityInfo `json:"ability_info,omitempty" xml:"ability_info,omitempty"`
}

func (s QueryAbilityBusinesscodeResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAbilityBusinesscodeResponse) GoString() string {
	return s.String()
}

func (s *QueryAbilityBusinesscodeResponse) SetReqMsgId(v string) *QueryAbilityBusinesscodeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAbilityBusinesscodeResponse) SetResultCode(v string) *QueryAbilityBusinesscodeResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAbilityBusinesscodeResponse) SetResultMsg(v string) *QueryAbilityBusinesscodeResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAbilityBusinesscodeResponse) SetAbilityInfo(v *AbilityInfo) *QueryAbilityBusinesscodeResponse {
	s.AbilityInfo = v
	return s
}

type QueryBusinessProductRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 商业产品L5编码
	BusinessCode *string `json:"business_code,omitempty" xml:"business_code,omitempty" require:"true"`
}

func (s QueryBusinessProductRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryBusinessProductRequest) GoString() string {
	return s.String()
}

func (s *QueryBusinessProductRequest) SetAuthToken(v string) *QueryBusinessProductRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryBusinessProductRequest) SetProductInstanceId(v string) *QueryBusinessProductRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryBusinessProductRequest) SetBusinessCode(v string) *QueryBusinessProductRequest {
	s.BusinessCode = &v
	return s
}

type QueryBusinessProductResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 商业产品sdk客户端的maven依赖信息
	SdkMavenDependencyInfo *SdkMavenDependencyInfo `json:"sdk_maven_dependency_info,omitempty" xml:"sdk_maven_dependency_info,omitempty"`
	// 商业产品最新api信息列表，可能与当前版本jar包内api不一致，若发现不一致请在opm商业sdk管理中重新进行打包
	ApiInfoModels []*ApiInfoModel `json:"api_info_models,omitempty" xml:"api_info_models,omitempty" type:"Repeated"`
	// 已发布中央仓库的版本
	PublishVersion *string `json:"publish_version,omitempty" xml:"publish_version,omitempty"`
	// 是否存在运行中的任务，商业产品一次发布中央仓库打包任务，会执行三个子打包任务，上传线下仓库，上传蚂蚁链sdk包至中央仓库，上传金融云sdk包至中央仓库
	TaskRunning *bool `json:"task_running,omitempty" xml:"task_running,omitempty"`
	// 最新一次打包任务运行状态RUNNING/SUCCESS/FAILED
	TaskStatus *string `json:"task_status,omitempty" xml:"task_status,omitempty"`
	// 能力sla看板url
	SlaUrl *string `json:"sla_url,omitempty" xml:"sla_url,omitempty"`
}

func (s QueryBusinessProductResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryBusinessProductResponse) GoString() string {
	return s.String()
}

func (s *QueryBusinessProductResponse) SetReqMsgId(v string) *QueryBusinessProductResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryBusinessProductResponse) SetResultCode(v string) *QueryBusinessProductResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryBusinessProductResponse) SetResultMsg(v string) *QueryBusinessProductResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryBusinessProductResponse) SetSdkMavenDependencyInfo(v *SdkMavenDependencyInfo) *QueryBusinessProductResponse {
	s.SdkMavenDependencyInfo = v
	return s
}

func (s *QueryBusinessProductResponse) SetApiInfoModels(v []*ApiInfoModel) *QueryBusinessProductResponse {
	s.ApiInfoModels = v
	return s
}

func (s *QueryBusinessProductResponse) SetPublishVersion(v string) *QueryBusinessProductResponse {
	s.PublishVersion = &v
	return s
}

func (s *QueryBusinessProductResponse) SetTaskRunning(v bool) *QueryBusinessProductResponse {
	s.TaskRunning = &v
	return s
}

func (s *QueryBusinessProductResponse) SetTaskStatus(v string) *QueryBusinessProductResponse {
	s.TaskStatus = &v
	return s
}

func (s *QueryBusinessProductResponse) SetSlaUrl(v string) *QueryBusinessProductResponse {
	s.SlaUrl = &v
	return s
}

type QueryMeteringRuleRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 技术产品码
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty" require:"true"`
	// 商业产品码
	BusinessCode *string `json:"business_code,omitempty" xml:"business_code,omitempty" require:"true"`
}

func (s QueryMeteringRuleRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryMeteringRuleRequest) GoString() string {
	return s.String()
}

func (s *QueryMeteringRuleRequest) SetAuthToken(v string) *QueryMeteringRuleRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryMeteringRuleRequest) SetProductInstanceId(v string) *QueryMeteringRuleRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryMeteringRuleRequest) SetProductCode(v string) *QueryMeteringRuleRequest {
	s.ProductCode = &v
	return s
}

func (s *QueryMeteringRuleRequest) SetBusinessCode(v string) *QueryMeteringRuleRequest {
	s.BusinessCode = &v
	return s
}

type QueryMeteringRuleResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 技术产品码
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty"`
	// 商业产品码
	BusinessCode *string `json:"business_code,omitempty" xml:"business_code,omitempty"`
	// 计量规则
	MeteringRules []*MethodMatchingRule `json:"metering_rules,omitempty" xml:"metering_rules,omitempty" type:"Repeated"`
}

func (s QueryMeteringRuleResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryMeteringRuleResponse) GoString() string {
	return s.String()
}

func (s *QueryMeteringRuleResponse) SetReqMsgId(v string) *QueryMeteringRuleResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryMeteringRuleResponse) SetResultCode(v string) *QueryMeteringRuleResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryMeteringRuleResponse) SetResultMsg(v string) *QueryMeteringRuleResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryMeteringRuleResponse) SetProductCode(v string) *QueryMeteringRuleResponse {
	s.ProductCode = &v
	return s
}

func (s *QueryMeteringRuleResponse) SetBusinessCode(v string) *QueryMeteringRuleResponse {
	s.BusinessCode = &v
	return s
}

func (s *QueryMeteringRuleResponse) SetMeteringRules(v []*MethodMatchingRule) *QueryMeteringRuleResponse {
	s.MeteringRules = v
	return s
}

type CreateMeteringRuleRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 技术产品码
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty" require:"true"`
	// 商业产品码
	BusinessCode *string `json:"business_code,omitempty" xml:"business_code,omitempty" require:"true"`
	// 方法匹配规则
	MethodMatchingRules []*MethodMatchingRule `json:"method_matching_rules,omitempty" xml:"method_matching_rules,omitempty" require:"true" type:"Repeated"`
}

func (s CreateMeteringRuleRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateMeteringRuleRequest) GoString() string {
	return s.String()
}

func (s *CreateMeteringRuleRequest) SetAuthToken(v string) *CreateMeteringRuleRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateMeteringRuleRequest) SetProductInstanceId(v string) *CreateMeteringRuleRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateMeteringRuleRequest) SetProductCode(v string) *CreateMeteringRuleRequest {
	s.ProductCode = &v
	return s
}

func (s *CreateMeteringRuleRequest) SetBusinessCode(v string) *CreateMeteringRuleRequest {
	s.BusinessCode = &v
	return s
}

func (s *CreateMeteringRuleRequest) SetMethodMatchingRules(v []*MethodMatchingRule) *CreateMeteringRuleRequest {
	s.MethodMatchingRules = v
	return s
}

type CreateMeteringRuleResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CreateMeteringRuleResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateMeteringRuleResponse) GoString() string {
	return s.String()
}

func (s *CreateMeteringRuleResponse) SetReqMsgId(v string) *CreateMeteringRuleResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateMeteringRuleResponse) SetResultCode(v string) *CreateMeteringRuleResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateMeteringRuleResponse) SetResultMsg(v string) *CreateMeteringRuleResponse {
	s.ResultMsg = &v
	return s
}

type UpdateMeteringRuleRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 技术产品码
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty" require:"true"`
	// 商业产品码
	BusinessCode *string `json:"business_code,omitempty" xml:"business_code,omitempty" require:"true"`
	// 方法匹配规则
	MethodMatchingRules []*MethodMatchingRule `json:"method_matching_rules,omitempty" xml:"method_matching_rules,omitempty" require:"true" type:"Repeated"`
}

func (s UpdateMeteringRuleRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateMeteringRuleRequest) GoString() string {
	return s.String()
}

func (s *UpdateMeteringRuleRequest) SetAuthToken(v string) *UpdateMeteringRuleRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateMeteringRuleRequest) SetProductInstanceId(v string) *UpdateMeteringRuleRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateMeteringRuleRequest) SetProductCode(v string) *UpdateMeteringRuleRequest {
	s.ProductCode = &v
	return s
}

func (s *UpdateMeteringRuleRequest) SetBusinessCode(v string) *UpdateMeteringRuleRequest {
	s.BusinessCode = &v
	return s
}

func (s *UpdateMeteringRuleRequest) SetMethodMatchingRules(v []*MethodMatchingRule) *UpdateMeteringRuleRequest {
	s.MethodMatchingRules = v
	return s
}

type UpdateMeteringRuleResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s UpdateMeteringRuleResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateMeteringRuleResponse) GoString() string {
	return s.String()
}

func (s *UpdateMeteringRuleResponse) SetReqMsgId(v string) *UpdateMeteringRuleResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateMeteringRuleResponse) SetResultCode(v string) *UpdateMeteringRuleResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateMeteringRuleResponse) SetResultMsg(v string) *UpdateMeteringRuleResponse {
	s.ResultMsg = &v
	return s
}

type QueryMeteringItemRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 商业产品码
	BusinessCode *string `json:"business_code,omitempty" xml:"business_code,omitempty" require:"true"`
	// 计量域
	MeteringDomainCode *string `json:"metering_domain_code,omitempty" xml:"metering_domain_code,omitempty" require:"true"`
}

func (s QueryMeteringItemRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryMeteringItemRequest) GoString() string {
	return s.String()
}

func (s *QueryMeteringItemRequest) SetAuthToken(v string) *QueryMeteringItemRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryMeteringItemRequest) SetProductInstanceId(v string) *QueryMeteringItemRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryMeteringItemRequest) SetBusinessCode(v string) *QueryMeteringItemRequest {
	s.BusinessCode = &v
	return s
}

func (s *QueryMeteringItemRequest) SetMeteringDomainCode(v string) *QueryMeteringItemRequest {
	s.MeteringDomainCode = &v
	return s
}

type QueryMeteringItemResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 商业产品码
	BusinessCode *string `json:"business_code,omitempty" xml:"business_code,omitempty"`
	// 计量域
	MeteringDomainCode *string `json:"metering_domain_code,omitempty" xml:"metering_domain_code,omitempty"`
	// 计量项
	ItemRules []*ItemRule `json:"item_rules,omitempty" xml:"item_rules,omitempty" type:"Repeated"`
}

func (s QueryMeteringItemResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryMeteringItemResponse) GoString() string {
	return s.String()
}

func (s *QueryMeteringItemResponse) SetReqMsgId(v string) *QueryMeteringItemResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryMeteringItemResponse) SetResultCode(v string) *QueryMeteringItemResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryMeteringItemResponse) SetResultMsg(v string) *QueryMeteringItemResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryMeteringItemResponse) SetBusinessCode(v string) *QueryMeteringItemResponse {
	s.BusinessCode = &v
	return s
}

func (s *QueryMeteringItemResponse) SetMeteringDomainCode(v string) *QueryMeteringItemResponse {
	s.MeteringDomainCode = &v
	return s
}

func (s *QueryMeteringItemResponse) SetItemRules(v []*ItemRule) *QueryMeteringItemResponse {
	s.ItemRules = v
	return s
}

type CreateMeteringItemRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 商业产品码
	BusinessCode *string `json:"business_code,omitempty" xml:"business_code,omitempty" require:"true"`
	// 计量域
	MeteringDomainCode *string `json:"metering_domain_code,omitempty" xml:"metering_domain_code,omitempty" require:"true"`
	// 计量规则
	ItemRules []*ItemRule `json:"item_rules,omitempty" xml:"item_rules,omitempty" require:"true" type:"Repeated"`
}

func (s CreateMeteringItemRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateMeteringItemRequest) GoString() string {
	return s.String()
}

func (s *CreateMeteringItemRequest) SetAuthToken(v string) *CreateMeteringItemRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateMeteringItemRequest) SetProductInstanceId(v string) *CreateMeteringItemRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateMeteringItemRequest) SetBusinessCode(v string) *CreateMeteringItemRequest {
	s.BusinessCode = &v
	return s
}

func (s *CreateMeteringItemRequest) SetMeteringDomainCode(v string) *CreateMeteringItemRequest {
	s.MeteringDomainCode = &v
	return s
}

func (s *CreateMeteringItemRequest) SetItemRules(v []*ItemRule) *CreateMeteringItemRequest {
	s.ItemRules = v
	return s
}

type CreateMeteringItemResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CreateMeteringItemResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateMeteringItemResponse) GoString() string {
	return s.String()
}

func (s *CreateMeteringItemResponse) SetReqMsgId(v string) *CreateMeteringItemResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateMeteringItemResponse) SetResultCode(v string) *CreateMeteringItemResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateMeteringItemResponse) SetResultMsg(v string) *CreateMeteringItemResponse {
	s.ResultMsg = &v
	return s
}

type UpdateMeteringItemRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 商业产品码
	BusinessCode *string `json:"business_code,omitempty" xml:"business_code,omitempty" require:"true"`
	// 计量域
	MeteringDomainCode *string `json:"metering_domain_code,omitempty" xml:"metering_domain_code,omitempty" require:"true"`
	// 计量项列表
	ItemRules []*ItemRule `json:"item_rules,omitempty" xml:"item_rules,omitempty" require:"true" type:"Repeated"`
}

func (s UpdateMeteringItemRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateMeteringItemRequest) GoString() string {
	return s.String()
}

func (s *UpdateMeteringItemRequest) SetAuthToken(v string) *UpdateMeteringItemRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateMeteringItemRequest) SetProductInstanceId(v string) *UpdateMeteringItemRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateMeteringItemRequest) SetBusinessCode(v string) *UpdateMeteringItemRequest {
	s.BusinessCode = &v
	return s
}

func (s *UpdateMeteringItemRequest) SetMeteringDomainCode(v string) *UpdateMeteringItemRequest {
	s.MeteringDomainCode = &v
	return s
}

func (s *UpdateMeteringItemRequest) SetItemRules(v []*ItemRule) *UpdateMeteringItemRequest {
	s.ItemRules = v
	return s
}

type UpdateMeteringItemResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s UpdateMeteringItemResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateMeteringItemResponse) GoString() string {
	return s.String()
}

func (s *UpdateMeteringItemResponse) SetReqMsgId(v string) *UpdateMeteringItemResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateMeteringItemResponse) SetResultCode(v string) *UpdateMeteringItemResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateMeteringItemResponse) SetResultMsg(v string) *UpdateMeteringItemResponse {
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
				"sdk_version":      tea.String("1.1.29"),
				"_prod_code":       tea.String("SAAS"),
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
 * Description: SaaS服务调用
 * Summary: SaaS服务调用
 */
func (client *Client) RunMarketService(request *RunMarketServiceRequest) (_result *RunMarketServiceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &RunMarketServiceResponse{}
	_body, _err := client.RunMarketServiceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: SaaS服务调用
 * Summary: SaaS服务调用
 */
func (client *Client) RunMarketServiceEx(request *RunMarketServiceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *RunMarketServiceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &RunMarketServiceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.saas.market.service.run"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询解决方案，包括能力列表
 * Summary: 查询解决方案，包括能力列表
 */
func (client *Client) QueryMarketSolution(request *QueryMarketSolutionRequest) (_result *QueryMarketSolutionResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryMarketSolutionResponse{}
	_body, _err := client.QueryMarketSolutionEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询解决方案，包括能力列表
 * Summary: 查询解决方案，包括能力列表
 */
func (client *Client) QueryMarketSolutionEx(request *QueryMarketSolutionRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryMarketSolutionResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryMarketSolutionResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.saas.market.solution.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询本产品下所有的能力标签
 * Summary: 查询本产品下所有的能力标签
 */
func (client *Client) QueryAbilityWithproduct(request *QueryAbilityWithproductRequest) (_result *QueryAbilityWithproductResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAbilityWithproductResponse{}
	_body, _err := client.QueryAbilityWithproductEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询本产品下所有的能力标签
 * Summary: 查询本产品下所有的能力标签
 */
func (client *Client) QueryAbilityWithproductEx(request *QueryAbilityWithproductRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAbilityWithproductResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAbilityWithproductResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.saas.ability.withproduct.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 分页查询能力数据
 * Summary: 分页查询能力数据
 */
func (client *Client) PagequeryAbility(request *PagequeryAbilityRequest) (_result *PagequeryAbilityResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PagequeryAbilityResponse{}
	_body, _err := client.PagequeryAbilityEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 分页查询能力数据
 * Summary: 分页查询能力数据
 */
func (client *Client) PagequeryAbilityEx(request *PagequeryAbilityRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PagequeryAbilityResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PagequeryAbilityResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.saas.ability.pagequery"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) BindAbility(request *BindAbilityRequest) (_result *BindAbilityResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &BindAbilityResponse{}
	_body, _err := client.BindAbilityEx(request, headers, runtime)
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
func (client *Client) BindAbilityEx(request *BindAbilityRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *BindAbilityResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &BindAbilityResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.saas.ability.bind"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 根据api名称列表查询能力标签列表
 * Summary: 根据api名称列表查询能力标签列表
 */
func (client *Client) QueryAbilityWithapiname(request *QueryAbilityWithapinameRequest) (_result *QueryAbilityWithapinameResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAbilityWithapinameResponse{}
	_body, _err := client.QueryAbilityWithapinameEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 根据api名称列表查询能力标签列表
 * Summary: 根据api名称列表查询能力标签列表
 */
func (client *Client) QueryAbilityWithapinameEx(request *QueryAbilityWithapinameRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAbilityWithapinameResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAbilityWithapinameResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.saas.ability.withapiname.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) CallbackAbility(request *CallbackAbilityRequest) (_result *CallbackAbilityResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CallbackAbilityResponse{}
	_body, _err := client.CallbackAbilityEx(request, headers, runtime)
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
func (client *Client) CallbackAbilityEx(request *CallbackAbilityRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CallbackAbilityResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CallbackAbilityResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.saas.ability.callback"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 根据产品码+api code查询api protobuf信息
 * Summary: 查询api protobuf信息（勿删）
 */
func (client *Client) QueryFoundationProtobuf(request *QueryFoundationProtobufRequest) (_result *QueryFoundationProtobufResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryFoundationProtobufResponse{}
	_body, _err := client.QueryFoundationProtobufEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 根据产品码+api code查询api protobuf信息
 * Summary: 查询api protobuf信息（勿删）
 */
func (client *Client) QueryFoundationProtobufEx(request *QueryFoundationProtobufRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryFoundationProtobufResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryFoundationProtobufResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.saas.foundation.protobuf.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 测试网关结果码和计量接口
 * Summary: 网关结果码测试接口
 */
func (client *Client) QueryAbilityResultcode(request *QueryAbilityResultcodeRequest) (_result *QueryAbilityResultcodeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAbilityResultcodeResponse{}
	_body, _err := client.QueryAbilityResultcodeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 测试网关结果码和计量接口
 * Summary: 网关结果码测试接口
 */
func (client *Client) QueryAbilityResultcodeEx(request *QueryAbilityResultcodeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAbilityResultcodeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAbilityResultcodeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.saas.ability.resultcode.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) BindAbilityApi(request *BindAbilityApiRequest) (_result *BindAbilityApiResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &BindAbilityApiResponse{}
	_body, _err := client.BindAbilityApiEx(request, headers, runtime)
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
func (client *Client) BindAbilityApiEx(request *BindAbilityApiRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *BindAbilityApiResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &BindAbilityApiResponse{}
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
func (client *Client) QueryAbilityBusinesscode(request *QueryAbilityBusinesscodeRequest) (_result *QueryAbilityBusinesscodeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAbilityBusinesscodeResponse{}
	_body, _err := client.QueryAbilityBusinesscodeEx(request, headers, runtime)
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
func (client *Client) QueryAbilityBusinesscodeEx(request *QueryAbilityBusinesscodeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAbilityBusinesscodeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAbilityBusinesscodeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.saas.ability.businesscode.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 根据商业编码查询sdk依赖和api信息
 * Summary: 根据商业编码查询sdk依赖和api信息
 */
func (client *Client) QueryBusinessProduct(request *QueryBusinessProductRequest) (_result *QueryBusinessProductResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryBusinessProductResponse{}
	_body, _err := client.QueryBusinessProductEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 根据商业编码查询sdk依赖和api信息
 * Summary: 根据商业编码查询sdk依赖和api信息
 */
func (client *Client) QueryBusinessProductEx(request *QueryBusinessProductRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryBusinessProductResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryBusinessProductResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.saas.business.product.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询计量规则信息
 * Summary: 查询计量规则信息
 */
func (client *Client) QueryMeteringRule(request *QueryMeteringRuleRequest) (_result *QueryMeteringRuleResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryMeteringRuleResponse{}
	_body, _err := client.QueryMeteringRuleEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询计量规则信息
 * Summary: 查询计量规则信息
 */
func (client *Client) QueryMeteringRuleEx(request *QueryMeteringRuleRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryMeteringRuleResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryMeteringRuleResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.saas.metering.rule.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建计量规则
 * Summary: 创建计量规则
 */
func (client *Client) CreateMeteringRule(request *CreateMeteringRuleRequest) (_result *CreateMeteringRuleResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateMeteringRuleResponse{}
	_body, _err := client.CreateMeteringRuleEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建计量规则
 * Summary: 创建计量规则
 */
func (client *Client) CreateMeteringRuleEx(request *CreateMeteringRuleRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateMeteringRuleResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateMeteringRuleResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.saas.metering.rule.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 更新计量规则信息
 * Summary: 更新计量规则信息
 */
func (client *Client) UpdateMeteringRule(request *UpdateMeteringRuleRequest) (_result *UpdateMeteringRuleResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateMeteringRuleResponse{}
	_body, _err := client.UpdateMeteringRuleEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 更新计量规则信息
 * Summary: 更新计量规则信息
 */
func (client *Client) UpdateMeteringRuleEx(request *UpdateMeteringRuleRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateMeteringRuleResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateMeteringRuleResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.saas.metering.rule.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询计量项信息
 * Summary: 查询计量项信息
 */
func (client *Client) QueryMeteringItem(request *QueryMeteringItemRequest) (_result *QueryMeteringItemResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryMeteringItemResponse{}
	_body, _err := client.QueryMeteringItemEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询计量项信息
 * Summary: 查询计量项信息
 */
func (client *Client) QueryMeteringItemEx(request *QueryMeteringItemRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryMeteringItemResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryMeteringItemResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.saas.metering.item.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 新增计量项
 * Summary: 新增计量项
 */
func (client *Client) CreateMeteringItem(request *CreateMeteringItemRequest) (_result *CreateMeteringItemResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateMeteringItemResponse{}
	_body, _err := client.CreateMeteringItemEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 新增计量项
 * Summary: 新增计量项
 */
func (client *Client) CreateMeteringItemEx(request *CreateMeteringItemRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateMeteringItemResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateMeteringItemResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.saas.metering.item.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 更新计量规则
 * Summary: 更新计量规则
 */
func (client *Client) UpdateMeteringItem(request *UpdateMeteringItemRequest) (_result *UpdateMeteringItemResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateMeteringItemResponse{}
	_body, _err := client.UpdateMeteringItemEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 更新计量规则
 * Summary: 更新计量规则
 */
func (client *Client) UpdateMeteringItemEx(request *UpdateMeteringItemRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateMeteringItemResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateMeteringItemResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.saas.metering.item.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
