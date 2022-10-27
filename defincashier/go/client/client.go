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

// 账号
type AccountVO struct {
	// 账号
	AccountNo *string `json:"account_no,omitempty" xml:"account_no,omitempty" require:"true"`
	// 户名
	AccountName *string `json:"account_name,omitempty" xml:"account_name,omitempty" require:"true"`
	// 开户网点
	OfficalName *string `json:"offical_name,omitempty" xml:"offical_name,omitempty" require:"true"`
	// 联行号
	OfficalNumber *string `json:"offical_number,omitempty" xml:"offical_number,omitempty" require:"true"`
	// 账号状态
	//
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 分类 BUYER付款账户； SELLER收款账户
	Category []*string `json:"category,omitempty" xml:"category,omitempty" type:"Repeated"`
	// 上次支付是否失败
	LastPayFail *bool `json:"last_pay_fail,omitempty" xml:"last_pay_fail,omitempty"`
	// 支付方式 BALANCE余额账户；BILL票据账户
	PayMethod []*string `json:"pay_method,omitempty" xml:"pay_method,omitempty" type:"Repeated"`
	// 账户类型 MAIN 对公账户；ECOLLECTION e收宝
	Type *string `json:"type,omitempty" xml:"type,omitempty"`
}

func (s AccountVO) String() string {
	return tea.Prettify(s)
}

func (s AccountVO) GoString() string {
	return s.String()
}

func (s *AccountVO) SetAccountNo(v string) *AccountVO {
	s.AccountNo = &v
	return s
}

func (s *AccountVO) SetAccountName(v string) *AccountVO {
	s.AccountName = &v
	return s
}

func (s *AccountVO) SetOfficalName(v string) *AccountVO {
	s.OfficalName = &v
	return s
}

func (s *AccountVO) SetOfficalNumber(v string) *AccountVO {
	s.OfficalNumber = &v
	return s
}

func (s *AccountVO) SetStatus(v string) *AccountVO {
	s.Status = &v
	return s
}

func (s *AccountVO) SetCategory(v []*string) *AccountVO {
	s.Category = v
	return s
}

func (s *AccountVO) SetLastPayFail(v bool) *AccountVO {
	s.LastPayFail = &v
	return s
}

func (s *AccountVO) SetPayMethod(v []*string) *AccountVO {
	s.PayMethod = v
	return s
}

func (s *AccountVO) SetType(v string) *AccountVO {
	s.Type = &v
	return s
}

// 账号模型
type AccountDTO struct {
	// 账号
	AccountNo *string `json:"account_no,omitempty" xml:"account_no,omitempty" require:"true"`
	// 户名
	AccountName *string `json:"account_name,omitempty" xml:"account_name,omitempty" require:"true"`
	// 开户网点
	OfficalName *string `json:"offical_name,omitempty" xml:"offical_name,omitempty"`
	// 联行号
	OfficalNumber *string `json:"offical_number,omitempty" xml:"offical_number,omitempty"`
}

func (s AccountDTO) String() string {
	return tea.Prettify(s)
}

func (s AccountDTO) GoString() string {
	return s.String()
}

func (s *AccountDTO) SetAccountNo(v string) *AccountDTO {
	s.AccountNo = &v
	return s
}

func (s *AccountDTO) SetAccountName(v string) *AccountDTO {
	s.AccountName = &v
	return s
}

func (s *AccountDTO) SetOfficalName(v string) *AccountDTO {
	s.OfficalName = &v
	return s
}

func (s *AccountDTO) SetOfficalNumber(v string) *AccountDTO {
	s.OfficalNumber = &v
	return s
}

// 账户查询结果
type AccountQueryResult struct {
	// 外部业务平台会员ID
	OutMemberId *string `json:"out_member_id,omitempty" xml:"out_member_id,omitempty" require:"true"`
	// 账号列表
	Accounts []*AccountVO `json:"accounts,omitempty" xml:"accounts,omitempty" type:"Repeated"`
	// 业务错误码(为空表示成功，否则为业务错误码)
	SubCode *string `json:"sub_code,omitempty" xml:"sub_code,omitempty"`
	// 业务错误描述
	SubMsg *string `json:"sub_msg,omitempty" xml:"sub_msg,omitempty"`
}

func (s AccountQueryResult) String() string {
	return tea.Prettify(s)
}

func (s AccountQueryResult) GoString() string {
	return s.String()
}

func (s *AccountQueryResult) SetOutMemberId(v string) *AccountQueryResult {
	s.OutMemberId = &v
	return s
}

func (s *AccountQueryResult) SetAccounts(v []*AccountVO) *AccountQueryResult {
	s.Accounts = v
	return s
}

func (s *AccountQueryResult) SetSubCode(v string) *AccountQueryResult {
	s.SubCode = &v
	return s
}

func (s *AccountQueryResult) SetSubMsg(v string) *AccountQueryResult {
	s.SubMsg = &v
	return s
}

// 支付请款结果
type PaymentCaptureResult struct {
	// 外部业务平台原始交易号
	OutOrderId *string `json:"out_order_id,omitempty" xml:"out_order_id,omitempty" require:"true"`
	// 描述资金流的模型，通常资金流分为：SALE 销售模；AUTH_CAPTURE 预授权模式；
	//
	FundMode *string `json:"fund_mode,omitempty" xml:"fund_mode,omitempty"`
	// 交易状态。PAYING(支付处理中);PAY_SUCCESS(支付成功);PAY_FAIL(支付失败); CAPTURING(请款中);CAPTURE_SUCCESS(请款成功);CAPTURE_FAIL(请款失败); REFUNDING(退款中);REFUND_SUCCESS(退款成功);REFUND_FAIL(退款失败); CLOSING(关单中);CLOSE_SUCCESS(关单成功);CLOSE_FAIL(关单失败);
	OrderState *string `json:"order_state,omitempty" xml:"order_state,omitempty"`
	// 可用金额，单位为元。可用金额=总金额-已请款金额-已撤销金额。精确到小数点后两位，取值范围[0.01,100000000]
	AvailableAmount *int64 `json:"available_amount,omitempty" xml:"available_amount,omitempty"`
	// 支付币种三位字母编码。（编码规则遵循https://zh.wikipedia.org/wiki/ISO_4217）
	AvailableCurrency *string `json:"available_currency,omitempty" xml:"available_currency,omitempty"`
	// 资金操作状态。PROCESSING(处理中);SUCCESS(成功);FAIL(失败);
	State *string `json:"state,omitempty" xml:"state,omitempty"`
	// 外部请求ID，需要支持部分请款/退款的平台必填
	//
	OutRequestId *string `json:"out_request_id,omitempty" xml:"out_request_id,omitempty"`
	// 业务错误码(为空表示成功，否则为业务错误码)
	SubCode *string `json:"sub_code,omitempty" xml:"sub_code,omitempty"`
	// 业务错误描述
	SubMsg *string `json:"sub_msg,omitempty" xml:"sub_msg,omitempty"`
}

