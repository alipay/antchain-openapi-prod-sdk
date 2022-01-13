// This file is auto-generated, don't edit it. Thanks.
package client

import (
	rpcutil "github.com/alibabacloud-go/tea-rpc-utils/service"
	util "github.com/alibabacloud-go/tea-utils/service"
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

// 金额类
type MultiCurrencyMoneyOpenApi struct {
	// 最小币种单位
	Cent *string `json:"cent,omitempty" xml:"cent,omitempty" require:"true"`
	// 币种
	CurrencyValue *string `json:"currency_value,omitempty" xml:"currency_value,omitempty" require:"true"`
}

func (s MultiCurrencyMoneyOpenApi) String() string {
	return tea.Prettify(s)
}

func (s MultiCurrencyMoneyOpenApi) GoString() string {
	return s.String()
}

func (s *MultiCurrencyMoneyOpenApi) SetCent(v string) *MultiCurrencyMoneyOpenApi {
	s.Cent = &v
	return s
}

func (s *MultiCurrencyMoneyOpenApi) SetCurrencyValue(v string) *MultiCurrencyMoneyOpenApi {
	s.CurrencyValue = &v
	return s
}

// 测试
type TestTv struct {
	// 租户ID
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
}

func (s TestTv) String() string {
	return tea.Prettify(s)
}

func (s TestTv) GoString() string {
	return s.String()
}

func (s *TestTv) SetTenantId(v string) *TestTv {
	s.TenantId = &v
	return s
}

// 充值记录VO
type ChargeRecordVO struct {
	// 充值凭证号
	VoucherNo *string `json:"voucher_no,omitempty" xml:"voucher_no,omitempty" require:"true"`
	// 外部单据号
	OutBizNo *string `json:"out_biz_no,omitempty" xml:"out_biz_no,omitempty" require:"true"`
	// 充值时间
	RechargeTime *string `json:"recharge_time,omitempty" xml:"recharge_time,omitempty" require:"true"`
	// 支付状态（INIT-创建订单/SUCCESS-充值成功/FAIL-充值失败）
	RechargeStatus *string `json:"recharge_status,omitempty" xml:"recharge_status,omitempty" require:"true"`
	// 金额
	MultiCurrencyMoneyOpenApi *MultiCurrencyMoneyOpenApi `json:"multi_currency_money_open_api,omitempty" xml:"multi_currency_money_open_api,omitempty" require:"true"`
}

func (s ChargeRecordVO) String() string {
	return tea.Prettify(s)
}

func (s ChargeRecordVO) GoString() string {
	return s.String()
}

func (s *ChargeRecordVO) SetVoucherNo(v string) *ChargeRecordVO {
	s.VoucherNo = &v
	return s
}

func (s *ChargeRecordVO) SetOutBizNo(v string) *ChargeRecordVO {
	s.OutBizNo = &v
	return s
}

func (s *ChargeRecordVO) SetRechargeTime(v string) *ChargeRecordVO {
	s.RechargeTime = &v
	return s
}

func (s *ChargeRecordVO) SetRechargeStatus(v string) *ChargeRecordVO {
	s.RechargeStatus = &v
	return s
}

func (s *ChargeRecordVO) SetMultiCurrencyMoneyOpenApi(v *MultiCurrencyMoneyOpenApi) *ChargeRecordVO {
	s.MultiCurrencyMoneyOpenApi = v
	return s
}

type QueryBalanceRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 租户ID
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 调用系统来源
	Source *string `json:"source,omitempty" xml:"source,omitempty" require:"true"`
}

func (s QueryBalanceRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryBalanceRequest) GoString() string {
	return s.String()
}

func (s *QueryBalanceRequest) SetAuthToken(v string) *QueryBalanceRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryBalanceRequest) SetTenantId(v string) *QueryBalanceRequest {
	s.TenantId = &v
	return s
}

func (s *QueryBalanceRequest) SetSource(v string) *QueryBalanceRequest {
	s.Source = &v
	return s
}

type QueryBalanceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 余额
	Balance *MultiCurrencyMoneyOpenApi `json:"balance,omitempty" xml:"balance,omitempty"`
	// ALIPAY-客资账户 FINANCE-财资账户
	AccountType *string `json:"account_type,omitempty" xml:"account_type,omitempty"`
}

