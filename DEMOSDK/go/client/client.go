// This file is auto-generated, don't edit it. Thanks.
package client

import (
	rpcutil "github.com/alibabacloud-go/tea-rpc-utils/service"
	util "github.com/alibabacloud-go/tea-utils/v2/service"
	"github.com/alibabacloud-go/tea/tea"
	antchainutil "github.com/antchain-openapi-sdk-go/antchain-util/service"
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

// test
type TestParamC struct {
	// string_param
	// example:
	//
	// string_param
	StringParam *string `json:"string_param,omitempty" xml:"string_param,omitempty"`
	// number_param
	// example:
	//
	// 1
	NumberParam *int64 `json:"number_param,omitempty" xml:"number_param,omitempty"`
	// boolean_param
	// example:
	//
	// true, false
	BooleanParam *bool `json:"boolean_param,omitempty" xml:"boolean_param,omitempty"`
	// date_param
	// example:
	//
	// 2018-10-10T10:10:00Z
	DateParam *string `json:"date_param,omitempty" xml:"date_param,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// string
	ArrayParam []*string `json:"array_param,omitempty" xml:"array_param,omitempty" type:"Repeated"`
}

func (s TestParamC) String() string {
	return tea.Prettify(s)
}

func (s TestParamC) GoString() string {
	return s.String()
}

func (s *TestParamC) SetStringParam(v string) *TestParamC {
	s.StringParam = &v
	return s
}

func (s *TestParamC) SetNumberParam(v int64) *TestParamC {
	s.NumberParam = &v
	return s
}

func (s *TestParamC) SetBooleanParam(v bool) *TestParamC {
	s.BooleanParam = &v
	return s
}

func (s *TestParamC) SetDateParam(v string) *TestParamC {
	s.DateParam = &v
	return s
}

func (s *TestParamC) SetArrayParam(v []*string) *TestParamC {
	s.ArrayParam = v
	return s
}

// test for edit
type TestParamB struct {
	// string_param
	// example:
	//
	// string_param
	StringParam *string `json:"string_param,omitempty" xml:"string_param,omitempty"`
	// number_param
	// example:
	//
	// 1
	NumberParam *int64 `json:"number_param,omitempty" xml:"number_param,omitempty"`
	// boolean_param
	// example:
	//
	// true, false
	BooleanParam *bool `json:"boolean_param,omitempty" xml:"boolean_param,omitempty"`
	// date_param
	// example:
	//
	// 2018-10-10T10:10:00Z
	DateParam *string `json:"date_param,omitempty" xml:"date_param,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// struct_param
	StructParam *TestParamC `json:"struct_param,omitempty" xml:"struct_param,omitempty" require:"true"`
	// aa
	// example:
	//
	// 3000
	StructListB *TestParamC `json:"struct_list_b,omitempty" xml:"struct_list_b,omitempty"`
}

func (s TestParamB) String() string {
	return tea.Prettify(s)
}

func (s TestParamB) GoString() string {
	return s.String()
}

func (s *TestParamB) SetStringParam(v string) *TestParamB {
	s.StringParam = &v
	return s
}

func (s *TestParamB) SetNumberParam(v int64) *TestParamB {
	s.NumberParam = &v
	return s
}

func (s *TestParamB) SetBooleanParam(v bool) *TestParamB {
	s.BooleanParam = &v
	return s
}

func (s *TestParamB) SetDateParam(v string) *TestParamB {
	s.DateParam = &v
	return s
}

func (s *TestParamB) SetStructParam(v *TestParamC) *TestParamB {
	s.StructParam = v
	return s
}

func (s *TestParamB) SetStructListB(v *TestParamC) *TestParamB {
	s.StructListB = v
	return s
}

// test for edit
type TestParamA struct {
	// string_param
	// example:
	//
	// string_param
	StringParam *string `json:"string_param,omitempty" xml:"string_param,omitempty"`
	// number_param
	// example:
	//
	// 1
	NumberParam *int64 `json:"number_param,omitempty" xml:"number_param,omitempty"`
	// boolean_param
	// example:
	//
	// true, false
	BooleanParam *bool `json:"boolean_param,omitempty" xml:"boolean_param,omitempty"`
	// date_param
	// example:
	//
	// 2018-10-10T10:10:00Z
	DateParam *string `json:"date_param,omitempty" xml:"date_param,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// struct_parama
	StructParama *TestParamB `json:"struct_parama,omitempty" xml:"struct_parama,omitempty" require:"true"`
	// 结构体列表a
	// example:
	//
	// undefined
	StructListA []*TestParamB `json:"struct_list_a,omitempty" xml:"struct_list_a,omitempty" type:"Repeated"`
}

func (s TestParamA) String() string {
	return tea.Prettify(s)
}

func (s TestParamA) GoString() string {
	return s.String()
}

func (s *TestParamA) SetStringParam(v string) *TestParamA {
	s.StringParam = &v
	return s
}

func (s *TestParamA) SetNumberParam(v int64) *TestParamA {
	s.NumberParam = &v
	return s
}

func (s *TestParamA) SetBooleanParam(v bool) *TestParamA {
	s.BooleanParam = &v
	return s
}

func (s *TestParamA) SetDateParam(v string) *TestParamA {
	s.DateParam = &v
	return s
}

func (s *TestParamA) SetStructParama(v *TestParamB) *TestParamA {
	s.StructParama = v
	return s
}

func (s *TestParamA) SetStructListA(v []*TestParamB) *TestParamA {
	s.StructListA = v
	return s
}

// a
type TestDemo struct {
	// a
	// example:
	//
	// a
	Timeout *string `json:"timeout,omitempty" xml:"timeout,omitempty"`
}

func (s TestDemo) String() string {
	return tea.Prettify(s)
}

func (s TestDemo) GoString() string {
	return s.String()
}

func (s *TestDemo) SetTimeout(v string) *TestDemo {
	s.Timeout = &v
	return s
}

// Demo类1
type DemoClass struct {
	// 字符串测试
	// example:
	//
	// some string
	SomeString *string `json:"some_string,omitempty" xml:"some_string,omitempty" require:"true"`
	// 日期测试
	// example:
	//
	// 3
	SomeDate *string `json:"some_date,omitempty" xml:"some_date,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// Boolean测试
	// example:
	//
	// true
	SomeBoolean *bool `json:"some_boolean,omitempty" xml:"some_boolean,omitempty" require:"true"`
	// 整数测试
	// example:
	//
	// 3
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

// 测试11-22
type TestParams struct {
	// a
	// example:
	//
	// undefined
	Parameter *TestParamA `json:"parameter,omitempty" xml:"parameter,omitempty"`
	// string
	// example:
	//
	// string
	String_ *string `json:"string,omitempty" xml:"string,omitempty"`
}

func (s TestParams) String() string {
	return tea.Prettify(s)
}

func (s TestParams) GoString() string {
	return s.String()
}

func (s *TestParams) SetParameter(v *TestParamA) *TestParams {
	s.Parameter = v
	return s
}

func (s *TestParams) SetString_(v string) *TestParams {
	s.String_ = &v
	return s
}

// aa
type OrderA struct {
	// aa
	// example:
	//
	// a
	Aaa *string `json:"aaa,omitempty" xml:"aaa,omitempty"`
}

func (s OrderA) String() string {
	return tea.Prettify(s)
}

func (s OrderA) GoString() string {
	return s.String()
}

func (s *OrderA) SetAaa(v string) *OrderA {
	s.Aaa = &v
	return s
}

// DEMOSDK结构体A·edit for test18
type DemosdkStructA struct {
	// 【公司名称】
	// example:
	//
	// xx公司
	CompanyName *string `json:"company_name,omitempty" xml:"company_name,omitempty"`
	// 【业务类型】
	// example:
	//
	// 运营
	ProductMainClass *string `json:"product_main_class,omitempty" xml:"product_main_class,omitempty"`
	// 【公司地址】
	// example:
	//
	// xx市xx区
	CompanyAddress *string `json:"company_address,omitempty" xml:"company_address,omitempty"`
	// 【联系人】
	// example:
	//
	// 张三
	ContactName *string `json:"contact_name,omitempty" xml:"contact_name,omitempty"`
	// 【联系人手机号】
	// example:
	//
	// 13688888888
	ContactMobile *string `json:"contact_mobile,omitempty" xml:"contact_mobile,omitempty"`
}

func (s DemosdkStructA) String() string {
	return tea.Prettify(s)
}

func (s DemosdkStructA) GoString() string {
	return s.String()
}

func (s *DemosdkStructA) SetCompanyName(v string) *DemosdkStructA {
	s.CompanyName = &v
	return s
}

func (s *DemosdkStructA) SetProductMainClass(v string) *DemosdkStructA {
	s.ProductMainClass = &v
	return s
}

func (s *DemosdkStructA) SetCompanyAddress(v string) *DemosdkStructA {
	s.CompanyAddress = &v
	return s
}

func (s *DemosdkStructA) SetContactName(v string) *DemosdkStructA {
	s.ContactName = &v
	return s
}

func (s *DemosdkStructA) SetContactMobile(v string) *DemosdkStructA {
	s.ContactMobile = &v
	return s
}

// 返回结果测试类-11
type ResultTest struct {
	// 姓名
	// example:
	//
	// 张三
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
}

func (s ResultTest) String() string {
	return tea.Prettify(s)
}

func (s ResultTest) GoString() string {
	return s.String()
}

func (s *ResultTest) SetName(v string) *ResultTest {
	s.Name = &v
	return s
}

// aaa
type CreateStructA struct {
	// 超时时间
	// example:
	//
	// 3000
	Timeouta *string `json:"timeouta,omitempty" xml:"timeouta,omitempty"`
}

func (s CreateStructA) String() string {
	return tea.Prettify(s)
}

func (s CreateStructA) GoString() string {
	return s.String()
}

func (s *CreateStructA) SetTimeouta(v string) *CreateStructA {
	s.Timeouta = &v
	return s
}

// InitPack
type InitPack struct {
	// 2022-11-07 14:48
	// example:
	//
	// 2022-11-07 14:48
	Time *string `json:"time,omitempty" xml:"time,omitempty"`
	// wanyi
	// example:
	//
	// wanyi
	Operator *string `json:"operator,omitempty" xml:"operator,omitempty"`
	// 1
	// example:
	//
	// 1
	Count *int64 `json:"count,omitempty" xml:"count,omitempty"`
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

// a
type SumBean struct {
	// 1
	// example:
	//
	// 1
	A *int64 `json:"a,omitempty" xml:"a,omitempty"`
}

func (s SumBean) String() string {
	return tea.Prettify(s)
}

func (s SumBean) GoString() string {
	return s.String()
}

func (s *SumBean) SetA(v int64) *SumBean {
	s.A = &v
	return s
}

type TestStructOnlineRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 超时时间
	Timeout *string `json:"timeout,omitempty" xml:"timeout,omitempty"`
	// 结构体参数
	Struct *TestParams `json:"struct,omitempty" xml:"struct,omitempty"`
}

func (s TestStructOnlineRequest) String() string {
	return tea.Prettify(s)
}

func (s TestStructOnlineRequest) GoString() string {
	return s.String()
}

func (s *TestStructOnlineRequest) SetAuthToken(v string) *TestStructOnlineRequest {
	s.AuthToken = &v
	return s
}

func (s *TestStructOnlineRequest) SetProductInstanceId(v string) *TestStructOnlineRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *TestStructOnlineRequest) SetTimeout(v string) *TestStructOnlineRequest {
	s.Timeout = &v
	return s
}

func (s *TestStructOnlineRequest) SetStruct(v *TestParams) *TestStructOnlineRequest {
	s.Struct = v
	return s
}

type TestStructOnlineResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 状态码
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 状态描述
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
}

