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

// 主动支付单据
type ActivePayOrder struct {
	// 支付宝支付订单号，用于拉起主动支付页面
	TradeNo *string `json:"trade_no,omitempty" xml:"trade_no,omitempty" require:"true" maxLength:"64" minLength:"1"`
	// 状态
	// INIT：交易创建
	// FAILED：付款失败
	// SUCCESS：付款成功
	TradeStatus *string `json:"trade_status,omitempty" xml:"trade_status,omitempty" require:"true" maxLength:"64" minLength:"1"`
	// 状态原因码
	StatusReasonCode *string `json:"status_reason_code,omitempty" xml:"status_reason_code,omitempty" minLength:"1"`
	// 超时关闭
	StatusReasonMsg *string `json:"status_reason_msg,omitempty" xml:"status_reason_msg,omitempty" minLength:"1"`
	// 本次交易支付的订单金额，单位为分
	// 付款成功或付款成功之后的状态必填
	TotalAmount *int64 `json:"total_amount,omitempty" xml:"total_amount,omitempty" minimum:"1"`
	// 用户在交易中支付的金额，单位为分
	// 付款成功的状态必填
	PaidAmount *int64 `json:"paid_amount,omitempty" xml:"paid_amount,omitempty" minimum:"1"`
	// 商家在交易中实际收到的款项，单位为分
	// 付款成功的状态必填
	ReceiptAmount *int64 `json:"receipt_amount,omitempty" xml:"receipt_amount,omitempty" minimum:"1"`
	// 交易支付时间
	// 付款成功的状态必填
	GmtPay *string `json:"gmt_pay,omitempty" xml:"gmt_pay,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
}

func (s ActivePayOrder) String() string {
	return tea.Prettify(s)
}

func (s ActivePayOrder) GoString() string {
	return s.String()
}

func (s *ActivePayOrder) SetTradeNo(v string) *ActivePayOrder {
	s.TradeNo = &v
	return s
}

func (s *ActivePayOrder) SetTradeStatus(v string) *ActivePayOrder {
	s.TradeStatus = &v
	return s
}

func (s *ActivePayOrder) SetStatusReasonCode(v string) *ActivePayOrder {
	s.StatusReasonCode = &v
	return s
}

func (s *ActivePayOrder) SetStatusReasonMsg(v string) *ActivePayOrder {
	s.StatusReasonMsg = &v
	return s
}

func (s *ActivePayOrder) SetTotalAmount(v int64) *ActivePayOrder {
	s.TotalAmount = &v
	return s
}

func (s *ActivePayOrder) SetPaidAmount(v int64) *ActivePayOrder {
	s.PaidAmount = &v
	return s
}

func (s *ActivePayOrder) SetReceiptAmount(v int64) *ActivePayOrder {
	s.ReceiptAmount = &v
	return s
}

func (s *ActivePayOrder) SetGmtPay(v string) *ActivePayOrder {
	s.GmtPay = &v
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

type SyncAntchainAtoTradeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 业务字段，具体传入信息需参考文档
	// 传入格式需为json字符串
	BizContent *string `json:"biz_content,omitempty" xml:"biz_content,omitempty" require:"true"`
	// 接口执行类型
	//
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
}

func (s SyncAntchainAtoTradeRequest) String() string {
	return tea.Prettify(s)
}

func (s SyncAntchainAtoTradeRequest) GoString() string {
	return s.String()
}

func (s *SyncAntchainAtoTradeRequest) SetAuthToken(v string) *SyncAntchainAtoTradeRequest {
	s.AuthToken = &v
	return s
}

func (s *SyncAntchainAtoTradeRequest) SetProductInstanceId(v string) *SyncAntchainAtoTradeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SyncAntchainAtoTradeRequest) SetBizContent(v string) *SyncAntchainAtoTradeRequest {
	s.BizContent = &v
	return s
}

func (s *SyncAntchainAtoTradeRequest) SetType(v string) *SyncAntchainAtoTradeRequest {
	s.Type = &v
	return s
}

type SyncAntchainAtoTradeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// resp信息
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s SyncAntchainAtoTradeResponse) String() string {
	return tea.Prettify(s)
}

func (s SyncAntchainAtoTradeResponse) GoString() string {
	return s.String()
}

func (s *SyncAntchainAtoTradeResponse) SetReqMsgId(v string) *SyncAntchainAtoTradeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SyncAntchainAtoTradeResponse) SetResultCode(v string) *SyncAntchainAtoTradeResponse {
	s.ResultCode = &v
	return s
}

func (s *SyncAntchainAtoTradeResponse) SetResultMsg(v string) *SyncAntchainAtoTradeResponse {
	s.ResultMsg = &v
	return s
}

func (s *SyncAntchainAtoTradeResponse) SetResponseData(v string) *SyncAntchainAtoTradeResponse {
	s.ResponseData = &v
	return s
}

type GetAntchainAtoTradeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 查询信息，必须遵循json字符串格式
	BizContent *string `json:"biz_content,omitempty" xml:"biz_content,omitempty" require:"true"`
	// 接口类型
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
}

func (s GetAntchainAtoTradeRequest) String() string {
	return tea.Prettify(s)
}

func (s GetAntchainAtoTradeRequest) GoString() string {
	return s.String()
}

func (s *GetAntchainAtoTradeRequest) SetAuthToken(v string) *GetAntchainAtoTradeRequest {
	s.AuthToken = &v
	return s
}

func (s *GetAntchainAtoTradeRequest) SetProductInstanceId(v string) *GetAntchainAtoTradeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetAntchainAtoTradeRequest) SetBizContent(v string) *GetAntchainAtoTradeRequest {
	s.BizContent = &v
	return s
}

func (s *GetAntchainAtoTradeRequest) SetType(v string) *GetAntchainAtoTradeRequest {
	s.Type = &v
	return s
}

type GetAntchainAtoTradeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回的查询值
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s GetAntchainAtoTradeResponse) String() string {
	return tea.Prettify(s)
}

func (s GetAntchainAtoTradeResponse) GoString() string {
	return s.String()
}

func (s *GetAntchainAtoTradeResponse) SetReqMsgId(v string) *GetAntchainAtoTradeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetAntchainAtoTradeResponse) SetResultCode(v string) *GetAntchainAtoTradeResponse {
	s.ResultCode = &v
	return s
}

func (s *GetAntchainAtoTradeResponse) SetResultMsg(v string) *GetAntchainAtoTradeResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetAntchainAtoTradeResponse) SetResponseData(v string) *GetAntchainAtoTradeResponse {
	s.ResponseData = &v
	return s
}

type CreateAntchainAtoRealpersonFacevrfRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 真实姓名
	CertName *string `json:"cert_name,omitempty" xml:"cert_name,omitempty" require:"true"`
	// 证件号码
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty" require:"true"`
	// 身份信息来源类型，当前仅支持证件（CERT_INFO）
	IdentityType *string `json:"identity_type,omitempty" xml:"identity_type,omitempty" require:"true"`
	// 证件类型，当前仅支持身份证（IDENTITY_CARD）
	CertType *string `json:"cert_type,omitempty" xml:"cert_type,omitempty" require:"true"`
	// 商户请求的唯一标识。
	//
	// 值为 32 位长度的字母数字组合。其中，前面几位字符是商户自定义的简称，中间几位可以使用一段时间，后段可以使用一个随机或递增序列。该值也可以使用 UUID。
	OuterOrderNo *string `json:"outer_order_no,omitempty" xml:"outer_order_no,omitempty" require:"true"`
	// 认证结束回跳地址
	ReturnUrl *string `json:"return_url,omitempty" xml:"return_url,omitempty" require:"true"`
	// 订单id 长度不可超过50
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
}

func (s CreateAntchainAtoRealpersonFacevrfRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateAntchainAtoRealpersonFacevrfRequest) GoString() string {
	return s.String()
}

func (s *CreateAntchainAtoRealpersonFacevrfRequest) SetAuthToken(v string) *CreateAntchainAtoRealpersonFacevrfRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateAntchainAtoRealpersonFacevrfRequest) SetProductInstanceId(v string) *CreateAntchainAtoRealpersonFacevrfRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateAntchainAtoRealpersonFacevrfRequest) SetCertName(v string) *CreateAntchainAtoRealpersonFacevrfRequest {
	s.CertName = &v
	return s
}

func (s *CreateAntchainAtoRealpersonFacevrfRequest) SetCertNo(v string) *CreateAntchainAtoRealpersonFacevrfRequest {
	s.CertNo = &v
	return s
}

func (s *CreateAntchainAtoRealpersonFacevrfRequest) SetIdentityType(v string) *CreateAntchainAtoRealpersonFacevrfRequest {
	s.IdentityType = &v
	return s
}

func (s *CreateAntchainAtoRealpersonFacevrfRequest) SetCertType(v string) *CreateAntchainAtoRealpersonFacevrfRequest {
	s.CertType = &v
	return s
}

func (s *CreateAntchainAtoRealpersonFacevrfRequest) SetOuterOrderNo(v string) *CreateAntchainAtoRealpersonFacevrfRequest {
	s.OuterOrderNo = &v
	return s
}

func (s *CreateAntchainAtoRealpersonFacevrfRequest) SetReturnUrl(v string) *CreateAntchainAtoRealpersonFacevrfRequest {
	s.ReturnUrl = &v
	return s
}

func (s *CreateAntchainAtoRealpersonFacevrfRequest) SetOrderId(v string) *CreateAntchainAtoRealpersonFacevrfRequest {
	s.OrderId = &v
	return s
}

type CreateAntchainAtoRealpersonFacevrfResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务返回字段，JSON格式
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s CreateAntchainAtoRealpersonFacevrfResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateAntchainAtoRealpersonFacevrfResponse) GoString() string {
	return s.String()
}

func (s *CreateAntchainAtoRealpersonFacevrfResponse) SetReqMsgId(v string) *CreateAntchainAtoRealpersonFacevrfResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateAntchainAtoRealpersonFacevrfResponse) SetResultCode(v string) *CreateAntchainAtoRealpersonFacevrfResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateAntchainAtoRealpersonFacevrfResponse) SetResultMsg(v string) *CreateAntchainAtoRealpersonFacevrfResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateAntchainAtoRealpersonFacevrfResponse) SetData(v string) *CreateAntchainAtoRealpersonFacevrfResponse {
	s.Data = &v
	return s
}

type QueryAntchainAtoRealpersonFacevrfRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 可信实人认证的唯一标识
	CertifyId *string `json:"certify_id,omitempty" xml:"certify_id,omitempty" require:"true"`
	// 商户请求的唯一标识。
	//
	// 值为 32 位长度的字母数字组合。其中，前面几位字符是商户自定义的简称，中间几位可以使用一段时间，后段可以使用一个随机或递增序列。该值也可以使用 UUID。
	OuterOrderNo *string `json:"outer_order_no,omitempty" xml:"outer_order_no,omitempty" require:"true"`
	// 订单id 长度不可超过50
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
}

func (s QueryAntchainAtoRealpersonFacevrfRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAntchainAtoRealpersonFacevrfRequest) GoString() string {
	return s.String()
}

func (s *QueryAntchainAtoRealpersonFacevrfRequest) SetAuthToken(v string) *QueryAntchainAtoRealpersonFacevrfRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAntchainAtoRealpersonFacevrfRequest) SetProductInstanceId(v string) *QueryAntchainAtoRealpersonFacevrfRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAntchainAtoRealpersonFacevrfRequest) SetCertifyId(v string) *QueryAntchainAtoRealpersonFacevrfRequest {
	s.CertifyId = &v
	return s
}

func (s *QueryAntchainAtoRealpersonFacevrfRequest) SetOuterOrderNo(v string) *QueryAntchainAtoRealpersonFacevrfRequest {
	s.OuterOrderNo = &v
	return s
}

func (s *QueryAntchainAtoRealpersonFacevrfRequest) SetOrderId(v string) *QueryAntchainAtoRealpersonFacevrfRequest {
	s.OrderId = &v
	return s
}

type QueryAntchainAtoRealpersonFacevrfResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务返回字段，JSON格式
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QueryAntchainAtoRealpersonFacevrfResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAntchainAtoRealpersonFacevrfResponse) GoString() string {
	return s.String()
}

func (s *QueryAntchainAtoRealpersonFacevrfResponse) SetReqMsgId(v string) *QueryAntchainAtoRealpersonFacevrfResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAntchainAtoRealpersonFacevrfResponse) SetResultCode(v string) *QueryAntchainAtoRealpersonFacevrfResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAntchainAtoRealpersonFacevrfResponse) SetResultMsg(v string) *QueryAntchainAtoRealpersonFacevrfResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAntchainAtoRealpersonFacevrfResponse) SetData(v string) *QueryAntchainAtoRealpersonFacevrfResponse {
	s.Data = &v
	return s
}

type AllAntchainAtoSignTemplateRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 合同类型，如果不传则返回所有
	ContractType *string `json:"contract_type,omitempty" xml:"contract_type,omitempty"`
	// ● FINANCE 融资
	// ● NON_FINANCE 非融资
	FundType *string `json:"fund_type,omitempty" xml:"fund_type,omitempty"`
	// 查询融资类型时，需要传入资方统一社会信用代码
	FundId *string `json:"fund_id,omitempty" xml:"fund_id,omitempty"`
}

func (s AllAntchainAtoSignTemplateRequest) String() string {
	return tea.Prettify(s)
}

func (s AllAntchainAtoSignTemplateRequest) GoString() string {
	return s.String()
}

func (s *AllAntchainAtoSignTemplateRequest) SetAuthToken(v string) *AllAntchainAtoSignTemplateRequest {
	s.AuthToken = &v
	return s
}

func (s *AllAntchainAtoSignTemplateRequest) SetProductInstanceId(v string) *AllAntchainAtoSignTemplateRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AllAntchainAtoSignTemplateRequest) SetContractType(v string) *AllAntchainAtoSignTemplateRequest {
	s.ContractType = &v
	return s
}

func (s *AllAntchainAtoSignTemplateRequest) SetFundType(v string) *AllAntchainAtoSignTemplateRequest {
	s.FundType = &v
	return s
}

func (s *AllAntchainAtoSignTemplateRequest) SetFundId(v string) *AllAntchainAtoSignTemplateRequest {
	s.FundId = &v
	return s
}

type AllAntchainAtoSignTemplateResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// List<Object>格式，详细参考：
	// [
	//         {
	//             "templateCode": "TEST_001",
	//             "tenantId": "BIPCCOQY",
	//             "agreementType": "SERVICE_LEASE",
	//             "fileName": "测试模板之协议签署证明",
	//             "templateId": "f28038577d664015bfc1034c4a125121",
	//             "fieldArgs": "{\"sceneName\":\"测试协议合同签署\",\"title\":\"这是一份证明协议\"}",
	//             "userPos": "[{\"required\":true,\"posPage\":\"1\",\"posX\":\"162.44\",\"posY\":\"425\"}]",
	//             "orgPos": "[{\"required\":true,\"posPage\":\"1\",\"posX\":\"449.99\",\"posY\":\"420.03\"}]"
	//         }
	//     ]
	TemplateList *string `json:"template_list,omitempty" xml:"template_list,omitempty"`
}

func (s AllAntchainAtoSignTemplateResponse) String() string {
	return tea.Prettify(s)
}

func (s AllAntchainAtoSignTemplateResponse) GoString() string {
	return s.String()
}

func (s *AllAntchainAtoSignTemplateResponse) SetReqMsgId(v string) *AllAntchainAtoSignTemplateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AllAntchainAtoSignTemplateResponse) SetResultCode(v string) *AllAntchainAtoSignTemplateResponse {
	s.ResultCode = &v
	return s
}

func (s *AllAntchainAtoSignTemplateResponse) SetResultMsg(v string) *AllAntchainAtoSignTemplateResponse {
	s.ResultMsg = &v
	return s
}

func (s *AllAntchainAtoSignTemplateResponse) SetTemplateList(v string) *AllAntchainAtoSignTemplateResponse {
	s.TemplateList = &v
	return s
}

type SubmitAntchainAtoSignFlowRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单号
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
	// CRED_PSN_CH_IDCARD： 大陆身份证
	// CRED_PSN_CH_TWCARD：台湾来往大陆通行证
	// CRED_PSN_CH_MACAO"：澳门来往大陆通行证
	// CRED_PSN_CH_HONGKONG：香港来往大陆通行证
	// CRED_PSN_PASSPORT：护照
	UserIdType *string `json:"user_id_type,omitempty" xml:"user_id_type,omitempty" require:"true"`
	// 用户证件号，需要采用RSA加密传输
	UserIdNumber *string `json:"user_id_number,omitempty" xml:"user_id_number,omitempty" require:"true"`
	// 姓名，需要采用RSA加密传输
	UserName *string `json:"user_name,omitempty" xml:"user_name,omitempty" require:"true"`
	// 用户手机号，可不传；传的话需要采用RSA加密传输
	UserMobile *string `json:"user_mobile,omitempty" xml:"user_mobile,omitempty"`
	// 用户的电子邮箱，可不传；传的话需要采用RSA加密传输
	UserEmail *string `json:"user_email,omitempty" xml:"user_email,omitempty"`
	// 签署有效期，时间戳，例如：new Date().getTime()
	SignValidity *string `json:"sign_validity,omitempty" xml:"sign_validity,omitempty"`
	// 1-短信；2-邮件
	FlowNotifyType *string `json:"flow_notify_type,omitempty" xml:"flow_notify_type,omitempty"`
	// 业务场景，电子合同签署协议的时候的标题
	BusinessScene *string `json:"business_scene,omitempty" xml:"business_scene,omitempty" require:"true"`
	// 签署完成跳转链接
	SignedRedirectUrl *string `json:"signed_redirect_url,omitempty" xml:"signed_redirect_url,omitempty"`
	// 签署的电子合同模板信息，List<Object>的JSON格式，Object如下：
	// {
	// templateId:__, // String格式
	// templateArgs: {
	//     "模板参数key":"模板参数值", // 必须为String
	//   }
	// }
	TemplateList *string `json:"template_list,omitempty" xml:"template_list,omitempty" require:"true"`
	// 用户的支付宝uid
	AlipayUserId *string `json:"alipay_user_id,omitempty" xml:"alipay_user_id,omitempty" require:"true" maxLength:"20" minLength:"12"`
	// 公司名称
	MerchantName *string `json:"merchant_name,omitempty" xml:"merchant_name,omitempty" require:"true" maxLength:"256" minLength:"2"`
	// 商户签署区域标识。对应在合同模板的机构签署区域中的tag值(如果合同模板的签署区域的tag值为空，则可以不传这个参数)。必须完全对应，否则在多方签署的情况下根据tag找到不到对应的签署机构，会出错。
	MerchantTag *string `json:"merchant_tag,omitempty" xml:"merchant_tag,omitempty" maxLength:"32" minLength:"0"`
	// 商户需要盖的印章ID
	MerchantSealId *string `json:"merchant_seal_id,omitempty" xml:"merchant_seal_id,omitempty"`
	// 电子合同签署顺序，如果只有1方企业签署，传入1即可。如果是多方，并且需要设置签署顺序，则需要将这个值以及thirdSigner中的signOrder做一个签署顺序。
	MerchantSignOrder *int64 `json:"merchant_sign_order,omitempty" xml:"merchant_sign_order,omitempty" maximum:"10000" minimum:"1"`
	// CRED_ORG_USCC：统一社会信用代码，CRED_ORG_REGCODE：工商注册号，只支持这两个值
	MerchantIdType *string `json:"merchant_id_type,omitempty" xml:"merchant_id_type,omitempty" require:"true" maxLength:"20" minLength:"6"`
	// 商户证件号，需要采用RSA加密传输
	MerchantIdNumber *string `json:"merchant_id_number,omitempty" xml:"merchant_id_number,omitempty" require:"true" maxLength:"1000" minLength:"4"`
	// 法人姓名，需要RSA加密传输
	MerchantLegalName *string `json:"merchant_legal_name,omitempty" xml:"merchant_legal_name,omitempty"`
	// 法人证件号，需要采用RSA加密传输
	MerchantLegalIdNumber *string `json:"merchant_legal_id_number,omitempty" xml:"merchant_legal_id_number,omitempty"`
	// 多方签署的其他参与方的签署信息，json的array格式，参考：[{"tag":"zf_a","orgName":"上海网络科技有限公司","orgIdType":"CRED_ORG_REGCODE","orgIdNumber":"12098760923","orgLegalName":"王大浪","orgLegalIdNumber":"107120196708289012"}]，其中：orgIdNumber、orgLegalName、orgLegalIdNumber需要加密传输。
	ThirdSigner *string `json:"third_signer,omitempty" xml:"third_signer,omitempty" maxLength:"2000" minLength:"0"`
}

func (s SubmitAntchainAtoSignFlowRequest) String() string {
	return tea.Prettify(s)
}

func (s SubmitAntchainAtoSignFlowRequest) GoString() string {
	return s.String()
}

func (s *SubmitAntchainAtoSignFlowRequest) SetAuthToken(v string) *SubmitAntchainAtoSignFlowRequest {
	s.AuthToken = &v
	return s
}

func (s *SubmitAntchainAtoSignFlowRequest) SetProductInstanceId(v string) *SubmitAntchainAtoSignFlowRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SubmitAntchainAtoSignFlowRequest) SetOrderId(v string) *SubmitAntchainAtoSignFlowRequest {
	s.OrderId = &v
	return s
}

func (s *SubmitAntchainAtoSignFlowRequest) SetUserIdType(v string) *SubmitAntchainAtoSignFlowRequest {
	s.UserIdType = &v
	return s
}

func (s *SubmitAntchainAtoSignFlowRequest) SetUserIdNumber(v string) *SubmitAntchainAtoSignFlowRequest {
	s.UserIdNumber = &v
	return s
}

func (s *SubmitAntchainAtoSignFlowRequest) SetUserName(v string) *SubmitAntchainAtoSignFlowRequest {
	s.UserName = &v
	return s
}

func (s *SubmitAntchainAtoSignFlowRequest) SetUserMobile(v string) *SubmitAntchainAtoSignFlowRequest {
	s.UserMobile = &v
	return s
}

func (s *SubmitAntchainAtoSignFlowRequest) SetUserEmail(v string) *SubmitAntchainAtoSignFlowRequest {
	s.UserEmail = &v
	return s
}

func (s *SubmitAntchainAtoSignFlowRequest) SetSignValidity(v string) *SubmitAntchainAtoSignFlowRequest {
	s.SignValidity = &v
	return s
}

func (s *SubmitAntchainAtoSignFlowRequest) SetFlowNotifyType(v string) *SubmitAntchainAtoSignFlowRequest {
	s.FlowNotifyType = &v
	return s
}

func (s *SubmitAntchainAtoSignFlowRequest) SetBusinessScene(v string) *SubmitAntchainAtoSignFlowRequest {
	s.BusinessScene = &v
	return s
}

func (s *SubmitAntchainAtoSignFlowRequest) SetSignedRedirectUrl(v string) *SubmitAntchainAtoSignFlowRequest {
	s.SignedRedirectUrl = &v
	return s
}

func (s *SubmitAntchainAtoSignFlowRequest) SetTemplateList(v string) *SubmitAntchainAtoSignFlowRequest {
	s.TemplateList = &v
	return s
}

func (s *SubmitAntchainAtoSignFlowRequest) SetAlipayUserId(v string) *SubmitAntchainAtoSignFlowRequest {
	s.AlipayUserId = &v
	return s
}

func (s *SubmitAntchainAtoSignFlowRequest) SetMerchantName(v string) *SubmitAntchainAtoSignFlowRequest {
	s.MerchantName = &v
	return s
}

func (s *SubmitAntchainAtoSignFlowRequest) SetMerchantTag(v string) *SubmitAntchainAtoSignFlowRequest {
	s.MerchantTag = &v
	return s
}

func (s *SubmitAntchainAtoSignFlowRequest) SetMerchantSealId(v string) *SubmitAntchainAtoSignFlowRequest {
	s.MerchantSealId = &v
	return s
}

func (s *SubmitAntchainAtoSignFlowRequest) SetMerchantSignOrder(v int64) *SubmitAntchainAtoSignFlowRequest {
	s.MerchantSignOrder = &v
	return s
}

func (s *SubmitAntchainAtoSignFlowRequest) SetMerchantIdType(v string) *SubmitAntchainAtoSignFlowRequest {
	s.MerchantIdType = &v
	return s
}

func (s *SubmitAntchainAtoSignFlowRequest) SetMerchantIdNumber(v string) *SubmitAntchainAtoSignFlowRequest {
	s.MerchantIdNumber = &v
	return s
}

func (s *SubmitAntchainAtoSignFlowRequest) SetMerchantLegalName(v string) *SubmitAntchainAtoSignFlowRequest {
	s.MerchantLegalName = &v
	return s
}

func (s *SubmitAntchainAtoSignFlowRequest) SetMerchantLegalIdNumber(v string) *SubmitAntchainAtoSignFlowRequest {
	s.MerchantLegalIdNumber = &v
	return s
}

func (s *SubmitAntchainAtoSignFlowRequest) SetThirdSigner(v string) *SubmitAntchainAtoSignFlowRequest {
	s.ThirdSigner = &v
	return s
}

type SubmitAntchainAtoSignFlowResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 签署合同单号
	SignNo *string `json:"sign_no,omitempty" xml:"sign_no,omitempty"`
	// 电子签署流程ID
	FlowId *string `json:"flow_id,omitempty" xml:"flow_id,omitempty"`
	// 签署用户ID
	AccountId *string `json:"account_id,omitempty" xml:"account_id,omitempty"`
	// 签署附加信息，用于获取签署链接等。JSON格式的字符串。
	SignInfo *string `json:"sign_info,omitempty" xml:"sign_info,omitempty"`
}

func (s SubmitAntchainAtoSignFlowResponse) String() string {
	return tea.Prettify(s)
}

func (s SubmitAntchainAtoSignFlowResponse) GoString() string {
	return s.String()
}

func (s *SubmitAntchainAtoSignFlowResponse) SetReqMsgId(v string) *SubmitAntchainAtoSignFlowResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SubmitAntchainAtoSignFlowResponse) SetResultCode(v string) *SubmitAntchainAtoSignFlowResponse {
	s.ResultCode = &v
	return s
}

func (s *SubmitAntchainAtoSignFlowResponse) SetResultMsg(v string) *SubmitAntchainAtoSignFlowResponse {
	s.ResultMsg = &v
	return s
}

func (s *SubmitAntchainAtoSignFlowResponse) SetSignNo(v string) *SubmitAntchainAtoSignFlowResponse {
	s.SignNo = &v
	return s
}

func (s *SubmitAntchainAtoSignFlowResponse) SetFlowId(v string) *SubmitAntchainAtoSignFlowResponse {
	s.FlowId = &v
	return s
}

func (s *SubmitAntchainAtoSignFlowResponse) SetAccountId(v string) *SubmitAntchainAtoSignFlowResponse {
	s.AccountId = &v
	return s
}

func (s *SubmitAntchainAtoSignFlowResponse) SetSignInfo(v string) *SubmitAntchainAtoSignFlowResponse {
	s.SignInfo = &v
	return s
}

type GetAntchainAtoSignFlowRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 签署合同单号
	SignNo *string `json:"sign_no,omitempty" xml:"sign_no,omitempty" require:"true"`
}

func (s GetAntchainAtoSignFlowRequest) String() string {
	return tea.Prettify(s)
}

func (s GetAntchainAtoSignFlowRequest) GoString() string {
	return s.String()
}

func (s *GetAntchainAtoSignFlowRequest) SetAuthToken(v string) *GetAntchainAtoSignFlowRequest {
	s.AuthToken = &v
	return s
}

func (s *GetAntchainAtoSignFlowRequest) SetProductInstanceId(v string) *GetAntchainAtoSignFlowRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetAntchainAtoSignFlowRequest) SetSignNo(v string) *GetAntchainAtoSignFlowRequest {
	s.SignNo = &v
	return s
}

type GetAntchainAtoSignFlowResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 签署合同单号
	SignNo *string `json:"sign_no,omitempty" xml:"sign_no,omitempty"`
	// 订单号
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty"`
	// 签署用户ID
	AccountId *string `json:"account_id,omitempty" xml:"account_id,omitempty"`
	// 状态：DRAFT - 草稿； SIGNING - 签署中； FINISH - 签署完成；UNDO - 撤销； TERMINATE - 终止； EXPIRE - 过期； REJECTED - 拒签； CANCELLED - 解约
	//
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 签署流程ID
	FlowId *string `json:"flow_id,omitempty" xml:"flow_id,omitempty"`
	// 签署文件列表，参考：
	// _[{"fileItemNo":"10090801000001699892007791144960","agreementType":"COMMON","fileName":"xxx合同","fileSize":228530,"signAccountId":"fe2eb3814c4e49edba2bc012f790771f","fileId":"2c7684461a0f4d33bc02f6d77f7b3937","downloadUrl":"https://dev.oss-cn-shanghai.aliyuncs.com/ag/ord/xxx/16939683744483057_%E6%B5%8B%E8%AF%95%E6%A8%A1%E6%9D%BF%E4%B9%8B%E5%8D%8F%E8%AE%AE%E7%AD%BE%E7%BD%B2%E8%AF%81%E6%98%8E.pdf?Expires=1693971989&OSSAccessKeyId=LTAI5tR3hHiaXPAh8YsY9Dce&Signature=i%2FfAgDem33guI%2F0KjIFj24XZNCc%3D"}]_
	DocList *string `json:"doc_list,omitempty" xml:"doc_list,omitempty"`
	// 业务场景，主要用于签署合同的标题描述
	BusinessScene *string `json:"business_scene,omitempty" xml:"business_scene,omitempty"`
	// 签署合同中的订单的uid。
	AlipayUserId *string `json:"alipay_user_id,omitempty" xml:"alipay_user_id,omitempty"`
}

func (s GetAntchainAtoSignFlowResponse) String() string {
	return tea.Prettify(s)
}

func (s GetAntchainAtoSignFlowResponse) GoString() string {
	return s.String()
}

func (s *GetAntchainAtoSignFlowResponse) SetReqMsgId(v string) *GetAntchainAtoSignFlowResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetAntchainAtoSignFlowResponse) SetResultCode(v string) *GetAntchainAtoSignFlowResponse {
	s.ResultCode = &v
	return s
}

func (s *GetAntchainAtoSignFlowResponse) SetResultMsg(v string) *GetAntchainAtoSignFlowResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetAntchainAtoSignFlowResponse) SetSignNo(v string) *GetAntchainAtoSignFlowResponse {
	s.SignNo = &v
	return s
}

func (s *GetAntchainAtoSignFlowResponse) SetOrderId(v string) *GetAntchainAtoSignFlowResponse {
	s.OrderId = &v
	return s
}

func (s *GetAntchainAtoSignFlowResponse) SetAccountId(v string) *GetAntchainAtoSignFlowResponse {
	s.AccountId = &v
	return s
}

func (s *GetAntchainAtoSignFlowResponse) SetStatus(v string) *GetAntchainAtoSignFlowResponse {
	s.Status = &v
	return s
}

func (s *GetAntchainAtoSignFlowResponse) SetFlowId(v string) *GetAntchainAtoSignFlowResponse {
	s.FlowId = &v
	return s
}

func (s *GetAntchainAtoSignFlowResponse) SetDocList(v string) *GetAntchainAtoSignFlowResponse {
	s.DocList = &v
	return s
}

func (s *GetAntchainAtoSignFlowResponse) SetBusinessScene(v string) *GetAntchainAtoSignFlowResponse {
	s.BusinessScene = &v
	return s
}

func (s *GetAntchainAtoSignFlowResponse) SetAlipayUserId(v string) *GetAntchainAtoSignFlowResponse {
	s.AlipayUserId = &v
	return s
}

type CreateAntchainAtoWithholdSignRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单id 长度不可超过50
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"50"`
	// 支付宝商户id，使用签约能力前时候进行向平台申请
	AlipayMerchantId *string `json:"alipay_merchant_id,omitempty" xml:"alipay_merchant_id,omitempty" maxLength:"20"`
	// 支付宝商户名称，会展示在支付并签约界面
	AlipayMerchantName *string `json:"alipay_merchant_name,omitempty" xml:"alipay_merchant_name,omitempty" maxLength:"50"`
	// 支付宝商户服务名称，会展示在支付并签约界面
	AlipayMerchantServiceName *string `json:"alipay_merchant_service_name,omitempty" xml:"alipay_merchant_service_name,omitempty" maxLength:"50"`
	// 支付宝商户服务描述，会展示在支付并签约界面
	AlipayMerchantServiceDescription *string `json:"alipay_merchant_service_description,omitempty" xml:"alipay_merchant_service_description,omitempty" maxLength:"150"`
}

func (s CreateAntchainAtoWithholdSignRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateAntchainAtoWithholdSignRequest) GoString() string {
	return s.String()
}

func (s *CreateAntchainAtoWithholdSignRequest) SetAuthToken(v string) *CreateAntchainAtoWithholdSignRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateAntchainAtoWithholdSignRequest) SetProductInstanceId(v string) *CreateAntchainAtoWithholdSignRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateAntchainAtoWithholdSignRequest) SetOrderId(v string) *CreateAntchainAtoWithholdSignRequest {
	s.OrderId = &v
	return s
}

func (s *CreateAntchainAtoWithholdSignRequest) SetAlipayMerchantId(v string) *CreateAntchainAtoWithholdSignRequest {
	s.AlipayMerchantId = &v
	return s
}

func (s *CreateAntchainAtoWithholdSignRequest) SetAlipayMerchantName(v string) *CreateAntchainAtoWithholdSignRequest {
	s.AlipayMerchantName = &v
	return s
}

func (s *CreateAntchainAtoWithholdSignRequest) SetAlipayMerchantServiceName(v string) *CreateAntchainAtoWithholdSignRequest {
	s.AlipayMerchantServiceName = &v
	return s
}

func (s *CreateAntchainAtoWithholdSignRequest) SetAlipayMerchantServiceDescription(v string) *CreateAntchainAtoWithholdSignRequest {
	s.AlipayMerchantServiceDescription = &v
	return s
}

type CreateAntchainAtoWithholdSignResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 签约字符串
	SignStr *string `json:"sign_str,omitempty" xml:"sign_str,omitempty"`
}

func (s CreateAntchainAtoWithholdSignResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateAntchainAtoWithholdSignResponse) GoString() string {
	return s.String()
}

func (s *CreateAntchainAtoWithholdSignResponse) SetReqMsgId(v string) *CreateAntchainAtoWithholdSignResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateAntchainAtoWithholdSignResponse) SetResultCode(v string) *CreateAntchainAtoWithholdSignResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateAntchainAtoWithholdSignResponse) SetResultMsg(v string) *CreateAntchainAtoWithholdSignResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateAntchainAtoWithholdSignResponse) SetSignStr(v string) *CreateAntchainAtoWithholdSignResponse {
	s.SignStr = &v
	return s
}

type QueryAntchainAtoWithholdSignRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单id 长度不可超过50
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"50"`
}

func (s QueryAntchainAtoWithholdSignRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAntchainAtoWithholdSignRequest) GoString() string {
	return s.String()
}

func (s *QueryAntchainAtoWithholdSignRequest) SetAuthToken(v string) *QueryAntchainAtoWithholdSignRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAntchainAtoWithholdSignRequest) SetProductInstanceId(v string) *QueryAntchainAtoWithholdSignRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAntchainAtoWithholdSignRequest) SetOrderId(v string) *QueryAntchainAtoWithholdSignRequest {
	s.OrderId = &v
	return s
}

type QueryAntchainAtoWithholdSignResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 协议当前状态
	// 1. UNSIGNED：未签约
	// 2. SIGNED：已签约；
	// 3. TERMINATED：已解约
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 协议签署时间
	SignTime *string `json:"sign_time,omitempty" xml:"sign_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 协议生效时间
	ValidTime *string `json:"valid_time,omitempty" xml:"valid_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 协议失效时间
	InvalidTime *string `json:"invalid_time,omitempty" xml:"invalid_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
}

func (s QueryAntchainAtoWithholdSignResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAntchainAtoWithholdSignResponse) GoString() string {
	return s.String()
}

func (s *QueryAntchainAtoWithholdSignResponse) SetReqMsgId(v string) *QueryAntchainAtoWithholdSignResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAntchainAtoWithholdSignResponse) SetResultCode(v string) *QueryAntchainAtoWithholdSignResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAntchainAtoWithholdSignResponse) SetResultMsg(v string) *QueryAntchainAtoWithholdSignResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAntchainAtoWithholdSignResponse) SetStatus(v string) *QueryAntchainAtoWithholdSignResponse {
	s.Status = &v
	return s
}

func (s *QueryAntchainAtoWithholdSignResponse) SetSignTime(v string) *QueryAntchainAtoWithholdSignResponse {
	s.SignTime = &v
	return s
}

func (s *QueryAntchainAtoWithholdSignResponse) SetValidTime(v string) *QueryAntchainAtoWithholdSignResponse {
	s.ValidTime = &v
	return s
}

func (s *QueryAntchainAtoWithholdSignResponse) SetInvalidTime(v string) *QueryAntchainAtoWithholdSignResponse {
	s.InvalidTime = &v
	return s
}

type AuthAntchainAtoSignFlowRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 签署的电子合同ID
	SignNo *string `json:"sign_no,omitempty" xml:"sign_no,omitempty" require:"true" maxLength:"64" minLength:"6"`
	// 签署区域的tag，和发起签署流程的机构的tag对应。
	Tag *string `json:"tag,omitempty" xml:"tag,omitempty" maxLength:"32" minLength:"2"`
	// 电子合同签署服务返回的biz_flow_id
	BizFlowId *string `json:"biz_flow_id,omitempty" xml:"biz_flow_id,omitempty" maxLength:"64" minLength:"4"`
	// 电子合同签署服务的返回的account_id
	AccountId *string `json:"account_id,omitempty" xml:"account_id,omitempty" maxLength:"64" minLength:"4"`
}

func (s AuthAntchainAtoSignFlowRequest) String() string {
	return tea.Prettify(s)
}

func (s AuthAntchainAtoSignFlowRequest) GoString() string {
	return s.String()
}

func (s *AuthAntchainAtoSignFlowRequest) SetAuthToken(v string) *AuthAntchainAtoSignFlowRequest {
	s.AuthToken = &v
	return s
}

func (s *AuthAntchainAtoSignFlowRequest) SetProductInstanceId(v string) *AuthAntchainAtoSignFlowRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AuthAntchainAtoSignFlowRequest) SetSignNo(v string) *AuthAntchainAtoSignFlowRequest {
	s.SignNo = &v
	return s
}

func (s *AuthAntchainAtoSignFlowRequest) SetTag(v string) *AuthAntchainAtoSignFlowRequest {
	s.Tag = &v
	return s
}

func (s *AuthAntchainAtoSignFlowRequest) SetBizFlowId(v string) *AuthAntchainAtoSignFlowRequest {
	s.BizFlowId = &v
	return s
}

func (s *AuthAntchainAtoSignFlowRequest) SetAccountId(v string) *AuthAntchainAtoSignFlowRequest {
	s.AccountId = &v
	return s
}

type AuthAntchainAtoSignFlowResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 签署最后落签的签署区域id列表
	SignFieldIds *string `json:"sign_field_ids,omitempty" xml:"sign_field_ids,omitempty"`
}

func (s AuthAntchainAtoSignFlowResponse) String() string {
	return tea.Prettify(s)
}

func (s AuthAntchainAtoSignFlowResponse) GoString() string {
	return s.String()
}

func (s *AuthAntchainAtoSignFlowResponse) SetReqMsgId(v string) *AuthAntchainAtoSignFlowResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AuthAntchainAtoSignFlowResponse) SetResultCode(v string) *AuthAntchainAtoSignFlowResponse {
	s.ResultCode = &v
	return s
}

func (s *AuthAntchainAtoSignFlowResponse) SetResultMsg(v string) *AuthAntchainAtoSignFlowResponse {
	s.ResultMsg = &v
	return s
}

func (s *AuthAntchainAtoSignFlowResponse) SetSignFieldIds(v string) *AuthAntchainAtoSignFlowResponse {
	s.SignFieldIds = &v
	return s
}

type UnbindAntchainAtoWithholdSignRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单id 长度不可超过50
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"50"`
}

func (s UnbindAntchainAtoWithholdSignRequest) String() string {
	return tea.Prettify(s)
}

func (s UnbindAntchainAtoWithholdSignRequest) GoString() string {
	return s.String()
}

func (s *UnbindAntchainAtoWithholdSignRequest) SetAuthToken(v string) *UnbindAntchainAtoWithholdSignRequest {
	s.AuthToken = &v
	return s
}

func (s *UnbindAntchainAtoWithholdSignRequest) SetProductInstanceId(v string) *UnbindAntchainAtoWithholdSignRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UnbindAntchainAtoWithholdSignRequest) SetOrderId(v string) *UnbindAntchainAtoWithholdSignRequest {
	s.OrderId = &v
	return s
}

type UnbindAntchainAtoWithholdSignResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s UnbindAntchainAtoWithholdSignResponse) String() string {
	return tea.Prettify(s)
}

func (s UnbindAntchainAtoWithholdSignResponse) GoString() string {
	return s.String()
}

func (s *UnbindAntchainAtoWithholdSignResponse) SetReqMsgId(v string) *UnbindAntchainAtoWithholdSignResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UnbindAntchainAtoWithholdSignResponse) SetResultCode(v string) *UnbindAntchainAtoWithholdSignResponse {
	s.ResultCode = &v
	return s
}

func (s *UnbindAntchainAtoWithholdSignResponse) SetResultMsg(v string) *UnbindAntchainAtoWithholdSignResponse {
	s.ResultMsg = &v
	return s
}

type CancelAntchainAtoWithholdPlanRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 当发现跨天继续提交
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"50"`
	// 取消原因
	// RENTING_OUT:退租
	// RENTING_AND_RESALE:租转售
	//
	//
	CancelReason *string `json:"cancel_reason,omitempty" xml:"cancel_reason,omitempty" require:"true" maxLength:"64"`
}

func (s CancelAntchainAtoWithholdPlanRequest) String() string {
	return tea.Prettify(s)
}

func (s CancelAntchainAtoWithholdPlanRequest) GoString() string {
	return s.String()
}

func (s *CancelAntchainAtoWithholdPlanRequest) SetAuthToken(v string) *CancelAntchainAtoWithholdPlanRequest {
	s.AuthToken = &v
	return s
}

func (s *CancelAntchainAtoWithholdPlanRequest) SetProductInstanceId(v string) *CancelAntchainAtoWithholdPlanRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CancelAntchainAtoWithholdPlanRequest) SetOrderId(v string) *CancelAntchainAtoWithholdPlanRequest {
	s.OrderId = &v
	return s
}

func (s *CancelAntchainAtoWithholdPlanRequest) SetCancelReason(v string) *CancelAntchainAtoWithholdPlanRequest {
	s.CancelReason = &v
	return s
}

type CancelAntchainAtoWithholdPlanResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CancelAntchainAtoWithholdPlanResponse) String() string {
	return tea.Prettify(s)
}

func (s CancelAntchainAtoWithholdPlanResponse) GoString() string {
	return s.String()
}

func (s *CancelAntchainAtoWithholdPlanResponse) SetReqMsgId(v string) *CancelAntchainAtoWithholdPlanResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CancelAntchainAtoWithholdPlanResponse) SetResultCode(v string) *CancelAntchainAtoWithholdPlanResponse {
	s.ResultCode = &v
	return s
}

func (s *CancelAntchainAtoWithholdPlanResponse) SetResultMsg(v string) *CancelAntchainAtoWithholdPlanResponse {
	s.ResultMsg = &v
	return s
}

type RepayAntchainAtoWithholdPlanRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单id 长度不可超过50
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"50"`
	// 第几期
	PeriodNum *int64 `json:"period_num,omitempty" xml:"period_num,omitempty" require:"true" minimum:"1"`
	// 扣款时间
	GmtPay *string `json:"gmt_pay,omitempty" xml:"gmt_pay,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 清偿清欠金额，单位为分
	PayOffAmount *int64 `json:"pay_off_amount,omitempty" xml:"pay_off_amount,omitempty" require:"true" minimum:"0"`
	// 清偿清欠方式
	// WECHAT:微信;
	// BANK:银行
	// ALIPAY:支付宝
	PayOffType *string `json:"pay_off_type,omitempty" xml:"pay_off_type,omitempty" require:"true" maxLength:"64"`
	// 清偿清欠单号,通过其他方式清偿的第三方单号;例如银行流水号或微信流水号
	PayOffNo *string `json:"pay_off_no,omitempty" xml:"pay_off_no,omitempty" require:"true" maxLength:"64"`
	// 清偿清欠银行名称,方式为银行时必填
	PayOffBankName *string `json:"pay_off_bank_name,omitempty" xml:"pay_off_bank_name,omitempty" maxLength:"64"`
}

func (s RepayAntchainAtoWithholdPlanRequest) String() string {
	return tea.Prettify(s)
}

func (s RepayAntchainAtoWithholdPlanRequest) GoString() string {
	return s.String()
}

func (s *RepayAntchainAtoWithholdPlanRequest) SetAuthToken(v string) *RepayAntchainAtoWithholdPlanRequest {
	s.AuthToken = &v
	return s
}

func (s *RepayAntchainAtoWithholdPlanRequest) SetProductInstanceId(v string) *RepayAntchainAtoWithholdPlanRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *RepayAntchainAtoWithholdPlanRequest) SetOrderId(v string) *RepayAntchainAtoWithholdPlanRequest {
	s.OrderId = &v
	return s
}

func (s *RepayAntchainAtoWithholdPlanRequest) SetPeriodNum(v int64) *RepayAntchainAtoWithholdPlanRequest {
	s.PeriodNum = &v
	return s
}

func (s *RepayAntchainAtoWithholdPlanRequest) SetGmtPay(v string) *RepayAntchainAtoWithholdPlanRequest {
	s.GmtPay = &v
	return s
}

func (s *RepayAntchainAtoWithholdPlanRequest) SetPayOffAmount(v int64) *RepayAntchainAtoWithholdPlanRequest {
	s.PayOffAmount = &v
	return s
}

func (s *RepayAntchainAtoWithholdPlanRequest) SetPayOffType(v string) *RepayAntchainAtoWithholdPlanRequest {
	s.PayOffType = &v
	return s
}

func (s *RepayAntchainAtoWithholdPlanRequest) SetPayOffNo(v string) *RepayAntchainAtoWithholdPlanRequest {
	s.PayOffNo = &v
	return s
}

func (s *RepayAntchainAtoWithholdPlanRequest) SetPayOffBankName(v string) *RepayAntchainAtoWithholdPlanRequest {
	s.PayOffBankName = &v
	return s
}

type RepayAntchainAtoWithholdPlanResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s RepayAntchainAtoWithholdPlanResponse) String() string {
	return tea.Prettify(s)
}

func (s RepayAntchainAtoWithholdPlanResponse) GoString() string {
	return s.String()
}

func (s *RepayAntchainAtoWithholdPlanResponse) SetReqMsgId(v string) *RepayAntchainAtoWithholdPlanResponse {
	s.ReqMsgId = &v
	return s
}

func (s *RepayAntchainAtoWithholdPlanResponse) SetResultCode(v string) *RepayAntchainAtoWithholdPlanResponse {
	s.ResultCode = &v
	return s
}

func (s *RepayAntchainAtoWithholdPlanResponse) SetResultMsg(v string) *RepayAntchainAtoWithholdPlanResponse {
	s.ResultMsg = &v
	return s
}

type SubmitAntchainAtoFrontSignRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 商户的订单号
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"64" minLength:"4"`
	// CRED_PSN_CH_IDCARD： 大陆身份证
	// CRED_PSN_CH_TWCARD：台湾来往大陆通行证
	// CRED_PSN_CH_MACAO"：澳门来往大陆通行证
	// CRED_PSN_CH_HONGKONG：香港来往大陆通行证
	// CRED_PSN_PASSPORT：护照
	UserIdType *string `json:"user_id_type,omitempty" xml:"user_id_type,omitempty" require:"true" maxLength:"40" minLength:"4"`
	// 用户证件号，需要采用RSA加密传输
	UserIdNumber *string `json:"user_id_number,omitempty" xml:"user_id_number,omitempty" require:"true"`
	// 姓名，需要采用RSA加密传输
	//
	UserName *string `json:"user_name,omitempty" xml:"user_name,omitempty" require:"true"`
	// 用户手机号，可不传；传的话需要采用RSA加密传输
	//
	UserMobile *string `json:"user_mobile,omitempty" xml:"user_mobile,omitempty"`
	// 用户的电子邮箱，可不传；传的话需要采用RSA加密传输
	//
	UserEmail *string `json:"user_email,omitempty" xml:"user_email,omitempty"`
	// 签署有效期，时间戳，例如：new Date().getTime()
	SignValidity *string `json:"sign_validity,omitempty" xml:"sign_validity,omitempty"`
	// 1-短信；2-邮件
	FlowNotifyType *string `json:"flow_notify_type,omitempty" xml:"flow_notify_type,omitempty"`
	// 业务场景，电子合同签署协议的时候的标题
	//
	BusinessScene *string `json:"business_scene,omitempty" xml:"business_scene,omitempty" require:"true" maxLength:"200" minLength:"2"`
	// 签署完成跳转链接
	//
	SignedRedirectUrl *string `json:"signed_redirect_url,omitempty" xml:"signed_redirect_url,omitempty"`
	// 签署的电子合同模板信息，List<Object>的JSON格式，Object如下： { templateId:__, // String格式 templateArgs: { "模板参数key":"模板参数值", // 必须为String } }
	TemplateList *string `json:"template_list,omitempty" xml:"template_list,omitempty" require:"true"`
	// 用户的支付宝uid
	AlipayUserId *string `json:"alipay_user_id,omitempty" xml:"alipay_user_id,omitempty" require:"true" maxLength:"24" minLength:"4"`
	// 商户签署区域标识。对应在合同模板的机构签署区域中的tag值(如果合同模板的签署区域的tag值为空，则可以不传这个参数)。必须完全对应，否则在多方签署的情况下根据tag找到不到对应的签署机构，会出错。
	MerchantName *string `json:"merchant_name,omitempty" xml:"merchant_name,omitempty" require:"true"`
	// 商户签署区域标识。对应在合同模板的机构签署区域中的tag值(如果合同模板的签署区域的tag值为空，则可以不传这个参数)。必须完全对应，否则在多方签署的情况下根据tag找到不到对应的签署机构，会出错。
	MerchantTag *string `json:"merchant_tag,omitempty" xml:"merchant_tag,omitempty" maxLength:"32" minLength:"2"`
	// 电子合同签署顺序，如果只有1方企业签署，传入1即可。如果是多方，并且需要设置签署顺序，则需要将这个值以及thirdSigner中的signOrder做一个签署顺序。
	MerchantSignOrder *int64 `json:"merchant_sign_order,omitempty" xml:"merchant_sign_order,omitempty"`
	// 商户需要盖的印章ID
	MerchantSealId *string `json:"merchant_seal_id,omitempty" xml:"merchant_seal_id,omitempty"`
	// CRED_ORG_USCC：统一社会信用代码，
	// CRED_ORG_REGCODE：工商注册号，
	// 只支持这两个值
	MerchantIdType *string `json:"merchant_id_type,omitempty" xml:"merchant_id_type,omitempty" require:"true" maxLength:"32" minLength:"4"`
	// 商户证件号，需要采用RSA加密传输
	MerchantIdNumber *string `json:"merchant_id_number,omitempty" xml:"merchant_id_number,omitempty" require:"true"`
	// 法人姓名，需要RSA加密传输
	//
	MerchantLegalName *string `json:"merchant_legal_name,omitempty" xml:"merchant_legal_name,omitempty"`
	// 法人证件号，需要采用RSA加密传输
	//
	MerchantLegalIdNumber *string `json:"merchant_legal_id_number,omitempty" xml:"merchant_legal_id_number,omitempty"`
	// 多方签署的其他参与方的签署信息，json的array格式，参考：[{"tag":"zf_a","orgName":"上海网络科技有限公司","orgIdType":"CRED_ORG_REGCODE","orgIdNumber":"12098760923","orgLegalName":"王大浪","orgLegalIdNumber":"107120196708289012","sealIds":["12b2317-0000-3333-2222-ec087dc97d8b"]}]，其中：orgIdNumber、orgLegalName、orgLegalIdNumber需要加密传输。
	ThirdSigner *string `json:"third_signer,omitempty" xml:"third_signer,omitempty"`
}

func (s SubmitAntchainAtoFrontSignRequest) String() string {
	return tea.Prettify(s)
}

func (s SubmitAntchainAtoFrontSignRequest) GoString() string {
	return s.String()
}

func (s *SubmitAntchainAtoFrontSignRequest) SetAuthToken(v string) *SubmitAntchainAtoFrontSignRequest {
	s.AuthToken = &v
	return s
}

func (s *SubmitAntchainAtoFrontSignRequest) SetProductInstanceId(v string) *SubmitAntchainAtoFrontSignRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SubmitAntchainAtoFrontSignRequest) SetOrderId(v string) *SubmitAntchainAtoFrontSignRequest {
	s.OrderId = &v
	return s
}

func (s *SubmitAntchainAtoFrontSignRequest) SetUserIdType(v string) *SubmitAntchainAtoFrontSignRequest {
	s.UserIdType = &v
	return s
}

func (s *SubmitAntchainAtoFrontSignRequest) SetUserIdNumber(v string) *SubmitAntchainAtoFrontSignRequest {
	s.UserIdNumber = &v
	return s
}

func (s *SubmitAntchainAtoFrontSignRequest) SetUserName(v string) *SubmitAntchainAtoFrontSignRequest {
	s.UserName = &v
	return s
}

func (s *SubmitAntchainAtoFrontSignRequest) SetUserMobile(v string) *SubmitAntchainAtoFrontSignRequest {
	s.UserMobile = &v
	return s
}

func (s *SubmitAntchainAtoFrontSignRequest) SetUserEmail(v string) *SubmitAntchainAtoFrontSignRequest {
	s.UserEmail = &v
	return s
}

func (s *SubmitAntchainAtoFrontSignRequest) SetSignValidity(v string) *SubmitAntchainAtoFrontSignRequest {
	s.SignValidity = &v
	return s
}

func (s *SubmitAntchainAtoFrontSignRequest) SetFlowNotifyType(v string) *SubmitAntchainAtoFrontSignRequest {
	s.FlowNotifyType = &v
	return s
}

