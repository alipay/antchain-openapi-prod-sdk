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

// 通话标签
type CallTags struct {
	// 一级标签
	// example:
	//
	// ""
	PrimaryTag *string `json:"primary_tag,omitempty" xml:"primary_tag,omitempty" require:"true"`
	// 二级标签
	// example:
	//
	// ""
	SecondaryTag *string `json:"secondary_tag,omitempty" xml:"secondary_tag,omitempty" require:"true"`
}

func (s CallTags) String() string {
	return tea.Prettify(s)
}

func (s CallTags) GoString() string {
	return s.String()
}

func (s *CallTags) SetPrimaryTag(v string) *CallTags {
	s.PrimaryTag = &v
	return s
}

func (s *CallTags) SetSecondaryTag(v string) *CallTags {
	s.SecondaryTag = &v
	return s
}

// 录音全文，按对话轮次组织
type Transcript struct {
	// 说话角色
	// example:
	//
	// ""
	Role *string `json:"role,omitempty" xml:"role,omitempty" require:"true"`
	// 说话内容
	// example:
	//
	// ""
	Content *string `json:"content,omitempty" xml:"content,omitempty" require:"true"`
	// 开始时间，ISO 8601 格式
	// example:
	//
	// ""
	StartTime *string `json:"start_time,omitempty" xml:"start_time,omitempty" require:"true"`
	// 结束时间，ISO 8601 格式
	// example:
	//
	// ""
	EndTime *string `json:"end_time,omitempty" xml:"end_time,omitempty" require:"true"`
}

func (s Transcript) String() string {
	return tea.Prettify(s)
}

func (s Transcript) GoString() string {
	return s.String()
}

func (s *Transcript) SetRole(v string) *Transcript {
	s.Role = &v
	return s
}

func (s *Transcript) SetContent(v string) *Transcript {
	s.Content = &v
	return s
}

func (s *Transcript) SetStartTime(v string) *Transcript {
	s.StartTime = &v
	return s
}

func (s *Transcript) SetEndTime(v string) *Transcript {
	s.EndTime = &v
	return s
}

type QueryCustomerOverdueRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 客户号
	CustomerAccount *string `json:"customer_account,omitempty" xml:"customer_account,omitempty" require:"true"`
	// 产品类型
	ProductType *string `json:"product_type,omitempty" xml:"product_type,omitempty" require:"true"`
}

func (s QueryCustomerOverdueRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryCustomerOverdueRequest) GoString() string {
	return s.String()
}

func (s *QueryCustomerOverdueRequest) SetAuthToken(v string) *QueryCustomerOverdueRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryCustomerOverdueRequest) SetProductInstanceId(v string) *QueryCustomerOverdueRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryCustomerOverdueRequest) SetCustomerAccount(v string) *QueryCustomerOverdueRequest {
	s.CustomerAccount = &v
	return s
}

func (s *QueryCustomerOverdueRequest) SetProductType(v string) *QueryCustomerOverdueRequest {
	s.ProductType = &v
	return s
}

type QueryCustomerOverdueResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// S:成功,F:失败
	Flag *string `json:"flag,omitempty" xml:"flag,omitempty"`
	// 0:成功,1:失败
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 成功or失败
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
	// true : 逾期 false: 不逾期
	Data *bool `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QueryCustomerOverdueResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryCustomerOverdueResponse) GoString() string {
	return s.String()
}

func (s *QueryCustomerOverdueResponse) SetReqMsgId(v string) *QueryCustomerOverdueResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryCustomerOverdueResponse) SetResultCode(v string) *QueryCustomerOverdueResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryCustomerOverdueResponse) SetResultMsg(v string) *QueryCustomerOverdueResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryCustomerOverdueResponse) SetFlag(v string) *QueryCustomerOverdueResponse {
	s.Flag = &v
	return s
}

func (s *QueryCustomerOverdueResponse) SetCode(v int64) *QueryCustomerOverdueResponse {
	s.Code = &v
	return s
}

func (s *QueryCustomerOverdueResponse) SetMsg(v string) *QueryCustomerOverdueResponse {
	s.Msg = &v
	return s
}

func (s *QueryCustomerOverdueResponse) SetData(v bool) *QueryCustomerOverdueResponse {
	s.Data = &v
	return s
}

type QueryCustomerRepaylinkRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 客户号
	CustNo *string `json:"cust_no,omitempty" xml:"cust_no,omitempty" require:"true"`
	// 模版编号
	SmsTemplateNo *string `json:"sms_template_no,omitempty" xml:"sms_template_no,omitempty" require:"true"`
}

func (s QueryCustomerRepaylinkRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryCustomerRepaylinkRequest) GoString() string {
	return s.String()
}

func (s *QueryCustomerRepaylinkRequest) SetAuthToken(v string) *QueryCustomerRepaylinkRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryCustomerRepaylinkRequest) SetProductInstanceId(v string) *QueryCustomerRepaylinkRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryCustomerRepaylinkRequest) SetCustNo(v string) *QueryCustomerRepaylinkRequest {
	s.CustNo = &v
	return s
}

func (s *QueryCustomerRepaylinkRequest) SetSmsTemplateNo(v string) *QueryCustomerRepaylinkRequest {
	s.SmsTemplateNo = &v
	return s
}

type QueryCustomerRepaylinkResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// S:成功,F:失败
	Flag *string `json:"flag,omitempty" xml:"flag,omitempty"`
	// 0:成功,1:失败
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 成功or失败
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
	// 生成的链接码，如果生成失败返回null , shortLink-短信链接，checkCode-校验码
	// eg：
	// {"custNo":"CT001","shortLink":"https://lawyer.360-jr.com/common/index","checkCode":"awdwa232"}
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QueryCustomerRepaylinkResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryCustomerRepaylinkResponse) GoString() string {
	return s.String()
}

func (s *QueryCustomerRepaylinkResponse) SetReqMsgId(v string) *QueryCustomerRepaylinkResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryCustomerRepaylinkResponse) SetResultCode(v string) *QueryCustomerRepaylinkResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryCustomerRepaylinkResponse) SetResultMsg(v string) *QueryCustomerRepaylinkResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryCustomerRepaylinkResponse) SetFlag(v string) *QueryCustomerRepaylinkResponse {
	s.Flag = &v
	return s
}

func (s *QueryCustomerRepaylinkResponse) SetCode(v int64) *QueryCustomerRepaylinkResponse {
	s.Code = &v
	return s
}

func (s *QueryCustomerRepaylinkResponse) SetMsg(v string) *QueryCustomerRepaylinkResponse {
	s.Msg = &v
	return s
}

func (s *QueryCustomerRepaylinkResponse) SetData(v string) *QueryCustomerRepaylinkResponse {
	s.Data = &v
	return s
}

type QueryCustomerWxleadlinkRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 客户号
	CustNo *string `json:"cust_no,omitempty" xml:"cust_no,omitempty" require:"true"`
	// 案件号
	CaseCode *string `json:"case_code,omitempty" xml:"case_code,omitempty" require:"true"`
	// AES加密手机号
	Phone *string `json:"phone,omitempty" xml:"phone,omitempty" require:"true"`
	// 产品类型
	ProductType *string `json:"product_type,omitempty" xml:"product_type,omitempty" require:"true"`
	// 约定固定值-一般是对应平台的缩写
	CreateBy *string `json:"create_by,omitempty" xml:"create_by,omitempty" require:"true"`
}

func (s QueryCustomerWxleadlinkRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryCustomerWxleadlinkRequest) GoString() string {
	return s.String()
}

func (s *QueryCustomerWxleadlinkRequest) SetAuthToken(v string) *QueryCustomerWxleadlinkRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryCustomerWxleadlinkRequest) SetProductInstanceId(v string) *QueryCustomerWxleadlinkRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryCustomerWxleadlinkRequest) SetCustNo(v string) *QueryCustomerWxleadlinkRequest {
	s.CustNo = &v
	return s
}

func (s *QueryCustomerWxleadlinkRequest) SetCaseCode(v string) *QueryCustomerWxleadlinkRequest {
	s.CaseCode = &v
	return s
}

func (s *QueryCustomerWxleadlinkRequest) SetPhone(v string) *QueryCustomerWxleadlinkRequest {
	s.Phone = &v
	return s
}

func (s *QueryCustomerWxleadlinkRequest) SetProductType(v string) *QueryCustomerWxleadlinkRequest {
	s.ProductType = &v
	return s
}

func (s *QueryCustomerWxleadlinkRequest) SetCreateBy(v string) *QueryCustomerWxleadlinkRequest {
	s.CreateBy = &v
	return s
}

type QueryCustomerWxleadlinkResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// S:成功,F:失败
	Flag *string `json:"flag,omitempty" xml:"flag,omitempty"`
	// 0:成功,1:失败
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 成功or失败
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
	// 生成的链接码，如果生成失败返回null , qwshortLink-短信链接，checkCode-校验码
	// eg：
	// {"custNo":"CT001","qwshortLink":"https://lawyer.360-jr.com/common/index","checkCode":"awdwa232"}
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QueryCustomerWxleadlinkResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryCustomerWxleadlinkResponse) GoString() string {
	return s.String()
}

func (s *QueryCustomerWxleadlinkResponse) SetReqMsgId(v string) *QueryCustomerWxleadlinkResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryCustomerWxleadlinkResponse) SetResultCode(v string) *QueryCustomerWxleadlinkResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryCustomerWxleadlinkResponse) SetResultMsg(v string) *QueryCustomerWxleadlinkResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryCustomerWxleadlinkResponse) SetFlag(v string) *QueryCustomerWxleadlinkResponse {
	s.Flag = &v
	return s
}

func (s *QueryCustomerWxleadlinkResponse) SetCode(v int64) *QueryCustomerWxleadlinkResponse {
	s.Code = &v
	return s
}

func (s *QueryCustomerWxleadlinkResponse) SetMsg(v string) *QueryCustomerWxleadlinkResponse {
	s.Msg = &v
	return s
}

func (s *QueryCustomerWxleadlinkResponse) SetData(v string) *QueryCustomerWxleadlinkResponse {
	s.Data = &v
	return s
}

type QueryCustomerTransartificialRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 客户号
	CustNo *string `json:"cust_no,omitempty" xml:"cust_no,omitempty" require:"true"`
	// 案件号
	CaseCode *string `json:"case_code,omitempty" xml:"case_code,omitempty"`
	// 产品类型
	ProductType *string `json:"product_type,omitempty" xml:"product_type,omitempty"`
	// 约定固定值-一般是对应平台的缩写
	CreateBy *string `json:"create_by,omitempty" xml:"create_by,omitempty"`
}

func (s QueryCustomerTransartificialRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryCustomerTransartificialRequest) GoString() string {
	return s.String()
}

func (s *QueryCustomerTransartificialRequest) SetAuthToken(v string) *QueryCustomerTransartificialRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryCustomerTransartificialRequest) SetProductInstanceId(v string) *QueryCustomerTransartificialRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryCustomerTransartificialRequest) SetCustNo(v string) *QueryCustomerTransartificialRequest {
	s.CustNo = &v
	return s
}

func (s *QueryCustomerTransartificialRequest) SetCaseCode(v string) *QueryCustomerTransartificialRequest {
	s.CaseCode = &v
	return s
}

func (s *QueryCustomerTransartificialRequest) SetProductType(v string) *QueryCustomerTransartificialRequest {
	s.ProductType = &v
	return s
}

func (s *QueryCustomerTransartificialRequest) SetCreateBy(v string) *QueryCustomerTransartificialRequest {
	s.CreateBy = &v
	return s
}

type QueryCustomerTransartificialResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// S:成功,F:失败
	Flag *string `json:"flag,omitempty" xml:"flag,omitempty"`
	// 0:成功,1:失败
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 成功or失败
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
	// SON字符串，返回是否可提前转人工
	// transArtificial : 默认N-不转人工，Y-转人工
	// eg：
	// {"custNo":"CT001","transArtificial":"Y"}
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QueryCustomerTransartificialResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryCustomerTransartificialResponse) GoString() string {
	return s.String()
}

func (s *QueryCustomerTransartificialResponse) SetReqMsgId(v string) *QueryCustomerTransartificialResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryCustomerTransartificialResponse) SetResultCode(v string) *QueryCustomerTransartificialResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryCustomerTransartificialResponse) SetResultMsg(v string) *QueryCustomerTransartificialResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryCustomerTransartificialResponse) SetFlag(v string) *QueryCustomerTransartificialResponse {
	s.Flag = &v
	return s
}

func (s *QueryCustomerTransartificialResponse) SetCode(v int64) *QueryCustomerTransartificialResponse {
	s.Code = &v
	return s
}

func (s *QueryCustomerTransartificialResponse) SetMsg(v string) *QueryCustomerTransartificialResponse {
	s.Msg = &v
	return s
}

func (s *QueryCustomerTransartificialResponse) SetData(v string) *QueryCustomerTransartificialResponse {
	s.Data = &v
	return s
}

type CallbackTaskCallresultRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 错误编码(0: 正确)
	ErrorCode *string `json:"error_code,omitempty" xml:"error_code,omitempty" require:"true"`
	// 通话结果
	DialResult *string `json:"dial_result,omitempty" xml:"dial_result,omitempty" require:"true"`
}

func (s CallbackTaskCallresultRequest) String() string {
	return tea.Prettify(s)
}

func (s CallbackTaskCallresultRequest) GoString() string {
	return s.String()
}

func (s *CallbackTaskCallresultRequest) SetAuthToken(v string) *CallbackTaskCallresultRequest {
	s.AuthToken = &v
	return s
}

func (s *CallbackTaskCallresultRequest) SetProductInstanceId(v string) *CallbackTaskCallresultRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CallbackTaskCallresultRequest) SetErrorCode(v string) *CallbackTaskCallresultRequest {
	s.ErrorCode = &v
	return s
}

func (s *CallbackTaskCallresultRequest) SetDialResult(v string) *CallbackTaskCallresultRequest {
	s.DialResult = &v
	return s
}

type CallbackTaskCallresultResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// S:成功,F:失败
	Flag *string `json:"flag,omitempty" xml:"flag,omitempty"`
	// 0:成功,1:失败
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 成功or失败
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
	// 结果说明
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s CallbackTaskCallresultResponse) String() string {
	return tea.Prettify(s)
}

func (s CallbackTaskCallresultResponse) GoString() string {
	return s.String()
}

func (s *CallbackTaskCallresultResponse) SetReqMsgId(v string) *CallbackTaskCallresultResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CallbackTaskCallresultResponse) SetResultCode(v string) *CallbackTaskCallresultResponse {
	s.ResultCode = &v
	return s
}

func (s *CallbackTaskCallresultResponse) SetResultMsg(v string) *CallbackTaskCallresultResponse {
	s.ResultMsg = &v
	return s
}

func (s *CallbackTaskCallresultResponse) SetFlag(v string) *CallbackTaskCallresultResponse {
	s.Flag = &v
	return s
}

func (s *CallbackTaskCallresultResponse) SetCode(v int64) *CallbackTaskCallresultResponse {
	s.Code = &v
	return s
}

func (s *CallbackTaskCallresultResponse) SetMsg(v string) *CallbackTaskCallresultResponse {
	s.Msg = &v
	return s
}

func (s *CallbackTaskCallresultResponse) SetData(v string) *CallbackTaskCallresultResponse {
	s.Data = &v
	return s
}

type CallbackTaskSmsresultRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 客户号
	ACaseId *string `json:"a_case_id,omitempty" xml:"a_case_id,omitempty" require:"true"`
	// 批次号
	BatchNo *string `json:"batch_no,omitempty" xml:"batch_no,omitempty" require:"true"`
	// 案件主联系人姓名 AES加密
	CollectedName *string `json:"collected_name,omitempty" xml:"collected_name,omitempty" require:"true"`
	// 联系人姓名 AES加密
	ContactName *string `json:"contact_name,omitempty" xml:"contact_name,omitempty" require:"true"`
	// 联系人号码 AES加密
	ContactPhone *string `json:"contact_phone,omitempty" xml:"contact_phone,omitempty" require:"true"`
	// 联系人状态（有意愿还款之类）
	ContactStatus *string `json:"contact_status,omitempty" xml:"contact_status,omitempty" require:"true"`
	// 短信内容
	Content *string `json:"content,omitempty" xml:"content,omitempty" require:"true"`
	// 还款日
	OverdueDate *string `json:"overdue_date,omitempty" xml:"overdue_date,omitempty" require:"true"`
	// 备注
	Remark *string `json:"remark,omitempty" xml:"remark,omitempty"`
	// 发送结果 21:客户回复接收成功 10:失败 11:成功
	SendResult *string `json:"send_result,omitempty" xml:"send_result,omitempty" require:"true"`
	// 发送方式：如果是系统发送，那么为必填(1-短信，2-语音，3-智能语音)
	SendWay *int64 `json:"send_way,omitempty" xml:"send_way,omitempty" require:"true"`
	// 唯一标识(可用来判重)
	SessionId *string `json:"session_id,omitempty" xml:"session_id,omitempty" require:"true"`
	// 发送时间(毫秒)
	Time *int64 `json:"time,omitempty" xml:"time,omitempty" require:"true"`
	// 1 发送 2 接收 -客户回复
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 约定固定值-一般是对应平台的缩写
	CreateBy *string `json:"create_by,omitempty" xml:"create_by,omitempty" require:"true"`
	// 短信模板
	TemplateNo *string `json:"template_no,omitempty" xml:"template_no,omitempty" require:"true"`
}

func (s CallbackTaskSmsresultRequest) String() string {
	return tea.Prettify(s)
}

func (s CallbackTaskSmsresultRequest) GoString() string {
	return s.String()
}

func (s *CallbackTaskSmsresultRequest) SetAuthToken(v string) *CallbackTaskSmsresultRequest {
	s.AuthToken = &v
	return s
}

func (s *CallbackTaskSmsresultRequest) SetProductInstanceId(v string) *CallbackTaskSmsresultRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CallbackTaskSmsresultRequest) SetACaseId(v string) *CallbackTaskSmsresultRequest {
	s.ACaseId = &v
	return s
}

func (s *CallbackTaskSmsresultRequest) SetBatchNo(v string) *CallbackTaskSmsresultRequest {
	s.BatchNo = &v
	return s
}

func (s *CallbackTaskSmsresultRequest) SetCollectedName(v string) *CallbackTaskSmsresultRequest {
	s.CollectedName = &v
	return s
}

func (s *CallbackTaskSmsresultRequest) SetContactName(v string) *CallbackTaskSmsresultRequest {
	s.ContactName = &v
	return s
}

func (s *CallbackTaskSmsresultRequest) SetContactPhone(v string) *CallbackTaskSmsresultRequest {
	s.ContactPhone = &v
	return s
}

func (s *CallbackTaskSmsresultRequest) SetContactStatus(v string) *CallbackTaskSmsresultRequest {
	s.ContactStatus = &v
	return s
}

func (s *CallbackTaskSmsresultRequest) SetContent(v string) *CallbackTaskSmsresultRequest {
	s.Content = &v
	return s
}

func (s *CallbackTaskSmsresultRequest) SetOverdueDate(v string) *CallbackTaskSmsresultRequest {
	s.OverdueDate = &v
	return s
}

func (s *CallbackTaskSmsresultRequest) SetRemark(v string) *CallbackTaskSmsresultRequest {
	s.Remark = &v
	return s
}

func (s *CallbackTaskSmsresultRequest) SetSendResult(v string) *CallbackTaskSmsresultRequest {
	s.SendResult = &v
	return s
}

func (s *CallbackTaskSmsresultRequest) SetSendWay(v int64) *CallbackTaskSmsresultRequest {
	s.SendWay = &v
	return s
}

func (s *CallbackTaskSmsresultRequest) SetSessionId(v string) *CallbackTaskSmsresultRequest {
	s.SessionId = &v
	return s
}

func (s *CallbackTaskSmsresultRequest) SetTime(v int64) *CallbackTaskSmsresultRequest {
	s.Time = &v
	return s
}

func (s *CallbackTaskSmsresultRequest) SetType(v string) *CallbackTaskSmsresultRequest {
	s.Type = &v
	return s
}

func (s *CallbackTaskSmsresultRequest) SetCreateBy(v string) *CallbackTaskSmsresultRequest {
	s.CreateBy = &v
	return s
}

func (s *CallbackTaskSmsresultRequest) SetTemplateNo(v string) *CallbackTaskSmsresultRequest {
	s.TemplateNo = &v
	return s
}

type CallbackTaskSmsresultResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// S:成功,F:失败
	Flag *string `json:"flag,omitempty" xml:"flag,omitempty"`
	// 0:成功,1:失败
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 成功or失败
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
	// 结果说明
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s CallbackTaskSmsresultResponse) String() string {
	return tea.Prettify(s)
}

func (s CallbackTaskSmsresultResponse) GoString() string {
	return s.String()
}

func (s *CallbackTaskSmsresultResponse) SetReqMsgId(v string) *CallbackTaskSmsresultResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CallbackTaskSmsresultResponse) SetResultCode(v string) *CallbackTaskSmsresultResponse {
	s.ResultCode = &v
	return s
}

func (s *CallbackTaskSmsresultResponse) SetResultMsg(v string) *CallbackTaskSmsresultResponse {
	s.ResultMsg = &v
	return s
}

func (s *CallbackTaskSmsresultResponse) SetFlag(v string) *CallbackTaskSmsresultResponse {
	s.Flag = &v
	return s
}

func (s *CallbackTaskSmsresultResponse) SetCode(v int64) *CallbackTaskSmsresultResponse {
	s.Code = &v
	return s
}

func (s *CallbackTaskSmsresultResponse) SetMsg(v string) *CallbackTaskSmsresultResponse {
	s.Msg = &v
	return s
}

func (s *CallbackTaskSmsresultResponse) SetData(v string) *CallbackTaskSmsresultResponse {
	s.Data = &v
	return s
}

type PushCustomerInternalmsgRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 客户号
	CustNo *string `json:"cust_no,omitempty" xml:"cust_no,omitempty" require:"true"`
	// 模版信息
	TemplateInfo *string `json:"template_info,omitempty" xml:"template_info,omitempty" require:"true"`
}

func (s PushCustomerInternalmsgRequest) String() string {
	return tea.Prettify(s)
}

func (s PushCustomerInternalmsgRequest) GoString() string {
	return s.String()
}

func (s *PushCustomerInternalmsgRequest) SetAuthToken(v string) *PushCustomerInternalmsgRequest {
	s.AuthToken = &v
	return s
}

func (s *PushCustomerInternalmsgRequest) SetProductInstanceId(v string) *PushCustomerInternalmsgRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PushCustomerInternalmsgRequest) SetCustNo(v string) *PushCustomerInternalmsgRequest {
	s.CustNo = &v
	return s
}

func (s *PushCustomerInternalmsgRequest) SetTemplateInfo(v string) *PushCustomerInternalmsgRequest {
	s.TemplateInfo = &v
	return s
}

type PushCustomerInternalmsgResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// S:成功,F:失败
	Flag *string `json:"flag,omitempty" xml:"flag,omitempty"`
	// 0:成功,1:失败
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 成功or失败
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
	// 结果说明
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s PushCustomerInternalmsgResponse) String() string {
	return tea.Prettify(s)
}

func (s PushCustomerInternalmsgResponse) GoString() string {
	return s.String()
}

func (s *PushCustomerInternalmsgResponse) SetReqMsgId(v string) *PushCustomerInternalmsgResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PushCustomerInternalmsgResponse) SetResultCode(v string) *PushCustomerInternalmsgResponse {
	s.ResultCode = &v
	return s
}

func (s *PushCustomerInternalmsgResponse) SetResultMsg(v string) *PushCustomerInternalmsgResponse {
	s.ResultMsg = &v
	return s
}

func (s *PushCustomerInternalmsgResponse) SetFlag(v string) *PushCustomerInternalmsgResponse {
	s.Flag = &v
	return s
}

func (s *PushCustomerInternalmsgResponse) SetCode(v int64) *PushCustomerInternalmsgResponse {
	s.Code = &v
	return s
}

func (s *PushCustomerInternalmsgResponse) SetMsg(v string) *PushCustomerInternalmsgResponse {
	s.Msg = &v
	return s
}

func (s *PushCustomerInternalmsgResponse) SetData(v string) *PushCustomerInternalmsgResponse {
	s.Data = &v
	return s
}

type CallbackProviderRobotcallRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// AI任务中的外呼编号
	Id *int64 `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 外呼号码
	Number *string `json:"number,omitempty" xml:"number,omitempty"`
	// 外呼号码MD5
	NumberMd5 *string `json:"number_md5,omitempty" xml:"number_md5,omitempty"`
	// 导入号码返回的批次号
	BatchId *string `json:"batch_id,omitempty" xml:"batch_id,omitempty"`
	// 1001：坐席-人工外呼，
	// 1002：坐席-AI外呼-不转人工，
	// 1003：坐席-AI外呼-接通转人工，
	// 1004：坐席-AI外呼-智能转人工；
	// 2001:批量-预测外呼，
	// 2002:批量-AI外呼-不转人工，
	// 2003:批量-AI外呼-接通转人工，
	// 2004: 批量-AI外呼-智能转人工,
	// 2005:批量-语音通知,
	// 3001:视频外呼
	CallType *int64 `json:"call_type,omitempty" xml:"call_type,omitempty" require:"true"`
	// 用户自定义标签
	Tag *string `json:"tag,omitempty" xml:"tag,omitempty"`
	// 外呼id
	CallId *string `json:"call_id,omitempty" xml:"call_id,omitempty" require:"true"`
	// 系统中的任务编号，若外呼类型为坐席主动外呼，则此处返回坐席ID
	TaskId *int64 `json:"task_id,omitempty" xml:"task_id,omitempty" require:"true"`
	// 任务的名称
	TaskName *string `json:"task_name,omitempty" xml:"task_name,omitempty" require:"true"`
	// 外呼的话术模版ID
	TemplateId *int64 `json:"template_id,omitempty" xml:"template_id,omitempty"`
	// 话术模版名称
	TemplateName *string `json:"template_name,omitempty" xml:"template_name,omitempty"`
	// 外呼状态编码
	StatusCode *int64 `json:"status_code,omitempty" xml:"status_code,omitempty" require:"true"`
	// 外呼状态，如"已接听"
	StatusDescription *string `json:"status_description,omitempty" xml:"status_description,omitempty" require:"true"`
	// 转人工状态编码
	TransferStatusCode *int64 `json:"transfer_status_code,omitempty" xml:"transfer_status_code,omitempty" require:"true"`
	// 转人工状态，可以为空
	TransferStatus *string `json:"transfer_status,omitempty" xml:"transfer_status,omitempty"`
	// 分配坐席id
	AgentId *int64 `json:"agent_id,omitempty" xml:"agent_id,omitempty"`
	// 建议填写坐席在贵司业务系统唯一标识，用于查询对应agentId；可以为空。
	AgentTag *string `json:"agent_tag,omitempty" xml:"agent_tag,omitempty"`
	// 坐席分机号
	AgentExtension *string `json:"agent_extension,omitempty" xml:"agent_extension,omitempty"`
	// 导入时间，格式:2019-01-09 14:14:19
	ImportTime *string `json:"import_time,omitempty" xml:"import_time,omitempty" require:"true"`
	// 开始拨号时间，格式：2019-01-09 14:14:19
	CallBeginTime *string `json:"call_begin_time,omitempty" xml:"call_begin_time,omitempty" require:"true"`
	// 振铃时长，单位毫秒
	RingTime *int64 `json:"ring_time,omitempty" xml:"ring_time,omitempty" require:"true"`
	// 通话接通时间，格式：2019-01-09 14:14:19
	AnswerTime *string `json:"answer_time,omitempty" xml:"answer_time,omitempty"`
	// AI通话时长，单位：大于1分钟，显示分钟秒，小于1分钟，显示秒
	SpeakingTime *string `json:"speaking_time,omitempty" xml:"speaking_time,omitempty" require:"true"`
	// AI通话时长，单位：秒
	SpeakingDuration *int64 `json:"speaking_duration,omitempty" xml:"speaking_duration,omitempty" require:"true"`
	// 通话挂断时间，格式：2019-01-09 14:14:19
	HangupTime *string `json:"hangup_time,omitempty" xml:"hangup_time,omitempty" require:"true"`
	// 对话轮次
	SpeakingTurns *string `json:"speaking_turns,omitempty" xml:"speaking_turns,omitempty" require:"true"`
	// 坐席通话时长，单位：大于1分钟，显示分钟秒，小于1分钟，显示秒
	AgentSpeakingTime *string `json:"agent_speaking_time,omitempty" xml:"agent_speaking_time,omitempty" require:"true"`
	// 坐席通话时长，单位：秒
	AgentSpeakingDuration *int64 `json:"agent_speaking_duration,omitempty" xml:"agent_speaking_duration,omitempty" require:"true"`
	// 意向标签
	IntentTag *string `json:"intent_tag,omitempty" xml:"intent_tag,omitempty" require:"true"`
	// 意向说明
	IntentDescription *string `json:"intent_description,omitempty" xml:"intent_description,omitempty" require:"true"`
	// 个性标签
	IndividualTag *string `json:"individual_tag,omitempty" xml:"individual_tag,omitempty"`
	// 回复关键字
	Keywords *string `json:"keywords,omitempty" xml:"keywords,omitempty"`
	// AI挂机1，坐席挂机2，客户挂机3
	HangupType *int64 `json:"hangup_type,omitempty" xml:"hangup_type,omitempty" require:"true"`
	// 挂机短信,1:发送 2:不发送
	Sms *string `json:"sms,omitempty" xml:"sms,omitempty" require:"true"`
	// 挂机WhatsApp
	Wa *string `json:"wa,omitempty" xml:"wa,omitempty" require:"true"`
	// 对话录音，URL，可以为空。录音异步上传，业务高峰可能会出现请求404的情况，可以稍后再重试获取。
	ChatRecord *string `json:"chat_record,omitempty" xml:"chat_record,omitempty"`
	// 对话记录,[{"fromNumber":"0","content": "你好，请问您是王小帅吗？","createTime": "2019-01-09 14:14:19"},{"fromNumber":"7945bd83237335e5376ff44d62e4f0ae","content":"嗯","createTime": "2019-01-09 14:14:20"}]
	Chats *string `json:"chats,omitempty" xml:"chats,omitempty"`
	// 加微信，0:不添加，1:添加
	AddWx *int64 `json:"add_wx,omitempty" xml:"add_wx,omitempty"`
	// 可选值：已申请、加微成功
	AddWxStatus *string `json:"add_wx_status,omitempty" xml:"add_wx_status,omitempty"`
	// 是否接通重呼,0正常外呼，1接通重呼
	AnswerRecall *int64 `json:"answer_recall,omitempty" xml:"answer_recall,omitempty" require:"true"`
	// 导入号码时的参数值
	Properties *string `json:"properties,omitempty" xml:"properties,omitempty"`
	// 当状态为已拦截时，可选值：
	// 黑名单拦截
	// 灰名单拦截
	// 异常号码拦截
	InterceptReason *string `json:"intercept_reason,omitempty" xml:"intercept_reason,omitempty"`
	// 企业id
	CompanyId *int64 `json:"company_id,omitempty" xml:"company_id,omitempty" require:"true"`
	// 线路返回的sip编码code
	SipCode *int64 `json:"sip_code,omitempty" xml:"sip_code,omitempty"`
	// 指的是触发转人工的时间点，格式如：2019-01-09 14:14:19
	TransferTime *string `json:"transfer_time,omitempty" xml:"transfer_time,omitempty"`
	// 触发转人工时，坐席组的ID
	SeatsGroupId *int64 `json:"seats_group_id,omitempty" xml:"seats_group_id,omitempty"`
	// 触发转人工时，坐席组的名称
	SeatsGroupName *string `json:"seats_group_name,omitempty" xml:"seats_group_name,omitempty"`
	// 线路通话时长,单位为毫秒，实际计费需向上取整转换为秒
	Bill *int64 `json:"bill,omitempty" xml:"bill,omitempty"`
	// 外呼回调时可透传的信息内容，可以为空
	ChannelTag *string `json:"channel_tag,omitempty" xml:"channel_tag,omitempty"`
}

