// This file is auto-generated, don't edit it. Thanks.
package client

import (
	rpcutil "github.com/alibabacloud-go/tea-rpc-utils/service"
	util "github.com/alibabacloud-go/tea-utils/v2/service"
	"github.com/alibabacloud-go/tea/tea"
	antchainutil "github.com/antchain-openapi-sdk-go/antchain-util/service"
)

// Description:
//
// Model for initing client
type Config struct {
	// accesskey id
	AccessKeyId *string `json:"accessKeyId,omitempty" xml:"accessKeyId,omitempty"`
	// accesskey secret
	AccessKeySecret *string `json:"accessKeySecret,omitempty" xml:"accessKeySecret,omitempty"`
	// security token
	SecurityToken *string `json:"securityToken,omitempty" xml:"securityToken,omitempty"`
	// http protocol
	//
	// example:
	//
	// http
	Protocol *string `json:"protocol,omitempty" xml:"protocol,omitempty"`
	// read timeout
	//
	// example:
	//
	// 10
	ReadTimeout *int `json:"readTimeout,omitempty" xml:"readTimeout,omitempty"`
	// connect timeout
	//
	// example:
	//
	// 10
	ConnectTimeout *int `json:"connectTimeout,omitempty" xml:"connectTimeout,omitempty"`
	// http proxy
	//
	// example:
	//
	// http://localhost
	HttpProxy *string `json:"httpProxy,omitempty" xml:"httpProxy,omitempty"`
	// https proxy
	//
	// example:
	//
	// https://localhost
	HttpsProxy *string `json:"httpsProxy,omitempty" xml:"httpsProxy,omitempty"`
	// endpoint
	//
	// example:
	//
	// cs.aliyuncs.com
	Endpoint *string `json:"endpoint,omitempty" xml:"endpoint,omitempty"`
	// proxy white list
	//
	// example:
	//
	// http://localhost
	NoProxy *string `json:"noProxy,omitempty" xml:"noProxy,omitempty"`
	// max idle conns
	//
	// example:
	//
	// 3
	MaxIdleConns *int `json:"maxIdleConns,omitempty" xml:"maxIdleConns,omitempty"`
	// user agent
	//
	// example:
	//
	// Alibabacloud/1
	UserAgent *string `json:"userAgent,omitempty" xml:"userAgent,omitempty"`
	// socks5 proxy
	Socks5Proxy *string `json:"socks5Proxy,omitempty" xml:"socks5Proxy,omitempty"`
	// socks5 network
	//
	// example:
	//
	// TCP
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

// 输入token详情
type PromptTokensDetail struct {
	// 缓存token
	// example:
	//
	// 0
	CachedTokens *int64 `json:"cached_tokens,omitempty" xml:"cached_tokens,omitempty" require:"true"`
}

func (s PromptTokensDetail) String() string {
	return tea.Prettify(s)
}

func (s PromptTokensDetail) GoString() string {
	return s.String()
}

func (s *PromptTokensDetail) SetCachedTokens(v int64) *PromptTokensDetail {
	s.CachedTokens = &v
	return s
}

// chat请求内容
type ChatMessage struct {
	// 橘色
	// example:
	//
	// user
	Role *string `json:"role,omitempty" xml:"role,omitempty" require:"true"`
	// 请求内容
	// example:
	//
	// Hello, how are you?
	Content *string `json:"content,omitempty" xml:"content,omitempty" require:"true"`
}

func (s ChatMessage) String() string {
	return tea.Prettify(s)
}

func (s ChatMessage) GoString() string {
	return s.String()
}

func (s *ChatMessage) SetRole(v string) *ChatMessage {
	s.Role = &v
	return s
}

func (s *ChatMessage) SetContent(v string) *ChatMessage {
	s.Content = &v
	return s
}

// 响应结果
type ChoiceData struct {
	// 结束原因
	// example:
	//
	// stop
	FinishReason *string `json:"finish_reason,omitempty" xml:"finish_reason,omitempty" require:"true"`
	// 序号
	// example:
	//
	// 1
	Index *int64 `json:"index,omitempty" xml:"index,omitempty" require:"true"`
	// 消息内容
	// example:
	//
	// {         "content": "我无法获取实时天气信息。建议您查看当地气象台或使用天气应用（如中国气象局、墨迹天气、AccuWeather等）获取准确的天气情况。",         "role": "assistant"       }
	Message *ChatMessage `json:"message,omitempty" xml:"message,omitempty" require:"true"`
}

func (s ChoiceData) String() string {
	return tea.Prettify(s)
}

func (s ChoiceData) GoString() string {
	return s.String()
}

func (s *ChoiceData) SetFinishReason(v string) *ChoiceData {
	s.FinishReason = &v
	return s
}

func (s *ChoiceData) SetIndex(v int64) *ChoiceData {
	s.Index = &v
	return s
}

func (s *ChoiceData) SetMessage(v *ChatMessage) *ChoiceData {
	s.Message = v
	return s
}

// 使用信息
type UsageData struct {
	// 输出消耗
	// example:
	//
	// 38
	CompletionTokens *int64 `json:"completion_tokens,omitempty" xml:"completion_tokens,omitempty" require:"true"`
	// 输入消耗
	// example:
	//
	// 11
	PromptTokens *int64 `json:"prompt_tokens,omitempty" xml:"prompt_tokens,omitempty" require:"true"`
	// 总计消耗
	// example:
	//
	// 49
	TotalTokens *int64 `json:"total_tokens,omitempty" xml:"total_tokens,omitempty" require:"true"`
	// 请求token详情
	// example:
	//
	// {       "cached_tokens": 0     }
	PromptTokensDetails *PromptTokensDetail `json:"prompt_tokens_details,omitempty" xml:"prompt_tokens_details,omitempty" require:"true"`
}

func (s UsageData) String() string {
	return tea.Prettify(s)
}

func (s UsageData) GoString() string {
	return s.String()
}

func (s *UsageData) SetCompletionTokens(v int64) *UsageData {
	s.CompletionTokens = &v
	return s
}

func (s *UsageData) SetPromptTokens(v int64) *UsageData {
	s.PromptTokens = &v
	return s
}

func (s *UsageData) SetTotalTokens(v int64) *UsageData {
	s.TotalTokens = &v
	return s
}

func (s *UsageData) SetPromptTokensDetails(v *PromptTokensDetail) *UsageData {
	s.PromptTokensDetails = v
	return s
}

type ExecOperationagentChatRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 调用大模型
	Model *string `json:"model,omitempty" xml:"model,omitempty" require:"true"`
	// 调用场景
	Scene *string `json:"scene,omitempty" xml:"scene,omitempty"`
	// 请求内容
	Messages []*ChatMessage `json:"messages,omitempty" xml:"messages,omitempty" require:"true" type:"Repeated"`
}

