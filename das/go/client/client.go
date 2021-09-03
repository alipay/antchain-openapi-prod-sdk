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

// 数据源接口入参定义
type InterfaceInput struct {
	// 接口入参名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" maxLength:"50"`
	// 接口入参类型
	Type *string `json:"type,omitempty" xml:"type,omitempty" maxLength:"50"`
	// 接口入参描述
	Description *string `json:"description,omitempty" xml:"description,omitempty" maxLength:"100"`
	// 接口入参是否必填
	Required *bool `json:"required,omitempty" xml:"required,omitempty"`
}

func (s InterfaceInput) String() string {
	return tea.Prettify(s)
}

func (s InterfaceInput) GoString() string {
	return s.String()
}

func (s *InterfaceInput) SetName(v string) *InterfaceInput {
	s.Name = &v
	return s
}

func (s *InterfaceInput) SetType(v string) *InterfaceInput {
	s.Type = &v
	return s
}

func (s *InterfaceInput) SetDescription(v string) *InterfaceInput {
	s.Description = &v
	return s
}

func (s *InterfaceInput) SetRequired(v bool) *InterfaceInput {
	s.Required = &v
	return s
}

// 数据源接口出参定义
type InterfaceOutput struct {
	// 接口出参名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" maxLength:"50"`
	// 接口出参类型
	Type *string `json:"type,omitempty" xml:"type,omitempty" maxLength:"50"`
	// 接口出参描述
	Description *string `json:"description,omitempty" xml:"description,omitempty" maxLength:"100"`
}

func (s InterfaceOutput) String() string {
	return tea.Prettify(s)
}

func (s InterfaceOutput) GoString() string {
	return s.String()
}

func (s *InterfaceOutput) SetName(v string) *InterfaceOutput {
	s.Name = &v
	return s
}

func (s *InterfaceOutput) SetType(v string) *InterfaceOutput {
	s.Type = &v
	return s
}

func (s *InterfaceOutput) SetDescription(v string) *InterfaceOutput {
	s.Description = &v
	return s
}

// 数据源接口定义
type DataSourceInterface struct {
	// 数据源接口访问地址
	Address *string `json:"address,omitempty" xml:"address,omitempty" require:"true" maxLength:"100"`
	// 数据源接口请求方法类型
	InterfaceRequestMethod *string `json:"interface_request_method,omitempty" xml:"interface_request_method,omitempty" require:"true" maxLength:"50"`
	// 数据源接口入参列表
	InterfaceInput []*InterfaceInput `json:"interface_input,omitempty" xml:"interface_input,omitempty" type:"Repeated"`
	// 数据源接口出参列表
	InterfaceOutput []*InterfaceOutput `json:"interface_output,omitempty" xml:"interface_output,omitempty" type:"Repeated"`
}

func (s DataSourceInterface) String() string {
	return tea.Prettify(s)
}

func (s DataSourceInterface) GoString() string {
	return s.String()
}

func (s *DataSourceInterface) SetAddress(v string) *DataSourceInterface {
	s.Address = &v
	return s
}

func (s *DataSourceInterface) SetInterfaceRequestMethod(v string) *DataSourceInterface {
	s.InterfaceRequestMethod = &v
	return s
}

func (s *DataSourceInterface) SetInterfaceInput(v []*InterfaceInput) *DataSourceInterface {
	s.InterfaceInput = v
	return s
}

func (s *DataSourceInterface) SetInterfaceOutput(v []*InterfaceOutput) *DataSourceInterface {
	s.InterfaceOutput = v
	return s
}

// 授权人个人信息
type AuthPersonIndividualInfo struct {
	// 姓名
	IndividualName *string `json:"individual_name,omitempty" xml:"individual_name,omitempty" require:"true"`
	// 身份证号
	IndividualId *string `json:"individual_id,omitempty" xml:"individual_id,omitempty" require:"true"`
	// 电话号码
	IndividualPhoneNum *int64 `json:"individual_phone_num,omitempty" xml:"individual_phone_num,omitempty" require:"true"`
}

func (s AuthPersonIndividualInfo) String() string {
	return tea.Prettify(s)
}

func (s AuthPersonIndividualInfo) GoString() string {
	return s.String()
}

func (s *AuthPersonIndividualInfo) SetIndividualName(v string) *AuthPersonIndividualInfo {
	s.IndividualName = &v
	return s
}

func (s *AuthPersonIndividualInfo) SetIndividualId(v string) *AuthPersonIndividualInfo {
	s.IndividualId = &v
	return s
}

func (s *AuthPersonIndividualInfo) SetIndividualPhoneNum(v int64) *AuthPersonIndividualInfo {
	s.IndividualPhoneNum = &v
	return s
}

// 数据源详细信息
type DataSourceInfo struct {
	// 数据源ID
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 数据源名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true" maxLength:"20"`
	// 数据提供方
	Provider *string `json:"provider,omitempty" xml:"provider,omitempty" require:"true" maxLength:"30"`
	// 枚举值：ENTERPRISE、INDIVIDUAL
	DataOwnerType *string `json:"data_owner_type,omitempty" xml:"data_owner_type,omitempty" require:"true"`
	// 数据源接口信息
	DataSourceInterfaceInfo *DataSourceInterface `json:"data_source_interface_info,omitempty" xml:"data_source_interface_info,omitempty" require:"true"`
}

func (s DataSourceInfo) String() string {
	return tea.Prettify(s)
}

func (s DataSourceInfo) GoString() string {
	return s.String()
}

func (s *DataSourceInfo) SetId(v string) *DataSourceInfo {
	s.Id = &v
	return s
}

func (s *DataSourceInfo) SetName(v string) *DataSourceInfo {
	s.Name = &v
	return s
}

func (s *DataSourceInfo) SetProvider(v string) *DataSourceInfo {
	s.Provider = &v
	return s
}

func (s *DataSourceInfo) SetDataOwnerType(v string) *DataSourceInfo {
	s.DataOwnerType = &v
	return s
}

func (s *DataSourceInfo) SetDataSourceInterfaceInfo(v *DataSourceInterface) *DataSourceInfo {
	s.DataSourceInterfaceInfo = v
	return s
}

