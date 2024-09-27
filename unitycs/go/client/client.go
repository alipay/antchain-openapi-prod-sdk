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

// 元数据属性
type MetaDataAttr struct {
	// 元数据属性编码
	Code *string `json:"code,omitempty" xml:"code,omitempty" require:"true"`
	// 元数据属性值
	Value *string `json:"value,omitempty" xml:"value,omitempty" require:"true"`
}

func (s MetaDataAttr) String() string {
	return tea.Prettify(s)
}

func (s MetaDataAttr) GoString() string {
	return s.String()
}

func (s *MetaDataAttr) SetCode(v string) *MetaDataAttr {
	s.Code = &v
	return s
}

func (s *MetaDataAttr) SetValue(v string) *MetaDataAttr {
	s.Value = &v
	return s
}

type VerifyAuthorityRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 元数据编码
	MetadataCode *string `json:"metadata_code,omitempty" xml:"metadata_code,omitempty" require:"true"`
	// 用户id
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
	// 用户权限，默认值为USAGE_RIGHT
	Privilege *string `json:"privilege,omitempty" xml:"privilege,omitempty"`
}

func (s VerifyAuthorityRequest) String() string {
	return tea.Prettify(s)
}

func (s VerifyAuthorityRequest) GoString() string {
	return s.String()
}

func (s *VerifyAuthorityRequest) SetAuthToken(v string) *VerifyAuthorityRequest {
	s.AuthToken = &v
	return s
}

func (s *VerifyAuthorityRequest) SetProductInstanceId(v string) *VerifyAuthorityRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *VerifyAuthorityRequest) SetMetadataCode(v string) *VerifyAuthorityRequest {
	s.MetadataCode = &v
	return s
}

func (s *VerifyAuthorityRequest) SetUserId(v string) *VerifyAuthorityRequest {
	s.UserId = &v
	return s
}

func (s *VerifyAuthorityRequest) SetPrivilege(v string) *VerifyAuthorityRequest {
	s.Privilege = &v
	return s
}

type VerifyAuthorityResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 鉴权结果
	Result *bool `json:"result,omitempty" xml:"result,omitempty"`
}

func (s VerifyAuthorityResponse) String() string {
	return tea.Prettify(s)
}

func (s VerifyAuthorityResponse) GoString() string {
	return s.String()
}

func (s *VerifyAuthorityResponse) SetReqMsgId(v string) *VerifyAuthorityResponse {
	s.ReqMsgId = &v
	return s
}

func (s *VerifyAuthorityResponse) SetResultCode(v string) *VerifyAuthorityResponse {
	s.ResultCode = &v
	return s
}

func (s *VerifyAuthorityResponse) SetResultMsg(v string) *VerifyAuthorityResponse {
	s.ResultMsg = &v
	return s
}

func (s *VerifyAuthorityResponse) SetResult(v bool) *VerifyAuthorityResponse {
	s.Result = &v
	return s
}

type CreateDepositRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 元数据编码
	MetadataCode *string `json:"metadata_code,omitempty" xml:"metadata_code,omitempty" require:"true"`
	// 基础信息json
	BaseInfoJson *string `json:"base_info_json,omitempty" xml:"base_info_json,omitempty" require:"true"`
}

func (s CreateDepositRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateDepositRequest) GoString() string {
	return s.String()
}

func (s *CreateDepositRequest) SetAuthToken(v string) *CreateDepositRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateDepositRequest) SetProductInstanceId(v string) *CreateDepositRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateDepositRequest) SetMetadataCode(v string) *CreateDepositRequest {
	s.MetadataCode = &v
	return s
}

func (s *CreateDepositRequest) SetBaseInfoJson(v string) *CreateDepositRequest {
	s.BaseInfoJson = &v
	return s
}

type CreateDepositResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 上链结果
	Result *bool `json:"result,omitempty" xml:"result,omitempty"`
	// 交易hash
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty"`
	// 数据标识
	Identify *string `json:"identify,omitempty" xml:"identify,omitempty"`
}

func (s CreateDepositResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateDepositResponse) GoString() string {
	return s.String()
}

func (s *CreateDepositResponse) SetReqMsgId(v string) *CreateDepositResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateDepositResponse) SetResultCode(v string) *CreateDepositResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateDepositResponse) SetResultMsg(v string) *CreateDepositResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateDepositResponse) SetResult(v bool) *CreateDepositResponse {
	s.Result = &v
	return s
}

func (s *CreateDepositResponse) SetTxHash(v string) *CreateDepositResponse {
	s.TxHash = &v
	return s
}

