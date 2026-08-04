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

// 分账通知明细
type SettleOrderRoyaltyDetail struct {
	// 分账金额，单位：分
	// example:
	//
	// 100
	Amount *int64 `json:"amount,omitempty" xml:"amount,omitempty" require:"true"`
	// 分账执行时间
	// example:
	//
	// 2021-07-30 12:00:00
	ExecuteTime *string `json:"execute_time,omitempty" xml:"execute_time,omitempty" require:"true"`
	// 分账转出账号
	// example:
	//
	// 2088111111111111
	TransOutAccount *string `json:"trans_out_account,omitempty" xml:"trans_out_account,omitempty" require:"true"`
	// 分账转入账号
	// example:
	//
	// 2088111111111111
	TransInAccount *string `json:"trans_in_account,omitempty" xml:"trans_in_account,omitempty" require:"true"`
}

func (s SettleOrderRoyaltyDetail) String() string {
	return tea.Prettify(s)
}

func (s SettleOrderRoyaltyDetail) GoString() string {
	return s.String()
}

func (s *SettleOrderRoyaltyDetail) SetAmount(v int64) *SettleOrderRoyaltyDetail {
	s.Amount = &v
	return s
}

func (s *SettleOrderRoyaltyDetail) SetExecuteTime(v string) *SettleOrderRoyaltyDetail {
	s.ExecuteTime = &v
	return s
}

func (s *SettleOrderRoyaltyDetail) SetTransOutAccount(v string) *SettleOrderRoyaltyDetail {
	s.TransOutAccount = &v
	return s
}

func (s *SettleOrderRoyaltyDetail) SetTransInAccount(v string) *SettleOrderRoyaltyDetail {
	s.TransInAccount = &v
	return s
}

// 发放订单明细
type GrantOrderDetail struct {
	// 券编码
	// example:
	//
	// 1798234932684395
	VoucherCode *string `json:"voucher_code,omitempty" xml:"voucher_code,omitempty" require:"true"`
	// 发放扩展信息
	// example:
	//
	// {"supplierSettlePrice": 10.00,"supplierChannelNo": "alipay","rightsName": "28元抵扣券","outRightsCode": "1767506545030770701"}
	ExtInfo *string `json:"ext_info,omitempty" xml:"ext_info,omitempty"`
}

func (s GrantOrderDetail) String() string {
	return tea.Prettify(s)
}

func (s GrantOrderDetail) GoString() string {
	return s.String()
}

func (s *GrantOrderDetail) SetVoucherCode(v string) *GrantOrderDetail {
	s.VoucherCode = &v
	return s
}

func (s *GrantOrderDetail) SetExtInfo(v string) *GrantOrderDetail {
	s.ExtInfo = &v
	return s
}

type CallbackOrderSettlementRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s CallbackOrderSettlementRequest) String() string {
	return tea.Prettify(s)
}

func (s CallbackOrderSettlementRequest) GoString() string {
	return s.String()
}

func (s *CallbackOrderSettlementRequest) SetAuthToken(v string) *CallbackOrderSettlementRequest {
	s.AuthToken = &v
	return s
}

func (s *CallbackOrderSettlementRequest) SetProductInstanceId(v string) *CallbackOrderSettlementRequest {
	s.ProductInstanceId = &v
	return s
}

type CallbackOrderSettlementResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CallbackOrderSettlementResponse) String() string {
	return tea.Prettify(s)
}

func (s CallbackOrderSettlementResponse) GoString() string {
	return s.String()
}

func (s *CallbackOrderSettlementResponse) SetReqMsgId(v string) *CallbackOrderSettlementResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CallbackOrderSettlementResponse) SetResultCode(v string) *CallbackOrderSettlementResponse {
	s.ResultCode = &v
	return s
}

func (s *CallbackOrderSettlementResponse) SetResultMsg(v string) *CallbackOrderSettlementResponse {
	s.ResultMsg = &v
	return s
}

type CallbackGesaasOrderRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// PAY_RESULT_MSG：支付结果通知
	// SETTLE_SPLIT_RESULT_MSG ：分账结果通知
	// REFUND_SPLIT_RESULT_MSG：退款退分账结果通知
	MsgType *string `json:"msg_type,omitempty" xml:"msg_type,omitempty" require:"true"`
	// 消息唯一性判断，失败重试msgId不变
	// 即使消息重投、该字段也不会变动
	MsgId *string `json:"msg_id,omitempty" xml:"msg_id,omitempty" require:"true"`
	// traceId， 每一次投递生成唯一id
	// 消息重投后、该字段会变化
	TraceId *string `json:"trace_id,omitempty" xml:"trace_id,omitempty" require:"true"`
	// 订单所属商户的社会信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true"`
	// 类型；JSONString字符串
	// 说明：根据不同的msgType类型，messageBody说明如下
	MessageBody *string `json:"message_body,omitempty" xml:"message_body,omitempty" require:"true"`
}