// 授权人企业信息
type AuthPersonEnterpriseInfo struct {
	// 企业名称
	EnterpriseName *string `json:"enterprise_name,omitempty" xml:"enterprise_name,omitempty" require:"true"`
	// 企业统一社会信用码
	EnterpriseCreditNum *string `json:"enterprise_credit_num,omitempty" xml:"enterprise_credit_num,omitempty" require:"true"`
	// 企业法人姓名
	EnterpriseLegalPersonName *string `json:"enterprise_legal_person_name,omitempty" xml:"enterprise_legal_person_name,omitempty" require:"true"`
	// 企业法人身份证号
	EnterpriseLegalPersonId *string `json:"enterprise_legal_person_id,omitempty" xml:"enterprise_legal_person_id,omitempty" require:"true"`
	// 企业法人电话号码
	EnterpriseLegalPersonPhoneNum *int64 `json:"enterprise_legal_person_phone_num,omitempty" xml:"enterprise_legal_person_phone_num,omitempty" require:"true"`
}

func (s AuthPersonEnterpriseInfo) String() string {
	return tea.Prettify(s)
}

func (s AuthPersonEnterpriseInfo) GoString() string {
	return s.String()
}

func (s *AuthPersonEnterpriseInfo) SetEnterpriseName(v string) *AuthPersonEnterpriseInfo {
	s.EnterpriseName = &v
	return s
}

func (s *AuthPersonEnterpriseInfo) SetEnterpriseCreditNum(v string) *AuthPersonEnterpriseInfo {
	s.EnterpriseCreditNum = &v
	return s
}

func (s *AuthPersonEnterpriseInfo) SetEnterpriseLegalPersonName(v string) *AuthPersonEnterpriseInfo {
	s.EnterpriseLegalPersonName = &v
	return s
}

func (s *AuthPersonEnterpriseInfo) SetEnterpriseLegalPersonId(v string) *AuthPersonEnterpriseInfo {
	s.EnterpriseLegalPersonId = &v
	return s
}

func (s *AuthPersonEnterpriseInfo) SetEnterpriseLegalPersonPhoneNum(v int64) *AuthPersonEnterpriseInfo {
	s.EnterpriseLegalPersonPhoneNum = &v
	return s
}

// 被授权人信息
type BeAuthedPersonInfo struct {
	// 企业名称
	EnterpriseName *string `json:"enterprise_name,omitempty" xml:"enterprise_name,omitempty" require:"true"`
	// 企业统一社会信用码
	EnterpriseCreditNum *string `json:"enterprise_credit_num,omitempty" xml:"enterprise_credit_num,omitempty" require:"true"`
	// 企业法人姓名
	EnterpriseLegalPersonName *string `json:"enterprise_legal_person_name,omitempty" xml:"enterprise_legal_person_name,omitempty" require:"true"`
	// 企业法人身份证号
	EnterpriseLegalPersonId *string `json:"enterprise_legal_person_id,omitempty" xml:"enterprise_legal_person_id,omitempty" require:"true"`
}

func (s BeAuthedPersonInfo) String() string {
	return tea.Prettify(s)
}

func (s BeAuthedPersonInfo) GoString() string {
	return s.String()
}

func (s *BeAuthedPersonInfo) SetEnterpriseName(v string) *BeAuthedPersonInfo {
	s.EnterpriseName = &v
	return s
}

func (s *BeAuthedPersonInfo) SetEnterpriseCreditNum(v string) *BeAuthedPersonInfo {
	s.EnterpriseCreditNum = &v
	return s
}

func (s *BeAuthedPersonInfo) SetEnterpriseLegalPersonName(v string) *BeAuthedPersonInfo {
	s.EnterpriseLegalPersonName = &v
	return s
}

func (s *BeAuthedPersonInfo) SetEnterpriseLegalPersonId(v string) *BeAuthedPersonInfo {
	s.EnterpriseLegalPersonId = &v
	return s
}

// 数据源信息
type DataSource struct {
	// 数据源ID
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 数据源接口地址
	Address *string `json:"address,omitempty" xml:"address,omitempty" require:"true"`
}

func (s DataSource) String() string {
	return tea.Prettify(s)
}

func (s DataSource) GoString() string {
	return s.String()
}

func (s *DataSource) SetId(v string) *DataSource {
	s.Id = &v
	return s
}

func (s *DataSource) SetAddress(v string) *DataSource {
	s.Address = &v
	return s
}

type GetDasLinkRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 被授权人接入应用id
	BeAuthedPersonAppId *string `json:"be_authed_person_app_id,omitempty" xml:"be_authed_person_app_id,omitempty" require:"true"`
}

func (s GetDasLinkRequest) String() string {
	return tea.Prettify(s)
}

func (s GetDasLinkRequest) GoString() string {
	return s.String()
}

func (s *GetDasLinkRequest) SetAuthToken(v string) *GetDasLinkRequest {
	s.AuthToken = &v
	return s
}

func (s *GetDasLinkRequest) SetProductInstanceId(v string) *GetDasLinkRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetDasLinkRequest) SetBeAuthedPersonAppId(v string) *GetDasLinkRequest {
	s.BeAuthedPersonAppId = &v
	return s
}

type GetDasLinkResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// H5应用身份认证信息
	Token *string `json:"token,omitempty" xml:"token,omitempty"`
	// 带有token 信息的H5页面链接
	Link *string `json:"link,omitempty" xml:"link,omitempty"`
}

func (s GetDasLinkResponse) String() string {
	return tea.Prettify(s)
}

func (s GetDasLinkResponse) GoString() string {
	return s.String()
}

func (s *GetDasLinkResponse) SetReqMsgId(v string) *GetDasLinkResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetDasLinkResponse) SetResultCode(v string) *GetDasLinkResponse {
	s.ResultCode = &v
	return s
}

func (s *GetDasLinkResponse) SetResultMsg(v string) *GetDasLinkResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetDasLinkResponse) SetToken(v string) *GetDasLinkResponse {
	s.Token = &v
	return s
}

func (s *GetDasLinkResponse) SetLink(v string) *GetDasLinkResponse {
	s.Link = &v
	return s
}

type GetDasEnterprisevcRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 授权实例ID
	AuthInstanceId *string `json:"auth_instance_id,omitempty" xml:"auth_instance_id,omitempty" require:"true"`
	// 授权企业信息
	AuthPersonEnterpriseInfo *AuthPersonEnterpriseInfo `json:"auth_person_enterprise_info,omitempty" xml:"auth_person_enterprise_info,omitempty" require:"true"`
}

func (s GetDasEnterprisevcRequest) String() string {
	return tea.Prettify(s)
}

func (s GetDasEnterprisevcRequest) GoString() string {
	return s.String()
}

func (s *GetDasEnterprisevcRequest) SetAuthToken(v string) *GetDasEnterprisevcRequest {
	s.AuthToken = &v
	return s
}

func (s *GetDasEnterprisevcRequest) SetProductInstanceId(v string) *GetDasEnterprisevcRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetDasEnterprisevcRequest) SetAuthInstanceId(v string) *GetDasEnterprisevcRequest {
	s.AuthInstanceId = &v
	return s
}

func (s *GetDasEnterprisevcRequest) SetAuthPersonEnterpriseInfo(v *AuthPersonEnterpriseInfo) *GetDasEnterprisevcRequest {
	s.AuthPersonEnterpriseInfo = v
	return s
}

type GetDasEnterprisevcResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// VC 内容
	Vc *string `json:"vc,omitempty" xml:"vc,omitempty"`
}

func (s GetDasEnterprisevcResponse) String() string {
	return tea.Prettify(s)
}

func (s GetDasEnterprisevcResponse) GoString() string {
	return s.String()
}

func (s *GetDasEnterprisevcResponse) SetReqMsgId(v string) *GetDasEnterprisevcResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetDasEnterprisevcResponse) SetResultCode(v string) *GetDasEnterprisevcResponse {
	s.ResultCode = &v
	return s
}

func (s *GetDasEnterprisevcResponse) SetResultMsg(v string) *GetDasEnterprisevcResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetDasEnterprisevcResponse) SetVc(v string) *GetDasEnterprisevcResponse {
	s.Vc = &v
	return s
}

type GetDasIndividualvcRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 授权实例ID
	AuthInstanceId *string `json:"auth_instance_id,omitempty" xml:"auth_instance_id,omitempty" require:"true"`
	// 授权人个人信息
	AuthedPersonIndividualInfo *AuthPersonIndividualInfo `json:"authed_person_individual_info,omitempty" xml:"authed_person_individual_info,omitempty" require:"true"`
}

func (s GetDasIndividualvcRequest) String() string {
	return tea.Prettify(s)
}

func (s GetDasIndividualvcRequest) GoString() string {
	return s.String()
}

func (s *GetDasIndividualvcRequest) SetAuthToken(v string) *GetDasIndividualvcRequest {
	s.AuthToken = &v
	return s
}

func (s *GetDasIndividualvcRequest) SetProductInstanceId(v string) *GetDasIndividualvcRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetDasIndividualvcRequest) SetAuthInstanceId(v string) *GetDasIndividualvcRequest {
	s.AuthInstanceId = &v
	return s
}

func (s *GetDasIndividualvcRequest) SetAuthedPersonIndividualInfo(v *AuthPersonIndividualInfo) *GetDasIndividualvcRequest {
	s.AuthedPersonIndividualInfo = v
	return s
}

type GetDasIndividualvcResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// VC
	Vc *string `json:"vc,omitempty" xml:"vc,omitempty"`
}

func (s GetDasIndividualvcResponse) String() string {
	return tea.Prettify(s)
}

func (s GetDasIndividualvcResponse) GoString() string {
	return s.String()
}

func (s *GetDasIndividualvcResponse) SetReqMsgId(v string) *GetDasIndividualvcResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetDasIndividualvcResponse) SetResultCode(v string) *GetDasIndividualvcResponse {
	s.ResultCode = &v
	return s
}

func (s *GetDasIndividualvcResponse) SetResultMsg(v string) *GetDasIndividualvcResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetDasIndividualvcResponse) SetVc(v string) *GetDasIndividualvcResponse {
	s.Vc = &v
	return s
}

type SendDasSmsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 接收方电话号码
	ReceivePhoneNum *int64 `json:"receive_phone_num,omitempty" xml:"receive_phone_num,omitempty" require:"true"`
	// 授权实例ID
	AuthInstanceId *string `json:"auth_instance_id,omitempty" xml:"auth_instance_id,omitempty" require:"true"`
}

func (s SendDasSmsRequest) String() string {
	return tea.Prettify(s)
}

func (s SendDasSmsRequest) GoString() string {
	return s.String()
}

func (s *SendDasSmsRequest) SetAuthToken(v string) *SendDasSmsRequest {
	s.AuthToken = &v
	return s
}

func (s *SendDasSmsRequest) SetProductInstanceId(v string) *SendDasSmsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SendDasSmsRequest) SetReceivePhoneNum(v int64) *SendDasSmsRequest {
	s.ReceivePhoneNum = &v
	return s
}

func (s *SendDasSmsRequest) SetAuthInstanceId(v string) *SendDasSmsRequest {
	s.AuthInstanceId = &v
	return s
}

type SendDasSmsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s SendDasSmsResponse) String() string {
	return tea.Prettify(s)
}

func (s SendDasSmsResponse) GoString() string {
	return s.String()
}

func (s *SendDasSmsResponse) SetReqMsgId(v string) *SendDasSmsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SendDasSmsResponse) SetResultCode(v string) *SendDasSmsResponse {
	s.ResultCode = &v
	return s
}

func (s *SendDasSmsResponse) SetResultMsg(v string) *SendDasSmsResponse {
	s.ResultMsg = &v
	return s
}

type AuthDasSmsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 手机验证码
	VerificationCode *string `json:"verification_code,omitempty" xml:"verification_code,omitempty" require:"true"`
	// 授权实例ID
	AuthInstanceId *string `json:"auth_instance_id,omitempty" xml:"auth_instance_id,omitempty" require:"true"`
	// 被授权企业接入应用ID
	BeAuthedPersonAppId *string `json:"be_authed_person_app_id,omitempty" xml:"be_authed_person_app_id,omitempty" require:"true"`
	// 授权企业信息
	AuthPersonEnterpriseInfo *AuthPersonEnterpriseInfo `json:"auth_person_enterprise_info,omitempty" xml:"auth_person_enterprise_info,omitempty"`
	// 授权人个人信息
	AuthPersonIndividualInfo *AuthPersonIndividualInfo `json:"auth_person_individual_info,omitempty" xml:"auth_person_individual_info,omitempty"`
}

