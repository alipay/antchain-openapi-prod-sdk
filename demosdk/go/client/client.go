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

type QueryBbbCccRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 查询条件
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true" maxLength:"32"`
}

func (s QueryBbbCccRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryBbbCccRequest) GoString() string {
	return s.String()
}

func (s *QueryBbbCccRequest) SetAuthToken(v string) *QueryBbbCccRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryBbbCccRequest) SetProductInstanceId(v string) *QueryBbbCccRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryBbbCccRequest) SetName(v string) *QueryBbbCccRequest {
	s.Name = &v
	return s
}

type QueryBbbCccResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s QueryBbbCccResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryBbbCccResponse) GoString() string {
	return s.String()
}

func (s *QueryBbbCccResponse) SetReqMsgId(v string) *QueryBbbCccResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryBbbCccResponse) SetResultCode(v string) *QueryBbbCccResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryBbbCccResponse) SetResultMsg(v string) *QueryBbbCccResponse {
	s.ResultMsg = &v
	return s
}

type ImportBbbCciRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// test
	// 待上传文件
	FileObject io.Reader `json:"fileObject,omitempty" xml:"fileObject,omitempty"`
	// 待上传文件名
	FileObjectName *string `json:"fileObjectName,omitempty" xml:"fileObjectName,omitempty"`
	FileId         *string `json:"file_id,omitempty" xml:"file_id,omitempty"`
}

func (s ImportBbbCciRequest) String() string {
	return tea.Prettify(s)
}

func (s ImportBbbCciRequest) GoString() string {
	return s.String()
}

func (s *ImportBbbCciRequest) SetAuthToken(v string) *ImportBbbCciRequest {
	s.AuthToken = &v
	return s
}

func (s *ImportBbbCciRequest) SetProductInstanceId(v string) *ImportBbbCciRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ImportBbbCciRequest) SetFileObject(v io.Reader) *ImportBbbCciRequest {
	s.FileObject = v
	return s
}

func (s *ImportBbbCciRequest) SetFileObjectName(v string) *ImportBbbCciRequest {
	s.FileObjectName = &v
	return s
}

func (s *ImportBbbCciRequest) SetFileId(v string) *ImportBbbCciRequest {
	s.FileId = &v
	return s
}

type ImportBbbCciResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s ImportBbbCciResponse) String() string {
	return tea.Prettify(s)
}

func (s ImportBbbCciResponse) GoString() string {
	return s.String()
}

func (s *ImportBbbCciResponse) SetReqMsgId(v string) *ImportBbbCciResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ImportBbbCciResponse) SetResultCode(v string) *ImportBbbCciResponse {
	s.ResultCode = &v
	return s
}

func (s *ImportBbbCciResponse) SetResultMsg(v string) *ImportBbbCciResponse {
	s.ResultMsg = &v
	return s
}

type QueryTimeLimitRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// file_id
	// 待上传文件
	FileObject io.Reader `json:"fileObject,omitempty" xml:"fileObject,omitempty"`
	// 待上传文件名
	FileObjectName *string `json:"fileObjectName,omitempty" xml:"fileObjectName,omitempty"`
	FileId         *string `json:"file_id,omitempty" xml:"file_id,omitempty" require:"true"`
}

func (s QueryTimeLimitRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryTimeLimitRequest) GoString() string {
	return s.String()
}

func (s *QueryTimeLimitRequest) SetAuthToken(v string) *QueryTimeLimitRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryTimeLimitRequest) SetProductInstanceId(v string) *QueryTimeLimitRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryTimeLimitRequest) SetFileObject(v io.Reader) *QueryTimeLimitRequest {
	s.FileObject = v
	return s
}

func (s *QueryTimeLimitRequest) SetFileObjectName(v string) *QueryTimeLimitRequest {
	s.FileObjectName = &v
	return s
}

func (s *QueryTimeLimitRequest) SetFileId(v string) *QueryTimeLimitRequest {
	s.FileId = &v
	return s
}

type QueryTimeLimitResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s QueryTimeLimitResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryTimeLimitResponse) GoString() string {
	return s.String()
}

func (s *QueryTimeLimitResponse) SetReqMsgId(v string) *QueryTimeLimitResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryTimeLimitResponse) SetResultCode(v string) *QueryTimeLimitResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryTimeLimitResponse) SetResultMsg(v string) *QueryTimeLimitResponse {
	s.ResultMsg = &v
	return s
}

type QueryCacheLimitRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s QueryCacheLimitRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryCacheLimitRequest) GoString() string {
	return s.String()
}

func (s *QueryCacheLimitRequest) SetAuthToken(v string) *QueryCacheLimitRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryCacheLimitRequest) SetProductInstanceId(v string) *QueryCacheLimitRequest {
	s.ProductInstanceId = &v
	return s
}

type QueryCacheLimitResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s QueryCacheLimitResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryCacheLimitResponse) GoString() string {
	return s.String()
}

func (s *QueryCacheLimitResponse) SetReqMsgId(v string) *QueryCacheLimitResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryCacheLimitResponse) SetResultCode(v string) *QueryCacheLimitResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryCacheLimitResponse) SetResultMsg(v string) *QueryCacheLimitResponse {
	s.ResultMsg = &v
	return s
}

type QueryBbbEeeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s QueryBbbEeeRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryBbbEeeRequest) GoString() string {
	return s.String()
}

func (s *QueryBbbEeeRequest) SetAuthToken(v string) *QueryBbbEeeRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryBbbEeeRequest) SetProductInstanceId(v string) *QueryBbbEeeRequest {
	s.ProductInstanceId = &v
	return s
}

type QueryBbbEeeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s QueryBbbEeeResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryBbbEeeResponse) GoString() string {
	return s.String()
}

func (s *QueryBbbEeeResponse) SetReqMsgId(v string) *QueryBbbEeeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryBbbEeeResponse) SetResultCode(v string) *QueryBbbEeeResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryBbbEeeResponse) SetResultMsg(v string) *QueryBbbEeeResponse {
	s.ResultMsg = &v
	return s
}

type QueryAaaTestRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s QueryAaaTestRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAaaTestRequest) GoString() string {
	return s.String()
}

func (s *QueryAaaTestRequest) SetAuthToken(v string) *QueryAaaTestRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAaaTestRequest) SetProductInstanceId(v string) *QueryAaaTestRequest {
	s.ProductInstanceId = &v
	return s
}

type QueryAaaTestResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s QueryAaaTestResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAaaTestResponse) GoString() string {
	return s.String()
}

func (s *QueryAaaTestResponse) SetReqMsgId(v string) *QueryAaaTestResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAaaTestResponse) SetResultCode(v string) *QueryAaaTestResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAaaTestResponse) SetResultMsg(v string) *QueryAaaTestResponse {
	s.ResultMsg = &v
	return s
}

type StabilizeBbbCccRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s StabilizeBbbCccRequest) String() string {
	return tea.Prettify(s)
}

func (s StabilizeBbbCccRequest) GoString() string {
	return s.String()
}

func (s *StabilizeBbbCccRequest) SetAuthToken(v string) *StabilizeBbbCccRequest {
	s.AuthToken = &v
	return s
}

func (s *StabilizeBbbCccRequest) SetProductInstanceId(v string) *StabilizeBbbCccRequest {
	s.ProductInstanceId = &v
	return s
}

type StabilizeBbbCccResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s StabilizeBbbCccResponse) String() string {
	return tea.Prettify(s)
}

func (s StabilizeBbbCccResponse) GoString() string {
	return s.String()
}

func (s *StabilizeBbbCccResponse) SetReqMsgId(v string) *StabilizeBbbCccResponse {
	s.ReqMsgId = &v
	return s
}

func (s *StabilizeBbbCccResponse) SetResultCode(v string) *StabilizeBbbCccResponse {
	s.ResultCode = &v
	return s
}

func (s *StabilizeBbbCccResponse) SetResultMsg(v string) *StabilizeBbbCccResponse {
	s.ResultMsg = &v
	return s
}

type QueryMultiCccRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s QueryMultiCccRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryMultiCccRequest) GoString() string {
	return s.String()
}

func (s *QueryMultiCccRequest) SetAuthToken(v string) *QueryMultiCccRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryMultiCccRequest) SetProductInstanceId(v string) *QueryMultiCccRequest {
	s.ProductInstanceId = &v
	return s
}

type QueryMultiCccResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s QueryMultiCccResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryMultiCccResponse) GoString() string {
	return s.String()
}

func (s *QueryMultiCccResponse) SetReqMsgId(v string) *QueryMultiCccResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryMultiCccResponse) SetResultCode(v string) *QueryMultiCccResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryMultiCccResponse) SetResultMsg(v string) *QueryMultiCccResponse {
	s.ResultMsg = &v
	return s
}

type QueryAaaCciRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s QueryAaaCciRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAaaCciRequest) GoString() string {
	return s.String()
}

func (s *QueryAaaCciRequest) SetAuthToken(v string) *QueryAaaCciRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAaaCciRequest) SetProductInstanceId(v string) *QueryAaaCciRequest {
	s.ProductInstanceId = &v
	return s
}

type QueryAaaCciResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s QueryAaaCciResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAaaCciResponse) GoString() string {
	return s.String()
}

func (s *QueryAaaCciResponse) SetReqMsgId(v string) *QueryAaaCciResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAaaCciResponse) SetResultCode(v string) *QueryAaaCciResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAaaCciResponse) SetResultMsg(v string) *QueryAaaCciResponse {
	s.ResultMsg = &v
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

type QueryMultiCciuResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
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

type ApiFileUploadRequest struct {
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

func (s ApiFileUploadRequest) String() string {
	return tea.Prettify(s)
}

func (s ApiFileUploadRequest) GoString() string {
	return s.String()
}

func (s *ApiFileUploadRequest) SetAuthToken(v string) *ApiFileUploadRequest {
	s.AuthToken = &v
	return s
}

func (s *ApiFileUploadRequest) SetProductInstanceId(v string) *ApiFileUploadRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ApiFileUploadRequest) SetFileObject(v io.Reader) *ApiFileUploadRequest {
	s.FileObject = v
	return s
}

func (s *ApiFileUploadRequest) SetFileObjectName(v string) *ApiFileUploadRequest {
	s.FileObjectName = &v
	return s
}

func (s *ApiFileUploadRequest) SetFileId(v string) *ApiFileUploadRequest {
	s.FileId = &v
	return s
}

type ApiFileUploadResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s ApiFileUploadResponse) String() string {
	return tea.Prettify(s)
}

func (s ApiFileUploadResponse) GoString() string {
	return s.String()
}

func (s *ApiFileUploadResponse) SetReqMsgId(v string) *ApiFileUploadResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ApiFileUploadResponse) SetResultCode(v string) *ApiFileUploadResponse {
	s.ResultCode = &v
	return s
}

func (s *ApiFileUploadResponse) SetResultMsg(v string) *ApiFileUploadResponse {
	s.ResultMsg = &v
	return s
}

type ResetBbbCccRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s ResetBbbCccRequest) String() string {
	return tea.Prettify(s)
}

func (s ResetBbbCccRequest) GoString() string {
	return s.String()
}

func (s *ResetBbbCccRequest) SetAuthToken(v string) *ResetBbbCccRequest {
	s.AuthToken = &v
	return s
}

func (s *ResetBbbCccRequest) SetProductInstanceId(v string) *ResetBbbCccRequest {
	s.ProductInstanceId = &v
	return s
}

type ResetBbbCccResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s ResetBbbCccResponse) String() string {
	return tea.Prettify(s)
}

func (s ResetBbbCccResponse) GoString() string {
	return s.String()
}

func (s *ResetBbbCccResponse) SetReqMsgId(v string) *ResetBbbCccResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ResetBbbCccResponse) SetResultCode(v string) *ResetBbbCccResponse {
	s.ResultCode = &v
	return s
}

func (s *ResetBbbCccResponse) SetResultMsg(v string) *ResetBbbCccResponse {
	s.ResultMsg = &v
	return s
}

type QueryTestSssRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s QueryTestSssRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryTestSssRequest) GoString() string {
	return s.String()
}

func (s *QueryTestSssRequest) SetAuthToken(v string) *QueryTestSssRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryTestSssRequest) SetProductInstanceId(v string) *QueryTestSssRequest {
	s.ProductInstanceId = &v
	return s
}

type QueryTestSssResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s QueryTestSssResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryTestSssResponse) GoString() string {
	return s.String()
}

func (s *QueryTestSssResponse) SetReqMsgId(v string) *QueryTestSssResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryTestSssResponse) SetResultCode(v string) *QueryTestSssResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryTestSssResponse) SetResultMsg(v string) *QueryTestSssResponse {
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

type LyzaTestRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// aa
	Param *string `json:"param,omitempty" xml:"param,omitempty"`
}

func (s LyzaTestRequest) String() string {
	return tea.Prettify(s)
}

func (s LyzaTestRequest) GoString() string {
	return s.String()
}

func (s *LyzaTestRequest) SetAuthToken(v string) *LyzaTestRequest {
	s.AuthToken = &v
	return s
}

func (s *LyzaTestRequest) SetProductInstanceId(v string) *LyzaTestRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *LyzaTestRequest) SetParam(v string) *LyzaTestRequest {
	s.Param = &v
	return s
}

type LyzaTestResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s LyzaTestResponse) String() string {
	return tea.Prettify(s)
}

func (s LyzaTestResponse) GoString() string {
	return s.String()
}

func (s *LyzaTestResponse) SetReqMsgId(v string) *LyzaTestResponse {
	s.ReqMsgId = &v
	return s
}

func (s *LyzaTestResponse) SetResultCode(v string) *LyzaTestResponse {
	s.ResultCode = &v
	return s
}

func (s *LyzaTestResponse) SetResultMsg(v string) *LyzaTestResponse {
	s.ResultMsg = &v
	return s
}

type CTestLizAaaRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s CTestLizAaaRequest) String() string {
	return tea.Prettify(s)
}

func (s CTestLizAaaRequest) GoString() string {
	return s.String()
}

func (s *CTestLizAaaRequest) SetAuthToken(v string) *CTestLizAaaRequest {
	s.AuthToken = &v
	return s
}

func (s *CTestLizAaaRequest) SetProductInstanceId(v string) *CTestLizAaaRequest {
	s.ProductInstanceId = &v
	return s
}

type CTestLizAaaResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CTestLizAaaResponse) String() string {
	return tea.Prettify(s)
}

func (s CTestLizAaaResponse) GoString() string {
	return s.String()
}

func (s *CTestLizAaaResponse) SetReqMsgId(v string) *CTestLizAaaResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CTestLizAaaResponse) SetResultCode(v string) *CTestLizAaaResponse {
	s.ResultCode = &v
	return s
}

func (s *CTestLizAaaResponse) SetResultMsg(v string) *CTestLizAaaResponse {
	s.ResultMsg = &v
	return s
}

type VerifyApiListRequest struct {
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
}

func (s VerifyApiListRequest) String() string {
	return tea.Prettify(s)
}

func (s VerifyApiListRequest) GoString() string {
	return s.String()
}

func (s *VerifyApiListRequest) SetAuthToken(v string) *VerifyApiListRequest {
	s.AuthToken = &v
	return s
}

func (s *VerifyApiListRequest) SetProductInstanceId(v string) *VerifyApiListRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *VerifyApiListRequest) SetTimeout(v string) *VerifyApiListRequest {
	s.Timeout = &v
	return s
}

func (s *VerifyApiListRequest) SetCount(v int64) *VerifyApiListRequest {
	s.Count = &v
	return s
}

func (s *VerifyApiListRequest) SetTime(v string) *VerifyApiListRequest {
	s.Time = &v
	return s
}

func (s *VerifyApiListRequest) SetDesc(v string) *VerifyApiListRequest {
	s.Desc = &v
	return s
}

func (s *VerifyApiListRequest) SetOperator(v string) *VerifyApiListRequest {
	s.Operator = &v
	return s
}

type VerifyApiListResponse struct {
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
	// copy
	InitDesc *string `json:"init_desc,omitempty" xml:"init_desc,omitempty"`
	// 组合返回请求结果
	InitPack *InitPack `json:"init_pack,omitempty" xml:"init_pack,omitempty"`
}

func (s VerifyApiListResponse) String() string {
	return tea.Prettify(s)
}

func (s VerifyApiListResponse) GoString() string {
	return s.String()
}

func (s *VerifyApiListResponse) SetReqMsgId(v string) *VerifyApiListResponse {
	s.ReqMsgId = &v
	return s
}

func (s *VerifyApiListResponse) SetResultCode(v string) *VerifyApiListResponse {
	s.ResultCode = &v
	return s
}

func (s *VerifyApiListResponse) SetResultMsg(v string) *VerifyApiListResponse {
	s.ResultMsg = &v
	return s
}

func (s *VerifyApiListResponse) SetStauts(v string) *VerifyApiListResponse {
	s.Stauts = &v
	return s
}

func (s *VerifyApiListResponse) SetMsg(v string) *VerifyApiListResponse {
	s.Msg = &v
	return s
}

func (s *VerifyApiListResponse) SetInitDesc(v string) *VerifyApiListResponse {
	s.InitDesc = &v
	return s
}

func (s *VerifyApiListResponse) SetInitPack(v *InitPack) *VerifyApiListResponse {
	s.InitPack = v
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

type ImportCreateTestRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s ImportCreateTestRequest) String() string {
	return tea.Prettify(s)
}

func (s ImportCreateTestRequest) GoString() string {
	return s.String()
}

func (s *ImportCreateTestRequest) SetAuthToken(v string) *ImportCreateTestRequest {
	s.AuthToken = &v
	return s
}

func (s *ImportCreateTestRequest) SetProductInstanceId(v string) *ImportCreateTestRequest {
	s.ProductInstanceId = &v
	return s
}

type ImportCreateTestResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s ImportCreateTestResponse) String() string {
	return tea.Prettify(s)
}

