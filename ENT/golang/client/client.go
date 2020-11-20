// This file is auto-generated, don't edit it. Thanks.
package client

import (
	rpcutil "github.com/alibabacloud-go/tea-rpc-utils/service"
	util "github.com/alibabacloud-go/tea-utils/service"
	"github.com/alibabacloud-go/tea/tea"
	alipayutil "github.com/antchain-openapi-sdk-go/antchain-util/service"
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

// 收益模型
type Revenue struct {
	// 收益币种，目前仅支持CNY
	Currency *string `json:"currency,omitempty" xml:"currency,omitempty"`
	// 收益金额，单位为分
	Value *int64 `json:"value,omitempty" xml:"value,omitempty"`
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

// 用户收益明细
type UserRevenueDetail struct {
	// 累计收益
	AccumulativeRevenue *Revenue `json:"accumulative_revenue,omitempty" xml:"accumulative_revenue,omitempty"`
	// 待发放粉丝粒数量，单位分个。
	PendingTokenAmount *int64 `json:"pending_token_amount,omitempty" xml:"pending_token_amount,omitempty"`
	// 作品名称
	ProjectName *string `json:"project_name,omitempty" xml:"project_name,omitempty"`
	// 可兑现粉丝粒数量，单位分个。
	RedeemableTokenAmount *int64 `json:"redeemable_token_amount,omitempty" xml:"redeemable_token_amount,omitempty"`
	// 已兑现粉丝粒数量，单位分个
	RedeemedTokenAmount *int64 `json:"redeemed_token_amount,omitempty" xml:"redeemed_token_amount,omitempty"`
	// 已发放粉丝粒数量，单位分个。
	ReleasedTokenAmount *int64 `json:"released_token_amount,omitempty" xml:"released_token_amount,omitempty"`
	// 粉丝粒单价，单位分
	TokenPrice *int64 `json:"token_price,omitempty" xml:"token_price,omitempty"`
	// 可零收益
	WithdrawRevenue *Revenue `json:"withdraw_revenue,omitempty" xml:"withdraw_revenue,omitempty"`
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

// 项目
type Project struct {
	// 项目对应的合约 ID
	ContractId *string `json:"contract_id,omitempty" xml:"contract_id,omitempty"`
	// 项目结束时间，精确到毫秒，FILM类型订单必填
	ProjectEndTime *string `json:"project_end_time,omitempty" xml:"project_end_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]"`
	// 项目ID
	ProjectId *string `json:"project_id,omitempty" xml:"project_id,omitempty"`
	// 项目名称
	ProjectName *string `json:"project_name,omitempty" xml:"project_name,omitempty"`
	// 项目开始时间，精确到毫秒，FILM类型订单必填
	ProjectStartTime *string `json:"project_start_time,omitempty" xml:"project_start_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]"`
	// 项目类型，目前支持FILM：电影，CAR：汽车
	ProjectType *string `json:"project_type,omitempty" xml:"project_type,omitempty"`
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

// 用户资产明细
type UserAssetDetail struct {
	// 粉丝粒变化数量，带符号整数，单位分个。
	Asset *int64 `json:"asset,omitempty" xml:"asset,omitempty"`
	// 资产类型：PRE_ALLOCATION（待发放），RELEASED（已到账），CANCELLED（已取消），REDEEMING（兑现中），REDEEMED（已兑现）
	AssetType *string `json:"asset_type,omitempty" xml:"asset_type,omitempty"`
	// 业务单号
	BizNo *string `json:"biz_no,omitempty" xml:"biz_no,omitempty"`
	// 事件时间，时区GMT+8，精确到毫秒。
	EventTime *string `json:"event_time,omitempty" xml:"event_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]"`
	// 备注信息
	Memo *string `json:"memo,omitempty" xml:"memo,omitempty"`
	// 项目名称
	ProjectName *string `json:"project_name,omitempty" xml:"project_name,omitempty"`
	// 收益变化额度，单位为分。
	Revenue *Revenue `json:"revenue,omitempty" xml:"revenue,omitempty"`
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
	GainType *string `json:"gain_type,omitempty" xml:"gain_type,omitempty"`
	// 用户昵称
	Nickname *string `json:"nickname,omitempty" xml:"nickname,omitempty"`
	// Token发放状态
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 购票数
	TicketNumber *int64 `json:"ticket_number,omitempty" xml:"ticket_number,omitempty"`
	// Token数，单位为分个，1分个=0.01个
	Token *int64 `json:"token,omitempty" xml:"token,omitempty"`
	// Token展示数
	TokenDisplay *string `json:"token_display,omitempty" xml:"token_display,omitempty"`
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

func (s *AssetDetail) SetNickname(v string) *AssetDetail {
	s.Nickname = &v
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

// 订单详情
type Order struct {
	// 实付金额，单位分
	ActualTotalAmount *int64 `json:"actual_total_amount,omitempty" xml:"actual_total_amount,omitempty"`
	// 币种，目前仅支持 CNY
	Currency *string `json:"currency,omitempty" xml:"currency,omitempty"`
	// 数量
	ItemCount *int64 `json:"item_count,omitempty" xml:"item_count,omitempty"`
	// 唯一订单号
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty"`
	// 订单状态，ORDER_CREATE：订单创建，ORDER_CANCEL：订单取消
	OrderStatus *string `json:"order_status,omitempty" xml:"order_status,omitempty"`
	// 原始金额，单位分
	OriginalTotalAmount *int64 `json:"original_total_amount,omitempty" xml:"original_total_amount,omitempty"`
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

// 当前用户收益
type CurrentRevenue struct {
	// 币种，当前仅支持CNY
	Currency *string `json:"currency,omitempty" xml:"currency,omitempty"`
	// 金额，单位为分
	Value *int64 `json:"value,omitempty" xml:"value,omitempty"`
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
	Currency *string `json:"currency,omitempty" xml:"currency,omitempty"`
	// 金额，单位为分
	Value *int64 `json:"value,omitempty" xml:"value,omitempty"`
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
	// 用户账户，手机号格式为： +区号-手机号
	UserIdNo *string `json:"user_id_no,omitempty" xml:"user_id_no,omitempty"`
	// 用户账号类型，当前仅支持手机号和分享码，PHONE：手机号，SHARE_CODE：分享码
	UserIdType *string `json:"user_id_type,omitempty" xml:"user_id_type,omitempty"`
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

type QueryAntchainEntCustomerProjectRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 登录支付宝账号，手机号或者邮箱地址
	LogonId *string `json:"logon_id,omitempty" xml:"logon_id,omitempty"`
	// 登录账号类型，PHONE 为手机号，EMAIL 为邮箱地址。
	LogonIdType *string `json:"logon_id_type,omitempty" xml:"logon_id_type,omitempty"`
}

func (s QueryAntchainEntCustomerProjectRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAntchainEntCustomerProjectRequest) GoString() string {
	return s.String()
}

func (s *QueryAntchainEntCustomerProjectRequest) SetAuthToken(v string) *QueryAntchainEntCustomerProjectRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAntchainEntCustomerProjectRequest) SetProductInstanceId(v string) *QueryAntchainEntCustomerProjectRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAntchainEntCustomerProjectRequest) SetRegionName(v string) *QueryAntchainEntCustomerProjectRequest {
	s.RegionName = &v
	return s
}

func (s *QueryAntchainEntCustomerProjectRequest) SetLogonId(v string) *QueryAntchainEntCustomerProjectRequest {
	s.LogonId = &v
	return s
}

func (s *QueryAntchainEntCustomerProjectRequest) SetLogonIdType(v string) *QueryAntchainEntCustomerProjectRequest {
	s.LogonIdType = &v
	return s
}

type QueryAntchainEntCustomerProjectResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 项目列表，元素为项目名称。
	Projects []*Project `json:"projects,omitempty" xml:"projects,omitempty" type:"Repeated"`
}

func (s QueryAntchainEntCustomerProjectResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAntchainEntCustomerProjectResponse) GoString() string {
	return s.String()
}

func (s *QueryAntchainEntCustomerProjectResponse) SetReqMsgId(v string) *QueryAntchainEntCustomerProjectResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAntchainEntCustomerProjectResponse) SetResultCode(v string) *QueryAntchainEntCustomerProjectResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAntchainEntCustomerProjectResponse) SetResultMsg(v string) *QueryAntchainEntCustomerProjectResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAntchainEntCustomerProjectResponse) SetProjects(v []*Project) *QueryAntchainEntCustomerProjectResponse {
	s.Projects = v
	return s
}

type QueryAntchainEntCustomerDataRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 资产类型：PRE_ALLOCATION（待发放），RELEASED（已到账），CANCELLED（已取消），REDEEMING（兑现中），REDEEMED（已兑现）
	AssetType *string `json:"asset_type,omitempty" xml:"asset_type,omitempty"`
	// 合约ID
	ContractId *string `json:"contract_id,omitempty" xml:"contract_id,omitempty"`
	// 数据类型，ASSET：资产信息， REVENUE：收益信息
	DataType *string `json:"data_type,omitempty" xml:"data_type,omitempty"`
	// 截止时间，时区GMT+8，精确到毫秒
	EndTime *string `json:"end_time,omitempty" xml:"end_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]"`
	// 登录支付宝的账号，手机号或者邮箱
	LogonId *string `json:"logon_id,omitempty" xml:"logon_id,omitempty"`
	// 登录账号类型，PHONE：手机号， EMAIL：邮箱地址
	LogonIdType *string `json:"logon_id_type,omitempty" xml:"logon_id_type,omitempty"`
	// 排序方式，ASC：升序， DESC：降序，默认按照时间降序
	OrderBy *string `json:"order_by,omitempty" xml:"order_by,omitempty"`
	// 页码
	PageNum *int64 `json:"page_num,omitempty" xml:"page_num,omitempty"`
	// 页面大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// 起始时间，时区GMT+8，精确到毫秒
	StartTime *string `json:"start_time,omitempty" xml:"start_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]"`
}

func (s QueryAntchainEntCustomerDataRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAntchainEntCustomerDataRequest) GoString() string {
	return s.String()
}

func (s *QueryAntchainEntCustomerDataRequest) SetAuthToken(v string) *QueryAntchainEntCustomerDataRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAntchainEntCustomerDataRequest) SetProductInstanceId(v string) *QueryAntchainEntCustomerDataRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAntchainEntCustomerDataRequest) SetRegionName(v string) *QueryAntchainEntCustomerDataRequest {
	s.RegionName = &v
	return s
}

func (s *QueryAntchainEntCustomerDataRequest) SetAssetType(v string) *QueryAntchainEntCustomerDataRequest {
	s.AssetType = &v
	return s
}

func (s *QueryAntchainEntCustomerDataRequest) SetContractId(v string) *QueryAntchainEntCustomerDataRequest {
	s.ContractId = &v
	return s
}

func (s *QueryAntchainEntCustomerDataRequest) SetDataType(v string) *QueryAntchainEntCustomerDataRequest {
	s.DataType = &v
	return s
}

func (s *QueryAntchainEntCustomerDataRequest) SetEndTime(v string) *QueryAntchainEntCustomerDataRequest {
	s.EndTime = &v
	return s
}

func (s *QueryAntchainEntCustomerDataRequest) SetLogonId(v string) *QueryAntchainEntCustomerDataRequest {
	s.LogonId = &v
	return s
}

func (s *QueryAntchainEntCustomerDataRequest) SetLogonIdType(v string) *QueryAntchainEntCustomerDataRequest {
	s.LogonIdType = &v
	return s
}

func (s *QueryAntchainEntCustomerDataRequest) SetOrderBy(v string) *QueryAntchainEntCustomerDataRequest {
	s.OrderBy = &v
	return s
}

func (s *QueryAntchainEntCustomerDataRequest) SetPageNum(v int64) *QueryAntchainEntCustomerDataRequest {
	s.PageNum = &v
	return s
}

func (s *QueryAntchainEntCustomerDataRequest) SetPageSize(v int64) *QueryAntchainEntCustomerDataRequest {
	s.PageSize = &v
	return s
}

func (s *QueryAntchainEntCustomerDataRequest) SetStartTime(v string) *QueryAntchainEntCustomerDataRequest {
	s.StartTime = &v
	return s
}

type QueryAntchainEntCustomerDataResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
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

func (s QueryAntchainEntCustomerDataResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAntchainEntCustomerDataResponse) GoString() string {
	return s.String()
}

func (s *QueryAntchainEntCustomerDataResponse) SetReqMsgId(v string) *QueryAntchainEntCustomerDataResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAntchainEntCustomerDataResponse) SetResultCode(v string) *QueryAntchainEntCustomerDataResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAntchainEntCustomerDataResponse) SetResultMsg(v string) *QueryAntchainEntCustomerDataResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAntchainEntCustomerDataResponse) SetDataType(v string) *QueryAntchainEntCustomerDataResponse {
	s.DataType = &v
	return s
}

func (s *QueryAntchainEntCustomerDataResponse) SetLogonId(v string) *QueryAntchainEntCustomerDataResponse {
	s.LogonId = &v
	return s
}

func (s *QueryAntchainEntCustomerDataResponse) SetLogonIdType(v string) *QueryAntchainEntCustomerDataResponse {
	s.LogonIdType = &v
	return s
}

func (s *QueryAntchainEntCustomerDataResponse) SetPageNum(v int64) *QueryAntchainEntCustomerDataResponse {
	s.PageNum = &v
	return s
}

func (s *QueryAntchainEntCustomerDataResponse) SetPageSize(v int64) *QueryAntchainEntCustomerDataResponse {
	s.PageSize = &v
	return s
}

func (s *QueryAntchainEntCustomerDataResponse) SetTotalCount(v int64) *QueryAntchainEntCustomerDataResponse {
	s.TotalCount = &v
	return s
}

func (s *QueryAntchainEntCustomerDataResponse) SetUserAssetDetails(v []*UserAssetDetail) *QueryAntchainEntCustomerDataResponse {
	s.UserAssetDetails = v
	return s
}

func (s *QueryAntchainEntCustomerDataResponse) SetUserRevenueData(v *UserRevenueDetail) *QueryAntchainEntCustomerDataResponse {
	s.UserRevenueData = v
	return s
}

func (s *QueryAntchainEntCustomerDataResponse) SetVid(v string) *QueryAntchainEntCustomerDataResponse {
	s.Vid = &v
	return s
}

type GetAntchainEntUserSharecodeRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 分享者账号，如果账号类型为手机号则格式如 +86-11 位手机号，如果账号类型为支付宝账号，则填写邮箱地址或者 11 位手机号
	SharerId *string `json:"sharer_id,omitempty" xml:"sharer_id,omitempty"`
	// 分享者账号类型，PHONE：手机号，ALIPAY_LOGON_ID：支付宝账号
	SharerIdType *string `json:"sharer_id_type,omitempty" xml:"sharer_id_type,omitempty"`
}

func (s GetAntchainEntUserSharecodeRequest) String() string {
	return tea.Prettify(s)
}

func (s GetAntchainEntUserSharecodeRequest) GoString() string {
	return s.String()
}

func (s *GetAntchainEntUserSharecodeRequest) SetAuthToken(v string) *GetAntchainEntUserSharecodeRequest {
	s.AuthToken = &v
	return s
}

func (s *GetAntchainEntUserSharecodeRequest) SetProductInstanceId(v string) *GetAntchainEntUserSharecodeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetAntchainEntUserSharecodeRequest) SetRegionName(v string) *GetAntchainEntUserSharecodeRequest {
	s.RegionName = &v
	return s
}

func (s *GetAntchainEntUserSharecodeRequest) SetSharerId(v string) *GetAntchainEntUserSharecodeRequest {
	s.SharerId = &v
	return s
}

func (s *GetAntchainEntUserSharecodeRequest) SetSharerIdType(v string) *GetAntchainEntUserSharecodeRequest {
	s.SharerIdType = &v
	return s
}

type GetAntchainEntUserSharecodeResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 分享码
	ShareCode *string `json:"share_code,omitempty" xml:"share_code,omitempty"`
}

func (s GetAntchainEntUserSharecodeResponse) String() string {
	return tea.Prettify(s)
}

func (s GetAntchainEntUserSharecodeResponse) GoString() string {
	return s.String()
}

func (s *GetAntchainEntUserSharecodeResponse) SetReqMsgId(v string) *GetAntchainEntUserSharecodeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetAntchainEntUserSharecodeResponse) SetResultCode(v string) *GetAntchainEntUserSharecodeResponse {
	s.ResultCode = &v
	return s
}

func (s *GetAntchainEntUserSharecodeResponse) SetResultMsg(v string) *GetAntchainEntUserSharecodeResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetAntchainEntUserSharecodeResponse) SetShareCode(v string) *GetAntchainEntUserSharecodeResponse {
	s.ShareCode = &v
	return s
}

type SendAntchainEntUserProjectordermsgRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 购买者
	Buyer *User `json:"buyer,omitempty" xml:"buyer,omitempty"`
	// 链ID
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	// 订单详情
	Order *Order `json:"order,omitempty" xml:"order,omitempty"`
	// 项目信息
	Project *Project `json:"project,omitempty" xml:"project,omitempty"`
	// 分享者
	Sharer *User `json:"sharer,omitempty" xml:"sharer,omitempty"`
}

func (s SendAntchainEntUserProjectordermsgRequest) String() string {
	return tea.Prettify(s)
}

func (s SendAntchainEntUserProjectordermsgRequest) GoString() string {
	return s.String()
}

func (s *SendAntchainEntUserProjectordermsgRequest) SetAuthToken(v string) *SendAntchainEntUserProjectordermsgRequest {
	s.AuthToken = &v
	return s
}

func (s *SendAntchainEntUserProjectordermsgRequest) SetProductInstanceId(v string) *SendAntchainEntUserProjectordermsgRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SendAntchainEntUserProjectordermsgRequest) SetRegionName(v string) *SendAntchainEntUserProjectordermsgRequest {
	s.RegionName = &v
	return s
}

func (s *SendAntchainEntUserProjectordermsgRequest) SetBuyer(v *User) *SendAntchainEntUserProjectordermsgRequest {
	s.Buyer = v
	return s
}