func (s TestStructOnlineResponse) String() string {
	return tea.Prettify(s)
}

func (s TestStructOnlineResponse) GoString() string {
	return s.String()
}

func (s *TestStructOnlineResponse) SetReqMsgId(v string) *TestStructOnlineResponse {
	s.ReqMsgId = &v
	return s
}

func (s *TestStructOnlineResponse) SetResultCode(v string) *TestStructOnlineResponse {
	s.ResultCode = &v
	return s
}

func (s *TestStructOnlineResponse) SetResultMsg(v string) *TestStructOnlineResponse {
	s.ResultMsg = &v
	return s
}

func (s *TestStructOnlineResponse) SetStatus(v string) *TestStructOnlineResponse {
	s.Status = &v
	return s
}

func (s *TestStructOnlineResponse) SetMsg(v string) *TestStructOnlineResponse {
	s.Msg = &v
	return s
}

type TestaStructCreateRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 信息
	TestParamB *DemosdkStructA `json:"test_param_b,omitempty" xml:"test_param_b,omitempty"`
	// 超时时间
	Timeout *string `json:"timeout,omitempty" xml:"timeout,omitempty"`
}

func (s TestaStructCreateRequest) String() string {
	return tea.Prettify(s)
}

func (s TestaStructCreateRequest) GoString() string {
	return s.String()
}

func (s *TestaStructCreateRequest) SetAuthToken(v string) *TestaStructCreateRequest {
	s.AuthToken = &v
	return s
}

func (s *TestaStructCreateRequest) SetProductInstanceId(v string) *TestaStructCreateRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *TestaStructCreateRequest) SetTestParamB(v *DemosdkStructA) *TestaStructCreateRequest {
	s.TestParamB = v
	return s
}

func (s *TestaStructCreateRequest) SetTimeout(v string) *TestaStructCreateRequest {
	s.Timeout = &v
	return s
}

type TestaStructCreateResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 状态码
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 状态描述
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
}

func (s TestaStructCreateResponse) String() string {
	return tea.Prettify(s)
}

func (s TestaStructCreateResponse) GoString() string {
	return s.String()
}

func (s *TestaStructCreateResponse) SetReqMsgId(v string) *TestaStructCreateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *TestaStructCreateResponse) SetResultCode(v string) *TestaStructCreateResponse {
	s.ResultCode = &v
	return s
}

func (s *TestaStructCreateResponse) SetResultMsg(v string) *TestaStructCreateResponse {
	s.ResultMsg = &v
	return s
}

func (s *TestaStructCreateResponse) SetStatus(v string) *TestaStructCreateResponse {
	s.Status = &v
	return s
}

func (s *TestaStructCreateResponse) SetMsg(v string) *TestaStructCreateResponse {
	s.Msg = &v
	return s
}

type QueryAaaSdkRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s QueryAaaSdkRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAaaSdkRequest) GoString() string {
	return s.String()
}

func (s *QueryAaaSdkRequest) SetAuthToken(v string) *QueryAaaSdkRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAaaSdkRequest) SetProductInstanceId(v string) *QueryAaaSdkRequest {
	s.ProductInstanceId = &v
	return s
}

type QueryAaaSdkResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s QueryAaaSdkResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAaaSdkResponse) GoString() string {
	return s.String()
}

func (s *QueryAaaSdkResponse) SetReqMsgId(v string) *QueryAaaSdkResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAaaSdkResponse) SetResultCode(v string) *QueryAaaSdkResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAaaSdkResponse) SetResultMsg(v string) *QueryAaaSdkResponse {
	s.ResultMsg = &v
	return s
}

type QueryMultiCciuRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// aaa
	Aaaaa *TestParams `json:"aaaaa,omitempty" xml:"aaaaa,omitempty"`
	// bbbbb
	Bbbbb *string `json:"bbbbb,omitempty" xml:"bbbbb,omitempty"`
}

func (s QueryMultiCciuRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryMultiCciuRequest) GoString() string {
	return s.String()
}

func (s *QueryMultiCciuRequest) SetAuthToken(v string) *QueryMultiCciuRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryMultiCciuRequest) SetProductInstanceId(v string) *QueryMultiCciuRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryMultiCciuRequest) SetAaaaa(v *TestParams) *QueryMultiCciuRequest {
	s.Aaaaa = v
	return s
}

func (s *QueryMultiCciuRequest) SetBbbbb(v string) *QueryMultiCciuRequest {
	s.Bbbbb = &v
	return s
}

type QueryMultiCciuResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// bbbb
	Bbbb *string `json:"bbbb,omitempty" xml:"bbbb,omitempty"`
}

func (s QueryMultiCciuResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryMultiCciuResponse) GoString() string {
	return s.String()
}

func (s *QueryMultiCciuResponse) SetReqMsgId(v string) *QueryMultiCciuResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryMultiCciuResponse) SetResultCode(v string) *QueryMultiCciuResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryMultiCciuResponse) SetResultMsg(v string) *QueryMultiCciuResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryMultiCciuResponse) SetBbbb(v string) *QueryMultiCciuResponse {
	s.Bbbb = &v
	return s
}

type QueryIamTestRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s QueryIamTestRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryIamTestRequest) GoString() string {
	return s.String()
}

func (s *QueryIamTestRequest) SetAuthToken(v string) *QueryIamTestRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryIamTestRequest) SetProductInstanceId(v string) *QueryIamTestRequest {
	s.ProductInstanceId = &v
	return s
}

type QueryIamTestResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s QueryIamTestResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryIamTestResponse) GoString() string {
	return s.String()
}

func (s *QueryIamTestResponse) SetReqMsgId(v string) *QueryIamTestResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryIamTestResponse) SetResultCode(v string) *QueryIamTestResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryIamTestResponse) SetResultMsg(v string) *QueryIamTestResponse {
	s.ResultMsg = &v
	return s
}

type TestIamSynchronousRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s TestIamSynchronousRequest) String() string {
	return tea.Prettify(s)
}

func (s TestIamSynchronousRequest) GoString() string {
	return s.String()
}

func (s *TestIamSynchronousRequest) SetAuthToken(v string) *TestIamSynchronousRequest {
	s.AuthToken = &v
	return s
}

func (s *TestIamSynchronousRequest) SetProductInstanceId(v string) *TestIamSynchronousRequest {
	s.ProductInstanceId = &v
	return s
}

type TestIamSynchronousResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s TestIamSynchronousResponse) String() string {
	return tea.Prettify(s)
}

func (s TestIamSynchronousResponse) GoString() string {
	return s.String()
}

func (s *TestIamSynchronousResponse) SetReqMsgId(v string) *TestIamSynchronousResponse {
	s.ReqMsgId = &v
	return s
}

func (s *TestIamSynchronousResponse) SetResultCode(v string) *TestIamSynchronousResponse {
	s.ResultCode = &v
	return s
}

func (s *TestIamSynchronousResponse) SetResultMsg(v string) *TestIamSynchronousResponse {
	s.ResultMsg = &v
	return s
}

type IamIamIamRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s IamIamIamRequest) String() string {
	return tea.Prettify(s)
}

func (s IamIamIamRequest) GoString() string {
	return s.String()
}

func (s *IamIamIamRequest) SetAuthToken(v string) *IamIamIamRequest {
	s.AuthToken = &v
	return s
}

func (s *IamIamIamRequest) SetProductInstanceId(v string) *IamIamIamRequest {
	s.ProductInstanceId = &v
	return s
}

type IamIamIamResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s IamIamIamResponse) String() string {
	return tea.Prettify(s)
}

func (s IamIamIamResponse) GoString() string {
	return s.String()
}

func (s *IamIamIamResponse) SetReqMsgId(v string) *IamIamIamResponse {
	s.ReqMsgId = &v
	return s
}

func (s *IamIamIamResponse) SetResultCode(v string) *IamIamIamResponse {
	s.ResultCode = &v
	return s
}

func (s *IamIamIamResponse) SetResultMsg(v string) *IamIamIamResponse {
	s.ResultMsg = &v
	return s
}

type TestIamPushRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s TestIamPushRequest) String() string {
	return tea.Prettify(s)
}

func (s TestIamPushRequest) GoString() string {
	return s.String()
}

func (s *TestIamPushRequest) SetAuthToken(v string) *TestIamPushRequest {
	s.AuthToken = &v
	return s
}

func (s *TestIamPushRequest) SetProductInstanceId(v string) *TestIamPushRequest {
	s.ProductInstanceId = &v
	return s
}

type TestIamPushResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s TestIamPushResponse) String() string {
	return tea.Prettify(s)
}

func (s TestIamPushResponse) GoString() string {
	return s.String()
}

func (s *TestIamPushResponse) SetReqMsgId(v string) *TestIamPushResponse {
	s.ReqMsgId = &v
	return s
}

func (s *TestIamPushResponse) SetResultCode(v string) *TestIamPushResponse {
	s.ResultCode = &v
	return s
}

func (s *TestIamPushResponse) SetResultMsg(v string) *TestIamPushResponse {
	s.ResultMsg = &v
	return s
}

type QueryIamPushRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s QueryIamPushRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryIamPushRequest) GoString() string {
	return s.String()
}

func (s *QueryIamPushRequest) SetAuthToken(v string) *QueryIamPushRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryIamPushRequest) SetProductInstanceId(v string) *QueryIamPushRequest {
	s.ProductInstanceId = &v
	return s
}

type QueryIamPushResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s QueryIamPushResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryIamPushResponse) GoString() string {
	return s.String()
}

func (s *QueryIamPushResponse) SetReqMsgId(v string) *QueryIamPushResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryIamPushResponse) SetResultCode(v string) *QueryIamPushResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryIamPushResponse) SetResultMsg(v string) *QueryIamPushResponse {
	s.ResultMsg = &v
	return s
}

type IamApipushForRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s IamApipushForRequest) String() string {
	return tea.Prettify(s)
}

func (s IamApipushForRequest) GoString() string {
	return s.String()
}

func (s *IamApipushForRequest) SetAuthToken(v string) *IamApipushForRequest {
	s.AuthToken = &v
	return s
}

func (s *IamApipushForRequest) SetProductInstanceId(v string) *IamApipushForRequest {
	s.ProductInstanceId = &v
	return s
}

type IamApipushForResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s IamApipushForResponse) String() string {
	return tea.Prettify(s)
}

func (s IamApipushForResponse) GoString() string {
	return s.String()
}

func (s *IamApipushForResponse) SetReqMsgId(v string) *IamApipushForResponse {
	s.ReqMsgId = &v
	return s
}

func (s *IamApipushForResponse) SetResultCode(v string) *IamApipushForResponse {
	s.ResultCode = &v
	return s
}

func (s *IamApipushForResponse) SetResultMsg(v string) *IamApipushForResponse {
	s.ResultMsg = &v
	return s
}

type ConfigQueryApiRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 超时时间
	Timeout *string `json:"timeout,omitempty" xml:"timeout,omitempty"`
}

func (s ConfigQueryApiRequest) String() string {
	return tea.Prettify(s)
}

func (s ConfigQueryApiRequest) GoString() string {
	return s.String()
}

func (s *ConfigQueryApiRequest) SetAuthToken(v string) *ConfigQueryApiRequest {
	s.AuthToken = &v
	return s
}

func (s *ConfigQueryApiRequest) SetProductInstanceId(v string) *ConfigQueryApiRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ConfigQueryApiRequest) SetTimeout(v string) *ConfigQueryApiRequest {
	s.Timeout = &v
	return s
}

type ConfigQueryApiResponse struct {
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

func (s ConfigQueryApiResponse) String() string {
	return tea.Prettify(s)
}

func (s ConfigQueryApiResponse) GoString() string {
	return s.String()
}

func (s *ConfigQueryApiResponse) SetReqMsgId(v string) *ConfigQueryApiResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ConfigQueryApiResponse) SetResultCode(v string) *ConfigQueryApiResponse {
	s.ResultCode = &v
	return s
}

func (s *ConfigQueryApiResponse) SetResultMsg(v string) *ConfigQueryApiResponse {
	s.ResultMsg = &v
	return s
}

func (s *ConfigQueryApiResponse) SetStauts(v string) *ConfigQueryApiResponse {
	s.Stauts = &v
	return s
}

func (s *ConfigQueryApiResponse) SetMsg(v string) *ConfigQueryApiResponse {
	s.Msg = &v
	return s
}

type ApiaAciCreateRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 超时时间
	Timeout *string `json:"timeout,omitempty" xml:"timeout,omitempty" require:"true"`
}

func (s ApiaAciCreateRequest) String() string {
	return tea.Prettify(s)
}

func (s ApiaAciCreateRequest) GoString() string {
	return s.String()
}

func (s *ApiaAciCreateRequest) SetAuthToken(v string) *ApiaAciCreateRequest {
	s.AuthToken = &v
	return s
}

func (s *ApiaAciCreateRequest) SetProductInstanceId(v string) *ApiaAciCreateRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ApiaAciCreateRequest) SetTimeout(v string) *ApiaAciCreateRequest {
	s.Timeout = &v
	return s
}

type ApiaAciCreateResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 状态描述
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
	// 状态码
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
}

func (s ApiaAciCreateResponse) String() string {
	return tea.Prettify(s)
}

func (s ApiaAciCreateResponse) GoString() string {
	return s.String()
}

func (s *ApiaAciCreateResponse) SetReqMsgId(v string) *ApiaAciCreateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ApiaAciCreateResponse) SetResultCode(v string) *ApiaAciCreateResponse {
	s.ResultCode = &v
	return s
}

func (s *ApiaAciCreateResponse) SetResultMsg(v string) *ApiaAciCreateResponse {
	s.ResultMsg = &v
	return s
}

func (s *ApiaAciCreateResponse) SetMsg(v string) *ApiaAciCreateResponse {
	s.Msg = &v
	return s
}

func (s *ApiaAciCreateResponse) SetStatus(v string) *ApiaAciCreateResponse {
	s.Status = &v
	return s
}

type BindAaaBbbCccRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 123
	Date *string `json:"date,omitempty" xml:"date,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 123
	Data *string `json:"data,omitempty" xml:"data,omitempty" require:"true"`
	// 测试参数
	DemoClass *DemoClass `json:"demo_class,omitempty" xml:"demo_class,omitempty" require:"true"`
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

func (s *BindAaaBbbCccRequest) SetDate(v string) *BindAaaBbbCccRequest {
	s.Date = &v
	return s
}

func (s *BindAaaBbbCccRequest) SetData(v string) *BindAaaBbbCccRequest {
	s.Data = &v
	return s
}

func (s *BindAaaBbbCccRequest) SetDemoClass(v *DemoClass) *BindAaaBbbCccRequest {
	s.DemoClass = v
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

type QueryAaaCcdRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 123
	Test *string `json:"test,omitempty" xml:"test,omitempty"`
	// 结构体字段
	ListParamsDemosdk []*TestParamA `json:"list_params_demosdk,omitempty" xml:"list_params_demosdk,omitempty" type:"Repeated"`
}

func (s QueryAaaCcdRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAaaCcdRequest) GoString() string {
	return s.String()
}

func (s *QueryAaaCcdRequest) SetAuthToken(v string) *QueryAaaCcdRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAaaCcdRequest) SetProductInstanceId(v string) *QueryAaaCcdRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAaaCcdRequest) SetTest(v string) *QueryAaaCcdRequest {
	s.Test = &v
	return s
}

func (s *QueryAaaCcdRequest) SetListParamsDemosdk(v []*TestParamA) *QueryAaaCcdRequest {
	s.ListParamsDemosdk = v
	return s
}

type QueryAaaCcdResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s QueryAaaCcdResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAaaCcdResponse) GoString() string {
	return s.String()
}

func (s *QueryAaaCcdResponse) SetReqMsgId(v string) *QueryAaaCcdResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAaaCcdResponse) SetResultCode(v string) *QueryAaaCcdResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAaaCcdResponse) SetResultMsg(v string) *QueryAaaCcdResponse {
	s.ResultMsg = &v
	return s
}

type BindXxxRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 123
	Date *string `json:"date,omitempty" xml:"date,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 123
	Data *string `json:"data,omitempty" xml:"data,omitempty" require:"true"`
}

func (s BindXxxRequest) String() string {
	return tea.Prettify(s)
}

func (s BindXxxRequest) GoString() string {
	return s.String()
}

func (s *BindXxxRequest) SetAuthToken(v string) *BindXxxRequest {
	s.AuthToken = &v
	return s
}

func (s *BindXxxRequest) SetProductInstanceId(v string) *BindXxxRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *BindXxxRequest) SetDate(v string) *BindXxxRequest {
	s.Date = &v
	return s
}

func (s *BindXxxRequest) SetData(v string) *BindXxxRequest {
	s.Data = &v
	return s
}

type BindXxxResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s BindXxxResponse) String() string {
	return tea.Prettify(s)
}

func (s BindXxxResponse) GoString() string {
	return s.String()
}

func (s *BindXxxResponse) SetReqMsgId(v string) *BindXxxResponse {
	s.ReqMsgId = &v
	return s
}

func (s *BindXxxResponse) SetResultCode(v string) *BindXxxResponse {
	s.ResultCode = &v
	return s
}

func (s *BindXxxResponse) SetResultMsg(v string) *BindXxxResponse {
	s.ResultMsg = &v
	return s
}

type QueryTxtRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 姓名
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
}

func (s QueryTxtRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryTxtRequest) GoString() string {
	return s.String()
}

func (s *QueryTxtRequest) SetAuthToken(v string) *QueryTxtRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryTxtRequest) SetProductInstanceId(v string) *QueryTxtRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryTxtRequest) SetName(v string) *QueryTxtRequest {
	s.Name = &v
	return s
}

type QueryTxtResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 证件号
	Idcard *string `json:"idcard,omitempty" xml:"idcard,omitempty"`
}

func (s QueryTxtResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryTxtResponse) GoString() string {
	return s.String()
}

func (s *QueryTxtResponse) SetReqMsgId(v string) *QueryTxtResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryTxtResponse) SetResultCode(v string) *QueryTxtResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryTxtResponse) SetResultMsg(v string) *QueryTxtResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryTxtResponse) SetIdcard(v string) *QueryTxtResponse {
	s.Idcard = &v
	return s
}

type ListTxtRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 124
	Idcard *string `json:"idcard,omitempty" xml:"idcard,omitempty"`
}

func (s ListTxtRequest) String() string {
	return tea.Prettify(s)
}

func (s ListTxtRequest) GoString() string {
	return s.String()
}

func (s *ListTxtRequest) SetAuthToken(v string) *ListTxtRequest {
	s.AuthToken = &v
	return s
}

func (s *ListTxtRequest) SetProductInstanceId(v string) *ListTxtRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListTxtRequest) SetIdcard(v string) *ListTxtRequest {
	s.Idcard = &v
	return s
}

type ListTxtResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s ListTxtResponse) String() string {
	return tea.Prettify(s)
}

func (s ListTxtResponse) GoString() string {
	return s.String()
}

func (s *ListTxtResponse) SetReqMsgId(v string) *ListTxtResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListTxtResponse) SetResultCode(v string) *ListTxtResponse {
	s.ResultCode = &v
	return s
}

func (s *ListTxtResponse) SetResultMsg(v string) *ListTxtResponse {
	s.ResultMsg = &v
	return s
}

type QueryWorkbenchTestRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 3000
	Timeout *string `json:"timeout,omitempty" xml:"timeout,omitempty"`
	// 请求编号
	Count *int64 `json:"count,omitempty" xml:"count,omitempty"`
	// 请求时间
	Time *string `json:"time,omitempty" xml:"time,omitempty"`
	// 请求描述
	Desc *string `json:"desc,omitempty" xml:"desc,omitempty"`
	// 操作人
	Operator *string `json:"operator,omitempty" xml:"operator,omitempty"`
	// aaaaa
	Aaaaa *string `json:"aaaaa,omitempty" xml:"aaaaa,omitempty"`
}

func (s QueryWorkbenchTestRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryWorkbenchTestRequest) GoString() string {
	return s.String()
}

func (s *QueryWorkbenchTestRequest) SetAuthToken(v string) *QueryWorkbenchTestRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryWorkbenchTestRequest) SetProductInstanceId(v string) *QueryWorkbenchTestRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryWorkbenchTestRequest) SetTimeout(v string) *QueryWorkbenchTestRequest {
	s.Timeout = &v
	return s
}

func (s *QueryWorkbenchTestRequest) SetCount(v int64) *QueryWorkbenchTestRequest {
	s.Count = &v
	return s
}

func (s *QueryWorkbenchTestRequest) SetTime(v string) *QueryWorkbenchTestRequest {
	s.Time = &v
	return s
}

func (s *QueryWorkbenchTestRequest) SetDesc(v string) *QueryWorkbenchTestRequest {
	s.Desc = &v
	return s
}

func (s *QueryWorkbenchTestRequest) SetOperator(v string) *QueryWorkbenchTestRequest {
	s.Operator = &v
	return s
}

func (s *QueryWorkbenchTestRequest) SetAaaaa(v string) *QueryWorkbenchTestRequest {
	s.Aaaaa = &v
	return s
}

type QueryWorkbenchTestResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 状态
	Stauts *string `json:"stauts,omitempty" xml:"stauts,omitempty"`
	// 描述
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
}

func (s QueryWorkbenchTestResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryWorkbenchTestResponse) GoString() string {
	return s.String()
}

func (s *QueryWorkbenchTestResponse) SetReqMsgId(v string) *QueryWorkbenchTestResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryWorkbenchTestResponse) SetResultCode(v string) *QueryWorkbenchTestResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryWorkbenchTestResponse) SetResultMsg(v string) *QueryWorkbenchTestResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryWorkbenchTestResponse) SetStauts(v string) *QueryWorkbenchTestResponse {
	s.Stauts = &v
	return s
}

func (s *QueryWorkbenchTestResponse) SetMsg(v string) *QueryWorkbenchTestResponse {
	s.Msg = &v
	return s
}

type ImportAbcdOneRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 超时时间
	Timeout *string `json:"timeout,omitempty" xml:"timeout,omitempty"`
	// 请求编号
	Count *int64 `json:"count,omitempty" xml:"count,omitempty"`
	// 请求时间
	Time *string `json:"time,omitempty" xml:"time,omitempty"`
	// 请求描述
	Desc *string `json:"desc,omitempty" xml:"desc,omitempty"`
	// 操作者
	Operator *string `json:"operator,omitempty" xml:"operator,omitempty"`
}

func (s ImportAbcdOneRequest) String() string {
	return tea.Prettify(s)
}

func (s ImportAbcdOneRequest) GoString() string {
	return s.String()
}

func (s *ImportAbcdOneRequest) SetAuthToken(v string) *ImportAbcdOneRequest {
	s.AuthToken = &v
	return s
}

