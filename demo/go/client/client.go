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

// 123
type TestA struct {
}

func (s TestA) String() string {
	return tea.Prettify(s)
}

func (s TestA) GoString() string {
	return s.String()
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
	// 日期类型入参
	Test4 *string `json:"test_4,omitempty" xml:"test_4,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 数组类型入参（数组内元素为结构体类型）
	Test5 []*NumberTest `json:"test_5,omitempty" xml:"test_5,omitempty" require:"true" type:"Repeated"`
	// 结构体入参
	Test6 *NumberTest `json:"test_6,omitempty" xml:"test_6,omitempty" require:"true"`
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

func (s *QueryGatewayMyRequest) SetTest4(v string) *QueryGatewayMyRequest {
	s.Test4 = &v
	return s
}

func (s *QueryGatewayMyRequest) SetTest5(v []*NumberTest) *QueryGatewayMyRequest {
	s.Test5 = v
	return s
}

func (s *QueryGatewayMyRequest) SetTest6(v *NumberTest) *QueryGatewayMyRequest {
	s.Test6 = v
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
	// 123
	TestParam []*DemoClass `json:"test_param,omitempty" xml:"test_param,omitempty" require:"true" type:"Repeated"`
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

func (s *BindGatewayAbcTestRequest) SetTestParam(v []*DemoClass) *BindGatewayAbcTestRequest {
	s.TestParam = v
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
	// 请求时间
	Time *string `json:"time,omitempty" xml:"time,omitempty" require:"true"`
	// 操作人
	Operator *string `json:"operator,omitempty" xml:"operator,omitempty" require:"true"`
	// 请求编号
	Count *int64 `json:"count,omitempty" xml:"count,omitempty" require:"true" maximum:"5" minimum:"1"`
	// 请求描述
	Desc *string `json:"desc,omitempty" xml:"desc,omitempty" maxLength:"15" minLength:"5"`
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

func (s *InitGatewayRoadRequest) SetTime(v string) *InitGatewayRoadRequest {
	s.Time = &v
	return s
}

func (s *InitGatewayRoadRequest) SetOperator(v string) *InitGatewayRoadRequest {
	s.Operator = &v
	return s
}

func (s *InitGatewayRoadRequest) SetCount(v int64) *InitGatewayRoadRequest {
	s.Count = &v
	return s
}

func (s *InitGatewayRoadRequest) SetDesc(v string) *InitGatewayRoadRequest {
	s.Desc = &v
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

type ImportTestSdkProductRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s ImportTestSdkProductRequest) String() string {
	return tea.Prettify(s)
}

func (s ImportTestSdkProductRequest) GoString() string {
	return s.String()
}

func (s *ImportTestSdkProductRequest) SetAuthToken(v string) *ImportTestSdkProductRequest {
	s.AuthToken = &v
	return s
}

func (s *ImportTestSdkProductRequest) SetProductInstanceId(v string) *ImportTestSdkProductRequest {
	s.ProductInstanceId = &v
	return s
}

type ImportTestSdkProductResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s ImportTestSdkProductResponse) String() string {
	return tea.Prettify(s)
}

func (s ImportTestSdkProductResponse) GoString() string {
	return s.String()
}

func (s *ImportTestSdkProductResponse) SetReqMsgId(v string) *ImportTestSdkProductResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ImportTestSdkProductResponse) SetResultCode(v string) *ImportTestSdkProductResponse {
	s.ResultCode = &v
	return s
}

func (s *ImportTestSdkProductResponse) SetResultMsg(v string) *ImportTestSdkProductResponse {
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

type QueryApiOfflineStatusRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// add
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
}

func (s QueryApiOfflineStatusRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryApiOfflineStatusRequest) GoString() string {
	return s.String()
}

func (s *QueryApiOfflineStatusRequest) SetAuthToken(v string) *QueryApiOfflineStatusRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryApiOfflineStatusRequest) SetProductInstanceId(v string) *QueryApiOfflineStatusRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryApiOfflineStatusRequest) SetName(v string) *QueryApiOfflineStatusRequest {
	s.Name = &v
	return s
}

type QueryApiOfflineStatusResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s QueryApiOfflineStatusResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryApiOfflineStatusResponse) GoString() string {
	return s.String()
}

func (s *QueryApiOfflineStatusResponse) SetReqMsgId(v string) *QueryApiOfflineStatusResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryApiOfflineStatusResponse) SetResultCode(v string) *QueryApiOfflineStatusResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryApiOfflineStatusResponse) SetResultMsg(v string) *QueryApiOfflineStatusResponse {
	s.ResultMsg = &v
	return s
}

type ImportDemoApistatusRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s ImportDemoApistatusRequest) String() string {
	return tea.Prettify(s)
}

func (s ImportDemoApistatusRequest) GoString() string {
	return s.String()
}

func (s *ImportDemoApistatusRequest) SetAuthToken(v string) *ImportDemoApistatusRequest {
	s.AuthToken = &v
	return s
}

func (s *ImportDemoApistatusRequest) SetProductInstanceId(v string) *ImportDemoApistatusRequest {
	s.ProductInstanceId = &v
	return s
}

type ImportDemoApistatusResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s ImportDemoApistatusResponse) String() string {
	return tea.Prettify(s)
}

func (s ImportDemoApistatusResponse) GoString() string {
	return s.String()
}

func (s *ImportDemoApistatusResponse) SetReqMsgId(v string) *ImportDemoApistatusResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ImportDemoApistatusResponse) SetResultCode(v string) *ImportDemoApistatusResponse {
	s.ResultCode = &v
	return s
}

func (s *ImportDemoApistatusResponse) SetResultMsg(v string) *ImportDemoApistatusResponse {
	s.ResultMsg = &v
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

type QueryDemoLulinSuccessRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s QueryDemoLulinSuccessRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDemoLulinSuccessRequest) GoString() string {
	return s.String()
}

func (s *QueryDemoLulinSuccessRequest) SetAuthToken(v string) *QueryDemoLulinSuccessRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDemoLulinSuccessRequest) SetProductInstanceId(v string) *QueryDemoLulinSuccessRequest {
	s.ProductInstanceId = &v
	return s
}

type QueryDemoLulinSuccessResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s QueryDemoLulinSuccessResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDemoLulinSuccessResponse) GoString() string {
	return s.String()
}

func (s *QueryDemoLulinSuccessResponse) SetReqMsgId(v string) *QueryDemoLulinSuccessResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDemoLulinSuccessResponse) SetResultCode(v string) *QueryDemoLulinSuccessResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDemoLulinSuccessResponse) SetResultMsg(v string) *QueryDemoLulinSuccessResponse {
	s.ResultMsg = &v
	return s
}

type QueryDemoLulinccDataRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s QueryDemoLulinccDataRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDemoLulinccDataRequest) GoString() string {
	return s.String()
}

func (s *QueryDemoLulinccDataRequest) SetAuthToken(v string) *QueryDemoLulinccDataRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDemoLulinccDataRequest) SetProductInstanceId(v string) *QueryDemoLulinccDataRequest {
	s.ProductInstanceId = &v
	return s
}

type QueryDemoLulinccDataResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s QueryDemoLulinccDataResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDemoLulinccDataResponse) GoString() string {
	return s.String()
}

func (s *QueryDemoLulinccDataResponse) SetReqMsgId(v string) *QueryDemoLulinccDataResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDemoLulinccDataResponse) SetResultCode(v string) *QueryDemoLulinccDataResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDemoLulinccDataResponse) SetResultMsg(v string) *QueryDemoLulinccDataResponse {
	s.ResultMsg = &v
	return s
}

type QueryDemoDefaultSdkcccRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s QueryDemoDefaultSdkcccRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDemoDefaultSdkcccRequest) GoString() string {
	return s.String()
}

func (s *QueryDemoDefaultSdkcccRequest) SetAuthToken(v string) *QueryDemoDefaultSdkcccRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDemoDefaultSdkcccRequest) SetProductInstanceId(v string) *QueryDemoDefaultSdkcccRequest {
	s.ProductInstanceId = &v
	return s
}

type QueryDemoDefaultSdkcccResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s QueryDemoDefaultSdkcccResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDemoDefaultSdkcccResponse) GoString() string {
	return s.String()
}

func (s *QueryDemoDefaultSdkcccResponse) SetReqMsgId(v string) *QueryDemoDefaultSdkcccResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDemoDefaultSdkcccResponse) SetResultCode(v string) *QueryDemoDefaultSdkcccResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDemoDefaultSdkcccResponse) SetResultMsg(v string) *QueryDemoDefaultSdkcccResponse {
	s.ResultMsg = &v
	return s
}

type QueryDemoDefaultSdkfffRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s QueryDemoDefaultSdkfffRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDemoDefaultSdkfffRequest) GoString() string {
	return s.String()
}

func (s *QueryDemoDefaultSdkfffRequest) SetAuthToken(v string) *QueryDemoDefaultSdkfffRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDemoDefaultSdkfffRequest) SetProductInstanceId(v string) *QueryDemoDefaultSdkfffRequest {
	s.ProductInstanceId = &v
	return s
}

type QueryDemoDefaultSdkfffResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s QueryDemoDefaultSdkfffResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDemoDefaultSdkfffResponse) GoString() string {
	return s.String()
}

func (s *QueryDemoDefaultSdkfffResponse) SetReqMsgId(v string) *QueryDemoDefaultSdkfffResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDemoDefaultSdkfffResponse) SetResultCode(v string) *QueryDemoDefaultSdkfffResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDemoDefaultSdkfffResponse) SetResultMsg(v string) *QueryDemoDefaultSdkfffResponse {
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

type QueryApprovalTestRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 字符串
	Input *string `json:"input,omitempty" xml:"input,omitempty" require:"true"`
	// name
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// age
	Age *string `json:"age,omitempty" xml:"age,omitempty" require:"true"`
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

func (s *QueryApprovalTestRequest) SetName(v string) *QueryApprovalTestRequest {
	s.Name = &v
	return s
}

func (s *QueryApprovalTestRequest) SetAge(v string) *QueryApprovalTestRequest {
	s.Age = &v
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

type QueryRoutingGrayscaleTestRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 1
	Data *int64 `json:"data,omitempty" xml:"data,omitempty" require:"true"`
}

func (s QueryRoutingGrayscaleTestRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryRoutingGrayscaleTestRequest) GoString() string {
	return s.String()
}

func (s *QueryRoutingGrayscaleTestRequest) SetAuthToken(v string) *QueryRoutingGrayscaleTestRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryRoutingGrayscaleTestRequest) SetProductInstanceId(v string) *QueryRoutingGrayscaleTestRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryRoutingGrayscaleTestRequest) SetData(v int64) *QueryRoutingGrayscaleTestRequest {
	s.Data = &v
	return s
}

type QueryRoutingGrayscaleTestResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s QueryRoutingGrayscaleTestResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryRoutingGrayscaleTestResponse) GoString() string {
	return s.String()
}

func (s *QueryRoutingGrayscaleTestResponse) SetReqMsgId(v string) *QueryRoutingGrayscaleTestResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryRoutingGrayscaleTestResponse) SetResultCode(v string) *QueryRoutingGrayscaleTestResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryRoutingGrayscaleTestResponse) SetResultMsg(v string) *QueryRoutingGrayscaleTestResponse {
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

type QueryShaofangTestRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 姓名
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true" maxLength:"20" minLength:"1"`
	// 日期
	Birth *string `json:"birth,omitempty" xml:"birth,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 文件
	// 待上传文件
	FileObject io.Reader `json:"fileObject,omitempty" xml:"fileObject,omitempty"`
	// 待上传文件名
	FileObjectName *string `json:"fileObjectName,omitempty" xml:"fileObjectName,omitempty"`
	FileId         *string `json:"file_id,omitempty" xml:"file_id,omitempty" maxLength:"20" minLength:"1"`
}

func (s QueryShaofangTestRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryShaofangTestRequest) GoString() string {
	return s.String()
}

func (s *QueryShaofangTestRequest) SetAuthToken(v string) *QueryShaofangTestRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryShaofangTestRequest) SetProductInstanceId(v string) *QueryShaofangTestRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryShaofangTestRequest) SetName(v string) *QueryShaofangTestRequest {
	s.Name = &v
	return s
}

func (s *QueryShaofangTestRequest) SetBirth(v string) *QueryShaofangTestRequest {
	s.Birth = &v
	return s
}

func (s *QueryShaofangTestRequest) SetFileObject(v io.Reader) *QueryShaofangTestRequest {
	s.FileObject = v
	return s
}

func (s *QueryShaofangTestRequest) SetFileObjectName(v string) *QueryShaofangTestRequest {
	s.FileObjectName = &v
	return s
}

func (s *QueryShaofangTestRequest) SetFileId(v string) *QueryShaofangTestRequest {
	s.FileId = &v
	return s
}

type QueryShaofangTestResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// the_one
	TheOne *string `json:"the_one,omitempty" xml:"the_one,omitempty"`
	// the_two
	TheTwo *int64 `json:"the_two,omitempty" xml:"the_two,omitempty"`
}

func (s QueryShaofangTestResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryShaofangTestResponse) GoString() string {
	return s.String()
}

func (s *QueryShaofangTestResponse) SetReqMsgId(v string) *QueryShaofangTestResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryShaofangTestResponse) SetResultCode(v string) *QueryShaofangTestResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryShaofangTestResponse) SetResultMsg(v string) *QueryShaofangTestResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryShaofangTestResponse) SetTheOne(v string) *QueryShaofangTestResponse {
	s.TheOne = &v
	return s
}

func (s *QueryShaofangTestResponse) SetTheTwo(v int64) *QueryShaofangTestResponse {
	s.TheTwo = &v
	return s
}

type QueryShaofangTestTrRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 姓名
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
}

func (s QueryShaofangTestTrRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryShaofangTestTrRequest) GoString() string {
	return s.String()
}

func (s *QueryShaofangTestTrRequest) SetAuthToken(v string) *QueryShaofangTestTrRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryShaofangTestTrRequest) SetProductInstanceId(v string) *QueryShaofangTestTrRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryShaofangTestTrRequest) SetName(v string) *QueryShaofangTestTrRequest {
	s.Name = &v
	return s
}

type QueryShaofangTestTrResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s QueryShaofangTestTrResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryShaofangTestTrResponse) GoString() string {
	return s.String()
}

func (s *QueryShaofangTestTrResponse) SetReqMsgId(v string) *QueryShaofangTestTrResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryShaofangTestTrResponse) SetResultCode(v string) *QueryShaofangTestTrResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryShaofangTestTrResponse) SetResultMsg(v string) *QueryShaofangTestTrResponse {
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

type ResetSaasTestApiRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
}

func (s ResetSaasTestApiRequest) String() string {
	return tea.Prettify(s)
}

func (s ResetSaasTestApiRequest) GoString() string {
	return s.String()
}

func (s *ResetSaasTestApiRequest) SetAuthToken(v string) *ResetSaasTestApiRequest {
	s.AuthToken = &v
	return s
}

func (s *ResetSaasTestApiRequest) SetProductInstanceId(v string) *ResetSaasTestApiRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ResetSaasTestApiRequest) SetName(v string) *ResetSaasTestApiRequest {
	s.Name = &v
	return s
}

type ResetSaasTestApiResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 调用成功状态
	Success *string `json:"success,omitempty" xml:"success,omitempty"`
}

func (s ResetSaasTestApiResponse) String() string {
	return tea.Prettify(s)
}

func (s ResetSaasTestApiResponse) GoString() string {
	return s.String()
}

func (s *ResetSaasTestApiResponse) SetReqMsgId(v string) *ResetSaasTestApiResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ResetSaasTestApiResponse) SetResultCode(v string) *ResetSaasTestApiResponse {
	s.ResultCode = &v
	return s
}

func (s *ResetSaasTestApiResponse) SetResultMsg(v string) *ResetSaasTestApiResponse {
	s.ResultMsg = &v
	return s
}

func (s *ResetSaasTestApiResponse) SetSuccess(v string) *ResetSaasTestApiResponse {
	s.Success = &v
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

type QueryGongxiangTestDemoRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 验证字符
	Character1 *string `json:"character1,omitempty" xml:"character1,omitempty" require:"true"`
}

func (s QueryGongxiangTestDemoRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryGongxiangTestDemoRequest) GoString() string {
	return s.String()
}

func (s *QueryGongxiangTestDemoRequest) SetAuthToken(v string) *QueryGongxiangTestDemoRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryGongxiangTestDemoRequest) SetProductInstanceId(v string) *QueryGongxiangTestDemoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryGongxiangTestDemoRequest) SetCharacter1(v string) *QueryGongxiangTestDemoRequest {
	s.Character1 = &v
	return s
}

type QueryGongxiangTestDemoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// aaaaaa
	Character1 *string `json:"character1,omitempty" xml:"character1,omitempty"`
}

func (s QueryGongxiangTestDemoResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryGongxiangTestDemoResponse) GoString() string {
	return s.String()
}

func (s *QueryGongxiangTestDemoResponse) SetReqMsgId(v string) *QueryGongxiangTestDemoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryGongxiangTestDemoResponse) SetResultCode(v string) *QueryGongxiangTestDemoResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryGongxiangTestDemoResponse) SetResultMsg(v string) *QueryGongxiangTestDemoResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryGongxiangTestDemoResponse) SetCharacter1(v string) *QueryGongxiangTestDemoResponse {
	s.Character1 = &v
	return s
}

type QuerySaasTestTestaRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 张三
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 12
	Age *int64 `json:"age,omitempty" xml:"age,omitempty" require:"true"`
}

func (s QuerySaasTestTestaRequest) String() string {
	return tea.Prettify(s)
}

func (s QuerySaasTestTestaRequest) GoString() string {
	return s.String()
}

func (s *QuerySaasTestTestaRequest) SetAuthToken(v string) *QuerySaasTestTestaRequest {
	s.AuthToken = &v
	return s
}

func (s *QuerySaasTestTestaRequest) SetProductInstanceId(v string) *QuerySaasTestTestaRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QuerySaasTestTestaRequest) SetName(v string) *QuerySaasTestTestaRequest {
	s.Name = &v
	return s
}

func (s *QuerySaasTestTestaRequest) SetAge(v int64) *QuerySaasTestTestaRequest {
	s.Age = &v
	return s
}

type QuerySaasTestTestaResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 男
	Sex *string `json:"sex,omitempty" xml:"sex,omitempty"`
}

func (s QuerySaasTestTestaResponse) String() string {
	return tea.Prettify(s)
}

func (s QuerySaasTestTestaResponse) GoString() string {
	return s.String()
}

func (s *QuerySaasTestTestaResponse) SetReqMsgId(v string) *QuerySaasTestTestaResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QuerySaasTestTestaResponse) SetResultCode(v string) *QuerySaasTestTestaResponse {
	s.ResultCode = &v
	return s
}

func (s *QuerySaasTestTestaResponse) SetResultMsg(v string) *QuerySaasTestTestaResponse {
	s.ResultMsg = &v
	return s
}

func (s *QuerySaasTestTestaResponse) SetSex(v string) *QuerySaasTestTestaResponse {
	s.Sex = &v
	return s
}

type ImportSaasTestTestbRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 李四
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 18
	Age *int64 `json:"age,omitempty" xml:"age,omitempty" require:"true"`
}

func (s ImportSaasTestTestbRequest) String() string {
	return tea.Prettify(s)
}

func (s ImportSaasTestTestbRequest) GoString() string {
	return s.String()
}

func (s *ImportSaasTestTestbRequest) SetAuthToken(v string) *ImportSaasTestTestbRequest {
	s.AuthToken = &v
	return s
}

func (s *ImportSaasTestTestbRequest) SetProductInstanceId(v string) *ImportSaasTestTestbRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ImportSaasTestTestbRequest) SetName(v string) *ImportSaasTestTestbRequest {
	s.Name = &v
	return s
}

func (s *ImportSaasTestTestbRequest) SetAge(v int64) *ImportSaasTestTestbRequest {
	s.Age = &v
	return s
}

type ImportSaasTestTestbResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 男
	Sex *string `json:"sex,omitempty" xml:"sex,omitempty"`
}

func (s ImportSaasTestTestbResponse) String() string {
	return tea.Prettify(s)
}

func (s ImportSaasTestTestbResponse) GoString() string {
	return s.String()
}

func (s *ImportSaasTestTestbResponse) SetReqMsgId(v string) *ImportSaasTestTestbResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ImportSaasTestTestbResponse) SetResultCode(v string) *ImportSaasTestTestbResponse {
	s.ResultCode = &v
	return s
}

func (s *ImportSaasTestTestbResponse) SetResultMsg(v string) *ImportSaasTestTestbResponse {
	s.ResultMsg = &v
	return s
}

func (s *ImportSaasTestTestbResponse) SetSex(v string) *ImportSaasTestTestbResponse {
	s.Sex = &v
	return s
}

type PublishSaasTestTestcRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 张三
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 14
	Age *int64 `json:"age,omitempty" xml:"age,omitempty" require:"true"`
}

func (s PublishSaasTestTestcRequest) String() string {
	return tea.Prettify(s)
}

func (s PublishSaasTestTestcRequest) GoString() string {
	return s.String()
}

func (s *PublishSaasTestTestcRequest) SetAuthToken(v string) *PublishSaasTestTestcRequest {
	s.AuthToken = &v
	return s
}

func (s *PublishSaasTestTestcRequest) SetProductInstanceId(v string) *PublishSaasTestTestcRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PublishSaasTestTestcRequest) SetName(v string) *PublishSaasTestTestcRequest {
	s.Name = &v
	return s
}

func (s *PublishSaasTestTestcRequest) SetAge(v int64) *PublishSaasTestTestcRequest {
	s.Age = &v
	return s
}

type PublishSaasTestTestcResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 男
	Sex *string `json:"sex,omitempty" xml:"sex,omitempty"`
}

func (s PublishSaasTestTestcResponse) String() string {
	return tea.Prettify(s)
}

func (s PublishSaasTestTestcResponse) GoString() string {
	return s.String()
}

func (s *PublishSaasTestTestcResponse) SetReqMsgId(v string) *PublishSaasTestTestcResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PublishSaasTestTestcResponse) SetResultCode(v string) *PublishSaasTestTestcResponse {
	s.ResultCode = &v
	return s
}

func (s *PublishSaasTestTestcResponse) SetResultMsg(v string) *PublishSaasTestTestcResponse {
	s.ResultMsg = &v
	return s
}

func (s *PublishSaasTestTestcResponse) SetSex(v string) *PublishSaasTestTestcResponse {
	s.Sex = &v
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

type BindGongxaingTestRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s BindGongxaingTestRequest) String() string {
	return tea.Prettify(s)
}

func (s BindGongxaingTestRequest) GoString() string {
	return s.String()
}

func (s *BindGongxaingTestRequest) SetAuthToken(v string) *BindGongxaingTestRequest {
	s.AuthToken = &v
	return s
}

func (s *BindGongxaingTestRequest) SetProductInstanceId(v string) *BindGongxaingTestRequest {
	s.ProductInstanceId = &v
	return s
}

type BindGongxaingTestResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s BindGongxaingTestResponse) String() string {
	return tea.Prettify(s)
}

func (s BindGongxaingTestResponse) GoString() string {
	return s.String()
}

func (s *BindGongxaingTestResponse) SetReqMsgId(v string) *BindGongxaingTestResponse {
	s.ReqMsgId = &v
	return s
}

func (s *BindGongxaingTestResponse) SetResultCode(v string) *BindGongxaingTestResponse {
	s.ResultCode = &v
	return s
}

func (s *BindGongxaingTestResponse) SetResultMsg(v string) *BindGongxaingTestResponse {
	s.ResultMsg = &v
	return s
}

type QueryPatrolStatisticBizinfosRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 日期
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
}

func (s QueryPatrolStatisticBizinfosRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryPatrolStatisticBizinfosRequest) GoString() string {
	return s.String()
}

func (s *QueryPatrolStatisticBizinfosRequest) SetAuthToken(v string) *QueryPatrolStatisticBizinfosRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryPatrolStatisticBizinfosRequest) SetProductInstanceId(v string) *QueryPatrolStatisticBizinfosRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryPatrolStatisticBizinfosRequest) SetType(v string) *QueryPatrolStatisticBizinfosRequest {
	s.Type = &v
	return s
}

type QueryPatrolStatisticBizinfosResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s QueryPatrolStatisticBizinfosResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryPatrolStatisticBizinfosResponse) GoString() string {
	return s.String()
}

func (s *QueryPatrolStatisticBizinfosResponse) SetReqMsgId(v string) *QueryPatrolStatisticBizinfosResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryPatrolStatisticBizinfosResponse) SetResultCode(v string) *QueryPatrolStatisticBizinfosResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryPatrolStatisticBizinfosResponse) SetResultMsg(v string) *QueryPatrolStatisticBizinfosResponse {
	s.ResultMsg = &v
	return s
}

type BindAaaBbbCccRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
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

type ResetComCnCcRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// orderid
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
}

func (s ResetComCnCcRequest) String() string {
	return tea.Prettify(s)
}

func (s ResetComCnCcRequest) GoString() string {
	return s.String()
}

func (s *ResetComCnCcRequest) SetAuthToken(v string) *ResetComCnCcRequest {
	s.AuthToken = &v
	return s
}

func (s *ResetComCnCcRequest) SetProductInstanceId(v string) *ResetComCnCcRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ResetComCnCcRequest) SetOrderId(v string) *ResetComCnCcRequest {
	s.OrderId = &v
	return s
}

type ResetComCnCcResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 订单id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty"`
}

