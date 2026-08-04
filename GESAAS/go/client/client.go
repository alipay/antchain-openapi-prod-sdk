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

// 经营分账收入方列表
type OperateDivideTransInModel struct {
	// 分账收入方支付宝用户id, 支付宝2088id
	// example:
	//
	// 2088id
	TransInUserId *string `json:"trans_in_user_id,omitempty" xml:"trans_in_user_id,omitempty" require:"true"`
	// 分账金额，单位为分 大于0
	// example:
	//
	// 12324
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
	// example:
	//
	// 2025-09-19
	PayDay *string `json:"pay_day,omitempty" xml:"pay_day,omitempty" require:"true"`
	// 用户还款期数，从1开始
	// example:
	//
	// 1
	TermIndex *int64 `json:"term_index,omitempty" xml:"term_index,omitempty" require:"true"`
	// 应付租金，精确到分，即1234表示12.34元 大于0
	// example:
	//
	// 1234
	RentalMoney *int64 `json:"rental_money,omitempty" xml:"rental_money,omitempty" require:"true"`
	// 是否经营分账, Y-是、N-否 为空代表否
	// example:
	//
	// Y
	OperateDivideFlag *string `json:"operate_divide_flag,omitempty" xml:"operate_divide_flag,omitempty"`
	// 经营分账收入方列表
	// 当operateDivideFlag 为Y时必填
	OperateDivideTransInList []*OperateDivideTransInModel `json:"operate_divide_trans_in_list,omitempty" xml:"operate_divide_trans_in_list,omitempty" type:"Repeated"`
	// 是否停止数科代扣自动执行
	//
	// Y：停止；由商户调用接口「支付相关接入 - 代扣计划重试」触发代扣；否则代扣不会被执行、到逾期时间后会被逾期
	//
	// N : 不停止；保持数科自动代扣（默认）
	// example:
	//
	// N
	NoNeedAutoDeduction *string `json:"no_need_auto_deduction,omitempty" xml:"no_need_auto_deduction,omitempty"`
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

func (s *RepayStrategy) SetNoNeedAutoDeduction(v string) *RepayStrategy {
	s.NoNeedAutoDeduction = &v
	return s
}

// 分账账号详情，针对某一笔分账
type OrderSplitDetailList struct {
	// 某笔分账状态：PROCESSING-处理中,SUCCESS-成功,CLOSE-关闭,FAILED-失败
	// example:
	//
	// SUCCESS
	SplitStatus *string `json:"split_status,omitempty" xml:"split_status,omitempty" require:"true"`
	// 分账金额，单位：分
	// example:
	//
	// 990
	SplitAmount *int64 `json:"split_amount,omitempty" xml:"split_amount,omitempty" require:"true"`
	// 分账执行时间，格式为yyyy-MM-dd HH:mm:ss
	// 条件返回：splitStatus=SUCCESS 返回
	// example:
	//
	// 2021-07-30 12:00:00
	ExecuteTime *string `json:"execute_time,omitempty" xml:"execute_time,omitempty"`
	// 分账转出账号
	// example:
	//
	// 2088101126765726
	TransOutAccount *string `json:"trans_out_account,omitempty" xml:"trans_out_account,omitempty" require:"true"`
	// 分账转入账号
	// example:
	//
	// 2088101126765726
	TransInAccount *string `json:"trans_in_account,omitempty" xml:"trans_in_account,omitempty" require:"true"`
	// 分账失败原因，条件返回：splitStatus=FAILED 返回
	// example:
	//
	// 账户余额不足
	SplitFailedReason *string `json:"split_failed_reason,omitempty" xml:"split_failed_reason,omitempty"`
}

func (s OrderSplitDetailList) String() string {
	return tea.Prettify(s)
}

func (s OrderSplitDetailList) GoString() string {
	return s.String()
}

func (s *OrderSplitDetailList) SetSplitStatus(v string) *OrderSplitDetailList {
	s.SplitStatus = &v
	return s
}

func (s *OrderSplitDetailList) SetSplitAmount(v int64) *OrderSplitDetailList {
	s.SplitAmount = &v
	return s
}

func (s *OrderSplitDetailList) SetExecuteTime(v string) *OrderSplitDetailList {
	s.ExecuteTime = &v
	return s
}

func (s *OrderSplitDetailList) SetTransOutAccount(v string) *OrderSplitDetailList {
	s.TransOutAccount = &v
	return s
}

func (s *OrderSplitDetailList) SetTransInAccount(v string) *OrderSplitDetailList {
	s.TransInAccount = &v
	return s
}

func (s *OrderSplitDetailList) SetSplitFailedReason(v string) *OrderSplitDetailList {
	s.SplitFailedReason = &v
	return s
}

// 订单详情列表
type OrderDetail struct {
	// 券码
	// example:
	//
	// 1798234932684395
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

// 主订单信息
type OrderInfoReq struct {
	// 订单创建时间
	// example:
	//
	// 2018-10-10T10:10:00Z
	OrderCreateTime *string `json:"order_create_time,omitempty" xml:"order_create_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 订单付款主题
	// example:
	//
	// 退订、续订,人工客服电话:4006476616商家订单号：
	OrderPaySubject *string `json:"order_pay_subject,omitempty" xml:"order_pay_subject,omitempty" require:"true"`
	// 总租期
	// 总租期最小值为1
	// 总租期最大值为60
	// example:
	//
	// 12
	RentTerm *int64 `json:"rent_term,omitempty" xml:"rent_term,omitempty" require:"true"`
	// 租期单位
	// MONTH : 月
	// DAY : 天
	// example:
	//
	// MONTH
	RentUnit *string `json:"rent_unit,omitempty" xml:"rent_unit,omitempty"`
	// 租金总额 单位/分
	// 最小值为1
	// example:
	//
	// 1234
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
	// example:
	//
	// 1233
	GracePeriodDays *int64 `json:"grace_period_days,omitempty" xml:"grace_period_days,omitempty"`
	// 罚息类型
	//  NONE : 没有罚息  PENALTY_FEE： 罚息（暂不支持）
	// example:
	//
	// NONE
	PunishmentType *string `json:"punishment_type,omitempty" xml:"punishment_type,omitempty"`
	// 租期
	// 租期最小值为1
	// example:
	//
	// 11
	PayPeriod *int64 `json:"pay_period,omitempty" xml:"pay_period,omitempty" require:"true"`
	// 租赁公司支付宝UID
	// example:
	//
	// 2088Id
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

// 结算订单分账明细对象
type SettleOrderRoyaltyDetail struct {
	// 分账金额，单位：分
	// example:
	//
	// 1000
	Amount *int64 `json:"amount,omitempty" xml:"amount,omitempty"`
	// 分账执行时间
	// example:
	//
	// 2021-07-30 12:00:00
	ExecuteTime *string `json:"execute_time,omitempty" xml:"execute_time,omitempty"`
	// 分账转出账号
	// example:
	//
	// 2088111111111111
	TransOutAccount *string `json:"trans_out_account,omitempty" xml:"trans_out_account,omitempty"`
	// 分账转入账号
	// example:
	//
	// 2088111111111111
	TransInAccount *string `json:"trans_in_account,omitempty" xml:"trans_in_account,omitempty"`
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

// 分账详情
type OrderSplitInfo struct {
	// 主订单分账状态，PROCESSING-处理中,SUCCESS-成功,FAILED-失败
	// example:
	//
	// SUCCESS
	OrderSplitStatus *string `json:"order_split_status,omitempty" xml:"order_split_status,omitempty" require:"true"`
	// 分账账号个数
	// example:
	//
	// 9
	OrderSplitAccountCount *int64 `json:"order_split_account_count,omitempty" xml:"order_split_account_count,omitempty" require:"true"`
	// 分账账号详情，针对某一笔分账
	// example:
	//
	// undefined
	OrderSplitDetailList []*OrderSplitDetailList `json:"order_split_detail_list,omitempty" xml:"order_split_detail_list,omitempty" require:"true" type:"Repeated"`
}

func (s OrderSplitInfo) String() string {
	return tea.Prettify(s)
}

func (s OrderSplitInfo) GoString() string {
	return s.String()
}

func (s *OrderSplitInfo) SetOrderSplitStatus(v string) *OrderSplitInfo {
	s.OrderSplitStatus = &v
	return s
}

func (s *OrderSplitInfo) SetOrderSplitAccountCount(v int64) *OrderSplitInfo {
	s.OrderSplitAccountCount = &v
	return s
}

func (s *OrderSplitInfo) SetOrderSplitDetailList(v []*OrderSplitDetailList) *OrderSplitInfo {
	s.OrderSplitDetailList = v
	return s
}

// 订单进件请求参数
type OrderFullInfoReq struct {
	// 订单号
	//
	// example:
	//
	// 1798234932684395
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
	// 手机号
	// example:
	//
	// 15629827201
	MobilePhone *string `json:"mobile_phone,omitempty" xml:"mobile_phone,omitempty" require:"true"`
	// 产品ID=实际产品ID#版本 prod#1
	//
	// example:
	//
	// prod#1
	ProductId *string `json:"product_id,omitempty" xml:"product_id,omitempty" require:"true"`
	// 商户的统一社会信用代码
	// example:
	//
	// 2088xxx
	MerchantId *string `json:"merchant_id,omitempty" xml:"merchant_id,omitempty" require:"true"`
	// 商户公司名字
	// example:
	//
	// 蚂蚁云创xxx有限公司
	MerchantName *string `json:"merchant_name,omitempty" xml:"merchant_name,omitempty" require:"true"`
	// 业务场景 默认为CHARGING_BY_TERM
	// CHARGING_BY_ORDER : 整单结算
	// CHARGING_BY_TERM : 分期结算
	//  CHARGING_BY_TERM_INDIRECT : 间联模式使用，分期结算
	//  CHARGING_BY_PROFIT : 分润结算
	// example:
	//
	// CHARGING_BY_TERM
	BizScene *string `json:"biz_scene,omitempty" xml:"biz_scene,omitempty" require:"true"`
	// 业务类型 LEASE : 租赁 （默认） INSTALLMENT: 分期付款
	//
	// example:
	//
	// INSTALLMENT
	BizType *string `json:"biz_type,omitempty" xml:"biz_type,omitempty" require:"true"`
	// 签署模式 NONE : 灵活签约
	// example:
	//
	// NONE
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
	// example:
	//
	// 100001
	Code *string `json:"code,omitempty" xml:"code,omitempty" require:"true"`
	// 返回码描述
	// example:
	//
	// 成功
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty" require:"true"`
	// 业务处理结果码
	//
	// example:
	//
	// fail
	SubCode *string `json:"sub_code,omitempty" xml:"sub_code,omitempty"`
	// 返回的提示信息
	// example:
	//
	// 失败
	SubMsg *string `json:"sub_msg,omitempty" xml:"sub_msg,omitempty"`
	// 可否重试
	// example:
	//
	// true, false
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

// 支付详情
type OrderPayInfo struct {
	// 支付状态：PROCESSING-处理中,SUCCESS-成功,CLOSE-关闭,FAILED-失败
	// example:
	//
	// SUCCESS
	OrderPayStatus *string `json:"order_pay_status,omitempty" xml:"order_pay_status,omitempty" require:"true"`
	// 支付时间，条件返回：orderPayStatus=SUCCESS 返回
	// example:
	//
	// 2021-07-30 12:00:00
	OrderPayTime *string `json:"order_pay_time,omitempty" xml:"order_pay_time,omitempty"`
	// 失败原因，条件返回：orderPayStatus=FAILED 返回
	// example:
	//
	// 账户余额不足
	OrderPayFailedReason *string `json:"order_pay_failed_reason,omitempty" xml:"order_pay_failed_reason,omitempty"`
	// 支付金额，单位：分，条件返回：orderPayStatus=SUCCESS 返回
	// example:
	//
	// 990
	PayAmount *int64 `json:"pay_amount,omitempty" xml:"pay_amount,omitempty"`
	// 实际支付金额，单位：分，条件返回：orderPayStatus=SUCCESS 返回
	// example:
	//
	// 990
	RealPayAmount *int64 `json:"real_pay_amount,omitempty" xml:"real_pay_amount,omitempty"`
	// 收款金额，单位：分，条件返回：orderPayStatus=SUCCESS 返回
	// example:
	//
	// 990
	RealReceiptAmount *int64 `json:"real_receipt_amount,omitempty" xml:"real_receipt_amount,omitempty"`
}

func (s OrderPayInfo) String() string {
	return tea.Prettify(s)
}

func (s OrderPayInfo) GoString() string {
	return s.String()
}

func (s *OrderPayInfo) SetOrderPayStatus(v string) *OrderPayInfo {
	s.OrderPayStatus = &v
	return s
}

func (s *OrderPayInfo) SetOrderPayTime(v string) *OrderPayInfo {
	s.OrderPayTime = &v
	return s
}

func (s *OrderPayInfo) SetOrderPayFailedReason(v string) *OrderPayInfo {
	s.OrderPayFailedReason = &v
	return s
}

func (s *OrderPayInfo) SetPayAmount(v int64) *OrderPayInfo {
	s.PayAmount = &v
	return s
}

func (s *OrderPayInfo) SetRealPayAmount(v int64) *OrderPayInfo {
	s.RealPayAmount = &v
	return s
}

func (s *OrderPayInfo) SetRealReceiptAmount(v int64) *OrderPayInfo {
	s.RealReceiptAmount = &v
	return s
}

// 权益发放结果
type RightsGrantResultVO struct {
	// 过期时间
	// example:
	//
	// 2018-10-10T10:10:00Z
	ExpireTime *string `json:"expire_time,omitempty" xml:"expire_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 生效时间
	EffectTime *string `json:"effect_time,omitempty" xml:"effect_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 发放状态：
	// GRANTING：发放处理中 GRANT_SUCCESS：发放成功 GRANT_FAIL：发放失败
	// example:
	//
	// GRANTING
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

// 券基本信息
type VoucherBaseInfoVO struct {
	// 2088xxxxxx0001
	// example:
	//
	// 用户ID
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty"`
	// 手机号
	// example:
	//
	// 15700001111
	PhoneNumber *string `json:"phone_number,omitempty" xml:"phone_number,omitempty"`
	// 权益编号
	// example:
	//
	// RC188955110502576765
	RightsCode *string `json:"rights_code,omitempty" xml:"rights_code,omitempty" require:"true"`
	// 权益名称
	// example:
	//
	// 满10元减2元
	RightsName *string `json:"rights_name,omitempty" xml:"rights_name,omitempty" require:"true"`
	// 券码
	// example:
	//
	// 202601160007300227760ZT3CMQY
	VoucherCode *string `json:"voucher_code,omitempty" xml:"voucher_code,omitempty" require:"true"`
	// 券状态
	// WAIT_EFFECT：待生效
	// WAIT_VERIFY：待核销
	// EXPIRED：已过期
	// VERIFY_SUCCESS：核销成功（已核销）
	// 公域场景下只会包含以上四种状态，私域场景会包含下方状态基
	// FREEZE：已冻结
	// VERIFYING：核销处理中
	// VERIFY_FAIL：核销失败
	// VERIFY_CANCELING：核销撤销中
	// INVALID：已失效
	// NO_NEED_VERIFY：无需核销
	// example:
	//
	// WAIT_VERIFY
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
}

func (s VoucherBaseInfoVO) String() string {
	return tea.Prettify(s)
}

func (s VoucherBaseInfoVO) GoString() string {
	return s.String()
}

func (s *VoucherBaseInfoVO) SetUserId(v string) *VoucherBaseInfoVO {
	s.UserId = &v
	return s
}

func (s *VoucherBaseInfoVO) SetPhoneNumber(v string) *VoucherBaseInfoVO {
	s.PhoneNumber = &v
	return s
}

func (s *VoucherBaseInfoVO) SetRightsCode(v string) *VoucherBaseInfoVO {
	s.RightsCode = &v
	return s
}

func (s *VoucherBaseInfoVO) SetRightsName(v string) *VoucherBaseInfoVO {
	s.RightsName = &v
	return s
}

func (s *VoucherBaseInfoVO) SetVoucherCode(v string) *VoucherBaseInfoVO {
	s.VoucherCode = &v
	return s
}

func (s *VoucherBaseInfoVO) SetStatus(v string) *VoucherBaseInfoVO {
	s.Status = &v
	return s
}

// 退款账户明细信息
type RefundDetail struct {
	// 支出方账户ID，如果是支付宝：以2088开头的纯16位数字
	// example:
	//
	// 2088101126765726
	TransOutAccount *string `json:"trans_out_account,omitempty" xml:"trans_out_account,omitempty"`
	// 分账的金额，单位为分
	// example:
	//
	// 990
	Amount *int64 `json:"amount,omitempty" xml:"amount,omitempty"`
}

func (s RefundDetail) String() string {
	return tea.Prettify(s)
}

func (s RefundDetail) GoString() string {
	return s.String()
}

func (s *RefundDetail) SetTransOutAccount(v string) *RefundDetail {
	s.TransOutAccount = &v
	return s
}

func (s *RefundDetail) SetAmount(v int64) *RefundDetail {
	s.Amount = &v
	return s
}

// 条件返回：refundStatus=SUCCESS 返回
// 退分账明细
type RefundDetailItemList struct {
	// 退款退分账金额，单位为分
	// example:
	//
	// 990
	Amount *int64 `json:"amount,omitempty" xml:"amount,omitempty"`
	// 退款退分账支出账号
	// example:
	//
	// 2088101126765726
	TransOutAccount *string `json:"trans_out_account,omitempty" xml:"trans_out_account,omitempty"`
	// 退款退分账转入账号
	// example:
	//
	// 2088101126765726
	TransInAccount *string `json:"trans_in_account,omitempty" xml:"trans_in_account,omitempty"`
}

func (s RefundDetailItemList) String() string {
	return tea.Prettify(s)
}

func (s RefundDetailItemList) GoString() string {
	return s.String()
}

func (s *RefundDetailItemList) SetAmount(v int64) *RefundDetailItemList {
	s.Amount = &v
	return s
}

func (s *RefundDetailItemList) SetTransOutAccount(v string) *RefundDetailItemList {
	s.TransOutAccount = &v
	return s
}

func (s *RefundDetailItemList) SetTransInAccount(v string) *RefundDetailItemList {
	s.TransInAccount = &v
	return s
}

type PushOrderSettlementRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 商家产品唯一编码，64个字符以内
	OutProductId *string `json:"out_product_id,omitempty" xml:"out_product_id,omitempty" require:"true"`
	// 外部订单号(同一个outProductId保证唯一性)，需保证在商家端不重复，64个字符以内
	OutOrderNo *string `json:"out_order_no,omitempty" xml:"out_order_no,omitempty" require:"true"`
	// 订单支付金额(同分账金额)，单位：分（如 990 表示 9.90元）
	TotalAmount *int64 `json:"total_amount,omitempty" xml:"total_amount,omitempty" require:"true"`
	// 支付产品，默认：JSAPI
	PayProduct *string `json:"pay_product,omitempty" xml:"pay_product,omitempty"`
	// 扩展参数，JSONString格式
	ExtInfo *string `json:"ext_info,omitempty" xml:"ext_info,omitempty"`
	// 订单创建时间，格式为yyyy-MM-dd HH:mm:ss
	OrderCreateTime *string `json:"order_create_time,omitempty" xml:"order_create_time,omitempty" require:"true"`
	// 订单支付标题， 150个字符以内
	PaySubject *string `json:"pay_subject,omitempty" xml:"pay_subject,omitempty" require:"true"`
	// 支付渠道，默认：ALIPAY
	PayChannel *string `json:"pay_channel,omitempty" xml:"pay_channel,omitempty"`
	// 支付渠道是ALIPAY场景下传入支付宝用户2088xxxx
	PayChannelUserId *string `json:"pay_channel_user_id,omitempty" xml:"pay_channel_user_id,omitempty" require:"true"`
}

func (s PushOrderSettlementRequest) String() string {
	return tea.Prettify(s)
}

func (s PushOrderSettlementRequest) GoString() string {
	return s.String()
}

func (s *PushOrderSettlementRequest) SetAuthToken(v string) *PushOrderSettlementRequest {
	s.AuthToken = &v
	return s
}

func (s *PushOrderSettlementRequest) SetProductInstanceId(v string) *PushOrderSettlementRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PushOrderSettlementRequest) SetOutProductId(v string) *PushOrderSettlementRequest {
	s.OutProductId = &v
	return s
}

func (s *PushOrderSettlementRequest) SetOutOrderNo(v string) *PushOrderSettlementRequest {
	s.OutOrderNo = &v
	return s
}

func (s *PushOrderSettlementRequest) SetTotalAmount(v int64) *PushOrderSettlementRequest {
	s.TotalAmount = &v
	return s
}

func (s *PushOrderSettlementRequest) SetPayProduct(v string) *PushOrderSettlementRequest {
	s.PayProduct = &v
	return s
}

func (s *PushOrderSettlementRequest) SetExtInfo(v string) *PushOrderSettlementRequest {
	s.ExtInfo = &v
	return s
}

func (s *PushOrderSettlementRequest) SetOrderCreateTime(v string) *PushOrderSettlementRequest {
	s.OrderCreateTime = &v
	return s
}

func (s *PushOrderSettlementRequest) SetPaySubject(v string) *PushOrderSettlementRequest {
	s.PaySubject = &v
	return s
}

func (s *PushOrderSettlementRequest) SetPayChannel(v string) *PushOrderSettlementRequest {
	s.PayChannel = &v
	return s
}

func (s *PushOrderSettlementRequest) SetPayChannelUserId(v string) *PushOrderSettlementRequest {
	s.PayChannelUserId = &v
	return s
}

type PushOrderSettlementResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 支付宝/微信/其他 平台订单号
	TradeNo *string `json:"trade_no,omitempty" xml:"trade_no,omitempty"`
}

func (s PushOrderSettlementResponse) String() string {
	return tea.Prettify(s)
}

func (s PushOrderSettlementResponse) GoString() string {
	return s.String()
}

func (s *PushOrderSettlementResponse) SetReqMsgId(v string) *PushOrderSettlementResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PushOrderSettlementResponse) SetResultCode(v string) *PushOrderSettlementResponse {
	s.ResultCode = &v
	return s
}

