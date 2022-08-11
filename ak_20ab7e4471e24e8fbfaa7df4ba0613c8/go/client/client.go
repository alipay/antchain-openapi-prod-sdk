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

// Did Doc中的服务字段描述
type DidDocServicesInfo struct {
	// 服务的扩展字段
	Extension *string `json:"extension,omitempty" xml:"extension,omitempty"`
	// 服务ID，必须保证该服务ID在did doc中是唯一的。对于保留类型服务：
	// DidAuthService， 有且只能有一个，并且id必须为didauth-1；
	// VerifiableClaimRepository， 有且只有一个，并且id必须为vcrepository-1;
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 服务的可访问地址
	ServiceEndpoint *string `json:"service_endpoint,omitempty" xml:"service_endpoint,omitempty" require:"true"`
	// 服务类型，必须是已经注册的服务类型，或者是默认保留的服务类型
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
}

func (s DidDocServicesInfo) String() string {
	return tea.Prettify(s)
}

func (s DidDocServicesInfo) GoString() string {
	return s.String()
}

func (s *DidDocServicesInfo) SetExtension(v string) *DidDocServicesInfo {
	s.Extension = &v
	return s
}

func (s *DidDocServicesInfo) SetId(v string) *DidDocServicesInfo {
	s.Id = &v
	return s
}

func (s *DidDocServicesInfo) SetServiceEndpoint(v string) *DidDocServicesInfo {
	s.ServiceEndpoint = &v
	return s
}

func (s *DidDocServicesInfo) SetType(v string) *DidDocServicesInfo {
	s.Type = &v
	return s
}

// identity parameter
type IdentityParam struct {
	// 经办人姓名
	Agent *string `json:"agent,omitempty" xml:"agent,omitempty"`
	// 经办人身份证号
	AgentId *string `json:"agent_id,omitempty" xml:"agent_id,omitempty"`
	// 用户的姓名
	CertName *string `json:"cert_name,omitempty" xml:"cert_name,omitempty" require:"true"`
	// 用户的身份证号
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty" require:"true"`
	// 用户证件类型，目前只支持IDENTITY_CARD
	CertType *string `json:"cert_type,omitempty" xml:"cert_type,omitempty" require:"true"`
	// 法人姓名，企业认证必选
	LegalPerson *string `json:"legal_person,omitempty" xml:"legal_person,omitempty"`
	// 法人身份证，企业认证必选
	LegalPersonId *string `json:"legal_person_id,omitempty" xml:"legal_person_id,omitempty"`
	// 手机号码
	MobileNo *string `json:"mobile_no,omitempty" xml:"mobile_no,omitempty"`
	// 扩展属性字段
	Properties *string `json:"properties,omitempty" xml:"properties,omitempty"`
	// 用户类型，默认为PERSON
	UserType *string `json:"user_type,omitempty" xml:"user_type,omitempty"`
}

func (s IdentityParam) String() string {
	return tea.Prettify(s)
}

func (s IdentityParam) GoString() string {
	return s.String()
}

func (s *IdentityParam) SetAgent(v string) *IdentityParam {
	s.Agent = &v
	return s
}

func (s *IdentityParam) SetAgentId(v string) *IdentityParam {
	s.AgentId = &v
	return s
}

func (s *IdentityParam) SetCertName(v string) *IdentityParam {
	s.CertName = &v
	return s
}

func (s *IdentityParam) SetCertNo(v string) *IdentityParam {
	s.CertNo = &v
	return s
}

func (s *IdentityParam) SetCertType(v string) *IdentityParam {
	s.CertType = &v
	return s
}

func (s *IdentityParam) SetLegalPerson(v string) *IdentityParam {
	s.LegalPerson = &v
	return s
}

func (s *IdentityParam) SetLegalPersonId(v string) *IdentityParam {
	s.LegalPersonId = &v
	return s
}

func (s *IdentityParam) SetMobileNo(v string) *IdentityParam {
	s.MobileNo = &v
	return s
}

func (s *IdentityParam) SetProperties(v string) *IdentityParam {
	s.Properties = &v
	return s
}

func (s *IdentityParam) SetUserType(v string) *IdentityParam {
	s.UserType = &v
	return s
}

// 证书详情
type BareClaim struct {
	// 下面的内容由调用者自己定义，建议只存放必要的声明信息，不要放置敏感数据
	Claim *string `json:"claim,omitempty" xml:"claim,omitempty" require:"true"`
	// 证书类型
	Type *string `json:"type,omitempty" xml:"type,omitempty"`
}

func (s BareClaim) String() string {
	return tea.Prettify(s)
}

func (s BareClaim) GoString() string {
	return s.String()
}

func (s *BareClaim) SetClaim(v string) *BareClaim {
	s.Claim = &v
	return s
}

func (s *BareClaim) SetType(v string) *BareClaim {
	s.Type = &v
	return s
}

type StartBaasDidCorporateAgentcreateRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 场景码，找dis工作人员进行分配
	BizCode *string `json:"biz_code,omitempty" xml:"biz_code,omitempty"`
	// 扩展字段
	ExtensionInfo *string `json:"extension_info,omitempty" xml:"extension_info,omitempty"`
	// 所有需要关联的外键，外键必须已did auth key controller的did作为前缀+“sidekey:”+外键
	Indexs []*string `json:"indexs,omitempty" xml:"indexs,omitempty" type:"Repeated"`
	// 企业名称
	OwnerName *string `json:"owner_name,omitempty" xml:"owner_name,omitempty"`
	// 自定义企业唯一id，企业在自有模式下的唯一号bid的hash值，调用者需要保证其唯一性
	OwnerUid *string `json:"owner_uid,omitempty" xml:"owner_uid,omitempty" require:"true" maxLength:"128"`
	// 携带自己定义的服务类型
	Services []*DidDocServicesInfo `json:"services,omitempty" xml:"services,omitempty" type:"Repeated"`
	// 生成的did字符串
	Did *string `json:"did,omitempty" xml:"did,omitempty"`
}

func (s StartBaasDidCorporateAgentcreateRequest) String() string {
	return tea.Prettify(s)
}

func (s StartBaasDidCorporateAgentcreateRequest) GoString() string {
	return s.String()
}

func (s *StartBaasDidCorporateAgentcreateRequest) SetAuthToken(v string) *StartBaasDidCorporateAgentcreateRequest {
	s.AuthToken = &v
	return s
}

func (s *StartBaasDidCorporateAgentcreateRequest) SetProductInstanceId(v string) *StartBaasDidCorporateAgentcreateRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *StartBaasDidCorporateAgentcreateRequest) SetBizCode(v string) *StartBaasDidCorporateAgentcreateRequest {
	s.BizCode = &v
	return s
}

func (s *StartBaasDidCorporateAgentcreateRequest) SetExtensionInfo(v string) *StartBaasDidCorporateAgentcreateRequest {
	s.ExtensionInfo = &v
	return s
}

func (s *StartBaasDidCorporateAgentcreateRequest) SetIndexs(v []*string) *StartBaasDidCorporateAgentcreateRequest {
	s.Indexs = v
	return s
}

func (s *StartBaasDidCorporateAgentcreateRequest) SetOwnerName(v string) *StartBaasDidCorporateAgentcreateRequest {
	s.OwnerName = &v
	return s
}

func (s *StartBaasDidCorporateAgentcreateRequest) SetOwnerUid(v string) *StartBaasDidCorporateAgentcreateRequest {
	s.OwnerUid = &v
	return s
}

func (s *StartBaasDidCorporateAgentcreateRequest) SetServices(v []*DidDocServicesInfo) *StartBaasDidCorporateAgentcreateRequest {
	s.Services = v
	return s
}

func (s *StartBaasDidCorporateAgentcreateRequest) SetDid(v string) *StartBaasDidCorporateAgentcreateRequest {
	s.Did = &v
	return s
}

type StartBaasDidCorporateAgentcreateResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 生成的did字符串
	Did *string `json:"did,omitempty" xml:"did,omitempty"`
}

func (s StartBaasDidCorporateAgentcreateResponse) String() string {
	return tea.Prettify(s)
}

func (s StartBaasDidCorporateAgentcreateResponse) GoString() string {
	return s.String()
}

func (s *StartBaasDidCorporateAgentcreateResponse) SetReqMsgId(v string) *StartBaasDidCorporateAgentcreateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *StartBaasDidCorporateAgentcreateResponse) SetResultCode(v string) *StartBaasDidCorporateAgentcreateResponse {
	s.ResultCode = &v
	return s
}

func (s *StartBaasDidCorporateAgentcreateResponse) SetResultMsg(v string) *StartBaasDidCorporateAgentcreateResponse {
	s.ResultMsg = &v
	return s
}

func (s *StartBaasDidCorporateAgentcreateResponse) SetDid(v string) *StartBaasDidCorporateAgentcreateResponse {
	s.Did = &v
	return s
}

type StartBaasDidPersonAgentcreateRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 企业自定信息
	ExtensionInfo *string `json:"extension_info,omitempty" xml:"extension_info,omitempty"`
	// 所有需要关联的外键，外键必须已did auth key controller的did作为前缀+“sidekey:”+外键
	Indexs []*string `json:"indexs,omitempty" xml:"indexs,omitempty" type:"Repeated"`
	// 名称
	OwnerName *string `json:"owner_name,omitempty" xml:"owner_name,omitempty"`
	// 唯一号，比如可以是hash(证件类型+企业营业执照号) 计算出来的唯一值等
	OwnerUid *string `json:"owner_uid,omitempty" xml:"owner_uid,omitempty" require:"true"`
	// 携带自己定义的服务类型
	Services []*DidDocServicesInfo `json:"services,omitempty" xml:"services,omitempty" type:"Repeated"`
	// 场景码，找dis工作人员进行分配
	BizCode *string `json:"biz_code,omitempty" xml:"biz_code,omitempty"`
	// 生成的did字符串
	Did *string `json:"did,omitempty" xml:"did,omitempty"`
}

func (s StartBaasDidPersonAgentcreateRequest) String() string {
	return tea.Prettify(s)
}

func (s StartBaasDidPersonAgentcreateRequest) GoString() string {
	return s.String()
}

func (s *StartBaasDidPersonAgentcreateRequest) SetAuthToken(v string) *StartBaasDidPersonAgentcreateRequest {
	s.AuthToken = &v
	return s
}

func (s *StartBaasDidPersonAgentcreateRequest) SetProductInstanceId(v string) *StartBaasDidPersonAgentcreateRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *StartBaasDidPersonAgentcreateRequest) SetExtensionInfo(v string) *StartBaasDidPersonAgentcreateRequest {
	s.ExtensionInfo = &v
	return s
}

func (s *StartBaasDidPersonAgentcreateRequest) SetIndexs(v []*string) *StartBaasDidPersonAgentcreateRequest {
	s.Indexs = v
	return s
}

func (s *StartBaasDidPersonAgentcreateRequest) SetOwnerName(v string) *StartBaasDidPersonAgentcreateRequest {
	s.OwnerName = &v
	return s
}

func (s *StartBaasDidPersonAgentcreateRequest) SetOwnerUid(v string) *StartBaasDidPersonAgentcreateRequest {
	s.OwnerUid = &v
	return s
}

func (s *StartBaasDidPersonAgentcreateRequest) SetServices(v []*DidDocServicesInfo) *StartBaasDidPersonAgentcreateRequest {
	s.Services = v
	return s
}

func (s *StartBaasDidPersonAgentcreateRequest) SetBizCode(v string) *StartBaasDidPersonAgentcreateRequest {
	s.BizCode = &v
	return s
}

func (s *StartBaasDidPersonAgentcreateRequest) SetDid(v string) *StartBaasDidPersonAgentcreateRequest {
	s.Did = &v
	return s
}

type StartBaasDidPersonAgentcreateResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 生成的did字符串
	Did *string `json:"did,omitempty" xml:"did,omitempty"`
}

func (s StartBaasDidPersonAgentcreateResponse) String() string {
	return tea.Prettify(s)
}

func (s StartBaasDidPersonAgentcreateResponse) GoString() string {
	return s.String()
}

func (s *StartBaasDidPersonAgentcreateResponse) SetReqMsgId(v string) *StartBaasDidPersonAgentcreateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *StartBaasDidPersonAgentcreateResponse) SetResultCode(v string) *StartBaasDidPersonAgentcreateResponse {
	s.ResultCode = &v
	return s
}

func (s *StartBaasDidPersonAgentcreateResponse) SetResultMsg(v string) *StartBaasDidPersonAgentcreateResponse {
	s.ResultMsg = &v
	return s
}

func (s *StartBaasDidPersonAgentcreateResponse) SetDid(v string) *StartBaasDidPersonAgentcreateResponse {
	s.Did = &v
	return s
}

type StartBaasDidCorporateSelfcreateRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 扩展信息
	Extension *string `json:"extension,omitempty" xml:"extension,omitempty"`
	// 公司名称
	OwnerName *string `json:"owner_name,omitempty" xml:"owner_name,omitempty"`
	// 携带自己定义的服务类型
	Services []*DidDocServicesInfo `json:"services,omitempty" xml:"services,omitempty" type:"Repeated"`
	// 场景码，找dis工作人员进行分配
	BizCode *string `json:"biz_code,omitempty" xml:"biz_code,omitempty"`
	// 生成的did字符串
	Did *string `json:"did,omitempty" xml:"did,omitempty"`
}

func (s StartBaasDidCorporateSelfcreateRequest) String() string {
	return tea.Prettify(s)
}

func (s StartBaasDidCorporateSelfcreateRequest) GoString() string {
	return s.String()
}