func (s CallbackProviderRobotcallRequest) String() string {
	return tea.Prettify(s)
}

func (s CallbackProviderRobotcallRequest) GoString() string {
	return s.String()
}

func (s *CallbackProviderRobotcallRequest) SetAuthToken(v string) *CallbackProviderRobotcallRequest {
	s.AuthToken = &v
	return s
}

func (s *CallbackProviderRobotcallRequest) SetProductInstanceId(v string) *CallbackProviderRobotcallRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CallbackProviderRobotcallRequest) SetId(v int64) *CallbackProviderRobotcallRequest {
	s.Id = &v
	return s
}

func (s *CallbackProviderRobotcallRequest) SetNumber(v string) *CallbackProviderRobotcallRequest {
	s.Number = &v
	return s
}

func (s *CallbackProviderRobotcallRequest) SetNumberMd5(v string) *CallbackProviderRobotcallRequest {
	s.NumberMd5 = &v
	return s
}

func (s *CallbackProviderRobotcallRequest) SetBatchId(v string) *CallbackProviderRobotcallRequest {
	s.BatchId = &v
	return s
}

func (s *CallbackProviderRobotcallRequest) SetCallType(v int64) *CallbackProviderRobotcallRequest {
	s.CallType = &v
	return s
}

func (s *CallbackProviderRobotcallRequest) SetTag(v string) *CallbackProviderRobotcallRequest {
	s.Tag = &v
	return s
}