func (s ImportCreateTestResponse) GoString() string {
	return s.String()
}

func (s *ImportCreateTestResponse) SetReqMsgId(v string) *ImportCreateTestResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ImportCreateTestResponse) SetResultCode(v string) *ImportCreateTestResponse {
	s.ResultCode = &v
	return s
}

func (s *ImportCreateTestResponse) SetResultMsg(v string) *ImportCreateTestResponse {
	s.ResultMsg = &v
	return s
}

type QueryAbcdOneRequest struct {
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
	// 操作人
	Operator *string `json:"operator,omitempty" xml:"operator,omitempty"`
}

func (s QueryAbcdOneRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAbcdOneRequest) GoString() string {
	return s.String()
}

func (s *QueryAbcdOneRequest) SetAuthToken(v string) *QueryAbcdOneRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAbcdOneRequest) SetProductInstanceId(v string) *QueryAbcdOneRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAbcdOneRequest) SetTimeout(v string) *QueryAbcdOneRequest {
	s.Timeout = &v
	return s
}

func (s *QueryAbcdOneRequest) SetCount(v int64) *QueryAbcdOneRequest {
	s.Count = &v
	return s
}

func (s *QueryAbcdOneRequest) SetTime(v string) *QueryAbcdOneRequest {
	s.Time = &v
	return s
}

func (s *QueryAbcdOneRequest) SetDesc(v string) *QueryAbcdOneRequest {
	s.Desc = &v
	return s
}

func (s *QueryAbcdOneRequest) SetOperator(v string) *QueryAbcdOneRequest {
	s.Operator = &v
	return s
}

type QueryAbcdOneResponse struct {
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

func (s QueryAbcdOneResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAbcdOneResponse) GoString() string {
	return s.String()
}

func (s *QueryAbcdOneResponse) SetReqMsgId(v string) *QueryAbcdOneResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAbcdOneResponse) SetResultCode(v string) *QueryAbcdOneResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAbcdOneResponse) SetResultMsg(v string) *QueryAbcdOneResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAbcdOneResponse) SetStauts(v string) *QueryAbcdOneResponse {
	s.Stauts = &v
	return s
}

func (s *QueryAbcdOneResponse) SetMsg(v string) *QueryAbcdOneResponse {
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

type ResetAbcdLimitRequest struct {
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

func (s ResetAbcdLimitRequest) String() string {
	return tea.Prettify(s)
}

func (s ResetAbcdLimitRequest) GoString() string {
	return s.String()
}

func (s *ResetAbcdLimitRequest) SetAuthToken(v string) *ResetAbcdLimitRequest {
	s.AuthToken = &v
	return s
}

func (s *ResetAbcdLimitRequest) SetProductInstanceId(v string) *ResetAbcdLimitRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ResetAbcdLimitRequest) SetTimeout(v string) *ResetAbcdLimitRequest {
	s.Timeout = &v
	return s
}

func (s *ResetAbcdLimitRequest) SetCount(v string) *ResetAbcdLimitRequest {
	s.Count = &v
	return s
}

func (s *ResetAbcdLimitRequest) SetTime(v string) *ResetAbcdLimitRequest {
	s.Time = &v
	return s
}

func (s *ResetAbcdLimitRequest) SetDesc(v string) *ResetAbcdLimitRequest {
	s.Desc = &v
	return s
}

func (s *ResetAbcdLimitRequest) SetOperator(v string) *ResetAbcdLimitRequest {
	s.Operator = &v
	return s
}

type ResetAbcdLimitResponse struct {
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

func (s ResetAbcdLimitResponse) String() string {
	return tea.Prettify(s)
}

func (s ResetAbcdLimitResponse) GoString() string {
	return s.String()
}

func (s *ResetAbcdLimitResponse) SetReqMsgId(v string) *ResetAbcdLimitResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ResetAbcdLimitResponse) SetResultCode(v string) *ResetAbcdLimitResponse {
	s.ResultCode = &v
	return s
}

func (s *ResetAbcdLimitResponse) SetResultMsg(v string) *ResetAbcdLimitResponse {
	s.ResultMsg = &v
	return s
}

func (s *ResetAbcdLimitResponse) SetStauts(v string) *ResetAbcdLimitResponse {
	s.Stauts = &v
	return s
}

func (s *ResetAbcdLimitResponse) SetMsg(v string) *ResetAbcdLimitResponse {
	s.Msg = &v
	return s
}

type RegisterAbcdLimitRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 超时时间
	Timeout *string `json:"timeout,omitempty" xml:"timeout,omitempty"`
	// 操作者
	Operator *string `json:"operator,omitempty" xml:"operator,omitempty"`
}

func (s RegisterAbcdLimitRequest) String() string {
	return tea.Prettify(s)
}

func (s RegisterAbcdLimitRequest) GoString() string {
	return s.String()
}

func (s *RegisterAbcdLimitRequest) SetAuthToken(v string) *RegisterAbcdLimitRequest {
	s.AuthToken = &v
	return s
}

func (s *RegisterAbcdLimitRequest) SetProductInstanceId(v string) *RegisterAbcdLimitRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *RegisterAbcdLimitRequest) SetTimeout(v string) *RegisterAbcdLimitRequest {
	s.Timeout = &v
	return s
}

func (s *RegisterAbcdLimitRequest) SetOperator(v string) *RegisterAbcdLimitRequest {
	s.Operator = &v
	return s
}

type RegisterAbcdLimitResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回结果
	Stauts *string `json:"stauts,omitempty" xml:"stauts,omitempty"`
	// 返回结果
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
}

func (s RegisterAbcdLimitResponse) String() string {
	return tea.Prettify(s)
}

func (s RegisterAbcdLimitResponse) GoString() string {
	return s.String()
}

func (s *RegisterAbcdLimitResponse) SetReqMsgId(v string) *RegisterAbcdLimitResponse {
	s.ReqMsgId = &v
	return s
}

func (s *RegisterAbcdLimitResponse) SetResultCode(v string) *RegisterAbcdLimitResponse {
	s.ResultCode = &v
	return s
}

func (s *RegisterAbcdLimitResponse) SetResultMsg(v string) *RegisterAbcdLimitResponse {
	s.ResultMsg = &v
	return s
}

func (s *RegisterAbcdLimitResponse) SetStauts(v string) *RegisterAbcdLimitResponse {
	s.Stauts = &v
	return s
}

func (s *RegisterAbcdLimitResponse) SetMsg(v string) *RegisterAbcdLimitResponse {
	s.Msg = &v
	return s
}

type QueryTwiceOneRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 超时时间
	Timeout *string `json:"timeout,omitempty" xml:"timeout,omitempty"`
}

func (s QueryTwiceOneRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryTwiceOneRequest) GoString() string {
	return s.String()
}

func (s *QueryTwiceOneRequest) SetAuthToken(v string) *QueryTwiceOneRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryTwiceOneRequest) SetProductInstanceId(v string) *QueryTwiceOneRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryTwiceOneRequest) SetTimeout(v string) *QueryTwiceOneRequest {
	s.Timeout = &v
	return s
}

type QueryTwiceOneResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回结果
	Stauts *string `json:"stauts,omitempty" xml:"stauts,omitempty"`
	// 返回信息描述
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
}

func (s QueryTwiceOneResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryTwiceOneResponse) GoString() string {
	return s.String()
}

func (s *QueryTwiceOneResponse) SetReqMsgId(v string) *QueryTwiceOneResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryTwiceOneResponse) SetResultCode(v string) *QueryTwiceOneResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryTwiceOneResponse) SetResultMsg(v string) *QueryTwiceOneResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryTwiceOneResponse) SetStauts(v string) *QueryTwiceOneResponse {
	s.Stauts = &v
	return s
}

func (s *QueryTwiceOneResponse) SetMsg(v string) *QueryTwiceOneResponse {
	s.Msg = &v
	return s
}

type ImportTwiceOneRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 超时时间
	Timeout *string `json:"timeout,omitempty" xml:"timeout,omitempty"`
}

func (s ImportTwiceOneRequest) String() string {
	return tea.Prettify(s)
}

func (s ImportTwiceOneRequest) GoString() string {
	return s.String()
}

func (s *ImportTwiceOneRequest) SetAuthToken(v string) *ImportTwiceOneRequest {
	s.AuthToken = &v
	return s
}

func (s *ImportTwiceOneRequest) SetProductInstanceId(v string) *ImportTwiceOneRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ImportTwiceOneRequest) SetTimeout(v string) *ImportTwiceOneRequest {
	s.Timeout = &v
	return s
}

type ImportTwiceOneResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回结果
	Stauts *string `json:"stauts,omitempty" xml:"stauts,omitempty"`
	// 返回结果描述
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
}

func (s ImportTwiceOneResponse) String() string {
	return tea.Prettify(s)
}

func (s ImportTwiceOneResponse) GoString() string {
	return s.String()
}

func (s *ImportTwiceOneResponse) SetReqMsgId(v string) *ImportTwiceOneResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ImportTwiceOneResponse) SetResultCode(v string) *ImportTwiceOneResponse {
	s.ResultCode = &v
	return s
}

