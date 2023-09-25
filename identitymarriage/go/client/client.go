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

type CheckMarriageInfoRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 加密字段
	BizContent *string `json:"biz_content,omitempty" xml:"biz_content,omitempty" require:"true"`
}

func (s CheckMarriageInfoRequest) String() string {
	return tea.Prettify(s)
}

func (s CheckMarriageInfoRequest) GoString() string {
	return s.String()
}

func (s *CheckMarriageInfoRequest) SetAuthToken(v string) *CheckMarriageInfoRequest {
	s.AuthToken = &v
	return s
}

func (s *CheckMarriageInfoRequest) SetProductInstanceId(v string) *CheckMarriageInfoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CheckMarriageInfoRequest) SetBizContent(v string) *CheckMarriageInfoRequest {
	s.BizContent = &v
	return s
}

type CheckMarriageInfoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回数据
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s CheckMarriageInfoResponse) String() string {
	return tea.Prettify(s)
}

func (s CheckMarriageInfoResponse) GoString() string {
	return s.String()
}

func (s *CheckMarriageInfoResponse) SetReqMsgId(v string) *CheckMarriageInfoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CheckMarriageInfoResponse) SetResultCode(v string) *CheckMarriageInfoResponse {
	s.ResultCode = &v
	return s
}

func (s *CheckMarriageInfoResponse) SetResultMsg(v string) *CheckMarriageInfoResponse {
	s.ResultMsg = &v
	return s
}

func (s *CheckMarriageInfoResponse) SetData(v string) *CheckMarriageInfoResponse {
	s.Data = &v
	return s
}

type NotifyMarriageInfoRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// bizContent
	BizContent *string `json:"biz_content,omitempty" xml:"biz_content,omitempty" require:"true"`
}

func (s NotifyMarriageInfoRequest) String() string {
	return tea.Prettify(s)
}

func (s NotifyMarriageInfoRequest) GoString() string {
	return s.String()
}

func (s *NotifyMarriageInfoRequest) SetAuthToken(v string) *NotifyMarriageInfoRequest {
	s.AuthToken = &v
	return s
}

func (s *NotifyMarriageInfoRequest) SetProductInstanceId(v string) *NotifyMarriageInfoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *NotifyMarriageInfoRequest) SetBizContent(v string) *NotifyMarriageInfoRequest {
	s.BizContent = &v
	return s
}

type NotifyMarriageInfoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s NotifyMarriageInfoResponse) String() string {
	return tea.Prettify(s)
}

func (s NotifyMarriageInfoResponse) GoString() string {
	return s.String()
}

func (s *NotifyMarriageInfoResponse) SetReqMsgId(v string) *NotifyMarriageInfoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *NotifyMarriageInfoResponse) SetResultCode(v string) *NotifyMarriageInfoResponse {
	s.ResultCode = &v
	return s
}

func (s *NotifyMarriageInfoResponse) SetResultMsg(v string) *NotifyMarriageInfoResponse {
	s.ResultMsg = &v
	return s
}

func (s *NotifyMarriageInfoResponse) SetData(v string) *NotifyMarriageInfoResponse {
	s.Data = &v
	return s
}

type UploadFileDataRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 文件名
	FileName *string `json:"file_name,omitempty" xml:"file_name,omitempty" require:"true"`
	// 文件流
	File *string `json:"file,omitempty" xml:"file,omitempty" require:"true"`
}

func (s UploadFileDataRequest) String() string {
	return tea.Prettify(s)
}

func (s UploadFileDataRequest) GoString() string {
	return s.String()
}

func (s *UploadFileDataRequest) SetAuthToken(v string) *UploadFileDataRequest {
	s.AuthToken = &v
	return s
}

func (s *UploadFileDataRequest) SetProductInstanceId(v string) *UploadFileDataRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UploadFileDataRequest) SetFileName(v string) *UploadFileDataRequest {
	s.FileName = &v
	return s
}

func (s *UploadFileDataRequest) SetFile(v string) *UploadFileDataRequest {
	s.File = &v
	return s
}

type UploadFileDataResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// xxx
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s UploadFileDataResponse) String() string {
	return tea.Prettify(s)
}

func (s UploadFileDataResponse) GoString() string {
	return s.String()
}

func (s *UploadFileDataResponse) SetReqMsgId(v string) *UploadFileDataResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UploadFileDataResponse) SetResultCode(v string) *UploadFileDataResponse {
	s.ResultCode = &v
	return s
}

func (s *UploadFileDataResponse) SetResultMsg(v string) *UploadFileDataResponse {
	s.ResultMsg = &v
	return s
}

func (s *UploadFileDataResponse) SetData(v string) *UploadFileDataResponse {
	s.Data = &v
	return s
}

type CheckMarriageCoupleinfoRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 加密字段
	BizContent *string `json:"biz_content,omitempty" xml:"biz_content,omitempty" require:"true"`
}

func (s CheckMarriageCoupleinfoRequest) String() string {
	return tea.Prettify(s)
}

func (s CheckMarriageCoupleinfoRequest) GoString() string {
	return s.String()
}

func (s *CheckMarriageCoupleinfoRequest) SetAuthToken(v string) *CheckMarriageCoupleinfoRequest {
	s.AuthToken = &v
	return s
}

func (s *CheckMarriageCoupleinfoRequest) SetProductInstanceId(v string) *CheckMarriageCoupleinfoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CheckMarriageCoupleinfoRequest) SetBizContent(v string) *CheckMarriageCoupleinfoRequest {
	s.BizContent = &v
	return s
}

type CheckMarriageCoupleinfoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回数据
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s CheckMarriageCoupleinfoResponse) String() string {
	return tea.Prettify(s)
}

func (s CheckMarriageCoupleinfoResponse) GoString() string {
	return s.String()
}

func (s *CheckMarriageCoupleinfoResponse) SetReqMsgId(v string) *CheckMarriageCoupleinfoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CheckMarriageCoupleinfoResponse) SetResultCode(v string) *CheckMarriageCoupleinfoResponse {
	s.ResultCode = &v
	return s
}

func (s *CheckMarriageCoupleinfoResponse) SetResultMsg(v string) *CheckMarriageCoupleinfoResponse {
	s.ResultMsg = &v
	return s
}

func (s *CheckMarriageCoupleinfoResponse) SetData(v string) *CheckMarriageCoupleinfoResponse {
	s.Data = &v
	return s
}

type SubmitMarriageInfoRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 加密字段
	BizContent *string `json:"biz_content,omitempty" xml:"biz_content,omitempty" require:"true"`
}

func (s SubmitMarriageInfoRequest) String() string {
	return tea.Prettify(s)
}

func (s SubmitMarriageInfoRequest) GoString() string {
	return s.String()
}

func (s *SubmitMarriageInfoRequest) SetAuthToken(v string) *SubmitMarriageInfoRequest {
	s.AuthToken = &v
	return s
}

func (s *SubmitMarriageInfoRequest) SetProductInstanceId(v string) *SubmitMarriageInfoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SubmitMarriageInfoRequest) SetBizContent(v string) *SubmitMarriageInfoRequest {
	s.BizContent = &v
	return s
}

type SubmitMarriageInfoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回数据
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s SubmitMarriageInfoResponse) String() string {
	return tea.Prettify(s)
}

func (s SubmitMarriageInfoResponse) GoString() string {
	return s.String()
}

func (s *SubmitMarriageInfoResponse) SetReqMsgId(v string) *SubmitMarriageInfoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SubmitMarriageInfoResponse) SetResultCode(v string) *SubmitMarriageInfoResponse {
	s.ResultCode = &v
	return s
}

func (s *SubmitMarriageInfoResponse) SetResultMsg(v string) *SubmitMarriageInfoResponse {
	s.ResultMsg = &v
	return s
}

func (s *SubmitMarriageInfoResponse) SetData(v string) *SubmitMarriageInfoResponse {
	s.Data = &v
	return s
}

type SubmitMarriageCoupleinfoRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 加密字段
	BizContent *string `json:"biz_content,omitempty" xml:"biz_content,omitempty" require:"true"`
}

func (s SubmitMarriageCoupleinfoRequest) String() string {
	return tea.Prettify(s)
}

func (s SubmitMarriageCoupleinfoRequest) GoString() string {
	return s.String()
}

func (s *SubmitMarriageCoupleinfoRequest) SetAuthToken(v string) *SubmitMarriageCoupleinfoRequest {
	s.AuthToken = &v
	return s
}

func (s *SubmitMarriageCoupleinfoRequest) SetProductInstanceId(v string) *SubmitMarriageCoupleinfoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SubmitMarriageCoupleinfoRequest) SetBizContent(v string) *SubmitMarriageCoupleinfoRequest {
	s.BizContent = &v
	return s
}

type SubmitMarriageCoupleinfoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回数据
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s SubmitMarriageCoupleinfoResponse) String() string {
	return tea.Prettify(s)
}

func (s SubmitMarriageCoupleinfoResponse) GoString() string {
	return s.String()
}

func (s *SubmitMarriageCoupleinfoResponse) SetReqMsgId(v string) *SubmitMarriageCoupleinfoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SubmitMarriageCoupleinfoResponse) SetResultCode(v string) *SubmitMarriageCoupleinfoResponse {
	s.ResultCode = &v
	return s
}

func (s *SubmitMarriageCoupleinfoResponse) SetResultMsg(v string) *SubmitMarriageCoupleinfoResponse {
	s.ResultMsg = &v
	return s
}