func (s *StartBaasDidCorporateSelfcreateRequest) SetAuthToken(v string) *StartBaasDidCorporateSelfcreateRequest {
	s.AuthToken = &v
	return s
}

func (s *StartBaasDidCorporateSelfcreateRequest) SetProductInstanceId(v string) *StartBaasDidCorporateSelfcreateRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *StartBaasDidCorporateSelfcreateRequest) SetExtension(v string) *StartBaasDidCorporateSelfcreateRequest {
	s.Extension = &v
	return s
}

func (s *StartBaasDidCorporateSelfcreateRequest) SetOwnerName(v string) *StartBaasDidCorporateSelfcreateRequest {
	s.OwnerName = &v
	return s
}

func (s *StartBaasDidCorporateSelfcreateRequest) SetServices(v []*DidDocServicesInfo) *StartBaasDidCorporateSelfcreateRequest {
	s.Services = v
	return s
}

func (s *StartBaasDidCorporateSelfcreateRequest) SetBizCode(v string) *StartBaasDidCorporateSelfcreateRequest {
	s.BizCode = &v
	return s
}

func (s *StartBaasDidCorporateSelfcreateRequest) SetDid(v string) *StartBaasDidCorporateSelfcreateRequest {
	s.Did = &v
	return s
}

type StartBaasDidCorporateSelfcreateResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 生成的did字符串
	Did *string `json:"did,omitempty" xml:"did,omitempty"`
}

func (s StartBaasDidCorporateSelfcreateResponse) String() string {
	return tea.Prettify(s)
}

func (s StartBaasDidCorporateSelfcreateResponse) GoString() string {
	return s.String()
}

func (s *StartBaasDidCorporateSelfcreateResponse) SetReqMsgId(v string) *StartBaasDidCorporateSelfcreateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *StartBaasDidCorporateSelfcreateResponse) SetResultCode(v string) *StartBaasDidCorporateSelfcreateResponse {
	s.ResultCode = &v
	return s
}

func (s *StartBaasDidCorporateSelfcreateResponse) SetResultMsg(v string) *StartBaasDidCorporateSelfcreateResponse {
	s.ResultMsg = &v
	return s
}

func (s *StartBaasDidCorporateSelfcreateResponse) SetDid(v string) *StartBaasDidCorporateSelfcreateResponse {
	s.Did = &v
	return s
}

type StartBaasDidVerifiableclaimIssureRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 颁发证书声明
	BareClaim *BareClaim `json:"bare_claim,omitempty" xml:"bare_claim,omitempty" require:"true"`
	// 过期时间
	Expire *int64 `json:"expire,omitempty" xml:"expire,omitempty" require:"true"`
	// 由谁来颁发，该did必须为调用者自己或者自己代理的did
	Issuer *string `json:"issuer,omitempty" xml:"issuer,omitempty" require:"true"`
	// 为哪个did颁发
	Subject *string `json:"subject,omitempty" xml:"subject,omitempty" require:"true"`
	// 验证声明类型，目前默认VerifiableCredential
	Type []*string `json:"type,omitempty" xml:"type,omitempty" type:"Repeated"`
	// 验证声明状态方式，目前只支持直接通过声明id上链查找状态方式，后续会支持更多方式
	VerifyStatusType *string `json:"verify_status_type,omitempty" xml:"verify_status_type,omitempty"`
	// 场景码，找dis工作人员进行分配
	BizCode *string `json:"biz_code,omitempty" xml:"biz_code,omitempty"`
	// 可验证声明的完整声明 {"content":{"verion":"0.7.0","issuer":"xxxx","subject":"xxxx","expire":1530735444,"issucanceDate":1530735000,"id":"XXXX","claim":{//用户自定义},"status":{"type":"XXXX","id":"XXXXX"}},"proof":{"type":"ecdsa","created":"2018-06-18T21:19:10Z","verificationMethod":"XXXX","signatureValue":"XXXXX"}}
	VerifiableClaimContent *string `json:"verifiable_claim_content,omitempty" xml:"verifiable_claim_content,omitempty"`
	// 声明id
	VerifiableClaimId *string `json:"verifiable_claim_id,omitempty" xml:"verifiable_claim_id,omitempty"`
}

func (s StartBaasDidVerifiableclaimIssureRequest) String() string {
	return tea.Prettify(s)
}

func (s StartBaasDidVerifiableclaimIssureRequest) GoString() string {
	return s.String()
}

func (s *StartBaasDidVerifiableclaimIssureRequest) SetAuthToken(v string) *StartBaasDidVerifiableclaimIssureRequest {
	s.AuthToken = &v
	return s
}

func (s *StartBaasDidVerifiableclaimIssureRequest) SetProductInstanceId(v string) *StartBaasDidVerifiableclaimIssureRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *StartBaasDidVerifiableclaimIssureRequest) SetBareClaim(v *BareClaim) *StartBaasDidVerifiableclaimIssureRequest {
	s.BareClaim = v
	return s
}

func (s *StartBaasDidVerifiableclaimIssureRequest) SetExpire(v int64) *StartBaasDidVerifiableclaimIssureRequest {
	s.Expire = &v
	return s
}

func (s *StartBaasDidVerifiableclaimIssureRequest) SetIssuer(v string) *StartBaasDidVerifiableclaimIssureRequest {
	s.Issuer = &v
	return s
}

func (s *StartBaasDidVerifiableclaimIssureRequest) SetSubject(v string) *StartBaasDidVerifiableclaimIssureRequest {
	s.Subject = &v
	return s
}

func (s *StartBaasDidVerifiableclaimIssureRequest) SetType(v []*string) *StartBaasDidVerifiableclaimIssureRequest {
	s.Type = v
	return s
}

func (s *StartBaasDidVerifiableclaimIssureRequest) SetVerifyStatusType(v string) *StartBaasDidVerifiableclaimIssureRequest {
	s.VerifyStatusType = &v
	return s
}

func (s *StartBaasDidVerifiableclaimIssureRequest) SetBizCode(v string) *StartBaasDidVerifiableclaimIssureRequest {
	s.BizCode = &v
	return s
}

func (s *StartBaasDidVerifiableclaimIssureRequest) SetVerifiableClaimContent(v string) *StartBaasDidVerifiableclaimIssureRequest {
	s.VerifiableClaimContent = &v
	return s
}

func (s *StartBaasDidVerifiableclaimIssureRequest) SetVerifiableClaimId(v string) *StartBaasDidVerifiableclaimIssureRequest {
	s.VerifiableClaimId = &v
	return s
}

type StartBaasDidVerifiableclaimIssureResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 可验证声明的完整声明 {"content":{"verion":"0.7.0","issuer":"xxxx","subject":"xxxx","expire":1530735444,"issucanceDate":1530735000,"id":"XXXX","claim":{//用户自定义},"status":{"type":"XXXX","id":"XXXXX"}},"proof":{"type":"ecdsa","created":"2018-06-18T21:19:10Z","verificationMethod":"XXXX","signatureValue":"XXXXX"}}
	VerifiableClaimContent *string `json:"verifiable_claim_content,omitempty" xml:"verifiable_claim_content,omitempty"`
	// 声明id
	VerifiableClaimId *string `json:"verifiable_claim_id,omitempty" xml:"verifiable_claim_id,omitempty"`
}

func (s StartBaasDidVerifiableclaimIssureResponse) String() string {
	return tea.Prettify(s)
}

func (s StartBaasDidVerifiableclaimIssureResponse) GoString() string {
	return s.String()
}

func (s *StartBaasDidVerifiableclaimIssureResponse) SetReqMsgId(v string) *StartBaasDidVerifiableclaimIssureResponse {
	s.ReqMsgId = &v
	return s
}

func (s *StartBaasDidVerifiableclaimIssureResponse) SetResultCode(v string) *StartBaasDidVerifiableclaimIssureResponse {
	s.ResultCode = &v
	return s
}

func (s *StartBaasDidVerifiableclaimIssureResponse) SetResultMsg(v string) *StartBaasDidVerifiableclaimIssureResponse {
	s.ResultMsg = &v
	return s
}

func (s *StartBaasDidVerifiableclaimIssureResponse) SetVerifiableClaimContent(v string) *StartBaasDidVerifiableclaimIssureResponse {
	s.VerifiableClaimContent = &v
	return s
}

func (s *StartBaasDidVerifiableclaimIssureResponse) SetVerifiableClaimId(v string) *StartBaasDidVerifiableclaimIssureResponse {
	s.VerifiableClaimId = &v
	return s
}

type StartBaasDidVerifiableclaimVerifierRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 用于零知识证明类型的可验证声明的验证。index是对应于完整VC的一个json字符串，其中key值保持和原始VC一致，value如果是1表示verificate_claim对应key携带的是对应field的原始值，而如果Key的value是0表示verificate_claim对应key携带的是对应field的merkle root值。
	Indexs *string `json:"indexs,omitempty" xml:"indexs,omitempty"`
	// 可验证声明
	VerifiableClaim *string `json:"verifiable_claim,omitempty" xml:"verifiable_claim,omitempty" require:"true"`
	// 场景码，找dis工作人员进行分配
	BizCode *string `json:"biz_code,omitempty" xml:"biz_code,omitempty"`
}

func (s StartBaasDidVerifiableclaimVerifierRequest) String() string {
	return tea.Prettify(s)
}

func (s StartBaasDidVerifiableclaimVerifierRequest) GoString() string {
	return s.String()
}

func (s *StartBaasDidVerifiableclaimVerifierRequest) SetAuthToken(v string) *StartBaasDidVerifiableclaimVerifierRequest {
	s.AuthToken = &v
	return s
}

func (s *StartBaasDidVerifiableclaimVerifierRequest) SetProductInstanceId(v string) *StartBaasDidVerifiableclaimVerifierRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *StartBaasDidVerifiableclaimVerifierRequest) SetIndexs(v string) *StartBaasDidVerifiableclaimVerifierRequest {
	s.Indexs = &v
	return s
}

func (s *StartBaasDidVerifiableclaimVerifierRequest) SetVerifiableClaim(v string) *StartBaasDidVerifiableclaimVerifierRequest {
	s.VerifiableClaim = &v
	return s
}

func (s *StartBaasDidVerifiableclaimVerifierRequest) SetBizCode(v string) *StartBaasDidVerifiableclaimVerifierRequest {
	s.BizCode = &v
	return s
}

type StartBaasDidVerifiableclaimVerifierResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s StartBaasDidVerifiableclaimVerifierResponse) String() string {
	return tea.Prettify(s)
}

func (s StartBaasDidVerifiableclaimVerifierResponse) GoString() string {
	return s.String()
}

func (s *StartBaasDidVerifiableclaimVerifierResponse) SetReqMsgId(v string) *StartBaasDidVerifiableclaimVerifierResponse {
	s.ReqMsgId = &v
	return s
}

func (s *StartBaasDidVerifiableclaimVerifierResponse) SetResultCode(v string) *StartBaasDidVerifiableclaimVerifierResponse {
	s.ResultCode = &v
	return s
}

func (s *StartBaasDidVerifiableclaimVerifierResponse) SetResultMsg(v string) *StartBaasDidVerifiableclaimVerifierResponse {
	s.ResultMsg = &v
	return s
}

type QueryBaasDidVcRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// vc id，可通过该字符串来查询vc具体内容
	VcId *string `json:"vc_id,omitempty" xml:"vc_id,omitempty" require:"true"`
	// 验证者id
	VerifierDid *string `json:"verifier_did,omitempty" xml:"verifier_did,omitempty"`
	// 场景码，找dis工作人员进行分配
	BizCode *string `json:"biz_code,omitempty" xml:"biz_code,omitempty"`
	// 可验证声明的完整声明 {"content":{"verion":"0.7.0","issuer":"xxxx","subject":"xxxx","expire":1530735444,"issucanceDate":1530735000,"id":"XXXX","claim":{//用户自定义},"status":{"type":"XXXX","id":"XXXXX"}},"proof":{"type":"ecdsa","created":"2018-06-18T21:19:10Z","verificationMethod":"XXXX","signatureValue":"XXXXX"}}
	VcContent *string `json:"vc_content,omitempty" xml:"vc_content,omitempty"`
}

func (s QueryBaasDidVcRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasDidVcRequest) GoString() string {
	return s.String()
}

func (s *QueryBaasDidVcRequest) SetAuthToken(v string) *QueryBaasDidVcRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryBaasDidVcRequest) SetProductInstanceId(v string) *QueryBaasDidVcRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryBaasDidVcRequest) SetVcId(v string) *QueryBaasDidVcRequest {
	s.VcId = &v
	return s
}

func (s *QueryBaasDidVcRequest) SetVerifierDid(v string) *QueryBaasDidVcRequest {
	s.VerifierDid = &v
	return s
}

func (s *QueryBaasDidVcRequest) SetBizCode(v string) *QueryBaasDidVcRequest {
	s.BizCode = &v
	return s
}

func (s *QueryBaasDidVcRequest) SetVcContent(v string) *QueryBaasDidVcRequest {
	s.VcContent = &v
	return s
}

type QueryBaasDidVcResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 可验证声明的完整声明 {"content":{"verion":"0.7.0","issuer":"xxxx","subject":"xxxx","expire":1530735444,"issucanceDate":1530735000,"id":"XXXX","claim":{//用户自定义},"status":{"type":"XXXX","id":"XXXXX"}},"proof":{"type":"ecdsa","created":"2018-06-18T21:19:10Z","verificationMethod":"XXXX","signatureValue":"XXXXX"}}
	VcContent *string `json:"vc_content,omitempty" xml:"vc_content,omitempty"`
}

func (s QueryBaasDidVcResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasDidVcResponse) GoString() string {
	return s.String()
}

func (s *QueryBaasDidVcResponse) SetReqMsgId(v string) *QueryBaasDidVcResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryBaasDidVcResponse) SetResultCode(v string) *QueryBaasDidVcResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryBaasDidVcResponse) SetResultMsg(v string) *QueryBaasDidVcResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryBaasDidVcResponse) SetVcContent(v string) *QueryBaasDidVcResponse {
	s.VcContent = &v
	return s
}

type StartBaasDidIdentificationFaceauthRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 认证类型,枚举值 PC_AUTH、APP_AUTH
	AuthType *string `json:"auth_type,omitempty" xml:"auth_type,omitempty" require:"true"`
	// 颁发证书的subject did
	Did *string `json:"did,omitempty" xml:"did,omitempty" require:"true"`
	// 用户身份信息
	IdentityParam *IdentityParam `json:"identity_param,omitempty" xml:"identity_param,omitempty" require:"true"`
	// 认证接口回调路径，POST接口 请求示例： { "certifyId":"0242de204e1a2c3ed6ee5e21d8a57a4c", "did":"xxxxx","vcId":"xxxxx" }
	ReturnUrl *string `json:"return_url,omitempty" xml:"return_url,omitempty"`
	// 场景码，找dis工作人员进行分配
	BizCode *string `json:"biz_code,omitempty" xml:"biz_code,omitempty"`
	// 认证ID
	CertifyId *string `json:"certify_id,omitempty" xml:"certify_id,omitempty"`
	// 二维码URL，用户支付宝扫一扫实人认证
	CertifyUrl *string `json:"certify_url,omitempty" xml:"certify_url,omitempty"`
}

func (s StartBaasDidIdentificationFaceauthRequest) String() string {
	return tea.Prettify(s)
}

func (s StartBaasDidIdentificationFaceauthRequest) GoString() string {
	return s.String()
}

func (s *StartBaasDidIdentificationFaceauthRequest) SetAuthToken(v string) *StartBaasDidIdentificationFaceauthRequest {
	s.AuthToken = &v
	return s
}

func (s *StartBaasDidIdentificationFaceauthRequest) SetProductInstanceId(v string) *StartBaasDidIdentificationFaceauthRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *StartBaasDidIdentificationFaceauthRequest) SetAuthType(v string) *StartBaasDidIdentificationFaceauthRequest {
	s.AuthType = &v
	return s
}

func (s *StartBaasDidIdentificationFaceauthRequest) SetDid(v string) *StartBaasDidIdentificationFaceauthRequest {
	s.Did = &v
	return s
}

func (s *StartBaasDidIdentificationFaceauthRequest) SetIdentityParam(v *IdentityParam) *StartBaasDidIdentificationFaceauthRequest {
	s.IdentityParam = v
	return s
}

func (s *StartBaasDidIdentificationFaceauthRequest) SetReturnUrl(v string) *StartBaasDidIdentificationFaceauthRequest {
	s.ReturnUrl = &v
	return s
}

func (s *StartBaasDidIdentificationFaceauthRequest) SetBizCode(v string) *StartBaasDidIdentificationFaceauthRequest {
	s.BizCode = &v
	return s
}

func (s *StartBaasDidIdentificationFaceauthRequest) SetCertifyId(v string) *StartBaasDidIdentificationFaceauthRequest {
	s.CertifyId = &v
	return s
}

func (s *StartBaasDidIdentificationFaceauthRequest) SetCertifyUrl(v string) *StartBaasDidIdentificationFaceauthRequest {
	s.CertifyUrl = &v
	return s
}

type StartBaasDidIdentificationFaceauthResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 认证ID
	CertifyId *string `json:"certify_id,omitempty" xml:"certify_id,omitempty"`
	// 二维码URL，用户支付宝扫一扫实人认证
	CertifyUrl *string `json:"certify_url,omitempty" xml:"certify_url,omitempty"`
}

func (s StartBaasDidIdentificationFaceauthResponse) String() string {
	return tea.Prettify(s)
}

func (s StartBaasDidIdentificationFaceauthResponse) GoString() string {
	return s.String()
}

func (s *StartBaasDidIdentificationFaceauthResponse) SetReqMsgId(v string) *StartBaasDidIdentificationFaceauthResponse {
	s.ReqMsgId = &v
	return s
}

func (s *StartBaasDidIdentificationFaceauthResponse) SetResultCode(v string) *StartBaasDidIdentificationFaceauthResponse {
	s.ResultCode = &v
	return s
}

func (s *StartBaasDidIdentificationFaceauthResponse) SetResultMsg(v string) *StartBaasDidIdentificationFaceauthResponse {
	s.ResultMsg = &v
	return s
}

func (s *StartBaasDidIdentificationFaceauthResponse) SetCertifyId(v string) *StartBaasDidIdentificationFaceauthResponse {
	s.CertifyId = &v
	return s
}

func (s *StartBaasDidIdentificationFaceauthResponse) SetCertifyUrl(v string) *StartBaasDidIdentificationFaceauthResponse {
	s.CertifyUrl = &v
	return s
}

type QueryBaasDidIdentificationFaceauthRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 认证ID，用于查询认证结果
	CertifyId *string `json:"certify_id,omitempty" xml:"certify_id,omitempty" require:"true"`
	// 场景码，找dis工作人员进行分配
	BizCode *string `json:"biz_code,omitempty" xml:"biz_code,omitempty"`
	// vc id，可通过该字符串来查询vc具体内容
	VcId *string `json:"vc_id,omitempty" xml:"vc_id,omitempty"`
}

func (s QueryBaasDidIdentificationFaceauthRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasDidIdentificationFaceauthRequest) GoString() string {
	return s.String()
}

func (s *QueryBaasDidIdentificationFaceauthRequest) SetAuthToken(v string) *QueryBaasDidIdentificationFaceauthRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryBaasDidIdentificationFaceauthRequest) SetProductInstanceId(v string) *QueryBaasDidIdentificationFaceauthRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryBaasDidIdentificationFaceauthRequest) SetCertifyId(v string) *QueryBaasDidIdentificationFaceauthRequest {
	s.CertifyId = &v
	return s
}

func (s *QueryBaasDidIdentificationFaceauthRequest) SetBizCode(v string) *QueryBaasDidIdentificationFaceauthRequest {
	s.BizCode = &v
	return s
}

func (s *QueryBaasDidIdentificationFaceauthRequest) SetVcId(v string) *QueryBaasDidIdentificationFaceauthRequest {
	s.VcId = &v
	return s
}

type QueryBaasDidIdentificationFaceauthResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// vc id，可通过该字符串来查询vc具体内容
	VcId *string `json:"vc_id,omitempty" xml:"vc_id,omitempty"`
}

func (s QueryBaasDidIdentificationFaceauthResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasDidIdentificationFaceauthResponse) GoString() string {
	return s.String()
}

func (s *QueryBaasDidIdentificationFaceauthResponse) SetReqMsgId(v string) *QueryBaasDidIdentificationFaceauthResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryBaasDidIdentificationFaceauthResponse) SetResultCode(v string) *QueryBaasDidIdentificationFaceauthResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryBaasDidIdentificationFaceauthResponse) SetResultMsg(v string) *QueryBaasDidIdentificationFaceauthResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryBaasDidIdentificationFaceauthResponse) SetVcId(v string) *QueryBaasDidIdentificationFaceauthResponse {
	s.VcId = &v
	return s
}

type CreateBaasDidPersonWiththreemetaRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 身份证号码
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty" require:"true"`
	// 扩展字段
	ExtensionInfo *string `json:"extension_info,omitempty" xml:"extension_info,omitempty"`
	// 手机号码
	Mobile *string `json:"mobile,omitempty" xml:"mobile,omitempty" require:"true"`
	// 姓名
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 名称
	OwnerName *string `json:"owner_name,omitempty" xml:"owner_name,omitempty"`
	// 自定义个人唯一id，个人在自有模式下的唯一号，调用者需要保证其唯一性
	OwnerUid *string `json:"owner_uid,omitempty" xml:"owner_uid,omitempty" require:"true"`
	// 场景码，找dis工作人员进行分配
	BizCode *string `json:"biz_code,omitempty" xml:"biz_code,omitempty"`
	// 生成的did字符串
	Did *string `json:"did,omitempty" xml:"did,omitempty"`
	// 颁发的vcId
	VcId *string `json:"vc_id,omitempty" xml:"vc_id,omitempty"`
}

func (s CreateBaasDidPersonWiththreemetaRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateBaasDidPersonWiththreemetaRequest) GoString() string {
	return s.String()
}

func (s *CreateBaasDidPersonWiththreemetaRequest) SetAuthToken(v string) *CreateBaasDidPersonWiththreemetaRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateBaasDidPersonWiththreemetaRequest) SetProductInstanceId(v string) *CreateBaasDidPersonWiththreemetaRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateBaasDidPersonWiththreemetaRequest) SetCertNo(v string) *CreateBaasDidPersonWiththreemetaRequest {
	s.CertNo = &v
	return s
}

func (s *CreateBaasDidPersonWiththreemetaRequest) SetExtensionInfo(v string) *CreateBaasDidPersonWiththreemetaRequest {
	s.ExtensionInfo = &v
	return s
}

func (s *CreateBaasDidPersonWiththreemetaRequest) SetMobile(v string) *CreateBaasDidPersonWiththreemetaRequest {
	s.Mobile = &v
	return s
}

func (s *CreateBaasDidPersonWiththreemetaRequest) SetName(v string) *CreateBaasDidPersonWiththreemetaRequest {
	s.Name = &v
	return s
}

func (s *CreateBaasDidPersonWiththreemetaRequest) SetOwnerName(v string) *CreateBaasDidPersonWiththreemetaRequest {
	s.OwnerName = &v
	return s
}

func (s *CreateBaasDidPersonWiththreemetaRequest) SetOwnerUid(v string) *CreateBaasDidPersonWiththreemetaRequest {
	s.OwnerUid = &v
	return s
}

func (s *CreateBaasDidPersonWiththreemetaRequest) SetBizCode(v string) *CreateBaasDidPersonWiththreemetaRequest {
	s.BizCode = &v
	return s
}

func (s *CreateBaasDidPersonWiththreemetaRequest) SetDid(v string) *CreateBaasDidPersonWiththreemetaRequest {
	s.Did = &v
	return s
}

func (s *CreateBaasDidPersonWiththreemetaRequest) SetVcId(v string) *CreateBaasDidPersonWiththreemetaRequest {
	s.VcId = &v
	return s
}

type CreateBaasDidPersonWiththreemetaResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 生成的did字符串
	Did *string `json:"did,omitempty" xml:"did,omitempty"`
	// 颁发的vcId
	VcId *string `json:"vc_id,omitempty" xml:"vc_id,omitempty"`
}

func (s CreateBaasDidPersonWiththreemetaResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateBaasDidPersonWiththreemetaResponse) GoString() string {
	return s.String()
}

func (s *CreateBaasDidPersonWiththreemetaResponse) SetReqMsgId(v string) *CreateBaasDidPersonWiththreemetaResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateBaasDidPersonWiththreemetaResponse) SetResultCode(v string) *CreateBaasDidPersonWiththreemetaResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateBaasDidPersonWiththreemetaResponse) SetResultMsg(v string) *CreateBaasDidPersonWiththreemetaResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateBaasDidPersonWiththreemetaResponse) SetDid(v string) *CreateBaasDidPersonWiththreemetaResponse {
	s.Did = &v
	return s
}

func (s *CreateBaasDidPersonWiththreemetaResponse) SetVcId(v string) *CreateBaasDidPersonWiththreemetaResponse {
	s.VcId = &v
	return s
}

type CreateBaasDidCorporateWiththreemetaRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 企业名称
	EpCertName *string `json:"ep_cert_name,omitempty" xml:"ep_cert_name,omitempty" require:"true"`
	// 企业证件号
	EpCertNo *string `json:"ep_cert_no,omitempty" xml:"ep_cert_no,omitempty" require:"true"`
	// { "nation": "CN", //企业注册地址 "type": "LimitedCompany", //企业类型 "name": "演示用户名", //必选字段，企业名 "licenceNo": "1111", //营业执照 "address": "1111", //企业地址 "parentName": "", //<-必选字段 业务方名 需要提前协商 "linkType": "indirect", //<- 连接类型，direct直链企业， indirect间链企业 "certifyDate": "2019-1-1", //证书颁发时间 "licenceExpireDate": "2020-1-1", //证书到期时间 "businessScope": "1111", //企业经营范围 "businessAddress": "1111", //企业经营地址 "corporateBusinessType": 0, //<- 企业类型：0 一般企业， 1 个人商户 "channelName": "" //<- 必选字段 业务渠道 需要提前沟通 }
	ExtensionInfo *string `json:"extension_info,omitempty" xml:"extension_info,omitempty"`
	// 法人姓名
	LegalPersonCertName *string `json:"legal_person_cert_name,omitempty" xml:"legal_person_cert_name,omitempty" require:"true"`
	// 名称
	OwnerName *string `json:"owner_name,omitempty" xml:"owner_name,omitempty"`
	// 自定义企业唯一id，企业在自有模式下的唯一号，调用者需要保证其唯一性
	OwnerUid *string `json:"owner_uid,omitempty" xml:"owner_uid,omitempty" require:"true"`
	// 场景码，找dis工作人员进行分配
	BizCode *string `json:"biz_code,omitempty" xml:"biz_code,omitempty"`
	// 生成的did
	Did *string `json:"did,omitempty" xml:"did,omitempty"`
	// 颁发的vcId
	VcId *string `json:"vc_id,omitempty" xml:"vc_id,omitempty"`
}

