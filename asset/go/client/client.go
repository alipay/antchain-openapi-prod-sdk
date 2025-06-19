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

// 子指标结构体
type SubMetricData struct {
	// 日期
	Date *string `json:"date,omitempty" xml:"date,omitempty" require:"true"`
	// 指标类型:OPERATING_INCOME, REPAY_AMOUNT, REPAY_NUMBER, REPAY_USER_NUMBER, REPAY_AVG_AMOUNT, ALI_DST_AMT,OPERATING_COST, GROSS_PROFIT_MARGIN,VOUCHER_CONVERSION, USER_CONVERSION
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 指标值
	Value *string `json:"value,omitempty" xml:"value,omitempty" require:"true"`
}

func (s SubMetricData) String() string {
	return tea.Prettify(s)
}

func (s SubMetricData) GoString() string {
	return s.String()
}

func (s *SubMetricData) SetDate(v string) *SubMetricData {
	s.Date = &v
	return s
}

func (s *SubMetricData) SetType(v string) *SubMetricData {
	s.Type = &v
	return s
}

func (s *SubMetricData) SetValue(v string) *SubMetricData {
	s.Value = &v
	return s
}

// 交易区间数据
type TradeRangeData struct {
	// 区间开始
	Start *string `json:"start,omitempty" xml:"start,omitempty" require:"true"`
	// 区间结束
	End *string `json:"end,omitempty" xml:"end,omitempty" require:"true"`
	// 区间内统计值
	Value *int64 `json:"value,omitempty" xml:"value,omitempty" require:"true"`
	// 百分比
	Rate *string `json:"rate,omitempty" xml:"rate,omitempty" require:"true"`
}

func (s TradeRangeData) String() string {
	return tea.Prettify(s)
}

func (s TradeRangeData) GoString() string {
	return s.String()
}

func (s *TradeRangeData) SetStart(v string) *TradeRangeData {
	s.Start = &v
	return s
}

func (s *TradeRangeData) SetEnd(v string) *TradeRangeData {
	s.End = &v
	return s
}

func (s *TradeRangeData) SetValue(v int64) *TradeRangeData {
	s.Value = &v
	return s
}

func (s *TradeRangeData) SetRate(v string) *TradeRangeData {
	s.Rate = &v
	return s
}

// 机构趋势数据
type OrgTrendData struct {
	// 日期
	Date *string `json:"date,omitempty" xml:"date,omitempty" require:"true"`
	// 还款金额
	RepaymentAmt *string `json:"repayment_amt,omitempty" xml:"repayment_amt,omitempty" require:"true"`
	// 预算金额
	BudgetAmt *string `json:"budget_amt,omitempty" xml:"budget_amt,omitempty" require:"true"`
	// 交易金额
	TradeAmt *string `json:"trade_amt,omitempty" xml:"trade_amt,omitempty" require:"true"`
}

func (s OrgTrendData) String() string {
	return tea.Prettify(s)
}

func (s OrgTrendData) GoString() string {
	return s.String()
}

func (s *OrgTrendData) SetDate(v string) *OrgTrendData {
	s.Date = &v
	return s
}

func (s *OrgTrendData) SetRepaymentAmt(v string) *OrgTrendData {
	s.RepaymentAmt = &v
	return s
}

func (s *OrgTrendData) SetBudgetAmt(v string) *OrgTrendData {
	s.BudgetAmt = &v
	return s
}

func (s *OrgTrendData) SetTradeAmt(v string) *OrgTrendData {
	s.TradeAmt = &v
	return s
}

// 查询数据统计指标结果
type MetricData struct {
	// 租户指标: OPERATING_INCOME, REPAY_AMOUNT, REPAY_NUMBER, REPAY_USER_NUMBER, REPAY_AVG_AMOUNT, ALI_DST_AMT
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 指标值
	Total *string `json:"total,omitempty" xml:"total,omitempty" require:"true"`
	// 子指标列表
	SubList []*SubMetricData `json:"sub_list,omitempty" xml:"sub_list,omitempty" require:"true" type:"Repeated"`
}

func (s MetricData) String() string {
	return tea.Prettify(s)
}

func (s MetricData) GoString() string {
	return s.String()
}

func (s *MetricData) SetType(v string) *MetricData {
	s.Type = &v
	return s
}

func (s *MetricData) SetTotal(v string) *MetricData {
	s.Total = &v
	return s
}

func (s *MetricData) SetSubList(v []*SubMetricData) *MetricData {
	s.SubList = v
	return s
}

// 转化统计数据
type ConversionData struct {
	// 渠道
	Channel *string `json:"channel,omitempty" xml:"channel,omitempty" require:"true"`
	// 投放人数
	SendCnt *int64 `json:"send_cnt,omitempty" xml:"send_cnt,omitempty" require:"true"`
	// 核销人数
	UseCnt *int64 `json:"use_cnt,omitempty" xml:"use_cnt,omitempty" require:"true"`
	// 核销率
	UseRate *string `json:"use_rate,omitempty" xml:"use_rate,omitempty" require:"true"`
}

func (s ConversionData) String() string {
	return tea.Prettify(s)
}

func (s ConversionData) GoString() string {
	return s.String()
}

func (s *ConversionData) SetChannel(v string) *ConversionData {
	s.Channel = &v
	return s
}

func (s *ConversionData) SetSendCnt(v int64) *ConversionData {
	s.SendCnt = &v
	return s
}

func (s *ConversionData) SetUseCnt(v int64) *ConversionData {
	s.UseCnt = &v
	return s
}

func (s *ConversionData) SetUseRate(v string) *ConversionData {
	s.UseRate = &v
	return s
}

// 还款回调结果数据
type RepayCallBackResData struct {
	// 状态
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
}

func (s RepayCallBackResData) String() string {
	return tea.Prettify(s)
}

func (s RepayCallBackResData) GoString() string {
	return s.String()
}

func (s *RepayCallBackResData) SetStatus(v string) *RepayCallBackResData {
	s.Status = &v
	return s
}

