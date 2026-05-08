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

// 子结构体
type SubDemoStruct struct {
	// name
	// example:
	//
	// name
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// value
	// example:
	//
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
	// example:
	//
	// str
	SomeString *string `json:"some_string,omitempty" xml:"some_string,omitempty" maxLength:"100" minLength:"10"`
	// Long型属性
	// example:
	//
	// 100
	SomeNumber *int64 `json:"some_number,omitempty" xml:"some_number,omitempty" require:"true" maximum:"100" minimum:"1"`
	// 布尔型
	// example:
	//
	// true, false
	SomeBoolean *bool `json:"some_boolean,omitempty" xml:"some_boolean,omitempty" require:"true"`
	// ISO8601格式字符串：yyyy-MM-dd_T_HH:mm:ss_Z_
	// example:
	//
	// 2018-10-10T10:10:00Z
	SomeDate *string `json:"some_date,omitempty" xml:"some_date,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 字符串数组
	// example:
	//
	// somestring
	SomeStringList []*string `json:"some_string_list,omitempty" xml:"some_string_list,omitempty" type:"Repeated"`
	// 子结构体
	// example:
	//
	// { "name": "value" }
	SomeStruct *SubDemoStruct `json:"some_struct,omitempty" xml:"some_struct,omitempty" require:"true"`
	// 结构体数组
	// example:
	//
	// [{"name": "value"}]
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
	// example:
	//
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
	// example:
	//
	// 123
	Content *string `json:"content,omitempty" xml:"content,omitempty"`
	// 123
	// example:
	//
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
	// example:
	//
	// {"name":"value"}
	Code *AbcDemoStruct `json:"code,omitempty" xml:"code,omitempty" require:"true"`
	// 返回结果
	// example:
	//
	// {"name":{"key":"value"}}
	Data *AbcDemoStruct `json:"data,omitempty" xml:"data,omitempty" require:"true"`
	// 返回信息
	// example:
	//
	// {"message":"success"}
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
	// example:
	//
	// 张三
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 年龄
	// example:
	//
	// 18
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
	// example:
	//
	// 2024-11-03 14:00
	Time *string `json:"time,omitempty" xml:"time,omitempty" require:"true"`
	// 操作人
	// example:
	//
	// 姜泽琦
	Operator *string `json:"operator,omitempty" xml:"operator,omitempty" require:"true"`
	// 请求编号
	// example:
	//
	// 1
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
	// example:
	//
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
	// example:
	//
	// 2018-10-10T10:10:00Z
	Time *string `json:"time,omitempty" xml:"time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 请求人
	// example:
	//
	// 张三
	Operate *string `json:"operate,omitempty" xml:"operate,omitempty" require:"true"`
	// 编号
	// example:
	//
	// 1
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
	// example:
	//
	// 2022-11-07 14:48
	Time *string `json:"time,omitempty" xml:"time,omitempty" require:"true"`
	// 请求人
	// example:
	//
	// 张三
	Operator *string `json:"operator,omitempty" xml:"operator,omitempty" require:"true"`
	// 请求编号
	// example:
	//
	// 1
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

// dev测试
type DevTest struct {
	// 超时时间
	// example:
	//
	// 200
	Timeout *string `json:"timeout,omitempty" xml:"timeout,omitempty" require:"true"`
}

func (s DevTest) String() string {
	return tea.Prettify(s)
}

func (s DevTest) GoString() string {
	return s.String()
}

func (s *DevTest) SetTimeout(v string) *DevTest {
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

// 返回结果测试类
type ResultTest struct {
	// 姓名
	// example:
	//
	// 张三
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// test
	// example:
	//
	// undefined
	List *DemoClass `json:"list,omitempty" xml:"list,omitempty" require:"true"`
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

func (s *ResultTest) SetList(v *DemoClass) *ResultTest {
	s.List = v
	return s
}

// 返回结果测试类
type ResultTests struct {
	// 姓名
	// example:
	//
	// 张三
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 年龄
	// example:
	//
	// 18
	Age *string `json:"age,omitempty" xml:"age,omitempty" require:"true"`
}

func (s ResultTests) String() string {
	return tea.Prettify(s)
}

func (s ResultTests) GoString() string {
	return s.String()
}

func (s *ResultTests) SetName(v string) *ResultTests {
	s.Name = &v
	return s
}

func (s *ResultTests) SetAge(v string) *ResultTests {
	s.Age = &v
	return s
}

// test
type DemoTestHf struct {
	// test
	// example:
	//
	// undefined
	Info *ResultTest `json:"info,omitempty" xml:"info,omitempty" require:"true"`
}

func (s DemoTestHf) String() string {
	return tea.Prettify(s)
}

func (s DemoTestHf) GoString() string {
	return s.String()
}

func (s *DemoTestHf) SetInfo(v *ResultTest) *DemoTestHf {
	s.Info = v
	return s
}

// 测试实体
type SumBean struct {
	// 元素名称
	// example:
	//
	// 张三
	EName *string `json:"e_name,omitempty" xml:"e_name,omitempty"`
	// 数量
	// example:
	//
	// 23
	Num *int64 `json:"num,omitempty" xml:"num,omitempty"`
	// test
	// example:
	//
	// undefined
	Info *ResultTests `json:"info,omitempty" xml:"info,omitempty" require:"true"`
}

func (s SumBean) String() string {
	return tea.Prettify(s)
}

func (s SumBean) GoString() string {
	return s.String()
}

func (s *SumBean) SetEName(v string) *SumBean {
	s.EName = &v
	return s
}

func (s *SumBean) SetNum(v int64) *SumBean {
	s.Num = &v
	return s
}

func (s *SumBean) SetInfo(v *ResultTests) *SumBean {
	s.Info = v
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

type QueryAntchainAbcTimeFiveRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 下游超时时间
	Timeout *string `json:"timeout,omitempty" xml:"timeout,omitempty"`
}

func (s QueryAntchainAbcTimeFiveRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAntchainAbcTimeFiveRequest) GoString() string {
	return s.String()
}

func (s *QueryAntchainAbcTimeFiveRequest) SetAuthToken(v string) *QueryAntchainAbcTimeFiveRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAntchainAbcTimeFiveRequest) SetProductInstanceId(v string) *QueryAntchainAbcTimeFiveRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAntchainAbcTimeFiveRequest) SetTimeout(v string) *QueryAntchainAbcTimeFiveRequest {
	s.Timeout = &v
	return s
}

type QueryAntchainAbcTimeFiveResponse struct {
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

func (s QueryAntchainAbcTimeFiveResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAntchainAbcTimeFiveResponse) GoString() string {
	return s.String()
}

func (s *QueryAntchainAbcTimeFiveResponse) SetReqMsgId(v string) *QueryAntchainAbcTimeFiveResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAntchainAbcTimeFiveResponse) SetResultCode(v string) *QueryAntchainAbcTimeFiveResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAntchainAbcTimeFiveResponse) SetResultMsg(v string) *QueryAntchainAbcTimeFiveResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAntchainAbcTimeFiveResponse) SetStauts(v string) *QueryAntchainAbcTimeFiveResponse {
	s.Stauts = &v
	return s
}

func (s *QueryAntchainAbcTimeFiveResponse) SetMsg(v string) *QueryAntchainAbcTimeFiveResponse {
	s.Msg = &v
	return s
}

type QueryAntchainAbcApprovalTestRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 入参
	Input *string `json:"input,omitempty" xml:"input,omitempty" require:"true"`
	// 新增字段
	Delete *string `json:"delete,omitempty" xml:"delete,omitempty" require:"true"`
}

func (s QueryAntchainAbcApprovalTestRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAntchainAbcApprovalTestRequest) GoString() string {
	return s.String()
}

func (s *QueryAntchainAbcApprovalTestRequest) SetAuthToken(v string) *QueryAntchainAbcApprovalTestRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAntchainAbcApprovalTestRequest) SetProductInstanceId(v string) *QueryAntchainAbcApprovalTestRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAntchainAbcApprovalTestRequest) SetInput(v string) *QueryAntchainAbcApprovalTestRequest {
	s.Input = &v
	return s
}

func (s *QueryAntchainAbcApprovalTestRequest) SetDelete(v string) *QueryAntchainAbcApprovalTestRequest {
	s.Delete = &v
	return s
}

