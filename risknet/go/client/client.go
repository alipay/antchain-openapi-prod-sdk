// This file is auto-generated, don't edit it. Thanks.
package client

import (
	rpcutil "github.com/alibabacloud-go/tea-rpc-utils/service"
	util "github.com/alibabacloud-go/tea-utils/service"
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

type QueryGeneralRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 调用服务名
	Service *string `json:"service,omitempty" xml:"service,omitempty" require:"true"`
	// 服务模式
	ServiceMode *string `json:"service_mode,omitempty" xml:"service_mode,omitempty" require:"true"`
	// 用于标记是否获得用户授权  1:获得授权（默认）
	// 0:未获得授权
	UserAuthorization *string `json:"user_authorization,omitempty" xml:"user_authorization,omitempty" require:"true"`
	// 经过RSA加密的用于AES加密的随机数密钥
	EncryptedRandomNo *string `json:"encrypted_random_no,omitempty" xml:"encrypted_random_no,omitempty"`
	// 记录外部调用ISV
	ExternalId *string `json:"external_id,omitempty" xml:"external_id,omitempty"`
	// 银行卡号
	BankCardNo *string `json:"bank_card_no,omitempty" xml:"bank_card_no,omitempty"`
	// 支付宝id	用于输入用户支付宝的 2088 账号
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty"`
	// 电话号码
	MobileNo *string `json:"mobile_no,omitempty" xml:"mobile_no,omitempty"`
	// 证件号码
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty"`
	// 用于输入用户产生交易时的地理位置信息
	Lbs *string `json:"lbs,omitempty" xml:"lbs,omitempty"`
	// 用户购买或使用服务时产生的具体金额
	SalesAmount *string `json:"sales_amount,omitempty" xml:"sales_amount,omitempty"`
	// 证件类型
	CertType *string `json:"cert_type,omitempty" xml:"cert_type,omitempty"`
	// 企业工商注册ID
	Guid *string `json:"guid,omitempty" xml:"guid,omitempty"`
	// 统一信用代码
	BizLicenseNo *string `json:"biz_license_no,omitempty" xml:"biz_license_no,omitempty"`
	// 压测标
	SecLoadTest *string `json:"sec_load_test,omitempty" xml:"sec_load_test,omitempty"`
	// 场景ID
	SceneId *string `json:"scene_id,omitempty" xml:"scene_id,omitempty"`
}

func (s QueryGeneralRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryGeneralRequest) GoString() string {
	return s.String()
}

func (s *QueryGeneralRequest) SetAuthToken(v string) *QueryGeneralRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryGeneralRequest) SetProductInstanceId(v string) *QueryGeneralRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryGeneralRequest) SetService(v string) *QueryGeneralRequest {
	s.Service = &v
	return s
}

func (s *QueryGeneralRequest) SetServiceMode(v string) *QueryGeneralRequest {
	s.ServiceMode = &v
	return s
}

func (s *QueryGeneralRequest) SetUserAuthorization(v string) *QueryGeneralRequest {
	s.UserAuthorization = &v
	return s
}

func (s *QueryGeneralRequest) SetEncryptedRandomNo(v string) *QueryGeneralRequest {
	s.EncryptedRandomNo = &v
	return s
}

func (s *QueryGeneralRequest) SetExternalId(v string) *QueryGeneralRequest {
	s.ExternalId = &v
	return s
}

func (s *QueryGeneralRequest) SetBankCardNo(v string) *QueryGeneralRequest {
	s.BankCardNo = &v
	return s
}

func (s *QueryGeneralRequest) SetUserId(v string) *QueryGeneralRequest {
	s.UserId = &v
	return s
}

func (s *QueryGeneralRequest) SetMobileNo(v string) *QueryGeneralRequest {
	s.MobileNo = &v
	return s
}

func (s *QueryGeneralRequest) SetCertNo(v string) *QueryGeneralRequest {
	s.CertNo = &v
	return s
}