func (s CallbackGesaasOrderRequest) String() string {
	return tea.Prettify(s)
}

func (s CallbackGesaasOrderRequest) GoString() string {
	return s.String()
}

func (s *CallbackGesaasOrderRequest) SetAuthToken(v string) *CallbackGesaasOrderRequest {
	s.AuthToken = &v
	return s
}

func (s *CallbackGesaasOrderRequest) SetProductInstanceId(v string) *CallbackGesaasOrderRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CallbackGesaasOrderRequest) SetMsgType(v string) *CallbackGesaasOrderRequest {
	s.MsgType = &v
	return s
}

func (s *CallbackGesaasOrderRequest) SetMsgId(v string) *CallbackGesaasOrderRequest {
	s.MsgId = &v
	return s
}

func (s *CallbackGesaasOrderRequest) SetTraceId(v string) *CallbackGesaasOrderRequest {
	s.TraceId = &v
	return s
}

func (s *CallbackGesaasOrderRequest) SetMerchantId(v string) *CallbackGesaasOrderRequest {
	s.MerchantId = &v
	return s
}

func (s *CallbackGesaasOrderRequest) SetMessageBody(v string) *CallbackGesaasOrderRequest {
	s.MessageBody = &v
	return s
}

type CallbackGesaasOrderResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 同步结果
	// success 为同步成功其他均为失败
	Result *string `json:"result,omitempty" xml:"result,omitempty"`
}

func (s CallbackGesaasOrderResponse) String() string {
	return tea.Prettify(s)
}

func (s CallbackGesaasOrderResponse) GoString() string {
	return s.String()
}

func (s *CallbackGesaasOrderResponse) SetReqMsgId(v string) *CallbackGesaasOrderResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CallbackGesaasOrderResponse) SetResultCode(v string) *CallbackGesaasOrderResponse {
	s.ResultCode = &v
	return s
}

func (s *CallbackGesaasOrderResponse) SetResultMsg(v string) *CallbackGesaasOrderResponse {
	s.ResultMsg = &v
	return s
}

func (s *CallbackGesaasOrderResponse) SetResult(v string) *CallbackGesaasOrderResponse {
	s.Result = &v
	return s
}

type PushRightsprodVoucherRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 权益编码
	RightsCode *string `json:"rights_code,omitempty" xml:"rights_code,omitempty" require:"true"`
	// 权益凭证编码/券码
	VoucherCode *string `json:"voucher_code,omitempty" xml:"voucher_code,omitempty" require:"true"`
	// 业务类型
	// GRANT：发放
	// VERIFY：核销 GRANT_CANCEL：发放撤销 VERIFY_CANCEL：核销撤销 FREEZE：冻结
	// UNFREEZE：解冻
	BizType *string `json:"biz_type,omitempty" xml:"biz_type,omitempty" require:"true"`
	// FAIL：失败
	// SUCCESS：成功
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 外部订单号
	OutTradeOrderNo *string `json:"out_trade_order_no,omitempty" xml:"out_trade_order_no,omitempty"`
	// 失败信息
	FailMsg *string `json:"fail_msg,omitempty" xml:"fail_msg,omitempty"`
	// 外部发放调用时传入信息
	GrantInfo *string `json:"grant_info,omitempty" xml:"grant_info,omitempty"`
}

func (s PushRightsprodVoucherRequest) String() string {
	return tea.Prettify(s)
}

func (s PushRightsprodVoucherRequest) GoString() string {
	return s.String()
}

func (s *PushRightsprodVoucherRequest) SetAuthToken(v string) *PushRightsprodVoucherRequest {
	s.AuthToken = &v
	return s
}

func (s *PushRightsprodVoucherRequest) SetProductInstanceId(v string) *PushRightsprodVoucherRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PushRightsprodVoucherRequest) SetRightsCode(v string) *PushRightsprodVoucherRequest {
	s.RightsCode = &v
	return s
}

func (s *PushRightsprodVoucherRequest) SetVoucherCode(v string) *PushRightsprodVoucherRequest {
	s.VoucherCode = &v
	return s
}

func (s *PushRightsprodVoucherRequest) SetBizType(v string) *PushRightsprodVoucherRequest {
	s.BizType = &v
	return s
}

func (s *PushRightsprodVoucherRequest) SetStatus(v string) *PushRightsprodVoucherRequest {
	s.Status = &v
	return s
}

func (s *PushRightsprodVoucherRequest) SetOutTradeOrderNo(v string) *PushRightsprodVoucherRequest {
	s.OutTradeOrderNo = &v
	return s
}

func (s *PushRightsprodVoucherRequest) SetFailMsg(v string) *PushRightsprodVoucherRequest {
	s.FailMsg = &v
	return s
}

func (s *PushRightsprodVoucherRequest) SetGrantInfo(v string) *PushRightsprodVoucherRequest {
	s.GrantInfo = &v
	return s
}

type PushRightsprodVoucherResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 同步结果  success 同步成功
	Result *string `json:"result,omitempty" xml:"result,omitempty"`
}

func (s PushRightsprodVoucherResponse) String() string {
	return tea.Prettify(s)
}

func (s PushRightsprodVoucherResponse) GoString() string {
	return s.String()
}

func (s *PushRightsprodVoucherResponse) SetReqMsgId(v string) *PushRightsprodVoucherResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PushRightsprodVoucherResponse) SetResultCode(v string) *PushRightsprodVoucherResponse {
	s.ResultCode = &v
	return s
}

func (s *PushRightsprodVoucherResponse) SetResultMsg(v string) *PushRightsprodVoucherResponse {
	s.ResultMsg = &v
	return s
}

func (s *PushRightsprodVoucherResponse) SetResult(v string) *PushRightsprodVoucherResponse {
	s.Result = &v
	return s
}

type CallbackRightsprodStatusRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 权益编码
	RightsCode *string `json:"rights_code,omitempty" xml:"rights_code,omitempty" require:"true"`
	// 券码
	VoucherCode *string `json:"voucher_code,omitempty" xml:"voucher_code,omitempty" require:"true"`
	// 券变更状态
	// V_USE（使用）
	// V_REFUND（退款）
	// V_EXPIRE（过期）
	// V_INVALID（作废）
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
}

func (s CallbackRightsprodStatusRequest) String() string {
	return tea.Prettify(s)
}

func (s CallbackRightsprodStatusRequest) GoString() string {
	return s.String()
}

func (s *CallbackRightsprodStatusRequest) SetAuthToken(v string) *CallbackRightsprodStatusRequest {
	s.AuthToken = &v
	return s
}

func (s *CallbackRightsprodStatusRequest) SetProductInstanceId(v string) *CallbackRightsprodStatusRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CallbackRightsprodStatusRequest) SetRightsCode(v string) *CallbackRightsprodStatusRequest {
	s.RightsCode = &v
	return s
}

func (s *CallbackRightsprodStatusRequest) SetVoucherCode(v string) *CallbackRightsprodStatusRequest {
	s.VoucherCode = &v
	return s
}

func (s *CallbackRightsprodStatusRequest) SetStatus(v string) *CallbackRightsprodStatusRequest {
	s.Status = &v
	return s
}

type CallbackRightsprodStatusResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 同步结果 success 同步成功
	Result *string `json:"result,omitempty" xml:"result,omitempty"`
}

func (s CallbackRightsprodStatusResponse) String() string {
	return tea.Prettify(s)
}

func (s CallbackRightsprodStatusResponse) GoString() string {
	return s.String()
}

func (s *CallbackRightsprodStatusResponse) SetReqMsgId(v string) *CallbackRightsprodStatusResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CallbackRightsprodStatusResponse) SetResultCode(v string) *CallbackRightsprodStatusResponse {
	s.ResultCode = &v
	return s
}

func (s *CallbackRightsprodStatusResponse) SetResultMsg(v string) *CallbackRightsprodStatusResponse {
	s.ResultMsg = &v
	return s
}

func (s *CallbackRightsprodStatusResponse) SetResult(v string) *CallbackRightsprodStatusResponse {
	s.Result = &v
	return s
}

type CallbackRightsprodOperationRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 权益编码
	RightsCode *string `json:"rights_code,omitempty" xml:"rights_code,omitempty" require:"true"`
	// 券码
	VoucherCode *string `json:"voucher_code,omitempty" xml:"voucher_code,omitempty" require:"true"`
	// 通知ID(幂等)
	NotifyId *string `json:"notify_id,omitempty" xml:"notify_id,omitempty" require:"true"`
	// 业务类型
	// V_REFUND（退款）
	// V_EXPIRE（过期）
	// V_INVALID（作废）
	// V_USE（使用）
	BizType *string `json:"biz_type,omitempty" xml:"biz_type,omitempty" require:"true"`
	// 支付订单号
	PayOrderNo *string `json:"pay_order_no,omitempty" xml:"pay_order_no,omitempty"`
	// 券面额
	FaceAmount *string `json:"face_amount,omitempty" xml:"face_amount,omitempty"`
	// 流通金额（核销、退款时 金额）
	FluxAmount *string `json:"flux_amount,omitempty" xml:"flux_amount,omitempty"`
}

func (s CallbackRightsprodOperationRequest) String() string {
	return tea.Prettify(s)
}

func (s CallbackRightsprodOperationRequest) GoString() string {
	return s.String()
}

func (s *CallbackRightsprodOperationRequest) SetAuthToken(v string) *CallbackRightsprodOperationRequest {
	s.AuthToken = &v
	return s
}

