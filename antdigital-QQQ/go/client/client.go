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

// 另一个Demo类
type AnotherClass struct {
	// 测试字段
	// example:
	//
	// some string
	Bar *string `json:"bar,omitempty" xml:"bar,omitempty" require:"true"`
	// 引用字段
	Ref *QueryMap `json:"ref,omitempty" xml:"ref,omitempty" require:"true"`
	// 新增结构体
	// example:
	//
	// new structs
	NewStruct *string `json:"new_struct,omitempty" xml:"new_struct,omitempty"`
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

func (s *AnotherClass) SetRef(v *QueryMap) *AnotherClass {
	s.Ref = v
	return s
}

func (s *AnotherClass) SetNewStruct(v string) *AnotherClass {
	s.NewStruct = &v
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

// 订单详情
type OrderDetail struct {
	// 商品名称
	// example:
	//
	// 商品A
	ItemName *string `json:"item_name,omitempty" xml:"item_name,omitempty" require:"true"`
	// 数量
	// example:
	//
	// 2
	Quantity *int64 `json:"quantity,omitempty" xml:"quantity,omitempty" require:"true"`
	// 单价
	// example:
	//
	// 50
	Price *int64 `json:"price,omitempty" xml:"price,omitempty" require:"true"`
}

func (s OrderDetail) String() string {
	return tea.Prettify(s)
}

func (s OrderDetail) GoString() string {
	return s.String()
}

func (s *OrderDetail) SetItemName(v string) *OrderDetail {
	s.ItemName = &v
	return s
}

func (s *OrderDetail) SetQuantity(v int64) *OrderDetail {
	s.Quantity = &v
	return s
}

func (s *OrderDetail) SetPrice(v int64) *OrderDetail {
	s.Price = &v
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

// Demo类1111-11
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
	// 结构体字段
	SomeStruct *AnotherClass `json:"some_struct,omitempty" xml:"some_struct,omitempty" require:"true"`
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

func (s *DemoClass) SetSomeStruct(v *AnotherClass) *DemoClass {
	s.SomeStruct = v
	return s
}

// 卡片信息
type CardInfos struct {
	// x
	DomianInfo *Identity `json:"domian_info,omitempty" xml:"domian_info,omitempty" require:"true"`
	// 12
	// example:
	//
	// 张三
	Test *string `json:"test,omitempty" xml:"test,omitempty" require:"true"`
}

func (s CardInfos) String() string {
	return tea.Prettify(s)
}

func (s CardInfos) GoString() string {
	return s.String()
}

func (s *CardInfos) SetDomianInfo(v *Identity) *CardInfos {
	s.DomianInfo = v
	return s
}

func (s *CardInfos) SetTest(v string) *CardInfos {
	s.Test = &v
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

// 测试
type ATest struct {
	// cc
	// example:
	//
	// aaa
	Datay *string `json:"datay,omitempty" xml:"datay,omitempty"`
}

func (s ATest) String() string {
	return tea.Prettify(s)
}

func (s ATest) GoString() string {
	return s.String()
}

func (s *ATest) SetDatay(v string) *ATest {
	s.Datay = &v
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

// 订单DTO
type OrderDTO struct {
	// 订单编号
	// example:
	//
	// ORD001
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty" require:"true"`
	// 状态
	// example:
	//
	// SUCCESS
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
}

func (s OrderDTO) String() string {
	return tea.Prettify(s)
}

func (s OrderDTO) GoString() string {
	return s.String()
}

func (s *OrderDTO) SetOrderNo(v string) *OrderDTO {
	s.OrderNo = &v
	return s
}

func (s *OrderDTO) SetStatus(v string) *OrderDTO {
	s.Status = &v
	return s
}

type OrderItem struct {
	// 商品ID
	// example:
	//
	// SKU001
	ItemId *string `json:"item_id,omitempty" xml:"item_id,omitempty" require:"true"`
	// 数量
	// example:
	//
	// 2
	Quantity *int64 `json:"quantity,omitempty" xml:"quantity,omitempty" require:"true"`
}

func (s OrderItem) String() string {
	return tea.Prettify(s)
}

func (s OrderItem) GoString() string {
	return s.String()
}

func (s *OrderItem) SetItemId(v string) *OrderItem {
	s.ItemId = &v
	return s
}

func (s *OrderItem) SetQuantity(v int64) *OrderItem {
	s.Quantity = &v
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

// 订单信息
type OrderInfo struct {
	// 订单号
	// example:
	//
	// ORD001
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
	// 金额
	// example:
	//
	// 100
	Amount *int64 `json:"amount,omitempty" xml:"amount,omitempty" require:"true"`
	// 详情
	// example:
	//
	// {}
	Detail *OrderDetail `json:"detail,omitempty" xml:"detail,omitempty"`
}

func (s OrderInfo) String() string {
	return tea.Prettify(s)
}

func (s OrderInfo) GoString() string {
	return s.String()
}

func (s *OrderInfo) SetOrderId(v string) *OrderInfo {
	s.OrderId = &v
	return s
}

func (s *OrderInfo) SetAmount(v int64) *OrderInfo {
	s.Amount = &v
	return s
}

func (s *OrderInfo) SetDetail(v *OrderDetail) *OrderInfo {
	s.Detail = v
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

// 测试类结构体
type TestClass struct {
	// 字符串字段
	// example:
	//
	// string_param
	StringParam *string `json:"string_param,omitempty" xml:"string_param,omitempty" require:"true"`
	// 数字字段
	// example:
	//
	// 100
	NumberParam *int64 `json:"number_param,omitempty" xml:"number_param,omitempty" require:"true"`
	// 布尔值参数
	// example:
	//
	// true, false
	BooleanParam *bool `json:"boolean_param,omitempty" xml:"boolean_param,omitempty" require:"true"`
	// 日期参数
	// example:
	//
	// 2026-02-10T10:10:00Z
	DateParam *string `json:"date_param,omitempty" xml:"date_param,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 数组参数
	// example:
	//
	// {a,b,c,d}
	ArrayParam []*string `json:"array_param,omitempty" xml:"array_param,omitempty" require:"true" type:"Repeated"`
	// 结构体参数
	StructParam *DemoClass `json:"struct_param,omitempty" xml:"struct_param,omitempty" require:"true"`
}

func (s TestClass) String() string {
	return tea.Prettify(s)
}

func (s TestClass) GoString() string {
	return s.String()
}

func (s *TestClass) SetStringParam(v string) *TestClass {
	s.StringParam = &v
	return s
}

func (s *TestClass) SetNumberParam(v int64) *TestClass {
	s.NumberParam = &v
	return s
}

func (s *TestClass) SetBooleanParam(v bool) *TestClass {
	s.BooleanParam = &v
	return s
}

func (s *TestClass) SetDateParam(v string) *TestClass {
	s.DateParam = &v
	return s
}

func (s *TestClass) SetArrayParam(v []*string) *TestClass {
	s.ArrayParam = v
	return s
}

func (s *TestClass) SetStructParam(v *DemoClass) *TestClass {
	s.StructParam = v
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

// x
type CardInfo struct {
	// 1
	DemoInfo *DemoClass `json:"demo_info,omitempty" xml:"demo_info,omitempty" require:"true"`
	// 测试
	// example:
	//
	// 张三
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
}

func (s CardInfo) String() string {
	return tea.Prettify(s)
}

func (s CardInfo) GoString() string {
	return s.String()
}

func (s *CardInfo) SetDemoInfo(v *DemoClass) *CardInfo {
	s.DemoInfo = v
	return s
}

func (s *CardInfo) SetName(v string) *CardInfo {
	s.Name = &v
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

// 1
type DemoT struct {
	// 1
	// example:
	//
	// 3000
	Timeout *string `json:"timeout,omitempty" xml:"timeout,omitempty"`
}

func (s DemoT) String() string {
	return tea.Prettify(s)
}

func (s DemoT) GoString() string {
	return s.String()
}

func (s *DemoT) SetTimeout(v string) *DemoT {
	s.Timeout = &v
	return s
}

// ss
type TestStrcuct struct {
	// ss
	// example:
	//
	// 张三
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
}

func (s TestStrcuct) String() string {
	return tea.Prettify(s)
}

func (s TestStrcuct) GoString() string {
	return s.String()
}

func (s *TestStrcuct) SetName(v string) *TestStrcuct {
	s.Name = &v
	return s
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

// btest
type Btest struct {
	// atest
	// example:
	//
	// atest
	Atest *ATest `json:"atest,omitempty" xml:"atest,omitempty" require:"true"`
}

func (s Btest) String() string {
	return tea.Prettify(s)
}

func (s Btest) GoString() string {
	return s.String()
}

func (s *Btest) SetAtest(v *ATest) *Btest {
	s.Atest = v
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

// x
type PersonInfo struct {
	// 1
	// example:
	//
	// 张三
	CardInfos *CardInfos `json:"card_infos,omitempty" xml:"card_infos,omitempty" require:"true"`
	// 123
	// example:
	//
	// 张三
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
}

func (s PersonInfo) String() string {
	return tea.Prettify(s)
}

func (s PersonInfo) GoString() string {
	return s.String()
}

func (s *PersonInfo) SetCardInfos(v *CardInfos) *PersonInfo {
	s.CardInfos = v
	return s
}

func (s *PersonInfo) SetName(v string) *PersonInfo {
	s.Name = &v
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

// ABC结构体C
type AbcStructC struct {
	// string_c
	// example:
	//
	// string_c
	StringParamC *string `json:"string_param_c,omitempty" xml:"string_param_c,omitempty"`
	// number_c
	// example:
	//
	// 200
	NumberParamC *int64 `json:"number_param_c,omitempty" xml:"number_param_c,omitempty"`
	// boolean_c
	// example:
	//
	// true, false
	BooleanParamC *bool `json:"boolean_param_c,omitempty" xml:"boolean_param_c,omitempty"`
	// date_c
	// example:
	//
	// 2018-10-10T10:10:00Z
	DateParamC *string `json:"date_param_c,omitempty" xml:"date_param_c,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// string_c
	// example:
	//
	// string_c
	ArrayParamC []*string `json:"array_param_c,omitempty" xml:"array_param_c,omitempty" type:"Repeated"`
}

func (s AbcStructC) String() string {
	return tea.Prettify(s)
}

func (s AbcStructC) GoString() string {
	return s.String()
}

func (s *AbcStructC) SetStringParamC(v string) *AbcStructC {
	s.StringParamC = &v
	return s
}

func (s *AbcStructC) SetNumberParamC(v int64) *AbcStructC {
	s.NumberParamC = &v
	return s
}

func (s *AbcStructC) SetBooleanParamC(v bool) *AbcStructC {
	s.BooleanParamC = &v
	return s
}

func (s *AbcStructC) SetDateParamC(v string) *AbcStructC {
	s.DateParamC = &v
	return s
}

func (s *AbcStructC) SetArrayParamC(v []*string) *AbcStructC {
	s.ArrayParamC = v
	return s
}

// ABC结构体B
type AbcStructB struct {
	// string_b
	// example:
	//
	// string_b
	StringParamB *string `json:"string_param_b,omitempty" xml:"string_param_b,omitempty"`
	// number_b
	// example:
	//
	// 200
	NumberParamB *int64 `json:"number_param_b,omitempty" xml:"number_param_b,omitempty"`
	// boolean_b
	// example:
	//
	// true, false
	BooleanParamB *bool `json:"boolean_param_b,omitempty" xml:"boolean_param_b,omitempty"`
	// date_b
	// example:
	//
	// 2018-10-10T10:10:00Z
	DateParamB *string `json:"date_param_b,omitempty" xml:"date_param_b,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// array_b
	// example:
	//
	// array_param
	ArrayParamB []*AbcStructC `json:"array_param_b,omitempty" xml:"array_param_b,omitempty" type:"Repeated"`
	// struct_b
	// example:
	//
	// struct_param
	StructParamB *AbcStructC `json:"struct_param_b,omitempty" xml:"struct_param_b,omitempty"`
}

func (s AbcStructB) String() string {
	return tea.Prettify(s)
}

func (s AbcStructB) GoString() string {
	return s.String()
}

func (s *AbcStructB) SetStringParamB(v string) *AbcStructB {
	s.StringParamB = &v
	return s
}

func (s *AbcStructB) SetNumberParamB(v int64) *AbcStructB {
	s.NumberParamB = &v
	return s
}

func (s *AbcStructB) SetBooleanParamB(v bool) *AbcStructB {
	s.BooleanParamB = &v
	return s
}

func (s *AbcStructB) SetDateParamB(v string) *AbcStructB {
	s.DateParamB = &v
	return s
}

func (s *AbcStructB) SetArrayParamB(v []*AbcStructC) *AbcStructB {
	s.ArrayParamB = v
	return s
}

func (s *AbcStructB) SetStructParamB(v *AbcStructC) *AbcStructB {
	s.StructParamB = v
	return s
}

// ABC产品结构体A
type AbcCreateStructA struct {
	// 【姓名】
	// example:
	//
	// 张三
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 【年龄】
	// example:
	//
	// 18
	Age *int64 `json:"age,omitempty" xml:"age,omitempty"`
}

func (s AbcCreateStructA) String() string {
	return tea.Prettify(s)
}

func (s AbcCreateStructA) GoString() string {
	return s.String()
}

func (s *AbcCreateStructA) SetName(v string) *AbcCreateStructA {
	s.Name = &v
	return s
}

func (s *AbcCreateStructA) SetAge(v int64) *AbcCreateStructA {
	s.Age = &v
	return s
}

// ABC产品结构体B
type AbcCreateStructB struct {
	// 【信息描述】
	// example:
	//
	// 这是关于xxx的资料信息
	Info *string `json:"info,omitempty" xml:"info,omitempty"`
	// 【地区】
	// example:
	//
	// 浙江省杭州市
	Region *string `json:"region,omitempty" xml:"region,omitempty"`
}

func (s AbcCreateStructB) String() string {
	return tea.Prettify(s)
}

func (s AbcCreateStructB) GoString() string {
	return s.String()
}

func (s *AbcCreateStructB) SetInfo(v string) *AbcCreateStructB {
	s.Info = &v
	return s
}

func (s *AbcCreateStructB) SetRegion(v string) *AbcCreateStructB {
	s.Region = &v
	return s
}

// ABC产品结构体C
type AbcCreateStructC struct {
	// 【个人信息】
	// example:
	//
	// {"name":"张三","age":"18"}
	PersonalInformation *AbcCreateStructA `json:"personal_information,omitempty" xml:"personal_information,omitempty"`
	// 【地区信息】
	// example:
	//
	// {"info":"xxxxx","region":"浙江省杭州市西湖区xx街道xxx-xx幢-xx号"}
	RegionalInformation *AbcCreateStructB `json:"regional_information,omitempty" xml:"regional_information,omitempty"`
	// 【用例类型】
	// example:
	//
	// caseType
	CaseName *string `json:"case_name,omitempty" xml:"case_name,omitempty"`
}

func (s AbcCreateStructC) String() string {
	return tea.Prettify(s)
}

func (s AbcCreateStructC) GoString() string {
	return s.String()
}

func (s *AbcCreateStructC) SetPersonalInformation(v *AbcCreateStructA) *AbcCreateStructC {
	s.PersonalInformation = v
	return s
}

func (s *AbcCreateStructC) SetRegionalInformation(v *AbcCreateStructB) *AbcCreateStructC {
	s.RegionalInformation = v
	return s
}

func (s *AbcCreateStructC) SetCaseName(v string) *AbcCreateStructC {
	s.CaseName = &v
	return s
}

// ABC产品结构体D
type AbcCreateStructD struct {
	// 应用场景（payChannel =JDPAY仅支持MINI_APP） MINI_APP 小程序 APP 自有app ALL 两种都有
	// example:
	//
	// ALL
	ApplicationScene *string `json:"application_scene,omitempty" xml:"application_scene,omitempty"`
	// 小程序id
	// example:
	//
	// 小程序id
	TinyAppId *string `json:"tiny_app_id,omitempty" xml:"tiny_app_id,omitempty"`
	// 小程序名称
	// example:
	//
	// xx小程序
	SiteName *string `json:"site_name,omitempty" xml:"site_name,omitempty"`
	// 网站地址（pay_channel=ALIPAY必填）
	// example:
	//
	// http://asdasas.com
	SitUrl *string `json:"sit_url,omitempty" xml:"sit_url,omitempty"`
	// 商户名称。（pay_channel=ALIPAY必填） 修改后的商户名称，将同步支付宝代扣签约页面字段展示
	// example:
	//
	// xx商户
	MerchantName *string `json:"merchant_name,omitempty" xml:"merchant_name,omitempty"`
	// 商户服务名称。（pay_channel=ALIPAY必填） 修改后的商户服务名称，将同步支付宝代扣签约页面字段展示
	// example:
	//
	// xx商户服务
	MerchantServiceName *string `json:"merchant_service_name,omitempty" xml:"merchant_service_name,omitempty"`
}

func (s AbcCreateStructD) String() string {
	return tea.Prettify(s)
}

func (s AbcCreateStructD) GoString() string {
	return s.String()
}

func (s *AbcCreateStructD) SetApplicationScene(v string) *AbcCreateStructD {
	s.ApplicationScene = &v
	return s
}

func (s *AbcCreateStructD) SetTinyAppId(v string) *AbcCreateStructD {
	s.TinyAppId = &v
	return s
}

func (s *AbcCreateStructD) SetSiteName(v string) *AbcCreateStructD {
	s.SiteName = &v
	return s
}

func (s *AbcCreateStructD) SetSitUrl(v string) *AbcCreateStructD {
	s.SitUrl = &v
	return s
}

func (s *AbcCreateStructD) SetMerchantName(v string) *AbcCreateStructD {
	s.MerchantName = &v
	return s
}

func (s *AbcCreateStructD) SetMerchantServiceName(v string) *AbcCreateStructD {
	s.MerchantServiceName = &v
	return s
}

// ABC示例结构体（这是编辑后上线的）
type AbcDemoStruct struct {
	// 字符串属性
	// example:
	//
	// str
	SomeString *string `json:"some_string,omitempty" xml:"some_string,omitempty"`
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

// ABC结构体A
type AbcStructA struct {
	// string_a
	// example:
	//
	// string
	StringParamA *string `json:"string_param_a,omitempty" xml:"string_param_a,omitempty"`
	// number_a
	// example:
	//
	// 800
	NumberParamA *int64 `json:"number_param_a,omitempty" xml:"number_param_a,omitempty"`
	// boolean_a
	// example:
	//
	// true, false
	BooleanParamA *bool `json:"boolean_param_a,omitempty" xml:"boolean_param_a,omitempty"`
	// date_a
	// example:
	//
	// 2018-10-10T10:10:00Z
	DateParamA *string `json:"date_param_a,omitempty" xml:"date_param_a,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// struct_a
	// example:
	//
	// struct_param
	StructParamA *AbcStructB `json:"struct_param_a,omitempty" xml:"struct_param_a,omitempty"`
}

func (s AbcStructA) String() string {
	return tea.Prettify(s)
}

func (s AbcStructA) GoString() string {
	return s.String()
}

func (s *AbcStructA) SetStringParamA(v string) *AbcStructA {
	s.StringParamA = &v
	return s
}

func (s *AbcStructA) SetNumberParamA(v int64) *AbcStructA {
	s.NumberParamA = &v
	return s
}

func (s *AbcStructA) SetBooleanParamA(v bool) *AbcStructA {
	s.BooleanParamA = &v
	return s
}

func (s *AbcStructA) SetDateParamA(v string) *AbcStructA {
	s.DateParamA = &v
	return s
}

func (s *AbcStructA) SetStructParamA(v *AbcStructB) *AbcStructA {
	s.StructParamA = v
	return s
}

// 子结构体（这是编辑后的）
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
	// a
	// example:
	//
	// a
	A *string `json:"a,omitempty" xml:"a,omitempty" require:"true"`
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

func (s *SubDemoStruct) SetA(v string) *SubDemoStruct {
	s.A = &v
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

// Demo类1
type DemoClasses struct {
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

func (s DemoClasses) String() string {
	return tea.Prettify(s)
}

func (s DemoClasses) GoString() string {
	return s.String()
}

func (s *DemoClasses) SetSomeString(v string) *DemoClasses {
	s.SomeString = &v
	return s
}

func (s *DemoClasses) SetSomeDate(v string) *DemoClasses {
	s.SomeDate = &v
	return s
}

func (s *DemoClasses) SetSomeBoolean(v bool) *DemoClasses {
	s.SomeBoolean = &v
	return s
}

func (s *DemoClasses) SetSomeInt(v int64) *DemoClasses {
	s.SomeInt = &v
	return s
}

func (s *DemoClasses) SetSomeList(v []*string) *DemoClasses {
	s.SomeList = v
	return s
}

// 测试返回类
type TesRes struct {
	// 证件号
	// example:
	//
	// 12345
	Idcard *string `json:"idcard,omitempty" xml:"idcard,omitempty" require:"true"`
}

func (s TesRes) String() string {
	return tea.Prettify(s)
}

func (s TesRes) GoString() string {
	return s.String()
}

func (s *TesRes) SetIdcard(v string) *TesRes {
	s.Idcard = &v
	return s
}

type QueryDemoStreamTestRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
}

func (s QueryDemoStreamTestRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDemoStreamTestRequest) GoString() string {
	return s.String()
}

func (s *QueryDemoStreamTestRequest) SetAuthToken(v string) *QueryDemoStreamTestRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDemoStreamTestRequest) SetProductInstanceId(v string) *QueryDemoStreamTestRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryDemoStreamTestRequest) SetName(v string) *QueryDemoStreamTestRequest {
	s.Name = &v
	return s
}

type QueryDemoStreamTestResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s QueryDemoStreamTestResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDemoStreamTestResponse) GoString() string {
	return s.String()
}

func (s *QueryDemoStreamTestResponse) SetReqMsgId(v string) *QueryDemoStreamTestResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDemoStreamTestResponse) SetResultCode(v string) *QueryDemoStreamTestResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDemoStreamTestResponse) SetResultMsg(v string) *QueryDemoStreamTestResponse {
	s.ResultMsg = &v
	return s
}

type QueryDemoTestTimeTestaRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// a
	A *string `json:"a,omitempty" xml:"a,omitempty"`
	// b
	B *TestClass `json:"b,omitempty" xml:"b,omitempty"`
}

func (s QueryDemoTestTimeTestaRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDemoTestTimeTestaRequest) GoString() string {
	return s.String()
}

func (s *QueryDemoTestTimeTestaRequest) SetAuthToken(v string) *QueryDemoTestTimeTestaRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDemoTestTimeTestaRequest) SetProductInstanceId(v string) *QueryDemoTestTimeTestaRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryDemoTestTimeTestaRequest) SetA(v string) *QueryDemoTestTimeTestaRequest {
	s.A = &v
	return s
}

