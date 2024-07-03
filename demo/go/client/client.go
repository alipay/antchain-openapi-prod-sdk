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

// host
type Host struct {
	// test_2e1ae924805f
	SystemName *string `json:"system_name,omitempty" xml:"system_name,omitempty" require:"true"`
	// 地址
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

// 身份
type Identity struct {
	// ak
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

// SCRealEstateQueryResponseData
type SCRealEstateQueryResponseData struct {
	// area_code
	AreaCode *string `json:"area_code,omitempty" xml:"area_code,omitempty" require:"true"`
	// area_name
	AreaName *string `json:"area_name,omitempty" xml:"area_name,omitempty" require:"true"`
	// bdcdyh
	Bdcdyh *string `json:"bdcdyh,omitempty" xml:"bdcdyh,omitempty" require:"true"`
	// bdcqzh
	Bdcqzh *string `json:"bdcqzh,omitempty" xml:"bdcqzh,omitempty" require:"true"`
	// djsj
	Djsj *string `json:"djsj,omitempty" xml:"djsj,omitempty" require:"true"`
	// fwyt1
	Fwyt1 *string `json:"fwyt1,omitempty" xml:"fwyt1,omitempty" require:"true"`
	// gyqk
	Gyqk *string `json:"gyqk,omitempty" xml:"gyqk,omitempty" require:"true"`
	// qllx
	Qllx *string `json:"qllx,omitempty" xml:"qllx,omitempty" require:"true"`
	// qlrmc
	Qlrmc *string `json:"qlrmc,omitempty" xml:"qlrmc,omitempty" require:"true"`
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

// 头文件
type Header struct {
	// 身份信息
	Identity *Identity `json:"identity,omitempty" xml:"identity,omitempty" require:"true"`
	// 调用链编号
	TraceId *string `json:"trace_id,omitempty" xml:"trace_id,omitempty" require:"true"`
	// host信息
	Host *Host `json:"host,omitempty" xml:"host,omitempty" require:"true"`
	// 方向
	Direction *string `json:"direction,omitempty" xml:"direction,omitempty" require:"true"`
	// 请求类型
	RequestType *string `json:"request_type,omitempty" xml:"request_type,omitempty" require:"true"`
	// 协议版本
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

// routeCondition
type RouteCondition struct {
	// 渠道编号
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

// testAtestB
type SCRealEstateQueryBody struct {
}

func (s SCRealEstateQueryBody) String() string {
	return tea.Prettify(s)
}

func (s SCRealEstateQueryBody) GoString() string {
	return s.String()
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

// SCRealEstateQueryRequestPayload
type SCRealEstateQueryRequestPayload struct {
	// xm
	Xm *string `json:"xm,omitempty" xml:"xm,omitempty" require:"true"`
	// sfz
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

// 编码
type Cmd struct {
	// cmd编码
	CmdCode *string `json:"cmd_code,omitempty" xml:"cmd_code,omitempty" require:"true"`
	// 版本号
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

// SCRealEstateQueryResponsePayload
type SCRealEstateQueryResponsePayload struct {
	// code
	Code *string `json:"code,omitempty" xml:"code,omitempty" require:"true"`
	// data
	Data []*SCRealEstateQueryResponseData `json:"data,omitempty" xml:"data,omitempty" require:"true" type:"Repeated"`
	// uuid
	Uuid *string `json:"uuid,omitempty" xml:"uuid,omitempty" require:"true"`
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

// 大安全佐罗测试接口结构体
type FaceImage struct {
	// 123
	Content *string `json:"content,omitempty" xml:"content,omitempty"`
	// 213
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

// SCRealEstateQuery
type SCRealEstateQueryInvokerRequest struct {
	// header
	Header *Header `json:"header,omitempty" xml:"header,omitempty" require:"true"`
	// body
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

// 用于上海非金迭代的测试使用
type ShangHaiTest struct {
	// string
	Param1 *string `json:"param_1,omitempty" xml:"param_1,omitempty"`
	// number
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

// 数字类型
type NumberTest struct {
	// 1
	Parameter1 *int64 `json:"parameter_1,omitempty" xml:"parameter_1,omitempty" require:"true" maximum:"5" minimum:"1"`
	// 2
	Parameter2 *int64 `json:"parameter_2,omitempty" xml:"parameter_2,omitempty" require:"true" maximum:"5" minimum:"1"`
	// 3
	Parameter3 *int64 `json:"parameter_3,omitempty" xml:"parameter_3,omitempty" require:"true" maximum:"5" minimum:"1"`
	// 4
	Parameter4 *int64 `json:"parameter_4,omitempty" xml:"parameter_4,omitempty" require:"true" maximum:"5" minimum:"1"`
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

// testAAAA
type TestClass struct {
	// 1
	Test *string `json:"test,omitempty" xml:"test,omitempty" require:"true"`
	// 2
	Demo *string `json:"demo,omitempty" xml:"demo,omitempty" require:"true"`
	// 3
	Demo1 *string `json:"demo1,omitempty" xml:"demo1,omitempty" require:"true"`
	// 22
	Demo2 *string `json:"demo2,omitempty" xml:"demo2,omitempty" require:"true"`
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

// 测试
type TestObject struct {
	// 主键
	Id *int64 `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 名称
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

// DemoTestx
type DemoTestx struct {
	// ability_id
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

// 自动生成单测代码model
type AutoCodeModel struct {
	// 111
	ModelStringParam *string `json:"model_string_param,omitempty" xml:"model_string_param,omitempty" require:"true"`
	// 111
	ModelDateParam *string `json:"model_date_param,omitempty" xml:"model_date_param,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
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

// SCRealEstateQueryRequestBody
type SCRealEstateQueryRequestBody struct {
	// cmd
	Cmd *Cmd `json:"cmd,omitempty" xml:"cmd,omitempty" require:"true"`
	// 路由信息
	RouteCondition *RouteCondition `json:"route_condition,omitempty" xml:"route_condition,omitempty" require:"true"`
	// requestId
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty" require:"true"`
	// payload
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

// 测试
type TestAPIObject struct {
	// test
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

// ResponseBody
type SCRealEstateQueryResponseBody struct {
	// cost
	Cost *int64 `json:"cost,omitempty" xml:"cost,omitempty" require:"true"`
	// response_status
	ResponseStatus *string `json:"response_status,omitempty" xml:"response_status,omitempty" require:"true"`
	// response_code
	ResponseCode *string `json:"response_code,omitempty" xml:"response_code,omitempty" require:"true"`
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

// 123
type TestA struct {
	// 1
	Parameter1 *string `json:"parameter_1,omitempty" xml:"parameter_1,omitempty" require:"true"`
	// 2
	Parameter2 *string `json:"parameter_2,omitempty" xml:"parameter_2,omitempty" require:"true"`
	// 3
	Parameter3 *string `json:"parameter_3,omitempty" xml:"parameter_3,omitempty" require:"true"`
	// 4
	Parameter4 *string `json:"parameter_4,omitempty" xml:"parameter_4,omitempty" require:"true"`
	// 5
	Parameter5 *string `json:"parameter_5,omitempty" xml:"parameter_5,omitempty" require:"true"`
	// 6
	Parameter6 *string `json:"parameter_6,omitempty" xml:"parameter_6,omitempty" require:"true"`
	// 7
	Parameter7 *string `json:"parameter_7,omitempty" xml:"parameter_7,omitempty" require:"true"`
	// 8
	Parameter8 *string `json:"parameter_8,omitempty" xml:"parameter_8,omitempty" require:"true"`
	// 9
	Parameter9 *string `json:"parameter_9,omitempty" xml:"parameter_9,omitempty" require:"true"`
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
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 防伪码类型
	CodeType *string `json:"code_type,omitempty" xml:"code_type,omitempty" require:"true"`
	// 防伪码码值
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

// 用于测试预发ob的同步_已编辑
type PreTestUse struct {
	// 1
	Param1 *string `json:"param_1,omitempty" xml:"param_1,omitempty" require:"true"`
	// 11
	Param2 *int64 `json:"param_2,omitempty" xml:"param_2,omitempty" require:"true"`
	// boolean
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

type UpdateCjtestCjRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 测试参数
	Var1 *string `json:"var1,omitempty" xml:"var1,omitempty" require:"true"`
	// 测试参数2
	Var2 *string `json:"var2,omitempty" xml:"var2,omitempty" require:"true"`
	// 被授权机构did
	Subject *string `json:"subject,omitempty" xml:"subject,omitempty"`
	// test
	Var3 *int64 `json:"var3,omitempty" xml:"var3,omitempty" require:"true" maximum:"100" minimum:"1"`
	// 111
	Var4 *string `json:"var4,omitempty" xml:"var4,omitempty" require:"true" maxLength:"200" minLength:"2"`
}

func (s UpdateCjtestCjRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateCjtestCjRequest) GoString() string {
	return s.String()
}

func (s *UpdateCjtestCjRequest) SetAuthToken(v string) *UpdateCjtestCjRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateCjtestCjRequest) SetProductInstanceId(v string) *UpdateCjtestCjRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateCjtestCjRequest) SetVar1(v string) *UpdateCjtestCjRequest {
	s.Var1 = &v
	return s
}

func (s *UpdateCjtestCjRequest) SetVar2(v string) *UpdateCjtestCjRequest {
	s.Var2 = &v
	return s
}

func (s *UpdateCjtestCjRequest) SetSubject(v string) *UpdateCjtestCjRequest {
	s.Subject = &v
	return s
}

func (s *UpdateCjtestCjRequest) SetVar3(v int64) *UpdateCjtestCjRequest {
	s.Var3 = &v
	return s
}

func (s *UpdateCjtestCjRequest) SetVar4(v string) *UpdateCjtestCjRequest {
	s.Var4 = &v
	return s
}

type UpdateCjtestCjResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 测试返回参数1
	Return1 *string `json:"return1,omitempty" xml:"return1,omitempty"`
}

func (s UpdateCjtestCjResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateCjtestCjResponse) GoString() string {
	return s.String()
}

func (s *UpdateCjtestCjResponse) SetReqMsgId(v string) *UpdateCjtestCjResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateCjtestCjResponse) SetResultCode(v string) *UpdateCjtestCjResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateCjtestCjResponse) SetResultMsg(v string) *UpdateCjtestCjResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateCjtestCjResponse) SetReturn1(v string) *UpdateCjtestCjResponse {
	s.Return1 = &v
	return s
}

type UploadCjtestSourceFileRequest struct {
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

func (s UploadCjtestSourceFileRequest) String() string {
	return tea.Prettify(s)
}

func (s UploadCjtestSourceFileRequest) GoString() string {
	return s.String()
}

func (s *UploadCjtestSourceFileRequest) SetAuthToken(v string) *UploadCjtestSourceFileRequest {
	s.AuthToken = &v
	return s
}

func (s *UploadCjtestSourceFileRequest) SetProductInstanceId(v string) *UploadCjtestSourceFileRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UploadCjtestSourceFileRequest) SetFileObject(v io.Reader) *UploadCjtestSourceFileRequest {
	s.FileObject = v
	return s
}

func (s *UploadCjtestSourceFileRequest) SetFileObjectName(v string) *UploadCjtestSourceFileRequest {
	s.FileObjectName = &v
	return s
}

func (s *UploadCjtestSourceFileRequest) SetFileId(v string) *UploadCjtestSourceFileRequest {
	s.FileId = &v
	return s
}

type UploadCjtestSourceFileResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// test
	Res *string `json:"res,omitempty" xml:"res,omitempty"`
}

func (s UploadCjtestSourceFileResponse) String() string {
	return tea.Prettify(s)
}

func (s UploadCjtestSourceFileResponse) GoString() string {
	return s.String()
}

func (s *UploadCjtestSourceFileResponse) SetReqMsgId(v string) *UploadCjtestSourceFileResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UploadCjtestSourceFileResponse) SetResultCode(v string) *UploadCjtestSourceFileResponse {
	s.ResultCode = &v
	return s
}

func (s *UploadCjtestSourceFileResponse) SetResultMsg(v string) *UploadCjtestSourceFileResponse {
	s.ResultMsg = &v
	return s
}

func (s *UploadCjtestSourceFileResponse) SetRes(v string) *UploadCjtestSourceFileResponse {
	s.Res = &v
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

type InitCjtestAcopmResRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 111
	Timeout *int64 `json:"timeout,omitempty" xml:"timeout,omitempty" require:"true"`
	// 11111
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 111
	Timeout111 []*string `json:"timeout111,omitempty" xml:"timeout111,omitempty" require:"true" type:"Repeated"`
	// 34134
	Msg1111 *AutoCodeModel `json:"msg1111,omitempty" xml:"msg1111,omitempty" require:"true"`
}

func (s InitCjtestAcopmResRequest) String() string {
	return tea.Prettify(s)
}

func (s InitCjtestAcopmResRequest) GoString() string {
	return s.String()
}

func (s *InitCjtestAcopmResRequest) SetAuthToken(v string) *InitCjtestAcopmResRequest {
	s.AuthToken = &v
	return s
}

func (s *InitCjtestAcopmResRequest) SetProductInstanceId(v string) *InitCjtestAcopmResRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *InitCjtestAcopmResRequest) SetTimeout(v int64) *InitCjtestAcopmResRequest {
	s.Timeout = &v
	return s
}

func (s *InitCjtestAcopmResRequest) SetMsg(v string) *InitCjtestAcopmResRequest {
	s.Msg = &v
	return s
}

func (s *InitCjtestAcopmResRequest) SetTimeout111(v []*string) *InitCjtestAcopmResRequest {
	s.Timeout111 = v
	return s
}

func (s *InitCjtestAcopmResRequest) SetMsg1111(v *AutoCodeModel) *InitCjtestAcopmResRequest {
	s.Msg1111 = v
	return s
}

type InitCjtestAcopmResResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s InitCjtestAcopmResResponse) String() string {
	return tea.Prettify(s)
}

func (s InitCjtestAcopmResResponse) GoString() string {
	return s.String()
}

func (s *InitCjtestAcopmResResponse) SetReqMsgId(v string) *InitCjtestAcopmResResponse {
	s.ReqMsgId = &v
	return s
}

func (s *InitCjtestAcopmResResponse) SetResultCode(v string) *InitCjtestAcopmResResponse {
	s.ResultCode = &v
	return s
}

func (s *InitCjtestAcopmResResponse) SetResultMsg(v string) *InitCjtestAcopmResResponse {
	s.ResultMsg = &v
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
	Timeout *int64 `json:"timeout,omitempty" xml:"timeout,omitempty" require:"true"`
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

func (s *QueryLoadtestTimeThreeRequest) SetTimeout(v int64) *QueryLoadtestTimeThreeRequest {
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

type CreateAutoTestCodeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 111
	StringParam1 *string `json:"string_param_1,omitempty" xml:"string_param_1,omitempty" require:"true"`
	// 222
	StringParam2 *string `json:"string_param_2,omitempty" xml:"string_param_2,omitempty"`
	// 111
	NumberParam1 *int64 `json:"number_param_1,omitempty" xml:"number_param_1,omitempty" require:"true"`
	// 222
	NumberParam2 *int64 `json:"number_param_2,omitempty" xml:"number_param_2,omitempty"`
	// 111
	BoolParam1 *bool `json:"bool_param_1,omitempty" xml:"bool_param_1,omitempty" require:"true"`
	// 222
	BoolParam2 *bool `json:"bool_param_2,omitempty" xml:"bool_param_2,omitempty"`
	// 111
	DateParam1 *string `json:"date_param_1,omitempty" xml:"date_param_1,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 222
	DateParam2 *string `json:"date_param_2,omitempty" xml:"date_param_2,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 111
	ArrayParam1 []*string `json:"array_param_1,omitempty" xml:"array_param_1,omitempty" require:"true" type:"Repeated"`
	// 222
	ArrayParam2 []*string `json:"array_param_2,omitempty" xml:"array_param_2,omitempty" type:"Repeated"`
	// 111
	StructParam1 *AutoCodeModel `json:"struct_param_1,omitempty" xml:"struct_param_1,omitempty" require:"true"`
	// 222
	StructParam2 *AutoCodeModel `json:"struct_param_2,omitempty" xml:"struct_param_2,omitempty"`
}

func (s CreateAutoTestCodeRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateAutoTestCodeRequest) GoString() string {
	return s.String()
}

func (s *CreateAutoTestCodeRequest) SetAuthToken(v string) *CreateAutoTestCodeRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateAutoTestCodeRequest) SetProductInstanceId(v string) *CreateAutoTestCodeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateAutoTestCodeRequest) SetStringParam1(v string) *CreateAutoTestCodeRequest {
	s.StringParam1 = &v
	return s
}

func (s *CreateAutoTestCodeRequest) SetStringParam2(v string) *CreateAutoTestCodeRequest {
	s.StringParam2 = &v
	return s
}

func (s *CreateAutoTestCodeRequest) SetNumberParam1(v int64) *CreateAutoTestCodeRequest {
	s.NumberParam1 = &v
	return s
}

func (s *CreateAutoTestCodeRequest) SetNumberParam2(v int64) *CreateAutoTestCodeRequest {
	s.NumberParam2 = &v
	return s
}

func (s *CreateAutoTestCodeRequest) SetBoolParam1(v bool) *CreateAutoTestCodeRequest {
	s.BoolParam1 = &v
	return s
}

func (s *CreateAutoTestCodeRequest) SetBoolParam2(v bool) *CreateAutoTestCodeRequest {
	s.BoolParam2 = &v
	return s
}

func (s *CreateAutoTestCodeRequest) SetDateParam1(v string) *CreateAutoTestCodeRequest {
	s.DateParam1 = &v
	return s
}

func (s *CreateAutoTestCodeRequest) SetDateParam2(v string) *CreateAutoTestCodeRequest {
	s.DateParam2 = &v
	return s
}

func (s *CreateAutoTestCodeRequest) SetArrayParam1(v []*string) *CreateAutoTestCodeRequest {
	s.ArrayParam1 = v
	return s
}

func (s *CreateAutoTestCodeRequest) SetArrayParam2(v []*string) *CreateAutoTestCodeRequest {
	s.ArrayParam2 = v
	return s
}

func (s *CreateAutoTestCodeRequest) SetStructParam1(v *AutoCodeModel) *CreateAutoTestCodeRequest {
	s.StructParam1 = v
	return s
}

func (s *CreateAutoTestCodeRequest) SetStructParam2(v *AutoCodeModel) *CreateAutoTestCodeRequest {
	s.StructParam2 = v
	return s
}

type CreateAutoTestCodeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CreateAutoTestCodeResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateAutoTestCodeResponse) GoString() string {
	return s.String()
}

func (s *CreateAutoTestCodeResponse) SetReqMsgId(v string) *CreateAutoTestCodeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateAutoTestCodeResponse) SetResultCode(v string) *CreateAutoTestCodeResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateAutoTestCodeResponse) SetResultMsg(v string) *CreateAutoTestCodeResponse {
	s.ResultMsg = &v
	return s
}

type QueryDemoAbcAbcRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s QueryDemoAbcAbcRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDemoAbcAbcRequest) GoString() string {
	return s.String()
}

func (s *QueryDemoAbcAbcRequest) SetAuthToken(v string) *QueryDemoAbcAbcRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDemoAbcAbcRequest) SetProductInstanceId(v string) *QueryDemoAbcAbcRequest {
	s.ProductInstanceId = &v
	return s
}

type QueryDemoAbcAbcResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s QueryDemoAbcAbcResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDemoAbcAbcResponse) GoString() string {
	return s.String()
}

func (s *QueryDemoAbcAbcResponse) SetReqMsgId(v string) *QueryDemoAbcAbcResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDemoAbcAbcResponse) SetResultCode(v string) *QueryDemoAbcAbcResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDemoAbcAbcResponse) SetResultMsg(v string) *QueryDemoAbcAbcResponse {
	s.ResultMsg = &v
	return s
}

type QueryXxxxTestxAaaRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 1
	Xvalue *string `json:"xvalue,omitempty" xml:"xvalue,omitempty" require:"true"`
}

func (s QueryXxxxTestxAaaRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryXxxxTestxAaaRequest) GoString() string {
	return s.String()
}

func (s *QueryXxxxTestxAaaRequest) SetAuthToken(v string) *QueryXxxxTestxAaaRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryXxxxTestxAaaRequest) SetProductInstanceId(v string) *QueryXxxxTestxAaaRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryXxxxTestxAaaRequest) SetXvalue(v string) *QueryXxxxTestxAaaRequest {
	s.Xvalue = &v
	return s
}

type QueryXxxxTestxAaaResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s QueryXxxxTestxAaaResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryXxxxTestxAaaResponse) GoString() string {
	return s.String()
}

func (s *QueryXxxxTestxAaaResponse) SetReqMsgId(v string) *QueryXxxxTestxAaaResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryXxxxTestxAaaResponse) SetResultCode(v string) *QueryXxxxTestxAaaResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryXxxxTestxAaaResponse) SetResultMsg(v string) *QueryXxxxTestxAaaResponse {
	s.ResultMsg = &v
	return s
}

type QueryTestTestaTestaRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s QueryTestTestaTestaRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryTestTestaTestaRequest) GoString() string {
	return s.String()
}

