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
	SomeInt *int64 `json:"some_int,omitempty" xml:"some_int,omitempty" require:"true"`
	// 列表测试
	SomeList []*string `json:"some_list,omitempty" xml:"some_list,omitempty" require:"true" type:"Repeated"`
	// test
	// example:
	//
	// undefined
	SomeObject *AnotherClass `json:"some_object,omitempty" xml:"some_object,omitempty" require:"true"`
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

func (s *DemoClass) SetSomeObject(v *AnotherClass) *DemoClass {
	s.SomeObject = v
	return s
}

// 另一个Demo类
type AnotherClass struct {
	// 测试字段
	// example:
	//
	// some string
	Bar *string `json:"bar,omitempty" xml:"bar,omitempty" require:"true"`
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

func (s *AnotherClass) SetRefList(v []*DemoClass) *AnotherClass {
	s.RefList = v
	return s
}

// TestStruct
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

// testAAAA
type TestClass struct {
	// 1
	// example:
	//
	// testclass
	Test *string `json:"test,omitempty" xml:"test,omitempty" require:"true"`
	// 2
	// example:
	//
	// testclass
	Demo *string `json:"demo,omitempty" xml:"demo,omitempty" require:"true"`
	// 3
	// example:
	//
	// id2
	Demo1 *string `json:"demo1,omitempty" xml:"demo1,omitempty" require:"true"`
	// 22
	// example:
	//
	// 12
	Demo2 *string `json:"demo2,omitempty" xml:"demo2,omitempty" require:"true"`
	// test
	// example:
	//
	// undefined
	Info *DemoClass `json:"info,omitempty" xml:"info,omitempty" require:"true"`
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

func (s *TestClass) SetDemo2(v string) *TestClass {
	s.Demo2 = &v
	return s
}

func (s *TestClass) SetInfo(v *DemoClass) *TestClass {
	s.Info = v
	return s
}

// Map<String,Object> 集合
type QueryMap struct {
	// 键值
	// example:
	//
	// BUSINESS_CODE
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

// 键值对，兼容map用
type NameValuePair struct {
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

// init接口响应结果，map类型
type InitPack struct {
	// 返回接收到请求的当前时间
	// example:
	//
	// 2022-11-07 14:48
	Time *string `json:"time,omitempty" xml:"time,omitempty" require:"true"`
	// 操作人
	// example:
	//
	// wanyi
	Operator *string `json:"operator,omitempty" xml:"operator,omitempty" require:"true"`
	// 请求编号
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

func (s *InitPack) SetOperator(v string) *InitPack {
	s.Operator = &v
	return s
}

func (s *InitPack) SetCount(v int64) *InitPack {
	s.Count = &v
	return s
}

// DemoTestx
type DemoTestx struct {
	// ability_id
	// example:
	//
	// 8000
	AbilityId *string `json:"ability_id,omitempty" xml:"ability_id,omitempty" require:"true"`
}

func (s DemoTestx) String() string {
	return tea.Prettify(s)
}

func (s DemoTestx) GoString() string {
	return s.String()
}

func (s *DemoTestx) SetAbilityId(v string) *DemoTestx {
	s.AbilityId = &v
	return s
}

// routeCondition
type RouteCondition struct {
	// 渠道编号
	// example:
	//
	// HZZKZTKJ
	ChannelId *string `json:"channel_id,omitempty" xml:"channel_id,omitempty" require:"true"`
}

func (s RouteCondition) String() string {
	return tea.Prettify(s)
}

func (s RouteCondition) GoString() string {
	return s.String()
}

func (s *RouteCondition) SetChannelId(v string) *RouteCondition {
	s.ChannelId = &v
	return s
}

// 编码
type Cmd struct {
	// cmd编码
	// example:
	//
	// SC-RealEstate-Query
	CmdCode *string `json:"cmd_code,omitempty" xml:"cmd_code,omitempty" require:"true"`
	// 版本号
	// example:
	//
	// test_d19bd9d59915
	Version *string `json:"version,omitempty" xml:"version,omitempty" require:"true"`
}

func (s Cmd) String() string {
	return tea.Prettify(s)
}

func (s Cmd) GoString() string {
	return s.String()
}

func (s *Cmd) SetCmdCode(v string) *Cmd {
	s.CmdCode = &v
	return s
}

func (s *Cmd) SetVersion(v string) *Cmd {
	s.Version = &v
	return s
}

// 身份
type Identity struct {
	// ak
	// example:
	//
	// test_0efe42463f8f
	Ak *string `json:"ak,omitempty" xml:"ak,omitempty" require:"true"`
}

func (s Identity) String() string {
	return tea.Prettify(s)
}

func (s Identity) GoString() string {
	return s.String()
}

func (s *Identity) SetAk(v string) *Identity {
	s.Ak = &v
	return s
}

// host
type Host struct {
	// test_2e1ae924805f
	// example:
	//
	// test_2e1ae924805f
	SystemName *string `json:"system_name,omitempty" xml:"system_name,omitempty" require:"true"`
	// 地址
	// example:
	//
	// test_941f18a4013b
	Address *string `json:"address,omitempty" xml:"address,omitempty" require:"true"`
}

func (s Host) String() string {
	return tea.Prettify(s)
}

func (s Host) GoString() string {
	return s.String()
}

func (s *Host) SetSystemName(v string) *Host {
	s.SystemName = &v
	return s
}

func (s *Host) SetAddress(v string) *Host {
	s.Address = &v
	return s
}

// 头文件
type Header struct {
	// 身份信息
	// example:
	//
	// "identity": {       "ak": "test_0efe42463f8f"     }
	Identity *Identity `json:"identity,omitempty" xml:"identity,omitempty" require:"true"`
	// 调用链编号
	// example:
	//
	// test_6db79b5d2e48
	TraceId *string `json:"trace_id,omitempty" xml:"trace_id,omitempty" require:"true"`
	// host信息
	// example:
	//
	// "host": {       "systemName": "test_2e1ae924805f",       "address": "test_941f18a4013b"     }
	Host *Host `json:"host,omitempty" xml:"host,omitempty" require:"true"`
	// 方向
	// example:
	//
	// REQUEST
	Direction *string `json:"direction,omitempty" xml:"direction,omitempty" require:"true"`
	// 请求类型
	// example:
	//
	// INVOKE
	RequestType *string `json:"request_type,omitempty" xml:"request_type,omitempty" require:"true"`
	// 协议版本
	// example:
	//
	// test_6709e9002606
	ProtocolVersion *string `json:"protocol_version,omitempty" xml:"protocol_version,omitempty" require:"true"`
}

func (s Header) String() string {
	return tea.Prettify(s)
}

func (s Header) GoString() string {
	return s.String()
}

func (s *Header) SetIdentity(v *Identity) *Header {
	s.Identity = v
	return s
}

func (s *Header) SetTraceId(v string) *Header {
	s.TraceId = &v
	return s
}

func (s *Header) SetHost(v *Host) *Header {
	s.Host = v
	return s
}

func (s *Header) SetDirection(v string) *Header {
	s.Direction = &v
	return s
}

func (s *Header) SetRequestType(v string) *Header {
	s.RequestType = &v
	return s
}

func (s *Header) SetProtocolVersion(v string) *Header {
	s.ProtocolVersion = &v
	return s
}

// SCRealEstateQueryRequestPayload
type SCRealEstateQueryRequestPayload struct {
	// xm
	// example:
	//
	// 张三
	Xm *string `json:"xm,omitempty" xml:"xm,omitempty" require:"true"`
	// sfz
	// example:
	//
	// 51382219970820817X
	Sfz *string `json:"sfz,omitempty" xml:"sfz,omitempty" require:"true"`
}

func (s SCRealEstateQueryRequestPayload) String() string {
	return tea.Prettify(s)
}

func (s SCRealEstateQueryRequestPayload) GoString() string {
	return s.String()
}

func (s *SCRealEstateQueryRequestPayload) SetXm(v string) *SCRealEstateQueryRequestPayload {
	s.Xm = &v
	return s
}

func (s *SCRealEstateQueryRequestPayload) SetSfz(v string) *SCRealEstateQueryRequestPayload {
	s.Sfz = &v
	return s
}

// SCRealEstateQueryRequestBody
type SCRealEstateQueryRequestBody struct {
	// cmd
	// example:
	//
	// "cmd": {       "cmdCode": "SC-RealEstate-Query",       "version": "test_d19bd9d59915"     }
	Cmd *Cmd `json:"cmd,omitempty" xml:"cmd,omitempty" require:"true"`
	// 路由信息
	// example:
	//
	// "routeCondition": {       "channelId": "HZZKZTKJ"     }
	RouteCondition *RouteCondition `json:"route_condition,omitempty" xml:"route_condition,omitempty" require:"true"`
	// requestId
	// example:
	//
	// test_8c964bb7781a
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty" require:"true"`
	// payload
	// example:
	//
	// { "xm": "张三",   "sfz": "51382219970820817X"}
	Payload *SCRealEstateQueryRequestPayload `json:"payload,omitempty" xml:"payload,omitempty" require:"true"`
}

func (s SCRealEstateQueryRequestBody) String() string {
	return tea.Prettify(s)
}

func (s SCRealEstateQueryRequestBody) GoString() string {
	return s.String()
}

func (s *SCRealEstateQueryRequestBody) SetCmd(v *Cmd) *SCRealEstateQueryRequestBody {
	s.Cmd = v
	return s
}

func (s *SCRealEstateQueryRequestBody) SetRouteCondition(v *RouteCondition) *SCRealEstateQueryRequestBody {
	s.RouteCondition = v
	return s
}

func (s *SCRealEstateQueryRequestBody) SetRequestId(v string) *SCRealEstateQueryRequestBody {
	s.RequestId = &v
	return s
}

func (s *SCRealEstateQueryRequestBody) SetPayload(v *SCRealEstateQueryRequestPayload) *SCRealEstateQueryRequestBody {
	s.Payload = v
	return s
}

// SCRealEstateQuery
type SCRealEstateQueryInvokerRequest struct {
	// header
	// example:
	//
	// "header": {}
	Header *Header `json:"header,omitempty" xml:"header,omitempty" require:"true"`
	// body
	// example:
	//
	// "body":{}
	Body *SCRealEstateQueryBody `json:"body,omitempty" xml:"body,omitempty" require:"true"`
}

func (s SCRealEstateQueryInvokerRequest) String() string {
	return tea.Prettify(s)
}

func (s SCRealEstateQueryInvokerRequest) GoString() string {
	return s.String()
}

func (s *SCRealEstateQueryInvokerRequest) SetHeader(v *Header) *SCRealEstateQueryInvokerRequest {
	s.Header = v
	return s
}

func (s *SCRealEstateQueryInvokerRequest) SetBody(v *SCRealEstateQueryBody) *SCRealEstateQueryInvokerRequest {
	s.Body = v
	return s
}

// ResponseBody
type SCRealEstateQueryResponseBody struct {
	// cost
	// example:
	//
	// 1234
	Cost *int64 `json:"cost,omitempty" xml:"cost,omitempty" require:"true"`
	// response_status
	// example:
	//
	// response_status
	ResponseStatus *string `json:"response_status,omitempty" xml:"response_status,omitempty" require:"true"`
	// response_code
	// example:
	//
	// 200
	ResponseCode *string `json:"response_code,omitempty" xml:"response_code,omitempty" require:"true"`
	// request_id
	// example:
	//
	// request_id
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty" require:"true"`
	// payload
	Payload *SCRealEstateQueryResponsePayload `json:"payload,omitempty" xml:"payload,omitempty" require:"true"`
}

func (s SCRealEstateQueryResponseBody) String() string {
	return tea.Prettify(s)
}

func (s SCRealEstateQueryResponseBody) GoString() string {
	return s.String()
}

func (s *SCRealEstateQueryResponseBody) SetCost(v int64) *SCRealEstateQueryResponseBody {
	s.Cost = &v
	return s
}

func (s *SCRealEstateQueryResponseBody) SetResponseStatus(v string) *SCRealEstateQueryResponseBody {
	s.ResponseStatus = &v
	return s
}

func (s *SCRealEstateQueryResponseBody) SetResponseCode(v string) *SCRealEstateQueryResponseBody {
	s.ResponseCode = &v
	return s
}

func (s *SCRealEstateQueryResponseBody) SetRequestId(v string) *SCRealEstateQueryResponseBody {
	s.RequestId = &v
	return s
}

func (s *SCRealEstateQueryResponseBody) SetPayload(v *SCRealEstateQueryResponsePayload) *SCRealEstateQueryResponseBody {
	s.Payload = v
	return s
}

// SCRealEstateQueryResponseData
type SCRealEstateQueryResponseData struct {
	// area_code
	// example:
	//
	// 510108
	AreaCode *string `json:"area_code,omitempty" xml:"area_code,omitempty" require:"true"`
	// area_name
	// example:
	//
	// area_name
	AreaName *string `json:"area_name,omitempty" xml:"area_name,omitempty" require:"true"`
	// bdcdyh
	// example:
	//
	// bdcdyh
	Bdcdyh *string `json:"bdcdyh,omitempty" xml:"bdcdyh,omitempty" require:"true"`
	// bdcqzh
	// example:
	//
	// bdcqzh
	Bdcqzh *string `json:"bdcqzh,omitempty" xml:"bdcqzh,omitempty" require:"true"`
	// djsj
	// example:
	//
	// djsj
	Djsj *string `json:"djsj,omitempty" xml:"djsj,omitempty" require:"true"`
	// fwyt1
	// example:
	//
	// fwyt1
	Fwyt1 *string `json:"fwyt1,omitempty" xml:"fwyt1,omitempty" require:"true"`
	// gyqk
	// example:
	//
	// gyqk
	Gyqk *string `json:"gyqk,omitempty" xml:"gyqk,omitempty" require:"true"`
	// qllx
	// example:
	//
	// qllx
	Qllx *string `json:"qllx,omitempty" xml:"qllx,omitempty" require:"true"`
	// qlrmc
	// example:
	//
	// qlrmc
	Qlrmc *string `json:"qlrmc,omitempty" xml:"qlrmc,omitempty" require:"true"`
	// scjzmj
	// example:
	//
	// scjzmj
	Scjzmj *string `json:"scjzmj,omitempty" xml:"scjzmj,omitempty" require:"true"`
}

func (s SCRealEstateQueryResponseData) String() string {
	return tea.Prettify(s)
}

func (s SCRealEstateQueryResponseData) GoString() string {
	return s.String()
}

func (s *SCRealEstateQueryResponseData) SetAreaCode(v string) *SCRealEstateQueryResponseData {
	s.AreaCode = &v
	return s
}

func (s *SCRealEstateQueryResponseData) SetAreaName(v string) *SCRealEstateQueryResponseData {
	s.AreaName = &v
	return s
}

func (s *SCRealEstateQueryResponseData) SetBdcdyh(v string) *SCRealEstateQueryResponseData {
	s.Bdcdyh = &v
	return s
}

func (s *SCRealEstateQueryResponseData) SetBdcqzh(v string) *SCRealEstateQueryResponseData {
	s.Bdcqzh = &v
	return s
}

func (s *SCRealEstateQueryResponseData) SetDjsj(v string) *SCRealEstateQueryResponseData {
	s.Djsj = &v
	return s
}

func (s *SCRealEstateQueryResponseData) SetFwyt1(v string) *SCRealEstateQueryResponseData {
	s.Fwyt1 = &v
	return s
}

func (s *SCRealEstateQueryResponseData) SetGyqk(v string) *SCRealEstateQueryResponseData {
	s.Gyqk = &v
	return s
}

func (s *SCRealEstateQueryResponseData) SetQllx(v string) *SCRealEstateQueryResponseData {
	s.Qllx = &v
	return s
}

func (s *SCRealEstateQueryResponseData) SetQlrmc(v string) *SCRealEstateQueryResponseData {
	s.Qlrmc = &v
	return s
}

func (s *SCRealEstateQueryResponseData) SetScjzmj(v string) *SCRealEstateQueryResponseData {
	s.Scjzmj = &v
	return s
}

// SCRealEstateQueryResponsePayload
type SCRealEstateQueryResponsePayload struct {
	// code
	// example:
	//
	// 200
	Code *string `json:"code,omitempty" xml:"code,omitempty" require:"true"`
	// data
	Data []*SCRealEstateQueryResponseData `json:"data,omitempty" xml:"data,omitempty" require:"true" type:"Repeated"`
	// uuid
	// example:
	//
	// uuid
	Uuid *string `json:"uuid,omitempty" xml:"uuid,omitempty" require:"true"`
	// ret_msg
	// example:
	//
	// ret_msg
	RetMsg *string `json:"ret_msg,omitempty" xml:"ret_msg,omitempty" require:"true"`
}

func (s SCRealEstateQueryResponsePayload) String() string {
	return tea.Prettify(s)
}

func (s SCRealEstateQueryResponsePayload) GoString() string {
	return s.String()
}

func (s *SCRealEstateQueryResponsePayload) SetCode(v string) *SCRealEstateQueryResponsePayload {
	s.Code = &v
	return s
}

func (s *SCRealEstateQueryResponsePayload) SetData(v []*SCRealEstateQueryResponseData) *SCRealEstateQueryResponsePayload {
	s.Data = v
	return s
}

func (s *SCRealEstateQueryResponsePayload) SetUuid(v string) *SCRealEstateQueryResponsePayload {
	s.Uuid = &v
	return s
}

func (s *SCRealEstateQueryResponsePayload) SetRetMsg(v string) *SCRealEstateQueryResponsePayload {
	s.RetMsg = &v
	return s
}

// testAtestB
type SCRealEstateQueryBody struct {
}

func (s SCRealEstateQueryBody) String() string {
	return tea.Prettify(s)
}

func (s SCRealEstateQueryBody) GoString() string {
	return s.String()
}

// 大安全佐罗测试接口结构体
type FaceImage struct {
	// 123
	// example:
	//
	// 123
	Content *string `json:"content,omitempty" xml:"content,omitempty"`
	// 213
	// example:
	//
	// 13
	Rect *string `json:"rect,omitempty" xml:"rect,omitempty"`
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

// 自动生成单测代码model
type AutoCodeModel struct {
	// 111
	// example:
	//
	// 111
	ModelStringParam *string `json:"model_string_param,omitempty" xml:"model_string_param,omitempty" require:"true"`
	// 111
	// example:
	//
	// 2018-10-10T10:10:00Z
	ModelDateParam *string `json:"model_date_param,omitempty" xml:"model_date_param,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 111
	// example:
	//
	// 111
	ModelArrayParam []*string `json:"model_array_param,omitempty" xml:"model_array_param,omitempty" require:"true" type:"Repeated"`
}

func (s AutoCodeModel) String() string {
	return tea.Prettify(s)
}

func (s AutoCodeModel) GoString() string {
	return s.String()
}

func (s *AutoCodeModel) SetModelStringParam(v string) *AutoCodeModel {
	s.ModelStringParam = &v
	return s
}

func (s *AutoCodeModel) SetModelDateParam(v string) *AutoCodeModel {
	s.ModelDateParam = &v
	return s
}

func (s *AutoCodeModel) SetModelArrayParam(v []*string) *AutoCodeModel {
	s.ModelArrayParam = v
	return s
}

// 数字类型
type NumberTest struct {
	// 1
	// example:
	//
	// 1
	Parameter1 *int64 `json:"parameter_1,omitempty" xml:"parameter_1,omitempty" require:"true" maximum:"5" minimum:"1"`
	// 2
	// example:
	//
	// 2
	Parameter2 *int64 `json:"parameter_2,omitempty" xml:"parameter_2,omitempty" require:"true" maximum:"5" minimum:"1"`
	// 3
	// example:
	//
	// 3
	Parameter3 *int64 `json:"parameter_3,omitempty" xml:"parameter_3,omitempty" require:"true" maximum:"5" minimum:"1"`
	// 4
	// example:
	//
	// 4
	Parameter4 *int64 `json:"parameter_4,omitempty" xml:"parameter_4,omitempty" require:"true" maximum:"5" minimum:"1"`
	// 5
	// example:
	//
	// 5
	Parameter5 *DemoClass `json:"parameter_5,omitempty" xml:"parameter_5,omitempty" require:"true"`
}

func (s NumberTest) String() string {
	return tea.Prettify(s)
}

func (s NumberTest) GoString() string {
	return s.String()
}

func (s *NumberTest) SetParameter1(v int64) *NumberTest {
	s.Parameter1 = &v
	return s
}

func (s *NumberTest) SetParameter2(v int64) *NumberTest {
	s.Parameter2 = &v
	return s
}

func (s *NumberTest) SetParameter3(v int64) *NumberTest {
	s.Parameter3 = &v
	return s
}

func (s *NumberTest) SetParameter4(v int64) *NumberTest {
	s.Parameter4 = &v
	return s
}

func (s *NumberTest) SetParameter5(v *DemoClass) *NumberTest {
	s.Parameter5 = v
	return s
}

// 123
type TestA struct {
	// 1
	// example:
	//
	// 1
	Parameter1 *string `json:"parameter_1,omitempty" xml:"parameter_1,omitempty" require:"true"`
	// 2
	// example:
	//
	// 2
	Parameter2 *string `json:"parameter_2,omitempty" xml:"parameter_2,omitempty" require:"true"`
	// 3
	// example:
	//
	// 3
	Parameter3 *string `json:"parameter_3,omitempty" xml:"parameter_3,omitempty" require:"true"`
	// 4
	// example:
	//
	// 4
	Parameter4 *string `json:"parameter_4,omitempty" xml:"parameter_4,omitempty" require:"true"`
	// 5
	// example:
	//
	// 5
	Parameter5 *string `json:"parameter_5,omitempty" xml:"parameter_5,omitempty" require:"true"`
	// 6
	// example:
	//
	// 6
	Parameter6 *string `json:"parameter_6,omitempty" xml:"parameter_6,omitempty" require:"true"`
	// 7
	// example:
	//
	// 7
	Parameter7 *string `json:"parameter_7,omitempty" xml:"parameter_7,omitempty" require:"true"`
	// 8
	// example:
	//
	// 8
	Parameter8 *string `json:"parameter_8,omitempty" xml:"parameter_8,omitempty" require:"true"`
	// 9
	// example:
	//
	// 9
	Parameter9 *string `json:"parameter_9,omitempty" xml:"parameter_9,omitempty" require:"true"`
	// 10
	// example:
	//
	// 10
	Parameter10 *string `json:"parameter_10,omitempty" xml:"parameter_10,omitempty" require:"true"`
}

func (s TestA) String() string {
	return tea.Prettify(s)
}

func (s TestA) GoString() string {
	return s.String()
}

func (s *TestA) SetParameter1(v string) *TestA {
	s.Parameter1 = &v
	return s
}

func (s *TestA) SetParameter2(v string) *TestA {
	s.Parameter2 = &v
	return s
}

func (s *TestA) SetParameter3(v string) *TestA {
	s.Parameter3 = &v
	return s
}

func (s *TestA) SetParameter4(v string) *TestA {
	s.Parameter4 = &v
	return s
}

func (s *TestA) SetParameter5(v string) *TestA {
	s.Parameter5 = &v
	return s
}

func (s *TestA) SetParameter6(v string) *TestA {
	s.Parameter6 = &v
	return s
}

func (s *TestA) SetParameter7(v string) *TestA {
	s.Parameter7 = &v
	return s
}

func (s *TestA) SetParameter8(v string) *TestA {
	s.Parameter8 = &v
	return s
}

func (s *TestA) SetParameter9(v string) *TestA {
	s.Parameter9 = &v
	return s
}

func (s *TestA) SetParameter10(v string) *TestA {
	s.Parameter10 = &v
	return s
}

// 用于上海非金迭代的测试使用
type ShangHaiTest struct {
	// string
	// example:
	//
	// test
	Param1 *string `json:"param_1,omitempty" xml:"param_1,omitempty"`
	// number
	// example:
	//
	// 1
	Param2 *int64 `json:"param_2,omitempty" xml:"param_2,omitempty"`
}

func (s ShangHaiTest) String() string {
	return tea.Prettify(s)
}

func (s ShangHaiTest) GoString() string {
	return s.String()
}

func (s *ShangHaiTest) SetParam1(v string) *ShangHaiTest {
	s.Param1 = &v
	return s
}

func (s *ShangHaiTest) SetParam2(v int64) *ShangHaiTest {
	s.Param2 = &v
	return s
}

// 测试
type TestObject struct {
	// 主键
	// example:
	//
	// 12
	Id *int64 `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 名称
	// example:
	//
	// 小蜜
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
}

func (s TestObject) String() string {
	return tea.Prettify(s)
}

func (s TestObject) GoString() string {
	return s.String()
}

func (s *TestObject) SetId(v int64) *TestObject {
	s.Id = &v
	return s
}

func (s *TestObject) SetName(v string) *TestObject {
	s.Name = &v
	return s
}

// 测试
type TestAPIObject struct {
	// test
	// example:
	//
	// 21
	Id *int64 `json:"id,omitempty" xml:"id,omitempty" require:"true"`
}

func (s TestAPIObject) String() string {
	return tea.Prettify(s)
}

func (s TestAPIObject) GoString() string {
	return s.String()
}

func (s *TestAPIObject) SetId(v int64) *TestAPIObject {
	s.Id = &v
	return s
}

// 键值对
type Map struct {
	// 键
	// example:
	//
	// key1
	Key *string `json:"key,omitempty" xml:"key,omitempty" require:"true"`
	// 值
	// example:
	//
	// value1
	Value *string `json:"value,omitempty" xml:"value,omitempty"`
}

func (s Map) String() string {
	return tea.Prettify(s)
}

func (s Map) GoString() string {
	return s.String()
}

func (s *Map) SetKey(v string) *Map {
	s.Key = &v
	return s
}

func (s *Map) SetValue(v string) *Map {
	s.Value = &v
	return s
}

// aaa
type A struct {
}

func (s A) String() string {
	return tea.Prettify(s)
}

func (s A) GoString() string {
	return s.String()
}

// 嵌套结构
type NestModel struct {
	// aaaa
	// example:
	//
	// aaa
	A *string `json:"a,omitempty" xml:"a,omitempty" require:"true"`
}

func (s NestModel) String() string {
	return tea.Prettify(s)
}

func (s NestModel) GoString() string {
	return s.String()
}

func (s *NestModel) SetA(v string) *NestModel {
	s.A = &v
	return s
}

// 用户基础信息
type UserProfile struct {
	// 用户ID
	// example:
	//
	// 1234567890
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty"`
	// 用户身份证号
	// example:
	//
	// 110101199003072516
	IdNumber *string `json:"id_number,omitempty" xml:"id_number,omitempty"`
	// 手机号
	// example:
	//
	// 13800138000
	Mobile *string `json:"mobile,omitempty" xml:"mobile,omitempty"`
	// 年龄
	// example:
	//
	// 32
	Age *int64 `json:"age,omitempty" xml:"age,omitempty"`
	// 信用评分
	// example:
	//
	// 720
	CreditScore *int64 `json:"credit_score,omitempty" xml:"credit_score,omitempty"`
}

func (s UserProfile) String() string {
	return tea.Prettify(s)
}

func (s UserProfile) GoString() string {
	return s.String()
}

func (s *UserProfile) SetUserId(v string) *UserProfile {
	s.UserId = &v
	return s
}

func (s *UserProfile) SetIdNumber(v string) *UserProfile {
	s.IdNumber = &v
	return s
}

func (s *UserProfile) SetMobile(v string) *UserProfile {
	s.Mobile = &v
	return s
}

func (s *UserProfile) SetAge(v int64) *UserProfile {
	s.Age = &v
	return s
}

func (s *UserProfile) SetCreditScore(v int64) *UserProfile {
	s.CreditScore = &v
	return s
}

// 交易明细信息
type TransactionDetails struct {
	// 金额
	// example:
	//
	// 85000.00
	Amount *int64 `json:"amount,omitempty" xml:"amount,omitempty"`
	// 币种
	// example:
	//
	// CNY
	Currency *string `json:"currency,omitempty" xml:"currency,omitempty"`
	// 渠道
	// example:
	//
	// ATM
	Channel *string `json:"channel,omitempty" xml:"channel,omitempty"`
	// 地址
	// example:
	//
	// 上海分行
	Location *string `json:"location,omitempty" xml:"location,omitempty"`
	// 时间
	// example:
	//
	// 2018-10-10T10:10:00Z
	Time *string `json:"time,omitempty" xml:"time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
}

func (s TransactionDetails) String() string {
	return tea.Prettify(s)
}

func (s TransactionDetails) GoString() string {
	return s.String()
}

func (s *TransactionDetails) SetAmount(v int64) *TransactionDetails {
	s.Amount = &v
	return s
}

func (s *TransactionDetails) SetCurrency(v string) *TransactionDetails {
	s.Currency = &v
	return s
}

func (s *TransactionDetails) SetChannel(v string) *TransactionDetails {
	s.Channel = &v
	return s
}

func (s *TransactionDetails) SetLocation(v string) *TransactionDetails {
	s.Location = &v
	return s
}

func (s *TransactionDetails) SetTime(v string) *TransactionDetails {
	s.Time = &v
	return s
}

// 风险评估因子明细
type RiskFactorDetail struct {
	// 风险评估因子类型
	// example:
	//
	// BLACKLIST
	FactorType *string `json:"factor_type,omitempty" xml:"factor_type,omitempty"`
	// 分数
	// example:
	//
	// 85
	Score *int64 `json:"score,omitempty" xml:"score,omitempty"`
	// 风险事件
	// example:
	//
	// ["关联账户被冻结", "高频异常交易"]
	Evidence []*string `json:"evidence,omitempty" xml:"evidence,omitempty" type:"Repeated"`
}

func (s RiskFactorDetail) String() string {
	return tea.Prettify(s)
}

func (s RiskFactorDetail) GoString() string {
	return s.String()
}

func (s *RiskFactorDetail) SetFactorType(v string) *RiskFactorDetail {
	s.FactorType = &v
	return s
}

func (s *RiskFactorDetail) SetScore(v int64) *RiskFactorDetail {
	s.Score = &v
	return s
}

func (s *RiskFactorDetail) SetEvidence(v []*string) *RiskFactorDetail {
	s.Evidence = v
	return s
}

// 内容4
type Content struct {
	// name
	// example:
	//
	// test
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 1
	// example:
	//
	// test
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true"`
}

func (s Content) String() string {
	return tea.Prettify(s)
}

func (s Content) GoString() string {
	return s.String()
}

func (s *Content) SetName(v string) *Content {
	s.Name = &v
	return s
}

func (s *Content) SetId(v string) *Content {
	s.Id = &v
	return s
}

// ContentT
type ContentT struct {
	// 1
	// example:
	//
	// 123
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
}

func (s ContentT) String() string {
	return tea.Prettify(s)
}

func (s ContentT) GoString() string {
	return s.String()
}

func (s *ContentT) SetName(v string) *ContentT {
	s.Name = &v
	return s
}

// ContentTest-123
type ContentTest struct {
	// name
	// example:
	//
	// test
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
}

func (s ContentTest) String() string {
	return tea.Prettify(s)
}

func (s ContentTest) GoString() string {
	return s.String()
}

func (s *ContentTest) SetName(v string) *ContentTest {
	s.Name = &v
	return s
}

// 卡片信息
type Card struct {
	// 卡片名称
	// example:
	//
	// 张三
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
}

func (s Card) String() string {
	return tea.Prettify(s)
}

func (s Card) GoString() string {
	return s.String()
}

func (s *Card) SetName(v string) *Card {
	s.Name = &v
	return s
}

// 人员信息
type Person struct {
	// 12
	// example:
	//
	// 张三
	Idcard *NameValuePair `json:"idcard,omitempty" xml:"idcard,omitempty"`
	// 12
	// example:
	//
	// 张三
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// test
	// example:
	//
	// undefined
	Info *Cmd `json:"info,omitempty" xml:"info,omitempty" require:"true"`
}

func (s Person) String() string {
	return tea.Prettify(s)
}

func (s Person) GoString() string {
	return s.String()
}

func (s *Person) SetIdcard(v *NameValuePair) *Person {
	s.Idcard = v
	return s
}

func (s *Person) SetName(v string) *Person {
	s.Name = &v
	return s
}

func (s *Person) SetInfo(v *Cmd) *Person {
	s.Info = v
	return s
}

// 1
type CardInfo struct {
	// 1233
	// example:
	//
	// undefined
	PersionInfo *Person `json:"persion_info,omitempty" xml:"persion_info,omitempty"`
	// 12
	// example:
	//
	// 12345
	IdCard *string `json:"id_card,omitempty" xml:"id_card,omitempty"`
}

func (s CardInfo) String() string {
	return tea.Prettify(s)
}

func (s CardInfo) GoString() string {
	return s.String()
}

func (s *CardInfo) SetPersionInfo(v *Person) *CardInfo {
	s.PersionInfo = v
	return s
}

func (s *CardInfo) SetIdCard(v string) *CardInfo {
	s.IdCard = &v
	return s
}

// 档案
type TestStu struct {
	// 567
	// example:
	//
	// undefined
	CardInfo *CardInfo `json:"card_info,omitempty" xml:"card_info,omitempty"`
	// 12
	// example:
	//
	// 档案号
	StuNo *string `json:"stu_no,omitempty" xml:"stu_no,omitempty" require:"true"`
}

func (s TestStu) String() string {
	return tea.Prettify(s)
}

func (s TestStu) GoString() string {
	return s.String()
}

func (s *TestStu) SetCardInfo(v *CardInfo) *TestStu {
	s.CardInfo = v
	return s
}

func (s *TestStu) SetStuNo(v string) *TestStu {
	s.StuNo = &v
	return s
}

// test
type DomeClasssss struct {
	// test
	// example:
	//
	// test
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
}

func (s DomeClasssss) String() string {
	return tea.Prettify(s)
}

func (s DomeClasssss) GoString() string {
	return s.String()
}

func (s *DomeClasssss) SetName(v string) *DomeClasssss {
	s.Name = &v
	return s
}

// test
type DemoInfo struct {
	// test
	// example:
	//
	// test
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 123
	// example:
	//
	// 1123
	Testx *ContentTest `json:"testx,omitempty" xml:"testx,omitempty"`
}

func (s DemoInfo) String() string {
	return tea.Prettify(s)
}

func (s DemoInfo) GoString() string {
	return s.String()
}

func (s *DemoInfo) SetName(v string) *DemoInfo {
	s.Name = &v
	return s
}

func (s *DemoInfo) SetTestx(v *ContentTest) *DemoInfo {
	s.Testx = v
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

// groupA分组结构体
type GroupAClass struct {
	// -
	// example:
	//
	// -
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 防伪码类型
	// example:
	//
	// 103001
	CodeType *string `json:"code_type,omitempty" xml:"code_type,omitempty" require:"true"`
	// 防伪码码值
	// example:
	//
	// 600011111
	Code *string `json:"code,omitempty" xml:"code,omitempty" require:"true"`
}

func (s GroupAClass) String() string {
	return tea.Prettify(s)
}

func (s GroupAClass) GoString() string {
	return s.String()
}

func (s *GroupAClass) SetProductInstanceId(v string) *GroupAClass {
	s.ProductInstanceId = &v
	return s
}

func (s *GroupAClass) SetCodeType(v string) *GroupAClass {
	s.CodeType = &v
	return s
}

func (s *GroupAClass) SetCode(v string) *GroupAClass {
	s.Code = &v
	return s
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

// 测试新增
type TestAdd struct {
	// 测试
	// example:
	//
	// 测试
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
}

func (s TestAdd) String() string {
	return tea.Prettify(s)
}

func (s TestAdd) GoString() string {
	return s.String()
}

func (s *TestAdd) SetName(v string) *TestAdd {
	s.Name = &v
	return s
}

// 用于测试预发ob的同步_已编辑
type PreTestUse struct {
	// 1
	// example:
	//
	// 1
	Param1 *string `json:"param_1,omitempty" xml:"param_1,omitempty" require:"true"`
	// 11
	// example:
	//
	// 11
	Param2 *int64 `json:"param_2,omitempty" xml:"param_2,omitempty" require:"true"`
	// boolean
	// example:
	//
	// true, false
	Param3 *bool `json:"param_3,omitempty" xml:"param_3,omitempty" require:"true"`
}

func (s PreTestUse) String() string {
	return tea.Prettify(s)
}

func (s PreTestUse) GoString() string {
	return s.String()
}

func (s *PreTestUse) SetParam1(v string) *PreTestUse {
	s.Param1 = &v
	return s
}

func (s *PreTestUse) SetParam2(v int64) *PreTestUse {
	s.Param2 = &v
	return s
}

func (s *PreTestUse) SetParam3(v bool) *PreTestUse {
	s.Param3 = &v
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

type QueryXxRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 213
	Test *string `json:"test,omitempty" xml:"test,omitempty"`
	// 123
	Idcard *ContentTest `json:"idcard,omitempty" xml:"idcard,omitempty"`
}

func (s QueryXxRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryXxRequest) GoString() string {
	return s.String()
}

func (s *QueryXxRequest) SetAuthToken(v string) *QueryXxRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryXxRequest) SetProductInstanceId(v string) *QueryXxRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryXxRequest) SetTest(v string) *QueryXxRequest {
	s.Test = &v
	return s
}

func (s *QueryXxRequest) SetIdcard(v *ContentTest) *QueryXxRequest {
	s.Idcard = v
	return s
}

type QueryXxResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s QueryXxResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryXxResponse) GoString() string {
	return s.String()
}

func (s *QueryXxResponse) SetReqMsgId(v string) *QueryXxResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryXxResponse) SetResultCode(v string) *QueryXxResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryXxResponse) SetResultMsg(v string) *QueryXxResponse {
	s.ResultMsg = &v
	return s
}

type ResetSsdListRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s ResetSsdListRequest) String() string {
	return tea.Prettify(s)
}

func (s ResetSsdListRequest) GoString() string {
	return s.String()
}

func (s *ResetSsdListRequest) SetAuthToken(v string) *ResetSsdListRequest {
	s.AuthToken = &v
	return s
}

func (s *ResetSsdListRequest) SetProductInstanceId(v string) *ResetSsdListRequest {
	s.ProductInstanceId = &v
	return s
}

type ResetSsdListResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s ResetSsdListResponse) String() string {
	return tea.Prettify(s)
}

func (s ResetSsdListResponse) GoString() string {
	return s.String()
}

func (s *ResetSsdListResponse) SetReqMsgId(v string) *ResetSsdListResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ResetSsdListResponse) SetResultCode(v string) *ResetSsdListResponse {
	s.ResultCode = &v
	return s
}

