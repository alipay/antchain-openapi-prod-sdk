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

// 发货结果
type MpaasUserGamecenterPaymentVirtualdeliveryResponse struct {
	// 发货结果
	// example:
	//
	// true
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s MpaasUserGamecenterPaymentVirtualdeliveryResponse) String() string {
	return tea.Prettify(s)
}

func (s MpaasUserGamecenterPaymentVirtualdeliveryResponse) GoString() string {
	return s.String()
}

func (s *MpaasUserGamecenterPaymentVirtualdeliveryResponse) SetSuccess(v bool) *MpaasUserGamecenterPaymentVirtualdeliveryResponse {
	s.Success = &v
	return s
}

// 订单同步响应结果
type MpaasSaveOrderRelationResponse struct {
	// 是否成功
	// example:
	//
	// true
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s MpaasSaveOrderRelationResponse) String() string {
	return tea.Prettify(s)
}

func (s MpaasSaveOrderRelationResponse) GoString() string {
	return s.String()
}

func (s *MpaasSaveOrderRelationResponse) SetSuccess(v bool) *MpaasSaveOrderRelationResponse {
	s.Success = &v
	return s
}

// 查询订单响应参数
type MpaasUserGamecenterPaymentQuerystatusResponse struct {
	// 订单状态。1-订单已创建。2-订单交易支付成功。3-订单交易支付失败
	// example:
	//
	// 2
	OrderStatus *string `json:"order_status,omitempty" xml:"order_status,omitempty"`
	// 扩展参数。biz_order_id-平台侧订单号，payment-金额（单位：分），open_uid-开放平台用户ID
	// example:
	//
	// {"payment":1200,"open_uid":"ez1Vz2gl/izliBRJxcPYTd2m8G3NE=","biz_order_id":"5124555xxx"}","orderStatus":"2"}
	CpExtra *string `json:"cp_extra,omitempty" xml:"cp_extra,omitempty"`
}

func (s MpaasUserGamecenterPaymentQuerystatusResponse) String() string {
	return tea.Prettify(s)
}

func (s MpaasUserGamecenterPaymentQuerystatusResponse) GoString() string {
	return s.String()
}

func (s *MpaasUserGamecenterPaymentQuerystatusResponse) SetOrderStatus(v string) *MpaasUserGamecenterPaymentQuerystatusResponse {
	s.OrderStatus = &v
	return s
}

func (s *MpaasUserGamecenterPaymentQuerystatusResponse) SetCpExtra(v string) *MpaasUserGamecenterPaymentQuerystatusResponse {
	s.CpExtra = &v
	return s
}

// 用户校验响应结果
type MpaasUserAuthCheckResponse struct {
	// 用户身份是否匹配
	// example:
	//
	// true
	Matched *bool `json:"matched,omitempty" xml:"matched,omitempty"`
}

func (s MpaasUserAuthCheckResponse) String() string {
	return tea.Prettify(s)
}

func (s MpaasUserAuthCheckResponse) GoString() string {
	return s.String()
}

func (s *MpaasUserAuthCheckResponse) SetMatched(v bool) *MpaasUserAuthCheckResponse {
	s.Matched = &v
	return s
}

type QueryUserAuthcheckRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 小游戏ID
	MiniProgramId *string `json:"mini_program_id,omitempty" xml:"mini_program_id,omitempty" require:"true"`
	// 平台ID
	PlatformId *string `json:"platform_id,omitempty" xml:"platform_id,omitempty" require:"true"`
	// 用户身份认证令牌
	Token *string `json:"token,omitempty" xml:"token,omitempty" require:"true"`
	// 开放用户ID
	OpenUid *string `json:"open_uid,omitempty" xml:"open_uid,omitempty" require:"true"`
}

func (s QueryUserAuthcheckRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryUserAuthcheckRequest) GoString() string {
	return s.String()
}

func (s *QueryUserAuthcheckRequest) SetAuthToken(v string) *QueryUserAuthcheckRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryUserAuthcheckRequest) SetProductInstanceId(v string) *QueryUserAuthcheckRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryUserAuthcheckRequest) SetMiniProgramId(v string) *QueryUserAuthcheckRequest {
	s.MiniProgramId = &v
	return s
}

func (s *QueryUserAuthcheckRequest) SetPlatformId(v string) *QueryUserAuthcheckRequest {
	s.PlatformId = &v
	return s
}

func (s *QueryUserAuthcheckRequest) SetToken(v string) *QueryUserAuthcheckRequest {
	s.Token = &v
	return s
}