func (s *SubmitAntchainAtoFrontSignRequest) SetBusinessScene(v string) *SubmitAntchainAtoFrontSignRequest {
	s.BusinessScene = &v
	return s
}

func (s *SubmitAntchainAtoFrontSignRequest) SetSignedRedirectUrl(v string) *SubmitAntchainAtoFrontSignRequest {
	s.SignedRedirectUrl = &v
	return s
}

func (s *SubmitAntchainAtoFrontSignRequest) SetTemplateList(v string) *SubmitAntchainAtoFrontSignRequest {
	s.TemplateList = &v
	return s
}

func (s *SubmitAntchainAtoFrontSignRequest) SetAlipayUserId(v string) *SubmitAntchainAtoFrontSignRequest {
	s.AlipayUserId = &v
	return s
}

func (s *SubmitAntchainAtoFrontSignRequest) SetMerchantName(v string) *SubmitAntchainAtoFrontSignRequest {
	s.MerchantName = &v
	return s
}

func (s *SubmitAntchainAtoFrontSignRequest) SetMerchantTag(v string) *SubmitAntchainAtoFrontSignRequest {
	s.MerchantTag = &v
	return s
}

func (s *SubmitAntchainAtoFrontSignRequest) SetMerchantSignOrder(v int64) *SubmitAntchainAtoFrontSignRequest {
	s.MerchantSignOrder = &v
	return s
}

func (s *SubmitAntchainAtoFrontSignRequest) SetMerchantSealId(v string) *SubmitAntchainAtoFrontSignRequest {
	s.MerchantSealId = &v
	return s
}

func (s *SubmitAntchainAtoFrontSignRequest) SetMerchantIdType(v string) *SubmitAntchainAtoFrontSignRequest {
	s.MerchantIdType = &v
	return s
}

func (s *SubmitAntchainAtoFrontSignRequest) SetMerchantIdNumber(v string) *SubmitAntchainAtoFrontSignRequest {
	s.MerchantIdNumber = &v
	return s
}

func (s *SubmitAntchainAtoFrontSignRequest) SetMerchantLegalName(v string) *SubmitAntchainAtoFrontSignRequest {
	s.MerchantLegalName = &v
	return s
}

func (s *SubmitAntchainAtoFrontSignRequest) SetMerchantLegalIdNumber(v string) *SubmitAntchainAtoFrontSignRequest {
	s.MerchantLegalIdNumber = &v
	return s
}

func (s *SubmitAntchainAtoFrontSignRequest) SetThirdSigner(v string) *SubmitAntchainAtoFrontSignRequest {
	s.ThirdSigner = &v
	return s
}

type SubmitAntchainAtoFrontSignResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 签署合同单号
	//
	SignNo *string `json:"sign_no,omitempty" xml:"sign_no,omitempty"`
	// 电子签署流程ID
	//
	FlowId *string `json:"flow_id,omitempty" xml:"flow_id,omitempty"`
	// 签署用户ID
	//
	AccountId *string `json:"account_id,omitempty" xml:"account_id,omitempty"`
	// 签署扩展信息，用于获取签署链接等。JSON格式字符串。
	SignInfo *string `json:"sign_info,omitempty" xml:"sign_info,omitempty"`
}

func (s SubmitAntchainAtoFrontSignResponse) String() string {
	return tea.Prettify(s)
}

func (s SubmitAntchainAtoFrontSignResponse) GoString() string {
	return s.String()
}

func (s *SubmitAntchainAtoFrontSignResponse) SetReqMsgId(v string) *SubmitAntchainAtoFrontSignResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SubmitAntchainAtoFrontSignResponse) SetResultCode(v string) *SubmitAntchainAtoFrontSignResponse {
	s.ResultCode = &v
	return s
}

func (s *SubmitAntchainAtoFrontSignResponse) SetResultMsg(v string) *SubmitAntchainAtoFrontSignResponse {
	s.ResultMsg = &v
	return s
}

func (s *SubmitAntchainAtoFrontSignResponse) SetSignNo(v string) *SubmitAntchainAtoFrontSignResponse {
	s.SignNo = &v
	return s
}

func (s *SubmitAntchainAtoFrontSignResponse) SetFlowId(v string) *SubmitAntchainAtoFrontSignResponse {
	s.FlowId = &v
	return s
}

func (s *SubmitAntchainAtoFrontSignResponse) SetAccountId(v string) *SubmitAntchainAtoFrontSignResponse {
	s.AccountId = &v
	return s
}

func (s *SubmitAntchainAtoFrontSignResponse) SetSignInfo(v string) *SubmitAntchainAtoFrontSignResponse {
	s.SignInfo = &v
	return s
}

type SyncAntchainAtoFrontTradeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 类型
	// 1. orderFullInfo ， 订单所有信息同步
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// json.toString
	BizContent *string `json:"biz_content,omitempty" xml:"biz_content,omitempty" require:"true"`
}

func (s SyncAntchainAtoFrontTradeRequest) String() string {
	return tea.Prettify(s)
}

func (s SyncAntchainAtoFrontTradeRequest) GoString() string {
	return s.String()
}

func (s *SyncAntchainAtoFrontTradeRequest) SetAuthToken(v string) *SyncAntchainAtoFrontTradeRequest {
	s.AuthToken = &v
	return s
}

func (s *SyncAntchainAtoFrontTradeRequest) SetProductInstanceId(v string) *SyncAntchainAtoFrontTradeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SyncAntchainAtoFrontTradeRequest) SetType(v string) *SyncAntchainAtoFrontTradeRequest {
	s.Type = &v
	return s
}

func (s *SyncAntchainAtoFrontTradeRequest) SetBizContent(v string) *SyncAntchainAtoFrontTradeRequest {
	s.BizContent = &v
	return s
}

type SyncAntchainAtoFrontTradeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回信息
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s SyncAntchainAtoFrontTradeResponse) String() string {
	return tea.Prettify(s)
}

func (s SyncAntchainAtoFrontTradeResponse) GoString() string {
	return s.String()
}

func (s *SyncAntchainAtoFrontTradeResponse) SetReqMsgId(v string) *SyncAntchainAtoFrontTradeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SyncAntchainAtoFrontTradeResponse) SetResultCode(v string) *SyncAntchainAtoFrontTradeResponse {
	s.ResultCode = &v
	return s
}

func (s *SyncAntchainAtoFrontTradeResponse) SetResultMsg(v string) *SyncAntchainAtoFrontTradeResponse {
	s.ResultMsg = &v
	return s
}

func (s *SyncAntchainAtoFrontTradeResponse) SetResponseData(v string) *SyncAntchainAtoFrontTradeResponse {
	s.ResponseData = &v
	return s
}

type RetryAntchainAtoWithholdPlanRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单id 长度不可超过50
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"50"`
	// 第几期
	PeriodNum *int64 `json:"period_num,omitempty" xml:"period_num,omitempty" require:"true" minimum:"1"`
}

func (s RetryAntchainAtoWithholdPlanRequest) String() string {
	return tea.Prettify(s)
}

func (s RetryAntchainAtoWithholdPlanRequest) GoString() string {
	return s.String()
}

func (s *RetryAntchainAtoWithholdPlanRequest) SetAuthToken(v string) *RetryAntchainAtoWithholdPlanRequest {
	s.AuthToken = &v
	return s
}

func (s *RetryAntchainAtoWithholdPlanRequest) SetProductInstanceId(v string) *RetryAntchainAtoWithholdPlanRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *RetryAntchainAtoWithholdPlanRequest) SetOrderId(v string) *RetryAntchainAtoWithholdPlanRequest {
	s.OrderId = &v
	return s
}

func (s *RetryAntchainAtoWithholdPlanRequest) SetPeriodNum(v int64) *RetryAntchainAtoWithholdPlanRequest {
	s.PeriodNum = &v
	return s
}

type RetryAntchainAtoWithholdPlanResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s RetryAntchainAtoWithholdPlanResponse) String() string {
	return tea.Prettify(s)
}

func (s RetryAntchainAtoWithholdPlanResponse) GoString() string {
	return s.String()
}

func (s *RetryAntchainAtoWithholdPlanResponse) SetReqMsgId(v string) *RetryAntchainAtoWithholdPlanResponse {
	s.ReqMsgId = &v
	return s
}

func (s *RetryAntchainAtoWithholdPlanResponse) SetResultCode(v string) *RetryAntchainAtoWithholdPlanResponse {
	s.ResultCode = &v
	return s
}

func (s *RetryAntchainAtoWithholdPlanResponse) SetResultMsg(v string) *RetryAntchainAtoWithholdPlanResponse {
	s.ResultMsg = &v
	return s
}

type ConfirmAntchainAtoWithholdSignasyncunsignRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"50" minLength:"1"`
	// 操作动作
	// 同意：AGREE
	// 拒绝：REFUSE
	Operate *string `json:"operate,omitempty" xml:"operate,omitempty" require:"true" maxLength:"16" minLength:"1"`
	// 拒绝原因码,商户拒绝时必填。
	// USER_OWE_MONEY：用户账户存在欠费订单
	// USER_IN_SERVICE：用户有进行的订单
	RefuseReasonCode *string `json:"refuse_reason_code,omitempty" xml:"refuse_reason_code,omitempty" maxLength:"16" minLength:"1"`
	// 用户欠款金额，单位为分
	// refuse_reason_code=USER_OWE_MONEY时必填
	UserOweMoney *int64 `json:"user_owe_money,omitempty" xml:"user_owe_money,omitempty" minimum:"1"`
	// 用户进行中的服务
	// refuse_reason_code=USER_IN_SERVICE时必填
	UserInService *string `json:"user_in_service,omitempty" xml:"user_in_service,omitempty" maxLength:"128" minLength:"1"`
}

func (s ConfirmAntchainAtoWithholdSignasyncunsignRequest) String() string {
	return tea.Prettify(s)
}

func (s ConfirmAntchainAtoWithholdSignasyncunsignRequest) GoString() string {
	return s.String()
}

func (s *ConfirmAntchainAtoWithholdSignasyncunsignRequest) SetAuthToken(v string) *ConfirmAntchainAtoWithholdSignasyncunsignRequest {
	s.AuthToken = &v
	return s
}

func (s *ConfirmAntchainAtoWithholdSignasyncunsignRequest) SetProductInstanceId(v string) *ConfirmAntchainAtoWithholdSignasyncunsignRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ConfirmAntchainAtoWithholdSignasyncunsignRequest) SetOrderId(v string) *ConfirmAntchainAtoWithholdSignasyncunsignRequest {
	s.OrderId = &v
	return s
}

func (s *ConfirmAntchainAtoWithholdSignasyncunsignRequest) SetOperate(v string) *ConfirmAntchainAtoWithholdSignasyncunsignRequest {
	s.Operate = &v
	return s
}

func (s *ConfirmAntchainAtoWithholdSignasyncunsignRequest) SetRefuseReasonCode(v string) *ConfirmAntchainAtoWithholdSignasyncunsignRequest {
	s.RefuseReasonCode = &v
	return s
}

func (s *ConfirmAntchainAtoWithholdSignasyncunsignRequest) SetUserOweMoney(v int64) *ConfirmAntchainAtoWithholdSignasyncunsignRequest {
	s.UserOweMoney = &v
	return s
}

func (s *ConfirmAntchainAtoWithholdSignasyncunsignRequest) SetUserInService(v string) *ConfirmAntchainAtoWithholdSignasyncunsignRequest {
	s.UserInService = &v
	return s
}

type ConfirmAntchainAtoWithholdSignasyncunsignResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s ConfirmAntchainAtoWithholdSignasyncunsignResponse) String() string {
	return tea.Prettify(s)
}

func (s ConfirmAntchainAtoWithholdSignasyncunsignResponse) GoString() string {
	return s.String()
}

func (s *ConfirmAntchainAtoWithholdSignasyncunsignResponse) SetReqMsgId(v string) *ConfirmAntchainAtoWithholdSignasyncunsignResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ConfirmAntchainAtoWithholdSignasyncunsignResponse) SetResultCode(v string) *ConfirmAntchainAtoWithholdSignasyncunsignResponse {
	s.ResultCode = &v
	return s
}

func (s *ConfirmAntchainAtoWithholdSignasyncunsignResponse) SetResultMsg(v string) *ConfirmAntchainAtoWithholdSignasyncunsignResponse {
	s.ResultMsg = &v
	return s
}

type UploadAntchainAtoFundFlowRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单所属商户的统一社会信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true"`
	// 商户的订单号
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
	// 签署合同单号
	SignNo *string `json:"sign_no,omitempty" xml:"sign_no,omitempty" require:"true"`
	// 返回的文件fileItemNo编号
	FileItemNo *string `json:"file_item_no,omitempty" xml:"file_item_no,omitempty" require:"true"`
	// 上传的pdf文件，需要以.pdf后缀结尾
	// 待上传文件
	FileObject io.Reader `json:"fileObject,omitempty" xml:"fileObject,omitempty"`
	// 待上传文件名
	FileObjectName *string `json:"fileObjectName,omitempty" xml:"fileObjectName,omitempty"`
	FileId         *string `json:"file_id,omitempty" xml:"file_id,omitempty" require:"true"`
}

func (s UploadAntchainAtoFundFlowRequest) String() string {
	return tea.Prettify(s)
}

func (s UploadAntchainAtoFundFlowRequest) GoString() string {
	return s.String()
}

func (s *UploadAntchainAtoFundFlowRequest) SetAuthToken(v string) *UploadAntchainAtoFundFlowRequest {
	s.AuthToken = &v
	return s
}

func (s *UploadAntchainAtoFundFlowRequest) SetProductInstanceId(v string) *UploadAntchainAtoFundFlowRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UploadAntchainAtoFundFlowRequest) SetMerchantId(v string) *UploadAntchainAtoFundFlowRequest {
	s.MerchantId = &v
	return s
}

func (s *UploadAntchainAtoFundFlowRequest) SetOrderId(v string) *UploadAntchainAtoFundFlowRequest {
	s.OrderId = &v
	return s
}

func (s *UploadAntchainAtoFundFlowRequest) SetSignNo(v string) *UploadAntchainAtoFundFlowRequest {
	s.SignNo = &v
	return s
}

func (s *UploadAntchainAtoFundFlowRequest) SetFileItemNo(v string) *UploadAntchainAtoFundFlowRequest {
	s.FileItemNo = &v
	return s
}

func (s *UploadAntchainAtoFundFlowRequest) SetFileObject(v io.Reader) *UploadAntchainAtoFundFlowRequest {
	s.FileObject = v
	return s
}

func (s *UploadAntchainAtoFundFlowRequest) SetFileObjectName(v string) *UploadAntchainAtoFundFlowRequest {
	s.FileObjectName = &v
	return s
}

func (s *UploadAntchainAtoFundFlowRequest) SetFileId(v string) *UploadAntchainAtoFundFlowRequest {
	s.FileId = &v
	return s
}

type UploadAntchainAtoFundFlowResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s UploadAntchainAtoFundFlowResponse) String() string {
	return tea.Prettify(s)
}

func (s UploadAntchainAtoFundFlowResponse) GoString() string {
	return s.String()
}

func (s *UploadAntchainAtoFundFlowResponse) SetReqMsgId(v string) *UploadAntchainAtoFundFlowResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UploadAntchainAtoFundFlowResponse) SetResultCode(v string) *UploadAntchainAtoFundFlowResponse {
	s.ResultCode = &v
	return s
}

func (s *UploadAntchainAtoFundFlowResponse) SetResultMsg(v string) *UploadAntchainAtoFundFlowResponse {
	s.ResultMsg = &v
	return s
}

type GetAntchainAtoFundFlowRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单所属商户的统一社会信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true"`
	// 商户的订单号
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
	// 合同类型
	ContractType *string `json:"contract_type,omitempty" xml:"contract_type,omitempty"`
}

func (s GetAntchainAtoFundFlowRequest) String() string {
	return tea.Prettify(s)
}

func (s GetAntchainAtoFundFlowRequest) GoString() string {
	return s.String()
}

func (s *GetAntchainAtoFundFlowRequest) SetAuthToken(v string) *GetAntchainAtoFundFlowRequest {
	s.AuthToken = &v
	return s
}

func (s *GetAntchainAtoFundFlowRequest) SetProductInstanceId(v string) *GetAntchainAtoFundFlowRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetAntchainAtoFundFlowRequest) SetMerchantId(v string) *GetAntchainAtoFundFlowRequest {
	s.MerchantId = &v
	return s
}

func (s *GetAntchainAtoFundFlowRequest) SetOrderId(v string) *GetAntchainAtoFundFlowRequest {
	s.OrderId = &v
	return s
}

func (s *GetAntchainAtoFundFlowRequest) SetContractType(v string) *GetAntchainAtoFundFlowRequest {
	s.ContractType = &v
	return s
}

type GetAntchainAtoFundFlowResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 商户的订单号
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty"`
	// 需要落章的合同列表，需要status状态为FINISH可以落章
	ContractList *string `json:"contract_list,omitempty" xml:"contract_list,omitempty"`
}

func (s GetAntchainAtoFundFlowResponse) String() string {
	return tea.Prettify(s)
}

func (s GetAntchainAtoFundFlowResponse) GoString() string {
	return s.String()
}

func (s *GetAntchainAtoFundFlowResponse) SetReqMsgId(v string) *GetAntchainAtoFundFlowResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetAntchainAtoFundFlowResponse) SetResultCode(v string) *GetAntchainAtoFundFlowResponse {
	s.ResultCode = &v
	return s
}

func (s *GetAntchainAtoFundFlowResponse) SetResultMsg(v string) *GetAntchainAtoFundFlowResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetAntchainAtoFundFlowResponse) SetOrderId(v string) *GetAntchainAtoFundFlowResponse {
	s.OrderId = &v
	return s
}

func (s *GetAntchainAtoFundFlowResponse) SetContractList(v string) *GetAntchainAtoFundFlowResponse {
	s.ContractList = &v
	return s
}

type RefuseAntchainAtoFundFlowRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单所属商户的统一社会信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true"`
	// 商户的订单号
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
	// 签署合同单号
	SignNo *string `json:"sign_no,omitempty" xml:"sign_no,omitempty" require:"true"`
	// 填写拒绝落章原因，如果同意则不用填写
	SignReason *string `json:"sign_reason,omitempty" xml:"sign_reason,omitempty"`
}

func (s RefuseAntchainAtoFundFlowRequest) String() string {
	return tea.Prettify(s)
}

