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

// 键值对，兼容map用
type NameValuePair struct {
	// 键名
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 键值
	Value *string `json:"value,omitempty" xml:"value,omitempty" require:"true"`
}

func (s NameValuePair) String() string {
	return tea.Prettify(s)
}

func (s NameValuePair) GoString() string {
	return s.String()
}

func (s *NameValuePair) SetName(v string) *NameValuePair {
	s.Name = &v
	return s
}

func (s *NameValuePair) SetValue(v string) *NameValuePair {
	s.Value = &v
	return s
}

// Map<String,Object> 集合
type QueryMap struct {
	// 键值
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 额外用户信息
	Value []*NameValuePair `json:"value,omitempty" xml:"value,omitempty" type:"Repeated"`
}

func (s QueryMap) String() string {
	return tea.Prettify(s)
}

func (s QueryMap) GoString() string {
	return s.String()
}

func (s *QueryMap) SetName(v string) *QueryMap {
	s.Name = &v
	return s
}

func (s *QueryMap) SetValue(v []*NameValuePair) *QueryMap {
	s.Value = v
	return s
}

type BindDemoAaaBbbCccRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
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

type QueryDemoAaaBbbCccRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s QueryDemoAaaBbbCccRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDemoAaaBbbCccRequest) GoString() string {
	return s.String()
}

func (s *QueryDemoAaaBbbCccRequest) SetAuthToken(v string) *QueryDemoAaaBbbCccRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDemoAaaBbbCccRequest) SetProductInstanceId(v string) *QueryDemoAaaBbbCccRequest {
	s.ProductInstanceId = &v
	return s
}

type QueryDemoAaaBbbCccResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s QueryDemoAaaBbbCccResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDemoAaaBbbCccResponse) GoString() string {
	return s.String()
}

func (s *QueryDemoAaaBbbCccResponse) SetReqMsgId(v string) *QueryDemoAaaBbbCccResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDemoAaaBbbCccResponse) SetResultCode(v string) *QueryDemoAaaBbbCccResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDemoAaaBbbCccResponse) SetResultMsg(v string) *QueryDemoAaaBbbCccResponse {
	s.ResultMsg = &v
	return s
}

type QueryDemoAdAsdAsdRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s QueryDemoAdAsdAsdRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDemoAdAsdAsdRequest) GoString() string {
	return s.String()
}

func (s *QueryDemoAdAsdAsdRequest) SetAuthToken(v string) *QueryDemoAdAsdAsdRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDemoAdAsdAsdRequest) SetProductInstanceId(v string) *QueryDemoAdAsdAsdRequest {
	s.ProductInstanceId = &v
	return s
}

type QueryDemoAdAsdAsdResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s QueryDemoAdAsdAsdResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDemoAdAsdAsdResponse) GoString() string {
	return s.String()
}

func (s *QueryDemoAdAsdAsdResponse) SetReqMsgId(v string) *QueryDemoAdAsdAsdResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDemoAdAsdAsdResponse) SetResultCode(v string) *QueryDemoAdAsdAsdResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDemoAdAsdAsdResponse) SetResultMsg(v string) *QueryDemoAdAsdAsdResponse {
	s.ResultMsg = &v
	return s
}

type InitDemoBbpInsuranceUserRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 保司编码
	BusinessCode *string `json:"business_code,omitempty" xml:"business_code,omitempty" require:"true"`
	// 第三方id，此处为天猫uid
	ThirdPartId *string `json:"third_part_id,omitempty" xml:"third_part_id,omitempty" require:"true"`
	// 来源渠道
	Channel *string `json:"channel,omitempty" xml:"channel,omitempty" require:"true"`
	// 埋点信息
	Burieds *QueryMap `json:"burieds,omitempty" xml:"burieds,omitempty"`
}

func (s InitDemoBbpInsuranceUserRequest) String() string {
	return tea.Prettify(s)
}

func (s InitDemoBbpInsuranceUserRequest) GoString() string {
	return s.String()
}

