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

// 授权列表键值对
type AuthorizeRecordsPairs struct {
	// 授权业务
	AuthBusinessCode *string `json:"auth_business_code,omitempty" xml:"auth_business_code,omitempty" require:"true"`
	// 授权密钥
	AuthBusinessSecret *string `json:"auth_business_secret,omitempty" xml:"auth_business_secret,omitempty" require:"true"`
}

func (s AuthorizeRecordsPairs) String() string {
	return tea.Prettify(s)
}

func (s AuthorizeRecordsPairs) GoString() string {
	return s.String()
}

func (s *AuthorizeRecordsPairs) SetAuthBusinessCode(v string) *AuthorizeRecordsPairs {
	s.AuthBusinessCode = &v
	return s
}

func (s *AuthorizeRecordsPairs) SetAuthBusinessSecret(v string) *AuthorizeRecordsPairs {
	s.AuthBusinessSecret = &v
	return s
}

type OperateAntchainBbpInsuranceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 保司编码
	MechanismCode *string `json:"mechanism_code,omitempty" xml:"mechanism_code,omitempty" require:"true"`
	// 保单加密信息
	PolicyEncryptionContext *string `json:"policy_encryption_context,omitempty" xml:"policy_encryption_context,omitempty" require:"true"`
	// 保单号
	PolicyNo *string `json:"policy_no,omitempty" xml:"policy_no,omitempty" require:"true"`
	// 保险产品SKU
	ThirdpartSku *string `json:"thirdpart_sku,omitempty" xml:"thirdpart_sku,omitempty" require:"true"`
	// 保险公司名称
	MechanismName *string `json:"mechanism_name,omitempty" xml:"mechanism_name,omitempty"`
	// 保单种类，险种
	InsuranceType *string `json:"insurance_type,omitempty" xml:"insurance_type,omitempty"`
	// 来源uid，此处指天猫id
	SourceUid *string `json:"source_uid,omitempty" xml:"source_uid,omitempty"`
	// 订单来源
	Source *string `json:"source,omitempty" xml:"source,omitempty"`
	// 投保人
	UserName *string `json:"user_name,omitempty" xml:"user_name,omitempty"`
	// 投保人类型  自然人/公司
	UserType *string `json:"user_type,omitempty" xml:"user_type,omitempty" require:"true"`
	// 投保人电话号码
	UserPhonenumber *string `json:"user_phonenumber,omitempty" xml:"user_phonenumber,omitempty"`
	// 投保人证件号
	UserCertNo *string `json:"user_cert_no,omitempty" xml:"user_cert_no,omitempty"`
	// 拓展信息
	Extend *string `json:"extend,omitempty" xml:"extend,omitempty"`
	// 保单生效时间（毫秒值）
	PolicyEffectTime *int64 `json:"policy_effect_time,omitempty" xml:"policy_effect_time,omitempty" require:"true"`
	// 保单失效时间（毫秒值）
	PolicyInvalidTime *int64 `json:"policy_invalid_time,omitempty" xml:"policy_invalid_time,omitempty" require:"true"`
	// 订单总金额 BigDecimal
	PolicyTotalAmount *int64 `json:"policy_total_amount,omitempty" xml:"policy_total_amount,omitempty" require:"true"`
	// 订单总期数（一次性付款用1）
	PolicyTotalStage *int64 `json:"policy_total_stage,omitempty" xml:"policy_total_stage,omitempty" require:"true"`
	// 保费支付日期（毫秒值）
	PolicyPayDate *int64 `json:"policy_pay_date,omitempty" xml:"policy_pay_date,omitempty" require:"true"`
	// 已支付保费期数（1代表1期）
	PolicyPaidStage *int64 `json:"policy_paid_stage,omitempty" xml:"policy_paid_stage,omitempty"`
	// 每一期保费金额BigDecimal
	PolicyStageAverAmount *int64 `json:"policy_stage_aver_amount,omitempty" xml:"policy_stage_aver_amount,omitempty"`
	// 订单时间（毫秒值）
	OrderTime *int64 `json:"order_time,omitempty" xml:"order_time,omitempty"`
	// 操作类型
	// 下单 支付 理赔 退单
	Operation *string `json:"operation,omitempty" xml:"operation,omitempty"`
	// 赔付单号(对于赔付操作来说是必填项)
	ClaimOrderNo *string `json:"claim_order_no,omitempty" xml:"claim_order_no,omitempty"`
	// 理赔申请时间 理赔操作必填
	ClaimApplyTime *int64 `json:"claim_apply_time,omitempty" xml:"claim_apply_time,omitempty"`
	// 理赔赔付时间 理赔操作必填
	ClaimPayTime *int64 `json:"claim_pay_time,omitempty" xml:"claim_pay_time,omitempty"`
	// 理赔申请金额BigDecimal，单位元，保留小数点两位  理赔操作必填
	ClaimApplyAmount *int64 `json:"claim_apply_amount,omitempty" xml:"claim_apply_amount,omitempty"`
	// 理赔金额BigDecimal，理赔操作必填
	ClaimAmount *int64 `json:"claim_amount,omitempty" xml:"claim_amount,omitempty"`
	// 授权列表
	AuthorizeRecords []*AuthorizeRecordsPairs `json:"authorize_records,omitempty" xml:"authorize_records,omitempty" type:"Repeated"`
}