func (s *QueryUserAuthcheckRequest) SetOpenUid(v string) *QueryUserAuthcheckRequest {
	s.OpenUid = &v
	return s
}

type QueryUserAuthcheckResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 请求是否成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
	// 用户校验响应结果
	MpaasUserAuthCheckResponse *MpaasUserAuthCheckResponse `json:"mpaas_user_auth_check_response,omitempty" xml:"mpaas_user_auth_check_response,omitempty"`
}

func (s QueryUserAuthcheckResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryUserAuthcheckResponse) GoString() string {
	return s.String()
}

func (s *QueryUserAuthcheckResponse) SetReqMsgId(v string) *QueryUserAuthcheckResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryUserAuthcheckResponse) SetResultCode(v string) *QueryUserAuthcheckResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryUserAuthcheckResponse) SetResultMsg(v string) *QueryUserAuthcheckResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryUserAuthcheckResponse) SetSuccess(v bool) *QueryUserAuthcheckResponse {
	s.Success = &v
	return s
}

func (s *QueryUserAuthcheckResponse) SetMpaasUserAuthCheckResponse(v *MpaasUserAuthCheckResponse) *QueryUserAuthcheckResponse {
	s.MpaasUserAuthCheckResponse = v
	return s
}

type SaveOrderRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 应用ID
	AppId *string `json:"app_id,omitempty" xml:"app_id,omitempty" require:"true"`
	// 工作空间ID
	WorkspaceId *string `json:"workspace_id,omitempty" xml:"workspace_id,omitempty" require:"true"`
	// 租户ID
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 小游戏ID
	MiniProgramId *string `json:"mini_program_id,omitempty" xml:"mini_program_id,omitempty" require:"true"`
	// 平台ID
	PlatformId *string `json:"platform_id,omitempty" xml:"platform_id,omitempty" require:"true"`
	// 客户订单号
	CustomId *string `json:"custom_id,omitempty" xml:"custom_id,omitempty" require:"true"`
	// 平台业务订单号
	BizOrderId *string `json:"biz_order_id,omitempty" xml:"biz_order_id,omitempty" require:"true"`
	// 金额，单位分
	Amount *int64 `json:"amount,omitempty" xml:"amount,omitempty" require:"true"`
	// 业务订单状态：
	// 1 - 订单已创建
	// 2 - 支付成功
	// 3 - 支付失败
	BizOrderStatus *int64 `json:"biz_order_status,omitempty" xml:"biz_order_status,omitempty" require:"true"`
	// 开放用户ID
	OpenUid *string `json:"open_uid,omitempty" xml:"open_uid,omitempty" require:"true"`
	// 商品id
	ItemId *string `json:"item_id,omitempty" xml:"item_id,omitempty"`
	// 商品名称
	ItemTitle *string `json:"item_title,omitempty" xml:"item_title,omitempty"`
	// 客户端类型：IOS、ANDROID
	ClientType *string `json:"client_type,omitempty" xml:"client_type,omitempty"`
	// 小游戏客户端透传参数
	CpExtra *string `json:"cp_extra,omitempty" xml:"cp_extra,omitempty"`
}

func (s SaveOrderRequest) String() string {
	return tea.Prettify(s)
}

func (s SaveOrderRequest) GoString() string {
	return s.String()
}

func (s *SaveOrderRequest) SetAuthToken(v string) *SaveOrderRequest {
	s.AuthToken = &v
	return s
}

func (s *SaveOrderRequest) SetProductInstanceId(v string) *SaveOrderRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SaveOrderRequest) SetAppId(v string) *SaveOrderRequest {
	s.AppId = &v
	return s
}

func (s *SaveOrderRequest) SetWorkspaceId(v string) *SaveOrderRequest {
	s.WorkspaceId = &v
	return s
}

func (s *SaveOrderRequest) SetTenantId(v string) *SaveOrderRequest {
	s.TenantId = &v
	return s
}

func (s *SaveOrderRequest) SetMiniProgramId(v string) *SaveOrderRequest {
	s.MiniProgramId = &v
	return s
}

func (s *SaveOrderRequest) SetPlatformId(v string) *SaveOrderRequest {
	s.PlatformId = &v
	return s
}

func (s *SaveOrderRequest) SetCustomId(v string) *SaveOrderRequest {
	s.CustomId = &v
	return s
}

func (s *SaveOrderRequest) SetBizOrderId(v string) *SaveOrderRequest {
	s.BizOrderId = &v
	return s
}

