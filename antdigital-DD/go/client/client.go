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

// 商品明细
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

// 访问IaaS层的身份
type Accessor struct {
	// Accessor关联的AccessKey
	// example:
	//
	// LTAIyqaeoWfELqMg
	AccessKey *string `json:"access_key,omitempty" xml:"access_key,omitempty"`
	// Accessor关联的AccessKey的密钥，加密传输，网关返回后，使用调用方的AccessSecret进行解密
	AccessSecret *string `json:"access_secret,omitempty" xml:"access_secret,omitempty"`
	// AccessKey的密钥，加密传输，网关返回后，使用调用方的AccessSecret进行解密
	Account *string `json:"account,omitempty" xml:"account,omitempty"`
	// AccessKey创建时间，ISO8601格式
	CreateTime *string `json:"create_time,omitempty" xml:"create_time,omitempty"`
	// Accessor唯一标识
	Id *string `json:"id,omitempty" xml:"id,omitempty"`
	// Accessor类型(RAM/ACCOUNT)
	// example:
	//
	// RAM
	Type *string `json:"type,omitempty" xml:"type,omitempty"`
}

func (s Accessor) String() string {
	return tea.Prettify(s)
}

func (s Accessor) GoString() string {
	return s.String()
}

func (s *Accessor) SetAccessKey(v string) *Accessor {
	s.AccessKey = &v
	return s
}

func (s *Accessor) SetAccessSecret(v string) *Accessor {
	s.AccessSecret = &v
	return s
}

func (s *Accessor) SetAccount(v string) *Accessor {
	s.Account = &v
	return s
}

func (s *Accessor) SetCreateTime(v string) *Accessor {
	s.CreateTime = &v
	return s
}

func (s *Accessor) SetId(v string) *Accessor {
	s.Id = &v
	return s
}

func (s *Accessor) SetType(v string) *Accessor {
	s.Type = &v
	return s
}

// 标签实体
type Tag struct {
	// 标签类型
	// example:
	//
	// CHANNEL_SCENE
	TagType *string `json:"tag_type,omitempty" xml:"tag_type,omitempty" require:"true"`
	// 标签值
	// example:
	//
	// BAASDT_IPAE
	TagValue *string `json:"tag_value,omitempty" xml:"tag_value,omitempty" require:"true"`
}

func (s Tag) String() string {
	return tea.Prettify(s)
}

func (s Tag) GoString() string {
	return s.String()
}

func (s *Tag) SetTagType(v string) *Tag {
	s.TagType = &v
	return s
}

func (s *Tag) SetTagValue(v string) *Tag {
	s.TagValue = &v
	return s
}

// AccessKey
type AccessKey struct {
	// AccessKey创建时间，ISO8601格式
	CreateTime *string `json:"create_time,omitempty" xml:"create_time,omitempty"`
	// AccessKey唯一标识
	// example:
	//
	// LTAIyqaeoWfELqMg
	Id *string `json:"id,omitempty" xml:"id,omitempty"`
	// AccessKey的秘钥，加密传输，网关返回后，使用调用方的AccesSecret进行解密
	Secret *string `json:"secret,omitempty" xml:"secret,omitempty"`
	// 状态
	// example:
	//
	// ACTIVE
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// AccessKey最近一次修改时间，ISO8601格式
	UpdateTime *string `json:"update_time,omitempty" xml:"update_time,omitempty"`
}

func (s AccessKey) String() string {
	return tea.Prettify(s)
}

func (s AccessKey) GoString() string {
	return s.String()
}

func (s *AccessKey) SetCreateTime(v string) *AccessKey {
	s.CreateTime = &v
	return s
}

func (s *AccessKey) SetId(v string) *AccessKey {
	s.Id = &v
	return s
}

func (s *AccessKey) SetSecret(v string) *AccessKey {
	s.Secret = &v
	return s
}

func (s *AccessKey) SetStatus(v string) *AccessKey {
	s.Status = &v
	return s
}

func (s *AccessKey) SetUpdateTime(v string) *AccessKey {
	s.UpdateTime = &v
	return s
}

// 企业
type Customer struct {
	// 企业创建时间，ISO8601格式
	CreateTime *string `json:"create_time,omitempty" xml:"create_time,omitempty"`
	// 企业ID
	// example:
	//
	// 2088xxxxx1
	Id *string `json:"id,omitempty" xml:"id,omitempty"`
	// 企业名称
	// example:
	//
	// 蚂蚁金融云有限公司
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 企业最近一次修改时间，ISO8601格式
	UpdateTime *string `json:"update_time,omitempty" xml:"update_time,omitempty"`
}

func (s Customer) String() string {
	return tea.Prettify(s)
}

func (s Customer) GoString() string {
	return s.String()
}

func (s *Customer) SetCreateTime(v string) *Customer {
	s.CreateTime = &v
	return s
}

func (s *Customer) SetId(v string) *Customer {
	s.Id = &v
	return s
}

func (s *Customer) SetName(v string) *Customer {
	s.Name = &v
	return s
}

func (s *Customer) SetUpdateTime(v string) *Customer {
	s.UpdateTime = &v
	return s
}

// 租户
type Tenant struct {
	// 蚂蚁通行证签约账户
	// example:
	//
	// antcloud@alipay.com
	AntAccount *string `json:"ant_account,omitempty" xml:"ant_account,omitempty"`
	// 蚂蚁通行证uid
	// example:
	//
	// 2088xxxxx1
	AntUid *string `json:"ant_uid,omitempty" xml:"ant_uid,omitempty"`
	// 金融云官网:ANTCLOUD,蚂蚁开放平台：ANTOPEN
	// example:
	//
	// ANTCLOUD
	BusinessOwnerId *string `json:"business_owner_id,omitempty" xml:"business_owner_id,omitempty"`
	// 租户创建时间，ISO8601格式
	CreateTime *string `json:"create_time,omitempty" xml:"create_time,omitempty"`
	// 租户所在的企业的唯一标识
	// example:
	//
	// 2088201881714570
	Customer *string `json:"customer,omitempty" xml:"customer,omitempty"`
	// 租户描述信息
	// example:
	//
	// the default tenant
	Description *string `json:"description,omitempty" xml:"description,omitempty"`
	// 租户唯一标识
	// example:
	//
	// TSCPDICN
	Id *string `json:"id,omitempty" xml:"id,omitempty"`
	// 租户内部id
	// example:
	//
	// 0000000001
	InternalId *string `json:"internal_id,omitempty" xml:"internal_id,omitempty"`
	// 租户显示名称
	// example:
	//
	// myTenant
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 租户最近一次修改时间，ISO8601格式
	UpdateTime *string `json:"update_time,omitempty" xml:"update_time,omitempty"`
}

func (s Tenant) String() string {
	return tea.Prettify(s)
}

func (s Tenant) GoString() string {
	return s.String()
}

func (s *Tenant) SetAntAccount(v string) *Tenant {
	s.AntAccount = &v
	return s
}

func (s *Tenant) SetAntUid(v string) *Tenant {
	s.AntUid = &v
	return s
}

func (s *Tenant) SetBusinessOwnerId(v string) *Tenant {
	s.BusinessOwnerId = &v
	return s
}

func (s *Tenant) SetCreateTime(v string) *Tenant {
	s.CreateTime = &v
	return s
}

func (s *Tenant) SetCustomer(v string) *Tenant {
	s.Customer = &v
	return s
}

func (s *Tenant) SetDescription(v string) *Tenant {
	s.Description = &v
	return s
}

func (s *Tenant) SetId(v string) *Tenant {
	s.Id = &v
	return s
}

func (s *Tenant) SetInternalId(v string) *Tenant {
	s.InternalId = &v
	return s
}

func (s *Tenant) SetName(v string) *Tenant {
	s.Name = &v
	return s
}

func (s *Tenant) SetUpdateTime(v string) *Tenant {
	s.UpdateTime = &v
	return s
}

// 权限点
type Action struct {
	// 权限点ID
	// example:
	//
	// A0000000001
	Id *string `json:"id,omitempty" xml:"id,omitempty"`
	// 权限点名称
	// example:
	//
	// antcloud.xxx.xxx.labelinfo.query
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 类型
	// example:
	//
	// INNER
	Type *string `json:"type,omitempty" xml:"type,omitempty"`
	// 状态
	// example:
	//
	// NORMAL
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 描述
	// example:
	//
	//
	Description *string `json:"description,omitempty" xml:"description,omitempty"`
}

func (s Action) String() string {
	return tea.Prettify(s)
}

func (s Action) GoString() string {
	return s.String()
}

func (s *Action) SetId(v string) *Action {
	s.Id = &v
	return s
}

func (s *Action) SetName(v string) *Action {
	s.Name = &v
	return s
}

func (s *Action) SetType(v string) *Action {
	s.Type = &v
	return s
}

func (s *Action) SetStatus(v string) *Action {
	s.Status = &v
	return s
}

func (s *Action) SetDescription(v string) *Action {
	s.Description = &v
	return s
}

// 项目
type Project struct {
	// 项目ID
	// example:
	//
	// 1232132131
	ProjectId *string `json:"project_id,omitempty" xml:"project_id,omitempty" require:"true"`
	// 项目名称
	// example:
	//
	// 默认项目
	ProjectName *string `json:"project_name,omitempty" xml:"project_name,omitempty" require:"true"`
	// 项目描述
	// example:
	//
	// 我是项目描述
	Description *string `json:"description,omitempty" xml:"description,omitempty"`
	// 是否为默认项目
	// example:
	//
	// true
	IsDefault *bool `json:"is_default,omitempty" xml:"is_default,omitempty" require:"true"`
	// 创建时间
	// example:
	//
	// 2026-04-21 09:57:21
	GmtCreate *string `json:"gmt_create,omitempty" xml:"gmt_create,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 更新时间
	// example:
	//
	// 2026-04-21 09:57:21
	GmtModified *string `json:"gmt_modified,omitempty" xml:"gmt_modified,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
}

func (s Project) String() string {
	return tea.Prettify(s)
}

func (s Project) GoString() string {
	return s.String()
}

func (s *Project) SetProjectId(v string) *Project {
	s.ProjectId = &v
	return s
}

func (s *Project) SetProjectName(v string) *Project {
	s.ProjectName = &v
	return s
}

func (s *Project) SetDescription(v string) *Project {
	s.Description = &v
	return s
}

func (s *Project) SetIsDefault(v bool) *Project {
	s.IsDefault = &v
	return s
}

func (s *Project) SetGmtCreate(v string) *Project {
	s.GmtCreate = &v
	return s
}

func (s *Project) SetGmtModified(v string) *Project {
	s.GmtModified = &v
	return s
}

// 授权条件
type Condition struct {
	//
	// example:
	//
	//
	Key *string `json:"key,omitempty" xml:"key,omitempty"`
	//
	// example:
	//
	//
	Value []*string `json:"value,omitempty" xml:"value,omitempty" type:"Repeated"`
}

func (s Condition) String() string {
	return tea.Prettify(s)
}

func (s Condition) GoString() string {
	return s.String()
}

func (s *Condition) SetKey(v string) *Condition {
	s.Key = &v
	return s
}

func (s *Condition) SetValue(v []*string) *Condition {
	s.Value = v
	return s
}

// 角色
type Role struct {
	// 角色ID
	// example:
	//
	//
	Id *string `json:"id,omitempty" xml:"id,omitempty"`
	// 角色名称
	//
	// example:
	//
	//
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 角色类型，CUSTOM:自定义角色，COMMON:系统通用角色
	// example:
	//
	//
	Type *string `json:"type,omitempty" xml:"type,omitempty"`
	// 角色描述
	//
	// example:
	//
	//
	Description *string `json:"description,omitempty" xml:"description,omitempty"`
	// 状态
	// example:
	//
	// NORMAL
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 所有者
	// example:
	//
	// AntCloud
	Owner *string `json:"owner,omitempty" xml:"owner,omitempty"`
}

func (s Role) String() string {
	return tea.Prettify(s)
}

func (s Role) GoString() string {
	return s.String()
}

func (s *Role) SetId(v string) *Role {
	s.Id = &v
	return s
}

func (s *Role) SetName(v string) *Role {
	s.Name = &v
	return s
}

func (s *Role) SetType(v string) *Role {
	s.Type = &v
	return s
}

func (s *Role) SetDescription(v string) *Role {
	s.Description = &v
	return s
}

func (s *Role) SetStatus(v string) *Role {
	s.Status = &v
	return s
}

func (s *Role) SetOwner(v string) *Role {
	s.Owner = &v
	return s
}

// 操作员
type Operator struct {
	// 操作员创建时间，ISO8601格式
	CreateTime *string `json:"create_time,omitempty" xml:"create_time,omitempty"`
	// 操作员所在的企业
	Customer *string `json:"customer,omitempty" xml:"customer,omitempty"`
	// 邮箱
	// example:
	//
	// zhangsan@alipay.com
	Email *string `json:"email,omitempty" xml:"email,omitempty"`
	// 外部对接系统操作员id
	// example:
	//
	// ding0000001
	ExternalId *string `json:"external_id,omitempty" xml:"external_id,omitempty"`
	// 外部对接系统类型
	// example:
	//
	// DING_TALK
	ExternalSystem *string `json:"external_system,omitempty" xml:"external_system,omitempty"`
	// 操作员ID
	// example:
	//
	// 0000000001
	Id *string `json:"id,omitempty" xml:"id,omitempty"`
	// 登录名
	LoginName *string `json:"login_name,omitempty" xml:"login_name,omitempty"`
	// 手机号
	Mobile *string `json:"mobile,omitempty" xml:"mobile,omitempty"`
	// 昵称
	Nickname *string `json:"nickname,omitempty" xml:"nickname,omitempty"`
	// 真实姓名
	RealName *string `json:"real_name,omitempty" xml:"real_name,omitempty"`
	// 部门唯一码
	// example:
	//
	//
	DepartmentCode *string `json:"department_code,omitempty" xml:"department_code,omitempty"`
	// 操作员状态(INACTIVE：未激活，NORMAL：正常状态，FROZEN：冻结状态)
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 操作员加入的租户列表
	Tenants []*string `json:"tenants,omitempty" xml:"tenants,omitempty" type:"Repeated"`
	// 操作员最近一次修改时间，ISO8601格式
	UpdateTime *string `json:"update_time,omitempty" xml:"update_time,omitempty"`
}

func (s Operator) String() string {
	return tea.Prettify(s)
}

func (s Operator) GoString() string {
	return s.String()
}

func (s *Operator) SetCreateTime(v string) *Operator {
	s.CreateTime = &v
	return s
}

func (s *Operator) SetCustomer(v string) *Operator {
	s.Customer = &v
	return s
}

func (s *Operator) SetEmail(v string) *Operator {
	s.Email = &v
	return s
}

func (s *Operator) SetExternalId(v string) *Operator {
	s.ExternalId = &v
	return s
}

func (s *Operator) SetExternalSystem(v string) *Operator {
	s.ExternalSystem = &v
	return s
}

func (s *Operator) SetId(v string) *Operator {
	s.Id = &v
	return s
}

func (s *Operator) SetLoginName(v string) *Operator {
	s.LoginName = &v
	return s
}

func (s *Operator) SetMobile(v string) *Operator {
	s.Mobile = &v
	return s
}

func (s *Operator) SetNickname(v string) *Operator {
	s.Nickname = &v
	return s
}

func (s *Operator) SetRealName(v string) *Operator {
	s.RealName = &v
	return s
}

func (s *Operator) SetDepartmentCode(v string) *Operator {
	s.DepartmentCode = &v
	return s
}

func (s *Operator) SetStatus(v string) *Operator {
	s.Status = &v
	return s
}

func (s *Operator) SetTenants(v []*string) *Operator {
	s.Tenants = v
	return s
}

func (s *Operator) SetUpdateTime(v string) *Operator {
	s.UpdateTime = &v
	return s
}

// 范围value
type RangeValue struct {
	// 范围类型
	// example:
	//
	// ()
	RangeType *string `json:"range_type,omitempty" xml:"range_type,omitempty" require:"true"`
	// 范围最小值
	// example:
	//
	// 1
	MinValue *int64 `json:"min_value,omitempty" xml:"min_value,omitempty"`
	// 范围最大值
	// example:
	//
	// 10000
	MaxValue *int64 `json:"max_value,omitempty" xml:"max_value,omitempty"`
	// 范围类型时候步长
	// example:
	//
	// 1
	Step *int64 `json:"step,omitempty" xml:"step,omitempty"`
}

func (s RangeValue) String() string {
	return tea.Prettify(s)
}

func (s RangeValue) GoString() string {
	return s.String()
}

func (s *RangeValue) SetRangeType(v string) *RangeValue {
	s.RangeType = &v
	return s
}

func (s *RangeValue) SetMinValue(v int64) *RangeValue {
	s.MinValue = &v
	return s
}

func (s *RangeValue) SetMaxValue(v int64) *RangeValue {
	s.MaxValue = &v
	return s
}

func (s *RangeValue) SetStep(v int64) *RangeValue {
	s.Step = &v
	return s
}

// 模拟key和value都为String的map
type StringMap struct {
	// key
	// example:
	//
	// 1
	Key *string `json:"key,omitempty" xml:"key,omitempty"`
	// value
	// example:
	//
	// 1
	Value *string `json:"value,omitempty" xml:"value,omitempty"`
}

func (s StringMap) String() string {
	return tea.Prettify(s)
}

func (s StringMap) GoString() string {
	return s.String()
}

func (s *StringMap) SetKey(v string) *StringMap {
	s.Key = &v
	return s
}

func (s *StringMap) SetValue(v string) *StringMap {
	s.Value = &v
	return s
}

// 计量项值限制
type FieldValueLimit struct {
	// 枚举值，计量项为配置项的时候使用
	// example:
	//
	// code,中文名
	ValueList []*StringMap `json:"value_list,omitempty" xml:"value_list,omitempty" type:"Repeated"`
	// 范围value
	RangeValue *RangeValue `json:"range_value,omitempty" xml:"range_value,omitempty"`
	// 范围类型
	// example:
	//
	// num
	ValueDataType *string `json:"value_data_type,omitempty" xml:"value_data_type,omitempty"`
}

func (s FieldValueLimit) String() string {
	return tea.Prettify(s)
}

func (s FieldValueLimit) GoString() string {
	return s.String()
}

func (s *FieldValueLimit) SetValueList(v []*StringMap) *FieldValueLimit {
	s.ValueList = v
	return s
}

func (s *FieldValueLimit) SetRangeValue(v *RangeValue) *FieldValueLimit {
	s.RangeValue = v
	return s
}

func (s *FieldValueLimit) SetValueDataType(v string) *FieldValueLimit {
	s.ValueDataType = &v
	return s
}

// 计费因子
type BillingFactorMeta struct {
	// 费用code
	// example:
	//
	// 费用code
	FeeCode *string `json:"fee_code,omitempty" xml:"fee_code,omitempty"`
	// 因子code
	// example:
	//
	// test
	FactorCode *string `json:"factor_code,omitempty" xml:"factor_code,omitempty"`
	// 因子名称
	// example:
	//
	// 因子名称
	FactorName *string `json:"factor_name,omitempty" xml:"factor_name,omitempty"`
	// 因子类型
	// example:
	//
	// 计费，规格
	FactorType *string `json:"factor_type,omitempty" xml:"factor_type,omitempty"`
	// 因子单位
	// example:
	//
	// 元
	FactorUnit *string `json:"factor_unit,omitempty" xml:"factor_unit,omitempty"`
	// 计量项code
	// example:
	//
	// 计量项code
	MeterFeildCode *string `json:"meter_feild_code,omitempty" xml:"meter_feild_code,omitempty"`
	// 转换比率，用于展示转换
	// example:
	//
	// 1
	FactorRatio *string `json:"factor_ratio,omitempty" xml:"factor_ratio,omitempty"`
	// 是否抵扣资源包
	// example:
	//
	// true, false
	DeductRespackage *bool `json:"deduct_respackage,omitempty" xml:"deduct_respackage,omitempty"`
	// 是否累计
	// example:
	//
	// true, false
	IsCumulative *bool `json:"is_cumulative,omitempty" xml:"is_cumulative,omitempty"`
	// 数据来源，配置，计量数据
	// example:
	//
	// use_data
	ValOriginal *string `json:"val_original,omitempty" xml:"val_original,omitempty"`
	// 默认值
	// example:
	//
	// 默认值
	DefaultValue *string `json:"default_value,omitempty" xml:"default_value,omitempty"`
	// 拓展信息
	// example:
	//
	// 拓展信息
	ExtraInfo *string `json:"extra_info,omitempty" xml:"extra_info,omitempty"`
	// 订购模型，价格模型
	// example:
	//
	// 01
	FactorModelType *string `json:"factor_model_type,omitempty" xml:"factor_model_type,omitempty"`
}

func (s BillingFactorMeta) String() string {
	return tea.Prettify(s)
}

func (s BillingFactorMeta) GoString() string {
	return s.String()
}

func (s *BillingFactorMeta) SetFeeCode(v string) *BillingFactorMeta {
	s.FeeCode = &v
	return s
}

func (s *BillingFactorMeta) SetFactorCode(v string) *BillingFactorMeta {
	s.FactorCode = &v
	return s
}

func (s *BillingFactorMeta) SetFactorName(v string) *BillingFactorMeta {
	s.FactorName = &v
	return s
}

func (s *BillingFactorMeta) SetFactorType(v string) *BillingFactorMeta {
	s.FactorType = &v
	return s
}

func (s *BillingFactorMeta) SetFactorUnit(v string) *BillingFactorMeta {
	s.FactorUnit = &v
	return s
}

func (s *BillingFactorMeta) SetMeterFeildCode(v string) *BillingFactorMeta {
	s.MeterFeildCode = &v
	return s
}

func (s *BillingFactorMeta) SetFactorRatio(v string) *BillingFactorMeta {
	s.FactorRatio = &v
	return s
}

func (s *BillingFactorMeta) SetDeductRespackage(v bool) *BillingFactorMeta {
	s.DeductRespackage = &v
	return s
}

func (s *BillingFactorMeta) SetIsCumulative(v bool) *BillingFactorMeta {
	s.IsCumulative = &v
	return s
}

func (s *BillingFactorMeta) SetValOriginal(v string) *BillingFactorMeta {
	s.ValOriginal = &v
	return s
}

func (s *BillingFactorMeta) SetDefaultValue(v string) *BillingFactorMeta {
	s.DefaultValue = &v
	return s
}

func (s *BillingFactorMeta) SetExtraInfo(v string) *BillingFactorMeta {
	s.ExtraInfo = &v
	return s
}

func (s *BillingFactorMeta) SetFactorModelType(v string) *BillingFactorMeta {
	s.FactorModelType = &v
	return s
}

// 资源包约束
type ResourcePackageConstraintMeta struct {
	// 模板code
	// example:
	//
	// test_deadline
	TemplateName *string `json:"template_name,omitempty" xml:"template_name,omitempty" require:"true"`
	// 约束码
	// example:
	//
	// productCode
	ConstraintCode *string `json:"constraint_code,omitempty" xml:"constraint_code,omitempty" require:"true"`
	// 约束名称
	// example:
	//
	// 抵扣约束
	ConstraintName *string `json:"constraint_name,omitempty" xml:"constraint_name,omitempty" require:"true"`
	// 约束表达式
	// example:
	//
	// ql表达式
	ConstraintExpression *string `json:"constraint_expression,omitempty" xml:"constraint_expression,omitempty" require:"true"`
	// 约束类型
	// example:
	//
	// DEDUCT
	ConstraintType *string `json:"constraint_type,omitempty" xml:"constraint_type,omitempty" require:"true"`
}

func (s ResourcePackageConstraintMeta) String() string {
	return tea.Prettify(s)
}

func (s ResourcePackageConstraintMeta) GoString() string {
	return s.String()
}

func (s *ResourcePackageConstraintMeta) SetTemplateName(v string) *ResourcePackageConstraintMeta {
	s.TemplateName = &v
	return s
}

func (s *ResourcePackageConstraintMeta) SetConstraintCode(v string) *ResourcePackageConstraintMeta {
	s.ConstraintCode = &v
	return s
}

func (s *ResourcePackageConstraintMeta) SetConstraintName(v string) *ResourcePackageConstraintMeta {
	s.ConstraintName = &v
	return s
}

func (s *ResourcePackageConstraintMeta) SetConstraintExpression(v string) *ResourcePackageConstraintMeta {
	s.ConstraintExpression = &v
	return s
}

func (s *ResourcePackageConstraintMeta) SetConstraintType(v string) *ResourcePackageConstraintMeta {
	s.ConstraintType = &v
	return s
}

// DomainSLS配置
type DomainSls struct {
	// 拉取sql
	// example:
	//
	// select from
	Sql *string `json:"sql,omitempty" xml:"sql,omitempty"`
	// 拉取SLS间隔
	// example:
	//
	// 1_h
	Interval *string `json:"interval,omitempty" xml:"interval,omitempty"`
	// 属性项
	// example:
	//
	// {"code":"code"}
	Memo *string `json:"memo,omitempty" xml:"memo,omitempty"`
}

func (s DomainSls) String() string {
	return tea.Prettify(s)
}

func (s DomainSls) GoString() string {
	return s.String()
}

func (s *DomainSls) SetSql(v string) *DomainSls {
	s.Sql = &v
	return s
}

func (s *DomainSls) SetInterval(v string) *DomainSls {
	s.Interval = &v
	return s
}

func (s *DomainSls) SetMemo(v string) *DomainSls {
	s.Memo = &v
	return s
}

// 计量节点
type DomainNode struct {
	// node字段
	// 目前可选枚举：CENTER, ODPS, MANUAL, SLS;
	//   也可以自定义
	// example:
	//
	// CENTER
	Code *string `json:"code,omitempty" xml:"code,omitempty"`
	// node英文名称
	// example:
	//
	// node英文名称
	EnglishName *string `json:"english_name,omitempty" xml:"english_name,omitempty"`
	// 中文名称
	// example:
	//
	// 中文名称
	ChineseName *string `json:"chinese_name,omitempty" xml:"chinese_name,omitempty"`
	// 默认需要check
	// example:
	//
	// true, false
	NeedCheck *bool `json:"need_check,omitempty" xml:"need_check,omitempty"`
	// 默认超时时间,单位:m
	TimeOut *int64 `json:"time_out,omitempty" xml:"time_out,omitempty"`
	// 描述
	// example:
	//
	// 描述
	Memo *string `json:"memo,omitempty" xml:"memo,omitempty"`
	// 状态
	// example:
	//
	// VALID
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
}

func (s DomainNode) String() string {
	return tea.Prettify(s)
}

func (s DomainNode) GoString() string {
	return s.String()
}

func (s *DomainNode) SetCode(v string) *DomainNode {
	s.Code = &v
	return s
}

func (s *DomainNode) SetEnglishName(v string) *DomainNode {
	s.EnglishName = &v
	return s
}

func (s *DomainNode) SetChineseName(v string) *DomainNode {
	s.ChineseName = &v
	return s
}

func (s *DomainNode) SetNeedCheck(v bool) *DomainNode {
	s.NeedCheck = &v
	return s
}

func (s *DomainNode) SetTimeOut(v int64) *DomainNode {
	s.TimeOut = &v
	return s
}

func (s *DomainNode) SetMemo(v string) *DomainNode {
	s.Memo = &v
	return s
}

func (s *DomainNode) SetStatus(v string) *DomainNode {
	s.Status = &v
	return s
}

// 主键规则配置
type PrimaryKeyGenRule struct {
	// 规则code
	// example:
	//
	// test;instance
	RuleCode *string `json:"rule_code,omitempty" xml:"rule_code,omitempty"`
	// 规则名称
	// example:
	//
	// 主键规则
	ChineseName *string `json:"chinese_name,omitempty" xml:"chinese_name,omitempty"`
	// 规则englishName
	// example:
	//
	// test
	EnglishName *string `json:"english_name,omitempty" xml:"english_name,omitempty"`
	// 规则包括的fiel列表
	// example:
	//
	// field1,field2,field3
	PrimaryKeys *string `json:"primary_keys,omitempty" xml:"primary_keys,omitempty"`
}

func (s PrimaryKeyGenRule) String() string {
	return tea.Prettify(s)
}

func (s PrimaryKeyGenRule) GoString() string {
	return s.String()
}

func (s *PrimaryKeyGenRule) SetRuleCode(v string) *PrimaryKeyGenRule {
	s.RuleCode = &v
	return s
}

func (s *PrimaryKeyGenRule) SetChineseName(v string) *PrimaryKeyGenRule {
	s.ChineseName = &v
	return s
}

func (s *PrimaryKeyGenRule) SetEnglishName(v string) *PrimaryKeyGenRule {
	s.EnglishName = &v
	return s
}

func (s *PrimaryKeyGenRule) SetPrimaryKeys(v string) *PrimaryKeyGenRule {
	s.PrimaryKeys = &v
	return s
}

// 计量域成员信息
type MeterDomainMember struct {
	// 角色
	// example:
	//
	// develooper
	Role *string `json:"role,omitempty" xml:"role,omitempty"`
	// 成员id
	// example:
	//
	// workNo
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty"`
	// 成员昵称
	// example:
	//
	// 成员昵称
	NickName *string `json:"nick_name,omitempty" xml:"nick_name,omitempty"`
	// 成员姓名
	// example:
	//
	// 成员姓名
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
}

func (s MeterDomainMember) String() string {
	return tea.Prettify(s)
}

func (s MeterDomainMember) GoString() string {
	return s.String()
}

func (s *MeterDomainMember) SetRole(v string) *MeterDomainMember {
	s.Role = &v
	return s
}

func (s *MeterDomainMember) SetUserId(v string) *MeterDomainMember {
	s.UserId = &v
	return s
}

func (s *MeterDomainMember) SetNickName(v string) *MeterDomainMember {
	s.NickName = &v
	return s
}

func (s *MeterDomainMember) SetName(v string) *MeterDomainMember {
	s.Name = &v
	return s
}

// 抵扣的计量项
type DeductOmsField struct {
	// 抵扣的资源包商品
	// example:
	//
	// testcode
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty"`
	// 计量项列表
	OmsField []*string `json:"oms_field,omitempty" xml:"oms_field,omitempty" type:"Repeated"`
}

func (s DeductOmsField) String() string {
	return tea.Prettify(s)
}

func (s DeductOmsField) GoString() string {
	return s.String()
}

func (s *DeductOmsField) SetProductCode(v string) *DeductOmsField {
	s.ProductCode = &v
	return s
}

func (s *DeductOmsField) SetOmsField(v []*string) *DeductOmsField {
	s.OmsField = v
	return s
}

// 计量项模型
type DomainField struct {
	// 计量项code
	// example:
	//
	// request_num
	Code *string `json:"code,omitempty" xml:"code,omitempty"`
	// 计量项英文名
	// example:
	//
	// test
	EnglishName *string `json:"english_name,omitempty" xml:"english_name,omitempty"`
	// 计量字段中文名称
	// example:
	//
	// 调用量
	ChineseName *string `json:"chinese_name,omitempty" xml:"chinese_name,omitempty"`
	//    枚举，可选
	//       配置型
	//      消耗型
	//      *其他
	// example:
	//
	// config
	FieldType *string `json:"field_type,omitempty" xml:"field_type,omitempty"`
	// 字段构成索引时的格式化长度<br>
	// example:
	//
	// -1
	FormatLength *string `json:"format_length,omitempty" xml:"format_length,omitempty"`
	// 默认值,可选
	// example:
	//
	// 123
	DefaultValue *string `json:"default_value,omitempty" xml:"default_value,omitempty"`
	// 是否必填，默认必填写
	// example:
	//
	// Y
	IfNull *string `json:"if_null,omitempty" xml:"if_null,omitempty"`
	// 是否增量推送
	// example:
	//
	// N
	IfIncrement *string `json:"if_increment,omitempty" xml:"if_increment,omitempty"`
	// 单位
	// example:
	//
	// 元
	Unit *string `json:"unit,omitempty" xml:"unit,omitempty"`
	// 计量项说明
	// example:
	//
	// 计量项说明
	Remark *string `json:"remark,omitempty" xml:"remark,omitempty"`
	// 关联字段排序
	// example:
	//
	// 01
	Column *string `json:"column,omitempty" xml:"column,omitempty"`
	// 计量项值约束
	FieldValueLimit *FieldValueLimit `json:"field_value_limit,omitempty" xml:"field_value_limit,omitempty"`
	// 聚合方式
	// example:
	//
	// SUM
	AggregationType *string `json:"aggregation_type,omitempty" xml:"aggregation_type,omitempty"`
}

func (s DomainField) String() string {
	return tea.Prettify(s)
}

func (s DomainField) GoString() string {
	return s.String()
}

func (s *DomainField) SetCode(v string) *DomainField {
	s.Code = &v
	return s
}

func (s *DomainField) SetEnglishName(v string) *DomainField {
	s.EnglishName = &v
	return s
}

func (s *DomainField) SetChineseName(v string) *DomainField {
	s.ChineseName = &v
	return s
}

func (s *DomainField) SetFieldType(v string) *DomainField {
	s.FieldType = &v
	return s
}

func (s *DomainField) SetFormatLength(v string) *DomainField {
	s.FormatLength = &v
	return s
}

func (s *DomainField) SetDefaultValue(v string) *DomainField {
	s.DefaultValue = &v
	return s
}

func (s *DomainField) SetIfNull(v string) *DomainField {
	s.IfNull = &v
	return s
}

func (s *DomainField) SetIfIncrement(v string) *DomainField {
	s.IfIncrement = &v
	return s
}

func (s *DomainField) SetUnit(v string) *DomainField {
	s.Unit = &v
	return s
}

func (s *DomainField) SetRemark(v string) *DomainField {
	s.Remark = &v
	return s
}

func (s *DomainField) SetColumn(v string) *DomainField {
	s.Column = &v
	return s
}

func (s *DomainField) SetFieldValueLimit(v *FieldValueLimit) *DomainField {
	s.FieldValueLimit = v
	return s
}

func (s *DomainField) SetAggregationType(v string) *DomainField {
	s.AggregationType = &v
	return s
}

// 多币种货币类
type MultiCurrencyMoney struct {
	// 金额，以分为单位
	Cent *int64 `json:"cent,omitempty" xml:"cent,omitempty" require:"true"`
	// 支付宝体系内一般存储币种值
	// example:
	//
	// 156
	CurrencyValue *string `json:"currency_value,omitempty" xml:"currency_value,omitempty" require:"true"`
}

func (s MultiCurrencyMoney) String() string {
	return tea.Prettify(s)
}

func (s MultiCurrencyMoney) GoString() string {
	return s.String()
}

func (s *MultiCurrencyMoney) SetCent(v int64) *MultiCurrencyMoney {
	s.Cent = &v
	return s
}

func (s *MultiCurrencyMoney) SetCurrencyValue(v string) *MultiCurrencyMoney {
	s.CurrencyValue = &v
	return s
}

// 资源包配置信息
type RespackageConfVO struct {
	// 模板code
	// example:
	//
	// test_deadline
	TemplateCode *string `json:"template_code,omitempty" xml:"template_code,omitempty"`
	// 模板展示名称
	// example:
	//
	// 资源包模板
	TemplateName *string `json:"template_name,omitempty" xml:"template_name,omitempty"`
	// 资源包模板维度
	// example:
	//
	// Single
	TemplateDimension *string `json:"template_dimension,omitempty" xml:"template_dimension,omitempty"`
	// 产品名称 -> 商品模型2.0中的渠道产品Code
	// example:
	//
	// testcode
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty"`
	// 商品名称 -> 商品模型2.0中的offerInnerCode
	// example:
	//
	// testcode
	OfferCode *string `json:"offer_code,omitempty" xml:"offer_code,omitempty"`
	// 抵扣的量价商品 -> 商品模型2.0中的渠道产品Code
	DeductProductCode []*string `json:"deduct_product_code,omitempty" xml:"deduct_product_code,omitempty" type:"Repeated"`
	// 抵扣的量价商品与计量项的关系
	DeductOmsField []*DeductOmsField `json:"deduct_oms_field,omitempty" xml:"deduct_oms_field,omitempty" type:"Repeated"`
	// 资源包抵扣类型
	// example:
	//
	// PeriodMonthly
	DeductType *string `json:"deduct_type,omitempty" xml:"deduct_type,omitempty"`
	// 产时的规格约束
	Specification []*StringMap `json:"specification,omitempty" xml:"specification,omitempty" type:"Repeated"`
	// 是否计算金额
	CalcAmount *bool `json:"calc_amount,omitempty" xml:"calc_amount,omitempty"`
	// 是否使用子包
	// example:
	//
	// true, false
	SubPack *bool `json:"sub_pack,omitempty" xml:"sub_pack,omitempty"`
	// 子包切分规则 None(不切割)、NaturalMonth(按自然月切割) 、SubscribeMonth(按订单月切割) *
	// example:
	//
	// None
	SubPackSplitType *string `json:"sub_pack_split_type,omitempty" xml:"sub_pack_split_type,omitempty"`
	// 关联子包模版
	// example:
	//
	// template
	RelTemplate *string `json:"rel_template,omitempty" xml:"rel_template,omitempty"`
}

func (s RespackageConfVO) String() string {
	return tea.Prettify(s)
}

func (s RespackageConfVO) GoString() string {
	return s.String()
}

func (s *RespackageConfVO) SetTemplateCode(v string) *RespackageConfVO {
	s.TemplateCode = &v
	return s
}

func (s *RespackageConfVO) SetTemplateName(v string) *RespackageConfVO {
	s.TemplateName = &v
	return s
}

func (s *RespackageConfVO) SetTemplateDimension(v string) *RespackageConfVO {
	s.TemplateDimension = &v
	return s
}

func (s *RespackageConfVO) SetProductCode(v string) *RespackageConfVO {
	s.ProductCode = &v
	return s
}

func (s *RespackageConfVO) SetOfferCode(v string) *RespackageConfVO {
	s.OfferCode = &v
	return s
}

func (s *RespackageConfVO) SetDeductProductCode(v []*string) *RespackageConfVO {
	s.DeductProductCode = v
	return s
}

func (s *RespackageConfVO) SetDeductOmsField(v []*DeductOmsField) *RespackageConfVO {
	s.DeductOmsField = v
	return s
}

