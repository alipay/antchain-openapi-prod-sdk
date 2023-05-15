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

// 123
type FaceImage struct {
	// 123
	Content *string `json:"content,omitempty" xml:"content,omitempty"`
	// 123
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

type EchoDemoGatewayCheckRequest struct {
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

func (s EchoDemoGatewayCheckRequest) String() string {
	return tea.Prettify(s)
}

func (s EchoDemoGatewayCheckRequest) GoString() string {
	return s.String()
}

func (s *EchoDemoGatewayCheckRequest) SetAuthToken(v string) *EchoDemoGatewayCheckRequest {
	s.AuthToken = &v
	return s
}

func (s *EchoDemoGatewayCheckRequest) SetProductInstanceId(v string) *EchoDemoGatewayCheckRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *EchoDemoGatewayCheckRequest) SetInputArray(v []*TestStruct) *EchoDemoGatewayCheckRequest {
	s.InputArray = v
	return s
}

func (s *EchoDemoGatewayCheckRequest) SetFileObject(v io.Reader) *EchoDemoGatewayCheckRequest {
	s.FileObject = v
	return s
}

func (s *EchoDemoGatewayCheckRequest) SetFileObjectName(v string) *EchoDemoGatewayCheckRequest {
	s.FileObjectName = &v
	return s
}

func (s *EchoDemoGatewayCheckRequest) SetFileId(v string) *EchoDemoGatewayCheckRequest {
	s.FileId = &v
	return s
}

func (s *EchoDemoGatewayCheckRequest) SetInputInt(v int64) *EchoDemoGatewayCheckRequest {
	s.InputInt = &v
	return s
}

func (s *EchoDemoGatewayCheckRequest) SetFileName(v string) *EchoDemoGatewayCheckRequest {
	s.FileName = &v
	return s
}

type EchoDemoGatewayCheckResponse struct {
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

func (s EchoDemoGatewayCheckResponse) String() string {
	return tea.Prettify(s)
}

func (s EchoDemoGatewayCheckResponse) GoString() string {
	return s.String()
}

func (s *EchoDemoGatewayCheckResponse) SetReqMsgId(v string) *EchoDemoGatewayCheckResponse {
	s.ReqMsgId = &v
	return s
}

func (s *EchoDemoGatewayCheckResponse) SetResultCode(v string) *EchoDemoGatewayCheckResponse {
	s.ResultCode = &v
	return s
}

func (s *EchoDemoGatewayCheckResponse) SetResultMsg(v string) *EchoDemoGatewayCheckResponse {
	s.ResultMsg = &v
	return s
}

func (s *EchoDemoGatewayCheckResponse) SetOutputDemo(v *DemoClass) *EchoDemoGatewayCheckResponse {
	s.OutputDemo = v
	return s
}

func (s *EchoDemoGatewayCheckResponse) SetOutputString(v string) *EchoDemoGatewayCheckResponse {
	s.OutputString = &v
	return s
}

func (s *EchoDemoGatewayCheckResponse) SetFileUrl(v string) *EchoDemoGatewayCheckResponse {
	s.FileUrl = &v
	return s
}

type BindDemoCenterAbilityRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s BindDemoCenterAbilityRequest) String() string {
	return tea.Prettify(s)
}

func (s BindDemoCenterAbilityRequest) GoString() string {
	return s.String()
}

func (s *BindDemoCenterAbilityRequest) SetAuthToken(v string) *BindDemoCenterAbilityRequest {
	s.AuthToken = &v
	return s
}

func (s *BindDemoCenterAbilityRequest) SetProductInstanceId(v string) *BindDemoCenterAbilityRequest {
	s.ProductInstanceId = &v
	return s
}

type BindDemoCenterAbilityResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s BindDemoCenterAbilityResponse) String() string {
	return tea.Prettify(s)
}

func (s BindDemoCenterAbilityResponse) GoString() string {
	return s.String()
}

func (s *BindDemoCenterAbilityResponse) SetReqMsgId(v string) *BindDemoCenterAbilityResponse {
	s.ReqMsgId = &v
	return s
}

func (s *BindDemoCenterAbilityResponse) SetResultCode(v string) *BindDemoCenterAbilityResponse {
	s.ResultCode = &v
	return s
}

func (s *BindDemoCenterAbilityResponse) SetResultMsg(v string) *BindDemoCenterAbilityResponse {
	s.ResultMsg = &v
	return s
}

type BindDemoMoreAbilityTestabcRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s BindDemoMoreAbilityTestabcRequest) String() string {
	return tea.Prettify(s)
}