// 供应商打款记录
type PaymentRecord struct {
	// 云上租户id
	CloudTenantId *string `json:"cloud_tenant_id,omitempty" xml:"cloud_tenant_id,omitempty" require:"true"`
	// 打款金额，单位分
	PaymentAmount *int64 `json:"payment_amount,omitempty" xml:"payment_amount,omitempty" require:"true"`
	// 服务商名称 - 即云租户名称，比如南京飞翰
	SupplierName *string `json:"supplier_name,omitempty" xml:"supplier_name,omitempty" require:"true"`
	// 打款日期
	PaymentDate *string `json:"payment_date,omitempty" xml:"payment_date,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 唯一请求id，即payment_record_id
	RequestUniqueId *string `json:"request_unique_id,omitempty" xml:"request_unique_id,omitempty" require:"true"`
}

func (s PaymentRecord) String() string {
	return tea.Prettify(s)
}

func (s PaymentRecord) GoString() string {
	return s.String()
}

func (s *PaymentRecord) SetCloudTenantId(v string) *PaymentRecord {
	s.CloudTenantId = &v
	return s
}

func (s *PaymentRecord) SetPaymentAmount(v int64) *PaymentRecord {
	s.PaymentAmount = &v
	return s
}

func (s *PaymentRecord) SetSupplierName(v string) *PaymentRecord {
	s.SupplierName = &v
	return s
}

func (s *PaymentRecord) SetPaymentDate(v string) *PaymentRecord {
	s.PaymentDate = &v
	return s
}

func (s *PaymentRecord) SetRequestUniqueId(v string) *PaymentRecord {
	s.RequestUniqueId = &v
	return s
}

// 机构总览数据
type OrgOverviewData struct {
	// 预算总金额
	TotalBudgetAmt *string `json:"total_budget_amt,omitempty" xml:"total_budget_amt,omitempty" require:"true"`
	// 花呗预算金额
	HuabeiBudgetAmt *string `json:"huabei_budget_amt,omitempty" xml:"huabei_budget_amt,omitempty" require:"true"`
	// 借呗预算金额
	JiebeiBudgetAmt *string `json:"jiebei_budget_amt,omitempty" xml:"jiebei_budget_amt,omitempty" require:"true"`
	// 小微预算金额
	XiaoweiBudgetAmt *string `json:"xiaowei_budget_amt,omitempty" xml:"xiaowei_budget_amt,omitempty" require:"true"`
	// 服务费预算金额
	ServiceBudgetAmt *string `json:"service_budget_amt,omitempty" xml:"service_budget_amt,omitempty" require:"true"`
	// 总回款金额
	TotalRepaymentAmt *string `json:"total_repayment_amt,omitempty" xml:"total_repayment_amt,omitempty" require:"true"`
	// 花呗回款金额
	HuabeiRepaymentAmt *string `json:"huabei_repayment_amt,omitempty" xml:"huabei_repayment_amt,omitempty" require:"true"`
	// 借呗回款金额
	JiebeiRepaymentAmt *string `json:"jiebei_repayment_amt,omitempty" xml:"jiebei_repayment_amt,omitempty" require:"true"`
	// 小微回款金额
	XiaoweiRepaymentAmt *string `json:"xiaowei_repayment_amt,omitempty" xml:"xiaowei_repayment_amt,omitempty" require:"true"`
	// 总交易金额
	TotalTradeAmt *string `json:"total_trade_amt,omitempty" xml:"total_trade_amt,omitempty" require:"true"`
	// 花呗交易金额
	HuabeiTradeAmt *string `json:"huabei_trade_amt,omitempty" xml:"huabei_trade_amt,omitempty" require:"true"`
	// 借呗交易金额
	JiebeiTradeAmt *string `json:"jiebei_trade_amt,omitempty" xml:"jiebei_trade_amt,omitempty" require:"true"`
	// 小微交易金额
	XiaoweiTradeAmt *string `json:"xiaowei_trade_amt,omitempty" xml:"xiaowei_trade_amt,omitempty" require:"true"`
	// 内部补贴金额
	InternalSubsidyAmt *string `json:"internal_subsidy_amt,omitempty" xml:"internal_subsidy_amt,omitempty" require:"true"`
	// 净回款额
	TotalNetRepaymentAmt *string `json:"total_net_repayment_amt,omitempty" xml:"total_net_repayment_amt,omitempty" require:"true"`
	// 活动roi
	ActivityRoi *string `json:"activity_roi,omitempty" xml:"activity_roi,omitempty" require:"true"`
}

func (s OrgOverviewData) String() string {
	return tea.Prettify(s)
}

func (s OrgOverviewData) GoString() string {
	return s.String()
}

func (s *OrgOverviewData) SetTotalBudgetAmt(v string) *OrgOverviewData {
	s.TotalBudgetAmt = &v
	return s
}

func (s *OrgOverviewData) SetHuabeiBudgetAmt(v string) *OrgOverviewData {
	s.HuabeiBudgetAmt = &v
	return s
}

func (s *OrgOverviewData) SetJiebeiBudgetAmt(v string) *OrgOverviewData {
	s.JiebeiBudgetAmt = &v
	return s
}

func (s *OrgOverviewData) SetXiaoweiBudgetAmt(v string) *OrgOverviewData {
	s.XiaoweiBudgetAmt = &v
	return s
}

func (s *OrgOverviewData) SetServiceBudgetAmt(v string) *OrgOverviewData {
	s.ServiceBudgetAmt = &v
	return s
}

func (s *OrgOverviewData) SetTotalRepaymentAmt(v string) *OrgOverviewData {
	s.TotalRepaymentAmt = &v
	return s
}

func (s *OrgOverviewData) SetHuabeiRepaymentAmt(v string) *OrgOverviewData {
	s.HuabeiRepaymentAmt = &v
	return s
}

func (s *OrgOverviewData) SetJiebeiRepaymentAmt(v string) *OrgOverviewData {
	s.JiebeiRepaymentAmt = &v
	return s
}

func (s *OrgOverviewData) SetXiaoweiRepaymentAmt(v string) *OrgOverviewData {
	s.XiaoweiRepaymentAmt = &v
	return s
}

func (s *OrgOverviewData) SetTotalTradeAmt(v string) *OrgOverviewData {
	s.TotalTradeAmt = &v
	return s
}

func (s *OrgOverviewData) SetHuabeiTradeAmt(v string) *OrgOverviewData {
	s.HuabeiTradeAmt = &v
	return s
}

func (s *OrgOverviewData) SetJiebeiTradeAmt(v string) *OrgOverviewData {
	s.JiebeiTradeAmt = &v
	return s
}

func (s *OrgOverviewData) SetXiaoweiTradeAmt(v string) *OrgOverviewData {
	s.XiaoweiTradeAmt = &v
	return s
}

func (s *OrgOverviewData) SetInternalSubsidyAmt(v string) *OrgOverviewData {
	s.InternalSubsidyAmt = &v
	return s
}

func (s *OrgOverviewData) SetTotalNetRepaymentAmt(v string) *OrgOverviewData {
	s.TotalNetRepaymentAmt = &v
	return s
}

func (s *OrgOverviewData) SetActivityRoi(v string) *OrgOverviewData {
	s.ActivityRoi = &v
	return s
}

// 过程转化指标结果
type ProcessConversionMetricData struct {
	// 发放数
	Send *int64 `json:"send,omitempty" xml:"send,omitempty" require:"true"`
	// 核销数
	Used *int64 `json:"used,omitempty" xml:"used,omitempty" require:"true"`
	// 核销转化率
	Rate *string `json:"rate,omitempty" xml:"rate,omitempty" require:"true"`
}

func (s ProcessConversionMetricData) String() string {
	return tea.Prettify(s)
}

func (s ProcessConversionMetricData) GoString() string {
	return s.String()
}

func (s *ProcessConversionMetricData) SetSend(v int64) *ProcessConversionMetricData {
	s.Send = &v
	return s
}

func (s *ProcessConversionMetricData) SetUsed(v int64) *ProcessConversionMetricData {
	s.Used = &v
	return s
}

func (s *ProcessConversionMetricData) SetRate(v string) *ProcessConversionMetricData {
	s.Rate = &v
	return s
}

// 核销明细月文件
type BenefitWriteOffMonthFileData struct {
	// 所属月份
	BillingMonth *string `json:"billing_month,omitempty" xml:"billing_month,omitempty" require:"true"`
	// AFTS 上传到文件 id
	FileFiledId *string `json:"file_filed_id,omitempty" xml:"file_filed_id,omitempty" require:"true"`
}

func (s BenefitWriteOffMonthFileData) String() string {
	return tea.Prettify(s)
}

func (s BenefitWriteOffMonthFileData) GoString() string {
	return s.String()
}

func (s *BenefitWriteOffMonthFileData) SetBillingMonth(v string) *BenefitWriteOffMonthFileData {
	s.BillingMonth = &v
	return s
}

func (s *BenefitWriteOffMonthFileData) SetFileFiledId(v string) *BenefitWriteOffMonthFileData {
	s.FileFiledId = &v
	return s
}

type QuerySupplierMonthwriteofffileRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 云站租户 id
	CloudTenantId *string `json:"cloud_tenant_id,omitempty" xml:"cloud_tenant_id,omitempty" require:"true"`
	// 请求唯一id
	//
	RequestUniqueId *string `json:"request_unique_id,omitempty" xml:"request_unique_id,omitempty"`
	// 202408
	BillingMonth *string `json:"billing_month,omitempty" xml:"billing_month,omitempty"`
}

func (s QuerySupplierMonthwriteofffileRequest) String() string {
	return tea.Prettify(s)
}

func (s QuerySupplierMonthwriteofffileRequest) GoString() string {
	return s.String()
}

func (s *QuerySupplierMonthwriteofffileRequest) SetAuthToken(v string) *QuerySupplierMonthwriteofffileRequest {
	s.AuthToken = &v
	return s
}

func (s *QuerySupplierMonthwriteofffileRequest) SetProductInstanceId(v string) *QuerySupplierMonthwriteofffileRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QuerySupplierMonthwriteofffileRequest) SetCloudTenantId(v string) *QuerySupplierMonthwriteofffileRequest {
	s.CloudTenantId = &v
	return s
}

func (s *QuerySupplierMonthwriteofffileRequest) SetRequestUniqueId(v string) *QuerySupplierMonthwriteofffileRequest {
	s.RequestUniqueId = &v
	return s
}

func (s *QuerySupplierMonthwriteofffileRequest) SetBillingMonth(v string) *QuerySupplierMonthwriteofffileRequest {
	s.BillingMonth = &v
	return s
}

type QuerySupplierMonthwriteofffileResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 月度核销文件列表
	Data []*BenefitWriteOffMonthFileData `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
}