func (s *QueryDemoTestTimeTestaRequest) SetB(v *TestClass) *QueryDemoTestTimeTestaRequest {
	s.B = v
	return s
}

type QueryDemoTestTimeTestaResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s QueryDemoTestTimeTestaResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDemoTestTimeTestaResponse) GoString() string {
	return s.String()
}

func (s *QueryDemoTestTimeTestaResponse) SetReqMsgId(v string) *QueryDemoTestTimeTestaResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDemoTestTimeTestaResponse) SetResultCode(v string) *QueryDemoTestTimeTestaResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDemoTestTimeTestaResponse) SetResultMsg(v string) *QueryDemoTestTimeTestaResponse {
	s.ResultMsg = &v
	return s
}

type QueryDemoTtUseRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 测试
	IdCard *string `json:"id_card,omitempty" xml:"id_card,omitempty"`
}

func (s QueryDemoTtUseRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDemoTtUseRequest) GoString() string {
	return s.String()
}

func (s *QueryDemoTtUseRequest) SetAuthToken(v string) *QueryDemoTtUseRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDemoTtUseRequest) SetProductInstanceId(v string) *QueryDemoTtUseRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryDemoTtUseRequest) SetIdCard(v string) *QueryDemoTtUseRequest {
	s.IdCard = &v
	return s
}

type QueryDemoTtUseResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s QueryDemoTtUseResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDemoTtUseResponse) GoString() string {
	return s.String()
}

func (s *QueryDemoTtUseResponse) SetReqMsgId(v string) *QueryDemoTtUseResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDemoTtUseResponse) SetResultCode(v string) *QueryDemoTtUseResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDemoTtUseResponse) SetResultMsg(v string) *QueryDemoTtUseResponse {
	s.ResultMsg = &v
	return s
}

type QueryDemoUtListRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s QueryDemoUtListRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDemoUtListRequest) GoString() string {
	return s.String()
}

func (s *QueryDemoUtListRequest) SetAuthToken(v string) *QueryDemoUtListRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDemoUtListRequest) SetProductInstanceId(v string) *QueryDemoUtListRequest {
	s.ProductInstanceId = &v
	return s
}

type QueryDemoUtListResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s QueryDemoUtListResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDemoUtListResponse) GoString() string {
	return s.String()
}

func (s *QueryDemoUtListResponse) SetReqMsgId(v string) *QueryDemoUtListResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDemoUtListResponse) SetResultCode(v string) *QueryDemoUtListResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDemoUtListResponse) SetResultMsg(v string) *QueryDemoUtListResponse {
	s.ResultMsg = &v
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

type ImportAntchainAbcOneLimitRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 超时时间
	Timeout *string `json:"timeout,omitempty" xml:"timeout,omitempty" require:"true"`
	// 123
	Idcard *AbcDemoStruct `json:"idcard,omitempty" xml:"idcard,omitempty"`
}