func (s *SendAntchainEntUserProjectordermsgRequest) SetChainId(v string) *SendAntchainEntUserProjectordermsgRequest {
	s.ChainId = &v
	return s
}

func (s *SendAntchainEntUserProjectordermsgRequest) SetOrder(v *Order) *SendAntchainEntUserProjectordermsgRequest {
	s.Order = v
	return s
}

func (s *SendAntchainEntUserProjectordermsgRequest) SetProject(v *Project) *SendAntchainEntUserProjectordermsgRequest {
	s.Project = v
	return s
}

func (s *SendAntchainEntUserProjectordermsgRequest) SetSharer(v *User) *SendAntchainEntUserProjectordermsgRequest {
	s.Sharer = v
	return s
}

type SendAntchainEntUserProjectordermsgResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s SendAntchainEntUserProjectordermsgResponse) String() string {
	return tea.Prettify(s)
}

func (s SendAntchainEntUserProjectordermsgResponse) GoString() string {
	return s.String()
}

func (s *SendAntchainEntUserProjectordermsgResponse) SetReqMsgId(v string) *SendAntchainEntUserProjectordermsgResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SendAntchainEntUserProjectordermsgResponse) SetResultCode(v string) *SendAntchainEntUserProjectordermsgResponse {
	s.ResultCode = &v
	return s
}

func (s *SendAntchainEntUserProjectordermsgResponse) SetResultMsg(v string) *SendAntchainEntUserProjectordermsgResponse {
	s.ResultMsg = &v
	return s
}

type GetAntchainEntIsvSharecodeRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 电话号码/邮箱等登陆名
	LogonId *string `json:"logon_id,omitempty" xml:"logon_id,omitempty"`
}

func (s GetAntchainEntIsvSharecodeRequest) String() string {
	return tea.Prettify(s)
}

func (s GetAntchainEntIsvSharecodeRequest) GoString() string {
	return s.String()
}

func (s *GetAntchainEntIsvSharecodeRequest) SetAuthToken(v string) *GetAntchainEntIsvSharecodeRequest {
	s.AuthToken = &v
	return s
}

func (s *GetAntchainEntIsvSharecodeRequest) SetProductInstanceId(v string) *GetAntchainEntIsvSharecodeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetAntchainEntIsvSharecodeRequest) SetRegionName(v string) *GetAntchainEntIsvSharecodeRequest {
	s.RegionName = &v
	return s
}

func (s *GetAntchainEntIsvSharecodeRequest) SetLogonId(v string) *GetAntchainEntIsvSharecodeRequest {
	s.LogonId = &v
	return s
}

type GetAntchainEntIsvSharecodeResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 生成的ISV用户邀请码
	ShareCode *string `json:"share_code,omitempty" xml:"share_code,omitempty"`
}

func (s GetAntchainEntIsvSharecodeResponse) String() string {
	return tea.Prettify(s)
}

func (s GetAntchainEntIsvSharecodeResponse) GoString() string {
	return s.String()
}

func (s *GetAntchainEntIsvSharecodeResponse) SetReqMsgId(v string) *GetAntchainEntIsvSharecodeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetAntchainEntIsvSharecodeResponse) SetResultCode(v string) *GetAntchainEntIsvSharecodeResponse {
	s.ResultCode = &v
	return s
}

func (s *GetAntchainEntIsvSharecodeResponse) SetResultMsg(v string) *GetAntchainEntIsvSharecodeResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetAntchainEntIsvSharecodeResponse) SetShareCode(v string) *GetAntchainEntIsvSharecodeResponse {
	s.ShareCode = &v
	return s
}

type AddAntchainEntProvisionRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 业务单号
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty"`
	// 链 ID
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	// 合约 ID
	ContractId *string `json:"contract_id,omitempty" xml:"contract_id,omitempty"`
	// 调用方，例如租户 ID
	Source *string `json:"source,omitempty" xml:"source,omitempty"`
	// 金额，单位为分
	Value *int64 `json:"value,omitempty" xml:"value,omitempty"`
}

func (s AddAntchainEntProvisionRequest) String() string {
	return tea.Prettify(s)
}

func (s AddAntchainEntProvisionRequest) GoString() string {
	return s.String()
}

func (s *AddAntchainEntProvisionRequest) SetAuthToken(v string) *AddAntchainEntProvisionRequest {
	s.AuthToken = &v
	return s
}

func (s *AddAntchainEntProvisionRequest) SetProductInstanceId(v string) *AddAntchainEntProvisionRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AddAntchainEntProvisionRequest) SetRegionName(v string) *AddAntchainEntProvisionRequest {
	s.RegionName = &v
	return s
}

func (s *AddAntchainEntProvisionRequest) SetBizId(v string) *AddAntchainEntProvisionRequest {
	s.BizId = &v
	return s
}

func (s *AddAntchainEntProvisionRequest) SetChainId(v string) *AddAntchainEntProvisionRequest {
	s.ChainId = &v
	return s
}

func (s *AddAntchainEntProvisionRequest) SetContractId(v string) *AddAntchainEntProvisionRequest {
	s.ContractId = &v
	return s
}

func (s *AddAntchainEntProvisionRequest) SetSource(v string) *AddAntchainEntProvisionRequest {
	s.Source = &v
	return s
}

func (s *AddAntchainEntProvisionRequest) SetValue(v int64) *AddAntchainEntProvisionRequest {
	s.Value = &v
	return s
}

type AddAntchainEntProvisionResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s AddAntchainEntProvisionResponse) String() string {
	return tea.Prettify(s)
}

func (s AddAntchainEntProvisionResponse) GoString() string {
	return s.String()
}

func (s *AddAntchainEntProvisionResponse) SetReqMsgId(v string) *AddAntchainEntProvisionResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AddAntchainEntProvisionResponse) SetResultCode(v string) *AddAntchainEntProvisionResponse {
	s.ResultCode = &v
	return s
}

func (s *AddAntchainEntProvisionResponse) SetResultMsg(v string) *AddAntchainEntProvisionResponse {
	s.ResultMsg = &v
	return s
}

