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

// 订单还款计划
type PromiseInfo struct {
}

func (s PromiseInfo) String() string {
	return tea.Prettify(s)
}

func (s PromiseInfo) GoString() string {
	return s.String()
}

// 同步订单中的下单人信息
type UserSyncInfo struct {
}

func (s UserSyncInfo) String() string {
	return tea.Prettify(s)
}

func (s UserSyncInfo) GoString() string {
	return s.String()
}

// 主订单信息
type OrderInfo struct {
}

func (s OrderInfo) String() string {
	return tea.Prettify(s)
}

func (s OrderInfo) GoString() string {
	return s.String()
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

// 订单商品信息
type GoodsInfo struct {
}

func (s GoodsInfo) String() string {
	return tea.Prettify(s)
}

func (s GoodsInfo) GoString() string {
	return s.String()
}

// 订单包含的单个商品模型
type OrderGoodsModel struct {
}

func (s OrderGoodsModel) String() string {
	return tea.Prettify(s)
}

func (s OrderGoodsModel) GoString() string {
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

type SyncFundSplittingRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 资方订单号
	FundNo *string `json:"fund_no,omitempty" xml:"fund_no,omitempty" require:"true" maxLength:"50" minLength:"1"`
	// 商户的订单号
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"50" minLength:"1"`
	// 商户的数科租户ID
	MerchantTenantId *string `json:"merchant_tenant_id,omitempty" xml:"merchant_tenant_id,omitempty" require:"true" maxLength:"50" minLength:"1"`
	// 第几期，例如：2表示第二期
	TermNum *int64 `json:"term_num,omitempty" xml:"term_num,omitempty" require:"true"`
	// 扣款时间， yyyy-MM-dd HH:mm:ss 格式
	DeductionTime *string `json:"deduction_time,omitempty" xml:"deduction_time,omitempty" require:"true"`
	// 扣款金额，单位精确到分， 例如：12462300为124623.00元
	DeductionAmount *int64 `json:"deduction_amount,omitempty" xml:"deduction_amount,omitempty" require:"true"`
	// 商户分账金额，单位精确到分，比如：666601 = 6666.01元
	MerchantSplitAmount *int64 `json:"merchant_split_amount,omitempty" xml:"merchant_split_amount,omitempty" require:"true"`
	// 资方分账金额，单位精确到分。比如：666610 = 6666.10元
	FundSplitAmount *int64 `json:"fund_split_amount,omitempty" xml:"fund_split_amount,omitempty" require:"true"`
	// 其他参与方分账信息，JSON格式的数组，样例：
	// [{"participants":"参与方A","amount":666600,"accountNo":"777223","accountType":"ICBC"}]
	OtherSplitInfo *string `json:"other_split_info,omitempty" xml:"other_split_info,omitempty"`
}

func (s SyncFundSplittingRequest) String() string {
	return tea.Prettify(s)
}

func (s SyncFundSplittingRequest) GoString() string {
	return s.String()
}

func (s *SyncFundSplittingRequest) SetAuthToken(v string) *SyncFundSplittingRequest {
	s.AuthToken = &v
	return s
}

func (s *SyncFundSplittingRequest) SetProductInstanceId(v string) *SyncFundSplittingRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SyncFundSplittingRequest) SetFundNo(v string) *SyncFundSplittingRequest {
	s.FundNo = &v
	return s
}

func (s *SyncFundSplittingRequest) SetOrderId(v string) *SyncFundSplittingRequest {
	s.OrderId = &v
	return s
}

func (s *SyncFundSplittingRequest) SetMerchantTenantId(v string) *SyncFundSplittingRequest {
	s.MerchantTenantId = &v
	return s
}

func (s *SyncFundSplittingRequest) SetTermNum(v int64) *SyncFundSplittingRequest {
	s.TermNum = &v
	return s
}

func (s *SyncFundSplittingRequest) SetDeductionTime(v string) *SyncFundSplittingRequest {
	s.DeductionTime = &v
	return s
}

func (s *SyncFundSplittingRequest) SetDeductionAmount(v int64) *SyncFundSplittingRequest {
	s.DeductionAmount = &v
	return s
}

func (s *SyncFundSplittingRequest) SetMerchantSplitAmount(v int64) *SyncFundSplittingRequest {
	s.MerchantSplitAmount = &v
	return s
}

func (s *SyncFundSplittingRequest) SetFundSplitAmount(v int64) *SyncFundSplittingRequest {
	s.FundSplitAmount = &v
	return s
}

func (s *SyncFundSplittingRequest) SetOtherSplitInfo(v string) *SyncFundSplittingRequest {
	s.OtherSplitInfo = &v
	return s
}

type SyncFundSplittingResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 流水同步描述信息
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s SyncFundSplittingResponse) String() string {
	return tea.Prettify(s)
}

func (s SyncFundSplittingResponse) GoString() string {
	return s.String()
}

func (s *SyncFundSplittingResponse) SetReqMsgId(v string) *SyncFundSplittingResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SyncFundSplittingResponse) SetResultCode(v string) *SyncFundSplittingResponse {
	s.ResultCode = &v
	return s
}

func (s *SyncFundSplittingResponse) SetResultMsg(v string) *SyncFundSplittingResponse {
	s.ResultMsg = &v
	return s
}

func (s *SyncFundSplittingResponse) SetResponseData(v string) *SyncFundSplittingResponse {
	s.ResponseData = &v
	return s
}

type SyncFundOrderfinancialRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单号
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"50" minLength:"1"`
	// 商户在数科的租户ID
	MerchantTenantId *string `json:"merchant_tenant_id,omitempty" xml:"merchant_tenant_id,omitempty" require:"true" maxLength:"50" minLength:"1"`
	// 订单融资唯一标识
	ApplicationId *string `json:"application_id,omitempty" xml:"application_id,omitempty" require:"true" maxLength:"128" minLength:"1"`
	// 订单融资状态：1-成功；2-失败
	Status *int64 `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 融资结果描述，长度不超过64
	Reason *string `json:"reason,omitempty" xml:"reason,omitempty" maxLength:"64"`
	// 额外信息
	Extras *string `json:"extras,omitempty" xml:"extras,omitempty"`
}

func (s SyncFundOrderfinancialRequest) String() string {
	return tea.Prettify(s)
}

func (s SyncFundOrderfinancialRequest) GoString() string {
	return s.String()
}

func (s *SyncFundOrderfinancialRequest) SetAuthToken(v string) *SyncFundOrderfinancialRequest {
	s.AuthToken = &v
	return s
}

func (s *SyncFundOrderfinancialRequest) SetProductInstanceId(v string) *SyncFundOrderfinancialRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SyncFundOrderfinancialRequest) SetOrderId(v string) *SyncFundOrderfinancialRequest {
	s.OrderId = &v
	return s
}

func (s *SyncFundOrderfinancialRequest) SetMerchantTenantId(v string) *SyncFundOrderfinancialRequest {
	s.MerchantTenantId = &v
	return s
}

func (s *SyncFundOrderfinancialRequest) SetApplicationId(v string) *SyncFundOrderfinancialRequest {
	s.ApplicationId = &v
	return s
}

func (s *SyncFundOrderfinancialRequest) SetStatus(v int64) *SyncFundOrderfinancialRequest {
	s.Status = &v
	return s
}

func (s *SyncFundOrderfinancialRequest) SetReason(v string) *SyncFundOrderfinancialRequest {
	s.Reason = &v
	return s
}

func (s *SyncFundOrderfinancialRequest) SetExtras(v string) *SyncFundOrderfinancialRequest {
	s.Extras = &v
	return s
}

type SyncFundOrderfinancialResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 结果描述信息
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s SyncFundOrderfinancialResponse) String() string {
	return tea.Prettify(s)
}

func (s SyncFundOrderfinancialResponse) GoString() string {
	return s.String()
}

func (s *SyncFundOrderfinancialResponse) SetReqMsgId(v string) *SyncFundOrderfinancialResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SyncFundOrderfinancialResponse) SetResultCode(v string) *SyncFundOrderfinancialResponse {
	s.ResultCode = &v
	return s
}

func (s *SyncFundOrderfinancialResponse) SetResultMsg(v string) *SyncFundOrderfinancialResponse {
	s.ResultMsg = &v
	return s
}

func (s *SyncFundOrderfinancialResponse) SetResponseData(v string) *SyncFundOrderfinancialResponse {
	s.ResponseData = &v
	return s
}

type SyncFundWithholdingcontractRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单号
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"50" minLength:"1"`
	// 商家在数科注册的租户id
	MerchantTenantId *string `json:"merchant_tenant_id,omitempty" xml:"merchant_tenant_id,omitempty" require:"true" maxLength:"50" minLength:"1"`
	// 代扣协议号
	WithholdingContractId *string `json:"withholding_contract_id,omitempty" xml:"withholding_contract_id,omitempty" require:"true" maxLength:"100" minLength:"1"`
	// json的字符串，存储额外信息
	ExtraInfo *string `json:"extra_info,omitempty" xml:"extra_info,omitempty"`
	// 签署状态：
	// - ACCEPT : 接受
	// - REFUSE : 拒绝
	// - TIMEOUT : 超时
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
}

func (s SyncFundWithholdingcontractRequest) String() string {
	return tea.Prettify(s)
}

func (s SyncFundWithholdingcontractRequest) GoString() string {
	return s.String()
}

func (s *SyncFundWithholdingcontractRequest) SetAuthToken(v string) *SyncFundWithholdingcontractRequest {
	s.AuthToken = &v
	return s
}

func (s *SyncFundWithholdingcontractRequest) SetProductInstanceId(v string) *SyncFundWithholdingcontractRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SyncFundWithholdingcontractRequest) SetOrderId(v string) *SyncFundWithholdingcontractRequest {
	s.OrderId = &v
	return s
}

func (s *SyncFundWithholdingcontractRequest) SetMerchantTenantId(v string) *SyncFundWithholdingcontractRequest {
	s.MerchantTenantId = &v
	return s
}

func (s *SyncFundWithholdingcontractRequest) SetWithholdingContractId(v string) *SyncFundWithholdingcontractRequest {
	s.WithholdingContractId = &v
	return s
}

func (s *SyncFundWithholdingcontractRequest) SetExtraInfo(v string) *SyncFundWithholdingcontractRequest {
	s.ExtraInfo = &v
	return s
}

func (s *SyncFundWithholdingcontractRequest) SetStatus(v string) *SyncFundWithholdingcontractRequest {
	s.Status = &v
	return s
}

type SyncFundWithholdingcontractResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 存储成功
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s SyncFundWithholdingcontractResponse) String() string {
	return tea.Prettify(s)
}

func (s SyncFundWithholdingcontractResponse) GoString() string {
	return s.String()
}

func (s *SyncFundWithholdingcontractResponse) SetReqMsgId(v string) *SyncFundWithholdingcontractResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SyncFundWithholdingcontractResponse) SetResultCode(v string) *SyncFundWithholdingcontractResponse {
	s.ResultCode = &v
	return s
}

func (s *SyncFundWithholdingcontractResponse) SetResultMsg(v string) *SyncFundWithholdingcontractResponse {
	s.ResultMsg = &v
	return s
}

func (s *SyncFundWithholdingcontractResponse) SetResponseData(v string) *SyncFundWithholdingcontractResponse {
	s.ResponseData = &v
	return s
}

type SyncFundOrderfulfillmentRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 商户id
	MerchantTenantId *string `json:"merchant_tenant_id,omitempty" xml:"merchant_tenant_id,omitempty" require:"true" maxLength:"49" minLength:"1"`
	// 订单id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"49" minLength:"1"`
	// 租期编号
	LeaseTermIndex *int64 `json:"lease_term_index,omitempty" xml:"lease_term_index,omitempty" require:"true"`
	// 剩余归还期数
	RemainTerm *int64 `json:"remain_term,omitempty" xml:"remain_term,omitempty" require:"true"`
	// 总期数
	TotalTerm *int64 `json:"total_term,omitempty" xml:"total_term,omitempty" require:"true"`
	// 租金归还状态，
	// RETURN_FULL : 足额归还 【终态】
	// NOT_RETURN : 未归还
	// CANCEL : 取消 【终态】
	RentalReturnState *string `json:"rental_return_state,omitempty" xml:"rental_return_state,omitempty" require:"true"`
	// 租金归还金额,精确到分，即1234表示12.34元
	RentalMoney *int64 `json:"rental_money,omitempty" xml:"rental_money,omitempty" require:"true"`
	// 罚息金额，分，1234表示12.34元
	PenaltyFeeMoney *int64 `json:"penalty_fee_money,omitempty" xml:"penalty_fee_money,omitempty" require:"true"`
	// 总金额，单位分
	TotalMoney *int64 `json:"total_money,omitempty" xml:"total_money,omitempty" require:"true"`
	// 归还时间，格式为"2019-07-31 12:00:00"
	ReturnTime *string `json:"return_time,omitempty" xml:"return_time,omitempty"`
	// 归还方式，
	// ANTDIGITAL： 数科代扣
	// FUND : 资方代扣
	// BANK : 银行转账
	// WECHAT : 微信支付
	ReturnWay *string `json:"return_way,omitempty" xml:"return_way,omitempty"`
	// 还款凭证编号
	ReturnVoucherSerial *string `json:"return_voucher_serial,omitempty" xml:"return_voucher_serial,omitempty" maxLength:"127" minLength:"1"`
	// 银行名字
	BankName *string `json:"bank_name,omitempty" xml:"bank_name,omitempty" maxLength:"127"`
}

func (s SyncFundOrderfulfillmentRequest) String() string {
	return tea.Prettify(s)
}

func (s SyncFundOrderfulfillmentRequest) GoString() string {
	return s.String()
}

func (s *SyncFundOrderfulfillmentRequest) SetAuthToken(v string) *SyncFundOrderfulfillmentRequest {
	s.AuthToken = &v
	return s
}

func (s *SyncFundOrderfulfillmentRequest) SetProductInstanceId(v string) *SyncFundOrderfulfillmentRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SyncFundOrderfulfillmentRequest) SetMerchantTenantId(v string) *SyncFundOrderfulfillmentRequest {
	s.MerchantTenantId = &v
	return s
}

func (s *SyncFundOrderfulfillmentRequest) SetOrderId(v string) *SyncFundOrderfulfillmentRequest {
	s.OrderId = &v
	return s
}

func (s *SyncFundOrderfulfillmentRequest) SetLeaseTermIndex(v int64) *SyncFundOrderfulfillmentRequest {
	s.LeaseTermIndex = &v
	return s
}

func (s *SyncFundOrderfulfillmentRequest) SetRemainTerm(v int64) *SyncFundOrderfulfillmentRequest {
	s.RemainTerm = &v
	return s
}

func (s *SyncFundOrderfulfillmentRequest) SetTotalTerm(v int64) *SyncFundOrderfulfillmentRequest {
	s.TotalTerm = &v
	return s
}