func (s *SubmitMarriageCoupleinfoResponse) SetData(v string) *SubmitMarriageCoupleinfoResponse {
	s.Data = &v
	return s
}

type QueryMarriageInfoRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 加密字段
	BizContent *string `json:"biz_content,omitempty" xml:"biz_content,omitempty" require:"true"`
}

func (s QueryMarriageInfoRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryMarriageInfoRequest) GoString() string {
	return s.String()
}

func (s *QueryMarriageInfoRequest) SetAuthToken(v string) *QueryMarriageInfoRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryMarriageInfoRequest) SetProductInstanceId(v string) *QueryMarriageInfoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryMarriageInfoRequest) SetBizContent(v string) *QueryMarriageInfoRequest {
	s.BizContent = &v
	return s
}

type QueryMarriageInfoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回数据
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QueryMarriageInfoResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryMarriageInfoResponse) GoString() string {
	return s.String()
}

func (s *QueryMarriageInfoResponse) SetReqMsgId(v string) *QueryMarriageInfoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryMarriageInfoResponse) SetResultCode(v string) *QueryMarriageInfoResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryMarriageInfoResponse) SetResultMsg(v string) *QueryMarriageInfoResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryMarriageInfoResponse) SetData(v string) *QueryMarriageInfoResponse {
	s.Data = &v
	return s
}

type UploadMarriageFileRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 文件
	// 待上传文件
	FileObject io.Reader `json:"fileObject,omitempty" xml:"fileObject,omitempty"`
	// 待上传文件名
	FileObjectName *string `json:"fileObjectName,omitempty" xml:"fileObjectName,omitempty"`
	FileId         *string `json:"file_id,omitempty" xml:"file_id,omitempty" require:"true"`
}

func (s UploadMarriageFileRequest) String() string {
	return tea.Prettify(s)
}

func (s UploadMarriageFileRequest) GoString() string {
	return s.String()
}

func (s *UploadMarriageFileRequest) SetAuthToken(v string) *UploadMarriageFileRequest {
	s.AuthToken = &v
	return s
}

func (s *UploadMarriageFileRequest) SetProductInstanceId(v string) *UploadMarriageFileRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UploadMarriageFileRequest) SetFileObject(v io.Reader) *UploadMarriageFileRequest {
	s.FileObject = v
	return s
}

func (s *UploadMarriageFileRequest) SetFileObjectName(v string) *UploadMarriageFileRequest {
	s.FileObjectName = &v
	return s
}

func (s *UploadMarriageFileRequest) SetFileId(v string) *UploadMarriageFileRequest {
	s.FileId = &v
	return s
}

type UploadMarriageFileResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 文件id
	FileId *string `json:"file_id,omitempty" xml:"file_id,omitempty"`
}

func (s UploadMarriageFileResponse) String() string {
	return tea.Prettify(s)
}

func (s UploadMarriageFileResponse) GoString() string {
	return s.String()
}

func (s *UploadMarriageFileResponse) SetReqMsgId(v string) *UploadMarriageFileResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UploadMarriageFileResponse) SetResultCode(v string) *UploadMarriageFileResponse {
	s.ResultCode = &v
	return s
}

func (s *UploadMarriageFileResponse) SetResultMsg(v string) *UploadMarriageFileResponse {
	s.ResultMsg = &v
	return s
}

