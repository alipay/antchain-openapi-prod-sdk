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

// 经营分账收入方列表
type OperateDivideTransInModel struct {
	// 分账收入方支付宝用户id, 支付宝2088id
	TransInUserId *string `json:"trans_in_user_id,omitempty" xml:"trans_in_user_id,omitempty" require:"true"`
	// 分账金额，单位为分 大于0
	DivideAmount *int64 `json:"divide_amount,omitempty" xml:"divide_amount,omitempty" require:"true"`
}

func (s OperateDivideTransInModel) String() string {
	return tea.Prettify(s)
}

func (s OperateDivideTransInModel) GoString() string {
	return s.String()
}

func (s *OperateDivideTransInModel) SetTransInUserId(v string) *OperateDivideTransInModel {
	s.TransInUserId = &v
	return s
}

func (s *OperateDivideTransInModel) SetDivideAmount(v int64) *OperateDivideTransInModel {
	s.DivideAmount = &v
	return s
}

// 还款策略
type RepayStrategy struct {
	// 应付租金时间，精确到天 格式为yyyy-MM-dd
	PayDay *string `json:"pay_day,omitempty" xml:"pay_day,omitempty" require:"true"`
	// 用户还款期数，从1开始
	TermIndex *int64 `json:"term_index,omitempty" xml:"term_index,omitempty" require:"true"`
	// 应付租金，精确到分，即1234表示12.34元 大于0
	RentalMoney *int64 `json:"rental_money,omitempty" xml:"rental_money,omitempty" require:"true"`
	// 是否经营分账, Y-是、N-否 为空代表否
	OperateDivideFlag *string `json:"operate_divide_flag,omitempty" xml:"operate_divide_flag,omitempty"`
	// 经营分账收入方列表
	// 当operateDivideFlag 为Y时必填
	OperateDivideTransInList []*OperateDivideTransInModel `json:"operate_divide_trans_in_list,omitempty" xml:"operate_divide_trans_in_list,omitempty" require:"true" type:"Repeated"`
}

func (s RepayStrategy) String() string {
	return tea.Prettify(s)
}

func (s RepayStrategy) GoString() string {
	return s.String()
}

func (s *RepayStrategy) SetPayDay(v string) *RepayStrategy {
	s.PayDay = &v
	return s
}

func (s *RepayStrategy) SetTermIndex(v int64) *RepayStrategy {
	s.TermIndex = &v
	return s
}

func (s *RepayStrategy) SetRentalMoney(v int64) *RepayStrategy {
	s.RentalMoney = &v
	return s
}

func (s *RepayStrategy) SetOperateDivideFlag(v string) *RepayStrategy {
	s.OperateDivideFlag = &v
	return s
}

func (s *RepayStrategy) SetOperateDivideTransInList(v []*OperateDivideTransInModel) *RepayStrategy {
	s.OperateDivideTransInList = v
	return s
}