func (s *CallbackRightsprodOperationRequest) SetProductInstanceId(v string) *CallbackRightsprodOperationRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CallbackRightsprodOperationRequest) SetRightsCode(v string) *CallbackRightsprodOperationRequest {
	s.RightsCode = &v
	return s
}

func (s *CallbackRightsprodOperationRequest) SetVoucherCode(v string) *CallbackRightsprodOperationRequest {
	s.VoucherCode = &v
	return s
}

func (s *CallbackRightsprodOperationRequest) SetNotifyId(v string) *CallbackRightsprodOperationRequest {
	s.NotifyId = &v
	return s
}

func (s *CallbackRightsprodOperationRequest) SetBizType(v string) *CallbackRightsprodOperationRequest {
	s.BizType = &v
	return s
}

func (s *CallbackRightsprodOperationRequest) SetPayOrderNo(v string) *CallbackRightsprodOperationRequest {
	s.PayOrderNo = &v
	return s
}

func (s *CallbackRightsprodOperationRequest) SetFaceAmount(v string) *CallbackRightsprodOperationRequest {
	s.FaceAmount = &v
	return s
}

func (s *CallbackRightsprodOperationRequest) SetFluxAmount(v string) *CallbackRightsprodOperationRequest {
	s.FluxAmount = &v
	return s
}

type CallbackRightsprodOperationResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 同步结果
	// success 为同步成功其他均为失败
	Result *string `json:"result,omitempty" xml:"result,omitempty"`
}

func (s CallbackRightsprodOperationResponse) String() string {
	return tea.Prettify(s)
}

func (s CallbackRightsprodOperationResponse) GoString() string {
	return s.String()
}

func (s *CallbackRightsprodOperationResponse) SetReqMsgId(v string) *CallbackRightsprodOperationResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CallbackRightsprodOperationResponse) SetResultCode(v string) *CallbackRightsprodOperationResponse {
	s.ResultCode = &v
	return s
}

func (s *CallbackRightsprodOperationResponse) SetResultMsg(v string) *CallbackRightsprodOperationResponse {
	s.ResultMsg = &v
	return s
}

func (s *CallbackRightsprodOperationResponse) SetResult(v string) *CallbackRightsprodOperationResponse {
	s.Result = &v
	return s
}

type PushRightsprodGrantrightsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 用户ID
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty"`
	// 手机号
	PhoneNumber *string `json:"phone_number,omitempty" xml:"phone_number,omitempty"`
	// 商户编码
	MerchantNo *string `json:"merchant_no,omitempty" xml:"merchant_no,omitempty"`
	// 权益编码
	SupplyRightsCode *string `json:"supply_rights_code,omitempty" xml:"supply_rights_code,omitempty" require:"true"`
	// 发放数量，可根据权益信息grantMulti判断是否可发多张
	GrantNum *int64 `json:"grant_num,omitempty" xml:"grant_num,omitempty"`
	// 外部发放订单号
	OutGrantOrderNo *string `json:"out_grant_order_no,omitempty" xml:"out_grant_order_no,omitempty" require:"true"`
	// 发放扩展信息，如活动ID等信息，暂时可以不传
	GrantInfo *string `json:"grant_info,omitempty" xml:"grant_info,omitempty"`
	// 208898234892XXX01
	OpenId *string `json:"open_id,omitempty" xml:"open_id,omitempty"`
	// 应用ID
	AppId *string `json:"app_id,omitempty" xml:"app_id,omitempty"`
}

func (s PushRightsprodGrantrightsRequest) String() string {
	return tea.Prettify(s)
}

func (s PushRightsprodGrantrightsRequest) GoString() string {
	return s.String()
}

func (s *PushRightsprodGrantrightsRequest) SetAuthToken(v string) *PushRightsprodGrantrightsRequest {
	s.AuthToken = &v
	return s
}

func (s *PushRightsprodGrantrightsRequest) SetProductInstanceId(v string) *PushRightsprodGrantrightsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PushRightsprodGrantrightsRequest) SetUserId(v string) *PushRightsprodGrantrightsRequest {
	s.UserId = &v
	return s
}

func (s *PushRightsprodGrantrightsRequest) SetPhoneNumber(v string) *PushRightsprodGrantrightsRequest {
	s.PhoneNumber = &v
	return s
}

func (s *PushRightsprodGrantrightsRequest) SetMerchantNo(v string) *PushRightsprodGrantrightsRequest {
	s.MerchantNo = &v
	return s
}

func (s *PushRightsprodGrantrightsRequest) SetSupplyRightsCode(v string) *PushRightsprodGrantrightsRequest {
	s.SupplyRightsCode = &v
	return s
}

func (s *PushRightsprodGrantrightsRequest) SetGrantNum(v int64) *PushRightsprodGrantrightsRequest {
	s.GrantNum = &v
	return s
}

func (s *PushRightsprodGrantrightsRequest) SetOutGrantOrderNo(v string) *PushRightsprodGrantrightsRequest {
	s.OutGrantOrderNo = &v
	return s
}

