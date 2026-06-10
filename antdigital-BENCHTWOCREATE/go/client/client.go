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

// 1
type TestDemo struct {
	// 1
	// example:
	//
	// 张三
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 1
	// example:
	//
	// 23
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

type ImportAntchainDemosdkCreateThreeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 3000
	Timeout *string `json:"timeout,omitempty" xml:"timeout,omitempty" require:"true"`
}

func (s ImportAntchainDemosdkCreateThreeRequest) String() string {
	return tea.Prettify(s)
}

func (s ImportAntchainDemosdkCreateThreeRequest) GoString() string {
	return s.String()
}

func (s *ImportAntchainDemosdkCreateThreeRequest) SetAuthToken(v string) *ImportAntchainDemosdkCreateThreeRequest {
	s.AuthToken = &v
	return s
}

func (s *ImportAntchainDemosdkCreateThreeRequest) SetProductInstanceId(v string) *ImportAntchainDemosdkCreateThreeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ImportAntchainDemosdkCreateThreeRequest) SetTimeout(v string) *ImportAntchainDemosdkCreateThreeRequest {
	s.Timeout = &v
	return s
}

type ImportAntchainDemosdkCreateThreeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// SUCCESS le
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
	// OK
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
}

func (s ImportAntchainDemosdkCreateThreeResponse) String() string {
	return tea.Prettify(s)
}

func (s ImportAntchainDemosdkCreateThreeResponse) GoString() string {
	return s.String()
}

func (s *ImportAntchainDemosdkCreateThreeResponse) SetReqMsgId(v string) *ImportAntchainDemosdkCreateThreeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ImportAntchainDemosdkCreateThreeResponse) SetResultCode(v string) *ImportAntchainDemosdkCreateThreeResponse {
	s.ResultCode = &v
	return s
}

func (s *ImportAntchainDemosdkCreateThreeResponse) SetResultMsg(v string) *ImportAntchainDemosdkCreateThreeResponse {
	s.ResultMsg = &v
	return s
}

func (s *ImportAntchainDemosdkCreateThreeResponse) SetMsg(v string) *ImportAntchainDemosdkCreateThreeResponse {
	s.Msg = &v
	return s
}

func (s *ImportAntchainDemosdkCreateThreeResponse) SetStatus(v string) *ImportAntchainDemosdkCreateThreeResponse {
	s.Status = &v
	return s
}

type OneBenchTestCreateRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 3000
	Timeout *string `json:"timeout,omitempty" xml:"timeout,omitempty" require:"true"`
}

func (s OneBenchTestCreateRequest) String() string {
	return tea.Prettify(s)
}

func (s OneBenchTestCreateRequest) GoString() string {
	return s.String()
}

func (s *OneBenchTestCreateRequest) SetAuthToken(v string) *OneBenchTestCreateRequest {
	s.AuthToken = &v
	return s
}

func (s *OneBenchTestCreateRequest) SetProductInstanceId(v string) *OneBenchTestCreateRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *OneBenchTestCreateRequest) SetTimeout(v string) *OneBenchTestCreateRequest {
	s.Timeout = &v
	return s
}

type OneBenchTestCreateResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// SUCCESS le
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
	// OK
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
}

func (s OneBenchTestCreateResponse) String() string {
	return tea.Prettify(s)
}

func (s OneBenchTestCreateResponse) GoString() string {
	return s.String()
}

func (s *OneBenchTestCreateResponse) SetReqMsgId(v string) *OneBenchTestCreateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *OneBenchTestCreateResponse) SetResultCode(v string) *OneBenchTestCreateResponse {
	s.ResultCode = &v
	return s
}

func (s *OneBenchTestCreateResponse) SetResultMsg(v string) *OneBenchTestCreateResponse {
	s.ResultMsg = &v
	return s
}

func (s *OneBenchTestCreateResponse) SetMsg(v string) *OneBenchTestCreateResponse {
	s.Msg = &v
	return s
}

func (s *OneBenchTestCreateResponse) SetStatus(v string) *OneBenchTestCreateResponse {
	s.Status = &v
	return s
}

type TwoBenchTestCreateRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 超时时间
	Timeout *string `json:"timeout,omitempty" xml:"timeout,omitempty" require:"true"`
}