// 主订单信息
type OrderInfoReq struct {
	// 订单创建时间
	OrderCreateTime *string `json:"order_create_time,omitempty" xml:"order_create_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 订单付款主题
	OrderPaySubject *string `json:"order_pay_subject,omitempty" xml:"order_pay_subject,omitempty" require:"true"`
	// 总租期
	// 总租期最小值为1
	// 总租期最大值为60
	RentTerm *int64 `json:"rent_term,omitempty" xml:"rent_term,omitempty" require:"true"`
	// 租期单位
	// MONTH : 月
	// DAY : 天
	RentUnit *string `json:"rent_unit,omitempty" xml:"rent_unit,omitempty"`
	// 租金总额 单位/分
	// 最小值为1
	TotalRentMoney *int64 `json:"total_rent_money,omitempty" xml:"total_rent_money,omitempty" require:"true"`
}

func (s OrderInfoReq) String() string {
	return tea.Prettify(s)
}

func (s OrderInfoReq) GoString() string {
	return s.String()
}

func (s *OrderInfoReq) SetOrderCreateTime(v string) *OrderInfoReq {
	s.OrderCreateTime = &v
	return s
}

func (s *OrderInfoReq) SetOrderPaySubject(v string) *OrderInfoReq {
	s.OrderPaySubject = &v
	return s
}

func (s *OrderInfoReq) SetRentTerm(v int64) *OrderInfoReq {
	s.RentTerm = &v
	return s
}

func (s *OrderInfoReq) SetRentUnit(v string) *OrderInfoReq {
	s.RentUnit = &v
	return s
}

func (s *OrderInfoReq) SetTotalRentMoney(v int64) *OrderInfoReq {
	s.TotalRentMoney = &v
	return s
}

// 订单还款计划
type OrderPromise struct {
	// 宽限期/天
	// 不传默认为0
	GracePeriodDays *int64 `json:"grace_period_days,omitempty" xml:"grace_period_days,omitempty"`
	// 罚息类型
	//  NONE : 没有罚息  PENALTY_FEE： 罚息（暂不支持）
	PunishmentType *string `json:"punishment_type,omitempty" xml:"punishment_type,omitempty"`
	// 租期
	// 租期最小值为1
	PayPeriod *int64 `json:"pay_period,omitempty" xml:"pay_period,omitempty" require:"true"`
	// 租赁公司支付宝UID
	LeaseAlipayUid *string `json:"lease_alipay_uid,omitempty" xml:"lease_alipay_uid,omitempty" require:"true"`
	// 还款策略
	// repayStrategyList长度 == payPeriod
	RepayStrategyList []*RepayStrategy `json:"repay_strategy_list,omitempty" xml:"repay_strategy_list,omitempty" require:"true" type:"Repeated"`
}

func (s OrderPromise) String() string {
	return tea.Prettify(s)
}

func (s OrderPromise) GoString() string {
	return s.String()
}

func (s *OrderPromise) SetGracePeriodDays(v int64) *OrderPromise {
	s.GracePeriodDays = &v
	return s
}

func (s *OrderPromise) SetPunishmentType(v string) *OrderPromise {
	s.PunishmentType = &v
	return s
}

func (s *OrderPromise) SetPayPeriod(v int64) *OrderPromise {
	s.PayPeriod = &v
	return s
}

func (s *OrderPromise) SetLeaseAlipayUid(v string) *OrderPromise {
	s.LeaseAlipayUid = &v
	return s
}

func (s *OrderPromise) SetRepayStrategyList(v []*RepayStrategy) *OrderPromise {
	s.RepayStrategyList = v
	return s
}

// 订单详情列表
type OrderDetail struct {
	// 凭证编号
	VoucherCode *string `json:"voucher_code,omitempty" xml:"voucher_code,omitempty" require:"true"`
}

func (s OrderDetail) String() string {
	return tea.Prettify(s)
}

func (s OrderDetail) GoString() string {
	return s.String()
}

func (s *OrderDetail) SetVoucherCode(v string) *OrderDetail {
	s.VoucherCode = &v
	return s
}

// 订单进件请求参数
type OrderFullInfoReq struct {
	// 订单号
	//
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
	// 手机号
	MobilePhone *string `json:"mobile_phone,omitempty" xml:"mobile_phone,omitempty" require:"true"`
	// 产品ID=实际产品ID#版本 prod#1
	//
	ProductId *string `json:"product_id,omitempty" xml:"product_id,omitempty" require:"true"`
	// 商户的统一社会信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true"`
	// 商户公司名字
	MerchantName *string `json:"merchant_name,omitempty" xml:"merchant_name,omitempty" require:"true"`
	// 业务场景 默认为CHARGING_BY_TERM
	// CHARGING_BY_ORDER : 整单结算
	// CHARGING_BY_TERM : 分期结算
	//  CHARGING_BY_TERM_INDIRECT : 间联模式使用，分期结算
	//  CHARGING_BY_PROFIT : 分润结算
	BizScene *string `json:"biz_scene,omitempty" xml:"biz_scene,omitempty" require:"true"`
	// 业务类型 LEASE : 租赁 （默认） INSTALLMENT: 分期付款
	//
	BizType *string `json:"biz_type,omitempty" xml:"biz_type,omitempty" require:"true"`
	// 签署模式 NONE : 灵活签约
	SignMode *string `json:"sign_mode,omitempty" xml:"sign_mode,omitempty" require:"true"`
	// 主订单信息
	OrderInfo *OrderInfoReq `json:"order_info,omitempty" xml:"order_info,omitempty" require:"true"`
	// 订单还款计划
	PromiseInfo *OrderPromise `json:"promise_info,omitempty" xml:"promise_info,omitempty" require:"true"`
}

