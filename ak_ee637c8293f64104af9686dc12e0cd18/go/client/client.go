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

// 大安全佐罗测试接口结构体
type FaceImage struct {
	// 123
	Content *string `json:"content,omitempty" xml:"content,omitempty"`
	// 213
	Rect *string `json:"rect,omitempty" xml:"rect,omitempty"`
}

func (s FaceImage) String() string {
	return tea.Prettify(s)
}

func (s FaceImage) GoString() string {
	return s.String()
}

func (s *FaceImage) SetContent(v string) *FaceImage {
	s.Content = &v
	return s
}

func (s *FaceImage) SetRect(v string) *FaceImage {
	s.Rect = &v
	return s
}

type BindDemoSssSsSsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s BindDemoSssSsSsRequest) String() string {
	return tea.Prettify(s)
}

func (s BindDemoSssSsSsRequest) GoString() string {
	return s.String()
}

func (s *BindDemoSssSsSsRequest) SetAuthToken(v string) *BindDemoSssSsSsRequest {
	s.AuthToken = &v
	return s
}

func (s *BindDemoSssSsSsRequest) SetProductInstanceId(v string) *BindDemoSssSsSsRequest {
	s.ProductInstanceId = &v
	return s
}

type BindDemoSssSsSsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s BindDemoSssSsSsResponse) String() string {
	return tea.Prettify(s)
}

func (s BindDemoSssSsSsResponse) GoString() string {
	return s.String()
}

func (s *BindDemoSssSsSsResponse) SetReqMsgId(v string) *BindDemoSssSsSsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *BindDemoSssSsSsResponse) SetResultCode(v string) *BindDemoSssSsSsResponse {
	s.ResultCode = &v
	return s
}

func (s *BindDemoSssSsSsResponse) SetResultMsg(v string) *BindDemoSssSsSsResponse {
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

type BindDemoSdfSssSssRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s BindDemoSdfSssSssRequest) String() string {
	return tea.Prettify(s)
}

func (s BindDemoSdfSssSssRequest) GoString() string {
	return s.String()
}

func (s *BindDemoSdfSssSssRequest) SetAuthToken(v string) *BindDemoSdfSssSssRequest {
	s.AuthToken = &v
	return s
}

func (s *BindDemoSdfSssSssRequest) SetProductInstanceId(v string) *BindDemoSdfSssSssRequest {
	s.ProductInstanceId = &v
	return s
}

type BindDemoSdfSssSssResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s BindDemoSdfSssSssResponse) String() string {
	return tea.Prettify(s)
}

func (s BindDemoSdfSssSssResponse) GoString() string {
	return s.String()
}

func (s *BindDemoSdfSssSssResponse) SetReqMsgId(v string) *BindDemoSdfSssSssResponse {
	s.ReqMsgId = &v
	return s
}

func (s *BindDemoSdfSssSssResponse) SetResultCode(v string) *BindDemoSdfSssSssResponse {
	s.ResultCode = &v
	return s
}

func (s *BindDemoSdfSssSssResponse) SetResultMsg(v string) *BindDemoSdfSssSssResponse {
	s.ResultMsg = &v
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

type QueryDemoCjtestCjResRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s QueryDemoCjtestCjResRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDemoCjtestCjResRequest) GoString() string {
	return s.String()
}

func (s *QueryDemoCjtestCjResRequest) SetAuthToken(v string) *QueryDemoCjtestCjResRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDemoCjtestCjResRequest) SetProductInstanceId(v string) *QueryDemoCjtestCjResRequest {
	s.ProductInstanceId = &v
	return s
}

type QueryDemoCjtestCjResResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s QueryDemoCjtestCjResResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDemoCjtestCjResResponse) GoString() string {
	return s.String()
}

func (s *QueryDemoCjtestCjResResponse) SetReqMsgId(v string) *QueryDemoCjtestCjResResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDemoCjtestCjResResponse) SetResultCode(v string) *QueryDemoCjtestCjResResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDemoCjtestCjResResponse) SetResultMsg(v string) *QueryDemoCjtestCjResResponse {
	s.ResultMsg = &v
	return s
}

type PublishDemoSaasTestTestcRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 张三
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 14
	Age *int64 `json:"age,omitempty" xml:"age,omitempty" require:"true"`
}

func (s PublishDemoSaasTestTestcRequest) String() string {
	return tea.Prettify(s)
}

func (s PublishDemoSaasTestTestcRequest) GoString() string {
	return s.String()
}

func (s *PublishDemoSaasTestTestcRequest) SetAuthToken(v string) *PublishDemoSaasTestTestcRequest {
	s.AuthToken = &v
	return s
}

func (s *PublishDemoSaasTestTestcRequest) SetProductInstanceId(v string) *PublishDemoSaasTestTestcRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PublishDemoSaasTestTestcRequest) SetName(v string) *PublishDemoSaasTestTestcRequest {
	s.Name = &v
	return s
}

func (s *PublishDemoSaasTestTestcRequest) SetAge(v int64) *PublishDemoSaasTestTestcRequest {
	s.Age = &v
	return s
}

type PublishDemoSaasTestTestcResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 男
	Sex *string `json:"sex,omitempty" xml:"sex,omitempty"`
}

func (s PublishDemoSaasTestTestcResponse) String() string {
	return tea.Prettify(s)
}

func (s PublishDemoSaasTestTestcResponse) GoString() string {
	return s.String()
}

func (s *PublishDemoSaasTestTestcResponse) SetReqMsgId(v string) *PublishDemoSaasTestTestcResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PublishDemoSaasTestTestcResponse) SetResultCode(v string) *PublishDemoSaasTestTestcResponse {
	s.ResultCode = &v
	return s
}

func (s *PublishDemoSaasTestTestcResponse) SetResultMsg(v string) *PublishDemoSaasTestTestcResponse {
	s.ResultMsg = &v
	return s
}

func (s *PublishDemoSaasTestTestcResponse) SetSex(v string) *PublishDemoSaasTestTestcResponse {
	s.Sex = &v
	return s
}

type CreateDemoSaasTestTesthRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// test
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
}

func (s CreateDemoSaasTestTesthRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateDemoSaasTestTesthRequest) GoString() string {
	return s.String()
}

func (s *CreateDemoSaasTestTesthRequest) SetAuthToken(v string) *CreateDemoSaasTestTesthRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateDemoSaasTestTesthRequest) SetProductInstanceId(v string) *CreateDemoSaasTestTesthRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateDemoSaasTestTesthRequest) SetName(v string) *CreateDemoSaasTestTesthRequest {
	s.Name = &v
	return s
}

type CreateDemoSaasTestTesthResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// test
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
}

func (s CreateDemoSaasTestTesthResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateDemoSaasTestTesthResponse) GoString() string {
	return s.String()
}

func (s *CreateDemoSaasTestTesthResponse) SetReqMsgId(v string) *CreateDemoSaasTestTesthResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateDemoSaasTestTesthResponse) SetResultCode(v string) *CreateDemoSaasTestTesthResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateDemoSaasTestTesthResponse) SetResultMsg(v string) *CreateDemoSaasTestTesthResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateDemoSaasTestTesthResponse) SetName(v string) *CreateDemoSaasTestTesthResponse {
	s.Name = &v
	return s
}

type CreateDemoSaasTestTestiRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s CreateDemoSaasTestTestiRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateDemoSaasTestTestiRequest) GoString() string {
	return s.String()
}

func (s *CreateDemoSaasTestTestiRequest) SetAuthToken(v string) *CreateDemoSaasTestTestiRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateDemoSaasTestTestiRequest) SetProductInstanceId(v string) *CreateDemoSaasTestTestiRequest {
	s.ProductInstanceId = &v
	return s
}

type CreateDemoSaasTestTestiResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// test
	Sex *string `json:"sex,omitempty" xml:"sex,omitempty"`
}

func (s CreateDemoSaasTestTestiResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateDemoSaasTestTestiResponse) GoString() string {
	return s.String()
}

func (s *CreateDemoSaasTestTestiResponse) SetReqMsgId(v string) *CreateDemoSaasTestTestiResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateDemoSaasTestTestiResponse) SetResultCode(v string) *CreateDemoSaasTestTestiResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateDemoSaasTestTestiResponse) SetResultMsg(v string) *CreateDemoSaasTestTestiResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateDemoSaasTestTestiResponse) SetSex(v string) *CreateDemoSaasTestTestiResponse {
	s.Sex = &v
	return s
}

type ReplaceDemoSaasTestTestjRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// test
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
}

func (s ReplaceDemoSaasTestTestjRequest) String() string {
	return tea.Prettify(s)
}

func (s ReplaceDemoSaasTestTestjRequest) GoString() string {
	return s.String()
}

func (s *ReplaceDemoSaasTestTestjRequest) SetAuthToken(v string) *ReplaceDemoSaasTestTestjRequest {
	s.AuthToken = &v
	return s
}

func (s *ReplaceDemoSaasTestTestjRequest) SetProductInstanceId(v string) *ReplaceDemoSaasTestTestjRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ReplaceDemoSaasTestTestjRequest) SetName(v string) *ReplaceDemoSaasTestTestjRequest {
	s.Name = &v
	return s
}

type ReplaceDemoSaasTestTestjResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// test
	Age *string `json:"age,omitempty" xml:"age,omitempty"`
}

func (s ReplaceDemoSaasTestTestjResponse) String() string {
	return tea.Prettify(s)
}

func (s ReplaceDemoSaasTestTestjResponse) GoString() string {
	return s.String()
}

func (s *ReplaceDemoSaasTestTestjResponse) SetReqMsgId(v string) *ReplaceDemoSaasTestTestjResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ReplaceDemoSaasTestTestjResponse) SetResultCode(v string) *ReplaceDemoSaasTestTestjResponse {
	s.ResultCode = &v
	return s
}

func (s *ReplaceDemoSaasTestTestjResponse) SetResultMsg(v string) *ReplaceDemoSaasTestTestjResponse {
	s.ResultMsg = &v
	return s
}

func (s *ReplaceDemoSaasTestTestjResponse) SetAge(v string) *ReplaceDemoSaasTestTestjResponse {
	s.Age = &v
	return s
}

type QueryDemoTestyyQRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s QueryDemoTestyyQRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDemoTestyyQRequest) GoString() string {
	return s.String()
}

func (s *QueryDemoTestyyQRequest) SetAuthToken(v string) *QueryDemoTestyyQRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDemoTestyyQRequest) SetProductInstanceId(v string) *QueryDemoTestyyQRequest {
	s.ProductInstanceId = &v
	return s
}

type QueryDemoTestyyQResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s QueryDemoTestyyQResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDemoTestyyQResponse) GoString() string {
	return s.String()
}

func (s *QueryDemoTestyyQResponse) SetReqMsgId(v string) *QueryDemoTestyyQResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDemoTestyyQResponse) SetResultCode(v string) *QueryDemoTestyyQResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDemoTestyyQResponse) SetResultMsg(v string) *QueryDemoTestyyQResponse {
	s.ResultMsg = &v
	return s
}

type QueryDemoTestzzQRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s QueryDemoTestzzQRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDemoTestzzQRequest) GoString() string {
	return s.String()
}

func (s *QueryDemoTestzzQRequest) SetAuthToken(v string) *QueryDemoTestzzQRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDemoTestzzQRequest) SetProductInstanceId(v string) *QueryDemoTestzzQRequest {
	s.ProductInstanceId = &v
	return s
}

type QueryDemoTestzzQResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s QueryDemoTestzzQResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDemoTestzzQResponse) GoString() string {
	return s.String()
}