func (s BindDemoMoreAbilityTestabcRequest) GoString() string {
	return s.String()
}

func (s *BindDemoMoreAbilityTestabcRequest) SetAuthToken(v string) *BindDemoMoreAbilityTestabcRequest {
	s.AuthToken = &v
	return s
}

func (s *BindDemoMoreAbilityTestabcRequest) SetProductInstanceId(v string) *BindDemoMoreAbilityTestabcRequest {
	s.ProductInstanceId = &v
	return s
}

type BindDemoMoreAbilityTestabcResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s BindDemoMoreAbilityTestabcResponse) String() string {
	return tea.Prettify(s)
}

func (s BindDemoMoreAbilityTestabcResponse) GoString() string {
	return s.String()
}

func (s *BindDemoMoreAbilityTestabcResponse) SetReqMsgId(v string) *BindDemoMoreAbilityTestabcResponse {
	s.ReqMsgId = &v
	return s
}

func (s *BindDemoMoreAbilityTestabcResponse) SetResultCode(v string) *BindDemoMoreAbilityTestabcResponse {
	s.ResultCode = &v
	return s
}

func (s *BindDemoMoreAbilityTestabcResponse) SetResultMsg(v string) *BindDemoMoreAbilityTestabcResponse {
	s.ResultMsg = &v
	return s
}

type MatchInternationalDemoZolozFacecompareRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 123
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 123
	Face1 *FaceImage `json:"face1,omitempty" xml:"face1,omitempty"`
	// 123
	Face2 *FaceImage `json:"face2,omitempty" xml:"face2,omitempty"`
}

func (s MatchInternationalDemoZolozFacecompareRequest) String() string {
	return tea.Prettify(s)
}

func (s MatchInternationalDemoZolozFacecompareRequest) GoString() string {
	return s.String()
}

func (s *MatchInternationalDemoZolozFacecompareRequest) SetAuthToken(v string) *MatchInternationalDemoZolozFacecompareRequest {
	s.AuthToken = &v
	return s
}

func (s *MatchInternationalDemoZolozFacecompareRequest) SetProductInstanceId(v string) *MatchInternationalDemoZolozFacecompareRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *MatchInternationalDemoZolozFacecompareRequest) SetBizId(v string) *MatchInternationalDemoZolozFacecompareRequest {
	s.BizId = &v
	return s
}

func (s *MatchInternationalDemoZolozFacecompareRequest) SetFace1(v *FaceImage) *MatchInternationalDemoZolozFacecompareRequest {
	s.Face1 = v
	return s
}

func (s *MatchInternationalDemoZolozFacecompareRequest) SetFace2(v *FaceImage) *MatchInternationalDemoZolozFacecompareRequest {
	s.Face2 = v
	return s
}

type MatchInternationalDemoZolozFacecompareResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 123
	TransactionId *string `json:"transaction_id,omitempty" xml:"transaction_id,omitempty"`
	// 123
	SamePerson *bool `json:"same_person,omitempty" xml:"same_person,omitempty"`
	// 100
	Score *string `json:"score,omitempty" xml:"score,omitempty"`
}

func (s MatchInternationalDemoZolozFacecompareResponse) String() string {
	return tea.Prettify(s)
}

func (s MatchInternationalDemoZolozFacecompareResponse) GoString() string {
	return s.String()
}

func (s *MatchInternationalDemoZolozFacecompareResponse) SetReqMsgId(v string) *MatchInternationalDemoZolozFacecompareResponse {
	s.ReqMsgId = &v
	return s
}

func (s *MatchInternationalDemoZolozFacecompareResponse) SetResultCode(v string) *MatchInternationalDemoZolozFacecompareResponse {
	s.ResultCode = &v
	return s
}

func (s *MatchInternationalDemoZolozFacecompareResponse) SetResultMsg(v string) *MatchInternationalDemoZolozFacecompareResponse {
	s.ResultMsg = &v
	return s
}

func (s *MatchInternationalDemoZolozFacecompareResponse) SetTransactionId(v string) *MatchInternationalDemoZolozFacecompareResponse {
	s.TransactionId = &v
	return s
}

func (s *MatchInternationalDemoZolozFacecompareResponse) SetSamePerson(v bool) *MatchInternationalDemoZolozFacecompareResponse {
	s.SamePerson = &v
	return s
}

func (s *MatchInternationalDemoZolozFacecompareResponse) SetScore(v string) *MatchInternationalDemoZolozFacecompareResponse {
	s.Score = &v
	return s
}

type QueryInternationalDemoAaaBbbRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s QueryInternationalDemoAaaBbbRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryInternationalDemoAaaBbbRequest) GoString() string {
	return s.String()
}