func (s RefuseAntchainAtoFundFlowRequest) GoString() string {
	return s.String()
}

func (s *RefuseAntchainAtoFundFlowRequest) SetAuthToken(v string) *RefuseAntchainAtoFundFlowRequest {
	s.AuthToken = &v
	return s
}

func (s *RefuseAntchainAtoFundFlowRequest) SetProductInstanceId(v string) *RefuseAntchainAtoFundFlowRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *RefuseAntchainAtoFundFlowRequest) SetMerchantId(v string) *RefuseAntchainAtoFundFlowRequest {
	s.MerchantId = &v
	return s
}

func (s *RefuseAntchainAtoFundFlowRequest) SetOrderId(v string) *RefuseAntchainAtoFundFlowRequest {
	s.OrderId = &v
	return s
}

func (s *RefuseAntchainAtoFundFlowRequest) SetSignNo(v string) *RefuseAntchainAtoFundFlowRequest {
	s.SignNo = &v
	return s
}

func (s *RefuseAntchainAtoFundFlowRequest) SetSignReason(v string) *RefuseAntchainAtoFundFlowRequest {
	s.SignReason = &v
	return s
}

type RefuseAntchainAtoFundFlowResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s RefuseAntchainAtoFundFlowResponse) String() string {
	return tea.Prettify(s)
}

func (s RefuseAntchainAtoFundFlowResponse) GoString() string {
	return s.String()
}

func (s *RefuseAntchainAtoFundFlowResponse) SetReqMsgId(v string) *RefuseAntchainAtoFundFlowResponse {
	s.ReqMsgId = &v
	return s
}

func (s *RefuseAntchainAtoFundFlowResponse) SetResultCode(v string) *RefuseAntchainAtoFundFlowResponse {
	s.ResultCode = &v
	return s
}

func (s *RefuseAntchainAtoFundFlowResponse) SetResultMsg(v string) *RefuseAntchainAtoFundFlowResponse {
	s.ResultMsg = &v
	return s
}

type AuthAntchainAtoFundFlowRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单所属商户的统一社会信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true"`
	// 商户的订单号
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
	// 签署的电子合同ID
	SignNo *string `json:"sign_no,omitempty" xml:"sign_no,omitempty" require:"true"`
	// 签署区域的tag，和发起签署流程的机构的tag对应
	Tag *string `json:"tag,omitempty" xml:"tag,omitempty" require:"true"`
}

func (s AuthAntchainAtoFundFlowRequest) String() string {
	return tea.Prettify(s)
}

func (s AuthAntchainAtoFundFlowRequest) GoString() string {
	return s.String()
}

func (s *AuthAntchainAtoFundFlowRequest) SetAuthToken(v string) *AuthAntchainAtoFundFlowRequest {
	s.AuthToken = &v
	return s
}

func (s *AuthAntchainAtoFundFlowRequest) SetProductInstanceId(v string) *AuthAntchainAtoFundFlowRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AuthAntchainAtoFundFlowRequest) SetMerchantId(v string) *AuthAntchainAtoFundFlowRequest {
	s.MerchantId = &v
	return s
}

func (s *AuthAntchainAtoFundFlowRequest) SetOrderId(v string) *AuthAntchainAtoFundFlowRequest {
	s.OrderId = &v
	return s
}

func (s *AuthAntchainAtoFundFlowRequest) SetSignNo(v string) *AuthAntchainAtoFundFlowRequest {
	s.SignNo = &v
	return s
}

func (s *AuthAntchainAtoFundFlowRequest) SetTag(v string) *AuthAntchainAtoFundFlowRequest {
	s.Tag = &v
	return s
}

type AuthAntchainAtoFundFlowResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 签署最后落签的签署区域id列表
	SignFieldIds *string `json:"sign_field_ids,omitempty" xml:"sign_field_ids,omitempty"`
}

func (s AuthAntchainAtoFundFlowResponse) String() string {
	return tea.Prettify(s)
}

func (s AuthAntchainAtoFundFlowResponse) GoString() string {
	return s.String()
}

func (s *AuthAntchainAtoFundFlowResponse) SetReqMsgId(v string) *AuthAntchainAtoFundFlowResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AuthAntchainAtoFundFlowResponse) SetResultCode(v string) *AuthAntchainAtoFundFlowResponse {
	s.ResultCode = &v
	return s
}

func (s *AuthAntchainAtoFundFlowResponse) SetResultMsg(v string) *AuthAntchainAtoFundFlowResponse {
	s.ResultMsg = &v
	return s
}

func (s *AuthAntchainAtoFundFlowResponse) SetSignFieldIds(v string) *AuthAntchainAtoFundFlowResponse {
	s.SignFieldIds = &v
	return s
}

type CreateAntchainAtoWithholdActivepayRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单id 长度不可超过50
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"50"`
	// 第几期
	PeriodNum *int64 `json:"period_num,omitempty" xml:"period_num,omitempty" require:"true" minimum:"1"`
}

func (s CreateAntchainAtoWithholdActivepayRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateAntchainAtoWithholdActivepayRequest) GoString() string {
	return s.String()
}

func (s *CreateAntchainAtoWithholdActivepayRequest) SetAuthToken(v string) *CreateAntchainAtoWithholdActivepayRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateAntchainAtoWithholdActivepayRequest) SetProductInstanceId(v string) *CreateAntchainAtoWithholdActivepayRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateAntchainAtoWithholdActivepayRequest) SetOrderId(v string) *CreateAntchainAtoWithholdActivepayRequest {
	s.OrderId = &v
	return s
}

func (s *CreateAntchainAtoWithholdActivepayRequest) SetPeriodNum(v int64) *CreateAntchainAtoWithholdActivepayRequest {
	s.PeriodNum = &v
	return s
}

type CreateAntchainAtoWithholdActivepayResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 支付宝支付订单号，用于拉起主动支付页面
	TradeNo *string `json:"trade_no,omitempty" xml:"trade_no,omitempty"`
}

func (s CreateAntchainAtoWithholdActivepayResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateAntchainAtoWithholdActivepayResponse) GoString() string {
	return s.String()
}

func (s *CreateAntchainAtoWithholdActivepayResponse) SetReqMsgId(v string) *CreateAntchainAtoWithholdActivepayResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateAntchainAtoWithholdActivepayResponse) SetResultCode(v string) *CreateAntchainAtoWithholdActivepayResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateAntchainAtoWithholdActivepayResponse) SetResultMsg(v string) *CreateAntchainAtoWithholdActivepayResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateAntchainAtoWithholdActivepayResponse) SetTradeNo(v string) *CreateAntchainAtoWithholdActivepayResponse {
	s.TradeNo = &v
	return s
}

type QueryAntchainAtoWithholdActivepayRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单id 长度不可超过50
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"50" minLength:"1"`
	// 第几期
	PeriodNum *int64 `json:"period_num,omitempty" xml:"period_num,omitempty" require:"true"`
	// 支付宝支付订单号，当传递此单号时，只会返回当前单据
	TradeNo *string `json:"trade_no,omitempty" xml:"trade_no,omitempty" maxLength:"64"`
}

func (s QueryAntchainAtoWithholdActivepayRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAntchainAtoWithholdActivepayRequest) GoString() string {
	return s.String()
}

func (s *QueryAntchainAtoWithholdActivepayRequest) SetAuthToken(v string) *QueryAntchainAtoWithholdActivepayRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAntchainAtoWithholdActivepayRequest) SetProductInstanceId(v string) *QueryAntchainAtoWithholdActivepayRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAntchainAtoWithholdActivepayRequest) SetOrderId(v string) *QueryAntchainAtoWithholdActivepayRequest {
	s.OrderId = &v
	return s
}

func (s *QueryAntchainAtoWithholdActivepayRequest) SetPeriodNum(v int64) *QueryAntchainAtoWithholdActivepayRequest {
	s.PeriodNum = &v
	return s
}

func (s *QueryAntchainAtoWithholdActivepayRequest) SetTradeNo(v string) *QueryAntchainAtoWithholdActivepayRequest {
	s.TradeNo = &v
	return s
}

type QueryAntchainAtoWithholdActivepayResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 当前支付单
	CurrentOrder *ActivePayOrder `json:"current_order,omitempty" xml:"current_order,omitempty"`
	// 主动支付单列表，当不通过trade_no查询时有值
	Orders []*ActivePayOrder `json:"orders,omitempty" xml:"orders,omitempty" type:"Repeated"`
}

func (s QueryAntchainAtoWithholdActivepayResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAntchainAtoWithholdActivepayResponse) GoString() string {
	return s.String()
}

func (s *QueryAntchainAtoWithholdActivepayResponse) SetReqMsgId(v string) *QueryAntchainAtoWithholdActivepayResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAntchainAtoWithholdActivepayResponse) SetResultCode(v string) *QueryAntchainAtoWithholdActivepayResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAntchainAtoWithholdActivepayResponse) SetResultMsg(v string) *QueryAntchainAtoWithholdActivepayResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAntchainAtoWithholdActivepayResponse) SetCurrentOrder(v *ActivePayOrder) *QueryAntchainAtoWithholdActivepayResponse {
	s.CurrentOrder = v
	return s
}

func (s *QueryAntchainAtoWithholdActivepayResponse) SetOrders(v []*ActivePayOrder) *QueryAntchainAtoWithholdActivepayResponse {
	s.Orders = v
	return s
}

type CancelAntchainAtoWithholdActivepayRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单id 长度不可超过50
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
	// 第几期
	PeriodNum *int64 `json:"period_num,omitempty" xml:"period_num,omitempty" require:"true"`
	// 支付宝支付订单号，当传递此单号时，只会取消指定单据号，不传递时取消当前代扣
	TradeNo *string `json:"trade_no,omitempty" xml:"trade_no,omitempty"`
}

func (s CancelAntchainAtoWithholdActivepayRequest) String() string {
	return tea.Prettify(s)
}

func (s CancelAntchainAtoWithholdActivepayRequest) GoString() string {
	return s.String()
}

func (s *CancelAntchainAtoWithholdActivepayRequest) SetAuthToken(v string) *CancelAntchainAtoWithholdActivepayRequest {
	s.AuthToken = &v
	return s
}

func (s *CancelAntchainAtoWithholdActivepayRequest) SetProductInstanceId(v string) *CancelAntchainAtoWithholdActivepayRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CancelAntchainAtoWithholdActivepayRequest) SetOrderId(v string) *CancelAntchainAtoWithholdActivepayRequest {
	s.OrderId = &v
	return s
}

func (s *CancelAntchainAtoWithholdActivepayRequest) SetPeriodNum(v int64) *CancelAntchainAtoWithholdActivepayRequest {
	s.PeriodNum = &v
	return s
}

func (s *CancelAntchainAtoWithholdActivepayRequest) SetTradeNo(v string) *CancelAntchainAtoWithholdActivepayRequest {
	s.TradeNo = &v
	return s
}

type CancelAntchainAtoWithholdActivepayResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 取消的单号
	TradeNo *string `json:"trade_no,omitempty" xml:"trade_no,omitempty"`
}

func (s CancelAntchainAtoWithholdActivepayResponse) String() string {
	return tea.Prettify(s)
}

func (s CancelAntchainAtoWithholdActivepayResponse) GoString() string {
	return s.String()
}

func (s *CancelAntchainAtoWithholdActivepayResponse) SetReqMsgId(v string) *CancelAntchainAtoWithholdActivepayResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CancelAntchainAtoWithholdActivepayResponse) SetResultCode(v string) *CancelAntchainAtoWithholdActivepayResponse {
	s.ResultCode = &v
	return s
}

func (s *CancelAntchainAtoWithholdActivepayResponse) SetResultMsg(v string) *CancelAntchainAtoWithholdActivepayResponse {
	s.ResultMsg = &v
	return s
}

func (s *CancelAntchainAtoWithholdActivepayResponse) SetTradeNo(v string) *CancelAntchainAtoWithholdActivepayResponse {
	s.TradeNo = &v
	return s
}

type CancelAntchainAtoFundPlanRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单id 长度不可超过50
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
	// 订单所属商户的社会信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true"`
	// 取消原因
	// ACTIVE_REDEEM:自主赎回
	// RENTING_OUT_REDEEM:退租赎回
	// RENTING_AND_RESALE_REDEEM:租转售赎回
	CancelReason *string `json:"cancel_reason,omitempty" xml:"cancel_reason,omitempty" require:"true"`
}

func (s CancelAntchainAtoFundPlanRequest) String() string {
	return tea.Prettify(s)
}

func (s CancelAntchainAtoFundPlanRequest) GoString() string {
	return s.String()
}

func (s *CancelAntchainAtoFundPlanRequest) SetAuthToken(v string) *CancelAntchainAtoFundPlanRequest {
	s.AuthToken = &v
	return s
}

func (s *CancelAntchainAtoFundPlanRequest) SetProductInstanceId(v string) *CancelAntchainAtoFundPlanRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CancelAntchainAtoFundPlanRequest) SetOrderId(v string) *CancelAntchainAtoFundPlanRequest {
	s.OrderId = &v
	return s
}

func (s *CancelAntchainAtoFundPlanRequest) SetMerchantId(v string) *CancelAntchainAtoFundPlanRequest {
	s.MerchantId = &v
	return s
}

func (s *CancelAntchainAtoFundPlanRequest) SetCancelReason(v string) *CancelAntchainAtoFundPlanRequest {
	s.CancelReason = &v
	return s
}

type CancelAntchainAtoFundPlanResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CancelAntchainAtoFundPlanResponse) String() string {
	return tea.Prettify(s)
}

func (s CancelAntchainAtoFundPlanResponse) GoString() string {
	return s.String()
}

func (s *CancelAntchainAtoFundPlanResponse) SetReqMsgId(v string) *CancelAntchainAtoFundPlanResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CancelAntchainAtoFundPlanResponse) SetResultCode(v string) *CancelAntchainAtoFundPlanResponse {
	s.ResultCode = &v
	return s
}

func (s *CancelAntchainAtoFundPlanResponse) SetResultMsg(v string) *CancelAntchainAtoFundPlanResponse {
	s.ResultMsg = &v
	return s
}

type CallbackAntchainAtoFundNotifyRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// ASYNC_UNSIGN_APPLY
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 数据
	Data *string `json:"data,omitempty" xml:"data,omitempty" require:"true"`
}

func (s CallbackAntchainAtoFundNotifyRequest) String() string {
	return tea.Prettify(s)
}

func (s CallbackAntchainAtoFundNotifyRequest) GoString() string {
	return s.String()
}

func (s *CallbackAntchainAtoFundNotifyRequest) SetAuthToken(v string) *CallbackAntchainAtoFundNotifyRequest {
	s.AuthToken = &v
	return s
}

func (s *CallbackAntchainAtoFundNotifyRequest) SetProductInstanceId(v string) *CallbackAntchainAtoFundNotifyRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CallbackAntchainAtoFundNotifyRequest) SetType(v string) *CallbackAntchainAtoFundNotifyRequest {
	s.Type = &v
	return s
}

func (s *CallbackAntchainAtoFundNotifyRequest) SetData(v string) *CallbackAntchainAtoFundNotifyRequest {
	s.Data = &v
	return s
}

type CallbackAntchainAtoFundNotifyResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CallbackAntchainAtoFundNotifyResponse) String() string {
	return tea.Prettify(s)
}

func (s CallbackAntchainAtoFundNotifyResponse) GoString() string {
	return s.String()
}

func (s *CallbackAntchainAtoFundNotifyResponse) SetReqMsgId(v string) *CallbackAntchainAtoFundNotifyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CallbackAntchainAtoFundNotifyResponse) SetResultCode(v string) *CallbackAntchainAtoFundNotifyResponse {
	s.ResultCode = &v
	return s
}

func (s *CallbackAntchainAtoFundNotifyResponse) SetResultMsg(v string) *CallbackAntchainAtoFundNotifyResponse {
	s.ResultMsg = &v
	return s
}

type SyncAntchainAtoTradeFinanceloanapplyRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"50" minLength:"1"`
	// 订单所属商户的社会信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true" maxLength:"64" minLength:"1"`
	// 融资放款申请接口
	MerchantName *string `json:"merchant_name,omitempty" xml:"merchant_name,omitempty" require:"true"`
}

func (s SyncAntchainAtoTradeFinanceloanapplyRequest) String() string {
	return tea.Prettify(s)
}

func (s SyncAntchainAtoTradeFinanceloanapplyRequest) GoString() string {
	return s.String()
}

func (s *SyncAntchainAtoTradeFinanceloanapplyRequest) SetAuthToken(v string) *SyncAntchainAtoTradeFinanceloanapplyRequest {
	s.AuthToken = &v
	return s
}

func (s *SyncAntchainAtoTradeFinanceloanapplyRequest) SetProductInstanceId(v string) *SyncAntchainAtoTradeFinanceloanapplyRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SyncAntchainAtoTradeFinanceloanapplyRequest) SetOrderId(v string) *SyncAntchainAtoTradeFinanceloanapplyRequest {
	s.OrderId = &v
	return s
}

func (s *SyncAntchainAtoTradeFinanceloanapplyRequest) SetMerchantId(v string) *SyncAntchainAtoTradeFinanceloanapplyRequest {
	s.MerchantId = &v
	return s
}

func (s *SyncAntchainAtoTradeFinanceloanapplyRequest) SetMerchantName(v string) *SyncAntchainAtoTradeFinanceloanapplyRequest {
	s.MerchantName = &v
	return s
}

type SyncAntchainAtoTradeFinanceloanapplyResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 订单id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty"`
	// 订单所属商户的社会信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty"`
}

func (s SyncAntchainAtoTradeFinanceloanapplyResponse) String() string {
	return tea.Prettify(s)
}

func (s SyncAntchainAtoTradeFinanceloanapplyResponse) GoString() string {
	return s.String()
}

func (s *SyncAntchainAtoTradeFinanceloanapplyResponse) SetReqMsgId(v string) *SyncAntchainAtoTradeFinanceloanapplyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SyncAntchainAtoTradeFinanceloanapplyResponse) SetResultCode(v string) *SyncAntchainAtoTradeFinanceloanapplyResponse {
	s.ResultCode = &v
	return s
}

func (s *SyncAntchainAtoTradeFinanceloanapplyResponse) SetResultMsg(v string) *SyncAntchainAtoTradeFinanceloanapplyResponse {
	s.ResultMsg = &v
	return s
}