func (s *CallbackProviderRobotcallRequest) SetCallId(v string) *CallbackProviderRobotcallRequest {
	s.CallId = &v
	return s
}

func (s *CallbackProviderRobotcallRequest) SetTaskId(v int64) *CallbackProviderRobotcallRequest {
	s.TaskId = &v
	return s
}

func (s *CallbackProviderRobotcallRequest) SetTaskName(v string) *CallbackProviderRobotcallRequest {
	s.TaskName = &v
	return s
}

func (s *CallbackProviderRobotcallRequest) SetTemplateId(v int64) *CallbackProviderRobotcallRequest {
	s.TemplateId = &v
	return s
}

func (s *CallbackProviderRobotcallRequest) SetTemplateName(v string) *CallbackProviderRobotcallRequest {
	s.TemplateName = &v
	return s
}

func (s *CallbackProviderRobotcallRequest) SetStatusCode(v int64) *CallbackProviderRobotcallRequest {
	s.StatusCode = &v
	return s
}

func (s *CallbackProviderRobotcallRequest) SetStatusDescription(v string) *CallbackProviderRobotcallRequest {
	s.StatusDescription = &v
	return s
}

func (s *CallbackProviderRobotcallRequest) SetTransferStatusCode(v int64) *CallbackProviderRobotcallRequest {
	s.TransferStatusCode = &v
	return s
}