func (s *SyncFundOrderfulfillmentRequest) SetRentalReturnState(v string) *SyncFundOrderfulfillmentRequest {
	s.RentalReturnState = &v
	return s
}

func (s *SyncFundOrderfulfillmentRequest) SetRentalMoney(v int64) *SyncFundOrderfulfillmentRequest {
	s.RentalMoney = &v
	return s
}

func (s *SyncFundOrderfulfillmentRequest) SetPenaltyFeeMoney(v int64) *SyncFundOrderfulfillmentRequest {
	s.PenaltyFeeMoney = &v
	return s
}

func (s *SyncFundOrderfulfillmentRequest) SetTotalMoney(v int64) *SyncFundOrderfulfillmentRequest {
	s.TotalMoney = &v
	return s
}

func (s *SyncFundOrderfulfillmentRequest) SetReturnTime(v string) *SyncFundOrderfulfillmentRequest {
	s.ReturnTime = &v
	return s
}

func (s *SyncFundOrderfulfillmentRequest) SetReturnWay(v string) *SyncFundOrderfulfillmentRequest {
	s.ReturnWay = &v
	return s
}

func (s *SyncFundOrderfulfillmentRequest) SetReturnVoucherSerial(v string) *SyncFundOrderfulfillmentRequest {
	s.ReturnVoucherSerial = &v
	return s
}

func (s *SyncFundOrderfulfillmentRequest) SetBankName(v string) *SyncFundOrderfulfillmentRequest {
	s.BankName = &v
	return s
}

type SyncFundOrderfulfillmentResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 添加成功
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s SyncFundOrderfulfillmentResponse) String() string {
	return tea.Prettify(s)
}

func (s SyncFundOrderfulfillmentResponse) GoString() string {
	return s.String()
}

func (s *SyncFundOrderfulfillmentResponse) SetReqMsgId(v string) *SyncFundOrderfulfillmentResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SyncFundOrderfulfillmentResponse) SetResultCode(v string) *SyncFundOrderfulfillmentResponse {
	s.ResultCode = &v
	return s
}

func (s *SyncFundOrderfulfillmentResponse) SetResultMsg(v string) *SyncFundOrderfulfillmentResponse {
	s.ResultMsg = &v
	return s
}

func (s *SyncFundOrderfulfillmentResponse) SetResponseData(v string) *SyncFundOrderfulfillmentResponse {
	s.ResponseData = &v
	return s
}

type GetFundOrderfulfillmentRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"49" minLength:"1"`
	// 租赁订单所属商家租户id
	MerchantTenantId *string `json:"merchant_tenant_id,omitempty" xml:"merchant_tenant_id,omitempty" require:"true" maxLength:"49" minLength:"1"`
	// 期数
	// 如果填入，获取term_idx下的履约记录
	// 如果不填入，获取order_id下的所有履约记录
	TermIdx *int64 `json:"term_idx,omitempty" xml:"term_idx,omitempty"`
}

func (s GetFundOrderfulfillmentRequest) String() string {
	return tea.Prettify(s)
}

func (s GetFundOrderfulfillmentRequest) GoString() string {
	return s.String()
}

func (s *GetFundOrderfulfillmentRequest) SetAuthToken(v string) *GetFundOrderfulfillmentRequest {
	s.AuthToken = &v
	return s
}

func (s *GetFundOrderfulfillmentRequest) SetProductInstanceId(v string) *GetFundOrderfulfillmentRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetFundOrderfulfillmentRequest) SetOrderId(v string) *GetFundOrderfulfillmentRequest {
	s.OrderId = &v
	return s
}

func (s *GetFundOrderfulfillmentRequest) SetMerchantTenantId(v string) *GetFundOrderfulfillmentRequest {
	s.MerchantTenantId = &v
	return s
}

func (s *GetFundOrderfulfillmentRequest) SetTermIdx(v int64) *GetFundOrderfulfillmentRequest {
	s.TermIdx = &v
	return s
}

type GetFundOrderfulfillmentResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 订单履约信息的列表数组
	// List<OrderFulfillment> 的jsonArray.toString
	OrderFulfillmentDataList *string `json:"order_fulfillment_data_list,omitempty" xml:"order_fulfillment_data_list,omitempty"`
}

func (s GetFundOrderfulfillmentResponse) String() string {
	return tea.Prettify(s)
}

func (s GetFundOrderfulfillmentResponse) GoString() string {
	return s.String()
}

func (s *GetFundOrderfulfillmentResponse) SetReqMsgId(v string) *GetFundOrderfulfillmentResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetFundOrderfulfillmentResponse) SetResultCode(v string) *GetFundOrderfulfillmentResponse {
	s.ResultCode = &v
	return s
}

func (s *GetFundOrderfulfillmentResponse) SetResultMsg(v string) *GetFundOrderfulfillmentResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetFundOrderfulfillmentResponse) SetOrderFulfillmentDataList(v string) *GetFundOrderfulfillmentResponse {
	s.OrderFulfillmentDataList = &v
	return s
}

type UploadFundFlowRequest struct {
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

func (s UploadFundFlowRequest) String() string {
	return tea.Prettify(s)
}

func (s UploadFundFlowRequest) GoString() string {
	return s.String()
}

func (s *UploadFundFlowRequest) SetAuthToken(v string) *UploadFundFlowRequest {
	s.AuthToken = &v
	return s
}

func (s *UploadFundFlowRequest) SetProductInstanceId(v string) *UploadFundFlowRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UploadFundFlowRequest) SetMerchantId(v string) *UploadFundFlowRequest {
	s.MerchantId = &v
	return s
}

func (s *UploadFundFlowRequest) SetOrderId(v string) *UploadFundFlowRequest {
	s.OrderId = &v
	return s
}

func (s *UploadFundFlowRequest) SetSignNo(v string) *UploadFundFlowRequest {
	s.SignNo = &v
	return s
}

func (s *UploadFundFlowRequest) SetFileItemNo(v string) *UploadFundFlowRequest {
	s.FileItemNo = &v
	return s
}

func (s *UploadFundFlowRequest) SetFileObject(v io.Reader) *UploadFundFlowRequest {
	s.FileObject = v
	return s
}

func (s *UploadFundFlowRequest) SetFileObjectName(v string) *UploadFundFlowRequest {
	s.FileObjectName = &v
	return s
}

func (s *UploadFundFlowRequest) SetFileId(v string) *UploadFundFlowRequest {
	s.FileId = &v
	return s
}

type UploadFundFlowResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s UploadFundFlowResponse) String() string {
	return tea.Prettify(s)
}

func (s UploadFundFlowResponse) GoString() string {
	return s.String()
}

func (s *UploadFundFlowResponse) SetReqMsgId(v string) *UploadFundFlowResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UploadFundFlowResponse) SetResultCode(v string) *UploadFundFlowResponse {
	s.ResultCode = &v
	return s
}

func (s *UploadFundFlowResponse) SetResultMsg(v string) *UploadFundFlowResponse {
	s.ResultMsg = &v
	return s
}

type GetFundFlowRequest struct {
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

func (s GetFundFlowRequest) String() string {
	return tea.Prettify(s)
}

func (s GetFundFlowRequest) GoString() string {
	return s.String()
}

func (s *GetFundFlowRequest) SetAuthToken(v string) *GetFundFlowRequest {
	s.AuthToken = &v
	return s
}

func (s *GetFundFlowRequest) SetProductInstanceId(v string) *GetFundFlowRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetFundFlowRequest) SetMerchantId(v string) *GetFundFlowRequest {
	s.MerchantId = &v
	return s
}

func (s *GetFundFlowRequest) SetOrderId(v string) *GetFundFlowRequest {
	s.OrderId = &v
	return s
}

func (s *GetFundFlowRequest) SetContractType(v string) *GetFundFlowRequest {
	s.ContractType = &v
	return s
}

type GetFundFlowResponse struct {
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

func (s GetFundFlowResponse) String() string {
	return tea.Prettify(s)
}

func (s GetFundFlowResponse) GoString() string {
	return s.String()
}

func (s *GetFundFlowResponse) SetReqMsgId(v string) *GetFundFlowResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetFundFlowResponse) SetResultCode(v string) *GetFundFlowResponse {
	s.ResultCode = &v
	return s
}

func (s *GetFundFlowResponse) SetResultMsg(v string) *GetFundFlowResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetFundFlowResponse) SetOrderId(v string) *GetFundFlowResponse {
	s.OrderId = &v
	return s
}

func (s *GetFundFlowResponse) SetContractList(v string) *GetFundFlowResponse {
	s.ContractList = &v
	return s
}

type RefuseFundFlowRequest struct {
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

func (s RefuseFundFlowRequest) String() string {
	return tea.Prettify(s)
}

func (s RefuseFundFlowRequest) GoString() string {
	return s.String()
}

func (s *RefuseFundFlowRequest) SetAuthToken(v string) *RefuseFundFlowRequest {
	s.AuthToken = &v
	return s
}

func (s *RefuseFundFlowRequest) SetProductInstanceId(v string) *RefuseFundFlowRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *RefuseFundFlowRequest) SetMerchantId(v string) *RefuseFundFlowRequest {
	s.MerchantId = &v
	return s
}

func (s *RefuseFundFlowRequest) SetOrderId(v string) *RefuseFundFlowRequest {
	s.OrderId = &v
	return s
}

func (s *RefuseFundFlowRequest) SetSignNo(v string) *RefuseFundFlowRequest {
	s.SignNo = &v
	return s
}

func (s *RefuseFundFlowRequest) SetSignReason(v string) *RefuseFundFlowRequest {
	s.SignReason = &v
	return s
}

type RefuseFundFlowResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s RefuseFundFlowResponse) String() string {
	return tea.Prettify(s)
}

func (s RefuseFundFlowResponse) GoString() string {
	return s.String()
}

func (s *RefuseFundFlowResponse) SetReqMsgId(v string) *RefuseFundFlowResponse {
	s.ReqMsgId = &v
	return s
}

func (s *RefuseFundFlowResponse) SetResultCode(v string) *RefuseFundFlowResponse {
	s.ResultCode = &v
	return s
}

func (s *RefuseFundFlowResponse) SetResultMsg(v string) *RefuseFundFlowResponse {
	s.ResultMsg = &v
	return s
}

type AuthFundFlowRequest struct {
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

func (s AuthFundFlowRequest) String() string {
	return tea.Prettify(s)
}

func (s AuthFundFlowRequest) GoString() string {
	return s.String()
}

func (s *AuthFundFlowRequest) SetAuthToken(v string) *AuthFundFlowRequest {
	s.AuthToken = &v
	return s
}

func (s *AuthFundFlowRequest) SetProductInstanceId(v string) *AuthFundFlowRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AuthFundFlowRequest) SetMerchantId(v string) *AuthFundFlowRequest {
	s.MerchantId = &v
	return s
}

func (s *AuthFundFlowRequest) SetOrderId(v string) *AuthFundFlowRequest {
	s.OrderId = &v
	return s
}

func (s *AuthFundFlowRequest) SetSignNo(v string) *AuthFundFlowRequest {
	s.SignNo = &v
	return s
}

func (s *AuthFundFlowRequest) SetTag(v string) *AuthFundFlowRequest {
	s.Tag = &v
	return s
}

type AuthFundFlowResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 签署最后落签的签署区域id列表
	SignFieldIds *string `json:"sign_field_ids,omitempty" xml:"sign_field_ids,omitempty"`
}

func (s AuthFundFlowResponse) String() string {
	return tea.Prettify(s)
}

func (s AuthFundFlowResponse) GoString() string {
	return s.String()
}

func (s *AuthFundFlowResponse) SetReqMsgId(v string) *AuthFundFlowResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AuthFundFlowResponse) SetResultCode(v string) *AuthFundFlowResponse {
	s.ResultCode = &v
	return s
}

func (s *AuthFundFlowResponse) SetResultMsg(v string) *AuthFundFlowResponse {
	s.ResultMsg = &v
	return s
}

func (s *AuthFundFlowResponse) SetSignFieldIds(v string) *AuthFundFlowResponse {
	s.SignFieldIds = &v
	return s
}

type CancelFundPlanRequest struct {
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

func (s CancelFundPlanRequest) String() string {
	return tea.Prettify(s)
}

func (s CancelFundPlanRequest) GoString() string {
	return s.String()
}

func (s *CancelFundPlanRequest) SetAuthToken(v string) *CancelFundPlanRequest {
	s.AuthToken = &v
	return s
}

func (s *CancelFundPlanRequest) SetProductInstanceId(v string) *CancelFundPlanRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CancelFundPlanRequest) SetOrderId(v string) *CancelFundPlanRequest {
	s.OrderId = &v
	return s
}

func (s *CancelFundPlanRequest) SetMerchantId(v string) *CancelFundPlanRequest {
	s.MerchantId = &v
	return s
}

func (s *CancelFundPlanRequest) SetCancelReason(v string) *CancelFundPlanRequest {
	s.CancelReason = &v
	return s
}

type CancelFundPlanResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CancelFundPlanResponse) String() string {
	return tea.Prettify(s)
}

func (s CancelFundPlanResponse) GoString() string {
	return s.String()
}

func (s *CancelFundPlanResponse) SetReqMsgId(v string) *CancelFundPlanResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CancelFundPlanResponse) SetResultCode(v string) *CancelFundPlanResponse {
	s.ResultCode = &v
	return s
}

func (s *CancelFundPlanResponse) SetResultMsg(v string) *CancelFundPlanResponse {
	s.ResultMsg = &v
	return s
}

type CallbackFundNotifyRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// ASYNC_UNSIGN_APPLY
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 数据
	Data *string `json:"data,omitempty" xml:"data,omitempty" require:"true"`
}

func (s CallbackFundNotifyRequest) String() string {
	return tea.Prettify(s)
}

func (s CallbackFundNotifyRequest) GoString() string {
	return s.String()
}

func (s *CallbackFundNotifyRequest) SetAuthToken(v string) *CallbackFundNotifyRequest {
	s.AuthToken = &v
	return s
}

func (s *CallbackFundNotifyRequest) SetProductInstanceId(v string) *CallbackFundNotifyRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CallbackFundNotifyRequest) SetType(v string) *CallbackFundNotifyRequest {
	s.Type = &v
	return s
}

func (s *CallbackFundNotifyRequest) SetData(v string) *CallbackFundNotifyRequest {
	s.Data = &v
	return s
}

type CallbackFundNotifyResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CallbackFundNotifyResponse) String() string {
	return tea.Prettify(s)
}

func (s CallbackFundNotifyResponse) GoString() string {
	return s.String()
}

func (s *CallbackFundNotifyResponse) SetReqMsgId(v string) *CallbackFundNotifyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CallbackFundNotifyResponse) SetResultCode(v string) *CallbackFundNotifyResponse {
	s.ResultCode = &v
	return s
}

func (s *CallbackFundNotifyResponse) SetResultMsg(v string) *CallbackFundNotifyResponse {
	s.ResultMsg = &v
	return s
}

type SyncFundMerchantpromiseRequest struct {
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

func (s SyncFundMerchantpromiseRequest) String() string {
	return tea.Prettify(s)
}

func (s SyncFundMerchantpromiseRequest) GoString() string {
	return s.String()
}

func (s *SyncFundMerchantpromiseRequest) SetAuthToken(v string) *SyncFundMerchantpromiseRequest {
	s.AuthToken = &v
	return s
}

func (s *SyncFundMerchantpromiseRequest) SetProductInstanceId(v string) *SyncFundMerchantpromiseRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SyncFundMerchantpromiseRequest) SetOrderId(v string) *SyncFundMerchantpromiseRequest {
	s.OrderId = &v
	return s
}

func (s *SyncFundMerchantpromiseRequest) SetMerchantId(v string) *SyncFundMerchantpromiseRequest {
	s.MerchantId = &v
	return s
}

func (s *SyncFundMerchantpromiseRequest) SetBizContent(v string) *SyncFundMerchantpromiseRequest {
	s.BizContent = &v
	return s
}

type SyncFundMerchantpromiseResponse struct {
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

func (s SyncFundMerchantpromiseResponse) String() string {
	return tea.Prettify(s)
}

func (s SyncFundMerchantpromiseResponse) GoString() string {
	return s.String()
}

func (s *SyncFundMerchantpromiseResponse) SetReqMsgId(v string) *SyncFundMerchantpromiseResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SyncFundMerchantpromiseResponse) SetResultCode(v string) *SyncFundMerchantpromiseResponse {
	s.ResultCode = &v
	return s
}

func (s *SyncFundMerchantpromiseResponse) SetResultMsg(v string) *SyncFundMerchantpromiseResponse {
	s.ResultMsg = &v
	return s
}

func (s *SyncFundMerchantpromiseResponse) SetOrderId(v string) *SyncFundMerchantpromiseResponse {
	s.OrderId = &v
	return s
}

func (s *SyncFundMerchantpromiseResponse) SetMerchantId(v string) *SyncFundMerchantpromiseResponse {
	s.MerchantId = &v
	return s
}

type SyncFundFinanceloanresultsRequest struct {
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

func (s SyncFundFinanceloanresultsRequest) String() string {
	return tea.Prettify(s)
}

func (s SyncFundFinanceloanresultsRequest) GoString() string {
	return s.String()
}

func (s *SyncFundFinanceloanresultsRequest) SetAuthToken(v string) *SyncFundFinanceloanresultsRequest {
	s.AuthToken = &v
	return s
}

func (s *SyncFundFinanceloanresultsRequest) SetProductInstanceId(v string) *SyncFundFinanceloanresultsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SyncFundFinanceloanresultsRequest) SetOrderId(v string) *SyncFundFinanceloanresultsRequest {
	s.OrderId = &v
	return s
}

func (s *SyncFundFinanceloanresultsRequest) SetMerchantId(v string) *SyncFundFinanceloanresultsRequest {
	s.MerchantId = &v
	return s
}

func (s *SyncFundFinanceloanresultsRequest) SetBizContent(v string) *SyncFundFinanceloanresultsRequest {
	s.BizContent = &v
	return s
}

type SyncFundFinanceloanresultsResponse struct {
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

func (s SyncFundFinanceloanresultsResponse) String() string {
	return tea.Prettify(s)
}

func (s SyncFundFinanceloanresultsResponse) GoString() string {
	return s.String()
}

func (s *SyncFundFinanceloanresultsResponse) SetReqMsgId(v string) *SyncFundFinanceloanresultsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SyncFundFinanceloanresultsResponse) SetResultCode(v string) *SyncFundFinanceloanresultsResponse {
	s.ResultCode = &v
	return s
}

func (s *SyncFundFinanceloanresultsResponse) SetResultMsg(v string) *SyncFundFinanceloanresultsResponse {
	s.ResultMsg = &v
	return s
}

func (s *SyncFundFinanceloanresultsResponse) SetOrderId(v string) *SyncFundFinanceloanresultsResponse {
	s.OrderId = &v
	return s
}

func (s *SyncFundFinanceloanresultsResponse) SetMerchantId(v string) *SyncFundFinanceloanresultsResponse {
	s.MerchantId = &v
	return s
}

func (s *SyncFundFinanceloanresultsResponse) SetLoanResult(v string) *SyncFundFinanceloanresultsResponse {
	s.LoanResult = &v
	return s
}

type GetFundUserpromiseRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"50" minLength:"1"`
	// 订单所属商户的社会信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true" maxLength:"200" minLength:"1"`
}