func (s *SyncAntchainAtoTradeFinanceloanapplyResponse) SetOrderId(v string) *SyncAntchainAtoTradeFinanceloanapplyResponse {
	s.OrderId = &v
	return s
}

func (s *SyncAntchainAtoTradeFinanceloanapplyResponse) SetMerchantId(v string) *SyncAntchainAtoTradeFinanceloanapplyResponse {
	s.MerchantId = &v
	return s
}

type GetAntchainAtoTradeMerchantfulfillmentRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"50" minLength:"1"`
	// 订单所属商户的社会信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true" maxLength:"64" minLength:"1"`
	// 履约期数，不填返回为所有履约期的履约信息
	// - 如果有填写，返回当前期数的履约信息，列表长度为1
	TermIdx *int64 `json:"term_idx,omitempty" xml:"term_idx,omitempty"`
}

func (s GetAntchainAtoTradeMerchantfulfillmentRequest) String() string {
	return tea.Prettify(s)
}

func (s GetAntchainAtoTradeMerchantfulfillmentRequest) GoString() string {
	return s.String()
}

func (s *GetAntchainAtoTradeMerchantfulfillmentRequest) SetAuthToken(v string) *GetAntchainAtoTradeMerchantfulfillmentRequest {
	s.AuthToken = &v
	return s
}

func (s *GetAntchainAtoTradeMerchantfulfillmentRequest) SetProductInstanceId(v string) *GetAntchainAtoTradeMerchantfulfillmentRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetAntchainAtoTradeMerchantfulfillmentRequest) SetOrderId(v string) *GetAntchainAtoTradeMerchantfulfillmentRequest {
	s.OrderId = &v
	return s
}

func (s *GetAntchainAtoTradeMerchantfulfillmentRequest) SetMerchantId(v string) *GetAntchainAtoTradeMerchantfulfillmentRequest {
	s.MerchantId = &v
	return s
}

func (s *GetAntchainAtoTradeMerchantfulfillmentRequest) SetTermIdx(v int64) *GetAntchainAtoTradeMerchantfulfillmentRequest {
	s.TermIdx = &v
	return s
}

type GetAntchainAtoTradeMerchantfulfillmentResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回值为 「MerchantFulfillmentResp」的json字符串
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s GetAntchainAtoTradeMerchantfulfillmentResponse) String() string {
	return tea.Prettify(s)
}

func (s GetAntchainAtoTradeMerchantfulfillmentResponse) GoString() string {
	return s.String()
}

func (s *GetAntchainAtoTradeMerchantfulfillmentResponse) SetReqMsgId(v string) *GetAntchainAtoTradeMerchantfulfillmentResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetAntchainAtoTradeMerchantfulfillmentResponse) SetResultCode(v string) *GetAntchainAtoTradeMerchantfulfillmentResponse {
	s.ResultCode = &v
	return s
}

func (s *GetAntchainAtoTradeMerchantfulfillmentResponse) SetResultMsg(v string) *GetAntchainAtoTradeMerchantfulfillmentResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetAntchainAtoTradeMerchantfulfillmentResponse) SetResponseData(v string) *GetAntchainAtoTradeMerchantfulfillmentResponse {
	s.ResponseData = &v
	return s
}

type SyncAntchainAtoFundMerchantpromiseRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"50" minLength:"1"`
	// 订单所属商户的社会信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true" maxLength:"64" minLength:"1"`
	// json字符串,填入「MerchantPromiseReq」的json字符串
	BizContent *string `json:"biz_content,omitempty" xml:"biz_content,omitempty" require:"true" minLength:"1"`
}

func (s SyncAntchainAtoFundMerchantpromiseRequest) String() string {
	return tea.Prettify(s)
}

func (s SyncAntchainAtoFundMerchantpromiseRequest) GoString() string {
	return s.String()
}

func (s *SyncAntchainAtoFundMerchantpromiseRequest) SetAuthToken(v string) *SyncAntchainAtoFundMerchantpromiseRequest {
	s.AuthToken = &v
	return s
}

func (s *SyncAntchainAtoFundMerchantpromiseRequest) SetProductInstanceId(v string) *SyncAntchainAtoFundMerchantpromiseRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SyncAntchainAtoFundMerchantpromiseRequest) SetOrderId(v string) *SyncAntchainAtoFundMerchantpromiseRequest {
	s.OrderId = &v
	return s
}

func (s *SyncAntchainAtoFundMerchantpromiseRequest) SetMerchantId(v string) *SyncAntchainAtoFundMerchantpromiseRequest {
	s.MerchantId = &v
	return s
}

func (s *SyncAntchainAtoFundMerchantpromiseRequest) SetBizContent(v string) *SyncAntchainAtoFundMerchantpromiseRequest {
	s.BizContent = &v
	return s
}

type SyncAntchainAtoFundMerchantpromiseResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 订单id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty"`
	// 订单所属商家社会信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty"`
}

func (s SyncAntchainAtoFundMerchantpromiseResponse) String() string {
	return tea.Prettify(s)
}

func (s SyncAntchainAtoFundMerchantpromiseResponse) GoString() string {
	return s.String()
}

func (s *SyncAntchainAtoFundMerchantpromiseResponse) SetReqMsgId(v string) *SyncAntchainAtoFundMerchantpromiseResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SyncAntchainAtoFundMerchantpromiseResponse) SetResultCode(v string) *SyncAntchainAtoFundMerchantpromiseResponse {
	s.ResultCode = &v
	return s
}

func (s *SyncAntchainAtoFundMerchantpromiseResponse) SetResultMsg(v string) *SyncAntchainAtoFundMerchantpromiseResponse {
	s.ResultMsg = &v
	return s
}

func (s *SyncAntchainAtoFundMerchantpromiseResponse) SetOrderId(v string) *SyncAntchainAtoFundMerchantpromiseResponse {
	s.OrderId = &v
	return s
}

func (s *SyncAntchainAtoFundMerchantpromiseResponse) SetMerchantId(v string) *SyncAntchainAtoFundMerchantpromiseResponse {
	s.MerchantId = &v
	return s
}

type SyncAntchainAtoFundFinanceloanresultsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"50" minLength:"1"`
	// 商家的社会信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true" maxLength:"200" minLength:"1"`
	// json字符串,填入「FinanceLoanResultsReq」的json字符串
	BizContent *string `json:"biz_content,omitempty" xml:"biz_content,omitempty" require:"true" minLength:"1"`
}

func (s SyncAntchainAtoFundFinanceloanresultsRequest) String() string {
	return tea.Prettify(s)
}

func (s SyncAntchainAtoFundFinanceloanresultsRequest) GoString() string {
	return s.String()
}

func (s *SyncAntchainAtoFundFinanceloanresultsRequest) SetAuthToken(v string) *SyncAntchainAtoFundFinanceloanresultsRequest {
	s.AuthToken = &v
	return s
}

func (s *SyncAntchainAtoFundFinanceloanresultsRequest) SetProductInstanceId(v string) *SyncAntchainAtoFundFinanceloanresultsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SyncAntchainAtoFundFinanceloanresultsRequest) SetOrderId(v string) *SyncAntchainAtoFundFinanceloanresultsRequest {
	s.OrderId = &v
	return s
}

func (s *SyncAntchainAtoFundFinanceloanresultsRequest) SetMerchantId(v string) *SyncAntchainAtoFundFinanceloanresultsRequest {
	s.MerchantId = &v
	return s
}

func (s *SyncAntchainAtoFundFinanceloanresultsRequest) SetBizContent(v string) *SyncAntchainAtoFundFinanceloanresultsRequest {
	s.BizContent = &v
	return s
}

type SyncAntchainAtoFundFinanceloanresultsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 订单id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty"`
	// 订单所属商户的社会信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty"`
	// "ERROR": 放款同步异常
	// “SUCCESS":放款同步成功
	LoanResult *string `json:"loan_result,omitempty" xml:"loan_result,omitempty"`
}

func (s SyncAntchainAtoFundFinanceloanresultsResponse) String() string {
	return tea.Prettify(s)
}

func (s SyncAntchainAtoFundFinanceloanresultsResponse) GoString() string {
	return s.String()
}

func (s *SyncAntchainAtoFundFinanceloanresultsResponse) SetReqMsgId(v string) *SyncAntchainAtoFundFinanceloanresultsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SyncAntchainAtoFundFinanceloanresultsResponse) SetResultCode(v string) *SyncAntchainAtoFundFinanceloanresultsResponse {
	s.ResultCode = &v
	return s
}

func (s *SyncAntchainAtoFundFinanceloanresultsResponse) SetResultMsg(v string) *SyncAntchainAtoFundFinanceloanresultsResponse {
	s.ResultMsg = &v
	return s
}

func (s *SyncAntchainAtoFundFinanceloanresultsResponse) SetOrderId(v string) *SyncAntchainAtoFundFinanceloanresultsResponse {
	s.OrderId = &v
	return s
}

func (s *SyncAntchainAtoFundFinanceloanresultsResponse) SetMerchantId(v string) *SyncAntchainAtoFundFinanceloanresultsResponse {
	s.MerchantId = &v
	return s
}

func (s *SyncAntchainAtoFundFinanceloanresultsResponse) SetLoanResult(v string) *SyncAntchainAtoFundFinanceloanresultsResponse {
	s.LoanResult = &v
	return s
}

type GetAntchainAtoFundUserpromiseRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"50" minLength:"1"`
	// 订单所属商户的社会信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true" maxLength:"200" minLength:"1"`
}

func (s GetAntchainAtoFundUserpromiseRequest) String() string {
	return tea.Prettify(s)
}

func (s GetAntchainAtoFundUserpromiseRequest) GoString() string {
	return s.String()
}

func (s *GetAntchainAtoFundUserpromiseRequest) SetAuthToken(v string) *GetAntchainAtoFundUserpromiseRequest {
	s.AuthToken = &v
	return s
}

func (s *GetAntchainAtoFundUserpromiseRequest) SetProductInstanceId(v string) *GetAntchainAtoFundUserpromiseRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetAntchainAtoFundUserpromiseRequest) SetOrderId(v string) *GetAntchainAtoFundUserpromiseRequest {
	s.OrderId = &v
	return s
}

func (s *GetAntchainAtoFundUserpromiseRequest) SetMerchantId(v string) *GetAntchainAtoFundUserpromiseRequest {
	s.MerchantId = &v
	return s
}

type GetAntchainAtoFundUserpromiseResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回值为「OrderPromise」的json字符串
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s GetAntchainAtoFundUserpromiseResponse) String() string {
	return tea.Prettify(s)
}

func (s GetAntchainAtoFundUserpromiseResponse) GoString() string {
	return s.String()
}

func (s *GetAntchainAtoFundUserpromiseResponse) SetReqMsgId(v string) *GetAntchainAtoFundUserpromiseResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetAntchainAtoFundUserpromiseResponse) SetResultCode(v string) *GetAntchainAtoFundUserpromiseResponse {
	s.ResultCode = &v
	return s
}

func (s *GetAntchainAtoFundUserpromiseResponse) SetResultMsg(v string) *GetAntchainAtoFundUserpromiseResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetAntchainAtoFundUserpromiseResponse) SetResponseData(v string) *GetAntchainAtoFundUserpromiseResponse {
	s.ResponseData = &v
	return s
}

type GetAntchainAtoTradeUserperformanceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"50" minLength:"1"`
	// 商家公司社会信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true" maxLength:"64" minLength:"1"`
}

func (s GetAntchainAtoTradeUserperformanceRequest) String() string {
	return tea.Prettify(s)
}

func (s GetAntchainAtoTradeUserperformanceRequest) GoString() string {
	return s.String()
}

func (s *GetAntchainAtoTradeUserperformanceRequest) SetAuthToken(v string) *GetAntchainAtoTradeUserperformanceRequest {
	s.AuthToken = &v
	return s
}

func (s *GetAntchainAtoTradeUserperformanceRequest) SetProductInstanceId(v string) *GetAntchainAtoTradeUserperformanceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetAntchainAtoTradeUserperformanceRequest) SetOrderId(v string) *GetAntchainAtoTradeUserperformanceRequest {
	s.OrderId = &v
	return s
}

func (s *GetAntchainAtoTradeUserperformanceRequest) SetMerchantId(v string) *GetAntchainAtoTradeUserperformanceRequest {
	s.MerchantId = &v
	return s
}

type GetAntchainAtoTradeUserperformanceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 「UserPerformanceInfo」的json字符串
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s GetAntchainAtoTradeUserperformanceResponse) String() string {
	return tea.Prettify(s)
}

func (s GetAntchainAtoTradeUserperformanceResponse) GoString() string {
	return s.String()
}

func (s *GetAntchainAtoTradeUserperformanceResponse) SetReqMsgId(v string) *GetAntchainAtoTradeUserperformanceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetAntchainAtoTradeUserperformanceResponse) SetResultCode(v string) *GetAntchainAtoTradeUserperformanceResponse {
	s.ResultCode = &v
	return s
}

func (s *GetAntchainAtoTradeUserperformanceResponse) SetResultMsg(v string) *GetAntchainAtoTradeUserperformanceResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetAntchainAtoTradeUserperformanceResponse) SetResponseData(v string) *GetAntchainAtoTradeUserperformanceResponse {
	s.ResponseData = &v
	return s
}

type GetAntchainAtoTradeMerchantperformanceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"50" minLength:"1"`
	// 订单所属商户的社会信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true" maxLength:"64" minLength:"1"`
}

func (s GetAntchainAtoTradeMerchantperformanceRequest) String() string {
	return tea.Prettify(s)
}

func (s GetAntchainAtoTradeMerchantperformanceRequest) GoString() string {
	return s.String()
}

func (s *GetAntchainAtoTradeMerchantperformanceRequest) SetAuthToken(v string) *GetAntchainAtoTradeMerchantperformanceRequest {
	s.AuthToken = &v
	return s
}

func (s *GetAntchainAtoTradeMerchantperformanceRequest) SetProductInstanceId(v string) *GetAntchainAtoTradeMerchantperformanceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetAntchainAtoTradeMerchantperformanceRequest) SetOrderId(v string) *GetAntchainAtoTradeMerchantperformanceRequest {
	s.OrderId = &v
	return s
}

func (s *GetAntchainAtoTradeMerchantperformanceRequest) SetMerchantId(v string) *GetAntchainAtoTradeMerchantperformanceRequest {
	s.MerchantId = &v
	return s
}

type GetAntchainAtoTradeMerchantperformanceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 「MerchantPerformanceInfo」的json字符串
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s GetAntchainAtoTradeMerchantperformanceResponse) String() string {
	return tea.Prettify(s)
}

func (s GetAntchainAtoTradeMerchantperformanceResponse) GoString() string {
	return s.String()
}

func (s *GetAntchainAtoTradeMerchantperformanceResponse) SetReqMsgId(v string) *GetAntchainAtoTradeMerchantperformanceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetAntchainAtoTradeMerchantperformanceResponse) SetResultCode(v string) *GetAntchainAtoTradeMerchantperformanceResponse {
	s.ResultCode = &v
	return s
}

func (s *GetAntchainAtoTradeMerchantperformanceResponse) SetResultMsg(v string) *GetAntchainAtoTradeMerchantperformanceResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetAntchainAtoTradeMerchantperformanceResponse) SetResponseData(v string) *GetAntchainAtoTradeMerchantperformanceResponse {
	s.ResponseData = &v
	return s
}

type GetAntchainAtoFundUserperformanceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"64" minLength:"1"`
	// 订单所属商户的社会信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true" maxLength:"64" minLength:"1"`
	// 订单所属融资公司的社会信用代码
	FundId *string `json:"fund_id,omitempty" xml:"fund_id,omitempty" require:"true" maxLength:"64" minLength:"1"`
}

func (s GetAntchainAtoFundUserperformanceRequest) String() string {
	return tea.Prettify(s)
}

func (s GetAntchainAtoFundUserperformanceRequest) GoString() string {
	return s.String()
}

func (s *GetAntchainAtoFundUserperformanceRequest) SetAuthToken(v string) *GetAntchainAtoFundUserperformanceRequest {
	s.AuthToken = &v
	return s
}

func (s *GetAntchainAtoFundUserperformanceRequest) SetProductInstanceId(v string) *GetAntchainAtoFundUserperformanceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetAntchainAtoFundUserperformanceRequest) SetOrderId(v string) *GetAntchainAtoFundUserperformanceRequest {
	s.OrderId = &v
	return s
}

func (s *GetAntchainAtoFundUserperformanceRequest) SetMerchantId(v string) *GetAntchainAtoFundUserperformanceRequest {
	s.MerchantId = &v
	return s
}

func (s *GetAntchainAtoFundUserperformanceRequest) SetFundId(v string) *GetAntchainAtoFundUserperformanceRequest {
	s.FundId = &v
	return s
}

type GetAntchainAtoFundUserperformanceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 「UserPerformanceInfo」的json字符串
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s GetAntchainAtoFundUserperformanceResponse) String() string {
	return tea.Prettify(s)
}

func (s GetAntchainAtoFundUserperformanceResponse) GoString() string {
	return s.String()
}

func (s *GetAntchainAtoFundUserperformanceResponse) SetReqMsgId(v string) *GetAntchainAtoFundUserperformanceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetAntchainAtoFundUserperformanceResponse) SetResultCode(v string) *GetAntchainAtoFundUserperformanceResponse {
	s.ResultCode = &v
	return s
}

func (s *GetAntchainAtoFundUserperformanceResponse) SetResultMsg(v string) *GetAntchainAtoFundUserperformanceResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetAntchainAtoFundUserperformanceResponse) SetResponseData(v string) *GetAntchainAtoFundUserperformanceResponse {
	s.ResponseData = &v
	return s
}

type GetAntchainAtoFundMerchantperformanceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"50" minLength:"1"`
	// 订单所属商户的社会信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true" maxLength:"64" minLength:"1"`
	// 订单所属融资方的社会信用代码
	FundId *string `json:"fund_id,omitempty" xml:"fund_id,omitempty" require:"true" maxLength:"64" minLength:"1"`
}

func (s GetAntchainAtoFundMerchantperformanceRequest) String() string {
	return tea.Prettify(s)
}

func (s GetAntchainAtoFundMerchantperformanceRequest) GoString() string {
	return s.String()
}

func (s *GetAntchainAtoFundMerchantperformanceRequest) SetAuthToken(v string) *GetAntchainAtoFundMerchantperformanceRequest {
	s.AuthToken = &v
	return s
}