func (s CreateBaasDidCorporateWiththreemetaRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateBaasDidCorporateWiththreemetaRequest) GoString() string {
	return s.String()
}

func (s *CreateBaasDidCorporateWiththreemetaRequest) SetAuthToken(v string) *CreateBaasDidCorporateWiththreemetaRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateBaasDidCorporateWiththreemetaRequest) SetProductInstanceId(v string) *CreateBaasDidCorporateWiththreemetaRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateBaasDidCorporateWiththreemetaRequest) SetEpCertName(v string) *CreateBaasDidCorporateWiththreemetaRequest {
	s.EpCertName = &v
	return s
}

func (s *CreateBaasDidCorporateWiththreemetaRequest) SetEpCertNo(v string) *CreateBaasDidCorporateWiththreemetaRequest {
	s.EpCertNo = &v
	return s
}

func (s *CreateBaasDidCorporateWiththreemetaRequest) SetExtensionInfo(v string) *CreateBaasDidCorporateWiththreemetaRequest {
	s.ExtensionInfo = &v
	return s
}

func (s *CreateBaasDidCorporateWiththreemetaRequest) SetLegalPersonCertName(v string) *CreateBaasDidCorporateWiththreemetaRequest {
	s.LegalPersonCertName = &v
	return s
}

func (s *CreateBaasDidCorporateWiththreemetaRequest) SetOwnerName(v string) *CreateBaasDidCorporateWiththreemetaRequest {
	s.OwnerName = &v
	return s
}

func (s *CreateBaasDidCorporateWiththreemetaRequest) SetOwnerUid(v string) *CreateBaasDidCorporateWiththreemetaRequest {
	s.OwnerUid = &v
	return s
}

func (s *CreateBaasDidCorporateWiththreemetaRequest) SetBizCode(v string) *CreateBaasDidCorporateWiththreemetaRequest {
	s.BizCode = &v
	return s
}

func (s *CreateBaasDidCorporateWiththreemetaRequest) SetDid(v string) *CreateBaasDidCorporateWiththreemetaRequest {
	s.Did = &v
	return s
}

func (s *CreateBaasDidCorporateWiththreemetaRequest) SetVcId(v string) *CreateBaasDidCorporateWiththreemetaRequest {
	s.VcId = &v
	return s
}

type CreateBaasDidCorporateWiththreemetaResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 生成的did
	Did *string `json:"did,omitempty" xml:"did,omitempty"`
	// 颁发的vcId
	VcId *string `json:"vc_id,omitempty" xml:"vc_id,omitempty"`
}

func (s CreateBaasDidCorporateWiththreemetaResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateBaasDidCorporateWiththreemetaResponse) GoString() string {
	return s.String()
}

func (s *CreateBaasDidCorporateWiththreemetaResponse) SetReqMsgId(v string) *CreateBaasDidCorporateWiththreemetaResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateBaasDidCorporateWiththreemetaResponse) SetResultCode(v string) *CreateBaasDidCorporateWiththreemetaResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateBaasDidCorporateWiththreemetaResponse) SetResultMsg(v string) *CreateBaasDidCorporateWiththreemetaResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateBaasDidCorporateWiththreemetaResponse) SetDid(v string) *CreateBaasDidCorporateWiththreemetaResponse {
	s.Did = &v
	return s
}

func (s *CreateBaasDidCorporateWiththreemetaResponse) SetVcId(v string) *CreateBaasDidCorporateWiththreemetaResponse {
	s.VcId = &v
	return s
}

type StartBaasDidVcrepositoryIssueRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 配置此列表，则说明需要DIS对证书声明内容加密处理，并且控制访问权限，此列表为初始配置的did名单，拥有对此颁发证书的读取权限。
	// 如果不配置此列表，则DIS默认将明文存储此证书，任何did都可以访问此证书声明内容。
	//
	AuthDidList []*string `json:"auth_did_list,omitempty" xml:"auth_did_list,omitempty" type:"Repeated"`
	// 颁发证书声明的原始声明内容，其中claim字段为json格式
	BareClaim *BareClaim `json:"bare_claim,omitempty" xml:"bare_claim,omitempty" require:"true"`
	// 过期时间，如果用不过期可以设置为：-1。
	// 注意如果证书过期，则无法再通过VC Repository读取访问此证书内容。
	Expire *int64 `json:"expire,omitempty" xml:"expire,omitempty" require:"true"`
	// 颁发证书方，该did必须为调用者自己或者自己代理的did。
	//
	Issuer *string `json:"issuer,omitempty" xml:"issuer,omitempty" require:"true"`
	// 1 - 指定id将被按照verifiable_claim_id = "vc:mychain:" + SHA256(Joiner.on(":").join(subject, verifiable_claim_id.substring(0,50)))+verifiable_claim_id.substring(50);此表达式参与SHA256的 verifiable_claim_id 为用户指定的参数。
	SpecifiedClaimIdType *int64 `json:"specified_claim_id_type,omitempty" xml:"specified_claim_id_type,omitempty"`
	// 颁发证书的目标did，此目标did将拥有存储到VC Repository的数据管控权限，比如：授权给其它did读取此证书的权限。
	Subject *string `json:"subject,omitempty" xml:"subject,omitempty" require:"true"`
	// 通过层级定义的证书类型说明，在使用VC Repository的情况下默认为：["VerifiableCredential","DelegateVCRepository"]。
	// 如果用户希望通过type来过滤读取证书VC，那么可以在此列表后面追加层次定义说明，方便后续读取证书在VC Repository进行过滤。（如果读取方已知verifiable_claim_id可以直接过滤读取）
	Type []*string `json:"type,omitempty" xml:"type,omitempty" type:"Repeated"`
	// 如果指定，最终会使用此id会参与生成的证书的verifiable_claim_id，但是调用方需要保证设置值的唯一性，重复的id会引起最终verifiable_claim_id重复，导致被拒绝颁发证书。
	// 如果不指定，则会随机生成一个规范的verifiable_claim_id。
	// verifiable_claim_id = "vc:mychain:" + SHA256(Joiner.on(":").join(subject, verifiable_claim_id)); 此表达式参与SHA256的 verifiable_claim_id 为用户指定的参数。
	VerifiableClaimId *string `json:"verifiable_claim_id,omitempty" xml:"verifiable_claim_id,omitempty"`
	// 验证声明状态方式，目前只支持直接通过声明id上链查找状态方式，后续会支持更多方式
	VerifyStatusType *string `json:"verify_status_type,omitempty" xml:"verify_status_type,omitempty"`
	// 场景码，找dis工作人员进行分配
	BizCode *string `json:"biz_code,omitempty" xml:"biz_code,omitempty"`
	// 可验证声明的完整声明 {"content":{"verion":"0.7.0","issuer":"xxxx","subject":"xxxx","expire":1530735444,"issucanceDate":1530735000,"id":"XXXX","claim":{//用户自定义},"status":{"type":"XXXX","id":"XXXXX"}},"proof":{"type":"ecdsa","created":"2018-06-18T21:19:10Z","verificationMethod":"XXXX","signatureValue":"XXXXX"}}
	VerifiableClaimContent *string `json:"verifiable_claim_content,omitempty" xml:"verifiable_claim_content,omitempty"`
}

func (s StartBaasDidVcrepositoryIssueRequest) String() string {
	return tea.Prettify(s)
}

func (s StartBaasDidVcrepositoryIssueRequest) GoString() string {
	return s.String()
}

func (s *StartBaasDidVcrepositoryIssueRequest) SetAuthToken(v string) *StartBaasDidVcrepositoryIssueRequest {
	s.AuthToken = &v
	return s
}

func (s *StartBaasDidVcrepositoryIssueRequest) SetProductInstanceId(v string) *StartBaasDidVcrepositoryIssueRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *StartBaasDidVcrepositoryIssueRequest) SetAuthDidList(v []*string) *StartBaasDidVcrepositoryIssueRequest {
	s.AuthDidList = v
	return s
}

func (s *StartBaasDidVcrepositoryIssueRequest) SetBareClaim(v *BareClaim) *StartBaasDidVcrepositoryIssueRequest {
	s.BareClaim = v
	return s
}

func (s *StartBaasDidVcrepositoryIssueRequest) SetExpire(v int64) *StartBaasDidVcrepositoryIssueRequest {
	s.Expire = &v
	return s
}

func (s *StartBaasDidVcrepositoryIssueRequest) SetIssuer(v string) *StartBaasDidVcrepositoryIssueRequest {
	s.Issuer = &v
	return s
}

func (s *StartBaasDidVcrepositoryIssueRequest) SetSpecifiedClaimIdType(v int64) *StartBaasDidVcrepositoryIssueRequest {
	s.SpecifiedClaimIdType = &v
	return s
}

func (s *StartBaasDidVcrepositoryIssueRequest) SetSubject(v string) *StartBaasDidVcrepositoryIssueRequest {
	s.Subject = &v
	return s
}

func (s *StartBaasDidVcrepositoryIssueRequest) SetType(v []*string) *StartBaasDidVcrepositoryIssueRequest {
	s.Type = v
	return s
}

func (s *StartBaasDidVcrepositoryIssueRequest) SetVerifiableClaimId(v string) *StartBaasDidVcrepositoryIssueRequest {
	s.VerifiableClaimId = &v
	return s
}

func (s *StartBaasDidVcrepositoryIssueRequest) SetVerifyStatusType(v string) *StartBaasDidVcrepositoryIssueRequest {
	s.VerifyStatusType = &v
	return s
}

func (s *StartBaasDidVcrepositoryIssueRequest) SetBizCode(v string) *StartBaasDidVcrepositoryIssueRequest {
	s.BizCode = &v
	return s
}

func (s *StartBaasDidVcrepositoryIssueRequest) SetVerifiableClaimContent(v string) *StartBaasDidVcrepositoryIssueRequest {
	s.VerifiableClaimContent = &v
	return s
}

type StartBaasDidVcrepositoryIssueResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 可验证声明的完整声明 {"content":{"verion":"0.7.0","issuer":"xxxx","subject":"xxxx","expire":1530735444,"issucanceDate":1530735000,"id":"XXXX","claim":{//用户自定义},"status":{"type":"XXXX","id":"XXXXX"}},"proof":{"type":"ecdsa","created":"2018-06-18T21:19:10Z","verificationMethod":"XXXX","signatureValue":"XXXXX"}}
	VerifiableClaimContent *string `json:"verifiable_claim_content,omitempty" xml:"verifiable_claim_content,omitempty"`
	// 颁发的证书唯一id，颁发成功后返回。
	VerifiableClaimId *string `json:"verifiable_claim_id,omitempty" xml:"verifiable_claim_id,omitempty"`
}

func (s StartBaasDidVcrepositoryIssueResponse) String() string {
	return tea.Prettify(s)
}

func (s StartBaasDidVcrepositoryIssueResponse) GoString() string {
	return s.String()
}

func (s *StartBaasDidVcrepositoryIssueResponse) SetReqMsgId(v string) *StartBaasDidVcrepositoryIssueResponse {
	s.ReqMsgId = &v
	return s
}

func (s *StartBaasDidVcrepositoryIssueResponse) SetResultCode(v string) *StartBaasDidVcrepositoryIssueResponse {
	s.ResultCode = &v
	return s
}

func (s *StartBaasDidVcrepositoryIssueResponse) SetResultMsg(v string) *StartBaasDidVcrepositoryIssueResponse {
	s.ResultMsg = &v
	return s
}

func (s *StartBaasDidVcrepositoryIssueResponse) SetVerifiableClaimContent(v string) *StartBaasDidVcrepositoryIssueResponse {
	s.VerifiableClaimContent = &v
	return s
}

func (s *StartBaasDidVcrepositoryIssueResponse) SetVerifiableClaimId(v string) *StartBaasDidVcrepositoryIssueResponse {
	s.VerifiableClaimId = &v
	return s
}

type StartBaasDidAgentServicetypeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 枚举类型，描述访问服务的方式
	AccessMode *string `json:"access_mode,omitempty" xml:"access_mode,omitempty"`
	// 对服务的文字描述，<1000个字符
	Description *string `json:"description,omitempty" xml:"description,omitempty"`
	// 服务类型创建者did
	Did *string `json:"did,omitempty" xml:"did,omitempty" require:"true"`
	// {
	//   "item1":"",
	//   "item2":"",
	//   ...
	// }
	ServiceInput *string `json:"service_input,omitempty" xml:"service_input,omitempty"`
	// {
	//    "item1":""
	//    "item2":""
	//    ...
	// }
	ServiceOutput *string `json:"service_output,omitempty" xml:"service_output,omitempty"`
	// 自定义服务类型，字符数16～32个
	ServiceType *string `json:"service_type,omitempty" xml:"service_type,omitempty" require:"true"`
	// 场景码，找dis工作人员进行分配
	BizCode *string `json:"biz_code,omitempty" xml:"biz_code,omitempty"`
}

func (s StartBaasDidAgentServicetypeRequest) String() string {
	return tea.Prettify(s)
}

func (s StartBaasDidAgentServicetypeRequest) GoString() string {
	return s.String()
}

func (s *StartBaasDidAgentServicetypeRequest) SetAuthToken(v string) *StartBaasDidAgentServicetypeRequest {
	s.AuthToken = &v
	return s
}

func (s *StartBaasDidAgentServicetypeRequest) SetProductInstanceId(v string) *StartBaasDidAgentServicetypeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *StartBaasDidAgentServicetypeRequest) SetAccessMode(v string) *StartBaasDidAgentServicetypeRequest {
	s.AccessMode = &v
	return s
}