func (s *QueryTestTestaTestaRequest) SetAuthToken(v string) *QueryTestTestaTestaRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryTestTestaTestaRequest) SetProductInstanceId(v string) *QueryTestTestaTestaRequest {
	s.ProductInstanceId = &v
	return s
}

type QueryTestTestaTestaResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s QueryTestTestaTestaResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryTestTestaTestaResponse) GoString() string {
	return s.String()
}

func (s *QueryTestTestaTestaResponse) SetReqMsgId(v string) *QueryTestTestaTestaResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryTestTestaTestaResponse) SetResultCode(v string) *QueryTestTestaTestaResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryTestTestaTestaResponse) SetResultMsg(v string) *QueryTestTestaTestaResponse {
	s.ResultMsg = &v
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

type QueryBusinessTestRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// jzq
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 1
	Count *int64 `json:"count,omitempty" xml:"count,omitempty" require:"true"`
}

func (s QueryBusinessTestRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryBusinessTestRequest) GoString() string {
	return s.String()
}

func (s *QueryBusinessTestRequest) SetAuthToken(v string) *QueryBusinessTestRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryBusinessTestRequest) SetProductInstanceId(v string) *QueryBusinessTestRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryBusinessTestRequest) SetName(v string) *QueryBusinessTestRequest {
	s.Name = &v
	return s
}

func (s *QueryBusinessTestRequest) SetCount(v int64) *QueryBusinessTestRequest {
	s.Count = &v
	return s
}

type QueryBusinessTestResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s QueryBusinessTestResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryBusinessTestResponse) GoString() string {
	return s.String()
}

func (s *QueryBusinessTestResponse) SetReqMsgId(v string) *QueryBusinessTestResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryBusinessTestResponse) SetResultCode(v string) *QueryBusinessTestResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryBusinessTestResponse) SetResultMsg(v string) *QueryBusinessTestResponse {
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

type QueryBusinessCodeTestRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 1
	Code *int64 `json:"code,omitempty" xml:"code,omitempty" require:"true"`
	// 1
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
}

func (s QueryBusinessCodeTestRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryBusinessCodeTestRequest) GoString() string {
	return s.String()
}

func (s *QueryBusinessCodeTestRequest) SetAuthToken(v string) *QueryBusinessCodeTestRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryBusinessCodeTestRequest) SetProductInstanceId(v string) *QueryBusinessCodeTestRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryBusinessCodeTestRequest) SetCode(v int64) *QueryBusinessCodeTestRequest {
	s.Code = &v
	return s
}

func (s *QueryBusinessCodeTestRequest) SetName(v string) *QueryBusinessCodeTestRequest {
	s.Name = &v
	return s
}

type QueryBusinessCodeTestResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s QueryBusinessCodeTestResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryBusinessCodeTestResponse) GoString() string {
	return s.String()
}

