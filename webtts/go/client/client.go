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

// 区块链response
type QueryBlockchainResponse struct {
	// 链名称
	Blockchain *string `json:"blockchain,omitempty" xml:"blockchain,omitempty" require:"true"`
	// 链类型
	ChainType *string `json:"chain_type,omitempty" xml:"chain_type,omitempty" require:"true"`
}

func (s QueryBlockchainResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryBlockchainResponse) GoString() string {
	return s.String()
}

func (s *QueryBlockchainResponse) SetBlockchain(v string) *QueryBlockchainResponse {
	s.Blockchain = &v
	return s
}

func (s *QueryBlockchainResponse) SetChainType(v string) *QueryBlockchainResponse {
	s.ChainType = &v
	return s
}

// WithdrawalOrderDetail
//
type WithdrawalOrderDetail struct {
	// withdrawalAmount
	WithdrawalAmount *string `json:"withdrawal_amount,omitempty" xml:"withdrawal_amount,omitempty" require:"true"`
}

func (s WithdrawalOrderDetail) String() string {
	return tea.Prettify(s)
}

func (s WithdrawalOrderDetail) GoString() string {
	return s.String()
}

func (s *WithdrawalOrderDetail) SetWithdrawalAmount(v string) *WithdrawalOrderDetail {
	s.WithdrawalAmount = &v
	return s
}

// 查询白名单详细信息响应体
type QueryWhitelistAddressResponse struct {
	// 白名单地址
	WhitelistAddress *string `json:"whitelist_address,omitempty" xml:"whitelist_address,omitempty" require:"true"`
	// 区块链列表信息
	BlockchainList []*QueryBlockchainResponse `json:"blockchain_list,omitempty" xml:"blockchain_list,omitempty" require:"true" type:"Repeated"`
}

func (s QueryWhitelistAddressResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryWhitelistAddressResponse) GoString() string {
	return s.String()
}

func (s *QueryWhitelistAddressResponse) SetWhitelistAddress(v string) *QueryWhitelistAddressResponse {
	s.WhitelistAddress = &v
	return s
}

func (s *QueryWhitelistAddressResponse) SetBlockchainList(v []*QueryBlockchainResponse) *QueryWhitelistAddressResponse {
	s.BlockchainList = v
	return s
}

// 币种response
type QueryTokenSymbolResponse struct {
	// 链名称
	Blockchain *string `json:"blockchain,omitempty" xml:"blockchain,omitempty" require:"true"`
	// 币种
	TokenSymbol *string `json:"token_symbol,omitempty" xml:"token_symbol,omitempty" require:"true"`
}

func (s QueryTokenSymbolResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryTokenSymbolResponse) GoString() string {
	return s.String()
}

func (s *QueryTokenSymbolResponse) SetBlockchain(v string) *QueryTokenSymbolResponse {
	s.Blockchain = &v
	return s
}

func (s *QueryTokenSymbolResponse) SetTokenSymbol(v string) *QueryTokenSymbolResponse {
	s.TokenSymbol = &v
	return s
}