func (s QueryBalanceResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryBalanceResponse) GoString() string {
	return s.String()
}

func (s *QueryBalanceResponse) SetReqMsgId(v string) *QueryBalanceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryBalanceResponse) SetResultCode(v string) *QueryBalanceResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryBalanceResponse) SetResultMsg(v string) *QueryBalanceResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryBalanceResponse) SetBalance(v *MultiCurrencyMoneyOpenApi) *QueryBalanceResponse {
	s.Balance = v
	return s
}

func (s *QueryBalanceResponse) SetAccountType(v string) *QueryBalanceResponse {
	s.AccountType = &v
	return s
}

type ChargeCustomerBalanceRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 租户ID
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 充值金额，单位分
	RechargeAmt *string `json:"recharge_amt,omitempty" xml:"recharge_amt,omitempty" require:"true"`
	// 币种
	CurrencyValue *string `json:"currency_value,omitempty" xml:"currency_value,omitempty" require:"true"`
	// 用户充值后跳转的地址链接，若不填，则默认跳到中台费用中心页面
	ReturnUrl *string `json:"return_url,omitempty" xml:"return_url,omitempty"`
	// 调用系统appName
	Source *string `json:"source,omitempty" xml:"source,omitempty" require:"true"`
	// 充值渠道，默认传"01"
	RechargeChannel *string `json:"recharge_channel,omitempty" xml:"recharge_channel,omitempty" require:"true"`
	// 外部单据号，用于幂等
	OutBizNo *string `json:"out_biz_no,omitempty" xml:"out_biz_no,omitempty" require:"true"`
}

func (s ChargeCustomerBalanceRequest) String() string {
	return tea.Prettify(s)
}

func (s ChargeCustomerBalanceRequest) GoString() string {
	return s.String()
}

func (s *ChargeCustomerBalanceRequest) SetAuthToken(v string) *ChargeCustomerBalanceRequest {
	s.AuthToken = &v
	return s
}

func (s *ChargeCustomerBalanceRequest) SetTenantId(v string) *ChargeCustomerBalanceRequest {
	s.TenantId = &v
	return s
}

func (s *ChargeCustomerBalanceRequest) SetRechargeAmt(v string) *ChargeCustomerBalanceRequest {
	s.RechargeAmt = &v
	return s
}

func (s *ChargeCustomerBalanceRequest) SetCurrencyValue(v string) *ChargeCustomerBalanceRequest {
	s.CurrencyValue = &v
	return s
}

func (s *ChargeCustomerBalanceRequest) SetReturnUrl(v string) *ChargeCustomerBalanceRequest {
	s.ReturnUrl = &v
	return s
}

func (s *ChargeCustomerBalanceRequest) SetSource(v string) *ChargeCustomerBalanceRequest {
	s.Source = &v
	return s
}

func (s *ChargeCustomerBalanceRequest) SetRechargeChannel(v string) *ChargeCustomerBalanceRequest {
	s.RechargeChannel = &v
	return s
}

func (s *ChargeCustomerBalanceRequest) SetOutBizNo(v string) *ChargeCustomerBalanceRequest {
	s.OutBizNo = &v
	return s
}

type ChargeCustomerBalanceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 收银台URI
	CashierUrl *string `json:"cashier_url,omitempty" xml:"cashier_url,omitempty"`
}

func (s ChargeCustomerBalanceResponse) String() string {
	return tea.Prettify(s)
}

func (s ChargeCustomerBalanceResponse) GoString() string {
	return s.String()
}

func (s *ChargeCustomerBalanceResponse) SetReqMsgId(v string) *ChargeCustomerBalanceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ChargeCustomerBalanceResponse) SetResultCode(v string) *ChargeCustomerBalanceResponse {
	s.ResultCode = &v
	return s
}

func (s *ChargeCustomerBalanceResponse) SetResultMsg(v string) *ChargeCustomerBalanceResponse {
	s.ResultMsg = &v
	return s
}

func (s *ChargeCustomerBalanceResponse) SetCashierUrl(v string) *ChargeCustomerBalanceResponse {
	s.CashierUrl = &v
	return s
}

type QueryInfoRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 租户ID
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 调用系统名称
	Source *string `json:"source,omitempty" xml:"source,omitempty" require:"true"`
	// 主体信息，不填默认ZL6
	Ou *string `json:"ou,omitempty" xml:"ou,omitempty"`
}

func (s QueryInfoRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryInfoRequest) GoString() string {
	return s.String()
}

func (s *QueryInfoRequest) SetAuthToken(v string) *QueryInfoRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryInfoRequest) SetTenantId(v string) *QueryInfoRequest {
	s.TenantId = &v
	return s
}

func (s *QueryInfoRequest) SetSource(v string) *QueryInfoRequest {
	s.Source = &v
	return s
}

func (s *QueryInfoRequest) SetOu(v string) *QueryInfoRequest {
	s.Ou = &v
	return s
}

type QueryInfoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 用户的银行打款卡号
	CardId *string `json:"card_id,omitempty" xml:"card_id,omitempty"`
	// 银行户名
	AccountName *string `json:"account_name,omitempty" xml:"account_name,omitempty"`
	// 开户银行
	BankName *string `json:"bank_name,omitempty" xml:"bank_name,omitempty"`
	// 网点/支行 （客资特有）
	BranchBankName *string `json:"branch_bank_name,omitempty" xml:"branch_bank_name,omitempty"`
	// 联行号（客资特有）
	BankLineNumber *string `json:"bank_line_number,omitempty" xml:"bank_line_number,omitempty"`
	// 开户地（客资特有）
	BankLocation *string `json:"bank_location,omitempty" xml:"bank_location,omitempty"`
	// ALIPAY-客资账户 FINANCE-财资账户
	AccountType *string `json:"account_type,omitempty" xml:"account_type,omitempty"`
}

func (s QueryInfoResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryInfoResponse) GoString() string {
	return s.String()
}

func (s *QueryInfoResponse) SetReqMsgId(v string) *QueryInfoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryInfoResponse) SetResultCode(v string) *QueryInfoResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryInfoResponse) SetResultMsg(v string) *QueryInfoResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryInfoResponse) SetCardId(v string) *QueryInfoResponse {
	s.CardId = &v
	return s
}

func (s *QueryInfoResponse) SetAccountName(v string) *QueryInfoResponse {
	s.AccountName = &v
	return s
}

func (s *QueryInfoResponse) SetBankName(v string) *QueryInfoResponse {
	s.BankName = &v
	return s
}

func (s *QueryInfoResponse) SetBranchBankName(v string) *QueryInfoResponse {
	s.BranchBankName = &v
	return s
}

func (s *QueryInfoResponse) SetBankLineNumber(v string) *QueryInfoResponse {
	s.BankLineNumber = &v
	return s
}

func (s *QueryInfoResponse) SetBankLocation(v string) *QueryInfoResponse {
	s.BankLocation = &v
	return s
}

func (s *QueryInfoResponse) SetAccountType(v string) *QueryInfoResponse {
	s.AccountType = &v
	return s
}

type QueryCustomerChargeRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 租户ID
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 若有，则返回相应的状态，INIT/SUCCESS/FAIL
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 访问的页码数
	PageNo *int64 `json:"page_no,omitempty" xml:"page_no,omitempty" require:"true"`
	// 每页的数量
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
	// 调用系统来源
	Source *string `json:"source,omitempty" xml:"source,omitempty" require:"true"`
	// 1- 按时间升序
	// 2-按时间倒序
	// 不填默认2
	SortType *int64 `json:"sort_type,omitempty" xml:"sort_type,omitempty"`
}

func (s QueryCustomerChargeRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryCustomerChargeRequest) GoString() string {
	return s.String()
}

func (s *QueryCustomerChargeRequest) SetAuthToken(v string) *QueryCustomerChargeRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryCustomerChargeRequest) SetTenantId(v string) *QueryCustomerChargeRequest {
	s.TenantId = &v
	return s
}

func (s *QueryCustomerChargeRequest) SetStatus(v string) *QueryCustomerChargeRequest {
	s.Status = &v
	return s
}

func (s *QueryCustomerChargeRequest) SetPageNo(v int64) *QueryCustomerChargeRequest {
	s.PageNo = &v
	return s
}