func (s GetFundUserpromiseRequest) String() string {
	return tea.Prettify(s)
}

func (s GetFundUserpromiseRequest) GoString() string {
	return s.String()
}

func (s *GetFundUserpromiseRequest) SetAuthToken(v string) *GetFundUserpromiseRequest {
	s.AuthToken = &v
	return s
}

func (s *GetFundUserpromiseRequest) SetProductInstanceId(v string) *GetFundUserpromiseRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetFundUserpromiseRequest) SetOrderId(v string) *GetFundUserpromiseRequest {
	s.OrderId = &v
	return s
}

func (s *GetFundUserpromiseRequest) SetMerchantId(v string) *GetFundUserpromiseRequest {
	s.MerchantId = &v
	return s
}

type GetFundUserpromiseResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回值为「OrderPromise」的json字符串
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s GetFundUserpromiseResponse) String() string {
	return tea.Prettify(s)
}

func (s GetFundUserpromiseResponse) GoString() string {
	return s.String()
}

func (s *GetFundUserpromiseResponse) SetReqMsgId(v string) *GetFundUserpromiseResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetFundUserpromiseResponse) SetResultCode(v string) *GetFundUserpromiseResponse {
	s.ResultCode = &v
	return s
}

func (s *GetFundUserpromiseResponse) SetResultMsg(v string) *GetFundUserpromiseResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetFundUserpromiseResponse) SetResponseData(v string) *GetFundUserpromiseResponse {
	s.ResponseData = &v
	return s
}

type GetFundUserperformanceRequest struct {
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

func (s GetFundUserperformanceRequest) String() string {
	return tea.Prettify(s)
}

func (s GetFundUserperformanceRequest) GoString() string {
	return s.String()
}

func (s *GetFundUserperformanceRequest) SetAuthToken(v string) *GetFundUserperformanceRequest {
	s.AuthToken = &v
	return s
}

func (s *GetFundUserperformanceRequest) SetProductInstanceId(v string) *GetFundUserperformanceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetFundUserperformanceRequest) SetOrderId(v string) *GetFundUserperformanceRequest {
	s.OrderId = &v
	return s
}

func (s *GetFundUserperformanceRequest) SetMerchantId(v string) *GetFundUserperformanceRequest {
	s.MerchantId = &v
	return s
}

func (s *GetFundUserperformanceRequest) SetFundId(v string) *GetFundUserperformanceRequest {
	s.FundId = &v
	return s
}

type GetFundUserperformanceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 「UserPerformanceInfo」的json字符串
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s GetFundUserperformanceResponse) String() string {
	return tea.Prettify(s)
}

func (s GetFundUserperformanceResponse) GoString() string {
	return s.String()
}

func (s *GetFundUserperformanceResponse) SetReqMsgId(v string) *GetFundUserperformanceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetFundUserperformanceResponse) SetResultCode(v string) *GetFundUserperformanceResponse {
	s.ResultCode = &v
	return s
}

func (s *GetFundUserperformanceResponse) SetResultMsg(v string) *GetFundUserperformanceResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetFundUserperformanceResponse) SetResponseData(v string) *GetFundUserperformanceResponse {
	s.ResponseData = &v
	return s
}

type GetFundMerchantperformanceRequest struct {
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

func (s GetFundMerchantperformanceRequest) String() string {
	return tea.Prettify(s)
}

func (s GetFundMerchantperformanceRequest) GoString() string {
	return s.String()
}

func (s *GetFundMerchantperformanceRequest) SetAuthToken(v string) *GetFundMerchantperformanceRequest {
	s.AuthToken = &v
	return s
}

func (s *GetFundMerchantperformanceRequest) SetProductInstanceId(v string) *GetFundMerchantperformanceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetFundMerchantperformanceRequest) SetOrderId(v string) *GetFundMerchantperformanceRequest {
	s.OrderId = &v
	return s
}

func (s *GetFundMerchantperformanceRequest) SetMerchantId(v string) *GetFundMerchantperformanceRequest {
	s.MerchantId = &v
	return s
}

func (s *GetFundMerchantperformanceRequest) SetFundId(v string) *GetFundMerchantperformanceRequest {
	s.FundId = &v
	return s
}

type GetFundMerchantperformanceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 「MerchantPerformanceInfo」的json字符串
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s GetFundMerchantperformanceResponse) String() string {
	return tea.Prettify(s)
}

func (s GetFundMerchantperformanceResponse) GoString() string {
	return s.String()
}

func (s *GetFundMerchantperformanceResponse) SetReqMsgId(v string) *GetFundMerchantperformanceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetFundMerchantperformanceResponse) SetResultCode(v string) *GetFundMerchantperformanceResponse {
	s.ResultCode = &v
	return s
}

func (s *GetFundMerchantperformanceResponse) SetResultMsg(v string) *GetFundMerchantperformanceResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetFundMerchantperformanceResponse) SetResponseData(v string) *GetFundMerchantperformanceResponse {
	s.ResponseData = &v
	return s
}

type GetFundOrderfullinfoRequest struct {
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

func (s GetFundOrderfullinfoRequest) String() string {
	return tea.Prettify(s)
}

func (s GetFundOrderfullinfoRequest) GoString() string {
	return s.String()
}

func (s *GetFundOrderfullinfoRequest) SetAuthToken(v string) *GetFundOrderfullinfoRequest {
	s.AuthToken = &v
	return s
}

func (s *GetFundOrderfullinfoRequest) SetProductInstanceId(v string) *GetFundOrderfullinfoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetFundOrderfullinfoRequest) SetOrderId(v string) *GetFundOrderfullinfoRequest {
	s.OrderId = &v
	return s
}

func (s *GetFundOrderfullinfoRequest) SetMerchantId(v string) *GetFundOrderfullinfoRequest {
	s.MerchantId = &v
	return s
}

func (s *GetFundOrderfullinfoRequest) SetFundId(v string) *GetFundOrderfullinfoRequest {
	s.FundId = &v
	return s
}

type GetFundOrderfullinfoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// OrderFullInfoResp的json字符串
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s GetFundOrderfullinfoResponse) String() string {
	return tea.Prettify(s)
}

func (s GetFundOrderfullinfoResponse) GoString() string {
	return s.String()
}

func (s *GetFundOrderfullinfoResponse) SetReqMsgId(v string) *GetFundOrderfullinfoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetFundOrderfullinfoResponse) SetResultCode(v string) *GetFundOrderfullinfoResponse {
	s.ResultCode = &v
	return s
}

func (s *GetFundOrderfullinfoResponse) SetResultMsg(v string) *GetFundOrderfullinfoResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetFundOrderfullinfoResponse) SetResponseData(v string) *GetFundOrderfullinfoResponse {
	s.ResponseData = &v
	return s
}

type CreateRealpersonFacevrfRequest struct {
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

func (s CreateRealpersonFacevrfRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateRealpersonFacevrfRequest) GoString() string {
	return s.String()
}

func (s *CreateRealpersonFacevrfRequest) SetAuthToken(v string) *CreateRealpersonFacevrfRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateRealpersonFacevrfRequest) SetProductInstanceId(v string) *CreateRealpersonFacevrfRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateRealpersonFacevrfRequest) SetCertName(v string) *CreateRealpersonFacevrfRequest {
	s.CertName = &v
	return s
}

func (s *CreateRealpersonFacevrfRequest) SetCertNo(v string) *CreateRealpersonFacevrfRequest {
	s.CertNo = &v
	return s
}

func (s *CreateRealpersonFacevrfRequest) SetIdentityType(v string) *CreateRealpersonFacevrfRequest {
	s.IdentityType = &v
	return s
}

func (s *CreateRealpersonFacevrfRequest) SetCertType(v string) *CreateRealpersonFacevrfRequest {
	s.CertType = &v
	return s
}

func (s *CreateRealpersonFacevrfRequest) SetOuterOrderNo(v string) *CreateRealpersonFacevrfRequest {
	s.OuterOrderNo = &v
	return s
}

func (s *CreateRealpersonFacevrfRequest) SetReturnUrl(v string) *CreateRealpersonFacevrfRequest {
	s.ReturnUrl = &v
	return s
}

func (s *CreateRealpersonFacevrfRequest) SetOrderId(v string) *CreateRealpersonFacevrfRequest {
	s.OrderId = &v
	return s
}

type CreateRealpersonFacevrfResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务返回字段，JSON格式
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s CreateRealpersonFacevrfResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateRealpersonFacevrfResponse) GoString() string {
	return s.String()
}

func (s *CreateRealpersonFacevrfResponse) SetReqMsgId(v string) *CreateRealpersonFacevrfResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateRealpersonFacevrfResponse) SetResultCode(v string) *CreateRealpersonFacevrfResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateRealpersonFacevrfResponse) SetResultMsg(v string) *CreateRealpersonFacevrfResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateRealpersonFacevrfResponse) SetData(v string) *CreateRealpersonFacevrfResponse {
	s.Data = &v
	return s
}

type QueryRealpersonFacevrfRequest struct {
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

func (s QueryRealpersonFacevrfRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryRealpersonFacevrfRequest) GoString() string {
	return s.String()
}

func (s *QueryRealpersonFacevrfRequest) SetAuthToken(v string) *QueryRealpersonFacevrfRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryRealpersonFacevrfRequest) SetProductInstanceId(v string) *QueryRealpersonFacevrfRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryRealpersonFacevrfRequest) SetCertifyId(v string) *QueryRealpersonFacevrfRequest {
	s.CertifyId = &v
	return s
}

func (s *QueryRealpersonFacevrfRequest) SetOuterOrderNo(v string) *QueryRealpersonFacevrfRequest {
	s.OuterOrderNo = &v
	return s
}

func (s *QueryRealpersonFacevrfRequest) SetOrderId(v string) *QueryRealpersonFacevrfRequest {
	s.OrderId = &v
	return s
}

type QueryRealpersonFacevrfResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务返回字段，JSON格式
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QueryRealpersonFacevrfResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryRealpersonFacevrfResponse) GoString() string {
	return s.String()
}

func (s *QueryRealpersonFacevrfResponse) SetReqMsgId(v string) *QueryRealpersonFacevrfResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryRealpersonFacevrfResponse) SetResultCode(v string) *QueryRealpersonFacevrfResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryRealpersonFacevrfResponse) SetResultMsg(v string) *QueryRealpersonFacevrfResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryRealpersonFacevrfResponse) SetData(v string) *QueryRealpersonFacevrfResponse {
	s.Data = &v
	return s
}