func (s AuthDasSmsRequest) String() string {
	return tea.Prettify(s)
}

func (s AuthDasSmsRequest) GoString() string {
	return s.String()
}

func (s *AuthDasSmsRequest) SetAuthToken(v string) *AuthDasSmsRequest {
	s.AuthToken = &v
	return s
}

func (s *AuthDasSmsRequest) SetProductInstanceId(v string) *AuthDasSmsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AuthDasSmsRequest) SetVerificationCode(v string) *AuthDasSmsRequest {
	s.VerificationCode = &v
	return s
}

func (s *AuthDasSmsRequest) SetAuthInstanceId(v string) *AuthDasSmsRequest {
	s.AuthInstanceId = &v
	return s
}

func (s *AuthDasSmsRequest) SetBeAuthedPersonAppId(v string) *AuthDasSmsRequest {
	s.BeAuthedPersonAppId = &v
	return s
}

func (s *AuthDasSmsRequest) SetAuthPersonEnterpriseInfo(v *AuthPersonEnterpriseInfo) *AuthDasSmsRequest {
	s.AuthPersonEnterpriseInfo = v
	return s
}

func (s *AuthDasSmsRequest) SetAuthPersonIndividualInfo(v *AuthPersonIndividualInfo) *AuthDasSmsRequest {
	s.AuthPersonIndividualInfo = v
	return s
}

type AuthDasSmsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 授权状态
	AuthStatus *string `json:"auth_status,omitempty" xml:"auth_status,omitempty"`
	// VC
	Vc *string `json:"vc,omitempty" xml:"vc,omitempty"`
}

func (s AuthDasSmsResponse) String() string {
	return tea.Prettify(s)
}

func (s AuthDasSmsResponse) GoString() string {
	return s.String()
}

func (s *AuthDasSmsResponse) SetReqMsgId(v string) *AuthDasSmsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AuthDasSmsResponse) SetResultCode(v string) *AuthDasSmsResponse {
	s.ResultCode = &v
	return s
}

func (s *AuthDasSmsResponse) SetResultMsg(v string) *AuthDasSmsResponse {
	s.ResultMsg = &v
	return s
}

func (s *AuthDasSmsResponse) SetAuthStatus(v string) *AuthDasSmsResponse {
	s.AuthStatus = &v
	return s
}

func (s *AuthDasSmsResponse) SetVc(v string) *AuthDasSmsResponse {
	s.Vc = &v
	return s
}

type VerifyDasEnterpriseRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 被授权企业接入应用ID
	AuthInstanceId *string `json:"auth_instance_id,omitempty" xml:"auth_instance_id,omitempty" require:"true"`
	// VC完整内容
	Vc *string `json:"vc,omitempty" xml:"vc,omitempty" require:"true"`
	// 被授权企业信息
	BeAuthedPersonInfo *BeAuthedPersonInfo `json:"be_authed_person_info,omitempty" xml:"be_authed_person_info,omitempty" require:"true"`
	// 授权人企业信息
	AuthPersonEnterpriseInfo *AuthPersonEnterpriseInfo `json:"auth_person_enterprise_info,omitempty" xml:"auth_person_enterprise_info,omitempty" require:"true"`
	// 需要访问的数据源信息列表
	DataSourceInfo []*DataSource `json:"data_source_info,omitempty" xml:"data_source_info,omitempty" require:"true" type:"Repeated"`
}

func (s VerifyDasEnterpriseRequest) String() string {
	return tea.Prettify(s)
}

func (s VerifyDasEnterpriseRequest) GoString() string {
	return s.String()
}

func (s *VerifyDasEnterpriseRequest) SetAuthToken(v string) *VerifyDasEnterpriseRequest {
	s.AuthToken = &v
	return s
}

func (s *VerifyDasEnterpriseRequest) SetProductInstanceId(v string) *VerifyDasEnterpriseRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *VerifyDasEnterpriseRequest) SetAuthInstanceId(v string) *VerifyDasEnterpriseRequest {
	s.AuthInstanceId = &v
	return s
}

func (s *VerifyDasEnterpriseRequest) SetVc(v string) *VerifyDasEnterpriseRequest {
	s.Vc = &v
	return s
}

func (s *VerifyDasEnterpriseRequest) SetBeAuthedPersonInfo(v *BeAuthedPersonInfo) *VerifyDasEnterpriseRequest {
	s.BeAuthedPersonInfo = v
	return s
}

func (s *VerifyDasEnterpriseRequest) SetAuthPersonEnterpriseInfo(v *AuthPersonEnterpriseInfo) *VerifyDasEnterpriseRequest {
	s.AuthPersonEnterpriseInfo = v
	return s
}

func (s *VerifyDasEnterpriseRequest) SetDataSourceInfo(v []*DataSource) *VerifyDasEnterpriseRequest {
	s.DataSourceInfo = v
	return s
}

type VerifyDasEnterpriseResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 核验结果
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
	// 核验失败原因
	FailedReason *string `json:"failed_reason,omitempty" xml:"failed_reason,omitempty"`
}

func (s VerifyDasEnterpriseResponse) String() string {
	return tea.Prettify(s)
}

func (s VerifyDasEnterpriseResponse) GoString() string {
	return s.String()
}

func (s *VerifyDasEnterpriseResponse) SetReqMsgId(v string) *VerifyDasEnterpriseResponse {
	s.ReqMsgId = &v
	return s
}

func (s *VerifyDasEnterpriseResponse) SetResultCode(v string) *VerifyDasEnterpriseResponse {
	s.ResultCode = &v
	return s
}

func (s *VerifyDasEnterpriseResponse) SetResultMsg(v string) *VerifyDasEnterpriseResponse {
	s.ResultMsg = &v
	return s
}

func (s *VerifyDasEnterpriseResponse) SetSuccess(v bool) *VerifyDasEnterpriseResponse {
	s.Success = &v
	return s
}

func (s *VerifyDasEnterpriseResponse) SetFailedReason(v string) *VerifyDasEnterpriseResponse {
	s.FailedReason = &v
	return s
}

type VerifyDasIndividualRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 被授权企业接入应用ID
	AuthInstanceId *string `json:"auth_instance_id,omitempty" xml:"auth_instance_id,omitempty" require:"true"`
	// VC完整内容
	Vc *string `json:"vc,omitempty" xml:"vc,omitempty" require:"true"`
	// 被授权企业信息
	BeAuthedPersonInfo *BeAuthedPersonInfo `json:"be_authed_person_info,omitempty" xml:"be_authed_person_info,omitempty" require:"true"`
	// 授权人个人信息
	AuthPersonIndividualInfo *AuthPersonIndividualInfo `json:"auth_person_individual_info,omitempty" xml:"auth_person_individual_info,omitempty" require:"true"`
	// 需要访问的数据源信息列表
	DataSourceInfo []*DataSource `json:"data_source_info,omitempty" xml:"data_source_info,omitempty" require:"true" type:"Repeated"`
}

func (s VerifyDasIndividualRequest) String() string {
	return tea.Prettify(s)
}

func (s VerifyDasIndividualRequest) GoString() string {
	return s.String()
}

func (s *VerifyDasIndividualRequest) SetAuthToken(v string) *VerifyDasIndividualRequest {
	s.AuthToken = &v
	return s
}

func (s *VerifyDasIndividualRequest) SetProductInstanceId(v string) *VerifyDasIndividualRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *VerifyDasIndividualRequest) SetAuthInstanceId(v string) *VerifyDasIndividualRequest {
	s.AuthInstanceId = &v
	return s
}

func (s *VerifyDasIndividualRequest) SetVc(v string) *VerifyDasIndividualRequest {
	s.Vc = &v
	return s
}

func (s *VerifyDasIndividualRequest) SetBeAuthedPersonInfo(v *BeAuthedPersonInfo) *VerifyDasIndividualRequest {
	s.BeAuthedPersonInfo = v
	return s
}

func (s *VerifyDasIndividualRequest) SetAuthPersonIndividualInfo(v *AuthPersonIndividualInfo) *VerifyDasIndividualRequest {
	s.AuthPersonIndividualInfo = v
	return s
}

func (s *VerifyDasIndividualRequest) SetDataSourceInfo(v []*DataSource) *VerifyDasIndividualRequest {
	s.DataSourceInfo = v
	return s
}

type VerifyDasIndividualResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 核验结果
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
	// 核验失败原因
	FailedReason *string `json:"failed_reason,omitempty" xml:"failed_reason,omitempty"`
}

func (s VerifyDasIndividualResponse) String() string {
	return tea.Prettify(s)
}

func (s VerifyDasIndividualResponse) GoString() string {
	return s.String()
}

func (s *VerifyDasIndividualResponse) SetReqMsgId(v string) *VerifyDasIndividualResponse {
	s.ReqMsgId = &v
	return s
}

func (s *VerifyDasIndividualResponse) SetResultCode(v string) *VerifyDasIndividualResponse {
	s.ResultCode = &v
	return s
}

func (s *VerifyDasIndividualResponse) SetResultMsg(v string) *VerifyDasIndividualResponse {
	s.ResultMsg = &v
	return s
}

func (s *VerifyDasIndividualResponse) SetSuccess(v bool) *VerifyDasIndividualResponse {
	s.Success = &v
	return s
}

func (s *VerifyDasIndividualResponse) SetFailedReason(v string) *VerifyDasIndividualResponse {
	s.FailedReason = &v
	return s
}

type CreateDasDatasourceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 数据源名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true" maxLength:"20"`
	// 数据源提供方
	Provider *string `json:"provider,omitempty" xml:"provider,omitempty" require:"true" maxLength:"30"`
	// 枚举值：ENTERPRISE、INDIVIDUAL
	DataOwnerType *string `json:"data_owner_type,omitempty" xml:"data_owner_type,omitempty" require:"true"`
	// 数据源接口定义
	DataSourceInterface *DataSourceInterface `json:"data_source_interface,omitempty" xml:"data_source_interface,omitempty" require:"true"`
}

func (s CreateDasDatasourceRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateDasDatasourceRequest) GoString() string {
	return s.String()
}

func (s *CreateDasDatasourceRequest) SetAuthToken(v string) *CreateDasDatasourceRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateDasDatasourceRequest) SetProductInstanceId(v string) *CreateDasDatasourceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateDasDatasourceRequest) SetName(v string) *CreateDasDatasourceRequest {
	s.Name = &v
	return s
}

func (s *CreateDasDatasourceRequest) SetProvider(v string) *CreateDasDatasourceRequest {
	s.Provider = &v
	return s
}

func (s *CreateDasDatasourceRequest) SetDataOwnerType(v string) *CreateDasDatasourceRequest {
	s.DataOwnerType = &v
	return s
}

func (s *CreateDasDatasourceRequest) SetDataSourceInterface(v *DataSourceInterface) *CreateDasDatasourceRequest {
	s.DataSourceInterface = v
	return s
}

type CreateDasDatasourceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 数据源ID
	Id *string `json:"id,omitempty" xml:"id,omitempty"`
}

func (s CreateDasDatasourceResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateDasDatasourceResponse) GoString() string {
	return s.String()
}

func (s *CreateDasDatasourceResponse) SetReqMsgId(v string) *CreateDasDatasourceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateDasDatasourceResponse) SetResultCode(v string) *CreateDasDatasourceResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateDasDatasourceResponse) SetResultMsg(v string) *CreateDasDatasourceResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateDasDatasourceResponse) SetId(v string) *CreateDasDatasourceResponse {
	s.Id = &v
	return s
}

type UpdateDasDatasourceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 要修改的数据源ID
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 数据源名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true" maxLength:"20"`
	// 数据源提供方
	Provider *string `json:"provider,omitempty" xml:"provider,omitempty" require:"true" maxLength:"30"`
	// 枚举值：ENTERPRISE、INDIVIDUAL
	DataOwnerType *string `json:"data_owner_type,omitempty" xml:"data_owner_type,omitempty" require:"true"`
	// 数据源接口定义
	DataSourceInterface *DataSourceInterface `json:"data_source_interface,omitempty" xml:"data_source_interface,omitempty" require:"true"`
}