func (s TwoBenchTestCreateRequest) String() string {
	return tea.Prettify(s)
}

func (s TwoBenchTestCreateRequest) GoString() string {
	return s.String()
}

func (s *TwoBenchTestCreateRequest) SetAuthToken(v string) *TwoBenchTestCreateRequest {
	s.AuthToken = &v
	return s
}

func (s *TwoBenchTestCreateRequest) SetProductInstanceId(v string) *TwoBenchTestCreateRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *TwoBenchTestCreateRequest) SetTimeout(v string) *TwoBenchTestCreateRequest {
	s.Timeout = &v
	return s
}

type TwoBenchTestCreateResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// OK
	//
	// OK
	//
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// SUCCESS le
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
}

func (s TwoBenchTestCreateResponse) String() string {
	return tea.Prettify(s)
}

func (s TwoBenchTestCreateResponse) GoString() string {
	return s.String()
}

func (s *TwoBenchTestCreateResponse) SetReqMsgId(v string) *TwoBenchTestCreateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *TwoBenchTestCreateResponse) SetResultCode(v string) *TwoBenchTestCreateResponse {
	s.ResultCode = &v
	return s
}

func (s *TwoBenchTestCreateResponse) SetResultMsg(v string) *TwoBenchTestCreateResponse {
	s.ResultMsg = &v
	return s
}

func (s *TwoBenchTestCreateResponse) SetStatus(v string) *TwoBenchTestCreateResponse {
	s.Status = &v
	return s
}

func (s *TwoBenchTestCreateResponse) SetMsg(v string) *TwoBenchTestCreateResponse {
	s.Msg = &v
	return s
}

type ThreeBenchTestCreateRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 3000
	Timeout *string `json:"timeout,omitempty" xml:"timeout,omitempty" require:"true"`
}

func (s ThreeBenchTestCreateRequest) String() string {
	return tea.Prettify(s)
}

func (s ThreeBenchTestCreateRequest) GoString() string {
	return s.String()
}

func (s *ThreeBenchTestCreateRequest) SetAuthToken(v string) *ThreeBenchTestCreateRequest {
	s.AuthToken = &v
	return s
}

func (s *ThreeBenchTestCreateRequest) SetProductInstanceId(v string) *ThreeBenchTestCreateRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ThreeBenchTestCreateRequest) SetTimeout(v string) *ThreeBenchTestCreateRequest {
	s.Timeout = &v
	return s
}

type ThreeBenchTestCreateResponse struct {
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

func (s ThreeBenchTestCreateResponse) String() string {
	return tea.Prettify(s)
}

func (s ThreeBenchTestCreateResponse) GoString() string {
	return s.String()
}

func (s *ThreeBenchTestCreateResponse) SetReqMsgId(v string) *ThreeBenchTestCreateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ThreeBenchTestCreateResponse) SetResultCode(v string) *ThreeBenchTestCreateResponse {
	s.ResultCode = &v
	return s
}

func (s *ThreeBenchTestCreateResponse) SetResultMsg(v string) *ThreeBenchTestCreateResponse {
	s.ResultMsg = &v
	return s
}

func (s *ThreeBenchTestCreateResponse) SetStatus(v string) *ThreeBenchTestCreateResponse {
	s.Status = &v
	return s
}

func (s *ThreeBenchTestCreateResponse) SetMsg(v string) *ThreeBenchTestCreateResponse {
	s.Msg = &v
	return s
}

type FourBenchTestCreateRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 3000
	Timeout *string `json:"timeout,omitempty" xml:"timeout,omitempty" require:"true"`
}

func (s FourBenchTestCreateRequest) String() string {
	return tea.Prettify(s)
}

func (s FourBenchTestCreateRequest) GoString() string {
	return s.String()
}

func (s *FourBenchTestCreateRequest) SetAuthToken(v string) *FourBenchTestCreateRequest {
	s.AuthToken = &v
	return s
}

func (s *FourBenchTestCreateRequest) SetProductInstanceId(v string) *FourBenchTestCreateRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *FourBenchTestCreateRequest) SetTimeout(v string) *FourBenchTestCreateRequest {
	s.Timeout = &v
	return s
}

type FourBenchTestCreateResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// ok
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// SUCCESS le
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
}

func (s FourBenchTestCreateResponse) String() string {
	return tea.Prettify(s)
}

func (s FourBenchTestCreateResponse) GoString() string {
	return s.String()
}

func (s *FourBenchTestCreateResponse) SetReqMsgId(v string) *FourBenchTestCreateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *FourBenchTestCreateResponse) SetResultCode(v string) *FourBenchTestCreateResponse {
	s.ResultCode = &v
	return s
}

func (s *FourBenchTestCreateResponse) SetResultMsg(v string) *FourBenchTestCreateResponse {
	s.ResultMsg = &v
	return s
}

func (s *FourBenchTestCreateResponse) SetStatus(v string) *FourBenchTestCreateResponse {
	s.Status = &v
	return s
}

func (s *FourBenchTestCreateResponse) SetMsg(v string) *FourBenchTestCreateResponse {
	s.Msg = &v
	return s
}

type FiveBenchTestCreateRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 3000
	Timeout *string `json:"timeout,omitempty" xml:"timeout,omitempty" require:"true"`
}

func (s FiveBenchTestCreateRequest) String() string {
	return tea.Prettify(s)
}

func (s FiveBenchTestCreateRequest) GoString() string {
	return s.String()
}

func (s *FiveBenchTestCreateRequest) SetAuthToken(v string) *FiveBenchTestCreateRequest {
	s.AuthToken = &v
	return s
}

func (s *FiveBenchTestCreateRequest) SetProductInstanceId(v string) *FiveBenchTestCreateRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *FiveBenchTestCreateRequest) SetTimeout(v string) *FiveBenchTestCreateRequest {
	s.Timeout = &v
	return s
}

type FiveBenchTestCreateResponse struct {
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

func (s FiveBenchTestCreateResponse) String() string {
	return tea.Prettify(s)
}

func (s FiveBenchTestCreateResponse) GoString() string {
	return s.String()
}

func (s *FiveBenchTestCreateResponse) SetReqMsgId(v string) *FiveBenchTestCreateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *FiveBenchTestCreateResponse) SetResultCode(v string) *FiveBenchTestCreateResponse {
	s.ResultCode = &v
	return s
}

func (s *FiveBenchTestCreateResponse) SetResultMsg(v string) *FiveBenchTestCreateResponse {
	s.ResultMsg = &v
	return s
}

func (s *FiveBenchTestCreateResponse) SetStatus(v string) *FiveBenchTestCreateResponse {
	s.Status = &v
	return s
}

func (s *FiveBenchTestCreateResponse) SetMsg(v string) *FiveBenchTestCreateResponse {
	s.Msg = &v
	return s
}

type SixBenchTestCreateRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 3000
	Timeout *string `json:"timeout,omitempty" xml:"timeout,omitempty" require:"true"`
}

func (s SixBenchTestCreateRequest) String() string {
	return tea.Prettify(s)
}

func (s SixBenchTestCreateRequest) GoString() string {
	return s.String()
}

func (s *SixBenchTestCreateRequest) SetAuthToken(v string) *SixBenchTestCreateRequest {
	s.AuthToken = &v
	return s
}

func (s *SixBenchTestCreateRequest) SetProductInstanceId(v string) *SixBenchTestCreateRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SixBenchTestCreateRequest) SetTimeout(v string) *SixBenchTestCreateRequest {
	s.Timeout = &v
	return s
}

type SixBenchTestCreateResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// SUCCESS le
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
	// OK
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
}

func (s SixBenchTestCreateResponse) String() string {
	return tea.Prettify(s)
}

func (s SixBenchTestCreateResponse) GoString() string {
	return s.String()
}

func (s *SixBenchTestCreateResponse) SetReqMsgId(v string) *SixBenchTestCreateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SixBenchTestCreateResponse) SetResultCode(v string) *SixBenchTestCreateResponse {
	s.ResultCode = &v
	return s
}

func (s *SixBenchTestCreateResponse) SetResultMsg(v string) *SixBenchTestCreateResponse {
	s.ResultMsg = &v
	return s
}