func (s PaymentCaptureResult) String() string {
	return tea.Prettify(s)
}

func (s PaymentCaptureResult) GoString() string {
	return s.String()
}

func (s *PaymentCaptureResult) SetOutOrderId(v string) *PaymentCaptureResult {
	s.OutOrderId = &v
	return s
}

func (s *PaymentCaptureResult) SetFundMode(v string) *PaymentCaptureResult {
	s.FundMode = &v
	return s
}

func (s *PaymentCaptureResult) SetOrderState(v string) *PaymentCaptureResult {
	s.OrderState = &v
	return s
}

func (s *PaymentCaptureResult) SetAvailableAmount(v int64) *PaymentCaptureResult {
	s.AvailableAmount = &v
	return s
}

func (s *PaymentCaptureResult) SetAvailableCurrency(v string) *PaymentCaptureResult {
	s.AvailableCurrency = &v
	return s
}

func (s *PaymentCaptureResult) SetState(v string) *PaymentCaptureResult {
	s.State = &v
	return s
}

func (s *PaymentCaptureResult) SetOutRequestId(v string) *PaymentCaptureResult {
	s.OutRequestId = &v
	return s
}

func (s *PaymentCaptureResult) SetSubCode(v string) *PaymentCaptureResult {
	s.SubCode = &v
	return s
}

func (s *PaymentCaptureResult) SetSubMsg(v string) *PaymentCaptureResult {
	s.SubMsg = &v
	return s
}

// 机构代码查询结果
type InstCodeResult struct {
	// 机构编码
	//
	ChannelMemberCode *string `json:"channel_member_code,omitempty" xml:"channel_member_code,omitempty"`
	// 机构网点联行号
	//
	ChannelOfficialNumber *string `json:"channel_official_number,omitempty" xml:"channel_official_number,omitempty"`
	// 业务错误码(为空表示成功，否则为业务错误码)
	SubCode *string `json:"sub_code,omitempty" xml:"sub_code,omitempty"`
	// 业务错误描述
	SubMsg *string `json:"sub_msg,omitempty" xml:"sub_msg,omitempty"`
}

func (s InstCodeResult) String() string {
	return tea.Prettify(s)
}

func (s InstCodeResult) GoString() string {
	return s.String()
}

func (s *InstCodeResult) SetChannelMemberCode(v string) *InstCodeResult {
	s.ChannelMemberCode = &v
	return s
}

func (s *InstCodeResult) SetChannelOfficialNumber(v string) *InstCodeResult {
	s.ChannelOfficialNumber = &v
	return s
}

func (s *InstCodeResult) SetSubCode(v string) *InstCodeResult {
	s.SubCode = &v
	return s
}

func (s *InstCodeResult) SetSubMsg(v string) *InstCodeResult {
	s.SubMsg = &v
	return s
}

// 创建交易结果
type PaymentCreateResult struct {
	//
	// 会员所属业务平台在智能科技的会员ID
	PlatformMemberId *string `json:"platform_member_id,omitempty" xml:"platform_member_id,omitempty" require:"true"`
	// 付款方在外部业务平台的用户ID
	OutPayerId *string `json:"out_payer_id,omitempty" xml:"out_payer_id,omitempty" require:"true"`
	// 收款方外部业务平台会员ID，收单场景表示卖家，纯资金场景表示收款方
	OutPayeeId *string `json:"out_payee_id,omitempty" xml:"out_payee_id,omitempty"`
	// 外部业务平台原始交易号
	OutOrderId *string `json:"out_order_id,omitempty" xml:"out_order_id,omitempty" require:"true"`
	// 交易状态。PAYING(支付处理中);PAY_SUCCESS(支付成功);PAY_FAIL(支付失败); CAPTURING(请款中);CAPTURE_SUCCESS(请款成功);CAPTURE_FAIL(请款失败); REFUNDING(退款中);REFUND_SUCCESS(退款成功);REFUND_FAIL(退款失败); CLOSING(关单中);CLOSE_SUCCESS(关单成功);CLOSE_FAIL(关单失败);
	OrderState *string `json:"order_state,omitempty" xml:"order_state,omitempty"`
	// 描述资金流的模型，通常资金流分为：SALE 销售模；AUTH_CAPTURE 预授权模式；
	FundMode *string `json:"fund_mode,omitempty" xml:"fund_mode,omitempty"`
	// 收款方账号
	PayeeAccount *AccountDTO `json:"payee_account,omitempty" xml:"payee_account,omitempty"`
	// 业务错误码(为空表示成功，否则为业务错误码)
	SubCode *string `json:"sub_code,omitempty" xml:"sub_code,omitempty"`
	// 业务错误描述
	SubMsg *string `json:"sub_msg,omitempty" xml:"sub_msg,omitempty"`
}

func (s PaymentCreateResult) String() string {
	return tea.Prettify(s)
}

func (s PaymentCreateResult) GoString() string {
	return s.String()
}

func (s *PaymentCreateResult) SetPlatformMemberId(v string) *PaymentCreateResult {
	s.PlatformMemberId = &v
	return s
}

func (s *PaymentCreateResult) SetOutPayerId(v string) *PaymentCreateResult {
	s.OutPayerId = &v
	return s
}

func (s *PaymentCreateResult) SetOutPayeeId(v string) *PaymentCreateResult {
	s.OutPayeeId = &v
	return s
}

func (s *PaymentCreateResult) SetOutOrderId(v string) *PaymentCreateResult {
	s.OutOrderId = &v
	return s
}

func (s *PaymentCreateResult) SetOrderState(v string) *PaymentCreateResult {
	s.OrderState = &v
	return s
}

func (s *PaymentCreateResult) SetFundMode(v string) *PaymentCreateResult {
	s.FundMode = &v
	return s
}

func (s *PaymentCreateResult) SetPayeeAccount(v *AccountDTO) *PaymentCreateResult {
	s.PayeeAccount = v
	return s
}

func (s *PaymentCreateResult) SetSubCode(v string) *PaymentCreateResult {
	s.SubCode = &v
	return s
}