func (s *GetAntchainAtoFundMerchantperformanceRequest) SetProductInstanceId(v string) *GetAntchainAtoFundMerchantperformanceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetAntchainAtoFundMerchantperformanceRequest) SetOrderId(v string) *GetAntchainAtoFundMerchantperformanceRequest {
	s.OrderId = &v
	return s
}

func (s *GetAntchainAtoFundMerchantperformanceRequest) SetMerchantId(v string) *GetAntchainAtoFundMerchantperformanceRequest {
	s.MerchantId = &v
	return s
}

func (s *GetAntchainAtoFundMerchantperformanceRequest) SetFundId(v string) *GetAntchainAtoFundMerchantperformanceRequest {
	s.FundId = &v
	return s
}

type GetAntchainAtoFundMerchantperformanceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 「MerchantPerformanceInfo」的json字符串
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s GetAntchainAtoFundMerchantperformanceResponse) String() string {
	return tea.Prettify(s)
}

func (s GetAntchainAtoFundMerchantperformanceResponse) GoString() string {
	return s.String()
}

func (s *GetAntchainAtoFundMerchantperformanceResponse) SetReqMsgId(v string) *GetAntchainAtoFundMerchantperformanceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetAntchainAtoFundMerchantperformanceResponse) SetResultCode(v string) *GetAntchainAtoFundMerchantperformanceResponse {
	s.ResultCode = &v
	return s
}

func (s *GetAntchainAtoFundMerchantperformanceResponse) SetResultMsg(v string) *GetAntchainAtoFundMerchantperformanceResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetAntchainAtoFundMerchantperformanceResponse) SetResponseData(v string) *GetAntchainAtoFundMerchantperformanceResponse {
	s.ResponseData = &v
	return s
}

type GetAntchainAtoFundOrderfullinfoRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单Id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"50" minLength:"1"`
	// 订单所属商户的社会信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true" maxLength:"64" minLength:"1"`
	// 订单所属商户的社会信用代码
	FundId *string `json:"fund_id,omitempty" xml:"fund_id,omitempty" require:"true" maxLength:"64" minLength:"1"`
}

func (s GetAntchainAtoFundOrderfullinfoRequest) String() string {
	return tea.Prettify(s)
}

func (s GetAntchainAtoFundOrderfullinfoRequest) GoString() string {
	return s.String()
}

func (s *GetAntchainAtoFundOrderfullinfoRequest) SetAuthToken(v string) *GetAntchainAtoFundOrderfullinfoRequest {
	s.AuthToken = &v
	return s
}

func (s *GetAntchainAtoFundOrderfullinfoRequest) SetProductInstanceId(v string) *GetAntchainAtoFundOrderfullinfoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetAntchainAtoFundOrderfullinfoRequest) SetOrderId(v string) *GetAntchainAtoFundOrderfullinfoRequest {
	s.OrderId = &v
	return s
}

func (s *GetAntchainAtoFundOrderfullinfoRequest) SetMerchantId(v string) *GetAntchainAtoFundOrderfullinfoRequest {
	s.MerchantId = &v
	return s
}

func (s *GetAntchainAtoFundOrderfullinfoRequest) SetFundId(v string) *GetAntchainAtoFundOrderfullinfoRequest {
	s.FundId = &v
	return s
}

type GetAntchainAtoFundOrderfullinfoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// OrderFullInfoResp的json字符串
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s GetAntchainAtoFundOrderfullinfoResponse) String() string {
	return tea.Prettify(s)
}

func (s GetAntchainAtoFundOrderfullinfoResponse) GoString() string {
	return s.String()
}

func (s *GetAntchainAtoFundOrderfullinfoResponse) SetReqMsgId(v string) *GetAntchainAtoFundOrderfullinfoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetAntchainAtoFundOrderfullinfoResponse) SetResultCode(v string) *GetAntchainAtoFundOrderfullinfoResponse {
	s.ResultCode = &v
	return s
}

func (s *GetAntchainAtoFundOrderfullinfoResponse) SetResultMsg(v string) *GetAntchainAtoFundOrderfullinfoResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetAntchainAtoFundOrderfullinfoResponse) SetResponseData(v string) *GetAntchainAtoFundOrderfullinfoResponse {
	s.ResponseData = &v
	return s
}

type UploadAntchainAtoSignFlowRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	//
	// 订单所属商户的统一社会信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true"`
	//
	// 商户的订单号
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
	// 签署合同单号
	SignNo *string `json:"sign_no,omitempty" xml:"sign_no,omitempty" require:"true"`
	// 模板id
	TemplateId *string `json:"template_id,omitempty" xml:"template_id,omitempty" require:"true"`
	// 上传的pdf文件，需要以.pdf后缀结尾
	// 待上传文件
	FileObject io.Reader `json:"fileObject,omitempty" xml:"fileObject,omitempty"`
	// 待上传文件名
	FileObjectName *string `json:"fileObjectName,omitempty" xml:"fileObjectName,omitempty"`
	FileId         *string `json:"file_id,omitempty" xml:"file_id,omitempty" require:"true"`
}

func (s UploadAntchainAtoSignFlowRequest) String() string {
	return tea.Prettify(s)
}

func (s UploadAntchainAtoSignFlowRequest) GoString() string {
	return s.String()
}

func (s *UploadAntchainAtoSignFlowRequest) SetAuthToken(v string) *UploadAntchainAtoSignFlowRequest {
	s.AuthToken = &v
	return s
}

func (s *UploadAntchainAtoSignFlowRequest) SetProductInstanceId(v string) *UploadAntchainAtoSignFlowRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UploadAntchainAtoSignFlowRequest) SetMerchantId(v string) *UploadAntchainAtoSignFlowRequest {
	s.MerchantId = &v
	return s
}

func (s *UploadAntchainAtoSignFlowRequest) SetOrderId(v string) *UploadAntchainAtoSignFlowRequest {
	s.OrderId = &v
	return s
}

func (s *UploadAntchainAtoSignFlowRequest) SetSignNo(v string) *UploadAntchainAtoSignFlowRequest {
	s.SignNo = &v
	return s
}

func (s *UploadAntchainAtoSignFlowRequest) SetTemplateId(v string) *UploadAntchainAtoSignFlowRequest {
	s.TemplateId = &v
	return s
}

func (s *UploadAntchainAtoSignFlowRequest) SetFileObject(v io.Reader) *UploadAntchainAtoSignFlowRequest {
	s.FileObject = v
	return s
}

func (s *UploadAntchainAtoSignFlowRequest) SetFileObjectName(v string) *UploadAntchainAtoSignFlowRequest {
	s.FileObjectName = &v
	return s
}

func (s *UploadAntchainAtoSignFlowRequest) SetFileId(v string) *UploadAntchainAtoSignFlowRequest {
	s.FileId = &v
	return s
}

type UploadAntchainAtoSignFlowResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 文件编号
	FileItemNo *string `json:"file_item_no,omitempty" xml:"file_item_no,omitempty"`
}

func (s UploadAntchainAtoSignFlowResponse) String() string {
	return tea.Prettify(s)
}

func (s UploadAntchainAtoSignFlowResponse) GoString() string {
	return s.String()
}

func (s *UploadAntchainAtoSignFlowResponse) SetReqMsgId(v string) *UploadAntchainAtoSignFlowResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UploadAntchainAtoSignFlowResponse) SetResultCode(v string) *UploadAntchainAtoSignFlowResponse {
	s.ResultCode = &v
	return s
}

func (s *UploadAntchainAtoSignFlowResponse) SetResultMsg(v string) *UploadAntchainAtoSignFlowResponse {
	s.ResultMsg = &v
	return s
}

