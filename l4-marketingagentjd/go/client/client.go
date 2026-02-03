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

// DataPart represents a structured blob.
type DataPart struct {
	// A JSON object containing arbitrary data.
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s DataPart) String() string {
	return tea.Prettify(s)
}

func (s DataPart) GoString() string {
	return s.String()
}

func (s *DataPart) SetData(v string) *DataPart {
	s.Data = &v
	return s
}

// Part represents a container for a section of communication content.
type Part struct {
	// the string content of the text part.
	Text *string `json:"text,omitempty" xml:"text,omitempty"`
	// The structured data content.
	Data *DataPart `json:"data,omitempty" xml:"data,omitempty"`
}

func (s Part) String() string {
	return tea.Prettify(s)
}

func (s Part) GoString() string {
	return s.String()
}

func (s *Part) SetText(v string) *Part {
	s.Text = &v
	return s
}

func (s *Part) SetData(v *DataPart) *Part {
	s.Data = v
	return s
}

// Message is one unit of communication between client and server.
type Message struct {
	// Parts is the container of the message content.
	Parts []*Part `json:"parts,omitempty" xml:"parts,omitempty" type:"Repeated"`
	// Identifies the sender of the message.
	// USER role refers to communication from the client to the server.
	// AGENT role refers to communication from the server to the client.
	Role *string `json:"role,omitempty" xml:"role,omitempty"`
	// The context id of the message. This is optional and if set, the message will be associated with the given context(a specific conversation or session).
	ContextId *string `json:"context_id,omitempty" xml:"context_id,omitempty"`
}

func (s Message) String() string {
	return tea.Prettify(s)
}

func (s Message) GoString() string {
	return s.String()
}

func (s *Message) SetParts(v []*Part) *Message {
	s.Parts = v
	return s
}

func (s *Message) SetRole(v string) *Message {
	s.Role = &v
	return s
}

func (s *Message) SetContextId(v string) *Message {
	s.ContextId = &v
	return s
}

// Artifacts represent task outputs.
type Artifact struct {
	// The content of the artifact. Must contain at least one part.
	Parts []*Part `json:"parts,omitempty" xml:"parts,omitempty" type:"Repeated"`
}

func (s Artifact) String() string {
	return tea.Prettify(s)
}

func (s Artifact) GoString() string {
	return s.String()
}

func (s *Artifact) SetParts(v []*Part) *Artifact {
	s.Parts = v
	return s
}

// A container for the status of a task
type TaskStatus struct {
	// The current state of this task.
	State *string `json:"state,omitempty" xml:"state,omitempty" require:"true"`
	// A message associated with the status.
	Message *Message `json:"message,omitempty" xml:"message,omitempty" require:"true"`
}

func (s TaskStatus) String() string {
	return tea.Prettify(s)
}

func (s TaskStatus) GoString() string {
	return s.String()
}

func (s *TaskStatus) SetState(v string) *TaskStatus {
	s.State = &v
	return s
}

func (s *TaskStatus) SetMessage(v *Message) *TaskStatus {
	s.Message = v
	return s
}

