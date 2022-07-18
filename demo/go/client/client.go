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

// Demo类
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

// test
type TestClass struct {
	// 1
	Test *string `json:"test,omitempty" xml:"test,omitempty" require:"true"`
	// 2
	Demo *string `json:"demo,omitempty" xml:"demo,omitempty" require:"true"`
	// 3
	Demo1 *string `json:"demo1,omitempty" xml:"demo1,omitempty" require:"true"`
}

func (s TestClass) String() string {
	return tea.Prettify(s)
}

func (s TestClass) GoString() string {
	return s.String()
}

func (s *TestClass) SetTest(v string) *TestClass {
	s.Test = &v
	return s
}

func (s *TestClass) SetDemo(v string) *TestClass {
	s.Demo = &v
	return s
}

func (s *TestClass) SetDemo1(v string) *TestClass {
	s.Demo1 = &v
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

// 另一个Demo类
type AnotherClass struct {
	// 测试字段
	Bar *string `json:"bar,omitempty" xml:"bar,omitempty" require:"true"`
	// 引用字段
	Ref *DemoClass `json:"ref,omitempty" xml:"ref,omitempty" require:"true"`
	// 列表引用Struct
	RefList []*DemoClass `json:"refList,omitempty" xml:"refList,omitempty" type:"Repeated"`
}

func (s AnotherClass) String() string {
	return tea.Prettify(s)
}

func (s AnotherClass) GoString() string {
	return s.String()
}

func (s *AnotherClass) SetBar(v string) *AnotherClass {
	s.Bar = &v
	return s
}

func (s *AnotherClass) SetRef(v *DemoClass) *AnotherClass {
	s.Ref = v
	return s
}

func (s *AnotherClass) SetRefList(v []*DemoClass) *AnotherClass {
	s.RefList = v
	return s
}

// 自动化测试创建（勿删）
type TestsT struct {
}

func (s TestsT) String() string {
	return tea.Prettify(s)
}

func (s TestsT) GoString() string {
	return s.String()
}

// 自动化测试创建（用于测试编辑功能，勿删）
type AbcdEfgh struct {
}

func (s AbcdEfgh) String() string {
	return tea.Prettify(s)
}

func (s AbcdEfgh) GoString() string {
	return s.String()
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

type BindQweQweRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s BindQweQweRequest) String() string {
	return tea.Prettify(s)
}

func (s BindQweQweRequest) GoString() string {
	return s.String()
}

func (s *BindQweQweRequest) SetAuthToken(v string) *BindQweQweRequest {
	s.AuthToken = &v
	return s
}

func (s *BindQweQweRequest) SetProductInstanceId(v string) *BindQweQweRequest {
	s.ProductInstanceId = &v
	return s
}

type BindQweQweResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s BindQweQweResponse) String() string {
	return tea.Prettify(s)
}

func (s BindQweQweResponse) GoString() string {
	return s.String()
}

func (s *BindQweQweResponse) SetReqMsgId(v string) *BindQweQweResponse {
	s.ReqMsgId = &v
	return s
}

func (s *BindQweQweResponse) SetResultCode(v string) *BindQweQweResponse {
	s.ResultCode = &v
	return s
}

func (s *BindQweQweResponse) SetResultMsg(v string) *BindQweQweResponse {
	s.ResultMsg = &v
	return s
}

type BindSdfSssSssRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s BindSdfSssSssRequest) String() string {
	return tea.Prettify(s)
}

func (s BindSdfSssSssRequest) GoString() string {
	return s.String()
}

func (s *BindSdfSssSssRequest) SetAuthToken(v string) *BindSdfSssSssRequest {
	s.AuthToken = &v
	return s
}

func (s *BindSdfSssSssRequest) SetProductInstanceId(v string) *BindSdfSssSssRequest {
	s.ProductInstanceId = &v
	return s
}

type BindSdfSssSssResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s BindSdfSssSssResponse) String() string {
	return tea.Prettify(s)
}

func (s BindSdfSssSssResponse) GoString() string {
	return s.String()
}

func (s *BindSdfSssSssResponse) SetReqMsgId(v string) *BindSdfSssSssResponse {
	s.ReqMsgId = &v
	return s
}

func (s *BindSdfSssSssResponse) SetResultCode(v string) *BindSdfSssSssResponse {
	s.ResultCode = &v
	return s
}

func (s *BindSdfSssSssResponse) SetResultMsg(v string) *BindSdfSssSssResponse {
	s.ResultMsg = &v
	return s
}

type StatusGatewayCheckRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s StatusGatewayCheckRequest) String() string {
	return tea.Prettify(s)
}

func (s StatusGatewayCheckRequest) GoString() string {
	return s.String()
}

func (s *StatusGatewayCheckRequest) SetAuthToken(v string) *StatusGatewayCheckRequest {
	s.AuthToken = &v
	return s
}

func (s *StatusGatewayCheckRequest) SetProductInstanceId(v string) *StatusGatewayCheckRequest {
	s.ProductInstanceId = &v
	return s
}

type StatusGatewayCheckResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// OK
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
}

func (s StatusGatewayCheckResponse) String() string {
	return tea.Prettify(s)
}

