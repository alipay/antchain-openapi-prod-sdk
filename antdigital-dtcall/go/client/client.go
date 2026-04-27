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

// 外呼任务简单对象
type OutcallTask struct {
	// 任务编码
	Code *string `json:"code,omitempty" xml:"code,omitempty" require:"true"`
	// 任务名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
}

func (s OutcallTask) String() string {
	return tea.Prettify(s)
}

func (s OutcallTask) GoString() string {
	return s.String()
}

func (s *OutcallTask) SetCode(v string) *OutcallTask {
	s.Code = &v
	return s
}

func (s *OutcallTask) SetName(v string) *OutcallTask {
	s.Name = &v
	return s
}

// 触达用户
type Customer struct {
	// 用户手机号
	PhoneNumber *string `json:"phone_number,omitempty" xml:"phone_number,omitempty" require:"true"`
	// 用户业务 ID，回执中透出，需保证唯一
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 扩展业务字段，可用于变量参数和回执透出 json格式字符串
	BizProperties *string `json:"biz_properties,omitempty" xml:"biz_properties,omitempty"`
}

func (s Customer) String() string {
	return tea.Prettify(s)
}

func (s Customer) GoString() string {
	return s.String()
}

func (s *Customer) SetPhoneNumber(v string) *Customer {
	s.PhoneNumber = &v
	return s
}

func (s *Customer) SetBizId(v string) *Customer {
	s.BizId = &v
	return s
}

func (s *Customer) SetBizProperties(v string) *Customer {
	s.BizProperties = &v
	return s
}

type QueryAntcloudDtcallagentTaskRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 实例编码
	InstanceCode *string `json:"instance_code,omitempty" xml:"instance_code,omitempty" require:"true"`
	// 任务名称，支持模糊匹配
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
}

func (s QueryAntcloudDtcallagentTaskRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAntcloudDtcallagentTaskRequest) GoString() string {
	return s.String()
}

func (s *QueryAntcloudDtcallagentTaskRequest) SetAuthToken(v string) *QueryAntcloudDtcallagentTaskRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAntcloudDtcallagentTaskRequest) SetTenantId(v string) *QueryAntcloudDtcallagentTaskRequest {
	s.TenantId = &v
	return s
}

func (s *QueryAntcloudDtcallagentTaskRequest) SetInstanceCode(v string) *QueryAntcloudDtcallagentTaskRequest {
	s.InstanceCode = &v
	return s
}

func (s *QueryAntcloudDtcallagentTaskRequest) SetName(v string) *QueryAntcloudDtcallagentTaskRequest {
	s.Name = &v
	return s
}

type QueryAntcloudDtcallagentTaskResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 请求唯一id
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
	// 是否成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
	// 任务列表
	Data []*OutcallTask `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
}

func (s QueryAntcloudDtcallagentTaskResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAntcloudDtcallagentTaskResponse) GoString() string {
	return s.String()
}

func (s *QueryAntcloudDtcallagentTaskResponse) SetReqMsgId(v string) *QueryAntcloudDtcallagentTaskResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAntcloudDtcallagentTaskResponse) SetResultCode(v string) *QueryAntcloudDtcallagentTaskResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAntcloudDtcallagentTaskResponse) SetResultMsg(v string) *QueryAntcloudDtcallagentTaskResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAntcloudDtcallagentTaskResponse) SetRequestId(v string) *QueryAntcloudDtcallagentTaskResponse {
	s.RequestId = &v
	return s
}

func (s *QueryAntcloudDtcallagentTaskResponse) SetSuccess(v bool) *QueryAntcloudDtcallagentTaskResponse {
	s.Success = &v
	return s
}

func (s *QueryAntcloudDtcallagentTaskResponse) SetData(v []*OutcallTask) *QueryAntcloudDtcallagentTaskResponse {
	s.Data = v
	return s
}

type ImportAntcloudDtcallagentDispatcherOrderRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 请求唯一 ID，建议全局唯一
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty" require:"true"`
	// 租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 实例code
	InstanceCode *string `json:"instance_code,omitempty" xml:"instance_code,omitempty" require:"true"`
	// 外呼任务编码
	TaskCode *string `json:"task_code,omitempty" xml:"task_code,omitempty" require:"true"`
	// 外呼调度时间，实际拨打时间大于等于该时间，建议格式：yyyy-MM-dd HH:mm:ss
	CallTime *string `json:"call_time,omitempty" xml:"call_time,omitempty" require:"true"`
	// 失效时间，建议格式：yyyy-MM-dd HH:mm:ss，默认 7 天
	ExpirationTime *string `json:"expiration_time,omitempty" xml:"expiration_time,omitempty"`
	// 触达用户列表，单次上限 100
	CustomerList []*Customer `json:"customer_list,omitempty" xml:"customer_list,omitempty" require:"true" type:"Repeated"`
}