type AllSignTemplateRequest struct {
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

func (s AllSignTemplateRequest) String() string {
	return tea.Prettify(s)
}

func (s AllSignTemplateRequest) GoString() string {
	return s.String()
}

func (s *AllSignTemplateRequest) SetAuthToken(v string) *AllSignTemplateRequest {
	s.AuthToken = &v
	return s
}

func (s *AllSignTemplateRequest) SetProductInstanceId(v string) *AllSignTemplateRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AllSignTemplateRequest) SetContractType(v string) *AllSignTemplateRequest {
	s.ContractType = &v
	return s
}

func (s *AllSignTemplateRequest) SetFundType(v string) *AllSignTemplateRequest {
	s.FundType = &v
	return s
}

func (s *AllSignTemplateRequest) SetFundId(v string) *AllSignTemplateRequest {
	s.FundId = &v
	return s
}

type AllSignTemplateResponse struct {
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

func (s AllSignTemplateResponse) String() string {
	return tea.Prettify(s)
}

func (s AllSignTemplateResponse) GoString() string {
	return s.String()
}

func (s *AllSignTemplateResponse) SetReqMsgId(v string) *AllSignTemplateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AllSignTemplateResponse) SetResultCode(v string) *AllSignTemplateResponse {
	s.ResultCode = &v
	return s
}

func (s *AllSignTemplateResponse) SetResultMsg(v string) *AllSignTemplateResponse {
	s.ResultMsg = &v
	return s
}

func (s *AllSignTemplateResponse) SetTemplateList(v string) *AllSignTemplateResponse {
	s.TemplateList = &v
	return s
}

type SubmitSignFlowRequest struct {
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

func (s SubmitSignFlowRequest) String() string {
	return tea.Prettify(s)
}

func (s SubmitSignFlowRequest) GoString() string {
	return s.String()
}

func (s *SubmitSignFlowRequest) SetAuthToken(v string) *SubmitSignFlowRequest {
	s.AuthToken = &v
	return s
}

func (s *SubmitSignFlowRequest) SetProductInstanceId(v string) *SubmitSignFlowRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SubmitSignFlowRequest) SetOrderId(v string) *SubmitSignFlowRequest {
	s.OrderId = &v
	return s
}

func (s *SubmitSignFlowRequest) SetUserIdType(v string) *SubmitSignFlowRequest {
	s.UserIdType = &v
	return s
}

func (s *SubmitSignFlowRequest) SetUserIdNumber(v string) *SubmitSignFlowRequest {
	s.UserIdNumber = &v
	return s
}

func (s *SubmitSignFlowRequest) SetUserName(v string) *SubmitSignFlowRequest {
	s.UserName = &v
	return s
}

func (s *SubmitSignFlowRequest) SetUserMobile(v string) *SubmitSignFlowRequest {
	s.UserMobile = &v
	return s
}

func (s *SubmitSignFlowRequest) SetUserEmail(v string) *SubmitSignFlowRequest {
	s.UserEmail = &v
	return s
}

func (s *SubmitSignFlowRequest) SetSignValidity(v string) *SubmitSignFlowRequest {
	s.SignValidity = &v
	return s
}

func (s *SubmitSignFlowRequest) SetFlowNotifyType(v string) *SubmitSignFlowRequest {
	s.FlowNotifyType = &v
	return s
}

func (s *SubmitSignFlowRequest) SetBusinessScene(v string) *SubmitSignFlowRequest {
	s.BusinessScene = &v
	return s
}

func (s *SubmitSignFlowRequest) SetSignedRedirectUrl(v string) *SubmitSignFlowRequest {
	s.SignedRedirectUrl = &v
	return s
}

func (s *SubmitSignFlowRequest) SetTemplateList(v string) *SubmitSignFlowRequest {
	s.TemplateList = &v
	return s
}

func (s *SubmitSignFlowRequest) SetAlipayUserId(v string) *SubmitSignFlowRequest {
	s.AlipayUserId = &v
	return s
}

func (s *SubmitSignFlowRequest) SetMerchantName(v string) *SubmitSignFlowRequest {
	s.MerchantName = &v
	return s
}

func (s *SubmitSignFlowRequest) SetMerchantTag(v string) *SubmitSignFlowRequest {
	s.MerchantTag = &v
	return s
}

func (s *SubmitSignFlowRequest) SetMerchantSealId(v string) *SubmitSignFlowRequest {
	s.MerchantSealId = &v
	return s
}

func (s *SubmitSignFlowRequest) SetMerchantSignOrder(v int64) *SubmitSignFlowRequest {
	s.MerchantSignOrder = &v
	return s
}

func (s *SubmitSignFlowRequest) SetMerchantIdType(v string) *SubmitSignFlowRequest {
	s.MerchantIdType = &v
	return s
}

func (s *SubmitSignFlowRequest) SetMerchantIdNumber(v string) *SubmitSignFlowRequest {
	s.MerchantIdNumber = &v
	return s
}

func (s *SubmitSignFlowRequest) SetMerchantLegalName(v string) *SubmitSignFlowRequest {
	s.MerchantLegalName = &v
	return s
}

func (s *SubmitSignFlowRequest) SetMerchantLegalIdNumber(v string) *SubmitSignFlowRequest {
	s.MerchantLegalIdNumber = &v
	return s
}

func (s *SubmitSignFlowRequest) SetThirdSigner(v string) *SubmitSignFlowRequest {
	s.ThirdSigner = &v
	return s
}

type SubmitSignFlowResponse struct {
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

func (s SubmitSignFlowResponse) String() string {
	return tea.Prettify(s)
}

func (s SubmitSignFlowResponse) GoString() string {
	return s.String()
}

func (s *SubmitSignFlowResponse) SetReqMsgId(v string) *SubmitSignFlowResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SubmitSignFlowResponse) SetResultCode(v string) *SubmitSignFlowResponse {
	s.ResultCode = &v
	return s
}

func (s *SubmitSignFlowResponse) SetResultMsg(v string) *SubmitSignFlowResponse {
	s.ResultMsg = &v
	return s
}

func (s *SubmitSignFlowResponse) SetSignNo(v string) *SubmitSignFlowResponse {
	s.SignNo = &v
	return s
}

func (s *SubmitSignFlowResponse) SetFlowId(v string) *SubmitSignFlowResponse {
	s.FlowId = &v
	return s
}

func (s *SubmitSignFlowResponse) SetAccountId(v string) *SubmitSignFlowResponse {
	s.AccountId = &v
	return s
}

func (s *SubmitSignFlowResponse) SetSignInfo(v string) *SubmitSignFlowResponse {
	s.SignInfo = &v
	return s
}

type GetSignFlowRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 签署合同单号
	SignNo *string `json:"sign_no,omitempty" xml:"sign_no,omitempty" require:"true"`
}

func (s GetSignFlowRequest) String() string {
	return tea.Prettify(s)
}

func (s GetSignFlowRequest) GoString() string {
	return s.String()
}

func (s *GetSignFlowRequest) SetAuthToken(v string) *GetSignFlowRequest {
	s.AuthToken = &v
	return s
}

func (s *GetSignFlowRequest) SetProductInstanceId(v string) *GetSignFlowRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetSignFlowRequest) SetSignNo(v string) *GetSignFlowRequest {
	s.SignNo = &v
	return s
}

type GetSignFlowResponse struct {
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

func (s GetSignFlowResponse) String() string {
	return tea.Prettify(s)
}

func (s GetSignFlowResponse) GoString() string {
	return s.String()
}

func (s *GetSignFlowResponse) SetReqMsgId(v string) *GetSignFlowResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetSignFlowResponse) SetResultCode(v string) *GetSignFlowResponse {
	s.ResultCode = &v
	return s
}

func (s *GetSignFlowResponse) SetResultMsg(v string) *GetSignFlowResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetSignFlowResponse) SetSignNo(v string) *GetSignFlowResponse {
	s.SignNo = &v
	return s
}

func (s *GetSignFlowResponse) SetOrderId(v string) *GetSignFlowResponse {
	s.OrderId = &v
	return s
}

func (s *GetSignFlowResponse) SetAccountId(v string) *GetSignFlowResponse {
	s.AccountId = &v
	return s
}

func (s *GetSignFlowResponse) SetStatus(v string) *GetSignFlowResponse {
	s.Status = &v
	return s
}

func (s *GetSignFlowResponse) SetFlowId(v string) *GetSignFlowResponse {
	s.FlowId = &v
	return s
}

func (s *GetSignFlowResponse) SetDocList(v string) *GetSignFlowResponse {
	s.DocList = &v
	return s
}

func (s *GetSignFlowResponse) SetBusinessScene(v string) *GetSignFlowResponse {
	s.BusinessScene = &v
	return s
}

func (s *GetSignFlowResponse) SetAlipayUserId(v string) *GetSignFlowResponse {
	s.AlipayUserId = &v
	return s
}

type AuthSignFlowRequest struct {
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

func (s AuthSignFlowRequest) String() string {
	return tea.Prettify(s)
}

func (s AuthSignFlowRequest) GoString() string {
	return s.String()
}

func (s *AuthSignFlowRequest) SetAuthToken(v string) *AuthSignFlowRequest {
	s.AuthToken = &v
	return s
}

func (s *AuthSignFlowRequest) SetProductInstanceId(v string) *AuthSignFlowRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AuthSignFlowRequest) SetSignNo(v string) *AuthSignFlowRequest {
	s.SignNo = &v
	return s
}

func (s *AuthSignFlowRequest) SetTag(v string) *AuthSignFlowRequest {
	s.Tag = &v
	return s
}

func (s *AuthSignFlowRequest) SetBizFlowId(v string) *AuthSignFlowRequest {
	s.BizFlowId = &v
	return s
}

func (s *AuthSignFlowRequest) SetAccountId(v string) *AuthSignFlowRequest {
	s.AccountId = &v
	return s
}

type AuthSignFlowResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 签署最后落签的签署区域id列表
	SignFieldIds *string `json:"sign_field_ids,omitempty" xml:"sign_field_ids,omitempty"`
}

func (s AuthSignFlowResponse) String() string {
	return tea.Prettify(s)
}

func (s AuthSignFlowResponse) GoString() string {
	return s.String()
}

func (s *AuthSignFlowResponse) SetReqMsgId(v string) *AuthSignFlowResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AuthSignFlowResponse) SetResultCode(v string) *AuthSignFlowResponse {
	s.ResultCode = &v
	return s
}

func (s *AuthSignFlowResponse) SetResultMsg(v string) *AuthSignFlowResponse {
	s.ResultMsg = &v
	return s
}

func (s *AuthSignFlowResponse) SetSignFieldIds(v string) *AuthSignFlowResponse {
	s.SignFieldIds = &v
	return s
}

type SubmitFrontSignRequest struct {
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

func (s SubmitFrontSignRequest) String() string {
	return tea.Prettify(s)
}

func (s SubmitFrontSignRequest) GoString() string {
	return s.String()
}

func (s *SubmitFrontSignRequest) SetAuthToken(v string) *SubmitFrontSignRequest {
	s.AuthToken = &v
	return s
}

func (s *SubmitFrontSignRequest) SetProductInstanceId(v string) *SubmitFrontSignRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SubmitFrontSignRequest) SetOrderId(v string) *SubmitFrontSignRequest {
	s.OrderId = &v
	return s
}

func (s *SubmitFrontSignRequest) SetUserIdType(v string) *SubmitFrontSignRequest {
	s.UserIdType = &v
	return s
}

func (s *SubmitFrontSignRequest) SetUserIdNumber(v string) *SubmitFrontSignRequest {
	s.UserIdNumber = &v
	return s
}

func (s *SubmitFrontSignRequest) SetUserName(v string) *SubmitFrontSignRequest {
	s.UserName = &v
	return s
}

func (s *SubmitFrontSignRequest) SetUserMobile(v string) *SubmitFrontSignRequest {
	s.UserMobile = &v
	return s
}

func (s *SubmitFrontSignRequest) SetUserEmail(v string) *SubmitFrontSignRequest {
	s.UserEmail = &v
	return s
}

func (s *SubmitFrontSignRequest) SetSignValidity(v string) *SubmitFrontSignRequest {
	s.SignValidity = &v
	return s
}

func (s *SubmitFrontSignRequest) SetFlowNotifyType(v string) *SubmitFrontSignRequest {
	s.FlowNotifyType = &v
	return s
}

func (s *SubmitFrontSignRequest) SetBusinessScene(v string) *SubmitFrontSignRequest {
	s.BusinessScene = &v
	return s
}

func (s *SubmitFrontSignRequest) SetSignedRedirectUrl(v string) *SubmitFrontSignRequest {
	s.SignedRedirectUrl = &v
	return s
}

func (s *SubmitFrontSignRequest) SetTemplateList(v string) *SubmitFrontSignRequest {
	s.TemplateList = &v
	return s
}

func (s *SubmitFrontSignRequest) SetAlipayUserId(v string) *SubmitFrontSignRequest {
	s.AlipayUserId = &v
	return s
}

func (s *SubmitFrontSignRequest) SetMerchantName(v string) *SubmitFrontSignRequest {
	s.MerchantName = &v
	return s
}

func (s *SubmitFrontSignRequest) SetMerchantTag(v string) *SubmitFrontSignRequest {
	s.MerchantTag = &v
	return s
}

func (s *SubmitFrontSignRequest) SetMerchantSignOrder(v int64) *SubmitFrontSignRequest {
	s.MerchantSignOrder = &v
	return s
}

func (s *SubmitFrontSignRequest) SetMerchantSealId(v string) *SubmitFrontSignRequest {
	s.MerchantSealId = &v
	return s
}

func (s *SubmitFrontSignRequest) SetMerchantIdType(v string) *SubmitFrontSignRequest {
	s.MerchantIdType = &v
	return s
}

func (s *SubmitFrontSignRequest) SetMerchantIdNumber(v string) *SubmitFrontSignRequest {
	s.MerchantIdNumber = &v
	return s
}

func (s *SubmitFrontSignRequest) SetMerchantLegalName(v string) *SubmitFrontSignRequest {
	s.MerchantLegalName = &v
	return s
}

func (s *SubmitFrontSignRequest) SetMerchantLegalIdNumber(v string) *SubmitFrontSignRequest {
	s.MerchantLegalIdNumber = &v
	return s
}

func (s *SubmitFrontSignRequest) SetThirdSigner(v string) *SubmitFrontSignRequest {
	s.ThirdSigner = &v
	return s
}

type SubmitFrontSignResponse struct {
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

func (s SubmitFrontSignResponse) String() string {
	return tea.Prettify(s)
}

func (s SubmitFrontSignResponse) GoString() string {
	return s.String()
}

func (s *SubmitFrontSignResponse) SetReqMsgId(v string) *SubmitFrontSignResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SubmitFrontSignResponse) SetResultCode(v string) *SubmitFrontSignResponse {
	s.ResultCode = &v
	return s
}

func (s *SubmitFrontSignResponse) SetResultMsg(v string) *SubmitFrontSignResponse {
	s.ResultMsg = &v
	return s
}