func (s *PushOrderSettlementResponse) SetResultMsg(v string) *PushOrderSettlementResponse {
	s.ResultMsg = &v
	return s
}

func (s *PushOrderSettlementResponse) SetTradeNo(v string) *PushOrderSettlementResponse {
	s.TradeNo = &v
	return s
}

type QueryOrderSettlementRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 外部订单号
	OutOrderNo *string `json:"out_order_no,omitempty" xml:"out_order_no,omitempty" require:"true"`
}

func (s QueryOrderSettlementRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryOrderSettlementRequest) GoString() string {
	return s.String()
}

func (s *QueryOrderSettlementRequest) SetAuthToken(v string) *QueryOrderSettlementRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryOrderSettlementRequest) SetProductInstanceId(v string) *QueryOrderSettlementRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryOrderSettlementRequest) SetOutOrderNo(v string) *QueryOrderSettlementRequest {
	s.OutOrderNo = &v
	return s
}

type QueryOrderSettlementResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 商家产品唯一编码，64个字符以内
	OutProductId *string `json:"out_product_id,omitempty" xml:"out_product_id,omitempty"`
	// 订单金额，单位：分（如 990 表示 9.90元）
	TotalAmount *int64 `json:"total_amount,omitempty" xml:"total_amount,omitempty"`
	// 订单创建时间，格式为yyyy-MM-dd HH:mm:ss
	OrderCreateTime *string `json:"order_create_time,omitempty" xml:"order_create_time,omitempty"`
	// 订单支付标题， 150个字符以内
	PaySubject *string `json:"pay_subject,omitempty" xml:"pay_subject,omitempty"`
	// 支付宝支付订单号，用于拉起主动支付页面
	TradeNo *string `json:"trade_no,omitempty" xml:"trade_no,omitempty"`
	// 支付详情
	OrderPayInfo *OrderPayInfo `json:"order_pay_info,omitempty" xml:"order_pay_info,omitempty"`
	// 分账详情
	OrderSplitInfo *OrderSplitInfo `json:"order_split_info,omitempty" xml:"order_split_info,omitempty"`
	// 支付渠道是ALIPAY场景下-支付宝用户2088xxxx
	PayChannelUserId *string `json:"pay_channel_user_id,omitempty" xml:"pay_channel_user_id,omitempty"`
	// 支付渠道，默认：ALIPAY
	PayChannel *string `json:"pay_channel,omitempty" xml:"pay_channel,omitempty"`
	// 支付产品，默认：JSAPI
	PayProduct *string `json:"pay_product,omitempty" xml:"pay_product,omitempty"`
}

