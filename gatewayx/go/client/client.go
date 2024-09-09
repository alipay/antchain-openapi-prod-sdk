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

// 键值对
type XNameValuePair struct {
	// 键名
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 键值
	Value *string `json:"value,omitempty" xml:"value,omitempty" require:"true"`
}

func (s XNameValuePair) String() string {
	return tea.Prettify(s)
}

func (s XNameValuePair) GoString() string {
	return s.String()
}

func (s *XNameValuePair) SetName(v string) *XNameValuePair {
	s.Name = &v
	return s
}

func (s *XNameValuePair) SetValue(v string) *XNameValuePair {
	s.Value = &v
	return s
}

// 调用者信息
type XInvokerInfo struct {
	// 调用渠道
	InvokeChannel *string `json:"invoke_channel,omitempty" xml:"invoke_channel,omitempty" require:"true"`
	// 渠道的用户id
	InvokeChannelUid *string `json:"invoke_channel_uid,omitempty" xml:"invoke_channel_uid,omitempty" require:"true"`
	// 8位金融云租户ID
	InvokeTenant *string `json:"invoke_tenant,omitempty" xml:"invoke_tenant,omitempty" require:"true"`
	// 调用者用户金融云id
	InvokeUserId *string `json:"invoke_user_id,omitempty" xml:"invoke_user_id,omitempty" require:"true"`
}

func (s XInvokerInfo) String() string {
	return tea.Prettify(s)
}

func (s XInvokerInfo) GoString() string {
	return s.String()
}

func (s *XInvokerInfo) SetInvokeChannel(v string) *XInvokerInfo {
	s.InvokeChannel = &v
	return s
}

func (s *XInvokerInfo) SetInvokeChannelUid(v string) *XInvokerInfo {
	s.InvokeChannelUid = &v
	return s
}

func (s *XInvokerInfo) SetInvokeTenant(v string) *XInvokerInfo {
	s.InvokeTenant = &v
	return s
}

func (s *XInvokerInfo) SetInvokeUserId(v string) *XInvokerInfo {
	s.InvokeUserId = &v
	return s
}

type CreateBizeventMessageRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 业务消息内容，json格式
	BizContent *string `json:"biz_content,omitempty" xml:"biz_content,omitempty" require:"true"`
	// 日期对应的timestamp
	UtcTimestamp *int64 `json:"utc_timestamp,omitempty" xml:"utc_timestamp,omitempty" require:"true"`
	// 消息发送过程中的唯一ID
	MsgId *string `json:"msg_id,omitempty" xml:"msg_id,omitempty" require:"true"`
	// 消息事件编码
	MsgKey *string `json:"msg_key,omitempty" xml:"msg_key,omitempty" require:"true"`
	// 消费方id，例如appId，tenantId，可以多个，多个之间使用","分割
	ConsumerId *string `json:"consumer_id,omitempty" xml:"consumer_id,omitempty" require:"true"`
	// 消费者类型，例如TENANT, APP
	ConsumerType *string `json:"consumer_type,omitempty" xml:"consumer_type,omitempty" require:"true"`
	// 二级消息主题,订阅方可以过滤消息
	Tags *string `json:"tags,omitempty" xml:"tags,omitempty"`
	// 消息类型，1：点对点，2: 广播消息
	MsgType *string `json:"msg_type,omitempty" xml:"msg_type,omitempty" require:"true"`
	// 上下文透传的自定义header
	Header *string `json:"header,omitempty" xml:"header,omitempty"`
}

func (s CreateBizeventMessageRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateBizeventMessageRequest) GoString() string {
	return s.String()
}

func (s *CreateBizeventMessageRequest) SetAuthToken(v string) *CreateBizeventMessageRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateBizeventMessageRequest) SetBizContent(v string) *CreateBizeventMessageRequest {
	s.BizContent = &v
	return s
}

func (s *CreateBizeventMessageRequest) SetUtcTimestamp(v int64) *CreateBizeventMessageRequest {
	s.UtcTimestamp = &v
	return s
}

func (s *CreateBizeventMessageRequest) SetMsgId(v string) *CreateBizeventMessageRequest {
	s.MsgId = &v
	return s
}

func (s *CreateBizeventMessageRequest) SetMsgKey(v string) *CreateBizeventMessageRequest {
	s.MsgKey = &v
	return s
}

func (s *CreateBizeventMessageRequest) SetConsumerId(v string) *CreateBizeventMessageRequest {
	s.ConsumerId = &v
	return s
}

func (s *CreateBizeventMessageRequest) SetConsumerType(v string) *CreateBizeventMessageRequest {
	s.ConsumerType = &v
	return s
}

func (s *CreateBizeventMessageRequest) SetTags(v string) *CreateBizeventMessageRequest {
	s.Tags = &v
	return s
}