func (s *ImportAbcdOneRequest) SetProductInstanceId(v string) *ImportAbcdOneRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ImportAbcdOneRequest) SetTimeout(v string) *ImportAbcdOneRequest {
	s.Timeout = &v
	return s
}

func (s *ImportAbcdOneRequest) SetCount(v int64) *ImportAbcdOneRequest {
	s.Count = &v
	return s
}

func (s *ImportAbcdOneRequest) SetTime(v string) *ImportAbcdOneRequest {
	s.Time = &v
	return s
}

func (s *ImportAbcdOneRequest) SetDesc(v string) *ImportAbcdOneRequest {
	s.Desc = &v
	return s
}

func (s *ImportAbcdOneRequest) SetOperator(v string) *ImportAbcdOneRequest {
	s.Operator = &v
	return s
}

type ImportAbcdOneResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 描述
	Stauts *string `json:"stauts,omitempty" xml:"stauts,omitempty"`
	// 描述
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
}

func (s ImportAbcdOneResponse) String() string {
	return tea.Prettify(s)
}

func (s ImportAbcdOneResponse) GoString() string {
	return s.String()
}

func (s *ImportAbcdOneResponse) SetReqMsgId(v string) *ImportAbcdOneResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ImportAbcdOneResponse) SetResultCode(v string) *ImportAbcdOneResponse {
	s.ResultCode = &v
	return s
}

func (s *ImportAbcdOneResponse) SetResultMsg(v string) *ImportAbcdOneResponse {
	s.ResultMsg = &v
	return s
}

func (s *ImportAbcdOneResponse) SetStauts(v string) *ImportAbcdOneResponse {
	s.Stauts = &v
	return s
}

func (s *ImportAbcdOneResponse) SetMsg(v string) *ImportAbcdOneResponse {
	s.Msg = &v
	return s
}

type PublishWorkbenchOneRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 超时时间
	Timeout *string `json:"timeout,omitempty" xml:"timeout,omitempty" require:"true"`
}

func (s PublishWorkbenchOneRequest) String() string {
	return tea.Prettify(s)
}

func (s PublishWorkbenchOneRequest) GoString() string {
	return s.String()
}

func (s *PublishWorkbenchOneRequest) SetAuthToken(v string) *PublishWorkbenchOneRequest {
	s.AuthToken = &v
	return s
}

func (s *PublishWorkbenchOneRequest) SetProductInstanceId(v string) *PublishWorkbenchOneRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PublishWorkbenchOneRequest) SetTimeout(v string) *PublishWorkbenchOneRequest {
	s.Timeout = &v
	return s
}

type PublishWorkbenchOneResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 状态
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
	// 状态码
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
}

func (s PublishWorkbenchOneResponse) String() string {
	return tea.Prettify(s)
}

func (s PublishWorkbenchOneResponse) GoString() string {
	return s.String()
}

func (s *PublishWorkbenchOneResponse) SetReqMsgId(v string) *PublishWorkbenchOneResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PublishWorkbenchOneResponse) SetResultCode(v string) *PublishWorkbenchOneResponse {
	s.ResultCode = &v
	return s
}

func (s *PublishWorkbenchOneResponse) SetResultMsg(v string) *PublishWorkbenchOneResponse {
	s.ResultMsg = &v
	return s
}

func (s *PublishWorkbenchOneResponse) SetMsg(v string) *PublishWorkbenchOneResponse {
	s.Msg = &v
	return s
}

func (s *PublishWorkbenchOneResponse) SetStatus(v string) *PublishWorkbenchOneResponse {
	s.Status = &v
	return s
}

type PublishWorkbenchTwoRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 超时时间
	Timeout *string `json:"timeout,omitempty" xml:"timeout,omitempty" require:"true"`
}

func (s PublishWorkbenchTwoRequest) String() string {
	return tea.Prettify(s)
}

func (s PublishWorkbenchTwoRequest) GoString() string {
	return s.String()
}

func (s *PublishWorkbenchTwoRequest) SetAuthToken(v string) *PublishWorkbenchTwoRequest {
	s.AuthToken = &v
	return s
}

func (s *PublishWorkbenchTwoRequest) SetProductInstanceId(v string) *PublishWorkbenchTwoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PublishWorkbenchTwoRequest) SetTimeout(v string) *PublishWorkbenchTwoRequest {
	s.Timeout = &v
	return s
}

type PublishWorkbenchTwoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 状态
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
	// 状态码
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
}

func (s PublishWorkbenchTwoResponse) String() string {
	return tea.Prettify(s)
}

func (s PublishWorkbenchTwoResponse) GoString() string {
	return s.String()
}

func (s *PublishWorkbenchTwoResponse) SetReqMsgId(v string) *PublishWorkbenchTwoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PublishWorkbenchTwoResponse) SetResultCode(v string) *PublishWorkbenchTwoResponse {
	s.ResultCode = &v
	return s
}

func (s *PublishWorkbenchTwoResponse) SetResultMsg(v string) *PublishWorkbenchTwoResponse {
	s.ResultMsg = &v
	return s
}

func (s *PublishWorkbenchTwoResponse) SetMsg(v string) *PublishWorkbenchTwoResponse {
	s.Msg = &v
	return s
}

func (s *PublishWorkbenchTwoResponse) SetStatus(v string) *PublishWorkbenchTwoResponse {
	s.Status = &v
	return s
}

type PublishTwiceOneRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 超时时间
	Timeout *string `json:"timeout,omitempty" xml:"timeout,omitempty"`
	// aa
	Aaa *DemoClass `json:"aaa,omitempty" xml:"aaa,omitempty"`
}

func (s PublishTwiceOneRequest) String() string {
	return tea.Prettify(s)
}

func (s PublishTwiceOneRequest) GoString() string {
	return s.String()
}

func (s *PublishTwiceOneRequest) SetAuthToken(v string) *PublishTwiceOneRequest {
	s.AuthToken = &v
	return s
}

func (s *PublishTwiceOneRequest) SetProductInstanceId(v string) *PublishTwiceOneRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PublishTwiceOneRequest) SetTimeout(v string) *PublishTwiceOneRequest {
	s.Timeout = &v
	return s
}

func (s *PublishTwiceOneRequest) SetAaa(v *DemoClass) *PublishTwiceOneRequest {
	s.Aaa = v
	return s
}

type PublishTwiceOneResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回状态码
	Stauts *string `json:"stauts,omitempty" xml:"stauts,omitempty"`
	// 返回结果描述
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
}

func (s PublishTwiceOneResponse) String() string {
	return tea.Prettify(s)
}

func (s PublishTwiceOneResponse) GoString() string {
	return s.String()
}

func (s *PublishTwiceOneResponse) SetReqMsgId(v string) *PublishTwiceOneResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PublishTwiceOneResponse) SetResultCode(v string) *PublishTwiceOneResponse {
	s.ResultCode = &v
	return s
}

func (s *PublishTwiceOneResponse) SetResultMsg(v string) *PublishTwiceOneResponse {
	s.ResultMsg = &v
	return s
}

func (s *PublishTwiceOneResponse) SetStauts(v string) *PublishTwiceOneResponse {
	s.Stauts = &v
	return s
}

func (s *PublishTwiceOneResponse) SetMsg(v string) *PublishTwiceOneResponse {
	s.Msg = &v
	return s
}

type ImportTwiceThreeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 超时间
	Timeout *string `json:"timeout,omitempty" xml:"timeout,omitempty" require:"true"`
	// 结构体A
	StructA *TestParamA `json:"struct_a,omitempty" xml:"struct_a,omitempty"`
	// 结构体B
	StructB *TestParamB `json:"struct_b,omitempty" xml:"struct_b,omitempty"`
}

func (s ImportTwiceThreeRequest) String() string {
	return tea.Prettify(s)
}

func (s ImportTwiceThreeRequest) GoString() string {
	return s.String()
}

func (s *ImportTwiceThreeRequest) SetAuthToken(v string) *ImportTwiceThreeRequest {
	s.AuthToken = &v
	return s
}

func (s *ImportTwiceThreeRequest) SetProductInstanceId(v string) *ImportTwiceThreeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ImportTwiceThreeRequest) SetTimeout(v string) *ImportTwiceThreeRequest {
	s.Timeout = &v
	return s
}

func (s *ImportTwiceThreeRequest) SetStructA(v *TestParamA) *ImportTwiceThreeRequest {
	s.StructA = v
	return s
}

func (s *ImportTwiceThreeRequest) SetStructB(v *TestParamB) *ImportTwiceThreeRequest {
	s.StructB = v
	return s
}

type ImportTwiceThreeResponse struct {
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

func (s ImportTwiceThreeResponse) String() string {
	return tea.Prettify(s)
}

func (s ImportTwiceThreeResponse) GoString() string {
	return s.String()
}

func (s *ImportTwiceThreeResponse) SetReqMsgId(v string) *ImportTwiceThreeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ImportTwiceThreeResponse) SetResultCode(v string) *ImportTwiceThreeResponse {
	s.ResultCode = &v
	return s
}

