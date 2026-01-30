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

type SyncAntchainAtoFundSplittingRequest struct {
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

func (s SyncAntchainAtoFundSplittingRequest) String() string {
	return tea.Prettify(s)
}

func (s SyncAntchainAtoFundSplittingRequest) GoString() string {
	return s.String()
}

func (s *SyncAntchainAtoFundSplittingRequest) SetAuthToken(v string) *SyncAntchainAtoFundSplittingRequest {
	s.AuthToken = &v
	return s
}

func (s *SyncAntchainAtoFundSplittingRequest) SetProductInstanceId(v string) *SyncAntchainAtoFundSplittingRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SyncAntchainAtoFundSplittingRequest) SetFundNo(v string) *SyncAntchainAtoFundSplittingRequest {
	s.FundNo = &v
	return s
}

func (s *SyncAntchainAtoFundSplittingRequest) SetOrderId(v string) *SyncAntchainAtoFundSplittingRequest {
	s.OrderId = &v
	return s
}

func (s *SyncAntchainAtoFundSplittingRequest) SetMerchantTenantId(v string) *SyncAntchainAtoFundSplittingRequest {
	s.MerchantTenantId = &v
	return s
}

func (s *SyncAntchainAtoFundSplittingRequest) SetTermNum(v int64) *SyncAntchainAtoFundSplittingRequest {
	s.TermNum = &v
	return s
}

func (s *SyncAntchainAtoFundSplittingRequest) SetDeductionTime(v string) *SyncAntchainAtoFundSplittingRequest {
	s.DeductionTime = &v
	return s
}

func (s *SyncAntchainAtoFundSplittingRequest) SetDeductionAmount(v int64) *SyncAntchainAtoFundSplittingRequest {
	s.DeductionAmount = &v
	return s
}

func (s *SyncAntchainAtoFundSplittingRequest) SetMerchantSplitAmount(v int64) *SyncAntchainAtoFundSplittingRequest {
	s.MerchantSplitAmount = &v
	return s
}

func (s *SyncAntchainAtoFundSplittingRequest) SetFundSplitAmount(v int64) *SyncAntchainAtoFundSplittingRequest {
	s.FundSplitAmount = &v
	return s
}

func (s *SyncAntchainAtoFundSplittingRequest) SetOtherSplitInfo(v string) *SyncAntchainAtoFundSplittingRequest {
	s.OtherSplitInfo = &v
	return s
}

type SyncAntchainAtoFundSplittingResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 流水同步描述信息
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s SyncAntchainAtoFundSplittingResponse) String() string {
	return tea.Prettify(s)
}

func (s SyncAntchainAtoFundSplittingResponse) GoString() string {
	return s.String()
}

func (s *SyncAntchainAtoFundSplittingResponse) SetReqMsgId(v string) *SyncAntchainAtoFundSplittingResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SyncAntchainAtoFundSplittingResponse) SetResultCode(v string) *SyncAntchainAtoFundSplittingResponse {
	s.ResultCode = &v
	return s
}

func (s *SyncAntchainAtoFundSplittingResponse) SetResultMsg(v string) *SyncAntchainAtoFundSplittingResponse {
	s.ResultMsg = &v
	return s
}

func (s *SyncAntchainAtoFundSplittingResponse) SetResponseData(v string) *SyncAntchainAtoFundSplittingResponse {
	s.ResponseData = &v
	return s
}

type SyncAntchainAtoFundOrderfinancialRequest struct {
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

func (s SyncAntchainAtoFundOrderfinancialRequest) String() string {
	return tea.Prettify(s)
}

func (s SyncAntchainAtoFundOrderfinancialRequest) GoString() string {
	return s.String()
}

func (s *SyncAntchainAtoFundOrderfinancialRequest) SetAuthToken(v string) *SyncAntchainAtoFundOrderfinancialRequest {
	s.AuthToken = &v
	return s
}

func (s *SyncAntchainAtoFundOrderfinancialRequest) SetProductInstanceId(v string) *SyncAntchainAtoFundOrderfinancialRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SyncAntchainAtoFundOrderfinancialRequest) SetOrderId(v string) *SyncAntchainAtoFundOrderfinancialRequest {
	s.OrderId = &v
	return s
}