// 查询deposit订单响应体
type QueryDepositOrderInfoResponse struct {
	// 订单id
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
	// 订单类型
	OrderType *string `json:"order_type,omitempty" xml:"order_type,omitempty" require:"true"`
	// 区块链名称
	Blockchain *string `json:"blockchain,omitempty" xml:"blockchain,omitempty" require:"true"`
	// 代币名称
	TokenSymbol *string `json:"token_symbol,omitempty" xml:"token_symbol,omitempty" require:"true"`
	// deposit数量
	Amount *string `json:"amount,omitempty" xml:"amount,omitempty" require:"true"`
	// deposit交易hash
	TxHash *string `json:"tx_hash,omitempty" xml:"tx_hash,omitempty" require:"true"`
	// 交易发起地址，为白名单地址
	FromAddress *string `json:"from_address,omitempty" xml:"from_address,omitempty" require:"true"`
	// 交易接收地址，为托管钱包地址
	ToAddress *string `json:"to_address,omitempty" xml:"to_address,omitempty" require:"true"`
	// 订单创建时间
	CreateTime *string `json:"create_time,omitempty" xml:"create_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 订单状态
	OrderStatus *string `json:"order_status,omitempty" xml:"order_status,omitempty" require:"true"`
	// 订单备注
	Remark *string `json:"remark,omitempty" xml:"remark,omitempty" require:"true"`
}

func (s QueryDepositOrderInfoResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDepositOrderInfoResponse) GoString() string {
	return s.String()
}

func (s *QueryDepositOrderInfoResponse) SetOrderId(v string) *QueryDepositOrderInfoResponse {
	s.OrderId = &v
	return s
}

func (s *QueryDepositOrderInfoResponse) SetOrderType(v string) *QueryDepositOrderInfoResponse {
	s.OrderType = &v
	return s
}

func (s *QueryDepositOrderInfoResponse) SetBlockchain(v string) *QueryDepositOrderInfoResponse {
	s.Blockchain = &v
	return s
}

func (s *QueryDepositOrderInfoResponse) SetTokenSymbol(v string) *QueryDepositOrderInfoResponse {
	s.TokenSymbol = &v
	return s
}

func (s *QueryDepositOrderInfoResponse) SetAmount(v string) *QueryDepositOrderInfoResponse {
	s.Amount = &v
	return s
}

func (s *QueryDepositOrderInfoResponse) SetTxHash(v string) *QueryDepositOrderInfoResponse {
	s.TxHash = &v
	return s
}

func (s *QueryDepositOrderInfoResponse) SetFromAddress(v string) *QueryDepositOrderInfoResponse {
	s.FromAddress = &v
	return s
}

func (s *QueryDepositOrderInfoResponse) SetToAddress(v string) *QueryDepositOrderInfoResponse {
	s.ToAddress = &v
	return s
}

func (s *QueryDepositOrderInfoResponse) SetCreateTime(v string) *QueryDepositOrderInfoResponse {
	s.CreateTime = &v
	return s
}

func (s *QueryDepositOrderInfoResponse) SetOrderStatus(v string) *QueryDepositOrderInfoResponse {
	s.OrderStatus = &v
	return s
}

func (s *QueryDepositOrderInfoResponse) SetRemark(v string) *QueryDepositOrderInfoResponse {
	s.Remark = &v
	return s
}

// WithdrawalOrderDTO
type WithdrawalOrderDTO struct {
	// orderId
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
	// orderDesc
	OrderDesc *string `json:"order_desc,omitempty" xml:"order_desc,omitempty" require:"true"`
	// orderType
	OrderType *string `json:"order_type,omitempty" xml:"order_type,omitempty" require:"true"`
	// orderStatus:INIT PENDING_CONFIRMATION PENDING_DEPOSIT RUNNING SUCCESS FAILED EXPIRED_CLOSED REFUND REJECTED
	OrderStatus *string `json:"order_status,omitempty" xml:"order_status,omitempty" require:"true"`
	// withdrawal Amount
	WithdrawalAmount *string `json:"withdrawal_amount,omitempty" xml:"withdrawal_amount,omitempty" require:"true"`
}

func (s WithdrawalOrderDTO) String() string {
	return tea.Prettify(s)
}

func (s WithdrawalOrderDTO) GoString() string {
	return s.String()
}

func (s *WithdrawalOrderDTO) SetOrderId(v string) *WithdrawalOrderDTO {
	s.OrderId = &v
	return s
}

func (s *WithdrawalOrderDTO) SetOrderDesc(v string) *WithdrawalOrderDTO {
	s.OrderDesc = &v
	return s
}

func (s *WithdrawalOrderDTO) SetOrderType(v string) *WithdrawalOrderDTO {
	s.OrderType = &v
	return s
}

func (s *WithdrawalOrderDTO) SetOrderStatus(v string) *WithdrawalOrderDTO {
	s.OrderStatus = &v
	return s
}

func (s *WithdrawalOrderDTO) SetWithdrawalAmount(v string) *WithdrawalOrderDTO {
	s.WithdrawalAmount = &v
	return s
}

type WithdrawDacVaultRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// customerId of The DAC System
	ExternalCustomerId *string `json:"external_customer_id,omitempty" xml:"external_customer_id,omitempty" require:"true"`
	// blockchain:Ethereum Ploygen
	Blockchain *string `json:"blockchain,omitempty" xml:"blockchain,omitempty" require:"true"`
	// Token Token Token identification
	TokenSymbol *string `json:"token_symbol,omitempty" xml:"token_symbol,omitempty" require:"true"`
	// withdrawal token amount
	WithdrawalAmount *string `json:"withdrawal_amount,omitempty" xml:"withdrawal_amount,omitempty" require:"true"`
	// description of requisition and withdrawal application
	WithdrawTokenDesc *string `json:"withdraw_token_desc,omitempty" xml:"withdraw_token_desc,omitempty"`
	// the address on the wallet chain of the user_s money withdrawal.
	WithdrawalWhitelistAddress *string `json:"withdrawal_whitelist_address,omitempty" xml:"withdrawal_whitelist_address,omitempty" require:"true"`
}

func (s WithdrawDacVaultRequest) String() string {
	return tea.Prettify(s)
}

func (s WithdrawDacVaultRequest) GoString() string {
	return s.String()
}

func (s *WithdrawDacVaultRequest) SetAuthToken(v string) *WithdrawDacVaultRequest {
	s.AuthToken = &v
	return s
}

func (s *WithdrawDacVaultRequest) SetProductInstanceId(v string) *WithdrawDacVaultRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *WithdrawDacVaultRequest) SetExternalCustomerId(v string) *WithdrawDacVaultRequest {
	s.ExternalCustomerId = &v
	return s
}

func (s *WithdrawDacVaultRequest) SetBlockchain(v string) *WithdrawDacVaultRequest {
	s.Blockchain = &v
	return s
}

func (s *WithdrawDacVaultRequest) SetTokenSymbol(v string) *WithdrawDacVaultRequest {
	s.TokenSymbol = &v
	return s
}

func (s *WithdrawDacVaultRequest) SetWithdrawalAmount(v string) *WithdrawDacVaultRequest {
	s.WithdrawalAmount = &v
	return s
}

func (s *WithdrawDacVaultRequest) SetWithdrawTokenDesc(v string) *WithdrawDacVaultRequest {
	s.WithdrawTokenDesc = &v
	return s
}

func (s *WithdrawDacVaultRequest) SetWithdrawalWhitelistAddress(v string) *WithdrawDacVaultRequest {
	s.WithdrawalWhitelistAddress = &v
	return s
}

type WithdrawDacVaultResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// withdrawal order detail
	WithdrawalOrderDetail *WithdrawalOrderDetail `json:"withdrawal_order_detail,omitempty" xml:"withdrawal_order_detail,omitempty"`
}

func (s WithdrawDacVaultResponse) String() string {
	return tea.Prettify(s)
}

func (s WithdrawDacVaultResponse) GoString() string {
	return s.String()
}

func (s *WithdrawDacVaultResponse) SetReqMsgId(v string) *WithdrawDacVaultResponse {
	s.ReqMsgId = &v
	return s
}

func (s *WithdrawDacVaultResponse) SetResultCode(v string) *WithdrawDacVaultResponse {
	s.ResultCode = &v
	return s
}

func (s *WithdrawDacVaultResponse) SetResultMsg(v string) *WithdrawDacVaultResponse {
	s.ResultMsg = &v
	return s
}

func (s *WithdrawDacVaultResponse) SetWithdrawalOrderDetail(v *WithdrawalOrderDetail) *WithdrawDacVaultResponse {
	s.WithdrawalOrderDetail = v
	return s
}

type OpenActivateRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 地址
	Address *string `json:"address,omitempty" xml:"address,omitempty" require:"true"`
	// 外部客户id
	ExternalCustomerId *string `json:"external_customer_id,omitempty" xml:"external_customer_id,omitempty" require:"true"`
	// 客户性别
	Sex *string `json:"sex,omitempty" xml:"sex,omitempty" require:"true"`
	// 用户名
	Username *string `json:"username,omitempty" xml:"username,omitempty" require:"true"`
	// 出生日期
	BirthDate *int64 `json:"birth_date,omitempty" xml:"birth_date,omitempty" require:"true"`
}

func (s OpenActivateRequest) String() string {
	return tea.Prettify(s)
}

func (s OpenActivateRequest) GoString() string {
	return s.String()
}

func (s *OpenActivateRequest) SetAuthToken(v string) *OpenActivateRequest {
	s.AuthToken = &v
	return s
}

func (s *OpenActivateRequest) SetProductInstanceId(v string) *OpenActivateRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *OpenActivateRequest) SetAddress(v string) *OpenActivateRequest {
	s.Address = &v
	return s
}

func (s *OpenActivateRequest) SetExternalCustomerId(v string) *OpenActivateRequest {
	s.ExternalCustomerId = &v
	return s
}

func (s *OpenActivateRequest) SetSex(v string) *OpenActivateRequest {
	s.Sex = &v
	return s
}

func (s *OpenActivateRequest) SetUsername(v string) *OpenActivateRequest {
	s.Username = &v
	return s
}

func (s *OpenActivateRequest) SetBirthDate(v int64) *OpenActivateRequest {
	s.BirthDate = &v
	return s
}

type OpenActivateResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 表单id
	ApplyFormId *string `json:"apply_form_id,omitempty" xml:"apply_form_id,omitempty"`
}

func (s OpenActivateResponse) String() string {
	return tea.Prettify(s)
}

func (s OpenActivateResponse) GoString() string {
	return s.String()
}

func (s *OpenActivateResponse) SetReqMsgId(v string) *OpenActivateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *OpenActivateResponse) SetResultCode(v string) *OpenActivateResponse {
	s.ResultCode = &v
	return s
}

func (s *OpenActivateResponse) SetResultMsg(v string) *OpenActivateResponse {
	s.ResultMsg = &v
	return s
}

func (s *OpenActivateResponse) SetApplyFormId(v string) *OpenActivateResponse {
	s.ApplyFormId = &v
	return s
}

type StopActivateRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 外部客户id
	ExternalCustomerId *string `json:"external_customer_id,omitempty" xml:"external_customer_id,omitempty" require:"true"`
	// 备注
	Remark *string `json:"remark,omitempty" xml:"remark,omitempty" require:"true"`
}

func (s StopActivateRequest) String() string {
	return tea.Prettify(s)
}

func (s StopActivateRequest) GoString() string {
	return s.String()
}

func (s *StopActivateRequest) SetAuthToken(v string) *StopActivateRequest {
	s.AuthToken = &v
	return s
}

func (s *StopActivateRequest) SetProductInstanceId(v string) *StopActivateRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *StopActivateRequest) SetExternalCustomerId(v string) *StopActivateRequest {
	s.ExternalCustomerId = &v
	return s
}

func (s *StopActivateRequest) SetRemark(v string) *StopActivateRequest {
	s.Remark = &v
	return s
}

type StopActivateResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 表单id
	ApplyFormId *string `json:"apply_form_id,omitempty" xml:"apply_form_id,omitempty"`
}

func (s StopActivateResponse) String() string {
	return tea.Prettify(s)
}

func (s StopActivateResponse) GoString() string {
	return s.String()
}

func (s *StopActivateResponse) SetReqMsgId(v string) *StopActivateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *StopActivateResponse) SetResultCode(v string) *StopActivateResponse {
	s.ResultCode = &v
	return s
}

func (s *StopActivateResponse) SetResultMsg(v string) *StopActivateResponse {
	s.ResultMsg = &v
	return s
}

func (s *StopActivateResponse) SetApplyFormId(v string) *StopActivateResponse {
	s.ApplyFormId = &v
	return s
}

type PagequeryDacBlockchainRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 当前页
	Current *int64 `json:"current,omitempty" xml:"current,omitempty" require:"true"`
	// 每页大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
}

func (s PagequeryDacBlockchainRequest) String() string {
	return tea.Prettify(s)
}

func (s PagequeryDacBlockchainRequest) GoString() string {
	return s.String()
}

func (s *PagequeryDacBlockchainRequest) SetAuthToken(v string) *PagequeryDacBlockchainRequest {
	s.AuthToken = &v
	return s
}

func (s *PagequeryDacBlockchainRequest) SetProductInstanceId(v string) *PagequeryDacBlockchainRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PagequeryDacBlockchainRequest) SetCurrent(v int64) *PagequeryDacBlockchainRequest {
	s.Current = &v
	return s
}

func (s *PagequeryDacBlockchainRequest) SetPageSize(v int64) *PagequeryDacBlockchainRequest {
	s.PageSize = &v
	return s
}

type PagequeryDacBlockchainResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 当前页
	Current *string `json:"current,omitempty" xml:"current,omitempty"`
	// 每页大小
	PageSize *string `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// 总数
	Total *int64 `json:"total,omitempty" xml:"total,omitempty"`
	// 链信息
	List []*QueryBlockchainResponse `json:"list,omitempty" xml:"list,omitempty" type:"Repeated"`
}