func (s *QueryBusinessCodeTestResponse) SetReqMsgId(v string) *QueryBusinessCodeTestResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryBusinessCodeTestResponse) SetResultCode(v string) *QueryBusinessCodeTestResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryBusinessCodeTestResponse) SetResultMsg(v string) *QueryBusinessCodeTestResponse {
	s.ResultMsg = &v
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

type QueryDevelopTestUseRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 入参1
	Stringparameter *string `json:"stringparameter,omitempty" xml:"stringparameter,omitempty" require:"true"`
	// 数字入参
	Numberparameter *int64 `json:"numberparameter,omitempty" xml:"numberparameter,omitempty" require:"true"`
}

func (s QueryDevelopTestUseRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDevelopTestUseRequest) GoString() string {
	return s.String()
}

func (s *QueryDevelopTestUseRequest) SetAuthToken(v string) *QueryDevelopTestUseRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDevelopTestUseRequest) SetProductInstanceId(v string) *QueryDevelopTestUseRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryDevelopTestUseRequest) SetStringparameter(v string) *QueryDevelopTestUseRequest {
	s.Stringparameter = &v
	return s
}

func (s *QueryDevelopTestUseRequest) SetNumberparameter(v int64) *QueryDevelopTestUseRequest {
	s.Numberparameter = &v
	return s
}

type QueryDevelopTestUseResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s QueryDevelopTestUseResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDevelopTestUseResponse) GoString() string {
	return s.String()
}

func (s *QueryDevelopTestUseResponse) SetReqMsgId(v string) *QueryDevelopTestUseResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDevelopTestUseResponse) SetResultCode(v string) *QueryDevelopTestUseResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDevelopTestUseResponse) SetResultMsg(v string) *QueryDevelopTestUseResponse {
	s.ResultMsg = &v
	return s
}

type VerifyDevelopTestTestRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 入参
	Stringparameter *string `json:"stringparameter,omitempty" xml:"stringparameter,omitempty" require:"true"`
	// number类型入参
	Numberparameter *int64 `json:"numberparameter,omitempty" xml:"numberparameter,omitempty" require:"true"`
}

func (s VerifyDevelopTestTestRequest) String() string {
	return tea.Prettify(s)
}

func (s VerifyDevelopTestTestRequest) GoString() string {
	return s.String()
}

func (s *VerifyDevelopTestTestRequest) SetAuthToken(v string) *VerifyDevelopTestTestRequest {
	s.AuthToken = &v
	return s
}

func (s *VerifyDevelopTestTestRequest) SetProductInstanceId(v string) *VerifyDevelopTestTestRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *VerifyDevelopTestTestRequest) SetStringparameter(v string) *VerifyDevelopTestTestRequest {
	s.Stringparameter = &v
	return s
}

func (s *VerifyDevelopTestTestRequest) SetNumberparameter(v int64) *VerifyDevelopTestTestRequest {
	s.Numberparameter = &v
	return s
}

type VerifyDevelopTestTestResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s VerifyDevelopTestTestResponse) String() string {
	return tea.Prettify(s)
}

func (s VerifyDevelopTestTestResponse) GoString() string {
	return s.String()
}

func (s *VerifyDevelopTestTestResponse) SetReqMsgId(v string) *VerifyDevelopTestTestResponse {
	s.ReqMsgId = &v
	return s
}

func (s *VerifyDevelopTestTestResponse) SetResultCode(v string) *VerifyDevelopTestTestResponse {
	s.ResultCode = &v
	return s
}

func (s *VerifyDevelopTestTestResponse) SetResultMsg(v string) *VerifyDevelopTestTestResponse {
	s.ResultMsg = &v
	return s
}

type ImportPreObWriteRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s ImportPreObWriteRequest) String() string {
	return tea.Prettify(s)
}

func (s ImportPreObWriteRequest) GoString() string {
	return s.String()
}

func (s *ImportPreObWriteRequest) SetAuthToken(v string) *ImportPreObWriteRequest {
	s.AuthToken = &v
	return s
}

func (s *ImportPreObWriteRequest) SetProductInstanceId(v string) *ImportPreObWriteRequest {
	s.ProductInstanceId = &v
	return s
}

type ImportPreObWriteResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s ImportPreObWriteResponse) String() string {
	return tea.Prettify(s)
}

func (s ImportPreObWriteResponse) GoString() string {
	return s.String()
}

func (s *ImportPreObWriteResponse) SetReqMsgId(v string) *ImportPreObWriteResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ImportPreObWriteResponse) SetResultCode(v string) *ImportPreObWriteResponse {
	s.ResultCode = &v
	return s
}

func (s *ImportPreObWriteResponse) SetResultMsg(v string) *ImportPreObWriteResponse {
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
	Burieds *QueryMap `json:"burieds,omitempty" xml:"burieds,omitempty" require:"true"`
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
	// 123
	StartDate *string `json:"start_date,omitempty" xml:"start_date,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
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

func (s *InitBbpInsuranceUserResponse) SetStartDate(v string) *InitBbpInsuranceUserResponse {
	s.StartDate = &v
	return s
}

type OperateShanghaiPreTestRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 参数1
	Param1 *string `json:"param1,omitempty" xml:"param1,omitempty" require:"true"`
}

func (s OperateShanghaiPreTestRequest) String() string {
	return tea.Prettify(s)
}

func (s OperateShanghaiPreTestRequest) GoString() string {
	return s.String()
}

func (s *OperateShanghaiPreTestRequest) SetAuthToken(v string) *OperateShanghaiPreTestRequest {
	s.AuthToken = &v
	return s
}

func (s *OperateShanghaiPreTestRequest) SetProductInstanceId(v string) *OperateShanghaiPreTestRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *OperateShanghaiPreTestRequest) SetParam1(v string) *OperateShanghaiPreTestRequest {
	s.Param1 = &v
	return s
}

type OperateShanghaiPreTestResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s OperateShanghaiPreTestResponse) String() string {
	return tea.Prettify(s)
}

func (s OperateShanghaiPreTestResponse) GoString() string {
	return s.String()
}

func (s *OperateShanghaiPreTestResponse) SetReqMsgId(v string) *OperateShanghaiPreTestResponse {
	s.ReqMsgId = &v
	return s
}

func (s *OperateShanghaiPreTestResponse) SetResultCode(v string) *OperateShanghaiPreTestResponse {
	s.ResultCode = &v
	return s
}

func (s *OperateShanghaiPreTestResponse) SetResultMsg(v string) *OperateShanghaiPreTestResponse {
	s.ResultMsg = &v
	return s
}

type QueryCjtestCjResRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 1
	Test1 *int64 `json:"test1,omitempty" xml:"test1,omitempty" require:"true" maximum:"100" minimum:"1"`
	// 2
	Test2 *int64 `json:"test2,omitempty" xml:"test2,omitempty" require:"true" maximum:"200" minimum:"100"`
	// test
	Test3 []*int64 `json:"test3,omitempty" xml:"test3,omitempty" require:"true" type:"Repeated"`
	// testclass
	Testclass *Host `json:"testclass,omitempty" xml:"testclass,omitempty" require:"true"`
}

func (s QueryCjtestCjResRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryCjtestCjResRequest) GoString() string {
	return s.String()
}

func (s *QueryCjtestCjResRequest) SetAuthToken(v string) *QueryCjtestCjResRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryCjtestCjResRequest) SetProductInstanceId(v string) *QueryCjtestCjResRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryCjtestCjResRequest) SetTest1(v int64) *QueryCjtestCjResRequest {
	s.Test1 = &v
	return s
}

func (s *QueryCjtestCjResRequest) SetTest2(v int64) *QueryCjtestCjResRequest {
	s.Test2 = &v
	return s
}

func (s *QueryCjtestCjResRequest) SetTest3(v []*int64) *QueryCjtestCjResRequest {
	s.Test3 = v
	return s
}

func (s *QueryCjtestCjResRequest) SetTestclass(v *Host) *QueryCjtestCjResRequest {
	s.Testclass = v
	return s
}

type QueryCjtestCjResResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s QueryCjtestCjResResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryCjtestCjResResponse) GoString() string {
	return s.String()
}

func (s *QueryCjtestCjResResponse) SetReqMsgId(v string) *QueryCjtestCjResResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryCjtestCjResResponse) SetResultCode(v string) *QueryCjtestCjResResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryCjtestCjResResponse) SetResultMsg(v string) *QueryCjtestCjResResponse {
	s.ResultMsg = &v
	return s
}

type QueryLoadtestTimeOneRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 毫秒值
	Timeout *int64 `json:"timeout,omitempty" xml:"timeout,omitempty" require:"true"`
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

func (s *QueryLoadtestTimeOneRequest) SetTimeout(v int64) *QueryLoadtestTimeOneRequest {
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
	Timeout *int64 `json:"timeout,omitempty" xml:"timeout,omitempty" require:"true"`
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

func (s *QueryLoadtestTimeTwoRequest) SetTimeout(v int64) *QueryLoadtestTimeTwoRequest {
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

type QueryApdevcenterTestobjectTestsubRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// test
	Test *string `json:"test,omitempty" xml:"test,omitempty" require:"true" maxLength:"200" minLength:"200"`
}

func (s QueryApdevcenterTestobjectTestsubRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryApdevcenterTestobjectTestsubRequest) GoString() string {
	return s.String()
}

func (s *QueryApdevcenterTestobjectTestsubRequest) SetAuthToken(v string) *QueryApdevcenterTestobjectTestsubRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryApdevcenterTestobjectTestsubRequest) SetProductInstanceId(v string) *QueryApdevcenterTestobjectTestsubRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryApdevcenterTestobjectTestsubRequest) SetTest(v string) *QueryApdevcenterTestobjectTestsubRequest {
	s.Test = &v
	return s
}

type QueryApdevcenterTestobjectTestsubResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s QueryApdevcenterTestobjectTestsubResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryApdevcenterTestobjectTestsubResponse) GoString() string {
	return s.String()
}

func (s *QueryApdevcenterTestobjectTestsubResponse) SetReqMsgId(v string) *QueryApdevcenterTestobjectTestsubResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryApdevcenterTestobjectTestsubResponse) SetResultCode(v string) *QueryApdevcenterTestobjectTestsubResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryApdevcenterTestobjectTestsubResponse) SetResultMsg(v string) *QueryApdevcenterTestobjectTestsubResponse {
	s.ResultMsg = &v
	return s
}

type QueryApdevcenterTestobjectTestsubaRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 主键
	Id *int64 `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true" maxLength:"521"`
	// test
	Test *string `json:"test,omitempty" xml:"test,omitempty" require:"true"`
}