func (s StatusGatewayCheckResponse) GoString() string {
	return s.String()
}

func (s *StatusGatewayCheckResponse) SetReqMsgId(v string) *StatusGatewayCheckResponse {
	s.ReqMsgId = &v
	return s
}

func (s *StatusGatewayCheckResponse) SetResultCode(v string) *StatusGatewayCheckResponse {
	s.ResultCode = &v
	return s
}

func (s *StatusGatewayCheckResponse) SetResultMsg(v string) *StatusGatewayCheckResponse {
	s.ResultMsg = &v
	return s
}

func (s *StatusGatewayCheckResponse) SetStatus(v string) *StatusGatewayCheckResponse {
	s.Status = &v
	return s
}

type EchoGatewayCheckRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// demo
	InputDemo *DemoClass `json:"input_demo,omitempty" xml:"input_demo,omitempty"`
	// echo
	InputString *string `json:"input_string,omitempty" xml:"input_string,omitempty" maxLength:"20" minLength:"1"`
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

func (s EchoGatewayCheckRequest) String() string {
	return tea.Prettify(s)
}

func (s EchoGatewayCheckRequest) GoString() string {
	return s.String()
}

func (s *EchoGatewayCheckRequest) SetAuthToken(v string) *EchoGatewayCheckRequest {
	s.AuthToken = &v
	return s
}

func (s *EchoGatewayCheckRequest) SetProductInstanceId(v string) *EchoGatewayCheckRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *EchoGatewayCheckRequest) SetInputDemo(v *DemoClass) *EchoGatewayCheckRequest {
	s.InputDemo = v
	return s
}

func (s *EchoGatewayCheckRequest) SetInputString(v string) *EchoGatewayCheckRequest {
	s.InputString = &v
	return s
}

func (s *EchoGatewayCheckRequest) SetInputArray(v []*TestStruct) *EchoGatewayCheckRequest {
	s.InputArray = v
	return s
}

func (s *EchoGatewayCheckRequest) SetFileObject(v io.Reader) *EchoGatewayCheckRequest {
	s.FileObject = v
	return s
}

func (s *EchoGatewayCheckRequest) SetFileObjectName(v string) *EchoGatewayCheckRequest {
	s.FileObjectName = &v
	return s
}

func (s *EchoGatewayCheckRequest) SetFileId(v string) *EchoGatewayCheckRequest {
	s.FileId = &v
	return s
}

func (s *EchoGatewayCheckRequest) SetInputInt(v int64) *EchoGatewayCheckRequest {
	s.InputInt = &v
	return s
}

func (s *EchoGatewayCheckRequest) SetFileName(v string) *EchoGatewayCheckRequest {
	s.FileName = &v
	return s
}

type EchoGatewayCheckResponse struct {
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

func (s EchoGatewayCheckResponse) String() string {
	return tea.Prettify(s)
}

func (s EchoGatewayCheckResponse) GoString() string {
	return s.String()
}

func (s *EchoGatewayCheckResponse) SetReqMsgId(v string) *EchoGatewayCheckResponse {
	s.ReqMsgId = &v
	return s
}

func (s *EchoGatewayCheckResponse) SetResultCode(v string) *EchoGatewayCheckResponse {
	s.ResultCode = &v
	return s
}

func (s *EchoGatewayCheckResponse) SetResultMsg(v string) *EchoGatewayCheckResponse {
	s.ResultMsg = &v
	return s
}

func (s *EchoGatewayCheckResponse) SetOutputDemo(v *DemoClass) *EchoGatewayCheckResponse {
	s.OutputDemo = v
	return s
}

func (s *EchoGatewayCheckResponse) SetOutputString(v string) *EchoGatewayCheckResponse {
	s.OutputString = &v
	return s
}

func (s *EchoGatewayCheckResponse) SetFileUrl(v string) *EchoGatewayCheckResponse {
	s.FileUrl = &v
	return s
}

type QueryGatewayCheckRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s QueryGatewayCheckRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryGatewayCheckRequest) GoString() string {
	return s.String()
}

func (s *QueryGatewayCheckRequest) SetAuthToken(v string) *QueryGatewayCheckRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryGatewayCheckRequest) SetProductInstanceId(v string) *QueryGatewayCheckRequest {
	s.ProductInstanceId = &v
	return s
}

type QueryGatewayCheckResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s QueryGatewayCheckResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryGatewayCheckResponse) GoString() string {
	return s.String()
}

func (s *QueryGatewayCheckResponse) SetReqMsgId(v string) *QueryGatewayCheckResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryGatewayCheckResponse) SetResultCode(v string) *QueryGatewayCheckResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryGatewayCheckResponse) SetResultMsg(v string) *QueryGatewayCheckResponse {
	s.ResultMsg = &v
	return s
}

type QueryGatewayTestRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s QueryGatewayTestRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryGatewayTestRequest) GoString() string {
	return s.String()
}

func (s *QueryGatewayTestRequest) SetAuthToken(v string) *QueryGatewayTestRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryGatewayTestRequest) SetProductInstanceId(v string) *QueryGatewayTestRequest {
	s.ProductInstanceId = &v
	return s
}

type QueryGatewayTestResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s QueryGatewayTestResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryGatewayTestResponse) GoString() string {
	return s.String()
}

func (s *QueryGatewayTestResponse) SetReqMsgId(v string) *QueryGatewayTestResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryGatewayTestResponse) SetResultCode(v string) *QueryGatewayTestResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryGatewayTestResponse) SetResultMsg(v string) *QueryGatewayTestResponse {
	s.ResultMsg = &v
	return s
}

type BindSssSsSsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s BindSssSsSsRequest) String() string {
	return tea.Prettify(s)
}

func (s BindSssSsSsRequest) GoString() string {
	return s.String()
}

func (s *BindSssSsSsRequest) SetAuthToken(v string) *BindSssSsSsRequest {
	s.AuthToken = &v
	return s
}

func (s *BindSssSsSsRequest) SetProductInstanceId(v string) *BindSssSsSsRequest {
	s.ProductInstanceId = &v
	return s
}

type BindSssSsSsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s BindSssSsSsResponse) String() string {
	return tea.Prettify(s)
}

func (s BindSssSsSsResponse) GoString() string {
	return s.String()
}

func (s *BindSssSsSsResponse) SetReqMsgId(v string) *BindSssSsSsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *BindSssSsSsResponse) SetResultCode(v string) *BindSssSsSsResponse {
	s.ResultCode = &v
	return s
}

func (s *BindSssSsSsResponse) SetResultMsg(v string) *BindSssSsSsResponse {
	s.ResultMsg = &v
	return s
}

type QueryGatewayMyRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s QueryGatewayMyRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryGatewayMyRequest) GoString() string {
	return s.String()
}

func (s *QueryGatewayMyRequest) SetAuthToken(v string) *QueryGatewayMyRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryGatewayMyRequest) SetProductInstanceId(v string) *QueryGatewayMyRequest {
	s.ProductInstanceId = &v
	return s
}

type QueryGatewayMyResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s QueryGatewayMyResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryGatewayMyResponse) GoString() string {
	return s.String()
}

func (s *QueryGatewayMyResponse) SetReqMsgId(v string) *QueryGatewayMyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryGatewayMyResponse) SetResultCode(v string) *QueryGatewayMyResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryGatewayMyResponse) SetResultMsg(v string) *QueryGatewayMyResponse {
	s.ResultMsg = &v
	return s
}

type BindDemoCheckEeeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s BindDemoCheckEeeRequest) String() string {
	return tea.Prettify(s)
}

func (s BindDemoCheckEeeRequest) GoString() string {
	return s.String()
}

func (s *BindDemoCheckEeeRequest) SetAuthToken(v string) *BindDemoCheckEeeRequest {
	s.AuthToken = &v
	return s
}

func (s *BindDemoCheckEeeRequest) SetProductInstanceId(v string) *BindDemoCheckEeeRequest {
	s.ProductInstanceId = &v
	return s
}

type BindDemoCheckEeeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s BindDemoCheckEeeResponse) String() string {
	return tea.Prettify(s)
}

func (s BindDemoCheckEeeResponse) GoString() string {
	return s.String()
}

func (s *BindDemoCheckEeeResponse) SetReqMsgId(v string) *BindDemoCheckEeeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *BindDemoCheckEeeResponse) SetResultCode(v string) *BindDemoCheckEeeResponse {
	s.ResultCode = &v
	return s
}

func (s *BindDemoCheckEeeResponse) SetResultMsg(v string) *BindDemoCheckEeeResponse {
	s.ResultMsg = &v
	return s
}

type BindGatewayAbcTestRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s BindGatewayAbcTestRequest) String() string {
	return tea.Prettify(s)
}

func (s BindGatewayAbcTestRequest) GoString() string {
	return s.String()
}

func (s *BindGatewayAbcTestRequest) SetAuthToken(v string) *BindGatewayAbcTestRequest {
	s.AuthToken = &v
	return s
}

func (s *BindGatewayAbcTestRequest) SetProductInstanceId(v string) *BindGatewayAbcTestRequest {
	s.ProductInstanceId = &v
	return s
}

type BindGatewayAbcTestResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s BindGatewayAbcTestResponse) String() string {
	return tea.Prettify(s)
}

func (s BindGatewayAbcTestResponse) GoString() string {
	return s.String()
}

func (s *BindGatewayAbcTestResponse) SetReqMsgId(v string) *BindGatewayAbcTestResponse {
	s.ReqMsgId = &v
	return s
}

func (s *BindGatewayAbcTestResponse) SetResultCode(v string) *BindGatewayAbcTestResponse {
	s.ResultCode = &v
	return s
}

func (s *BindGatewayAbcTestResponse) SetResultMsg(v string) *BindGatewayAbcTestResponse {
	s.ResultMsg = &v
	return s
}

type BindTestTestTestRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// test
	Test *string `json:"test,omitempty" xml:"test,omitempty" require:"true"`
}

func (s BindTestTestTestRequest) String() string {
	return tea.Prettify(s)
}

