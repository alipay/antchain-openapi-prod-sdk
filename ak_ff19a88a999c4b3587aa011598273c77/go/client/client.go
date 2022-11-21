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

// Demo类1
type DemoClass struct {
	// 字符串测试
	SomeString *string `json:"some_string,omitempty" xml:"some_string,omitempty" require:"true"`
	// 日期测试
	SomeDate *string `json:"some_date,omitempty" xml:"some_date,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// Boolean测试
	SomeBoolean *bool `json:"some_boolean,omitempty" xml:"some_boolean,omitempty" require:"true"`
	// 整数测试
	SomeInt *int64 `json:"some_int,omitempty" xml:"some_int,omitempty" require:"true" maximum:"2000" minimum:"1"`
	// 列表测试
	SomeList []*string `json:"some_list,omitempty" xml:"some_list,omitempty" require:"true" type:"Repeated"`
}

func (s DemoClass) String() string {
	return tea.Prettify(s)
}

func (s DemoClass) GoString() string {
	return s.String()
}

func (s *DemoClass) SetSomeString(v string) *DemoClass {
	s.SomeString = &v
	return s
}

func (s *DemoClass) SetSomeDate(v string) *DemoClass {
	s.SomeDate = &v
	return s
}

func (s *DemoClass) SetSomeBoolean(v bool) *DemoClass {
	s.SomeBoolean = &v
	return s
}

func (s *DemoClass) SetSomeInt(v int64) *DemoClass {
	s.SomeInt = &v
	return s
}

func (s *DemoClass) SetSomeList(v []*string) *DemoClass {
	s.SomeList = v
	return s
}

// 键值对，兼容map用
type NameValuePair struct {
	// 键名
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 键值
	Value *string `json:"value,omitempty" xml:"value,omitempty" require:"true"`
}

func (s NameValuePair) String() string {
	return tea.Prettify(s)
}

func (s NameValuePair) GoString() string {
	return s.String()
}

func (s *NameValuePair) SetName(v string) *NameValuePair {
	s.Name = &v
	return s
}

func (s *NameValuePair) SetValue(v string) *NameValuePair {
	s.Value = &v
	return s
}

// TestStruct
type TestStruct struct {
	// x
	X *string `json:"x,omitempty" xml:"x,omitempty" require:"true"`
	// y
	Y *DemoClass `json:"y,omitempty" xml:"y,omitempty" require:"true"`
	// z
	Z []*DemoClass `json:"z,omitempty" xml:"z,omitempty" require:"true" type:"Repeated"`
}

func (s TestStruct) String() string {
	return tea.Prettify(s)
}

func (s TestStruct) GoString() string {
	return s.String()
}

func (s *TestStruct) SetX(v string) *TestStruct {
	s.X = &v
	return s
}

func (s *TestStruct) SetY(v *DemoClass) *TestStruct {
	s.Y = v
	return s
}

func (s *TestStruct) SetZ(v []*DemoClass) *TestStruct {
	s.Z = v
	return s
}

// Map<String,Object> 集合
type QueryMap struct {
	// 键值
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 额外用户信息
	Value []*NameValuePair `json:"value,omitempty" xml:"value,omitempty" type:"Repeated"`
}

func (s QueryMap) String() string {
	return tea.Prettify(s)
}

func (s QueryMap) GoString() string {
	return s.String()
}

func (s *QueryMap) SetName(v string) *QueryMap {
	s.Name = &v
	return s
}

func (s *QueryMap) SetValue(v []*NameValuePair) *QueryMap {
	s.Value = v
	return s
}

// init接口响应结果，map类型
type InitPack struct {
	// 返回接收到请求的当前时间
	Time *string `json:"time,omitempty" xml:"time,omitempty" require:"true"`
	// 操作人
	Operator *string `json:"operator,omitempty" xml:"operator,omitempty" require:"true"`
	// 请求编号
	Count *int64 `json:"count,omitempty" xml:"count,omitempty" require:"true"`
}

func (s InitPack) String() string {
	return tea.Prettify(s)
}

func (s InitPack) GoString() string {
	return s.String()
}

func (s *InitPack) SetTime(v string) *InitPack {
	s.Time = &v
	return s
}

func (s *InitPack) SetOperator(v string) *InitPack {
	s.Operator = &v
	return s
}

func (s *InitPack) SetCount(v int64) *InitPack {
	s.Count = &v
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

type StatusDemoGatewayCheckRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s StatusDemoGatewayCheckRequest) String() string {
	return tea.Prettify(s)
}

func (s StatusDemoGatewayCheckRequest) GoString() string {
	return s.String()
}

func (s *StatusDemoGatewayCheckRequest) SetAuthToken(v string) *StatusDemoGatewayCheckRequest {
	s.AuthToken = &v
	return s
}

func (s *StatusDemoGatewayCheckRequest) SetProductInstanceId(v string) *StatusDemoGatewayCheckRequest {
	s.ProductInstanceId = &v
	return s
}

type StatusDemoGatewayCheckResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// OK
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
}

func (s StatusDemoGatewayCheckResponse) String() string {
	return tea.Prettify(s)
}

func (s StatusDemoGatewayCheckResponse) GoString() string {
	return s.String()
}

func (s *StatusDemoGatewayCheckResponse) SetReqMsgId(v string) *StatusDemoGatewayCheckResponse {
	s.ReqMsgId = &v
	return s
}

func (s *StatusDemoGatewayCheckResponse) SetResultCode(v string) *StatusDemoGatewayCheckResponse {
	s.ResultCode = &v
	return s
}

func (s *StatusDemoGatewayCheckResponse) SetResultMsg(v string) *StatusDemoGatewayCheckResponse {
	s.ResultMsg = &v
	return s
}

func (s *StatusDemoGatewayCheckResponse) SetStatus(v string) *StatusDemoGatewayCheckResponse {
	s.Status = &v
	return s
}

type EchoDemoGatewayCheckRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// input_array
	InputArray []*TestStruct `json:"input_array,omitempty" xml:"input_array,omitempty" require:"true" type:"Repeated"`
	// file_id
	// 待上传文件
	FileObject io.Reader `json:"fileObject,omitempty" xml:"fileObject,omitempty"`
	// 待上传文件名
	FileObjectName *string `json:"fileObjectName,omitempty" xml:"fileObjectName,omitempty"`
	FileId         *string `json:"file_id,omitempty" xml:"file_id,omitempty" require:"true"`
	// 1
	InputInt *int64 `json:"input_int,omitempty" xml:"input_int,omitempty" require:"true" maximum:"40" minimum:"10"`
	// 测试一下
	FileName *string `json:"file_name,omitempty" xml:"file_name,omitempty" require:"true"`
}

func (s EchoDemoGatewayCheckRequest) String() string {
	return tea.Prettify(s)
}

func (s EchoDemoGatewayCheckRequest) GoString() string {
	return s.String()
}

func (s *EchoDemoGatewayCheckRequest) SetAuthToken(v string) *EchoDemoGatewayCheckRequest {
	s.AuthToken = &v
	return s
}

func (s *EchoDemoGatewayCheckRequest) SetProductInstanceId(v string) *EchoDemoGatewayCheckRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *EchoDemoGatewayCheckRequest) SetInputArray(v []*TestStruct) *EchoDemoGatewayCheckRequest {
	s.InputArray = v
	return s
}

func (s *EchoDemoGatewayCheckRequest) SetFileObject(v io.Reader) *EchoDemoGatewayCheckRequest {
	s.FileObject = v
	return s
}

func (s *EchoDemoGatewayCheckRequest) SetFileObjectName(v string) *EchoDemoGatewayCheckRequest {
	s.FileObjectName = &v
	return s
}

func (s *EchoDemoGatewayCheckRequest) SetFileId(v string) *EchoDemoGatewayCheckRequest {
	s.FileId = &v
	return s
}

func (s *EchoDemoGatewayCheckRequest) SetInputInt(v int64) *EchoDemoGatewayCheckRequest {
	s.InputInt = &v
	return s
}

func (s *EchoDemoGatewayCheckRequest) SetFileName(v string) *EchoDemoGatewayCheckRequest {
	s.FileName = &v
	return s
}

type EchoDemoGatewayCheckResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// output_demo
	OutputDemo *DemoClass `json:"output_demo,omitempty" xml:"output_demo,omitempty"`
	// output_string
	OutputString *string `json:"output_string,omitempty" xml:"output_string,omitempty"`
	// file_url
	FileUrl *string `json:"file_url,omitempty" xml:"file_url,omitempty"`
}

func (s EchoDemoGatewayCheckResponse) String() string {
	return tea.Prettify(s)
}

func (s EchoDemoGatewayCheckResponse) GoString() string {
	return s.String()
}

func (s *EchoDemoGatewayCheckResponse) SetReqMsgId(v string) *EchoDemoGatewayCheckResponse {
	s.ReqMsgId = &v
	return s
}

func (s *EchoDemoGatewayCheckResponse) SetResultCode(v string) *EchoDemoGatewayCheckResponse {
	s.ResultCode = &v
	return s
}

func (s *EchoDemoGatewayCheckResponse) SetResultMsg(v string) *EchoDemoGatewayCheckResponse {
	s.ResultMsg = &v
	return s
}

func (s *EchoDemoGatewayCheckResponse) SetOutputDemo(v *DemoClass) *EchoDemoGatewayCheckResponse {
	s.OutputDemo = v
	return s
}

func (s *EchoDemoGatewayCheckResponse) SetOutputString(v string) *EchoDemoGatewayCheckResponse {
	s.OutputString = &v
	return s
}

func (s *EchoDemoGatewayCheckResponse) SetFileUrl(v string) *EchoDemoGatewayCheckResponse {
	s.FileUrl = &v
	return s
}

type QueryDemoGatewayCheckRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s QueryDemoGatewayCheckRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDemoGatewayCheckRequest) GoString() string {
	return s.String()
}

func (s *QueryDemoGatewayCheckRequest) SetAuthToken(v string) *QueryDemoGatewayCheckRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDemoGatewayCheckRequest) SetProductInstanceId(v string) *QueryDemoGatewayCheckRequest {
	s.ProductInstanceId = &v
	return s
}

type QueryDemoGatewayCheckResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s QueryDemoGatewayCheckResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDemoGatewayCheckResponse) GoString() string {
	return s.String()
}

func (s *QueryDemoGatewayCheckResponse) SetReqMsgId(v string) *QueryDemoGatewayCheckResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDemoGatewayCheckResponse) SetResultCode(v string) *QueryDemoGatewayCheckResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDemoGatewayCheckResponse) SetResultMsg(v string) *QueryDemoGatewayCheckResponse {
	s.ResultMsg = &v
	return s
}

type BindDemoDemoCheckEeeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s BindDemoDemoCheckEeeRequest) String() string {
	return tea.Prettify(s)
}

func (s BindDemoDemoCheckEeeRequest) GoString() string {
	return s.String()
}

func (s *BindDemoDemoCheckEeeRequest) SetAuthToken(v string) *BindDemoDemoCheckEeeRequest {
	s.AuthToken = &v
	return s
}

func (s *BindDemoDemoCheckEeeRequest) SetProductInstanceId(v string) *BindDemoDemoCheckEeeRequest {
	s.ProductInstanceId = &v
	return s
}

type BindDemoDemoCheckEeeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s BindDemoDemoCheckEeeResponse) String() string {
	return tea.Prettify(s)
}

func (s BindDemoDemoCheckEeeResponse) GoString() string {
	return s.String()
}

func (s *BindDemoDemoCheckEeeResponse) SetReqMsgId(v string) *BindDemoDemoCheckEeeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *BindDemoDemoCheckEeeResponse) SetResultCode(v string) *BindDemoDemoCheckEeeResponse {
	s.ResultCode = &v
	return s
}

func (s *BindDemoDemoCheckEeeResponse) SetResultMsg(v string) *BindDemoDemoCheckEeeResponse {
	s.ResultMsg = &v
	return s
}

type BindDemoGatewayAbcTestRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s BindDemoGatewayAbcTestRequest) String() string {
	return tea.Prettify(s)
}

func (s BindDemoGatewayAbcTestRequest) GoString() string {
	return s.String()
}

func (s *BindDemoGatewayAbcTestRequest) SetAuthToken(v string) *BindDemoGatewayAbcTestRequest {
	s.AuthToken = &v
	return s
}

func (s *BindDemoGatewayAbcTestRequest) SetProductInstanceId(v string) *BindDemoGatewayAbcTestRequest {
	s.ProductInstanceId = &v
	return s
}

type BindDemoGatewayAbcTestResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s BindDemoGatewayAbcTestResponse) String() string {
	return tea.Prettify(s)
}

func (s BindDemoGatewayAbcTestResponse) GoString() string {
	return s.String()
}

func (s *BindDemoGatewayAbcTestResponse) SetReqMsgId(v string) *BindDemoGatewayAbcTestResponse {
	s.ReqMsgId = &v
	return s
}

func (s *BindDemoGatewayAbcTestResponse) SetResultCode(v string) *BindDemoGatewayAbcTestResponse {
	s.ResultCode = &v
	return s
}

func (s *BindDemoGatewayAbcTestResponse) SetResultMsg(v string) *BindDemoGatewayAbcTestResponse {
	s.ResultMsg = &v
	return s
}

type QueryDemoGatewayCheckEchotimeoutRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 10
	Timeout *string `json:"timeout,omitempty" xml:"timeout,omitempty"`
}

func (s QueryDemoGatewayCheckEchotimeoutRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDemoGatewayCheckEchotimeoutRequest) GoString() string {
	return s.String()
}

func (s *QueryDemoGatewayCheckEchotimeoutRequest) SetAuthToken(v string) *QueryDemoGatewayCheckEchotimeoutRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDemoGatewayCheckEchotimeoutRequest) SetProductInstanceId(v string) *QueryDemoGatewayCheckEchotimeoutRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryDemoGatewayCheckEchotimeoutRequest) SetTimeout(v string) *QueryDemoGatewayCheckEchotimeoutRequest {
	s.Timeout = &v
	return s
}

type QueryDemoGatewayCheckEchotimeoutResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 222
	Stauts *string `json:"stauts,omitempty" xml:"stauts,omitempty"`
	// ok
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
}

func (s QueryDemoGatewayCheckEchotimeoutResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDemoGatewayCheckEchotimeoutResponse) GoString() string {
	return s.String()
}

func (s *QueryDemoGatewayCheckEchotimeoutResponse) SetReqMsgId(v string) *QueryDemoGatewayCheckEchotimeoutResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDemoGatewayCheckEchotimeoutResponse) SetResultCode(v string) *QueryDemoGatewayCheckEchotimeoutResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDemoGatewayCheckEchotimeoutResponse) SetResultMsg(v string) *QueryDemoGatewayCheckEchotimeoutResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDemoGatewayCheckEchotimeoutResponse) SetStauts(v string) *QueryDemoGatewayCheckEchotimeoutResponse {
	s.Stauts = &v
	return s
}

func (s *QueryDemoGatewayCheckEchotimeoutResponse) SetMsg(v string) *QueryDemoGatewayCheckEchotimeoutResponse {
	s.Msg = &v
	return s
}

type QueryDemoGatewayCheckEchotenRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s QueryDemoGatewayCheckEchotenRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDemoGatewayCheckEchotenRequest) GoString() string {
	return s.String()
}

func (s *QueryDemoGatewayCheckEchotenRequest) SetAuthToken(v string) *QueryDemoGatewayCheckEchotenRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDemoGatewayCheckEchotenRequest) SetProductInstanceId(v string) *QueryDemoGatewayCheckEchotenRequest {
	s.ProductInstanceId = &v
	return s
}

type QueryDemoGatewayCheckEchotenResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 222
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// ok
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
}

func (s QueryDemoGatewayCheckEchotenResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDemoGatewayCheckEchotenResponse) GoString() string {
	return s.String()
}

func (s *QueryDemoGatewayCheckEchotenResponse) SetReqMsgId(v string) *QueryDemoGatewayCheckEchotenResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDemoGatewayCheckEchotenResponse) SetResultCode(v string) *QueryDemoGatewayCheckEchotenResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDemoGatewayCheckEchotenResponse) SetResultMsg(v string) *QueryDemoGatewayCheckEchotenResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDemoGatewayCheckEchotenResponse) SetStatus(v string) *QueryDemoGatewayCheckEchotenResponse {
	s.Status = &v
	return s
}

func (s *QueryDemoGatewayCheckEchotenResponse) SetMsg(v string) *QueryDemoGatewayCheckEchotenResponse {
	s.Msg = &v
	return s
}

type InitDemoBbpInsuranceUserRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 保司编码
	BusinessCode *string `json:"business_code,omitempty" xml:"business_code,omitempty" require:"true"`
	// 第三方id，此处为天猫uid
	ThirdPartId *string `json:"third_part_id,omitempty" xml:"third_part_id,omitempty" require:"true"`
	// 来源渠道
	Channel *string `json:"channel,omitempty" xml:"channel,omitempty" require:"true"`
	// 埋点信息
	Burieds *QueryMap `json:"burieds,omitempty" xml:"burieds,omitempty"`
}

func (s InitDemoBbpInsuranceUserRequest) String() string {
	return tea.Prettify(s)
}

func (s InitDemoBbpInsuranceUserRequest) GoString() string {
	return s.String()
}

func (s *InitDemoBbpInsuranceUserRequest) SetAuthToken(v string) *InitDemoBbpInsuranceUserRequest {
	s.AuthToken = &v
	return s
}

func (s *InitDemoBbpInsuranceUserRequest) SetProductInstanceId(v string) *InitDemoBbpInsuranceUserRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *InitDemoBbpInsuranceUserRequest) SetBusinessCode(v string) *InitDemoBbpInsuranceUserRequest {
	s.BusinessCode = &v
	return s
}

func (s *InitDemoBbpInsuranceUserRequest) SetThirdPartId(v string) *InitDemoBbpInsuranceUserRequest {
	s.ThirdPartId = &v
	return s
}

func (s *InitDemoBbpInsuranceUserRequest) SetChannel(v string) *InitDemoBbpInsuranceUserRequest {
	s.Channel = &v
	return s
}

func (s *InitDemoBbpInsuranceUserRequest) SetBurieds(v *QueryMap) *InitDemoBbpInsuranceUserRequest {
	s.Burieds = v
	return s
}

type InitDemoBbpInsuranceUserResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s InitDemoBbpInsuranceUserResponse) String() string {
	return tea.Prettify(s)
}

func (s InitDemoBbpInsuranceUserResponse) GoString() string {
	return s.String()
}

func (s *InitDemoBbpInsuranceUserResponse) SetReqMsgId(v string) *InitDemoBbpInsuranceUserResponse {
	s.ReqMsgId = &v
	return s
}

func (s *InitDemoBbpInsuranceUserResponse) SetResultCode(v string) *InitDemoBbpInsuranceUserResponse {
	s.ResultCode = &v
	return s
}

func (s *InitDemoBbpInsuranceUserResponse) SetResultMsg(v string) *InitDemoBbpInsuranceUserResponse {
	s.ResultMsg = &v
	return s
}

type UpdateDemoCjtestCjRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 测试参数
	Var1 *string `json:"var1,omitempty" xml:"var1,omitempty" require:"true"`
	// 测试参数2
	Var2 *string `json:"var2,omitempty" xml:"var2,omitempty" require:"true"`
	// 被授权机构did
	Subject *string `json:"subject,omitempty" xml:"subject,omitempty"`
}

func (s UpdateDemoCjtestCjRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateDemoCjtestCjRequest) GoString() string {
	return s.String()
}

func (s *UpdateDemoCjtestCjRequest) SetAuthToken(v string) *UpdateDemoCjtestCjRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateDemoCjtestCjRequest) SetProductInstanceId(v string) *UpdateDemoCjtestCjRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateDemoCjtestCjRequest) SetVar1(v string) *UpdateDemoCjtestCjRequest {
	s.Var1 = &v
	return s
}

func (s *UpdateDemoCjtestCjRequest) SetVar2(v string) *UpdateDemoCjtestCjRequest {
	s.Var2 = &v
	return s
}

func (s *UpdateDemoCjtestCjRequest) SetSubject(v string) *UpdateDemoCjtestCjRequest {
	s.Subject = &v
	return s
}

type UpdateDemoCjtestCjResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 测试返回参数1
	Return1 *string `json:"return1,omitempty" xml:"return1,omitempty"`
}

func (s UpdateDemoCjtestCjResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateDemoCjtestCjResponse) GoString() string {
	return s.String()
}

func (s *UpdateDemoCjtestCjResponse) SetReqMsgId(v string) *UpdateDemoCjtestCjResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateDemoCjtestCjResponse) SetResultCode(v string) *UpdateDemoCjtestCjResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateDemoCjtestCjResponse) SetResultMsg(v string) *UpdateDemoCjtestCjResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateDemoCjtestCjResponse) SetReturn1(v string) *UpdateDemoCjtestCjResponse {
	s.Return1 = &v
	return s
}

type ResetDemoComCnCcRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// orderid
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
}

func (s ResetDemoComCnCcRequest) String() string {
	return tea.Prettify(s)
}

func (s ResetDemoComCnCcRequest) GoString() string {
	return s.String()
}

func (s *ResetDemoComCnCcRequest) SetAuthToken(v string) *ResetDemoComCnCcRequest {
	s.AuthToken = &v
	return s
}

func (s *ResetDemoComCnCcRequest) SetProductInstanceId(v string) *ResetDemoComCnCcRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ResetDemoComCnCcRequest) SetOrderId(v string) *ResetDemoComCnCcRequest {
	s.OrderId = &v
	return s
}

type ResetDemoComCnCcResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 订单id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty"`
}

