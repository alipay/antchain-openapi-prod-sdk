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

// TestDemo
type TestDemo struct {
	// id
	Demo *string `json:"demo,omitempty" xml:"demo,omitempty" require:"true"`
}

func (s TestDemo) String() string {
	return tea.Prettify(s)
}

func (s TestDemo) GoString() string {
	return s.String()
}

func (s *TestDemo) SetDemo(v string) *TestDemo {
	s.Demo = &v
	return s
}

// 模拟大安全类型
type FaceImage struct {
	// 1123
	Content *string `json:"content,omitempty" xml:"content,omitempty"`
	// 123
	Rect *string `json:"rect,omitempty" xml:"rect,omitempty" require:"true"`
}

func (s FaceImage) String() string {
	return tea.Prettify(s)
}

func (s FaceImage) GoString() string {
	return s.String()
}

func (s *FaceImage) SetContent(v string) *FaceImage {
	s.Content = &v
	return s
}

func (s *FaceImage) SetRect(v string) *FaceImage {
	s.Rect = &v
	return s
}

// 结构体返回结构
type ResultListDemo struct {
	// 返回结果码
	Code *AbcDemoStruct `json:"code,omitempty" xml:"code,omitempty" require:"true"`
	// 返回结果
	Data *AbcDemoStruct `json:"data,omitempty" xml:"data,omitempty" require:"true"`
	// 返回信息
	Message *AbcDemoStruct `json:"message,omitempty" xml:"message,omitempty" require:"true"`
}

func (s ResultListDemo) String() string {
	return tea.Prettify(s)
}

func (s ResultListDemo) GoString() string {
	return s.String()
}

func (s *ResultListDemo) SetCode(v *AbcDemoStruct) *ResultListDemo {
	s.Code = v
	return s
}

func (s *ResultListDemo) SetData(v *AbcDemoStruct) *ResultListDemo {
	s.Data = v
	return s
}

func (s *ResultListDemo) SetMessage(v *AbcDemoStruct) *ResultListDemo {
	s.Message = v
	return s
}

// 姓名和年龄
type NameAndAge struct {
	// 姓名
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 年龄
	Age *int64 `json:"age,omitempty" xml:"age,omitempty"`
}

func (s NameAndAge) String() string {
	return tea.Prettify(s)
}

func (s NameAndAge) GoString() string {
	return s.String()
}

func (s *NameAndAge) SetName(v string) *NameAndAge {
	s.Name = &v
	return s
}

func (s *NameAndAge) SetAge(v int64) *NameAndAge {
	s.Age = &v
	return s
}

// 共享能力六期接入rasp回归
type GongXiangnengli struct {
}

func (s GongXiangnengli) String() string {
	return tea.Prettify(s)
}

func (s GongXiangnengli) GoString() string {
	return s.String()
}

// 初始参数
type InitParks struct {
	// 返回接收到请求的当前时间
	Time *string `json:"time,omitempty" xml:"time,omitempty" require:"true"`
	// 操作人
	Operator *string `json:"operator,omitempty" xml:"operator,omitempty" require:"true"`
	// 请求编号
	Count *int64 `json:"count,omitempty" xml:"count,omitempty" require:"true"`
}

func (s InitParks) String() string {
	return tea.Prettify(s)
}

func (s InitParks) GoString() string {
	return s.String()
}

func (s *InitParks) SetTime(v string) *InitParks {
	s.Time = &v
	return s
}

func (s *InitParks) SetOperator(v string) *InitParks {
	s.Operator = &v
	return s
}

func (s *InitParks) SetCount(v int64) *InitParks {
	s.Count = &v
	return s
}

// 11
type InitPark struct {
	// 1
	Demo *string `json:"demo,omitempty" xml:"demo,omitempty" require:"true"`
}

func (s InitPark) String() string {
	return tea.Prettify(s)
}

func (s InitPark) GoString() string {
	return s.String()
}

func (s *InitPark) SetDemo(v string) *InitPark {
	s.Demo = &v
	return s
}