func (s *PaymentCreateResult) SetSubMsg(v string) *PaymentCreateResult {
	s.SubMsg = &v
	return s
}

// 交易查询结果
type PaymentQueryResult struct {
	// 会员所属业务平台在智能科技的会员ID
	PlatformMemberId *string `json:"platform_member_id,omitempty" xml:"platform_member_id,omitempty" require:"true"`
	// 付款方在外部业务平台的用户ID
	OutPayerId *string `json:"out_payer_id,omitempty" xml:"out_payer_id,omitempty" require:"true"`
	// 收款方在外部业务平台的用户ID；收单场景表示卖家，纯资金场景表示收款方
	OutPayeeId *string `json:"out_payee_id,omitempty" xml:"out_payee_id,omitempty"`
	// 外部业务平台原始交易号
	OutOrderId *string `json:"out_order_id,omitempty" xml:"out_order_id,omitempty" require:"true"`
	// 描述资金流的模型，通常资金流分为：SALE 销售模；AUTH_CAPTURE 预授权模式；
	FundMode *string `json:"fund_mode,omitempty" xml:"fund_mode,omitempty"`
	// 交易状态。INIT(初始创建);PAYING(支付处理中);PAY_SUCCESS(支付成功);PAY_FAIL(支付失败); CAPTURING(请款中);CAPTURE_SUCCESS(请款成功);CAPTURE_FAIL(请款失败); REFUNDING(退款中);REFUND_SUCCESS(退款成功);REFUND_FAIL(退款失败); CLOSING(关单中);CLOSE_SUCCESS(关单成功);CLOSE_FAIL(关单失败);PART_PROCESSING(部分处理中);PART_SUCCESS(部分请款部分退款)
	OrderState *string `json:"order_state,omitempty" xml:"order_state,omitempty"`
	// 银行或其他支付服务提供方结果码
	PaymentResultCode *string `json:"payment_result_code,omitempty" xml:"payment_result_code,omitempty"`
	// 银行或其他支付服务提供方支付结果描述
	PaymentResultMessage *string `json:"payment_result_message,omitempty" xml:"payment_result_message,omitempty"`
	// 业务错误码(为空表示成功，否则为业务错误码)
	SubCode *string `json:"sub_code,omitempty" xml:"sub_code,omitempty"`
	// 业务错误描述
	SubMsg *string `json:"sub_msg,omitempty" xml:"sub_msg,omitempty"`
}

func (s PaymentQueryResult) String() string {
	return tea.Prettify(s)
}

func (s PaymentQueryResult) GoString() string {
	return s.String()
}

func (s *PaymentQueryResult) SetPlatformMemberId(v string) *PaymentQueryResult {
	s.PlatformMemberId = &v
	return s
}

func (s *PaymentQueryResult) SetOutPayerId(v string) *PaymentQueryResult {
	s.OutPayerId = &v
	return s
}

func (s *PaymentQueryResult) SetOutPayeeId(v string) *PaymentQueryResult {
	s.OutPayeeId = &v
	return s
}

func (s *PaymentQueryResult) SetOutOrderId(v string) *PaymentQueryResult {
	s.OutOrderId = &v
	return s
}

func (s *PaymentQueryResult) SetFundMode(v string) *PaymentQueryResult {
	s.FundMode = &v
	return s
}

func (s *PaymentQueryResult) SetOrderState(v string) *PaymentQueryResult {
	s.OrderState = &v
	return s
}

func (s *PaymentQueryResult) SetPaymentResultCode(v string) *PaymentQueryResult {
	s.PaymentResultCode = &v
	return s
}

func (s *PaymentQueryResult) SetPaymentResultMessage(v string) *PaymentQueryResult {
	s.PaymentResultMessage = &v
	return s
}

func (s *PaymentQueryResult) SetSubCode(v string) *PaymentQueryResult {
	s.SubCode = &v
	return s
}

func (s *PaymentQueryResult) SetSubMsg(v string) *PaymentQueryResult {
	s.SubMsg = &v
	return s
}

// 客户产品签约结果
type AgreementQueryResult struct {
	// 会员所属业务平台在智能科技的会员ID
	PlatformMemberId *string `json:"platform_member_id,omitempty" xml:"platform_member_id,omitempty" require:"true"`
	// 外部业务平台的用户ID
	OutMemberId *string `json:"out_member_id,omitempty" xml:"out_member_id,omitempty" require:"true"`
	// 签约产品的产品码
	ProductCode *string `json:"product_code,omitempty" xml:"product_code,omitempty"`
	// 签约产品的产品名称
	ProductName *string `json:"product_name,omitempty" xml:"product_name,omitempty"`
	// 签约的产品类型
	//
	ProductType *string `json:"product_type,omitempty" xml:"product_type,omitempty"`
	// 签约时间
	//
	SigningTime *string `json:"signing_time,omitempty" xml:"signing_time,omitempty"`
	// 到期时间
	EndTime *string `json:"end_time,omitempty" xml:"end_time,omitempty"`
	// 是否有效
	//
	ActiveFlag *bool `json:"active_flag,omitempty" xml:"active_flag,omitempty"`
	// 业务错误码(为空表示成功，否则为业务错误码)
	SubCode *string `json:"sub_code,omitempty" xml:"sub_code,omitempty"`
	// 业务错误描述
	SubMsg *string `json:"sub_msg,omitempty" xml:"sub_msg,omitempty"`
}

func (s AgreementQueryResult) String() string {
	return tea.Prettify(s)
}

func (s AgreementQueryResult) GoString() string {
	return s.String()
}

func (s *AgreementQueryResult) SetPlatformMemberId(v string) *AgreementQueryResult {
	s.PlatformMemberId = &v
	return s
}

func (s *AgreementQueryResult) SetOutMemberId(v string) *AgreementQueryResult {
	s.OutMemberId = &v
	return s
}

func (s *AgreementQueryResult) SetProductCode(v string) *AgreementQueryResult {
	s.ProductCode = &v
	return s
}

func (s *AgreementQueryResult) SetProductName(v string) *AgreementQueryResult {
	s.ProductName = &v
	return s
}

func (s *AgreementQueryResult) SetProductType(v string) *AgreementQueryResult {
	s.ProductType = &v
	return s
}

func (s *AgreementQueryResult) SetSigningTime(v string) *AgreementQueryResult {
	s.SigningTime = &v
	return s
}

func (s *AgreementQueryResult) SetEndTime(v string) *AgreementQueryResult {
	s.EndTime = &v
	return s
}

func (s *AgreementQueryResult) SetActiveFlag(v bool) *AgreementQueryResult {
	s.ActiveFlag = &v
	return s
}