func (s QueryOrderSettlementResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryOrderSettlementResponse) GoString() string {
	return s.String()
}

func (s *QueryOrderSettlementResponse) SetReqMsgId(v string) *QueryOrderSettlementResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryOrderSettlementResponse) SetResultCode(v string) *QueryOrderSettlementResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryOrderSettlementResponse) SetResultMsg(v string) *QueryOrderSettlementResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryOrderSettlementResponse) SetOutProductId(v string) *QueryOrderSettlementResponse {
	s.OutProductId = &v
	return s
}

func (s *QueryOrderSettlementResponse) SetTotalAmount(v int64) *QueryOrderSettlementResponse {
	s.TotalAmount = &v
	return s
}

func (s *QueryOrderSettlementResponse) SetOrderCreateTime(v string) *QueryOrderSettlementResponse {
	s.OrderCreateTime = &v
	return s
}

func (s *QueryOrderSettlementResponse) SetPaySubject(v string) *QueryOrderSettlementResponse {
	s.PaySubject = &v
	return s
}

func (s *QueryOrderSettlementResponse) SetTradeNo(v string) *QueryOrderSettlementResponse {
	s.TradeNo = &v
	return s
}

func (s *QueryOrderSettlementResponse) SetOrderPayInfo(v *OrderPayInfo) *QueryOrderSettlementResponse {
	s.OrderPayInfo = v
	return s
}

