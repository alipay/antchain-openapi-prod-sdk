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

// 订单还款计划
type PromiseInfo struct {
}

func (s PromiseInfo) String() string {
	return tea.Prettify(s)
}

func (s PromiseInfo) GoString() string {
	return s.String()
}

// 同步订单中的下单人信息
type UserSyncInfo struct {
}

func (s UserSyncInfo) String() string {
	return tea.Prettify(s)
}

func (s UserSyncInfo) GoString() string {
	return s.String()
}

// 主订单信息
type OrderInfo struct {
}

func (s OrderInfo) String() string {
	return tea.Prettify(s)
}

func (s OrderInfo) GoString() string {
	return s.String()
}

// 订单商品信息
type GoodsInfo struct {
}

func (s GoodsInfo) String() string {
	return tea.Prettify(s)
}

func (s GoodsInfo) GoString() string {
	return s.String()
}

type SyncAntchainAtoFundOrderfinancialRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单号
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"50" minLength:"1"`
	// 商户在数科的租户ID
	MerchantTenantId *string `json:"merchant_tenant_id,omitempty" xml:"merchant_tenant_id,omitempty" require:"true" maxLength:"50" minLength:"1"`
	// 订单融资唯一标识
	ApplicationId *string `json:"application_id,omitempty" xml:"application_id,omitempty" require:"true" maxLength:"128" minLength:"1"`
	// 订单融资状态：1-成功；2-失败
	Status *int64 `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 融资结果描述，长度不超过64
	Reason *string `json:"reason,omitempty" xml:"reason,omitempty" maxLength:"64"`
	// 额外信息
	Extras *string `json:"extras,omitempty" xml:"extras,omitempty"`
}

func (s SyncAntchainAtoFundOrderfinancialRequest) String() string {
	return tea.Prettify(s)
}

func (s SyncAntchainAtoFundOrderfinancialRequest) GoString() string {
	return s.String()
}

func (s *SyncAntchainAtoFundOrderfinancialRequest) SetAuthToken(v string) *SyncAntchainAtoFundOrderfinancialRequest {
	s.AuthToken = &v
	return s
}

func (s *SyncAntchainAtoFundOrderfinancialRequest) SetProductInstanceId(v string) *SyncAntchainAtoFundOrderfinancialRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SyncAntchainAtoFundOrderfinancialRequest) SetOrderId(v string) *SyncAntchainAtoFundOrderfinancialRequest {
	s.OrderId = &v
	return s
}

func (s *SyncAntchainAtoFundOrderfinancialRequest) SetMerchantTenantId(v string) *SyncAntchainAtoFundOrderfinancialRequest {
	s.MerchantTenantId = &v
	return s
}

func (s *SyncAntchainAtoFundOrderfinancialRequest) SetApplicationId(v string) *SyncAntchainAtoFundOrderfinancialRequest {
	s.ApplicationId = &v
	return s
}

func (s *SyncAntchainAtoFundOrderfinancialRequest) SetStatus(v int64) *SyncAntchainAtoFundOrderfinancialRequest {
	s.Status = &v
	return s
}

func (s *SyncAntchainAtoFundOrderfinancialRequest) SetReason(v string) *SyncAntchainAtoFundOrderfinancialRequest {
	s.Reason = &v
	return s
}

func (s *SyncAntchainAtoFundOrderfinancialRequest) SetExtras(v string) *SyncAntchainAtoFundOrderfinancialRequest {
	s.Extras = &v
	return s
}

type SyncAntchainAtoFundOrderfinancialResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 结果描述信息
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s SyncAntchainAtoFundOrderfinancialResponse) String() string {
	return tea.Prettify(s)
}

func (s SyncAntchainAtoFundOrderfinancialResponse) GoString() string {
	return s.String()
}

func (s *SyncAntchainAtoFundOrderfinancialResponse) SetReqMsgId(v string) *SyncAntchainAtoFundOrderfinancialResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SyncAntchainAtoFundOrderfinancialResponse) SetResultCode(v string) *SyncAntchainAtoFundOrderfinancialResponse {
	s.ResultCode = &v
	return s
}

func (s *SyncAntchainAtoFundOrderfinancialResponse) SetResultMsg(v string) *SyncAntchainAtoFundOrderfinancialResponse {
	s.ResultMsg = &v
	return s
}

func (s *SyncAntchainAtoFundOrderfinancialResponse) SetResponseData(v string) *SyncAntchainAtoFundOrderfinancialResponse {
	s.ResponseData = &v
	return s
}

type GetAntchainAtoFundRepaymentplanRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单id，不可为空
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"50" minLength:"1"`
	// 商户在数科注册的tenantId，不可为空
	MerchantTenantId *string `json:"merchant_tenant_id,omitempty" xml:"merchant_tenant_id,omitempty" require:"true" maxLength:"50" minLength:"1"`
	// 用户的支付宝uid
	AlipayUid *string `json:"alipay_uid,omitempty" xml:"alipay_uid,omitempty" require:"true" maxLength:"50" minLength:"1"`
}

func (s GetAntchainAtoFundRepaymentplanRequest) String() string {
	return tea.Prettify(s)
}

func (s GetAntchainAtoFundRepaymentplanRequest) GoString() string {
	return s.String()
}

func (s *GetAntchainAtoFundRepaymentplanRequest) SetAuthToken(v string) *GetAntchainAtoFundRepaymentplanRequest {
	s.AuthToken = &v
	return s
}

func (s *GetAntchainAtoFundRepaymentplanRequest) SetProductInstanceId(v string) *GetAntchainAtoFundRepaymentplanRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetAntchainAtoFundRepaymentplanRequest) SetOrderId(v string) *GetAntchainAtoFundRepaymentplanRequest {
	s.OrderId = &v
	return s
}

func (s *GetAntchainAtoFundRepaymentplanRequest) SetMerchantTenantId(v string) *GetAntchainAtoFundRepaymentplanRequest {
	s.MerchantTenantId = &v
	return s
}

func (s *GetAntchainAtoFundRepaymentplanRequest) SetAlipayUid(v string) *GetAntchainAtoFundRepaymentplanRequest {
	s.AlipayUid = &v
	return s
}

type GetAntchainAtoFundRepaymentplanResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 订单id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty"`
	// 租赁公司支付宝UID
	LeaseAlipayUid *string `json:"lease_alipay_uid,omitempty" xml:"lease_alipay_uid,omitempty"`
	// 宽限期，天
	GracePeriodDays *int64 `json:"grace_period_days,omitempty" xml:"grace_period_days,omitempty"`
	// 还款策略列表
	RepayStrategyList *string `json:"repay_strategy_list,omitempty" xml:"repay_strategy_list,omitempty"`
	// 处罚策略
	//  NONE : 没有处罚
	//  PENALTY_FEE： 罚息
	PunishmentType *string `json:"punishment_type,omitempty" xml:"punishment_type,omitempty"`
	// 租期
	PayPeriod *int64 `json:"pay_period,omitempty" xml:"pay_period,omitempty"`
}

func (s GetAntchainAtoFundRepaymentplanResponse) String() string {
	return tea.Prettify(s)
}

func (s GetAntchainAtoFundRepaymentplanResponse) GoString() string {
	return s.String()
}

func (s *GetAntchainAtoFundRepaymentplanResponse) SetReqMsgId(v string) *GetAntchainAtoFundRepaymentplanResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetAntchainAtoFundRepaymentplanResponse) SetResultCode(v string) *GetAntchainAtoFundRepaymentplanResponse {
	s.ResultCode = &v
	return s
}

func (s *GetAntchainAtoFundRepaymentplanResponse) SetResultMsg(v string) *GetAntchainAtoFundRepaymentplanResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetAntchainAtoFundRepaymentplanResponse) SetOrderId(v string) *GetAntchainAtoFundRepaymentplanResponse {
	s.OrderId = &v
	return s
}

func (s *GetAntchainAtoFundRepaymentplanResponse) SetLeaseAlipayUid(v string) *GetAntchainAtoFundRepaymentplanResponse {
	s.LeaseAlipayUid = &v
	return s
}

func (s *GetAntchainAtoFundRepaymentplanResponse) SetGracePeriodDays(v int64) *GetAntchainAtoFundRepaymentplanResponse {
	s.GracePeriodDays = &v
	return s
}

func (s *GetAntchainAtoFundRepaymentplanResponse) SetRepayStrategyList(v string) *GetAntchainAtoFundRepaymentplanResponse {
	s.RepayStrategyList = &v
	return s
}

func (s *GetAntchainAtoFundRepaymentplanResponse) SetPunishmentType(v string) *GetAntchainAtoFundRepaymentplanResponse {
	s.PunishmentType = &v
	return s
}

func (s *GetAntchainAtoFundRepaymentplanResponse) SetPayPeriod(v int64) *GetAntchainAtoFundRepaymentplanResponse {
	s.PayPeriod = &v
	return s
}

type SyncAntchainAtoTradeFullRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 购买用户信息
	UserInfo *UserSyncInfo `json:"user_info,omitempty" xml:"user_info,omitempty" require:"true"`
	// 主订单信息
	OrderInfo *OrderInfo `json:"order_info,omitempty" xml:"order_info,omitempty" require:"true"`
	// 订单包含的商品信息列表
	GoodsInfo *GoodsInfo `json:"goods_info,omitempty" xml:"goods_info,omitempty" require:"true"`
	// 订单还款计划
	PromiseInfo *PromiseInfo `json:"promise_info,omitempty" xml:"promise_info,omitempty" require:"true"`
}

func (s SyncAntchainAtoTradeFullRequest) String() string {
	return tea.Prettify(s)
}

