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

// 狗
type Dog struct {
	// 名字
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true" maxLength:"32" minLength:"2"`
	// 年龄
	Age *int64 `json:"age,omitempty" xml:"age,omitempty" require:"true" maximum:"100" minimum:"0"`
	// 是否已领养
	IsAdopted *bool `json:"is_adopted,omitempty" xml:"is_adopted,omitempty" require:"true"`
	// 领养时间
	AdoptedDate *string `json:"adopted_date,omitempty" xml:"adopted_date,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 标记
	Marks []*string `json:"marks,omitempty" xml:"marks,omitempty" type:"Repeated"`
}

func (s Dog) String() string {
	return tea.Prettify(s)
}

func (s Dog) GoString() string {
	return s.String()
}

func (s *Dog) SetName(v string) *Dog {
	s.Name = &v
	return s
}

func (s *Dog) SetAge(v int64) *Dog {
	s.Age = &v
	return s
}

func (s *Dog) SetIsAdopted(v bool) *Dog {
	s.IsAdopted = &v
	return s
}

func (s *Dog) SetAdoptedDate(v string) *Dog {
	s.AdoptedDate = &v
	return s
}

func (s *Dog) SetMarks(v []*string) *Dog {
	s.Marks = v
	return s
}

// 狗狗之家
type DogHome struct {
	// 狗狗成员
	DogMembers []*Dog `json:"dog_members,omitempty" xml:"dog_members,omitempty" require:"true" type:"Repeated"`
	// 狗狗头目
	Leader *Dog `json:"leader,omitempty" xml:"leader,omitempty" require:"true"`
}

func (s DogHome) String() string {
	return tea.Prettify(s)
}

func (s DogHome) GoString() string {
	return s.String()
}

func (s *DogHome) SetDogMembers(v []*Dog) *DogHome {
	s.DogMembers = v
	return s
}

func (s *DogHome) SetLeader(v *Dog) *DogHome {
	s.Leader = v
	return s
}

type GetDemoDogAgeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 数组结构体
	Dog []*Dog `json:"dog,omitempty" xml:"dog,omitempty" type:"Repeated"`
	// 狗狗的id
	Id *int64 `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 结构体
	Home *DogHome `json:"home,omitempty" xml:"home,omitempty" require:"true"`
	// alipay
	FileId *string `json:"file_id,omitempty" xml:"file_id,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// test
	Test *string `json:"test,omitempty" xml:"test,omitempty" require:"true"`
}

func (s GetDemoDogAgeRequest) String() string {
	return tea.Prettify(s)
}

func (s GetDemoDogAgeRequest) GoString() string {
	return s.String()
}

func (s *GetDemoDogAgeRequest) SetAuthToken(v string) *GetDemoDogAgeRequest {
	s.AuthToken = &v
	return s
}

func (s *GetDemoDogAgeRequest) SetProductInstanceId(v string) *GetDemoDogAgeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetDemoDogAgeRequest) SetDog(v []*Dog) *GetDemoDogAgeRequest {
	s.Dog = v
	return s
}

func (s *GetDemoDogAgeRequest) SetId(v int64) *GetDemoDogAgeRequest {
	s.Id = &v
	return s
}

func (s *GetDemoDogAgeRequest) SetHome(v *DogHome) *GetDemoDogAgeRequest {
	s.Home = v
	return s
}

func (s *GetDemoDogAgeRequest) SetFileId(v string) *GetDemoDogAgeRequest {
	s.FileId = &v
	return s
}

func (s *GetDemoDogAgeRequest) SetTest(v string) *GetDemoDogAgeRequest {
	s.Test = &v
	return s
}

type GetDemoDogAgeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 年龄
	Age *int64 `json:"age,omitempty" xml:"age,omitempty"`
}

func (s GetDemoDogAgeResponse) String() string {
	return tea.Prettify(s)
}

func (s GetDemoDogAgeResponse) GoString() string {
	return s.String()
}

func (s *GetDemoDogAgeResponse) SetReqMsgId(v string) *GetDemoDogAgeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetDemoDogAgeResponse) SetResultCode(v string) *GetDemoDogAgeResponse {
	s.ResultCode = &v
	return s
}

func (s *GetDemoDogAgeResponse) SetResultMsg(v string) *GetDemoDogAgeResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetDemoDogAgeResponse) SetAge(v int64) *GetDemoDogAgeResponse {
	s.Age = &v
	return s
}

type GetAntcloudCatAgeRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 猫猫的id
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// a a a
	Time *string `json:"time,omitempty" xml:"time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
}

func (s GetAntcloudCatAgeRequest) String() string {
	return tea.Prettify(s)
}

func (s GetAntcloudCatAgeRequest) GoString() string {
	return s.String()
}

func (s *GetAntcloudCatAgeRequest) SetAuthToken(v string) *GetAntcloudCatAgeRequest {
	s.AuthToken = &v
	return s
}

func (s *GetAntcloudCatAgeRequest) SetId(v string) *GetAntcloudCatAgeRequest {
	s.Id = &v
	return s
}

func (s *GetAntcloudCatAgeRequest) SetTime(v string) *GetAntcloudCatAgeRequest {
	s.Time = &v
	return s
}

type GetAntcloudCatAgeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 猫的年龄
	Age *string `json:"age,omitempty" xml:"age,omitempty"`
}

func (s GetAntcloudCatAgeResponse) String() string {
	return tea.Prettify(s)
}

func (s GetAntcloudCatAgeResponse) GoString() string {
	return s.String()
}

