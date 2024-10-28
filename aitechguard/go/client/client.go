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

// 键值对
type Map struct {
}

func (s Map) String() string {
	return tea.Prettify(s)
}

func (s Map) GoString() string {
	return s.String()
}

// 键值对
type AiMap struct {
	// 键
	Key *string `json:"key,omitempty" xml:"key,omitempty" require:"true"`
	// 值
	Value *string `json:"value,omitempty" xml:"value,omitempty"`
}

func (s AiMap) String() string {
	return tea.Prettify(s)
}

func (s AiMap) GoString() string {
	return s.String()
}

func (s *AiMap) SetKey(v string) *AiMap {
	s.Key = &v
	return s
}

func (s *AiMap) SetValue(v string) *AiMap {
	s.Value = &v
	return s
}

type CheckAicoguardrailsAskRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 数据唯一标识，能够根据该值定位到该条数据
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty" require:"true"`
	// 会话ID，用于匹配多轮对话上下文
	SessionId *string `json:"session_id,omitempty" xml:"session_id,omitempty" require:"true"`
	// 应用名，蚂蚁侧提供
	AppCode *string `json:"app_code,omitempty" xml:"app_code,omitempty" require:"true"`
	// 场景code，走SOP流程申请
	SceneCode *string `json:"scene_code,omitempty" xml:"scene_code,omitempty" require:"true"`
	// 当前提问内容
	Question *string `json:"question,omitempty" xml:"question,omitempty" require:"true"`
	// 当前提问格式，默认PLAINTEXT，详见3.2 questionFormat&answerFormat说明
	QuestionFormat *string `json:"question_format,omitempty" xml:"question_format,omitempty" require:"true"`
	// 加密的uid，仅用于唯一标示调用方
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty"`
}

func (s CheckAicoguardrailsAskRequest) String() string {
	return tea.Prettify(s)
}

func (s CheckAicoguardrailsAskRequest) GoString() string {
	return s.String()
}

func (s *CheckAicoguardrailsAskRequest) SetAuthToken(v string) *CheckAicoguardrailsAskRequest {
	s.AuthToken = &v
	return s
}

func (s *CheckAicoguardrailsAskRequest) SetRequestId(v string) *CheckAicoguardrailsAskRequest {
	s.RequestId = &v
	return s
}

func (s *CheckAicoguardrailsAskRequest) SetSessionId(v string) *CheckAicoguardrailsAskRequest {
	s.SessionId = &v
	return s
}

func (s *CheckAicoguardrailsAskRequest) SetAppCode(v string) *CheckAicoguardrailsAskRequest {
	s.AppCode = &v
	return s
}

func (s *CheckAicoguardrailsAskRequest) SetSceneCode(v string) *CheckAicoguardrailsAskRequest {
	s.SceneCode = &v
	return s
}

func (s *CheckAicoguardrailsAskRequest) SetQuestion(v string) *CheckAicoguardrailsAskRequest {
	s.Question = &v
	return s
}

func (s *CheckAicoguardrailsAskRequest) SetQuestionFormat(v string) *CheckAicoguardrailsAskRequest {
	s.QuestionFormat = &v
	return s
}

func (s *CheckAicoguardrailsAskRequest) SetUserId(v string) *CheckAicoguardrailsAskRequest {
	s.UserId = &v
	return s
}

type CheckAicoguardrailsAskResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 会话ID，用于匹配多轮对话上下文
	SessionId *string `json:"session_id,omitempty" xml:"session_id,omitempty"`
	// 唯一定位一个问答对
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
	// 是否安全无风险. true：安全无风险. false：有风险
	Safe *bool `json:"safe,omitempty" xml:"safe,omitempty"`
	// 安全动作
	// 提问场景
	//    BLOCK：拦截
	//    SECURITY_ANSWER：安全代答
	//    SECURITY_PROMPT：安全提示增强
	ActionCode *string `json:"action_code,omitempty" xml:"action_code,omitempty"`
	// 安全代答的回答
	SecurityAnswer *string `json:"security_answer,omitempty" xml:"security_answer,omitempty"`
	// 有安全风险时的提问改写
	SecurityPrompt *string `json:"security_prompt,omitempty" xml:"security_prompt,omitempty"`
	// 有风险时的风险类型，一级风险分类
	RiskCategory *string `json:"risk_category,omitempty" xml:"risk_category,omitempty"`
	// 有风险时的风险类型，二级风险明细分类
	RiskLabel *string `json:"risk_label,omitempty" xml:"risk_label,omitempty"`
	// 命中风险场景的风险词
	RiskWords []*string `json:"risk_words,omitempty" xml:"risk_words,omitempty" type:"Repeated"`
	// 会话动作
	//    END_SESSION：终止会话
	//    RECALL_QUERY：撤回提问
	SessionAction *string `json:"session_action,omitempty" xml:"session_action,omitempty"`
}

func (s CheckAicoguardrailsAskResponse) String() string {
	return tea.Prettify(s)
}