func (s *PushRightsprodGrantrightsRequest) SetGrantInfo(v string) *PushRightsprodGrantrightsRequest {
	s.GrantInfo = &v
	return s
}

func (s *PushRightsprodGrantrightsRequest) SetOpenId(v string) *PushRightsprodGrantrightsRequest {
	s.OpenId = &v
	return s
}

func (s *PushRightsprodGrantrightsRequest) SetAppId(v string) *PushRightsprodGrantrightsRequest {
	s.AppId = &v
	return s
}

type PushRightsprodGrantrightsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 发放状态：
	// GRANTING：发放处理中 GRANT_SUCCESS：发放成功 GRANT_FAIL：发放失败
	GrantStatus *string `json:"grant_status,omitempty" xml:"grant_status,omitempty"`
	// 过期时间 yyyy-MM-dd HH:mm:ss
	ExpireTime *string `json:"expire_time,omitempty" xml:"expire_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 生效时间 yyyy-MM-dd HH:mm:ss
	EffectTime *string `json:"effect_time,omitempty" xml:"effect_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 发放订单明细数据
	OrderDetails []*GrantOrderDetail `json:"order_details,omitempty" xml:"order_details,omitempty" type:"Repeated"`
}

func (s PushRightsprodGrantrightsResponse) String() string {
	return tea.Prettify(s)
}

func (s PushRightsprodGrantrightsResponse) GoString() string {
	return s.String()
}

func (s *PushRightsprodGrantrightsResponse) SetReqMsgId(v string) *PushRightsprodGrantrightsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PushRightsprodGrantrightsResponse) SetResultCode(v string) *PushRightsprodGrantrightsResponse {
	s.ResultCode = &v
	return s
}

func (s *PushRightsprodGrantrightsResponse) SetResultMsg(v string) *PushRightsprodGrantrightsResponse {
	s.ResultMsg = &v
	return s
}

func (s *PushRightsprodGrantrightsResponse) SetGrantStatus(v string) *PushRightsprodGrantrightsResponse {
	s.GrantStatus = &v
	return s
}

func (s *PushRightsprodGrantrightsResponse) SetExpireTime(v string) *PushRightsprodGrantrightsResponse {
	s.ExpireTime = &v
	return s
}

func (s *PushRightsprodGrantrightsResponse) SetEffectTime(v string) *PushRightsprodGrantrightsResponse {
	s.EffectTime = &v
	return s
}

func (s *PushRightsprodGrantrightsResponse) SetOrderDetails(v []*GrantOrderDetail) *PushRightsprodGrantrightsResponse {
	s.OrderDetails = v
	return s
}

type QueryRightsprodConfigRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 权益供应商供应权益编码
	SupplyRightsCode *string `json:"supply_rights_code,omitempty" xml:"supply_rights_code,omitempty" require:"true"`
}

func (s QueryRightsprodConfigRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryRightsprodConfigRequest) GoString() string {
	return s.String()
}

func (s *QueryRightsprodConfigRequest) SetAuthToken(v string) *QueryRightsprodConfigRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryRightsprodConfigRequest) SetProductInstanceId(v string) *QueryRightsprodConfigRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryRightsprodConfigRequest) SetSupplyRightsCode(v string) *QueryRightsprodConfigRequest {
	s.SupplyRightsCode = &v
	return s
}

type QueryRightsprodConfigResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 供应权益编码
	SupplyRightsCode *string `json:"supply_rights_code,omitempty" xml:"supply_rights_code,omitempty"`
	// 权益名称
	RightsName *string `json:"rights_name,omitempty" xml:"rights_name,omitempty"`
	// 权益类型
	// 满减券:FULL_REDUCTION_COUPON
	// 每满减券:EVERY_FULL_REDUCTION_COUPON
	// 折扣券:DISCOUNT_COUPON
	RightsType *string `json:"rights_type,omitempty" xml:"rights_type,omitempty"`
	// 待发布:INIT
	// 已上线:ONLINE
	// 已暂停:PAUSED
	// 已下线:OFFLINE
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 权益创建时间格式为yyyy-MM-dd HH:mm:ss
	CreateTime *string `json:"create_time,omitempty" xml:"create_time,omitempty"`
	// 权益发放开始时间
	GrantStartTime *string `json:"grant_start_time,omitempty" xml:"grant_start_time,omitempty"`
	// 权益发放截止时间
	GrantEndTime *string `json:"grant_end_time,omitempty" xml:"grant_end_time,omitempty"`
	// 生效时间类型 固定时间:1;领券后:0
	ValidityTimeType *string `json:"validity_time_type,omitempty" xml:"validity_time_type,omitempty"`
	// 生效时间 格式为yyyy-MM-dd HH:mm:ss
	// 生效时间类型为 1 固定时间是必传
	VoucherStartTime *string `json:"voucher_start_time,omitempty" xml:"voucher_start_time,omitempty"`
	// 过期时间 格式为yyyy-MM-dd HH:mm:ss
	// 生效时间类型为 1 固定时间是必传
	VoucherEndTime *string `json:"voucher_end_time,omitempty" xml:"voucher_end_time,omitempty"`
	// 生效时间类型：DAY/HOUR
	// 当生效时间类型为0时 必传
	ValidityTimeFormat *string `json:"validity_time_format,omitempty" xml:"validity_time_format,omitempty"`
	// 生效时间数
	// 生效时间类型 0时 必传
	ValidityTime *int64 `json:"validity_time,omitempty" xml:"validity_time,omitempty"`
	// 权益面额 单位：元
	FaceAmount *string `json:"face_amount,omitempty" xml:"face_amount,omitempty"`
	// 门槛金额单位：元
	SillAmount *string `json:"sill_amount,omitempty" xml:"sill_amount,omitempty"`
	// 折扣数 88折 对应为8.8
	Discount *string `json:"discount,omitempty" xml:"discount,omitempty"`
	// 最大优惠金额
	MaxDiscountAmount *string `json:"max_discount_amount,omitempty" xml:"max_discount_amount,omitempty"`
	// 券原始库存（最大发券数）
	RightsNum *int64 `json:"rights_num,omitempty" xml:"rights_num,omitempty"`
	// 总预算金额
	TotalBudget *string `json:"total_budget,omitempty" xml:"total_budget,omitempty"`
	// 使用描述
	Description *string `json:"description,omitempty" xml:"description,omitempty"`
}

