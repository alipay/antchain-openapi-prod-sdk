// This file is auto-generated, don't edit it. Thanks.
package client

import (
	rpcutil "github.com/alibabacloud-go/tea-rpc-utils/service"
	util "github.com/alibabacloud-go/tea-utils/service"
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

// 子结构体
type SubDemoStruct struct {
	// name
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// value
	Value *string `json:"value,omitempty" xml:"value,omitempty" require:"true"`
}

func (s SubDemoStruct) String() string {
	return tea.Prettify(s)
}

func (s SubDemoStruct) GoString() string {
	return s.String()
}

func (s *SubDemoStruct) SetName(v string) *SubDemoStruct {
	s.Name = &v
	return s
}

func (s *SubDemoStruct) SetValue(v string) *SubDemoStruct {
	s.Value = &v
	return s
}

// ABC示例结构体
type AbcDemoStruct struct {
	// 字符串属性
	SomeString *string `json:"some_string,omitempty" xml:"some_string,omitempty" maxLength:"100" minLength:"10"`
	// Long型属性
	SomeNumber *int64 `json:"some_number,omitempty" xml:"some_number,omitempty" require:"true" maximum:"100" minimum:"1"`
	// 布尔型
	SomeBoolean *bool `json:"some_boolean,omitempty" xml:"some_boolean,omitempty" require:"true"`
	// ISO8601格式字符串：yyyy-MM-dd_T_HH:mm:ss_Z_
	SomeDate *string `json:"some_date,omitempty" xml:"some_date,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 字符串数组
	SomeStringList []*string `json:"some_string_list,omitempty" xml:"some_string_list,omitempty" type:"Repeated"`
	// 子结构体
	SomeStruct *SubDemoStruct `json:"some_struct,omitempty" xml:"some_struct,omitempty" require:"true"`
	// 结构体数组
	SomeStructList []*SubDemoStruct `json:"some_struct_list,omitempty" xml:"some_struct_list,omitempty" require:"true" type:"Repeated"`
}

func (s AbcDemoStruct) String() string {
	return tea.Prettify(s)
}

func (s AbcDemoStruct) GoString() string {
	return s.String()
}

func (s *AbcDemoStruct) SetSomeString(v string) *AbcDemoStruct {
	s.SomeString = &v
	return s
}

func (s *AbcDemoStruct) SetSomeNumber(v int64) *AbcDemoStruct {
	s.SomeNumber = &v
	return s
}

func (s *AbcDemoStruct) SetSomeBoolean(v bool) *AbcDemoStruct {
	s.SomeBoolean = &v
	return s
}

func (s *AbcDemoStruct) SetSomeDate(v string) *AbcDemoStruct {
	s.SomeDate = &v
	return s
}

func (s *AbcDemoStruct) SetSomeStringList(v []*string) *AbcDemoStruct {
	s.SomeStringList = v
	return s
}

func (s *AbcDemoStruct) SetSomeStruct(v *SubDemoStruct) *AbcDemoStruct {
	s.SomeStruct = v
	return s
}

func (s *AbcDemoStruct) SetSomeStructList(v []*SubDemoStruct) *AbcDemoStruct {
	s.SomeStructList = v
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

type PreviewAntchainAbcDemoRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 字符串入参
	InputString *string `json:"input_string,omitempty" xml:"input_string,omitempty" require:"true" maxLength:"1000" minLength:"10"`
	// Long型入参
	InputNumber *int64 `json:"input_number,omitempty" xml:"input_number,omitempty" maximum:"10000" minimum:"10"`
	// 布尔型入参
	InputBoolean *bool `json:"input_boolean,omitempty" xml:"input_boolean,omitempty" require:"true"`
	// ISO8601格式字符串：yyyy-MM-dd_T_HH:mm:ss_Z_
	InputDate *string `json:"input_date,omitempty" xml:"input_date,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 字符串列表入参
	InputStringList []*string `json:"input_string_list,omitempty" xml:"input_string_list,omitempty" type:"Repeated"`
	// 示例结构体入参
	InputStruct *AbcDemoStruct `json:"input_struct,omitempty" xml:"input_struct,omitempty" require:"true"`
	// 结构体数组入参
	InputStructList []*AbcDemoStruct `json:"input_struct_list,omitempty" xml:"input_struct_list,omitempty" require:"true" type:"Repeated"`
	// 123
	// 待上传文件
	FileObject io.Reader `json:"fileObject,omitempty" xml:"fileObject,omitempty"`
	// 待上传文件名
	FileObjectName *string `json:"fileObjectName,omitempty" xml:"fileObjectName,omitempty"`
	FileId         *string `json:"file_id,omitempty" xml:"file_id,omitempty" require:"true"`
}

func (s PreviewAntchainAbcDemoRequest) String() string {
	return tea.Prettify(s)
}

func (s PreviewAntchainAbcDemoRequest) GoString() string {
	return s.String()
}

func (s *PreviewAntchainAbcDemoRequest) SetAuthToken(v string) *PreviewAntchainAbcDemoRequest {
	s.AuthToken = &v
	return s
}

func (s *PreviewAntchainAbcDemoRequest) SetProductInstanceId(v string) *PreviewAntchainAbcDemoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PreviewAntchainAbcDemoRequest) SetInputString(v string) *PreviewAntchainAbcDemoRequest {
	s.InputString = &v
	return s
}