func (s *ImportTwiceThreeResponse) SetResultMsg(v string) *ImportTwiceThreeResponse {
	s.ResultMsg = &v
	return s
}

func (s *ImportTwiceThreeResponse) SetStauts(v string) *ImportTwiceThreeResponse {
	s.Stauts = &v
	return s
}

func (s *ImportTwiceThreeResponse) SetMsg(v string) *ImportTwiceThreeResponse {
	s.Msg = &v
	return s
}

type PublishWorkbenchThreeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 超时时间
	Timeout *string `json:"timeout,omitempty" xml:"timeout,omitempty" require:"true"`
}

func (s PublishWorkbenchThreeRequest) String() string {
	return tea.Prettify(s)
}

func (s PublishWorkbenchThreeRequest) GoString() string {
	return s.String()
}

func (s *PublishWorkbenchThreeRequest) SetAuthToken(v string) *PublishWorkbenchThreeRequest {
	s.AuthToken = &v
	return s
}

func (s *PublishWorkbenchThreeRequest) SetProductInstanceId(v string) *PublishWorkbenchThreeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PublishWorkbenchThreeRequest) SetTimeout(v string) *PublishWorkbenchThreeRequest {
	s.Timeout = &v
	return s
}

type PublishWorkbenchThreeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 状态
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
	// 状态码
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
}

func (s PublishWorkbenchThreeResponse) String() string {
	return tea.Prettify(s)
}

func (s PublishWorkbenchThreeResponse) GoString() string {
	return s.String()
}

func (s *PublishWorkbenchThreeResponse) SetReqMsgId(v string) *PublishWorkbenchThreeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PublishWorkbenchThreeResponse) SetResultCode(v string) *PublishWorkbenchThreeResponse {
	s.ResultCode = &v
	return s
}

func (s *PublishWorkbenchThreeResponse) SetResultMsg(v string) *PublishWorkbenchThreeResponse {
	s.ResultMsg = &v
	return s
}

func (s *PublishWorkbenchThreeResponse) SetMsg(v string) *PublishWorkbenchThreeResponse {
	s.Msg = &v
	return s
}

func (s *PublishWorkbenchThreeResponse) SetStatus(v string) *PublishWorkbenchThreeResponse {
	s.Status = &v
	return s
}

type PublishWorkbenchFourRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 超时时间
	Timeout *string `json:"timeout,omitempty" xml:"timeout,omitempty" require:"true"`
}

func (s PublishWorkbenchFourRequest) String() string {
	return tea.Prettify(s)
}

func (s PublishWorkbenchFourRequest) GoString() string {
	return s.String()
}

func (s *PublishWorkbenchFourRequest) SetAuthToken(v string) *PublishWorkbenchFourRequest {
	s.AuthToken = &v
	return s
}

func (s *PublishWorkbenchFourRequest) SetProductInstanceId(v string) *PublishWorkbenchFourRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PublishWorkbenchFourRequest) SetTimeout(v string) *PublishWorkbenchFourRequest {
	s.Timeout = &v
	return s
}

type PublishWorkbenchFourResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 状态
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
	// 状态码
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
}

func (s PublishWorkbenchFourResponse) String() string {
	return tea.Prettify(s)
}

func (s PublishWorkbenchFourResponse) GoString() string {
	return s.String()
}

func (s *PublishWorkbenchFourResponse) SetReqMsgId(v string) *PublishWorkbenchFourResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PublishWorkbenchFourResponse) SetResultCode(v string) *PublishWorkbenchFourResponse {
	s.ResultCode = &v
	return s
}

func (s *PublishWorkbenchFourResponse) SetResultMsg(v string) *PublishWorkbenchFourResponse {
	s.ResultMsg = &v
	return s
}

func (s *PublishWorkbenchFourResponse) SetMsg(v string) *PublishWorkbenchFourResponse {
	s.Msg = &v
	return s
}

func (s *PublishWorkbenchFourResponse) SetStatus(v string) *PublishWorkbenchFourResponse {
	s.Status = &v
	return s
}

type QueryAaaQqqRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 1
	Timeout *string `json:"timeout,omitempty" xml:"timeout,omitempty"`
}

func (s QueryAaaQqqRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAaaQqqRequest) GoString() string {
	return s.String()
}

func (s *QueryAaaQqqRequest) SetAuthToken(v string) *QueryAaaQqqRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAaaQqqRequest) SetProductInstanceId(v string) *QueryAaaQqqRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAaaQqqRequest) SetTimeout(v string) *QueryAaaQqqRequest {
	s.Timeout = &v
	return s
}

type QueryAaaQqqResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// OK
	Stauts *string `json:"stauts,omitempty" xml:"stauts,omitempty"`
	// msg
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
}

func (s QueryAaaQqqResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAaaQqqResponse) GoString() string {
	return s.String()
}

func (s *QueryAaaQqqResponse) SetReqMsgId(v string) *QueryAaaQqqResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAaaQqqResponse) SetResultCode(v string) *QueryAaaQqqResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAaaQqqResponse) SetResultMsg(v string) *QueryAaaQqqResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAaaQqqResponse) SetStauts(v string) *QueryAaaQqqResponse {
	s.Stauts = &v
	return s
}

func (s *QueryAaaQqqResponse) SetMsg(v string) *QueryAaaQqqResponse {
	s.Msg = &v
	return s
}

type CABRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 时间
	Timeout *string `json:"timeout,omitempty" xml:"timeout,omitempty" require:"true"`
}

func (s CABRequest) String() string {
	return tea.Prettify(s)
}

func (s CABRequest) GoString() string {
	return s.String()
}

func (s *CABRequest) SetAuthToken(v string) *CABRequest {
	s.AuthToken = &v
	return s
}

func (s *CABRequest) SetProductInstanceId(v string) *CABRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CABRequest) SetTimeout(v string) *CABRequest {
	s.Timeout = &v
	return s
}

type CABResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// OK
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// SUCCESS le
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
}

func (s CABResponse) String() string {
	return tea.Prettify(s)
}

func (s CABResponse) GoString() string {
	return s.String()
}

func (s *CABResponse) SetReqMsgId(v string) *CABResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CABResponse) SetResultCode(v string) *CABResponse {
	s.ResultCode = &v
	return s
}

func (s *CABResponse) SetResultMsg(v string) *CABResponse {
	s.ResultMsg = &v
	return s
}

func (s *CABResponse) SetStatus(v string) *CABResponse {
	s.Status = &v
	return s
}

func (s *CABResponse) SetMsg(v string) *CABResponse {
	s.Msg = &v
	return s
}

type AAARequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s AAARequest) String() string {
	return tea.Prettify(s)
}

func (s AAARequest) GoString() string {
	return s.String()
}

func (s *AAARequest) SetAuthToken(v string) *AAARequest {
	s.AuthToken = &v
	return s
}

func (s *AAARequest) SetProductInstanceId(v string) *AAARequest {
	s.ProductInstanceId = &v
	return s
}

type AAAResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s AAAResponse) String() string {
	return tea.Prettify(s)
}

func (s AAAResponse) GoString() string {
	return s.String()
}

func (s *AAAResponse) SetReqMsgId(v string) *AAAResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AAAResponse) SetResultCode(v string) *AAAResponse {
	s.ResultCode = &v
	return s
}

func (s *AAAResponse) SetResultMsg(v string) *AAAResponse {
	s.ResultMsg = &v
	return s
}

type ApiAutotestCreateRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s ApiAutotestCreateRequest) String() string {
	return tea.Prettify(s)
}

func (s ApiAutotestCreateRequest) GoString() string {
	return s.String()
}

func (s *ApiAutotestCreateRequest) SetAuthToken(v string) *ApiAutotestCreateRequest {
	s.AuthToken = &v
	return s
}

func (s *ApiAutotestCreateRequest) SetProductInstanceId(v string) *ApiAutotestCreateRequest {
	s.ProductInstanceId = &v
	return s
}

type ApiAutotestCreateResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s ApiAutotestCreateResponse) String() string {
	return tea.Prettify(s)
}

func (s ApiAutotestCreateResponse) GoString() string {
	return s.String()
}

func (s *ApiAutotestCreateResponse) SetReqMsgId(v string) *ApiAutotestCreateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ApiAutotestCreateResponse) SetResultCode(v string) *ApiAutotestCreateResponse {
	s.ResultCode = &v
	return s
}

func (s *ApiAutotestCreateResponse) SetResultMsg(v string) *ApiAutotestCreateResponse {
	s.ResultMsg = &v
	return s
}