func (s *SyncAntchainAtoFundOrderfinancialRequest) SetMerchantTenantId(v string) *SyncAntchainAtoFundOrderfinancialRequest {
	s.MerchantTenantId = &v
	return s
}

func (s *SyncAntchainAtoFundOrderfinancialRequest) SetApplicationId(v string) *SyncAntchainAtoFundOrderfinancialRequest {
	s.ApplicationId = &v
	return s
}

func (s *SyncAntchainAtoFundOrderfinancialRequest) SetStatus(v int64) *SyncAntchainAtoFundOrderfinancialRequest {
	s.Status = &v
	return s
}

func (s *SyncAntchainAtoFundOrderfinancialRequest) SetReason(v string) *SyncAntchainAtoFundOrderfinancialRequest {
	s.Reason = &v
	return s
}

func (s *SyncAntchainAtoFundOrderfinancialRequest) SetExtras(v string) *SyncAntchainAtoFundOrderfinancialRequest {
	s.Extras = &v
	return s
}

type SyncAntchainAtoFundOrderfinancialResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 结果描述信息
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s SyncAntchainAtoFundOrderfinancialResponse) String() string {
	return tea.Prettify(s)
}

func (s SyncAntchainAtoFundOrderfinancialResponse) GoString() string {
	return s.String()
}

func (s *SyncAntchainAtoFundOrderfinancialResponse) SetReqMsgId(v string) *SyncAntchainAtoFundOrderfinancialResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SyncAntchainAtoFundOrderfinancialResponse) SetResultCode(v string) *SyncAntchainAtoFundOrderfinancialResponse {
	s.ResultCode = &v
	return s
}

func (s *SyncAntchainAtoFundOrderfinancialResponse) SetResultMsg(v string) *SyncAntchainAtoFundOrderfinancialResponse {
	s.ResultMsg = &v
	return s
}

func (s *SyncAntchainAtoFundOrderfinancialResponse) SetResponseData(v string) *SyncAntchainAtoFundOrderfinancialResponse {
	s.ResponseData = &v
	return s
}

type SyncAntchainAtoFundWithholdingcontractRequest struct {
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

func (s SyncAntchainAtoFundWithholdingcontractRequest) String() string {
	return tea.Prettify(s)
}

func (s SyncAntchainAtoFundWithholdingcontractRequest) GoString() string {
	return s.String()
}

func (s *SyncAntchainAtoFundWithholdingcontractRequest) SetAuthToken(v string) *SyncAntchainAtoFundWithholdingcontractRequest {
	s.AuthToken = &v
	return s
}

func (s *SyncAntchainAtoFundWithholdingcontractRequest) SetProductInstanceId(v string) *SyncAntchainAtoFundWithholdingcontractRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SyncAntchainAtoFundWithholdingcontractRequest) SetOrderId(v string) *SyncAntchainAtoFundWithholdingcontractRequest {
	s.OrderId = &v
	return s
}

func (s *SyncAntchainAtoFundWithholdingcontractRequest) SetMerchantTenantId(v string) *SyncAntchainAtoFundWithholdingcontractRequest {
	s.MerchantTenantId = &v
	return s
}

func (s *SyncAntchainAtoFundWithholdingcontractRequest) SetWithholdingContractId(v string) *SyncAntchainAtoFundWithholdingcontractRequest {
	s.WithholdingContractId = &v
	return s
}

func (s *SyncAntchainAtoFundWithholdingcontractRequest) SetExtraInfo(v string) *SyncAntchainAtoFundWithholdingcontractRequest {
	s.ExtraInfo = &v
	return s
}