func (s ExecOperationagentChatRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecOperationagentChatRequest) GoString() string {
	return s.String()
}

func (s *ExecOperationagentChatRequest) SetAuthToken(v string) *ExecOperationagentChatRequest {
	s.AuthToken = &v
	return s
}

func (s *ExecOperationagentChatRequest) SetProductInstanceId(v string) *ExecOperationagentChatRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ExecOperationagentChatRequest) SetModel(v string) *ExecOperationagentChatRequest {
	s.Model = &v
	return s
}

func (s *ExecOperationagentChatRequest) SetScene(v string) *ExecOperationagentChatRequest {
	s.Scene = &v
	return s
}

func (s *ExecOperationagentChatRequest) SetMessages(v []*ChatMessage) *ExecOperationagentChatRequest {
	s.Messages = v
	return s
}

type ExecOperationagentChatResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 请求唯一id
	Id *string `json:"id,omitempty" xml:"id,omitempty"`
	// 请求时间
	Created *int64 `json:"created,omitempty" xml:"created,omitempty"`
	// 请求大模型
	Model *string `json:"model,omitempty" xml:"model,omitempty"`
	// 请求类型
	Object *string `json:"object,omitempty" xml:"object,omitempty"`
	// 响应内容
	Choices []*ChoiceData `json:"choices,omitempty" xml:"choices,omitempty" type:"Repeated"`
	// token使用情况
	Usage *UsageData `json:"usage,omitempty" xml:"usage,omitempty"`
}

func (s ExecOperationagentChatResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecOperationagentChatResponse) GoString() string {
	return s.String()
}

func (s *ExecOperationagentChatResponse) SetReqMsgId(v string) *ExecOperationagentChatResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ExecOperationagentChatResponse) SetResultCode(v string) *ExecOperationagentChatResponse {
	s.ResultCode = &v
	return s
}

func (s *ExecOperationagentChatResponse) SetResultMsg(v string) *ExecOperationagentChatResponse {
	s.ResultMsg = &v
	return s
}

func (s *ExecOperationagentChatResponse) SetId(v string) *ExecOperationagentChatResponse {
	s.Id = &v
	return s
}

func (s *ExecOperationagentChatResponse) SetCreated(v int64) *ExecOperationagentChatResponse {
	s.Created = &v
	return s
}

func (s *ExecOperationagentChatResponse) SetModel(v string) *ExecOperationagentChatResponse {
	s.Model = &v
	return s
}

func (s *ExecOperationagentChatResponse) SetObject(v string) *ExecOperationagentChatResponse {
	s.Object = &v
	return s
}

func (s *ExecOperationagentChatResponse) SetChoices(v []*ChoiceData) *ExecOperationagentChatResponse {
	s.Choices = v
	return s
}

func (s *ExecOperationagentChatResponse) SetUsage(v *UsageData) *ExecOperationagentChatResponse {
	s.Usage = v
	return s
}

type ExecOperationagentSsechatRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 模型类型
	Model *string `json:"model,omitempty" xml:"model,omitempty" require:"true"`
	// 场景
	Scene *string `json:"scene,omitempty" xml:"scene,omitempty"`
	// 请求内容
	Messages []*ChatMessage `json:"messages,omitempty" xml:"messages,omitempty" require:"true" type:"Repeated"`
}

func (s ExecOperationagentSsechatRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecOperationagentSsechatRequest) GoString() string {
	return s.String()
}

func (s *ExecOperationagentSsechatRequest) SetAuthToken(v string) *ExecOperationagentSsechatRequest {
	s.AuthToken = &v
	return s
}

func (s *ExecOperationagentSsechatRequest) SetProductInstanceId(v string) *ExecOperationagentSsechatRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ExecOperationagentSsechatRequest) SetModel(v string) *ExecOperationagentSsechatRequest {
	s.Model = &v
	return s
}

func (s *ExecOperationagentSsechatRequest) SetScene(v string) *ExecOperationagentSsechatRequest {
	s.Scene = &v
	return s
}

func (s *ExecOperationagentSsechatRequest) SetMessages(v []*ChatMessage) *ExecOperationagentSsechatRequest {
	s.Messages = v
	return s
}

type ExecOperationagentSsechatResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 结果响应
	Choices *ChoiceData `json:"choices,omitempty" xml:"choices,omitempty"`
	// 请求时间
	Created *bool `json:"created,omitempty" xml:"created,omitempty"`
	// 请求信息
	Id *string `json:"id,omitempty" xml:"id,omitempty"`
	// 模型类型
	Model *string `json:"model,omitempty" xml:"model,omitempty"`
	// 请求方式
	Object *string `json:"object,omitempty" xml:"object,omitempty"`
	// token消耗情况
	Usage *UsageData `json:"usage,omitempty" xml:"usage,omitempty"`
}

func (s ExecOperationagentSsechatResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecOperationagentSsechatResponse) GoString() string {
	return s.String()
}

func (s *ExecOperationagentSsechatResponse) SetReqMsgId(v string) *ExecOperationagentSsechatResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ExecOperationagentSsechatResponse) SetResultCode(v string) *ExecOperationagentSsechatResponse {
	s.ResultCode = &v
	return s
}

func (s *ExecOperationagentSsechatResponse) SetResultMsg(v string) *ExecOperationagentSsechatResponse {
	s.ResultMsg = &v
	return s
}

func (s *ExecOperationagentSsechatResponse) SetChoices(v *ChoiceData) *ExecOperationagentSsechatResponse {
	s.Choices = v
	return s
}

func (s *ExecOperationagentSsechatResponse) SetCreated(v bool) *ExecOperationagentSsechatResponse {
	s.Created = &v
	return s
}

func (s *ExecOperationagentSsechatResponse) SetId(v string) *ExecOperationagentSsechatResponse {
	s.Id = &v
	return s
}

func (s *ExecOperationagentSsechatResponse) SetModel(v string) *ExecOperationagentSsechatResponse {
	s.Model = &v
	return s
}

func (s *ExecOperationagentSsechatResponse) SetObject(v string) *ExecOperationagentSsechatResponse {
	s.Object = &v
	return s
}

func (s *ExecOperationagentSsechatResponse) SetUsage(v *UsageData) *ExecOperationagentSsechatResponse {
	s.Usage = v
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

// Description:
//
// # Init client with Config
//
// @param config - config contains the necessary information to create a client
func NewClient(config *Config) (*Client, error) {
	client := new(Client)
	err := client.Init(config)
	return client, err
}

func (client *Client) Init(config *Config) (_err error) {
	if tea.BoolValue(util.IsUnset(config)) {
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

// Description:
//
// # Encapsulate the request and invoke the network
//
// @param action - api name
//
// @param protocol - http or https
//
// @param method - e.g. GET
//
// @param pathname - pathname of every api
//
// @param request - which contains request params
//
// @param runtime - which controls some details of call api, such as retry times
//
// @return the response
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
				"sdk_version":      tea.String("1.0.0"),
				"_prod_code":       tea.String("QMBRAIN"),
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

// Description:
//
// Description: 安全智选运营智能体运营决策大脑大模型聊天执行请求
//
// Summary: 安全智选运营智能体运营决策大脑大模型聊天执行请求
func (client *Client) ExecOperationagentChat(request *ExecOperationagentChatRequest) (_result *ExecOperationagentChatResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ExecOperationagentChatResponse{}
	_body, _err := client.ExecOperationagentChatEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 安全智选运营智能体运营决策大脑大模型聊天执行请求
//
// Summary: 安全智选运营智能体运营决策大脑大模型聊天执行请求
func (client *Client) ExecOperationagentChatEx(request *ExecOperationagentChatRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ExecOperationagentChatResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecOperationagentChatResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.qmbrain.operationagent.chat.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 流式请求
//
// Summary: 流式请求
func (client *Client) ExecOperationagentSsechat(request *ExecOperationagentSsechatRequest) (_result *ExecOperationagentSsechatResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ExecOperationagentSsechatResponse{}
	_body, _err := client.ExecOperationagentSsechatEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 流式请求
//
// Summary: 流式请求
func (client *Client) ExecOperationagentSsechatEx(request *ExecOperationagentSsechatRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ExecOperationagentSsechatResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecOperationagentSsechatResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.qmbrain.operationagent.ssechat.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