func (s *ResetSsdListResponse) SetResultMsg(v string) *ResetSsdListResponse {
	s.ResultMsg = &v
	return s
}

type PushTestApiRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 名称
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
}

func (s PushTestApiRequest) String() string {
	return tea.Prettify(s)
}

func (s PushTestApiRequest) GoString() string {
	return s.String()
}

func (s *PushTestApiRequest) SetAuthToken(v string) *PushTestApiRequest {
	s.AuthToken = &v
	return s
}

func (s *PushTestApiRequest) SetProductInstanceId(v string) *PushTestApiRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PushTestApiRequest) SetName(v string) *PushTestApiRequest {
	s.Name = &v
	return s
}

type PushTestApiResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s PushTestApiResponse) String() string {
	return tea.Prettify(s)
}

func (s PushTestApiResponse) GoString() string {
	return s.String()
}

func (s *PushTestApiResponse) SetReqMsgId(v string) *PushTestApiResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PushTestApiResponse) SetResultCode(v string) *PushTestApiResponse {
	s.ResultCode = &v
	return s
}

func (s *PushTestApiResponse) SetResultMsg(v string) *PushTestApiResponse {
	s.ResultMsg = &v
	return s
}

type QueryXtPuRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 名称
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
}

func (s QueryXtPuRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryXtPuRequest) GoString() string {
	return s.String()
}

func (s *QueryXtPuRequest) SetAuthToken(v string) *QueryXtPuRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryXtPuRequest) SetProductInstanceId(v string) *QueryXtPuRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryXtPuRequest) SetName(v string) *QueryXtPuRequest {
	s.Name = &v
	return s
}

type QueryXtPuResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s QueryXtPuResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryXtPuResponse) GoString() string {
	return s.String()
}

func (s *QueryXtPuResponse) SetReqMsgId(v string) *QueryXtPuResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryXtPuResponse) SetResultCode(v string) *QueryXtPuResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryXtPuResponse) SetResultMsg(v string) *QueryXtPuResponse {
	s.ResultMsg = &v
	return s
}

type QueryRtEeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s QueryRtEeRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryRtEeRequest) GoString() string {
	return s.String()
}