func (s *CallbackProviderRobotcallRequest) SetTransferStatus(v string) *CallbackProviderRobotcallRequest {
	s.TransferStatus = &v
	return s
}

func (s *CallbackProviderRobotcallRequest) SetAgentId(v int64) *CallbackProviderRobotcallRequest {
	s.AgentId = &v
	return s
}

func (s *CallbackProviderRobotcallRequest) SetAgentTag(v string) *CallbackProviderRobotcallRequest {
	s.AgentTag = &v
	return s
}

func (s *CallbackProviderRobotcallRequest) SetAgentExtension(v string) *CallbackProviderRobotcallRequest {
	s.AgentExtension = &v
	return s
}

func (s *CallbackProviderRobotcallRequest) SetImportTime(v string) *CallbackProviderRobotcallRequest {
	s.ImportTime = &v
	return s
}

func (s *CallbackProviderRobotcallRequest) SetCallBeginTime(v string) *CallbackProviderRobotcallRequest {
	s.CallBeginTime = &v
	return s
}

func (s *CallbackProviderRobotcallRequest) SetRingTime(v int64) *CallbackProviderRobotcallRequest {
	s.RingTime = &v
	return s
}

func (s *CallbackProviderRobotcallRequest) SetAnswerTime(v string) *CallbackProviderRobotcallRequest {
	s.AnswerTime = &v
	return s
}