func (s QueryRightsprodConfigResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryRightsprodConfigResponse) GoString() string {
	return s.String()
}

func (s *QueryRightsprodConfigResponse) SetReqMsgId(v string) *QueryRightsprodConfigResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryRightsprodConfigResponse) SetResultCode(v string) *QueryRightsprodConfigResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryRightsprodConfigResponse) SetResultMsg(v string) *QueryRightsprodConfigResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryRightsprodConfigResponse) SetSupplyRightsCode(v string) *QueryRightsprodConfigResponse {
	s.SupplyRightsCode = &v
	return s
}

func (s *QueryRightsprodConfigResponse) SetRightsName(v string) *QueryRightsprodConfigResponse {
	s.RightsName = &v
	return s
}

func (s *QueryRightsprodConfigResponse) SetRightsType(v string) *QueryRightsprodConfigResponse {
	s.RightsType = &v
	return s
}

func (s *QueryRightsprodConfigResponse) SetStatus(v string) *QueryRightsprodConfigResponse {
	s.Status = &v
	return s
}

func (s *QueryRightsprodConfigResponse) SetCreateTime(v string) *QueryRightsprodConfigResponse {
	s.CreateTime = &v
	return s
}

func (s *QueryRightsprodConfigResponse) SetGrantStartTime(v string) *QueryRightsprodConfigResponse {
	s.GrantStartTime = &v
	return s
}

func (s *QueryRightsprodConfigResponse) SetGrantEndTime(v string) *QueryRightsprodConfigResponse {
	s.GrantEndTime = &v
	return s
}

func (s *QueryRightsprodConfigResponse) SetValidityTimeType(v string) *QueryRightsprodConfigResponse {
	s.ValidityTimeType = &v
	return s
}

func (s *QueryRightsprodConfigResponse) SetVoucherStartTime(v string) *QueryRightsprodConfigResponse {
	s.VoucherStartTime = &v
	return s
}

func (s *QueryRightsprodConfigResponse) SetVoucherEndTime(v string) *QueryRightsprodConfigResponse {
	s.VoucherEndTime = &v
	return s
}

func (s *QueryRightsprodConfigResponse) SetValidityTimeFormat(v string) *QueryRightsprodConfigResponse {
	s.ValidityTimeFormat = &v
	return s
}

func (s *QueryRightsprodConfigResponse) SetValidityTime(v int64) *QueryRightsprodConfigResponse {
	s.ValidityTime = &v
	return s
}

func (s *QueryRightsprodConfigResponse) SetFaceAmount(v string) *QueryRightsprodConfigResponse {
	s.FaceAmount = &v
	return s
}

func (s *QueryRightsprodConfigResponse) SetSillAmount(v string) *QueryRightsprodConfigResponse {
	s.SillAmount = &v
	return s
}

func (s *QueryRightsprodConfigResponse) SetDiscount(v string) *QueryRightsprodConfigResponse {
	s.Discount = &v
	return s
}

func (s *QueryRightsprodConfigResponse) SetMaxDiscountAmount(v string) *QueryRightsprodConfigResponse {
	s.MaxDiscountAmount = &v
	return s
}

func (s *QueryRightsprodConfigResponse) SetRightsNum(v int64) *QueryRightsprodConfigResponse {
	s.RightsNum = &v
	return s
}