func (s ImportAntchainAbcOneLimitRequest) String() string {
	return tea.Prettify(s)
}

func (s ImportAntchainAbcOneLimitRequest) GoString() string {
	return s.String()
}

func (s *ImportAntchainAbcOneLimitRequest) SetAuthToken(v string) *ImportAntchainAbcOneLimitRequest {
	s.AuthToken = &v
	return s
}

func (s *ImportAntchainAbcOneLimitRequest) SetProductInstanceId(v string) *ImportAntchainAbcOneLimitRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ImportAntchainAbcOneLimitRequest) SetTimeout(v string) *ImportAntchainAbcOneLimitRequest {
	s.Timeout = &v
	return s
}

func (s *ImportAntchainAbcOneLimitRequest) SetIdcard(v *AbcDemoStruct) *ImportAntchainAbcOneLimitRequest {
	s.Idcard = v
	return s
}

type ImportAntchainAbcOneLimitResponse struct {
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

func (s ImportAntchainAbcOneLimitResponse) String() string {
	return tea.Prettify(s)
}

func (s ImportAntchainAbcOneLimitResponse) GoString() string {
	return s.String()
}

func (s *ImportAntchainAbcOneLimitResponse) SetReqMsgId(v string) *ImportAntchainAbcOneLimitResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ImportAntchainAbcOneLimitResponse) SetResultCode(v string) *ImportAntchainAbcOneLimitResponse {
	s.ResultCode = &v
	return s
}