func (s *SixBenchTestCreateResponse) SetMsg(v string) *SixBenchTestCreateResponse {
	s.Msg = &v
	return s
}

func (s *SixBenchTestCreateResponse) SetStatus(v string) *SixBenchTestCreateResponse {
	s.Status = &v
	return s
}

type SevenBenchTestCreateRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 3000
	Timeout *string `json:"timeout,omitempty" xml:"timeout,omitempty" require:"true"`
}

func (s SevenBenchTestCreateRequest) String() string {
	return tea.Prettify(s)
}

func (s SevenBenchTestCreateRequest) GoString() string {
	return s.String()
}

func (s *SevenBenchTestCreateRequest) SetAuthToken(v string) *SevenBenchTestCreateRequest {
	s.AuthToken = &v
	return s
}

func (s *SevenBenchTestCreateRequest) SetProductInstanceId(v string) *SevenBenchTestCreateRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SevenBenchTestCreateRequest) SetTimeout(v string) *SevenBenchTestCreateRequest {
	s.Timeout = &v
	return s
}

type SevenBenchTestCreateResponse struct {
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

func (s SevenBenchTestCreateResponse) String() string {
	return tea.Prettify(s)
}

func (s SevenBenchTestCreateResponse) GoString() string {
	return s.String()
}

func (s *SevenBenchTestCreateResponse) SetReqMsgId(v string) *SevenBenchTestCreateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SevenBenchTestCreateResponse) SetResultCode(v string) *SevenBenchTestCreateResponse {
	s.ResultCode = &v
	return s
}

func (s *SevenBenchTestCreateResponse) SetResultMsg(v string) *SevenBenchTestCreateResponse {
	s.ResultMsg = &v
	return s
}

func (s *SevenBenchTestCreateResponse) SetStatus(v string) *SevenBenchTestCreateResponse {
	s.Status = &v
	return s
}

func (s *SevenBenchTestCreateResponse) SetMsg(v string) *SevenBenchTestCreateResponse {
	s.Msg = &v
	return s
}

type EightBenchTestCreateRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s EightBenchTestCreateRequest) String() string {
	return tea.Prettify(s)
}

func (s EightBenchTestCreateRequest) GoString() string {
	return s.String()
}

func (s *EightBenchTestCreateRequest) SetAuthToken(v string) *EightBenchTestCreateRequest {
	s.AuthToken = &v
	return s
}

func (s *EightBenchTestCreateRequest) SetProductInstanceId(v string) *EightBenchTestCreateRequest {
	s.ProductInstanceId = &v
	return s
}

type EightBenchTestCreateResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s EightBenchTestCreateResponse) String() string {
	return tea.Prettify(s)
}

func (s EightBenchTestCreateResponse) GoString() string {
	return s.String()
}

func (s *EightBenchTestCreateResponse) SetReqMsgId(v string) *EightBenchTestCreateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *EightBenchTestCreateResponse) SetResultCode(v string) *EightBenchTestCreateResponse {
	s.ResultCode = &v
	return s
}

