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

type ExecAntcloudBxptnewDataproductRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 数据产品编码
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty" require:"true"`
	// 请求ID，调用方需要确保唯一
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty" require:"true"`
	// 业务入参的json字符串
	BizContent *string `json:"biz_content,omitempty" xml:"biz_content,omitempty" require:"true"`
}

func (s ExecAntcloudBxptnewDataproductRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecAntcloudBxptnewDataproductRequest) GoString() string {
	return s.String()
}

func (s *ExecAntcloudBxptnewDataproductRequest) SetAuthToken(v string) *ExecAntcloudBxptnewDataproductRequest {
	s.AuthToken = &v
	return s
}

func (s *ExecAntcloudBxptnewDataproductRequest) SetProductCode(v string) *ExecAntcloudBxptnewDataproductRequest {
	s.ProductCode = &v
	return s
}

func (s *ExecAntcloudBxptnewDataproductRequest) SetRequestId(v string) *ExecAntcloudBxptnewDataproductRequest {
	s.RequestId = &v
	return s
}

func (s *ExecAntcloudBxptnewDataproductRequest) SetBizContent(v string) *ExecAntcloudBxptnewDataproductRequest {
	s.BizContent = &v
	return s
}

type ExecAntcloudBxptnewDataproductResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务返回值
	//
	BizResult *string `json:"biz_result,omitempty" xml:"biz_result,omitempty"`
	// 是否计费标识
	// Y 表示计费，N 表示不计费
	ChargeFlag *string `json:"charge_flag,omitempty" xml:"charge_flag,omitempty"`
}

func (s ExecAntcloudBxptnewDataproductResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecAntcloudBxptnewDataproductResponse) GoString() string {
	return s.String()
}

func (s *ExecAntcloudBxptnewDataproductResponse) SetReqMsgId(v string) *ExecAntcloudBxptnewDataproductResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ExecAntcloudBxptnewDataproductResponse) SetResultCode(v string) *ExecAntcloudBxptnewDataproductResponse {
	s.ResultCode = &v
	return s
}

func (s *ExecAntcloudBxptnewDataproductResponse) SetResultMsg(v string) *ExecAntcloudBxptnewDataproductResponse {
	s.ResultMsg = &v
	return s
}

func (s *ExecAntcloudBxptnewDataproductResponse) SetBizResult(v string) *ExecAntcloudBxptnewDataproductResponse {
	s.BizResult = &v
	return s
}

func (s *ExecAntcloudBxptnewDataproductResponse) SetChargeFlag(v string) *ExecAntcloudBxptnewDataproductResponse {
	s.ChargeFlag = &v
	return s
}

type ExecAntcloudBxptnewDataproductAsyncRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 数据产品编码
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty" require:"true"`
	// 产品类型
	//
	ProductType *string `json:"product_type,omitempty" xml:"product_type,omitempty" require:"true"`
	// 请求ID，调用方需要确保唯一
	//
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty" require:"true"`
	// 业务入参的json字符串
	//
	BizContent *string `json:"biz_content,omitempty" xml:"biz_content,omitempty" require:"true"`
}

func (s ExecAntcloudBxptnewDataproductAsyncRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecAntcloudBxptnewDataproductAsyncRequest) GoString() string {
	return s.String()
}

func (s *ExecAntcloudBxptnewDataproductAsyncRequest) SetAuthToken(v string) *ExecAntcloudBxptnewDataproductAsyncRequest {
	s.AuthToken = &v
	return s
}

func (s *ExecAntcloudBxptnewDataproductAsyncRequest) SetProductCode(v string) *ExecAntcloudBxptnewDataproductAsyncRequest {
	s.ProductCode = &v
	return s
}

func (s *ExecAntcloudBxptnewDataproductAsyncRequest) SetProductType(v string) *ExecAntcloudBxptnewDataproductAsyncRequest {
	s.ProductType = &v
	return s
}

func (s *ExecAntcloudBxptnewDataproductAsyncRequest) SetRequestId(v string) *ExecAntcloudBxptnewDataproductAsyncRequest {
	s.RequestId = &v
	return s
}

func (s *ExecAntcloudBxptnewDataproductAsyncRequest) SetBizContent(v string) *ExecAntcloudBxptnewDataproductAsyncRequest {
	s.BizContent = &v
	return s
}

type ExecAntcloudBxptnewDataproductAsyncResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 执行状态
	// RUNNING：执行中
	// SUCCESS：成功
	// FAIL：失败
	ExecStatus *string `json:"exec_status,omitempty" xml:"exec_status,omitempty"`
}

func (s ExecAntcloudBxptnewDataproductAsyncResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecAntcloudBxptnewDataproductAsyncResponse) GoString() string {
	return s.String()
}

func (s *ExecAntcloudBxptnewDataproductAsyncResponse) SetReqMsgId(v string) *ExecAntcloudBxptnewDataproductAsyncResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ExecAntcloudBxptnewDataproductAsyncResponse) SetResultCode(v string) *ExecAntcloudBxptnewDataproductAsyncResponse {
	s.ResultCode = &v
	return s
}

func (s *ExecAntcloudBxptnewDataproductAsyncResponse) SetResultMsg(v string) *ExecAntcloudBxptnewDataproductAsyncResponse {
	s.ResultMsg = &v
	return s
}

func (s *ExecAntcloudBxptnewDataproductAsyncResponse) SetExecStatus(v string) *ExecAntcloudBxptnewDataproductAsyncResponse {
	s.ExecStatus = &v
	return s
}

