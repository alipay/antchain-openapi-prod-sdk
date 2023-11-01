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

// 数字人位置大小信息，以左上角为起始坐标，向右向下为正值
type PositionSizeInfo struct {
	// 数字人x轴（竖轴）坐标
	X *int64 `json:"x,omitempty" xml:"x,omitempty" require:"true"`
	// 数字人y轴（横轴）坐标
	Y *int64 `json:"y,omitempty" xml:"y,omitempty" require:"true"`
	// 数字人宽度
	//
	Width *int64 `json:"width,omitempty" xml:"width,omitempty" require:"true"`
	// 数字人高度
	Height *int64 `json:"height,omitempty" xml:"height,omitempty" require:"true"`
}

func (s PositionSizeInfo) String() string {
	return tea.Prettify(s)
}

func (s PositionSizeInfo) GoString() string {
	return s.String()
}

func (s *PositionSizeInfo) SetX(v int64) *PositionSizeInfo {
	s.X = &v
	return s
}

func (s *PositionSizeInfo) SetY(v int64) *PositionSizeInfo {
	s.Y = &v
	return s
}

func (s *PositionSizeInfo) SetWidth(v int64) *PositionSizeInfo {
	s.Width = &v
	return s
}

func (s *PositionSizeInfo) SetHeight(v int64) *PositionSizeInfo {
	s.Height = &v
	return s
}

type GetInteractvideoRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 问题
	Question *string `json:"question,omitempty" xml:"question,omitempty" require:"true"`
	// 数字人形象ID(不填写时,返回默认形象视频)
	AvatarId *string `json:"avatar_id,omitempty" xml:"avatar_id,omitempty"`
	// 交互类型（默认为QA, 问答：QA）
	InteractType *string `json:"interact_type,omitempty" xml:"interact_type,omitempty"`
}

func (s GetInteractvideoRequest) String() string {
	return tea.Prettify(s)
}

func (s GetInteractvideoRequest) GoString() string {
	return s.String()
}

func (s *GetInteractvideoRequest) SetAuthToken(v string) *GetInteractvideoRequest {
	s.AuthToken = &v
	return s
}

func (s *GetInteractvideoRequest) SetProductInstanceId(v string) *GetInteractvideoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetInteractvideoRequest) SetQuestion(v string) *GetInteractvideoRequest {
	s.Question = &v
	return s
}

func (s *GetInteractvideoRequest) SetAvatarId(v string) *GetInteractvideoRequest {
	s.AvatarId = &v
	return s
}

func (s *GetInteractvideoRequest) SetInteractType(v string) *GetInteractvideoRequest {
	s.InteractType = &v
	return s
}

type GetInteractvideoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 视频答案URL(视频资源存储在OSS服务上,访问接口时,返回一个视频下载链接)
	AnswerVideoUrl *string `json:"answer_video_url,omitempty" xml:"answer_video_url,omitempty"`
}

func (s GetInteractvideoResponse) String() string {
	return tea.Prettify(s)
}

func (s GetInteractvideoResponse) GoString() string {
	return s.String()
}

func (s *GetInteractvideoResponse) SetReqMsgId(v string) *GetInteractvideoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetInteractvideoResponse) SetResultCode(v string) *GetInteractvideoResponse {
	s.ResultCode = &v
	return s
}

func (s *GetInteractvideoResponse) SetResultMsg(v string) *GetInteractvideoResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetInteractvideoResponse) SetAnswerVideoUrl(v string) *GetInteractvideoResponse {
	s.AnswerVideoUrl = &v
	return s
}

type SubmitAvatarVideoRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 视频名称
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 数字人id
	AvatarId *string `json:"avatar_id,omitempty" xml:"avatar_id,omitempty" require:"true"`
	// 说话人code
	SpeakerCode *string `json:"speaker_code,omitempty" xml:"speaker_code,omitempty" require:"true"`
	// 播报文本（一千字以内），支持SSML
	Text *string `json:"text,omitempty" xml:"text,omitempty" require:"true"`
	// 音量（0~100，默认50）
	Volume *int64 `json:"volume,omitempty" xml:"volume,omitempty"`
	// 语速（-50~50，默认 0）
	Speed *int64 `json:"speed,omitempty" xml:"speed,omitempty"`
	// 音调（-50~50，默认 0）
	Tone *int64 `json:"tone,omitempty" xml:"tone,omitempty"`
	// 背景图片Url，需要公网可访问
	BackgroundUrl *string `json:"background_url,omitempty" xml:"background_url,omitempty" require:"true"`
	// 分辨率，暂只支持1080
	Resolution *string `json:"resolution,omitempty" xml:"resolution,omitempty" require:"true"`
	// 画布比例，16:9/9:16
	Radio *string `json:"radio,omitempty" xml:"radio,omitempty" require:"true"`
	// 数字人位置大小信息，以左上角为起始坐标，向右向下为正值
	HumanConfig *PositionSizeInfo `json:"human_config,omitempty" xml:"human_config,omitempty" require:"true"`
}

func (s SubmitAvatarVideoRequest) String() string {
	return tea.Prettify(s)
}

func (s SubmitAvatarVideoRequest) GoString() string {
	return s.String()
}

func (s *SubmitAvatarVideoRequest) SetAuthToken(v string) *SubmitAvatarVideoRequest {
	s.AuthToken = &v
	return s
}

func (s *SubmitAvatarVideoRequest) SetProductInstanceId(v string) *SubmitAvatarVideoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SubmitAvatarVideoRequest) SetName(v string) *SubmitAvatarVideoRequest {
	s.Name = &v
	return s
}

func (s *SubmitAvatarVideoRequest) SetAvatarId(v string) *SubmitAvatarVideoRequest {
	s.AvatarId = &v
	return s
}

func (s *SubmitAvatarVideoRequest) SetSpeakerCode(v string) *SubmitAvatarVideoRequest {
	s.SpeakerCode = &v
	return s
}

func (s *SubmitAvatarVideoRequest) SetText(v string) *SubmitAvatarVideoRequest {
	s.Text = &v
	return s
}

func (s *SubmitAvatarVideoRequest) SetVolume(v int64) *SubmitAvatarVideoRequest {
	s.Volume = &v
	return s
}

func (s *SubmitAvatarVideoRequest) SetSpeed(v int64) *SubmitAvatarVideoRequest {
	s.Speed = &v
	return s
}

func (s *SubmitAvatarVideoRequest) SetTone(v int64) *SubmitAvatarVideoRequest {
	s.Tone = &v
	return s
}

func (s *SubmitAvatarVideoRequest) SetBackgroundUrl(v string) *SubmitAvatarVideoRequest {
	s.BackgroundUrl = &v
	return s
}

func (s *SubmitAvatarVideoRequest) SetResolution(v string) *SubmitAvatarVideoRequest {
	s.Resolution = &v
	return s
}

func (s *SubmitAvatarVideoRequest) SetRadio(v string) *SubmitAvatarVideoRequest {
	s.Radio = &v
	return s
}

func (s *SubmitAvatarVideoRequest) SetHumanConfig(v *PositionSizeInfo) *SubmitAvatarVideoRequest {
	s.HumanConfig = v
	return s
}

type SubmitAvatarVideoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 视频任务id
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty"`
}

func (s SubmitAvatarVideoResponse) String() string {
	return tea.Prettify(s)
}

func (s SubmitAvatarVideoResponse) GoString() string {
	return s.String()
}

func (s *SubmitAvatarVideoResponse) SetReqMsgId(v string) *SubmitAvatarVideoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SubmitAvatarVideoResponse) SetResultCode(v string) *SubmitAvatarVideoResponse {
	s.ResultCode = &v
	return s
}

func (s *SubmitAvatarVideoResponse) SetResultMsg(v string) *SubmitAvatarVideoResponse {
	s.ResultMsg = &v
	return s
}