// 初始
type InitPack struct {
	// 请求时间
	Time *string `json:"time,omitempty" xml:"time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 请求人
	Operate *string `json:"operate,omitempty" xml:"operate,omitempty" require:"true"`
	// 编号
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

func (s *InitPack) SetOperate(v string) *InitPack {
	s.Operate = &v
	return s
}

func (s *InitPack) SetCount(v int64) *InitPack {
	s.Count = &v
	return s
}

// 测试使用
type TestPark struct {
	// 请求时间
	Time *string `json:"time,omitempty" xml:"time,omitempty" require:"true"`
	// 请求人
	Operator *string `json:"operator,omitempty" xml:"operator,omitempty" require:"true"`
	// 请求编号
	Count *int64 `json:"count,omitempty" xml:"count,omitempty" require:"true"`
}

func (s TestPark) String() string {
	return tea.Prettify(s)
}

func (s TestPark) GoString() string {
	return s.String()
}

func (s *TestPark) SetTime(v string) *TestPark {
	s.Time = &v
	return s
}

func (s *TestPark) SetOperator(v string) *TestPark {
	s.Operator = &v
	return s
}

func (s *TestPark) SetCount(v int64) *TestPark {
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

type PreviewDemoRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 字符串入参
	InputString *string `json:"input_string,omitempty" xml:"input_string,omitempty" require:"true" maxLength:"1000" minLength:"10"`
	// Long型入参
	InputNumber *int64 `json:"input_number,omitempty" xml:"input_number,omitempty"`
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

func (s PreviewDemoRequest) String() string {
	return tea.Prettify(s)
}

func (s PreviewDemoRequest) GoString() string {
	return s.String()
}

func (s *PreviewDemoRequest) SetAuthToken(v string) *PreviewDemoRequest {
	s.AuthToken = &v
	return s
}

func (s *PreviewDemoRequest) SetProductInstanceId(v string) *PreviewDemoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PreviewDemoRequest) SetInputString(v string) *PreviewDemoRequest {
	s.InputString = &v
	return s
}

func (s *PreviewDemoRequest) SetInputNumber(v int64) *PreviewDemoRequest {
	s.InputNumber = &v
	return s
}

func (s *PreviewDemoRequest) SetInputBoolean(v bool) *PreviewDemoRequest {
	s.InputBoolean = &v
	return s
}

func (s *PreviewDemoRequest) SetInputDate(v string) *PreviewDemoRequest {
	s.InputDate = &v
	return s
}

func (s *PreviewDemoRequest) SetInputStringList(v []*string) *PreviewDemoRequest {
	s.InputStringList = v
	return s
}

func (s *PreviewDemoRequest) SetInputStruct(v *AbcDemoStruct) *PreviewDemoRequest {
	s.InputStruct = v
	return s
}

func (s *PreviewDemoRequest) SetInputStructList(v []*AbcDemoStruct) *PreviewDemoRequest {
	s.InputStructList = v
	return s
}

func (s *PreviewDemoRequest) SetFileObject(v io.Reader) *PreviewDemoRequest {
	s.FileObject = v
	return s
}

func (s *PreviewDemoRequest) SetFileObjectName(v string) *PreviewDemoRequest {
	s.FileObjectName = &v
	return s
}

func (s *PreviewDemoRequest) SetFileId(v string) *PreviewDemoRequest {
	s.FileId = &v
	return s
}

type PreviewDemoResponse struct {
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

func (s PreviewDemoResponse) String() string {
	return tea.Prettify(s)
}

func (s PreviewDemoResponse) GoString() string {
	return s.String()
}

func (s *PreviewDemoResponse) SetReqMsgId(v string) *PreviewDemoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PreviewDemoResponse) SetResultCode(v string) *PreviewDemoResponse {
	s.ResultCode = &v
	return s
}

func (s *PreviewDemoResponse) SetResultMsg(v string) *PreviewDemoResponse {
	s.ResultMsg = &v
	return s
}

func (s *PreviewDemoResponse) SetOutputString(v string) *PreviewDemoResponse {
	s.OutputString = &v
	return s
}

func (s *PreviewDemoResponse) SetOutputNumber(v int64) *PreviewDemoResponse {
	s.OutputNumber = &v
	return s
}

func (s *PreviewDemoResponse) SetOutputBoolean(v bool) *PreviewDemoResponse {
	s.OutputBoolean = &v
	return s
}

func (s *PreviewDemoResponse) SetOutputDate(v string) *PreviewDemoResponse {
	s.OutputDate = &v
	return s
}

func (s *PreviewDemoResponse) SetOutputStringList(v []*string) *PreviewDemoResponse {
	s.OutputStringList = v
	return s
}

func (s *PreviewDemoResponse) SetOutputStruct(v *AbcDemoStruct) *PreviewDemoResponse {
	s.OutputStruct = v
	return s
}

func (s *PreviewDemoResponse) SetOutputStructList(v []*AbcDemoStruct) *PreviewDemoResponse {
	s.OutputStructList = v
	return s
}

type QueryGatewayRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 查询输入
	//
	Data *string `json:"data,omitempty" xml:"data,omitempty" require:"true"`
	// 结构体参数
	Param *AbcDemoStruct `json:"param,omitempty" xml:"param,omitempty" require:"true"`
}

func (s QueryGatewayRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryGatewayRequest) GoString() string {
	return s.String()
}

func (s *QueryGatewayRequest) SetAuthToken(v string) *QueryGatewayRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryGatewayRequest) SetProductInstanceId(v string) *QueryGatewayRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryGatewayRequest) SetData(v string) *QueryGatewayRequest {
	s.Data = &v
	return s
}

func (s *QueryGatewayRequest) SetParam(v *AbcDemoStruct) *QueryGatewayRequest {
	s.Param = v
	return s
}

type QueryGatewayResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回查询
	QueryResult *string `json:"query_result,omitempty" xml:"query_result,omitempty"`
}

func (s QueryGatewayResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryGatewayResponse) GoString() string {
	return s.String()
}

func (s *QueryGatewayResponse) SetReqMsgId(v string) *QueryGatewayResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryGatewayResponse) SetResultCode(v string) *QueryGatewayResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryGatewayResponse) SetResultMsg(v string) *QueryGatewayResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryGatewayResponse) SetQueryResult(v string) *QueryGatewayResponse {
	s.QueryResult = &v
	return s
}

type QueryAbcdaAbcddaaRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s QueryAbcdaAbcddaaRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAbcdaAbcddaaRequest) GoString() string {
	return s.String()
}

func (s *QueryAbcdaAbcddaaRequest) SetAuthToken(v string) *QueryAbcdaAbcddaaRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAbcdaAbcddaaRequest) SetProductInstanceId(v string) *QueryAbcdaAbcddaaRequest {
	s.ProductInstanceId = &v
	return s
}

type QueryAbcdaAbcddaaResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s QueryAbcdaAbcddaaResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAbcdaAbcddaaResponse) GoString() string {
	return s.String()
}

func (s *QueryAbcdaAbcddaaResponse) SetReqMsgId(v string) *QueryAbcdaAbcddaaResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAbcdaAbcddaaResponse) SetResultCode(v string) *QueryAbcdaAbcddaaResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAbcdaAbcddaaResponse) SetResultMsg(v string) *QueryAbcdaAbcddaaResponse {
	s.ResultMsg = &v
	return s
}

type MatchSecurityFaceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 123
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 123
	Face1 *FaceImage `json:"face1,omitempty" xml:"face1,omitempty"`
	// 123
	Face2 *FaceImage `json:"face2,omitempty" xml:"face2,omitempty"`
}

func (s MatchSecurityFaceRequest) String() string {
	return tea.Prettify(s)
}

func (s MatchSecurityFaceRequest) GoString() string {
	return s.String()
}

func (s *MatchSecurityFaceRequest) SetAuthToken(v string) *MatchSecurityFaceRequest {
	s.AuthToken = &v
	return s
}

func (s *MatchSecurityFaceRequest) SetProductInstanceId(v string) *MatchSecurityFaceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *MatchSecurityFaceRequest) SetBizId(v string) *MatchSecurityFaceRequest {
	s.BizId = &v
	return s
}

func (s *MatchSecurityFaceRequest) SetFace1(v *FaceImage) *MatchSecurityFaceRequest {
	s.Face1 = v
	return s
}

func (s *MatchSecurityFaceRequest) SetFace2(v *FaceImage) *MatchSecurityFaceRequest {
	s.Face2 = v
	return s
}

type MatchSecurityFaceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 123
	TransactionId *string `json:"transaction_id,omitempty" xml:"transaction_id,omitempty"`
	// 123
	SamePerson *string `json:"same_person,omitempty" xml:"same_person,omitempty"`
	// 123
	Score *string `json:"score,omitempty" xml:"score,omitempty"`
}

func (s MatchSecurityFaceResponse) String() string {
	return tea.Prettify(s)
}

func (s MatchSecurityFaceResponse) GoString() string {
	return s.String()
}

func (s *MatchSecurityFaceResponse) SetReqMsgId(v string) *MatchSecurityFaceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *MatchSecurityFaceResponse) SetResultCode(v string) *MatchSecurityFaceResponse {
	s.ResultCode = &v
	return s
}

func (s *MatchSecurityFaceResponse) SetResultMsg(v string) *MatchSecurityFaceResponse {
	s.ResultMsg = &v
	return s
}

func (s *MatchSecurityFaceResponse) SetTransactionId(v string) *MatchSecurityFaceResponse {
	s.TransactionId = &v
	return s
}

func (s *MatchSecurityFaceResponse) SetSamePerson(v string) *MatchSecurityFaceResponse {
	s.SamePerson = &v
	return s
}

func (s *MatchSecurityFaceResponse) SetScore(v string) *MatchSecurityFaceResponse {
	s.Score = &v
	return s
}

type UploadTestFileRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 123
	// 待上传文件
	FileObject io.Reader `json:"fileObject,omitempty" xml:"fileObject,omitempty"`
	// 待上传文件名
	FileObjectName *string `json:"fileObjectName,omitempty" xml:"fileObjectName,omitempty"`
	FileId         *string `json:"file_id,omitempty" xml:"file_id,omitempty" require:"true"`
}

func (s UploadTestFileRequest) String() string {
	return tea.Prettify(s)
}

func (s UploadTestFileRequest) GoString() string {
	return s.String()
}

func (s *UploadTestFileRequest) SetAuthToken(v string) *UploadTestFileRequest {
	s.AuthToken = &v
	return s
}

func (s *UploadTestFileRequest) SetProductInstanceId(v string) *UploadTestFileRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UploadTestFileRequest) SetFileObject(v io.Reader) *UploadTestFileRequest {
	s.FileObject = v
	return s
}

func (s *UploadTestFileRequest) SetFileObjectName(v string) *UploadTestFileRequest {
	s.FileObjectName = &v
	return s
}

func (s *UploadTestFileRequest) SetFileId(v string) *UploadTestFileRequest {
	s.FileId = &v
	return s
}

type UploadTestFileResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s UploadTestFileResponse) String() string {
	return tea.Prettify(s)
}

func (s UploadTestFileResponse) GoString() string {
	return s.String()
}

func (s *UploadTestFileResponse) SetReqMsgId(v string) *UploadTestFileResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UploadTestFileResponse) SetResultCode(v string) *UploadTestFileResponse {
	s.ResultCode = &v
	return s
}

func (s *UploadTestFileResponse) SetResultMsg(v string) *UploadTestFileResponse {
	s.ResultMsg = &v
	return s
}

type QueryTimeOneRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 超时时间
	Timeout *string `json:"timeout,omitempty" xml:"timeout,omitempty"`
}

func (s QueryTimeOneRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryTimeOneRequest) GoString() string {
	return s.String()
}

func (s *QueryTimeOneRequest) SetAuthToken(v string) *QueryTimeOneRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryTimeOneRequest) SetProductInstanceId(v string) *QueryTimeOneRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryTimeOneRequest) SetTimeout(v string) *QueryTimeOneRequest {
	s.Timeout = &v
	return s
}

type QueryTimeOneResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 状态码
	Stauts *string `json:"stauts,omitempty" xml:"stauts,omitempty"`
	// OK
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
}

func (s QueryTimeOneResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryTimeOneResponse) GoString() string {
	return s.String()
}

func (s *QueryTimeOneResponse) SetReqMsgId(v string) *QueryTimeOneResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryTimeOneResponse) SetResultCode(v string) *QueryTimeOneResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryTimeOneResponse) SetResultMsg(v string) *QueryTimeOneResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryTimeOneResponse) SetStauts(v string) *QueryTimeOneResponse {
	s.Stauts = &v
	return s
}

func (s *QueryTimeOneResponse) SetMsg(v string) *QueryTimeOneResponse {
	s.Msg = &v
	return s
}

type QueryTimeTwoRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 下游超时时间
	Timeout *string `json:"timeout,omitempty" xml:"timeout,omitempty"`
}

func (s QueryTimeTwoRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryTimeTwoRequest) GoString() string {
	return s.String()
}

func (s *QueryTimeTwoRequest) SetAuthToken(v string) *QueryTimeTwoRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryTimeTwoRequest) SetProductInstanceId(v string) *QueryTimeTwoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryTimeTwoRequest) SetTimeout(v string) *QueryTimeTwoRequest {
	s.Timeout = &v
	return s
}

type QueryTimeTwoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 状态码
	Stauts *string `json:"stauts,omitempty" xml:"stauts,omitempty"`
	// OK
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
}

func (s QueryTimeTwoResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryTimeTwoResponse) GoString() string {
	return s.String()
}

func (s *QueryTimeTwoResponse) SetReqMsgId(v string) *QueryTimeTwoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryTimeTwoResponse) SetResultCode(v string) *QueryTimeTwoResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryTimeTwoResponse) SetResultMsg(v string) *QueryTimeTwoResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryTimeTwoResponse) SetStauts(v string) *QueryTimeTwoResponse {
	s.Stauts = &v
	return s
}

func (s *QueryTimeTwoResponse) SetMsg(v string) *QueryTimeTwoResponse {
	s.Msg = &v
	return s
}

type QueryTimeThreeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 下游超时时间
	Timeout *string `json:"timeout,omitempty" xml:"timeout,omitempty"`
}

func (s QueryTimeThreeRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryTimeThreeRequest) GoString() string {
	return s.String()
}

func (s *QueryTimeThreeRequest) SetAuthToken(v string) *QueryTimeThreeRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryTimeThreeRequest) SetProductInstanceId(v string) *QueryTimeThreeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryTimeThreeRequest) SetTimeout(v string) *QueryTimeThreeRequest {
	s.Timeout = &v
	return s
}

type QueryTimeThreeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 状态码
	Stauts *string `json:"stauts,omitempty" xml:"stauts,omitempty"`
	// OK
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
}

func (s QueryTimeThreeResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryTimeThreeResponse) GoString() string {
	return s.String()
}

func (s *QueryTimeThreeResponse) SetReqMsgId(v string) *QueryTimeThreeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryTimeThreeResponse) SetResultCode(v string) *QueryTimeThreeResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryTimeThreeResponse) SetResultMsg(v string) *QueryTimeThreeResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryTimeThreeResponse) SetStauts(v string) *QueryTimeThreeResponse {
	s.Stauts = &v
	return s
}

func (s *QueryTimeThreeResponse) SetMsg(v string) *QueryTimeThreeResponse {
	s.Msg = &v
	return s
}

type QueryTimeFourRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 超时时间
	Timeout *string `json:"timeout,omitempty" xml:"timeout,omitempty"`
}

func (s QueryTimeFourRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryTimeFourRequest) GoString() string {
	return s.String()
}

func (s *QueryTimeFourRequest) SetAuthToken(v string) *QueryTimeFourRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryTimeFourRequest) SetProductInstanceId(v string) *QueryTimeFourRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryTimeFourRequest) SetTimeout(v string) *QueryTimeFourRequest {
	s.Timeout = &v
	return s
}

type QueryTimeFourResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 状态码
	Stauts *string `json:"stauts,omitempty" xml:"stauts,omitempty"`
	// OK
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
}

func (s QueryTimeFourResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryTimeFourResponse) GoString() string {
	return s.String()
}

func (s *QueryTimeFourResponse) SetReqMsgId(v string) *QueryTimeFourResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryTimeFourResponse) SetResultCode(v string) *QueryTimeFourResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryTimeFourResponse) SetResultMsg(v string) *QueryTimeFourResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryTimeFourResponse) SetStauts(v string) *QueryTimeFourResponse {
	s.Stauts = &v
	return s
}

func (s *QueryTimeFourResponse) SetMsg(v string) *QueryTimeFourResponse {
	s.Msg = &v
	return s
}

type QueryTimeFiveRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 下游超时时间
	Timeout *string `json:"timeout,omitempty" xml:"timeout,omitempty"`
}

func (s QueryTimeFiveRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryTimeFiveRequest) GoString() string {
	return s.String()
}

func (s *QueryTimeFiveRequest) SetAuthToken(v string) *QueryTimeFiveRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryTimeFiveRequest) SetProductInstanceId(v string) *QueryTimeFiveRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryTimeFiveRequest) SetTimeout(v string) *QueryTimeFiveRequest {
	s.Timeout = &v
	return s
}

type QueryTimeFiveResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 状态码
	Stauts *string `json:"stauts,omitempty" xml:"stauts,omitempty"`
	// OK
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
}

func (s QueryTimeFiveResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryTimeFiveResponse) GoString() string {
	return s.String()
}

func (s *QueryTimeFiveResponse) SetReqMsgId(v string) *QueryTimeFiveResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryTimeFiveResponse) SetResultCode(v string) *QueryTimeFiveResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryTimeFiveResponse) SetResultMsg(v string) *QueryTimeFiveResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryTimeFiveResponse) SetStauts(v string) *QueryTimeFiveResponse {
	s.Stauts = &v
	return s
}

func (s *QueryTimeFiveResponse) SetMsg(v string) *QueryTimeFiveResponse {
	s.Msg = &v
	return s
}

type CreateapiExistingProductsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 计算值输入
	ExecNum *int64 `json:"exec_num,omitempty" xml:"exec_num,omitempty" require:"true"`
}

func (s CreateapiExistingProductsRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateapiExistingProductsRequest) GoString() string {
	return s.String()
}

func (s *CreateapiExistingProductsRequest) SetAuthToken(v string) *CreateapiExistingProductsRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateapiExistingProductsRequest) SetProductInstanceId(v string) *CreateapiExistingProductsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateapiExistingProductsRequest) SetExecNum(v int64) *CreateapiExistingProductsRequest {
	s.ExecNum = &v
	return s
}

type CreateapiExistingProductsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 计算值返回
	ExecNumEcho *int64 `json:"exec_num_echo,omitempty" xml:"exec_num_echo,omitempty"`
}

func (s CreateapiExistingProductsResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateapiExistingProductsResponse) GoString() string {
	return s.String()
}

func (s *CreateapiExistingProductsResponse) SetReqMsgId(v string) *CreateapiExistingProductsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateapiExistingProductsResponse) SetResultCode(v string) *CreateapiExistingProductsResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateapiExistingProductsResponse) SetResultMsg(v string) *CreateapiExistingProductsResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateapiExistingProductsResponse) SetExecNumEcho(v int64) *CreateapiExistingProductsResponse {
	s.ExecNumEcho = &v
	return s
}

type APreCreateApiRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 请求时间
	Time *string `json:"time,omitempty" xml:"time,omitempty" require:"true"`
	// 请求发起人
	Operator *string `json:"operator,omitempty" xml:"operator,omitempty" require:"true"`
	// 请求编号
	Count *int64 `json:"count,omitempty" xml:"count,omitempty" require:"true"`
	// 原始信息
	OriginInfo *string `json:"origin_info,omitempty" xml:"origin_info,omitempty" require:"true"`
}

func (s APreCreateApiRequest) String() string {
	return tea.Prettify(s)
}

func (s APreCreateApiRequest) GoString() string {
	return s.String()
}

func (s *APreCreateApiRequest) SetAuthToken(v string) *APreCreateApiRequest {
	s.AuthToken = &v
	return s
}

func (s *APreCreateApiRequest) SetProductInstanceId(v string) *APreCreateApiRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *APreCreateApiRequest) SetTime(v string) *APreCreateApiRequest {
	s.Time = &v
	return s
}

func (s *APreCreateApiRequest) SetOperator(v string) *APreCreateApiRequest {
	s.Operator = &v
	return s
}

func (s *APreCreateApiRequest) SetCount(v int64) *APreCreateApiRequest {
	s.Count = &v
	return s
}

func (s *APreCreateApiRequest) SetOriginInfo(v string) *APreCreateApiRequest {
	s.OriginInfo = &v
	return s
}

type APreCreateApiResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 跟新后的info
	UpdInfo *string `json:"upd_info,omitempty" xml:"upd_info,omitempty"`
	// 组合返回请求结果
	UpdPark *InitParks `json:"upd_park,omitempty" xml:"upd_park,omitempty"`
}

func (s APreCreateApiResponse) String() string {
	return tea.Prettify(s)
}

func (s APreCreateApiResponse) GoString() string {
	return s.String()
}

func (s *APreCreateApiResponse) SetReqMsgId(v string) *APreCreateApiResponse {
	s.ReqMsgId = &v
	return s
}

func (s *APreCreateApiResponse) SetResultCode(v string) *APreCreateApiResponse {
	s.ResultCode = &v
	return s
}

func (s *APreCreateApiResponse) SetResultMsg(v string) *APreCreateApiResponse {
	s.ResultMsg = &v
	return s
}

func (s *APreCreateApiResponse) SetUpdInfo(v string) *APreCreateApiResponse {
	s.UpdInfo = &v
	return s
}

func (s *APreCreateApiResponse) SetUpdPark(v *InitParks) *APreCreateApiResponse {
	s.UpdPark = v
	return s
}

type ApiTestCreateRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 1
	Timeout *string `json:"timeout,omitempty" xml:"timeout,omitempty" require:"true"`
}

func (s ApiTestCreateRequest) String() string {
	return tea.Prettify(s)
}

func (s ApiTestCreateRequest) GoString() string {
	return s.String()
}

func (s *ApiTestCreateRequest) SetAuthToken(v string) *ApiTestCreateRequest {
	s.AuthToken = &v
	return s
}

func (s *ApiTestCreateRequest) SetProductInstanceId(v string) *ApiTestCreateRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ApiTestCreateRequest) SetTimeout(v string) *ApiTestCreateRequest {
	s.Timeout = &v
	return s
}

type ApiTestCreateResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 请求返回描述
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// msg
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
}

func (s ApiTestCreateResponse) String() string {
	return tea.Prettify(s)
}

func (s ApiTestCreateResponse) GoString() string {
	return s.String()
}

func (s *ApiTestCreateResponse) SetReqMsgId(v string) *ApiTestCreateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ApiTestCreateResponse) SetResultCode(v string) *ApiTestCreateResponse {
	s.ResultCode = &v
	return s
}

func (s *ApiTestCreateResponse) SetResultMsg(v string) *ApiTestCreateResponse {
	s.ResultMsg = &v
	return s
}

func (s *ApiTestCreateResponse) SetStatus(v string) *ApiTestCreateResponse {
	s.Status = &v
	return s
}

func (s *ApiTestCreateResponse) SetMsg(v string) *ApiTestCreateResponse {
	s.Msg = &v
	return s
}

type QueryApprovalTestRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 入参
	Input *string `json:"input,omitempty" xml:"input,omitempty" require:"true"`
	// 新增字段
	Delete *string `json:"delete,omitempty" xml:"delete,omitempty" require:"true"`
}

func (s QueryApprovalTestRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryApprovalTestRequest) GoString() string {
	return s.String()
}

func (s *QueryApprovalTestRequest) SetAuthToken(v string) *QueryApprovalTestRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryApprovalTestRequest) SetProductInstanceId(v string) *QueryApprovalTestRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryApprovalTestRequest) SetInput(v string) *QueryApprovalTestRequest {
	s.Input = &v
	return s
}

func (s *QueryApprovalTestRequest) SetDelete(v string) *QueryApprovalTestRequest {
	s.Delete = &v
	return s
}

type QueryApprovalTestResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 回参
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
	// 新增字段
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
}

func (s QueryApprovalTestResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryApprovalTestResponse) GoString() string {
	return s.String()
}

func (s *QueryApprovalTestResponse) SetReqMsgId(v string) *QueryApprovalTestResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryApprovalTestResponse) SetResultCode(v string) *QueryApprovalTestResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryApprovalTestResponse) SetResultMsg(v string) *QueryApprovalTestResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryApprovalTestResponse) SetMsg(v string) *QueryApprovalTestResponse {
	s.Msg = &v
	return s
}

func (s *QueryApprovalTestResponse) SetCode(v int64) *QueryApprovalTestResponse {
	s.Code = &v
	return s
}

type QueryOneLimitRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 超时时间
	Timeout *string `json:"timeout,omitempty" xml:"timeout,omitempty" require:"true"`
}

func (s QueryOneLimitRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryOneLimitRequest) GoString() string {
	return s.String()
}

func (s *QueryOneLimitRequest) SetAuthToken(v string) *QueryOneLimitRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryOneLimitRequest) SetProductInstanceId(v string) *QueryOneLimitRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryOneLimitRequest) SetTimeout(v string) *QueryOneLimitRequest {
	s.Timeout = &v
	return s
}

type QueryOneLimitResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 状态码
	Stauts *string `json:"stauts,omitempty" xml:"stauts,omitempty"`
	// 状态码描述
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
}

func (s QueryOneLimitResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryOneLimitResponse) GoString() string {
	return s.String()
}

func (s *QueryOneLimitResponse) SetReqMsgId(v string) *QueryOneLimitResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryOneLimitResponse) SetResultCode(v string) *QueryOneLimitResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryOneLimitResponse) SetResultMsg(v string) *QueryOneLimitResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryOneLimitResponse) SetStauts(v string) *QueryOneLimitResponse {
	s.Stauts = &v
	return s
}

func (s *QueryOneLimitResponse) SetMsg(v string) *QueryOneLimitResponse {
	s.Msg = &v
	return s
}

type ImportOneLimitRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 超时时间
	Timeout *string `json:"timeout,omitempty" xml:"timeout,omitempty" require:"true"`
}

func (s ImportOneLimitRequest) String() string {
	return tea.Prettify(s)
}

func (s ImportOneLimitRequest) GoString() string {
	return s.String()
}

func (s *ImportOneLimitRequest) SetAuthToken(v string) *ImportOneLimitRequest {
	s.AuthToken = &v
	return s
}

func (s *ImportOneLimitRequest) SetProductInstanceId(v string) *ImportOneLimitRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ImportOneLimitRequest) SetTimeout(v string) *ImportOneLimitRequest {
	s.Timeout = &v
	return s
}

type ImportOneLimitResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 状态码
	Stauts *string `json:"stauts,omitempty" xml:"stauts,omitempty"`
	// 状态描述
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
}

func (s ImportOneLimitResponse) String() string {
	return tea.Prettify(s)
}

func (s ImportOneLimitResponse) GoString() string {
	return s.String()
}

func (s *ImportOneLimitResponse) SetReqMsgId(v string) *ImportOneLimitResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ImportOneLimitResponse) SetResultCode(v string) *ImportOneLimitResponse {
	s.ResultCode = &v
	return s
}

func (s *ImportOneLimitResponse) SetResultMsg(v string) *ImportOneLimitResponse {
	s.ResultMsg = &v
	return s
}

func (s *ImportOneLimitResponse) SetStauts(v string) *ImportOneLimitResponse {
	s.Stauts = &v
	return s
}

func (s *ImportOneLimitResponse) SetMsg(v string) *ImportOneLimitResponse {
	s.Msg = &v
	return s
}

type QueryGongxiangTesttestRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 验证
	Character1 *string `json:"character1,omitempty" xml:"character1,omitempty" require:"true"`
	// 用于验证
	Character2 *int64 `json:"character2,omitempty" xml:"character2,omitempty" require:"true"`
}

func (s QueryGongxiangTesttestRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryGongxiangTesttestRequest) GoString() string {
	return s.String()
}

func (s *QueryGongxiangTesttestRequest) SetAuthToken(v string) *QueryGongxiangTesttestRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryGongxiangTesttestRequest) SetProductInstanceId(v string) *QueryGongxiangTesttestRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryGongxiangTesttestRequest) SetCharacter1(v string) *QueryGongxiangTesttestRequest {
	s.Character1 = &v
	return s
}

func (s *QueryGongxiangTesttestRequest) SetCharacter2(v int64) *QueryGongxiangTesttestRequest {
	s.Character2 = &v
	return s
}

type QueryGongxiangTesttestResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 回参
	Character1 *string `json:"character1,omitempty" xml:"character1,omitempty"`
}

func (s QueryGongxiangTesttestResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryGongxiangTesttestResponse) GoString() string {
	return s.String()
}

func (s *QueryGongxiangTesttestResponse) SetReqMsgId(v string) *QueryGongxiangTesttestResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryGongxiangTesttestResponse) SetResultCode(v string) *QueryGongxiangTesttestResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryGongxiangTesttestResponse) SetResultMsg(v string) *QueryGongxiangTesttestResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryGongxiangTesttestResponse) SetCharacter1(v string) *QueryGongxiangTesttestResponse {
	s.Character1 = &v
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
				"sdk_version":      tea.String("1.0.14"),
				"_prod_code":       tea.String("ABC"),
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
 * Description: 录入演示111
 * Summary: 录入演示API
 */
func (client *Client) PreviewDemo(request *PreviewDemoRequest) (_result *PreviewDemoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PreviewDemoResponse{}
	_body, _err := client.PreviewDemoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 录入演示111
 * Summary: 录入演示API
 */
func (client *Client) PreviewDemoEx(request *PreviewDemoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PreviewDemoResponse, _err error) {
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
			previewDemoResponse := &PreviewDemoResponse{
				ReqMsgId:   uploadResp.ReqMsgId,
				ResultCode: uploadResp.ResultCode,
				ResultMsg:  uploadResp.ResultMsg,
			}
			_result = previewDemoResponse
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
	_result = &PreviewDemoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.abc.demo.preview"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 测试导入api1
 * Summary: 测试导入api1
 */
func (client *Client) QueryGateway(request *QueryGatewayRequest) (_result *QueryGatewayResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryGatewayResponse{}
	_body, _err := client.QueryGatewayEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 测试导入api1
 * Summary: 测试导入api1
 */
func (client *Client) QueryGatewayEx(request *QueryGatewayRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryGatewayResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryGatewayResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.abc.gateway.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 调试a s dddd
 * Summary: 调试1
 */
func (client *Client) QueryAbcdaAbcddaa(request *QueryAbcdaAbcddaaRequest) (_result *QueryAbcdaAbcddaaResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAbcdaAbcddaaResponse{}
	_body, _err := client.QueryAbcdaAbcddaaEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 调试a s dddd
 * Summary: 调试1
 */
func (client *Client) QueryAbcdaAbcddaaEx(request *QueryAbcdaAbcddaaRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAbcdaAbcddaaResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAbcdaAbcddaaResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.abc.abcda.abcddaa.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 测试大安全接口
 * Summary: 测试大安全接口
 */
func (client *Client) MatchSecurityFace(request *MatchSecurityFaceRequest) (_result *MatchSecurityFaceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &MatchSecurityFaceResponse{}
	_body, _err := client.MatchSecurityFaceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 测试大安全接口
 * Summary: 测试大安全接口
 */
func (client *Client) MatchSecurityFaceEx(request *MatchSecurityFaceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *MatchSecurityFaceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &MatchSecurityFaceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.abc.security.face.match"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 文件上传测试接口
 * Summary: 文件上传测试接口
 */
func (client *Client) UploadTestFile(request *UploadTestFileRequest) (_result *UploadTestFileResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UploadTestFileResponse{}
	_body, _err := client.UploadTestFileEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 文件上传测试接口
 * Summary: 文件上传测试接口
 */
func (client *Client) UploadTestFileEx(request *UploadTestFileRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UploadTestFileResponse, _err error) {
	if !tea.BoolValue(util.IsUnset(request.FileObject)) {
		uploadReq := &CreateAntcloudGatewayxFileUploadRequest{
			AuthToken: request.AuthToken,
			ApiCode:   tea.String("antchain.abc.test.file.upload"),
			FileName:  request.FileObjectName,
		}
		uploadResp, _err := client.CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime)
		if _err != nil {
			return _result, _err
		}

		if !tea.BoolValue(antchainutil.IsSuccess(uploadResp.ResultCode, tea.String("ok"))) {
			uploadTestFileResponse := &UploadTestFileResponse{
				ReqMsgId:   uploadResp.ReqMsgId,
				ResultCode: uploadResp.ResultCode,
				ResultMsg:  uploadResp.ResultMsg,
			}
			_result = uploadTestFileResponse
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
	_result = &UploadTestFileResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.abc.test.file.upload"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 压测接口1
 * Summary: 压测接口1
 */
func (client *Client) QueryTimeOne(request *QueryTimeOneRequest) (_result *QueryTimeOneResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryTimeOneResponse{}
	_body, _err := client.QueryTimeOneEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 压测接口1
 * Summary: 压测接口1
 */
func (client *Client) QueryTimeOneEx(request *QueryTimeOneRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryTimeOneResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryTimeOneResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.abc.time.one.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 压测接口2
 * Summary: 压测接口2
 */
func (client *Client) QueryTimeTwo(request *QueryTimeTwoRequest) (_result *QueryTimeTwoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryTimeTwoResponse{}
	_body, _err := client.QueryTimeTwoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 压测接口2
 * Summary: 压测接口2
 */
func (client *Client) QueryTimeTwoEx(request *QueryTimeTwoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryTimeTwoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryTimeTwoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.abc.time.two.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 压测接口3
 * Summary: 压测接口3
 */
func (client *Client) QueryTimeThree(request *QueryTimeThreeRequest) (_result *QueryTimeThreeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryTimeThreeResponse{}
	_body, _err := client.QueryTimeThreeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 压测接口3
 * Summary: 压测接口3
 */
func (client *Client) QueryTimeThreeEx(request *QueryTimeThreeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryTimeThreeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryTimeThreeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.abc.time.three.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 压测接口4
 * Summary: 压测接口4
 */
func (client *Client) QueryTimeFour(request *QueryTimeFourRequest) (_result *QueryTimeFourResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryTimeFourResponse{}
	_body, _err := client.QueryTimeFourEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 压测接口4
 * Summary: 压测接口4
 */
func (client *Client) QueryTimeFourEx(request *QueryTimeFourRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryTimeFourResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryTimeFourResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.abc.time.four.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 压测接口5
 * Summary: 压测接口5
 */
func (client *Client) QueryTimeFive(request *QueryTimeFiveRequest) (_result *QueryTimeFiveResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryTimeFiveResponse{}
	_body, _err := client.QueryTimeFiveEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 压测接口5
 * Summary: 压测接口5
 */
func (client *Client) QueryTimeFiveEx(request *QueryTimeFiveRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryTimeFiveResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryTimeFiveResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.abc.time.five.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 已有产品创建api
 * Summary: 已有产品创建api
 */
func (client *Client) CreateapiExistingProducts(request *CreateapiExistingProductsRequest) (_result *CreateapiExistingProductsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateapiExistingProductsResponse{}
	_body, _err := client.CreateapiExistingProductsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 已有产品创建api
 * Summary: 已有产品创建api
 */
func (client *Client) CreateapiExistingProductsEx(request *CreateapiExistingProductsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateapiExistingProductsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateapiExistingProductsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.abc.existing.products.createapi"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 已有产品下创建的api
 * Summary: 已有产品下创建的api
 */
func (client *Client) APreCreateApi(request *APreCreateApiRequest) (_result *APreCreateApiResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &APreCreateApiResponse{}
	_body, _err := client.APreCreateApiEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 已有产品下创建的api
 * Summary: 已有产品下创建的api
 */
func (client *Client) APreCreateApiEx(request *APreCreateApiRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *APreCreateApiResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &APreCreateApiResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.abc.pre.create.api.a"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 测试使用api
 * Summary: 测试使用api
 */
func (client *Client) ApiTestCreate(request *ApiTestCreateRequest) (_result *ApiTestCreateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ApiTestCreateResponse{}
	_body, _err := client.ApiTestCreateEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 测试使用api
 * Summary: 测试使用api
 */
func (client *Client) ApiTestCreateEx(request *ApiTestCreateRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ApiTestCreateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ApiTestCreateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.abc.test.create.api"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 用于测试api评审接入SDL/修改后的评审/0323
 * Summary: 用于测试api评审接入SDL/修改后的评审/0323
 */
func (client *Client) QueryApprovalTest(request *QueryApprovalTestRequest) (_result *QueryApprovalTestResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryApprovalTestResponse{}
	_body, _err := client.QueryApprovalTestEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 用于测试api评审接入SDL/修改后的评审/0323
 * Summary: 用于测试api评审接入SDL/修改后的评审/0323
 */
func (client *Client) QueryApprovalTestEx(request *QueryApprovalTestRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryApprovalTestResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryApprovalTestResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.abc.approval.test.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 个人工作台二期预发测试
 * Summary: 个人工作台二期预发测试
 */
func (client *Client) QueryOneLimit(request *QueryOneLimitRequest) (_result *QueryOneLimitResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryOneLimitResponse{}
	_body, _err := client.QueryOneLimitEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 个人工作台二期预发测试
 * Summary: 个人工作台二期预发测试
 */
func (client *Client) QueryOneLimitEx(request *QueryOneLimitRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryOneLimitResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryOneLimitResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.abc.one.limit.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 个人工作台二期预发测试
 * Summary: 个人工作台二期预发测试
 */
func (client *Client) ImportOneLimit(request *ImportOneLimitRequest) (_result *ImportOneLimitResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ImportOneLimitResponse{}
	_body, _err := client.ImportOneLimitEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 个人工作台二期预发测试
 * Summary: 个人工作台二期预发测试
 */
func (client *Client) ImportOneLimitEx(request *ImportOneLimitRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ImportOneLimitResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ImportOneLimitResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.abc.one.limit.import"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 用于共享能力中心六期接入rasp回归验证
 * Summary: 用于共享能力中心六期接入rasp回归验证
 */
func (client *Client) QueryGongxiangTesttest(request *QueryGongxiangTesttestRequest) (_result *QueryGongxiangTesttestResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryGongxiangTesttestResponse{}
	_body, _err := client.QueryGongxiangTesttestEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 用于共享能力中心六期接入rasp回归验证
 * Summary: 用于共享能力中心六期接入rasp回归验证
 */
func (client *Client) QueryGongxiangTesttestEx(request *QueryGongxiangTesttestRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryGongxiangTesttestResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryGongxiangTesttestResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.abc.gongxiang.testtest.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
