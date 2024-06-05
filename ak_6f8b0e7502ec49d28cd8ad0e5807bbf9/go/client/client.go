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

type BindDemoAaaBbbCcdRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s BindDemoAaaBbbCcdRequest) String() string {
	return tea.Prettify(s)
}

func (s BindDemoAaaBbbCcdRequest) GoString() string {
	return s.String()
}

func (s *BindDemoAaaBbbCcdRequest) SetAuthToken(v string) *BindDemoAaaBbbCcdRequest {
	s.AuthToken = &v
	return s
}

func (s *BindDemoAaaBbbCcdRequest) SetProductInstanceId(v string) *BindDemoAaaBbbCcdRequest {
	s.ProductInstanceId = &v
	return s
}

type BindDemoAaaBbbCcdResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s BindDemoAaaBbbCcdResponse) String() string {
	return tea.Prettify(s)
}

func (s BindDemoAaaBbbCcdResponse) GoString() string {
	return s.String()
}

func (s *BindDemoAaaBbbCcdResponse) SetReqMsgId(v string) *BindDemoAaaBbbCcdResponse {
	s.ReqMsgId = &v
	return s
}

func (s *BindDemoAaaBbbCcdResponse) SetResultCode(v string) *BindDemoAaaBbbCcdResponse {
	s.ResultCode = &v
	return s
}

func (s *BindDemoAaaBbbCcdResponse) SetResultMsg(v string) *BindDemoAaaBbbCcdResponse {
	s.ResultMsg = &v
	return s
}

type QueryDemoAcopmAtoWithholdRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单id 长度不可超过50
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
}

func (s QueryDemoAcopmAtoWithholdRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDemoAcopmAtoWithholdRequest) GoString() string {
	return s.String()
}

func (s *QueryDemoAcopmAtoWithholdRequest) SetAuthToken(v string) *QueryDemoAcopmAtoWithholdRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDemoAcopmAtoWithholdRequest) SetProductInstanceId(v string) *QueryDemoAcopmAtoWithholdRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryDemoAcopmAtoWithholdRequest) SetOrderId(v string) *QueryDemoAcopmAtoWithholdRequest {
	s.OrderId = &v
	return s
}

type QueryDemoAcopmAtoWithholdResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 协议生效时间
	ValidTime *string `json:"valid_time,omitempty" xml:"valid_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 协议当前状态 1. UNSIGNED：未签约 2. SIG...
	//
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 协议失效时间
	InvalidTime *string `json:"invalid_time,omitempty" xml:"invalid_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 协议签署时间
	SignTime *string `json:"sign_time,omitempty" xml:"sign_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
}

func (s QueryDemoAcopmAtoWithholdResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDemoAcopmAtoWithholdResponse) GoString() string {
	return s.String()
}

func (s *QueryDemoAcopmAtoWithholdResponse) SetReqMsgId(v string) *QueryDemoAcopmAtoWithholdResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDemoAcopmAtoWithholdResponse) SetResultCode(v string) *QueryDemoAcopmAtoWithholdResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDemoAcopmAtoWithholdResponse) SetResultMsg(v string) *QueryDemoAcopmAtoWithholdResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDemoAcopmAtoWithholdResponse) SetValidTime(v string) *QueryDemoAcopmAtoWithholdResponse {
	s.ValidTime = &v
	return s
}

func (s *QueryDemoAcopmAtoWithholdResponse) SetStatus(v string) *QueryDemoAcopmAtoWithholdResponse {
	s.Status = &v
	return s
}

func (s *QueryDemoAcopmAtoWithholdResponse) SetInvalidTime(v string) *QueryDemoAcopmAtoWithholdResponse {
	s.InvalidTime = &v
	return s
}

func (s *QueryDemoAcopmAtoWithholdResponse) SetSignTime(v string) *QueryDemoAcopmAtoWithholdResponse {
	s.SignTime = &v
	return s
}

type QueryDemoApdevcenterTestobjectTestsubRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// test
	Test *string `json:"test,omitempty" xml:"test,omitempty" require:"true" maxLength:"200" minLength:"200"`
}

func (s QueryDemoApdevcenterTestobjectTestsubRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDemoApdevcenterTestobjectTestsubRequest) GoString() string {
	return s.String()
}

func (s *QueryDemoApdevcenterTestobjectTestsubRequest) SetAuthToken(v string) *QueryDemoApdevcenterTestobjectTestsubRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDemoApdevcenterTestobjectTestsubRequest) SetProductInstanceId(v string) *QueryDemoApdevcenterTestobjectTestsubRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryDemoApdevcenterTestobjectTestsubRequest) SetTest(v string) *QueryDemoApdevcenterTestobjectTestsubRequest {
	s.Test = &v
	return s
}

type QueryDemoApdevcenterTestobjectTestsubResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s QueryDemoApdevcenterTestobjectTestsubResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDemoApdevcenterTestobjectTestsubResponse) GoString() string {
	return s.String()
}

func (s *QueryDemoApdevcenterTestobjectTestsubResponse) SetReqMsgId(v string) *QueryDemoApdevcenterTestobjectTestsubResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDemoApdevcenterTestobjectTestsubResponse) SetResultCode(v string) *QueryDemoApdevcenterTestobjectTestsubResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDemoApdevcenterTestobjectTestsubResponse) SetResultMsg(v string) *QueryDemoApdevcenterTestobjectTestsubResponse {
	s.ResultMsg = &v
	return s
}

type QueryDemoApdevcenterTestobjectTestsubaRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 主键
	Id *int64 `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true" maxLength:"521"`
	// test
	Test *string `json:"test,omitempty" xml:"test,omitempty" require:"true"`
}