func (s BindTestTestTestRequest) GoString() string {
	return s.String()
}

func (s *BindTestTestTestRequest) SetAuthToken(v string) *BindTestTestTestRequest {
	s.AuthToken = &v
	return s
}

func (s *BindTestTestTestRequest) SetProductInstanceId(v string) *BindTestTestTestRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *BindTestTestTestRequest) SetTest(v string) *BindTestTestTestRequest {
	s.Test = &v
	return s
}

type BindTestTestTestResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// test
	Test *string `json:"test,omitempty" xml:"test,omitempty"`
}

func (s BindTestTestTestResponse) String() string {
	return tea.Prettify(s)
}

func (s BindTestTestTestResponse) GoString() string {
	return s.String()
}

func (s *BindTestTestTestResponse) SetReqMsgId(v string) *BindTestTestTestResponse {
	s.ReqMsgId = &v
	return s
}

func (s *BindTestTestTestResponse) SetResultCode(v string) *BindTestTestTestResponse {
	s.ResultCode = &v
	return s
}

func (s *BindTestTestTestResponse) SetResultMsg(v string) *BindTestTestTestResponse {
	s.ResultMsg = &v
	return s
}

func (s *BindTestTestTestResponse) SetTest(v string) *BindTestTestTestResponse {
	s.Test = &v
	return s
}

type QueryGatewayCheckEchotimeoutRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 10
	Timeout *string `json:"timeout,omitempty" xml:"timeout,omitempty"`
}

func (s QueryGatewayCheckEchotimeoutRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryGatewayCheckEchotimeoutRequest) GoString() string {
	return s.String()
}

func (s *QueryGatewayCheckEchotimeoutRequest) SetAuthToken(v string) *QueryGatewayCheckEchotimeoutRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryGatewayCheckEchotimeoutRequest) SetProductInstanceId(v string) *QueryGatewayCheckEchotimeoutRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryGatewayCheckEchotimeoutRequest) SetTimeout(v string) *QueryGatewayCheckEchotimeoutRequest {
	s.Timeout = &v
	return s
}

type QueryGatewayCheckEchotimeoutResponse struct {
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

func (s QueryGatewayCheckEchotimeoutResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryGatewayCheckEchotimeoutResponse) GoString() string {
	return s.String()
}

func (s *QueryGatewayCheckEchotimeoutResponse) SetReqMsgId(v string) *QueryGatewayCheckEchotimeoutResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryGatewayCheckEchotimeoutResponse) SetResultCode(v string) *QueryGatewayCheckEchotimeoutResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryGatewayCheckEchotimeoutResponse) SetResultMsg(v string) *QueryGatewayCheckEchotimeoutResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryGatewayCheckEchotimeoutResponse) SetStauts(v string) *QueryGatewayCheckEchotimeoutResponse {
	s.Stauts = &v
	return s
}

func (s *QueryGatewayCheckEchotimeoutResponse) SetMsg(v string) *QueryGatewayCheckEchotimeoutResponse {
	s.Msg = &v
	return s
}

type QueryGatewayCheckEchotenRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s QueryGatewayCheckEchotenRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryGatewayCheckEchotenRequest) GoString() string {
	return s.String()
}

func (s *QueryGatewayCheckEchotenRequest) SetAuthToken(v string) *QueryGatewayCheckEchotenRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryGatewayCheckEchotenRequest) SetProductInstanceId(v string) *QueryGatewayCheckEchotenRequest {
	s.ProductInstanceId = &v
	return s
}

type QueryGatewayCheckEchotenResponse struct {
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

func (s QueryGatewayCheckEchotenResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryGatewayCheckEchotenResponse) GoString() string {
	return s.String()
}

func (s *QueryGatewayCheckEchotenResponse) SetReqMsgId(v string) *QueryGatewayCheckEchotenResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryGatewayCheckEchotenResponse) SetResultCode(v string) *QueryGatewayCheckEchotenResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryGatewayCheckEchotenResponse) SetResultMsg(v string) *QueryGatewayCheckEchotenResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryGatewayCheckEchotenResponse) SetStatus(v string) *QueryGatewayCheckEchotenResponse {
	s.Status = &v
	return s
}

func (s *QueryGatewayCheckEchotenResponse) SetMsg(v string) *QueryGatewayCheckEchotenResponse {
	s.Msg = &v
	return s
}

type QueryAdAsdAsdRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s QueryAdAsdAsdRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAdAsdAsdRequest) GoString() string {
	return s.String()
}

func (s *QueryAdAsdAsdRequest) SetAuthToken(v string) *QueryAdAsdAsdRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAdAsdAsdRequest) SetProductInstanceId(v string) *QueryAdAsdAsdRequest {
	s.ProductInstanceId = &v
	return s
}

type QueryAdAsdAsdResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s QueryAdAsdAsdResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAdAsdAsdResponse) GoString() string {
	return s.String()
}

func (s *QueryAdAsdAsdResponse) SetReqMsgId(v string) *QueryAdAsdAsdResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAdAsdAsdResponse) SetResultCode(v string) *QueryAdAsdAsdResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAdAsdAsdResponse) SetResultMsg(v string) *QueryAdAsdAsdResponse {
	s.ResultMsg = &v
	return s
}

type BindAsdAsdAsdRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s BindAsdAsdAsdRequest) String() string {
	return tea.Prettify(s)
}

func (s BindAsdAsdAsdRequest) GoString() string {
	return s.String()
}

func (s *BindAsdAsdAsdRequest) SetAuthToken(v string) *BindAsdAsdAsdRequest {
	s.AuthToken = &v
	return s
}

func (s *BindAsdAsdAsdRequest) SetProductInstanceId(v string) *BindAsdAsdAsdRequest {
	s.ProductInstanceId = &v
	return s
}

type BindAsdAsdAsdResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s BindAsdAsdAsdResponse) String() string {
	return tea.Prettify(s)
}

func (s BindAsdAsdAsdResponse) GoString() string {
	return s.String()
}

func (s *BindAsdAsdAsdResponse) SetReqMsgId(v string) *BindAsdAsdAsdResponse {
	s.ReqMsgId = &v
	return s
}

func (s *BindAsdAsdAsdResponse) SetResultCode(v string) *BindAsdAsdAsdResponse {
	s.ResultCode = &v
	return s
}

func (s *BindAsdAsdAsdResponse) SetResultMsg(v string) *BindAsdAsdAsdResponse {
	s.ResultMsg = &v
	return s
}

type InitBbpInsuranceUserRequest struct {
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

func (s InitBbpInsuranceUserRequest) String() string {
	return tea.Prettify(s)
}

func (s InitBbpInsuranceUserRequest) GoString() string {
	return s.String()
}

func (s *InitBbpInsuranceUserRequest) SetAuthToken(v string) *InitBbpInsuranceUserRequest {
	s.AuthToken = &v
	return s
}

func (s *InitBbpInsuranceUserRequest) SetProductInstanceId(v string) *InitBbpInsuranceUserRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *InitBbpInsuranceUserRequest) SetBusinessCode(v string) *InitBbpInsuranceUserRequest {
	s.BusinessCode = &v
	return s
}

func (s *InitBbpInsuranceUserRequest) SetThirdPartId(v string) *InitBbpInsuranceUserRequest {
	s.ThirdPartId = &v
	return s
}

func (s *InitBbpInsuranceUserRequest) SetChannel(v string) *InitBbpInsuranceUserRequest {
	s.Channel = &v
	return s
}

func (s *InitBbpInsuranceUserRequest) SetBurieds(v *QueryMap) *InitBbpInsuranceUserRequest {
	s.Burieds = v
	return s
}

type InitBbpInsuranceUserResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s InitBbpInsuranceUserResponse) String() string {
	return tea.Prettify(s)
}

func (s InitBbpInsuranceUserResponse) GoString() string {
	return s.String()
}

func (s *InitBbpInsuranceUserResponse) SetReqMsgId(v string) *InitBbpInsuranceUserResponse {
	s.ReqMsgId = &v
	return s
}

func (s *InitBbpInsuranceUserResponse) SetResultCode(v string) *InitBbpInsuranceUserResponse {
	s.ResultCode = &v
	return s
}

func (s *InitBbpInsuranceUserResponse) SetResultMsg(v string) *InitBbpInsuranceUserResponse {
	s.ResultMsg = &v
	return s
}

type QueryTestTestobjectBbbRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 测试入参
	RequestParam1 *string `json:"request_param1,omitempty" xml:"request_param1,omitempty" require:"true"`
	// 测试入参2
	RequestParam2 *string `json:"request_param2,omitempty" xml:"request_param2,omitempty" require:"true"`
}

func (s QueryTestTestobjectBbbRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryTestTestobjectBbbRequest) GoString() string {
	return s.String()
}

func (s *QueryTestTestobjectBbbRequest) SetAuthToken(v string) *QueryTestTestobjectBbbRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryTestTestobjectBbbRequest) SetProductInstanceId(v string) *QueryTestTestobjectBbbRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryTestTestobjectBbbRequest) SetRequestParam1(v string) *QueryTestTestobjectBbbRequest {
	s.RequestParam1 = &v
	return s
}

func (s *QueryTestTestobjectBbbRequest) SetRequestParam2(v string) *QueryTestTestobjectBbbRequest {
	s.RequestParam2 = &v
	return s
}

type QueryTestTestobjectBbbResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 测试返回参数
	Response *string `json:"response,omitempty" xml:"response,omitempty"`
}

func (s QueryTestTestobjectBbbResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryTestTestobjectBbbResponse) GoString() string {
	return s.String()
}

func (s *QueryTestTestobjectBbbResponse) SetReqMsgId(v string) *QueryTestTestobjectBbbResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryTestTestobjectBbbResponse) SetResultCode(v string) *QueryTestTestobjectBbbResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryTestTestobjectBbbResponse) SetResultMsg(v string) *QueryTestTestobjectBbbResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryTestTestobjectBbbResponse) SetResponse(v string) *QueryTestTestobjectBbbResponse {
	s.Response = &v
	return s
}

type QueryTestGatewayTestRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s QueryTestGatewayTestRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryTestGatewayTestRequest) GoString() string {
	return s.String()
}

func (s *QueryTestGatewayTestRequest) SetAuthToken(v string) *QueryTestGatewayTestRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryTestGatewayTestRequest) SetProductInstanceId(v string) *QueryTestGatewayTestRequest {
	s.ProductInstanceId = &v
	return s
}

type QueryTestGatewayTestResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s QueryTestGatewayTestResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryTestGatewayTestResponse) GoString() string {
	return s.String()
}

func (s *QueryTestGatewayTestResponse) SetReqMsgId(v string) *QueryTestGatewayTestResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryTestGatewayTestResponse) SetResultCode(v string) *QueryTestGatewayTestResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryTestGatewayTestResponse) SetResultMsg(v string) *QueryTestGatewayTestResponse {
	s.ResultMsg = &v
	return s
}

type BindAaaBbbCccRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s BindAaaBbbCccRequest) String() string {
	return tea.Prettify(s)
}

func (s BindAaaBbbCccRequest) GoString() string {
	return s.String()
}

func (s *BindAaaBbbCccRequest) SetAuthToken(v string) *BindAaaBbbCccRequest {
	s.AuthToken = &v
	return s
}

func (s *BindAaaBbbCccRequest) SetProductInstanceId(v string) *BindAaaBbbCccRequest {
	s.ProductInstanceId = &v
	return s
}

type BindAaaBbbCccResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s BindAaaBbbCccResponse) String() string {
	return tea.Prettify(s)
}

func (s BindAaaBbbCccResponse) GoString() string {
	return s.String()
}

func (s *BindAaaBbbCccResponse) SetReqMsgId(v string) *BindAaaBbbCccResponse {
	s.ReqMsgId = &v
	return s
}

func (s *BindAaaBbbCccResponse) SetResultCode(v string) *BindAaaBbbCccResponse {
	s.ResultCode = &v
	return s
}

func (s *BindAaaBbbCccResponse) SetResultMsg(v string) *BindAaaBbbCccResponse {
	s.ResultMsg = &v
	return s
}

type QueryAaaBbbCccRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s QueryAaaBbbCccRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAaaBbbCccRequest) GoString() string {
	return s.String()
}

func (s *QueryAaaBbbCccRequest) SetAuthToken(v string) *QueryAaaBbbCccRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAaaBbbCccRequest) SetProductInstanceId(v string) *QueryAaaBbbCccRequest {
	s.ProductInstanceId = &v
	return s
}

type QueryAaaBbbCccResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s QueryAaaBbbCccResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAaaBbbCccResponse) GoString() string {
	return s.String()
}

func (s *QueryAaaBbbCccResponse) SetReqMsgId(v string) *QueryAaaBbbCccResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAaaBbbCccResponse) SetResultCode(v string) *QueryAaaBbbCccResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAaaBbbCccResponse) SetResultMsg(v string) *QueryAaaBbbCccResponse {
	s.ResultMsg = &v
	return s
}

type QueryAbcAbcAbcRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s QueryAbcAbcAbcRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAbcAbcAbcRequest) GoString() string {
	return s.String()
}

func (s *QueryAbcAbcAbcRequest) SetAuthToken(v string) *QueryAbcAbcAbcRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAbcAbcAbcRequest) SetProductInstanceId(v string) *QueryAbcAbcAbcRequest {
	s.ProductInstanceId = &v
	return s
}

type QueryAbcAbcAbcResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s QueryAbcAbcAbcResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAbcAbcAbcResponse) GoString() string {
	return s.String()
}