func (s *QueryOrderSettlementResponse) SetOrderSplitInfo(v *OrderSplitInfo) *QueryOrderSettlementResponse {
	s.OrderSplitInfo = v
	return s
}

func (s *QueryOrderSettlementResponse) SetPayChannelUserId(v string) *QueryOrderSettlementResponse {
	s.PayChannelUserId = &v
	return s
}

func (s *QueryOrderSettlementResponse) SetPayChannel(v string) *QueryOrderSettlementResponse {
	s.PayChannel = &v
	return s
}

func (s *QueryOrderSettlementResponse) SetPayProduct(v string) *QueryOrderSettlementResponse {
	s.PayProduct = &v
	return s
}

type WithdrawOrderSettlementRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s WithdrawOrderSettlementRequest) String() string {
	return tea.Prettify(s)
}

func (s WithdrawOrderSettlementRequest) GoString() string {
	return s.String()
}

func (s *WithdrawOrderSettlementRequest) SetAuthToken(v string) *WithdrawOrderSettlementRequest {
	s.AuthToken = &v
	return s
}

func (s *WithdrawOrderSettlementRequest) SetProductInstanceId(v string) *WithdrawOrderSettlementRequest {
	s.ProductInstanceId = &v
	return s
}

type WithdrawOrderSettlementResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s WithdrawOrderSettlementResponse) String() string {
	return tea.Prettify(s)
}