func (s OrderFullInfoReq) String() string {
	return tea.Prettify(s)
}

func (s OrderFullInfoReq) GoString() string {
	return s.String()
}

func (s *OrderFullInfoReq) SetOrderId(v string) *OrderFullInfoReq {
	s.OrderId = &v
	return s
}

func (s *OrderFullInfoReq) SetMobilePhone(v string) *OrderFullInfoReq {
	s.MobilePhone = &v
	return s
}

func (s *OrderFullInfoReq) SetProductId(v string) *OrderFullInfoReq {
	s.ProductId = &v
	return s
}

func (s *OrderFullInfoReq) SetMerchantId(v string) *OrderFullInfoReq {
	s.MerchantId = &v
	return s
}

func (s *OrderFullInfoReq) SetMerchantName(v string) *OrderFullInfoReq {
	s.MerchantName = &v
	return s
}

func (s *OrderFullInfoReq) SetBizScene(v string) *OrderFullInfoReq {
	s.BizScene = &v
	return s
}

func (s *OrderFullInfoReq) SetBizType(v string) *OrderFullInfoReq {
	s.BizType = &v
	return s
}

func (s *OrderFullInfoReq) SetSignMode(v string) *OrderFullInfoReq {
	s.SignMode = &v
	return s
}

func (s *OrderFullInfoReq) SetOrderInfo(v *OrderInfoReq) *OrderFullInfoReq {
	s.OrderInfo = v
	return s
}

func (s *OrderFullInfoReq) SetPromiseInfo(v *OrderPromise) *OrderFullInfoReq {
	s.PromiseInfo = v
	return s
}

// 响应结果基类
type CommonResponse struct {
	// 结果码
	Code *string `json:"code,omitempty" xml:"code,omitempty" require:"true"`
	// 返回码描述
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty" require:"true"`
	// 业务处理结果码
	//
	SubCode *string `json:"sub_code,omitempty" xml:"sub_code,omitempty"`
	// 返回的提示信息
	SubMsg *string `json:"sub_msg,omitempty" xml:"sub_msg,omitempty"`
	// 可否重试
	Retry *bool `json:"retry,omitempty" xml:"retry,omitempty"`
}

func (s CommonResponse) String() string {
	return tea.Prettify(s)
}

func (s CommonResponse) GoString() string {
	return s.String()
}

func (s *CommonResponse) SetCode(v string) *CommonResponse {
	s.Code = &v
	return s
}

func (s *CommonResponse) SetMsg(v string) *CommonResponse {
	s.Msg = &v
	return s
}

func (s *CommonResponse) SetSubCode(v string) *CommonResponse {
	s.SubCode = &v
	return s
}

func (s *CommonResponse) SetSubMsg(v string) *CommonResponse {
	s.SubMsg = &v
	return s
}

func (s *CommonResponse) SetRetry(v bool) *CommonResponse {
	s.Retry = &v
	return s
}

// 权益发放结果
type RightsGrantResultVO struct {
	// 过期时间
	ExpireTime *string `json:"expire_time,omitempty" xml:"expire_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 生效时间
	EffectTime *string `json:"effect_time,omitempty" xml:"effect_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 发放状态：
	// GRANTING：发放处理中 GRANT_SUCCESS：发放成功 GRANT_FAIL：发放失败
	GrantStatus *string `json:"grant_status,omitempty" xml:"grant_status,omitempty" require:"true"`
	// 订单详情列表
	OrderDetails []*OrderDetail `json:"order_details,omitempty" xml:"order_details,omitempty" type:"Repeated"`
}

func (s RightsGrantResultVO) String() string {
	return tea.Prettify(s)
}

func (s RightsGrantResultVO) GoString() string {
	return s.String()
}

func (s *RightsGrantResultVO) SetExpireTime(v string) *RightsGrantResultVO {
	s.ExpireTime = &v
	return s
}

func (s *RightsGrantResultVO) SetEffectTime(v string) *RightsGrantResultVO {
	s.EffectTime = &v
	return s
}

