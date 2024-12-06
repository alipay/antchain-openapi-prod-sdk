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

// 返回详情
type ReturnDetail struct {
	// 结果对象内容
	BizContent *string `json:"biz_content,omitempty" xml:"biz_content,omitempty" require:"true"`
	// 返回形式
	ReturnType *string `json:"return_type,omitempty" xml:"return_type,omitempty" require:"true"`
	// 文件列表
	FileUrls []*string `json:"file_urls,omitempty" xml:"file_urls,omitempty" require:"true" type:"Repeated"`
	// 文件类型
	FileType *string `json:"file_type,omitempty" xml:"file_type,omitempty" require:"true"`
	// 加密模式
	EncryptModel *string `json:"encrypt_model,omitempty" xml:"encrypt_model,omitempty" require:"true"`
	// 密钥信封
	SecretEnvelope *string `json:"secret_envelope,omitempty" xml:"secret_envelope,omitempty" require:"true"`
}

func (s ReturnDetail) String() string {
	return tea.Prettify(s)
}

func (s ReturnDetail) GoString() string {
	return s.String()
}

func (s *ReturnDetail) SetBizContent(v string) *ReturnDetail {
	s.BizContent = &v
	return s
}

func (s *ReturnDetail) SetReturnType(v string) *ReturnDetail {
	s.ReturnType = &v
	return s
}

func (s *ReturnDetail) SetFileUrls(v []*string) *ReturnDetail {
	s.FileUrls = v
	return s
}

func (s *ReturnDetail) SetFileType(v string) *ReturnDetail {
	s.FileType = &v
	return s
}

func (s *ReturnDetail) SetEncryptModel(v string) *ReturnDetail {
	s.EncryptModel = &v
	return s
}

func (s *ReturnDetail) SetSecretEnvelope(v string) *ReturnDetail {
	s.SecretEnvelope = &v
	return s
}

type ExecBlockchainTaxIcmSyncgatheringRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 机构号码
	InstCode *string `json:"inst_code,omitempty" xml:"inst_code,omitempty" require:"true"`
	// 请求流水号(必填),调用方保证每次请求号唯一，受理方用来校验唯一性，同一受理号返回请求结果一致
	BizRequestId *string `json:"biz_request_id,omitempty" xml:"biz_request_id,omitempty" require:"true"`
	// 纳税人识别号(必填)
	IdentityId *string `json:"identity_id,omitempty" xml:"identity_id,omitempty" require:"true"`
	// 授权类型(必填)
	AuthType *string `json:"auth_type,omitempty" xml:"auth_type,omitempty" require:"true"`
	// 订单号
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty" require:"true"`
	// 补充内容,如果不动产中字段为空的话查的就是授权中的cityCode
	Content *string `json:"content,omitempty" xml:"content,omitempty" require:"true"`
	// 查询类型
	// NORMAL 正常调用
	// BATCH_HAND  批刷
	QueryType *string `json:"query_type,omitempty" xml:"query_type,omitempty"`
	// 子机构编码，字典由系统预设白名单
	SubTenant *string `json:"sub_tenant,omitempty" xml:"sub_tenant,omitempty"`
	// 优先级，越大优先级越高
	UsePriority *string `json:"use_priority,omitempty" xml:"use_priority,omitempty"`
}

func (s ExecBlockchainTaxIcmSyncgatheringRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecBlockchainTaxIcmSyncgatheringRequest) GoString() string {
	return s.String()
}

func (s *ExecBlockchainTaxIcmSyncgatheringRequest) SetAuthToken(v string) *ExecBlockchainTaxIcmSyncgatheringRequest {
	s.AuthToken = &v
	return s
}

func (s *ExecBlockchainTaxIcmSyncgatheringRequest) SetProductInstanceId(v string) *ExecBlockchainTaxIcmSyncgatheringRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ExecBlockchainTaxIcmSyncgatheringRequest) SetInstCode(v string) *ExecBlockchainTaxIcmSyncgatheringRequest {
	s.InstCode = &v
	return s
}

func (s *ExecBlockchainTaxIcmSyncgatheringRequest) SetBizRequestId(v string) *ExecBlockchainTaxIcmSyncgatheringRequest {
	s.BizRequestId = &v
	return s
}

func (s *ExecBlockchainTaxIcmSyncgatheringRequest) SetIdentityId(v string) *ExecBlockchainTaxIcmSyncgatheringRequest {
	s.IdentityId = &v
	return s
}

func (s *ExecBlockchainTaxIcmSyncgatheringRequest) SetAuthType(v string) *ExecBlockchainTaxIcmSyncgatheringRequest {
	s.AuthType = &v
	return s
}

func (s *ExecBlockchainTaxIcmSyncgatheringRequest) SetOrderNo(v string) *ExecBlockchainTaxIcmSyncgatheringRequest {
	s.OrderNo = &v
	return s
}

