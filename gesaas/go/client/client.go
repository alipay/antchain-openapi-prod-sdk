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

// 订单详情列表
type OrderDetail struct {
	// 凭证编号
	VoucherCode *string `json:"voucher_code,omitempty" xml:"voucher_code,omitempty" require:"true"`
}

func (s OrderDetail) String() string {
	return tea.Prettify(s)
}

func (s OrderDetail) GoString() string {
	return s.String()
}

func (s *OrderDetail) SetVoucherCode(v string) *OrderDetail {
	s.VoucherCode = &v
	return s
}

// 响应结果基类
type CommonResponse struct {
	// 结果码
	Code *string `json:"code,omitempty" xml:"code,omitempty" require:"true"`
	// 返回码描述
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty" require:"true"`
	// 业务处理结果码
	//
	SubCode *string `json:"sub_code,omitempty" xml:"sub_code,omitempty"`
	// 返回的提示信息
	SubMsg *string `json:"sub_msg,omitempty" xml:"sub_msg,omitempty"`
	// 可否重试
	Retry *bool `json:"retry,omitempty" xml:"retry,omitempty"`
}

func (s CommonResponse) String() string {
	return tea.Prettify(s)
}

func (s CommonResponse) GoString() string {
	return s.String()
}

func (s *CommonResponse) SetCode(v string) *CommonResponse {
	s.Code = &v
	return s
}

func (s *CommonResponse) SetMsg(v string) *CommonResponse {
	s.Msg = &v
	return s
}

func (s *CommonResponse) SetSubCode(v string) *CommonResponse {
	s.SubCode = &v
	return s
}

func (s *CommonResponse) SetSubMsg(v string) *CommonResponse {
	s.SubMsg = &v
	return s
}

func (s *CommonResponse) SetRetry(v bool) *CommonResponse {
	s.Retry = &v
	return s
}

// 权益发放结果
type RightsGrantResultVO struct {
	// 过期时间
	ExpireTime *string `json:"expire_time,omitempty" xml:"expire_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 生效时间
	EffectTime *string `json:"effect_time,omitempty" xml:"effect_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 发放状态：
	// GRANTING：发放处理中 GRANT_SUCCESS：发放成功 GRANT_FAIL：发放失败
	GrantStatus *string `json:"grant_status,omitempty" xml:"grant_status,omitempty" require:"true"`
	// 订单详情列表
	OrderDetails []*OrderDetail `json:"order_details,omitempty" xml:"order_details,omitempty" type:"Repeated"`
}

func (s RightsGrantResultVO) String() string {
	return tea.Prettify(s)
}

func (s RightsGrantResultVO) GoString() string {
	return s.String()
}

func (s *RightsGrantResultVO) SetExpireTime(v string) *RightsGrantResultVO {
	s.ExpireTime = &v
	return s
}

func (s *RightsGrantResultVO) SetEffectTime(v string) *RightsGrantResultVO {
	s.EffectTime = &v
	return s
}

func (s *RightsGrantResultVO) SetGrantStatus(v string) *RightsGrantResultVO {
	s.GrantStatus = &v
	return s
}

func (s *RightsGrantResultVO) SetOrderDetails(v []*OrderDetail) *RightsGrantResultVO {
	s.OrderDetails = v
	return s
}

type SubmitRightsprodGrantRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 2088xxxx123
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty"`
	// 用户手机号
	PhoneNumber *string `json:"phone_number,omitempty" xml:"phone_number,omitempty"`
	// 商户编号
	MerchantNo *string `json:"merchant_no,omitempty" xml:"merchant_no,omitempty"`
	// 权益编码
	RightsCode *string `json:"rights_code,omitempty" xml:"rights_code,omitempty" require:"true"`
	// 发放数量
	GrantNum *int64 `json:"grant_num,omitempty" xml:"grant_num,omitempty" require:"true"`
	// 面额，动态面额类型必传
	FaceValue *string `json:"face_value,omitempty" xml:"face_value,omitempty"`
	// 外部发放订单号
	OutGrantOrderNo *string `json:"out_grant_order_no,omitempty" xml:"out_grant_order_no,omitempty" require:"true"`
	// 扩展信息
	ExtInfo *string `json:"ext_info,omitempty" xml:"ext_info,omitempty"`
	// 发放信息,如活动ID等信息
	GrantInfo *string `json:"grant_info,omitempty" xml:"grant_info,omitempty"`
}

func (s SubmitRightsprodGrantRequest) String() string {
	return tea.Prettify(s)
}

func (s SubmitRightsprodGrantRequest) GoString() string {
	return s.String()
}

func (s *SubmitRightsprodGrantRequest) SetAuthToken(v string) *SubmitRightsprodGrantRequest {
	s.AuthToken = &v
	return s
}

func (s *SubmitRightsprodGrantRequest) SetProductInstanceId(v string) *SubmitRightsprodGrantRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SubmitRightsprodGrantRequest) SetUserId(v string) *SubmitRightsprodGrantRequest {
	s.UserId = &v
	return s
}

func (s *SubmitRightsprodGrantRequest) SetPhoneNumber(v string) *SubmitRightsprodGrantRequest {
	s.PhoneNumber = &v
	return s
}

