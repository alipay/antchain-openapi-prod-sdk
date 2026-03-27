// This file is auto-generated, don't edit it. Thanks.
package client

import (
	rpcutil "github.com/alibabacloud-go/tea-rpc-utils/service"
	util "github.com/alibabacloud-go/tea-utils/v2/service"
	"github.com/alibabacloud-go/tea/tea"
	antchainutil "github.com/antchain-openapi-sdk-go/antchain-util/service"
	"io"
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

type ReceiveRiskplusRfcParamsFileRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 文件ID
	//
	// 待上传文件
	FileObject io.Reader `json:"fileObject,omitempty" xml:"fileObject,omitempty"`
	// 待上传文件名
	FileObjectName *string `json:"fileObjectName,omitempty" xml:"fileObjectName,omitempty"`
	FileId         *string `json:"file_id,omitempty" xml:"file_id,omitempty" require:"true"`
	// 参数，jsonString
	Params *string `json:"params,omitempty" xml:"params,omitempty" require:"true"`
	// 请求类型：示例 OCR_IDENTIFY-->OCR识别业务
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
}

func (s ReceiveRiskplusRfcParamsFileRequest) String() string {
	return tea.Prettify(s)
}

func (s ReceiveRiskplusRfcParamsFileRequest) GoString() string {
	return s.String()
}

func (s *ReceiveRiskplusRfcParamsFileRequest) SetAuthToken(v string) *ReceiveRiskplusRfcParamsFileRequest {
	s.AuthToken = &v
	return s
}

func (s *ReceiveRiskplusRfcParamsFileRequest) SetProductInstanceId(v string) *ReceiveRiskplusRfcParamsFileRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ReceiveRiskplusRfcParamsFileRequest) SetFileObject(v io.Reader) *ReceiveRiskplusRfcParamsFileRequest {
	s.FileObject = v
	return s
}

func (s *ReceiveRiskplusRfcParamsFileRequest) SetFileObjectName(v string) *ReceiveRiskplusRfcParamsFileRequest {
	s.FileObjectName = &v
	return s
}

func (s *ReceiveRiskplusRfcParamsFileRequest) SetFileId(v string) *ReceiveRiskplusRfcParamsFileRequest {
	s.FileId = &v
	return s
}

func (s *ReceiveRiskplusRfcParamsFileRequest) SetParams(v string) *ReceiveRiskplusRfcParamsFileRequest {
	s.Params = &v
	return s
}

func (s *ReceiveRiskplusRfcParamsFileRequest) SetType(v string) *ReceiveRiskplusRfcParamsFileRequest {
	s.Type = &v
	return s
}

type ReceiveRiskplusRfcParamsFileResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 文件上传响应参数
	Content *string `json:"content,omitempty" xml:"content,omitempty"`
}

func (s ReceiveRiskplusRfcParamsFileResponse) String() string {
	return tea.Prettify(s)
}

func (s ReceiveRiskplusRfcParamsFileResponse) GoString() string {
	return s.String()
}

func (s *ReceiveRiskplusRfcParamsFileResponse) SetReqMsgId(v string) *ReceiveRiskplusRfcParamsFileResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ReceiveRiskplusRfcParamsFileResponse) SetResultCode(v string) *ReceiveRiskplusRfcParamsFileResponse {
	s.ResultCode = &v
	return s
}

func (s *ReceiveRiskplusRfcParamsFileResponse) SetResultMsg(v string) *ReceiveRiskplusRfcParamsFileResponse {
	s.ResultMsg = &v
	return s
}

func (s *ReceiveRiskplusRfcParamsFileResponse) SetContent(v string) *ReceiveRiskplusRfcParamsFileResponse {
	s.Content = &v
	return s
}

type UploadRiskplusRfcAiboundFileRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 文件ID
	// 待上传文件
	FileObject io.Reader `json:"fileObject,omitempty" xml:"fileObject,omitempty"`
	// 待上传文件名
	FileObjectName *string `json:"fileObjectName,omitempty" xml:"fileObjectName,omitempty"`
	FileId         *string `json:"file_id,omitempty" xml:"file_id,omitempty" require:"true"`
	// 参数，jsonString
	Params *string `json:"params,omitempty" xml:"params,omitempty" require:"true"`
	// 外呼为 AI_BOUND
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
}

func (s UploadRiskplusRfcAiboundFileRequest) String() string {
	return tea.Prettify(s)
}

