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

// 收益模型
type Revenue struct {
	// 收益币种，目前仅支持CNY
	Currency *string `json:"currency,omitempty" xml:"currency,omitempty" require:"true"`
	// 收益金额，单位为分
	Value *int64 `json:"value,omitempty" xml:"value,omitempty" require:"true"`
}

func (s Revenue) String() string {
	return tea.Prettify(s)
}

func (s Revenue) GoString() string {
	return s.String()
}

func (s *Revenue) SetCurrency(v string) *Revenue {
	s.Currency = &v
	return s
}

func (s *Revenue) SetValue(v int64) *Revenue {
	s.Value = &v
	return s
}

// 交易订单信息
type TradeOrder struct {
	// 订单唯一编号
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty" require:"true"`
	// 订单原始金额，单位分
	OriginalTotalAmount *int64 `json:"original_total_amount,omitempty" xml:"original_total_amount,omitempty" require:"true"`
	// 订单实付金额，单位分
	ActualTotalAmount *int64 `json:"actual_total_amount,omitempty" xml:"actual_total_amount,omitempty" require:"true"`
	// 数量
	ItemCount *int64 `json:"item_count,omitempty" xml:"item_count,omitempty" require:"true"`
	// 币种，暂时只支持人民币 CNY
	Currency *string `json:"currency,omitempty" xml:"currency,omitempty"`
}

func (s TradeOrder) String() string {
	return tea.Prettify(s)
}

func (s TradeOrder) GoString() string {
	return s.String()
}

func (s *TradeOrder) SetOrderNo(v string) *TradeOrder {
	s.OrderNo = &v
	return s
}

func (s *TradeOrder) SetOriginalTotalAmount(v int64) *TradeOrder {
	s.OriginalTotalAmount = &v
	return s
}

func (s *TradeOrder) SetActualTotalAmount(v int64) *TradeOrder {
	s.ActualTotalAmount = &v
	return s
}

func (s *TradeOrder) SetItemCount(v int64) *TradeOrder {
	s.ItemCount = &v
	return s
}

func (s *TradeOrder) SetCurrency(v string) *TradeOrder {
	s.Currency = &v
	return s
}

// 发放区间信息
type Stage struct {
	// 票数区间上限
	UpperLimit *int64 `json:"upper_limit,omitempty" xml:"upper_limit,omitempty" require:"true"`
	// 票数区间下限
	LowerLimit *int64 `json:"lower_limit,omitempty" xml:"lower_limit,omitempty" require:"true"`
	// 当前区间粉丝粒数量，单位分个
	TokenAmount *int64 `json:"token_amount,omitempty" xml:"token_amount,omitempty" require:"true"`
	// 当前区间粉丝粒价格，单位分
	TokenPrice *int64 `json:"token_price,omitempty" xml:"token_price,omitempty" require:"true"`
}

func (s Stage) String() string {
	return tea.Prettify(s)
}

func (s Stage) GoString() string {
	return s.String()
}

func (s *Stage) SetUpperLimit(v int64) *Stage {
	s.UpperLimit = &v
	return s
}

func (s *Stage) SetLowerLimit(v int64) *Stage {
	s.LowerLimit = &v
	return s
}

func (s *Stage) SetTokenAmount(v int64) *Stage {
	s.TokenAmount = &v
	return s
}

func (s *Stage) SetTokenPrice(v int64) *Stage {
	s.TokenPrice = &v
	return s
}

// 项目
type Project struct {
	// 项目对应的合约 ID
	ContractId *string `json:"contract_id,omitempty" xml:"contract_id,omitempty"`
	// 项目结束时间，精确到毫秒，FILM类型订单必填
	ProjectEndTime *string `json:"project_end_time,omitempty" xml:"project_end_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 项目ID
	ProjectId *string `json:"project_id,omitempty" xml:"project_id,omitempty" require:"true"`
	// 项目名称
	ProjectName *string `json:"project_name,omitempty" xml:"project_name,omitempty"`
	// 项目开始时间，精确到毫秒，FILM类型订单必填
	ProjectStartTime *string `json:"project_start_time,omitempty" xml:"project_start_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 项目类型，目前支持FILM：电影，CAR：汽车
	ProjectType *string `json:"project_type,omitempty" xml:"project_type,omitempty" require:"true"`
}

func (s Project) String() string {
	return tea.Prettify(s)
}

func (s Project) GoString() string {
	return s.String()
}

func (s *Project) SetContractId(v string) *Project {
	s.ContractId = &v
	return s
}

func (s *Project) SetProjectEndTime(v string) *Project {
	s.ProjectEndTime = &v
	return s
}

func (s *Project) SetProjectId(v string) *Project {
	s.ProjectId = &v
	return s
}

func (s *Project) SetProjectName(v string) *Project {
	s.ProjectName = &v
	return s
}

func (s *Project) SetProjectStartTime(v string) *Project {
	s.ProjectStartTime = &v
	return s
}

func (s *Project) SetProjectType(v string) *Project {
	s.ProjectType = &v
	return s
}

// 粉丝粒操作流水
type TokenOperationDetail struct {
	// 粉丝粒操作流水状态，pending：发放中，confirmed：已到账，canceled：已取消
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 粉丝粒数量，单位分个
	TokenAmount *int64 `json:"token_amount,omitempty" xml:"token_amount,omitempty" require:"true"`
	// 明细发生时间
	Time *string `json:"time,omitempty" xml:"time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 明细信息
	Info *string `json:"info,omitempty" xml:"info,omitempty" require:"true"`
	// 唯一业务单号
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 订单编号
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty" require:"true"`
}

func (s TokenOperationDetail) String() string {
	return tea.Prettify(s)
}

func (s TokenOperationDetail) GoString() string {
	return s.String()
}

func (s *TokenOperationDetail) SetStatus(v string) *TokenOperationDetail {
	s.Status = &v
	return s
}

func (s *TokenOperationDetail) SetTokenAmount(v int64) *TokenOperationDetail {
	s.TokenAmount = &v
	return s
}

func (s *TokenOperationDetail) SetTime(v string) *TokenOperationDetail {
	s.Time = &v
	return s
}

func (s *TokenOperationDetail) SetInfo(v string) *TokenOperationDetail {
	s.Info = &v
	return s
}

func (s *TokenOperationDetail) SetBizId(v string) *TokenOperationDetail {
	s.BizId = &v
	return s
}

func (s *TokenOperationDetail) SetOrderNo(v string) *TokenOperationDetail {
	s.OrderNo = &v
	return s
}

// 用户收益明细
type UserRevenueDetail struct {
	// 累计收益
	AccumulativeRevenue *Revenue `json:"accumulative_revenue,omitempty" xml:"accumulative_revenue,omitempty" require:"true"`
	// 待发放粉丝粒数量，单位分个。
	PendingTokenAmount *int64 `json:"pending_token_amount,omitempty" xml:"pending_token_amount,omitempty" require:"true"`
	// 作品名称
	ProjectName *string `json:"project_name,omitempty" xml:"project_name,omitempty" require:"true"`
	// 可兑现粉丝粒数量，单位分个。
	RedeemableTokenAmount *int64 `json:"redeemable_token_amount,omitempty" xml:"redeemable_token_amount,omitempty" require:"true"`
	// 已兑现粉丝粒数量，单位分个
	RedeemedTokenAmount *int64 `json:"redeemed_token_amount,omitempty" xml:"redeemed_token_amount,omitempty" require:"true"`
	// 已发放粉丝粒数量，单位分个。
	ReleasedTokenAmount *int64 `json:"released_token_amount,omitempty" xml:"released_token_amount,omitempty" require:"true"`
	// 粉丝粒单价，单位分
	TokenPrice *int64 `json:"token_price,omitempty" xml:"token_price,omitempty" require:"true"`
	// 可零收益
	WithdrawRevenue *Revenue `json:"withdraw_revenue,omitempty" xml:"withdraw_revenue,omitempty" require:"true"`
}

func (s UserRevenueDetail) String() string {
	return tea.Prettify(s)
}

func (s UserRevenueDetail) GoString() string {
	return s.String()
}

func (s *UserRevenueDetail) SetAccumulativeRevenue(v *Revenue) *UserRevenueDetail {
	s.AccumulativeRevenue = v
	return s
}

func (s *UserRevenueDetail) SetPendingTokenAmount(v int64) *UserRevenueDetail {
	s.PendingTokenAmount = &v
	return s
}

func (s *UserRevenueDetail) SetProjectName(v string) *UserRevenueDetail {
	s.ProjectName = &v
	return s
}

func (s *UserRevenueDetail) SetRedeemableTokenAmount(v int64) *UserRevenueDetail {
	s.RedeemableTokenAmount = &v
	return s
}

func (s *UserRevenueDetail) SetRedeemedTokenAmount(v int64) *UserRevenueDetail {
	s.RedeemedTokenAmount = &v
	return s
}

func (s *UserRevenueDetail) SetReleasedTokenAmount(v int64) *UserRevenueDetail {
	s.ReleasedTokenAmount = &v
	return s
}

func (s *UserRevenueDetail) SetTokenPrice(v int64) *UserRevenueDetail {
	s.TokenPrice = &v
	return s
}

func (s *UserRevenueDetail) SetWithdrawRevenue(v *Revenue) *UserRevenueDetail {
	s.WithdrawRevenue = v
	return s
}

