// This file is auto-generated, don't edit it. Thanks.
package client

import (
	rpcutil "github.com/alibabacloud-go/tea-rpc-utils/service"
	util "github.com/alibabacloud-go/tea-utils/v2/service"
	"github.com/alibabacloud-go/tea/tea"
	antchainutil "github.com/antchain-openapi-sdk-go/antchain-util/service"
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

// 1
type TestDemo struct {
	// 1
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 1
	Number *int64 `json:"number,omitempty" xml:"number,omitempty"`
}

func (s TestDemo) String() string {
	return tea.Prettify(s)
}

func (s TestDemo) GoString() string {
	return s.String()
}

func (s *TestDemo) SetName(v string) *TestDemo {
	s.Name = &v
	return s
}

func (s *TestDemo) SetNumber(v int64) *TestDemo {
	s.Number = &v
	return s
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

// 返回结果测试类
type ResultTest struct {
	// 姓名
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

// InitPack
type InitPack struct {
	// 2022-11-07 14:48
	Time *string `json:"time,omitempty" xml:"time,omitempty"`
	// wanyi
	Operator *string `json:"operator,omitempty" xml:"operator,omitempty"`
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

// 测试实体
type SumBean struct {
	// 元素名称
	EName *string `json:"e_name,omitempty" xml:"e_name,omitempty"`
	// 数量
	Num *int64 `json:"num,omitempty" xml:"num,omitempty"`
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

type ImportTwiceThreeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 超时间
	Timeout *string `json:"timeout,omitempty" xml:"timeout,omitempty" require:"true"`
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
				"sdk_version":      tea.String("1.3.39"),
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

/**
 * Description: 这是测试的
 * Summary: 这是测试的
 */
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

/**
 * Description: 这是测试的
 * Summary: 这是测试的
 */
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

/**
 * Description: 自动化测试创建test，请勿修改、删除
 * Summary: 自动化测试创建test，请勿修改、删除
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
 * Summary: 自动化测试创建test，请勿修改、删除
 */
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

/**
 * Description: 自动化测试创建test，请勿修改、删除
 * Summary: 自动化测试创建test，请勿修改、删除
 */
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

/**
 * Description: 自动化测试创建test，请勿修改、删除
 * Summary: 自动化测试创建test，请勿修改、删除
 */
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

/**
 * Description: 自动化测试创建test，请勿修改、删除
 * Summary: 自动化测试创建test，请勿修改、删除
 */
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

/**
 * Description: 自动化测试创建test，请勿修改、删除
 * Summary: 自动化测试创建test，请勿修改、删除
 */
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

/**
 * Description: 个人工作台测试使用
 * Summary: 个人工作台测试使用
 */
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

/**
 * Description: 个人工作台测试使用
 * Summary: 个人工作台测试使用
 */
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

/**
 * Description: 个人工作台测试
 * Summary: 个人工作台测试
 */
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

/**
 * Description: 个人工作台测试
 * Summary: 个人工作台测试
 */
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

/**
 * Description: 个人工作台二期预发测试
 * Summary: 个人工作台二期预发测试
 */
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

/**
 * Description: 个人工作台二期预发测试
 * Summary: 个人工作台二期预发测试
 */
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

/**
 * Description: 个人工作台测试使用
 * Summary: 个人工作台测试使用
 */
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

/**
 * Description: 个人工作台测试使用
 * Summary: 个人工作台测试使用
 */
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

/**
 * Description: 个人工作台测试使用
 * Summary: 个人工作台测试使用
 */
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

/**
 * Description: 个人工作台测试使用
 * Summary: 个人工作台测试使用
 */
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