func (s *SubmitFrontSignResponse) SetSignNo(v string) *SubmitFrontSignResponse {
	s.SignNo = &v
	return s
}

func (s *SubmitFrontSignResponse) SetFlowId(v string) *SubmitFrontSignResponse {
	s.FlowId = &v
	return s
}

func (s *SubmitFrontSignResponse) SetAccountId(v string) *SubmitFrontSignResponse {
	s.AccountId = &v
	return s
}

func (s *SubmitFrontSignResponse) SetSignInfo(v string) *SubmitFrontSignResponse {
	s.SignInfo = &v
	return s
}

type UploadSignFlowRequest struct {
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
	// 合同签署时间，格式为yyyy-MM-dd HH:mm:ss
	SignTime *string `json:"sign_time,omitempty" xml:"sign_time,omitempty" require:"true"`
	// 上传的pdf文件，需要以.pdf后缀结尾
	// 待上传文件
	FileObject io.Reader `json:"fileObject,omitempty" xml:"fileObject,omitempty"`
	// 待上传文件名
	FileObjectName *string `json:"fileObjectName,omitempty" xml:"fileObjectName,omitempty"`
	FileId         *string `json:"file_id,omitempty" xml:"file_id,omitempty" require:"true"`
}

func (s UploadSignFlowRequest) String() string {
	return tea.Prettify(s)
}

func (s UploadSignFlowRequest) GoString() string {
	return s.String()
}

func (s *UploadSignFlowRequest) SetAuthToken(v string) *UploadSignFlowRequest {
	s.AuthToken = &v
	return s
}

func (s *UploadSignFlowRequest) SetProductInstanceId(v string) *UploadSignFlowRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UploadSignFlowRequest) SetMerchantId(v string) *UploadSignFlowRequest {
	s.MerchantId = &v
	return s
}

func (s *UploadSignFlowRequest) SetOrderId(v string) *UploadSignFlowRequest {
	s.OrderId = &v
	return s
}

func (s *UploadSignFlowRequest) SetSignNo(v string) *UploadSignFlowRequest {
	s.SignNo = &v
	return s
}

func (s *UploadSignFlowRequest) SetTemplateId(v string) *UploadSignFlowRequest {
	s.TemplateId = &v
	return s
}

func (s *UploadSignFlowRequest) SetSignTime(v string) *UploadSignFlowRequest {
	s.SignTime = &v
	return s
}

func (s *UploadSignFlowRequest) SetFileObject(v io.Reader) *UploadSignFlowRequest {
	s.FileObject = v
	return s
}

func (s *UploadSignFlowRequest) SetFileObjectName(v string) *UploadSignFlowRequest {
	s.FileObjectName = &v
	return s
}

func (s *UploadSignFlowRequest) SetFileId(v string) *UploadSignFlowRequest {
	s.FileId = &v
	return s
}

type UploadSignFlowResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 文件编号
	FileItemNo *string `json:"file_item_no,omitempty" xml:"file_item_no,omitempty"`
}

func (s UploadSignFlowResponse) String() string {
	return tea.Prettify(s)
}

func (s UploadSignFlowResponse) GoString() string {
	return s.String()
}

func (s *UploadSignFlowResponse) SetReqMsgId(v string) *UploadSignFlowResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UploadSignFlowResponse) SetResultCode(v string) *UploadSignFlowResponse {
	s.ResultCode = &v
	return s
}

func (s *UploadSignFlowResponse) SetResultMsg(v string) *UploadSignFlowResponse {
	s.ResultMsg = &v
	return s
}

func (s *UploadSignFlowResponse) SetFileItemNo(v string) *UploadSignFlowResponse {
	s.FileItemNo = &v
	return s
}

type SyncTradeRequest struct {
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

func (s SyncTradeRequest) String() string {
	return tea.Prettify(s)
}

func (s SyncTradeRequest) GoString() string {
	return s.String()
}

func (s *SyncTradeRequest) SetAuthToken(v string) *SyncTradeRequest {
	s.AuthToken = &v
	return s
}

func (s *SyncTradeRequest) SetProductInstanceId(v string) *SyncTradeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SyncTradeRequest) SetBizContent(v string) *SyncTradeRequest {
	s.BizContent = &v
	return s
}

func (s *SyncTradeRequest) SetType(v string) *SyncTradeRequest {
	s.Type = &v
	return s
}

type SyncTradeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// resp信息
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s SyncTradeResponse) String() string {
	return tea.Prettify(s)
}

func (s SyncTradeResponse) GoString() string {
	return s.String()
}

func (s *SyncTradeResponse) SetReqMsgId(v string) *SyncTradeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SyncTradeResponse) SetResultCode(v string) *SyncTradeResponse {
	s.ResultCode = &v
	return s
}

func (s *SyncTradeResponse) SetResultMsg(v string) *SyncTradeResponse {
	s.ResultMsg = &v
	return s
}

func (s *SyncTradeResponse) SetResponseData(v string) *SyncTradeResponse {
	s.ResponseData = &v
	return s
}

type GetTradeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 查询信息，必须遵循json字符串格式
	BizContent *string `json:"biz_content,omitempty" xml:"biz_content,omitempty" require:"true"`
	// 接口类型
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
}

func (s GetTradeRequest) String() string {
	return tea.Prettify(s)
}

func (s GetTradeRequest) GoString() string {
	return s.String()
}

func (s *GetTradeRequest) SetAuthToken(v string) *GetTradeRequest {
	s.AuthToken = &v
	return s
}

func (s *GetTradeRequest) SetProductInstanceId(v string) *GetTradeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetTradeRequest) SetBizContent(v string) *GetTradeRequest {
	s.BizContent = &v
	return s
}

func (s *GetTradeRequest) SetType(v string) *GetTradeRequest {
	s.Type = &v
	return s
}

type GetTradeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回的查询值
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s GetTradeResponse) String() string {
	return tea.Prettify(s)
}

func (s GetTradeResponse) GoString() string {
	return s.String()
}

func (s *GetTradeResponse) SetReqMsgId(v string) *GetTradeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetTradeResponse) SetResultCode(v string) *GetTradeResponse {
	s.ResultCode = &v
	return s
}

func (s *GetTradeResponse) SetResultMsg(v string) *GetTradeResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetTradeResponse) SetResponseData(v string) *GetTradeResponse {
	s.ResponseData = &v
	return s
}

type SyncFrontTradeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 类型
	// 1. orderFullInfo ， 订单所有信息同步
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// json.toString
	BizContent *string `json:"biz_content,omitempty" xml:"biz_content,omitempty" require:"true"`
}

func (s SyncFrontTradeRequest) String() string {
	return tea.Prettify(s)
}

func (s SyncFrontTradeRequest) GoString() string {
	return s.String()
}

func (s *SyncFrontTradeRequest) SetAuthToken(v string) *SyncFrontTradeRequest {
	s.AuthToken = &v
	return s
}

func (s *SyncFrontTradeRequest) SetProductInstanceId(v string) *SyncFrontTradeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SyncFrontTradeRequest) SetType(v string) *SyncFrontTradeRequest {
	s.Type = &v
	return s
}

func (s *SyncFrontTradeRequest) SetBizContent(v string) *SyncFrontTradeRequest {
	s.BizContent = &v
	return s
}

type SyncFrontTradeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回信息
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s SyncFrontTradeResponse) String() string {
	return tea.Prettify(s)
}

func (s SyncFrontTradeResponse) GoString() string {
	return s.String()
}

func (s *SyncFrontTradeResponse) SetReqMsgId(v string) *SyncFrontTradeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SyncFrontTradeResponse) SetResultCode(v string) *SyncFrontTradeResponse {
	s.ResultCode = &v
	return s
}

func (s *SyncFrontTradeResponse) SetResultMsg(v string) *SyncFrontTradeResponse {
	s.ResultMsg = &v
	return s
}

func (s *SyncFrontTradeResponse) SetResponseData(v string) *SyncFrontTradeResponse {
	s.ResponseData = &v
	return s
}

type SyncTradeFinanceloanapplyRequest struct {
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

func (s SyncTradeFinanceloanapplyRequest) String() string {
	return tea.Prettify(s)
}

func (s SyncTradeFinanceloanapplyRequest) GoString() string {
	return s.String()
}

func (s *SyncTradeFinanceloanapplyRequest) SetAuthToken(v string) *SyncTradeFinanceloanapplyRequest {
	s.AuthToken = &v
	return s
}

func (s *SyncTradeFinanceloanapplyRequest) SetProductInstanceId(v string) *SyncTradeFinanceloanapplyRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SyncTradeFinanceloanapplyRequest) SetOrderId(v string) *SyncTradeFinanceloanapplyRequest {
	s.OrderId = &v
	return s
}

func (s *SyncTradeFinanceloanapplyRequest) SetMerchantId(v string) *SyncTradeFinanceloanapplyRequest {
	s.MerchantId = &v
	return s
}

func (s *SyncTradeFinanceloanapplyRequest) SetMerchantName(v string) *SyncTradeFinanceloanapplyRequest {
	s.MerchantName = &v
	return s
}

type SyncTradeFinanceloanapplyResponse struct {
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

func (s SyncTradeFinanceloanapplyResponse) String() string {
	return tea.Prettify(s)
}

func (s SyncTradeFinanceloanapplyResponse) GoString() string {
	return s.String()
}

func (s *SyncTradeFinanceloanapplyResponse) SetReqMsgId(v string) *SyncTradeFinanceloanapplyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SyncTradeFinanceloanapplyResponse) SetResultCode(v string) *SyncTradeFinanceloanapplyResponse {
	s.ResultCode = &v
	return s
}

func (s *SyncTradeFinanceloanapplyResponse) SetResultMsg(v string) *SyncTradeFinanceloanapplyResponse {
	s.ResultMsg = &v
	return s
}

func (s *SyncTradeFinanceloanapplyResponse) SetOrderId(v string) *SyncTradeFinanceloanapplyResponse {
	s.OrderId = &v
	return s
}

func (s *SyncTradeFinanceloanapplyResponse) SetMerchantId(v string) *SyncTradeFinanceloanapplyResponse {
	s.MerchantId = &v
	return s
}

type GetTradeMerchantfulfillmentRequest struct {
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

func (s GetTradeMerchantfulfillmentRequest) String() string {
	return tea.Prettify(s)
}

func (s GetTradeMerchantfulfillmentRequest) GoString() string {
	return s.String()
}

func (s *GetTradeMerchantfulfillmentRequest) SetAuthToken(v string) *GetTradeMerchantfulfillmentRequest {
	s.AuthToken = &v
	return s
}

func (s *GetTradeMerchantfulfillmentRequest) SetProductInstanceId(v string) *GetTradeMerchantfulfillmentRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetTradeMerchantfulfillmentRequest) SetOrderId(v string) *GetTradeMerchantfulfillmentRequest {
	s.OrderId = &v
	return s
}

func (s *GetTradeMerchantfulfillmentRequest) SetMerchantId(v string) *GetTradeMerchantfulfillmentRequest {
	s.MerchantId = &v
	return s
}

func (s *GetTradeMerchantfulfillmentRequest) SetTermIdx(v int64) *GetTradeMerchantfulfillmentRequest {
	s.TermIdx = &v
	return s
}

type GetTradeMerchantfulfillmentResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回值为 「MerchantFulfillmentResp」的json字符串
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s GetTradeMerchantfulfillmentResponse) String() string {
	return tea.Prettify(s)
}

func (s GetTradeMerchantfulfillmentResponse) GoString() string {
	return s.String()
}

func (s *GetTradeMerchantfulfillmentResponse) SetReqMsgId(v string) *GetTradeMerchantfulfillmentResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetTradeMerchantfulfillmentResponse) SetResultCode(v string) *GetTradeMerchantfulfillmentResponse {
	s.ResultCode = &v
	return s
}

func (s *GetTradeMerchantfulfillmentResponse) SetResultMsg(v string) *GetTradeMerchantfulfillmentResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetTradeMerchantfulfillmentResponse) SetResponseData(v string) *GetTradeMerchantfulfillmentResponse {
	s.ResponseData = &v
	return s
}

type GetTradeUserperformanceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"50" minLength:"1"`
	// 商家公司社会信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true" maxLength:"64" minLength:"1"`
}

func (s GetTradeUserperformanceRequest) String() string {
	return tea.Prettify(s)
}

func (s GetTradeUserperformanceRequest) GoString() string {
	return s.String()
}

func (s *GetTradeUserperformanceRequest) SetAuthToken(v string) *GetTradeUserperformanceRequest {
	s.AuthToken = &v
	return s
}

func (s *GetTradeUserperformanceRequest) SetProductInstanceId(v string) *GetTradeUserperformanceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetTradeUserperformanceRequest) SetOrderId(v string) *GetTradeUserperformanceRequest {
	s.OrderId = &v
	return s
}

func (s *GetTradeUserperformanceRequest) SetMerchantId(v string) *GetTradeUserperformanceRequest {
	s.MerchantId = &v
	return s
}

type GetTradeUserperformanceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 「UserPerformanceInfo」的json字符串
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s GetTradeUserperformanceResponse) String() string {
	return tea.Prettify(s)
}

func (s GetTradeUserperformanceResponse) GoString() string {
	return s.String()
}

func (s *GetTradeUserperformanceResponse) SetReqMsgId(v string) *GetTradeUserperformanceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetTradeUserperformanceResponse) SetResultCode(v string) *GetTradeUserperformanceResponse {
	s.ResultCode = &v
	return s
}

func (s *GetTradeUserperformanceResponse) SetResultMsg(v string) *GetTradeUserperformanceResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetTradeUserperformanceResponse) SetResponseData(v string) *GetTradeUserperformanceResponse {
	s.ResponseData = &v
	return s
}

type GetTradeMerchantperformanceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"50" minLength:"1"`
	// 订单所属商户的社会信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true" maxLength:"64" minLength:"1"`
}

func (s GetTradeMerchantperformanceRequest) String() string {
	return tea.Prettify(s)
}

func (s GetTradeMerchantperformanceRequest) GoString() string {
	return s.String()
}

func (s *GetTradeMerchantperformanceRequest) SetAuthToken(v string) *GetTradeMerchantperformanceRequest {
	s.AuthToken = &v
	return s
}

func (s *GetTradeMerchantperformanceRequest) SetProductInstanceId(v string) *GetTradeMerchantperformanceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetTradeMerchantperformanceRequest) SetOrderId(v string) *GetTradeMerchantperformanceRequest {
	s.OrderId = &v
	return s
}

func (s *GetTradeMerchantperformanceRequest) SetMerchantId(v string) *GetTradeMerchantperformanceRequest {
	s.MerchantId = &v
	return s
}

type GetTradeMerchantperformanceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 「MerchantPerformanceInfo」的json字符串
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s GetTradeMerchantperformanceResponse) String() string {
	return tea.Prettify(s)
}

func (s GetTradeMerchantperformanceResponse) GoString() string {
	return s.String()
}