// 用户资产明细
type UserAssetDetail struct {
	// 粉丝粒变化数量，带符号整数，单位分个。
	Asset *int64 `json:"asset,omitempty" xml:"asset,omitempty" require:"true"`
	// 资产类型：PRE_ALLOCATION（待发放），RELEASED（已到账），CANCELLED（已取消），REDEEMING（兑现中），REDEEMED（已兑现）
	AssetType *string `json:"asset_type,omitempty" xml:"asset_type,omitempty" require:"true"`
	// 业务单号
	BizNo *string `json:"biz_no,omitempty" xml:"biz_no,omitempty" require:"true"`
	// 事件时间，时区GMT+8，精确到毫秒。
	EventTime *string `json:"event_time,omitempty" xml:"event_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 备注信息
	Memo *string `json:"memo,omitempty" xml:"memo,omitempty" require:"true"`
	// 项目名称
	ProjectName *string `json:"project_name,omitempty" xml:"project_name,omitempty" require:"true"`
	// 收益变化额度，单位为分。
	Revenue *Revenue `json:"revenue,omitempty" xml:"revenue,omitempty" require:"true"`
}

func (s UserAssetDetail) String() string {
	return tea.Prettify(s)
}

func (s UserAssetDetail) GoString() string {
	return s.String()
}

func (s *UserAssetDetail) SetAsset(v int64) *UserAssetDetail {
	s.Asset = &v
	return s
}

func (s *UserAssetDetail) SetAssetType(v string) *UserAssetDetail {
	s.AssetType = &v
	return s
}

func (s *UserAssetDetail) SetBizNo(v string) *UserAssetDetail {
	s.BizNo = &v
	return s
}

func (s *UserAssetDetail) SetEventTime(v string) *UserAssetDetail {
	s.EventTime = &v
	return s
}

func (s *UserAssetDetail) SetMemo(v string) *UserAssetDetail {
	s.Memo = &v
	return s
}

func (s *UserAssetDetail) SetProjectName(v string) *UserAssetDetail {
	s.ProjectName = &v
	return s
}

func (s *UserAssetDetail) SetRevenue(v *Revenue) *UserAssetDetail {
	s.Revenue = v
	return s
}

// 用户资产信息
type AssetDetail struct {
	// Token获得类型
	GainType *string `json:"gain_type,omitempty" xml:"gain_type,omitempty" require:"true"`
	// Token发放状态
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 购票数
	TicketNumber *int64 `json:"ticket_number,omitempty" xml:"ticket_number,omitempty" require:"true"`
	// Token数，单位为分个，1分个=0.01个
	Token *int64 `json:"token,omitempty" xml:"token,omitempty" require:"true"`
	// Token展示数
	TokenDisplay *string `json:"token_display,omitempty" xml:"token_display,omitempty" require:"true"`
	// 用户昵称
	Nickname *string `json:"nickname,omitempty" xml:"nickname,omitempty" require:"true"`
}

func (s AssetDetail) String() string {
	return tea.Prettify(s)
}

func (s AssetDetail) GoString() string {
	return s.String()
}

func (s *AssetDetail) SetGainType(v string) *AssetDetail {
	s.GainType = &v
	return s
}

func (s *AssetDetail) SetStatus(v string) *AssetDetail {
	s.Status = &v
	return s
}

func (s *AssetDetail) SetTicketNumber(v int64) *AssetDetail {
	s.TicketNumber = &v
	return s
}

func (s *AssetDetail) SetToken(v int64) *AssetDetail {
	s.Token = &v
	return s
}

func (s *AssetDetail) SetTokenDisplay(v string) *AssetDetail {
	s.TokenDisplay = &v
	return s
}

func (s *AssetDetail) SetNickname(v string) *AssetDetail {
	s.Nickname = &v
	return s
}

// 订单详情
type Order struct {
	// 实付金额，单位分
	ActualTotalAmount *int64 `json:"actual_total_amount,omitempty" xml:"actual_total_amount,omitempty" require:"true"`
	// 币种，目前仅支持 CNY
	Currency *string `json:"currency,omitempty" xml:"currency,omitempty"`
	// 数量
	ItemCount *int64 `json:"item_count,omitempty" xml:"item_count,omitempty" require:"true"`
	// 唯一订单号
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty" require:"true"`
	// 订单状态，ORDER_CREATE：订单创建，ORDER_CANCEL：订单取消
	OrderStatus *string `json:"order_status,omitempty" xml:"order_status,omitempty" require:"true"`
	// 原始金额，单位分
	OriginalTotalAmount *int64 `json:"original_total_amount,omitempty" xml:"original_total_amount,omitempty" require:"true"`
	// 确认类型，DIRECT：直接发放，TWO_STEP：两部发放。该字段可为空，默认为 TWO_STEP
	ConfirmType *string `json:"confirm_type,omitempty" xml:"confirm_type,omitempty"`
}

func (s Order) String() string {
	return tea.Prettify(s)
}

func (s Order) GoString() string {
	return s.String()
}

func (s *Order) SetActualTotalAmount(v int64) *Order {
	s.ActualTotalAmount = &v
	return s
}

func (s *Order) SetCurrency(v string) *Order {
	s.Currency = &v
	return s
}

func (s *Order) SetItemCount(v int64) *Order {
	s.ItemCount = &v
	return s
}

func (s *Order) SetOrderNo(v string) *Order {
	s.OrderNo = &v
	return s
}

func (s *Order) SetOrderStatus(v string) *Order {
	s.OrderStatus = &v
	return s
}

func (s *Order) SetOriginalTotalAmount(v int64) *Order {
	s.OriginalTotalAmount = &v
	return s
}

func (s *Order) SetConfirmType(v string) *Order {
	s.ConfirmType = &v
	return s
}

// 金额模型
type Money struct {
	// 金额，单位分
	Value *int64 `json:"value,omitempty" xml:"value,omitempty" require:"true"`
	// 币种，暂只支持人民币CNY
	Currency *string `json:"currency,omitempty" xml:"currency,omitempty" require:"true"`
}

func (s Money) String() string {
	return tea.Prettify(s)
}

func (s Money) GoString() string {
	return s.String()
}

func (s *Money) SetValue(v int64) *Money {
	s.Value = &v
	return s
}

func (s *Money) SetCurrency(v string) *Money {
	s.Currency = &v
	return s
}

// 当前用户收益
type CurrentRevenue struct {
	// 币种，当前仅支持CNY
	Currency *string `json:"currency,omitempty" xml:"currency,omitempty" require:"true"`
	// 金额，单位为分
	Value *int64 `json:"value,omitempty" xml:"value,omitempty" require:"true"`
}

func (s CurrentRevenue) String() string {
	return tea.Prettify(s)
}

func (s CurrentRevenue) GoString() string {
	return s.String()
}

func (s *CurrentRevenue) SetCurrency(v string) *CurrentRevenue {
	s.Currency = &v
	return s
}

func (s *CurrentRevenue) SetValue(v int64) *CurrentRevenue {
	s.Value = &v
	return s
}

// 累计全部参与收益
type AccumulativeRevenue struct {
	// 币种，当前仅支持 CNY
	Currency *string `json:"currency,omitempty" xml:"currency,omitempty" require:"true"`
	// 金额，单位为分
	Value *int64 `json:"value,omitempty" xml:"value,omitempty" require:"true"`
}

func (s AccumulativeRevenue) String() string {
	return tea.Prettify(s)
}

func (s AccumulativeRevenue) GoString() string {
	return s.String()
}

func (s *AccumulativeRevenue) SetCurrency(v string) *AccumulativeRevenue {
	s.Currency = &v
	return s
}

func (s *AccumulativeRevenue) SetValue(v int64) *AccumulativeRevenue {
	s.Value = &v
	return s
}

// 用户结构体
type User struct {
	// 用户账户，手机号格式为： +区号-手机号，分享码：6位字母，支付宝登录账号：手机号/邮箱
	UserIdNo *string `json:"user_id_no,omitempty" xml:"user_id_no,omitempty" require:"true"`
	// 用户账号类型，当前仅支持手机号和分享码，PHONE：手机号，SHARE_CODE：分享码，
	// ALIPAY_LOGON_ID：支付宝登录账号
	UserIdType *string `json:"user_id_type,omitempty" xml:"user_id_type,omitempty" require:"true"`
}

func (s User) String() string {
	return tea.Prettify(s)
}

func (s User) GoString() string {
	return s.String()
}

func (s *User) SetUserIdNo(v string) *User {
	s.UserIdNo = &v
	return s
}

func (s *User) SetUserIdType(v string) *User {
	s.UserIdType = &v
	return s
}

type QueryCustomerProjectRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 登录支付宝账号，手机号或者邮箱地址
	LogonId *string `json:"logon_id,omitempty" xml:"logon_id,omitempty" require:"true"`
	// 登录账号类型，PHONE 为手机号，EMAIL 为邮箱地址。
	LogonIdType *string `json:"logon_id_type,omitempty" xml:"logon_id_type,omitempty" require:"true"`
}

func (s QueryCustomerProjectRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryCustomerProjectRequest) GoString() string {
	return s.String()
}

func (s *QueryCustomerProjectRequest) SetAuthToken(v string) *QueryCustomerProjectRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryCustomerProjectRequest) SetProductInstanceId(v string) *QueryCustomerProjectRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryCustomerProjectRequest) SetLogonId(v string) *QueryCustomerProjectRequest {
	s.LogonId = &v
	return s
}

func (s *QueryCustomerProjectRequest) SetLogonIdType(v string) *QueryCustomerProjectRequest {
	s.LogonIdType = &v
	return s
}

type QueryCustomerProjectResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 项目列表，元素为项目名称。
	Projects []*Project `json:"projects,omitempty" xml:"projects,omitempty" type:"Repeated"`
}

func (s QueryCustomerProjectResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryCustomerProjectResponse) GoString() string {
	return s.String()
}

func (s *QueryCustomerProjectResponse) SetReqMsgId(v string) *QueryCustomerProjectResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryCustomerProjectResponse) SetResultCode(v string) *QueryCustomerProjectResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryCustomerProjectResponse) SetResultMsg(v string) *QueryCustomerProjectResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryCustomerProjectResponse) SetProjects(v []*Project) *QueryCustomerProjectResponse {
	s.Projects = v
	return s
}

type QueryCustomerDataRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 资产类型：PRE_ALLOCATION（待发放），RELEASED（已到账），CANCELLED（已取消），REDEEMING（兑现中），REDEEMED（已兑现）
	AssetType *string `json:"asset_type,omitempty" xml:"asset_type,omitempty"`
	// 合约ID
	ContractId *string `json:"contract_id,omitempty" xml:"contract_id,omitempty"`
	// 数据类型，ASSET：资产信息， REVENUE：收益信息
	DataType *string `json:"data_type,omitempty" xml:"data_type,omitempty" require:"true"`
	// 截止时间，时区GMT+8，精确到毫秒
	EndTime *string `json:"end_time,omitempty" xml:"end_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 登录支付宝的账号，手机号或者邮箱
	LogonId *string `json:"logon_id,omitempty" xml:"logon_id,omitempty" require:"true"`
	// 登录账号类型，PHONE：手机号， EMAIL：邮箱地址
	LogonIdType *string `json:"logon_id_type,omitempty" xml:"logon_id_type,omitempty" require:"true"`
	// 排序方式，ASC：升序， DESC：降序，默认按照时间降序
	OrderBy *string `json:"order_by,omitempty" xml:"order_by,omitempty"`
	// 页码
	PageNum *int64 `json:"page_num,omitempty" xml:"page_num,omitempty"`
	// 页面大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// 起始时间，时区GMT+8，精确到毫秒
	StartTime *string `json:"start_time,omitempty" xml:"start_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
}

func (s QueryCustomerDataRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryCustomerDataRequest) GoString() string {
	return s.String()
}

func (s *QueryCustomerDataRequest) SetAuthToken(v string) *QueryCustomerDataRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryCustomerDataRequest) SetProductInstanceId(v string) *QueryCustomerDataRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryCustomerDataRequest) SetAssetType(v string) *QueryCustomerDataRequest {
	s.AssetType = &v
	return s
}