func (s *CallbackProviderRobotcallRequest) SetSpeakingTime(v string) *CallbackProviderRobotcallRequest {
	s.SpeakingTime = &v
	return s
}

func (s *CallbackProviderRobotcallRequest) SetSpeakingDuration(v int64) *CallbackProviderRobotcallRequest {
	s.SpeakingDuration = &v
	return s
}

func (s *CallbackProviderRobotcallRequest) SetHangupTime(v string) *CallbackProviderRobotcallRequest {
	s.HangupTime = &v
	return s
}

func (s *CallbackProviderRobotcallRequest) SetSpeakingTurns(v string) *CallbackProviderRobotcallRequest {
	s.SpeakingTurns = &v
	return s
}

func (s *CallbackProviderRobotcallRequest) SetAgentSpeakingTime(v string) *CallbackProviderRobotcallRequest {
	s.AgentSpeakingTime = &v
	return s
}

func (s *CallbackProviderRobotcallRequest) SetAgentSpeakingDuration(v int64) *CallbackProviderRobotcallRequest {
	s.AgentSpeakingDuration = &v
	return s
}

func (s *CallbackProviderRobotcallRequest) SetIntentTag(v string) *CallbackProviderRobotcallRequest {
	s.IntentTag = &v
	return s
}

func (s *CallbackProviderRobotcallRequest) SetIntentDescription(v string) *CallbackProviderRobotcallRequest {
	s.IntentDescription = &v
	return s
}

func (s *CallbackProviderRobotcallRequest) SetIndividualTag(v string) *CallbackProviderRobotcallRequest {
	s.IndividualTag = &v
	return s
}

func (s *CallbackProviderRobotcallRequest) SetKeywords(v string) *CallbackProviderRobotcallRequest {
	s.Keywords = &v
	return s
}

func (s *CallbackProviderRobotcallRequest) SetHangupType(v int64) *CallbackProviderRobotcallRequest {
	s.HangupType = &v
	return s
}

func (s *CallbackProviderRobotcallRequest) SetSms(v string) *CallbackProviderRobotcallRequest {
	s.Sms = &v
	return s
}

