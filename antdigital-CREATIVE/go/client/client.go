// This file is auto-generated, don't edit it. Thanks.
package client

import (
	rpcutil "github.com/alibabacloud-go/tea-rpc-utils/service"
	util "github.com/alibabacloud-go/tea-utils/v2/service"
	"github.com/alibabacloud-go/tea/tea"
	antchainutil "github.com/antchain-openapi-sdk-go/antchain-util/service"
)

// Description:
//
// Model for initing client
type Config struct {
	// accesskey id
	AccessKeyId *string `json:"accessKeyId,omitempty" xml:"accessKeyId,omitempty"`
	// accesskey secret
	AccessKeySecret *string `json:"accessKeySecret,omitempty" xml:"accessKeySecret,omitempty"`
	// security token
	SecurityToken *string `json:"securityToken,omitempty" xml:"securityToken,omitempty"`
	// http protocol
	//
	// example:
	//
	// http
	Protocol *string `json:"protocol,omitempty" xml:"protocol,omitempty"`
	// read timeout
	//
	// example:
	//
	// 10
	ReadTimeout *int `json:"readTimeout,omitempty" xml:"readTimeout,omitempty"`
	// connect timeout
	//
	// example:
	//
	// 10
	ConnectTimeout *int `json:"connectTimeout,omitempty" xml:"connectTimeout,omitempty"`
	// http proxy
	//
	// example:
	//
	// http://localhost
	HttpProxy *string `json:"httpProxy,omitempty" xml:"httpProxy,omitempty"`
	// https proxy
	//
	// example:
	//
	// https://localhost
	HttpsProxy *string `json:"httpsProxy,omitempty" xml:"httpsProxy,omitempty"`
	// endpoint
	//
	// example:
	//
	// cs.aliyuncs.com
	Endpoint *string `json:"endpoint,omitempty" xml:"endpoint,omitempty"`
	// proxy white list
	//
	// example:
	//
	// http://localhost
	NoProxy *string `json:"noProxy,omitempty" xml:"noProxy,omitempty"`
	// max idle conns
	//
	// example:
	//
	// 3
	MaxIdleConns *int `json:"maxIdleConns,omitempty" xml:"maxIdleConns,omitempty"`
	// user agent
	//
	// example:
	//
	// Alibabacloud/1
	UserAgent *string `json:"userAgent,omitempty" xml:"userAgent,omitempty"`
	// socks5 proxy
	Socks5Proxy *string `json:"socks5Proxy,omitempty" xml:"socks5Proxy,omitempty"`
	// socks5 network
	//
	// example:
	//
	// TCP
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

type PushVideogenerationRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 模型标识，如 ：doubao-seedance-2-0-260128
	Model *string `json:"model,omitempty" xml:"model,omitempty" require:"true"`
	// 文本提示词
	Prompt *string `json:"prompt,omitempty" xml:"prompt,omitempty" require:"true"`
	// 图生视频参考图片 URL
	ImageUrl []*string `json:"image_url,omitempty" xml:"image_url,omitempty" type:"Repeated"`
	// 视频参考/续写时传入视频 URL
	VideoUrl []*string `json:"video_url,omitempty" xml:"video_url,omitempty" type:"Repeated"`
	// 参考音频URL列表
	AudioUrl []*string `json:"audio_url,omitempty" xml:"audio_url,omitempty" type:"Repeated"`
	// 比例
	Ratio *string `json:"ratio,omitempty" xml:"ratio,omitempty"`
	// 视频时长（秒）
	Duration *int64 `json:"duration,omitempty" xml:"duration,omitempty"`
	// 请求追踪 ID，用于幂等去重
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
	// 扩展JSON
	Ext *string `json:"ext,omitempty" xml:"ext,omitempty"`
}

func (s PushVideogenerationRequest) String() string {
	return tea.Prettify(s)
}

func (s PushVideogenerationRequest) GoString() string {
	return s.String()
}

func (s *PushVideogenerationRequest) SetAuthToken(v string) *PushVideogenerationRequest {
	s.AuthToken = &v
	return s
}