func (s *QueryCustomerDataRequest) SetContractId(v string) *QueryCustomerDataRequest {
	s.ContractId = &v
	return s
}

func (s *QueryCustomerDataRequest) SetDataType(v string) *QueryCustomerDataRequest {
	s.DataType = &v
	return s
}

func (s *QueryCustomerDataRequest) SetEndTime(v string) *QueryCustomerDataRequest {
	s.EndTime = &v
	return s
}

func (s *QueryCustomerDataRequest) SetLogonId(v string) *QueryCustomerDataRequest {
	s.LogonId = &v
	return s
}

func (s *QueryCustomerDataRequest) SetLogonIdType(v string) *QueryCustomerDataRequest {
	s.LogonIdType = &v
	return s
}

func (s *QueryCustomerDataRequest) SetOrderBy(v string) *QueryCustomerDataRequest {
	s.OrderBy = &v
	return s
}

func (s *QueryCustomerDataRequest) SetPageNum(v int64) *QueryCustomerDataRequest {
	s.PageNum = &v
	return s
}

func (s *QueryCustomerDataRequest) SetPageSize(v int64) *QueryCustomerDataRequest {
	s.PageSize = &v
	return s
}

func (s *QueryCustomerDataRequest) SetStartTime(v string) *QueryCustomerDataRequest {
	s.StartTime = &v
	return s
}

type QueryCustomerDataResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 数据类型，ASSET：资产信息， REVENUE：收益信息
	DataType *string `json:"data_type,omitempty" xml:"data_type,omitempty"`
	// 登录支付宝的账号，手机号或者邮箱地址
	LogonId *string `json:"logon_id,omitempty" xml:"logon_id,omitempty"`
	// 登录账号类型，PHONE：手机号， EMAIL：电子邮箱
	LogonIdType *string `json:"logon_id_type,omitempty" xml:"logon_id_type,omitempty"`
	// 页码
	PageNum *int64 `json:"page_num,omitempty" xml:"page_num,omitempty"`
	// 页面大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// 总数
	TotalCount *int64 `json:"total_count,omitempty" xml:"total_count,omitempty"`
	// 用户资产信息列表
	UserAssetDetails []*UserAssetDetail `json:"user_asset_details,omitempty" xml:"user_asset_details,omitempty" type:"Repeated"`
	// 用户收益信息
	UserRevenueData *UserRevenueDetail `json:"user_revenue_data,omitempty" xml:"user_revenue_data,omitempty"`
	// 用户虚拟唯一标识
	Vid *string `json:"vid,omitempty" xml:"vid,omitempty"`
}

func (s QueryCustomerDataResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryCustomerDataResponse) GoString() string {
	return s.String()
}

func (s *QueryCustomerDataResponse) SetReqMsgId(v string) *QueryCustomerDataResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryCustomerDataResponse) SetResultCode(v string) *QueryCustomerDataResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryCustomerDataResponse) SetResultMsg(v string) *QueryCustomerDataResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryCustomerDataResponse) SetDataType(v string) *QueryCustomerDataResponse {
	s.DataType = &v
	return s
}

func (s *QueryCustomerDataResponse) SetLogonId(v string) *QueryCustomerDataResponse {
	s.LogonId = &v
	return s
}

func (s *QueryCustomerDataResponse) SetLogonIdType(v string) *QueryCustomerDataResponse {
	s.LogonIdType = &v
	return s
}

func (s *QueryCustomerDataResponse) SetPageNum(v int64) *QueryCustomerDataResponse {
	s.PageNum = &v
	return s
}

func (s *QueryCustomerDataResponse) SetPageSize(v int64) *QueryCustomerDataResponse {
	s.PageSize = &v
	return s
}

func (s *QueryCustomerDataResponse) SetTotalCount(v int64) *QueryCustomerDataResponse {
	s.TotalCount = &v
	return s
}

func (s *QueryCustomerDataResponse) SetUserAssetDetails(v []*UserAssetDetail) *QueryCustomerDataResponse {
	s.UserAssetDetails = v
	return s
}

func (s *QueryCustomerDataResponse) SetUserRevenueData(v *UserRevenueDetail) *QueryCustomerDataResponse {
	s.UserRevenueData = v
	return s
}

func (s *QueryCustomerDataResponse) SetVid(v string) *QueryCustomerDataResponse {
	s.Vid = &v
	return s
}

type GetUserSharecodeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 分享者账号，如果账号类型为手机号则格式如 +86-11 位手机号，如果账号类型为支付宝账号，则填写邮箱地址或者 11 位手机号
	SharerId *string `json:"sharer_id,omitempty" xml:"sharer_id,omitempty" require:"true"`
	// 分享者账号类型，PHONE：手机号，ALIPAY_LOGON_ID：支付宝账号
	SharerIdType *string `json:"sharer_id_type,omitempty" xml:"sharer_id_type,omitempty" require:"true"`
}

func (s GetUserSharecodeRequest) String() string {
	return tea.Prettify(s)
}

func (s GetUserSharecodeRequest) GoString() string {
	return s.String()
}

func (s *GetUserSharecodeRequest) SetAuthToken(v string) *GetUserSharecodeRequest {
	s.AuthToken = &v
	return s
}

func (s *GetUserSharecodeRequest) SetProductInstanceId(v string) *GetUserSharecodeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetUserSharecodeRequest) SetSharerId(v string) *GetUserSharecodeRequest {
	s.SharerId = &v
	return s
}

func (s *GetUserSharecodeRequest) SetSharerIdType(v string) *GetUserSharecodeRequest {
	s.SharerIdType = &v
	return s
}

type GetUserSharecodeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 分享码
	ShareCode *string `json:"share_code,omitempty" xml:"share_code,omitempty"`
}

func (s GetUserSharecodeResponse) String() string {
	return tea.Prettify(s)
}

func (s GetUserSharecodeResponse) GoString() string {
	return s.String()
}

func (s *GetUserSharecodeResponse) SetReqMsgId(v string) *GetUserSharecodeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetUserSharecodeResponse) SetResultCode(v string) *GetUserSharecodeResponse {
	s.ResultCode = &v
	return s
}

func (s *GetUserSharecodeResponse) SetResultMsg(v string) *GetUserSharecodeResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetUserSharecodeResponse) SetShareCode(v string) *GetUserSharecodeResponse {
	s.ShareCode = &v
	return s
}

type SendUserProjectordermsgRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 购买者
	Buyer *User `json:"buyer,omitempty" xml:"buyer,omitempty" require:"true"`
	// 链ID
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty" require:"true"`
	// 订单详情
	Order *Order `json:"order,omitempty" xml:"order,omitempty" require:"true"`
	// 项目信息
	Project *Project `json:"project,omitempty" xml:"project,omitempty" require:"true"`
	// 分享者
	Sharer *User `json:"sharer,omitempty" xml:"sharer,omitempty" require:"true"`
}

func (s SendUserProjectordermsgRequest) String() string {
	return tea.Prettify(s)
}

func (s SendUserProjectordermsgRequest) GoString() string {
	return s.String()
}

func (s *SendUserProjectordermsgRequest) SetAuthToken(v string) *SendUserProjectordermsgRequest {
	s.AuthToken = &v
	return s
}

func (s *SendUserProjectordermsgRequest) SetProductInstanceId(v string) *SendUserProjectordermsgRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SendUserProjectordermsgRequest) SetBuyer(v *User) *SendUserProjectordermsgRequest {
	s.Buyer = v
	return s
}

func (s *SendUserProjectordermsgRequest) SetChainId(v string) *SendUserProjectordermsgRequest {
	s.ChainId = &v
	return s
}

func (s *SendUserProjectordermsgRequest) SetOrder(v *Order) *SendUserProjectordermsgRequest {
	s.Order = v
	return s
}

func (s *SendUserProjectordermsgRequest) SetProject(v *Project) *SendUserProjectordermsgRequest {
	s.Project = v
	return s
}

func (s *SendUserProjectordermsgRequest) SetSharer(v *User) *SendUserProjectordermsgRequest {
	s.Sharer = v
	return s
}

type SendUserProjectordermsgResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s SendUserProjectordermsgResponse) String() string {
	return tea.Prettify(s)
}

func (s SendUserProjectordermsgResponse) GoString() string {
	return s.String()
}

func (s *SendUserProjectordermsgResponse) SetReqMsgId(v string) *SendUserProjectordermsgResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SendUserProjectordermsgResponse) SetResultCode(v string) *SendUserProjectordermsgResponse {
	s.ResultCode = &v
	return s
}

func (s *SendUserProjectordermsgResponse) SetResultMsg(v string) *SendUserProjectordermsgResponse {
	s.ResultMsg = &v
	return s
}

type QueryProjectInfoRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 项目ID
	ProjectId *string `json:"project_id,omitempty" xml:"project_id,omitempty" require:"true"`
}

func (s QueryProjectInfoRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryProjectInfoRequest) GoString() string {
	return s.String()
}

func (s *QueryProjectInfoRequest) SetAuthToken(v string) *QueryProjectInfoRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryProjectInfoRequest) SetProductInstanceId(v string) *QueryProjectInfoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryProjectInfoRequest) SetProjectId(v string) *QueryProjectInfoRequest {
	s.ProjectId = &v
	return s
}

type QueryProjectInfoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 项目名称
	ProjectName *string `json:"project_name,omitempty" xml:"project_name,omitempty"`
	// 总粉丝粒数，单位分个
	TotalTokenAmount *int64 `json:"total_token_amount,omitempty" xml:"total_token_amount,omitempty"`
	// 未发放粉丝粒数，单位分个
	RemainingTokenAmount *int64 `json:"remaining_token_amount,omitempty" xml:"remaining_token_amount,omitempty"`
	// 已发放粉丝粒数，单位分个
	ReleasedTokenAmount *int64 `json:"released_token_amount,omitempty" xml:"released_token_amount,omitempty"`
	// 已提现粉丝粒数，单位分个
	RedeemedTokenAmount *int64 `json:"redeemed_token_amount,omitempty" xml:"redeemed_token_amount,omitempty"`
	// 总资金金额，单位分
	TotalPrizeAmount *Money `json:"total_prize_amount,omitempty" xml:"total_prize_amount,omitempty"`
	// 未消耗资金金额，单位分
	UnusedPrizeAmount *Money `json:"unused_prize_amount,omitempty" xml:"unused_prize_amount,omitempty"`
	// 已消耗资金金额，单位分
	UsedPrizeAmount *Money `json:"used_prize_amount,omitempty" xml:"used_prize_amount,omitempty"`
	// 开始发放时间
	AllocationStartTime *string `json:"allocation_start_time,omitempty" xml:"allocation_start_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 停止发放时间
	AllocationEndTime *string `json:"allocation_end_time,omitempty" xml:"allocation_end_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 开始兑现时间
	RedeemStartTime *string `json:"redeem_start_time,omitempty" xml:"redeem_start_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 停止兑现时间
	RedeemEndTime *string `json:"redeem_end_time,omitempty" xml:"redeem_end_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 发放该项目粉丝粒的订单内票数总和
	TicketNumber *int64 `json:"ticket_number,omitempty" xml:"ticket_number,omitempty"`
	// 当前粉丝粒单价，单位分
	CurrentTokenPrice *Money `json:"current_token_price,omitempty" xml:"current_token_price,omitempty"`
	// 粉丝粒保底价格，单位分
	MinTokenPrice *Money `json:"min_token_price,omitempty" xml:"min_token_price,omitempty"`
	// 发放区间信息
	CurrentStage *Stage `json:"current_stage,omitempty" xml:"current_stage,omitempty"`
	// 所有发放区间信息
	AllStages []*Stage `json:"all_stages,omitempty" xml:"all_stages,omitempty" type:"Repeated"`
	// 项目参与用户数
	ProjectUserNum *int64 `json:"project_user_num,omitempty" xml:"project_user_num,omitempty"`
	// 项目订单总数
	ProjectOrderNum *int64 `json:"project_order_num,omitempty" xml:"project_order_num,omitempty"`
	// 项目已售商品总数
	ProjectItemNum *int64 `json:"project_item_num,omitempty" xml:"project_item_num,omitempty"`
}

func (s QueryProjectInfoResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryProjectInfoResponse) GoString() string {
	return s.String()
}

func (s *QueryProjectInfoResponse) SetReqMsgId(v string) *QueryProjectInfoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryProjectInfoResponse) SetResultCode(v string) *QueryProjectInfoResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryProjectInfoResponse) SetResultMsg(v string) *QueryProjectInfoResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryProjectInfoResponse) SetProjectName(v string) *QueryProjectInfoResponse {
	s.ProjectName = &v
	return s
}

func (s *QueryProjectInfoResponse) SetTotalTokenAmount(v int64) *QueryProjectInfoResponse {
	s.TotalTokenAmount = &v
	return s
}

func (s *QueryProjectInfoResponse) SetRemainingTokenAmount(v int64) *QueryProjectInfoResponse {
	s.RemainingTokenAmount = &v
	return s
}

func (s *QueryProjectInfoResponse) SetReleasedTokenAmount(v int64) *QueryProjectInfoResponse {
	s.ReleasedTokenAmount = &v
	return s
}

func (s *QueryProjectInfoResponse) SetRedeemedTokenAmount(v int64) *QueryProjectInfoResponse {
	s.RedeemedTokenAmount = &v
	return s
}

func (s *QueryProjectInfoResponse) SetTotalPrizeAmount(v *Money) *QueryProjectInfoResponse {
	s.TotalPrizeAmount = v
	return s
}

func (s *QueryProjectInfoResponse) SetUnusedPrizeAmount(v *Money) *QueryProjectInfoResponse {
	s.UnusedPrizeAmount = v
	return s
}

func (s *QueryProjectInfoResponse) SetUsedPrizeAmount(v *Money) *QueryProjectInfoResponse {
	s.UsedPrizeAmount = v
	return s
}

func (s *QueryProjectInfoResponse) SetAllocationStartTime(v string) *QueryProjectInfoResponse {
	s.AllocationStartTime = &v
	return s
}

func (s *QueryProjectInfoResponse) SetAllocationEndTime(v string) *QueryProjectInfoResponse {
	s.AllocationEndTime = &v
	return s
}

func (s *QueryProjectInfoResponse) SetRedeemStartTime(v string) *QueryProjectInfoResponse {
	s.RedeemStartTime = &v
	return s
}

func (s *QueryProjectInfoResponse) SetRedeemEndTime(v string) *QueryProjectInfoResponse {
	s.RedeemEndTime = &v
	return s
}

func (s *QueryProjectInfoResponse) SetTicketNumber(v int64) *QueryProjectInfoResponse {
	s.TicketNumber = &v
	return s
}

func (s *QueryProjectInfoResponse) SetCurrentTokenPrice(v *Money) *QueryProjectInfoResponse {
	s.CurrentTokenPrice = v
	return s
}

func (s *QueryProjectInfoResponse) SetMinTokenPrice(v *Money) *QueryProjectInfoResponse {
	s.MinTokenPrice = v
	return s
}

func (s *QueryProjectInfoResponse) SetCurrentStage(v *Stage) *QueryProjectInfoResponse {
	s.CurrentStage = v
	return s
}

func (s *QueryProjectInfoResponse) SetAllStages(v []*Stage) *QueryProjectInfoResponse {
	s.AllStages = v
	return s
}

func (s *QueryProjectInfoResponse) SetProjectUserNum(v int64) *QueryProjectInfoResponse {
	s.ProjectUserNum = &v
	return s
}

func (s *QueryProjectInfoResponse) SetProjectOrderNum(v int64) *QueryProjectInfoResponse {
	s.ProjectOrderNum = &v
	return s
}

func (s *QueryProjectInfoResponse) SetProjectItemNum(v int64) *QueryProjectInfoResponse {
	s.ProjectItemNum = &v
	return s
}

type QueryUserInfoRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 项目唯一编码
	ProjectId *string `json:"project_id,omitempty" xml:"project_id,omitempty" require:"true"`
	// 用户账号信息
	User *User `json:"user,omitempty" xml:"user,omitempty" require:"true"`
}

func (s QueryUserInfoRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryUserInfoRequest) GoString() string {
	return s.String()
}

func (s *QueryUserInfoRequest) SetAuthToken(v string) *QueryUserInfoRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryUserInfoRequest) SetProductInstanceId(v string) *QueryUserInfoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryUserInfoRequest) SetProjectId(v string) *QueryUserInfoRequest {
	s.ProjectId = &v
	return s
}

func (s *QueryUserInfoRequest) SetUser(v *User) *QueryUserInfoRequest {
	s.User = v
	return s
}

type QueryUserInfoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 项目名称
	ProjectName *string `json:"project_name,omitempty" xml:"project_name,omitempty"`
	// 已获得粉丝粒总数，单位分个
	GainedTokenAmount *int64 `json:"gained_token_amount,omitempty" xml:"gained_token_amount,omitempty"`
	// 当前粉丝粒持有数量，单位分个
	CurrentTokenAmount *int64 `json:"current_token_amount,omitempty" xml:"current_token_amount,omitempty"`
	// 已兑现粉丝粒数量，单位分个
	RedeemedTokenAmount *int64 `json:"redeemed_token_amount,omitempty" xml:"redeemed_token_amount,omitempty"`
	// 累计获得奖金
	AccumulativeRevenue *Revenue `json:"accumulative_revenue,omitempty" xml:"accumulative_revenue,omitempty"`
	// 当前可兑奖金
	CurrentRevenue *Revenue `json:"current_revenue,omitempty" xml:"current_revenue,omitempty"`
	// 已兑现奖金
	RedeemedRevenue *Revenue `json:"redeemed_revenue,omitempty" xml:"redeemed_revenue,omitempty"`
	// 自购商品数量
	BuyAmountFromSelf *int64 `json:"buy_amount_from_self,omitempty" xml:"buy_amount_from_self,omitempty"`
	// 分享购买商品数量
	BuyAmountFromShare *int64 `json:"buy_amount_from_share,omitempty" xml:"buy_amount_from_share,omitempty"`
}

func (s QueryUserInfoResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryUserInfoResponse) GoString() string {
	return s.String()
}

func (s *QueryUserInfoResponse) SetReqMsgId(v string) *QueryUserInfoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryUserInfoResponse) SetResultCode(v string) *QueryUserInfoResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryUserInfoResponse) SetResultMsg(v string) *QueryUserInfoResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryUserInfoResponse) SetProjectName(v string) *QueryUserInfoResponse {
	s.ProjectName = &v
	return s
}

func (s *QueryUserInfoResponse) SetGainedTokenAmount(v int64) *QueryUserInfoResponse {
	s.GainedTokenAmount = &v
	return s
}

func (s *QueryUserInfoResponse) SetCurrentTokenAmount(v int64) *QueryUserInfoResponse {
	s.CurrentTokenAmount = &v
	return s
}

func (s *QueryUserInfoResponse) SetRedeemedTokenAmount(v int64) *QueryUserInfoResponse {
	s.RedeemedTokenAmount = &v
	return s
}

func (s *QueryUserInfoResponse) SetAccumulativeRevenue(v *Revenue) *QueryUserInfoResponse {
	s.AccumulativeRevenue = v
	return s
}

func (s *QueryUserInfoResponse) SetCurrentRevenue(v *Revenue) *QueryUserInfoResponse {
	s.CurrentRevenue = v
	return s
}

func (s *QueryUserInfoResponse) SetRedeemedRevenue(v *Revenue) *QueryUserInfoResponse {
	s.RedeemedRevenue = v
	return s
}

func (s *QueryUserInfoResponse) SetBuyAmountFromSelf(v int64) *QueryUserInfoResponse {
	s.BuyAmountFromSelf = &v
	return s
}

func (s *QueryUserInfoResponse) SetBuyAmountFromShare(v int64) *QueryUserInfoResponse {
	s.BuyAmountFromShare = &v
	return s
}

type QueryUserTokenallocationdetailRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 项目唯一编码
	ProjectId *string `json:"project_id,omitempty" xml:"project_id,omitempty" require:"true"`
	// 用户账户信息
	User *User `json:"user,omitempty" xml:"user,omitempty" require:"true"`
	// 页码
	PageNum *int64 `json:"page_num,omitempty" xml:"page_num,omitempty" require:"true"`
	// 页面大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
}

func (s QueryUserTokenallocationdetailRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryUserTokenallocationdetailRequest) GoString() string {
	return s.String()
}

func (s *QueryUserTokenallocationdetailRequest) SetAuthToken(v string) *QueryUserTokenallocationdetailRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryUserTokenallocationdetailRequest) SetProductInstanceId(v string) *QueryUserTokenallocationdetailRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryUserTokenallocationdetailRequest) SetProjectId(v string) *QueryUserTokenallocationdetailRequest {
	s.ProjectId = &v
	return s
}

func (s *QueryUserTokenallocationdetailRequest) SetUser(v *User) *QueryUserTokenallocationdetailRequest {
	s.User = v
	return s
}

func (s *QueryUserTokenallocationdetailRequest) SetPageNum(v int64) *QueryUserTokenallocationdetailRequest {
	s.PageNum = &v
	return s
}

