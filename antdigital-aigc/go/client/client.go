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

type PushVideoCreatetaskRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 模型标识，如 seedance-01-pro / happyhorse-t2v / wanx-v1
	Model *string `json:"model,omitempty" xml:"model,omitempty" require:"true"`
	// 文本提示词
	Prompt *string `json:"prompt,omitempty" xml:"prompt,omitempty" require:"true"`
	// 图生视频时传入参考图片 URL
	ImageUrl *string `json:"image_url,omitempty" xml:"image_url,omitempty"`
	// 视频续写时传入参考视频 URL
	VideoUrl *string `json:"video_url,omitempty" xml:"video_url,omitempty"`
	// 参考音频 URL（预留）
	AudioUrl *string `json:"audio_url,omitempty" xml:"audio_url,omitempty"`
	// 参考图片 URL（参考图生视频场景）
	RefImageUrl *string `json:"ref_image_url,omitempty" xml:"ref_image_url,omitempty"`
	// 分辨率，如 1280x720
	Size *string `json:"size,omitempty" xml:"size,omitempty"`
	// 视频时长（秒）
	Duration *string `json:"duration,omitempty" xml:"duration,omitempty"`
	// 请求追踪 ID，用于幂等去重
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
	// MIST Token / API Key
	Token *string `json:"token,omitempty" xml:"token,omitempty" require:"true"`
	// 扩展JSON
	Ext *string `json:"ext,omitempty" xml:"ext,omitempty"`
}

func (s PushVideoCreatetaskRequest) String() string {
	return tea.Prettify(s)
}

func (s PushVideoCreatetaskRequest) GoString() string {
	return s.String()
}

func (s *PushVideoCreatetaskRequest) SetAuthToken(v string) *PushVideoCreatetaskRequest {
	s.AuthToken = &v
	return s
}

func (s *PushVideoCreatetaskRequest) SetProductInstanceId(v string) *PushVideoCreatetaskRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PushVideoCreatetaskRequest) SetModel(v string) *PushVideoCreatetaskRequest {
	s.Model = &v
	return s
}

func (s *PushVideoCreatetaskRequest) SetPrompt(v string) *PushVideoCreatetaskRequest {
	s.Prompt = &v
	return s
}

func (s *PushVideoCreatetaskRequest) SetImageUrl(v string) *PushVideoCreatetaskRequest {
	s.ImageUrl = &v
	return s
}

func (s *PushVideoCreatetaskRequest) SetVideoUrl(v string) *PushVideoCreatetaskRequest {
	s.VideoUrl = &v
	return s
}

func (s *PushVideoCreatetaskRequest) SetAudioUrl(v string) *PushVideoCreatetaskRequest {
	s.AudioUrl = &v
	return s
}

func (s *PushVideoCreatetaskRequest) SetRefImageUrl(v string) *PushVideoCreatetaskRequest {
	s.RefImageUrl = &v
	return s
}

func (s *PushVideoCreatetaskRequest) SetSize(v string) *PushVideoCreatetaskRequest {
	s.Size = &v
	return s
}

func (s *PushVideoCreatetaskRequest) SetDuration(v string) *PushVideoCreatetaskRequest {
	s.Duration = &v
	return s
}

func (s *PushVideoCreatetaskRequest) SetRequestId(v string) *PushVideoCreatetaskRequest {
	s.RequestId = &v
	return s
}

func (s *PushVideoCreatetaskRequest) SetToken(v string) *PushVideoCreatetaskRequest {
	s.Token = &v
	return s
}

func (s *PushVideoCreatetaskRequest) SetExt(v string) *PushVideoCreatetaskRequest {
	s.Ext = &v
	return s
}

type PushVideoCreatetaskResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 任务 ID
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty"`
	// 任务状态：submitted / processing / succeeded / failed
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 模型名称
	Model *string `json:"model,omitempty" xml:"model,omitempty"`
	// 扩展JSON
	Ext *string `json:"ext,omitempty" xml:"ext,omitempty"`
}

func (s PushVideoCreatetaskResponse) String() string {
	return tea.Prettify(s)
}

func (s PushVideoCreatetaskResponse) GoString() string {
	return s.String()
}

func (s *PushVideoCreatetaskResponse) SetReqMsgId(v string) *PushVideoCreatetaskResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PushVideoCreatetaskResponse) SetResultCode(v string) *PushVideoCreatetaskResponse {
	s.ResultCode = &v
	return s
}

func (s *PushVideoCreatetaskResponse) SetResultMsg(v string) *PushVideoCreatetaskResponse {
	s.ResultMsg = &v
	return s
}