func (s *InitDemoBbpInsuranceUserRequest) SetAuthToken(v string) *InitDemoBbpInsuranceUserRequest {
	s.AuthToken = &v
	return s
}

func (s *InitDemoBbpInsuranceUserRequest) SetProductInstanceId(v string) *InitDemoBbpInsuranceUserRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *InitDemoBbpInsuranceUserRequest) SetBusinessCode(v string) *InitDemoBbpInsuranceUserRequest {
	s.BusinessCode = &v
	return s
}

func (s *InitDemoBbpInsuranceUserRequest) SetThirdPartId(v string) *InitDemoBbpInsuranceUserRequest {
	s.ThirdPartId = &v
	return s
}

func (s *InitDemoBbpInsuranceUserRequest) SetChannel(v string) *InitDemoBbpInsuranceUserRequest {
	s.Channel = &v
	return s
}

func (s *InitDemoBbpInsuranceUserRequest) SetBurieds(v *QueryMap) *InitDemoBbpInsuranceUserRequest {
	s.Burieds = v
	return s
}

type InitDemoBbpInsuranceUserResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s InitDemoBbpInsuranceUserResponse) String() string {
	return tea.Prettify(s)
}

func (s InitDemoBbpInsuranceUserResponse) GoString() string {
	return s.String()
}

func (s *InitDemoBbpInsuranceUserResponse) SetReqMsgId(v string) *InitDemoBbpInsuranceUserResponse {
	s.ReqMsgId = &v
	return s
}

func (s *InitDemoBbpInsuranceUserResponse) SetResultCode(v string) *InitDemoBbpInsuranceUserResponse {
	s.ResultCode = &v
	return s
}

func (s *InitDemoBbpInsuranceUserResponse) SetResultMsg(v string) *InitDemoBbpInsuranceUserResponse {
	s.ResultMsg = &v
	return s
}

type QueryDemoGatewayMyRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s QueryDemoGatewayMyRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDemoGatewayMyRequest) GoString() string {
	return s.String()
}

func (s *QueryDemoGatewayMyRequest) SetAuthToken(v string) *QueryDemoGatewayMyRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDemoGatewayMyRequest) SetProductInstanceId(v string) *QueryDemoGatewayMyRequest {
	s.ProductInstanceId = &v
	return s
}

type QueryDemoGatewayMyResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s QueryDemoGatewayMyResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDemoGatewayMyResponse) GoString() string {
	return s.String()
}

func (s *QueryDemoGatewayMyResponse) SetReqMsgId(v string) *QueryDemoGatewayMyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDemoGatewayMyResponse) SetResultCode(v string) *QueryDemoGatewayMyResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDemoGatewayMyResponse) SetResultMsg(v string) *QueryDemoGatewayMyResponse {
	s.ResultMsg = &v
	return s
}

type QueryDemoGongxiangTestDemoRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 验证字符
	Character1 *string `json:"character1,omitempty" xml:"character1,omitempty" require:"true"`
}

func (s QueryDemoGongxiangTestDemoRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDemoGongxiangTestDemoRequest) GoString() string {
	return s.String()
}

func (s *QueryDemoGongxiangTestDemoRequest) SetAuthToken(v string) *QueryDemoGongxiangTestDemoRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDemoGongxiangTestDemoRequest) SetProductInstanceId(v string) *QueryDemoGongxiangTestDemoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryDemoGongxiangTestDemoRequest) SetCharacter1(v string) *QueryDemoGongxiangTestDemoRequest {
	s.Character1 = &v
	return s
}

type QueryDemoGongxiangTestDemoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// aaaaaa
	Character1 *string `json:"character1,omitempty" xml:"character1,omitempty"`
}

func (s QueryDemoGongxiangTestDemoResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDemoGongxiangTestDemoResponse) GoString() string {
	return s.String()
}

func (s *QueryDemoGongxiangTestDemoResponse) SetReqMsgId(v string) *QueryDemoGongxiangTestDemoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDemoGongxiangTestDemoResponse) SetResultCode(v string) *QueryDemoGongxiangTestDemoResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDemoGongxiangTestDemoResponse) SetResultMsg(v string) *QueryDemoGongxiangTestDemoResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDemoGongxiangTestDemoResponse) SetCharacter1(v string) *QueryDemoGongxiangTestDemoResponse {
	s.Character1 = &v
	return s
}

type RegisterDemoTestBizeventMessageRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s RegisterDemoTestBizeventMessageRequest) String() string {
	return tea.Prettify(s)
}

func (s RegisterDemoTestBizeventMessageRequest) GoString() string {
	return s.String()
}

func (s *RegisterDemoTestBizeventMessageRequest) SetAuthToken(v string) *RegisterDemoTestBizeventMessageRequest {
	s.AuthToken = &v
	return s
}

func (s *RegisterDemoTestBizeventMessageRequest) SetProductInstanceId(v string) *RegisterDemoTestBizeventMessageRequest {
	s.ProductInstanceId = &v
	return s
}

type RegisterDemoTestBizeventMessageResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s RegisterDemoTestBizeventMessageResponse) String() string {
	return tea.Prettify(s)
}

func (s RegisterDemoTestBizeventMessageResponse) GoString() string {
	return s.String()
}

func (s *RegisterDemoTestBizeventMessageResponse) SetReqMsgId(v string) *RegisterDemoTestBizeventMessageResponse {
	s.ReqMsgId = &v
	return s
}

func (s *RegisterDemoTestBizeventMessageResponse) SetResultCode(v string) *RegisterDemoTestBizeventMessageResponse {
	s.ResultCode = &v
	return s
}

func (s *RegisterDemoTestBizeventMessageResponse) SetResultMsg(v string) *RegisterDemoTestBizeventMessageResponse {
	s.ResultMsg = &v
	return s
}

type QueryDemoTestTestRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	//
	Acpmpcore *string `json:"acpmpcore,omitempty" xml:"acpmpcore,omitempty" require:"true"`
}

func (s QueryDemoTestTestRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDemoTestTestRequest) GoString() string {
	return s.String()
}

func (s *QueryDemoTestTestRequest) SetAuthToken(v string) *QueryDemoTestTestRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDemoTestTestRequest) SetProductInstanceId(v string) *QueryDemoTestTestRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryDemoTestTestRequest) SetAcpmpcore(v string) *QueryDemoTestTestRequest {
	s.Acpmpcore = &v
	return s
}

type QueryDemoTestTestResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s QueryDemoTestTestResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDemoTestTestResponse) GoString() string {
	return s.String()
}

func (s *QueryDemoTestTestResponse) SetReqMsgId(v string) *QueryDemoTestTestResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDemoTestTestResponse) SetResultCode(v string) *QueryDemoTestTestResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDemoTestTestResponse) SetResultMsg(v string) *QueryDemoTestTestResponse {
	s.ResultMsg = &v
	return s
}

type BindDemoTestTestTestRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// test
	Test *string `json:"test,omitempty" xml:"test,omitempty" require:"true"`
}

func (s BindDemoTestTestTestRequest) String() string {
	return tea.Prettify(s)
}

func (s BindDemoTestTestTestRequest) GoString() string {
	return s.String()
}

func (s *BindDemoTestTestTestRequest) SetAuthToken(v string) *BindDemoTestTestTestRequest {
	s.AuthToken = &v
	return s
}

func (s *BindDemoTestTestTestRequest) SetProductInstanceId(v string) *BindDemoTestTestTestRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *BindDemoTestTestTestRequest) SetTest(v string) *BindDemoTestTestTestRequest {
	s.Test = &v
	return s
}

type BindDemoTestTestTestResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// test
	Test *string `json:"test,omitempty" xml:"test,omitempty"`
}

func (s BindDemoTestTestTestResponse) String() string {
	return tea.Prettify(s)
}

func (s BindDemoTestTestTestResponse) GoString() string {
	return s.String()
}

func (s *BindDemoTestTestTestResponse) SetReqMsgId(v string) *BindDemoTestTestTestResponse {
	s.ReqMsgId = &v
	return s
}