func (s ResetDemoComCnCcResponse) String() string {
	return tea.Prettify(s)
}

func (s ResetDemoComCnCcResponse) GoString() string {
	return s.String()
}

func (s *ResetDemoComCnCcResponse) SetReqMsgId(v string) *ResetDemoComCnCcResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ResetDemoComCnCcResponse) SetResultCode(v string) *ResetDemoComCnCcResponse {
	s.ResultCode = &v
	return s
}

func (s *ResetDemoComCnCcResponse) SetResultMsg(v string) *ResetDemoComCnCcResponse {
	s.ResultMsg = &v
	return s
}

func (s *ResetDemoComCnCcResponse) SetOrderId(v string) *ResetDemoComCnCcResponse {
	s.OrderId = &v
	return s
}

type UploadDemoCjtestSourceFileRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// file
	// 待上传文件
	FileObject io.Reader `json:"fileObject,omitempty" xml:"fileObject,omitempty"`
	// 待上传文件名
	FileObjectName *string `json:"fileObjectName,omitempty" xml:"fileObjectName,omitempty"`
	FileId         *string `json:"file_id,omitempty" xml:"file_id,omitempty" require:"true"`
}

func (s UploadDemoCjtestSourceFileRequest) String() string {
	return tea.Prettify(s)
}