type ReclaimAntchainEntProvisionExtraprovisionRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 业务单号
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty"`
	// 链 ID
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	// 合约 ID
	ContractId *string `json:"contract_id,omitempty" xml:"contract_id,omitempty"`
	// 调用方，例如租户 ID
	Source *string `json:"source,omitempty" xml:"source,omitempty"`
}

func (s ReclaimAntchainEntProvisionExtraprovisionRequest) String() string {
	return tea.Prettify(s)
}

func (s ReclaimAntchainEntProvisionExtraprovisionRequest) GoString() string {
	return s.String()
}

func (s *ReclaimAntchainEntProvisionExtraprovisionRequest) SetAuthToken(v string) *ReclaimAntchainEntProvisionExtraprovisionRequest {
	s.AuthToken = &v
	return s
}

func (s *ReclaimAntchainEntProvisionExtraprovisionRequest) SetProductInstanceId(v string) *ReclaimAntchainEntProvisionExtraprovisionRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ReclaimAntchainEntProvisionExtraprovisionRequest) SetRegionName(v string) *ReclaimAntchainEntProvisionExtraprovisionRequest {
	s.RegionName = &v
	return s
}

func (s *ReclaimAntchainEntProvisionExtraprovisionRequest) SetBizId(v string) *ReclaimAntchainEntProvisionExtraprovisionRequest {
	s.BizId = &v
	return s
}

func (s *ReclaimAntchainEntProvisionExtraprovisionRequest) SetChainId(v string) *ReclaimAntchainEntProvisionExtraprovisionRequest {
	s.ChainId = &v
	return s
}

func (s *ReclaimAntchainEntProvisionExtraprovisionRequest) SetContractId(v string) *ReclaimAntchainEntProvisionExtraprovisionRequest {
	s.ContractId = &v
	return s
}

func (s *ReclaimAntchainEntProvisionExtraprovisionRequest) SetSource(v string) *ReclaimAntchainEntProvisionExtraprovisionRequest {
	s.Source = &v
	return s
}

type ReclaimAntchainEntProvisionExtraprovisionResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s ReclaimAntchainEntProvisionExtraprovisionResponse) String() string {
	return tea.Prettify(s)
}

func (s ReclaimAntchainEntProvisionExtraprovisionResponse) GoString() string {
	return s.String()
}

func (s *ReclaimAntchainEntProvisionExtraprovisionResponse) SetReqMsgId(v string) *ReclaimAntchainEntProvisionExtraprovisionResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ReclaimAntchainEntProvisionExtraprovisionResponse) SetResultCode(v string) *ReclaimAntchainEntProvisionExtraprovisionResponse {
	s.ResultCode = &v
	return s
}

func (s *ReclaimAntchainEntProvisionExtraprovisionResponse) SetResultMsg(v string) *ReclaimAntchainEntProvisionExtraprovisionResponse {
	s.ResultMsg = &v
	return s
}

type ExecAntchainEntTokenRedeemRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 业务单号
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty"`
	// 链 ID
	ChainId *string `json:"chain_id,omitempty" xml:"chain_id,omitempty"`
	// 合约 ID
	ContractId *string `json:"contract_id,omitempty" xml:"contract_id,omitempty"`
	// 币种，目前仅支持 CNY
	Currency *string `json:"currency,omitempty" xml:"currency,omitempty"`
	// 调用方
	Source *string `json:"source,omitempty" xml:"source,omitempty"`
	// 要兑现的用户VID
	TargetUser *string `json:"target_user,omitempty" xml:"target_user,omitempty"`
	// Token总金额，token_price*token_number 的结果，单位为分
	TokenAmount *int64 `json:"token_amount,omitempty" xml:"token_amount,omitempty"`
	// 兑现的Token数目
	TokenNumber *int64 `json:"token_number,omitempty" xml:"token_number,omitempty"`
	// 兑现的Token单价，单位为分
	TokenPrice *int64 `json:"token_price,omitempty" xml:"token_price,omitempty"`
}

func (s ExecAntchainEntTokenRedeemRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecAntchainEntTokenRedeemRequest) GoString() string {
	return s.String()
}

func (s *ExecAntchainEntTokenRedeemRequest) SetAuthToken(v string) *ExecAntchainEntTokenRedeemRequest {
	s.AuthToken = &v
	return s
}

func (s *ExecAntchainEntTokenRedeemRequest) SetProductInstanceId(v string) *ExecAntchainEntTokenRedeemRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ExecAntchainEntTokenRedeemRequest) SetRegionName(v string) *ExecAntchainEntTokenRedeemRequest {
	s.RegionName = &v
	return s
}

func (s *ExecAntchainEntTokenRedeemRequest) SetBizId(v string) *ExecAntchainEntTokenRedeemRequest {
	s.BizId = &v
	return s
}

func (s *ExecAntchainEntTokenRedeemRequest) SetChainId(v string) *ExecAntchainEntTokenRedeemRequest {
	s.ChainId = &v
	return s
}

func (s *ExecAntchainEntTokenRedeemRequest) SetContractId(v string) *ExecAntchainEntTokenRedeemRequest {
	s.ContractId = &v
	return s
}

func (s *ExecAntchainEntTokenRedeemRequest) SetCurrency(v string) *ExecAntchainEntTokenRedeemRequest {
	s.Currency = &v
	return s
}

func (s *ExecAntchainEntTokenRedeemRequest) SetSource(v string) *ExecAntchainEntTokenRedeemRequest {
	s.Source = &v
	return s
}

func (s *ExecAntchainEntTokenRedeemRequest) SetTargetUser(v string) *ExecAntchainEntTokenRedeemRequest {
	s.TargetUser = &v
	return s
}

func (s *ExecAntchainEntTokenRedeemRequest) SetTokenAmount(v int64) *ExecAntchainEntTokenRedeemRequest {
	s.TokenAmount = &v
	return s
}

func (s *ExecAntchainEntTokenRedeemRequest) SetTokenNumber(v int64) *ExecAntchainEntTokenRedeemRequest {
	s.TokenNumber = &v
	return s
}

func (s *ExecAntchainEntTokenRedeemRequest) SetTokenPrice(v int64) *ExecAntchainEntTokenRedeemRequest {
	s.TokenPrice = &v
	return s
}

type ExecAntchainEntTokenRedeemResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s ExecAntchainEntTokenRedeemResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecAntchainEntTokenRedeemResponse) GoString() string {
	return s.String()
}

func (s *ExecAntchainEntTokenRedeemResponse) SetReqMsgId(v string) *ExecAntchainEntTokenRedeemResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ExecAntchainEntTokenRedeemResponse) SetResultCode(v string) *ExecAntchainEntTokenRedeemResponse {
	s.ResultCode = &v
	return s
}

func (s *ExecAntchainEntTokenRedeemResponse) SetResultMsg(v string) *ExecAntchainEntTokenRedeemResponse {
	s.ResultMsg = &v
	return s
}

type GetAntchainEntTppSharecodeRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 分享人在淘票票端绑定的支付宝UID
	AlipayUid *string `json:"alipay_uid,omitempty" xml:"alipay_uid,omitempty"`
}

func (s GetAntchainEntTppSharecodeRequest) String() string {
	return tea.Prettify(s)
}

func (s GetAntchainEntTppSharecodeRequest) GoString() string {
	return s.String()
}

func (s *GetAntchainEntTppSharecodeRequest) SetAuthToken(v string) *GetAntchainEntTppSharecodeRequest {
	s.AuthToken = &v
	return s
}

func (s *GetAntchainEntTppSharecodeRequest) SetProductInstanceId(v string) *GetAntchainEntTppSharecodeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetAntchainEntTppSharecodeRequest) SetRegionName(v string) *GetAntchainEntTppSharecodeRequest {
	s.RegionName = &v
	return s
}

func (s *GetAntchainEntTppSharecodeRequest) SetAlipayUid(v string) *GetAntchainEntTppSharecodeRequest {
	s.AlipayUid = &v
	return s
}

type GetAntchainEntTppSharecodeResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 专属邀请码
	ShareCode *string `json:"share_code,omitempty" xml:"share_code,omitempty"`
}

func (s GetAntchainEntTppSharecodeResponse) String() string {
	return tea.Prettify(s)
}

func (s GetAntchainEntTppSharecodeResponse) GoString() string {
	return s.String()
}

func (s *GetAntchainEntTppSharecodeResponse) SetReqMsgId(v string) *GetAntchainEntTppSharecodeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetAntchainEntTppSharecodeResponse) SetResultCode(v string) *GetAntchainEntTppSharecodeResponse {
	s.ResultCode = &v
	return s
}

func (s *GetAntchainEntTppSharecodeResponse) SetResultMsg(v string) *GetAntchainEntTppSharecodeResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetAntchainEntTppSharecodeResponse) SetShareCode(v string) *GetAntchainEntTppSharecodeResponse {
	s.ShareCode = &v
	return s
}

type QueryAntchainEntTppAllinfoRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 支付宝UID
	AlipayUid *string `json:"alipay_uid,omitempty" xml:"alipay_uid,omitempty"`
	// 排序方式，默认降序
	OrderBy *string `json:"order_by,omitempty" xml:"order_by,omitempty"`
	// 页码
	PageId *int64 `json:"page_id,omitempty" xml:"page_id,omitempty"`
	// 页面大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
}

func (s QueryAntchainEntTppAllinfoRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAntchainEntTppAllinfoRequest) GoString() string {
	return s.String()
}

func (s *QueryAntchainEntTppAllinfoRequest) SetAuthToken(v string) *QueryAntchainEntTppAllinfoRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAntchainEntTppAllinfoRequest) SetProductInstanceId(v string) *QueryAntchainEntTppAllinfoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAntchainEntTppAllinfoRequest) SetRegionName(v string) *QueryAntchainEntTppAllinfoRequest {
	s.RegionName = &v
	return s
}

func (s *QueryAntchainEntTppAllinfoRequest) SetAlipayUid(v string) *QueryAntchainEntTppAllinfoRequest {
	s.AlipayUid = &v
	return s
}

func (s *QueryAntchainEntTppAllinfoRequest) SetOrderBy(v string) *QueryAntchainEntTppAllinfoRequest {
	s.OrderBy = &v
	return s
}

func (s *QueryAntchainEntTppAllinfoRequest) SetPageId(v int64) *QueryAntchainEntTppAllinfoRequest {
	s.PageId = &v
	return s
}

func (s *QueryAntchainEntTppAllinfoRequest) SetPageSize(v int64) *QueryAntchainEntTppAllinfoRequest {
	s.PageSize = &v
	return s
}

type QueryAntchainEntTppAllinfoResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
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

func (s QueryAntchainEntTppAllinfoResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAntchainEntTppAllinfoResponse) GoString() string {
	return s.String()
}

func (s *QueryAntchainEntTppAllinfoResponse) SetReqMsgId(v string) *QueryAntchainEntTppAllinfoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAntchainEntTppAllinfoResponse) SetResultCode(v string) *QueryAntchainEntTppAllinfoResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAntchainEntTppAllinfoResponse) SetResultMsg(v string) *QueryAntchainEntTppAllinfoResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAntchainEntTppAllinfoResponse) SetAccumulativeRevenue(v *Revenue) *QueryAntchainEntTppAllinfoResponse {
	s.AccumulativeRevenue = v
	return s
}

func (s *QueryAntchainEntTppAllinfoResponse) SetAccumulativeUsers(v int64) *QueryAntchainEntTppAllinfoResponse {
	s.AccumulativeUsers = &v
	return s
}

func (s *QueryAntchainEntTppAllinfoResponse) SetAssetDetailList(v []*AssetDetail) *QueryAntchainEntTppAllinfoResponse {
	s.AssetDetailList = v
	return s
}

func (s *QueryAntchainEntTppAllinfoResponse) SetCurrentAccumulativeRevenue(v *Revenue) *QueryAntchainEntTppAllinfoResponse {
	s.CurrentAccumulativeRevenue = v
	return s
}

func (s *QueryAntchainEntTppAllinfoResponse) SetCurrentRevenue(v *Revenue) *QueryAntchainEntTppAllinfoResponse {
	s.CurrentRevenue = v
	return s
}

type QueryAntchainEntTppParticipationinfoRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
}

