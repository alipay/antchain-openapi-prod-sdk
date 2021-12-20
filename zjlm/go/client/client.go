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

// 文件
type FileInfoModelResponse struct {
	// 文件名称
	FileName *string `json:"file_name,omitempty" xml:"file_name,omitempty" require:"true"`
	// 文件别名
	AliasName *string `json:"alias_name,omitempty" xml:"alias_name,omitempty" require:"true"`
	// 文件类型
	FileType *string `json:"file_type,omitempty" xml:"file_type,omitempty" require:"true"`
	// 文件访问url 地址
	OssUrl *string `json:"oss_url,omitempty" xml:"oss_url,omitempty" require:"true"`
}

func (s FileInfoModelResponse) String() string {
	return tea.Prettify(s)
}

func (s FileInfoModelResponse) GoString() string {
	return s.String()
}

func (s *FileInfoModelResponse) SetFileName(v string) *FileInfoModelResponse {
	s.FileName = &v
	return s
}

func (s *FileInfoModelResponse) SetAliasName(v string) *FileInfoModelResponse {
	s.AliasName = &v
	return s
}

func (s *FileInfoModelResponse) SetFileType(v string) *FileInfoModelResponse {
	s.FileType = &v
	return s
}

func (s *FileInfoModelResponse) SetOssUrl(v string) *FileInfoModelResponse {
	s.OssUrl = &v
	return s
}

// 溯源报告单响应数据
type QiaReportTraceResponse struct {
	// 任务编号
	QiId *string `json:"qi_id,omitempty" xml:"qi_id,omitempty" require:"true"`
	// 颁发机构
	QiOrgName *string `json:"qi_org_name,omitempty" xml:"qi_org_name,omitempty" require:"true"`
	// 区块链,哈希值
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty" require:"true"`
	// 有效期开始
	QiStartTime *string `json:"qi_start_time,omitempty" xml:"qi_start_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 有效期结束
	QiEndTime *string `json:"qi_end_time,omitempty" xml:"qi_end_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 认证证书资料
	CertificationFiles []*FileInfoModelResponse `json:"certification_files,omitempty" xml:"certification_files,omitempty" require:"true" type:"Repeated"`
	// 报告类型
	//      * REPORT, 报告认证
	//      * NEWSTANDARD, 新标质检
	BizType *string `json:"biz_type,omitempty" xml:"biz_type,omitempty" require:"true"`
	// 报告状态
	//      * PASS 已通过
	QiStatus *string `json:"qi_status,omitempty" xml:"qi_status,omitempty" require:"true"`
	// 标签key
	QiTagKey *string `json:"qi_tag_key,omitempty" xml:"qi_tag_key,omitempty" require:"true"`
	// 标签名
	QiTagName *string `json:"qi_tag_name,omitempty" xml:"qi_tag_name,omitempty" require:"true"`
}

func (s QiaReportTraceResponse) String() string {
	return tea.Prettify(s)
}

func (s QiaReportTraceResponse) GoString() string {
	return s.String()
}

func (s *QiaReportTraceResponse) SetQiId(v string) *QiaReportTraceResponse {
	s.QiId = &v
	return s
}

func (s *QiaReportTraceResponse) SetQiOrgName(v string) *QiaReportTraceResponse {
	s.QiOrgName = &v
	return s
}

func (s *QiaReportTraceResponse) SetTxHash(v string) *QiaReportTraceResponse {
	s.TxHash = &v
	return s
}

func (s *QiaReportTraceResponse) SetQiStartTime(v string) *QiaReportTraceResponse {
	s.QiStartTime = &v
	return s
}

func (s *QiaReportTraceResponse) SetQiEndTime(v string) *QiaReportTraceResponse {
	s.QiEndTime = &v
	return s
}

func (s *QiaReportTraceResponse) SetCertificationFiles(v []*FileInfoModelResponse) *QiaReportTraceResponse {
	s.CertificationFiles = v
	return s
}

func (s *QiaReportTraceResponse) SetBizType(v string) *QiaReportTraceResponse {
	s.BizType = &v
	return s
}

func (s *QiaReportTraceResponse) SetQiStatus(v string) *QiaReportTraceResponse {
	s.QiStatus = &v
	return s
}

func (s *QiaReportTraceResponse) SetQiTagKey(v string) *QiaReportTraceResponse {
	s.QiTagKey = &v
	return s
}

func (s *QiaReportTraceResponse) SetQiTagName(v string) *QiaReportTraceResponse {
	s.QiTagName = &v
	return s
}

type QueryTraceapiRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 商品编码
	Sku *string `json:"sku,omitempty" xml:"sku,omitempty" require:"true"`
	// 11
	ShopId *string `json:"shop_id,omitempty" xml:"shop_id,omitempty" require:"true"`
	// 11
	TagKey *string `json:"tag_key,omitempty" xml:"tag_key,omitempty"`
	// 222
	TenantCode *string `json:"tenant_code,omitempty" xml:"tenant_code,omitempty" require:"true"`
}

func (s QueryTraceapiRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryTraceapiRequest) GoString() string {
	return s.String()
}

func (s *QueryTraceapiRequest) SetAuthToken(v string) *QueryTraceapiRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryTraceapiRequest) SetProductInstanceId(v string) *QueryTraceapiRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryTraceapiRequest) SetSku(v string) *QueryTraceapiRequest {
	s.Sku = &v
	return s
}

func (s *QueryTraceapiRequest) SetShopId(v string) *QueryTraceapiRequest {
	s.ShopId = &v
	return s
}

func (s *QueryTraceapiRequest) SetTagKey(v string) *QueryTraceapiRequest {
	s.TagKey = &v
	return s
}

func (s *QueryTraceapiRequest) SetTenantCode(v string) *QueryTraceapiRequest {
	s.TenantCode = &v
	return s
}

type QueryTraceapiResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 成功数据
	Data []*QiaReportTraceResponse `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
}

func (s QueryTraceapiResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryTraceapiResponse) GoString() string {
	return s.String()
}

func (s *QueryTraceapiResponse) SetReqMsgId(v string) *QueryTraceapiResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryTraceapiResponse) SetResultCode(v string) *QueryTraceapiResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryTraceapiResponse) SetResultMsg(v string) *QueryTraceapiResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryTraceapiResponse) SetData(v []*QiaReportTraceResponse) *QueryTraceapiResponse {
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
				"sdk_version":      tea.String("1.0.2"),
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
 * Description: 溯源查询质检报告
 * Summary: 溯源查询质检报告
 */
func (client *Client) QueryTraceapi(request *QueryTraceapiRequest) (_result *QueryTraceapiResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryTraceapiResponse{}
	_body, _err := client.QueryTraceapiEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 溯源查询质检报告
 * Summary: 溯源查询质检报告
 */
func (client *Client) QueryTraceapiEx(request *QueryTraceapiRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryTraceapiResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryTraceapiResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("blockchain.zjlm.traceapi.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