func (s UploadDemoCjtestSourceFileRequest) GoString() string {
	return s.String()
}

func (s *UploadDemoCjtestSourceFileRequest) SetAuthToken(v string) *UploadDemoCjtestSourceFileRequest {
	s.AuthToken = &v
	return s
}

func (s *UploadDemoCjtestSourceFileRequest) SetProductInstanceId(v string) *UploadDemoCjtestSourceFileRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UploadDemoCjtestSourceFileRequest) SetFileObject(v io.Reader) *UploadDemoCjtestSourceFileRequest {
	s.FileObject = v
	return s
}

func (s *UploadDemoCjtestSourceFileRequest) SetFileObjectName(v string) *UploadDemoCjtestSourceFileRequest {
	s.FileObjectName = &v
	return s
}

func (s *UploadDemoCjtestSourceFileRequest) SetFileId(v string) *UploadDemoCjtestSourceFileRequest {
	s.FileId = &v
	return s
}

type UploadDemoCjtestSourceFileResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// test
	Res *string `json:"res,omitempty" xml:"res,omitempty"`
}

func (s UploadDemoCjtestSourceFileResponse) String() string {
	return tea.Prettify(s)
}

func (s UploadDemoCjtestSourceFileResponse) GoString() string {
	return s.String()
}