func (s *CallbackProviderRobotcallRequest) SetWa(v string) *CallbackProviderRobotcallRequest {
	s.Wa = &v
	return s
}

func (s *CallbackProviderRobotcallRequest) SetChatRecord(v string) *CallbackProviderRobotcallRequest {
	s.ChatRecord = &v
	return s
}

func (s *CallbackProviderRobotcallRequest) SetChats(v string) *CallbackProviderRobotcallRequest {
	s.Chats = &v
	return s
}

func (s *CallbackProviderRobotcallRequest) SetAddWx(v int64) *CallbackProviderRobotcallRequest {
	s.AddWx = &v
	return s
}

func (s *CallbackProviderRobotcallRequest) SetAddWxStatus(v string) *CallbackProviderRobotcallRequest {
	s.AddWxStatus = &v
	return s
}

func (s *CallbackProviderRobotcallRequest) SetAnswerRecall(v int64) *CallbackProviderRobotcallRequest {
	s.AnswerRecall = &v
	return s
}

func (s *CallbackProviderRobotcallRequest) SetProperties(v string) *CallbackProviderRobotcallRequest {
	s.Properties = &v
	return s
}

func (s *CallbackProviderRobotcallRequest) SetInterceptReason(v string) *CallbackProviderRobotcallRequest {
	s.InterceptReason = &v
	return s
}

func (s *CallbackProviderRobotcallRequest) SetCompanyId(v int64) *CallbackProviderRobotcallRequest {
	s.CompanyId = &v
	return s
}

func (s *CallbackProviderRobotcallRequest) SetSipCode(v int64) *CallbackProviderRobotcallRequest {
	s.SipCode = &v
	return s
}

func (s *CallbackProviderRobotcallRequest) SetTransferTime(v string) *CallbackProviderRobotcallRequest {
	s.TransferTime = &v
	return s
}

func (s *CallbackProviderRobotcallRequest) SetSeatsGroupId(v int64) *CallbackProviderRobotcallRequest {
	s.SeatsGroupId = &v
	return s
}

func (s *CallbackProviderRobotcallRequest) SetSeatsGroupName(v string) *CallbackProviderRobotcallRequest {
	s.SeatsGroupName = &v
	return s
}

func (s *CallbackProviderRobotcallRequest) SetBill(v int64) *CallbackProviderRobotcallRequest {
	s.Bill = &v
	return s
}

func (s *CallbackProviderRobotcallRequest) SetChannelTag(v string) *CallbackProviderRobotcallRequest {
	s.ChannelTag = &v
	return s
}

type CallbackProviderRobotcallResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CallbackProviderRobotcallResponse) String() string {
	return tea.Prettify(s)
}

func (s CallbackProviderRobotcallResponse) GoString() string {
	return s.String()
}

func (s *CallbackProviderRobotcallResponse) SetReqMsgId(v string) *CallbackProviderRobotcallResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CallbackProviderRobotcallResponse) SetResultCode(v string) *CallbackProviderRobotcallResponse {
	s.ResultCode = &v
	return s
}

func (s *CallbackProviderRobotcallResponse) SetResultMsg(v string) *CallbackProviderRobotcallResponse {
	s.ResultMsg = &v
	return s
}

type CallbackLvRobotcallRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 关联发起呼叫时的请求ID（唯一关联键）
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty" require:"true"`
	// 案件唯一标识
	CaseId *string `json:"case_id,omitempty" xml:"case_id,omitempty" require:"true"`
	// 通话状态。示例： connected （已接通）、no_answer （无人接听）
	CallStatus *string `json:"call_status,omitempty" xml:"call_status,omitempty" require:"true"`
	// 外呼开始时间，ISO 8601格式
	CallStartTime *string `json:"call_start_time,omitempty" xml:"call_start_time,omitempty" require:"true"`
	// 外呼时长，单位：秒
	CallDuration *int64 `json:"call_duration,omitempty" xml:"call_duration,omitempty" require:"true"`
	// 通话总结
	CallSummary *string `json:"call_summary,omitempty" xml:"call_summary,omitempty" require:"true"`
	// 通话标签。一通通话仅返回一组标签
	CallTags *CallTags `json:"call_tags,omitempty" xml:"call_tags,omitempty" require:"true"`
	// 通话录音下载地址
	RecordingUrl *string `json:"recording_url,omitempty" xml:"recording_url,omitempty" require:"true"`
	// 录音全文，按对话轮次组织
	Transcript []*Transcript `json:"transcript,omitempty" xml:"transcript,omitempty" require:"true" type:"Repeated"`
}

func (s CallbackLvRobotcallRequest) String() string {
	return tea.Prettify(s)
}

func (s CallbackLvRobotcallRequest) GoString() string {
	return s.String()
}

func (s *CallbackLvRobotcallRequest) SetAuthToken(v string) *CallbackLvRobotcallRequest {
	s.AuthToken = &v
	return s
}

func (s *CallbackLvRobotcallRequest) SetProductInstanceId(v string) *CallbackLvRobotcallRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CallbackLvRobotcallRequest) SetRequestId(v string) *CallbackLvRobotcallRequest {
	s.RequestId = &v
	return s
}

func (s *CallbackLvRobotcallRequest) SetCaseId(v string) *CallbackLvRobotcallRequest {
	s.CaseId = &v
	return s
}

func (s *CallbackLvRobotcallRequest) SetCallStatus(v string) *CallbackLvRobotcallRequest {
	s.CallStatus = &v
	return s
}

func (s *CallbackLvRobotcallRequest) SetCallStartTime(v string) *CallbackLvRobotcallRequest {
	s.CallStartTime = &v
	return s
}

func (s *CallbackLvRobotcallRequest) SetCallDuration(v int64) *CallbackLvRobotcallRequest {
	s.CallDuration = &v
	return s
}

func (s *CallbackLvRobotcallRequest) SetCallSummary(v string) *CallbackLvRobotcallRequest {
	s.CallSummary = &v
	return s
}

func (s *CallbackLvRobotcallRequest) SetCallTags(v *CallTags) *CallbackLvRobotcallRequest {
	s.CallTags = v
	return s
}

func (s *CallbackLvRobotcallRequest) SetRecordingUrl(v string) *CallbackLvRobotcallRequest {
	s.RecordingUrl = &v
	return s
}

func (s *CallbackLvRobotcallRequest) SetTranscript(v []*Transcript) *CallbackLvRobotcallRequest {
	s.Transcript = v
	return s
}

type CallbackLvRobotcallResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 响应码，0表示成功接收
	Code *int64 `json:"code,omitempty" xml:"code,omitempty"`
	// 响应描述
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
}