func (s *StartBaasDidAgentServicetypeRequest) SetDescription(v string) *StartBaasDidAgentServicetypeRequest {
	s.Description = &v
	return s
}

func (s *StartBaasDidAgentServicetypeRequest) SetDid(v string) *StartBaasDidAgentServicetypeRequest {
	s.Did = &v
	return s
}

func (s *StartBaasDidAgentServicetypeRequest) SetServiceInput(v string) *StartBaasDidAgentServicetypeRequest {
	s.ServiceInput = &v
	return s
}

func (s *StartBaasDidAgentServicetypeRequest) SetServiceOutput(v string) *StartBaasDidAgentServicetypeRequest {
	s.ServiceOutput = &v
	return s
}

func (s *StartBaasDidAgentServicetypeRequest) SetServiceType(v string) *StartBaasDidAgentServicetypeRequest {
	s.ServiceType = &v
	return s
}

func (s *StartBaasDidAgentServicetypeRequest) SetBizCode(v string) *StartBaasDidAgentServicetypeRequest {
	s.BizCode = &v
	return s
}

type StartBaasDidAgentServicetypeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 创建成功之后，返回服务类型名
	ServiceType *string `json:"service_type,omitempty" xml:"service_type,omitempty"`
}

func (s StartBaasDidAgentServicetypeResponse) String() string {
	return tea.Prettify(s)
}

func (s StartBaasDidAgentServicetypeResponse) GoString() string {
	return s.String()
}

func (s *StartBaasDidAgentServicetypeResponse) SetReqMsgId(v string) *StartBaasDidAgentServicetypeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *StartBaasDidAgentServicetypeResponse) SetResultCode(v string) *StartBaasDidAgentServicetypeResponse {
	s.ResultCode = &v
	return s
}

func (s *StartBaasDidAgentServicetypeResponse) SetResultMsg(v string) *StartBaasDidAgentServicetypeResponse {
	s.ResultMsg = &v
	return s
}

func (s *StartBaasDidAgentServicetypeResponse) SetServiceType(v string) *StartBaasDidAgentServicetypeResponse {
	s.ServiceType = &v
	return s
}

type QueryBaasDidAgentServicetypeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 查询者did
	Did *string `json:"did,omitempty" xml:"did,omitempty" require:"true"`
	// 指定查询的服务类型名
	ServiceType *string `json:"service_type,omitempty" xml:"service_type,omitempty" require:"true"`
	// 场景码，找dis工作人员进行分配
	BizCode *string `json:"biz_code,omitempty" xml:"biz_code,omitempty"`
	// 服务类型定义列表
	ServiceTypes []*string `json:"service_types,omitempty" xml:"service_types,omitempty" type:"Repeated"`
	// 总共有几项
	TotalNumber *int64 `json:"total_number,omitempty" xml:"total_number,omitempty"`
	// 总共有几页
	TotalPage *int64 `json:"total_page,omitempty" xml:"total_page,omitempty"`
}

func (s QueryBaasDidAgentServicetypeRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasDidAgentServicetypeRequest) GoString() string {
	return s.String()
}

func (s *QueryBaasDidAgentServicetypeRequest) SetAuthToken(v string) *QueryBaasDidAgentServicetypeRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryBaasDidAgentServicetypeRequest) SetProductInstanceId(v string) *QueryBaasDidAgentServicetypeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryBaasDidAgentServicetypeRequest) SetDid(v string) *QueryBaasDidAgentServicetypeRequest {
	s.Did = &v
	return s
}

func (s *QueryBaasDidAgentServicetypeRequest) SetServiceType(v string) *QueryBaasDidAgentServicetypeRequest {
	s.ServiceType = &v
	return s
}

func (s *QueryBaasDidAgentServicetypeRequest) SetBizCode(v string) *QueryBaasDidAgentServicetypeRequest {
	s.BizCode = &v
	return s
}

func (s *QueryBaasDidAgentServicetypeRequest) SetServiceTypes(v []*string) *QueryBaasDidAgentServicetypeRequest {
	s.ServiceTypes = v
	return s
}

func (s *QueryBaasDidAgentServicetypeRequest) SetTotalNumber(v int64) *QueryBaasDidAgentServicetypeRequest {
	s.TotalNumber = &v
	return s
}

func (s *QueryBaasDidAgentServicetypeRequest) SetTotalPage(v int64) *QueryBaasDidAgentServicetypeRequest {
	s.TotalPage = &v
	return s
}

type QueryBaasDidAgentServicetypeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 服务类型定义列表
	ServiceTypes []*string `json:"service_types,omitempty" xml:"service_types,omitempty" type:"Repeated"`
	// 总共有几项
	TotalNumber *int64 `json:"total_number,omitempty" xml:"total_number,omitempty"`
	// 总共有几页
	TotalPage *int64 `json:"total_page,omitempty" xml:"total_page,omitempty"`
}

func (s QueryBaasDidAgentServicetypeResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasDidAgentServicetypeResponse) GoString() string {
	return s.String()
}

func (s *QueryBaasDidAgentServicetypeResponse) SetReqMsgId(v string) *QueryBaasDidAgentServicetypeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryBaasDidAgentServicetypeResponse) SetResultCode(v string) *QueryBaasDidAgentServicetypeResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryBaasDidAgentServicetypeResponse) SetResultMsg(v string) *QueryBaasDidAgentServicetypeResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryBaasDidAgentServicetypeResponse) SetServiceTypes(v []*string) *QueryBaasDidAgentServicetypeResponse {
	s.ServiceTypes = v
	return s
}

func (s *QueryBaasDidAgentServicetypeResponse) SetTotalNumber(v int64) *QueryBaasDidAgentServicetypeResponse {
	s.TotalNumber = &v
	return s
}

func (s *QueryBaasDidAgentServicetypeResponse) SetTotalPage(v int64) *QueryBaasDidAgentServicetypeResponse {
	s.TotalPage = &v
	return s
}

type UpdateBaasDidServicesRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 新增的服务信息
	AddSevices []*DidDocServicesInfo `json:"add_sevices,omitempty" xml:"add_sevices,omitempty" type:"Repeated"`
	// 要删除的服务id列表
	DelServices []*string `json:"del_services,omitempty" xml:"del_services,omitempty" type:"Repeated"`
	// 指定要更新的did
	Did *string `json:"did,omitempty" xml:"did,omitempty" require:"true"`
	// did类型，个人|企业|设备(IOT)
	DidType *string `json:"did_type,omitempty" xml:"did_type,omitempty" require:"true"`
	// 场景码，找dis工作人员进行分配
	BizCode *string `json:"biz_code,omitempty" xml:"biz_code,omitempty"`
	// 更新后的did doc
	DidDoc *string `json:"did_doc,omitempty" xml:"did_doc,omitempty"`
}

func (s UpdateBaasDidServicesRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateBaasDidServicesRequest) GoString() string {
	return s.String()
}

func (s *UpdateBaasDidServicesRequest) SetAuthToken(v string) *UpdateBaasDidServicesRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateBaasDidServicesRequest) SetProductInstanceId(v string) *UpdateBaasDidServicesRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateBaasDidServicesRequest) SetAddSevices(v []*DidDocServicesInfo) *UpdateBaasDidServicesRequest {
	s.AddSevices = v
	return s
}

func (s *UpdateBaasDidServicesRequest) SetDelServices(v []*string) *UpdateBaasDidServicesRequest {
	s.DelServices = v
	return s
}

func (s *UpdateBaasDidServicesRequest) SetDid(v string) *UpdateBaasDidServicesRequest {
	s.Did = &v
	return s
}

func (s *UpdateBaasDidServicesRequest) SetDidType(v string) *UpdateBaasDidServicesRequest {
	s.DidType = &v
	return s
}

func (s *UpdateBaasDidServicesRequest) SetBizCode(v string) *UpdateBaasDidServicesRequest {
	s.BizCode = &v
	return s
}

func (s *UpdateBaasDidServicesRequest) SetDidDoc(v string) *UpdateBaasDidServicesRequest {
	s.DidDoc = &v
	return s
}

type UpdateBaasDidServicesResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 更新后的did doc
	DidDoc *string `json:"did_doc,omitempty" xml:"did_doc,omitempty"`
}

func (s UpdateBaasDidServicesResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateBaasDidServicesResponse) GoString() string {
	return s.String()
}

func (s *UpdateBaasDidServicesResponse) SetReqMsgId(v string) *UpdateBaasDidServicesResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateBaasDidServicesResponse) SetResultCode(v string) *UpdateBaasDidServicesResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateBaasDidServicesResponse) SetResultMsg(v string) *UpdateBaasDidServicesResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateBaasDidServicesResponse) SetDidDoc(v string) *UpdateBaasDidServicesResponse {
	s.DidDoc = &v
	return s
}

type CreateBaasDidPersonWithtwometaRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 身份证号码
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty" require:"true"`
	// 扩展字段
	ExtensionInfo *string `json:"extension_info,omitempty" xml:"extension_info,omitempty"`
	// 姓名
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 名称
	OwnerName *string `json:"owner_name,omitempty" xml:"owner_name,omitempty"`
	// 自定义个人唯一id，个人在自有模式下的唯一号，调用者需要保证其唯一性
	OwnerUid *string `json:"owner_uid,omitempty" xml:"owner_uid,omitempty" require:"true"`
	// 场景码，找dis工作人员进行分配
	BizCode *string `json:"biz_code,omitempty" xml:"biz_code,omitempty"`
	// 生成的did字符串
	Did *string `json:"did,omitempty" xml:"did,omitempty"`
	// 颁发的vcId
	VcId *string `json:"vc_id,omitempty" xml:"vc_id,omitempty"`
}

func (s CreateBaasDidPersonWithtwometaRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateBaasDidPersonWithtwometaRequest) GoString() string {
	return s.String()
}

func (s *CreateBaasDidPersonWithtwometaRequest) SetAuthToken(v string) *CreateBaasDidPersonWithtwometaRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateBaasDidPersonWithtwometaRequest) SetProductInstanceId(v string) *CreateBaasDidPersonWithtwometaRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateBaasDidPersonWithtwometaRequest) SetCertNo(v string) *CreateBaasDidPersonWithtwometaRequest {
	s.CertNo = &v
	return s
}

func (s *CreateBaasDidPersonWithtwometaRequest) SetExtensionInfo(v string) *CreateBaasDidPersonWithtwometaRequest {
	s.ExtensionInfo = &v
	return s
}

func (s *CreateBaasDidPersonWithtwometaRequest) SetName(v string) *CreateBaasDidPersonWithtwometaRequest {
	s.Name = &v
	return s
}

func (s *CreateBaasDidPersonWithtwometaRequest) SetOwnerName(v string) *CreateBaasDidPersonWithtwometaRequest {
	s.OwnerName = &v
	return s
}

func (s *CreateBaasDidPersonWithtwometaRequest) SetOwnerUid(v string) *CreateBaasDidPersonWithtwometaRequest {
	s.OwnerUid = &v
	return s
}

func (s *CreateBaasDidPersonWithtwometaRequest) SetBizCode(v string) *CreateBaasDidPersonWithtwometaRequest {
	s.BizCode = &v
	return s
}

func (s *CreateBaasDidPersonWithtwometaRequest) SetDid(v string) *CreateBaasDidPersonWithtwometaRequest {
	s.Did = &v
	return s
}

func (s *CreateBaasDidPersonWithtwometaRequest) SetVcId(v string) *CreateBaasDidPersonWithtwometaRequest {
	s.VcId = &v
	return s
}

type CreateBaasDidPersonWithtwometaResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 生成的did字符串
	Did *string `json:"did,omitempty" xml:"did,omitempty"`
	// 颁发的vcId
	VcId *string `json:"vc_id,omitempty" xml:"vc_id,omitempty"`
}

func (s CreateBaasDidPersonWithtwometaResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateBaasDidPersonWithtwometaResponse) GoString() string {
	return s.String()
}

func (s *CreateBaasDidPersonWithtwometaResponse) SetReqMsgId(v string) *CreateBaasDidPersonWithtwometaResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateBaasDidPersonWithtwometaResponse) SetResultCode(v string) *CreateBaasDidPersonWithtwometaResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateBaasDidPersonWithtwometaResponse) SetResultMsg(v string) *CreateBaasDidPersonWithtwometaResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateBaasDidPersonWithtwometaResponse) SetDid(v string) *CreateBaasDidPersonWithtwometaResponse {
	s.Did = &v
	return s
}

func (s *CreateBaasDidPersonWithtwometaResponse) SetVcId(v string) *CreateBaasDidPersonWithtwometaResponse {
	s.VcId = &v
	return s
}

type CreateBaasDidCorporateWithtwometaRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 企业名称
	EpCertName *string `json:"ep_cert_name,omitempty" xml:"ep_cert_name,omitempty" require:"true"`
	// 企业证件号
	EpCertNo *string `json:"ep_cert_no,omitempty" xml:"ep_cert_no,omitempty" require:"true"`
	// {
	//   "nation": "CN", //企业注册地址
	//   "type": "LimitedCompany", //企业类型
	//   "name": "演示用户名", //必选字段，企业名
	//   "licenceNo": "1111", //营业执照
	//   "address": "1111", //企业地址
	//   "parentName": "", //<-必选字段 业务方名 需要提前协商
	//   "linkType": "indirect", //<- 连接类型，direct直链企业， indirect间链企业
	//   "certifyDate": "2019-1-1", //证书颁发时间
	//   "licenceExpireDate": "2020-1-1", //证书到期时间
	//   "businessScope": "1111", //企业经营范围
	//   "businessAddress": "1111", //企业经营地址
	//   "corporateBusinessType": 0, //<- 企业类型：0 一般企业， 1 个人商户
	//   "channelName": "" //<- 必选字段 业务渠道 需要提前沟通
	// }
	ExtensionInfo *string `json:"extension_info,omitempty" xml:"extension_info,omitempty"`
	// 名称
	//
	OwnerName *string `json:"owner_name,omitempty" xml:"owner_name,omitempty"`
	// 自定义企业唯一id，企业在自有模式下的唯一号，调用者需要保证其唯一性
	OwnerUid *string `json:"owner_uid,omitempty" xml:"owner_uid,omitempty" require:"true"`
	// 场景码，找dis工作人员进行分配
	BizCode *string `json:"biz_code,omitempty" xml:"biz_code,omitempty"`
	// 生成的did
	//
	Did *string `json:"did,omitempty" xml:"did,omitempty"`
	// 颁发的vcId
	VcId *string `json:"vc_id,omitempty" xml:"vc_id,omitempty"`
}

func (s CreateBaasDidCorporateWithtwometaRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateBaasDidCorporateWithtwometaRequest) GoString() string {
	return s.String()
}

func (s *CreateBaasDidCorporateWithtwometaRequest) SetAuthToken(v string) *CreateBaasDidCorporateWithtwometaRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateBaasDidCorporateWithtwometaRequest) SetProductInstanceId(v string) *CreateBaasDidCorporateWithtwometaRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateBaasDidCorporateWithtwometaRequest) SetEpCertName(v string) *CreateBaasDidCorporateWithtwometaRequest {
	s.EpCertName = &v
	return s
}

func (s *CreateBaasDidCorporateWithtwometaRequest) SetEpCertNo(v string) *CreateBaasDidCorporateWithtwometaRequest {
	s.EpCertNo = &v
	return s
}

func (s *CreateBaasDidCorporateWithtwometaRequest) SetExtensionInfo(v string) *CreateBaasDidCorporateWithtwometaRequest {
	s.ExtensionInfo = &v
	return s
}

func (s *CreateBaasDidCorporateWithtwometaRequest) SetOwnerName(v string) *CreateBaasDidCorporateWithtwometaRequest {
	s.OwnerName = &v
	return s
}

func (s *CreateBaasDidCorporateWithtwometaRequest) SetOwnerUid(v string) *CreateBaasDidCorporateWithtwometaRequest {
	s.OwnerUid = &v
	return s
}

func (s *CreateBaasDidCorporateWithtwometaRequest) SetBizCode(v string) *CreateBaasDidCorporateWithtwometaRequest {
	s.BizCode = &v
	return s
}

func (s *CreateBaasDidCorporateWithtwometaRequest) SetDid(v string) *CreateBaasDidCorporateWithtwometaRequest {
	s.Did = &v
	return s
}

func (s *CreateBaasDidCorporateWithtwometaRequest) SetVcId(v string) *CreateBaasDidCorporateWithtwometaRequest {
	s.VcId = &v
	return s
}

type CreateBaasDidCorporateWithtwometaResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 生成的did
	//
	Did *string `json:"did,omitempty" xml:"did,omitempty"`
	// 颁发的vcId
	VcId *string `json:"vc_id,omitempty" xml:"vc_id,omitempty"`
}

func (s CreateBaasDidCorporateWithtwometaResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateBaasDidCorporateWithtwometaResponse) GoString() string {
	return s.String()
}

func (s *CreateBaasDidCorporateWithtwometaResponse) SetReqMsgId(v string) *CreateBaasDidCorporateWithtwometaResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateBaasDidCorporateWithtwometaResponse) SetResultCode(v string) *CreateBaasDidCorporateWithtwometaResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateBaasDidCorporateWithtwometaResponse) SetResultMsg(v string) *CreateBaasDidCorporateWithtwometaResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateBaasDidCorporateWithtwometaResponse) SetDid(v string) *CreateBaasDidCorporateWithtwometaResponse {
	s.Did = &v
	return s
}

func (s *CreateBaasDidCorporateWithtwometaResponse) SetVcId(v string) *CreateBaasDidCorporateWithtwometaResponse {
	s.VcId = &v
	return s
}

type CreateBaasDidCorporateWithfourmetaRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 企业名称
	//
	EpCertName *string `json:"ep_cert_name,omitempty" xml:"ep_cert_name,omitempty" require:"true"`
	// 企业证件号
	//
	EpCertNo *string `json:"ep_cert_no,omitempty" xml:"ep_cert_no,omitempty" require:"true"`
	// { "nation": "CN", //企业注册地址 "type": "LimitedCompany", //企业类型 "name": "演示用户名", //必选字段，企业名 "licenceNo": "1111", //营业执照 "address": "1111", //企业地址 "parentName": "", //<-必选字段 业务方名 需要提前协商 "linkType": "indirect", //<- 连接类型，direct直链企业， indirect间链企业 "certifyDate": "2019-1-1", //证书颁发时间 "licenceExpireDate": "2020-1-1", //证书到期时间 "businessScope": "1111", //企业经营范围 "businessAddress": "1111", //企业经营地址 "corporateBusinessType": 0, //<- 企业类型：0 一般企业， 1 个人商户 "channelName": "" //<- 必选字段 业务渠道 需要提前沟通 }
	//
	ExtensionInfo *string `json:"extension_info,omitempty" xml:"extension_info,omitempty"`
	// 法人姓名
	//
	LegalPersonCertName *string `json:"legal_person_cert_name,omitempty" xml:"legal_person_cert_name,omitempty" require:"true"`
	// 法人身份证件号
	LegalPersonCertNo *string `json:"legal_person_cert_no,omitempty" xml:"legal_person_cert_no,omitempty" require:"true"`
	// 名称
	//
	OwnerName *string `json:"owner_name,omitempty" xml:"owner_name,omitempty"`
	// 自定义企业唯一id，企业在自有模式下的唯一号，调用者需要保证其唯一性
	OwnerUid *string `json:"owner_uid,omitempty" xml:"owner_uid,omitempty" require:"true"`
	// 场景码，找dis工作人员进行分配
	BizCode *string `json:"biz_code,omitempty" xml:"biz_code,omitempty"`
	// 生成的did
	//
	Did *string `json:"did,omitempty" xml:"did,omitempty"`
	// 颁发的vcId
	//
	VcId *string `json:"vc_id,omitempty" xml:"vc_id,omitempty"`
}

func (s CreateBaasDidCorporateWithfourmetaRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateBaasDidCorporateWithfourmetaRequest) GoString() string {
	return s.String()
}

func (s *CreateBaasDidCorporateWithfourmetaRequest) SetAuthToken(v string) *CreateBaasDidCorporateWithfourmetaRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateBaasDidCorporateWithfourmetaRequest) SetProductInstanceId(v string) *CreateBaasDidCorporateWithfourmetaRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateBaasDidCorporateWithfourmetaRequest) SetEpCertName(v string) *CreateBaasDidCorporateWithfourmetaRequest {
	s.EpCertName = &v
	return s
}

func (s *CreateBaasDidCorporateWithfourmetaRequest) SetEpCertNo(v string) *CreateBaasDidCorporateWithfourmetaRequest {
	s.EpCertNo = &v
	return s
}

func (s *CreateBaasDidCorporateWithfourmetaRequest) SetExtensionInfo(v string) *CreateBaasDidCorporateWithfourmetaRequest {
	s.ExtensionInfo = &v
	return s
}

func (s *CreateBaasDidCorporateWithfourmetaRequest) SetLegalPersonCertName(v string) *CreateBaasDidCorporateWithfourmetaRequest {
	s.LegalPersonCertName = &v
	return s
}

func (s *CreateBaasDidCorporateWithfourmetaRequest) SetLegalPersonCertNo(v string) *CreateBaasDidCorporateWithfourmetaRequest {
	s.LegalPersonCertNo = &v
	return s
}

func (s *CreateBaasDidCorporateWithfourmetaRequest) SetOwnerName(v string) *CreateBaasDidCorporateWithfourmetaRequest {
	s.OwnerName = &v
	return s
}

func (s *CreateBaasDidCorporateWithfourmetaRequest) SetOwnerUid(v string) *CreateBaasDidCorporateWithfourmetaRequest {
	s.OwnerUid = &v
	return s
}

func (s *CreateBaasDidCorporateWithfourmetaRequest) SetBizCode(v string) *CreateBaasDidCorporateWithfourmetaRequest {
	s.BizCode = &v
	return s
}

func (s *CreateBaasDidCorporateWithfourmetaRequest) SetDid(v string) *CreateBaasDidCorporateWithfourmetaRequest {
	s.Did = &v
	return s
}

func (s *CreateBaasDidCorporateWithfourmetaRequest) SetVcId(v string) *CreateBaasDidCorporateWithfourmetaRequest {
	s.VcId = &v
	return s
}

type CreateBaasDidCorporateWithfourmetaResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 生成的did
	//
	Did *string `json:"did,omitempty" xml:"did,omitempty"`
	// 颁发的vcId
	//
	VcId *string `json:"vc_id,omitempty" xml:"vc_id,omitempty"`
}

func (s CreateBaasDidCorporateWithfourmetaResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateBaasDidCorporateWithfourmetaResponse) GoString() string {
	return s.String()
}

func (s *CreateBaasDidCorporateWithfourmetaResponse) SetReqMsgId(v string) *CreateBaasDidCorporateWithfourmetaResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateBaasDidCorporateWithfourmetaResponse) SetResultCode(v string) *CreateBaasDidCorporateWithfourmetaResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateBaasDidCorporateWithfourmetaResponse) SetResultMsg(v string) *CreateBaasDidCorporateWithfourmetaResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateBaasDidCorporateWithfourmetaResponse) SetDid(v string) *CreateBaasDidCorporateWithfourmetaResponse {
	s.Did = &v
	return s
}

func (s *CreateBaasDidCorporateWithfourmetaResponse) SetVcId(v string) *CreateBaasDidCorporateWithfourmetaResponse {
	s.VcId = &v
	return s
}

type CreateBaasDidPersonWithfourmetaRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 银行卡号
	BankCard *string `json:"bank_card,omitempty" xml:"bank_card,omitempty" require:"true"`
	// 身份证号码
	//
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty" require:"true"`
	// 扩展字段
	//
	ExtensionInfo *string `json:"extension_info,omitempty" xml:"extension_info,omitempty"`
	// 手机号码
	//
	Mobile *string `json:"mobile,omitempty" xml:"mobile,omitempty" require:"true"`
	// 姓名
	//
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 名称
	//
	OwnerName *string `json:"owner_name,omitempty" xml:"owner_name,omitempty"`
	// 自定义个人唯一id，个人在自有模式下的唯一号，调用者需要保证其唯一性
	OwnerUid *string `json:"owner_uid,omitempty" xml:"owner_uid,omitempty" require:"true"`
	// 场景码，找dis工作人员进行分配
	BizCode *string `json:"biz_code,omitempty" xml:"biz_code,omitempty"`
	// 生成的did字符串
	//
	Did *string `json:"did,omitempty" xml:"did,omitempty"`
	// 颁发的vcId
	//
	VcId *string `json:"vc_id,omitempty" xml:"vc_id,omitempty"`
}

func (s CreateBaasDidPersonWithfourmetaRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateBaasDidPersonWithfourmetaRequest) GoString() string {
	return s.String()
}

func (s *CreateBaasDidPersonWithfourmetaRequest) SetAuthToken(v string) *CreateBaasDidPersonWithfourmetaRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateBaasDidPersonWithfourmetaRequest) SetProductInstanceId(v string) *CreateBaasDidPersonWithfourmetaRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateBaasDidPersonWithfourmetaRequest) SetBankCard(v string) *CreateBaasDidPersonWithfourmetaRequest {
	s.BankCard = &v
	return s
}

func (s *CreateBaasDidPersonWithfourmetaRequest) SetCertNo(v string) *CreateBaasDidPersonWithfourmetaRequest {
	s.CertNo = &v
	return s
}

func (s *CreateBaasDidPersonWithfourmetaRequest) SetExtensionInfo(v string) *CreateBaasDidPersonWithfourmetaRequest {
	s.ExtensionInfo = &v
	return s
}

func (s *CreateBaasDidPersonWithfourmetaRequest) SetMobile(v string) *CreateBaasDidPersonWithfourmetaRequest {
	s.Mobile = &v
	return s
}

func (s *CreateBaasDidPersonWithfourmetaRequest) SetName(v string) *CreateBaasDidPersonWithfourmetaRequest {
	s.Name = &v
	return s
}

func (s *CreateBaasDidPersonWithfourmetaRequest) SetOwnerName(v string) *CreateBaasDidPersonWithfourmetaRequest {
	s.OwnerName = &v
	return s
}

func (s *CreateBaasDidPersonWithfourmetaRequest) SetOwnerUid(v string) *CreateBaasDidPersonWithfourmetaRequest {
	s.OwnerUid = &v
	return s
}

func (s *CreateBaasDidPersonWithfourmetaRequest) SetBizCode(v string) *CreateBaasDidPersonWithfourmetaRequest {
	s.BizCode = &v
	return s
}

func (s *CreateBaasDidPersonWithfourmetaRequest) SetDid(v string) *CreateBaasDidPersonWithfourmetaRequest {
	s.Did = &v
	return s
}