func (s *UploadDemoCjtestSourceFileResponse) SetReqMsgId(v string) *UploadDemoCjtestSourceFileResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UploadDemoCjtestSourceFileResponse) SetResultCode(v string) *UploadDemoCjtestSourceFileResponse {
	s.ResultCode = &v
	return s
}

func (s *UploadDemoCjtestSourceFileResponse) SetResultMsg(v string) *UploadDemoCjtestSourceFileResponse {
	s.ResultMsg = &v
	return s
}

func (s *UploadDemoCjtestSourceFileResponse) SetRes(v string) *UploadDemoCjtestSourceFileResponse {
	s.Res = &v
	return s
}

type QueryDemoCjtestCjResRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s QueryDemoCjtestCjResRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDemoCjtestCjResRequest) GoString() string {
	return s.String()
}

func (s *QueryDemoCjtestCjResRequest) SetAuthToken(v string) *QueryDemoCjtestCjResRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDemoCjtestCjResRequest) SetProductInstanceId(v string) *QueryDemoCjtestCjResRequest {
	s.ProductInstanceId = &v
	return s
}

type QueryDemoCjtestCjResResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 字符串
	Res *string `json:"res,omitempty" xml:"res,omitempty"`
}

func (s QueryDemoCjtestCjResResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDemoCjtestCjResResponse) GoString() string {
	return s.String()
}

func (s *QueryDemoCjtestCjResResponse) SetReqMsgId(v string) *QueryDemoCjtestCjResResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDemoCjtestCjResResponse) SetResultCode(v string) *QueryDemoCjtestCjResResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDemoCjtestCjResResponse) SetResultMsg(v string) *QueryDemoCjtestCjResResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDemoCjtestCjResResponse) SetRes(v string) *QueryDemoCjtestCjResResponse {
	s.Res = &v
	return s
}

type ResetDemoCjtestApiAuthorizeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s ResetDemoCjtestApiAuthorizeRequest) String() string {
	return tea.Prettify(s)
}

func (s ResetDemoCjtestApiAuthorizeRequest) GoString() string {
	return s.String()
}

func (s *ResetDemoCjtestApiAuthorizeRequest) SetAuthToken(v string) *ResetDemoCjtestApiAuthorizeRequest {
	s.AuthToken = &v
	return s
}

func (s *ResetDemoCjtestApiAuthorizeRequest) SetProductInstanceId(v string) *ResetDemoCjtestApiAuthorizeRequest {
	s.ProductInstanceId = &v
	return s
}

type ResetDemoCjtestApiAuthorizeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s ResetDemoCjtestApiAuthorizeResponse) String() string {
	return tea.Prettify(s)
}

func (s ResetDemoCjtestApiAuthorizeResponse) GoString() string {
	return s.String()
}

func (s *ResetDemoCjtestApiAuthorizeResponse) SetReqMsgId(v string) *ResetDemoCjtestApiAuthorizeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ResetDemoCjtestApiAuthorizeResponse) SetResultCode(v string) *ResetDemoCjtestApiAuthorizeResponse {
	s.ResultCode = &v
	return s
}

func (s *ResetDemoCjtestApiAuthorizeResponse) SetResultMsg(v string) *ResetDemoCjtestApiAuthorizeResponse {
	s.ResultMsg = &v
	return s
}

type InitDemoGatewayRoadRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 请求时间
	Time *string `json:"time,omitempty" xml:"time,omitempty" require:"true"`
	// 操作人
	Operator *string `json:"operator,omitempty" xml:"operator,omitempty" require:"true"`
	// 请求编号
	Count *int64 `json:"count,omitempty" xml:"count,omitempty" require:"true"`
	// 请求描述
	Desc *string `json:"desc,omitempty" xml:"desc,omitempty"`
}

func (s InitDemoGatewayRoadRequest) String() string {
	return tea.Prettify(s)
}

func (s InitDemoGatewayRoadRequest) GoString() string {
	return s.String()
}

func (s *InitDemoGatewayRoadRequest) SetAuthToken(v string) *InitDemoGatewayRoadRequest {
	s.AuthToken = &v
	return s
}

func (s *InitDemoGatewayRoadRequest) SetProductInstanceId(v string) *InitDemoGatewayRoadRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *InitDemoGatewayRoadRequest) SetTime(v string) *InitDemoGatewayRoadRequest {
	s.Time = &v
	return s
}

func (s *InitDemoGatewayRoadRequest) SetOperator(v string) *InitDemoGatewayRoadRequest {
	s.Operator = &v
	return s
}