func (s UpdateDasDatasourceRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateDasDatasourceRequest) GoString() string {
	return s.String()
}

func (s *UpdateDasDatasourceRequest) SetAuthToken(v string) *UpdateDasDatasourceRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateDasDatasourceRequest) SetProductInstanceId(v string) *UpdateDasDatasourceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateDasDatasourceRequest) SetId(v string) *UpdateDasDatasourceRequest {
	s.Id = &v
	return s
}

func (s *UpdateDasDatasourceRequest) SetName(v string) *UpdateDasDatasourceRequest {
	s.Name = &v
	return s
}

func (s *UpdateDasDatasourceRequest) SetProvider(v string) *UpdateDasDatasourceRequest {
	s.Provider = &v
	return s
}

func (s *UpdateDasDatasourceRequest) SetDataOwnerType(v string) *UpdateDasDatasourceRequest {
	s.DataOwnerType = &v
	return s
}

func (s *UpdateDasDatasourceRequest) SetDataSourceInterface(v *DataSourceInterface) *UpdateDasDatasourceRequest {
	s.DataSourceInterface = v
	return s
}

type UpdateDasDatasourceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s UpdateDasDatasourceResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateDasDatasourceResponse) GoString() string {
	return s.String()
}

func (s *UpdateDasDatasourceResponse) SetReqMsgId(v string) *UpdateDasDatasourceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateDasDatasourceResponse) SetResultCode(v string) *UpdateDasDatasourceResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateDasDatasourceResponse) SetResultMsg(v string) *UpdateDasDatasourceResponse {
	s.ResultMsg = &v
	return s
}

type DeleteDasDatasourceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 要删除的数据源ID
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true"`
}

func (s DeleteDasDatasourceRequest) String() string {
	return tea.Prettify(s)
}

func (s DeleteDasDatasourceRequest) GoString() string {
	return s.String()
}

func (s *DeleteDasDatasourceRequest) SetAuthToken(v string) *DeleteDasDatasourceRequest {
	s.AuthToken = &v
	return s
}

func (s *DeleteDasDatasourceRequest) SetProductInstanceId(v string) *DeleteDasDatasourceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DeleteDasDatasourceRequest) SetId(v string) *DeleteDasDatasourceRequest {
	s.Id = &v
	return s
}

type DeleteDasDatasourceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s DeleteDasDatasourceResponse) String() string {
	return tea.Prettify(s)
}

func (s DeleteDasDatasourceResponse) GoString() string {
	return s.String()
}

func (s *DeleteDasDatasourceResponse) SetReqMsgId(v string) *DeleteDasDatasourceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DeleteDasDatasourceResponse) SetResultCode(v string) *DeleteDasDatasourceResponse {
	s.ResultCode = &v
	return s
}

func (s *DeleteDasDatasourceResponse) SetResultMsg(v string) *DeleteDasDatasourceResponse {
	s.ResultMsg = &v
	return s
}

type QueryDasDatasourceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 数据源名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true" maxLength:"20"`
	// 数据源提供方
	Provider *string `json:"provider,omitempty" xml:"provider,omitempty" maxLength:"30"`
	// 枚举值：ENTERPRISE、INDIVIDUAL
	DataOwnerType *string `json:"data_owner_type,omitempty" xml:"data_owner_type,omitempty"`
	// 数据源接口访问地址
	Address *string `json:"address,omitempty" xml:"address,omitempty" maxLength:"100"`
}

func (s QueryDasDatasourceRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDasDatasourceRequest) GoString() string {
	return s.String()
}

func (s *QueryDasDatasourceRequest) SetAuthToken(v string) *QueryDasDatasourceRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDasDatasourceRequest) SetProductInstanceId(v string) *QueryDasDatasourceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryDasDatasourceRequest) SetName(v string) *QueryDasDatasourceRequest {
	s.Name = &v
	return s
}

func (s *QueryDasDatasourceRequest) SetProvider(v string) *QueryDasDatasourceRequest {
	s.Provider = &v
	return s
}

func (s *QueryDasDatasourceRequest) SetDataOwnerType(v string) *QueryDasDatasourceRequest {
	s.DataOwnerType = &v
	return s
}

func (s *QueryDasDatasourceRequest) SetAddress(v string) *QueryDasDatasourceRequest {
	s.Address = &v
	return s
}

type QueryDasDatasourceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 数据源信息列表
	DataSources []*DataSourceInfo `json:"data_sources,omitempty" xml:"data_sources,omitempty" type:"Repeated"`
}

func (s QueryDasDatasourceResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDasDatasourceResponse) GoString() string {
	return s.String()
}

func (s *QueryDasDatasourceResponse) SetReqMsgId(v string) *QueryDasDatasourceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDasDatasourceResponse) SetResultCode(v string) *QueryDasDatasourceResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDasDatasourceResponse) SetResultMsg(v string) *QueryDasDatasourceResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDasDatasourceResponse) SetDataSources(v []*DataSourceInfo) *QueryDasDatasourceResponse {
	s.DataSources = v
	return s
}

type VerifyDasAuthresultRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 数据源ID列表
	DataSourceIds []*string `json:"data_source_ids,omitempty" xml:"data_source_ids,omitempty" require:"true" type:"Repeated"`
	// 被授权企业接入应用名称
	BeAuthedPersonAppName *string `json:"be_authed_person_app_name,omitempty" xml:"be_authed_person_app_name,omitempty" require:"true"`
	// 授权企业统一社会信用码
	AuthPersonEnterpriseCreditNum *string `json:"auth_person_enterprise_credit_num,omitempty" xml:"auth_person_enterprise_credit_num,omitempty" require:"true"`
}

func (s VerifyDasAuthresultRequest) String() string {
	return tea.Prettify(s)
}

func (s VerifyDasAuthresultRequest) GoString() string {
	return s.String()
}

func (s *VerifyDasAuthresultRequest) SetAuthToken(v string) *VerifyDasAuthresultRequest {
	s.AuthToken = &v
	return s
}

func (s *VerifyDasAuthresultRequest) SetProductInstanceId(v string) *VerifyDasAuthresultRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *VerifyDasAuthresultRequest) SetDataSourceIds(v []*string) *VerifyDasAuthresultRequest {
	s.DataSourceIds = v
	return s
}