func (s *UploadAntchainAtoSignFlowResponse) SetFileItemNo(v string) *UploadAntchainAtoSignFlowResponse {
	s.FileItemNo = &v
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
				"sdk_version":      tea.String("1.2.0"),
				"_prod_code":       tea.String("ak_195dff03d395462ea294bafdba69df3f"),
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
 * Description: 对账saas交易信息同步接口
 * Summary: 对账saas交易信息同步接口
 */
func (client *Client) SyncAntchainAtoTrade(request *SyncAntchainAtoTradeRequest) (_result *SyncAntchainAtoTradeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SyncAntchainAtoTradeResponse{}
	_body, _err := client.SyncAntchainAtoTradeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 对账saas交易信息同步接口
 * Summary: 对账saas交易信息同步接口
 */
func (client *Client) SyncAntchainAtoTradeEx(request *SyncAntchainAtoTradeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SyncAntchainAtoTradeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SyncAntchainAtoTradeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.trade.sync"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取详情
 * Summary: 获取详情
 */
func (client *Client) GetAntchainAtoTrade(request *GetAntchainAtoTradeRequest) (_result *GetAntchainAtoTradeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetAntchainAtoTradeResponse{}
	_body, _err := client.GetAntchainAtoTradeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取详情
 * Summary: 获取详情
 */
func (client *Client) GetAntchainAtoTradeEx(request *GetAntchainAtoTradeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetAntchainAtoTradeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetAntchainAtoTradeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.trade.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 可信身份认证，创建认证
 * Summary: 创建认证
 */
func (client *Client) CreateAntchainAtoRealpersonFacevrf(request *CreateAntchainAtoRealpersonFacevrfRequest) (_result *CreateAntchainAtoRealpersonFacevrfResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateAntchainAtoRealpersonFacevrfResponse{}
	_body, _err := client.CreateAntchainAtoRealpersonFacevrfEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 可信身份认证，创建认证
 * Summary: 创建认证
 */
func (client *Client) CreateAntchainAtoRealpersonFacevrfEx(request *CreateAntchainAtoRealpersonFacevrfRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateAntchainAtoRealpersonFacevrfResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateAntchainAtoRealpersonFacevrfResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.realperson.facevrf.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询认证的结果和相关信息
 * Summary: 查询认证结果
 */
func (client *Client) QueryAntchainAtoRealpersonFacevrf(request *QueryAntchainAtoRealpersonFacevrfRequest) (_result *QueryAntchainAtoRealpersonFacevrfResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAntchainAtoRealpersonFacevrfResponse{}
	_body, _err := client.QueryAntchainAtoRealpersonFacevrfEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询认证的结果和相关信息
 * Summary: 查询认证结果
 */
func (client *Client) QueryAntchainAtoRealpersonFacevrfEx(request *QueryAntchainAtoRealpersonFacevrfRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAntchainAtoRealpersonFacevrfResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAntchainAtoRealpersonFacevrfResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.realperson.facevrf.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 电子合同签署的合同模板查询服务
 * Summary: 电子合同签署的合同模板查询服务
 */
func (client *Client) AllAntchainAtoSignTemplate(request *AllAntchainAtoSignTemplateRequest) (_result *AllAntchainAtoSignTemplateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AllAntchainAtoSignTemplateResponse{}
	_body, _err := client.AllAntchainAtoSignTemplateEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 电子合同签署的合同模板查询服务
 * Summary: 电子合同签署的合同模板查询服务
 */
func (client *Client) AllAntchainAtoSignTemplateEx(request *AllAntchainAtoSignTemplateRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AllAntchainAtoSignTemplateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AllAntchainAtoSignTemplateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.sign.template.all"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 提交电子合同的签署流程(后置签署模式)
 * Summary: 提交电子合同的签署流程（后置签署模式）
 */
func (client *Client) SubmitAntchainAtoSignFlow(request *SubmitAntchainAtoSignFlowRequest) (_result *SubmitAntchainAtoSignFlowResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SubmitAntchainAtoSignFlowResponse{}
	_body, _err := client.SubmitAntchainAtoSignFlowEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 提交电子合同的签署流程(后置签署模式)
 * Summary: 提交电子合同的签署流程（后置签署模式）
 */
func (client *Client) SubmitAntchainAtoSignFlowEx(request *SubmitAntchainAtoSignFlowRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SubmitAntchainAtoSignFlowResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SubmitAntchainAtoSignFlowResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.sign.flow.submit"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询签署流程详情
 * Summary: 查询签署流程详情
 */
func (client *Client) GetAntchainAtoSignFlow(request *GetAntchainAtoSignFlowRequest) (_result *GetAntchainAtoSignFlowResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetAntchainAtoSignFlowResponse{}
	_body, _err := client.GetAntchainAtoSignFlowEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询签署流程详情
 * Summary: 查询签署流程详情
 */
func (client *Client) GetAntchainAtoSignFlowEx(request *GetAntchainAtoSignFlowRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetAntchainAtoSignFlowResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetAntchainAtoSignFlowResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.sign.flow.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 代扣签约
 * Summary: 代扣签约
 */
func (client *Client) CreateAntchainAtoWithholdSign(request *CreateAntchainAtoWithholdSignRequest) (_result *CreateAntchainAtoWithholdSignResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateAntchainAtoWithholdSignResponse{}
	_body, _err := client.CreateAntchainAtoWithholdSignEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 代扣签约
 * Summary: 代扣签约
 */
func (client *Client) CreateAntchainAtoWithholdSignEx(request *CreateAntchainAtoWithholdSignRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateAntchainAtoWithholdSignResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateAntchainAtoWithholdSignResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.withhold.sign.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 代扣签约查询
 * Summary: 代扣签约查询
 */
func (client *Client) QueryAntchainAtoWithholdSign(request *QueryAntchainAtoWithholdSignRequest) (_result *QueryAntchainAtoWithholdSignResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAntchainAtoWithholdSignResponse{}
	_body, _err := client.QueryAntchainAtoWithholdSignEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 代扣签约查询
 * Summary: 代扣签约查询
 */
func (client *Client) QueryAntchainAtoWithholdSignEx(request *QueryAntchainAtoWithholdSignRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAntchainAtoWithholdSignResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAntchainAtoWithholdSignResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.withhold.sign.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 电子合同签署模块，机构调用这个接口进行签署的授权落签
 * Summary: 电子合同签署流程落签操作
 */
func (client *Client) AuthAntchainAtoSignFlow(request *AuthAntchainAtoSignFlowRequest) (_result *AuthAntchainAtoSignFlowResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AuthAntchainAtoSignFlowResponse{}
	_body, _err := client.AuthAntchainAtoSignFlowEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 电子合同签署模块，机构调用这个接口进行签署的授权落签
 * Summary: 电子合同签署流程落签操作
 */
func (client *Client) AuthAntchainAtoSignFlowEx(request *AuthAntchainAtoSignFlowRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AuthAntchainAtoSignFlowResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AuthAntchainAtoSignFlowResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.sign.flow.auth"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 订单关闭后,可以通过此接口解绑签约
 * Summary: 代扣签约解绑
 */
func (client *Client) UnbindAntchainAtoWithholdSign(request *UnbindAntchainAtoWithholdSignRequest) (_result *UnbindAntchainAtoWithholdSignResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UnbindAntchainAtoWithholdSignResponse{}
	_body, _err := client.UnbindAntchainAtoWithholdSignEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 订单关闭后,可以通过此接口解绑签约
 * Summary: 代扣签约解绑
 */
func (client *Client) UnbindAntchainAtoWithholdSignEx(request *UnbindAntchainAtoWithholdSignRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UnbindAntchainAtoWithholdSignResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UnbindAntchainAtoWithholdSignResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.withhold.sign.unbind"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 取消代扣计划，将未扣款的全部代扣计划进行取消
 * Summary: 取消代扣计划
 */
func (client *Client) CancelAntchainAtoWithholdPlan(request *CancelAntchainAtoWithholdPlanRequest) (_result *CancelAntchainAtoWithholdPlanResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CancelAntchainAtoWithholdPlanResponse{}
	_body, _err := client.CancelAntchainAtoWithholdPlanEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 取消代扣计划，将未扣款的全部代扣计划进行取消
 * Summary: 取消代扣计划
 */
func (client *Client) CancelAntchainAtoWithholdPlanEx(request *CancelAntchainAtoWithholdPlanRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CancelAntchainAtoWithholdPlanResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CancelAntchainAtoWithholdPlanResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.withhold.plan.cancel"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 代扣计划清偿/清欠，通过其他收款后通过子接口通知
 * Summary: 代扣计划清偿/清欠
 */
func (client *Client) RepayAntchainAtoWithholdPlan(request *RepayAntchainAtoWithholdPlanRequest) (_result *RepayAntchainAtoWithholdPlanResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &RepayAntchainAtoWithholdPlanResponse{}
	_body, _err := client.RepayAntchainAtoWithholdPlanEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 代扣计划清偿/清欠，通过其他收款后通过子接口通知
 * Summary: 代扣计划清偿/清欠
 */
func (client *Client) RepayAntchainAtoWithholdPlanEx(request *RepayAntchainAtoWithholdPlanRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *RepayAntchainAtoWithholdPlanResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &RepayAntchainAtoWithholdPlanResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.withhold.plan.repay"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 提交前置签署的电子合同签署流程（前置签署模式）
 * Summary: 提交签署的电子合同签署流程（前置签署）
 */
func (client *Client) SubmitAntchainAtoFrontSign(request *SubmitAntchainAtoFrontSignRequest) (_result *SubmitAntchainAtoFrontSignResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SubmitAntchainAtoFrontSignResponse{}
	_body, _err := client.SubmitAntchainAtoFrontSignEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 提交前置签署的电子合同签署流程（前置签署模式）
 * Summary: 提交签署的电子合同签署流程（前置签署）
 */
func (client *Client) SubmitAntchainAtoFrontSignEx(request *SubmitAntchainAtoFrontSignRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SubmitAntchainAtoFrontSignResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SubmitAntchainAtoFrontSignResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.front.sign.submit"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 订单创建，前置签署
 * Summary: 前置签署订单创建
 */
func (client *Client) SyncAntchainAtoFrontTrade(request *SyncAntchainAtoFrontTradeRequest) (_result *SyncAntchainAtoFrontTradeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SyncAntchainAtoFrontTradeResponse{}
	_body, _err := client.SyncAntchainAtoFrontTradeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 订单创建，前置签署
 * Summary: 前置签署订单创建
 */
func (client *Client) SyncAntchainAtoFrontTradeEx(request *SyncAntchainAtoFrontTradeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SyncAntchainAtoFrontTradeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SyncAntchainAtoFrontTradeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.front.trade.sync"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 当代扣未成功时，商户可与用户进行沟通补款到支付宝，补款完成后通过代扣重试能力实时触发重试扣款。
 * Summary: 扣款计划重试
 */
func (client *Client) RetryAntchainAtoWithholdPlan(request *RetryAntchainAtoWithholdPlanRequest) (_result *RetryAntchainAtoWithholdPlanResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &RetryAntchainAtoWithholdPlanResponse{}
	_body, _err := client.RetryAntchainAtoWithholdPlanEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 当代扣未成功时，商户可与用户进行沟通补款到支付宝，补款完成后通过代扣重试能力实时触发重试扣款。
 * Summary: 扣款计划重试
 */
func (client *Client) RetryAntchainAtoWithholdPlanEx(request *RetryAntchainAtoWithholdPlanRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *RetryAntchainAtoWithholdPlanResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &RetryAntchainAtoWithholdPlanResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.withhold.plan.retry"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 当代扣签约时，用户在支付宝侧发起异步解约，此时需要经过商户确认才可以完成解约。saas会通知商户用户的异步解约申请，由商户通过此接口确认是否解约
 * Summary: 代扣签约的异步解约确认
 */
func (client *Client) ConfirmAntchainAtoWithholdSignasyncunsign(request *ConfirmAntchainAtoWithholdSignasyncunsignRequest) (_result *ConfirmAntchainAtoWithholdSignasyncunsignResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ConfirmAntchainAtoWithholdSignasyncunsignResponse{}
	_body, _err := client.ConfirmAntchainAtoWithholdSignasyncunsignEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 当代扣签约时，用户在支付宝侧发起异步解约，此时需要经过商户确认才可以完成解约。saas会通知商户用户的异步解约申请，由商户通过此接口确认是否解约
 * Summary: 代扣签约的异步解约确认
 */
func (client *Client) ConfirmAntchainAtoWithholdSignasyncunsignEx(request *ConfirmAntchainAtoWithholdSignasyncunsignRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ConfirmAntchainAtoWithholdSignasyncunsignResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ConfirmAntchainAtoWithholdSignasyncunsignResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.withhold.signasyncunsign.confirm"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 用于资方将盖章后的合同文件上传
 * Summary: 资方合同文件上传接口
 */
func (client *Client) UploadAntchainAtoFundFlow(request *UploadAntchainAtoFundFlowRequest) (_result *UploadAntchainAtoFundFlowResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UploadAntchainAtoFundFlowResponse{}
	_body, _err := client.UploadAntchainAtoFundFlowEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 用于资方将盖章后的合同文件上传
 * Summary: 资方合同文件上传接口
 */
func (client *Client) UploadAntchainAtoFundFlowEx(request *UploadAntchainAtoFundFlowRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UploadAntchainAtoFundFlowResponse, _err error) {
	if !tea.BoolValue(util.IsUnset(request.FileObject)) {
		uploadReq := &CreateAntcloudGatewayxFileUploadRequest{
			AuthToken: request.AuthToken,
			ApiCode:   tea.String("antchain.ato.fund.flow.upload"),
			FileName:  request.FileObjectName,
		}
		uploadResp, _err := client.CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime)
		if _err != nil {
			return _result, _err
		}

		if !tea.BoolValue(antchainutil.IsSuccess(uploadResp.ResultCode, tea.String("ok"))) {
			uploadAntchainAtoFundFlowResponse := &UploadAntchainAtoFundFlowResponse{
				ReqMsgId:   uploadResp.ReqMsgId,
				ResultCode: uploadResp.ResultCode,
				ResultMsg:  uploadResp.ResultMsg,
			}
			_result = uploadAntchainAtoFundFlowResponse
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
	_result = &UploadAntchainAtoFundFlowResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.fund.flow.upload"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取商户签署后的合同文件，用于资方签署落章
 * Summary: 资方合同文件获取接口
 */
func (client *Client) GetAntchainAtoFundFlow(request *GetAntchainAtoFundFlowRequest) (_result *GetAntchainAtoFundFlowResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetAntchainAtoFundFlowResponse{}
	_body, _err := client.GetAntchainAtoFundFlowEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取商户签署后的合同文件，用于资方签署落章
 * Summary: 资方合同文件获取接口
 */
func (client *Client) GetAntchainAtoFundFlowEx(request *GetAntchainAtoFundFlowRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetAntchainAtoFundFlowResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetAntchainAtoFundFlowResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.fund.flow.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 用户资方通知合同签署的状态，一般用于拒绝落章文件时，需要通知拒绝原因
 * Summary: 资方合同签署状态通知
 */
func (client *Client) RefuseAntchainAtoFundFlow(request *RefuseAntchainAtoFundFlowRequest) (_result *RefuseAntchainAtoFundFlowResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &RefuseAntchainAtoFundFlowResponse{}
	_body, _err := client.RefuseAntchainAtoFundFlowEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 用户资方通知合同签署的状态，一般用于拒绝落章文件时，需要通知拒绝原因
 * Summary: 资方合同签署状态通知
 */
func (client *Client) RefuseAntchainAtoFundFlowEx(request *RefuseAntchainAtoFundFlowRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *RefuseAntchainAtoFundFlowResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &RefuseAntchainAtoFundFlowResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.fund.flow.refuse"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 资方调用，授权通过e签宝进行落签
 * Summary: 资方e签宝落签接口
 */
func (client *Client) AuthAntchainAtoFundFlow(request *AuthAntchainAtoFundFlowRequest) (_result *AuthAntchainAtoFundFlowResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AuthAntchainAtoFundFlowResponse{}
	_body, _err := client.AuthAntchainAtoFundFlowEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 资方调用，授权通过e签宝进行落签
 * Summary: 资方e签宝落签接口
 */
func (client *Client) AuthAntchainAtoFundFlowEx(request *AuthAntchainAtoFundFlowRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AuthAntchainAtoFundFlowResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AuthAntchainAtoFundFlowResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.fund.flow.auth"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 代扣主动支付创建
 * Summary: 代扣主动支付创建
 */
func (client *Client) CreateAntchainAtoWithholdActivepay(request *CreateAntchainAtoWithholdActivepayRequest) (_result *CreateAntchainAtoWithholdActivepayResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateAntchainAtoWithholdActivepayResponse{}
	_body, _err := client.CreateAntchainAtoWithholdActivepayEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 代扣主动支付创建
 * Summary: 代扣主动支付创建
 */
func (client *Client) CreateAntchainAtoWithholdActivepayEx(request *CreateAntchainAtoWithholdActivepayRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateAntchainAtoWithholdActivepayResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateAntchainAtoWithholdActivepayResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.withhold.activepay.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 代扣主动支付查询
 * Summary: 代扣主动支付查询
 */
func (client *Client) QueryAntchainAtoWithholdActivepay(request *QueryAntchainAtoWithholdActivepayRequest) (_result *QueryAntchainAtoWithholdActivepayResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAntchainAtoWithholdActivepayResponse{}
	_body, _err := client.QueryAntchainAtoWithholdActivepayEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 代扣主动支付查询
 * Summary: 代扣主动支付查询
 */
func (client *Client) QueryAntchainAtoWithholdActivepayEx(request *QueryAntchainAtoWithholdActivepayRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAntchainAtoWithholdActivepayResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAntchainAtoWithholdActivepayResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.withhold.activepay.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 代扣主动支付取消
 * Summary: 代扣主动支付取消
 */
func (client *Client) CancelAntchainAtoWithholdActivepay(request *CancelAntchainAtoWithholdActivepayRequest) (_result *CancelAntchainAtoWithholdActivepayResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CancelAntchainAtoWithholdActivepayResponse{}
	_body, _err := client.CancelAntchainAtoWithholdActivepayEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 代扣主动支付取消
 * Summary: 代扣主动支付取消
 */
func (client *Client) CancelAntchainAtoWithholdActivepayEx(request *CancelAntchainAtoWithholdActivepayRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CancelAntchainAtoWithholdActivepayResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CancelAntchainAtoWithholdActivepayResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.withhold.activepay.cancel"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 资方调用，取消商户履约计划
 * Summary: 商户履约计划取消
 */
func (client *Client) CancelAntchainAtoFundPlan(request *CancelAntchainAtoFundPlanRequest) (_result *CancelAntchainAtoFundPlanResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CancelAntchainAtoFundPlanResponse{}
	_body, _err := client.CancelAntchainAtoFundPlanEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 资方调用，取消商户履约计划
 * Summary: 商户履约计划取消
 */
func (client *Client) CancelAntchainAtoFundPlanEx(request *CancelAntchainAtoFundPlanRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CancelAntchainAtoFundPlanResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CancelAntchainAtoFundPlanResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.fund.plan.cancel"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 通知回调
 * Summary: 通知回调
 */
func (client *Client) CallbackAntchainAtoFundNotify(request *CallbackAntchainAtoFundNotifyRequest) (_result *CallbackAntchainAtoFundNotifyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CallbackAntchainAtoFundNotifyResponse{}
	_body, _err := client.CallbackAntchainAtoFundNotifyEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 通知回调
 * Summary: 通知回调
 */
func (client *Client) CallbackAntchainAtoFundNotifyEx(request *CallbackAntchainAtoFundNotifyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CallbackAntchainAtoFundNotifyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CallbackAntchainAtoFundNotifyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.fund.notify.callback"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 融资放款申请接口
 * Summary: 融资放款申请接口
 */
func (client *Client) SyncAntchainAtoTradeFinanceloanapply(request *SyncAntchainAtoTradeFinanceloanapplyRequest) (_result *SyncAntchainAtoTradeFinanceloanapplyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SyncAntchainAtoTradeFinanceloanapplyResponse{}
	_body, _err := client.SyncAntchainAtoTradeFinanceloanapplyEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 融资放款申请接口
 * Summary: 融资放款申请接口
 */
func (client *Client) SyncAntchainAtoTradeFinanceloanapplyEx(request *SyncAntchainAtoTradeFinanceloanapplyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SyncAntchainAtoTradeFinanceloanapplyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SyncAntchainAtoTradeFinanceloanapplyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.trade.financeloanapply.sync"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 商户履约查询
 * Summary: 商户履约查询
 */
func (client *Client) GetAntchainAtoTradeMerchantfulfillment(request *GetAntchainAtoTradeMerchantfulfillmentRequest) (_result *GetAntchainAtoTradeMerchantfulfillmentResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetAntchainAtoTradeMerchantfulfillmentResponse{}
	_body, _err := client.GetAntchainAtoTradeMerchantfulfillmentEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 商户履约查询
 * Summary: 商户履约查询
 */
func (client *Client) GetAntchainAtoTradeMerchantfulfillmentEx(request *GetAntchainAtoTradeMerchantfulfillmentRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetAntchainAtoTradeMerchantfulfillmentResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetAntchainAtoTradeMerchantfulfillmentResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.trade.merchantfulfillment.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 商户还款承诺同步
 * Summary: 商户还款承诺同步
 */
func (client *Client) SyncAntchainAtoFundMerchantpromise(request *SyncAntchainAtoFundMerchantpromiseRequest) (_result *SyncAntchainAtoFundMerchantpromiseResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SyncAntchainAtoFundMerchantpromiseResponse{}
	_body, _err := client.SyncAntchainAtoFundMerchantpromiseEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 商户还款承诺同步
 * Summary: 商户还款承诺同步
 */
func (client *Client) SyncAntchainAtoFundMerchantpromiseEx(request *SyncAntchainAtoFundMerchantpromiseRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SyncAntchainAtoFundMerchantpromiseResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SyncAntchainAtoFundMerchantpromiseResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.fund.merchantpromise.sync"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 融资放款结果同步
 * Summary: 融资放款结果同步
 */
func (client *Client) SyncAntchainAtoFundFinanceloanresults(request *SyncAntchainAtoFundFinanceloanresultsRequest) (_result *SyncAntchainAtoFundFinanceloanresultsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SyncAntchainAtoFundFinanceloanresultsResponse{}
	_body, _err := client.SyncAntchainAtoFundFinanceloanresultsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 融资放款结果同步
 * Summary: 融资放款结果同步
 */
func (client *Client) SyncAntchainAtoFundFinanceloanresultsEx(request *SyncAntchainAtoFundFinanceloanresultsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SyncAntchainAtoFundFinanceloanresultsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SyncAntchainAtoFundFinanceloanresultsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.fund.financeloanresults.sync"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询用户承诺
 * Summary: 查询用户承诺
 */
func (client *Client) GetAntchainAtoFundUserpromise(request *GetAntchainAtoFundUserpromiseRequest) (_result *GetAntchainAtoFundUserpromiseResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetAntchainAtoFundUserpromiseResponse{}
	_body, _err := client.GetAntchainAtoFundUserpromiseEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询用户承诺
 * Summary: 查询用户承诺
 */
func (client *Client) GetAntchainAtoFundUserpromiseEx(request *GetAntchainAtoFundUserpromiseRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetAntchainAtoFundUserpromiseResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetAntchainAtoFundUserpromiseResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.fund.userpromise.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 用户履约信息查询（履约承诺+记录）
 * Summary: 用户履约信息查询（履约承诺+记录）
 */
func (client *Client) GetAntchainAtoTradeUserperformance(request *GetAntchainAtoTradeUserperformanceRequest) (_result *GetAntchainAtoTradeUserperformanceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetAntchainAtoTradeUserperformanceResponse{}
	_body, _err := client.GetAntchainAtoTradeUserperformanceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 用户履约信息查询（履约承诺+记录）
 * Summary: 用户履约信息查询（履约承诺+记录）
 */
func (client *Client) GetAntchainAtoTradeUserperformanceEx(request *GetAntchainAtoTradeUserperformanceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetAntchainAtoTradeUserperformanceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetAntchainAtoTradeUserperformanceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.trade.userperformance.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 商户履约信息查询（履约承诺+履约记录）
 * Summary: 商户履约信息查询（履约承诺+履约记录）
 */
func (client *Client) GetAntchainAtoTradeMerchantperformance(request *GetAntchainAtoTradeMerchantperformanceRequest) (_result *GetAntchainAtoTradeMerchantperformanceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetAntchainAtoTradeMerchantperformanceResponse{}
	_body, _err := client.GetAntchainAtoTradeMerchantperformanceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 商户履约信息查询（履约承诺+履约记录）
 * Summary: 商户履约信息查询（履约承诺+履约记录）
 */
func (client *Client) GetAntchainAtoTradeMerchantperformanceEx(request *GetAntchainAtoTradeMerchantperformanceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetAntchainAtoTradeMerchantperformanceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetAntchainAtoTradeMerchantperformanceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.trade.merchantperformance.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 用户履约信息查询（履约承诺+履约记录）
 * Summary: 用户履约信息查询（履约承诺+履约记录）
 */
func (client *Client) GetAntchainAtoFundUserperformance(request *GetAntchainAtoFundUserperformanceRequest) (_result *GetAntchainAtoFundUserperformanceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetAntchainAtoFundUserperformanceResponse{}
	_body, _err := client.GetAntchainAtoFundUserperformanceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 用户履约信息查询（履约承诺+履约记录）
 * Summary: 用户履约信息查询（履约承诺+履约记录）
 */
func (client *Client) GetAntchainAtoFundUserperformanceEx(request *GetAntchainAtoFundUserperformanceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetAntchainAtoFundUserperformanceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetAntchainAtoFundUserperformanceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.fund.userperformance.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 商户履约信息查询（履约承诺+履约记录）
 * Summary: 商户履约信息查询（履约承诺+履约记录）
 */
func (client *Client) GetAntchainAtoFundMerchantperformance(request *GetAntchainAtoFundMerchantperformanceRequest) (_result *GetAntchainAtoFundMerchantperformanceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetAntchainAtoFundMerchantperformanceResponse{}
	_body, _err := client.GetAntchainAtoFundMerchantperformanceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 商户履约信息查询（履约承诺+履约记录）
 * Summary: 商户履约信息查询（履约承诺+履约记录）
 */
func (client *Client) GetAntchainAtoFundMerchantperformanceEx(request *GetAntchainAtoFundMerchantperformanceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetAntchainAtoFundMerchantperformanceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetAntchainAtoFundMerchantperformanceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.fund.merchantperformance.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 资方查询订单详情
 * Summary: 资方查询订单详情
 */
func (client *Client) GetAntchainAtoFundOrderfullinfo(request *GetAntchainAtoFundOrderfullinfoRequest) (_result *GetAntchainAtoFundOrderfullinfoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetAntchainAtoFundOrderfullinfoResponse{}
	_body, _err := client.GetAntchainAtoFundOrderfullinfoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 资方查询订单详情
 * Summary: 资方查询订单详情
 */
func (client *Client) GetAntchainAtoFundOrderfullinfoEx(request *GetAntchainAtoFundOrderfullinfoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetAntchainAtoFundOrderfullinfoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetAntchainAtoFundOrderfullinfoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.fund.orderfullinfo.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 调用该接口，追加上传无法在原有链路上签署的合同
 * Summary: 商户调用合同追加接口
 */
func (client *Client) UploadAntchainAtoSignFlow(request *UploadAntchainAtoSignFlowRequest) (_result *UploadAntchainAtoSignFlowResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UploadAntchainAtoSignFlowResponse{}
	_body, _err := client.UploadAntchainAtoSignFlowEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 调用该接口，追加上传无法在原有链路上签署的合同
 * Summary: 商户调用合同追加接口
 */
func (client *Client) UploadAntchainAtoSignFlowEx(request *UploadAntchainAtoSignFlowRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UploadAntchainAtoSignFlowResponse, _err error) {
	if !tea.BoolValue(util.IsUnset(request.FileObject)) {
		uploadReq := &CreateAntcloudGatewayxFileUploadRequest{
			AuthToken: request.AuthToken,
			ApiCode:   tea.String("antchain.ato.sign.flow.upload"),
			FileName:  request.FileObjectName,
		}
		uploadResp, _err := client.CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime)
		if _err != nil {
			return _result, _err
		}

		if !tea.BoolValue(antchainutil.IsSuccess(uploadResp.ResultCode, tea.String("ok"))) {
			uploadAntchainAtoSignFlowResponse := &UploadAntchainAtoSignFlowResponse{
				ReqMsgId:   uploadResp.ReqMsgId,
				ResultCode: uploadResp.ResultCode,
				ResultMsg:  uploadResp.ResultMsg,
			}
			_result = uploadAntchainAtoSignFlowResponse
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
	_result = &UploadAntchainAtoSignFlowResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.sign.flow.upload"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