func (s *GetTradeMerchantperformanceResponse) SetReqMsgId(v string) *GetTradeMerchantperformanceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetTradeMerchantperformanceResponse) SetResultCode(v string) *GetTradeMerchantperformanceResponse {
	s.ResultCode = &v
	return s
}

func (s *GetTradeMerchantperformanceResponse) SetResultMsg(v string) *GetTradeMerchantperformanceResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetTradeMerchantperformanceResponse) SetResponseData(v string) *GetTradeMerchantperformanceResponse {
	s.ResponseData = &v
	return s
}

type CreateWithholdSignRequest struct {
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

func (s CreateWithholdSignRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateWithholdSignRequest) GoString() string {
	return s.String()
}

func (s *CreateWithholdSignRequest) SetAuthToken(v string) *CreateWithholdSignRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateWithholdSignRequest) SetProductInstanceId(v string) *CreateWithholdSignRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateWithholdSignRequest) SetOrderId(v string) *CreateWithholdSignRequest {
	s.OrderId = &v
	return s
}

func (s *CreateWithholdSignRequest) SetAlipayMerchantId(v string) *CreateWithholdSignRequest {
	s.AlipayMerchantId = &v
	return s
}

func (s *CreateWithholdSignRequest) SetAlipayMerchantName(v string) *CreateWithholdSignRequest {
	s.AlipayMerchantName = &v
	return s
}

func (s *CreateWithholdSignRequest) SetAlipayMerchantServiceName(v string) *CreateWithholdSignRequest {
	s.AlipayMerchantServiceName = &v
	return s
}

func (s *CreateWithholdSignRequest) SetAlipayMerchantServiceDescription(v string) *CreateWithholdSignRequest {
	s.AlipayMerchantServiceDescription = &v
	return s
}

type CreateWithholdSignResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 签约字符串
	SignStr *string `json:"sign_str,omitempty" xml:"sign_str,omitempty"`
}

func (s CreateWithholdSignResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateWithholdSignResponse) GoString() string {
	return s.String()
}

func (s *CreateWithholdSignResponse) SetReqMsgId(v string) *CreateWithholdSignResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateWithholdSignResponse) SetResultCode(v string) *CreateWithholdSignResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateWithholdSignResponse) SetResultMsg(v string) *CreateWithholdSignResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateWithholdSignResponse) SetSignStr(v string) *CreateWithholdSignResponse {
	s.SignStr = &v
	return s
}

type QueryWithholdSignRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单id 长度不可超过50
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"50"`
}

func (s QueryWithholdSignRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryWithholdSignRequest) GoString() string {
	return s.String()
}

func (s *QueryWithholdSignRequest) SetAuthToken(v string) *QueryWithholdSignRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryWithholdSignRequest) SetProductInstanceId(v string) *QueryWithholdSignRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryWithholdSignRequest) SetOrderId(v string) *QueryWithholdSignRequest {
	s.OrderId = &v
	return s
}

type QueryWithholdSignResponse struct {
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

func (s QueryWithholdSignResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryWithholdSignResponse) GoString() string {
	return s.String()
}

func (s *QueryWithholdSignResponse) SetReqMsgId(v string) *QueryWithholdSignResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryWithholdSignResponse) SetResultCode(v string) *QueryWithholdSignResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryWithholdSignResponse) SetResultMsg(v string) *QueryWithholdSignResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryWithholdSignResponse) SetStatus(v string) *QueryWithholdSignResponse {
	s.Status = &v
	return s
}

func (s *QueryWithholdSignResponse) SetSignTime(v string) *QueryWithholdSignResponse {
	s.SignTime = &v
	return s
}

func (s *QueryWithholdSignResponse) SetValidTime(v string) *QueryWithholdSignResponse {
	s.ValidTime = &v
	return s
}

func (s *QueryWithholdSignResponse) SetInvalidTime(v string) *QueryWithholdSignResponse {
	s.InvalidTime = &v
	return s
}

type UnbindWithholdSignRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单id 长度不可超过50
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"50"`
}

func (s UnbindWithholdSignRequest) String() string {
	return tea.Prettify(s)
}

func (s UnbindWithholdSignRequest) GoString() string {
	return s.String()
}

func (s *UnbindWithholdSignRequest) SetAuthToken(v string) *UnbindWithholdSignRequest {
	s.AuthToken = &v
	return s
}

func (s *UnbindWithholdSignRequest) SetProductInstanceId(v string) *UnbindWithholdSignRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UnbindWithholdSignRequest) SetOrderId(v string) *UnbindWithholdSignRequest {
	s.OrderId = &v
	return s
}

type UnbindWithholdSignResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s UnbindWithholdSignResponse) String() string {
	return tea.Prettify(s)
}

func (s UnbindWithholdSignResponse) GoString() string {
	return s.String()
}

func (s *UnbindWithholdSignResponse) SetReqMsgId(v string) *UnbindWithholdSignResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UnbindWithholdSignResponse) SetResultCode(v string) *UnbindWithholdSignResponse {
	s.ResultCode = &v
	return s
}

func (s *UnbindWithholdSignResponse) SetResultMsg(v string) *UnbindWithholdSignResponse {
	s.ResultMsg = &v
	return s
}

type CancelWithholdPlanRequest struct {
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

func (s CancelWithholdPlanRequest) String() string {
	return tea.Prettify(s)
}

func (s CancelWithholdPlanRequest) GoString() string {
	return s.String()
}

func (s *CancelWithholdPlanRequest) SetAuthToken(v string) *CancelWithholdPlanRequest {
	s.AuthToken = &v
	return s
}

func (s *CancelWithholdPlanRequest) SetProductInstanceId(v string) *CancelWithholdPlanRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CancelWithholdPlanRequest) SetOrderId(v string) *CancelWithholdPlanRequest {
	s.OrderId = &v
	return s
}

func (s *CancelWithholdPlanRequest) SetCancelReason(v string) *CancelWithholdPlanRequest {
	s.CancelReason = &v
	return s
}

type CancelWithholdPlanResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CancelWithholdPlanResponse) String() string {
	return tea.Prettify(s)
}

func (s CancelWithholdPlanResponse) GoString() string {
	return s.String()
}

func (s *CancelWithholdPlanResponse) SetReqMsgId(v string) *CancelWithholdPlanResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CancelWithholdPlanResponse) SetResultCode(v string) *CancelWithholdPlanResponse {
	s.ResultCode = &v
	return s
}

func (s *CancelWithholdPlanResponse) SetResultMsg(v string) *CancelWithholdPlanResponse {
	s.ResultMsg = &v
	return s
}

type RepayWithholdPlanRequest struct {
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

func (s RepayWithholdPlanRequest) String() string {
	return tea.Prettify(s)
}

func (s RepayWithholdPlanRequest) GoString() string {
	return s.String()
}

func (s *RepayWithholdPlanRequest) SetAuthToken(v string) *RepayWithholdPlanRequest {
	s.AuthToken = &v
	return s
}

func (s *RepayWithholdPlanRequest) SetProductInstanceId(v string) *RepayWithholdPlanRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *RepayWithholdPlanRequest) SetOrderId(v string) *RepayWithholdPlanRequest {
	s.OrderId = &v
	return s
}

func (s *RepayWithholdPlanRequest) SetPeriodNum(v int64) *RepayWithholdPlanRequest {
	s.PeriodNum = &v
	return s
}

func (s *RepayWithholdPlanRequest) SetGmtPay(v string) *RepayWithholdPlanRequest {
	s.GmtPay = &v
	return s
}

func (s *RepayWithholdPlanRequest) SetPayOffAmount(v int64) *RepayWithholdPlanRequest {
	s.PayOffAmount = &v
	return s
}

func (s *RepayWithholdPlanRequest) SetPayOffType(v string) *RepayWithholdPlanRequest {
	s.PayOffType = &v
	return s
}

func (s *RepayWithholdPlanRequest) SetPayOffNo(v string) *RepayWithholdPlanRequest {
	s.PayOffNo = &v
	return s
}

func (s *RepayWithholdPlanRequest) SetPayOffBankName(v string) *RepayWithholdPlanRequest {
	s.PayOffBankName = &v
	return s
}

type RepayWithholdPlanResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s RepayWithholdPlanResponse) String() string {
	return tea.Prettify(s)
}

func (s RepayWithholdPlanResponse) GoString() string {
	return s.String()
}

func (s *RepayWithholdPlanResponse) SetReqMsgId(v string) *RepayWithholdPlanResponse {
	s.ReqMsgId = &v
	return s
}

func (s *RepayWithholdPlanResponse) SetResultCode(v string) *RepayWithholdPlanResponse {
	s.ResultCode = &v
	return s
}

func (s *RepayWithholdPlanResponse) SetResultMsg(v string) *RepayWithholdPlanResponse {
	s.ResultMsg = &v
	return s
}

type RetryWithholdPlanRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单id 长度不可超过50
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"50"`
	// 第几期
	PeriodNum *int64 `json:"period_num,omitempty" xml:"period_num,omitempty" require:"true" minimum:"1"`
}

func (s RetryWithholdPlanRequest) String() string {
	return tea.Prettify(s)
}

func (s RetryWithholdPlanRequest) GoString() string {
	return s.String()
}

func (s *RetryWithholdPlanRequest) SetAuthToken(v string) *RetryWithholdPlanRequest {
	s.AuthToken = &v
	return s
}

func (s *RetryWithholdPlanRequest) SetProductInstanceId(v string) *RetryWithholdPlanRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *RetryWithholdPlanRequest) SetOrderId(v string) *RetryWithholdPlanRequest {
	s.OrderId = &v
	return s
}

func (s *RetryWithholdPlanRequest) SetPeriodNum(v int64) *RetryWithholdPlanRequest {
	s.PeriodNum = &v
	return s
}

type RetryWithholdPlanResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s RetryWithholdPlanResponse) String() string {
	return tea.Prettify(s)
}

func (s RetryWithholdPlanResponse) GoString() string {
	return s.String()
}

func (s *RetryWithholdPlanResponse) SetReqMsgId(v string) *RetryWithholdPlanResponse {
	s.ReqMsgId = &v
	return s
}

func (s *RetryWithholdPlanResponse) SetResultCode(v string) *RetryWithholdPlanResponse {
	s.ResultCode = &v
	return s
}

func (s *RetryWithholdPlanResponse) SetResultMsg(v string) *RetryWithholdPlanResponse {
	s.ResultMsg = &v
	return s
}

type ConfirmWithholdSignasyncunsignRequest struct {
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

func (s ConfirmWithholdSignasyncunsignRequest) String() string {
	return tea.Prettify(s)
}

func (s ConfirmWithholdSignasyncunsignRequest) GoString() string {
	return s.String()
}

func (s *ConfirmWithholdSignasyncunsignRequest) SetAuthToken(v string) *ConfirmWithholdSignasyncunsignRequest {
	s.AuthToken = &v
	return s
}

func (s *ConfirmWithholdSignasyncunsignRequest) SetProductInstanceId(v string) *ConfirmWithholdSignasyncunsignRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ConfirmWithholdSignasyncunsignRequest) SetOrderId(v string) *ConfirmWithholdSignasyncunsignRequest {
	s.OrderId = &v
	return s
}

func (s *ConfirmWithholdSignasyncunsignRequest) SetOperate(v string) *ConfirmWithholdSignasyncunsignRequest {
	s.Operate = &v
	return s
}

func (s *ConfirmWithholdSignasyncunsignRequest) SetRefuseReasonCode(v string) *ConfirmWithholdSignasyncunsignRequest {
	s.RefuseReasonCode = &v
	return s
}

func (s *ConfirmWithholdSignasyncunsignRequest) SetUserOweMoney(v int64) *ConfirmWithholdSignasyncunsignRequest {
	s.UserOweMoney = &v
	return s
}

func (s *ConfirmWithholdSignasyncunsignRequest) SetUserInService(v string) *ConfirmWithholdSignasyncunsignRequest {
	s.UserInService = &v
	return s
}

type ConfirmWithholdSignasyncunsignResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s ConfirmWithholdSignasyncunsignResponse) String() string {
	return tea.Prettify(s)
}

func (s ConfirmWithholdSignasyncunsignResponse) GoString() string {
	return s.String()
}

func (s *ConfirmWithholdSignasyncunsignResponse) SetReqMsgId(v string) *ConfirmWithholdSignasyncunsignResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ConfirmWithholdSignasyncunsignResponse) SetResultCode(v string) *ConfirmWithholdSignasyncunsignResponse {
	s.ResultCode = &v
	return s
}

func (s *ConfirmWithholdSignasyncunsignResponse) SetResultMsg(v string) *ConfirmWithholdSignasyncunsignResponse {
	s.ResultMsg = &v
	return s
}

type CreateWithholdActivepayRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单id 长度不可超过50
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true" maxLength:"50"`
	// 第几期
	PeriodNum *int64 `json:"period_num,omitempty" xml:"period_num,omitempty" require:"true" minimum:"1"`
}

func (s CreateWithholdActivepayRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateWithholdActivepayRequest) GoString() string {
	return s.String()
}

func (s *CreateWithholdActivepayRequest) SetAuthToken(v string) *CreateWithholdActivepayRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateWithholdActivepayRequest) SetProductInstanceId(v string) *CreateWithholdActivepayRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateWithholdActivepayRequest) SetOrderId(v string) *CreateWithholdActivepayRequest {
	s.OrderId = &v
	return s
}

func (s *CreateWithholdActivepayRequest) SetPeriodNum(v int64) *CreateWithholdActivepayRequest {
	s.PeriodNum = &v
	return s
}

type CreateWithholdActivepayResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 支付宝支付订单号，用于拉起主动支付页面
	TradeNo *string `json:"trade_no,omitempty" xml:"trade_no,omitempty"`
}

func (s CreateWithholdActivepayResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateWithholdActivepayResponse) GoString() string {
	return s.String()
}

func (s *CreateWithholdActivepayResponse) SetReqMsgId(v string) *CreateWithholdActivepayResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateWithholdActivepayResponse) SetResultCode(v string) *CreateWithholdActivepayResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateWithholdActivepayResponse) SetResultMsg(v string) *CreateWithholdActivepayResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateWithholdActivepayResponse) SetTradeNo(v string) *CreateWithholdActivepayResponse {
	s.TradeNo = &v
	return s
}

type QueryWithholdActivepayRequest struct {
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

func (s QueryWithholdActivepayRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryWithholdActivepayRequest) GoString() string {
	return s.String()
}

func (s *QueryWithholdActivepayRequest) SetAuthToken(v string) *QueryWithholdActivepayRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryWithholdActivepayRequest) SetProductInstanceId(v string) *QueryWithholdActivepayRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryWithholdActivepayRequest) SetOrderId(v string) *QueryWithholdActivepayRequest {
	s.OrderId = &v
	return s
}

func (s *QueryWithholdActivepayRequest) SetPeriodNum(v int64) *QueryWithholdActivepayRequest {
	s.PeriodNum = &v
	return s
}