func (s *ImportTwiceOneResponse) SetResultMsg(v string) *ImportTwiceOneResponse {
	s.ResultMsg = &v
	return s
}

func (s *ImportTwiceOneResponse) SetStauts(v string) *ImportTwiceOneResponse {
	s.Stauts = &v
	return s
}

func (s *ImportTwiceOneResponse) SetMsg(v string) *ImportTwiceOneResponse {
	s.Msg = &v
	return s
}

type PublishTwiceOneRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 超时时间
	Timeout *string `json:"timeout,omitempty" xml:"timeout,omitempty"`
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

type ImportCreateOneRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 3000
	Timeout *string `json:"timeout,omitempty" xml:"timeout,omitempty" require:"true"`
}

func (s ImportCreateOneRequest) String() string {
	return tea.Prettify(s)
}

func (s ImportCreateOneRequest) GoString() string {
	return s.String()
}

func (s *ImportCreateOneRequest) SetAuthToken(v string) *ImportCreateOneRequest {
	s.AuthToken = &v
	return s
}

func (s *ImportCreateOneRequest) SetProductInstanceId(v string) *ImportCreateOneRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ImportCreateOneRequest) SetTimeout(v string) *ImportCreateOneRequest {
	s.Timeout = &v
	return s
}

type ImportCreateOneResponse struct {
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

func (s ImportCreateOneResponse) String() string {
	return tea.Prettify(s)
}

func (s ImportCreateOneResponse) GoString() string {
	return s.String()
}

func (s *ImportCreateOneResponse) SetReqMsgId(v string) *ImportCreateOneResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ImportCreateOneResponse) SetResultCode(v string) *ImportCreateOneResponse {
	s.ResultCode = &v
	return s
}

func (s *ImportCreateOneResponse) SetResultMsg(v string) *ImportCreateOneResponse {
	s.ResultMsg = &v
	return s
}

func (s *ImportCreateOneResponse) SetStatus(v string) *ImportCreateOneResponse {
	s.Status = &v
	return s
}

func (s *ImportCreateOneResponse) SetMsg(v string) *ImportCreateOneResponse {
	s.Msg = &v
	return s
}

type QueryCreateTwoRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 3000
	Timeout *string `json:"timeout,omitempty" xml:"timeout,omitempty" require:"true"`
}

func (s QueryCreateTwoRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryCreateTwoRequest) GoString() string {
	return s.String()
}

func (s *QueryCreateTwoRequest) SetAuthToken(v string) *QueryCreateTwoRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryCreateTwoRequest) SetProductInstanceId(v string) *QueryCreateTwoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryCreateTwoRequest) SetTimeout(v string) *QueryCreateTwoRequest {
	s.Timeout = &v
	return s
}

type QueryCreateTwoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// OK
	Stauts *string `json:"stauts,omitempty" xml:"stauts,omitempty"`
	// SUCCESS le
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
}

func (s QueryCreateTwoResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryCreateTwoResponse) GoString() string {
	return s.String()
}

func (s *QueryCreateTwoResponse) SetReqMsgId(v string) *QueryCreateTwoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryCreateTwoResponse) SetResultCode(v string) *QueryCreateTwoResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryCreateTwoResponse) SetResultMsg(v string) *QueryCreateTwoResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryCreateTwoResponse) SetStauts(v string) *QueryCreateTwoResponse {
	s.Stauts = &v
	return s
}

func (s *QueryCreateTwoResponse) SetMsg(v string) *QueryCreateTwoResponse {
	s.Msg = &v
	return s
}

type ImportCreateThreeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 3000
	Timeout *string `json:"timeout,omitempty" xml:"timeout,omitempty" require:"true"`
}

func (s ImportCreateThreeRequest) String() string {
	return tea.Prettify(s)
}

func (s ImportCreateThreeRequest) GoString() string {
	return s.String()
}

func (s *ImportCreateThreeRequest) SetAuthToken(v string) *ImportCreateThreeRequest {
	s.AuthToken = &v
	return s
}

func (s *ImportCreateThreeRequest) SetProductInstanceId(v string) *ImportCreateThreeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ImportCreateThreeRequest) SetTimeout(v string) *ImportCreateThreeRequest {
	s.Timeout = &v
	return s
}

type ImportCreateThreeResponse struct {
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

func (s ImportCreateThreeResponse) String() string {
	return tea.Prettify(s)
}

func (s ImportCreateThreeResponse) GoString() string {
	return s.String()
}

func (s *ImportCreateThreeResponse) SetReqMsgId(v string) *ImportCreateThreeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ImportCreateThreeResponse) SetResultCode(v string) *ImportCreateThreeResponse {
	s.ResultCode = &v
	return s
}

func (s *ImportCreateThreeResponse) SetResultMsg(v string) *ImportCreateThreeResponse {
	s.ResultMsg = &v
	return s
}

func (s *ImportCreateThreeResponse) SetMsg(v string) *ImportCreateThreeResponse {
	s.Msg = &v
	return s
}

func (s *ImportCreateThreeResponse) SetStatus(v string) *ImportCreateThreeResponse {
	s.Status = &v
	return s
}

type WithdrawTwiceOneRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 超时时间
	Timeout *string `json:"timeout,omitempty" xml:"timeout,omitempty"`
}

func (s WithdrawTwiceOneRequest) String() string {
	return tea.Prettify(s)
}

func (s WithdrawTwiceOneRequest) GoString() string {
	return s.String()
}

func (s *WithdrawTwiceOneRequest) SetAuthToken(v string) *WithdrawTwiceOneRequest {
	s.AuthToken = &v
	return s
}

func (s *WithdrawTwiceOneRequest) SetProductInstanceId(v string) *WithdrawTwiceOneRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *WithdrawTwiceOneRequest) SetTimeout(v string) *WithdrawTwiceOneRequest {
	s.Timeout = &v
	return s
}

type WithdrawTwiceOneResponse struct {
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

func (s WithdrawTwiceOneResponse) String() string {
	return tea.Prettify(s)
}

func (s WithdrawTwiceOneResponse) GoString() string {
	return s.String()
}

func (s *WithdrawTwiceOneResponse) SetReqMsgId(v string) *WithdrawTwiceOneResponse {
	s.ReqMsgId = &v
	return s
}

func (s *WithdrawTwiceOneResponse) SetResultCode(v string) *WithdrawTwiceOneResponse {
	s.ResultCode = &v
	return s
}

func (s *WithdrawTwiceOneResponse) SetResultMsg(v string) *WithdrawTwiceOneResponse {
	s.ResultMsg = &v
	return s
}

func (s *WithdrawTwiceOneResponse) SetStauts(v string) *WithdrawTwiceOneResponse {
	s.Stauts = &v
	return s
}

func (s *WithdrawTwiceOneResponse) SetMsg(v string) *WithdrawTwiceOneResponse {
	s.Msg = &v
	return s
}

type OperateTwiceOneRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 超时时间
	Timeout *string `json:"timeout,omitempty" xml:"timeout,omitempty"`
}

func (s OperateTwiceOneRequest) String() string {
	return tea.Prettify(s)
}

func (s OperateTwiceOneRequest) GoString() string {
	return s.String()
}

func (s *OperateTwiceOneRequest) SetAuthToken(v string) *OperateTwiceOneRequest {
	s.AuthToken = &v
	return s
}

func (s *OperateTwiceOneRequest) SetProductInstanceId(v string) *OperateTwiceOneRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *OperateTwiceOneRequest) SetTimeout(v string) *OperateTwiceOneRequest {
	s.Timeout = &v
	return s
}

type OperateTwiceOneResponse struct {
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

func (s OperateTwiceOneResponse) String() string {
	return tea.Prettify(s)
}

func (s OperateTwiceOneResponse) GoString() string {
	return s.String()
}

func (s *OperateTwiceOneResponse) SetReqMsgId(v string) *OperateTwiceOneResponse {
	s.ReqMsgId = &v
	return s
}

func (s *OperateTwiceOneResponse) SetResultCode(v string) *OperateTwiceOneResponse {
	s.ResultCode = &v
	return s
}

func (s *OperateTwiceOneResponse) SetResultMsg(v string) *OperateTwiceOneResponse {
	s.ResultMsg = &v
	return s
}

func (s *OperateTwiceOneResponse) SetStauts(v string) *OperateTwiceOneResponse {
	s.Stauts = &v
	return s
}

func (s *OperateTwiceOneResponse) SetMsg(v string) *OperateTwiceOneResponse {
	s.Msg = &v
	return s
}

type QueryTwiceTwoRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 超时时间
	Timeout *string `json:"timeout,omitempty" xml:"timeout,omitempty" require:"true"`
}

func (s QueryTwiceTwoRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryTwiceTwoRequest) GoString() string {
	return s.String()
}

func (s *QueryTwiceTwoRequest) SetAuthToken(v string) *QueryTwiceTwoRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryTwiceTwoRequest) SetProductInstanceId(v string) *QueryTwiceTwoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryTwiceTwoRequest) SetTimeout(v string) *QueryTwiceTwoRequest {
	s.Timeout = &v
	return s
}