func (s *RespackageConfVO) SetDeductType(v string) *RespackageConfVO {
	s.DeductType = &v
	return s
}

func (s *RespackageConfVO) SetSpecification(v []*StringMap) *RespackageConfVO {
	s.Specification = v
	return s
}

func (s *RespackageConfVO) SetCalcAmount(v bool) *RespackageConfVO {
	s.CalcAmount = &v
	return s
}

func (s *RespackageConfVO) SetSubPack(v bool) *RespackageConfVO {
	s.SubPack = &v
	return s
}

func (s *RespackageConfVO) SetSubPackSplitType(v string) *RespackageConfVO {
	s.SubPackSplitType = &v
	return s
}

func (s *RespackageConfVO) SetRelTemplate(v string) *RespackageConfVO {
	s.RelTemplate = &v
	return s
}

// 计费计划信息
type BillingPlanVO struct {
	// 计费规则code
	// example:
	//
	// 计费规则code
	BillingRuleCode *string `json:"billing_rule_code,omitempty" xml:"billing_rule_code,omitempty"`
	// 计量域code
	// example:
	//
	// domain_code
	DomainCode *string `json:"domain_code,omitempty" xml:"domain_code,omitempty"`
	// 产品名称 -> 商品模型2.0中的渠道产品Code
	// example:
	//
	// DYC
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty"`
	// 商品名称 -> 商品模型2.0中的offerInnerCode
	// example:
	//
	// twc_post
	OfferCode *string `json:"offer_code,omitempty" xml:"offer_code,omitempty"`
	// 采集维度，主实例/逻辑实例，默认主实例
	// example:
	//
	// mterid#instanceId
	BillDimension *string `json:"bill_dimension,omitempty" xml:"bill_dimension,omitempty"`
	// 是否启用资源包，默认是
	// example:
	//
	// true, false
	EnableResourcePackage *bool `json:"enable_resource_package,omitempty" xml:"enable_resource_package,omitempty"`
	// 累计模式(月/年/指定时间)
	// example:
	//
	// month
	CumulateCycle *string `json:"cumulate_cycle,omitempty" xml:"cumulate_cycle,omitempty"`
	// 转账类型(数字商品户解冻/文娱链户解冻/权益宝户解冻)，默认空
	// example:
	//
	// 文娱链户解冻
	TransferType *string `json:"transfer_type,omitempty" xml:"transfer_type,omitempty"`
	// 支付类型(代扣)，默认空
	// example:
	//
	// out
	PayAcceptType *string `json:"pay_accept_type,omitempty" xml:"pay_accept_type,omitempty"`
	// 核销类型(业务侧)，默认空
	// example:
	//
	// 核销类型(业务侧)，默认空
	WriteOffType *string `json:"write_off_type,omitempty" xml:"write_off_type,omitempty"`
	// 单次计价最大价格保护（元），默认1000000元
	// example:
	//
	// 100000000
	MaxPriceYuan *string `json:"max_price_yuan,omitempty" xml:"max_price_yuan,omitempty"`
	// 计费因子
	BillingfactorMetas []*BillingFactorMeta `json:"billingfactor_metas,omitempty" xml:"billingfactor_metas,omitempty" type:"Repeated"`
	// 受理类型
	// example:
	//
	// send
	AcceptType *string `json:"accept_type,omitempty" xml:"accept_type,omitempty"`
	// 周期
	// example:
	//
	// 02
	CollectPeriod *string `json:"collect_period,omitempty" xml:"collect_period,omitempty"`
	// 外部支付类型
	// example:
	//
	// 02
	OutPaidType *string `json:"out_paid_type,omitempty" xml:"out_paid_type,omitempty"`
	// 是否立即出账
	// example:
	//
	// true,false
	EnableRightRowCharge *bool `json:"enable_right_row_charge,omitempty" xml:"enable_right_row_charge,omitempty"`
	// 高精度累计类型
	// example:
	//
	// HIGH_PRECISION_S_M
	HighPrecisionCumulativeType *string `json:"high_precision_cumulative_type,omitempty" xml:"high_precision_cumulative_type,omitempty"`
}

func (s BillingPlanVO) String() string {
	return tea.Prettify(s)
}

func (s BillingPlanVO) GoString() string {
	return s.String()
}

func (s *BillingPlanVO) SetBillingRuleCode(v string) *BillingPlanVO {
	s.BillingRuleCode = &v
	return s
}

func (s *BillingPlanVO) SetDomainCode(v string) *BillingPlanVO {
	s.DomainCode = &v
	return s
}

func (s *BillingPlanVO) SetProductCode(v string) *BillingPlanVO {
	s.ProductCode = &v
	return s
}

func (s *BillingPlanVO) SetOfferCode(v string) *BillingPlanVO {
	s.OfferCode = &v
	return s
}

func (s *BillingPlanVO) SetBillDimension(v string) *BillingPlanVO {
	s.BillDimension = &v
	return s
}

func (s *BillingPlanVO) SetEnableResourcePackage(v bool) *BillingPlanVO {
	s.EnableResourcePackage = &v
	return s
}

func (s *BillingPlanVO) SetCumulateCycle(v string) *BillingPlanVO {
	s.CumulateCycle = &v
	return s
}

func (s *BillingPlanVO) SetTransferType(v string) *BillingPlanVO {
	s.TransferType = &v
	return s
}

func (s *BillingPlanVO) SetPayAcceptType(v string) *BillingPlanVO {
	s.PayAcceptType = &v
	return s
}

func (s *BillingPlanVO) SetWriteOffType(v string) *BillingPlanVO {
	s.WriteOffType = &v
	return s
}

func (s *BillingPlanVO) SetMaxPriceYuan(v string) *BillingPlanVO {
	s.MaxPriceYuan = &v
	return s
}

func (s *BillingPlanVO) SetBillingfactorMetas(v []*BillingFactorMeta) *BillingPlanVO {
	s.BillingfactorMetas = v
	return s
}

func (s *BillingPlanVO) SetAcceptType(v string) *BillingPlanVO {
	s.AcceptType = &v
	return s
}

func (s *BillingPlanVO) SetCollectPeriod(v string) *BillingPlanVO {
	s.CollectPeriod = &v
	return s
}

func (s *BillingPlanVO) SetOutPaidType(v string) *BillingPlanVO {
	s.OutPaidType = &v
	return s
}

func (s *BillingPlanVO) SetEnableRightRowCharge(v bool) *BillingPlanVO {
	s.EnableRightRowCharge = &v
	return s
}

func (s *BillingPlanVO) SetHighPrecisionCumulativeType(v string) *BillingPlanVO {
	s.HighPrecisionCumulativeType = &v
	return s
}

// 计量域信息
type DomainConfigVO struct {
	// 操作类型
	// example:
	//
	// ADD
	OperateType *string `json:"operate_type,omitempty" xml:"operate_type,omitempty"`
	// 产品域Code，例如OSS
	// example:
	//
	// test_r
	DomainCode *string `json:"domain_code,omitempty" xml:"domain_code,omitempty"`
	// 版本
	// example:
	//
	// 2023#test_r
	DomainVersion *string `json:"domain_version,omitempty" xml:"domain_version,omitempty"`
	// 计量域中文名称
	// example:
	//
	// 中文名
	ChineseName *string `json:"chinese_name,omitempty" xml:"chinese_name,omitempty"`
	// 计量域英文名称
	// example:
	//
	// english_name
	EnglishName *string `json:"english_name,omitempty" xml:"english_name,omitempty"`
	// 计量域描述
	// example:
	//
	// 计量域描述
	DomainDesc *string `json:"domain_desc,omitempty" xml:"domain_desc,omitempty"`
	// 渠道产品Code
	// example:
	//
	// serviceCode
	ServiceCode *string `json:"service_code,omitempty" xml:"service_code,omitempty"`
	// 商品code
	// example:
	//
	// 商品code
	CommodityCode *string `json:"commodity_code,omitempty" xml:"commodity_code,omitempty"`
	// 推送类型
	// example:
	//
	// 全量
	PushType *string `json:"push_type,omitempty" xml:"push_type,omitempty"`
	// 计量数据维度
	// example:
	//
	// r
	Dimension *string `json:"dimension,omitempty" xml:"dimension,omitempty"`
	// 环境标识
	// example:
	//
	// prod
	Env *string `json:"env,omitempty" xml:"env,omitempty"`
	// 计量说明
	// example:
	//
	// 说明
	Memo *string `json:"memo,omitempty" xml:"memo,omitempty"`
	// domainCode是否需要聚合
	// example:
	//
	// N
	NeedAggregate *string `json:"need_aggregate,omitempty" xml:"need_aggregate,omitempty"`
	// 创建者
	// example:
	//
	// 工号
	Creator *string `json:"creator,omitempty" xml:"creator,omitempty"`
	// 修改者
	// example:
	//
	// 工号
	Modifier *string `json:"modifier,omitempty" xml:"modifier,omitempty"`
	// 计量项list
	DomainFieldSet []*DomainField `json:"domain_field_set,omitempty" xml:"domain_field_set,omitempty" type:"Repeated"`
	// 主键规则配置
	PrimaryKeyGenRule *PrimaryKeyGenRule `json:"primary_key_gen_rule,omitempty" xml:"primary_key_gen_rule,omitempty"`
	// 计量节点
	DomainNodeSet []*DomainNode `json:"domain_node_set,omitempty" xml:"domain_node_set,omitempty" type:"Repeated"`
	// 计量域成员信息
	MeterDomainMemberSet []*MeterDomainMember `json:"meter_domain_member_set,omitempty" xml:"meter_domain_member_set,omitempty" type:"Repeated"`
	// DomainSLS配置
	DomainSls *DomainSls `json:"domain_sls,omitempty" xml:"domain_sls,omitempty"`
}

func (s DomainConfigVO) String() string {
	return tea.Prettify(s)
}

func (s DomainConfigVO) GoString() string {
	return s.String()
}

func (s *DomainConfigVO) SetOperateType(v string) *DomainConfigVO {
	s.OperateType = &v
	return s
}

func (s *DomainConfigVO) SetDomainCode(v string) *DomainConfigVO {
	s.DomainCode = &v
	return s
}

func (s *DomainConfigVO) SetDomainVersion(v string) *DomainConfigVO {
	s.DomainVersion = &v
	return s
}

func (s *DomainConfigVO) SetChineseName(v string) *DomainConfigVO {
	s.ChineseName = &v
	return s
}

func (s *DomainConfigVO) SetEnglishName(v string) *DomainConfigVO {
	s.EnglishName = &v
	return s
}

func (s *DomainConfigVO) SetDomainDesc(v string) *DomainConfigVO {
	s.DomainDesc = &v
	return s
}

func (s *DomainConfigVO) SetServiceCode(v string) *DomainConfigVO {
	s.ServiceCode = &v
	return s
}

func (s *DomainConfigVO) SetCommodityCode(v string) *DomainConfigVO {
	s.CommodityCode = &v
	return s
}

func (s *DomainConfigVO) SetPushType(v string) *DomainConfigVO {
	s.PushType = &v
	return s
}

func (s *DomainConfigVO) SetDimension(v string) *DomainConfigVO {
	s.Dimension = &v
	return s
}

func (s *DomainConfigVO) SetEnv(v string) *DomainConfigVO {
	s.Env = &v
	return s
}

func (s *DomainConfigVO) SetMemo(v string) *DomainConfigVO {
	s.Memo = &v
	return s
}

func (s *DomainConfigVO) SetNeedAggregate(v string) *DomainConfigVO {
	s.NeedAggregate = &v
	return s
}

func (s *DomainConfigVO) SetCreator(v string) *DomainConfigVO {
	s.Creator = &v
	return s
}

func (s *DomainConfigVO) SetModifier(v string) *DomainConfigVO {
	s.Modifier = &v
	return s
}

func (s *DomainConfigVO) SetDomainFieldSet(v []*DomainField) *DomainConfigVO {
	s.DomainFieldSet = v
	return s
}

func (s *DomainConfigVO) SetPrimaryKeyGenRule(v *PrimaryKeyGenRule) *DomainConfigVO {
	s.PrimaryKeyGenRule = v
	return s
}

func (s *DomainConfigVO) SetDomainNodeSet(v []*DomainNode) *DomainConfigVO {
	s.DomainNodeSet = v
	return s
}

func (s *DomainConfigVO) SetMeterDomainMemberSet(v []*MeterDomainMember) *DomainConfigVO {
	s.MeterDomainMemberSet = v
	return s
}

func (s *DomainConfigVO) SetDomainSls(v *DomainSls) *DomainConfigVO {
	s.DomainSls = v
	return s
}

// 资源包模板模型
type ResPackageTemplateNewMeta struct {
	// 资源包code
	// example:
	//
	// test_deadline
	TemplateName *string `json:"template_name,omitempty" xml:"template_name,omitempty" require:"true"`
	// 资源包模板类型
	// example:
	//
	// single
	TemplateType *string `json:"template_type,omitempty" xml:"template_type,omitempty" require:"true"`
	// 抵扣类型
	// example:
	//
	// deadline
	DeductType *string `json:"deduct_type,omitempty" xml:"deduct_type,omitempty" require:"true"`
	// 资源包l5code
	// example:
	//
	// testcode
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty" require:"true"`
	// 资源包serviceCode
	// example:
	//
	// serviceCode
	ProductName *string `json:"product_name,omitempty" xml:"product_name,omitempty" require:"true"`
	// 资源包模板名称
	// example:
	//
	// 测试资源包模板
	DisplayName *string `json:"display_name,omitempty" xml:"display_name,omitempty" require:"true"`
	// 可抵扣的l5code
	// example:
	//
	// testcode
	ApplicableProductName *string `json:"applicable_product_name,omitempty" xml:"applicable_product_name,omitempty" require:"true"`
	// 收费事件码
	// example:
	//
	// eventcode
	ProdEventCode *string `json:"prod_event_code,omitempty" xml:"prod_event_code,omitempty"`
	// 抵扣优先级
	// example:
	//
	// 1
	Priority *string `json:"priority,omitempty" xml:"priority,omitempty"`
	// 是否可续费
	// example:
	//
	// true
	Renewable *bool `json:"renewable,omitempty" xml:"renewable,omitempty"`
	// 是否可升级
	// example:
	//
	// true
	Upgradable *bool `json:"upgradable,omitempty" xml:"upgradable,omitempty"`
	// 单位转换关系
	// example:
	//
	// [{"ratio":"1","unit":"次","roundMode":7,"scale":0},{"ratio":"10000","unit":"万次","roundMode":4,"scale":4}]
	UnitKey *string `json:"unit_key,omitempty" xml:"unit_key,omitempty" require:"true"`
	// 是否计算金额
	// example:
	//
	// true
	CalcAmount *bool `json:"calc_amount,omitempty" xml:"calc_amount,omitempty" require:"true"`
	// 是否使用子包
	// example:
	//
	// true
	SubPack *bool `json:"sub_pack,omitempty" xml:"sub_pack,omitempty" require:"true"`
	// 子包切分规则
	// example:
	//
	// None
	SubPackSplitType *string `json:"sub_pack_split_type,omitempty" xml:"sub_pack_split_type,omitempty"`
	// 关联子包模版
	// example:
	//
	// test_deadline
	RelTemplate *string `json:"rel_template,omitempty" xml:"rel_template,omitempty"`
	// 状态
	// example:
	//
	// effect
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 资源包约束元数据列表
	// example:
	//
	// undefined
	ResourcePackageConstraintMetas []*ResourcePackageConstraintMeta `json:"resource_package_constraint_metas,omitempty" xml:"resource_package_constraint_metas,omitempty" type:"Repeated"`
}

func (s ResPackageTemplateNewMeta) String() string {
	return tea.Prettify(s)
}

func (s ResPackageTemplateNewMeta) GoString() string {
	return s.String()
}

func (s *ResPackageTemplateNewMeta) SetTemplateName(v string) *ResPackageTemplateNewMeta {
	s.TemplateName = &v
	return s
}

func (s *ResPackageTemplateNewMeta) SetTemplateType(v string) *ResPackageTemplateNewMeta {
	s.TemplateType = &v
	return s
}

func (s *ResPackageTemplateNewMeta) SetDeductType(v string) *ResPackageTemplateNewMeta {
	s.DeductType = &v
	return s
}

func (s *ResPackageTemplateNewMeta) SetProductCode(v string) *ResPackageTemplateNewMeta {
	s.ProductCode = &v
	return s
}

func (s *ResPackageTemplateNewMeta) SetProductName(v string) *ResPackageTemplateNewMeta {
	s.ProductName = &v
	return s
}

func (s *ResPackageTemplateNewMeta) SetDisplayName(v string) *ResPackageTemplateNewMeta {
	s.DisplayName = &v
	return s
}

func (s *ResPackageTemplateNewMeta) SetApplicableProductName(v string) *ResPackageTemplateNewMeta {
	s.ApplicableProductName = &v
	return s
}

func (s *ResPackageTemplateNewMeta) SetProdEventCode(v string) *ResPackageTemplateNewMeta {
	s.ProdEventCode = &v
	return s
}

func (s *ResPackageTemplateNewMeta) SetPriority(v string) *ResPackageTemplateNewMeta {
	s.Priority = &v
	return s
}

func (s *ResPackageTemplateNewMeta) SetRenewable(v bool) *ResPackageTemplateNewMeta {
	s.Renewable = &v
	return s
}

func (s *ResPackageTemplateNewMeta) SetUpgradable(v bool) *ResPackageTemplateNewMeta {
	s.Upgradable = &v
	return s
}

func (s *ResPackageTemplateNewMeta) SetUnitKey(v string) *ResPackageTemplateNewMeta {
	s.UnitKey = &v
	return s
}

func (s *ResPackageTemplateNewMeta) SetCalcAmount(v bool) *ResPackageTemplateNewMeta {
	s.CalcAmount = &v
	return s
}

func (s *ResPackageTemplateNewMeta) SetSubPack(v bool) *ResPackageTemplateNewMeta {
	s.SubPack = &v
	return s
}

func (s *ResPackageTemplateNewMeta) SetSubPackSplitType(v string) *ResPackageTemplateNewMeta {
	s.SubPackSplitType = &v
	return s
}

func (s *ResPackageTemplateNewMeta) SetRelTemplate(v string) *ResPackageTemplateNewMeta {
	s.RelTemplate = &v
	return s
}

func (s *ResPackageTemplateNewMeta) SetStatus(v string) *ResPackageTemplateNewMeta {
	s.Status = &v
	return s
}

func (s *ResPackageTemplateNewMeta) SetResourcePackageConstraintMetas(v []*ResourcePackageConstraintMeta) *ResPackageTemplateNewMeta {
	s.ResourcePackageConstraintMetas = v
	return s
}

// 校验失败的变更因子
type FailChangeFactor struct {
	// 失败的路径值
	// example:
	//
	// base.domainCode
	FailKey *string `json:"fail_key,omitempty" xml:"fail_key,omitempty" require:"true"`
	// 失败原因
	// example:
	//
	// 失败原因
	FailReason *string `json:"fail_reason,omitempty" xml:"fail_reason,omitempty" require:"true"`
}

func (s FailChangeFactor) String() string {
	return tea.Prettify(s)
}

func (s FailChangeFactor) GoString() string {
	return s.String()
}

func (s *FailChangeFactor) SetFailKey(v string) *FailChangeFactor {
	s.FailKey = &v
	return s
}

func (s *FailChangeFactor) SetFailReason(v string) *FailChangeFactor {
	s.FailReason = &v
	return s
}

// 计量计费配置模型（展示变更）
type FeeConfEntityVO struct {
	// 计量域配置信息
	DomainConfigParam *DomainConfigVO `json:"domain_config_param,omitempty" xml:"domain_config_param,omitempty"`
	// 计费计划配置
	BillingRuleMeta *BillingPlanVO `json:"billing_rule_meta,omitempty" xml:"billing_rule_meta,omitempty"`
	// 资源包配置
	ResPackageTemplateMeta []*RespackageConfVO `json:"res_package_template_meta,omitempty" xml:"res_package_template_meta,omitempty" type:"Repeated"`
	// 新资源包模板
	// example:
	//
	// undefined
	ResPackageTemplateNewMeta []*ResPackageTemplateNewMeta `json:"res_package_template_new_meta,omitempty" xml:"res_package_template_new_meta,omitempty" type:"Repeated"`
}

func (s FeeConfEntityVO) String() string {
	return tea.Prettify(s)
}

func (s FeeConfEntityVO) GoString() string {
	return s.String()
}

func (s *FeeConfEntityVO) SetDomainConfigParam(v *DomainConfigVO) *FeeConfEntityVO {
	s.DomainConfigParam = v
	return s
}

func (s *FeeConfEntityVO) SetBillingRuleMeta(v *BillingPlanVO) *FeeConfEntityVO {
	s.BillingRuleMeta = v
	return s
}

func (s *FeeConfEntityVO) SetResPackageTemplateMeta(v []*RespackageConfVO) *FeeConfEntityVO {
	s.ResPackageTemplateMeta = v
	return s
}

func (s *FeeConfEntityVO) SetResPackageTemplateNewMeta(v []*ResPackageTemplateNewMeta) *FeeConfEntityVO {
	s.ResPackageTemplateNewMeta = v
	return s
}

// 资源包日志VO
type ResourcePackageLogVO struct {
	// 流水号
	// example:
	//
	// 1
	Id *string `json:"id,omitempty" xml:"id,omitempty"`
	// 资源包实例
	// example:
	//
	// 1
	ResourcePackageInstanceId *string `json:"resource_package_instance_id,omitempty" xml:"resource_package_instance_id,omitempty"`
	// 资源包展示名称
	// example:
	//
	// 1
	ResourcePackageDisplayName *string `json:"resource_package_display_name,omitempty" xml:"resource_package_display_name,omitempty"`
	// 抵扣前容量
	// example:
	//
	// 1
	CapacityBeforeDeduct *string `json:"capacity_before_deduct,omitempty" xml:"capacity_before_deduct,omitempty"`
	// 抵扣前容量单位
	// example:
	//
	// 1
	CapacityBeforeDeductUnit *string `json:"capacity_before_deduct_unit,omitempty" xml:"capacity_before_deduct_unit,omitempty"`
	// 抵扣后容量
	// example:
	//
	// 1
	CapacityAfterDeduct *string `json:"capacity_after_deduct,omitempty" xml:"capacity_after_deduct,omitempty"`
	// 抵扣后容量单位
	// example:
	//
	// 1
	CapacityAfterDeductUnit *string `json:"capacity_after_deduct_unit,omitempty" xml:"capacity_after_deduct_unit,omitempty"`
	// 本次抵扣量
	// example:
	//
	// 1
	DeductedAmount *string `json:"deducted_amount,omitempty" xml:"deducted_amount,omitempty"`
	// 本次抵扣量单位
	// example:
	//
	// 1
	DeductedAmountUnit *string `json:"deducted_amount_unit,omitempty" xml:"deducted_amount_unit,omitempty"`
	// 账单id
	// example:
	//
	// 1
	ChargeBillId *string `json:"charge_bill_id,omitempty" xml:"charge_bill_id,omitempty"`
	// 详单id
	// example:
	//
	// 1
	BillDetailId *string `json:"bill_detail_id,omitempty" xml:"bill_detail_id,omitempty"`
	// 被抵扣的产品名
	// example:
	//
	// 1
	DeductedProductName *string `json:"deducted_product_name,omitempty" xml:"deducted_product_name,omitempty"`
	// 被抵扣实例id
	// example:
	//
	// 1
	DeductedInstanceId *string `json:"deducted_instance_id,omitempty" xml:"deducted_instance_id,omitempty"`
	// 抵扣的字段
	// example:
	//
	// 1
	OmsField *string `json:"oms_field,omitempty" xml:"oms_field,omitempty"`
	// 抵扣发生时间
	DeductTime *string `json:"deduct_time,omitempty" xml:"deduct_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 类型
	// example:
	//
	// 1
	Type *string `json:"type,omitempty" xml:"type,omitempty"`
	// 抵扣资金
	// example:
	//
	// 1
	DeductedFund *string `json:"deducted_fund,omitempty" xml:"deducted_fund,omitempty"`
	// 剩余资金
	// example:
	//
	// 1
	RemainFund *string `json:"remain_fund,omitempty" xml:"remain_fund,omitempty"`
	// 抵扣发生时间
	OmsStartTime *string `json:"oms_start_time,omitempty" xml:"oms_start_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 抵扣发生时间
	OmsEndTime *string `json:"oms_end_time,omitempty" xml:"oms_end_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// extendInfo
	// example:
	//
	// JSON
	ExtendInfo *string `json:"extend_info,omitempty" xml:"extend_info,omitempty"`
}

func (s ResourcePackageLogVO) String() string {
	return tea.Prettify(s)
}

func (s ResourcePackageLogVO) GoString() string {
	return s.String()
}

func (s *ResourcePackageLogVO) SetId(v string) *ResourcePackageLogVO {
	s.Id = &v
	return s
}

func (s *ResourcePackageLogVO) SetResourcePackageInstanceId(v string) *ResourcePackageLogVO {
	s.ResourcePackageInstanceId = &v
	return s
}

func (s *ResourcePackageLogVO) SetResourcePackageDisplayName(v string) *ResourcePackageLogVO {
	s.ResourcePackageDisplayName = &v
	return s
}

func (s *ResourcePackageLogVO) SetCapacityBeforeDeduct(v string) *ResourcePackageLogVO {
	s.CapacityBeforeDeduct = &v
	return s
}

func (s *ResourcePackageLogVO) SetCapacityBeforeDeductUnit(v string) *ResourcePackageLogVO {
	s.CapacityBeforeDeductUnit = &v
	return s
}

func (s *ResourcePackageLogVO) SetCapacityAfterDeduct(v string) *ResourcePackageLogVO {
	s.CapacityAfterDeduct = &v
	return s
}

func (s *ResourcePackageLogVO) SetCapacityAfterDeductUnit(v string) *ResourcePackageLogVO {
	s.CapacityAfterDeductUnit = &v
	return s
}

func (s *ResourcePackageLogVO) SetDeductedAmount(v string) *ResourcePackageLogVO {
	s.DeductedAmount = &v
	return s
}

func (s *ResourcePackageLogVO) SetDeductedAmountUnit(v string) *ResourcePackageLogVO {
	s.DeductedAmountUnit = &v
	return s
}

func (s *ResourcePackageLogVO) SetChargeBillId(v string) *ResourcePackageLogVO {
	s.ChargeBillId = &v
	return s
}

func (s *ResourcePackageLogVO) SetBillDetailId(v string) *ResourcePackageLogVO {
	s.BillDetailId = &v
	return s
}

func (s *ResourcePackageLogVO) SetDeductedProductName(v string) *ResourcePackageLogVO {
	s.DeductedProductName = &v
	return s
}

func (s *ResourcePackageLogVO) SetDeductedInstanceId(v string) *ResourcePackageLogVO {
	s.DeductedInstanceId = &v
	return s
}

func (s *ResourcePackageLogVO) SetOmsField(v string) *ResourcePackageLogVO {
	s.OmsField = &v
	return s
}

func (s *ResourcePackageLogVO) SetDeductTime(v string) *ResourcePackageLogVO {
	s.DeductTime = &v
	return s
}

func (s *ResourcePackageLogVO) SetType(v string) *ResourcePackageLogVO {
	s.Type = &v
	return s
}

func (s *ResourcePackageLogVO) SetDeductedFund(v string) *ResourcePackageLogVO {
	s.DeductedFund = &v
	return s
}

func (s *ResourcePackageLogVO) SetRemainFund(v string) *ResourcePackageLogVO {
	s.RemainFund = &v
	return s
}

func (s *ResourcePackageLogVO) SetOmsStartTime(v string) *ResourcePackageLogVO {
	s.OmsStartTime = &v
	return s
}

func (s *ResourcePackageLogVO) SetOmsEndTime(v string) *ResourcePackageLogVO {
	s.OmsEndTime = &v
	return s
}

func (s *ResourcePackageLogVO) SetExtendInfo(v string) *ResourcePackageLogVO {
	s.ExtendInfo = &v
	return s
}

// 详单维度资源包抵扣详情
type ResourcePackageDeductDetailVO struct {
	// 资源包抵扣日志id
	// example:
	//
	// 11
	ResourcePackageLogId *string `json:"resource_package_log_id,omitempty" xml:"resource_package_log_id,omitempty"`
	// 资源包抵扣量
	// example:
	//
	// 1
	DeductedAmount *string `json:"deducted_amount,omitempty" xml:"deducted_amount,omitempty"`
	// 资源包id
	// example:
	//
	// aaa
	ResourcePackageId *string `json:"resource_package_id,omitempty" xml:"resource_package_id,omitempty"`
	// 资源包实例id
	// example:
	//
	// aaa
	ResourcePackageInstanceId *string `json:"resource_package_instance_id,omitempty" xml:"resource_package_instance_id,omitempty"`
}

func (s ResourcePackageDeductDetailVO) String() string {
	return tea.Prettify(s)
}

func (s ResourcePackageDeductDetailVO) GoString() string {
	return s.String()
}

func (s *ResourcePackageDeductDetailVO) SetResourcePackageLogId(v string) *ResourcePackageDeductDetailVO {
	s.ResourcePackageLogId = &v
	return s
}

func (s *ResourcePackageDeductDetailVO) SetDeductedAmount(v string) *ResourcePackageDeductDetailVO {
	s.DeductedAmount = &v
	return s
}

func (s *ResourcePackageDeductDetailVO) SetResourcePackageId(v string) *ResourcePackageDeductDetailVO {
	s.ResourcePackageId = &v
	return s
}

func (s *ResourcePackageDeductDetailVO) SetResourcePackageInstanceId(v string) *ResourcePackageDeductDetailVO {
	s.ResourcePackageInstanceId = &v
	return s
}

// 记录计财域中变更
type FeeChangeFactorVO struct {
	// 哪个字段变更
	// example:
	//
	// newFeeEntity.field
	Key *string `json:"key,omitempty" xml:"key,omitempty" require:"true"`
	// 改变类型
	// example:
	//
	// UPDATE,ADD,DELETE
	ChangeType *string `json:"change_type,omitempty" xml:"change_type,omitempty" require:"true"`
}

func (s FeeChangeFactorVO) String() string {
	return tea.Prettify(s)
}

func (s FeeChangeFactorVO) GoString() string {
	return s.String()
}

func (s *FeeChangeFactorVO) SetKey(v string) *FeeChangeFactorVO {
	s.Key = &v
	return s
}

func (s *FeeChangeFactorVO) SetChangeType(v string) *FeeChangeFactorVO {
	s.ChangeType = &v
	return s
}

// 计费详单VO
type ChargeBillVO struct {
	// 主键Id
	// example:
	//
	// 1
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 租户Id
	// example:
	//
	// 2333
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 合约号
	// example:
	//
	// dasd
	ArNo *string `json:"ar_no,omitempty" xml:"ar_no,omitempty"`
	// 资源名称@ProductEnum
	// example:
	//
	// 资源名称
	ProdCode *string `json:"prod_code,omitempty" xml:"prod_code,omitempty"`
	// 云产品收费事件码
	// example:
	//
	// adqd
	ProdEventCode *string `json:"prod_event_code,omitempty" xml:"prod_event_code,omitempty"`
	// 实例id
	// example:
	//
	// eqw
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty"`
	// 账单计费状态@ChargeBillStatusEnum
	// example:
	//
	// INIT
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 账单金额
	// example:
	//
	// 11
	Amount *MultiCurrencyMoney `json:"amount,omitempty" xml:"amount,omitempty"`
	// 优惠金额
	// example:
	//
	// 11
	DiscountFee *MultiCurrencyMoney `json:"discount_fee,omitempty" xml:"discount_fee,omitempty"`
	// 高精度金额
	// example:
	//
	// 11
	HighPrecisionAmount *string `json:"high_precision_amount,omitempty" xml:"high_precision_amount,omitempty"`
	// 高精度活动金额
	// example:
	//
	// 11
	HighPrecisionDiscountFee *string `json:"high_precision_discount_fee,omitempty" xml:"high_precision_discount_fee,omitempty"`
	// 优惠券抵扣金额
	// example:
	//
	// 11
	CouponSettleAmount *MultiCurrencyMoney `json:"coupon_settle_amount,omitempty" xml:"coupon_settle_amount,omitempty"`
	// 高精度优惠券抵扣金额
	// example:
	//
	// 11
	HighPrecisionCouponSettleAmount *string `json:"high_precision_coupon_settle_amount,omitempty" xml:"high_precision_coupon_settle_amount,omitempty"`
	// 优惠券id
	// example:
	//
	// 11
	CouponId *string `json:"coupon_id,omitempty" xml:"coupon_id,omitempty"`
	// 应付金额
	// example:
	//
	// 11
	RequireAmount *MultiCurrencyMoney `json:"require_amount,omitempty" xml:"require_amount,omitempty"`
	// 高精度应付金额
	// example:
	//
	// 11
	HighPrecisionRequireAmount *string `json:"high_precision_require_amount,omitempty" xml:"high_precision_require_amount,omitempty"`
	// 账单对应的使用时间区间的开始时间
	// example:
	//
	// 2018-10-10T10:10:00Z
	GmtFeeStartTime *string `json:"gmt_fee_start_time,omitempty" xml:"gmt_fee_start_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 账单对应的使用时间区间的结束时间
	// example:
	//
	// 2018-10-10T10:10:00Z
	GmtFeeEndTime *string `json:"gmt_fee_end_time,omitempty" xml:"gmt_fee_end_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// This property corresponds to db column <tt>extend_info</tt>.
	// example:
	//
	// JSON
	ExtendInfo *string `json:"extend_info,omitempty" xml:"extend_info,omitempty"`
	// 是否有流量包抵扣
	// example:
	//
	// true, false
	IsFlowPackDeducted *bool `json:"is_flow_pack_deducted,omitempty" xml:"is_flow_pack_deducted,omitempty"`
}

func (s ChargeBillVO) String() string {
	return tea.Prettify(s)
}

func (s ChargeBillVO) GoString() string {
	return s.String()
}

func (s *ChargeBillVO) SetId(v string) *ChargeBillVO {
	s.Id = &v
	return s
}

func (s *ChargeBillVO) SetTenantId(v string) *ChargeBillVO {
	s.TenantId = &v
	return s
}

func (s *ChargeBillVO) SetArNo(v string) *ChargeBillVO {
	s.ArNo = &v
	return s
}

func (s *ChargeBillVO) SetProdCode(v string) *ChargeBillVO {
	s.ProdCode = &v
	return s
}

func (s *ChargeBillVO) SetProdEventCode(v string) *ChargeBillVO {
	s.ProdEventCode = &v
	return s
}

func (s *ChargeBillVO) SetInstanceId(v string) *ChargeBillVO {
	s.InstanceId = &v
	return s
}

func (s *ChargeBillVO) SetStatus(v string) *ChargeBillVO {
	s.Status = &v
	return s
}

func (s *ChargeBillVO) SetAmount(v *MultiCurrencyMoney) *ChargeBillVO {
	s.Amount = v
	return s
}

func (s *ChargeBillVO) SetDiscountFee(v *MultiCurrencyMoney) *ChargeBillVO {
	s.DiscountFee = v
	return s
}

func (s *ChargeBillVO) SetHighPrecisionAmount(v string) *ChargeBillVO {
	s.HighPrecisionAmount = &v
	return s
}

func (s *ChargeBillVO) SetHighPrecisionDiscountFee(v string) *ChargeBillVO {
	s.HighPrecisionDiscountFee = &v
	return s
}

func (s *ChargeBillVO) SetCouponSettleAmount(v *MultiCurrencyMoney) *ChargeBillVO {
	s.CouponSettleAmount = v
	return s
}

func (s *ChargeBillVO) SetHighPrecisionCouponSettleAmount(v string) *ChargeBillVO {
	s.HighPrecisionCouponSettleAmount = &v
	return s
}

func (s *ChargeBillVO) SetCouponId(v string) *ChargeBillVO {
	s.CouponId = &v
	return s
}

func (s *ChargeBillVO) SetRequireAmount(v *MultiCurrencyMoney) *ChargeBillVO {
	s.RequireAmount = v
	return s
}

func (s *ChargeBillVO) SetHighPrecisionRequireAmount(v string) *ChargeBillVO {
	s.HighPrecisionRequireAmount = &v
	return s
}

func (s *ChargeBillVO) SetGmtFeeStartTime(v string) *ChargeBillVO {
	s.GmtFeeStartTime = &v
	return s
}

func (s *ChargeBillVO) SetGmtFeeEndTime(v string) *ChargeBillVO {
	s.GmtFeeEndTime = &v
	return s
}

func (s *ChargeBillVO) SetExtendInfo(v string) *ChargeBillVO {
	s.ExtendInfo = &v
	return s
}

func (s *ChargeBillVO) SetIsFlowPackDeducted(v bool) *ChargeBillVO {
	s.IsFlowPackDeducted = &v
	return s
}

// 收费项模型VO
type ChargeItemVO struct {
	// 收费项对应的枚举编码@ProductConstraintEnum
	// example:
	//
	// a
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 收费项对应的云产品条件code@ProductConstraintEnum
	// example:
	//
	// a
	Code *string `json:"code,omitempty" xml:"code,omitempty"`
	// 使用量
	// example:
	//
	// 1
	Value *string `json:"value,omitempty" xml:"value,omitempty"`
	// 度量单位
	// example:
	//
	// m
	Unit *string `json:"unit,omitempty" xml:"unit,omitempty"`
	// 计费项类型
	// example:
	//
	// type
	Type *string `json:"type,omitempty" xml:"type,omitempty"`
	// 计费项名称-前端显示
	// example:
	//
	// display_name
	DisplayName *string `json:"display_name,omitempty" xml:"display_name,omitempty"`
	// 计费项单位-前端显示
	// example:
	//
	// displayUnit
	DisplayUnit *string `json:"display_unit,omitempty" xml:"display_unit,omitempty"`
	// 计费项值-前端显示
	// example:
	//
	// display_value
	DisplayValue *string `json:"display_value,omitempty" xml:"display_value,omitempty"`
}

func (s ChargeItemVO) String() string {
	return tea.Prettify(s)
}

func (s ChargeItemVO) GoString() string {
	return s.String()
}

