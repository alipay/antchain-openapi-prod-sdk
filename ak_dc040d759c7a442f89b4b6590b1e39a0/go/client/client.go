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

// eKYT风险标签
type RiskModel struct {
	// 标签名称
	ModelName *string `json:"model_name,omitempty" xml:"model_name,omitempty" require:"true"`
	// 风险值
	ModelValue *string `json:"model_value,omitempty" xml:"model_value,omitempty" require:"true"`
	// 风险标签描述
	ModelComment *string `json:"model_comment,omitempty" xml:"model_comment,omitempty" require:"true"`
}

func (s RiskModel) String() string {
	return tea.Prettify(s)
}

func (s RiskModel) GoString() string {
	return s.String()
}

func (s *RiskModel) SetModelName(v string) *RiskModel {
	s.ModelName = &v
	return s
}

func (s *RiskModel) SetModelValue(v string) *RiskModel {
	s.ModelValue = &v
	return s
}

func (s *RiskModel) SetModelComment(v string) *RiskModel {
	s.ModelComment = &v
	return s
}

// ekyt响应头
type ResponseHead struct {
	// 请求唯一标识
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty" require:"true"`
}

func (s ResponseHead) String() string {
	return tea.Prettify(s)
}

func (s ResponseHead) GoString() string {
	return s.String()
}

func (s *ResponseHead) SetRequestId(v string) *ResponseHead {
	s.RequestId = &v
	return s
}

// 风险评估结果
type RiskAssessResult struct {
	// 风险评估结果
	RiskValue *string `json:"risk_value,omitempty" xml:"risk_value,omitempty" require:"true"`
	// 风险评估分数
	RiskScore *string `json:"risk_score,omitempty" xml:"risk_score,omitempty" require:"true"`
	// 风险评估标签
	ModelInfos *RiskModel `json:"model_infos,omitempty" xml:"model_infos,omitempty" require:"true"`
}

func (s RiskAssessResult) String() string {
	return tea.Prettify(s)
}

func (s RiskAssessResult) GoString() string {
	return s.String()
}

func (s *RiskAssessResult) SetRiskValue(v string) *RiskAssessResult {
	s.RiskValue = &v
	return s
}

func (s *RiskAssessResult) SetRiskScore(v string) *RiskAssessResult {
	s.RiskScore = &v
	return s
}

func (s *RiskAssessResult) SetModelInfos(v *RiskModel) *RiskAssessResult {
	s.ModelInfos = v
	return s
}

// eKYT请求头
type RequestHead struct {
	// 请求唯一标识
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty" require:"true"`
	// 客户身份标识ID
	SecretId *string `json:"secret_id,omitempty" xml:"secret_id,omitempty" require:"true"`
	// 客户签约产品code
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty" require:"true"`
}

func (s RequestHead) String() string {
	return tea.Prettify(s)
}

func (s RequestHead) GoString() string {
	return s.String()
}

func (s *RequestHead) SetRequestId(v string) *RequestHead {
	s.RequestId = &v
	return s
}

func (s *RequestHead) SetSecretId(v string) *RequestHead {
	s.SecretId = &v
	return s
}

func (s *RequestHead) SetProductCode(v string) *RequestHead {
	s.ProductCode = &v
	return s
}

// 风险评估响应结果
type RiskAssessData struct {
	// 响应头
	Head *ResponseHead `json:"head,omitempty" xml:"head,omitempty" require:"true"`
	// 风险评估结果
	RiskResult *RiskAssessResult `json:"risk_result,omitempty" xml:"risk_result,omitempty" require:"true"`
}

func (s RiskAssessData) String() string {
	return tea.Prettify(s)
}

func (s RiskAssessData) GoString() string {
	return s.String()
}

func (s *RiskAssessData) SetHead(v *ResponseHead) *RiskAssessData {
	s.Head = v
	return s
}

func (s *RiskAssessData) SetRiskResult(v *RiskAssessResult) *RiskAssessData {
	s.RiskResult = v
	return s
}

type QueryAntsecuritytechGatewayEkytDriverRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 接口请求head
	Head *RequestHead `json:"head,omitempty" xml:"head,omitempty" require:"true"`
	// 请求业务参数，加密之后的密文信息
	Request *string `json:"request,omitempty" xml:"request,omitempty" require:"true"`
	// 请求数据签名值
	Signature *string `json:"signature,omitempty" xml:"signature,omitempty" require:"true"`
}

func (s QueryAntsecuritytechGatewayEkytDriverRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAntsecuritytechGatewayEkytDriverRequest) GoString() string {
	return s.String()
}

func (s *QueryAntsecuritytechGatewayEkytDriverRequest) SetAuthToken(v string) *QueryAntsecuritytechGatewayEkytDriverRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAntsecuritytechGatewayEkytDriverRequest) SetProductInstanceId(v string) *QueryAntsecuritytechGatewayEkytDriverRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAntsecuritytechGatewayEkytDriverRequest) SetHead(v *RequestHead) *QueryAntsecuritytechGatewayEkytDriverRequest {
	s.Head = v
	return s
}

func (s *QueryAntsecuritytechGatewayEkytDriverRequest) SetRequest(v string) *QueryAntsecuritytechGatewayEkytDriverRequest {
	s.Request = &v
	return s
}

func (s *QueryAntsecuritytechGatewayEkytDriverRequest) SetSignature(v string) *QueryAntsecuritytechGatewayEkytDriverRequest {
	s.Signature = &v
	return s
}

type QueryAntsecuritytechGatewayEkytDriverResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 接口响应结果
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
	// 接口响应描述
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 接口响应数据
	Data *RiskAssessData `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QueryAntsecuritytechGatewayEkytDriverResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAntsecuritytechGatewayEkytDriverResponse) GoString() string {
	return s.String()
}

func (s *QueryAntsecuritytechGatewayEkytDriverResponse) SetReqMsgId(v string) *QueryAntsecuritytechGatewayEkytDriverResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAntsecuritytechGatewayEkytDriverResponse) SetResultCode(v string) *QueryAntsecuritytechGatewayEkytDriverResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAntsecuritytechGatewayEkytDriverResponse) SetResultMsg(v string) *QueryAntsecuritytechGatewayEkytDriverResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAntsecuritytechGatewayEkytDriverResponse) SetSuccess(v bool) *QueryAntsecuritytechGatewayEkytDriverResponse {
	s.Success = &v
	return s
}

func (s *QueryAntsecuritytechGatewayEkytDriverResponse) SetMessage(v string) *QueryAntsecuritytechGatewayEkytDriverResponse {
	s.Message = &v
	return s
}

func (s *QueryAntsecuritytechGatewayEkytDriverResponse) SetData(v *RiskAssessData) *QueryAntsecuritytechGatewayEkytDriverResponse {
	s.Data = v
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
				"_prod_code":       tea.String("ak_dc040d759c7a442f89b4b6590b1e39a0"),
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
 * Description: eKYT风险评估服务-出行场景司机
 * Summary: eKYT风险评估服务-出行场景司机
 */
func (client *Client) QueryAntsecuritytechGatewayEkytDriver(request *QueryAntsecuritytechGatewayEkytDriverRequest) (_result *QueryAntsecuritytechGatewayEkytDriverResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAntsecuritytechGatewayEkytDriverResponse{}
	_body, _err := client.QueryAntsecuritytechGatewayEkytDriverEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: eKYT风险评估服务-出行场景司机
 * Summary: eKYT风险评估服务-出行场景司机
 */
func (client *Client) QueryAntsecuritytechGatewayEkytDriverEx(request *QueryAntsecuritytechGatewayEkytDriverRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAntsecuritytechGatewayEkytDriverResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAntsecuritytechGatewayEkytDriverResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antsecuritytech.gateway.ekyt.driver.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