type QueryTwiceTwoResponse struct {
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

func (s QueryTwiceTwoResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryTwiceTwoResponse) GoString() string {
	return s.String()
}

func (s *QueryTwiceTwoResponse) SetReqMsgId(v string) *QueryTwiceTwoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryTwiceTwoResponse) SetResultCode(v string) *QueryTwiceTwoResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryTwiceTwoResponse) SetResultMsg(v string) *QueryTwiceTwoResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryTwiceTwoResponse) SetStauts(v string) *QueryTwiceTwoResponse {
	s.Stauts = &v
	return s
}

func (s *QueryTwiceTwoResponse) SetMsg(v string) *QueryTwiceTwoResponse {
	s.Msg = &v
	return s
}

type QueryTestRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s QueryTestRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryTestRequest) GoString() string {
	return s.String()
}

func (s *QueryTestRequest) SetAuthToken(v string) *QueryTestRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryTestRequest) SetProductInstanceId(v string) *QueryTestRequest {
	s.ProductInstanceId = &v
	return s
}

type QueryTestResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s QueryTestResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryTestResponse) GoString() string {
	return s.String()
}

func (s *QueryTestResponse) SetReqMsgId(v string) *QueryTestResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryTestResponse) SetResultCode(v string) *QueryTestResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryTestResponse) SetResultMsg(v string) *QueryTestResponse {
	s.ResultMsg = &v
	return s
}

type ImportTestRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s ImportTestRequest) String() string {
	return tea.Prettify(s)
}

func (s ImportTestRequest) GoString() string {
	return s.String()
}

func (s *ImportTestRequest) SetAuthToken(v string) *ImportTestRequest {
	s.AuthToken = &v
	return s
}

func (s *ImportTestRequest) SetProductInstanceId(v string) *ImportTestRequest {
	s.ProductInstanceId = &v
	return s
}

type ImportTestResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s ImportTestResponse) String() string {
	return tea.Prettify(s)
}

func (s ImportTestResponse) GoString() string {
	return s.String()
}

func (s *ImportTestResponse) SetReqMsgId(v string) *ImportTestResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ImportTestResponse) SetResultCode(v string) *ImportTestResponse {
	s.ResultCode = &v
	return s
}

func (s *ImportTestResponse) SetResultMsg(v string) *ImportTestResponse {
	s.ResultMsg = &v
	return s
}

type StabilizeTestRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s StabilizeTestRequest) String() string {
	return tea.Prettify(s)
}

func (s StabilizeTestRequest) GoString() string {
	return s.String()
}

func (s *StabilizeTestRequest) SetAuthToken(v string) *StabilizeTestRequest {
	s.AuthToken = &v
	return s
}

func (s *StabilizeTestRequest) SetProductInstanceId(v string) *StabilizeTestRequest {
	s.ProductInstanceId = &v
	return s
}

type StabilizeTestResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s StabilizeTestResponse) String() string {
	return tea.Prettify(s)
}

func (s StabilizeTestResponse) GoString() string {
	return s.String()
}

func (s *StabilizeTestResponse) SetReqMsgId(v string) *StabilizeTestResponse {
	s.ReqMsgId = &v
	return s
}

func (s *StabilizeTestResponse) SetResultCode(v string) *StabilizeTestResponse {
	s.ResultCode = &v
	return s
}

func (s *StabilizeTestResponse) SetResultMsg(v string) *StabilizeTestResponse {
	s.ResultMsg = &v
	return s
}

type QueryTwiceThreeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 超时时间
	Timeout *string `json:"timeout,omitempty" xml:"timeout,omitempty"`
}

func (s QueryTwiceThreeRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryTwiceThreeRequest) GoString() string {
	return s.String()
}

func (s *QueryTwiceThreeRequest) SetAuthToken(v string) *QueryTwiceThreeRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryTwiceThreeRequest) SetProductInstanceId(v string) *QueryTwiceThreeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryTwiceThreeRequest) SetTimeout(v string) *QueryTwiceThreeRequest {
	s.Timeout = &v
	return s
}

type QueryTwiceThreeResponse struct {
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

func (s QueryTwiceThreeResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryTwiceThreeResponse) GoString() string {
	return s.String()
}

func (s *QueryTwiceThreeResponse) SetReqMsgId(v string) *QueryTwiceThreeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryTwiceThreeResponse) SetResultCode(v string) *QueryTwiceThreeResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryTwiceThreeResponse) SetResultMsg(v string) *QueryTwiceThreeResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryTwiceThreeResponse) SetStauts(v string) *QueryTwiceThreeResponse {
	s.Stauts = &v
	return s
}

func (s *QueryTwiceThreeResponse) SetMsg(v string) *QueryTwiceThreeResponse {
	s.Msg = &v
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

type UnstabilizeTestRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s UnstabilizeTestRequest) String() string {
	return tea.Prettify(s)
}

func (s UnstabilizeTestRequest) GoString() string {
	return s.String()
}

func (s *UnstabilizeTestRequest) SetAuthToken(v string) *UnstabilizeTestRequest {
	s.AuthToken = &v
	return s
}

func (s *UnstabilizeTestRequest) SetProductInstanceId(v string) *UnstabilizeTestRequest {
	s.ProductInstanceId = &v
	return s
}

type UnstabilizeTestResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s UnstabilizeTestResponse) String() string {
	return tea.Prettify(s)
}

func (s UnstabilizeTestResponse) GoString() string {
	return s.String()
}

func (s *UnstabilizeTestResponse) SetReqMsgId(v string) *UnstabilizeTestResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UnstabilizeTestResponse) SetResultCode(v string) *UnstabilizeTestResponse {
	s.ResultCode = &v
	return s
}

func (s *UnstabilizeTestResponse) SetResultMsg(v string) *UnstabilizeTestResponse {
	s.ResultMsg = &v
	return s
}

type QueryTestXcRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s QueryTestXcRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryTestXcRequest) GoString() string {
	return s.String()
}

func (s *QueryTestXcRequest) SetAuthToken(v string) *QueryTestXcRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryTestXcRequest) SetProductInstanceId(v string) *QueryTestXcRequest {
	s.ProductInstanceId = &v
	return s
}

type QueryTestXcResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s QueryTestXcResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryTestXcResponse) GoString() string {
	return s.String()
}

func (s *QueryTestXcResponse) SetReqMsgId(v string) *QueryTestXcResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryTestXcResponse) SetResultCode(v string) *QueryTestXcResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryTestXcResponse) SetResultMsg(v string) *QueryTestXcResponse {
	s.ResultMsg = &v
	return s
}

type QueryTestSyaRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s QueryTestSyaRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryTestSyaRequest) GoString() string {
	return s.String()
}

func (s *QueryTestSyaRequest) SetAuthToken(v string) *QueryTestSyaRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryTestSyaRequest) SetProductInstanceId(v string) *QueryTestSyaRequest {
	s.ProductInstanceId = &v
	return s
}

type QueryTestSyaResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s QueryTestSyaResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryTestSyaResponse) GoString() string {
	return s.String()
}

func (s *QueryTestSyaResponse) SetReqMsgId(v string) *QueryTestSyaResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryTestSyaResponse) SetResultCode(v string) *QueryTestSyaResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryTestSyaResponse) SetResultMsg(v string) *QueryTestSyaResponse {
	s.ResultMsg = &v
	return s
}

type QueryQqqWwwRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s QueryQqqWwwRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryQqqWwwRequest) GoString() string {
	return s.String()
}

func (s *QueryQqqWwwRequest) SetAuthToken(v string) *QueryQqqWwwRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryQqqWwwRequest) SetProductInstanceId(v string) *QueryQqqWwwRequest {
	s.ProductInstanceId = &v
	return s
}

type QueryQqqWwwResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s QueryQqqWwwResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryQqqWwwResponse) GoString() string {
	return s.String()
}

func (s *QueryQqqWwwResponse) SetReqMsgId(v string) *QueryQqqWwwResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryQqqWwwResponse) SetResultCode(v string) *QueryQqqWwwResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryQqqWwwResponse) SetResultMsg(v string) *QueryQqqWwwResponse {
	s.ResultMsg = &v
	return s
}

type StabilizeTwiceThreeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 超时时间
	Timeout *string `json:"timeout,omitempty" xml:"timeout,omitempty" require:"true"`
}

func (s StabilizeTwiceThreeRequest) String() string {
	return tea.Prettify(s)
}

func (s StabilizeTwiceThreeRequest) GoString() string {
	return s.String()
}

func (s *StabilizeTwiceThreeRequest) SetAuthToken(v string) *StabilizeTwiceThreeRequest {
	s.AuthToken = &v
	return s
}

func (s *StabilizeTwiceThreeRequest) SetProductInstanceId(v string) *StabilizeTwiceThreeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *StabilizeTwiceThreeRequest) SetTimeout(v string) *StabilizeTwiceThreeRequest {
	s.Timeout = &v
	return s
}