type QueryAntchainAbcApprovalTestResponse struct {
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

func (s QueryAntchainAbcApprovalTestResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAntchainAbcApprovalTestResponse) GoString() string {
	return s.String()
}

func (s *QueryAntchainAbcApprovalTestResponse) SetReqMsgId(v string) *QueryAntchainAbcApprovalTestResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAntchainAbcApprovalTestResponse) SetResultCode(v string) *QueryAntchainAbcApprovalTestResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAntchainAbcApprovalTestResponse) SetResultMsg(v string) *QueryAntchainAbcApprovalTestResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAntchainAbcApprovalTestResponse) SetMsg(v string) *QueryAntchainAbcApprovalTestResponse {
	s.Msg = &v
	return s
}

func (s *QueryAntchainAbcApprovalTestResponse) SetCode(v int64) *QueryAntchainAbcApprovalTestResponse {
	s.Code = &v
	return s
}

type ApiAntchainAbcTestCreateRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 1
	Timeout *string `json:"timeout,omitempty" xml:"timeout,omitempty" require:"true"`
}

func (s ApiAntchainAbcTestCreateRequest) String() string {
	return tea.Prettify(s)
}

func (s ApiAntchainAbcTestCreateRequest) GoString() string {
	return s.String()
}

func (s *ApiAntchainAbcTestCreateRequest) SetAuthToken(v string) *ApiAntchainAbcTestCreateRequest {
	s.AuthToken = &v
	return s
}

func (s *ApiAntchainAbcTestCreateRequest) SetProductInstanceId(v string) *ApiAntchainAbcTestCreateRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ApiAntchainAbcTestCreateRequest) SetTimeout(v string) *ApiAntchainAbcTestCreateRequest {
	s.Timeout = &v
	return s
}

type ApiAntchainAbcTestCreateResponse struct {
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

func (s ApiAntchainAbcTestCreateResponse) String() string {
	return tea.Prettify(s)
}

func (s ApiAntchainAbcTestCreateResponse) GoString() string {
	return s.String()
}

func (s *ApiAntchainAbcTestCreateResponse) SetReqMsgId(v string) *ApiAntchainAbcTestCreateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ApiAntchainAbcTestCreateResponse) SetResultCode(v string) *ApiAntchainAbcTestCreateResponse {
	s.ResultCode = &v
	return s
}

func (s *ApiAntchainAbcTestCreateResponse) SetResultMsg(v string) *ApiAntchainAbcTestCreateResponse {
	s.ResultMsg = &v
	return s
}

func (s *ApiAntchainAbcTestCreateResponse) SetStatus(v string) *ApiAntchainAbcTestCreateResponse {
	s.Status = &v
	return s
}

func (s *ApiAntchainAbcTestCreateResponse) SetMsg(v string) *ApiAntchainAbcTestCreateResponse {
	s.Msg = &v
	return s
}

type QueryAntchainAbcOneLimitRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 超时时间
	Timeout *string `json:"timeout,omitempty" xml:"timeout,omitempty" require:"true"`
}

func (s QueryAntchainAbcOneLimitRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAntchainAbcOneLimitRequest) GoString() string {
	return s.String()
}

func (s *QueryAntchainAbcOneLimitRequest) SetAuthToken(v string) *QueryAntchainAbcOneLimitRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAntchainAbcOneLimitRequest) SetProductInstanceId(v string) *QueryAntchainAbcOneLimitRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAntchainAbcOneLimitRequest) SetTimeout(v string) *QueryAntchainAbcOneLimitRequest {
	s.Timeout = &v
	return s
}

type QueryAntchainAbcOneLimitResponse struct {
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

func (s QueryAntchainAbcOneLimitResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAntchainAbcOneLimitResponse) GoString() string {
	return s.String()
}

func (s *QueryAntchainAbcOneLimitResponse) SetReqMsgId(v string) *QueryAntchainAbcOneLimitResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAntchainAbcOneLimitResponse) SetResultCode(v string) *QueryAntchainAbcOneLimitResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAntchainAbcOneLimitResponse) SetResultMsg(v string) *QueryAntchainAbcOneLimitResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAntchainAbcOneLimitResponse) SetStauts(v string) *QueryAntchainAbcOneLimitResponse {
	s.Stauts = &v
	return s
}

func (s *QueryAntchainAbcOneLimitResponse) SetMsg(v string) *QueryAntchainAbcOneLimitResponse {
	s.Msg = &v
	return s
}

type UnstabilizeAntchainAbcOneLimitRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 超时时间
	Timeout *string `json:"timeout,omitempty" xml:"timeout,omitempty" require:"true"`
}

func (s UnstabilizeAntchainAbcOneLimitRequest) String() string {
	return tea.Prettify(s)
}

func (s UnstabilizeAntchainAbcOneLimitRequest) GoString() string {
	return s.String()
}

func (s *UnstabilizeAntchainAbcOneLimitRequest) SetAuthToken(v string) *UnstabilizeAntchainAbcOneLimitRequest {
	s.AuthToken = &v
	return s
}

func (s *UnstabilizeAntchainAbcOneLimitRequest) SetProductInstanceId(v string) *UnstabilizeAntchainAbcOneLimitRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UnstabilizeAntchainAbcOneLimitRequest) SetTimeout(v string) *UnstabilizeAntchainAbcOneLimitRequest {
	s.Timeout = &v
	return s
}

type UnstabilizeAntchainAbcOneLimitResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 结果码描述
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
	// 状态码
	Stauts *string `json:"stauts,omitempty" xml:"stauts,omitempty"`
}

func (s UnstabilizeAntchainAbcOneLimitResponse) String() string {
	return tea.Prettify(s)
}

func (s UnstabilizeAntchainAbcOneLimitResponse) GoString() string {
	return s.String()
}

func (s *UnstabilizeAntchainAbcOneLimitResponse) SetReqMsgId(v string) *UnstabilizeAntchainAbcOneLimitResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UnstabilizeAntchainAbcOneLimitResponse) SetResultCode(v string) *UnstabilizeAntchainAbcOneLimitResponse {
	s.ResultCode = &v
	return s
}

func (s *UnstabilizeAntchainAbcOneLimitResponse) SetResultMsg(v string) *UnstabilizeAntchainAbcOneLimitResponse {
	s.ResultMsg = &v
	return s
}

func (s *UnstabilizeAntchainAbcOneLimitResponse) SetMsg(v string) *UnstabilizeAntchainAbcOneLimitResponse {
	s.Msg = &v
	return s
}

func (s *UnstabilizeAntchainAbcOneLimitResponse) SetStauts(v string) *UnstabilizeAntchainAbcOneLimitResponse {
	s.Stauts = &v
	return s
}

type QueryAntchainDemosdkBbbEeeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 姓名
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
}

func (s QueryAntchainDemosdkBbbEeeRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAntchainDemosdkBbbEeeRequest) GoString() string {
	return s.String()
}

func (s *QueryAntchainDemosdkBbbEeeRequest) SetAuthToken(v string) *QueryAntchainDemosdkBbbEeeRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAntchainDemosdkBbbEeeRequest) SetProductInstanceId(v string) *QueryAntchainDemosdkBbbEeeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAntchainDemosdkBbbEeeRequest) SetName(v string) *QueryAntchainDemosdkBbbEeeRequest {
	s.Name = &v
	return s
}

type QueryAntchainDemosdkBbbEeeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s QueryAntchainDemosdkBbbEeeResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAntchainDemosdkBbbEeeResponse) GoString() string {
	return s.String()
}

func (s *QueryAntchainDemosdkBbbEeeResponse) SetReqMsgId(v string) *QueryAntchainDemosdkBbbEeeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAntchainDemosdkBbbEeeResponse) SetResultCode(v string) *QueryAntchainDemosdkBbbEeeResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAntchainDemosdkBbbEeeResponse) SetResultMsg(v string) *QueryAntchainDemosdkBbbEeeResponse {
	s.ResultMsg = &v
	return s
}

type QueryAntchainDemosdkAaaTestRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s QueryAntchainDemosdkAaaTestRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAntchainDemosdkAaaTestRequest) GoString() string {
	return s.String()
}

func (s *QueryAntchainDemosdkAaaTestRequest) SetAuthToken(v string) *QueryAntchainDemosdkAaaTestRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAntchainDemosdkAaaTestRequest) SetProductInstanceId(v string) *QueryAntchainDemosdkAaaTestRequest {
	s.ProductInstanceId = &v
	return s
}

type QueryAntchainDemosdkAaaTestResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s QueryAntchainDemosdkAaaTestResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAntchainDemosdkAaaTestResponse) GoString() string {
	return s.String()
}

func (s *QueryAntchainDemosdkAaaTestResponse) SetReqMsgId(v string) *QueryAntchainDemosdkAaaTestResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAntchainDemosdkAaaTestResponse) SetResultCode(v string) *QueryAntchainDemosdkAaaTestResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAntchainDemosdkAaaTestResponse) SetResultMsg(v string) *QueryAntchainDemosdkAaaTestResponse {
	s.ResultMsg = &v
	return s
}

type StabilizeAntchainDemosdkBbbCccRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 测试
	Test *string `json:"test,omitempty" xml:"test,omitempty"`
}

func (s StabilizeAntchainDemosdkBbbCccRequest) String() string {
	return tea.Prettify(s)
}

func (s StabilizeAntchainDemosdkBbbCccRequest) GoString() string {
	return s.String()
}

func (s *StabilizeAntchainDemosdkBbbCccRequest) SetAuthToken(v string) *StabilizeAntchainDemosdkBbbCccRequest {
	s.AuthToken = &v
	return s
}

func (s *StabilizeAntchainDemosdkBbbCccRequest) SetProductInstanceId(v string) *StabilizeAntchainDemosdkBbbCccRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *StabilizeAntchainDemosdkBbbCccRequest) SetTest(v string) *StabilizeAntchainDemosdkBbbCccRequest {
	s.Test = &v
	return s
}

type StabilizeAntchainDemosdkBbbCccResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s StabilizeAntchainDemosdkBbbCccResponse) String() string {
	return tea.Prettify(s)
}

func (s StabilizeAntchainDemosdkBbbCccResponse) GoString() string {
	return s.String()
}

func (s *StabilizeAntchainDemosdkBbbCccResponse) SetReqMsgId(v string) *StabilizeAntchainDemosdkBbbCccResponse {
	s.ReqMsgId = &v
	return s
}

func (s *StabilizeAntchainDemosdkBbbCccResponse) SetResultCode(v string) *StabilizeAntchainDemosdkBbbCccResponse {
	s.ResultCode = &v
	return s
}

func (s *StabilizeAntchainDemosdkBbbCccResponse) SetResultMsg(v string) *StabilizeAntchainDemosdkBbbCccResponse {
	s.ResultMsg = &v
	return s
}

type QueryAntchainDemosdkMultiCccRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
}

func (s QueryAntchainDemosdkMultiCccRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAntchainDemosdkMultiCccRequest) GoString() string {
	return s.String()
}

func (s *QueryAntchainDemosdkMultiCccRequest) SetAuthToken(v string) *QueryAntchainDemosdkMultiCccRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAntchainDemosdkMultiCccRequest) SetProductInstanceId(v string) *QueryAntchainDemosdkMultiCccRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAntchainDemosdkMultiCccRequest) SetName(v string) *QueryAntchainDemosdkMultiCccRequest {
	s.Name = &v
	return s
}

type QueryAntchainDemosdkMultiCccResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 测试
	Body []*string `json:"body,omitempty" xml:"body,omitempty" type:"Repeated"`
}

func (s QueryAntchainDemosdkMultiCccResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAntchainDemosdkMultiCccResponse) GoString() string {
	return s.String()
}

func (s *QueryAntchainDemosdkMultiCccResponse) SetReqMsgId(v string) *QueryAntchainDemosdkMultiCccResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAntchainDemosdkMultiCccResponse) SetResultCode(v string) *QueryAntchainDemosdkMultiCccResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAntchainDemosdkMultiCccResponse) SetResultMsg(v string) *QueryAntchainDemosdkMultiCccResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAntchainDemosdkMultiCccResponse) SetBody(v []*string) *QueryAntchainDemosdkMultiCccResponse {
	s.Body = v
	return s
}

type QueryAntchainDemosdkAaaCciRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 姓名
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
}

func (s QueryAntchainDemosdkAaaCciRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAntchainDemosdkAaaCciRequest) GoString() string {
	return s.String()
}

func (s *QueryAntchainDemosdkAaaCciRequest) SetAuthToken(v string) *QueryAntchainDemosdkAaaCciRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAntchainDemosdkAaaCciRequest) SetProductInstanceId(v string) *QueryAntchainDemosdkAaaCciRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAntchainDemosdkAaaCciRequest) SetName(v string) *QueryAntchainDemosdkAaaCciRequest {
	s.Name = &v
	return s
}

type QueryAntchainDemosdkAaaCciResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 测试
	Test *string `json:"test,omitempty" xml:"test,omitempty"`
	// 1
	Num *string `json:"num,omitempty" xml:"num,omitempty"`
}

func (s QueryAntchainDemosdkAaaCciResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAntchainDemosdkAaaCciResponse) GoString() string {
	return s.String()
}

func (s *QueryAntchainDemosdkAaaCciResponse) SetReqMsgId(v string) *QueryAntchainDemosdkAaaCciResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAntchainDemosdkAaaCciResponse) SetResultCode(v string) *QueryAntchainDemosdkAaaCciResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAntchainDemosdkAaaCciResponse) SetResultMsg(v string) *QueryAntchainDemosdkAaaCciResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAntchainDemosdkAaaCciResponse) SetTest(v string) *QueryAntchainDemosdkAaaCciResponse {
	s.Test = &v
	return s
}

func (s *QueryAntchainDemosdkAaaCciResponse) SetNum(v string) *QueryAntchainDemosdkAaaCciResponse {
	s.Num = &v
	return s
}

type ResetAntchainDemosdkBbbCccRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s ResetAntchainDemosdkBbbCccRequest) String() string {
	return tea.Prettify(s)
}

func (s ResetAntchainDemosdkBbbCccRequest) GoString() string {
	return s.String()
}

func (s *ResetAntchainDemosdkBbbCccRequest) SetAuthToken(v string) *ResetAntchainDemosdkBbbCccRequest {
	s.AuthToken = &v
	return s
}

func (s *ResetAntchainDemosdkBbbCccRequest) SetProductInstanceId(v string) *ResetAntchainDemosdkBbbCccRequest {
	s.ProductInstanceId = &v
	return s
}

type ResetAntchainDemosdkBbbCccResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s ResetAntchainDemosdkBbbCccResponse) String() string {
	return tea.Prettify(s)
}

func (s ResetAntchainDemosdkBbbCccResponse) GoString() string {
	return s.String()
}

func (s *ResetAntchainDemosdkBbbCccResponse) SetReqMsgId(v string) *ResetAntchainDemosdkBbbCccResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ResetAntchainDemosdkBbbCccResponse) SetResultCode(v string) *ResetAntchainDemosdkBbbCccResponse {
	s.ResultCode = &v
	return s
}

func (s *ResetAntchainDemosdkBbbCccResponse) SetResultMsg(v string) *ResetAntchainDemosdkBbbCccResponse {
	s.ResultMsg = &v
	return s
}

type BindAntchainDemosdkXxxRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 123
	Date *string `json:"date,omitempty" xml:"date,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 123
	Data *string `json:"data,omitempty" xml:"data,omitempty" require:"true"`
}

func (s BindAntchainDemosdkXxxRequest) String() string {
	return tea.Prettify(s)
}

func (s BindAntchainDemosdkXxxRequest) GoString() string {
	return s.String()
}

func (s *BindAntchainDemosdkXxxRequest) SetAuthToken(v string) *BindAntchainDemosdkXxxRequest {
	s.AuthToken = &v
	return s
}

func (s *BindAntchainDemosdkXxxRequest) SetProductInstanceId(v string) *BindAntchainDemosdkXxxRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *BindAntchainDemosdkXxxRequest) SetDate(v string) *BindAntchainDemosdkXxxRequest {
	s.Date = &v
	return s
}

func (s *BindAntchainDemosdkXxxRequest) SetData(v string) *BindAntchainDemosdkXxxRequest {
	s.Data = &v
	return s
}

type BindAntchainDemosdkXxxResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s BindAntchainDemosdkXxxResponse) String() string {
	return tea.Prettify(s)
}

func (s BindAntchainDemosdkXxxResponse) GoString() string {
	return s.String()
}

func (s *BindAntchainDemosdkXxxResponse) SetReqMsgId(v string) *BindAntchainDemosdkXxxResponse {
	s.ReqMsgId = &v
	return s
}

func (s *BindAntchainDemosdkXxxResponse) SetResultCode(v string) *BindAntchainDemosdkXxxResponse {
	s.ResultCode = &v
	return s
}

func (s *BindAntchainDemosdkXxxResponse) SetResultMsg(v string) *BindAntchainDemosdkXxxResponse {
	s.ResultMsg = &v
	return s
}

type QueryAntchainDemosdkCcXxRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// aa
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 测试
	Msg *ResultTest `json:"msg,omitempty" xml:"msg,omitempty" require:"true"`
}

func (s QueryAntchainDemosdkCcXxRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAntchainDemosdkCcXxRequest) GoString() string {
	return s.String()
}

func (s *QueryAntchainDemosdkCcXxRequest) SetAuthToken(v string) *QueryAntchainDemosdkCcXxRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAntchainDemosdkCcXxRequest) SetProductInstanceId(v string) *QueryAntchainDemosdkCcXxRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAntchainDemosdkCcXxRequest) SetName(v string) *QueryAntchainDemosdkCcXxRequest {
	s.Name = &v
	return s
}

func (s *QueryAntchainDemosdkCcXxRequest) SetMsg(v *ResultTest) *QueryAntchainDemosdkCcXxRequest {
	s.Msg = v
	return s
}

type QueryAntchainDemosdkCcXxResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 1213
	Test *string `json:"test,omitempty" xml:"test,omitempty"`
}

func (s QueryAntchainDemosdkCcXxResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAntchainDemosdkCcXxResponse) GoString() string {
	return s.String()
}

func (s *QueryAntchainDemosdkCcXxResponse) SetReqMsgId(v string) *QueryAntchainDemosdkCcXxResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAntchainDemosdkCcXxResponse) SetResultCode(v string) *QueryAntchainDemosdkCcXxResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAntchainDemosdkCcXxResponse) SetResultMsg(v string) *QueryAntchainDemosdkCcXxResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAntchainDemosdkCcXxResponse) SetTest(v string) *QueryAntchainDemosdkCcXxResponse {
	s.Test = &v
	return s
}

type ResetAntchainDemosdkAbcdLimitRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 超时时间
	Timeout *string `json:"timeout,omitempty" xml:"timeout,omitempty"`
	// 请求编号
	Count *string `json:"count,omitempty" xml:"count,omitempty"`
	// 请求时间
	Time *string `json:"time,omitempty" xml:"time,omitempty"`
	// 请求描述
	Desc *string `json:"desc,omitempty" xml:"desc,omitempty"`
	// 操作者
	Operator *string `json:"operator,omitempty" xml:"operator,omitempty"`
}

func (s ResetAntchainDemosdkAbcdLimitRequest) String() string {
	return tea.Prettify(s)
}

func (s ResetAntchainDemosdkAbcdLimitRequest) GoString() string {
	return s.String()
}

func (s *ResetAntchainDemosdkAbcdLimitRequest) SetAuthToken(v string) *ResetAntchainDemosdkAbcdLimitRequest {
	s.AuthToken = &v
	return s
}

func (s *ResetAntchainDemosdkAbcdLimitRequest) SetProductInstanceId(v string) *ResetAntchainDemosdkAbcdLimitRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ResetAntchainDemosdkAbcdLimitRequest) SetTimeout(v string) *ResetAntchainDemosdkAbcdLimitRequest {
	s.Timeout = &v
	return s
}

func (s *ResetAntchainDemosdkAbcdLimitRequest) SetCount(v string) *ResetAntchainDemosdkAbcdLimitRequest {
	s.Count = &v
	return s
}

func (s *ResetAntchainDemosdkAbcdLimitRequest) SetTime(v string) *ResetAntchainDemosdkAbcdLimitRequest {
	s.Time = &v
	return s
}

func (s *ResetAntchainDemosdkAbcdLimitRequest) SetDesc(v string) *ResetAntchainDemosdkAbcdLimitRequest {
	s.Desc = &v
	return s
}

func (s *ResetAntchainDemosdkAbcdLimitRequest) SetOperator(v string) *ResetAntchainDemosdkAbcdLimitRequest {
	s.Operator = &v
	return s
}

type ResetAntchainDemosdkAbcdLimitResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回结果
	Stauts *string `json:"stauts,omitempty" xml:"stauts,omitempty"`
	// 返回描述
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
}

func (s ResetAntchainDemosdkAbcdLimitResponse) String() string {
	return tea.Prettify(s)
}

func (s ResetAntchainDemosdkAbcdLimitResponse) GoString() string {
	return s.String()
}

func (s *ResetAntchainDemosdkAbcdLimitResponse) SetReqMsgId(v string) *ResetAntchainDemosdkAbcdLimitResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ResetAntchainDemosdkAbcdLimitResponse) SetResultCode(v string) *ResetAntchainDemosdkAbcdLimitResponse {
	s.ResultCode = &v
	return s
}

func (s *ResetAntchainDemosdkAbcdLimitResponse) SetResultMsg(v string) *ResetAntchainDemosdkAbcdLimitResponse {
	s.ResultMsg = &v
	return s
}

func (s *ResetAntchainDemosdkAbcdLimitResponse) SetStauts(v string) *ResetAntchainDemosdkAbcdLimitResponse {
	s.Stauts = &v
	return s
}

func (s *ResetAntchainDemosdkAbcdLimitResponse) SetMsg(v string) *ResetAntchainDemosdkAbcdLimitResponse {
	s.Msg = &v
	return s
}

type ImportAntchainDemosdkCreateOneRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 3000
	Timeout *string `json:"timeout,omitempty" xml:"timeout,omitempty" require:"true"`
}

func (s ImportAntchainDemosdkCreateOneRequest) String() string {
	return tea.Prettify(s)
}

func (s ImportAntchainDemosdkCreateOneRequest) GoString() string {
	return s.String()
}

func (s *ImportAntchainDemosdkCreateOneRequest) SetAuthToken(v string) *ImportAntchainDemosdkCreateOneRequest {
	s.AuthToken = &v
	return s
}

func (s *ImportAntchainDemosdkCreateOneRequest) SetProductInstanceId(v string) *ImportAntchainDemosdkCreateOneRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ImportAntchainDemosdkCreateOneRequest) SetTimeout(v string) *ImportAntchainDemosdkCreateOneRequest {
	s.Timeout = &v
	return s
}

type ImportAntchainDemosdkCreateOneResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 200
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// SUCCESS le
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
}

func (s ImportAntchainDemosdkCreateOneResponse) String() string {
	return tea.Prettify(s)
}

func (s ImportAntchainDemosdkCreateOneResponse) GoString() string {
	return s.String()
}

func (s *ImportAntchainDemosdkCreateOneResponse) SetReqMsgId(v string) *ImportAntchainDemosdkCreateOneResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ImportAntchainDemosdkCreateOneResponse) SetResultCode(v string) *ImportAntchainDemosdkCreateOneResponse {
	s.ResultCode = &v
	return s
}

func (s *ImportAntchainDemosdkCreateOneResponse) SetResultMsg(v string) *ImportAntchainDemosdkCreateOneResponse {
	s.ResultMsg = &v
	return s
}

func (s *ImportAntchainDemosdkCreateOneResponse) SetStatus(v string) *ImportAntchainDemosdkCreateOneResponse {
	s.Status = &v
	return s
}

func (s *ImportAntchainDemosdkCreateOneResponse) SetMsg(v string) *ImportAntchainDemosdkCreateOneResponse {
	s.Msg = &v
	return s
}

type WithdrawAntchainDemosdkTwiceOneRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 超时时间
	Timeout *string `json:"timeout,omitempty" xml:"timeout,omitempty"`
}

func (s WithdrawAntchainDemosdkTwiceOneRequest) String() string {
	return tea.Prettify(s)
}

func (s WithdrawAntchainDemosdkTwiceOneRequest) GoString() string {
	return s.String()
}

func (s *WithdrawAntchainDemosdkTwiceOneRequest) SetAuthToken(v string) *WithdrawAntchainDemosdkTwiceOneRequest {
	s.AuthToken = &v
	return s
}

func (s *WithdrawAntchainDemosdkTwiceOneRequest) SetProductInstanceId(v string) *WithdrawAntchainDemosdkTwiceOneRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *WithdrawAntchainDemosdkTwiceOneRequest) SetTimeout(v string) *WithdrawAntchainDemosdkTwiceOneRequest {
	s.Timeout = &v
	return s
}

type WithdrawAntchainDemosdkTwiceOneResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回结果码
	Stauts *string `json:"stauts,omitempty" xml:"stauts,omitempty"`
	// 返回结果描述
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
}

func (s WithdrawAntchainDemosdkTwiceOneResponse) String() string {
	return tea.Prettify(s)
}

func (s WithdrawAntchainDemosdkTwiceOneResponse) GoString() string {
	return s.String()
}

func (s *WithdrawAntchainDemosdkTwiceOneResponse) SetReqMsgId(v string) *WithdrawAntchainDemosdkTwiceOneResponse {
	s.ReqMsgId = &v
	return s
}

func (s *WithdrawAntchainDemosdkTwiceOneResponse) SetResultCode(v string) *WithdrawAntchainDemosdkTwiceOneResponse {
	s.ResultCode = &v
	return s
}

func (s *WithdrawAntchainDemosdkTwiceOneResponse) SetResultMsg(v string) *WithdrawAntchainDemosdkTwiceOneResponse {
	s.ResultMsg = &v
	return s
}

func (s *WithdrawAntchainDemosdkTwiceOneResponse) SetStauts(v string) *WithdrawAntchainDemosdkTwiceOneResponse {
	s.Stauts = &v
	return s
}

func (s *WithdrawAntchainDemosdkTwiceOneResponse) SetMsg(v string) *WithdrawAntchainDemosdkTwiceOneResponse {
	s.Msg = &v
	return s
}

type OperateAntchainDemosdkTwiceOneRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 超时时间
	Timeout *string `json:"timeout,omitempty" xml:"timeout,omitempty"`
}

func (s OperateAntchainDemosdkTwiceOneRequest) String() string {
	return tea.Prettify(s)
}

func (s OperateAntchainDemosdkTwiceOneRequest) GoString() string {
	return s.String()
}

func (s *OperateAntchainDemosdkTwiceOneRequest) SetAuthToken(v string) *OperateAntchainDemosdkTwiceOneRequest {
	s.AuthToken = &v
	return s
}

func (s *OperateAntchainDemosdkTwiceOneRequest) SetProductInstanceId(v string) *OperateAntchainDemosdkTwiceOneRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *OperateAntchainDemosdkTwiceOneRequest) SetTimeout(v string) *OperateAntchainDemosdkTwiceOneRequest {
	s.Timeout = &v
	return s
}

type OperateAntchainDemosdkTwiceOneResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 状态码
	Stauts *string `json:"stauts,omitempty" xml:"stauts,omitempty"`
	// 返回结果描述
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
}

func (s OperateAntchainDemosdkTwiceOneResponse) String() string {
	return tea.Prettify(s)
}

func (s OperateAntchainDemosdkTwiceOneResponse) GoString() string {
	return s.String()
}

func (s *OperateAntchainDemosdkTwiceOneResponse) SetReqMsgId(v string) *OperateAntchainDemosdkTwiceOneResponse {
	s.ReqMsgId = &v
	return s
}

func (s *OperateAntchainDemosdkTwiceOneResponse) SetResultCode(v string) *OperateAntchainDemosdkTwiceOneResponse {
	s.ResultCode = &v
	return s
}

func (s *OperateAntchainDemosdkTwiceOneResponse) SetResultMsg(v string) *OperateAntchainDemosdkTwiceOneResponse {
	s.ResultMsg = &v
	return s
}

func (s *OperateAntchainDemosdkTwiceOneResponse) SetStauts(v string) *OperateAntchainDemosdkTwiceOneResponse {
	s.Stauts = &v
	return s
}

func (s *OperateAntchainDemosdkTwiceOneResponse) SetMsg(v string) *OperateAntchainDemosdkTwiceOneResponse {
	s.Msg = &v
	return s
}

type QueryAntchainDemosdkTwiceThreeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 超时时间
	Timeout *string `json:"timeout,omitempty" xml:"timeout,omitempty"`
	// 11
	Aa *DemoClass `json:"aa,omitempty" xml:"aa,omitempty"`
}

func (s QueryAntchainDemosdkTwiceThreeRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAntchainDemosdkTwiceThreeRequest) GoString() string {
	return s.String()
}

func (s *QueryAntchainDemosdkTwiceThreeRequest) SetAuthToken(v string) *QueryAntchainDemosdkTwiceThreeRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAntchainDemosdkTwiceThreeRequest) SetProductInstanceId(v string) *QueryAntchainDemosdkTwiceThreeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAntchainDemosdkTwiceThreeRequest) SetTimeout(v string) *QueryAntchainDemosdkTwiceThreeRequest {
	s.Timeout = &v
	return s
}

func (s *QueryAntchainDemosdkTwiceThreeRequest) SetAa(v *DemoClass) *QueryAntchainDemosdkTwiceThreeRequest {
	s.Aa = v
	return s
}

type QueryAntchainDemosdkTwiceThreeResponse struct {
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

func (s QueryAntchainDemosdkTwiceThreeResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAntchainDemosdkTwiceThreeResponse) GoString() string {
	return s.String()
}

func (s *QueryAntchainDemosdkTwiceThreeResponse) SetReqMsgId(v string) *QueryAntchainDemosdkTwiceThreeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAntchainDemosdkTwiceThreeResponse) SetResultCode(v string) *QueryAntchainDemosdkTwiceThreeResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAntchainDemosdkTwiceThreeResponse) SetResultMsg(v string) *QueryAntchainDemosdkTwiceThreeResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAntchainDemosdkTwiceThreeResponse) SetStauts(v string) *QueryAntchainDemosdkTwiceThreeResponse {
	s.Stauts = &v
	return s
}

func (s *QueryAntchainDemosdkTwiceThreeResponse) SetMsg(v string) *QueryAntchainDemosdkTwiceThreeResponse {
	s.Msg = &v
	return s
}

type UnstabilizeAntchainDemosdkTwiceThreeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 超时时间
	Timeout *string `json:"timeout,omitempty" xml:"timeout,omitempty"`
}

func (s UnstabilizeAntchainDemosdkTwiceThreeRequest) String() string {
	return tea.Prettify(s)
}

func (s UnstabilizeAntchainDemosdkTwiceThreeRequest) GoString() string {
	return s.String()
}

func (s *UnstabilizeAntchainDemosdkTwiceThreeRequest) SetAuthToken(v string) *UnstabilizeAntchainDemosdkTwiceThreeRequest {
	s.AuthToken = &v
	return s
}

func (s *UnstabilizeAntchainDemosdkTwiceThreeRequest) SetProductInstanceId(v string) *UnstabilizeAntchainDemosdkTwiceThreeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UnstabilizeAntchainDemosdkTwiceThreeRequest) SetTimeout(v string) *UnstabilizeAntchainDemosdkTwiceThreeRequest {
	s.Timeout = &v
	return s
}

type UnstabilizeAntchainDemosdkTwiceThreeResponse struct {
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

func (s UnstabilizeAntchainDemosdkTwiceThreeResponse) String() string {
	return tea.Prettify(s)
}

func (s UnstabilizeAntchainDemosdkTwiceThreeResponse) GoString() string {
	return s.String()
}

func (s *UnstabilizeAntchainDemosdkTwiceThreeResponse) SetReqMsgId(v string) *UnstabilizeAntchainDemosdkTwiceThreeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UnstabilizeAntchainDemosdkTwiceThreeResponse) SetResultCode(v string) *UnstabilizeAntchainDemosdkTwiceThreeResponse {
	s.ResultCode = &v
	return s
}

func (s *UnstabilizeAntchainDemosdkTwiceThreeResponse) SetResultMsg(v string) *UnstabilizeAntchainDemosdkTwiceThreeResponse {
	s.ResultMsg = &v
	return s
}

func (s *UnstabilizeAntchainDemosdkTwiceThreeResponse) SetStauts(v string) *UnstabilizeAntchainDemosdkTwiceThreeResponse {
	s.Stauts = &v
	return s
}

func (s *UnstabilizeAntchainDemosdkTwiceThreeResponse) SetMsg(v string) *UnstabilizeAntchainDemosdkTwiceThreeResponse {
	s.Msg = &v
	return s
}

type QueryAntchainDemosdkTesxRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 12
	Test *DemoClass `json:"test,omitempty" xml:"test,omitempty"`
	// 12
	TestNew *TestDemo `json:"test_new,omitempty" xml:"test_new,omitempty"`
}

func (s QueryAntchainDemosdkTesxRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAntchainDemosdkTesxRequest) GoString() string {
	return s.String()
}

func (s *QueryAntchainDemosdkTesxRequest) SetAuthToken(v string) *QueryAntchainDemosdkTesxRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAntchainDemosdkTesxRequest) SetProductInstanceId(v string) *QueryAntchainDemosdkTesxRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAntchainDemosdkTesxRequest) SetName(v string) *QueryAntchainDemosdkTesxRequest {
	s.Name = &v
	return s
}

func (s *QueryAntchainDemosdkTesxRequest) SetTest(v *DemoClass) *QueryAntchainDemosdkTesxRequest {
	s.Test = v
	return s
}

func (s *QueryAntchainDemosdkTesxRequest) SetTestNew(v *TestDemo) *QueryAntchainDemosdkTesxRequest {
	s.TestNew = v
	return s
}

type QueryAntchainDemosdkTesxResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s QueryAntchainDemosdkTesxResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAntchainDemosdkTesxResponse) GoString() string {
	return s.String()
}

func (s *QueryAntchainDemosdkTesxResponse) SetReqMsgId(v string) *QueryAntchainDemosdkTesxResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAntchainDemosdkTesxResponse) SetResultCode(v string) *QueryAntchainDemosdkTesxResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAntchainDemosdkTesxResponse) SetResultMsg(v string) *QueryAntchainDemosdkTesxResponse {
	s.ResultMsg = &v
	return s
}

type TestAntchainDemosdkPreFullRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// string
	// 待上传文件
	FileObject io.Reader `json:"fileObject,omitempty" xml:"fileObject,omitempty"`
	// 待上传文件名
	FileObjectName *string `json:"fileObjectName,omitempty" xml:"fileObjectName,omitempty"`
	FileId         *string `json:"file_id,omitempty" xml:"file_id,omitempty" require:"true"`
}

func (s TestAntchainDemosdkPreFullRequest) String() string {
	return tea.Prettify(s)
}

func (s TestAntchainDemosdkPreFullRequest) GoString() string {
	return s.String()
}

func (s *TestAntchainDemosdkPreFullRequest) SetAuthToken(v string) *TestAntchainDemosdkPreFullRequest {
	s.AuthToken = &v
	return s
}

func (s *TestAntchainDemosdkPreFullRequest) SetProductInstanceId(v string) *TestAntchainDemosdkPreFullRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *TestAntchainDemosdkPreFullRequest) SetFileObject(v io.Reader) *TestAntchainDemosdkPreFullRequest {
	s.FileObject = v
	return s
}

func (s *TestAntchainDemosdkPreFullRequest) SetFileObjectName(v string) *TestAntchainDemosdkPreFullRequest {
	s.FileObjectName = &v
	return s
}

func (s *TestAntchainDemosdkPreFullRequest) SetFileId(v string) *TestAntchainDemosdkPreFullRequest {
	s.FileId = &v
	return s
}

type TestAntchainDemosdkPreFullResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s TestAntchainDemosdkPreFullResponse) String() string {
	return tea.Prettify(s)
}

func (s TestAntchainDemosdkPreFullResponse) GoString() string {
	return s.String()
}

func (s *TestAntchainDemosdkPreFullResponse) SetReqMsgId(v string) *TestAntchainDemosdkPreFullResponse {
	s.ReqMsgId = &v
	return s
}

func (s *TestAntchainDemosdkPreFullResponse) SetResultCode(v string) *TestAntchainDemosdkPreFullResponse {
	s.ResultCode = &v
	return s
}

func (s *TestAntchainDemosdkPreFullResponse) SetResultMsg(v string) *TestAntchainDemosdkPreFullResponse {
	s.ResultMsg = &v
	return s
}

type QueryAntchainDemosdkTestapiRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 测试
	ClassName *DemoClass `json:"class_name,omitempty" xml:"class_name,omitempty"`
}

func (s QueryAntchainDemosdkTestapiRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAntchainDemosdkTestapiRequest) GoString() string {
	return s.String()
}

func (s *QueryAntchainDemosdkTestapiRequest) SetAuthToken(v string) *QueryAntchainDemosdkTestapiRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAntchainDemosdkTestapiRequest) SetProductInstanceId(v string) *QueryAntchainDemosdkTestapiRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAntchainDemosdkTestapiRequest) SetName(v string) *QueryAntchainDemosdkTestapiRequest {
	s.Name = &v
	return s
}

func (s *QueryAntchainDemosdkTestapiRequest) SetClassName(v *DemoClass) *QueryAntchainDemosdkTestapiRequest {
	s.ClassName = v
	return s
}

type QueryAntchainDemosdkTestapiResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s QueryAntchainDemosdkTestapiResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAntchainDemosdkTestapiResponse) GoString() string {
	return s.String()
}

func (s *QueryAntchainDemosdkTestapiResponse) SetReqMsgId(v string) *QueryAntchainDemosdkTestapiResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAntchainDemosdkTestapiResponse) SetResultCode(v string) *QueryAntchainDemosdkTestapiResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAntchainDemosdkTestapiResponse) SetResultMsg(v string) *QueryAntchainDemosdkTestapiResponse {
	s.ResultMsg = &v
	return s
}

type QueryAntchainDemosdkTumRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 名称
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 测试bean
	TestBean *SumBean `json:"test_bean,omitempty" xml:"test_bean,omitempty"`
}

func (s QueryAntchainDemosdkTumRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAntchainDemosdkTumRequest) GoString() string {
	return s.String()
}

func (s *QueryAntchainDemosdkTumRequest) SetAuthToken(v string) *QueryAntchainDemosdkTumRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAntchainDemosdkTumRequest) SetProductInstanceId(v string) *QueryAntchainDemosdkTumRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAntchainDemosdkTumRequest) SetName(v string) *QueryAntchainDemosdkTumRequest {
	s.Name = &v
	return s
}

func (s *QueryAntchainDemosdkTumRequest) SetTestBean(v *SumBean) *QueryAntchainDemosdkTumRequest {
	s.TestBean = v
	return s
}

type QueryAntchainDemosdkTumResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 名称
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
}

func (s QueryAntchainDemosdkTumResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAntchainDemosdkTumResponse) GoString() string {
	return s.String()
}

func (s *QueryAntchainDemosdkTumResponse) SetReqMsgId(v string) *QueryAntchainDemosdkTumResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAntchainDemosdkTumResponse) SetResultCode(v string) *QueryAntchainDemosdkTumResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAntchainDemosdkTumResponse) SetResultMsg(v string) *QueryAntchainDemosdkTumResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAntchainDemosdkTumResponse) SetName(v string) *QueryAntchainDemosdkTumResponse {
	s.Name = &v
	return s
}

type ZzzAntchainDemosdkAaaBbbRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 123
	Date *string `json:"date,omitempty" xml:"date,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 123
	Data *string `json:"data,omitempty" xml:"data,omitempty" require:"true"`
}