func (s *SaveOrderRequest) SetAmount(v int64) *SaveOrderRequest {
	s.Amount = &v
	return s
}

func (s *SaveOrderRequest) SetBizOrderStatus(v int64) *SaveOrderRequest {
	s.BizOrderStatus = &v
	return s
}

func (s *SaveOrderRequest) SetOpenUid(v string) *SaveOrderRequest {
	s.OpenUid = &v
	return s
}

func (s *SaveOrderRequest) SetItemId(v string) *SaveOrderRequest {
	s.ItemId = &v
	return s
}

func (s *SaveOrderRequest) SetItemTitle(v string) *SaveOrderRequest {
	s.ItemTitle = &v
	return s
}

func (s *SaveOrderRequest) SetClientType(v string) *SaveOrderRequest {
	s.ClientType = &v
	return s
}

func (s *SaveOrderRequest) SetCpExtra(v string) *SaveOrderRequest {
	s.CpExtra = &v
	return s
}

type SaveOrderResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 请求是否成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
	// 订单同步结果
	MpaasSaveOrderRelationResponse *MpaasSaveOrderRelationResponse `json:"mpaas_save_order_relation_response,omitempty" xml:"mpaas_save_order_relation_response,omitempty"`
}

func (s SaveOrderResponse) String() string {
	return tea.Prettify(s)
}

func (s SaveOrderResponse) GoString() string {
	return s.String()
}

func (s *SaveOrderResponse) SetReqMsgId(v string) *SaveOrderResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SaveOrderResponse) SetResultCode(v string) *SaveOrderResponse {
	s.ResultCode = &v
	return s
}

func (s *SaveOrderResponse) SetResultMsg(v string) *SaveOrderResponse {
	s.ResultMsg = &v
	return s
}

func (s *SaveOrderResponse) SetSuccess(v bool) *SaveOrderResponse {
	s.Success = &v
	return s
}

func (s *SaveOrderResponse) SetMpaasSaveOrderRelationResponse(v *MpaasSaveOrderRelationResponse) *SaveOrderResponse {
	s.MpaasSaveOrderRelationResponse = v
	return s
}

type QueryOrderRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 小游戏ID
	MiniProgramId *string `json:"mini_program_id,omitempty" xml:"mini_program_id,omitempty" require:"true"`
	// 平台ID
	PlatformId *string `json:"platform_id,omitempty" xml:"platform_id,omitempty" require:"true"`
	// 客户订单号
	CustomId *string `json:"custom_id,omitempty" xml:"custom_id,omitempty" require:"true"`
}

func (s QueryOrderRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryOrderRequest) GoString() string {
	return s.String()
}

func (s *QueryOrderRequest) SetAuthToken(v string) *QueryOrderRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryOrderRequest) SetProductInstanceId(v string) *QueryOrderRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryOrderRequest) SetMiniProgramId(v string) *QueryOrderRequest {
	s.MiniProgramId = &v
	return s
}

func (s *QueryOrderRequest) SetPlatformId(v string) *QueryOrderRequest {
	s.PlatformId = &v
	return s
}

func (s *QueryOrderRequest) SetCustomId(v string) *QueryOrderRequest {
	s.CustomId = &v
	return s
}

type QueryOrderResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 请求是否成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
	// 查询订单响应参数
	MpaasUserQueryStatusResponse *MpaasUserGamecenterPaymentQuerystatusResponse `json:"mpaas_user_query_status_response,omitempty" xml:"mpaas_user_query_status_response,omitempty"`
}

func (s QueryOrderResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryOrderResponse) GoString() string {
	return s.String()
}

func (s *QueryOrderResponse) SetReqMsgId(v string) *QueryOrderResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryOrderResponse) SetResultCode(v string) *QueryOrderResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryOrderResponse) SetResultMsg(v string) *QueryOrderResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryOrderResponse) SetSuccess(v bool) *QueryOrderResponse {
	s.Success = &v
	return s
}

func (s *QueryOrderResponse) SetMpaasUserQueryStatusResponse(v *MpaasUserGamecenterPaymentQuerystatusResponse) *QueryOrderResponse {
	s.MpaasUserQueryStatusResponse = v
	return s
}

type PushOrderDeliveryRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 小游戏ID
	MiniProgramId *string `json:"mini_program_id,omitempty" xml:"mini_program_id,omitempty" require:"true"`
	// 平台ID
	PlatformId *string `json:"platform_id,omitempty" xml:"platform_id,omitempty" require:"true"`
	// 客户订单号
	CustomId *string `json:"custom_id,omitempty" xml:"custom_id,omitempty" require:"true"`
}

func (s PushOrderDeliveryRequest) String() string {
	return tea.Prettify(s)
}

func (s PushOrderDeliveryRequest) GoString() string {
	return s.String()
}

func (s *PushOrderDeliveryRequest) SetAuthToken(v string) *PushOrderDeliveryRequest {
	s.AuthToken = &v
	return s
}

func (s *PushOrderDeliveryRequest) SetProductInstanceId(v string) *PushOrderDeliveryRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PushOrderDeliveryRequest) SetMiniProgramId(v string) *PushOrderDeliveryRequest {
	s.MiniProgramId = &v
	return s
}

func (s *PushOrderDeliveryRequest) SetPlatformId(v string) *PushOrderDeliveryRequest {
	s.PlatformId = &v
	return s
}

func (s *PushOrderDeliveryRequest) SetCustomId(v string) *PushOrderDeliveryRequest {
	s.CustomId = &v
	return s
}

type PushOrderDeliveryResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 请求是否成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
	// 发货结果
	MpaasUserVirtualDeliveryResponse *MpaasUserGamecenterPaymentVirtualdeliveryResponse `json:"mpaas_user_virtual_delivery_response,omitempty" xml:"mpaas_user_virtual_delivery_response,omitempty"`
}

func (s PushOrderDeliveryResponse) String() string {
	return tea.Prettify(s)
}

func (s PushOrderDeliveryResponse) GoString() string {
	return s.String()
}

func (s *PushOrderDeliveryResponse) SetReqMsgId(v string) *PushOrderDeliveryResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PushOrderDeliveryResponse) SetResultCode(v string) *PushOrderDeliveryResponse {
	s.ResultCode = &v
	return s
}

func (s *PushOrderDeliveryResponse) SetResultMsg(v string) *PushOrderDeliveryResponse {
	s.ResultMsg = &v
	return s
}

func (s *PushOrderDeliveryResponse) SetSuccess(v bool) *PushOrderDeliveryResponse {
	s.Success = &v
	return s
}

func (s *PushOrderDeliveryResponse) SetMpaasUserVirtualDeliveryResponse(v *MpaasUserGamecenterPaymentVirtualdeliveryResponse) *PushOrderDeliveryResponse {
	s.MpaasUserVirtualDeliveryResponse = v
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
				"sdk_version":      tea.String("1.0.3"),
				"_prod_code":       tea.String("MSCENE"),
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
// Description: 用户校验
//
// Summary: 用户校验
func (client *Client) QueryUserAuthcheck(request *QueryUserAuthcheckRequest) (_result *QueryUserAuthcheckResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryUserAuthcheckResponse{}
	_body, _err := client.QueryUserAuthcheckEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 用户校验
//
// Summary: 用户校验
func (client *Client) QueryUserAuthcheckEx(request *QueryUserAuthcheckRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryUserAuthcheckResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryUserAuthcheckResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.mscene.user.authcheck.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 订单同步
//
// Summary: 订单同步
func (client *Client) SaveOrder(request *SaveOrderRequest) (_result *SaveOrderResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SaveOrderResponse{}
	_body, _err := client.SaveOrderEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 订单同步
//
// Summary: 订单同步
func (client *Client) SaveOrderEx(request *SaveOrderRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SaveOrderResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SaveOrderResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.mscene.order.save"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 小游戏订单查询
//
// Summary: 小游戏订单查询
func (client *Client) QueryOrder(request *QueryOrderRequest) (_result *QueryOrderResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryOrderResponse{}
	_body, _err := client.QueryOrderEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 小游戏订单查询
//
// Summary: 小游戏订单查询
func (client *Client) QueryOrderEx(request *QueryOrderRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryOrderResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryOrderResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.mscene.order.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 订单发货
//
// Summary: 订单发货
func (client *Client) PushOrderDelivery(request *PushOrderDeliveryRequest) (_result *PushOrderDeliveryResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PushOrderDeliveryResponse{}
	_body, _err := client.PushOrderDeliveryEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 订单发货
//
// Summary: 订单发货
func (client *Client) PushOrderDeliveryEx(request *PushOrderDeliveryRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PushOrderDeliveryResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PushOrderDeliveryResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.mscene.order.delivery.push"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