func (s UploadRiskplusRfcAiboundFileRequest) GoString() string {
	return s.String()
}

func (s *UploadRiskplusRfcAiboundFileRequest) SetAuthToken(v string) *UploadRiskplusRfcAiboundFileRequest {
	s.AuthToken = &v
	return s
}

func (s *UploadRiskplusRfcAiboundFileRequest) SetProductInstanceId(v string) *UploadRiskplusRfcAiboundFileRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UploadRiskplusRfcAiboundFileRequest) SetFileObject(v io.Reader) *UploadRiskplusRfcAiboundFileRequest {
	s.FileObject = v
	return s
}

func (s *UploadRiskplusRfcAiboundFileRequest) SetFileObjectName(v string) *UploadRiskplusRfcAiboundFileRequest {
	s.FileObjectName = &v
	return s
}

func (s *UploadRiskplusRfcAiboundFileRequest) SetFileId(v string) *UploadRiskplusRfcAiboundFileRequest {
	s.FileId = &v
	return s
}

func (s *UploadRiskplusRfcAiboundFileRequest) SetParams(v string) *UploadRiskplusRfcAiboundFileRequest {
	s.Params = &v
	return s
}

func (s *UploadRiskplusRfcAiboundFileRequest) SetType(v string) *UploadRiskplusRfcAiboundFileRequest {
	s.Type = &v
	return s
}

type UploadRiskplusRfcAiboundFileResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 文件上传响应参数
	Content *string `json:"content,omitempty" xml:"content,omitempty"`
}

func (s UploadRiskplusRfcAiboundFileResponse) String() string {
	return tea.Prettify(s)
}

func (s UploadRiskplusRfcAiboundFileResponse) GoString() string {
	return s.String()
}

func (s *UploadRiskplusRfcAiboundFileResponse) SetReqMsgId(v string) *UploadRiskplusRfcAiboundFileResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UploadRiskplusRfcAiboundFileResponse) SetResultCode(v string) *UploadRiskplusRfcAiboundFileResponse {
	s.ResultCode = &v
	return s
}

func (s *UploadRiskplusRfcAiboundFileResponse) SetResultMsg(v string) *UploadRiskplusRfcAiboundFileResponse {
	s.ResultMsg = &v
	return s
}

func (s *UploadRiskplusRfcAiboundFileResponse) SetContent(v string) *UploadRiskplusRfcAiboundFileResponse {
	s.Content = &v
	return s
}

type UploadRiskplusRfcAiboundConvertRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// fileId
	// 待上传文件
	FileObject io.Reader `json:"fileObject,omitempty" xml:"fileObject,omitempty"`
	// 待上传文件名
	FileObjectName *string `json:"fileObjectName,omitempty" xml:"fileObjectName,omitempty"`
	FileId         *string `json:"file_id,omitempty" xml:"file_id,omitempty" require:"true"`
	// 参数，jsonString
	Params *string `json:"params,omitempty" xml:"params,omitempty" require:"true"`
	// 外呼为 AI_BOUND
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
}

func (s UploadRiskplusRfcAiboundConvertRequest) String() string {
	return tea.Prettify(s)
}

func (s UploadRiskplusRfcAiboundConvertRequest) GoString() string {
	return s.String()
}

func (s *UploadRiskplusRfcAiboundConvertRequest) SetAuthToken(v string) *UploadRiskplusRfcAiboundConvertRequest {
	s.AuthToken = &v
	return s
}

func (s *UploadRiskplusRfcAiboundConvertRequest) SetProductInstanceId(v string) *UploadRiskplusRfcAiboundConvertRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UploadRiskplusRfcAiboundConvertRequest) SetFileObject(v io.Reader) *UploadRiskplusRfcAiboundConvertRequest {
	s.FileObject = v
	return s
}

func (s *UploadRiskplusRfcAiboundConvertRequest) SetFileObjectName(v string) *UploadRiskplusRfcAiboundConvertRequest {
	s.FileObjectName = &v
	return s
}

func (s *UploadRiskplusRfcAiboundConvertRequest) SetFileId(v string) *UploadRiskplusRfcAiboundConvertRequest {
	s.FileId = &v
	return s
}

func (s *UploadRiskplusRfcAiboundConvertRequest) SetParams(v string) *UploadRiskplusRfcAiboundConvertRequest {
	s.Params = &v
	return s
}