func (s *SubmitRightsprodGrantRequest) SetMerchantNo(v string) *SubmitRightsprodGrantRequest {
	s.MerchantNo = &v
	return s
}

func (s *SubmitRightsprodGrantRequest) SetRightsCode(v string) *SubmitRightsprodGrantRequest {
	s.RightsCode = &v
	return s
}

func (s *SubmitRightsprodGrantRequest) SetGrantNum(v int64) *SubmitRightsprodGrantRequest {
	s.GrantNum = &v
	return s
}

func (s *SubmitRightsprodGrantRequest) SetFaceValue(v string) *SubmitRightsprodGrantRequest {
	s.FaceValue = &v
	return s
}

func (s *SubmitRightsprodGrantRequest) SetOutGrantOrderNo(v string) *SubmitRightsprodGrantRequest {
	s.OutGrantOrderNo = &v
	return s
}

func (s *SubmitRightsprodGrantRequest) SetExtInfo(v string) *SubmitRightsprodGrantRequest {
	s.ExtInfo = &v
	return s
}

func (s *SubmitRightsprodGrantRequest) SetGrantInfo(v string) *SubmitRightsprodGrantRequest {
	s.GrantInfo = &v
	return s
}

type SubmitRightsprodGrantResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 权益发放结果
	RightsGrantResult *RightsGrantResultVO `json:"rights_grant_result,omitempty" xml:"rights_grant_result,omitempty"`
}

func (s SubmitRightsprodGrantResponse) String() string {
	return tea.Prettify(s)
}

func (s SubmitRightsprodGrantResponse) GoString() string {
	return s.String()
}

func (s *SubmitRightsprodGrantResponse) SetReqMsgId(v string) *SubmitRightsprodGrantResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SubmitRightsprodGrantResponse) SetResultCode(v string) *SubmitRightsprodGrantResponse {
	s.ResultCode = &v
	return s
}

func (s *SubmitRightsprodGrantResponse) SetResultMsg(v string) *SubmitRightsprodGrantResponse {
	s.ResultMsg = &v
	return s
}

func (s *SubmitRightsprodGrantResponse) SetRightsGrantResult(v *RightsGrantResultVO) *SubmitRightsprodGrantResponse {
	s.RightsGrantResult = v
	return s
}

type QueryRightsprodGrantRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 外部发放订单号
	OutGrantOrderNo *string `json:"out_grant_order_no,omitempty" xml:"out_grant_order_no,omitempty" require:"true"`
}

func (s QueryRightsprodGrantRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryRightsprodGrantRequest) GoString() string {
	return s.String()
}

func (s *QueryRightsprodGrantRequest) SetAuthToken(v string) *QueryRightsprodGrantRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryRightsprodGrantRequest) SetProductInstanceId(v string) *QueryRightsprodGrantRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryRightsprodGrantRequest) SetOutGrantOrderNo(v string) *QueryRightsprodGrantRequest {
	s.OutGrantOrderNo = &v
	return s
}

type QueryRightsprodGrantResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 权益发放结果
	RightsGrantResult *RightsGrantResultVO `json:"rights_grant_result,omitempty" xml:"rights_grant_result,omitempty"`
}

func (s QueryRightsprodGrantResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryRightsprodGrantResponse) GoString() string {
	return s.String()
}

func (s *QueryRightsprodGrantResponse) SetReqMsgId(v string) *QueryRightsprodGrantResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryRightsprodGrantResponse) SetResultCode(v string) *QueryRightsprodGrantResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryRightsprodGrantResponse) SetResultMsg(v string) *QueryRightsprodGrantResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryRightsprodGrantResponse) SetRightsGrantResult(v *RightsGrantResultVO) *QueryRightsprodGrantResponse {
	s.RightsGrantResult = v
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
				"sdk_version":      tea.String("1.0.2"),
				"_prod_code":       tea.String("GESAAS"),
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
 * Description: 权益中心权益发放
 * Summary: 权益发放
 */
func (client *Client) SubmitRightsprodGrant(request *SubmitRightsprodGrantRequest) (_result *SubmitRightsprodGrantResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SubmitRightsprodGrantResponse{}
	_body, _err := client.SubmitRightsprodGrantEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 权益中心权益发放
 * Summary: 权益发放
 */
func (client *Client) SubmitRightsprodGrantEx(request *SubmitRightsprodGrantRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SubmitRightsprodGrantResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SubmitRightsprodGrantResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.gesaas.rightsprod.grant.submit"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 权益发放结果查询
 * Summary: 权益发放结果查询
 */
func (client *Client) QueryRightsprodGrant(request *QueryRightsprodGrantRequest) (_result *QueryRightsprodGrantResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryRightsprodGrantResponse{}
	_body, _err := client.QueryRightsprodGrantEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 权益发放结果查询
 * Summary: 权益发放结果查询
 */
func (client *Client) QueryRightsprodGrantEx(request *QueryRightsprodGrantRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryRightsprodGrantResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryRightsprodGrantResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.gesaas.rightsprod.grant.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