// Task is the core unit of action for A2A. It has a current status and when results are created for the task they are stored in the artifact.
type Task struct {
	// Unique identifier (e.g. UUID) for the task, generated by the server for a new task.
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// Unique identifier (e.g. UUID) for the contextual collection of interactions (tasks and messages). Created by the A2A server.
	ContextId *string `json:"context_id,omitempty" xml:"context_id,omitempty"`
	// The current status of a Task, including state and a message.
	Status *TaskStatus `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// A set of output artifacts for a Task.
	Artifacts []*Artifact `json:"artifacts,omitempty" xml:"artifacts,omitempty" require:"true" type:"Repeated"`
}

func (s Task) String() string {
	return tea.Prettify(s)
}

func (s Task) GoString() string {
	return s.String()
}

func (s *Task) SetId(v string) *Task {
	s.Id = &v
	return s
}

func (s *Task) SetContextId(v string) *Task {
	s.ContextId = &v
	return s
}

func (s *Task) SetStatus(v *TaskStatus) *Task {
	s.Status = v
	return s
}

func (s *Task) SetArtifacts(v []*Artifact) *Task {
	s.Artifacts = v
	return s
}

type GetAntcloudMarketingagentComsumeJdRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 项目ID
	ProjectId *string `json:"project_id,omitempty" xml:"project_id,omitempty" require:"true"`
	// 用户ID
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
	// 券ID
	CouponId *string `json:"coupon_id,omitempty" xml:"coupon_id,omitempty" require:"true"`
	// 券状态
	// UNUSED_=未使用
	// _USED_ 已使用
	// _EXPIRED_ 过期
	PrizeStatus *string `json:"prize_status,omitempty" xml:"prize_status,omitempty" require:"true"`
	// 使用时间
	// 时间格式“yyyy-mm-dd
	// hh:mm:ss”
	ConsumeTime *string `json:"consume_time,omitempty" xml:"consume_time,omitempty" require:"true"`
	// 回传类型
	// _1_-实时 ‘_2_-批量
	WriteOffType *int64 `json:"write_off_type,omitempty" xml:"write_off_type,omitempty" require:"true"`
	// 银行流水号
	BankFlowNo *string `json:"bank_flow_no,omitempty" xml:"bank_flow_no,omitempty" require:"true"`
	// 交易订单号
	TransactionId *string `json:"transaction_id,omitempty" xml:"transaction_id,omitempty" require:"true"`
	// 交易金额(分)
	TradeAmount *int64 `json:"trade_amount,omitempty" xml:"trade_amount,omitempty" require:"true"`
	// 消耗商户号（本期不传）
	MerchantNo *string `json:"merchant_no,omitempty" xml:"merchant_no,omitempty"`
}

func (s GetAntcloudMarketingagentComsumeJdRequest) String() string {
	return tea.Prettify(s)
}

func (s GetAntcloudMarketingagentComsumeJdRequest) GoString() string {
	return s.String()
}

func (s *GetAntcloudMarketingagentComsumeJdRequest) SetAuthToken(v string) *GetAntcloudMarketingagentComsumeJdRequest {
	s.AuthToken = &v
	return s
}

func (s *GetAntcloudMarketingagentComsumeJdRequest) SetProjectId(v string) *GetAntcloudMarketingagentComsumeJdRequest {
	s.ProjectId = &v
	return s
}

func (s *GetAntcloudMarketingagentComsumeJdRequest) SetUserId(v string) *GetAntcloudMarketingagentComsumeJdRequest {
	s.UserId = &v
	return s
}

func (s *GetAntcloudMarketingagentComsumeJdRequest) SetCouponId(v string) *GetAntcloudMarketingagentComsumeJdRequest {
	s.CouponId = &v
	return s
}

func (s *GetAntcloudMarketingagentComsumeJdRequest) SetPrizeStatus(v string) *GetAntcloudMarketingagentComsumeJdRequest {
	s.PrizeStatus = &v
	return s
}

func (s *GetAntcloudMarketingagentComsumeJdRequest) SetConsumeTime(v string) *GetAntcloudMarketingagentComsumeJdRequest {
	s.ConsumeTime = &v
	return s
}

func (s *GetAntcloudMarketingagentComsumeJdRequest) SetWriteOffType(v int64) *GetAntcloudMarketingagentComsumeJdRequest {
	s.WriteOffType = &v
	return s
}

func (s *GetAntcloudMarketingagentComsumeJdRequest) SetBankFlowNo(v string) *GetAntcloudMarketingagentComsumeJdRequest {
	s.BankFlowNo = &v
	return s
}

func (s *GetAntcloudMarketingagentComsumeJdRequest) SetTransactionId(v string) *GetAntcloudMarketingagentComsumeJdRequest {
	s.TransactionId = &v
	return s
}

func (s *GetAntcloudMarketingagentComsumeJdRequest) SetTradeAmount(v int64) *GetAntcloudMarketingagentComsumeJdRequest {
	s.TradeAmount = &v
	return s
}

func (s *GetAntcloudMarketingagentComsumeJdRequest) SetMerchantNo(v string) *GetAntcloudMarketingagentComsumeJdRequest {
	s.MerchantNo = &v
	return s
}

type GetAntcloudMarketingagentComsumeJdResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 状态码：SUCCESS/FAIL
	Code *string `json:"code,omitempty" xml:"code,omitempty"`
	// 结果描述：成功或失败原因
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
}

func (s GetAntcloudMarketingagentComsumeJdResponse) String() string {
	return tea.Prettify(s)
}

func (s GetAntcloudMarketingagentComsumeJdResponse) GoString() string {
	return s.String()
}

func (s *GetAntcloudMarketingagentComsumeJdResponse) SetReqMsgId(v string) *GetAntcloudMarketingagentComsumeJdResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetAntcloudMarketingagentComsumeJdResponse) SetResultCode(v string) *GetAntcloudMarketingagentComsumeJdResponse {
	s.ResultCode = &v
	return s
}

func (s *GetAntcloudMarketingagentComsumeJdResponse) SetResultMsg(v string) *GetAntcloudMarketingagentComsumeJdResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetAntcloudMarketingagentComsumeJdResponse) SetCode(v string) *GetAntcloudMarketingagentComsumeJdResponse {
	s.Code = &v
	return s
}

func (s *GetAntcloudMarketingagentComsumeJdResponse) SetMessage(v string) *GetAntcloudMarketingagentComsumeJdResponse {
	s.Message = &v
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
				"_prod_code":       tea.String("MARKETINGAGENTJD"),
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
 * Description: 京东微信核销数据回调
 * Summary: 京东微信核销数据回调
 */
func (client *Client) GetAntcloudMarketingagentComsumeJd(request *GetAntcloudMarketingagentComsumeJdRequest) (_result *GetAntcloudMarketingagentComsumeJdResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetAntcloudMarketingagentComsumeJdResponse{}
	_body, _err := client.GetAntcloudMarketingagentComsumeJdEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 京东微信核销数据回调
 * Summary: 京东微信核销数据回调
 */
func (client *Client) GetAntcloudMarketingagentComsumeJdEx(request *GetAntcloudMarketingagentComsumeJdRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetAntcloudMarketingagentComsumeJdResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetAntcloudMarketingagentComsumeJdResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.marketingagent.comsume.jd.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