func (s *ChargeItemVO) SetName(v string) *ChargeItemVO {
	s.Name = &v
	return s
}

func (s *ChargeItemVO) SetCode(v string) *ChargeItemVO {
	s.Code = &v
	return s
}

func (s *ChargeItemVO) SetValue(v string) *ChargeItemVO {
	s.Value = &v
	return s
}

func (s *ChargeItemVO) SetUnit(v string) *ChargeItemVO {
	s.Unit = &v
	return s
}

func (s *ChargeItemVO) SetType(v string) *ChargeItemVO {
	s.Type = &v
	return s
}

func (s *ChargeItemVO) SetDisplayName(v string) *ChargeItemVO {
	s.DisplayName = &v
	return s
}

func (s *ChargeItemVO) SetDisplayUnit(v string) *ChargeItemVO {
	s.DisplayUnit = &v
	return s
}

func (s *ChargeItemVO) SetDisplayValue(v string) *ChargeItemVO {
	s.DisplayValue = &v
	return s
}

// 分页返参
type PaginationResult struct {
	// 查询结果
	Data []*ChargeBillVO `json:"data,omitempty" xml:"data,omitempty" require:"true" type:"Repeated"`
	// 当前页
	// example:
	//
	// 1
	CurrentPage *int64 `json:"current_page,omitempty" xml:"current_page,omitempty" require:"true"`
	// 分页大小
	// example:
	//
	// 20
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
	// 查询结果总数
	// example:
	//
	// 12
	TotalCount *int64 `json:"total_count,omitempty" xml:"total_count,omitempty" require:"true"`
	// 状态
	// example:
	//
	// true, false
	Success *bool `json:"success,omitempty" xml:"success,omitempty" require:"true"`
}

func (s PaginationResult) String() string {
	return tea.Prettify(s)
}

func (s PaginationResult) GoString() string {
	return s.String()
}

func (s *PaginationResult) SetData(v []*ChargeBillVO) *PaginationResult {
	s.Data = v
	return s
}

func (s *PaginationResult) SetCurrentPage(v int64) *PaginationResult {
	s.CurrentPage = &v
	return s
}

func (s *PaginationResult) SetPageSize(v int64) *PaginationResult {
	s.PageSize = &v
	return s
}

func (s *PaginationResult) SetTotalCount(v int64) *PaginationResult {
	s.TotalCount = &v
	return s
}

func (s *PaginationResult) SetSuccess(v bool) *PaginationResult {
	s.Success = &v
	return s
}

// 资源包实例信息VO
type ResourcePackageInstanceVO struct {
	// 流水号
	// example:
	//
	// 1
	Id *string `json:"id,omitempty" xml:"id,omitempty"`
	// 租户id
	// example:
	//
	// 2088101118131245
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 实例名称
	// example:
	//
	// 实例
	InstanceName *string `json:"instance_name,omitempty" xml:"instance_name,omitempty"`
	// 资源包前端展现名称
	// example:
	//
	// 名称
	ResourcePackageDisplayName *string `json:"resource_package_display_name,omitempty" xml:"resource_package_display_name,omitempty"`
	// 资源包商品名
	// example:
	//
	// 资源包商品名
	ResourcePackageProductName *string `json:"resource_package_product_name,omitempty" xml:"resource_package_product_name,omitempty"`
	// 资源包可抵扣资源名称
	// example:
	//
	// 资源包可抵扣资源名称
	ApplicableProductName *string `json:"applicable_product_name,omitempty" xml:"applicable_product_name,omitempty"`
	// 当前状态-VALID、CLOSED、INVALID
	// example:
	//
	// INVALID
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 是否可续费
	// example:
	//
	// true, false
	Renewable *bool `json:"renewable,omitempty" xml:"renewable,omitempty"`
	// 是否可升级
	// example:
	//
	// true, false
	Upgradable *bool `json:"upgradable,omitempty" xml:"upgradable,omitempty"`
	// 初始容量
	// example:
	//
	// 1
	InitialCapacity *string `json:"initial_capacity,omitempty" xml:"initial_capacity,omitempty"`
	// 当前容量
	// example:
	//
	// 1
	CurrentCapacity *string `json:"current_capacity,omitempty" xml:"current_capacity,omitempty"`
	// 初始容量单位
	// example:
	//
	// 1
	InitCapacityViewUnit *string `json:"init_capacity_view_unit,omitempty" xml:"init_capacity_view_unit,omitempty"`
	// 当前容量单位
	// example:
	//
	// 1
	CurrentCapacityViewUnit *string `json:"current_capacity_view_unit,omitempty" xml:"current_capacity_view_unit,omitempty"`
	// 有效期开始时间
	StartTime *string `json:"start_time,omitempty" xml:"start_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 有效期结束时间
	EndTime *string `json:"end_time,omitempty" xml:"end_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 总资金
	// example:
	//
	// 1
	TotalFund *string `json:"total_fund,omitempty" xml:"total_fund,omitempty"`
	// 剩余资金
	// example:
	//
	// 1
	RemainFund *string `json:"remain_fund,omitempty" xml:"remain_fund,omitempty"`
	// 子包信息
	SubResourcePackageVos []*ResourcePackageLogVO `json:"sub_resource_package_vos,omitempty" xml:"sub_resource_package_vos,omitempty" type:"Repeated"`
}

func (s ResourcePackageInstanceVO) String() string {
	return tea.Prettify(s)
}

func (s ResourcePackageInstanceVO) GoString() string {
	return s.String()
}

func (s *ResourcePackageInstanceVO) SetId(v string) *ResourcePackageInstanceVO {
	s.Id = &v
	return s
}

func (s *ResourcePackageInstanceVO) SetTenantId(v string) *ResourcePackageInstanceVO {
	s.TenantId = &v
	return s
}

func (s *ResourcePackageInstanceVO) SetInstanceName(v string) *ResourcePackageInstanceVO {
	s.InstanceName = &v
	return s
}

func (s *ResourcePackageInstanceVO) SetResourcePackageDisplayName(v string) *ResourcePackageInstanceVO {
	s.ResourcePackageDisplayName = &v
	return s
}

func (s *ResourcePackageInstanceVO) SetResourcePackageProductName(v string) *ResourcePackageInstanceVO {
	s.ResourcePackageProductName = &v
	return s
}

func (s *ResourcePackageInstanceVO) SetApplicableProductName(v string) *ResourcePackageInstanceVO {
	s.ApplicableProductName = &v
	return s
}

func (s *ResourcePackageInstanceVO) SetStatus(v string) *ResourcePackageInstanceVO {
	s.Status = &v
	return s
}

func (s *ResourcePackageInstanceVO) SetRenewable(v bool) *ResourcePackageInstanceVO {
	s.Renewable = &v
	return s
}

func (s *ResourcePackageInstanceVO) SetUpgradable(v bool) *ResourcePackageInstanceVO {
	s.Upgradable = &v
	return s
}

func (s *ResourcePackageInstanceVO) SetInitialCapacity(v string) *ResourcePackageInstanceVO {
	s.InitialCapacity = &v
	return s
}

func (s *ResourcePackageInstanceVO) SetCurrentCapacity(v string) *ResourcePackageInstanceVO {
	s.CurrentCapacity = &v
	return s
}

func (s *ResourcePackageInstanceVO) SetInitCapacityViewUnit(v string) *ResourcePackageInstanceVO {
	s.InitCapacityViewUnit = &v
	return s
}

func (s *ResourcePackageInstanceVO) SetCurrentCapacityViewUnit(v string) *ResourcePackageInstanceVO {
	s.CurrentCapacityViewUnit = &v
	return s
}

func (s *ResourcePackageInstanceVO) SetStartTime(v string) *ResourcePackageInstanceVO {
	s.StartTime = &v
	return s
}

func (s *ResourcePackageInstanceVO) SetEndTime(v string) *ResourcePackageInstanceVO {
	s.EndTime = &v
	return s
}

func (s *ResourcePackageInstanceVO) SetTotalFund(v string) *ResourcePackageInstanceVO {
	s.TotalFund = &v
	return s
}

func (s *ResourcePackageInstanceVO) SetRemainFund(v string) *ResourcePackageInstanceVO {
	s.RemainFund = &v
	return s
}

func (s *ResourcePackageInstanceVO) SetSubResourcePackageVos(v []*ResourcePackageLogVO) *ResourcePackageInstanceVO {
	s.SubResourcePackageVos = v
	return s
}

// 本次抵扣结果
type OmsDataComponentDeductDetailResultVO struct {
	// 资源包抵扣日志id
	// example:
	//
	// 1233
	ResourcePackageLogId *string `json:"resource_package_log_id,omitempty" xml:"resource_package_log_id,omitempty" require:"true"`
	// 资源包抵扣量
	DeductAmount *int64 `json:"deduct_amount,omitempty" xml:"deduct_amount,omitempty" require:"true"`
	// 资源包抵扣价值
	// example:
	//
	// 123
	DeductedFund *string `json:"deducted_fund,omitempty" xml:"deducted_fund,omitempty" require:"true"`
	// 资源包抵扣时间
	// example:
	//
	// 2018-10-10T10:10:00Z
	DeductedTime *string `json:"deducted_time,omitempty" xml:"deducted_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 资源包id
	// example:
	//
	// A0SQBRFM01222133ORGJC1CN1ZXEMO6K8TL
	ResourcePackageId *string `json:"resource_package_id,omitempty" xml:"resource_package_id,omitempty" require:"true"`
	// 资源包实例id
	// example:
	//
	// 资源包实例id
	ResourcePackageInstanceId *string `json:"resource_package_instance_id,omitempty" xml:"resource_package_instance_id,omitempty" require:"true"`
}

func (s OmsDataComponentDeductDetailResultVO) String() string {
	return tea.Prettify(s)
}

func (s OmsDataComponentDeductDetailResultVO) GoString() string {
	return s.String()
}

func (s *OmsDataComponentDeductDetailResultVO) SetResourcePackageLogId(v string) *OmsDataComponentDeductDetailResultVO {
	s.ResourcePackageLogId = &v
	return s
}

func (s *OmsDataComponentDeductDetailResultVO) SetDeductAmount(v int64) *OmsDataComponentDeductDetailResultVO {
	s.DeductAmount = &v
	return s
}

func (s *OmsDataComponentDeductDetailResultVO) SetDeductedFund(v string) *OmsDataComponentDeductDetailResultVO {
	s.DeductedFund = &v
	return s
}

func (s *OmsDataComponentDeductDetailResultVO) SetDeductedTime(v string) *OmsDataComponentDeductDetailResultVO {
	s.DeductedTime = &v
	return s
}

func (s *OmsDataComponentDeductDetailResultVO) SetResourcePackageId(v string) *OmsDataComponentDeductDetailResultVO {
	s.ResourcePackageId = &v
	return s
}

func (s *OmsDataComponentDeductDetailResultVO) SetResourcePackageInstanceId(v string) *OmsDataComponentDeductDetailResultVO {
	s.ResourcePackageInstanceId = &v
	return s
}

// 实例维度月账单
type InstanceMonthlyBillVO struct {
	// 金融云租户id
	// example:
	//
	// 2088101118131245
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 产品类别@ProductServiceEnum
	// example:
	//
	// MONITOR
	ProductCategory *string `json:"product_category,omitempty" xml:"product_category,omitempty" require:"true"`
	// 产品名称
	// example:
	//
	// test
	ProductName *string `json:"product_name,omitempty" xml:"product_name,omitempty" require:"true"`
	// 付费类型
	// example:
	//
	// AFTER_PAY
	ChargeType *string `json:"charge_type,omitempty" xml:"charge_type,omitempty" require:"true"`
	// 实例id
	// example:
	//
	// ASXASDAZAZ
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty" require:"true"`
	// 账单月份
	// example:
	//
	// yyyyMM(202201)
	BillMonth *string `json:"bill_month,omitempty" xml:"bill_month,omitempty" require:"true"`
	// 应收金额(不包含优惠券和折扣)
	BillAmount *MultiCurrencyMoney `json:"bill_amount,omitempty" xml:"bill_amount,omitempty"`
	// 优惠券抵扣金额
	// example:
	//
	// 100.10
	CouponAmount *MultiCurrencyMoney `json:"coupon_amount,omitempty" xml:"coupon_amount,omitempty" require:"true"`
	// 高精度优惠券金额
	// example:
	//
	// 1.01
	HighPrecisionCouponAmount *string `json:"high_precision_coupon_amount,omitempty" xml:"high_precision_coupon_amount,omitempty" require:"true"`
	// 折扣金额
	// example:
	//
	// 11.01
	DiscountAmount *MultiCurrencyMoney `json:"discount_amount,omitempty" xml:"discount_amount,omitempty" require:"true"`
	// 高精度折扣金额
	// example:
	//
	// 1.01
	HighPrecisionDiscountAmount *string `json:"high_precision_discount_amount,omitempty" xml:"high_precision_discount_amount,omitempty" require:"true"`
	// 调账金额
	// example:
	//
	// 1.01
	AdjustAmount *MultiCurrencyMoney `json:"adjust_amount,omitempty" xml:"adjust_amount,omitempty" require:"true"`
	// 已收金额
	// example:
	//
	// 1.01
	ReceivedAmount *MultiCurrencyMoney `json:"received_amount,omitempty" xml:"received_amount,omitempty" require:"true"`
	// 账单应收日期
	// example:
	//
	// 2018-10-10T10:10:00Z
	AccountReceivableDate *string `json:"account_receivable_date,omitempty" xml:"account_receivable_date,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 月账单号
	// example:
	//
	// 123123
	InstanceMonthlyBillId *string `json:"instance_monthly_bill_id,omitempty" xml:"instance_monthly_bill_id,omitempty" require:"true"`
	// 支付渠道
	// example:
	//
	// test
	PayChannel *string `json:"pay_channel,omitempty" xml:"pay_channel,omitempty" require:"true"`
	// 合同ID
	// example:
	//
	// 123123
	ContractId *string `json:"contract_id,omitempty" xml:"contract_id,omitempty" require:"true"`
	// map的json串
	// example:
	//
	// {"test":"tets"}
	ExtendInfo *string `json:"extend_info,omitempty" xml:"extend_info,omitempty" require:"true"`
	// 未结清金额
	UnsettledAmount *MultiCurrencyMoney `json:"unsettled_amount,omitempty" xml:"unsettled_amount,omitempty" require:"true"`
	// 优惠金额
	TotalDiscountAmount *MultiCurrencyMoney `json:"total_discount_amount,omitempty" xml:"total_discount_amount,omitempty" require:"true"`
}

func (s InstanceMonthlyBillVO) String() string {
	return tea.Prettify(s)
}

func (s InstanceMonthlyBillVO) GoString() string {
	return s.String()
}

func (s *InstanceMonthlyBillVO) SetTenantId(v string) *InstanceMonthlyBillVO {
	s.TenantId = &v
	return s
}

func (s *InstanceMonthlyBillVO) SetProductCategory(v string) *InstanceMonthlyBillVO {
	s.ProductCategory = &v
	return s
}

func (s *InstanceMonthlyBillVO) SetProductName(v string) *InstanceMonthlyBillVO {
	s.ProductName = &v
	return s
}

func (s *InstanceMonthlyBillVO) SetChargeType(v string) *InstanceMonthlyBillVO {
	s.ChargeType = &v
	return s
}

func (s *InstanceMonthlyBillVO) SetInstanceId(v string) *InstanceMonthlyBillVO {
	s.InstanceId = &v
	return s
}

func (s *InstanceMonthlyBillVO) SetBillMonth(v string) *InstanceMonthlyBillVO {
	s.BillMonth = &v
	return s
}

func (s *InstanceMonthlyBillVO) SetBillAmount(v *MultiCurrencyMoney) *InstanceMonthlyBillVO {
	s.BillAmount = v
	return s
}

func (s *InstanceMonthlyBillVO) SetCouponAmount(v *MultiCurrencyMoney) *InstanceMonthlyBillVO {
	s.CouponAmount = v
	return s
}

func (s *InstanceMonthlyBillVO) SetHighPrecisionCouponAmount(v string) *InstanceMonthlyBillVO {
	s.HighPrecisionCouponAmount = &v
	return s
}

func (s *InstanceMonthlyBillVO) SetDiscountAmount(v *MultiCurrencyMoney) *InstanceMonthlyBillVO {
	s.DiscountAmount = v
	return s
}

func (s *InstanceMonthlyBillVO) SetHighPrecisionDiscountAmount(v string) *InstanceMonthlyBillVO {
	s.HighPrecisionDiscountAmount = &v
	return s
}

func (s *InstanceMonthlyBillVO) SetAdjustAmount(v *MultiCurrencyMoney) *InstanceMonthlyBillVO {
	s.AdjustAmount = v
	return s
}

func (s *InstanceMonthlyBillVO) SetReceivedAmount(v *MultiCurrencyMoney) *InstanceMonthlyBillVO {
	s.ReceivedAmount = v
	return s
}

func (s *InstanceMonthlyBillVO) SetAccountReceivableDate(v string) *InstanceMonthlyBillVO {
	s.AccountReceivableDate = &v
	return s
}

func (s *InstanceMonthlyBillVO) SetInstanceMonthlyBillId(v string) *InstanceMonthlyBillVO {
	s.InstanceMonthlyBillId = &v
	return s
}

func (s *InstanceMonthlyBillVO) SetPayChannel(v string) *InstanceMonthlyBillVO {
	s.PayChannel = &v
	return s
}

func (s *InstanceMonthlyBillVO) SetContractId(v string) *InstanceMonthlyBillVO {
	s.ContractId = &v
	return s
}

func (s *InstanceMonthlyBillVO) SetExtendInfo(v string) *InstanceMonthlyBillVO {
	s.ExtendInfo = &v
	return s
}

func (s *InstanceMonthlyBillVO) SetUnsettledAmount(v *MultiCurrencyMoney) *InstanceMonthlyBillVO {
	s.UnsettledAmount = v
	return s
}

func (s *InstanceMonthlyBillVO) SetTotalDiscountAmount(v *MultiCurrencyMoney) *InstanceMonthlyBillVO {
	s.TotalDiscountAmount = v
	return s
}

// 计财配置变更模型
type FeeConfChangeVO struct {
	// 原本的计财配置
	OldConfEntity *FeeConfEntityVO `json:"old_conf_entity,omitempty" xml:"old_conf_entity,omitempty"`
	// 新的计财配置实体
	NewConfEntity *FeeConfEntityVO `json:"new_conf_entity,omitempty" xml:"new_conf_entity,omitempty"`
	// 变更字段列表
	ChangeFactorList []*FeeChangeFactorVO `json:"change_factor_list,omitempty" xml:"change_factor_list,omitempty" type:"Repeated"`
	// 失败的变更列表
	FailChangFactorList []*FailChangeFactor `json:"fail_chang_factor_list,omitempty" xml:"fail_chang_factor_list,omitempty" type:"Repeated"`
}

func (s FeeConfChangeVO) String() string {
	return tea.Prettify(s)
}

func (s FeeConfChangeVO) GoString() string {
	return s.String()
}

func (s *FeeConfChangeVO) SetOldConfEntity(v *FeeConfEntityVO) *FeeConfChangeVO {
	s.OldConfEntity = v
	return s
}

func (s *FeeConfChangeVO) SetNewConfEntity(v *FeeConfEntityVO) *FeeConfChangeVO {
	s.NewConfEntity = v
	return s
}

func (s *FeeConfChangeVO) SetChangeFactorList(v []*FeeChangeFactorVO) *FeeConfChangeVO {
	s.ChangeFactorList = v
	return s
}

func (s *FeeConfChangeVO) SetFailChangFactorList(v []*FailChangeFactor) *FeeConfChangeVO {
	s.FailChangFactorList = v
	return s
}

// 资源包余量结构体
type RespackegeBanlanceVO struct {
	// 资源包商品编码
	// example:
	//
	// ZLPTFM01221964
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty" require:"true"`
	// 资源包模板编码
	// example:
	//
	// ZNHYFM01222350_Deadline
	TempalteName *string `json:"tempalte_name,omitempty" xml:"tempalte_name,omitempty" require:"true"`
	// 资源包展示名称
	// example:
	//
	// credits资源包(加油包)
	DisplayName *string `json:"display_name,omitempty" xml:"display_name,omitempty" require:"true"`
	// 初始容量
	// example:
	//
	// 10000
	InitialCapacity *string `json:"initial_capacity,omitempty" xml:"initial_capacity,omitempty" require:"true"`
	// 当前余量
	// example:
	//
	// 10000
	CurrentCapacity *string `json:"current_capacity,omitempty" xml:"current_capacity,omitempty" require:"true"`
	// 总金额
	TotalFund *MultiCurrencyMoney `json:"total_fund,omitempty" xml:"total_fund,omitempty" require:"true"`
	// 剩余金额
	//
	RemainFund *MultiCurrencyMoney `json:"remain_fund,omitempty" xml:"remain_fund,omitempty" require:"true"`
}

func (s RespackegeBanlanceVO) String() string {
	return tea.Prettify(s)
}

func (s RespackegeBanlanceVO) GoString() string {
	return s.String()
}

func (s *RespackegeBanlanceVO) SetProductCode(v string) *RespackegeBanlanceVO {
	s.ProductCode = &v
	return s
}

func (s *RespackegeBanlanceVO) SetTempalteName(v string) *RespackegeBanlanceVO {
	s.TempalteName = &v
	return s
}

func (s *RespackegeBanlanceVO) SetDisplayName(v string) *RespackegeBanlanceVO {
	s.DisplayName = &v
	return s
}

func (s *RespackegeBanlanceVO) SetInitialCapacity(v string) *RespackegeBanlanceVO {
	s.InitialCapacity = &v
	return s
}

func (s *RespackegeBanlanceVO) SetCurrentCapacity(v string) *RespackegeBanlanceVO {
	s.CurrentCapacity = &v
	return s
}

func (s *RespackegeBanlanceVO) SetTotalFund(v *MultiCurrencyMoney) *RespackegeBanlanceVO {
	s.TotalFund = v
	return s
}

func (s *RespackegeBanlanceVO) SetRemainFund(v *MultiCurrencyMoney) *RespackegeBanlanceVO {
	s.RemainFund = v
	return s
}

// 详单VO
type BillDetailVO struct {
	// 主键Id
	// example:
	//
	// 1
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 账单Id
	// example:
	//
	// aa
	ChargeBillId *string `json:"charge_bill_id,omitempty" xml:"charge_bill_id,omitempty"`
	// 合约号
	// example:
	//
	// aa
	ArNo *string `json:"ar_no,omitempty" xml:"ar_no,omitempty"`
	// 资源名称@ResourceNameEnum
	// example:
	//
	// 名称
	ProdCode *string `json:"prod_code,omitempty" xml:"prod_code,omitempty"`
	// 云产品收费事件码
	// example:
	//
	// aa
	ProdEventCode *string `json:"prod_event_code,omitempty" xml:"prod_event_code,omitempty"`
	// 实例id
	// example:
	//
	// aa
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty"`
	// 账单金额
	// example:
	//
	// 1
	Amount *MultiCurrencyMoney `json:"amount,omitempty" xml:"amount,omitempty"`
	// 高精度金额
	// example:
	//
	// 1
	HighPrecisionAmount *string `json:"high_precision_amount,omitempty" xml:"high_precision_amount,omitempty"`
	// 优惠金额
	// example:
	//
	// 1
	DiscountFee *MultiCurrencyMoney `json:"discount_fee,omitempty" xml:"discount_fee,omitempty"`
	// 高精度优惠金额
	// example:
	//
	// 1
	HighPrecisionDiscountFee *string `json:"high_precision_discount_fee,omitempty" xml:"high_precision_discount_fee,omitempty"`
	// 流量包抵扣量
	FlowPackDeducted *int64 `json:"flow_pack_deducted,omitempty" xml:"flow_pack_deducted,omitempty"`
	// 流量包抵扣详情
	FlowPackDeductDetail []*ResourcePackageDeductDetailVO `json:"flow_pack_deduct_detail,omitempty" xml:"flow_pack_deduct_detail,omitempty" type:"Repeated"`
	// 账单对应的使用时间区间的开始时间
	// example:
	//
	// 2018-10-10T10:10:00Z
	GmtFeeStartTime *string `json:"gmt_fee_start_time,omitempty" xml:"gmt_fee_start_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 账单对应的使用时间区间的结束时间
	// example:
	//
	// 2018-10-10T10:10:00Z
	GmtFeeEndTime *string `json:"gmt_fee_end_time,omitempty" xml:"gmt_fee_end_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 计费项
	FeeItems []*ChargeItemVO `json:"fee_items,omitempty" xml:"fee_items,omitempty" type:"Repeated"`
	// 约束项
	ConstraintItems []*ChargeItemVO `json:"constraint_items,omitempty" xml:"constraint_items,omitempty" type:"Repeated"`
	// This property corresponds to db column <tt>extend_info</tt>.
	// example:
	//
	// JSON
	ExtendInfo *string `json:"extend_info,omitempty" xml:"extend_info,omitempty"`
}

func (s BillDetailVO) String() string {
	return tea.Prettify(s)
}

func (s BillDetailVO) GoString() string {
	return s.String()
}

func (s *BillDetailVO) SetId(v string) *BillDetailVO {
	s.Id = &v
	return s
}

func (s *BillDetailVO) SetChargeBillId(v string) *BillDetailVO {
	s.ChargeBillId = &v
	return s
}

func (s *BillDetailVO) SetArNo(v string) *BillDetailVO {
	s.ArNo = &v
	return s
}

func (s *BillDetailVO) SetProdCode(v string) *BillDetailVO {
	s.ProdCode = &v
	return s
}

func (s *BillDetailVO) SetProdEventCode(v string) *BillDetailVO {
	s.ProdEventCode = &v
	return s
}

func (s *BillDetailVO) SetInstanceId(v string) *BillDetailVO {
	s.InstanceId = &v
	return s
}

func (s *BillDetailVO) SetAmount(v *MultiCurrencyMoney) *BillDetailVO {
	s.Amount = v
	return s
}

func (s *BillDetailVO) SetHighPrecisionAmount(v string) *BillDetailVO {
	s.HighPrecisionAmount = &v
	return s
}

func (s *BillDetailVO) SetDiscountFee(v *MultiCurrencyMoney) *BillDetailVO {
	s.DiscountFee = v
	return s
}

func (s *BillDetailVO) SetHighPrecisionDiscountFee(v string) *BillDetailVO {
	s.HighPrecisionDiscountFee = &v
	return s
}

func (s *BillDetailVO) SetFlowPackDeducted(v int64) *BillDetailVO {
	s.FlowPackDeducted = &v
	return s
}

func (s *BillDetailVO) SetFlowPackDeductDetail(v []*ResourcePackageDeductDetailVO) *BillDetailVO {
	s.FlowPackDeductDetail = v
	return s
}

func (s *BillDetailVO) SetGmtFeeStartTime(v string) *BillDetailVO {
	s.GmtFeeStartTime = &v
	return s
}

func (s *BillDetailVO) SetGmtFeeEndTime(v string) *BillDetailVO {
	s.GmtFeeEndTime = &v
	return s
}

func (s *BillDetailVO) SetFeeItems(v []*ChargeItemVO) *BillDetailVO {
	s.FeeItems = v
	return s
}

func (s *BillDetailVO) SetConstraintItems(v []*ChargeItemVO) *BillDetailVO {
	s.ConstraintItems = v
	return s
}

func (s *BillDetailVO) SetExtendInfo(v string) *BillDetailVO {
	s.ExtendInfo = &v
	return s
}

// 目录对象
type CategoryVO struct {
	// 内部id
	Id *int64 `json:"id,omitempty" xml:"id,omitempty"`
	// 内容库id
	SiteId *int64 `json:"site_id,omitempty" xml:"site_id,omitempty"`
	// 站点
	// example:
	//
	// ""
	Site *string `json:"site,omitempty" xml:"site,omitempty"`
	// language
	// example:
	//
	// ""
	Language *string `json:"language,omitempty" xml:"language,omitempty"`
	// title
	// example:
	//
	// ""
	Title *string `json:"title,omitempty" xml:"title,omitempty"`
	// 类型
	Type *int64 `json:"type,omitempty" xml:"type,omitempty"`
	// 展示类型 1为左侧展示2为列表展示
	ShowType *int64 `json:"show_type,omitempty" xml:"show_type,omitempty"`
	// 排序
	Sort *int64 `json:"sort,omitempty" xml:"sort,omitempty"`
	// 目录层级
	Level *int64 `json:"level,omitempty" xml:"level,omitempty"`
	// 外标id
	// example:
	//
	// ""
	ExtId *string `json:"ext_id,omitempty" xml:"ext_id,omitempty"`
	// 父id
	// example:
	//
	// ""
	ParentId *string `json:"parent_id,omitempty" xml:"parent_id,omitempty"`
	// 来源类型
	SourceType *int64 `json:"source_type,omitempty" xml:"source_type,omitempty"`
	// 版本
	// example:
	//
	// ""
	Version *string `json:"version,omitempty" xml:"version,omitempty"`
	// 语雀目录有无数据判定
	CatalogueType *int64 `json:"catalogue_type,omitempty" xml:"catalogue_type,omitempty"`
}

func (s CategoryVO) String() string {
	return tea.Prettify(s)
}

func (s CategoryVO) GoString() string {
	return s.String()
}

func (s *CategoryVO) SetId(v int64) *CategoryVO {
	s.Id = &v
	return s
}

func (s *CategoryVO) SetSiteId(v int64) *CategoryVO {
	s.SiteId = &v
	return s
}

func (s *CategoryVO) SetSite(v string) *CategoryVO {
	s.Site = &v
	return s
}

func (s *CategoryVO) SetLanguage(v string) *CategoryVO {
	s.Language = &v
	return s
}

func (s *CategoryVO) SetTitle(v string) *CategoryVO {
	s.Title = &v
	return s
}

func (s *CategoryVO) SetType(v int64) *CategoryVO {
	s.Type = &v
	return s
}

func (s *CategoryVO) SetShowType(v int64) *CategoryVO {
	s.ShowType = &v
	return s
}

func (s *CategoryVO) SetSort(v int64) *CategoryVO {
	s.Sort = &v
	return s
}

func (s *CategoryVO) SetLevel(v int64) *CategoryVO {
	s.Level = &v
	return s
}

func (s *CategoryVO) SetExtId(v string) *CategoryVO {
	s.ExtId = &v
	return s
}

func (s *CategoryVO) SetParentId(v string) *CategoryVO {
	s.ParentId = &v
	return s
}

func (s *CategoryVO) SetSourceType(v int64) *CategoryVO {
	s.SourceType = &v
	return s
}

func (s *CategoryVO) SetVersion(v string) *CategoryVO {
	s.Version = &v
	return s
}

func (s *CategoryVO) SetCatalogueType(v int64) *CategoryVO {
	s.CatalogueType = &v
	return s
}

// NoviceMustSee
type NoviceMustSee struct {
	// novice_must_see_explain
	// example:
	//
	// ""
	NoviceMustSeeExplain *string `json:"novice_must_see_explain,omitempty" xml:"novice_must_see_explain,omitempty"`
	// novice_must_see_title1
	// example:
	//
	// ""
	NoviceMustSeeTitle1 *string `json:"novice_must_see_title1,omitempty" xml:"novice_must_see_title1,omitempty"`
	// novice_must_see_address1
	// example:
	//
	// 12
	NoviceMustSeeAddress1 *string `json:"novice_must_see_address1,omitempty" xml:"novice_must_see_address1,omitempty"`
	// novice_must_see_title2
	// example:
	//
	// ""
	NoviceMustSeeTitle2 *string `json:"novice_must_see_title2,omitempty" xml:"novice_must_see_title2,omitempty"`
	// novice_must_see_address2
	// example:
	//
	// ""
	NoviceMustSeeAddress2 *string `json:"novice_must_see_address2,omitempty" xml:"novice_must_see_address2,omitempty"`
	// novice_must_see_title3
	// example:
	//
	// ""
	NoviceMustSeeTitle3 *string `json:"novice_must_see_title3,omitempty" xml:"novice_must_see_title3,omitempty"`
	// novice_must_see_address3
	// example:
	//
	// ""
	NoviceMustSeeAddress3 *string `json:"novice_must_see_address3,omitempty" xml:"novice_must_see_address3,omitempty"`
}

func (s NoviceMustSee) String() string {
	return tea.Prettify(s)
}

func (s NoviceMustSee) GoString() string {
	return s.String()
}

func (s *NoviceMustSee) SetNoviceMustSeeExplain(v string) *NoviceMustSee {
	s.NoviceMustSeeExplain = &v
	return s
}

func (s *NoviceMustSee) SetNoviceMustSeeTitle1(v string) *NoviceMustSee {
	s.NoviceMustSeeTitle1 = &v
	return s
}

func (s *NoviceMustSee) SetNoviceMustSeeAddress1(v string) *NoviceMustSee {
	s.NoviceMustSeeAddress1 = &v
	return s
}

func (s *NoviceMustSee) SetNoviceMustSeeTitle2(v string) *NoviceMustSee {
	s.NoviceMustSeeTitle2 = &v
	return s
}

func (s *NoviceMustSee) SetNoviceMustSeeAddress2(v string) *NoviceMustSee {
	s.NoviceMustSeeAddress2 = &v
	return s
}

func (s *NoviceMustSee) SetNoviceMustSeeTitle3(v string) *NoviceMustSee {
	s.NoviceMustSeeTitle3 = &v
	return s
}

func (s *NoviceMustSee) SetNoviceMustSeeAddress3(v string) *NoviceMustSee {
	s.NoviceMustSeeAddress3 = &v
	return s
}

// 公司联系人
type CorporateContacts struct {
	// 职务
	// example:
	//
	// 总经理
	JobTitle *string `json:"job_title,omitempty" xml:"job_title,omitempty"`
	// 姓名
	// example:
	//
	// XXX
	RealName *string `json:"real_name,omitempty" xml:"real_name,omitempty" require:"true"`
	// 电话
	// example:
	//
	// 15888888888
	MobilePhone *string `json:"mobile_phone,omitempty" xml:"mobile_phone,omitempty"`
	// 邮箱
	// example:
	//
	// XXX@XXX.COM
	Email *string `json:"email,omitempty" xml:"email,omitempty"`
}

func (s CorporateContacts) String() string {
	return tea.Prettify(s)
}

func (s CorporateContacts) GoString() string {
	return s.String()
}

func (s *CorporateContacts) SetJobTitle(v string) *CorporateContacts {
	s.JobTitle = &v
	return s
}

func (s *CorporateContacts) SetRealName(v string) *CorporateContacts {
	s.RealName = &v
	return s
}

func (s *CorporateContacts) SetMobilePhone(v string) *CorporateContacts {
	s.MobilePhone = &v
	return s
}

func (s *CorporateContacts) SetEmail(v string) *CorporateContacts {
	s.Email = &v
	return s
}

// PopularDocument
type PopularDocument struct {
	// popular_document_title
	// example:
	//
	// ""
	PopularDocumentTitle *string `json:"popular_document_title,omitempty" xml:"popular_document_title,omitempty"`
	// popular_document_id
	// example:
	//
	// ""
	PopularDocumentId *string `json:"popular_document_id,omitempty" xml:"popular_document_id,omitempty"`
	// popular_document_info
	// example:
	//
	// ""
	PopularDocumentInfo *string `json:"popular_document_info,omitempty" xml:"popular_document_info,omitempty"`
	// children
	Children []*CategoryVO `json:"children,omitempty" xml:"children,omitempty" require:"true" type:"Repeated"`
}

func (s PopularDocument) String() string {
	return tea.Prettify(s)
}

func (s PopularDocument) GoString() string {
	return s.String()
}

func (s *PopularDocument) SetPopularDocumentTitle(v string) *PopularDocument {
	s.PopularDocumentTitle = &v
	return s
}

func (s *PopularDocument) SetPopularDocumentId(v string) *PopularDocument {
	s.PopularDocumentId = &v
	return s
}

func (s *PopularDocument) SetPopularDocumentInfo(v string) *PopularDocument {
	s.PopularDocumentInfo = &v
	return s
}

func (s *PopularDocument) SetChildren(v []*CategoryVO) *PopularDocument {
	s.Children = v
	return s
}

