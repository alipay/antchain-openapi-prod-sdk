// This file is auto-generated, don't edit it. Thanks.
package client

import (
	rpcutil "github.com/alibabacloud-go/tea-rpc-utils/service"
	util "github.com/alibabacloud-go/tea-utils/v2/service"
	"github.com/alibabacloud-go/tea/tea"
	antchainutil "github.com/antchain-openapi-sdk-go/antchain-util/service"
	"io"
)

// Description:
//
// Model for initing client
type Config struct {
	// accesskey id
	AccessKeyId *string `json:"accessKeyId,omitempty" xml:"accessKeyId,omitempty"`
	// accesskey secret
	AccessKeySecret *string `json:"accessKeySecret,omitempty" xml:"accessKeySecret,omitempty"`
	// security token
	SecurityToken *string `json:"securityToken,omitempty" xml:"securityToken,omitempty"`
	// http protocol
	//
	// example:
	//
	// http
	Protocol *string `json:"protocol,omitempty" xml:"protocol,omitempty"`
	// read timeout
	//
	// example:
	//
	// 10
	ReadTimeout *int `json:"readTimeout,omitempty" xml:"readTimeout,omitempty"`
	// connect timeout
	//
	// example:
	//
	// 10
	ConnectTimeout *int `json:"connectTimeout,omitempty" xml:"connectTimeout,omitempty"`
	// http proxy
	//
	// example:
	//
	// http://localhost
	HttpProxy *string `json:"httpProxy,omitempty" xml:"httpProxy,omitempty"`
	// https proxy
	//
	// example:
	//
	// https://localhost
	HttpsProxy *string `json:"httpsProxy,omitempty" xml:"httpsProxy,omitempty"`
	// endpoint
	//
	// example:
	//
	// cs.aliyuncs.com
	Endpoint *string `json:"endpoint,omitempty" xml:"endpoint,omitempty"`
	// proxy white list
	//
	// example:
	//
	// http://localhost
	NoProxy *string `json:"noProxy,omitempty" xml:"noProxy,omitempty"`
	// max idle conns
	//
	// example:
	//
	// 3
	MaxIdleConns *int `json:"maxIdleConns,omitempty" xml:"maxIdleConns,omitempty"`
	// user agent
	//
	// example:
	//
	// Alibabacloud/1
	UserAgent *string `json:"userAgent,omitempty" xml:"userAgent,omitempty"`
	// socks5 proxy
	Socks5Proxy *string `json:"socks5Proxy,omitempty" xml:"socks5Proxy,omitempty"`
	// socks5 network
	//
	// example:
	//
	// TCP
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

// ceshi
type DemoClass struct {
	// some_string
	// example:
	//
	// some_string
	SomeString *string `json:"some_string,omitempty" xml:"some_string,omitempty" require:"true"`
	// some_date
	// example:
	//
	// 2018-10-10T10:10:00Z
	SomeDate *string `json:"some_date,omitempty" xml:"some_date,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// some_boolean
	// example:
	//
	// true
	SomeBoolean *bool `json:"some_boolean,omitempty" xml:"some_boolean,omitempty" require:"true"`
	// some_int
	// example:
	//
	// 1
	SomeInt *int64 `json:"some_int,omitempty" xml:"some_int,omitempty" require:"true"`
	// some_list
	// example:
	//
	// some_list
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

// 添加使用
type AddUse struct {
	// a
	// example:
	//
	// a
	A *string `json:"a,omitempty" xml:"a,omitempty" require:"true"`
	// b
	// example:
	//
	// b
	B *string `json:"b,omitempty" xml:"b,omitempty" require:"true"`
	// c
	// example:
	//
	// c
	C *string `json:"c,omitempty" xml:"c,omitempty" require:"true"`
	// d
	// example:
	//
	// d
	D *string `json:"d,omitempty" xml:"d,omitempty" require:"true"`
}

func (s AddUse) String() string {
	return tea.Prettify(s)
}

func (s AddUse) GoString() string {
	return s.String()
}

func (s *AddUse) SetA(v string) *AddUse {
	s.A = &v
	return s
}

func (s *AddUse) SetB(v string) *AddUse {
	s.B = &v
	return s
}

func (s *AddUse) SetC(v string) *AddUse {
	s.C = &v
	return s
}

func (s *AddUse) SetD(v string) *AddUse {
	s.D = &v
	return s
}

// w
type W struct {
	// a
	// example:
	//
	// a
	A *string `json:"a,omitempty" xml:"a,omitempty" require:"true"`
	// b
	// example:
	//
	// b
	B *string `json:"b,omitempty" xml:"b,omitempty" require:"true"`
	// c
	// example:
	//
	// c
	C *string `json:"c,omitempty" xml:"c,omitempty" require:"true"`
}

func (s W) String() string {
	return tea.Prettify(s)
}

func (s W) GoString() string {
	return s.String()
}

func (s *W) SetA(v string) *W {
	s.A = &v
	return s
}

func (s *W) SetB(v string) *W {
	s.B = &v
	return s
}

func (s *W) SetC(v string) *W {
	s.C = &v
	return s
}

// S
type S struct {
	// a
	// example:
	//
	// a
	A *string `json:"a,omitempty" xml:"a,omitempty" require:"true"`
	// b
	// example:
	//
	// b
	B *string `json:"b,omitempty" xml:"b,omitempty" require:"true"`
	// c
	// example:
	//
	// c
	C *string `json:"c,omitempty" xml:"c,omitempty" require:"true"`
}

func (s S) String() string {
	return tea.Prettify(s)
}

func (s S) GoString() string {
	return s.String()
}

func (s *S) SetA(v string) *S {
	s.A = &v
	return s
}

func (s *S) SetB(v string) *S {
	s.B = &v
	return s
}

func (s *S) SetC(v string) *S {
	s.C = &v
	return s
}

// b
type B struct {
	// q
	// example:
	//
	// q
	Q *string `json:"q,omitempty" xml:"q,omitempty" require:"true"`
	// w
	// example:
	//
	// w
	W *string `json:"w,omitempty" xml:"w,omitempty" require:"true"`
	// e
	// example:
	//
	// e
	E *string `json:"e,omitempty" xml:"e,omitempty" require:"true"`
}

func (s B) String() string {
	return tea.Prettify(s)
}

func (s B) GoString() string {
	return s.String()
}

func (s *B) SetQ(v string) *B {
	s.Q = &v
	return s
}

func (s *B) SetW(v string) *B {
	s.W = &v
	return s
}

func (s *B) SetE(v string) *B {
	s.E = &v
	return s
}

// 1
type TestStruct struct {
	// x
	// example:
	//
	// x
	X *string `json:"x,omitempty" xml:"x,omitempty" require:"true"`
	// y
	// example:
	//
	// y
	Y *string `json:"y,omitempty" xml:"y,omitempty" require:"true"`
	// z
	// example:
	//
	// undefined
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

func (s *TestStruct) SetY(v string) *TestStruct {
	s.Y = &v
	return s
}

func (s *TestStruct) SetZ(v []*DemoClass) *TestStruct {
	s.Z = v
	return s
}

// 同步测试
type AddStruct struct {
	// x
	// example:
	//
	// x
	X *string `json:"x,omitempty" xml:"x,omitempty" require:"true"`
	// y
	// example:
	//
	// y
	Y *string `json:"y,omitempty" xml:"y,omitempty" require:"true"`
	// z
	// example:
	//
	// undefined
	Z []*AddUse `json:"z,omitempty" xml:"z,omitempty" require:"true" type:"Repeated"`
}

func (s AddStruct) String() string {
	return tea.Prettify(s)
}

func (s AddStruct) GoString() string {
	return s.String()
}

func (s *AddStruct) SetX(v string) *AddStruct {
	s.X = &v
	return s
}

func (s *AddStruct) SetY(v string) *AddStruct {
	s.Y = &v
	return s
}

func (s *AddStruct) SetZ(v []*AddUse) *AddStruct {
	s.Z = v
	return s
}

// q
type D struct {
	// a
	// example:
	//
	// a
	A *string `json:"a,omitempty" xml:"a,omitempty" require:"true"`
	// s
	// example:
	//
	// undefined
	B []*S `json:"b,omitempty" xml:"b,omitempty" require:"true" type:"Repeated"`
}

func (s D) String() string {
	return tea.Prettify(s)
}

func (s D) GoString() string {
	return s.String()
}

func (s *D) SetA(v string) *D {
	s.A = &v
	return s
}

func (s *D) SetB(v []*S) *D {
	s.B = v
	return s
}

// 测试结构体
type TestNew struct {
	// 12
	// example:
	//
	// 张三
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 1
	// example:
	//
	// 1
	Number *int64 `json:"number,omitempty" xml:"number,omitempty"`
}

func (s TestNew) String() string {
	return tea.Prettify(s)
}

func (s TestNew) GoString() string {
	return s.String()
}

func (s *TestNew) SetName(v string) *TestNew {
	s.Name = &v
	return s
}

func (s *TestNew) SetNumber(v int64) *TestNew {
	s.Number = &v
	return s
}

// q
type Q struct {
	// q
	// example:
	//
	// q
	Q *string `json:"q,omitempty" xml:"q,omitempty" require:"true"`
	// w
	// example:
	//
	// undefined
	W []*W `json:"w,omitempty" xml:"w,omitempty" require:"true" type:"Repeated"`
}

func (s Q) String() string {
	return tea.Prettify(s)
}

func (s Q) GoString() string {
	return s.String()
}

func (s *Q) SetQ(v string) *Q {
	s.Q = &v
	return s
}

func (s *Q) SetW(v []*W) *Q {
	s.W = v
	return s
}

// 1
type A struct {
	// a
	// example:
	//
	// a
	A *string `json:"a,omitempty" xml:"a,omitempty" require:"true"`
	// b
	// example:
	//
	// undefined
	B []*B `json:"b,omitempty" xml:"b,omitempty" require:"true" type:"Repeated"`
}

func (s A) String() string {
	return tea.Prettify(s)
}

func (s A) GoString() string {
	return s.String()
}

func (s *A) SetA(v string) *A {
	s.A = &v
	return s
}

func (s *A) SetB(v []*B) *A {
	s.B = v
	return s
}

// ceshi
type InitPacks struct {
	// 返回接收到请求的当前时间
	//
	// example:
	//
	// 2018-10-10T10:10:00Z
	Time *string `json:"time,omitempty" xml:"time,omitempty" require:"true"`
	// 1
	// example:
	//
	// 张三
	Operator *string `json:"operator,omitempty" xml:"operator,omitempty" require:"true"`
	// 1
	// example:
	//
	// 1
	Count *int64 `json:"count,omitempty" xml:"count,omitempty" require:"true"`
}

func (s InitPacks) String() string {
	return tea.Prettify(s)
}

func (s InitPacks) GoString() string {
	return s.String()
}

func (s *InitPacks) SetTime(v string) *InitPacks {
	s.Time = &v
	return s
}

func (s *InitPacks) SetOperator(v string) *InitPacks {
	s.Operator = &v
	return s
}

func (s *InitPacks) SetCount(v int64) *InitPacks {
	s.Count = &v
	return s
}

// 键值对
type XNameValuePair struct {
	// 键名
	// example:
	//
	// key
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 键值
	// example:
	//
	// value
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

type ApiCreateFileRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// string
	// 待上传文件
	FileObject io.Reader `json:"fileObject,omitempty" xml:"fileObject,omitempty"`
	// 待上传文件名
	FileObjectName *string `json:"fileObjectName,omitempty" xml:"fileObjectName,omitempty"`
	FileId         *string `json:"file_id,omitempty" xml:"file_id,omitempty" require:"true"`
	// 1
	InputInt *int64 `json:"input_int,omitempty" xml:"input_int,omitempty" require:"true"`
	// 文件名
	FileName *string `json:"file_name,omitempty" xml:"file_name,omitempty" require:"true"`
	// input_array
	InputArray []*TestStruct `json:"input_array,omitempty" xml:"input_array,omitempty" require:"true" type:"Repeated"`
}

func (s ApiCreateFileRequest) String() string {
	return tea.Prettify(s)
}

func (s ApiCreateFileRequest) GoString() string {
	return s.String()
}

func (s *ApiCreateFileRequest) SetAuthToken(v string) *ApiCreateFileRequest {
	s.AuthToken = &v
	return s
}

func (s *ApiCreateFileRequest) SetProductInstanceId(v string) *ApiCreateFileRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ApiCreateFileRequest) SetFileObject(v io.Reader) *ApiCreateFileRequest {
	s.FileObject = v
	return s
}

func (s *ApiCreateFileRequest) SetFileObjectName(v string) *ApiCreateFileRequest {
	s.FileObjectName = &v
	return s
}

func (s *ApiCreateFileRequest) SetFileId(v string) *ApiCreateFileRequest {
	s.FileId = &v
	return s
}

func (s *ApiCreateFileRequest) SetInputInt(v int64) *ApiCreateFileRequest {
	s.InputInt = &v
	return s
}

func (s *ApiCreateFileRequest) SetFileName(v string) *ApiCreateFileRequest {
	s.FileName = &v
	return s
}

func (s *ApiCreateFileRequest) SetInputArray(v []*TestStruct) *ApiCreateFileRequest {
	s.InputArray = v
	return s
}

type ApiCreateFileResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// output_string
	OutputString *string `json:"output_string,omitempty" xml:"output_string,omitempty"`
	// file_url
	FileUrl *string `json:"file_url,omitempty" xml:"file_url,omitempty"`
	// output_demo
	OutputDemo *DemoClass `json:"output_demo,omitempty" xml:"output_demo,omitempty"`
}

func (s ApiCreateFileResponse) String() string {
	return tea.Prettify(s)
}

func (s ApiCreateFileResponse) GoString() string {
	return s.String()
}

func (s *ApiCreateFileResponse) SetReqMsgId(v string) *ApiCreateFileResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ApiCreateFileResponse) SetResultCode(v string) *ApiCreateFileResponse {
	s.ResultCode = &v
	return s
}

func (s *ApiCreateFileResponse) SetResultMsg(v string) *ApiCreateFileResponse {
	s.ResultMsg = &v
	return s
}

func (s *ApiCreateFileResponse) SetOutputString(v string) *ApiCreateFileResponse {
	s.OutputString = &v
	return s
}

func (s *ApiCreateFileResponse) SetFileUrl(v string) *ApiCreateFileResponse {
	s.FileUrl = &v
	return s
}

func (s *ApiCreateFileResponse) SetOutputDemo(v *DemoClass) *ApiCreateFileResponse {
	s.OutputDemo = v
	return s
}

type TestAddStructRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// ceshi
	Structparam []*AddStruct `json:"structparam,omitempty" xml:"structparam,omitempty" require:"true" type:"Repeated"`
}

func (s TestAddStructRequest) String() string {
	return tea.Prettify(s)
}

func (s TestAddStructRequest) GoString() string {
	return s.String()
}

func (s *TestAddStructRequest) SetAuthToken(v string) *TestAddStructRequest {
	s.AuthToken = &v
	return s
}

func (s *TestAddStructRequest) SetProductInstanceId(v string) *TestAddStructRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *TestAddStructRequest) SetStructparam(v []*AddStruct) *TestAddStructRequest {
	s.Structparam = v
	return s
}

type TestAddStructResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s TestAddStructResponse) String() string {
	return tea.Prettify(s)
}

func (s TestAddStructResponse) GoString() string {
	return s.String()
}

func (s *TestAddStructResponse) SetReqMsgId(v string) *TestAddStructResponse {
	s.ReqMsgId = &v
	return s
}

func (s *TestAddStructResponse) SetResultCode(v string) *TestAddStructResponse {
	s.ResultCode = &v
	return s
}

func (s *TestAddStructResponse) SetResultMsg(v string) *TestAddStructResponse {
	s.ResultMsg = &v
	return s
}

type ADemoTestRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s ADemoTestRequest) String() string {
	return tea.Prettify(s)
}

func (s ADemoTestRequest) GoString() string {
	return s.String()
}

func (s *ADemoTestRequest) SetAuthToken(v string) *ADemoTestRequest {
	s.AuthToken = &v
	return s
}

func (s *ADemoTestRequest) SetProductInstanceId(v string) *ADemoTestRequest {
	s.ProductInstanceId = &v
	return s
}

type ADemoTestResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s ADemoTestResponse) String() string {
	return tea.Prettify(s)
}

func (s ADemoTestResponse) GoString() string {
	return s.String()
}

func (s *ADemoTestResponse) SetReqMsgId(v string) *ADemoTestResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ADemoTestResponse) SetResultCode(v string) *ADemoTestResponse {
	s.ResultCode = &v
	return s
}

func (s *ADemoTestResponse) SetResultMsg(v string) *ADemoTestResponse {
	s.ResultMsg = &v
	return s
}

type BDemoTestRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s BDemoTestRequest) String() string {
	return tea.Prettify(s)
}

func (s BDemoTestRequest) GoString() string {
	return s.String()
}

func (s *BDemoTestRequest) SetAuthToken(v string) *BDemoTestRequest {
	s.AuthToken = &v
	return s
}

func (s *BDemoTestRequest) SetProductInstanceId(v string) *BDemoTestRequest {
	s.ProductInstanceId = &v
	return s
}

type BDemoTestResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s BDemoTestResponse) String() string {
	return tea.Prettify(s)
}

func (s BDemoTestResponse) GoString() string {
	return s.String()
}

func (s *BDemoTestResponse) SetReqMsgId(v string) *BDemoTestResponse {
	s.ReqMsgId = &v
	return s
}

func (s *BDemoTestResponse) SetResultCode(v string) *BDemoTestResponse {
	s.ResultCode = &v
	return s
}

func (s *BDemoTestResponse) SetResultMsg(v string) *BDemoTestResponse {
	s.ResultMsg = &v
	return s
}

type CDemoTestRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// a
	A []*A `json:"a,omitempty" xml:"a,omitempty" require:"true" type:"Repeated"`
}

func (s CDemoTestRequest) String() string {
	return tea.Prettify(s)
}

func (s CDemoTestRequest) GoString() string {
	return s.String()
}

func (s *CDemoTestRequest) SetAuthToken(v string) *CDemoTestRequest {
	s.AuthToken = &v
	return s
}

func (s *CDemoTestRequest) SetProductInstanceId(v string) *CDemoTestRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CDemoTestRequest) SetA(v []*A) *CDemoTestRequest {
	s.A = v
	return s
}

type CDemoTestResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CDemoTestResponse) String() string {
	return tea.Prettify(s)
}

func (s CDemoTestResponse) GoString() string {
	return s.String()
}

func (s *CDemoTestResponse) SetReqMsgId(v string) *CDemoTestResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CDemoTestResponse) SetResultCode(v string) *CDemoTestResponse {
	s.ResultCode = &v
	return s
}

func (s *CDemoTestResponse) SetResultMsg(v string) *CDemoTestResponse {
	s.ResultMsg = &v
	return s
}

type QQQRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// test
	Struct []*Q `json:"struct,omitempty" xml:"struct,omitempty" require:"true" type:"Repeated"`
}

func (s QQQRequest) String() string {
	return tea.Prettify(s)
}

func (s QQQRequest) GoString() string {
	return s.String()
}

func (s *QQQRequest) SetAuthToken(v string) *QQQRequest {
	s.AuthToken = &v
	return s
}

func (s *QQQRequest) SetProductInstanceId(v string) *QQQRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QQQRequest) SetStruct(v []*Q) *QQQRequest {
	s.Struct = v
	return s
}

type QQQResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s QQQResponse) String() string {
	return tea.Prettify(s)
}

func (s QQQResponse) GoString() string {
	return s.String()
}

func (s *QQQResponse) SetReqMsgId(v string) *QQQResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QQQResponse) SetResultCode(v string) *QQQResponse {
	s.ResultCode = &v
	return s
}

func (s *QQQResponse) SetResultMsg(v string) *QQQResponse {
	s.ResultMsg = &v
	return s
}

type ZzZZRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 1
	Qwer *D `json:"qwer,omitempty" xml:"qwer,omitempty" require:"true"`
	// z
	Z *string `json:"z,omitempty" xml:"z,omitempty" require:"true"`
}

func (s ZzZZRequest) String() string {
	return tea.Prettify(s)
}

func (s ZzZZRequest) GoString() string {
	return s.String()
}

func (s *ZzZZRequest) SetAuthToken(v string) *ZzZZRequest {
	s.AuthToken = &v
	return s
}

func (s *ZzZZRequest) SetProductInstanceId(v string) *ZzZZRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ZzZZRequest) SetQwer(v *D) *ZzZZRequest {
	s.Qwer = v
	return s
}

func (s *ZzZZRequest) SetZ(v string) *ZzZZRequest {
	s.Z = &v
	return s
}

type ZzZZResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s ZzZZResponse) String() string {
	return tea.Prettify(s)
}

func (s ZzZZResponse) GoString() string {
	return s.String()
}

func (s *ZzZZResponse) SetReqMsgId(v string) *ZzZZResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ZzZZResponse) SetResultCode(v string) *ZzZZResponse {
	s.ResultCode = &v
	return s
}

func (s *ZzZZResponse) SetResultMsg(v string) *ZzZZResponse {
	s.ResultMsg = &v
	return s
}

type ApiPreAcceptanceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 查询输入
	Data *string `json:"data,omitempty" xml:"data,omitempty" require:"true"`
}

func (s ApiPreAcceptanceRequest) String() string {
	return tea.Prettify(s)
}

func (s ApiPreAcceptanceRequest) GoString() string {
	return s.String()
}

func (s *ApiPreAcceptanceRequest) SetAuthToken(v string) *ApiPreAcceptanceRequest {
	s.AuthToken = &v
	return s
}

func (s *ApiPreAcceptanceRequest) SetProductInstanceId(v string) *ApiPreAcceptanceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ApiPreAcceptanceRequest) SetData(v string) *ApiPreAcceptanceRequest {
	s.Data = &v
	return s
}

type ApiPreAcceptanceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 查询返回
	QueryResult *string `json:"query_result,omitempty" xml:"query_result,omitempty"`
}

func (s ApiPreAcceptanceResponse) String() string {
	return tea.Prettify(s)
}

func (s ApiPreAcceptanceResponse) GoString() string {
	return s.String()
}

func (s *ApiPreAcceptanceResponse) SetReqMsgId(v string) *ApiPreAcceptanceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ApiPreAcceptanceResponse) SetResultCode(v string) *ApiPreAcceptanceResponse {
	s.ResultCode = &v
	return s
}

func (s *ApiPreAcceptanceResponse) SetResultMsg(v string) *ApiPreAcceptanceResponse {
	s.ResultMsg = &v
	return s
}

func (s *ApiPreAcceptanceResponse) SetQueryResult(v string) *ApiPreAcceptanceResponse {
	s.QueryResult = &v
	return s
}

type AaaPreTestApiRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 编号
	Count *int64 `json:"count,omitempty" xml:"count,omitempty" require:"true"`
	// 1
	Time *string `json:"time,omitempty" xml:"time,omitempty" require:"true"`
	// 1
	Desc *string `json:"desc,omitempty" xml:"desc,omitempty" require:"true"`
	// 1
	Operator *string `json:"operator,omitempty" xml:"operator,omitempty" require:"true"`
}

func (s AaaPreTestApiRequest) String() string {
	return tea.Prettify(s)
}

func (s AaaPreTestApiRequest) GoString() string {
	return s.String()
}

func (s *AaaPreTestApiRequest) SetAuthToken(v string) *AaaPreTestApiRequest {
	s.AuthToken = &v
	return s
}

func (s *AaaPreTestApiRequest) SetProductInstanceId(v string) *AaaPreTestApiRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AaaPreTestApiRequest) SetCount(v int64) *AaaPreTestApiRequest {
	s.Count = &v
	return s
}

func (s *AaaPreTestApiRequest) SetTime(v string) *AaaPreTestApiRequest {
	s.Time = &v
	return s
}

func (s *AaaPreTestApiRequest) SetDesc(v string) *AaaPreTestApiRequest {
	s.Desc = &v
	return s
}

func (s *AaaPreTestApiRequest) SetOperator(v string) *AaaPreTestApiRequest {
	s.Operator = &v
	return s
}

type AaaPreTestApiResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 1
	InitDesc *string `json:"init_desc,omitempty" xml:"init_desc,omitempty"`
	// 组合返回请求结果
	InitPack *InitPacks `json:"init_pack,omitempty" xml:"init_pack,omitempty"`
}

func (s AaaPreTestApiResponse) String() string {
	return tea.Prettify(s)
}

func (s AaaPreTestApiResponse) GoString() string {
	return s.String()
}

func (s *AaaPreTestApiResponse) SetReqMsgId(v string) *AaaPreTestApiResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AaaPreTestApiResponse) SetResultCode(v string) *AaaPreTestApiResponse {
	s.ResultCode = &v
	return s
}

func (s *AaaPreTestApiResponse) SetResultMsg(v string) *AaaPreTestApiResponse {
	s.ResultMsg = &v
	return s
}

func (s *AaaPreTestApiResponse) SetInitDesc(v string) *AaaPreTestApiResponse {
	s.InitDesc = &v
	return s
}

func (s *AaaPreTestApiResponse) SetInitPack(v *InitPacks) *AaaPreTestApiResponse {
	s.InitPack = v
	return s
}

type QuerySsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 测试用
	Name *DemoClass `json:"name,omitempty" xml:"name,omitempty"`
	// 1
	Test *string `json:"test,omitempty" xml:"test,omitempty"`
	// 12
	TestNew *TestNew `json:"test_new,omitempty" xml:"test_new,omitempty"`
}

func (s QuerySsRequest) String() string {
	return tea.Prettify(s)
}

func (s QuerySsRequest) GoString() string {
	return s.String()
}

func (s *QuerySsRequest) SetAuthToken(v string) *QuerySsRequest {
	s.AuthToken = &v
	return s
}

func (s *QuerySsRequest) SetProductInstanceId(v string) *QuerySsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QuerySsRequest) SetName(v *DemoClass) *QuerySsRequest {
	s.Name = v
	return s
}

func (s *QuerySsRequest) SetTest(v string) *QuerySsRequest {
	s.Test = &v
	return s
}

func (s *QuerySsRequest) SetTestNew(v *TestNew) *QuerySsRequest {
	s.TestNew = v
	return s
}

type QuerySsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 记录id
	Id *string `json:"id,omitempty" xml:"id,omitempty"`
}

func (s QuerySsResponse) String() string {
	return tea.Prettify(s)
}

func (s QuerySsResponse) GoString() string {
	return s.String()
}

func (s *QuerySsResponse) SetReqMsgId(v string) *QuerySsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QuerySsResponse) SetResultCode(v string) *QuerySsResponse {
	s.ResultCode = &v
	return s
}

func (s *QuerySsResponse) SetResultMsg(v string) *QuerySsResponse {
	s.ResultMsg = &v
	return s
}

func (s *QuerySsResponse) SetId(v string) *QuerySsResponse {
	s.Id = &v
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

// Description:
//
// # Init client with Config
//
// @param config - config contains the necessary information to create a client
func NewClient(config *Config) (*Client, error) {
	client := new(Client)
	err := client.Init(config)
	return client, err
}

func (client *Client) Init(config *Config) (_err error) {
	if tea.BoolValue(util.IsUnset(config)) {
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

// Description:
//
// # Encapsulate the request and invoke the network
//
// @param action - api name
//
// @param protocol - http or https
//
// @param method - e.g. GET
//
// @param pathname - pathname of every api
//
// @param request - which contains request params
//
// @param runtime - which controls some details of call api, such as retry times
//
// @return the response
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
				"sdk_version":      tea.String("1.0.5"),
				"_prod_code":       tea.String("TESTJZQ"),
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

// Description:
//
// Description: 测试使用
//
// Summary: 测试使用
func (client *Client) ApiCreateFile(request *ApiCreateFileRequest) (_result *ApiCreateFileResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ApiCreateFileResponse{}
	_body, _err := client.ApiCreateFileEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 测试使用
//
// Summary: 测试使用
func (client *Client) ApiCreateFileEx(request *ApiCreateFileRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ApiCreateFileResponse, _err error) {
	if !tea.BoolValue(util.IsUnset(request.FileObject)) {
		uploadReq := &CreateAntcloudGatewayxFileUploadRequest{
			AuthToken: request.AuthToken,
			ApiCode:   tea.String("antdigital.testjzq.create.file.api"),
			FileName:  request.FileObjectName,
		}
		uploadResp, _err := client.CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime)
		if _err != nil {
			return _result, _err
		}

		if !tea.BoolValue(antchainutil.IsSuccess(uploadResp.ResultCode, tea.String("ok"))) {
			apiCreateFileResponse := &ApiCreateFileResponse{
				ReqMsgId:   uploadResp.ReqMsgId,
				ResultCode: uploadResp.ResultCode,
				ResultMsg:  uploadResp.ResultMsg,
			}
			_result = apiCreateFileResponse
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
	_result = &ApiCreateFileResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.testjzq.create.file.api"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 测试结构体的部署同步
//
// Summary: 测试结构体的部署同步
func (client *Client) TestAddStruct(request *TestAddStructRequest) (_result *TestAddStructResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &TestAddStructResponse{}
	_body, _err := client.TestAddStructEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 测试结构体的部署同步
//
// Summary: 测试结构体的部署同步
func (client *Client) TestAddStructEx(request *TestAddStructRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *TestAddStructResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &TestAddStructResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.testjzq.add.struct.test"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 111
//
// Summary: 111
func (client *Client) ADemoTest(request *ADemoTestRequest) (_result *ADemoTestResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ADemoTestResponse{}
	_body, _err := client.ADemoTestEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 111
//
// Summary: 111
func (client *Client) ADemoTestEx(request *ADemoTestRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ADemoTestResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ADemoTestResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.testjzq.demo.test.a"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 111
//
// Summary: 111
func (client *Client) BDemoTest(request *BDemoTestRequest) (_result *BDemoTestResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &BDemoTestResponse{}
	_body, _err := client.BDemoTestEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 111
//
// Summary: 111
func (client *Client) BDemoTestEx(request *BDemoTestRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *BDemoTestResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &BDemoTestResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.testjzq.demo.test.b"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: ccccc
//
// Summary: ccccc
func (client *Client) CDemoTest(request *CDemoTestRequest) (_result *CDemoTestResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CDemoTestResponse{}
	_body, _err := client.CDemoTestEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: ccccc
//
// Summary: ccccc
func (client *Client) CDemoTestEx(request *CDemoTestRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CDemoTestResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CDemoTestResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.testjzq.demo.test.c"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: aaaaa
//
// Summary: aaaaa
func (client *Client) QQQ(request *QQQRequest) (_result *QQQResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QQQResponse{}
	_body, _err := client.QQQEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: aaaaa
//
// Summary: aaaaa
func (client *Client) QQQEx(request *QQQRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QQQResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QQQResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.testjzq.q.q.q"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: zzzzzzz
//
// Summary: zzzzzzz
func (client *Client) ZzZZ(request *ZzZZRequest) (_result *ZzZZResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ZzZZResponse{}
	_body, _err := client.ZzZZEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: zzzzzzz
//
// Summary: zzzzzzz
func (client *Client) ZzZZEx(request *ZzZZRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ZzZZResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ZzZZResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.testjzq.z.z.zz"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 预发验收创建api
//
// Summary: 预发验收创建api
func (client *Client) ApiPreAcceptance(request *ApiPreAcceptanceRequest) (_result *ApiPreAcceptanceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ApiPreAcceptanceResponse{}
	_body, _err := client.ApiPreAcceptanceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 预发验收创建api
//
// Summary: 预发验收创建api
func (client *Client) ApiPreAcceptanceEx(request *ApiPreAcceptanceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ApiPreAcceptanceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ApiPreAcceptanceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.testjzq.pre.acceptance.api"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: test
//
// Summary: test
func (client *Client) AaaPreTestApi(request *AaaPreTestApiRequest) (_result *AaaPreTestApiResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AaaPreTestApiResponse{}
	_body, _err := client.AaaPreTestApiEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: test
//
// Summary: test
func (client *Client) AaaPreTestApiEx(request *AaaPreTestApiRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AaaPreTestApiResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AaaPreTestApiResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.testjzq.pre.test.api.aaa"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 测试流程使用
//
// Summary: 测试流程使用
func (client *Client) QuerySs(request *QuerySsRequest) (_result *QuerySsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QuerySsResponse{}
	_body, _err := client.QuerySsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 测试流程使用
//
// Summary: 测试流程使用
func (client *Client) QuerySsEx(request *QuerySsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QuerySsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QuerySsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.testjzq.ss.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 创建HTTP PUT提交的文件上传
//
// Summary: 文件上传创建
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

// Description:
//
// Description: 创建HTTP PUT提交的文件上传
//
// Summary: 文件上传创建
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