func (s *CreateDepositResponse) SetIdentify(v string) *CreateDepositResponse {
	s.Identify = &v
	return s
}

type VerifyDataRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 元数据编码
	MetadataCode *string `json:"metadata_code,omitempty" xml:"metadata_code,omitempty" require:"true"`
	// 数据标识
	AttrIdentify *string `json:"attr_identify,omitempty" xml:"attr_identify,omitempty"`
	// 核验属性集合
	Attrs []*MetaDataAttr `json:"attrs,omitempty" xml:"attrs,omitempty" require:"true" type:"Repeated"`
}

func (s VerifyDataRequest) String() string {
	return tea.Prettify(s)
}

func (s VerifyDataRequest) GoString() string {
	return s.String()
}

func (s *VerifyDataRequest) SetAuthToken(v string) *VerifyDataRequest {
	s.AuthToken = &v
	return s
}

func (s *VerifyDataRequest) SetProductInstanceId(v string) *VerifyDataRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *VerifyDataRequest) SetMetadataCode(v string) *VerifyDataRequest {
	s.MetadataCode = &v
	return s
}

func (s *VerifyDataRequest) SetAttrIdentify(v string) *VerifyDataRequest {
	s.AttrIdentify = &v
	return s
}

func (s *VerifyDataRequest) SetAttrs(v []*MetaDataAttr) *VerifyDataRequest {
	s.Attrs = v
	return s
}

type VerifyDataResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 核验结果
	Result *bool `json:"result,omitempty" xml:"result,omitempty"`
	// 数据标识
	AttrIdentify *string `json:"attr_identify,omitempty" xml:"attr_identify,omitempty"`
	// 区块高度
	BlockCount *int64 `json:"block_count,omitempty" xml:"block_count,omitempty"`
	// 核验属性集合
	Attrs []*MetaDataAttr `json:"attrs,omitempty" xml:"attrs,omitempty" type:"Repeated"`
}

func (s VerifyDataResponse) String() string {
	return tea.Prettify(s)
}

func (s VerifyDataResponse) GoString() string {
	return s.String()
}

func (s *VerifyDataResponse) SetReqMsgId(v string) *VerifyDataResponse {
	s.ReqMsgId = &v
	return s
}

func (s *VerifyDataResponse) SetResultCode(v string) *VerifyDataResponse {
	s.ResultCode = &v
	return s
}

func (s *VerifyDataResponse) SetResultMsg(v string) *VerifyDataResponse {
	s.ResultMsg = &v
	return s
}

func (s *VerifyDataResponse) SetResult(v bool) *VerifyDataResponse {
	s.Result = &v
	return s
}

func (s *VerifyDataResponse) SetAttrIdentify(v string) *VerifyDataResponse {
	s.AttrIdentify = &v
	return s
}

func (s *VerifyDataResponse) SetBlockCount(v int64) *VerifyDataResponse {
	s.BlockCount = &v
	return s
}

func (s *VerifyDataResponse) SetAttrs(v []*MetaDataAttr) *VerifyDataResponse {
	s.Attrs = v
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
				"sdk_version":      tea.String("1.2.1"),
				"_prod_code":       tea.String("UNITYCS"),
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
 * Description: 鉴权
 * Summary: 鉴权
 */
func (client *Client) VerifyAuthority(request *VerifyAuthorityRequest) (_result *VerifyAuthorityResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &VerifyAuthorityResponse{}
	_body, _err := client.VerifyAuthorityEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 鉴权
 * Summary: 鉴权
 */
func (client *Client) VerifyAuthorityEx(request *VerifyAuthorityRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *VerifyAuthorityResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &VerifyAuthorityResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.unitycs.authority.verify"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 元数据接口上链
 * Summary: 元数据接口上链
 */
func (client *Client) CreateDeposit(request *CreateDepositRequest) (_result *CreateDepositResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateDepositResponse{}
	_body, _err := client.CreateDepositEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 元数据接口上链
 * Summary: 元数据接口上链
 */
func (client *Client) CreateDepositEx(request *CreateDepositRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateDepositResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateDepositResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.unitycs.deposit.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 数据验真
 * Summary: 数据验真
 */
func (client *Client) VerifyData(request *VerifyDataRequest) (_result *VerifyDataResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &VerifyDataResponse{}
	_body, _err := client.VerifyDataEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 数据验真
 * Summary: 数据验真
 */
func (client *Client) VerifyDataEx(request *VerifyDataRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *VerifyDataResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &VerifyDataResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.unitycs.data.verify"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