func (s *QueryRtEeRequest) SetAuthToken(v string) *QueryRtEeRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryRtEeRequest) SetProductInstanceId(v string) *QueryRtEeRequest {
	s.ProductInstanceId = &v
	return s
}

type QueryRtEeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s QueryRtEeResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryRtEeResponse) GoString() string {
	return s.String()
}

func (s *QueryRtEeResponse) SetReqMsgId(v string) *QueryRtEeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryRtEeResponse) SetResultCode(v string) *QueryRtEeResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryRtEeResponse) SetResultMsg(v string) *QueryRtEeResponse {
	s.ResultMsg = &v
	return s
}

type QueryXxRunRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s QueryXxRunRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryXxRunRequest) GoString() string {
	return s.String()
}

func (s *QueryXxRunRequest) SetAuthToken(v string) *QueryXxRunRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryXxRunRequest) SetProductInstanceId(v string) *QueryXxRunRequest {
	s.ProductInstanceId = &v
	return s
}

type QueryXxRunResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s QueryXxRunResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryXxRunResponse) GoString() string {
	return s.String()
}

func (s *QueryXxRunResponse) SetReqMsgId(v string) *QueryXxRunResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryXxRunResponse) SetResultCode(v string) *QueryXxRunResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryXxRunResponse) SetResultMsg(v string) *QueryXxRunResponse {
	s.ResultMsg = &v
	return s
}

type QueryRtWwRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s QueryRtWwRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryRtWwRequest) GoString() string {
	return s.String()
}

func (s *QueryRtWwRequest) SetAuthToken(v string) *QueryRtWwRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryRtWwRequest) SetProductInstanceId(v string) *QueryRtWwRequest {
	s.ProductInstanceId = &v
	return s
}

type QueryRtWwResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s QueryRtWwResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryRtWwResponse) GoString() string {
	return s.String()
}

func (s *QueryRtWwResponse) SetReqMsgId(v string) *QueryRtWwResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryRtWwResponse) SetResultCode(v string) *QueryRtWwResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryRtWwResponse) SetResultMsg(v string) *QueryRtWwResponse {
	s.ResultMsg = &v
	return s
}

type QueryRoleSfRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s QueryRoleSfRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryRoleSfRequest) GoString() string {
	return s.String()
}

func (s *QueryRoleSfRequest) SetAuthToken(v string) *QueryRoleSfRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryRoleSfRequest) SetProductInstanceId(v string) *QueryRoleSfRequest {
	s.ProductInstanceId = &v
	return s
}

type QueryRoleSfResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s QueryRoleSfResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryRoleSfResponse) GoString() string {
	return s.String()
}

func (s *QueryRoleSfResponse) SetReqMsgId(v string) *QueryRoleSfResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryRoleSfResponse) SetResultCode(v string) *QueryRoleSfResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryRoleSfResponse) SetResultMsg(v string) *QueryRoleSfResponse {
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
	// output_demo测试
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

type QueryGatewayMyRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 字符串类型入参
	Test1 *string `json:"test_1,omitempty" xml:"test_1,omitempty" require:"true"`
	// 数字入参
	Test2 *int64 `json:"test_2,omitempty" xml:"test_2,omitempty" require:"true"`
	// 布尔值入参
	Test3 *bool `json:"test_3,omitempty" xml:"test_3,omitempty" require:"true"`
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

func (s *QueryGatewayMyRequest) SetTest1(v string) *QueryGatewayMyRequest {
	s.Test1 = &v
	return s
}

func (s *QueryGatewayMyRequest) SetTest2(v int64) *QueryGatewayMyRequest {
	s.Test2 = &v
	return s
}

func (s *QueryGatewayMyRequest) SetTest3(v bool) *QueryGatewayMyRequest {
	s.Test3 = &v
	return s
}

type QueryGatewayMyResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// SUCCESS le
	Success *string `json:"success,omitempty" xml:"success,omitempty"`
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

func (s *QueryGatewayMyResponse) SetSuccess(v string) *QueryGatewayMyResponse {
	s.Success = &v
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
	// 1111
	Bnumber *string `json:"bnumber,omitempty" xml:"bnumber,omitempty" require:"true" maxLength:"2" minLength:"1"`
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

func (s *QueryAdAsdAsdRequest) SetBnumber(v string) *QueryAdAsdAsdRequest {
	s.Bnumber = &v
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

type InitGatewayRoadRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 请求编号
	Count *int64 `json:"count,omitempty" xml:"count,omitempty" require:"true" maximum:"5" minimum:"1"`
	// 请求时间
	Time *string `json:"time,omitempty" xml:"time,omitempty" require:"true"`
	// 请求描述
	Desc *string `json:"desc,omitempty" xml:"desc,omitempty" maxLength:"15" minLength:"5"`
	// 操作人
	Operator *string `json:"operator,omitempty" xml:"operator,omitempty" require:"true"`
}

func (s InitGatewayRoadRequest) String() string {
	return tea.Prettify(s)
}

func (s InitGatewayRoadRequest) GoString() string {
	return s.String()
}

func (s *InitGatewayRoadRequest) SetAuthToken(v string) *InitGatewayRoadRequest {
	s.AuthToken = &v
	return s
}

func (s *InitGatewayRoadRequest) SetProductInstanceId(v string) *InitGatewayRoadRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *InitGatewayRoadRequest) SetCount(v int64) *InitGatewayRoadRequest {
	s.Count = &v
	return s
}

func (s *InitGatewayRoadRequest) SetTime(v string) *InitGatewayRoadRequest {
	s.Time = &v
	return s
}

func (s *InitGatewayRoadRequest) SetDesc(v string) *InitGatewayRoadRequest {
	s.Desc = &v
	return s
}

func (s *InitGatewayRoadRequest) SetOperator(v string) *InitGatewayRoadRequest {
	s.Operator = &v
	return s
}

type InitGatewayRoadResponse struct {
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

func (s InitGatewayRoadResponse) String() string {
	return tea.Prettify(s)
}

func (s InitGatewayRoadResponse) GoString() string {
	return s.String()
}

func (s *InitGatewayRoadResponse) SetReqMsgId(v string) *InitGatewayRoadResponse {
	s.ReqMsgId = &v
	return s
}

func (s *InitGatewayRoadResponse) SetResultCode(v string) *InitGatewayRoadResponse {
	s.ResultCode = &v
	return s
}

func (s *InitGatewayRoadResponse) SetResultMsg(v string) *InitGatewayRoadResponse {
	s.ResultMsg = &v
	return s
}

func (s *InitGatewayRoadResponse) SetInitDesc(v string) *InitGatewayRoadResponse {
	s.InitDesc = &v
	return s
}

func (s *InitGatewayRoadResponse) SetInitPack(v *InitPack) *InitGatewayRoadResponse {
	s.InitPack = v
	return s
}

type QueryGatewayEmbedRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 实例参数
	Timeout *string `json:"timeout,omitempty" xml:"timeout,omitempty"`
}

func (s QueryGatewayEmbedRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryGatewayEmbedRequest) GoString() string {
	return s.String()
}

func (s *QueryGatewayEmbedRequest) SetAuthToken(v string) *QueryGatewayEmbedRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryGatewayEmbedRequest) SetProductInstanceId(v string) *QueryGatewayEmbedRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryGatewayEmbedRequest) SetTimeout(v string) *QueryGatewayEmbedRequest {
	s.Timeout = &v
	return s
}

type QueryGatewayEmbedResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s QueryGatewayEmbedResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryGatewayEmbedResponse) GoString() string {
	return s.String()
}

func (s *QueryGatewayEmbedResponse) SetReqMsgId(v string) *QueryGatewayEmbedResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryGatewayEmbedResponse) SetResultCode(v string) *QueryGatewayEmbedResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryGatewayEmbedResponse) SetResultMsg(v string) *QueryGatewayEmbedResponse {
	s.ResultMsg = &v
	return s
}

type UpdateGatewayRoadRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 请求时间
	Time *string `json:"time,omitempty" xml:"time,omitempty" require:"true"`
	// 操作人
	Operator *string `json:"operator,omitempty" xml:"operator,omitempty" require:"true"`
	// 请求编号
	Count *int64 `json:"count,omitempty" xml:"count,omitempty" require:"true"`
	// 原信息
	OriginInfo *string `json:"origin_info,omitempty" xml:"origin_info,omitempty" require:"true"`
}

func (s UpdateGatewayRoadRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateGatewayRoadRequest) GoString() string {
	return s.String()
}

func (s *UpdateGatewayRoadRequest) SetAuthToken(v string) *UpdateGatewayRoadRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateGatewayRoadRequest) SetProductInstanceId(v string) *UpdateGatewayRoadRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateGatewayRoadRequest) SetTime(v string) *UpdateGatewayRoadRequest {
	s.Time = &v
	return s
}

func (s *UpdateGatewayRoadRequest) SetOperator(v string) *UpdateGatewayRoadRequest {
	s.Operator = &v
	return s
}

func (s *UpdateGatewayRoadRequest) SetCount(v int64) *UpdateGatewayRoadRequest {
	s.Count = &v
	return s
}

func (s *UpdateGatewayRoadRequest) SetOriginInfo(v string) *UpdateGatewayRoadRequest {
	s.OriginInfo = &v
	return s
}

type UpdateGatewayRoadResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 更新后返回info
	UpdInfo *string `json:"upd_info,omitempty" xml:"upd_info,omitempty"`
	// 组合返回请求结果
	UpdPack *InitPack `json:"upd_pack,omitempty" xml:"upd_pack,omitempty"`
}

func (s UpdateGatewayRoadResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateGatewayRoadResponse) GoString() string {
	return s.String()
}

func (s *UpdateGatewayRoadResponse) SetReqMsgId(v string) *UpdateGatewayRoadResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateGatewayRoadResponse) SetResultCode(v string) *UpdateGatewayRoadResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateGatewayRoadResponse) SetResultMsg(v string) *UpdateGatewayRoadResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateGatewayRoadResponse) SetUpdInfo(v string) *UpdateGatewayRoadResponse {
	s.UpdInfo = &v
	return s
}

func (s *UpdateGatewayRoadResponse) SetUpdPack(v *InitPack) *UpdateGatewayRoadResponse {
	s.UpdPack = v
	return s
}

type QueryGatewayRoadRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 查询输入
	Data *string `json:"data,omitempty" xml:"data,omitempty" require:"true"`
}

func (s QueryGatewayRoadRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryGatewayRoadRequest) GoString() string {
	return s.String()
}

func (s *QueryGatewayRoadRequest) SetAuthToken(v string) *QueryGatewayRoadRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryGatewayRoadRequest) SetProductInstanceId(v string) *QueryGatewayRoadRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryGatewayRoadRequest) SetData(v string) *QueryGatewayRoadRequest {
	s.Data = &v
	return s
}

type QueryGatewayRoadResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 查询返回
	QueryResult *string `json:"query_result,omitempty" xml:"query_result,omitempty"`
}

func (s QueryGatewayRoadResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryGatewayRoadResponse) GoString() string {
	return s.String()
}

func (s *QueryGatewayRoadResponse) SetReqMsgId(v string) *QueryGatewayRoadResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryGatewayRoadResponse) SetResultCode(v string) *QueryGatewayRoadResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryGatewayRoadResponse) SetResultMsg(v string) *QueryGatewayRoadResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryGatewayRoadResponse) SetQueryResult(v string) *QueryGatewayRoadResponse {
	s.QueryResult = &v
	return s
}

type ExecGatewayRoadRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 计算值输入
	ExecNum *int64 `json:"exec_num,omitempty" xml:"exec_num,omitempty" require:"true"`
}

func (s ExecGatewayRoadRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecGatewayRoadRequest) GoString() string {
	return s.String()
}

func (s *ExecGatewayRoadRequest) SetAuthToken(v string) *ExecGatewayRoadRequest {
	s.AuthToken = &v
	return s
}

func (s *ExecGatewayRoadRequest) SetProductInstanceId(v string) *ExecGatewayRoadRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ExecGatewayRoadRequest) SetExecNum(v int64) *ExecGatewayRoadRequest {
	s.ExecNum = &v
	return s
}

type ExecGatewayRoadResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 计算值返回
	ExecNumEcho *int64 `json:"exec_num_echo,omitempty" xml:"exec_num_echo,omitempty"`
}

func (s ExecGatewayRoadResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecGatewayRoadResponse) GoString() string {
	return s.String()
}

func (s *ExecGatewayRoadResponse) SetReqMsgId(v string) *ExecGatewayRoadResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ExecGatewayRoadResponse) SetResultCode(v string) *ExecGatewayRoadResponse {
	s.ResultCode = &v
	return s
}

func (s *ExecGatewayRoadResponse) SetResultMsg(v string) *ExecGatewayRoadResponse {
	s.ResultMsg = &v
	return s
}

func (s *ExecGatewayRoadResponse) SetExecNumEcho(v int64) *ExecGatewayRoadResponse {
	s.ExecNumEcho = &v
	return s
}

type QueryLoadtestTimeThreeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// ms
	Timeout *string `json:"timeout,omitempty" xml:"timeout,omitempty" require:"true"`
}

func (s QueryLoadtestTimeThreeRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryLoadtestTimeThreeRequest) GoString() string {
	return s.String()
}

func (s *QueryLoadtestTimeThreeRequest) SetAuthToken(v string) *QueryLoadtestTimeThreeRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryLoadtestTimeThreeRequest) SetProductInstanceId(v string) *QueryLoadtestTimeThreeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryLoadtestTimeThreeRequest) SetTimeout(v string) *QueryLoadtestTimeThreeRequest {
	s.Timeout = &v
	return s
}

type QueryLoadtestTimeThreeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 200
	Stauts *string `json:"stauts,omitempty" xml:"stauts,omitempty"`
	// ok
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
}

func (s QueryLoadtestTimeThreeResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryLoadtestTimeThreeResponse) GoString() string {
	return s.String()
}

func (s *QueryLoadtestTimeThreeResponse) SetReqMsgId(v string) *QueryLoadtestTimeThreeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryLoadtestTimeThreeResponse) SetResultCode(v string) *QueryLoadtestTimeThreeResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryLoadtestTimeThreeResponse) SetResultMsg(v string) *QueryLoadtestTimeThreeResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryLoadtestTimeThreeResponse) SetStauts(v string) *QueryLoadtestTimeThreeResponse {
	s.Stauts = &v
	return s
}

func (s *QueryLoadtestTimeThreeResponse) SetMsg(v string) *QueryLoadtestTimeThreeResponse {
	s.Msg = &v
	return s
}

type QueryInstanceidRuleRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 数字
	Count *string `json:"count,omitempty" xml:"count,omitempty" require:"true"`
	// 姓名
	Oprator *string `json:"oprator,omitempty" xml:"oprator,omitempty" require:"true"`
	// 结构体
	Struct *TestA `json:"struct,omitempty" xml:"struct,omitempty" require:"true"`
}

func (s QueryInstanceidRuleRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryInstanceidRuleRequest) GoString() string {
	return s.String()
}

func (s *QueryInstanceidRuleRequest) SetAuthToken(v string) *QueryInstanceidRuleRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryInstanceidRuleRequest) SetProductInstanceId(v string) *QueryInstanceidRuleRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryInstanceidRuleRequest) SetCount(v string) *QueryInstanceidRuleRequest {
	s.Count = &v
	return s
}

func (s *QueryInstanceidRuleRequest) SetOprator(v string) *QueryInstanceidRuleRequest {
	s.Oprator = &v
	return s
}

func (s *QueryInstanceidRuleRequest) SetStruct(v *TestA) *QueryInstanceidRuleRequest {
	s.Struct = v
	return s
}

type QueryInstanceidRuleResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s QueryInstanceidRuleResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryInstanceidRuleResponse) GoString() string {
	return s.String()
}

func (s *QueryInstanceidRuleResponse) SetReqMsgId(v string) *QueryInstanceidRuleResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryInstanceidRuleResponse) SetResultCode(v string) *QueryInstanceidRuleResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryInstanceidRuleResponse) SetResultMsg(v string) *QueryInstanceidRuleResponse {
	s.ResultMsg = &v
	return s
}

type QueryGatewayCheckEchotimeoutokRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 耗时时间
	Timeout *string `json:"timeout,omitempty" xml:"timeout,omitempty" require:"true"`
}

func (s QueryGatewayCheckEchotimeoutokRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryGatewayCheckEchotimeoutokRequest) GoString() string {
	return s.String()
}

func (s *QueryGatewayCheckEchotimeoutokRequest) SetAuthToken(v string) *QueryGatewayCheckEchotimeoutokRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryGatewayCheckEchotimeoutokRequest) SetProductInstanceId(v string) *QueryGatewayCheckEchotimeoutokRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryGatewayCheckEchotimeoutokRequest) SetTimeout(v string) *QueryGatewayCheckEchotimeoutokRequest {
	s.Timeout = &v
	return s
}

type QueryGatewayCheckEchotimeoutokResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回OK
	Stauts *string `json:"stauts,omitempty" xml:"stauts,omitempty"`
	// 结果描述
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
}

func (s QueryGatewayCheckEchotimeoutokResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryGatewayCheckEchotimeoutokResponse) GoString() string {
	return s.String()
}

func (s *QueryGatewayCheckEchotimeoutokResponse) SetReqMsgId(v string) *QueryGatewayCheckEchotimeoutokResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryGatewayCheckEchotimeoutokResponse) SetResultCode(v string) *QueryGatewayCheckEchotimeoutokResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryGatewayCheckEchotimeoutokResponse) SetResultMsg(v string) *QueryGatewayCheckEchotimeoutokResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryGatewayCheckEchotimeoutokResponse) SetStauts(v string) *QueryGatewayCheckEchotimeoutokResponse {
	s.Stauts = &v
	return s
}

func (s *QueryGatewayCheckEchotimeoutokResponse) SetMsg(v string) *QueryGatewayCheckEchotimeoutokResponse {
	s.Msg = &v
	return s
}

type MatchBusinessAndInstanceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// L5
	BusinessCode *string `json:"business_code,omitempty" xml:"business_code,omitempty" require:"true"`
	// 实例
	InstanceCode *string `json:"instance_code,omitempty" xml:"instance_code,omitempty" require:"true"`
}

func (s MatchBusinessAndInstanceRequest) String() string {
	return tea.Prettify(s)
}

func (s MatchBusinessAndInstanceRequest) GoString() string {
	return s.String()
}

func (s *MatchBusinessAndInstanceRequest) SetAuthToken(v string) *MatchBusinessAndInstanceRequest {
	s.AuthToken = &v
	return s
}

func (s *MatchBusinessAndInstanceRequest) SetProductInstanceId(v string) *MatchBusinessAndInstanceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *MatchBusinessAndInstanceRequest) SetBusinessCode(v string) *MatchBusinessAndInstanceRequest {
	s.BusinessCode = &v
	return s
}

func (s *MatchBusinessAndInstanceRequest) SetInstanceCode(v string) *MatchBusinessAndInstanceRequest {
	s.InstanceCode = &v
	return s
}

type MatchBusinessAndInstanceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s MatchBusinessAndInstanceResponse) String() string {
	return tea.Prettify(s)
}

func (s MatchBusinessAndInstanceResponse) GoString() string {
	return s.String()
}

func (s *MatchBusinessAndInstanceResponse) SetReqMsgId(v string) *MatchBusinessAndInstanceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *MatchBusinessAndInstanceResponse) SetResultCode(v string) *MatchBusinessAndInstanceResponse {
	s.ResultCode = &v
	return s
}

func (s *MatchBusinessAndInstanceResponse) SetResultMsg(v string) *MatchBusinessAndInstanceResponse {
	s.ResultMsg = &v
	return s
}

type QueryStreamTestRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
}

func (s QueryStreamTestRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryStreamTestRequest) GoString() string {
	return s.String()
}

func (s *QueryStreamTestRequest) SetAuthToken(v string) *QueryStreamTestRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryStreamTestRequest) SetProductInstanceId(v string) *QueryStreamTestRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryStreamTestRequest) SetName(v string) *QueryStreamTestRequest {
	s.Name = &v
	return s
}

type QueryStreamTestResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s QueryStreamTestResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryStreamTestResponse) GoString() string {
	return s.String()
}