func (s *QueryUserTokenallocationdetailRequest) SetPageSize(v int64) *QueryUserTokenallocationdetailRequest {
	s.PageSize = &v
	return s
}

type QueryUserTokenallocationdetailResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 粉丝粒操作流水
	AllocationDetail []*TokenOperationDetail `json:"allocation_detail,omitempty" xml:"allocation_detail,omitempty" type:"Repeated"`
}

func (s QueryUserTokenallocationdetailResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryUserTokenallocationdetailResponse) GoString() string {
	return s.String()
}

func (s *QueryUserTokenallocationdetailResponse) SetReqMsgId(v string) *QueryUserTokenallocationdetailResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryUserTokenallocationdetailResponse) SetResultCode(v string) *QueryUserTokenallocationdetailResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryUserTokenallocationdetailResponse) SetResultMsg(v string) *QueryUserTokenallocationdetailResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryUserTokenallocationdetailResponse) SetAllocationDetail(v []*TokenOperationDetail) *QueryUserTokenallocationdetailResponse {
	s.AllocationDetail = v
	return s
}

type QueryUserTokenredeemdetailRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 项目唯一编码
	ProjectId *string `json:"project_id,omitempty" xml:"project_id,omitempty" require:"true"`
	// 用户账户信息
	User *User `json:"user,omitempty" xml:"user,omitempty" require:"true"`
	// 页码
	PageNum *int64 `json:"page_num,omitempty" xml:"page_num,omitempty" require:"true"`
	// 页面大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
}

func (s QueryUserTokenredeemdetailRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryUserTokenredeemdetailRequest) GoString() string {
	return s.String()
}

func (s *QueryUserTokenredeemdetailRequest) SetAuthToken(v string) *QueryUserTokenredeemdetailRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryUserTokenredeemdetailRequest) SetProductInstanceId(v string) *QueryUserTokenredeemdetailRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryUserTokenredeemdetailRequest) SetProjectId(v string) *QueryUserTokenredeemdetailRequest {
	s.ProjectId = &v
	return s
}

func (s *QueryUserTokenredeemdetailRequest) SetUser(v *User) *QueryUserTokenredeemdetailRequest {
	s.User = v
	return s
}

func (s *QueryUserTokenredeemdetailRequest) SetPageNum(v int64) *QueryUserTokenredeemdetailRequest {
	s.PageNum = &v
	return s
}

func (s *QueryUserTokenredeemdetailRequest) SetPageSize(v int64) *QueryUserTokenredeemdetailRequest {
	s.PageSize = &v
	return s
}

type QueryUserTokenredeemdetailResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 兑现流水
	RedeemDetail []*TokenOperationDetail `json:"redeem_detail,omitempty" xml:"redeem_detail,omitempty" type:"Repeated"`
}

func (s QueryUserTokenredeemdetailResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryUserTokenredeemdetailResponse) GoString() string {
	return s.String()
}

func (s *QueryUserTokenredeemdetailResponse) SetReqMsgId(v string) *QueryUserTokenredeemdetailResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryUserTokenredeemdetailResponse) SetResultCode(v string) *QueryUserTokenredeemdetailResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryUserTokenredeemdetailResponse) SetResultMsg(v string) *QueryUserTokenredeemdetailResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryUserTokenredeemdetailResponse) SetRedeemDetail(v []*TokenOperationDetail) *QueryUserTokenredeemdetailResponse {
	s.RedeemDetail = v
	return s
}

type ExecEventReportRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 事件类型，目前支持类型 VISIT：访问事件，TRADE：交易事件，SHARE：分享事件
	EventType *string `json:"event_type,omitempty" xml:"event_type,omitempty" require:"true"`
	// 事件实例编码，目前支持访问事件，VISIT类别包括MINI_HOME_PAGE：访问首页，CONTRACT_DETAIL_OAGE：访问项目详情页，SHARE_LANDING_PAGE：访问分享页，TRADE类别包括TRADE_SUCCESS：购买成功，REFUND_SUCCESS: 退货成功，SHARE类别包括SHARE_FROM_MERCHANT
	EventInstanceCode *string `json:"event_instance_code,omitempty" xml:"event_instance_code,omitempty" require:"true"`
	// 购买人或者访问者
	EventChild *User `json:"event_child,omitempty" xml:"event_child,omitempty"`
	// 分享者
	EventParent *User `json:"event_parent,omitempty" xml:"event_parent,omitempty"`
	// 唯一业务单号
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty" require:"true"`
	// 项目唯一编号，访问详情页和回流页、购买事件必填
	ProjectId *string `json:"project_id,omitempty" xml:"project_id,omitempty"`
	// 到账类型，DIRECT：直接到账， TWO_STEP_MANUAL：手动到账，TWO_STEP：定时到账
	ConfirmType *string `json:"confirm_type,omitempty" xml:"confirm_type,omitempty"`
	// 到账时间。当到账类型为定时到账时，该字段必填。
	ConfirmTime *string `json:"confirm_time,omitempty" xml:"confirm_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 交易订单数据
	TradeOrder *TradeOrder `json:"trade_order,omitempty" xml:"trade_order,omitempty"`
}

func (s ExecEventReportRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecEventReportRequest) GoString() string {
	return s.String()
}

func (s *ExecEventReportRequest) SetAuthToken(v string) *ExecEventReportRequest {
	s.AuthToken = &v
	return s
}

func (s *ExecEventReportRequest) SetProductInstanceId(v string) *ExecEventReportRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ExecEventReportRequest) SetEventType(v string) *ExecEventReportRequest {
	s.EventType = &v
	return s
}

func (s *ExecEventReportRequest) SetEventInstanceCode(v string) *ExecEventReportRequest {
	s.EventInstanceCode = &v
	return s
}

func (s *ExecEventReportRequest) SetEventChild(v *User) *ExecEventReportRequest {
	s.EventChild = v
	return s
}

func (s *ExecEventReportRequest) SetEventParent(v *User) *ExecEventReportRequest {
	s.EventParent = v
	return s
}

func (s *ExecEventReportRequest) SetRequestId(v string) *ExecEventReportRequest {
	s.RequestId = &v
	return s
}

func (s *ExecEventReportRequest) SetProjectId(v string) *ExecEventReportRequest {
	s.ProjectId = &v
	return s
}

func (s *ExecEventReportRequest) SetConfirmType(v string) *ExecEventReportRequest {
	s.ConfirmType = &v
	return s
}

func (s *ExecEventReportRequest) SetConfirmTime(v string) *ExecEventReportRequest {
	s.ConfirmTime = &v
	return s
}

func (s *ExecEventReportRequest) SetTradeOrder(v *TradeOrder) *ExecEventReportRequest {
	s.TradeOrder = v
	return s
}

type ExecEventReportResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 事件唯一标识
	EventId *string `json:"event_id,omitempty" xml:"event_id,omitempty"`
	// 事件状态，REPORTED：已上报，PROCESSING：处理中，PROCESSED： 处理完毕，NEED_RETRY：需要重试，EVENT_NOT_SUPPORTED：项目暂不支持该事件
	EventStatus *string `json:"event_status,omitempty" xml:"event_status,omitempty"`
	// token状态，TOKEN_SUCCESS：token发放成功，TOKEN_PROCESSING：token发放中，TOKEN_FAILED：token发放失败，NO_NEED_ALLOCATION：无需发放
	TokenStatus *string `json:"token_status,omitempty" xml:"token_status,omitempty"`
	// 购买者/访问者获得token数量
	TokenAmount *int64 `json:"token_amount,omitempty" xml:"token_amount,omitempty"`
	// 提示信息
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 分享人获得token数
	ParentTokenAmount *int64 `json:"parent_token_amount,omitempty" xml:"parent_token_amount,omitempty"`
}

func (s ExecEventReportResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecEventReportResponse) GoString() string {
	return s.String()
}

func (s *ExecEventReportResponse) SetReqMsgId(v string) *ExecEventReportResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ExecEventReportResponse) SetResultCode(v string) *ExecEventReportResponse {
	s.ResultCode = &v
	return s
}

func (s *ExecEventReportResponse) SetResultMsg(v string) *ExecEventReportResponse {
	s.ResultMsg = &v
	return s
}

func (s *ExecEventReportResponse) SetEventId(v string) *ExecEventReportResponse {
	s.EventId = &v
	return s
}

func (s *ExecEventReportResponse) SetEventStatus(v string) *ExecEventReportResponse {
	s.EventStatus = &v
	return s
}

func (s *ExecEventReportResponse) SetTokenStatus(v string) *ExecEventReportResponse {
	s.TokenStatus = &v
	return s
}

func (s *ExecEventReportResponse) SetTokenAmount(v int64) *ExecEventReportResponse {
	s.TokenAmount = &v
	return s
}

func (s *ExecEventReportResponse) SetMessage(v string) *ExecEventReportResponse {
	s.Message = &v
	return s
}

func (s *ExecEventReportResponse) SetParentTokenAmount(v int64) *ExecEventReportResponse {
	s.ParentTokenAmount = &v
	return s
}

type QueryEventInfoRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 事件唯一标识
	EventId *string `json:"event_id,omitempty" xml:"event_id,omitempty" require:"true"`
}

func (s QueryEventInfoRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryEventInfoRequest) GoString() string {
	return s.String()
}

func (s *QueryEventInfoRequest) SetAuthToken(v string) *QueryEventInfoRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryEventInfoRequest) SetProductInstanceId(v string) *QueryEventInfoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryEventInfoRequest) SetEventId(v string) *QueryEventInfoRequest {
	s.EventId = &v
	return s
}

type QueryEventInfoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 事件唯一标识
	EventId *string `json:"event_id,omitempty" xml:"event_id,omitempty"`
	// 事件状态
	EventStatus *string `json:"event_status,omitempty" xml:"event_status,omitempty"`
	// token发放状态
	TokenStatus *string `json:"token_status,omitempty" xml:"token_status,omitempty"`
	// token数量
	TokenAmount *int64 `json:"token_amount,omitempty" xml:"token_amount,omitempty"`
	// 事件上报时间
	EventTime *string `json:"event_time,omitempty" xml:"event_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 事件处理结果提示信息
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
}

func (s QueryEventInfoResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryEventInfoResponse) GoString() string {
	return s.String()
}

func (s *QueryEventInfoResponse) SetReqMsgId(v string) *QueryEventInfoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryEventInfoResponse) SetResultCode(v string) *QueryEventInfoResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryEventInfoResponse) SetResultMsg(v string) *QueryEventInfoResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryEventInfoResponse) SetEventId(v string) *QueryEventInfoResponse {
	s.EventId = &v
	return s
}

func (s *QueryEventInfoResponse) SetEventStatus(v string) *QueryEventInfoResponse {
	s.EventStatus = &v
	return s
}