func (s *ExecBlockchainTaxIcmSyncgatheringRequest) SetContent(v string) *ExecBlockchainTaxIcmSyncgatheringRequest {
	s.Content = &v
	return s
}

func (s *ExecBlockchainTaxIcmSyncgatheringRequest) SetQueryType(v string) *ExecBlockchainTaxIcmSyncgatheringRequest {
	s.QueryType = &v
	return s
}

func (s *ExecBlockchainTaxIcmSyncgatheringRequest) SetSubTenant(v string) *ExecBlockchainTaxIcmSyncgatheringRequest {
	s.SubTenant = &v
	return s
}

func (s *ExecBlockchainTaxIcmSyncgatheringRequest) SetUsePriority(v string) *ExecBlockchainTaxIcmSyncgatheringRequest {
	s.UsePriority = &v
	return s
}

type ExecBlockchainTaxIcmSyncgatheringResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回的请求对象jsonString
	BizContent *string `json:"biz_content,omitempty" xml:"biz_content,omitempty"`
	// unix秒时间戳,查询时间，用来对账使用
	QueryTime *string `json:"query_time,omitempty" xml:"query_time,omitempty"`
	// 返回模式
	ReturnMode *string `json:"return_mode,omitempty" xml:"return_mode,omitempty"`
	// 返回结果
	ReturnResult []*ReturnDetail `json:"return_result,omitempty" xml:"return_result,omitempty" type:"Repeated"`
	// 是否查得
	NullDataFlag *bool `json:"null_data_flag,omitempty" xml:"null_data_flag,omitempty"`
	// 参考区块链给出的标准字段定义
	QueryType *string `json:"query_type,omitempty" xml:"query_type,omitempty"`
	// 是否需要重新授权
	Reauth *bool `json:"reauth,omitempty" xml:"reauth,omitempty"`
}

func (s ExecBlockchainTaxIcmSyncgatheringResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecBlockchainTaxIcmSyncgatheringResponse) GoString() string {
	return s.String()
}

func (s *ExecBlockchainTaxIcmSyncgatheringResponse) SetReqMsgId(v string) *ExecBlockchainTaxIcmSyncgatheringResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ExecBlockchainTaxIcmSyncgatheringResponse) SetResultCode(v string) *ExecBlockchainTaxIcmSyncgatheringResponse {
	s.ResultCode = &v
	return s
}

func (s *ExecBlockchainTaxIcmSyncgatheringResponse) SetResultMsg(v string) *ExecBlockchainTaxIcmSyncgatheringResponse {
	s.ResultMsg = &v
	return s
}

func (s *ExecBlockchainTaxIcmSyncgatheringResponse) SetBizContent(v string) *ExecBlockchainTaxIcmSyncgatheringResponse {
	s.BizContent = &v
	return s
}

func (s *ExecBlockchainTaxIcmSyncgatheringResponse) SetQueryTime(v string) *ExecBlockchainTaxIcmSyncgatheringResponse {
	s.QueryTime = &v
	return s
}

func (s *ExecBlockchainTaxIcmSyncgatheringResponse) SetReturnMode(v string) *ExecBlockchainTaxIcmSyncgatheringResponse {
	s.ReturnMode = &v
	return s
}

func (s *ExecBlockchainTaxIcmSyncgatheringResponse) SetReturnResult(v []*ReturnDetail) *ExecBlockchainTaxIcmSyncgatheringResponse {
	s.ReturnResult = v
	return s
}

func (s *ExecBlockchainTaxIcmSyncgatheringResponse) SetNullDataFlag(v bool) *ExecBlockchainTaxIcmSyncgatheringResponse {
	s.NullDataFlag = &v
	return s
}

func (s *ExecBlockchainTaxIcmSyncgatheringResponse) SetQueryType(v string) *ExecBlockchainTaxIcmSyncgatheringResponse {
	s.QueryType = &v
	return s
}

func (s *ExecBlockchainTaxIcmSyncgatheringResponse) SetReauth(v bool) *ExecBlockchainTaxIcmSyncgatheringResponse {
	s.Reauth = &v
	return s
}

type RunBlockchainTaxApiDataprocessRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 请求参数json
	BizParam *string `json:"biz_param,omitempty" xml:"biz_param,omitempty" require:"true"`
	// 产品code
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty" require:"true"`
	// 调用的方法
	MethodCode *string `json:"method_code,omitempty" xml:"method_code,omitempty" require:"true"`
	// 租户编码
	InstCode *string `json:"inst_code,omitempty" xml:"inst_code,omitempty"`
	// RSA-DESede
	// 代表数字信封：采用 rsa 非对称算法，DESede 对称算法
	Algorithm *string `json:"algorithm,omitempty" xml:"algorithm,omitempty"`
	// 是否采用加密算法
	Encryption *bool `json:"encryption,omitempty" xml:"encryption,omitempty"`
	// 对称秘钥加密后的数据
	EncryptionKey *string `json:"encryption_key,omitempty" xml:"encryption_key,omitempty"`
}