func (s *QueryStreamTestResponse) SetReqMsgId(v string) *QueryStreamTestResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryStreamTestResponse) SetResultCode(v string) *QueryStreamTestResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryStreamTestResponse) SetResultMsg(v string) *QueryStreamTestResponse {
	s.ResultMsg = &v
	return s
}

type QueryTestCatcheLimitRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// abc
	Timeout *string `json:"timeout,omitempty" xml:"timeout,omitempty" require:"true"`
	// 测试
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
}

func (s QueryTestCatcheLimitRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryTestCatcheLimitRequest) GoString() string {
	return s.String()
}

func (s *QueryTestCatcheLimitRequest) SetAuthToken(v string) *QueryTestCatcheLimitRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryTestCatcheLimitRequest) SetProductInstanceId(v string) *QueryTestCatcheLimitRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryTestCatcheLimitRequest) SetTimeout(v string) *QueryTestCatcheLimitRequest {
	s.Timeout = &v
	return s
}

func (s *QueryTestCatcheLimitRequest) SetName(v string) *QueryTestCatcheLimitRequest {
	s.Name = &v
	return s
}

type QueryTestCatcheLimitResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回OK
	Stauts *string `json:"stauts,omitempty" xml:"stauts,omitempty"`
	// 结果描述
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
}

func (s QueryTestCatcheLimitResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryTestCatcheLimitResponse) GoString() string {
	return s.String()
}

func (s *QueryTestCatcheLimitResponse) SetReqMsgId(v string) *QueryTestCatcheLimitResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryTestCatcheLimitResponse) SetResultCode(v string) *QueryTestCatcheLimitResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryTestCatcheLimitResponse) SetResultMsg(v string) *QueryTestCatcheLimitResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryTestCatcheLimitResponse) SetStauts(v string) *QueryTestCatcheLimitResponse {
	s.Stauts = &v
	return s
}

func (s *QueryTestCatcheLimitResponse) SetMsg(v string) *QueryTestCatcheLimitResponse {
	s.Msg = &v
	return s
}

type QueryTestForLimitRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 2
	ExecNum *int64 `json:"exec_num,omitempty" xml:"exec_num,omitempty" require:"true"`
}

func (s QueryTestForLimitRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryTestForLimitRequest) GoString() string {
	return s.String()
}

func (s *QueryTestForLimitRequest) SetAuthToken(v string) *QueryTestForLimitRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryTestForLimitRequest) SetProductInstanceId(v string) *QueryTestForLimitRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryTestForLimitRequest) SetExecNum(v int64) *QueryTestForLimitRequest {
	s.ExecNum = &v
	return s
}

type QueryTestForLimitResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 1
	ExecNumEcho *int64 `json:"exec_num_echo,omitempty" xml:"exec_num_echo,omitempty"`
}

func (s QueryTestForLimitResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryTestForLimitResponse) GoString() string {
	return s.String()
}

func (s *QueryTestForLimitResponse) SetReqMsgId(v string) *QueryTestForLimitResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryTestForLimitResponse) SetResultCode(v string) *QueryTestForLimitResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryTestForLimitResponse) SetResultMsg(v string) *QueryTestForLimitResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryTestForLimitResponse) SetExecNumEcho(v int64) *QueryTestForLimitResponse {
	s.ExecNumEcho = &v
	return s
}

type QueryTestTestTestRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 超时时间
	Timeout *string `json:"timeout,omitempty" xml:"timeout,omitempty" require:"true"`
	// aaa
	// 待上传文件
	FileObject io.Reader `json:"fileObject,omitempty" xml:"fileObject,omitempty"`
	// 待上传文件名
	FileObjectName *string `json:"fileObjectName,omitempty" xml:"fileObjectName,omitempty"`
	FileId         *string `json:"file_id,omitempty" xml:"file_id,omitempty" require:"true"`
}

func (s QueryTestTestTestRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryTestTestTestRequest) GoString() string {
	return s.String()
}

func (s *QueryTestTestTestRequest) SetAuthToken(v string) *QueryTestTestTestRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryTestTestTestRequest) SetProductInstanceId(v string) *QueryTestTestTestRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryTestTestTestRequest) SetTimeout(v string) *QueryTestTestTestRequest {
	s.Timeout = &v
	return s
}

func (s *QueryTestTestTestRequest) SetFileObject(v io.Reader) *QueryTestTestTestRequest {
	s.FileObject = v
	return s
}

func (s *QueryTestTestTestRequest) SetFileObjectName(v string) *QueryTestTestTestRequest {
	s.FileObjectName = &v
	return s
}

func (s *QueryTestTestTestRequest) SetFileId(v string) *QueryTestTestTestRequest {
	s.FileId = &v
	return s
}

type QueryTestTestTestResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 1
	Stauts *string `json:"stauts,omitempty" xml:"stauts,omitempty"`
	// 1
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
}

func (s QueryTestTestTestResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryTestTestTestResponse) GoString() string {
	return s.String()
}

func (s *QueryTestTestTestResponse) SetReqMsgId(v string) *QueryTestTestTestResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryTestTestTestResponse) SetResultCode(v string) *QueryTestTestTestResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryTestTestTestResponse) SetResultMsg(v string) *QueryTestTestTestResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryTestTestTestResponse) SetStauts(v string) *QueryTestTestTestResponse {
	s.Stauts = &v
	return s
}

func (s *QueryTestTestTestResponse) SetMsg(v string) *QueryTestTestTestResponse {
	s.Msg = &v
	return s
}

type QueryABCRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s QueryABCRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryABCRequest) GoString() string {
	return s.String()
}

func (s *QueryABCRequest) SetAuthToken(v string) *QueryABCRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryABCRequest) SetProductInstanceId(v string) *QueryABCRequest {
	s.ProductInstanceId = &v
	return s
}

type QueryABCResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s QueryABCResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryABCResponse) GoString() string {
	return s.String()
}

func (s *QueryABCResponse) SetReqMsgId(v string) *QueryABCResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryABCResponse) SetResultCode(v string) *QueryABCResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryABCResponse) SetResultMsg(v string) *QueryABCResponse {
	s.ResultMsg = &v
	return s
}

type QueryTestEmbedUserRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// test
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
}

func (s QueryTestEmbedUserRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryTestEmbedUserRequest) GoString() string {
	return s.String()
}

func (s *QueryTestEmbedUserRequest) SetAuthToken(v string) *QueryTestEmbedUserRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryTestEmbedUserRequest) SetProductInstanceId(v string) *QueryTestEmbedUserRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryTestEmbedUserRequest) SetUserId(v string) *QueryTestEmbedUserRequest {
	s.UserId = &v
	return s
}

type QueryTestEmbedUserResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// name
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
}

func (s QueryTestEmbedUserResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryTestEmbedUserResponse) GoString() string {
	return s.String()
}

func (s *QueryTestEmbedUserResponse) SetReqMsgId(v string) *QueryTestEmbedUserResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryTestEmbedUserResponse) SetResultCode(v string) *QueryTestEmbedUserResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryTestEmbedUserResponse) SetResultMsg(v string) *QueryTestEmbedUserResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryTestEmbedUserResponse) SetName(v string) *QueryTestEmbedUserResponse {
	s.Name = &v
	return s
}

type QueryAasSaSaRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// aa
	NotBlankVerify *string `json:"not_blank_verify,omitempty" xml:"not_blank_verify,omitempty" require:"true"`
}

func (s QueryAasSaSaRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAasSaSaRequest) GoString() string {
	return s.String()
}

func (s *QueryAasSaSaRequest) SetAuthToken(v string) *QueryAasSaSaRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAasSaSaRequest) SetProductInstanceId(v string) *QueryAasSaSaRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAasSaSaRequest) SetNotBlankVerify(v string) *QueryAasSaSaRequest {
	s.NotBlankVerify = &v
	return s
}

type QueryAasSaSaResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s QueryAasSaSaResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAasSaSaResponse) GoString() string {
	return s.String()
}

func (s *QueryAasSaSaResponse) SetReqMsgId(v string) *QueryAasSaSaResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAasSaSaResponse) SetResultCode(v string) *QueryAasSaSaResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAasSaSaResponse) SetResultMsg(v string) *QueryAasSaSaResponse {
	s.ResultMsg = &v
	return s
}

type QueryApiWhiteListRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 查询输入
	Data *string `json:"data,omitempty" xml:"data,omitempty" require:"true"`
}

func (s QueryApiWhiteListRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryApiWhiteListRequest) GoString() string {
	return s.String()
}

func (s *QueryApiWhiteListRequest) SetAuthToken(v string) *QueryApiWhiteListRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryApiWhiteListRequest) SetProductInstanceId(v string) *QueryApiWhiteListRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryApiWhiteListRequest) SetData(v string) *QueryApiWhiteListRequest {
	s.Data = &v
	return s
}

type QueryApiWhiteListResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 查询返回
	QueryResult *string `json:"query_result,omitempty" xml:"query_result,omitempty"`
}

func (s QueryApiWhiteListResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryApiWhiteListResponse) GoString() string {
	return s.String()
}

func (s *QueryApiWhiteListResponse) SetReqMsgId(v string) *QueryApiWhiteListResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryApiWhiteListResponse) SetResultCode(v string) *QueryApiWhiteListResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryApiWhiteListResponse) SetResultMsg(v string) *QueryApiWhiteListResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryApiWhiteListResponse) SetQueryResult(v string) *QueryApiWhiteListResponse {
	s.QueryResult = &v
	return s
}

type QueryApiBlackListRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 超时时间
	Timeout *string `json:"timeout,omitempty" xml:"timeout,omitempty" require:"true"`
}

func (s QueryApiBlackListRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryApiBlackListRequest) GoString() string {
	return s.String()
}

func (s *QueryApiBlackListRequest) SetAuthToken(v string) *QueryApiBlackListRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryApiBlackListRequest) SetProductInstanceId(v string) *QueryApiBlackListRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryApiBlackListRequest) SetTimeout(v string) *QueryApiBlackListRequest {
	s.Timeout = &v
	return s
}

type QueryApiBlackListResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 200
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// OK
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
}

func (s QueryApiBlackListResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryApiBlackListResponse) GoString() string {
	return s.String()
}

func (s *QueryApiBlackListResponse) SetReqMsgId(v string) *QueryApiBlackListResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryApiBlackListResponse) SetResultCode(v string) *QueryApiBlackListResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryApiBlackListResponse) SetResultMsg(v string) *QueryApiBlackListResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryApiBlackListResponse) SetStatus(v string) *QueryApiBlackListResponse {
	s.Status = &v
	return s
}

func (s *QueryApiBlackListResponse) SetMsg(v string) *QueryApiBlackListResponse {
	s.Msg = &v
	return s
}

type QueryIpWhiteListRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 超时时间
	Timeout *string `json:"timeout,omitempty" xml:"timeout,omitempty" require:"true"`
}

func (s QueryIpWhiteListRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryIpWhiteListRequest) GoString() string {
	return s.String()
}

func (s *QueryIpWhiteListRequest) SetAuthToken(v string) *QueryIpWhiteListRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryIpWhiteListRequest) SetProductInstanceId(v string) *QueryIpWhiteListRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryIpWhiteListRequest) SetTimeout(v string) *QueryIpWhiteListRequest {
	s.Timeout = &v
	return s
}

type QueryIpWhiteListResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// ok
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// SUCCESS
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
}

func (s QueryIpWhiteListResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryIpWhiteListResponse) GoString() string {
	return s.String()
}

func (s *QueryIpWhiteListResponse) SetReqMsgId(v string) *QueryIpWhiteListResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryIpWhiteListResponse) SetResultCode(v string) *QueryIpWhiteListResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryIpWhiteListResponse) SetResultMsg(v string) *QueryIpWhiteListResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryIpWhiteListResponse) SetStatus(v string) *QueryIpWhiteListResponse {
	s.Status = &v
	return s
}

func (s *QueryIpWhiteListResponse) SetMsg(v string) *QueryIpWhiteListResponse {
	s.Msg = &v
	return s
}

type QueryIpBlackListRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 超时时间
	Timeout *string `json:"timeout,omitempty" xml:"timeout,omitempty" require:"true"`
}

func (s QueryIpBlackListRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryIpBlackListRequest) GoString() string {
	return s.String()
}

func (s *QueryIpBlackListRequest) SetAuthToken(v string) *QueryIpBlackListRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryIpBlackListRequest) SetProductInstanceId(v string) *QueryIpBlackListRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryIpBlackListRequest) SetTimeout(v string) *QueryIpBlackListRequest {
	s.Timeout = &v
	return s
}

type QueryIpBlackListResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// OK
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// SUCCESS
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
}

func (s QueryIpBlackListResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryIpBlackListResponse) GoString() string {
	return s.String()
}

func (s *QueryIpBlackListResponse) SetReqMsgId(v string) *QueryIpBlackListResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryIpBlackListResponse) SetResultCode(v string) *QueryIpBlackListResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryIpBlackListResponse) SetResultMsg(v string) *QueryIpBlackListResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryIpBlackListResponse) SetStatus(v string) *QueryIpBlackListResponse {
	s.Status = &v
	return s
}

func (s *QueryIpBlackListResponse) SetMsg(v string) *QueryIpBlackListResponse {
	s.Msg = &v
	return s
}

type QueryIpRetryRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 超时时间
	Timeout *string `json:"timeout,omitempty" xml:"timeout,omitempty" require:"true"`
}

func (s QueryIpRetryRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryIpRetryRequest) GoString() string {
	return s.String()
}

func (s *QueryIpRetryRequest) SetAuthToken(v string) *QueryIpRetryRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryIpRetryRequest) SetProductInstanceId(v string) *QueryIpRetryRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryIpRetryRequest) SetTimeout(v string) *QueryIpRetryRequest {
	s.Timeout = &v
	return s
}

type QueryIpRetryResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// OK
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// SUCCESS
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
}

func (s QueryIpRetryResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryIpRetryResponse) GoString() string {
	return s.String()
}

func (s *QueryIpRetryResponse) SetReqMsgId(v string) *QueryIpRetryResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryIpRetryResponse) SetResultCode(v string) *QueryIpRetryResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryIpRetryResponse) SetResultMsg(v string) *QueryIpRetryResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryIpRetryResponse) SetStatus(v string) *QueryIpRetryResponse {
	s.Status = &v
	return s
}

func (s *QueryIpRetryResponse) SetMsg(v string) *QueryIpRetryResponse {
	s.Msg = &v
	return s
}

type QueryTestTimeTestaRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s QueryTestTimeTestaRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryTestTimeTestaRequest) GoString() string {
	return s.String()
}

func (s *QueryTestTimeTestaRequest) SetAuthToken(v string) *QueryTestTimeTestaRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryTestTimeTestaRequest) SetProductInstanceId(v string) *QueryTestTimeTestaRequest {
	s.ProductInstanceId = &v
	return s
}

type QueryTestTimeTestaResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s QueryTestTimeTestaResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryTestTimeTestaResponse) GoString() string {
	return s.String()
}

func (s *QueryTestTimeTestaResponse) SetReqMsgId(v string) *QueryTestTimeTestaResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryTestTimeTestaResponse) SetResultCode(v string) *QueryTestTimeTestaResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryTestTimeTestaResponse) SetResultMsg(v string) *QueryTestTimeTestaResponse {
	s.ResultMsg = &v
	return s
}

type QueryOasRestRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// id信息
	IdentityId *string `json:"identity_id,omitempty" xml:"identity_id,omitempty" require:"true"`
	// 12
	Idcard *CardInfo `json:"idcard,omitempty" xml:"idcard,omitempty"`
}

func (s QueryOasRestRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryOasRestRequest) GoString() string {
	return s.String()
}

func (s *QueryOasRestRequest) SetAuthToken(v string) *QueryOasRestRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryOasRestRequest) SetProductInstanceId(v string) *QueryOasRestRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryOasRestRequest) SetIdentityId(v string) *QueryOasRestRequest {
	s.IdentityId = &v
	return s
}

func (s *QueryOasRestRequest) SetIdcard(v *CardInfo) *QueryOasRestRequest {
	s.Idcard = v
	return s
}

type QueryOasRestResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 描述信息
	Info *string `json:"info,omitempty" xml:"info,omitempty"`
}

func (s QueryOasRestResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryOasRestResponse) GoString() string {
	return s.String()
}

func (s *QueryOasRestResponse) SetReqMsgId(v string) *QueryOasRestResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryOasRestResponse) SetResultCode(v string) *QueryOasRestResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryOasRestResponse) SetResultMsg(v string) *QueryOasRestResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryOasRestResponse) SetInfo(v string) *QueryOasRestResponse {
	s.Info = &v
	return s
}

type QueryTestContentTypeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 查询输入
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QueryTestContentTypeRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryTestContentTypeRequest) GoString() string {
	return s.String()
}

func (s *QueryTestContentTypeRequest) SetAuthToken(v string) *QueryTestContentTypeRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryTestContentTypeRequest) SetProductInstanceId(v string) *QueryTestContentTypeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryTestContentTypeRequest) SetData(v string) *QueryTestContentTypeRequest {
	s.Data = &v
	return s
}

type QueryTestContentTypeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 状态码
	Statucode *string `json:"statucode,omitempty" xml:"statucode,omitempty"`
	// 查询返回结果
	QueryResult *string `json:"query_result,omitempty" xml:"query_result,omitempty"`
}

func (s QueryTestContentTypeResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryTestContentTypeResponse) GoString() string {
	return s.String()
}

func (s *QueryTestContentTypeResponse) SetReqMsgId(v string) *QueryTestContentTypeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryTestContentTypeResponse) SetResultCode(v string) *QueryTestContentTypeResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryTestContentTypeResponse) SetResultMsg(v string) *QueryTestContentTypeResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryTestContentTypeResponse) SetStatucode(v string) *QueryTestContentTypeResponse {
	s.Statucode = &v
	return s
}

func (s *QueryTestContentTypeResponse) SetQueryResult(v string) *QueryTestContentTypeResponse {
	s.QueryResult = &v
	return s
}

type QueryTestContentTypeoneRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 查询输入
	Data *string `json:"data,omitempty" xml:"data,omitempty" require:"true"`
	// 测试
	Person *Person `json:"person,omitempty" xml:"person,omitempty"`
}

func (s QueryTestContentTypeoneRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryTestContentTypeoneRequest) GoString() string {
	return s.String()
}

func (s *QueryTestContentTypeoneRequest) SetAuthToken(v string) *QueryTestContentTypeoneRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryTestContentTypeoneRequest) SetProductInstanceId(v string) *QueryTestContentTypeoneRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryTestContentTypeoneRequest) SetData(v string) *QueryTestContentTypeoneRequest {
	s.Data = &v
	return s
}

func (s *QueryTestContentTypeoneRequest) SetPerson(v *Person) *QueryTestContentTypeoneRequest {
	s.Person = v
	return s
}

type QueryTestContentTypeoneResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 查询结果
	QueryResult *string `json:"query_result,omitempty" xml:"query_result,omitempty"`
	// 结果码
	Statucode *string `json:"statucode,omitempty" xml:"statucode,omitempty"`
}

func (s QueryTestContentTypeoneResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryTestContentTypeoneResponse) GoString() string {
	return s.String()
}

func (s *QueryTestContentTypeoneResponse) SetReqMsgId(v string) *QueryTestContentTypeoneResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryTestContentTypeoneResponse) SetResultCode(v string) *QueryTestContentTypeoneResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryTestContentTypeoneResponse) SetResultMsg(v string) *QueryTestContentTypeoneResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryTestContentTypeoneResponse) SetQueryResult(v string) *QueryTestContentTypeoneResponse {
	s.QueryResult = &v
	return s
}

func (s *QueryTestContentTypeoneResponse) SetStatucode(v string) *QueryTestContentTypeoneResponse {
	s.Statucode = &v
	return s
}

type QueryTestContentTypetwoRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 查询输入
	Data *string `json:"data,omitempty" xml:"data,omitempty" require:"true"`
	// 测试
	Idcard *CardInfo `json:"idcard,omitempty" xml:"idcard,omitempty"`
}

func (s QueryTestContentTypetwoRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryTestContentTypetwoRequest) GoString() string {
	return s.String()
}

