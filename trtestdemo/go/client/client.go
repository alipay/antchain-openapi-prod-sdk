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

type AAARequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
}

func (s AAARequest) String() string {
	return tea.Prettify(s)
}

func (s AAARequest) GoString() string {
	return s.String()
}

func (s *AAARequest) SetAuthToken(v string) *AAARequest {
	s.AuthToken = &v
	return s
}

type AAAResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s AAAResponse) String() string {
	return tea.Prettify(s)
}

func (s AAAResponse) GoString() string {
	return s.String()
}

func (s *AAAResponse) SetReqMsgId(v string) *AAAResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AAAResponse) SetResultCode(v string) *AAAResponse {
	s.ResultCode = &v
	return s
}

func (s *AAAResponse) SetResultMsg(v string) *AAAResponse {
	s.ResultMsg = &v
	return s
}

type BBBRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
}

func (s BBBRequest) String() string {
	return tea.Prettify(s)
}

func (s BBBRequest) GoString() string {
	return s.String()
}

func (s *BBBRequest) SetAuthToken(v string) *BBBRequest {
	s.AuthToken = &v
	return s
}

type BBBResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s BBBResponse) String() string {
	return tea.Prettify(s)
}

func (s BBBResponse) GoString() string {
	return s.String()
}

func (s *BBBResponse) SetReqMsgId(v string) *BBBResponse {
	s.ReqMsgId = &v
	return s
}

func (s *BBBResponse) SetResultCode(v string) *BBBResponse {
	s.ResultCode = &v
	return s
}

func (s *BBBResponse) SetResultMsg(v string) *BBBResponse {
	s.ResultMsg = &v
	return s
}

type QueryDebugPassedRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 入参
	Param *string `json:"param,omitempty" xml:"param,omitempty" require:"true"`
}

func (s QueryDebugPassedRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDebugPassedRequest) GoString() string {
	return s.String()
}

func (s *QueryDebugPassedRequest) SetAuthToken(v string) *QueryDebugPassedRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDebugPassedRequest) SetParam(v string) *QueryDebugPassedRequest {
	s.Param = &v
	return s
}

type QueryDebugPassedResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// OK
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// success
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
}

func (s QueryDebugPassedResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDebugPassedResponse) GoString() string {
	return s.String()
}

func (s *QueryDebugPassedResponse) SetReqMsgId(v string) *QueryDebugPassedResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDebugPassedResponse) SetResultCode(v string) *QueryDebugPassedResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDebugPassedResponse) SetResultMsg(v string) *QueryDebugPassedResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDebugPassedResponse) SetStatus(v string) *QueryDebugPassedResponse {
	s.Status = &v
	return s
}

func (s *QueryDebugPassedResponse) SetMsg(v string) *QueryDebugPassedResponse {
	s.Msg = &v
	return s
}

type QueryInternalFailureRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 入参
	Param *string `json:"param,omitempty" xml:"param,omitempty" require:"true"`
}

func (s QueryInternalFailureRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryInternalFailureRequest) GoString() string {
	return s.String()
}

func (s *QueryInternalFailureRequest) SetAuthToken(v string) *QueryInternalFailureRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryInternalFailureRequest) SetParam(v string) *QueryInternalFailureRequest {
	s.Param = &v
	return s
}

type QueryInternalFailureResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// OK
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// success
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
}

func (s QueryInternalFailureResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryInternalFailureResponse) GoString() string {
	return s.String()
}

func (s *QueryInternalFailureResponse) SetReqMsgId(v string) *QueryInternalFailureResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryInternalFailureResponse) SetResultCode(v string) *QueryInternalFailureResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryInternalFailureResponse) SetResultMsg(v string) *QueryInternalFailureResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryInternalFailureResponse) SetStatus(v string) *QueryInternalFailureResponse {
	s.Status = &v
	return s
}

func (s *QueryInternalFailureResponse) SetMsg(v string) *QueryInternalFailureResponse {
	s.Msg = &v
	return s
}

type QueryExternalFailureRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 入参
	Param *string `json:"param,omitempty" xml:"param,omitempty" require:"true"`
}

func (s QueryExternalFailureRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryExternalFailureRequest) GoString() string {
	return s.String()
}

func (s *QueryExternalFailureRequest) SetAuthToken(v string) *QueryExternalFailureRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryExternalFailureRequest) SetParam(v string) *QueryExternalFailureRequest {
	s.Param = &v
	return s
}

type QueryExternalFailureResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// OK
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// success
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
}

func (s QueryExternalFailureResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryExternalFailureResponse) GoString() string {
	return s.String()
}

func (s *QueryExternalFailureResponse) SetReqMsgId(v string) *QueryExternalFailureResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryExternalFailureResponse) SetResultCode(v string) *QueryExternalFailureResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryExternalFailureResponse) SetResultMsg(v string) *QueryExternalFailureResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryExternalFailureResponse) SetStatus(v string) *QueryExternalFailureResponse {
	s.Status = &v
	return s
}

func (s *QueryExternalFailureResponse) SetMsg(v string) *QueryExternalFailureResponse {
	s.Msg = &v
	return s
}

type VvvLiuyzTestRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
}

func (s VvvLiuyzTestRequest) String() string {
	return tea.Prettify(s)
}

func (s VvvLiuyzTestRequest) GoString() string {
	return s.String()
}

func (s *VvvLiuyzTestRequest) SetAuthToken(v string) *VvvLiuyzTestRequest {
	s.AuthToken = &v
	return s
}

type VvvLiuyzTestResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s VvvLiuyzTestResponse) String() string {
	return tea.Prettify(s)
}

func (s VvvLiuyzTestResponse) GoString() string {
	return s.String()
}

func (s *VvvLiuyzTestResponse) SetReqMsgId(v string) *VvvLiuyzTestResponse {
	s.ReqMsgId = &v
	return s
}

func (s *VvvLiuyzTestResponse) SetResultCode(v string) *VvvLiuyzTestResponse {
	s.ResultCode = &v
	return s
}

func (s *VvvLiuyzTestResponse) SetResultMsg(v string) *VvvLiuyzTestResponse {
	s.ResultMsg = &v
	return s
}

type AaawTestLiuyzRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
}

func (s AaawTestLiuyzRequest) String() string {
	return tea.Prettify(s)
}

func (s AaawTestLiuyzRequest) GoString() string {
	return s.String()
}

func (s *AaawTestLiuyzRequest) SetAuthToken(v string) *AaawTestLiuyzRequest {
	s.AuthToken = &v
	return s
}

type AaawTestLiuyzResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s AaawTestLiuyzResponse) String() string {
	return tea.Prettify(s)
}

func (s AaawTestLiuyzResponse) GoString() string {
	return s.String()
}

func (s *AaawTestLiuyzResponse) SetReqMsgId(v string) *AaawTestLiuyzResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AaawTestLiuyzResponse) SetResultCode(v string) *AaawTestLiuyzResponse {
	s.ResultCode = &v
	return s
}

func (s *AaawTestLiuyzResponse) SetResultMsg(v string) *AaawTestLiuyzResponse {
	s.ResultMsg = &v
	return s
}

type TestTrPaiRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
}

func (s TestTrPaiRequest) String() string {
	return tea.Prettify(s)
}

func (s TestTrPaiRequest) GoString() string {
	return s.String()
}

func (s *TestTrPaiRequest) SetAuthToken(v string) *TestTrPaiRequest {
	s.AuthToken = &v
	return s
}

type TestTrPaiResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s TestTrPaiResponse) String() string {
	return tea.Prettify(s)
}

func (s TestTrPaiResponse) GoString() string {
	return s.String()
}

func (s *TestTrPaiResponse) SetReqMsgId(v string) *TestTrPaiResponse {
	s.ReqMsgId = &v
	return s
}

func (s *TestTrPaiResponse) SetResultCode(v string) *TestTrPaiResponse {
	s.ResultCode = &v
	return s
}