func (s *CreateBaasDidPersonWithfourmetaRequest) SetVcId(v string) *CreateBaasDidPersonWithfourmetaRequest {
	s.VcId = &v
	return s
}

type CreateBaasDidPersonWithfourmetaResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 生成的did字符串
	//
	Did *string `json:"did,omitempty" xml:"did,omitempty"`
	// 颁发的vcId
	//
	VcId *string `json:"vc_id,omitempty" xml:"vc_id,omitempty"`
}

func (s CreateBaasDidPersonWithfourmetaResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateBaasDidPersonWithfourmetaResponse) GoString() string {
	return s.String()
}

func (s *CreateBaasDidPersonWithfourmetaResponse) SetReqMsgId(v string) *CreateBaasDidPersonWithfourmetaResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateBaasDidPersonWithfourmetaResponse) SetResultCode(v string) *CreateBaasDidPersonWithfourmetaResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateBaasDidPersonWithfourmetaResponse) SetResultMsg(v string) *CreateBaasDidPersonWithfourmetaResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateBaasDidPersonWithfourmetaResponse) SetDid(v string) *CreateBaasDidPersonWithfourmetaResponse {
	s.Did = &v
	return s
}

func (s *CreateBaasDidPersonWithfourmetaResponse) SetVcId(v string) *CreateBaasDidPersonWithfourmetaResponse {
	s.VcId = &v
	return s
}

type StartBaasDidCorporateFaceauthRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 回调通知地址
	CallBackUrl *string `json:"call_back_url,omitempty" xml:"call_back_url,omitempty"`
	// 企业名称
	EpCertName *string `json:"ep_cert_name,omitempty" xml:"ep_cert_name,omitempty" require:"true"`
	// 企业证件号
	EpCertNo *string `json:"ep_cert_no,omitempty" xml:"ep_cert_no,omitempty" require:"true"`
	// 企业证件类型（NATIONAL_LEGAL（工商注册号）或 NATIONAL_LEGAL_MERGE （ 社会统一信用代码））
	EpCertType *string `json:"ep_cert_type,omitempty" xml:"ep_cert_type,omitempty" require:"true"`
	// { "nation": "CN", //企业注册地址 "type": "LimitedCompany", //企业类型 "name": "演示用户名", //必选字段，企业名 "licenceNo": "1111", //营业执照 "address": "1111", //企业地址 "parentName": "", //<-必选字段 业务方名 需要提前协商 "linkType": "indirect", //<- 连接类型，direct直链企业， indirect间链企业 "certifyDate": "2019-1-1", //证书颁发时间 "licenceExpireDate": "2020-1-1", //证书到期时间 "businessScope": "1111", //企业经营范围 "businessAddress": "1111", //企业经营地址 "corporateBusinessType": 0, //<- 企业类型：0 一般企业， 1 个人商户 "channelName": "" //<- 必选字段 业务渠道 需要提前沟通 }
	ExtensionInfo *string `json:"extension_info,omitempty" xml:"extension_info,omitempty"`
	// 企业法人
	LegalPersonCertName *string `json:"legal_person_cert_name,omitempty" xml:"legal_person_cert_name,omitempty" require:"true"`
	// 法人身份证号
	LegalPersonCertNo *string `json:"legal_person_cert_no,omitempty" xml:"legal_person_cert_no,omitempty" require:"true"`
	// 认证完成后回跳地址
	MerchantUrl *string `json:"merchant_url,omitempty" xml:"merchant_url,omitempty"`
	// 名称
	OwnerName *string `json:"owner_name,omitempty" xml:"owner_name,omitempty"`
	// 自定义企业唯一id，企业在自有模式下的唯一号，调用者需要保证其唯一性
	OwnerUid *string `json:"owner_uid,omitempty" xml:"owner_uid,omitempty"`
	// 场景码，找dis工作人员进行分配
	BizCode *string `json:"biz_code,omitempty" xml:"biz_code,omitempty"`
	// 产品渲染方式：H5、NATIVE 或 PC, 默认为H5
	Group *string `json:"group,omitempty" xml:"group,omitempty"`
	// 认证ID
	CertifyId *string `json:"certify_id,omitempty" xml:"certify_id,omitempty"`
	// 二维码URL，用户支付宝扫一扫实人认证
	CertifyUrl *string `json:"certify_url,omitempty" xml:"certify_url,omitempty"`
}

func (s StartBaasDidCorporateFaceauthRequest) String() string {
	return tea.Prettify(s)
}

func (s StartBaasDidCorporateFaceauthRequest) GoString() string {
	return s.String()
}

func (s *StartBaasDidCorporateFaceauthRequest) SetAuthToken(v string) *StartBaasDidCorporateFaceauthRequest {
	s.AuthToken = &v
	return s
}

func (s *StartBaasDidCorporateFaceauthRequest) SetProductInstanceId(v string) *StartBaasDidCorporateFaceauthRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *StartBaasDidCorporateFaceauthRequest) SetCallBackUrl(v string) *StartBaasDidCorporateFaceauthRequest {
	s.CallBackUrl = &v
	return s
}

func (s *StartBaasDidCorporateFaceauthRequest) SetEpCertName(v string) *StartBaasDidCorporateFaceauthRequest {
	s.EpCertName = &v
	return s
}

func (s *StartBaasDidCorporateFaceauthRequest) SetEpCertNo(v string) *StartBaasDidCorporateFaceauthRequest {
	s.EpCertNo = &v
	return s
}

func (s *StartBaasDidCorporateFaceauthRequest) SetEpCertType(v string) *StartBaasDidCorporateFaceauthRequest {
	s.EpCertType = &v
	return s
}

func (s *StartBaasDidCorporateFaceauthRequest) SetExtensionInfo(v string) *StartBaasDidCorporateFaceauthRequest {
	s.ExtensionInfo = &v
	return s
}

func (s *StartBaasDidCorporateFaceauthRequest) SetLegalPersonCertName(v string) *StartBaasDidCorporateFaceauthRequest {
	s.LegalPersonCertName = &v
	return s
}

func (s *StartBaasDidCorporateFaceauthRequest) SetLegalPersonCertNo(v string) *StartBaasDidCorporateFaceauthRequest {
	s.LegalPersonCertNo = &v
	return s
}

func (s *StartBaasDidCorporateFaceauthRequest) SetMerchantUrl(v string) *StartBaasDidCorporateFaceauthRequest {
	s.MerchantUrl = &v
	return s
}

func (s *StartBaasDidCorporateFaceauthRequest) SetOwnerName(v string) *StartBaasDidCorporateFaceauthRequest {
	s.OwnerName = &v
	return s
}

func (s *StartBaasDidCorporateFaceauthRequest) SetOwnerUid(v string) *StartBaasDidCorporateFaceauthRequest {
	s.OwnerUid = &v
	return s
}

func (s *StartBaasDidCorporateFaceauthRequest) SetBizCode(v string) *StartBaasDidCorporateFaceauthRequest {
	s.BizCode = &v
	return s
}

func (s *StartBaasDidCorporateFaceauthRequest) SetGroup(v string) *StartBaasDidCorporateFaceauthRequest {
	s.Group = &v
	return s
}

func (s *StartBaasDidCorporateFaceauthRequest) SetCertifyId(v string) *StartBaasDidCorporateFaceauthRequest {
	s.CertifyId = &v
	return s
}

func (s *StartBaasDidCorporateFaceauthRequest) SetCertifyUrl(v string) *StartBaasDidCorporateFaceauthRequest {
	s.CertifyUrl = &v
	return s
}

type StartBaasDidCorporateFaceauthResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 认证ID
	CertifyId *string `json:"certify_id,omitempty" xml:"certify_id,omitempty"`
	// 二维码URL，用户支付宝扫一扫实人认证
	CertifyUrl *string `json:"certify_url,omitempty" xml:"certify_url,omitempty"`
}

func (s StartBaasDidCorporateFaceauthResponse) String() string {
	return tea.Prettify(s)
}

func (s StartBaasDidCorporateFaceauthResponse) GoString() string {
	return s.String()
}

func (s *StartBaasDidCorporateFaceauthResponse) SetReqMsgId(v string) *StartBaasDidCorporateFaceauthResponse {
	s.ReqMsgId = &v
	return s
}

func (s *StartBaasDidCorporateFaceauthResponse) SetResultCode(v string) *StartBaasDidCorporateFaceauthResponse {
	s.ResultCode = &v
	return s
}

func (s *StartBaasDidCorporateFaceauthResponse) SetResultMsg(v string) *StartBaasDidCorporateFaceauthResponse {
	s.ResultMsg = &v
	return s
}

func (s *StartBaasDidCorporateFaceauthResponse) SetCertifyId(v string) *StartBaasDidCorporateFaceauthResponse {
	s.CertifyId = &v
	return s
}

func (s *StartBaasDidCorporateFaceauthResponse) SetCertifyUrl(v string) *StartBaasDidCorporateFaceauthResponse {
	s.CertifyUrl = &v
	return s
}

type QueryBaasDidCorporateFaceauthRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 认证ID，用于查询认证结果
	//
	CertifyId *string `json:"certify_id,omitempty" xml:"certify_id,omitempty" require:"true"`
	// 场景码，找dis工作人员进行分配
	BizCode *string `json:"biz_code,omitempty" xml:"biz_code,omitempty"`
	// 产品渲染方式：H5、NATIVE 或 PC
	Group *string `json:"group,omitempty" xml:"group,omitempty"`
	// 生成的did
	Did *string `json:"did,omitempty" xml:"did,omitempty"`
	// vc id，可通过该字符串来查询vc具体内容
	VcId *string `json:"vc_id,omitempty" xml:"vc_id,omitempty"`
}

func (s QueryBaasDidCorporateFaceauthRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasDidCorporateFaceauthRequest) GoString() string {
	return s.String()
}

func (s *QueryBaasDidCorporateFaceauthRequest) SetAuthToken(v string) *QueryBaasDidCorporateFaceauthRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryBaasDidCorporateFaceauthRequest) SetProductInstanceId(v string) *QueryBaasDidCorporateFaceauthRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryBaasDidCorporateFaceauthRequest) SetCertifyId(v string) *QueryBaasDidCorporateFaceauthRequest {
	s.CertifyId = &v
	return s
}

func (s *QueryBaasDidCorporateFaceauthRequest) SetBizCode(v string) *QueryBaasDidCorporateFaceauthRequest {
	s.BizCode = &v
	return s
}

func (s *QueryBaasDidCorporateFaceauthRequest) SetGroup(v string) *QueryBaasDidCorporateFaceauthRequest {
	s.Group = &v
	return s
}

func (s *QueryBaasDidCorporateFaceauthRequest) SetDid(v string) *QueryBaasDidCorporateFaceauthRequest {
	s.Did = &v
	return s
}

func (s *QueryBaasDidCorporateFaceauthRequest) SetVcId(v string) *QueryBaasDidCorporateFaceauthRequest {
	s.VcId = &v
	return s
}

type QueryBaasDidCorporateFaceauthResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 生成的did
	Did *string `json:"did,omitempty" xml:"did,omitempty"`
	// vc id，可通过该字符串来查询vc具体内容
	VcId *string `json:"vc_id,omitempty" xml:"vc_id,omitempty"`
}

func (s QueryBaasDidCorporateFaceauthResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryBaasDidCorporateFaceauthResponse) GoString() string {
	return s.String()
}

func (s *QueryBaasDidCorporateFaceauthResponse) SetReqMsgId(v string) *QueryBaasDidCorporateFaceauthResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryBaasDidCorporateFaceauthResponse) SetResultCode(v string) *QueryBaasDidCorporateFaceauthResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryBaasDidCorporateFaceauthResponse) SetResultMsg(v string) *QueryBaasDidCorporateFaceauthResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryBaasDidCorporateFaceauthResponse) SetDid(v string) *QueryBaasDidCorporateFaceauthResponse {
	s.Did = &v
	return s
}