func (s *PushVideogenerationRequest) SetProductInstanceId(v string) *PushVideogenerationRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PushVideogenerationRequest) SetModel(v string) *PushVideogenerationRequest {
	s.Model = &v
	return s
}

func (s *PushVideogenerationRequest) SetPrompt(v string) *PushVideogenerationRequest {
	s.Prompt = &v
	return s
}

func (s *PushVideogenerationRequest) SetImageUrl(v []*string) *PushVideogenerationRequest {
	s.ImageUrl = v
	return s
}

func (s *PushVideogenerationRequest) SetVideoUrl(v []*string) *PushVideogenerationRequest {
	s.VideoUrl = v
	return s
}

func (s *PushVideogenerationRequest) SetAudioUrl(v []*string) *PushVideogenerationRequest {
	s.AudioUrl = v
	return s
}

func (s *PushVideogenerationRequest) SetRatio(v string) *PushVideogenerationRequest {
	s.Ratio = &v
	return s
}

func (s *PushVideogenerationRequest) SetDuration(v int64) *PushVideogenerationRequest {
	s.Duration = &v
	return s
}

func (s *PushVideogenerationRequest) SetRequestId(v string) *PushVideogenerationRequest {
	s.RequestId = &v
	return s
}

func (s *PushVideogenerationRequest) SetExt(v string) *PushVideogenerationRequest {
	s.Ext = &v
	return s
}

type PushVideogenerationResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 任务 ID，后续查询结果通过此参数获取
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty"`
	// 任务状态：pending（等待中）、processing（处理中）、succeeded（已成功）、failed（已失败）
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 模型名称
	Model *string `json:"model,omitempty" xml:"model,omitempty"`
	// 扩展JSON
	Ext *string `json:"ext,omitempty" xml:"ext,omitempty"`
}

func (s PushVideogenerationResponse) String() string {
	return tea.Prettify(s)
}

func (s PushVideogenerationResponse) GoString() string {
	return s.String()
}

func (s *PushVideogenerationResponse) SetReqMsgId(v string) *PushVideogenerationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PushVideogenerationResponse) SetResultCode(v string) *PushVideogenerationResponse {
	s.ResultCode = &v
	return s
}

func (s *PushVideogenerationResponse) SetResultMsg(v string) *PushVideogenerationResponse {
	s.ResultMsg = &v
	return s
}

func (s *PushVideogenerationResponse) SetTaskId(v string) *PushVideogenerationResponse {
	s.TaskId = &v
	return s
}

func (s *PushVideogenerationResponse) SetStatus(v string) *PushVideogenerationResponse {
	s.Status = &v
	return s
}

func (s *PushVideogenerationResponse) SetModel(v string) *PushVideogenerationResponse {
	s.Model = &v
	return s
}

func (s *PushVideogenerationResponse) SetExt(v string) *PushVideogenerationResponse {
	s.Ext = &v
	return s
}

type QueryVideogenerationRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 查询的任务ID
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty" require:"true"`
}

func (s QueryVideogenerationRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryVideogenerationRequest) GoString() string {
	return s.String()
}

func (s *QueryVideogenerationRequest) SetAuthToken(v string) *QueryVideogenerationRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryVideogenerationRequest) SetProductInstanceId(v string) *QueryVideogenerationRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryVideogenerationRequest) SetTaskId(v string) *QueryVideogenerationRequest {
	s.TaskId = &v
	return s
}

type QueryVideogenerationResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 任务ID
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty"`
	// 任务状态
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 视频输出URL
	VideoUrl *string `json:"video_url,omitempty" xml:"video_url,omitempty"`
	// 错误码
	ErrorCode *string `json:"error_code,omitempty" xml:"error_code,omitempty"`
	// 错误信息
	ErrorMessage *string `json:"error_message,omitempty" xml:"error_message,omitempty"`
}

func (s QueryVideogenerationResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryVideogenerationResponse) GoString() string {
	return s.String()
}

