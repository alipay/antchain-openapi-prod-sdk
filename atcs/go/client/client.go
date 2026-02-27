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

// 任务结果
type TaskResult struct {
	// 任务标识
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty" require:"true"`
	// 任务状态，PENDING/待处理，PROGRESS/进行中，COMPLETED/已完成，FAILED/失败，CANCELED/已取消
	TaskStatus *string `json:"task_status,omitempty" xml:"task_status,omitempty" require:"true"`
	// 任务提交时间
	TaskSubmitTime *string `json:"task_submit_time,omitempty" xml:"task_submit_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 交易hash，链上查询使用
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
}

func (s TaskResult) String() string {
	return tea.Prettify(s)
}

func (s TaskResult) GoString() string {
	return s.String()
}

func (s *TaskResult) SetTaskId(v string) *TaskResult {
	s.TaskId = &v
	return s
}

func (s *TaskResult) SetTaskStatus(v string) *TaskResult {
	s.TaskStatus = &v
	return s
}

func (s *TaskResult) SetTaskSubmitTime(v string) *TaskResult {
	s.TaskSubmitTime = &v
	return s
}

func (s *TaskResult) SetTxHash(v string) *TaskResult {
	s.TxHash = &v
	return s
}

type SubmitOnchainTaskRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 智能体标识
	AgentId *string `json:"agent_id,omitempty" xml:"agent_id,omitempty" require:"true"`
	// 凭证标识,如delegate_id
	CredentialId *string `json:"credential_id,omitempty" xml:"credential_id,omitempty" require:"true"`
	// 上链内容，json形式
	Text *string `json:"text,omitempty" xml:"text,omitempty" require:"true"`
}

func (s SubmitOnchainTaskRequest) String() string {
	return tea.Prettify(s)
}

func (s SubmitOnchainTaskRequest) GoString() string {
	return s.String()
}

func (s *SubmitOnchainTaskRequest) SetAuthToken(v string) *SubmitOnchainTaskRequest {
	s.AuthToken = &v
	return s
}

func (s *SubmitOnchainTaskRequest) SetProductInstanceId(v string) *SubmitOnchainTaskRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SubmitOnchainTaskRequest) SetAgentId(v string) *SubmitOnchainTaskRequest {
	s.AgentId = &v
	return s
}

func (s *SubmitOnchainTaskRequest) SetCredentialId(v string) *SubmitOnchainTaskRequest {
	s.CredentialId = &v
	return s
}

func (s *SubmitOnchainTaskRequest) SetText(v string) *SubmitOnchainTaskRequest {
	s.Text = &v
	return s
}

type SubmitOnchainTaskResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 上链任务唯一标识
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty"`
}

func (s SubmitOnchainTaskResponse) String() string {
	return tea.Prettify(s)
}

func (s SubmitOnchainTaskResponse) GoString() string {
	return s.String()
}

func (s *SubmitOnchainTaskResponse) SetReqMsgId(v string) *SubmitOnchainTaskResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SubmitOnchainTaskResponse) SetResultCode(v string) *SubmitOnchainTaskResponse {
	s.ResultCode = &v
	return s
}

func (s *SubmitOnchainTaskResponse) SetResultMsg(v string) *SubmitOnchainTaskResponse {
	s.ResultMsg = &v
	return s
}

func (s *SubmitOnchainTaskResponse) SetTaskId(v string) *SubmitOnchainTaskResponse {
	s.TaskId = &v
	return s
}

type QueryOnchainTaskRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 客户标识，如支付宝2088标识
	AgentId *string `json:"agent_id,omitempty" xml:"agent_id,omitempty" require:"true"`
	// 任务标识列表
	TaskIdList []*string `json:"task_id_list,omitempty" xml:"task_id_list,omitempty" require:"true" type:"Repeated"`
}

func (s QueryOnchainTaskRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryOnchainTaskRequest) GoString() string {
	return s.String()
}

func (s *QueryOnchainTaskRequest) SetAuthToken(v string) *QueryOnchainTaskRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryOnchainTaskRequest) SetProductInstanceId(v string) *QueryOnchainTaskRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryOnchainTaskRequest) SetAgentId(v string) *QueryOnchainTaskRequest {
	s.AgentId = &v
	return s
}

func (s *QueryOnchainTaskRequest) SetTaskIdList(v []*string) *QueryOnchainTaskRequest {
	s.TaskIdList = v
	return s
}

type QueryOnchainTaskResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 任务处理结果列表
	TaskResultList []*TaskResult `json:"task_result_list,omitempty" xml:"task_result_list,omitempty" type:"Repeated"`
	// 分布式身份唯一标识
	Did *string `json:"did,omitempty" xml:"did,omitempty"`
}

func (s QueryOnchainTaskResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryOnchainTaskResponse) GoString() string {
	return s.String()
}