func (s *QueryEventInfoResponse) SetTokenStatus(v string) *QueryEventInfoResponse {
	s.TokenStatus = &v
	return s
}

func (s *QueryEventInfoResponse) SetTokenAmount(v int64) *QueryEventInfoResponse {
	s.TokenAmount = &v
	return s
}

func (s *QueryEventInfoResponse) SetEventTime(v string) *QueryEventInfoResponse {
	s.EventTime = &v
	return s
}

func (s *QueryEventInfoResponse) SetMessage(v string) *QueryEventInfoResponse {
	s.Message = &v
	return s
}

type ImportNftMetaRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 在外部渠道的全局唯一id
	ProjectId *string `json:"project_id,omitempty" xml:"project_id,omitempty" require:"true"`
	// nft资产标题
	Title *string `json:"title,omitempty" xml:"title,omitempty" require:"true"`
	// 缩略图OSS文件名
	MiniImageUrl *string `json:"mini_image_url,omitempty" xml:"mini_image_url,omitempty" require:"true"`
	// 原图地址
	OriginImageUrl *string `json:"origin_image_url,omitempty" xml:"origin_image_url,omitempty" require:"true"`
	// 创作者
	Author *string `json:"author,omitempty" xml:"author,omitempty" require:"true"`
	// 作品简介信息文字描述
	Description *string `json:"description,omitempty" xml:"description,omitempty"`
	// 商品详情页url
	ItemUrl *string `json:"item_url,omitempty" xml:"item_url,omitempty" require:"true"`
}

func (s ImportNftMetaRequest) String() string {
	return tea.Prettify(s)
}

func (s ImportNftMetaRequest) GoString() string {
	return s.String()
}

func (s *ImportNftMetaRequest) SetAuthToken(v string) *ImportNftMetaRequest {
	s.AuthToken = &v
	return s
}

func (s *ImportNftMetaRequest) SetProductInstanceId(v string) *ImportNftMetaRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ImportNftMetaRequest) SetProjectId(v string) *ImportNftMetaRequest {
	s.ProjectId = &v
	return s
}

func (s *ImportNftMetaRequest) SetTitle(v string) *ImportNftMetaRequest {
	s.Title = &v
	return s
}

func (s *ImportNftMetaRequest) SetMiniImageUrl(v string) *ImportNftMetaRequest {
	s.MiniImageUrl = &v
	return s
}

func (s *ImportNftMetaRequest) SetOriginImageUrl(v string) *ImportNftMetaRequest {
	s.OriginImageUrl = &v
	return s
}

func (s *ImportNftMetaRequest) SetAuthor(v string) *ImportNftMetaRequest {
	s.Author = &v
	return s
}

func (s *ImportNftMetaRequest) SetDescription(v string) *ImportNftMetaRequest {
	s.Description = &v
	return s
}

func (s *ImportNftMetaRequest) SetItemUrl(v string) *ImportNftMetaRequest {
	s.ItemUrl = &v
	return s
}

type ImportNftMetaResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// nft_id资产id
	NftId *string `json:"nft_id,omitempty" xml:"nft_id,omitempty"`
}

func (s ImportNftMetaResponse) String() string {
	return tea.Prettify(s)
}

func (s ImportNftMetaResponse) GoString() string {
	return s.String()
}

func (s *ImportNftMetaResponse) SetReqMsgId(v string) *ImportNftMetaResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ImportNftMetaResponse) SetResultCode(v string) *ImportNftMetaResponse {
	s.ResultCode = &v
	return s
}

func (s *ImportNftMetaResponse) SetResultMsg(v string) *ImportNftMetaResponse {
	s.ResultMsg = &v
	return s
}

func (s *ImportNftMetaResponse) SetNftId(v string) *ImportNftMetaResponse {
	s.NftId = &v
	return s
}

type ExecNftTransferRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 支付用户uid
	AlipayUid *string `json:"alipay_uid,omitempty" xml:"alipay_uid,omitempty" require:"true"`
	// 在外部渠道的全局唯一id
	ProjectId *string `json:"project_id,omitempty" xml:"project_id,omitempty" require:"true"`
	// 外部订单号（阿里拍卖成功的订单号）
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty" require:"true"`
	// 拍品成交价（单位：分）
	PriceCent *int64 `json:"price_cent,omitempty" xml:"price_cent,omitempty" require:"true"`
}

func (s ExecNftTransferRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecNftTransferRequest) GoString() string {
	return s.String()
}

func (s *ExecNftTransferRequest) SetAuthToken(v string) *ExecNftTransferRequest {
	s.AuthToken = &v
	return s
}

func (s *ExecNftTransferRequest) SetProductInstanceId(v string) *ExecNftTransferRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ExecNftTransferRequest) SetAlipayUid(v string) *ExecNftTransferRequest {
	s.AlipayUid = &v
	return s
}

func (s *ExecNftTransferRequest) SetProjectId(v string) *ExecNftTransferRequest {
	s.ProjectId = &v
	return s
}

func (s *ExecNftTransferRequest) SetOrderNo(v string) *ExecNftTransferRequest {
	s.OrderNo = &v
	return s
}

func (s *ExecNftTransferRequest) SetPriceCent(v int64) *ExecNftTransferRequest {
	s.PriceCent = &v
	return s
}

type ExecNftTransferResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 内部流水id
	TransferId *string `json:"transfer_id,omitempty" xml:"transfer_id,omitempty"`
}

func (s ExecNftTransferResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecNftTransferResponse) GoString() string {
	return s.String()
}

func (s *ExecNftTransferResponse) SetReqMsgId(v string) *ExecNftTransferResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ExecNftTransferResponse) SetResultCode(v string) *ExecNftTransferResponse {
	s.ResultCode = &v
	return s
}

func (s *ExecNftTransferResponse) SetResultMsg(v string) *ExecNftTransferResponse {
	s.ResultMsg = &v
	return s
}

func (s *ExecNftTransferResponse) SetTransferId(v string) *ExecNftTransferResponse {
	s.TransferId = &v
	return s
}

type GetIsvSharecodeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 电话号码/邮箱等登陆名
	LogonId *string `json:"logon_id,omitempty" xml:"logon_id,omitempty" require:"true"`
}

func (s GetIsvSharecodeRequest) String() string {
	return tea.Prettify(s)
}

func (s GetIsvSharecodeRequest) GoString() string {
	return s.String()
}

func (s *GetIsvSharecodeRequest) SetAuthToken(v string) *GetIsvSharecodeRequest {
	s.AuthToken = &v
	return s
}

func (s *GetIsvSharecodeRequest) SetProductInstanceId(v string) *GetIsvSharecodeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetIsvSharecodeRequest) SetLogonId(v string) *GetIsvSharecodeRequest {
	s.LogonId = &v
	return s
}

type GetIsvSharecodeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 生成的ISV用户邀请码
	ShareCode *string `json:"share_code,omitempty" xml:"share_code,omitempty"`
}

func (s GetIsvSharecodeResponse) String() string {
	return tea.Prettify(s)
}

func (s GetIsvSharecodeResponse) GoString() string {
	return s.String()
}

func (s *GetIsvSharecodeResponse) SetReqMsgId(v string) *GetIsvSharecodeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetIsvSharecodeResponse) SetResultCode(v string) *GetIsvSharecodeResponse {
	s.ResultCode = &v
	return s
}

func (s *GetIsvSharecodeResponse) SetResultMsg(v string) *GetIsvSharecodeResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetIsvSharecodeResponse) SetShareCode(v string) *GetIsvSharecodeResponse {
	s.ShareCode = &v
	return s
}

type AddProvisionRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 业务单号
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 链 ID
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty" require:"true"`
	// 合约 ID
	ContractId *string `json:"contract_id,omitempty" xml:"contract_id,omitempty" require:"true"`
	// 调用方，例如租户 ID
	Source *string `json:"source,omitempty" xml:"source,omitempty" require:"true"`
	// 金额，单位为分
	Value *int64 `json:"value,omitempty" xml:"value,omitempty" require:"true"`
}

func (s AddProvisionRequest) String() string {
	return tea.Prettify(s)
}

func (s AddProvisionRequest) GoString() string {
	return s.String()
}

func (s *AddProvisionRequest) SetAuthToken(v string) *AddProvisionRequest {
	s.AuthToken = &v
	return s
}

func (s *AddProvisionRequest) SetProductInstanceId(v string) *AddProvisionRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AddProvisionRequest) SetBizId(v string) *AddProvisionRequest {
	s.BizId = &v
	return s
}

func (s *AddProvisionRequest) SetChainId(v string) *AddProvisionRequest {
	s.ChainId = &v
	return s
}

func (s *AddProvisionRequest) SetContractId(v string) *AddProvisionRequest {
	s.ContractId = &v
	return s
}

func (s *AddProvisionRequest) SetSource(v string) *AddProvisionRequest {
	s.Source = &v
	return s
}

func (s *AddProvisionRequest) SetValue(v int64) *AddProvisionRequest {
	s.Value = &v
	return s
}

type AddProvisionResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s AddProvisionResponse) String() string {
	return tea.Prettify(s)
}

func (s AddProvisionResponse) GoString() string {
	return s.String()
}

func (s *AddProvisionResponse) SetReqMsgId(v string) *AddProvisionResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AddProvisionResponse) SetResultCode(v string) *AddProvisionResponse {
	s.ResultCode = &v
	return s
}

func (s *AddProvisionResponse) SetResultMsg(v string) *AddProvisionResponse {
	s.ResultMsg = &v
	return s
}

type ReclaimProvisionExtraprovisionRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 业务单号
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 链 ID
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty" require:"true"`
	// 合约 ID
	ContractId *string `json:"contract_id,omitempty" xml:"contract_id,omitempty" require:"true"`
	// 调用方，例如租户 ID
	Source *string `json:"source,omitempty" xml:"source,omitempty" require:"true"`
}

func (s ReclaimProvisionExtraprovisionRequest) String() string {
	return tea.Prettify(s)
}

func (s ReclaimProvisionExtraprovisionRequest) GoString() string {
	return s.String()
}

func (s *ReclaimProvisionExtraprovisionRequest) SetAuthToken(v string) *ReclaimProvisionExtraprovisionRequest {
	s.AuthToken = &v
	return s
}

func (s *ReclaimProvisionExtraprovisionRequest) SetProductInstanceId(v string) *ReclaimProvisionExtraprovisionRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ReclaimProvisionExtraprovisionRequest) SetBizId(v string) *ReclaimProvisionExtraprovisionRequest {
	s.BizId = &v
	return s
}

func (s *ReclaimProvisionExtraprovisionRequest) SetChainId(v string) *ReclaimProvisionExtraprovisionRequest {
	s.ChainId = &v
	return s
}