func (s *SyncAntchainAtoFundWithholdingcontractRequest) SetStatus(v string) *SyncAntchainAtoFundWithholdingcontractRequest {
	s.Status = &v
	return s
}

type SyncAntchainAtoFundWithholdingcontractResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 存储成功
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s SyncAntchainAtoFundWithholdingcontractResponse) String() string {
	return tea.Prettify(s)
}

func (s SyncAntchainAtoFundWithholdingcontractResponse) GoString() string {
	return s.String()
}

func (s *SyncAntchainAtoFundWithholdingcontractResponse) SetReqMsgId(v string) *SyncAntchainAtoFundWithholdingcontractResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SyncAntchainAtoFundWithholdingcontractResponse) SetResultCode(v string) *SyncAntchainAtoFundWithholdingcontractResponse {
	s.ResultCode = &v
	return s
}

func (s *SyncAntchainAtoFundWithholdingcontractResponse) SetResultMsg(v string) *SyncAntchainAtoFundWithholdingcontractResponse {
	s.ResultMsg = &v
	return s
}

func (s *SyncAntchainAtoFundWithholdingcontractResponse) SetResponseData(v string) *SyncAntchainAtoFundWithholdingcontractResponse {
	s.ResponseData = &v
	return s
}

type SyncAntchainAtoFundOrderfulfillmentRequest struct {
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

func (s SyncAntchainAtoFundOrderfulfillmentRequest) String() string {
	return tea.Prettify(s)
}

func (s SyncAntchainAtoFundOrderfulfillmentRequest) GoString() string {
	return s.String()
}

func (s *SyncAntchainAtoFundOrderfulfillmentRequest) SetAuthToken(v string) *SyncAntchainAtoFundOrderfulfillmentRequest {
	s.AuthToken = &v
	return s
}

func (s *SyncAntchainAtoFundOrderfulfillmentRequest) SetProductInstanceId(v string) *SyncAntchainAtoFundOrderfulfillmentRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SyncAntchainAtoFundOrderfulfillmentRequest) SetMerchantTenantId(v string) *SyncAntchainAtoFundOrderfulfillmentRequest {
	s.MerchantTenantId = &v
	return s
}

func (s *SyncAntchainAtoFundOrderfulfillmentRequest) SetOrderId(v string) *SyncAntchainAtoFundOrderfulfillmentRequest {
	s.OrderId = &v
	return s
}

func (s *SyncAntchainAtoFundOrderfulfillmentRequest) SetLeaseTermIndex(v int64) *SyncAntchainAtoFundOrderfulfillmentRequest {
	s.LeaseTermIndex = &v
	return s
}

func (s *SyncAntchainAtoFundOrderfulfillmentRequest) SetRemainTerm(v int64) *SyncAntchainAtoFundOrderfulfillmentRequest {
	s.RemainTerm = &v
	return s
}

func (s *SyncAntchainAtoFundOrderfulfillmentRequest) SetTotalTerm(v int64) *SyncAntchainAtoFundOrderfulfillmentRequest {
	s.TotalTerm = &v
	return s
}

func (s *SyncAntchainAtoFundOrderfulfillmentRequest) SetRentalReturnState(v string) *SyncAntchainAtoFundOrderfulfillmentRequest {
	s.RentalReturnState = &v
	return s
}

func (s *SyncAntchainAtoFundOrderfulfillmentRequest) SetRentalMoney(v int64) *SyncAntchainAtoFundOrderfulfillmentRequest {
	s.RentalMoney = &v
	return s
}

func (s *SyncAntchainAtoFundOrderfulfillmentRequest) SetPenaltyFeeMoney(v int64) *SyncAntchainAtoFundOrderfulfillmentRequest {
	s.PenaltyFeeMoney = &v
	return s
}

func (s *SyncAntchainAtoFundOrderfulfillmentRequest) SetTotalMoney(v int64) *SyncAntchainAtoFundOrderfulfillmentRequest {
	s.TotalMoney = &v
	return s
}