func (s *UploadRiskplusRfcAiboundConvertRequest) SetType(v string) *UploadRiskplusRfcAiboundConvertRequest {
	s.Type = &v
	return s
}

type UploadRiskplusRfcAiboundConvertResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// content
	Content *string `json:"content,omitempty" xml:"content,omitempty"`
}

func (s UploadRiskplusRfcAiboundConvertResponse) String() string {
	return tea.Prettify(s)
}

func (s UploadRiskplusRfcAiboundConvertResponse) GoString() string {
	return s.String()
}

func (s *UploadRiskplusRfcAiboundConvertResponse) SetReqMsgId(v string) *UploadRiskplusRfcAiboundConvertResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UploadRiskplusRfcAiboundConvertResponse) SetResultCode(v string) *UploadRiskplusRfcAiboundConvertResponse {
	s.ResultCode = &v
	return s
}

func (s *UploadRiskplusRfcAiboundConvertResponse) SetResultMsg(v string) *UploadRiskplusRfcAiboundConvertResponse {
	s.ResultMsg = &v
	return s
}

func (s *UploadRiskplusRfcAiboundConvertResponse) SetContent(v string) *UploadRiskplusRfcAiboundConvertResponse {
	s.Content = &v
	return s
}

type QueryRiskplusRfcAiboundFileRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 获取圈客文件
	FileType *string `json:"file_type,omitempty" xml:"file_type,omitempty" require:"true"`
}

func (s QueryRiskplusRfcAiboundFileRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryRiskplusRfcAiboundFileRequest) GoString() string {
	return s.String()
}

func (s *QueryRiskplusRfcAiboundFileRequest) SetAuthToken(v string) *QueryRiskplusRfcAiboundFileRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryRiskplusRfcAiboundFileRequest) SetProductInstanceId(v string) *QueryRiskplusRfcAiboundFileRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryRiskplusRfcAiboundFileRequest) SetFileType(v string) *QueryRiskplusRfcAiboundFileRequest {
	s.FileType = &v
	return s
}

type QueryRiskplusRfcAiboundFileResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回内容
	Content *string `json:"content,omitempty" xml:"content,omitempty"`
}

func (s QueryRiskplusRfcAiboundFileResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryRiskplusRfcAiboundFileResponse) GoString() string {
	return s.String()
}

func (s *QueryRiskplusRfcAiboundFileResponse) SetReqMsgId(v string) *QueryRiskplusRfcAiboundFileResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryRiskplusRfcAiboundFileResponse) SetResultCode(v string) *QueryRiskplusRfcAiboundFileResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryRiskplusRfcAiboundFileResponse) SetResultMsg(v string) *QueryRiskplusRfcAiboundFileResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryRiskplusRfcAiboundFileResponse) SetContent(v string) *QueryRiskplusRfcAiboundFileResponse {
	s.Content = &v
	return s
}

type CreateAntcloudGatewayxFileUploadRequest struct {
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

func (s CreateAntcloudGatewayxFileUploadRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateAntcloudGatewayxFileUploadRequest) GoString() string {
	return s.String()
}

func (s *CreateAntcloudGatewayxFileUploadRequest) SetAuthToken(v string) *CreateAntcloudGatewayxFileUploadRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateAntcloudGatewayxFileUploadRequest) SetApiCode(v string) *CreateAntcloudGatewayxFileUploadRequest {
	s.ApiCode = &v
	return s
}

func (s *CreateAntcloudGatewayxFileUploadRequest) SetFileLabel(v string) *CreateAntcloudGatewayxFileUploadRequest {
	s.FileLabel = &v
	return s
}

func (s *CreateAntcloudGatewayxFileUploadRequest) SetFileMetadata(v string) *CreateAntcloudGatewayxFileUploadRequest {
	s.FileMetadata = &v
	return s
}

func (s *CreateAntcloudGatewayxFileUploadRequest) SetFileName(v string) *CreateAntcloudGatewayxFileUploadRequest {
	s.FileName = &v
	return s
}

func (s *CreateAntcloudGatewayxFileUploadRequest) SetMimeType(v string) *CreateAntcloudGatewayxFileUploadRequest {
	s.MimeType = &v
	return s
}

func (s *CreateAntcloudGatewayxFileUploadRequest) SetApiCluster(v string) *CreateAntcloudGatewayxFileUploadRequest {
	s.ApiCluster = &v
	return s
}