type ZhongyipretestbZhongyipretestbZhongyipretestbRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 1
	Timeout *string `json:"timeout,omitempty" xml:"timeout,omitempty"`
	// struct_parama
	StructParama *TestParamA `json:"struct_parama,omitempty" xml:"struct_parama,omitempty"`
}

func (s ZhongyipretestbZhongyipretestbZhongyipretestbRequest) String() string {
	return tea.Prettify(s)
}

func (s ZhongyipretestbZhongyipretestbZhongyipretestbRequest) GoString() string {
	return s.String()
}

func (s *ZhongyipretestbZhongyipretestbZhongyipretestbRequest) SetAuthToken(v string) *ZhongyipretestbZhongyipretestbZhongyipretestbRequest {
	s.AuthToken = &v
	return s
}

func (s *ZhongyipretestbZhongyipretestbZhongyipretestbRequest) SetProductInstanceId(v string) *ZhongyipretestbZhongyipretestbZhongyipretestbRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ZhongyipretestbZhongyipretestbZhongyipretestbRequest) SetTimeout(v string) *ZhongyipretestbZhongyipretestbZhongyipretestbRequest {
	s.Timeout = &v
	return s
}

func (s *ZhongyipretestbZhongyipretestbZhongyipretestbRequest) SetStructParama(v *TestParamA) *ZhongyipretestbZhongyipretestbZhongyipretestbRequest {
	s.StructParama = v
	return s
}

type ZhongyipretestbZhongyipretestbZhongyipretestbResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 1
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
	// ok
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
}

func (s ZhongyipretestbZhongyipretestbZhongyipretestbResponse) String() string {
	return tea.Prettify(s)
}

func (s ZhongyipretestbZhongyipretestbZhongyipretestbResponse) GoString() string {
	return s.String()
}

func (s *ZhongyipretestbZhongyipretestbZhongyipretestbResponse) SetReqMsgId(v string) *ZhongyipretestbZhongyipretestbZhongyipretestbResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ZhongyipretestbZhongyipretestbZhongyipretestbResponse) SetResultCode(v string) *ZhongyipretestbZhongyipretestbZhongyipretestbResponse {
	s.ResultCode = &v
	return s
}

func (s *ZhongyipretestbZhongyipretestbZhongyipretestbResponse) SetResultMsg(v string) *ZhongyipretestbZhongyipretestbZhongyipretestbResponse {
	s.ResultMsg = &v
	return s
}

func (s *ZhongyipretestbZhongyipretestbZhongyipretestbResponse) SetMsg(v string) *ZhongyipretestbZhongyipretestbZhongyipretestbResponse {
	s.Msg = &v
	return s
}