func (s *SyncAntchainAtoFundOrderfulfillmentRequest) SetReturnTime(v string) *SyncAntchainAtoFundOrderfulfillmentRequest {
	s.ReturnTime = &v
	return s
}

func (s *SyncAntchainAtoFundOrderfulfillmentRequest) SetReturnWay(v string) *SyncAntchainAtoFundOrderfulfillmentRequest {
	s.ReturnWay = &v
	return s
}

func (s *SyncAntchainAtoFundOrderfulfillmentRequest) SetReturnVoucherSerial(v string) *SyncAntchainAtoFundOrderfulfillmentRequest {
	s.ReturnVoucherSerial = &v
	return s
}

func (s *SyncAntchainAtoFundOrderfulfillmentRequest) SetBankName(v string) *SyncAntchainAtoFundOrderfulfillmentRequest {
	s.BankName = &v
	return s
}

type SyncAntchainAtoFundOrderfulfillmentResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 添加成功
	ResponseData *string `json:"response_data,omitempty" xml:"response_data,omitempty"`
}

func (s SyncAntchainAtoFundOrderfulfillmentResponse) String() string {
	return tea.Prettify(s)
}

func (s SyncAntchainAtoFundOrderfulfillmentResponse) GoString() string {
	return s.String()
}

func (s *SyncAntchainAtoFundOrderfulfillmentResponse) SetReqMsgId(v string) *SyncAntchainAtoFundOrderfulfillmentResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SyncAntchainAtoFundOrderfulfillmentResponse) SetResultCode(v string) *SyncAntchainAtoFundOrderfulfillmentResponse {
	s.ResultCode = &v
	return s
}

func (s *SyncAntchainAtoFundOrderfulfillmentResponse) SetResultMsg(v string) *SyncAntchainAtoFundOrderfulfillmentResponse {
	s.ResultMsg = &v
	return s
}

func (s *SyncAntchainAtoFundOrderfulfillmentResponse) SetResponseData(v string) *SyncAntchainAtoFundOrderfulfillmentResponse {
	s.ResponseData = &v
	return s
}

type GetAntchainAtoFundOrderfulfillmentRequest struct {
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

func (s GetAntchainAtoFundOrderfulfillmentRequest) String() string {
	return tea.Prettify(s)
}

func (s GetAntchainAtoFundOrderfulfillmentRequest) GoString() string {
	return s.String()
}

func (s *GetAntchainAtoFundOrderfulfillmentRequest) SetAuthToken(v string) *GetAntchainAtoFundOrderfulfillmentRequest {
	s.AuthToken = &v
	return s
}

func (s *GetAntchainAtoFundOrderfulfillmentRequest) SetProductInstanceId(v string) *GetAntchainAtoFundOrderfulfillmentRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetAntchainAtoFundOrderfulfillmentRequest) SetOrderId(v string) *GetAntchainAtoFundOrderfulfillmentRequest {
	s.OrderId = &v
	return s
}

func (s *GetAntchainAtoFundOrderfulfillmentRequest) SetMerchantTenantId(v string) *GetAntchainAtoFundOrderfulfillmentRequest {
	s.MerchantTenantId = &v
	return s
}

func (s *GetAntchainAtoFundOrderfulfillmentRequest) SetTermIdx(v int64) *GetAntchainAtoFundOrderfulfillmentRequest {
	s.TermIdx = &v
	return s
}

type GetAntchainAtoFundOrderfulfillmentResponse struct {
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

func (s GetAntchainAtoFundOrderfulfillmentResponse) String() string {
	return tea.Prettify(s)
}

func (s GetAntchainAtoFundOrderfulfillmentResponse) GoString() string {
	return s.String()
}

func (s *GetAntchainAtoFundOrderfulfillmentResponse) SetReqMsgId(v string) *GetAntchainAtoFundOrderfulfillmentResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetAntchainAtoFundOrderfulfillmentResponse) SetResultCode(v string) *GetAntchainAtoFundOrderfulfillmentResponse {
	s.ResultCode = &v
	return s
}

