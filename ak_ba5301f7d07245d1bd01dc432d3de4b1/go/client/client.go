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

type QueryDemoSaasTestTestaRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 张三
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 12
	Age *int64 `json:"age,omitempty" xml:"age,omitempty" require:"true"`
}

func (s QueryDemoSaasTestTestaRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDemoSaasTestTestaRequest) GoString() string {
	return s.String()
}

func (s *QueryDemoSaasTestTestaRequest) SetAuthToken(v string) *QueryDemoSaasTestTestaRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDemoSaasTestTestaRequest) SetProductInstanceId(v string) *QueryDemoSaasTestTestaRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryDemoSaasTestTestaRequest) SetName(v string) *QueryDemoSaasTestTestaRequest {
	s.Name = &v
	return s
}

func (s *QueryDemoSaasTestTestaRequest) SetAge(v int64) *QueryDemoSaasTestTestaRequest {
	s.Age = &v
	return s
}

type QueryDemoSaasTestTestaResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 男
	Sex *string `json:"sex,omitempty" xml:"sex,omitempty"`
}

func (s QueryDemoSaasTestTestaResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDemoSaasTestTestaResponse) GoString() string {
	return s.String()
}

func (s *QueryDemoSaasTestTestaResponse) SetReqMsgId(v string) *QueryDemoSaasTestTestaResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDemoSaasTestTestaResponse) SetResultCode(v string) *QueryDemoSaasTestTestaResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDemoSaasTestTestaResponse) SetResultMsg(v string) *QueryDemoSaasTestTestaResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDemoSaasTestTestaResponse) SetSex(v string) *QueryDemoSaasTestTestaResponse {
	s.Sex = &v
	return s
}

type ImportDemoSaasTestTestbRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 李四
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 18
	Age *int64 `json:"age,omitempty" xml:"age,omitempty" require:"true"`
}

func (s ImportDemoSaasTestTestbRequest) String() string {
	return tea.Prettify(s)
}

func (s ImportDemoSaasTestTestbRequest) GoString() string {
	return s.String()
}

func (s *ImportDemoSaasTestTestbRequest) SetAuthToken(v string) *ImportDemoSaasTestTestbRequest {
	s.AuthToken = &v
	return s
}

func (s *ImportDemoSaasTestTestbRequest) SetProductInstanceId(v string) *ImportDemoSaasTestTestbRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ImportDemoSaasTestTestbRequest) SetName(v string) *ImportDemoSaasTestTestbRequest {
	s.Name = &v
	return s
}

func (s *ImportDemoSaasTestTestbRequest) SetAge(v int64) *ImportDemoSaasTestTestbRequest {
	s.Age = &v
	return s
}

type ImportDemoSaasTestTestbResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 男
	Sex *string `json:"sex,omitempty" xml:"sex,omitempty"`
}

func (s ImportDemoSaasTestTestbResponse) String() string {
	return tea.Prettify(s)
}

func (s ImportDemoSaasTestTestbResponse) GoString() string {
	return s.String()
}

func (s *ImportDemoSaasTestTestbResponse) SetReqMsgId(v string) *ImportDemoSaasTestTestbResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ImportDemoSaasTestTestbResponse) SetResultCode(v string) *ImportDemoSaasTestTestbResponse {
	s.ResultCode = &v
	return s
}

func (s *ImportDemoSaasTestTestbResponse) SetResultMsg(v string) *ImportDemoSaasTestTestbResponse {
	s.ResultMsg = &v
	return s
}

func (s *ImportDemoSaasTestTestbResponse) SetSex(v string) *ImportDemoSaasTestTestbResponse {
	s.Sex = &v
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

type ResetDemoSaasTestTestdRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// test
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
}

func (s ResetDemoSaasTestTestdRequest) String() string {
	return tea.Prettify(s)
}

func (s ResetDemoSaasTestTestdRequest) GoString() string {
	return s.String()
}

func (s *ResetDemoSaasTestTestdRequest) SetAuthToken(v string) *ResetDemoSaasTestTestdRequest {
	s.AuthToken = &v
	return s
}