func (s *RightsGrantResultVO) SetGrantStatus(v string) *RightsGrantResultVO {
	s.GrantStatus = &v
	return s
}

func (s *RightsGrantResultVO) SetOrderDetails(v []*OrderDetail) *RightsGrantResultVO {
	s.OrderDetails = v
	return s
}

type CheckOmngRiskRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单号
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
	// 手机号
	MobilePhone *string `json:"mobile_phone,omitempty" xml:"mobile_phone,omitempty" require:"true"`
	// 产品ID=实际产品ID#版本
	// prod#1
	ProductId *string `json:"product_id,omitempty" xml:"product_id,omitempty" require:"true"`
	// 商户的统一社会信用代码
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true"`
	// 商户公司名字
	MerchantName *string `json:"merchant_name,omitempty" xml:"merchant_name,omitempty" require:"true"`
	// 业务场景
	// 默认为CHARGING_BY_TERM
	//
	//  CHARGING_BY_ORDER : 整单结算
	// CHARGING_BY_TERM : 分期结算
	//  CHARGING_BY_TERM_INDIRECT : 间联模式使用，分期结算
	// CHARGING_BY_PROFIT : 分润结算
	BizScene *string `json:"biz_scene,omitempty" xml:"biz_scene,omitempty"`
	// 业务类型
	// LEASE : 租赁 （默认）
	// INSTALLMENT: 分期付款
	//
	BizType *string `json:"biz_type,omitempty" xml:"biz_type,omitempty"`
	// 签署模式
	//  NONE : 灵活签约
	SignMode *string `json:"sign_mode,omitempty" xml:"sign_mode,omitempty"`
	// 主订单信息
	OrderInfo *OrderInfoReq `json:"order_info,omitempty" xml:"order_info,omitempty" require:"true"`
	// 订单还款计划
	PromiseInfo *OrderPromise `json:"promise_info,omitempty" xml:"promise_info,omitempty" require:"true"`
}

func (s CheckOmngRiskRequest) String() string {
	return tea.Prettify(s)
}

func (s CheckOmngRiskRequest) GoString() string {
	return s.String()
}

func (s *CheckOmngRiskRequest) SetAuthToken(v string) *CheckOmngRiskRequest {
	s.AuthToken = &v
	return s
}

func (s *CheckOmngRiskRequest) SetProductInstanceId(v string) *CheckOmngRiskRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CheckOmngRiskRequest) SetOrderId(v string) *CheckOmngRiskRequest {
	s.OrderId = &v
	return s
}

func (s *CheckOmngRiskRequest) SetMobilePhone(v string) *CheckOmngRiskRequest {
	s.MobilePhone = &v
	return s
}

func (s *CheckOmngRiskRequest) SetProductId(v string) *CheckOmngRiskRequest {
	s.ProductId = &v
	return s
}

func (s *CheckOmngRiskRequest) SetMerchantId(v string) *CheckOmngRiskRequest {
	s.MerchantId = &v
	return s
}

func (s *CheckOmngRiskRequest) SetMerchantName(v string) *CheckOmngRiskRequest {
	s.MerchantName = &v
	return s
}

func (s *CheckOmngRiskRequest) SetBizScene(v string) *CheckOmngRiskRequest {
	s.BizScene = &v
	return s
}

func (s *CheckOmngRiskRequest) SetBizType(v string) *CheckOmngRiskRequest {
	s.BizType = &v
	return s
}

func (s *CheckOmngRiskRequest) SetSignMode(v string) *CheckOmngRiskRequest {
	s.SignMode = &v
	return s
}

func (s *CheckOmngRiskRequest) SetOrderInfo(v *OrderInfoReq) *CheckOmngRiskRequest {
	s.OrderInfo = v
	return s
}

func (s *CheckOmngRiskRequest) SetPromiseInfo(v *OrderPromise) *CheckOmngRiskRequest {
	s.PromiseInfo = v
	return s
}

type CheckOmngRiskResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 授权串
	InfoStr *string `json:"info_str,omitempty" xml:"info_str,omitempty"`
}

func (s CheckOmngRiskResponse) String() string {
	return tea.Prettify(s)
}

func (s CheckOmngRiskResponse) GoString() string {
	return s.String()
}