func (s *GetAntchainAtoFundOrderfulfillmentResponse) SetResultMsg(v string) *GetAntchainAtoFundOrderfulfillmentResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetAntchainAtoFundOrderfulfillmentResponse) SetOrderFulfillmentDataList(v string) *GetAntchainAtoFundOrderfulfillmentResponse {
	s.OrderFulfillmentDataList = &v
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
				"sdk_version":      tea.String("1.1.1"),
				"_prod_code":       tea.String("ak_2abe765c32934341bd9bb6cc1c8ff589"),
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
 * Description: 分账流水同步
 * Summary: 【仅测试环境生效】分账流水同步
 */
func (client *Client) SyncAntchainAtoFundSplitting(request *SyncAntchainAtoFundSplittingRequest) (_result *SyncAntchainAtoFundSplittingResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SyncAntchainAtoFundSplittingResponse{}
	_body, _err := client.SyncAntchainAtoFundSplittingEx(request, headers, runtime)
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
func (client *Client) SyncAntchainAtoFundSplittingEx(request *SyncAntchainAtoFundSplittingRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SyncAntchainAtoFundSplittingResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SyncAntchainAtoFundSplittingResponse{}
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
func (client *Client) SyncAntchainAtoFundOrderfinancial(request *SyncAntchainAtoFundOrderfinancialRequest) (_result *SyncAntchainAtoFundOrderfinancialResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SyncAntchainAtoFundOrderfinancialResponse{}
	_body, _err := client.SyncAntchainAtoFundOrderfinancialEx(request, headers, runtime)
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
func (client *Client) SyncAntchainAtoFundOrderfinancialEx(request *SyncAntchainAtoFundOrderfinancialRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SyncAntchainAtoFundOrderfinancialResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SyncAntchainAtoFundOrderfinancialResponse{}
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
func (client *Client) SyncAntchainAtoFundWithholdingcontract(request *SyncAntchainAtoFundWithholdingcontractRequest) (_result *SyncAntchainAtoFundWithholdingcontractResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SyncAntchainAtoFundWithholdingcontractResponse{}
	_body, _err := client.SyncAntchainAtoFundWithholdingcontractEx(request, headers, runtime)
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
func (client *Client) SyncAntchainAtoFundWithholdingcontractEx(request *SyncAntchainAtoFundWithholdingcontractRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SyncAntchainAtoFundWithholdingcontractResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SyncAntchainAtoFundWithholdingcontractResponse{}
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
func (client *Client) SyncAntchainAtoFundOrderfulfillment(request *SyncAntchainAtoFundOrderfulfillmentRequest) (_result *SyncAntchainAtoFundOrderfulfillmentResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SyncAntchainAtoFundOrderfulfillmentResponse{}
	_body, _err := client.SyncAntchainAtoFundOrderfulfillmentEx(request, headers, runtime)
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
func (client *Client) SyncAntchainAtoFundOrderfulfillmentEx(request *SyncAntchainAtoFundOrderfulfillmentRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SyncAntchainAtoFundOrderfulfillmentResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SyncAntchainAtoFundOrderfulfillmentResponse{}
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
func (client *Client) GetAntchainAtoFundOrderfulfillment(request *GetAntchainAtoFundOrderfulfillmentRequest) (_result *GetAntchainAtoFundOrderfulfillmentResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetAntchainAtoFundOrderfulfillmentResponse{}
	_body, _err := client.GetAntchainAtoFundOrderfulfillmentEx(request, headers, runtime)
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
func (client *Client) GetAntchainAtoFundOrderfulfillmentEx(request *GetAntchainAtoFundOrderfulfillmentRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetAntchainAtoFundOrderfulfillmentResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetAntchainAtoFundOrderfulfillmentResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ato.fund.orderfulfillment.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