func (s *QueryDemoTestzzQResponse) SetReqMsgId(v string) *QueryDemoTestzzQResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDemoTestzzQResponse) SetResultCode(v string) *QueryDemoTestzzQResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDemoTestzzQResponse) SetResultMsg(v string) *QueryDemoTestzzQResponse {
	s.ResultMsg = &v
	return s
}

type QueryDemoTestzzzQRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s QueryDemoTestzzzQRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDemoTestzzzQRequest) GoString() string {
	return s.String()
}

func (s *QueryDemoTestzzzQRequest) SetAuthToken(v string) *QueryDemoTestzzzQRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDemoTestzzzQRequest) SetProductInstanceId(v string) *QueryDemoTestzzzQRequest {
	s.ProductInstanceId = &v
	return s
}

type QueryDemoTestzzzQResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s QueryDemoTestzzzQResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDemoTestzzzQResponse) GoString() string {
	return s.String()
}

func (s *QueryDemoTestzzzQResponse) SetReqMsgId(v string) *QueryDemoTestzzzQResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDemoTestzzzQResponse) SetResultCode(v string) *QueryDemoTestzzzQResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDemoTestzzzQResponse) SetResultMsg(v string) *QueryDemoTestzzzQResponse {
	s.ResultMsg = &v
	return s
}

type QueryDemoZolozFacecompareRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 123
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 123
	Face1 *FaceImage `json:"face1,omitempty" xml:"face1,omitempty"`
	// 123
	Face2 *FaceImage `json:"face2,omitempty" xml:"face2,omitempty"`
}

func (s QueryDemoZolozFacecompareRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDemoZolozFacecompareRequest) GoString() string {
	return s.String()
}

func (s *QueryDemoZolozFacecompareRequest) SetAuthToken(v string) *QueryDemoZolozFacecompareRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDemoZolozFacecompareRequest) SetProductInstanceId(v string) *QueryDemoZolozFacecompareRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryDemoZolozFacecompareRequest) SetBizId(v string) *QueryDemoZolozFacecompareRequest {
	s.BizId = &v
	return s
}

func (s *QueryDemoZolozFacecompareRequest) SetFace1(v *FaceImage) *QueryDemoZolozFacecompareRequest {
	s.Face1 = v
	return s
}

func (s *QueryDemoZolozFacecompareRequest) SetFace2(v *FaceImage) *QueryDemoZolozFacecompareRequest {
	s.Face2 = v
	return s
}

type QueryDemoZolozFacecompareResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 123
	TransactionId *string `json:"transaction_id,omitempty" xml:"transaction_id,omitempty"`
	// 123
	SamePerson *bool `json:"same_person,omitempty" xml:"same_person,omitempty"`
	// 123
	Score *string `json:"score,omitempty" xml:"score,omitempty"`
}

func (s QueryDemoZolozFacecompareResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDemoZolozFacecompareResponse) GoString() string {
	return s.String()
}

func (s *QueryDemoZolozFacecompareResponse) SetReqMsgId(v string) *QueryDemoZolozFacecompareResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDemoZolozFacecompareResponse) SetResultCode(v string) *QueryDemoZolozFacecompareResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDemoZolozFacecompareResponse) SetResultMsg(v string) *QueryDemoZolozFacecompareResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDemoZolozFacecompareResponse) SetTransactionId(v string) *QueryDemoZolozFacecompareResponse {
	s.TransactionId = &v
	return s
}

func (s *QueryDemoZolozFacecompareResponse) SetSamePerson(v bool) *QueryDemoZolozFacecompareResponse {
	s.SamePerson = &v
	return s
}

func (s *QueryDemoZolozFacecompareResponse) SetScore(v string) *QueryDemoZolozFacecompareResponse {
	s.Score = &v
	return s
}

type QueryDemoXyzDemoXxxRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s QueryDemoXyzDemoXxxRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDemoXyzDemoXxxRequest) GoString() string {
	return s.String()
}