func (s *QueryVideogenerationResponse) SetReqMsgId(v string) *QueryVideogenerationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryVideogenerationResponse) SetResultCode(v string) *QueryVideogenerationResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryVideogenerationResponse) SetResultMsg(v string) *QueryVideogenerationResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryVideogenerationResponse) SetTaskId(v string) *QueryVideogenerationResponse {
	s.TaskId = &v
	return s
}

func (s *QueryVideogenerationResponse) SetStatus(v string) *QueryVideogenerationResponse {
	s.Status = &v
	return s
}

func (s *QueryVideogenerationResponse) SetVideoUrl(v string) *QueryVideogenerationResponse {
	s.VideoUrl = &v
	return s
}

func (s *QueryVideogenerationResponse) SetErrorCode(v string) *QueryVideogenerationResponse {
	s.ErrorCode = &v
	return s
}

func (s *QueryVideogenerationResponse) SetErrorMessage(v string) *QueryVideogenerationResponse {
	s.ErrorMessage = &v
	return s
}

type UploadAssetRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 资产类型
	AssetType *string `json:"asset_type,omitempty" xml:"asset_type,omitempty" require:"true"`
	// 公网可访问的文件URL
	FileUrl *string `json:"file_url,omitempty" xml:"file_url,omitempty" require:"true"`
	// 资产名称
	AssetName *string `json:"asset_name,omitempty" xml:"asset_name,omitempty" require:"true"`
}

func (s UploadAssetRequest) String() string {
	return tea.Prettify(s)
}

func (s UploadAssetRequest) GoString() string {
	return s.String()
}

func (s *UploadAssetRequest) SetAuthToken(v string) *UploadAssetRequest {
	s.AuthToken = &v
	return s
}

func (s *UploadAssetRequest) SetProductInstanceId(v string) *UploadAssetRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UploadAssetRequest) SetAssetType(v string) *UploadAssetRequest {
	s.AssetType = &v
	return s
}

func (s *UploadAssetRequest) SetFileUrl(v string) *UploadAssetRequest {
	s.FileUrl = &v
	return s
}

func (s *UploadAssetRequest) SetAssetName(v string) *UploadAssetRequest {
	s.AssetName = &v
	return s
}

type UploadAssetResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 资产ID
	AssetId *string `json:"asset_id,omitempty" xml:"asset_id,omitempty"`
	// 资产状态
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 资产类型
	AssetType *string `json:"asset_type,omitempty" xml:"asset_type,omitempty"`
}

func (s UploadAssetResponse) String() string {
	return tea.Prettify(s)
}

func (s UploadAssetResponse) GoString() string {
	return s.String()
}

func (s *UploadAssetResponse) SetReqMsgId(v string) *UploadAssetResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UploadAssetResponse) SetResultCode(v string) *UploadAssetResponse {
	s.ResultCode = &v
	return s
}

func (s *UploadAssetResponse) SetResultMsg(v string) *UploadAssetResponse {
	s.ResultMsg = &v
	return s
}

func (s *UploadAssetResponse) SetAssetId(v string) *UploadAssetResponse {
	s.AssetId = &v
	return s
}

func (s *UploadAssetResponse) SetStatus(v string) *UploadAssetResponse {
	s.Status = &v
	return s
}

func (s *UploadAssetResponse) SetAssetType(v string) *UploadAssetResponse {
	s.AssetType = &v
	return s
}

type QueryAssetRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 资产ID
	AssetId *string `json:"asset_id,omitempty" xml:"asset_id,omitempty" require:"true"`
}

func (s QueryAssetRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAssetRequest) GoString() string {
	return s.String()
}

func (s *QueryAssetRequest) SetAuthToken(v string) *QueryAssetRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAssetRequest) SetProductInstanceId(v string) *QueryAssetRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAssetRequest) SetAssetId(v string) *QueryAssetRequest {
	s.AssetId = &v
	return s
}

type QueryAssetResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 资产ID
	AssetId *string `json:"asset_id,omitempty" xml:"asset_id,omitempty"`
	// 资产状态
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 资产类型
	AssetType *string `json:"asset_type,omitempty" xml:"asset_type,omitempty"`
	// 资产类型
	AssetUrl *string `json:"asset_url,omitempty" xml:"asset_url,omitempty"`
	// 错误信息
	ErrorMessage *string `json:"error_message,omitempty" xml:"error_message,omitempty"`
	// 错误码
	ErrorCode *string `json:"error_code,omitempty" xml:"error_code,omitempty"`
}

func (s QueryAssetResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAssetResponse) GoString() string {
	return s.String()
}

func (s *QueryAssetResponse) SetReqMsgId(v string) *QueryAssetResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAssetResponse) SetResultCode(v string) *QueryAssetResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAssetResponse) SetResultMsg(v string) *QueryAssetResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAssetResponse) SetAssetId(v string) *QueryAssetResponse {
	s.AssetId = &v
	return s
}

func (s *QueryAssetResponse) SetStatus(v string) *QueryAssetResponse {
	s.Status = &v
	return s
}

func (s *QueryAssetResponse) SetAssetType(v string) *QueryAssetResponse {
	s.AssetType = &v
	return s
}

func (s *QueryAssetResponse) SetAssetUrl(v string) *QueryAssetResponse {
	s.AssetUrl = &v
	return s
}

func (s *QueryAssetResponse) SetErrorMessage(v string) *QueryAssetResponse {
	s.ErrorMessage = &v
	return s
}

func (s *QueryAssetResponse) SetErrorCode(v string) *QueryAssetResponse {
	s.ErrorCode = &v
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

// Description:
//
// # Init client with Config
//
// @param config - config contains the necessary information to create a client
func NewClient(config *Config) (*Client, error) {
	client := new(Client)
	err := client.Init(config)
	return client, err
}

func (client *Client) Init(config *Config) (_err error) {
	if tea.BoolValue(util.IsUnset(config)) {
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

// Description:
//
// # Encapsulate the request and invoke the network
//
// @param action - api name
//
// @param protocol - http or https
//
// @param method - e.g. GET
//
// @param pathname - pathname of every api
//
// @param request - which contains request params
//
// @param runtime - which controls some details of call api, such as retry times
//
// @return the response
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
				"sdk_version":      tea.String("1.0.3"),
				"_prod_code":       tea.String("CREATIVE"),
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

// Description:
//
// Description: 内容创作平台-视频生成-推送
//
// Summary: 内容创作平台-视频生成-推送
func (client *Client) PushVideogeneration(request *PushVideogenerationRequest) (_result *PushVideogenerationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PushVideogenerationResponse{}
	_body, _err := client.PushVideogenerationEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 内容创作平台-视频生成-推送
//
// Summary: 内容创作平台-视频生成-推送
func (client *Client) PushVideogenerationEx(request *PushVideogenerationRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PushVideogenerationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PushVideogenerationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.creative.videogeneration.push"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 视频创作接口查询
//
// Summary: 视频创作接口查询
func (client *Client) QueryVideogeneration(request *QueryVideogenerationRequest) (_result *QueryVideogenerationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryVideogenerationResponse{}
	_body, _err := client.QueryVideogenerationEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 视频创作接口查询
//
// Summary: 视频创作接口查询
func (client *Client) QueryVideogenerationEx(request *QueryVideogenerationRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryVideogenerationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryVideogenerationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.creative.videogeneration.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 资产上传接口
//
// Summary: 资产上传接口
func (client *Client) UploadAsset(request *UploadAssetRequest) (_result *UploadAssetResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UploadAssetResponse{}
	_body, _err := client.UploadAssetEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 资产上传接口
//
// Summary: 资产上传接口
func (client *Client) UploadAssetEx(request *UploadAssetRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UploadAssetResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UploadAssetResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.creative.asset.upload"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 资产查询接口
//
// Summary: 资产查询接口
func (client *Client) QueryAsset(request *QueryAssetRequest) (_result *QueryAssetResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAssetResponse{}
	_body, _err := client.QueryAssetEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 资产查询接口
//
// Summary: 资产查询接口
func (client *Client) QueryAssetEx(request *QueryAssetRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAssetResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAssetResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.creative.asset.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