func (s OperateAntchainBbpInsuranceRequest) String() string {
	return tea.Prettify(s)
}

func (s OperateAntchainBbpInsuranceRequest) GoString() string {
	return s.String()
}

func (s *OperateAntchainBbpInsuranceRequest) SetAuthToken(v string) *OperateAntchainBbpInsuranceRequest {
	s.AuthToken = &v
	return s
}

func (s *OperateAntchainBbpInsuranceRequest) SetProductInstanceId(v string) *OperateAntchainBbpInsuranceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *OperateAntchainBbpInsuranceRequest) SetMechanismCode(v string) *OperateAntchainBbpInsuranceRequest {
	s.MechanismCode = &v
	return s
}

func (s *OperateAntchainBbpInsuranceRequest) SetPolicyEncryptionContext(v string) *OperateAntchainBbpInsuranceRequest {
	s.PolicyEncryptionContext = &v
	return s
}

func (s *OperateAntchainBbpInsuranceRequest) SetPolicyNo(v string) *OperateAntchainBbpInsuranceRequest {
	s.PolicyNo = &v
	return s
}

func (s *OperateAntchainBbpInsuranceRequest) SetThirdpartSku(v string) *OperateAntchainBbpInsuranceRequest {
	s.ThirdpartSku = &v
	return s
}

func (s *OperateAntchainBbpInsuranceRequest) SetMechanismName(v string) *OperateAntchainBbpInsuranceRequest {
	s.MechanismName = &v
	return s
}

func (s *OperateAntchainBbpInsuranceRequest) SetInsuranceType(v string) *OperateAntchainBbpInsuranceRequest {
	s.InsuranceType = &v
	return s
}

func (s *OperateAntchainBbpInsuranceRequest) SetSourceUid(v string) *OperateAntchainBbpInsuranceRequest {
	s.SourceUid = &v
	return s
}

func (s *OperateAntchainBbpInsuranceRequest) SetSource(v string) *OperateAntchainBbpInsuranceRequest {
	s.Source = &v
	return s
}

func (s *OperateAntchainBbpInsuranceRequest) SetUserName(v string) *OperateAntchainBbpInsuranceRequest {
	s.UserName = &v
	return s
}

func (s *OperateAntchainBbpInsuranceRequest) SetUserType(v string) *OperateAntchainBbpInsuranceRequest {
	s.UserType = &v
	return s
}

func (s *OperateAntchainBbpInsuranceRequest) SetUserPhonenumber(v string) *OperateAntchainBbpInsuranceRequest {
	s.UserPhonenumber = &v
	return s
}

func (s *OperateAntchainBbpInsuranceRequest) SetUserCertNo(v string) *OperateAntchainBbpInsuranceRequest {
	s.UserCertNo = &v
	return s
}

func (s *OperateAntchainBbpInsuranceRequest) SetExtend(v string) *OperateAntchainBbpInsuranceRequest {
	s.Extend = &v
	return s
}

func (s *OperateAntchainBbpInsuranceRequest) SetPolicyEffectTime(v int64) *OperateAntchainBbpInsuranceRequest {
	s.PolicyEffectTime = &v
	return s
}