func (s QueryAntchainEntTppParticipationinfoRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAntchainEntTppParticipationinfoRequest) GoString() string {
	return s.String()
}

func (s *QueryAntchainEntTppParticipationinfoRequest) SetAuthToken(v string) *QueryAntchainEntTppParticipationinfoRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAntchainEntTppParticipationinfoRequest) SetProductInstanceId(v string) *QueryAntchainEntTppParticipationinfoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAntchainEntTppParticipationinfoRequest) SetRegionName(v string) *QueryAntchainEntTppParticipationinfoRequest {
	s.RegionName = &v
	return s
}

type QueryAntchainEntTppParticipationinfoResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 累计全部参与收益
	AccumulativeRevenue *AccumulativeRevenue `json:"accumulative_revenue,omitempty" xml:"accumulative_revenue,omitempty"`
	// 累计参与用户数
	AccumulativeUsers *int64 `json:"accumulative_users,omitempty" xml:"accumulative_users,omitempty"`
}

func (s QueryAntchainEntTppParticipationinfoResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAntchainEntTppParticipationinfoResponse) GoString() string {
	return s.String()
}

func (s *QueryAntchainEntTppParticipationinfoResponse) SetReqMsgId(v string) *QueryAntchainEntTppParticipationinfoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAntchainEntTppParticipationinfoResponse) SetResultCode(v string) *QueryAntchainEntTppParticipationinfoResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAntchainEntTppParticipationinfoResponse) SetResultMsg(v string) *QueryAntchainEntTppParticipationinfoResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAntchainEntTppParticipationinfoResponse) SetAccumulativeRevenue(v *AccumulativeRevenue) *QueryAntchainEntTppParticipationinfoResponse {
	s.AccumulativeRevenue = v
	return s
}

func (s *QueryAntchainEntTppParticipationinfoResponse) SetAccumulativeUsers(v int64) *QueryAntchainEntTppParticipationinfoResponse {
	s.AccumulativeUsers = &v
	return s
}