func (s *EightBenchTestCreateResponse) SetResultMsg(v string) *EightBenchTestCreateResponse {
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
				"sdk_version":      tea.String("1.0.0"),
				"_prod_code":       tea.String("BENCHTWOCREATE"),
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
// Description: 用于个人工作台二期测试使用
//
// Summary: 用于个人工作台二期测试使用
func (client *Client) ImportAntchainDemosdkCreateThree(request *ImportAntchainDemosdkCreateThreeRequest) (_result *ImportAntchainDemosdkCreateThreeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ImportAntchainDemosdkCreateThreeResponse{}
	_body, _err := client.ImportAntchainDemosdkCreateThreeEx(request, headers, runtime)
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
func (client *Client) ImportAntchainDemosdkCreateThreeEx(request *ImportAntchainDemosdkCreateThreeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ImportAntchainDemosdkCreateThreeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ImportAntchainDemosdkCreateThreeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.demosdk.create.three.import"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) OneBenchTestCreate(request *OneBenchTestCreateRequest) (_result *OneBenchTestCreateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &OneBenchTestCreateResponse{}
	_body, _err := client.OneBenchTestCreateEx(request, headers, runtime)
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
func (client *Client) OneBenchTestCreateEx(request *OneBenchTestCreateRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *OneBenchTestCreateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &OneBenchTestCreateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.benchtwocreate.bench.test.create.one"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 工作台二期测试使用
//
// Summary: 工作台二期测试使用
func (client *Client) TwoBenchTestCreate(request *TwoBenchTestCreateRequest) (_result *TwoBenchTestCreateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &TwoBenchTestCreateResponse{}
	_body, _err := client.TwoBenchTestCreateEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 工作台二期测试使用
//
// Summary: 工作台二期测试使用
func (client *Client) TwoBenchTestCreateEx(request *TwoBenchTestCreateRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *TwoBenchTestCreateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &TwoBenchTestCreateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.benchtwocreate.bench.test.create.two"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 工作台二期测试使用
//
// Summary: 工作台二期测试使用
func (client *Client) ThreeBenchTestCreate(request *ThreeBenchTestCreateRequest) (_result *ThreeBenchTestCreateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ThreeBenchTestCreateResponse{}
	_body, _err := client.ThreeBenchTestCreateEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 工作台二期测试使用
//
// Summary: 工作台二期测试使用
func (client *Client) ThreeBenchTestCreateEx(request *ThreeBenchTestCreateRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ThreeBenchTestCreateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ThreeBenchTestCreateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.benchtwocreate.bench.test.create.three"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 工作台二期测试使用
//
// Summary: 工作台二期测试使用
func (client *Client) FourBenchTestCreate(request *FourBenchTestCreateRequest) (_result *FourBenchTestCreateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &FourBenchTestCreateResponse{}
	_body, _err := client.FourBenchTestCreateEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 工作台二期测试使用
//
// Summary: 工作台二期测试使用
func (client *Client) FourBenchTestCreateEx(request *FourBenchTestCreateRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *FourBenchTestCreateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &FourBenchTestCreateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.benchtwocreate.bench.test.create.four"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 工作台二期测试使用
//
// Summary: 工作台二期测试使用
func (client *Client) FiveBenchTestCreate(request *FiveBenchTestCreateRequest) (_result *FiveBenchTestCreateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &FiveBenchTestCreateResponse{}
	_body, _err := client.FiveBenchTestCreateEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 工作台二期测试使用
//
// Summary: 工作台二期测试使用
func (client *Client) FiveBenchTestCreateEx(request *FiveBenchTestCreateRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *FiveBenchTestCreateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &FiveBenchTestCreateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.benchtwocreate.bench.test.create.five"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 工作台二期测试使用
//
// Summary: 工作台二期测试使用
func (client *Client) SixBenchTestCreate(request *SixBenchTestCreateRequest) (_result *SixBenchTestCreateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SixBenchTestCreateResponse{}
	_body, _err := client.SixBenchTestCreateEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 工作台二期测试使用
//
// Summary: 工作台二期测试使用
func (client *Client) SixBenchTestCreateEx(request *SixBenchTestCreateRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SixBenchTestCreateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SixBenchTestCreateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.benchtwocreate.bench.test.create.six"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 工作台二期测试使用
//
// Summary: 工作台二期测试使用
func (client *Client) SevenBenchTestCreate(request *SevenBenchTestCreateRequest) (_result *SevenBenchTestCreateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SevenBenchTestCreateResponse{}
	_body, _err := client.SevenBenchTestCreateEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 工作台二期测试使用
//
// Summary: 工作台二期测试使用
func (client *Client) SevenBenchTestCreateEx(request *SevenBenchTestCreateRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SevenBenchTestCreateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SevenBenchTestCreateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.benchtwocreate.bench.test.create.seven"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 工作台二期测试使用
//
// Summary: 工作台二期测试使用
func (client *Client) EightBenchTestCreate(request *EightBenchTestCreateRequest) (_result *EightBenchTestCreateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &EightBenchTestCreateResponse{}
	_body, _err := client.EightBenchTestCreateEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 工作台二期测试使用
//
// Summary: 工作台二期测试使用
func (client *Client) EightBenchTestCreateEx(request *EightBenchTestCreateRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *EightBenchTestCreateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &EightBenchTestCreateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.benchtwocreate.bench.test.create.eight"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