// 商机信息
type BusinessRequest struct {
	// 客户名称
	// example:
	//
	// XXX公司
	CustomerName *string `json:"customer_name,omitempty" xml:"customer_name,omitempty" require:"true"`
	// 客户id
	// example:
	//
	// XXX
	CustomerId *string `json:"customer_id,omitempty" xml:"customer_id,omitempty" require:"true"`
	// 商机名称
	// example:
	//
	// XXX
	BusinessName *string `json:"business_name,omitempty" xml:"business_name,omitempty" require:"true"`
	// 商机ID
	// example:
	//
	// xxx
	BusinessId *string `json:"business_id,omitempty" xml:"business_id,omitempty" require:"true"`
	// 未开通(INIT)/开通中(OPENING/已开通(OPEN)/使用中(USING)/闲置中(IDLE)/已关闭(CLOSE)
	// example:
	//
	// INIT
	BusinessStatus *string `json:"business_status,omitempty" xml:"business_status,omitempty" require:"true"`
	// 商机说明
	// example:
	//
	// XXX
	BusinessExplain *string `json:"business_explain,omitempty" xml:"business_explain,omitempty"`
	// 线索来源
	// example:
	//
	//
	Source *string `json:"source,omitempty" xml:"source,omitempty" require:"true"`
	// 商机时间
	// example:
	//
	// 2018-10-10T10:10:00Z
	BusinessDate *string `json:"business_date,omitempty" xml:"business_date,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 租户
	// example:
	//
	// BCC
	Tenant *string `json:"tenant,omitempty" xml:"tenant,omitempty" require:"true"`
	// 创建人工号
	// example:
	//
	// 132
	Creator *string `json:"creator,omitempty" xml:"creator,omitempty" require:"true"`
	// 创建人花名
	// example:
	//
	// XX
	CreatorNick *string `json:"creator_nick,omitempty" xml:"creator_nick,omitempty" require:"true"`
}

func (s BusinessRequest) String() string {
	return tea.Prettify(s)
}

func (s BusinessRequest) GoString() string {
	return s.String()
}

func (s *BusinessRequest) SetCustomerName(v string) *BusinessRequest {
	s.CustomerName = &v
	return s
}

func (s *BusinessRequest) SetCustomerId(v string) *BusinessRequest {
	s.CustomerId = &v
	return s
}

func (s *BusinessRequest) SetBusinessName(v string) *BusinessRequest {
	s.BusinessName = &v
	return s
}

func (s *BusinessRequest) SetBusinessId(v string) *BusinessRequest {
	s.BusinessId = &v
	return s
}

func (s *BusinessRequest) SetBusinessStatus(v string) *BusinessRequest {
	s.BusinessStatus = &v
	return s
}

func (s *BusinessRequest) SetBusinessExplain(v string) *BusinessRequest {
	s.BusinessExplain = &v
	return s
}

func (s *BusinessRequest) SetSource(v string) *BusinessRequest {
	s.Source = &v
	return s
}

func (s *BusinessRequest) SetBusinessDate(v string) *BusinessRequest {
	s.BusinessDate = &v
	return s
}

func (s *BusinessRequest) SetTenant(v string) *BusinessRequest {
	s.Tenant = &v
	return s
}

func (s *BusinessRequest) SetCreator(v string) *BusinessRequest {
	s.Creator = &v
	return s
}

func (s *BusinessRequest) SetCreatorNick(v string) *BusinessRequest {
	s.CreatorNick = &v
	return s
}

// 用于传输附件链接
type Attachment struct {
	// 文件唯一标识，作为幂等字段
	// example:
	//
	// 10100000219487
	FileId *string `json:"file_id,omitempty" xml:"file_id,omitempty" require:"true"`
	// 文件名称，用作展示
	// example:
	//
	// exmaple.pdf
	Filename *string `json:"filename,omitempty" xml:"filename,omitempty"`
	// 访问地址
	// example:
	//
	// 文件链接
	Url *string `json:"url,omitempty" xml:"url,omitempty" require:"true"`
}

func (s Attachment) String() string {
	return tea.Prettify(s)
}

func (s Attachment) GoString() string {
	return s.String()
}

func (s *Attachment) SetFileId(v string) *Attachment {
	s.FileId = &v
	return s
}

func (s *Attachment) SetFilename(v string) *Attachment {
	s.Filename = &v
	return s
}

func (s *Attachment) SetUrl(v string) *Attachment {
	s.Url = &v
	return s
}

// 页面上下文
type PageContext struct {
	// 页面di
	// example:
	//
	// 12
	PageId *string `json:"page_id,omitempty" xml:"page_id,omitempty"`
	// 页面标题
	// example:
	//
	// 12
	PageTitle *string `json:"page_title,omitempty" xml:"page_title,omitempty"`
}

func (s PageContext) String() string {
	return tea.Prettify(s)
}

func (s PageContext) GoString() string {
	return s.String()
}

func (s *PageContext) SetPageId(v string) *PageContext {
	s.PageId = &v
	return s
}

func (s *PageContext) SetPageTitle(v string) *PageContext {
	s.PageTitle = &v
	return s
}

// 情报资产详情
type Asset struct {
	// 资产标识，作为幂等单号
	// example:
	//
	// 2024112900876318
	AssetId *string `json:"asset_id,omitempty" xml:"asset_id,omitempty" require:"true"`
	// VALID - 生效；INVALID - 作废
	// example:
	//
	// 资产状态
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 资产详情，自定义展示
	// example:
	//
	// "{"company":"alpha","name":"beta","phone":"18812345678","email":"hello@example.com","position":"gamma","industry":"zeta","content":"delta"}"
	AssetInfo *string `json:"asset_info,omitempty" xml:"asset_info,omitempty" require:"true"`
}

func (s Asset) String() string {
	return tea.Prettify(s)
}

func (s Asset) GoString() string {
	return s.String()
}

func (s *Asset) SetAssetId(v string) *Asset {
	s.AssetId = &v
	return s
}

func (s *Asset) SetStatus(v string) *Asset {
	s.Status = &v
	return s
}

func (s *Asset) SetAssetInfo(v string) *Asset {
	s.AssetInfo = &v
	return s
}

// CategoryLocalVO
type CategoryLocalVO struct {
	// id
	Id *int64 `json:"id,omitempty" xml:"id,omitempty"`
	// siteId
	SiteId *int64 `json:"site_id,omitempty" xml:"site_id,omitempty"`
	// title
	// example:
	//
	// ""
	Title *string `json:"title,omitempty" xml:"title,omitempty"`
	// type
	Type *int64 `json:"type,omitempty" xml:"type,omitempty"`
	// sort
	Sort *int64 `json:"sort,omitempty" xml:"sort,omitempty"`
	// level
	Level *int64 `json:"level,omitempty" xml:"level,omitempty"`
	// parent_id
	// example:
	//
	// ""
	ParentId *string `json:"parent_id,omitempty" xml:"parent_id,omitempty"`
	// sourceType
	SourceType *int64 `json:"source_type,omitempty" xml:"source_type,omitempty"`
	// show_type
	ShowType *int64 `json:"show_type,omitempty" xml:"show_type,omitempty"`
	// ext_id
	// example:
	//
	// ""
	ExtId *string `json:"ext_id,omitempty" xml:"ext_id,omitempty"`
	// shield
	ShieId *int64 `json:"shie_id,omitempty" xml:"shie_id,omitempty"`
	// status
	Status *int64 `json:"status,omitempty" xml:"status,omitempty"`
	// deleted
	Deleted *int64 `json:"deleted,omitempty" xml:"deleted,omitempty"`
	// tree
	// example:
	//
	// ""
	Tree *string `json:"tree,omitempty" xml:"tree,omitempty"`
	// green
	Green *int64 `json:"green,omitempty" xml:"green,omitempty"`
	// site_code
	// example:
	//
	// ""
	SiteCode *string `json:"site_code,omitempty" xml:"site_code,omitempty"`
	// created_time
	// example:
	//
	// 2018-10-10T10:10:00Z
	CreatedTime *string `json:"created_time,omitempty" xml:"created_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// modified_time
	// example:
	//
	// 2018-10-10T10:10:00Z
	ModifiedTime *string `json:"modified_time,omitempty" xml:"modified_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// isCatalogue
	// example:
	//
	// true, false
	IsCatalogue *bool `json:"is_catalogue,omitempty" xml:"is_catalogue,omitempty"`
}

func (s CategoryLocalVO) String() string {
	return tea.Prettify(s)
}

func (s CategoryLocalVO) GoString() string {
	return s.String()
}

func (s *CategoryLocalVO) SetId(v int64) *CategoryLocalVO {
	s.Id = &v
	return s
}

func (s *CategoryLocalVO) SetSiteId(v int64) *CategoryLocalVO {
	s.SiteId = &v
	return s
}

func (s *CategoryLocalVO) SetTitle(v string) *CategoryLocalVO {
	s.Title = &v
	return s
}

func (s *CategoryLocalVO) SetType(v int64) *CategoryLocalVO {
	s.Type = &v
	return s
}

func (s *CategoryLocalVO) SetSort(v int64) *CategoryLocalVO {
	s.Sort = &v
	return s
}

func (s *CategoryLocalVO) SetLevel(v int64) *CategoryLocalVO {
	s.Level = &v
	return s
}

func (s *CategoryLocalVO) SetParentId(v string) *CategoryLocalVO {
	s.ParentId = &v
	return s
}

func (s *CategoryLocalVO) SetSourceType(v int64) *CategoryLocalVO {
	s.SourceType = &v
	return s
}

func (s *CategoryLocalVO) SetShowType(v int64) *CategoryLocalVO {
	s.ShowType = &v
	return s
}

func (s *CategoryLocalVO) SetExtId(v string) *CategoryLocalVO {
	s.ExtId = &v
	return s
}

func (s *CategoryLocalVO) SetShieId(v int64) *CategoryLocalVO {
	s.ShieId = &v
	return s
}

func (s *CategoryLocalVO) SetStatus(v int64) *CategoryLocalVO {
	s.Status = &v
	return s
}

func (s *CategoryLocalVO) SetDeleted(v int64) *CategoryLocalVO {
	s.Deleted = &v
	return s
}

func (s *CategoryLocalVO) SetTree(v string) *CategoryLocalVO {
	s.Tree = &v
	return s
}

func (s *CategoryLocalVO) SetGreen(v int64) *CategoryLocalVO {
	s.Green = &v
	return s
}

func (s *CategoryLocalVO) SetSiteCode(v string) *CategoryLocalVO {
	s.SiteCode = &v
	return s
}

func (s *CategoryLocalVO) SetCreatedTime(v string) *CategoryLocalVO {
	s.CreatedTime = &v
	return s
}

func (s *CategoryLocalVO) SetModifiedTime(v string) *CategoryLocalVO {
	s.ModifiedTime = &v
	return s
}

func (s *CategoryLocalVO) SetIsCatalogue(v bool) *CategoryLocalVO {
	s.IsCatalogue = &v
	return s
}

// 线索信息请求
type ClueInformationReq struct {
	// 线索标题
	// example:
	//
	// 标题
	Title *string `json:"title,omitempty" xml:"title,omitempty" require:"true"`
	// 线索跟进状态   INIT:待确认 CONTACTED:跟进中 CLOSED:线索终止 TRANSFER:已转交 BUSINESS:转商机
	// example:
	//
	//  INIT
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 线索跟进人  工号
	// example:
	//
	// 123132
	CreatedUserNick *string `json:"created_user_nick,omitempty" xml:"created_user_nick,omitempty" require:"true"`
	// 线索描述
	// example:
	//
	// 线索描述
	Description *string `json:"description,omitempty" xml:"description,omitempty" require:"true"`
	// 客户名称
	// example:
	//
	// XXX公司
	CustomerName *string `json:"customer_name,omitempty" xml:"customer_name,omitempty" require:"true"`
	// 业务线
	// example:
	//
	// XXX
	BizLine *string `json:"biz_line,omitempty" xml:"biz_line,omitempty" require:"true"`
	// 客户地址
	// example:
	//
	// XX省XX市XX区XXX
	CustomerLocation *string `json:"customer_location,omitempty" xml:"customer_location,omitempty" require:"true"`
	// 公司联系人
	// example:
	//
	// {           "jobTitle": "经理",           "realName": "张三",           "mobilePhone": "15888888888",           "email": "lisi@lisi.com"         }
	CorporateContacts []*CorporateContacts `json:"corporate_contacts,omitempty" xml:"corporate_contacts,omitempty" type:"Repeated"`
	// 客户所在行业
	// example:
	//
	// 金融
	CustomerIndustry *string `json:"customer_industry,omitempty" xml:"customer_industry,omitempty" require:"true"`
	// 客户营收规模
	// example:
	//
	//
	RevenueScale *string `json:"revenue_scale,omitempty" xml:"revenue_scale,omitempty"`
	// 社会信用代码
	// example:
	//
	// 914XXXXXXXXXXXXXXX
	SocialCreditCode *string `json:"social_credit_code,omitempty" xml:"social_credit_code,omitempty"`
	// 线索来源
	// example:
	//
	// LAOJIAO
	Source *string `json:"source,omitempty" xml:"source,omitempty" require:"true"`
	// 客户ID
	// example:
	//
	// 203434343
	CustomerId *string `json:"customer_id,omitempty" xml:"customer_id,omitempty"`
	// 多租户模型。线索服务化的租户模型。请联系线索服务管理员提供。固定值。
	// example:
	//
	// BCC
	Tenant *string `json:"tenant,omitempty" xml:"tenant,omitempty" require:"true"`
}

func (s ClueInformationReq) String() string {
	return tea.Prettify(s)
}

func (s ClueInformationReq) GoString() string {
	return s.String()
}

func (s *ClueInformationReq) SetTitle(v string) *ClueInformationReq {
	s.Title = &v
	return s
}

func (s *ClueInformationReq) SetStatus(v string) *ClueInformationReq {
	s.Status = &v
	return s
}

func (s *ClueInformationReq) SetCreatedUserNick(v string) *ClueInformationReq {
	s.CreatedUserNick = &v
	return s
}

func (s *ClueInformationReq) SetDescription(v string) *ClueInformationReq {
	s.Description = &v
	return s
}

func (s *ClueInformationReq) SetCustomerName(v string) *ClueInformationReq {
	s.CustomerName = &v
	return s
}

func (s *ClueInformationReq) SetBizLine(v string) *ClueInformationReq {
	s.BizLine = &v
	return s
}

func (s *ClueInformationReq) SetCustomerLocation(v string) *ClueInformationReq {
	s.CustomerLocation = &v
	return s
}

func (s *ClueInformationReq) SetCorporateContacts(v []*CorporateContacts) *ClueInformationReq {
	s.CorporateContacts = v
	return s
}

func (s *ClueInformationReq) SetCustomerIndustry(v string) *ClueInformationReq {
	s.CustomerIndustry = &v
	return s
}

func (s *ClueInformationReq) SetRevenueScale(v string) *ClueInformationReq {
	s.RevenueScale = &v
	return s
}

func (s *ClueInformationReq) SetSocialCreditCode(v string) *ClueInformationReq {
	s.SocialCreditCode = &v
	return s
}

func (s *ClueInformationReq) SetSource(v string) *ClueInformationReq {
	s.Source = &v
	return s
}

func (s *ClueInformationReq) SetCustomerId(v string) *ClueInformationReq {
	s.CustomerId = &v
	return s
}

func (s *ClueInformationReq) SetTenant(v string) *ClueInformationReq {
	s.Tenant = &v
	return s
}

// 内容对象
type ContentObjVO struct {
	// novice_must_sees
	NoviceMustSees []*NoviceMustSee `json:"novice_must_sees,omitempty" xml:"novice_must_sees,omitempty" type:"Repeated"`
	// popular_document
	PopularDocument []*PopularDocument `json:"popular_document,omitempty" xml:"popular_document,omitempty" type:"Repeated"`
	// product_presentation
	// example:
	//
	// 12
	ProductPresentation *string `json:"product_presentation,omitempty" xml:"product_presentation,omitempty"`
}

func (s ContentObjVO) String() string {
	return tea.Prettify(s)
}

func (s ContentObjVO) GoString() string {
	return s.String()
}

func (s *ContentObjVO) SetNoviceMustSees(v []*NoviceMustSee) *ContentObjVO {
	s.NoviceMustSees = v
	return s
}

func (s *ContentObjVO) SetPopularDocument(v []*PopularDocument) *ContentObjVO {
	s.PopularDocument = v
	return s
}

func (s *ContentObjVO) SetProductPresentation(v string) *ContentObjVO {
	s.ProductPresentation = &v
	return s
}

// 优惠券模型
type Coupon struct {
	// 优惠券ID
	// example:
	//
	// 1231313
	Id *int64 `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 优惠券名称,前端展示
	// example:
	//
	// XX优惠券
	DisplayName *string `json:"display_name,omitempty" xml:"display_name,omitempty" require:"true"`
	// 优惠券模板名称
	// example:
	//
	// XXXX
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 优惠券类型，VOUCHER：抵用券;CERTAIN：满减券；DISCOUNT：折扣券
	// example:
	//
	// VOUCHER
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 优惠券总金额，单位（分）。可使用优惠金额为amount-used_amount
	// example:
	//
	// 10000
	Amount *string `json:"amount,omitempty" xml:"amount,omitempty"`
	// 已使用金额，单位（分）。
	// example:
	//
	// 10000
	UsedAmount *string `json:"used_amount,omitempty" xml:"used_amount,omitempty"`
	// 状态，AVAILABLE-有效/EXPIRED-已过期/EXHAUSTED-已用完/ABANDONED-已作废
	// example:
	//
	// AVAILABLE
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 有效期开始时间
	// example:
	//
	// 2018-10-10T10:10:00Z
	StartTime *string `json:"start_time,omitempty" xml:"start_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 有效期结束时间
	// example:
	//
	// 2018-10-10T10:10:00Z
	EndTime *string `json:"end_time,omitempty" xml:"end_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 模板id
	// example:
	//
	// 111
	YouhuiTemplateId *int64 `json:"youhui_template_id,omitempty" xml:"youhui_template_id,omitempty" require:"true"`
	// 优惠券=折扣券时使用，如0.75
	// example:
	//
	// 0.75
	DiscountRate *string `json:"discount_rate,omitempty" xml:"discount_rate,omitempty"`
	// 优惠券类型=满减券时使用，如满2000元
	// example:
	//
	// 2000.00
	FullAmount *string `json:"full_amount,omitempty" xml:"full_amount,omitempty"`
	// 可以使用的总次数
	// example:
	//
	// 5
	UsageCount *int64 `json:"usage_count,omitempty" xml:"usage_count,omitempty" require:"true"`
	// 已使用次数（冻结次数）
	// example:
	//
	// 5
	UsedCount *int64 `json:"used_count,omitempty" xml:"used_count,omitempty" require:"true"`
	// 适用产品：通用/ECS/RDS
	// example:
	//
	// 通用
	ProductList *string `json:"product_list,omitempty" xml:"product_list,omitempty" require:"true"`
	// 适用订单类型
	// example:
	//
	// BUY
	OrderTypeList *string `json:"order_type_list,omitempty" xml:"order_type_list,omitempty" require:"true"`
	//  币种CurrencyCode CNY 代表人民币 USD代表美元
	// example:
	//
	// CNY
	Currency *string `json:"currency,omitempty" xml:"currency,omitempty" require:"true"`
	// 高精度总金额，单位元。可用金额 high_precision_available_amount = 总金额 high_precision_amount - 已使用金额 high_precision_used_amount
	// example:
	//
	// 100.00
	HighPrecisionAmount *string `json:"high_precision_amount,omitempty" xml:"high_precision_amount,omitempty" require:"true"`
	// 单位元
	// example:
	//
	// 0.001
	HighPrecisionUsedAmount *string `json:"high_precision_used_amount,omitempty" xml:"high_precision_used_amount,omitempty" require:"true"`
	// 单位元
	// example:
	//
	// 100.001
	HighPrecisionAvailableAmount *string `json:"high_precision_available_amount,omitempty" xml:"high_precision_available_amount,omitempty" require:"true"`
}

func (s Coupon) String() string {
	return tea.Prettify(s)
}

func (s Coupon) GoString() string {
	return s.String()
}

func (s *Coupon) SetId(v int64) *Coupon {
	s.Id = &v
	return s
}

func (s *Coupon) SetDisplayName(v string) *Coupon {
	s.DisplayName = &v
	return s
}

func (s *Coupon) SetName(v string) *Coupon {
	s.Name = &v
	return s
}

func (s *Coupon) SetType(v string) *Coupon {
	s.Type = &v
	return s
}

func (s *Coupon) SetAmount(v string) *Coupon {
	s.Amount = &v
	return s
}

func (s *Coupon) SetUsedAmount(v string) *Coupon {
	s.UsedAmount = &v
	return s
}

func (s *Coupon) SetStatus(v string) *Coupon {
	s.Status = &v
	return s
}

func (s *Coupon) SetStartTime(v string) *Coupon {
	s.StartTime = &v
	return s
}

func (s *Coupon) SetEndTime(v string) *Coupon {
	s.EndTime = &v
	return s
}

func (s *Coupon) SetYouhuiTemplateId(v int64) *Coupon {
	s.YouhuiTemplateId = &v
	return s
}

func (s *Coupon) SetDiscountRate(v string) *Coupon {
	s.DiscountRate = &v
	return s
}

func (s *Coupon) SetFullAmount(v string) *Coupon {
	s.FullAmount = &v
	return s
}

func (s *Coupon) SetUsageCount(v int64) *Coupon {
	s.UsageCount = &v
	return s
}

func (s *Coupon) SetUsedCount(v int64) *Coupon {
	s.UsedCount = &v
	return s
}

func (s *Coupon) SetProductList(v string) *Coupon {
	s.ProductList = &v
	return s
}

func (s *Coupon) SetOrderTypeList(v string) *Coupon {
	s.OrderTypeList = &v
	return s
}

func (s *Coupon) SetCurrency(v string) *Coupon {
	s.Currency = &v
	return s
}

func (s *Coupon) SetHighPrecisionAmount(v string) *Coupon {
	s.HighPrecisionAmount = &v
	return s
}

func (s *Coupon) SetHighPrecisionUsedAmount(v string) *Coupon {
	s.HighPrecisionUsedAmount = &v
	return s
}

func (s *Coupon) SetHighPrecisionAvailableAmount(v string) *Coupon {
	s.HighPrecisionAvailableAmount = &v
	return s
}

// 定价条件
type PriceConditionAttr struct {
	// 属性code
	// example:
	//
	// 属性code
	AttrCode *string `json:"attr_code,omitempty" xml:"attr_code,omitempty" require:"true"`
	// 属性值code
	// example:
	//
	// 属性值code
	AttrValueCode *string `json:"attr_value_code,omitempty" xml:"attr_value_code,omitempty" require:"true"`
	// 属性值名称
	// example:
	//
	// 属性值名称
	AttrValueName *string `json:"attr_value_name,omitempty" xml:"attr_value_name,omitempty" require:"true"`
	// 运算符，只有在约束条件中会出现
	// example:
	//
	// 运算符
	Operator *string `json:"operator,omitempty" xml:"operator,omitempty"`
}

func (s PriceConditionAttr) String() string {
	return tea.Prettify(s)
}

func (s PriceConditionAttr) GoString() string {
	return s.String()
}

func (s *PriceConditionAttr) SetAttrCode(v string) *PriceConditionAttr {
	s.AttrCode = &v
	return s
}

func (s *PriceConditionAttr) SetAttrValueCode(v string) *PriceConditionAttr {
	s.AttrValueCode = &v
	return s
}

func (s *PriceConditionAttr) SetAttrValueName(v string) *PriceConditionAttr {
	s.AttrValueName = &v
	return s
}

func (s *PriceConditionAttr) SetOperator(v string) *PriceConditionAttr {
	s.Operator = &v
	return s
}

// 商品属性结构
type CommodityAttribute struct {
	// 属性编码
	// example:
	//
	// CAPACITY
	Code *string `json:"code,omitempty" xml:"code,omitempty" require:"true"`
	// 属性名
	// example:
	//
	// 资源包容量
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 默认值
	// example:
	//
	// 100
	DefaultValue *string `json:"default_value,omitempty" xml:"default_value,omitempty" require:"true"`
	// 属性值类型，离散值：DISCRETE，数值：NUMBER
	// example:
	//
	// DISCRETE
	ValueType *string `json:"value_type,omitempty" xml:"value_type,omitempty" require:"true"`
	// 当是离散值类型时，为多个离散值逗号分隔
	// 当是数值类型时，为JSON，结构为{"rangeType":"open", "min":1, "max": 100, "step:1}
	// example:
	//
	// 100,200
	ValueRange *string `json:"value_range,omitempty" xml:"value_range,omitempty" require:"true"`
	// 展示类型
	// example:
	//
	// RadioGroup
	DisplayType *string `json:"display_type,omitempty" xml:"display_type,omitempty" require:"true"`
	// 提示文案
	// example:
	//
	// 这是一个属性
	Tips *string `json:"tips,omitempty" xml:"tips,omitempty" require:"true"`
	// 单位
	// example:
	//
	// 次、分钟
	Unit *string `json:"unit,omitempty" xml:"unit,omitempty" require:"true"`
}

func (s CommodityAttribute) String() string {
	return tea.Prettify(s)
}

func (s CommodityAttribute) GoString() string {
	return s.String()
}

func (s *CommodityAttribute) SetCode(v string) *CommodityAttribute {
	s.Code = &v
	return s
}

func (s *CommodityAttribute) SetName(v string) *CommodityAttribute {
	s.Name = &v
	return s
}

func (s *CommodityAttribute) SetDefaultValue(v string) *CommodityAttribute {
	s.DefaultValue = &v
	return s
}

func (s *CommodityAttribute) SetValueType(v string) *CommodityAttribute {
	s.ValueType = &v
	return s
}

func (s *CommodityAttribute) SetValueRange(v string) *CommodityAttribute {
	s.ValueRange = &v
	return s
}

func (s *CommodityAttribute) SetDisplayType(v string) *CommodityAttribute {
	s.DisplayType = &v
	return s
}

func (s *CommodityAttribute) SetTips(v string) *CommodityAttribute {
	s.Tips = &v
	return s
}

func (s *CommodityAttribute) SetUnit(v string) *CommodityAttribute {
	s.Unit = &v
	return s
}

// 非继承型一客一价
type NoExtendPrice struct {
	// 定价条件
	ConditionAttrs []*PriceConditionAttr `json:"condition_attrs,omitempty" xml:"condition_attrs,omitempty" type:"Repeated"`
	// 阶梯开始
	// example:
	//
	// 0
	LadderStart *string `json:"ladder_start,omitempty" xml:"ladder_start,omitempty" require:"true"`
	// 阶梯结束
	// example:
	//
	// infinity
	LadderEnd *string `json:"ladder_end,omitempty" xml:"ladder_end,omitempty" require:"true"`
	// 签约价
	// example:
	//
	// 100
	Price *string `json:"price,omitempty" xml:"price,omitempty" require:"true"`
	// 计价方法：具体公式、阶梯方法、自定义
	// example:
	//
	// nonAccDiffFullCalculation
	PricingMethod *string `json:"pricing_method,omitempty" xml:"pricing_method,omitempty" require:"true"`
	// 阶梯区间类型，左开右闭/左闭右开
	// example:
	//
	// LCRO
	LadderIntervalType *string `json:"ladder_interval_type,omitempty" xml:"ladder_interval_type,omitempty" require:"true"`
	// 定价对象code
	// example:
	//
	// SYS_USAGE_AMOUNT
	PriceObjectCode *string `json:"price_object_code,omitempty" xml:"price_object_code,omitempty" require:"true"`
	// 计价模式：公式、阶梯、自定义
	// example:
	//
	// ladder
	PricingMode *string `json:"pricing_mode,omitempty" xml:"pricing_mode,omitempty" require:"true"`
	// 价格单位
	// example:
	//
	// 元/次
	Unit *string `json:"unit,omitempty" xml:"unit,omitempty" require:"true"`
	// 是否阶梯总价
	// example:
	//
	// true, false
	LadderPriceFixed *bool `json:"ladder_price_fixed,omitempty" xml:"ladder_price_fixed,omitempty"`
}

func (s NoExtendPrice) String() string {
	return tea.Prettify(s)
}

func (s NoExtendPrice) GoString() string {
	return s.String()
}

func (s *NoExtendPrice) SetConditionAttrs(v []*PriceConditionAttr) *NoExtendPrice {
	s.ConditionAttrs = v
	return s
}

func (s *NoExtendPrice) SetLadderStart(v string) *NoExtendPrice {
	s.LadderStart = &v
	return s
}

func (s *NoExtendPrice) SetLadderEnd(v string) *NoExtendPrice {
	s.LadderEnd = &v
	return s
}

func (s *NoExtendPrice) SetPrice(v string) *NoExtendPrice {
	s.Price = &v
	return s
}

func (s *NoExtendPrice) SetPricingMethod(v string) *NoExtendPrice {
	s.PricingMethod = &v
	return s
}

func (s *NoExtendPrice) SetLadderIntervalType(v string) *NoExtendPrice {
	s.LadderIntervalType = &v
	return s
}

func (s *NoExtendPrice) SetPriceObjectCode(v string) *NoExtendPrice {
	s.PriceObjectCode = &v
	return s
}

func (s *NoExtendPrice) SetPricingMode(v string) *NoExtendPrice {
	s.PricingMode = &v
	return s
}

func (s *NoExtendPrice) SetUnit(v string) *NoExtendPrice {
	s.Unit = &v
	return s
}

func (s *NoExtendPrice) SetLadderPriceFixed(v bool) *NoExtendPrice {
	s.LadderPriceFixed = &v
	return s
}

// 订单周期结构
type OrderDuration struct {
	// 周期类型，YEAR：年；MONTH：月；DAY：日
	// example:
	//
	// YEAR
	DurationType *string `json:"duration_type,omitempty" xml:"duration_type,omitempty" require:"true"`
	// 订购周期值
	// example:
	//
	// 1
	DurationValue *int64 `json:"duration_value,omitempty" xml:"duration_value,omitempty" require:"true"`
}

func (s OrderDuration) String() string {
	return tea.Prettify(s)
}

func (s OrderDuration) GoString() string {
	return s.String()
}

func (s *OrderDuration) SetDurationType(v string) *OrderDuration {
	s.DurationType = &v
	return s
}

func (s *OrderDuration) SetDurationValue(v int64) *OrderDuration {
	s.DurationValue = &v
	return s
}

// 后付商品签约价，用于在履约阶段生成一客一价
type PostPayPrice struct {
	//  币种单位值，156（CNY)
	// example:
	//
	//  币种单位值，156（CNY)
	CurrencyValue *string `json:"currency_value,omitempty" xml:"currency_value,omitempty"`
	//  价格周期
	// example:
	//
	//  价格周期
	Duration *OrderDuration `json:"duration,omitempty" xml:"duration,omitempty"`
	// 非继承型一客一价
	// example:
	//
	// 非继承型一客一价
	NoExtendPrices []*NoExtendPrice `json:"no_extend_prices,omitempty" xml:"no_extend_prices,omitempty" type:"Repeated"`
}

func (s PostPayPrice) String() string {
	return tea.Prettify(s)
}

func (s PostPayPrice) GoString() string {
	return s.String()
}

func (s *PostPayPrice) SetCurrencyValue(v string) *PostPayPrice {
	s.CurrencyValue = &v
	return s
}

func (s *PostPayPrice) SetDuration(v *OrderDuration) *PostPayPrice {
	s.Duration = v
	return s
}

func (s *PostPayPrice) SetNoExtendPrices(v []*NoExtendPrice) *PostPayPrice {
	s.NoExtendPrices = v
	return s
}

// 商品订购属性结构
type CommodityOrderAttribute struct {
	// 属性编码
	// example:
	//
	// SYS_USAGE_AMOUNT
	Code *string `json:"code,omitempty" xml:"code,omitempty" require:"true"`
	// 属性值
	// example:
	//
	// abc
	Value *string `json:"value,omitempty" xml:"value,omitempty" require:"true"`
	// 属性值单位，部分数值型属性有多种单位，需要填入；其他情况不需要填
	// example:
	//
	// MB
	ValueUnit *string `json:"value_unit,omitempty" xml:"value_unit,omitempty" require:"true"`
}

func (s CommodityOrderAttribute) String() string {
	return tea.Prettify(s)
}

func (s CommodityOrderAttribute) GoString() string {
	return s.String()
}

func (s *CommodityOrderAttribute) SetCode(v string) *CommodityOrderAttribute {
	s.Code = &v
	return s
}

func (s *CommodityOrderAttribute) SetValue(v string) *CommodityOrderAttribute {
	s.Value = &v
	return s
}

func (s *CommodityOrderAttribute) SetValueUnit(v string) *CommodityOrderAttribute {
	s.ValueUnit = &v
	return s
}

// 预付金额
type PrepayAmount struct {
	// 指定预付费金额
	// example:
	//
	// 100.00
	Amount *string `json:"amount,omitempty" xml:"amount,omitempty" require:"true"`
	// 币种单位，CNY\USD等标准币种单位编码
	// example:
	//
	// CNY
	Currency *string `json:"currency,omitempty" xml:"currency,omitempty" require:"true"`
}

func (s PrepayAmount) String() string {
	return tea.Prettify(s)
}

func (s PrepayAmount) GoString() string {
	return s.String()
}

func (s *PrepayAmount) SetAmount(v string) *PrepayAmount {
	s.Amount = &v
	return s
}

func (s *PrepayAmount) SetCurrency(v string) *PrepayAmount {
	s.Currency = &v
	return s
}

// 履约选项
type FulfillmentOptions struct {
	// 是否延迟履约，默认false
	// example:
	//
	// true, false
	Deplay *bool `json:"deplay,omitempty" xml:"deplay,omitempty"`
	// 实际履约开始时间，默认支付完成时间；只有deplay=true时，start_time才生效
	// example:
	//
	// 2018-10-10T10:10:00Z
	StartTime *string `json:"start_time,omitempty" xml:"start_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 跳过SPI回调，默认false，优先级高于商品上默认的接入属性
	// example:
	//
	// true,false
	SpiSkip *bool `json:"spi_skip,omitempty" xml:"spi_skip,omitempty"`
}

func (s FulfillmentOptions) String() string {
	return tea.Prettify(s)
}

func (s FulfillmentOptions) GoString() string {
	return s.String()
}

func (s *FulfillmentOptions) SetDeplay(v bool) *FulfillmentOptions {
	s.Deplay = &v
	return s
}

func (s *FulfillmentOptions) SetStartTime(v string) *FulfillmentOptions {
	s.StartTime = &v
	return s
}

func (s *FulfillmentOptions) SetSpiSkip(v bool) *FulfillmentOptions {
	s.SpiSkip = &v
	return s
}

// 套餐内商品订单结构
type ComboCommodityOrder struct {
	// 商品编码
	// example:
	//
	// KXSFFM00264687
	CommodityCode *string `json:"commodity_code,omitempty" xml:"commodity_code,omitempty" require:"true"`
	// 状态
	// example:
	//
	// COMPLETE
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 实例ID列表
	// example:
	//
	// A0BLOCKCHAINAXAXVZSE1ZXEMO6HM2S
	InstanceIds []*string `json:"instance_ids,omitempty" xml:"instance_ids,omitempty" require:"true" type:"Repeated"`
}

func (s ComboCommodityOrder) String() string {
	return tea.Prettify(s)
}

func (s ComboCommodityOrder) GoString() string {
	return s.String()
}

func (s *ComboCommodityOrder) SetCommodityCode(v string) *ComboCommodityOrder {
	s.CommodityCode = &v
	return s
}

func (s *ComboCommodityOrder) SetStatus(v string) *ComboCommodityOrder {
	s.Status = &v
	return s
}

func (s *ComboCommodityOrder) SetInstanceIds(v []*string) *ComboCommodityOrder {
	s.InstanceIds = v
	return s
}

// 套餐内商品结构
type ComboCommodity struct {
	// 商品名称
	// example:
	//
	// 测试商品
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 商品在套餐中的唯一编码，当一个套餐中存在两个一样的商品时，编码会不一样
	// example:
	//
	// ZWZJFM00167122ABCDEF
	UniqueCode *string `json:"unique_code,omitempty" xml:"unique_code,omitempty" require:"true"`
	// 商品主数据编码
	// example:
	//
	// ZWZJFM00167122
	InnerCode *string `json:"inner_code,omitempty" xml:"inner_code,omitempty" require:"true"`
	// 商品类型，资源包：attach
	// example:
	//
	// attach
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 付费方式，预付：PREPAY，按量付费：POSTPAY
	// example:
	//
	// PREPAY
	ChargeType *string `json:"charge_type,omitempty" xml:"charge_type,omitempty" require:"true"`
	// 销售属性列表
	// example:
	//
	// []
	Attrs []*CommodityAttribute `json:"attrs,omitempty" xml:"attrs,omitempty" require:"true" type:"Repeated"`
	// 商品数量
	// example:
	//
	// 1
	Quantity *int64 `json:"quantity,omitempty" xml:"quantity,omitempty" require:"true"`
	// 扩展信息，JSON结构，包含标签、个性化配置等数据
	// example:
	//
	// {"key":"name"}
	ExtendsConfig *string `json:"extends_config,omitempty" xml:"extends_config,omitempty" require:"true"`
}

func (s ComboCommodity) String() string {
	return tea.Prettify(s)
}

func (s ComboCommodity) GoString() string {
	return s.String()
}

func (s *ComboCommodity) SetName(v string) *ComboCommodity {
	s.Name = &v
	return s
}

func (s *ComboCommodity) SetUniqueCode(v string) *ComboCommodity {
	s.UniqueCode = &v
	return s
}

func (s *ComboCommodity) SetInnerCode(v string) *ComboCommodity {
	s.InnerCode = &v
	return s
}

func (s *ComboCommodity) SetType(v string) *ComboCommodity {
	s.Type = &v
	return s
}

func (s *ComboCommodity) SetChargeType(v string) *ComboCommodity {
	s.ChargeType = &v
	return s
}

func (s *ComboCommodity) SetAttrs(v []*CommodityAttribute) *ComboCommodity {
	s.Attrs = v
	return s
}

func (s *ComboCommodity) SetQuantity(v int64) *ComboCommodity {
	s.Quantity = &v
	return s
}

func (s *ComboCommodity) SetExtendsConfig(v string) *ComboCommodity {
	s.ExtendsConfig = &v
	return s
}

// 支付选项
type PayOptions struct {
	// 系统自动会根据账号类型、当前OU进行付费渠道判定；如果传入的付款渠道不满足，则报错
	// example:
	//
	// CUSTOMER_FUND
	PayChannel *string `json:"pay_channel,omitempty" xml:"pay_channel,omitempty"`
	// 支付方式，例如：直付通
	// example:
	//
	// ZFT
	PaymentMethod *string `json:"payment_method,omitempty" xml:"payment_method,omitempty"`
}

func (s PayOptions) String() string {
	return tea.Prettify(s)
}

func (s PayOptions) GoString() string {
	return s.String()
}

func (s *PayOptions) SetPayChannel(v string) *PayOptions {
	s.PayChannel = &v
	return s
}

func (s *PayOptions) SetPaymentMethod(v string) *PayOptions {
	s.PaymentMethod = &v
	return s
}

// 履约开通参数
type ProvisionOption struct {
	// 订单开始时间 (ISO 8601 UTC)，可自定义覆盖默认值
	// example:
	//
	// 2025-08-22T07:05:49.441Z
	OrderStartTime *string `json:"order_start_time,omitempty" xml:"order_start_time,omitempty"`
}

func (s ProvisionOption) String() string {
	return tea.Prettify(s)
}

func (s ProvisionOption) GoString() string {
	return s.String()
}

func (s *ProvisionOption) SetOrderStartTime(v string) *ProvisionOption {
	s.OrderStartTime = &v
	return s
}

// 资源包结构
type InstanceCapacity struct {
	// 实例ID
	// example:
	//
	// A0KMMSFM00190219BMZNESCN1ZXEMO6IGIE
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty" require:"true"`
	// 当前剩余容量
	// example:
	//
	// 1000
	CurrentCapacity *string `json:"current_capacity,omitempty" xml:"current_capacity,omitempty" require:"true"`
	// 初始容量
	// example:
	//
	// 1000
	InitialCapacity *string `json:"initial_capacity,omitempty" xml:"initial_capacity,omitempty" require:"true"`
	// 起始时间
	// example:
	//
	// 2018-10-10T10:10:00Z
	StartTime *string `json:"start_time,omitempty" xml:"start_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 截止时间
	// example:
	//
	// 2018-10-10T10:10:00Z
	EndTime *string `json:"end_time,omitempty" xml:"end_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// Valid：有效；Closed：已用完；Expired:已到期
	// example:
	//
	// 状态
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 资源包对应商品码
	// example:
	//
	// KXSFFM00264687
	CommodityCode *string `json:"commodity_code,omitempty" xml:"commodity_code,omitempty" require:"true"`
	// 关联按量商品码
	// example:
	//
	// KKAASP00000001
	RelPostpayCommodity *string `json:"rel_postpay_commodity,omitempty" xml:"rel_postpay_commodity,omitempty" require:"true"`
}