func (s ZzzAntchainDemosdkAaaBbbRequest) String() string {
	return tea.Prettify(s)
}

func (s ZzzAntchainDemosdkAaaBbbRequest) GoString() string {
	return s.String()
}

func (s *ZzzAntchainDemosdkAaaBbbRequest) SetAuthToken(v string) *ZzzAntchainDemosdkAaaBbbRequest {
	s.AuthToken = &v
	return s
}

func (s *ZzzAntchainDemosdkAaaBbbRequest) SetProductInstanceId(v string) *ZzzAntchainDemosdkAaaBbbRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ZzzAntchainDemosdkAaaBbbRequest) SetDate(v string) *ZzzAntchainDemosdkAaaBbbRequest {
	s.Date = &v
	return s
}

func (s *ZzzAntchainDemosdkAaaBbbRequest) SetData(v string) *ZzzAntchainDemosdkAaaBbbRequest {
	s.Data = &v
	return s
}

type ZzzAntchainDemosdkAaaBbbResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 名称
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
}

func (s ZzzAntchainDemosdkAaaBbbResponse) String() string {
	return tea.Prettify(s)
}

func (s ZzzAntchainDemosdkAaaBbbResponse) GoString() string {
	return s.String()
}

func (s *ZzzAntchainDemosdkAaaBbbResponse) SetReqMsgId(v string) *ZzzAntchainDemosdkAaaBbbResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ZzzAntchainDemosdkAaaBbbResponse) SetResultCode(v string) *ZzzAntchainDemosdkAaaBbbResponse {
	s.ResultCode = &v
	return s
}