func (s WithdrawOrderSettlementResponse) GoString() string {
	return s.String()
}

func (s *WithdrawOrderSettlementResponse) SetReqMsgId(v string) *WithdrawOrderSettlementResponse {
	s.ReqMsgId = &v
	return s
}

func (s *WithdrawOrderSettlementResponse) SetResultCode(v string) *WithdrawOrderSettlementResponse {
	s.ResultCode = &v
	return s
}

func (s *WithdrawOrderSettlementResponse) SetResultMsg(v string) *WithdrawOrderSettlementResponse {
	s.ResultMsg = &v
	return s
}

type QueryOrderWithdrawRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s QueryOrderWithdrawRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryOrderWithdrawRequest) GoString() string {
	return s.String()
}

func (s *QueryOrderWithdrawRequest) SetAuthToken(v string) *QueryOrderWithdrawRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryOrderWithdrawRequest) SetProductInstanceId(v string) *QueryOrderWithdrawRequest {
	s.ProductInstanceId = &v
	return s
}

type QueryOrderWithdrawResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s QueryOrderWithdrawResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryOrderWithdrawResponse) GoString() string {
	return s.String()
}

func (s *QueryOrderWithdrawResponse) SetReqMsgId(v string) *QueryOrderWithdrawResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryOrderWithdrawResponse) SetResultCode(v string) *QueryOrderWithdrawResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryOrderWithdrawResponse) SetResultMsg(v string) *QueryOrderWithdrawResponse {
	s.ResultMsg = &v
	return s
}

type PushOrderRefundRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 外部订单号
	OutOrderNo *string `json:"out_order_no,omitempty" xml:"out_order_no,omitempty" require:"true"`
	// 外部系统传入的退款请求号
	RefundRequestNo *string `json:"refund_request_no,omitempty" xml:"refund_request_no,omitempty" require:"true"`
	// 退款退分账金额，单位：分
	// 限制条件：大于0，小于等于订单金额
	RefundAmount *int64 `json:"refund_amount,omitempty" xml:"refund_amount,omitempty" require:"true"`
	// 退款退分账原因
	RefundReason *string `json:"refund_reason,omitempty" xml:"refund_reason,omitempty"`
}

func (s PushOrderRefundRequest) String() string {
	return tea.Prettify(s)
}

func (s PushOrderRefundRequest) GoString() string {
	return s.String()
}

func (s *PushOrderRefundRequest) SetAuthToken(v string) *PushOrderRefundRequest {
	s.AuthToken = &v
	return s
}

func (s *PushOrderRefundRequest) SetProductInstanceId(v string) *PushOrderRefundRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PushOrderRefundRequest) SetOutOrderNo(v string) *PushOrderRefundRequest {
	s.OutOrderNo = &v
	return s
}

func (s *PushOrderRefundRequest) SetRefundRequestNo(v string) *PushOrderRefundRequest {
	s.RefundRequestNo = &v
	return s
}

func (s *PushOrderRefundRequest) SetRefundAmount(v int64) *PushOrderRefundRequest {
	s.RefundAmount = &v
	return s
}

func (s *PushOrderRefundRequest) SetRefundReason(v string) *PushOrderRefundRequest {
	s.RefundReason = &v
	return s
}

type PushOrderRefundResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 外部系统传入的退款请求号
	RefundRequestNo *string `json:"refund_request_no,omitempty" xml:"refund_request_no,omitempty"`
	// 退款退分账请求状态， ACCEPT : 受理成功
	RefundStatus *string `json:"refund_status,omitempty" xml:"refund_status,omitempty"`
	// 本次退款退分账唯一标识
	RefundRecordNo *string `json:"refund_record_no,omitempty" xml:"refund_record_no,omitempty"`
}

func (s PushOrderRefundResponse) String() string {
	return tea.Prettify(s)
}

func (s PushOrderRefundResponse) GoString() string {
	return s.String()
}

func (s *PushOrderRefundResponse) SetReqMsgId(v string) *PushOrderRefundResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PushOrderRefundResponse) SetResultCode(v string) *PushOrderRefundResponse {
	s.ResultCode = &v
	return s
}

func (s *PushOrderRefundResponse) SetResultMsg(v string) *PushOrderRefundResponse {
	s.ResultMsg = &v
	return s
}

func (s *PushOrderRefundResponse) SetRefundRequestNo(v string) *PushOrderRefundResponse {
	s.RefundRequestNo = &v
	return s
}

func (s *PushOrderRefundResponse) SetRefundStatus(v string) *PushOrderRefundResponse {
	s.RefundStatus = &v
	return s
}

func (s *PushOrderRefundResponse) SetRefundRecordNo(v string) *PushOrderRefundResponse {
	s.RefundRecordNo = &v
	return s
}

type QueryOrderRefundRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 退款退分账唯一标识
	RefundRecordNo *string `json:"refund_record_no,omitempty" xml:"refund_record_no,omitempty" require:"true"`
}

func (s QueryOrderRefundRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryOrderRefundRequest) GoString() string {
	return s.String()
}

func (s *QueryOrderRefundRequest) SetAuthToken(v string) *QueryOrderRefundRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryOrderRefundRequest) SetProductInstanceId(v string) *QueryOrderRefundRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryOrderRefundRequest) SetRefundRecordNo(v string) *QueryOrderRefundRequest {
	s.RefundRecordNo = &v
	return s
}

type QueryOrderRefundResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 支付交易号
	TradeNo *string `json:"trade_no,omitempty" xml:"trade_no,omitempty"`
	// 外部系统传入的退款请求流水号
	RefundRequestNo *string `json:"refund_request_no,omitempty" xml:"refund_request_no,omitempty"`
	// 退款请求状态
	// ● ACCEPT: 受理成功
	// ● PENDING: 需人工介入
	// ● SUCCESS: 成功
	// ● FAILED : 失败
	RefundStatus *string `json:"refund_status,omitempty" xml:"refund_status,omitempty"`
	// 退款退分账申请金额
	RefundAmount *int64 `json:"refund_amount,omitempty" xml:"refund_amount,omitempty"`
	// 本次退款申请的实际退款金额，单位：分
	// 条件返回：refundStatus=SUCCESS 返回
	SendBackAmount *int64 `json:"send_back_amount,omitempty" xml:"send_back_amount,omitempty"`
	// 退款退分账失败原因，条件返回：refundStatus=FAILED 返回
	RefundFailedReason *string `json:"refund_failed_reason,omitempty" xml:"refund_failed_reason,omitempty"`
	// 退款退分账时间，格式为yyyy-MM-dd HH:mm:ss
	// 条件返回：refundStatus=SUCCESS 返回
	RefundTime *string `json:"refund_time,omitempty" xml:"refund_time,omitempty"`
	// 条件返回：refundStatus=SUCCESS 返回
	// 退分账明细
	RefundDetailItemList []*RefundDetailItemList `json:"refund_detail_item_list,omitempty" xml:"refund_detail_item_list,omitempty" type:"Repeated"`
}

func (s QueryOrderRefundResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryOrderRefundResponse) GoString() string {
	return s.String()
}

func (s *QueryOrderRefundResponse) SetReqMsgId(v string) *QueryOrderRefundResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryOrderRefundResponse) SetResultCode(v string) *QueryOrderRefundResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryOrderRefundResponse) SetResultMsg(v string) *QueryOrderRefundResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryOrderRefundResponse) SetTradeNo(v string) *QueryOrderRefundResponse {
	s.TradeNo = &v
	return s
}

func (s *QueryOrderRefundResponse) SetRefundRequestNo(v string) *QueryOrderRefundResponse {
	s.RefundRequestNo = &v
	return s
}

func (s *QueryOrderRefundResponse) SetRefundStatus(v string) *QueryOrderRefundResponse {
	s.RefundStatus = &v
	return s
}

func (s *QueryOrderRefundResponse) SetRefundAmount(v int64) *QueryOrderRefundResponse {
	s.RefundAmount = &v
	return s
}

func (s *QueryOrderRefundResponse) SetSendBackAmount(v int64) *QueryOrderRefundResponse {
	s.SendBackAmount = &v
	return s
}

func (s *QueryOrderRefundResponse) SetRefundFailedReason(v string) *QueryOrderRefundResponse {
	s.RefundFailedReason = &v
	return s
}

func (s *QueryOrderRefundResponse) SetRefundTime(v string) *QueryOrderRefundResponse {
	s.RefundTime = &v
	return s
}

func (s *QueryOrderRefundResponse) SetRefundDetailItemList(v []*RefundDetailItemList) *QueryOrderRefundResponse {
	s.RefundDetailItemList = v
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
	// 技术租户ID、当开通权益中心产品在非数科的应用租户下时需要填写对应的技术租户ID（涉及到时技术对接时 技术会分配，如未分配则不需要传参数）
	TechTenantId *string `json:"tech_tenant_id,omitempty" xml:"tech_tenant_id,omitempty"`
	// 用户openid
	OpenId *string `json:"open_id,omitempty" xml:"open_id,omitempty"`
	// 应用ID
	AppId *string `json:"app_id,omitempty" xml:"app_id,omitempty"`
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

func (s *SubmitRightsprodGrantRequest) SetTechTenantId(v string) *SubmitRightsprodGrantRequest {
	s.TechTenantId = &v
	return s
}

func (s *SubmitRightsprodGrantRequest) SetOpenId(v string) *SubmitRightsprodGrantRequest {
	s.OpenId = &v
	return s
}

func (s *SubmitRightsprodGrantRequest) SetAppId(v string) *SubmitRightsprodGrantRequest {
	s.AppId = &v
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
	// 技术租户ID、当开通权益中心产品在非数科的应用租户下时需要填写对应的技术租户ID（涉及到时技术对接时 技术会分配，如未分配则不需要传值）
	TechTenantId *string `json:"tech_tenant_id,omitempty" xml:"tech_tenant_id,omitempty"`
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

func (s *QueryRightsprodGrantRequest) SetTechTenantId(v string) *QueryRightsprodGrantRequest {
	s.TechTenantId = &v
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

type BatchqueryRightsprodVoucherRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 券编码（券实例）列表
	VoucherCodeList []*string `json:"voucher_code_list,omitempty" xml:"voucher_code_list,omitempty" require:"true" type:"Repeated"`
}

func (s BatchqueryRightsprodVoucherRequest) String() string {
	return tea.Prettify(s)
}

func (s BatchqueryRightsprodVoucherRequest) GoString() string {
	return s.String()
}

func (s *BatchqueryRightsprodVoucherRequest) SetAuthToken(v string) *BatchqueryRightsprodVoucherRequest {
	s.AuthToken = &v
	return s
}

func (s *BatchqueryRightsprodVoucherRequest) SetProductInstanceId(v string) *BatchqueryRightsprodVoucherRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *BatchqueryRightsprodVoucherRequest) SetVoucherCodeList(v []*string) *BatchqueryRightsprodVoucherRequest {
	s.VoucherCodeList = v
	return s
}

type BatchqueryRightsprodVoucherResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 券基本信息列表
	List []*VoucherBaseInfoVO `json:"list,omitempty" xml:"list,omitempty" type:"Repeated"`
}

func (s BatchqueryRightsprodVoucherResponse) String() string {
	return tea.Prettify(s)
}

func (s BatchqueryRightsprodVoucherResponse) GoString() string {
	return s.String()
}

func (s *BatchqueryRightsprodVoucherResponse) SetReqMsgId(v string) *BatchqueryRightsprodVoucherResponse {
	s.ReqMsgId = &v
	return s
}

func (s *BatchqueryRightsprodVoucherResponse) SetResultCode(v string) *BatchqueryRightsprodVoucherResponse {
	s.ResultCode = &v
	return s
}

func (s *BatchqueryRightsprodVoucherResponse) SetResultMsg(v string) *BatchqueryRightsprodVoucherResponse {
	s.ResultMsg = &v
	return s
}

func (s *BatchqueryRightsprodVoucherResponse) SetList(v []*VoucherBaseInfoVO) *BatchqueryRightsprodVoucherResponse {
	s.List = v
	return s
}

type CallbackRightsprodOperationRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 通知ID(幂等)
	NotifyId *string `json:"notify_id,omitempty" xml:"notify_id,omitempty" require:"true"`
	// 权益编号
	RightsCode *string `json:"rights_code,omitempty" xml:"rights_code,omitempty" require:"true"`
	// 凭证编号
	VoucherCode *string `json:"voucher_code,omitempty" xml:"voucher_code,omitempty" require:"true"`
	// 业务类型
	// V_REFUND（退款）
	// V_EXPIRE（过期）
	// V_INVALID（作废）
	// V_USE（核销）
	// V_PUBLISH（发放）
	BizType *string `json:"biz_type,omitempty" xml:"biz_type,omitempty" require:"true"`
	// 支付订单号（使用和退款 时用于判断是否为重复核销、退款通知）
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

func (s *CallbackRightsprodOperationRequest) SetNotifyId(v string) *CallbackRightsprodOperationRequest {
	s.NotifyId = &v
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

type CallbackRightsprodOperationdataRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 通知ID(幂等)
	NotifyId *string `json:"notify_id,omitempty" xml:"notify_id,omitempty" require:"true"`
	// 供应商供应权益编号
	SupplyRightsCode *string `json:"supply_rights_code,omitempty" xml:"supply_rights_code,omitempty" require:"true"`
	// 凭证编号
	VoucherCode *string `json:"voucher_code,omitempty" xml:"voucher_code,omitempty" require:"true"`
	// 业务类型 V_REFUND（退款） V_EXPIRE（过期） V_INVALID（作废） V_USE（核销） V_PUBLISH（发放）
	BizType *string `json:"biz_type,omitempty" xml:"biz_type,omitempty" require:"true"`
	// 支付订单号（使用和退款 时用于判断是否为重复核销、退款通知）
	PayOrderNo *string `json:"pay_order_no,omitempty" xml:"pay_order_no,omitempty"`
	// 券面额
	FaceAmount *string `json:"face_amount,omitempty" xml:"face_amount,omitempty"`
	// 流通金额（核销、退款时 金额）
	FluxAmount *string `json:"flux_amount,omitempty" xml:"flux_amount,omitempty"`
	// 业务发生时间
	BizTime *string `json:"biz_time,omitempty" xml:"biz_time,omitempty" require:"true"`
	// 业务扩展属性信息
	ExtInfo *string `json:"ext_info,omitempty" xml:"ext_info,omitempty"`
}

func (s CallbackRightsprodOperationdataRequest) String() string {
	return tea.Prettify(s)
}

func (s CallbackRightsprodOperationdataRequest) GoString() string {
	return s.String()
}

func (s *CallbackRightsprodOperationdataRequest) SetAuthToken(v string) *CallbackRightsprodOperationdataRequest {
	s.AuthToken = &v
	return s
}

func (s *CallbackRightsprodOperationdataRequest) SetProductInstanceId(v string) *CallbackRightsprodOperationdataRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CallbackRightsprodOperationdataRequest) SetNotifyId(v string) *CallbackRightsprodOperationdataRequest {
	s.NotifyId = &v
	return s
}

func (s *CallbackRightsprodOperationdataRequest) SetSupplyRightsCode(v string) *CallbackRightsprodOperationdataRequest {
	s.SupplyRightsCode = &v
	return s
}

func (s *CallbackRightsprodOperationdataRequest) SetVoucherCode(v string) *CallbackRightsprodOperationdataRequest {
	s.VoucherCode = &v
	return s
}

func (s *CallbackRightsprodOperationdataRequest) SetBizType(v string) *CallbackRightsprodOperationdataRequest {
	s.BizType = &v
	return s
}

func (s *CallbackRightsprodOperationdataRequest) SetPayOrderNo(v string) *CallbackRightsprodOperationdataRequest {
	s.PayOrderNo = &v
	return s
}

func (s *CallbackRightsprodOperationdataRequest) SetFaceAmount(v string) *CallbackRightsprodOperationdataRequest {
	s.FaceAmount = &v
	return s
}

func (s *CallbackRightsprodOperationdataRequest) SetFluxAmount(v string) *CallbackRightsprodOperationdataRequest {
	s.FluxAmount = &v
	return s
}

func (s *CallbackRightsprodOperationdataRequest) SetBizTime(v string) *CallbackRightsprodOperationdataRequest {
	s.BizTime = &v
	return s
}

func (s *CallbackRightsprodOperationdataRequest) SetExtInfo(v string) *CallbackRightsprodOperationdataRequest {
	s.ExtInfo = &v
	return s
}

type CallbackRightsprodOperationdataResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 同步结果 success 为同步成功其他均为失败
	Result *string `json:"result,omitempty" xml:"result,omitempty"`
}

func (s CallbackRightsprodOperationdataResponse) String() string {
	return tea.Prettify(s)
}

func (s CallbackRightsprodOperationdataResponse) GoString() string {
	return s.String()
}

func (s *CallbackRightsprodOperationdataResponse) SetReqMsgId(v string) *CallbackRightsprodOperationdataResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CallbackRightsprodOperationdataResponse) SetResultCode(v string) *CallbackRightsprodOperationdataResponse {
	s.ResultCode = &v
	return s
}

func (s *CallbackRightsprodOperationdataResponse) SetResultMsg(v string) *CallbackRightsprodOperationdataResponse {
	s.ResultMsg = &v
	return s
}

func (s *CallbackRightsprodOperationdataResponse) SetResult(v string) *CallbackRightsprodOperationdataResponse {
	s.Result = &v
	return s
}

type QueryRightsprodVoucherRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 权益编码
	RightsCode *string `json:"rights_code,omitempty" xml:"rights_code,omitempty" require:"true"`
	// 券实例编码
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