type Client struct {
	Endpoint        *string
	RegionId        *string
	AccessKeyId     *string
	AccessKeySecret *string
	Protocol        *string
	UserAgent       *string
	ReadTimeout     *int
	ConnectTimeout  *int
	HttpProxy       *string
	HttpsProxy      *string
	Socks5Proxy     *string
	Socks5NetWork   *string
	NoProxy         *string
	MaxIdleConns    *int
	SecurityToken   *string
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
	client.ReadTimeout = config.ReadTimeout
	client.ConnectTimeout = config.ConnectTimeout
	client.HttpProxy = config.HttpProxy
	client.HttpsProxy = config.HttpsProxy
	client.NoProxy = config.NoProxy
	client.Socks5Proxy = config.Socks5Proxy
	client.Socks5NetWork = config.Socks5NetWork
	client.MaxIdleConns = config.MaxIdleConns
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
func (client *Client) DoRequest(version *string, action *string, protocol *string, method *string, pathname *string, request map[string]interface{}, runtime *util.RuntimeOptions) (_result map[string]interface{}, _err error) {
	_err = tea.Validate(runtime)
	if _err != nil {
		return _result, _err
	}
	_runtime := map[string]interface{}{
		"timeouted":      "retry",
		"readTimeout":    tea.IntValue(util.DefaultNumber(runtime.ReadTimeout, client.ReadTimeout)),
		"connectTimeout": tea.IntValue(util.DefaultNumber(runtime.ConnectTimeout, client.ConnectTimeout)),
		"httpProxy":      tea.StringValue(util.DefaultString(runtime.HttpProxy, client.HttpProxy)),
		"httpsProxy":     tea.StringValue(util.DefaultString(runtime.HttpsProxy, client.HttpsProxy)),
		"noProxy":        tea.StringValue(util.DefaultString(runtime.NoProxy, client.NoProxy)),
		"maxIdleConns":   tea.IntValue(util.DefaultNumber(runtime.MaxIdleConns, client.MaxIdleConns)),
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
				"method":         action,
				"version":        version,
				"sign_type":      tea.String("HmacSHA1"),
				"req_time":       alipayutil.GetTimestamp(),
				"req_msg_id":     util.GetNonce(),
				"access_key":     client.AccessKeyId,
				"charset":        tea.String("UTF-8"),
				"baseSdkVersion": tea.String("Tea-SDK"),
				"sdkVersion":     tea.String("Tea-SDK-20201120"),
			}
			if !tea.BoolValue(util.Empty(client.SecurityToken)) {
				request_.Query["security_token"] = client.SecurityToken
			}

			request_.Headers = map[string]*string{
				"host":       client.Endpoint,
				"user-agent": client.GetUserAgent(),
			}
			tmp := util.AnyifyMapValue(rpcutil.Query(request))
			request_.Body = tea.ToReader(util.ToFormString(tmp))
			request_.Headers["content-type"] = tea.String("application/x-www-form-urlencoded")
			signedParam := tea.Merge(request_.Query,
				rpcutil.Query(request))
			request_.Query["sign"] = alipayutil.GetSignature(signedParam, client.AccessKeySecret)
			response_, _err := tea.DoRequest(request_, _runtime)
			if _err != nil {
				return _result, _err
			}
			obj, _err := util.ReadAsJSON(response_.Body)
			if _err != nil {
				return _result, _err
			}

			res := util.AssertAsMap(obj)
			resp := util.AssertAsMap(res["response"])
			if tea.BoolValue(alipayutil.HasError(res)) {
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
 * Get user agent
 * @return user agent
 */
func (client *Client) GetUserAgent() (_result *string) {
	userAgent := tea.String("TeaClient/1.0.0")
	_body := util.GetUserAgent(userAgent)
	_result = _body
	return _result
}

/**
 * Description: 查询用户参与的所有项目
 * Summary: 用户参与的项目查询
 */
func (client *Client) QueryAntchainEntCustomerProject(request *QueryAntchainEntCustomerProjectRequest) (_result *QueryAntchainEntCustomerProjectResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryAntchainEntCustomerProjectResponse{}
	_body, _err := client.QueryAntchainEntCustomerProjectEx(request, runtime)
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
func (client *Client) QueryAntchainEntCustomerProjectEx(request *QueryAntchainEntCustomerProjectRequest, runtime *util.RuntimeOptions) (_result *QueryAntchainEntCustomerProjectResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAntchainEntCustomerProjectResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ent.customer.project.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) QueryAntchainEntCustomerData(request *QueryAntchainEntCustomerDataRequest) (_result *QueryAntchainEntCustomerDataResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryAntchainEntCustomerDataResponse{}
	_body, _err := client.QueryAntchainEntCustomerDataEx(request, runtime)
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
func (client *Client) QueryAntchainEntCustomerDataEx(request *QueryAntchainEntCustomerDataRequest, runtime *util.RuntimeOptions) (_result *QueryAntchainEntCustomerDataResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAntchainEntCustomerDataResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ent.customer.data.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) GetAntchainEntUserSharecode(request *GetAntchainEntUserSharecodeRequest) (_result *GetAntchainEntUserSharecodeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &GetAntchainEntUserSharecodeResponse{}
	_body, _err := client.GetAntchainEntUserSharecodeEx(request, runtime)
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
func (client *Client) GetAntchainEntUserSharecodeEx(request *GetAntchainEntUserSharecodeRequest, runtime *util.RuntimeOptions) (_result *GetAntchainEntUserSharecodeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetAntchainEntUserSharecodeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ent.user.sharecode.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) SendAntchainEntUserProjectordermsg(request *SendAntchainEntUserProjectordermsgRequest) (_result *SendAntchainEntUserProjectordermsgResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &SendAntchainEntUserProjectordermsgResponse{}
	_body, _err := client.SendAntchainEntUserProjectordermsgEx(request, runtime)
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
func (client *Client) SendAntchainEntUserProjectordermsgEx(request *SendAntchainEntUserProjectordermsgRequest, runtime *util.RuntimeOptions) (_result *SendAntchainEntUserProjectordermsgResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SendAntchainEntUserProjectordermsgResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ent.user.projectordermsg.send"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) GetAntchainEntIsvSharecode(request *GetAntchainEntIsvSharecodeRequest) (_result *GetAntchainEntIsvSharecodeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &GetAntchainEntIsvSharecodeResponse{}
	_body, _err := client.GetAntchainEntIsvSharecodeEx(request, runtime)
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
func (client *Client) GetAntchainEntIsvSharecodeEx(request *GetAntchainEntIsvSharecodeRequest, runtime *util.RuntimeOptions) (_result *GetAntchainEntIsvSharecodeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetAntchainEntIsvSharecodeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ent.isv.sharecode.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) AddAntchainEntProvision(request *AddAntchainEntProvisionRequest) (_result *AddAntchainEntProvisionResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &AddAntchainEntProvisionResponse{}
	_body, _err := client.AddAntchainEntProvisionEx(request, runtime)
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
func (client *Client) AddAntchainEntProvisionEx(request *AddAntchainEntProvisionRequest, runtime *util.RuntimeOptions) (_result *AddAntchainEntProvisionResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AddAntchainEntProvisionResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ent.provision.add"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) ReclaimAntchainEntProvisionExtraprovision(request *ReclaimAntchainEntProvisionExtraprovisionRequest) (_result *ReclaimAntchainEntProvisionExtraprovisionResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &ReclaimAntchainEntProvisionExtraprovisionResponse{}
	_body, _err := client.ReclaimAntchainEntProvisionExtraprovisionEx(request, runtime)
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
func (client *Client) ReclaimAntchainEntProvisionExtraprovisionEx(request *ReclaimAntchainEntProvisionExtraprovisionRequest, runtime *util.RuntimeOptions) (_result *ReclaimAntchainEntProvisionExtraprovisionResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ReclaimAntchainEntProvisionExtraprovisionResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ent.provision.extraprovision.reclaim"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) ExecAntchainEntTokenRedeem(request *ExecAntchainEntTokenRedeemRequest) (_result *ExecAntchainEntTokenRedeemResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &ExecAntchainEntTokenRedeemResponse{}
	_body, _err := client.ExecAntchainEntTokenRedeemEx(request, runtime)
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
func (client *Client) ExecAntchainEntTokenRedeemEx(request *ExecAntchainEntTokenRedeemRequest, runtime *util.RuntimeOptions) (_result *ExecAntchainEntTokenRedeemResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecAntchainEntTokenRedeemResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ent.token.redeem.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) GetAntchainEntTppSharecode(request *GetAntchainEntTppSharecodeRequest) (_result *GetAntchainEntTppSharecodeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &GetAntchainEntTppSharecodeResponse{}
	_body, _err := client.GetAntchainEntTppSharecodeEx(request, runtime)
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
func (client *Client) GetAntchainEntTppSharecodeEx(request *GetAntchainEntTppSharecodeRequest, runtime *util.RuntimeOptions) (_result *GetAntchainEntTppSharecodeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetAntchainEntTppSharecodeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ent.tpp.sharecode.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) QueryAntchainEntTppAllinfo(request *QueryAntchainEntTppAllinfoRequest) (_result *QueryAntchainEntTppAllinfoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryAntchainEntTppAllinfoResponse{}
	_body, _err := client.QueryAntchainEntTppAllinfoEx(request, runtime)
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
func (client *Client) QueryAntchainEntTppAllinfoEx(request *QueryAntchainEntTppAllinfoRequest, runtime *util.RuntimeOptions) (_result *QueryAntchainEntTppAllinfoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAntchainEntTppAllinfoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ent.tpp.allinfo.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
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
func (client *Client) QueryAntchainEntTppParticipationinfo(request *QueryAntchainEntTppParticipationinfoRequest) (_result *QueryAntchainEntTppParticipationinfoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryAntchainEntTppParticipationinfoResponse{}
	_body, _err := client.QueryAntchainEntTppParticipationinfoEx(request, runtime)
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
func (client *Client) QueryAntchainEntTppParticipationinfoEx(request *QueryAntchainEntTppParticipationinfoRequest, runtime *util.RuntimeOptions) (_result *QueryAntchainEntTppParticipationinfoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAntchainEntTppParticipationinfoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.ent.tpp.participationinfo.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