func (s *UploadMarriageFileResponse) SetFileId(v string) *UploadMarriageFileResponse {
	s.FileId = &v
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
				"sdk_version":      tea.String("1.0.10"),
				"_prod_code":       tea.String("IDENTITYMARRIAGE"),
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
 * Description: 婚姻状况核查
 * Summary: 婚姻状况核查
 */
func (client *Client) CheckMarriageInfo(request *CheckMarriageInfoRequest) (_result *CheckMarriageInfoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CheckMarriageInfoResponse{}
	_body, _err := client.CheckMarriageInfoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 婚姻状况核查
 * Summary: 婚姻状况核查
 */
func (client *Client) CheckMarriageInfoEx(request *CheckMarriageInfoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CheckMarriageInfoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CheckMarriageInfoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("identity.marriage.marriage.info.check"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 婚姻状况通知
 * Summary: 婚姻状况通知
 */
func (client *Client) NotifyMarriageInfo(request *NotifyMarriageInfoRequest) (_result *NotifyMarriageInfoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &NotifyMarriageInfoResponse{}
	_body, _err := client.NotifyMarriageInfoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 婚姻状况通知
 * Summary: 婚姻状况通知
 */
func (client *Client) NotifyMarriageInfoEx(request *NotifyMarriageInfoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *NotifyMarriageInfoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &NotifyMarriageInfoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("identity.marriage.marriage.info.notify"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 核婚授权文件上传
 * Summary: 核婚授权文件上传
 */
func (client *Client) UploadFileData(request *UploadFileDataRequest) (_result *UploadFileDataResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UploadFileDataResponse{}
	_body, _err := client.UploadFileDataEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 核婚授权文件上传
 * Summary: 核婚授权文件上传
 */
func (client *Client) UploadFileDataEx(request *UploadFileDataRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UploadFileDataResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UploadFileDataResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("identity.marriage.file.data.upload"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 双人婚姻状况核查
 * Summary: 双人婚姻状况核查
 */
func (client *Client) CheckMarriageCoupleinfo(request *CheckMarriageCoupleinfoRequest) (_result *CheckMarriageCoupleinfoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CheckMarriageCoupleinfoResponse{}
	_body, _err := client.CheckMarriageCoupleinfoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 双人婚姻状况核查
 * Summary: 双人婚姻状况核查
 */
func (client *Client) CheckMarriageCoupleinfoEx(request *CheckMarriageCoupleinfoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CheckMarriageCoupleinfoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CheckMarriageCoupleinfoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("identity.marriage.marriage.coupleinfo.check"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 单人婚姻状况核查异步提交
 * Summary: 单人婚姻状况核查异步提交
 */
func (client *Client) SubmitMarriageInfo(request *SubmitMarriageInfoRequest) (_result *SubmitMarriageInfoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SubmitMarriageInfoResponse{}
	_body, _err := client.SubmitMarriageInfoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 单人婚姻状况核查异步提交
 * Summary: 单人婚姻状况核查异步提交
 */
func (client *Client) SubmitMarriageInfoEx(request *SubmitMarriageInfoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SubmitMarriageInfoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SubmitMarriageInfoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("identity.marriage.marriage.info.submit"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 双人婚姻状况核查异步提交
 * Summary: 双人婚姻状况核查异步提交
 */
func (client *Client) SubmitMarriageCoupleinfo(request *SubmitMarriageCoupleinfoRequest) (_result *SubmitMarriageCoupleinfoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SubmitMarriageCoupleinfoResponse{}
	_body, _err := client.SubmitMarriageCoupleinfoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 双人婚姻状况核查异步提交
 * Summary: 双人婚姻状况核查异步提交
 */
func (client *Client) SubmitMarriageCoupleinfoEx(request *SubmitMarriageCoupleinfoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SubmitMarriageCoupleinfoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SubmitMarriageCoupleinfoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("identity.marriage.marriage.coupleinfo.submit"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 婚姻状况核查异步查询
 * Summary: 婚姻状况核查异步查询
 */
func (client *Client) QueryMarriageInfo(request *QueryMarriageInfoRequest) (_result *QueryMarriageInfoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryMarriageInfoResponse{}
	_body, _err := client.QueryMarriageInfoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 婚姻状况核查异步查询
 * Summary: 婚姻状况核查异步查询
 */
func (client *Client) QueryMarriageInfoEx(request *QueryMarriageInfoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryMarriageInfoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryMarriageInfoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("identity.marriage.marriage.info.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 授权文件上传接口
 * Summary: 上传文件接口
 */
func (client *Client) UploadMarriageFile(request *UploadMarriageFileRequest) (_result *UploadMarriageFileResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UploadMarriageFileResponse{}
	_body, _err := client.UploadMarriageFileEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 授权文件上传接口
 * Summary: 上传文件接口
 */
func (client *Client) UploadMarriageFileEx(request *UploadMarriageFileRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UploadMarriageFileResponse, _err error) {
	if !tea.BoolValue(util.IsUnset(request.FileObject)) {
		uploadReq := &CreateAntcloudGatewayxFileUploadRequest{
			AuthToken: request.AuthToken,
			ApiCode:   tea.String("identity.marriage.marriage.file.upload"),
			FileName:  request.FileObjectName,
		}
		uploadResp, _err := client.CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime)
		if _err != nil {
			return _result, _err
		}

		if !tea.BoolValue(antchainutil.IsSuccess(uploadResp.ResultCode, tea.String("ok"))) {
			uploadMarriageFileResponse := &UploadMarriageFileResponse{
				ReqMsgId:   uploadResp.ReqMsgId,
				ResultCode: uploadResp.ResultCode,
				ResultMsg:  uploadResp.ResultMsg,
			}
			_result = uploadMarriageFileResponse
			return _result, _err
		}

		uploadHeaders := antchainutil.ParseUploadHeaders(uploadResp.UploadHeaders)
		_err = antchainutil.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl)
		if _err != nil {
			return _result, _err
		}
		request.FileId = uploadResp.FileId
	}

	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UploadMarriageFileResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("identity.marriage.marriage.file.upload"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
