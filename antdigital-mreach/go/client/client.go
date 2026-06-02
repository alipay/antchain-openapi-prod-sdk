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

// 短信发送详情
type SmsSendDetail struct {
	// 错误码
	ErrCode *string `json:"err_code,omitempty" xml:"err_code,omitempty" require:"true"`
	// 接受日期
	ReceiveDate *string `json:"receive_date,omitempty" xml:"receive_date,omitempty" require:"true"`
	// 发送日期
	SendDate *string `json:"send_date,omitempty" xml:"send_date,omitempty" require:"true"`
	// 接收短信的手机号码
	PhoneNumber *string `json:"phone_number,omitempty" xml:"phone_number,omitempty" require:"true"`
	// 短信内容
	Content *string `json:"content,omitempty" xml:"content,omitempty" require:"true"`
	// 模板id
	TemplateId *string `json:"template_id,omitempty" xml:"template_id,omitempty" require:"true"`
	// 短信发送状态：1-等待回执，2-发送失败，3-发送成功。
	Status *int64 `json:"status,omitempty" xml:"status,omitempty" require:"true"`
}

func (s SmsSendDetail) String() string {
	return tea.Prettify(s)
}

func (s SmsSendDetail) GoString() string {
	return s.String()
}

func (s *SmsSendDetail) SetErrCode(v string) *SmsSendDetail {
	s.ErrCode = &v
	return s
}

func (s *SmsSendDetail) SetReceiveDate(v string) *SmsSendDetail {
	s.ReceiveDate = &v
	return s
}

func (s *SmsSendDetail) SetSendDate(v string) *SmsSendDetail {
	s.SendDate = &v
	return s
}

func (s *SmsSendDetail) SetPhoneNumber(v string) *SmsSendDetail {
	s.PhoneNumber = &v
	return s
}

func (s *SmsSendDetail) SetContent(v string) *SmsSendDetail {
	s.Content = &v
	return s
}

func (s *SmsSendDetail) SetTemplateId(v string) *SmsSendDetail {
	s.TemplateId = &v
	return s
}

func (s *SmsSendDetail) SetStatus(v int64) *SmsSendDetail {
	s.Status = &v
	return s
}