func (s CallbackLvRobotcallResponse) String() string {
	return tea.Prettify(s)
}

func (s CallbackLvRobotcallResponse) GoString() string {
	return s.String()
}

func (s *CallbackLvRobotcallResponse) SetReqMsgId(v string) *CallbackLvRobotcallResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CallbackLvRobotcallResponse) SetResultCode(v string) *CallbackLvRobotcallResponse {
	s.ResultCode = &v
	return s
}

func (s *CallbackLvRobotcallResponse) SetResultMsg(v string) *CallbackLvRobotcallResponse {
	s.ResultMsg = &v
	return s
}

func (s *CallbackLvRobotcallResponse) SetCode(v int64) *CallbackLvRobotcallResponse {
	s.Code = &v
	return s
}

func (s *CallbackLvRobotcallResponse) SetMessage(v string) *CallbackLvRobotcallResponse {
	s.Message = &v
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
				"sdk_version":      tea.String("1.1.1"),
				"_prod_code":       tea.String("RESOLVESERVICE"),
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
// Description: 查询360客户是否逾期
//
// Summary: 查询360客户是否逾期
func (client *Client) QueryCustomerOverdue(request *QueryCustomerOverdueRequest) (_result *QueryCustomerOverdueResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryCustomerOverdueResponse{}
	_body, _err := client.QueryCustomerOverdueEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 查询360客户是否逾期
//
// Summary: 查询360客户是否逾期
func (client *Client) QueryCustomerOverdueEx(request *QueryCustomerOverdueRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryCustomerOverdueResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryCustomerOverdueResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.resolveservice.customer.overdue.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 查询360客户快捷还款预链接码
//
// Summary: 查询360客户快捷还款预链接码
func (client *Client) QueryCustomerRepaylink(request *QueryCustomerRepaylinkRequest) (_result *QueryCustomerRepaylinkResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryCustomerRepaylinkResponse{}
	_body, _err := client.QueryCustomerRepaylinkEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 查询360客户快捷还款预链接码
//
// Summary: 查询360客户快捷还款预链接码
func (client *Client) QueryCustomerRepaylinkEx(request *QueryCustomerRepaylinkRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryCustomerRepaylinkResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryCustomerRepaylinkResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.resolveservice.customer.repaylink.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 查询360客户微信获客链接
//
// Summary: 查询360客户微信获客链接
func (client *Client) QueryCustomerWxleadlink(request *QueryCustomerWxleadlinkRequest) (_result *QueryCustomerWxleadlinkResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryCustomerWxleadlinkResponse{}
	_body, _err := client.QueryCustomerWxleadlinkEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 查询360客户微信获客链接
//
// Summary: 查询360客户微信获客链接
func (client *Client) QueryCustomerWxleadlinkEx(request *QueryCustomerWxleadlinkRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryCustomerWxleadlinkResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryCustomerWxleadlinkResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.resolveservice.customer.wxleadlink.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 查询360客户次日是否提前转人工
//
// Summary: 查询360客户次日是否提前转人工
func (client *Client) QueryCustomerTransartificial(request *QueryCustomerTransartificialRequest) (_result *QueryCustomerTransartificialResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryCustomerTransartificialResponse{}
	_body, _err := client.QueryCustomerTransartificialEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 查询360客户次日是否提前转人工
//
// Summary: 查询360客户次日是否提前转人工
func (client *Client) QueryCustomerTransartificialEx(request *QueryCustomerTransartificialRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryCustomerTransartificialResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryCustomerTransartificialResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.resolveservice.customer.transartificial.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 94拨打结果回传
//
// Summary: 94拨打结果回传
func (client *Client) CallbackTaskCallresult(request *CallbackTaskCallresultRequest) (_result *CallbackTaskCallresultResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CallbackTaskCallresultResponse{}
	_body, _err := client.CallbackTaskCallresultEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 94拨打结果回传
//
// Summary: 94拨打结果回传
func (client *Client) CallbackTaskCallresultEx(request *CallbackTaskCallresultRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CallbackTaskCallresultResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CallbackTaskCallresultResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.resolveservice.task.callresult.callback"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 94短信结果回传
//
// Summary: 94短信结果回传
func (client *Client) CallbackTaskSmsresult(request *CallbackTaskSmsresultRequest) (_result *CallbackTaskSmsresultResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CallbackTaskSmsresultResponse{}
	_body, _err := client.CallbackTaskSmsresultEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 94短信结果回传
//
// Summary: 94短信结果回传
func (client *Client) CallbackTaskSmsresultEx(request *CallbackTaskSmsresultRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CallbackTaskSmsresultResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CallbackTaskSmsresultResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.resolveservice.task.smsresult.callback"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 94回推360客户行为接口
//
// Summary: 94回推360客户行为接口
func (client *Client) PushCustomerInternalmsg(request *PushCustomerInternalmsgRequest) (_result *PushCustomerInternalmsgResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PushCustomerInternalmsgResponse{}
	_body, _err := client.PushCustomerInternalmsgEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 94回推360客户行为接口
//
// Summary: 94回推360客户行为接口
func (client *Client) PushCustomerInternalmsgEx(request *PushCustomerInternalmsgRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PushCustomerInternalmsgResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PushCustomerInternalmsgResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.resolveservice.customer.internalmsg.push"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 供应商回执回调
//
// Summary: 供应商回执回调
func (client *Client) CallbackProviderRobotcall(request *CallbackProviderRobotcallRequest) (_result *CallbackProviderRobotcallResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CallbackProviderRobotcallResponse{}
	_body, _err := client.CallbackProviderRobotcallEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 供应商回执回调
//
// Summary: 供应商回执回调
func (client *Client) CallbackProviderRobotcallEx(request *CallbackProviderRobotcallRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CallbackProviderRobotcallResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CallbackProviderRobotcallResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.resolveservice.provider.robotcall.callback"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 律光外呼回执
//
// Summary: 律光外呼回执
func (client *Client) CallbackLvRobotcall(request *CallbackLvRobotcallRequest) (_result *CallbackLvRobotcallResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CallbackLvRobotcallResponse{}
	_body, _err := client.CallbackLvRobotcallEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 律光外呼回执
//
// Summary: 律光外呼回执
func (client *Client) CallbackLvRobotcallEx(request *CallbackLvRobotcallRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CallbackLvRobotcallResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CallbackLvRobotcallResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.resolveservice.lv.robotcall.callback"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