func (s *SubmitAvatarVideoResponse) SetTaskId(v string) *SubmitAvatarVideoResponse {
	s.TaskId = &v
	return s
}

type QueryAvatarVideoRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 视频任务id
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty" require:"true"`
}

func (s QueryAvatarVideoRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAvatarVideoRequest) GoString() string {
	return s.String()
}

func (s *QueryAvatarVideoRequest) SetAuthToken(v string) *QueryAvatarVideoRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAvatarVideoRequest) SetProductInstanceId(v string) *QueryAvatarVideoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAvatarVideoRequest) SetTaskId(v string) *QueryAvatarVideoRequest {
	s.TaskId = &v
	return s
}

type QueryAvatarVideoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 视频任务id
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty"`
	// 视频合成任务状态（EXPORTING：导出中，NORMAL：成功，FAILED：失败）
	VideoStatus *string `json:"video_status,omitempty" xml:"video_status,omitempty"`
	// 视频url
	VideoUrl *string `json:"video_url,omitempty" xml:"video_url,omitempty"`
	// 提示消息
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
}

func (s QueryAvatarVideoResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAvatarVideoResponse) GoString() string {
	return s.String()
}

func (s *QueryAvatarVideoResponse) SetReqMsgId(v string) *QueryAvatarVideoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAvatarVideoResponse) SetResultCode(v string) *QueryAvatarVideoResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAvatarVideoResponse) SetResultMsg(v string) *QueryAvatarVideoResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAvatarVideoResponse) SetTaskId(v string) *QueryAvatarVideoResponse {
	s.TaskId = &v
	return s
}

func (s *QueryAvatarVideoResponse) SetVideoStatus(v string) *QueryAvatarVideoResponse {
	s.VideoStatus = &v
	return s
}

func (s *QueryAvatarVideoResponse) SetVideoUrl(v string) *QueryAvatarVideoResponse {
	s.VideoUrl = &v
	return s
}

func (s *QueryAvatarVideoResponse) SetMessage(v string) *QueryAvatarVideoResponse {
	s.Message = &v
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
				"sdk_version":      tea.String("1.0.7"),
				"_prod_code":       tea.String("ANTVERSE"),
				"_prod_channel":    tea.String("undefined"),
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
 * Description: 交互视频获取,如:输入问题,返回视频答案
 * Summary: 交互视频获取
 */
func (client *Client) GetInteractvideo(request *GetInteractvideoRequest) (_result *GetInteractvideoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetInteractvideoResponse{}
	_body, _err := client.GetInteractvideoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 交互视频获取,如:输入问题,返回视频答案
 * Summary: 交互视频获取
 */
func (client *Client) GetInteractvideoEx(request *GetInteractvideoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetInteractvideoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetInteractvideoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.antverse.interactvideo.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 2D数字人合成
 * Summary: 2D虚拟人数字合成
 */
func (client *Client) SubmitAvatarVideo(request *SubmitAvatarVideoRequest) (_result *SubmitAvatarVideoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SubmitAvatarVideoResponse{}
	_body, _err := client.SubmitAvatarVideoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 2D数字人合成
 * Summary: 2D虚拟人数字合成
 */
func (client *Client) SubmitAvatarVideoEx(request *SubmitAvatarVideoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SubmitAvatarVideoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SubmitAvatarVideoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.antverse.avatar.video.submit"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 2D数字人视频查询
 * Summary: 2D数字人视频查询
 */
func (client *Client) QueryAvatarVideo(request *QueryAvatarVideoRequest) (_result *QueryAvatarVideoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAvatarVideoResponse{}
	_body, _err := client.QueryAvatarVideoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 2D数字人视频查询
 * Summary: 2D数字人视频查询
 */
func (client *Client) QueryAvatarVideoEx(request *QueryAvatarVideoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAvatarVideoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAvatarVideoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.antverse.avatar.video.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