func (s *CheckOmngRiskResponse) SetReqMsgId(v string) *CheckOmngRiskResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CheckOmngRiskResponse) SetResultCode(v string) *CheckOmngRiskResponse {
	s.ResultCode = &v
	return s
}

func (s *CheckOmngRiskResponse) SetResultMsg(v string) *CheckOmngRiskResponse {
	s.ResultMsg = &v
	return s
}

func (s *CheckOmngRiskResponse) SetInfoStr(v string) *CheckOmngRiskResponse {
	s.InfoStr = &v
	return s
}

type SubmitRightsprodGrantRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 2088xxxx123
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty"`
	// 用户手机号
	PhoneNumber *string `json:"phone_number,omitempty" xml:"phone_number,omitempty"`
	// 商户编号
	MerchantNo *string `json:"merchant_no,omitempty" xml:"merchant_no,omitempty"`
	// 权益编码
	RightsCode *string `json:"rights_code,omitempty" xml:"rights_code,omitempty" require:"true"`
	// 发放数量
	GrantNum *int64 `json:"grant_num,omitempty" xml:"grant_num,omitempty" require:"true"`
	// 面额，动态面额类型必传
	FaceValue *string `json:"face_value,omitempty" xml:"face_value,omitempty"`
	// 外部发放订单号
	OutGrantOrderNo *string `json:"out_grant_order_no,omitempty" xml:"out_grant_order_no,omitempty" require:"true"`
	// 扩展信息
	ExtInfo *string `json:"ext_info,omitempty" xml:"ext_info,omitempty"`
	// 发放信息,如活动ID等信息
	GrantInfo *string `json:"grant_info,omitempty" xml:"grant_info,omitempty"`
}

func (s SubmitRightsprodGrantRequest) String() string {
	return tea.Prettify(s)
}

func (s SubmitRightsprodGrantRequest) GoString() string {
	return s.String()
}

func (s *SubmitRightsprodGrantRequest) SetAuthToken(v string) *SubmitRightsprodGrantRequest {
	s.AuthToken = &v
	return s
}

func (s *SubmitRightsprodGrantRequest) SetProductInstanceId(v string) *SubmitRightsprodGrantRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SubmitRightsprodGrantRequest) SetUserId(v string) *SubmitRightsprodGrantRequest {
	s.UserId = &v
	return s
}

func (s *SubmitRightsprodGrantRequest) SetPhoneNumber(v string) *SubmitRightsprodGrantRequest {
	s.PhoneNumber = &v
	return s
}

func (s *SubmitRightsprodGrantRequest) SetMerchantNo(v string) *SubmitRightsprodGrantRequest {
	s.MerchantNo = &v
	return s
}

func (s *SubmitRightsprodGrantRequest) SetRightsCode(v string) *SubmitRightsprodGrantRequest {
	s.RightsCode = &v
	return s
}

func (s *SubmitRightsprodGrantRequest) SetGrantNum(v int64) *SubmitRightsprodGrantRequest {
	s.GrantNum = &v
	return s
}

func (s *SubmitRightsprodGrantRequest) SetFaceValue(v string) *SubmitRightsprodGrantRequest {
	s.FaceValue = &v
	return s
}

func (s *SubmitRightsprodGrantRequest) SetOutGrantOrderNo(v string) *SubmitRightsprodGrantRequest {
	s.OutGrantOrderNo = &v
	return s
}

func (s *SubmitRightsprodGrantRequest) SetExtInfo(v string) *SubmitRightsprodGrantRequest {
	s.ExtInfo = &v
	return s
}

func (s *SubmitRightsprodGrantRequest) SetGrantInfo(v string) *SubmitRightsprodGrantRequest {
	s.GrantInfo = &v
	return s
}

type SubmitRightsprodGrantResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 权益发放结果
	RightsGrantResult *RightsGrantResultVO `json:"rights_grant_result,omitempty" xml:"rights_grant_result,omitempty"`
}

func (s SubmitRightsprodGrantResponse) String() string {
	return tea.Prettify(s)
}

func (s SubmitRightsprodGrantResponse) GoString() string {
	return s.String()
}