func (s QueryDemoApdevcenterTestobjectTestsubaRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDemoApdevcenterTestobjectTestsubaRequest) GoString() string {
	return s.String()
}

func (s *QueryDemoApdevcenterTestobjectTestsubaRequest) SetAuthToken(v string) *QueryDemoApdevcenterTestobjectTestsubaRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDemoApdevcenterTestobjectTestsubaRequest) SetProductInstanceId(v string) *QueryDemoApdevcenterTestobjectTestsubaRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryDemoApdevcenterTestobjectTestsubaRequest) SetId(v int64) *QueryDemoApdevcenterTestobjectTestsubaRequest {
	s.Id = &v
	return s
}

func (s *QueryDemoApdevcenterTestobjectTestsubaRequest) SetName(v string) *QueryDemoApdevcenterTestobjectTestsubaRequest {
	s.Name = &v
	return s
}

func (s *QueryDemoApdevcenterTestobjectTestsubaRequest) SetTest(v string) *QueryDemoApdevcenterTestobjectTestsubaRequest {
	s.Test = &v
	return s
}

type QueryDemoApdevcenterTestobjectTestsubaResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 主键
	Id *int64 `json:"id,omitempty" xml:"id,omitempty"`
	// 名称
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 描述
	Desc *string `json:"desc,omitempty" xml:"desc,omitempty"`
}

func (s QueryDemoApdevcenterTestobjectTestsubaResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDemoApdevcenterTestobjectTestsubaResponse) GoString() string {
	return s.String()
}

func (s *QueryDemoApdevcenterTestobjectTestsubaResponse) SetReqMsgId(v string) *QueryDemoApdevcenterTestobjectTestsubaResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDemoApdevcenterTestobjectTestsubaResponse) SetResultCode(v string) *QueryDemoApdevcenterTestobjectTestsubaResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDemoApdevcenterTestobjectTestsubaResponse) SetResultMsg(v string) *QueryDemoApdevcenterTestobjectTestsubaResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDemoApdevcenterTestobjectTestsubaResponse) SetId(v int64) *QueryDemoApdevcenterTestobjectTestsubaResponse {
	s.Id = &v
	return s
}

func (s *QueryDemoApdevcenterTestobjectTestsubaResponse) SetName(v string) *QueryDemoApdevcenterTestobjectTestsubaResponse {
	s.Name = &v
	return s
}

func (s *QueryDemoApdevcenterTestobjectTestsubaResponse) SetDesc(v string) *QueryDemoApdevcenterTestobjectTestsubaResponse {
	s.Desc = &v
	return s
}