func (s *QueryWithholdActivepayRequest) SetTradeNo(v string) *QueryWithholdActivepayRequest {
	s.TradeNo = &v
	return s
}

type QueryWithholdActivepayResponse struct {
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

func (s QueryWithholdActivepayResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryWithholdActivepayResponse) GoString() string {
	return s.String()
}

func (s *QueryWithholdActivepayResponse) SetReqMsgId(v string) *QueryWithholdActivepayResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryWithholdActivepayResponse) SetResultCode(v string) *QueryWithholdActivepayResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryWithholdActivepayResponse) SetResultMsg(v string) *QueryWithholdActivepayResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryWithholdActivepayResponse) SetCurrentOrder(v *ActivePayOrder) *QueryWithholdActivepayResponse {
	s.CurrentOrder = v
	return s
}

func (s *QueryWithholdActivepayResponse) SetOrders(v []*ActivePayOrder) *QueryWithholdActivepayResponse {
	s.Orders = v
	return s
}

type CancelWithholdActivepayRequest struct {
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

func (s CancelWithholdActivepayRequest) String() string {
	return tea.Prettify(s)
}

func (s CancelWithholdActivepayRequest) GoString() string {
	return s.String()
}

func (s *CancelWithholdActivepayRequest) SetAuthToken(v string) *CancelWithholdActivepayRequest {
	s.AuthToken = &v
	return s
}

func (s *CancelWithholdActivepayRequest) SetProductInstanceId(v string) *CancelWithholdActivepayRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CancelWithholdActivepayRequest) SetOrderId(v string) *CancelWithholdActivepayRequest {
	s.OrderId = &v
	return s
}

func (s *CancelWithholdActivepayRequest) SetPeriodNum(v int64) *CancelWithholdActivepayRequest {
	s.PeriodNum = &v
	return s
}

func (s *CancelWithholdActivepayRequest) SetTradeNo(v string) *CancelWithholdActivepayRequest {
	s.TradeNo = &v
	return s
}

type CancelWithholdActivepayResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 取消的单号
	TradeNo *string `json:"trade_no,omitempty" xml:"trade_no,omitempty"`
}

func (s CancelWithholdActivepayResponse) String() string {
	return tea.Prettify(s)
}

func (s CancelWithholdActivepayResponse) GoString() string {
	return s.String()
}

func (s *CancelWithholdActivepayResponse) SetReqMsgId(v string) *CancelWithholdActivepayResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CancelWithholdActivepayResponse) SetResultCode(v string) *CancelWithholdActivepayResponse {
	s.ResultCode = &v
	return s
}

func (s *CancelWithholdActivepayResponse) SetResultMsg(v string) *CancelWithholdActivepayResponse {
	s.ResultMsg = &v
	return s
}

func (s *CancelWithholdActivepayResponse) SetTradeNo(v string) *CancelWithholdActivepayResponse {
	s.TradeNo = &v
	return s
}

type CreateWithholdRefundRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
	// 第几期
	// 针对用户履约的第几期进行退款申请
	PeriodNum *int64 `json:"period_num,omitempty" xml:"period_num,omitempty" require:"true" minimum:"1"`
	// 外部系统传入的退款请求号
	RefundRequestNo *string `json:"refund_request_no,omitempty" xml:"refund_request_no,omitempty" require:"true" maxLength:"128" minLength:"1"`
	// 本次请求的退款金额，单位为分
	// 1234=12.34元
	RefundMoney *int64 `json:"refund_money,omitempty" xml:"refund_money,omitempty" require:"true" minimum:"1"`
	// 退款原因
	RefundReason *string `json:"refund_reason,omitempty" xml:"refund_reason,omitempty" maxLength:"200"`
}

func (s CreateWithholdRefundRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateWithholdRefundRequest) GoString() string {
	return s.String()
}

func (s *CreateWithholdRefundRequest) SetAuthToken(v string) *CreateWithholdRefundRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateWithholdRefundRequest) SetProductInstanceId(v string) *CreateWithholdRefundRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateWithholdRefundRequest) SetOrderId(v string) *CreateWithholdRefundRequest {
	s.OrderId = &v
	return s
}

func (s *CreateWithholdRefundRequest) SetPeriodNum(v int64) *CreateWithholdRefundRequest {
	s.PeriodNum = &v
	return s
}

func (s *CreateWithholdRefundRequest) SetRefundRequestNo(v string) *CreateWithholdRefundRequest {
	s.RefundRequestNo = &v
	return s
}

func (s *CreateWithholdRefundRequest) SetRefundMoney(v int64) *CreateWithholdRefundRequest {
	s.RefundMoney = &v
	return s
}

func (s *CreateWithholdRefundRequest) SetRefundReason(v string) *CreateWithholdRefundRequest {
	s.RefundReason = &v
	return s
}

type CreateWithholdRefundResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 外部系统传入的退款请求号
	RefundRequestNo *string `json:"refund_request_no,omitempty" xml:"refund_request_no,omitempty"`
	// ACCEPT : 受理成功
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 请求支付宝的退款单据号
	RefundOrderNo *string `json:"refund_order_no,omitempty" xml:"refund_order_no,omitempty"`
}

func (s CreateWithholdRefundResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateWithholdRefundResponse) GoString() string {
	return s.String()
}

func (s *CreateWithholdRefundResponse) SetReqMsgId(v string) *CreateWithholdRefundResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateWithholdRefundResponse) SetResultCode(v string) *CreateWithholdRefundResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateWithholdRefundResponse) SetResultMsg(v string) *CreateWithholdRefundResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateWithholdRefundResponse) SetRefundRequestNo(v string) *CreateWithholdRefundResponse {
	s.RefundRequestNo = &v
	return s
}

func (s *CreateWithholdRefundResponse) SetStatus(v string) *CreateWithholdRefundResponse {
	s.Status = &v
	return s
}

func (s *CreateWithholdRefundResponse) SetRefundOrderNo(v string) *CreateWithholdRefundResponse {
	s.RefundOrderNo = &v
	return s
}

type QueryWithholdRefundRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
	// 几期
	// 针对用户履约的第几期进行退款申请
	PeriodNum *int64 `json:"period_num,omitempty" xml:"period_num,omitempty" require:"true" minimum:"1"`
	// 外部系统传入的退款请求号
	RefundRequestNo *string `json:"refund_request_no,omitempty" xml:"refund_request_no,omitempty" require:"true" maxLength:"128" minLength:"1"`
}

func (s QueryWithholdRefundRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryWithholdRefundRequest) GoString() string {
	return s.String()
}

func (s *QueryWithholdRefundRequest) SetAuthToken(v string) *QueryWithholdRefundRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryWithholdRefundRequest) SetProductInstanceId(v string) *QueryWithholdRefundRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryWithholdRefundRequest) SetOrderId(v string) *QueryWithholdRefundRequest {
	s.OrderId = &v
	return s
}

func (s *QueryWithholdRefundRequest) SetPeriodNum(v int64) *QueryWithholdRefundRequest {
	s.PeriodNum = &v
	return s
}

func (s *QueryWithholdRefundRequest) SetRefundRequestNo(v string) *QueryWithholdRefundRequest {
	s.RefundRequestNo = &v
	return s
}

type QueryWithholdRefundResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 外部系统传入的退款请求号
	RefundRequestNo *string `json:"refund_request_no,omitempty" xml:"refund_request_no,omitempty"`
	// 请求支付宝的退款单据号
	RefundOrderNo *string `json:"refund_order_no,omitempty" xml:"refund_order_no,omitempty"`
	// 退款请求状态
	// ● ACCEPT: 受理成功
	// ● PENDING: 需人工介入
	// ● SUCCESS: 成功
	// ● FAILED : 失败
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 退款失败原因
	RefundErrorMsg *string `json:"refund_error_msg,omitempty" xml:"refund_error_msg,omitempty"`
	// 本笔交易总退款金额，单位为分
	// 12300=123元
	TotalRefundAmount *int64 `json:"total_refund_amount,omitempty" xml:"total_refund_amount,omitempty"`
	// 本次退款申请的实际退款金额，单位为分
	// 12300=123元
	SendBackAmount *int64 `json:"send_back_amount,omitempty" xml:"send_back_amount,omitempty"`
	// 实际退款时间,13位时间戳（毫秒）
	GmtRefundPay *int64 `json:"gmt_refund_pay,omitempty" xml:"gmt_refund_pay,omitempty"`
}

func (s QueryWithholdRefundResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryWithholdRefundResponse) GoString() string {
	return s.String()
}

func (s *QueryWithholdRefundResponse) SetReqMsgId(v string) *QueryWithholdRefundResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryWithholdRefundResponse) SetResultCode(v string) *QueryWithholdRefundResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryWithholdRefundResponse) SetResultMsg(v string) *QueryWithholdRefundResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryWithholdRefundResponse) SetRefundRequestNo(v string) *QueryWithholdRefundResponse {
	s.RefundRequestNo = &v
	return s
}

func (s *QueryWithholdRefundResponse) SetRefundOrderNo(v string) *QueryWithholdRefundResponse {
	s.RefundOrderNo = &v
	return s
}

func (s *QueryWithholdRefundResponse) SetStatus(v string) *QueryWithholdRefundResponse {
	s.Status = &v
	return s
}

func (s *QueryWithholdRefundResponse) SetRefundErrorMsg(v string) *QueryWithholdRefundResponse {
	s.RefundErrorMsg = &v
	return s
}

func (s *QueryWithholdRefundResponse) SetTotalRefundAmount(v int64) *QueryWithholdRefundResponse {
	s.TotalRefundAmount = &v
	return s
}

func (s *QueryWithholdRefundResponse) SetSendBackAmount(v int64) *QueryWithholdRefundResponse {
	s.SendBackAmount = &v
	return s
}