func (s *AgreementQueryResult) SetSubCode(v string) *AgreementQueryResult {
	s.SubCode = &v
	return s
}

func (s *AgreementQueryResult) SetSubMsg(v string) *AgreementQueryResult {
	s.SubMsg = &v
	return s
}

// 资金操作明细查询结果
type FundItemQueryResult struct {
	// 会员所属业务平台在智能科技的会员ID
	PlatformMemberId *string `json:"platform_member_id,omitempty" xml:"platform_member_id,omitempty" require:"true"`
	// 外部业务平台原始交易号
	OutOrderId *string `json:"out_order_id,omitempty" xml:"out_order_id,omitempty" require:"true"`
	// 外部请求ID
	//
	OutRequestId *string `json:"out_request_id,omitempty" xml:"out_request_id,omitempty"`
	// 资金操作类型。CAPTURE(请款);CANCEL(撤销/退款);
	FundType *string `json:"fund_type,omitempty" xml:"fund_type,omitempty" require:"true"`
	// 资金操作状态。PROCESSING(处理中);SUCCESS(成功);FAIL(失败);
	State *string `json:"state,omitempty" xml:"state,omitempty"`
	// 本次请求金额，单位为元。
	RequestAmount *int64 `json:"request_amount,omitempty" xml:"request_amount,omitempty"`
	// 支付币种三位字母编码。（编码规则遵循https://zh.wikipedia.org/wiki/ISO_4217）
	RequestCurrency *string `json:"request_currency,omitempty" xml:"request_currency,omitempty"`
	// 业务错误码(为空表示成功，否则为业务错误码)
	SubCode *string `json:"sub_code,omitempty" xml:"sub_code,omitempty"`
	// 业务错误描述
	SubMsg *string `json:"sub_msg,omitempty" xml:"sub_msg,omitempty"`
}

func (s FundItemQueryResult) String() string {
	return tea.Prettify(s)
}

func (s FundItemQueryResult) GoString() string {
	return s.String()
}

func (s *FundItemQueryResult) SetPlatformMemberId(v string) *FundItemQueryResult {
	s.PlatformMemberId = &v
	return s
}

func (s *FundItemQueryResult) SetOutOrderId(v string) *FundItemQueryResult {
	s.OutOrderId = &v
	return s
}

func (s *FundItemQueryResult) SetOutRequestId(v string) *FundItemQueryResult {
	s.OutRequestId = &v
	return s
}

func (s *FundItemQueryResult) SetFundType(v string) *FundItemQueryResult {
	s.FundType = &v
	return s
}

func (s *FundItemQueryResult) SetState(v string) *FundItemQueryResult {
	s.State = &v
	return s
}

func (s *FundItemQueryResult) SetRequestAmount(v int64) *FundItemQueryResult {
	s.RequestAmount = &v
	return s
}

func (s *FundItemQueryResult) SetRequestCurrency(v string) *FundItemQueryResult {
	s.RequestCurrency = &v
	return s
}

func (s *FundItemQueryResult) SetSubCode(v string) *FundItemQueryResult {
	s.SubCode = &v
	return s
}

func (s *FundItemQueryResult) SetSubMsg(v string) *FundItemQueryResult {
	s.SubMsg = &v
	return s
}

// 交易撤销结果
type PaymentCancelResult struct {
	// 外部业务平台原始交易号
	OutOrderId *string `json:"out_order_id,omitempty" xml:"out_order_id,omitempty" require:"true"`
	// 描述资金流的模型，通常资金流分为：SALE 销售模；AUTH_CAPTURE 预授权模式；
	//
	FundMode *string `json:"fund_mode,omitempty" xml:"fund_mode,omitempty"`
	// 交易状态。PAYING(支付处理中);PAY_SUCCESS(支付成功);PAY_FAIL(支付失败); CAPTURING(请款中);CAPTURE_SUCCESS(请款成功);CAPTURE_FAIL(请款失败); REFUNDING(退款中);REFUND_SUCCESS(退款成功);REFUND_FAIL(退款失败); CLOSING(关单中);CLOSE_SUCCESS(关单成功);CLOSE_FAIL(关单失败);
	OrderState *string `json:"order_state,omitempty" xml:"order_state,omitempty"`
	// 可用金额，单位为元。可用金额=总金额-已请款金额-已撤销金额。精确到小数点后两位，取值范围[0.01,100000000]
	AvailableAmount *int64 `json:"available_amount,omitempty" xml:"available_amount,omitempty"`
	// 支付币种三位字母编码。（编码规则遵循https://zh.wikipedia.org/wiki/ISO_4217）
	AvailableCurrency *string `json:"available_currency,omitempty" xml:"available_currency,omitempty"`
	// 资金操作状态。PROCESSING(处理中);SUCCESS(成功);FAIL(失败);
	State *string `json:"state,omitempty" xml:"state,omitempty"`
	// 外部请求ID，需要支持部分请款/退款的平台必填
	//
	OutRequestId *string `json:"out_request_id,omitempty" xml:"out_request_id,omitempty"`
	// 业务错误码(为空表示成功，否则为业务错误码)
	SubCode *string `json:"sub_code,omitempty" xml:"sub_code,omitempty"`
	// 业务错误描述
	SubMsg *string `json:"sub_msg,omitempty" xml:"sub_msg,omitempty"`
}

func (s PaymentCancelResult) String() string {
	return tea.Prettify(s)
}

func (s PaymentCancelResult) GoString() string {
	return s.String()
}

func (s *PaymentCancelResult) SetOutOrderId(v string) *PaymentCancelResult {
	s.OutOrderId = &v
	return s
}

func (s *PaymentCancelResult) SetFundMode(v string) *PaymentCancelResult {
	s.FundMode = &v
	return s
}

func (s *PaymentCancelResult) SetOrderState(v string) *PaymentCancelResult {
	s.OrderState = &v
	return s
}

func (s *PaymentCancelResult) SetAvailableAmount(v int64) *PaymentCancelResult {
	s.AvailableAmount = &v
	return s
}

func (s *PaymentCancelResult) SetAvailableCurrency(v string) *PaymentCancelResult {
	s.AvailableCurrency = &v
	return s
}

func (s *PaymentCancelResult) SetState(v string) *PaymentCancelResult {
	s.State = &v
	return s
}

func (s *PaymentCancelResult) SetOutRequestId(v string) *PaymentCancelResult {
	s.OutRequestId = &v
	return s
}

