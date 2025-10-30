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

type QueryVoiceserviceQuerycalldetailRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 分配的租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 分配的业务code
	InstanceCode *string `json:"instance_code,omitempty" xml:"instance_code,omitempty" require:"true"`
	// 通话的唯一识别 ID。调用外呼接口发起通话后，返回参数中会携带 CallId。
	CallId *string `json:"call_id,omitempty" xml:"call_id,omitempty" require:"true"`
	// 通话发生的时间。格式为 Unix 时间戳，单位：毫秒。
	QueryDate *string `json:"query_date,omitempty" xml:"query_date,omitempty" require:"true"`
}

func (s QueryVoiceserviceQuerycalldetailRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryVoiceserviceQuerycalldetailRequest) GoString() string {
	return s.String()
}

func (s *QueryVoiceserviceQuerycalldetailRequest) SetAuthToken(v string) *QueryVoiceserviceQuerycalldetailRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryVoiceserviceQuerycalldetailRequest) SetTenantId(v string) *QueryVoiceserviceQuerycalldetailRequest {
	s.TenantId = &v
	return s
}

func (s *QueryVoiceserviceQuerycalldetailRequest) SetInstanceCode(v string) *QueryVoiceserviceQuerycalldetailRequest {
	s.InstanceCode = &v
	return s
}

func (s *QueryVoiceserviceQuerycalldetailRequest) SetCallId(v string) *QueryVoiceserviceQuerycalldetailRequest {
	s.CallId = &v
	return s
}

func (s *QueryVoiceserviceQuerycalldetailRequest) SetQueryDate(v string) *QueryVoiceserviceQuerycalldetailRequest {
	s.QueryDate = &v
	return s
}

type QueryVoiceserviceQuerycalldetailResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 请求状态码。
	// ● 返回 OK 代表请求成功。
	Code *string `json:"code,omitempty" xml:"code,omitempty"`
	// 状态码的描述。
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 返回的呼叫详情。JSON 格式。以下字段仅供参考，以具体返回详情为准。
	// ● caller：主叫号码。
	// ● startDate：通话开始时间。
	// ● stateDesc：通话状态描述。
	// ● duration：通话时长。单位：秒。0：用户未接通。
	// ● callerShowNumber：被叫显号。
	// ● gmtCreate：通话请求的接收时间。
	// ● state：通话状态。通话状态是运营商实时返回的，更多状态信息，请参见通话结果状态码。
	// ● endDate：通话结束时间。
	// ● calleeShowNumber：被叫显号。
	// ● callee：被叫号码。
	// ● aRingTime：a 路响铃开始时间。格式：yyyy-MM-dd HH:mm:ss。
	// ● aEndTime：a 路响铃结束时间。格式：yyyy-MM-dd HH:mm:ss。
	// （待确认）
	// ● bRingTime：b 路响铃开始时间。格式：yyyy-MM-dd HH:mm:ss。
	// ● bEndTime：b 路响铃结束时间。格式：yyyy-MM-dd HH:mm:ss。
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
	// 本次调用请求的 ID，是由阿里云为该请求生成的唯一标识符，可用于排查和定位问题。
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
}

func (s QueryVoiceserviceQuerycalldetailResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryVoiceserviceQuerycalldetailResponse) GoString() string {
	return s.String()
}

func (s *QueryVoiceserviceQuerycalldetailResponse) SetReqMsgId(v string) *QueryVoiceserviceQuerycalldetailResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryVoiceserviceQuerycalldetailResponse) SetResultCode(v string) *QueryVoiceserviceQuerycalldetailResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryVoiceserviceQuerycalldetailResponse) SetResultMsg(v string) *QueryVoiceserviceQuerycalldetailResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryVoiceserviceQuerycalldetailResponse) SetCode(v string) *QueryVoiceserviceQuerycalldetailResponse {
	s.Code = &v
	return s
}

func (s *QueryVoiceserviceQuerycalldetailResponse) SetMessage(v string) *QueryVoiceserviceQuerycalldetailResponse {
	s.Message = &v
	return s
}

func (s *QueryVoiceserviceQuerycalldetailResponse) SetData(v string) *QueryVoiceserviceQuerycalldetailResponse {
	s.Data = &v
	return s
}

func (s *QueryVoiceserviceQuerycalldetailResponse) SetRequestId(v string) *QueryVoiceserviceQuerycalldetailResponse {
	s.RequestId = &v
	return s
}

type SendVoiceserviceSinglecallRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 分配的租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 分配的业务code
	InstanceCode *string `json:"instance_code,omitempty" xml:"instance_code,omitempty" require:"true"`
	// 分配的主叫号码
	CalledShowNumber *string `json:"called_show_number,omitempty" xml:"called_show_number,omitempty" require:"true"`
	// 被叫用户号码
	CalledNumber *string `json:"called_number,omitempty" xml:"called_number,omitempty" require:"true"`
	// 播报文本内容
	Context *string `json:"context,omitempty" xml:"context,omitempty" require:"true"`
	// 录音字段
	VoiceCode *string `json:"voice_code,omitempty" xml:"voice_code,omitempty"`
	// TTS 变量播放时的声音风格。
	TtsStyle *string `json:"tts_style,omitempty" xml:"tts_style,omitempty" require:"true"`
	// TTS 变量播放的音量。取值范围：0~100，默认值为 50。
	TtsVolume *int64 `json:"tts_volume,omitempty" xml:"tts_volume,omitempty"`
	// TTS 变量播放时的声音速度。取值范围：0.5~2，默认值为 1。
	TtsSpeed *int64 `json:"tts_speed,omitempty" xml:"tts_speed,omitempty"`
	// 播放次数。取值范围：1~3，默认取值 3。
	PlayTimes *int64 `json:"play_times,omitempty" xml:"play_times,omitempty"`
	// 否	发起请求时预留给调用方的自定义 ID，最终会通过回执消息将此 ID 带回给调用方。
	// 字符串类型，长度限制为 1~128 个字符。
	OutId *string `json:"out_id,omitempty" xml:"out_id,omitempty"`
}

func (s SendVoiceserviceSinglecallRequest) String() string {
	return tea.Prettify(s)
}

func (s SendVoiceserviceSinglecallRequest) GoString() string {
	return s.String()
}

func (s *SendVoiceserviceSinglecallRequest) SetAuthToken(v string) *SendVoiceserviceSinglecallRequest {
	s.AuthToken = &v
	return s
}

func (s *SendVoiceserviceSinglecallRequest) SetTenantId(v string) *SendVoiceserviceSinglecallRequest {
	s.TenantId = &v
	return s
}

func (s *SendVoiceserviceSinglecallRequest) SetInstanceCode(v string) *SendVoiceserviceSinglecallRequest {
	s.InstanceCode = &v
	return s
}

func (s *SendVoiceserviceSinglecallRequest) SetCalledShowNumber(v string) *SendVoiceserviceSinglecallRequest {
	s.CalledShowNumber = &v
	return s
}

func (s *SendVoiceserviceSinglecallRequest) SetCalledNumber(v string) *SendVoiceserviceSinglecallRequest {
	s.CalledNumber = &v
	return s
}

func (s *SendVoiceserviceSinglecallRequest) SetContext(v string) *SendVoiceserviceSinglecallRequest {
	s.Context = &v
	return s
}

func (s *SendVoiceserviceSinglecallRequest) SetVoiceCode(v string) *SendVoiceserviceSinglecallRequest {
	s.VoiceCode = &v
	return s
}

func (s *SendVoiceserviceSinglecallRequest) SetTtsStyle(v string) *SendVoiceserviceSinglecallRequest {
	s.TtsStyle = &v
	return s
}

func (s *SendVoiceserviceSinglecallRequest) SetTtsVolume(v int64) *SendVoiceserviceSinglecallRequest {
	s.TtsVolume = &v
	return s
}

func (s *SendVoiceserviceSinglecallRequest) SetTtsSpeed(v int64) *SendVoiceserviceSinglecallRequest {
	s.TtsSpeed = &v
	return s
}

func (s *SendVoiceserviceSinglecallRequest) SetPlayTimes(v int64) *SendVoiceserviceSinglecallRequest {
	s.PlayTimes = &v
	return s
}

func (s *SendVoiceserviceSinglecallRequest) SetOutId(v string) *SendVoiceserviceSinglecallRequest {
	s.OutId = &v
	return s
}

type SendVoiceserviceSinglecallResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 请求状态码。
	// 返回 OK 代表请求成功。
	// 其他错误码，请参考API错误码
	Code *string `json:"code,omitempty" xml:"code,omitempty"`
	// 状态码的描述。
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 请求 ID
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
	// 此次通话的唯一回执 ID。
	// 可以使用此 CallId，调用查询通话详情接口查询呼叫详情。
	CallId *string `json:"call_id,omitempty" xml:"call_id,omitempty"`
}