func (s *CreateBizeventMessageRequest) SetMsgType(v string) *CreateBizeventMessageRequest {
	s.MsgType = &v
	return s
}

func (s *CreateBizeventMessageRequest) SetHeader(v string) *CreateBizeventMessageRequest {
	s.Header = &v
	return s
}

type CreateBizeventMessageResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CreateBizeventMessageResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateBizeventMessageResponse) GoString() string {
	return s.String()
}

func (s *CreateBizeventMessageResponse) SetReqMsgId(v string) *CreateBizeventMessageResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateBizeventMessageResponse) SetResultCode(v string) *CreateBizeventMessageResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateBizeventMessageResponse) SetResultMsg(v string) *CreateBizeventMessageResponse {
	s.ResultMsg = &v
	return s
}

type CreateFileUploadRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 上传文件作用的openapi method
	ApiCode *string `json:"api_code,omitempty" xml:"api_code,omitempty" require:"true"`
	// 文件标签，多个标签;分割
	FileLabel *string `json:"file_label,omitempty" xml:"file_label,omitempty" maxLength:"100"`
	// 自定义的文件元数据
	FileMetadata *string `json:"file_metadata,omitempty" xml:"file_metadata,omitempty" maxLength:"1000"`
	// 文件名，不传则随机生成文件名
	FileName *string `json:"file_name,omitempty" xml:"file_name,omitempty" maxLength:"100"`
	// 文件的多媒体类型
	MimeType *string `json:"mime_type,omitempty" xml:"mime_type,omitempty"`
	// 产品方的api归属集群，即productInstanceId
	ApiCluster *string `json:"api_cluster,omitempty" xml:"api_cluster,omitempty"`
}

func (s CreateFileUploadRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateFileUploadRequest) GoString() string {
	return s.String()
}

func (s *CreateFileUploadRequest) SetAuthToken(v string) *CreateFileUploadRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateFileUploadRequest) SetApiCode(v string) *CreateFileUploadRequest {
	s.ApiCode = &v
	return s
}

func (s *CreateFileUploadRequest) SetFileLabel(v string) *CreateFileUploadRequest {
	s.FileLabel = &v
	return s
}

func (s *CreateFileUploadRequest) SetFileMetadata(v string) *CreateFileUploadRequest {
	s.FileMetadata = &v
	return s
}

func (s *CreateFileUploadRequest) SetFileName(v string) *CreateFileUploadRequest {
	s.FileName = &v
	return s
}

func (s *CreateFileUploadRequest) SetMimeType(v string) *CreateFileUploadRequest {
	s.MimeType = &v
	return s
}

func (s *CreateFileUploadRequest) SetApiCluster(v string) *CreateFileUploadRequest {
	s.ApiCluster = &v
	return s
}

type CreateFileUploadResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 上传有效期
	ExpiredTime *string `json:"expired_time,omitempty" xml:"expired_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 32位文件唯一id
	FileId *string `json:"file_id,omitempty" xml:"file_id,omitempty"`
	// 放入http请求头里
	UploadHeaders []*XNameValuePair `json:"upload_headers,omitempty" xml:"upload_headers,omitempty" type:"Repeated"`
	// 文件上传地址
	UploadUrl *string `json:"upload_url,omitempty" xml:"upload_url,omitempty"`
}

func (s CreateFileUploadResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateFileUploadResponse) GoString() string {
	return s.String()
}

func (s *CreateFileUploadResponse) SetReqMsgId(v string) *CreateFileUploadResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateFileUploadResponse) SetResultCode(v string) *CreateFileUploadResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateFileUploadResponse) SetResultMsg(v string) *CreateFileUploadResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateFileUploadResponse) SetExpiredTime(v string) *CreateFileUploadResponse {
	s.ExpiredTime = &v
	return s
}

func (s *CreateFileUploadResponse) SetFileId(v string) *CreateFileUploadResponse {
	s.FileId = &v
	return s
}

func (s *CreateFileUploadResponse) SetUploadHeaders(v []*XNameValuePair) *CreateFileUploadResponse {
	s.UploadHeaders = v
	return s
}

func (s *CreateFileUploadResponse) SetUploadUrl(v string) *CreateFileUploadResponse {
	s.UploadUrl = &v
	return s
}

type GetFileDownloadRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 文件唯一id
	FileId *string `json:"file_id,omitempty" xml:"file_id,omitempty" require:"true"`
}

func (s GetFileDownloadRequest) String() string {
	return tea.Prettify(s)
}

func (s GetFileDownloadRequest) GoString() string {
	return s.String()
}

func (s *GetFileDownloadRequest) SetAuthToken(v string) *GetFileDownloadRequest {
	s.AuthToken = &v
	return s
}

func (s *GetFileDownloadRequest) SetFileId(v string) *GetFileDownloadRequest {
	s.FileId = &v
	return s
}

type GetFileDownloadResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 创建文件使用的apiCode
	ApiCode *string `json:"api_code,omitempty" xml:"api_code,omitempty"`
	// 文件下载地址
	DownloadUrl *string `json:"download_url,omitempty" xml:"download_url,omitempty"`
	// 下载超时时间
	ExpiredTime *string `json:"expired_time,omitempty" xml:"expired_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 文件标签
	FileLabel *string `json:"file_label,omitempty" xml:"file_label,omitempty"`
	// 请求上传时的自定义元数据
	FileMetadata *string `json:"file_metadata,omitempty" xml:"file_metadata,omitempty"`
	// 文件名
	FileName *string `json:"file_name,omitempty" xml:"file_name,omitempty"`
	// 文件路径
	FilePath *string `json:"file_path,omitempty" xml:"file_path,omitempty"`
	// 文件大小
	FileSize *int64 `json:"file_size,omitempty" xml:"file_size,omitempty"`
	// 上传的调用者信息
	UploadInvoker *XInvokerInfo `json:"upload_invoker,omitempty" xml:"upload_invoker,omitempty"`
}