func (s *QueryRightsprodConfigResponse) SetTotalBudget(v string) *QueryRightsprodConfigResponse {
	s.TotalBudget = &v
	return s
}

func (s *QueryRightsprodConfigResponse) SetDescription(v string) *QueryRightsprodConfigResponse {
	s.Description = &v
	return s
}

type QueryRightsprodVoucherRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 供应商权益编码
	SupplyRightsCode *string `json:"supply_rights_code,omitempty" xml:"supply_rights_code,omitempty" require:"true"`
	// 权益实例
	VoucherCode *string `json:"voucher_code,omitempty" xml:"voucher_code,omitempty" require:"true"`
}

func (s QueryRightsprodVoucherRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryRightsprodVoucherRequest) GoString() string {
	return s.String()
}

func (s *QueryRightsprodVoucherRequest) SetAuthToken(v string) *QueryRightsprodVoucherRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryRightsprodVoucherRequest) SetProductInstanceId(v string) *QueryRightsprodVoucherRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryRightsprodVoucherRequest) SetSupplyRightsCode(v string) *QueryRightsprodVoucherRequest {
	s.SupplyRightsCode = &v
	return s
}

func (s *QueryRightsprodVoucherRequest) SetVoucherCode(v string) *QueryRightsprodVoucherRequest {
	s.VoucherCode = &v
	return s
}

type QueryRightsprodVoucherResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 用户ID
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty"`
	// 用户手机号
	PhoneNumber *string `json:"phone_number,omitempty" xml:"phone_number,omitempty"`
	// 用户openId
	OpenId *string `json:"open_id,omitempty" xml:"open_id,omitempty"`
	// 应用ID
	AppId *string `json:"app_id,omitempty" xml:"app_id,omitempty"`
	// 供应商权益编码
	SupplyRightsCode *string `json:"supply_rights_code,omitempty" xml:"supply_rights_code,omitempty"`
	// 权益实例ID
	VoucherCode *string `json:"voucher_code,omitempty" xml:"voucher_code,omitempty"`
	// 权益名称
	RightsName *string `json:"rights_name,omitempty" xml:"rights_name,omitempty"`
	// 权益面额
	FaceAmount *string `json:"face_amount,omitempty" xml:"face_amount,omitempty"`
	// 剩余可用金额
	AvailableAmount *string `json:"available_amount,omitempty" xml:"available_amount,omitempty"`
	// 权益实例状态
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
}

func (s QueryRightsprodVoucherResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryRightsprodVoucherResponse) GoString() string {
	return s.String()
}

func (s *QueryRightsprodVoucherResponse) SetReqMsgId(v string) *QueryRightsprodVoucherResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryRightsprodVoucherResponse) SetResultCode(v string) *QueryRightsprodVoucherResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryRightsprodVoucherResponse) SetResultMsg(v string) *QueryRightsprodVoucherResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryRightsprodVoucherResponse) SetUserId(v string) *QueryRightsprodVoucherResponse {
	s.UserId = &v
	return s
}

func (s *QueryRightsprodVoucherResponse) SetPhoneNumber(v string) *QueryRightsprodVoucherResponse {
	s.PhoneNumber = &v
	return s
}

func (s *QueryRightsprodVoucherResponse) SetOpenId(v string) *QueryRightsprodVoucherResponse {
	s.OpenId = &v
	return s
}

func (s *QueryRightsprodVoucherResponse) SetAppId(v string) *QueryRightsprodVoucherResponse {
	s.AppId = &v
	return s
}

func (s *QueryRightsprodVoucherResponse) SetSupplyRightsCode(v string) *QueryRightsprodVoucherResponse {
	s.SupplyRightsCode = &v
	return s
}

func (s *QueryRightsprodVoucherResponse) SetVoucherCode(v string) *QueryRightsprodVoucherResponse {
	s.VoucherCode = &v
	return s
}

func (s *QueryRightsprodVoucherResponse) SetRightsName(v string) *QueryRightsprodVoucherResponse {
	s.RightsName = &v
	return s
}

func (s *QueryRightsprodVoucherResponse) SetFaceAmount(v string) *QueryRightsprodVoucherResponse {
	s.FaceAmount = &v
	return s
}

func (s *QueryRightsprodVoucherResponse) SetAvailableAmount(v string) *QueryRightsprodVoucherResponse {
	s.AvailableAmount = &v
	return s
}