// 卡片短信查询结果
type CradSmsSendDetail struct {
	// 消息ID
	MessageId *string `json:"message_id,omitempty" xml:"message_id,omitempty" require:"true"`
	// 接收手机号
	PhoneNumber *string `json:"phone_number,omitempty" xml:"phone_number,omitempty" require:"true"`
	// 卡片短信模板ID
	TemplateId *string `json:"template_id,omitempty" xml:"template_id,omitempty" require:"true"`
	// 最终接收类型: CARD_SMS-卡片短信送达, SMS-回落为普通短信送达。
	FinalReceiveType *string `json:"final_receive_type,omitempty" xml:"final_receive_type,omitempty" require:"true"`
	// 短信发送状态。1-等待回执，2-发送失败，3-发送成功。
	Status *int64 `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 错误码（发送失败时返回）
	ErrorCode *string `json:"error_code,omitempty" xml:"error_code,omitempty" require:"true"`
	// 错误描述（发送失败时返回）
	ErrorMessage *string `json:"error_message,omitempty" xml:"error_message,omitempty" require:"true"`
	// 回执时间,yyyy-MM-dd HH:mm:ss格式
	ReportTime *string `json:"report_time,omitempty" xml:"report_time,omitempty" require:"true"`
	// 回落短信正文（仅 finalReceiveType=SMS 时有值）
	Content *string `json:"content,omitempty" xml:"content,omitempty"`
}

func (s CradSmsSendDetail) String() string {
	return tea.Prettify(s)
}

func (s CradSmsSendDetail) GoString() string {
	return s.String()
}

func (s *CradSmsSendDetail) SetMessageId(v string) *CradSmsSendDetail {
	s.MessageId = &v
	return s
}

func (s *CradSmsSendDetail) SetPhoneNumber(v string) *CradSmsSendDetail {
	s.PhoneNumber = &v
	return s
}

func (s *CradSmsSendDetail) SetTemplateId(v string) *CradSmsSendDetail {
	s.TemplateId = &v
	return s
}

func (s *CradSmsSendDetail) SetFinalReceiveType(v string) *CradSmsSendDetail {
	s.FinalReceiveType = &v
	return s
}

func (s *CradSmsSendDetail) SetStatus(v int64) *CradSmsSendDetail {
	s.Status = &v
	return s
}

func (s *CradSmsSendDetail) SetErrorCode(v string) *CradSmsSendDetail {
	s.ErrorCode = &v
	return s
}

func (s *CradSmsSendDetail) SetErrorMessage(v string) *CradSmsSendDetail {
	s.ErrorMessage = &v
	return s
}

func (s *CradSmsSendDetail) SetReportTime(v string) *CradSmsSendDetail {
	s.ReportTime = &v
	return s
}

func (s *CradSmsSendDetail) SetContent(v string) *CradSmsSendDetail {
	s.Content = &v
	return s
}

type PushSmsDomesticRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 业务流水号，最长64字符
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 接收手机号列表
	PhoneNumbers []*string `json:"phone_numbers,omitempty" xml:"phone_numbers,omitempty" require:"true" type:"Repeated"`
	// 模板ID
	TemplateId *string `json:"template_id,omitempty" xml:"template_id,omitempty" require:"true"`
	// 短信签名
	SignName *string `json:"sign_name,omitempty" xml:"sign_name,omitempty" require:"true"`
	// 模板参数
	TemplateParams *string `json:"template_params,omitempty" xml:"template_params,omitempty"`
	// 扩展参数
	ExtraParams *string `json:"extra_params,omitempty" xml:"extra_params,omitempty"`
}

func (s PushSmsDomesticRequest) String() string {
	return tea.Prettify(s)
}

func (s PushSmsDomesticRequest) GoString() string {
	return s.String()
}

func (s *PushSmsDomesticRequest) SetAuthToken(v string) *PushSmsDomesticRequest {
	s.AuthToken = &v
	return s
}

func (s *PushSmsDomesticRequest) SetProductInstanceId(v string) *PushSmsDomesticRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PushSmsDomesticRequest) SetBizId(v string) *PushSmsDomesticRequest {
	s.BizId = &v
	return s
}

func (s *PushSmsDomesticRequest) SetPhoneNumbers(v []*string) *PushSmsDomesticRequest {
	s.PhoneNumbers = v
	return s
}

func (s *PushSmsDomesticRequest) SetTemplateId(v string) *PushSmsDomesticRequest {
	s.TemplateId = &v
	return s
}

func (s *PushSmsDomesticRequest) SetSignName(v string) *PushSmsDomesticRequest {
	s.SignName = &v
	return s
}

func (s *PushSmsDomesticRequest) SetTemplateParams(v string) *PushSmsDomesticRequest {
	s.TemplateParams = &v
	return s
}

func (s *PushSmsDomesticRequest) SetExtraParams(v string) *PushSmsDomesticRequest {
	s.ExtraParams = &v
	return s
}

type PushSmsDomesticResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 消息id
	MessageId *string `json:"message_id,omitempty" xml:"message_id,omitempty"`
	// 短信发送状态。1-等待回执，2-发送失败，3-发送成功。
	Status *int64 `json:"status,omitempty" xml:"status,omitempty"`
}

func (s PushSmsDomesticResponse) String() string {
	return tea.Prettify(s)
}

func (s PushSmsDomesticResponse) GoString() string {
	return s.String()
}

func (s *PushSmsDomesticResponse) SetReqMsgId(v string) *PushSmsDomesticResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PushSmsDomesticResponse) SetResultCode(v string) *PushSmsDomesticResponse {
	s.ResultCode = &v
	return s
}

func (s *PushSmsDomesticResponse) SetResultMsg(v string) *PushSmsDomesticResponse {
	s.ResultMsg = &v
	return s
}

func (s *PushSmsDomesticResponse) SetMessageId(v string) *PushSmsDomesticResponse {
	s.MessageId = &v
	return s
}

func (s *PushSmsDomesticResponse) SetStatus(v int64) *PushSmsDomesticResponse {
	s.Status = &v
	return s
}

type QuerySmsDomesticRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 消息id
	MessageId *string `json:"message_id,omitempty" xml:"message_id,omitempty" require:"true"`
	// 接收短信的手机号码
	PhoneNumber *string `json:"phone_number,omitempty" xml:"phone_number,omitempty"`
	// 短信发送日期，支持查询最近 30 天的记录。格式：yyyyMMdd。
	SendDate *string `json:"send_date,omitempty" xml:"send_date,omitempty" require:"true"`
}

func (s QuerySmsDomesticRequest) String() string {
	return tea.Prettify(s)
}

func (s QuerySmsDomesticRequest) GoString() string {
	return s.String()
}

func (s *QuerySmsDomesticRequest) SetAuthToken(v string) *QuerySmsDomesticRequest {
	s.AuthToken = &v
	return s
}

func (s *QuerySmsDomesticRequest) SetProductInstanceId(v string) *QuerySmsDomesticRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QuerySmsDomesticRequest) SetMessageId(v string) *QuerySmsDomesticRequest {
	s.MessageId = &v
	return s
}

func (s *QuerySmsDomesticRequest) SetPhoneNumber(v string) *QuerySmsDomesticRequest {
	s.PhoneNumber = &v
	return s
}

func (s *QuerySmsDomesticRequest) SetSendDate(v string) *QuerySmsDomesticRequest {
	s.SendDate = &v
	return s
}

type QuerySmsDomesticResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 短信发送详情
	SendDatals []*SmsSendDetail `json:"send_datals,omitempty" xml:"send_datals,omitempty" type:"Repeated"`
}

func (s QuerySmsDomesticResponse) String() string {
	return tea.Prettify(s)
}

func (s QuerySmsDomesticResponse) GoString() string {
	return s.String()
}

func (s *QuerySmsDomesticResponse) SetReqMsgId(v string) *QuerySmsDomesticResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QuerySmsDomesticResponse) SetResultCode(v string) *QuerySmsDomesticResponse {
	s.ResultCode = &v
	return s
}

func (s *QuerySmsDomesticResponse) SetResultMsg(v string) *QuerySmsDomesticResponse {
	s.ResultMsg = &v
	return s
}

func (s *QuerySmsDomesticResponse) SetSendDatals(v []*SmsSendDetail) *QuerySmsDomesticResponse {
	s.SendDatals = v
	return s
}

type PushCardsmsDomesticRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 业务流水号，最长64字符
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 接收手机号列表
	PhoneNumbers []*string `json:"phone_numbers,omitempty" xml:"phone_numbers,omitempty" require:"true" type:"Repeated"`
	// 卡片短信模版ID
	TemplateId *string `json:"template_id,omitempty" xml:"template_id,omitempty" require:"true"`
	// 卡片短信签名
	SignName *string `json:"sign_name,omitempty" xml:"sign_name,omitempty" require:"true"`
	// 卡片动参
	CardParams *string `json:"card_params,omitempty" xml:"card_params,omitempty"`
	// 回落类型: SMS-回落为普通短信, NONE-不回落。
	FallbackType *string `json:"fallback_type,omitempty" xml:"fallback_type,omitempty"`
	// 回落普通短信的平台模板编码。
	FallbackTemplateId *string `json:"fallback_template_id,omitempty" xml:"fallback_template_id,omitempty"`
	// 回落普通短信的模板参数，键值对形式Str
	FallbackParams *string `json:"fallback_params,omitempty" xml:"fallback_params,omitempty"`
	// 卡片短信渲染失败后跳转链接
	CustomUrl *string `json:"custom_url,omitempty" xml:"custom_url,omitempty"`
	// 扩展参数
	ExtraParams *string `json:"extra_params,omitempty" xml:"extra_params,omitempty"`
}

func (s PushCardsmsDomesticRequest) String() string {
	return tea.Prettify(s)
}

func (s PushCardsmsDomesticRequest) GoString() string {
	return s.String()
}

func (s *PushCardsmsDomesticRequest) SetAuthToken(v string) *PushCardsmsDomesticRequest {
	s.AuthToken = &v
	return s
}

func (s *PushCardsmsDomesticRequest) SetProductInstanceId(v string) *PushCardsmsDomesticRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PushCardsmsDomesticRequest) SetBizId(v string) *PushCardsmsDomesticRequest {
	s.BizId = &v
	return s
}

func (s *PushCardsmsDomesticRequest) SetPhoneNumbers(v []*string) *PushCardsmsDomesticRequest {
	s.PhoneNumbers = v
	return s
}

func (s *PushCardsmsDomesticRequest) SetTemplateId(v string) *PushCardsmsDomesticRequest {
	s.TemplateId = &v
	return s
}

func (s *PushCardsmsDomesticRequest) SetSignName(v string) *PushCardsmsDomesticRequest {
	s.SignName = &v
	return s
}

func (s *PushCardsmsDomesticRequest) SetCardParams(v string) *PushCardsmsDomesticRequest {
	s.CardParams = &v
	return s
}

func (s *PushCardsmsDomesticRequest) SetFallbackType(v string) *PushCardsmsDomesticRequest {
	s.FallbackType = &v
	return s
}

func (s *PushCardsmsDomesticRequest) SetFallbackTemplateId(v string) *PushCardsmsDomesticRequest {
	s.FallbackTemplateId = &v
	return s
}

func (s *PushCardsmsDomesticRequest) SetFallbackParams(v string) *PushCardsmsDomesticRequest {
	s.FallbackParams = &v
	return s
}

func (s *PushCardsmsDomesticRequest) SetCustomUrl(v string) *PushCardsmsDomesticRequest {
	s.CustomUrl = &v
	return s
}

func (s *PushCardsmsDomesticRequest) SetExtraParams(v string) *PushCardsmsDomesticRequest {
	s.ExtraParams = &v
	return s
}

type PushCardsmsDomesticResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 卡片消息ID
	MessageId *string `json:"message_id,omitempty" xml:"message_id,omitempty"`
	// 短信发送状态。1-等待回执，2-发送失败，3-发送成功。
	Status *int64 `json:"status,omitempty" xml:"status,omitempty"`
}

func (s PushCardsmsDomesticResponse) String() string {
	return tea.Prettify(s)
}

func (s PushCardsmsDomesticResponse) GoString() string {
	return s.String()
}

func (s *PushCardsmsDomesticResponse) SetReqMsgId(v string) *PushCardsmsDomesticResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PushCardsmsDomesticResponse) SetResultCode(v string) *PushCardsmsDomesticResponse {
	s.ResultCode = &v
	return s
}

func (s *PushCardsmsDomesticResponse) SetResultMsg(v string) *PushCardsmsDomesticResponse {
	s.ResultMsg = &v
	return s
}

func (s *PushCardsmsDomesticResponse) SetMessageId(v string) *PushCardsmsDomesticResponse {
	s.MessageId = &v
	return s
}

func (s *PushCardsmsDomesticResponse) SetStatus(v int64) *PushCardsmsDomesticResponse {
	s.Status = &v
	return s
}

type QueryCardsmsDomesticRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 消息ID
	MessageId *string `json:"message_id,omitempty" xml:"message_id,omitempty" require:"true"`
	// 接收短信的手机号码
	PhoneNumber *string `json:"phone_number,omitempty" xml:"phone_number,omitempty" require:"true"`
}

func (s QueryCardsmsDomesticRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryCardsmsDomesticRequest) GoString() string {
	return s.String()
}

func (s *QueryCardsmsDomesticRequest) SetAuthToken(v string) *QueryCardsmsDomesticRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryCardsmsDomesticRequest) SetProductInstanceId(v string) *QueryCardsmsDomesticRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryCardsmsDomesticRequest) SetMessageId(v string) *QueryCardsmsDomesticRequest {
	s.MessageId = &v
	return s
}

func (s *QueryCardsmsDomesticRequest) SetPhoneNumber(v string) *QueryCardsmsDomesticRequest {
	s.PhoneNumber = &v
	return s
}

type QueryCardsmsDomesticResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 短信发送详情
	SendDatals []*CradSmsSendDetail `json:"send_datals,omitempty" xml:"send_datals,omitempty" type:"Repeated"`
}

func (s QueryCardsmsDomesticResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryCardsmsDomesticResponse) GoString() string {
	return s.String()
}

func (s *QueryCardsmsDomesticResponse) SetReqMsgId(v string) *QueryCardsmsDomesticResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryCardsmsDomesticResponse) SetResultCode(v string) *QueryCardsmsDomesticResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryCardsmsDomesticResponse) SetResultMsg(v string) *QueryCardsmsDomesticResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryCardsmsDomesticResponse) SetSendDatals(v []*CradSmsSendDetail) *QueryCardsmsDomesticResponse {
	s.SendDatals = v
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
				"sdk_version":      tea.String("1.1.1"),
				"_prod_code":       tea.String("MREACH"),
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
 * Description: 短信发送API
 * Summary: 短信发送API
 */
func (client *Client) PushSmsDomestic(request *PushSmsDomesticRequest) (_result *PushSmsDomesticResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PushSmsDomesticResponse{}
	_body, _err := client.PushSmsDomesticEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 短信发送API
 * Summary: 短信发送API
 */
func (client *Client) PushSmsDomesticEx(request *PushSmsDomesticRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PushSmsDomesticResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PushSmsDomesticResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.mreach.sms.domestic.push"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询短信发送详情
 * Summary: 查询短信发送详情
 */
func (client *Client) QuerySmsDomestic(request *QuerySmsDomesticRequest) (_result *QuerySmsDomesticResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QuerySmsDomesticResponse{}
	_body, _err := client.QuerySmsDomesticEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询短信发送详情
 * Summary: 查询短信发送详情
 */
func (client *Client) QuerySmsDomesticEx(request *QuerySmsDomesticRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QuerySmsDomesticResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QuerySmsDomesticResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.mreach.sms.domestic.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: mreach卡片短信发送接口
 * Summary: mreach卡片短信发送接口
 */
func (client *Client) PushCardsmsDomestic(request *PushCardsmsDomesticRequest) (_result *PushCardsmsDomesticResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PushCardsmsDomesticResponse{}
	_body, _err := client.PushCardsmsDomesticEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: mreach卡片短信发送接口
 * Summary: mreach卡片短信发送接口
 */
func (client *Client) PushCardsmsDomesticEx(request *PushCardsmsDomesticRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PushCardsmsDomesticResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PushCardsmsDomesticResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.mreach.cardsms.domestic.push"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: mreach卡片短信查询接口
 * Summary: mreach卡片短信查询接口
 */
func (client *Client) QueryCardsmsDomestic(request *QueryCardsmsDomesticRequest) (_result *QueryCardsmsDomesticResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryCardsmsDomesticResponse{}
	_body, _err := client.QueryCardsmsDomesticEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: mreach卡片短信查询接口
 * Summary: mreach卡片短信查询接口
 */
func (client *Client) QueryCardsmsDomesticEx(request *QueryCardsmsDomesticRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryCardsmsDomesticResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryCardsmsDomesticResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.mreach.cardsms.domestic.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