func (s *BindDemoTestTestTestResponse) SetResultCode(v string) *BindDemoTestTestTestResponse {
	s.ResultCode = &v
	return s
}

func (s *BindDemoTestTestTestResponse) SetResultMsg(v string) *BindDemoTestTestTestResponse {
	s.ResultMsg = &v
	return s
}

func (s *BindDemoTestTestTestResponse) SetTest(v string) *BindDemoTestTestTestResponse {
	s.Test = &v
	return s
}

type QueryDemoTestTestobjectBbbRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 测试入参
	RequestParam1 *string `json:"request_param1,omitempty" xml:"request_param1,omitempty" require:"true"`
	// 测试入参2
	RequestParam2 *string `json:"request_param2,omitempty" xml:"request_param2,omitempty" require:"true"`
}

func (s QueryDemoTestTestobjectBbbRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDemoTestTestobjectBbbRequest) GoString() string {
	return s.String()
}

func (s *QueryDemoTestTestobjectBbbRequest) SetAuthToken(v string) *QueryDemoTestTestobjectBbbRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDemoTestTestobjectBbbRequest) SetProductInstanceId(v string) *QueryDemoTestTestobjectBbbRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryDemoTestTestobjectBbbRequest) SetRequestParam1(v string) *QueryDemoTestTestobjectBbbRequest {
	s.RequestParam1 = &v
	return s
}

func (s *QueryDemoTestTestobjectBbbRequest) SetRequestParam2(v string) *QueryDemoTestTestobjectBbbRequest {
	s.RequestParam2 = &v
	return s
}

type QueryDemoTestTestobjectBbbResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 测试返回参数
	Response *string `json:"response,omitempty" xml:"response,omitempty"`
}

func (s QueryDemoTestTestobjectBbbResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDemoTestTestobjectBbbResponse) GoString() string {
	return s.String()
}