func (s *PushVideoCreatetaskResponse) SetTaskId(v string) *PushVideoCreatetaskResponse {
	s.TaskId = &v
	return s
}

func (s *PushVideoCreatetaskResponse) SetStatus(v string) *PushVideoCreatetaskResponse {
	s.Status = &v
	return s
}

func (s *PushVideoCreatetaskResponse) SetModel(v string) *PushVideoCreatetaskResponse {
	s.Model = &v
	return s
}

func (s *PushVideoCreatetaskResponse) SetExt(v string) *PushVideoCreatetaskResponse {
	s.Ext = &v
	return s
}

type QueryVideoQuerytaskRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 查询的任务ID
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty" require:"true"`
}

func (s QueryVideoQuerytaskRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryVideoQuerytaskRequest) GoString() string {
	return s.String()
}

func (s *QueryVideoQuerytaskRequest) SetAuthToken(v string) *QueryVideoQuerytaskRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryVideoQuerytaskRequest) SetProductInstanceId(v string) *QueryVideoQuerytaskRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryVideoQuerytaskRequest) SetTaskId(v string) *QueryVideoQuerytaskRequest {
	s.TaskId = &v
	return s
}

type QueryVideoQuerytaskResponse struct {
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
	// 模型名称
	Model *string `json:"model,omitempty" xml:"model,omitempty"`
	// 视频输出URL
	VideoUrl *string `json:"video_url,omitempty" xml:"video_url,omitempty"`
	// 错误码
	ErrorCode *string `json:"error_code,omitempty" xml:"error_code,omitempty"`
	// 错误信息
	ErrorMessage *string `json:"error_message,omitempty" xml:"error_message,omitempty"`
	// 扩展信息
	Ext *string `json:"ext,omitempty" xml:"ext,omitempty"`
}

func (s QueryVideoQuerytaskResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryVideoQuerytaskResponse) GoString() string {
	return s.String()
}

func (s *QueryVideoQuerytaskResponse) SetReqMsgId(v string) *QueryVideoQuerytaskResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryVideoQuerytaskResponse) SetResultCode(v string) *QueryVideoQuerytaskResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryVideoQuerytaskResponse) SetResultMsg(v string) *QueryVideoQuerytaskResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryVideoQuerytaskResponse) SetTaskId(v string) *QueryVideoQuerytaskResponse {
	s.TaskId = &v
	return s
}

func (s *QueryVideoQuerytaskResponse) SetStatus(v string) *QueryVideoQuerytaskResponse {
	s.Status = &v
	return s
}

func (s *QueryVideoQuerytaskResponse) SetModel(v string) *QueryVideoQuerytaskResponse {
	s.Model = &v
	return s
}

func (s *QueryVideoQuerytaskResponse) SetVideoUrl(v string) *QueryVideoQuerytaskResponse {
	s.VideoUrl = &v
	return s
}

func (s *QueryVideoQuerytaskResponse) SetErrorCode(v string) *QueryVideoQuerytaskResponse {
	s.ErrorCode = &v
	return s
}

func (s *QueryVideoQuerytaskResponse) SetErrorMessage(v string) *QueryVideoQuerytaskResponse {
	s.ErrorMessage = &v
	return s
}

func (s *QueryVideoQuerytaskResponse) SetExt(v string) *QueryVideoQuerytaskResponse {
	s.Ext = &v
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
				"_prod_code":       tea.String("AIGC"),
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
 * Description: 创建aigc视频生成任务
 * Summary: 创建aigc视频生成任务
 */
func (client *Client) PushVideoCreatetask(request *PushVideoCreatetaskRequest) (_result *PushVideoCreatetaskResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PushVideoCreatetaskResponse{}
	_body, _err := client.PushVideoCreatetaskEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建aigc视频生成任务
 * Summary: 创建aigc视频生成任务
 */
func (client *Client) PushVideoCreatetaskEx(request *PushVideoCreatetaskRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PushVideoCreatetaskResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PushVideoCreatetaskResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.aigc.video.createtask.push"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: AIGC视频任务查询
 * Summary: AIGC视频任务查询
 */
func (client *Client) QueryVideoQuerytask(request *QueryVideoQuerytaskRequest) (_result *QueryVideoQuerytaskResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryVideoQuerytaskResponse{}
	_body, _err := client.QueryVideoQuerytaskEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: AIGC视频任务查询
 * Summary: AIGC视频任务查询
 */
func (client *Client) QueryVideoQuerytaskEx(request *QueryVideoQuerytaskRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryVideoQuerytaskResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryVideoQuerytaskResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.aigc.video.querytask.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