func (s QuerySupplierMonthwriteofffileResponse) String() string {
	return tea.Prettify(s)
}

func (s QuerySupplierMonthwriteofffileResponse) GoString() string {
	return s.String()
}

func (s *QuerySupplierMonthwriteofffileResponse) SetReqMsgId(v string) *QuerySupplierMonthwriteofffileResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QuerySupplierMonthwriteofffileResponse) SetResultCode(v string) *QuerySupplierMonthwriteofffileResponse {
	s.ResultCode = &v
	return s
}

func (s *QuerySupplierMonthwriteofffileResponse) SetResultMsg(v string) *QuerySupplierMonthwriteofffileResponse {
	s.ResultMsg = &v
	return s
}

func (s *QuerySupplierMonthwriteofffileResponse) SetData(v []*BenefitWriteOffMonthFileData) *QuerySupplierMonthwriteofffileResponse {
	s.Data = v
	return s
}

type QuerySupplierFundamtRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 请求唯一id
	//
	RequestUniqueId *string `json:"request_unique_id,omitempty" xml:"request_unique_id,omitempty"`
	// 云站供应商 租户 id
	CloudTenantId *string `json:"cloud_tenant_id,omitempty" xml:"cloud_tenant_id,omitempty" require:"true"`
}

func (s QuerySupplierFundamtRequest) String() string {
	return tea.Prettify(s)
}