func (s *ZzzAntchainDemosdkAaaBbbResponse) SetResultMsg(v string) *ZzzAntchainDemosdkAaaBbbResponse {
	s.ResultMsg = &v
	return s
}

func (s *ZzzAntchainDemosdkAaaBbbResponse) SetName(v string) *ZzzAntchainDemosdkAaaBbbResponse {
	s.Name = &v
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
				"sdk_version":      tea.String("2.0.7"),
				"_prod_code":       tea.String("QQQ"),
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
// Description: 压测接口5
//
// Summary: 压测接口5
func (client *Client) QueryAntchainAbcTimeFive(request *QueryAntchainAbcTimeFiveRequest) (_result *QueryAntchainAbcTimeFiveResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAntchainAbcTimeFiveResponse{}
	_body, _err := client.QueryAntchainAbcTimeFiveEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 压测接口5
//
// Summary: 压测接口5
func (client *Client) QueryAntchainAbcTimeFiveEx(request *QueryAntchainAbcTimeFiveRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAntchainAbcTimeFiveResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAntchainAbcTimeFiveResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.abc.time.five.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 用于测试api评审接入SDL/修改后的评审/0323
//
// Summary: 用于测试api评审接入SDL/修改后的评审/0323
func (client *Client) QueryAntchainAbcApprovalTest(request *QueryAntchainAbcApprovalTestRequest) (_result *QueryAntchainAbcApprovalTestResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAntchainAbcApprovalTestResponse{}
	_body, _err := client.QueryAntchainAbcApprovalTestEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 用于测试api评审接入SDL/修改后的评审/0323
//
// Summary: 用于测试api评审接入SDL/修改后的评审/0323
func (client *Client) QueryAntchainAbcApprovalTestEx(request *QueryAntchainAbcApprovalTestRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAntchainAbcApprovalTestResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAntchainAbcApprovalTestResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.abc.approval.test.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 测试使用api
//
// Summary: 测试使用api
func (client *Client) ApiAntchainAbcTestCreate(request *ApiAntchainAbcTestCreateRequest) (_result *ApiAntchainAbcTestCreateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ApiAntchainAbcTestCreateResponse{}
	_body, _err := client.ApiAntchainAbcTestCreateEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 测试使用api
//
// Summary: 测试使用api
func (client *Client) ApiAntchainAbcTestCreateEx(request *ApiAntchainAbcTestCreateRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ApiAntchainAbcTestCreateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ApiAntchainAbcTestCreateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.abc.test.create.api"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 哈哈哈哈哈哈哈哈个人工作台二期预发测试qqq
//
// Summary: 哈哈哈哈哈哈哈哈个人工作台二期预发测试qqq
func (client *Client) QueryAntchainAbcOneLimit(request *QueryAntchainAbcOneLimitRequest) (_result *QueryAntchainAbcOneLimitResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAntchainAbcOneLimitResponse{}
	_body, _err := client.QueryAntchainAbcOneLimitEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 哈哈哈哈哈哈哈哈个人工作台二期预发测试qqq
//
// Summary: 哈哈哈哈哈哈哈哈个人工作台二期预发测试qqq
func (client *Client) QueryAntchainAbcOneLimitEx(request *QueryAntchainAbcOneLimitRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAntchainAbcOneLimitResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAntchainAbcOneLimitResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.abc.one.limit.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) UnstabilizeAntchainAbcOneLimit(request *UnstabilizeAntchainAbcOneLimitRequest) (_result *UnstabilizeAntchainAbcOneLimitResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UnstabilizeAntchainAbcOneLimitResponse{}
	_body, _err := client.UnstabilizeAntchainAbcOneLimitEx(request, headers, runtime)
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
func (client *Client) UnstabilizeAntchainAbcOneLimitEx(request *UnstabilizeAntchainAbcOneLimitRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UnstabilizeAntchainAbcOneLimitResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UnstabilizeAntchainAbcOneLimitResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.abc.one.limit.unstabilize"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 测试接口
//
// Summary: 测试接口
func (client *Client) QueryAntchainDemosdkBbbEee(request *QueryAntchainDemosdkBbbEeeRequest) (_result *QueryAntchainDemosdkBbbEeeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAntchainDemosdkBbbEeeResponse{}
	_body, _err := client.QueryAntchainDemosdkBbbEeeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 测试接口
//
// Summary: 测试接口
func (client *Client) QueryAntchainDemosdkBbbEeeEx(request *QueryAntchainDemosdkBbbEeeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAntchainDemosdkBbbEeeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAntchainDemosdkBbbEeeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.demosdk.bbb.eee.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 测试用
//
// Summary: 测试用
func (client *Client) QueryAntchainDemosdkAaaTest(request *QueryAntchainDemosdkAaaTestRequest) (_result *QueryAntchainDemosdkAaaTestResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAntchainDemosdkAaaTestResponse{}
	_body, _err := client.QueryAntchainDemosdkAaaTestEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 测试用
//
// Summary: 测试用
func (client *Client) QueryAntchainDemosdkAaaTestEx(request *QueryAntchainDemosdkAaaTestRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAntchainDemosdkAaaTestResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAntchainDemosdkAaaTestResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.demosdk.aaa.test.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) StabilizeAntchainDemosdkBbbCcc(request *StabilizeAntchainDemosdkBbbCccRequest) (_result *StabilizeAntchainDemosdkBbbCccResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &StabilizeAntchainDemosdkBbbCccResponse{}
	_body, _err := client.StabilizeAntchainDemosdkBbbCccEx(request, headers, runtime)
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
func (client *Client) StabilizeAntchainDemosdkBbbCccEx(request *StabilizeAntchainDemosdkBbbCccRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *StabilizeAntchainDemosdkBbbCccResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &StabilizeAntchainDemosdkBbbCccResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.demosdk.bbb.ccc.stabilize"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: r
//
// Summary: r
func (client *Client) QueryAntchainDemosdkMultiCcc(request *QueryAntchainDemosdkMultiCccRequest) (_result *QueryAntchainDemosdkMultiCccResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAntchainDemosdkMultiCccResponse{}
	_body, _err := client.QueryAntchainDemosdkMultiCccEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: r
//
// Summary: r
func (client *Client) QueryAntchainDemosdkMultiCccEx(request *QueryAntchainDemosdkMultiCccRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAntchainDemosdkMultiCccResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAntchainDemosdkMultiCccResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.demosdk.multi.ccc.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) QueryAntchainDemosdkAaaCci(request *QueryAntchainDemosdkAaaCciRequest) (_result *QueryAntchainDemosdkAaaCciResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAntchainDemosdkAaaCciResponse{}
	_body, _err := client.QueryAntchainDemosdkAaaCciEx(request, headers, runtime)
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
func (client *Client) QueryAntchainDemosdkAaaCciEx(request *QueryAntchainDemosdkAaaCciRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAntchainDemosdkAaaCciResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAntchainDemosdkAaaCciResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.demosdk.aaa.cci.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 测试接口
//
// Summary: 测试接口
func (client *Client) ResetAntchainDemosdkBbbCcc(request *ResetAntchainDemosdkBbbCccRequest) (_result *ResetAntchainDemosdkBbbCccResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ResetAntchainDemosdkBbbCccResponse{}
	_body, _err := client.ResetAntchainDemosdkBbbCccEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 测试接口
//
// Summary: 测试接口
func (client *Client) ResetAntchainDemosdkBbbCccEx(request *ResetAntchainDemosdkBbbCccRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ResetAntchainDemosdkBbbCccResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ResetAntchainDemosdkBbbCccResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.demosdk.bbb.ccc.reset"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) BindAntchainDemosdkXxx(request *BindAntchainDemosdkXxxRequest) (_result *BindAntchainDemosdkXxxResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &BindAntchainDemosdkXxxResponse{}
	_body, _err := client.BindAntchainDemosdkXxxEx(request, headers, runtime)
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
func (client *Client) BindAntchainDemosdkXxxEx(request *BindAntchainDemosdkXxxRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *BindAntchainDemosdkXxxResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &BindAntchainDemosdkXxxResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.demosdk.xxx.bind"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) QueryAntchainDemosdkCcXx(request *QueryAntchainDemosdkCcXxRequest) (_result *QueryAntchainDemosdkCcXxResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAntchainDemosdkCcXxResponse{}
	_body, _err := client.QueryAntchainDemosdkCcXxEx(request, headers, runtime)
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
func (client *Client) QueryAntchainDemosdkCcXxEx(request *QueryAntchainDemosdkCcXxRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAntchainDemosdkCcXxResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAntchainDemosdkCcXxResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.demosdk.cc.xx.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 个人工作台二期分组路由灰度测试接口
//
// Summary: 个人工作台二期分组路由灰度测试接口
func (client *Client) ResetAntchainDemosdkAbcdLimit(request *ResetAntchainDemosdkAbcdLimitRequest) (_result *ResetAntchainDemosdkAbcdLimitResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ResetAntchainDemosdkAbcdLimitResponse{}
	_body, _err := client.ResetAntchainDemosdkAbcdLimitEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 个人工作台二期分组路由灰度测试接口
//
// Summary: 个人工作台二期分组路由灰度测试接口
func (client *Client) ResetAntchainDemosdkAbcdLimitEx(request *ResetAntchainDemosdkAbcdLimitRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ResetAntchainDemosdkAbcdLimitResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ResetAntchainDemosdkAbcdLimitResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.demosdk.abcd.limit.reset"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 用于个人工作台二期测试使用
//
// Summary: 用于个人工作台二期测试使用
func (client *Client) ImportAntchainDemosdkCreateOne(request *ImportAntchainDemosdkCreateOneRequest) (_result *ImportAntchainDemosdkCreateOneResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ImportAntchainDemosdkCreateOneResponse{}
	_body, _err := client.ImportAntchainDemosdkCreateOneEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 用于个人工作台二期测试使用
//
// Summary: 用于个人工作台二期测试使用
func (client *Client) ImportAntchainDemosdkCreateOneEx(request *ImportAntchainDemosdkCreateOneRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ImportAntchainDemosdkCreateOneResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ImportAntchainDemosdkCreateOneResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.demosdk.create.one.import"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) WithdrawAntchainDemosdkTwiceOne(request *WithdrawAntchainDemosdkTwiceOneRequest) (_result *WithdrawAntchainDemosdkTwiceOneResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &WithdrawAntchainDemosdkTwiceOneResponse{}
	_body, _err := client.WithdrawAntchainDemosdkTwiceOneEx(request, headers, runtime)
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
func (client *Client) WithdrawAntchainDemosdkTwiceOneEx(request *WithdrawAntchainDemosdkTwiceOneRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *WithdrawAntchainDemosdkTwiceOneResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &WithdrawAntchainDemosdkTwiceOneResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.demosdk.twice.one.withdraw"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) OperateAntchainDemosdkTwiceOne(request *OperateAntchainDemosdkTwiceOneRequest) (_result *OperateAntchainDemosdkTwiceOneResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &OperateAntchainDemosdkTwiceOneResponse{}
	_body, _err := client.OperateAntchainDemosdkTwiceOneEx(request, headers, runtime)
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
func (client *Client) OperateAntchainDemosdkTwiceOneEx(request *OperateAntchainDemosdkTwiceOneRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *OperateAntchainDemosdkTwiceOneResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &OperateAntchainDemosdkTwiceOneResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.demosdk.twice.one.operate"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) QueryAntchainDemosdkTwiceThree(request *QueryAntchainDemosdkTwiceThreeRequest) (_result *QueryAntchainDemosdkTwiceThreeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAntchainDemosdkTwiceThreeResponse{}
	_body, _err := client.QueryAntchainDemosdkTwiceThreeEx(request, headers, runtime)
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
func (client *Client) QueryAntchainDemosdkTwiceThreeEx(request *QueryAntchainDemosdkTwiceThreeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAntchainDemosdkTwiceThreeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAntchainDemosdkTwiceThreeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.demosdk.twice.three.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) UnstabilizeAntchainDemosdkTwiceThree(request *UnstabilizeAntchainDemosdkTwiceThreeRequest) (_result *UnstabilizeAntchainDemosdkTwiceThreeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UnstabilizeAntchainDemosdkTwiceThreeResponse{}
	_body, _err := client.UnstabilizeAntchainDemosdkTwiceThreeEx(request, headers, runtime)
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
func (client *Client) UnstabilizeAntchainDemosdkTwiceThreeEx(request *UnstabilizeAntchainDemosdkTwiceThreeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UnstabilizeAntchainDemosdkTwiceThreeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UnstabilizeAntchainDemosdkTwiceThreeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.demosdk.twice.three.unstabilize"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 测试接口
//
// Summary: 测试接口
func (client *Client) QueryAntchainDemosdkTesx(request *QueryAntchainDemosdkTesxRequest) (_result *QueryAntchainDemosdkTesxResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAntchainDemosdkTesxResponse{}
	_body, _err := client.QueryAntchainDemosdkTesxEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 测试接口
//
// Summary: 测试接口
func (client *Client) QueryAntchainDemosdkTesxEx(request *QueryAntchainDemosdkTesxRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAntchainDemosdkTesxResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAntchainDemosdkTesxResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.demosdk.tesx.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 1
//
// Summary: 1
func (client *Client) TestAntchainDemosdkPreFull(request *TestAntchainDemosdkPreFullRequest) (_result *TestAntchainDemosdkPreFullResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &TestAntchainDemosdkPreFullResponse{}
	_body, _err := client.TestAntchainDemosdkPreFullEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 1
//
// Summary: 1
func (client *Client) TestAntchainDemosdkPreFullEx(request *TestAntchainDemosdkPreFullRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *TestAntchainDemosdkPreFullResponse, _err error) {
	if !tea.BoolValue(util.IsUnset(request.FileObject)) {
		uploadReq := &CreateAntcloudGatewayxFileUploadRequest{
			AuthToken: request.AuthToken,
			ApiCode:   tea.String("antchain.demosdk.pre.full.test"),
			FileName:  request.FileObjectName,
		}
		uploadResp, _err := client.CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime)
		if _err != nil {
			return _result, _err
		}

		if !tea.BoolValue(antchainutil.IsSuccess(uploadResp.ResultCode, tea.String("ok"))) {
			testAntchainDemosdkPreFullResponse := &TestAntchainDemosdkPreFullResponse{
				ReqMsgId:   uploadResp.ReqMsgId,
				ResultCode: uploadResp.ResultCode,
				ResultMsg:  uploadResp.ResultMsg,
			}
			_result = testAntchainDemosdkPreFullResponse
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
	_result = &TestAntchainDemosdkPreFullResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.demosdk.pre.full.test"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 测试接口
//
// Summary: 测试接口
func (client *Client) QueryAntchainDemosdkTestapi(request *QueryAntchainDemosdkTestapiRequest) (_result *QueryAntchainDemosdkTestapiResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAntchainDemosdkTestapiResponse{}
	_body, _err := client.QueryAntchainDemosdkTestapiEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 测试接口
//
// Summary: 测试接口
func (client *Client) QueryAntchainDemosdkTestapiEx(request *QueryAntchainDemosdkTestapiRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAntchainDemosdkTestapiResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAntchainDemosdkTestapiResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.demosdk.testapi.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) QueryAntchainDemosdkTum(request *QueryAntchainDemosdkTumRequest) (_result *QueryAntchainDemosdkTumResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAntchainDemosdkTumResponse{}
	_body, _err := client.QueryAntchainDemosdkTumEx(request, headers, runtime)
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
func (client *Client) QueryAntchainDemosdkTumEx(request *QueryAntchainDemosdkTumRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAntchainDemosdkTumResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAntchainDemosdkTumResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.demosdk.tum.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) ZzzAntchainDemosdkAaaBbb(request *ZzzAntchainDemosdkAaaBbbRequest) (_result *ZzzAntchainDemosdkAaaBbbResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ZzzAntchainDemosdkAaaBbbResponse{}
	_body, _err := client.ZzzAntchainDemosdkAaaBbbEx(request, headers, runtime)
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
func (client *Client) ZzzAntchainDemosdkAaaBbbEx(request *ZzzAntchainDemosdkAaaBbbRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ZzzAntchainDemosdkAaaBbbResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ZzzAntchainDemosdkAaaBbbResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.demosdk.aaa.bbb.zzz"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