func (s GetFileDownloadResponse) String() string {
	return tea.Prettify(s)
}

func (s GetFileDownloadResponse) GoString() string {
	return s.String()
}

func (s *GetFileDownloadResponse) SetReqMsgId(v string) *GetFileDownloadResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetFileDownloadResponse) SetResultCode(v string) *GetFileDownloadResponse {
	s.ResultCode = &v
	return s
}

func (s *GetFileDownloadResponse) SetResultMsg(v string) *GetFileDownloadResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetFileDownloadResponse) SetApiCode(v string) *GetFileDownloadResponse {
	s.ApiCode = &v
	return s
}

func (s *GetFileDownloadResponse) SetDownloadUrl(v string) *GetFileDownloadResponse {
	s.DownloadUrl = &v
	return s
}

func (s *GetFileDownloadResponse) SetExpiredTime(v string) *GetFileDownloadResponse {
	s.ExpiredTime = &v
	return s
}

func (s *GetFileDownloadResponse) SetFileLabel(v string) *GetFileDownloadResponse {
	s.FileLabel = &v
	return s
}

func (s *GetFileDownloadResponse) SetFileMetadata(v string) *GetFileDownloadResponse {
	s.FileMetadata = &v
	return s
}

func (s *GetFileDownloadResponse) SetFileName(v string) *GetFileDownloadResponse {
	s.FileName = &v
	return s
}

func (s *GetFileDownloadResponse) SetFilePath(v string) *GetFileDownloadResponse {
	s.FilePath = &v
	return s
}

func (s *GetFileDownloadResponse) SetFileSize(v int64) *GetFileDownloadResponse {
	s.FileSize = &v
	return s
}

func (s *GetFileDownloadResponse) SetUploadInvoker(v *XInvokerInfo) *GetFileDownloadResponse {
	s.UploadInvoker = v
	return s
}

type QueryMessageFailedRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 消息事件编码
	MsgKey *string `json:"msg_key,omitempty" xml:"msg_key,omitempty" require:"true"`
	// 消费方id，例如appId，tenantId 只支持单个传入
	ConsumerId *string `json:"consumer_id,omitempty" xml:"consumer_id,omitempty"`
	// 消费者类型，例如TENANT, APP
	ConsumerType *string `json:"consumer_type,omitempty" xml:"consumer_type,omitempty"`
	// 每页条数，最大支持100条
	PageSize *string `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
	// 第几页
	PageNum *string `json:"page_num,omitempty" xml:"page_num,omitempty" require:"true"`
}

func (s QueryMessageFailedRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryMessageFailedRequest) GoString() string {
	return s.String()
}

func (s *QueryMessageFailedRequest) SetAuthToken(v string) *QueryMessageFailedRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryMessageFailedRequest) SetMsgKey(v string) *QueryMessageFailedRequest {
	s.MsgKey = &v
	return s
}

func (s *QueryMessageFailedRequest) SetConsumerId(v string) *QueryMessageFailedRequest {
	s.ConsumerId = &v
	return s
}

func (s *QueryMessageFailedRequest) SetConsumerType(v string) *QueryMessageFailedRequest {
	s.ConsumerType = &v
	return s
}

func (s *QueryMessageFailedRequest) SetPageSize(v string) *QueryMessageFailedRequest {
	s.PageSize = &v
	return s
}

func (s *QueryMessageFailedRequest) SetPageNum(v string) *QueryMessageFailedRequest {
	s.PageNum = &v
	return s
}

type QueryMessageFailedResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 消息事件编码
	MsgKey *string `json:"msg_key,omitempty" xml:"msg_key,omitempty"`
	// 消费方id，例如appId，tenantId
	ConsumerId *string `json:"consumer_id,omitempty" xml:"consumer_id,omitempty"`
	// 消费者类型，例如TENANT, APP
	ConsumerType *string `json:"consumer_type,omitempty" xml:"consumer_type,omitempty"`
	// 业务消息内容，json格式
	BizContent *string `json:"biz_content,omitempty" xml:"biz_content,omitempty"`
	// 消息发送过程中的唯一ID
	MsgId *string `json:"msg_id,omitempty" xml:"msg_id,omitempty"`
	// 每页条数
	PageSize *string `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// 第几页
	PageNum *string `json:"page_num,omitempty" xml:"page_num,omitempty"`
	// 总条数
	TotalNum *string `json:"total_num,omitempty" xml:"total_num,omitempty"`
}