func (s *VerifyDasAuthresultRequest) SetBeAuthedPersonAppName(v string) *VerifyDasAuthresultRequest {
	s.BeAuthedPersonAppName = &v
	return s
}

func (s *VerifyDasAuthresultRequest) SetAuthPersonEnterpriseCreditNum(v string) *VerifyDasAuthresultRequest {
	s.AuthPersonEnterpriseCreditNum = &v
	return s
}

type VerifyDasAuthresultResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 授权状态: 未授权，已授权
	AuthStatus *string `json:"auth_status,omitempty" xml:"auth_status,omitempty"`
}

func (s VerifyDasAuthresultResponse) String() string {
	return tea.Prettify(s)
}

func (s VerifyDasAuthresultResponse) GoString() string {
	return s.String()
}

func (s *VerifyDasAuthresultResponse) SetReqMsgId(v string) *VerifyDasAuthresultResponse {
	s.ReqMsgId = &v
	return s
}

func (s *VerifyDasAuthresultResponse) SetResultCode(v string) *VerifyDasAuthresultResponse {
	s.ResultCode = &v
	return s
}

func (s *VerifyDasAuthresultResponse) SetResultMsg(v string) *VerifyDasAuthresultResponse {
	s.ResultMsg = &v
	return s
}

func (s *VerifyDasAuthresultResponse) SetAuthStatus(v string) *VerifyDasAuthresultResponse {
	s.AuthStatus = &v
	return s
}

type AuthDasAuthresultRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 数据源ID列表
	DataSourceIds []*string `json:"data_source_ids,omitempty" xml:"data_source_ids,omitempty" require:"true" type:"Repeated"`
	// 被授权企业接入应用名称
	BeAuthedPersonAppName *string `json:"be_authed_person_app_name,omitempty" xml:"be_authed_person_app_name,omitempty" require:"true"`
	// 授权企业信息
	AuthPersonEnterpriseInfo *AuthPersonEnterpriseInfo `json:"auth_person_enterprise_info,omitempty" xml:"auth_person_enterprise_info,omitempty"`
	// 授权人信息
	AuthPersonIndividualInfo *AuthPersonIndividualInfo `json:"auth_person_individual_info,omitempty" xml:"auth_person_individual_info,omitempty"`
}

func (s AuthDasAuthresultRequest) String() string {
	return tea.Prettify(s)
}

func (s AuthDasAuthresultRequest) GoString() string {
	return s.String()
}

func (s *AuthDasAuthresultRequest) SetAuthToken(v string) *AuthDasAuthresultRequest {
	s.AuthToken = &v
	return s
}

func (s *AuthDasAuthresultRequest) SetProductInstanceId(v string) *AuthDasAuthresultRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AuthDasAuthresultRequest) SetDataSourceIds(v []*string) *AuthDasAuthresultRequest {
	s.DataSourceIds = v
	return s
}

func (s *AuthDasAuthresultRequest) SetBeAuthedPersonAppName(v string) *AuthDasAuthresultRequest {
	s.BeAuthedPersonAppName = &v
	return s
}

func (s *AuthDasAuthresultRequest) SetAuthPersonEnterpriseInfo(v *AuthPersonEnterpriseInfo) *AuthDasAuthresultRequest {
	s.AuthPersonEnterpriseInfo = v
	return s
}

func (s *AuthDasAuthresultRequest) SetAuthPersonIndividualInfo(v *AuthPersonIndividualInfo) *AuthDasAuthresultRequest {
	s.AuthPersonIndividualInfo = v
	return s
}

type AuthDasAuthresultResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 被授权企业ID
	BeAuthedPersonId *string `json:"be_authed_person_id,omitempty" xml:"be_authed_person_id,omitempty"`
	// 被授权企业接入应用ID
	BeAuthedPersonAppId *string `json:"be_authed_person_app_id,omitempty" xml:"be_authed_person_app_id,omitempty"`
	// 授权实例ID
	AuthInstanceId *string `json:"auth_instance_id,omitempty" xml:"auth_instance_id,omitempty"`
	// 授权详情ID
	AuthResultId *string `json:"auth_result_id,omitempty" xml:"auth_result_id,omitempty"`
	// VC 完整信息
	Vc *string `json:"vc,omitempty" xml:"vc,omitempty"`
}

func (s AuthDasAuthresultResponse) String() string {
	return tea.Prettify(s)
}

func (s AuthDasAuthresultResponse) GoString() string {
	return s.String()
}

func (s *AuthDasAuthresultResponse) SetReqMsgId(v string) *AuthDasAuthresultResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AuthDasAuthresultResponse) SetResultCode(v string) *AuthDasAuthresultResponse {
	s.ResultCode = &v
	return s
}

func (s *AuthDasAuthresultResponse) SetResultMsg(v string) *AuthDasAuthresultResponse {
	s.ResultMsg = &v
	return s
}

func (s *AuthDasAuthresultResponse) SetBeAuthedPersonId(v string) *AuthDasAuthresultResponse {
	s.BeAuthedPersonId = &v
	return s
}

func (s *AuthDasAuthresultResponse) SetBeAuthedPersonAppId(v string) *AuthDasAuthresultResponse {
	s.BeAuthedPersonAppId = &v
	return s
}

func (s *AuthDasAuthresultResponse) SetAuthInstanceId(v string) *AuthDasAuthresultResponse {
	s.AuthInstanceId = &v
	return s
}

func (s *AuthDasAuthresultResponse) SetAuthResultId(v string) *AuthDasAuthresultResponse {
	s.AuthResultId = &v
	return s
}