func (s PagequeryDacBlockchainResponse) String() string {
	return tea.Prettify(s)
}

func (s PagequeryDacBlockchainResponse) GoString() string {
	return s.String()
}

func (s *PagequeryDacBlockchainResponse) SetReqMsgId(v string) *PagequeryDacBlockchainResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PagequeryDacBlockchainResponse) SetResultCode(v string) *PagequeryDacBlockchainResponse {
	s.ResultCode = &v
	return s
}

func (s *PagequeryDacBlockchainResponse) SetResultMsg(v string) *PagequeryDacBlockchainResponse {
	s.ResultMsg = &v
	return s
}

func (s *PagequeryDacBlockchainResponse) SetCurrent(v string) *PagequeryDacBlockchainResponse {
	s.Current = &v
	return s
}

func (s *PagequeryDacBlockchainResponse) SetPageSize(v string) *PagequeryDacBlockchainResponse {
	s.PageSize = &v
	return s
}

func (s *PagequeryDacBlockchainResponse) SetTotal(v int64) *PagequeryDacBlockchainResponse {
	s.Total = &v
	return s
}

func (s *PagequeryDacBlockchainResponse) SetList(v []*QueryBlockchainResponse) *PagequeryDacBlockchainResponse {
	s.List = v
	return s
}

type PagequeryDacTokenRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 当前页
	Current *int64 `json:"current,omitempty" xml:"current,omitempty" require:"true"`
	// 每页大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
	// 链名称
	Blockchain *string `json:"blockchain,omitempty" xml:"blockchain,omitempty"`
}

func (s PagequeryDacTokenRequest) String() string {
	return tea.Prettify(s)
}

func (s PagequeryDacTokenRequest) GoString() string {
	return s.String()
}

func (s *PagequeryDacTokenRequest) SetAuthToken(v string) *PagequeryDacTokenRequest {
	s.AuthToken = &v
	return s
}

func (s *PagequeryDacTokenRequest) SetProductInstanceId(v string) *PagequeryDacTokenRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PagequeryDacTokenRequest) SetCurrent(v int64) *PagequeryDacTokenRequest {
	s.Current = &v
	return s
}

func (s *PagequeryDacTokenRequest) SetPageSize(v int64) *PagequeryDacTokenRequest {
	s.PageSize = &v
	return s
}

func (s *PagequeryDacTokenRequest) SetBlockchain(v string) *PagequeryDacTokenRequest {
	s.Blockchain = &v
	return s
}

type PagequeryDacTokenResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 当前页
	Current *int64 `json:"current,omitempty" xml:"current,omitempty"`
	// 每页大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// 总数
	Total *int64 `json:"total,omitempty" xml:"total,omitempty"`
	// 币种信息
	List []*QueryTokenSymbolResponse `json:"list,omitempty" xml:"list,omitempty" type:"Repeated"`
}

func (s PagequeryDacTokenResponse) String() string {
	return tea.Prettify(s)
}

func (s PagequeryDacTokenResponse) GoString() string {
	return s.String()
}

func (s *PagequeryDacTokenResponse) SetReqMsgId(v string) *PagequeryDacTokenResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PagequeryDacTokenResponse) SetResultCode(v string) *PagequeryDacTokenResponse {
	s.ResultCode = &v
	return s
}

func (s *PagequeryDacTokenResponse) SetResultMsg(v string) *PagequeryDacTokenResponse {
	s.ResultMsg = &v
	return s
}

func (s *PagequeryDacTokenResponse) SetCurrent(v int64) *PagequeryDacTokenResponse {
	s.Current = &v
	return s
}

func (s *PagequeryDacTokenResponse) SetPageSize(v int64) *PagequeryDacTokenResponse {
	s.PageSize = &v
	return s
}

func (s *PagequeryDacTokenResponse) SetTotal(v int64) *PagequeryDacTokenResponse {
	s.Total = &v
	return s
}

func (s *PagequeryDacTokenResponse) SetList(v []*QueryTokenSymbolResponse) *PagequeryDacTokenResponse {
	s.List = v
	return s
}

type AddDacWhitelistRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 外部客户id
	ExternalCustId *string `json:"external_cust_id,omitempty" xml:"external_cust_id,omitempty" require:"true"`
	// 外部客户名称
	ExternalCustName *string `json:"external_cust_name,omitempty" xml:"external_cust_name,omitempty" require:"true"`
	// 白名单地址
	Address *string `json:"address,omitempty" xml:"address,omitempty" require:"true"`
	// 区块链网络列表
	BlockchainList []*string `json:"blockchain_list,omitempty" xml:"blockchain_list,omitempty" require:"true" type:"Repeated"`
}

func (s AddDacWhitelistRequest) String() string {
	return tea.Prettify(s)
}

func (s AddDacWhitelistRequest) GoString() string {
	return s.String()
}

func (s *AddDacWhitelistRequest) SetAuthToken(v string) *AddDacWhitelistRequest {
	s.AuthToken = &v
	return s
}

func (s *AddDacWhitelistRequest) SetProductInstanceId(v string) *AddDacWhitelistRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AddDacWhitelistRequest) SetExternalCustId(v string) *AddDacWhitelistRequest {
	s.ExternalCustId = &v
	return s
}

func (s *AddDacWhitelistRequest) SetExternalCustName(v string) *AddDacWhitelistRequest {
	s.ExternalCustName = &v
	return s
}

func (s *AddDacWhitelistRequest) SetAddress(v string) *AddDacWhitelistRequest {
	s.Address = &v
	return s
}

func (s *AddDacWhitelistRequest) SetBlockchainList(v []*string) *AddDacWhitelistRequest {
	s.BlockchainList = v
	return s
}

type AddDacWhitelistResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s AddDacWhitelistResponse) String() string {
	return tea.Prettify(s)
}

func (s AddDacWhitelistResponse) GoString() string {
	return s.String()
}

func (s *AddDacWhitelistResponse) SetReqMsgId(v string) *AddDacWhitelistResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AddDacWhitelistResponse) SetResultCode(v string) *AddDacWhitelistResponse {
	s.ResultCode = &v
	return s
}

func (s *AddDacWhitelistResponse) SetResultMsg(v string) *AddDacWhitelistResponse {
	s.ResultMsg = &v
	return s
}

type CheckDacWhitelistRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 公钥地址
	Address *string `json:"address,omitempty" xml:"address,omitempty" require:"true"`
}

func (s CheckDacWhitelistRequest) String() string {
	return tea.Prettify(s)
}

func (s CheckDacWhitelistRequest) GoString() string {
	return s.String()
}

func (s *CheckDacWhitelistRequest) SetAuthToken(v string) *CheckDacWhitelistRequest {
	s.AuthToken = &v
	return s
}