func (s QueryApdevcenterTestobjectTestsubaRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryApdevcenterTestobjectTestsubaRequest) GoString() string {
	return s.String()
}

func (s *QueryApdevcenterTestobjectTestsubaRequest) SetAuthToken(v string) *QueryApdevcenterTestobjectTestsubaRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryApdevcenterTestobjectTestsubaRequest) SetProductInstanceId(v string) *QueryApdevcenterTestobjectTestsubaRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryApdevcenterTestobjectTestsubaRequest) SetId(v int64) *QueryApdevcenterTestobjectTestsubaRequest {
	s.Id = &v
	return s
}

func (s *QueryApdevcenterTestobjectTestsubaRequest) SetName(v string) *QueryApdevcenterTestobjectTestsubaRequest {
	s.Name = &v
	return s
}

func (s *QueryApdevcenterTestobjectTestsubaRequest) SetTest(v string) *QueryApdevcenterTestobjectTestsubaRequest {
	s.Test = &v
	return s
}

type QueryApdevcenterTestobjectTestsubaResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 主键
	Id *int64 `json:"id,omitempty" xml:"id,omitempty"`
	// 名称
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 描述
	Desc *string `json:"desc,omitempty" xml:"desc,omitempty"`
}

func (s QueryApdevcenterTestobjectTestsubaResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryApdevcenterTestobjectTestsubaResponse) GoString() string {
	return s.String()
}

func (s *QueryApdevcenterTestobjectTestsubaResponse) SetReqMsgId(v string) *QueryApdevcenterTestobjectTestsubaResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryApdevcenterTestobjectTestsubaResponse) SetResultCode(v string) *QueryApdevcenterTestobjectTestsubaResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryApdevcenterTestobjectTestsubaResponse) SetResultMsg(v string) *QueryApdevcenterTestobjectTestsubaResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryApdevcenterTestobjectTestsubaResponse) SetId(v int64) *QueryApdevcenterTestobjectTestsubaResponse {
	s.Id = &v
	return s
}

func (s *QueryApdevcenterTestobjectTestsubaResponse) SetName(v string) *QueryApdevcenterTestobjectTestsubaResponse {
	s.Name = &v
	return s
}

func (s *QueryApdevcenterTestobjectTestsubaResponse) SetDesc(v string) *QueryApdevcenterTestobjectTestsubaResponse {
	s.Desc = &v
	return s
}

type QueryTestFilesystemFileinfoRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 主键
	Id *int64 `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
}

func (s QueryTestFilesystemFileinfoRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryTestFilesystemFileinfoRequest) GoString() string {
	return s.String()
}

func (s *QueryTestFilesystemFileinfoRequest) SetAuthToken(v string) *QueryTestFilesystemFileinfoRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryTestFilesystemFileinfoRequest) SetProductInstanceId(v string) *QueryTestFilesystemFileinfoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryTestFilesystemFileinfoRequest) SetId(v int64) *QueryTestFilesystemFileinfoRequest {
	s.Id = &v
	return s
}

func (s *QueryTestFilesystemFileinfoRequest) SetName(v string) *QueryTestFilesystemFileinfoRequest {
	s.Name = &v
	return s
}

type QueryTestFilesystemFileinfoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 主键
	Id *int64 `json:"id,omitempty" xml:"id,omitempty"`
	// 名称
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
}

func (s QueryTestFilesystemFileinfoResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryTestFilesystemFileinfoResponse) GoString() string {
	return s.String()
}

func (s *QueryTestFilesystemFileinfoResponse) SetReqMsgId(v string) *QueryTestFilesystemFileinfoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryTestFilesystemFileinfoResponse) SetResultCode(v string) *QueryTestFilesystemFileinfoResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryTestFilesystemFileinfoResponse) SetResultMsg(v string) *QueryTestFilesystemFileinfoResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryTestFilesystemFileinfoResponse) SetId(v int64) *QueryTestFilesystemFileinfoResponse {
	s.Id = &v
	return s
}

func (s *QueryTestFilesystemFileinfoResponse) SetName(v string) *QueryTestFilesystemFileinfoResponse {
	s.Name = &v
	return s
}

type QueryTestproductTestobjectTestsubaaaRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// test
	Id *int64 `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// test
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
}

func (s QueryTestproductTestobjectTestsubaaaRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryTestproductTestobjectTestsubaaaRequest) GoString() string {
	return s.String()
}

func (s *QueryTestproductTestobjectTestsubaaaRequest) SetAuthToken(v string) *QueryTestproductTestobjectTestsubaaaRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryTestproductTestobjectTestsubaaaRequest) SetProductInstanceId(v string) *QueryTestproductTestobjectTestsubaaaRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryTestproductTestobjectTestsubaaaRequest) SetId(v int64) *QueryTestproductTestobjectTestsubaaaRequest {
	s.Id = &v
	return s
}

func (s *QueryTestproductTestobjectTestsubaaaRequest) SetName(v string) *QueryTestproductTestobjectTestsubaaaRequest {
	s.Name = &v
	return s
}

type QueryTestproductTestobjectTestsubaaaResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// test
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
}

func (s QueryTestproductTestobjectTestsubaaaResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryTestproductTestobjectTestsubaaaResponse) GoString() string {
	return s.String()
}