func (s *QueryInternationalDemoAaaBbbRequest) SetAuthToken(v string) *QueryInternationalDemoAaaBbbRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryInternationalDemoAaaBbbRequest) SetProductInstanceId(v string) *QueryInternationalDemoAaaBbbRequest {
	s.ProductInstanceId = &v
	return s
}

type QueryInternationalDemoAaaBbbResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s QueryInternationalDemoAaaBbbResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryInternationalDemoAaaBbbResponse) GoString() string {
	return s.String()
}

func (s *QueryInternationalDemoAaaBbbResponse) SetReqMsgId(v string) *QueryInternationalDemoAaaBbbResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryInternationalDemoAaaBbbResponse) SetResultCode(v string) *QueryInternationalDemoAaaBbbResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryInternationalDemoAaaBbbResponse) SetResultMsg(v string) *QueryInternationalDemoAaaBbbResponse {
	s.ResultMsg = &v
	return s
}

type CheckInternationalDemoZolozHealthRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 1123
	Data *string `json:"data,omitempty" xml:"data,omitempty" require:"true"`
}

func (s CheckInternationalDemoZolozHealthRequest) String() string {
	return tea.Prettify(s)
}

func (s CheckInternationalDemoZolozHealthRequest) GoString() string {
	return s.String()
}

func (s *CheckInternationalDemoZolozHealthRequest) SetAuthToken(v string) *CheckInternationalDemoZolozHealthRequest {
	s.AuthToken = &v
	return s
}

func (s *CheckInternationalDemoZolozHealthRequest) SetProductInstanceId(v string) *CheckInternationalDemoZolozHealthRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CheckInternationalDemoZolozHealthRequest) SetData(v string) *CheckInternationalDemoZolozHealthRequest {
	s.Data = &v
	return s
}

type CheckInternationalDemoZolozHealthResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CheckInternationalDemoZolozHealthResponse) String() string {
	return tea.Prettify(s)
}

func (s CheckInternationalDemoZolozHealthResponse) GoString() string {
	return s.String()
}

func (s *CheckInternationalDemoZolozHealthResponse) SetReqMsgId(v string) *CheckInternationalDemoZolozHealthResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CheckInternationalDemoZolozHealthResponse) SetResultCode(v string) *CheckInternationalDemoZolozHealthResponse {
	s.ResultCode = &v
	return s
}

func (s *CheckInternationalDemoZolozHealthResponse) SetResultMsg(v string) *CheckInternationalDemoZolozHealthResponse {
	s.ResultMsg = &v
	return s
}

type GetInternationalDemoAaaBbbRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s GetInternationalDemoAaaBbbRequest) String() string {
	return tea.Prettify(s)
}

func (s GetInternationalDemoAaaBbbRequest) GoString() string {
	return s.String()
}

func (s *GetInternationalDemoAaaBbbRequest) SetAuthToken(v string) *GetInternationalDemoAaaBbbRequest {
	s.AuthToken = &v
	return s
}

func (s *GetInternationalDemoAaaBbbRequest) SetProductInstanceId(v string) *GetInternationalDemoAaaBbbRequest {
	s.ProductInstanceId = &v
	return s
}

type GetInternationalDemoAaaBbbResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s GetInternationalDemoAaaBbbResponse) String() string {
	return tea.Prettify(s)
}

func (s GetInternationalDemoAaaBbbResponse) GoString() string {
	return s.String()
}

func (s *GetInternationalDemoAaaBbbResponse) SetReqMsgId(v string) *GetInternationalDemoAaaBbbResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetInternationalDemoAaaBbbResponse) SetResultCode(v string) *GetInternationalDemoAaaBbbResponse {
	s.ResultCode = &v
	return s
}