func (s *CheckDacWhitelistRequest) SetProductInstanceId(v string) *CheckDacWhitelistRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CheckDacWhitelistRequest) SetAddress(v string) *CheckDacWhitelistRequest {
	s.Address = &v
	return s
}

type CheckDacWhitelistResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 公钥地址
	Address *string `json:"address,omitempty" xml:"address,omitempty"`
	// 支持的链列表
	BlockchainList []*string `json:"blockchain_list,omitempty" xml:"blockchain_list,omitempty" type:"Repeated"`
	// 检查结果类型
	CheckResultType *string `json:"check_result_type,omitempty" xml:"check_result_type,omitempty"`
}

func (s CheckDacWhitelistResponse) String() string {
	return tea.Prettify(s)
}

func (s CheckDacWhitelistResponse) GoString() string {
	return s.String()
}

func (s *CheckDacWhitelistResponse) SetReqMsgId(v string) *CheckDacWhitelistResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CheckDacWhitelistResponse) SetResultCode(v string) *CheckDacWhitelistResponse {
	s.ResultCode = &v
	return s
}

func (s *CheckDacWhitelistResponse) SetResultMsg(v string) *CheckDacWhitelistResponse {
	s.ResultMsg = &v
	return s
}

func (s *CheckDacWhitelistResponse) SetAddress(v string) *CheckDacWhitelistResponse {
	s.Address = &v
	return s
}

func (s *CheckDacWhitelistResponse) SetBlockchainList(v []*string) *CheckDacWhitelistResponse {
	s.BlockchainList = v
	return s
}

func (s *CheckDacWhitelistResponse) SetCheckResultType(v string) *CheckDacWhitelistResponse {
	s.CheckResultType = &v
	return s
}

type QueryDacQuotaRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// your company external customer id
	ExternalCustomerId *string `json:"external_customer_id,omitempty" xml:"external_customer_id,omitempty" require:"true"`
	// blockchain:Ethereum,Polygon,etc
	Blockchain *string `json:"blockchain,omitempty" xml:"blockchain,omitempty" require:"true"`
	// token symbol:USDC,USDT,etc
	TokenSymbol *string `json:"token_symbol,omitempty" xml:"token_symbol,omitempty" require:"true"`
	// quotaType:DEPOSIT/WITHDRAWAL
	QuotaType *string `json:"quota_type,omitempty" xml:"quota_type,omitempty" require:"true"`
}

func (s QueryDacQuotaRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDacQuotaRequest) GoString() string {
	return s.String()
}

func (s *QueryDacQuotaRequest) SetAuthToken(v string) *QueryDacQuotaRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDacQuotaRequest) SetProductInstanceId(v string) *QueryDacQuotaRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryDacQuotaRequest) SetExternalCustomerId(v string) *QueryDacQuotaRequest {
	s.ExternalCustomerId = &v
	return s
}

func (s *QueryDacQuotaRequest) SetBlockchain(v string) *QueryDacQuotaRequest {
	s.Blockchain = &v
	return s
}

func (s *QueryDacQuotaRequest) SetTokenSymbol(v string) *QueryDacQuotaRequest {
	s.TokenSymbol = &v
	return s
}

func (s *QueryDacQuotaRequest) SetQuotaType(v string) *QueryDacQuotaRequest {
	s.QuotaType = &v
	return s
}

type QueryDacQuotaResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// quotaType:DEPOSIT/WITHDRAWAL
	QuotaType *string `json:"quota_type,omitempty" xml:"quota_type,omitempty"`
	// quotaAmount
	QuotaAmount *string `json:"quota_amount,omitempty" xml:"quota_amount,omitempty"`
}

func (s QueryDacQuotaResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDacQuotaResponse) GoString() string {
	return s.String()
}

func (s *QueryDacQuotaResponse) SetReqMsgId(v string) *QueryDacQuotaResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDacQuotaResponse) SetResultCode(v string) *QueryDacQuotaResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDacQuotaResponse) SetResultMsg(v string) *QueryDacQuotaResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDacQuotaResponse) SetQuotaType(v string) *QueryDacQuotaResponse {
	s.QuotaType = &v
	return s
}

func (s *QueryDacQuotaResponse) SetQuotaAmount(v string) *QueryDacQuotaResponse {
	s.QuotaAmount = &v
	return s
}

type QueryDacCustodyaddressRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 区块链名称
	Blockchain *string `json:"blockchain,omitempty" xml:"blockchain,omitempty" require:"true"`
	// 外部客户唯一id
	ExternalCustomerId *string `json:"external_customer_id,omitempty" xml:"external_customer_id,omitempty" require:"true"`
}

func (s QueryDacCustodyaddressRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDacCustodyaddressRequest) GoString() string {
	return s.String()
}

func (s *QueryDacCustodyaddressRequest) SetAuthToken(v string) *QueryDacCustodyaddressRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDacCustodyaddressRequest) SetProductInstanceId(v string) *QueryDacCustodyaddressRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryDacCustodyaddressRequest) SetBlockchain(v string) *QueryDacCustodyaddressRequest {
	s.Blockchain = &v
	return s
}

func (s *QueryDacCustodyaddressRequest) SetExternalCustomerId(v string) *QueryDacCustodyaddressRequest {
	s.ExternalCustomerId = &v
	return s
}

type QueryDacCustodyaddressResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 用户特定区块链的托管钱包地址，用于deposit转账使用
	CustodyAddress *string `json:"custody_address,omitempty" xml:"custody_address,omitempty"`
}

func (s QueryDacCustodyaddressResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDacCustodyaddressResponse) GoString() string {
	return s.String()
}

func (s *QueryDacCustodyaddressResponse) SetReqMsgId(v string) *QueryDacCustodyaddressResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDacCustodyaddressResponse) SetResultCode(v string) *QueryDacCustodyaddressResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDacCustodyaddressResponse) SetResultMsg(v string) *QueryDacCustodyaddressResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDacCustodyaddressResponse) SetCustodyAddress(v string) *QueryDacCustodyaddressResponse {
	s.CustodyAddress = &v
	return s
}

type CreateDacDepositRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 白名单地址为交易from的地址，用于发起转账操作
	WhitelistAddress *string `json:"whitelist_address,omitempty" xml:"whitelist_address,omitempty" require:"true"`
	// 存入的金额，可以为整数，或者携带小数位，除以精度之后的值
	DepositAmount *string `json:"deposit_amount,omitempty" xml:"deposit_amount,omitempty" require:"true"`
	// 区块链名称
	Blockchain *string `json:"blockchain,omitempty" xml:"blockchain,omitempty" require:"true"`
	// token名称
	TokenSymbol *string `json:"token_symbol,omitempty" xml:"token_symbol,omitempty" require:"true"`
	// 外部客户唯一id
	ExternalCustomerId *string `json:"external_customer_id,omitempty" xml:"external_customer_id,omitempty" require:"true"`
}

func (s CreateDacDepositRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateDacDepositRequest) GoString() string {
	return s.String()
}

func (s *CreateDacDepositRequest) SetAuthToken(v string) *CreateDacDepositRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateDacDepositRequest) SetProductInstanceId(v string) *CreateDacDepositRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateDacDepositRequest) SetWhitelistAddress(v string) *CreateDacDepositRequest {
	s.WhitelistAddress = &v
	return s
}

func (s *CreateDacDepositRequest) SetDepositAmount(v string) *CreateDacDepositRequest {
	s.DepositAmount = &v
	return s
}

func (s *CreateDacDepositRequest) SetBlockchain(v string) *CreateDacDepositRequest {
	s.Blockchain = &v
	return s
}

func (s *CreateDacDepositRequest) SetTokenSymbol(v string) *CreateDacDepositRequest {
	s.TokenSymbol = &v
	return s
}

func (s *CreateDacDepositRequest) SetExternalCustomerId(v string) *CreateDacDepositRequest {
	s.ExternalCustomerId = &v
	return s
}

type CreateDacDepositResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 订单id，订单创建失败时这个值为空
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty"`
}

func (s CreateDacDepositResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateDacDepositResponse) GoString() string {
	return s.String()
}

func (s *CreateDacDepositResponse) SetReqMsgId(v string) *CreateDacDepositResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateDacDepositResponse) SetResultCode(v string) *CreateDacDepositResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateDacDepositResponse) SetResultMsg(v string) *CreateDacDepositResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateDacDepositResponse) SetOrderId(v string) *CreateDacDepositResponse {
	s.OrderId = &v
	return s
}

type PagequeryDacDepositRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 查询第几页，从1开始
	Current *int64 `json:"current,omitempty" xml:"current,omitempty" require:"true"`
	// 每页展示多少条，默认10
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
	// 外部用户唯一id
	ExternalCustomerId *string `json:"external_customer_id,omitempty" xml:"external_customer_id,omitempty" require:"true"`
}

func (s PagequeryDacDepositRequest) String() string {
	return tea.Prettify(s)
}

func (s PagequeryDacDepositRequest) GoString() string {
	return s.String()
}

func (s *PagequeryDacDepositRequest) SetAuthToken(v string) *PagequeryDacDepositRequest {
	s.AuthToken = &v
	return s
}

func (s *PagequeryDacDepositRequest) SetProductInstanceId(v string) *PagequeryDacDepositRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PagequeryDacDepositRequest) SetCurrent(v int64) *PagequeryDacDepositRequest {
	s.Current = &v
	return s
}

func (s *PagequeryDacDepositRequest) SetPageSize(v int64) *PagequeryDacDepositRequest {
	s.PageSize = &v
	return s
}

func (s *PagequeryDacDepositRequest) SetExternalCustomerId(v string) *PagequeryDacDepositRequest {
	s.ExternalCustomerId = &v
	return s
}

type PagequeryDacDepositResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 当前第几页，为请求的参数值
	Current *int64 `json:"current,omitempty" xml:"current,omitempty"`
	// 默认每页展示多少条，为请求的参数值
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// 一共列表有多少条数据
	Total *int64 `json:"total,omitempty" xml:"total,omitempty"`
	// deposit订单信息列表
	List []*QueryDepositOrderInfoResponse `json:"list,omitempty" xml:"list,omitempty" type:"Repeated"`
}

func (s PagequeryDacDepositResponse) String() string {
	return tea.Prettify(s)
}

func (s PagequeryDacDepositResponse) GoString() string {
	return s.String()
}

func (s *PagequeryDacDepositResponse) SetReqMsgId(v string) *PagequeryDacDepositResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PagequeryDacDepositResponse) SetResultCode(v string) *PagequeryDacDepositResponse {
	s.ResultCode = &v
	return s
}

func (s *PagequeryDacDepositResponse) SetResultMsg(v string) *PagequeryDacDepositResponse {
	s.ResultMsg = &v
	return s
}

func (s *PagequeryDacDepositResponse) SetCurrent(v int64) *PagequeryDacDepositResponse {
	s.Current = &v
	return s
}

func (s *PagequeryDacDepositResponse) SetPageSize(v int64) *PagequeryDacDepositResponse {
	s.PageSize = &v
	return s
}

func (s *PagequeryDacDepositResponse) SetTotal(v int64) *PagequeryDacDepositResponse {
	s.Total = &v
	return s
}

func (s *PagequeryDacDepositResponse) SetList(v []*QueryDepositOrderInfoResponse) *PagequeryDacDepositResponse {
	s.List = v
	return s
}

type QueryDacDepositlimitsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 外部用户唯一id
	ExternalCustomerId *string `json:"external_customer_id,omitempty" xml:"external_customer_id,omitempty" require:"true"`
	// 代币名称
	TokenSymbol *string `json:"token_symbol,omitempty" xml:"token_symbol,omitempty" require:"true"`
}

func (s QueryDacDepositlimitsRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDacDepositlimitsRequest) GoString() string {
	return s.String()
}