type QueryAntcloudBxptnewDataproductAsyncRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 数据产品编码
	//
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty" require:"true"`
	// 产品类型
	//
	ProductType *string `json:"product_type,omitempty" xml:"product_type,omitempty" require:"true"`
	// 请求ID，需要确保和异步调用的请求ID一致
	//
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty" require:"true"`
}

func (s QueryAntcloudBxptnewDataproductAsyncRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAntcloudBxptnewDataproductAsyncRequest) GoString() string {
	return s.String()
}

func (s *QueryAntcloudBxptnewDataproductAsyncRequest) SetAuthToken(v string) *QueryAntcloudBxptnewDataproductAsyncRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAntcloudBxptnewDataproductAsyncRequest) SetProductCode(v string) *QueryAntcloudBxptnewDataproductAsyncRequest {
	s.ProductCode = &v
	return s
}

func (s *QueryAntcloudBxptnewDataproductAsyncRequest) SetProductType(v string) *QueryAntcloudBxptnewDataproductAsyncRequest {
	s.ProductType = &v
	return s
}

func (s *QueryAntcloudBxptnewDataproductAsyncRequest) SetRequestId(v string) *QueryAntcloudBxptnewDataproductAsyncRequest {
	s.RequestId = &v
	return s
}

type QueryAntcloudBxptnewDataproductAsyncResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 执行状态
	// INIT：请求已受理
	// RUNNING：执行中
	// SUCCESS：成功
	// FAIL：失败
	ExecStatus *string `json:"exec_status,omitempty" xml:"exec_status,omitempty"`
	// 业务返回值
	//
	BizResult *string `json:"biz_result,omitempty" xml:"biz_result,omitempty"`
	// 是否计费标识 Y 表示计费，N 表示不计费
	//
	ChargeFlag *string `json:"charge_flag,omitempty" xml:"charge_flag,omitempty"`
}

func (s QueryAntcloudBxptnewDataproductAsyncResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAntcloudBxptnewDataproductAsyncResponse) GoString() string {
	return s.String()
}

func (s *QueryAntcloudBxptnewDataproductAsyncResponse) SetReqMsgId(v string) *QueryAntcloudBxptnewDataproductAsyncResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAntcloudBxptnewDataproductAsyncResponse) SetResultCode(v string) *QueryAntcloudBxptnewDataproductAsyncResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAntcloudBxptnewDataproductAsyncResponse) SetResultMsg(v string) *QueryAntcloudBxptnewDataproductAsyncResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAntcloudBxptnewDataproductAsyncResponse) SetExecStatus(v string) *QueryAntcloudBxptnewDataproductAsyncResponse {
	s.ExecStatus = &v
	return s
}

func (s *QueryAntcloudBxptnewDataproductAsyncResponse) SetBizResult(v string) *QueryAntcloudBxptnewDataproductAsyncResponse {
	s.BizResult = &v
	return s
}

func (s *QueryAntcloudBxptnewDataproductAsyncResponse) SetChargeFlag(v string) *QueryAntcloudBxptnewDataproductAsyncResponse {
	s.ChargeFlag = &v
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
				"_prod_code":       tea.String("ak_ffd8f5e932224d668101af0154daa8a6"),
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
 * Description: 保险数据产品服务调用
 * Summary: 保险数据产品服务调用
 */
func (client *Client) ExecAntcloudBxptnewDataproduct(request *ExecAntcloudBxptnewDataproductRequest) (_result *ExecAntcloudBxptnewDataproductResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ExecAntcloudBxptnewDataproductResponse{}
	_body, _err := client.ExecAntcloudBxptnewDataproductEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 保险数据产品服务调用
 * Summary: 保险数据产品服务调用
 */
func (client *Client) ExecAntcloudBxptnewDataproductEx(request *ExecAntcloudBxptnewDataproductRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ExecAntcloudBxptnewDataproductResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecAntcloudBxptnewDataproductResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.bxptnew.dataproduct.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 保险数据产品服务异步调用
 * Summary: 保险数据产品服务异步调用
 */
func (client *Client) ExecAntcloudBxptnewDataproductAsync(request *ExecAntcloudBxptnewDataproductAsyncRequest) (_result *ExecAntcloudBxptnewDataproductAsyncResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ExecAntcloudBxptnewDataproductAsyncResponse{}
	_body, _err := client.ExecAntcloudBxptnewDataproductAsyncEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 保险数据产品服务异步调用
 * Summary: 保险数据产品服务异步调用
 */
func (client *Client) ExecAntcloudBxptnewDataproductAsyncEx(request *ExecAntcloudBxptnewDataproductAsyncRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ExecAntcloudBxptnewDataproductAsyncResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecAntcloudBxptnewDataproductAsyncResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.bxptnew.dataproduct.async.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 保险数据产品服务异步结果查询
 * Summary: 保险数据产品服务异步结果查询
 */
func (client *Client) QueryAntcloudBxptnewDataproductAsync(request *QueryAntcloudBxptnewDataproductAsyncRequest) (_result *QueryAntcloudBxptnewDataproductAsyncResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAntcloudBxptnewDataproductAsyncResponse{}
	_body, _err := client.QueryAntcloudBxptnewDataproductAsyncEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 保险数据产品服务异步结果查询
 * Summary: 保险数据产品服务异步结果查询
 */
func (client *Client) QueryAntcloudBxptnewDataproductAsyncEx(request *QueryAntcloudBxptnewDataproductAsyncRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAntcloudBxptnewDataproductAsyncResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAntcloudBxptnewDataproductAsyncResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.bxptnew.dataproduct.async.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