func (s *QueryDemoTestTestobjectBbbResponse) SetReqMsgId(v string) *QueryDemoTestTestobjectBbbResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDemoTestTestobjectBbbResponse) SetResultCode(v string) *QueryDemoTestTestobjectBbbResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDemoTestTestobjectBbbResponse) SetResultMsg(v string) *QueryDemoTestTestobjectBbbResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDemoTestTestobjectBbbResponse) SetResponse(v string) *QueryDemoTestTestobjectBbbResponse {
	s.Response = &v
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
				"sdk_version":      tea.String("1.0.1"),
				"_prod_code":       tea.String("ak_e24d1923d9dc43cc8cb90aeb2f35cc20"),
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
 * Description: 自动化测试创建，用于测试新建&修改功能
 * Summary: 自动化测试创建，用于测试新建&修改功能
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
 * Description: 自动化测试创建，用于测试新建&修改功能
 * Summary: 自动化测试创建，用于测试新建&修改功能
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
 * Description: 自动化测试创建1
 * Summary: 自动化测试创建（勿动）
 */
func (client *Client) QueryDemoAaaBbbCcc(request *QueryDemoAaaBbbCccRequest) (_result *QueryDemoAaaBbbCccResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDemoAaaBbbCccResponse{}
	_body, _err := client.QueryDemoAaaBbbCccEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 自动化测试创建1
 * Summary: 自动化测试创建（勿动）
 */
func (client *Client) QueryDemoAaaBbbCccEx(request *QueryDemoAaaBbbCccRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDemoAaaBbbCccResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDemoAaaBbbCccResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.aaa.bbb.ccc.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: asd
 * Summary: asd
 */
func (client *Client) QueryDemoAdAsdAsd(request *QueryDemoAdAsdAsdRequest) (_result *QueryDemoAdAsdAsdResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDemoAdAsdAsdResponse{}
	_body, _err := client.QueryDemoAdAsdAsdEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: asd
 * Summary: asd
 */
func (client *Client) QueryDemoAdAsdAsdEx(request *QueryDemoAdAsdAsdRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDemoAdAsdAsdResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDemoAdAsdAsdResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.ad.asd.asd.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 保司用户埋点信息
 * Summary: 用户登陆页面埋点
 */
func (client *Client) InitDemoBbpInsuranceUser(request *InitDemoBbpInsuranceUserRequest) (_result *InitDemoBbpInsuranceUserResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &InitDemoBbpInsuranceUserResponse{}
	_body, _err := client.InitDemoBbpInsuranceUserEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 保司用户埋点信息
 * Summary: 用户登陆页面埋点
 */
func (client *Client) InitDemoBbpInsuranceUserEx(request *InitDemoBbpInsuranceUserRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *InitDemoBbpInsuranceUserResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &InitDemoBbpInsuranceUserResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.bbp.insurance.user.init"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: aaa
 * Summary: 测试demo
 */
func (client *Client) QueryDemoGatewayMy(request *QueryDemoGatewayMyRequest) (_result *QueryDemoGatewayMyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDemoGatewayMyResponse{}
	_body, _err := client.QueryDemoGatewayMyEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: aaa
 * Summary: 测试demo
 */
func (client *Client) QueryDemoGatewayMyEx(request *QueryDemoGatewayMyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDemoGatewayMyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDemoGatewayMyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.gateway.my.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 共享能力中心六期回归验证创建使用
 * Summary: 共享能力中心六期回归验证创建
 */
func (client *Client) QueryDemoGongxiangTestDemo(request *QueryDemoGongxiangTestDemoRequest) (_result *QueryDemoGongxiangTestDemoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDemoGongxiangTestDemoResponse{}
	_body, _err := client.QueryDemoGongxiangTestDemoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 共享能力中心六期回归验证创建使用
 * Summary: 共享能力中心六期回归验证创建
 */
func (client *Client) QueryDemoGongxiangTestDemoEx(request *QueryDemoGongxiangTestDemoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDemoGongxiangTestDemoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDemoGongxiangTestDemoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.gongxiang.test.demo.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 随机测试
 * Summary: 消息发送及消费
 */
func (client *Client) RegisterDemoTestBizeventMessage(request *RegisterDemoTestBizeventMessageRequest) (_result *RegisterDemoTestBizeventMessageResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &RegisterDemoTestBizeventMessageResponse{}
	_body, _err := client.RegisterDemoTestBizeventMessageEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 随机测试
 * Summary: 消息发送及消费
 */
func (client *Client) RegisterDemoTestBizeventMessageEx(request *RegisterDemoTestBizeventMessageRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *RegisterDemoTestBizeventMessageResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &RegisterDemoTestBizeventMessageResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.test.bizevent.message.register"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 的
 * Summary: 下载地址创建
 */
func (client *Client) QueryDemoTestTest(request *QueryDemoTestTestRequest) (_result *QueryDemoTestTestResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDemoTestTestResponse{}
	_body, _err := client.QueryDemoTestTestEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 的
 * Summary: 下载地址创建
 */
func (client *Client) QueryDemoTestTestEx(request *QueryDemoTestTestRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDemoTestTestResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDemoTestTestResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.test.test.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: testaaa
 * Summary: test
 */
func (client *Client) BindDemoTestTestTest(request *BindDemoTestTestTestRequest) (_result *BindDemoTestTestTestResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &BindDemoTestTestTestResponse{}
	_body, _err := client.BindDemoTestTestTestEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: testaaa
 * Summary: test
 */
func (client *Client) BindDemoTestTestTestEx(request *BindDemoTestTestTestRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *BindDemoTestTestTestResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &BindDemoTestTestTestResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.test.test.test.bind"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 测试添加api
 * Summary: 测试用api
 */
func (client *Client) QueryDemoTestTestobjectBbb(request *QueryDemoTestTestobjectBbbRequest) (_result *QueryDemoTestTestobjectBbbResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDemoTestTestobjectBbbResponse{}
	_body, _err := client.QueryDemoTestTestobjectBbbEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 测试添加api
 * Summary: 测试用api
 */
func (client *Client) QueryDemoTestTestobjectBbbEx(request *QueryDemoTestTestobjectBbbRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDemoTestTestobjectBbbResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDemoTestTestobjectBbbResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.test.testobject.bbb.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
