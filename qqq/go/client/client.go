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

// 子结构体
type SubDemoStruct struct {
	// name
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
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
	SomeString *string `json:"some_string,omitempty" xml:"some_string,omitempty" maxLength:"100" minLength:"10"`
	// Long型属性
	SomeNumber *int64 `json:"some_number,omitempty" xml:"some_number,omitempty" require:"true" maximum:"100" minimum:"1"`
	// 布尔型
	SomeBoolean *bool `json:"some_boolean,omitempty" xml:"some_boolean,omitempty" require:"true"`
	// ISO8601格式字符串：yyyy-MM-dd_T_HH:mm:ss_Z_
	SomeDate *string `json:"some_date,omitempty" xml:"some_date,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 字符串数组
	SomeStringList []*string `json:"some_string_list,omitempty" xml:"some_string_list,omitempty" type:"Repeated"`
	// 子结构体
	SomeStruct *SubDemoStruct `json:"some_struct,omitempty" xml:"some_struct,omitempty" require:"true"`
	// 结构体数组
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
	Content *string `json:"content,omitempty" xml:"content,omitempty"`
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
	Code *AbcDemoStruct `json:"code,omitempty" xml:"code,omitempty" require:"true"`
	// 返回结果
	Data *AbcDemoStruct `json:"data,omitempty" xml:"data,omitempty" require:"true"`
	// 返回信息
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
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 年龄
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
	Time *string `json:"time,omitempty" xml:"time,omitempty" require:"true"`
	// 操作人
	Operator *string `json:"operator,omitempty" xml:"operator,omitempty" require:"true"`
	// 请求编号
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
	Time *string `json:"time,omitempty" xml:"time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 请求人
	Operate *string `json:"operate,omitempty" xml:"operate,omitempty" require:"true"`
	// 编号
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
	Time *string `json:"time,omitempty" xml:"time,omitempty" require:"true"`
	// 请求人
	Operator *string `json:"operator,omitempty" xml:"operator,omitempty" require:"true"`
	// 请求编号
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

type QueryCcXxRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// aa
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 测试
	Msg *ResultTest `json:"msg,omitempty" xml:"msg,omitempty" require:"true"`
}

func (s QueryCcXxRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryCcXxRequest) GoString() string {
	return s.String()
}

func (s *QueryCcXxRequest) SetAuthToken(v string) *QueryCcXxRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryCcXxRequest) SetProductInstanceId(v string) *QueryCcXxRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryCcXxRequest) SetName(v string) *QueryCcXxRequest {
	s.Name = &v
	return s
}

func (s *QueryCcXxRequest) SetMsg(v *ResultTest) *QueryCcXxRequest {
	s.Msg = v
	return s
}

type QueryCcXxResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 1213
	Test *string `json:"test,omitempty" xml:"test,omitempty"`
}

func (s QueryCcXxResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryCcXxResponse) GoString() string {
	return s.String()
}

func (s *QueryCcXxResponse) SetReqMsgId(v string) *QueryCcXxResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryCcXxResponse) SetResultCode(v string) *QueryCcXxResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryCcXxResponse) SetResultMsg(v string) *QueryCcXxResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryCcXxResponse) SetTest(v string) *QueryCcXxResponse {
	s.Test = &v
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
				"sdk_version":      tea.String("1.0.4"),
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
 * Description: 用于测试api评审接入SDL/修改后的评审/0323
 * Summary: 用于测试api评审接入SDL/修改后的评审/0323
 */
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

/**
 * Description: 用于测试api评审接入SDL/修改后的评审/0323
 * Summary: 用于测试api评审接入SDL/修改后的评审/0323
 */
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

/**
 * Description: 测试使用api
 * Summary: 测试使用api
 */
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

/**
 * Description: 测试使用api
 * Summary: 测试使用api
 */
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

/**
 * Description: 测试
 * Summary: 测试
 */
func (client *Client) QueryCcXx(request *QueryCcXxRequest) (_result *QueryCcXxResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryCcXxResponse{}
	_body, _err := client.QueryCcXxEx(request, headers, runtime)
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
func (client *Client) QueryCcXxEx(request *QueryCcXxRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryCcXxResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryCcXxResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.demosdk.cc.xx.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