func (s *InitDemoGatewayRoadRequest) SetCount(v int64) *InitDemoGatewayRoadRequest {
	s.Count = &v
	return s
}

func (s *InitDemoGatewayRoadRequest) SetDesc(v string) *InitDemoGatewayRoadRequest {
	s.Desc = &v
	return s
}

type InitDemoGatewayRoadResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回desc
	InitDesc *string `json:"init_desc,omitempty" xml:"init_desc,omitempty"`
	// 组合返回请求结果
	InitPack *InitPack `json:"init_pack,omitempty" xml:"init_pack,omitempty"`
}

func (s InitDemoGatewayRoadResponse) String() string {
	return tea.Prettify(s)
}

func (s InitDemoGatewayRoadResponse) GoString() string {
	return s.String()
}

func (s *InitDemoGatewayRoadResponse) SetReqMsgId(v string) *InitDemoGatewayRoadResponse {
	s.ReqMsgId = &v
	return s
}

func (s *InitDemoGatewayRoadResponse) SetResultCode(v string) *InitDemoGatewayRoadResponse {
	s.ResultCode = &v
	return s
}

func (s *InitDemoGatewayRoadResponse) SetResultMsg(v string) *InitDemoGatewayRoadResponse {
	s.ResultMsg = &v
	return s
}

func (s *InitDemoGatewayRoadResponse) SetInitDesc(v string) *InitDemoGatewayRoadResponse {
	s.InitDesc = &v
	return s
}

func (s *InitDemoGatewayRoadResponse) SetInitPack(v *InitPack) *InitDemoGatewayRoadResponse {
	s.InitPack = v
	return s
}

type ImportDemoComCnTestRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 1
	// 待上传文件
	FileObject io.Reader `json:"fileObject,omitempty" xml:"fileObject,omitempty"`
	// 待上传文件名
	FileObjectName *string `json:"fileObjectName,omitempty" xml:"fileObjectName,omitempty"`
	FileId         *string `json:"file_id,omitempty" xml:"file_id,omitempty" require:"true"`
}

func (s ImportDemoComCnTestRequest) String() string {
	return tea.Prettify(s)
}

func (s ImportDemoComCnTestRequest) GoString() string {
	return s.String()
}

func (s *ImportDemoComCnTestRequest) SetAuthToken(v string) *ImportDemoComCnTestRequest {
	s.AuthToken = &v
	return s
}

func (s *ImportDemoComCnTestRequest) SetProductInstanceId(v string) *ImportDemoComCnTestRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ImportDemoComCnTestRequest) SetFileObject(v io.Reader) *ImportDemoComCnTestRequest {
	s.FileObject = v
	return s
}

func (s *ImportDemoComCnTestRequest) SetFileObjectName(v string) *ImportDemoComCnTestRequest {
	s.FileObjectName = &v
	return s
}

func (s *ImportDemoComCnTestRequest) SetFileId(v string) *ImportDemoComCnTestRequest {
	s.FileId = &v
	return s
}

type ImportDemoComCnTestResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s ImportDemoComCnTestResponse) String() string {
	return tea.Prettify(s)
}

func (s ImportDemoComCnTestResponse) GoString() string {
	return s.String()
}

func (s *ImportDemoComCnTestResponse) SetReqMsgId(v string) *ImportDemoComCnTestResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ImportDemoComCnTestResponse) SetResultCode(v string) *ImportDemoComCnTestResponse {
	s.ResultCode = &v
	return s
}

func (s *ImportDemoComCnTestResponse) SetResultMsg(v string) *ImportDemoComCnTestResponse {
	s.ResultMsg = &v
	return s
}

type PublishDemoSaasTestTestcRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 张三
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 14
	Age *int64 `json:"age,omitempty" xml:"age,omitempty" require:"true"`
}

func (s PublishDemoSaasTestTestcRequest) String() string {
	return tea.Prettify(s)
}

func (s PublishDemoSaasTestTestcRequest) GoString() string {
	return s.String()
}

func (s *PublishDemoSaasTestTestcRequest) SetAuthToken(v string) *PublishDemoSaasTestTestcRequest {
	s.AuthToken = &v
	return s
}

func (s *PublishDemoSaasTestTestcRequest) SetProductInstanceId(v string) *PublishDemoSaasTestTestcRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PublishDemoSaasTestTestcRequest) SetName(v string) *PublishDemoSaasTestTestcRequest {
	s.Name = &v
	return s
}

func (s *PublishDemoSaasTestTestcRequest) SetAge(v int64) *PublishDemoSaasTestTestcRequest {
	s.Age = &v
	return s
}

type PublishDemoSaasTestTestcResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 男
	Sex *string `json:"sex,omitempty" xml:"sex,omitempty"`
}

func (s PublishDemoSaasTestTestcResponse) String() string {
	return tea.Prettify(s)
}

func (s PublishDemoSaasTestTestcResponse) GoString() string {
	return s.String()
}

func (s *PublishDemoSaasTestTestcResponse) SetReqMsgId(v string) *PublishDemoSaasTestTestcResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PublishDemoSaasTestTestcResponse) SetResultCode(v string) *PublishDemoSaasTestTestcResponse {
	s.ResultCode = &v
	return s
}

func (s *PublishDemoSaasTestTestcResponse) SetResultMsg(v string) *PublishDemoSaasTestTestcResponse {
	s.ResultMsg = &v
	return s
}

func (s *PublishDemoSaasTestTestcResponse) SetSex(v string) *PublishDemoSaasTestTestcResponse {
	s.Sex = &v
	return s
}

type ResetDemoSaasTestTestdRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// test
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
}

func (s ResetDemoSaasTestTestdRequest) String() string {
	return tea.Prettify(s)
}

func (s ResetDemoSaasTestTestdRequest) GoString() string {
	return s.String()
}

func (s *ResetDemoSaasTestTestdRequest) SetAuthToken(v string) *ResetDemoSaasTestTestdRequest {
	s.AuthToken = &v
	return s
}

func (s *ResetDemoSaasTestTestdRequest) SetProductInstanceId(v string) *ResetDemoSaasTestTestdRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ResetDemoSaasTestTestdRequest) SetName(v string) *ResetDemoSaasTestTestdRequest {
	s.Name = &v
	return s
}

type ResetDemoSaasTestTestdResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// test
	Age *string `json:"age,omitempty" xml:"age,omitempty"`
}

func (s ResetDemoSaasTestTestdResponse) String() string {
	return tea.Prettify(s)
}

func (s ResetDemoSaasTestTestdResponse) GoString() string {
	return s.String()
}

func (s *ResetDemoSaasTestTestdResponse) SetReqMsgId(v string) *ResetDemoSaasTestTestdResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ResetDemoSaasTestTestdResponse) SetResultCode(v string) *ResetDemoSaasTestTestdResponse {
	s.ResultCode = &v
	return s
}

func (s *ResetDemoSaasTestTestdResponse) SetResultMsg(v string) *ResetDemoSaasTestTestdResponse {
	s.ResultMsg = &v
	return s
}

func (s *ResetDemoSaasTestTestdResponse) SetAge(v string) *ResetDemoSaasTestTestdResponse {
	s.Age = &v
	return s
}

type OperateDemoSaasTestTesteRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// test
	Age *string `json:"age,omitempty" xml:"age,omitempty" require:"true"`
}