func (s CheckAicoguardrailsAskResponse) GoString() string {
	return s.String()
}

func (s *CheckAicoguardrailsAskResponse) SetReqMsgId(v string) *CheckAicoguardrailsAskResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CheckAicoguardrailsAskResponse) SetResultCode(v string) *CheckAicoguardrailsAskResponse {
	s.ResultCode = &v
	return s
}

func (s *CheckAicoguardrailsAskResponse) SetResultMsg(v string) *CheckAicoguardrailsAskResponse {
	s.ResultMsg = &v
	return s
}

func (s *CheckAicoguardrailsAskResponse) SetSessionId(v string) *CheckAicoguardrailsAskResponse {
	s.SessionId = &v
	return s
}

func (s *CheckAicoguardrailsAskResponse) SetRequestId(v string) *CheckAicoguardrailsAskResponse {
	s.RequestId = &v
	return s
}

func (s *CheckAicoguardrailsAskResponse) SetSafe(v bool) *CheckAicoguardrailsAskResponse {
	s.Safe = &v
	return s
}

func (s *CheckAicoguardrailsAskResponse) SetActionCode(v string) *CheckAicoguardrailsAskResponse {
	s.ActionCode = &v
	return s
}

func (s *CheckAicoguardrailsAskResponse) SetSecurityAnswer(v string) *CheckAicoguardrailsAskResponse {
	s.SecurityAnswer = &v
	return s
}

func (s *CheckAicoguardrailsAskResponse) SetSecurityPrompt(v string) *CheckAicoguardrailsAskResponse {
	s.SecurityPrompt = &v
	return s
}

func (s *CheckAicoguardrailsAskResponse) SetRiskCategory(v string) *CheckAicoguardrailsAskResponse {
	s.RiskCategory = &v
	return s
}

func (s *CheckAicoguardrailsAskResponse) SetRiskLabel(v string) *CheckAicoguardrailsAskResponse {
	s.RiskLabel = &v
	return s
}

func (s *CheckAicoguardrailsAskResponse) SetRiskWords(v []*string) *CheckAicoguardrailsAskResponse {
	s.RiskWords = v
	return s
}

func (s *CheckAicoguardrailsAskResponse) SetSessionAction(v string) *CheckAicoguardrailsAskResponse {
	s.SessionAction = &v
	return s
}

type CheckAicoguardrailsAnswerRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 会话ID，用于匹配多轮对话上下文
	SessionId *string `json:"session_id,omitempty" xml:"session_id,omitempty" require:"true"`
	// 数据唯一标识，能够根据该值定位到该条数据
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty" require:"true"`
	// 应用名，蚂蚁侧提供
	AppCode *string `json:"app_code,omitempty" xml:"app_code,omitempty" require:"true"`
	// 场景code，走SOP流程申请
	SceneCode *string `json:"scene_code,omitempty" xml:"scene_code,omitempty" require:"true"`
	// 当前提问内容，最大长度800个字符。
	Question *string `json:"question,omitempty" xml:"question,omitempty" require:"true"`
	// 当前提问内容格式, 默认值:PLAINTEXT
	QuestionFormat *string `json:"question_format,omitempty" xml:"question_format,omitempty"`
	// 当前回答内容，最大长度800个字符。
	Answer *string `json:"answer,omitempty" xml:"answer,omitempty" require:"true"`
	// 当前回答内容格式, 默认取PLAINTEXT
	AnswerFormat *string `json:"answer_format,omitempty" xml:"answer_format,omitempty"`
	// 用户ID，用于主体风险判断
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty"`
}

func (s CheckAicoguardrailsAnswerRequest) String() string {
	return tea.Prettify(s)
}

func (s CheckAicoguardrailsAnswerRequest) GoString() string {
	return s.String()
}

func (s *CheckAicoguardrailsAnswerRequest) SetAuthToken(v string) *CheckAicoguardrailsAnswerRequest {
	s.AuthToken = &v
	return s
}

func (s *CheckAicoguardrailsAnswerRequest) SetSessionId(v string) *CheckAicoguardrailsAnswerRequest {
	s.SessionId = &v
	return s
}

func (s *CheckAicoguardrailsAnswerRequest) SetRequestId(v string) *CheckAicoguardrailsAnswerRequest {
	s.RequestId = &v
	return s
}

func (s *CheckAicoguardrailsAnswerRequest) SetAppCode(v string) *CheckAicoguardrailsAnswerRequest {
	s.AppCode = &v
	return s
}

func (s *CheckAicoguardrailsAnswerRequest) SetSceneCode(v string) *CheckAicoguardrailsAnswerRequest {
	s.SceneCode = &v
	return s
}

func (s *CheckAicoguardrailsAnswerRequest) SetQuestion(v string) *CheckAicoguardrailsAnswerRequest {
	s.Question = &v
	return s
}