func (s *QueryCustomerChargeRequest) SetPageSize(v int64) *QueryCustomerChargeRequest {
	s.PageSize = &v
	return s
}

func (s *QueryCustomerChargeRequest) SetSource(v string) *QueryCustomerChargeRequest {
	s.Source = &v
	return s
}

func (s *QueryCustomerChargeRequest) SetSortType(v int64) *QueryCustomerChargeRequest {
	s.SortType = &v
	return s
}

type QueryCustomerChargeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 充值记录
	Result []*ChargeRecordVO `json:"result,omitempty" xml:"result,omitempty" type:"Repeated"`
	// 总的数量
	TotalItems *int64 `json:"total_items,omitempty" xml:"total_items,omitempty"`
}

func (s QueryCustomerChargeResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryCustomerChargeResponse) GoString() string {
	return s.String()
}

func (s *QueryCustomerChargeResponse) SetReqMsgId(v string) *QueryCustomerChargeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryCustomerChargeResponse) SetResultCode(v string) *QueryCustomerChargeResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryCustomerChargeResponse) SetResultMsg(v string) *QueryCustomerChargeResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryCustomerChargeResponse) SetResult(v []*ChargeRecordVO) *QueryCustomerChargeResponse {
	s.Result = v
	return s
}

func (s *QueryCustomerChargeResponse) SetTotalItems(v int64) *QueryCustomerChargeResponse {
	s.TotalItems = &v
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
				"sdk_version":      tea.String("1.0.9"),
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
			res := util.AssertAsMap(obj)
			resp := util.AssertAsMap(res["response"])
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
 * Description: 账户余额查询，根据租户ID判断是否支付宝账号，支付宝账号返回客资户余额，非支付宝账号返回财资户余额
 * Summary: 智能科技客资账户余额查询
 */
func (client *Client) QueryBalance(request *QueryBalanceRequest) (_result *QueryBalanceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryBalanceResponse{}
	_body, _err := client.QueryBalanceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 账户余额查询，根据租户ID判断是否支付宝账号，支付宝账号返回客资户余额，非支付宝账号返回财资户余额
 * Summary: 智能科技客资账户余额查询
 */
func (client *Client) QueryBalanceEx(request *QueryBalanceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryBalanceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryBalanceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.account.balance.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 智能科技客资账号收银台充值
 * Summary: 智能科技客资账号收银台充值
 */
func (client *Client) ChargeCustomerBalance(request *ChargeCustomerBalanceRequest) (_result *ChargeCustomerBalanceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ChargeCustomerBalanceResponse{}
	_body, _err := client.ChargeCustomerBalanceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 智能科技客资账号收银台充值
 * Summary: 智能科技客资账号收银台充值
 */
func (client *Client) ChargeCustomerBalanceEx(request *ChargeCustomerBalanceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ChargeCustomerBalanceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ChargeCustomerBalanceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.account.customer.balance.charge"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 根据租户ID判断，支付宝账号返回客资线下打款渠道，非支付宝账号返回财资线下打款渠道，展示的时候只展示非空的字段
 * Summary: 智能科技线下打款渠道查询
 */
func (client *Client) QueryInfo(request *QueryInfoRequest) (_result *QueryInfoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryInfoResponse{}
	_body, _err := client.QueryInfoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 根据租户ID判断，支付宝账号返回客资线下打款渠道，非支付宝账号返回财资线下打款渠道，展示的时候只展示非空的字段
 * Summary: 智能科技线下打款渠道查询
 */
func (client *Client) QueryInfoEx(request *QueryInfoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryInfoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryInfoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.account.info.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 仅有客资线上充值记录
 * Summary: 智能科技客资账户线上充值记录查询
 */
func (client *Client) QueryCustomerCharge(request *QueryCustomerChargeRequest) (_result *QueryCustomerChargeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryCustomerChargeResponse{}
	_body, _err := client.QueryCustomerChargeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 仅有客资线上充值记录
 * Summary: 智能科技客资账户线上充值记录查询
 */
func (client *Client) QueryCustomerChargeEx(request *QueryCustomerChargeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryCustomerChargeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryCustomerChargeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.account.customer.charge.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