func (s InstanceCapacity) String() string {
	return tea.Prettify(s)
}

func (s InstanceCapacity) GoString() string {
	return s.String()
}

func (s *InstanceCapacity) SetInstanceId(v string) *InstanceCapacity {
	s.InstanceId = &v
	return s
}

func (s *InstanceCapacity) SetCurrentCapacity(v string) *InstanceCapacity {
	s.CurrentCapacity = &v
	return s
}

func (s *InstanceCapacity) SetInitialCapacity(v string) *InstanceCapacity {
	s.InitialCapacity = &v
	return s
}

func (s *InstanceCapacity) SetStartTime(v string) *InstanceCapacity {
	s.StartTime = &v
	return s
}

func (s *InstanceCapacity) SetEndTime(v string) *InstanceCapacity {
	s.EndTime = &v
	return s
}

func (s *InstanceCapacity) SetStatus(v string) *InstanceCapacity {
	s.Status = &v
	return s
}

func (s *InstanceCapacity) SetCommodityCode(v string) *InstanceCapacity {
	s.CommodityCode = &v
	return s
}

func (s *InstanceCapacity) SetRelPostpayCommodity(v string) *InstanceCapacity {
	s.RelPostpayCommodity = &v
	return s
}

// 商品同步common_buy内容
type CommoditySyncCommonBuyInfo struct {
	// 商品列表配置 ListJson字符串
	// example:
	//
	// {"cyCode":"KXSFFM00329522","cyCodeType":"L5","description":"","gmtCreate":1768268723555,"gmtModified":1768268723555,"h5Mage":"","id":0,"pcImage":"","relateOu":"ZL6","relateSaleCode":"KXSFFSZL600314529","relateSaleName":"企业版"}
	CommonBuySaleGroupListJson []*string `json:"common_buy_sale_group_list_json,omitempty" xml:"common_buy_sale_group_list_json,omitempty" require:"true" type:"Repeated"`
	// 规格配置 ListJson字符串
	// example:
	//
	// {"attrCode":"L0735","id":4459268,"offerCode":"DJKXFM01233589"}
	OfferAttrListJson []*string `json:"offer_attr_list_json,omitempty" xml:"offer_attr_list_json,omitempty" require:"true" type:"Repeated"`
	// Region配置 ListJson字符串
	// example:
	//
	// {"aliyunRegionCode":"","id":1,"instCode":"","regionCode":"","regionName":"","type":"","zoneRange":""}
	ProdOfferRegionListJson []*string `json:"prod_offer_region_list_json,omitempty" xml:"prod_offer_region_list_json,omitempty" require:"true" type:"Repeated"`
	// 费用项配置 ListJson字符串
	// example:
	//
	// {"attrGroupCode":"","attrGroupName":"","attrGroupType":"","feeExpress":"","feeExpressMap":{},"feeList":[{"attrGroupCode":"","attrGroupName":"","fee":"","feeAttr":"","feeId":0,"id":0,"remark":""}],"id":0,"offerCode":"","remark":""}
	OfferAttrGroupListJson []*string `json:"offer_attr_group_list_json,omitempty" xml:"offer_attr_group_list_json,omitempty" require:"true" type:"Repeated"`
	// 属性配置 ListJson字符串
	// example:
	//
	// {"attrCode":"","defaultValue":"","displayName":"","express":"","id":0,"offerCode":"","offerVersion":"","remark":"","tip":"","valueRange":""}
	OfferExtendAttrListJson []*string `json:"offer_extend_attr_list_json,omitempty" xml:"offer_extend_attr_list_json,omitempty" require:"true" type:"Repeated"`
	// 界面归类配置 ListJson字符串
	// example:
	//
	// {"displayName":"","groupCode":"","id":1,"memberList":[{"buyDisplay":"","componentCode":"","displayType":"","groupId":0,"id":0,"label":"","labelDisplay":"","required":"","sortId":0,"upgradeDisplay":""}],"offerCode":"","remark":"","seqOrder":1}
	OfferCommonBuyGroupListJson []*string `json:"offer_common_buy_group_list_json,omitempty" xml:"offer_common_buy_group_list_json,omitempty" require:"true" type:"Repeated"`
	// 规格约束配置 ListJson字符串
	// example:
	//
	// {"cond":"","condType":"","constraintName":"","id":0,"offerCode":"","offerUniqueVid":"","orderType":"","remark":"","result":""}
	OfferAttrConstraintsListFson []*string `json:"offer_attr_constraints_list_fson,omitempty" xml:"offer_attr_constraints_list_fson,omitempty" require:"true" type:"Repeated"`
	// 售卖规则配置 ListJson字符串
	// example:
	//
	// {"actionParam":"","groupIndex":0,"groupName":"","id":0,"memberList":[{"groupId":0,"id":0,"isNegative":false,"onlyLogin":"","paramStr":"","ruleCode":"","ruleIndex":0,"ruleScript":"","ruleType":""}],"remark":"","ruleEventCode":""}
	OfferRuleGroupListJson []*string `json:"offer_rule_group_list_json,omitempty" xml:"offer_rule_group_list_json,omitempty" require:"true" type:"Repeated"`
}

func (s CommoditySyncCommonBuyInfo) String() string {
	return tea.Prettify(s)
}

func (s CommoditySyncCommonBuyInfo) GoString() string {
	return s.String()
}

func (s *CommoditySyncCommonBuyInfo) SetCommonBuySaleGroupListJson(v []*string) *CommoditySyncCommonBuyInfo {
	s.CommonBuySaleGroupListJson = v
	return s
}

func (s *CommoditySyncCommonBuyInfo) SetOfferAttrListJson(v []*string) *CommoditySyncCommonBuyInfo {
	s.OfferAttrListJson = v
	return s
}

func (s *CommoditySyncCommonBuyInfo) SetProdOfferRegionListJson(v []*string) *CommoditySyncCommonBuyInfo {
	s.ProdOfferRegionListJson = v
	return s
}

func (s *CommoditySyncCommonBuyInfo) SetOfferAttrGroupListJson(v []*string) *CommoditySyncCommonBuyInfo {
	s.OfferAttrGroupListJson = v
	return s
}

func (s *CommoditySyncCommonBuyInfo) SetOfferExtendAttrListJson(v []*string) *CommoditySyncCommonBuyInfo {
	s.OfferExtendAttrListJson = v
	return s
}

func (s *CommoditySyncCommonBuyInfo) SetOfferCommonBuyGroupListJson(v []*string) *CommoditySyncCommonBuyInfo {
	s.OfferCommonBuyGroupListJson = v
	return s
}

func (s *CommoditySyncCommonBuyInfo) SetOfferAttrConstraintsListFson(v []*string) *CommoditySyncCommonBuyInfo {
	s.OfferAttrConstraintsListFson = v
	return s
}

func (s *CommoditySyncCommonBuyInfo) SetOfferRuleGroupListJson(v []*string) *CommoditySyncCommonBuyInfo {
	s.OfferRuleGroupListJson = v
	return s
}

// 商品实例
type CommodityInstance struct {
	// 订单号
	// example:
	//
	// 2088123412341234
	BizNo *string `json:"biz_no,omitempty" xml:"biz_no,omitempty"`
	// 商品编码
	// example:
	//
	// KKAASP00001001
	CommodityCode *string `json:"commodity_code,omitempty" xml:"commodity_code,omitempty" require:"true"`
	// 销售主体，不传默认ZL6
	// example:
	//
	// ZL6,ZL7,ZJ9
	Ou *string `json:"ou,omitempty" xml:"ou,omitempty"`
	// 订单类型，NEW：新购；RENEW：续费； MODIFY：变配 不填默认新购
	// example:
	//
	// NEW
	OrderType *string `json:"order_type,omitempty" xml:"order_type,omitempty"`
	// 订购时长
	Duration *OrderDuration `json:"duration,omitempty" xml:"duration,omitempty"`
	// 优惠券ID
	// example:
	//
	// 12345678
	CouponId *string `json:"coupon_id,omitempty" xml:"coupon_id,omitempty"`
	// 数量，不填默认1
	Quantity *int64 `json:"quantity,omitempty" xml:"quantity,omitempty"`
	//
	// 商品订购属性，开通型商品部需要填写
	// example:
	//
	// []
	CommodityAttrs []*CommodityOrderAttribute `json:"commodity_attrs,omitempty" xml:"commodity_attrs,omitempty" type:"Repeated"`
	// 履约选项
	FulfillmentOptions *FulfillmentOptions `json:"fulfillment_options,omitempty" xml:"fulfillment_options,omitempty"`
	// 实例ID，续费/变配场景必传
	// example:
	//
	// A0BQBHFM00034877FVDJWUXR1ZXEMOD1U4G
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty"`
	// 预付费订单金额。仅白名单商品且batchBizNo是合法的合同ID的情况，才允许指定预付订单金额
	PrepayAmount *PrepayAmount `json:"prepay_amount,omitempty" xml:"prepay_amount,omitempty"`
	// 后付商品签约价，用于在履约阶段生成一客一价
	PostPayPrice *PostPayPrice `json:"post_pay_price,omitempty" xml:"post_pay_price,omitempty"`
}

func (s CommodityInstance) String() string {
	return tea.Prettify(s)
}

func (s CommodityInstance) GoString() string {
	return s.String()
}

func (s *CommodityInstance) SetBizNo(v string) *CommodityInstance {
	s.BizNo = &v
	return s
}

func (s *CommodityInstance) SetCommodityCode(v string) *CommodityInstance {
	s.CommodityCode = &v
	return s
}

func (s *CommodityInstance) SetOu(v string) *CommodityInstance {
	s.Ou = &v
	return s
}

func (s *CommodityInstance) SetOrderType(v string) *CommodityInstance {
	s.OrderType = &v
	return s
}

func (s *CommodityInstance) SetDuration(v *OrderDuration) *CommodityInstance {
	s.Duration = v
	return s
}

func (s *CommodityInstance) SetCouponId(v string) *CommodityInstance {
	s.CouponId = &v
	return s
}

func (s *CommodityInstance) SetQuantity(v int64) *CommodityInstance {
	s.Quantity = &v
	return s
}

func (s *CommodityInstance) SetCommodityAttrs(v []*CommodityOrderAttribute) *CommodityInstance {
	s.CommodityAttrs = v
	return s
}

func (s *CommodityInstance) SetFulfillmentOptions(v *FulfillmentOptions) *CommodityInstance {
	s.FulfillmentOptions = v
	return s
}

func (s *CommodityInstance) SetInstanceId(v string) *CommodityInstance {
	s.InstanceId = &v
	return s
}

func (s *CommodityInstance) SetPrepayAmount(v *PrepayAmount) *CommodityInstance {
	s.PrepayAmount = v
	return s
}

func (s *CommodityInstance) SetPostPayPrice(v *PostPayPrice) *CommodityInstance {
	s.PostPayPrice = v
	return s
}

// 套餐内商品信息列表（仅包含当前 OU 下上架的商品）
type ComboItemDTO struct {
	// 主键ID
	// example:
	//
	// 123
	Id *int64 `json:"id,omitempty" xml:"id,omitempty"`
	// 唯一编码
	// example:
	//
	// 123xxx
	UniqueCode *string `json:"unique_code,omitempty" xml:"unique_code,omitempty"`
	// 商品名称
	// example:
	//
	// xxx商品
	OfferName *string `json:"offer_name,omitempty" xml:"offer_name,omitempty"`
	// 商品主数据CODE
	// example:
	//
	// sf12321xxx
	OfferInnerCode *string `json:"offer_inner_code,omitempty" xml:"offer_inner_code,omitempty"`
	// 商品销售CODE（仅当指定 ou 且商品在该 OU 下上架时有值）
	// example:
	//
	// sf123xxxx
	OfferSaleCode *string `json:"offer_sale_code,omitempty" xml:"offer_sale_code,omitempty"`
	// 商品规格，JSON 结构
	// example:
	//
	// {}
	OfferAttr *string `json:"offer_attr,omitempty" xml:"offer_attr,omitempty"`
	// 商品规格描述
	// example:
	//
	// xxx描述
	OfferAttrDesc *string `json:"offer_attr_desc,omitempty" xml:"offer_attr_desc,omitempty"`
	// 付费方式（如 AFTER_PAY_BY_HOUR 后付费量价、PREPAY_BY_MONTH 预付费包年包月）
	// example:
	//
	// AFTER_PAY_BY_HOUR
	ChargeType *string `json:"charge_type,omitempty" xml:"charge_type,omitempty"`
	// 商品数量
	// example:
	//
	// 1
	Quantity *int64 `json:"quantity,omitempty" xml:"quantity,omitempty"`
	// 订购周期类型
	// example:
	//
	// Y
	DurationType *string `json:"duration_type,omitempty" xml:"duration_type,omitempty"`
	// 订购周期值
	// example:
	//
	// 1
	DurationValue *int64 `json:"duration_value,omitempty" xml:"duration_value,omitempty"`
	// 是否必选（true 必选，false 可选）
	// example:
	//
	// true
	Required *bool `json:"required,omitempty" xml:"required,omitempty"`
	// 商品在套餐中的排序
	// example:
	//
	// 1
	SeqOrder *int64 `json:"seq_order,omitempty" xml:"seq_order,omitempty"`
	// 扩展配置
	// example:
	//
	// {}
	ExtendsConfig *string `json:"extends_config,omitempty" xml:"extends_config,omitempty"`
	// 商品规格 JSON 结构，CommodityInfo 的 JSON 序列化字符串
	// example:
	//
	// {}
	OfferAttrOption *string `json:"offer_attr_option,omitempty" xml:"offer_attr_option,omitempty"`
}

func (s ComboItemDTO) String() string {
	return tea.Prettify(s)
}

func (s ComboItemDTO) GoString() string {
	return s.String()
}

func (s *ComboItemDTO) SetId(v int64) *ComboItemDTO {
	s.Id = &v
	return s
}

func (s *ComboItemDTO) SetUniqueCode(v string) *ComboItemDTO {
	s.UniqueCode = &v
	return s
}

func (s *ComboItemDTO) SetOfferName(v string) *ComboItemDTO {
	s.OfferName = &v
	return s
}

func (s *ComboItemDTO) SetOfferInnerCode(v string) *ComboItemDTO {
	s.OfferInnerCode = &v
	return s
}

func (s *ComboItemDTO) SetOfferSaleCode(v string) *ComboItemDTO {
	s.OfferSaleCode = &v
	return s
}

func (s *ComboItemDTO) SetOfferAttr(v string) *ComboItemDTO {
	s.OfferAttr = &v
	return s
}

func (s *ComboItemDTO) SetOfferAttrDesc(v string) *ComboItemDTO {
	s.OfferAttrDesc = &v
	return s
}

func (s *ComboItemDTO) SetChargeType(v string) *ComboItemDTO {
	s.ChargeType = &v
	return s
}

func (s *ComboItemDTO) SetQuantity(v int64) *ComboItemDTO {
	s.Quantity = &v
	return s
}

func (s *ComboItemDTO) SetDurationType(v string) *ComboItemDTO {
	s.DurationType = &v
	return s
}

func (s *ComboItemDTO) SetDurationValue(v int64) *ComboItemDTO {
	s.DurationValue = &v
	return s
}

func (s *ComboItemDTO) SetRequired(v bool) *ComboItemDTO {
	s.Required = &v
	return s
}

func (s *ComboItemDTO) SetSeqOrder(v int64) *ComboItemDTO {
	s.SeqOrder = &v
	return s
}

func (s *ComboItemDTO) SetExtendsConfig(v string) *ComboItemDTO {
	s.ExtendsConfig = &v
	return s
}

func (s *ComboItemDTO) SetOfferAttrOption(v string) *ComboItemDTO {
	s.OfferAttrOption = &v
	return s
}

// 套餐订单结构
type ComboOrder struct {
	// 租户ID
	// example:
	//
	// 2088xxx
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 业务流水号
	// example:
	//
	// 2088123412341234
	BizNo *string `json:"biz_no,omitempty" xml:"biz_no,omitempty" require:"true"`
	// 套餐订单号
	// example:
	//
	// 2088123412341234
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
	// 套餐编码
	// example:
	//
	// KKAASP00001001
	ComboCode *string `json:"combo_code,omitempty" xml:"combo_code,omitempty" require:"true"`
	// 套餐名称，下单时的套餐名称
	// example:
	//
	// 测试套餐
	ComboName *string `json:"combo_name,omitempty" xml:"combo_name,omitempty" require:"true"`
	// 订单状态，CREATED：创建；CANCEL：取消；PAYING：支付中；PAID：支付完成
	// example:
	//
	// CREATED
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 履约生产状态，INCOMPLETE:未完成、COMPLETED:完成
	// example:
	//
	// COMPLETED
	ProvisionStatus *string `json:"provision_status,omitempty" xml:"provision_status,omitempty" require:"true"`
	// 订单原始金额
	// example:
	//
	// 200.00
	OriginalAmount *string `json:"original_amount,omitempty" xml:"original_amount,omitempty" require:"true"`
	// 折扣金额
	// example:
	//
	// 100.00
	DiscountAmount *string `json:"discount_amount,omitempty" xml:"discount_amount,omitempty" require:"true"`
	// 优惠金额
	// example:
	//
	// 100.00
	CouponAmount *string `json:"coupon_amount,omitempty" xml:"coupon_amount,omitempty" require:"true"`
	// 实付金额
	// example:
	//
	// 0.00
	PayAmount *string `json:"pay_amount,omitempty" xml:"pay_amount,omitempty" require:"true"`
	// 下单时间
	// example:
	//
	// 2018-10-10T10:10:00Z
	GmtCreate *string `json:"gmt_create,omitempty" xml:"gmt_create,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 套餐内商品订单列表
	// example:
	//
	// []
	CommodityOrders []*ComboCommodityOrder `json:"commodity_orders,omitempty" xml:"commodity_orders,omitempty" require:"true" type:"Repeated"`
	// 支付完成时间
	// example:
	//
	// 2018-10-10T10:10:00Z
	PayTime *string `json:"pay_time,omitempty" xml:"pay_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 支付渠道
	// example:
	//
	// CUSTOMER_FUND
	PayChannel *string `json:"pay_channel,omitempty" xml:"pay_channel,omitempty" require:"true"`
}

func (s ComboOrder) String() string {
	return tea.Prettify(s)
}

func (s ComboOrder) GoString() string {
	return s.String()
}

func (s *ComboOrder) SetTenantId(v string) *ComboOrder {
	s.TenantId = &v
	return s
}

func (s *ComboOrder) SetBizNo(v string) *ComboOrder {
	s.BizNo = &v
	return s
}

func (s *ComboOrder) SetOrderId(v string) *ComboOrder {
	s.OrderId = &v
	return s
}

func (s *ComboOrder) SetComboCode(v string) *ComboOrder {
	s.ComboCode = &v
	return s
}

func (s *ComboOrder) SetComboName(v string) *ComboOrder {
	s.ComboName = &v
	return s
}

func (s *ComboOrder) SetStatus(v string) *ComboOrder {
	s.Status = &v
	return s
}

func (s *ComboOrder) SetProvisionStatus(v string) *ComboOrder {
	s.ProvisionStatus = &v
	return s
}

func (s *ComboOrder) SetOriginalAmount(v string) *ComboOrder {
	s.OriginalAmount = &v
	return s
}

func (s *ComboOrder) SetDiscountAmount(v string) *ComboOrder {
	s.DiscountAmount = &v
	return s
}

func (s *ComboOrder) SetCouponAmount(v string) *ComboOrder {
	s.CouponAmount = &v
	return s
}

func (s *ComboOrder) SetPayAmount(v string) *ComboOrder {
	s.PayAmount = &v
	return s
}

func (s *ComboOrder) SetGmtCreate(v string) *ComboOrder {
	s.GmtCreate = &v
	return s
}

func (s *ComboOrder) SetCommodityOrders(v []*ComboCommodityOrder) *ComboOrder {
	s.CommodityOrders = v
	return s
}

func (s *ComboOrder) SetPayTime(v string) *ComboOrder {
	s.PayTime = &v
	return s
}

func (s *ComboOrder) SetPayChannel(v string) *ComboOrder {
	s.PayChannel = &v
	return s
}

// 商品定价结构
type CommodityPricing struct {
}

func (s CommodityPricing) String() string {
	return tea.Prettify(s)
}

func (s CommodityPricing) GoString() string {
	return s.String()
}

// 标签对象
type InstanceLabel struct {
	// 标签名。
	// 传递isvId
	// example:
	//
	// isvId
	InstanceKey *string `json:"instance_key,omitempty" xml:"instance_key,omitempty" require:"true"`
	// 标签值
	// example:
	//
	// 邀请码
	InstanceValue *string `json:"instance_value,omitempty" xml:"instance_value,omitempty" require:"true"`
}

func (s InstanceLabel) String() string {
	return tea.Prettify(s)
}

func (s InstanceLabel) GoString() string {
	return s.String()
}

func (s *InstanceLabel) SetInstanceKey(v string) *InstanceLabel {
	s.InstanceKey = &v
	return s
}

func (s *InstanceLabel) SetInstanceValue(v string) *InstanceLabel {
	s.InstanceValue = &v
	return s
}

// 价格策略
type PriceStrategy struct {
	// 继承租户在商品下的价格，仅后付费商品生效
	// example:
	//
	// 2088123412341234
	FollowTenantId *string `json:"follow_tenant_id,omitempty" xml:"follow_tenant_id,omitempty"`
}

func (s PriceStrategy) String() string {
	return tea.Prettify(s)
}

func (s PriceStrategy) GoString() string {
	return s.String()
}

func (s *PriceStrategy) SetFollowTenantId(v string) *PriceStrategy {
	s.FollowTenantId = &v
	return s
}

// 商品同步common_buy内容
type OfferSyncCommonBuyInfo struct {
	// 商品列表配置 ListJson字符串
	// example:
	//
	// {"cyCode":"KXSFFM00329522","cyCodeType":"L5","description":"","gmtCreate":1768268723555,"gmtModified":1768268723555,"h5Mage":"","id":0,"pcImage":"","relateOu":"ZL6","relateSaleCode":"KXSFFSZL600314529","relateSaleName":"企业版"}
	CommonBuySaleGroupListJson []*string `json:"common_buy_sale_group_list_json,omitempty" xml:"common_buy_sale_group_list_json,omitempty" require:"true" type:"Repeated"`
	// 规格配置 ListJson字符串
	// example:
	//
	// {"attrCode":"L0735","id":4459268,"offerCode":"DJKXFM01233589"}
	OfferAttrListJson []*string `json:"offer_attr_list_json,omitempty" xml:"offer_attr_list_json,omitempty" require:"true" type:"Repeated"`
	// Region配置 ListJson字符串
	// example:
	//
	// {"aliyunRegionCode":"","id":1,"instCode":"","regionCode":"","regionName":"","type":"","zoneRange":""}
	ProdOfferRegionListJson []*string `json:"prod_offer_region_list_json,omitempty" xml:"prod_offer_region_list_json,omitempty" require:"true" type:"Repeated"`
	// 费用项配置 ListJson字符串
	// example:
	//
	// {"attrGroupCode":"","attrGroupName":"","attrGroupType":"","feeExpress":"","feeExpressMap":{},"feeList":[{"attrGroupCode":"","attrGroupName":"","fee":"","feeAttr":"","feeId":0,"id":0,"remark":""}],"id":0,"offerCode":"","remark":""}
	OfferAttrGroupListJson []*string `json:"offer_attr_group_list_json,omitempty" xml:"offer_attr_group_list_json,omitempty" require:"true" type:"Repeated"`
	// 属性配置 ListJson字符串
	// example:
	//
	// {"attrCode":"","defaultValue":"","displayName":"","express":"","id":0,"offerCode":"","offerVersion":"","remark":"","tip":"","valueRange":""}
	OfferExtendAttrListJson []*string `json:"offer_extend_attr_list_json,omitempty" xml:"offer_extend_attr_list_json,omitempty" require:"true" type:"Repeated"`
	// 界面归类配置 ListJson字符串
	// example:
	//
	// {"displayName":"","groupCode":"","id":1,"memberList":[{"buyDisplay":"","componentCode":"","displayType":"","groupId":0,"id":0,"label":"","labelDisplay":"","required":"","sortId":0,"upgradeDisplay":""}],"offerCode":"","remark":"","seqOrder":1}
	OfferCommonBuyGroupListJson []*string `json:"offer_common_buy_group_list_json,omitempty" xml:"offer_common_buy_group_list_json,omitempty" require:"true" type:"Repeated"`
	// 规格约束配置 ListJson字符串
	// example:
	//
	// {"cond":"","condType":"","constraintName":"","id":0,"offerCode":"","offerUniqueVid":"","orderType":"","remark":"","result":""}
	OfferAttrConstraintsListJson []*string `json:"offer_attr_constraints_list_json,omitempty" xml:"offer_attr_constraints_list_json,omitempty" require:"true" type:"Repeated"`
	// 售卖规则配置 ListJson字符串
	// example:
	//
	// {"actionParam":"","groupIndex":0,"groupName":"","id":0,"memberList":[{"groupId":0,"id":0,"isNegative":false,"onlyLogin":"","paramStr":"","ruleCode":"","ruleIndex":0,"ruleScript":"","ruleType":""}],"remark":"","ruleEventCode":""}
	OfferRuleGroupListJson []*string `json:"offer_rule_group_list_json,omitempty" xml:"offer_rule_group_list_json,omitempty" require:"true" type:"Repeated"`
}

func (s OfferSyncCommonBuyInfo) String() string {
	return tea.Prettify(s)
}

func (s OfferSyncCommonBuyInfo) GoString() string {
	return s.String()
}

func (s *OfferSyncCommonBuyInfo) SetCommonBuySaleGroupListJson(v []*string) *OfferSyncCommonBuyInfo {
	s.CommonBuySaleGroupListJson = v
	return s
}

func (s *OfferSyncCommonBuyInfo) SetOfferAttrListJson(v []*string) *OfferSyncCommonBuyInfo {
	s.OfferAttrListJson = v
	return s
}

func (s *OfferSyncCommonBuyInfo) SetProdOfferRegionListJson(v []*string) *OfferSyncCommonBuyInfo {
	s.ProdOfferRegionListJson = v
	return s
}

func (s *OfferSyncCommonBuyInfo) SetOfferAttrGroupListJson(v []*string) *OfferSyncCommonBuyInfo {
	s.OfferAttrGroupListJson = v
	return s
}

func (s *OfferSyncCommonBuyInfo) SetOfferExtendAttrListJson(v []*string) *OfferSyncCommonBuyInfo {
	s.OfferExtendAttrListJson = v
	return s
}

func (s *OfferSyncCommonBuyInfo) SetOfferCommonBuyGroupListJson(v []*string) *OfferSyncCommonBuyInfo {
	s.OfferCommonBuyGroupListJson = v
	return s
}

func (s *OfferSyncCommonBuyInfo) SetOfferAttrConstraintsListJson(v []*string) *OfferSyncCommonBuyInfo {
	s.OfferAttrConstraintsListJson = v
	return s
}

func (s *OfferSyncCommonBuyInfo) SetOfferRuleGroupListJson(v []*string) *OfferSyncCommonBuyInfo {
	s.OfferRuleGroupListJson = v
	return s
}

// 创建订单返回结果
type CreateTradeOrderResult struct {
	// 订单号
	// example:
	//
	// 2088123412341234
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
	// 下单时的订单号
	// example:
	//
	// 2088123412341234
	BizNo *string `json:"biz_no,omitempty" xml:"biz_no,omitempty" require:"true"`
	// 实例ID列表
	InstanceIds []*string `json:"instance_ids,omitempty" xml:"instance_ids,omitempty" type:"Repeated"`
	// 订单状态
	// example:
	//
	// PAY_SUCCESS
	PayStatus *string `json:"pay_status,omitempty" xml:"pay_status,omitempty" require:"true"`
	// 订购错误码
	// example:
	//
	// 订购错误码
	OrderErrorCode *string `json:"order_error_code,omitempty" xml:"order_error_code,omitempty"`
	// 订购错误描述
	// example:
	//
	// 订购错误描述
	OrderErrorDescription *string `json:"order_error_description,omitempty" xml:"order_error_description,omitempty"`
}

func (s CreateTradeOrderResult) String() string {
	return tea.Prettify(s)
}

func (s CreateTradeOrderResult) GoString() string {
	return s.String()
}

func (s *CreateTradeOrderResult) SetOrderId(v string) *CreateTradeOrderResult {
	s.OrderId = &v
	return s
}

func (s *CreateTradeOrderResult) SetBizNo(v string) *CreateTradeOrderResult {
	s.BizNo = &v
	return s
}

func (s *CreateTradeOrderResult) SetInstanceIds(v []*string) *CreateTradeOrderResult {
	s.InstanceIds = v
	return s
}

func (s *CreateTradeOrderResult) SetPayStatus(v string) *CreateTradeOrderResult {
	s.PayStatus = &v
	return s
}

func (s *CreateTradeOrderResult) SetOrderErrorCode(v string) *CreateTradeOrderResult {
	s.OrderErrorCode = &v
	return s
}

func (s *CreateTradeOrderResult) SetOrderErrorDescription(v string) *CreateTradeOrderResult {
	s.OrderErrorDescription = &v
	return s
}

// 商品询价结构
type CommodityEnquiryPrice struct {
	// 商品主数据编码
	// example:
	//
	// KXSFFM00264687
	CommodityCode *string `json:"commodity_code,omitempty" xml:"commodity_code,omitempty" require:"true"`
	// 商品名称
	// example:
	//
	// 测试商品
	CommodityName *string `json:"commodity_name,omitempty" xml:"commodity_name,omitempty" require:"true"`
	// 预付-支付金额
	// example:
	//
	// 100.00
	PayAmount *string `json:"pay_amount,omitempty" xml:"pay_amount,omitempty" require:"true"`
	// 预付费-原始金额
	// example:
	//
	// 200.00
	OriginalAmount *string `json:"original_amount,omitempty" xml:"original_amount,omitempty" require:"true"`
	// 预付费-折扣金额
	// example:
	//
	// 100.00
	DiscountAmount *string `json:"discount_amount,omitempty" xml:"discount_amount,omitempty" require:"true"`
	// 预付费-优惠券抵扣金额
	// example:
	//
	// 0.00
	CouponAmount *string `json:"coupon_amount,omitempty" xml:"coupon_amount,omitempty" require:"true"`
	// 原订购剩余价值，用于变配场景
	// example:
	//
	// 50.00
	SubscriptionUnusedAmount *string `json:"subscription_unused_amount,omitempty" xml:"subscription_unused_amount,omitempty" require:"true"`
	// 命中的活动编码
	// example:
	//
	// a05d8efc-b1c8-42a0-9666-98f419d4e2eb
	ActivityCode *string `json:"activity_code,omitempty" xml:"activity_code,omitempty" require:"true"`
	// 命中的活动名称
	// example:
	//
	// 测试折扣活动
	ActivityName *string `json:"activity_name,omitempty" xml:"activity_name,omitempty" require:"true"`
	// 命中的定价计划ID
	// example:
	//
	// 1000
	PricePlanId *int64 `json:"price_plan_id,omitempty" xml:"price_plan_id,omitempty" require:"true"`
	// 命中的定价约束ID
	// example:
	//
	// 2000
	PriceConstraintId *int64 `json:"price_constraint_id,omitempty" xml:"price_constraint_id,omitempty" require:"true"`
	// 币种，元：CNY
	// example:
	//
	// CNY
	Currency *string `json:"currency,omitempty" xml:"currency,omitempty" require:"true"`
	// 基于剩余价值变配场景下，预测的支付金额正常的最小订购周期
	MinDurationOfValidPayAmount *OrderDuration `json:"min_duration_of_valid_pay_amount,omitempty" xml:"min_duration_of_valid_pay_amount,omitempty"`
	// 预付费-折扣率
	// example:
	//
	// 0.75
	DiscountRate *string `json:"discount_rate,omitempty" xml:"discount_rate,omitempty" require:"true"`
	// 原始BD权限价金额，白名单商品会返回此价格
	// example:
	//
	// 160.00
	OriginalBdAmount *string `json:"original_bd_amount,omitempty" xml:"original_bd_amount,omitempty"`
	// 原始成本价金额，白名单商品会返回此价格
	// example:
	//
	// 100.00
	OriginalCostAmount *string `json:"original_cost_amount,omitempty" xml:"original_cost_amount,omitempty"`
}

func (s CommodityEnquiryPrice) String() string {
	return tea.Prettify(s)
}

func (s CommodityEnquiryPrice) GoString() string {
	return s.String()
}

func (s *CommodityEnquiryPrice) SetCommodityCode(v string) *CommodityEnquiryPrice {
	s.CommodityCode = &v
	return s
}

func (s *CommodityEnquiryPrice) SetCommodityName(v string) *CommodityEnquiryPrice {
	s.CommodityName = &v
	return s
}

func (s *CommodityEnquiryPrice) SetPayAmount(v string) *CommodityEnquiryPrice {
	s.PayAmount = &v
	return s
}

func (s *CommodityEnquiryPrice) SetOriginalAmount(v string) *CommodityEnquiryPrice {
	s.OriginalAmount = &v
	return s
}

func (s *CommodityEnquiryPrice) SetDiscountAmount(v string) *CommodityEnquiryPrice {
	s.DiscountAmount = &v
	return s
}

func (s *CommodityEnquiryPrice) SetCouponAmount(v string) *CommodityEnquiryPrice {
	s.CouponAmount = &v
	return s
}

func (s *CommodityEnquiryPrice) SetSubscriptionUnusedAmount(v string) *CommodityEnquiryPrice {
	s.SubscriptionUnusedAmount = &v
	return s
}

func (s *CommodityEnquiryPrice) SetActivityCode(v string) *CommodityEnquiryPrice {
	s.ActivityCode = &v
	return s
}

func (s *CommodityEnquiryPrice) SetActivityName(v string) *CommodityEnquiryPrice {
	s.ActivityName = &v
	return s
}

func (s *CommodityEnquiryPrice) SetPricePlanId(v int64) *CommodityEnquiryPrice {
	s.PricePlanId = &v
	return s
}

func (s *CommodityEnquiryPrice) SetPriceConstraintId(v int64) *CommodityEnquiryPrice {
	s.PriceConstraintId = &v
	return s
}

func (s *CommodityEnquiryPrice) SetCurrency(v string) *CommodityEnquiryPrice {
	s.Currency = &v
	return s
}

func (s *CommodityEnquiryPrice) SetMinDurationOfValidPayAmount(v *OrderDuration) *CommodityEnquiryPrice {
	s.MinDurationOfValidPayAmount = v
	return s
}

func (s *CommodityEnquiryPrice) SetDiscountRate(v string) *CommodityEnquiryPrice {
	s.DiscountRate = &v
	return s
}

func (s *CommodityEnquiryPrice) SetOriginalBdAmount(v string) *CommodityEnquiryPrice {
	s.OriginalBdAmount = &v
	return s
}

func (s *CommodityEnquiryPrice) SetOriginalCostAmount(v string) *CommodityEnquiryPrice {
	s.OriginalCostAmount = &v
	return s
}

// 套餐基本信息
type ComboDTO struct {
	// 主键id
	// example:
	//
	// 123
	Id *int64 `json:"id,omitempty" xml:"id,omitempty"`
	// 套餐名称
	// example:
	//
	// 套餐名称xxx
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 套餐描述
	// example:
	//
	// 套餐描述
	Description *string `json:"description,omitempty" xml:"description,omitempty"`
	// 套餐状态 DRAFT("DRAFT", "草稿"), ONLINE("ONLINE", "已上架"),OFFLINE("OFFLINE", "已下架");
	// example:
	//
	// DRAFT
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 套餐编码
	// example:
	//
	// C00250884
	Code *string `json:"code,omitempty" xml:"code,omitempty"`
	// 套餐唯一版本号，模板变更时更新
	// example:
	//
	// CV00252581
	Vid *string `json:"vid,omitempty" xml:"vid,omitempty"`
	// 父版本号
	// example:
	//
	// 1232456
	ParentVid *string `json:"parent_vid,omitempty" xml:"parent_vid,omitempty"`
	// 扩展配置
	// example:
	//
	// {}
	ExtendsConfig *string `json:"extends_config,omitempty" xml:"extends_config,omitempty"`
	// 创建人
	// example:
	//
	// 012111
	Creator *string `json:"creator,omitempty" xml:"creator,omitempty"`
	// 修改人
	// example:
	//
	// 0121111
	Modify *string `json:"modify,omitempty" xml:"modify,omitempty"`
	// 审批流程ID
	// example:
	//
	// 123212312
	AuditProcessId *string `json:"audit_process_id,omitempty" xml:"audit_process_id,omitempty"`
	// 审批状态
	// example:
	//
	// PASS
	AuditStatus *string `json:"audit_status,omitempty" xml:"audit_status,omitempty"`
	// 合同ID
	// example:
	//
	// 20883519xxxxxxxx
	QuotationId *string `json:"quotation_id,omitempty" xml:"quotation_id,omitempty"`
	// 项目ID
	// example:
	//
	// 102876
	ProjectId *string `json:"project_id,omitempty" xml:"project_id,omitempty"`
	// 其他扩展信息
	// example:
	//
	// {}
	ExtendsInfo *string `json:"extends_info,omitempty" xml:"extends_info,omitempty"`
}