func (s *ResetDemoSaasTestTestdRequest) SetProductInstanceId(v string) *ResetDemoSaasTestTestdRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ResetDemoSaasTestTestdRequest) SetName(v string) *ResetDemoSaasTestTestdRequest {
	s.Name = &v
	return s
}

type ResetDemoSaasTestTestdResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// test
	Age *string `json:"age,omitempty" xml:"age,omitempty"`
}

func (s ResetDemoSaasTestTestdResponse) String() string {
	return tea.Prettify(s)
}

func (s ResetDemoSaasTestTestdResponse) GoString() string {
	return s.String()
}

func (s *ResetDemoSaasTestTestdResponse) SetReqMsgId(v string) *ResetDemoSaasTestTestdResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ResetDemoSaasTestTestdResponse) SetResultCode(v string) *ResetDemoSaasTestTestdResponse {
	s.ResultCode = &v
	return s
}

func (s *ResetDemoSaasTestTestdResponse) SetResultMsg(v string) *ResetDemoSaasTestTestdResponse {
	s.ResultMsg = &v
	return s
}

func (s *ResetDemoSaasTestTestdResponse) SetAge(v string) *ResetDemoSaasTestTestdResponse {
	s.Age = &v
	return s
}

type OperateDemoSaasTestTesteRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// test
	Age *string `json:"age,omitempty" xml:"age,omitempty" require:"true"`
}

func (s OperateDemoSaasTestTesteRequest) String() string {
	return tea.Prettify(s)
}

func (s OperateDemoSaasTestTesteRequest) GoString() string {
	return s.String()
}

func (s *OperateDemoSaasTestTesteRequest) SetAuthToken(v string) *OperateDemoSaasTestTesteRequest {
	s.AuthToken = &v
	return s
}

func (s *OperateDemoSaasTestTesteRequest) SetProductInstanceId(v string) *OperateDemoSaasTestTesteRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *OperateDemoSaasTestTesteRequest) SetAge(v string) *OperateDemoSaasTestTesteRequest {
	s.Age = &v
	return s
}

type OperateDemoSaasTestTesteResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// test
	Age *string `json:"age,omitempty" xml:"age,omitempty"`
}

func (s OperateDemoSaasTestTesteResponse) String() string {
	return tea.Prettify(s)
}

func (s OperateDemoSaasTestTesteResponse) GoString() string {
	return s.String()
}

func (s *OperateDemoSaasTestTesteResponse) SetReqMsgId(v string) *OperateDemoSaasTestTesteResponse {
	s.ReqMsgId = &v
	return s
}

func (s *OperateDemoSaasTestTesteResponse) SetResultCode(v string) *OperateDemoSaasTestTesteResponse {
	s.ResultCode = &v
	return s
}

func (s *OperateDemoSaasTestTesteResponse) SetResultMsg(v string) *OperateDemoSaasTestTesteResponse {
	s.ResultMsg = &v
	return s
}

func (s *OperateDemoSaasTestTesteResponse) SetAge(v string) *OperateDemoSaasTestTesteResponse {
	s.Age = &v
	return s
}

type BatchcreateDemoSaasTestTestfRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// test
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
}

func (s BatchcreateDemoSaasTestTestfRequest) String() string {
	return tea.Prettify(s)
}

func (s BatchcreateDemoSaasTestTestfRequest) GoString() string {
	return s.String()
}

func (s *BatchcreateDemoSaasTestTestfRequest) SetAuthToken(v string) *BatchcreateDemoSaasTestTestfRequest {
	s.AuthToken = &v
	return s
}

func (s *BatchcreateDemoSaasTestTestfRequest) SetProductInstanceId(v string) *BatchcreateDemoSaasTestTestfRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *BatchcreateDemoSaasTestTestfRequest) SetName(v string) *BatchcreateDemoSaasTestTestfRequest {
	s.Name = &v
	return s
}

type BatchcreateDemoSaasTestTestfResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// test
	Age *string `json:"age,omitempty" xml:"age,omitempty"`
}

func (s BatchcreateDemoSaasTestTestfResponse) String() string {
	return tea.Prettify(s)
}

func (s BatchcreateDemoSaasTestTestfResponse) GoString() string {
	return s.String()
}