func (s QuerySupplierFundamtRequest) GoString() string {
	return s.String()
}

func (s *QuerySupplierFundamtRequest) SetAuthToken(v string) *QuerySupplierFundamtRequest {
	s.AuthToken = &v
	return s
}

func (s *QuerySupplierFundamtRequest) SetProductInstanceId(v string) *QuerySupplierFundamtRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QuerySupplierFundamtRequest) SetRequestUniqueId(v string) *QuerySupplierFundamtRequest {
	s.RequestUniqueId = &v
	return s
}

func (s *QuerySupplierFundamtRequest) SetCloudTenantId(v string) *QuerySupplierFundamtRequest {
	s.CloudTenantId = &v
	return s
}

type QuerySupplierFundamtResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 出资账户
	FundAccount *string `json:"fund_account,omitempty" xml:"fund_account,omitempty"`
	// 核销金额
	WriteOffAmount *int64 `json:"write_off_amount,omitempty" xml:"write_off_amount,omitempty"`
	// 供应商被占用总金额，单位分
	TotalAmount *int64 `json:"total_amount,omitempty" xml:"total_amount,omitempty"`
}

func (s QuerySupplierFundamtResponse) String() string {
	return tea.Prettify(s)
}

func (s QuerySupplierFundamtResponse) GoString() string {
	return s.String()
}

func (s *QuerySupplierFundamtResponse) SetReqMsgId(v string) *QuerySupplierFundamtResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QuerySupplierFundamtResponse) SetResultCode(v string) *QuerySupplierFundamtResponse {
	s.ResultCode = &v
	return s
}

func (s *QuerySupplierFundamtResponse) SetResultMsg(v string) *QuerySupplierFundamtResponse {
	s.ResultMsg = &v
	return s
}

func (s *QuerySupplierFundamtResponse) SetFundAccount(v string) *QuerySupplierFundamtResponse {
	s.FundAccount = &v
	return s
}

func (s *QuerySupplierFundamtResponse) SetWriteOffAmount(v int64) *QuerySupplierFundamtResponse {
	s.WriteOffAmount = &v
	return s
}

func (s *QuerySupplierFundamtResponse) SetTotalAmount(v int64) *QuerySupplierFundamtResponse {
	s.TotalAmount = &v
	return s
}

type AddSupplierPaymentRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 打款记录集
	PaymentRecords []*PaymentRecord `json:"payment_records,omitempty" xml:"payment_records,omitempty" require:"true" type:"Repeated"`
}

func (s AddSupplierPaymentRequest) String() string {
	return tea.Prettify(s)
}

func (s AddSupplierPaymentRequest) GoString() string {
	return s.String()
}

func (s *AddSupplierPaymentRequest) SetAuthToken(v string) *AddSupplierPaymentRequest {
	s.AuthToken = &v
	return s
}

func (s *AddSupplierPaymentRequest) SetProductInstanceId(v string) *AddSupplierPaymentRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *AddSupplierPaymentRequest) SetPaymentRecords(v []*PaymentRecord) *AddSupplierPaymentRequest {
	s.PaymentRecords = v
	return s
}

type AddSupplierPaymentResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 添加打款记录成功
	Data *bool `json:"data,omitempty" xml:"data,omitempty"`
}

func (s AddSupplierPaymentResponse) String() string {
	return tea.Prettify(s)
}

func (s AddSupplierPaymentResponse) GoString() string {
	return s.String()
}

func (s *AddSupplierPaymentResponse) SetReqMsgId(v string) *AddSupplierPaymentResponse {
	s.ReqMsgId = &v
	return s
}

func (s *AddSupplierPaymentResponse) SetResultCode(v string) *AddSupplierPaymentResponse {
	s.ResultCode = &v
	return s
}

func (s *AddSupplierPaymentResponse) SetResultMsg(v string) *AddSupplierPaymentResponse {
	s.ResultMsg = &v
	return s
}

func (s *AddSupplierPaymentResponse) SetData(v bool) *AddSupplierPaymentResponse {
	s.Data = &v
	return s
}

type CallbackOrgoperationRepayRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 还款编号
	RepayRecordNo *string `json:"repay_record_no,omitempty" xml:"repay_record_no,omitempty" require:"true"`
	// 状态
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 扩展属性
	ExtInfo *string `json:"ext_info,omitempty" xml:"ext_info,omitempty"`
	// 请求唯一id，最长32字符
	RequestUniqueId *string `json:"request_unique_id,omitempty" xml:"request_unique_id,omitempty" require:"true"`
}

func (s CallbackOrgoperationRepayRequest) String() string {
	return tea.Prettify(s)
}

func (s CallbackOrgoperationRepayRequest) GoString() string {
	return s.String()
}

func (s *CallbackOrgoperationRepayRequest) SetAuthToken(v string) *CallbackOrgoperationRepayRequest {
	s.AuthToken = &v
	return s
}

func (s *CallbackOrgoperationRepayRequest) SetProductInstanceId(v string) *CallbackOrgoperationRepayRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CallbackOrgoperationRepayRequest) SetTenantId(v string) *CallbackOrgoperationRepayRequest {
	s.TenantId = &v
	return s
}

func (s *CallbackOrgoperationRepayRequest) SetRepayRecordNo(v string) *CallbackOrgoperationRepayRequest {
	s.RepayRecordNo = &v
	return s
}

func (s *CallbackOrgoperationRepayRequest) SetStatus(v string) *CallbackOrgoperationRepayRequest {
	s.Status = &v
	return s
}