func (s ComboDTO) String() string {
	return tea.Prettify(s)
}

func (s ComboDTO) GoString() string {
	return s.String()
}

func (s *ComboDTO) SetId(v int64) *ComboDTO {
	s.Id = &v
	return s
}

func (s *ComboDTO) SetName(v string) *ComboDTO {
	s.Name = &v
	return s
}

func (s *ComboDTO) SetDescription(v string) *ComboDTO {
	s.Description = &v
	return s
}

func (s *ComboDTO) SetStatus(v string) *ComboDTO {
	s.Status = &v
	return s
}

func (s *ComboDTO) SetCode(v string) *ComboDTO {
	s.Code = &v
	return s
}

func (s *ComboDTO) SetVid(v string) *ComboDTO {
	s.Vid = &v
	return s
}

func (s *ComboDTO) SetParentVid(v string) *ComboDTO {
	s.ParentVid = &v
	return s
}

func (s *ComboDTO) SetExtendsConfig(v string) *ComboDTO {
	s.ExtendsConfig = &v
	return s
}

func (s *ComboDTO) SetCreator(v string) *ComboDTO {
	s.Creator = &v
	return s
}

func (s *ComboDTO) SetModify(v string) *ComboDTO {
	s.Modify = &v
	return s
}

func (s *ComboDTO) SetAuditProcessId(v string) *ComboDTO {
	s.AuditProcessId = &v
	return s
}

func (s *ComboDTO) SetAuditStatus(v string) *ComboDTO {
	s.AuditStatus = &v
	return s
}

func (s *ComboDTO) SetQuotationId(v string) *ComboDTO {
	s.QuotationId = &v
	return s
}

func (s *ComboDTO) SetProjectId(v string) *ComboDTO {
	s.ProjectId = &v
	return s
}

func (s *ComboDTO) SetExtendsInfo(v string) *ComboDTO {
	s.ExtendsInfo = &v
	return s
}

// 套餐结构
type Combo struct {
	// 套餐名称
	// example:
	//
	// 测试套餐
	Code *string `json:"code,omitempty" xml:"code,omitempty" require:"true"`
	// 套餐编码
	// example:
	//
	// KKAASP00001001
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 套餐版本号
	// example:
	//
	// SPV202105192651
	Vid *string `json:"vid,omitempty" xml:"vid,omitempty" require:"true"`
	// 套餐描述
	// example:
	//
	// 这是一个套餐
	Description *string `json:"description,omitempty" xml:"description,omitempty" require:"true"`
	// 扩展信息，JSON结构，包含标签、个性化配置等数据
	// example:
	//
	// {"key":"name"}
	ExtendsConfig *string `json:"extends_config,omitempty" xml:"extends_config,omitempty" require:"true"`
	// 状态
	// example:
	//
	// ONLINE
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 套餐内商品列表
	// example:
	//
	// []
	Commodities []*ComboCommodity `json:"commodities,omitempty" xml:"commodities,omitempty" require:"true" type:"Repeated"`
}

func (s Combo) String() string {
	return tea.Prettify(s)
}

func (s Combo) GoString() string {
	return s.String()
}

func (s *Combo) SetCode(v string) *Combo {
	s.Code = &v
	return s
}

func (s *Combo) SetName(v string) *Combo {
	s.Name = &v
	return s
}

func (s *Combo) SetVid(v string) *Combo {
	s.Vid = &v
	return s
}

func (s *Combo) SetDescription(v string) *Combo {
	s.Description = &v
	return s
}

func (s *Combo) SetExtendsConfig(v string) *Combo {
	s.ExtendsConfig = &v
	return s
}

func (s *Combo) SetStatus(v string) *Combo {
	s.Status = &v
	return s
}

func (s *Combo) SetCommodities(v []*ComboCommodity) *Combo {
	s.Commodities = v
	return s
}

// 用户选择的规格配置列表
type SelectedConfigItem struct {
	// 商品主数据内码（L5内码）
	// example:
	//
	// BSTAFM01234567
	OfferInnerCode *string `json:"offer_inner_code,omitempty" xml:"offer_inner_code,omitempty" require:"true"`
	// 商品销售码（带 OU 属性）
	// example:
	//
	// BSTAFSZL70139xxxx
	OfferSaleCode *string `json:"offer_sale_code,omitempty" xml:"offer_sale_code,omitempty" require:"true"`
	// 购买时长；预付费根据实际时长填写，后付费填 1
	// example:
	//
	// 1
	Duration *int64 `json:"duration,omitempty" xml:"duration,omitempty" require:"true"`
	// 购买时长单位； month / year
	// example:
	//
	// month
	PricingCycle *string `json:"pricing_cycle,omitempty" xml:"pricing_cycle,omitempty" require:"true"`
	// 购买实例的数量
	// example:
	//
	// 1
	Quantity *int64 `json:"quantity,omitempty" xml:"quantity,omitempty" require:"true"`
	// 该子商品使用的优惠券ID
	// example:
	//
	// 123456
	CouponId *string `json:"coupon_id,omitempty" xml:"coupon_id,omitempty"`
	// 要购买的产品规格配件值,JSON格式
	// example:
	//
	// {}
	ComponentsMap *string `json:"components_map,omitempty" xml:"components_map,omitempty"`
}

func (s SelectedConfigItem) String() string {
	return tea.Prettify(s)
}

func (s SelectedConfigItem) GoString() string {
	return s.String()
}

func (s *SelectedConfigItem) SetOfferInnerCode(v string) *SelectedConfigItem {
	s.OfferInnerCode = &v
	return s
}

func (s *SelectedConfigItem) SetOfferSaleCode(v string) *SelectedConfigItem {
	s.OfferSaleCode = &v
	return s
}

func (s *SelectedConfigItem) SetDuration(v int64) *SelectedConfigItem {
	s.Duration = &v
	return s
}

func (s *SelectedConfigItem) SetPricingCycle(v string) *SelectedConfigItem {
	s.PricingCycle = &v
	return s
}

func (s *SelectedConfigItem) SetQuantity(v int64) *SelectedConfigItem {
	s.Quantity = &v
	return s
}

func (s *SelectedConfigItem) SetCouponId(v string) *SelectedConfigItem {
	s.CouponId = &v
	return s
}

func (s *SelectedConfigItem) SetComponentsMap(v string) *SelectedConfigItem {
	s.ComponentsMap = &v
	return s
}

// 实例
type Instance struct {
	// 租户id
	// example:
	//
	// 2088*****
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 实例id
	// example:
	//
	// 实例id
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty" require:"true"`
	// 商品code
	// example:
	//
	// ECS
	ProductName *string `json:"product_name,omitempty" xml:"product_name,omitempty" require:"true"`
	// 付费类型 PREPAY_BY_MONTH 预付 AFTER_PAY_BY_HOUR 后付 MIX_PAY 混合付
	// example:
	//
	// PREPAY_BY_MONTH
	ChargeType *string `json:"charge_type,omitempty" xml:"charge_type,omitempty" require:"true"`
	// 状态 CREATING 创建中 FAILED 创建失败  STARTED 运行中 STOPPED 已停服  RELEASED 已释放
	// example:
	//
	// STARTED
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
}

func (s Instance) String() string {
	return tea.Prettify(s)
}

func (s Instance) GoString() string {
	return s.String()
}

func (s *Instance) SetTenantId(v string) *Instance {
	s.TenantId = &v
	return s
}

func (s *Instance) SetInstanceId(v string) *Instance {
	s.InstanceId = &v
	return s
}

func (s *Instance) SetProductName(v string) *Instance {
	s.ProductName = &v
	return s
}

func (s *Instance) SetChargeType(v string) *Instance {
	s.ChargeType = &v
	return s
}

func (s *Instance) SetStatus(v string) *Instance {
	s.Status = &v
	return s
}

// 下单返回接口
type CreateOrderResult struct {
	// 下单时指定的业务流水号。二级订单号
	// example:
	//
	// 2088****
	BsnNo *string `json:"bsn_no,omitempty" xml:"bsn_no,omitempty" require:"true"`
	// 一级订单号
	// example:
	//
	// 2088*****
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
	// 二级订单号
	// example:
	//
	// 2088*****
	NormalOrderLineId *string `json:"normal_order_line_id,omitempty" xml:"normal_order_line_id,omitempty" require:"true"`
	// 订单状态
	// example:
	//
	// ORDER_INIT
	OrderStatus *string `json:"order_status,omitempty" xml:"order_status,omitempty" require:"true"`
	// 实例列表
	// example:
	//
	// A0****
	InstanceIds *string `json:"instance_ids,omitempty" xml:"instance_ids,omitempty" require:"true"`
	// 订购错误码
	// example:
	//
	// 订购错误码
	OrderErrorCode *string `json:"order_error_code,omitempty" xml:"order_error_code,omitempty" require:"true"`
	// 订购错误描述
	// example:
	//
	// 订购错误描述
	OrderErrorDescription *string `json:"order_error_description,omitempty" xml:"order_error_description,omitempty" require:"true"`
}

func (s CreateOrderResult) String() string {
	return tea.Prettify(s)
}

func (s CreateOrderResult) GoString() string {
	return s.String()
}

func (s *CreateOrderResult) SetBsnNo(v string) *CreateOrderResult {
	s.BsnNo = &v
	return s
}

func (s *CreateOrderResult) SetOrderId(v string) *CreateOrderResult {
	s.OrderId = &v
	return s
}

func (s *CreateOrderResult) SetNormalOrderLineId(v string) *CreateOrderResult {
	s.NormalOrderLineId = &v
	return s
}

func (s *CreateOrderResult) SetOrderStatus(v string) *CreateOrderResult {
	s.OrderStatus = &v
	return s
}

func (s *CreateOrderResult) SetInstanceIds(v string) *CreateOrderResult {
	s.InstanceIds = &v
	return s
}

func (s *CreateOrderResult) SetOrderErrorCode(v string) *CreateOrderResult {
	s.OrderErrorCode = &v
	return s
}

func (s *CreateOrderResult) SetOrderErrorDescription(v string) *CreateOrderResult {
	s.OrderErrorDescription = &v
	return s
}

// 约束条件列表
type PriceConstraintConditionVO struct {
	// 约束ID
	Id *int64 `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 价格约束ID
	PriceConstraintId *int64 `json:"price_constraint_id,omitempty" xml:"price_constraint_id,omitempty" require:"true"`
	// 规格条件CODE
	// example:
	//
	// test
	SpecConditionCode *string `json:"spec_condition_code,omitempty" xml:"spec_condition_code,omitempty"`
	// 条件关系比较符
	// example:
	//
	// test
	Operator *string `json:"operator,omitempty" xml:"operator,omitempty"`
	// 待比较对象的值
	// example:
	//
	// test
	TargetValue *string `json:"target_value,omitempty" xml:"target_value,omitempty"`
	// 特定场景下set才会有值
	// example:
	//
	// test
	SpecConditionName *string `json:"spec_condition_name,omitempty" xml:"spec_condition_name,omitempty"`
	// 特定场景下set才会有值
	// example:
	//
	// test
	TargetValueName *string `json:"target_value_name,omitempty" xml:"target_value_name,omitempty"`
	// 描述
	// example:
	//
	// test
	Description *string `json:"description,omitempty" xml:"description,omitempty"`
}

func (s PriceConstraintConditionVO) String() string {
	return tea.Prettify(s)
}

func (s PriceConstraintConditionVO) GoString() string {
	return s.String()
}

func (s *PriceConstraintConditionVO) SetId(v int64) *PriceConstraintConditionVO {
	s.Id = &v
	return s
}

func (s *PriceConstraintConditionVO) SetPriceConstraintId(v int64) *PriceConstraintConditionVO {
	s.PriceConstraintId = &v
	return s
}

func (s *PriceConstraintConditionVO) SetSpecConditionCode(v string) *PriceConstraintConditionVO {
	s.SpecConditionCode = &v
	return s
}

func (s *PriceConstraintConditionVO) SetOperator(v string) *PriceConstraintConditionVO {
	s.Operator = &v
	return s
}

func (s *PriceConstraintConditionVO) SetTargetValue(v string) *PriceConstraintConditionVO {
	s.TargetValue = &v
	return s
}

func (s *PriceConstraintConditionVO) SetSpecConditionName(v string) *PriceConstraintConditionVO {
	s.SpecConditionName = &v
	return s
}

func (s *PriceConstraintConditionVO) SetTargetValueName(v string) *PriceConstraintConditionVO {
	s.TargetValueName = &v
	return s
}

func (s *PriceConstraintConditionVO) SetDescription(v string) *PriceConstraintConditionVO {
	s.Description = &v
	return s
}

// l5数据
type OfferMaster struct {
	// 内部商品码
	// example:
	//
	// baas_pre
	InnerCode *string `json:"inner_code,omitempty" xml:"inner_code,omitempty" require:"true"`
	// 用于展示的格式化商品编码
	// example:
	//
	// PBC0000C013P-R
	FormatCode *string `json:"format_code,omitempty" xml:"format_code,omitempty" require:"true"`
	// 外部商品编码
	// example:
	//
	// baas_pre
	OuterCode *string `json:"outer_code,omitempty" xml:"outer_code,omitempty" require:"true"`
	// 商品名称
	// example:
	//
	// 蚂蚁链BaaS平台（包年包月）
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 商品描述
	// example:
	//
	// 商品描述
	Description *string `json:"description,omitempty" xml:"description,omitempty" require:"true"`
	// 产品code
	// example:
	//
	// productCode
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty" require:"true"`
	// 渠道产品编码
	// example:
	//
	// TWCBAG
	ServiceCode *string `json:"service_code,omitempty" xml:"service_code,omitempty" require:"true"`
	// l4编码
	// example:
	//
	// MSRJSPU00000028
	SpuCode *string `json:"spu_code,omitempty" xml:"spu_code,omitempty" require:"true"`
}

func (s OfferMaster) String() string {
	return tea.Prettify(s)
}

func (s OfferMaster) GoString() string {
	return s.String()
}

func (s *OfferMaster) SetInnerCode(v string) *OfferMaster {
	s.InnerCode = &v
	return s
}

func (s *OfferMaster) SetFormatCode(v string) *OfferMaster {
	s.FormatCode = &v
	return s
}

func (s *OfferMaster) SetOuterCode(v string) *OfferMaster {
	s.OuterCode = &v
	return s
}

func (s *OfferMaster) SetName(v string) *OfferMaster {
	s.Name = &v
	return s
}

func (s *OfferMaster) SetDescription(v string) *OfferMaster {
	s.Description = &v
	return s
}

func (s *OfferMaster) SetProductCode(v string) *OfferMaster {
	s.ProductCode = &v
	return s
}

func (s *OfferMaster) SetServiceCode(v string) *OfferMaster {
	s.ServiceCode = &v
	return s
}

func (s *OfferMaster) SetSpuCode(v string) *OfferMaster {
	s.SpuCode = &v
	return s
}

// 约束结果
type PriceConstraintResultVO struct {
	// 价格id
	// example:
	//
	// 0,1
	Id *int64 `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 价格约束ID
	// example:
	//
	// 0,1
	PriceConstraintId *int64 `json:"price_constraint_id,omitempty" xml:"price_constraint_id,omitempty" require:"true"`
	// 基础价格费率
	// example:
	//
	// test
	BasePrice *string `json:"base_price,omitempty" xml:"base_price,omitempty"`
	// 基础保底价
	// example:
	//
	// test
	AdjustPrice *string `json:"adjust_price,omitempty" xml:"adjust_price,omitempty"`
	// BD销售最低价费率
	// example:
	//
	// test
	BdPrice *string `json:"bd_price,omitempty" xml:"bd_price,omitempty"`
	// 成本价费率
	// example:
	//
	// test
	CostPrice *string `json:"cost_price,omitempty" xml:"cost_price,omitempty"`
	// 阶梯区间最小值
	// example:
	//
	// test
	LadderStart *string `json:"ladder_start,omitempty" xml:"ladder_start,omitempty"`
	// 阶梯区间结束值
	// example:
	//
	// test
	LadderEnd *string `json:"ladder_end,omitempty" xml:"ladder_end,omitempty"`
	// 价格单位，例如：元/每次
	// example:
	//
	// test
	PriceUnit *string `json:"price_unit,omitempty" xml:"price_unit,omitempty"`
	// 是否阶梯固定价
	// example:
	//
	// test
	LadderPriceFixed *bool `json:"ladder_price_fixed,omitempty" xml:"ladder_price_fixed,omitempty"`
}

func (s PriceConstraintResultVO) String() string {
	return tea.Prettify(s)
}

func (s PriceConstraintResultVO) GoString() string {
	return s.String()
}

func (s *PriceConstraintResultVO) SetId(v int64) *PriceConstraintResultVO {
	s.Id = &v
	return s
}

func (s *PriceConstraintResultVO) SetPriceConstraintId(v int64) *PriceConstraintResultVO {
	s.PriceConstraintId = &v
	return s
}

func (s *PriceConstraintResultVO) SetBasePrice(v string) *PriceConstraintResultVO {
	s.BasePrice = &v
	return s
}

func (s *PriceConstraintResultVO) SetAdjustPrice(v string) *PriceConstraintResultVO {
	s.AdjustPrice = &v
	return s
}

func (s *PriceConstraintResultVO) SetBdPrice(v string) *PriceConstraintResultVO {
	s.BdPrice = &v
	return s
}

func (s *PriceConstraintResultVO) SetCostPrice(v string) *PriceConstraintResultVO {
	s.CostPrice = &v
	return s
}

func (s *PriceConstraintResultVO) SetLadderStart(v string) *PriceConstraintResultVO {
	s.LadderStart = &v
	return s
}

func (s *PriceConstraintResultVO) SetLadderEnd(v string) *PriceConstraintResultVO {
	s.LadderEnd = &v
	return s
}

func (s *PriceConstraintResultVO) SetPriceUnit(v string) *PriceConstraintResultVO {
	s.PriceUnit = &v
	return s
}

func (s *PriceConstraintResultVO) SetLadderPriceFixed(v bool) *PriceConstraintResultVO {
	s.LadderPriceFixed = &v
	return s
}

// 潜客接受度市场逻辑明细
type AcceptanceDetail struct {
	// 客户名称
	// example:
	//
	// test
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 客户价格
	// example:
	//
	// test
	Price *string `json:"price,omitempty" xml:"price,omitempty"`
}

func (s AcceptanceDetail) String() string {
	return tea.Prettify(s)
}

func (s AcceptanceDetail) GoString() string {
	return s.String()
}

func (s *AcceptanceDetail) SetName(v string) *AcceptanceDetail {
	s.Name = &v
	return s
}

func (s *AcceptanceDetail) SetPrice(v string) *AcceptanceDetail {
	s.Price = &v
	return s
}

// 基于竞品及加成市场逻辑明细
type AdditionDetail struct {
	// 友商名称
	// example:
	//
	// test
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 友商价格
	// example:
	//
	// test
	Profit *string `json:"profit,omitempty" xml:"profit,omitempty"`
	// 技术分调整
	// example:
	//
	// test
	TechnicalScore *string `json:"technical_score,omitempty" xml:"technical_score,omitempty"`
	// 品牌分调整
	// example:
	//
	// test
	BrandScore *string `json:"brand_score,omitempty" xml:"brand_score,omitempty"`
	// BD权限价预估
	// example:
	//
	// test
	BdPricePredict *string `json:"bd_price_predict,omitempty" xml:"bd_price_predict,omitempty"`
}

func (s AdditionDetail) String() string {
	return tea.Prettify(s)
}

func (s AdditionDetail) GoString() string {
	return s.String()
}

func (s *AdditionDetail) SetName(v string) *AdditionDetail {
	s.Name = &v
	return s
}

func (s *AdditionDetail) SetProfit(v string) *AdditionDetail {
	s.Profit = &v
	return s
}

func (s *AdditionDetail) SetTechnicalScore(v string) *AdditionDetail {
	s.TechnicalScore = &v
	return s
}

func (s *AdditionDetail) SetBrandScore(v string) *AdditionDetail {
	s.BrandScore = &v
	return s
}

func (s *AdditionDetail) SetBdPricePredict(v string) *AdditionDetail {
	s.BdPricePredict = &v
	return s
}

// 成本法信息
type CostInfo struct {
	// 成本法原因
	// example:
	//
	// test
	CostReason *string `json:"cost_reason,omitempty" xml:"cost_reason,omitempty"`
	// 预期毛利率
	// example:
	//
	// test
	PredictProfit *string `json:"predict_profit,omitempty" xml:"predict_profit,omitempty"`
}

func (s CostInfo) String() string {
	return tea.Prettify(s)
}

func (s CostInfo) GoString() string {
	return s.String()
}

func (s *CostInfo) SetCostReason(v string) *CostInfo {
	s.CostReason = &v
	return s
}

func (s *CostInfo) SetPredictProfit(v string) *CostInfo {
	s.PredictProfit = &v
	return s
}

// 定价计划对应的约束
type PriceConstraintVO struct {
	// 定价计划ID
	// example:
	//
	// 0,1
	Id *int64 `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 定价计划ID
	// example:
	//
	// 0,1
	PricePlanId *int64 `json:"price_plan_id,omitempty" xml:"price_plan_id,omitempty" require:"true"`
	// 定价计划名称
	// example:
	//
	// test
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 描述
	// example:
	//
	// test
	Description *string `json:"description,omitempty" xml:"description,omitempty"`
	// 约束条件列表
	// example:
	//
	// test
	PriceConstraintConditionVoList []*PriceConstraintConditionVO `json:"price_constraint_condition_vo_list,omitempty" xml:"price_constraint_condition_vo_list,omitempty" type:"Repeated"`
	// 约束结果列表
	// example:
	//
	// test
	PriceConstraintResultVoList []*PriceConstraintResultVO `json:"price_constraint_result_vo_list,omitempty" xml:"price_constraint_result_vo_list,omitempty" type:"Repeated"`
}

func (s PriceConstraintVO) String() string {
	return tea.Prettify(s)
}

func (s PriceConstraintVO) GoString() string {
	return s.String()
}

func (s *PriceConstraintVO) SetId(v int64) *PriceConstraintVO {
	s.Id = &v
	return s
}

func (s *PriceConstraintVO) SetPricePlanId(v int64) *PriceConstraintVO {
	s.PricePlanId = &v
	return s
}

func (s *PriceConstraintVO) SetName(v string) *PriceConstraintVO {
	s.Name = &v
	return s
}

func (s *PriceConstraintVO) SetDescription(v string) *PriceConstraintVO {
	s.Description = &v
	return s
}

func (s *PriceConstraintVO) SetPriceConstraintConditionVoList(v []*PriceConstraintConditionVO) *PriceConstraintVO {
	s.PriceConstraintConditionVoList = v
	return s
}

func (s *PriceConstraintVO) SetPriceConstraintResultVoList(v []*PriceConstraintResultVO) *PriceConstraintVO {
	s.PriceConstraintResultVoList = v
	return s
}

// 客户价价值法信息
type CustomerValueDetail struct {
	// 名称
	// example:
	//
	// test
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 友商价格
	// example:
	//
	// test
	Profit *string `json:"profit,omitempty" xml:"profit,omitempty"`
	// 蚂蚁收益
	// example:
	//
	// test
	AntDivide *string `json:"ant_divide,omitempty" xml:"ant_divide,omitempty"`
	// BD权限价预估
	// example:
	//
	// test
	BdPricePredict *string `json:"bd_price_predict,omitempty" xml:"bd_price_predict,omitempty"`
}

func (s CustomerValueDetail) String() string {
	return tea.Prettify(s)
}

func (s CustomerValueDetail) GoString() string {
	return s.String()
}

func (s *CustomerValueDetail) SetName(v string) *CustomerValueDetail {
	s.Name = &v
	return s
}

func (s *CustomerValueDetail) SetProfit(v string) *CustomerValueDetail {
	s.Profit = &v
	return s
}

func (s *CustomerValueDetail) SetAntDivide(v string) *CustomerValueDetail {
	s.AntDivide = &v
	return s
}

func (s *CustomerValueDetail) SetBdPricePredict(v string) *CustomerValueDetail {
	s.BdPricePredict = &v
	return s
}

// 价格限制策略
// 目前只支持保底价格配置
type PriceLimitStrategyDTO struct {
	// 创建人
	// example:
	//
	// test
	Creator *string `json:"creator,omitempty" xml:"creator,omitempty"`
	// 修改人
	// example:
	//
	// test
	Modifier *string `json:"modifier,omitempty" xml:"modifier,omitempty"`
	// 是否删除
	// example:
	//
	// true, false
	Deleted *bool `json:"deleted,omitempty" xml:"deleted,omitempty"`
	// 定价计划ID
	// example:
	//
	// 0,1
	PricePlanId *int64 `json:"price_plan_id,omitempty" xml:"price_plan_id,omitempty" require:"true"`
	// 保底周期,year年、month月
	// example:
	//
	// test
	DurationType *string `json:"duration_type,omitempty" xml:"duration_type,omitempty"`
	// 保底价格
	// example:
	//
	// test
	GuaranteePrice *string `json:"guarantee_price,omitempty" xml:"guarantee_price,omitempty"`
	// 产品成本
	// example:
	//
	// test
	GuaranteeCostPrice *string `json:"guarantee_cost_price,omitempty" xml:"guarantee_cost_price,omitempty"`
}

func (s PriceLimitStrategyDTO) String() string {
	return tea.Prettify(s)
}

func (s PriceLimitStrategyDTO) GoString() string {
	return s.String()
}

func (s *PriceLimitStrategyDTO) SetCreator(v string) *PriceLimitStrategyDTO {
	s.Creator = &v
	return s
}

func (s *PriceLimitStrategyDTO) SetModifier(v string) *PriceLimitStrategyDTO {
	s.Modifier = &v
	return s
}

func (s *PriceLimitStrategyDTO) SetDeleted(v bool) *PriceLimitStrategyDTO {
	s.Deleted = &v
	return s
}

func (s *PriceLimitStrategyDTO) SetPricePlanId(v int64) *PriceLimitStrategyDTO {
	s.PricePlanId = &v
	return s
}

func (s *PriceLimitStrategyDTO) SetDurationType(v string) *PriceLimitStrategyDTO {
	s.DurationType = &v
	return s
}

func (s *PriceLimitStrategyDTO) SetGuaranteePrice(v string) *PriceLimitStrategyDTO {
	s.GuaranteePrice = &v
	return s
}

func (s *PriceLimitStrategyDTO) SetGuaranteeCostPrice(v string) *PriceLimitStrategyDTO {
	s.GuaranteeCostPrice = &v
	return s
}

// 市场法信息
type MarketInfo struct {
	// 市场逻辑
	// example:
	//
	// test
	MarketLogic *string `json:"market_logic,omitempty" xml:"market_logic,omitempty"`
	// 潜客接受度
	// example:
	//
	// test
	AcceptanceDetails []*AcceptanceDetail `json:"acceptance_details,omitempty" xml:"acceptance_details,omitempty" type:"Repeated"`
	// 基于竞品及加成
	// example:
	//
	// test
	AdditionDetails []*AdditionDetail `json:"addition_details,omitempty" xml:"addition_details,omitempty" type:"Repeated"`
}

func (s MarketInfo) String() string {
	return tea.Prettify(s)
}

func (s MarketInfo) GoString() string {
	return s.String()
}

func (s *MarketInfo) SetMarketLogic(v string) *MarketInfo {
	s.MarketLogic = &v
	return s
}

func (s *MarketInfo) SetAcceptanceDetails(v []*AcceptanceDetail) *MarketInfo {
	s.AcceptanceDetails = v
	return s
}

func (s *MarketInfo) SetAdditionDetails(v []*AdditionDetail) *MarketInfo {
	s.AdditionDetails = v
	return s
}

// 产品线SPU
type ProductSpu struct {
	// SPU编码
	// example:
	//
	// QYBBSPU00000001
	SpuCode *string `json:"spu_code,omitempty" xml:"spu_code,omitempty" require:"true"`
	// SPU名称
	// example:
	//
	// 积分兑换
	SpuName *string `json:"spu_name,omitempty" xml:"spu_name,omitempty" require:"true"`
	// spu描述
	// example:
	//
	// 积分兑换场景
	SpuDesc *string `json:"spu_desc,omitempty" xml:"spu_desc,omitempty" require:"true"`
	// 交付模式，ONLINE/OFFLINE
	// example:
	//
	// ONLINE
	DeliveryMode *string `json:"delivery_mode,omitempty" xml:"delivery_mode,omitempty" require:"true"`
	// 归属产品码
	// example:
	//
	// QYBB
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty" require:"true"`
	// 是否涉及一方化
	// example:
	//
	// true, false
	InvolvedOneParty *bool `json:"involved_one_party,omitempty" xml:"involved_one_party,omitempty" require:"true"`
	// technical_product:技术产品，technical_service:技术服务，solution_se:标准解决方案，saas:标准化SaaS，saas+:SaaS +，trading_network:交易网络
	// example:
	//
	// solution_se
	Segment *string `json:"segment,omitempty" xml:"segment,omitempty" require:"true"`
	// sku数据
	OfferMaster []*OfferMaster `json:"offer_master,omitempty" xml:"offer_master,omitempty" require:"true" type:"Repeated"`
}

func (s ProductSpu) String() string {
	return tea.Prettify(s)
}

func (s ProductSpu) GoString() string {
	return s.String()
}

func (s *ProductSpu) SetSpuCode(v string) *ProductSpu {
	s.SpuCode = &v
	return s
}

func (s *ProductSpu) SetSpuName(v string) *ProductSpu {
	s.SpuName = &v
	return s
}

func (s *ProductSpu) SetSpuDesc(v string) *ProductSpu {
	s.SpuDesc = &v
	return s
}

func (s *ProductSpu) SetDeliveryMode(v string) *ProductSpu {
	s.DeliveryMode = &v
	return s
}

func (s *ProductSpu) SetProductCode(v string) *ProductSpu {
	s.ProductCode = &v
	return s
}

func (s *ProductSpu) SetInvolvedOneParty(v bool) *ProductSpu {
	s.InvolvedOneParty = &v
	return s
}

func (s *ProductSpu) SetSegment(v string) *ProductSpu {
	s.Segment = &v
	return s
}

func (s *ProductSpu) SetOfferMaster(v []*OfferMaster) *ProductSpu {
	s.OfferMaster = v
	return s
}

// L3
type BusinessProduct struct {
	// 业务产品code
	// example:
	//
	// BAASPLUS
	Code *string `json:"code,omitempty" xml:"code,omitempty" require:"true"`
	// 产品线名称
	// example:
	//
	// BaaS增值服务
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 归属业务线
	// example:
	//
	// 10010
	BusinessLine *string `json:"business_line,omitempty" xml:"business_line,omitempty" require:"true"`
	// 归属产品线
	// example:
	//
	// 10010
	ProductLine *string `json:"product_line,omitempty" xml:"product_line,omitempty" require:"true"`
	// spu列表
	ProductSpu []*ProductSpu `json:"product_spu,omitempty" xml:"product_spu,omitempty" require:"true" type:"Repeated"`
	// 短码
	// example:
	//
	// CDXA
	ShortCode *string `json:"short_code,omitempty" xml:"short_code,omitempty" require:"true"`
}

func (s BusinessProduct) String() string {
	return tea.Prettify(s)
}

func (s BusinessProduct) GoString() string {
	return s.String()
}

func (s *BusinessProduct) SetCode(v string) *BusinessProduct {
	s.Code = &v
	return s
}

func (s *BusinessProduct) SetName(v string) *BusinessProduct {
	s.Name = &v
	return s
}

func (s *BusinessProduct) SetBusinessLine(v string) *BusinessProduct {
	s.BusinessLine = &v
	return s
}

func (s *BusinessProduct) SetProductLine(v string) *BusinessProduct {
	s.ProductLine = &v
	return s
}

func (s *BusinessProduct) SetProductSpu(v []*ProductSpu) *BusinessProduct {
	s.ProductSpu = v
	return s
}

func (s *BusinessProduct) SetShortCode(v string) *BusinessProduct {
	s.ShortCode = &v
	return s
}