type QueryDemoTestproductTestobjectTestsubaaaRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// test
	Id *int64 `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// test
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
}

func (s QueryDemoTestproductTestobjectTestsubaaaRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDemoTestproductTestobjectTestsubaaaRequest) GoString() string {
	return s.String()
}

func (s *QueryDemoTestproductTestobjectTestsubaaaRequest) SetAuthToken(v string) *QueryDemoTestproductTestobjectTestsubaaaRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDemoTestproductTestobjectTestsubaaaRequest) SetProductInstanceId(v string) *QueryDemoTestproductTestobjectTestsubaaaRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryDemoTestproductTestobjectTestsubaaaRequest) SetId(v int64) *QueryDemoTestproductTestobjectTestsubaaaRequest {
	s.Id = &v
	return s
}

func (s *QueryDemoTestproductTestobjectTestsubaaaRequest) SetName(v string) *QueryDemoTestproductTestobjectTestsubaaaRequest {
	s.Name = &v
	return s
}

type QueryDemoTestproductTestobjectTestsubaaaResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// test
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
}

func (s QueryDemoTestproductTestobjectTestsubaaaResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDemoTestproductTestobjectTestsubaaaResponse) GoString() string {
	return s.String()
}

func (s *QueryDemoTestproductTestobjectTestsubaaaResponse) SetReqMsgId(v string) *QueryDemoTestproductTestobjectTestsubaaaResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDemoTestproductTestobjectTestsubaaaResponse) SetResultCode(v string) *QueryDemoTestproductTestobjectTestsubaaaResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDemoTestproductTestobjectTestsubaaaResponse) SetResultMsg(v string) *QueryDemoTestproductTestobjectTestsubaaaResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDemoTestproductTestobjectTestsubaaaResponse) SetName(v string) *QueryDemoTestproductTestobjectTestsubaaaResponse {
	s.Name = &v
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
				"sdk_version":      tea.String("1.0.1"),
				"_prod_code":       tea.String("ak_6f8b0e7502ec49d28cd8ad0e5807bbf9"),
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
 * Description: 自动化测试创建111
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
 * Description: 自动化测试创建111
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
 * Description: 123
 * Summary: 测试用api
 */
func (client *Client) BindDemoAaaBbbCcd(request *BindDemoAaaBbbCcdRequest) (_result *BindDemoAaaBbbCcdResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &BindDemoAaaBbbCcdResponse{}
	_body, _err := client.BindDemoAaaBbbCcdEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 123
 * Summary: 测试用api
 */
func (client *Client) BindDemoAaaBbbCcdEx(request *BindDemoAaaBbbCcdRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *BindDemoAaaBbbCcdResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &BindDemoAaaBbbCcdResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.aaa.bbb.ccd.bind"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 测试
 * Summary: 测试ato异常
 */
func (client *Client) QueryDemoAcopmAtoWithhold(request *QueryDemoAcopmAtoWithholdRequest) (_result *QueryDemoAcopmAtoWithholdResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDemoAcopmAtoWithholdResponse{}
	_body, _err := client.QueryDemoAcopmAtoWithholdEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 测试
 * Summary: 测试ato异常
 */
func (client *Client) QueryDemoAcopmAtoWithholdEx(request *QueryDemoAcopmAtoWithholdRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDemoAcopmAtoWithholdResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDemoAcopmAtoWithholdResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.acopm.ato.withhold.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: test
 * Summary: 新增API测试查询接口(只是测试使用)
 */
func (client *Client) QueryDemoApdevcenterTestobjectTestsub(request *QueryDemoApdevcenterTestobjectTestsubRequest) (_result *QueryDemoApdevcenterTestobjectTestsubResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDemoApdevcenterTestobjectTestsubResponse{}
	_body, _err := client.QueryDemoApdevcenterTestobjectTestsubEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: test
 * Summary: 新增API测试查询接口(只是测试使用)
 */
func (client *Client) QueryDemoApdevcenterTestobjectTestsubEx(request *QueryDemoApdevcenterTestobjectTestsubRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDemoApdevcenterTestobjectTestsubResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDemoApdevcenterTestobjectTestsubResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.apdevcenter.testobject.testsub.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: testtest
 * Summary: 新增API测试查询接口(只是测试使用)
 */
func (client *Client) QueryDemoApdevcenterTestobjectTestsuba(request *QueryDemoApdevcenterTestobjectTestsubaRequest) (_result *QueryDemoApdevcenterTestobjectTestsubaResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDemoApdevcenterTestobjectTestsubaResponse{}
	_body, _err := client.QueryDemoApdevcenterTestobjectTestsubaEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: testtest
 * Summary: 新增API测试查询接口(只是测试使用)
 */
func (client *Client) QueryDemoApdevcenterTestobjectTestsubaEx(request *QueryDemoApdevcenterTestobjectTestsubaRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDemoApdevcenterTestobjectTestsubaResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDemoApdevcenterTestobjectTestsubaResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.apdevcenter.testobject.testsuba.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: test
 * Summary: 新增API测试查询接口(只是测试使用)
 */
func (client *Client) QueryDemoTestproductTestobjectTestsubaaa(request *QueryDemoTestproductTestobjectTestsubaaaRequest) (_result *QueryDemoTestproductTestobjectTestsubaaaResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDemoTestproductTestobjectTestsubaaaResponse{}
	_body, _err := client.QueryDemoTestproductTestobjectTestsubaaaEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: test
 * Summary: 新增API测试查询接口(只是测试使用)
 */
func (client *Client) QueryDemoTestproductTestobjectTestsubaaaEx(request *QueryDemoTestproductTestobjectTestsubaaaRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDemoTestproductTestobjectTestsubaaaResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDemoTestproductTestobjectTestsubaaaResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.testproduct.testobject.testsubaaa.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