type StabilizeTwiceThreeResponse struct {
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

func (s StabilizeTwiceThreeResponse) String() string {
	return tea.Prettify(s)
}

func (s StabilizeTwiceThreeResponse) GoString() string {
	return s.String()
}

func (s *StabilizeTwiceThreeResponse) SetReqMsgId(v string) *StabilizeTwiceThreeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *StabilizeTwiceThreeResponse) SetResultCode(v string) *StabilizeTwiceThreeResponse {
	s.ResultCode = &v
	return s
}

func (s *StabilizeTwiceThreeResponse) SetResultMsg(v string) *StabilizeTwiceThreeResponse {
	s.ResultMsg = &v
	return s
}

func (s *StabilizeTwiceThreeResponse) SetStauts(v string) *StabilizeTwiceThreeResponse {
	s.Stauts = &v
	return s
}

func (s *StabilizeTwiceThreeResponse) SetMsg(v string) *StabilizeTwiceThreeResponse {
	s.Msg = &v
	return s
}

type UnstabilizeTwiceThreeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 超时时间
	Timeout *string `json:"timeout,omitempty" xml:"timeout,omitempty"`
}

func (s UnstabilizeTwiceThreeRequest) String() string {
	return tea.Prettify(s)
}

func (s UnstabilizeTwiceThreeRequest) GoString() string {
	return s.String()
}

func (s *UnstabilizeTwiceThreeRequest) SetAuthToken(v string) *UnstabilizeTwiceThreeRequest {
	s.AuthToken = &v
	return s
}

func (s *UnstabilizeTwiceThreeRequest) SetProductInstanceId(v string) *UnstabilizeTwiceThreeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UnstabilizeTwiceThreeRequest) SetTimeout(v string) *UnstabilizeTwiceThreeRequest {
	s.Timeout = &v
	return s
}

type UnstabilizeTwiceThreeResponse struct {
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

func (s UnstabilizeTwiceThreeResponse) String() string {
	return tea.Prettify(s)
}

func (s UnstabilizeTwiceThreeResponse) GoString() string {
	return s.String()
}

func (s *UnstabilizeTwiceThreeResponse) SetReqMsgId(v string) *UnstabilizeTwiceThreeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UnstabilizeTwiceThreeResponse) SetResultCode(v string) *UnstabilizeTwiceThreeResponse {
	s.ResultCode = &v
	return s
}

func (s *UnstabilizeTwiceThreeResponse) SetResultMsg(v string) *UnstabilizeTwiceThreeResponse {
	s.ResultMsg = &v
	return s
}

func (s *UnstabilizeTwiceThreeResponse) SetStauts(v string) *UnstabilizeTwiceThreeResponse {
	s.Stauts = &v
	return s
}

func (s *UnstabilizeTwiceThreeResponse) SetMsg(v string) *UnstabilizeTwiceThreeResponse {
	s.Msg = &v
	return s
}

type QueryBbbAatestRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s QueryBbbAatestRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryBbbAatestRequest) GoString() string {
	return s.String()
}

func (s *QueryBbbAatestRequest) SetAuthToken(v string) *QueryBbbAatestRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryBbbAatestRequest) SetProductInstanceId(v string) *QueryBbbAatestRequest {
	s.ProductInstanceId = &v
	return s
}

type QueryBbbAatestResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s QueryBbbAatestResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryBbbAatestResponse) GoString() string {
	return s.String()
}

func (s *QueryBbbAatestResponse) SetReqMsgId(v string) *QueryBbbAatestResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryBbbAatestResponse) SetResultCode(v string) *QueryBbbAatestResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryBbbAatestResponse) SetResultMsg(v string) *QueryBbbAatestResponse {
	s.ResultMsg = &v
	return s
}

type ParamLiuyzTestRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// aaa
	ParamA *string `json:"param_a,omitempty" xml:"param_a,omitempty" require:"true"`
}

func (s ParamLiuyzTestRequest) String() string {
	return tea.Prettify(s)
}

func (s ParamLiuyzTestRequest) GoString() string {
	return s.String()
}

func (s *ParamLiuyzTestRequest) SetAuthToken(v string) *ParamLiuyzTestRequest {
	s.AuthToken = &v
	return s
}

func (s *ParamLiuyzTestRequest) SetProductInstanceId(v string) *ParamLiuyzTestRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ParamLiuyzTestRequest) SetParamA(v string) *ParamLiuyzTestRequest {
	s.ParamA = &v
	return s
}

type ParamLiuyzTestResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 0000
	Code *string `json:"code,omitempty" xml:"code,omitempty"`
}

func (s ParamLiuyzTestResponse) String() string {
	return tea.Prettify(s)
}

func (s ParamLiuyzTestResponse) GoString() string {
	return s.String()
}

func (s *ParamLiuyzTestResponse) SetReqMsgId(v string) *ParamLiuyzTestResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ParamLiuyzTestResponse) SetResultCode(v string) *ParamLiuyzTestResponse {
	s.ResultCode = &v
	return s
}

func (s *ParamLiuyzTestResponse) SetResultMsg(v string) *ParamLiuyzTestResponse {
	s.ResultMsg = &v
	return s
}