func (s *CallbackOrgoperationRepayRequest) SetExtInfo(v string) *CallbackOrgoperationRepayRequest {
	s.ExtInfo = &v
	return s
}

func (s *CallbackOrgoperationRepayRequest) SetRequestUniqueId(v string) *CallbackOrgoperationRepayRequest {
	s.RequestUniqueId = &v
	return s
}

type CallbackOrgoperationRepayResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 还款回调处理状态
	Data *RepayCallBackResData `json:"data,omitempty" xml:"data,omitempty"`
}

func (s CallbackOrgoperationRepayResponse) String() string {
	return tea.Prettify(s)
}

func (s CallbackOrgoperationRepayResponse) GoString() string {
	return s.String()
}

func (s *CallbackOrgoperationRepayResponse) SetReqMsgId(v string) *CallbackOrgoperationRepayResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CallbackOrgoperationRepayResponse) SetResultCode(v string) *CallbackOrgoperationRepayResponse {
	s.ResultCode = &v
	return s
}

func (s *CallbackOrgoperationRepayResponse) SetResultMsg(v string) *CallbackOrgoperationRepayResponse {
	s.ResultMsg = &v
	return s
}

func (s *CallbackOrgoperationRepayResponse) SetData(v *RepayCallBackResData) *CallbackOrgoperationRepayResponse {
	s.Data = v
	return s
}

type QueryStatisticsBudgetRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户id
	//
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 请求唯一id
	RequestUniqueId *string `json:"request_unique_id,omitempty" xml:"request_unique_id,omitempty"`
}

func (s QueryStatisticsBudgetRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryStatisticsBudgetRequest) GoString() string {
	return s.String()
}

func (s *QueryStatisticsBudgetRequest) SetAuthToken(v string) *QueryStatisticsBudgetRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryStatisticsBudgetRequest) SetProductInstanceId(v string) *QueryStatisticsBudgetRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryStatisticsBudgetRequest) SetTenantId(v string) *QueryStatisticsBudgetRequest {
	s.TenantId = &v
	return s
}

func (s *QueryStatisticsBudgetRequest) SetRequestUniqueId(v string) *QueryStatisticsBudgetRequest {
	s.RequestUniqueId = &v
	return s
}

type QueryStatisticsBudgetResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 当前租户总预算金额
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QueryStatisticsBudgetResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryStatisticsBudgetResponse) GoString() string {
	return s.String()
}

func (s *QueryStatisticsBudgetResponse) SetReqMsgId(v string) *QueryStatisticsBudgetResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryStatisticsBudgetResponse) SetResultCode(v string) *QueryStatisticsBudgetResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryStatisticsBudgetResponse) SetResultMsg(v string) *QueryStatisticsBudgetResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryStatisticsBudgetResponse) SetData(v string) *QueryStatisticsBudgetResponse {
	s.Data = &v
	return s
}

type QueryStatisticsMetricsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 请求唯一id
	RequestUniqueId *string `json:"request_unique_id,omitempty" xml:"request_unique_id,omitempty"`
	// 租户指标: OPERATING_INCOME, REPAY_AMOUNT, REPAY_NUMBER, REPAY_USER_NUMBER, REPAY_AVG_AMOUNT, ALI_DST_AMT
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 查询开始时间: DAY:20240911; MONTH:202409
	StartDate *string `json:"start_date,omitempty" xml:"start_date,omitempty" require:"true"`
	// 查询结束日期
	EndDate *string `json:"end_date,omitempty" xml:"end_date,omitempty" require:"true"`
	// 日期单位: DAY,MONTH
	DateUnit *string `json:"date_unit,omitempty" xml:"date_unit,omitempty" require:"true"`
}

func (s QueryStatisticsMetricsRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryStatisticsMetricsRequest) GoString() string {
	return s.String()
}

func (s *QueryStatisticsMetricsRequest) SetAuthToken(v string) *QueryStatisticsMetricsRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryStatisticsMetricsRequest) SetProductInstanceId(v string) *QueryStatisticsMetricsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryStatisticsMetricsRequest) SetTenantId(v string) *QueryStatisticsMetricsRequest {
	s.TenantId = &v
	return s
}

func (s *QueryStatisticsMetricsRequest) SetRequestUniqueId(v string) *QueryStatisticsMetricsRequest {
	s.RequestUniqueId = &v
	return s
}

func (s *QueryStatisticsMetricsRequest) SetType(v string) *QueryStatisticsMetricsRequest {
	s.Type = &v
	return s
}

func (s *QueryStatisticsMetricsRequest) SetStartDate(v string) *QueryStatisticsMetricsRequest {
	s.StartDate = &v
	return s
}

func (s *QueryStatisticsMetricsRequest) SetEndDate(v string) *QueryStatisticsMetricsRequest {
	s.EndDate = &v
	return s
}

func (s *QueryStatisticsMetricsRequest) SetDateUnit(v string) *QueryStatisticsMetricsRequest {
	s.DateUnit = &v
	return s
}

type QueryStatisticsMetricsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 统计指标结果
	Data *MetricData `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QueryStatisticsMetricsResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryStatisticsMetricsResponse) GoString() string {
	return s.String()
}

func (s *QueryStatisticsMetricsResponse) SetReqMsgId(v string) *QueryStatisticsMetricsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryStatisticsMetricsResponse) SetResultCode(v string) *QueryStatisticsMetricsResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryStatisticsMetricsResponse) SetResultMsg(v string) *QueryStatisticsMetricsResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryStatisticsMetricsResponse) SetData(v *MetricData) *QueryStatisticsMetricsResponse {
	s.Data = v
	return s
}

type QueryStatisticsConversionmetricsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户id
	//
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 请求唯一id
	//
	RequestUniqueId *string `json:"request_unique_id,omitempty" xml:"request_unique_id,omitempty"`
	// VOUCHER_CONVERSION, USER_CONVERSION
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
}

func (s QueryStatisticsConversionmetricsRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryStatisticsConversionmetricsRequest) GoString() string {
	return s.String()
}

func (s *QueryStatisticsConversionmetricsRequest) SetAuthToken(v string) *QueryStatisticsConversionmetricsRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryStatisticsConversionmetricsRequest) SetProductInstanceId(v string) *QueryStatisticsConversionmetricsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryStatisticsConversionmetricsRequest) SetTenantId(v string) *QueryStatisticsConversionmetricsRequest {
	s.TenantId = &v
	return s
}

func (s *QueryStatisticsConversionmetricsRequest) SetRequestUniqueId(v string) *QueryStatisticsConversionmetricsRequest {
	s.RequestUniqueId = &v
	return s
}

func (s *QueryStatisticsConversionmetricsRequest) SetType(v string) *QueryStatisticsConversionmetricsRequest {
	s.Type = &v
	return s
}

type QueryStatisticsConversionmetricsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 统计过程转化指标结果
	Data *ProcessConversionMetricData `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QueryStatisticsConversionmetricsResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryStatisticsConversionmetricsResponse) GoString() string {
	return s.String()
}

func (s *QueryStatisticsConversionmetricsResponse) SetReqMsgId(v string) *QueryStatisticsConversionmetricsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryStatisticsConversionmetricsResponse) SetResultCode(v string) *QueryStatisticsConversionmetricsResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryStatisticsConversionmetricsResponse) SetResultMsg(v string) *QueryStatisticsConversionmetricsResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryStatisticsConversionmetricsResponse) SetData(v *ProcessConversionMetricData) *QueryStatisticsConversionmetricsResponse {
	s.Data = v
	return s
}

type QueryStatisticsOrgoverviewRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 开始时间
	StartDate *string `json:"start_date,omitempty" xml:"start_date,omitempty" require:"true"`
	// 结束日期
	EndDate *string `json:"end_date,omitempty" xml:"end_date,omitempty" require:"true"`
	// 租户
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 请求唯一id
	RequestUniqueId *string `json:"request_unique_id,omitempty" xml:"request_unique_id,omitempty" require:"true"`
}

func (s QueryStatisticsOrgoverviewRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryStatisticsOrgoverviewRequest) GoString() string {
	return s.String()
}

func (s *QueryStatisticsOrgoverviewRequest) SetAuthToken(v string) *QueryStatisticsOrgoverviewRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryStatisticsOrgoverviewRequest) SetProductInstanceId(v string) *QueryStatisticsOrgoverviewRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryStatisticsOrgoverviewRequest) SetStartDate(v string) *QueryStatisticsOrgoverviewRequest {
	s.StartDate = &v
	return s
}

func (s *QueryStatisticsOrgoverviewRequest) SetEndDate(v string) *QueryStatisticsOrgoverviewRequest {
	s.EndDate = &v
	return s
}

func (s *QueryStatisticsOrgoverviewRequest) SetTenantId(v string) *QueryStatisticsOrgoverviewRequest {
	s.TenantId = &v
	return s
}

func (s *QueryStatisticsOrgoverviewRequest) SetRequestUniqueId(v string) *QueryStatisticsOrgoverviewRequest {
	s.RequestUniqueId = &v
	return s
}

type QueryStatisticsOrgoverviewResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 机构总览数据
	Data *OrgOverviewData `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QueryStatisticsOrgoverviewResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryStatisticsOrgoverviewResponse) GoString() string {
	return s.String()
}

func (s *QueryStatisticsOrgoverviewResponse) SetReqMsgId(v string) *QueryStatisticsOrgoverviewResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryStatisticsOrgoverviewResponse) SetResultCode(v string) *QueryStatisticsOrgoverviewResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryStatisticsOrgoverviewResponse) SetResultMsg(v string) *QueryStatisticsOrgoverviewResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryStatisticsOrgoverviewResponse) SetData(v *OrgOverviewData) *QueryStatisticsOrgoverviewResponse {
	s.Data = v
	return s
}

type QueryStatisticsOrgtrendRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 开始日期
	StartDate *string `json:"start_date,omitempty" xml:"start_date,omitempty" require:"true"`
	// 结束日期
	EndDate *string `json:"end_date,omitempty" xml:"end_date,omitempty" require:"true"`
	// 租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 请求唯一标识
	RequestUniqueId *string `json:"request_unique_id,omitempty" xml:"request_unique_id,omitempty" require:"true"`
}

func (s QueryStatisticsOrgtrendRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryStatisticsOrgtrendRequest) GoString() string {
	return s.String()
}

func (s *QueryStatisticsOrgtrendRequest) SetAuthToken(v string) *QueryStatisticsOrgtrendRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryStatisticsOrgtrendRequest) SetProductInstanceId(v string) *QueryStatisticsOrgtrendRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryStatisticsOrgtrendRequest) SetStartDate(v string) *QueryStatisticsOrgtrendRequest {
	s.StartDate = &v
	return s
}

func (s *QueryStatisticsOrgtrendRequest) SetEndDate(v string) *QueryStatisticsOrgtrendRequest {
	s.EndDate = &v
	return s
}

func (s *QueryStatisticsOrgtrendRequest) SetTenantId(v string) *QueryStatisticsOrgtrendRequest {
	s.TenantId = &v
	return s
}

func (s *QueryStatisticsOrgtrendRequest) SetRequestUniqueId(v string) *QueryStatisticsOrgtrendRequest {
	s.RequestUniqueId = &v
	return s
}

type QueryStatisticsOrgtrendResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 机构趋势数据
	Data []*OrgTrendData `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
}

func (s QueryStatisticsOrgtrendResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryStatisticsOrgtrendResponse) GoString() string {
	return s.String()
}