func (s *QueryBaasDidCorporateFaceauthResponse) SetVcId(v string) *QueryBaasDidCorporateFaceauthResponse {
	s.VcId = &v
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
				"sdk_version":      tea.String("1.0.3"),
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
 * Description: 通过代理模式为企业创建did
 * Summary: 通过代理模式为企业创建did
 */
func (client *Client) StartBaasDidCorporateAgentcreate(request *StartBaasDidCorporateAgentcreateRequest) (_result *StartBaasDidCorporateAgentcreateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &StartBaasDidCorporateAgentcreateResponse{}
	_body, _err := client.StartBaasDidCorporateAgentcreateEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 通过代理模式为企业创建did
 * Summary: 通过代理模式为企业创建did
 */
func (client *Client) StartBaasDidCorporateAgentcreateEx(request *StartBaasDidCorporateAgentcreateRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *StartBaasDidCorporateAgentcreateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &StartBaasDidCorporateAgentcreateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.did.corporate.agentcreate.start"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 通过代理模式为个人创建did
 * Summary: 通过代理模式为个人创建did
 */
func (client *Client) StartBaasDidPersonAgentcreate(request *StartBaasDidPersonAgentcreateRequest) (_result *StartBaasDidPersonAgentcreateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &StartBaasDidPersonAgentcreateResponse{}
	_body, _err := client.StartBaasDidPersonAgentcreateEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 通过代理模式为个人创建did
 * Summary: 通过代理模式为个人创建did
 */
func (client *Client) StartBaasDidPersonAgentcreateEx(request *StartBaasDidPersonAgentcreateRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *StartBaasDidPersonAgentcreateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &StartBaasDidPersonAgentcreateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.did.person.agentcreate.start"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 直接创建自己的企业did
 * Summary: 直接创建自己的企业did
 */
func (client *Client) StartBaasDidCorporateSelfcreate(request *StartBaasDidCorporateSelfcreateRequest) (_result *StartBaasDidCorporateSelfcreateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &StartBaasDidCorporateSelfcreateResponse{}
	_body, _err := client.StartBaasDidCorporateSelfcreateEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 直接创建自己的企业did
 * Summary: 直接创建自己的企业did
 */
func (client *Client) StartBaasDidCorporateSelfcreateEx(request *StartBaasDidCorporateSelfcreateRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *StartBaasDidCorporateSelfcreateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &StartBaasDidCorporateSelfcreateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.did.corporate.selfcreate.start"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 使用自己或者代理的did为指定did颁发证书
 * Summary: 为指定did颁发证书
 */
func (client *Client) StartBaasDidVerifiableclaimIssure(request *StartBaasDidVerifiableclaimIssureRequest) (_result *StartBaasDidVerifiableclaimIssureResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &StartBaasDidVerifiableclaimIssureResponse{}
	_body, _err := client.StartBaasDidVerifiableclaimIssureEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 使用自己或者代理的did为指定did颁发证书
 * Summary: 为指定did颁发证书
 */
func (client *Client) StartBaasDidVerifiableclaimIssureEx(request *StartBaasDidVerifiableclaimIssureRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *StartBaasDidVerifiableclaimIssureResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &StartBaasDidVerifiableclaimIssureResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.did.verifiableclaim.issure.start"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 验证可验证声明
 * Summary: 验证可验证声明
 */
func (client *Client) StartBaasDidVerifiableclaimVerifier(request *StartBaasDidVerifiableclaimVerifierRequest) (_result *StartBaasDidVerifiableclaimVerifierResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &StartBaasDidVerifiableclaimVerifierResponse{}
	_body, _err := client.StartBaasDidVerifiableclaimVerifierEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 验证可验证声明
 * Summary: 验证可验证声明
 */
func (client *Client) StartBaasDidVerifiableclaimVerifierEx(request *StartBaasDidVerifiableclaimVerifierRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *StartBaasDidVerifiableclaimVerifierResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &StartBaasDidVerifiableclaimVerifierResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.did.verifiableclaim.verifier.start"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 通过vcid查询vc内容
 * Summary: 通过vcid查询vc内容
 */
func (client *Client) QueryBaasDidVc(request *QueryBaasDidVcRequest) (_result *QueryBaasDidVcResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryBaasDidVcResponse{}
	_body, _err := client.QueryBaasDidVcEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 通过vcid查询vc内容
 * Summary: 通过vcid查询vc内容
 */
func (client *Client) QueryBaasDidVcEx(request *QueryBaasDidVcRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryBaasDidVcResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryBaasDidVcResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.did.vc.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 开始实人认证
 * Summary: 开始实人认证
 */
func (client *Client) StartBaasDidIdentificationFaceauth(request *StartBaasDidIdentificationFaceauthRequest) (_result *StartBaasDidIdentificationFaceauthResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &StartBaasDidIdentificationFaceauthResponse{}
	_body, _err := client.StartBaasDidIdentificationFaceauthEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 开始实人认证
 * Summary: 开始实人认证
 */
func (client *Client) StartBaasDidIdentificationFaceauthEx(request *StartBaasDidIdentificationFaceauthRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *StartBaasDidIdentificationFaceauthResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &StartBaasDidIdentificationFaceauthResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.did.identification.faceauth.start"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询实人认证结果
 * Summary: 查询实人认证结果
 */
func (client *Client) QueryBaasDidIdentificationFaceauth(request *QueryBaasDidIdentificationFaceauthRequest) (_result *QueryBaasDidIdentificationFaceauthResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryBaasDidIdentificationFaceauthResponse{}
	_body, _err := client.QueryBaasDidIdentificationFaceauthEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询实人认证结果
 * Summary: 查询实人认证结果
 */
func (client *Client) QueryBaasDidIdentificationFaceauthEx(request *QueryBaasDidIdentificationFaceauthRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryBaasDidIdentificationFaceauthResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryBaasDidIdentificationFaceauthResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.did.identification.faceauth.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 通过个人三要素验证后创建个人did，若未通过个人三要素验证，则不创建did并报错
 * Summary: 通过个人三要素验证后创建个人did
 */
func (client *Client) CreateBaasDidPersonWiththreemeta(request *CreateBaasDidPersonWiththreemetaRequest) (_result *CreateBaasDidPersonWiththreemetaResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateBaasDidPersonWiththreemetaResponse{}
	_body, _err := client.CreateBaasDidPersonWiththreemetaEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 通过个人三要素验证后创建个人did，若未通过个人三要素验证，则不创建did并报错
 * Summary: 通过个人三要素验证后创建个人did
 */
func (client *Client) CreateBaasDidPersonWiththreemetaEx(request *CreateBaasDidPersonWiththreemetaRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateBaasDidPersonWiththreemetaResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateBaasDidPersonWiththreemetaResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.did.person.withthreemeta.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 通过企业三要素验证后创建企业did，若未通过企业三要素验证，则不创建did并报错
 * Summary: 通过企业三要素验证后创建企业did
 */
func (client *Client) CreateBaasDidCorporateWiththreemeta(request *CreateBaasDidCorporateWiththreemetaRequest) (_result *CreateBaasDidCorporateWiththreemetaResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateBaasDidCorporateWiththreemetaResponse{}
	_body, _err := client.CreateBaasDidCorporateWiththreemetaEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 通过企业三要素验证后创建企业did，若未通过企业三要素验证，则不创建did并报错
 * Summary: 通过企业三要素验证后创建企业did
 */
func (client *Client) CreateBaasDidCorporateWiththreemetaEx(request *CreateBaasDidCorporateWiththreemetaRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateBaasDidCorporateWiththreemetaResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateBaasDidCorporateWiththreemetaResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.did.corporate.withthreemeta.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 使用自己或者代理的did为指定did颁发证书，同时在VC Repository中对证书VC进行存储。
支持授权管理，只有被授权的did未来才可以访问获取此颁发的证书数据。
 * Summary: 指定did颁发证书，并存储
*/
func (client *Client) StartBaasDidVcrepositoryIssue(request *StartBaasDidVcrepositoryIssueRequest) (_result *StartBaasDidVcrepositoryIssueResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &StartBaasDidVcrepositoryIssueResponse{}
	_body, _err := client.StartBaasDidVcrepositoryIssueEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 使用自己或者代理的did为指定did颁发证书，同时在VC Repository中对证书VC进行存储。
支持授权管理，只有被授权的did未来才可以访问获取此颁发的证书数据。
 * Summary: 指定did颁发证书，并存储
*/
func (client *Client) StartBaasDidVcrepositoryIssueEx(request *StartBaasDidVcrepositoryIssueRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *StartBaasDidVcrepositoryIssueResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &StartBaasDidVcrepositoryIssueResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.did.vcrepository.issue.start"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 注册自定义的服务类型，目前只有租户did可以调用
 * Summary: 注册自定义服务类型
 */
func (client *Client) StartBaasDidAgentServicetype(request *StartBaasDidAgentServicetypeRequest) (_result *StartBaasDidAgentServicetypeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &StartBaasDidAgentServicetypeResponse{}
	_body, _err := client.StartBaasDidAgentServicetypeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 注册自定义的服务类型，目前只有租户did可以调用
 * Summary: 注册自定义服务类型
 */
func (client *Client) StartBaasDidAgentServicetypeEx(request *StartBaasDidAgentServicetypeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *StartBaasDidAgentServicetypeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &StartBaasDidAgentServicetypeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.did.agent.servicetype.start"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询指定服务类型的定义，不支持全量查询
 * Summary: 查询指定服务类型的定义
 */
func (client *Client) QueryBaasDidAgentServicetype(request *QueryBaasDidAgentServicetypeRequest) (_result *QueryBaasDidAgentServicetypeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryBaasDidAgentServicetypeResponse{}
	_body, _err := client.QueryBaasDidAgentServicetypeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询指定服务类型的定义，不支持全量查询
 * Summary: 查询指定服务类型的定义
 */
func (client *Client) QueryBaasDidAgentServicetypeEx(request *QueryBaasDidAgentServicetypeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryBaasDidAgentServicetypeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryBaasDidAgentServicetypeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.did.agent.servicetype.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 代理模式下更新企业did doc中service中的字段
 * Summary: 代理更新企业did中的services
 */
func (client *Client) UpdateBaasDidServices(request *UpdateBaasDidServicesRequest) (_result *UpdateBaasDidServicesResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateBaasDidServicesResponse{}
	_body, _err := client.UpdateBaasDidServicesEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 代理模式下更新企业did doc中service中的字段
 * Summary: 代理更新企业did中的services
 */
func (client *Client) UpdateBaasDidServicesEx(request *UpdateBaasDidServicesRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateBaasDidServicesResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateBaasDidServicesResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.did.services.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 通过个人二要素验证后创建个人did，若未通过个人二要素验证，则不创建did并报错
 * Summary: 通过个人二要素验证后创建个人did
 */
func (client *Client) CreateBaasDidPersonWithtwometa(request *CreateBaasDidPersonWithtwometaRequest) (_result *CreateBaasDidPersonWithtwometaResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateBaasDidPersonWithtwometaResponse{}
	_body, _err := client.CreateBaasDidPersonWithtwometaEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 通过个人二要素验证后创建个人did，若未通过个人二要素验证，则不创建did并报错
 * Summary: 通过个人二要素验证后创建个人did
 */
func (client *Client) CreateBaasDidPersonWithtwometaEx(request *CreateBaasDidPersonWithtwometaRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateBaasDidPersonWithtwometaResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateBaasDidPersonWithtwometaResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.did.person.withtwometa.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 通过企业二要素验证后创建企业did
 * Summary: 通过企业二要素验证后创建企业did
 */
func (client *Client) CreateBaasDidCorporateWithtwometa(request *CreateBaasDidCorporateWithtwometaRequest) (_result *CreateBaasDidCorporateWithtwometaResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateBaasDidCorporateWithtwometaResponse{}
	_body, _err := client.CreateBaasDidCorporateWithtwometaEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 通过企业二要素验证后创建企业did
 * Summary: 通过企业二要素验证后创建企业did
 */
func (client *Client) CreateBaasDidCorporateWithtwometaEx(request *CreateBaasDidCorporateWithtwometaRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateBaasDidCorporateWithtwometaResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateBaasDidCorporateWithtwometaResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.did.corporate.withtwometa.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 通过企业四要素验证后创建企业did
 * Summary: 通过企业四要素验证后创建企业did
 */
func (client *Client) CreateBaasDidCorporateWithfourmeta(request *CreateBaasDidCorporateWithfourmetaRequest) (_result *CreateBaasDidCorporateWithfourmetaResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateBaasDidCorporateWithfourmetaResponse{}
	_body, _err := client.CreateBaasDidCorporateWithfourmetaEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 通过企业四要素验证后创建企业did
 * Summary: 通过企业四要素验证后创建企业did
 */
func (client *Client) CreateBaasDidCorporateWithfourmetaEx(request *CreateBaasDidCorporateWithfourmetaRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateBaasDidCorporateWithfourmetaResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateBaasDidCorporateWithfourmetaResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.did.corporate.withfourmeta.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 通过个人四要素验证后创建个人did
 * Summary: 通过个人四要素验证后创建个人did
 */
func (client *Client) CreateBaasDidPersonWithfourmeta(request *CreateBaasDidPersonWithfourmetaRequest) (_result *CreateBaasDidPersonWithfourmetaResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateBaasDidPersonWithfourmetaResponse{}
	_body, _err := client.CreateBaasDidPersonWithfourmetaEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 通过个人四要素验证后创建个人did
 * Summary: 通过个人四要素验证后创建个人did
 */
func (client *Client) CreateBaasDidPersonWithfourmetaEx(request *CreateBaasDidPersonWithfourmetaRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateBaasDidPersonWithfourmetaResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateBaasDidPersonWithfourmetaResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.did.person.withfourmeta.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 企业法人刷脸认证
 * Summary: 企业法人刷脸认证
 */
func (client *Client) StartBaasDidCorporateFaceauth(request *StartBaasDidCorporateFaceauthRequest) (_result *StartBaasDidCorporateFaceauthResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &StartBaasDidCorporateFaceauthResponse{}
	_body, _err := client.StartBaasDidCorporateFaceauthEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 企业法人刷脸认证
 * Summary: 企业法人刷脸认证
 */
func (client *Client) StartBaasDidCorporateFaceauthEx(request *StartBaasDidCorporateFaceauthRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *StartBaasDidCorporateFaceauthResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &StartBaasDidCorporateFaceauthResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.did.corporate.faceauth.start"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询企业法人实人结果
 * Summary: 查询企业法人实人结果
 */
func (client *Client) QueryBaasDidCorporateFaceauth(request *QueryBaasDidCorporateFaceauthRequest) (_result *QueryBaasDidCorporateFaceauthResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryBaasDidCorporateFaceauthResponse{}
	_body, _err := client.QueryBaasDidCorporateFaceauthEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询企业法人实人结果
 * Summary: 查询企业法人实人结果
 */
func (client *Client) QueryBaasDidCorporateFaceauthEx(request *QueryBaasDidCorporateFaceauthRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryBaasDidCorporateFaceauthResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryBaasDidCorporateFaceauthResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("baas.did.corporate.faceauth.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