// 定价计划
type PricePlanVO struct {
	// 定价计划ID
	Id *int64 `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 商品CODE
	// example:
	//
	// TAASFM00304790
	CommodityCode *string `json:"commodity_code,omitempty" xml:"commodity_code,omitempty" require:"true"`
	// 定价对象CODE
	// example:
	//
	// baasVer
	PriceObjectCode *string `json:"price_object_code,omitempty" xml:"price_object_code,omitempty" require:"true"`
	// 定价计划名称
	// example:
	//
	// test
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 定价计划类型
	// example:
	//
	// personalized
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 租户ID
	// example:
	//
	// 20888888
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 合同ID
	// example:
	//
	// 233333
	ContractId *string `json:"contract_id,omitempty" xml:"contract_id,omitempty"`
	// 政策ID
	// example:
	//
	// 11111
	PolicyId *string `json:"policy_id,omitempty" xml:"policy_id,omitempty"`
	// 商务项目ID
	// example:
	//
	// 111
	BusinessProjectId *string `json:"business_project_id,omitempty" xml:"business_project_id,omitempty"`
	// 执行条件
	// example:
	//
	// 123
	ExecuteCondition *string `json:"execute_condition,omitempty" xml:"execute_condition,omitempty"`
	// 优先级
	// example:
	//
	// 1
	Priority *int64 `json:"priority,omitempty" xml:"priority,omitempty" require:"true"`
	// 价格匹配不到处理策略：抛异常，继续询价
	// example:
	//
	// test
	NoMatchRule *string `json:"no_match_rule,omitempty" xml:"no_match_rule,omitempty"`
	// 计价模式：公式、阶梯、自定义
	// example:
	//
	// ladder
	PricingMode *string `json:"pricing_mode,omitempty" xml:"pricing_mode,omitempty"`
	// 计价方法：具体公式、阶梯方法、自定义
	// example:
	//
	// CUSTOM
	PricingMethod *string `json:"pricing_method,omitempty" xml:"pricing_method,omitempty"`
	// 阶梯区间类型，左开右闭/左闭右开
	// example:
	//
	// LOC
	LadderIntervalType *string `json:"ladder_interval_type,omitempty" xml:"ladder_interval_type,omitempty"`
	// 父定价计划ID
	ParentPricePlanId *int64 `json:"parent_price_plan_id,omitempty" xml:"parent_price_plan_id,omitempty"`
	// 定价计划状态，编辑中、预发生效、线上生效、失效
	// example:
	//
	// ONLINE
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 生效起始时间
	// example:
	//
	// 2018-10-10T10:10:00Z
	StartTime *string `json:"start_time,omitempty" xml:"start_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 生效结束时间
	// example:
	//
	// 2018-10-10T10:10:00Z
	EndTime *string `json:"end_time,omitempty" xml:"end_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 创建者
	// example:
	//
	// 196301
	Creator *string `json:"creator,omitempty" xml:"creator,omitempty"`
	// 修改者
	// example:
	//
	// 196301
	Modifier *string `json:"modifier,omitempty" xml:"modifier,omitempty"`
	// 创建时间
	// example:
	//
	// 2018-10-10T10:10:00Z
	GmtCreate *string `json:"gmt_create,omitempty" xml:"gmt_create,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 修改时间
	// example:
	//
	// 2018-10-10T10:10:00Z
	GmtModified *string `json:"gmt_modified,omitempty" xml:"gmt_modified,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 是否是基础价格
	// example:
	//
	// Y
	Basis *string `json:"basis,omitempty" xml:"basis,omitempty"`
	// 价格条件，多个以分号分隔
	// example:
	//
	// 1,2,3
	PriceConditionCodes *string `json:"price_condition_codes,omitempty" xml:"price_condition_codes,omitempty"`
	// 价格安全区间，格式 min,max如0,100
	// example:
	//
	// 1,100
	PriceSafeArea *string `json:"price_safe_area,omitempty" xml:"price_safe_area,omitempty" require:"true"`
	// 关联模板
	// example:
	//
	// USAGE_AMOUNT_TEMPLATE
	TemplateCode *string `json:"template_code,omitempty" xml:"template_code,omitempty"`
	// 关联审批流程
	// example:
	//
	// 111111
	BpmsProcessId *string `json:"bpms_process_id,omitempty" xml:"bpms_process_id,omitempty"`
	// 定价策略
	// example:
	//
	// test
	Strategy *string `json:"strategy,omitempty" xml:"strategy,omitempty"`
	// 定价阶段
	// example:
	//
	// PRE
	PriceStage *string `json:"price_stage,omitempty" xml:"price_stage,omitempty"`
	// 定价计划对应的约束，只有在明确需要查询定价约束时才会手动set进去
	PriceConstraintVoList []*PriceConstraintVO `json:"price_constraint_vo_list,omitempty" xml:"price_constraint_vo_list,omitempty" type:"Repeated"`
	// 价格限制策略
	PriceLimitStrategyDto []*PriceLimitStrategyDTO `json:"price_limit_strategy_dto,omitempty" xml:"price_limit_strategy_dto,omitempty" type:"Repeated"`
	// 销售渠道
	SaleChannel []*string `json:"sale_channel,omitempty" xml:"sale_channel,omitempty" type:"Repeated"`
	// 官网售卖折扣设置
	// example:
	//
	// 8
	OfficialSellDiscount *string `json:"official_sell_discount,omitempty" xml:"official_sell_discount,omitempty"`
	// 客户法详情
	// example:
	//
	// XXXX
	CustomerValueInfo *CustomerValueDetail `json:"customer_value_info,omitempty" xml:"customer_value_info,omitempty"`
	// 市场法详情
	// example:
	//
	// XXXX
	MarketInfo *MarketInfo `json:"market_info,omitempty" xml:"market_info,omitempty"`
	// 成本法详情
	// example:
	//
	// XXX
	CostInfo *CostInfo `json:"cost_info,omitempty" xml:"cost_info,omitempty"`
}

func (s PricePlanVO) String() string {
	return tea.Prettify(s)
}

func (s PricePlanVO) GoString() string {
	return s.String()
}

func (s *PricePlanVO) SetId(v int64) *PricePlanVO {
	s.Id = &v
	return s
}

func (s *PricePlanVO) SetCommodityCode(v string) *PricePlanVO {
	s.CommodityCode = &v
	return s
}

func (s *PricePlanVO) SetPriceObjectCode(v string) *PricePlanVO {
	s.PriceObjectCode = &v
	return s
}

func (s *PricePlanVO) SetName(v string) *PricePlanVO {
	s.Name = &v
	return s
}

func (s *PricePlanVO) SetType(v string) *PricePlanVO {
	s.Type = &v
	return s
}

func (s *PricePlanVO) SetTenantId(v string) *PricePlanVO {
	s.TenantId = &v
	return s
}

func (s *PricePlanVO) SetContractId(v string) *PricePlanVO {
	s.ContractId = &v
	return s
}

func (s *PricePlanVO) SetPolicyId(v string) *PricePlanVO {
	s.PolicyId = &v
	return s
}

func (s *PricePlanVO) SetBusinessProjectId(v string) *PricePlanVO {
	s.BusinessProjectId = &v
	return s
}

func (s *PricePlanVO) SetExecuteCondition(v string) *PricePlanVO {
	s.ExecuteCondition = &v
	return s
}

func (s *PricePlanVO) SetPriority(v int64) *PricePlanVO {
	s.Priority = &v
	return s
}

func (s *PricePlanVO) SetNoMatchRule(v string) *PricePlanVO {
	s.NoMatchRule = &v
	return s
}

func (s *PricePlanVO) SetPricingMode(v string) *PricePlanVO {
	s.PricingMode = &v
	return s
}

func (s *PricePlanVO) SetPricingMethod(v string) *PricePlanVO {
	s.PricingMethod = &v
	return s
}

func (s *PricePlanVO) SetLadderIntervalType(v string) *PricePlanVO {
	s.LadderIntervalType = &v
	return s
}

func (s *PricePlanVO) SetParentPricePlanId(v int64) *PricePlanVO {
	s.ParentPricePlanId = &v
	return s
}

func (s *PricePlanVO) SetStatus(v string) *PricePlanVO {
	s.Status = &v
	return s
}

func (s *PricePlanVO) SetStartTime(v string) *PricePlanVO {
	s.StartTime = &v
	return s
}

func (s *PricePlanVO) SetEndTime(v string) *PricePlanVO {
	s.EndTime = &v
	return s
}

func (s *PricePlanVO) SetCreator(v string) *PricePlanVO {
	s.Creator = &v
	return s
}

func (s *PricePlanVO) SetModifier(v string) *PricePlanVO {
	s.Modifier = &v
	return s
}

func (s *PricePlanVO) SetGmtCreate(v string) *PricePlanVO {
	s.GmtCreate = &v
	return s
}

func (s *PricePlanVO) SetGmtModified(v string) *PricePlanVO {
	s.GmtModified = &v
	return s
}

func (s *PricePlanVO) SetBasis(v string) *PricePlanVO {
	s.Basis = &v
	return s
}

func (s *PricePlanVO) SetPriceConditionCodes(v string) *PricePlanVO {
	s.PriceConditionCodes = &v
	return s
}

func (s *PricePlanVO) SetPriceSafeArea(v string) *PricePlanVO {
	s.PriceSafeArea = &v
	return s
}

func (s *PricePlanVO) SetTemplateCode(v string) *PricePlanVO {
	s.TemplateCode = &v
	return s
}

func (s *PricePlanVO) SetBpmsProcessId(v string) *PricePlanVO {
	s.BpmsProcessId = &v
	return s
}

func (s *PricePlanVO) SetStrategy(v string) *PricePlanVO {
	s.Strategy = &v
	return s
}

func (s *PricePlanVO) SetPriceStage(v string) *PricePlanVO {
	s.PriceStage = &v
	return s
}

func (s *PricePlanVO) SetPriceConstraintVoList(v []*PriceConstraintVO) *PricePlanVO {
	s.PriceConstraintVoList = v
	return s
}

func (s *PricePlanVO) SetPriceLimitStrategyDto(v []*PriceLimitStrategyDTO) *PricePlanVO {
	s.PriceLimitStrategyDto = v
	return s
}

func (s *PricePlanVO) SetSaleChannel(v []*string) *PricePlanVO {
	s.SaleChannel = v
	return s
}

func (s *PricePlanVO) SetOfficialSellDiscount(v string) *PricePlanVO {
	s.OfficialSellDiscount = &v
	return s
}

func (s *PricePlanVO) SetCustomerValueInfo(v *CustomerValueDetail) *PricePlanVO {
	s.CustomerValueInfo = v
	return s
}

func (s *PricePlanVO) SetMarketInfo(v *MarketInfo) *PricePlanVO {
	s.MarketInfo = v
	return s
}

func (s *PricePlanVO) SetCostInfo(v *CostInfo) *PricePlanVO {
	s.CostInfo = v
	return s
}

// L2
type ProductLine struct {
	// 溯源产品
	// example:
	//
	// 10051
	Code *string `json:"code,omitempty" xml:"code,omitempty" require:"true"`
	// 产品线名称
	// example:
	//
	// 溯源产品
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 业务产品线code
	// example:
	//
	// 10010
	BusinessLineCode *string `json:"business_line_code,omitempty" xml:"business_line_code,omitempty" require:"true"`
	// l3
	BusinessProduct []*BusinessProduct `json:"business_product,omitempty" xml:"business_product,omitempty" require:"true" type:"Repeated"`
}

func (s ProductLine) String() string {
	return tea.Prettify(s)
}

func (s ProductLine) GoString() string {
	return s.String()
}

func (s *ProductLine) SetCode(v string) *ProductLine {
	s.Code = &v
	return s
}

func (s *ProductLine) SetName(v string) *ProductLine {
	s.Name = &v
	return s
}

func (s *ProductLine) SetBusinessLineCode(v string) *ProductLine {
	s.BusinessLineCode = &v
	return s
}

func (s *ProductLine) SetBusinessProduct(v []*BusinessProduct) *ProductLine {
	s.BusinessProduct = v
	return s
}

// 收费项结果明细
type PriceObjectFee struct {
	// 收费项CODE
	// example:
	//
	// test
	PriceObjectCode *string `json:"price_object_code,omitempty" xml:"price_object_code,omitempty"`
	// 收费项名称
	// example:
	//
	// test
	PriceObjectName *string `json:"price_object_name,omitempty" xml:"price_object_name,omitempty"`
	// 高精度价格12位
	// example:
	//
	// test
	Price *string `json:"price,omitempty" xml:"price,omitempty"`
	// 价格类型，标准价格，一客一价
	// example:
	//
	// test
	PriceType *string `json:"price_type,omitempty" xml:"price_type,omitempty"`
	// 结算信息
	// example:
	//
	// test
	SettleType *string `json:"settle_type,omitempty" xml:"settle_type,omitempty"`
	// 币种
	// example:
	//
	// test
	Currency *string `json:"currency,omitempty" xml:"currency,omitempty"`
	// 命中的定价计划
	// example:
	//
	// test
	PricePlanVo *PricePlanVO `json:"price_plan_vo,omitempty" xml:"price_plan_vo,omitempty"`
	// 命中的定价计划约束
	// example:
	//
	// test
	PriceConstraintVo *PriceConstraintVO `json:"price_constraint_vo,omitempty" xml:"price_constraint_vo,omitempty"`
	// 扩展信息
	// example:
	//
	// test
	ExtendsMap *string `json:"extends_map,omitempty" xml:"extends_map,omitempty"`
	// BD销售价格区间
	// example:
	//
	// test
	BdPrice *string `json:"bd_price,omitempty" xml:"bd_price,omitempty"`
	// 最低成本价
	// example:
	//
	// test
	CostPrice *string `json:"cost_price,omitempty" xml:"cost_price,omitempty"`
}

func (s PriceObjectFee) String() string {
	return tea.Prettify(s)
}

func (s PriceObjectFee) GoString() string {
	return s.String()
}

func (s *PriceObjectFee) SetPriceObjectCode(v string) *PriceObjectFee {
	s.PriceObjectCode = &v
	return s
}

func (s *PriceObjectFee) SetPriceObjectName(v string) *PriceObjectFee {
	s.PriceObjectName = &v
	return s
}

func (s *PriceObjectFee) SetPrice(v string) *PriceObjectFee {
	s.Price = &v
	return s
}

func (s *PriceObjectFee) SetPriceType(v string) *PriceObjectFee {
	s.PriceType = &v
	return s
}

func (s *PriceObjectFee) SetSettleType(v string) *PriceObjectFee {
	s.SettleType = &v
	return s
}

func (s *PriceObjectFee) SetCurrency(v string) *PriceObjectFee {
	s.Currency = &v
	return s
}

func (s *PriceObjectFee) SetPricePlanVo(v *PricePlanVO) *PriceObjectFee {
	s.PricePlanVo = v
	return s
}

func (s *PriceObjectFee) SetPriceConstraintVo(v *PriceConstraintVO) *PriceObjectFee {
	s.PriceConstraintVo = v
	return s
}

func (s *PriceObjectFee) SetExtendsMap(v string) *PriceObjectFee {
	s.ExtendsMap = &v
	return s
}

func (s *PriceObjectFee) SetBdPrice(v string) *PriceObjectFee {
	s.BdPrice = &v
	return s
}

func (s *PriceObjectFee) SetCostPrice(v string) *PriceObjectFee {
	s.CostPrice = &v
	return s
}

// PriceDetailDTO
type PriceDetailDTO struct {
	// 定价约束id
	// example:
	//
	// 1
	ConstraintId *int64 `json:"constraint_id,omitempty" xml:"constraint_id,omitempty" require:"true"`
	// 计费项code
	// example:
	//
	// IN_NO_CACHE
	ChargeItem *string `json:"charge_item,omitempty" xml:"charge_item,omitempty" require:"true"`
	// 定价阶梯
	// example:
	//
	// L0
	StageLevel *string `json:"stage_level,omitempty" xml:"stage_level,omitempty" require:"true"`
	// 供应商
	// example:
	//
	// aliyun
	Provider *string `json:"provider,omitempty" xml:"provider,omitempty" require:"true"`
	// 刊例价
	// example:
	//
	// 0.01
	BasePrice *string `json:"base_price,omitempty" xml:"base_price,omitempty" require:"true"`
	// BD权限价
	// example:
	//
	// 0.1
	BdPrice *string `json:"bd_price,omitempty" xml:"bd_price,omitempty" require:"true"`
	// 底价
	// example:
	//
	// 0.1
	CostPrice *string `json:"cost_price,omitempty" xml:"cost_price,omitempty" require:"true"`
	// 定价单位
	// example:
	//
	// 元
	PriceUnit *string `json:"price_unit,omitempty" xml:"price_unit,omitempty" require:"true"`
	// 币种
	// example:
	//
	// 156
	CurrencyValue *string `json:"currency_value,omitempty" xml:"currency_value,omitempty" require:"true"`
	// 阶梯起始值
	// example:
	//
	// 0
	LadderStart *string `json:"ladder_start,omitempty" xml:"ladder_start,omitempty" require:"true"`
	// 阶梯结束值
	// example:
	//
	// 100
	LadderEnd *string `json:"ladder_end,omitempty" xml:"ladder_end,omitempty" require:"true"`
	// 定价id
	// example:
	//
	// 12344
	PricePlanId *int64 `json:"price_plan_id,omitempty" xml:"price_plan_id,omitempty" require:"true"`
	// 定价计划名称
	// example:
	//
	// 1234
	PricePlanName *string `json:"price_plan_name,omitempty" xml:"price_plan_name,omitempty" require:"true"`
	// 定价开始时间
	// example:
	//
	// 2026-06-01
	StartTime *string `json:"start_time,omitempty" xml:"start_time,omitempty" require:"true"`
	// 定价结束时间
	// example:
	//
	// 2026-06-30
	EndTime *string `json:"end_time,omitempty" xml:"end_time,omitempty" require:"true"`
}

func (s PriceDetailDTO) String() string {
	return tea.Prettify(s)
}

func (s PriceDetailDTO) GoString() string {
	return s.String()
}

func (s *PriceDetailDTO) SetConstraintId(v int64) *PriceDetailDTO {
	s.ConstraintId = &v
	return s
}

func (s *PriceDetailDTO) SetChargeItem(v string) *PriceDetailDTO {
	s.ChargeItem = &v
	return s
}

func (s *PriceDetailDTO) SetStageLevel(v string) *PriceDetailDTO {
	s.StageLevel = &v
	return s
}

func (s *PriceDetailDTO) SetProvider(v string) *PriceDetailDTO {
	s.Provider = &v
	return s
}

func (s *PriceDetailDTO) SetBasePrice(v string) *PriceDetailDTO {
	s.BasePrice = &v
	return s
}

func (s *PriceDetailDTO) SetBdPrice(v string) *PriceDetailDTO {
	s.BdPrice = &v
	return s
}

func (s *PriceDetailDTO) SetCostPrice(v string) *PriceDetailDTO {
	s.CostPrice = &v
	return s
}

func (s *PriceDetailDTO) SetPriceUnit(v string) *PriceDetailDTO {
	s.PriceUnit = &v
	return s
}

func (s *PriceDetailDTO) SetCurrencyValue(v string) *PriceDetailDTO {
	s.CurrencyValue = &v
	return s
}

func (s *PriceDetailDTO) SetLadderStart(v string) *PriceDetailDTO {
	s.LadderStart = &v
	return s
}

func (s *PriceDetailDTO) SetLadderEnd(v string) *PriceDetailDTO {
	s.LadderEnd = &v
	return s
}

func (s *PriceDetailDTO) SetPricePlanId(v int64) *PriceDetailDTO {
	s.PricePlanId = &v
	return s
}

func (s *PriceDetailDTO) SetPricePlanName(v string) *PriceDetailDTO {
	s.PricePlanName = &v
	return s
}

func (s *PriceDetailDTO) SetStartTime(v string) *PriceDetailDTO {
	s.StartTime = &v
	return s
}

func (s *PriceDetailDTO) SetEndTime(v string) *PriceDetailDTO {
	s.EndTime = &v
	return s
}

// Product基础信息，包含 code(产品码) ,name(产品名称),name_en(产品英文名)
type ProductBaseInfo struct {
	// 产品码，系统内部识别
	// example:
	//
	// IIFS
	Code *string `json:"code,omitempty" xml:"code,omitempty" require:"true"`
	// 产品名称
	// example:
	//
	// 票聚链-普惠金融服务
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 产品英文名称
	// example:
	//
	// invoichain-finance
	NameEn *string `json:"name_en,omitempty" xml:"name_en,omitempty"`
	// 产品短码，管理维度识别
	// example:
	//
	// IIFS
	ShortCode *string `json:"short_code,omitempty" xml:"short_code,omitempty" require:"true"`
}

func (s ProductBaseInfo) String() string {
	return tea.Prettify(s)
}

func (s ProductBaseInfo) GoString() string {
	return s.String()
}

func (s *ProductBaseInfo) SetCode(v string) *ProductBaseInfo {
	s.Code = &v
	return s
}

func (s *ProductBaseInfo) SetName(v string) *ProductBaseInfo {
	s.Name = &v
	return s
}

func (s *ProductBaseInfo) SetNameEn(v string) *ProductBaseInfo {
	s.NameEn = &v
	return s
}

func (s *ProductBaseInfo) SetShortCode(v string) *ProductBaseInfo {
	s.ShortCode = &v
	return s
}

// ModelPriceItemDTO
type ModelPriceItemDTO struct {
	// 模型名称
	// example:
	//
	// qwen3.5-plus
	Model *string `json:"model,omitempty" xml:"model,omitempty" require:"true"`
	// 定价详情
	// example:
	//
	// undefined
	Prices []*PriceDetailDTO `json:"prices,omitempty" xml:"prices,omitempty" require:"true" type:"Repeated"`
}

func (s ModelPriceItemDTO) String() string {
	return tea.Prettify(s)
}

func (s ModelPriceItemDTO) GoString() string {
	return s.String()
}

func (s *ModelPriceItemDTO) SetModel(v string) *ModelPriceItemDTO {
	s.Model = &v
	return s
}

func (s *ModelPriceItemDTO) SetPrices(v []*PriceDetailDTO) *ModelPriceItemDTO {
	s.Prices = v
	return s
}

// L1
type BusinessLine struct {
	// 产品线code
	// example:
	//
	// 10031
	Code *string `json:"code,omitempty" xml:"code,omitempty" require:"true"`
	// 1级产品线name
	// example:
	//
	// 可信产业
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// L2
	ProductLine []*ProductLine `json:"product_line,omitempty" xml:"product_line,omitempty" require:"true" type:"Repeated"`
}

func (s BusinessLine) String() string {
	return tea.Prettify(s)
}

func (s BusinessLine) GoString() string {
	return s.String()
}

func (s *BusinessLine) SetCode(v string) *BusinessLine {
	s.Code = &v
	return s
}

func (s *BusinessLine) SetName(v string) *BusinessLine {
	s.Name = &v
	return s
}

func (s *BusinessLine) SetProductLine(v []*ProductLine) *BusinessLine {
	s.ProductLine = v
	return s
}

// 客户价值法信息
type CustomerValueInfo struct {
	// 客户价价值法信息
	// example:
	//
	// test
	CustomerValueDetails []*CustomerValueDetail `json:"customer_value_details,omitempty" xml:"customer_value_details,omitempty" type:"Repeated"`
}

func (s CustomerValueInfo) String() string {
	return tea.Prettify(s)
}

func (s CustomerValueInfo) GoString() string {
	return s.String()
}

func (s *CustomerValueInfo) SetCustomerValueDetails(v []*CustomerValueDetail) *CustomerValueInfo {
	s.CustomerValueDetails = v
	return s
}

// 返回高精度12位价格,其他精度可使用工具类处理
type InquiryPriceResponse struct {
	// 高精度12位价格
	// example:
	//
	// test
	Price *string `json:"price,omitempty" xml:"price,omitempty"`
	// 币种
	// example:
	//
	// test
	Currency *string `json:"currency,omitempty" xml:"currency,omitempty"`
	// BD销售价格(高精度12位)
	// example:
	//
	// test
	BdPrice *string `json:"bd_price,omitempty" xml:"bd_price,omitempty"`
	// 最低成本价(高精度12位)
	// example:
	//
	// test
	CostPrice *string `json:"cost_price,omitempty" xml:"cost_price,omitempty"`
	// 收费项结果明细列表
	// example:
	//
	// test
	PriceObjectFeeList []*PriceObjectFee `json:"price_object_fee_list,omitempty" xml:"price_object_fee_list,omitempty" type:"Repeated"`
}

func (s InquiryPriceResponse) String() string {
	return tea.Prettify(s)
}

func (s InquiryPriceResponse) GoString() string {
	return s.String()
}

func (s *InquiryPriceResponse) SetPrice(v string) *InquiryPriceResponse {
	s.Price = &v
	return s
}

func (s *InquiryPriceResponse) SetCurrency(v string) *InquiryPriceResponse {
	s.Currency = &v
	return s
}

func (s *InquiryPriceResponse) SetBdPrice(v string) *InquiryPriceResponse {
	s.BdPrice = &v
	return s
}

func (s *InquiryPriceResponse) SetCostPrice(v string) *InquiryPriceResponse {
	s.CostPrice = &v
	return s
}

func (s *InquiryPriceResponse) SetPriceObjectFeeList(v []*PriceObjectFee) *InquiryPriceResponse {
	s.PriceObjectFeeList = v
	return s
}

// 商品结构
type Commodity struct {
	// 商品编码
	// example:
	//
	// KKAASP00000001
	Code *string `json:"code,omitempty" xml:"code,omitempty" require:"true"`
	// 商品名称
	// example:
	//
	// 测试商品
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 商品状态
	// example:
	//
	// ONLINE
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
}

func (s Commodity) String() string {
	return tea.Prettify(s)
}

func (s Commodity) GoString() string {
	return s.String()
}

func (s *Commodity) SetCode(v string) *Commodity {
	s.Code = &v
	return s
}

func (s *Commodity) SetName(v string) *Commodity {
	s.Name = &v
	return s
}

func (s *Commodity) SetStatus(v string) *Commodity {
	s.Status = &v
	return s
}

type QueryDemoTestJltestRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 数据
	Data *string `json:"data,omitempty" xml:"data,omitempty" require:"true"`
	// 数据bbb
	Datax *string `json:"datax,omitempty" xml:"datax,omitempty" require:"true"`
	// 数据bbb
	Datay *string `json:"datay,omitempty" xml:"datay,omitempty" require:"true"`
	// 数据ddd
	Dataa *string `json:"dataa,omitempty" xml:"dataa,omitempty" require:"true"`
}

func (s QueryDemoTestJltestRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDemoTestJltestRequest) GoString() string {
	return s.String()
}

func (s *QueryDemoTestJltestRequest) SetAuthToken(v string) *QueryDemoTestJltestRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDemoTestJltestRequest) SetProductInstanceId(v string) *QueryDemoTestJltestRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryDemoTestJltestRequest) SetData(v string) *QueryDemoTestJltestRequest {
	s.Data = &v
	return s
}

func (s *QueryDemoTestJltestRequest) SetDatax(v string) *QueryDemoTestJltestRequest {
	s.Datax = &v
	return s
}

func (s *QueryDemoTestJltestRequest) SetDatay(v string) *QueryDemoTestJltestRequest {
	s.Datay = &v
	return s
}

func (s *QueryDemoTestJltestRequest) SetDataa(v string) *QueryDemoTestJltestRequest {
	s.Dataa = &v
	return s
}

type QueryDemoTestJltestResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 名字
	Namex *string `json:"namex,omitempty" xml:"namex,omitempty"`
}

func (s QueryDemoTestJltestResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDemoTestJltestResponse) GoString() string {
	return s.String()
}

func (s *QueryDemoTestJltestResponse) SetReqMsgId(v string) *QueryDemoTestJltestResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDemoTestJltestResponse) SetResultCode(v string) *QueryDemoTestJltestResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDemoTestJltestResponse) SetResultMsg(v string) *QueryDemoTestJltestResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDemoTestJltestResponse) SetNamex(v string) *QueryDemoTestJltestResponse {
	s.Namex = &v
	return s
}

type CreateDemoBusinessOrderxRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单号
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
	// 分页大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// 订单结构体
	OrderInfo *OrderInfo `json:"order_info,omitempty" xml:"order_info,omitempty" require:"true"`
}

func (s CreateDemoBusinessOrderxRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateDemoBusinessOrderxRequest) GoString() string {
	return s.String()
}

func (s *CreateDemoBusinessOrderxRequest) SetAuthToken(v string) *CreateDemoBusinessOrderxRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateDemoBusinessOrderxRequest) SetProductInstanceId(v string) *CreateDemoBusinessOrderxRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateDemoBusinessOrderxRequest) SetOrderId(v string) *CreateDemoBusinessOrderxRequest {
	s.OrderId = &v
	return s
}

func (s *CreateDemoBusinessOrderxRequest) SetPageSize(v int64) *CreateDemoBusinessOrderxRequest {
	s.PageSize = &v
	return s
}

func (s *CreateDemoBusinessOrderxRequest) SetOrderInfo(v *OrderInfo) *CreateDemoBusinessOrderxRequest {
	s.OrderInfo = v
	return s
}

type CreateDemoBusinessOrderxResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 订单列表
	OrderList []*OrderDTO `json:"order_list,omitempty" xml:"order_list,omitempty" type:"Repeated"`
	// 总数
	TotalCount *int64 `json:"total_count,omitempty" xml:"total_count,omitempty"`
}

func (s CreateDemoBusinessOrderxResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateDemoBusinessOrderxResponse) GoString() string {
	return s.String()
}

func (s *CreateDemoBusinessOrderxResponse) SetReqMsgId(v string) *CreateDemoBusinessOrderxResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateDemoBusinessOrderxResponse) SetResultCode(v string) *CreateDemoBusinessOrderxResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateDemoBusinessOrderxResponse) SetResultMsg(v string) *CreateDemoBusinessOrderxResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateDemoBusinessOrderxResponse) SetOrderList(v []*OrderDTO) *CreateDemoBusinessOrderxResponse {
	s.OrderList = v
	return s
}

func (s *CreateDemoBusinessOrderxResponse) SetTotalCount(v int64) *CreateDemoBusinessOrderxResponse {
	s.TotalCount = &v
	return s
}

type CreateDemoBusinessOrderzRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单号
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
	// 分页大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// 订单结构体
	OrderInfo *OrderInfo `json:"order_info,omitempty" xml:"order_info,omitempty" require:"true"`
}

func (s CreateDemoBusinessOrderzRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateDemoBusinessOrderzRequest) GoString() string {
	return s.String()
}

func (s *CreateDemoBusinessOrderzRequest) SetAuthToken(v string) *CreateDemoBusinessOrderzRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateDemoBusinessOrderzRequest) SetProductInstanceId(v string) *CreateDemoBusinessOrderzRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateDemoBusinessOrderzRequest) SetOrderId(v string) *CreateDemoBusinessOrderzRequest {
	s.OrderId = &v
	return s
}

func (s *CreateDemoBusinessOrderzRequest) SetPageSize(v int64) *CreateDemoBusinessOrderzRequest {
	s.PageSize = &v
	return s
}

func (s *CreateDemoBusinessOrderzRequest) SetOrderInfo(v *OrderInfo) *CreateDemoBusinessOrderzRequest {
	s.OrderInfo = v
	return s
}

type CreateDemoBusinessOrderzResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 订单列表
	OrderList []*OrderDTO `json:"order_list,omitempty" xml:"order_list,omitempty" type:"Repeated"`
	// 总数
	TotalCount *int64 `json:"total_count,omitempty" xml:"total_count,omitempty"`
}

func (s CreateDemoBusinessOrderzResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateDemoBusinessOrderzResponse) GoString() string {
	return s.String()
}

func (s *CreateDemoBusinessOrderzResponse) SetReqMsgId(v string) *CreateDemoBusinessOrderzResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateDemoBusinessOrderzResponse) SetResultCode(v string) *CreateDemoBusinessOrderzResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateDemoBusinessOrderzResponse) SetResultMsg(v string) *CreateDemoBusinessOrderzResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateDemoBusinessOrderzResponse) SetOrderList(v []*OrderDTO) *CreateDemoBusinessOrderzResponse {
	s.OrderList = v
	return s
}

func (s *CreateDemoBusinessOrderzResponse) SetTotalCount(v int64) *CreateDemoBusinessOrderzResponse {
	s.TotalCount = &v
	return s
}

type CreateDemoBusinessOrderyRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单号
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
	// 分页大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// 订单结构体
	OrderInfo *OrderInfo `json:"order_info,omitempty" xml:"order_info,omitempty" require:"true"`
}

func (s CreateDemoBusinessOrderyRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateDemoBusinessOrderyRequest) GoString() string {
	return s.String()
}

func (s *CreateDemoBusinessOrderyRequest) SetAuthToken(v string) *CreateDemoBusinessOrderyRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateDemoBusinessOrderyRequest) SetProductInstanceId(v string) *CreateDemoBusinessOrderyRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateDemoBusinessOrderyRequest) SetOrderId(v string) *CreateDemoBusinessOrderyRequest {
	s.OrderId = &v
	return s
}

func (s *CreateDemoBusinessOrderyRequest) SetPageSize(v int64) *CreateDemoBusinessOrderyRequest {
	s.PageSize = &v
	return s
}

func (s *CreateDemoBusinessOrderyRequest) SetOrderInfo(v *OrderInfo) *CreateDemoBusinessOrderyRequest {
	s.OrderInfo = v
	return s
}

type CreateDemoBusinessOrderyResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 订单列表
	OrderList []*OrderDTO `json:"order_list,omitempty" xml:"order_list,omitempty" type:"Repeated"`
	// 总数
	TotalCount *int64 `json:"total_count,omitempty" xml:"total_count,omitempty"`
}

func (s CreateDemoBusinessOrderyResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateDemoBusinessOrderyResponse) GoString() string {
	return s.String()
}

func (s *CreateDemoBusinessOrderyResponse) SetReqMsgId(v string) *CreateDemoBusinessOrderyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateDemoBusinessOrderyResponse) SetResultCode(v string) *CreateDemoBusinessOrderyResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateDemoBusinessOrderyResponse) SetResultMsg(v string) *CreateDemoBusinessOrderyResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateDemoBusinessOrderyResponse) SetOrderList(v []*OrderDTO) *CreateDemoBusinessOrderyResponse {
	s.OrderList = v
	return s
}

func (s *CreateDemoBusinessOrderyResponse) SetTotalCount(v int64) *CreateDemoBusinessOrderyResponse {
	s.TotalCount = &v
	return s
}

type CreateDemoBusinessOrdernRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单号
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
}

func (s CreateDemoBusinessOrdernRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateDemoBusinessOrdernRequest) GoString() string {
	return s.String()
}

func (s *CreateDemoBusinessOrdernRequest) SetAuthToken(v string) *CreateDemoBusinessOrdernRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateDemoBusinessOrdernRequest) SetProductInstanceId(v string) *CreateDemoBusinessOrdernRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateDemoBusinessOrdernRequest) SetOrderId(v string) *CreateDemoBusinessOrdernRequest {
	s.OrderId = &v
	return s
}

type CreateDemoBusinessOrdernResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 总数
	TotalCount *int64 `json:"total_count,omitempty" xml:"total_count,omitempty"`
}

func (s CreateDemoBusinessOrdernResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateDemoBusinessOrdernResponse) GoString() string {
	return s.String()
}

func (s *CreateDemoBusinessOrdernResponse) SetReqMsgId(v string) *CreateDemoBusinessOrdernResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateDemoBusinessOrdernResponse) SetResultCode(v string) *CreateDemoBusinessOrdernResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateDemoBusinessOrdernResponse) SetResultMsg(v string) *CreateDemoBusinessOrdernResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateDemoBusinessOrdernResponse) SetTotalCount(v int64) *CreateDemoBusinessOrdernResponse {
	s.TotalCount = &v
	return s
}

type CreateDemoBusinessOrderaaRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单编号
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty" require:"true"`
}

func (s CreateDemoBusinessOrderaaRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateDemoBusinessOrderaaRequest) GoString() string {
	return s.String()
}

func (s *CreateDemoBusinessOrderaaRequest) SetAuthToken(v string) *CreateDemoBusinessOrderaaRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateDemoBusinessOrderaaRequest) SetProductInstanceId(v string) *CreateDemoBusinessOrderaaRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateDemoBusinessOrderaaRequest) SetOrderNo(v string) *CreateDemoBusinessOrderaaRequest {
	s.OrderNo = &v
	return s
}

type CreateDemoBusinessOrderaaResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 商品明细
	ItemList []*OrderItem `json:"item_list,omitempty" xml:"item_list,omitempty" type:"Repeated"`
}

func (s CreateDemoBusinessOrderaaResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateDemoBusinessOrderaaResponse) GoString() string {
	return s.String()
}

func (s *CreateDemoBusinessOrderaaResponse) SetReqMsgId(v string) *CreateDemoBusinessOrderaaResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateDemoBusinessOrderaaResponse) SetResultCode(v string) *CreateDemoBusinessOrderaaResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateDemoBusinessOrderaaResponse) SetResultMsg(v string) *CreateDemoBusinessOrderaaResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateDemoBusinessOrderaaResponse) SetItemList(v []*OrderItem) *CreateDemoBusinessOrderaaResponse {
	s.ItemList = v
	return s
}

type CreateDemoBusinessOrderqRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单编号
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty" require:"true"`
}

func (s CreateDemoBusinessOrderqRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateDemoBusinessOrderqRequest) GoString() string {
	return s.String()
}

func (s *CreateDemoBusinessOrderqRequest) SetAuthToken(v string) *CreateDemoBusinessOrderqRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateDemoBusinessOrderqRequest) SetProductInstanceId(v string) *CreateDemoBusinessOrderqRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateDemoBusinessOrderqRequest) SetOrderNo(v string) *CreateDemoBusinessOrderqRequest {
	s.OrderNo = &v
	return s
}

type CreateDemoBusinessOrderqResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 商品明细
	ItemList []*OrderItem `json:"item_list,omitempty" xml:"item_list,omitempty" type:"Repeated"`
}

func (s CreateDemoBusinessOrderqResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateDemoBusinessOrderqResponse) GoString() string {
	return s.String()
}

func (s *CreateDemoBusinessOrderqResponse) SetReqMsgId(v string) *CreateDemoBusinessOrderqResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateDemoBusinessOrderqResponse) SetResultCode(v string) *CreateDemoBusinessOrderqResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateDemoBusinessOrderqResponse) SetResultMsg(v string) *CreateDemoBusinessOrderqResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateDemoBusinessOrderqResponse) SetItemList(v []*OrderItem) *CreateDemoBusinessOrderqResponse {
	s.ItemList = v
	return s
}

type CreateDemoBusinessOrderbRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单编号
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty" require:"true"`
}

func (s CreateDemoBusinessOrderbRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateDemoBusinessOrderbRequest) GoString() string {
	return s.String()
}

func (s *CreateDemoBusinessOrderbRequest) SetAuthToken(v string) *CreateDemoBusinessOrderbRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateDemoBusinessOrderbRequest) SetProductInstanceId(v string) *CreateDemoBusinessOrderbRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateDemoBusinessOrderbRequest) SetOrderNo(v string) *CreateDemoBusinessOrderbRequest {
	s.OrderNo = &v
	return s
}

type CreateDemoBusinessOrderbResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 商品明细
	ItemList []*OrderItem `json:"item_list,omitempty" xml:"item_list,omitempty" type:"Repeated"`
}

func (s CreateDemoBusinessOrderbResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateDemoBusinessOrderbResponse) GoString() string {
	return s.String()
}

func (s *CreateDemoBusinessOrderbResponse) SetReqMsgId(v string) *CreateDemoBusinessOrderbResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateDemoBusinessOrderbResponse) SetResultCode(v string) *CreateDemoBusinessOrderbResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateDemoBusinessOrderbResponse) SetResultMsg(v string) *CreateDemoBusinessOrderbResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateDemoBusinessOrderbResponse) SetItemList(v []*OrderItem) *CreateDemoBusinessOrderbResponse {
	s.ItemList = v
	return s
}

type TestDemoTestApiRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// bbb
	Id *string `json:"id,omitempty" xml:"id,omitempty"`
}

func (s TestDemoTestApiRequest) String() string {
	return tea.Prettify(s)
}

func (s TestDemoTestApiRequest) GoString() string {
	return s.String()
}

func (s *TestDemoTestApiRequest) SetAuthToken(v string) *TestDemoTestApiRequest {
	s.AuthToken = &v
	return s
}

func (s *TestDemoTestApiRequest) SetProductInstanceId(v string) *TestDemoTestApiRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *TestDemoTestApiRequest) SetId(v string) *TestDemoTestApiRequest {
	s.Id = &v
	return s
}

type TestDemoTestApiResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s TestDemoTestApiResponse) String() string {
	return tea.Prettify(s)
}

func (s TestDemoTestApiResponse) GoString() string {
	return s.String()
}

func (s *TestDemoTestApiResponse) SetReqMsgId(v string) *TestDemoTestApiResponse {
	s.ReqMsgId = &v
	return s
}

func (s *TestDemoTestApiResponse) SetResultCode(v string) *TestDemoTestApiResponse {
	s.ResultCode = &v
	return s
}

func (s *TestDemoTestApiResponse) SetResultMsg(v string) *TestDemoTestApiResponse {
	s.ResultMsg = &v
	return s
}

type CreateDemoBusinessOrdercRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单编号
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty" require:"true"`
}

func (s CreateDemoBusinessOrdercRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateDemoBusinessOrdercRequest) GoString() string {
	return s.String()
}

func (s *CreateDemoBusinessOrdercRequest) SetAuthToken(v string) *CreateDemoBusinessOrdercRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateDemoBusinessOrdercRequest) SetProductInstanceId(v string) *CreateDemoBusinessOrdercRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateDemoBusinessOrdercRequest) SetOrderNo(v string) *CreateDemoBusinessOrdercRequest {
	s.OrderNo = &v
	return s
}

type CreateDemoBusinessOrdercResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 商品明细
	ItemList []*OrderItem `json:"item_list,omitempty" xml:"item_list,omitempty" type:"Repeated"`
}

func (s CreateDemoBusinessOrdercResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateDemoBusinessOrdercResponse) GoString() string {
	return s.String()
}

func (s *CreateDemoBusinessOrdercResponse) SetReqMsgId(v string) *CreateDemoBusinessOrdercResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateDemoBusinessOrdercResponse) SetResultCode(v string) *CreateDemoBusinessOrdercResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateDemoBusinessOrdercResponse) SetResultMsg(v string) *CreateDemoBusinessOrdercResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateDemoBusinessOrdercResponse) SetItemList(v []*OrderItem) *CreateDemoBusinessOrdercResponse {
	s.ItemList = v
	return s
}

type CreateDemoBusinessOrderdRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单编号
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty" require:"true"`
}

func (s CreateDemoBusinessOrderdRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateDemoBusinessOrderdRequest) GoString() string {
	return s.String()
}

func (s *CreateDemoBusinessOrderdRequest) SetAuthToken(v string) *CreateDemoBusinessOrderdRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateDemoBusinessOrderdRequest) SetProductInstanceId(v string) *CreateDemoBusinessOrderdRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateDemoBusinessOrderdRequest) SetOrderNo(v string) *CreateDemoBusinessOrderdRequest {
	s.OrderNo = &v
	return s
}

type CreateDemoBusinessOrderdResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 商品明细
	ItemList []*OrderItem `json:"item_list,omitempty" xml:"item_list,omitempty" type:"Repeated"`
}

func (s CreateDemoBusinessOrderdResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateDemoBusinessOrderdResponse) GoString() string {
	return s.String()
}

func (s *CreateDemoBusinessOrderdResponse) SetReqMsgId(v string) *CreateDemoBusinessOrderdResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateDemoBusinessOrderdResponse) SetResultCode(v string) *CreateDemoBusinessOrderdResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateDemoBusinessOrderdResponse) SetResultMsg(v string) *CreateDemoBusinessOrderdResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateDemoBusinessOrderdResponse) SetItemList(v []*OrderItem) *CreateDemoBusinessOrderdResponse {
	s.ItemList = v
	return s
}

type QueryAntcloudAcmUserProjectRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 用户ID
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
}

func (s QueryAntcloudAcmUserProjectRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAntcloudAcmUserProjectRequest) GoString() string {
	return s.String()
}

func (s *QueryAntcloudAcmUserProjectRequest) SetAuthToken(v string) *QueryAntcloudAcmUserProjectRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAntcloudAcmUserProjectRequest) SetUserId(v string) *QueryAntcloudAcmUserProjectRequest {
	s.UserId = &v
	return s
}

type QueryAntcloudAcmUserProjectResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 项目
	ProjectList []*Project `json:"project_list,omitempty" xml:"project_list,omitempty" type:"Repeated"`
}

func (s QueryAntcloudAcmUserProjectResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAntcloudAcmUserProjectResponse) GoString() string {
	return s.String()
}

func (s *QueryAntcloudAcmUserProjectResponse) SetReqMsgId(v string) *QueryAntcloudAcmUserProjectResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAntcloudAcmUserProjectResponse) SetResultCode(v string) *QueryAntcloudAcmUserProjectResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAntcloudAcmUserProjectResponse) SetResultMsg(v string) *QueryAntcloudAcmUserProjectResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAntcloudAcmUserProjectResponse) SetProjectList(v []*Project) *QueryAntcloudAcmUserProjectResponse {
	s.ProjectList = v
	return s
}

type CheckAntcloudBillingConfigPreRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 配置字符串
	NewFeeConfig *FeeConfEntityVO `json:"new_fee_config,omitempty" xml:"new_fee_config,omitempty" require:"true"`
	// 请求单号
	BizNo *string `json:"biz_no,omitempty" xml:"biz_no,omitempty" require:"true"`
}

func (s CheckAntcloudBillingConfigPreRequest) String() string {
	return tea.Prettify(s)
}

func (s CheckAntcloudBillingConfigPreRequest) GoString() string {
	return s.String()
}

func (s *CheckAntcloudBillingConfigPreRequest) SetAuthToken(v string) *CheckAntcloudBillingConfigPreRequest {
	s.AuthToken = &v
	return s
}

func (s *CheckAntcloudBillingConfigPreRequest) SetNewFeeConfig(v *FeeConfEntityVO) *CheckAntcloudBillingConfigPreRequest {
	s.NewFeeConfig = v
	return s
}

func (s *CheckAntcloudBillingConfigPreRequest) SetBizNo(v string) *CheckAntcloudBillingConfigPreRequest {
	s.BizNo = &v
	return s
}

type CheckAntcloudBillingConfigPreResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 对比对象
	Result *FeeConfChangeVO `json:"result,omitempty" xml:"result,omitempty"`
}

func (s CheckAntcloudBillingConfigPreResponse) String() string {
	return tea.Prettify(s)
}

func (s CheckAntcloudBillingConfigPreResponse) GoString() string {
	return s.String()
}

func (s *CheckAntcloudBillingConfigPreResponse) SetReqMsgId(v string) *CheckAntcloudBillingConfigPreResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CheckAntcloudBillingConfigPreResponse) SetResultCode(v string) *CheckAntcloudBillingConfigPreResponse {
	s.ResultCode = &v
	return s
}

func (s *CheckAntcloudBillingConfigPreResponse) SetResultMsg(v string) *CheckAntcloudBillingConfigPreResponse {
	s.ResultMsg = &v
	return s
}

func (s *CheckAntcloudBillingConfigPreResponse) SetResult(v *FeeConfChangeVO) *CheckAntcloudBillingConfigPreResponse {
	s.Result = v
	return s
}

type SendAntcloudMarketingPartnerCouponRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 优惠券模版id
	TemplateId *string `json:"template_id,omitempty" xml:"template_id,omitempty" require:"true"`
	// 支付宝登录名称
	AlipayLoginName *string `json:"alipay_login_name,omitempty" xml:"alipay_login_name,omitempty" require:"true"`
	// 业务唯一幂等标识，可以是订单号
	BizNo *string `json:"biz_no,omitempty" xml:"biz_no,omitempty" require:"true"`
	// 备注
	Remark *string `json:"remark,omitempty" xml:"remark,omitempty"`
}

func (s SendAntcloudMarketingPartnerCouponRequest) String() string {
	return tea.Prettify(s)
}

func (s SendAntcloudMarketingPartnerCouponRequest) GoString() string {
	return s.String()
}

func (s *SendAntcloudMarketingPartnerCouponRequest) SetAuthToken(v string) *SendAntcloudMarketingPartnerCouponRequest {
	s.AuthToken = &v
	return s
}

func (s *SendAntcloudMarketingPartnerCouponRequest) SetTemplateId(v string) *SendAntcloudMarketingPartnerCouponRequest {
	s.TemplateId = &v
	return s
}

func (s *SendAntcloudMarketingPartnerCouponRequest) SetAlipayLoginName(v string) *SendAntcloudMarketingPartnerCouponRequest {
	s.AlipayLoginName = &v
	return s
}

func (s *SendAntcloudMarketingPartnerCouponRequest) SetBizNo(v string) *SendAntcloudMarketingPartnerCouponRequest {
	s.BizNo = &v
	return s
}

func (s *SendAntcloudMarketingPartnerCouponRequest) SetRemark(v string) *SendAntcloudMarketingPartnerCouponRequest {
	s.Remark = &v
	return s
}

type SendAntcloudMarketingPartnerCouponResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 优惠券id
	CouponId *string `json:"coupon_id,omitempty" xml:"coupon_id,omitempty"`
}

func (s SendAntcloudMarketingPartnerCouponResponse) String() string {
	return tea.Prettify(s)
}

func (s SendAntcloudMarketingPartnerCouponResponse) GoString() string {
	return s.String()
}

func (s *SendAntcloudMarketingPartnerCouponResponse) SetReqMsgId(v string) *SendAntcloudMarketingPartnerCouponResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SendAntcloudMarketingPartnerCouponResponse) SetResultCode(v string) *SendAntcloudMarketingPartnerCouponResponse {
	s.ResultCode = &v
	return s
}

func (s *SendAntcloudMarketingPartnerCouponResponse) SetResultMsg(v string) *SendAntcloudMarketingPartnerCouponResponse {
	s.ResultMsg = &v
	return s
}

func (s *SendAntcloudMarketingPartnerCouponResponse) SetCouponId(v string) *SendAntcloudMarketingPartnerCouponResponse {
	s.CouponId = &v
	return s
}

type QueryAntcloudMarketingPartnerCouponstockRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 券模版id
	TemplateId *string `json:"template_id,omitempty" xml:"template_id,omitempty" require:"true"`
}

func (s QueryAntcloudMarketingPartnerCouponstockRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAntcloudMarketingPartnerCouponstockRequest) GoString() string {
	return s.String()
}

func (s *QueryAntcloudMarketingPartnerCouponstockRequest) SetAuthToken(v string) *QueryAntcloudMarketingPartnerCouponstockRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAntcloudMarketingPartnerCouponstockRequest) SetTemplateId(v string) *QueryAntcloudMarketingPartnerCouponstockRequest {
	s.TemplateId = &v
	return s
}

type QueryAntcloudMarketingPartnerCouponstockResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 模版总量
	TotalQuota *int64 `json:"total_quota,omitempty" xml:"total_quota,omitempty"`
	// 已使用
	ReleasedQuota *int64 `json:"released_quota,omitempty" xml:"released_quota,omitempty"`
	// 可用
	AvailableQuota *int64 `json:"available_quota,omitempty" xml:"available_quota,omitempty"`
}

func (s QueryAntcloudMarketingPartnerCouponstockResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAntcloudMarketingPartnerCouponstockResponse) GoString() string {
	return s.String()
}

func (s *QueryAntcloudMarketingPartnerCouponstockResponse) SetReqMsgId(v string) *QueryAntcloudMarketingPartnerCouponstockResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAntcloudMarketingPartnerCouponstockResponse) SetResultCode(v string) *QueryAntcloudMarketingPartnerCouponstockResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAntcloudMarketingPartnerCouponstockResponse) SetResultMsg(v string) *QueryAntcloudMarketingPartnerCouponstockResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAntcloudMarketingPartnerCouponstockResponse) SetTotalQuota(v int64) *QueryAntcloudMarketingPartnerCouponstockResponse {
	s.TotalQuota = &v
	return s
}

func (s *QueryAntcloudMarketingPartnerCouponstockResponse) SetReleasedQuota(v int64) *QueryAntcloudMarketingPartnerCouponstockResponse {
	s.ReleasedQuota = &v
	return s
}

func (s *QueryAntcloudMarketingPartnerCouponstockResponse) SetAvailableQuota(v int64) *QueryAntcloudMarketingPartnerCouponstockResponse {
	s.AvailableQuota = &v
	return s
}

type QueryAntcloudTradeComboOptionsRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 套餐版本唯一版本号，有值则优先使用
	Vid *string `json:"vid,omitempty" xml:"vid,omitempty" require:"true"`
	// 销售主体（如ZL6、ZL7）
	Ou *string `json:"ou,omitempty" xml:"ou,omitempty"`
	// 购买租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 售卖市场
	MarketType *string `json:"market_type,omitempty" xml:"market_type,omitempty"`
}

func (s QueryAntcloudTradeComboOptionsRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAntcloudTradeComboOptionsRequest) GoString() string {
	return s.String()
}

func (s *QueryAntcloudTradeComboOptionsRequest) SetAuthToken(v string) *QueryAntcloudTradeComboOptionsRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAntcloudTradeComboOptionsRequest) SetVid(v string) *QueryAntcloudTradeComboOptionsRequest {
	s.Vid = &v
	return s
}

func (s *QueryAntcloudTradeComboOptionsRequest) SetOu(v string) *QueryAntcloudTradeComboOptionsRequest {
	s.Ou = &v
	return s
}

func (s *QueryAntcloudTradeComboOptionsRequest) SetTenantId(v string) *QueryAntcloudTradeComboOptionsRequest {
	s.TenantId = &v
	return s
}

func (s *QueryAntcloudTradeComboOptionsRequest) SetMarketType(v string) *QueryAntcloudTradeComboOptionsRequest {
	s.MarketType = &v
	return s
}

type QueryAntcloudTradeComboOptionsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 套餐基本信息
	ComboDto *ComboDTO `json:"combo_dto,omitempty" xml:"combo_dto,omitempty"`
	// 套餐内商品信息列表（仅包含当前 OU 下上架的商品）
	ComboItemDtos []*ComboItemDTO `json:"combo_item_dtos,omitempty" xml:"combo_item_dtos,omitempty" type:"Repeated"`
	// 售卖规则校验是否通过
	RuleCheckSuccess *bool `json:"rule_check_success,omitempty" xml:"rule_check_success,omitempty"`
	// 售卖规则校验失败时的错误码
	RuleCheckErrorCode *string `json:"rule_check_error_code,omitempty" xml:"rule_check_error_code,omitempty"`
	// 该商品当前不可购买：未完成实名认证
	RuleCheckErrorMessage *string `json:"rule_check_error_message,omitempty" xml:"rule_check_error_message,omitempty"`
}

func (s QueryAntcloudTradeComboOptionsResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAntcloudTradeComboOptionsResponse) GoString() string {
	return s.String()
}

func (s *QueryAntcloudTradeComboOptionsResponse) SetReqMsgId(v string) *QueryAntcloudTradeComboOptionsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAntcloudTradeComboOptionsResponse) SetResultCode(v string) *QueryAntcloudTradeComboOptionsResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAntcloudTradeComboOptionsResponse) SetResultMsg(v string) *QueryAntcloudTradeComboOptionsResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAntcloudTradeComboOptionsResponse) SetComboDto(v *ComboDTO) *QueryAntcloudTradeComboOptionsResponse {
	s.ComboDto = v
	return s
}

func (s *QueryAntcloudTradeComboOptionsResponse) SetComboItemDtos(v []*ComboItemDTO) *QueryAntcloudTradeComboOptionsResponse {
	s.ComboItemDtos = v
	return s
}

func (s *QueryAntcloudTradeComboOptionsResponse) SetRuleCheckSuccess(v bool) *QueryAntcloudTradeComboOptionsResponse {
	s.RuleCheckSuccess = &v
	return s
}

func (s *QueryAntcloudTradeComboOptionsResponse) SetRuleCheckErrorCode(v string) *QueryAntcloudTradeComboOptionsResponse {
	s.RuleCheckErrorCode = &v
	return s
}

func (s *QueryAntcloudTradeComboOptionsResponse) SetRuleCheckErrorMessage(v string) *QueryAntcloudTradeComboOptionsResponse {
	s.RuleCheckErrorMessage = &v
	return s
}

type CreatewithoptionsAntcloudTradeComboRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 套餐版本唯一版本号
	ComboVid *string `json:"combo_vid,omitempty" xml:"combo_vid,omitempty" require:"true"`
	// 销售主体（如 ZL6、ZL7）
	Ou *string `json:"ou,omitempty" xml:"ou,omitempty" require:"true"`
	// 购买租户ID
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 用户选择的规格配置列表
	SelectedConfigs []*SelectedConfigItem `json:"selected_configs,omitempty" xml:"selected_configs,omitempty" require:"true" type:"Repeated"`
	// 请求ID，用于幂等
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty" require:"true"`
	// 售卖市场，由中台分配
	SaleMarket *string `json:"sale_market,omitempty" xml:"sale_market,omitempty" require:"true"`
}

func (s CreatewithoptionsAntcloudTradeComboRequest) String() string {
	return tea.Prettify(s)
}

func (s CreatewithoptionsAntcloudTradeComboRequest) GoString() string {
	return s.String()
}

func (s *CreatewithoptionsAntcloudTradeComboRequest) SetAuthToken(v string) *CreatewithoptionsAntcloudTradeComboRequest {
	s.AuthToken = &v
	return s
}

func (s *CreatewithoptionsAntcloudTradeComboRequest) SetComboVid(v string) *CreatewithoptionsAntcloudTradeComboRequest {
	s.ComboVid = &v
	return s
}

func (s *CreatewithoptionsAntcloudTradeComboRequest) SetOu(v string) *CreatewithoptionsAntcloudTradeComboRequest {
	s.Ou = &v
	return s
}

func (s *CreatewithoptionsAntcloudTradeComboRequest) SetTenantId(v string) *CreatewithoptionsAntcloudTradeComboRequest {
	s.TenantId = &v
	return s
}

func (s *CreatewithoptionsAntcloudTradeComboRequest) SetSelectedConfigs(v []*SelectedConfigItem) *CreatewithoptionsAntcloudTradeComboRequest {
	s.SelectedConfigs = v
	return s
}

func (s *CreatewithoptionsAntcloudTradeComboRequest) SetRequestId(v string) *CreatewithoptionsAntcloudTradeComboRequest {
	s.RequestId = &v
	return s
}

func (s *CreatewithoptionsAntcloudTradeComboRequest) SetSaleMarket(v string) *CreatewithoptionsAntcloudTradeComboRequest {
	s.SaleMarket = &v
	return s
}

type CreatewithoptionsAntcloudTradeComboResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 套餐订单ID
	ComboOrderId *string `json:"combo_order_id,omitempty" xml:"combo_order_id,omitempty"`
	// 订单状态，创建成功为 WAIT_CONFIRM（待确认）
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
}

func (s CreatewithoptionsAntcloudTradeComboResponse) String() string {
	return tea.Prettify(s)
}

func (s CreatewithoptionsAntcloudTradeComboResponse) GoString() string {
	return s.String()
}

func (s *CreatewithoptionsAntcloudTradeComboResponse) SetReqMsgId(v string) *CreatewithoptionsAntcloudTradeComboResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreatewithoptionsAntcloudTradeComboResponse) SetResultCode(v string) *CreatewithoptionsAntcloudTradeComboResponse {
	s.ResultCode = &v
	return s
}

func (s *CreatewithoptionsAntcloudTradeComboResponse) SetResultMsg(v string) *CreatewithoptionsAntcloudTradeComboResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreatewithoptionsAntcloudTradeComboResponse) SetComboOrderId(v string) *CreatewithoptionsAntcloudTradeComboResponse {
	s.ComboOrderId = &v
	return s
}

func (s *CreatewithoptionsAntcloudTradeComboResponse) SetStatus(v string) *CreatewithoptionsAntcloudTradeComboResponse {
	s.Status = &v
	return s
}

type CancelAntcloudTradeComboRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 套餐订单ID
	ComboOrderId *string `json:"combo_order_id,omitempty" xml:"combo_order_id,omitempty" require:"true"`
	// 租户ID，用于校验订单归属和操作权限
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
}

func (s CancelAntcloudTradeComboRequest) String() string {
	return tea.Prettify(s)
}

func (s CancelAntcloudTradeComboRequest) GoString() string {
	return s.String()
}

func (s *CancelAntcloudTradeComboRequest) SetAuthToken(v string) *CancelAntcloudTradeComboRequest {
	s.AuthToken = &v
	return s
}

func (s *CancelAntcloudTradeComboRequest) SetComboOrderId(v string) *CancelAntcloudTradeComboRequest {
	s.ComboOrderId = &v
	return s
}

func (s *CancelAntcloudTradeComboRequest) SetTenantId(v string) *CancelAntcloudTradeComboRequest {
	s.TenantId = &v
	return s
}

type CancelAntcloudTradeComboResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 取消操作结果。true 表示取消成功
	Result *bool `json:"result,omitempty" xml:"result,omitempty"`
}

func (s CancelAntcloudTradeComboResponse) String() string {
	return tea.Prettify(s)
}

func (s CancelAntcloudTradeComboResponse) GoString() string {
	return s.String()
}

func (s *CancelAntcloudTradeComboResponse) SetReqMsgId(v string) *CancelAntcloudTradeComboResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CancelAntcloudTradeComboResponse) SetResultCode(v string) *CancelAntcloudTradeComboResponse {
	s.ResultCode = &v
	return s
}

func (s *CancelAntcloudTradeComboResponse) SetResultMsg(v string) *CancelAntcloudTradeComboResponse {
	s.ResultMsg = &v
	return s
}

func (s *CancelAntcloudTradeComboResponse) SetResult(v bool) *CancelAntcloudTradeComboResponse {
	s.Result = &v
	return s
}

type CreateAntcloudTradeComboOptionsRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 套餐版本唯一版本号
	ComboVid *string `json:"combo_vid,omitempty" xml:"combo_vid,omitempty" require:"true"`
	// 销售主体（如 ZL6、ZL7）
	Ou *string `json:"ou,omitempty" xml:"ou,omitempty" require:"true"`
	// 购买租户ID
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 用户选择的规格配置列表
	SelectedConfigs []*SelectedConfigItem `json:"selected_configs,omitempty" xml:"selected_configs,omitempty" require:"true" type:"Repeated"`
	// 请求ID，用于幂等
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty" require:"true"`
	// 售卖市场，由中台分配
	SaleMarket *string `json:"sale_market,omitempty" xml:"sale_market,omitempty" require:"true"`
}

func (s CreateAntcloudTradeComboOptionsRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateAntcloudTradeComboOptionsRequest) GoString() string {
	return s.String()
}

func (s *CreateAntcloudTradeComboOptionsRequest) SetAuthToken(v string) *CreateAntcloudTradeComboOptionsRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateAntcloudTradeComboOptionsRequest) SetComboVid(v string) *CreateAntcloudTradeComboOptionsRequest {
	s.ComboVid = &v
	return s
}

func (s *CreateAntcloudTradeComboOptionsRequest) SetOu(v string) *CreateAntcloudTradeComboOptionsRequest {
	s.Ou = &v
	return s
}

func (s *CreateAntcloudTradeComboOptionsRequest) SetTenantId(v string) *CreateAntcloudTradeComboOptionsRequest {
	s.TenantId = &v
	return s
}

func (s *CreateAntcloudTradeComboOptionsRequest) SetSelectedConfigs(v []*SelectedConfigItem) *CreateAntcloudTradeComboOptionsRequest {
	s.SelectedConfigs = v
	return s
}

func (s *CreateAntcloudTradeComboOptionsRequest) SetRequestId(v string) *CreateAntcloudTradeComboOptionsRequest {
	s.RequestId = &v
	return s
}

func (s *CreateAntcloudTradeComboOptionsRequest) SetSaleMarket(v string) *CreateAntcloudTradeComboOptionsRequest {
	s.SaleMarket = &v
	return s
}

type CreateAntcloudTradeComboOptionsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 套餐订单ID
	ComboOrderId *string `json:"combo_order_id,omitempty" xml:"combo_order_id,omitempty"`
	// 订单状态，创建成功为 WAIT_CONFIRM（待确认）
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
}

func (s CreateAntcloudTradeComboOptionsResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateAntcloudTradeComboOptionsResponse) GoString() string {
	return s.String()
}

func (s *CreateAntcloudTradeComboOptionsResponse) SetReqMsgId(v string) *CreateAntcloudTradeComboOptionsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateAntcloudTradeComboOptionsResponse) SetResultCode(v string) *CreateAntcloudTradeComboOptionsResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateAntcloudTradeComboOptionsResponse) SetResultMsg(v string) *CreateAntcloudTradeComboOptionsResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateAntcloudTradeComboOptionsResponse) SetComboOrderId(v string) *CreateAntcloudTradeComboOptionsResponse {
	s.ComboOrderId = &v
	return s
}

func (s *CreateAntcloudTradeComboOptionsResponse) SetStatus(v string) *CreateAntcloudTradeComboOptionsResponse {
	s.Status = &v
	return s
}

type QueryAntcloudPccCommodityPriceRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 模型名称，精确匹配
	Model *string `json:"model,omitempty" xml:"model,omitempty"`
	// 供应商
	Provider *string `json:"provider,omitempty" xml:"provider,omitempty"`
	// 收费项（定价对象）
	ChargeItem *string `json:"charge_item,omitempty" xml:"charge_item,omitempty"`
	// 定价状态
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 页码
	PageNum *int64 `json:"page_num,omitempty" xml:"page_num,omitempty" require:"true"`
	// 每页数据量
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
	// 商品code
	CommodityCode *string `json:"commodity_code,omitempty" xml:"commodity_code,omitempty" require:"true"`
}

func (s QueryAntcloudPccCommodityPriceRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAntcloudPccCommodityPriceRequest) GoString() string {
	return s.String()
}

func (s *QueryAntcloudPccCommodityPriceRequest) SetAuthToken(v string) *QueryAntcloudPccCommodityPriceRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAntcloudPccCommodityPriceRequest) SetModel(v string) *QueryAntcloudPccCommodityPriceRequest {
	s.Model = &v
	return s
}

func (s *QueryAntcloudPccCommodityPriceRequest) SetProvider(v string) *QueryAntcloudPccCommodityPriceRequest {
	s.Provider = &v
	return s
}

func (s *QueryAntcloudPccCommodityPriceRequest) SetChargeItem(v string) *QueryAntcloudPccCommodityPriceRequest {
	s.ChargeItem = &v
	return s
}

func (s *QueryAntcloudPccCommodityPriceRequest) SetStatus(v string) *QueryAntcloudPccCommodityPriceRequest {
	s.Status = &v
	return s
}

func (s *QueryAntcloudPccCommodityPriceRequest) SetPageNum(v int64) *QueryAntcloudPccCommodityPriceRequest {
	s.PageNum = &v
	return s
}

func (s *QueryAntcloudPccCommodityPriceRequest) SetPageSize(v int64) *QueryAntcloudPccCommodityPriceRequest {
	s.PageSize = &v
	return s
}

func (s *QueryAntcloudPccCommodityPriceRequest) SetCommodityCode(v string) *QueryAntcloudPccCommodityPriceRequest {
	s.CommodityCode = &v
	return s
}

type QueryAntcloudPccCommodityPriceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 总数
	Total *int64 `json:"total,omitempty" xml:"total,omitempty"`
	// 页码
	PageNum *int64 `json:"page_num,omitempty" xml:"page_num,omitempty"`
	// 页大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// 模型定价
	Items []*ModelPriceItemDTO `json:"items,omitempty" xml:"items,omitempty" type:"Repeated"`
}

func (s QueryAntcloudPccCommodityPriceResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAntcloudPccCommodityPriceResponse) GoString() string {
	return s.String()
}

func (s *QueryAntcloudPccCommodityPriceResponse) SetReqMsgId(v string) *QueryAntcloudPccCommodityPriceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAntcloudPccCommodityPriceResponse) SetResultCode(v string) *QueryAntcloudPccCommodityPriceResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAntcloudPccCommodityPriceResponse) SetResultMsg(v string) *QueryAntcloudPccCommodityPriceResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAntcloudPccCommodityPriceResponse) SetTotal(v int64) *QueryAntcloudPccCommodityPriceResponse {
	s.Total = &v
	return s
}

func (s *QueryAntcloudPccCommodityPriceResponse) SetPageNum(v int64) *QueryAntcloudPccCommodityPriceResponse {
	s.PageNum = &v
	return s
}

func (s *QueryAntcloudPccCommodityPriceResponse) SetPageSize(v int64) *QueryAntcloudPccCommodityPriceResponse {
	s.PageSize = &v
	return s
}

func (s *QueryAntcloudPccCommodityPriceResponse) SetItems(v []*ModelPriceItemDTO) *QueryAntcloudPccCommodityPriceResponse {
	s.Items = v
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
				"sdk_version":      tea.String("1.0.9"),
				"_prod_code":       tea.String("DD"),
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

// Description:
//
// Description: 测试使用
//
// Summary: 测试使用
func (client *Client) QueryDemoTestJltest(request *QueryDemoTestJltestRequest) (_result *QueryDemoTestJltestResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDemoTestJltestResponse{}
	_body, _err := client.QueryDemoTestJltestEx(request, headers, runtime)
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
func (client *Client) QueryDemoTestJltestEx(request *QueryDemoTestJltestRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDemoTestJltestResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDemoTestJltestResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.test.jltest.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 创建订单
//
// Summary: 创建订单
func (client *Client) CreateDemoBusinessOrderx(request *CreateDemoBusinessOrderxRequest) (_result *CreateDemoBusinessOrderxResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateDemoBusinessOrderxResponse{}
	_body, _err := client.CreateDemoBusinessOrderxEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 创建订单
//
// Summary: 创建订单
func (client *Client) CreateDemoBusinessOrderxEx(request *CreateDemoBusinessOrderxRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateDemoBusinessOrderxResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateDemoBusinessOrderxResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.business.orderx.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 创建订单
//
// Summary: 创建订单
func (client *Client) CreateDemoBusinessOrderz(request *CreateDemoBusinessOrderzRequest) (_result *CreateDemoBusinessOrderzResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateDemoBusinessOrderzResponse{}
	_body, _err := client.CreateDemoBusinessOrderzEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 创建订单
//
// Summary: 创建订单
func (client *Client) CreateDemoBusinessOrderzEx(request *CreateDemoBusinessOrderzRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateDemoBusinessOrderzResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateDemoBusinessOrderzResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.business.orderz.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 创建订单
//
// Summary: 创建订单
func (client *Client) CreateDemoBusinessOrdery(request *CreateDemoBusinessOrderyRequest) (_result *CreateDemoBusinessOrderyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateDemoBusinessOrderyResponse{}
	_body, _err := client.CreateDemoBusinessOrderyEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 创建订单
//
// Summary: 创建订单
func (client *Client) CreateDemoBusinessOrderyEx(request *CreateDemoBusinessOrderyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateDemoBusinessOrderyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateDemoBusinessOrderyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.business.ordery.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 创建订单N
//
// Summary: 创建订单N
func (client *Client) CreateDemoBusinessOrdern(request *CreateDemoBusinessOrdernRequest) (_result *CreateDemoBusinessOrdernResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateDemoBusinessOrdernResponse{}
	_body, _err := client.CreateDemoBusinessOrdernEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 创建订单N
//
// Summary: 创建订单N
func (client *Client) CreateDemoBusinessOrdernEx(request *CreateDemoBusinessOrdernRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateDemoBusinessOrdernResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateDemoBusinessOrdernResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.business.ordern.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 创建订单
//
// Summary: 创建订单
func (client *Client) CreateDemoBusinessOrderaa(request *CreateDemoBusinessOrderaaRequest) (_result *CreateDemoBusinessOrderaaResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateDemoBusinessOrderaaResponse{}
	_body, _err := client.CreateDemoBusinessOrderaaEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 创建订单
//
// Summary: 创建订单
func (client *Client) CreateDemoBusinessOrderaaEx(request *CreateDemoBusinessOrderaaRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateDemoBusinessOrderaaResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateDemoBusinessOrderaaResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.business.orderaa.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 创建订单
//
// Summary: 创建订单
func (client *Client) CreateDemoBusinessOrderq(request *CreateDemoBusinessOrderqRequest) (_result *CreateDemoBusinessOrderqResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateDemoBusinessOrderqResponse{}
	_body, _err := client.CreateDemoBusinessOrderqEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 创建订单
//
// Summary: 创建订单
func (client *Client) CreateDemoBusinessOrderqEx(request *CreateDemoBusinessOrderqRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateDemoBusinessOrderqResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateDemoBusinessOrderqResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.business.orderq.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 创建订单
//
// Summary: 创建订单
func (client *Client) CreateDemoBusinessOrderb(request *CreateDemoBusinessOrderbRequest) (_result *CreateDemoBusinessOrderbResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateDemoBusinessOrderbResponse{}
	_body, _err := client.CreateDemoBusinessOrderbEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 创建订单
//
// Summary: 创建订单
func (client *Client) CreateDemoBusinessOrderbEx(request *CreateDemoBusinessOrderbRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateDemoBusinessOrderbResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateDemoBusinessOrderbResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.business.orderb.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) TestDemoTestApi(request *TestDemoTestApiRequest) (_result *TestDemoTestApiResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &TestDemoTestApiResponse{}
	_body, _err := client.TestDemoTestApiEx(request, headers, runtime)
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
func (client *Client) TestDemoTestApiEx(request *TestDemoTestApiRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *TestDemoTestApiResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &TestDemoTestApiResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.test.api.test"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 创建订单
//
// Summary: 创建订单
func (client *Client) CreateDemoBusinessOrderc(request *CreateDemoBusinessOrdercRequest) (_result *CreateDemoBusinessOrdercResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateDemoBusinessOrdercResponse{}
	_body, _err := client.CreateDemoBusinessOrdercEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 创建订单
//
// Summary: 创建订单
func (client *Client) CreateDemoBusinessOrdercEx(request *CreateDemoBusinessOrdercRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateDemoBusinessOrdercResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateDemoBusinessOrdercResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.business.orderc.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 创建订单
//
// Summary: 创建订单
func (client *Client) CreateDemoBusinessOrderd(request *CreateDemoBusinessOrderdRequest) (_result *CreateDemoBusinessOrderdResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateDemoBusinessOrderdResponse{}
	_body, _err := client.CreateDemoBusinessOrderdEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 创建订单
//
// Summary: 创建订单
func (client *Client) CreateDemoBusinessOrderdEx(request *CreateDemoBusinessOrderdRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateDemoBusinessOrderdResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateDemoBusinessOrderdResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.business.orderd.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 查询用户所属项目列表
//
// Summary: 查询用户所属项目列表
func (client *Client) QueryAntcloudAcmUserProject(request *QueryAntcloudAcmUserProjectRequest) (_result *QueryAntcloudAcmUserProjectResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAntcloudAcmUserProjectResponse{}
	_body, _err := client.QueryAntcloudAcmUserProjectEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 查询用户所属项目列表
//
// Summary: 查询用户所属项目列表
func (client *Client) QueryAntcloudAcmUserProjectEx(request *QueryAntcloudAcmUserProjectRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAntcloudAcmUserProjectResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAntcloudAcmUserProjectResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.acm.user.project.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 线上对比线下计量计费资源包配置接口
//
// Summary: 线上对比线下计量计费资源包配置接口
func (client *Client) CheckAntcloudBillingConfigPre(request *CheckAntcloudBillingConfigPreRequest) (_result *CheckAntcloudBillingConfigPreResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CheckAntcloudBillingConfigPreResponse{}
	_body, _err := client.CheckAntcloudBillingConfigPreEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 线上对比线下计量计费资源包配置接口
//
// Summary: 线上对比线下计量计费资源包配置接口
func (client *Client) CheckAntcloudBillingConfigPreEx(request *CheckAntcloudBillingConfigPreRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CheckAntcloudBillingConfigPreResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CheckAntcloudBillingConfigPreResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.billing.config.pre.check"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 外部发券
//
// Summary: 外部发券
func (client *Client) SendAntcloudMarketingPartnerCoupon(request *SendAntcloudMarketingPartnerCouponRequest) (_result *SendAntcloudMarketingPartnerCouponResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SendAntcloudMarketingPartnerCouponResponse{}
	_body, _err := client.SendAntcloudMarketingPartnerCouponEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 外部发券
//
// Summary: 外部发券
func (client *Client) SendAntcloudMarketingPartnerCouponEx(request *SendAntcloudMarketingPartnerCouponRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SendAntcloudMarketingPartnerCouponResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SendAntcloudMarketingPartnerCouponResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.marketing.partner.coupon.send"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 外部客户查询券余量
//
// Summary: 外部客户查询券余量
func (client *Client) QueryAntcloudMarketingPartnerCouponstock(request *QueryAntcloudMarketingPartnerCouponstockRequest) (_result *QueryAntcloudMarketingPartnerCouponstockResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAntcloudMarketingPartnerCouponstockResponse{}
	_body, _err := client.QueryAntcloudMarketingPartnerCouponstockEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 外部客户查询券余量
//
// Summary: 外部客户查询券余量
func (client *Client) QueryAntcloudMarketingPartnerCouponstockEx(request *QueryAntcloudMarketingPartnerCouponstockRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAntcloudMarketingPartnerCouponstockResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAntcloudMarketingPartnerCouponstockResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.marketing.partner.couponstock.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 查询套餐内各商品的可选规格列表，返回套餐基本信息及每个商品的可选规格、售卖规则校验结果
//
// Summary: 查询套餐内各商品的可选规格列表，返回套餐基本信息及每个商品的可选规格、售卖规则校验结果
func (client *Client) QueryAntcloudTradeComboOptions(request *QueryAntcloudTradeComboOptionsRequest) (_result *QueryAntcloudTradeComboOptionsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAntcloudTradeComboOptionsResponse{}
	_body, _err := client.QueryAntcloudTradeComboOptionsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 查询套餐内各商品的可选规格列表，返回套餐基本信息及每个商品的可选规格、售卖规则校验结果
//
// Summary: 查询套餐内各商品的可选规格列表，返回套餐基本信息及每个商品的可选规格、售卖规则校验结果
func (client *Client) QueryAntcloudTradeComboOptionsEx(request *QueryAntcloudTradeComboOptionsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAntcloudTradeComboOptionsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAntcloudTradeComboOptionsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.trade.combo.options.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 户选择完套餐规格后调用，按自选规格创建套餐订单
//
// Summary: 户选择完套餐规格后调用，按自选规格创建套餐订单
func (client *Client) CreatewithoptionsAntcloudTradeCombo(request *CreatewithoptionsAntcloudTradeComboRequest) (_result *CreatewithoptionsAntcloudTradeComboResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreatewithoptionsAntcloudTradeComboResponse{}
	_body, _err := client.CreatewithoptionsAntcloudTradeComboEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 户选择完套餐规格后调用，按自选规格创建套餐订单
//
// Summary: 户选择完套餐规格后调用，按自选规格创建套餐订单
func (client *Client) CreatewithoptionsAntcloudTradeComboEx(request *CreatewithoptionsAntcloudTradeComboRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreatewithoptionsAntcloudTradeComboResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreatewithoptionsAntcloudTradeComboResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.trade.combo.createwithoptions"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 取消套餐订单，仅当订单处于 INIT（初始化）或 WAIT_CONFIRM（待确认）状态时允许取消
//
// Summary: 取消套餐订单，仅当订单处于 INIT（初始化）或 WAIT_CONFIRM（待确认）状态时允许取消
func (client *Client) CancelAntcloudTradeCombo(request *CancelAntcloudTradeComboRequest) (_result *CancelAntcloudTradeComboResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CancelAntcloudTradeComboResponse{}
	_body, _err := client.CancelAntcloudTradeComboEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 取消套餐订单，仅当订单处于 INIT（初始化）或 WAIT_CONFIRM（待确认）状态时允许取消
//
// Summary: 取消套餐订单，仅当订单处于 INIT（初始化）或 WAIT_CONFIRM（待确认）状态时允许取消
func (client *Client) CancelAntcloudTradeComboEx(request *CancelAntcloudTradeComboRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CancelAntcloudTradeComboResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CancelAntcloudTradeComboResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.trade.combo.cancel"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 户选择完套餐规格后调用，按自选规格创建套餐订单
//
// Summary: 户选择完套餐规格后调用，按自选规格创建套餐订单
func (client *Client) CreateAntcloudTradeComboOptions(request *CreateAntcloudTradeComboOptionsRequest) (_result *CreateAntcloudTradeComboOptionsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateAntcloudTradeComboOptionsResponse{}
	_body, _err := client.CreateAntcloudTradeComboOptionsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 户选择完套餐规格后调用，按自选规格创建套餐订单
//
// Summary: 户选择完套餐规格后调用，按自选规格创建套餐订单
func (client *Client) CreateAntcloudTradeComboOptionsEx(request *CreateAntcloudTradeComboOptionsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateAntcloudTradeComboOptionsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateAntcloudTradeComboOptionsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.trade.combo.options.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 商品定价查询
//
// Summary: 商品定价查询
func (client *Client) QueryAntcloudPccCommodityPrice(request *QueryAntcloudPccCommodityPriceRequest) (_result *QueryAntcloudPccCommodityPriceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAntcloudPccCommodityPriceResponse{}
	_body, _err := client.QueryAntcloudPccCommodityPriceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 商品定价查询
//
// Summary: 商品定价查询
func (client *Client) QueryAntcloudPccCommodityPriceEx(request *QueryAntcloudPccCommodityPriceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAntcloudPccCommodityPriceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAntcloudPccCommodityPriceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.pcc.commodity.price.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
