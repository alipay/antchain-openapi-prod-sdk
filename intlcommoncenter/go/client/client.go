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

type ImportProductRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 商业化状态
	BusinessStatus *string `json:"business_status,omitempty" xml:"business_status,omitempty" require:"true"`
	// 是否已上架蚂蚁链官网
	ProductPutAntOfficial *string `json:"product_put_ant_official,omitempty" xml:"product_put_ant_official,omitempty" require:"true"`
	// 产品名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 橡实立项code
	XsCode *string `json:"xs_code,omitempty" xml:"xs_code,omitempty" require:"true"`
	// 上线时间
	StartTime *string `json:"start_time,omitempty" xml:"start_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 产品经理
	Pd *string `json:"pd,omitempty" xml:"pd,omitempty" require:"true"`
	// 产品经理负责人
	PdLeader *string `json:"pd_leader,omitempty" xml:"pd_leader,omitempty" require:"true"`
	// 产品研发负责人
	DevLeader *string `json:"dev_leader,omitempty" xml:"dev_leader,omitempty"`
	// 产品研发
	Dev *string `json:"dev,omitempty" xml:"dev,omitempty"`
	// 产品描述
	Description *string `json:"description,omitempty" xml:"description,omitempty" require:"true"`
	// 操作员
	Operator *string `json:"operator,omitempty" xml:"operator,omitempty" require:"true"`
	// 业务线id
	BusinessLine *string `json:"business_line,omitempty" xml:"business_line,omitempty" require:"true"`
	// 产品线id
	ProductLine *string `json:"product_line,omitempty" xml:"product_line,omitempty" require:"true"`
	// 产品code
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty"`
}

func (s ImportProductRequest) String() string {
	return tea.Prettify(s)
}

func (s ImportProductRequest) GoString() string {
	return s.String()
}

func (s *ImportProductRequest) SetAuthToken(v string) *ImportProductRequest {
	s.AuthToken = &v
	return s
}

func (s *ImportProductRequest) SetProductInstanceId(v string) *ImportProductRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ImportProductRequest) SetBusinessStatus(v string) *ImportProductRequest {
	s.BusinessStatus = &v
	return s
}

func (s *ImportProductRequest) SetProductPutAntOfficial(v string) *ImportProductRequest {
	s.ProductPutAntOfficial = &v
	return s
}

func (s *ImportProductRequest) SetName(v string) *ImportProductRequest {
	s.Name = &v
	return s
}

func (s *ImportProductRequest) SetXsCode(v string) *ImportProductRequest {
	s.XsCode = &v
	return s
}

func (s *ImportProductRequest) SetStartTime(v string) *ImportProductRequest {
	s.StartTime = &v
	return s
}

func (s *ImportProductRequest) SetPd(v string) *ImportProductRequest {
	s.Pd = &v
	return s
}

func (s *ImportProductRequest) SetPdLeader(v string) *ImportProductRequest {
	s.PdLeader = &v
	return s
}

func (s *ImportProductRequest) SetDevLeader(v string) *ImportProductRequest {
	s.DevLeader = &v
	return s
}

func (s *ImportProductRequest) SetDev(v string) *ImportProductRequest {
	s.Dev = &v
	return s
}

func (s *ImportProductRequest) SetDescription(v string) *ImportProductRequest {
	s.Description = &v
	return s
}

func (s *ImportProductRequest) SetOperator(v string) *ImportProductRequest {
	s.Operator = &v
	return s
}

func (s *ImportProductRequest) SetBusinessLine(v string) *ImportProductRequest {
	s.BusinessLine = &v
	return s
}

func (s *ImportProductRequest) SetProductLine(v string) *ImportProductRequest {
	s.ProductLine = &v
	return s
}

func (s *ImportProductRequest) SetProductCode(v string) *ImportProductRequest {
	s.ProductCode = &v
	return s
}

type ImportProductResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s ImportProductResponse) String() string {
	return tea.Prettify(s)
}

func (s ImportProductResponse) GoString() string {
	return s.String()
}

func (s *ImportProductResponse) SetReqMsgId(v string) *ImportProductResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ImportProductResponse) SetResultCode(v string) *ImportProductResponse {
	s.ResultCode = &v
	return s
}

func (s *ImportProductResponse) SetResultMsg(v string) *ImportProductResponse {
	s.ResultMsg = &v
	return s
}

type OperateApprovalCallbackRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 审批流Id
	ProcessId *string `json:"process_id,omitempty" xml:"process_id,omitempty" require:"true"`
	// 审批状态(PASS\UNPASS\CANCEL)
	AuditStatus *string `json:"audit_status,omitempty" xml:"audit_status,omitempty" require:"true"`
}

func (s OperateApprovalCallbackRequest) String() string {
	return tea.Prettify(s)
}

func (s OperateApprovalCallbackRequest) GoString() string {
	return s.String()
}

func (s *OperateApprovalCallbackRequest) SetAuthToken(v string) *OperateApprovalCallbackRequest {
	s.AuthToken = &v
	return s
}

func (s *OperateApprovalCallbackRequest) SetProductInstanceId(v string) *OperateApprovalCallbackRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *OperateApprovalCallbackRequest) SetProcessId(v string) *OperateApprovalCallbackRequest {
	s.ProcessId = &v
	return s
}

func (s *OperateApprovalCallbackRequest) SetAuditStatus(v string) *OperateApprovalCallbackRequest {
	s.AuditStatus = &v
	return s
}

type OperateApprovalCallbackResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s OperateApprovalCallbackResponse) String() string {
	return tea.Prettify(s)
}

func (s OperateApprovalCallbackResponse) GoString() string {
	return s.String()
}

func (s *OperateApprovalCallbackResponse) SetReqMsgId(v string) *OperateApprovalCallbackResponse {
	s.ReqMsgId = &v
	return s
}

func (s *OperateApprovalCallbackResponse) SetResultCode(v string) *OperateApprovalCallbackResponse {
	s.ResultCode = &v
	return s
}

func (s *OperateApprovalCallbackResponse) SetResultMsg(v string) *OperateApprovalCallbackResponse {
	s.ResultMsg = &v
	return s
}

type UpdateProductRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 产品线code
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty" require:"true"`
	// L1code
	BusinessLine *string `json:"business_line,omitempty" xml:"business_line,omitempty" require:"true"`
	// L2code
	ProductLine *string `json:"product_line,omitempty" xml:"product_line,omitempty" require:"true"`
	// 研发负责人
	DevLeader *string `json:"dev_leader,omitempty" xml:"dev_leader,omitempty"`
	// 研发参与人
	Devs *string `json:"devs,omitempty" xml:"devs,omitempty"`
	// 产品负责人
	PdLeader *string `json:"pd_leader,omitempty" xml:"pd_leader,omitempty"`
	// 产品参与人
	Pds *string `json:"pds,omitempty" xml:"pds,omitempty"`
	// 财务负责人
	Finance *string `json:"finance,omitempty" xml:"finance,omitempty"`
	// 法务负责人
	LegalOwner *string `json:"legal_owner,omitempty" xml:"legal_owner,omitempty"`
	// 产管
	ProductAssistant *string `json:"product_assistant,omitempty" xml:"product_assistant,omitempty"`
}

func (s UpdateProductRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateProductRequest) GoString() string {
	return s.String()
}

func (s *UpdateProductRequest) SetAuthToken(v string) *UpdateProductRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateProductRequest) SetProductInstanceId(v string) *UpdateProductRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateProductRequest) SetProductCode(v string) *UpdateProductRequest {
	s.ProductCode = &v
	return s
}

func (s *UpdateProductRequest) SetBusinessLine(v string) *UpdateProductRequest {
	s.BusinessLine = &v
	return s
}

func (s *UpdateProductRequest) SetProductLine(v string) *UpdateProductRequest {
	s.ProductLine = &v
	return s
}

func (s *UpdateProductRequest) SetDevLeader(v string) *UpdateProductRequest {
	s.DevLeader = &v
	return s
}

func (s *UpdateProductRequest) SetDevs(v string) *UpdateProductRequest {
	s.Devs = &v
	return s
}

func (s *UpdateProductRequest) SetPdLeader(v string) *UpdateProductRequest {
	s.PdLeader = &v
	return s
}

func (s *UpdateProductRequest) SetPds(v string) *UpdateProductRequest {
	s.Pds = &v
	return s
}

func (s *UpdateProductRequest) SetFinance(v string) *UpdateProductRequest {
	s.Finance = &v
	return s
}

func (s *UpdateProductRequest) SetLegalOwner(v string) *UpdateProductRequest {
	s.LegalOwner = &v
	return s
}

func (s *UpdateProductRequest) SetProductAssistant(v string) *UpdateProductRequest {
	s.ProductAssistant = &v
	return s
}

type UpdateProductResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s UpdateProductResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateProductResponse) GoString() string {
	return s.String()
}

func (s *UpdateProductResponse) SetReqMsgId(v string) *UpdateProductResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateProductResponse) SetResultCode(v string) *UpdateProductResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateProductResponse) SetResultMsg(v string) *UpdateProductResponse {
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
				"sdk_version":      tea.String("1.1.5"),
				"_prod_code":       tea.String("INTLCOMMONCENTER"),
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
 * Description: 外部调用创建l3
 * Summary: 橡实调用创建
 */
func (client *Client) ImportProduct(request *ImportProductRequest) (_result *ImportProductResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ImportProductResponse{}
	_body, _err := client.ImportProductEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 外部调用创建l3
 * Summary: 橡实调用创建
 */
func (client *Client) ImportProductEx(request *ImportProductRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ImportProductResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ImportProductResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.intlcommoncenter.product.import"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 国际产商品审批流是通过国内产商品实现的，需要开放OpenApi供国内产商品 审批回调 国际产商品修改审批状态
 * Summary: 审批回调
 */
func (client *Client) OperateApprovalCallback(request *OperateApprovalCallbackRequest) (_result *OperateApprovalCallbackResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &OperateApprovalCallbackResponse{}
	_body, _err := client.OperateApprovalCallbackEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 国际产商品审批流是通过国内产商品实现的，需要开放OpenApi供国内产商品 审批回调 国际产商品修改审批状态
 * Summary: 审批回调
 */
func (client *Client) OperateApprovalCallbackEx(request *OperateApprovalCallbackRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *OperateApprovalCallbackResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &OperateApprovalCallbackResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.intlcommoncenter.approval.callback.operate"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: L3更新同步
 * Summary: L3更新同步
 */
func (client *Client) UpdateProduct(request *UpdateProductRequest) (_result *UpdateProductResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateProductResponse{}
	_body, _err := client.UpdateProductEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: L3更新同步
 * Summary: L3更新同步
 */
func (client *Client) UpdateProductEx(request *UpdateProductRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateProductResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateProductResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.intlcommoncenter.product.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