func (s *QueryTestproductTestobjectTestsubaaaResponse) SetReqMsgId(v string) *QueryTestproductTestobjectTestsubaaaResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryTestproductTestobjectTestsubaaaResponse) SetResultCode(v string) *QueryTestproductTestobjectTestsubaaaResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryTestproductTestobjectTestsubaaaResponse) SetResultMsg(v string) *QueryTestproductTestobjectTestsubaaaResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryTestproductTestobjectTestsubaaaResponse) SetName(v string) *QueryTestproductTestobjectTestsubaaaResponse {
	s.Name = &v
	return s
}

type RegisterTestBizeventMessageRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s RegisterTestBizeventMessageRequest) String() string {
	return tea.Prettify(s)
}

func (s RegisterTestBizeventMessageRequest) GoString() string {
	return s.String()
}

func (s *RegisterTestBizeventMessageRequest) SetAuthToken(v string) *RegisterTestBizeventMessageRequest {
	s.AuthToken = &v
	return s
}

func (s *RegisterTestBizeventMessageRequest) SetProductInstanceId(v string) *RegisterTestBizeventMessageRequest {
	s.ProductInstanceId = &v
	return s
}

type RegisterTestBizeventMessageResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s RegisterTestBizeventMessageResponse) String() string {
	return tea.Prettify(s)
}

func (s RegisterTestBizeventMessageResponse) GoString() string {
	return s.String()
}

func (s *RegisterTestBizeventMessageResponse) SetReqMsgId(v string) *RegisterTestBizeventMessageResponse {
	s.ReqMsgId = &v
	return s
}

func (s *RegisterTestBizeventMessageResponse) SetResultCode(v string) *RegisterTestBizeventMessageResponse {
	s.ResultCode = &v
	return s
}

func (s *RegisterTestBizeventMessageResponse) SetResultMsg(v string) *RegisterTestBizeventMessageResponse {
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

type CreateAutoGenerateCodeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 必填参数
	String1 *string `json:"string_1,omitempty" xml:"string_1,omitempty" require:"true"`
	// 非必填参数
	String2 *string `json:"string_2,omitempty" xml:"string_2,omitempty"`
	// 长度限制2~5位
	String3 *string `json:"string_3,omitempty" xml:"string_3,omitempty" require:"true" maxLength:"5" minLength:"2"`
	// 长度限制3~5位
	String4 *string `json:"string_4,omitempty" xml:"string_4,omitempty" maxLength:"5" minLength:"3"`
	// 数值必填
	Number1 *int64 `json:"number_1,omitempty" xml:"number_1,omitempty" require:"true"`
	// 数值非必填
	Number2 *int64 `json:"number_2,omitempty" xml:"number_2,omitempty"`
	// 最小2，最大10
	Number3 *int64 `json:"number_3,omitempty" xml:"number_3,omitempty" require:"true" maximum:"10" minimum:"2"`
	// 最小1，最大5
	Number4 *int64 `json:"number_4,omitempty" xml:"number_4,omitempty" maximum:"5" minimum:"1"`
	// boolean必填
	Boolean1 *bool `json:"boolean_1,omitempty" xml:"boolean_1,omitempty" require:"true"`
	// boolean非必填
	Boolean2 *bool `json:"boolean_2,omitempty" xml:"boolean_2,omitempty"`
	// 必填日期
	Date1 *string `json:"date_1,omitempty" xml:"date_1,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 非必填日期
	Date2 *string `json:"date_2,omitempty" xml:"date_2,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 必填array
	Array1 []*int64 `json:"array_1,omitempty" xml:"array_1,omitempty" require:"true" type:"Repeated"`
	// 非必填array
	Array2 []*int64 `json:"array_2,omitempty" xml:"array_2,omitempty" type:"Repeated"`
	// 必填struct
	Struct1 *GroupAClass `json:"struct_1,omitempty" xml:"struct_1,omitempty" require:"true"`
	// 非必填struct
	Struct2 *GroupAClass `json:"struct_2,omitempty" xml:"struct_2,omitempty" require:"true"`
}

func (s CreateAutoGenerateCodeRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateAutoGenerateCodeRequest) GoString() string {
	return s.String()
}

func (s *CreateAutoGenerateCodeRequest) SetAuthToken(v string) *CreateAutoGenerateCodeRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateAutoGenerateCodeRequest) SetProductInstanceId(v string) *CreateAutoGenerateCodeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateAutoGenerateCodeRequest) SetString1(v string) *CreateAutoGenerateCodeRequest {
	s.String1 = &v
	return s
}

func (s *CreateAutoGenerateCodeRequest) SetString2(v string) *CreateAutoGenerateCodeRequest {
	s.String2 = &v
	return s
}

func (s *CreateAutoGenerateCodeRequest) SetString3(v string) *CreateAutoGenerateCodeRequest {
	s.String3 = &v
	return s
}

func (s *CreateAutoGenerateCodeRequest) SetString4(v string) *CreateAutoGenerateCodeRequest {
	s.String4 = &v
	return s
}

func (s *CreateAutoGenerateCodeRequest) SetNumber1(v int64) *CreateAutoGenerateCodeRequest {
	s.Number1 = &v
	return s
}

func (s *CreateAutoGenerateCodeRequest) SetNumber2(v int64) *CreateAutoGenerateCodeRequest {
	s.Number2 = &v
	return s
}

func (s *CreateAutoGenerateCodeRequest) SetNumber3(v int64) *CreateAutoGenerateCodeRequest {
	s.Number3 = &v
	return s
}

func (s *CreateAutoGenerateCodeRequest) SetNumber4(v int64) *CreateAutoGenerateCodeRequest {
	s.Number4 = &v
	return s
}

func (s *CreateAutoGenerateCodeRequest) SetBoolean1(v bool) *CreateAutoGenerateCodeRequest {
	s.Boolean1 = &v
	return s
}

func (s *CreateAutoGenerateCodeRequest) SetBoolean2(v bool) *CreateAutoGenerateCodeRequest {
	s.Boolean2 = &v
	return s
}

func (s *CreateAutoGenerateCodeRequest) SetDate1(v string) *CreateAutoGenerateCodeRequest {
	s.Date1 = &v
	return s
}

func (s *CreateAutoGenerateCodeRequest) SetDate2(v string) *CreateAutoGenerateCodeRequest {
	s.Date2 = &v
	return s
}

func (s *CreateAutoGenerateCodeRequest) SetArray1(v []*int64) *CreateAutoGenerateCodeRequest {
	s.Array1 = v
	return s
}

func (s *CreateAutoGenerateCodeRequest) SetArray2(v []*int64) *CreateAutoGenerateCodeRequest {
	s.Array2 = v
	return s
}

func (s *CreateAutoGenerateCodeRequest) SetStruct1(v *GroupAClass) *CreateAutoGenerateCodeRequest {
	s.Struct1 = v
	return s
}

func (s *CreateAutoGenerateCodeRequest) SetStruct2(v *GroupAClass) *CreateAutoGenerateCodeRequest {
	s.Struct2 = v
	return s
}

type CreateAutoGenerateCodeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CreateAutoGenerateCodeResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateAutoGenerateCodeResponse) GoString() string {
	return s.String()
}

func (s *CreateAutoGenerateCodeResponse) SetReqMsgId(v string) *CreateAutoGenerateCodeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateAutoGenerateCodeResponse) SetResultCode(v string) *CreateAutoGenerateCodeResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateAutoGenerateCodeResponse) SetResultMsg(v string) *CreateAutoGenerateCodeResponse {
	s.ResultMsg = &v
	return s
}

type QueryPreTestUseRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 2
	Struct1 *PreTestUse `json:"struct_1,omitempty" xml:"struct_1,omitempty" require:"true"`
	// 1
	Param1 *string `json:"param_1,omitempty" xml:"param_1,omitempty" require:"true"`
}

func (s QueryPreTestUseRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryPreTestUseRequest) GoString() string {
	return s.String()
}

func (s *QueryPreTestUseRequest) SetAuthToken(v string) *QueryPreTestUseRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryPreTestUseRequest) SetProductInstanceId(v string) *QueryPreTestUseRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryPreTestUseRequest) SetStruct1(v *PreTestUse) *QueryPreTestUseRequest {
	s.Struct1 = v
	return s
}