func (s *ParamLiuyzTestResponse) SetCode(v string) *ParamLiuyzTestResponse {
	s.Code = &v
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
				"sdk_version":      tea.String("1.3.33"),
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
 * Description: 测试sdk打包用
 * Summary: shiyi.cj
 */
func (client *Client) QueryBbbCcc(request *QueryBbbCccRequest) (_result *QueryBbbCccResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryBbbCccResponse{}
	_body, _err := client.QueryBbbCccEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 测试sdk打包用
 * Summary: shiyi.cj
 */
func (client *Client) QueryBbbCccEx(request *QueryBbbCccRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryBbbCccResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryBbbCccResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.demosdk.bbb.ccc.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 测试用
 * Summary: 测试用
 */
func (client *Client) ImportBbbCci(request *ImportBbbCciRequest) (_result *ImportBbbCciResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ImportBbbCciResponse{}
	_body, _err := client.ImportBbbCciEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 测试用
 * Summary: 测试用
 */
func (client *Client) ImportBbbCciEx(request *ImportBbbCciRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ImportBbbCciResponse, _err error) {
	if !tea.BoolValue(util.IsUnset(request.FileObject)) {
		uploadReq := &CreateAntcloudGatewayxFileUploadRequest{
			AuthToken: request.AuthToken,
			ApiCode:   tea.String("antchain.demosdk.bbb.cci.import"),
			FileName:  request.FileObjectName,
		}
		uploadResp, _err := client.CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime)
		if _err != nil {
			return _result, _err
		}

		if !tea.BoolValue(antchainutil.IsSuccess(uploadResp.ResultCode, tea.String("ok"))) {
			importBbbCciResponse := &ImportBbbCciResponse{
				ReqMsgId:   uploadResp.ReqMsgId,
				ResultCode: uploadResp.ResultCode,
				ResultMsg:  uploadResp.ResultMsg,
			}
			_result = importBbbCciResponse
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
	_result = &ImportBbbCciResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.demosdk.bbb.cci.import"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 个人工作台二期全链路测试接口1
 * Summary: 个人工作台二期全链路测试接口1
 */
func (client *Client) QueryTimeLimit(request *QueryTimeLimitRequest) (_result *QueryTimeLimitResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryTimeLimitResponse{}
	_body, _err := client.QueryTimeLimitEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 个人工作台二期全链路测试接口1
 * Summary: 个人工作台二期全链路测试接口1
 */
func (client *Client) QueryTimeLimitEx(request *QueryTimeLimitRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryTimeLimitResponse, _err error) {
	if !tea.BoolValue(util.IsUnset(request.FileObject)) {
		uploadReq := &CreateAntcloudGatewayxFileUploadRequest{
			AuthToken: request.AuthToken,
			ApiCode:   tea.String("antchain.demosdk.time.limit.query"),
			FileName:  request.FileObjectName,
		}
		uploadResp, _err := client.CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime)
		if _err != nil {
			return _result, _err
		}

		if !tea.BoolValue(antchainutil.IsSuccess(uploadResp.ResultCode, tea.String("ok"))) {
			queryTimeLimitResponse := &QueryTimeLimitResponse{
				ReqMsgId:   uploadResp.ReqMsgId,
				ResultCode: uploadResp.ResultCode,
				ResultMsg:  uploadResp.ResultMsg,
			}
			_result = queryTimeLimitResponse
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
	_result = &QueryTimeLimitResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.demosdk.time.limit.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 个人工作台二期测试接口2
 * Summary: 个人工作台二期测试接口2
 */
func (client *Client) QueryCacheLimit(request *QueryCacheLimitRequest) (_result *QueryCacheLimitResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryCacheLimitResponse{}
	_body, _err := client.QueryCacheLimitEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 个人工作台二期测试接口2
 * Summary: 个人工作台二期测试接口2
 */
func (client *Client) QueryCacheLimitEx(request *QueryCacheLimitRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryCacheLimitResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryCacheLimitResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.demosdk.cache.limit.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 测试接口
 * Summary: 测试接口
 */
func (client *Client) QueryBbbEee(request *QueryBbbEeeRequest) (_result *QueryBbbEeeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryBbbEeeResponse{}
	_body, _err := client.QueryBbbEeeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 测试接口
 * Summary: 测试接口
 */
func (client *Client) QueryBbbEeeEx(request *QueryBbbEeeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryBbbEeeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryBbbEeeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.demosdk.bbb.eee.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 测试用
 * Summary: 测试用
 */
func (client *Client) QueryAaaTest(request *QueryAaaTestRequest) (_result *QueryAaaTestResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAaaTestResponse{}
	_body, _err := client.QueryAaaTestEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 测试用
 * Summary: 测试用
 */
func (client *Client) QueryAaaTestEx(request *QueryAaaTestRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAaaTestResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAaaTestResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.demosdk.aaa.test.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) StabilizeBbbCcc(request *StabilizeBbbCccRequest) (_result *StabilizeBbbCccResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &StabilizeBbbCccResponse{}
	_body, _err := client.StabilizeBbbCccEx(request, headers, runtime)
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
func (client *Client) StabilizeBbbCccEx(request *StabilizeBbbCccRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *StabilizeBbbCccResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &StabilizeBbbCccResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.demosdk.bbb.ccc.stabilize"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: r
 * Summary: 测试
 */
func (client *Client) QueryMultiCcc(request *QueryMultiCccRequest) (_result *QueryMultiCccResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryMultiCccResponse{}
	_body, _err := client.QueryMultiCccEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: r
 * Summary: 测试
 */
func (client *Client) QueryMultiCccEx(request *QueryMultiCccRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryMultiCccResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryMultiCccResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.demosdk.multi.ccc.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: l
 * Summary: 测试
 */
func (client *Client) QueryAaaCci(request *QueryAaaCciRequest) (_result *QueryAaaCciResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAaaCciResponse{}
	_body, _err := client.QueryAaaCciEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: l
 * Summary: 测试
 */
func (client *Client) QueryAaaCciEx(request *QueryAaaCciRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAaaCciResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAaaCciResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.demosdk.aaa.cci.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 这是测试的
 * Summary: 测试
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
 * Summary: 测试
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
 * Description: l
 * Summary: 测试
 */
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

/**
 * Description: l
 * Summary: 测试
 */
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

/**
 * Description: 个人工作台二期测试使用
 * Summary: 个人工作台二期测试使用
 */
func (client *Client) ApiFileUpload(request *ApiFileUploadRequest) (_result *ApiFileUploadResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ApiFileUploadResponse{}
	_body, _err := client.ApiFileUploadEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 个人工作台二期测试使用
 * Summary: 个人工作台二期测试使用
 */
func (client *Client) ApiFileUploadEx(request *ApiFileUploadRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ApiFileUploadResponse, _err error) {
	if !tea.BoolValue(util.IsUnset(request.FileObject)) {
		uploadReq := &CreateAntcloudGatewayxFileUploadRequest{
			AuthToken: request.AuthToken,
			ApiCode:   tea.String("antchain.demosdk.file.upload.api"),
			FileName:  request.FileObjectName,
		}
		uploadResp, _err := client.CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime)
		if _err != nil {
			return _result, _err
		}

		if !tea.BoolValue(antchainutil.IsSuccess(uploadResp.ResultCode, tea.String("ok"))) {
			apiFileUploadResponse := &ApiFileUploadResponse{
				ReqMsgId:   uploadResp.ReqMsgId,
				ResultCode: uploadResp.ResultCode,
				ResultMsg:  uploadResp.ResultMsg,
			}
			_result = apiFileUploadResponse
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
	_result = &ApiFileUploadResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.demosdk.file.upload.api"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 测试接口
 * Summary: 测试接口
 */
func (client *Client) ResetBbbCcc(request *ResetBbbCccRequest) (_result *ResetBbbCccResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ResetBbbCccResponse{}
	_body, _err := client.ResetBbbCccEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 测试接口
 * Summary: 测试接口
 */
func (client *Client) ResetBbbCccEx(request *ResetBbbCccRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ResetBbbCccResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ResetBbbCccResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.demosdk.bbb.ccc.reset"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 测试接口
 * Summary: 测试接口
 */
func (client *Client) QueryTestSss(request *QueryTestSssRequest) (_result *QueryTestSssResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryTestSssResponse{}
	_body, _err := client.QueryTestSssEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 测试接口
 * Summary: 测试接口
 */
func (client *Client) QueryTestSssEx(request *QueryTestSssRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryTestSssResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryTestSssResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.demosdk.test.sss.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
 * Summary: 自动化测试创建test1
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
 * Summary: 自动化测试创建test1
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

/**
 * Description: test
 * Summary: test
 */
func (client *Client) LyzaTest(request *LyzaTestRequest) (_result *LyzaTestResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &LyzaTestResponse{}
	_body, _err := client.LyzaTestEx(request, headers, runtime)
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
func (client *Client) LyzaTestEx(request *LyzaTestRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *LyzaTestResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &LyzaTestResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.demosdk.test.lyza"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) CTestLizAaa(request *CTestLizAaaRequest) (_result *CTestLizAaaResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CTestLizAaaResponse{}
	_body, _err := client.CTestLizAaaEx(request, headers, runtime)
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
func (client *Client) CTestLizAaaEx(request *CTestLizAaaRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CTestLizAaaResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CTestLizAaaResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.demosdk.test.liz.aaa.c"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 用于个人工作台二期测试使用
 * Summary: 用于个人工作台二期测试使用
 */
func (client *Client) VerifyApiList(request *VerifyApiListRequest) (_result *VerifyApiListResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &VerifyApiListResponse{}
	_body, _err := client.VerifyApiListEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 用于个人工作台二期测试使用
 * Summary: 用于个人工作台二期测试使用
 */
func (client *Client) VerifyApiListEx(request *VerifyApiListRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *VerifyApiListResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &VerifyApiListResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.demosdk.api.list.verify"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 用于个人工作台二期测试使用测试test
 * Summary: 用于个人工作台二期测试使用
 */
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

/**
 * Description: 用于个人工作台二期测试使用测试test
 * Summary: 用于个人工作台二期测试使用
 */
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

/**
 * Description: 用于个人工作台二期测试使用
 * Summary: 用于个人工作台二期测试使用
 */
func (client *Client) ImportCreateTest(request *ImportCreateTestRequest) (_result *ImportCreateTestResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ImportCreateTestResponse{}
	_body, _err := client.ImportCreateTestEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 用于个人工作台二期测试使用
 * Summary: 用于个人工作台二期测试使用
 */
func (client *Client) ImportCreateTestEx(request *ImportCreateTestRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ImportCreateTestResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ImportCreateTestResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.demosdk.create.test.import"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 哈哈哈个人工作台二期测试接口test
 * Summary: 个人工作台二期测试接口
 */
func (client *Client) QueryAbcdOne(request *QueryAbcdOneRequest) (_result *QueryAbcdOneResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAbcdOneResponse{}
	_body, _err := client.QueryAbcdOneEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 哈哈哈个人工作台二期测试接口test
 * Summary: 个人工作台二期测试接口
 */
func (client *Client) QueryAbcdOneEx(request *QueryAbcdOneRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAbcdOneResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAbcdOneResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.demosdk.abcd.one.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 个人工作台二期测试接口
 * Summary: 个人工作台二期测试接口
 */
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

/**
 * Description: 个人工作台二期测试接口
 * Summary: 个人工作台二期测试接口
 */
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

/**
 * Description: 个人工作台二期分组路由灰度测试接口
 * Summary: 个人工作台二期分组路由灰度测试接口
 */
func (client *Client) ResetAbcdLimit(request *ResetAbcdLimitRequest) (_result *ResetAbcdLimitResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ResetAbcdLimitResponse{}
	_body, _err := client.ResetAbcdLimitEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 个人工作台二期分组路由灰度测试接口
 * Summary: 个人工作台二期分组路由灰度测试接口
 */
func (client *Client) ResetAbcdLimitEx(request *ResetAbcdLimitRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ResetAbcdLimitResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ResetAbcdLimitResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.demosdk.abcd.limit.reset"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 个人工作台二期分组路由测试接口
 * Summary: 个人工作台二期分组路由测试接口
 */
func (client *Client) RegisterAbcdLimit(request *RegisterAbcdLimitRequest) (_result *RegisterAbcdLimitResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &RegisterAbcdLimitResponse{}
	_body, _err := client.RegisterAbcdLimitEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 个人工作台二期分组路由测试接口
 * Summary: 个人工作台二期分组路由测试接口
 */
func (client *Client) RegisterAbcdLimitEx(request *RegisterAbcdLimitRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *RegisterAbcdLimitResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &RegisterAbcdLimitResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.demosdk.abcd.limit.register"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 个人工作台预发测试使用
 * Summary: 个人工作台预发测试使用
 */
func (client *Client) QueryTwiceOne(request *QueryTwiceOneRequest) (_result *QueryTwiceOneResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryTwiceOneResponse{}
	_body, _err := client.QueryTwiceOneEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 个人工作台预发测试使用
 * Summary: 个人工作台预发测试使用
 */
func (client *Client) QueryTwiceOneEx(request *QueryTwiceOneRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryTwiceOneResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryTwiceOneResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.demosdk.twice.one.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) ImportTwiceOne(request *ImportTwiceOneRequest) (_result *ImportTwiceOneResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ImportTwiceOneResponse{}
	_body, _err := client.ImportTwiceOneEx(request, headers, runtime)
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
func (client *Client) ImportTwiceOneEx(request *ImportTwiceOneRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ImportTwiceOneResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ImportTwiceOneResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.demosdk.twice.one.import"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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

/**
 * Description: 个人工作台二期预发测试
 * Summary: 个人工作台二期预发测试
 */
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

/**
 * Description: 用于个人工作台二期测试使用
 * Summary: 用于个人工作台二期测试使用
 */
func (client *Client) ImportCreateOne(request *ImportCreateOneRequest) (_result *ImportCreateOneResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ImportCreateOneResponse{}
	_body, _err := client.ImportCreateOneEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 用于个人工作台二期测试使用
 * Summary: 用于个人工作台二期测试使用
 */
func (client *Client) ImportCreateOneEx(request *ImportCreateOneRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ImportCreateOneResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ImportCreateOneResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.demosdk.create.one.import"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 用于个人工作台二期测试使用
 * Summary: 用于个人工作台二期测试使用
 */
func (client *Client) QueryCreateTwo(request *QueryCreateTwoRequest) (_result *QueryCreateTwoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryCreateTwoResponse{}
	_body, _err := client.QueryCreateTwoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 用于个人工作台二期测试使用
 * Summary: 用于个人工作台二期测试使用
 */
func (client *Client) QueryCreateTwoEx(request *QueryCreateTwoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryCreateTwoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryCreateTwoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.demosdk.create.two.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 用于个人工作台二期测试使用
 * Summary: 用于个人工作台二期测试使用
 */
func (client *Client) ImportCreateThree(request *ImportCreateThreeRequest) (_result *ImportCreateThreeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ImportCreateThreeResponse{}
	_body, _err := client.ImportCreateThreeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 用于个人工作台二期测试使用
 * Summary: 用于个人工作台二期测试使用
 */
func (client *Client) ImportCreateThreeEx(request *ImportCreateThreeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ImportCreateThreeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ImportCreateThreeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.demosdk.create.three.import"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) WithdrawTwiceOne(request *WithdrawTwiceOneRequest) (_result *WithdrawTwiceOneResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &WithdrawTwiceOneResponse{}
	_body, _err := client.WithdrawTwiceOneEx(request, headers, runtime)
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
func (client *Client) WithdrawTwiceOneEx(request *WithdrawTwiceOneRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *WithdrawTwiceOneResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &WithdrawTwiceOneResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.demosdk.twice.one.withdraw"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) OperateTwiceOne(request *OperateTwiceOneRequest) (_result *OperateTwiceOneResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &OperateTwiceOneResponse{}
	_body, _err := client.OperateTwiceOneEx(request, headers, runtime)
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
func (client *Client) OperateTwiceOneEx(request *OperateTwiceOneRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *OperateTwiceOneResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &OperateTwiceOneResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.demosdk.twice.one.operate"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) QueryTwiceTwo(request *QueryTwiceTwoRequest) (_result *QueryTwiceTwoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryTwiceTwoResponse{}
	_body, _err := client.QueryTwiceTwoEx(request, headers, runtime)
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
func (client *Client) QueryTwiceTwoEx(request *QueryTwiceTwoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryTwiceTwoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryTwiceTwoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.demosdk.twice.two.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 测试刷新cachekey
 * Summary: 测试刷新cachekey
 */
func (client *Client) QueryTest(request *QueryTestRequest) (_result *QueryTestResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryTestResponse{}
	_body, _err := client.QueryTestEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 测试刷新cachekey
 * Summary: 测试刷新cachekey
 */
func (client *Client) QueryTestEx(request *QueryTestRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryTestResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryTestResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.demosdk.test.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 测试刷新cachekey
 * Summary: 测试刷新cachekey
 */
func (client *Client) ImportTest(request *ImportTestRequest) (_result *ImportTestResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ImportTestResponse{}
	_body, _err := client.ImportTestEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 测试刷新cachekey
 * Summary: 测试刷新cachekey
 */
func (client *Client) ImportTestEx(request *ImportTestRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ImportTestResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ImportTestResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.demosdk.test.import"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 测试灰度刷新缓存范围
 * Summary: 测试灰度刷新缓存范围
 */
func (client *Client) StabilizeTest(request *StabilizeTestRequest) (_result *StabilizeTestResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &StabilizeTestResponse{}
	_body, _err := client.StabilizeTestEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 测试灰度刷新缓存范围
 * Summary: 测试灰度刷新缓存范围
 */
func (client *Client) StabilizeTestEx(request *StabilizeTestRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *StabilizeTestResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &StabilizeTestResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.demosdk.test.stabilize"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) QueryTwiceThree(request *QueryTwiceThreeRequest) (_result *QueryTwiceThreeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryTwiceThreeResponse{}
	_body, _err := client.QueryTwiceThreeEx(request, headers, runtime)
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
func (client *Client) QueryTwiceThreeEx(request *QueryTwiceThreeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryTwiceThreeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryTwiceThreeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.demosdk.twice.three.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
 * Description: 测试刷新cachekey
 * Summary: 测试刷新cachekey
 */
func (client *Client) UnstabilizeTest(request *UnstabilizeTestRequest) (_result *UnstabilizeTestResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UnstabilizeTestResponse{}
	_body, _err := client.UnstabilizeTestEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 测试刷新cachekey
 * Summary: 测试刷新cachekey
 */
func (client *Client) UnstabilizeTestEx(request *UnstabilizeTestRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UnstabilizeTestResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UnstabilizeTestResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.demosdk.test.unstabilize"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) QueryTestXc(request *QueryTestXcRequest) (_result *QueryTestXcResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryTestXcResponse{}
	_body, _err := client.QueryTestXcEx(request, headers, runtime)
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
func (client *Client) QueryTestXcEx(request *QueryTestXcRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryTestXcResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryTestXcResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.demosdk.test.xc.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) QueryTestSya(request *QueryTestSyaRequest) (_result *QueryTestSyaResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryTestSyaResponse{}
	_body, _err := client.QueryTestSyaEx(request, headers, runtime)
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
func (client *Client) QueryTestSyaEx(request *QueryTestSyaRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryTestSyaResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryTestSyaResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.demosdk.test.sya.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 用于个人工作台二期测试使用
 * Summary: 用于个人工作台二期测试使用
 */
func (client *Client) QueryQqqWww(request *QueryQqqWwwRequest) (_result *QueryQqqWwwResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryQqqWwwResponse{}
	_body, _err := client.QueryQqqWwwEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 用于个人工作台二期测试使用
 * Summary: 用于个人工作台二期测试使用
 */
func (client *Client) QueryQqqWwwEx(request *QueryQqqWwwRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryQqqWwwResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryQqqWwwResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.demosdk.qqq.www.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) StabilizeTwiceThree(request *StabilizeTwiceThreeRequest) (_result *StabilizeTwiceThreeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &StabilizeTwiceThreeResponse{}
	_body, _err := client.StabilizeTwiceThreeEx(request, headers, runtime)
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
func (client *Client) StabilizeTwiceThreeEx(request *StabilizeTwiceThreeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *StabilizeTwiceThreeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &StabilizeTwiceThreeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.demosdk.twice.three.stabilize"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) UnstabilizeTwiceThree(request *UnstabilizeTwiceThreeRequest) (_result *UnstabilizeTwiceThreeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UnstabilizeTwiceThreeResponse{}
	_body, _err := client.UnstabilizeTwiceThreeEx(request, headers, runtime)
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
func (client *Client) UnstabilizeTwiceThreeEx(request *UnstabilizeTwiceThreeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UnstabilizeTwiceThreeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UnstabilizeTwiceThreeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.demosdk.twice.three.unstabilize"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 测试用
 * Summary: 测试用
 */
func (client *Client) QueryBbbAatest(request *QueryBbbAatestRequest) (_result *QueryBbbAatestResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryBbbAatestResponse{}
	_body, _err := client.QueryBbbAatestEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 测试用
 * Summary: 测试用
 */
func (client *Client) QueryBbbAatestEx(request *QueryBbbAatestRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryBbbAatestResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryBbbAatestResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.demosdk.bbb.aatest.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 测试接口
 * Summary: 测试接口
 */
func (client *Client) ParamLiuyzTest(request *ParamLiuyzTestRequest) (_result *ParamLiuyzTestResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ParamLiuyzTestResponse{}
	_body, _err := client.ParamLiuyzTestEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 测试接口
 * Summary: 测试接口
 */
func (client *Client) ParamLiuyzTestEx(request *ParamLiuyzTestRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ParamLiuyzTestResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ParamLiuyzTestResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.demosdk.liuyz.test.param"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