func (s *QueryStatisticsOrgtrendResponse) SetReqMsgId(v string) *QueryStatisticsOrgtrendResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryStatisticsOrgtrendResponse) SetResultCode(v string) *QueryStatisticsOrgtrendResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryStatisticsOrgtrendResponse) SetResultMsg(v string) *QueryStatisticsOrgtrendResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryStatisticsOrgtrendResponse) SetData(v []*OrgTrendData) *QueryStatisticsOrgtrendResponse {
	s.Data = v
	return s
}

type QueryStatisticsOrgconversionRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 开始日期
	StartDate *string `json:"start_date,omitempty" xml:"start_date,omitempty" require:"true"`
	// 结束日期
	EndDate *string `json:"end_date,omitempty" xml:"end_date,omitempty" require:"true"`
	// 租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 请求唯一标识
	RequestUniqueId *string `json:"request_unique_id,omitempty" xml:"request_unique_id,omitempty" require:"true"`
}

func (s QueryStatisticsOrgconversionRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryStatisticsOrgconversionRequest) GoString() string {
	return s.String()
}

func (s *QueryStatisticsOrgconversionRequest) SetAuthToken(v string) *QueryStatisticsOrgconversionRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryStatisticsOrgconversionRequest) SetProductInstanceId(v string) *QueryStatisticsOrgconversionRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryStatisticsOrgconversionRequest) SetStartDate(v string) *QueryStatisticsOrgconversionRequest {
	s.StartDate = &v
	return s
}

func (s *QueryStatisticsOrgconversionRequest) SetEndDate(v string) *QueryStatisticsOrgconversionRequest {
	s.EndDate = &v
	return s
}

func (s *QueryStatisticsOrgconversionRequest) SetTenantId(v string) *QueryStatisticsOrgconversionRequest {
	s.TenantId = &v
	return s
}

func (s *QueryStatisticsOrgconversionRequest) SetRequestUniqueId(v string) *QueryStatisticsOrgconversionRequest {
	s.RequestUniqueId = &v
	return s
}

type QueryStatisticsOrgconversionResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 转化数据
	Data []*ConversionData `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
}

func (s QueryStatisticsOrgconversionResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryStatisticsOrgconversionResponse) GoString() string {
	return s.String()
}

func (s *QueryStatisticsOrgconversionResponse) SetReqMsgId(v string) *QueryStatisticsOrgconversionResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryStatisticsOrgconversionResponse) SetResultCode(v string) *QueryStatisticsOrgconversionResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryStatisticsOrgconversionResponse) SetResultMsg(v string) *QueryStatisticsOrgconversionResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryStatisticsOrgconversionResponse) SetData(v []*ConversionData) *QueryStatisticsOrgconversionResponse {
	s.Data = v
	return s
}

type QueryStatisticsOrgtraderangeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 开始日期
	StartDate *string `json:"start_date,omitempty" xml:"start_date,omitempty" require:"true"`
	// 结束日期
	EndDate *string `json:"end_date,omitempty" xml:"end_date,omitempty" require:"true"`
	// 租户id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 请求唯一标识
	RequestUniqueId *string `json:"request_unique_id,omitempty" xml:"request_unique_id,omitempty" require:"true"`
}

func (s QueryStatisticsOrgtraderangeRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryStatisticsOrgtraderangeRequest) GoString() string {
	return s.String()
}

func (s *QueryStatisticsOrgtraderangeRequest) SetAuthToken(v string) *QueryStatisticsOrgtraderangeRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryStatisticsOrgtraderangeRequest) SetProductInstanceId(v string) *QueryStatisticsOrgtraderangeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryStatisticsOrgtraderangeRequest) SetStartDate(v string) *QueryStatisticsOrgtraderangeRequest {
	s.StartDate = &v
	return s
}

func (s *QueryStatisticsOrgtraderangeRequest) SetEndDate(v string) *QueryStatisticsOrgtraderangeRequest {
	s.EndDate = &v
	return s
}

func (s *QueryStatisticsOrgtraderangeRequest) SetTenantId(v string) *QueryStatisticsOrgtraderangeRequest {
	s.TenantId = &v
	return s
}

func (s *QueryStatisticsOrgtraderangeRequest) SetRequestUniqueId(v string) *QueryStatisticsOrgtraderangeRequest {
	s.RequestUniqueId = &v
	return s
}

type QueryStatisticsOrgtraderangeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 交易区间统计
	Data []*TradeRangeData `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
}

func (s QueryStatisticsOrgtraderangeResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryStatisticsOrgtraderangeResponse) GoString() string {
	return s.String()
}