func (s *ZhongyipretestbZhongyipretestbZhongyipretestbResponse) SetStatus(v string) *ZhongyipretestbZhongyipretestbZhongyipretestbResponse {
	s.Status = &v
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
				"sdk_version":      tea.String("1.3.57"),
				"_prod_code":       tea.String("DEMOSDK"),
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
// Description: 用于结构体上线测试
//
// Summary: 用于结构体上线测试
func (client *Client) TestStructOnline(request *TestStructOnlineRequest) (_result *TestStructOnlineResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &TestStructOnlineResponse{}
	_body, _err := client.TestStructOnlineEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 用于结构体上线测试
//
// Summary: 用于结构体上线测试
func (client *Client) TestStructOnlineEx(request *TestStructOnlineRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *TestStructOnlineResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &TestStructOnlineResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.demosdk.struct.online.test"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 结构体测试·edit for test18
//
// Summary: 结构体测试·edit for test18
func (client *Client) TestaStructCreate(request *TestaStructCreateRequest) (_result *TestaStructCreateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &TestaStructCreateResponse{}
	_body, _err := client.TestaStructCreateEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 结构体测试·edit for test18
//
// Summary: 结构体测试·edit for test18
func (client *Client) TestaStructCreateEx(request *TestaStructCreateRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *TestaStructCreateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &TestaStructCreateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.demosdk.struct.create.testa"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 这是测试的
//
// Summary: 这是测试的
func (client *Client) QueryAaaSdk(request *QueryAaaSdkRequest) (_result *QueryAaaSdkResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAaaSdkResponse{}
	_body, _err := client.QueryAaaSdkEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 这是测试的
//
// Summary: 这是测试的
func (client *Client) QueryAaaSdkEx(request *QueryAaaSdkRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAaaSdkResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAaaSdkResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.demosdk.aaa.sdk.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: l
//
// Summary: l
func (client *Client) QueryMultiCciu(request *QueryMultiCciuRequest) (_result *QueryMultiCciuResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryMultiCciuResponse{}
	_body, _err := client.QueryMultiCciuEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: l
//
// Summary: l
func (client *Client) QueryMultiCciuEx(request *QueryMultiCciuRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryMultiCciuResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryMultiCciuResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.demosdk.multi.cciu.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: a
//
// Summary: a
func (client *Client) QueryIamTest(request *QueryIamTestRequest) (_result *QueryIamTestResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryIamTestResponse{}
	_body, _err := client.QueryIamTestEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: a
//
// Summary: a
func (client *Client) QueryIamTestEx(request *QueryIamTestRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryIamTestResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryIamTestResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.demosdk.iam.test.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: iam同步测试
//
// Summary: iam同步测试
func (client *Client) TestIamSynchronous(request *TestIamSynchronousRequest) (_result *TestIamSynchronousResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &TestIamSynchronousResponse{}
	_body, _err := client.TestIamSynchronousEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: iam同步测试
//
// Summary: iam同步测试
func (client *Client) TestIamSynchronousEx(request *TestIamSynchronousRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *TestIamSynchronousResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &TestIamSynchronousResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.demosdk.iam.synchronous.test"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: iam同步测试
//
// Summary: iam同步测试
func (client *Client) IamIamIam(request *IamIamIamRequest) (_result *IamIamIamResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &IamIamIamResponse{}
	_body, _err := client.IamIamIamEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: iam同步测试
//
// Summary: iam同步测试
func (client *Client) IamIamIamEx(request *IamIamIamRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *IamIamIamResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &IamIamIamResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.demosdk.iam.iam.iam"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: iam推送测试
//
// Summary: iam推送测试
func (client *Client) TestIamPush(request *TestIamPushRequest) (_result *TestIamPushResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &TestIamPushResponse{}
	_body, _err := client.TestIamPushEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: iam推送测试
//
// Summary: iam推送测试
func (client *Client) TestIamPushEx(request *TestIamPushRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *TestIamPushResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &TestIamPushResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.demosdk.iam.push.test"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) QueryIamPush(request *QueryIamPushRequest) (_result *QueryIamPushResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryIamPushResponse{}
	_body, _err := client.QueryIamPushEx(request, headers, runtime)
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
func (client *Client) QueryIamPushEx(request *QueryIamPushRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryIamPushResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryIamPushResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.demosdk.iam.push.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) IamApipushFor(request *IamApipushForRequest) (_result *IamApipushForResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &IamApipushForResponse{}
	_body, _err := client.IamApipushForEx(request, headers, runtime)
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
func (client *Client) IamApipushForEx(request *IamApipushForRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *IamApipushForResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &IamApipushForResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.demosdk.apipush.for.iam"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: queryApiConfig接口优化
//
// Summary: queryApiConfig接口优化
func (client *Client) ConfigQueryApi(request *ConfigQueryApiRequest) (_result *ConfigQueryApiResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ConfigQueryApiResponse{}
	_body, _err := client.ConfigQueryApiEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: queryApiConfig接口优化
//
// Summary: queryApiConfig接口优化
func (client *Client) ConfigQueryApiEx(request *ConfigQueryApiRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ConfigQueryApiResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ConfigQueryApiResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.demosdk.query.api.config"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 自动化创建接口a
//
// Summary: 自动化创建接口a
func (client *Client) ApiaAciCreate(request *ApiaAciCreateRequest) (_result *ApiaAciCreateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ApiaAciCreateResponse{}
	_body, _err := client.ApiaAciCreateEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 自动化创建接口a
//
// Summary: 自动化创建接口a
func (client *Client) ApiaAciCreateEx(request *ApiaAciCreateRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ApiaAciCreateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ApiaAciCreateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.demosdk.aci.create.apia"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 自动化测试创建test，请勿修改、删除
//
// Summary: 自动化测试创建test，请勿修改、删除
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

// Description:
//
// Description: 自动化测试创建test，请勿修改、删除
//
// Summary: 自动化测试创建test，请勿修改、删除
func (client *Client) BindAaaBbbCccEx(request *BindAaaBbbCccRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *BindAaaBbbCccResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &BindAaaBbbCccResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.demosdk.aaa.bbb.ccc.bind"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 自动化测试创建test，请勿修改、删除
//
// Summary: 自动化测试创建test，请勿修改、删除
func (client *Client) QueryAaaCcd(request *QueryAaaCcdRequest) (_result *QueryAaaCcdResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAaaCcdResponse{}
	_body, _err := client.QueryAaaCcdEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 自动化测试创建test，请勿修改、删除
//
// Summary: 自动化测试创建test，请勿修改、删除
func (client *Client) QueryAaaCcdEx(request *QueryAaaCcdRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAaaCcdResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAaaCcdResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.demosdk.aaa.ccd.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 自动化测试创建test，请勿修改、删除
//
// Summary: 自动化测试创建test，请勿修改、删除
func (client *Client) BindXxx(request *BindXxxRequest) (_result *BindXxxResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &BindXxxResponse{}
	_body, _err := client.BindXxxEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 自动化测试创建test，请勿修改、删除
//
// Summary: 自动化测试创建test，请勿修改、删除
func (client *Client) BindXxxEx(request *BindXxxRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *BindXxxResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &BindXxxResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.demosdk.xxx.bind"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 测试api流程
//
// Summary: 测试api流程
func (client *Client) QueryTxt(request *QueryTxtRequest) (_result *QueryTxtResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryTxtResponse{}
	_body, _err := client.QueryTxtEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 测试api流程
//
// Summary: 测试api流程
func (client *Client) QueryTxtEx(request *QueryTxtRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryTxtResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryTxtResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.demosdk.txt.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: desc
//
// Summary: desc
func (client *Client) ListTxt(request *ListTxtRequest) (_result *ListTxtResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListTxtResponse{}
	_body, _err := client.ListTxtEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: desc
//
// Summary: desc
func (client *Client) ListTxtEx(request *ListTxtRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListTxtResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListTxtResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.demosdk.txt.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 用于个人工作台二期测试使用测试test
//
// Summary: 用于个人工作台二期测试使用测试test
func (client *Client) QueryWorkbenchTest(request *QueryWorkbenchTestRequest) (_result *QueryWorkbenchTestResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryWorkbenchTestResponse{}
	_body, _err := client.QueryWorkbenchTestEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 用于个人工作台二期测试使用测试test
//
// Summary: 用于个人工作台二期测试使用测试test
func (client *Client) QueryWorkbenchTestEx(request *QueryWorkbenchTestRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryWorkbenchTestResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryWorkbenchTestResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.demosdk.workbench.test.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 个人工作台二期测试接口
//
// Summary: 个人工作台二期测试接口
func (client *Client) ImportAbcdOne(request *ImportAbcdOneRequest) (_result *ImportAbcdOneResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ImportAbcdOneResponse{}
	_body, _err := client.ImportAbcdOneEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 个人工作台二期测试接口
//
// Summary: 个人工作台二期测试接口
func (client *Client) ImportAbcdOneEx(request *ImportAbcdOneRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ImportAbcdOneResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ImportAbcdOneResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.demosdk.abcd.one.import"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 个人工作台测试使用
//
// Summary: 个人工作台测试使用
func (client *Client) PublishWorkbenchOne(request *PublishWorkbenchOneRequest) (_result *PublishWorkbenchOneResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PublishWorkbenchOneResponse{}
	_body, _err := client.PublishWorkbenchOneEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 个人工作台测试使用
//
// Summary: 个人工作台测试使用
func (client *Client) PublishWorkbenchOneEx(request *PublishWorkbenchOneRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PublishWorkbenchOneResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PublishWorkbenchOneResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.demosdk.workbench.one.publish"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 个人工作台测试
//
// Summary: 个人工作台测试
func (client *Client) PublishWorkbenchTwo(request *PublishWorkbenchTwoRequest) (_result *PublishWorkbenchTwoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PublishWorkbenchTwoResponse{}
	_body, _err := client.PublishWorkbenchTwoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 个人工作台测试
//
// Summary: 个人工作台测试
func (client *Client) PublishWorkbenchTwoEx(request *PublishWorkbenchTwoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PublishWorkbenchTwoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PublishWorkbenchTwoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.demosdk.workbench.two.publish"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 个人工作台二期预发测试1
//
// Summary: 个人工作台二期预发测试1
func (client *Client) PublishTwiceOne(request *PublishTwiceOneRequest) (_result *PublishTwiceOneResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PublishTwiceOneResponse{}
	_body, _err := client.PublishTwiceOneEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 个人工作台二期预发测试1
//
// Summary: 个人工作台二期预发测试1
func (client *Client) PublishTwiceOneEx(request *PublishTwiceOneRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PublishTwiceOneResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PublishTwiceOneResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.demosdk.twice.one.publish"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 个人工作台二期预发测试
//
// Summary: 个人工作台二期预发测试
func (client *Client) ImportTwiceThree(request *ImportTwiceThreeRequest) (_result *ImportTwiceThreeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ImportTwiceThreeResponse{}
	_body, _err := client.ImportTwiceThreeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 个人工作台二期预发测试
//
// Summary: 个人工作台二期预发测试
func (client *Client) ImportTwiceThreeEx(request *ImportTwiceThreeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ImportTwiceThreeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ImportTwiceThreeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.demosdk.twice.three.import"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 个人工作台测试使用
//
// Summary: 个人工作台测试使用
func (client *Client) PublishWorkbenchThree(request *PublishWorkbenchThreeRequest) (_result *PublishWorkbenchThreeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PublishWorkbenchThreeResponse{}
	_body, _err := client.PublishWorkbenchThreeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 个人工作台测试使用
//
// Summary: 个人工作台测试使用
func (client *Client) PublishWorkbenchThreeEx(request *PublishWorkbenchThreeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PublishWorkbenchThreeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PublishWorkbenchThreeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.demosdk.workbench.three.publish"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 个人工作台测试使用
//
// Summary: 个人工作台测试使用
func (client *Client) PublishWorkbenchFour(request *PublishWorkbenchFourRequest) (_result *PublishWorkbenchFourResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PublishWorkbenchFourResponse{}
	_body, _err := client.PublishWorkbenchFourEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 个人工作台测试使用
//
// Summary: 个人工作台测试使用
func (client *Client) PublishWorkbenchFourEx(request *PublishWorkbenchFourRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PublishWorkbenchFourResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PublishWorkbenchFourResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.demosdk.workbench.four.publish"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: AAAA
//
// Summary: AAAA
func (client *Client) QueryAaaQqq(request *QueryAaaQqqRequest) (_result *QueryAaaQqqResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAaaQqqResponse{}
	_body, _err := client.QueryAaaQqqEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: AAAA
//
// Summary: AAAA
func (client *Client) QueryAaaQqqEx(request *QueryAaaQqqRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAaaQqqResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAaaQqqResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.demosdk.aaa.qqq.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: a
//
// Summary: a
func (client *Client) CAB(request *CABRequest) (_result *CABResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CABResponse{}
	_body, _err := client.CABEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: a
//
// Summary: a
func (client *Client) CABEx(request *CABRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CABResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CABResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.demosdk.a.b.c"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 测试
//
// Summary: 测试
func (client *Client) AAA(request *AAARequest) (_result *AAAResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AAAResponse{}
	_body, _err := client.AAAEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 测试
//
// Summary: 测试
func (client *Client) AAAEx(request *AAARequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AAAResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AAAResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.demosdk.a.a.a"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 自动化测试使用
//
// Summary: 自动化测试使用
func (client *Client) ApiAutotestCreate(request *ApiAutotestCreateRequest) (_result *ApiAutotestCreateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ApiAutotestCreateResponse{}
	_body, _err := client.ApiAutotestCreateEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 自动化测试使用
//
// Summary: 自动化测试使用
func (client *Client) ApiAutotestCreateEx(request *ApiAutotestCreateRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ApiAutotestCreateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ApiAutotestCreateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.demosdk.autotest.create.api"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 这是编辑后的描述
//
// Summary: 这是编辑后的描述
func (client *Client) ZhongyipretestbZhongyipretestbZhongyipretestb(request *ZhongyipretestbZhongyipretestbZhongyipretestbRequest) (_result *ZhongyipretestbZhongyipretestbZhongyipretestbResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ZhongyipretestbZhongyipretestbZhongyipretestbResponse{}
	_body, _err := client.ZhongyipretestbZhongyipretestbZhongyipretestbEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 这是编辑后的描述
//
// Summary: 这是编辑后的描述
func (client *Client) ZhongyipretestbZhongyipretestbZhongyipretestbEx(request *ZhongyipretestbZhongyipretestbZhongyipretestbRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ZhongyipretestbZhongyipretestbZhongyipretestbResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ZhongyipretestbZhongyipretestbZhongyipretestbResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.demosdk.zhongyipretestb.zhongyipretestb.zhongyipretestb"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