func (s *SubmitRightsprodGrantResponse) SetReqMsgId(v string) *SubmitRightsprodGrantResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SubmitRightsprodGrantResponse) SetResultCode(v string) *SubmitRightsprodGrantResponse {
	s.ResultCode = &v
	return s
}

func (s *SubmitRightsprodGrantResponse) SetResultMsg(v string) *SubmitRightsprodGrantResponse {
	s.ResultMsg = &v
	return s
}

func (s *SubmitRightsprodGrantResponse) SetRightsGrantResult(v *RightsGrantResultVO) *SubmitRightsprodGrantResponse {
	s.RightsGrantResult = v
	return s
}

type QueryRightsprodGrantRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 外部发放订单号
	OutGrantOrderNo *string `json:"out_grant_order_no,omitempty" xml:"out_grant_order_no,omitempty" require:"true"`
	// 扩展信息
	ExtInfo *string `json:"ext_info,omitempty" xml:"ext_info,omitempty"`
}

func (s QueryRightsprodGrantRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryRightsprodGrantRequest) GoString() string {
	return s.String()
}

func (s *QueryRightsprodGrantRequest) SetAuthToken(v string) *QueryRightsprodGrantRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryRightsprodGrantRequest) SetProductInstanceId(v string) *QueryRightsprodGrantRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryRightsprodGrantRequest) SetOutGrantOrderNo(v string) *QueryRightsprodGrantRequest {
	s.OutGrantOrderNo = &v
	return s
}

func (s *QueryRightsprodGrantRequest) SetExtInfo(v string) *QueryRightsprodGrantRequest {
	s.ExtInfo = &v
	return s
}

type QueryRightsprodGrantResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 权益发放结果
	RightsGrantResult *RightsGrantResultVO `json:"rights_grant_result,omitempty" xml:"rights_grant_result,omitempty"`
}

func (s QueryRightsprodGrantResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryRightsprodGrantResponse) GoString() string {
	return s.String()
}

func (s *QueryRightsprodGrantResponse) SetReqMsgId(v string) *QueryRightsprodGrantResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryRightsprodGrantResponse) SetResultCode(v string) *QueryRightsprodGrantResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryRightsprodGrantResponse) SetResultMsg(v string) *QueryRightsprodGrantResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryRightsprodGrantResponse) SetRightsGrantResult(v *RightsGrantResultVO) *QueryRightsprodGrantResponse {
	s.RightsGrantResult = v
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
				"sdk_version":      tea.String("1.2.3"),
				"_prod_code":       tea.String("GESAAS"),
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
 * Description: 品牌会员签约鉴权产品链路风控鉴权
 * Summary: 风控鉴权
 */
func (client *Client) CheckOmngRisk(request *CheckOmngRiskRequest) (_result *CheckOmngRiskResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CheckOmngRiskResponse{}
	_body, _err := client.CheckOmngRiskEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 品牌会员签约鉴权产品链路风控鉴权
 * Summary: 风控鉴权
 */
func (client *Client) CheckOmngRiskEx(request *CheckOmngRiskRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CheckOmngRiskResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CheckOmngRiskResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.gesaas.omng.risk.check"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 权益中心权益发放
 * Summary: 权益发放
 */
func (client *Client) SubmitRightsprodGrant(request *SubmitRightsprodGrantRequest) (_result *SubmitRightsprodGrantResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SubmitRightsprodGrantResponse{}
	_body, _err := client.SubmitRightsprodGrantEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 权益中心权益发放
 * Summary: 权益发放
 */
func (client *Client) SubmitRightsprodGrantEx(request *SubmitRightsprodGrantRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SubmitRightsprodGrantResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SubmitRightsprodGrantResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.gesaas.rightsprod.grant.submit"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 权益发放结果查询
 * Summary: 权益发放结果查询
 */
func (client *Client) QueryRightsprodGrant(request *QueryRightsprodGrantRequest) (_result *QueryRightsprodGrantResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryRightsprodGrantResponse{}
	_body, _err := client.QueryRightsprodGrantEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 权益发放结果查询
 * Summary: 权益发放结果查询
 */
func (client *Client) QueryRightsprodGrantEx(request *QueryRightsprodGrantRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryRightsprodGrantResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryRightsprodGrantResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.gesaas.rightsprod.grant.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