func (s *QueryAbcAbcAbcResponse) SetReqMsgId(v string) *QueryAbcAbcAbcResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAbcAbcAbcResponse) SetResultCode(v string) *QueryAbcAbcAbcResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAbcAbcAbcResponse) SetResultMsg(v string) *QueryAbcAbcAbcResponse {
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
				"sdk_version":      tea.String("1.0.91"),
			}
			if !tea.BoolValue(util.Empty(client.SecurityToken)) {
				request_.Query["security_token"] = client.SecurityToken
			}

			request_.Headers = tea.Merge(map[string]*string{
				"host":       util.DefaultString(client.Endpoint, tea.String("centre-openapi.antchain.antgroup.com")),
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
 * Description: 123
 * Summary: 123
 */
func (client *Client) BindQweQwe(request *BindQweQweRequest) (_result *BindQweQweResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &BindQweQweResponse{}
	_body, _err := client.BindQweQweEx(request, headers, runtime)
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
func (client *Client) BindQweQweEx(request *BindQweQweRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *BindQweQweResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &BindQweQweResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.qwe.qwe.bind"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: sdf
 * Summary: sdf
 */
func (client *Client) BindSdfSssSss(request *BindSdfSssSssRequest) (_result *BindSdfSssSssResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &BindSdfSssSssResponse{}
	_body, _err := client.BindSdfSssSssEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: sdf
 * Summary: sdf
 */
func (client *Client) BindSdfSssSssEx(request *BindSdfSssSssRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *BindSdfSssSssResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &BindSdfSssSssResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.sdf.sss.sss.bind"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: Demo接口，返回当前服务器当前状态1
 * Summary: 检查服务状态
 */
func (client *Client) StatusGatewayCheck(request *StatusGatewayCheckRequest) (_result *StatusGatewayCheckResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &StatusGatewayCheckResponse{}
	_body, _err := client.StatusGatewayCheckEx(request, headers, runtime)
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
func (client *Client) StatusGatewayCheckEx(request *StatusGatewayCheckRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *StatusGatewayCheckResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &StatusGatewayCheckResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.gateway.check.status"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: Demo接口，返回当输入的值
测试下
 * Summary: 返回输入值
*/
func (client *Client) EchoGatewayCheck(request *EchoGatewayCheckRequest) (_result *EchoGatewayCheckResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &EchoGatewayCheckResponse{}
	_body, _err := client.EchoGatewayCheckEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: Demo接口，返回当输入的值
测试下
 * Summary: 返回输入值
*/
func (client *Client) EchoGatewayCheckEx(request *EchoGatewayCheckRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *EchoGatewayCheckResponse, _err error) {
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

		if !tea.BoolValue(antchainutil.IsSuccess(uploadResp.ResultCode, tea.String("OK"))) {
			echoGatewayCheckResponse := &EchoGatewayCheckResponse{
				ReqMsgId:   uploadResp.ReqMsgId,
				ResultCode: uploadResp.ResultCode,
				ResultMsg:  uploadResp.ResultMsg,
			}
			_result = echoGatewayCheckResponse
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
	_result = &EchoGatewayCheckResponse{}
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
func (client *Client) QueryGatewayCheck(request *QueryGatewayCheckRequest) (_result *QueryGatewayCheckResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryGatewayCheckResponse{}
	_body, _err := client.QueryGatewayCheckEx(request, headers, runtime)
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
func (client *Client) QueryGatewayCheckEx(request *QueryGatewayCheckRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryGatewayCheckResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryGatewayCheckResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.gateway.check.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 测试用aaa
 * Summary: 测试001
 */
func (client *Client) QueryGatewayTest(request *QueryGatewayTestRequest) (_result *QueryGatewayTestResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryGatewayTestResponse{}
	_body, _err := client.QueryGatewayTestEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 测试用aaa
 * Summary: 测试001
 */
func (client *Client) QueryGatewayTestEx(request *QueryGatewayTestRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryGatewayTestResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryGatewayTestResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.gateway.test.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: sss
 * Summary: ss
 */
func (client *Client) BindSssSsSs(request *BindSssSsSsRequest) (_result *BindSssSsSsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &BindSssSsSsResponse{}
	_body, _err := client.BindSssSsSsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: sss
 * Summary: ss
 */
func (client *Client) BindSssSsSsEx(request *BindSssSsSsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *BindSssSsSsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &BindSssSsSsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.sss.ss.ss.bind"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: aaa
 * Summary: 测试demo
 */
func (client *Client) QueryGatewayMy(request *QueryGatewayMyRequest) (_result *QueryGatewayMyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryGatewayMyResponse{}
	_body, _err := client.QueryGatewayMyEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: aaa
 * Summary: 测试demo
 */
func (client *Client) QueryGatewayMyEx(request *QueryGatewayMyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryGatewayMyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryGatewayMyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.gateway.my.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) BindDemoCheckEee(request *BindDemoCheckEeeRequest) (_result *BindDemoCheckEeeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &BindDemoCheckEeeResponse{}
	_body, _err := client.BindDemoCheckEeeEx(request, headers, runtime)
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
func (client *Client) BindDemoCheckEeeEx(request *BindDemoCheckEeeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *BindDemoCheckEeeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &BindDemoCheckEeeResponse{}
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
func (client *Client) BindGatewayAbcTest(request *BindGatewayAbcTestRequest) (_result *BindGatewayAbcTestResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &BindGatewayAbcTestResponse{}
	_body, _err := client.BindGatewayAbcTestEx(request, headers, runtime)
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
func (client *Client) BindGatewayAbcTestEx(request *BindGatewayAbcTestRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *BindGatewayAbcTestResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &BindGatewayAbcTestResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.gateway.abc.test.bind"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: testaaa
 * Summary: test
 */
func (client *Client) BindTestTestTest(request *BindTestTestTestRequest) (_result *BindTestTestTestResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &BindTestTestTestResponse{}
	_body, _err := client.BindTestTestTestEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: testaaa
 * Summary: test
 */
func (client *Client) BindTestTestTestEx(request *BindTestTestTestRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *BindTestTestTestResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &BindTestTestTestResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.test.test.test.bind"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) QueryGatewayCheckEchotimeout(request *QueryGatewayCheckEchotimeoutRequest) (_result *QueryGatewayCheckEchotimeoutResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryGatewayCheckEchotimeoutResponse{}
	_body, _err := client.QueryGatewayCheckEchotimeoutEx(request, headers, runtime)
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
func (client *Client) QueryGatewayCheckEchotimeoutEx(request *QueryGatewayCheckEchotimeoutRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryGatewayCheckEchotimeoutResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryGatewayCheckEchotimeoutResponse{}
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
func (client *Client) QueryGatewayCheckEchoten(request *QueryGatewayCheckEchotenRequest) (_result *QueryGatewayCheckEchotenResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryGatewayCheckEchotenResponse{}
	_body, _err := client.QueryGatewayCheckEchotenEx(request, headers, runtime)
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
func (client *Client) QueryGatewayCheckEchotenEx(request *QueryGatewayCheckEchotenRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryGatewayCheckEchotenResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryGatewayCheckEchotenResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.gateway.check.echoten.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: asd
 * Summary: asd
 */
func (client *Client) QueryAdAsdAsd(request *QueryAdAsdAsdRequest) (_result *QueryAdAsdAsdResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAdAsdAsdResponse{}
	_body, _err := client.QueryAdAsdAsdEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: asd
 * Summary: asd
 */
func (client *Client) QueryAdAsdAsdEx(request *QueryAdAsdAsdRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAdAsdAsdResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAdAsdAsdResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.ad.asd.asd.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: asd
 * Summary: asd
 */
func (client *Client) BindAsdAsdAsd(request *BindAsdAsdAsdRequest) (_result *BindAsdAsdAsdResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &BindAsdAsdAsdResponse{}
	_body, _err := client.BindAsdAsdAsdEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: asd
 * Summary: asd
 */
func (client *Client) BindAsdAsdAsdEx(request *BindAsdAsdAsdRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *BindAsdAsdAsdResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &BindAsdAsdAsdResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.asd.asd.asd.bind"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) InitBbpInsuranceUser(request *InitBbpInsuranceUserRequest) (_result *InitBbpInsuranceUserResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &InitBbpInsuranceUserResponse{}
	_body, _err := client.InitBbpInsuranceUserEx(request, headers, runtime)
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
func (client *Client) InitBbpInsuranceUserEx(request *InitBbpInsuranceUserRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *InitBbpInsuranceUserResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &InitBbpInsuranceUserResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.bbp.insurance.user.init"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 测试添加api
 * Summary: 测试用api
 */
func (client *Client) QueryTestTestobjectBbb(request *QueryTestTestobjectBbbRequest) (_result *QueryTestTestobjectBbbResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryTestTestobjectBbbResponse{}
	_body, _err := client.QueryTestTestobjectBbbEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 测试添加api
 * Summary: 测试用api
 */
func (client *Client) QueryTestTestobjectBbbEx(request *QueryTestTestobjectBbbRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryTestTestobjectBbbResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryTestTestobjectBbbResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.test.testobject.bbb.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 测试使用
 * Summary: 测试创建
 */
func (client *Client) QueryTestGatewayTest(request *QueryTestGatewayTestRequest) (_result *QueryTestGatewayTestResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryTestGatewayTestResponse{}
	_body, _err := client.QueryTestGatewayTestEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 测试使用
 * Summary: 测试创建
 */
func (client *Client) QueryTestGatewayTestEx(request *QueryTestGatewayTestRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryTestGatewayTestResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryTestGatewayTestResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.test.gateway.test.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 自动化测试创建，用于测试新建&修改功能
 * Summary: 自动化测试创建，用于测试新建&修改功能
 */
func (client *Client) BindAaaBbbCcc(request *BindAaaBbbCccRequest) (_result *BindAaaBbbCccResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &BindAaaBbbCccResponse{}
	_body, _err := client.BindAaaBbbCccEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 自动化测试创建，用于测试新建&修改功能
 * Summary: 自动化测试创建，用于测试新建&修改功能
 */
func (client *Client) BindAaaBbbCccEx(request *BindAaaBbbCccRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *BindAaaBbbCccResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &BindAaaBbbCccResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.aaa.bbb.ccc.bind"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 自动化测试创建1
 * Summary: 自动化测试创建（勿动）
 */
func (client *Client) QueryAaaBbbCcc(request *QueryAaaBbbCccRequest) (_result *QueryAaaBbbCccResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAaaBbbCccResponse{}
	_body, _err := client.QueryAaaBbbCccEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 自动化测试创建1
 * Summary: 自动化测试创建（勿动）
 */
func (client *Client) QueryAaaBbbCccEx(request *QueryAaaBbbCccRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAaaBbbCccResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAaaBbbCccResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.aaa.bbb.ccc.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 自动化测试创建,用于测试API的修改
 * Summary: 自动化测试创建,用于测试API的修改勿动
 */
func (client *Client) QueryAbcAbcAbc(request *QueryAbcAbcAbcRequest) (_result *QueryAbcAbcAbcResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAbcAbcAbcResponse{}
	_body, _err := client.QueryAbcAbcAbcEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 自动化测试创建,用于测试API的修改
 * Summary: 自动化测试创建,用于测试API的修改勿动
 */
func (client *Client) QueryAbcAbcAbcEx(request *QueryAbcAbcAbcRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAbcAbcAbcResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAbcAbcAbcResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.abc.abc.abc.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