func (s *PreviewAntchainAbcDemoRequest) SetInputNumber(v int64) *PreviewAntchainAbcDemoRequest {
	s.InputNumber = &v
	return s
}

func (s *PreviewAntchainAbcDemoRequest) SetInputBoolean(v bool) *PreviewAntchainAbcDemoRequest {
	s.InputBoolean = &v
	return s
}

func (s *PreviewAntchainAbcDemoRequest) SetInputDate(v string) *PreviewAntchainAbcDemoRequest {
	s.InputDate = &v
	return s
}

func (s *PreviewAntchainAbcDemoRequest) SetInputStringList(v []*string) *PreviewAntchainAbcDemoRequest {
	s.InputStringList = v
	return s
}

func (s *PreviewAntchainAbcDemoRequest) SetInputStruct(v *AbcDemoStruct) *PreviewAntchainAbcDemoRequest {
	s.InputStruct = v
	return s
}

func (s *PreviewAntchainAbcDemoRequest) SetInputStructList(v []*AbcDemoStruct) *PreviewAntchainAbcDemoRequest {
	s.InputStructList = v
	return s
}

func (s *PreviewAntchainAbcDemoRequest) SetFileObject(v io.Reader) *PreviewAntchainAbcDemoRequest {
	s.FileObject = v
	return s
}

func (s *PreviewAntchainAbcDemoRequest) SetFileObjectName(v string) *PreviewAntchainAbcDemoRequest {
	s.FileObjectName = &v
	return s
}

func (s *PreviewAntchainAbcDemoRequest) SetFileId(v string) *PreviewAntchainAbcDemoRequest {
	s.FileId = &v
	return s
}

type PreviewAntchainAbcDemoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 字符串回参
	OutputString *string `json:"output_string,omitempty" xml:"output_string,omitempty"`
	// Long型回参
	OutputNumber *int64 `json:"output_number,omitempty" xml:"output_number,omitempty"`
	// 布尔型回参
	OutputBoolean *bool `json:"output_boolean,omitempty" xml:"output_boolean,omitempty"`
	// ISO8602格式字符串：yyyy-MM-dd_T_HH:mm:ss_Z_
	OutputDate *string `json:"output_date,omitempty" xml:"output_date,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 字符串数组
	OutputStringList []*string `json:"output_string_list,omitempty" xml:"output_string_list,omitempty" type:"Repeated"`
	// 结构体回参
	OutputStruct *AbcDemoStruct `json:"output_struct,omitempty" xml:"output_struct,omitempty"`
	// 结构体列表回参
	OutputStructList []*AbcDemoStruct `json:"output_struct_list,omitempty" xml:"output_struct_list,omitempty" type:"Repeated"`
}

func (s PreviewAntchainAbcDemoResponse) String() string {
	return tea.Prettify(s)
}

func (s PreviewAntchainAbcDemoResponse) GoString() string {
	return s.String()
}

func (s *PreviewAntchainAbcDemoResponse) SetReqMsgId(v string) *PreviewAntchainAbcDemoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PreviewAntchainAbcDemoResponse) SetResultCode(v string) *PreviewAntchainAbcDemoResponse {
	s.ResultCode = &v
	return s
}

func (s *PreviewAntchainAbcDemoResponse) SetResultMsg(v string) *PreviewAntchainAbcDemoResponse {
	s.ResultMsg = &v
	return s
}

func (s *PreviewAntchainAbcDemoResponse) SetOutputString(v string) *PreviewAntchainAbcDemoResponse {
	s.OutputString = &v
	return s
}

func (s *PreviewAntchainAbcDemoResponse) SetOutputNumber(v int64) *PreviewAntchainAbcDemoResponse {
	s.OutputNumber = &v
	return s
}

func (s *PreviewAntchainAbcDemoResponse) SetOutputBoolean(v bool) *PreviewAntchainAbcDemoResponse {
	s.OutputBoolean = &v
	return s
}

func (s *PreviewAntchainAbcDemoResponse) SetOutputDate(v string) *PreviewAntchainAbcDemoResponse {
	s.OutputDate = &v
	return s
}

func (s *PreviewAntchainAbcDemoResponse) SetOutputStringList(v []*string) *PreviewAntchainAbcDemoResponse {
	s.OutputStringList = v
	return s
}

func (s *PreviewAntchainAbcDemoResponse) SetOutputStruct(v *AbcDemoStruct) *PreviewAntchainAbcDemoResponse {
	s.OutputStruct = v
	return s
}

func (s *PreviewAntchainAbcDemoResponse) SetOutputStructList(v []*AbcDemoStruct) *PreviewAntchainAbcDemoResponse {
	s.OutputStructList = v
	return s
}

type QueryAntchainAbcGatewayRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s QueryAntchainAbcGatewayRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAntchainAbcGatewayRequest) GoString() string {
	return s.String()
}

func (s *QueryAntchainAbcGatewayRequest) SetAuthToken(v string) *QueryAntchainAbcGatewayRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAntchainAbcGatewayRequest) SetProductInstanceId(v string) *QueryAntchainAbcGatewayRequest {
	s.ProductInstanceId = &v
	return s
}

type QueryAntchainAbcGatewayResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s QueryAntchainAbcGatewayResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAntchainAbcGatewayResponse) GoString() string {
	return s.String()
}

func (s *QueryAntchainAbcGatewayResponse) SetReqMsgId(v string) *QueryAntchainAbcGatewayResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAntchainAbcGatewayResponse) SetResultCode(v string) *QueryAntchainAbcGatewayResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAntchainAbcGatewayResponse) SetResultMsg(v string) *QueryAntchainAbcGatewayResponse {
	s.ResultMsg = &v
	return s
}

type BindAntchainAbcSfsdSdfsdRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s BindAntchainAbcSfsdSdfsdRequest) String() string {
	return tea.Prettify(s)
}

func (s BindAntchainAbcSfsdSdfsdRequest) GoString() string {
	return s.String()
}

func (s *BindAntchainAbcSfsdSdfsdRequest) SetAuthToken(v string) *BindAntchainAbcSfsdSdfsdRequest {
	s.AuthToken = &v
	return s
}

func (s *BindAntchainAbcSfsdSdfsdRequest) SetProductInstanceId(v string) *BindAntchainAbcSfsdSdfsdRequest {
	s.ProductInstanceId = &v
	return s
}

type BindAntchainAbcSfsdSdfsdResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s BindAntchainAbcSfsdSdfsdResponse) String() string {
	return tea.Prettify(s)
}

func (s BindAntchainAbcSfsdSdfsdResponse) GoString() string {
	return s.String()
}

func (s *BindAntchainAbcSfsdSdfsdResponse) SetReqMsgId(v string) *BindAntchainAbcSfsdSdfsdResponse {
	s.ReqMsgId = &v
	return s
}

func (s *BindAntchainAbcSfsdSdfsdResponse) SetResultCode(v string) *BindAntchainAbcSfsdSdfsdResponse {
	s.ResultCode = &v
	return s
}

func (s *BindAntchainAbcSfsdSdfsdResponse) SetResultMsg(v string) *BindAntchainAbcSfsdSdfsdResponse {
	s.ResultMsg = &v
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
				"sdk_version":      tea.String("1.0.6"),
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
 * Description: 录入演示
 * Summary: 录入演示API
 */
func (client *Client) PreviewAntchainAbcDemo(request *PreviewAntchainAbcDemoRequest) (_result *PreviewAntchainAbcDemoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PreviewAntchainAbcDemoResponse{}
	_body, _err := client.PreviewAntchainAbcDemoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 录入演示
 * Summary: 录入演示API
 */
func (client *Client) PreviewAntchainAbcDemoEx(request *PreviewAntchainAbcDemoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PreviewAntchainAbcDemoResponse, _err error) {
	if !tea.BoolValue(util.IsUnset(request.FileObject)) {
		uploadReq := &CreateAntcloudGatewayxFileUploadRequest{
			AuthToken: request.AuthToken,
			ApiCode:   tea.String("antchain.abc.demo.preview"),
			FileName:  request.FileObjectName,
		}
		uploadResp, _err := client.CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime)
		if _err != nil {
			return _result, _err
		}

		if !tea.BoolValue(antchainutil.IsSuccess(uploadResp.ResultCode, tea.String("ok"))) {
			previewAntchainAbcDemoResponse := &PreviewAntchainAbcDemoResponse{
				ReqMsgId:   uploadResp.ReqMsgId,
				ResultCode: uploadResp.ResultCode,
				ResultMsg:  uploadResp.ResultMsg,
			}
			_result = previewAntchainAbcDemoResponse
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
	_result = &PreviewAntchainAbcDemoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.abc.demo.preview"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 测试使用
 * Summary: 测试API工单审批
 */
func (client *Client) QueryAntchainAbcGateway(request *QueryAntchainAbcGatewayRequest) (_result *QueryAntchainAbcGatewayResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAntchainAbcGatewayResponse{}
	_body, _err := client.QueryAntchainAbcGatewayEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 测试使用
 * Summary: 测试API工单审批
 */
func (client *Client) QueryAntchainAbcGatewayEx(request *QueryAntchainAbcGatewayRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAntchainAbcGatewayResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAntchainAbcGatewayResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.abc.gateway.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 123
 * Summary: 123
 */
func (client *Client) BindAntchainAbcSfsdSdfsd(request *BindAntchainAbcSfsdSdfsdRequest) (_result *BindAntchainAbcSfsdSdfsdResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &BindAntchainAbcSfsdSdfsdResponse{}
	_body, _err := client.BindAntchainAbcSfsdSdfsdEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 123
 * Summary: 123
 */
func (client *Client) BindAntchainAbcSfsdSdfsdEx(request *BindAntchainAbcSfsdSdfsdRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *BindAntchainAbcSfsdSdfsdResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &BindAntchainAbcSfsdSdfsdResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.abc.sfsd.sdfsd.bind"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