func (s *PaymentCancelResult) SetSubCode(v string) *PaymentCancelResult {
	s.SubCode = &v
	return s
}

func (s *PaymentCancelResult) SetSubMsg(v string) *PaymentCancelResult {
	s.SubMsg = &v
	return s
}

// 创建交易前检查结果
type PaymentCreateCheckResult struct {
	// 检查是否通过。PASS(检查通过);NOT_PASS(检查不通过)
	Result *string `json:"result,omitempty" xml:"result,omitempty" require:"true"`
	// 业务错误码(为空表示成功，否则为业务错误码)
	SubCode *string `json:"sub_code,omitempty" xml:"sub_code,omitempty"`
	// 业务错误描述
	SubMsg *string `json:"sub_msg,omitempty" xml:"sub_msg,omitempty"`
}

func (s PaymentCreateCheckResult) String() string {
	return tea.Prettify(s)
}

func (s PaymentCreateCheckResult) GoString() string {
	return s.String()
}

func (s *PaymentCreateCheckResult) SetResult(v string) *PaymentCreateCheckResult {
	s.Result = &v
	return s
}

func (s *PaymentCreateCheckResult) SetSubCode(v string) *PaymentCreateCheckResult {
	s.SubCode = &v
	return s
}

func (s *PaymentCreateCheckResult) SetSubMsg(v string) *PaymentCreateCheckResult {
	s.SubMsg = &v
	return s
}

type QuerySaasPaymentRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// json请求参数
	BizContent *string `json:"biz_content,omitempty" xml:"biz_content,omitempty" require:"true"`
	// 编排版本
	ServiceVersion *string `json:"service_version,omitempty" xml:"service_version,omitempty" require:"true"`
}

func (s QuerySaasPaymentRequest) String() string {
	return tea.Prettify(s)
}

func (s QuerySaasPaymentRequest) GoString() string {
	return s.String()
}

func (s *QuerySaasPaymentRequest) SetAuthToken(v string) *QuerySaasPaymentRequest {
	s.AuthToken = &v
	return s
}

func (s *QuerySaasPaymentRequest) SetProductInstanceId(v string) *QuerySaasPaymentRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QuerySaasPaymentRequest) SetBizContent(v string) *QuerySaasPaymentRequest {
	s.BizContent = &v
	return s
}

func (s *QuerySaasPaymentRequest) SetServiceVersion(v string) *QuerySaasPaymentRequest {
	s.ServiceVersion = &v
	return s
}

type QuerySaasPaymentResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 交易查询结果
	Data *PaymentQueryResult `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QuerySaasPaymentResponse) String() string {
	return tea.Prettify(s)
}

func (s QuerySaasPaymentResponse) GoString() string {
	return s.String()
}

func (s *QuerySaasPaymentResponse) SetReqMsgId(v string) *QuerySaasPaymentResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QuerySaasPaymentResponse) SetResultCode(v string) *QuerySaasPaymentResponse {
	s.ResultCode = &v
	return s
}

func (s *QuerySaasPaymentResponse) SetResultMsg(v string) *QuerySaasPaymentResponse {
	s.ResultMsg = &v
	return s
}

func (s *QuerySaasPaymentResponse) SetData(v *PaymentQueryResult) *QuerySaasPaymentResponse {
	s.Data = v
	return s
}

type CheckSaasPaymentRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// json请求参数
	BizContent *string `json:"biz_content,omitempty" xml:"biz_content,omitempty" require:"true"`
	// 版本号
	ServiceVersion *string `json:"service_version,omitempty" xml:"service_version,omitempty" require:"true"`
}

func (s CheckSaasPaymentRequest) String() string {
	return tea.Prettify(s)
}

func (s CheckSaasPaymentRequest) GoString() string {
	return s.String()
}

func (s *CheckSaasPaymentRequest) SetAuthToken(v string) *CheckSaasPaymentRequest {
	s.AuthToken = &v
	return s
}

func (s *CheckSaasPaymentRequest) SetProductInstanceId(v string) *CheckSaasPaymentRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CheckSaasPaymentRequest) SetBizContent(v string) *CheckSaasPaymentRequest {
	s.BizContent = &v
	return s
}

func (s *CheckSaasPaymentRequest) SetServiceVersion(v string) *CheckSaasPaymentRequest {
	s.ServiceVersion = &v
	return s
}

type CheckSaasPaymentResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 交易前检查结果
	Data *PaymentCreateCheckResult `json:"data,omitempty" xml:"data,omitempty"`
}

func (s CheckSaasPaymentResponse) String() string {
	return tea.Prettify(s)
}

func (s CheckSaasPaymentResponse) GoString() string {
	return s.String()
}

func (s *CheckSaasPaymentResponse) SetReqMsgId(v string) *CheckSaasPaymentResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CheckSaasPaymentResponse) SetResultCode(v string) *CheckSaasPaymentResponse {
	s.ResultCode = &v
	return s
}

func (s *CheckSaasPaymentResponse) SetResultMsg(v string) *CheckSaasPaymentResponse {
	s.ResultMsg = &v
	return s
}

func (s *CheckSaasPaymentResponse) SetData(v *PaymentCreateCheckResult) *CheckSaasPaymentResponse {
	s.Data = v
	return s
}

type CreateSaasPaymentRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// json请求参数
	BizContent *string `json:"biz_content,omitempty" xml:"biz_content,omitempty" require:"true"`
	// 版本号
	ServiceVersion *string `json:"service_version,omitempty" xml:"service_version,omitempty" require:"true"`
}

func (s CreateSaasPaymentRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateSaasPaymentRequest) GoString() string {
	return s.String()
}

func (s *CreateSaasPaymentRequest) SetAuthToken(v string) *CreateSaasPaymentRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateSaasPaymentRequest) SetProductInstanceId(v string) *CreateSaasPaymentRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateSaasPaymentRequest) SetBizContent(v string) *CreateSaasPaymentRequest {
	s.BizContent = &v
	return s
}

func (s *CreateSaasPaymentRequest) SetServiceVersion(v string) *CreateSaasPaymentRequest {
	s.ServiceVersion = &v
	return s
}

type CreateSaasPaymentResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 交易创建结果
	Data *PaymentCreateResult `json:"data,omitempty" xml:"data,omitempty"`
}

func (s CreateSaasPaymentResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateSaasPaymentResponse) GoString() string {
	return s.String()
}

func (s *CreateSaasPaymentResponse) SetReqMsgId(v string) *CreateSaasPaymentResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateSaasPaymentResponse) SetResultCode(v string) *CreateSaasPaymentResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateSaasPaymentResponse) SetResultMsg(v string) *CreateSaasPaymentResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateSaasPaymentResponse) SetData(v *PaymentCreateResult) *CreateSaasPaymentResponse {
	s.Data = v
	return s
}

type CancelSaasPaymentRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// json请求参数
	BizContent *string `json:"biz_content,omitempty" xml:"biz_content,omitempty" require:"true"`
	// 版本号
	ServiceVersion *string `json:"service_version,omitempty" xml:"service_version,omitempty" require:"true"`
}

func (s CancelSaasPaymentRequest) String() string {
	return tea.Prettify(s)
}

func (s CancelSaasPaymentRequest) GoString() string {
	return s.String()
}

func (s *CancelSaasPaymentRequest) SetAuthToken(v string) *CancelSaasPaymentRequest {
	s.AuthToken = &v
	return s
}

func (s *CancelSaasPaymentRequest) SetProductInstanceId(v string) *CancelSaasPaymentRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CancelSaasPaymentRequest) SetBizContent(v string) *CancelSaasPaymentRequest {
	s.BizContent = &v
	return s
}

func (s *CancelSaasPaymentRequest) SetServiceVersion(v string) *CancelSaasPaymentRequest {
	s.ServiceVersion = &v
	return s
}

type CancelSaasPaymentResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 交易撤销结果
	Data *PaymentCancelResult `json:"data,omitempty" xml:"data,omitempty"`
}

func (s CancelSaasPaymentResponse) String() string {
	return tea.Prettify(s)
}

func (s CancelSaasPaymentResponse) GoString() string {
	return s.String()
}

func (s *CancelSaasPaymentResponse) SetReqMsgId(v string) *CancelSaasPaymentResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CancelSaasPaymentResponse) SetResultCode(v string) *CancelSaasPaymentResponse {
	s.ResultCode = &v
	return s
}

func (s *CancelSaasPaymentResponse) SetResultMsg(v string) *CancelSaasPaymentResponse {
	s.ResultMsg = &v
	return s
}

func (s *CancelSaasPaymentResponse) SetData(v *PaymentCancelResult) *CancelSaasPaymentResponse {
	s.Data = v
	return s
}

type QuerySaasAccountRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// json请求参数
	BizContent *string `json:"biz_content,omitempty" xml:"biz_content,omitempty" require:"true"`
	// 版本号
	ServiceVersion *string `json:"service_version,omitempty" xml:"service_version,omitempty" require:"true"`
}

func (s QuerySaasAccountRequest) String() string {
	return tea.Prettify(s)
}

func (s QuerySaasAccountRequest) GoString() string {
	return s.String()
}

func (s *QuerySaasAccountRequest) SetAuthToken(v string) *QuerySaasAccountRequest {
	s.AuthToken = &v
	return s
}

func (s *QuerySaasAccountRequest) SetProductInstanceId(v string) *QuerySaasAccountRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QuerySaasAccountRequest) SetBizContent(v string) *QuerySaasAccountRequest {
	s.BizContent = &v
	return s
}

func (s *QuerySaasAccountRequest) SetServiceVersion(v string) *QuerySaasAccountRequest {
	s.ServiceVersion = &v
	return s
}

type QuerySaasAccountResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 账户查询结果
	Data *AccountQueryResult `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QuerySaasAccountResponse) String() string {
	return tea.Prettify(s)
}