func (s *ImportAntchainAbcOneLimitResponse) SetResultMsg(v string) *ImportAntchainAbcOneLimitResponse {
	s.ResultMsg = &v
	return s
}

func (s *ImportAntchainAbcOneLimitResponse) SetStauts(v string) *ImportAntchainAbcOneLimitResponse {
	s.Stauts = &v
	return s
}

func (s *ImportAntchainAbcOneLimitResponse) SetMsg(v string) *ImportAntchainAbcOneLimitResponse {
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

type ApibAntchainDemointernationalxjpInternationalPushRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s ApibAntchainDemointernationalxjpInternationalPushRequest) String() string {
	return tea.Prettify(s)
}

func (s ApibAntchainDemointernationalxjpInternationalPushRequest) GoString() string {
	return s.String()
}

func (s *ApibAntchainDemointernationalxjpInternationalPushRequest) SetAuthToken(v string) *ApibAntchainDemointernationalxjpInternationalPushRequest {
	s.AuthToken = &v
	return s
}

func (s *ApibAntchainDemointernationalxjpInternationalPushRequest) SetProductInstanceId(v string) *ApibAntchainDemointernationalxjpInternationalPushRequest {
	s.ProductInstanceId = &v
	return s
}

type ApibAntchainDemointernationalxjpInternationalPushResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s ApibAntchainDemointernationalxjpInternationalPushResponse) String() string {
	return tea.Prettify(s)
}