func (s *QueryPreTestUseRequest) SetParam1(v string) *QueryPreTestUseRequest {
	s.Param1 = &v
	return s
}

type QueryPreTestUseResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s QueryPreTestUseResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryPreTestUseResponse) GoString() string {
	return s.String()
}

func (s *QueryPreTestUseResponse) SetReqMsgId(v string) *QueryPreTestUseResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryPreTestUseResponse) SetResultCode(v string) *QueryPreTestUseResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryPreTestUseResponse) SetResultMsg(v string) *QueryPreTestUseResponse {
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
				"sdk_version":      tea.String("1.0.309"),
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
 * Description: Demo接口，返回当前输入的值
 * Summary: 返回输入值1
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
 * Description: Demo接口，返回当前输入的值
 * Summary: 返回输入值1
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
 * Description: 简介简介简介s
 * Summary: 简介简介
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
 * Description: 简介简介简介s
 * Summary: 简介简介
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
 * Description: 测试网关评审能力
 * Summary: 评审测试
 */
func (client *Client) UpdateCjtestCj(request *UpdateCjtestCjRequest) (_result *UpdateCjtestCjResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateCjtestCjResponse{}
	_body, _err := client.UpdateCjtestCjEx(request, headers, runtime)
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
func (client *Client) UpdateCjtestCjEx(request *UpdateCjtestCjRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateCjtestCjResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateCjtestCjResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.cjtest.cj.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 文件测试1
 * Summary: 文件测试
 */
func (client *Client) UploadCjtestSourceFile(request *UploadCjtestSourceFileRequest) (_result *UploadCjtestSourceFileResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UploadCjtestSourceFileResponse{}
	_body, _err := client.UploadCjtestSourceFileEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 文件测试1
 * Summary: 文件测试
 */
func (client *Client) UploadCjtestSourceFileEx(request *UploadCjtestSourceFileRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UploadCjtestSourceFileResponse, _err error) {
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

		if !tea.BoolValue(antchainutil.IsSuccess(uploadResp.ResultCode, tea.String("OK"))) {
			uploadCjtestSourceFileResponse := &UploadCjtestSourceFileResponse{
				ReqMsgId:   uploadResp.ReqMsgId,
				ResultCode: uploadResp.ResultCode,
				ResultMsg:  uploadResp.ResultMsg,
			}
			_result = uploadCjtestSourceFileResponse
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
	_result = &UploadCjtestSourceFileResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.cjtest.source.file.upload"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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

/**
 * Description: 根据入参组合返回结果，Fr 自动化连通性测试。
 * Summary: road.init（Fr AutoT）
 */
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

/**
 * Description: 近端网关测试接口
 * Summary: 近端网关测试接口（勿删）
 */
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

/**
 * Description: 近端网关测试接口
 * Summary: 近端网关测试接口（勿删）
 */
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

/**
 * Description: 更新入参后返回结果，Fr 自动化连通性测试。
 * Summary: road.upd（Fr AutoT）
 */
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

/**
 * Description: 更新入参后返回结果，Fr 自动化连通性测试。
 * Summary: road.upd（Fr AutoT）
 */
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

/**
 * Description: cj test
 * Summary: cj test1
 */
func (client *Client) InitCjtestAcopmRes(request *InitCjtestAcopmResRequest) (_result *InitCjtestAcopmResResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &InitCjtestAcopmResResponse{}
	_body, _err := client.InitCjtestAcopmResEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: cj test
 * Summary: cj test1
 */
func (client *Client) InitCjtestAcopmResEx(request *InitCjtestAcopmResRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *InitCjtestAcopmResResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &InitCjtestAcopmResResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.cjtest.acopm.res.init"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询并返回结果，Fr 自动化连通性测试。
 * Summary: road.query（Fr AutoT）
 */
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

/**
 * Description: 查询并返回结果，Fr 自动化连通性测试。
 * Summary: road.query（Fr AutoT）
 */
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

/**
 * Description: 执行计算后返回，Fr 自动化连通性测试。
 * Summary: road.exec（Fr AutoT）
 */
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

/**
 * Description: 执行计算后返回，Fr 自动化连通性测试。
 * Summary: road.exec（Fr AutoT）
 */
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

/**
 * Description: 压测接口3
 * Summary: 压测接口3
 */
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

/**
 * Description: 压测接口3
 * Summary: 压测接口3
 */
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

/**
 * Description: 测试自动生成回归测试代码
 * Summary: 测试自动生成回归测试代码
 */
func (client *Client) CreateAutoTestCode(request *CreateAutoTestCodeRequest) (_result *CreateAutoTestCodeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateAutoTestCodeResponse{}
	_body, _err := client.CreateAutoTestCodeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 测试自动生成回归测试代码
 * Summary: 测试自动生成回归测试代码
 */
func (client *Client) CreateAutoTestCodeEx(request *CreateAutoTestCodeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateAutoTestCodeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateAutoTestCodeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.auto.test.code.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 123
 * Summary: 测试用api
 */
func (client *Client) QueryDemoAbcAbc(request *QueryDemoAbcAbcRequest) (_result *QueryDemoAbcAbcResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDemoAbcAbcResponse{}
	_body, _err := client.QueryDemoAbcAbcEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 123
 * Summary: 测试用api
 */
func (client *Client) QueryDemoAbcAbcEx(request *QueryDemoAbcAbcRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDemoAbcAbcResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDemoAbcAbcResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.demo.abc.abc.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) QueryXxxxTestxAaa(request *QueryXxxxTestxAaaRequest) (_result *QueryXxxxTestxAaaResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryXxxxTestxAaaResponse{}
	_body, _err := client.QueryXxxxTestxAaaEx(request, headers, runtime)
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
func (client *Client) QueryXxxxTestxAaaEx(request *QueryXxxxTestxAaaRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryXxxxTestxAaaResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryXxxxTestxAaaResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.xxxx.testx.aaa.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) QueryTestTestaTesta(request *QueryTestTestaTestaRequest) (_result *QueryTestTestaTestaResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryTestTestaTestaResponse{}
	_body, _err := client.QueryTestTestaTestaEx(request, headers, runtime)
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
func (client *Client) QueryTestTestaTestaEx(request *QueryTestTestaTestaRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryTestTestaTestaResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryTestTestaTestaResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.test.testa.testa.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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

/**
 * Description: test
 * Summary: test
 */
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

/**
 * Description: test
 * Summary: test
 */
func (client *Client) QueryBusinessTest(request *QueryBusinessTestRequest) (_result *QueryBusinessTestResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryBusinessTestResponse{}
	_body, _err := client.QueryBusinessTestEx(request, headers, runtime)
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
func (client *Client) QueryBusinessTestEx(request *QueryBusinessTestRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryBusinessTestResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryBusinessTestResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.business.test.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 设置下游耗时
 * Summary: 超时（加密）
 */
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

/**
 * Description: 设置下游耗时
 * Summary: 超时（加密）
 */
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

/**
 * Description: 测试使用
 * Summary: testuse1
 */
func (client *Client) QueryBusinessCodeTest(request *QueryBusinessCodeTestRequest) (_result *QueryBusinessCodeTestResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryBusinessCodeTestResponse{}
	_body, _err := client.QueryBusinessCodeTestEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 测试使用
 * Summary: testuse1
 */
func (client *Client) QueryBusinessCodeTestEx(request *QueryBusinessCodeTestRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryBusinessCodeTestResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryBusinessCodeTestResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.business.code.test.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 双百&门户&网关，停服决策测试使用
 * Summary: 商业化规则测试
 */
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

/**
 * Description: 双百&门户&网关，停服决策测试使用
 * Summary: 商业化规则测试
 */
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

/**
 * Description: 研发自测使用API
 * Summary: 研发自测使用API
 */
func (client *Client) QueryDevelopTestUse(request *QueryDevelopTestUseRequest) (_result *QueryDevelopTestUseResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDevelopTestUseResponse{}
	_body, _err := client.QueryDevelopTestUseEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 研发自测使用API
 * Summary: 研发自测使用API
 */
func (client *Client) QueryDevelopTestUseEx(request *QueryDevelopTestUseRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDevelopTestUseResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDevelopTestUseResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.develop.test.use.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 资损防控研发自测使用API
 * Summary: 研发自测使用API
 */
func (client *Client) VerifyDevelopTestTest(request *VerifyDevelopTestTestRequest) (_result *VerifyDevelopTestTestResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &VerifyDevelopTestTestResponse{}
	_body, _err := client.VerifyDevelopTestTestEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 资损防控研发自测使用API
 * Summary: 研发自测使用API
 */
func (client *Client) VerifyDevelopTestTestEx(request *VerifyDevelopTestTestRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *VerifyDevelopTestTestResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &VerifyDevelopTestTestResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.develop.test.test.verify"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 用于测试预发环境RDS切OB之后的同步功能
 * Summary: 预发RDS切OB测试
 */
func (client *Client) ImportPreObWrite(request *ImportPreObWriteRequest) (_result *ImportPreObWriteResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ImportPreObWriteResponse{}
	_body, _err := client.ImportPreObWriteEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 用于测试预发环境RDS切OB之后的同步功能
 * Summary: 预发RDS切OB测试
 */
func (client *Client) ImportPreObWriteEx(request *ImportPreObWriteRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ImportPreObWriteResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ImportPreObWriteResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.pre.ob.write.import"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
 * Description: 用于上海非金生产环境的同步测试
 * Summary: 上海非金生产环境测试
 */
func (client *Client) OperateShanghaiPreTest(request *OperateShanghaiPreTestRequest) (_result *OperateShanghaiPreTestResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &OperateShanghaiPreTestResponse{}
	_body, _err := client.OperateShanghaiPreTestEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 用于上海非金生产环境的同步测试
 * Summary: 上海非金生产环境测试
 */
func (client *Client) OperateShanghaiPreTestEx(request *OperateShanghaiPreTestRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *OperateShanghaiPreTestResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &OperateShanghaiPreTestResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.shanghai.pre.test.operate"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: cj test
 * Summary: cj test1
 */
func (client *Client) QueryCjtestCjRes(request *QueryCjtestCjResRequest) (_result *QueryCjtestCjResResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryCjtestCjResResponse{}
	_body, _err := client.QueryCjtestCjResEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: cj test
 * Summary: cj test1
 */
func (client *Client) QueryCjtestCjResEx(request *QueryCjtestCjResRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryCjtestCjResResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryCjtestCjResResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.cjtest.cj.res.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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

/**
 * Description: 压测接口1
 * Summary: 压测接口1
 */
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

/**
 * Description: 压测接口2
 * Summary: 压测接口2
 */
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

/**
 * Description: 压测接口2
 * Summary: 压测接口2
 */
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

/**
 * Description: 测试使用1
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
 * Description: 测试使用1
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
 * Description: 测试
 * Summary: 测试ato异常
 */
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

/**
 * Description: 测试
 * Summary: 测试ato异常
 */
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

/**
 * Description: test
 * Summary: 新增API测试查询接口(只是测试使用)
 */
func (client *Client) QueryApdevcenterTestobjectTestsub(request *QueryApdevcenterTestobjectTestsubRequest) (_result *QueryApdevcenterTestobjectTestsubResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryApdevcenterTestobjectTestsubResponse{}
	_body, _err := client.QueryApdevcenterTestobjectTestsubEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: test
 * Summary: 新增API测试查询接口(只是测试使用)
 */
func (client *Client) QueryApdevcenterTestobjectTestsubEx(request *QueryApdevcenterTestobjectTestsubRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryApdevcenterTestobjectTestsubResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryApdevcenterTestobjectTestsubResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.apdevcenter.testobject.testsub.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: testtest
 * Summary: 新增API测试查询接口(只是测试使用)
 */
func (client *Client) QueryApdevcenterTestobjectTestsuba(request *QueryApdevcenterTestobjectTestsubaRequest) (_result *QueryApdevcenterTestobjectTestsubaResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryApdevcenterTestobjectTestsubaResponse{}
	_body, _err := client.QueryApdevcenterTestobjectTestsubaEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: testtest
 * Summary: 新增API测试查询接口(只是测试使用)
 */
func (client *Client) QueryApdevcenterTestobjectTestsubaEx(request *QueryApdevcenterTestobjectTestsubaRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryApdevcenterTestobjectTestsubaResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryApdevcenterTestobjectTestsubaResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.apdevcenter.testobject.testsuba.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: test
 * Summary: 新增API测试查询接口(只是测试使用)
 */
func (client *Client) QueryTestFilesystemFileinfo(request *QueryTestFilesystemFileinfoRequest) (_result *QueryTestFilesystemFileinfoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryTestFilesystemFileinfoResponse{}
	_body, _err := client.QueryTestFilesystemFileinfoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: test
 * Summary: 新增API测试查询接口(只是测试使用)
 */
func (client *Client) QueryTestFilesystemFileinfoEx(request *QueryTestFilesystemFileinfoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryTestFilesystemFileinfoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryTestFilesystemFileinfoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.test.filesystem.fileinfo.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: test
 * Summary: 新增API测试查询接口(只是测试使用)
 */
func (client *Client) QueryTestproductTestobjectTestsubaaa(request *QueryTestproductTestobjectTestsubaaaRequest) (_result *QueryTestproductTestobjectTestsubaaaResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryTestproductTestobjectTestsubaaaResponse{}
	_body, _err := client.QueryTestproductTestobjectTestsubaaaEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: test
 * Summary: 新增API测试查询接口(只是测试使用)
 */
func (client *Client) QueryTestproductTestobjectTestsubaaaEx(request *QueryTestproductTestobjectTestsubaaaRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryTestproductTestobjectTestsubaaaResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryTestproductTestobjectTestsubaaaResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.testproduct.testobject.testsubaaa.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 随机测试
 * Summary: 消息发送及消费
 */
func (client *Client) RegisterTestBizeventMessage(request *RegisterTestBizeventMessageRequest) (_result *RegisterTestBizeventMessageResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &RegisterTestBizeventMessageResponse{}
	_body, _err := client.RegisterTestBizeventMessageEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 随机测试
 * Summary: 消息发送及消费
 */
func (client *Client) RegisterTestBizeventMessageEx(request *RegisterTestBizeventMessageRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *RegisterTestBizeventMessageResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &RegisterTestBizeventMessageResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.test.bizevent.message.register"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 自动化测试创建test，请勿修改、删除
 * Summary: 自动化测试创建test1
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
 * Description: 自动化测试创建test，请勿修改、删除
 * Summary: 自动化测试创建test1
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
 * Description: 自动化测试创建111
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
 * Description: 自动化测试创建111
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
 * Description: 123
 * Summary: 测试用api
 */
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

/**
 * Description: 123
 * Summary: 测试用api
 */
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

/**
 * Description: 用于测试自动化脚本自动生成的功能
 * Summary: 自动生成自动化脚本测试
 */
func (client *Client) CreateAutoGenerateCode(request *CreateAutoGenerateCodeRequest) (_result *CreateAutoGenerateCodeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateAutoGenerateCodeResponse{}
	_body, _err := client.CreateAutoGenerateCodeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 用于测试自动化脚本自动生成的功能
 * Summary: 自动生成自动化脚本测试
 */
func (client *Client) CreateAutoGenerateCodeEx(request *CreateAutoGenerateCodeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateAutoGenerateCodeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateAutoGenerateCodeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.auto.generate.code.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 用于测试预发环境ob数据同步
 * Summary: 用于测试ob数据同步
 */
func (client *Client) QueryPreTestUse(request *QueryPreTestUseRequest) (_result *QueryPreTestUseResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryPreTestUseResponse{}
	_body, _err := client.QueryPreTestUseEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 用于测试预发环境ob数据同步
 * Summary: 用于测试ob数据同步
 */
func (client *Client) QueryPreTestUseEx(request *QueryPreTestUseRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryPreTestUseResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryPreTestUseResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.pre.test.use.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