func (s *QueryStatisticsOrgtraderangeResponse) SetReqMsgId(v string) *QueryStatisticsOrgtraderangeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryStatisticsOrgtraderangeResponse) SetResultCode(v string) *QueryStatisticsOrgtraderangeResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryStatisticsOrgtraderangeResponse) SetResultMsg(v string) *QueryStatisticsOrgtraderangeResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryStatisticsOrgtraderangeResponse) SetData(v []*TradeRangeData) *QueryStatisticsOrgtraderangeResponse {
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
				"sdk_version":      tea.String("1.0.21"),
				"_prod_code":       tea.String("ASSET"),
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
 * Description: 获取核销明细文件
 * Summary: 获取核销明细文件
 */
func (client *Client) QuerySupplierMonthwriteofffile(request *QuerySupplierMonthwriteofffileRequest) (_result *QuerySupplierMonthwriteofffileResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QuerySupplierMonthwriteofffileResponse{}
	_body, _err := client.QuerySupplierMonthwriteofffileEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取核销明细文件
 * Summary: 获取核销明细文件
 */
func (client *Client) QuerySupplierMonthwriteofffileEx(request *QuerySupplierMonthwriteofffileRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QuerySupplierMonthwriteofffileResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QuerySupplierMonthwriteofffileResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.asset.supplier.monthwriteofffile.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 供应商资金池金额明细
 * Summary: 供应商资金池金额明细
 */
func (client *Client) QuerySupplierFundamt(request *QuerySupplierFundamtRequest) (_result *QuerySupplierFundamtResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QuerySupplierFundamtResponse{}
	_body, _err := client.QuerySupplierFundamtEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 供应商资金池金额明细
 * Summary: 供应商资金池金额明细
 */
func (client *Client) QuerySupplierFundamtEx(request *QuerySupplierFundamtRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QuerySupplierFundamtResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QuerySupplierFundamtResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.asset.supplier.fundamt.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 用于录入供应商打款金额
 * Summary: 供应商资金打款接口
 */
func (client *Client) AddSupplierPayment(request *AddSupplierPaymentRequest) (_result *AddSupplierPaymentResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &AddSupplierPaymentResponse{}
	_body, _err := client.AddSupplierPaymentEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 用于录入供应商打款金额
 * Summary: 供应商资金打款接口
 */
func (client *Client) AddSupplierPaymentEx(request *AddSupplierPaymentRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *AddSupplierPaymentResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AddSupplierPaymentResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.asset.supplier.payment.add"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 机构权益运营还款回调
 * Summary: 机构权益运营还款回调
 */
func (client *Client) CallbackOrgoperationRepay(request *CallbackOrgoperationRepayRequest) (_result *CallbackOrgoperationRepayResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CallbackOrgoperationRepayResponse{}
	_body, _err := client.CallbackOrgoperationRepayEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 机构权益运营还款回调
 * Summary: 机构权益运营还款回调
 */
func (client *Client) CallbackOrgoperationRepayEx(request *CallbackOrgoperationRepayRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CallbackOrgoperationRepayResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CallbackOrgoperationRepayResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.asset.orgoperation.repay.callback"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询数据统计预算金额
 * Summary: 查询数据统计预算金额
 */
func (client *Client) QueryStatisticsBudget(request *QueryStatisticsBudgetRequest) (_result *QueryStatisticsBudgetResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryStatisticsBudgetResponse{}
	_body, _err := client.QueryStatisticsBudgetEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询数据统计预算金额
 * Summary: 查询数据统计预算金额
 */
func (client *Client) QueryStatisticsBudgetEx(request *QueryStatisticsBudgetRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryStatisticsBudgetResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryStatisticsBudgetResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.asset.statistics.budget.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询数据统计指标
 * Summary: 查询数据统计指标
 */
func (client *Client) QueryStatisticsMetrics(request *QueryStatisticsMetricsRequest) (_result *QueryStatisticsMetricsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryStatisticsMetricsResponse{}
	_body, _err := client.QueryStatisticsMetricsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询数据统计指标
 * Summary: 查询数据统计指标
 */
func (client *Client) QueryStatisticsMetricsEx(request *QueryStatisticsMetricsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryStatisticsMetricsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryStatisticsMetricsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.asset.statistics.metrics.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询数据统计过程转化指标
 * Summary: 统计过程转化指标
 */
func (client *Client) QueryStatisticsConversionmetrics(request *QueryStatisticsConversionmetricsRequest) (_result *QueryStatisticsConversionmetricsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryStatisticsConversionmetricsResponse{}
	_body, _err := client.QueryStatisticsConversionmetricsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询数据统计过程转化指标
 * Summary: 统计过程转化指标
 */
func (client *Client) QueryStatisticsConversionmetricsEx(request *QueryStatisticsConversionmetricsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryStatisticsConversionmetricsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryStatisticsConversionmetricsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.asset.statistics.conversionmetrics.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询机构总览数据
 * Summary: 查询机构总览数据
 */
func (client *Client) QueryStatisticsOrgoverview(request *QueryStatisticsOrgoverviewRequest) (_result *QueryStatisticsOrgoverviewResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryStatisticsOrgoverviewResponse{}
	_body, _err := client.QueryStatisticsOrgoverviewEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询机构总览数据
 * Summary: 查询机构总览数据
 */
func (client *Client) QueryStatisticsOrgoverviewEx(request *QueryStatisticsOrgoverviewRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryStatisticsOrgoverviewResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryStatisticsOrgoverviewResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.asset.statistics.orgoverview.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询机构趋势看板数据
 * Summary: 查询机构趋势看板数据
 */
func (client *Client) QueryStatisticsOrgtrend(request *QueryStatisticsOrgtrendRequest) (_result *QueryStatisticsOrgtrendResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryStatisticsOrgtrendResponse{}
	_body, _err := client.QueryStatisticsOrgtrendEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询机构趋势看板数据
 * Summary: 查询机构趋势看板数据
 */
func (client *Client) QueryStatisticsOrgtrendEx(request *QueryStatisticsOrgtrendRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryStatisticsOrgtrendResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryStatisticsOrgtrendResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.asset.statistics.orgtrend.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 机构券转化情况
 * Summary: 机构券转化情况
 */
func (client *Client) QueryStatisticsOrgconversion(request *QueryStatisticsOrgconversionRequest) (_result *QueryStatisticsOrgconversionResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryStatisticsOrgconversionResponse{}
	_body, _err := client.QueryStatisticsOrgconversionEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 机构券转化情况
 * Summary: 机构券转化情况
 */
func (client *Client) QueryStatisticsOrgconversionEx(request *QueryStatisticsOrgconversionRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryStatisticsOrgconversionResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryStatisticsOrgconversionResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.asset.statistics.orgconversion.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 大额交易情况统计
 * Summary: 大额交易情况统计
 */
func (client *Client) QueryStatisticsOrgtraderange(request *QueryStatisticsOrgtraderangeRequest) (_result *QueryStatisticsOrgtraderangeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryStatisticsOrgtraderangeResponse{}
	_body, _err := client.QueryStatisticsOrgtraderangeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 大额交易情况统计
 * Summary: 大额交易情况统计
 */
func (client *Client) QueryStatisticsOrgtraderangeEx(request *QueryStatisticsOrgtraderangeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryStatisticsOrgtraderangeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryStatisticsOrgtraderangeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.asset.statistics.orgtraderange.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