func (s *BatchcreateDemoSaasTestTestfResponse) SetReqMsgId(v string) *BatchcreateDemoSaasTestTestfResponse {
	s.ReqMsgId = &v
	return s
}

func (s *BatchcreateDemoSaasTestTestfResponse) SetResultCode(v string) *BatchcreateDemoSaasTestTestfResponse {
	s.ResultCode = &v
	return s
}

func (s *BatchcreateDemoSaasTestTestfResponse) SetResultMsg(v string) *BatchcreateDemoSaasTestTestfResponse {
	s.ResultMsg = &v
	return s
}

func (s *BatchcreateDemoSaasTestTestfResponse) SetAge(v string) *BatchcreateDemoSaasTestTestfResponse {
	s.Age = &v
	return s
}

type OpenDemoSaasTestTestgRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// test
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
}

func (s OpenDemoSaasTestTestgRequest) String() string {
	return tea.Prettify(s)
}

func (s OpenDemoSaasTestTestgRequest) GoString() string {
	return s.String()
}

func (s *OpenDemoSaasTestTestgRequest) SetAuthToken(v string) *OpenDemoSaasTestTestgRequest {
	s.AuthToken = &v
	return s
}

func (s *OpenDemoSaasTestTestgRequest) SetProductInstanceId(v string) *OpenDemoSaasTestTestgRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *OpenDemoSaasTestTestgRequest) SetName(v string) *OpenDemoSaasTestTestgRequest {
	s.Name = &v
	return s
}

type OpenDemoSaasTestTestgResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// test
	Sex *string `json:"sex,omitempty" xml:"sex,omitempty"`
}

func (s OpenDemoSaasTestTestgResponse) String() string {
	return tea.Prettify(s)
}

func (s OpenDemoSaasTestTestgResponse) GoString() string {
	return s.String()
}

func (s *OpenDemoSaasTestTestgResponse) SetReqMsgId(v string) *OpenDemoSaasTestTestgResponse {
	s.ReqMsgId = &v
	return s
}

func (s *OpenDemoSaasTestTestgResponse) SetResultCode(v string) *OpenDemoSaasTestTestgResponse {
	s.ResultCode = &v
	return s
}

func (s *OpenDemoSaasTestTestgResponse) SetResultMsg(v string) *OpenDemoSaasTestTestgResponse {
	s.ResultMsg = &v
	return s
}

func (s *OpenDemoSaasTestTestgResponse) SetSex(v string) *OpenDemoSaasTestTestgResponse {
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

type SendDemoSaasTestTestkRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// test
	Age *string `json:"age,omitempty" xml:"age,omitempty" require:"true"`
}

func (s SendDemoSaasTestTestkRequest) String() string {
	return tea.Prettify(s)
}

func (s SendDemoSaasTestTestkRequest) GoString() string {
	return s.String()
}

func (s *SendDemoSaasTestTestkRequest) SetAuthToken(v string) *SendDemoSaasTestTestkRequest {
	s.AuthToken = &v
	return s
}

func (s *SendDemoSaasTestTestkRequest) SetProductInstanceId(v string) *SendDemoSaasTestTestkRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SendDemoSaasTestTestkRequest) SetAge(v string) *SendDemoSaasTestTestkRequest {
	s.Age = &v
	return s
}

type SendDemoSaasTestTestkResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// test
	Sex *string `json:"sex,omitempty" xml:"sex,omitempty"`
}

func (s SendDemoSaasTestTestkResponse) String() string {
	return tea.Prettify(s)
}

func (s SendDemoSaasTestTestkResponse) GoString() string {
	return s.String()
}

func (s *SendDemoSaasTestTestkResponse) SetReqMsgId(v string) *SendDemoSaasTestTestkResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SendDemoSaasTestTestkResponse) SetResultCode(v string) *SendDemoSaasTestTestkResponse {
	s.ResultCode = &v
	return s
}

func (s *SendDemoSaasTestTestkResponse) SetResultMsg(v string) *SendDemoSaasTestTestkResponse {
	s.ResultMsg = &v
	return s
}