func (s *QueryTestContentTypetwoRequest) SetAuthToken(v string) *QueryTestContentTypetwoRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryTestContentTypetwoRequest) SetProductInstanceId(v string) *QueryTestContentTypetwoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryTestContentTypetwoRequest) SetData(v string) *QueryTestContentTypetwoRequest {
	s.Data = &v
	return s
}

func (s *QueryTestContentTypetwoRequest) SetIdcard(v *CardInfo) *QueryTestContentTypetwoRequest {
	s.Idcard = v
	return s
}

type QueryTestContentTypetwoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 查询返回结果
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
	// 状态码
	Statucode *string `json:"statucode,omitempty" xml:"statucode,omitempty"`
}

func (s QueryTestContentTypetwoResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryTestContentTypetwoResponse) GoString() string {
	return s.String()
}

func (s *QueryTestContentTypetwoResponse) SetReqMsgId(v string) *QueryTestContentTypetwoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryTestContentTypetwoResponse) SetResultCode(v string) *QueryTestContentTypetwoResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryTestContentTypetwoResponse) SetResultMsg(v string) *QueryTestContentTypetwoResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryTestContentTypetwoResponse) SetData(v string) *QueryTestContentTypetwoResponse {
	s.Data = &v
	return s
}

func (s *QueryTestContentTypetwoResponse) SetStatucode(v string) *QueryTestContentTypetwoResponse {
	s.Statucode = &v
	return s
}

type QueryTestContentTypethreeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 查询输入
	Data *string `json:"data,omitempty" xml:"data,omitempty" require:"true"`
}

func (s QueryTestContentTypethreeRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryTestContentTypethreeRequest) GoString() string {
	return s.String()
}

func (s *QueryTestContentTypethreeRequest) SetAuthToken(v string) *QueryTestContentTypethreeRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryTestContentTypethreeRequest) SetProductInstanceId(v string) *QueryTestContentTypethreeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryTestContentTypethreeRequest) SetData(v string) *QueryTestContentTypethreeRequest {
	s.Data = &v
	return s
}

type QueryTestContentTypethreeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 查询返回结果
	QueryResult *string `json:"query_result,omitempty" xml:"query_result,omitempty"`
	// 结果码
	Statucode *string `json:"statucode,omitempty" xml:"statucode,omitempty"`
}

func (s QueryTestContentTypethreeResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryTestContentTypethreeResponse) GoString() string {
	return s.String()
}

func (s *QueryTestContentTypethreeResponse) SetReqMsgId(v string) *QueryTestContentTypethreeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryTestContentTypethreeResponse) SetResultCode(v string) *QueryTestContentTypethreeResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryTestContentTypethreeResponse) SetResultMsg(v string) *QueryTestContentTypethreeResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryTestContentTypethreeResponse) SetQueryResult(v string) *QueryTestContentTypethreeResponse {
	s.QueryResult = &v
	return s
}

func (s *QueryTestContentTypethreeResponse) SetStatucode(v string) *QueryTestContentTypethreeResponse {
	s.Statucode = &v
	return s
}

type QueryTestContentTypefourRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 查询输入
	Data *string `json:"data,omitempty" xml:"data,omitempty" require:"true"`
}

func (s QueryTestContentTypefourRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryTestContentTypefourRequest) GoString() string {
	return s.String()
}

func (s *QueryTestContentTypefourRequest) SetAuthToken(v string) *QueryTestContentTypefourRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryTestContentTypefourRequest) SetProductInstanceId(v string) *QueryTestContentTypefourRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryTestContentTypefourRequest) SetData(v string) *QueryTestContentTypefourRequest {
	s.Data = &v
	return s
}

type QueryTestContentTypefourResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 查询返回结果
	QueryResult *string `json:"query_result,omitempty" xml:"query_result,omitempty"`
	// 结果码
	Statucode *string `json:"statucode,omitempty" xml:"statucode,omitempty"`
}

func (s QueryTestContentTypefourResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryTestContentTypefourResponse) GoString() string {
	return s.String()
}

func (s *QueryTestContentTypefourResponse) SetReqMsgId(v string) *QueryTestContentTypefourResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryTestContentTypefourResponse) SetResultCode(v string) *QueryTestContentTypefourResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryTestContentTypefourResponse) SetResultMsg(v string) *QueryTestContentTypefourResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryTestContentTypefourResponse) SetQueryResult(v string) *QueryTestContentTypefourResponse {
	s.QueryResult = &v
	return s
}

func (s *QueryTestContentTypefourResponse) SetStatucode(v string) *QueryTestContentTypefourResponse {
	s.Statucode = &v
	return s
}

type QueryTestContentTypefiveRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 查询入参
	Data *string `json:"data,omitempty" xml:"data,omitempty" require:"true"`
}

func (s QueryTestContentTypefiveRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryTestContentTypefiveRequest) GoString() string {
	return s.String()
}

func (s *QueryTestContentTypefiveRequest) SetAuthToken(v string) *QueryTestContentTypefiveRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryTestContentTypefiveRequest) SetProductInstanceId(v string) *QueryTestContentTypefiveRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryTestContentTypefiveRequest) SetData(v string) *QueryTestContentTypefiveRequest {
	s.Data = &v
	return s
}

type QueryTestContentTypefiveResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 结果码
	Statucode *string `json:"statucode,omitempty" xml:"statucode,omitempty"`
	// 查询结果
	QueryResult *string `json:"query_result,omitempty" xml:"query_result,omitempty"`
}

func (s QueryTestContentTypefiveResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryTestContentTypefiveResponse) GoString() string {
	return s.String()
}

func (s *QueryTestContentTypefiveResponse) SetReqMsgId(v string) *QueryTestContentTypefiveResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryTestContentTypefiveResponse) SetResultCode(v string) *QueryTestContentTypefiveResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryTestContentTypefiveResponse) SetResultMsg(v string) *QueryTestContentTypefiveResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryTestContentTypefiveResponse) SetStatucode(v string) *QueryTestContentTypefiveResponse {
	s.Statucode = &v
	return s
}

func (s *QueryTestContentTypefiveResponse) SetQueryResult(v string) *QueryTestContentTypefiveResponse {
	s.QueryResult = &v
	return s
}

type QueryAgentFinancialRiskRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 用户基础信息
	UserProfile *UserProfile `json:"user_profile,omitempty" xml:"user_profile,omitempty"`
	// 交易明细信息
	TransactionDetails *TransactionDetails `json:"transaction_details,omitempty" xml:"transaction_details,omitempty"`
	// 风险评估因子列表
	RiskFactors []*RiskFactorDetail `json:"risk_factors,omitempty" xml:"risk_factors,omitempty" type:"Repeated"`
	// 业务上下文信息
	BusinessContext *NameValuePair `json:"business_context,omitempty" xml:"business_context,omitempty"`
	// 风险等级标识（LOW/MEDIUM/HIGH/URGENT）
	RiskLevel *string `json:"risk_level,omitempty" xml:"risk_level,omitempty"`
	// 接口超时时间（毫秒）
	Timeout *int64 `json:"timeout,omitempty" xml:"timeout,omitempty" maximum:"60000" minimum:"0"`
}

func (s QueryAgentFinancialRiskRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAgentFinancialRiskRequest) GoString() string {
	return s.String()
}

func (s *QueryAgentFinancialRiskRequest) SetAuthToken(v string) *QueryAgentFinancialRiskRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAgentFinancialRiskRequest) SetProductInstanceId(v string) *QueryAgentFinancialRiskRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAgentFinancialRiskRequest) SetUserProfile(v *UserProfile) *QueryAgentFinancialRiskRequest {
	s.UserProfile = v
	return s
}

func (s *QueryAgentFinancialRiskRequest) SetTransactionDetails(v *TransactionDetails) *QueryAgentFinancialRiskRequest {
	s.TransactionDetails = v
	return s
}

func (s *QueryAgentFinancialRiskRequest) SetRiskFactors(v []*RiskFactorDetail) *QueryAgentFinancialRiskRequest {
	s.RiskFactors = v
	return s
}

func (s *QueryAgentFinancialRiskRequest) SetBusinessContext(v *NameValuePair) *QueryAgentFinancialRiskRequest {
	s.BusinessContext = v
	return s
}

func (s *QueryAgentFinancialRiskRequest) SetRiskLevel(v string) *QueryAgentFinancialRiskRequest {
	s.RiskLevel = &v
	return s
}

func (s *QueryAgentFinancialRiskRequest) SetTimeout(v int64) *QueryAgentFinancialRiskRequest {
	s.Timeout = &v
	return s
}

type QueryAgentFinancialRiskResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 风险等级
	RiskLevel *string `json:"risk_level,omitempty" xml:"risk_level,omitempty"`
	// 风险建议动作
	SuggestedAction *string `json:"suggested_action,omitempty" xml:"suggested_action,omitempty"`
	// 风险分
	RiskScore *int64 `json:"risk_score,omitempty" xml:"risk_score,omitempty"`
	// 风险因子列表
	Riskfactors *RiskFactorDetail `json:"riskfactors,omitempty" xml:"riskfactors,omitempty"`
	// 处置建议
	Recommendations *string `json:"recommendations,omitempty" xml:"recommendations,omitempty"`
}

func (s QueryAgentFinancialRiskResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAgentFinancialRiskResponse) GoString() string {
	return s.String()
}

func (s *QueryAgentFinancialRiskResponse) SetReqMsgId(v string) *QueryAgentFinancialRiskResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAgentFinancialRiskResponse) SetResultCode(v string) *QueryAgentFinancialRiskResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAgentFinancialRiskResponse) SetResultMsg(v string) *QueryAgentFinancialRiskResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAgentFinancialRiskResponse) SetRiskLevel(v string) *QueryAgentFinancialRiskResponse {
	s.RiskLevel = &v
	return s
}

func (s *QueryAgentFinancialRiskResponse) SetSuggestedAction(v string) *QueryAgentFinancialRiskResponse {
	s.SuggestedAction = &v
	return s
}

func (s *QueryAgentFinancialRiskResponse) SetRiskScore(v int64) *QueryAgentFinancialRiskResponse {
	s.RiskScore = &v
	return s
}

func (s *QueryAgentFinancialRiskResponse) SetRiskfactors(v *RiskFactorDetail) *QueryAgentFinancialRiskResponse {
	s.Riskfactors = v
	return s
}

func (s *QueryAgentFinancialRiskResponse) SetRecommendations(v string) *QueryAgentFinancialRiskResponse {
	s.Recommendations = &v
	return s
}

type UploadAutoTestFileRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// fileId
	// 待上传文件
	FileObject io.Reader `json:"fileObject,omitempty" xml:"fileObject,omitempty"`
	// 待上传文件名
	FileObjectName *string `json:"fileObjectName,omitempty" xml:"fileObjectName,omitempty"`
	FileId         *string `json:"file_id,omitempty" xml:"file_id,omitempty" require:"true"`
	// 超时时间
	Timeout *string `json:"timeout,omitempty" xml:"timeout,omitempty" require:"true"`
}

func (s UploadAutoTestFileRequest) String() string {
	return tea.Prettify(s)
}

func (s UploadAutoTestFileRequest) GoString() string {
	return s.String()
}

func (s *UploadAutoTestFileRequest) SetAuthToken(v string) *UploadAutoTestFileRequest {
	s.AuthToken = &v
	return s
}

func (s *UploadAutoTestFileRequest) SetProductInstanceId(v string) *UploadAutoTestFileRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UploadAutoTestFileRequest) SetFileObject(v io.Reader) *UploadAutoTestFileRequest {
	s.FileObject = v
	return s
}

func (s *UploadAutoTestFileRequest) SetFileObjectName(v string) *UploadAutoTestFileRequest {
	s.FileObjectName = &v
	return s
}

func (s *UploadAutoTestFileRequest) SetFileId(v string) *UploadAutoTestFileRequest {
	s.FileId = &v
	return s
}

func (s *UploadAutoTestFileRequest) SetTimeout(v string) *UploadAutoTestFileRequest {
	s.Timeout = &v
	return s
}

type UploadAutoTestFileResponse struct {
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

func (s UploadAutoTestFileResponse) String() string {
	return tea.Prettify(s)
}

func (s UploadAutoTestFileResponse) GoString() string {
	return s.String()
}

func (s *UploadAutoTestFileResponse) SetReqMsgId(v string) *UploadAutoTestFileResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UploadAutoTestFileResponse) SetResultCode(v string) *UploadAutoTestFileResponse {
	s.ResultCode = &v
	return s
}

func (s *UploadAutoTestFileResponse) SetResultMsg(v string) *UploadAutoTestFileResponse {
	s.ResultMsg = &v
	return s
}

func (s *UploadAutoTestFileResponse) SetStatus(v string) *UploadAutoTestFileResponse {
	s.Status = &v
	return s
}

func (s *UploadAutoTestFileResponse) SetMsg(v string) *UploadAutoTestFileResponse {
	s.Msg = &v
	return s
}

type SdfdSfdSfRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s SdfdSfdSfRequest) String() string {
	return tea.Prettify(s)
}

func (s SdfdSfdSfRequest) GoString() string {
	return s.String()
}

func (s *SdfdSfdSfRequest) SetAuthToken(v string) *SdfdSfdSfRequest {
	s.AuthToken = &v
	return s
}

func (s *SdfdSfdSfRequest) SetProductInstanceId(v string) *SdfdSfdSfRequest {
	s.ProductInstanceId = &v
	return s
}

type SdfdSfdSfResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s SdfdSfdSfResponse) String() string {
	return tea.Prettify(s)
}

func (s SdfdSfdSfResponse) GoString() string {
	return s.String()
}

func (s *SdfdSfdSfResponse) SetReqMsgId(v string) *SdfdSfdSfResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SdfdSfdSfResponse) SetResultCode(v string) *SdfdSfdSfResponse {
	s.ResultCode = &v
	return s
}

func (s *SdfdSfdSfResponse) SetResultMsg(v string) *SdfdSfdSfResponse {
	s.ResultMsg = &v
	return s
}

type PushXxTttRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s PushXxTttRequest) String() string {
	return tea.Prettify(s)
}

func (s PushXxTttRequest) GoString() string {
	return s.String()
}

func (s *PushXxTttRequest) SetAuthToken(v string) *PushXxTttRequest {
	s.AuthToken = &v
	return s
}

func (s *PushXxTttRequest) SetProductInstanceId(v string) *PushXxTttRequest {
	s.ProductInstanceId = &v
	return s
}

type PushXxTttResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s PushXxTttResponse) String() string {
	return tea.Prettify(s)
}

func (s PushXxTttResponse) GoString() string {
	return s.String()
}

func (s *PushXxTttResponse) SetReqMsgId(v string) *PushXxTttResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PushXxTttResponse) SetResultCode(v string) *PushXxTttResponse {
	s.ResultCode = &v
	return s
}

func (s *PushXxTttResponse) SetResultMsg(v string) *PushXxTttResponse {
	s.ResultMsg = &v
	return s
}

type QueryCimTestRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s QueryCimTestRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryCimTestRequest) GoString() string {
	return s.String()
}

func (s *QueryCimTestRequest) SetAuthToken(v string) *QueryCimTestRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryCimTestRequest) SetProductInstanceId(v string) *QueryCimTestRequest {
	s.ProductInstanceId = &v
	return s
}

type QueryCimTestResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 号码
	No *string `json:"no,omitempty" xml:"no,omitempty"`
}

func (s QueryCimTestResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryCimTestResponse) GoString() string {
	return s.String()
}

func (s *QueryCimTestResponse) SetReqMsgId(v string) *QueryCimTestResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryCimTestResponse) SetResultCode(v string) *QueryCimTestResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryCimTestResponse) SetResultMsg(v string) *QueryCimTestResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryCimTestResponse) SetNo(v string) *QueryCimTestResponse {
	s.No = &v
	return s
}

type QueryAaaMultiCccRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 12
	Idcard *CardInfo `json:"idcard,omitempty" xml:"idcard,omitempty"`
	// 1
	Test *string `json:"test,omitempty" xml:"test,omitempty"`
	// 123456
	DemoInfo *DemoInfo `json:"demo_info,omitempty" xml:"demo_info,omitempty"`
}

func (s QueryAaaMultiCccRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAaaMultiCccRequest) GoString() string {
	return s.String()
}

func (s *QueryAaaMultiCccRequest) SetAuthToken(v string) *QueryAaaMultiCccRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAaaMultiCccRequest) SetProductInstanceId(v string) *QueryAaaMultiCccRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAaaMultiCccRequest) SetIdcard(v *CardInfo) *QueryAaaMultiCccRequest {
	s.Idcard = v
	return s
}

func (s *QueryAaaMultiCccRequest) SetTest(v string) *QueryAaaMultiCccRequest {
	s.Test = &v
	return s
}

func (s *QueryAaaMultiCccRequest) SetDemoInfo(v *DemoInfo) *QueryAaaMultiCccRequest {
	s.DemoInfo = v
	return s
}

type QueryAaaMultiCccResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s QueryAaaMultiCccResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAaaMultiCccResponse) GoString() string {
	return s.String()
}

func (s *QueryAaaMultiCccResponse) SetReqMsgId(v string) *QueryAaaMultiCccResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAaaMultiCccResponse) SetResultCode(v string) *QueryAaaMultiCccResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAaaMultiCccResponse) SetResultMsg(v string) *QueryAaaMultiCccResponse {
	s.ResultMsg = &v
	return s
}

type QueryStreamTestmethodRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
}

func (s QueryStreamTestmethodRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryStreamTestmethodRequest) GoString() string {
	return s.String()
}

func (s *QueryStreamTestmethodRequest) SetAuthToken(v string) *QueryStreamTestmethodRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryStreamTestmethodRequest) SetProductInstanceId(v string) *QueryStreamTestmethodRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryStreamTestmethodRequest) SetName(v string) *QueryStreamTestmethodRequest {
	s.Name = &v
	return s
}

type QueryStreamTestmethodResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s QueryStreamTestmethodResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryStreamTestmethodResponse) GoString() string {
	return s.String()
}

func (s *QueryStreamTestmethodResponse) SetReqMsgId(v string) *QueryStreamTestmethodResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryStreamTestmethodResponse) SetResultCode(v string) *QueryStreamTestmethodResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryStreamTestmethodResponse) SetResultMsg(v string) *QueryStreamTestmethodResponse {
	s.ResultMsg = &v
	return s
}

type QueryStreamTimeoutRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// name
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
}

func (s QueryStreamTimeoutRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryStreamTimeoutRequest) GoString() string {
	return s.String()
}

func (s *QueryStreamTimeoutRequest) SetAuthToken(v string) *QueryStreamTimeoutRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryStreamTimeoutRequest) SetProductInstanceId(v string) *QueryStreamTimeoutRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryStreamTimeoutRequest) SetName(v string) *QueryStreamTimeoutRequest {
	s.Name = &v
	return s
}

type QueryStreamTimeoutResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s QueryStreamTimeoutResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryStreamTimeoutResponse) GoString() string {
	return s.String()
}

func (s *QueryStreamTimeoutResponse) SetReqMsgId(v string) *QueryStreamTimeoutResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryStreamTimeoutResponse) SetResultCode(v string) *QueryStreamTimeoutResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryStreamTimeoutResponse) SetResultMsg(v string) *QueryStreamTimeoutResponse {
	s.ResultMsg = &v
	return s
}

type QueryStreamNonjsonRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// name
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
}

func (s QueryStreamNonjsonRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryStreamNonjsonRequest) GoString() string {
	return s.String()
}

func (s *QueryStreamNonjsonRequest) SetAuthToken(v string) *QueryStreamNonjsonRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryStreamNonjsonRequest) SetProductInstanceId(v string) *QueryStreamNonjsonRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryStreamNonjsonRequest) SetName(v string) *QueryStreamNonjsonRequest {
	s.Name = &v
	return s
}

type QueryStreamNonjsonResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s QueryStreamNonjsonResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryStreamNonjsonResponse) GoString() string {
	return s.String()
}

func (s *QueryStreamNonjsonResponse) SetReqMsgId(v string) *QueryStreamNonjsonResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryStreamNonjsonResponse) SetResultCode(v string) *QueryStreamNonjsonResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryStreamNonjsonResponse) SetResultMsg(v string) *QueryStreamNonjsonResponse {
	s.ResultMsg = &v
	return s
}

type QueryStreamSpecialCharactersRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// name
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
}

func (s QueryStreamSpecialCharactersRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryStreamSpecialCharactersRequest) GoString() string {
	return s.String()
}

func (s *QueryStreamSpecialCharactersRequest) SetAuthToken(v string) *QueryStreamSpecialCharactersRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryStreamSpecialCharactersRequest) SetProductInstanceId(v string) *QueryStreamSpecialCharactersRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryStreamSpecialCharactersRequest) SetName(v string) *QueryStreamSpecialCharactersRequest {
	s.Name = &v
	return s
}

type QueryStreamSpecialCharactersResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s QueryStreamSpecialCharactersResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryStreamSpecialCharactersResponse) GoString() string {
	return s.String()
}

func (s *QueryStreamSpecialCharactersResponse) SetReqMsgId(v string) *QueryStreamSpecialCharactersResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryStreamSpecialCharactersResponse) SetResultCode(v string) *QueryStreamSpecialCharactersResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryStreamSpecialCharactersResponse) SetResultMsg(v string) *QueryStreamSpecialCharactersResponse {
	s.ResultMsg = &v
	return s
}

type QueryStreamNonstreamRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// name
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
}

func (s QueryStreamNonstreamRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryStreamNonstreamRequest) GoString() string {
	return s.String()
}

func (s *QueryStreamNonstreamRequest) SetAuthToken(v string) *QueryStreamNonstreamRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryStreamNonstreamRequest) SetProductInstanceId(v string) *QueryStreamNonstreamRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryStreamNonstreamRequest) SetName(v string) *QueryStreamNonstreamRequest {
	s.Name = &v
	return s
}

type QueryStreamNonstreamResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s QueryStreamNonstreamResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryStreamNonstreamResponse) GoString() string {
	return s.String()
}

func (s *QueryStreamNonstreamResponse) SetReqMsgId(v string) *QueryStreamNonstreamResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryStreamNonstreamResponse) SetResultCode(v string) *QueryStreamNonstreamResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryStreamNonstreamResponse) SetResultMsg(v string) *QueryStreamNonstreamResponse {
	s.ResultMsg = &v
	return s
}

type QueryLoadtestTimeOneRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 毫秒值
	Timeout *string `json:"timeout,omitempty" xml:"timeout,omitempty" require:"true"`
}

func (s QueryLoadtestTimeOneRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryLoadtestTimeOneRequest) GoString() string {
	return s.String()
}

func (s *QueryLoadtestTimeOneRequest) SetAuthToken(v string) *QueryLoadtestTimeOneRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryLoadtestTimeOneRequest) SetProductInstanceId(v string) *QueryLoadtestTimeOneRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryLoadtestTimeOneRequest) SetTimeout(v string) *QueryLoadtestTimeOneRequest {
	s.Timeout = &v
	return s
}

type QueryLoadtestTimeOneResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 200
	Stauts *string `json:"stauts,omitempty" xml:"stauts,omitempty"`
	// ok
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
}

func (s QueryLoadtestTimeOneResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryLoadtestTimeOneResponse) GoString() string {
	return s.String()
}

func (s *QueryLoadtestTimeOneResponse) SetReqMsgId(v string) *QueryLoadtestTimeOneResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryLoadtestTimeOneResponse) SetResultCode(v string) *QueryLoadtestTimeOneResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryLoadtestTimeOneResponse) SetResultMsg(v string) *QueryLoadtestTimeOneResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryLoadtestTimeOneResponse) SetStauts(v string) *QueryLoadtestTimeOneResponse {
	s.Stauts = &v
	return s
}

func (s *QueryLoadtestTimeOneResponse) SetMsg(v string) *QueryLoadtestTimeOneResponse {
	s.Msg = &v
	return s
}

type QueryLoadtestTimeTwoRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 毫秒
	Timeout *string `json:"timeout,omitempty" xml:"timeout,omitempty" require:"true"`
}

func (s QueryLoadtestTimeTwoRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryLoadtestTimeTwoRequest) GoString() string {
	return s.String()
}

func (s *QueryLoadtestTimeTwoRequest) SetAuthToken(v string) *QueryLoadtestTimeTwoRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryLoadtestTimeTwoRequest) SetProductInstanceId(v string) *QueryLoadtestTimeTwoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryLoadtestTimeTwoRequest) SetTimeout(v string) *QueryLoadtestTimeTwoRequest {
	s.Timeout = &v
	return s
}

type QueryLoadtestTimeTwoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 200
	Stauts *string `json:"stauts,omitempty" xml:"stauts,omitempty"`
	// ok
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
}

func (s QueryLoadtestTimeTwoResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryLoadtestTimeTwoResponse) GoString() string {
	return s.String()
}

func (s *QueryLoadtestTimeTwoResponse) SetReqMsgId(v string) *QueryLoadtestTimeTwoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryLoadtestTimeTwoResponse) SetResultCode(v string) *QueryLoadtestTimeTwoResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryLoadtestTimeTwoResponse) SetResultMsg(v string) *QueryLoadtestTimeTwoResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryLoadtestTimeTwoResponse) SetStauts(v string) *QueryLoadtestTimeTwoResponse {
	s.Stauts = &v
	return s
}

func (s *QueryLoadtestTimeTwoResponse) SetMsg(v string) *QueryLoadtestTimeTwoResponse {
	s.Msg = &v
	return s
}

type QueryLoadtestTimeFourRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 毫秒值
	Timeout *string `json:"timeout,omitempty" xml:"timeout,omitempty" require:"true"`
}

func (s QueryLoadtestTimeFourRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryLoadtestTimeFourRequest) GoString() string {
	return s.String()
}

func (s *QueryLoadtestTimeFourRequest) SetAuthToken(v string) *QueryLoadtestTimeFourRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryLoadtestTimeFourRequest) SetProductInstanceId(v string) *QueryLoadtestTimeFourRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryLoadtestTimeFourRequest) SetTimeout(v string) *QueryLoadtestTimeFourRequest {
	s.Timeout = &v
	return s
}

type QueryLoadtestTimeFourResponse struct {
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

func (s QueryLoadtestTimeFourResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryLoadtestTimeFourResponse) GoString() string {
	return s.String()
}

func (s *QueryLoadtestTimeFourResponse) SetReqMsgId(v string) *QueryLoadtestTimeFourResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryLoadtestTimeFourResponse) SetResultCode(v string) *QueryLoadtestTimeFourResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryLoadtestTimeFourResponse) SetResultMsg(v string) *QueryLoadtestTimeFourResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryLoadtestTimeFourResponse) SetStauts(v string) *QueryLoadtestTimeFourResponse {
	s.Stauts = &v
	return s
}

func (s *QueryLoadtestTimeFourResponse) SetMsg(v string) *QueryLoadtestTimeFourResponse {
	s.Msg = &v
	return s
}

type QueryLoadtestTimeFiveRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 超时时间
	Timeout *string `json:"timeout,omitempty" xml:"timeout,omitempty" require:"true"`
	// 2
	Idcard *CardInfo `json:"idcard,omitempty" xml:"idcard,omitempty"`
}

func (s QueryLoadtestTimeFiveRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryLoadtestTimeFiveRequest) GoString() string {
	return s.String()
}

func (s *QueryLoadtestTimeFiveRequest) SetAuthToken(v string) *QueryLoadtestTimeFiveRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryLoadtestTimeFiveRequest) SetProductInstanceId(v string) *QueryLoadtestTimeFiveRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryLoadtestTimeFiveRequest) SetTimeout(v string) *QueryLoadtestTimeFiveRequest {
	s.Timeout = &v
	return s
}

func (s *QueryLoadtestTimeFiveRequest) SetIdcard(v *CardInfo) *QueryLoadtestTimeFiveRequest {
	s.Idcard = v
	return s
}

type QueryLoadtestTimeFiveResponse struct {
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

func (s QueryLoadtestTimeFiveResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryLoadtestTimeFiveResponse) GoString() string {
	return s.String()
}

func (s *QueryLoadtestTimeFiveResponse) SetReqMsgId(v string) *QueryLoadtestTimeFiveResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryLoadtestTimeFiveResponse) SetResultCode(v string) *QueryLoadtestTimeFiveResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryLoadtestTimeFiveResponse) SetResultMsg(v string) *QueryLoadtestTimeFiveResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryLoadtestTimeFiveResponse) SetStauts(v string) *QueryLoadtestTimeFiveResponse {
	s.Stauts = &v
	return s
}

func (s *QueryLoadtestTimeFiveResponse) SetMsg(v string) *QueryLoadtestTimeFiveResponse {
	s.Msg = &v
	return s
}

type QueryAcopmAtoWithholdRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单id 长度不可超过50
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
}

func (s QueryAcopmAtoWithholdRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAcopmAtoWithholdRequest) GoString() string {
	return s.String()
}

func (s *QueryAcopmAtoWithholdRequest) SetAuthToken(v string) *QueryAcopmAtoWithholdRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAcopmAtoWithholdRequest) SetProductInstanceId(v string) *QueryAcopmAtoWithholdRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAcopmAtoWithholdRequest) SetOrderId(v string) *QueryAcopmAtoWithholdRequest {
	s.OrderId = &v
	return s
}

type QueryAcopmAtoWithholdResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 协议生效时间
	ValidTime *string `json:"valid_time,omitempty" xml:"valid_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 协议当前状态 1. UNSIGNED：未签约 2. SIG...
	//
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 协议失效时间
	InvalidTime *string `json:"invalid_time,omitempty" xml:"invalid_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 协议签署时间
	SignTime *string `json:"sign_time,omitempty" xml:"sign_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
}

func (s QueryAcopmAtoWithholdResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAcopmAtoWithholdResponse) GoString() string {
	return s.String()
}

func (s *QueryAcopmAtoWithholdResponse) SetReqMsgId(v string) *QueryAcopmAtoWithholdResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAcopmAtoWithholdResponse) SetResultCode(v string) *QueryAcopmAtoWithholdResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAcopmAtoWithholdResponse) SetResultMsg(v string) *QueryAcopmAtoWithholdResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAcopmAtoWithholdResponse) SetValidTime(v string) *QueryAcopmAtoWithholdResponse {
	s.ValidTime = &v
	return s
}

func (s *QueryAcopmAtoWithholdResponse) SetStatus(v string) *QueryAcopmAtoWithholdResponse {
	s.Status = &v
	return s
}

func (s *QueryAcopmAtoWithholdResponse) SetInvalidTime(v string) *QueryAcopmAtoWithholdResponse {
	s.InvalidTime = &v
	return s
}

func (s *QueryAcopmAtoWithholdResponse) SetSignTime(v string) *QueryAcopmAtoWithholdResponse {
	s.SignTime = &v
	return s
}

type QueryAcopmaTestTestaRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 123
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
}

func (s QueryAcopmaTestTestaRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAcopmaTestTestaRequest) GoString() string {
	return s.String()
}

func (s *QueryAcopmaTestTestaRequest) SetAuthToken(v string) *QueryAcopmaTestTestaRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAcopmaTestTestaRequest) SetProductInstanceId(v string) *QueryAcopmaTestTestaRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAcopmaTestTestaRequest) SetName(v string) *QueryAcopmaTestTestaRequest {
	s.Name = &v
	return s
}

type QueryAcopmaTestTestaResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// id
	Id *string `json:"id,omitempty" xml:"id,omitempty"`
}

func (s QueryAcopmaTestTestaResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAcopmaTestTestaResponse) GoString() string {
	return s.String()
}

func (s *QueryAcopmaTestTestaResponse) SetReqMsgId(v string) *QueryAcopmaTestTestaResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAcopmaTestTestaResponse) SetResultCode(v string) *QueryAcopmaTestTestaResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAcopmaTestTestaResponse) SetResultMsg(v string) *QueryAcopmaTestTestaResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAcopmaTestTestaResponse) SetId(v string) *QueryAcopmaTestTestaResponse {
	s.Id = &v
	return s
}

type QueryUserTestRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
}

func (s QueryUserTestRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryUserTestRequest) GoString() string {
	return s.String()
}

func (s *QueryUserTestRequest) SetAuthToken(v string) *QueryUserTestRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryUserTestRequest) SetProductInstanceId(v string) *QueryUserTestRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryUserTestRequest) SetName(v string) *QueryUserTestRequest {
	s.Name = &v
	return s
}

type QueryUserTestResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 证件号
	Idcard *string `json:"idcard,omitempty" xml:"idcard,omitempty"`
}

func (s QueryUserTestResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryUserTestResponse) GoString() string {
	return s.String()
}

func (s *QueryUserTestResponse) SetReqMsgId(v string) *QueryUserTestResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryUserTestResponse) SetResultCode(v string) *QueryUserTestResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryUserTestResponse) SetResultMsg(v string) *QueryUserTestResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryUserTestResponse) SetIdcard(v string) *QueryUserTestResponse {
	s.Idcard = &v
	return s
}

type QueryUserListRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// xx
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 1
	Role *QueryMap `json:"role,omitempty" xml:"role,omitempty"`
	// 卡片
	TestClass *Card `json:"test_class,omitempty" xml:"test_class,omitempty"`
}

func (s QueryUserListRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryUserListRequest) GoString() string {
	return s.String()
}

func (s *QueryUserListRequest) SetAuthToken(v string) *QueryUserListRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryUserListRequest) SetProductInstanceId(v string) *QueryUserListRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryUserListRequest) SetName(v string) *QueryUserListRequest {
	s.Name = &v
	return s
}

func (s *QueryUserListRequest) SetRole(v *QueryMap) *QueryUserListRequest {
	s.Role = v
	return s
}

func (s *QueryUserListRequest) SetTestClass(v *Card) *QueryUserListRequest {
	s.TestClass = v
	return s
}

type QueryUserListResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 结果
	Result *bool `json:"result,omitempty" xml:"result,omitempty"`
}

func (s QueryUserListResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryUserListResponse) GoString() string {
	return s.String()
}

func (s *QueryUserListResponse) SetReqMsgId(v string) *QueryUserListResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryUserListResponse) SetResultCode(v string) *QueryUserListResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryUserListResponse) SetResultMsg(v string) *QueryUserListResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryUserListResponse) SetResult(v bool) *QueryUserListResponse {
	s.Result = &v
	return s
}

type ResetCimTestRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 测试
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
}

func (s ResetCimTestRequest) String() string {
	return tea.Prettify(s)
}

func (s ResetCimTestRequest) GoString() string {
	return s.String()
}

func (s *ResetCimTestRequest) SetAuthToken(v string) *ResetCimTestRequest {
	s.AuthToken = &v
	return s
}

func (s *ResetCimTestRequest) SetProductInstanceId(v string) *ResetCimTestRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ResetCimTestRequest) SetName(v string) *ResetCimTestRequest {
	s.Name = &v
	return s
}

type ResetCimTestResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 证件号
	Idcard *string `json:"idcard,omitempty" xml:"idcard,omitempty"`
}

func (s ResetCimTestResponse) String() string {
	return tea.Prettify(s)
}

func (s ResetCimTestResponse) GoString() string {
	return s.String()
}

func (s *ResetCimTestResponse) SetReqMsgId(v string) *ResetCimTestResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ResetCimTestResponse) SetResultCode(v string) *ResetCimTestResponse {
	s.ResultCode = &v
	return s
}

func (s *ResetCimTestResponse) SetResultMsg(v string) *ResetCimTestResponse {
	s.ResultMsg = &v
	return s
}

func (s *ResetCimTestResponse) SetIdcard(v string) *ResetCimTestResponse {
	s.Idcard = &v
	return s
}

type ImportTestsysyRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// name
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
}

func (s ImportTestsysyRequest) String() string {
	return tea.Prettify(s)
}

func (s ImportTestsysyRequest) GoString() string {
	return s.String()
}

func (s *ImportTestsysyRequest) SetAuthToken(v string) *ImportTestsysyRequest {
	s.AuthToken = &v
	return s
}

func (s *ImportTestsysyRequest) SetProductInstanceId(v string) *ImportTestsysyRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ImportTestsysyRequest) SetName(v string) *ImportTestsysyRequest {
	s.Name = &v
	return s
}

type ImportTestsysyResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// id
	Id *string `json:"id,omitempty" xml:"id,omitempty"`
}

func (s ImportTestsysyResponse) String() string {
	return tea.Prettify(s)
}

func (s ImportTestsysyResponse) GoString() string {
	return s.String()
}

func (s *ImportTestsysyResponse) SetReqMsgId(v string) *ImportTestsysyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ImportTestsysyResponse) SetResultCode(v string) *ImportTestsysyResponse {
	s.ResultCode = &v
	return s
}

func (s *ImportTestsysyResponse) SetResultMsg(v string) *ImportTestsysyResponse {
	s.ResultMsg = &v
	return s
}

func (s *ImportTestsysyResponse) SetId(v string) *ImportTestsysyResponse {
	s.Id = &v
	return s
}

type CheckAicoguardcoreAicoguardrailsQuestionRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 当前提问内容
	Question *string `json:"question,omitempty" xml:"question,omitempty" require:"true"`
	// 当前提问格式
	QuestionFormat *string `json:"question_format,omitempty" xml:"question_format,omitempty"`
	// 应用名
	AppCode *string `json:"app_code,omitempty" xml:"app_code,omitempty" require:"true"`
	// 会话ID
	SessionId *string `json:"session_id,omitempty" xml:"session_id,omitempty" require:"true"`
	// 唯一定位一个问答对
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty" require:"true"`
	// 场景code，走SOP流程申请
	SceneCode *string `json:"scene_code,omitempty" xml:"scene_code,omitempty" require:"true"`
	// 当前固定填入：TJ_QUESTION_BASIC
	ServiceCode *string `json:"service_code,omitempty" xml:"service_code,omitempty" require:"true"`
	// Agent标识
	AgentCode *string `json:"agent_code,omitempty" xml:"agent_code,omitempty" require:"true"`
	// 大模型Code，区分大模型类型和版本，比如bailing_10b_0229、bailing_65b_0315
	ModelCode *string `json:"model_code,omitempty" xml:"model_code,omitempty"`
	// 用户ID，用于主体风险判断
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty"`
	// 扩展信息，会透传到业务属性中
	BusinessProperties *Map `json:"business_properties,omitempty" xml:"business_properties,omitempty"`
}

func (s CheckAicoguardcoreAicoguardrailsQuestionRequest) String() string {
	return tea.Prettify(s)
}

func (s CheckAicoguardcoreAicoguardrailsQuestionRequest) GoString() string {
	return s.String()
}

func (s *CheckAicoguardcoreAicoguardrailsQuestionRequest) SetAuthToken(v string) *CheckAicoguardcoreAicoguardrailsQuestionRequest {
	s.AuthToken = &v
	return s
}

func (s *CheckAicoguardcoreAicoguardrailsQuestionRequest) SetProductInstanceId(v string) *CheckAicoguardcoreAicoguardrailsQuestionRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CheckAicoguardcoreAicoguardrailsQuestionRequest) SetQuestion(v string) *CheckAicoguardcoreAicoguardrailsQuestionRequest {
	s.Question = &v
	return s
}

func (s *CheckAicoguardcoreAicoguardrailsQuestionRequest) SetQuestionFormat(v string) *CheckAicoguardcoreAicoguardrailsQuestionRequest {
	s.QuestionFormat = &v
	return s
}

func (s *CheckAicoguardcoreAicoguardrailsQuestionRequest) SetAppCode(v string) *CheckAicoguardcoreAicoguardrailsQuestionRequest {
	s.AppCode = &v
	return s
}

func (s *CheckAicoguardcoreAicoguardrailsQuestionRequest) SetSessionId(v string) *CheckAicoguardcoreAicoguardrailsQuestionRequest {
	s.SessionId = &v
	return s
}

func (s *CheckAicoguardcoreAicoguardrailsQuestionRequest) SetRequestId(v string) *CheckAicoguardcoreAicoguardrailsQuestionRequest {
	s.RequestId = &v
	return s
}

func (s *CheckAicoguardcoreAicoguardrailsQuestionRequest) SetSceneCode(v string) *CheckAicoguardcoreAicoguardrailsQuestionRequest {
	s.SceneCode = &v
	return s
}

func (s *CheckAicoguardcoreAicoguardrailsQuestionRequest) SetServiceCode(v string) *CheckAicoguardcoreAicoguardrailsQuestionRequest {
	s.ServiceCode = &v
	return s
}