func (s *ReclaimProvisionExtraprovisionRequest) SetContractId(v string) *ReclaimProvisionExtraprovisionRequest {
	s.ContractId = &v
	return s
}

func (s *ReclaimProvisionExtraprovisionRequest) SetSource(v string) *ReclaimProvisionExtraprovisionRequest {
	s.Source = &v
	return s
}

type ReclaimProvisionExtraprovisionResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s ReclaimProvisionExtraprovisionResponse) String() string {
	return tea.Prettify(s)
}

func (s ReclaimProvisionExtraprovisionResponse) GoString() string {
	return s.String()
}

func (s *ReclaimProvisionExtraprovisionResponse) SetReqMsgId(v string) *ReclaimProvisionExtraprovisionResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ReclaimProvisionExtraprovisionResponse) SetResultCode(v string) *ReclaimProvisionExtraprovisionResponse {
	s.ResultCode = &v
	return s
}

func (s *ReclaimProvisionExtraprovisionResponse) SetResultMsg(v string) *ReclaimProvisionExtraprovisionResponse {
	s.ResultMsg = &v
	return s
}

type ExecTokenRedeemRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 业务单号
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 链 ID
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty" require:"true"`
	// 合约 ID
	ContractId *string `json:"contract_id,omitempty" xml:"contract_id,omitempty" require:"true"`
	// 币种，目前仅支持 CNY
	Currency *string `json:"currency,omitempty" xml:"currency,omitempty" require:"true"`
	// 调用方
	Source *string `json:"source,omitempty" xml:"source,omitempty" require:"true"`
	// 要兑现的用户VID
	TargetUser *string `json:"target_user,omitempty" xml:"target_user,omitempty" require:"true"`
	// Token总金额，token_price*token_number 的结果，单位为分
	TokenAmount *int64 `json:"token_amount,omitempty" xml:"token_amount,omitempty" require:"true"`
	// 兑现的Token数目
	TokenNumber *int64 `json:"token_number,omitempty" xml:"token_number,omitempty" require:"true"`
	// 兑现的Token单价，单位为分
	TokenPrice *int64 `json:"token_price,omitempty" xml:"token_price,omitempty" require:"true"`
}

func (s ExecTokenRedeemRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecTokenRedeemRequest) GoString() string {
	return s.String()
}

func (s *ExecTokenRedeemRequest) SetAuthToken(v string) *ExecTokenRedeemRequest {
	s.AuthToken = &v
	return s
}

func (s *ExecTokenRedeemRequest) SetProductInstanceId(v string) *ExecTokenRedeemRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ExecTokenRedeemRequest) SetBizId(v string) *ExecTokenRedeemRequest {
	s.BizId = &v
	return s
}

func (s *ExecTokenRedeemRequest) SetChainId(v string) *ExecTokenRedeemRequest {
	s.ChainId = &v
	return s
}

func (s *ExecTokenRedeemRequest) SetContractId(v string) *ExecTokenRedeemRequest {
	s.ContractId = &v
	return s
}

func (s *ExecTokenRedeemRequest) SetCurrency(v string) *ExecTokenRedeemRequest {
	s.Currency = &v
	return s
}

func (s *ExecTokenRedeemRequest) SetSource(v string) *ExecTokenRedeemRequest {
	s.Source = &v
	return s
}

func (s *ExecTokenRedeemRequest) SetTargetUser(v string) *ExecTokenRedeemRequest {
	s.TargetUser = &v
	return s
}

func (s *ExecTokenRedeemRequest) SetTokenAmount(v int64) *ExecTokenRedeemRequest {
	s.TokenAmount = &v
	return s
}

func (s *ExecTokenRedeemRequest) SetTokenNumber(v int64) *ExecTokenRedeemRequest {
	s.TokenNumber = &v
	return s
}

func (s *ExecTokenRedeemRequest) SetTokenPrice(v int64) *ExecTokenRedeemRequest {
	s.TokenPrice = &v
	return s
}

type ExecTokenRedeemResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s ExecTokenRedeemResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecTokenRedeemResponse) GoString() string {
	return s.String()
}

func (s *ExecTokenRedeemResponse) SetReqMsgId(v string) *ExecTokenRedeemResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ExecTokenRedeemResponse) SetResultCode(v string) *ExecTokenRedeemResponse {
	s.ResultCode = &v
	return s
}

func (s *ExecTokenRedeemResponse) SetResultMsg(v string) *ExecTokenRedeemResponse {
	s.ResultMsg = &v
	return s
}

type GetTppSharecodeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 分享人在淘票票端绑定的支付宝UID
	AlipayUid *string `json:"alipay_uid,omitempty" xml:"alipay_uid,omitempty" require:"true"`
}

func (s GetTppSharecodeRequest) String() string {
	return tea.Prettify(s)
}

func (s GetTppSharecodeRequest) GoString() string {
	return s.String()
}

func (s *GetTppSharecodeRequest) SetAuthToken(v string) *GetTppSharecodeRequest {
	s.AuthToken = &v
	return s
}

func (s *GetTppSharecodeRequest) SetProductInstanceId(v string) *GetTppSharecodeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetTppSharecodeRequest) SetAlipayUid(v string) *GetTppSharecodeRequest {
	s.AlipayUid = &v
	return s
}

type GetTppSharecodeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 专属邀请码
	ShareCode *string `json:"share_code,omitempty" xml:"share_code,omitempty"`
}

func (s GetTppSharecodeResponse) String() string {
	return tea.Prettify(s)
}

func (s GetTppSharecodeResponse) GoString() string {
	return s.String()
}

func (s *GetTppSharecodeResponse) SetReqMsgId(v string) *GetTppSharecodeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetTppSharecodeResponse) SetResultCode(v string) *GetTppSharecodeResponse {
	s.ResultCode = &v
	return s
}

func (s *GetTppSharecodeResponse) SetResultMsg(v string) *GetTppSharecodeResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetTppSharecodeResponse) SetShareCode(v string) *GetTppSharecodeResponse {
	s.ShareCode = &v
	return s
}

type QueryTppAllinfoRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 支付宝UID
	AlipayUid *string `json:"alipay_uid,omitempty" xml:"alipay_uid,omitempty" require:"true"`
	// 排序方式，默认降序
	OrderBy *string `json:"order_by,omitempty" xml:"order_by,omitempty"`
	// 页码
	PageId *int64 `json:"page_id,omitempty" xml:"page_id,omitempty" require:"true"`
	// 页面大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
}

func (s QueryTppAllinfoRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryTppAllinfoRequest) GoString() string {
	return s.String()
}

func (s *QueryTppAllinfoRequest) SetAuthToken(v string) *QueryTppAllinfoRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryTppAllinfoRequest) SetProductInstanceId(v string) *QueryTppAllinfoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryTppAllinfoRequest) SetAlipayUid(v string) *QueryTppAllinfoRequest {
	s.AlipayUid = &v
	return s
}

func (s *QueryTppAllinfoRequest) SetOrderBy(v string) *QueryTppAllinfoRequest {
	s.OrderBy = &v
	return s
}

func (s *QueryTppAllinfoRequest) SetPageId(v int64) *QueryTppAllinfoRequest {
	s.PageId = &v
	return s
}

func (s *QueryTppAllinfoRequest) SetPageSize(v int64) *QueryTppAllinfoRequest {
	s.PageSize = &v
	return s
}

type QueryTppAllinfoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 累计全部参与收益
	AccumulativeRevenue *Revenue `json:"accumulative_revenue,omitempty" xml:"accumulative_revenue,omitempty"`
	// 累计参与用书
	AccumulativeUsers *int64 `json:"accumulative_users,omitempty" xml:"accumulative_users,omitempty"`
	// 用户资产详情列表
	AssetDetailList []*AssetDetail `json:"asset_detail_list,omitempty" xml:"asset_detail_list,omitempty" type:"Repeated"`
	// 用户当前累计收益
	CurrentAccumulativeRevenue *Revenue `json:"current_accumulative_revenue,omitempty" xml:"current_accumulative_revenue,omitempty"`
	// 当前用户收益
	CurrentRevenue *Revenue `json:"current_revenue,omitempty" xml:"current_revenue,omitempty"`
}

func (s QueryTppAllinfoResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryTppAllinfoResponse) GoString() string {
	return s.String()
}

func (s *QueryTppAllinfoResponse) SetReqMsgId(v string) *QueryTppAllinfoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryTppAllinfoResponse) SetResultCode(v string) *QueryTppAllinfoResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryTppAllinfoResponse) SetResultMsg(v string) *QueryTppAllinfoResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryTppAllinfoResponse) SetAccumulativeRevenue(v *Revenue) *QueryTppAllinfoResponse {
	s.AccumulativeRevenue = v
	return s
}

func (s *QueryTppAllinfoResponse) SetAccumulativeUsers(v int64) *QueryTppAllinfoResponse {
	s.AccumulativeUsers = &v
	return s
}

func (s *QueryTppAllinfoResponse) SetAssetDetailList(v []*AssetDetail) *QueryTppAllinfoResponse {
	s.AssetDetailList = v
	return s
}

func (s *QueryTppAllinfoResponse) SetCurrentAccumulativeRevenue(v *Revenue) *QueryTppAllinfoResponse {
	s.CurrentAccumulativeRevenue = v
	return s
}

func (s *QueryTppAllinfoResponse) SetCurrentRevenue(v *Revenue) *QueryTppAllinfoResponse {
	s.CurrentRevenue = v
	return s
}

type QueryTppParticipationinfoRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s QueryTppParticipationinfoRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryTppParticipationinfoRequest) GoString() string {
	return s.String()
}

func (s *QueryTppParticipationinfoRequest) SetAuthToken(v string) *QueryTppParticipationinfoRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryTppParticipationinfoRequest) SetProductInstanceId(v string) *QueryTppParticipationinfoRequest {
	s.ProductInstanceId = &v
	return s
}

type QueryTppParticipationinfoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 累计参与用户数
	AccumulativeUsers *int64 `json:"accumulative_users,omitempty" xml:"accumulative_users,omitempty"`
	// 累计全部参与收益
	AccumulativeRevenue *AccumulativeRevenue `json:"accumulative_revenue,omitempty" xml:"accumulative_revenue,omitempty"`
}

func (s QueryTppParticipationinfoResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryTppParticipationinfoResponse) GoString() string {
	return s.String()
}

func (s *QueryTppParticipationinfoResponse) SetReqMsgId(v string) *QueryTppParticipationinfoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryTppParticipationinfoResponse) SetResultCode(v string) *QueryTppParticipationinfoResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryTppParticipationinfoResponse) SetResultMsg(v string) *QueryTppParticipationinfoResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryTppParticipationinfoResponse) SetAccumulativeUsers(v int64) *QueryTppParticipationinfoResponse {
	s.AccumulativeUsers = &v
	return s
}