func (s *QueryDemoXyzDemoXxxRequest) SetAuthToken(v string) *QueryDemoXyzDemoXxxRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDemoXyzDemoXxxRequest) SetProductInstanceId(v string) *QueryDemoXyzDemoXxxRequest {
	s.ProductInstanceId = &v
	return s
}

type QueryDemoXyzDemoXxxResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s QueryDemoXyzDemoXxxResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDemoXyzDemoXxxResponse) GoString() string {
	return s.String()
}

func (s *QueryDemoXyzDemoXxxResponse) SetReqMsgId(v string) *QueryDemoXyzDemoXxxResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDemoXyzDemoXxxResponse) SetResultCode(v string) *QueryDemoXyzDemoXxxResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDemoXyzDemoXxxResponse) SetResultMsg(v string) *QueryDemoXyzDemoXxxResponse {
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
				"sdk_version":      tea.String("1.0.178"),
				"_prod_code":       tea.String("ak_ee637c8293f64104af9686dc12e0cd18"),
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
 * Description: sss
 * Summary: ss
 */
func (client *Client) BindDemoSssSsSs(request *BindDemoSssSsSsRequest) (_result *BindDemoSssSsSsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &BindDemoSssSsSsResponse{}
	_body, _err := client.BindDemoSssSsSsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: sss
 * Summary: ss
 */
func (client *Client) BindDemoSssSsSsEx(request *BindDemoSssSsSsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *BindDemoSssSsSsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &BindDemoSssSsSsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.sss.ss.ss.bind"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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

/**
 * Description: sdf
 * Summary: sdf
 */
func (client *Client) BindDemoSdfSssSss(request *BindDemoSdfSssSssRequest) (_result *BindDemoSdfSssSssResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &BindDemoSdfSssSssResponse{}
	_body, _err := client.BindDemoSdfSssSssEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: sdf
 * Summary: sdf
 */
func (client *Client) BindDemoSdfSssSssEx(request *BindDemoSdfSssSssRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *BindDemoSdfSssSssResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &BindDemoSdfSssSssResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.sdf.sss.sss.bind"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
 * Description: cj test
 * Summary: cj test
 */
func (client *Client) QueryDemoCjtestCjRes(request *QueryDemoCjtestCjResRequest) (_result *QueryDemoCjtestCjResResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDemoCjtestCjResResponse{}
	_body, _err := client.QueryDemoCjtestCjResEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: cj test
 * Summary: cj test
 */
func (client *Client) QueryDemoCjtestCjResEx(request *QueryDemoCjtestCjResRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDemoCjtestCjResResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDemoCjtestCjResResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.cjtest.cj.res.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: testc
 * Summary: 测试用api
 */
func (client *Client) PublishDemoSaasTestTestc(request *PublishDemoSaasTestTestcRequest) (_result *PublishDemoSaasTestTestcResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PublishDemoSaasTestTestcResponse{}
	_body, _err := client.PublishDemoSaasTestTestcEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: testc
 * Summary: 测试用api
 */
func (client *Client) PublishDemoSaasTestTestcEx(request *PublishDemoSaasTestTestcRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PublishDemoSaasTestTestcResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PublishDemoSaasTestTestcResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.saas.test.testc.publish"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 共享能力租户流量测试
 * Summary: 共享能力租户流量测试
 */
func (client *Client) CreateDemoSaasTestTesth(request *CreateDemoSaasTestTesthRequest) (_result *CreateDemoSaasTestTesthResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateDemoSaasTestTesthResponse{}
	_body, _err := client.CreateDemoSaasTestTesthEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 共享能力租户流量测试
 * Summary: 共享能力租户流量测试
 */
func (client *Client) CreateDemoSaasTestTesthEx(request *CreateDemoSaasTestTesthRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateDemoSaasTestTesthResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateDemoSaasTestTesthResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.saas.test.testh.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 共享能力租户流量测试
 * Summary: 共享能力租户流量测试
 */
func (client *Client) CreateDemoSaasTestTesti(request *CreateDemoSaasTestTestiRequest) (_result *CreateDemoSaasTestTestiResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateDemoSaasTestTestiResponse{}
	_body, _err := client.CreateDemoSaasTestTestiEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 共享能力租户流量测试
 * Summary: 共享能力租户流量测试
 */
func (client *Client) CreateDemoSaasTestTestiEx(request *CreateDemoSaasTestTestiRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateDemoSaasTestTestiResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateDemoSaasTestTestiResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.saas.test.testi.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 共享能力租户流量测试
 * Summary: 共享能力租户流量测试
 */
func (client *Client) ReplaceDemoSaasTestTestj(request *ReplaceDemoSaasTestTestjRequest) (_result *ReplaceDemoSaasTestTestjResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ReplaceDemoSaasTestTestjResponse{}
	_body, _err := client.ReplaceDemoSaasTestTestjEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 共享能力租户流量测试
 * Summary: 共享能力租户流量测试
 */
func (client *Client) ReplaceDemoSaasTestTestjEx(request *ReplaceDemoSaasTestTestjRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ReplaceDemoSaasTestTestjResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ReplaceDemoSaasTestTestjResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.saas.test.testj.replace"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 2
 * Summary: 2
 */
func (client *Client) QueryDemoTestyyQ(request *QueryDemoTestyyQRequest) (_result *QueryDemoTestyyQResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDemoTestyyQResponse{}
	_body, _err := client.QueryDemoTestyyQEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 2
 * Summary: 2
 */
func (client *Client) QueryDemoTestyyQEx(request *QueryDemoTestyyQRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDemoTestyyQResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDemoTestyyQResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.testyy.q.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 1
 * Summary: 1
 */
func (client *Client) QueryDemoTestzzQ(request *QueryDemoTestzzQRequest) (_result *QueryDemoTestzzQResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDemoTestzzQResponse{}
	_body, _err := client.QueryDemoTestzzQEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 1
 * Summary: 1
 */
func (client *Client) QueryDemoTestzzQEx(request *QueryDemoTestzzQRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDemoTestzzQResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDemoTestzzQResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.testzz.q.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 1
 * Summary: 1
 */
func (client *Client) QueryDemoTestzzzQ(request *QueryDemoTestzzzQRequest) (_result *QueryDemoTestzzzQResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDemoTestzzzQResponse{}
	_body, _err := client.QueryDemoTestzzzQEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 1
 * Summary: 1
 */
func (client *Client) QueryDemoTestzzzQEx(request *QueryDemoTestzzzQRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDemoTestzzzQResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDemoTestzzzQResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.testzzz.q.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 测试佐罗接口
 * Summary: 测试佐罗接口
 */
func (client *Client) QueryDemoZolozFacecompare(request *QueryDemoZolozFacecompareRequest) (_result *QueryDemoZolozFacecompareResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDemoZolozFacecompareResponse{}
	_body, _err := client.QueryDemoZolozFacecompareEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 测试佐罗接口
 * Summary: 测试佐罗接口
 */
func (client *Client) QueryDemoZolozFacecompareEx(request *QueryDemoZolozFacecompareRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDemoZolozFacecompareResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDemoZolozFacecompareResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.zoloz.facecompare.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: test
 * Summary: test
 */
func (client *Client) QueryDemoXyzDemoXxx(request *QueryDemoXyzDemoXxxRequest) (_result *QueryDemoXyzDemoXxxResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDemoXyzDemoXxxResponse{}
	_body, _err := client.QueryDemoXyzDemoXxxEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: test
 * Summary: test
 */
func (client *Client) QueryDemoXyzDemoXxxEx(request *QueryDemoXyzDemoXxxRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDemoXyzDemoXxxResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDemoXyzDemoXxxResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.xyz.demo.xxx.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