type CreateAntcloudGatewayxFileUploadResponse struct {
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

func (s CreateAntcloudGatewayxFileUploadResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateAntcloudGatewayxFileUploadResponse) GoString() string {
	return s.String()
}

func (s *CreateAntcloudGatewayxFileUploadResponse) SetReqMsgId(v string) *CreateAntcloudGatewayxFileUploadResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateAntcloudGatewayxFileUploadResponse) SetResultCode(v string) *CreateAntcloudGatewayxFileUploadResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateAntcloudGatewayxFileUploadResponse) SetResultMsg(v string) *CreateAntcloudGatewayxFileUploadResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateAntcloudGatewayxFileUploadResponse) SetExpiredTime(v string) *CreateAntcloudGatewayxFileUploadResponse {
	s.ExpiredTime = &v
	return s
}

func (s *CreateAntcloudGatewayxFileUploadResponse) SetFileId(v string) *CreateAntcloudGatewayxFileUploadResponse {
	s.FileId = &v
	return s
}

func (s *CreateAntcloudGatewayxFileUploadResponse) SetUploadHeaders(v []*XNameValuePair) *CreateAntcloudGatewayxFileUploadResponse {
	s.UploadHeaders = v
	return s
}

func (s *CreateAntcloudGatewayxFileUploadResponse) SetUploadUrl(v string) *CreateAntcloudGatewayxFileUploadResponse {
	s.UploadUrl = &v
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
				"_prod_code":       tea.String("ak_6a478ae611a14c888f20ef7d446e3fd8"),
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
 * Description: rfc外部文件上传
 * Summary: rfc外部文件上传
 */
func (client *Client) ReceiveRiskplusRfcParamsFile(request *ReceiveRiskplusRfcParamsFileRequest) (_result *ReceiveRiskplusRfcParamsFileResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ReceiveRiskplusRfcParamsFileResponse{}
	_body, _err := client.ReceiveRiskplusRfcParamsFileEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: rfc外部文件上传
 * Summary: rfc外部文件上传
 */
func (client *Client) ReceiveRiskplusRfcParamsFileEx(request *ReceiveRiskplusRfcParamsFileRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ReceiveRiskplusRfcParamsFileResponse, _err error) {
	if !tea.BoolValue(util.IsUnset(request.FileObject)) {
		uploadReq := &CreateAntcloudGatewayxFileUploadRequest{
			AuthToken: request.AuthToken,
			ApiCode:   tea.String("riskplus.rfc.params.file.receive"),
			FileName:  request.FileObjectName,
		}
		uploadResp, _err := client.CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime)
		if _err != nil {
			return _result, _err
		}

		if !tea.BoolValue(antchainutil.IsSuccess(uploadResp.ResultCode, tea.String("ok"))) {
			receiveRiskplusRfcParamsFileResponse := &ReceiveRiskplusRfcParamsFileResponse{
				ReqMsgId:   uploadResp.ReqMsgId,
				ResultCode: uploadResp.ResultCode,
				ResultMsg:  uploadResp.ResultMsg,
			}
			_result = receiveRiskplusRfcParamsFileResponse
			return _result, _err
		}

		uploadHeaders := antchainutil.ParseUploadHeaders(uploadResp.UploadHeaders)
		_err = antchainutil.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl)
		if _err != nil {
			return _result, _err
		}
		request.FileId = uploadResp.FileId
		request.FileObject = nil
	}

	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ReceiveRiskplusRfcParamsFileResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.rfc.params.file.receive"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: rfc外呼名单文件上传接口
 * Summary: rfc外呼名单上传接口
 */
func (client *Client) UploadRiskplusRfcAiboundFile(request *UploadRiskplusRfcAiboundFileRequest) (_result *UploadRiskplusRfcAiboundFileResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UploadRiskplusRfcAiboundFileResponse{}
	_body, _err := client.UploadRiskplusRfcAiboundFileEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: rfc外呼名单文件上传接口
 * Summary: rfc外呼名单上传接口
 */
func (client *Client) UploadRiskplusRfcAiboundFileEx(request *UploadRiskplusRfcAiboundFileRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UploadRiskplusRfcAiboundFileResponse, _err error) {
	if !tea.BoolValue(util.IsUnset(request.FileObject)) {
		uploadReq := &CreateAntcloudGatewayxFileUploadRequest{
			AuthToken: request.AuthToken,
			ApiCode:   tea.String("riskplus.rfc.aibound.file.upload"),
			FileName:  request.FileObjectName,
		}
		uploadResp, _err := client.CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime)
		if _err != nil {
			return _result, _err
		}

		if !tea.BoolValue(antchainutil.IsSuccess(uploadResp.ResultCode, tea.String("ok"))) {
			uploadRiskplusRfcAiboundFileResponse := &UploadRiskplusRfcAiboundFileResponse{
				ReqMsgId:   uploadResp.ReqMsgId,
				ResultCode: uploadResp.ResultCode,
				ResultMsg:  uploadResp.ResultMsg,
			}
			_result = uploadRiskplusRfcAiboundFileResponse
			return _result, _err
		}

		uploadHeaders := antchainutil.ParseUploadHeaders(uploadResp.UploadHeaders)
		_err = antchainutil.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl)
		if _err != nil {
			return _result, _err
		}
		request.FileId = uploadResp.FileId
		request.FileObject = nil
	}

	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UploadRiskplusRfcAiboundFileResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.rfc.aibound.file.upload"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: rfc外呼转化数据上传接口
 * Summary: rfc外呼转化数据上传接口
 */
func (client *Client) UploadRiskplusRfcAiboundConvert(request *UploadRiskplusRfcAiboundConvertRequest) (_result *UploadRiskplusRfcAiboundConvertResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UploadRiskplusRfcAiboundConvertResponse{}
	_body, _err := client.UploadRiskplusRfcAiboundConvertEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: rfc外呼转化数据上传接口
 * Summary: rfc外呼转化数据上传接口
 */
func (client *Client) UploadRiskplusRfcAiboundConvertEx(request *UploadRiskplusRfcAiboundConvertRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UploadRiskplusRfcAiboundConvertResponse, _err error) {
	if !tea.BoolValue(util.IsUnset(request.FileObject)) {
		uploadReq := &CreateAntcloudGatewayxFileUploadRequest{
			AuthToken: request.AuthToken,
			ApiCode:   tea.String("riskplus.rfc.aibound.convert.upload"),
			FileName:  request.FileObjectName,
		}
		uploadResp, _err := client.CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime)
		if _err != nil {
			return _result, _err
		}

		if !tea.BoolValue(antchainutil.IsSuccess(uploadResp.ResultCode, tea.String("ok"))) {
			uploadRiskplusRfcAiboundConvertResponse := &UploadRiskplusRfcAiboundConvertResponse{
				ReqMsgId:   uploadResp.ReqMsgId,
				ResultCode: uploadResp.ResultCode,
				ResultMsg:  uploadResp.ResultMsg,
			}
			_result = uploadRiskplusRfcAiboundConvertResponse
			return _result, _err
		}

		uploadHeaders := antchainutil.ParseUploadHeaders(uploadResp.UploadHeaders)
		_err = antchainutil.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl)
		if _err != nil {
			return _result, _err
		}
		request.FileId = uploadResp.FileId
		request.FileObject = nil
	}

	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UploadRiskplusRfcAiboundConvertResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.rfc.aibound.convert.upload"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: rfc外呼圈客名单获取
 * Summary: rfc外呼圈客名单获取
 */
func (client *Client) QueryRiskplusRfcAiboundFile(request *QueryRiskplusRfcAiboundFileRequest) (_result *QueryRiskplusRfcAiboundFileResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryRiskplusRfcAiboundFileResponse{}
	_body, _err := client.QueryRiskplusRfcAiboundFileEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: rfc外呼圈客名单获取
 * Summary: rfc外呼圈客名单获取
 */
func (client *Client) QueryRiskplusRfcAiboundFileEx(request *QueryRiskplusRfcAiboundFileRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryRiskplusRfcAiboundFileResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryRiskplusRfcAiboundFileResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.rfc.aibound.file.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) CreateAntcloudGatewayxFileUpload(request *CreateAntcloudGatewayxFileUploadRequest) (_result *CreateAntcloudGatewayxFileUploadResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateAntcloudGatewayxFileUploadResponse{}
	_body, _err := client.CreateAntcloudGatewayxFileUploadEx(request, headers, runtime)
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
func (client *Client) CreateAntcloudGatewayxFileUploadEx(request *CreateAntcloudGatewayxFileUploadRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateAntcloudGatewayxFileUploadResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateAntcloudGatewayxFileUploadResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.gatewayx.file.upload.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