func (s *QueryTppParticipationinfoResponse) SetAccumulativeRevenue(v *AccumulativeRevenue) *QueryTppParticipationinfoResponse {
	s.AccumulativeRevenue = v
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
				"sdk_version":      tea.String("1.4.6"),
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
 * Description: 查询用户参与的所有项目
 * Summary: 用户参与的项目查询
 */
func (client *Client) QueryCustomerProject(request *QueryCustomerProjectRequest) (_result *QueryCustomerProjectResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryCustomerProjectResponse{}
	_body, _err := client.QueryCustomerProjectEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询用户参与的所有项目
 * Summary: 用户参与的项目查询
 */
func (client *Client) QueryCustomerProjectEx(request *QueryCustomerProjectRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryCustomerProjectResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryCustomerProjectResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ent.customer.project.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询用户数据的接口
 * Summary: 用户数据查询接口
 */
func (client *Client) QueryCustomerData(request *QueryCustomerDataRequest) (_result *QueryCustomerDataResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryCustomerDataResponse{}
	_body, _err := client.QueryCustomerDataEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询用户数据的接口
 * Summary: 用户数据查询接口
 */
func (client *Client) QueryCustomerDataEx(request *QueryCustomerDataRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryCustomerDataResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryCustomerDataResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ent.customer.data.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 为用户创建分享码
 * Summary: 用户分享码创建接口
 */
func (client *Client) GetUserSharecode(request *GetUserSharecodeRequest) (_result *GetUserSharecodeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetUserSharecodeResponse{}
	_body, _err := client.GetUserSharecodeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 为用户创建分享码
 * Summary: 用户分享码创建接口
 */
func (client *Client) GetUserSharecodeEx(request *GetUserSharecodeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetUserSharecodeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetUserSharecodeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ent.user.sharecode.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 发送用户的项目订单数据
 * Summary: 用户项目订单消息发送接口
 */
func (client *Client) SendUserProjectordermsg(request *SendUserProjectordermsgRequest) (_result *SendUserProjectordermsgResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SendUserProjectordermsgResponse{}
	_body, _err := client.SendUserProjectordermsgEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 发送用户的项目订单数据
 * Summary: 用户项目订单消息发送接口
 */
func (client *Client) SendUserProjectordermsgEx(request *SendUserProjectordermsgRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SendUserProjectordermsgResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SendUserProjectordermsgResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ent.user.projectordermsg.send"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询项目信息查询
 * Summary: 项目信息查询接口
 */
func (client *Client) QueryProjectInfo(request *QueryProjectInfoRequest) (_result *QueryProjectInfoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryProjectInfoResponse{}
	_body, _err := client.QueryProjectInfoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询项目信息查询
 * Summary: 项目信息查询接口
 */
func (client *Client) QueryProjectInfoEx(request *QueryProjectInfoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryProjectInfoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryProjectInfoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ent.project.info.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询用户信息
 * Summary: 用户信息查询接口
 */
func (client *Client) QueryUserInfo(request *QueryUserInfoRequest) (_result *QueryUserInfoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryUserInfoResponse{}
	_body, _err := client.QueryUserInfoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询用户信息
 * Summary: 用户信息查询接口
 */
func (client *Client) QueryUserInfoEx(request *QueryUserInfoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryUserInfoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryUserInfoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ent.user.info.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询用户粉丝粒获得明细
 * Summary: 用户粉丝粒获得明细查询接口
 */
func (client *Client) QueryUserTokenallocationdetail(request *QueryUserTokenallocationdetailRequest) (_result *QueryUserTokenallocationdetailResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryUserTokenallocationdetailResponse{}
	_body, _err := client.QueryUserTokenallocationdetailEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询用户粉丝粒获得明细
 * Summary: 用户粉丝粒获得明细查询接口
 */
func (client *Client) QueryUserTokenallocationdetailEx(request *QueryUserTokenallocationdetailRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryUserTokenallocationdetailResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryUserTokenallocationdetailResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ent.user.tokenallocationdetail.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询用户粉丝粒兑现明细
 * Summary: 用户粉丝粒兑现明细查询接口
 */
func (client *Client) QueryUserTokenredeemdetail(request *QueryUserTokenredeemdetailRequest) (_result *QueryUserTokenredeemdetailResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryUserTokenredeemdetailResponse{}
	_body, _err := client.QueryUserTokenredeemdetailEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询用户粉丝粒兑现明细
 * Summary: 用户粉丝粒兑现明细查询接口
 */
func (client *Client) QueryUserTokenredeemdetailEx(request *QueryUserTokenredeemdetailRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryUserTokenredeemdetailResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryUserTokenredeemdetailResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ent.user.tokenredeemdetail.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 上报事件
 * Summary: 事件上报
 */
func (client *Client) ExecEventReport(request *ExecEventReportRequest) (_result *ExecEventReportResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ExecEventReportResponse{}
	_body, _err := client.ExecEventReportEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 上报事件
 * Summary: 事件上报
 */
func (client *Client) ExecEventReportEx(request *ExecEventReportRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ExecEventReportResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecEventReportResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ent.event.report.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询事件信息
 * Summary: 事件信息查询
 */
func (client *Client) QueryEventInfo(request *QueryEventInfoRequest) (_result *QueryEventInfoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryEventInfoResponse{}
	_body, _err := client.QueryEventInfoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询事件信息
 * Summary: 事件信息查询
 */
func (client *Client) QueryEventInfoEx(request *QueryEventInfoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryEventInfoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryEventInfoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ent.event.info.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 阿里拍卖nft资产元数据导入
 * Summary: 阿里拍卖nft资产元数据导入
 */
func (client *Client) ImportNftMeta(request *ImportNftMetaRequest) (_result *ImportNftMetaResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ImportNftMetaResponse{}
	_body, _err := client.ImportNftMetaEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 阿里拍卖nft资产元数据导入
 * Summary: 阿里拍卖nft资产元数据导入
 */
func (client *Client) ImportNftMetaEx(request *ImportNftMetaRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ImportNftMetaResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ImportNftMetaResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ent.nft.meta.import"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: nft资产订单落库，链上流转
 * Summary: nft资产流转
 */
func (client *Client) ExecNftTransfer(request *ExecNftTransferRequest) (_result *ExecNftTransferResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ExecNftTransferResponse{}
	_body, _err := client.ExecNftTransferEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: nft资产订单落库，链上流转
 * Summary: nft资产流转
 */
func (client *Client) ExecNftTransferEx(request *ExecNftTransferRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ExecNftTransferResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecNftTransferResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ent.nft.transfer.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 外部ISV获取分享码接口
 * Summary: 获得ISV分享码
 */
func (client *Client) GetIsvSharecode(request *GetIsvSharecodeRequest) (_result *GetIsvSharecodeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetIsvSharecodeResponse{}
	_body, _err := client.GetIsvSharecodeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 外部ISV获取分享码接口
 * Summary: 获得ISV分享码
 */
func (client *Client) GetIsvSharecodeEx(request *GetIsvSharecodeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetIsvSharecodeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetIsvSharecodeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ent.isv.sharecode.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 备付金追加接口
 * Summary: 备付金追加接口
 */
func (client *Client) AddProvision(request *AddProvisionRequest) (_result *AddProvisionResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AddProvisionResponse{}
	_body, _err := client.AddProvisionEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 备付金追加接口
 * Summary: 备付金追加接口
 */
func (client *Client) AddProvisionEx(request *AddProvisionRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AddProvisionResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AddProvisionResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ent.provision.add"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 赎回链上多余备付金
 * Summary: 赎回链上多余备付金
 */
func (client *Client) ReclaimProvisionExtraprovision(request *ReclaimProvisionExtraprovisionRequest) (_result *ReclaimProvisionExtraprovisionResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ReclaimProvisionExtraprovisionResponse{}
	_body, _err := client.ReclaimProvisionExtraprovisionEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 赎回链上多余备付金
 * Summary: 赎回链上多余备付金
 */
func (client *Client) ReclaimProvisionExtraprovisionEx(request *ReclaimProvisionExtraprovisionRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ReclaimProvisionExtraprovisionResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ReclaimProvisionExtraprovisionResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ent.provision.extraprovision.reclaim"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 链上Token兑现接口
 * Summary: 链上Token兑现接口
 */
func (client *Client) ExecTokenRedeem(request *ExecTokenRedeemRequest) (_result *ExecTokenRedeemResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ExecTokenRedeemResponse{}
	_body, _err := client.ExecTokenRedeemEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 链上Token兑现接口
 * Summary: 链上Token兑现接口
 */
func (client *Client) ExecTokenRedeemEx(request *ExecTokenRedeemRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ExecTokenRedeemResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecTokenRedeemResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ent.token.redeem.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 针对淘票票的获取专属邀请码获取接口
 * Summary: 淘票票专属邀请码获取接口
 */
func (client *Client) GetTppSharecode(request *GetTppSharecodeRequest) (_result *GetTppSharecodeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetTppSharecodeResponse{}
	_body, _err := client.GetTppSharecodeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 针对淘票票的获取专属邀请码获取接口
 * Summary: 淘票票专属邀请码获取接口
 */
func (client *Client) GetTppSharecodeEx(request *GetTppSharecodeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetTppSharecodeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetTppSharecodeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ent.tpp.sharecode.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 针对淘票票的查询全部必要信息的接口
 * Summary: 淘票票查询全部必要信息接口
 */
func (client *Client) QueryTppAllinfo(request *QueryTppAllinfoRequest) (_result *QueryTppAllinfoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryTppAllinfoResponse{}
	_body, _err := client.QueryTppAllinfoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 针对淘票票的查询全部必要信息的接口
 * Summary: 淘票票查询全部必要信息接口
 */
func (client *Client) QueryTppAllinfoEx(request *QueryTppAllinfoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryTppAllinfoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryTppAllinfoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ent.tpp.allinfo.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 针对淘票票的参与信息查询接口
 * Summary: 淘票票参与信息查询接口
 */
func (client *Client) QueryTppParticipationinfo(request *QueryTppParticipationinfoRequest) (_result *QueryTppParticipationinfoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryTppParticipationinfoResponse{}
	_body, _err := client.QueryTppParticipationinfoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 针对淘票票的参与信息查询接口
 * Summary: 淘票票参与信息查询接口
 */
func (client *Client) QueryTppParticipationinfoEx(request *QueryTppParticipationinfoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryTppParticipationinfoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryTppParticipationinfoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ent.tpp.participationinfo.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