func (s *QueryOnchainTaskResponse) SetReqMsgId(v string) *QueryOnchainTaskResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryOnchainTaskResponse) SetResultCode(v string) *QueryOnchainTaskResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryOnchainTaskResponse) SetResultMsg(v string) *QueryOnchainTaskResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryOnchainTaskResponse) SetTaskResultList(v []*TaskResult) *QueryOnchainTaskResponse {
	s.TaskResultList = v
	return s
}

func (s *QueryOnchainTaskResponse) SetDid(v string) *QueryOnchainTaskResponse {
	s.Did = &v
	return s
}

type QueryOnchainBusinessRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 智能体标识
	AgentId *string `json:"agent_id,omitempty" xml:"agent_id,omitempty" require:"true"`
	// 分布式身份唯一标识
	Did *string `json:"did,omitempty" xml:"did,omitempty"`
	// 业务凭据标识
	CredentialId *string `json:"credential_id,omitempty" xml:"credential_id,omitempty" require:"true"`
	// 交易hash
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
}

func (s QueryOnchainBusinessRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryOnchainBusinessRequest) GoString() string {
	return s.String()
}

func (s *QueryOnchainBusinessRequest) SetAuthToken(v string) *QueryOnchainBusinessRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryOnchainBusinessRequest) SetProductInstanceId(v string) *QueryOnchainBusinessRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryOnchainBusinessRequest) SetAgentId(v string) *QueryOnchainBusinessRequest {
	s.AgentId = &v
	return s
}

func (s *QueryOnchainBusinessRequest) SetDid(v string) *QueryOnchainBusinessRequest {
	s.Did = &v
	return s
}

func (s *QueryOnchainBusinessRequest) SetCredentialId(v string) *QueryOnchainBusinessRequest {
	s.CredentialId = &v
	return s
}

func (s *QueryOnchainBusinessRequest) SetTxHash(v string) *QueryOnchainBusinessRequest {
	s.TxHash = &v
	return s
}

type QueryOnchainBusinessResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 凭证标识,如delegate_id
	CredentialId *string `json:"credential_id,omitempty" xml:"credential_id,omitempty"`
	// 上链内容，json形式
	Text *string `json:"text,omitempty" xml:"text,omitempty"`
	// 交易hash
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
	// 任务标识
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty"`
}

func (s QueryOnchainBusinessResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryOnchainBusinessResponse) GoString() string {
	return s.String()
}

func (s *QueryOnchainBusinessResponse) SetReqMsgId(v string) *QueryOnchainBusinessResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryOnchainBusinessResponse) SetResultCode(v string) *QueryOnchainBusinessResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryOnchainBusinessResponse) SetResultMsg(v string) *QueryOnchainBusinessResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryOnchainBusinessResponse) SetCredentialId(v string) *QueryOnchainBusinessResponse {
	s.CredentialId = &v
	return s
}

func (s *QueryOnchainBusinessResponse) SetText(v string) *QueryOnchainBusinessResponse {
	s.Text = &v
	return s
}

func (s *QueryOnchainBusinessResponse) SetTxHash(v string) *QueryOnchainBusinessResponse {
	s.TxHash = &v
	return s
}

func (s *QueryOnchainBusinessResponse) SetTaskId(v string) *QueryOnchainBusinessResponse {
	s.TaskId = &v
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
				"sdk_version":      tea.String("1.0.0"),
				"_prod_code":       tea.String("ATCS"),
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
 * Description: 可信服务上链数据异步提交
 * Summary: 可信数据异步上链任务提交
 */
func (client *Client) SubmitOnchainTask(request *SubmitOnchainTaskRequest) (_result *SubmitOnchainTaskResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SubmitOnchainTaskResponse{}
	_body, _err := client.SubmitOnchainTaskEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 可信服务上链数据异步提交
 * Summary: 可信数据异步上链任务提交
 */
func (client *Client) SubmitOnchainTaskEx(request *SubmitOnchainTaskRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SubmitOnchainTaskResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SubmitOnchainTaskResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.atcs.onchain.task.submit"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 可信数据异步上链任务结果查询
 * Summary: 可信数据异步上链任务结果查询
 */
func (client *Client) QueryOnchainTask(request *QueryOnchainTaskRequest) (_result *QueryOnchainTaskResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryOnchainTaskResponse{}
	_body, _err := client.QueryOnchainTaskEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 可信数据异步上链任务结果查询
 * Summary: 可信数据异步上链任务结果查询
 */
func (client *Client) QueryOnchainTaskEx(request *QueryOnchainTaskRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryOnchainTaskResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryOnchainTaskResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.atcs.onchain.task.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 链上合约业务数据查询
 * Summary: 链上合约业务数据查询
 */
func (client *Client) QueryOnchainBusiness(request *QueryOnchainBusinessRequest) (_result *QueryOnchainBusinessResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryOnchainBusinessResponse{}
	_body, _err := client.QueryOnchainBusinessEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 链上合约业务数据查询
 * Summary: 链上合约业务数据查询
 */
func (client *Client) QueryOnchainBusinessEx(request *QueryOnchainBusinessRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryOnchainBusinessResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryOnchainBusinessResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.atcs.onchain.business.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