func (s RunBlockchainTaxApiDataprocessRequest) String() string {
	return tea.Prettify(s)
}

func (s RunBlockchainTaxApiDataprocessRequest) GoString() string {
	return s.String()
}

func (s *RunBlockchainTaxApiDataprocessRequest) SetAuthToken(v string) *RunBlockchainTaxApiDataprocessRequest {
	s.AuthToken = &v
	return s
}

func (s *RunBlockchainTaxApiDataprocessRequest) SetProductInstanceId(v string) *RunBlockchainTaxApiDataprocessRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *RunBlockchainTaxApiDataprocessRequest) SetBizParam(v string) *RunBlockchainTaxApiDataprocessRequest {
	s.BizParam = &v
	return s
}

func (s *RunBlockchainTaxApiDataprocessRequest) SetProductCode(v string) *RunBlockchainTaxApiDataprocessRequest {
	s.ProductCode = &v
	return s
}

func (s *RunBlockchainTaxApiDataprocessRequest) SetMethodCode(v string) *RunBlockchainTaxApiDataprocessRequest {
	s.MethodCode = &v
	return s
}

func (s *RunBlockchainTaxApiDataprocessRequest) SetInstCode(v string) *RunBlockchainTaxApiDataprocessRequest {
	s.InstCode = &v
	return s
}

func (s *RunBlockchainTaxApiDataprocessRequest) SetAlgorithm(v string) *RunBlockchainTaxApiDataprocessRequest {
	s.Algorithm = &v
	return s
}

func (s *RunBlockchainTaxApiDataprocessRequest) SetEncryption(v bool) *RunBlockchainTaxApiDataprocessRequest {
	s.Encryption = &v
	return s
}

func (s *RunBlockchainTaxApiDataprocessRequest) SetEncryptionKey(v string) *RunBlockchainTaxApiDataprocessRequest {
	s.EncryptionKey = &v
	return s
}

type RunBlockchainTaxApiDataprocessResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回数据
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s RunBlockchainTaxApiDataprocessResponse) String() string {
	return tea.Prettify(s)
}

func (s RunBlockchainTaxApiDataprocessResponse) GoString() string {
	return s.String()
}

func (s *RunBlockchainTaxApiDataprocessResponse) SetReqMsgId(v string) *RunBlockchainTaxApiDataprocessResponse {
	s.ReqMsgId = &v
	return s
}

func (s *RunBlockchainTaxApiDataprocessResponse) SetResultCode(v string) *RunBlockchainTaxApiDataprocessResponse {
	s.ResultCode = &v
	return s
}

func (s *RunBlockchainTaxApiDataprocessResponse) SetResultMsg(v string) *RunBlockchainTaxApiDataprocessResponse {
	s.ResultMsg = &v
	return s
}

func (s *RunBlockchainTaxApiDataprocessResponse) SetData(v string) *RunBlockchainTaxApiDataprocessResponse {
	s.Data = &v
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
				"_prod_code":       tea.String("ak_f9cb6523d99f4d089e97d549f141e6e4"),
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
 * Description: 采集，不限制同步 异步
 * Summary: 采集
 */
func (client *Client) ExecBlockchainTaxIcmSyncgathering(request *ExecBlockchainTaxIcmSyncgatheringRequest) (_result *ExecBlockchainTaxIcmSyncgatheringResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ExecBlockchainTaxIcmSyncgatheringResponse{}
	_body, _err := client.ExecBlockchainTaxIcmSyncgatheringEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 采集，不限制同步 异步
 * Summary: 采集
 */
func (client *Client) ExecBlockchainTaxIcmSyncgatheringEx(request *ExecBlockchainTaxIcmSyncgatheringRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ExecBlockchainTaxIcmSyncgatheringResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecBlockchainTaxIcmSyncgatheringResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.tax.icm.syncgathering.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 数据流转通用执行接口
 * Summary: 数据流转通用执行接口
 */
func (client *Client) RunBlockchainTaxApiDataprocess(request *RunBlockchainTaxApiDataprocessRequest) (_result *RunBlockchainTaxApiDataprocessResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &RunBlockchainTaxApiDataprocessResponse{}
	_body, _err := client.RunBlockchainTaxApiDataprocessEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 数据流转通用执行接口
 * Summary: 数据流转通用执行接口
 */
func (client *Client) RunBlockchainTaxApiDataprocessEx(request *RunBlockchainTaxApiDataprocessRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *RunBlockchainTaxApiDataprocessResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &RunBlockchainTaxApiDataprocessResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.tax.api.dataprocess.run"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