func (s *OperateAntchainBbpInsuranceRequest) SetPolicyInvalidTime(v int64) *OperateAntchainBbpInsuranceRequest {
	s.PolicyInvalidTime = &v
	return s
}

func (s *OperateAntchainBbpInsuranceRequest) SetPolicyTotalAmount(v int64) *OperateAntchainBbpInsuranceRequest {
	s.PolicyTotalAmount = &v
	return s
}

func (s *OperateAntchainBbpInsuranceRequest) SetPolicyTotalStage(v int64) *OperateAntchainBbpInsuranceRequest {
	s.PolicyTotalStage = &v
	return s
}

func (s *OperateAntchainBbpInsuranceRequest) SetPolicyPayDate(v int64) *OperateAntchainBbpInsuranceRequest {
	s.PolicyPayDate = &v
	return s
}

func (s *OperateAntchainBbpInsuranceRequest) SetPolicyPaidStage(v int64) *OperateAntchainBbpInsuranceRequest {
	s.PolicyPaidStage = &v
	return s
}

func (s *OperateAntchainBbpInsuranceRequest) SetPolicyStageAverAmount(v int64) *OperateAntchainBbpInsuranceRequest {
	s.PolicyStageAverAmount = &v
	return s
}

func (s *OperateAntchainBbpInsuranceRequest) SetOrderTime(v int64) *OperateAntchainBbpInsuranceRequest {
	s.OrderTime = &v
	return s
}

func (s *OperateAntchainBbpInsuranceRequest) SetOperation(v string) *OperateAntchainBbpInsuranceRequest {
	s.Operation = &v
	return s
}

func (s *OperateAntchainBbpInsuranceRequest) SetClaimOrderNo(v string) *OperateAntchainBbpInsuranceRequest {
	s.ClaimOrderNo = &v
	return s
}

func (s *OperateAntchainBbpInsuranceRequest) SetClaimApplyTime(v int64) *OperateAntchainBbpInsuranceRequest {
	s.ClaimApplyTime = &v
	return s
}

func (s *OperateAntchainBbpInsuranceRequest) SetClaimPayTime(v int64) *OperateAntchainBbpInsuranceRequest {
	s.ClaimPayTime = &v
	return s
}

func (s *OperateAntchainBbpInsuranceRequest) SetClaimApplyAmount(v int64) *OperateAntchainBbpInsuranceRequest {
	s.ClaimApplyAmount = &v
	return s
}

func (s *OperateAntchainBbpInsuranceRequest) SetClaimAmount(v int64) *OperateAntchainBbpInsuranceRequest {
	s.ClaimAmount = &v
	return s
}

func (s *OperateAntchainBbpInsuranceRequest) SetAuthorizeRecords(v []*AuthorizeRecordsPairs) *OperateAntchainBbpInsuranceRequest {
	s.AuthorizeRecords = v
	return s
}

type OperateAntchainBbpInsuranceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s OperateAntchainBbpInsuranceResponse) String() string {
	return tea.Prettify(s)
}

func (s OperateAntchainBbpInsuranceResponse) GoString() string {
	return s.String()
}

func (s *OperateAntchainBbpInsuranceResponse) SetReqMsgId(v string) *OperateAntchainBbpInsuranceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *OperateAntchainBbpInsuranceResponse) SetResultCode(v string) *OperateAntchainBbpInsuranceResponse {
	s.ResultCode = &v
	return s
}

func (s *OperateAntchainBbpInsuranceResponse) SetResultMsg(v string) *OperateAntchainBbpInsuranceResponse {
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
				"sdk_version":      tea.String("1.0.1"),
				"_prod_code":       tea.String("ak_7257696016e54ac8a1e0ed2d532c3c09"),
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
 * Description: 保单信息上链，保单信息同步
 * Summary: 保单信息上链
 */
func (client *Client) OperateAntchainBbpInsurance(request *OperateAntchainBbpInsuranceRequest) (_result *OperateAntchainBbpInsuranceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &OperateAntchainBbpInsuranceResponse{}
	_body, _err := client.OperateAntchainBbpInsuranceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 保单信息上链，保单信息同步
 * Summary: 保单信息上链
 */
func (client *Client) OperateAntchainBbpInsuranceEx(request *OperateAntchainBbpInsuranceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *OperateAntchainBbpInsuranceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &OperateAntchainBbpInsuranceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.bbp.insurance.operate"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