func (s *CheckAicoguardcoreAicoguardrailsQuestionRequest) SetAgentCode(v string) *CheckAicoguardcoreAicoguardrailsQuestionRequest {
	s.AgentCode = &v
	return s
}

func (s *CheckAicoguardcoreAicoguardrailsQuestionRequest) SetModelCode(v string) *CheckAicoguardcoreAicoguardrailsQuestionRequest {
	s.ModelCode = &v
	return s
}

func (s *CheckAicoguardcoreAicoguardrailsQuestionRequest) SetUserId(v string) *CheckAicoguardcoreAicoguardrailsQuestionRequest {
	s.UserId = &v
	return s
}

func (s *CheckAicoguardcoreAicoguardrailsQuestionRequest) SetBusinessProperties(v *Map) *CheckAicoguardcoreAicoguardrailsQuestionRequest {
	s.BusinessProperties = v
	return s
}

type CheckAicoguardcoreAicoguardrailsQuestionResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否安全无风险 true：安全无风险 false：有风险
	Safe *bool `json:"safe,omitempty" xml:"safe,omitempty"`
	// 安全动作 BLOCK：拦截  SECURITY_ANSWER：安全代答  SECURITY_PROMPT：安全提示增强
	ActionCode *string `json:"action_code,omitempty" xml:"action_code,omitempty"`
	// 安全动作相关文案，比如安全提示增强的文案、安全代答的回答、回答里补充的安全提示
	ActionMsg *string `json:"action_msg,omitempty" xml:"action_msg,omitempty"`
	// 会话动作. END_SESSION：终止会话.  RECALL_QUERY：撤回提问
	SessionAction *string `json:"session_action,omitempty" xml:"session_action,omitempty"`
}

func (s CheckAicoguardcoreAicoguardrailsQuestionResponse) String() string {
	return tea.Prettify(s)
}

func (s CheckAicoguardcoreAicoguardrailsQuestionResponse) GoString() string {
	return s.String()
}

func (s *CheckAicoguardcoreAicoguardrailsQuestionResponse) SetReqMsgId(v string) *CheckAicoguardcoreAicoguardrailsQuestionResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CheckAicoguardcoreAicoguardrailsQuestionResponse) SetResultCode(v string) *CheckAicoguardcoreAicoguardrailsQuestionResponse {
	s.ResultCode = &v
	return s
}

func (s *CheckAicoguardcoreAicoguardrailsQuestionResponse) SetResultMsg(v string) *CheckAicoguardcoreAicoguardrailsQuestionResponse {
	s.ResultMsg = &v
	return s
}

func (s *CheckAicoguardcoreAicoguardrailsQuestionResponse) SetSafe(v bool) *CheckAicoguardcoreAicoguardrailsQuestionResponse {
	s.Safe = &v
	return s
}

func (s *CheckAicoguardcoreAicoguardrailsQuestionResponse) SetActionCode(v string) *CheckAicoguardcoreAicoguardrailsQuestionResponse {
	s.ActionCode = &v
	return s
}

func (s *CheckAicoguardcoreAicoguardrailsQuestionResponse) SetActionMsg(v string) *CheckAicoguardcoreAicoguardrailsQuestionResponse {
	s.ActionMsg = &v
	return s
}

func (s *CheckAicoguardcoreAicoguardrailsQuestionResponse) SetSessionAction(v string) *CheckAicoguardcoreAicoguardrailsQuestionResponse {
	s.SessionAction = &v
	return s
}

type QueryTestTimeMenhuRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s QueryTestTimeMenhuRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryTestTimeMenhuRequest) GoString() string {
	return s.String()
}

func (s *QueryTestTimeMenhuRequest) SetAuthToken(v string) *QueryTestTimeMenhuRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryTestTimeMenhuRequest) SetProductInstanceId(v string) *QueryTestTimeMenhuRequest {
	s.ProductInstanceId = &v
	return s
}

type QueryTestTimeMenhuResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s QueryTestTimeMenhuResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryTestTimeMenhuResponse) GoString() string {
	return s.String()
}

func (s *QueryTestTimeMenhuResponse) SetReqMsgId(v string) *QueryTestTimeMenhuResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryTestTimeMenhuResponse) SetResultCode(v string) *QueryTestTimeMenhuResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryTestTimeMenhuResponse) SetResultMsg(v string) *QueryTestTimeMenhuResponse {
	s.ResultMsg = &v
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
	// 入参
	Param *string `json:"param,omitempty" xml:"param,omitempty" require:"true"`
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

func (s *QueryAaaBbbCccRequest) SetParam(v string) *QueryAaaBbbCccRequest {
	s.Param = &v
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

type BindAaaBbbCcdRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s BindAaaBbbCcdRequest) String() string {
	return tea.Prettify(s)
}

func (s BindAaaBbbCcdRequest) GoString() string {
	return s.String()
}

func (s *BindAaaBbbCcdRequest) SetAuthToken(v string) *BindAaaBbbCcdRequest {
	s.AuthToken = &v
	return s
}

func (s *BindAaaBbbCcdRequest) SetProductInstanceId(v string) *BindAaaBbbCcdRequest {
	s.ProductInstanceId = &v
	return s
}

type BindAaaBbbCcdResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s BindAaaBbbCcdResponse) String() string {
	return tea.Prettify(s)
}

func (s BindAaaBbbCcdResponse) GoString() string {
	return s.String()
}

func (s *BindAaaBbbCcdResponse) SetReqMsgId(v string) *BindAaaBbbCcdResponse {
	s.ReqMsgId = &v
	return s
}

func (s *BindAaaBbbCcdResponse) SetResultCode(v string) *BindAaaBbbCcdResponse {
	s.ResultCode = &v
	return s
}

func (s *BindAaaBbbCcdResponse) SetResultMsg(v string) *BindAaaBbbCcdResponse {
	s.ResultMsg = &v
	return s
}

type QueryAutoTestRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s QueryAutoTestRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAutoTestRequest) GoString() string {
	return s.String()
}

func (s *QueryAutoTestRequest) SetAuthToken(v string) *QueryAutoTestRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAutoTestRequest) SetProductInstanceId(v string) *QueryAutoTestRequest {
	s.ProductInstanceId = &v
	return s
}

type QueryAutoTestResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// xx
	Name *TestAdd `json:"name,omitempty" xml:"name,omitempty"`
}

func (s QueryAutoTestResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAutoTestResponse) GoString() string {
	return s.String()
}