func (s *QueryDacDepositlimitsRequest) SetAuthToken(v string) *QueryDacDepositlimitsRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDacDepositlimitsRequest) SetProductInstanceId(v string) *QueryDacDepositlimitsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryDacDepositlimitsRequest) SetExternalCustomerId(v string) *QueryDacDepositlimitsRequest {
	s.ExternalCustomerId = &v
	return s
}

func (s *QueryDacDepositlimitsRequest) SetTokenSymbol(v string) *QueryDacDepositlimitsRequest {
	s.TokenSymbol = &v
	return s
}

type QueryDacDepositlimitsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 可以deposit的最大金额
	DepositMaxAmount *string `json:"deposit_max_amount,omitempty" xml:"deposit_max_amount,omitempty"`
	// 可以deposit的最小金额
	DepositMinAmount *string `json:"deposit_min_amount,omitempty" xml:"deposit_min_amount,omitempty"`
}

func (s QueryDacDepositlimitsResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDacDepositlimitsResponse) GoString() string {
	return s.String()
}

func (s *QueryDacDepositlimitsResponse) SetReqMsgId(v string) *QueryDacDepositlimitsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDacDepositlimitsResponse) SetResultCode(v string) *QueryDacDepositlimitsResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDacDepositlimitsResponse) SetResultMsg(v string) *QueryDacDepositlimitsResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDacDepositlimitsResponse) SetDepositMaxAmount(v string) *QueryDacDepositlimitsResponse {
	s.DepositMaxAmount = &v
	return s
}

func (s *QueryDacDepositlimitsResponse) SetDepositMinAmount(v string) *QueryDacDepositlimitsResponse {
	s.DepositMinAmount = &v
	return s
}

type PagequeryDacWhitelistRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 当前第几个分页，默认为1
	Current *int64 `json:"current,omitempty" xml:"current,omitempty" require:"true"`
	// 每页展示条数，默认为10
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
	// 外部用户唯一id
	ExternalCustomerId *string `json:"external_customer_id,omitempty" xml:"external_customer_id,omitempty" require:"true"`
}

func (s PagequeryDacWhitelistRequest) String() string {
	return tea.Prettify(s)
}

func (s PagequeryDacWhitelistRequest) GoString() string {
	return s.String()
}

func (s *PagequeryDacWhitelistRequest) SetAuthToken(v string) *PagequeryDacWhitelistRequest {
	s.AuthToken = &v
	return s
}

func (s *PagequeryDacWhitelistRequest) SetProductInstanceId(v string) *PagequeryDacWhitelistRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PagequeryDacWhitelistRequest) SetCurrent(v int64) *PagequeryDacWhitelistRequest {
	s.Current = &v
	return s
}

func (s *PagequeryDacWhitelistRequest) SetPageSize(v int64) *PagequeryDacWhitelistRequest {
	s.PageSize = &v
	return s
}

func (s *PagequeryDacWhitelistRequest) SetExternalCustomerId(v string) *PagequeryDacWhitelistRequest {
	s.ExternalCustomerId = &v
	return s
}

type PagequeryDacWhitelistResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 当前第几页，为前端的请求值
	Current *int64 `json:"current,omitempty" xml:"current,omitempty"`
	// 每页展示多少条，为前端的请求值
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// 总共有多少条数据
	Total *int64 `json:"total,omitempty" xml:"total,omitempty"`
	// 返回白名单列表
	List []*QueryWhitelistAddressResponse `json:"list,omitempty" xml:"list,omitempty" type:"Repeated"`
}

func (s PagequeryDacWhitelistResponse) String() string {
	return tea.Prettify(s)
}

func (s PagequeryDacWhitelistResponse) GoString() string {
	return s.String()
}

func (s *PagequeryDacWhitelistResponse) SetReqMsgId(v string) *PagequeryDacWhitelistResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PagequeryDacWhitelistResponse) SetResultCode(v string) *PagequeryDacWhitelistResponse {
	s.ResultCode = &v
	return s
}

func (s *PagequeryDacWhitelistResponse) SetResultMsg(v string) *PagequeryDacWhitelistResponse {
	s.ResultMsg = &v
	return s
}

func (s *PagequeryDacWhitelistResponse) SetCurrent(v int64) *PagequeryDacWhitelistResponse {
	s.Current = &v
	return s
}

func (s *PagequeryDacWhitelistResponse) SetPageSize(v int64) *PagequeryDacWhitelistResponse {
	s.PageSize = &v
	return s
}

func (s *PagequeryDacWhitelistResponse) SetTotal(v int64) *PagequeryDacWhitelistResponse {
	s.Total = &v
	return s
}