func (s ResetComCnCcResponse) String() string {
	return tea.Prettify(s)
}

func (s ResetComCnCcResponse) GoString() string {
	return s.String()
}

func (s *ResetComCnCcResponse) SetReqMsgId(v string) *ResetComCnCcResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ResetComCnCcResponse) SetResultCode(v string) *ResetComCnCcResponse {
	s.ResultCode = &v
	return s
}

func (s *ResetComCnCcResponse) SetResultMsg(v string) *ResetComCnCcResponse {
	s.ResultMsg = &v
	return s
}

func (s *ResetComCnCcResponse) SetOrderId(v string) *ResetComCnCcResponse {
	s.OrderId = &v
	return s
}

type ImportComCnTestRequest struct {
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

func (s ImportComCnTestRequest) String() string {
	return tea.Prettify(s)
}

func (s ImportComCnTestRequest) GoString() string {
	return s.String()
}

func (s *ImportComCnTestRequest) SetAuthToken(v string) *ImportComCnTestRequest {
	s.AuthToken = &v
	return s
}

func (s *ImportComCnTestRequest) SetProductInstanceId(v string) *ImportComCnTestRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ImportComCnTestRequest) SetFileObject(v io.Reader) *ImportComCnTestRequest {
	s.FileObject = v
	return s
}