func (s *GetAntcloudCatAgeResponse) SetReqMsgId(v string) *GetAntcloudCatAgeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetAntcloudCatAgeResponse) SetResultCode(v string) *GetAntcloudCatAgeResponse {
	s.ResultCode = &v
	return s
}

func (s *GetAntcloudCatAgeResponse) SetResultMsg(v string) *GetAntcloudCatAgeResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetAntcloudCatAgeResponse) SetAge(v string) *GetAntcloudCatAgeResponse {
	s.Age = &v
	return s
}

type QueryAntchainAbcGatewayRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s QueryAntchainAbcGatewayRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAntchainAbcGatewayRequest) GoString() string {
	return s.String()
}

func (s *QueryAntchainAbcGatewayRequest) SetAuthToken(v string) *QueryAntchainAbcGatewayRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAntchainAbcGatewayRequest) SetProductInstanceId(v string) *QueryAntchainAbcGatewayRequest {
	s.ProductInstanceId = &v
	return s
}

type QueryAntchainAbcGatewayResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s QueryAntchainAbcGatewayResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAntchainAbcGatewayResponse) GoString() string {
	return s.String()
}

func (s *QueryAntchainAbcGatewayResponse) SetReqMsgId(v string) *QueryAntchainAbcGatewayResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAntchainAbcGatewayResponse) SetResultCode(v string) *QueryAntchainAbcGatewayResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAntchainAbcGatewayResponse) SetResultMsg(v string) *QueryAntchainAbcGatewayResponse {
	s.ResultMsg = &v
	return s
}

type BindDemoAaaBbbCccRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 123
	Data *string `json:"data,omitempty" xml:"data,omitempty" require:"true"`
}

func (s BindDemoAaaBbbCccRequest) String() string {
	return tea.Prettify(s)
}

func (s BindDemoAaaBbbCccRequest) GoString() string {
	return s.String()
}

func (s *BindDemoAaaBbbCccRequest) SetAuthToken(v string) *BindDemoAaaBbbCccRequest {
	s.AuthToken = &v
	return s
}

func (s *BindDemoAaaBbbCccRequest) SetProductInstanceId(v string) *BindDemoAaaBbbCccRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *BindDemoAaaBbbCccRequest) SetData(v string) *BindDemoAaaBbbCccRequest {
	s.Data = &v
	return s
}

type BindDemoAaaBbbCccResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s BindDemoAaaBbbCccResponse) String() string {
	return tea.Prettify(s)
}

func (s BindDemoAaaBbbCccResponse) GoString() string {
	return s.String()
}

func (s *BindDemoAaaBbbCccResponse) SetReqMsgId(v string) *BindDemoAaaBbbCccResponse {
	s.ReqMsgId = &v
	return s
}

func (s *BindDemoAaaBbbCccResponse) SetResultCode(v string) *BindDemoAaaBbbCccResponse {
	s.ResultCode = &v
	return s
}

func (s *BindDemoAaaBbbCccResponse) SetResultMsg(v string) *BindDemoAaaBbbCccResponse {
	s.ResultMsg = &v
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
				"sdk_version":      tea.String("1.0.0"),
				"_prod_code":       tea.String("ak_a94beb8f31eb4f8ea9ec901ac99a1aca"),
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
 * Description: 该接口用于获取狗狗的年龄
 * Summary: 获取狗狗的年龄
 */
func (client *Client) GetDemoDogAge(request *GetDemoDogAgeRequest) (_result *GetDemoDogAgeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetDemoDogAgeResponse{}
	_body, _err := client.GetDemoDogAgeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 该接口用于获取狗狗的年龄
 * Summary: 获取狗狗的年龄
 */
func (client *Client) GetDemoDogAgeEx(request *GetDemoDogAgeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetDemoDogAgeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetDemoDogAgeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.dog.age.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 这接口用于获取猫猫的年龄
 * Summary: 获取猫猫的年龄
 */
func (client *Client) GetAntcloudCatAge(request *GetAntcloudCatAgeRequest) (_result *GetAntcloudCatAgeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetAntcloudCatAgeResponse{}
	_body, _err := client.GetAntcloudCatAgeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 这接口用于获取猫猫的年龄
 * Summary: 获取猫猫的年龄
 */
func (client *Client) GetAntcloudCatAgeEx(request *GetAntcloudCatAgeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetAntcloudCatAgeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetAntcloudCatAgeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.cat.age.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 测试使用
 * Summary: 测试API工单审批
 */
func (client *Client) QueryAntchainAbcGateway(request *QueryAntchainAbcGatewayRequest) (_result *QueryAntchainAbcGatewayResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAntchainAbcGatewayResponse{}
	_body, _err := client.QueryAntchainAbcGatewayEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 测试使用
 * Summary: 测试API工单审批
 */
func (client *Client) QueryAntchainAbcGatewayEx(request *QueryAntchainAbcGatewayRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAntchainAbcGatewayResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAntchainAbcGatewayResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.abc.gateway.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 自动化测试创建，用于测试新建&修改功能
 * Summary: 自动化测试创建，用于测试新建&修改功能
 */
func (client *Client) BindDemoAaaBbbCcc(request *BindDemoAaaBbbCccRequest) (_result *BindDemoAaaBbbCccResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &BindDemoAaaBbbCccResponse{}
	_body, _err := client.BindDemoAaaBbbCccEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 自动化测试创建，用于测试新建&修改功能
 * Summary: 自动化测试创建，用于测试新建&修改功能
 */
func (client *Client) BindDemoAaaBbbCccEx(request *BindDemoAaaBbbCccRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *BindDemoAaaBbbCccResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &BindDemoAaaBbbCccResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.aaa.bbb.ccc.bind"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