func (s SendVoiceserviceSinglecallResponse) String() string {
	return tea.Prettify(s)
}

func (s SendVoiceserviceSinglecallResponse) GoString() string {
	return s.String()
}

func (s *SendVoiceserviceSinglecallResponse) SetReqMsgId(v string) *SendVoiceserviceSinglecallResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SendVoiceserviceSinglecallResponse) SetResultCode(v string) *SendVoiceserviceSinglecallResponse {
	s.ResultCode = &v
	return s
}

func (s *SendVoiceserviceSinglecallResponse) SetResultMsg(v string) *SendVoiceserviceSinglecallResponse {
	s.ResultMsg = &v
	return s
}

func (s *SendVoiceserviceSinglecallResponse) SetCode(v string) *SendVoiceserviceSinglecallResponse {
	s.Code = &v
	return s
}

func (s *SendVoiceserviceSinglecallResponse) SetMessage(v string) *SendVoiceserviceSinglecallResponse {
	s.Message = &v
	return s
}

func (s *SendVoiceserviceSinglecallResponse) SetRequestId(v string) *SendVoiceserviceSinglecallResponse {
	s.RequestId = &v
	return s
}

func (s *SendVoiceserviceSinglecallResponse) SetCallId(v string) *SendVoiceserviceSinglecallResponse {
	s.CallId = &v
	return s
}

type SendVoiceserviceSmartcallRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 分配的租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 分配的业务code
	InstanceCode *string `json:"instance_code,omitempty" xml:"instance_code,omitempty" require:"true"`
	// 分配的主叫号码
	CalledShowNumber *string `json:"called_show_number,omitempty" xml:"called_show_number,omitempty" require:"true"`
	// 被叫用户号码
	CalledNumber *string `json:"called_number,omitempty" xml:"called_number,omitempty" require:"true"`
	// 播报文本内容
	Context *string `json:"context,omitempty" xml:"context,omitempty" require:"true"`
	// code
	VoiceCode *string `json:"voice_code,omitempty" xml:"voice_code,omitempty"`
	// 停顿时长。用于设置用户停顿多久表示一句话结束。单位：毫秒，取值范围：300~1200。默认800。非特殊情况不建议调整
	PauseTime *int64 `json:"pause_time,omitempty" xml:"pause_time,omitempty"`
	// 静音时长。用于设置用户多久不说话通话结束。单位：毫秒，取值范围：1000~20000。默认 10000
	MuteTime *int64 `json:"mute_time,omitempty" xml:"mute_time,omitempty"`
	// 当前返回的媒体文件是否可以被打断。默认取值为 true，即可被打断。
	// 如果为 false，即使下一个动作 action_break 为 true，也无法打断当前放音。
	ActionCodeBreak *bool `json:"action_code_break,omitempty" xml:"action_code_break,omitempty"`
	// 基于用户持续说话时长打断。单位：毫秒。
	// 如果当前媒体文件 ActionCodeBreak 为 true，用户持续说话可以打断当前播放。不设置或者为 0，不生效。
	ActionCodeTimeBreak *int64 `json:"action_code_time_break,omitempty" xml:"action_code_time_break,omitempty"`
	// 最大通话时长，超时后自动挂断。单位：秒。
	SessionTimeout *int64 `json:"session_timeout,omitempty" xml:"session_timeout,omitempty"`
	// TTS 变量播放时的声音风格。
	TtsStyle *string `json:"tts_style,omitempty" xml:"tts_style,omitempty" require:"true"`
	// TTS 变量播放的音量。取值范围：0~100，默认值为 50。
	TtsVolume *int64 `json:"tts_volume,omitempty" xml:"tts_volume,omitempty"`
	// TTS 变量播放时的声音速度。取值范围：0.5~2，默认值为 1。
	TtsSpeed *int64 `json:"tts_speed,omitempty" xml:"tts_speed,omitempty"`
	// 用户和机器人对话时播放的背景语音文件 ID。
	BackgroundFileCode *string `json:"background_file_code,omitempty" xml:"background_file_code,omitempty"`
	// 否	发起请求时预留给调用方的自定义 ID，最终会通过回执消息将此 ID 带回给调用方。
	// 字符串类型，长度限制为 1~128 个字符。
	OutId *string `json:"out_id,omitempty" xml:"out_id,omitempty"`
	// 预留给调用方使用的动态扩展 ID。在回调地址中带回，用于客户的开发标识。
	DynamicId *string `json:"dynamic_id,omitempty" xml:"dynamic_id,omitempty"`
	// 是否在后处理中执行 ITN。默认为 false，即不执行。
	// 设置为 true 时，中文数字将转为阿拉伯数字输出。
	EnableITN *bool `json:"enable_i_t_n,omitempty" xml:"enable_i_t_n,omitempty"`
}