func (s *QueryGeneralRequest) SetLbs(v string) *QueryGeneralRequest {
	s.Lbs = &v
	return s
}

func (s *QueryGeneralRequest) SetSalesAmount(v string) *QueryGeneralRequest {
	s.SalesAmount = &v
	return s
}

func (s *QueryGeneralRequest) SetCertType(v string) *QueryGeneralRequest {
	s.CertType = &v
	return s
}

func (s *QueryGeneralRequest) SetGuid(v string) *QueryGeneralRequest {
	s.Guid = &v
	return s
}

func (s *QueryGeneralRequest) SetBizLicenseNo(v string) *QueryGeneralRequest {
	s.BizLicenseNo = &v
	return s
}

func (s *QueryGeneralRequest) SetSecLoadTest(v string) *QueryGeneralRequest {
	s.SecLoadTest = &v
	return s
}

func (s *QueryGeneralRequest) SetSceneId(v string) *QueryGeneralRequest {
	s.SceneId = &v
	return s
}

type QueryGeneralResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 风险咨询是否查得
	Found *string `json:"found,omitempty" xml:"found,omitempty"`
	// 风险咨询结果
	RiskResult *string `json:"risk_result,omitempty" xml:"risk_result,omitempty"`
	// 风险咨询结果补充讯息
	RiskResultExt *string `json:"risk_result_ext,omitempty" xml:"risk_result_ext,omitempty"`
}

func (s QueryGeneralResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryGeneralResponse) GoString() string {
	return s.String()
}

func (s *QueryGeneralResponse) SetReqMsgId(v string) *QueryGeneralResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryGeneralResponse) SetResultCode(v string) *QueryGeneralResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryGeneralResponse) SetResultMsg(v string) *QueryGeneralResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryGeneralResponse) SetFound(v string) *QueryGeneralResponse {
	s.Found = &v
	return s
}

func (s *QueryGeneralResponse) SetRiskResult(v string) *QueryGeneralResponse {
	s.RiskResult = &v
	return s
}

func (s *QueryGeneralResponse) SetRiskResultExt(v string) *QueryGeneralResponse {
	s.RiskResultExt = &v
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
		"timeouted":               "retry",
		"readTimeout":             tea.IntValue(util.DefaultNumber(runtime.ReadTimeout, client.ReadTimeout)),
		"connectTimeout":          tea.IntValue(util.DefaultNumber(runtime.ConnectTimeout, client.ConnectTimeout)),
		"httpProxy":               tea.StringValue(util.DefaultString(runtime.HttpProxy, client.HttpProxy)),
		"httpsProxy":              tea.StringValue(util.DefaultString(runtime.HttpsProxy, client.HttpsProxy)),
		"noProxy":                 tea.StringValue(util.DefaultString(runtime.NoProxy, client.NoProxy)),
		"maxIdleConns":            tea.IntValue(util.DefaultNumber(runtime.MaxIdleConns, client.MaxIdleConns)),
		"maxIdleTimeMillis":       tea.IntValue(client.MaxIdleTimeMillis),
		"keepAliveDurationMillis": tea.IntValue(client.KeepAliveDurationMillis),
		"maxRequests":             tea.IntValue(client.MaxRequests),
		"maxRequestsPerHost":      tea.IntValue(client.MaxRequestsPerHost),
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
			res := util.AssertAsMap(obj)
			resp := util.AssertAsMap(res["response"])
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
 * Description: 安全科技商业化RISKNET通用接口
 * Summary: 安全科技商业化RISKNET通用接口
 */
func (client *Client) QueryGeneral(request *QueryGeneralRequest) (_result *QueryGeneralResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryGeneralResponse{}
	_body, _err := client.QueryGeneralEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 安全科技商业化RISKNET通用接口
 * Summary: 安全科技商业化RISKNET通用接口
 */
func (client *Client) QueryGeneralEx(request *QueryGeneralRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryGeneralResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryGeneralResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antsecuritytech.risknet.general.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