func (s QueryMessageFailedResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryMessageFailedResponse) GoString() string {
	return s.String()
}

func (s *QueryMessageFailedResponse) SetReqMsgId(v string) *QueryMessageFailedResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryMessageFailedResponse) SetResultCode(v string) *QueryMessageFailedResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryMessageFailedResponse) SetResultMsg(v string) *QueryMessageFailedResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryMessageFailedResponse) SetMsgKey(v string) *QueryMessageFailedResponse {
	s.MsgKey = &v
	return s
}

func (s *QueryMessageFailedResponse) SetConsumerId(v string) *QueryMessageFailedResponse {
	s.ConsumerId = &v
	return s
}

func (s *QueryMessageFailedResponse) SetConsumerType(v string) *QueryMessageFailedResponse {
	s.ConsumerType = &v
	return s
}

func (s *QueryMessageFailedResponse) SetBizContent(v string) *QueryMessageFailedResponse {
	s.BizContent = &v
	return s
}

func (s *QueryMessageFailedResponse) SetMsgId(v string) *QueryMessageFailedResponse {
	s.MsgId = &v
	return s
}

func (s *QueryMessageFailedResponse) SetPageSize(v string) *QueryMessageFailedResponse {
	s.PageSize = &v
	return s
}

func (s *QueryMessageFailedResponse) SetPageNum(v string) *QueryMessageFailedResponse {
	s.PageNum = &v
	return s
}

func (s *QueryMessageFailedResponse) SetTotalNum(v string) *QueryMessageFailedResponse {
	s.TotalNum = &v
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
				"sdk_version":      tea.String("1.0.10"),
				"_prod_code":       tea.String("GATEWAYX"),
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
 * Description: 接收业务事件消息，并将相关消息投递给对应的接手方
 * Summary: 事件消息创建
 */
func (client *Client) CreateBizeventMessage(request *CreateBizeventMessageRequest) (_result *CreateBizeventMessageResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateBizeventMessageResponse{}
	_body, _err := client.CreateBizeventMessageEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 接收业务事件消息，并将相关消息投递给对应的接手方
 * Summary: 事件消息创建
 */
func (client *Client) CreateBizeventMessageEx(request *CreateBizeventMessageRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateBizeventMessageResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateBizeventMessageResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.gatewayx.bizevent.message.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建HTTP PUT提交的文件上传
 * Summary: 文件上传创建
 */
func (client *Client) CreateFileUpload(request *CreateFileUploadRequest) (_result *CreateFileUploadResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateFileUploadResponse{}
	_body, _err := client.CreateFileUploadEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建HTTP PUT提交的文件上传
 * Summary: 文件上传创建
 */
func (client *Client) CreateFileUploadEx(request *CreateFileUploadRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateFileUploadResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateFileUploadResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.gatewayx.file.upload.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建HTTP GET获取的文件下载
 * Summary: 下载地址获取
 */
func (client *Client) GetFileDownload(request *GetFileDownloadRequest) (_result *GetFileDownloadResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetFileDownloadResponse{}
	_body, _err := client.GetFileDownloadEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建HTTP GET获取的文件下载
 * Summary: 下载地址获取
 */
func (client *Client) GetFileDownloadEx(request *GetFileDownloadRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetFileDownloadResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetFileDownloadResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.gatewayx.file.download.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询最后一次发送仍然失败的消息，重试成功的消息不回在列表中展示
 * Summary: 查询最后一次发送仍然失败的消息
 */
func (client *Client) QueryMessageFailed(request *QueryMessageFailedRequest) (_result *QueryMessageFailedResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryMessageFailedResponse{}
	_body, _err := client.QueryMessageFailedEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询最后一次发送仍然失败的消息，重试成功的消息不回在列表中展示
 * Summary: 查询最后一次发送仍然失败的消息
 */
func (client *Client) QueryMessageFailedEx(request *QueryMessageFailedRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryMessageFailedResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryMessageFailedResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.gatewayx.message.failed.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