func (s OperateDemoSaasTestTesteRequest) String() string {
	return tea.Prettify(s)
}

func (s OperateDemoSaasTestTesteRequest) GoString() string {
	return s.String()
}

func (s *OperateDemoSaasTestTesteRequest) SetAuthToken(v string) *OperateDemoSaasTestTesteRequest {
	s.AuthToken = &v
	return s
}

func (s *OperateDemoSaasTestTesteRequest) SetProductInstanceId(v string) *OperateDemoSaasTestTesteRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *OperateDemoSaasTestTesteRequest) SetAge(v string) *OperateDemoSaasTestTesteRequest {
	s.Age = &v
	return s
}

type OperateDemoSaasTestTesteResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// test
	Age *string `json:"age,omitempty" xml:"age,omitempty"`
}

func (s OperateDemoSaasTestTesteResponse) String() string {
	return tea.Prettify(s)
}

func (s OperateDemoSaasTestTesteResponse) GoString() string {
	return s.String()
}

func (s *OperateDemoSaasTestTesteResponse) SetReqMsgId(v string) *OperateDemoSaasTestTesteResponse {
	s.ReqMsgId = &v
	return s
}

func (s *OperateDemoSaasTestTesteResponse) SetResultCode(v string) *OperateDemoSaasTestTesteResponse {
	s.ResultCode = &v
	return s
}

func (s *OperateDemoSaasTestTesteResponse) SetResultMsg(v string) *OperateDemoSaasTestTesteResponse {
	s.ResultMsg = &v
	return s
}

func (s *OperateDemoSaasTestTesteResponse) SetAge(v string) *OperateDemoSaasTestTesteResponse {
	s.Age = &v
	return s
}

type BatchcreateDemoSaasTestTestfRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// test
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
}

func (s BatchcreateDemoSaasTestTestfRequest) String() string {
	return tea.Prettify(s)
}

func (s BatchcreateDemoSaasTestTestfRequest) GoString() string {
	return s.String()
}

func (s *BatchcreateDemoSaasTestTestfRequest) SetAuthToken(v string) *BatchcreateDemoSaasTestTestfRequest {
	s.AuthToken = &v
	return s
}

func (s *BatchcreateDemoSaasTestTestfRequest) SetProductInstanceId(v string) *BatchcreateDemoSaasTestTestfRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *BatchcreateDemoSaasTestTestfRequest) SetName(v string) *BatchcreateDemoSaasTestTestfRequest {
	s.Name = &v
	return s
}

type BatchcreateDemoSaasTestTestfResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// test
	Age *string `json:"age,omitempty" xml:"age,omitempty"`
}

func (s BatchcreateDemoSaasTestTestfResponse) String() string {
	return tea.Prettify(s)
}

func (s BatchcreateDemoSaasTestTestfResponse) GoString() string {
	return s.String()
}

func (s *BatchcreateDemoSaasTestTestfResponse) SetReqMsgId(v string) *BatchcreateDemoSaasTestTestfResponse {
	s.ReqMsgId = &v
	return s
}

func (s *BatchcreateDemoSaasTestTestfResponse) SetResultCode(v string) *BatchcreateDemoSaasTestTestfResponse {
	s.ResultCode = &v
	return s
}

func (s *BatchcreateDemoSaasTestTestfResponse) SetResultMsg(v string) *BatchcreateDemoSaasTestTestfResponse {
	s.ResultMsg = &v
	return s
}

func (s *BatchcreateDemoSaasTestTestfResponse) SetAge(v string) *BatchcreateDemoSaasTestTestfResponse {
	s.Age = &v
	return s
}

type CreateDemoSaasTestTesthRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// test
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
}

func (s CreateDemoSaasTestTesthRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateDemoSaasTestTesthRequest) GoString() string {
	return s.String()
}

func (s *CreateDemoSaasTestTesthRequest) SetAuthToken(v string) *CreateDemoSaasTestTesthRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateDemoSaasTestTesthRequest) SetProductInstanceId(v string) *CreateDemoSaasTestTesthRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateDemoSaasTestTesthRequest) SetName(v string) *CreateDemoSaasTestTesthRequest {
	s.Name = &v
	return s
}

type CreateDemoSaasTestTesthResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// test
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
}

func (s CreateDemoSaasTestTesthResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateDemoSaasTestTesthResponse) GoString() string {
	return s.String()
}

func (s *CreateDemoSaasTestTesthResponse) SetReqMsgId(v string) *CreateDemoSaasTestTesthResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateDemoSaasTestTesthResponse) SetResultCode(v string) *CreateDemoSaasTestTesthResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateDemoSaasTestTesthResponse) SetResultMsg(v string) *CreateDemoSaasTestTesthResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateDemoSaasTestTesthResponse) SetName(v string) *CreateDemoSaasTestTesthResponse {
	s.Name = &v
	return s
}

type CreateDemoSaasTestTestiRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s CreateDemoSaasTestTestiRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateDemoSaasTestTestiRequest) GoString() string {
	return s.String()
}

func (s *CreateDemoSaasTestTestiRequest) SetAuthToken(v string) *CreateDemoSaasTestTestiRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateDemoSaasTestTestiRequest) SetProductInstanceId(v string) *CreateDemoSaasTestTestiRequest {
	s.ProductInstanceId = &v
	return s
}

type CreateDemoSaasTestTestiResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// test
	Sex *string `json:"sex,omitempty" xml:"sex,omitempty"`
}

func (s CreateDemoSaasTestTestiResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateDemoSaasTestTestiResponse) GoString() string {
	return s.String()
}

