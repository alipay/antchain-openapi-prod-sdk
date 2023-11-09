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

type SubmitAntchainAtoFrontSignRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 商户的订单号
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"64" minLength:"4"`
	// CRED_PSN_CH_IDCARD： 大陆身份证
	// CRED_PSN_CH_TWCARD：台湾来往大陆通行证
	// CRED_PSN_CH_MACAO"：澳门来往大陆通行证
	// CRED_PSN_CH_HONGKONG：香港来往大陆通行证
	// CRED_PSN_PASSPORT：护照
	UserIdType *string `json:"user_id_type,omitempty" xml:"user_id_type,omitempty" require:"true" maxLength:"40" minLength:"4"`
	// 用户证件号，需要采用RSA加密传输
	UserIdNumber *string `json:"user_id_number,omitempty" xml:"user_id_number,omitempty" require:"true"`
	// 姓名，需要采用RSA加密传输
	//
	UserName *string `json:"user_name,omitempty" xml:"user_name,omitempty" require:"true"`
	// 用户手机号，可不传；传的话需要采用RSA加密传输
	//
	UserMobile *string `json:"user_mobile,omitempty" xml:"user_mobile,omitempty"`
	// 用户的电子邮箱，可不传；传的话需要采用RSA加密传输
	//
	UserEmail *string `json:"user_email,omitempty" xml:"user_email,omitempty"`
	// 签署有效期，时间戳，例如：new Date().getTime()
	SignValidity *string `json:"sign_validity,omitempty" xml:"sign_validity,omitempty"`
	// 1-短信；2-邮件
	FlowNotifyType *string `json:"flow_notify_type,omitempty" xml:"flow_notify_type,omitempty"`
	// 业务场景，电子合同签署协议的时候的标题
	//
	BusinessScene *string `json:"business_scene,omitempty" xml:"business_scene,omitempty" require:"true" maxLength:"200" minLength:"2"`
	// 签署完成跳转链接
	//
	SignedRedirectUrl *string `json:"signed_redirect_url,omitempty" xml:"signed_redirect_url,omitempty"`
	// 签署的电子合同模板信息，List<Object>的JSON格式，Object如下： { templateId:__, // String格式 templateArgs: { "模板参数key":"模板参数值", // 必须为String } }
	TemplateList *string `json:"template_list,omitempty" xml:"template_list,omitempty" require:"true"`
	// 用户的支付宝uid
	AlipayUserId *string `json:"alipay_user_id,omitempty" xml:"alipay_user_id,omitempty" require:"true" maxLength:"24" minLength:"4"`
	// 商户签署区域标识。对应在合同模板的机构签署区域中的tag值(如果合同模板的签署区域的tag值为空，则可以不传这个参数)。必须完全对应，否则在多方签署的情况下根据tag找到不到对应的签署机构，会出错。
	MerchantName *string `json:"merchant_name,omitempty" xml:"merchant_name,omitempty" require:"true"`
	// 商户签署区域标识。对应在合同模板的机构签署区域中的tag值(如果合同模板的签署区域的tag值为空，则可以不传这个参数)。必须完全对应，否则在多方签署的情况下根据tag找到不到对应的签署机构，会出错。
	MerchantTag *string `json:"merchant_tag,omitempty" xml:"merchant_tag,omitempty" maxLength:"32" minLength:"2"`
	// 电子合同签署顺序，如果只有1方企业签署，传入1即可。如果是多方，并且需要设置签署顺序，则需要将这个值以及thirdSigner中的signOrder做一个签署顺序。
	MerchantSignOrder *int64 `json:"merchant_sign_order,omitempty" xml:"merchant_sign_order,omitempty"`
	// CRED_ORG_USCC：统一社会信用代码，
	// CRED_ORG_REGCODE：工商注册号，
	// 只支持这两个值
	MerchantIdType *string `json:"merchant_id_type,omitempty" xml:"merchant_id_type,omitempty" require:"true" maxLength:"32" minLength:"4"`
	// 商户证件号，需要采用RSA加密传输
	MerchantIdNumber *string `json:"merchant_id_number,omitempty" xml:"merchant_id_number,omitempty" require:"true"`
	// 法人姓名，需要RSA加密传输
	//
	MerchantLegalName *string `json:"merchant_legal_name,omitempty" xml:"merchant_legal_name,omitempty"`
	// 法人证件号，需要采用RSA加密传输
	//
	MerchantLegalIdNumber *string `json:"merchant_legal_id_number,omitempty" xml:"merchant_legal_id_number,omitempty"`
	// 多方签署的其他参与方的签署信息，json的array格式，参考：[{"tag":"zf_a","orgName":"上海网络科技有限公司","orgIdType":"CRED_ORG_REGCODE","orgIdNumber":"12098760923","orgLegalName":"王大浪","orgLegalIdNumber":"107120196708289012"}]，其中：orgIdNumber、orgLegalName、orgLegalIdNumber需要加密传输。
	ThirdSigner *string `json:"third_signer,omitempty" xml:"third_signer,omitempty"`
}

func (s SubmitAntchainAtoFrontSignRequest) String() string {
	return tea.Prettify(s)
}

func (s SubmitAntchainAtoFrontSignRequest) GoString() string {
	return s.String()
}

func (s *SubmitAntchainAtoFrontSignRequest) SetAuthToken(v string) *SubmitAntchainAtoFrontSignRequest {
	s.AuthToken = &v
	return s
}

func (s *SubmitAntchainAtoFrontSignRequest) SetProductInstanceId(v string) *SubmitAntchainAtoFrontSignRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SubmitAntchainAtoFrontSignRequest) SetOrderId(v string) *SubmitAntchainAtoFrontSignRequest {
	s.OrderId = &v
	return s
}

func (s *SubmitAntchainAtoFrontSignRequest) SetUserIdType(v string) *SubmitAntchainAtoFrontSignRequest {
	s.UserIdType = &v
	return s
}

func (s *SubmitAntchainAtoFrontSignRequest) SetUserIdNumber(v string) *SubmitAntchainAtoFrontSignRequest {
	s.UserIdNumber = &v
	return s
}

func (s *SubmitAntchainAtoFrontSignRequest) SetUserName(v string) *SubmitAntchainAtoFrontSignRequest {
	s.UserName = &v
	return s
}

func (s *SubmitAntchainAtoFrontSignRequest) SetUserMobile(v string) *SubmitAntchainAtoFrontSignRequest {
	s.UserMobile = &v
	return s
}

func (s *SubmitAntchainAtoFrontSignRequest) SetUserEmail(v string) *SubmitAntchainAtoFrontSignRequest {
	s.UserEmail = &v
	return s
}

func (s *SubmitAntchainAtoFrontSignRequest) SetSignValidity(v string) *SubmitAntchainAtoFrontSignRequest {
	s.SignValidity = &v
	return s
}

func (s *SubmitAntchainAtoFrontSignRequest) SetFlowNotifyType(v string) *SubmitAntchainAtoFrontSignRequest {
	s.FlowNotifyType = &v
	return s
}

func (s *SubmitAntchainAtoFrontSignRequest) SetBusinessScene(v string) *SubmitAntchainAtoFrontSignRequest {
	s.BusinessScene = &v
	return s
}

func (s *SubmitAntchainAtoFrontSignRequest) SetSignedRedirectUrl(v string) *SubmitAntchainAtoFrontSignRequest {
	s.SignedRedirectUrl = &v
	return s
}

func (s *SubmitAntchainAtoFrontSignRequest) SetTemplateList(v string) *SubmitAntchainAtoFrontSignRequest {
	s.TemplateList = &v
	return s
}

func (s *SubmitAntchainAtoFrontSignRequest) SetAlipayUserId(v string) *SubmitAntchainAtoFrontSignRequest {
	s.AlipayUserId = &v
	return s
}

func (s *SubmitAntchainAtoFrontSignRequest) SetMerchantName(v string) *SubmitAntchainAtoFrontSignRequest {
	s.MerchantName = &v
	return s
}

func (s *SubmitAntchainAtoFrontSignRequest) SetMerchantTag(v string) *SubmitAntchainAtoFrontSignRequest {
	s.MerchantTag = &v
	return s
}

func (s *SubmitAntchainAtoFrontSignRequest) SetMerchantSignOrder(v int64) *SubmitAntchainAtoFrontSignRequest {
	s.MerchantSignOrder = &v
	return s
}

func (s *SubmitAntchainAtoFrontSignRequest) SetMerchantIdType(v string) *SubmitAntchainAtoFrontSignRequest {
	s.MerchantIdType = &v
	return s
}

func (s *SubmitAntchainAtoFrontSignRequest) SetMerchantIdNumber(v string) *SubmitAntchainAtoFrontSignRequest {
	s.MerchantIdNumber = &v
	return s
}

func (s *SubmitAntchainAtoFrontSignRequest) SetMerchantLegalName(v string) *SubmitAntchainAtoFrontSignRequest {
	s.MerchantLegalName = &v
	return s
}

func (s *SubmitAntchainAtoFrontSignRequest) SetMerchantLegalIdNumber(v string) *SubmitAntchainAtoFrontSignRequest {
	s.MerchantLegalIdNumber = &v
	return s
}

func (s *SubmitAntchainAtoFrontSignRequest) SetThirdSigner(v string) *SubmitAntchainAtoFrontSignRequest {
	s.ThirdSigner = &v
	return s
}

type SubmitAntchainAtoFrontSignResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 签署合同单号
	//
	SignNo *string `json:"sign_no,omitempty" xml:"sign_no,omitempty"`
	// 电子签署流程ID
	//
	FlowId *string `json:"flow_id,omitempty" xml:"flow_id,omitempty"`
	// 签署用户ID
	//
	AccountId *string `json:"account_id,omitempty" xml:"account_id,omitempty"`
}

func (s SubmitAntchainAtoFrontSignResponse) String() string {
	return tea.Prettify(s)
}

func (s SubmitAntchainAtoFrontSignResponse) GoString() string {
	return s.String()
}

func (s *SubmitAntchainAtoFrontSignResponse) SetReqMsgId(v string) *SubmitAntchainAtoFrontSignResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SubmitAntchainAtoFrontSignResponse) SetResultCode(v string) *SubmitAntchainAtoFrontSignResponse {
	s.ResultCode = &v
	return s
}

func (s *SubmitAntchainAtoFrontSignResponse) SetResultMsg(v string) *SubmitAntchainAtoFrontSignResponse {
	s.ResultMsg = &v
	return s
}

func (s *SubmitAntchainAtoFrontSignResponse) SetSignNo(v string) *SubmitAntchainAtoFrontSignResponse {
	s.SignNo = &v
	return s
}

func (s *SubmitAntchainAtoFrontSignResponse) SetFlowId(v string) *SubmitAntchainAtoFrontSignResponse {
	s.FlowId = &v
	return s
}

func (s *SubmitAntchainAtoFrontSignResponse) SetAccountId(v string) *SubmitAntchainAtoFrontSignResponse {
	s.AccountId = &v
	return s
}

type SyncAntchainAtoFrontTradeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 类型
	// 1. orderFullInfo ， 订单所有信息同步
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// json.toString
	BizContent *string `json:"biz_content,omitempty" xml:"biz_content,omitempty" require:"true"`
}

func (s SyncAntchainAtoFrontTradeRequest) String() string {
	return tea.Prettify(s)
}

func (s SyncAntchainAtoFrontTradeRequest) GoString() string {
	return s.String()
}

func (s *SyncAntchainAtoFrontTradeRequest) SetAuthToken(v string) *SyncAntchainAtoFrontTradeRequest {
	s.AuthToken = &v
	return s
}

func (s *SyncAntchainAtoFrontTradeRequest) SetProductInstanceId(v string) *SyncAntchainAtoFrontTradeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SyncAntchainAtoFrontTradeRequest) SetType(v string) *SyncAntchainAtoFrontTradeRequest {
	s.Type = &v
	return s
}

func (s *SyncAntchainAtoFrontTradeRequest) SetBizContent(v string) *SyncAntchainAtoFrontTradeRequest {
	s.BizContent = &v
	return s
}

type SyncAntchainAtoFrontTradeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回信息
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s SyncAntchainAtoFrontTradeResponse) String() string {
	return tea.Prettify(s)
}

func (s SyncAntchainAtoFrontTradeResponse) GoString() string {
	return s.String()
}

func (s *SyncAntchainAtoFrontTradeResponse) SetReqMsgId(v string) *SyncAntchainAtoFrontTradeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SyncAntchainAtoFrontTradeResponse) SetResultCode(v string) *SyncAntchainAtoFrontTradeResponse {
	s.ResultCode = &v
	return s
}

func (s *SyncAntchainAtoFrontTradeResponse) SetResultMsg(v string) *SyncAntchainAtoFrontTradeResponse {
	s.ResultMsg = &v
	return s
}

func (s *SyncAntchainAtoFrontTradeResponse) SetResponseData(v string) *SyncAntchainAtoFrontTradeResponse {
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
				"sdk_version":      tea.String("1.0.0"),
				"_prod_code":       tea.String("ak_195dff03d395462ea294bafdba69df3f"),
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
 * Description: 提交前置签署的电子合同签署流程
 * Summary: 提交前置签署的电子合同签署流程
 */
func (client *Client) SubmitAntchainAtoFrontSign(request *SubmitAntchainAtoFrontSignRequest) (_result *SubmitAntchainAtoFrontSignResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SubmitAntchainAtoFrontSignResponse{}
	_body, _err := client.SubmitAntchainAtoFrontSignEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 提交前置签署的电子合同签署流程
 * Summary: 提交前置签署的电子合同签署流程
 */
func (client *Client) SubmitAntchainAtoFrontSignEx(request *SubmitAntchainAtoFrontSignRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SubmitAntchainAtoFrontSignResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SubmitAntchainAtoFrontSignResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.front.sign.submit"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 订单创建，前置签署
 * Summary: 前置签署订单创建
 */
func (client *Client) SyncAntchainAtoFrontTrade(request *SyncAntchainAtoFrontTradeRequest) (_result *SyncAntchainAtoFrontTradeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SyncAntchainAtoFrontTradeResponse{}
	_body, _err := client.SyncAntchainAtoFrontTradeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 订单创建，前置签署
 * Summary: 前置签署订单创建
 */
func (client *Client) SyncAntchainAtoFrontTradeEx(request *SyncAntchainAtoFrontTradeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SyncAntchainAtoFrontTradeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SyncAntchainAtoFrontTradeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.front.trade.sync"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