func (s *PagequeryDacWhitelistResponse) SetList(v []*QueryWhitelistAddressResponse) *PagequeryDacWhitelistResponse {
	s.List = v
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
				"sdk_version":      tea.String("1.0.7"),
				"_prod_code":       tea.String("WEBTTS"),
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
 * Description: Withdraw Token
 * Summary: Withdraw Token
 */
func (client *Client) WithdrawDacVault(request *WithdrawDacVaultRequest) (_result *WithdrawDacVaultResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &WithdrawDacVaultResponse{}
	_body, _err := client.WithdrawDacVaultEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: Withdraw Token
 * Summary: Withdraw Token
 */
func (client *Client) WithdrawDacVaultEx(request *WithdrawDacVaultRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *WithdrawDacVaultResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &WithdrawDacVaultResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.webtts.dac.vault.withdraw"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 开通托管服务
 * Summary: 开通托管服务
 */
func (client *Client) OpenActivate(request *OpenActivateRequest) (_result *OpenActivateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &OpenActivateResponse{}
	_body, _err := client.OpenActivateEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 开通托管服务
 * Summary: 开通托管服务
 */
func (client *Client) OpenActivateEx(request *OpenActivateRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *OpenActivateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &OpenActivateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.webtts.activate.open"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 关闭托管服务
 * Summary: 关闭托管服务
 */
func (client *Client) StopActivate(request *StopActivateRequest) (_result *StopActivateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &StopActivateResponse{}
	_body, _err := client.StopActivateEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 关闭托管服务
 * Summary: 关闭托管服务
 */
func (client *Client) StopActivateEx(request *StopActivateRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *StopActivateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &StopActivateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.webtts.activate.stop"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 分页查询支持的区块链
 * Summary: 分页查询支持的区块链
 */
func (client *Client) PagequeryDacBlockchain(request *PagequeryDacBlockchainRequest) (_result *PagequeryDacBlockchainResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PagequeryDacBlockchainResponse{}
	_body, _err := client.PagequeryDacBlockchainEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 分页查询支持的区块链
 * Summary: 分页查询支持的区块链
 */
func (client *Client) PagequeryDacBlockchainEx(request *PagequeryDacBlockchainRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PagequeryDacBlockchainResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PagequeryDacBlockchainResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.webtts.dac.blockchain.pagequery"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 分页查询支持的币种
 * Summary: 分页查询支持的币种
 */
func (client *Client) PagequeryDacToken(request *PagequeryDacTokenRequest) (_result *PagequeryDacTokenResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PagequeryDacTokenResponse{}
	_body, _err := client.PagequeryDacTokenEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 分页查询支持的币种
 * Summary: 分页查询支持的币种
 */
func (client *Client) PagequeryDacTokenEx(request *PagequeryDacTokenRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PagequeryDacTokenResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PagequeryDacTokenResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.webtts.dac.token.pagequery"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 添加白名单服务
 * Summary: 添加白名单服务
 */
func (client *Client) AddDacWhitelist(request *AddDacWhitelistRequest) (_result *AddDacWhitelistResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AddDacWhitelistResponse{}
	_body, _err := client.AddDacWhitelistEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 添加白名单服务
 * Summary: 添加白名单服务
 */
func (client *Client) AddDacWhitelistEx(request *AddDacWhitelistRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AddDacWhitelistResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AddDacWhitelistResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.webtts.dac.whitelist.add"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 白名单地址检查
 * Summary: 白名单地址检查
 */
func (client *Client) CheckDacWhitelist(request *CheckDacWhitelistRequest) (_result *CheckDacWhitelistResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CheckDacWhitelistResponse{}
	_body, _err := client.CheckDacWhitelistEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 白名单地址检查
 * Summary: 白名单地址检查
 */
func (client *Client) CheckDacWhitelistEx(request *CheckDacWhitelistRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CheckDacWhitelistResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CheckDacWhitelistResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.webtts.dac.whitelist.check"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: Query customer quota and return the comparative balance between customer quota and customer balance
查询提现最大金额，会对比个人提现额度和自有余额，取最小值。
 * Summary: 查询提现最大金额
*/
func (client *Client) QueryDacQuota(request *QueryDacQuotaRequest) (_result *QueryDacQuotaResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDacQuotaResponse{}
	_body, _err := client.QueryDacQuotaEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: Query customer quota and return the comparative balance between customer quota and customer balance
查询提现最大金额，会对比个人提现额度和自有余额，取最小值。
 * Summary: 查询提现最大金额
*/
func (client *Client) QueryDacQuotaEx(request *QueryDacQuotaRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDacQuotaResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDacQuotaResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.webtts.dac.quota.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询指定用户和区块链的托管钱包地址
 * Summary: 查询托管地址
 */
func (client *Client) QueryDacCustodyaddress(request *QueryDacCustodyaddressRequest) (_result *QueryDacCustodyaddressResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDacCustodyaddressResponse{}
	_body, _err := client.QueryDacCustodyaddressEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询指定用户和区块链的托管钱包地址
 * Summary: 查询托管地址
 */
func (client *Client) QueryDacCustodyaddressEx(request *QueryDacCustodyaddressRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDacCustodyaddressResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDacCustodyaddressResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.webtts.dac.custodyaddress.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建deposit订单
 * Summary: 创建deposit订单
 */
func (client *Client) CreateDacDeposit(request *CreateDacDepositRequest) (_result *CreateDacDepositResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateDacDepositResponse{}
	_body, _err := client.CreateDacDepositEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建deposit订单
 * Summary: 创建deposit订单
 */
func (client *Client) CreateDacDepositEx(request *CreateDacDepositRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateDacDepositResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateDacDepositResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.webtts.dac.deposit.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 分页查询deposit订单列表
 * Summary: 分页查询deposit订单列表
 */
func (client *Client) PagequeryDacDeposit(request *PagequeryDacDepositRequest) (_result *PagequeryDacDepositResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PagequeryDacDepositResponse{}
	_body, _err := client.PagequeryDacDepositEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 分页查询deposit订单列表
 * Summary: 分页查询deposit订单列表
 */
func (client *Client) PagequeryDacDepositEx(request *PagequeryDacDepositRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PagequeryDacDepositResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PagequeryDacDepositResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.webtts.dac.deposit.pagequery"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询最大/最小可以deposit的数量
 * Summary: 查询最大/最小可以deposit的数量
 */
func (client *Client) QueryDacDepositlimits(request *QueryDacDepositlimitsRequest) (_result *QueryDacDepositlimitsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDacDepositlimitsResponse{}
	_body, _err := client.QueryDacDepositlimitsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询最大/最小可以deposit的数量
 * Summary: 查询最大/最小可以deposit的数量
 */
func (client *Client) QueryDacDepositlimitsEx(request *QueryDacDepositlimitsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDacDepositlimitsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDacDepositlimitsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.webtts.dac.depositlimits.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 白名单分页列表查询
 * Summary: 白名单分页列表查询
 */
func (client *Client) PagequeryDacWhitelist(request *PagequeryDacWhitelistRequest) (_result *PagequeryDacWhitelistResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PagequeryDacWhitelistResponse{}
	_body, _err := client.PagequeryDacWhitelistEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 白名单分页列表查询
 * Summary: 白名单分页列表查询
 */
func (client *Client) PagequeryDacWhitelistEx(request *PagequeryDacWhitelistRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PagequeryDacWhitelistResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PagequeryDacWhitelistResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.webtts.dac.whitelist.pagequery"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