func (s ApibAntchainDemointernationalxjpInternationalPushResponse) GoString() string {
	return s.String()
}

func (s *ApibAntchainDemointernationalxjpInternationalPushResponse) SetReqMsgId(v string) *ApibAntchainDemointernationalxjpInternationalPushResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ApibAntchainDemointernationalxjpInternationalPushResponse) SetResultCode(v string) *ApibAntchainDemointernationalxjpInternationalPushResponse {
	s.ResultCode = &v
	return s
}

func (s *ApibAntchainDemointernationalxjpInternationalPushResponse) SetResultMsg(v string) *ApibAntchainDemointernationalxjpInternationalPushResponse {
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

type CallDemoAaaBbbCccRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s CallDemoAaaBbbCccRequest) String() string {
	return tea.Prettify(s)
}

func (s CallDemoAaaBbbCccRequest) GoString() string {
	return s.String()
}

func (s *CallDemoAaaBbbCccRequest) SetAuthToken(v string) *CallDemoAaaBbbCccRequest {
	s.AuthToken = &v
	return s
}

func (s *CallDemoAaaBbbCccRequest) SetProductInstanceId(v string) *CallDemoAaaBbbCccRequest {
	s.ProductInstanceId = &v
	return s
}

type CallDemoAaaBbbCccResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CallDemoAaaBbbCccResponse) String() string {
	return tea.Prettify(s)
}