func (s *AuthDasAuthresultResponse) SetVc(v string) *AuthDasAuthresultResponse {
	s.Vc = &v
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
				"sdk_version":      tea.String("1.1.4"),
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
 * Description: 获取授权H5页面链接
 * Summary: 获取授权H5页面链接
 */
func (client *Client) GetDasLink(request *GetDasLinkRequest) (_result *GetDasLinkResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetDasLinkResponse{}
	_body, _err := client.GetDasLinkEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取授权H5页面链接
 * Summary: 获取授权H5页面链接
 */
func (client *Client) GetDasLinkEx(request *GetDasLinkRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetDasLinkResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetDasLinkResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.das.das.link.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取授权企业VC
 * Summary: 获取授权企业VC
 */
func (client *Client) GetDasEnterprisevc(request *GetDasEnterprisevcRequest) (_result *GetDasEnterprisevcResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetDasEnterprisevcResponse{}
	_body, _err := client.GetDasEnterprisevcEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取授权企业VC
 * Summary: 获取授权企业VC
 */
func (client *Client) GetDasEnterprisevcEx(request *GetDasEnterprisevcRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetDasEnterprisevcResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetDasEnterprisevcResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.das.das.enterprisevc.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取个人VC
 * Summary: 获取个人VC
 */
func (client *Client) GetDasIndividualvc(request *GetDasIndividualvcRequest) (_result *GetDasIndividualvcResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetDasIndividualvcResponse{}
	_body, _err := client.GetDasIndividualvcEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取个人VC
 * Summary: 获取个人VC
 */
func (client *Client) GetDasIndividualvcEx(request *GetDasIndividualvcRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetDasIndividualvcResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetDasIndividualvcResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.das.das.individualvc.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 发送短信验证码
 * Summary: 发送短信验证码
 */
func (client *Client) SendDasSms(request *SendDasSmsRequest) (_result *SendDasSmsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SendDasSmsResponse{}
	_body, _err := client.SendDasSmsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 发送短信验证码
 * Summary: 发送短信验证码
 */
func (client *Client) SendDasSmsEx(request *SendDasSmsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SendDasSmsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SendDasSmsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.das.das.sms.send"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 通过短信验证码授权
 * Summary: 通过短信验证码授权
 */
func (client *Client) AuthDasSms(request *AuthDasSmsRequest) (_result *AuthDasSmsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AuthDasSmsResponse{}
	_body, _err := client.AuthDasSmsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 通过短信验证码授权
 * Summary: 通过短信验证码授权
 */
func (client *Client) AuthDasSmsEx(request *AuthDasSmsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AuthDasSmsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AuthDasSmsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.das.das.sms.auth"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 根据VC针对提供的授权企业、被授权企业、授权数据做核验。
 * Summary: 企业信息核验
 */
func (client *Client) VerifyDasEnterprise(request *VerifyDasEnterpriseRequest) (_result *VerifyDasEnterpriseResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &VerifyDasEnterpriseResponse{}
	_body, _err := client.VerifyDasEnterpriseEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 根据VC针对提供的授权企业、被授权企业、授权数据做核验。
 * Summary: 企业信息核验
 */
func (client *Client) VerifyDasEnterpriseEx(request *VerifyDasEnterpriseRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *VerifyDasEnterpriseResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &VerifyDasEnterpriseResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.das.das.enterprise.verify"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 个人信息核验
 * Summary: 个人信息核验
 */
func (client *Client) VerifyDasIndividual(request *VerifyDasIndividualRequest) (_result *VerifyDasIndividualResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &VerifyDasIndividualResponse{}
	_body, _err := client.VerifyDasIndividualEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 个人信息核验
 * Summary: 个人信息核验
 */
func (client *Client) VerifyDasIndividualEx(request *VerifyDasIndividualRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *VerifyDasIndividualResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &VerifyDasIndividualResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.das.das.individual.verify"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建数据源
 * Summary: 创建数据源
 */
func (client *Client) CreateDasDatasource(request *CreateDasDatasourceRequest) (_result *CreateDasDatasourceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateDasDatasourceResponse{}
	_body, _err := client.CreateDasDatasourceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建数据源
 * Summary: 创建数据源
 */
func (client *Client) CreateDasDatasourceEx(request *CreateDasDatasourceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateDasDatasourceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateDasDatasourceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.das.das.datasource.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 更新数据源
 * Summary: 更新数据源
 */
func (client *Client) UpdateDasDatasource(request *UpdateDasDatasourceRequest) (_result *UpdateDasDatasourceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateDasDatasourceResponse{}
	_body, _err := client.UpdateDasDatasourceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 更新数据源
 * Summary: 更新数据源
 */
func (client *Client) UpdateDasDatasourceEx(request *UpdateDasDatasourceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateDasDatasourceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateDasDatasourceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.das.das.datasource.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 删除数据源
 * Summary: 删除数据源
 */
func (client *Client) DeleteDasDatasource(request *DeleteDasDatasourceRequest) (_result *DeleteDasDatasourceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DeleteDasDatasourceResponse{}
	_body, _err := client.DeleteDasDatasourceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 删除数据源
 * Summary: 删除数据源
 */
func (client *Client) DeleteDasDatasourceEx(request *DeleteDasDatasourceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DeleteDasDatasourceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DeleteDasDatasourceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.das.das.datasource.delete"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询数据源信息
 * Summary: 查询数据源信息
 */
func (client *Client) QueryDasDatasource(request *QueryDasDatasourceRequest) (_result *QueryDasDatasourceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDasDatasourceResponse{}
	_body, _err := client.QueryDasDatasourceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询数据源信息
 * Summary: 查询数据源信息
 */
func (client *Client) QueryDasDatasourceEx(request *QueryDasDatasourceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDasDatasourceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDasDatasourceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.das.das.datasource.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 校验授权结果
 * Summary: 校验授权结果
 */
func (client *Client) VerifyDasAuthresult(request *VerifyDasAuthresultRequest) (_result *VerifyDasAuthresultResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &VerifyDasAuthresultResponse{}
	_body, _err := client.VerifyDasAuthresultEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 校验授权结果
 * Summary: 校验授权结果
 */
func (client *Client) VerifyDasAuthresultEx(request *VerifyDasAuthresultRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *VerifyDasAuthresultResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &VerifyDasAuthresultResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.das.das.authresult.verify"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 根据授权三方信息做授权
 * Summary: 根据授权三方信息做授权
 */
func (client *Client) AuthDasAuthresult(request *AuthDasAuthresultRequest) (_result *AuthDasAuthresultResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AuthDasAuthresultResponse{}
	_body, _err := client.AuthDasAuthresultEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 根据授权三方信息做授权
 * Summary: 根据授权三方信息做授权
 */
func (client *Client) AuthDasAuthresultEx(request *AuthDasAuthresultRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AuthDasAuthresultResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AuthDasAuthresultResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.das.das.authresult.auth"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