func (s ImportAntcloudDtcallagentDispatcherOrderRequest) String() string {
	return tea.Prettify(s)
}

func (s ImportAntcloudDtcallagentDispatcherOrderRequest) GoString() string {
	return s.String()
}

func (s *ImportAntcloudDtcallagentDispatcherOrderRequest) SetAuthToken(v string) *ImportAntcloudDtcallagentDispatcherOrderRequest {
	s.AuthToken = &v
	return s
}

func (s *ImportAntcloudDtcallagentDispatcherOrderRequest) SetRequestId(v string) *ImportAntcloudDtcallagentDispatcherOrderRequest {
	s.RequestId = &v
	return s
}

func (s *ImportAntcloudDtcallagentDispatcherOrderRequest) SetTenantId(v string) *ImportAntcloudDtcallagentDispatcherOrderRequest {
	s.TenantId = &v
	return s
}

func (s *ImportAntcloudDtcallagentDispatcherOrderRequest) SetInstanceCode(v string) *ImportAntcloudDtcallagentDispatcherOrderRequest {
	s.InstanceCode = &v
	return s
}

func (s *ImportAntcloudDtcallagentDispatcherOrderRequest) SetTaskCode(v string) *ImportAntcloudDtcallagentDispatcherOrderRequest {
	s.TaskCode = &v
	return s
}

func (s *ImportAntcloudDtcallagentDispatcherOrderRequest) SetCallTime(v string) *ImportAntcloudDtcallagentDispatcherOrderRequest {
	s.CallTime = &v
	return s
}

func (s *ImportAntcloudDtcallagentDispatcherOrderRequest) SetExpirationTime(v string) *ImportAntcloudDtcallagentDispatcherOrderRequest {
	s.ExpirationTime = &v
	return s
}

func (s *ImportAntcloudDtcallagentDispatcherOrderRequest) SetCustomerList(v []*Customer) *ImportAntcloudDtcallagentDispatcherOrderRequest {
	s.CustomerList = v
	return s
}

type ImportAntcloudDtcallagentDispatcherOrderResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 请求唯一 ID
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
	// 是否成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s ImportAntcloudDtcallagentDispatcherOrderResponse) String() string {
	return tea.Prettify(s)
}

func (s ImportAntcloudDtcallagentDispatcherOrderResponse) GoString() string {
	return s.String()
}

func (s *ImportAntcloudDtcallagentDispatcherOrderResponse) SetReqMsgId(v string) *ImportAntcloudDtcallagentDispatcherOrderResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ImportAntcloudDtcallagentDispatcherOrderResponse) SetResultCode(v string) *ImportAntcloudDtcallagentDispatcherOrderResponse {
	s.ResultCode = &v
	return s
}

func (s *ImportAntcloudDtcallagentDispatcherOrderResponse) SetResultMsg(v string) *ImportAntcloudDtcallagentDispatcherOrderResponse {
	s.ResultMsg = &v
	return s
}

func (s *ImportAntcloudDtcallagentDispatcherOrderResponse) SetRequestId(v string) *ImportAntcloudDtcallagentDispatcherOrderResponse {
	s.RequestId = &v
	return s
}

func (s *ImportAntcloudDtcallagentDispatcherOrderResponse) SetSuccess(v bool) *ImportAntcloudDtcallagentDispatcherOrderResponse {
	s.Success = &v
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
				"_prod_code":       tea.String("DTCALL"),
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
 * Description: 外呼任务查询接口
 * Summary: 外呼任务查询接口
 */
func (client *Client) QueryAntcloudDtcallagentTask(request *QueryAntcloudDtcallagentTaskRequest) (_result *QueryAntcloudDtcallagentTaskResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAntcloudDtcallagentTaskResponse{}
	_body, _err := client.QueryAntcloudDtcallagentTaskEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 外呼任务查询接口
 * Summary: 外呼任务查询接口
 */
func (client *Client) QueryAntcloudDtcallagentTaskEx(request *QueryAntcloudDtcallagentTaskRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAntcloudDtcallagentTaskResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAntcloudDtcallagentTaskResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.dtcallagent.task.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 对外批量收单接口
 * Summary: 对外批量收单接口
 */
func (client *Client) ImportAntcloudDtcallagentDispatcherOrder(request *ImportAntcloudDtcallagentDispatcherOrderRequest) (_result *ImportAntcloudDtcallagentDispatcherOrderResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ImportAntcloudDtcallagentDispatcherOrderResponse{}
	_body, _err := client.ImportAntcloudDtcallagentDispatcherOrderEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 对外批量收单接口
 * Summary: 对外批量收单接口
 */
func (client *Client) ImportAntcloudDtcallagentDispatcherOrderEx(request *ImportAntcloudDtcallagentDispatcherOrderRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ImportAntcloudDtcallagentDispatcherOrderResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ImportAntcloudDtcallagentDispatcherOrderResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.dtcallagent.dispatcher.order.import"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