func (s *QueryAutoTestResponse) SetReqMsgId(v string) *QueryAutoTestResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAutoTestResponse) SetResultCode(v string) *QueryAutoTestResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAutoTestResponse) SetResultMsg(v string) *QueryAutoTestResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAutoTestResponse) SetName(v *TestAdd) *QueryAutoTestResponse {
	s.Name = v
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
				"sdk_version":      tea.String("1.1.69"),
				"_prod_code":       tea.String("DEMO"),
				"_prod_channel":    tea.String("undefined"),
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
// Description: 123
//
// Summary: 123
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

// Description:
//
// Description: 123
//
// Summary: 123
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

// Description:
//
// Description: 测试
//
// Summary: 测试
func (client *Client) QueryXx(request *QueryXxRequest) (_result *QueryXxResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryXxResponse{}
	_body, _err := client.QueryXxEx(request, headers, runtime)
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
func (client *Client) QueryXxEx(request *QueryXxRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryXxResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryXxResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.xx.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 21
//
// Summary: 21
func (client *Client) ResetSsdList(request *ResetSsdListRequest) (_result *ResetSsdListResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ResetSsdListResponse{}
	_body, _err := client.ResetSsdListEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 21
//
// Summary: 21
func (client *Client) ResetSsdListEx(request *ResetSsdListRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ResetSsdListResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ResetSsdListResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.ssd.list.reset"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: xxx
//
// Summary: xxx
func (client *Client) PushTestApi(request *PushTestApiRequest) (_result *PushTestApiResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PushTestApiResponse{}
	_body, _err := client.PushTestApiEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: xxx
//
// Summary: xxx
func (client *Client) PushTestApiEx(request *PushTestApiRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PushTestApiResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PushTestApiResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.test.api.push"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 1s
//
// Summary: 1s
func (client *Client) QueryXtPu(request *QueryXtPuRequest) (_result *QueryXtPuResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryXtPuResponse{}
	_body, _err := client.QueryXtPuEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 1s
//
// Summary: 1s
func (client *Client) QueryXtPuEx(request *QueryXtPuRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryXtPuResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryXtPuResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.xt.pu.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 12
//
// Summary: 12
func (client *Client) QueryRtEe(request *QueryRtEeRequest) (_result *QueryRtEeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryRtEeResponse{}
	_body, _err := client.QueryRtEeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 12
//
// Summary: 12
func (client *Client) QueryRtEeEx(request *QueryRtEeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryRtEeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryRtEeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.rt.ee.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) QueryXxRun(request *QueryXxRunRequest) (_result *QueryXxRunResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryXxRunResponse{}
	_body, _err := client.QueryXxRunEx(request, headers, runtime)
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
func (client *Client) QueryXxRunEx(request *QueryXxRunRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryXxRunResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryXxRunResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.xx.run.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) QueryRtWw(request *QueryRtWwRequest) (_result *QueryRtWwResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryRtWwResponse{}
	_body, _err := client.QueryRtWwEx(request, headers, runtime)
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
func (client *Client) QueryRtWwEx(request *QueryRtWwRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryRtWwResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryRtWwResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.rt.ww.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) QueryRoleSf(request *QueryRoleSfRequest) (_result *QueryRoleSfResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryRoleSfResponse{}
	_body, _err := client.QueryRoleSfEx(request, headers, runtime)
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
func (client *Client) QueryRoleSfEx(request *QueryRoleSfRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryRoleSfResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryRoleSfResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.role.sf.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: Demo接口，返回当前服务器当前状态1
//
// Summary: 检查服务状态
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

// Description:
//
// Description: Demo接口，返回当前服务器当前状态1
//
// Summary: 检查服务状态
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

// Description:
//
// Description: Demo接口，返回当前输入的值
//
// Summary: 返回输入值1
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

// Description:
//
// Description: Demo接口，返回当前输入的值
//
// Summary: 返回输入值1
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
		request.FileObject = nil
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

// Description:
//
// Description: aaa
//
// Summary: aaa
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

// Description:
//
// Description: aaa
//
// Summary: aaa
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

// Description:
//
// Description: 超时测试
//
// Summary: 超时测试
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

// Description:
//
// Description: 超时测试
//
// Summary: 超时测试
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

// Description:
//
// Description: 10  测测aa
//
// Summary: 10s
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

// Description:
//
// Description: 10  测测aa
//
// Summary: 10s
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

// Description:
//
// Description: 简介简介简介s
//
// Summary: 简介简介
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

// Description:
//
// Description: 简介简介简介s
//
// Summary: 简介简介
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

// Description:
//
// Description: 根据入参组合返回结果，Fr 自动化连通性测试。
//
// Summary: road.init（Fr AutoT）
func (client *Client) InitGatewayRoad(request *InitGatewayRoadRequest) (_result *InitGatewayRoadResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &InitGatewayRoadResponse{}
	_body, _err := client.InitGatewayRoadEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 根据入参组合返回结果，Fr 自动化连通性测试。
//
// Summary: road.init（Fr AutoT）
func (client *Client) InitGatewayRoadEx(request *InitGatewayRoadRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *InitGatewayRoadResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &InitGatewayRoadResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.gateway.road.init"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 近端网关测试接口
//
// Summary: 近端网关测试接口（勿删）
func (client *Client) QueryGatewayEmbed(request *QueryGatewayEmbedRequest) (_result *QueryGatewayEmbedResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryGatewayEmbedResponse{}
	_body, _err := client.QueryGatewayEmbedEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 近端网关测试接口
//
// Summary: 近端网关测试接口（勿删）
func (client *Client) QueryGatewayEmbedEx(request *QueryGatewayEmbedRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryGatewayEmbedResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryGatewayEmbedResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.gateway.embed.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 更新入参后返回结果，Fr 自动化连通性测试。
//
// Summary: road.upd（Fr AutoT）
func (client *Client) UpdateGatewayRoad(request *UpdateGatewayRoadRequest) (_result *UpdateGatewayRoadResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateGatewayRoadResponse{}
	_body, _err := client.UpdateGatewayRoadEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 更新入参后返回结果，Fr 自动化连通性测试。
//
// Summary: road.upd（Fr AutoT）
func (client *Client) UpdateGatewayRoadEx(request *UpdateGatewayRoadRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateGatewayRoadResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateGatewayRoadResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.gateway.road.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 查询并返回结果，Fr 自动化连通性测试。
//
// Summary: 查询并返回结果，Fr 自动化连通性测试。
func (client *Client) QueryGatewayRoad(request *QueryGatewayRoadRequest) (_result *QueryGatewayRoadResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryGatewayRoadResponse{}
	_body, _err := client.QueryGatewayRoadEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 查询并返回结果，Fr 自动化连通性测试。
//
// Summary: 查询并返回结果，Fr 自动化连通性测试。
func (client *Client) QueryGatewayRoadEx(request *QueryGatewayRoadRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryGatewayRoadResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryGatewayRoadResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.gateway.road.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 执行计算后返回，Fr 自动化连通性测试。
//
// Summary: road.exec（Fr AutoT）
func (client *Client) ExecGatewayRoad(request *ExecGatewayRoadRequest) (_result *ExecGatewayRoadResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ExecGatewayRoadResponse{}
	_body, _err := client.ExecGatewayRoadEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 执行计算后返回，Fr 自动化连通性测试。
//
// Summary: road.exec（Fr AutoT）
func (client *Client) ExecGatewayRoadEx(request *ExecGatewayRoadRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ExecGatewayRoadResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecGatewayRoadResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.gateway.road.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 压测接口3
//
// Summary: 压测接口3
func (client *Client) QueryLoadtestTimeThree(request *QueryLoadtestTimeThreeRequest) (_result *QueryLoadtestTimeThreeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryLoadtestTimeThreeResponse{}
	_body, _err := client.QueryLoadtestTimeThreeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 压测接口3
//
// Summary: 压测接口3
func (client *Client) QueryLoadtestTimeThreeEx(request *QueryLoadtestTimeThreeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryLoadtestTimeThreeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryLoadtestTimeThreeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.loadtest.time.three.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
// Summary: 自动化测试工程使用，勿删勿改
func (client *Client) QueryInstanceidRule(request *QueryInstanceidRuleRequest) (_result *QueryInstanceidRuleResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryInstanceidRuleResponse{}
	_body, _err := client.QueryInstanceidRuleEx(request, headers, runtime)
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
// Summary: 自动化测试工程使用，勿删勿改
func (client *Client) QueryInstanceidRuleEx(request *QueryInstanceidRuleRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryInstanceidRuleResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryInstanceidRuleResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.instanceid.rule.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 设置下游耗时
//
// Summary: 自动化运行态使用【勿动！】
func (client *Client) QueryGatewayCheckEchotimeoutok(request *QueryGatewayCheckEchotimeoutokRequest) (_result *QueryGatewayCheckEchotimeoutokResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryGatewayCheckEchotimeoutokResponse{}
	_body, _err := client.QueryGatewayCheckEchotimeoutokEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 设置下游耗时
//
// Summary: 自动化运行态使用【勿动！】
func (client *Client) QueryGatewayCheckEchotimeoutokEx(request *QueryGatewayCheckEchotimeoutokRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryGatewayCheckEchotimeoutokResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryGatewayCheckEchotimeoutokResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.gateway.check.echotimeoutok.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 双百&门户&网关，停服决策测试使用
//
// Summary: 商业化规则测试
func (client *Client) MatchBusinessAndInstance(request *MatchBusinessAndInstanceRequest) (_result *MatchBusinessAndInstanceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &MatchBusinessAndInstanceResponse{}
	_body, _err := client.MatchBusinessAndInstanceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 双百&门户&网关，停服决策测试使用
//
// Summary: 商业化规则测试
func (client *Client) MatchBusinessAndInstanceEx(request *MatchBusinessAndInstanceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *MatchBusinessAndInstanceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &MatchBusinessAndInstanceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.business.and.instance.match"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 流失查询测试
//
// Summary: 流失查询测试
func (client *Client) QueryStreamTest(request *QueryStreamTestRequest) (_result *QueryStreamTestResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryStreamTestResponse{}
	_body, _err := client.QueryStreamTestEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 流失查询测试
//
// Summary: 流失查询测试
func (client *Client) QueryStreamTestEx(request *QueryStreamTestRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryStreamTestResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryStreamTestResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.stream.test.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 网关性能优化测试
//
// Summary: 网关性能优化测试
func (client *Client) QueryTestCatcheLimit(request *QueryTestCatcheLimitRequest) (_result *QueryTestCatcheLimitResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryTestCatcheLimitResponse{}
	_body, _err := client.QueryTestCatcheLimitEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 网关性能优化测试
//
// Summary: 网关性能优化测试
func (client *Client) QueryTestCatcheLimitEx(request *QueryTestCatcheLimitRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryTestCatcheLimitResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryTestCatcheLimitResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.test.catche.limit.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 测试使用
//
// Summary: 测试使用
func (client *Client) QueryTestForLimit(request *QueryTestForLimitRequest) (_result *QueryTestForLimitResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryTestForLimitResponse{}
	_body, _err := client.QueryTestForLimitEx(request, headers, runtime)
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
func (client *Client) QueryTestForLimitEx(request *QueryTestForLimitRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryTestForLimitResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryTestForLimitResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.test.for.limit.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) QueryTestTestTest(request *QueryTestTestTestRequest) (_result *QueryTestTestTestResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryTestTestTestResponse{}
	_body, _err := client.QueryTestTestTestEx(request, headers, runtime)
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
func (client *Client) QueryTestTestTestEx(request *QueryTestTestTestRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryTestTestTestResponse, _err error) {
	if !tea.BoolValue(util.IsUnset(request.FileObject)) {
		uploadReq := &CreateAntcloudGatewayxFileUploadRequest{
			AuthToken: request.AuthToken,
			ApiCode:   tea.String("demo.test.test.test.query"),
			FileName:  request.FileObjectName,
		}
		uploadResp, _err := client.CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime)
		if _err != nil {
			return _result, _err
		}

		if !tea.BoolValue(antchainutil.IsSuccess(uploadResp.ResultCode, tea.String("OK"))) {
			queryTestTestTestResponse := &QueryTestTestTestResponse{
				ReqMsgId:   uploadResp.ReqMsgId,
				ResultCode: uploadResp.ResultCode,
				ResultMsg:  uploadResp.ResultMsg,
			}
			_result = queryTestTestTestResponse
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
	_result = &QueryTestTestTestResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.test.test.test.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) QueryABC(request *QueryABCRequest) (_result *QueryABCResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryABCResponse{}
	_body, _err := client.QueryABCEx(request, headers, runtime)
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
func (client *Client) QueryABCEx(request *QueryABCRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryABCResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryABCResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.a.b.c.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 近端接口测试
//
// Summary: 近端接口测试
func (client *Client) QueryTestEmbedUser(request *QueryTestEmbedUserRequest) (_result *QueryTestEmbedUserResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryTestEmbedUserResponse{}
	_body, _err := client.QueryTestEmbedUserEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 近端接口测试
//
// Summary: 近端接口测试
func (client *Client) QueryTestEmbedUserEx(request *QueryTestEmbedUserRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryTestEmbedUserResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryTestEmbedUserResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.test.embed.user.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: sss
//
// Summary: sss
func (client *Client) QueryAasSaSa(request *QueryAasSaSaRequest) (_result *QueryAasSaSaResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAasSaSaResponse{}
	_body, _err := client.QueryAasSaSaEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: sss
//
// Summary: sss
func (client *Client) QueryAasSaSaEx(request *QueryAasSaSaRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAasSaSaResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAasSaSaResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.aas.sa.sa.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 用于自动化测试IP访问控制白名单测试需要，【请勿做任何改动！】
//
// Summary: 自动化测试需要，【请勿做任何改动！】
func (client *Client) QueryApiWhiteList(request *QueryApiWhiteListRequest) (_result *QueryApiWhiteListResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryApiWhiteListResponse{}
	_body, _err := client.QueryApiWhiteListEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 用于自动化测试IP访问控制白名单测试需要，【请勿做任何改动！】
//
// Summary: 自动化测试需要，【请勿做任何改动！】
func (client *Client) QueryApiWhiteListEx(request *QueryApiWhiteListRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryApiWhiteListResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryApiWhiteListResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.api.white.list.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 用于自动化测试IP访问控制白名单测试需要，【请勿做任何改动！】
//
// Summary: 自动化测试需要，【请勿做任何改动！】
func (client *Client) QueryApiBlackList(request *QueryApiBlackListRequest) (_result *QueryApiBlackListResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryApiBlackListResponse{}
	_body, _err := client.QueryApiBlackListEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 用于自动化测试IP访问控制白名单测试需要，【请勿做任何改动！】
//
// Summary: 自动化测试需要，【请勿做任何改动！】
func (client *Client) QueryApiBlackListEx(request *QueryApiBlackListRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryApiBlackListResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryApiBlackListResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.api.black.list.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: ip访问白名单测试
//
// Summary: 【自动化】ip访问白名单测试
func (client *Client) QueryIpWhiteList(request *QueryIpWhiteListRequest) (_result *QueryIpWhiteListResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryIpWhiteListResponse{}
	_body, _err := client.QueryIpWhiteListEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: ip访问白名单测试
//
// Summary: 【自动化】ip访问白名单测试
func (client *Client) QueryIpWhiteListEx(request *QueryIpWhiteListRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryIpWhiteListResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryIpWhiteListResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.ip.white.list.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: ip访问白名单测试
//
// Summary: ip访问白名单测试
func (client *Client) QueryIpBlackList(request *QueryIpBlackListRequest) (_result *QueryIpBlackListResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryIpBlackListResponse{}
	_body, _err := client.QueryIpBlackListEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: ip访问白名单测试
//
// Summary: ip访问白名单测试
func (client *Client) QueryIpBlackListEx(request *QueryIpBlackListRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryIpBlackListResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryIpBlackListResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.ip.black.list.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 重试策略
//
// Summary: 重试策略
func (client *Client) QueryIpRetry(request *QueryIpRetryRequest) (_result *QueryIpRetryResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryIpRetryResponse{}
	_body, _err := client.QueryIpRetryEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 重试策略
//
// Summary: 重试策略
func (client *Client) QueryIpRetryEx(request *QueryIpRetryRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryIpRetryResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryIpRetryResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.ip.retry.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 个人工作台二期测试
//
// Summary: 个人工作台二期测试
func (client *Client) QueryTestTimeTesta(request *QueryTestTimeTestaRequest) (_result *QueryTestTimeTestaResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryTestTimeTestaResponse{}
	_body, _err := client.QueryTestTimeTestaEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 个人工作台二期测试
//
// Summary: 个人工作台二期测试
func (client *Client) QueryTestTimeTestaEx(request *QueryTestTimeTestaRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryTestTimeTestaResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryTestTimeTestaResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.test.time.testa.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: oas 测试使用
//
// Summary: oas 测试使用
func (client *Client) QueryOasRest(request *QueryOasRestRequest) (_result *QueryOasRestResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryOasRestResponse{}
	_body, _err := client.QueryOasRestEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: oas 测试使用
//
// Summary: oas 测试使用
func (client *Client) QueryOasRestEx(request *QueryOasRestRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryOasRestResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryOasRestResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.oas.rest.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 自动化contenttype兼容测试
//
// Summary: 自动化contenttype兼容测试
func (client *Client) QueryTestContentType(request *QueryTestContentTypeRequest) (_result *QueryTestContentTypeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryTestContentTypeResponse{}
	_body, _err := client.QueryTestContentTypeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 自动化contenttype兼容测试
//
// Summary: 自动化contenttype兼容测试
func (client *Client) QueryTestContentTypeEx(request *QueryTestContentTypeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryTestContentTypeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryTestContentTypeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.test.content.type.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 自动化测试contentType
//
// Summary: 自动化测试contentType
func (client *Client) QueryTestContentTypeone(request *QueryTestContentTypeoneRequest) (_result *QueryTestContentTypeoneResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryTestContentTypeoneResponse{}
	_body, _err := client.QueryTestContentTypeoneEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 自动化测试contentType
//
// Summary: 自动化测试contentType
func (client *Client) QueryTestContentTypeoneEx(request *QueryTestContentTypeoneRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryTestContentTypeoneResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryTestContentTypeoneResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.test.content.typeone.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 自动化contenttype兼容测试
//
// Summary: 自动化contenttype兼容测试
func (client *Client) QueryTestContentTypetwo(request *QueryTestContentTypetwoRequest) (_result *QueryTestContentTypetwoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryTestContentTypetwoResponse{}
	_body, _err := client.QueryTestContentTypetwoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 自动化contenttype兼容测试
//
// Summary: 自动化contenttype兼容测试
func (client *Client) QueryTestContentTypetwoEx(request *QueryTestContentTypetwoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryTestContentTypetwoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryTestContentTypetwoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.test.content.typetwo.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 自动化contenttype兼容测试
//
// Summary: 自动化contenttype兼容测试
func (client *Client) QueryTestContentTypethree(request *QueryTestContentTypethreeRequest) (_result *QueryTestContentTypethreeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryTestContentTypethreeResponse{}
	_body, _err := client.QueryTestContentTypethreeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 自动化contenttype兼容测试
//
// Summary: 自动化contenttype兼容测试
func (client *Client) QueryTestContentTypethreeEx(request *QueryTestContentTypethreeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryTestContentTypethreeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryTestContentTypethreeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.test.content.typethree.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 自动化contenttype兼容测试
//
// Summary: 自动化contenttype兼容测试
func (client *Client) QueryTestContentTypefour(request *QueryTestContentTypefourRequest) (_result *QueryTestContentTypefourResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryTestContentTypefourResponse{}
	_body, _err := client.QueryTestContentTypefourEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 自动化contenttype兼容测试
//
// Summary: 自动化contenttype兼容测试
func (client *Client) QueryTestContentTypefourEx(request *QueryTestContentTypefourRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryTestContentTypefourResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryTestContentTypefourResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.test.content.typefour.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 自动化contenttype兼容测试
//
// Summary: 自动化contenttype兼容测试
func (client *Client) QueryTestContentTypefive(request *QueryTestContentTypefiveRequest) (_result *QueryTestContentTypefiveResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryTestContentTypefiveResponse{}
	_body, _err := client.QueryTestContentTypefiveEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 自动化contenttype兼容测试
//
// Summary: 自动化contenttype兼容测试
func (client *Client) QueryTestContentTypefiveEx(request *QueryTestContentTypefiveRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryTestContentTypefiveResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryTestContentTypefiveResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.test.content.typefive.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 金融场景风险分析
//
// Summary: 金融场景风险分析
func (client *Client) QueryAgentFinancialRisk(request *QueryAgentFinancialRiskRequest) (_result *QueryAgentFinancialRiskResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAgentFinancialRiskResponse{}
	_body, _err := client.QueryAgentFinancialRiskEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 金融场景风险分析
//
// Summary: 金融场景风险分析
func (client *Client) QueryAgentFinancialRiskEx(request *QueryAgentFinancialRiskRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAgentFinancialRiskResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAgentFinancialRiskResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.agent.financial.risk.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 自动化文件上传
//
// Summary: 自动化文件上传【勿动！】
func (client *Client) UploadAutoTestFile(request *UploadAutoTestFileRequest) (_result *UploadAutoTestFileResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UploadAutoTestFileResponse{}
	_body, _err := client.UploadAutoTestFileEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 自动化文件上传
//
// Summary: 自动化文件上传【勿动！】
func (client *Client) UploadAutoTestFileEx(request *UploadAutoTestFileRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UploadAutoTestFileResponse, _err error) {
	if !tea.BoolValue(util.IsUnset(request.FileObject)) {
		uploadReq := &CreateAntcloudGatewayxFileUploadRequest{
			AuthToken: request.AuthToken,
			ApiCode:   tea.String("demo.auto.test.file.upload"),
			FileName:  request.FileObjectName,
		}
		uploadResp, _err := client.CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime)
		if _err != nil {
			return _result, _err
		}

		if !tea.BoolValue(antchainutil.IsSuccess(uploadResp.ResultCode, tea.String("OK"))) {
			uploadAutoTestFileResponse := &UploadAutoTestFileResponse{
				ReqMsgId:   uploadResp.ReqMsgId,
				ResultCode: uploadResp.ResultCode,
				ResultMsg:  uploadResp.ResultMsg,
			}
			_result = uploadAutoTestFileResponse
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
	_result = &UploadAutoTestFileResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.auto.test.file.upload"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 42
//
// Summary: 42
func (client *Client) SdfdSfdSf(request *SdfdSfdSfRequest) (_result *SdfdSfdSfResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SdfdSfdSfResponse{}
	_body, _err := client.SdfdSfdSfEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 42
//
// Summary: 42
func (client *Client) SdfdSfdSfEx(request *SdfdSfdSfRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SdfdSfdSfResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SdfdSfdSfResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.sfd.sf.sdfd"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) PushXxTtt(request *PushXxTttRequest) (_result *PushXxTttResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PushXxTttResponse{}
	_body, _err := client.PushXxTttEx(request, headers, runtime)
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
func (client *Client) PushXxTttEx(request *PushXxTttRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PushXxTttResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PushXxTttResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.xx.ttt.push"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) QueryCimTest(request *QueryCimTestRequest) (_result *QueryCimTestResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryCimTestResponse{}
	_body, _err := client.QueryCimTestEx(request, headers, runtime)
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
func (client *Client) QueryCimTestEx(request *QueryCimTestRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryCimTestResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryCimTestResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.cim.test.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) QueryAaaMultiCcc(request *QueryAaaMultiCccRequest) (_result *QueryAaaMultiCccResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAaaMultiCccResponse{}
	_body, _err := client.QueryAaaMultiCccEx(request, headers, runtime)
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
func (client *Client) QueryAaaMultiCccEx(request *QueryAaaMultiCccRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAaaMultiCccResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAaaMultiCccResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.aaa.multi.ccc.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 流式处理
//
// Summary: 流式处理
func (client *Client) QueryStreamTestmethod(request *QueryStreamTestmethodRequest) (_result *QueryStreamTestmethodResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryStreamTestmethodResponse{}
	_body, _err := client.QueryStreamTestmethodEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 流式处理
//
// Summary: 流式处理
func (client *Client) QueryStreamTestmethodEx(request *QueryStreamTestmethodRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryStreamTestmethodResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryStreamTestmethodResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.stream.testmethod.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 模拟下游超时情况
//
// Summary: 流式超时测试接口
func (client *Client) QueryStreamTimeout(request *QueryStreamTimeoutRequest) (_result *QueryStreamTimeoutResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryStreamTimeoutResponse{}
	_body, _err := client.QueryStreamTimeoutEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 模拟下游超时情况
//
// Summary: 流式超时测试接口
func (client *Client) QueryStreamTimeoutEx(request *QueryStreamTimeoutRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryStreamTimeoutResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryStreamTimeoutResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.stream.timeout.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 模拟下游返回非json的情况
//
// Summary: 流式下游返回非json
func (client *Client) QueryStreamNonjson(request *QueryStreamNonjsonRequest) (_result *QueryStreamNonjsonResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryStreamNonjsonResponse{}
	_body, _err := client.QueryStreamNonjsonEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 模拟下游返回非json的情况
//
// Summary: 流式下游返回非json
func (client *Client) QueryStreamNonjsonEx(request *QueryStreamNonjsonRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryStreamNonjsonResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryStreamNonjsonResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.stream.nonjson.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 流式出参包含特殊字符
//
// Summary: 流式出参包含特殊字符
func (client *Client) QueryStreamSpecialCharacters(request *QueryStreamSpecialCharactersRequest) (_result *QueryStreamSpecialCharactersResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryStreamSpecialCharactersResponse{}
	_body, _err := client.QueryStreamSpecialCharactersEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 流式出参包含特殊字符
//
// Summary: 流式出参包含特殊字符
func (client *Client) QueryStreamSpecialCharactersEx(request *QueryStreamSpecialCharactersRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryStreamSpecialCharactersResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryStreamSpecialCharactersResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.stream.special.characters.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 非流式返回
//
// Summary: 非流式返回
func (client *Client) QueryStreamNonstream(request *QueryStreamNonstreamRequest) (_result *QueryStreamNonstreamResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryStreamNonstreamResponse{}
	_body, _err := client.QueryStreamNonstreamEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 非流式返回
//
// Summary: 非流式返回
func (client *Client) QueryStreamNonstreamEx(request *QueryStreamNonstreamRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryStreamNonstreamResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryStreamNonstreamResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.stream.nonstream.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 压测接口1
//
// Summary: 压测接口1
func (client *Client) QueryLoadtestTimeOne(request *QueryLoadtestTimeOneRequest) (_result *QueryLoadtestTimeOneResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryLoadtestTimeOneResponse{}
	_body, _err := client.QueryLoadtestTimeOneEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 压测接口1
//
// Summary: 压测接口1
func (client *Client) QueryLoadtestTimeOneEx(request *QueryLoadtestTimeOneRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryLoadtestTimeOneResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryLoadtestTimeOneResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.loadtest.time.one.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 压测接口2
//
// Summary: 压测接口2
func (client *Client) QueryLoadtestTimeTwo(request *QueryLoadtestTimeTwoRequest) (_result *QueryLoadtestTimeTwoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryLoadtestTimeTwoResponse{}
	_body, _err := client.QueryLoadtestTimeTwoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 压测接口2
//
// Summary: 压测接口2
func (client *Client) QueryLoadtestTimeTwoEx(request *QueryLoadtestTimeTwoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryLoadtestTimeTwoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryLoadtestTimeTwoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.loadtest.time.two.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 压测接口4，用于压测
//
// Summary: 压测接口4
func (client *Client) QueryLoadtestTimeFour(request *QueryLoadtestTimeFourRequest) (_result *QueryLoadtestTimeFourResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryLoadtestTimeFourResponse{}
	_body, _err := client.QueryLoadtestTimeFourEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 压测接口4，用于压测
//
// Summary: 压测接口4
func (client *Client) QueryLoadtestTimeFourEx(request *QueryLoadtestTimeFourRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryLoadtestTimeFourResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryLoadtestTimeFourResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.loadtest.time.four.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 压测接口5，用于压测
//
// Summary: 压测接口5，用于压测
func (client *Client) QueryLoadtestTimeFive(request *QueryLoadtestTimeFiveRequest) (_result *QueryLoadtestTimeFiveResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryLoadtestTimeFiveResponse{}
	_body, _err := client.QueryLoadtestTimeFiveEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 压测接口5，用于压测
//
// Summary: 压测接口5，用于压测
func (client *Client) QueryLoadtestTimeFiveEx(request *QueryLoadtestTimeFiveRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryLoadtestTimeFiveResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryLoadtestTimeFiveResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.loadtest.time.five.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) QueryAcopmAtoWithhold(request *QueryAcopmAtoWithholdRequest) (_result *QueryAcopmAtoWithholdResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAcopmAtoWithholdResponse{}
	_body, _err := client.QueryAcopmAtoWithholdEx(request, headers, runtime)
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
func (client *Client) QueryAcopmAtoWithholdEx(request *QueryAcopmAtoWithholdRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAcopmAtoWithholdResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAcopmAtoWithholdResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.acopm.ato.withhold.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) QueryAcopmaTestTesta(request *QueryAcopmaTestTestaRequest) (_result *QueryAcopmaTestTestaResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAcopmaTestTestaResponse{}
	_body, _err := client.QueryAcopmaTestTestaEx(request, headers, runtime)
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
func (client *Client) QueryAcopmaTestTestaEx(request *QueryAcopmaTestTestaRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAcopmaTestTestaResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAcopmaTestTestaResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.acopma.test.testa.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) QueryUserTest(request *QueryUserTestRequest) (_result *QueryUserTestResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryUserTestResponse{}
	_body, _err := client.QueryUserTestEx(request, headers, runtime)
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
func (client *Client) QueryUserTestEx(request *QueryUserTestRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryUserTestResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryUserTestResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.user.test.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) QueryUserList(request *QueryUserListRequest) (_result *QueryUserListResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryUserListResponse{}
	_body, _err := client.QueryUserListEx(request, headers, runtime)
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
func (client *Client) QueryUserListEx(request *QueryUserListRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryUserListResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryUserListResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.user.list.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) ResetCimTest(request *ResetCimTestRequest) (_result *ResetCimTestResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ResetCimTestResponse{}
	_body, _err := client.ResetCimTestEx(request, headers, runtime)
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
func (client *Client) ResetCimTestEx(request *ResetCimTestRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ResetCimTestResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ResetCimTestResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.cim.test.reset"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: testsysy
//
// Summary: testsysy
func (client *Client) ImportTestsysy(request *ImportTestsysyRequest) (_result *ImportTestsysyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ImportTestsysyResponse{}
	_body, _err := client.ImportTestsysyEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: testsysy
//
// Summary: testsysy
func (client *Client) ImportTestsysyEx(request *ImportTestsysyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ImportTestsysyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ImportTestsysyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.testsysy.import"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 大模型护栏多轮对话提问检测 测试
//
// Summary: 大模型护栏多轮对话提问检测
func (client *Client) CheckAicoguardcoreAicoguardrailsQuestion(request *CheckAicoguardcoreAicoguardrailsQuestionRequest) (_result *CheckAicoguardcoreAicoguardrailsQuestionResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CheckAicoguardcoreAicoguardrailsQuestionResponse{}
	_body, _err := client.CheckAicoguardcoreAicoguardrailsQuestionEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 大模型护栏多轮对话提问检测 测试
//
// Summary: 大模型护栏多轮对话提问检测
func (client *Client) CheckAicoguardcoreAicoguardrailsQuestionEx(request *CheckAicoguardcoreAicoguardrailsQuestionRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CheckAicoguardcoreAicoguardrailsQuestionResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CheckAicoguardcoreAicoguardrailsQuestionResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.aicoguardcore.aicoguardrails.question.check"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 个人工作台二期测试
//
// Summary: 个人工作台二期测试
func (client *Client) QueryTestTimeMenhu(request *QueryTestTimeMenhuRequest) (_result *QueryTestTimeMenhuResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryTestTimeMenhuResponse{}
	_body, _err := client.QueryTestTimeMenhuEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 个人工作台二期测试
//
// Summary: 个人工作台二期测试
func (client *Client) QueryTestTimeMenhuEx(request *QueryTestTimeMenhuRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryTestTimeMenhuResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryTestTimeMenhuResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.test.time.menhu.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
// Summary: 自动化测试创建test1
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
// Summary: 自动化测试创建test1
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

// Description:
//
// Description: 自动化测试创建111
//
// Summary: 自动化测试创建（勿动）
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

// Description:
//
// Description: 自动化测试创建111
//
// Summary: 自动化测试创建（勿动）
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

// Description:
//
// Description: 自动化测试创建,用于测试API的修改
//
// Summary: 自动化测试创建,用于测试API的修改勿动
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

// Description:
//
// Description: 自动化测试创建,用于测试API的修改
//
// Summary: 自动化测试创建,用于测试API的修改勿动
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

// Description:
//
// Description: 123
//
// Summary: 测试用api
func (client *Client) BindAaaBbbCcd(request *BindAaaBbbCcdRequest) (_result *BindAaaBbbCcdResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &BindAaaBbbCcdResponse{}
	_body, _err := client.BindAaaBbbCcdEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 123
//
// Summary: 测试用api
func (client *Client) BindAaaBbbCcdEx(request *BindAaaBbbCcdRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *BindAaaBbbCcdResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &BindAaaBbbCcdResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.aaa.bbb.ccd.bind"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) QueryAutoTest(request *QueryAutoTestRequest) (_result *QueryAutoTestResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAutoTestResponse{}
	_body, _err := client.QueryAutoTestEx(request, headers, runtime)
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
func (client *Client) QueryAutoTestEx(request *QueryAutoTestRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAutoTestResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAutoTestResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.auto.test.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
