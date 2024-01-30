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

// data
type WANJIE struct {
	// code
	Code *string `json:"code,omitempty" xml:"code,omitempty" require:"true"`
	// abilityAttribute
	AbilityAttribute *string `json:"ability_attribute,omitempty" xml:"ability_attribute,omitempty" require:"true"`
	// pastAttribute
	PastAttribute *string `json:"past_attribute,omitempty" xml:"past_attribute,omitempty"`
	// stabilityAttribute
	StabilityAttribute *string `json:"stability_attribute,omitempty" xml:"stability_attribute,omitempty"`
}

func (s WANJIE) String() string {
	return tea.Prettify(s)
}

func (s WANJIE) GoString() string {
	return s.String()
}

func (s *WANJIE) SetCode(v string) *WANJIE {
	s.Code = &v
	return s
}

func (s *WANJIE) SetAbilityAttribute(v string) *WANJIE {
	s.AbilityAttribute = &v
	return s
}

func (s *WANJIE) SetPastAttribute(v string) *WANJIE {
	s.PastAttribute = &v
	return s
}

func (s *WANJIE) SetStabilityAttribute(v string) *WANJIE {
	s.StabilityAttribute = &v
	return s
}

type VerifyHarmfulRecordRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 业务请求体
	BizContent *string `json:"biz_content,omitempty" xml:"biz_content,omitempty" require:"true"`
	// 实际计量租户
	MeteringEffectInvoker *string `json:"metering_effect_invoker,omitempty" xml:"metering_effect_invoker,omitempty"`
}

func (s VerifyHarmfulRecordRequest) String() string {
	return tea.Prettify(s)
}

func (s VerifyHarmfulRecordRequest) GoString() string {
	return s.String()
}

func (s *VerifyHarmfulRecordRequest) SetAuthToken(v string) *VerifyHarmfulRecordRequest {
	s.AuthToken = &v
	return s
}

func (s *VerifyHarmfulRecordRequest) SetProductInstanceId(v string) *VerifyHarmfulRecordRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *VerifyHarmfulRecordRequest) SetBizContent(v string) *VerifyHarmfulRecordRequest {
	s.BizContent = &v
	return s
}

func (s *VerifyHarmfulRecordRequest) SetMeteringEffectInvoker(v string) *VerifyHarmfulRecordRequest {
	s.MeteringEffectInvoker = &v
	return s
}

type VerifyHarmfulRecordResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 系统响应
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
}

func (s VerifyHarmfulRecordResponse) String() string {
	return tea.Prettify(s)
}

func (s VerifyHarmfulRecordResponse) GoString() string {
	return s.String()
}

func (s *VerifyHarmfulRecordResponse) SetReqMsgId(v string) *VerifyHarmfulRecordResponse {
	s.ReqMsgId = &v
	return s
}

func (s *VerifyHarmfulRecordResponse) SetResultCode(v string) *VerifyHarmfulRecordResponse {
	s.ResultCode = &v
	return s
}

func (s *VerifyHarmfulRecordResponse) SetResultMsg(v string) *VerifyHarmfulRecordResponse {
	s.ResultMsg = &v
	return s
}

func (s *VerifyHarmfulRecordResponse) SetStatus(v string) *VerifyHarmfulRecordResponse {
	s.Status = &v
	return s
}

type QueryIndividualtaxScoreRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 业务请求体
	BizContent *string `json:"biz_content,omitempty" xml:"biz_content,omitempty" require:"true"`
}

func (s QueryIndividualtaxScoreRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryIndividualtaxScoreRequest) GoString() string {
	return s.String()
}

func (s *QueryIndividualtaxScoreRequest) SetAuthToken(v string) *QueryIndividualtaxScoreRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryIndividualtaxScoreRequest) SetProductInstanceId(v string) *QueryIndividualtaxScoreRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryIndividualtaxScoreRequest) SetBizContent(v string) *QueryIndividualtaxScoreRequest {
	s.BizContent = &v
	return s
}

type QueryIndividualtaxScoreResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 分数区间
	Range *string `json:"range,omitempty" xml:"range,omitempty"`
}

func (s QueryIndividualtaxScoreResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryIndividualtaxScoreResponse) GoString() string {
	return s.String()
}

func (s *QueryIndividualtaxScoreResponse) SetReqMsgId(v string) *QueryIndividualtaxScoreResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryIndividualtaxScoreResponse) SetResultCode(v string) *QueryIndividualtaxScoreResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryIndividualtaxScoreResponse) SetResultMsg(v string) *QueryIndividualtaxScoreResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryIndividualtaxScoreResponse) SetRange(v string) *QueryIndividualtaxScoreResponse {
	s.Range = &v
	return s
}

type QueryFinanceAbilityRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 大经分
	SceneCode *string `json:"scene_code,omitempty" xml:"scene_code,omitempty" require:"true"`
	// 身份证号
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty" require:"true"`
	// 姓名
	UserName *string `json:"user_name,omitempty" xml:"user_name,omitempty"`
	// 手机号
	TelNo *string `json:"tel_no,omitempty" xml:"tel_no,omitempty"`
	// true
	Encrypt *bool `json:"encrypt,omitempty" xml:"encrypt,omitempty"`
}

func (s QueryFinanceAbilityRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryFinanceAbilityRequest) GoString() string {
	return s.String()
}

func (s *QueryFinanceAbilityRequest) SetAuthToken(v string) *QueryFinanceAbilityRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryFinanceAbilityRequest) SetProductInstanceId(v string) *QueryFinanceAbilityRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryFinanceAbilityRequest) SetSceneCode(v string) *QueryFinanceAbilityRequest {
	s.SceneCode = &v
	return s
}

func (s *QueryFinanceAbilityRequest) SetCertNo(v string) *QueryFinanceAbilityRequest {
	s.CertNo = &v
	return s
}

func (s *QueryFinanceAbilityRequest) SetUserName(v string) *QueryFinanceAbilityRequest {
	s.UserName = &v
	return s
}

func (s *QueryFinanceAbilityRequest) SetTelNo(v string) *QueryFinanceAbilityRequest {
	s.TelNo = &v
	return s
}

func (s *QueryFinanceAbilityRequest) SetEncrypt(v bool) *QueryFinanceAbilityRequest {
	s.Encrypt = &v
	return s
}

type QueryFinanceAbilityResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	//
	//   "data": {
	//     "abilityAttribute": "15",
	//     "code": "00"
	//   }
	Data *WANJIE `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QueryFinanceAbilityResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryFinanceAbilityResponse) GoString() string {
	return s.String()
}

func (s *QueryFinanceAbilityResponse) SetReqMsgId(v string) *QueryFinanceAbilityResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryFinanceAbilityResponse) SetResultCode(v string) *QueryFinanceAbilityResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryFinanceAbilityResponse) SetResultMsg(v string) *QueryFinanceAbilityResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryFinanceAbilityResponse) SetData(v *WANJIE) *QueryFinanceAbilityResponse {
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
				"sdk_version":      tea.String("1.0.6"),
				"_prod_code":       tea.String("WINDWARD"),
				"_prod_channel":    tea.String("undefined"),
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
 * Description: 不良数据查询
 * Summary: 不良数据查询
 */
func (client *Client) VerifyHarmfulRecord(request *VerifyHarmfulRecordRequest) (_result *VerifyHarmfulRecordResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &VerifyHarmfulRecordResponse{}
	_body, _err := client.VerifyHarmfulRecordEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 不良数据查询
 * Summary: 不良数据查询
 */
func (client *Client) VerifyHarmfulRecordEx(request *VerifyHarmfulRecordRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *VerifyHarmfulRecordResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &VerifyHarmfulRecordResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.windward.harmful.record.verify"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 个税分数查询
 * Summary: 个税分数查询
 */
func (client *Client) QueryIndividualtaxScore(request *QueryIndividualtaxScoreRequest) (_result *QueryIndividualtaxScoreResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryIndividualtaxScoreResponse{}
	_body, _err := client.QueryIndividualtaxScoreEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 个税分数查询
 * Summary: 个税分数查询
 */
func (client *Client) QueryIndividualtaxScoreEx(request *QueryIndividualtaxScoreRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryIndividualtaxScoreResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryIndividualtaxScoreResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.windward.individualtax.score.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 经济分析模型评估查询，社保/个税
 * Summary: 身份信息-经济分析模型评估查询
 */
func (client *Client) QueryFinanceAbility(request *QueryFinanceAbilityRequest) (_result *QueryFinanceAbilityResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryFinanceAbilityResponse{}
	_body, _err := client.QueryFinanceAbilityEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 经济分析模型评估查询，社保/个税
 * Summary: 身份信息-经济分析模型评估查询
 */
func (client *Client) QueryFinanceAbilityEx(request *QueryFinanceAbilityRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryFinanceAbilityResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryFinanceAbilityResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.windward.finance.ability.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