func (s SendVoiceserviceSmartcallRequest) String() string {
	return tea.Prettify(s)
}

func (s SendVoiceserviceSmartcallRequest) GoString() string {
	return s.String()
}

func (s *SendVoiceserviceSmartcallRequest) SetAuthToken(v string) *SendVoiceserviceSmartcallRequest {
	s.AuthToken = &v
	return s
}

func (s *SendVoiceserviceSmartcallRequest) SetTenantId(v string) *SendVoiceserviceSmartcallRequest {
	s.TenantId = &v
	return s
}

func (s *SendVoiceserviceSmartcallRequest) SetInstanceCode(v string) *SendVoiceserviceSmartcallRequest {
	s.InstanceCode = &v
	return s
}

func (s *SendVoiceserviceSmartcallRequest) SetCalledShowNumber(v string) *SendVoiceserviceSmartcallRequest {
	s.CalledShowNumber = &v
	return s
}

func (s *SendVoiceserviceSmartcallRequest) SetCalledNumber(v string) *SendVoiceserviceSmartcallRequest {
	s.CalledNumber = &v
	return s
}

func (s *SendVoiceserviceSmartcallRequest) SetContext(v string) *SendVoiceserviceSmartcallRequest {
	s.Context = &v
	return s
}

func (s *SendVoiceserviceSmartcallRequest) SetVoiceCode(v string) *SendVoiceserviceSmartcallRequest {
	s.VoiceCode = &v
	return s
}

func (s *SendVoiceserviceSmartcallRequest) SetPauseTime(v int64) *SendVoiceserviceSmartcallRequest {
	s.PauseTime = &v
	return s
}

func (s *SendVoiceserviceSmartcallRequest) SetMuteTime(v int64) *SendVoiceserviceSmartcallRequest {
	s.MuteTime = &v
	return s
}

func (s *SendVoiceserviceSmartcallRequest) SetActionCodeBreak(v bool) *SendVoiceserviceSmartcallRequest {
	s.ActionCodeBreak = &v
	return s
}

func (s *SendVoiceserviceSmartcallRequest) SetActionCodeTimeBreak(v int64) *SendVoiceserviceSmartcallRequest {
	s.ActionCodeTimeBreak = &v
	return s
}

func (s *SendVoiceserviceSmartcallRequest) SetSessionTimeout(v int64) *SendVoiceserviceSmartcallRequest {
	s.SessionTimeout = &v
	return s
}

func (s *SendVoiceserviceSmartcallRequest) SetTtsStyle(v string) *SendVoiceserviceSmartcallRequest {
	s.TtsStyle = &v
	return s
}

func (s *SendVoiceserviceSmartcallRequest) SetTtsVolume(v int64) *SendVoiceserviceSmartcallRequest {
	s.TtsVolume = &v
	return s
}

func (s *SendVoiceserviceSmartcallRequest) SetTtsSpeed(v int64) *SendVoiceserviceSmartcallRequest {
	s.TtsSpeed = &v
	return s
}

func (s *SendVoiceserviceSmartcallRequest) SetBackgroundFileCode(v string) *SendVoiceserviceSmartcallRequest {
	s.BackgroundFileCode = &v
	return s
}

func (s *SendVoiceserviceSmartcallRequest) SetOutId(v string) *SendVoiceserviceSmartcallRequest {
	s.OutId = &v
	return s
}

func (s *SendVoiceserviceSmartcallRequest) SetDynamicId(v string) *SendVoiceserviceSmartcallRequest {
	s.DynamicId = &v
	return s
}

func (s *SendVoiceserviceSmartcallRequest) SetEnableITN(v bool) *SendVoiceserviceSmartcallRequest {
	s.EnableITN = &v
	return s
}

type SendVoiceserviceSmartcallResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 请求状态码。
	// ● 返回 OK 代表请求成功。
	Code *string `json:"code,omitempty" xml:"code,omitempty"`
	// 状态码的描述。
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 请求 ID。
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
	// 此次通话的唯一回执 ID。
	// 可以使用此 CallId，调用查询通话详情接口查询呼叫详情。
	CallId *string `json:"call_id,omitempty" xml:"call_id,omitempty"`
}

func (s SendVoiceserviceSmartcallResponse) String() string {
	return tea.Prettify(s)
}

func (s SendVoiceserviceSmartcallResponse) GoString() string {
	return s.String()
}

func (s *SendVoiceserviceSmartcallResponse) SetReqMsgId(v string) *SendVoiceserviceSmartcallResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SendVoiceserviceSmartcallResponse) SetResultCode(v string) *SendVoiceserviceSmartcallResponse {
	s.ResultCode = &v
	return s
}

func (s *SendVoiceserviceSmartcallResponse) SetResultMsg(v string) *SendVoiceserviceSmartcallResponse {
	s.ResultMsg = &v
	return s
}

func (s *SendVoiceserviceSmartcallResponse) SetCode(v string) *SendVoiceserviceSmartcallResponse {
	s.Code = &v
	return s
}

func (s *SendVoiceserviceSmartcallResponse) SetMessage(v string) *SendVoiceserviceSmartcallResponse {
	s.Message = &v
	return s
}

func (s *SendVoiceserviceSmartcallResponse) SetRequestId(v string) *SendVoiceserviceSmartcallResponse {
	s.RequestId = &v
	return s
}

func (s *SendVoiceserviceSmartcallResponse) SetCallId(v string) *SendVoiceserviceSmartcallResponse {
	s.CallId = &v
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
				"_prod_code":       tea.String("DTCALLAGENT"),
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
 * Description: 通过租户ID、业务Code、通话的唯一识别ID以及通话时间查询呼叫详情数据
 * Summary: 呼叫详情查询
 */
func (client *Client) QueryVoiceserviceQuerycalldetail(request *QueryVoiceserviceQuerycalldetailRequest) (_result *QueryVoiceserviceQuerycalldetailResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryVoiceserviceQuerycalldetailResponse{}
	_body, _err := client.QueryVoiceserviceQuerycalldetailEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 通过租户ID、业务Code、通话的唯一识别ID以及通话时间查询呼叫详情数据
 * Summary: 呼叫详情查询
 */
func (client *Client) QueryVoiceserviceQuerycalldetailEx(request *QueryVoiceserviceQuerycalldetailRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryVoiceserviceQuerycalldetailResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryVoiceserviceQuerycalldetailResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.dtcallagent.voiceservice.querycalldetail.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 通知类外呼
 * Summary: 通知类外呼
 */
func (client *Client) SendVoiceserviceSinglecall(request *SendVoiceserviceSinglecallRequest) (_result *SendVoiceserviceSinglecallResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SendVoiceserviceSinglecallResponse{}
	_body, _err := client.SendVoiceserviceSinglecallEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 通知类外呼
 * Summary: 通知类外呼
 */
func (client *Client) SendVoiceserviceSinglecallEx(request *SendVoiceserviceSinglecallRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SendVoiceserviceSinglecallResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SendVoiceserviceSinglecallResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.dtcallagent.voiceservice.singlecall.send"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 说明需要配合接入智能外呼回调接口联合使用，语音平台发起呼叫后会把转换后的语音文本回传给接入方，接入方把下一步的执行动作返回给语音平台
 * Summary: 交互类外呼
 */
func (client *Client) SendVoiceserviceSmartcall(request *SendVoiceserviceSmartcallRequest) (_result *SendVoiceserviceSmartcallResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SendVoiceserviceSmartcallResponse{}
	_body, _err := client.SendVoiceserviceSmartcallEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 说明需要配合接入智能外呼回调接口联合使用，语音平台发起呼叫后会把转换后的语音文本回传给接入方，接入方把下一步的执行动作返回给语音平台
 * Summary: 交互类外呼
 */
func (client *Client) SendVoiceserviceSmartcallEx(request *SendVoiceserviceSmartcallRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SendVoiceserviceSmartcallResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SendVoiceserviceSmartcallResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.dtcallagent.voiceservice.smartcall.send"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