func (s QuerySaasAccountResponse) GoString() string {
	return s.String()
}

func (s *QuerySaasAccountResponse) SetReqMsgId(v string) *QuerySaasAccountResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QuerySaasAccountResponse) SetResultCode(v string) *QuerySaasAccountResponse {
	s.ResultCode = &v
	return s
}

func (s *QuerySaasAccountResponse) SetResultMsg(v string) *QuerySaasAccountResponse {
	s.ResultMsg = &v
	return s
}

func (s *QuerySaasAccountResponse) SetData(v *AccountQueryResult) *QuerySaasAccountResponse {
	s.Data = v
	return s
}

type QuerySaasFunditemRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// json请求参数
	BizContent *string `json:"biz_content,omitempty" xml:"biz_content,omitempty" require:"true"`
	// 版本号
	ServiceVersion *string `json:"service_version,omitempty" xml:"service_version,omitempty" require:"true"`
}

func (s QuerySaasFunditemRequest) String() string {
	return tea.Prettify(s)
}

func (s QuerySaasFunditemRequest) GoString() string {
	return s.String()
}

func (s *QuerySaasFunditemRequest) SetAuthToken(v string) *QuerySaasFunditemRequest {
	s.AuthToken = &v
	return s
}

func (s *QuerySaasFunditemRequest) SetProductInstanceId(v string) *QuerySaasFunditemRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QuerySaasFunditemRequest) SetBizContent(v string) *QuerySaasFunditemRequest {
	s.BizContent = &v
	return s
}

func (s *QuerySaasFunditemRequest) SetServiceVersion(v string) *QuerySaasFunditemRequest {
	s.ServiceVersion = &v
	return s
}

type QuerySaasFunditemResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 资金操作明细查询结果
	Data *FundItemQueryResult `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QuerySaasFunditemResponse) String() string {
	return tea.Prettify(s)
}

func (s QuerySaasFunditemResponse) GoString() string {
	return s.String()
}

func (s *QuerySaasFunditemResponse) SetReqMsgId(v string) *QuerySaasFunditemResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QuerySaasFunditemResponse) SetResultCode(v string) *QuerySaasFunditemResponse {
	s.ResultCode = &v
	return s
}

func (s *QuerySaasFunditemResponse) SetResultMsg(v string) *QuerySaasFunditemResponse {
	s.ResultMsg = &v
	return s
}

func (s *QuerySaasFunditemResponse) SetData(v *FundItemQueryResult) *QuerySaasFunditemResponse {
	s.Data = v
	return s
}

type QuerySaasAgreementRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// json请求参数
	BizContent *string `json:"biz_content,omitempty" xml:"biz_content,omitempty" require:"true"`
	// 版本号
	ServiceVersion *string `json:"service_version,omitempty" xml:"service_version,omitempty" require:"true"`
}

func (s QuerySaasAgreementRequest) String() string {
	return tea.Prettify(s)
}

func (s QuerySaasAgreementRequest) GoString() string {
	return s.String()
}

func (s *QuerySaasAgreementRequest) SetAuthToken(v string) *QuerySaasAgreementRequest {
	s.AuthToken = &v
	return s
}

func (s *QuerySaasAgreementRequest) SetProductInstanceId(v string) *QuerySaasAgreementRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QuerySaasAgreementRequest) SetBizContent(v string) *QuerySaasAgreementRequest {
	s.BizContent = &v
	return s
}

func (s *QuerySaasAgreementRequest) SetServiceVersion(v string) *QuerySaasAgreementRequest {
	s.ServiceVersion = &v
	return s
}

type QuerySaasAgreementResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 客户产品签约结果
	//
	Data *AgreementQueryResult `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QuerySaasAgreementResponse) String() string {
	return tea.Prettify(s)
}