func (s *QueryRightsprodVoucherResponse) SetStatus(v string) *QueryRightsprodVoucherResponse {
	s.Status = &v
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
				"sdk_version":      tea.String("1.1.11"),
				"_prod_code":       tea.String("GESAAS_SPI"),
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
// Description: 分账结果通知第三方(废弃)
//
// Summary: 分账结果通知第三方(废弃)
func (client *Client) CallbackOrderSettlement(request *CallbackOrderSettlementRequest) (_result *CallbackOrderSettlementResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CallbackOrderSettlementResponse{}
	_body, _err := client.CallbackOrderSettlementEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 分账结果通知第三方(废弃)
//
// Summary: 分账结果通知第三方(废弃)
func (client *Client) CallbackOrderSettlementEx(request *CallbackOrderSettlementRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CallbackOrderSettlementResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CallbackOrderSettlementResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.gesaasspi.order.settlement.callback"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 权益SaaS-订单回调通知SPI
//
// Summary: 权益SaaS-订单回调通知SPI
func (client *Client) CallbackGesaasOrder(request *CallbackGesaasOrderRequest) (_result *CallbackGesaasOrderResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CallbackGesaasOrderResponse{}
	_body, _err := client.CallbackGesaasOrderEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 权益SaaS-订单回调通知SPI
//
// Summary: 权益SaaS-订单回调通知SPI
func (client *Client) CallbackGesaasOrderEx(request *CallbackGesaasOrderRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CallbackGesaasOrderResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CallbackGesaasOrderResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.gesaasspi.gesaas.order.callback"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 权益中心权益券状态推送
//
// Summary: 券状态推送
func (client *Client) PushRightsprodVoucher(request *PushRightsprodVoucherRequest) (_result *PushRightsprodVoucherResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PushRightsprodVoucherResponse{}
	_body, _err := client.PushRightsprodVoucherEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 权益中心权益券状态推送
//
// Summary: 券状态推送
func (client *Client) PushRightsprodVoucherEx(request *PushRightsprodVoucherRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PushRightsprodVoucherResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PushRightsprodVoucherResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.gesaasspi.rightsprod.voucher.push"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 权益中心券状态变更回调通知
//
// Summary: 权益中心券状态变更回调通知
func (client *Client) CallbackRightsprodStatus(request *CallbackRightsprodStatusRequest) (_result *CallbackRightsprodStatusResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CallbackRightsprodStatusResponse{}
	_body, _err := client.CallbackRightsprodStatusEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 权益中心券状态变更回调通知
//
// Summary: 权益中心券状态变更回调通知
func (client *Client) CallbackRightsprodStatusEx(request *CallbackRightsprodStatusRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CallbackRightsprodStatusResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CallbackRightsprodStatusResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.gesaasspi.rightsprod.status.callback"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 券操作回调通知
//
// Summary: 券操作回调通知
func (client *Client) CallbackRightsprodOperation(request *CallbackRightsprodOperationRequest) (_result *CallbackRightsprodOperationResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CallbackRightsprodOperationResponse{}
	_body, _err := client.CallbackRightsprodOperationEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 券操作回调通知
//
// Summary: 券操作回调通知
func (client *Client) CallbackRightsprodOperationEx(request *CallbackRightsprodOperationRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CallbackRightsprodOperationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CallbackRightsprodOperationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.gesaasspi.rightsprod.operation.callback"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 权益供应商权益发放spi
//
// Summary: 权益供应商权益发放spi
func (client *Client) PushRightsprodGrantrights(request *PushRightsprodGrantrightsRequest) (_result *PushRightsprodGrantrightsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PushRightsprodGrantrightsResponse{}
	_body, _err := client.PushRightsprodGrantrightsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 权益供应商权益发放spi
//
// Summary: 权益供应商权益发放spi
func (client *Client) PushRightsprodGrantrightsEx(request *PushRightsprodGrantrightsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PushRightsprodGrantrightsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PushRightsprodGrantrightsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.gesaasspi.rightsprod.grantrights.push"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 权益供应商 权益配置基本信息查询接口
//
// Summary: 权益供应商 权益配置基本信息查询接口
func (client *Client) QueryRightsprodConfig(request *QueryRightsprodConfigRequest) (_result *QueryRightsprodConfigResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryRightsprodConfigResponse{}
	_body, _err := client.QueryRightsprodConfigEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 权益供应商 权益配置基本信息查询接口
//
// Summary: 权益供应商 权益配置基本信息查询接口
func (client *Client) QueryRightsprodConfigEx(request *QueryRightsprodConfigRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryRightsprodConfigResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryRightsprodConfigResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.gesaasspi.rightsprod.config.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 获取具体权益实例的实时状态与基本信息
//
// Summary: 获取具体权益实例的实时状态与基本信息
func (client *Client) QueryRightsprodVoucher(request *QueryRightsprodVoucherRequest) (_result *QueryRightsprodVoucherResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryRightsprodVoucherResponse{}
	_body, _err := client.QueryRightsprodVoucherEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 获取具体权益实例的实时状态与基本信息
//
// Summary: 获取具体权益实例的实时状态与基本信息
func (client *Client) QueryRightsprodVoucherEx(request *QueryRightsprodVoucherRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryRightsprodVoucherResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryRightsprodVoucherResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.gesaasspi.rightsprod.voucher.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