func (s *QueryRightsprodVoucherRequest) SetRightsCode(v string) *QueryRightsprodVoucherRequest {
	s.RightsCode = &v
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
	// 权益编码
	RightsCode *string `json:"rights_code,omitempty" xml:"rights_code,omitempty"`
	// 权益名称
	RightsName *string `json:"rights_name,omitempty" xml:"rights_name,omitempty"`
	// 券实例编码
	VoucherCode *string `json:"voucher_code,omitempty" xml:"voucher_code,omitempty"`
	// 券状态
	// WAIT_EFFECT：待生效
	// WAIT_VERIFY：待核销
	// EXPIRED：已过期
	// VERIFY_SUCCESS：核销成功（已核销）
	// INVALID：已失效
	// 公域场景下只会包含以上五种状态，私域场景会包含下方状态基
	// FREEZE：已冻结
	// VERIFYING：核销处理中
	// VERIFY_FAIL：核销失败
	// VERIFY_CANCELING：核销撤销中
	// NO_NEED_VERIFY：无需核销
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

func (s *QueryRightsprodVoucherResponse) SetRightsCode(v string) *QueryRightsprodVoucherResponse {
	s.RightsCode = &v
	return s
}

func (s *QueryRightsprodVoucherResponse) SetRightsName(v string) *QueryRightsprodVoucherResponse {
	s.RightsName = &v
	return s
}

func (s *QueryRightsprodVoucherResponse) SetVoucherCode(v string) *QueryRightsprodVoucherResponse {
	s.VoucherCode = &v
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
				"sdk_version":      tea.String("1.3.15"),
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

// Description:
//
// Description: 支付+分账订单推送(创建)
//
// Summary: 支付+分账订单推送(创建)
func (client *Client) PushOrderSettlement(request *PushOrderSettlementRequest) (_result *PushOrderSettlementResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PushOrderSettlementResponse{}
	_body, _err := client.PushOrderSettlementEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 支付+分账订单推送(创建)
//
// Summary: 支付+分账订单推送(创建)
func (client *Client) PushOrderSettlementEx(request *PushOrderSettlementRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PushOrderSettlementResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PushOrderSettlementResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.gesaas.order.settlement.push"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 订单结果查询(支付+分账)
//
// Summary: 订单结果查询(支付+分账)
func (client *Client) QueryOrderSettlement(request *QueryOrderSettlementRequest) (_result *QueryOrderSettlementResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryOrderSettlementResponse{}
	_body, _err := client.QueryOrderSettlementEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 订单结果查询(支付+分账)
//
// Summary: 订单结果查询(支付+分账)
func (client *Client) QueryOrderSettlementEx(request *QueryOrderSettlementRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryOrderSettlementResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryOrderSettlementResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.gesaas.order.settlement.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 退分账接口(废弃)
//
// Summary: 退分账接口(废弃)
func (client *Client) WithdrawOrderSettlement(request *WithdrawOrderSettlementRequest) (_result *WithdrawOrderSettlementResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &WithdrawOrderSettlementResponse{}
	_body, _err := client.WithdrawOrderSettlementEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 退分账接口(废弃)
//
// Summary: 退分账接口(废弃)
func (client *Client) WithdrawOrderSettlementEx(request *WithdrawOrderSettlementRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *WithdrawOrderSettlementResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &WithdrawOrderSettlementResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.gesaas.order.settlement.withdraw"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 退分账查询接口(废弃)
//
// Summary: 退分账查询接口(废弃)
func (client *Client) QueryOrderWithdraw(request *QueryOrderWithdrawRequest) (_result *QueryOrderWithdrawResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryOrderWithdrawResponse{}
	_body, _err := client.QueryOrderWithdrawEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 退分账查询接口(废弃)
//
// Summary: 退分账查询接口(废弃)
func (client *Client) QueryOrderWithdrawEx(request *QueryOrderWithdrawRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryOrderWithdrawResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryOrderWithdrawResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.gesaas.order.withdraw.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 退款退分账发起(创建)
//
// Summary: 退款退分账发起(创建)
func (client *Client) PushOrderRefund(request *PushOrderRefundRequest) (_result *PushOrderRefundResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PushOrderRefundResponse{}
	_body, _err := client.PushOrderRefundEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 退款退分账发起(创建)
//
// Summary: 退款退分账发起(创建)
func (client *Client) PushOrderRefundEx(request *PushOrderRefundRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PushOrderRefundResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PushOrderRefundResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.gesaas.order.refund.push"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 退款退分账查询
//
// Summary: 退款退分账查询
func (client *Client) QueryOrderRefund(request *QueryOrderRefundRequest) (_result *QueryOrderRefundResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryOrderRefundResponse{}
	_body, _err := client.QueryOrderRefundEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 退款退分账查询
//
// Summary: 退款退分账查询
func (client *Client) QueryOrderRefundEx(request *QueryOrderRefundRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryOrderRefundResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryOrderRefundResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.gesaas.order.refund.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 品牌会员签约鉴权产品链路风控鉴权
//
// Summary: 风控鉴权
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

// Description:
//
// Description: 品牌会员签约鉴权产品链路风控鉴权
//
// Summary: 风控鉴权
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

// Description:
//
// Description: 权益中心权益发放
//
// Summary: 权益中心权益发放
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

// Description:
//
// Description: 权益中心权益发放
//
// Summary: 权益中心权益发放
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

// Description:
//
// Description: 权益发放结果查询
//
// Summary: 权益发放结果查询
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

// Description:
//
// Description: 权益发放结果查询
//
// Summary: 权益发放结果查询
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

// Description:
//
// Description: 券基本信息批量查询
//
// Summary: 券基本信息批量查询
func (client *Client) BatchqueryRightsprodVoucher(request *BatchqueryRightsprodVoucherRequest) (_result *BatchqueryRightsprodVoucherResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &BatchqueryRightsprodVoucherResponse{}
	_body, _err := client.BatchqueryRightsprodVoucherEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 券基本信息批量查询
//
// Summary: 券基本信息批量查询
func (client *Client) BatchqueryRightsprodVoucherEx(request *BatchqueryRightsprodVoucherRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *BatchqueryRightsprodVoucherResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &BatchqueryRightsprodVoucherResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.gesaas.rightsprod.voucher.batchquery"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 权益中心数据流回调 API
//
// Summary: 权益中心数据流回调 API
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
// Description: 权益中心数据流回调 API
//
// Summary: 权益中心数据流回调 API
func (client *Client) CallbackRightsprodOperationEx(request *CallbackRightsprodOperationRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CallbackRightsprodOperationResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CallbackRightsprodOperationResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.gesaas.rightsprod.operation.callback"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 权益中心API
//
// Summary: 权益中心API
func (client *Client) CallbackRightsprodOperationdata(request *CallbackRightsprodOperationdataRequest) (_result *CallbackRightsprodOperationdataResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CallbackRightsprodOperationdataResponse{}
	_body, _err := client.CallbackRightsprodOperationdataEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 权益中心API
//
// Summary: 权益中心API
func (client *Client) CallbackRightsprodOperationdataEx(request *CallbackRightsprodOperationdataRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CallbackRightsprodOperationdataResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CallbackRightsprodOperationdataResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.gesaas.rightsprod.operationdata.callback"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 券实例信息查询
//
// Summary: 券实例信息查询
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
// Description: 券实例信息查询
//
// Summary: 券实例信息查询
func (client *Client) QueryRightsprodVoucherEx(request *QueryRightsprodVoucherRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryRightsprodVoucherResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryRightsprodVoucherResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.gesaas.rightsprod.voucher.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