func (s *ImportComCnTestRequest) SetFileObjectName(v string) *ImportComCnTestRequest {
	s.FileObjectName = &v
	return s
}

func (s *ImportComCnTestRequest) SetFileId(v string) *ImportComCnTestRequest {
	s.FileId = &v
	return s
}

type ImportComCnTestResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s ImportComCnTestResponse) String() string {
	return tea.Prettify(s)
}

func (s ImportComCnTestResponse) GoString() string {
	return s.String()
}

func (s *ImportComCnTestResponse) SetReqMsgId(v string) *ImportComCnTestResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ImportComCnTestResponse) SetResultCode(v string) *ImportComCnTestResponse {
	s.ResultCode = &v
	return s
}

func (s *ImportComCnTestResponse) SetResultMsg(v string) *ImportComCnTestResponse {
	s.ResultMsg = &v
	return s
}

type BindCenterAbilityRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s BindCenterAbilityRequest) String() string {
	return tea.Prettify(s)
}

func (s BindCenterAbilityRequest) GoString() string {
	return s.String()
}

func (s *BindCenterAbilityRequest) SetAuthToken(v string) *BindCenterAbilityRequest {
	s.AuthToken = &v
	return s
}

func (s *BindCenterAbilityRequest) SetProductInstanceId(v string) *BindCenterAbilityRequest {
	s.ProductInstanceId = &v
	return s
}

type BindCenterAbilityResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s BindCenterAbilityResponse) String() string {
	return tea.Prettify(s)
}

func (s BindCenterAbilityResponse) GoString() string {
	return s.String()
}

func (s *BindCenterAbilityResponse) SetReqMsgId(v string) *BindCenterAbilityResponse {
	s.ReqMsgId = &v
	return s
}

func (s *BindCenterAbilityResponse) SetResultCode(v string) *BindCenterAbilityResponse {
	s.ResultCode = &v
	return s
}

func (s *BindCenterAbilityResponse) SetResultMsg(v string) *BindCenterAbilityResponse {
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
				"sdk_version":      tea.String("1.0.230"),
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
 * Description: 测试打包
 * Summary: 测试打包
 */
func (client *Client) ImportTestSdkProduct(request *ImportTestSdkProductRequest) (_result *ImportTestSdkProductResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ImportTestSdkProductResponse{}
	_body, _err := client.ImportTestSdkProductEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 测试打包
 * Summary: 测试打包
 */
func (client *Client) ImportTestSdkProductEx(request *ImportTestSdkProductRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ImportTestSdkProductResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ImportTestSdkProductResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.test.sdk.product.import"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
 * Description: api下架测试
 * Summary: api下架测试测试状态
 */
func (client *Client) QueryApiOfflineStatus(request *QueryApiOfflineStatusRequest) (_result *QueryApiOfflineStatusResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryApiOfflineStatusResponse{}
	_body, _err := client.QueryApiOfflineStatusEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: api下架测试
 * Summary: api下架测试测试状态
 */
func (client *Client) QueryApiOfflineStatusEx(request *QueryApiOfflineStatusRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryApiOfflineStatusResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryApiOfflineStatusResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.api.offline.status.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 测试数据，可删除
 * Summary: api状态测试
 */
func (client *Client) ImportDemoApistatus(request *ImportDemoApistatusRequest) (_result *ImportDemoApistatusResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ImportDemoApistatusResponse{}
	_body, _err := client.ImportDemoApistatusEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 测试数据，可删除
 * Summary: api状态测试
 */
func (client *Client) ImportDemoApistatusEx(request *ImportDemoApistatusRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ImportDemoApistatusResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ImportDemoApistatusResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.demo.apistatus.import"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
 * Description: aa
 * Summary: 测试接口
 */
func (client *Client) QueryDemoLulinSuccess(request *QueryDemoLulinSuccessRequest) (_result *QueryDemoLulinSuccessResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDemoLulinSuccessResponse{}
	_body, _err := client.QueryDemoLulinSuccessEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: aa
 * Summary: 测试接口
 */
func (client *Client) QueryDemoLulinSuccessEx(request *QueryDemoLulinSuccessRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDemoLulinSuccessResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDemoLulinSuccessResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.demo.lulin.success.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 11
 * Summary: 测试接口
 */
func (client *Client) QueryDemoLulinccData(request *QueryDemoLulinccDataRequest) (_result *QueryDemoLulinccDataResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDemoLulinccDataResponse{}
	_body, _err := client.QueryDemoLulinccDataEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 11
 * Summary: 测试接口
 */
func (client *Client) QueryDemoLulinccDataEx(request *QueryDemoLulinccDataRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDemoLulinccDataResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDemoLulinccDataResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.demo.lulincc.data.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 111
 * Summary: 测试接口
 */
func (client *Client) QueryDemoDefaultSdkccc(request *QueryDemoDefaultSdkcccRequest) (_result *QueryDemoDefaultSdkcccResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDemoDefaultSdkcccResponse{}
	_body, _err := client.QueryDemoDefaultSdkcccEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 111
 * Summary: 测试接口
 */
func (client *Client) QueryDemoDefaultSdkcccEx(request *QueryDemoDefaultSdkcccRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDemoDefaultSdkcccResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDemoDefaultSdkcccResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.demo.default.sdkccc.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 描述
 * Summary: 测试接口
 */
func (client *Client) QueryDemoDefaultSdkfff(request *QueryDemoDefaultSdkfffRequest) (_result *QueryDemoDefaultSdkfffResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDemoDefaultSdkfffResponse{}
	_body, _err := client.QueryDemoDefaultSdkfffEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 描述
 * Summary: 测试接口
 */
func (client *Client) QueryDemoDefaultSdkfffEx(request *QueryDemoDefaultSdkfffRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDemoDefaultSdkfffResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDemoDefaultSdkfffResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.demo.default.sdkfff.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
 * Description: 用于测试api评审接入SDL的测试使用
测试评审。评审字段测试ACCCCC
 * Summary: api评审测试CCCC
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
 * Description: 用于测试api评审接入SDL的测试使用
测试评审。评审字段测试ACCCCC
 * Summary: api评审测试CCCC
*/
func (client *Client) QueryApprovalTestEx(request *QueryApprovalTestRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryApprovalTestResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryApprovalTestResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.approval.test.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 在路由三板斧迭代中测试使用
 * Summary: 路由灰度测试使用API
 */
func (client *Client) QueryRoutingGrayscaleTest(request *QueryRoutingGrayscaleTestRequest) (_result *QueryRoutingGrayscaleTestResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryRoutingGrayscaleTestResponse{}
	_body, _err := client.QueryRoutingGrayscaleTestEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 在路由三板斧迭代中测试使用
 * Summary: 路由灰度测试使用API
 */
func (client *Client) QueryRoutingGrayscaleTestEx(request *QueryRoutingGrayscaleTestRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryRoutingGrayscaleTestResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryRoutingGrayscaleTestResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.routing.grayscale.test.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
 * Description: 测试
 * Summary: 测试
 */
func (client *Client) QueryShaofangTest(request *QueryShaofangTestRequest) (_result *QueryShaofangTestResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryShaofangTestResponse{}
	_body, _err := client.QueryShaofangTestEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 测试
 * Summary: 测试
 */
func (client *Client) QueryShaofangTestEx(request *QueryShaofangTestRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryShaofangTestResponse, _err error) {
	if !tea.BoolValue(util.IsUnset(request.FileObject)) {
		uploadReq := &CreateAntcloudGatewayxFileUploadRequest{
			AuthToken: request.AuthToken,
			ApiCode:   tea.String("demo.shaofang.test.query"),
			FileName:  request.FileObjectName,
		}
		uploadResp, _err := client.CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime)
		if _err != nil {
			return _result, _err
		}

		if !tea.BoolValue(antchainutil.IsSuccess(uploadResp.ResultCode, tea.String("OK"))) {
			queryShaofangTestResponse := &QueryShaofangTestResponse{
				ReqMsgId:   uploadResp.ReqMsgId,
				ResultCode: uploadResp.ResultCode,
				ResultMsg:  uploadResp.ResultMsg,
			}
			_result = queryShaofangTestResponse
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
	_result = &QueryShaofangTestResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.shaofang.test.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: tr测试
 * Summary: tr测试
 */
func (client *Client) QueryShaofangTestTr(request *QueryShaofangTestTrRequest) (_result *QueryShaofangTestTrResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryShaofangTestTrResponse{}
	_body, _err := client.QueryShaofangTestTrEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: tr测试
 * Summary: tr测试
 */
func (client *Client) QueryShaofangTestTrEx(request *QueryShaofangTestTrRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryShaofangTestTrResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryShaofangTestTrResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.shaofang.test.tr.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
 * Description: 123
 * Summary: 测试用api
 */
func (client *Client) ResetSaasTestApi(request *ResetSaasTestApiRequest) (_result *ResetSaasTestApiResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ResetSaasTestApiResponse{}
	_body, _err := client.ResetSaasTestApiEx(request, headers, runtime)
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
func (client *Client) ResetSaasTestApiEx(request *ResetSaasTestApiRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ResetSaasTestApiResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ResetSaasTestApiResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.saas.test.api.reset"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
 * Description: 共享能力中心六期回归验证创建使用
 * Summary: 共享能力中心六期回归验证创建
 */
func (client *Client) QueryGongxiangTestDemo(request *QueryGongxiangTestDemoRequest) (_result *QueryGongxiangTestDemoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryGongxiangTestDemoResponse{}
	_body, _err := client.QueryGongxiangTestDemoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 共享能力中心六期回归验证创建使用
 * Summary: 共享能力中心六期回归验证创建
 */
func (client *Client) QueryGongxiangTestDemoEx(request *QueryGongxiangTestDemoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryGongxiangTestDemoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryGongxiangTestDemoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.gongxiang.test.demo.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: testa
 * Summary: 测试用api
 */
func (client *Client) QuerySaasTestTesta(request *QuerySaasTestTestaRequest) (_result *QuerySaasTestTestaResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QuerySaasTestTestaResponse{}
	_body, _err := client.QuerySaasTestTestaEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: testa
 * Summary: 测试用api
 */
func (client *Client) QuerySaasTestTestaEx(request *QuerySaasTestTestaRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QuerySaasTestTestaResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QuerySaasTestTestaResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.saas.test.testa.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: testB
 * Summary: 测试用api
 */
func (client *Client) ImportSaasTestTestb(request *ImportSaasTestTestbRequest) (_result *ImportSaasTestTestbResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ImportSaasTestTestbResponse{}
	_body, _err := client.ImportSaasTestTestbEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: testB
 * Summary: 测试用api
 */
func (client *Client) ImportSaasTestTestbEx(request *ImportSaasTestTestbRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ImportSaasTestTestbResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ImportSaasTestTestbResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.saas.test.testb.import"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) PublishSaasTestTestc(request *PublishSaasTestTestcRequest) (_result *PublishSaasTestTestcResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PublishSaasTestTestcResponse{}
	_body, _err := client.PublishSaasTestTestcEx(request, headers, runtime)
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
func (client *Client) PublishSaasTestTestcEx(request *PublishSaasTestTestcRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PublishSaasTestTestcResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PublishSaasTestTestcResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.saas.test.testc.publish"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
 * Description: 共享能力六期回归验证
 * Summary: 共享能力六期回归验证
 */
func (client *Client) BindGongxaingTest(request *BindGongxaingTestRequest) (_result *BindGongxaingTestResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &BindGongxaingTestResponse{}
	_body, _err := client.BindGongxaingTestEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 共享能力六期回归验证
 * Summary: 共享能力六期回归验证
 */
func (client *Client) BindGongxaingTestEx(request *BindGongxaingTestRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *BindGongxaingTestResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &BindGongxaingTestResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.gongxaing.test.bind"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: album/api/patrol/data/queryBizInfos
 * Summary: test
 */
func (client *Client) QueryPatrolStatisticBizinfos(request *QueryPatrolStatisticBizinfosRequest) (_result *QueryPatrolStatisticBizinfosResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryPatrolStatisticBizinfosResponse{}
	_body, _err := client.QueryPatrolStatisticBizinfosEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: album/api/patrol/data/queryBizInfos
 * Summary: test
 */
func (client *Client) QueryPatrolStatisticBizinfosEx(request *QueryPatrolStatisticBizinfosRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryPatrolStatisticBizinfosResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryPatrolStatisticBizinfosResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.patrol.statistic.bizinfos.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 自动化测试创建test222
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
 * Description: 自动化测试创建test222
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
 * Description: 测试api描述
 * Summary: api简介
 */
func (client *Client) ResetComCnCc(request *ResetComCnCcRequest) (_result *ResetComCnCcResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ResetComCnCcResponse{}
	_body, _err := client.ResetComCnCcEx(request, headers, runtime)
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
func (client *Client) ResetComCnCcEx(request *ResetComCnCcRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ResetComCnCcResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ResetComCnCcResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.com.cn.cc.reset"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 长捷,qiujianglong.qjl
 * Summary: api简介
 */
func (client *Client) ImportComCnTest(request *ImportComCnTestRequest) (_result *ImportComCnTestResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ImportComCnTestResponse{}
	_body, _err := client.ImportComCnTestEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 长捷,qiujianglong.qjl
 * Summary: api简介
 */
func (client *Client) ImportComCnTestEx(request *ImportComCnTestRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ImportComCnTestResponse, _err error) {
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

		if !tea.BoolValue(antchainutil.IsSuccess(uploadResp.ResultCode, tea.String("OK"))) {
			importComCnTestResponse := &ImportComCnTestResponse{
				ReqMsgId:   uploadResp.ReqMsgId,
				ResultCode: uploadResp.ResultCode,
				ResultMsg:  uploadResp.ResultMsg,
			}
			_result = importComCnTestResponse
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
	_result = &ImportComCnTestResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.com.cn.test.import"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 测试能力中心九期API打标&能力绑定API使用
 * Summary: 能力中心九期测试
 */
func (client *Client) BindCenterAbility(request *BindCenterAbilityRequest) (_result *BindCenterAbilityResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &BindCenterAbilityResponse{}
	_body, _err := client.BindCenterAbilityEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 测试能力中心九期API打标&能力绑定API使用
 * Summary: 能力中心九期测试
 */
func (client *Client) BindCenterAbilityEx(request *BindCenterAbilityRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *BindCenterAbilityResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &BindCenterAbilityResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.center.ability.bind"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