func (s *GetInternationalDemoAaaBbbResponse) SetResultMsg(v string) *GetInternationalDemoAaaBbbResponse {
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
				"sdk_version":      tea.String("1.0.4"),
				"_prod_code":       tea.String("ak_d9fd09cd1986473d9a4b8dde727aa361"),
				"_prod_channel":    tea.String("saas"),
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
 * Description: Demo接口，返回当输入的值
 * Summary: 返回输入值
 */
func (client *Client) EchoDemoGatewayCheck(request *EchoDemoGatewayCheckRequest) (_result *EchoDemoGatewayCheckResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &EchoDemoGatewayCheckResponse{}
	_body, _err := client.EchoDemoGatewayCheckEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: Demo接口，返回当输入的值
 * Summary: 返回输入值
 */
func (client *Client) EchoDemoGatewayCheckEx(request *EchoDemoGatewayCheckRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *EchoDemoGatewayCheckResponse, _err error) {
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

		if !tea.BoolValue(antchainutil.IsSuccess(uploadResp.ResultCode, tea.String("ok"))) {
			echoDemoGatewayCheckResponse := &EchoDemoGatewayCheckResponse{
				ReqMsgId:   uploadResp.ReqMsgId,
				ResultCode: uploadResp.ResultCode,
				ResultMsg:  uploadResp.ResultMsg,
			}
			_result = echoDemoGatewayCheckResponse
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
	_result = &EchoDemoGatewayCheckResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.gateway.check.echo"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) BindDemoCenterAbility(request *BindDemoCenterAbilityRequest) (_result *BindDemoCenterAbilityResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &BindDemoCenterAbilityResponse{}
	_body, _err := client.BindDemoCenterAbilityEx(request, headers, runtime)
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
func (client *Client) BindDemoCenterAbilityEx(request *BindDemoCenterAbilityRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *BindDemoCenterAbilityResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &BindDemoCenterAbilityResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.center.ability.bind"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 测试API绑定多个标签时的情况
 * Summary: API绑定多个标签
 */
func (client *Client) BindDemoMoreAbilityTestabc(request *BindDemoMoreAbilityTestabcRequest) (_result *BindDemoMoreAbilityTestabcResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &BindDemoMoreAbilityTestabcResponse{}
	_body, _err := client.BindDemoMoreAbilityTestabcEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 测试API绑定多个标签时的情况
 * Summary: API绑定多个标签
 */
func (client *Client) BindDemoMoreAbilityTestabcEx(request *BindDemoMoreAbilityTestabcRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *BindDemoMoreAbilityTestabcResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &BindDemoMoreAbilityTestabcResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("demo.more.ability.testabc.bind"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: test zoloz 方法 update again
 * Summary: test zoloz 方法
 */
func (client *Client) MatchInternationalDemoZolozFacecompare(request *MatchInternationalDemoZolozFacecompareRequest) (_result *MatchInternationalDemoZolozFacecompareResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &MatchInternationalDemoZolozFacecompareResponse{}
	_body, _err := client.MatchInternationalDemoZolozFacecompareEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: test zoloz 方法 update again
 * Summary: test zoloz 方法
 */
func (client *Client) MatchInternationalDemoZolozFacecompareEx(request *MatchInternationalDemoZolozFacecompareRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *MatchInternationalDemoZolozFacecompareResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &MatchInternationalDemoZolozFacecompareResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("international.demo.zoloz.facecompare.match"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: cj test 111
 * Summary: cj test
 */
func (client *Client) QueryInternationalDemoAaaBbb(request *QueryInternationalDemoAaaBbbRequest) (_result *QueryInternationalDemoAaaBbbResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryInternationalDemoAaaBbbResponse{}
	_body, _err := client.QueryInternationalDemoAaaBbbEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: cj test 111
 * Summary: cj test
 */
func (client *Client) QueryInternationalDemoAaaBbbEx(request *QueryInternationalDemoAaaBbbRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryInternationalDemoAaaBbbResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryInternationalDemoAaaBbbResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("international.demo.aaa.bbb.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 测试大安全接口
 * Summary: 测试大安全接口
 */
func (client *Client) CheckInternationalDemoZolozHealth(request *CheckInternationalDemoZolozHealthRequest) (_result *CheckInternationalDemoZolozHealthResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CheckInternationalDemoZolozHealthResponse{}
	_body, _err := client.CheckInternationalDemoZolozHealthEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 测试大安全接口
 * Summary: 测试大安全接口
 */
func (client *Client) CheckInternationalDemoZolozHealthEx(request *CheckInternationalDemoZolozHealthRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CheckInternationalDemoZolozHealthResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CheckInternationalDemoZolozHealthResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("international.demo.zoloz.health.check"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: demo get fr inter desc
 * Summary: demo get fr inter
 */
func (client *Client) GetInternationalDemoAaaBbb(request *GetInternationalDemoAaaBbbRequest) (_result *GetInternationalDemoAaaBbbResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetInternationalDemoAaaBbbResponse{}
	_body, _err := client.GetInternationalDemoAaaBbbEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: demo get fr inter desc
 * Summary: demo get fr inter
 */
func (client *Client) GetInternationalDemoAaaBbbEx(request *GetInternationalDemoAaaBbbRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetInternationalDemoAaaBbbResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetInternationalDemoAaaBbbResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("international.demo.aaa.bbb.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