func (s CallDemoAaaBbbCccResponse) GoString() string {
	return s.String()
}

func (s *CallDemoAaaBbbCccResponse) SetReqMsgId(v string) *CallDemoAaaBbbCccResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CallDemoAaaBbbCccResponse) SetResultCode(v string) *CallDemoAaaBbbCccResponse {
	s.ResultCode = &v
	return s
}

func (s *CallDemoAaaBbbCccResponse) SetResultMsg(v string) *CallDemoAaaBbbCccResponse {
	s.ResultMsg = &v
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
				"sdk_version":      tea.String("2.0.5"),
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
// Description: 流失查询测试
//
// Summary: 流失查询测试
func (client *Client) QueryDemoStreamTest(request *QueryDemoStreamTestRequest) (_result *QueryDemoStreamTestResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDemoStreamTestResponse{}
	_body, _err := client.QueryDemoStreamTestEx(request, headers, runtime)
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
func (client *Client) QueryDemoStreamTestEx(request *QueryDemoStreamTestRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDemoStreamTestResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDemoStreamTestResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.stream.test.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) QueryDemoTestTimeTesta(request *QueryDemoTestTimeTestaRequest) (_result *QueryDemoTestTimeTestaResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDemoTestTimeTestaResponse{}
	_body, _err := client.QueryDemoTestTimeTestaEx(request, headers, runtime)
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
func (client *Client) QueryDemoTestTimeTestaEx(request *QueryDemoTestTimeTestaRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDemoTestTimeTestaResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDemoTestTimeTestaResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.test.time.testa.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: s
//
// Summary: s
func (client *Client) QueryDemoTtUse(request *QueryDemoTtUseRequest) (_result *QueryDemoTtUseResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDemoTtUseResponse{}
	_body, _err := client.QueryDemoTtUseEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: s
//
// Summary: s
func (client *Client) QueryDemoTtUseEx(request *QueryDemoTtUseRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDemoTtUseResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDemoTtUseResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.tt.use.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: x
//
// Summary: x
func (client *Client) QueryDemoUtList(request *QueryDemoUtListRequest) (_result *QueryDemoUtListResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDemoUtListResponse{}
	_body, _err := client.QueryDemoUtListEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: x
//
// Summary: x
func (client *Client) QueryDemoUtListEx(request *QueryDemoUtListRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDemoUtListResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDemoUtListResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.ut.list.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
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
// Description: 个人工作台二期预发测试
//
// Summary: 个人工作台二期预发测试
func (client *Client) ImportAntchainAbcOneLimit(request *ImportAntchainAbcOneLimitRequest) (_result *ImportAntchainAbcOneLimitResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ImportAntchainAbcOneLimitResponse{}
	_body, _err := client.ImportAntchainAbcOneLimitEx(request, headers, runtime)
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
func (client *Client) ImportAntchainAbcOneLimitEx(request *ImportAntchainAbcOneLimitRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ImportAntchainAbcOneLimitResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ImportAntchainAbcOneLimitResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.abc.one.limit.import"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
// Description: 新加坡push
//
// Summary: 新加坡push
func (client *Client) ApibAntchainDemointernationalxjpInternationalPush(request *ApibAntchainDemointernationalxjpInternationalPushRequest) (_result *ApibAntchainDemointernationalxjpInternationalPushResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ApibAntchainDemointernationalxjpInternationalPushResponse{}
	_body, _err := client.ApibAntchainDemointernationalxjpInternationalPushEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 新加坡push
//
// Summary: 新加坡push
func (client *Client) ApibAntchainDemointernationalxjpInternationalPushEx(request *ApibAntchainDemointernationalxjpInternationalPushRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ApibAntchainDemointernationalxjpInternationalPushResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ApibAntchainDemointernationalxjpInternationalPushResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.demointernationalxjp.international.push.apib"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
// Description: 自动化测试创建test，请勿修改、删除
//
// Summary: 自动化测试创建test，请勿修改、删除
func (client *Client) CallDemoAaaBbbCcc(request *CallDemoAaaBbbCccRequest) (_result *CallDemoAaaBbbCccResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CallDemoAaaBbbCccResponse{}
	_body, _err := client.CallDemoAaaBbbCccEx(request, headers, runtime)
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
func (client *Client) CallDemoAaaBbbCccEx(request *CallDemoAaaBbbCccRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CallDemoAaaBbbCccResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CallDemoAaaBbbCccResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.aaa.bbb.ccc.call"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