func (s *QueryWithholdRefundResponse) SetGmtRefundPay(v int64) *QueryWithholdRefundResponse {
	s.GmtRefundPay = &v
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
				"sdk_version":      tea.String("1.7.14"),
				"_prod_code":       tea.String("ATO"),
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

/**
 * Description: 分账流水同步
 * Summary: 【仅测试环境生效】分账流水同步
 */
func (client *Client) SyncFundSplitting(request *SyncFundSplittingRequest) (_result *SyncFundSplittingResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SyncFundSplittingResponse{}
	_body, _err := client.SyncFundSplittingEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 分账流水同步
 * Summary: 【仅测试环境生效】分账流水同步
 */
func (client *Client) SyncFundSplittingEx(request *SyncFundSplittingRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SyncFundSplittingResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SyncFundSplittingResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.fund.splitting.sync"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 提供给融资资金方，用以订单融资结果同步
 * Summary: 【废弃】订单融资结果同步
 */
func (client *Client) SyncFundOrderfinancial(request *SyncFundOrderfinancialRequest) (_result *SyncFundOrderfinancialResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SyncFundOrderfinancialResponse{}
	_body, _err := client.SyncFundOrderfinancialEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 提供给融资资金方，用以订单融资结果同步
 * Summary: 【废弃】订单融资结果同步
 */
func (client *Client) SyncFundOrderfinancialEx(request *SyncFundOrderfinancialRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SyncFundOrderfinancialResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SyncFundOrderfinancialResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.fund.orderfinancial.sync"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 同步租赁订单的代扣协议
 * Summary: 【仅测试环境生效】同步租赁订单的代扣协议
 */
func (client *Client) SyncFundWithholdingcontract(request *SyncFundWithholdingcontractRequest) (_result *SyncFundWithholdingcontractResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SyncFundWithholdingcontractResponse{}
	_body, _err := client.SyncFundWithholdingcontractEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 同步租赁订单的代扣协议
 * Summary: 【仅测试环境生效】同步租赁订单的代扣协议
 */
func (client *Client) SyncFundWithholdingcontractEx(request *SyncFundWithholdingcontractRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SyncFundWithholdingcontractResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SyncFundWithholdingcontractResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.fund.withholdingcontract.sync"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 资方回传一条订单还款履约信息
 * Summary: 【仅测试环境生效】同步订单还款履约信息
 */
func (client *Client) SyncFundOrderfulfillment(request *SyncFundOrderfulfillmentRequest) (_result *SyncFundOrderfulfillmentResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SyncFundOrderfulfillmentResponse{}
	_body, _err := client.SyncFundOrderfulfillmentEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 资方回传一条订单还款履约信息
 * Summary: 【仅测试环境生效】同步订单还款履约信息
 */
func (client *Client) SyncFundOrderfulfillmentEx(request *SyncFundOrderfulfillmentRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SyncFundOrderfulfillmentResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SyncFundOrderfulfillmentResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.fund.orderfulfillment.sync"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取订单的履约信息
 * Summary: 【仅测试环境生效】获取订单的履约信息
 */
func (client *Client) GetFundOrderfulfillment(request *GetFundOrderfulfillmentRequest) (_result *GetFundOrderfulfillmentResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetFundOrderfulfillmentResponse{}
	_body, _err := client.GetFundOrderfulfillmentEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取订单的履约信息
 * Summary: 【仅测试环境生效】获取订单的履约信息
 */
func (client *Client) GetFundOrderfulfillmentEx(request *GetFundOrderfulfillmentRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetFundOrderfulfillmentResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetFundOrderfulfillmentResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.fund.orderfulfillment.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) UploadFundFlow(request *UploadFundFlowRequest) (_result *UploadFundFlowResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UploadFundFlowResponse{}
	_body, _err := client.UploadFundFlowEx(request, headers, runtime)
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
func (client *Client) UploadFundFlowEx(request *UploadFundFlowRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UploadFundFlowResponse, _err error) {
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
			uploadFundFlowResponse := &UploadFundFlowResponse{
				ReqMsgId:   uploadResp.ReqMsgId,
				ResultCode: uploadResp.ResultCode,
				ResultMsg:  uploadResp.ResultMsg,
			}
			_result = uploadFundFlowResponse
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
	_result = &UploadFundFlowResponse{}
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
func (client *Client) GetFundFlow(request *GetFundFlowRequest) (_result *GetFundFlowResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetFundFlowResponse{}
	_body, _err := client.GetFundFlowEx(request, headers, runtime)
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
func (client *Client) GetFundFlowEx(request *GetFundFlowRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetFundFlowResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetFundFlowResponse{}
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
func (client *Client) RefuseFundFlow(request *RefuseFundFlowRequest) (_result *RefuseFundFlowResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &RefuseFundFlowResponse{}
	_body, _err := client.RefuseFundFlowEx(request, headers, runtime)
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
func (client *Client) RefuseFundFlowEx(request *RefuseFundFlowRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *RefuseFundFlowResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &RefuseFundFlowResponse{}
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
func (client *Client) AuthFundFlow(request *AuthFundFlowRequest) (_result *AuthFundFlowResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AuthFundFlowResponse{}
	_body, _err := client.AuthFundFlowEx(request, headers, runtime)
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
func (client *Client) AuthFundFlowEx(request *AuthFundFlowRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AuthFundFlowResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AuthFundFlowResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.fund.flow.auth"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) CancelFundPlan(request *CancelFundPlanRequest) (_result *CancelFundPlanResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CancelFundPlanResponse{}
	_body, _err := client.CancelFundPlanEx(request, headers, runtime)
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
func (client *Client) CancelFundPlanEx(request *CancelFundPlanRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CancelFundPlanResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CancelFundPlanResponse{}
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
func (client *Client) CallbackFundNotify(request *CallbackFundNotifyRequest) (_result *CallbackFundNotifyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CallbackFundNotifyResponse{}
	_body, _err := client.CallbackFundNotifyEx(request, headers, runtime)
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
func (client *Client) CallbackFundNotifyEx(request *CallbackFundNotifyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CallbackFundNotifyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CallbackFundNotifyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.fund.notify.callback"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) SyncFundMerchantpromise(request *SyncFundMerchantpromiseRequest) (_result *SyncFundMerchantpromiseResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SyncFundMerchantpromiseResponse{}
	_body, _err := client.SyncFundMerchantpromiseEx(request, headers, runtime)
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
func (client *Client) SyncFundMerchantpromiseEx(request *SyncFundMerchantpromiseRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SyncFundMerchantpromiseResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SyncFundMerchantpromiseResponse{}
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
func (client *Client) SyncFundFinanceloanresults(request *SyncFundFinanceloanresultsRequest) (_result *SyncFundFinanceloanresultsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SyncFundFinanceloanresultsResponse{}
	_body, _err := client.SyncFundFinanceloanresultsEx(request, headers, runtime)
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
func (client *Client) SyncFundFinanceloanresultsEx(request *SyncFundFinanceloanresultsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SyncFundFinanceloanresultsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SyncFundFinanceloanresultsResponse{}
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
func (client *Client) GetFundUserpromise(request *GetFundUserpromiseRequest) (_result *GetFundUserpromiseResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetFundUserpromiseResponse{}
	_body, _err := client.GetFundUserpromiseEx(request, headers, runtime)
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
func (client *Client) GetFundUserpromiseEx(request *GetFundUserpromiseRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetFundUserpromiseResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetFundUserpromiseResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.fund.userpromise.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) GetFundUserperformance(request *GetFundUserperformanceRequest) (_result *GetFundUserperformanceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetFundUserperformanceResponse{}
	_body, _err := client.GetFundUserperformanceEx(request, headers, runtime)
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
func (client *Client) GetFundUserperformanceEx(request *GetFundUserperformanceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetFundUserperformanceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetFundUserperformanceResponse{}
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
func (client *Client) GetFundMerchantperformance(request *GetFundMerchantperformanceRequest) (_result *GetFundMerchantperformanceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetFundMerchantperformanceResponse{}
	_body, _err := client.GetFundMerchantperformanceEx(request, headers, runtime)
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
func (client *Client) GetFundMerchantperformanceEx(request *GetFundMerchantperformanceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetFundMerchantperformanceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetFundMerchantperformanceResponse{}
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
func (client *Client) GetFundOrderfullinfo(request *GetFundOrderfullinfoRequest) (_result *GetFundOrderfullinfoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetFundOrderfullinfoResponse{}
	_body, _err := client.GetFundOrderfullinfoEx(request, headers, runtime)
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
func (client *Client) GetFundOrderfullinfoEx(request *GetFundOrderfullinfoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetFundOrderfullinfoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetFundOrderfullinfoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.fund.orderfullinfo.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) CreateRealpersonFacevrf(request *CreateRealpersonFacevrfRequest) (_result *CreateRealpersonFacevrfResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateRealpersonFacevrfResponse{}
	_body, _err := client.CreateRealpersonFacevrfEx(request, headers, runtime)
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
func (client *Client) CreateRealpersonFacevrfEx(request *CreateRealpersonFacevrfRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateRealpersonFacevrfResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateRealpersonFacevrfResponse{}
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
func (client *Client) QueryRealpersonFacevrf(request *QueryRealpersonFacevrfRequest) (_result *QueryRealpersonFacevrfResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryRealpersonFacevrfResponse{}
	_body, _err := client.QueryRealpersonFacevrfEx(request, headers, runtime)
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
func (client *Client) QueryRealpersonFacevrfEx(request *QueryRealpersonFacevrfRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryRealpersonFacevrfResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryRealpersonFacevrfResponse{}
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
func (client *Client) AllSignTemplate(request *AllSignTemplateRequest) (_result *AllSignTemplateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AllSignTemplateResponse{}
	_body, _err := client.AllSignTemplateEx(request, headers, runtime)
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
func (client *Client) AllSignTemplateEx(request *AllSignTemplateRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AllSignTemplateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AllSignTemplateResponse{}
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
func (client *Client) SubmitSignFlow(request *SubmitSignFlowRequest) (_result *SubmitSignFlowResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SubmitSignFlowResponse{}
	_body, _err := client.SubmitSignFlowEx(request, headers, runtime)
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
func (client *Client) SubmitSignFlowEx(request *SubmitSignFlowRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SubmitSignFlowResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SubmitSignFlowResponse{}
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
func (client *Client) GetSignFlow(request *GetSignFlowRequest) (_result *GetSignFlowResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetSignFlowResponse{}
	_body, _err := client.GetSignFlowEx(request, headers, runtime)
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
func (client *Client) GetSignFlowEx(request *GetSignFlowRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetSignFlowResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetSignFlowResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.sign.flow.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) AuthSignFlow(request *AuthSignFlowRequest) (_result *AuthSignFlowResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AuthSignFlowResponse{}
	_body, _err := client.AuthSignFlowEx(request, headers, runtime)
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
func (client *Client) AuthSignFlowEx(request *AuthSignFlowRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AuthSignFlowResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AuthSignFlowResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.sign.flow.auth"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) SubmitFrontSign(request *SubmitFrontSignRequest) (_result *SubmitFrontSignResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SubmitFrontSignResponse{}
	_body, _err := client.SubmitFrontSignEx(request, headers, runtime)
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
func (client *Client) SubmitFrontSignEx(request *SubmitFrontSignRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SubmitFrontSignResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SubmitFrontSignResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.front.sign.submit"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) UploadSignFlow(request *UploadSignFlowRequest) (_result *UploadSignFlowResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UploadSignFlowResponse{}
	_body, _err := client.UploadSignFlowEx(request, headers, runtime)
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
func (client *Client) UploadSignFlowEx(request *UploadSignFlowRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UploadSignFlowResponse, _err error) {
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
			uploadSignFlowResponse := &UploadSignFlowResponse{
				ReqMsgId:   uploadResp.ReqMsgId,
				ResultCode: uploadResp.ResultCode,
				ResultMsg:  uploadResp.ResultMsg,
			}
			_result = uploadSignFlowResponse
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
	_result = &UploadSignFlowResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.sign.flow.upload"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 对账saas交易信息同步接口
 * Summary: 对账saas交易信息同步接口
 */
func (client *Client) SyncTrade(request *SyncTradeRequest) (_result *SyncTradeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SyncTradeResponse{}
	_body, _err := client.SyncTradeEx(request, headers, runtime)
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
func (client *Client) SyncTradeEx(request *SyncTradeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SyncTradeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SyncTradeResponse{}
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
func (client *Client) GetTrade(request *GetTradeRequest) (_result *GetTradeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetTradeResponse{}
	_body, _err := client.GetTradeEx(request, headers, runtime)
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
func (client *Client) GetTradeEx(request *GetTradeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetTradeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetTradeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.trade.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) SyncFrontTrade(request *SyncFrontTradeRequest) (_result *SyncFrontTradeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SyncFrontTradeResponse{}
	_body, _err := client.SyncFrontTradeEx(request, headers, runtime)
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
func (client *Client) SyncFrontTradeEx(request *SyncFrontTradeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SyncFrontTradeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SyncFrontTradeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.front.trade.sync"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) SyncTradeFinanceloanapply(request *SyncTradeFinanceloanapplyRequest) (_result *SyncTradeFinanceloanapplyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SyncTradeFinanceloanapplyResponse{}
	_body, _err := client.SyncTradeFinanceloanapplyEx(request, headers, runtime)
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
func (client *Client) SyncTradeFinanceloanapplyEx(request *SyncTradeFinanceloanapplyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SyncTradeFinanceloanapplyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SyncTradeFinanceloanapplyResponse{}
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
func (client *Client) GetTradeMerchantfulfillment(request *GetTradeMerchantfulfillmentRequest) (_result *GetTradeMerchantfulfillmentResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetTradeMerchantfulfillmentResponse{}
	_body, _err := client.GetTradeMerchantfulfillmentEx(request, headers, runtime)
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
func (client *Client) GetTradeMerchantfulfillmentEx(request *GetTradeMerchantfulfillmentRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetTradeMerchantfulfillmentResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetTradeMerchantfulfillmentResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.trade.merchantfulfillment.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) GetTradeUserperformance(request *GetTradeUserperformanceRequest) (_result *GetTradeUserperformanceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetTradeUserperformanceResponse{}
	_body, _err := client.GetTradeUserperformanceEx(request, headers, runtime)
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
func (client *Client) GetTradeUserperformanceEx(request *GetTradeUserperformanceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetTradeUserperformanceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetTradeUserperformanceResponse{}
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
func (client *Client) GetTradeMerchantperformance(request *GetTradeMerchantperformanceRequest) (_result *GetTradeMerchantperformanceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetTradeMerchantperformanceResponse{}
	_body, _err := client.GetTradeMerchantperformanceEx(request, headers, runtime)
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
func (client *Client) GetTradeMerchantperformanceEx(request *GetTradeMerchantperformanceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetTradeMerchantperformanceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetTradeMerchantperformanceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.trade.merchantperformance.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) CreateWithholdSign(request *CreateWithholdSignRequest) (_result *CreateWithholdSignResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateWithholdSignResponse{}
	_body, _err := client.CreateWithholdSignEx(request, headers, runtime)
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
func (client *Client) CreateWithholdSignEx(request *CreateWithholdSignRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateWithholdSignResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateWithholdSignResponse{}
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
func (client *Client) QueryWithholdSign(request *QueryWithholdSignRequest) (_result *QueryWithholdSignResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryWithholdSignResponse{}
	_body, _err := client.QueryWithholdSignEx(request, headers, runtime)
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
func (client *Client) QueryWithholdSignEx(request *QueryWithholdSignRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryWithholdSignResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryWithholdSignResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.withhold.sign.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) UnbindWithholdSign(request *UnbindWithholdSignRequest) (_result *UnbindWithholdSignResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UnbindWithholdSignResponse{}
	_body, _err := client.UnbindWithholdSignEx(request, headers, runtime)
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
func (client *Client) UnbindWithholdSignEx(request *UnbindWithholdSignRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UnbindWithholdSignResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UnbindWithholdSignResponse{}
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
func (client *Client) CancelWithholdPlan(request *CancelWithholdPlanRequest) (_result *CancelWithholdPlanResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CancelWithholdPlanResponse{}
	_body, _err := client.CancelWithholdPlanEx(request, headers, runtime)
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
func (client *Client) CancelWithholdPlanEx(request *CancelWithholdPlanRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CancelWithholdPlanResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CancelWithholdPlanResponse{}
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
func (client *Client) RepayWithholdPlan(request *RepayWithholdPlanRequest) (_result *RepayWithholdPlanResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &RepayWithholdPlanResponse{}
	_body, _err := client.RepayWithholdPlanEx(request, headers, runtime)
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
func (client *Client) RepayWithholdPlanEx(request *RepayWithholdPlanRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *RepayWithholdPlanResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &RepayWithholdPlanResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.withhold.plan.repay"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) RetryWithholdPlan(request *RetryWithholdPlanRequest) (_result *RetryWithholdPlanResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &RetryWithholdPlanResponse{}
	_body, _err := client.RetryWithholdPlanEx(request, headers, runtime)
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
func (client *Client) RetryWithholdPlanEx(request *RetryWithholdPlanRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *RetryWithholdPlanResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &RetryWithholdPlanResponse{}
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
func (client *Client) ConfirmWithholdSignasyncunsign(request *ConfirmWithholdSignasyncunsignRequest) (_result *ConfirmWithholdSignasyncunsignResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ConfirmWithholdSignasyncunsignResponse{}
	_body, _err := client.ConfirmWithholdSignasyncunsignEx(request, headers, runtime)
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
func (client *Client) ConfirmWithholdSignasyncunsignEx(request *ConfirmWithholdSignasyncunsignRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ConfirmWithholdSignasyncunsignResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ConfirmWithholdSignasyncunsignResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.withhold.signasyncunsign.confirm"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
func (client *Client) CreateWithholdActivepay(request *CreateWithholdActivepayRequest) (_result *CreateWithholdActivepayResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateWithholdActivepayResponse{}
	_body, _err := client.CreateWithholdActivepayEx(request, headers, runtime)
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
func (client *Client) CreateWithholdActivepayEx(request *CreateWithholdActivepayRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateWithholdActivepayResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateWithholdActivepayResponse{}
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
func (client *Client) QueryWithholdActivepay(request *QueryWithholdActivepayRequest) (_result *QueryWithholdActivepayResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryWithholdActivepayResponse{}
	_body, _err := client.QueryWithholdActivepayEx(request, headers, runtime)
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
func (client *Client) QueryWithholdActivepayEx(request *QueryWithholdActivepayRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryWithholdActivepayResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryWithholdActivepayResponse{}
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
func (client *Client) CancelWithholdActivepay(request *CancelWithholdActivepayRequest) (_result *CancelWithholdActivepayResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CancelWithholdActivepayResponse{}
	_body, _err := client.CancelWithholdActivepayEx(request, headers, runtime)
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
func (client *Client) CancelWithholdActivepayEx(request *CancelWithholdActivepayRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CancelWithholdActivepayResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CancelWithholdActivepayResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.withhold.activepay.cancel"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建退款请求
 * Summary: 创建退款申请
 */
func (client *Client) CreateWithholdRefund(request *CreateWithholdRefundRequest) (_result *CreateWithholdRefundResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateWithholdRefundResponse{}
	_body, _err := client.CreateWithholdRefundEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建退款请求
 * Summary: 创建退款申请
 */
func (client *Client) CreateWithholdRefundEx(request *CreateWithholdRefundRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateWithholdRefundResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateWithholdRefundResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.withhold.refund.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 退款申请结果查询
 * Summary: 退款申请结果查询
 */
func (client *Client) QueryWithholdRefund(request *QueryWithholdRefundRequest) (_result *QueryWithholdRefundResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryWithholdRefundResponse{}
	_body, _err := client.QueryWithholdRefundEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 退款申请结果查询
 * Summary: 退款申请结果查询
 */
func (client *Client) QueryWithholdRefundEx(request *QueryWithholdRefundRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryWithholdRefundResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryWithholdRefundResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.withhold.refund.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
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