func (s *SendDemoSaasTestTestkResponse) SetSex(v string) *SendDemoSaasTestTestkResponse {
	s.Sex = &v
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
				"sdk_version":      tea.String("1.0.2"),
				"_prod_code":       tea.String("ak_ba5301f7d07245d1bd01dc432d3de4b1"),
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
 * Description: testa
 * Summary: 测试用api
 */
func (client *Client) QueryDemoSaasTestTesta(request *QueryDemoSaasTestTestaRequest) (_result *QueryDemoSaasTestTestaResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDemoSaasTestTestaResponse{}
	_body, _err := client.QueryDemoSaasTestTestaEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: testa
 * Summary: 测试用api
 */
func (client *Client) QueryDemoSaasTestTestaEx(request *QueryDemoSaasTestTestaRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDemoSaasTestTestaResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDemoSaasTestTestaResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.saas.test.testa.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: testB
 * Summary: 测试用api
 */
func (client *Client) ImportDemoSaasTestTestb(request *ImportDemoSaasTestTestbRequest) (_result *ImportDemoSaasTestTestbResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ImportDemoSaasTestTestbResponse{}
	_body, _err := client.ImportDemoSaasTestTestbEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: testB
 * Summary: 测试用api
 */
func (client *Client) ImportDemoSaasTestTestbEx(request *ImportDemoSaasTestTestbRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ImportDemoSaasTestTestbResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ImportDemoSaasTestTestbResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.saas.test.testb.import"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) ResetDemoSaasTestTestd(request *ResetDemoSaasTestTestdRequest) (_result *ResetDemoSaasTestTestdResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ResetDemoSaasTestTestdResponse{}
	_body, _err := client.ResetDemoSaasTestTestdEx(request, headers, runtime)
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
func (client *Client) ResetDemoSaasTestTestdEx(request *ResetDemoSaasTestTestdRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ResetDemoSaasTestTestdResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ResetDemoSaasTestTestdResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.saas.test.testd.reset"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) OperateDemoSaasTestTeste(request *OperateDemoSaasTestTesteRequest) (_result *OperateDemoSaasTestTesteResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &OperateDemoSaasTestTesteResponse{}
	_body, _err := client.OperateDemoSaasTestTesteEx(request, headers, runtime)
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
func (client *Client) OperateDemoSaasTestTesteEx(request *OperateDemoSaasTestTesteRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *OperateDemoSaasTestTesteResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &OperateDemoSaasTestTesteResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.saas.test.teste.operate"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) BatchcreateDemoSaasTestTestf(request *BatchcreateDemoSaasTestTestfRequest) (_result *BatchcreateDemoSaasTestTestfResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &BatchcreateDemoSaasTestTestfResponse{}
	_body, _err := client.BatchcreateDemoSaasTestTestfEx(request, headers, runtime)
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
func (client *Client) BatchcreateDemoSaasTestTestfEx(request *BatchcreateDemoSaasTestTestfRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *BatchcreateDemoSaasTestTestfResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &BatchcreateDemoSaasTestTestfResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.saas.test.testf.batchcreate"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) OpenDemoSaasTestTestg(request *OpenDemoSaasTestTestgRequest) (_result *OpenDemoSaasTestTestgResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &OpenDemoSaasTestTestgResponse{}
	_body, _err := client.OpenDemoSaasTestTestgEx(request, headers, runtime)
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
func (client *Client) OpenDemoSaasTestTestgEx(request *OpenDemoSaasTestTestgRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *OpenDemoSaasTestTestgResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &OpenDemoSaasTestTestgResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.saas.test.testg.open"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
 * Description: 共享能力租户流量测试
 * Summary: 共享能力租户流量测试
 */
func (client *Client) SendDemoSaasTestTestk(request *SendDemoSaasTestTestkRequest) (_result *SendDemoSaasTestTestkResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SendDemoSaasTestTestkResponse{}
	_body, _err := client.SendDemoSaasTestTestkEx(request, headers, runtime)
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
func (client *Client) SendDemoSaasTestTestkEx(request *SendDemoSaasTestTestkRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SendDemoSaasTestTestkResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SendDemoSaasTestTestkResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.saas.test.testk.send"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