func (s SyncAntchainAtoTradeFullRequest) GoString() string {
	return s.String()
}

func (s *SyncAntchainAtoTradeFullRequest) SetAuthToken(v string) *SyncAntchainAtoTradeFullRequest {
	s.AuthToken = &v
	return s
}

func (s *SyncAntchainAtoTradeFullRequest) SetProductInstanceId(v string) *SyncAntchainAtoTradeFullRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SyncAntchainAtoTradeFullRequest) SetUserInfo(v *UserSyncInfo) *SyncAntchainAtoTradeFullRequest {
	s.UserInfo = v
	return s
}

func (s *SyncAntchainAtoTradeFullRequest) SetOrderInfo(v *OrderInfo) *SyncAntchainAtoTradeFullRequest {
	s.OrderInfo = v
	return s
}

func (s *SyncAntchainAtoTradeFullRequest) SetGoodsInfo(v *GoodsInfo) *SyncAntchainAtoTradeFullRequest {
	s.GoodsInfo = v
	return s
}

func (s *SyncAntchainAtoTradeFullRequest) SetPromiseInfo(v *PromiseInfo) *SyncAntchainAtoTradeFullRequest {
	s.PromiseInfo = v
	return s
}

type SyncAntchainAtoTradeFullResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 同步成功
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s SyncAntchainAtoTradeFullResponse) String() string {
	return tea.Prettify(s)
}

func (s SyncAntchainAtoTradeFullResponse) GoString() string {
	return s.String()
}

func (s *SyncAntchainAtoTradeFullResponse) SetReqMsgId(v string) *SyncAntchainAtoTradeFullResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SyncAntchainAtoTradeFullResponse) SetResultCode(v string) *SyncAntchainAtoTradeFullResponse {
	s.ResultCode = &v
	return s
}

func (s *SyncAntchainAtoTradeFullResponse) SetResultMsg(v string) *SyncAntchainAtoTradeFullResponse {
	s.ResultMsg = &v
	return s
}

func (s *SyncAntchainAtoTradeFullResponse) SetResponseData(v string) *SyncAntchainAtoTradeFullResponse {
	s.ResponseData = &v
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
				"sdk_version":      tea.String("1.1.0"),
				"_prod_code":       tea.String("ak_2abe765c32934341bd9bb6cc1c8ff589"),
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
 * Description: 提供给融资资金方，用以订单融资结果同步
 * Summary: 【废弃】订单融资结果同步
 */
func (client *Client) SyncAntchainAtoFundOrderfinancial(request *SyncAntchainAtoFundOrderfinancialRequest) (_result *SyncAntchainAtoFundOrderfinancialResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SyncAntchainAtoFundOrderfinancialResponse{}
	_body, _err := client.SyncAntchainAtoFundOrderfinancialEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 提供给融资资金方，用以订单融资结果同步
 * Summary: 【废弃】订单融资结果同步
 */
func (client *Client) SyncAntchainAtoFundOrderfinancialEx(request *SyncAntchainAtoFundOrderfinancialRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SyncAntchainAtoFundOrderfinancialResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SyncAntchainAtoFundOrderfinancialResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.fund.orderfinancial.sync"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 将返回订单实人认证通过后的、商家同步的还款计划
 * Summary: 【废弃】获取实人认证通过后用户承诺
 */
func (client *Client) GetAntchainAtoFundRepaymentplan(request *GetAntchainAtoFundRepaymentplanRequest) (_result *GetAntchainAtoFundRepaymentplanResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetAntchainAtoFundRepaymentplanResponse{}
	_body, _err := client.GetAntchainAtoFundRepaymentplanEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 将返回订单实人认证通过后的、商家同步的还款计划
 * Summary: 【废弃】获取实人认证通过后用户承诺
 */
func (client *Client) GetAntchainAtoFundRepaymentplanEx(request *GetAntchainAtoFundRepaymentplanRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetAntchainAtoFundRepaymentplanResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetAntchainAtoFundRepaymentplanResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.fund.repaymentplan.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 同步商家的订单信息，包含下单人信息、订单信息、订单关联的商品信息以及订单绑定的还款计划。
 * Summary: 【废弃】同步商家的订单信息
 */
func (client *Client) SyncAntchainAtoTradeFull(request *SyncAntchainAtoTradeFullRequest) (_result *SyncAntchainAtoTradeFullResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SyncAntchainAtoTradeFullResponse{}
	_body, _err := client.SyncAntchainAtoTradeFullEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 同步商家的订单信息，包含下单人信息、订单信息、订单关联的商品信息以及订单绑定的还款计划。
 * Summary: 【废弃】同步商家的订单信息
 */
func (client *Client) SyncAntchainAtoTradeFullEx(request *SyncAntchainAtoTradeFullRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SyncAntchainAtoTradeFullResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SyncAntchainAtoTradeFullResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.trade.full.sync"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
