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

type QueryAntcloudBxptnewDatapromotionDecisionRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 保司编码
	InsurerCode *string `json:"insurer_code,omitempty" xml:"insurer_code,omitempty" require:"true"`
	// 保险险种
	InsuranceType *string `json:"insurance_type,omitempty" xml:"insurance_type,omitempty" require:"true"`
	// 业务参数内容JSON字符串
	BizContent *string `json:"biz_content,omitempty" xml:"biz_content,omitempty" require:"true"`
}

func (s QueryAntcloudBxptnewDatapromotionDecisionRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAntcloudBxptnewDatapromotionDecisionRequest) GoString() string {
	return s.String()
}

func (s *QueryAntcloudBxptnewDatapromotionDecisionRequest) SetAuthToken(v string) *QueryAntcloudBxptnewDatapromotionDecisionRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAntcloudBxptnewDatapromotionDecisionRequest) SetInsurerCode(v string) *QueryAntcloudBxptnewDatapromotionDecisionRequest {
	s.InsurerCode = &v
	return s
}

func (s *QueryAntcloudBxptnewDatapromotionDecisionRequest) SetInsuranceType(v string) *QueryAntcloudBxptnewDatapromotionDecisionRequest {
	s.InsuranceType = &v
	return s
}

func (s *QueryAntcloudBxptnewDatapromotionDecisionRequest) SetBizContent(v string) *QueryAntcloudBxptnewDatapromotionDecisionRequest {
	s.BizContent = &v
	return s
}

type QueryAntcloudBxptnewDatapromotionDecisionResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务出参JSON字符串
	BizResult *string `json:"biz_result,omitempty" xml:"biz_result,omitempty"`
}

func (s QueryAntcloudBxptnewDatapromotionDecisionResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAntcloudBxptnewDatapromotionDecisionResponse) GoString() string {
	return s.String()
}

func (s *QueryAntcloudBxptnewDatapromotionDecisionResponse) SetReqMsgId(v string) *QueryAntcloudBxptnewDatapromotionDecisionResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAntcloudBxptnewDatapromotionDecisionResponse) SetResultCode(v string) *QueryAntcloudBxptnewDatapromotionDecisionResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAntcloudBxptnewDatapromotionDecisionResponse) SetResultMsg(v string) *QueryAntcloudBxptnewDatapromotionDecisionResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAntcloudBxptnewDatapromotionDecisionResponse) SetBizResult(v string) *QueryAntcloudBxptnewDatapromotionDecisionResponse {
	s.BizResult = &v
	return s
}

type PushAntcloudBxptnewDatapromotionTrafficRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 保险险种
	InsurerCode *string `json:"insurer_code,omitempty" xml:"insurer_code,omitempty" require:"true"`
	// 保险险种
	InsuranceType *string `json:"insurance_type,omitempty" xml:"insurance_type,omitempty" require:"true"`
	// 业务参数内容JSON字符串
	BizContent *string `json:"biz_content,omitempty" xml:"biz_content,omitempty" require:"true"`
	// 协议签署：USER_SIGN_INFO;；
	// 车辆信息上报：CAR_INFO；
	PushDataType *string `json:"push_data_type,omitempty" xml:"push_data_type,omitempty" require:"true"`
}

func (s PushAntcloudBxptnewDatapromotionTrafficRequest) String() string {
	return tea.Prettify(s)
}

func (s PushAntcloudBxptnewDatapromotionTrafficRequest) GoString() string {
	return s.String()
}

func (s *PushAntcloudBxptnewDatapromotionTrafficRequest) SetAuthToken(v string) *PushAntcloudBxptnewDatapromotionTrafficRequest {
	s.AuthToken = &v
	return s
}

func (s *PushAntcloudBxptnewDatapromotionTrafficRequest) SetInsurerCode(v string) *PushAntcloudBxptnewDatapromotionTrafficRequest {
	s.InsurerCode = &v
	return s
}

func (s *PushAntcloudBxptnewDatapromotionTrafficRequest) SetInsuranceType(v string) *PushAntcloudBxptnewDatapromotionTrafficRequest {
	s.InsuranceType = &v
	return s
}

func (s *PushAntcloudBxptnewDatapromotionTrafficRequest) SetBizContent(v string) *PushAntcloudBxptnewDatapromotionTrafficRequest {
	s.BizContent = &v
	return s
}

func (s *PushAntcloudBxptnewDatapromotionTrafficRequest) SetPushDataType(v string) *PushAntcloudBxptnewDatapromotionTrafficRequest {
	s.PushDataType = &v
	return s
}

type PushAntcloudBxptnewDatapromotionTrafficResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// {}
	BizResult *string `json:"biz_result,omitempty" xml:"biz_result,omitempty"`
}

func (s PushAntcloudBxptnewDatapromotionTrafficResponse) String() string {
	return tea.Prettify(s)
}

func (s PushAntcloudBxptnewDatapromotionTrafficResponse) GoString() string {
	return s.String()
}

func (s *PushAntcloudBxptnewDatapromotionTrafficResponse) SetReqMsgId(v string) *PushAntcloudBxptnewDatapromotionTrafficResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PushAntcloudBxptnewDatapromotionTrafficResponse) SetResultCode(v string) *PushAntcloudBxptnewDatapromotionTrafficResponse {
	s.ResultCode = &v
	return s
}

func (s *PushAntcloudBxptnewDatapromotionTrafficResponse) SetResultMsg(v string) *PushAntcloudBxptnewDatapromotionTrafficResponse {
	s.ResultMsg = &v
	return s
}

func (s *PushAntcloudBxptnewDatapromotionTrafficResponse) SetBizResult(v string) *PushAntcloudBxptnewDatapromotionTrafficResponse {
	s.BizResult = &v
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
				"sdk_version":      tea.String("1.0.3"),
				"_prod_code":       tea.String("ak_66d0b62c20644717870b45e5087b8007"),
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
 * Description: 保险数据营销决策查询
 * Summary: 保险数据营销决策查询
 */
func (client *Client) QueryAntcloudBxptnewDatapromotionDecision(request *QueryAntcloudBxptnewDatapromotionDecisionRequest) (_result *QueryAntcloudBxptnewDatapromotionDecisionResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAntcloudBxptnewDatapromotionDecisionResponse{}
	_body, _err := client.QueryAntcloudBxptnewDatapromotionDecisionEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 保险数据营销决策查询
 * Summary: 保险数据营销决策查询
 */
func (client *Client) QueryAntcloudBxptnewDatapromotionDecisionEx(request *QueryAntcloudBxptnewDatapromotionDecisionRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAntcloudBxptnewDatapromotionDecisionResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAntcloudBxptnewDatapromotionDecisionResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.bxptnew.datapromotion.decision.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 保险数据营销流量推送
 * Summary: 保险数据营销流量推送
 */
func (client *Client) PushAntcloudBxptnewDatapromotionTraffic(request *PushAntcloudBxptnewDatapromotionTrafficRequest) (_result *PushAntcloudBxptnewDatapromotionTrafficResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PushAntcloudBxptnewDatapromotionTrafficResponse{}
	_body, _err := client.PushAntcloudBxptnewDatapromotionTrafficEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 保险数据营销流量推送
 * Summary: 保险数据营销流量推送
 */
func (client *Client) PushAntcloudBxptnewDatapromotionTrafficEx(request *PushAntcloudBxptnewDatapromotionTrafficRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PushAntcloudBxptnewDatapromotionTrafficResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PushAntcloudBxptnewDatapromotionTrafficResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.bxptnew.datapromotion.traffic.push"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