func (s *TestTrPaiResponse) SetResultMsg(v string) *TestTrPaiResponse {
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
				"sdk_version":      tea.String("2.0.0"),
				"_prod_code":       tea.String("TRTESTDEMO"),
				"_prod_channel":    tea.String("default"),
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
 * Description: a
 * Summary: a
 */
func (client *Client) AAA(request *AAARequest) (_result *AAAResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AAAResponse{}
	_body, _err := client.AAAEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: a
 * Summary: a
 */
func (client *Client) AAAEx(request *AAARequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AAAResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AAAResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.trtestdemo.a.a.a"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: b
 * Summary: b
 */
func (client *Client) BBB(request *BBBRequest) (_result *BBBResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &BBBResponse{}
	_body, _err := client.BBBEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: b
 * Summary: b
 */
func (client *Client) BBBEx(request *BBBRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *BBBResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &BBBResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.trtestdemo.b.b.b"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: tr协议测试使用，调用通过
 * Summary: tr协议测试使用，调用通过
 */
func (client *Client) QueryDebugPassed(request *QueryDebugPassedRequest) (_result *QueryDebugPassedResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDebugPassedResponse{}
	_body, _err := client.QueryDebugPassedEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: tr协议测试使用，调用通过
 * Summary: tr协议测试使用，调用通过
 */
func (client *Client) QueryDebugPassedEx(request *QueryDebugPassedRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDebugPassedResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDebugPassedResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.trtestdemo.debug.passed.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: tr协议测试使用，内部接口且调用不通过
 * Summary: tr协议测试使用，内部接口且调用不通过
 */
func (client *Client) QueryInternalFailure(request *QueryInternalFailureRequest) (_result *QueryInternalFailureResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryInternalFailureResponse{}
	_body, _err := client.QueryInternalFailureEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: tr协议测试使用，内部接口且调用不通过
 * Summary: tr协议测试使用，内部接口且调用不通过
 */
func (client *Client) QueryInternalFailureEx(request *QueryInternalFailureRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryInternalFailureResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryInternalFailureResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.trtestdemo.internal.failure.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: tr协议测试使用，外部接口且调用不通过
 * Summary: tr协议测试使用，外部接口且调用不通过
 */
func (client *Client) QueryExternalFailure(request *QueryExternalFailureRequest) (_result *QueryExternalFailureResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryExternalFailureResponse{}
	_body, _err := client.QueryExternalFailureEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: tr协议测试使用，外部接口且调用不通过
 * Summary: tr协议测试使用，外部接口且调用不通过
 */
func (client *Client) QueryExternalFailureEx(request *QueryExternalFailureRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryExternalFailureResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryExternalFailureResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.trtestdemo.external.failure.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) VvvLiuyzTest(request *VvvLiuyzTestRequest) (_result *VvvLiuyzTestResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &VvvLiuyzTestResponse{}
	_body, _err := client.VvvLiuyzTestEx(request, headers, runtime)
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
func (client *Client) VvvLiuyzTestEx(request *VvvLiuyzTestRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *VvvLiuyzTestResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &VvvLiuyzTestResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.trtestdemo.liuyz.test.vvv"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) AaawTestLiuyz(request *AaawTestLiuyzRequest) (_result *AaawTestLiuyzResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AaawTestLiuyzResponse{}
	_body, _err := client.AaawTestLiuyzEx(request, headers, runtime)
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
func (client *Client) AaawTestLiuyzEx(request *AaawTestLiuyzRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AaawTestLiuyzResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AaawTestLiuyzResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.trtestdemo.test.liuyz.aaaw"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) TestTrPai(request *TestTrPaiRequest) (_result *TestTrPaiResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &TestTrPaiResponse{}
	_body, _err := client.TestTrPaiEx(request, headers, runtime)
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
func (client *Client) TestTrPaiEx(request *TestTrPaiRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *TestTrPaiResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &TestTrPaiResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.trtestdemo.tr.pai.test"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