func (s *CheckAicoguardrailsAnswerRequest) SetQuestionFormat(v string) *CheckAicoguardrailsAnswerRequest {
	s.QuestionFormat = &v
	return s
}

func (s *CheckAicoguardrailsAnswerRequest) SetAnswer(v string) *CheckAicoguardrailsAnswerRequest {
	s.Answer = &v
	return s
}

func (s *CheckAicoguardrailsAnswerRequest) SetAnswerFormat(v string) *CheckAicoguardrailsAnswerRequest {
	s.AnswerFormat = &v
	return s
}

func (s *CheckAicoguardrailsAnswerRequest) SetUserId(v string) *CheckAicoguardrailsAnswerRequest {
	s.UserId = &v
	return s
}

type CheckAicoguardrailsAnswerResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 会话ID，用于匹配多轮对话上下文
	SessionId *string `json:"session_id,omitempty" xml:"session_id,omitempty"`
	// 唯一定位一个问答对
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
	// 是否安全无风险
	Safe *bool `json:"safe,omitempty" xml:"safe,omitempty"`
	// 有风险时的安全动作, BLOCK: 拦截; SECURITY_ANSWER:安全代答;SECURITY_PROMPT:安全提示增强
	ActionCode *string `json:"action_code,omitempty" xml:"action_code,omitempty"`
	// 会话动作
	// END_SESSION：终止会话
	// RECALL_QUERY：撤回提问
	SessionAction *string `json:"session_action,omitempty" xml:"session_action,omitempty"`
	// 安全动作相关文案，比如安全提示增强的文案、安全代答的回答、回答里补充的安全提示
	ActionMsg *string `json:"action_msg,omitempty" xml:"action_msg,omitempty"`
}

func (s CheckAicoguardrailsAnswerResponse) String() string {
	return tea.Prettify(s)
}

func (s CheckAicoguardrailsAnswerResponse) GoString() string {
	return s.String()
}

func (s *CheckAicoguardrailsAnswerResponse) SetReqMsgId(v string) *CheckAicoguardrailsAnswerResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CheckAicoguardrailsAnswerResponse) SetResultCode(v string) *CheckAicoguardrailsAnswerResponse {
	s.ResultCode = &v
	return s
}

func (s *CheckAicoguardrailsAnswerResponse) SetResultMsg(v string) *CheckAicoguardrailsAnswerResponse {
	s.ResultMsg = &v
	return s
}

func (s *CheckAicoguardrailsAnswerResponse) SetSessionId(v string) *CheckAicoguardrailsAnswerResponse {
	s.SessionId = &v
	return s
}

func (s *CheckAicoguardrailsAnswerResponse) SetRequestId(v string) *CheckAicoguardrailsAnswerResponse {
	s.RequestId = &v
	return s
}

func (s *CheckAicoguardrailsAnswerResponse) SetSafe(v bool) *CheckAicoguardrailsAnswerResponse {
	s.Safe = &v
	return s
}

func (s *CheckAicoguardrailsAnswerResponse) SetActionCode(v string) *CheckAicoguardrailsAnswerResponse {
	s.ActionCode = &v
	return s
}

func (s *CheckAicoguardrailsAnswerResponse) SetSessionAction(v string) *CheckAicoguardrailsAnswerResponse {
	s.SessionAction = &v
	return s
}

func (s *CheckAicoguardrailsAnswerResponse) SetActionMsg(v string) *CheckAicoguardrailsAnswerResponse {
	s.ActionMsg = &v
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
				"sdk_version":      tea.String("1.0.18"),
				"_prod_code":       tea.String("AITECHGUARD"),
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
 * Description: 提问检测服务接口
 * Summary: 提问检测服务接口
 */
func (client *Client) CheckAicoguardrailsAsk(request *CheckAicoguardrailsAskRequest) (_result *CheckAicoguardrailsAskResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CheckAicoguardrailsAskResponse{}
	_body, _err := client.CheckAicoguardrailsAskEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 提问检测服务接口
 * Summary: 提问检测服务接口
 */
func (client *Client) CheckAicoguardrailsAskEx(request *CheckAicoguardrailsAskRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CheckAicoguardrailsAskResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CheckAicoguardrailsAskResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.aitechguard.aicoguardrails.ask.check"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: aicoguardcore对接天鉴回答检测服务接口
 * Summary: 天鉴回答检测服务接口
 */
func (client *Client) CheckAicoguardrailsAnswer(request *CheckAicoguardrailsAnswerRequest) (_result *CheckAicoguardrailsAnswerResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CheckAicoguardrailsAnswerResponse{}
	_body, _err := client.CheckAicoguardrailsAnswerEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: aicoguardcore对接天鉴回答检测服务接口
 * Summary: 天鉴回答检测服务接口
 */
func (client *Client) CheckAicoguardrailsAnswerEx(request *CheckAicoguardrailsAnswerRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CheckAicoguardrailsAnswerResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CheckAicoguardrailsAnswerResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.aitechguard.aicoguardrails.answer.check"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