func (s QuerySaasAgreementResponse) GoString() string {
	return s.String()
}

func (s *QuerySaasAgreementResponse) SetReqMsgId(v string) *QuerySaasAgreementResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QuerySaasAgreementResponse) SetResultCode(v string) *QuerySaasAgreementResponse {
	s.ResultCode = &v
	return s
}

func (s *QuerySaasAgreementResponse) SetResultMsg(v string) *QuerySaasAgreementResponse {
	s.ResultMsg = &v
	return s
}

func (s *QuerySaasAgreementResponse) SetData(v *AgreementQueryResult) *QuerySaasAgreementResponse {
	s.Data = v
	return s
}

type CaptureSaasPaymentRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// json请求参数
	BizContent *string `json:"biz_content,omitempty" xml:"biz_content,omitempty" require:"true"`
	// 版本号
	ServiceVersion *string `json:"service_version,omitempty" xml:"service_version,omitempty" require:"true"`
}

func (s CaptureSaasPaymentRequest) String() string {
	return tea.Prettify(s)
}

func (s CaptureSaasPaymentRequest) GoString() string {
	return s.String()
}

func (s *CaptureSaasPaymentRequest) SetAuthToken(v string) *CaptureSaasPaymentRequest {
	s.AuthToken = &v
	return s
}

func (s *CaptureSaasPaymentRequest) SetProductInstanceId(v string) *CaptureSaasPaymentRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CaptureSaasPaymentRequest) SetBizContent(v string) *CaptureSaasPaymentRequest {
	s.BizContent = &v
	return s
}

func (s *CaptureSaasPaymentRequest) SetServiceVersion(v string) *CaptureSaasPaymentRequest {
	s.ServiceVersion = &v
	return s
}

type CaptureSaasPaymentResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 支付请款结果
	//
	Data *PaymentCaptureResult `json:"data,omitempty" xml:"data,omitempty"`
}

func (s CaptureSaasPaymentResponse) String() string {
	return tea.Prettify(s)
}

func (s CaptureSaasPaymentResponse) GoString() string {
	return s.String()
}

func (s *CaptureSaasPaymentResponse) SetReqMsgId(v string) *CaptureSaasPaymentResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CaptureSaasPaymentResponse) SetResultCode(v string) *CaptureSaasPaymentResponse {
	s.ResultCode = &v
	return s
}

func (s *CaptureSaasPaymentResponse) SetResultMsg(v string) *CaptureSaasPaymentResponse {
	s.ResultMsg = &v
	return s
}

func (s *CaptureSaasPaymentResponse) SetData(v *PaymentCaptureResult) *CaptureSaasPaymentResponse {
	s.Data = v
	return s
}

type QuerySaasInstRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// json请求参数
	BizContent *string `json:"biz_content,omitempty" xml:"biz_content,omitempty" require:"true"`
	// 版本号
	ServiceVersion *string `json:"service_version,omitempty" xml:"service_version,omitempty" require:"true"`
}

func (s QuerySaasInstRequest) String() string {
	return tea.Prettify(s)
}

func (s QuerySaasInstRequest) GoString() string {
	return s.String()
}

func (s *QuerySaasInstRequest) SetAuthToken(v string) *QuerySaasInstRequest {
	s.AuthToken = &v
	return s
}

func (s *QuerySaasInstRequest) SetProductInstanceId(v string) *QuerySaasInstRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QuerySaasInstRequest) SetBizContent(v string) *QuerySaasInstRequest {
	s.BizContent = &v
	return s
}

func (s *QuerySaasInstRequest) SetServiceVersion(v string) *QuerySaasInstRequest {
	s.ServiceVersion = &v
	return s
}

type QuerySaasInstResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 机构代码查询结果
	//
	Data *InstCodeResult `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QuerySaasInstResponse) String() string {
	return tea.Prettify(s)
}

func (s QuerySaasInstResponse) GoString() string {
	return s.String()
}

func (s *QuerySaasInstResponse) SetReqMsgId(v string) *QuerySaasInstResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QuerySaasInstResponse) SetResultCode(v string) *QuerySaasInstResponse {
	s.ResultCode = &v
	return s
}

func (s *QuerySaasInstResponse) SetResultMsg(v string) *QuerySaasInstResponse {
	s.ResultMsg = &v
	return s
}

func (s *QuerySaasInstResponse) SetData(v *InstCodeResult) *QuerySaasInstResponse {
	s.Data = v
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
		"timeouted":               "retry",
		"readTimeout":             tea.IntValue(util.DefaultNumber(runtime.ReadTimeout, client.ReadTimeout)),
		"connectTimeout":          tea.IntValue(util.DefaultNumber(runtime.ConnectTimeout, client.ConnectTimeout)),
		"httpProxy":               tea.StringValue(util.DefaultString(runtime.HttpProxy, client.HttpProxy)),
		"httpsProxy":              tea.StringValue(util.DefaultString(runtime.HttpsProxy, client.HttpsProxy)),
		"noProxy":                 tea.StringValue(util.DefaultString(runtime.NoProxy, client.NoProxy)),
		"maxIdleConns":            tea.IntValue(util.DefaultNumber(runtime.MaxIdleConns, client.MaxIdleConns)),
		"maxIdleTimeMillis":       tea.IntValue(client.MaxIdleTimeMillis),
		"keepAliveDurationMillis": tea.IntValue(client.KeepAliveDurationMillis),
		"maxRequests":             tea.IntValue(client.MaxRequests),
		"maxRequestsPerHost":      tea.IntValue(client.MaxRequestsPerHost),
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
				"sdk_version":      tea.String("1.0.5"),
				"_prod_code":       tea.String("DEFINCASHIER"),
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
 * Description: 适用于创建交易后，查询交易详情。
 * Summary: B2B资金服务查询交易
 */
func (client *Client) QuerySaasPayment(request *QuerySaasPaymentRequest) (_result *QuerySaasPaymentResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QuerySaasPaymentResponse{}
	_body, _err := client.QuerySaasPaymentEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 适用于创建交易后，查询交易详情。
 * Summary: B2B资金服务查询交易
 */
func (client *Client) QuerySaasPaymentEx(request *QuerySaasPaymentRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QuerySaasPaymentResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QuerySaasPaymentResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.defincashier.saas.payment.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: B2B支付场景，创建交易前检查
 * Summary: B2B资金服务交易前检查
 */
func (client *Client) CheckSaasPayment(request *CheckSaasPaymentRequest) (_result *CheckSaasPaymentResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CheckSaasPaymentResponse{}
	_body, _err := client.CheckSaasPaymentEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: B2B支付场景，创建交易前检查
 * Summary: B2B资金服务交易前检查
 */
func (client *Client) CheckSaasPaymentEx(request *CheckSaasPaymentRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CheckSaasPaymentResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CheckSaasPaymentResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.defincashier.saas.payment.check"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: B2B支付场景，创建交易服务
 * Summary: B2B资金服务创建交易
 */
func (client *Client) CreateSaasPayment(request *CreateSaasPaymentRequest) (_result *CreateSaasPaymentResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateSaasPaymentResponse{}
	_body, _err := client.CreateSaasPaymentEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: B2B支付场景，创建交易服务
 * Summary: B2B资金服务创建交易
 */
func (client *Client) CreateSaasPaymentEx(request *CreateSaasPaymentRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateSaasPaymentResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateSaasPaymentResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.defincashier.saas.payment.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 撤销适用于商户、用户创建交易后，业务上不需要继续完成支付或放款。由业务平台或商户发起交易撤销动作，当交易未支付成功时，直接关单；当担保交易模式预授权成功时，完成预授权资金的解冻或退回。系统内部同步受理，异步处理，以异步处理结果为准。未支付交易只能撤销一次，已支付交易支持部分金额撤销，总撤销金额不超过支付金额。
 * Summary: B2B资金服务交易撤销
 */
func (client *Client) CancelSaasPayment(request *CancelSaasPaymentRequest) (_result *CancelSaasPaymentResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CancelSaasPaymentResponse{}
	_body, _err := client.CancelSaasPaymentEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 撤销适用于商户、用户创建交易后，业务上不需要继续完成支付或放款。由业务平台或商户发起交易撤销动作，当交易未支付成功时，直接关单；当担保交易模式预授权成功时，完成预授权资金的解冻或退回。系统内部同步受理，异步处理，以异步处理结果为准。未支付交易只能撤销一次，已支付交易支持部分金额撤销，总撤销金额不超过支付金额。
 * Summary: B2B资金服务交易撤销
 */
func (client *Client) CancelSaasPaymentEx(request *CancelSaasPaymentRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CancelSaasPaymentResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CancelSaasPaymentResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.defincashier.saas.payment.cancel"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 用于外部业务平台会员查询已绑定账号
 * Summary: B2B资金服务账号查询
 */
func (client *Client) QuerySaasAccount(request *QuerySaasAccountRequest) (_result *QuerySaasAccountResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QuerySaasAccountResponse{}
	_body, _err := client.QuerySaasAccountEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 用于外部业务平台会员查询已绑定账号
 * Summary: B2B资金服务账号查询
 */
func (client *Client) QuerySaasAccountEx(request *QuerySaasAccountRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QuerySaasAccountResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QuerySaasAccountResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.defincashier.saas.account.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 可以根据流水号查询请款，退款等资金操作明细
 * Summary: B2B资金服务交易资金操作明细查询
 */
func (client *Client) QuerySaasFunditem(request *QuerySaasFunditemRequest) (_result *QuerySaasFunditemResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QuerySaasFunditemResponse{}
	_body, _err := client.QuerySaasFunditemEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 可以根据流水号查询请款，退款等资金操作明细
 * Summary: B2B资金服务交易资金操作明细查询
 */
func (client *Client) QuerySaasFunditemEx(request *QuerySaasFunditemRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QuerySaasFunditemResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QuerySaasFunditemResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.defincashier.saas.funditem.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询会员的产品签约协议
 * Summary: B2B资金服务签约查询
 */
func (client *Client) QuerySaasAgreement(request *QuerySaasAgreementRequest) (_result *QuerySaasAgreementResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QuerySaasAgreementResponse{}
	_body, _err := client.QuerySaasAgreementEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询会员的产品签约协议
 * Summary: B2B资金服务签约查询
 */
func (client *Client) QuerySaasAgreementEx(request *QuerySaasAgreementRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QuerySaasAgreementResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QuerySaasAgreementResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.defincashier.saas.agreement.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 请款适用于商户、用户创建担保交易(预授权资金模式)，用户预授权成功完成资金冻结后，由业务平台确认到达打款给商户的时机后发起请款。完成预授权冻结资金解冻，并打款给商户。系统内部同步受理，异步处理，以异步交易结果通知为准。每笔交易支持多次部分请款，总请款金额不超过支付金额。
 * Summary: B2B资金服务交易请款
 */
func (client *Client) CaptureSaasPayment(request *CaptureSaasPaymentRequest) (_result *CaptureSaasPaymentResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CaptureSaasPaymentResponse{}
	_body, _err := client.CaptureSaasPaymentEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 请款适用于商户、用户创建担保交易(预授权资金模式)，用户预授权成功完成资金冻结后，由业务平台确认到达打款给商户的时机后发起请款。完成预授权冻结资金解冻，并打款给商户。系统内部同步受理，异步处理，以异步交易结果通知为准。每笔交易支持多次部分请款，总请款金额不超过支付金额。
 * Summary: B2B资金服务交易请款
 */
func (client *Client) CaptureSaasPaymentEx(request *CaptureSaasPaymentRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CaptureSaasPaymentResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CaptureSaasPaymentResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.defincashier.saas.payment.capture"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 用于外部业务平台会员查询机构（银行）的联行号和机构编码
 * Summary: B2B资金服务机构信息查询
 */
func (client *Client) QuerySaasInst(request *QuerySaasInstRequest) (_result *QuerySaasInstResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QuerySaasInstResponse{}
	_body, _err := client.QuerySaasInstEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 用于外部业务平台会员查询机构（银行）的联行号和机构编码
 * Summary: B2B资金服务机构信息查询
 */
func (client *Client) QuerySaasInstEx(request *QuerySaasInstRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QuerySaasInstResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QuerySaasInstResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.defincashier.saas.inst.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