func (s *CreateDemoSaasTestTestiResponse) SetReqMsgId(v string) *CreateDemoSaasTestTestiResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateDemoSaasTestTestiResponse) SetResultCode(v string) *CreateDemoSaasTestTestiResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateDemoSaasTestTestiResponse) SetResultMsg(v string) *CreateDemoSaasTestTestiResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateDemoSaasTestTestiResponse) SetSex(v string) *CreateDemoSaasTestTestiResponse {
	s.Sex = &v
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
				"sdk_version":      tea.String("1.0.1"),
				"_prod_code":       tea.String("ak_ff19a88a999c4b3587aa011598273c77"),
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
 * Description: Demo接口，返回当前服务器当前状态1
 * Summary: 检查服务状态
 */
func (client *Client) StatusDemoGatewayCheck(request *StatusDemoGatewayCheckRequest) (_result *StatusDemoGatewayCheckResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &StatusDemoGatewayCheckResponse{}
	_body, _err := client.StatusDemoGatewayCheckEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: Demo接口，返回当前服务器当前状态1
 * Summary: 检查服务状态
 */
func (client *Client) StatusDemoGatewayCheckEx(request *StatusDemoGatewayCheckRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *StatusDemoGatewayCheckResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &StatusDemoGatewayCheckResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.gateway.check.status"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: Demo接口，返回当输入的值
 * Summary: 返回输入值
 */
func (client *Client) EchoDemoGatewayCheck(request *EchoDemoGatewayCheckRequest) (_result *EchoDemoGatewayCheckResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &EchoDemoGatewayCheckResponse{}
	_body, _err := client.EchoDemoGatewayCheckEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: Demo接口，返回当输入的值
 * Summary: 返回输入值
 */
func (client *Client) EchoDemoGatewayCheckEx(request *EchoDemoGatewayCheckRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *EchoDemoGatewayCheckResponse, _err error) {
	if !tea.BoolValue(util.IsUnset(request.FileObject)) {
		uploadReq := &CreateAntcloudGatewayxFileUploadRequest{
			AuthToken: request.AuthToken,
			ApiCode:   tea.String("demo.gateway.check.echo"),
			FileName:  request.FileObjectName,
		}
		uploadResp, _err := client.CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime)
		if _err != nil {
			return _result, _err
		}

		if !tea.BoolValue(antchainutil.IsSuccess(uploadResp.ResultCode, tea.String("ok"))) {
			echoDemoGatewayCheckResponse := &EchoDemoGatewayCheckResponse{
				ReqMsgId:   uploadResp.ReqMsgId,
				ResultCode: uploadResp.ResultCode,
				ResultMsg:  uploadResp.ResultMsg,
			}
			_result = echoDemoGatewayCheckResponse
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
	_result = &EchoDemoGatewayCheckResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.gateway.check.echo"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: ceshi
 * Summary: ss
 */
func (client *Client) QueryDemoGatewayCheck(request *QueryDemoGatewayCheckRequest) (_result *QueryDemoGatewayCheckResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDemoGatewayCheckResponse{}
	_body, _err := client.QueryDemoGatewayCheckEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: ceshi
 * Summary: ss
 */
func (client *Client) QueryDemoGatewayCheckEx(request *QueryDemoGatewayCheckRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDemoGatewayCheckResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDemoGatewayCheckResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.gateway.check.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: s
 * Summary: ss
 */
func (client *Client) BindDemoDemoCheckEee(request *BindDemoDemoCheckEeeRequest) (_result *BindDemoDemoCheckEeeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &BindDemoDemoCheckEeeResponse{}
	_body, _err := client.BindDemoDemoCheckEeeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: s
 * Summary: ss
 */
func (client *Client) BindDemoDemoCheckEeeEx(request *BindDemoDemoCheckEeeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *BindDemoDemoCheckEeeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &BindDemoDemoCheckEeeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.demo.check.eee.bind"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: test
 * Summary: test
 */
func (client *Client) BindDemoGatewayAbcTest(request *BindDemoGatewayAbcTestRequest) (_result *BindDemoGatewayAbcTestResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &BindDemoGatewayAbcTestResponse{}
	_body, _err := client.BindDemoGatewayAbcTestEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: test
 * Summary: test
 */
func (client *Client) BindDemoGatewayAbcTestEx(request *BindDemoGatewayAbcTestRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *BindDemoGatewayAbcTestResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &BindDemoGatewayAbcTestResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.gateway.abc.test.bind"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 超时测试
 * Summary: 超时
 */
func (client *Client) QueryDemoGatewayCheckEchotimeout(request *QueryDemoGatewayCheckEchotimeoutRequest) (_result *QueryDemoGatewayCheckEchotimeoutResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDemoGatewayCheckEchotimeoutResponse{}
	_body, _err := client.QueryDemoGatewayCheckEchotimeoutEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 超时测试
 * Summary: 超时
 */
func (client *Client) QueryDemoGatewayCheckEchotimeoutEx(request *QueryDemoGatewayCheckEchotimeoutRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDemoGatewayCheckEchotimeoutResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDemoGatewayCheckEchotimeoutResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.gateway.check.echotimeout.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 10  测测aa
 * Summary: 10s
 */
func (client *Client) QueryDemoGatewayCheckEchoten(request *QueryDemoGatewayCheckEchotenRequest) (_result *QueryDemoGatewayCheckEchotenResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDemoGatewayCheckEchotenResponse{}
	_body, _err := client.QueryDemoGatewayCheckEchotenEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 10  测测aa
 * Summary: 10s
 */
func (client *Client) QueryDemoGatewayCheckEchotenEx(request *QueryDemoGatewayCheckEchotenRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDemoGatewayCheckEchotenResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDemoGatewayCheckEchotenResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.gateway.check.echoten.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 保司用户埋点信息
 * Summary: 用户登陆页面埋点
 */
func (client *Client) InitDemoBbpInsuranceUser(request *InitDemoBbpInsuranceUserRequest) (_result *InitDemoBbpInsuranceUserResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &InitDemoBbpInsuranceUserResponse{}
	_body, _err := client.InitDemoBbpInsuranceUserEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 保司用户埋点信息
 * Summary: 用户登陆页面埋点
 */
func (client *Client) InitDemoBbpInsuranceUserEx(request *InitDemoBbpInsuranceUserRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *InitDemoBbpInsuranceUserResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &InitDemoBbpInsuranceUserResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.bbp.insurance.user.init"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 测试网关评审能力
 * Summary: 评审测试
 */
func (client *Client) UpdateDemoCjtestCj(request *UpdateDemoCjtestCjRequest) (_result *UpdateDemoCjtestCjResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateDemoCjtestCjResponse{}
	_body, _err := client.UpdateDemoCjtestCjEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 测试网关评审能力
 * Summary: 评审测试
 */
func (client *Client) UpdateDemoCjtestCjEx(request *UpdateDemoCjtestCjRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateDemoCjtestCjResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateDemoCjtestCjResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.cjtest.cj.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 测试api描述
 * Summary: api简介
 */
func (client *Client) ResetDemoComCnCc(request *ResetDemoComCnCcRequest) (_result *ResetDemoComCnCcResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ResetDemoComCnCcResponse{}
	_body, _err := client.ResetDemoComCnCcEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 测试api描述
 * Summary: api简介
 */
func (client *Client) ResetDemoComCnCcEx(request *ResetDemoComCnCcRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ResetDemoComCnCcResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ResetDemoComCnCcResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.com.cn.cc.reset"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 文件测试
 * Summary: 文件测试
 */
func (client *Client) UploadDemoCjtestSourceFile(request *UploadDemoCjtestSourceFileRequest) (_result *UploadDemoCjtestSourceFileResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UploadDemoCjtestSourceFileResponse{}
	_body, _err := client.UploadDemoCjtestSourceFileEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 文件测试
 * Summary: 文件测试
 */
func (client *Client) UploadDemoCjtestSourceFileEx(request *UploadDemoCjtestSourceFileRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UploadDemoCjtestSourceFileResponse, _err error) {
	if !tea.BoolValue(util.IsUnset(request.FileObject)) {
		uploadReq := &CreateAntcloudGatewayxFileUploadRequest{
			AuthToken: request.AuthToken,
			ApiCode:   tea.String("demo.cjtest.source.file.upload"),
			FileName:  request.FileObjectName,
		}
		uploadResp, _err := client.CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime)
		if _err != nil {
			return _result, _err
		}

		if !tea.BoolValue(antchainutil.IsSuccess(uploadResp.ResultCode, tea.String("ok"))) {
			uploadDemoCjtestSourceFileResponse := &UploadDemoCjtestSourceFileResponse{
				ReqMsgId:   uploadResp.ReqMsgId,
				ResultCode: uploadResp.ResultCode,
				ResultMsg:  uploadResp.ResultMsg,
			}
			_result = uploadDemoCjtestSourceFileResponse
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
	_result = &UploadDemoCjtestSourceFileResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.cjtest.source.file.upload"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 测试返回值限制
 * Summary: dev测试返回值限制
 */
func (client *Client) QueryDemoCjtestCjRes(request *QueryDemoCjtestCjResRequest) (_result *QueryDemoCjtestCjResResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDemoCjtestCjResResponse{}
	_body, _err := client.QueryDemoCjtestCjResEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 测试返回值限制
 * Summary: dev测试返回值限制
 */
func (client *Client) QueryDemoCjtestCjResEx(request *QueryDemoCjtestCjResRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDemoCjtestCjResResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDemoCjtestCjResResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.cjtest.cj.res.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: test
 * Summary: test
 */
func (client *Client) ResetDemoCjtestApiAuthorize(request *ResetDemoCjtestApiAuthorizeRequest) (_result *ResetDemoCjtestApiAuthorizeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ResetDemoCjtestApiAuthorizeResponse{}
	_body, _err := client.ResetDemoCjtestApiAuthorizeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: test
 * Summary: test
 */
func (client *Client) ResetDemoCjtestApiAuthorizeEx(request *ResetDemoCjtestApiAuthorizeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ResetDemoCjtestApiAuthorizeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ResetDemoCjtestApiAuthorizeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.cjtest.api.authorize.reset"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 根据入参组合返回结果，Fr 自动化连通性测试。
 * Summary: road.init（Fr AutoT）
 */
func (client *Client) InitDemoGatewayRoad(request *InitDemoGatewayRoadRequest) (_result *InitDemoGatewayRoadResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &InitDemoGatewayRoadResponse{}
	_body, _err := client.InitDemoGatewayRoadEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 根据入参组合返回结果，Fr 自动化连通性测试。
 * Summary: road.init（Fr AutoT）
 */
func (client *Client) InitDemoGatewayRoadEx(request *InitDemoGatewayRoadRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *InitDemoGatewayRoadResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &InitDemoGatewayRoadResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.gateway.road.init"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 1
 * Summary: api简介
 */
func (client *Client) ImportDemoComCnTest(request *ImportDemoComCnTestRequest) (_result *ImportDemoComCnTestResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ImportDemoComCnTestResponse{}
	_body, _err := client.ImportDemoComCnTestEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 1
 * Summary: api简介
 */
func (client *Client) ImportDemoComCnTestEx(request *ImportDemoComCnTestRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ImportDemoComCnTestResponse, _err error) {
	if !tea.BoolValue(util.IsUnset(request.FileObject)) {
		uploadReq := &CreateAntcloudGatewayxFileUploadRequest{
			AuthToken: request.AuthToken,
			ApiCode:   tea.String("demo.com.cn.test.import"),
			FileName:  request.FileObjectName,
		}
		uploadResp, _err := client.CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime)
		if _err != nil {
			return _result, _err
		}

		if !tea.BoolValue(antchainutil.IsSuccess(uploadResp.ResultCode, tea.String("ok"))) {
			importDemoComCnTestResponse := &ImportDemoComCnTestResponse{
				ReqMsgId:   uploadResp.ReqMsgId,
				ResultCode: uploadResp.ResultCode,
				ResultMsg:  uploadResp.ResultMsg,
			}
			_result = importDemoComCnTestResponse
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
	_result = &ImportDemoComCnTestResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.com.cn.test.import"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: testc
 * Summary: 测试用api
 */
func (client *Client) PublishDemoSaasTestTestc(request *PublishDemoSaasTestTestcRequest) (_result *PublishDemoSaasTestTestcResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PublishDemoSaasTestTestcResponse{}
	_body, _err := client.PublishDemoSaasTestTestcEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: testc
 * Summary: 测试用api
 */
func (client *Client) PublishDemoSaasTestTestcEx(request *PublishDemoSaasTestTestcRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PublishDemoSaasTestTestcResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PublishDemoSaasTestTestcResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.saas.test.testc.publish"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 共享能力租户流量测试
 * Summary: 共享能力租户流量测试
 */
func (client *Client) ResetDemoSaasTestTestd(request *ResetDemoSaasTestTestdRequest) (_result *ResetDemoSaasTestTestdResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ResetDemoSaasTestTestdResponse{}
	_body, _err := client.ResetDemoSaasTestTestdEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 共享能力租户流量测试
 * Summary: 共享能力租户流量测试
 */
func (client *Client) ResetDemoSaasTestTestdEx(request *ResetDemoSaasTestTestdRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ResetDemoSaasTestTestdResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ResetDemoSaasTestTestdResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.saas.test.testd.reset"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 共享能力租户流量测试
 * Summary: 共享能力租户流量测试
 */
func (client *Client) OperateDemoSaasTestTeste(request *OperateDemoSaasTestTesteRequest) (_result *OperateDemoSaasTestTesteResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &OperateDemoSaasTestTesteResponse{}
	_body, _err := client.OperateDemoSaasTestTesteEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 共享能力租户流量测试
 * Summary: 共享能力租户流量测试
 */
func (client *Client) OperateDemoSaasTestTesteEx(request *OperateDemoSaasTestTesteRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *OperateDemoSaasTestTesteResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &OperateDemoSaasTestTesteResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.saas.test.teste.operate"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 共享能力租户流量测试
 * Summary: 共享能力租户流量测试
 */
func (client *Client) BatchcreateDemoSaasTestTestf(request *BatchcreateDemoSaasTestTestfRequest) (_result *BatchcreateDemoSaasTestTestfResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &BatchcreateDemoSaasTestTestfResponse{}
	_body, _err := client.BatchcreateDemoSaasTestTestfEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 共享能力租户流量测试
 * Summary: 共享能力租户流量测试
 */
func (client *Client) BatchcreateDemoSaasTestTestfEx(request *BatchcreateDemoSaasTestTestfRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *BatchcreateDemoSaasTestTestfResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &BatchcreateDemoSaasTestTestfResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.saas.test.testf.batchcreate"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 共享能力租户流量测试
 * Summary: 共享能力租户流量测试
 */
func (client *Client) CreateDemoSaasTestTesth(request *CreateDemoSaasTestTesthRequest) (_result *CreateDemoSaasTestTesthResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateDemoSaasTestTesthResponse{}
	_body, _err := client.CreateDemoSaasTestTesthEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 共享能力租户流量测试
 * Summary: 共享能力租户流量测试
 */
func (client *Client) CreateDemoSaasTestTesthEx(request *CreateDemoSaasTestTesthRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateDemoSaasTestTesthResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateDemoSaasTestTesthResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.saas.test.testh.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 共享能力租户流量测试
 * Summary: 共享能力租户流量测试
 */
func (client *Client) CreateDemoSaasTestTesti(request *CreateDemoSaasTestTestiRequest) (_result *CreateDemoSaasTestTestiResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateDemoSaasTestTestiResponse{}
	_body, _err := client.CreateDemoSaasTestTestiEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 共享能力租户流量测试
 * Summary: 共享能力租户流量测试
 */
func (client *Client) CreateDemoSaasTestTestiEx(request *CreateDemoSaasTestTestiRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateDemoSaasTestTestiResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateDemoSaasTestTestiResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.saas.test.testi.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
