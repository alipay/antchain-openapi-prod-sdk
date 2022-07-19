// This file is auto-generated, don't edit it. Thanks.
package client

import (
	rpcutil "github.com/alibabacloud-go/tea-rpc-utils/service"
	util "github.com/alibabacloud-go/tea-utils/service"
	"github.com/alibabacloud-go/tea/tea"
	antchainutil "github.com/antchain-openapi-sdk-go/antchain-util/service"
	"io"
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

// 企业风险等级分布统计
type RtopLevelDistribution struct {
	// 统计值
	Count *int `json:"count,omitempty" xml:"count,omitempty" require:"true"`
	// 等级
	Level *string `json:"level,omitempty" xml:"level,omitempty" require:"true"`
}

func (s RtopLevelDistribution) String() string {
	return tea.Prettify(s)
}

func (s RtopLevelDistribution) GoString() string {
	return s.String()
}

func (s *RtopLevelDistribution) SetCount(v int) *RtopLevelDistribution {
	s.Count = &v
	return s
}

func (s *RtopLevelDistribution) SetLevel(v string) *RtopLevelDistribution {
	s.Level = &v
	return s
}

// 删除参数
type OutParams struct {
	// 输出参数
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 参数描述
	Desc *string `json:"desc,omitempty" xml:"desc,omitempty" require:"true"`
	// 参数值
	Value *string `json:"value,omitempty" xml:"value,omitempty" require:"true"`
}

func (s OutParams) String() string {
	return tea.Prettify(s)
}

func (s OutParams) GoString() string {
	return s.String()
}

func (s *OutParams) SetName(v string) *OutParams {
	s.Name = &v
	return s
}

func (s *OutParams) SetDesc(v string) *OutParams {
	s.Desc = &v
	return s
}

func (s *OutParams) SetValue(v string) *OutParams {
	s.Value = &v
	return s
}

// infocode
type InfoCodes struct {
	// infocode
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
}

func (s InfoCodes) String() string {
	return tea.Prettify(s)
}

func (s InfoCodes) GoString() string {
	return s.String()
}

func (s *InfoCodes) SetName(v string) *InfoCodes {
	s.Name = &v
	return s
}

// 天枢系统Contact结构体
type Contact struct {
	// 联系人类型
	// 1配偶
	// 2父母
	// 3子女
	// 4兄弟
	// 5姐妹
	// 6朋友
	// 7其他
	Kind *string `json:"kind,omitempty" xml:"kind,omitempty" require:"true"`
	// 联系人姓名
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 联系人手机号
	Mobile *string `json:"mobile,omitempty" xml:"mobile,omitempty" require:"true"`
}

func (s Contact) String() string {
	return tea.Prettify(s)
}

func (s Contact) GoString() string {
	return s.String()
}

func (s *Contact) SetKind(v string) *Contact {
	s.Kind = &v
	return s
}

func (s *Contact) SetName(v string) *Contact {
	s.Name = &v
	return s
}

func (s *Contact) SetMobile(v string) *Contact {
	s.Mobile = &v
	return s
}

// 涉众风险企业特征
type RtopCrowdRiskFeatureTag struct {
	// 标签描述
	TagExplanation *string `json:"tag_explanation,omitempty" xml:"tag_explanation,omitempty" require:"true"`
	// 标签名称
	TagName *string `json:"tag_name,omitempty" xml:"tag_name,omitempty" require:"true"`
}

func (s RtopCrowdRiskFeatureTag) String() string {
	return tea.Prettify(s)
}

func (s RtopCrowdRiskFeatureTag) GoString() string {
	return s.String()
}

func (s *RtopCrowdRiskFeatureTag) SetTagExplanation(v string) *RtopCrowdRiskFeatureTag {
	s.TagExplanation = &v
	return s
}

func (s *RtopCrowdRiskFeatureTag) SetTagName(v string) *RtopCrowdRiskFeatureTag {
	s.TagName = &v
	return s
}

// 反欺诈风险数据服务风险规则详情
type RiskDetail struct {
	// 反欺诈风险数据服务命中规则风险权重
	RuleWeight *string `json:"rule_weight,omitempty" xml:"rule_weight,omitempty" require:"true"`
	// 反欺诈风险数据服务命中规则名称
	RuleName *string `json:"rule_name,omitempty" xml:"rule_name,omitempty" require:"true"`
}

func (s RiskDetail) String() string {
	return tea.Prettify(s)
}

func (s RiskDetail) GoString() string {
	return s.String()
}

func (s *RiskDetail) SetRuleWeight(v string) *RiskDetail {
	s.RuleWeight = &v
	return s
}

func (s *RiskDetail) SetRuleName(v string) *RiskDetail {
	s.RuleName = &v
	return s
}

// 决策流
type DecisionFlow struct {
	// 输出参数
	DecisionFlow *OutParams `json:"decision_flow,omitempty" xml:"decision_flow,omitempty"`
	// 决策结果
	Decision *string `json:"decision,omitempty" xml:"decision,omitempty" require:"true"`
	// infocodes
	InfoCodes *InfoCodes `json:"info_codes,omitempty" xml:"info_codes,omitempty"`
}

func (s DecisionFlow) String() string {
	return tea.Prettify(s)
}

func (s DecisionFlow) GoString() string {
	return s.String()
}

func (s *DecisionFlow) SetDecisionFlow(v *OutParams) *DecisionFlow {
	s.DecisionFlow = v
	return s
}

func (s *DecisionFlow) SetDecision(v string) *DecisionFlow {
	s.Decision = &v
	return s
}

func (s *DecisionFlow) SetInfoCodes(v *InfoCodes) *DecisionFlow {
	s.InfoCodes = v
	return s
}

// 营销盾批量查询单条结果
type BaseCustomerUmktInfoModel struct {
	// 用户凭证
	CustomerKey *string `json:"customer_key,omitempty" xml:"customer_key,omitempty"`
	// 输入模板
	QueryTemplate *string `json:"query_template,omitempty" xml:"query_template,omitempty"`
	// 实时营销结果
	UmktResult *int64 `json:"umkt_result,omitempty" xml:"umkt_result,omitempty"`
}

func (s BaseCustomerUmktInfoModel) String() string {
	return tea.Prettify(s)
}

func (s BaseCustomerUmktInfoModel) GoString() string {
	return s.String()
}

func (s *BaseCustomerUmktInfoModel) SetCustomerKey(v string) *BaseCustomerUmktInfoModel {
	s.CustomerKey = &v
	return s
}

func (s *BaseCustomerUmktInfoModel) SetQueryTemplate(v string) *BaseCustomerUmktInfoModel {
	s.QueryTemplate = &v
	return s
}

func (s *BaseCustomerUmktInfoModel) SetUmktResult(v int64) *BaseCustomerUmktInfoModel {
	s.UmktResult = &v
	return s
}

// 企业类型分布统计
type RtopTypeDistribution struct {
	// 统计值
	Count *int `json:"count,omitempty" xml:"count,omitempty" require:"true"`
	// 当前类型下的等级分布
	LevelDistribution []*RtopLevelDistribution `json:"levelDistribution,omitempty" xml:"levelDistribution,omitempty" require:"true" type:"Repeated"`
	// 类型
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
}

func (s RtopTypeDistribution) String() string {
	return tea.Prettify(s)
}

func (s RtopTypeDistribution) GoString() string {
	return s.String()
}

func (s *RtopTypeDistribution) SetCount(v int) *RtopTypeDistribution {
	s.Count = &v
	return s
}

func (s *RtopTypeDistribution) SetLevelDistribution(v []*RtopLevelDistribution) *RtopTypeDistribution {
	s.LevelDistribution = v
	return s
}

func (s *RtopTypeDistribution) SetType(v string) *RtopTypeDistribution {
	s.Type = &v
	return s
}

// 监管风险标签
type RtopRiskTag struct {
	// 标签ID
	TagId *string `json:"tag_id,omitempty" xml:"tag_id,omitempty" require:"true"`
	// 标签名称
	TagName *string `json:"tag_name,omitempty" xml:"tag_name,omitempty" require:"true"`
	// 标签类型
	TagType *string `json:"tag_type,omitempty" xml:"tag_type,omitempty"`
	// 标签文本
	TagText *string `json:"tag_text,omitempty" xml:"tag_text,omitempty"`
	// 线索概览
	TagClue *string `json:"tag_clue,omitempty" xml:"tag_clue,omitempty"`
	// 线索明细类型
	ClueDetailType *string `json:"clue_detail_type,omitempty" xml:"clue_detail_type,omitempty"`
	// 线索明细
	TagClueDetail *string `json:"tag_clue_detail,omitempty" xml:"tag_clue_detail,omitempty"`
}

func (s RtopRiskTag) String() string {
	return tea.Prettify(s)
}

func (s RtopRiskTag) GoString() string {
	return s.String()
}

func (s *RtopRiskTag) SetTagId(v string) *RtopRiskTag {
	s.TagId = &v
	return s
}

func (s *RtopRiskTag) SetTagName(v string) *RtopRiskTag {
	s.TagName = &v
	return s
}

func (s *RtopRiskTag) SetTagType(v string) *RtopRiskTag {
	s.TagType = &v
	return s
}

func (s *RtopRiskTag) SetTagText(v string) *RtopRiskTag {
	s.TagText = &v
	return s
}

func (s *RtopRiskTag) SetTagClue(v string) *RtopRiskTag {
	s.TagClue = &v
	return s
}

func (s *RtopRiskTag) SetClueDetailType(v string) *RtopRiskTag {
	s.ClueDetailType = &v
	return s
}

func (s *RtopRiskTag) SetTagClueDetail(v string) *RtopRiskTag {
	s.TagClueDetail = &v
	return s
}

// 天枢系统专用ReceiptInfo结构体
type ReceiptInfo struct {
	// 客户名
	CustomName *string `json:"custom_name,omitempty" xml:"custom_name,omitempty" require:"true"`
	// 证件号码
	CardNo *string `json:"card_no,omitempty" xml:"card_no,omitempty" require:"true"`
	// 手机号
	Mobile *string `json:"mobile,omitempty" xml:"mobile,omitempty" require:"true"`
	// 贷款金额
	ApplyAmount *int64 `json:"apply_amount,omitempty" xml:"apply_amount,omitempty" require:"true"`
	// 发放金额
	LoanAmount *int64 `json:"loan_amount,omitempty" xml:"loan_amount,omitempty" require:"true"`
	// 期数
	Period *int64 `json:"period,omitempty" xml:"period,omitempty" require:"true"`
	// 当前期数
	CurPeriod *int64 `json:"cur_period,omitempty" xml:"cur_period,omitempty" require:"true"`
	// 还款方式1：等额本息，2：等额本金，3：按月付息到期还本，4：利随本清，5：自由还款
	RepayType *string `json:"repay_type,omitempty" xml:"repay_type,omitempty" require:"true"`
	// 还款日
	RepayDate *string `json:"repay_date,omitempty" xml:"repay_date,omitempty" require:"true"`
	// 放款时间
	LoanTime *string `json:"loan_time,omitempty" xml:"loan_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 借据状态0：未还清，1：已还清，2：已提前还清
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 已还本金
	AlreadyCorpus *int64 `json:"already_corpus,omitempty" xml:"already_corpus,omitempty" require:"true"`
	// 已还利息
	AlreadyAccrual *int64 `json:"already_accrual,omitempty" xml:"already_accrual,omitempty" require:"true"`
	// 结清日期
	AlreadyDate *string `json:"already_date,omitempty" xml:"already_date,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 审批状态0：通过 1：拒绝 2：审批中 3：失败
	WorkflowStatus *string `json:"workflow_status,omitempty" xml:"workflow_status,omitempty" require:"true"`
	// 借据编号
	ReceiptNo *string `json:"receipt_no,omitempty" xml:"receipt_no,omitempty" require:"true"`
}

func (s ReceiptInfo) String() string {
	return tea.Prettify(s)
}

func (s ReceiptInfo) GoString() string {
	return s.String()
}

func (s *ReceiptInfo) SetCustomName(v string) *ReceiptInfo {
	s.CustomName = &v
	return s
}

func (s *ReceiptInfo) SetCardNo(v string) *ReceiptInfo {
	s.CardNo = &v
	return s
}

func (s *ReceiptInfo) SetMobile(v string) *ReceiptInfo {
	s.Mobile = &v
	return s
}

func (s *ReceiptInfo) SetApplyAmount(v int64) *ReceiptInfo {
	s.ApplyAmount = &v
	return s
}

func (s *ReceiptInfo) SetLoanAmount(v int64) *ReceiptInfo {
	s.LoanAmount = &v
	return s
}

func (s *ReceiptInfo) SetPeriod(v int64) *ReceiptInfo {
	s.Period = &v
	return s
}

func (s *ReceiptInfo) SetCurPeriod(v int64) *ReceiptInfo {
	s.CurPeriod = &v
	return s
}

func (s *ReceiptInfo) SetRepayType(v string) *ReceiptInfo {
	s.RepayType = &v
	return s
}

func (s *ReceiptInfo) SetRepayDate(v string) *ReceiptInfo {
	s.RepayDate = &v
	return s
}

func (s *ReceiptInfo) SetLoanTime(v string) *ReceiptInfo {
	s.LoanTime = &v
	return s
}

func (s *ReceiptInfo) SetStatus(v string) *ReceiptInfo {
	s.Status = &v
	return s
}

func (s *ReceiptInfo) SetAlreadyCorpus(v int64) *ReceiptInfo {
	s.AlreadyCorpus = &v
	return s
}

func (s *ReceiptInfo) SetAlreadyAccrual(v int64) *ReceiptInfo {
	s.AlreadyAccrual = &v
	return s
}

func (s *ReceiptInfo) SetAlreadyDate(v string) *ReceiptInfo {
	s.AlreadyDate = &v
	return s
}

func (s *ReceiptInfo) SetWorkflowStatus(v string) *ReceiptInfo {
	s.WorkflowStatus = &v
	return s
}

func (s *ReceiptInfo) SetReceiptNo(v string) *ReceiptInfo {
	s.ReceiptNo = &v
	return s
}

// 天枢系统专用RepayRef结构体
type RepayRef struct {
	// 客户编码
	CustomNo *string `json:"custom_no,omitempty" xml:"custom_no,omitempty" require:"true"`
	// 当前期数
	Period *string `json:"period,omitempty" xml:"period,omitempty" require:"true"`
	// 应还总额
	NeedAmount *int64 `json:"need_amount,omitempty" xml:"need_amount,omitempty" require:"true"`
	// 应还本金
	TransPrincipal *int64 `json:"trans_principal,omitempty" xml:"trans_principal,omitempty" require:"true"`
	// 应还利息
	NeedAccrual *int64 `json:"need_accrual,omitempty" xml:"need_accrual,omitempty" require:"true"`
	// 应还手续费
	NeedFee *int64 `json:"need_fee,omitempty" xml:"need_fee,omitempty" require:"true"`
	// 已还总额
	AlreadyAmount *int64 `json:"already_amount,omitempty" xml:"already_amount,omitempty" require:"true"`
	// 已还本金
	AlreadyCorpus *int64 `json:"already_corpus,omitempty" xml:"already_corpus,omitempty" require:"true"`
	// 已还逾期本金
	AlreadyOvercorpus *int64 `json:"already_overcorpus,omitempty" xml:"already_overcorpus,omitempty" require:"true"`
	// 已还利息
	AlreadyAccrual *int64 `json:"already_accrual,omitempty" xml:"already_accrual,omitempty" require:"true"`
	// 已还逾期息
	AlreadyPunish *int64 `json:"already_punish,omitempty" xml:"already_punish,omitempty" require:"true"`
	// 已还手续费
	AlreadyFee *int64 `json:"already_fee,omitempty" xml:"already_fee,omitempty" require:"true"`
	// 利率
	Rate *int64 `json:"rate,omitempty" xml:"rate,omitempty" require:"true"`
	// 罚息率
	PenaltyValue *int64 `json:"penalty_value,omitempty" xml:"penalty_value,omitempty" require:"true"`
	// 当期剩余总额
	RestAmount *int64 `json:"rest_amount,omitempty" xml:"rest_amount,omitempty" require:"true"`
	// 当期剩余本金
	RestCorpus *int64 `json:"rest_corpus,omitempty" xml:"rest_corpus,omitempty" require:"true"`
	// 当期剩余利息
	RestAccrual *int64 `json:"rest_accrual,omitempty" xml:"rest_accrual,omitempty" require:"true"`
	// 当期剩余罚息
	RestPunish *int64 `json:"rest_punish,omitempty" xml:"rest_punish,omitempty" require:"true"`
	// 期末本金
	RemainCorpus *int64 `json:"remain_corpus,omitempty" xml:"remain_corpus,omitempty" require:"true"`
	// 借据编号
	ReceiptNo *string `json:"receipt_no,omitempty" xml:"receipt_no,omitempty" require:"true"`
	// 还款状态1：已还清 2 未还 3 部分还款
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 应还日期
	SettleDate *string `json:"settle_date,omitempty" xml:"settle_date,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 还款日期
	TradeDate *string `json:"trade_date,omitempty" xml:"trade_date,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
}

func (s RepayRef) String() string {
	return tea.Prettify(s)
}

func (s RepayRef) GoString() string {
	return s.String()
}

func (s *RepayRef) SetCustomNo(v string) *RepayRef {
	s.CustomNo = &v
	return s
}

func (s *RepayRef) SetPeriod(v string) *RepayRef {
	s.Period = &v
	return s
}

func (s *RepayRef) SetNeedAmount(v int64) *RepayRef {
	s.NeedAmount = &v
	return s
}

func (s *RepayRef) SetTransPrincipal(v int64) *RepayRef {
	s.TransPrincipal = &v
	return s
}

func (s *RepayRef) SetNeedAccrual(v int64) *RepayRef {
	s.NeedAccrual = &v
	return s
}

func (s *RepayRef) SetNeedFee(v int64) *RepayRef {
	s.NeedFee = &v
	return s
}

func (s *RepayRef) SetAlreadyAmount(v int64) *RepayRef {
	s.AlreadyAmount = &v
	return s
}

func (s *RepayRef) SetAlreadyCorpus(v int64) *RepayRef {
	s.AlreadyCorpus = &v
	return s
}

func (s *RepayRef) SetAlreadyOvercorpus(v int64) *RepayRef {
	s.AlreadyOvercorpus = &v
	return s
}

func (s *RepayRef) SetAlreadyAccrual(v int64) *RepayRef {
	s.AlreadyAccrual = &v
	return s
}

func (s *RepayRef) SetAlreadyPunish(v int64) *RepayRef {
	s.AlreadyPunish = &v
	return s
}

func (s *RepayRef) SetAlreadyFee(v int64) *RepayRef {
	s.AlreadyFee = &v
	return s
}

func (s *RepayRef) SetRate(v int64) *RepayRef {
	s.Rate = &v
	return s
}

func (s *RepayRef) SetPenaltyValue(v int64) *RepayRef {
	s.PenaltyValue = &v
	return s
}

func (s *RepayRef) SetRestAmount(v int64) *RepayRef {
	s.RestAmount = &v
	return s
}

func (s *RepayRef) SetRestCorpus(v int64) *RepayRef {
	s.RestCorpus = &v
	return s
}

func (s *RepayRef) SetRestAccrual(v int64) *RepayRef {
	s.RestAccrual = &v
	return s
}

func (s *RepayRef) SetRestPunish(v int64) *RepayRef {
	s.RestPunish = &v
	return s
}

func (s *RepayRef) SetRemainCorpus(v int64) *RepayRef {
	s.RemainCorpus = &v
	return s
}

func (s *RepayRef) SetReceiptNo(v string) *RepayRef {
	s.ReceiptNo = &v
	return s
}

func (s *RepayRef) SetStatus(v string) *RepayRef {
	s.Status = &v
	return s
}

func (s *RepayRef) SetSettleDate(v string) *RepayRef {
	s.SettleDate = &v
	return s
}

func (s *RepayRef) SetTradeDate(v string) *RepayRef {
	s.TradeDate = &v
	return s
}

// 反欺诈风险数据服务规则细节信息
type RuleDetail struct {
	// 规则细节名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 规则细节值
	Value *string `json:"value,omitempty" xml:"value,omitempty" require:"true"`
}

func (s RuleDetail) String() string {
	return tea.Prettify(s)
}

func (s RuleDetail) GoString() string {
	return s.String()
}

func (s *RuleDetail) SetName(v string) *RuleDetail {
	s.Name = &v
	return s
}

func (s *RuleDetail) SetValue(v string) *RuleDetail {
	s.Value = &v
	return s
}

// 安全场景参数
type SecurityScene struct {
	// 接入渠道
	AccessChannel *string `json:"access_channel,omitempty" xml:"access_channel,omitempty"`
	// 事件信息
	CtuParams *string `json:"ctu_params,omitempty" xml:"ctu_params,omitempty"`
	// 产品名称
	ProductName *string `json:"product_name,omitempty" xml:"product_name,omitempty"`
	// 产品节点
	ProductNode *string `json:"product_node,omitempty" xml:"product_node,omitempty"`
	// 扩展参数
	SecuritySceneParams *string `json:"security_scene_params,omitempty" xml:"security_scene_params,omitempty"`
	// 系统名称
	SystemName *string `json:"system_name,omitempty" xml:"system_name,omitempty"`
	// 总金额
	TotalFee *string `json:"total_fee,omitempty" xml:"total_fee,omitempty"`
}

func (s SecurityScene) String() string {
	return tea.Prettify(s)
}

func (s SecurityScene) GoString() string {
	return s.String()
}

func (s *SecurityScene) SetAccessChannel(v string) *SecurityScene {
	s.AccessChannel = &v
	return s
}

func (s *SecurityScene) SetCtuParams(v string) *SecurityScene {
	s.CtuParams = &v
	return s
}

func (s *SecurityScene) SetProductName(v string) *SecurityScene {
	s.ProductName = &v
	return s
}

func (s *SecurityScene) SetProductNode(v string) *SecurityScene {
	s.ProductNode = &v
	return s
}

func (s *SecurityScene) SetSecuritySceneParams(v string) *SecurityScene {
	s.SecuritySceneParams = &v
	return s
}

func (s *SecurityScene) SetSystemName(v string) *SecurityScene {
	s.SystemName = &v
	return s
}

func (s *SecurityScene) SetTotalFee(v string) *SecurityScene {
	s.TotalFee = &v
	return s
}

// 收藏的企业信息
type RtopStarCompanyInfo struct {
	// 行业
	Categories []*string `json:"categories,omitempty" xml:"categories,omitempty" type:"Repeated"`
	// 经营地址
	OperatingPlace *string `json:"operating_place,omitempty" xml:"operating_place,omitempty"`
	// 经营省份
	OperatingProvince *string `json:"operating_province,omitempty" xml:"operating_province,omitempty"`
	// 企业名称
	OrgName *string `json:"org_name,omitempty" xml:"org_name,omitempty"`
	// 风险分数
	RiskScore *int64 `json:"risk_score,omitempty" xml:"risk_score,omitempty"`
	// 风险标签
	RiskTags []*string `json:"risk_tags,omitempty" xml:"risk_tags,omitempty" type:"Repeated"`
	// 风险线索
	RiskTagDetails []*RtopRiskTag `json:"risk_tag_details,omitempty" xml:"risk_tag_details,omitempty" type:"Repeated"`
	// 风险标签Id集合
	RiskTagIds []*string `json:"risk_tag_ids,omitempty" xml:"risk_tag_ids,omitempty" type:"Repeated"`
	// 统一社会信用代码
	UcCode *string `json:"uc_code,omitempty" xml:"uc_code,omitempty"`
}

func (s RtopStarCompanyInfo) String() string {
	return tea.Prettify(s)
}

func (s RtopStarCompanyInfo) GoString() string {
	return s.String()
}

func (s *RtopStarCompanyInfo) SetCategories(v []*string) *RtopStarCompanyInfo {
	s.Categories = v
	return s
}

func (s *RtopStarCompanyInfo) SetOperatingPlace(v string) *RtopStarCompanyInfo {
	s.OperatingPlace = &v
	return s
}

func (s *RtopStarCompanyInfo) SetOperatingProvince(v string) *RtopStarCompanyInfo {
	s.OperatingProvince = &v
	return s
}

func (s *RtopStarCompanyInfo) SetOrgName(v string) *RtopStarCompanyInfo {
	s.OrgName = &v
	return s
}

func (s *RtopStarCompanyInfo) SetRiskScore(v int64) *RtopStarCompanyInfo {
	s.RiskScore = &v
	return s
}

func (s *RtopStarCompanyInfo) SetRiskTags(v []*string) *RtopStarCompanyInfo {
	s.RiskTags = v
	return s
}

func (s *RtopStarCompanyInfo) SetRiskTagDetails(v []*RtopRiskTag) *RtopStarCompanyInfo {
	s.RiskTagDetails = v
	return s
}

func (s *RtopStarCompanyInfo) SetRiskTagIds(v []*string) *RtopStarCompanyInfo {
	s.RiskTagIds = v
	return s
}

func (s *RtopStarCompanyInfo) SetUcCode(v string) *RtopStarCompanyInfo {
	s.UcCode = &v
	return s
}

// 企业日期趋势统计
type RtopDateDistribution struct {
	// 统计值
	Count *int `json:"count,omitempty" xml:"count,omitempty" require:"true"`
	// 年龄
	Date *string `json:"date,omitempty" xml:"date,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
}

func (s RtopDateDistribution) String() string {
	return tea.Prettify(s)
}

func (s RtopDateDistribution) GoString() string {
	return s.String()
}

func (s *RtopDateDistribution) SetCount(v int) *RtopDateDistribution {
	s.Count = &v
	return s
}

func (s *RtopDateDistribution) SetDate(v string) *RtopDateDistribution {
	s.Date = &v
	return s
}

// 天枢系统个人信息结构体
type PersonalInfo struct {
	// 客户姓名
	CustomName *string `json:"custom_name,omitempty" xml:"custom_name,omitempty" require:"true"`
	// 身份证号码(18位)
	CardNo *string `json:"card_no,omitempty" xml:"card_no,omitempty" require:"true"`
	// 1-身份证
	IdType *string `json:"id_type,omitempty" xml:"id_type,omitempty" require:"true"`
	// 证件开始日期(格式：YYYY-MM-DD)
	//
	CertSignDate *string `json:"cert_sign_date,omitempty" xml:"cert_sign_date,omitempty" require:"true"`
	// 格式：YYYY-MM-DD，身份证有效期为长期的送: 9999-12-31
	CertValidate *string `json:"cert_validate,omitempty" xml:"cert_validate,omitempty" require:"true"`
	// 证件地址
	CertAdr *string `json:"cert_adr,omitempty" xml:"cert_adr,omitempty" require:"true"`
	// 手机号
	Mobile *string `json:"mobile,omitempty" xml:"mobile,omitempty" require:"true"`
	// 学历
	Education *string `json:"education,omitempty" xml:"education,omitempty" require:"true"`
	// 所在省份 汉字
	Province *string `json:"province,omitempty" xml:"province,omitempty"`
	// 所在城市 汉字
	City *string `json:"city,omitempty" xml:"city,omitempty"`
	// 地区名称 汉字
	Area *string `json:"area,omitempty" xml:"area,omitempty"`
	// 详细地址
	Address *string `json:"address,omitempty" xml:"address,omitempty"`
	// 性别M-男
	// F-女
	Sex *string `json:"sex,omitempty" xml:"sex,omitempty"`
	// 民族
	Nation *string `json:"nation,omitempty" xml:"nation,omitempty"`
}

func (s PersonalInfo) String() string {
	return tea.Prettify(s)
}

func (s PersonalInfo) GoString() string {
	return s.String()
}

func (s *PersonalInfo) SetCustomName(v string) *PersonalInfo {
	s.CustomName = &v
	return s
}

func (s *PersonalInfo) SetCardNo(v string) *PersonalInfo {
	s.CardNo = &v
	return s
}

func (s *PersonalInfo) SetIdType(v string) *PersonalInfo {
	s.IdType = &v
	return s
}

func (s *PersonalInfo) SetCertSignDate(v string) *PersonalInfo {
	s.CertSignDate = &v
	return s
}

func (s *PersonalInfo) SetCertValidate(v string) *PersonalInfo {
	s.CertValidate = &v
	return s
}

func (s *PersonalInfo) SetCertAdr(v string) *PersonalInfo {
	s.CertAdr = &v
	return s
}

func (s *PersonalInfo) SetMobile(v string) *PersonalInfo {
	s.Mobile = &v
	return s
}

func (s *PersonalInfo) SetEducation(v string) *PersonalInfo {
	s.Education = &v
	return s
}

func (s *PersonalInfo) SetProvince(v string) *PersonalInfo {
	s.Province = &v
	return s
}

func (s *PersonalInfo) SetCity(v string) *PersonalInfo {
	s.City = &v
	return s
}

func (s *PersonalInfo) SetArea(v string) *PersonalInfo {
	s.Area = &v
	return s
}

func (s *PersonalInfo) SetAddress(v string) *PersonalInfo {
	s.Address = &v
	return s
}

func (s *PersonalInfo) SetSex(v string) *PersonalInfo {
	s.Sex = &v
	return s
}

func (s *PersonalInfo) SetNation(v string) *PersonalInfo {
	s.Nation = &v
	return s
}

// 天枢系统专用RepayResult结构体
type RepayResult struct {
	// 客户编码
	CustomNo *string `json:"custom_no,omitempty" xml:"custom_no,omitempty" require:"true"`
	// 当前期数
	Period *string `json:"period,omitempty" xml:"period,omitempty" require:"true"`
	// 应还总额
	NeedAmount *int64 `json:"need_amount,omitempty" xml:"need_amount,omitempty" require:"true"`
	// 应还本金
	NeedCorpus *int64 `json:"need_corpus,omitempty" xml:"need_corpus,omitempty" require:"true"`
	// 应还利息
	NeedAccrual *int64 `json:"need_accrual,omitempty" xml:"need_accrual,omitempty" require:"true"`
	// 应还手续费
	NeedFee *int64 `json:"need_fee,omitempty" xml:"need_fee,omitempty" require:"true"`
	// 已还总额
	AlreadyAmount *int64 `json:"already_amount,omitempty" xml:"already_amount,omitempty" require:"true"`
	// 已还本金
	AlreadyCorpus *int64 `json:"already_corpus,omitempty" xml:"already_corpus,omitempty" require:"true"`
	// 已还逾期本金
	AlreadyOvercorpus *int64 `json:"already_overcorpus,omitempty" xml:"already_overcorpus,omitempty" require:"true"`
	// 已还利息
	AlreadyAccrual *int64 `json:"already_accrual,omitempty" xml:"already_accrual,omitempty" require:"true"`
	// 已还逾期息
	AlreadyPunish *int64 `json:"already_punish,omitempty" xml:"already_punish,omitempty" require:"true"`
	// 已还手续费
	AlreadyFee *int64 `json:"already_fee,omitempty" xml:"already_fee,omitempty" require:"true"`
	// 利率
	Rate *int64 `json:"rate,omitempty" xml:"rate,omitempty" require:"true"`
	// 罚息率
	PenaltyValue *int64 `json:"penalty_value,omitempty" xml:"penalty_value,omitempty" require:"true"`
	// 当期剩余总额
	RestAmount *int64 `json:"rest_amount,omitempty" xml:"rest_amount,omitempty" require:"true"`
	// 当期剩余本金
	RestCorpus *int64 `json:"rest_corpus,omitempty" xml:"rest_corpus,omitempty" require:"true"`
	// 当期剩余利息
	RestAccrual *int64 `json:"rest_accrual,omitempty" xml:"rest_accrual,omitempty" require:"true"`
	// 当期剩余罚息
	RestPunish *int64 `json:"rest_punish,omitempty" xml:"rest_punish,omitempty" require:"true"`
	// 期末本金
	RemainCorpus *int64 `json:"remain_corpus,omitempty" xml:"remain_corpus,omitempty" require:"true"`
	// 借据编号
	ReceiptNo *string `json:"receipt_no,omitempty" xml:"receipt_no,omitempty" require:"true"`
	// 还款状态1：已还清 2 未还 3 部分还款
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 应还日期
	SettleDate *string `json:"settle_date,omitempty" xml:"settle_date,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 还款日期
	TradeDate *string `json:"trade_date,omitempty" xml:"trade_date,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
}

func (s RepayResult) String() string {
	return tea.Prettify(s)
}

func (s RepayResult) GoString() string {
	return s.String()
}

func (s *RepayResult) SetCustomNo(v string) *RepayResult {
	s.CustomNo = &v
	return s
}

func (s *RepayResult) SetPeriod(v string) *RepayResult {
	s.Period = &v
	return s
}

func (s *RepayResult) SetNeedAmount(v int64) *RepayResult {
	s.NeedAmount = &v
	return s
}

func (s *RepayResult) SetNeedCorpus(v int64) *RepayResult {
	s.NeedCorpus = &v
	return s
}

func (s *RepayResult) SetNeedAccrual(v int64) *RepayResult {
	s.NeedAccrual = &v
	return s
}

func (s *RepayResult) SetNeedFee(v int64) *RepayResult {
	s.NeedFee = &v
	return s
}

func (s *RepayResult) SetAlreadyAmount(v int64) *RepayResult {
	s.AlreadyAmount = &v
	return s
}

func (s *RepayResult) SetAlreadyCorpus(v int64) *RepayResult {
	s.AlreadyCorpus = &v
	return s
}

func (s *RepayResult) SetAlreadyOvercorpus(v int64) *RepayResult {
	s.AlreadyOvercorpus = &v
	return s
}

func (s *RepayResult) SetAlreadyAccrual(v int64) *RepayResult {
	s.AlreadyAccrual = &v
	return s
}

func (s *RepayResult) SetAlreadyPunish(v int64) *RepayResult {
	s.AlreadyPunish = &v
	return s
}

func (s *RepayResult) SetAlreadyFee(v int64) *RepayResult {
	s.AlreadyFee = &v
	return s
}

func (s *RepayResult) SetRate(v int64) *RepayResult {
	s.Rate = &v
	return s
}

func (s *RepayResult) SetPenaltyValue(v int64) *RepayResult {
	s.PenaltyValue = &v
	return s
}

func (s *RepayResult) SetRestAmount(v int64) *RepayResult {
	s.RestAmount = &v
	return s
}

func (s *RepayResult) SetRestCorpus(v int64) *RepayResult {
	s.RestCorpus = &v
	return s
}

func (s *RepayResult) SetRestAccrual(v int64) *RepayResult {
	s.RestAccrual = &v
	return s
}

func (s *RepayResult) SetRestPunish(v int64) *RepayResult {
	s.RestPunish = &v
	return s
}

func (s *RepayResult) SetRemainCorpus(v int64) *RepayResult {
	s.RemainCorpus = &v
	return s
}

func (s *RepayResult) SetReceiptNo(v string) *RepayResult {
	s.ReceiptNo = &v
	return s
}

func (s *RepayResult) SetStatus(v string) *RepayResult {
	s.Status = &v
	return s
}

func (s *RepayResult) SetSettleDate(v string) *RepayResult {
	s.SettleDate = &v
	return s
}

func (s *RepayResult) SetTradeDate(v string) *RepayResult {
	s.TradeDate = &v
	return s
}

// 策略流信息
type DfSceneInfos struct {
	// scene_code
	SceneCode *string `json:"scene_code,omitempty" xml:"scene_code,omitempty" require:"true"`
	// 拒绝
	SceneDecision *string `json:"scene_decision,omitempty" xml:"scene_decision,omitempty" require:"true"`
	// decision_flow
	DecisionFlow *DecisionFlow `json:"decision_flow,omitempty" xml:"decision_flow,omitempty" require:"true"`
}

func (s DfSceneInfos) String() string {
	return tea.Prettify(s)
}

func (s DfSceneInfos) GoString() string {
	return s.String()
}

func (s *DfSceneInfos) SetSceneCode(v string) *DfSceneInfos {
	s.SceneCode = &v
	return s
}

func (s *DfSceneInfos) SetSceneDecision(v string) *DfSceneInfos {
	s.SceneDecision = &v
	return s
}

func (s *DfSceneInfos) SetDecisionFlow(v *DecisionFlow) *DfSceneInfos {
	s.DecisionFlow = v
	return s
}

// 反欺诈风险数据服务风险信息
type RiskInfo struct {
	// 反欺诈风险数据服务风险组描述
	RiskGroupDesc *string `json:"risk_group_desc,omitempty" xml:"risk_group_desc,omitempty" require:"true"`
	// 反欺诈风险数据服务风险组名
	RiskGroup *string `json:"risk_group,omitempty" xml:"risk_group,omitempty" require:"true"`
	// 反欺诈风险数据服务风险组类别
	RiskGroupCategory *string `json:"risk_group_category,omitempty" xml:"risk_group_category,omitempty" require:"true"`
	// 反欺诈风险数据服务风险组信息
	RiskDetails []*RiskDetail `json:"risk_details,omitempty" xml:"risk_details,omitempty" require:"true" type:"Repeated"`
}

func (s RiskInfo) String() string {
	return tea.Prettify(s)
}

func (s RiskInfo) GoString() string {
	return s.String()
}

func (s *RiskInfo) SetRiskGroupDesc(v string) *RiskInfo {
	s.RiskGroupDesc = &v
	return s
}

func (s *RiskInfo) SetRiskGroup(v string) *RiskInfo {
	s.RiskGroup = &v
	return s
}

func (s *RiskInfo) SetRiskGroupCategory(v string) *RiskInfo {
	s.RiskGroupCategory = &v
	return s
}

func (s *RiskInfo) SetRiskDetails(v []*RiskDetail) *RiskInfo {
	s.RiskDetails = v
	return s
}

// 天枢更新渠道返回
type UpdateCustomerRelationResponseData struct {
	// id
	Id *int64 `json:"id,omitempty" xml:"id,omitempty"`
	// 渠道编码
	ChannelCode *string `json:"channel_code,omitempty" xml:"channel_code,omitempty"`
	// 渠道id
	ChannelNo *string `json:"channel_no,omitempty" xml:"channel_no,omitempty"`
	// 客户号
	CustomerNo *string `json:"customer_no,omitempty" xml:"customer_no,omitempty"`
	// 创建时间
	CreateTime *string `json:"create_time,omitempty" xml:"create_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 更新时间
	UpdateTime *string `json:"update_time,omitempty" xml:"update_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
}

func (s UpdateCustomerRelationResponseData) String() string {
	return tea.Prettify(s)
}

func (s UpdateCustomerRelationResponseData) GoString() string {
	return s.String()
}

func (s *UpdateCustomerRelationResponseData) SetId(v int64) *UpdateCustomerRelationResponseData {
	s.Id = &v
	return s
}

func (s *UpdateCustomerRelationResponseData) SetChannelCode(v string) *UpdateCustomerRelationResponseData {
	s.ChannelCode = &v
	return s
}

func (s *UpdateCustomerRelationResponseData) SetChannelNo(v string) *UpdateCustomerRelationResponseData {
	s.ChannelNo = &v
	return s
}

func (s *UpdateCustomerRelationResponseData) SetCustomerNo(v string) *UpdateCustomerRelationResponseData {
	s.CustomerNo = &v
	return s
}

func (s *UpdateCustomerRelationResponseData) SetCreateTime(v string) *UpdateCustomerRelationResponseData {
	s.CreateTime = &v
	return s
}

func (s *UpdateCustomerRelationResponseData) SetUpdateTime(v string) *UpdateCustomerRelationResponseData {
	s.UpdateTime = &v
	return s
}

// 风险维度
type RtopCompanyRiskFactor struct {
	// 维度名称
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 维度分数
	Score *int64 `json:"score,omitempty" xml:"score,omitempty"`
}

func (s RtopCompanyRiskFactor) String() string {
	return tea.Prettify(s)
}

func (s RtopCompanyRiskFactor) GoString() string {
	return s.String()
}

func (s *RtopCompanyRiskFactor) SetName(v string) *RtopCompanyRiskFactor {
	s.Name = &v
	return s
}

func (s *RtopCompanyRiskFactor) SetScore(v int64) *RtopCompanyRiskFactor {
	s.Score = &v
	return s
}

// 天枢系统专用Material结构体
type Material struct {
	// 资料类型0-风控报告1-合同2-图片3-附件
	MType *string `json:"m_type,omitempty" xml:"m_type,omitempty" require:"true"`
	// 大类编码00-风控报告10-合同20身份证图片26人脸图片30-附件
	BigCode *string `json:"big_code,omitempty" xml:"big_code,omitempty" require:"true"`
	// 小类编码
	// 201-身份证人脸面202身份证国徽面212-活体人脸图片
	SmallCode *string `json:"small_code,omitempty" xml:"small_code,omitempty" require:"true"`
	// 资料名称
	MeterialName *string `json:"meterial_name,omitempty" xml:"meterial_name,omitempty" require:"true"`
	// 文件地址
	FilePath *string `json:"file_path,omitempty" xml:"file_path,omitempty" require:"true"`
}

func (s Material) String() string {
	return tea.Prettify(s)
}

func (s Material) GoString() string {
	return s.String()
}

func (s *Material) SetMType(v string) *Material {
	s.MType = &v
	return s
}

func (s *Material) SetBigCode(v string) *Material {
	s.BigCode = &v
	return s
}

func (s *Material) SetSmallCode(v string) *Material {
	s.SmallCode = &v
	return s
}

func (s *Material) SetMeterialName(v string) *Material {
	s.MeterialName = &v
	return s
}

func (s *Material) SetFilePath(v string) *Material {
	s.FilePath = &v
	return s
}

// 用户借款是否结清
type CustomReceiptStatus struct {
	// 是否结清
	ReceiptFlag *bool `json:"receipt_flag,omitempty" xml:"receipt_flag,omitempty"`
}

func (s CustomReceiptStatus) String() string {
	return tea.Prettify(s)
}

func (s CustomReceiptStatus) GoString() string {
	return s.String()
}

func (s *CustomReceiptStatus) SetReceiptFlag(v bool) *CustomReceiptStatus {
	s.ReceiptFlag = &v
	return s
}

// 天枢系统RiskData结构体
type RiskData struct {
	// 联系人信息列表
	Contacts []*Contact `json:"contacts,omitempty" xml:"contacts,omitempty" require:"true" type:"Repeated"`
	// 人脸对比分
	FacePoint *string `json:"face_point,omitempty" xml:"face_point,omitempty"`
	// 活体供应商
	FaceSource *string `json:"face_source,omitempty" xml:"face_source,omitempty"`
}

func (s RiskData) String() string {
	return tea.Prettify(s)
}

func (s RiskData) GoString() string {
	return s.String()
}

func (s *RiskData) SetContacts(v []*Contact) *RiskData {
	s.Contacts = v
	return s
}

func (s *RiskData) SetFacePoint(v string) *RiskData {
	s.FacePoint = &v
	return s
}

func (s *RiskData) SetFaceSource(v string) *RiskData {
	s.FaceSource = &v
	return s
}

// 安全数据服务请求参数
type SecurityDataQueryStruct struct {
	// 请求数据参数
	Params *string `json:"params,omitempty" xml:"params,omitempty" require:"true"`
	// 请求数据类型
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 请求数据版本
	Version *string `json:"version,omitempty" xml:"version,omitempty" require:"true"`
}

func (s SecurityDataQueryStruct) String() string {
	return tea.Prettify(s)
}

func (s SecurityDataQueryStruct) GoString() string {
	return s.String()
}

func (s *SecurityDataQueryStruct) SetParams(v string) *SecurityDataQueryStruct {
	s.Params = &v
	return s
}

func (s *SecurityDataQueryStruct) SetType(v string) *SecurityDataQueryStruct {
	s.Type = &v
	return s
}

func (s *SecurityDataQueryStruct) SetVersion(v string) *SecurityDataQueryStruct {
	s.Version = &v
	return s
}

// 标签信息
type RiskLabelInfo struct {
	// 线索明细类型(字段停用)
	ClueDetailType *string `json:"clue_detail_type,omitempty" xml:"clue_detail_type,omitempty" require:"true"`
	// odps数据产出时间，冗余字段，业务上不需要，以备错误排查
	Dt *string `json:"dt,omitempty" xml:"dt,omitempty"`
	// 数据产生时间
	GmtCreate *string `json:"gmt_create,omitempty" xml:"gmt_create,omitempty" require:"true"`
	// 记录唯一ID
	Id *int64 `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 0-正常 1-删除
	IsDeleted *int64 `json:"is_deleted,omitempty" xml:"is_deleted,omitempty" require:"true"`
	// 企业ID
	MctOneId *string `json:"mct_one_id,omitempty" xml:"mct_one_id,omitempty" require:"true"`
	// 操作人ID
	OperatorId *string `json:"operator_id,omitempty" xml:"operator_id,omitempty" require:"true"`
	// 操作类型
	// add、delete、update
	OpType *string `json:"op_type,omitempty" xml:"op_type,omitempty" require:"true"`
	// 企业名称
	OrgName *string `json:"org_name,omitempty" xml:"org_name,omitempty" require:"true"`
	// 线索类型
	RiskDetailType *string `json:"risk_detail_type,omitempty" xml:"risk_detail_type,omitempty" require:"true"`
	// 风险维度
	//
	RiskDimensionType *string `json:"risk_dimension_type,omitempty" xml:"risk_dimension_type,omitempty" require:"true"`
	// 线索概览
	TagClue *string `json:"tag_clue,omitempty" xml:"tag_clue,omitempty" require:"true"`
	// 线索明细
	TagClueDetail *string `json:"tag_clue_detail,omitempty" xml:"tag_clue_detail,omitempty" require:"true"`
	// 标签ID
	TagId *string `json:"tag_id,omitempty" xml:"tag_id,omitempty" require:"true"`
	// 线索列表表头，英文逗号分隔
	//
	TagListHeaders *string `json:"tag_list_headers,omitempty" xml:"tag_list_headers,omitempty" require:"true"`
	// 标签列表，排序字段
	TagListOrderColumn *string `json:"tag_list_order_column,omitempty" xml:"tag_list_order_column,omitempty" require:"true"`
	// 标签列表排序方式
	TagListOrderType *string `json:"tag_list_order_type,omitempty" xml:"tag_list_order_type,omitempty" require:"true"`
	// 标签文本
	TagText *string `json:"tag_text,omitempty" xml:"tag_text,omitempty" require:"true"`
	// 趋势图表名
	TagTrendChartName *string `json:"tag_trend_chart_name,omitempty" xml:"tag_trend_chart_name,omitempty" require:"true"`
	// 数据同步到公有云时间(业务上赋值当天)
	UpdateDate *string `json:"update_date,omitempty" xml:"update_date,omitempty" require:"true"`
}

func (s RiskLabelInfo) String() string {
	return tea.Prettify(s)
}

func (s RiskLabelInfo) GoString() string {
	return s.String()
}

func (s *RiskLabelInfo) SetClueDetailType(v string) *RiskLabelInfo {
	s.ClueDetailType = &v
	return s
}

func (s *RiskLabelInfo) SetDt(v string) *RiskLabelInfo {
	s.Dt = &v
	return s
}

func (s *RiskLabelInfo) SetGmtCreate(v string) *RiskLabelInfo {
	s.GmtCreate = &v
	return s
}

func (s *RiskLabelInfo) SetId(v int64) *RiskLabelInfo {
	s.Id = &v
	return s
}

func (s *RiskLabelInfo) SetIsDeleted(v int64) *RiskLabelInfo {
	s.IsDeleted = &v
	return s
}

func (s *RiskLabelInfo) SetMctOneId(v string) *RiskLabelInfo {
	s.MctOneId = &v
	return s
}

func (s *RiskLabelInfo) SetOperatorId(v string) *RiskLabelInfo {
	s.OperatorId = &v
	return s
}

func (s *RiskLabelInfo) SetOpType(v string) *RiskLabelInfo {
	s.OpType = &v
	return s
}

func (s *RiskLabelInfo) SetOrgName(v string) *RiskLabelInfo {
	s.OrgName = &v
	return s
}

func (s *RiskLabelInfo) SetRiskDetailType(v string) *RiskLabelInfo {
	s.RiskDetailType = &v
	return s
}

func (s *RiskLabelInfo) SetRiskDimensionType(v string) *RiskLabelInfo {
	s.RiskDimensionType = &v
	return s
}

func (s *RiskLabelInfo) SetTagClue(v string) *RiskLabelInfo {
	s.TagClue = &v
	return s
}

func (s *RiskLabelInfo) SetTagClueDetail(v string) *RiskLabelInfo {
	s.TagClueDetail = &v
	return s
}

func (s *RiskLabelInfo) SetTagId(v string) *RiskLabelInfo {
	s.TagId = &v
	return s
}

func (s *RiskLabelInfo) SetTagListHeaders(v string) *RiskLabelInfo {
	s.TagListHeaders = &v
	return s
}

func (s *RiskLabelInfo) SetTagListOrderColumn(v string) *RiskLabelInfo {
	s.TagListOrderColumn = &v
	return s
}

func (s *RiskLabelInfo) SetTagListOrderType(v string) *RiskLabelInfo {
	s.TagListOrderType = &v
	return s
}

func (s *RiskLabelInfo) SetTagText(v string) *RiskLabelInfo {
	s.TagText = &v
	return s
}

func (s *RiskLabelInfo) SetTagTrendChartName(v string) *RiskLabelInfo {
	s.TagTrendChartName = &v
	return s
}

func (s *RiskLabelInfo) SetUpdateDate(v string) *RiskLabelInfo {
	s.UpdateDate = &v
	return s
}

// 企业反馈
type RtopCompanyFeedback struct {
	// 主键
	Id *int64 `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 企业ID
	CompanyId *string `json:"company_id,omitempty" xml:"company_id,omitempty" require:"true"`
	// 反馈原因
	FeedbackReason *string `json:"feedback_reason,omitempty" xml:"feedback_reason,omitempty" require:"true"`
	// 反馈原因详情
	FeedbackReasonDetail *string `json:"feedback_reason_detail,omitempty" xml:"feedback_reason_detail,omitempty" require:"true"`
	// 评论
	Comment *string `json:"comment,omitempty" xml:"comment,omitempty" require:"true"`
}

func (s RtopCompanyFeedback) String() string {
	return tea.Prettify(s)
}

func (s RtopCompanyFeedback) GoString() string {
	return s.String()
}

func (s *RtopCompanyFeedback) SetId(v int64) *RtopCompanyFeedback {
	s.Id = &v
	return s
}

func (s *RtopCompanyFeedback) SetCompanyId(v string) *RtopCompanyFeedback {
	s.CompanyId = &v
	return s
}

func (s *RtopCompanyFeedback) SetFeedbackReason(v string) *RtopCompanyFeedback {
	s.FeedbackReason = &v
	return s
}

func (s *RtopCompanyFeedback) SetFeedbackReasonDetail(v string) *RtopCompanyFeedback {
	s.FeedbackReasonDetail = &v
	return s
}

func (s *RtopCompanyFeedback) SetComment(v string) *RtopCompanyFeedback {
	s.Comment = &v
	return s
}

// 监测企业的特征信息
type RtopMonitorCompanyFeature struct {
	// 特征的描述
	Description *string `json:"description,omitempty" xml:"description,omitempty"`
	// 特征的名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 特征里的风险标签列表
	RiskTags []*string `json:"risk_tags,omitempty" xml:"risk_tags,omitempty" type:"Repeated"`
	// 特征的评分
	Score *int `json:"score,omitempty" xml:"score,omitempty" require:"true"`
}

func (s RtopMonitorCompanyFeature) String() string {
	return tea.Prettify(s)
}

func (s RtopMonitorCompanyFeature) GoString() string {
	return s.String()
}

func (s *RtopMonitorCompanyFeature) SetDescription(v string) *RtopMonitorCompanyFeature {
	s.Description = &v
	return s
}

func (s *RtopMonitorCompanyFeature) SetName(v string) *RtopMonitorCompanyFeature {
	s.Name = &v
	return s
}

func (s *RtopMonitorCompanyFeature) SetRiskTags(v []*string) *RtopMonitorCompanyFeature {
	s.RiskTags = v
	return s
}

func (s *RtopMonitorCompanyFeature) SetScore(v int) *RtopMonitorCompanyFeature {
	s.Score = &v
	return s
}

// 风报接口返回结构体
type RtopCompanyRiskInfo struct {
	// 区域类型
	PlaceType *string `json:"place_type,omitempty" xml:"place_type,omitempty"`
	// 区域
	PlaceName *string `json:"place_name,omitempty" xml:"place_name,omitempty"`
	// 企业唯一id
	MctOneId *string `json:"mct_one_id,omitempty" xml:"mct_one_id,omitempty"`
	// 企业统一社会信用代码
	UcCode *string `json:"uc_code,omitempty" xml:"uc_code,omitempty"`
	// 工商注册号
	RegNo *string `json:"reg_no,omitempty" xml:"reg_no,omitempty"`
	// 组织机构代码
	OrgCode *string `json:"org_code,omitempty" xml:"org_code,omitempty"`
	// 企业名
	OrgName *string `json:"org_name,omitempty" xml:"org_name,omitempty"`
	// 风险评分
	RiskScore *string `json:"risk_score,omitempty" xml:"risk_score,omitempty"`
	// 风险变化程度排序，根据分值波动大小，标签变更次数排序
	RiskShiftRank *string `json:"risk_shift_rank,omitempty" xml:"risk_shift_rank,omitempty"`
	// 风险定性
	RiskType *string `json:"risk_type,omitempty" xml:"risk_type,omitempty"`
	// 风险标签id列表
	RiskTagsId []*string `json:"risk_tags_id,omitempty" xml:"risk_tags_id,omitempty" type:"Repeated"`
	// 线索
	TagsClue *string `json:"tags_clue,omitempty" xml:"tags_clue,omitempty"`
	// 风险线索明细
	TagsClueDetail *string `json:"tags_clue_detail,omitempty" xml:"tags_clue_detail,omitempty"`
}

func (s RtopCompanyRiskInfo) String() string {
	return tea.Prettify(s)
}

func (s RtopCompanyRiskInfo) GoString() string {
	return s.String()
}

func (s *RtopCompanyRiskInfo) SetPlaceType(v string) *RtopCompanyRiskInfo {
	s.PlaceType = &v
	return s
}

func (s *RtopCompanyRiskInfo) SetPlaceName(v string) *RtopCompanyRiskInfo {
	s.PlaceName = &v
	return s
}

func (s *RtopCompanyRiskInfo) SetMctOneId(v string) *RtopCompanyRiskInfo {
	s.MctOneId = &v
	return s
}

func (s *RtopCompanyRiskInfo) SetUcCode(v string) *RtopCompanyRiskInfo {
	s.UcCode = &v
	return s
}

func (s *RtopCompanyRiskInfo) SetRegNo(v string) *RtopCompanyRiskInfo {
	s.RegNo = &v
	return s
}

func (s *RtopCompanyRiskInfo) SetOrgCode(v string) *RtopCompanyRiskInfo {
	s.OrgCode = &v
	return s
}

func (s *RtopCompanyRiskInfo) SetOrgName(v string) *RtopCompanyRiskInfo {
	s.OrgName = &v
	return s
}

func (s *RtopCompanyRiskInfo) SetRiskScore(v string) *RtopCompanyRiskInfo {
	s.RiskScore = &v
	return s
}

func (s *RtopCompanyRiskInfo) SetRiskShiftRank(v string) *RtopCompanyRiskInfo {
	s.RiskShiftRank = &v
	return s
}

func (s *RtopCompanyRiskInfo) SetRiskType(v string) *RtopCompanyRiskInfo {
	s.RiskType = &v
	return s
}

func (s *RtopCompanyRiskInfo) SetRiskTagsId(v []*string) *RtopCompanyRiskInfo {
	s.RiskTagsId = v
	return s
}

func (s *RtopCompanyRiskInfo) SetTagsClue(v string) *RtopCompanyRiskInfo {
	s.TagsClue = &v
	return s
}

func (s *RtopCompanyRiskInfo) SetTagsClueDetail(v string) *RtopCompanyRiskInfo {
	s.TagsClueDetail = &v
	return s
}

// 逾期信息查询响应
type OverdueInfoResponse struct {
	// 逾期标识
	// true：逾期
	// false：未逾期
	OverDueFlag *bool `json:"over_due_flag,omitempty" xml:"over_due_flag,omitempty" require:"true"`
	// 逾期天数
	OverDays *int64 `json:"over_days,omitempty" xml:"over_days,omitempty" require:"true"`
	// 逾期金额在50元以上的客户的逾期天数
	ValuableOverDays *int64 `json:"valuable_over_days,omitempty" xml:"valuable_over_days,omitempty" require:"true"`
	// 逾期期数
	OverPeriodCount *int64 `json:"over_period_count,omitempty" xml:"over_period_count,omitempty" require:"true"`
	// 逾期本金
	OverPrincipal *int64 `json:"over_principal,omitempty" xml:"over_principal,omitempty" require:"true"`
	// 逾期利息
	OverInterest *int64 `json:"over_interest,omitempty" xml:"over_interest,omitempty" require:"true"`
	// 应还罚息
	OverPunish *int64 `json:"over_punish,omitempty" xml:"over_punish,omitempty" require:"true"`
	// 应还逾期总额
	NeedOverdueAmount *int64 `json:"need_overdue_amount,omitempty" xml:"need_overdue_amount,omitempty" require:"true"`
	// 当前应还总额
	CurrentNeedAmount *int64 `json:"current_need_amount,omitempty" xml:"current_need_amount,omitempty" require:"true"`
	// 总剩余应还
	TotalAmount *int64 `json:"total_amount,omitempty" xml:"total_amount,omitempty" require:"true"`
	// 数据日期
	SettleDate *string `json:"settle_date,omitempty" xml:"settle_date,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 借款唯一编号
	ReceiptNo *string `json:"receipt_no,omitempty" xml:"receipt_no,omitempty" require:"true"`
	// 已还期数
	AlreadyRepayPeriodCount *int64 `json:"already_repay_period_count,omitempty" xml:"already_repay_period_count,omitempty" require:"true"`
	// 贷款期数
	LoanPeriodCount *int64 `json:"loan_period_count,omitempty" xml:"loan_period_count,omitempty" require:"true"`
	// 未还本金
	OutstandingPrincipal *int64 `json:"outstanding_principal,omitempty" xml:"outstanding_principal,omitempty" require:"true"`
	// 放款日期
	LoanTime *string `json:"loan_time,omitempty" xml:"loan_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 结清标志
	SettleFlag *bool `json:"settle_flag,omitempty" xml:"settle_flag,omitempty" require:"true"`
	// 最近一次还款日期
	NearestRepayTime *string `json:"nearest_repay_time,omitempty" xml:"nearest_repay_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
}

func (s OverdueInfoResponse) String() string {
	return tea.Prettify(s)
}

func (s OverdueInfoResponse) GoString() string {
	return s.String()
}

func (s *OverdueInfoResponse) SetOverDueFlag(v bool) *OverdueInfoResponse {
	s.OverDueFlag = &v
	return s
}

func (s *OverdueInfoResponse) SetOverDays(v int64) *OverdueInfoResponse {
	s.OverDays = &v
	return s
}

func (s *OverdueInfoResponse) SetValuableOverDays(v int64) *OverdueInfoResponse {
	s.ValuableOverDays = &v
	return s
}

func (s *OverdueInfoResponse) SetOverPeriodCount(v int64) *OverdueInfoResponse {
	s.OverPeriodCount = &v
	return s
}

func (s *OverdueInfoResponse) SetOverPrincipal(v int64) *OverdueInfoResponse {
	s.OverPrincipal = &v
	return s
}

func (s *OverdueInfoResponse) SetOverInterest(v int64) *OverdueInfoResponse {
	s.OverInterest = &v
	return s
}

func (s *OverdueInfoResponse) SetOverPunish(v int64) *OverdueInfoResponse {
	s.OverPunish = &v
	return s
}

func (s *OverdueInfoResponse) SetNeedOverdueAmount(v int64) *OverdueInfoResponse {
	s.NeedOverdueAmount = &v
	return s
}

func (s *OverdueInfoResponse) SetCurrentNeedAmount(v int64) *OverdueInfoResponse {
	s.CurrentNeedAmount = &v
	return s
}

func (s *OverdueInfoResponse) SetTotalAmount(v int64) *OverdueInfoResponse {
	s.TotalAmount = &v
	return s
}

func (s *OverdueInfoResponse) SetSettleDate(v string) *OverdueInfoResponse {
	s.SettleDate = &v
	return s
}

func (s *OverdueInfoResponse) SetReceiptNo(v string) *OverdueInfoResponse {
	s.ReceiptNo = &v
	return s
}

func (s *OverdueInfoResponse) SetAlreadyRepayPeriodCount(v int64) *OverdueInfoResponse {
	s.AlreadyRepayPeriodCount = &v
	return s
}

func (s *OverdueInfoResponse) SetLoanPeriodCount(v int64) *OverdueInfoResponse {
	s.LoanPeriodCount = &v
	return s
}

func (s *OverdueInfoResponse) SetOutstandingPrincipal(v int64) *OverdueInfoResponse {
	s.OutstandingPrincipal = &v
	return s
}

func (s *OverdueInfoResponse) SetLoanTime(v string) *OverdueInfoResponse {
	s.LoanTime = &v
	return s
}

func (s *OverdueInfoResponse) SetSettleFlag(v bool) *OverdueInfoResponse {
	s.SettleFlag = &v
	return s
}

func (s *OverdueInfoResponse) SetNearestRepayTime(v string) *OverdueInfoResponse {
	s.NearestRepayTime = &v
	return s
}

// 企业年报信息
type RtopRiskStormCompanyAnnualReport struct {
	// 年报个数
	AnnualReportCount *int64 `json:"annual_report_count,omitempty" xml:"annual_report_count,omitempty"`
	// 年报是否发生股权转让
	AnnualReportHasEquityTransfer *bool `json:"annual_report_has_equity_transfer,omitempty" xml:"annual_report_has_equity_transfer,omitempty"`
	// 年报是否对外提供担保
	AnnualReportHasExternalGuarantee *bool `json:"annual_report_has_external_guarantee,omitempty" xml:"annual_report_has_external_guarantee,omitempty"`
	// 年报是否对外投资
	AnnualReportHasExternalInvest *bool `json:"annual_report_has_external_invest,omitempty" xml:"annual_report_has_external_invest,omitempty"`
	// 营业总收入中主营业务收入
	AnnualReportMainBusinessIncome *string `json:"annual_report_main_business_income,omitempty" xml:"annual_report_main_business_income,omitempty"`
	// 年报净利润
	AnnualReportNetProfit *string `json:"annual_report_net_profit,omitempty" xml:"annual_report_net_profit,omitempty"`
	// 年报发布日期
	AnnualReportReleaseDate *string `json:"annual_report_release_date,omitempty" xml:"annual_report_release_date,omitempty"`
	// 年报股东实缴出资额（万元（实缴出资额用两个冒号::分割）
	AnnualReportShActualPaid *string `json:"annual_report_sh_actual_paid,omitempty" xml:"annual_report_sh_actual_paid,omitempty"`
	// 年报公司人数
	AnnualReportStaffCount *int64 `json:"annual_report_staff_count,omitempty" xml:"annual_report_staff_count,omitempty"`
	// 资产总额
	AnnualReportTotalAssets *string `json:"annual_report_total_assets,omitempty" xml:"annual_report_total_assets,omitempty"`
	// 负债总额
	AnnualReportTotalLiabilities *string `json:"annual_report_total_liabilities,omitempty" xml:"annual_report_total_liabilities,omitempty"`
	// 营业总收入
	AnnualReportTotalOperatingIncome *string `json:"annual_report_total_operating_income,omitempty" xml:"annual_report_total_operating_income,omitempty"`
	// 年报所有者权益合计
	AnnualReportTotalOwnerEquity *string `json:"annual_report_total_owner_equity,omitempty" xml:"annual_report_total_owner_equity,omitempty"`
	// 年报利润总额
	AnnualReportTotalProfit *string `json:"annual_report_total_profit,omitempty" xml:"annual_report_total_profit,omitempty"`
	// 纳税总额
	AnnualReportTotalTax *string `json:"annual_report_total_tax,omitempty" xml:"annual_report_total_tax,omitempty"`
	// 年报报送年度
	AnnualReportYear *string `json:"annual_report_year,omitempty" xml:"annual_report_year,omitempty"`
}

func (s RtopRiskStormCompanyAnnualReport) String() string {
	return tea.Prettify(s)
}

func (s RtopRiskStormCompanyAnnualReport) GoString() string {
	return s.String()
}

func (s *RtopRiskStormCompanyAnnualReport) SetAnnualReportCount(v int64) *RtopRiskStormCompanyAnnualReport {
	s.AnnualReportCount = &v
	return s
}

func (s *RtopRiskStormCompanyAnnualReport) SetAnnualReportHasEquityTransfer(v bool) *RtopRiskStormCompanyAnnualReport {
	s.AnnualReportHasEquityTransfer = &v
	return s
}

func (s *RtopRiskStormCompanyAnnualReport) SetAnnualReportHasExternalGuarantee(v bool) *RtopRiskStormCompanyAnnualReport {
	s.AnnualReportHasExternalGuarantee = &v
	return s
}

func (s *RtopRiskStormCompanyAnnualReport) SetAnnualReportHasExternalInvest(v bool) *RtopRiskStormCompanyAnnualReport {
	s.AnnualReportHasExternalInvest = &v
	return s
}

func (s *RtopRiskStormCompanyAnnualReport) SetAnnualReportMainBusinessIncome(v string) *RtopRiskStormCompanyAnnualReport {
	s.AnnualReportMainBusinessIncome = &v
	return s
}

func (s *RtopRiskStormCompanyAnnualReport) SetAnnualReportNetProfit(v string) *RtopRiskStormCompanyAnnualReport {
	s.AnnualReportNetProfit = &v
	return s
}

func (s *RtopRiskStormCompanyAnnualReport) SetAnnualReportReleaseDate(v string) *RtopRiskStormCompanyAnnualReport {
	s.AnnualReportReleaseDate = &v
	return s
}

func (s *RtopRiskStormCompanyAnnualReport) SetAnnualReportShActualPaid(v string) *RtopRiskStormCompanyAnnualReport {
	s.AnnualReportShActualPaid = &v
	return s
}

func (s *RtopRiskStormCompanyAnnualReport) SetAnnualReportStaffCount(v int64) *RtopRiskStormCompanyAnnualReport {
	s.AnnualReportStaffCount = &v
	return s
}

func (s *RtopRiskStormCompanyAnnualReport) SetAnnualReportTotalAssets(v string) *RtopRiskStormCompanyAnnualReport {
	s.AnnualReportTotalAssets = &v
	return s
}

func (s *RtopRiskStormCompanyAnnualReport) SetAnnualReportTotalLiabilities(v string) *RtopRiskStormCompanyAnnualReport {
	s.AnnualReportTotalLiabilities = &v
	return s
}

func (s *RtopRiskStormCompanyAnnualReport) SetAnnualReportTotalOperatingIncome(v string) *RtopRiskStormCompanyAnnualReport {
	s.AnnualReportTotalOperatingIncome = &v
	return s
}

func (s *RtopRiskStormCompanyAnnualReport) SetAnnualReportTotalOwnerEquity(v string) *RtopRiskStormCompanyAnnualReport {
	s.AnnualReportTotalOwnerEquity = &v
	return s
}

func (s *RtopRiskStormCompanyAnnualReport) SetAnnualReportTotalProfit(v string) *RtopRiskStormCompanyAnnualReport {
	s.AnnualReportTotalProfit = &v
	return s
}

func (s *RtopRiskStormCompanyAnnualReport) SetAnnualReportTotalTax(v string) *RtopRiskStormCompanyAnnualReport {
	s.AnnualReportTotalTax = &v
	return s
}

func (s *RtopRiskStormCompanyAnnualReport) SetAnnualReportYear(v string) *RtopRiskStormCompanyAnnualReport {
	s.AnnualReportYear = &v
	return s
}

// 营销盾场景策略上传结果
type StrategyUploadResult struct {
	// 元数据id
	RuleMetaId *int64 `json:"rule_meta_id,omitempty" xml:"rule_meta_id,omitempty"`
	// 场景id
	SceneId *int64 `json:"scene_id,omitempty" xml:"scene_id,omitempty"`
	// 租户场景id
	TenantSceneId *int64 `json:"tenant_scene_id,omitempty" xml:"tenant_scene_id,omitempty"`
	// 圈客规则id
	DecisionRuleId *int64 `json:"decision_rule_id,omitempty" xml:"decision_rule_id,omitempty"`
	// 场景策略id
	SceneStrategyId *int64 `json:"scene_strategy_id,omitempty" xml:"scene_strategy_id,omitempty"`
}

func (s StrategyUploadResult) String() string {
	return tea.Prettify(s)
}

func (s StrategyUploadResult) GoString() string {
	return s.String()
}

func (s *StrategyUploadResult) SetRuleMetaId(v int64) *StrategyUploadResult {
	s.RuleMetaId = &v
	return s
}

func (s *StrategyUploadResult) SetSceneId(v int64) *StrategyUploadResult {
	s.SceneId = &v
	return s
}

func (s *StrategyUploadResult) SetTenantSceneId(v int64) *StrategyUploadResult {
	s.TenantSceneId = &v
	return s
}

func (s *StrategyUploadResult) SetDecisionRuleId(v int64) *StrategyUploadResult {
	s.DecisionRuleId = &v
	return s
}

func (s *StrategyUploadResult) SetSceneStrategyId(v int64) *StrategyUploadResult {
	s.SceneStrategyId = &v
	return s
}

// 全局动态中的企业
type RtopRiskyCompany struct {
	// 企业ID
	CompanyId *string `json:"company_id,omitempty" xml:"company_id,omitempty" require:"true"`
	// 异动分数
	ChangeScore *string `json:"change_score,omitempty" xml:"change_score,omitempty" require:"true"`
	// 异动程度
	ChangeLevel *string `json:"change_level,omitempty" xml:"change_level,omitempty" require:"true"`
	// 新增企业的时间
	NewAddedTime *string `json:"new_added_time,omitempty" xml:"new_added_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 总公司注册地
	HeadRegisterPlace *string `json:"head_register_place,omitempty" xml:"head_register_place,omitempty" require:"true"`
	// 数据的时间
	DataTime *string `json:"data_time,omitempty" xml:"data_time,omitempty" require:"true"`
}

func (s RtopRiskyCompany) String() string {
	return tea.Prettify(s)
}

func (s RtopRiskyCompany) GoString() string {
	return s.String()
}

func (s *RtopRiskyCompany) SetCompanyId(v string) *RtopRiskyCompany {
	s.CompanyId = &v
	return s
}

func (s *RtopRiskyCompany) SetChangeScore(v string) *RtopRiskyCompany {
	s.ChangeScore = &v
	return s
}

func (s *RtopRiskyCompany) SetChangeLevel(v string) *RtopRiskyCompany {
	s.ChangeLevel = &v
	return s
}

func (s *RtopRiskyCompany) SetNewAddedTime(v string) *RtopRiskyCompany {
	s.NewAddedTime = &v
	return s
}

func (s *RtopRiskyCompany) SetHeadRegisterPlace(v string) *RtopRiskyCompany {
	s.HeadRegisterPlace = &v
	return s
}

func (s *RtopRiskyCompany) SetDataTime(v string) *RtopRiskyCompany {
	s.DataTime = &v
	return s
}

// zhima.customer.ep.identification.query
// 在认证完成后,商户可以查询认证的状态和结果
//
type ZhimaQueryResp struct {
	// 认证的企业证件号
	EpCertNo *string `json:"ep_cert_no,omitempty" xml:"ep_cert_no,omitempty"`
	// 认证的企业名
	EpName *string `json:"ep_name,omitempty" xml:"ep_name,omitempty"`
	// 认证不通过的错误码
	FailedCode *string `json:"failed_code,omitempty" xml:"failed_code,omitempty"`
	// 认证是否通过，通过为true，不通过为false
	Passed *string `json:"passed,omitempty" xml:"passed,omitempty"`
	//  10000是成功，其余是失败
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty" require:"true"`
	//
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty" require:"true"`
	//
	SubCode *string `json:"sub_code,omitempty" xml:"sub_code,omitempty"`
	//
	SubMsg *string `json:"sub_msg,omitempty" xml:"sub_msg,omitempty"`
}

func (s ZhimaQueryResp) String() string {
	return tea.Prettify(s)
}

func (s ZhimaQueryResp) GoString() string {
	return s.String()
}

func (s *ZhimaQueryResp) SetEpCertNo(v string) *ZhimaQueryResp {
	s.EpCertNo = &v
	return s
}

func (s *ZhimaQueryResp) SetEpName(v string) *ZhimaQueryResp {
	s.EpName = &v
	return s
}

func (s *ZhimaQueryResp) SetFailedCode(v string) *ZhimaQueryResp {
	s.FailedCode = &v
	return s
}

func (s *ZhimaQueryResp) SetPassed(v string) *ZhimaQueryResp {
	s.Passed = &v
	return s
}

func (s *ZhimaQueryResp) SetResultCode(v string) *ZhimaQueryResp {
	s.ResultCode = &v
	return s
}

func (s *ZhimaQueryResp) SetResultMsg(v string) *ZhimaQueryResp {
	s.ResultMsg = &v
	return s
}

func (s *ZhimaQueryResp) SetSubCode(v string) *ZhimaQueryResp {
	s.SubCode = &v
	return s
}

func (s *ZhimaQueryResp) SetSubMsg(v string) *ZhimaQueryResp {
	s.SubMsg = &v
	return s
}

// 机构平台通知响应结果
type DefinInnerChannelNotifyResult struct {
	// 请求编号
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty" require:"true"`
	// 业务响应Json
	BizResponse *string `json:"biz_response,omitempty" xml:"biz_response,omitempty" require:"true"`
}

func (s DefinInnerChannelNotifyResult) String() string {
	return tea.Prettify(s)
}

func (s DefinInnerChannelNotifyResult) GoString() string {
	return s.String()
}

func (s *DefinInnerChannelNotifyResult) SetRequestId(v string) *DefinInnerChannelNotifyResult {
	s.RequestId = &v
	return s
}

func (s *DefinInnerChannelNotifyResult) SetBizResponse(v string) *DefinInnerChannelNotifyResult {
	s.BizResponse = &v
	return s
}

// 企业涉众风险详细信息
type RtopCrowdRiskSummaryResp struct {
	// 活跃市
	ActiveCity *string `json:"active_city,omitempty" xml:"active_city,omitempty"`
	// 活跃县
	ActiveCounty *string `json:"active_county,omitempty" xml:"active_county,omitempty"`
	// 活跃省
	ActiveProvince *string `json:"active_province,omitempty" xml:"active_province,omitempty"`
	// 风险标签
	ClueTags []*string `json:"clue_tags,omitempty" xml:"clue_tags,omitempty" type:"Repeated"`
	// 企业ID
	CompanyId *string `json:"company_id,omitempty" xml:"company_id,omitempty" require:"true"`
	// 企业名称
	CompanyName *string `json:"company_name,omitempty" xml:"company_name,omitempty" require:"true"`
	// 风险等级
	CrowdRiskLevel *string `json:"crowd_risk_level,omitempty" xml:"crowd_risk_level,omitempty"`
	// 涉众风险分数
	CrowdRiskScore *int64 `json:"crowd_risk_score,omitempty" xml:"crowd_risk_score,omitempty"`
	// 涉众风险类型
	CrowdRiskType *string `json:"crowd_risk_type,omitempty" xml:"crowd_risk_type,omitempty"`
	// 发现时间
	DetectedTime *string `json:"detected_time,omitempty" xml:"detected_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 影响金额
	MoneyInvolved *int64 `json:"money_involved,omitempty" xml:"money_involved,omitempty"`
	// 影响人数
	PeopleInvolved *int64 `json:"people_involved,omitempty" xml:"people_involved,omitempty"`
	// 注册市
	RegisteredCity *string `json:"registered_city,omitempty" xml:"registered_city,omitempty"`
	// 注册县
	RegisteredCounty *string `json:"registered_county,omitempty" xml:"registered_county,omitempty"`
	// 注册省
	RegisteredProvince *string `json:"registered_province,omitempty" xml:"registered_province,omitempty"`
}

func (s RtopCrowdRiskSummaryResp) String() string {
	return tea.Prettify(s)
}

func (s RtopCrowdRiskSummaryResp) GoString() string {
	return s.String()
}

func (s *RtopCrowdRiskSummaryResp) SetActiveCity(v string) *RtopCrowdRiskSummaryResp {
	s.ActiveCity = &v
	return s
}

func (s *RtopCrowdRiskSummaryResp) SetActiveCounty(v string) *RtopCrowdRiskSummaryResp {
	s.ActiveCounty = &v
	return s
}

func (s *RtopCrowdRiskSummaryResp) SetActiveProvince(v string) *RtopCrowdRiskSummaryResp {
	s.ActiveProvince = &v
	return s
}

func (s *RtopCrowdRiskSummaryResp) SetClueTags(v []*string) *RtopCrowdRiskSummaryResp {
	s.ClueTags = v
	return s
}

func (s *RtopCrowdRiskSummaryResp) SetCompanyId(v string) *RtopCrowdRiskSummaryResp {
	s.CompanyId = &v
	return s
}

func (s *RtopCrowdRiskSummaryResp) SetCompanyName(v string) *RtopCrowdRiskSummaryResp {
	s.CompanyName = &v
	return s
}

func (s *RtopCrowdRiskSummaryResp) SetCrowdRiskLevel(v string) *RtopCrowdRiskSummaryResp {
	s.CrowdRiskLevel = &v
	return s
}

func (s *RtopCrowdRiskSummaryResp) SetCrowdRiskScore(v int64) *RtopCrowdRiskSummaryResp {
	s.CrowdRiskScore = &v
	return s
}

func (s *RtopCrowdRiskSummaryResp) SetCrowdRiskType(v string) *RtopCrowdRiskSummaryResp {
	s.CrowdRiskType = &v
	return s
}

func (s *RtopCrowdRiskSummaryResp) SetDetectedTime(v string) *RtopCrowdRiskSummaryResp {
	s.DetectedTime = &v
	return s
}

func (s *RtopCrowdRiskSummaryResp) SetMoneyInvolved(v int64) *RtopCrowdRiskSummaryResp {
	s.MoneyInvolved = &v
	return s
}

func (s *RtopCrowdRiskSummaryResp) SetPeopleInvolved(v int64) *RtopCrowdRiskSummaryResp {
	s.PeopleInvolved = &v
	return s
}

func (s *RtopCrowdRiskSummaryResp) SetRegisteredCity(v string) *RtopCrowdRiskSummaryResp {
	s.RegisteredCity = &v
	return s
}

func (s *RtopCrowdRiskSummaryResp) SetRegisteredCounty(v string) *RtopCrowdRiskSummaryResp {
	s.RegisteredCounty = &v
	return s
}

func (s *RtopCrowdRiskSummaryResp) SetRegisteredProvince(v string) *RtopCrowdRiskSummaryResp {
	s.RegisteredProvince = &v
	return s
}

// 标签配置全量信息
type RiskLabelConfigInfo struct {
	// id
	Id *int64 `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 线索ID
	TagId *string `json:"tag_id,omitempty" xml:"tag_id,omitempty" require:"true"`
	// 标签文本
	TagText *string `json:"tag_text,omitempty" xml:"tag_text,omitempty" require:"true"`
	// 风险维度
	RiskDimensionType *string `json:"risk_dimension_type,omitempty" xml:"risk_dimension_type,omitempty" require:"true"`
	// 线索类型
	RiskDetailType *string `json:"risk_detail_type,omitempty" xml:"risk_detail_type,omitempty" require:"true"`
	// 趋势图表名
	TagTrendChartName *string `json:"tag_trend_chart_name,omitempty" xml:"tag_trend_chart_name,omitempty" require:"true"`
	// 线索列表表头，英文逗号分隔
	TagListHeaders *string `json:"tag_list_headers,omitempty" xml:"tag_list_headers,omitempty" require:"true"`
	// 标签列表，排序字段
	TagListOrderColumn *string `json:"tag_list_order_column,omitempty" xml:"tag_list_order_column,omitempty" require:"true"`
	// 标签列表排序方式
	TagListOrderType *string `json:"tag_list_order_type,omitempty" xml:"tag_list_order_type,omitempty" require:"true"`
	// 标记删除
	IsDelete *int64 `json:"is_delete,omitempty" xml:"is_delete,omitempty" require:"true"`
	// 创建时间
	GmtCreate *string `json:"gmt_create,omitempty" xml:"gmt_create,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 修改时间
	GmtModified *string `json:"gmt_modified,omitempty" xml:"gmt_modified,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 操作人ID
	OperatorId *string `json:"operator_id,omitempty" xml:"operator_id,omitempty" require:"true"`
}

func (s RiskLabelConfigInfo) String() string {
	return tea.Prettify(s)
}

func (s RiskLabelConfigInfo) GoString() string {
	return s.String()
}

func (s *RiskLabelConfigInfo) SetId(v int64) *RiskLabelConfigInfo {
	s.Id = &v
	return s
}

func (s *RiskLabelConfigInfo) SetTagId(v string) *RiskLabelConfigInfo {
	s.TagId = &v
	return s
}

func (s *RiskLabelConfigInfo) SetTagText(v string) *RiskLabelConfigInfo {
	s.TagText = &v
	return s
}

func (s *RiskLabelConfigInfo) SetRiskDimensionType(v string) *RiskLabelConfigInfo {
	s.RiskDimensionType = &v
	return s
}

func (s *RiskLabelConfigInfo) SetRiskDetailType(v string) *RiskLabelConfigInfo {
	s.RiskDetailType = &v
	return s
}

func (s *RiskLabelConfigInfo) SetTagTrendChartName(v string) *RiskLabelConfigInfo {
	s.TagTrendChartName = &v
	return s
}

func (s *RiskLabelConfigInfo) SetTagListHeaders(v string) *RiskLabelConfigInfo {
	s.TagListHeaders = &v
	return s
}

func (s *RiskLabelConfigInfo) SetTagListOrderColumn(v string) *RiskLabelConfigInfo {
	s.TagListOrderColumn = &v
	return s
}

func (s *RiskLabelConfigInfo) SetTagListOrderType(v string) *RiskLabelConfigInfo {
	s.TagListOrderType = &v
	return s
}

func (s *RiskLabelConfigInfo) SetIsDelete(v int64) *RiskLabelConfigInfo {
	s.IsDelete = &v
	return s
}

func (s *RiskLabelConfigInfo) SetGmtCreate(v string) *RiskLabelConfigInfo {
	s.GmtCreate = &v
	return s
}

func (s *RiskLabelConfigInfo) SetGmtModified(v string) *RiskLabelConfigInfo {
	s.GmtModified = &v
	return s
}

func (s *RiskLabelConfigInfo) SetOperatorId(v string) *RiskLabelConfigInfo {
	s.OperatorId = &v
	return s
}

// 策略详情
type StrategyDetails struct {
	// 策略id
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 策略名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 决策结果
	Decision *string `json:"decision,omitempty" xml:"decision,omitempty" require:"true"`
	// 场景码
	SceneCode *string `json:"scene_code,omitempty" xml:"scene_code,omitempty" require:"true"`
}

func (s StrategyDetails) String() string {
	return tea.Prettify(s)
}

func (s StrategyDetails) GoString() string {
	return s.String()
}

func (s *StrategyDetails) SetId(v string) *StrategyDetails {
	s.Id = &v
	return s
}

func (s *StrategyDetails) SetName(v string) *StrategyDetails {
	s.Name = &v
	return s
}

func (s *StrategyDetails) SetDecision(v string) *StrategyDetails {
	s.Decision = &v
	return s
}

func (s *StrategyDetails) SetSceneCode(v string) *StrategyDetails {
	s.SceneCode = &v
	return s
}

// 反欺诈风险数据服务决策结果
type SecurityResultInfos struct {
	// 反欺诈风险数据服务风险建议决策
	Decision *string `json:"decision,omitempty" xml:"decision,omitempty" require:"true"`
	// 反欺诈风险数据服务风险分
	RiskScore *int64 `json:"risk_score,omitempty" xml:"risk_score,omitempty" require:"true"`
	// 反欺诈风险数据服务场景码
	SceneCode *string `json:"scene_code,omitempty" xml:"scene_code,omitempty" require:"true"`
}

func (s SecurityResultInfos) String() string {
	return tea.Prettify(s)
}

func (s SecurityResultInfos) GoString() string {
	return s.String()
}

func (s *SecurityResultInfos) SetDecision(v string) *SecurityResultInfos {
	s.Decision = &v
	return s
}

func (s *SecurityResultInfos) SetRiskScore(v int64) *SecurityResultInfos {
	s.RiskScore = &v
	return s
}

func (s *SecurityResultInfos) SetSceneCode(v string) *SecurityResultInfos {
	s.SceneCode = &v
	return s
}

// 企业影响人数年龄分布统计
type RtopAgeDistribution struct {
	// 年龄
	Age *string `json:"age,omitempty" xml:"age,omitempty" require:"true"`
	// 统计值
	Count *int `json:"count,omitempty" xml:"count,omitempty" require:"true"`
}

func (s RtopAgeDistribution) String() string {
	return tea.Prettify(s)
}

func (s RtopAgeDistribution) GoString() string {
	return s.String()
}

func (s *RtopAgeDistribution) SetAge(v string) *RtopAgeDistribution {
	s.Age = &v
	return s
}

func (s *RtopAgeDistribution) SetCount(v int) *RtopAgeDistribution {
	s.Count = &v
	return s
}

// 企业信息
type CompanyInfo struct {
	// 活跃地json
	ActiveAddrJson *string `json:"active_addr_json,omitempty" xml:"active_addr_json,omitempty" require:"true"`
	// 活跃市(字段停用)
	ActiveCity *string `json:"active_city,omitempty" xml:"active_city,omitempty" require:"true"`
	// 活跃县(字段停用)
	ActiveCounty *string `json:"active_county,omitempty" xml:"active_county,omitempty" require:"true"`
	// 活跃省(字段停用)
	ActiveProvince *string `json:"active_province,omitempty" xml:"active_province,omitempty" require:"true"`
	// 类经融行业分类
	Categories *string `json:"categories,omitempty" xml:"categories,omitempty" require:"true"`
	// 核准日期
	CheckDate *string `json:"check_date,omitempty" xml:"check_date,omitempty" require:"true"`
	// 删除标志
	DelFlag *string `json:"del_flag,omitempty" xml:"del_flag,omitempty" require:"true"`
	// odps数据产生时间，业务上不关心
	Dt *string `json:"dt,omitempty" xml:"dt,omitempty" require:"true"`
	// 企业曾用名
	FormerOrgNames *string `json:"former_org_names,omitempty" xml:"former_org_names,omitempty" require:"true"`
	// {"mct_one_id":"ID1","org_name":"总公司名称1"}
	HeadOffice *string `json:"head_office,omitempty" xml:"head_office,omitempty" require:"true"`
	// 记录ID
	Id *int64 `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 影响金额
	InvolvedAmount *int64 `json:"involved_amount,omitempty" xml:"involved_amount,omitempty" require:"true"`
	// 影响人数
	InvolvedPeople *int64 `json:"involved_people,omitempty" xml:"involved_people,omitempty" require:"true"`
	// 重要关联企业,json格式
	KeyRelaOrgs *string `json:"key_rela_orgs,omitempty" xml:"key_rela_orgs,omitempty" require:"true"`
	// 法人
	LegalRepresentative *string `json:"legal_representative,omitempty" xml:"legal_representative,omitempty" require:"true"`
	// 企业ID
	MctOneId *string `json:"mct_one_id,omitempty" xml:"mct_one_id,omitempty" require:"true"`
	// 经营地json
	OperatingAddrJson *string `json:"operating_addr_json,omitempty" xml:"operating_addr_json,omitempty" require:"true"`
	// 经营市(字段停用)
	OperatingCity *string `json:"operating_city,omitempty" xml:"operating_city,omitempty" require:"true"`
	// 经营县(字段停用)
	OperatingCounty *string `json:"operating_county,omitempty" xml:"operating_county,omitempty" require:"true"`
	// 经营地址(字段停用)
	OperatingPlace *string `json:"operating_place,omitempty" xml:"operating_place,omitempty" require:"true"`
	// 经营省(字段停用)
	OperatingProvince *string `json:"operating_province,omitempty" xml:"operating_province,omitempty" require:"true"`
	// 营运状态(1:营运0:不营运)
	OprtActvState *string `json:"oprt_actv_state,omitempty" xml:"oprt_actv_state,omitempty" require:"true"`
	// 经营期限至
	OprtEndDate *string `json:"oprt_end_date,omitempty" xml:"oprt_end_date,omitempty" require:"true"`
	// 经营范围
	OprtScope *string `json:"oprt_scope,omitempty" xml:"oprt_scope,omitempty" require:"true"`
	// 经营期限自
	OprtStartDate *string `json:"oprt_start_date,omitempty" xml:"oprt_start_date,omitempty" require:"true"`
	// 操作类型
	//
	OpType *string `json:"op_type,omitempty" xml:"op_type,omitempty" require:"true"`
	// 组织机构代码
	OrgCode *string `json:"org_code,omitempty" xml:"org_code,omitempty" require:"true"`
	// 电子邮箱
	OrgEmail *string `json:"org_email,omitempty" xml:"org_email,omitempty" require:"true"`
	// 企业名
	OrgName *string `json:"org_name,omitempty" xml:"org_name,omitempty" require:"true"`
	// 注册资本折人民币(万元)
	OrgRegCptlRmb *string `json:"org_reg_cptl_rmb,omitempty" xml:"org_reg_cptl_rmb,omitempty" require:"true"`
	// 企业状态
	OrgState *string `json:"org_state,omitempty" xml:"org_state,omitempty" require:"true"`
	// 联系电话
	OrgTel *string `json:"org_tel,omitempty" xml:"org_tel,omitempty" require:"true"`
	// 企业类型
	OrgType *string `json:"org_type,omitempty" xml:"org_type,omitempty" require:"true"`
	// 平台名
	PlatformName *string `json:"platform_name,omitempty" xml:"platform_name,omitempty" require:"true"`
	// 平台状态
	PlatformStates *string `json:"platform_states,omitempty" xml:"platform_states,omitempty" require:"true"`
	// 注册资本币种
	RegisterCapitalCurrency *string `json:"register_capital_currency,omitempty" xml:"register_capital_currency,omitempty" require:"true"`
	// 注册资本值
	RegisterCapitalValue *string `json:"register_capital_value,omitempty" xml:"register_capital_value,omitempty" require:"true"`
	// 注册市
	RegisterCity *string `json:"register_city,omitempty" xml:"register_city,omitempty" require:"true"`
	// 注册区县
	RegisterCounty *string `json:"register_county,omitempty" xml:"register_county,omitempty" require:"true"`
	// 注册时间
	RegisterDate *string `json:"register_date,omitempty" xml:"register_date,omitempty" require:"true"`
	// 注册地址
	RegisterPlace *string `json:"register_place,omitempty" xml:"register_place,omitempty" require:"true"`
	// 注册省
	RegisterProvince *string `json:"register_province,omitempty" xml:"register_province,omitempty" require:"true"`
	// 登记机关
	RegistrationAuthority *string `json:"registration_authority,omitempty" xml:"registration_authority,omitempty" require:"true"`
	// 工商注册号
	RegNo *string `json:"reg_no,omitempty" xml:"reg_no,omitempty" require:"true"`
	// 风报企业ID
	RiskstormCompanyId *string `json:"riskstorm_company_id,omitempty" xml:"riskstorm_company_id,omitempty" require:"true"`
	// 风险维度
	RiskFactors *string `json:"risk_factors,omitempty" xml:"risk_factors,omitempty" require:"true"`
	// 风险图谱可视化数据
	RiskGraphJson *string `json:"risk_graph_json,omitempty" xml:"risk_graph_json,omitempty" require:"true"`
	// 风险报文
	RiskMessage *string `json:"risk_message,omitempty" xml:"risk_message,omitempty" require:"true"`
	// 风险指数
	RiskScore *int64 `json:"risk_score,omitempty" xml:"risk_score,omitempty" require:"true"`
	// 风险指数，按日的趋势图
	RiskScoreTrend *string `json:"risk_score_trend,omitempty" xml:"risk_score_trend,omitempty" require:"true"`
	// 风险指数周波动
	RiskScoreWeeklyFloat *int64 `json:"risk_score_weekly_float,omitempty" xml:"risk_score_weekly_float,omitempty" require:"true"`
	// 风险标签(字段停用)
	RiskTags *string `json:"risk_tags,omitempty" xml:"risk_tags,omitempty" require:"true"`
	// 风险标签ID
	RiskTagsId *string `json:"risk_tags_id,omitempty" xml:"risk_tags_id,omitempty" require:"true"`
	// 风险定性
	RiskType *string `json:"risk_type,omitempty" xml:"risk_type,omitempty" require:"true"`
	// 搜索内容
	SearchContent *string `json:"search_content,omitempty" xml:"search_content,omitempty" require:"true"`
	// 传播人次
	SpreadNumber *int64 `json:"spread_number,omitempty" xml:"spread_number,omitempty" require:"true"`
	// 影响地区人次分布,json格式如下
	SpreadNumDistribution *string `json:"spread_num_distribution,omitempty" xml:"spread_num_distribution,omitempty" require:"true"`
	// 社会统一信用代码
	UcCode *string `json:"uc_code,omitempty" xml:"uc_code,omitempty" require:"true"`
	// 公有云数据库产生时间
	UpdateDate *string `json:"update_date,omitempty" xml:"update_date,omitempty" require:"true"`
	// 平台json
	Platform *string `json:"platform,omitempty" xml:"platform,omitempty" require:"true"`
}

func (s CompanyInfo) String() string {
	return tea.Prettify(s)
}

func (s CompanyInfo) GoString() string {
	return s.String()
}

func (s *CompanyInfo) SetActiveAddrJson(v string) *CompanyInfo {
	s.ActiveAddrJson = &v
	return s
}

func (s *CompanyInfo) SetActiveCity(v string) *CompanyInfo {
	s.ActiveCity = &v
	return s
}

func (s *CompanyInfo) SetActiveCounty(v string) *CompanyInfo {
	s.ActiveCounty = &v
	return s
}

func (s *CompanyInfo) SetActiveProvince(v string) *CompanyInfo {
	s.ActiveProvince = &v
	return s
}

func (s *CompanyInfo) SetCategories(v string) *CompanyInfo {
	s.Categories = &v
	return s
}

func (s *CompanyInfo) SetCheckDate(v string) *CompanyInfo {
	s.CheckDate = &v
	return s
}

func (s *CompanyInfo) SetDelFlag(v string) *CompanyInfo {
	s.DelFlag = &v
	return s
}

func (s *CompanyInfo) SetDt(v string) *CompanyInfo {
	s.Dt = &v
	return s
}

func (s *CompanyInfo) SetFormerOrgNames(v string) *CompanyInfo {
	s.FormerOrgNames = &v
	return s
}

func (s *CompanyInfo) SetHeadOffice(v string) *CompanyInfo {
	s.HeadOffice = &v
	return s
}

func (s *CompanyInfo) SetId(v int64) *CompanyInfo {
	s.Id = &v
	return s
}

func (s *CompanyInfo) SetInvolvedAmount(v int64) *CompanyInfo {
	s.InvolvedAmount = &v
	return s
}

func (s *CompanyInfo) SetInvolvedPeople(v int64) *CompanyInfo {
	s.InvolvedPeople = &v
	return s
}

func (s *CompanyInfo) SetKeyRelaOrgs(v string) *CompanyInfo {
	s.KeyRelaOrgs = &v
	return s
}

func (s *CompanyInfo) SetLegalRepresentative(v string) *CompanyInfo {
	s.LegalRepresentative = &v
	return s
}

func (s *CompanyInfo) SetMctOneId(v string) *CompanyInfo {
	s.MctOneId = &v
	return s
}

func (s *CompanyInfo) SetOperatingAddrJson(v string) *CompanyInfo {
	s.OperatingAddrJson = &v
	return s
}

func (s *CompanyInfo) SetOperatingCity(v string) *CompanyInfo {
	s.OperatingCity = &v
	return s
}

func (s *CompanyInfo) SetOperatingCounty(v string) *CompanyInfo {
	s.OperatingCounty = &v
	return s
}

func (s *CompanyInfo) SetOperatingPlace(v string) *CompanyInfo {
	s.OperatingPlace = &v
	return s
}

func (s *CompanyInfo) SetOperatingProvince(v string) *CompanyInfo {
	s.OperatingProvince = &v
	return s
}

func (s *CompanyInfo) SetOprtActvState(v string) *CompanyInfo {
	s.OprtActvState = &v
	return s
}

func (s *CompanyInfo) SetOprtEndDate(v string) *CompanyInfo {
	s.OprtEndDate = &v
	return s
}

func (s *CompanyInfo) SetOprtScope(v string) *CompanyInfo {
	s.OprtScope = &v
	return s
}

func (s *CompanyInfo) SetOprtStartDate(v string) *CompanyInfo {
	s.OprtStartDate = &v
	return s
}

func (s *CompanyInfo) SetOpType(v string) *CompanyInfo {
	s.OpType = &v
	return s
}

func (s *CompanyInfo) SetOrgCode(v string) *CompanyInfo {
	s.OrgCode = &v
	return s
}

func (s *CompanyInfo) SetOrgEmail(v string) *CompanyInfo {
	s.OrgEmail = &v
	return s
}

func (s *CompanyInfo) SetOrgName(v string) *CompanyInfo {
	s.OrgName = &v
	return s
}

func (s *CompanyInfo) SetOrgRegCptlRmb(v string) *CompanyInfo {
	s.OrgRegCptlRmb = &v
	return s
}

func (s *CompanyInfo) SetOrgState(v string) *CompanyInfo {
	s.OrgState = &v
	return s
}

func (s *CompanyInfo) SetOrgTel(v string) *CompanyInfo {
	s.OrgTel = &v
	return s
}

func (s *CompanyInfo) SetOrgType(v string) *CompanyInfo {
	s.OrgType = &v
	return s
}

func (s *CompanyInfo) SetPlatformName(v string) *CompanyInfo {
	s.PlatformName = &v
	return s
}

func (s *CompanyInfo) SetPlatformStates(v string) *CompanyInfo {
	s.PlatformStates = &v
	return s
}

func (s *CompanyInfo) SetRegisterCapitalCurrency(v string) *CompanyInfo {
	s.RegisterCapitalCurrency = &v
	return s
}

func (s *CompanyInfo) SetRegisterCapitalValue(v string) *CompanyInfo {
	s.RegisterCapitalValue = &v
	return s
}

func (s *CompanyInfo) SetRegisterCity(v string) *CompanyInfo {
	s.RegisterCity = &v
	return s
}

func (s *CompanyInfo) SetRegisterCounty(v string) *CompanyInfo {
	s.RegisterCounty = &v
	return s
}

func (s *CompanyInfo) SetRegisterDate(v string) *CompanyInfo {
	s.RegisterDate = &v
	return s
}

func (s *CompanyInfo) SetRegisterPlace(v string) *CompanyInfo {
	s.RegisterPlace = &v
	return s
}

func (s *CompanyInfo) SetRegisterProvince(v string) *CompanyInfo {
	s.RegisterProvince = &v
	return s
}

func (s *CompanyInfo) SetRegistrationAuthority(v string) *CompanyInfo {
	s.RegistrationAuthority = &v
	return s
}

func (s *CompanyInfo) SetRegNo(v string) *CompanyInfo {
	s.RegNo = &v
	return s
}

func (s *CompanyInfo) SetRiskstormCompanyId(v string) *CompanyInfo {
	s.RiskstormCompanyId = &v
	return s
}

func (s *CompanyInfo) SetRiskFactors(v string) *CompanyInfo {
	s.RiskFactors = &v
	return s
}

func (s *CompanyInfo) SetRiskGraphJson(v string) *CompanyInfo {
	s.RiskGraphJson = &v
	return s
}

func (s *CompanyInfo) SetRiskMessage(v string) *CompanyInfo {
	s.RiskMessage = &v
	return s
}

func (s *CompanyInfo) SetRiskScore(v int64) *CompanyInfo {
	s.RiskScore = &v
	return s
}

func (s *CompanyInfo) SetRiskScoreTrend(v string) *CompanyInfo {
	s.RiskScoreTrend = &v
	return s
}

func (s *CompanyInfo) SetRiskScoreWeeklyFloat(v int64) *CompanyInfo {
	s.RiskScoreWeeklyFloat = &v
	return s
}

func (s *CompanyInfo) SetRiskTags(v string) *CompanyInfo {
	s.RiskTags = &v
	return s
}

func (s *CompanyInfo) SetRiskTagsId(v string) *CompanyInfo {
	s.RiskTagsId = &v
	return s
}

func (s *CompanyInfo) SetRiskType(v string) *CompanyInfo {
	s.RiskType = &v
	return s
}

func (s *CompanyInfo) SetSearchContent(v string) *CompanyInfo {
	s.SearchContent = &v
	return s
}

func (s *CompanyInfo) SetSpreadNumber(v int64) *CompanyInfo {
	s.SpreadNumber = &v
	return s
}

func (s *CompanyInfo) SetSpreadNumDistribution(v string) *CompanyInfo {
	s.SpreadNumDistribution = &v
	return s
}

func (s *CompanyInfo) SetUcCode(v string) *CompanyInfo {
	s.UcCode = &v
	return s
}

func (s *CompanyInfo) SetUpdateDate(v string) *CompanyInfo {
	s.UpdateDate = &v
	return s
}

func (s *CompanyInfo) SetPlatform(v string) *CompanyInfo {
	s.Platform = &v
	return s
}

// 营销盾事件信息同步详情
type EventResultSyncDetail struct {
	// 事件唯一id（单个租户全局唯一）
	EventId *string `json:"event_id,omitempty" xml:"event_id,omitempty" require:"true"`
	// 营销计划id
	PlanId *string `json:"plan_id,omitempty" xml:"plan_id,omitempty" require:"true"`
	// 消息id
	MsgId *string `json:"msg_id,omitempty" xml:"msg_id,omitempty" require:"true"`
	// 事件时间
	EventTime *string `json:"event_time,omitempty" xml:"event_time,omitempty" require:"true"`
	// 事件类型：1为富信贴尾
	EventType *int64 `json:"event_type,omitempty" xml:"event_type,omitempty" require:"true"`
	// 1为成功 2为失败
	State *int64 `json:"state,omitempty" xml:"state,omitempty" require:"true"`
	// 用户key类型
	KeyType *string `json:"key_type,omitempty" xml:"key_type,omitempty" require:"true"`
	// 手机号
	CustomerKey *string `json:"customer_key,omitempty" xml:"customer_key,omitempty" require:"true"`
	// 扩展字段
	ExtData *string `json:"ext_data,omitempty" xml:"ext_data,omitempty" require:"true"`
}

func (s EventResultSyncDetail) String() string {
	return tea.Prettify(s)
}

func (s EventResultSyncDetail) GoString() string {
	return s.String()
}

func (s *EventResultSyncDetail) SetEventId(v string) *EventResultSyncDetail {
	s.EventId = &v
	return s
}

func (s *EventResultSyncDetail) SetPlanId(v string) *EventResultSyncDetail {
	s.PlanId = &v
	return s
}

func (s *EventResultSyncDetail) SetMsgId(v string) *EventResultSyncDetail {
	s.MsgId = &v
	return s
}

func (s *EventResultSyncDetail) SetEventTime(v string) *EventResultSyncDetail {
	s.EventTime = &v
	return s
}

func (s *EventResultSyncDetail) SetEventType(v int64) *EventResultSyncDetail {
	s.EventType = &v
	return s
}

func (s *EventResultSyncDetail) SetState(v int64) *EventResultSyncDetail {
	s.State = &v
	return s
}

func (s *EventResultSyncDetail) SetKeyType(v string) *EventResultSyncDetail {
	s.KeyType = &v
	return s
}

func (s *EventResultSyncDetail) SetCustomerKey(v string) *EventResultSyncDetail {
	s.CustomerKey = &v
	return s
}

func (s *EventResultSyncDetail) SetExtData(v string) *EventResultSyncDetail {
	s.ExtData = &v
	return s
}

// 预警企业
type RtopCompanyAlarm struct {
	// 企业ID
	CompanyId *string `json:"company_id,omitempty" xml:"company_id,omitempty" require:"true"`
	// 预警类型
	AlarmType *string `json:"alarm_type,omitempty" xml:"alarm_type,omitempty" require:"true"`
	// 预警序号
	AlarmIdx *string `json:"alarm_idx,omitempty" xml:"alarm_idx,omitempty" require:"true"`
	// 预警日期
	AlarmDate *string `json:"alarm_date,omitempty" xml:"alarm_date,omitempty" require:"true"`
	// 预警标识，是否需要预警
	AlarmFlag *string `json:"alarm_flag,omitempty" xml:"alarm_flag,omitempty" require:"true"`
}

func (s RtopCompanyAlarm) String() string {
	return tea.Prettify(s)
}

func (s RtopCompanyAlarm) GoString() string {
	return s.String()
}

func (s *RtopCompanyAlarm) SetCompanyId(v string) *RtopCompanyAlarm {
	s.CompanyId = &v
	return s
}

func (s *RtopCompanyAlarm) SetAlarmType(v string) *RtopCompanyAlarm {
	s.AlarmType = &v
	return s
}

func (s *RtopCompanyAlarm) SetAlarmIdx(v string) *RtopCompanyAlarm {
	s.AlarmIdx = &v
	return s
}

func (s *RtopCompanyAlarm) SetAlarmDate(v string) *RtopCompanyAlarm {
	s.AlarmDate = &v
	return s
}

func (s *RtopCompanyAlarm) SetAlarmFlag(v string) *RtopCompanyAlarm {
	s.AlarmFlag = &v
	return s
}

// 通用响应结构体
type RpcommonResp struct {
	// 调用是否成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty" require:"true"`
	// 结果描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty" require:"true"`
	// 结果码
	ResponseCode *string `json:"response_code,omitempty" xml:"response_code,omitempty" require:"true"`
	// 具体返回值.jsonString形式
	Data *string `json:"data,omitempty" xml:"data,omitempty" require:"true"`
}

func (s RpcommonResp) String() string {
	return tea.Prettify(s)
}

func (s RpcommonResp) GoString() string {
	return s.String()
}

func (s *RpcommonResp) SetSuccess(v bool) *RpcommonResp {
	s.Success = &v
	return s
}

func (s *RpcommonResp) SetResultMsg(v string) *RpcommonResp {
	s.ResultMsg = &v
	return s
}

func (s *RpcommonResp) SetResponseCode(v string) *RpcommonResp {
	s.ResponseCode = &v
	return s
}

func (s *RpcommonResp) SetData(v string) *RpcommonResp {
	s.Data = &v
	return s
}

// 标签图片
type RtopTagImage struct {
	// 标签图片表主键
	Id *int64 `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 图片
	Image *string `json:"image,omitempty" xml:"image,omitempty"`
}

func (s RtopTagImage) String() string {
	return tea.Prettify(s)
}

func (s RtopTagImage) GoString() string {
	return s.String()
}

func (s *RtopTagImage) SetId(v int64) *RtopTagImage {
	s.Id = &v
	return s
}

func (s *RtopTagImage) SetImage(v string) *RtopTagImage {
	s.Image = &v
	return s
}

// 企业影响人数性别分布统计
type RtopGenderDistribution struct {
	// 统计值
	Count *int `json:"count,omitempty" xml:"count,omitempty" require:"true"`
	// 性别
	Gender *string `json:"gender,omitempty" xml:"gender,omitempty" require:"true"`
}

func (s RtopGenderDistribution) String() string {
	return tea.Prettify(s)
}

func (s RtopGenderDistribution) GoString() string {
	return s.String()
}

func (s *RtopGenderDistribution) SetCount(v int) *RtopGenderDistribution {
	s.Count = &v
	return s
}

func (s *RtopGenderDistribution) SetGender(v string) *RtopGenderDistribution {
	s.Gender = &v
	return s
}

// 是否联登结构体
type CustomRelationStatus struct {
	// 是否联登
	RegFlag *bool `json:"reg_flag,omitempty" xml:"reg_flag,omitempty"`
}

func (s CustomRelationStatus) String() string {
	return tea.Prettify(s)
}

func (s CustomRelationStatus) GoString() string {
	return s.String()
}

func (s *CustomRelationStatus) SetRegFlag(v bool) *CustomRelationStatus {
	s.RegFlag = &v
	return s
}

// 风险基因-点
type RtopRiskGeneNode struct {
	// 主企业唯一ID
	MainCompanyId *string `json:"main_company_id,omitempty" xml:"main_company_id,omitempty"`
	// 主企业名称
	MainCompanyName *string `json:"main_company_name,omitempty" xml:"main_company_name,omitempty"`
	// 节点唯一ID
	NodeId *string `json:"node_id,omitempty" xml:"node_id,omitempty"`
	// 节点名称
	NodeName *string `json:"node_name,omitempty" xml:"node_name,omitempty"`
	// 节点证件号码
	NodeCertNo *string `json:"node_cert_no,omitempty" xml:"node_cert_no,omitempty"`
	// 节点类型，枚举值
	NodeType *string `json:"node_type,omitempty" xml:"node_type,omitempty"`
	// 节点扩展信息
	NodeExtJson *string `json:"node_ext_json,omitempty" xml:"node_ext_json,omitempty"`
	// 基因模式
	RiskLabel *string `json:"risk_label,omitempty" xml:"risk_label,omitempty"`
	// 基因模式
	RiskMode *string `json:"risk_mode,omitempty" xml:"risk_mode,omitempty"`
}

func (s RtopRiskGeneNode) String() string {
	return tea.Prettify(s)
}

func (s RtopRiskGeneNode) GoString() string {
	return s.String()
}

func (s *RtopRiskGeneNode) SetMainCompanyId(v string) *RtopRiskGeneNode {
	s.MainCompanyId = &v
	return s
}

func (s *RtopRiskGeneNode) SetMainCompanyName(v string) *RtopRiskGeneNode {
	s.MainCompanyName = &v
	return s
}

func (s *RtopRiskGeneNode) SetNodeId(v string) *RtopRiskGeneNode {
	s.NodeId = &v
	return s
}

func (s *RtopRiskGeneNode) SetNodeName(v string) *RtopRiskGeneNode {
	s.NodeName = &v
	return s
}

func (s *RtopRiskGeneNode) SetNodeCertNo(v string) *RtopRiskGeneNode {
	s.NodeCertNo = &v
	return s
}

func (s *RtopRiskGeneNode) SetNodeType(v string) *RtopRiskGeneNode {
	s.NodeType = &v
	return s
}

func (s *RtopRiskGeneNode) SetNodeExtJson(v string) *RtopRiskGeneNode {
	s.NodeExtJson = &v
	return s
}

func (s *RtopRiskGeneNode) SetRiskLabel(v string) *RtopRiskGeneNode {
	s.RiskLabel = &v
	return s
}

func (s *RtopRiskGeneNode) SetRiskMode(v string) *RtopRiskGeneNode {
	s.RiskMode = &v
	return s
}

// 企业影响人数分布统计
type RtopPopulationDistribution struct {
	// 市
	City *string `json:"city,omitempty" xml:"city,omitempty" require:"true"`
	// 统计值
	Count *int `json:"count,omitempty" xml:"count,omitempty" require:"true"`
}

func (s RtopPopulationDistribution) String() string {
	return tea.Prettify(s)
}

func (s RtopPopulationDistribution) GoString() string {
	return s.String()
}

func (s *RtopPopulationDistribution) SetCity(v string) *RtopPopulationDistribution {
	s.City = &v
	return s
}

func (s *RtopPopulationDistribution) SetCount(v int) *RtopPopulationDistribution {
	s.Count = &v
	return s
}

// 天枢文件信息统一结构体
type DubheFileInfo struct {
	// 文件访问路径
	FilePath *string `json:"file_path,omitempty" xml:"file_path,omitempty" require:"true"`
}

func (s DubheFileInfo) String() string {
	return tea.Prettify(s)
}

func (s DubheFileInfo) GoString() string {
	return s.String()
}

func (s *DubheFileInfo) SetFilePath(v string) *DubheFileInfo {
	s.FilePath = &v
	return s
}

// 服务上下文包括环境信息和用户信息
type ServiceContext struct {
	// 客户端IP
	ClientIp *string `json:"client_ip,omitempty" xml:"client_ip,omitempty"`
	// 客户端UMID
	ClientPcidguid *string `json:"client_pcidguid,omitempty" xml:"client_pcidguid,omitempty"`
	// 服务器名
	ServerName *string `json:"server_name,omitempty" xml:"server_name,omitempty"`
	// 会话ID
	SessionId *string `json:"session_id,omitempty" xml:"session_id,omitempty"`
	// 用户ID
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty"`
}

func (s ServiceContext) String() string {
	return tea.Prettify(s)
}

func (s ServiceContext) GoString() string {
	return s.String()
}

func (s *ServiceContext) SetClientIp(v string) *ServiceContext {
	s.ClientIp = &v
	return s
}

func (s *ServiceContext) SetClientPcidguid(v string) *ServiceContext {
	s.ClientPcidguid = &v
	return s
}

func (s *ServiceContext) SetServerName(v string) *ServiceContext {
	s.ServerName = &v
	return s
}

func (s *ServiceContext) SetSessionId(v string) *ServiceContext {
	s.SessionId = &v
	return s
}

func (s *ServiceContext) SetUserId(v string) *ServiceContext {
	s.UserId = &v
	return s
}

// 营销盾实时圈客结果返回model
type CustomerUmktInfoModel struct {
	// 基本圈客结果信息
	BaseInfo *BaseCustomerUmktInfoModel `json:"base_info,omitempty" xml:"base_info,omitempty" require:"true"`
	// 额外的营销分结果
	UmktOutPutInfo *string `json:"umkt_out_put_info,omitempty" xml:"umkt_out_put_info,omitempty"`
}

func (s CustomerUmktInfoModel) String() string {
	return tea.Prettify(s)
}

func (s CustomerUmktInfoModel) GoString() string {
	return s.String()
}

func (s *CustomerUmktInfoModel) SetBaseInfo(v *BaseCustomerUmktInfoModel) *CustomerUmktInfoModel {
	s.BaseInfo = v
	return s
}

func (s *CustomerUmktInfoModel) SetUmktOutPutInfo(v string) *CustomerUmktInfoModel {
	s.UmktOutPutInfo = &v
	return s
}

// 模型结果详情
//
type ModelDetails struct {
	// 风险场景编码
	SceneCode *string `json:"scene_code,omitempty" xml:"scene_code,omitempty" require:"true"`
	// 该风险场景的风险分值
	//
	Score *string `json:"score,omitempty" xml:"score,omitempty" require:"true"`
}

func (s ModelDetails) String() string {
	return tea.Prettify(s)
}

func (s ModelDetails) GoString() string {
	return s.String()
}

func (s *ModelDetails) SetSceneCode(v string) *ModelDetails {
	s.SceneCode = &v
	return s
}

func (s *ModelDetails) SetScore(v string) *ModelDetails {
	s.Score = &v
	return s
}

// 企业舆情数量
type RtopCompanyOpinionCount struct {
	// 企业名称
	CompanyName *string `json:"company_name,omitempty" xml:"company_name,omitempty" require:"true"`
	// 企业对应的舆情数量
	Count *int `json:"count,omitempty" xml:"count,omitempty" require:"true"`
}

func (s RtopCompanyOpinionCount) String() string {
	return tea.Prettify(s)
}

func (s RtopCompanyOpinionCount) GoString() string {
	return s.String()
}

func (s *RtopCompanyOpinionCount) SetCompanyName(v string) *RtopCompanyOpinionCount {
	s.CompanyName = &v
	return s
}

func (s *RtopCompanyOpinionCount) SetCount(v int) *RtopCompanyOpinionCount {
	s.Count = &v
	return s
}

// 企业地区分布统计
type RtopRegionalDistribution struct {
	// 统计值
	Count *int64 `json:"count,omitempty" xml:"count,omitempty" require:"true"`
	// 地区
	Place *string `json:"place,omitempty" xml:"place,omitempty" require:"true"`
	// 当前地区的涉众风险类型分布，即非法集资有多少企业，传销有多少企业
	TypeDistribution []*RtopTypeDistribution `json:"type_distribution,omitempty" xml:"type_distribution,omitempty" type:"Repeated"`
}

func (s RtopRegionalDistribution) String() string {
	return tea.Prettify(s)
}

func (s RtopRegionalDistribution) GoString() string {
	return s.String()
}

func (s *RtopRegionalDistribution) SetCount(v int64) *RtopRegionalDistribution {
	s.Count = &v
	return s
}

func (s *RtopRegionalDistribution) SetPlace(v string) *RtopRegionalDistribution {
	s.Place = &v
	return s
}

func (s *RtopRegionalDistribution) SetTypeDistribution(v []*RtopTypeDistribution) *RtopRegionalDistribution {
	s.TypeDistribution = v
	return s
}

// 标签过滤配置
type RiskLabelFilterConfigInfo struct {
	// 创建时间
	GmtCreate *string `json:"gmt_create,omitempty" xml:"gmt_create,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 修改时间
	GmtModified *string `json:"gmt_modified,omitempty" xml:"gmt_modified,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// id
	Id *int64 `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 是否为基本筛选标签
	IsBase *int64 `json:"is_base,omitempty" xml:"is_base,omitempty" require:"true"`
	// 标记删除
	IsDelete *int64 `json:"is_delete,omitempty" xml:"is_delete,omitempty" require:"true"`
	// 操作人员ID
	OperatorId *string `json:"operator_id,omitempty" xml:"operator_id,omitempty" require:"true"`
	// 地区名
	PlaceName *string `json:"place_name,omitempty" xml:"place_name,omitempty" require:"true"`
	// 地区类型
	PlaceType *string `json:"place_type,omitempty" xml:"place_type,omitempty" require:"true"`
	// 标签ID
	TagId *string `json:"tag_id,omitempty" xml:"tag_id,omitempty" require:"true"`
}

func (s RiskLabelFilterConfigInfo) String() string {
	return tea.Prettify(s)
}

func (s RiskLabelFilterConfigInfo) GoString() string {
	return s.String()
}

func (s *RiskLabelFilterConfigInfo) SetGmtCreate(v string) *RiskLabelFilterConfigInfo {
	s.GmtCreate = &v
	return s
}

func (s *RiskLabelFilterConfigInfo) SetGmtModified(v string) *RiskLabelFilterConfigInfo {
	s.GmtModified = &v
	return s
}

func (s *RiskLabelFilterConfigInfo) SetId(v int64) *RiskLabelFilterConfigInfo {
	s.Id = &v
	return s
}

func (s *RiskLabelFilterConfigInfo) SetIsBase(v int64) *RiskLabelFilterConfigInfo {
	s.IsBase = &v
	return s
}

func (s *RiskLabelFilterConfigInfo) SetIsDelete(v int64) *RiskLabelFilterConfigInfo {
	s.IsDelete = &v
	return s
}

func (s *RiskLabelFilterConfigInfo) SetOperatorId(v string) *RiskLabelFilterConfigInfo {
	s.OperatorId = &v
	return s
}

func (s *RiskLabelFilterConfigInfo) SetPlaceName(v string) *RiskLabelFilterConfigInfo {
	s.PlaceName = &v
	return s
}

func (s *RiskLabelFilterConfigInfo) SetPlaceType(v string) *RiskLabelFilterConfigInfo {
	s.PlaceType = &v
	return s
}

func (s *RiskLabelFilterConfigInfo) SetTagId(v string) *RiskLabelFilterConfigInfo {
	s.TagId = &v
	return s
}

// 天枢系统职业信息
type JobInfo struct {
	// 职业
	JobType *string `json:"job_type,omitempty" xml:"job_type,omitempty"`
	// 职务
	WorkPosition *string `json:"work_position,omitempty" xml:"work_position,omitempty"`
	// 工作年限
	JobLife *string `json:"job_life,omitempty" xml:"job_life,omitempty"`
	// 本单位工作年限
	CurrentJobLife *int64 `json:"current_job_life,omitempty" xml:"current_job_life,omitempty"`
	// 公司名称
	CompanyName *string `json:"company_name,omitempty" xml:"company_name,omitempty"`
	// 公司行业类型
	CompanyIndustryType *string `json:"company_industry_type,omitempty" xml:"company_industry_type,omitempty"`
	// 公司电话
	CompanyTel *string `json:"company_tel,omitempty" xml:"company_tel,omitempty"`
	// 公司省份
	CompanyProvince *string `json:"company_province,omitempty" xml:"company_province,omitempty"`
	// 公司城市
	CompanyCity *string `json:"company_city,omitempty" xml:"company_city,omitempty"`
	// 公司区域
	CompanyArea *string `json:"company_area,omitempty" xml:"company_area,omitempty"`
	// 公司街道
	CompanyStreet *string `json:"company_street,omitempty" xml:"company_street,omitempty"`
	// 公司详细地址
	CompanyAddress *string `json:"company_address,omitempty" xml:"company_address,omitempty"`
	// 年收入
	YearSalary *int64 `json:"year_salary,omitempty" xml:"year_salary,omitempty"`
}

func (s JobInfo) String() string {
	return tea.Prettify(s)
}

func (s JobInfo) GoString() string {
	return s.String()
}

func (s *JobInfo) SetJobType(v string) *JobInfo {
	s.JobType = &v
	return s
}

func (s *JobInfo) SetWorkPosition(v string) *JobInfo {
	s.WorkPosition = &v
	return s
}

func (s *JobInfo) SetJobLife(v string) *JobInfo {
	s.JobLife = &v
	return s
}

func (s *JobInfo) SetCurrentJobLife(v int64) *JobInfo {
	s.CurrentJobLife = &v
	return s
}

func (s *JobInfo) SetCompanyName(v string) *JobInfo {
	s.CompanyName = &v
	return s
}

func (s *JobInfo) SetCompanyIndustryType(v string) *JobInfo {
	s.CompanyIndustryType = &v
	return s
}

func (s *JobInfo) SetCompanyTel(v string) *JobInfo {
	s.CompanyTel = &v
	return s
}

func (s *JobInfo) SetCompanyProvince(v string) *JobInfo {
	s.CompanyProvince = &v
	return s
}

func (s *JobInfo) SetCompanyCity(v string) *JobInfo {
	s.CompanyCity = &v
	return s
}

func (s *JobInfo) SetCompanyArea(v string) *JobInfo {
	s.CompanyArea = &v
	return s
}

func (s *JobInfo) SetCompanyStreet(v string) *JobInfo {
	s.CompanyStreet = &v
	return s
}

func (s *JobInfo) SetCompanyAddress(v string) *JobInfo {
	s.CompanyAddress = &v
	return s
}

func (s *JobInfo) SetYearSalary(v int64) *JobInfo {
	s.YearSalary = &v
	return s
}

// 涉众风险企业特征
type RtopCrowdRiskFeatureResp struct {
	// 特征标签列表
	ClueTags []*RtopCrowdRiskFeatureTag `json:"clue_tags,omitempty" xml:"clue_tags,omitempty" type:"Repeated"`
	// 特征名称
	FeatureName *string `json:"feature_name,omitempty" xml:"feature_name,omitempty" require:"true"`
	// 特征​分数
	Score *int `json:"score,omitempty" xml:"score,omitempty" require:"true"`
}

func (s RtopCrowdRiskFeatureResp) String() string {
	return tea.Prettify(s)
}

func (s RtopCrowdRiskFeatureResp) GoString() string {
	return s.String()
}

func (s *RtopCrowdRiskFeatureResp) SetClueTags(v []*RtopCrowdRiskFeatureTag) *RtopCrowdRiskFeatureResp {
	s.ClueTags = v
	return s
}

func (s *RtopCrowdRiskFeatureResp) SetFeatureName(v string) *RtopCrowdRiskFeatureResp {
	s.FeatureName = &v
	return s
}

func (s *RtopCrowdRiskFeatureResp) SetScore(v int) *RtopCrowdRiskFeatureResp {
	s.Score = &v
	return s
}

// 天枢系统居住信息结构体
type LiveInfo struct {
	// 居住省份
	LiveProvince *string `json:"live_province,omitempty" xml:"live_province,omitempty"`
	// 居住城市
	LiveCity *string `json:"live_city,omitempty" xml:"live_city,omitempty"`
	// 居住区域
	LiveArea *string `json:"live_area,omitempty" xml:"live_area,omitempty"`
	// 居住街道
	LiveStreet *string `json:"live_street,omitempty" xml:"live_street,omitempty"`
	// 居住详细地址
	LiveAddress *string `json:"live_address,omitempty" xml:"live_address,omitempty"`
	// 居住年限
	LiveYears *int64 `json:"live_years,omitempty" xml:"live_years,omitempty"`
}

func (s LiveInfo) String() string {
	return tea.Prettify(s)
}

func (s LiveInfo) GoString() string {
	return s.String()
}

func (s *LiveInfo) SetLiveProvince(v string) *LiveInfo {
	s.LiveProvince = &v
	return s
}

func (s *LiveInfo) SetLiveCity(v string) *LiveInfo {
	s.LiveCity = &v
	return s
}

func (s *LiveInfo) SetLiveArea(v string) *LiveInfo {
	s.LiveArea = &v
	return s
}

func (s *LiveInfo) SetLiveStreet(v string) *LiveInfo {
	s.LiveStreet = &v
	return s
}

func (s *LiveInfo) SetLiveAddress(v string) *LiveInfo {
	s.LiveAddress = &v
	return s
}

func (s *LiveInfo) SetLiveYears(v int64) *LiveInfo {
	s.LiveYears = &v
	return s
}

// 风报风险标签统计
type RiskStormLabelResp struct {
	// 标签次数
	LabelCount *int `json:"label_count,omitempty" xml:"label_count,omitempty" require:"true"`
	// 标签id
	LabelId *string `json:"label_id,omitempty" xml:"label_id,omitempty" require:"true"`
	// 标签名称
	LabelName *string `json:"label_name,omitempty" xml:"label_name,omitempty" require:"true"`
}

func (s RiskStormLabelResp) String() string {
	return tea.Prettify(s)
}

func (s RiskStormLabelResp) GoString() string {
	return s.String()
}

func (s *RiskStormLabelResp) SetLabelCount(v int) *RiskStormLabelResp {
	s.LabelCount = &v
	return s
}

func (s *RiskStormLabelResp) SetLabelId(v string) *RiskStormLabelResp {
	s.LabelId = &v
	return s
}

func (s *RiskStormLabelResp) SetLabelName(v string) *RiskStormLabelResp {
	s.LabelName = &v
	return s
}

// 待还款信息
type RepayInfo struct {
	// true：逾期
	// false：未逾期
	OverdueFlag *bool `json:"overdue_flag,omitempty" xml:"overdue_flag,omitempty" require:"true"`
	// 逾期天数
	OverDays *int64 `json:"over_days,omitempty" xml:"over_days,omitempty" require:"true"`
	// 逾期金额在50元以上的客户的逾期天数
	ValuableOverDays *int64 `json:"valuable_over_days,omitempty" xml:"valuable_over_days,omitempty" require:"true"`
	// 逾期期数
	OverPeriodCount *int64 `json:"over_period_count,omitempty" xml:"over_period_count,omitempty" require:"true"`
	// 逾期本金
	OverPrincipal *int64 `json:"over_principal,omitempty" xml:"over_principal,omitempty" require:"true"`
	// 逾期利息
	OverInterest *int64 `json:"over_interest,omitempty" xml:"over_interest,omitempty" require:"true"`
	// 应还罚息
	OverPunish *int64 `json:"over_punish,omitempty" xml:"over_punish,omitempty" require:"true"`
	// 应还逾期总额
	NeedOverdueAmount *int64 `json:"need_overdue_amount,omitempty" xml:"need_overdue_amount,omitempty" require:"true"`
	// 当前应还总额（包含逾期和当前期）
	CurrentNeedAmount *int64 `json:"current_need_amount,omitempty" xml:"current_need_amount,omitempty" require:"true"`
	// 总剩余应还
	TotalAmount *int64 `json:"total_amount,omitempty" xml:"total_amount,omitempty" require:"true"`
}

func (s RepayInfo) String() string {
	return tea.Prettify(s)
}

func (s RepayInfo) GoString() string {
	return s.String()
}

func (s *RepayInfo) SetOverdueFlag(v bool) *RepayInfo {
	s.OverdueFlag = &v
	return s
}

func (s *RepayInfo) SetOverDays(v int64) *RepayInfo {
	s.OverDays = &v
	return s
}

func (s *RepayInfo) SetValuableOverDays(v int64) *RepayInfo {
	s.ValuableOverDays = &v
	return s
}

func (s *RepayInfo) SetOverPeriodCount(v int64) *RepayInfo {
	s.OverPeriodCount = &v
	return s
}

func (s *RepayInfo) SetOverPrincipal(v int64) *RepayInfo {
	s.OverPrincipal = &v
	return s
}

func (s *RepayInfo) SetOverInterest(v int64) *RepayInfo {
	s.OverInterest = &v
	return s
}

func (s *RepayInfo) SetOverPunish(v int64) *RepayInfo {
	s.OverPunish = &v
	return s
}

func (s *RepayInfo) SetNeedOverdueAmount(v int64) *RepayInfo {
	s.NeedOverdueAmount = &v
	return s
}

func (s *RepayInfo) SetCurrentNeedAmount(v int64) *RepayInfo {
	s.CurrentNeedAmount = &v
	return s
}

func (s *RepayInfo) SetTotalAmount(v int64) *RepayInfo {
	s.TotalAmount = &v
	return s
}

// 芝麻四要素认证接口
type ZhimaIdentifyResp struct {
	// 唯一ID，接口正常的话有此字段
	BizNo *string `json:"biz_no,omitempty" xml:"biz_no,omitempty"`
	// 带参数的回调地址，接口正常的话有此字段
	CertifyUrl *string `json:"certify_url,omitempty" xml:"certify_url,omitempty"`
	// 蚂蚁调用芝麻的错误码
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty" require:"true"`
	// 蚂蚁调用芝麻的结果描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty" require:"true"`
	// 蚂蚁调用芝麻的错误码
	SubCode *string `json:"sub_code,omitempty" xml:"sub_code,omitempty"`
	// 蚂蚁调用芝麻信息
	SubMsg *string `json:"sub_msg,omitempty" xml:"sub_msg,omitempty"`
}

func (s ZhimaIdentifyResp) String() string {
	return tea.Prettify(s)
}

func (s ZhimaIdentifyResp) GoString() string {
	return s.String()
}

func (s *ZhimaIdentifyResp) SetBizNo(v string) *ZhimaIdentifyResp {
	s.BizNo = &v
	return s
}

func (s *ZhimaIdentifyResp) SetCertifyUrl(v string) *ZhimaIdentifyResp {
	s.CertifyUrl = &v
	return s
}

func (s *ZhimaIdentifyResp) SetResultCode(v string) *ZhimaIdentifyResp {
	s.ResultCode = &v
	return s
}

func (s *ZhimaIdentifyResp) SetResultMsg(v string) *ZhimaIdentifyResp {
	s.ResultMsg = &v
	return s
}

func (s *ZhimaIdentifyResp) SetSubCode(v string) *ZhimaIdentifyResp {
	s.SubCode = &v
	return s
}

func (s *ZhimaIdentifyResp) SetSubMsg(v string) *ZhimaIdentifyResp {
	s.SubMsg = &v
	return s
}

// 天枢系统专用CreditAmount结构体
type CreditAmount struct {
	// 授信额度
	CreditAmount *int64 `json:"credit_amount,omitempty" xml:"credit_amount,omitempty" require:"true"`
	// 授信余额
	RestAmount *int64 `json:"rest_amount,omitempty" xml:"rest_amount,omitempty" require:"true"`
	// 发放日期
	PayDate *string `json:"pay_date,omitempty" xml:"pay_date,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 到期日期
	ExpireDate *string `json:"expire_date,omitempty" xml:"expire_date,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 利率单位(1:年，2：月，3：日)
	RateUnit *string `json:"rate_unit,omitempty" xml:"rate_unit,omitempty" require:"true"`
	// 执行利率,利率值，单位%
	// 年化5%，rateValue=5
	//
	RateValue *int64 `json:"rate_value,omitempty" xml:"rate_value,omitempty" require:"true"`
	// 还款方式1等额本息2等额本金3先息后本4一次性利随本清5只还本金6等本等息
	RepayWay *string `json:"repay_way,omitempty" xml:"repay_way,omitempty" require:"true"`
	// 状态0-正常 1-冻结 2-终止
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
}

func (s CreditAmount) String() string {
	return tea.Prettify(s)
}

func (s CreditAmount) GoString() string {
	return s.String()
}

func (s *CreditAmount) SetCreditAmount(v int64) *CreditAmount {
	s.CreditAmount = &v
	return s
}

func (s *CreditAmount) SetRestAmount(v int64) *CreditAmount {
	s.RestAmount = &v
	return s
}

func (s *CreditAmount) SetPayDate(v string) *CreditAmount {
	s.PayDate = &v
	return s
}

func (s *CreditAmount) SetExpireDate(v string) *CreditAmount {
	s.ExpireDate = &v
	return s
}

func (s *CreditAmount) SetRateUnit(v string) *CreditAmount {
	s.RateUnit = &v
	return s
}

func (s *CreditAmount) SetRateValue(v int64) *CreditAmount {
	s.RateValue = &v
	return s
}

func (s *CreditAmount) SetRepayWay(v string) *CreditAmount {
	s.RepayWay = &v
	return s
}

func (s *CreditAmount) SetStatus(v string) *CreditAmount {
	s.Status = &v
	return s
}

// 舆情的详情
type RtopCompanyOpinionDetail struct {
	// 具体的舆情内容
	DocContent *string `json:"doc_content,omitempty" xml:"doc_content,omitempty" require:"true"`
	// 舆情的id
	DocId *string `json:"doc_id,omitempty" xml:"doc_id,omitempty" require:"true"`
	// 舆情的标题
	DocTitle *string `json:"doc_title,omitempty" xml:"doc_title,omitempty" require:"true"`
	// 舆情的url
	DocUrl *string `json:"doc_url,omitempty" xml:"doc_url,omitempty" require:"true"`
	// 情感得分
	EmotionScore *string `json:"emotion_score,omitempty" xml:"emotion_score,omitempty"`
	// 实体相关度得分
	EntityRelevancyScore *string `json:"entity_relevancy_score,omitempty" xml:"entity_relevancy_score,omitempty"`
	// 命中的关键词
	HitKeywords *string `json:"hit_keywords,omitempty" xml:"hit_keywords,omitempty"`
	// 媒体影响力得分
	MediaInfluenceScore *string `json:"media_influence_score,omitempty" xml:"media_influence_score,omitempty"`
	// 来源媒体
	MediaName *string `json:"media_name,omitempty" xml:"media_name,omitempty" require:"true"`
	// 媒体传播得分
	MediaPropagationScore *string `json:"media_propagation_score,omitempty" xml:"media_propagation_score,omitempty"`
	// 舆情的发布时间
	PublishTime *string `json:"publish_time,omitempty" xml:"publish_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 相似文章数
	SimilarDocs *int `json:"similar_docs,omitempty" xml:"similar_docs,omitempty"`
}

func (s RtopCompanyOpinionDetail) String() string {
	return tea.Prettify(s)
}

func (s RtopCompanyOpinionDetail) GoString() string {
	return s.String()
}

func (s *RtopCompanyOpinionDetail) SetDocContent(v string) *RtopCompanyOpinionDetail {
	s.DocContent = &v
	return s
}

func (s *RtopCompanyOpinionDetail) SetDocId(v string) *RtopCompanyOpinionDetail {
	s.DocId = &v
	return s
}

func (s *RtopCompanyOpinionDetail) SetDocTitle(v string) *RtopCompanyOpinionDetail {
	s.DocTitle = &v
	return s
}

func (s *RtopCompanyOpinionDetail) SetDocUrl(v string) *RtopCompanyOpinionDetail {
	s.DocUrl = &v
	return s
}

func (s *RtopCompanyOpinionDetail) SetEmotionScore(v string) *RtopCompanyOpinionDetail {
	s.EmotionScore = &v
	return s
}

func (s *RtopCompanyOpinionDetail) SetEntityRelevancyScore(v string) *RtopCompanyOpinionDetail {
	s.EntityRelevancyScore = &v
	return s
}

func (s *RtopCompanyOpinionDetail) SetHitKeywords(v string) *RtopCompanyOpinionDetail {
	s.HitKeywords = &v
	return s
}

func (s *RtopCompanyOpinionDetail) SetMediaInfluenceScore(v string) *RtopCompanyOpinionDetail {
	s.MediaInfluenceScore = &v
	return s
}

func (s *RtopCompanyOpinionDetail) SetMediaName(v string) *RtopCompanyOpinionDetail {
	s.MediaName = &v
	return s
}

func (s *RtopCompanyOpinionDetail) SetMediaPropagationScore(v string) *RtopCompanyOpinionDetail {
	s.MediaPropagationScore = &v
	return s
}

func (s *RtopCompanyOpinionDetail) SetPublishTime(v string) *RtopCompanyOpinionDetail {
	s.PublishTime = &v
	return s
}

func (s *RtopCompanyOpinionDetail) SetSimilarDocs(v int) *RtopCompanyOpinionDetail {
	s.SimilarDocs = &v
	return s
}

// 云通信短信发送结果
type SmsReponse struct {
	// 发送回执ID
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 请求状态码; OK表示成功, 其他表示失败
	Code *string `json:"code,omitempty" xml:"code,omitempty" require:"true"`
	// 是否调用接口成功的描述
	Message *string `json:"message,omitempty" xml:"message,omitempty" require:"true"`
	// 请求ID
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty" require:"true"`
}

func (s SmsReponse) String() string {
	return tea.Prettify(s)
}

func (s SmsReponse) GoString() string {
	return s.String()
}

func (s *SmsReponse) SetBizId(v string) *SmsReponse {
	s.BizId = &v
	return s
}

func (s *SmsReponse) SetCode(v string) *SmsReponse {
	s.Code = &v
	return s
}

func (s *SmsReponse) SetMessage(v string) *SmsReponse {
	s.Message = &v
	return s
}

func (s *SmsReponse) SetRequestId(v string) *SmsReponse {
	s.RequestId = &v
	return s
}

// 天枢专用RepayTrail结构体
type RepayTrail struct {
	// 期数
	Period *string `json:"period,omitempty" xml:"period,omitempty" require:"true"`
	// 每期应还金额
	NeedAmt *int64 `json:"need_amt,omitempty" xml:"need_amt,omitempty" require:"true"`
	// 每期已还金额
	AlreadyAmt *int64 `json:"already_amt,omitempty" xml:"already_amt,omitempty" require:"true"`
	// 每期应还本金
	TransPrincipal *int64 `json:"trans_principal,omitempty" xml:"trans_principal,omitempty" require:"true"`
	// 每期应还利息
	TransInterest *int64 `json:"trans_interest,omitempty" xml:"trans_interest,omitempty" require:"true"`
	// 每期还款费用
	TransFee *int64 `json:"trans_fee,omitempty" xml:"trans_fee,omitempty" require:"true"`
	// 剩余本金
	RemainPrincipal *int64 `json:"remain_principal,omitempty" xml:"remain_principal,omitempty" require:"true"`
	// 还款时间
	RepayTime *string `json:"repay_time,omitempty" xml:"repay_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 计息开始时间
	StartTime *string `json:"start_time,omitempty" xml:"start_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 计息结束时间
	EndTime *string `json:"end_time,omitempty" xml:"end_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 试算编号
	TrialNo *string `json:"trial_no,omitempty" xml:"trial_no,omitempty" require:"true"`
}

func (s RepayTrail) String() string {
	return tea.Prettify(s)
}

func (s RepayTrail) GoString() string {
	return s.String()
}

func (s *RepayTrail) SetPeriod(v string) *RepayTrail {
	s.Period = &v
	return s
}

func (s *RepayTrail) SetNeedAmt(v int64) *RepayTrail {
	s.NeedAmt = &v
	return s
}

func (s *RepayTrail) SetAlreadyAmt(v int64) *RepayTrail {
	s.AlreadyAmt = &v
	return s
}

func (s *RepayTrail) SetTransPrincipal(v int64) *RepayTrail {
	s.TransPrincipal = &v
	return s
}

func (s *RepayTrail) SetTransInterest(v int64) *RepayTrail {
	s.TransInterest = &v
	return s
}

func (s *RepayTrail) SetTransFee(v int64) *RepayTrail {
	s.TransFee = &v
	return s
}

func (s *RepayTrail) SetRemainPrincipal(v int64) *RepayTrail {
	s.RemainPrincipal = &v
	return s
}

func (s *RepayTrail) SetRepayTime(v string) *RepayTrail {
	s.RepayTime = &v
	return s
}

func (s *RepayTrail) SetStartTime(v string) *RepayTrail {
	s.StartTime = &v
	return s
}

func (s *RepayTrail) SetEndTime(v string) *RepayTrail {
	s.EndTime = &v
	return s
}

func (s *RepayTrail) SetTrialNo(v string) *RepayTrail {
	s.TrialNo = &v
	return s
}

// 授信状态
type CustomStatus struct {
	// 是否进行过授信申请
	ApplyFlag *bool `json:"apply_flag,omitempty" xml:"apply_flag,omitempty"`
	// 0:通过； 1:拒绝； 2:处理中；
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 拒绝原因
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
}

func (s CustomStatus) String() string {
	return tea.Prettify(s)
}

func (s CustomStatus) GoString() string {
	return s.String()
}

func (s *CustomStatus) SetApplyFlag(v bool) *CustomStatus {
	s.ApplyFlag = &v
	return s
}

func (s *CustomStatus) SetStatus(v string) *CustomStatus {
	s.Status = &v
	return s
}

func (s *CustomStatus) SetMsg(v string) *CustomStatus {
	s.Msg = &v
	return s
}

// 键值对
type XNameValuePair struct {
	// 键名
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 键值
	Value *string `json:"value,omitempty" xml:"value,omitempty" require:"true"`
}

func (s XNameValuePair) String() string {
	return tea.Prettify(s)
}

func (s XNameValuePair) GoString() string {
	return s.String()
}

func (s *XNameValuePair) SetName(v string) *XNameValuePair {
	s.Name = &v
	return s
}

func (s *XNameValuePair) SetValue(v string) *XNameValuePair {
	s.Value = &v
	return s
}

type QuerySecurityPolicyRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 风险类型：表示风险处理或风险咨询——process/advice
	RiskType       *string         `json:"risk_type,omitempty" xml:"risk_type,omitempty" require:"true"`
	SecurityScene  *SecurityScene  `json:"security_scene,omitempty" xml:"security_scene,omitempty" require:"true"`
	ServiceContext *ServiceContext `json:"service_context,omitempty" xml:"service_context,omitempty" require:"true"`
}

func (s QuerySecurityPolicyRequest) String() string {
	return tea.Prettify(s)
}

func (s QuerySecurityPolicyRequest) GoString() string {
	return s.String()
}

func (s *QuerySecurityPolicyRequest) SetAuthToken(v string) *QuerySecurityPolicyRequest {
	s.AuthToken = &v
	return s
}

func (s *QuerySecurityPolicyRequest) SetProductInstanceId(v string) *QuerySecurityPolicyRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QuerySecurityPolicyRequest) SetRiskType(v string) *QuerySecurityPolicyRequest {
	s.RiskType = &v
	return s
}

func (s *QuerySecurityPolicyRequest) SetSecurityScene(v *SecurityScene) *QuerySecurityPolicyRequest {
	s.SecurityScene = v
	return s
}

func (s *QuerySecurityPolicyRequest) SetServiceContext(v *ServiceContext) *QuerySecurityPolicyRequest {
	s.ServiceContext = v
	return s
}

type QuerySecurityPolicyResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 风险咨询情况下返回的风险等级，风险处理不会返回该值
	Level *int64 `json:"level,omitempty" xml:"level,omitempty"`
	// 反馈成功之后的id
	SecurityId *string `json:"security_id,omitempty" xml:"security_id,omitempty"`
	// 安全处理结果，枚举值为：reject[拒绝],validate[校验],accept[放过]
	SecurityResult *string `json:"security_result,omitempty" xml:"security_result,omitempty"`
	// 是否成功
	Success *string `json:"success,omitempty" xml:"success,omitempty" require:"true"`
	// 有风险需要失败业务情况下的返回码
	TemplateCode *string `json:"template_code,omitempty" xml:"template_code,omitempty"`
	// 有风险需要失败业务情况下的返回码描述
	TemplateDesc *string `json:"template_desc,omitempty" xml:"template_desc,omitempty"`
	// native场景下的核身id
	VerifyId *string `json:"verify_id,omitempty" xml:"verify_id,omitempty"`
	// h5场景下的核身地址
	VerifyUrl *string `json:"verify_url,omitempty" xml:"verify_url,omitempty"`
}

func (s QuerySecurityPolicyResponse) String() string {
	return tea.Prettify(s)
}

func (s QuerySecurityPolicyResponse) GoString() string {
	return s.String()
}

func (s *QuerySecurityPolicyResponse) SetReqMsgId(v string) *QuerySecurityPolicyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QuerySecurityPolicyResponse) SetResultCode(v string) *QuerySecurityPolicyResponse {
	s.ResultCode = &v
	return s
}

func (s *QuerySecurityPolicyResponse) SetResultMsg(v string) *QuerySecurityPolicyResponse {
	s.ResultMsg = &v
	return s
}

func (s *QuerySecurityPolicyResponse) SetLevel(v int64) *QuerySecurityPolicyResponse {
	s.Level = &v
	return s
}

func (s *QuerySecurityPolicyResponse) SetSecurityId(v string) *QuerySecurityPolicyResponse {
	s.SecurityId = &v
	return s
}

func (s *QuerySecurityPolicyResponse) SetSecurityResult(v string) *QuerySecurityPolicyResponse {
	s.SecurityResult = &v
	return s
}

func (s *QuerySecurityPolicyResponse) SetSuccess(v string) *QuerySecurityPolicyResponse {
	s.Success = &v
	return s
}

func (s *QuerySecurityPolicyResponse) SetTemplateCode(v string) *QuerySecurityPolicyResponse {
	s.TemplateCode = &v
	return s
}

func (s *QuerySecurityPolicyResponse) SetTemplateDesc(v string) *QuerySecurityPolicyResponse {
	s.TemplateDesc = &v
	return s
}

func (s *QuerySecurityPolicyResponse) SetVerifyId(v string) *QuerySecurityPolicyResponse {
	s.VerifyId = &v
	return s
}

func (s *QuerySecurityPolicyResponse) SetVerifyUrl(v string) *QuerySecurityPolicyResponse {
	s.VerifyUrl = &v
	return s
}

type SendSecurityDataRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 安全累计属性列表字段，安全属性列表
	SecurityContent *string `json:"security_content,omitempty" xml:"security_content,omitempty" require:"true"`
	// 代码发送给安全核心的事件编码
	SecuritySign *string `json:"security_sign,omitempty" xml:"security_sign,omitempty" require:"true"`
}

func (s SendSecurityDataRequest) String() string {
	return tea.Prettify(s)
}

func (s SendSecurityDataRequest) GoString() string {
	return s.String()
}

func (s *SendSecurityDataRequest) SetAuthToken(v string) *SendSecurityDataRequest {
	s.AuthToken = &v
	return s
}

func (s *SendSecurityDataRequest) SetProductInstanceId(v string) *SendSecurityDataRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SendSecurityDataRequest) SetSecurityContent(v string) *SendSecurityDataRequest {
	s.SecurityContent = &v
	return s
}

func (s *SendSecurityDataRequest) SetSecuritySign(v string) *SendSecurityDataRequest {
	s.SecuritySign = &v
	return s
}

type SendSecurityDataResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否成功
	Success *string `json:"success,omitempty" xml:"success,omitempty" require:"true"`
}

func (s SendSecurityDataResponse) String() string {
	return tea.Prettify(s)
}

func (s SendSecurityDataResponse) GoString() string {
	return s.String()
}

func (s *SendSecurityDataResponse) SetReqMsgId(v string) *SendSecurityDataResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SendSecurityDataResponse) SetResultCode(v string) *SendSecurityDataResponse {
	s.ResultCode = &v
	return s
}

func (s *SendSecurityDataResponse) SetResultMsg(v string) *SendSecurityDataResponse {
	s.ResultMsg = &v
	return s
}

func (s *SendSecurityDataResponse) SetSuccess(v string) *SendSecurityDataResponse {
	s.Success = &v
	return s
}

type ConfirmSecurityPolicyRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 二次确认参数，防止篡改
	ConfirmParams *string `json:"confirm_params,omitempty" xml:"confirm_params,omitempty" require:"true"`
	// 代码发送给安全核心的事件编码
	SecurityId *string `json:"security_id,omitempty" xml:"security_id,omitempty" require:"true"`
}

func (s ConfirmSecurityPolicyRequest) String() string {
	return tea.Prettify(s)
}

func (s ConfirmSecurityPolicyRequest) GoString() string {
	return s.String()
}

func (s *ConfirmSecurityPolicyRequest) SetAuthToken(v string) *ConfirmSecurityPolicyRequest {
	s.AuthToken = &v
	return s
}

func (s *ConfirmSecurityPolicyRequest) SetProductInstanceId(v string) *ConfirmSecurityPolicyRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ConfirmSecurityPolicyRequest) SetConfirmParams(v string) *ConfirmSecurityPolicyRequest {
	s.ConfirmParams = &v
	return s
}

func (s *ConfirmSecurityPolicyRequest) SetSecurityId(v string) *ConfirmSecurityPolicyRequest {
	s.SecurityId = &v
	return s
}

type ConfirmSecurityPolicyResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否成功
	Success *string `json:"success,omitempty" xml:"success,omitempty" require:"true"`
}

func (s ConfirmSecurityPolicyResponse) String() string {
	return tea.Prettify(s)
}

func (s ConfirmSecurityPolicyResponse) GoString() string {
	return s.String()
}

func (s *ConfirmSecurityPolicyResponse) SetReqMsgId(v string) *ConfirmSecurityPolicyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ConfirmSecurityPolicyResponse) SetResultCode(v string) *ConfirmSecurityPolicyResponse {
	s.ResultCode = &v
	return s
}

func (s *ConfirmSecurityPolicyResponse) SetResultMsg(v string) *ConfirmSecurityPolicyResponse {
	s.ResultMsg = &v
	return s
}

func (s *ConfirmSecurityPolicyResponse) SetSuccess(v string) *ConfirmSecurityPolicyResponse {
	s.Success = &v
	return s
}

type CheckSecurityRdsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 输入大字段，具体见接入文档
	RdsContent *string `json:"rds_content,omitempty" xml:"rds_content,omitempty" require:"true"`
}

func (s CheckSecurityRdsRequest) String() string {
	return tea.Prettify(s)
}

func (s CheckSecurityRdsRequest) GoString() string {
	return s.String()
}

func (s *CheckSecurityRdsRequest) SetAuthToken(v string) *CheckSecurityRdsRequest {
	s.AuthToken = &v
	return s
}

func (s *CheckSecurityRdsRequest) SetProductInstanceId(v string) *CheckSecurityRdsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CheckSecurityRdsRequest) SetRdsContent(v string) *CheckSecurityRdsRequest {
	s.RdsContent = &v
	return s
}

type CheckSecurityRdsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否成功
	Result *int `json:"result,omitempty" xml:"result,omitempty" require:"true"`
}

func (s CheckSecurityRdsResponse) String() string {
	return tea.Prettify(s)
}

func (s CheckSecurityRdsResponse) GoString() string {
	return s.String()
}

func (s *CheckSecurityRdsResponse) SetReqMsgId(v string) *CheckSecurityRdsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CheckSecurityRdsResponse) SetResultCode(v string) *CheckSecurityRdsResponse {
	s.ResultCode = &v
	return s
}

func (s *CheckSecurityRdsResponse) SetResultMsg(v string) *CheckSecurityRdsResponse {
	s.ResultMsg = &v
	return s
}

func (s *CheckSecurityRdsResponse) SetResult(v int) *CheckSecurityRdsResponse {
	s.Result = &v
	return s
}

type QuerySecurityDataRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string                    `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string                    `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	ReqInfo           []*SecurityDataQueryStruct `json:"req_info,omitempty" xml:"req_info,omitempty" require:"true" type:"Repeated"`
}

func (s QuerySecurityDataRequest) String() string {
	return tea.Prettify(s)
}

func (s QuerySecurityDataRequest) GoString() string {
	return s.String()
}

func (s *QuerySecurityDataRequest) SetAuthToken(v string) *QuerySecurityDataRequest {
	s.AuthToken = &v
	return s
}

func (s *QuerySecurityDataRequest) SetProductInstanceId(v string) *QuerySecurityDataRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QuerySecurityDataRequest) SetReqInfo(v []*SecurityDataQueryStruct) *QuerySecurityDataRequest {
	s.ReqInfo = v
	return s
}

type QuerySecurityDataResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否成功
	Success *string `json:"success,omitempty" xml:"success,omitempty" require:"true"`
}

func (s QuerySecurityDataResponse) String() string {
	return tea.Prettify(s)
}

func (s QuerySecurityDataResponse) GoString() string {
	return s.String()
}

func (s *QuerySecurityDataResponse) SetReqMsgId(v string) *QuerySecurityDataResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QuerySecurityDataResponse) SetResultCode(v string) *QuerySecurityDataResponse {
	s.ResultCode = &v
	return s
}

func (s *QuerySecurityDataResponse) SetResultMsg(v string) *QuerySecurityDataResponse {
	s.ResultMsg = &v
	return s
}

func (s *QuerySecurityDataResponse) SetSuccess(v string) *QuerySecurityDataResponse {
	s.Success = &v
	return s
}

type CheckSecurityDataRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 入参为Map转换后的String
	ReqInfo *string `json:"req_info,omitempty" xml:"req_info,omitempty" require:"true"`
}

func (s CheckSecurityDataRequest) String() string {
	return tea.Prettify(s)
}

func (s CheckSecurityDataRequest) GoString() string {
	return s.String()
}

func (s *CheckSecurityDataRequest) SetAuthToken(v string) *CheckSecurityDataRequest {
	s.AuthToken = &v
	return s
}

func (s *CheckSecurityDataRequest) SetProductInstanceId(v string) *CheckSecurityDataRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CheckSecurityDataRequest) SetReqInfo(v string) *CheckSecurityDataRequest {
	s.ReqInfo = &v
	return s
}

type CheckSecurityDataResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// code表示状态，message为提示，data为返回结果
	Response *string `json:"response,omitempty" xml:"response,omitempty"`
}

func (s CheckSecurityDataResponse) String() string {
	return tea.Prettify(s)
}

func (s CheckSecurityDataResponse) GoString() string {
	return s.String()
}

func (s *CheckSecurityDataResponse) SetReqMsgId(v string) *CheckSecurityDataResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CheckSecurityDataResponse) SetResultCode(v string) *CheckSecurityDataResponse {
	s.ResultCode = &v
	return s
}

func (s *CheckSecurityDataResponse) SetResultMsg(v string) *CheckSecurityDataResponse {
	s.ResultMsg = &v
	return s
}

func (s *CheckSecurityDataResponse) SetResponse(v string) *CheckSecurityDataResponse {
	s.Response = &v
	return s
}

type ExecSecurityRiskdataserviceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 风险数据服务请求事件属性详情
	EventInfo *string `json:"event_info,omitempty" xml:"event_info,omitempty" require:"true"`
	// 反欺诈数据服务查询请求唯一凭证，为申请成功后得到，当请求类型是query时必填
	RiskDataServiaceApplyId *string `json:"risk_data_serviace_apply_id,omitempty" xml:"risk_data_serviace_apply_id,omitempty"`
	// 反欺诈风险数据服务请求类型（query or apply）
	RiskDataServiceType *string `json:"risk_data_service_type,omitempty" xml:"risk_data_service_type,omitempty" require:"true"`
}

func (s ExecSecurityRiskdataserviceRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecSecurityRiskdataserviceRequest) GoString() string {
	return s.String()
}

func (s *ExecSecurityRiskdataserviceRequest) SetAuthToken(v string) *ExecSecurityRiskdataserviceRequest {
	s.AuthToken = &v
	return s
}

func (s *ExecSecurityRiskdataserviceRequest) SetProductInstanceId(v string) *ExecSecurityRiskdataserviceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ExecSecurityRiskdataserviceRequest) SetEventInfo(v string) *ExecSecurityRiskdataserviceRequest {
	s.EventInfo = &v
	return s
}

func (s *ExecSecurityRiskdataserviceRequest) SetRiskDataServiaceApplyId(v string) *ExecSecurityRiskdataserviceRequest {
	s.RiskDataServiaceApplyId = &v
	return s
}

func (s *ExecSecurityRiskdataserviceRequest) SetRiskDataServiceType(v string) *ExecSecurityRiskdataserviceRequest {
	s.RiskDataServiceType = &v
	return s
}

type ExecSecurityRiskdataserviceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 反欺诈风险数据服务申请成功时返回的查询凭证（申请请求时存在）
	RiskDataServiceApplyId *string `json:"risk_data_service_apply_id,omitempty" xml:"risk_data_service_apply_id,omitempty"`
	// 反欺诈风险数据服务查询请求结果中风险详细信息字段（查询请求时存在）
	RiskInfos []*RiskInfo `json:"risk_infos,omitempty" xml:"risk_infos,omitempty" type:"Repeated"`
	// 请求响应业务唯一id
	SecurityId *string `json:"security_id,omitempty" xml:"security_id,omitempty"`
	// 反欺诈风险数据服务查询成功时得到风险建议结果信息（查询请求时存在）
	SecurityResultInfos *SecurityResultInfos `json:"security_result_infos,omitempty" xml:"security_result_infos,omitempty"`
	// 请求是否成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s ExecSecurityRiskdataserviceResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecSecurityRiskdataserviceResponse) GoString() string {
	return s.String()
}

func (s *ExecSecurityRiskdataserviceResponse) SetReqMsgId(v string) *ExecSecurityRiskdataserviceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ExecSecurityRiskdataserviceResponse) SetResultCode(v string) *ExecSecurityRiskdataserviceResponse {
	s.ResultCode = &v
	return s
}

func (s *ExecSecurityRiskdataserviceResponse) SetResultMsg(v string) *ExecSecurityRiskdataserviceResponse {
	s.ResultMsg = &v
	return s
}

func (s *ExecSecurityRiskdataserviceResponse) SetRiskDataServiceApplyId(v string) *ExecSecurityRiskdataserviceResponse {
	s.RiskDataServiceApplyId = &v
	return s
}

func (s *ExecSecurityRiskdataserviceResponse) SetRiskInfos(v []*RiskInfo) *ExecSecurityRiskdataserviceResponse {
	s.RiskInfos = v
	return s
}

func (s *ExecSecurityRiskdataserviceResponse) SetSecurityId(v string) *ExecSecurityRiskdataserviceResponse {
	s.SecurityId = &v
	return s
}

func (s *ExecSecurityRiskdataserviceResponse) SetSecurityResultInfos(v *SecurityResultInfos) *ExecSecurityRiskdataserviceResponse {
	s.SecurityResultInfos = v
	return s
}

func (s *ExecSecurityRiskdataserviceResponse) SetSuccess(v bool) *ExecSecurityRiskdataserviceResponse {
	s.Success = &v
	return s
}

type QueryDubheTestRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 测试id字段
	Testid *string `json:"testid,omitempty" xml:"testid,omitempty" require:"true"`
}

func (s QueryDubheTestRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDubheTestRequest) GoString() string {
	return s.String()
}

func (s *QueryDubheTestRequest) SetAuthToken(v string) *QueryDubheTestRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDubheTestRequest) SetProductInstanceId(v string) *QueryDubheTestRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryDubheTestRequest) SetTestid(v string) *QueryDubheTestRequest {
	s.Testid = &v
	return s
}

type QueryDubheTestResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 测试返回体
	TestResponseStr *string `json:"test_response_str,omitempty" xml:"test_response_str,omitempty"`
}

func (s QueryDubheTestResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDubheTestResponse) GoString() string {
	return s.String()
}

func (s *QueryDubheTestResponse) SetReqMsgId(v string) *QueryDubheTestResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDubheTestResponse) SetResultCode(v string) *QueryDubheTestResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDubheTestResponse) SetResultMsg(v string) *QueryDubheTestResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDubheTestResponse) SetTestResponseStr(v string) *QueryDubheTestResponse {
	s.TestResponseStr = &v
	return s
}

type QueryDubheRouterFundrouterRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 身份证号(md5加密32位)
	CardNo *string `json:"card_no,omitempty" xml:"card_no,omitempty" require:"true"`
	// 手机号（MD5加密，32位）
	Mobile *string `json:"mobile,omitempty" xml:"mobile,omitempty" require:"true"`
	// 客户姓名
	CustomName *string `json:"custom_name,omitempty" xml:"custom_name,omitempty" require:"true"`
	// 合作方产品编号
	ProdNo *string `json:"prod_no,omitempty" xml:"prod_no,omitempty" require:"true"`
	// 渠道类型
	ChannelType *string `json:"channel_type,omitempty" xml:"channel_type,omitempty"`
	// 客户类型
	CustomType *string `json:"custom_type,omitempty" xml:"custom_type,omitempty"`
	// 导流平台
	TrafficPlatform *string `json:"traffic_platform,omitempty" xml:"traffic_platform,omitempty"`
	// 流量名称
	TrafficSourceName *string `json:"traffic_source_name,omitempty" xml:"traffic_source_name,omitempty"`
	// 广告位标志
	TrafficAdId *string `json:"traffic_ad_id,omitempty" xml:"traffic_ad_id,omitempty"`
	// 预留
	TrafficMktId *string `json:"traffic_mkt_id,omitempty" xml:"traffic_mkt_id,omitempty"`
	// 预留
	ClickId *string `json:"click_id,omitempty" xml:"click_id,omitempty"`
}

func (s QueryDubheRouterFundrouterRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDubheRouterFundrouterRequest) GoString() string {
	return s.String()
}

func (s *QueryDubheRouterFundrouterRequest) SetAuthToken(v string) *QueryDubheRouterFundrouterRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDubheRouterFundrouterRequest) SetProductInstanceId(v string) *QueryDubheRouterFundrouterRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryDubheRouterFundrouterRequest) SetCardNo(v string) *QueryDubheRouterFundrouterRequest {
	s.CardNo = &v
	return s
}

func (s *QueryDubheRouterFundrouterRequest) SetMobile(v string) *QueryDubheRouterFundrouterRequest {
	s.Mobile = &v
	return s
}

func (s *QueryDubheRouterFundrouterRequest) SetCustomName(v string) *QueryDubheRouterFundrouterRequest {
	s.CustomName = &v
	return s
}

func (s *QueryDubheRouterFundrouterRequest) SetProdNo(v string) *QueryDubheRouterFundrouterRequest {
	s.ProdNo = &v
	return s
}

func (s *QueryDubheRouterFundrouterRequest) SetChannelType(v string) *QueryDubheRouterFundrouterRequest {
	s.ChannelType = &v
	return s
}

func (s *QueryDubheRouterFundrouterRequest) SetCustomType(v string) *QueryDubheRouterFundrouterRequest {
	s.CustomType = &v
	return s
}

func (s *QueryDubheRouterFundrouterRequest) SetTrafficPlatform(v string) *QueryDubheRouterFundrouterRequest {
	s.TrafficPlatform = &v
	return s
}

func (s *QueryDubheRouterFundrouterRequest) SetTrafficSourceName(v string) *QueryDubheRouterFundrouterRequest {
	s.TrafficSourceName = &v
	return s
}

func (s *QueryDubheRouterFundrouterRequest) SetTrafficAdId(v string) *QueryDubheRouterFundrouterRequest {
	s.TrafficAdId = &v
	return s
}

func (s *QueryDubheRouterFundrouterRequest) SetTrafficMktId(v string) *QueryDubheRouterFundrouterRequest {
	s.TrafficMktId = &v
	return s
}

func (s *QueryDubheRouterFundrouterRequest) SetClickId(v string) *QueryDubheRouterFundrouterRequest {
	s.ClickId = &v
	return s
}

type QueryDubheRouterFundrouterResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 资金方代码
	FundCode *string `json:"fund_code,omitempty" xml:"fund_code,omitempty"`
}

func (s QueryDubheRouterFundrouterResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDubheRouterFundrouterResponse) GoString() string {
	return s.String()
}

func (s *QueryDubheRouterFundrouterResponse) SetReqMsgId(v string) *QueryDubheRouterFundrouterResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDubheRouterFundrouterResponse) SetResultCode(v string) *QueryDubheRouterFundrouterResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDubheRouterFundrouterResponse) SetResultMsg(v string) *QueryDubheRouterFundrouterResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDubheRouterFundrouterResponse) SetFundCode(v string) *QueryDubheRouterFundrouterResponse {
	s.FundCode = &v
	return s
}

type ApplyDubheCreditRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 基础信息
	PersonalInfo *PersonalInfo `json:"personal_info,omitempty" xml:"personal_info,omitempty" require:"true"`
	// 资产方用户唯一标识
	OpenId *string `json:"open_id,omitempty" xml:"open_id,omitempty" require:"true"`
	// 订单号
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty" require:"true"`
	// 居住信息
	BorrowerLiveInfo *LiveInfo `json:"borrower_live_info,omitempty" xml:"borrower_live_info,omitempty"`
	// 工作信息
	BorrowerEmpInfo *JobInfo `json:"borrower_emp_info,omitempty" xml:"borrower_emp_info,omitempty"`
	// 产品编号
	ProdNo *string `json:"prod_no,omitempty" xml:"prod_no,omitempty" require:"true"`
	// 风险数据对象
	RiskData *RiskData `json:"risk_data,omitempty" xml:"risk_data,omitempty"`
	// 借款用途
	LoanReason *string `json:"loan_reason,omitempty" xml:"loan_reason,omitempty"`
	// 资料文件
	Materials []*Material `json:"materials,omitempty" xml:"materials,omitempty" type:"Repeated"`
	// 导流平台
	TrafficPlatform *string `json:"traffic_platform,omitempty" xml:"traffic_platform,omitempty"`
	// 流量名称
	TrafficSourceName *string `json:"traffic_source_name,omitempty" xml:"traffic_source_name,omitempty"`
	// 广告位标志
	TrafficAdId *string `json:"traffic_ad_id,omitempty" xml:"traffic_ad_id,omitempty"`
	// 预留
	TrafficMktId *string `json:"traffic_mkt_id,omitempty" xml:"traffic_mkt_id,omitempty"`
	// 预留
	ClickId *string `json:"click_id,omitempty" xml:"click_id,omitempty"`
	// 渠道类型
	ChannelType *string `json:"channel_type,omitempty" xml:"channel_type,omitempty"`
	// 客户类型
	CustomType *string `json:"custom_type,omitempty" xml:"custom_type,omitempty"`
}

func (s ApplyDubheCreditRequest) String() string {
	return tea.Prettify(s)
}

func (s ApplyDubheCreditRequest) GoString() string {
	return s.String()
}

func (s *ApplyDubheCreditRequest) SetAuthToken(v string) *ApplyDubheCreditRequest {
	s.AuthToken = &v
	return s
}

func (s *ApplyDubheCreditRequest) SetProductInstanceId(v string) *ApplyDubheCreditRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ApplyDubheCreditRequest) SetPersonalInfo(v *PersonalInfo) *ApplyDubheCreditRequest {
	s.PersonalInfo = v
	return s
}

func (s *ApplyDubheCreditRequest) SetOpenId(v string) *ApplyDubheCreditRequest {
	s.OpenId = &v
	return s
}

func (s *ApplyDubheCreditRequest) SetOrderNo(v string) *ApplyDubheCreditRequest {
	s.OrderNo = &v
	return s
}

func (s *ApplyDubheCreditRequest) SetBorrowerLiveInfo(v *LiveInfo) *ApplyDubheCreditRequest {
	s.BorrowerLiveInfo = v
	return s
}

func (s *ApplyDubheCreditRequest) SetBorrowerEmpInfo(v *JobInfo) *ApplyDubheCreditRequest {
	s.BorrowerEmpInfo = v
	return s
}

func (s *ApplyDubheCreditRequest) SetProdNo(v string) *ApplyDubheCreditRequest {
	s.ProdNo = &v
	return s
}

func (s *ApplyDubheCreditRequest) SetRiskData(v *RiskData) *ApplyDubheCreditRequest {
	s.RiskData = v
	return s
}

func (s *ApplyDubheCreditRequest) SetLoanReason(v string) *ApplyDubheCreditRequest {
	s.LoanReason = &v
	return s
}

func (s *ApplyDubheCreditRequest) SetMaterials(v []*Material) *ApplyDubheCreditRequest {
	s.Materials = v
	return s
}

func (s *ApplyDubheCreditRequest) SetTrafficPlatform(v string) *ApplyDubheCreditRequest {
	s.TrafficPlatform = &v
	return s
}

func (s *ApplyDubheCreditRequest) SetTrafficSourceName(v string) *ApplyDubheCreditRequest {
	s.TrafficSourceName = &v
	return s
}

func (s *ApplyDubheCreditRequest) SetTrafficAdId(v string) *ApplyDubheCreditRequest {
	s.TrafficAdId = &v
	return s
}

func (s *ApplyDubheCreditRequest) SetTrafficMktId(v string) *ApplyDubheCreditRequest {
	s.TrafficMktId = &v
	return s
}

func (s *ApplyDubheCreditRequest) SetClickId(v string) *ApplyDubheCreditRequest {
	s.ClickId = &v
	return s
}

func (s *ApplyDubheCreditRequest) SetChannelType(v string) *ApplyDubheCreditRequest {
	s.ChannelType = &v
	return s
}

func (s *ApplyDubheCreditRequest) SetCustomType(v string) *ApplyDubheCreditRequest {
	s.CustomType = &v
	return s
}

type ApplyDubheCreditResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 客户编号
	CustomNo *string `json:"custom_no,omitempty" xml:"custom_no,omitempty"`
}

func (s ApplyDubheCreditResponse) String() string {
	return tea.Prettify(s)
}

func (s ApplyDubheCreditResponse) GoString() string {
	return s.String()
}

func (s *ApplyDubheCreditResponse) SetReqMsgId(v string) *ApplyDubheCreditResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ApplyDubheCreditResponse) SetResultCode(v string) *ApplyDubheCreditResponse {
	s.ResultCode = &v
	return s
}

func (s *ApplyDubheCreditResponse) SetResultMsg(v string) *ApplyDubheCreditResponse {
	s.ResultMsg = &v
	return s
}

func (s *ApplyDubheCreditResponse) SetCustomNo(v string) *ApplyDubheCreditResponse {
	s.CustomNo = &v
	return s
}

type QueryDubheCreditStatusRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 授信申请订单号
	OriginalOrderNo *string `json:"original_order_no,omitempty" xml:"original_order_no,omitempty" require:"true"`
	// 订单号
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty" require:"true"`
}

func (s QueryDubheCreditStatusRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDubheCreditStatusRequest) GoString() string {
	return s.String()
}

func (s *QueryDubheCreditStatusRequest) SetAuthToken(v string) *QueryDubheCreditStatusRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDubheCreditStatusRequest) SetProductInstanceId(v string) *QueryDubheCreditStatusRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryDubheCreditStatusRequest) SetOriginalOrderNo(v string) *QueryDubheCreditStatusRequest {
	s.OriginalOrderNo = &v
	return s
}

func (s *QueryDubheCreditStatusRequest) SetOrderNo(v string) *QueryDubheCreditStatusRequest {
	s.OrderNo = &v
	return s
}

type QueryDubheCreditStatusResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 授信状态（0-通过/1-不通过2-处理中）
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 拒绝原因
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
	// 授信额度
	CreditAmt *int64 `json:"credit_amt,omitempty" xml:"credit_amt,omitempty"`
	// 期数
	Period *int64 `json:"period,omitempty" xml:"period,omitempty"`
	// 还款方式
	RepayType *string `json:"repay_type,omitempty" xml:"repay_type,omitempty"`
	// 额度信息
	CreditInfo *CreditAmount `json:"credit_info,omitempty" xml:"credit_info,omitempty"`
	// 客户编号(该客户的唯一标识，后续接口需要用到)
	CustomNo *string `json:"custom_no,omitempty" xml:"custom_no,omitempty"`
	// 授信申请编号
	ApplyNo *string `json:"apply_no,omitempty" xml:"apply_no,omitempty"`
}

func (s QueryDubheCreditStatusResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDubheCreditStatusResponse) GoString() string {
	return s.String()
}

func (s *QueryDubheCreditStatusResponse) SetReqMsgId(v string) *QueryDubheCreditStatusResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDubheCreditStatusResponse) SetResultCode(v string) *QueryDubheCreditStatusResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDubheCreditStatusResponse) SetResultMsg(v string) *QueryDubheCreditStatusResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDubheCreditStatusResponse) SetStatus(v string) *QueryDubheCreditStatusResponse {
	s.Status = &v
	return s
}

func (s *QueryDubheCreditStatusResponse) SetMsg(v string) *QueryDubheCreditStatusResponse {
	s.Msg = &v
	return s
}

func (s *QueryDubheCreditStatusResponse) SetCreditAmt(v int64) *QueryDubheCreditStatusResponse {
	s.CreditAmt = &v
	return s
}

func (s *QueryDubheCreditStatusResponse) SetPeriod(v int64) *QueryDubheCreditStatusResponse {
	s.Period = &v
	return s
}

func (s *QueryDubheCreditStatusResponse) SetRepayType(v string) *QueryDubheCreditStatusResponse {
	s.RepayType = &v
	return s
}

func (s *QueryDubheCreditStatusResponse) SetCreditInfo(v *CreditAmount) *QueryDubheCreditStatusResponse {
	s.CreditInfo = v
	return s
}

func (s *QueryDubheCreditStatusResponse) SetCustomNo(v string) *QueryDubheCreditStatusResponse {
	s.CustomNo = &v
	return s
}

func (s *QueryDubheCreditStatusResponse) SetApplyNo(v string) *QueryDubheCreditStatusResponse {
	s.ApplyNo = &v
	return s
}

type CountDubheRepayReftrialRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单号
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty" require:"true"`
	// 授信申请订单号
	OriginalOrderNo *string `json:"original_order_no,omitempty" xml:"original_order_no,omitempty" require:"true"`
	// 产品编号
	ProdNo *string `json:"prod_no,omitempty" xml:"prod_no,omitempty" require:"true"`
	// 借款金额
	ApplyAmount *int64 `json:"apply_amount,omitempty" xml:"apply_amount,omitempty" require:"true"`
	// 借款期数
	ApplyPeriod *int64 `json:"apply_period,omitempty" xml:"apply_period,omitempty" require:"true"`
	// 还款方式
	RepayType *string `json:"repay_type,omitempty" xml:"repay_type,omitempty" require:"true"`
}

func (s CountDubheRepayReftrialRequest) String() string {
	return tea.Prettify(s)
}

func (s CountDubheRepayReftrialRequest) GoString() string {
	return s.String()
}

func (s *CountDubheRepayReftrialRequest) SetAuthToken(v string) *CountDubheRepayReftrialRequest {
	s.AuthToken = &v
	return s
}

func (s *CountDubheRepayReftrialRequest) SetProductInstanceId(v string) *CountDubheRepayReftrialRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CountDubheRepayReftrialRequest) SetOrderNo(v string) *CountDubheRepayReftrialRequest {
	s.OrderNo = &v
	return s
}

func (s *CountDubheRepayReftrialRequest) SetOriginalOrderNo(v string) *CountDubheRepayReftrialRequest {
	s.OriginalOrderNo = &v
	return s
}

func (s *CountDubheRepayReftrialRequest) SetProdNo(v string) *CountDubheRepayReftrialRequest {
	s.ProdNo = &v
	return s
}

func (s *CountDubheRepayReftrialRequest) SetApplyAmount(v int64) *CountDubheRepayReftrialRequest {
	s.ApplyAmount = &v
	return s
}

func (s *CountDubheRepayReftrialRequest) SetApplyPeriod(v int64) *CountDubheRepayReftrialRequest {
	s.ApplyPeriod = &v
	return s
}

func (s *CountDubheRepayReftrialRequest) SetRepayType(v string) *CountDubheRepayReftrialRequest {
	s.RepayType = &v
	return s
}

type CountDubheRepayReftrialResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 还款计划试算结果
	RepayRefList []*RepayRef `json:"repay_ref_list,omitempty" xml:"repay_ref_list,omitempty" type:"Repeated"`
}

func (s CountDubheRepayReftrialResponse) String() string {
	return tea.Prettify(s)
}

func (s CountDubheRepayReftrialResponse) GoString() string {
	return s.String()
}

func (s *CountDubheRepayReftrialResponse) SetReqMsgId(v string) *CountDubheRepayReftrialResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CountDubheRepayReftrialResponse) SetResultCode(v string) *CountDubheRepayReftrialResponse {
	s.ResultCode = &v
	return s
}

func (s *CountDubheRepayReftrialResponse) SetResultMsg(v string) *CountDubheRepayReftrialResponse {
	s.ResultMsg = &v
	return s
}

func (s *CountDubheRepayReftrialResponse) SetRepayRefList(v []*RepayRef) *CountDubheRepayReftrialResponse {
	s.RepayRefList = v
	return s
}

type QueryDubheRepayListRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单号
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty" require:"true"`
	// 用信申请订单号
	OriginalOrderNo *string `json:"original_order_no,omitempty" xml:"original_order_no,omitempty" require:"true"`
}

func (s QueryDubheRepayListRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDubheRepayListRequest) GoString() string {
	return s.String()
}

func (s *QueryDubheRepayListRequest) SetAuthToken(v string) *QueryDubheRepayListRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDubheRepayListRequest) SetProductInstanceId(v string) *QueryDubheRepayListRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryDubheRepayListRequest) SetOrderNo(v string) *QueryDubheRepayListRequest {
	s.OrderNo = &v
	return s
}

func (s *QueryDubheRepayListRequest) SetOriginalOrderNo(v string) *QueryDubheRepayListRequest {
	s.OriginalOrderNo = &v
	return s
}

type QueryDubheRepayListResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 还款计划查询结果
	RepayRefList []*RepayRef `json:"repay_ref_list,omitempty" xml:"repay_ref_list,omitempty" type:"Repeated"`
}

func (s QueryDubheRepayListResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDubheRepayListResponse) GoString() string {
	return s.String()
}

func (s *QueryDubheRepayListResponse) SetReqMsgId(v string) *QueryDubheRepayListResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDubheRepayListResponse) SetResultCode(v string) *QueryDubheRepayListResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDubheRepayListResponse) SetResultMsg(v string) *QueryDubheRepayListResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDubheRepayListResponse) SetRepayRefList(v []*RepayRef) *QueryDubheRepayListResponse {
	s.RepayRefList = v
	return s
}

type ApplyDubheUsecreditRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 授信申请订单号
	OriginalOrderNo *string `json:"original_order_no,omitempty" xml:"original_order_no,omitempty" require:"true"`
	// 用信金额
	LoanAmount *int64 `json:"loan_amount,omitempty" xml:"loan_amount,omitempty" require:"true"`
	// 期数
	Period *int64 `json:"period,omitempty" xml:"period,omitempty" require:"true"`
	// 资产方用户唯一标识
	OpenId *string `json:"open_id,omitempty" xml:"open_id,omitempty" require:"true"`
	// 订单号
	OrderOn *string `json:"order_on,omitempty" xml:"order_on,omitempty" require:"true"`
	// 还款方式
	RepayType *string `json:"repay_type,omitempty" xml:"repay_type,omitempty" require:"true"`
	// 1：手机数码 2：旅游 3：装修 4：教育 5：婚庆 6：租房 7：家具家居 8：健康医疗 9：其他消费 10：家用电器
	LoanWay *string `json:"loan_way,omitempty" xml:"loan_way,omitempty" require:"true"`
	// 1: APP
	// 2: 支付宝小程序
	// 3：微信小程序
	// 4：微信公众号
	// 5：PC网页
	// 默认1
	ChannelType *string `json:"channel_type,omitempty" xml:"channel_type,omitempty" require:"true"`
	// 1: 新增客户
	// 2：存量激活客户
	// 3：目标营销客户
	// 默认1
	CustomType *string `json:"custom_type,omitempty" xml:"custom_type,omitempty" require:"true"`
	// 指定还款日（仅无在贷借据时生效）
	RepayDate *string `json:"repay_date,omitempty" xml:"repay_date,omitempty" require:"true"`
}

func (s ApplyDubheUsecreditRequest) String() string {
	return tea.Prettify(s)
}

func (s ApplyDubheUsecreditRequest) GoString() string {
	return s.String()
}

func (s *ApplyDubheUsecreditRequest) SetAuthToken(v string) *ApplyDubheUsecreditRequest {
	s.AuthToken = &v
	return s
}

func (s *ApplyDubheUsecreditRequest) SetProductInstanceId(v string) *ApplyDubheUsecreditRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ApplyDubheUsecreditRequest) SetOriginalOrderNo(v string) *ApplyDubheUsecreditRequest {
	s.OriginalOrderNo = &v
	return s
}

func (s *ApplyDubheUsecreditRequest) SetLoanAmount(v int64) *ApplyDubheUsecreditRequest {
	s.LoanAmount = &v
	return s
}

func (s *ApplyDubheUsecreditRequest) SetPeriod(v int64) *ApplyDubheUsecreditRequest {
	s.Period = &v
	return s
}

func (s *ApplyDubheUsecreditRequest) SetOpenId(v string) *ApplyDubheUsecreditRequest {
	s.OpenId = &v
	return s
}

func (s *ApplyDubheUsecreditRequest) SetOrderOn(v string) *ApplyDubheUsecreditRequest {
	s.OrderOn = &v
	return s
}

func (s *ApplyDubheUsecreditRequest) SetRepayType(v string) *ApplyDubheUsecreditRequest {
	s.RepayType = &v
	return s
}

func (s *ApplyDubheUsecreditRequest) SetLoanWay(v string) *ApplyDubheUsecreditRequest {
	s.LoanWay = &v
	return s
}

func (s *ApplyDubheUsecreditRequest) SetChannelType(v string) *ApplyDubheUsecreditRequest {
	s.ChannelType = &v
	return s
}

func (s *ApplyDubheUsecreditRequest) SetCustomType(v string) *ApplyDubheUsecreditRequest {
	s.CustomType = &v
	return s
}

func (s *ApplyDubheUsecreditRequest) SetRepayDate(v string) *ApplyDubheUsecreditRequest {
	s.RepayDate = &v
	return s
}

type ApplyDubheUsecreditResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s ApplyDubheUsecreditResponse) String() string {
	return tea.Prettify(s)
}

func (s ApplyDubheUsecreditResponse) GoString() string {
	return s.String()
}

func (s *ApplyDubheUsecreditResponse) SetReqMsgId(v string) *ApplyDubheUsecreditResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ApplyDubheUsecreditResponse) SetResultCode(v string) *ApplyDubheUsecreditResponse {
	s.ResultCode = &v
	return s
}

func (s *ApplyDubheUsecreditResponse) SetResultMsg(v string) *ApplyDubheUsecreditResponse {
	s.ResultMsg = &v
	return s
}

type QueryDubheUsecreditStatusRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 用信申请订单号
	OriginalOrderNo *string `json:"original_order_no,omitempty" xml:"original_order_no,omitempty" require:"true"`
	// 请求网络流水号
	OrderOn *string `json:"order_on,omitempty" xml:"order_on,omitempty" require:"true"`
}

func (s QueryDubheUsecreditStatusRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDubheUsecreditStatusRequest) GoString() string {
	return s.String()
}

func (s *QueryDubheUsecreditStatusRequest) SetAuthToken(v string) *QueryDubheUsecreditStatusRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDubheUsecreditStatusRequest) SetProductInstanceId(v string) *QueryDubheUsecreditStatusRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryDubheUsecreditStatusRequest) SetOriginalOrderNo(v string) *QueryDubheUsecreditStatusRequest {
	s.OriginalOrderNo = &v
	return s
}

func (s *QueryDubheUsecreditStatusRequest) SetOrderOn(v string) *QueryDubheUsecreditStatusRequest {
	s.OrderOn = &v
	return s
}

type QueryDubheUsecreditStatusResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 用信状态（0-通过/1-不通过2-处理中）
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 拒绝原因
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
	// 借据信息
	ReceiptInfo *ReceiptInfo `json:"receipt_info,omitempty" xml:"receipt_info,omitempty"`
	// 还款计划列表
	RepayRef []*RepayRef `json:"repay_ref,omitempty" xml:"repay_ref,omitempty" type:"Repeated"`
}

func (s QueryDubheUsecreditStatusResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDubheUsecreditStatusResponse) GoString() string {
	return s.String()
}

func (s *QueryDubheUsecreditStatusResponse) SetReqMsgId(v string) *QueryDubheUsecreditStatusResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDubheUsecreditStatusResponse) SetResultCode(v string) *QueryDubheUsecreditStatusResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDubheUsecreditStatusResponse) SetResultMsg(v string) *QueryDubheUsecreditStatusResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDubheUsecreditStatusResponse) SetStatus(v string) *QueryDubheUsecreditStatusResponse {
	s.Status = &v
	return s
}

func (s *QueryDubheUsecreditStatusResponse) SetMsg(v string) *QueryDubheUsecreditStatusResponse {
	s.Msg = &v
	return s
}

func (s *QueryDubheUsecreditStatusResponse) SetReceiptInfo(v *ReceiptInfo) *QueryDubheUsecreditStatusResponse {
	s.ReceiptInfo = v
	return s
}

func (s *QueryDubheUsecreditStatusResponse) SetRepayRef(v []*RepayRef) *QueryDubheUsecreditStatusResponse {
	s.RepayRef = v
	return s
}

type CountDubheRepayTrialRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 用信申请订单号
	OriginalOrderNo *string `json:"original_order_no,omitempty" xml:"original_order_no,omitempty" require:"true"`
	// 还款类型1:当期结清，2：正常还款3：全部结清
	RepayType *string `json:"repay_type,omitempty" xml:"repay_type,omitempty" require:"true"`
	// 订单号
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty" require:"true"`
}

func (s CountDubheRepayTrialRequest) String() string {
	return tea.Prettify(s)
}

func (s CountDubheRepayTrialRequest) GoString() string {
	return s.String()
}

func (s *CountDubheRepayTrialRequest) SetAuthToken(v string) *CountDubheRepayTrialRequest {
	s.AuthToken = &v
	return s
}

func (s *CountDubheRepayTrialRequest) SetProductInstanceId(v string) *CountDubheRepayTrialRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CountDubheRepayTrialRequest) SetOriginalOrderNo(v string) *CountDubheRepayTrialRequest {
	s.OriginalOrderNo = &v
	return s
}

func (s *CountDubheRepayTrialRequest) SetRepayType(v string) *CountDubheRepayTrialRequest {
	s.RepayType = &v
	return s
}

func (s *CountDubheRepayTrialRequest) SetOrderNo(v string) *CountDubheRepayTrialRequest {
	s.OrderNo = &v
	return s
}

type CountDubheRepayTrialResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 还款本金
	RealPrincipal *int64 `json:"real_principal,omitempty" xml:"real_principal,omitempty"`
	// 还款利息
	RealInterest *int64 `json:"real_interest,omitempty" xml:"real_interest,omitempty"`
	// 还款费用
	RealOverAmt *int64 `json:"real_over_amt,omitempty" xml:"real_over_amt,omitempty"`
	// 服务费
	ServiceCharge *int64 `json:"service_charge,omitempty" xml:"service_charge,omitempty"`
}

func (s CountDubheRepayTrialResponse) String() string {
	return tea.Prettify(s)
}

func (s CountDubheRepayTrialResponse) GoString() string {
	return s.String()
}

func (s *CountDubheRepayTrialResponse) SetReqMsgId(v string) *CountDubheRepayTrialResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CountDubheRepayTrialResponse) SetResultCode(v string) *CountDubheRepayTrialResponse {
	s.ResultCode = &v
	return s
}

func (s *CountDubheRepayTrialResponse) SetResultMsg(v string) *CountDubheRepayTrialResponse {
	s.ResultMsg = &v
	return s
}

func (s *CountDubheRepayTrialResponse) SetRealPrincipal(v int64) *CountDubheRepayTrialResponse {
	s.RealPrincipal = &v
	return s
}

func (s *CountDubheRepayTrialResponse) SetRealInterest(v int64) *CountDubheRepayTrialResponse {
	s.RealInterest = &v
	return s
}

func (s *CountDubheRepayTrialResponse) SetRealOverAmt(v int64) *CountDubheRepayTrialResponse {
	s.RealOverAmt = &v
	return s
}

func (s *CountDubheRepayTrialResponse) SetServiceCharge(v int64) *CountDubheRepayTrialResponse {
	s.ServiceCharge = &v
	return s
}

type RepayDubheRepayCheckstandRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 用信申请订单号
	OriginalOrderNo *string `json:"original_order_no,omitempty" xml:"original_order_no,omitempty" require:"true"`
	// 还款类型1:当期结清，2：正常还款3：全部结清
	RepayType *string `json:"repay_type,omitempty" xml:"repay_type,omitempty" require:"true"`
	// 订单号
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty"`
}

func (s RepayDubheRepayCheckstandRequest) String() string {
	return tea.Prettify(s)
}

func (s RepayDubheRepayCheckstandRequest) GoString() string {
	return s.String()
}

func (s *RepayDubheRepayCheckstandRequest) SetAuthToken(v string) *RepayDubheRepayCheckstandRequest {
	s.AuthToken = &v
	return s
}

func (s *RepayDubheRepayCheckstandRequest) SetProductInstanceId(v string) *RepayDubheRepayCheckstandRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *RepayDubheRepayCheckstandRequest) SetOriginalOrderNo(v string) *RepayDubheRepayCheckstandRequest {
	s.OriginalOrderNo = &v
	return s
}

func (s *RepayDubheRepayCheckstandRequest) SetRepayType(v string) *RepayDubheRepayCheckstandRequest {
	s.RepayType = &v
	return s
}

func (s *RepayDubheRepayCheckstandRequest) SetOrderNo(v string) *RepayDubheRepayCheckstandRequest {
	s.OrderNo = &v
	return s
}

type RepayDubheRepayCheckstandResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 收银台地址(成功就有值)
	CheckstandAddress *string `json:"checkstand_address,omitempty" xml:"checkstand_address,omitempty"`
}

func (s RepayDubheRepayCheckstandResponse) String() string {
	return tea.Prettify(s)
}

func (s RepayDubheRepayCheckstandResponse) GoString() string {
	return s.String()
}

func (s *RepayDubheRepayCheckstandResponse) SetReqMsgId(v string) *RepayDubheRepayCheckstandResponse {
	s.ReqMsgId = &v
	return s
}

func (s *RepayDubheRepayCheckstandResponse) SetResultCode(v string) *RepayDubheRepayCheckstandResponse {
	s.ResultCode = &v
	return s
}

func (s *RepayDubheRepayCheckstandResponse) SetResultMsg(v string) *RepayDubheRepayCheckstandResponse {
	s.ResultMsg = &v
	return s
}

func (s *RepayDubheRepayCheckstandResponse) SetCheckstandAddress(v string) *RepayDubheRepayCheckstandResponse {
	s.CheckstandAddress = &v
	return s
}

type QueryDubheRepayInfoRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 原还款订单号
	OriginalOrderNo *string `json:"original_order_no,omitempty" xml:"original_order_no,omitempty" require:"true"`
	// 订单号
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty" require:"true"`
}

func (s QueryDubheRepayInfoRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDubheRepayInfoRequest) GoString() string {
	return s.String()
}

func (s *QueryDubheRepayInfoRequest) SetAuthToken(v string) *QueryDubheRepayInfoRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDubheRepayInfoRequest) SetProductInstanceId(v string) *QueryDubheRepayInfoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryDubheRepayInfoRequest) SetOriginalOrderNo(v string) *QueryDubheRepayInfoRequest {
	s.OriginalOrderNo = &v
	return s
}

func (s *QueryDubheRepayInfoRequest) SetOrderNo(v string) *QueryDubheRepayInfoRequest {
	s.OrderNo = &v
	return s
}

type QueryDubheRepayInfoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 还款编号
	RepayNo *string `json:"repay_no,omitempty" xml:"repay_no,omitempty"`
	// 借据编码
	ReceiptNo *string `json:"receipt_no,omitempty" xml:"receipt_no,omitempty"`
	// 客户编号
	CustomNo *string `json:"custom_no,omitempty" xml:"custom_no,omitempty"`
	// 客户名称
	CustomName *string `json:"custom_name,omitempty" xml:"custom_name,omitempty"`
	// 还款类型1:提前还款，2：正常还款 3:批量还款 4：自由还款
	RepayType *string `json:"repay_type,omitempty" xml:"repay_type,omitempty"`
	// 还款标志1 线下还款 2 用户主动还款 3 系统代扣
	RepaySign *string `json:"repay_sign,omitempty" xml:"repay_sign,omitempty"`
	// 还款日期
	RepayDate *string `json:"repay_date,omitempty" xml:"repay_date,omitempty"`
	// 实还总额
	RepayAmount *int64 `json:"repay_amount,omitempty" xml:"repay_amount,omitempty"`
	// 实还本金
	RepayPrincipal *int64 `json:"repay_principal,omitempty" xml:"repay_principal,omitempty"`
	// 实还利息
	RepayInterest *int64 `json:"repay_interest,omitempty" xml:"repay_interest,omitempty"`
	// 实还通道手续费
	ChannelAmt *int64 `json:"channel_amt,omitempty" xml:"channel_amt,omitempty"`
	// 实还手续费
	RepayFee *string `json:"repay_fee,omitempty" xml:"repay_fee,omitempty"`
	// 实收罚息
	RepayPunish *int64 `json:"repay_punish,omitempty" xml:"repay_punish,omitempty"`
	// 还款账户
	RepayAccount *string `json:"repay_account,omitempty" xml:"repay_account,omitempty"`
	// 还款账户名称
	RepayAccountName *string `json:"repay_account_name,omitempty" xml:"repay_account_name,omitempty"`
	// 还款账户的手机号
	RepayMobile *string `json:"repay_mobile,omitempty" xml:"repay_mobile,omitempty"`
	// 还款账户银行行号
	RepayBankNo *string `json:"repay_bank_no,omitempty" xml:"repay_bank_no,omitempty"`
	// 还款账户银行名称
	RepayBankName *string `json:"repay_bank_name,omitempty" xml:"repay_bank_name,omitempty"`
	// 还款状态0:失败 1成功 2-审批中 3-还款中
	RepayStatus *string `json:"repay_status,omitempty" xml:"repay_status,omitempty"`
	// 失败原因
	FailReason *string `json:"fail_reason,omitempty" xml:"fail_reason,omitempty"`
	// 授信申请编号
	ApplyNo *string `json:"apply_no,omitempty" xml:"apply_no,omitempty"`
}

func (s QueryDubheRepayInfoResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDubheRepayInfoResponse) GoString() string {
	return s.String()
}

func (s *QueryDubheRepayInfoResponse) SetReqMsgId(v string) *QueryDubheRepayInfoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDubheRepayInfoResponse) SetResultCode(v string) *QueryDubheRepayInfoResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDubheRepayInfoResponse) SetResultMsg(v string) *QueryDubheRepayInfoResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDubheRepayInfoResponse) SetRepayNo(v string) *QueryDubheRepayInfoResponse {
	s.RepayNo = &v
	return s
}

func (s *QueryDubheRepayInfoResponse) SetReceiptNo(v string) *QueryDubheRepayInfoResponse {
	s.ReceiptNo = &v
	return s
}

func (s *QueryDubheRepayInfoResponse) SetCustomNo(v string) *QueryDubheRepayInfoResponse {
	s.CustomNo = &v
	return s
}

func (s *QueryDubheRepayInfoResponse) SetCustomName(v string) *QueryDubheRepayInfoResponse {
	s.CustomName = &v
	return s
}

func (s *QueryDubheRepayInfoResponse) SetRepayType(v string) *QueryDubheRepayInfoResponse {
	s.RepayType = &v
	return s
}

func (s *QueryDubheRepayInfoResponse) SetRepaySign(v string) *QueryDubheRepayInfoResponse {
	s.RepaySign = &v
	return s
}

func (s *QueryDubheRepayInfoResponse) SetRepayDate(v string) *QueryDubheRepayInfoResponse {
	s.RepayDate = &v
	return s
}

func (s *QueryDubheRepayInfoResponse) SetRepayAmount(v int64) *QueryDubheRepayInfoResponse {
	s.RepayAmount = &v
	return s
}

func (s *QueryDubheRepayInfoResponse) SetRepayPrincipal(v int64) *QueryDubheRepayInfoResponse {
	s.RepayPrincipal = &v
	return s
}

func (s *QueryDubheRepayInfoResponse) SetRepayInterest(v int64) *QueryDubheRepayInfoResponse {
	s.RepayInterest = &v
	return s
}

func (s *QueryDubheRepayInfoResponse) SetChannelAmt(v int64) *QueryDubheRepayInfoResponse {
	s.ChannelAmt = &v
	return s
}

func (s *QueryDubheRepayInfoResponse) SetRepayFee(v string) *QueryDubheRepayInfoResponse {
	s.RepayFee = &v
	return s
}

func (s *QueryDubheRepayInfoResponse) SetRepayPunish(v int64) *QueryDubheRepayInfoResponse {
	s.RepayPunish = &v
	return s
}

func (s *QueryDubheRepayInfoResponse) SetRepayAccount(v string) *QueryDubheRepayInfoResponse {
	s.RepayAccount = &v
	return s
}

func (s *QueryDubheRepayInfoResponse) SetRepayAccountName(v string) *QueryDubheRepayInfoResponse {
	s.RepayAccountName = &v
	return s
}

func (s *QueryDubheRepayInfoResponse) SetRepayMobile(v string) *QueryDubheRepayInfoResponse {
	s.RepayMobile = &v
	return s
}

func (s *QueryDubheRepayInfoResponse) SetRepayBankNo(v string) *QueryDubheRepayInfoResponse {
	s.RepayBankNo = &v
	return s
}

func (s *QueryDubheRepayInfoResponse) SetRepayBankName(v string) *QueryDubheRepayInfoResponse {
	s.RepayBankName = &v
	return s
}

func (s *QueryDubheRepayInfoResponse) SetRepayStatus(v string) *QueryDubheRepayInfoResponse {
	s.RepayStatus = &v
	return s
}

func (s *QueryDubheRepayInfoResponse) SetFailReason(v string) *QueryDubheRepayInfoResponse {
	s.FailReason = &v
	return s
}

func (s *QueryDubheRepayInfoResponse) SetApplyNo(v string) *QueryDubheRepayInfoResponse {
	s.ApplyNo = &v
	return s
}

type UpdateDubheCustomerInfoRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 客户姓名(可修改字段)
	CustomName *string `json:"custom_name,omitempty" xml:"custom_name,omitempty"`
	// 户籍所在地(可修改字段)
	CensusRegister *string `json:"census_register,omitempty" xml:"census_register,omitempty"`
	// 证件号码(可修改字段)
	CardNo *string `json:"card_no,omitempty" xml:"card_no,omitempty"`
	// 手机号码(可修改字段)
	Mobile *string `json:"mobile,omitempty" xml:"mobile,omitempty"`
	// 客户编号(唯一不变)
	CustomNo *string `json:"custom_no,omitempty" xml:"custom_no,omitempty" require:"true"`
	// 订单号
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty"`
}

func (s UpdateDubheCustomerInfoRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateDubheCustomerInfoRequest) GoString() string {
	return s.String()
}

func (s *UpdateDubheCustomerInfoRequest) SetAuthToken(v string) *UpdateDubheCustomerInfoRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateDubheCustomerInfoRequest) SetProductInstanceId(v string) *UpdateDubheCustomerInfoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateDubheCustomerInfoRequest) SetCustomName(v string) *UpdateDubheCustomerInfoRequest {
	s.CustomName = &v
	return s
}

func (s *UpdateDubheCustomerInfoRequest) SetCensusRegister(v string) *UpdateDubheCustomerInfoRequest {
	s.CensusRegister = &v
	return s
}

func (s *UpdateDubheCustomerInfoRequest) SetCardNo(v string) *UpdateDubheCustomerInfoRequest {
	s.CardNo = &v
	return s
}

func (s *UpdateDubheCustomerInfoRequest) SetMobile(v string) *UpdateDubheCustomerInfoRequest {
	s.Mobile = &v
	return s
}

func (s *UpdateDubheCustomerInfoRequest) SetCustomNo(v string) *UpdateDubheCustomerInfoRequest {
	s.CustomNo = &v
	return s
}

func (s *UpdateDubheCustomerInfoRequest) SetOrderNo(v string) *UpdateDubheCustomerInfoRequest {
	s.OrderNo = &v
	return s
}

type UpdateDubheCustomerInfoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s UpdateDubheCustomerInfoResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateDubheCustomerInfoResponse) GoString() string {
	return s.String()
}

func (s *UpdateDubheCustomerInfoResponse) SetReqMsgId(v string) *UpdateDubheCustomerInfoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateDubheCustomerInfoResponse) SetResultCode(v string) *UpdateDubheCustomerInfoResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateDubheCustomerInfoResponse) SetResultMsg(v string) *UpdateDubheCustomerInfoResponse {
	s.ResultMsg = &v
	return s
}

type ApplyDubheCustomerAgreementsignRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 客户编号
	CustomNo *string `json:"custom_no,omitempty" xml:"custom_no,omitempty" require:"true"`
	// 订单号
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty"`
}

func (s ApplyDubheCustomerAgreementsignRequest) String() string {
	return tea.Prettify(s)
}

func (s ApplyDubheCustomerAgreementsignRequest) GoString() string {
	return s.String()
}

func (s *ApplyDubheCustomerAgreementsignRequest) SetAuthToken(v string) *ApplyDubheCustomerAgreementsignRequest {
	s.AuthToken = &v
	return s
}

func (s *ApplyDubheCustomerAgreementsignRequest) SetProductInstanceId(v string) *ApplyDubheCustomerAgreementsignRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ApplyDubheCustomerAgreementsignRequest) SetCustomNo(v string) *ApplyDubheCustomerAgreementsignRequest {
	s.CustomNo = &v
	return s
}

func (s *ApplyDubheCustomerAgreementsignRequest) SetOrderNo(v string) *ApplyDubheCustomerAgreementsignRequest {
	s.OrderNo = &v
	return s
}

type ApplyDubheCustomerAgreementsignResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// sdkParams返回给商户app客户端，作为客户端唤起sdk的入参
	SdkParams *string `json:"sdk_params,omitempty" xml:"sdk_params,omitempty"`
}

func (s ApplyDubheCustomerAgreementsignResponse) String() string {
	return tea.Prettify(s)
}

func (s ApplyDubheCustomerAgreementsignResponse) GoString() string {
	return s.String()
}

func (s *ApplyDubheCustomerAgreementsignResponse) SetReqMsgId(v string) *ApplyDubheCustomerAgreementsignResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ApplyDubheCustomerAgreementsignResponse) SetResultCode(v string) *ApplyDubheCustomerAgreementsignResponse {
	s.ResultCode = &v
	return s
}

func (s *ApplyDubheCustomerAgreementsignResponse) SetResultMsg(v string) *ApplyDubheCustomerAgreementsignResponse {
	s.ResultMsg = &v
	return s
}

func (s *ApplyDubheCustomerAgreementsignResponse) SetSdkParams(v string) *ApplyDubheCustomerAgreementsignResponse {
	s.SdkParams = &v
	return s
}

type QueryDubheCustomerAgreementsignRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 客户编号
	CustomNo *string `json:"custom_no,omitempty" xml:"custom_no,omitempty" require:"true"`
	// 订单号
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty"`
}

func (s QueryDubheCustomerAgreementsignRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDubheCustomerAgreementsignRequest) GoString() string {
	return s.String()
}

func (s *QueryDubheCustomerAgreementsignRequest) SetAuthToken(v string) *QueryDubheCustomerAgreementsignRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDubheCustomerAgreementsignRequest) SetProductInstanceId(v string) *QueryDubheCustomerAgreementsignRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryDubheCustomerAgreementsignRequest) SetCustomNo(v string) *QueryDubheCustomerAgreementsignRequest {
	s.CustomNo = &v
	return s
}

func (s *QueryDubheCustomerAgreementsignRequest) SetOrderNo(v string) *QueryDubheCustomerAgreementsignRequest {
	s.OrderNo = &v
	return s
}

type QueryDubheCustomerAgreementsignResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 客户编号
	CustomNo *string `json:"custom_no,omitempty" xml:"custom_no,omitempty"`
	// 流水号(代扣协议中标示用户的唯一签约号)
	TransSerials *string `json:"trans_serials,omitempty" xml:"trans_serials,omitempty"`
	// 协议签约状态(0-成功1-失败2-处理中)
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 协议签约时间(支付宝代扣协议的实际签约时间，格式为yyyy-MM-dd HH:mm:ss)
	SignTime *string `json:"sign_time,omitempty" xml:"sign_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 协议生效时间(用户代扣协议的实际生效时间，格式为yyyy-MM-dd HH:mm:ss)
	ValidTime *string `json:"valid_time,omitempty" xml:"valid_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 协议失效时间(用户代扣协议的失效时间，格式为yyyy-MM-dd HH:mm:ss)
	InvalidTime *string `json:"invalid_time,omitempty" xml:"invalid_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
}

func (s QueryDubheCustomerAgreementsignResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDubheCustomerAgreementsignResponse) GoString() string {
	return s.String()
}

func (s *QueryDubheCustomerAgreementsignResponse) SetReqMsgId(v string) *QueryDubheCustomerAgreementsignResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDubheCustomerAgreementsignResponse) SetResultCode(v string) *QueryDubheCustomerAgreementsignResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDubheCustomerAgreementsignResponse) SetResultMsg(v string) *QueryDubheCustomerAgreementsignResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDubheCustomerAgreementsignResponse) SetCustomNo(v string) *QueryDubheCustomerAgreementsignResponse {
	s.CustomNo = &v
	return s
}

func (s *QueryDubheCustomerAgreementsignResponse) SetTransSerials(v string) *QueryDubheCustomerAgreementsignResponse {
	s.TransSerials = &v
	return s
}

func (s *QueryDubheCustomerAgreementsignResponse) SetStatus(v string) *QueryDubheCustomerAgreementsignResponse {
	s.Status = &v
	return s
}

func (s *QueryDubheCustomerAgreementsignResponse) SetSignTime(v string) *QueryDubheCustomerAgreementsignResponse {
	s.SignTime = &v
	return s
}

func (s *QueryDubheCustomerAgreementsignResponse) SetValidTime(v string) *QueryDubheCustomerAgreementsignResponse {
	s.ValidTime = &v
	return s
}

func (s *QueryDubheCustomerAgreementsignResponse) SetInvalidTime(v string) *QueryDubheCustomerAgreementsignResponse {
	s.InvalidTime = &v
	return s
}

type RepayDubheRepayWithholdRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// originalOrderNo
	OriginalOrderNo *string `json:"original_order_no,omitempty" xml:"original_order_no,omitempty" require:"true"`
	// 还款类型1:当期结清，2：正常还款3：全部结清
	RepayType *string `json:"repay_type,omitempty" xml:"repay_type,omitempty" require:"true"`
	// 订单号
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty" require:"true"`
}

func (s RepayDubheRepayWithholdRequest) String() string {
	return tea.Prettify(s)
}

func (s RepayDubheRepayWithholdRequest) GoString() string {
	return s.String()
}

func (s *RepayDubheRepayWithholdRequest) SetAuthToken(v string) *RepayDubheRepayWithholdRequest {
	s.AuthToken = &v
	return s
}

func (s *RepayDubheRepayWithholdRequest) SetProductInstanceId(v string) *RepayDubheRepayWithholdRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *RepayDubheRepayWithholdRequest) SetOriginalOrderNo(v string) *RepayDubheRepayWithholdRequest {
	s.OriginalOrderNo = &v
	return s
}

func (s *RepayDubheRepayWithholdRequest) SetRepayType(v string) *RepayDubheRepayWithholdRequest {
	s.RepayType = &v
	return s
}

func (s *RepayDubheRepayWithholdRequest) SetOrderNo(v string) *RepayDubheRepayWithholdRequest {
	s.OrderNo = &v
	return s
}

type RepayDubheRepayWithholdResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s RepayDubheRepayWithholdResponse) String() string {
	return tea.Prettify(s)
}

func (s RepayDubheRepayWithholdResponse) GoString() string {
	return s.String()
}

func (s *RepayDubheRepayWithholdResponse) SetReqMsgId(v string) *RepayDubheRepayWithholdResponse {
	s.ReqMsgId = &v
	return s
}

func (s *RepayDubheRepayWithholdResponse) SetResultCode(v string) *RepayDubheRepayWithholdResponse {
	s.ResultCode = &v
	return s
}

func (s *RepayDubheRepayWithholdResponse) SetResultMsg(v string) *RepayDubheRepayWithholdResponse {
	s.ResultMsg = &v
	return s
}

type QueryDubheSearchContractRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 原用信订单号
	OriginalOrderNo *string `json:"original_order_no,omitempty" xml:"original_order_no,omitempty" require:"true"`
}

func (s QueryDubheSearchContractRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDubheSearchContractRequest) GoString() string {
	return s.String()
}

func (s *QueryDubheSearchContractRequest) SetAuthToken(v string) *QueryDubheSearchContractRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDubheSearchContractRequest) SetProductInstanceId(v string) *QueryDubheSearchContractRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryDubheSearchContractRequest) SetOriginalOrderNo(v string) *QueryDubheSearchContractRequest {
	s.OriginalOrderNo = &v
	return s
}

type QueryDubheSearchContractResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 关联编号（授信/用信）
	RelationNo *string `json:"relation_no,omitempty" xml:"relation_no,omitempty"`
	// 合同编号
	ContractNo *string `json:"contract_no,omitempty" xml:"contract_no,omitempty"`
	// 合同名称
	ContractName *string `json:"contract_name,omitempty" xml:"contract_name,omitempty"`
	// 合同类型
	ContractType *string `json:"contract_type,omitempty" xml:"contract_type,omitempty"`
	// 客户编号
	CustomNo *string `json:"custom_no,omitempty" xml:"custom_no,omitempty"`
	// 下载地址
	SavePath *string `json:"save_path,omitempty" xml:"save_path,omitempty"`
	// 合同金额
	ContractAmount *int64 `json:"contract_amount,omitempty" xml:"contract_amount,omitempty"`
}

func (s QueryDubheSearchContractResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDubheSearchContractResponse) GoString() string {
	return s.String()
}

func (s *QueryDubheSearchContractResponse) SetReqMsgId(v string) *QueryDubheSearchContractResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDubheSearchContractResponse) SetResultCode(v string) *QueryDubheSearchContractResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDubheSearchContractResponse) SetResultMsg(v string) *QueryDubheSearchContractResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDubheSearchContractResponse) SetRelationNo(v string) *QueryDubheSearchContractResponse {
	s.RelationNo = &v
	return s
}

func (s *QueryDubheSearchContractResponse) SetContractNo(v string) *QueryDubheSearchContractResponse {
	s.ContractNo = &v
	return s
}

func (s *QueryDubheSearchContractResponse) SetContractName(v string) *QueryDubheSearchContractResponse {
	s.ContractName = &v
	return s
}

func (s *QueryDubheSearchContractResponse) SetContractType(v string) *QueryDubheSearchContractResponse {
	s.ContractType = &v
	return s
}

func (s *QueryDubheSearchContractResponse) SetCustomNo(v string) *QueryDubheSearchContractResponse {
	s.CustomNo = &v
	return s
}

func (s *QueryDubheSearchContractResponse) SetSavePath(v string) *QueryDubheSearchContractResponse {
	s.SavePath = &v
	return s
}

func (s *QueryDubheSearchContractResponse) SetContractAmount(v int64) *QueryDubheSearchContractResponse {
	s.ContractAmount = &v
	return s
}

type QueryDubheReceiptOverdueRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 合同编号
	ContractNo *string `json:"contract_no,omitempty" xml:"contract_no,omitempty" require:"true"`
	// 渠道号
	ChannelCode *string `json:"channel_code,omitempty" xml:"channel_code,omitempty" require:"true"`
}

func (s QueryDubheReceiptOverdueRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDubheReceiptOverdueRequest) GoString() string {
	return s.String()
}

func (s *QueryDubheReceiptOverdueRequest) SetAuthToken(v string) *QueryDubheReceiptOverdueRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDubheReceiptOverdueRequest) SetProductInstanceId(v string) *QueryDubheReceiptOverdueRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryDubheReceiptOverdueRequest) SetContractNo(v string) *QueryDubheReceiptOverdueRequest {
	s.ContractNo = &v
	return s
}

func (s *QueryDubheReceiptOverdueRequest) SetChannelCode(v string) *QueryDubheReceiptOverdueRequest {
	s.ChannelCode = &v
	return s
}

type QueryDubheReceiptOverdueResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 逾期信息响应
	Data *OverdueInfoResponse `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QueryDubheReceiptOverdueResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDubheReceiptOverdueResponse) GoString() string {
	return s.String()
}

func (s *QueryDubheReceiptOverdueResponse) SetReqMsgId(v string) *QueryDubheReceiptOverdueResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDubheReceiptOverdueResponse) SetResultCode(v string) *QueryDubheReceiptOverdueResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDubheReceiptOverdueResponse) SetResultMsg(v string) *QueryDubheReceiptOverdueResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDubheReceiptOverdueResponse) SetData(v *OverdueInfoResponse) *QueryDubheReceiptOverdueResponse {
	s.Data = v
	return s
}

type SendDubbridgeSmsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 接收短信的手机号码。支持对多个手机号码发送短信，手机号码之间以英文逗号（,）分隔。上限为1000个手机号码。批量调用相对于单条调用及时性稍有延迟。
	PhoneNumbers *string `json:"phone_numbers,omitempty" xml:"phone_numbers,omitempty" require:"true"`
	// 短信签名
	SignName *string `json:"sign_name,omitempty" xml:"sign_name,omitempty" require:"true"`
	// 短信模板CODE
	TemplateCode *string `json:"template_code,omitempty" xml:"template_code,omitempty" require:"true"`
	// 短信模板变量对应的值，JSON格式
	TemplateParam *string `json:"template_param,omitempty" xml:"template_param,omitempty"`
	// 上行短信扩展码
	SmsUpExtendCode *string `json:"sms_up_extend_code,omitempty" xml:"sms_up_extend_code,omitempty"`
	// 外部流水扩展
	OutId *string `json:"out_id,omitempty" xml:"out_id,omitempty" require:"true"`
}

func (s SendDubbridgeSmsRequest) String() string {
	return tea.Prettify(s)
}

func (s SendDubbridgeSmsRequest) GoString() string {
	return s.String()
}

func (s *SendDubbridgeSmsRequest) SetAuthToken(v string) *SendDubbridgeSmsRequest {
	s.AuthToken = &v
	return s
}

func (s *SendDubbridgeSmsRequest) SetProductInstanceId(v string) *SendDubbridgeSmsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SendDubbridgeSmsRequest) SetPhoneNumbers(v string) *SendDubbridgeSmsRequest {
	s.PhoneNumbers = &v
	return s
}

func (s *SendDubbridgeSmsRequest) SetSignName(v string) *SendDubbridgeSmsRequest {
	s.SignName = &v
	return s
}

func (s *SendDubbridgeSmsRequest) SetTemplateCode(v string) *SendDubbridgeSmsRequest {
	s.TemplateCode = &v
	return s
}

func (s *SendDubbridgeSmsRequest) SetTemplateParam(v string) *SendDubbridgeSmsRequest {
	s.TemplateParam = &v
	return s
}

func (s *SendDubbridgeSmsRequest) SetSmsUpExtendCode(v string) *SendDubbridgeSmsRequest {
	s.SmsUpExtendCode = &v
	return s
}

func (s *SendDubbridgeSmsRequest) SetOutId(v string) *SendDubbridgeSmsRequest {
	s.OutId = &v
	return s
}

type SendDubbridgeSmsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 云通信发送结果
	Response *SmsReponse `json:"response,omitempty" xml:"response,omitempty"`
}

func (s SendDubbridgeSmsResponse) String() string {
	return tea.Prettify(s)
}

func (s SendDubbridgeSmsResponse) GoString() string {
	return s.String()
}

func (s *SendDubbridgeSmsResponse) SetReqMsgId(v string) *SendDubbridgeSmsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SendDubbridgeSmsResponse) SetResultCode(v string) *SendDubbridgeSmsResponse {
	s.ResultCode = &v
	return s
}

func (s *SendDubbridgeSmsResponse) SetResultMsg(v string) *SendDubbridgeSmsResponse {
	s.ResultMsg = &v
	return s
}

func (s *SendDubbridgeSmsResponse) SetResponse(v *SmsReponse) *SendDubbridgeSmsResponse {
	s.Response = v
	return s
}

type SendDubbridgeSmsBatchRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 短信模板code
	TemplateCode *string `json:"template_code,omitempty" xml:"template_code,omitempty" require:"true"`
	// 接收短信的手机号码，JSON数组格式
	PhoneNumberJson *string `json:"phone_number_json,omitempty" xml:"phone_number_json,omitempty" require:"true"`
	// 短信签名名称，JSON数组格式
	SignNameJson *string `json:"sign_name_json,omitempty" xml:"sign_name_json,omitempty" require:"true"`
	// 短信模板变量对应的实际值，JSON数组格式
	TemplateParamJson *string `json:"template_param_json,omitempty" xml:"template_param_json,omitempty" require:"true"`
	// 上行短信扩展码，JSON数组格式。无特殊需要此字段的用户请忽略此字段
	SmsUpExtendCodeJson *string `json:"sms_up_extend_code_json,omitempty" xml:"sms_up_extend_code_json,omitempty" require:"true"`
}

func (s SendDubbridgeSmsBatchRequest) String() string {
	return tea.Prettify(s)
}

func (s SendDubbridgeSmsBatchRequest) GoString() string {
	return s.String()
}

func (s *SendDubbridgeSmsBatchRequest) SetAuthToken(v string) *SendDubbridgeSmsBatchRequest {
	s.AuthToken = &v
	return s
}

func (s *SendDubbridgeSmsBatchRequest) SetProductInstanceId(v string) *SendDubbridgeSmsBatchRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SendDubbridgeSmsBatchRequest) SetTemplateCode(v string) *SendDubbridgeSmsBatchRequest {
	s.TemplateCode = &v
	return s
}

func (s *SendDubbridgeSmsBatchRequest) SetPhoneNumberJson(v string) *SendDubbridgeSmsBatchRequest {
	s.PhoneNumberJson = &v
	return s
}

func (s *SendDubbridgeSmsBatchRequest) SetSignNameJson(v string) *SendDubbridgeSmsBatchRequest {
	s.SignNameJson = &v
	return s
}

func (s *SendDubbridgeSmsBatchRequest) SetTemplateParamJson(v string) *SendDubbridgeSmsBatchRequest {
	s.TemplateParamJson = &v
	return s
}

func (s *SendDubbridgeSmsBatchRequest) SetSmsUpExtendCodeJson(v string) *SendDubbridgeSmsBatchRequest {
	s.SmsUpExtendCodeJson = &v
	return s
}

type SendDubbridgeSmsBatchResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 云通信短信发送结果
	Response *SmsReponse `json:"response,omitempty" xml:"response,omitempty"`
}

func (s SendDubbridgeSmsBatchResponse) String() string {
	return tea.Prettify(s)
}

func (s SendDubbridgeSmsBatchResponse) GoString() string {
	return s.String()
}

func (s *SendDubbridgeSmsBatchResponse) SetReqMsgId(v string) *SendDubbridgeSmsBatchResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SendDubbridgeSmsBatchResponse) SetResultCode(v string) *SendDubbridgeSmsBatchResponse {
	s.ResultCode = &v
	return s
}

func (s *SendDubbridgeSmsBatchResponse) SetResultMsg(v string) *SendDubbridgeSmsBatchResponse {
	s.ResultMsg = &v
	return s
}

func (s *SendDubbridgeSmsBatchResponse) SetResponse(v *SmsReponse) *SendDubbridgeSmsBatchResponse {
	s.Response = v
	return s
}

type QueryDubbridgeRouterFundrouterRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 身份证号
	CardNo *string `json:"card_no,omitempty" xml:"card_no,omitempty" require:"true"`
	// 手机号
	Mobile *string `json:"mobile,omitempty" xml:"mobile,omitempty" require:"true"`
	// 姓名
	CustomName *string `json:"custom_name,omitempty" xml:"custom_name,omitempty" require:"true"`
	// 合作方产品编号
	ProdNo *string `json:"prod_no,omitempty" xml:"prod_no,omitempty" require:"true"`
	// 渠道类型
	ChannelType *string `json:"channel_type,omitempty" xml:"channel_type,omitempty"`
	// 客户类型
	CustomType *string `json:"custom_type,omitempty" xml:"custom_type,omitempty"`
	// 导流平台
	TrafficPlatform *string `json:"traffic_platform,omitempty" xml:"traffic_platform,omitempty"`
	// 流量名称
	TrafficSourceName *string `json:"traffic_source_name,omitempty" xml:"traffic_source_name,omitempty"`
	// 广告位标志
	TrafficAdId *string `json:"traffic_ad_id,omitempty" xml:"traffic_ad_id,omitempty"`
	// 预留
	TrafficMktId *string `json:"traffic_mkt_id,omitempty" xml:"traffic_mkt_id,omitempty"`
	// 预留
	ClickId *string `json:"click_id,omitempty" xml:"click_id,omitempty"`
}

func (s QueryDubbridgeRouterFundrouterRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDubbridgeRouterFundrouterRequest) GoString() string {
	return s.String()
}

func (s *QueryDubbridgeRouterFundrouterRequest) SetAuthToken(v string) *QueryDubbridgeRouterFundrouterRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDubbridgeRouterFundrouterRequest) SetProductInstanceId(v string) *QueryDubbridgeRouterFundrouterRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryDubbridgeRouterFundrouterRequest) SetCardNo(v string) *QueryDubbridgeRouterFundrouterRequest {
	s.CardNo = &v
	return s
}

func (s *QueryDubbridgeRouterFundrouterRequest) SetMobile(v string) *QueryDubbridgeRouterFundrouterRequest {
	s.Mobile = &v
	return s
}

func (s *QueryDubbridgeRouterFundrouterRequest) SetCustomName(v string) *QueryDubbridgeRouterFundrouterRequest {
	s.CustomName = &v
	return s
}

func (s *QueryDubbridgeRouterFundrouterRequest) SetProdNo(v string) *QueryDubbridgeRouterFundrouterRequest {
	s.ProdNo = &v
	return s
}

func (s *QueryDubbridgeRouterFundrouterRequest) SetChannelType(v string) *QueryDubbridgeRouterFundrouterRequest {
	s.ChannelType = &v
	return s
}

func (s *QueryDubbridgeRouterFundrouterRequest) SetCustomType(v string) *QueryDubbridgeRouterFundrouterRequest {
	s.CustomType = &v
	return s
}

func (s *QueryDubbridgeRouterFundrouterRequest) SetTrafficPlatform(v string) *QueryDubbridgeRouterFundrouterRequest {
	s.TrafficPlatform = &v
	return s
}

func (s *QueryDubbridgeRouterFundrouterRequest) SetTrafficSourceName(v string) *QueryDubbridgeRouterFundrouterRequest {
	s.TrafficSourceName = &v
	return s
}

func (s *QueryDubbridgeRouterFundrouterRequest) SetTrafficAdId(v string) *QueryDubbridgeRouterFundrouterRequest {
	s.TrafficAdId = &v
	return s
}

func (s *QueryDubbridgeRouterFundrouterRequest) SetTrafficMktId(v string) *QueryDubbridgeRouterFundrouterRequest {
	s.TrafficMktId = &v
	return s
}

func (s *QueryDubbridgeRouterFundrouterRequest) SetClickId(v string) *QueryDubbridgeRouterFundrouterRequest {
	s.ClickId = &v
	return s
}

type QueryDubbridgeRouterFundrouterResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 资金方代码
	FundCode *string `json:"fund_code,omitempty" xml:"fund_code,omitempty"`
}

func (s QueryDubbridgeRouterFundrouterResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDubbridgeRouterFundrouterResponse) GoString() string {
	return s.String()
}

func (s *QueryDubbridgeRouterFundrouterResponse) SetReqMsgId(v string) *QueryDubbridgeRouterFundrouterResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDubbridgeRouterFundrouterResponse) SetResultCode(v string) *QueryDubbridgeRouterFundrouterResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDubbridgeRouterFundrouterResponse) SetResultMsg(v string) *QueryDubbridgeRouterFundrouterResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDubbridgeRouterFundrouterResponse) SetFundCode(v string) *QueryDubbridgeRouterFundrouterResponse {
	s.FundCode = &v
	return s
}

type ApplyDubbridgeCreditRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 基础信息
	PersonalInfo *PersonalInfo `json:"personal_info,omitempty" xml:"personal_info,omitempty" require:"true"`
	// 资产方用户唯一标识
	OpenId *string `json:"open_id,omitempty" xml:"open_id,omitempty" require:"true"`
	// 订单号
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty" require:"true"`
	// 居住信息
	BorrowerLiveInfo *LiveInfo `json:"borrower_live_info,omitempty" xml:"borrower_live_info,omitempty"`
	// 工作信息
	BorrowerEmpInfo *JobInfo `json:"borrower_emp_info,omitempty" xml:"borrower_emp_info,omitempty"`
	// 产品编号
	ProdNo *string `json:"prod_no,omitempty" xml:"prod_no,omitempty" require:"true"`
	// 风险数据对象
	RiskData *RiskData `json:"risk_data,omitempty" xml:"risk_data,omitempty"`
	// 借款用途
	LoanReason *string `json:"loan_reason,omitempty" xml:"loan_reason,omitempty"`
	// 资料文件
	Materials []*Material `json:"materials,omitempty" xml:"materials,omitempty" type:"Repeated"`
	// 导流平台
	TrafficPlatform *string `json:"traffic_platform,omitempty" xml:"traffic_platform,omitempty"`
	// 流量名称
	TrafficSourceName *string `json:"traffic_source_name,omitempty" xml:"traffic_source_name,omitempty"`
	// 广告位标志
	TrafficAdId *string `json:"traffic_ad_id,omitempty" xml:"traffic_ad_id,omitempty"`
	// 预留
	TrafficMktId *string `json:"traffic_mkt_id,omitempty" xml:"traffic_mkt_id,omitempty"`
	// 预留
	ClickId *string `json:"click_id,omitempty" xml:"click_id,omitempty"`
	// 渠道类型
	ChannelType *string `json:"channel_type,omitempty" xml:"channel_type,omitempty"`
	// 客户类型
	CustomType *string `json:"custom_type,omitempty" xml:"custom_type,omitempty"`
}

func (s ApplyDubbridgeCreditRequest) String() string {
	return tea.Prettify(s)
}

func (s ApplyDubbridgeCreditRequest) GoString() string {
	return s.String()
}

func (s *ApplyDubbridgeCreditRequest) SetAuthToken(v string) *ApplyDubbridgeCreditRequest {
	s.AuthToken = &v
	return s
}

func (s *ApplyDubbridgeCreditRequest) SetProductInstanceId(v string) *ApplyDubbridgeCreditRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ApplyDubbridgeCreditRequest) SetPersonalInfo(v *PersonalInfo) *ApplyDubbridgeCreditRequest {
	s.PersonalInfo = v
	return s
}

func (s *ApplyDubbridgeCreditRequest) SetOpenId(v string) *ApplyDubbridgeCreditRequest {
	s.OpenId = &v
	return s
}

func (s *ApplyDubbridgeCreditRequest) SetOrderNo(v string) *ApplyDubbridgeCreditRequest {
	s.OrderNo = &v
	return s
}

func (s *ApplyDubbridgeCreditRequest) SetBorrowerLiveInfo(v *LiveInfo) *ApplyDubbridgeCreditRequest {
	s.BorrowerLiveInfo = v
	return s
}

func (s *ApplyDubbridgeCreditRequest) SetBorrowerEmpInfo(v *JobInfo) *ApplyDubbridgeCreditRequest {
	s.BorrowerEmpInfo = v
	return s
}

func (s *ApplyDubbridgeCreditRequest) SetProdNo(v string) *ApplyDubbridgeCreditRequest {
	s.ProdNo = &v
	return s
}

func (s *ApplyDubbridgeCreditRequest) SetRiskData(v *RiskData) *ApplyDubbridgeCreditRequest {
	s.RiskData = v
	return s
}

func (s *ApplyDubbridgeCreditRequest) SetLoanReason(v string) *ApplyDubbridgeCreditRequest {
	s.LoanReason = &v
	return s
}

func (s *ApplyDubbridgeCreditRequest) SetMaterials(v []*Material) *ApplyDubbridgeCreditRequest {
	s.Materials = v
	return s
}

func (s *ApplyDubbridgeCreditRequest) SetTrafficPlatform(v string) *ApplyDubbridgeCreditRequest {
	s.TrafficPlatform = &v
	return s
}

func (s *ApplyDubbridgeCreditRequest) SetTrafficSourceName(v string) *ApplyDubbridgeCreditRequest {
	s.TrafficSourceName = &v
	return s
}

func (s *ApplyDubbridgeCreditRequest) SetTrafficAdId(v string) *ApplyDubbridgeCreditRequest {
	s.TrafficAdId = &v
	return s
}

func (s *ApplyDubbridgeCreditRequest) SetTrafficMktId(v string) *ApplyDubbridgeCreditRequest {
	s.TrafficMktId = &v
	return s
}

func (s *ApplyDubbridgeCreditRequest) SetClickId(v string) *ApplyDubbridgeCreditRequest {
	s.ClickId = &v
	return s
}

func (s *ApplyDubbridgeCreditRequest) SetChannelType(v string) *ApplyDubbridgeCreditRequest {
	s.ChannelType = &v
	return s
}

func (s *ApplyDubbridgeCreditRequest) SetCustomType(v string) *ApplyDubbridgeCreditRequest {
	s.CustomType = &v
	return s
}

type ApplyDubbridgeCreditResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 客户编号
	CustomNo *string `json:"custom_no,omitempty" xml:"custom_no,omitempty"`
}

func (s ApplyDubbridgeCreditResponse) String() string {
	return tea.Prettify(s)
}

func (s ApplyDubbridgeCreditResponse) GoString() string {
	return s.String()
}

func (s *ApplyDubbridgeCreditResponse) SetReqMsgId(v string) *ApplyDubbridgeCreditResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ApplyDubbridgeCreditResponse) SetResultCode(v string) *ApplyDubbridgeCreditResponse {
	s.ResultCode = &v
	return s
}

func (s *ApplyDubbridgeCreditResponse) SetResultMsg(v string) *ApplyDubbridgeCreditResponse {
	s.ResultMsg = &v
	return s
}

func (s *ApplyDubbridgeCreditResponse) SetCustomNo(v string) *ApplyDubbridgeCreditResponse {
	s.CustomNo = &v
	return s
}

type UploadDubbridgeFileRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单号
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty" require:"true" maxLength:"32"`
	// 渠道号
	ChannelCode *string `json:"channel_code,omitempty" xml:"channel_code,omitempty" require:"true"`
	// 文件名
	FileName *string `json:"file_name,omitempty" xml:"file_name,omitempty" require:"true"`
	// 文件id
	// 待上传文件
	FileObject io.Reader `json:"fileObject,omitempty" xml:"fileObject,omitempty"`
	// 待上传文件名
	FileObjectName *string `json:"fileObjectName,omitempty" xml:"fileObjectName,omitempty"`
	FileId         *string `json:"file_id,omitempty" xml:"file_id,omitempty" require:"true"`
}

func (s UploadDubbridgeFileRequest) String() string {
	return tea.Prettify(s)
}

func (s UploadDubbridgeFileRequest) GoString() string {
	return s.String()
}

func (s *UploadDubbridgeFileRequest) SetAuthToken(v string) *UploadDubbridgeFileRequest {
	s.AuthToken = &v
	return s
}

func (s *UploadDubbridgeFileRequest) SetProductInstanceId(v string) *UploadDubbridgeFileRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UploadDubbridgeFileRequest) SetOrderNo(v string) *UploadDubbridgeFileRequest {
	s.OrderNo = &v
	return s
}

func (s *UploadDubbridgeFileRequest) SetChannelCode(v string) *UploadDubbridgeFileRequest {
	s.ChannelCode = &v
	return s
}

func (s *UploadDubbridgeFileRequest) SetFileName(v string) *UploadDubbridgeFileRequest {
	s.FileName = &v
	return s
}

func (s *UploadDubbridgeFileRequest) SetFileObject(v io.Reader) *UploadDubbridgeFileRequest {
	s.FileObject = v
	return s
}

func (s *UploadDubbridgeFileRequest) SetFileObjectName(v string) *UploadDubbridgeFileRequest {
	s.FileObjectName = &v
	return s
}

func (s *UploadDubbridgeFileRequest) SetFileId(v string) *UploadDubbridgeFileRequest {
	s.FileId = &v
	return s
}

type UploadDubbridgeFileResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 文件信息
	FileInfo *DubheFileInfo `json:"file_info,omitempty" xml:"file_info,omitempty"`
}

func (s UploadDubbridgeFileResponse) String() string {
	return tea.Prettify(s)
}

func (s UploadDubbridgeFileResponse) GoString() string {
	return s.String()
}

func (s *UploadDubbridgeFileResponse) SetReqMsgId(v string) *UploadDubbridgeFileResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UploadDubbridgeFileResponse) SetResultCode(v string) *UploadDubbridgeFileResponse {
	s.ResultCode = &v
	return s
}

func (s *UploadDubbridgeFileResponse) SetResultMsg(v string) *UploadDubbridgeFileResponse {
	s.ResultMsg = &v
	return s
}

func (s *UploadDubbridgeFileResponse) SetFileInfo(v *DubheFileInfo) *UploadDubbridgeFileResponse {
	s.FileInfo = v
	return s
}

type BindDubbridgeCustomerBankcardRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单号
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty" require:"true"`
	// 客户编号
	CustomNo *string `json:"custom_no,omitempty" xml:"custom_no,omitempty" require:"true"`
	// 银行卡号
	BankCardNo *string `json:"bank_card_no,omitempty" xml:"bank_card_no,omitempty" require:"true"`
	// 渠道描述，具体请见分配
	ChannelCode *string `json:"channel_code,omitempty" xml:"channel_code,omitempty" require:"true"`
}

func (s BindDubbridgeCustomerBankcardRequest) String() string {
	return tea.Prettify(s)
}

func (s BindDubbridgeCustomerBankcardRequest) GoString() string {
	return s.String()
}

func (s *BindDubbridgeCustomerBankcardRequest) SetAuthToken(v string) *BindDubbridgeCustomerBankcardRequest {
	s.AuthToken = &v
	return s
}

func (s *BindDubbridgeCustomerBankcardRequest) SetProductInstanceId(v string) *BindDubbridgeCustomerBankcardRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *BindDubbridgeCustomerBankcardRequest) SetOrderNo(v string) *BindDubbridgeCustomerBankcardRequest {
	s.OrderNo = &v
	return s
}

func (s *BindDubbridgeCustomerBankcardRequest) SetCustomNo(v string) *BindDubbridgeCustomerBankcardRequest {
	s.CustomNo = &v
	return s
}

func (s *BindDubbridgeCustomerBankcardRequest) SetBankCardNo(v string) *BindDubbridgeCustomerBankcardRequest {
	s.BankCardNo = &v
	return s
}

func (s *BindDubbridgeCustomerBankcardRequest) SetChannelCode(v string) *BindDubbridgeCustomerBankcardRequest {
	s.ChannelCode = &v
	return s
}

type BindDubbridgeCustomerBankcardResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 绑卡流水
	BindSerialNo *string `json:"bind_serial_no,omitempty" xml:"bind_serial_no,omitempty"`
}

func (s BindDubbridgeCustomerBankcardResponse) String() string {
	return tea.Prettify(s)
}

func (s BindDubbridgeCustomerBankcardResponse) GoString() string {
	return s.String()
}

func (s *BindDubbridgeCustomerBankcardResponse) SetReqMsgId(v string) *BindDubbridgeCustomerBankcardResponse {
	s.ReqMsgId = &v
	return s
}

func (s *BindDubbridgeCustomerBankcardResponse) SetResultCode(v string) *BindDubbridgeCustomerBankcardResponse {
	s.ResultCode = &v
	return s
}

func (s *BindDubbridgeCustomerBankcardResponse) SetResultMsg(v string) *BindDubbridgeCustomerBankcardResponse {
	s.ResultMsg = &v
	return s
}

func (s *BindDubbridgeCustomerBankcardResponse) SetBindSerialNo(v string) *BindDubbridgeCustomerBankcardResponse {
	s.BindSerialNo = &v
	return s
}

type VerifyDubbridgeCustomerBankcardRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s VerifyDubbridgeCustomerBankcardRequest) String() string {
	return tea.Prettify(s)
}

func (s VerifyDubbridgeCustomerBankcardRequest) GoString() string {
	return s.String()
}

func (s *VerifyDubbridgeCustomerBankcardRequest) SetAuthToken(v string) *VerifyDubbridgeCustomerBankcardRequest {
	s.AuthToken = &v
	return s
}

func (s *VerifyDubbridgeCustomerBankcardRequest) SetProductInstanceId(v string) *VerifyDubbridgeCustomerBankcardRequest {
	s.ProductInstanceId = &v
	return s
}

type VerifyDubbridgeCustomerBankcardResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s VerifyDubbridgeCustomerBankcardResponse) String() string {
	return tea.Prettify(s)
}

func (s VerifyDubbridgeCustomerBankcardResponse) GoString() string {
	return s.String()
}

func (s *VerifyDubbridgeCustomerBankcardResponse) SetReqMsgId(v string) *VerifyDubbridgeCustomerBankcardResponse {
	s.ReqMsgId = &v
	return s
}

func (s *VerifyDubbridgeCustomerBankcardResponse) SetResultCode(v string) *VerifyDubbridgeCustomerBankcardResponse {
	s.ResultCode = &v
	return s
}

func (s *VerifyDubbridgeCustomerBankcardResponse) SetResultMsg(v string) *VerifyDubbridgeCustomerBankcardResponse {
	s.ResultMsg = &v
	return s
}

type NotifyDubbridgeDefininnerchannelRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 调用流水
	SeqNo *string `json:"seq_no,omitempty" xml:"seq_no,omitempty" require:"true"`
	// 机构平台接口名
	ApiName *string `json:"api_name,omitempty" xml:"api_name,omitempty" require:"true"`
	// 机构编号
	InstMemberCode *string `json:"inst_member_code,omitempty" xml:"inst_member_code,omitempty" require:"true"`
	// 业务参数Json
	BizParam *string `json:"biz_param,omitempty" xml:"biz_param,omitempty" require:"true"`
}

func (s NotifyDubbridgeDefininnerchannelRequest) String() string {
	return tea.Prettify(s)
}

func (s NotifyDubbridgeDefininnerchannelRequest) GoString() string {
	return s.String()
}

func (s *NotifyDubbridgeDefininnerchannelRequest) SetAuthToken(v string) *NotifyDubbridgeDefininnerchannelRequest {
	s.AuthToken = &v
	return s
}

func (s *NotifyDubbridgeDefininnerchannelRequest) SetProductInstanceId(v string) *NotifyDubbridgeDefininnerchannelRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *NotifyDubbridgeDefininnerchannelRequest) SetSeqNo(v string) *NotifyDubbridgeDefininnerchannelRequest {
	s.SeqNo = &v
	return s
}

func (s *NotifyDubbridgeDefininnerchannelRequest) SetApiName(v string) *NotifyDubbridgeDefininnerchannelRequest {
	s.ApiName = &v
	return s
}

func (s *NotifyDubbridgeDefininnerchannelRequest) SetInstMemberCode(v string) *NotifyDubbridgeDefininnerchannelRequest {
	s.InstMemberCode = &v
	return s
}

func (s *NotifyDubbridgeDefininnerchannelRequest) SetBizParam(v string) *NotifyDubbridgeDefininnerchannelRequest {
	s.BizParam = &v
	return s
}

type NotifyDubbridgeDefininnerchannelResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 处理结果
	Data *DefinInnerChannelNotifyResult `json:"data,omitempty" xml:"data,omitempty"`
}

func (s NotifyDubbridgeDefininnerchannelResponse) String() string {
	return tea.Prettify(s)
}

func (s NotifyDubbridgeDefininnerchannelResponse) GoString() string {
	return s.String()
}

func (s *NotifyDubbridgeDefininnerchannelResponse) SetReqMsgId(v string) *NotifyDubbridgeDefininnerchannelResponse {
	s.ReqMsgId = &v
	return s
}

func (s *NotifyDubbridgeDefininnerchannelResponse) SetResultCode(v string) *NotifyDubbridgeDefininnerchannelResponse {
	s.ResultCode = &v
	return s
}

func (s *NotifyDubbridgeDefininnerchannelResponse) SetResultMsg(v string) *NotifyDubbridgeDefininnerchannelResponse {
	s.ResultMsg = &v
	return s
}

func (s *NotifyDubbridgeDefininnerchannelResponse) SetData(v *DefinInnerChannelNotifyResult) *NotifyDubbridgeDefininnerchannelResponse {
	s.Data = v
	return s
}

type QueryDubbridgeCreditStatusRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 授信申请订单号
	OriginalOrderNo *string `json:"original_order_no,omitempty" xml:"original_order_no,omitempty"`
	// 订单号
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty" require:"true"`
	// 三方客户id
	OpenId *string `json:"open_id,omitempty" xml:"open_id,omitempty"`
}

func (s QueryDubbridgeCreditStatusRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDubbridgeCreditStatusRequest) GoString() string {
	return s.String()
}

func (s *QueryDubbridgeCreditStatusRequest) SetAuthToken(v string) *QueryDubbridgeCreditStatusRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDubbridgeCreditStatusRequest) SetProductInstanceId(v string) *QueryDubbridgeCreditStatusRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryDubbridgeCreditStatusRequest) SetOriginalOrderNo(v string) *QueryDubbridgeCreditStatusRequest {
	s.OriginalOrderNo = &v
	return s
}

func (s *QueryDubbridgeCreditStatusRequest) SetOrderNo(v string) *QueryDubbridgeCreditStatusRequest {
	s.OrderNo = &v
	return s
}

func (s *QueryDubbridgeCreditStatusRequest) SetOpenId(v string) *QueryDubbridgeCreditStatusRequest {
	s.OpenId = &v
	return s
}

type QueryDubbridgeCreditStatusResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 授信状态（0-通过/1-不通过2-处理中）
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 拒绝原因
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
	// 授信额度
	CreditAmt *int64 `json:"credit_amt,omitempty" xml:"credit_amt,omitempty"`
	// 期数
	Period *int64 `json:"period,omitempty" xml:"period,omitempty"`
	// 还款方式
	RepayType *string `json:"repay_type,omitempty" xml:"repay_type,omitempty"`
	// 额度信息
	CreditInfo *CreditAmount `json:"credit_info,omitempty" xml:"credit_info,omitempty"`
	// 客户编号(该客户的唯一标识，后续接口需要用到)
	CustomNo *string `json:"custom_no,omitempty" xml:"custom_no,omitempty"`
	// 授信申请编号
	ApplyNo *string `json:"apply_no,omitempty" xml:"apply_no,omitempty"`
}

func (s QueryDubbridgeCreditStatusResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDubbridgeCreditStatusResponse) GoString() string {
	return s.String()
}

func (s *QueryDubbridgeCreditStatusResponse) SetReqMsgId(v string) *QueryDubbridgeCreditStatusResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDubbridgeCreditStatusResponse) SetResultCode(v string) *QueryDubbridgeCreditStatusResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDubbridgeCreditStatusResponse) SetResultMsg(v string) *QueryDubbridgeCreditStatusResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDubbridgeCreditStatusResponse) SetStatus(v string) *QueryDubbridgeCreditStatusResponse {
	s.Status = &v
	return s
}

func (s *QueryDubbridgeCreditStatusResponse) SetMsg(v string) *QueryDubbridgeCreditStatusResponse {
	s.Msg = &v
	return s
}

func (s *QueryDubbridgeCreditStatusResponse) SetCreditAmt(v int64) *QueryDubbridgeCreditStatusResponse {
	s.CreditAmt = &v
	return s
}

func (s *QueryDubbridgeCreditStatusResponse) SetPeriod(v int64) *QueryDubbridgeCreditStatusResponse {
	s.Period = &v
	return s
}

func (s *QueryDubbridgeCreditStatusResponse) SetRepayType(v string) *QueryDubbridgeCreditStatusResponse {
	s.RepayType = &v
	return s
}

func (s *QueryDubbridgeCreditStatusResponse) SetCreditInfo(v *CreditAmount) *QueryDubbridgeCreditStatusResponse {
	s.CreditInfo = v
	return s
}

func (s *QueryDubbridgeCreditStatusResponse) SetCustomNo(v string) *QueryDubbridgeCreditStatusResponse {
	s.CustomNo = &v
	return s
}

func (s *QueryDubbridgeCreditStatusResponse) SetApplyNo(v string) *QueryDubbridgeCreditStatusResponse {
	s.ApplyNo = &v
	return s
}

type QueryDubbridgeRiskinfoEnterprisescoreRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 统一信用代码
	SocialCreditCode *string `json:"social_credit_code,omitempty" xml:"social_credit_code,omitempty" require:"true"`
	// 手机号
	Mobile *string `json:"mobile,omitempty" xml:"mobile,omitempty"`
	// 客户号
	CustomerNo *string `json:"customer_no,omitempty" xml:"customer_no,omitempty" require:"true"`
	// 渠道号
	ChannelCode *string `json:"channel_code,omitempty" xml:"channel_code,omitempty" require:"true"`
}

func (s QueryDubbridgeRiskinfoEnterprisescoreRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDubbridgeRiskinfoEnterprisescoreRequest) GoString() string {
	return s.String()
}

func (s *QueryDubbridgeRiskinfoEnterprisescoreRequest) SetAuthToken(v string) *QueryDubbridgeRiskinfoEnterprisescoreRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDubbridgeRiskinfoEnterprisescoreRequest) SetProductInstanceId(v string) *QueryDubbridgeRiskinfoEnterprisescoreRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryDubbridgeRiskinfoEnterprisescoreRequest) SetSocialCreditCode(v string) *QueryDubbridgeRiskinfoEnterprisescoreRequest {
	s.SocialCreditCode = &v
	return s
}

func (s *QueryDubbridgeRiskinfoEnterprisescoreRequest) SetMobile(v string) *QueryDubbridgeRiskinfoEnterprisescoreRequest {
	s.Mobile = &v
	return s
}

func (s *QueryDubbridgeRiskinfoEnterprisescoreRequest) SetCustomerNo(v string) *QueryDubbridgeRiskinfoEnterprisescoreRequest {
	s.CustomerNo = &v
	return s
}

func (s *QueryDubbridgeRiskinfoEnterprisescoreRequest) SetChannelCode(v string) *QueryDubbridgeRiskinfoEnterprisescoreRequest {
	s.ChannelCode = &v
	return s
}

type QueryDubbridgeRiskinfoEnterprisescoreResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 小微分
	Score *string `json:"score,omitempty" xml:"score,omitempty"`
}

func (s QueryDubbridgeRiskinfoEnterprisescoreResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDubbridgeRiskinfoEnterprisescoreResponse) GoString() string {
	return s.String()
}

func (s *QueryDubbridgeRiskinfoEnterprisescoreResponse) SetReqMsgId(v string) *QueryDubbridgeRiskinfoEnterprisescoreResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDubbridgeRiskinfoEnterprisescoreResponse) SetResultCode(v string) *QueryDubbridgeRiskinfoEnterprisescoreResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDubbridgeRiskinfoEnterprisescoreResponse) SetResultMsg(v string) *QueryDubbridgeRiskinfoEnterprisescoreResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDubbridgeRiskinfoEnterprisescoreResponse) SetScore(v string) *QueryDubbridgeRiskinfoEnterprisescoreResponse {
	s.Score = &v
	return s
}

type QueryDubbridgeRiskinfoCommonRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 查询id
	QueryId *string `json:"query_id,omitempty" xml:"query_id,omitempty" require:"true"`
	// 查询id类型
	IdType *string `json:"id_type,omitempty" xml:"id_type,omitempty" require:"true"`
	// 用户id
	OpenId *string `json:"open_id,omitempty" xml:"open_id,omitempty" require:"true"`
}

func (s QueryDubbridgeRiskinfoCommonRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDubbridgeRiskinfoCommonRequest) GoString() string {
	return s.String()
}

func (s *QueryDubbridgeRiskinfoCommonRequest) SetAuthToken(v string) *QueryDubbridgeRiskinfoCommonRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDubbridgeRiskinfoCommonRequest) SetProductInstanceId(v string) *QueryDubbridgeRiskinfoCommonRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryDubbridgeRiskinfoCommonRequest) SetQueryId(v string) *QueryDubbridgeRiskinfoCommonRequest {
	s.QueryId = &v
	return s
}

func (s *QueryDubbridgeRiskinfoCommonRequest) SetIdType(v string) *QueryDubbridgeRiskinfoCommonRequest {
	s.IdType = &v
	return s
}

func (s *QueryDubbridgeRiskinfoCommonRequest) SetOpenId(v string) *QueryDubbridgeRiskinfoCommonRequest {
	s.OpenId = &v
	return s
}

type QueryDubbridgeRiskinfoCommonResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 风控信息Json字符串
	QueryResult *string `json:"query_result,omitempty" xml:"query_result,omitempty"`
}

func (s QueryDubbridgeRiskinfoCommonResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDubbridgeRiskinfoCommonResponse) GoString() string {
	return s.String()
}

func (s *QueryDubbridgeRiskinfoCommonResponse) SetReqMsgId(v string) *QueryDubbridgeRiskinfoCommonResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDubbridgeRiskinfoCommonResponse) SetResultCode(v string) *QueryDubbridgeRiskinfoCommonResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDubbridgeRiskinfoCommonResponse) SetResultMsg(v string) *QueryDubbridgeRiskinfoCommonResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDubbridgeRiskinfoCommonResponse) SetQueryResult(v string) *QueryDubbridgeRiskinfoCommonResponse {
	s.QueryResult = &v
	return s
}

type UpdateDubbridgeInstitutionCreditRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 机构请求流水号，用于幂等。行方需确保唯一性
	SerialNo *string `json:"serial_no,omitempty" xml:"serial_no,omitempty" require:"true"`
	// 授信编号，授信申请时同申请单号一致，调额等操作同前授信申请时的授信编号一致
	CreditNo *string `json:"credit_no,omitempty" xml:"credit_no,omitempty" require:"true"`
	// 客户姓名
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 身份证号
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty" require:"true"`
	// ADJUST_AMT_APPLY|ADJUST_RATE_APPLY|CLEAR_UP_APPLY|FROZEN_APPLY|UN_FROZEN_APPLY
	ApplyType *string `json:"apply_type,omitempty" xml:"apply_type,omitempty" require:"true"`
	// 基础固额-申请调整值，单位分，机构发起调额场景下有值
	CreditAmount *string `json:"credit_amount,omitempty" xml:"credit_amount,omitempty"`
	// 年利率-申请调整值，机构发起调价场景下有值
	CreditRate *string `json:"credit_rate,omitempty" xml:"credit_rate,omitempty"`
	// 申请来源
	Source *string `json:"source,omitempty" xml:"source,omitempty" require:"true"`
	// 机构申请原因码
	ReasonCode *string `json:"reason_code,omitempty" xml:"reason_code,omitempty" require:"true"`
	// 机构发起原因描述
	ReasonMsg *string `json:"reason_msg,omitempty" xml:"reason_msg,omitempty" require:"true"`
	// 透传授信阶段天枢字段，json格式
	ExtInfoTs *string `json:"ext_info_ts,omitempty" xml:"ext_info_ts,omitempty" require:"true"`
	// 扩展信息，json格式
	ExtInfo *string `json:"ext_info,omitempty" xml:"ext_info,omitempty" require:"true"`
}

func (s UpdateDubbridgeInstitutionCreditRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateDubbridgeInstitutionCreditRequest) GoString() string {
	return s.String()
}

func (s *UpdateDubbridgeInstitutionCreditRequest) SetAuthToken(v string) *UpdateDubbridgeInstitutionCreditRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateDubbridgeInstitutionCreditRequest) SetProductInstanceId(v string) *UpdateDubbridgeInstitutionCreditRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateDubbridgeInstitutionCreditRequest) SetSerialNo(v string) *UpdateDubbridgeInstitutionCreditRequest {
	s.SerialNo = &v
	return s
}

func (s *UpdateDubbridgeInstitutionCreditRequest) SetCreditNo(v string) *UpdateDubbridgeInstitutionCreditRequest {
	s.CreditNo = &v
	return s
}

func (s *UpdateDubbridgeInstitutionCreditRequest) SetName(v string) *UpdateDubbridgeInstitutionCreditRequest {
	s.Name = &v
	return s
}

func (s *UpdateDubbridgeInstitutionCreditRequest) SetCertNo(v string) *UpdateDubbridgeInstitutionCreditRequest {
	s.CertNo = &v
	return s
}

func (s *UpdateDubbridgeInstitutionCreditRequest) SetApplyType(v string) *UpdateDubbridgeInstitutionCreditRequest {
	s.ApplyType = &v
	return s
}

func (s *UpdateDubbridgeInstitutionCreditRequest) SetCreditAmount(v string) *UpdateDubbridgeInstitutionCreditRequest {
	s.CreditAmount = &v
	return s
}

func (s *UpdateDubbridgeInstitutionCreditRequest) SetCreditRate(v string) *UpdateDubbridgeInstitutionCreditRequest {
	s.CreditRate = &v
	return s
}

func (s *UpdateDubbridgeInstitutionCreditRequest) SetSource(v string) *UpdateDubbridgeInstitutionCreditRequest {
	s.Source = &v
	return s
}

func (s *UpdateDubbridgeInstitutionCreditRequest) SetReasonCode(v string) *UpdateDubbridgeInstitutionCreditRequest {
	s.ReasonCode = &v
	return s
}

func (s *UpdateDubbridgeInstitutionCreditRequest) SetReasonMsg(v string) *UpdateDubbridgeInstitutionCreditRequest {
	s.ReasonMsg = &v
	return s
}

func (s *UpdateDubbridgeInstitutionCreditRequest) SetExtInfoTs(v string) *UpdateDubbridgeInstitutionCreditRequest {
	s.ExtInfoTs = &v
	return s
}

func (s *UpdateDubbridgeInstitutionCreditRequest) SetExtInfo(v string) *UpdateDubbridgeInstitutionCreditRequest {
	s.ExtInfo = &v
	return s
}

type UpdateDubbridgeInstitutionCreditResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 蚂蚁端返回申请单号
	ApplyNo *string `json:"apply_no,omitempty" xml:"apply_no,omitempty"`
	// 机构请求流水号，用于幂等
	SerialNo *string `json:"serial_no,omitempty" xml:"serial_no,omitempty"`
	// 业务响应码
	BizCode *string `json:"biz_code,omitempty" xml:"biz_code,omitempty"`
	// 业务消息
	BizMsg *string `json:"biz_msg,omitempty" xml:"biz_msg,omitempty"`
}

func (s UpdateDubbridgeInstitutionCreditResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateDubbridgeInstitutionCreditResponse) GoString() string {
	return s.String()
}

func (s *UpdateDubbridgeInstitutionCreditResponse) SetReqMsgId(v string) *UpdateDubbridgeInstitutionCreditResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateDubbridgeInstitutionCreditResponse) SetResultCode(v string) *UpdateDubbridgeInstitutionCreditResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateDubbridgeInstitutionCreditResponse) SetResultMsg(v string) *UpdateDubbridgeInstitutionCreditResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateDubbridgeInstitutionCreditResponse) SetApplyNo(v string) *UpdateDubbridgeInstitutionCreditResponse {
	s.ApplyNo = &v
	return s
}

func (s *UpdateDubbridgeInstitutionCreditResponse) SetSerialNo(v string) *UpdateDubbridgeInstitutionCreditResponse {
	s.SerialNo = &v
	return s
}

func (s *UpdateDubbridgeInstitutionCreditResponse) SetBizCode(v string) *UpdateDubbridgeInstitutionCreditResponse {
	s.BizCode = &v
	return s
}

func (s *UpdateDubbridgeInstitutionCreditResponse) SetBizMsg(v string) *UpdateDubbridgeInstitutionCreditResponse {
	s.BizMsg = &v
	return s
}

type QueryDubbridgeRiskinfoBusinessinfoRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 渠道号
	ChannelCode *string `json:"channel_code,omitempty" xml:"channel_code,omitempty" require:"true"`
	// 客户号
	CustomerNo *string `json:"customer_no,omitempty" xml:"customer_no,omitempty" require:"true"`
	// 统一社会信用代码
	SocialCreditCode *string `json:"social_credit_code,omitempty" xml:"social_credit_code,omitempty"`
}

func (s QueryDubbridgeRiskinfoBusinessinfoRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDubbridgeRiskinfoBusinessinfoRequest) GoString() string {
	return s.String()
}

func (s *QueryDubbridgeRiskinfoBusinessinfoRequest) SetAuthToken(v string) *QueryDubbridgeRiskinfoBusinessinfoRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDubbridgeRiskinfoBusinessinfoRequest) SetProductInstanceId(v string) *QueryDubbridgeRiskinfoBusinessinfoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryDubbridgeRiskinfoBusinessinfoRequest) SetChannelCode(v string) *QueryDubbridgeRiskinfoBusinessinfoRequest {
	s.ChannelCode = &v
	return s
}

func (s *QueryDubbridgeRiskinfoBusinessinfoRequest) SetCustomerNo(v string) *QueryDubbridgeRiskinfoBusinessinfoRequest {
	s.CustomerNo = &v
	return s
}

func (s *QueryDubbridgeRiskinfoBusinessinfoRequest) SetSocialCreditCode(v string) *QueryDubbridgeRiskinfoBusinessinfoRequest {
	s.SocialCreditCode = &v
	return s
}

type QueryDubbridgeRiskinfoBusinessinfoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 企业经营信息
	Info *string `json:"info,omitempty" xml:"info,omitempty"`
}

func (s QueryDubbridgeRiskinfoBusinessinfoResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDubbridgeRiskinfoBusinessinfoResponse) GoString() string {
	return s.String()
}

func (s *QueryDubbridgeRiskinfoBusinessinfoResponse) SetReqMsgId(v string) *QueryDubbridgeRiskinfoBusinessinfoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDubbridgeRiskinfoBusinessinfoResponse) SetResultCode(v string) *QueryDubbridgeRiskinfoBusinessinfoResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDubbridgeRiskinfoBusinessinfoResponse) SetResultMsg(v string) *QueryDubbridgeRiskinfoBusinessinfoResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDubbridgeRiskinfoBusinessinfoResponse) SetInfo(v string) *QueryDubbridgeRiskinfoBusinessinfoResponse {
	s.Info = &v
	return s
}

type ApplyDubbridgeCustomerAgreementsignRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单号
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty" require:"true"`
	// 客户编号
	CustomNo *string `json:"custom_no,omitempty" xml:"custom_no,omitempty" require:"true"`
	// 张三
	CustomName *string `json:"custom_name,omitempty" xml:"custom_name,omitempty" require:"true"`
	// 110101xxxxxxxx
	CardNo *string `json:"card_no,omitempty" xml:"card_no,omitempty" require:"true"`
	// 证件类型
	IdType *string `json:"id_type,omitempty" xml:"id_type,omitempty"`
}

func (s ApplyDubbridgeCustomerAgreementsignRequest) String() string {
	return tea.Prettify(s)
}

func (s ApplyDubbridgeCustomerAgreementsignRequest) GoString() string {
	return s.String()
}

func (s *ApplyDubbridgeCustomerAgreementsignRequest) SetAuthToken(v string) *ApplyDubbridgeCustomerAgreementsignRequest {
	s.AuthToken = &v
	return s
}

func (s *ApplyDubbridgeCustomerAgreementsignRequest) SetProductInstanceId(v string) *ApplyDubbridgeCustomerAgreementsignRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ApplyDubbridgeCustomerAgreementsignRequest) SetOrderNo(v string) *ApplyDubbridgeCustomerAgreementsignRequest {
	s.OrderNo = &v
	return s
}

func (s *ApplyDubbridgeCustomerAgreementsignRequest) SetCustomNo(v string) *ApplyDubbridgeCustomerAgreementsignRequest {
	s.CustomNo = &v
	return s
}

func (s *ApplyDubbridgeCustomerAgreementsignRequest) SetCustomName(v string) *ApplyDubbridgeCustomerAgreementsignRequest {
	s.CustomName = &v
	return s
}

func (s *ApplyDubbridgeCustomerAgreementsignRequest) SetCardNo(v string) *ApplyDubbridgeCustomerAgreementsignRequest {
	s.CardNo = &v
	return s
}

func (s *ApplyDubbridgeCustomerAgreementsignRequest) SetIdType(v string) *ApplyDubbridgeCustomerAgreementsignRequest {
	s.IdType = &v
	return s
}

type ApplyDubbridgeCustomerAgreementsignResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// sdkParams返回给商户app客户端，作为客户端唤起sdk的入参
	SdkParams *string `json:"sdk_params,omitempty" xml:"sdk_params,omitempty"`
	// 客户编号
	CustomNo *string `json:"custom_no,omitempty" xml:"custom_no,omitempty"`
}

func (s ApplyDubbridgeCustomerAgreementsignResponse) String() string {
	return tea.Prettify(s)
}

func (s ApplyDubbridgeCustomerAgreementsignResponse) GoString() string {
	return s.String()
}

func (s *ApplyDubbridgeCustomerAgreementsignResponse) SetReqMsgId(v string) *ApplyDubbridgeCustomerAgreementsignResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ApplyDubbridgeCustomerAgreementsignResponse) SetResultCode(v string) *ApplyDubbridgeCustomerAgreementsignResponse {
	s.ResultCode = &v
	return s
}

func (s *ApplyDubbridgeCustomerAgreementsignResponse) SetResultMsg(v string) *ApplyDubbridgeCustomerAgreementsignResponse {
	s.ResultMsg = &v
	return s
}

func (s *ApplyDubbridgeCustomerAgreementsignResponse) SetSdkParams(v string) *ApplyDubbridgeCustomerAgreementsignResponse {
	s.SdkParams = &v
	return s
}

func (s *ApplyDubbridgeCustomerAgreementsignResponse) SetCustomNo(v string) *ApplyDubbridgeCustomerAgreementsignResponse {
	s.CustomNo = &v
	return s
}

type QueryDubbridgeAccountStatusRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 客户编号（资产方用户唯一标记二选一）
	CustomNo *string `json:"custom_no,omitempty" xml:"custom_no,omitempty"`
	// 资产方用户唯一标识（资产方用户唯一标记二选一）
	OpenId *string `json:"open_id,omitempty" xml:"open_id,omitempty"`
}

func (s QueryDubbridgeAccountStatusRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDubbridgeAccountStatusRequest) GoString() string {
	return s.String()
}

func (s *QueryDubbridgeAccountStatusRequest) SetAuthToken(v string) *QueryDubbridgeAccountStatusRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDubbridgeAccountStatusRequest) SetProductInstanceId(v string) *QueryDubbridgeAccountStatusRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryDubbridgeAccountStatusRequest) SetCustomNo(v string) *QueryDubbridgeAccountStatusRequest {
	s.CustomNo = &v
	return s
}

func (s *QueryDubbridgeAccountStatusRequest) SetOpenId(v string) *QueryDubbridgeAccountStatusRequest {
	s.OpenId = &v
	return s
}

type QueryDubbridgeAccountStatusResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 授信申请状态
	Data *CustomStatus `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QueryDubbridgeAccountStatusResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDubbridgeAccountStatusResponse) GoString() string {
	return s.String()
}

func (s *QueryDubbridgeAccountStatusResponse) SetReqMsgId(v string) *QueryDubbridgeAccountStatusResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDubbridgeAccountStatusResponse) SetResultCode(v string) *QueryDubbridgeAccountStatusResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDubbridgeAccountStatusResponse) SetResultMsg(v string) *QueryDubbridgeAccountStatusResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDubbridgeAccountStatusResponse) SetData(v *CustomStatus) *QueryDubbridgeAccountStatusResponse {
	s.Data = v
	return s
}

type QueryDubbridgeAccountCustomRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 渠道号
	ChannelCode *string `json:"channel_code,omitempty" xml:"channel_code,omitempty"`
	// 客户编码
	CustomNo *string `json:"custom_no,omitempty" xml:"custom_no,omitempty"`
	// open_id
	OpenId *string `json:"open_id,omitempty" xml:"open_id,omitempty"`
}

func (s QueryDubbridgeAccountCustomRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDubbridgeAccountCustomRequest) GoString() string {
	return s.String()
}

func (s *QueryDubbridgeAccountCustomRequest) SetAuthToken(v string) *QueryDubbridgeAccountCustomRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDubbridgeAccountCustomRequest) SetProductInstanceId(v string) *QueryDubbridgeAccountCustomRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryDubbridgeAccountCustomRequest) SetChannelCode(v string) *QueryDubbridgeAccountCustomRequest {
	s.ChannelCode = &v
	return s
}

func (s *QueryDubbridgeAccountCustomRequest) SetCustomNo(v string) *QueryDubbridgeAccountCustomRequest {
	s.CustomNo = &v
	return s
}

func (s *QueryDubbridgeAccountCustomRequest) SetOpenId(v string) *QueryDubbridgeAccountCustomRequest {
	s.OpenId = &v
	return s
}

type QueryDubbridgeAccountCustomResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否进行过授信申请
	Data *CustomRelationStatus `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QueryDubbridgeAccountCustomResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDubbridgeAccountCustomResponse) GoString() string {
	return s.String()
}

func (s *QueryDubbridgeAccountCustomResponse) SetReqMsgId(v string) *QueryDubbridgeAccountCustomResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDubbridgeAccountCustomResponse) SetResultCode(v string) *QueryDubbridgeAccountCustomResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDubbridgeAccountCustomResponse) SetResultMsg(v string) *QueryDubbridgeAccountCustomResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDubbridgeAccountCustomResponse) SetData(v *CustomRelationStatus) *QueryDubbridgeAccountCustomResponse {
	s.Data = v
	return s
}

type UpdateDubbridgeAccountCustomRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 渠道编码
	ChannelCode *string `json:"channel_code,omitempty" xml:"channel_code,omitempty" require:"true"`
	// 新渠道id
	NewOpenId *string `json:"new_open_id,omitempty" xml:"new_open_id,omitempty" require:"true"`
	// 原渠道id
	SourceOpenId *string `json:"source_open_id,omitempty" xml:"source_open_id,omitempty" require:"true"`
	// 客户号
	CustomerNo *string `json:"customer_no,omitempty" xml:"customer_no,omitempty" require:"true"`
}

func (s UpdateDubbridgeAccountCustomRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateDubbridgeAccountCustomRequest) GoString() string {
	return s.String()
}

func (s *UpdateDubbridgeAccountCustomRequest) SetAuthToken(v string) *UpdateDubbridgeAccountCustomRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateDubbridgeAccountCustomRequest) SetProductInstanceId(v string) *UpdateDubbridgeAccountCustomRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateDubbridgeAccountCustomRequest) SetChannelCode(v string) *UpdateDubbridgeAccountCustomRequest {
	s.ChannelCode = &v
	return s
}

func (s *UpdateDubbridgeAccountCustomRequest) SetNewOpenId(v string) *UpdateDubbridgeAccountCustomRequest {
	s.NewOpenId = &v
	return s
}

func (s *UpdateDubbridgeAccountCustomRequest) SetSourceOpenId(v string) *UpdateDubbridgeAccountCustomRequest {
	s.SourceOpenId = &v
	return s
}

func (s *UpdateDubbridgeAccountCustomRequest) SetCustomerNo(v string) *UpdateDubbridgeAccountCustomRequest {
	s.CustomerNo = &v
	return s
}

type UpdateDubbridgeAccountCustomResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 更新渠道返回体
	Data *UpdateCustomerRelationResponseData `json:"data,omitempty" xml:"data,omitempty"`
}

func (s UpdateDubbridgeAccountCustomResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateDubbridgeAccountCustomResponse) GoString() string {
	return s.String()
}

func (s *UpdateDubbridgeAccountCustomResponse) SetReqMsgId(v string) *UpdateDubbridgeAccountCustomResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateDubbridgeAccountCustomResponse) SetResultCode(v string) *UpdateDubbridgeAccountCustomResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateDubbridgeAccountCustomResponse) SetResultMsg(v string) *UpdateDubbridgeAccountCustomResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateDubbridgeAccountCustomResponse) SetData(v *UpdateCustomerRelationResponseData) *UpdateDubbridgeAccountCustomResponse {
	s.Data = v
	return s
}

type QueryDubbridgeCustomerAgreementsignRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 客户编码
	CustomNo *string `json:"custom_no,omitempty" xml:"custom_no,omitempty" require:"true"`
	// 订单号
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty"`
	// 资金方编号
	FundCode *string `json:"fund_code,omitempty" xml:"fund_code,omitempty" require:"true"`
}

func (s QueryDubbridgeCustomerAgreementsignRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDubbridgeCustomerAgreementsignRequest) GoString() string {
	return s.String()
}

func (s *QueryDubbridgeCustomerAgreementsignRequest) SetAuthToken(v string) *QueryDubbridgeCustomerAgreementsignRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDubbridgeCustomerAgreementsignRequest) SetProductInstanceId(v string) *QueryDubbridgeCustomerAgreementsignRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryDubbridgeCustomerAgreementsignRequest) SetCustomNo(v string) *QueryDubbridgeCustomerAgreementsignRequest {
	s.CustomNo = &v
	return s
}

func (s *QueryDubbridgeCustomerAgreementsignRequest) SetOrderNo(v string) *QueryDubbridgeCustomerAgreementsignRequest {
	s.OrderNo = &v
	return s
}

func (s *QueryDubbridgeCustomerAgreementsignRequest) SetFundCode(v string) *QueryDubbridgeCustomerAgreementsignRequest {
	s.FundCode = &v
	return s
}

type QueryDubbridgeCustomerAgreementsignResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 客户编号
	CustomNo *string `json:"custom_no,omitempty" xml:"custom_no,omitempty"`
	// 流水号(代扣协议中标示用户的唯一签约号)
	TransSerials *string `json:"trans_serials,omitempty" xml:"trans_serials,omitempty"`
	// 协议签约状态(0-成功1-失败2-处理中)
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 协议签约时间(支付宝代扣协议的实际签约时间，格式为yyyy-MM-dd HH:mm:ss)
	SignTime *string `json:"sign_time,omitempty" xml:"sign_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 协议生效时间(用户代扣协议的实际生效时间，格式为yyyy-MM-dd HH:mm:ss)
	ValidTime *string `json:"valid_time,omitempty" xml:"valid_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 协议失效时间(用户代扣协议的失效时间，格式为yyyy-MM-dd HH:mm:ss)
	InvalidTime *string `json:"invalid_time,omitempty" xml:"invalid_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
}

func (s QueryDubbridgeCustomerAgreementsignResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDubbridgeCustomerAgreementsignResponse) GoString() string {
	return s.String()
}

func (s *QueryDubbridgeCustomerAgreementsignResponse) SetReqMsgId(v string) *QueryDubbridgeCustomerAgreementsignResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDubbridgeCustomerAgreementsignResponse) SetResultCode(v string) *QueryDubbridgeCustomerAgreementsignResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDubbridgeCustomerAgreementsignResponse) SetResultMsg(v string) *QueryDubbridgeCustomerAgreementsignResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDubbridgeCustomerAgreementsignResponse) SetCustomNo(v string) *QueryDubbridgeCustomerAgreementsignResponse {
	s.CustomNo = &v
	return s
}

func (s *QueryDubbridgeCustomerAgreementsignResponse) SetTransSerials(v string) *QueryDubbridgeCustomerAgreementsignResponse {
	s.TransSerials = &v
	return s
}

func (s *QueryDubbridgeCustomerAgreementsignResponse) SetStatus(v string) *QueryDubbridgeCustomerAgreementsignResponse {
	s.Status = &v
	return s
}

func (s *QueryDubbridgeCustomerAgreementsignResponse) SetSignTime(v string) *QueryDubbridgeCustomerAgreementsignResponse {
	s.SignTime = &v
	return s
}

func (s *QueryDubbridgeCustomerAgreementsignResponse) SetValidTime(v string) *QueryDubbridgeCustomerAgreementsignResponse {
	s.ValidTime = &v
	return s
}

func (s *QueryDubbridgeCustomerAgreementsignResponse) SetInvalidTime(v string) *QueryDubbridgeCustomerAgreementsignResponse {
	s.InvalidTime = &v
	return s
}

type UpdateDubbridgeCustomerInfoRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 客户姓名(可修改字段)
	CustomName *string `json:"custom_name,omitempty" xml:"custom_name,omitempty"`
	// 户籍所在地(可修改字段)
	CensusRegister *string `json:"census_register,omitempty" xml:"census_register,omitempty"`
	// 证件号码(可修改字段)
	CardNo *string `json:"card_no,omitempty" xml:"card_no,omitempty"`
	// 手机号码(可修改字段)
	Mobile *string `json:"mobile,omitempty" xml:"mobile,omitempty"`
	// 客户编号(唯一不变)
	CustomNo *string `json:"custom_no,omitempty" xml:"custom_no,omitempty" require:"true"`
	// 订单号
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty"`
	// 身份证有效期
	IdValidDate *string `json:"id_valid_date,omitempty" xml:"id_valid_date,omitempty"`
}

func (s UpdateDubbridgeCustomerInfoRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateDubbridgeCustomerInfoRequest) GoString() string {
	return s.String()
}

func (s *UpdateDubbridgeCustomerInfoRequest) SetAuthToken(v string) *UpdateDubbridgeCustomerInfoRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateDubbridgeCustomerInfoRequest) SetProductInstanceId(v string) *UpdateDubbridgeCustomerInfoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UpdateDubbridgeCustomerInfoRequest) SetCustomName(v string) *UpdateDubbridgeCustomerInfoRequest {
	s.CustomName = &v
	return s
}

func (s *UpdateDubbridgeCustomerInfoRequest) SetCensusRegister(v string) *UpdateDubbridgeCustomerInfoRequest {
	s.CensusRegister = &v
	return s
}

func (s *UpdateDubbridgeCustomerInfoRequest) SetCardNo(v string) *UpdateDubbridgeCustomerInfoRequest {
	s.CardNo = &v
	return s
}

func (s *UpdateDubbridgeCustomerInfoRequest) SetMobile(v string) *UpdateDubbridgeCustomerInfoRequest {
	s.Mobile = &v
	return s
}

func (s *UpdateDubbridgeCustomerInfoRequest) SetCustomNo(v string) *UpdateDubbridgeCustomerInfoRequest {
	s.CustomNo = &v
	return s
}

func (s *UpdateDubbridgeCustomerInfoRequest) SetOrderNo(v string) *UpdateDubbridgeCustomerInfoRequest {
	s.OrderNo = &v
	return s
}

func (s *UpdateDubbridgeCustomerInfoRequest) SetIdValidDate(v string) *UpdateDubbridgeCustomerInfoRequest {
	s.IdValidDate = &v
	return s
}

type UpdateDubbridgeCustomerInfoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s UpdateDubbridgeCustomerInfoResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateDubbridgeCustomerInfoResponse) GoString() string {
	return s.String()
}

func (s *UpdateDubbridgeCustomerInfoResponse) SetReqMsgId(v string) *UpdateDubbridgeCustomerInfoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateDubbridgeCustomerInfoResponse) SetResultCode(v string) *UpdateDubbridgeCustomerInfoResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateDubbridgeCustomerInfoResponse) SetResultMsg(v string) *UpdateDubbridgeCustomerInfoResponse {
	s.ResultMsg = &v
	return s
}

type QueryDubbridgeReceiptOverdueRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 合同编码
	ContractNo *string `json:"contract_no,omitempty" xml:"contract_no,omitempty" require:"true"`
	// 渠道编码
	ChannelCode *string `json:"channel_code,omitempty" xml:"channel_code,omitempty" require:"true"`
}

func (s QueryDubbridgeReceiptOverdueRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDubbridgeReceiptOverdueRequest) GoString() string {
	return s.String()
}

func (s *QueryDubbridgeReceiptOverdueRequest) SetAuthToken(v string) *QueryDubbridgeReceiptOverdueRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDubbridgeReceiptOverdueRequest) SetProductInstanceId(v string) *QueryDubbridgeReceiptOverdueRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryDubbridgeReceiptOverdueRequest) SetContractNo(v string) *QueryDubbridgeReceiptOverdueRequest {
	s.ContractNo = &v
	return s
}

func (s *QueryDubbridgeReceiptOverdueRequest) SetChannelCode(v string) *QueryDubbridgeReceiptOverdueRequest {
	s.ChannelCode = &v
	return s
}

type QueryDubbridgeReceiptOverdueResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 逾期信息响应
	Data *OverdueInfoResponse `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QueryDubbridgeReceiptOverdueResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDubbridgeReceiptOverdueResponse) GoString() string {
	return s.String()
}

func (s *QueryDubbridgeReceiptOverdueResponse) SetReqMsgId(v string) *QueryDubbridgeReceiptOverdueResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDubbridgeReceiptOverdueResponse) SetResultCode(v string) *QueryDubbridgeReceiptOverdueResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDubbridgeReceiptOverdueResponse) SetResultMsg(v string) *QueryDubbridgeReceiptOverdueResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDubbridgeReceiptOverdueResponse) SetData(v *OverdueInfoResponse) *QueryDubbridgeReceiptOverdueResponse {
	s.Data = v
	return s
}

type RepayDubbridgeRepayCheckstandRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 用信申请订单号
	OriginalOrderNo *string `json:"original_order_no,omitempty" xml:"original_order_no,omitempty" require:"true"`
	// 还款类型1:当期结清，2：正常还款3：全部结清
	RepayType *string `json:"repay_type,omitempty" xml:"repay_type,omitempty" require:"true"`
	// 订单号
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty"`
}

func (s RepayDubbridgeRepayCheckstandRequest) String() string {
	return tea.Prettify(s)
}

func (s RepayDubbridgeRepayCheckstandRequest) GoString() string {
	return s.String()
}

func (s *RepayDubbridgeRepayCheckstandRequest) SetAuthToken(v string) *RepayDubbridgeRepayCheckstandRequest {
	s.AuthToken = &v
	return s
}

func (s *RepayDubbridgeRepayCheckstandRequest) SetProductInstanceId(v string) *RepayDubbridgeRepayCheckstandRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *RepayDubbridgeRepayCheckstandRequest) SetOriginalOrderNo(v string) *RepayDubbridgeRepayCheckstandRequest {
	s.OriginalOrderNo = &v
	return s
}

func (s *RepayDubbridgeRepayCheckstandRequest) SetRepayType(v string) *RepayDubbridgeRepayCheckstandRequest {
	s.RepayType = &v
	return s
}

func (s *RepayDubbridgeRepayCheckstandRequest) SetOrderNo(v string) *RepayDubbridgeRepayCheckstandRequest {
	s.OrderNo = &v
	return s
}

type RepayDubbridgeRepayCheckstandResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 收银台地址(成功就有值)
	CheckstandAddress *string `json:"checkstand_address,omitempty" xml:"checkstand_address,omitempty"`
}

func (s RepayDubbridgeRepayCheckstandResponse) String() string {
	return tea.Prettify(s)
}

func (s RepayDubbridgeRepayCheckstandResponse) GoString() string {
	return s.String()
}

func (s *RepayDubbridgeRepayCheckstandResponse) SetReqMsgId(v string) *RepayDubbridgeRepayCheckstandResponse {
	s.ReqMsgId = &v
	return s
}

func (s *RepayDubbridgeRepayCheckstandResponse) SetResultCode(v string) *RepayDubbridgeRepayCheckstandResponse {
	s.ResultCode = &v
	return s
}

func (s *RepayDubbridgeRepayCheckstandResponse) SetResultMsg(v string) *RepayDubbridgeRepayCheckstandResponse {
	s.ResultMsg = &v
	return s
}

func (s *RepayDubbridgeRepayCheckstandResponse) SetCheckstandAddress(v string) *RepayDubbridgeRepayCheckstandResponse {
	s.CheckstandAddress = &v
	return s
}

type QueryDubbridgeRepayInfoRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 原还款订单号
	OriginalOrderNo *string `json:"original_order_no,omitempty" xml:"original_order_no,omitempty" require:"true"`
	// 订单号
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty" require:"true"`
}

func (s QueryDubbridgeRepayInfoRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDubbridgeRepayInfoRequest) GoString() string {
	return s.String()
}

func (s *QueryDubbridgeRepayInfoRequest) SetAuthToken(v string) *QueryDubbridgeRepayInfoRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDubbridgeRepayInfoRequest) SetProductInstanceId(v string) *QueryDubbridgeRepayInfoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryDubbridgeRepayInfoRequest) SetOriginalOrderNo(v string) *QueryDubbridgeRepayInfoRequest {
	s.OriginalOrderNo = &v
	return s
}

func (s *QueryDubbridgeRepayInfoRequest) SetOrderNo(v string) *QueryDubbridgeRepayInfoRequest {
	s.OrderNo = &v
	return s
}

type QueryDubbridgeRepayInfoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 还款编号
	RepayNo *string `json:"repay_no,omitempty" xml:"repay_no,omitempty"`
	// 借据编码
	ReceiptNo *string `json:"receipt_no,omitempty" xml:"receipt_no,omitempty"`
	// 客户编号
	CustomNo *string `json:"custom_no,omitempty" xml:"custom_no,omitempty"`
	// 客户名称
	CustomName *string `json:"custom_name,omitempty" xml:"custom_name,omitempty"`
	// 还款类型1:提前还款，2：正常还款 3:批量还款 4：自由还款
	RepayType *string `json:"repay_type,omitempty" xml:"repay_type,omitempty"`
	// repay_sign
	RepaySign *string `json:"repay_sign,omitempty" xml:"repay_sign,omitempty"`
	// 还款日期
	RepayDate *string `json:"repay_date,omitempty" xml:"repay_date,omitempty"`
	// 实还总额
	RepayAmount *int64 `json:"repay_amount,omitempty" xml:"repay_amount,omitempty"`
	// 实还本金
	RepayPrincipal *int64 `json:"repay_principal,omitempty" xml:"repay_principal,omitempty"`
	// 实还利息
	RepayInterest *int64 `json:"repay_interest,omitempty" xml:"repay_interest,omitempty"`
	// 实还通道手续费
	ChannelAmt *int64 `json:"channel_amt,omitempty" xml:"channel_amt,omitempty"`
	// 实还手续费
	RepayFee *string `json:"repay_fee,omitempty" xml:"repay_fee,omitempty"`
	// 实收罚息
	RepayPunish *int64 `json:"repay_punish,omitempty" xml:"repay_punish,omitempty"`
	// 还款账户
	RepayAccount *string `json:"repay_account,omitempty" xml:"repay_account,omitempty"`
	// 还款账户名称
	RepayAccountName *string `json:"repay_account_name,omitempty" xml:"repay_account_name,omitempty"`
	// 还款账户的手机号
	RepayMobile *string `json:"repay_mobile,omitempty" xml:"repay_mobile,omitempty"`
	// 还款账户银行行号
	RepayBankNo *string `json:"repay_bank_no,omitempty" xml:"repay_bank_no,omitempty"`
	// 还款账户银行名称
	RepayBankName *string `json:"repay_bank_name,omitempty" xml:"repay_bank_name,omitempty"`
	// 还款状态0:失败 1成功 2-审批中 3-还款中
	RepayStatus *string `json:"repay_status,omitempty" xml:"repay_status,omitempty"`
	// 失败原因
	FailReason *string `json:"fail_reason,omitempty" xml:"fail_reason,omitempty"`
	// 授信申请编号
	ApplyNo *string `json:"apply_no,omitempty" xml:"apply_no,omitempty"`
}

func (s QueryDubbridgeRepayInfoResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDubbridgeRepayInfoResponse) GoString() string {
	return s.String()
}

func (s *QueryDubbridgeRepayInfoResponse) SetReqMsgId(v string) *QueryDubbridgeRepayInfoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDubbridgeRepayInfoResponse) SetResultCode(v string) *QueryDubbridgeRepayInfoResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDubbridgeRepayInfoResponse) SetResultMsg(v string) *QueryDubbridgeRepayInfoResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDubbridgeRepayInfoResponse) SetRepayNo(v string) *QueryDubbridgeRepayInfoResponse {
	s.RepayNo = &v
	return s
}

func (s *QueryDubbridgeRepayInfoResponse) SetReceiptNo(v string) *QueryDubbridgeRepayInfoResponse {
	s.ReceiptNo = &v
	return s
}

func (s *QueryDubbridgeRepayInfoResponse) SetCustomNo(v string) *QueryDubbridgeRepayInfoResponse {
	s.CustomNo = &v
	return s
}

func (s *QueryDubbridgeRepayInfoResponse) SetCustomName(v string) *QueryDubbridgeRepayInfoResponse {
	s.CustomName = &v
	return s
}

func (s *QueryDubbridgeRepayInfoResponse) SetRepayType(v string) *QueryDubbridgeRepayInfoResponse {
	s.RepayType = &v
	return s
}

func (s *QueryDubbridgeRepayInfoResponse) SetRepaySign(v string) *QueryDubbridgeRepayInfoResponse {
	s.RepaySign = &v
	return s
}

func (s *QueryDubbridgeRepayInfoResponse) SetRepayDate(v string) *QueryDubbridgeRepayInfoResponse {
	s.RepayDate = &v
	return s
}

func (s *QueryDubbridgeRepayInfoResponse) SetRepayAmount(v int64) *QueryDubbridgeRepayInfoResponse {
	s.RepayAmount = &v
	return s
}

func (s *QueryDubbridgeRepayInfoResponse) SetRepayPrincipal(v int64) *QueryDubbridgeRepayInfoResponse {
	s.RepayPrincipal = &v
	return s
}

func (s *QueryDubbridgeRepayInfoResponse) SetRepayInterest(v int64) *QueryDubbridgeRepayInfoResponse {
	s.RepayInterest = &v
	return s
}

func (s *QueryDubbridgeRepayInfoResponse) SetChannelAmt(v int64) *QueryDubbridgeRepayInfoResponse {
	s.ChannelAmt = &v
	return s
}

func (s *QueryDubbridgeRepayInfoResponse) SetRepayFee(v string) *QueryDubbridgeRepayInfoResponse {
	s.RepayFee = &v
	return s
}

func (s *QueryDubbridgeRepayInfoResponse) SetRepayPunish(v int64) *QueryDubbridgeRepayInfoResponse {
	s.RepayPunish = &v
	return s
}

func (s *QueryDubbridgeRepayInfoResponse) SetRepayAccount(v string) *QueryDubbridgeRepayInfoResponse {
	s.RepayAccount = &v
	return s
}

func (s *QueryDubbridgeRepayInfoResponse) SetRepayAccountName(v string) *QueryDubbridgeRepayInfoResponse {
	s.RepayAccountName = &v
	return s
}

func (s *QueryDubbridgeRepayInfoResponse) SetRepayMobile(v string) *QueryDubbridgeRepayInfoResponse {
	s.RepayMobile = &v
	return s
}

func (s *QueryDubbridgeRepayInfoResponse) SetRepayBankNo(v string) *QueryDubbridgeRepayInfoResponse {
	s.RepayBankNo = &v
	return s
}

func (s *QueryDubbridgeRepayInfoResponse) SetRepayBankName(v string) *QueryDubbridgeRepayInfoResponse {
	s.RepayBankName = &v
	return s
}

func (s *QueryDubbridgeRepayInfoResponse) SetRepayStatus(v string) *QueryDubbridgeRepayInfoResponse {
	s.RepayStatus = &v
	return s
}

func (s *QueryDubbridgeRepayInfoResponse) SetFailReason(v string) *QueryDubbridgeRepayInfoResponse {
	s.FailReason = &v
	return s
}

func (s *QueryDubbridgeRepayInfoResponse) SetApplyNo(v string) *QueryDubbridgeRepayInfoResponse {
	s.ApplyNo = &v
	return s
}

type QueryDubbridgeRepayListRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单号
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty" require:"true"`
	// 用信申请订单号
	OriginalOrderNo *string `json:"original_order_no,omitempty" xml:"original_order_no,omitempty" require:"true"`
}

func (s QueryDubbridgeRepayListRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDubbridgeRepayListRequest) GoString() string {
	return s.String()
}

func (s *QueryDubbridgeRepayListRequest) SetAuthToken(v string) *QueryDubbridgeRepayListRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDubbridgeRepayListRequest) SetProductInstanceId(v string) *QueryDubbridgeRepayListRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryDubbridgeRepayListRequest) SetOrderNo(v string) *QueryDubbridgeRepayListRequest {
	s.OrderNo = &v
	return s
}

func (s *QueryDubbridgeRepayListRequest) SetOriginalOrderNo(v string) *QueryDubbridgeRepayListRequest {
	s.OriginalOrderNo = &v
	return s
}

type QueryDubbridgeRepayListResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 还款计划查询结果
	RepayResultList []*RepayResult `json:"repay_result_list,omitempty" xml:"repay_result_list,omitempty" type:"Repeated"`
}

func (s QueryDubbridgeRepayListResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDubbridgeRepayListResponse) GoString() string {
	return s.String()
}

func (s *QueryDubbridgeRepayListResponse) SetReqMsgId(v string) *QueryDubbridgeRepayListResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDubbridgeRepayListResponse) SetResultCode(v string) *QueryDubbridgeRepayListResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDubbridgeRepayListResponse) SetResultMsg(v string) *QueryDubbridgeRepayListResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDubbridgeRepayListResponse) SetRepayResultList(v []*RepayResult) *QueryDubbridgeRepayListResponse {
	s.RepayResultList = v
	return s
}

type CountDubbridgeRepayReftrialRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单号
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty" require:"true"`
	// 授信申请订单号
	OriginalOrderNo *string `json:"original_order_no,omitempty" xml:"original_order_no,omitempty" require:"true"`
	// 产品编号
	ProdNo *string `json:"prod_no,omitempty" xml:"prod_no,omitempty" require:"true"`
	// 借款金额
	ApplyAmount *int64 `json:"apply_amount,omitempty" xml:"apply_amount,omitempty" require:"true"`
	// 借款期数
	ApplyPeriod *int64 `json:"apply_period,omitempty" xml:"apply_period,omitempty" require:"true"`
	// 还款方式1：等额本息，2：等额本金
	RepayType *string `json:"repay_type,omitempty" xml:"repay_type,omitempty" require:"true"`
}

func (s CountDubbridgeRepayReftrialRequest) String() string {
	return tea.Prettify(s)
}

func (s CountDubbridgeRepayReftrialRequest) GoString() string {
	return s.String()
}

func (s *CountDubbridgeRepayReftrialRequest) SetAuthToken(v string) *CountDubbridgeRepayReftrialRequest {
	s.AuthToken = &v
	return s
}

func (s *CountDubbridgeRepayReftrialRequest) SetProductInstanceId(v string) *CountDubbridgeRepayReftrialRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CountDubbridgeRepayReftrialRequest) SetOrderNo(v string) *CountDubbridgeRepayReftrialRequest {
	s.OrderNo = &v
	return s
}

func (s *CountDubbridgeRepayReftrialRequest) SetOriginalOrderNo(v string) *CountDubbridgeRepayReftrialRequest {
	s.OriginalOrderNo = &v
	return s
}

func (s *CountDubbridgeRepayReftrialRequest) SetProdNo(v string) *CountDubbridgeRepayReftrialRequest {
	s.ProdNo = &v
	return s
}

func (s *CountDubbridgeRepayReftrialRequest) SetApplyAmount(v int64) *CountDubbridgeRepayReftrialRequest {
	s.ApplyAmount = &v
	return s
}

func (s *CountDubbridgeRepayReftrialRequest) SetApplyPeriod(v int64) *CountDubbridgeRepayReftrialRequest {
	s.ApplyPeriod = &v
	return s
}

func (s *CountDubbridgeRepayReftrialRequest) SetRepayType(v string) *CountDubbridgeRepayReftrialRequest {
	s.RepayType = &v
	return s
}

type CountDubbridgeRepayReftrialResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 还款计划试算结果
	RepayTrailList []*RepayTrail `json:"repay_trail_list,omitempty" xml:"repay_trail_list,omitempty" type:"Repeated"`
}

func (s CountDubbridgeRepayReftrialResponse) String() string {
	return tea.Prettify(s)
}

func (s CountDubbridgeRepayReftrialResponse) GoString() string {
	return s.String()
}

func (s *CountDubbridgeRepayReftrialResponse) SetReqMsgId(v string) *CountDubbridgeRepayReftrialResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CountDubbridgeRepayReftrialResponse) SetResultCode(v string) *CountDubbridgeRepayReftrialResponse {
	s.ResultCode = &v
	return s
}

func (s *CountDubbridgeRepayReftrialResponse) SetResultMsg(v string) *CountDubbridgeRepayReftrialResponse {
	s.ResultMsg = &v
	return s
}

func (s *CountDubbridgeRepayReftrialResponse) SetRepayTrailList(v []*RepayTrail) *CountDubbridgeRepayReftrialResponse {
	s.RepayTrailList = v
	return s
}

type CountDubbridgeRepayTrialRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 用信申请订单号
	OriginalOrderNo *string `json:"original_order_no,omitempty" xml:"original_order_no,omitempty" require:"true"`
	// 还款类型1:当期结清，2：正常还款3：全部结清
	RepayType *string `json:"repay_type,omitempty" xml:"repay_type,omitempty" require:"true"`
	// 订单号
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty" require:"true"`
}

func (s CountDubbridgeRepayTrialRequest) String() string {
	return tea.Prettify(s)
}

func (s CountDubbridgeRepayTrialRequest) GoString() string {
	return s.String()
}

func (s *CountDubbridgeRepayTrialRequest) SetAuthToken(v string) *CountDubbridgeRepayTrialRequest {
	s.AuthToken = &v
	return s
}

func (s *CountDubbridgeRepayTrialRequest) SetProductInstanceId(v string) *CountDubbridgeRepayTrialRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CountDubbridgeRepayTrialRequest) SetOriginalOrderNo(v string) *CountDubbridgeRepayTrialRequest {
	s.OriginalOrderNo = &v
	return s
}

func (s *CountDubbridgeRepayTrialRequest) SetRepayType(v string) *CountDubbridgeRepayTrialRequest {
	s.RepayType = &v
	return s
}

func (s *CountDubbridgeRepayTrialRequest) SetOrderNo(v string) *CountDubbridgeRepayTrialRequest {
	s.OrderNo = &v
	return s
}

type CountDubbridgeRepayTrialResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 还款本金
	RealPrincipal *int64 `json:"real_principal,omitempty" xml:"real_principal,omitempty"`
	// 还款利息
	RealInterest *int64 `json:"real_interest,omitempty" xml:"real_interest,omitempty"`
	// 还款费用
	RealOverAmt *int64 `json:"real_over_amt,omitempty" xml:"real_over_amt,omitempty"`
	// 服务费
	ServiceCharge *int64 `json:"service_charge,omitempty" xml:"service_charge,omitempty"`
}

func (s CountDubbridgeRepayTrialResponse) String() string {
	return tea.Prettify(s)
}

func (s CountDubbridgeRepayTrialResponse) GoString() string {
	return s.String()
}

func (s *CountDubbridgeRepayTrialResponse) SetReqMsgId(v string) *CountDubbridgeRepayTrialResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CountDubbridgeRepayTrialResponse) SetResultCode(v string) *CountDubbridgeRepayTrialResponse {
	s.ResultCode = &v
	return s
}

func (s *CountDubbridgeRepayTrialResponse) SetResultMsg(v string) *CountDubbridgeRepayTrialResponse {
	s.ResultMsg = &v
	return s
}

func (s *CountDubbridgeRepayTrialResponse) SetRealPrincipal(v int64) *CountDubbridgeRepayTrialResponse {
	s.RealPrincipal = &v
	return s
}

func (s *CountDubbridgeRepayTrialResponse) SetRealInterest(v int64) *CountDubbridgeRepayTrialResponse {
	s.RealInterest = &v
	return s
}

func (s *CountDubbridgeRepayTrialResponse) SetRealOverAmt(v int64) *CountDubbridgeRepayTrialResponse {
	s.RealOverAmt = &v
	return s
}

func (s *CountDubbridgeRepayTrialResponse) SetServiceCharge(v int64) *CountDubbridgeRepayTrialResponse {
	s.ServiceCharge = &v
	return s
}

type RepayDubbridgeRepayWithholdRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 授信申请订单号
	OriginalOrderNo *string `json:"original_order_no,omitempty" xml:"original_order_no,omitempty" require:"true"`
	// 还款类型1:当期结清，2：正常还款3：全部结清
	RepayType *string `json:"repay_type,omitempty" xml:"repay_type,omitempty" require:"true"`
	// 订单号
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty" require:"true"`
}

func (s RepayDubbridgeRepayWithholdRequest) String() string {
	return tea.Prettify(s)
}

func (s RepayDubbridgeRepayWithholdRequest) GoString() string {
	return s.String()
}

func (s *RepayDubbridgeRepayWithholdRequest) SetAuthToken(v string) *RepayDubbridgeRepayWithholdRequest {
	s.AuthToken = &v
	return s
}

func (s *RepayDubbridgeRepayWithholdRequest) SetProductInstanceId(v string) *RepayDubbridgeRepayWithholdRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *RepayDubbridgeRepayWithholdRequest) SetOriginalOrderNo(v string) *RepayDubbridgeRepayWithholdRequest {
	s.OriginalOrderNo = &v
	return s
}

func (s *RepayDubbridgeRepayWithholdRequest) SetRepayType(v string) *RepayDubbridgeRepayWithholdRequest {
	s.RepayType = &v
	return s
}

func (s *RepayDubbridgeRepayWithholdRequest) SetOrderNo(v string) *RepayDubbridgeRepayWithholdRequest {
	s.OrderNo = &v
	return s
}

type RepayDubbridgeRepayWithholdResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s RepayDubbridgeRepayWithholdResponse) String() string {
	return tea.Prettify(s)
}

func (s RepayDubbridgeRepayWithholdResponse) GoString() string {
	return s.String()
}

func (s *RepayDubbridgeRepayWithholdResponse) SetReqMsgId(v string) *RepayDubbridgeRepayWithholdResponse {
	s.ReqMsgId = &v
	return s
}

func (s *RepayDubbridgeRepayWithholdResponse) SetResultCode(v string) *RepayDubbridgeRepayWithholdResponse {
	s.ResultCode = &v
	return s
}

func (s *RepayDubbridgeRepayWithholdResponse) SetResultMsg(v string) *RepayDubbridgeRepayWithholdResponse {
	s.ResultMsg = &v
	return s
}

type QueryDubbridgeSearchContractRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 原用信订单号
	OriginalOrderNo *string `json:"original_order_no,omitempty" xml:"original_order_no,omitempty" require:"true"`
}

func (s QueryDubbridgeSearchContractRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDubbridgeSearchContractRequest) GoString() string {
	return s.String()
}

func (s *QueryDubbridgeSearchContractRequest) SetAuthToken(v string) *QueryDubbridgeSearchContractRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDubbridgeSearchContractRequest) SetProductInstanceId(v string) *QueryDubbridgeSearchContractRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryDubbridgeSearchContractRequest) SetOriginalOrderNo(v string) *QueryDubbridgeSearchContractRequest {
	s.OriginalOrderNo = &v
	return s
}

type QueryDubbridgeSearchContractResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 关联编号（授信/用信）
	RelationNo *string `json:"relation_no,omitempty" xml:"relation_no,omitempty"`
	// 合同编号
	ContractNo *string `json:"contract_no,omitempty" xml:"contract_no,omitempty"`
	// 合同名称
	ContractName *string `json:"contract_name,omitempty" xml:"contract_name,omitempty"`
	// 合同类型：0:电子合同签署授权协议 1:借款合同 2:抵押合同 3:担保合同 4:用信合同 5:通用合同 6:征信授权书
	ContractType *string `json:"contract_type,omitempty" xml:"contract_type,omitempty"`
	// 客户编号
	CustomNo *string `json:"custom_no,omitempty" xml:"custom_no,omitempty"`
	// 下载地址
	SavePath *string `json:"save_path,omitempty" xml:"save_path,omitempty"`
	// 合同金额
	ContractAmount *int64 `json:"contract_amount,omitempty" xml:"contract_amount,omitempty"`
}

func (s QueryDubbridgeSearchContractResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDubbridgeSearchContractResponse) GoString() string {
	return s.String()
}

func (s *QueryDubbridgeSearchContractResponse) SetReqMsgId(v string) *QueryDubbridgeSearchContractResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDubbridgeSearchContractResponse) SetResultCode(v string) *QueryDubbridgeSearchContractResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDubbridgeSearchContractResponse) SetResultMsg(v string) *QueryDubbridgeSearchContractResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDubbridgeSearchContractResponse) SetRelationNo(v string) *QueryDubbridgeSearchContractResponse {
	s.RelationNo = &v
	return s
}

func (s *QueryDubbridgeSearchContractResponse) SetContractNo(v string) *QueryDubbridgeSearchContractResponse {
	s.ContractNo = &v
	return s
}

func (s *QueryDubbridgeSearchContractResponse) SetContractName(v string) *QueryDubbridgeSearchContractResponse {
	s.ContractName = &v
	return s
}

func (s *QueryDubbridgeSearchContractResponse) SetContractType(v string) *QueryDubbridgeSearchContractResponse {
	s.ContractType = &v
	return s
}

func (s *QueryDubbridgeSearchContractResponse) SetCustomNo(v string) *QueryDubbridgeSearchContractResponse {
	s.CustomNo = &v
	return s
}

func (s *QueryDubbridgeSearchContractResponse) SetSavePath(v string) *QueryDubbridgeSearchContractResponse {
	s.SavePath = &v
	return s
}

func (s *QueryDubbridgeSearchContractResponse) SetContractAmount(v int64) *QueryDubbridgeSearchContractResponse {
	s.ContractAmount = &v
	return s
}

type ApplyDubbridgeUsecreditRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 授信申请订单号
	OriginalOrderNo *string `json:"original_order_no,omitempty" xml:"original_order_no,omitempty" require:"true"`
	// 用信金额
	LoanAmount *int64 `json:"loan_amount,omitempty" xml:"loan_amount,omitempty" require:"true"`
	// 期数
	Period *int64 `json:"period,omitempty" xml:"period,omitempty" require:"true"`
	// 资产方用户唯一标识
	OpenId *string `json:"open_id,omitempty" xml:"open_id,omitempty" require:"true"`
	// 订单号
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty" require:"true"`
	// 还款方式:1：等额本息，2：等额本金
	RepayType *string `json:"repay_type,omitempty" xml:"repay_type,omitempty" require:"true"`
	// 1：手机数码 2：旅游 3：装修 4：教育 5：婚庆 6：租房 7：家具家居 8：健康医疗 9：其他消费 10：家用电器
	LoanWay *string `json:"loan_way,omitempty" xml:"loan_way,omitempty" require:"true"`
}

func (s ApplyDubbridgeUsecreditRequest) String() string {
	return tea.Prettify(s)
}

func (s ApplyDubbridgeUsecreditRequest) GoString() string {
	return s.String()
}

func (s *ApplyDubbridgeUsecreditRequest) SetAuthToken(v string) *ApplyDubbridgeUsecreditRequest {
	s.AuthToken = &v
	return s
}

func (s *ApplyDubbridgeUsecreditRequest) SetProductInstanceId(v string) *ApplyDubbridgeUsecreditRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ApplyDubbridgeUsecreditRequest) SetOriginalOrderNo(v string) *ApplyDubbridgeUsecreditRequest {
	s.OriginalOrderNo = &v
	return s
}

func (s *ApplyDubbridgeUsecreditRequest) SetLoanAmount(v int64) *ApplyDubbridgeUsecreditRequest {
	s.LoanAmount = &v
	return s
}

func (s *ApplyDubbridgeUsecreditRequest) SetPeriod(v int64) *ApplyDubbridgeUsecreditRequest {
	s.Period = &v
	return s
}

func (s *ApplyDubbridgeUsecreditRequest) SetOpenId(v string) *ApplyDubbridgeUsecreditRequest {
	s.OpenId = &v
	return s
}

func (s *ApplyDubbridgeUsecreditRequest) SetOrderNo(v string) *ApplyDubbridgeUsecreditRequest {
	s.OrderNo = &v
	return s
}

func (s *ApplyDubbridgeUsecreditRequest) SetRepayType(v string) *ApplyDubbridgeUsecreditRequest {
	s.RepayType = &v
	return s
}

func (s *ApplyDubbridgeUsecreditRequest) SetLoanWay(v string) *ApplyDubbridgeUsecreditRequest {
	s.LoanWay = &v
	return s
}

type ApplyDubbridgeUsecreditResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s ApplyDubbridgeUsecreditResponse) String() string {
	return tea.Prettify(s)
}

func (s ApplyDubbridgeUsecreditResponse) GoString() string {
	return s.String()
}

func (s *ApplyDubbridgeUsecreditResponse) SetReqMsgId(v string) *ApplyDubbridgeUsecreditResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ApplyDubbridgeUsecreditResponse) SetResultCode(v string) *ApplyDubbridgeUsecreditResponse {
	s.ResultCode = &v
	return s
}

func (s *ApplyDubbridgeUsecreditResponse) SetResultMsg(v string) *ApplyDubbridgeUsecreditResponse {
	s.ResultMsg = &v
	return s
}

type QueryDubbridgeUsecreditStatusRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 用信申请订单号
	OriginalOrderNo *string `json:"original_order_no,omitempty" xml:"original_order_no,omitempty" require:"true"`
	// 请求网络流水号
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty" require:"true"`
}

func (s QueryDubbridgeUsecreditStatusRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDubbridgeUsecreditStatusRequest) GoString() string {
	return s.String()
}

func (s *QueryDubbridgeUsecreditStatusRequest) SetAuthToken(v string) *QueryDubbridgeUsecreditStatusRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDubbridgeUsecreditStatusRequest) SetProductInstanceId(v string) *QueryDubbridgeUsecreditStatusRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryDubbridgeUsecreditStatusRequest) SetOriginalOrderNo(v string) *QueryDubbridgeUsecreditStatusRequest {
	s.OriginalOrderNo = &v
	return s
}

func (s *QueryDubbridgeUsecreditStatusRequest) SetOrderNo(v string) *QueryDubbridgeUsecreditStatusRequest {
	s.OrderNo = &v
	return s
}

type QueryDubbridgeUsecreditStatusResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 用信状态（0-通过/1-不通过2-处理中）
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 拒绝原因
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
	// 借据信息
	ReceiptInfo *ReceiptInfo `json:"receipt_info,omitempty" xml:"receipt_info,omitempty"`
	// 还款计划列表
	RepayRef []*RepayRef `json:"repay_ref,omitempty" xml:"repay_ref,omitempty" type:"Repeated"`
}

func (s QueryDubbridgeUsecreditStatusResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDubbridgeUsecreditStatusResponse) GoString() string {
	return s.String()
}

func (s *QueryDubbridgeUsecreditStatusResponse) SetReqMsgId(v string) *QueryDubbridgeUsecreditStatusResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDubbridgeUsecreditStatusResponse) SetResultCode(v string) *QueryDubbridgeUsecreditStatusResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDubbridgeUsecreditStatusResponse) SetResultMsg(v string) *QueryDubbridgeUsecreditStatusResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDubbridgeUsecreditStatusResponse) SetStatus(v string) *QueryDubbridgeUsecreditStatusResponse {
	s.Status = &v
	return s
}

func (s *QueryDubbridgeUsecreditStatusResponse) SetMsg(v string) *QueryDubbridgeUsecreditStatusResponse {
	s.Msg = &v
	return s
}

func (s *QueryDubbridgeUsecreditStatusResponse) SetReceiptInfo(v *ReceiptInfo) *QueryDubbridgeUsecreditStatusResponse {
	s.ReceiptInfo = v
	return s
}

func (s *QueryDubbridgeUsecreditStatusResponse) SetRepayRef(v []*RepayRef) *QueryDubbridgeUsecreditStatusResponse {
	s.RepayRef = v
	return s
}

type QueryDubbridgeReceiptStatusRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// open_id
	OpenId *string `json:"open_id,omitempty" xml:"open_id,omitempty"`
	// 客户号
	CustomNo *string `json:"custom_no,omitempty" xml:"custom_no,omitempty"`
}

func (s QueryDubbridgeReceiptStatusRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryDubbridgeReceiptStatusRequest) GoString() string {
	return s.String()
}

func (s *QueryDubbridgeReceiptStatusRequest) SetAuthToken(v string) *QueryDubbridgeReceiptStatusRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryDubbridgeReceiptStatusRequest) SetProductInstanceId(v string) *QueryDubbridgeReceiptStatusRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryDubbridgeReceiptStatusRequest) SetOpenId(v string) *QueryDubbridgeReceiptStatusRequest {
	s.OpenId = &v
	return s
}

func (s *QueryDubbridgeReceiptStatusRequest) SetCustomNo(v string) *QueryDubbridgeReceiptStatusRequest {
	s.CustomNo = &v
	return s
}

type QueryDubbridgeReceiptStatusResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 是否结清结构体
	Data *CustomReceiptStatus `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QueryDubbridgeReceiptStatusResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryDubbridgeReceiptStatusResponse) GoString() string {
	return s.String()
}

func (s *QueryDubbridgeReceiptStatusResponse) SetReqMsgId(v string) *QueryDubbridgeReceiptStatusResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryDubbridgeReceiptStatusResponse) SetResultCode(v string) *QueryDubbridgeReceiptStatusResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryDubbridgeReceiptStatusResponse) SetResultMsg(v string) *QueryDubbridgeReceiptStatusResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryDubbridgeReceiptStatusResponse) SetData(v *CustomReceiptStatus) *QueryDubbridgeReceiptStatusResponse {
	s.Data = v
	return s
}

type VerifyFinserviceZhimaIdentifyRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 需要校验的人姓名
	LegalPersonCertName *string `json:"legal_person_cert_name,omitempty" xml:"legal_person_cert_name,omitempty" require:"true"`
	// 需要校验的人身份证号
	LegalPersonCertNo *string `json:"legal_person_cert_no,omitempty" xml:"legal_person_cert_no,omitempty" require:"true"`
	// 认证结束后的商户回调地址。
	MerchantUrl *string `json:"merchant_url,omitempty" xml:"merchant_url,omitempty" require:"true"`
}

func (s VerifyFinserviceZhimaIdentifyRequest) String() string {
	return tea.Prettify(s)
}

func (s VerifyFinserviceZhimaIdentifyRequest) GoString() string {
	return s.String()
}

func (s *VerifyFinserviceZhimaIdentifyRequest) SetAuthToken(v string) *VerifyFinserviceZhimaIdentifyRequest {
	s.AuthToken = &v
	return s
}

func (s *VerifyFinserviceZhimaIdentifyRequest) SetProductInstanceId(v string) *VerifyFinserviceZhimaIdentifyRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *VerifyFinserviceZhimaIdentifyRequest) SetLegalPersonCertName(v string) *VerifyFinserviceZhimaIdentifyRequest {
	s.LegalPersonCertName = &v
	return s
}

func (s *VerifyFinserviceZhimaIdentifyRequest) SetLegalPersonCertNo(v string) *VerifyFinserviceZhimaIdentifyRequest {
	s.LegalPersonCertNo = &v
	return s
}

func (s *VerifyFinserviceZhimaIdentifyRequest) SetMerchantUrl(v string) *VerifyFinserviceZhimaIdentifyRequest {
	s.MerchantUrl = &v
	return s
}

type VerifyFinserviceZhimaIdentifyResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 本次认证的唯一标识，商户需要记录，后续的操作都需要用到。
	Data *ZhimaIdentifyResp `json:"data,omitempty" xml:"data,omitempty"`
}

func (s VerifyFinserviceZhimaIdentifyResponse) String() string {
	return tea.Prettify(s)
}

func (s VerifyFinserviceZhimaIdentifyResponse) GoString() string {
	return s.String()
}

func (s *VerifyFinserviceZhimaIdentifyResponse) SetReqMsgId(v string) *VerifyFinserviceZhimaIdentifyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *VerifyFinserviceZhimaIdentifyResponse) SetResultCode(v string) *VerifyFinserviceZhimaIdentifyResponse {
	s.ResultCode = &v
	return s
}

func (s *VerifyFinserviceZhimaIdentifyResponse) SetResultMsg(v string) *VerifyFinserviceZhimaIdentifyResponse {
	s.ResultMsg = &v
	return s
}

func (s *VerifyFinserviceZhimaIdentifyResponse) SetData(v *ZhimaIdentifyResp) *VerifyFinserviceZhimaIdentifyResponse {
	s.Data = v
	return s
}

type QueryFinserviceZhimaIdentifyRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 初始化时候返回的唯一标识
	BizNo *string `json:"biz_no,omitempty" xml:"biz_no,omitempty" require:"true"`
}

func (s QueryFinserviceZhimaIdentifyRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryFinserviceZhimaIdentifyRequest) GoString() string {
	return s.String()
}

func (s *QueryFinserviceZhimaIdentifyRequest) SetAuthToken(v string) *QueryFinserviceZhimaIdentifyRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryFinserviceZhimaIdentifyRequest) SetProductInstanceId(v string) *QueryFinserviceZhimaIdentifyRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryFinserviceZhimaIdentifyRequest) SetBizNo(v string) *QueryFinserviceZhimaIdentifyRequest {
	s.BizNo = &v
	return s
}

type QueryFinserviceZhimaIdentifyResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	//
	Data *ZhimaQueryResp `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QueryFinserviceZhimaIdentifyResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryFinserviceZhimaIdentifyResponse) GoString() string {
	return s.String()
}

func (s *QueryFinserviceZhimaIdentifyResponse) SetReqMsgId(v string) *QueryFinserviceZhimaIdentifyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryFinserviceZhimaIdentifyResponse) SetResultCode(v string) *QueryFinserviceZhimaIdentifyResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryFinserviceZhimaIdentifyResponse) SetResultMsg(v string) *QueryFinserviceZhimaIdentifyResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryFinserviceZhimaIdentifyResponse) SetData(v *ZhimaQueryResp) *QueryFinserviceZhimaIdentifyResponse {
	s.Data = v
	return s
}

type QueryMdipDataserviceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 服务编码
	ServiceCode *string `json:"service_code,omitempty" xml:"service_code,omitempty" require:"true"`
	// 服务参数
	ServiceParam *string `json:"service_param,omitempty" xml:"service_param,omitempty" require:"true"`
}

func (s QueryMdipDataserviceRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryMdipDataserviceRequest) GoString() string {
	return s.String()
}

func (s *QueryMdipDataserviceRequest) SetAuthToken(v string) *QueryMdipDataserviceRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryMdipDataserviceRequest) SetProductInstanceId(v string) *QueryMdipDataserviceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryMdipDataserviceRequest) SetServiceCode(v string) *QueryMdipDataserviceRequest {
	s.ServiceCode = &v
	return s
}

func (s *QueryMdipDataserviceRequest) SetServiceParam(v string) *QueryMdipDataserviceRequest {
	s.ServiceParam = &v
	return s
}

type QueryMdipDataserviceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 多源查询结果值
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QueryMdipDataserviceResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryMdipDataserviceResponse) GoString() string {
	return s.String()
}

func (s *QueryMdipDataserviceResponse) SetReqMsgId(v string) *QueryMdipDataserviceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryMdipDataserviceResponse) SetResultCode(v string) *QueryMdipDataserviceResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryMdipDataserviceResponse) SetResultMsg(v string) *QueryMdipDataserviceResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryMdipDataserviceResponse) SetData(v string) *QueryMdipDataserviceResponse {
	s.Data = &v
	return s
}

type ReceiveMdipParamsFileRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// file_id
	// 待上传文件
	FileObject io.Reader `json:"fileObject,omitempty" xml:"fileObject,omitempty"`
	// 待上传文件名
	FileObjectName *string `json:"fileObjectName,omitempty" xml:"fileObjectName,omitempty"`
	FileId         *string `json:"file_id,omitempty" xml:"file_id,omitempty" require:"true"`
}

func (s ReceiveMdipParamsFileRequest) String() string {
	return tea.Prettify(s)
}

func (s ReceiveMdipParamsFileRequest) GoString() string {
	return s.String()
}

func (s *ReceiveMdipParamsFileRequest) SetAuthToken(v string) *ReceiveMdipParamsFileRequest {
	s.AuthToken = &v
	return s
}

func (s *ReceiveMdipParamsFileRequest) SetProductInstanceId(v string) *ReceiveMdipParamsFileRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ReceiveMdipParamsFileRequest) SetFileObject(v io.Reader) *ReceiveMdipParamsFileRequest {
	s.FileObject = v
	return s
}

func (s *ReceiveMdipParamsFileRequest) SetFileObjectName(v string) *ReceiveMdipParamsFileRequest {
	s.FileObjectName = &v
	return s
}

func (s *ReceiveMdipParamsFileRequest) SetFileId(v string) *ReceiveMdipParamsFileRequest {
	s.FileId = &v
	return s
}

type ReceiveMdipParamsFileResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s ReceiveMdipParamsFileResponse) String() string {
	return tea.Prettify(s)
}

func (s ReceiveMdipParamsFileResponse) GoString() string {
	return s.String()
}

func (s *ReceiveMdipParamsFileResponse) SetReqMsgId(v string) *ReceiveMdipParamsFileResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ReceiveMdipParamsFileResponse) SetResultCode(v string) *ReceiveMdipParamsFileResponse {
	s.ResultCode = &v
	return s
}

func (s *ReceiveMdipParamsFileResponse) SetResultMsg(v string) *ReceiveMdipParamsFileResponse {
	s.ResultMsg = &v
	return s
}

type QueryRbbGenericInvokeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// {"platformId":1234,"method":"riskQuery"}
	Content *string `json:"content,omitempty" xml:"content,omitempty" require:"true"`
	// 账号的所有权限点，逗号分隔
	Permission *string `json:"permission,omitempty" xml:"permission,omitempty" require:"true"`
	// 标题备用
	Title *string `json:"title,omitempty" xml:"title,omitempty" require:"true"`
}

func (s QueryRbbGenericInvokeRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryRbbGenericInvokeRequest) GoString() string {
	return s.String()
}

func (s *QueryRbbGenericInvokeRequest) SetAuthToken(v string) *QueryRbbGenericInvokeRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryRbbGenericInvokeRequest) SetProductInstanceId(v string) *QueryRbbGenericInvokeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryRbbGenericInvokeRequest) SetContent(v string) *QueryRbbGenericInvokeRequest {
	s.Content = &v
	return s
}

func (s *QueryRbbGenericInvokeRequest) SetPermission(v string) *QueryRbbGenericInvokeRequest {
	s.Permission = &v
	return s
}

func (s *QueryRbbGenericInvokeRequest) SetTitle(v string) *QueryRbbGenericInvokeRequest {
	s.Title = &v
	return s
}

type QueryRbbGenericInvokeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回数据内容
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QueryRbbGenericInvokeResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryRbbGenericInvokeResponse) GoString() string {
	return s.String()
}

func (s *QueryRbbGenericInvokeResponse) SetReqMsgId(v string) *QueryRbbGenericInvokeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryRbbGenericInvokeResponse) SetResultCode(v string) *QueryRbbGenericInvokeResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryRbbGenericInvokeResponse) SetResultMsg(v string) *QueryRbbGenericInvokeResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryRbbGenericInvokeResponse) SetData(v string) *QueryRbbGenericInvokeResponse {
	s.Data = &v
	return s
}

type CreateRbbTokenRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 扩展字段
	Content *string `json:"content,omitempty" xml:"content,omitempty" require:"true"`
	// 新人用户密码，用来做映射生成token
	Password *string `json:"password,omitempty" xml:"password,omitempty" require:"true"`
	// 用户
	Username *string `json:"username,omitempty" xml:"username,omitempty" require:"true"`
}

func (s CreateRbbTokenRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateRbbTokenRequest) GoString() string {
	return s.String()
}

func (s *CreateRbbTokenRequest) SetAuthToken(v string) *CreateRbbTokenRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateRbbTokenRequest) SetProductInstanceId(v string) *CreateRbbTokenRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateRbbTokenRequest) SetContent(v string) *CreateRbbTokenRequest {
	s.Content = &v
	return s
}

func (s *CreateRbbTokenRequest) SetPassword(v string) *CreateRbbTokenRequest {
	s.Password = &v
	return s
}

func (s *CreateRbbTokenRequest) SetUsername(v string) *CreateRbbTokenRequest {
	s.Username = &v
	return s
}

type CreateRbbTokenResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回数据
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s CreateRbbTokenResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateRbbTokenResponse) GoString() string {
	return s.String()
}

func (s *CreateRbbTokenResponse) SetReqMsgId(v string) *CreateRbbTokenResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateRbbTokenResponse) SetResultCode(v string) *CreateRbbTokenResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateRbbTokenResponse) SetResultMsg(v string) *CreateRbbTokenResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateRbbTokenResponse) SetData(v string) *CreateRbbTokenResponse {
	s.Data = &v
	return s
}

type CreateRbbApiGwtokenRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 扩展字段
	Extension *string `json:"extension,omitempty" xml:"extension,omitempty"`
	// 新人用户密码，用来做映射生成token
	Password *string `json:"password,omitempty" xml:"password,omitempty" require:"true"`
	// 用户
	Username *string `json:"username,omitempty" xml:"username,omitempty" require:"true"`
}

func (s CreateRbbApiGwtokenRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateRbbApiGwtokenRequest) GoString() string {
	return s.String()
}

func (s *CreateRbbApiGwtokenRequest) SetAuthToken(v string) *CreateRbbApiGwtokenRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateRbbApiGwtokenRequest) SetProductInstanceId(v string) *CreateRbbApiGwtokenRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateRbbApiGwtokenRequest) SetExtension(v string) *CreateRbbApiGwtokenRequest {
	s.Extension = &v
	return s
}

func (s *CreateRbbApiGwtokenRequest) SetPassword(v string) *CreateRbbApiGwtokenRequest {
	s.Password = &v
	return s
}

func (s *CreateRbbApiGwtokenRequest) SetUsername(v string) *CreateRbbApiGwtokenRequest {
	s.Username = &v
	return s
}

type CreateRbbApiGwtokenResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回登录token
	Logintoken *string `json:"logintoken,omitempty" xml:"logintoken,omitempty"`
}

func (s CreateRbbApiGwtokenResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateRbbApiGwtokenResponse) GoString() string {
	return s.String()
}

func (s *CreateRbbApiGwtokenResponse) SetReqMsgId(v string) *CreateRbbApiGwtokenResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateRbbApiGwtokenResponse) SetResultCode(v string) *CreateRbbApiGwtokenResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateRbbApiGwtokenResponse) SetResultMsg(v string) *CreateRbbApiGwtokenResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateRbbApiGwtokenResponse) SetLogintoken(v string) *CreateRbbApiGwtokenResponse {
	s.Logintoken = &v
	return s
}

type QueryRbbGeneralRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 额外参数json
	Extension *string `json:"extension,omitempty" xml:"extension,omitempty"`
	// 通用查询名称
	Queryname *string `json:"queryname,omitempty" xml:"queryname,omitempty" require:"true" maxLength:"200" minLength:"2"`
	// 查询参数JSON字符串
	Queryparas *string `json:"queryparas,omitempty" xml:"queryparas,omitempty"`
}

func (s QueryRbbGeneralRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryRbbGeneralRequest) GoString() string {
	return s.String()
}

func (s *QueryRbbGeneralRequest) SetAuthToken(v string) *QueryRbbGeneralRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryRbbGeneralRequest) SetProductInstanceId(v string) *QueryRbbGeneralRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryRbbGeneralRequest) SetExtension(v string) *QueryRbbGeneralRequest {
	s.Extension = &v
	return s
}

func (s *QueryRbbGeneralRequest) SetQueryname(v string) *QueryRbbGeneralRequest {
	s.Queryname = &v
	return s
}

func (s *QueryRbbGeneralRequest) SetQueryparas(v string) *QueryRbbGeneralRequest {
	s.Queryparas = &v
	return s
}

type QueryRbbGeneralResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// json字符串表示的通用查询结果
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QueryRbbGeneralResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryRbbGeneralResponse) GoString() string {
	return s.String()
}

func (s *QueryRbbGeneralResponse) SetReqMsgId(v string) *QueryRbbGeneralResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryRbbGeneralResponse) SetResultCode(v string) *QueryRbbGeneralResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryRbbGeneralResponse) SetResultMsg(v string) *QueryRbbGeneralResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryRbbGeneralResponse) SetData(v string) *QueryRbbGeneralResponse {
	s.Data = &v
	return s
}

type GetRbbLoginTokenRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 用户名
	Username *string `json:"username,omitempty" xml:"username,omitempty" require:"true"`
	// 密码
	Password *string `json:"password,omitempty" xml:"password,omitempty" require:"true"`
	// 扩展json字符串
	Extension *string `json:"extension,omitempty" xml:"extension,omitempty"`
}

func (s GetRbbLoginTokenRequest) String() string {
	return tea.Prettify(s)
}

func (s GetRbbLoginTokenRequest) GoString() string {
	return s.String()
}

func (s *GetRbbLoginTokenRequest) SetAuthToken(v string) *GetRbbLoginTokenRequest {
	s.AuthToken = &v
	return s
}

func (s *GetRbbLoginTokenRequest) SetProductInstanceId(v string) *GetRbbLoginTokenRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetRbbLoginTokenRequest) SetUsername(v string) *GetRbbLoginTokenRequest {
	s.Username = &v
	return s
}

func (s *GetRbbLoginTokenRequest) SetPassword(v string) *GetRbbLoginTokenRequest {
	s.Password = &v
	return s
}

func (s *GetRbbLoginTokenRequest) SetExtension(v string) *GetRbbLoginTokenRequest {
	s.Extension = &v
	return s
}

type GetRbbLoginTokenResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 登录token，5分钟有效
	Logintoken *string `json:"logintoken,omitempty" xml:"logintoken,omitempty"`
}

func (s GetRbbLoginTokenResponse) String() string {
	return tea.Prettify(s)
}

func (s GetRbbLoginTokenResponse) GoString() string {
	return s.String()
}

func (s *GetRbbLoginTokenResponse) SetReqMsgId(v string) *GetRbbLoginTokenResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetRbbLoginTokenResponse) SetResultCode(v string) *GetRbbLoginTokenResponse {
	s.ResultCode = &v
	return s
}

func (s *GetRbbLoginTokenResponse) SetResultMsg(v string) *GetRbbLoginTokenResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetRbbLoginTokenResponse) SetLogintoken(v string) *GetRbbLoginTokenResponse {
	s.Logintoken = &v
	return s
}

type CreateRbbTenantRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户过期时间，不填表示永不过期
	EffectiveEndDate *string `json:"effective_end_date,omitempty" xml:"effective_end_date,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 租户编码，必须全局唯一
	TenantCode *string `json:"tenant_code,omitempty" xml:"tenant_code,omitempty" require:"true" maxLength:"64" minLength:"2"`
	// 租户名称
	TenantName *string `json:"tenant_name,omitempty" xml:"tenant_name,omitempty" require:"true" maxLength:"64" minLength:"2"`
	// 租户自定义属性，JSON格式，可以为空
	TenantPropertyJson *string `json:"tenant_property_json,omitempty" xml:"tenant_property_json,omitempty"`
}

func (s CreateRbbTenantRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateRbbTenantRequest) GoString() string {
	return s.String()
}

func (s *CreateRbbTenantRequest) SetAuthToken(v string) *CreateRbbTenantRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateRbbTenantRequest) SetProductInstanceId(v string) *CreateRbbTenantRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateRbbTenantRequest) SetEffectiveEndDate(v string) *CreateRbbTenantRequest {
	s.EffectiveEndDate = &v
	return s
}

func (s *CreateRbbTenantRequest) SetTenantCode(v string) *CreateRbbTenantRequest {
	s.TenantCode = &v
	return s
}

func (s *CreateRbbTenantRequest) SetTenantName(v string) *CreateRbbTenantRequest {
	s.TenantName = &v
	return s
}

func (s *CreateRbbTenantRequest) SetTenantPropertyJson(v string) *CreateRbbTenantRequest {
	s.TenantPropertyJson = &v
	return s
}

type CreateRbbTenantResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CreateRbbTenantResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateRbbTenantResponse) GoString() string {
	return s.String()
}

func (s *CreateRbbTenantResponse) SetReqMsgId(v string) *CreateRbbTenantResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateRbbTenantResponse) SetResultCode(v string) *CreateRbbTenantResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateRbbTenantResponse) SetResultMsg(v string) *CreateRbbTenantResponse {
	s.ResultMsg = &v
	return s
}

type CreateRbbUserRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 用户邮箱，非必填
	Email *string `json:"email,omitempty" xml:"email,omitempty" maxLength:"128" minLength:"3"`
	// 用户姓名、真实名称，不要求全局唯一
	FullName *string `json:"full_name,omitempty" xml:"full_name,omitempty" require:"true" maxLength:"64" minLength:"1"`
	// 用户密码
	Password *string `json:"password,omitempty" xml:"password,omitempty" require:"true" maxLength:"200" minLength:"8"`
	// 用户电话号码，非必填
	Phone *string `json:"phone,omitempty" xml:"phone,omitempty" maxLength:"64" minLength:"4"`
	// 用户所属租户编码
	TenantCode *string `json:"tenant_code,omitempty" xml:"tenant_code,omitempty" maxLength:"64" minLength:"2"`
	// 用户名，必须全局唯一
	UserName *string `json:"user_name,omitempty" xml:"user_name,omitempty" require:"true"`
	// 用户属性扩展字段，json格式，可以为空
	UserPropertyJson *string `json:"user_property_json,omitempty" xml:"user_property_json,omitempty"`
}

func (s CreateRbbUserRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateRbbUserRequest) GoString() string {
	return s.String()
}

func (s *CreateRbbUserRequest) SetAuthToken(v string) *CreateRbbUserRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateRbbUserRequest) SetProductInstanceId(v string) *CreateRbbUserRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateRbbUserRequest) SetEmail(v string) *CreateRbbUserRequest {
	s.Email = &v
	return s
}

func (s *CreateRbbUserRequest) SetFullName(v string) *CreateRbbUserRequest {
	s.FullName = &v
	return s
}

func (s *CreateRbbUserRequest) SetPassword(v string) *CreateRbbUserRequest {
	s.Password = &v
	return s
}

func (s *CreateRbbUserRequest) SetPhone(v string) *CreateRbbUserRequest {
	s.Phone = &v
	return s
}

func (s *CreateRbbUserRequest) SetTenantCode(v string) *CreateRbbUserRequest {
	s.TenantCode = &v
	return s
}

func (s *CreateRbbUserRequest) SetUserName(v string) *CreateRbbUserRequest {
	s.UserName = &v
	return s
}

func (s *CreateRbbUserRequest) SetUserPropertyJson(v string) *CreateRbbUserRequest {
	s.UserPropertyJson = &v
	return s
}

type CreateRbbUserResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CreateRbbUserResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateRbbUserResponse) GoString() string {
	return s.String()
}

func (s *CreateRbbUserResponse) SetReqMsgId(v string) *CreateRbbUserResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateRbbUserResponse) SetResultCode(v string) *CreateRbbUserResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateRbbUserResponse) SetResultMsg(v string) *CreateRbbUserResponse {
	s.ResultMsg = &v
	return s
}

type ExecRbbCompanyGuardRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 企业名称或统一社会信用代码
	Keyword *string `json:"keyword,omitempty" xml:"keyword,omitempty" require:"true"`
	// 规则ID，在风险大脑系统中配置
	RuleId *int64 `json:"rule_id,omitempty" xml:"rule_id,omitempty" require:"true"`
	// 额外参数，与规则有关
	Params *string `json:"params,omitempty" xml:"params,omitempty"`
}

func (s ExecRbbCompanyGuardRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecRbbCompanyGuardRequest) GoString() string {
	return s.String()
}

func (s *ExecRbbCompanyGuardRequest) SetAuthToken(v string) *ExecRbbCompanyGuardRequest {
	s.AuthToken = &v
	return s
}

func (s *ExecRbbCompanyGuardRequest) SetProductInstanceId(v string) *ExecRbbCompanyGuardRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ExecRbbCompanyGuardRequest) SetKeyword(v string) *ExecRbbCompanyGuardRequest {
	s.Keyword = &v
	return s
}

func (s *ExecRbbCompanyGuardRequest) SetRuleId(v int64) *ExecRbbCompanyGuardRequest {
	s.RuleId = &v
	return s
}

func (s *ExecRbbCompanyGuardRequest) SetParams(v string) *ExecRbbCompanyGuardRequest {
	s.Params = &v
	return s
}

type ExecRbbCompanyGuardResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 决策结果，ACCEPT/REJECT/TBD
	Decision *string `json:"decision,omitempty" xml:"decision,omitempty"`
	// 准入执行结果的快照
	Results *string `json:"results,omitempty" xml:"results,omitempty"`
}

func (s ExecRbbCompanyGuardResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecRbbCompanyGuardResponse) GoString() string {
	return s.String()
}

func (s *ExecRbbCompanyGuardResponse) SetReqMsgId(v string) *ExecRbbCompanyGuardResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ExecRbbCompanyGuardResponse) SetResultCode(v string) *ExecRbbCompanyGuardResponse {
	s.ResultCode = &v
	return s
}

func (s *ExecRbbCompanyGuardResponse) SetResultMsg(v string) *ExecRbbCompanyGuardResponse {
	s.ResultMsg = &v
	return s
}

func (s *ExecRbbCompanyGuardResponse) SetDecision(v string) *ExecRbbCompanyGuardResponse {
	s.Decision = &v
	return s
}

func (s *ExecRbbCompanyGuardResponse) SetResults(v string) *ExecRbbCompanyGuardResponse {
	s.Results = &v
	return s
}

type ApplyRbbCompanyCreditRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 企业名称、统一社会信用代码
	Keyword *string `json:"keyword,omitempty" xml:"keyword,omitempty" require:"true"`
	// 规则ID，需提前在蚁盾中进行配置
	RuleId *int64 `json:"rule_id,omitempty" xml:"rule_id,omitempty" require:"true"`
	// 额外参数，与规则有关
	Params *string `json:"params,omitempty" xml:"params,omitempty"`
}

func (s ApplyRbbCompanyCreditRequest) String() string {
	return tea.Prettify(s)
}

func (s ApplyRbbCompanyCreditRequest) GoString() string {
	return s.String()
}

func (s *ApplyRbbCompanyCreditRequest) SetAuthToken(v string) *ApplyRbbCompanyCreditRequest {
	s.AuthToken = &v
	return s
}

func (s *ApplyRbbCompanyCreditRequest) SetProductInstanceId(v string) *ApplyRbbCompanyCreditRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ApplyRbbCompanyCreditRequest) SetKeyword(v string) *ApplyRbbCompanyCreditRequest {
	s.Keyword = &v
	return s
}

func (s *ApplyRbbCompanyCreditRequest) SetRuleId(v int64) *ApplyRbbCompanyCreditRequest {
	s.RuleId = &v
	return s
}

func (s *ApplyRbbCompanyCreditRequest) SetParams(v string) *ApplyRbbCompanyCreditRequest {
	s.Params = &v
	return s
}

type ApplyRbbCompanyCreditResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 查询token，用于查询授信结果
	Token *string `json:"token,omitempty" xml:"token,omitempty"`
}

func (s ApplyRbbCompanyCreditResponse) String() string {
	return tea.Prettify(s)
}

func (s ApplyRbbCompanyCreditResponse) GoString() string {
	return s.String()
}

func (s *ApplyRbbCompanyCreditResponse) SetReqMsgId(v string) *ApplyRbbCompanyCreditResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ApplyRbbCompanyCreditResponse) SetResultCode(v string) *ApplyRbbCompanyCreditResponse {
	s.ResultCode = &v
	return s
}

func (s *ApplyRbbCompanyCreditResponse) SetResultMsg(v string) *ApplyRbbCompanyCreditResponse {
	s.ResultMsg = &v
	return s
}

func (s *ApplyRbbCompanyCreditResponse) SetToken(v string) *ApplyRbbCompanyCreditResponse {
	s.Token = &v
	return s
}

type QueryRbbCompanyCreditRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 查询token，从apply接口获得
	Token *string `json:"token,omitempty" xml:"token,omitempty" require:"true"`
}

func (s QueryRbbCompanyCreditRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryRbbCompanyCreditRequest) GoString() string {
	return s.String()
}

func (s *QueryRbbCompanyCreditRequest) SetAuthToken(v string) *QueryRbbCompanyCreditRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryRbbCompanyCreditRequest) SetProductInstanceId(v string) *QueryRbbCompanyCreditRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryRbbCompanyCreditRequest) SetToken(v string) *QueryRbbCompanyCreditRequest {
	s.Token = &v
	return s
}

type QueryRbbCompanyCreditResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 授信额度，单位元
	CreditAmount *int64 `json:"credit_amount,omitempty" xml:"credit_amount,omitempty"`
	// 额外特征字段
	Extra *string `json:"extra,omitempty" xml:"extra,omitempty"`
}

func (s QueryRbbCompanyCreditResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryRbbCompanyCreditResponse) GoString() string {
	return s.String()
}

func (s *QueryRbbCompanyCreditResponse) SetReqMsgId(v string) *QueryRbbCompanyCreditResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryRbbCompanyCreditResponse) SetResultCode(v string) *QueryRbbCompanyCreditResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryRbbCompanyCreditResponse) SetResultMsg(v string) *QueryRbbCompanyCreditResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryRbbCompanyCreditResponse) SetCreditAmount(v int64) *QueryRbbCompanyCreditResponse {
	s.CreditAmount = &v
	return s
}

func (s *QueryRbbCompanyCreditResponse) SetExtra(v string) *QueryRbbCompanyCreditResponse {
	s.Extra = &v
	return s
}

type QueryRbbRegdatasyncPreparedRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 查询该bizDate数据分区的数据是否已经准备好
	BizDate *string `json:"biz_date,omitempty" xml:"biz_date,omitempty" require:"true" maxLength:"8" minLength:"8"`
}

func (s QueryRbbRegdatasyncPreparedRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryRbbRegdatasyncPreparedRequest) GoString() string {
	return s.String()
}

func (s *QueryRbbRegdatasyncPreparedRequest) SetAuthToken(v string) *QueryRbbRegdatasyncPreparedRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryRbbRegdatasyncPreparedRequest) SetProductInstanceId(v string) *QueryRbbRegdatasyncPreparedRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryRbbRegdatasyncPreparedRequest) SetBizDate(v string) *QueryRbbRegdatasyncPreparedRequest {
	s.BizDate = &v
	return s
}

type QueryRbbRegdatasyncPreparedResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 指定时间分区的数据是否已经准备完毕
	Prepared *bool `json:"prepared,omitempty" xml:"prepared,omitempty"`
}

func (s QueryRbbRegdatasyncPreparedResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryRbbRegdatasyncPreparedResponse) GoString() string {
	return s.String()
}

func (s *QueryRbbRegdatasyncPreparedResponse) SetReqMsgId(v string) *QueryRbbRegdatasyncPreparedResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryRbbRegdatasyncPreparedResponse) SetResultCode(v string) *QueryRbbRegdatasyncPreparedResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryRbbRegdatasyncPreparedResponse) SetResultMsg(v string) *QueryRbbRegdatasyncPreparedResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryRbbRegdatasyncPreparedResponse) SetPrepared(v bool) *QueryRbbRegdatasyncPreparedResponse {
	s.Prepared = &v
	return s
}

type StartRbbRegdatasyncScheduleRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 同步时间分区
	BizDate *string `json:"biz_date,omitempty" xml:"biz_date,omitempty" require:"true"`
}

func (s StartRbbRegdatasyncScheduleRequest) String() string {
	return tea.Prettify(s)
}

func (s StartRbbRegdatasyncScheduleRequest) GoString() string {
	return s.String()
}

func (s *StartRbbRegdatasyncScheduleRequest) SetAuthToken(v string) *StartRbbRegdatasyncScheduleRequest {
	s.AuthToken = &v
	return s
}

func (s *StartRbbRegdatasyncScheduleRequest) SetProductInstanceId(v string) *StartRbbRegdatasyncScheduleRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *StartRbbRegdatasyncScheduleRequest) SetBizDate(v string) *StartRbbRegdatasyncScheduleRequest {
	s.BizDate = &v
	return s
}

type StartRbbRegdatasyncScheduleResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s StartRbbRegdatasyncScheduleResponse) String() string {
	return tea.Prettify(s)
}

func (s StartRbbRegdatasyncScheduleResponse) GoString() string {
	return s.String()
}

func (s *StartRbbRegdatasyncScheduleResponse) SetReqMsgId(v string) *StartRbbRegdatasyncScheduleResponse {
	s.ReqMsgId = &v
	return s
}

func (s *StartRbbRegdatasyncScheduleResponse) SetResultCode(v string) *StartRbbRegdatasyncScheduleResponse {
	s.ResultCode = &v
	return s
}

func (s *StartRbbRegdatasyncScheduleResponse) SetResultMsg(v string) *StartRbbRegdatasyncScheduleResponse {
	s.ResultMsg = &v
	return s
}

type FinishRbbRegdatasyncScheduleRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 时间分区
	BizDate *string `json:"biz_date,omitempty" xml:"biz_date,omitempty" require:"true" maxLength:"8" minLength:"8"`
	// 记录当前分区离线同步情况
	SyncInfo *string `json:"sync_info,omitempty" xml:"sync_info,omitempty" require:"true"`
}

func (s FinishRbbRegdatasyncScheduleRequest) String() string {
	return tea.Prettify(s)
}

func (s FinishRbbRegdatasyncScheduleRequest) GoString() string {
	return s.String()
}

func (s *FinishRbbRegdatasyncScheduleRequest) SetAuthToken(v string) *FinishRbbRegdatasyncScheduleRequest {
	s.AuthToken = &v
	return s
}

func (s *FinishRbbRegdatasyncScheduleRequest) SetProductInstanceId(v string) *FinishRbbRegdatasyncScheduleRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *FinishRbbRegdatasyncScheduleRequest) SetBizDate(v string) *FinishRbbRegdatasyncScheduleRequest {
	s.BizDate = &v
	return s
}

func (s *FinishRbbRegdatasyncScheduleRequest) SetSyncInfo(v string) *FinishRbbRegdatasyncScheduleRequest {
	s.SyncInfo = &v
	return s
}

type FinishRbbRegdatasyncScheduleResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s FinishRbbRegdatasyncScheduleResponse) String() string {
	return tea.Prettify(s)
}

func (s FinishRbbRegdatasyncScheduleResponse) GoString() string {
	return s.String()
}

func (s *FinishRbbRegdatasyncScheduleResponse) SetReqMsgId(v string) *FinishRbbRegdatasyncScheduleResponse {
	s.ReqMsgId = &v
	return s
}

func (s *FinishRbbRegdatasyncScheduleResponse) SetResultCode(v string) *FinishRbbRegdatasyncScheduleResponse {
	s.ResultCode = &v
	return s
}

func (s *FinishRbbRegdatasyncScheduleResponse) SetResultMsg(v string) *FinishRbbRegdatasyncScheduleResponse {
	s.ResultMsg = &v
	return s
}

type ApplyRbbCompanyGuardRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 企业名称、统一社会信用代码或注册号
	Keyword *string `json:"keyword,omitempty" xml:"keyword,omitempty" require:"true"`
	// 规则ID
	RuleId *int64 `json:"rule_id,omitempty" xml:"rule_id,omitempty" require:"true"`
	// 额外参数，与具体规则相关
	Params *string `json:"params,omitempty" xml:"params,omitempty"`
}

func (s ApplyRbbCompanyGuardRequest) String() string {
	return tea.Prettify(s)
}

func (s ApplyRbbCompanyGuardRequest) GoString() string {
	return s.String()
}

func (s *ApplyRbbCompanyGuardRequest) SetAuthToken(v string) *ApplyRbbCompanyGuardRequest {
	s.AuthToken = &v
	return s
}

func (s *ApplyRbbCompanyGuardRequest) SetProductInstanceId(v string) *ApplyRbbCompanyGuardRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ApplyRbbCompanyGuardRequest) SetKeyword(v string) *ApplyRbbCompanyGuardRequest {
	s.Keyword = &v
	return s
}

func (s *ApplyRbbCompanyGuardRequest) SetRuleId(v int64) *ApplyRbbCompanyGuardRequest {
	s.RuleId = &v
	return s
}

func (s *ApplyRbbCompanyGuardRequest) SetParams(v string) *ApplyRbbCompanyGuardRequest {
	s.Params = &v
	return s
}

type ApplyRbbCompanyGuardResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 查询token
	Token *string `json:"token,omitempty" xml:"token,omitempty"`
}

func (s ApplyRbbCompanyGuardResponse) String() string {
	return tea.Prettify(s)
}

func (s ApplyRbbCompanyGuardResponse) GoString() string {
	return s.String()
}

func (s *ApplyRbbCompanyGuardResponse) SetReqMsgId(v string) *ApplyRbbCompanyGuardResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ApplyRbbCompanyGuardResponse) SetResultCode(v string) *ApplyRbbCompanyGuardResponse {
	s.ResultCode = &v
	return s
}

func (s *ApplyRbbCompanyGuardResponse) SetResultMsg(v string) *ApplyRbbCompanyGuardResponse {
	s.ResultMsg = &v
	return s
}

func (s *ApplyRbbCompanyGuardResponse) SetToken(v string) *ApplyRbbCompanyGuardResponse {
	s.Token = &v
	return s
}

type QueryRbbCompanyGuardRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 查询token
	Token *string `json:"token,omitempty" xml:"token,omitempty" require:"true"`
}

func (s QueryRbbCompanyGuardRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryRbbCompanyGuardRequest) GoString() string {
	return s.String()
}

func (s *QueryRbbCompanyGuardRequest) SetAuthToken(v string) *QueryRbbCompanyGuardRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryRbbCompanyGuardRequest) SetProductInstanceId(v string) *QueryRbbCompanyGuardRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryRbbCompanyGuardRequest) SetToken(v string) *QueryRbbCompanyGuardRequest {
	s.Token = &v
	return s
}

type QueryRbbCompanyGuardResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 决策结果，ACCEPT/REJECT/TBD
	//
	Decision *string `json:"decision,omitempty" xml:"decision,omitempty"`
	// 准入执行结果的快照
	//
	Results *string `json:"results,omitempty" xml:"results,omitempty"`
}

func (s QueryRbbCompanyGuardResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryRbbCompanyGuardResponse) GoString() string {
	return s.String()
}

func (s *QueryRbbCompanyGuardResponse) SetReqMsgId(v string) *QueryRbbCompanyGuardResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryRbbCompanyGuardResponse) SetResultCode(v string) *QueryRbbCompanyGuardResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryRbbCompanyGuardResponse) SetResultMsg(v string) *QueryRbbCompanyGuardResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryRbbCompanyGuardResponse) SetDecision(v string) *QueryRbbCompanyGuardResponse {
	s.Decision = &v
	return s
}

func (s *QueryRbbCompanyGuardResponse) SetResults(v string) *QueryRbbCompanyGuardResponse {
	s.Results = &v
	return s
}

type QueryRbbObtsZsearchRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 索引名称
	Index *string `json:"index,omitempty" xml:"index,omitempty" require:"true"`
	// 类型名称
	Type *string `json:"type,omitempty" xml:"type,omitempty"`
	// 操作方法
	OperationMethod *string `json:"operation_method,omitempty" xml:"operation_method,omitempty"`
	// 查询语句
	EntityString *string `json:"entity_string,omitempty" xml:"entity_string,omitempty"`
}

func (s QueryRbbObtsZsearchRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryRbbObtsZsearchRequest) GoString() string {
	return s.String()
}

func (s *QueryRbbObtsZsearchRequest) SetAuthToken(v string) *QueryRbbObtsZsearchRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryRbbObtsZsearchRequest) SetProductInstanceId(v string) *QueryRbbObtsZsearchRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryRbbObtsZsearchRequest) SetIndex(v string) *QueryRbbObtsZsearchRequest {
	s.Index = &v
	return s
}

func (s *QueryRbbObtsZsearchRequest) SetType(v string) *QueryRbbObtsZsearchRequest {
	s.Type = &v
	return s
}

func (s *QueryRbbObtsZsearchRequest) SetOperationMethod(v string) *QueryRbbObtsZsearchRequest {
	s.OperationMethod = &v
	return s
}

func (s *QueryRbbObtsZsearchRequest) SetEntityString(v string) *QueryRbbObtsZsearchRequest {
	s.EntityString = &v
	return s
}

type QueryRbbObtsZsearchResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// zsearch查询结果
	ZsearchResult *string `json:"zsearch_result,omitempty" xml:"zsearch_result,omitempty"`
}

func (s QueryRbbObtsZsearchResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryRbbObtsZsearchResponse) GoString() string {
	return s.String()
}

func (s *QueryRbbObtsZsearchResponse) SetReqMsgId(v string) *QueryRbbObtsZsearchResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryRbbObtsZsearchResponse) SetResultCode(v string) *QueryRbbObtsZsearchResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryRbbObtsZsearchResponse) SetResultMsg(v string) *QueryRbbObtsZsearchResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryRbbObtsZsearchResponse) SetZsearchResult(v string) *QueryRbbObtsZsearchResponse {
	s.ZsearchResult = &v
	return s
}

type PushRbbCustomerCompanyinfoRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 企业的统一社会信用代码
	UcCode *string `json:"uc_code,omitempty" xml:"uc_code,omitempty"`
	// 企业名称
	CompanyName *string `json:"company_name,omitempty" xml:"company_name,omitempty"`
	// 企业信息的类型
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 企业信息的内容
	Content *string `json:"content,omitempty" xml:"content,omitempty"`
}

func (s PushRbbCustomerCompanyinfoRequest) String() string {
	return tea.Prettify(s)
}

func (s PushRbbCustomerCompanyinfoRequest) GoString() string {
	return s.String()
}

func (s *PushRbbCustomerCompanyinfoRequest) SetAuthToken(v string) *PushRbbCustomerCompanyinfoRequest {
	s.AuthToken = &v
	return s
}

func (s *PushRbbCustomerCompanyinfoRequest) SetProductInstanceId(v string) *PushRbbCustomerCompanyinfoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PushRbbCustomerCompanyinfoRequest) SetUcCode(v string) *PushRbbCustomerCompanyinfoRequest {
	s.UcCode = &v
	return s
}

func (s *PushRbbCustomerCompanyinfoRequest) SetCompanyName(v string) *PushRbbCustomerCompanyinfoRequest {
	s.CompanyName = &v
	return s
}

func (s *PushRbbCustomerCompanyinfoRequest) SetType(v string) *PushRbbCustomerCompanyinfoRequest {
	s.Type = &v
	return s
}

func (s *PushRbbCustomerCompanyinfoRequest) SetContent(v string) *PushRbbCustomerCompanyinfoRequest {
	s.Content = &v
	return s
}

type PushRbbCustomerCompanyinfoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s PushRbbCustomerCompanyinfoResponse) String() string {
	return tea.Prettify(s)
}

func (s PushRbbCustomerCompanyinfoResponse) GoString() string {
	return s.String()
}

func (s *PushRbbCustomerCompanyinfoResponse) SetReqMsgId(v string) *PushRbbCustomerCompanyinfoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PushRbbCustomerCompanyinfoResponse) SetResultCode(v string) *PushRbbCustomerCompanyinfoResponse {
	s.ResultCode = &v
	return s
}

func (s *PushRbbCustomerCompanyinfoResponse) SetResultMsg(v string) *PushRbbCustomerCompanyinfoResponse {
	s.ResultMsg = &v
	return s
}

type QueryRpgwSignUrlRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 企业标识，固定值
	CompanyCode *string `json:"company_code,omitempty" xml:"company_code,omitempty" require:"true"`
	// 调用方平台用户id
	PlatformUserIdentification *string `json:"platform_user_identification,omitempty" xml:"platform_user_identification,omitempty" require:"true"`
	// 手机号
	UserCode *string `json:"user_code,omitempty" xml:"user_code,omitempty" require:"true"`
}

func (s QueryRpgwSignUrlRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryRpgwSignUrlRequest) GoString() string {
	return s.String()
}

func (s *QueryRpgwSignUrlRequest) SetAuthToken(v string) *QueryRpgwSignUrlRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryRpgwSignUrlRequest) SetProductInstanceId(v string) *QueryRpgwSignUrlRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryRpgwSignUrlRequest) SetCompanyCode(v string) *QueryRpgwSignUrlRequest {
	s.CompanyCode = &v
	return s
}

func (s *QueryRpgwSignUrlRequest) SetPlatformUserIdentification(v string) *QueryRpgwSignUrlRequest {
	s.PlatformUserIdentification = &v
	return s
}

func (s *QueryRpgwSignUrlRequest) SetUserCode(v string) *QueryRpgwSignUrlRequest {
	s.UserCode = &v
	return s
}

type QueryRpgwSignUrlResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 签约地址
	ResultData *string `json:"result_data,omitempty" xml:"result_data,omitempty"`
}

func (s QueryRpgwSignUrlResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryRpgwSignUrlResponse) GoString() string {
	return s.String()
}

func (s *QueryRpgwSignUrlResponse) SetReqMsgId(v string) *QueryRpgwSignUrlResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryRpgwSignUrlResponse) SetResultCode(v string) *QueryRpgwSignUrlResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryRpgwSignUrlResponse) SetResultMsg(v string) *QueryRpgwSignUrlResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryRpgwSignUrlResponse) SetResultData(v string) *QueryRpgwSignUrlResponse {
	s.ResultData = &v
	return s
}

type RegisterRpgwUserEinvoiceRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 企业标识，固定值
	CompanyCode *string `json:"company_code,omitempty" xml:"company_code,omitempty" require:"true"`
	// 调用方平台用户id
	PlatformUserIdentification *string `json:"platform_user_identification,omitempty" xml:"platform_user_identification,omitempty" require:"true"`
	// 身份证号码
	IdentificationNumber *string `json:"identification_number,omitempty" xml:"identification_number,omitempty" require:"true"`
	// 用户手机号
	MobilePhone *string `json:"mobile_phone,omitempty" xml:"mobile_phone,omitempty" require:"true"`
	// 用户姓名
	UserName *string `json:"user_name,omitempty" xml:"user_name,omitempty" require:"true"`
	// 身份证照片人像面照片url
	IdentityFrontPic *string `json:"identity_front_pic,omitempty" xml:"identity_front_pic,omitempty" require:"true"`
	// 身份证照片国徽面url
	IdentityBackPic *string `json:"identity_back_pic,omitempty" xml:"identity_back_pic,omitempty" require:"true"`
	// 身份证有效期开始时间，格式yyyy-MM-dd
	IdcardValidityStart *string `json:"idcard_validity_start,omitempty" xml:"idcard_validity_start,omitempty" require:"true"`
	// 身份证有效期结束时间，格式yyyy-MM-dd
	IdcardValidityEnd *string `json:"idcard_validity_end,omitempty" xml:"idcard_validity_end,omitempty" require:"true"`
	// 实名认证时间，格式yyyy-MM-dd HH:mm:ss
	IdentityTime *string `json:"identity_time,omitempty" xml:"identity_time,omitempty" require:"true"`
	// 注册模式，固定值
	RegisterMode *string `json:"register_mode,omitempty" xml:"register_mode,omitempty" require:"true"`
	// 注册时间，格式yyyy-MM-dd HH:mm:ss
	RegisterTime *string `json:"register_time,omitempty" xml:"register_time,omitempty" require:"true"`
	// 用户人脸照片url
	FacePic *string `json:"face_pic,omitempty" xml:"face_pic,omitempty"`
	// 支付宝账号，实名认证的支付宝登录邮箱或手机登录，其账户姓名好和实人认证姓名一致
	AlipayAccount *string `json:"alipay_account,omitempty" xml:"alipay_account,omitempty"`
	// 微信支付个人账户（openid）
	WxpayAccount *string `json:"wxpay_account,omitempty" xml:"wxpay_account,omitempty"`
	// 银行卡号，标准一类或二类卡格式，持卡人为本用户
	BankcardNo *string `json:"bankcard_no,omitempty" xml:"bankcard_no,omitempty"`
	// 开户行名称
	BankName *string `json:"bank_name,omitempty" xml:"bank_name,omitempty"`
	// 开户行归属地省市
	BankcardCity *string `json:"bankcard_city,omitempty" xml:"bankcard_city,omitempty"`
	// 用户所在省市
	City *string `json:"city,omitempty" xml:"city,omitempty"`
	// 拓展信息
	ExtJson *string `json:"ext_json,omitempty" xml:"ext_json,omitempty"`
}

func (s RegisterRpgwUserEinvoiceRequest) String() string {
	return tea.Prettify(s)
}

func (s RegisterRpgwUserEinvoiceRequest) GoString() string {
	return s.String()
}

func (s *RegisterRpgwUserEinvoiceRequest) SetAuthToken(v string) *RegisterRpgwUserEinvoiceRequest {
	s.AuthToken = &v
	return s
}

func (s *RegisterRpgwUserEinvoiceRequest) SetProductInstanceId(v string) *RegisterRpgwUserEinvoiceRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *RegisterRpgwUserEinvoiceRequest) SetCompanyCode(v string) *RegisterRpgwUserEinvoiceRequest {
	s.CompanyCode = &v
	return s
}

func (s *RegisterRpgwUserEinvoiceRequest) SetPlatformUserIdentification(v string) *RegisterRpgwUserEinvoiceRequest {
	s.PlatformUserIdentification = &v
	return s
}

func (s *RegisterRpgwUserEinvoiceRequest) SetIdentificationNumber(v string) *RegisterRpgwUserEinvoiceRequest {
	s.IdentificationNumber = &v
	return s
}

func (s *RegisterRpgwUserEinvoiceRequest) SetMobilePhone(v string) *RegisterRpgwUserEinvoiceRequest {
	s.MobilePhone = &v
	return s
}

func (s *RegisterRpgwUserEinvoiceRequest) SetUserName(v string) *RegisterRpgwUserEinvoiceRequest {
	s.UserName = &v
	return s
}

func (s *RegisterRpgwUserEinvoiceRequest) SetIdentityFrontPic(v string) *RegisterRpgwUserEinvoiceRequest {
	s.IdentityFrontPic = &v
	return s
}

func (s *RegisterRpgwUserEinvoiceRequest) SetIdentityBackPic(v string) *RegisterRpgwUserEinvoiceRequest {
	s.IdentityBackPic = &v
	return s
}

func (s *RegisterRpgwUserEinvoiceRequest) SetIdcardValidityStart(v string) *RegisterRpgwUserEinvoiceRequest {
	s.IdcardValidityStart = &v
	return s
}

func (s *RegisterRpgwUserEinvoiceRequest) SetIdcardValidityEnd(v string) *RegisterRpgwUserEinvoiceRequest {
	s.IdcardValidityEnd = &v
	return s
}

func (s *RegisterRpgwUserEinvoiceRequest) SetIdentityTime(v string) *RegisterRpgwUserEinvoiceRequest {
	s.IdentityTime = &v
	return s
}

func (s *RegisterRpgwUserEinvoiceRequest) SetRegisterMode(v string) *RegisterRpgwUserEinvoiceRequest {
	s.RegisterMode = &v
	return s
}

func (s *RegisterRpgwUserEinvoiceRequest) SetRegisterTime(v string) *RegisterRpgwUserEinvoiceRequest {
	s.RegisterTime = &v
	return s
}

func (s *RegisterRpgwUserEinvoiceRequest) SetFacePic(v string) *RegisterRpgwUserEinvoiceRequest {
	s.FacePic = &v
	return s
}

func (s *RegisterRpgwUserEinvoiceRequest) SetAlipayAccount(v string) *RegisterRpgwUserEinvoiceRequest {
	s.AlipayAccount = &v
	return s
}

func (s *RegisterRpgwUserEinvoiceRequest) SetWxpayAccount(v string) *RegisterRpgwUserEinvoiceRequest {
	s.WxpayAccount = &v
	return s
}

func (s *RegisterRpgwUserEinvoiceRequest) SetBankcardNo(v string) *RegisterRpgwUserEinvoiceRequest {
	s.BankcardNo = &v
	return s
}

func (s *RegisterRpgwUserEinvoiceRequest) SetBankName(v string) *RegisterRpgwUserEinvoiceRequest {
	s.BankName = &v
	return s
}

func (s *RegisterRpgwUserEinvoiceRequest) SetBankcardCity(v string) *RegisterRpgwUserEinvoiceRequest {
	s.BankcardCity = &v
	return s
}

func (s *RegisterRpgwUserEinvoiceRequest) SetCity(v string) *RegisterRpgwUserEinvoiceRequest {
	s.City = &v
	return s
}

func (s *RegisterRpgwUserEinvoiceRequest) SetExtJson(v string) *RegisterRpgwUserEinvoiceRequest {
	s.ExtJson = &v
	return s
}

type RegisterRpgwUserEinvoiceResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 用户在我方的id
	ResultData *string `json:"result_data,omitempty" xml:"result_data,omitempty"`
}

func (s RegisterRpgwUserEinvoiceResponse) String() string {
	return tea.Prettify(s)
}

func (s RegisterRpgwUserEinvoiceResponse) GoString() string {
	return s.String()
}

func (s *RegisterRpgwUserEinvoiceResponse) SetReqMsgId(v string) *RegisterRpgwUserEinvoiceResponse {
	s.ReqMsgId = &v
	return s
}

func (s *RegisterRpgwUserEinvoiceResponse) SetResultCode(v string) *RegisterRpgwUserEinvoiceResponse {
	s.ResultCode = &v
	return s
}

func (s *RegisterRpgwUserEinvoiceResponse) SetResultMsg(v string) *RegisterRpgwUserEinvoiceResponse {
	s.ResultMsg = &v
	return s
}

func (s *RegisterRpgwUserEinvoiceResponse) SetResultData(v string) *RegisterRpgwUserEinvoiceResponse {
	s.ResultData = &v
	return s
}

type QueryRpgwUserSignurlRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 企业标识，固定值
	CompanyCode *string `json:"company_code,omitempty" xml:"company_code,omitempty" require:"true"`
	// 调用方平台用户id
	PlatformUserIdentification *string `json:"platform_user_identification,omitempty" xml:"platform_user_identification,omitempty" require:"true"`
	// 手机号
	UserCode *string `json:"user_code,omitempty" xml:"user_code,omitempty" require:"true"`
}

func (s QueryRpgwUserSignurlRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryRpgwUserSignurlRequest) GoString() string {
	return s.String()
}

func (s *QueryRpgwUserSignurlRequest) SetAuthToken(v string) *QueryRpgwUserSignurlRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryRpgwUserSignurlRequest) SetProductInstanceId(v string) *QueryRpgwUserSignurlRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryRpgwUserSignurlRequest) SetCompanyCode(v string) *QueryRpgwUserSignurlRequest {
	s.CompanyCode = &v
	return s
}

func (s *QueryRpgwUserSignurlRequest) SetPlatformUserIdentification(v string) *QueryRpgwUserSignurlRequest {
	s.PlatformUserIdentification = &v
	return s
}

func (s *QueryRpgwUserSignurlRequest) SetUserCode(v string) *QueryRpgwUserSignurlRequest {
	s.UserCode = &v
	return s
}

type QueryRpgwUserSignurlResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 签约地址
	ResultData *string `json:"result_data,omitempty" xml:"result_data,omitempty"`
}

func (s QueryRpgwUserSignurlResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryRpgwUserSignurlResponse) GoString() string {
	return s.String()
}

func (s *QueryRpgwUserSignurlResponse) SetReqMsgId(v string) *QueryRpgwUserSignurlResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryRpgwUserSignurlResponse) SetResultCode(v string) *QueryRpgwUserSignurlResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryRpgwUserSignurlResponse) SetResultMsg(v string) *QueryRpgwUserSignurlResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryRpgwUserSignurlResponse) SetResultData(v string) *QueryRpgwUserSignurlResponse {
	s.ResultData = &v
	return s
}

type WithdrawRpgwUserCommissionRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 提现业务单号
	OrderNumber *string `json:"order_number,omitempty" xml:"order_number,omitempty" require:"true"`
	// 任务单号
	UserOrderNumbers *string `json:"user_order_numbers,omitempty" xml:"user_order_numbers,omitempty" require:"true"`
	// 提现人id
	WithdrawerId *string `json:"withdrawer_id,omitempty" xml:"withdrawer_id,omitempty" require:"true"`
	// 提现人支付宝id
	WithdrawerAlipayId *string `json:"withdrawer_alipay_id,omitempty" xml:"withdrawer_alipay_id,omitempty" require:"true"`
	// 提现人姓名
	WithdrawerName *string `json:"withdrawer_name,omitempty" xml:"withdrawer_name,omitempty" require:"true"`
	// 提现人手机
	WithdrawerPhoneNumber *string `json:"withdrawer_phone_number,omitempty" xml:"withdrawer_phone_number,omitempty"`
	// 提现人身份证
	WithdrawerIdNumber *string `json:"withdrawer_id_number,omitempty" xml:"withdrawer_id_number,omitempty" require:"true"`
	// 提现金额
	WithdrawAmount *string `json:"withdraw_amount,omitempty" xml:"withdraw_amount,omitempty" require:"true"`
	// 提现附言
	OrderTitle *string `json:"order_title,omitempty" xml:"order_title,omitempty" require:"true"`
	// 业务备注
	Remark *string `json:"remark,omitempty" xml:"remark,omitempty" require:"true"`
}

func (s WithdrawRpgwUserCommissionRequest) String() string {
	return tea.Prettify(s)
}

func (s WithdrawRpgwUserCommissionRequest) GoString() string {
	return s.String()
}

func (s *WithdrawRpgwUserCommissionRequest) SetAuthToken(v string) *WithdrawRpgwUserCommissionRequest {
	s.AuthToken = &v
	return s
}

func (s *WithdrawRpgwUserCommissionRequest) SetProductInstanceId(v string) *WithdrawRpgwUserCommissionRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *WithdrawRpgwUserCommissionRequest) SetOrderNumber(v string) *WithdrawRpgwUserCommissionRequest {
	s.OrderNumber = &v
	return s
}

func (s *WithdrawRpgwUserCommissionRequest) SetUserOrderNumbers(v string) *WithdrawRpgwUserCommissionRequest {
	s.UserOrderNumbers = &v
	return s
}

func (s *WithdrawRpgwUserCommissionRequest) SetWithdrawerId(v string) *WithdrawRpgwUserCommissionRequest {
	s.WithdrawerId = &v
	return s
}

func (s *WithdrawRpgwUserCommissionRequest) SetWithdrawerAlipayId(v string) *WithdrawRpgwUserCommissionRequest {
	s.WithdrawerAlipayId = &v
	return s
}

func (s *WithdrawRpgwUserCommissionRequest) SetWithdrawerName(v string) *WithdrawRpgwUserCommissionRequest {
	s.WithdrawerName = &v
	return s
}

func (s *WithdrawRpgwUserCommissionRequest) SetWithdrawerPhoneNumber(v string) *WithdrawRpgwUserCommissionRequest {
	s.WithdrawerPhoneNumber = &v
	return s
}

func (s *WithdrawRpgwUserCommissionRequest) SetWithdrawerIdNumber(v string) *WithdrawRpgwUserCommissionRequest {
	s.WithdrawerIdNumber = &v
	return s
}

func (s *WithdrawRpgwUserCommissionRequest) SetWithdrawAmount(v string) *WithdrawRpgwUserCommissionRequest {
	s.WithdrawAmount = &v
	return s
}

func (s *WithdrawRpgwUserCommissionRequest) SetOrderTitle(v string) *WithdrawRpgwUserCommissionRequest {
	s.OrderTitle = &v
	return s
}

func (s *WithdrawRpgwUserCommissionRequest) SetRemark(v string) *WithdrawRpgwUserCommissionRequest {
	s.Remark = &v
	return s
}

type WithdrawRpgwUserCommissionResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 提现结果
	ResultData *string `json:"result_data,omitempty" xml:"result_data,omitempty"`
}

func (s WithdrawRpgwUserCommissionResponse) String() string {
	return tea.Prettify(s)
}

func (s WithdrawRpgwUserCommissionResponse) GoString() string {
	return s.String()
}

func (s *WithdrawRpgwUserCommissionResponse) SetReqMsgId(v string) *WithdrawRpgwUserCommissionResponse {
	s.ReqMsgId = &v
	return s
}

func (s *WithdrawRpgwUserCommissionResponse) SetResultCode(v string) *WithdrawRpgwUserCommissionResponse {
	s.ResultCode = &v
	return s
}

func (s *WithdrawRpgwUserCommissionResponse) SetResultMsg(v string) *WithdrawRpgwUserCommissionResponse {
	s.ResultMsg = &v
	return s
}

func (s *WithdrawRpgwUserCommissionResponse) SetResultData(v string) *WithdrawRpgwUserCommissionResponse {
	s.ResultData = &v
	return s
}

type SyncRpgwUserOrderinfoRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 订单号
	OrderNumber *string `json:"order_number,omitempty" xml:"order_number,omitempty" require:"true"`
	// REGISTER与PURCHASE二选一
	OrderType *string `json:"order_type,omitempty" xml:"order_type,omitempty" require:"true"`
	// 注册/下单总佣金
	OrderAmount *string `json:"order_amount,omitempty" xml:"order_amount,omitempty" require:"true"`
	// 时间，格式为yyyy-MM-dd HH:mm:ss
	OrderTime *string `json:"order_time,omitempty" xml:"order_time,omitempty" require:"true"`
	// 邀请人id
	InviterId *string `json:"inviter_id,omitempty" xml:"inviter_id,omitempty" require:"true"`
	// 邀请人姓名
	InviterName *string `json:"inviter_name,omitempty" xml:"inviter_name,omitempty" require:"true"`
	// 邀请人手机号
	InviterPhoneNumber *string `json:"inviter_phone_number,omitempty" xml:"inviter_phone_number,omitempty" require:"true"`
	// 邀请人身份证号
	InviterIdNumber *string `json:"inviter_id_number,omitempty" xml:"inviter_id_number,omitempty" require:"true"`
	// 邀请码
	InvitationCode *string `json:"invitation_code,omitempty" xml:"invitation_code,omitempty"`
	// 被邀请人id
	InviteeId *string `json:"invitee_id,omitempty" xml:"invitee_id,omitempty" require:"true"`
	// 被邀请人姓名
	InviteeName *string `json:"invitee_name,omitempty" xml:"invitee_name,omitempty"`
	// 被邀请人手机号
	InviteePhoneNumber *string `json:"invitee_phone_number,omitempty" xml:"invitee_phone_number,omitempty" require:"true"`
	// 被邀请人身份证
	InviteeIdNumber *string `json:"invitee_id_number,omitempty" xml:"invitee_id_number,omitempty"`
}

func (s SyncRpgwUserOrderinfoRequest) String() string {
	return tea.Prettify(s)
}

func (s SyncRpgwUserOrderinfoRequest) GoString() string {
	return s.String()
}

func (s *SyncRpgwUserOrderinfoRequest) SetAuthToken(v string) *SyncRpgwUserOrderinfoRequest {
	s.AuthToken = &v
	return s
}

func (s *SyncRpgwUserOrderinfoRequest) SetProductInstanceId(v string) *SyncRpgwUserOrderinfoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SyncRpgwUserOrderinfoRequest) SetOrderNumber(v string) *SyncRpgwUserOrderinfoRequest {
	s.OrderNumber = &v
	return s
}

func (s *SyncRpgwUserOrderinfoRequest) SetOrderType(v string) *SyncRpgwUserOrderinfoRequest {
	s.OrderType = &v
	return s
}

func (s *SyncRpgwUserOrderinfoRequest) SetOrderAmount(v string) *SyncRpgwUserOrderinfoRequest {
	s.OrderAmount = &v
	return s
}

func (s *SyncRpgwUserOrderinfoRequest) SetOrderTime(v string) *SyncRpgwUserOrderinfoRequest {
	s.OrderTime = &v
	return s
}

func (s *SyncRpgwUserOrderinfoRequest) SetInviterId(v string) *SyncRpgwUserOrderinfoRequest {
	s.InviterId = &v
	return s
}

func (s *SyncRpgwUserOrderinfoRequest) SetInviterName(v string) *SyncRpgwUserOrderinfoRequest {
	s.InviterName = &v
	return s
}

func (s *SyncRpgwUserOrderinfoRequest) SetInviterPhoneNumber(v string) *SyncRpgwUserOrderinfoRequest {
	s.InviterPhoneNumber = &v
	return s
}

func (s *SyncRpgwUserOrderinfoRequest) SetInviterIdNumber(v string) *SyncRpgwUserOrderinfoRequest {
	s.InviterIdNumber = &v
	return s
}

func (s *SyncRpgwUserOrderinfoRequest) SetInvitationCode(v string) *SyncRpgwUserOrderinfoRequest {
	s.InvitationCode = &v
	return s
}

func (s *SyncRpgwUserOrderinfoRequest) SetInviteeId(v string) *SyncRpgwUserOrderinfoRequest {
	s.InviteeId = &v
	return s
}

func (s *SyncRpgwUserOrderinfoRequest) SetInviteeName(v string) *SyncRpgwUserOrderinfoRequest {
	s.InviteeName = &v
	return s
}

func (s *SyncRpgwUserOrderinfoRequest) SetInviteePhoneNumber(v string) *SyncRpgwUserOrderinfoRequest {
	s.InviteePhoneNumber = &v
	return s
}

func (s *SyncRpgwUserOrderinfoRequest) SetInviteeIdNumber(v string) *SyncRpgwUserOrderinfoRequest {
	s.InviteeIdNumber = &v
	return s
}

type SyncRpgwUserOrderinfoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 同步结果
	ResultData *string `json:"result_data,omitempty" xml:"result_data,omitempty"`
}

func (s SyncRpgwUserOrderinfoResponse) String() string {
	return tea.Prettify(s)
}

func (s SyncRpgwUserOrderinfoResponse) GoString() string {
	return s.String()
}

func (s *SyncRpgwUserOrderinfoResponse) SetReqMsgId(v string) *SyncRpgwUserOrderinfoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SyncRpgwUserOrderinfoResponse) SetResultCode(v string) *SyncRpgwUserOrderinfoResponse {
	s.ResultCode = &v
	return s
}

func (s *SyncRpgwUserOrderinfoResponse) SetResultMsg(v string) *SyncRpgwUserOrderinfoResponse {
	s.ResultMsg = &v
	return s
}

func (s *SyncRpgwUserOrderinfoResponse) SetResultData(v string) *SyncRpgwUserOrderinfoResponse {
	s.ResultData = &v
	return s
}

type NotifyRpgwUserSignresultRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 调用方平台用户id
	PlatformUserIdentification *string `json:"platform_user_identification,omitempty" xml:"platform_user_identification,omitempty" require:"true"`
	// 用户手机号
	UserCode *string `json:"user_code,omitempty" xml:"user_code,omitempty" require:"true"`
	// 签约结果，1成功，0失败
	SignResult *string `json:"sign_result,omitempty" xml:"sign_result,omitempty" require:"true"`
	// 失败原因描述
	ResultDesc *string `json:"result_desc,omitempty" xml:"result_desc,omitempty"`
}

func (s NotifyRpgwUserSignresultRequest) String() string {
	return tea.Prettify(s)
}

func (s NotifyRpgwUserSignresultRequest) GoString() string {
	return s.String()
}

func (s *NotifyRpgwUserSignresultRequest) SetAuthToken(v string) *NotifyRpgwUserSignresultRequest {
	s.AuthToken = &v
	return s
}

func (s *NotifyRpgwUserSignresultRequest) SetProductInstanceId(v string) *NotifyRpgwUserSignresultRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *NotifyRpgwUserSignresultRequest) SetPlatformUserIdentification(v string) *NotifyRpgwUserSignresultRequest {
	s.PlatformUserIdentification = &v
	return s
}

func (s *NotifyRpgwUserSignresultRequest) SetUserCode(v string) *NotifyRpgwUserSignresultRequest {
	s.UserCode = &v
	return s
}

func (s *NotifyRpgwUserSignresultRequest) SetSignResult(v string) *NotifyRpgwUserSignresultRequest {
	s.SignResult = &v
	return s
}

func (s *NotifyRpgwUserSignresultRequest) SetResultDesc(v string) *NotifyRpgwUserSignresultRequest {
	s.ResultDesc = &v
	return s
}

type NotifyRpgwUserSignresultResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 通知结果
	ResultData *string `json:"result_data,omitempty" xml:"result_data,omitempty"`
}

func (s NotifyRpgwUserSignresultResponse) String() string {
	return tea.Prettify(s)
}

func (s NotifyRpgwUserSignresultResponse) GoString() string {
	return s.String()
}

func (s *NotifyRpgwUserSignresultResponse) SetReqMsgId(v string) *NotifyRpgwUserSignresultResponse {
	s.ReqMsgId = &v
	return s
}

func (s *NotifyRpgwUserSignresultResponse) SetResultCode(v string) *NotifyRpgwUserSignresultResponse {
	s.ResultCode = &v
	return s
}

func (s *NotifyRpgwUserSignresultResponse) SetResultMsg(v string) *NotifyRpgwUserSignresultResponse {
	s.ResultMsg = &v
	return s
}

func (s *NotifyRpgwUserSignresultResponse) SetResultData(v string) *NotifyRpgwUserSignresultResponse {
	s.ResultData = &v
	return s
}

type QueryRtopCompanyOpinionRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 结束时间
	EndTime *string `json:"end_time,omitempty" xml:"end_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 页码
	PageNum *int64 `json:"page_num,omitempty" xml:"page_num,omitempty" require:"true"`
	// 一页的数量
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
	// 所在地的名称
	PlaceName *string `json:"place_name,omitempty" xml:"place_name,omitempty" require:"true"`
	// 地区类型
	PlaceType *string `json:"place_type,omitempty" xml:"place_type,omitempty" require:"true"`
	// 开始时间
	StartTime *string `json:"start_time,omitempty" xml:"start_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
}

func (s QueryRtopCompanyOpinionRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryRtopCompanyOpinionRequest) GoString() string {
	return s.String()
}

func (s *QueryRtopCompanyOpinionRequest) SetAuthToken(v string) *QueryRtopCompanyOpinionRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryRtopCompanyOpinionRequest) SetProductInstanceId(v string) *QueryRtopCompanyOpinionRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryRtopCompanyOpinionRequest) SetEndTime(v string) *QueryRtopCompanyOpinionRequest {
	s.EndTime = &v
	return s
}

func (s *QueryRtopCompanyOpinionRequest) SetPageNum(v int64) *QueryRtopCompanyOpinionRequest {
	s.PageNum = &v
	return s
}

func (s *QueryRtopCompanyOpinionRequest) SetPageSize(v int64) *QueryRtopCompanyOpinionRequest {
	s.PageSize = &v
	return s
}

func (s *QueryRtopCompanyOpinionRequest) SetPlaceName(v string) *QueryRtopCompanyOpinionRequest {
	s.PlaceName = &v
	return s
}

func (s *QueryRtopCompanyOpinionRequest) SetPlaceType(v string) *QueryRtopCompanyOpinionRequest {
	s.PlaceType = &v
	return s
}

func (s *QueryRtopCompanyOpinionRequest) SetStartTime(v string) *QueryRtopCompanyOpinionRequest {
	s.StartTime = &v
	return s
}

type QueryRtopCompanyOpinionResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg           *string                    `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	CompanyOpinionCount []*RtopCompanyOpinionCount `json:"company_opinion_count,omitempty" xml:"company_opinion_count,omitempty" require:"true" type:"Repeated"`
	// 页码
	PageNum *int64 `json:"page_num,omitempty" xml:"page_num,omitempty" require:"true"`
	// 一页的数量
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
	// 总的记录数
	TotalCount *int64 `json:"total_count,omitempty" xml:"total_count,omitempty" require:"true"`
}

func (s QueryRtopCompanyOpinionResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryRtopCompanyOpinionResponse) GoString() string {
	return s.String()
}

func (s *QueryRtopCompanyOpinionResponse) SetReqMsgId(v string) *QueryRtopCompanyOpinionResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryRtopCompanyOpinionResponse) SetResultCode(v string) *QueryRtopCompanyOpinionResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryRtopCompanyOpinionResponse) SetResultMsg(v string) *QueryRtopCompanyOpinionResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryRtopCompanyOpinionResponse) SetCompanyOpinionCount(v []*RtopCompanyOpinionCount) *QueryRtopCompanyOpinionResponse {
	s.CompanyOpinionCount = v
	return s
}

func (s *QueryRtopCompanyOpinionResponse) SetPageNum(v int64) *QueryRtopCompanyOpinionResponse {
	s.PageNum = &v
	return s
}

func (s *QueryRtopCompanyOpinionResponse) SetPageSize(v int64) *QueryRtopCompanyOpinionResponse {
	s.PageSize = &v
	return s
}

func (s *QueryRtopCompanyOpinionResponse) SetTotalCount(v int64) *QueryRtopCompanyOpinionResponse {
	s.TotalCount = &v
	return s
}

type ListRtopCompanyOpinionsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 地区类型
	CompanyName *string `json:"company_name,omitempty" xml:"company_name,omitempty" require:"true"`
	// 页码
	PageNum *int64 `json:"page_num,omitempty" xml:"page_num,omitempty" require:"true"`
	// 一页的数量
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
}

func (s ListRtopCompanyOpinionsRequest) String() string {
	return tea.Prettify(s)
}

func (s ListRtopCompanyOpinionsRequest) GoString() string {
	return s.String()
}

func (s *ListRtopCompanyOpinionsRequest) SetAuthToken(v string) *ListRtopCompanyOpinionsRequest {
	s.AuthToken = &v
	return s
}

func (s *ListRtopCompanyOpinionsRequest) SetProductInstanceId(v string) *ListRtopCompanyOpinionsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListRtopCompanyOpinionsRequest) SetCompanyName(v string) *ListRtopCompanyOpinionsRequest {
	s.CompanyName = &v
	return s
}

func (s *ListRtopCompanyOpinionsRequest) SetPageNum(v int64) *ListRtopCompanyOpinionsRequest {
	s.PageNum = &v
	return s
}

func (s *ListRtopCompanyOpinionsRequest) SetPageSize(v int64) *ListRtopCompanyOpinionsRequest {
	s.PageSize = &v
	return s
}

type ListRtopCompanyOpinionsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg             *string                     `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	CompanyOpinionDetails []*RtopCompanyOpinionDetail `json:"company_opinion_details,omitempty" xml:"company_opinion_details,omitempty" require:"true" type:"Repeated"`
	// 页码
	PageNum *int64 `json:"page_num,omitempty" xml:"page_num,omitempty" require:"true"`
	// 一页的数量
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
	// 总的记录数
	TotalCount *int64 `json:"total_count,omitempty" xml:"total_count,omitempty" require:"true"`
}

func (s ListRtopCompanyOpinionsResponse) String() string {
	return tea.Prettify(s)
}

func (s ListRtopCompanyOpinionsResponse) GoString() string {
	return s.String()
}

func (s *ListRtopCompanyOpinionsResponse) SetReqMsgId(v string) *ListRtopCompanyOpinionsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListRtopCompanyOpinionsResponse) SetResultCode(v string) *ListRtopCompanyOpinionsResponse {
	s.ResultCode = &v
	return s
}

func (s *ListRtopCompanyOpinionsResponse) SetResultMsg(v string) *ListRtopCompanyOpinionsResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListRtopCompanyOpinionsResponse) SetCompanyOpinionDetails(v []*RtopCompanyOpinionDetail) *ListRtopCompanyOpinionsResponse {
	s.CompanyOpinionDetails = v
	return s
}

func (s *ListRtopCompanyOpinionsResponse) SetPageNum(v int64) *ListRtopCompanyOpinionsResponse {
	s.PageNum = &v
	return s
}

func (s *ListRtopCompanyOpinionsResponse) SetPageSize(v int64) *ListRtopCompanyOpinionsResponse {
	s.PageSize = &v
	return s
}

func (s *ListRtopCompanyOpinionsResponse) SetTotalCount(v int64) *ListRtopCompanyOpinionsResponse {
	s.TotalCount = &v
	return s
}

type GetRtopCompanyMonitorRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 地区类型
	CompanyName *string `json:"company_name,omitempty" xml:"company_name,omitempty" require:"true"`
}

func (s GetRtopCompanyMonitorRequest) String() string {
	return tea.Prettify(s)
}

func (s GetRtopCompanyMonitorRequest) GoString() string {
	return s.String()
}

func (s *GetRtopCompanyMonitorRequest) SetAuthToken(v string) *GetRtopCompanyMonitorRequest {
	s.AuthToken = &v
	return s
}

func (s *GetRtopCompanyMonitorRequest) SetProductInstanceId(v string) *GetRtopCompanyMonitorRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetRtopCompanyMonitorRequest) SetCompanyName(v string) *GetRtopCompanyMonitorRequest {
	s.CompanyName = &v
	return s
}

type GetRtopCompanyMonitorResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 活跃市，不带国家和地区的代码
	ActiveCity *string `json:"active_city,omitempty" xml:"active_city,omitempty" require:"true"`
	// 监测企业的行业
	CompanyCategory *string `json:"company_category,omitempty" xml:"company_category,omitempty"`
	// 涉众风险类型
	CrowdRiskType *string                      `json:"crowd_risk_type,omitempty" xml:"crowd_risk_type,omitempty" require:"true"`
	Features      []*RtopMonitorCompanyFeature `json:"features,omitempty" xml:"features,omitempty" require:"true" type:"Repeated"`
	// 影响金额
	MoneyInvolved   *int64    `json:"money_involved,omitempty" xml:"money_involved,omitempty" require:"true"`
	MonitorRiskTags []*string `json:"monitor_risk_tags,omitempty" xml:"monitor_risk_tags,omitempty" require:"true" type:"Repeated"`
	// 监测企业的评分
	MonitorScore *int64 `json:"monitor_score,omitempty" xml:"monitor_score,omitempty" require:"true"`
	// 影响人数
	PeopleInvolved *int64 `json:"people_involved,omitempty" xml:"people_involved,omitempty" require:"true"`
	// 注册市，不带国家和地区的代码
	RegisteredCity *string `json:"registered_city,omitempty" xml:"registered_city,omitempty" require:"true"`
}

func (s GetRtopCompanyMonitorResponse) String() string {
	return tea.Prettify(s)
}

func (s GetRtopCompanyMonitorResponse) GoString() string {
	return s.String()
}

func (s *GetRtopCompanyMonitorResponse) SetReqMsgId(v string) *GetRtopCompanyMonitorResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetRtopCompanyMonitorResponse) SetResultCode(v string) *GetRtopCompanyMonitorResponse {
	s.ResultCode = &v
	return s
}

func (s *GetRtopCompanyMonitorResponse) SetResultMsg(v string) *GetRtopCompanyMonitorResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetRtopCompanyMonitorResponse) SetActiveCity(v string) *GetRtopCompanyMonitorResponse {
	s.ActiveCity = &v
	return s
}

func (s *GetRtopCompanyMonitorResponse) SetCompanyCategory(v string) *GetRtopCompanyMonitorResponse {
	s.CompanyCategory = &v
	return s
}

func (s *GetRtopCompanyMonitorResponse) SetCrowdRiskType(v string) *GetRtopCompanyMonitorResponse {
	s.CrowdRiskType = &v
	return s
}

func (s *GetRtopCompanyMonitorResponse) SetFeatures(v []*RtopMonitorCompanyFeature) *GetRtopCompanyMonitorResponse {
	s.Features = v
	return s
}

func (s *GetRtopCompanyMonitorResponse) SetMoneyInvolved(v int64) *GetRtopCompanyMonitorResponse {
	s.MoneyInvolved = &v
	return s
}

func (s *GetRtopCompanyMonitorResponse) SetMonitorRiskTags(v []*string) *GetRtopCompanyMonitorResponse {
	s.MonitorRiskTags = v
	return s
}

func (s *GetRtopCompanyMonitorResponse) SetMonitorScore(v int64) *GetRtopCompanyMonitorResponse {
	s.MonitorScore = &v
	return s
}

func (s *GetRtopCompanyMonitorResponse) SetPeopleInvolved(v int64) *GetRtopCompanyMonitorResponse {
	s.PeopleInvolved = &v
	return s
}

func (s *GetRtopCompanyMonitorResponse) SetRegisteredCity(v string) *GetRtopCompanyMonitorResponse {
	s.RegisteredCity = &v
	return s
}

type QueryRtopCrowdriskStatisticRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 结束时间
	EndTime *string `json:"end_time,omitempty" xml:"end_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 所在地的名称
	PlaceName *string `json:"place_name,omitempty" xml:"place_name,omitempty"`
	// 地区类型
	PlaceType *string `json:"place_type,omitempty" xml:"place_type,omitempty"`
	// 开始时间
	StartTime *string `json:"start_time,omitempty" xml:"start_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
}

func (s QueryRtopCrowdriskStatisticRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryRtopCrowdriskStatisticRequest) GoString() string {
	return s.String()
}

func (s *QueryRtopCrowdriskStatisticRequest) SetAuthToken(v string) *QueryRtopCrowdriskStatisticRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryRtopCrowdriskStatisticRequest) SetProductInstanceId(v string) *QueryRtopCrowdriskStatisticRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryRtopCrowdriskStatisticRequest) SetEndTime(v string) *QueryRtopCrowdriskStatisticRequest {
	s.EndTime = &v
	return s
}

func (s *QueryRtopCrowdriskStatisticRequest) SetPlaceName(v string) *QueryRtopCrowdriskStatisticRequest {
	s.PlaceName = &v
	return s
}

func (s *QueryRtopCrowdriskStatisticRequest) SetPlaceType(v string) *QueryRtopCrowdriskStatisticRequest {
	s.PlaceType = &v
	return s
}

func (s *QueryRtopCrowdriskStatisticRequest) SetStartTime(v string) *QueryRtopCrowdriskStatisticRequest {
	s.StartTime = &v
	return s
}

type QueryRtopCrowdriskStatisticResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg         *string                  `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	LevelDistribution []*RtopLevelDistribution `json:"level_distribution,omitempty" xml:"level_distribution,omitempty" type:"Repeated"`
	// 按地区统计
	RegionDistribution []*RtopRegionalDistribution `json:"region_distribution,omitempty" xml:"region_distribution,omitempty" type:"Repeated"`
	TypeDistribution   []*RtopTypeDistribution     `json:"type_distribution,omitempty" xml:"type_distribution,omitempty" type:"Repeated"`
}

func (s QueryRtopCrowdriskStatisticResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryRtopCrowdriskStatisticResponse) GoString() string {
	return s.String()
}

func (s *QueryRtopCrowdriskStatisticResponse) SetReqMsgId(v string) *QueryRtopCrowdriskStatisticResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryRtopCrowdriskStatisticResponse) SetResultCode(v string) *QueryRtopCrowdriskStatisticResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryRtopCrowdriskStatisticResponse) SetResultMsg(v string) *QueryRtopCrowdriskStatisticResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryRtopCrowdriskStatisticResponse) SetLevelDistribution(v []*RtopLevelDistribution) *QueryRtopCrowdriskStatisticResponse {
	s.LevelDistribution = v
	return s
}

func (s *QueryRtopCrowdriskStatisticResponse) SetRegionDistribution(v []*RtopRegionalDistribution) *QueryRtopCrowdriskStatisticResponse {
	s.RegionDistribution = v
	return s
}

func (s *QueryRtopCrowdriskStatisticResponse) SetTypeDistribution(v []*RtopTypeDistribution) *QueryRtopCrowdriskStatisticResponse {
	s.TypeDistribution = v
	return s
}

type ListRtopCrowdriskRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 活跃地筛选
	ActivePlaces []*string `json:"active_places,omitempty" xml:"active_places,omitempty" type:"Repeated"`
	// 风险等级
	CrowdRiskLevels []*string `json:"crowd_risk_levels,omitempty" xml:"crowd_risk_levels,omitempty" type:"Repeated"`
	// 风险类型
	CrowdRiskTypes []*string `json:"crowd_risk_types,omitempty" xml:"crowd_risk_types,omitempty" type:"Repeated"`
	// 结束时间
	EndTime *string `json:"end_time,omitempty" xml:"end_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 页码
	PageNum *int64 `json:"page_num,omitempty" xml:"page_num,omitempty"`
	// 每页条数
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// 所在地的名称
	PlaceName *string `json:"place_name,omitempty" xml:"place_name,omitempty"`
	// 地区类型
	PlaceType *string `json:"place_type,omitempty" xml:"place_type,omitempty"`
	// 注册地筛选
	RegPlaces []*string `json:"reg_places,omitempty" xml:"reg_places,omitempty" type:"Repeated"`
	// 排序字段
	SortBy *string `json:"sort_by,omitempty" xml:"sort_by,omitempty"`
	// 排序方式
	SortType *string `json:"sort_type,omitempty" xml:"sort_type,omitempty"`
	// 开始时间
	StartTime *string `json:"start_time,omitempty" xml:"start_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
}

func (s ListRtopCrowdriskRequest) String() string {
	return tea.Prettify(s)
}

func (s ListRtopCrowdriskRequest) GoString() string {
	return s.String()
}

func (s *ListRtopCrowdriskRequest) SetAuthToken(v string) *ListRtopCrowdriskRequest {
	s.AuthToken = &v
	return s
}

func (s *ListRtopCrowdriskRequest) SetProductInstanceId(v string) *ListRtopCrowdriskRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListRtopCrowdriskRequest) SetActivePlaces(v []*string) *ListRtopCrowdriskRequest {
	s.ActivePlaces = v
	return s
}

func (s *ListRtopCrowdriskRequest) SetCrowdRiskLevels(v []*string) *ListRtopCrowdriskRequest {
	s.CrowdRiskLevels = v
	return s
}

func (s *ListRtopCrowdriskRequest) SetCrowdRiskTypes(v []*string) *ListRtopCrowdriskRequest {
	s.CrowdRiskTypes = v
	return s
}

func (s *ListRtopCrowdriskRequest) SetEndTime(v string) *ListRtopCrowdriskRequest {
	s.EndTime = &v
	return s
}

func (s *ListRtopCrowdriskRequest) SetPageNum(v int64) *ListRtopCrowdriskRequest {
	s.PageNum = &v
	return s
}

func (s *ListRtopCrowdriskRequest) SetPageSize(v int64) *ListRtopCrowdriskRequest {
	s.PageSize = &v
	return s
}

func (s *ListRtopCrowdriskRequest) SetPlaceName(v string) *ListRtopCrowdriskRequest {
	s.PlaceName = &v
	return s
}

func (s *ListRtopCrowdriskRequest) SetPlaceType(v string) *ListRtopCrowdriskRequest {
	s.PlaceType = &v
	return s
}

func (s *ListRtopCrowdriskRequest) SetRegPlaces(v []*string) *ListRtopCrowdriskRequest {
	s.RegPlaces = v
	return s
}

func (s *ListRtopCrowdriskRequest) SetSortBy(v string) *ListRtopCrowdriskRequest {
	s.SortBy = &v
	return s
}

func (s *ListRtopCrowdriskRequest) SetSortType(v string) *ListRtopCrowdriskRequest {
	s.SortType = &v
	return s
}

func (s *ListRtopCrowdriskRequest) SetStartTime(v string) *ListRtopCrowdriskRequest {
	s.StartTime = &v
	return s
}

type ListRtopCrowdriskResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 企业列表
	Companys []*RtopCrowdRiskSummaryResp `json:"companys,omitempty" xml:"companys,omitempty" type:"Repeated"`
	// 页码
	PageNum *int64 `json:"page_num,omitempty" xml:"page_num,omitempty"`
	// 每页条数
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// 总数
	TotalCount *int64 `json:"total_count,omitempty" xml:"total_count,omitempty"`
}

func (s ListRtopCrowdriskResponse) String() string {
	return tea.Prettify(s)
}

func (s ListRtopCrowdriskResponse) GoString() string {
	return s.String()
}

func (s *ListRtopCrowdriskResponse) SetReqMsgId(v string) *ListRtopCrowdriskResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListRtopCrowdriskResponse) SetResultCode(v string) *ListRtopCrowdriskResponse {
	s.ResultCode = &v
	return s
}

func (s *ListRtopCrowdriskResponse) SetResultMsg(v string) *ListRtopCrowdriskResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListRtopCrowdriskResponse) SetCompanys(v []*RtopCrowdRiskSummaryResp) *ListRtopCrowdriskResponse {
	s.Companys = v
	return s
}

func (s *ListRtopCrowdriskResponse) SetPageNum(v int64) *ListRtopCrowdriskResponse {
	s.PageNum = &v
	return s
}

func (s *ListRtopCrowdriskResponse) SetPageSize(v int64) *ListRtopCrowdriskResponse {
	s.PageSize = &v
	return s
}

func (s *ListRtopCrowdriskResponse) SetTotalCount(v int64) *ListRtopCrowdriskResponse {
	s.TotalCount = &v
	return s
}

type QueryRtopCrowdriskDetailRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 企业ID
	CompanyId *string `json:"company_id,omitempty" xml:"company_id,omitempty"`
	// 所在地的名称
	PlaceName *string `json:"place_name,omitempty" xml:"place_name,omitempty"`
	// 地区类型
	PlaceType *string `json:"place_type,omitempty" xml:"place_type,omitempty"`
}

func (s QueryRtopCrowdriskDetailRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryRtopCrowdriskDetailRequest) GoString() string {
	return s.String()
}

func (s *QueryRtopCrowdriskDetailRequest) SetAuthToken(v string) *QueryRtopCrowdriskDetailRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryRtopCrowdriskDetailRequest) SetProductInstanceId(v string) *QueryRtopCrowdriskDetailRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryRtopCrowdriskDetailRequest) SetCompanyId(v string) *QueryRtopCrowdriskDetailRequest {
	s.CompanyId = &v
	return s
}

func (s *QueryRtopCrowdriskDetailRequest) SetPlaceName(v string) *QueryRtopCrowdriskDetailRequest {
	s.PlaceName = &v
	return s
}

func (s *QueryRtopCrowdriskDetailRequest) SetPlaceType(v string) *QueryRtopCrowdriskDetailRequest {
	s.PlaceType = &v
	return s
}

type QueryRtopCrowdriskDetailResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 活跃市
	ActiveCity *string `json:"active_city,omitempty" xml:"active_city,omitempty"`
	// 活跃县
	ActiveCounty *string `json:"active_county,omitempty" xml:"active_county,omitempty"`
	// 活跃省
	ActiveProvince *string `json:"active_province,omitempty" xml:"active_province,omitempty"`
	// 年龄分布
	AgeDistribution []*RtopAgeDistribution `json:"age_distribution,omitempty" xml:"age_distribution,omitempty" type:"Repeated"`
	// 线索标签
	ClueTags []*string `json:"clue_tags,omitempty" xml:"clue_tags,omitempty" type:"Repeated"`
	// 报文
	Conclusion *string `json:"conclusion,omitempty" xml:"conclusion,omitempty"`
	// 风险等级
	CrowdRiskLevel *string `json:"crowd_risk_level,omitempty" xml:"crowd_risk_level,omitempty"`
	// 涉众风险分析的分数
	CrowdRiskScore *int64 `json:"crowd_risk_score,omitempty" xml:"crowd_risk_score,omitempty"`
	// 风险类型
	CrowdRiskType *string `json:"crowd_risk_type,omitempty" xml:"crowd_risk_type,omitempty"`
	// 发现时间
	DetectedTime *string `json:"detected_time,omitempty" xml:"detected_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 特征
	Features []*RtopCrowdRiskFeatureResp `json:"features,omitempty" xml:"features,omitempty" type:"Repeated"`
	// 性别分布
	GenderDistribution []*RtopGenderDistribution `json:"gender_distribution,omitempty" xml:"gender_distribution,omitempty" type:"Repeated"`
	// 上次活跃时间
	LastActiveTime *string `json:"last_active_time,omitempty" xml:"last_active_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 涉案金额
	MoneyInvolved *int64 `json:"money_involved,omitempty" xml:"money_involved,omitempty"`
	// 影响金额的历史曲线
	MoneyInvolvedHistory []*RtopDateDistribution `json:"money_involved_history,omitempty" xml:"money_involved_history,omitempty" type:"Repeated"`
	// 涉案人数
	PeopleInvolved *int64 `json:"people_involved,omitempty" xml:"people_involved,omitempty"`
	// 影响人数的历史曲线
	PeopleInvolvedHistory []*RtopDateDistribution `json:"people_involved_history,omitempty" xml:"people_involved_history,omitempty" type:"Repeated"`
	// 影响的人数分布，key为地区城市，value为影响的人数
	PopulationDistribution []*RtopPopulationDistribution `json:"population_distribution,omitempty" xml:"population_distribution,omitempty" type:"Repeated"`
	// 注册市
	RegisteredCity *string `json:"registered_city,omitempty" xml:"registered_city,omitempty"`
	// 注册县
	RegisteredCounty *string `json:"registered_county,omitempty" xml:"registered_county,omitempty"`
	// 注册省
	RegisteredProvince *string `json:"registered_province,omitempty" xml:"registered_province,omitempty"`
}

func (s QueryRtopCrowdriskDetailResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryRtopCrowdriskDetailResponse) GoString() string {
	return s.String()
}

func (s *QueryRtopCrowdriskDetailResponse) SetReqMsgId(v string) *QueryRtopCrowdriskDetailResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryRtopCrowdriskDetailResponse) SetResultCode(v string) *QueryRtopCrowdriskDetailResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryRtopCrowdriskDetailResponse) SetResultMsg(v string) *QueryRtopCrowdriskDetailResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryRtopCrowdriskDetailResponse) SetActiveCity(v string) *QueryRtopCrowdriskDetailResponse {
	s.ActiveCity = &v
	return s
}

func (s *QueryRtopCrowdriskDetailResponse) SetActiveCounty(v string) *QueryRtopCrowdriskDetailResponse {
	s.ActiveCounty = &v
	return s
}

func (s *QueryRtopCrowdriskDetailResponse) SetActiveProvince(v string) *QueryRtopCrowdriskDetailResponse {
	s.ActiveProvince = &v
	return s
}

func (s *QueryRtopCrowdriskDetailResponse) SetAgeDistribution(v []*RtopAgeDistribution) *QueryRtopCrowdriskDetailResponse {
	s.AgeDistribution = v
	return s
}

func (s *QueryRtopCrowdriskDetailResponse) SetClueTags(v []*string) *QueryRtopCrowdriskDetailResponse {
	s.ClueTags = v
	return s
}

func (s *QueryRtopCrowdriskDetailResponse) SetConclusion(v string) *QueryRtopCrowdriskDetailResponse {
	s.Conclusion = &v
	return s
}

func (s *QueryRtopCrowdriskDetailResponse) SetCrowdRiskLevel(v string) *QueryRtopCrowdriskDetailResponse {
	s.CrowdRiskLevel = &v
	return s
}

func (s *QueryRtopCrowdriskDetailResponse) SetCrowdRiskScore(v int64) *QueryRtopCrowdriskDetailResponse {
	s.CrowdRiskScore = &v
	return s
}

func (s *QueryRtopCrowdriskDetailResponse) SetCrowdRiskType(v string) *QueryRtopCrowdriskDetailResponse {
	s.CrowdRiskType = &v
	return s
}

func (s *QueryRtopCrowdriskDetailResponse) SetDetectedTime(v string) *QueryRtopCrowdriskDetailResponse {
	s.DetectedTime = &v
	return s
}

func (s *QueryRtopCrowdriskDetailResponse) SetFeatures(v []*RtopCrowdRiskFeatureResp) *QueryRtopCrowdriskDetailResponse {
	s.Features = v
	return s
}

func (s *QueryRtopCrowdriskDetailResponse) SetGenderDistribution(v []*RtopGenderDistribution) *QueryRtopCrowdriskDetailResponse {
	s.GenderDistribution = v
	return s
}

func (s *QueryRtopCrowdriskDetailResponse) SetLastActiveTime(v string) *QueryRtopCrowdriskDetailResponse {
	s.LastActiveTime = &v
	return s
}

func (s *QueryRtopCrowdriskDetailResponse) SetMoneyInvolved(v int64) *QueryRtopCrowdriskDetailResponse {
	s.MoneyInvolved = &v
	return s
}

func (s *QueryRtopCrowdriskDetailResponse) SetMoneyInvolvedHistory(v []*RtopDateDistribution) *QueryRtopCrowdriskDetailResponse {
	s.MoneyInvolvedHistory = v
	return s
}

func (s *QueryRtopCrowdriskDetailResponse) SetPeopleInvolved(v int64) *QueryRtopCrowdriskDetailResponse {
	s.PeopleInvolved = &v
	return s
}

func (s *QueryRtopCrowdriskDetailResponse) SetPeopleInvolvedHistory(v []*RtopDateDistribution) *QueryRtopCrowdriskDetailResponse {
	s.PeopleInvolvedHistory = v
	return s
}

func (s *QueryRtopCrowdriskDetailResponse) SetPopulationDistribution(v []*RtopPopulationDistribution) *QueryRtopCrowdriskDetailResponse {
	s.PopulationDistribution = v
	return s
}

func (s *QueryRtopCrowdriskDetailResponse) SetRegisteredCity(v string) *QueryRtopCrowdriskDetailResponse {
	s.RegisteredCity = &v
	return s
}

func (s *QueryRtopCrowdriskDetailResponse) SetRegisteredCounty(v string) *QueryRtopCrowdriskDetailResponse {
	s.RegisteredCounty = &v
	return s
}

func (s *QueryRtopCrowdriskDetailResponse) SetRegisteredProvince(v string) *QueryRtopCrowdriskDetailResponse {
	s.RegisteredProvince = &v
	return s
}

type QueryRtopRiskstormRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 企业ID
	CompanyId *string `json:"company_id,omitempty" xml:"company_id,omitempty"`
	// 数据类型
	Type *string `json:"type,omitempty" xml:"type,omitempty"`
}

func (s QueryRtopRiskstormRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryRtopRiskstormRequest) GoString() string {
	return s.String()
}

func (s *QueryRtopRiskstormRequest) SetAuthToken(v string) *QueryRtopRiskstormRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryRtopRiskstormRequest) SetProductInstanceId(v string) *QueryRtopRiskstormRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryRtopRiskstormRequest) SetCompanyId(v string) *QueryRtopRiskstormRequest {
	s.CompanyId = &v
	return s
}

func (s *QueryRtopRiskstormRequest) SetType(v string) *QueryRtopRiskstormRequest {
	s.Type = &v
	return s
}

type QueryRtopRiskstormResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 年报数据
	AnnualReports []*RtopRiskStormCompanyAnnualReport `json:"annual_reports,omitempty" xml:"annual_reports,omitempty" type:"Repeated"`
	// 风险标签数据
	RiskLabels []*RiskStormLabelResp `json:"risk_labels,omitempty" xml:"risk_labels,omitempty" type:"Repeated"`
}

func (s QueryRtopRiskstormResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryRtopRiskstormResponse) GoString() string {
	return s.String()
}

func (s *QueryRtopRiskstormResponse) SetReqMsgId(v string) *QueryRtopRiskstormResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryRtopRiskstormResponse) SetResultCode(v string) *QueryRtopRiskstormResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryRtopRiskstormResponse) SetResultMsg(v string) *QueryRtopRiskstormResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryRtopRiskstormResponse) SetAnnualReports(v []*RtopRiskStormCompanyAnnualReport) *QueryRtopRiskstormResponse {
	s.AnnualReports = v
	return s
}

func (s *QueryRtopRiskstormResponse) SetRiskLabels(v []*RiskStormLabelResp) *QueryRtopRiskstormResponse {
	s.RiskLabels = v
	return s
}

type QueryRtopCrowdriskSumRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 指定的企业ID列表，企业ID数量不超过100个。
	CompanyIds []*string `json:"company_ids,omitempty" xml:"company_ids,omitempty" require:"true" type:"Repeated"`
	// 指定的地区名称，例如温州市、鹿城区等
	PlaceName *string `json:"place_name,omitempty" xml:"place_name,omitempty" require:"true"`
	// 地区类型，PROVINCE表示省，CITY表示市，COUNTY表示县
	PlaceType *string `json:"place_type,omitempty" xml:"place_type,omitempty" require:"true"`
}

func (s QueryRtopCrowdriskSumRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryRtopCrowdriskSumRequest) GoString() string {
	return s.String()
}

func (s *QueryRtopCrowdriskSumRequest) SetAuthToken(v string) *QueryRtopCrowdriskSumRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryRtopCrowdriskSumRequest) SetProductInstanceId(v string) *QueryRtopCrowdriskSumRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryRtopCrowdriskSumRequest) SetCompanyIds(v []*string) *QueryRtopCrowdriskSumRequest {
	s.CompanyIds = v
	return s
}

func (s *QueryRtopCrowdriskSumRequest) SetPlaceName(v string) *QueryRtopCrowdriskSumRequest {
	s.PlaceName = &v
	return s
}

func (s *QueryRtopCrowdriskSumRequest) SetPlaceType(v string) *QueryRtopCrowdriskSumRequest {
	s.PlaceType = &v
	return s
}

type QueryRtopCrowdriskSumResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 查询企业的影响金额之和
	MoneyInvolved *int64 `json:"money_involved,omitempty" xml:"money_involved,omitempty"`
	// 查询企业的影响人数之和
	PeopleInvolved *int64 `json:"people_involved,omitempty" xml:"people_involved,omitempty"`
}

func (s QueryRtopCrowdriskSumResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryRtopCrowdriskSumResponse) GoString() string {
	return s.String()
}

func (s *QueryRtopCrowdriskSumResponse) SetReqMsgId(v string) *QueryRtopCrowdriskSumResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryRtopCrowdriskSumResponse) SetResultCode(v string) *QueryRtopCrowdriskSumResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryRtopCrowdriskSumResponse) SetResultMsg(v string) *QueryRtopCrowdriskSumResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryRtopCrowdriskSumResponse) SetMoneyInvolved(v int64) *QueryRtopCrowdriskSumResponse {
	s.MoneyInvolved = &v
	return s
}

func (s *QueryRtopCrowdriskSumResponse) SetPeopleInvolved(v int64) *QueryRtopCrowdriskSumResponse {
	s.PeopleInvolved = &v
	return s
}

type GetRtopCompanyDetailRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 企业ID
	CompanyId *string `json:"company_id,omitempty" xml:"company_id,omitempty" require:"true"`
}

func (s GetRtopCompanyDetailRequest) String() string {
	return tea.Prettify(s)
}

func (s GetRtopCompanyDetailRequest) GoString() string {
	return s.String()
}

func (s *GetRtopCompanyDetailRequest) SetAuthToken(v string) *GetRtopCompanyDetailRequest {
	s.AuthToken = &v
	return s
}

func (s *GetRtopCompanyDetailRequest) SetProductInstanceId(v string) *GetRtopCompanyDetailRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetRtopCompanyDetailRequest) SetCompanyId(v string) *GetRtopCompanyDetailRequest {
	s.CompanyId = &v
	return s
}

type GetRtopCompanyDetailResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 风险分数
	RiskScore *int64 `json:"risk_score,omitempty" xml:"risk_score,omitempty"`
	// 风险维度特征
	RiskFeatures *string `json:"risk_features,omitempty" xml:"risk_features,omitempty"`
	// 风险标签列表
	RiskTags []*RtopRiskTag `json:"risk_tags,omitempty" xml:"risk_tags,omitempty" type:"Repeated"`
}

func (s GetRtopCompanyDetailResponse) String() string {
	return tea.Prettify(s)
}

func (s GetRtopCompanyDetailResponse) GoString() string {
	return s.String()
}

func (s *GetRtopCompanyDetailResponse) SetReqMsgId(v string) *GetRtopCompanyDetailResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetRtopCompanyDetailResponse) SetResultCode(v string) *GetRtopCompanyDetailResponse {
	s.ResultCode = &v
	return s
}

func (s *GetRtopCompanyDetailResponse) SetResultMsg(v string) *GetRtopCompanyDetailResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetRtopCompanyDetailResponse) SetRiskScore(v int64) *GetRtopCompanyDetailResponse {
	s.RiskScore = &v
	return s
}

func (s *GetRtopCompanyDetailResponse) SetRiskFeatures(v string) *GetRtopCompanyDetailResponse {
	s.RiskFeatures = &v
	return s
}

func (s *GetRtopCompanyDetailResponse) SetRiskTags(v []*RtopRiskTag) *GetRtopCompanyDetailResponse {
	s.RiskTags = v
	return s
}

type QueryRtopCompanyRiskinfoRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户access key
	Ak *string `json:"ak,omitempty" xml:"ak,omitempty" require:"true"`
	// 业务场景 ""
	BizType *string `json:"biz_type,omitempty" xml:"biz_type,omitempty"`
	// 预留字段
	Memo *string `json:"memo,omitempty" xml:"memo,omitempty"`
	// 区域中文名称
	PlaceName *string `json:"place_name,omitempty" xml:"place_name,omitempty" require:"true"`
	// 区域类型
	PlaceType *string `json:"place_type,omitempty" xml:"place_type,omitempty" require:"true"`
	// 租户seceret key
	Sk *string `json:"sk,omitempty" xml:"sk,omitempty" require:"true"`
}

func (s QueryRtopCompanyRiskinfoRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryRtopCompanyRiskinfoRequest) GoString() string {
	return s.String()
}

func (s *QueryRtopCompanyRiskinfoRequest) SetAuthToken(v string) *QueryRtopCompanyRiskinfoRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryRtopCompanyRiskinfoRequest) SetProductInstanceId(v string) *QueryRtopCompanyRiskinfoRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryRtopCompanyRiskinfoRequest) SetAk(v string) *QueryRtopCompanyRiskinfoRequest {
	s.Ak = &v
	return s
}

func (s *QueryRtopCompanyRiskinfoRequest) SetBizType(v string) *QueryRtopCompanyRiskinfoRequest {
	s.BizType = &v
	return s
}

func (s *QueryRtopCompanyRiskinfoRequest) SetMemo(v string) *QueryRtopCompanyRiskinfoRequest {
	s.Memo = &v
	return s
}

func (s *QueryRtopCompanyRiskinfoRequest) SetPlaceName(v string) *QueryRtopCompanyRiskinfoRequest {
	s.PlaceName = &v
	return s
}

func (s *QueryRtopCompanyRiskinfoRequest) SetPlaceType(v string) *QueryRtopCompanyRiskinfoRequest {
	s.PlaceType = &v
	return s
}

func (s *QueryRtopCompanyRiskinfoRequest) SetSk(v string) *QueryRtopCompanyRiskinfoRequest {
	s.Sk = &v
	return s
}

type QueryRtopCompanyRiskinfoResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 企业列表
	Data []*RtopCompanyRiskInfo `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
}

func (s QueryRtopCompanyRiskinfoResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryRtopCompanyRiskinfoResponse) GoString() string {
	return s.String()
}

func (s *QueryRtopCompanyRiskinfoResponse) SetReqMsgId(v string) *QueryRtopCompanyRiskinfoResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryRtopCompanyRiskinfoResponse) SetResultCode(v string) *QueryRtopCompanyRiskinfoResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryRtopCompanyRiskinfoResponse) SetResultMsg(v string) *QueryRtopCompanyRiskinfoResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryRtopCompanyRiskinfoResponse) SetData(v []*RtopCompanyRiskInfo) *QueryRtopCompanyRiskinfoResponse {
	s.Data = v
	return s
}

type ExecRtopGenericInvokeRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// {"platformId":1234}
	Content *string `json:"content,omitempty" xml:"content,omitempty" require:"true"`
	// 这个账号的所有权限点，逗号分隔
	Permission *string `json:"permission,omitempty" xml:"permission,omitempty" require:"true"`
	// title
	Title *string `json:"title,omitempty" xml:"title,omitempty" require:"true"`
}

func (s ExecRtopGenericInvokeRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecRtopGenericInvokeRequest) GoString() string {
	return s.String()
}

func (s *ExecRtopGenericInvokeRequest) SetAuthToken(v string) *ExecRtopGenericInvokeRequest {
	s.AuthToken = &v
	return s
}

func (s *ExecRtopGenericInvokeRequest) SetProductInstanceId(v string) *ExecRtopGenericInvokeRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ExecRtopGenericInvokeRequest) SetContent(v string) *ExecRtopGenericInvokeRequest {
	s.Content = &v
	return s
}

func (s *ExecRtopGenericInvokeRequest) SetPermission(v string) *ExecRtopGenericInvokeRequest {
	s.Permission = &v
	return s
}

func (s *ExecRtopGenericInvokeRequest) SetTitle(v string) *ExecRtopGenericInvokeRequest {
	s.Title = &v
	return s
}

type ExecRtopGenericInvokeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 接口数据
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
	// response_code
	ResponseCode *string `json:"response_code,omitempty" xml:"response_code,omitempty"`
	// 是否请求成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s ExecRtopGenericInvokeResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecRtopGenericInvokeResponse) GoString() string {
	return s.String()
}

func (s *ExecRtopGenericInvokeResponse) SetReqMsgId(v string) *ExecRtopGenericInvokeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ExecRtopGenericInvokeResponse) SetResultCode(v string) *ExecRtopGenericInvokeResponse {
	s.ResultCode = &v
	return s
}

func (s *ExecRtopGenericInvokeResponse) SetResultMsg(v string) *ExecRtopGenericInvokeResponse {
	s.ResultMsg = &v
	return s
}

func (s *ExecRtopGenericInvokeResponse) SetData(v string) *ExecRtopGenericInvokeResponse {
	s.Data = &v
	return s
}

func (s *ExecRtopGenericInvokeResponse) SetResponseCode(v string) *ExecRtopGenericInvokeResponse {
	s.ResponseCode = &v
	return s
}

func (s *ExecRtopGenericInvokeResponse) SetSuccess(v bool) *ExecRtopGenericInvokeResponse {
	s.Success = &v
	return s
}

type CreateRtopTokenRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s CreateRtopTokenRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateRtopTokenRequest) GoString() string {
	return s.String()
}

func (s *CreateRtopTokenRequest) SetAuthToken(v string) *CreateRtopTokenRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateRtopTokenRequest) SetProductInstanceId(v string) *CreateRtopTokenRequest {
	s.ProductInstanceId = &v
	return s
}

type CreateRtopTokenResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回数据
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
	// 返回码
	ResponseCode *string `json:"response_code,omitempty" xml:"response_code,omitempty"`
	// 成功，失败
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s CreateRtopTokenResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateRtopTokenResponse) GoString() string {
	return s.String()
}

func (s *CreateRtopTokenResponse) SetReqMsgId(v string) *CreateRtopTokenResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateRtopTokenResponse) SetResultCode(v string) *CreateRtopTokenResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateRtopTokenResponse) SetResultMsg(v string) *CreateRtopTokenResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateRtopTokenResponse) SetData(v string) *CreateRtopTokenResponse {
	s.Data = &v
	return s
}

func (s *CreateRtopTokenResponse) SetResponseCode(v string) *CreateRtopTokenResponse {
	s.ResponseCode = &v
	return s
}

func (s *CreateRtopTokenResponse) SetSuccess(v bool) *CreateRtopTokenResponse {
	s.Success = &v
	return s
}

type QueryRtopRisklabelRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// pageNo
	PageNo *int64 `json:"page_no,omitempty" xml:"page_no,omitempty" require:"true"`
	// pageSize
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
	// scroll_id
	ScrollId *string `json:"scroll_id,omitempty" xml:"scroll_id,omitempty"`
	// mct_one_id  -- search after使用
	MctOneId *string `json:"mct_one_id,omitempty" xml:"mct_one_id,omitempty"`
	// 数据更新日期
	UpdateDate *string `json:"update_date,omitempty" xml:"update_date,omitempty" require:"true"`
	// tag_id  -- search after使用
	TagId *string `json:"tag_id,omitempty" xml:"tag_id,omitempty"`
}

func (s QueryRtopRisklabelRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryRtopRisklabelRequest) GoString() string {
	return s.String()
}

func (s *QueryRtopRisklabelRequest) SetAuthToken(v string) *QueryRtopRisklabelRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryRtopRisklabelRequest) SetProductInstanceId(v string) *QueryRtopRisklabelRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryRtopRisklabelRequest) SetPageNo(v int64) *QueryRtopRisklabelRequest {
	s.PageNo = &v
	return s
}

func (s *QueryRtopRisklabelRequest) SetPageSize(v int64) *QueryRtopRisklabelRequest {
	s.PageSize = &v
	return s
}

func (s *QueryRtopRisklabelRequest) SetScrollId(v string) *QueryRtopRisklabelRequest {
	s.ScrollId = &v
	return s
}

func (s *QueryRtopRisklabelRequest) SetMctOneId(v string) *QueryRtopRisklabelRequest {
	s.MctOneId = &v
	return s
}

func (s *QueryRtopRisklabelRequest) SetUpdateDate(v string) *QueryRtopRisklabelRequest {
	s.UpdateDate = &v
	return s
}

func (s *QueryRtopRisklabelRequest) SetTagId(v string) *QueryRtopRisklabelRequest {
	s.TagId = &v
	return s
}

type QueryRtopRisklabelResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回码
	ResponseCode *string `json:"response_code,omitempty" xml:"response_code,omitempty"`
	// 标签信息
	RiskLabelInfos []*RiskLabelInfo `json:"risk_label_infos,omitempty" xml:"risk_label_infos,omitempty" type:"Repeated"`
	// scroll_id
	ScrollId *string `json:"scroll_id,omitempty" xml:"scroll_id,omitempty"`
	// 是否调用成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
	// total
	Total *int64 `json:"total,omitempty" xml:"total,omitempty"`
}

func (s QueryRtopRisklabelResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryRtopRisklabelResponse) GoString() string {
	return s.String()
}

func (s *QueryRtopRisklabelResponse) SetReqMsgId(v string) *QueryRtopRisklabelResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryRtopRisklabelResponse) SetResultCode(v string) *QueryRtopRisklabelResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryRtopRisklabelResponse) SetResultMsg(v string) *QueryRtopRisklabelResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryRtopRisklabelResponse) SetResponseCode(v string) *QueryRtopRisklabelResponse {
	s.ResponseCode = &v
	return s
}

func (s *QueryRtopRisklabelResponse) SetRiskLabelInfos(v []*RiskLabelInfo) *QueryRtopRisklabelResponse {
	s.RiskLabelInfos = v
	return s
}

func (s *QueryRtopRisklabelResponse) SetScrollId(v string) *QueryRtopRisklabelResponse {
	s.ScrollId = &v
	return s
}

func (s *QueryRtopRisklabelResponse) SetSuccess(v bool) *QueryRtopRisklabelResponse {
	s.Success = &v
	return s
}

func (s *QueryRtopRisklabelResponse) SetTotal(v int64) *QueryRtopRisklabelResponse {
	s.Total = &v
	return s
}

type QueryRtopCompanyRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 公司ID集合
	CompanyIds []*string `json:"company_ids,omitempty" xml:"company_ids,omitempty" require:"true" type:"Repeated"`
	// 数据同步到公有云时间(业务上赋值当天)
	UpdateDate *string `json:"update_date,omitempty" xml:"update_date,omitempty" require:"true"`
}

func (s QueryRtopCompanyRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryRtopCompanyRequest) GoString() string {
	return s.String()
}

func (s *QueryRtopCompanyRequest) SetAuthToken(v string) *QueryRtopCompanyRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryRtopCompanyRequest) SetProductInstanceId(v string) *QueryRtopCompanyRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryRtopCompanyRequest) SetCompanyIds(v []*string) *QueryRtopCompanyRequest {
	s.CompanyIds = v
	return s
}

func (s *QueryRtopCompanyRequest) SetUpdateDate(v string) *QueryRtopCompanyRequest {
	s.UpdateDate = &v
	return s
}

type QueryRtopCompanyResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 企业信息列表
	CompanyInfos []*CompanyInfo `json:"company_infos,omitempty" xml:"company_infos,omitempty" type:"Repeated"`
	// 返回码
	ResponseCode *string `json:"response_code,omitempty" xml:"response_code,omitempty"`
	// 是否调用成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s QueryRtopCompanyResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryRtopCompanyResponse) GoString() string {
	return s.String()
}

func (s *QueryRtopCompanyResponse) SetReqMsgId(v string) *QueryRtopCompanyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryRtopCompanyResponse) SetResultCode(v string) *QueryRtopCompanyResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryRtopCompanyResponse) SetResultMsg(v string) *QueryRtopCompanyResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryRtopCompanyResponse) SetCompanyInfos(v []*CompanyInfo) *QueryRtopCompanyResponse {
	s.CompanyInfos = v
	return s
}

func (s *QueryRtopCompanyResponse) SetResponseCode(v string) *QueryRtopCompanyResponse {
	s.ResponseCode = &v
	return s
}

func (s *QueryRtopCompanyResponse) SetSuccess(v bool) *QueryRtopCompanyResponse {
	s.Success = &v
	return s
}

type QueryRtopRisklabelFilterRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// pageNo
	PageNo *int64 `json:"page_no,omitempty" xml:"page_no,omitempty" require:"true"`
	// page_size
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
	// 成都市
	PlaceName *string `json:"place_name,omitempty" xml:"place_name,omitempty" require:"true"`
	// CITY
	PlaceType *string `json:"place_type,omitempty" xml:"place_type,omitempty" require:"true"`
}

func (s QueryRtopRisklabelFilterRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryRtopRisklabelFilterRequest) GoString() string {
	return s.String()
}

func (s *QueryRtopRisklabelFilterRequest) SetAuthToken(v string) *QueryRtopRisklabelFilterRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryRtopRisklabelFilterRequest) SetProductInstanceId(v string) *QueryRtopRisklabelFilterRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryRtopRisklabelFilterRequest) SetPageNo(v int64) *QueryRtopRisklabelFilterRequest {
	s.PageNo = &v
	return s
}

func (s *QueryRtopRisklabelFilterRequest) SetPageSize(v int64) *QueryRtopRisklabelFilterRequest {
	s.PageSize = &v
	return s
}

func (s *QueryRtopRisklabelFilterRequest) SetPlaceName(v string) *QueryRtopRisklabelFilterRequest {
	s.PlaceName = &v
	return s
}

func (s *QueryRtopRisklabelFilterRequest) SetPlaceType(v string) *QueryRtopRisklabelFilterRequest {
	s.PlaceType = &v
	return s
}

type QueryRtopRisklabelFilterResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回码
	ResponseCode *string `json:"response_code,omitempty" xml:"response_code,omitempty"`
	// 标签配置全量信息
	RiskLabelFilterConfigInfo []*RiskLabelFilterConfigInfo `json:"risk_label_filter_config_info,omitempty" xml:"risk_label_filter_config_info,omitempty" type:"Repeated"`
	// 是否调用成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
	// 总数
	Total *int64 `json:"total,omitempty" xml:"total,omitempty"`
}

func (s QueryRtopRisklabelFilterResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryRtopRisklabelFilterResponse) GoString() string {
	return s.String()
}

func (s *QueryRtopRisklabelFilterResponse) SetReqMsgId(v string) *QueryRtopRisklabelFilterResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryRtopRisklabelFilterResponse) SetResultCode(v string) *QueryRtopRisklabelFilterResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryRtopRisklabelFilterResponse) SetResultMsg(v string) *QueryRtopRisklabelFilterResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryRtopRisklabelFilterResponse) SetResponseCode(v string) *QueryRtopRisklabelFilterResponse {
	s.ResponseCode = &v
	return s
}

func (s *QueryRtopRisklabelFilterResponse) SetRiskLabelFilterConfigInfo(v []*RiskLabelFilterConfigInfo) *QueryRtopRisklabelFilterResponse {
	s.RiskLabelFilterConfigInfo = v
	return s
}

func (s *QueryRtopRisklabelFilterResponse) SetSuccess(v bool) *QueryRtopRisklabelFilterResponse {
	s.Success = &v
	return s
}

func (s *QueryRtopRisklabelFilterResponse) SetTotal(v int64) *QueryRtopRisklabelFilterResponse {
	s.Total = &v
	return s
}

type PullRegtechNewsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 表示本地数据库中舆情数据中的最大id
	NewsMaxId *string `json:"news_max_id,omitempty" xml:"news_max_id,omitempty" require:"true"`
}

func (s PullRegtechNewsRequest) String() string {
	return tea.Prettify(s)
}

func (s PullRegtechNewsRequest) GoString() string {
	return s.String()
}

func (s *PullRegtechNewsRequest) SetAuthToken(v string) *PullRegtechNewsRequest {
	s.AuthToken = &v
	return s
}

func (s *PullRegtechNewsRequest) SetProductInstanceId(v string) *PullRegtechNewsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PullRegtechNewsRequest) SetNewsMaxId(v string) *PullRegtechNewsRequest {
	s.NewsMaxId = &v
	return s
}

type PullRegtechNewsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回的数据体
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s PullRegtechNewsResponse) String() string {
	return tea.Prettify(s)
}

func (s PullRegtechNewsResponse) GoString() string {
	return s.String()
}

func (s *PullRegtechNewsResponse) SetReqMsgId(v string) *PullRegtechNewsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PullRegtechNewsResponse) SetResultCode(v string) *PullRegtechNewsResponse {
	s.ResultCode = &v
	return s
}

func (s *PullRegtechNewsResponse) SetResultMsg(v string) *PullRegtechNewsResponse {
	s.ResultMsg = &v
	return s
}

func (s *PullRegtechNewsResponse) SetData(v string) *PullRegtechNewsResponse {
	s.Data = &v
	return s
}

type QueryRtopCompanyFeedbackRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 当前是第几页
	PageNo *int64 `json:"page_no,omitempty" xml:"page_no,omitempty" require:"true"`
	// 每一页的记录条数
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
	// 用户属地
	UserPlace *string `json:"user_place,omitempty" xml:"user_place,omitempty" require:"true"`
	// 用户所在地类型
	UserPlaceType *string `json:"user_place_type,omitempty" xml:"user_place_type,omitempty" require:"true"`
}

func (s QueryRtopCompanyFeedbackRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryRtopCompanyFeedbackRequest) GoString() string {
	return s.String()
}

func (s *QueryRtopCompanyFeedbackRequest) SetAuthToken(v string) *QueryRtopCompanyFeedbackRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryRtopCompanyFeedbackRequest) SetProductInstanceId(v string) *QueryRtopCompanyFeedbackRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryRtopCompanyFeedbackRequest) SetPageNo(v int64) *QueryRtopCompanyFeedbackRequest {
	s.PageNo = &v
	return s
}

func (s *QueryRtopCompanyFeedbackRequest) SetPageSize(v int64) *QueryRtopCompanyFeedbackRequest {
	s.PageSize = &v
	return s
}

func (s *QueryRtopCompanyFeedbackRequest) SetUserPlace(v string) *QueryRtopCompanyFeedbackRequest {
	s.UserPlace = &v
	return s
}

func (s *QueryRtopCompanyFeedbackRequest) SetUserPlaceType(v string) *QueryRtopCompanyFeedbackRequest {
	s.UserPlaceType = &v
	return s
}

type QueryRtopCompanyFeedbackResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 企业反馈列表
	CompanyFeedbacks []*RtopCompanyFeedback `json:"company_feedbacks,omitempty" xml:"company_feedbacks,omitempty" type:"Repeated"`
	// 返回码
	ResponseCode *string `json:"response_code,omitempty" xml:"response_code,omitempty"`
	// 是否调用成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
	// 总条数
	TotalNum *int64 `json:"total_num,omitempty" xml:"total_num,omitempty"`
}

func (s QueryRtopCompanyFeedbackResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryRtopCompanyFeedbackResponse) GoString() string {
	return s.String()
}

func (s *QueryRtopCompanyFeedbackResponse) SetReqMsgId(v string) *QueryRtopCompanyFeedbackResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryRtopCompanyFeedbackResponse) SetResultCode(v string) *QueryRtopCompanyFeedbackResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryRtopCompanyFeedbackResponse) SetResultMsg(v string) *QueryRtopCompanyFeedbackResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryRtopCompanyFeedbackResponse) SetCompanyFeedbacks(v []*RtopCompanyFeedback) *QueryRtopCompanyFeedbackResponse {
	s.CompanyFeedbacks = v
	return s
}

func (s *QueryRtopCompanyFeedbackResponse) SetResponseCode(v string) *QueryRtopCompanyFeedbackResponse {
	s.ResponseCode = &v
	return s
}

func (s *QueryRtopCompanyFeedbackResponse) SetSuccess(v bool) *QueryRtopCompanyFeedbackResponse {
	s.Success = &v
	return s
}

func (s *QueryRtopCompanyFeedbackResponse) SetTotalNum(v int64) *QueryRtopCompanyFeedbackResponse {
	s.TotalNum = &v
	return s
}

type QueryRtopCompanyAlarmRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 数据的时间
	DataTime *string `json:"data_time,omitempty" xml:"data_time,omitempty" require:"true"`
	// 当前是第几页
	PageNo *int64 `json:"page_no,omitempty" xml:"page_no,omitempty" require:"true"`
	// 每一页的记录条数
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
	// 用户属地
	UserPlace *string `json:"user_place,omitempty" xml:"user_place,omitempty" require:"true"`
	// 用户所在地类型
	UserPlaceType *string `json:"user_place_type,omitempty" xml:"user_place_type,omitempty" require:"true"`
}

func (s QueryRtopCompanyAlarmRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryRtopCompanyAlarmRequest) GoString() string {
	return s.String()
}

func (s *QueryRtopCompanyAlarmRequest) SetAuthToken(v string) *QueryRtopCompanyAlarmRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryRtopCompanyAlarmRequest) SetProductInstanceId(v string) *QueryRtopCompanyAlarmRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryRtopCompanyAlarmRequest) SetDataTime(v string) *QueryRtopCompanyAlarmRequest {
	s.DataTime = &v
	return s
}

func (s *QueryRtopCompanyAlarmRequest) SetPageNo(v int64) *QueryRtopCompanyAlarmRequest {
	s.PageNo = &v
	return s
}

func (s *QueryRtopCompanyAlarmRequest) SetPageSize(v int64) *QueryRtopCompanyAlarmRequest {
	s.PageSize = &v
	return s
}

func (s *QueryRtopCompanyAlarmRequest) SetUserPlace(v string) *QueryRtopCompanyAlarmRequest {
	s.UserPlace = &v
	return s
}

func (s *QueryRtopCompanyAlarmRequest) SetUserPlaceType(v string) *QueryRtopCompanyAlarmRequest {
	s.UserPlaceType = &v
	return s
}

type QueryRtopCompanyAlarmResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 预警企业列表
	CompanyAlarms []*RtopCompanyAlarm `json:"company_alarms,omitempty" xml:"company_alarms,omitempty" type:"Repeated"`
	// 返回码
	ResponseCode *string `json:"response_code,omitempty" xml:"response_code,omitempty"`
	// 是否调用成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
	// 总条数
	TotalNum *int64 `json:"total_num,omitempty" xml:"total_num,omitempty"`
}

func (s QueryRtopCompanyAlarmResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryRtopCompanyAlarmResponse) GoString() string {
	return s.String()
}

func (s *QueryRtopCompanyAlarmResponse) SetReqMsgId(v string) *QueryRtopCompanyAlarmResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryRtopCompanyAlarmResponse) SetResultCode(v string) *QueryRtopCompanyAlarmResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryRtopCompanyAlarmResponse) SetResultMsg(v string) *QueryRtopCompanyAlarmResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryRtopCompanyAlarmResponse) SetCompanyAlarms(v []*RtopCompanyAlarm) *QueryRtopCompanyAlarmResponse {
	s.CompanyAlarms = v
	return s
}

func (s *QueryRtopCompanyAlarmResponse) SetResponseCode(v string) *QueryRtopCompanyAlarmResponse {
	s.ResponseCode = &v
	return s
}

func (s *QueryRtopCompanyAlarmResponse) SetSuccess(v bool) *QueryRtopCompanyAlarmResponse {
	s.Success = &v
	return s
}

func (s *QueryRtopCompanyAlarmResponse) SetTotalNum(v int64) *QueryRtopCompanyAlarmResponse {
	s.TotalNum = &v
	return s
}

type QueryRtopCompanyRiskyRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 数据时间
	DataTime *string `json:"data_time,omitempty" xml:"data_time,omitempty" require:"true"`
	// 全局态势中的列表 类型
	ListType *string `json:"list_type,omitempty" xml:"list_type,omitempty" require:"true"`
	// 当前是第几页
	PageNo *int64 `json:"page_no,omitempty" xml:"page_no,omitempty" require:"true"`
	// 每一页的记录条数
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
	// 全局动态类型
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 用户属地
	UserPlace *string `json:"user_place,omitempty" xml:"user_place,omitempty" require:"true"`
	// 用户所在地类型
	UserPlaceType *string `json:"user_place_type,omitempty" xml:"user_place_type,omitempty" require:"true"`
}

func (s QueryRtopCompanyRiskyRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryRtopCompanyRiskyRequest) GoString() string {
	return s.String()
}

func (s *QueryRtopCompanyRiskyRequest) SetAuthToken(v string) *QueryRtopCompanyRiskyRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryRtopCompanyRiskyRequest) SetProductInstanceId(v string) *QueryRtopCompanyRiskyRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryRtopCompanyRiskyRequest) SetDataTime(v string) *QueryRtopCompanyRiskyRequest {
	s.DataTime = &v
	return s
}

func (s *QueryRtopCompanyRiskyRequest) SetListType(v string) *QueryRtopCompanyRiskyRequest {
	s.ListType = &v
	return s
}

func (s *QueryRtopCompanyRiskyRequest) SetPageNo(v int64) *QueryRtopCompanyRiskyRequest {
	s.PageNo = &v
	return s
}

func (s *QueryRtopCompanyRiskyRequest) SetPageSize(v int64) *QueryRtopCompanyRiskyRequest {
	s.PageSize = &v
	return s
}

func (s *QueryRtopCompanyRiskyRequest) SetType(v string) *QueryRtopCompanyRiskyRequest {
	s.Type = &v
	return s
}

func (s *QueryRtopCompanyRiskyRequest) SetUserPlace(v string) *QueryRtopCompanyRiskyRequest {
	s.UserPlace = &v
	return s
}

func (s *QueryRtopCompanyRiskyRequest) SetUserPlaceType(v string) *QueryRtopCompanyRiskyRequest {
	s.UserPlaceType = &v
	return s
}

type QueryRtopCompanyRiskyResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回码
	ResponseCode *string `json:"response_code,omitempty" xml:"response_code,omitempty"`
	// 全局动态中的企业列表
	RiskyCompanies []*RtopRiskyCompany `json:"risky_companies,omitempty" xml:"risky_companies,omitempty" type:"Repeated"`
	// 是否调用成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
	// 总条数
	TotalNum *int64 `json:"total_num,omitempty" xml:"total_num,omitempty"`
}

func (s QueryRtopCompanyRiskyResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryRtopCompanyRiskyResponse) GoString() string {
	return s.String()
}

func (s *QueryRtopCompanyRiskyResponse) SetReqMsgId(v string) *QueryRtopCompanyRiskyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryRtopCompanyRiskyResponse) SetResultCode(v string) *QueryRtopCompanyRiskyResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryRtopCompanyRiskyResponse) SetResultMsg(v string) *QueryRtopCompanyRiskyResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryRtopCompanyRiskyResponse) SetResponseCode(v string) *QueryRtopCompanyRiskyResponse {
	s.ResponseCode = &v
	return s
}

func (s *QueryRtopCompanyRiskyResponse) SetRiskyCompanies(v []*RtopRiskyCompany) *QueryRtopCompanyRiskyResponse {
	s.RiskyCompanies = v
	return s
}

func (s *QueryRtopCompanyRiskyResponse) SetSuccess(v bool) *QueryRtopCompanyRiskyResponse {
	s.Success = &v
	return s
}

func (s *QueryRtopCompanyRiskyResponse) SetTotalNum(v int64) *QueryRtopCompanyRiskyResponse {
	s.TotalNum = &v
	return s
}

type QueryRtopCompanyListRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 活跃地区
	ActiveAreas []*string `json:"active_areas,omitempty" xml:"active_areas,omitempty" type:"Repeated"`
	// 企业类型
	Categories []*string `json:"categories,omitempty" xml:"categories,omitempty" type:"Repeated"`
	// 企业状态
	CompanyStates []*string `json:"company_states,omitempty" xml:"company_states,omitempty" type:"Repeated"`
	// 反馈
	Feedback []*string `json:"feedback,omitempty" xml:"feedback,omitempty" type:"Repeated"`
	// 风险指数最大值
	MaxRiskScore *int64 `json:"max_risk_score,omitempty" xml:"max_risk_score,omitempty"`
	// 指数周波动最大值
	MaxRiskScoreWeeklyFloat *string `json:"max_risk_score_weekly_float,omitempty" xml:"max_risk_score_weekly_float,omitempty"`
	// 传播人次最大值
	MaxSpreadNumber *int64 `json:"max_spread_number,omitempty" xml:"max_spread_number,omitempty"`
	// 风险指数最小值
	MinRiskScore *int64 `json:"min_risk_score,omitempty" xml:"min_risk_score,omitempty"`
	// 指数周波动最小值
	MinRiskScoreWeeklyFloat *string `json:"min_risk_score_weekly_float,omitempty" xml:"min_risk_score_weekly_float,omitempty"`
	// 传播人次最小值
	MinSpreadNumber *int64 `json:"min_spread_number,omitempty" xml:"min_spread_number,omitempty"`
	// 正常营运状态
	NormalOperation *bool `json:"normal_operation,omitempty" xml:"normal_operation,omitempty"`
	// 经营地区
	OperateAreas []*string `json:"operate_areas,omitempty" xml:"operate_areas,omitempty" type:"Repeated"`
	// 当前是第几页
	PageNo *int64 `json:"page_no,omitempty" xml:"page_no,omitempty" require:"true"`
	// 每一页的记录条数
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
	// 平台状态
	PlatformStates []*string `json:"platform_states,omitempty" xml:"platform_states,omitempty" type:"Repeated"`
	// 注册地区
	RegisterAreas []*string `json:"register_areas,omitempty" xml:"register_areas,omitempty" type:"Repeated"`
	// 高风险维度
	RiskyDimensions []*string `json:"risky_dimensions,omitempty" xml:"risky_dimensions,omitempty" type:"Repeated"`
	// 风险标签
	RiskTags []*string `json:"risk_tags,omitempty" xml:"risk_tags,omitempty" type:"Repeated"`
	// 风险定性
	RiskTypes []*string `json:"risk_types,omitempty" xml:"risk_types,omitempty" type:"Repeated"`
	// 排序字段
	SortField *string `json:"sort_field,omitempty" xml:"sort_field,omitempty"`
	// 排序类型
	SortType *string `json:"sort_type,omitempty" xml:"sort_type,omitempty"`
	// 用户属地
	UserPlace *string `json:"user_place,omitempty" xml:"user_place,omitempty" require:"true"`
	// 用户所在地类型
	UserPlaceType *string `json:"user_place_type,omitempty" xml:"user_place_type,omitempty" require:"true"`
}

func (s QueryRtopCompanyListRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryRtopCompanyListRequest) GoString() string {
	return s.String()
}

func (s *QueryRtopCompanyListRequest) SetAuthToken(v string) *QueryRtopCompanyListRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryRtopCompanyListRequest) SetProductInstanceId(v string) *QueryRtopCompanyListRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryRtopCompanyListRequest) SetActiveAreas(v []*string) *QueryRtopCompanyListRequest {
	s.ActiveAreas = v
	return s
}

func (s *QueryRtopCompanyListRequest) SetCategories(v []*string) *QueryRtopCompanyListRequest {
	s.Categories = v
	return s
}

func (s *QueryRtopCompanyListRequest) SetCompanyStates(v []*string) *QueryRtopCompanyListRequest {
	s.CompanyStates = v
	return s
}

func (s *QueryRtopCompanyListRequest) SetFeedback(v []*string) *QueryRtopCompanyListRequest {
	s.Feedback = v
	return s
}

func (s *QueryRtopCompanyListRequest) SetMaxRiskScore(v int64) *QueryRtopCompanyListRequest {
	s.MaxRiskScore = &v
	return s
}

func (s *QueryRtopCompanyListRequest) SetMaxRiskScoreWeeklyFloat(v string) *QueryRtopCompanyListRequest {
	s.MaxRiskScoreWeeklyFloat = &v
	return s
}

func (s *QueryRtopCompanyListRequest) SetMaxSpreadNumber(v int64) *QueryRtopCompanyListRequest {
	s.MaxSpreadNumber = &v
	return s
}

func (s *QueryRtopCompanyListRequest) SetMinRiskScore(v int64) *QueryRtopCompanyListRequest {
	s.MinRiskScore = &v
	return s
}

func (s *QueryRtopCompanyListRequest) SetMinRiskScoreWeeklyFloat(v string) *QueryRtopCompanyListRequest {
	s.MinRiskScoreWeeklyFloat = &v
	return s
}

func (s *QueryRtopCompanyListRequest) SetMinSpreadNumber(v int64) *QueryRtopCompanyListRequest {
	s.MinSpreadNumber = &v
	return s
}

func (s *QueryRtopCompanyListRequest) SetNormalOperation(v bool) *QueryRtopCompanyListRequest {
	s.NormalOperation = &v
	return s
}

func (s *QueryRtopCompanyListRequest) SetOperateAreas(v []*string) *QueryRtopCompanyListRequest {
	s.OperateAreas = v
	return s
}

func (s *QueryRtopCompanyListRequest) SetPageNo(v int64) *QueryRtopCompanyListRequest {
	s.PageNo = &v
	return s
}

func (s *QueryRtopCompanyListRequest) SetPageSize(v int64) *QueryRtopCompanyListRequest {
	s.PageSize = &v
	return s
}

func (s *QueryRtopCompanyListRequest) SetPlatformStates(v []*string) *QueryRtopCompanyListRequest {
	s.PlatformStates = v
	return s
}

func (s *QueryRtopCompanyListRequest) SetRegisterAreas(v []*string) *QueryRtopCompanyListRequest {
	s.RegisterAreas = v
	return s
}

func (s *QueryRtopCompanyListRequest) SetRiskyDimensions(v []*string) *QueryRtopCompanyListRequest {
	s.RiskyDimensions = v
	return s
}

func (s *QueryRtopCompanyListRequest) SetRiskTags(v []*string) *QueryRtopCompanyListRequest {
	s.RiskTags = v
	return s
}

func (s *QueryRtopCompanyListRequest) SetRiskTypes(v []*string) *QueryRtopCompanyListRequest {
	s.RiskTypes = v
	return s
}

func (s *QueryRtopCompanyListRequest) SetSortField(v string) *QueryRtopCompanyListRequest {
	s.SortField = &v
	return s
}

func (s *QueryRtopCompanyListRequest) SetSortType(v string) *QueryRtopCompanyListRequest {
	s.SortType = &v
	return s
}

func (s *QueryRtopCompanyListRequest) SetUserPlace(v string) *QueryRtopCompanyListRequest {
	s.UserPlace = &v
	return s
}

func (s *QueryRtopCompanyListRequest) SetUserPlaceType(v string) *QueryRtopCompanyListRequest {
	s.UserPlaceType = &v
	return s
}

type QueryRtopCompanyListResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 企业id列表
	CompanyIds []*string `json:"company_ids,omitempty" xml:"company_ids,omitempty" type:"Repeated"`
	// 返回码
	ResponseCode *string `json:"response_code,omitempty" xml:"response_code,omitempty"`
	// 是否调用成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
	// 总条数
	TotalNum *int64 `json:"total_num,omitempty" xml:"total_num,omitempty"`
}

func (s QueryRtopCompanyListResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryRtopCompanyListResponse) GoString() string {
	return s.String()
}

func (s *QueryRtopCompanyListResponse) SetReqMsgId(v string) *QueryRtopCompanyListResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryRtopCompanyListResponse) SetResultCode(v string) *QueryRtopCompanyListResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryRtopCompanyListResponse) SetResultMsg(v string) *QueryRtopCompanyListResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryRtopCompanyListResponse) SetCompanyIds(v []*string) *QueryRtopCompanyListResponse {
	s.CompanyIds = v
	return s
}

func (s *QueryRtopCompanyListResponse) SetResponseCode(v string) *QueryRtopCompanyListResponse {
	s.ResponseCode = &v
	return s
}

func (s *QueryRtopCompanyListResponse) SetSuccess(v bool) *QueryRtopCompanyListResponse {
	s.Success = &v
	return s
}

func (s *QueryRtopCompanyListResponse) SetTotalNum(v int64) *QueryRtopCompanyListResponse {
	s.TotalNum = &v
	return s
}

type QueryRtopRisklabelConfigRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// page_no
	PageNo *int64 `json:"page_no,omitempty" xml:"page_no,omitempty" require:"true"`
	// page_size
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
}

func (s QueryRtopRisklabelConfigRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryRtopRisklabelConfigRequest) GoString() string {
	return s.String()
}

func (s *QueryRtopRisklabelConfigRequest) SetAuthToken(v string) *QueryRtopRisklabelConfigRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryRtopRisklabelConfigRequest) SetProductInstanceId(v string) *QueryRtopRisklabelConfigRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryRtopRisklabelConfigRequest) SetPageNo(v int64) *QueryRtopRisklabelConfigRequest {
	s.PageNo = &v
	return s
}

func (s *QueryRtopRisklabelConfigRequest) SetPageSize(v int64) *QueryRtopRisklabelConfigRequest {
	s.PageSize = &v
	return s
}

type QueryRtopRisklabelConfigResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回码
	//
	ResponseCode *string `json:"response_code,omitempty" xml:"response_code,omitempty"`
	// 是否调用成功
	//
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
	// 列表
	TagConfig []*RiskLabelConfigInfo `json:"tag_config,omitempty" xml:"tag_config,omitempty" type:"Repeated"`
	// 总数
	Total *int64 `json:"total,omitempty" xml:"total,omitempty"`
}

func (s QueryRtopRisklabelConfigResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryRtopRisklabelConfigResponse) GoString() string {
	return s.String()
}

func (s *QueryRtopRisklabelConfigResponse) SetReqMsgId(v string) *QueryRtopRisklabelConfigResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryRtopRisklabelConfigResponse) SetResultCode(v string) *QueryRtopRisklabelConfigResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryRtopRisklabelConfigResponse) SetResultMsg(v string) *QueryRtopRisklabelConfigResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryRtopRisklabelConfigResponse) SetResponseCode(v string) *QueryRtopRisklabelConfigResponse {
	s.ResponseCode = &v
	return s
}

func (s *QueryRtopRisklabelConfigResponse) SetSuccess(v bool) *QueryRtopRisklabelConfigResponse {
	s.Success = &v
	return s
}

func (s *QueryRtopRisklabelConfigResponse) SetTagConfig(v []*RiskLabelConfigInfo) *QueryRtopRisklabelConfigResponse {
	s.TagConfig = v
	return s
}

func (s *QueryRtopRisklabelConfigResponse) SetTotal(v int64) *QueryRtopRisklabelConfigResponse {
	s.Total = &v
	return s
}

type QueryRtopCompanyRiskRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 企业id
	CompanyId *string `json:"company_id,omitempty" xml:"company_id,omitempty" require:"true"`
}

func (s QueryRtopCompanyRiskRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryRtopCompanyRiskRequest) GoString() string {
	return s.String()
}

func (s *QueryRtopCompanyRiskRequest) SetAuthToken(v string) *QueryRtopCompanyRiskRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryRtopCompanyRiskRequest) SetProductInstanceId(v string) *QueryRtopCompanyRiskRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryRtopCompanyRiskRequest) SetCompanyId(v string) *QueryRtopCompanyRiskRequest {
	s.CompanyId = &v
	return s
}

type QueryRtopCompanyRiskResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 风险维度
	RiskFactors []*RtopCompanyRiskFactor `json:"risk_factors,omitempty" xml:"risk_factors,omitempty" type:"Repeated"`
	// 风险等级
	RiskLevel *string `json:"risk_level,omitempty" xml:"risk_level,omitempty"`
	// 风险报文
	RiskMessage *string `json:"risk_message,omitempty" xml:"risk_message,omitempty"`
	// 风险分数
	RiskScore *int64 `json:"risk_score,omitempty" xml:"risk_score,omitempty"`
	// 风险标签
	RiskTags []*string `json:"risk_tags,omitempty" xml:"risk_tags,omitempty" type:"Repeated"`
}

func (s QueryRtopCompanyRiskResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryRtopCompanyRiskResponse) GoString() string {
	return s.String()
}

func (s *QueryRtopCompanyRiskResponse) SetReqMsgId(v string) *QueryRtopCompanyRiskResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryRtopCompanyRiskResponse) SetResultCode(v string) *QueryRtopCompanyRiskResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryRtopCompanyRiskResponse) SetResultMsg(v string) *QueryRtopCompanyRiskResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryRtopCompanyRiskResponse) SetRiskFactors(v []*RtopCompanyRiskFactor) *QueryRtopCompanyRiskResponse {
	s.RiskFactors = v
	return s
}

func (s *QueryRtopCompanyRiskResponse) SetRiskLevel(v string) *QueryRtopCompanyRiskResponse {
	s.RiskLevel = &v
	return s
}

func (s *QueryRtopCompanyRiskResponse) SetRiskMessage(v string) *QueryRtopCompanyRiskResponse {
	s.RiskMessage = &v
	return s
}

func (s *QueryRtopCompanyRiskResponse) SetRiskScore(v int64) *QueryRtopCompanyRiskResponse {
	s.RiskScore = &v
	return s
}

func (s *QueryRtopCompanyRiskResponse) SetRiskTags(v []*string) *QueryRtopCompanyRiskResponse {
	s.RiskTags = v
	return s
}

type ListRtopCompanyRelatedRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 企业id
	CompanyId *string `json:"company_id,omitempty" xml:"company_id,omitempty" require:"true"`
}

func (s ListRtopCompanyRelatedRequest) String() string {
	return tea.Prettify(s)
}

func (s ListRtopCompanyRelatedRequest) GoString() string {
	return s.String()
}

func (s *ListRtopCompanyRelatedRequest) SetAuthToken(v string) *ListRtopCompanyRelatedRequest {
	s.AuthToken = &v
	return s
}

func (s *ListRtopCompanyRelatedRequest) SetProductInstanceId(v string) *ListRtopCompanyRelatedRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListRtopCompanyRelatedRequest) SetCompanyId(v string) *ListRtopCompanyRelatedRequest {
	s.CompanyId = &v
	return s
}

type ListRtopCompanyRelatedResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// node
	Companies []*RtopRiskGeneNode `json:"companies,omitempty" xml:"companies,omitempty" type:"Repeated"`
	// 返回码
	//
	ResponseCode *string `json:"response_code,omitempty" xml:"response_code,omitempty"`
	// 是否调用成功
	//
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s ListRtopCompanyRelatedResponse) String() string {
	return tea.Prettify(s)
}

func (s ListRtopCompanyRelatedResponse) GoString() string {
	return s.String()
}

func (s *ListRtopCompanyRelatedResponse) SetReqMsgId(v string) *ListRtopCompanyRelatedResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListRtopCompanyRelatedResponse) SetResultCode(v string) *ListRtopCompanyRelatedResponse {
	s.ResultCode = &v
	return s
}

func (s *ListRtopCompanyRelatedResponse) SetResultMsg(v string) *ListRtopCompanyRelatedResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListRtopCompanyRelatedResponse) SetCompanies(v []*RtopRiskGeneNode) *ListRtopCompanyRelatedResponse {
	s.Companies = v
	return s
}

func (s *ListRtopCompanyRelatedResponse) SetResponseCode(v string) *ListRtopCompanyRelatedResponse {
	s.ResponseCode = &v
	return s
}

func (s *ListRtopCompanyRelatedResponse) SetSuccess(v bool) *ListRtopCompanyRelatedResponse {
	s.Success = &v
	return s
}

type QueryRtopTagImageRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 企业ID
	CompanyId *string `json:"company_id,omitempty" xml:"company_id,omitempty" require:"true"`
	// 标签ID
	TagId *string `json:"tag_id,omitempty" xml:"tag_id,omitempty" require:"true"`
}

func (s QueryRtopTagImageRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryRtopTagImageRequest) GoString() string {
	return s.String()
}

func (s *QueryRtopTagImageRequest) SetAuthToken(v string) *QueryRtopTagImageRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryRtopTagImageRequest) SetProductInstanceId(v string) *QueryRtopTagImageRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryRtopTagImageRequest) SetCompanyId(v string) *QueryRtopTagImageRequest {
	s.CompanyId = &v
	return s
}

func (s *QueryRtopTagImageRequest) SetTagId(v string) *QueryRtopTagImageRequest {
	s.TagId = &v
	return s
}

type QueryRtopTagImageResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 标签图片列表
	RiskImages []*RtopTagImage `json:"risk_images,omitempty" xml:"risk_images,omitempty" type:"Repeated"`
}

func (s QueryRtopTagImageResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryRtopTagImageResponse) GoString() string {
	return s.String()
}

func (s *QueryRtopTagImageResponse) SetReqMsgId(v string) *QueryRtopTagImageResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryRtopTagImageResponse) SetResultCode(v string) *QueryRtopTagImageResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryRtopTagImageResponse) SetResultMsg(v string) *QueryRtopTagImageResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryRtopTagImageResponse) SetRiskImages(v []*RtopTagImage) *QueryRtopTagImageResponse {
	s.RiskImages = v
	return s
}

type ListRtopStarCompanyRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 页码
	PageNo *int64 `json:"page_no,omitempty" xml:"page_no,omitempty" require:"true"`
	// 一页条数
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
}

func (s ListRtopStarCompanyRequest) String() string {
	return tea.Prettify(s)
}

func (s ListRtopStarCompanyRequest) GoString() string {
	return s.String()
}

func (s *ListRtopStarCompanyRequest) SetAuthToken(v string) *ListRtopStarCompanyRequest {
	s.AuthToken = &v
	return s
}

func (s *ListRtopStarCompanyRequest) SetProductInstanceId(v string) *ListRtopStarCompanyRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ListRtopStarCompanyRequest) SetPageNo(v int64) *ListRtopStarCompanyRequest {
	s.PageNo = &v
	return s
}

func (s *ListRtopStarCompanyRequest) SetPageSize(v int64) *ListRtopStarCompanyRequest {
	s.PageSize = &v
	return s
}

type ListRtopStarCompanyResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 企业列表
	CompanyInfos []*RtopStarCompanyInfo `json:"company_infos,omitempty" xml:"company_infos,omitempty" type:"Repeated"`
	// 页码
	PageNo *int64 `json:"page_no,omitempty" xml:"page_no,omitempty"`
	// 一页条数
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// 总的记录数
	TotalCount *int64 `json:"total_count,omitempty" xml:"total_count,omitempty"`
}

func (s ListRtopStarCompanyResponse) String() string {
	return tea.Prettify(s)
}

func (s ListRtopStarCompanyResponse) GoString() string {
	return s.String()
}

func (s *ListRtopStarCompanyResponse) SetReqMsgId(v string) *ListRtopStarCompanyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListRtopStarCompanyResponse) SetResultCode(v string) *ListRtopStarCompanyResponse {
	s.ResultCode = &v
	return s
}

func (s *ListRtopStarCompanyResponse) SetResultMsg(v string) *ListRtopStarCompanyResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListRtopStarCompanyResponse) SetCompanyInfos(v []*RtopStarCompanyInfo) *ListRtopStarCompanyResponse {
	s.CompanyInfos = v
	return s
}

func (s *ListRtopStarCompanyResponse) SetPageNo(v int64) *ListRtopStarCompanyResponse {
	s.PageNo = &v
	return s
}

func (s *ListRtopStarCompanyResponse) SetPageSize(v int64) *ListRtopStarCompanyResponse {
	s.PageSize = &v
	return s
}

func (s *ListRtopStarCompanyResponse) SetTotalCount(v int64) *ListRtopStarCompanyResponse {
	s.TotalCount = &v
	return s
}

type QueryRpSecurityPolicyRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 风险类型：表示风险处理或风险咨询——process/advice
	RiskType *string `json:"risk_type,omitempty" xml:"risk_type,omitempty" require:"true"`
	// security_scene
	SecurityScene *SecurityScene `json:"security_scene,omitempty" xml:"security_scene,omitempty" require:"true"`
	// service_context
	ServiceContext *ServiceContext `json:"service_context,omitempty" xml:"service_context,omitempty" require:"true"`
}

func (s QueryRpSecurityPolicyRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryRpSecurityPolicyRequest) GoString() string {
	return s.String()
}

func (s *QueryRpSecurityPolicyRequest) SetAuthToken(v string) *QueryRpSecurityPolicyRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryRpSecurityPolicyRequest) SetProductInstanceId(v string) *QueryRpSecurityPolicyRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryRpSecurityPolicyRequest) SetRiskType(v string) *QueryRpSecurityPolicyRequest {
	s.RiskType = &v
	return s
}

func (s *QueryRpSecurityPolicyRequest) SetSecurityScene(v *SecurityScene) *QueryRpSecurityPolicyRequest {
	s.SecurityScene = v
	return s
}

func (s *QueryRpSecurityPolicyRequest) SetServiceContext(v *ServiceContext) *QueryRpSecurityPolicyRequest {
	s.ServiceContext = v
	return s
}

type QueryRpSecurityPolicyResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 模型结果详情
	//
	ModelDetails []*ModelDetails `json:"model_details,omitempty" xml:"model_details,omitempty" type:"Repeated"`
	// 反馈成功之后的id
	SecurityId *string `json:"security_id,omitempty" xml:"security_id,omitempty"`
	// 安全处理结果，枚举值为：reject[拒绝],validate[校验],accept[放过]
	SecurityResult *string `json:"security_result,omitempty" xml:"security_result,omitempty"`
	// 策略结果详情
	//
	StrategyDetails []*StrategyDetails `json:"strategy_details,omitempty" xml:"strategy_details,omitempty" type:"Repeated"`
	// 决策流信息
	DfSceneInfos *DfSceneInfos `json:"df_scene_infos,omitempty" xml:"df_scene_infos,omitempty"`
}

func (s QueryRpSecurityPolicyResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryRpSecurityPolicyResponse) GoString() string {
	return s.String()
}

func (s *QueryRpSecurityPolicyResponse) SetReqMsgId(v string) *QueryRpSecurityPolicyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryRpSecurityPolicyResponse) SetResultCode(v string) *QueryRpSecurityPolicyResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryRpSecurityPolicyResponse) SetResultMsg(v string) *QueryRpSecurityPolicyResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryRpSecurityPolicyResponse) SetModelDetails(v []*ModelDetails) *QueryRpSecurityPolicyResponse {
	s.ModelDetails = v
	return s
}

func (s *QueryRpSecurityPolicyResponse) SetSecurityId(v string) *QueryRpSecurityPolicyResponse {
	s.SecurityId = &v
	return s
}

func (s *QueryRpSecurityPolicyResponse) SetSecurityResult(v string) *QueryRpSecurityPolicyResponse {
	s.SecurityResult = &v
	return s
}

func (s *QueryRpSecurityPolicyResponse) SetStrategyDetails(v []*StrategyDetails) *QueryRpSecurityPolicyResponse {
	s.StrategyDetails = v
	return s
}

func (s *QueryRpSecurityPolicyResponse) SetDfSceneInfos(v *DfSceneInfos) *QueryRpSecurityPolicyResponse {
	s.DfSceneInfos = v
	return s
}

type QuerySnapshotEventRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 事件id
	EventId *string `json:"event_id,omitempty" xml:"event_id,omitempty"`
}

func (s QuerySnapshotEventRequest) String() string {
	return tea.Prettify(s)
}

func (s QuerySnapshotEventRequest) GoString() string {
	return s.String()
}

func (s *QuerySnapshotEventRequest) SetAuthToken(v string) *QuerySnapshotEventRequest {
	s.AuthToken = &v
	return s
}

func (s *QuerySnapshotEventRequest) SetProductInstanceId(v string) *QuerySnapshotEventRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QuerySnapshotEventRequest) SetEventId(v string) *QuerySnapshotEventRequest {
	s.EventId = &v
	return s
}

type QuerySnapshotEventResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s QuerySnapshotEventResponse) String() string {
	return tea.Prettify(s)
}

func (s QuerySnapshotEventResponse) GoString() string {
	return s.String()
}

func (s *QuerySnapshotEventResponse) SetReqMsgId(v string) *QuerySnapshotEventResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QuerySnapshotEventResponse) SetResultCode(v string) *QuerySnapshotEventResponse {
	s.ResultCode = &v
	return s
}

func (s *QuerySnapshotEventResponse) SetResultMsg(v string) *QuerySnapshotEventResponse {
	s.ResultMsg = &v
	return s
}

type UploadUmktParamsFileRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// file_id
	// 待上传文件
	FileObject io.Reader `json:"fileObject,omitempty" xml:"fileObject,omitempty"`
	// 待上传文件名
	FileObjectName *string `json:"fileObjectName,omitempty" xml:"fileObjectName,omitempty"`
	FileId         *string `json:"file_id,omitempty" xml:"file_id,omitempty" require:"true"`
	// 场景策略id
	SceneStrategyId *int64 `json:"scene_strategy_id,omitempty" xml:"scene_strategy_id,omitempty" require:"true" minimum:"1"`
	// 预计执行时间，不设置则为立即执行
	ExecTime *string `json:"exec_time,omitempty" xml:"exec_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 支持不同的文件模版：
	// MOBILE_MD5_WITH_MS_VARIABLE、MOBILE_MD5
	// 后续支持
	// DEVICE_MD5
	FileTemplate *string `json:"file_template,omitempty" xml:"file_template,omitempty" require:"true"`
}

func (s UploadUmktParamsFileRequest) String() string {
	return tea.Prettify(s)
}

func (s UploadUmktParamsFileRequest) GoString() string {
	return s.String()
}

func (s *UploadUmktParamsFileRequest) SetAuthToken(v string) *UploadUmktParamsFileRequest {
	s.AuthToken = &v
	return s
}

func (s *UploadUmktParamsFileRequest) SetProductInstanceId(v string) *UploadUmktParamsFileRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *UploadUmktParamsFileRequest) SetFileObject(v io.Reader) *UploadUmktParamsFileRequest {
	s.FileObject = v
	return s
}

func (s *UploadUmktParamsFileRequest) SetFileObjectName(v string) *UploadUmktParamsFileRequest {
	s.FileObjectName = &v
	return s
}

func (s *UploadUmktParamsFileRequest) SetFileId(v string) *UploadUmktParamsFileRequest {
	s.FileId = &v
	return s
}

func (s *UploadUmktParamsFileRequest) SetSceneStrategyId(v int64) *UploadUmktParamsFileRequest {
	s.SceneStrategyId = &v
	return s
}

func (s *UploadUmktParamsFileRequest) SetExecTime(v string) *UploadUmktParamsFileRequest {
	s.ExecTime = &v
	return s
}

func (s *UploadUmktParamsFileRequest) SetFileTemplate(v string) *UploadUmktParamsFileRequest {
	s.FileTemplate = &v
	return s
}

type UploadUmktParamsFileResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s UploadUmktParamsFileResponse) String() string {
	return tea.Prettify(s)
}

func (s UploadUmktParamsFileResponse) GoString() string {
	return s.String()
}

func (s *UploadUmktParamsFileResponse) SetReqMsgId(v string) *UploadUmktParamsFileResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UploadUmktParamsFileResponse) SetResultCode(v string) *UploadUmktParamsFileResponse {
	s.ResultCode = &v
	return s
}

func (s *UploadUmktParamsFileResponse) SetResultMsg(v string) *UploadUmktParamsFileResponse {
	s.ResultMsg = &v
	return s
}

type BatchqueryUmktRtMarketingRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 场景营销策略id
	SceneStrategyId *int64 `json:"scene_strategy_id,omitempty" xml:"scene_strategy_id,omitempty" require:"true"`
	// 用户列表传输模版
	QueryTemplate *string `json:"query_template,omitempty" xml:"query_template,omitempty"`
	// 用户查询凭证列表
	CustomerKeys []*string `json:"customer_keys,omitempty" xml:"customer_keys,omitempty" require:"true" type:"Repeated"`
	// 业务方流水号
	BizSerialNo *string `json:"biz_serial_no,omitempty" xml:"biz_serial_no,omitempty" require:"true"`
}

func (s BatchqueryUmktRtMarketingRequest) String() string {
	return tea.Prettify(s)
}

func (s BatchqueryUmktRtMarketingRequest) GoString() string {
	return s.String()
}

func (s *BatchqueryUmktRtMarketingRequest) SetAuthToken(v string) *BatchqueryUmktRtMarketingRequest {
	s.AuthToken = &v
	return s
}

func (s *BatchqueryUmktRtMarketingRequest) SetProductInstanceId(v string) *BatchqueryUmktRtMarketingRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *BatchqueryUmktRtMarketingRequest) SetSceneStrategyId(v int64) *BatchqueryUmktRtMarketingRequest {
	s.SceneStrategyId = &v
	return s
}

func (s *BatchqueryUmktRtMarketingRequest) SetQueryTemplate(v string) *BatchqueryUmktRtMarketingRequest {
	s.QueryTemplate = &v
	return s
}

func (s *BatchqueryUmktRtMarketingRequest) SetCustomerKeys(v []*string) *BatchqueryUmktRtMarketingRequest {
	s.CustomerKeys = v
	return s
}

func (s *BatchqueryUmktRtMarketingRequest) SetBizSerialNo(v string) *BatchqueryUmktRtMarketingRequest {
	s.BizSerialNo = &v
	return s
}

type BatchqueryUmktRtMarketingResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 处理是否成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
	// 实时营销单条结果
	QueryResult []*CustomerUmktInfoModel `json:"query_result,omitempty" xml:"query_result,omitempty" type:"Repeated"`
}

func (s BatchqueryUmktRtMarketingResponse) String() string {
	return tea.Prettify(s)
}

func (s BatchqueryUmktRtMarketingResponse) GoString() string {
	return s.String()
}

func (s *BatchqueryUmktRtMarketingResponse) SetReqMsgId(v string) *BatchqueryUmktRtMarketingResponse {
	s.ReqMsgId = &v
	return s
}

func (s *BatchqueryUmktRtMarketingResponse) SetResultCode(v string) *BatchqueryUmktRtMarketingResponse {
	s.ResultCode = &v
	return s
}

func (s *BatchqueryUmktRtMarketingResponse) SetResultMsg(v string) *BatchqueryUmktRtMarketingResponse {
	s.ResultMsg = &v
	return s
}

func (s *BatchqueryUmktRtMarketingResponse) SetSuccess(v bool) *BatchqueryUmktRtMarketingResponse {
	s.Success = &v
	return s
}

func (s *BatchqueryUmktRtMarketingResponse) SetQueryResult(v []*CustomerUmktInfoModel) *BatchqueryUmktRtMarketingResponse {
	s.QueryResult = v
	return s
}

type SyncUmktRtEventresultRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 详细事件明细
	Detail []*EventResultSyncDetail `json:"detail,omitempty" xml:"detail,omitempty" require:"true" type:"Repeated"`
}

func (s SyncUmktRtEventresultRequest) String() string {
	return tea.Prettify(s)
}

func (s SyncUmktRtEventresultRequest) GoString() string {
	return s.String()
}

func (s *SyncUmktRtEventresultRequest) SetAuthToken(v string) *SyncUmktRtEventresultRequest {
	s.AuthToken = &v
	return s
}

func (s *SyncUmktRtEventresultRequest) SetProductInstanceId(v string) *SyncUmktRtEventresultRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SyncUmktRtEventresultRequest) SetDetail(v []*EventResultSyncDetail) *SyncUmktRtEventresultRequest {
	s.Detail = v
	return s
}

type SyncUmktRtEventresultResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s SyncUmktRtEventresultResponse) String() string {
	return tea.Prettify(s)
}

func (s SyncUmktRtEventresultResponse) GoString() string {
	return s.String()
}

func (s *SyncUmktRtEventresultResponse) SetReqMsgId(v string) *SyncUmktRtEventresultResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SyncUmktRtEventresultResponse) SetResultCode(v string) *SyncUmktRtEventresultResponse {
	s.ResultCode = &v
	return s
}

func (s *SyncUmktRtEventresultResponse) SetResultMsg(v string) *SyncUmktRtEventresultResponse {
	s.ResultMsg = &v
	return s
}

type ImportUmktSceneUploadRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 需要刷新的key
	Key *string `json:"key,omitempty" xml:"key,omitempty" require:"true"`
	// 需要刷新的value，可能是json格式
	Value *string `json:"value,omitempty" xml:"value,omitempty" require:"true"`
}

func (s ImportUmktSceneUploadRequest) String() string {
	return tea.Prettify(s)
}

func (s ImportUmktSceneUploadRequest) GoString() string {
	return s.String()
}

func (s *ImportUmktSceneUploadRequest) SetAuthToken(v string) *ImportUmktSceneUploadRequest {
	s.AuthToken = &v
	return s
}

func (s *ImportUmktSceneUploadRequest) SetProductInstanceId(v string) *ImportUmktSceneUploadRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ImportUmktSceneUploadRequest) SetKey(v string) *ImportUmktSceneUploadRequest {
	s.Key = &v
	return s
}

func (s *ImportUmktSceneUploadRequest) SetValue(v string) *ImportUmktSceneUploadRequest {
	s.Value = &v
	return s
}

type ImportUmktSceneUploadResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 请求结果
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
	// 场景构建结果体
	UploadResult *StrategyUploadResult `json:"upload_result,omitempty" xml:"upload_result,omitempty"`
}

func (s ImportUmktSceneUploadResponse) String() string {
	return tea.Prettify(s)
}

func (s ImportUmktSceneUploadResponse) GoString() string {
	return s.String()
}

func (s *ImportUmktSceneUploadResponse) SetReqMsgId(v string) *ImportUmktSceneUploadResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ImportUmktSceneUploadResponse) SetResultCode(v string) *ImportUmktSceneUploadResponse {
	s.ResultCode = &v
	return s
}

func (s *ImportUmktSceneUploadResponse) SetResultMsg(v string) *ImportUmktSceneUploadResponse {
	s.ResultMsg = &v
	return s
}

func (s *ImportUmktSceneUploadResponse) SetSuccess(v bool) *ImportUmktSceneUploadResponse {
	s.Success = &v
	return s
}

func (s *ImportUmktSceneUploadResponse) SetUploadResult(v *StrategyUploadResult) *ImportUmktSceneUploadResponse {
	s.UploadResult = v
	return s
}

type BatchqueryUmktRtTailmarketingRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 营销计划id
	PlanId *string `json:"plan_id,omitempty" xml:"plan_id,omitempty" require:"true"`
	//
	// 用户列表传输模版
	QueryTemplate *string `json:"query_template,omitempty" xml:"query_template,omitempty" require:"true"`
	//
	// 用户查询凭证列表
	CustomerKeys []*string `json:"customer_keys,omitempty" xml:"customer_keys,omitempty" require:"true" type:"Repeated"`
	// 业务方流水号
	BizSerialNo *string `json:"biz_serial_no,omitempty" xml:"biz_serial_no,omitempty" require:"true"`
}

func (s BatchqueryUmktRtTailmarketingRequest) String() string {
	return tea.Prettify(s)
}

func (s BatchqueryUmktRtTailmarketingRequest) GoString() string {
	return s.String()
}

func (s *BatchqueryUmktRtTailmarketingRequest) SetAuthToken(v string) *BatchqueryUmktRtTailmarketingRequest {
	s.AuthToken = &v
	return s
}

func (s *BatchqueryUmktRtTailmarketingRequest) SetProductInstanceId(v string) *BatchqueryUmktRtTailmarketingRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *BatchqueryUmktRtTailmarketingRequest) SetPlanId(v string) *BatchqueryUmktRtTailmarketingRequest {
	s.PlanId = &v
	return s
}

func (s *BatchqueryUmktRtTailmarketingRequest) SetQueryTemplate(v string) *BatchqueryUmktRtTailmarketingRequest {
	s.QueryTemplate = &v
	return s
}

func (s *BatchqueryUmktRtTailmarketingRequest) SetCustomerKeys(v []*string) *BatchqueryUmktRtTailmarketingRequest {
	s.CustomerKeys = v
	return s
}

func (s *BatchqueryUmktRtTailmarketingRequest) SetBizSerialNo(v string) *BatchqueryUmktRtTailmarketingRequest {
	s.BizSerialNo = &v
	return s
}

type BatchqueryUmktRtTailmarketingResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	//
	// 实时营销单条结果
	QueryResult []*CustomerUmktInfoModel `json:"query_result,omitempty" xml:"query_result,omitempty" type:"Repeated"`
}

func (s BatchqueryUmktRtTailmarketingResponse) String() string {
	return tea.Prettify(s)
}

func (s BatchqueryUmktRtTailmarketingResponse) GoString() string {
	return s.String()
}

func (s *BatchqueryUmktRtTailmarketingResponse) SetReqMsgId(v string) *BatchqueryUmktRtTailmarketingResponse {
	s.ReqMsgId = &v
	return s
}

func (s *BatchqueryUmktRtTailmarketingResponse) SetResultCode(v string) *BatchqueryUmktRtTailmarketingResponse {
	s.ResultCode = &v
	return s
}

func (s *BatchqueryUmktRtTailmarketingResponse) SetResultMsg(v string) *BatchqueryUmktRtTailmarketingResponse {
	s.ResultMsg = &v
	return s
}

func (s *BatchqueryUmktRtTailmarketingResponse) SetQueryResult(v []*CustomerUmktInfoModel) *BatchqueryUmktRtTailmarketingResponse {
	s.QueryResult = v
	return s
}

type QueryUmktScenestrategyTestRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 场景策略id
	SceneStrategyId *int64 `json:"scene_strategy_id,omitempty" xml:"scene_strategy_id,omitempty" require:"true"`
	// 查询模版
	QueryTemplate *string `json:"query_template,omitempty" xml:"query_template,omitempty"`
	// 用户查询凭证列表
	//
	CustomerKeys []*string `json:"customer_keys,omitempty" xml:"customer_keys,omitempty" require:"true" type:"Repeated"`
	// 业务方流水号
	BizSerialNo *string `json:"biz_serial_no,omitempty" xml:"biz_serial_no,omitempty" require:"true"`
	// 伪装租户id
	PretendTenant *string `json:"pretend_tenant,omitempty" xml:"pretend_tenant,omitempty" require:"true"`
}

func (s QueryUmktScenestrategyTestRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryUmktScenestrategyTestRequest) GoString() string {
	return s.String()
}

func (s *QueryUmktScenestrategyTestRequest) SetAuthToken(v string) *QueryUmktScenestrategyTestRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryUmktScenestrategyTestRequest) SetProductInstanceId(v string) *QueryUmktScenestrategyTestRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryUmktScenestrategyTestRequest) SetSceneStrategyId(v int64) *QueryUmktScenestrategyTestRequest {
	s.SceneStrategyId = &v
	return s
}

func (s *QueryUmktScenestrategyTestRequest) SetQueryTemplate(v string) *QueryUmktScenestrategyTestRequest {
	s.QueryTemplate = &v
	return s
}

func (s *QueryUmktScenestrategyTestRequest) SetCustomerKeys(v []*string) *QueryUmktScenestrategyTestRequest {
	s.CustomerKeys = v
	return s
}

func (s *QueryUmktScenestrategyTestRequest) SetBizSerialNo(v string) *QueryUmktScenestrategyTestRequest {
	s.BizSerialNo = &v
	return s
}

func (s *QueryUmktScenestrategyTestRequest) SetPretendTenant(v string) *QueryUmktScenestrategyTestRequest {
	s.PretendTenant = &v
	return s
}

type QueryUmktScenestrategyTestResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 处理结果
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
	// 实时营销单条结果
	QueryResult []*CustomerUmktInfoModel `json:"query_result,omitempty" xml:"query_result,omitempty" type:"Repeated"`
}

func (s QueryUmktScenestrategyTestResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryUmktScenestrategyTestResponse) GoString() string {
	return s.String()
}

func (s *QueryUmktScenestrategyTestResponse) SetReqMsgId(v string) *QueryUmktScenestrategyTestResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryUmktScenestrategyTestResponse) SetResultCode(v string) *QueryUmktScenestrategyTestResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryUmktScenestrategyTestResponse) SetResultMsg(v string) *QueryUmktScenestrategyTestResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryUmktScenestrategyTestResponse) SetSuccess(v bool) *QueryUmktScenestrategyTestResponse {
	s.Success = &v
	return s
}

func (s *QueryUmktScenestrategyTestResponse) SetQueryResult(v []*CustomerUmktInfoModel) *QueryUmktScenestrategyTestResponse {
	s.QueryResult = v
	return s
}

type CreateAntcloudGatewayxFileUploadRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 上传文件作用的openapi method
	ApiCode *string `json:"api_code,omitempty" xml:"api_code,omitempty" require:"true"`
	// 文件标签，多个标签;分割
	FileLabel *string `json:"file_label,omitempty" xml:"file_label,omitempty" maxLength:"100"`
	// 自定义的文件元数据
	FileMetadata *string `json:"file_metadata,omitempty" xml:"file_metadata,omitempty" maxLength:"1000"`
	// 文件名，不传则随机生成文件名
	FileName *string `json:"file_name,omitempty" xml:"file_name,omitempty" maxLength:"100"`
	// 文件的多媒体类型
	MimeType *string `json:"mime_type,omitempty" xml:"mime_type,omitempty"`
	// 产品方的api归属集群，即productInstanceId
	ApiCluster *string `json:"api_cluster,omitempty" xml:"api_cluster,omitempty"`
}

func (s CreateAntcloudGatewayxFileUploadRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateAntcloudGatewayxFileUploadRequest) GoString() string {
	return s.String()
}

func (s *CreateAntcloudGatewayxFileUploadRequest) SetAuthToken(v string) *CreateAntcloudGatewayxFileUploadRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateAntcloudGatewayxFileUploadRequest) SetApiCode(v string) *CreateAntcloudGatewayxFileUploadRequest {
	s.ApiCode = &v
	return s
}

func (s *CreateAntcloudGatewayxFileUploadRequest) SetFileLabel(v string) *CreateAntcloudGatewayxFileUploadRequest {
	s.FileLabel = &v
	return s
}

func (s *CreateAntcloudGatewayxFileUploadRequest) SetFileMetadata(v string) *CreateAntcloudGatewayxFileUploadRequest {
	s.FileMetadata = &v
	return s
}

func (s *CreateAntcloudGatewayxFileUploadRequest) SetFileName(v string) *CreateAntcloudGatewayxFileUploadRequest {
	s.FileName = &v
	return s
}

func (s *CreateAntcloudGatewayxFileUploadRequest) SetMimeType(v string) *CreateAntcloudGatewayxFileUploadRequest {
	s.MimeType = &v
	return s
}

func (s *CreateAntcloudGatewayxFileUploadRequest) SetApiCluster(v string) *CreateAntcloudGatewayxFileUploadRequest {
	s.ApiCluster = &v
	return s
}

type CreateAntcloudGatewayxFileUploadResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 上传有效期
	ExpiredTime *string `json:"expired_time,omitempty" xml:"expired_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 32位文件唯一id
	FileId *string `json:"file_id,omitempty" xml:"file_id,omitempty"`
	// 放入http请求头里
	UploadHeaders []*XNameValuePair `json:"upload_headers,omitempty" xml:"upload_headers,omitempty" type:"Repeated"`
	// 文件上传地址
	UploadUrl *string `json:"upload_url,omitempty" xml:"upload_url,omitempty"`
}

func (s CreateAntcloudGatewayxFileUploadResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateAntcloudGatewayxFileUploadResponse) GoString() string {
	return s.String()
}

func (s *CreateAntcloudGatewayxFileUploadResponse) SetReqMsgId(v string) *CreateAntcloudGatewayxFileUploadResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateAntcloudGatewayxFileUploadResponse) SetResultCode(v string) *CreateAntcloudGatewayxFileUploadResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateAntcloudGatewayxFileUploadResponse) SetResultMsg(v string) *CreateAntcloudGatewayxFileUploadResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateAntcloudGatewayxFileUploadResponse) SetExpiredTime(v string) *CreateAntcloudGatewayxFileUploadResponse {
	s.ExpiredTime = &v
	return s
}

func (s *CreateAntcloudGatewayxFileUploadResponse) SetFileId(v string) *CreateAntcloudGatewayxFileUploadResponse {
	s.FileId = &v
	return s
}

func (s *CreateAntcloudGatewayxFileUploadResponse) SetUploadHeaders(v []*XNameValuePair) *CreateAntcloudGatewayxFileUploadResponse {
	s.UploadHeaders = v
	return s
}

func (s *CreateAntcloudGatewayxFileUploadResponse) SetUploadUrl(v string) *CreateAntcloudGatewayxFileUploadResponse {
	s.UploadUrl = &v
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
				"sdk_version":      tea.String("1.12.9"),
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
 * Description: 外部客户业务接入风控+，进行风险识别和风险决策。
 * Summary: 策略咨询服务输出
 */
func (client *Client) QuerySecurityPolicy(request *QuerySecurityPolicyRequest) (_result *QuerySecurityPolicyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QuerySecurityPolicyResponse{}
	_body, _err := client.QuerySecurityPolicyEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 外部客户业务接入风控+，进行风险识别和风险决策。
 * Summary: 策略咨询服务输出
 */
func (client *Client) QuerySecurityPolicyEx(request *QuerySecurityPolicyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QuerySecurityPolicyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QuerySecurityPolicyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.security.policy.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 向风控发送异步安全数据
 * Summary: 异步发送安全数据
 */
func (client *Client) SendSecurityData(request *SendSecurityDataRequest) (_result *SendSecurityDataResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SendSecurityDataResponse{}
	_body, _err := client.SendSecurityDataEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 向风控发送异步安全数据
 * Summary: 异步发送安全数据
 */
func (client *Client) SendSecurityDataEx(request *SendSecurityDataRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SendSecurityDataResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SendSecurityDataResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.security.data.send"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 外部客户业务接入蚂蚁风控，进行风险识别和风险决策输出核身后，进行二次确认
 * Summary: 安全策略确认服务输出
 */
func (client *Client) ConfirmSecurityPolicy(request *ConfirmSecurityPolicyRequest) (_result *ConfirmSecurityPolicyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ConfirmSecurityPolicyResponse{}
	_body, _err := client.ConfirmSecurityPolicyEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 外部客户业务接入蚂蚁风控，进行风险识别和风险决策输出核身后，进行二次确认
 * Summary: 安全策略确认服务输出
 */
func (client *Client) ConfirmSecurityPolicyEx(request *ConfirmSecurityPolicyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ConfirmSecurityPolicyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ConfirmSecurityPolicyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.security.policy.confirm"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 外部客户业务接入风控+，进行人机识别判断。
 * Summary: 策略咨询服务输出
 */
func (client *Client) CheckSecurityRds(request *CheckSecurityRdsRequest) (_result *CheckSecurityRdsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CheckSecurityRdsResponse{}
	_body, _err := client.CheckSecurityRdsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 外部客户业务接入风控+，进行人机识别判断。
 * Summary: 策略咨询服务输出
 */
func (client *Client) CheckSecurityRdsEx(request *CheckSecurityRdsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CheckSecurityRdsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CheckSecurityRdsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.security.rds.check"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 外部客户业务接入风控+，请求安全数据如ip画像等。
 * Summary: 安全数据服务输出
 */
func (client *Client) QuerySecurityData(request *QuerySecurityDataRequest) (_result *QuerySecurityDataResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QuerySecurityDataResponse{}
	_body, _err := client.QuerySecurityDataEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 外部客户业务接入风控+，请求安全数据如ip画像等。
 * Summary: 安全数据服务输出
 */
func (client *Client) QuerySecurityDataEx(request *QuerySecurityDataRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QuerySecurityDataResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QuerySecurityDataResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.security.data.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 外部客户数据校验接口，比如端防护
 * Summary: 安全数据服务校验
 */
func (client *Client) CheckSecurityData(request *CheckSecurityDataRequest) (_result *CheckSecurityDataResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CheckSecurityDataResponse{}
	_body, _err := client.CheckSecurityDataEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 外部客户数据校验接口，比如端防护
 * Summary: 安全数据服务校验
 */
func (client *Client) CheckSecurityDataEx(request *CheckSecurityDataRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CheckSecurityDataResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CheckSecurityDataResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.security.data.check"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 反欺诈风险数据服务请求执行
 * Summary: 反欺诈风险数据服务请求执行
 */
func (client *Client) ExecSecurityRiskdataservice(request *ExecSecurityRiskdataserviceRequest) (_result *ExecSecurityRiskdataserviceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ExecSecurityRiskdataserviceResponse{}
	_body, _err := client.ExecSecurityRiskdataserviceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 反欺诈风险数据服务请求执行
 * Summary: 反欺诈风险数据服务请求执行
 */
func (client *Client) ExecSecurityRiskdataserviceEx(request *ExecSecurityRiskdataserviceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ExecSecurityRiskdataserviceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecSecurityRiskdataserviceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.security.riskdataservice.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 天枢信贷业务系统线下测试环境测试接口
 * Summary: 天枢信贷业务系统线下测试接口
 */
func (client *Client) QueryDubheTest(request *QueryDubheTestRequest) (_result *QueryDubheTestResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDubheTestResponse{}
	_body, _err := client.QueryDubheTestEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 天枢信贷业务系统线下测试环境测试接口
 * Summary: 天枢信贷业务系统线下测试接口
 */
func (client *Client) QueryDubheTestEx(request *QueryDubheTestRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDubheTestResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDubheTestResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.dubhe.test.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 通过客户三要素信息查询资金方代码(资金路由)
 * Summary: 天枢系统资金方代码(资金路由)查询
 */
func (client *Client) QueryDubheRouterFundrouter(request *QueryDubheRouterFundrouterRequest) (_result *QueryDubheRouterFundrouterResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDubheRouterFundrouterResponse{}
	_body, _err := client.QueryDubheRouterFundrouterEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 通过客户三要素信息查询资金方代码(资金路由)
 * Summary: 天枢系统资金方代码(资金路由)查询
 */
func (client *Client) QueryDubheRouterFundrouterEx(request *QueryDubheRouterFundrouterRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDubheRouterFundrouterResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDubheRouterFundrouterResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.dubhe.router.fundrouter.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 天枢系统授信申请接口
 * Summary: 天枢系统授信申请接口
 */
func (client *Client) ApplyDubheCredit(request *ApplyDubheCreditRequest) (_result *ApplyDubheCreditResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ApplyDubheCreditResponse{}
	_body, _err := client.ApplyDubheCreditEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 天枢系统授信申请接口
 * Summary: 天枢系统授信申请接口
 */
func (client *Client) ApplyDubheCreditEx(request *ApplyDubheCreditRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ApplyDubheCreditResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ApplyDubheCreditResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.dubhe.credit.apply"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 天枢系统授信额度查询接口
 * Summary: 天枢系统授信额度查询接口
 */
func (client *Client) QueryDubheCreditStatus(request *QueryDubheCreditStatusRequest) (_result *QueryDubheCreditStatusResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDubheCreditStatusResponse{}
	_body, _err := client.QueryDubheCreditStatusEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 天枢系统授信额度查询接口
 * Summary: 天枢系统授信额度查询接口
 */
func (client *Client) QueryDubheCreditStatusEx(request *QueryDubheCreditStatusRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDubheCreditStatusResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDubheCreditStatusResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.dubhe.credit.status.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 天枢系统还款计划试算，根据借款金额和期数计算还款计划
 * Summary: 天枢系统还款计划试算
 */
func (client *Client) CountDubheRepayReftrial(request *CountDubheRepayReftrialRequest) (_result *CountDubheRepayReftrialResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CountDubheRepayReftrialResponse{}
	_body, _err := client.CountDubheRepayReftrialEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 天枢系统还款计划试算，根据借款金额和期数计算还款计划
 * Summary: 天枢系统还款计划试算
 */
func (client *Client) CountDubheRepayReftrialEx(request *CountDubheRepayReftrialRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CountDubheRepayReftrialResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CountDubheRepayReftrialResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.dubhe.repay.reftrial.count"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 天枢系统还款计划查询，根据申请订单查询还款计划
 * Summary: 天枢系统还款计划查询
 */
func (client *Client) QueryDubheRepayList(request *QueryDubheRepayListRequest) (_result *QueryDubheRepayListResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDubheRepayListResponse{}
	_body, _err := client.QueryDubheRepayListEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 天枢系统还款计划查询，根据申请订单查询还款计划
 * Summary: 天枢系统还款计划查询
 */
func (client *Client) QueryDubheRepayListEx(request *QueryDubheRepayListRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDubheRepayListResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDubheRepayListResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.dubhe.repay.list.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 天枢系统用信申请接口
 * Summary: 天枢系统用信申请接口
 */
func (client *Client) ApplyDubheUsecredit(request *ApplyDubheUsecreditRequest) (_result *ApplyDubheUsecreditResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ApplyDubheUsecreditResponse{}
	_body, _err := client.ApplyDubheUsecreditEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 天枢系统用信申请接口
 * Summary: 天枢系统用信申请接口
 */
func (client *Client) ApplyDubheUsecreditEx(request *ApplyDubheUsecreditRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ApplyDubheUsecreditResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ApplyDubheUsecreditResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.dubhe.usecredit.apply"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 天枢系统用信申请状态查询，返回用信详情及还款计划
 * Summary: 天枢系统用信申请状态查询
 */
func (client *Client) QueryDubheUsecreditStatus(request *QueryDubheUsecreditStatusRequest) (_result *QueryDubheUsecreditStatusResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDubheUsecreditStatusResponse{}
	_body, _err := client.QueryDubheUsecreditStatusEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 天枢系统用信申请状态查询，返回用信详情及还款计划
 * Summary: 天枢系统用信申请状态查询
 */
func (client *Client) QueryDubheUsecreditStatusEx(request *QueryDubheUsecreditStatusRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDubheUsecreditStatusResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDubheUsecreditStatusResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.dubhe.usecredit.status.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 天枢系统还款试算，根据借据号计算还款金额
 * Summary: 天枢系统还款试算
 */
func (client *Client) CountDubheRepayTrial(request *CountDubheRepayTrialRequest) (_result *CountDubheRepayTrialResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CountDubheRepayTrialResponse{}
	_body, _err := client.CountDubheRepayTrialEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 天枢系统还款试算，根据借据号计算还款金额
 * Summary: 天枢系统还款试算
 */
func (client *Client) CountDubheRepayTrialEx(request *CountDubheRepayTrialRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CountDubheRepayTrialResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CountDubheRepayTrialResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.dubhe.repay.trial.count"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 天枢系统主动还款（收银台）接口
 * Summary: 天枢系统主动还款（收银台）接口
 */
func (client *Client) RepayDubheRepayCheckstand(request *RepayDubheRepayCheckstandRequest) (_result *RepayDubheRepayCheckstandResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &RepayDubheRepayCheckstandResponse{}
	_body, _err := client.RepayDubheRepayCheckstandEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 天枢系统主动还款（收银台）接口
 * Summary: 天枢系统主动还款（收银台）接口
 */
func (client *Client) RepayDubheRepayCheckstandEx(request *RepayDubheRepayCheckstandRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *RepayDubheRepayCheckstandResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &RepayDubheRepayCheckstandResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.dubhe.repay.checkstand.repay"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 天枢系统还款信息查询
 * Summary: 天枢系统还款信息查询
 */
func (client *Client) QueryDubheRepayInfo(request *QueryDubheRepayInfoRequest) (_result *QueryDubheRepayInfoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDubheRepayInfoResponse{}
	_body, _err := client.QueryDubheRepayInfoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 天枢系统还款信息查询
 * Summary: 天枢系统还款信息查询
 */
func (client *Client) QueryDubheRepayInfoEx(request *QueryDubheRepayInfoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDubheRepayInfoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDubheRepayInfoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.dubhe.repay.info.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 天枢系统客户信息变更接口（变更客户三要素信息）
 * Summary: 天枢系统客户信息变更接口
 */
func (client *Client) UpdateDubheCustomerInfo(request *UpdateDubheCustomerInfoRequest) (_result *UpdateDubheCustomerInfoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateDubheCustomerInfoResponse{}
	_body, _err := client.UpdateDubheCustomerInfoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 天枢系统客户信息变更接口（变更客户三要素信息）
 * Summary: 天枢系统客户信息变更接口
 */
func (client *Client) UpdateDubheCustomerInfoEx(request *UpdateDubheCustomerInfoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateDubheCustomerInfoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateDubheCustomerInfoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.dubhe.customer.info.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 天枢系统协议签约申请(支付宝
 * Summary: 天枢系统协议签约申请(支付宝)
 */
func (client *Client) ApplyDubheCustomerAgreementsign(request *ApplyDubheCustomerAgreementsignRequest) (_result *ApplyDubheCustomerAgreementsignResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ApplyDubheCustomerAgreementsignResponse{}
	_body, _err := client.ApplyDubheCustomerAgreementsignEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 天枢系统协议签约申请(支付宝
 * Summary: 天枢系统协议签约申请(支付宝)
 */
func (client *Client) ApplyDubheCustomerAgreementsignEx(request *ApplyDubheCustomerAgreementsignRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ApplyDubheCustomerAgreementsignResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ApplyDubheCustomerAgreementsignResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.dubhe.customer.agreementsign.apply"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 天枢系统协议签约查询(支付宝)
 * Summary: 天枢系统协议签约查询(支付宝)
 */
func (client *Client) QueryDubheCustomerAgreementsign(request *QueryDubheCustomerAgreementsignRequest) (_result *QueryDubheCustomerAgreementsignResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDubheCustomerAgreementsignResponse{}
	_body, _err := client.QueryDubheCustomerAgreementsignEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 天枢系统协议签约查询(支付宝)
 * Summary: 天枢系统协议签约查询(支付宝)
 */
func (client *Client) QueryDubheCustomerAgreementsignEx(request *QueryDubheCustomerAgreementsignRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDubheCustomerAgreementsignResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDubheCustomerAgreementsignResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.dubhe.customer.agreementsign.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 天枢信贷业务系统主动还款（直接代扣）接口
 * Summary: 天枢信贷业务系统主动还款（直接代扣）接口
 */
func (client *Client) RepayDubheRepayWithhold(request *RepayDubheRepayWithholdRequest) (_result *RepayDubheRepayWithholdResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &RepayDubheRepayWithholdResponse{}
	_body, _err := client.RepayDubheRepayWithholdEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 天枢信贷业务系统主动还款（直接代扣）接口
 * Summary: 天枢信贷业务系统主动还款（直接代扣）接口
 */
func (client *Client) RepayDubheRepayWithholdEx(request *RepayDubheRepayWithholdRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *RepayDubheRepayWithholdResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &RepayDubheRepayWithholdResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.dubhe.repay.withhold.repay"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 天枢系统合同获取
 * Summary: 天枢系统合同获取
 */
func (client *Client) QueryDubheSearchContract(request *QueryDubheSearchContractRequest) (_result *QueryDubheSearchContractResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDubheSearchContractResponse{}
	_body, _err := client.QueryDubheSearchContractEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 天枢系统合同获取
 * Summary: 天枢系统合同获取
 */
func (client *Client) QueryDubheSearchContractEx(request *QueryDubheSearchContractRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDubheSearchContractResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDubheSearchContractResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.dubhe.search.contract.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 天枢逾期信息查询接口
 * Summary: 逾期信息查询
 */
func (client *Client) QueryDubheReceiptOverdue(request *QueryDubheReceiptOverdueRequest) (_result *QueryDubheReceiptOverdueResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDubheReceiptOverdueResponse{}
	_body, _err := client.QueryDubheReceiptOverdueEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 天枢逾期信息查询接口
 * Summary: 逾期信息查询
 */
func (client *Client) QueryDubheReceiptOverdueEx(request *QueryDubheReceiptOverdueRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDubheReceiptOverdueResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDubheReceiptOverdueResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.dubhe.receipt.overdue.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 天枢发送短信接口，适用于一个模板相同参数
 * Summary: 天枢发送短信接口
 */
func (client *Client) SendDubbridgeSms(request *SendDubbridgeSmsRequest) (_result *SendDubbridgeSmsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SendDubbridgeSmsResponse{}
	_body, _err := client.SendDubbridgeSmsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 天枢发送短信接口，适用于一个模板相同参数
 * Summary: 天枢发送短信接口
 */
func (client *Client) SendDubbridgeSmsEx(request *SendDubbridgeSmsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SendDubbridgeSmsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SendDubbridgeSmsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.dubbridge.sms.send"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 天枢批量发送短信接口，适合一个短信模板多个不同参数场景
 * Summary: 天枢批量发送短信接口
 */
func (client *Client) SendDubbridgeSmsBatch(request *SendDubbridgeSmsBatchRequest) (_result *SendDubbridgeSmsBatchResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SendDubbridgeSmsBatchResponse{}
	_body, _err := client.SendDubbridgeSmsBatchEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 天枢批量发送短信接口，适合一个短信模板多个不同参数场景
 * Summary: 天枢批量发送短信接口
 */
func (client *Client) SendDubbridgeSmsBatchEx(request *SendDubbridgeSmsBatchRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SendDubbridgeSmsBatchResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SendDubbridgeSmsBatchResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.dubbridge.sms.batch.send"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 资金路由接口，获取资金方编号
 * Summary: 天枢系统资金方代码(资金路由)查询
 */
func (client *Client) QueryDubbridgeRouterFundrouter(request *QueryDubbridgeRouterFundrouterRequest) (_result *QueryDubbridgeRouterFundrouterResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDubbridgeRouterFundrouterResponse{}
	_body, _err := client.QueryDubbridgeRouterFundrouterEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 资金路由接口，获取资金方编号
 * Summary: 天枢系统资金方代码(资金路由)查询
 */
func (client *Client) QueryDubbridgeRouterFundrouterEx(request *QueryDubbridgeRouterFundrouterRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDubbridgeRouterFundrouterResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDubbridgeRouterFundrouterResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.dubbridge.router.fundrouter.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 天枢系统授信申请接口
 * Summary: 天枢系统授信申请接口
 */
func (client *Client) ApplyDubbridgeCredit(request *ApplyDubbridgeCreditRequest) (_result *ApplyDubbridgeCreditResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ApplyDubbridgeCreditResponse{}
	_body, _err := client.ApplyDubbridgeCreditEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 天枢系统授信申请接口
 * Summary: 天枢系统授信申请接口
 */
func (client *Client) ApplyDubbridgeCreditEx(request *ApplyDubbridgeCreditRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ApplyDubbridgeCreditResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ApplyDubbridgeCreditResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.dubbridge.credit.apply"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 为流量方提供文件上传接口，用于申请件影像资料上传
 * Summary: 天枢文件上传
 */
func (client *Client) UploadDubbridgeFile(request *UploadDubbridgeFileRequest) (_result *UploadDubbridgeFileResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UploadDubbridgeFileResponse{}
	_body, _err := client.UploadDubbridgeFileEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 为流量方提供文件上传接口，用于申请件影像资料上传
 * Summary: 天枢文件上传
 */
func (client *Client) UploadDubbridgeFileEx(request *UploadDubbridgeFileRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UploadDubbridgeFileResponse, _err error) {
	if !tea.BoolValue(util.IsUnset(request.FileObject)) {
		uploadReq := &CreateAntcloudGatewayxFileUploadRequest{
			AuthToken: request.AuthToken,
			ApiCode:   tea.String("riskplus.dubbridge.file.upload"),
			FileName:  request.FileObjectName,
		}
		uploadResp, _err := client.CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime)
		if _err != nil {
			return _result, _err
		}

		if !tea.BoolValue(antchainutil.IsSuccess(uploadResp.ResultCode, tea.String("ok"))) {
			uploadDubbridgeFileResponse := &UploadDubbridgeFileResponse{
				ReqMsgId:   uploadResp.ReqMsgId,
				ResultCode: uploadResp.ResultCode,
				ResultMsg:  uploadResp.ResultMsg,
			}
			_result = uploadDubbridgeFileResponse
			return _result, _err
		}

		uploadHeaders := antchainutil.ParseUploadHeaders(uploadResp.UploadHeaders)
		_err = antchainutil.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl)
		if _err != nil {
			return _result, _err
		}
		request.FileId = uploadResp.FileId
	}

	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UploadDubbridgeFileResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.dubbridge.file.upload"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 代扣签约绑卡接口
 * Summary: 代扣协议签约申请(银行卡绑卡)
 */
func (client *Client) BindDubbridgeCustomerBankcard(request *BindDubbridgeCustomerBankcardRequest) (_result *BindDubbridgeCustomerBankcardResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &BindDubbridgeCustomerBankcardResponse{}
	_body, _err := client.BindDubbridgeCustomerBankcardEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 代扣签约绑卡接口
 * Summary: 代扣协议签约申请(银行卡绑卡)
 */
func (client *Client) BindDubbridgeCustomerBankcardEx(request *BindDubbridgeCustomerBankcardRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *BindDubbridgeCustomerBankcardResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &BindDubbridgeCustomerBankcardResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.dubbridge.customer.bankcard.bind"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 代扣协议签约提交(银行卡绑卡)
 * Summary: 代扣协议签约校验(银行卡绑卡)
 */
func (client *Client) VerifyDubbridgeCustomerBankcard(request *VerifyDubbridgeCustomerBankcardRequest) (_result *VerifyDubbridgeCustomerBankcardResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &VerifyDubbridgeCustomerBankcardResponse{}
	_body, _err := client.VerifyDubbridgeCustomerBankcardEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 代扣协议签约提交(银行卡绑卡)
 * Summary: 代扣协议签约校验(银行卡绑卡)
 */
func (client *Client) VerifyDubbridgeCustomerBankcardEx(request *VerifyDubbridgeCustomerBankcardRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *VerifyDubbridgeCustomerBankcardResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &VerifyDubbridgeCustomerBankcardResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.dubbridge.customer.bankcard.verify"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 用于机构通道通用回调
 * Summary: 机构通道回调通用接口
 */
func (client *Client) NotifyDubbridgeDefininnerchannel(request *NotifyDubbridgeDefininnerchannelRequest) (_result *NotifyDubbridgeDefininnerchannelResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &NotifyDubbridgeDefininnerchannelResponse{}
	_body, _err := client.NotifyDubbridgeDefininnerchannelEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 用于机构通道通用回调
 * Summary: 机构通道回调通用接口
 */
func (client *Client) NotifyDubbridgeDefininnerchannelEx(request *NotifyDubbridgeDefininnerchannelRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *NotifyDubbridgeDefininnerchannelResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &NotifyDubbridgeDefininnerchannelResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.dubbridge.defininnerchannel.notify"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 天枢系统授信额度查询接口
 * Summary: 天枢系统授信额度查询接口
 */
func (client *Client) QueryDubbridgeCreditStatus(request *QueryDubbridgeCreditStatusRequest) (_result *QueryDubbridgeCreditStatusResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDubbridgeCreditStatusResponse{}
	_body, _err := client.QueryDubbridgeCreditStatusEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 天枢系统授信额度查询接口
 * Summary: 天枢系统授信额度查询接口
 */
func (client *Client) QueryDubbridgeCreditStatusEx(request *QueryDubbridgeCreditStatusRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDubbridgeCreditStatusResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDubbridgeCreditStatusResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.dubbridge.credit.status.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 天枢系统企业小微分查询
 * Summary: 天枢系统企业小微分查询
 */
func (client *Client) QueryDubbridgeRiskinfoEnterprisescore(request *QueryDubbridgeRiskinfoEnterprisescoreRequest) (_result *QueryDubbridgeRiskinfoEnterprisescoreResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDubbridgeRiskinfoEnterprisescoreResponse{}
	_body, _err := client.QueryDubbridgeRiskinfoEnterprisescoreEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 天枢系统企业小微分查询
 * Summary: 天枢系统企业小微分查询
 */
func (client *Client) QueryDubbridgeRiskinfoEnterprisescoreEx(request *QueryDubbridgeRiskinfoEnterprisescoreRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDubbridgeRiskinfoEnterprisescoreResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDubbridgeRiskinfoEnterprisescoreResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.dubbridge.riskinfo.enterprisescore.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 天枢系统风控信息通用查询
 * Summary: 天枢系统风控信息通用查询
 */
func (client *Client) QueryDubbridgeRiskinfoCommon(request *QueryDubbridgeRiskinfoCommonRequest) (_result *QueryDubbridgeRiskinfoCommonResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDubbridgeRiskinfoCommonResponse{}
	_body, _err := client.QueryDubbridgeRiskinfoCommonEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 天枢系统风控信息通用查询
 * Summary: 天枢系统风控信息通用查询
 */
func (client *Client) QueryDubbridgeRiskinfoCommonEx(request *QueryDubbridgeRiskinfoCommonRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDubbridgeRiskinfoCommonResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDubbridgeRiskinfoCommonResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.dubbridge.riskinfo.common.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 额度、利率、状态调整
 * Summary: 调额申请
 */
func (client *Client) UpdateDubbridgeInstitutionCredit(request *UpdateDubbridgeInstitutionCreditRequest) (_result *UpdateDubbridgeInstitutionCreditResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateDubbridgeInstitutionCreditResponse{}
	_body, _err := client.UpdateDubbridgeInstitutionCreditEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 额度、利率、状态调整
 * Summary: 调额申请
 */
func (client *Client) UpdateDubbridgeInstitutionCreditEx(request *UpdateDubbridgeInstitutionCreditRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateDubbridgeInstitutionCreditResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateDubbridgeInstitutionCreditResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.dubbridge.institution.credit.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 天枢企业经营数据查询
 * Summary: 天枢企业经营数据查询
 */
func (client *Client) QueryDubbridgeRiskinfoBusinessinfo(request *QueryDubbridgeRiskinfoBusinessinfoRequest) (_result *QueryDubbridgeRiskinfoBusinessinfoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDubbridgeRiskinfoBusinessinfoResponse{}
	_body, _err := client.QueryDubbridgeRiskinfoBusinessinfoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 天枢企业经营数据查询
 * Summary: 天枢企业经营数据查询
 */
func (client *Client) QueryDubbridgeRiskinfoBusinessinfoEx(request *QueryDubbridgeRiskinfoBusinessinfoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDubbridgeRiskinfoBusinessinfoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDubbridgeRiskinfoBusinessinfoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.dubbridge.riskinfo.businessinfo.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 天枢系统协议签约申请(支付宝）
 * Summary: 天枢系统协议签约申请(支付宝)
 */
func (client *Client) ApplyDubbridgeCustomerAgreementsign(request *ApplyDubbridgeCustomerAgreementsignRequest) (_result *ApplyDubbridgeCustomerAgreementsignResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ApplyDubbridgeCustomerAgreementsignResponse{}
	_body, _err := client.ApplyDubbridgeCustomerAgreementsignEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 天枢系统协议签约申请(支付宝）
 * Summary: 天枢系统协议签约申请(支付宝)
 */
func (client *Client) ApplyDubbridgeCustomerAgreementsignEx(request *ApplyDubbridgeCustomerAgreementsignRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ApplyDubbridgeCustomerAgreementsignResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ApplyDubbridgeCustomerAgreementsignResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.dubbridge.customer.agreementsign.apply"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 天枢系统是否授信查询
 * Summary: 天枢系统是否授信查询
 */
func (client *Client) QueryDubbridgeAccountStatus(request *QueryDubbridgeAccountStatusRequest) (_result *QueryDubbridgeAccountStatusResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDubbridgeAccountStatusResponse{}
	_body, _err := client.QueryDubbridgeAccountStatusEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 天枢系统是否授信查询
 * Summary: 天枢系统是否授信查询
 */
func (client *Client) QueryDubbridgeAccountStatusEx(request *QueryDubbridgeAccountStatusRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDubbridgeAccountStatusResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDubbridgeAccountStatusResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.dubbridge.account.status.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 天枢系统校验是否联登
 * Summary: 天枢系统校验是否联登
 */
func (client *Client) QueryDubbridgeAccountCustom(request *QueryDubbridgeAccountCustomRequest) (_result *QueryDubbridgeAccountCustomResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDubbridgeAccountCustomResponse{}
	_body, _err := client.QueryDubbridgeAccountCustomEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 天枢系统校验是否联登
 * Summary: 天枢系统校验是否联登
 */
func (client *Client) QueryDubbridgeAccountCustomEx(request *QueryDubbridgeAccountCustomRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDubbridgeAccountCustomResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDubbridgeAccountCustomResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.dubbridge.account.custom.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 天枢系统更新渠道
 * Summary: 天枢系统更新渠道
 */
func (client *Client) UpdateDubbridgeAccountCustom(request *UpdateDubbridgeAccountCustomRequest) (_result *UpdateDubbridgeAccountCustomResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateDubbridgeAccountCustomResponse{}
	_body, _err := client.UpdateDubbridgeAccountCustomEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 天枢系统更新渠道
 * Summary: 天枢系统更新渠道
 */
func (client *Client) UpdateDubbridgeAccountCustomEx(request *UpdateDubbridgeAccountCustomRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateDubbridgeAccountCustomResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateDubbridgeAccountCustomResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.dubbridge.account.custom.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 天枢系统协议签约查询(支付宝)
 * Summary: 天枢系统协议签约查询(支付宝)
 */
func (client *Client) QueryDubbridgeCustomerAgreementsign(request *QueryDubbridgeCustomerAgreementsignRequest) (_result *QueryDubbridgeCustomerAgreementsignResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDubbridgeCustomerAgreementsignResponse{}
	_body, _err := client.QueryDubbridgeCustomerAgreementsignEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 天枢系统协议签约查询(支付宝)
 * Summary: 天枢系统协议签约查询(支付宝)
 */
func (client *Client) QueryDubbridgeCustomerAgreementsignEx(request *QueryDubbridgeCustomerAgreementsignRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDubbridgeCustomerAgreementsignResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDubbridgeCustomerAgreementsignResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.dubbridge.customer.agreementsign.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 天枢系统客户信息变更接口（变更客户三要素信息）
 * Summary: 天枢系统客户信息变更接口
 */
func (client *Client) UpdateDubbridgeCustomerInfo(request *UpdateDubbridgeCustomerInfoRequest) (_result *UpdateDubbridgeCustomerInfoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateDubbridgeCustomerInfoResponse{}
	_body, _err := client.UpdateDubbridgeCustomerInfoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 天枢系统客户信息变更接口（变更客户三要素信息）
 * Summary: 天枢系统客户信息变更接口
 */
func (client *Client) UpdateDubbridgeCustomerInfoEx(request *UpdateDubbridgeCustomerInfoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateDubbridgeCustomerInfoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateDubbridgeCustomerInfoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.dubbridge.customer.info.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 天枢逾期信息查询接口
 * Summary: 逾期信息查询
 */
func (client *Client) QueryDubbridgeReceiptOverdue(request *QueryDubbridgeReceiptOverdueRequest) (_result *QueryDubbridgeReceiptOverdueResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDubbridgeReceiptOverdueResponse{}
	_body, _err := client.QueryDubbridgeReceiptOverdueEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 天枢逾期信息查询接口
 * Summary: 逾期信息查询
 */
func (client *Client) QueryDubbridgeReceiptOverdueEx(request *QueryDubbridgeReceiptOverdueRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDubbridgeReceiptOverdueResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDubbridgeReceiptOverdueResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.dubbridge.receipt.overdue.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 天枢系统主动还款（收银台）接口
 * Summary: 天枢系统主动还款（收银台）接口
 */
func (client *Client) RepayDubbridgeRepayCheckstand(request *RepayDubbridgeRepayCheckstandRequest) (_result *RepayDubbridgeRepayCheckstandResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &RepayDubbridgeRepayCheckstandResponse{}
	_body, _err := client.RepayDubbridgeRepayCheckstandEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 天枢系统主动还款（收银台）接口
 * Summary: 天枢系统主动还款（收银台）接口
 */
func (client *Client) RepayDubbridgeRepayCheckstandEx(request *RepayDubbridgeRepayCheckstandRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *RepayDubbridgeRepayCheckstandResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &RepayDubbridgeRepayCheckstandResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.dubbridge.repay.checkstand.repay"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 天枢系统还款信息查询
 * Summary: 天枢系统还款信息查询
 */
func (client *Client) QueryDubbridgeRepayInfo(request *QueryDubbridgeRepayInfoRequest) (_result *QueryDubbridgeRepayInfoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDubbridgeRepayInfoResponse{}
	_body, _err := client.QueryDubbridgeRepayInfoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 天枢系统还款信息查询
 * Summary: 天枢系统还款信息查询
 */
func (client *Client) QueryDubbridgeRepayInfoEx(request *QueryDubbridgeRepayInfoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDubbridgeRepayInfoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDubbridgeRepayInfoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.dubbridge.repay.info.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 天枢系统还款计划查询，根据申请订单查询还款计划
 * Summary: 天枢系统还款计划查询
 */
func (client *Client) QueryDubbridgeRepayList(request *QueryDubbridgeRepayListRequest) (_result *QueryDubbridgeRepayListResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDubbridgeRepayListResponse{}
	_body, _err := client.QueryDubbridgeRepayListEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 天枢系统还款计划查询，根据申请订单查询还款计划
 * Summary: 天枢系统还款计划查询
 */
func (client *Client) QueryDubbridgeRepayListEx(request *QueryDubbridgeRepayListRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDubbridgeRepayListResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDubbridgeRepayListResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.dubbridge.repay.list.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 天枢系统还款计划试算，根据借款金额和期数计算还款计划
 * Summary: 天枢系统还款计划试算
 */
func (client *Client) CountDubbridgeRepayReftrial(request *CountDubbridgeRepayReftrialRequest) (_result *CountDubbridgeRepayReftrialResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CountDubbridgeRepayReftrialResponse{}
	_body, _err := client.CountDubbridgeRepayReftrialEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 天枢系统还款计划试算，根据借款金额和期数计算还款计划
 * Summary: 天枢系统还款计划试算
 */
func (client *Client) CountDubbridgeRepayReftrialEx(request *CountDubbridgeRepayReftrialRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CountDubbridgeRepayReftrialResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CountDubbridgeRepayReftrialResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.dubbridge.repay.reftrial.count"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 天枢系统还款试算，根据借据号计算还款金额
 * Summary: 天枢系统还款试算
 */
func (client *Client) CountDubbridgeRepayTrial(request *CountDubbridgeRepayTrialRequest) (_result *CountDubbridgeRepayTrialResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CountDubbridgeRepayTrialResponse{}
	_body, _err := client.CountDubbridgeRepayTrialEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 天枢系统还款试算，根据借据号计算还款金额
 * Summary: 天枢系统还款试算
 */
func (client *Client) CountDubbridgeRepayTrialEx(request *CountDubbridgeRepayTrialRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CountDubbridgeRepayTrialResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CountDubbridgeRepayTrialResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.dubbridge.repay.trial.count"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 天枢信贷业务系统主动还款（直接代扣）接口
 * Summary: 天枢信贷业务系统主动还款（直接代扣）接口
 */
func (client *Client) RepayDubbridgeRepayWithhold(request *RepayDubbridgeRepayWithholdRequest) (_result *RepayDubbridgeRepayWithholdResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &RepayDubbridgeRepayWithholdResponse{}
	_body, _err := client.RepayDubbridgeRepayWithholdEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 天枢信贷业务系统主动还款（直接代扣）接口
 * Summary: 天枢信贷业务系统主动还款（直接代扣）接口
 */
func (client *Client) RepayDubbridgeRepayWithholdEx(request *RepayDubbridgeRepayWithholdRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *RepayDubbridgeRepayWithholdResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &RepayDubbridgeRepayWithholdResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.dubbridge.repay.withhold.repay"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 天枢系统合同获取
 * Summary: 天枢系统合同获取
 */
func (client *Client) QueryDubbridgeSearchContract(request *QueryDubbridgeSearchContractRequest) (_result *QueryDubbridgeSearchContractResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDubbridgeSearchContractResponse{}
	_body, _err := client.QueryDubbridgeSearchContractEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 天枢系统合同获取
 * Summary: 天枢系统合同获取
 */
func (client *Client) QueryDubbridgeSearchContractEx(request *QueryDubbridgeSearchContractRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDubbridgeSearchContractResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDubbridgeSearchContractResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.dubbridge.search.contract.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 天枢系统用信申请接口
 * Summary: 天枢系统用信申请接口
 */
func (client *Client) ApplyDubbridgeUsecredit(request *ApplyDubbridgeUsecreditRequest) (_result *ApplyDubbridgeUsecreditResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ApplyDubbridgeUsecreditResponse{}
	_body, _err := client.ApplyDubbridgeUsecreditEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 天枢系统用信申请接口
 * Summary: 天枢系统用信申请接口
 */
func (client *Client) ApplyDubbridgeUsecreditEx(request *ApplyDubbridgeUsecreditRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ApplyDubbridgeUsecreditResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ApplyDubbridgeUsecreditResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.dubbridge.usecredit.apply"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 天枢系统用信申请状态查询，返回用信详情及还款计划
 * Summary: 天枢系统用信申请状态查询
 */
func (client *Client) QueryDubbridgeUsecreditStatus(request *QueryDubbridgeUsecreditStatusRequest) (_result *QueryDubbridgeUsecreditStatusResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDubbridgeUsecreditStatusResponse{}
	_body, _err := client.QueryDubbridgeUsecreditStatusEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 天枢系统用信申请状态查询，返回用信详情及还款计划
 * Summary: 天枢系统用信申请状态查询
 */
func (client *Client) QueryDubbridgeUsecreditStatusEx(request *QueryDubbridgeUsecreditStatusRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDubbridgeUsecreditStatusResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDubbridgeUsecreditStatusResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.dubbridge.usecredit.status.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 天枢系统是否结清
 * Summary: 天枢系统借款是否结清
 */
func (client *Client) QueryDubbridgeReceiptStatus(request *QueryDubbridgeReceiptStatusRequest) (_result *QueryDubbridgeReceiptStatusResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryDubbridgeReceiptStatusResponse{}
	_body, _err := client.QueryDubbridgeReceiptStatusEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 天枢系统是否结清
 * Summary: 天枢系统借款是否结清
 */
func (client *Client) QueryDubbridgeReceiptStatusEx(request *QueryDubbridgeReceiptStatusRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryDubbridgeReceiptStatusResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryDubbridgeReceiptStatusResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.dubbridge.receipt.status.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 四要素认证首先调用此接口
 * Summary: 芝麻四要素接口
 */
func (client *Client) VerifyFinserviceZhimaIdentify(request *VerifyFinserviceZhimaIdentifyRequest) (_result *VerifyFinserviceZhimaIdentifyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &VerifyFinserviceZhimaIdentifyResponse{}
	_body, _err := client.VerifyFinserviceZhimaIdentifyEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 四要素认证首先调用此接口
 * Summary: 芝麻四要素接口
 */
func (client *Client) VerifyFinserviceZhimaIdentifyEx(request *VerifyFinserviceZhimaIdentifyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *VerifyFinserviceZhimaIdentifyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &VerifyFinserviceZhimaIdentifyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.finservice.zhima.identify.verify"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description:
 * Summary: 芝麻四要素认证结果查询
 */
func (client *Client) QueryFinserviceZhimaIdentify(request *QueryFinserviceZhimaIdentifyRequest) (_result *QueryFinserviceZhimaIdentifyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryFinserviceZhimaIdentifyResponse{}
	_body, _err := client.QueryFinserviceZhimaIdentifyEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description:
 * Summary: 芝麻四要素认证结果查询
 */
func (client *Client) QueryFinserviceZhimaIdentifyEx(request *QueryFinserviceZhimaIdentifyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryFinserviceZhimaIdentifyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryFinserviceZhimaIdentifyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.finservice.zhima.identify.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 多源融合平台的数据服务查询接口
 * Summary: 多源融合平台的数据服务查询接口
 */
func (client *Client) QueryMdipDataservice(request *QueryMdipDataserviceRequest) (_result *QueryMdipDataserviceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryMdipDataserviceResponse{}
	_body, _err := client.QueryMdipDataserviceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 多源融合平台的数据服务查询接口
 * Summary: 多源融合平台的数据服务查询接口
 */
func (client *Client) QueryMdipDataserviceEx(request *QueryMdipDataserviceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryMdipDataserviceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryMdipDataserviceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.mdip.dataservice.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 接受op的文件id,支持外网多源文件上传
 * Summary: 接受op的文件id,支持外网多源文件上传
 */
func (client *Client) ReceiveMdipParamsFile(request *ReceiveMdipParamsFileRequest) (_result *ReceiveMdipParamsFileResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ReceiveMdipParamsFileResponse{}
	_body, _err := client.ReceiveMdipParamsFileEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 接受op的文件id,支持外网多源文件上传
 * Summary: 接受op的文件id,支持外网多源文件上传
 */
func (client *Client) ReceiveMdipParamsFileEx(request *ReceiveMdipParamsFileRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ReceiveMdipParamsFileResponse, _err error) {
	if !tea.BoolValue(util.IsUnset(request.FileObject)) {
		uploadReq := &CreateAntcloudGatewayxFileUploadRequest{
			AuthToken: request.AuthToken,
			ApiCode:   tea.String("riskplus.mdip.params.file.receive"),
			FileName:  request.FileObjectName,
		}
		uploadResp, _err := client.CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime)
		if _err != nil {
			return _result, _err
		}

		if !tea.BoolValue(antchainutil.IsSuccess(uploadResp.ResultCode, tea.String("ok"))) {
			receiveMdipParamsFileResponse := &ReceiveMdipParamsFileResponse{
				ReqMsgId:   uploadResp.ReqMsgId,
				ResultCode: uploadResp.ResultCode,
				ResultMsg:  uploadResp.ResultMsg,
			}
			_result = receiveMdipParamsFileResponse
			return _result, _err
		}

		uploadHeaders := antchainutil.ParseUploadHeaders(uploadResp.UploadHeaders)
		_err = antchainutil.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl)
		if _err != nil {
			return _result, _err
		}
		request.FileId = uploadResp.FileId
	}

	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ReceiveMdipParamsFileResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.mdip.params.file.receive"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 风险大脑企业版通用查询接口
 * Summary: 【已废弃】
 */
func (client *Client) QueryRbbGenericInvoke(request *QueryRbbGenericInvokeRequest) (_result *QueryRbbGenericInvokeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryRbbGenericInvokeResponse{}
	_body, _err := client.QueryRbbGenericInvokeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 风险大脑企业版通用查询接口
 * Summary: 【已废弃】
 */
func (client *Client) QueryRbbGenericInvokeEx(request *QueryRbbGenericInvokeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryRbbGenericInvokeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryRbbGenericInvokeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.rbb.generic.invoke.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 风险大脑企业版token生成
 * Summary: 【已废弃】
 */
func (client *Client) CreateRbbToken(request *CreateRbbTokenRequest) (_result *CreateRbbTokenResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateRbbTokenResponse{}
	_body, _err := client.CreateRbbTokenEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 风险大脑企业版token生成
 * Summary: 【已废弃】
 */
func (client *Client) CreateRbbTokenEx(request *CreateRbbTokenRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateRbbTokenResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateRbbTokenResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.rbb.token.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取风险大脑企业版登录token
 * Summary: 【已废弃】
 */
func (client *Client) CreateRbbApiGwtoken(request *CreateRbbApiGwtokenRequest) (_result *CreateRbbApiGwtokenResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateRbbApiGwtokenResponse{}
	_body, _err := client.CreateRbbApiGwtokenEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取风险大脑企业版登录token
 * Summary: 【已废弃】
 */
func (client *Client) CreateRbbApiGwtokenEx(request *CreateRbbApiGwtokenRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateRbbApiGwtokenResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateRbbApiGwtokenResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.rbb.api.gwtoken.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 风险大脑企业版通用查询OpenAPI
 * Summary: 风险大脑企业版通用查询OpenAPI
 */
func (client *Client) QueryRbbGeneral(request *QueryRbbGeneralRequest) (_result *QueryRbbGeneralResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryRbbGeneralResponse{}
	_body, _err := client.QueryRbbGeneralEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 风险大脑企业版通用查询OpenAPI
 * Summary: 风险大脑企业版通用查询OpenAPI
 */
func (client *Client) QueryRbbGeneralEx(request *QueryRbbGeneralRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryRbbGeneralResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryRbbGeneralResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.rbb.general.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取登录Token
 * Summary: 获取登录Token
 */
func (client *Client) GetRbbLoginToken(request *GetRbbLoginTokenRequest) (_result *GetRbbLoginTokenResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetRbbLoginTokenResponse{}
	_body, _err := client.GetRbbLoginTokenEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取登录Token
 * Summary: 获取登录Token
 */
func (client *Client) GetRbbLoginTokenEx(request *GetRbbLoginTokenRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetRbbLoginTokenResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetRbbLoginTokenResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.rbb.login.token.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 风险大脑企业版创建租户
 * Summary: 风险大脑企业版创建租户
 */
func (client *Client) CreateRbbTenant(request *CreateRbbTenantRequest) (_result *CreateRbbTenantResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateRbbTenantResponse{}
	_body, _err := client.CreateRbbTenantEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 风险大脑企业版创建租户
 * Summary: 风险大脑企业版创建租户
 */
func (client *Client) CreateRbbTenantEx(request *CreateRbbTenantRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateRbbTenantResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateRbbTenantResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.rbb.tenant.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 风险大脑企业版创建用户
 * Summary: 风险大脑企业版创建用户
 */
func (client *Client) CreateRbbUser(request *CreateRbbUserRequest) (_result *CreateRbbUserResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateRbbUserResponse{}
	_body, _err := client.CreateRbbUserEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 风险大脑企业版创建用户
 * Summary: 风险大脑企业版创建用户
 */
func (client *Client) CreateRbbUserEx(request *CreateRbbUserRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateRbbUserResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateRbbUserResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.rbb.user.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 企业准入接口
 * Summary: 企业准入
 */
func (client *Client) ExecRbbCompanyGuard(request *ExecRbbCompanyGuardRequest) (_result *ExecRbbCompanyGuardResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ExecRbbCompanyGuardResponse{}
	_body, _err := client.ExecRbbCompanyGuardEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 企业准入接口
 * Summary: 企业准入
 */
func (client *Client) ExecRbbCompanyGuardEx(request *ExecRbbCompanyGuardRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ExecRbbCompanyGuardResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecRbbCompanyGuardResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.rbb.company.guard.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 提交授信申请
 * Summary: 企业授信申请
 */
func (client *Client) ApplyRbbCompanyCredit(request *ApplyRbbCompanyCreditRequest) (_result *ApplyRbbCompanyCreditResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ApplyRbbCompanyCreditResponse{}
	_body, _err := client.ApplyRbbCompanyCreditEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 提交授信申请
 * Summary: 企业授信申请
 */
func (client *Client) ApplyRbbCompanyCreditEx(request *ApplyRbbCompanyCreditRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ApplyRbbCompanyCreditResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ApplyRbbCompanyCreditResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.rbb.company.credit.apply"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询企业授信结果
 * Summary: 企业授信结果查询
 */
func (client *Client) QueryRbbCompanyCredit(request *QueryRbbCompanyCreditRequest) (_result *QueryRbbCompanyCreditResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryRbbCompanyCreditResponse{}
	_body, _err := client.QueryRbbCompanyCreditEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询企业授信结果
 * Summary: 企业授信结果查询
 */
func (client *Client) QueryRbbCompanyCreditEx(request *QueryRbbCompanyCreditRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryRbbCompanyCreditResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryRbbCompanyCreditResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.rbb.company.credit.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 风险大脑-上交所数据离线同步数据准备状态，上交所本地部署鹰眼项目需要获取离线数据是否准备好的信息
 * Summary: 风险大脑-上交所数据离线同步数据准备状态
 */
func (client *Client) QueryRbbRegdatasyncPrepared(request *QueryRbbRegdatasyncPreparedRequest) (_result *QueryRbbRegdatasyncPreparedResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryRbbRegdatasyncPreparedResponse{}
	_body, _err := client.QueryRbbRegdatasyncPreparedEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 风险大脑-上交所数据离线同步数据准备状态，上交所本地部署鹰眼项目需要获取离线数据是否准备好的信息
 * Summary: 风险大脑-上交所数据离线同步数据准备状态
 */
func (client *Client) QueryRbbRegdatasyncPreparedEx(request *QueryRbbRegdatasyncPreparedRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryRbbRegdatasyncPreparedResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryRbbRegdatasyncPreparedResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.rbb.regdatasync.prepared.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 风险大脑-上交所数据离线同步数据开始通知标识
 * Summary: 风险大脑-上交所数据离线同步数据开始通知
 */
func (client *Client) StartRbbRegdatasyncSchedule(request *StartRbbRegdatasyncScheduleRequest) (_result *StartRbbRegdatasyncScheduleResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &StartRbbRegdatasyncScheduleResponse{}
	_body, _err := client.StartRbbRegdatasyncScheduleEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 风险大脑-上交所数据离线同步数据开始通知标识
 * Summary: 风险大脑-上交所数据离线同步数据开始通知
 */
func (client *Client) StartRbbRegdatasyncScheduleEx(request *StartRbbRegdatasyncScheduleRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *StartRbbRegdatasyncScheduleResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &StartRbbRegdatasyncScheduleResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.rbb.regdatasync.schedule.start"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 风险大脑-上交所数据离线同步数据完成记录 记录完成的状态
 * Summary: 风险大脑-上交所数据离线同步数据完成记录
 */
func (client *Client) FinishRbbRegdatasyncSchedule(request *FinishRbbRegdatasyncScheduleRequest) (_result *FinishRbbRegdatasyncScheduleResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &FinishRbbRegdatasyncScheduleResponse{}
	_body, _err := client.FinishRbbRegdatasyncScheduleEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 风险大脑-上交所数据离线同步数据完成记录 记录完成的状态
 * Summary: 风险大脑-上交所数据离线同步数据完成记录
 */
func (client *Client) FinishRbbRegdatasyncScheduleEx(request *FinishRbbRegdatasyncScheduleRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *FinishRbbRegdatasyncScheduleResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &FinishRbbRegdatasyncScheduleResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.rbb.regdatasync.schedule.finish"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 提交准入规则的执行请求
 * Summary: 企业准入申请
 */
func (client *Client) ApplyRbbCompanyGuard(request *ApplyRbbCompanyGuardRequest) (_result *ApplyRbbCompanyGuardResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ApplyRbbCompanyGuardResponse{}
	_body, _err := client.ApplyRbbCompanyGuardEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 提交准入规则的执行请求
 * Summary: 企业准入申请
 */
func (client *Client) ApplyRbbCompanyGuardEx(request *ApplyRbbCompanyGuardRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ApplyRbbCompanyGuardResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ApplyRbbCompanyGuardResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.rbb.company.guard.apply"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 企业准入结果查询
 * Summary: 企业准入结果查询
 */
func (client *Client) QueryRbbCompanyGuard(request *QueryRbbCompanyGuardRequest) (_result *QueryRbbCompanyGuardResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryRbbCompanyGuardResponse{}
	_body, _err := client.QueryRbbCompanyGuardEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 企业准入结果查询
 * Summary: 企业准入结果查询
 */
func (client *Client) QueryRbbCompanyGuardEx(request *QueryRbbCompanyGuardRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryRbbCompanyGuardResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryRbbCompanyGuardResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.rbb.company.guard.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 企业风控给上交所鹰眼使用的zsearch查询
 * Summary: 企业风控给鹰眼使用的zsearch查询
 */
func (client *Client) QueryRbbObtsZsearch(request *QueryRbbObtsZsearchRequest) (_result *QueryRbbObtsZsearchResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryRbbObtsZsearchResponse{}
	_body, _err := client.QueryRbbObtsZsearchEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 企业风控给上交所鹰眼使用的zsearch查询
 * Summary: 企业风控给鹰眼使用的zsearch查询
 */
func (client *Client) QueryRbbObtsZsearchEx(request *QueryRbbObtsZsearchRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryRbbObtsZsearchResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryRbbObtsZsearchResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.rbb.obts.zsearch.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 企业风控客户推送的企业信息
 * Summary: 企业风控客户推送的企业信息
 */
func (client *Client) PushRbbCustomerCompanyinfo(request *PushRbbCustomerCompanyinfoRequest) (_result *PushRbbCustomerCompanyinfoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PushRbbCustomerCompanyinfoResponse{}
	_body, _err := client.PushRbbCustomerCompanyinfoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 企业风控客户推送的企业信息
 * Summary: 企业风控客户推送的企业信息
 */
func (client *Client) PushRbbCustomerCompanyinfoEx(request *PushRbbCustomerCompanyinfoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PushRbbCustomerCompanyinfoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PushRbbCustomerCompanyinfoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.rbb.customer.companyinfo.push"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取签约接口
 * Summary: 获取签约接口
 */
func (client *Client) QueryRpgwSignUrl(request *QueryRpgwSignUrlRequest) (_result *QueryRpgwSignUrlResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryRpgwSignUrlResponse{}
	_body, _err := client.QueryRpgwSignUrlEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取签约接口
 * Summary: 获取签约接口
 */
func (client *Client) QueryRpgwSignUrlEx(request *QueryRpgwSignUrlRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryRpgwSignUrlResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryRpgwSignUrlResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.rpgw.sign.url.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建报税用户接口
 * Summary: 创建报税用户接口
 */
func (client *Client) RegisterRpgwUserEinvoice(request *RegisterRpgwUserEinvoiceRequest) (_result *RegisterRpgwUserEinvoiceResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &RegisterRpgwUserEinvoiceResponse{}
	_body, _err := client.RegisterRpgwUserEinvoiceEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建报税用户接口
 * Summary: 创建报税用户接口
 */
func (client *Client) RegisterRpgwUserEinvoiceEx(request *RegisterRpgwUserEinvoiceRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *RegisterRpgwUserEinvoiceResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &RegisterRpgwUserEinvoiceResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.rpgw.user.einvoice.register"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询签约接口
 * Summary: 获取签约接口
 */
func (client *Client) QueryRpgwUserSignurl(request *QueryRpgwUserSignurlRequest) (_result *QueryRpgwUserSignurlResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryRpgwUserSignurlResponse{}
	_body, _err := client.QueryRpgwUserSignurlEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询签约接口
 * Summary: 获取签约接口
 */
func (client *Client) QueryRpgwUserSignurlEx(request *QueryRpgwUserSignurlRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryRpgwUserSignurlResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryRpgwUserSignurlResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.rpgw.user.signurl.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 提现
 * Summary: 提现
 */
func (client *Client) WithdrawRpgwUserCommission(request *WithdrawRpgwUserCommissionRequest) (_result *WithdrawRpgwUserCommissionResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &WithdrawRpgwUserCommissionResponse{}
	_body, _err := client.WithdrawRpgwUserCommissionEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 提现
 * Summary: 提现
 */
func (client *Client) WithdrawRpgwUserCommissionEx(request *WithdrawRpgwUserCommissionRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *WithdrawRpgwUserCommissionResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &WithdrawRpgwUserCommissionResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.rpgw.user.commission.withdraw"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 信息同步
 * Summary: 下单等信息同步
 */
func (client *Client) SyncRpgwUserOrderinfo(request *SyncRpgwUserOrderinfoRequest) (_result *SyncRpgwUserOrderinfoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SyncRpgwUserOrderinfoResponse{}
	_body, _err := client.SyncRpgwUserOrderinfoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 信息同步
 * Summary: 下单等信息同步
 */
func (client *Client) SyncRpgwUserOrderinfoEx(request *SyncRpgwUserOrderinfoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SyncRpgwUserOrderinfoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SyncRpgwUserOrderinfoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.rpgw.user.orderinfo.sync"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 签约结果通知
 * Summary: 签约结果通知
 */
func (client *Client) NotifyRpgwUserSignresult(request *NotifyRpgwUserSignresultRequest) (_result *NotifyRpgwUserSignresultResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &NotifyRpgwUserSignresultResponse{}
	_body, _err := client.NotifyRpgwUserSignresultEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 签约结果通知
 * Summary: 签约结果通知
 */
func (client *Client) NotifyRpgwUserSignresultEx(request *NotifyRpgwUserSignresultRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *NotifyRpgwUserSignresultResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &NotifyRpgwUserSignresultResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.rpgw.user.signresult.notify"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询所在地的负面舆情企业列表
 * Summary: 查询所在地的负面舆情企业列表
 */
func (client *Client) QueryRtopCompanyOpinion(request *QueryRtopCompanyOpinionRequest) (_result *QueryRtopCompanyOpinionResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryRtopCompanyOpinionResponse{}
	_body, _err := client.QueryRtopCompanyOpinionEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询所在地的负面舆情企业列表
 * Summary: 查询所在地的负面舆情企业列表
 */
func (client *Client) QueryRtopCompanyOpinionEx(request *QueryRtopCompanyOpinionRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryRtopCompanyOpinionResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryRtopCompanyOpinionResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.rtop.company.opinion.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询企业的舆情详情信息
 * Summary: 查询企业的舆情详情信息
 */
func (client *Client) ListRtopCompanyOpinions(request *ListRtopCompanyOpinionsRequest) (_result *ListRtopCompanyOpinionsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListRtopCompanyOpinionsResponse{}
	_body, _err := client.ListRtopCompanyOpinionsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询企业的舆情详情信息
 * Summary: 查询企业的舆情详情信息
 */
func (client *Client) ListRtopCompanyOpinionsEx(request *ListRtopCompanyOpinionsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListRtopCompanyOpinionsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListRtopCompanyOpinionsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.rtop.company.opinions.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询监测企业的详情
 * Summary: 查询监测企业的详情
 */
func (client *Client) GetRtopCompanyMonitor(request *GetRtopCompanyMonitorRequest) (_result *GetRtopCompanyMonitorResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetRtopCompanyMonitorResponse{}
	_body, _err := client.GetRtopCompanyMonitorEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询监测企业的详情
 * Summary: 查询监测企业的详情
 */
func (client *Client) GetRtopCompanyMonitorEx(request *GetRtopCompanyMonitorRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetRtopCompanyMonitorResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetRtopCompanyMonitorResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.rtop.company.monitor.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询所在地的涉众风险企业统计信息
 * Summary: 查询所在地的涉众风险企业统计信息
 */
func (client *Client) QueryRtopCrowdriskStatistic(request *QueryRtopCrowdriskStatisticRequest) (_result *QueryRtopCrowdriskStatisticResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryRtopCrowdriskStatisticResponse{}
	_body, _err := client.QueryRtopCrowdriskStatisticEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询所在地的涉众风险企业统计信息
 * Summary: 查询所在地的涉众风险企业统计信息
 */
func (client *Client) QueryRtopCrowdriskStatisticEx(request *QueryRtopCrowdriskStatisticRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryRtopCrowdriskStatisticResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryRtopCrowdriskStatisticResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.rtop.crowdrisk.statistic.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询涉众风险企业的列表
 * Summary: 查询涉众风险企业的列表
 */
func (client *Client) ListRtopCrowdrisk(request *ListRtopCrowdriskRequest) (_result *ListRtopCrowdriskResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListRtopCrowdriskResponse{}
	_body, _err := client.ListRtopCrowdriskEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询涉众风险企业的列表
 * Summary: 查询涉众风险企业的列表
 */
func (client *Client) ListRtopCrowdriskEx(request *ListRtopCrowdriskRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListRtopCrowdriskResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListRtopCrowdriskResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.rtop.crowdrisk.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询涉众风险企业的详细信息
 * Summary: 查询涉众风险企业的详细信息
 */
func (client *Client) QueryRtopCrowdriskDetail(request *QueryRtopCrowdriskDetailRequest) (_result *QueryRtopCrowdriskDetailResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryRtopCrowdriskDetailResponse{}
	_body, _err := client.QueryRtopCrowdriskDetailEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询涉众风险企业的详细信息
 * Summary: 查询涉众风险企业的详细信息
 */
func (client *Client) QueryRtopCrowdriskDetailEx(request *QueryRtopCrowdriskDetailRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryRtopCrowdriskDetailResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryRtopCrowdriskDetailResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.rtop.crowdrisk.detail.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询风报的详细信息
 * Summary: 查询风报的详细信息
 */
func (client *Client) QueryRtopRiskstorm(request *QueryRtopRiskstormRequest) (_result *QueryRtopRiskstormResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryRtopRiskstormResponse{}
	_body, _err := client.QueryRtopRiskstormEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询风报的详细信息
 * Summary: 查询风报的详细信息
 */
func (client *Client) QueryRtopRiskstormEx(request *QueryRtopRiskstormRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryRtopRiskstormResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryRtopRiskstormResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.rtop.riskstorm.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 监管涉众风险指定的一批企业的影响人数之和、影响金额之和
 * Summary: 监管涉众风险一批企业的影响人数影响金额
 */
func (client *Client) QueryRtopCrowdriskSum(request *QueryRtopCrowdriskSumRequest) (_result *QueryRtopCrowdriskSumResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryRtopCrowdriskSumResponse{}
	_body, _err := client.QueryRtopCrowdriskSumEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 监管涉众风险指定的一批企业的影响人数之和、影响金额之和
 * Summary: 监管涉众风险一批企业的影响人数影响金额
 */
func (client *Client) QueryRtopCrowdriskSumEx(request *QueryRtopCrowdriskSumRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryRtopCrowdriskSumResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryRtopCrowdriskSumResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.rtop.crowdrisk.sum.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 监管企业详情获取，包括风险分数、风险标签。
 * Summary: 监管企业详情获取
 */
func (client *Client) GetRtopCompanyDetail(request *GetRtopCompanyDetailRequest) (_result *GetRtopCompanyDetailResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetRtopCompanyDetailResponse{}
	_body, _err := client.GetRtopCompanyDetailEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 监管企业详情获取，包括风险分数、风险标签。
 * Summary: 监管企业详情获取
 */
func (client *Client) GetRtopCompanyDetailEx(request *GetRtopCompanyDetailRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetRtopCompanyDetailResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetRtopCompanyDetailResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.rtop.company.detail.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 企业风险查询接口
 * Summary: 企业风险查询接口
 */
func (client *Client) QueryRtopCompanyRiskinfo(request *QueryRtopCompanyRiskinfoRequest) (_result *QueryRtopCompanyRiskinfoResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryRtopCompanyRiskinfoResponse{}
	_body, _err := client.QueryRtopCompanyRiskinfoEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 企业风险查询接口
 * Summary: 企业风险查询接口
 */
func (client *Client) QueryRtopCompanyRiskinfoEx(request *QueryRtopCompanyRiskinfoRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryRtopCompanyRiskinfoResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryRtopCompanyRiskinfoResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.rtop.company.riskinfo.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 公有云通用风险信息接口
 * Summary: 公有云通用风险信息接口
 */
func (client *Client) ExecRtopGenericInvoke(request *ExecRtopGenericInvokeRequest) (_result *ExecRtopGenericInvokeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ExecRtopGenericInvokeResponse{}
	_body, _err := client.ExecRtopGenericInvokeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 公有云通用风险信息接口
 * Summary: 公有云通用风险信息接口
 */
func (client *Client) ExecRtopGenericInvokeEx(request *ExecRtopGenericInvokeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ExecRtopGenericInvokeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecRtopGenericInvokeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.rtop.generic.invoke.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 公有云生成token
 * Summary: 公有云生成token
 */
func (client *Client) CreateRtopToken(request *CreateRtopTokenRequest) (_result *CreateRtopTokenResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateRtopTokenResponse{}
	_body, _err := client.CreateRtopTokenEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 公有云生成token
 * Summary: 公有云生成token
 */
func (client *Client) CreateRtopTokenEx(request *CreateRtopTokenRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateRtopTokenResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateRtopTokenResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.rtop.token.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 标签全量信息获取
 * Summary: 标签全量信息获取
 */
func (client *Client) QueryRtopRisklabel(request *QueryRtopRisklabelRequest) (_result *QueryRtopRisklabelResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryRtopRisklabelResponse{}
	_body, _err := client.QueryRtopRisklabelEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 标签全量信息获取
 * Summary: 标签全量信息获取
 */
func (client *Client) QueryRtopRisklabelEx(request *QueryRtopRisklabelRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryRtopRisklabelResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryRtopRisklabelResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.rtop.risklabel.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 企业全量信息获取
 * Summary: 企业全量信息获取
 */
func (client *Client) QueryRtopCompany(request *QueryRtopCompanyRequest) (_result *QueryRtopCompanyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryRtopCompanyResponse{}
	_body, _err := client.QueryRtopCompanyEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 企业全量信息获取
 * Summary: 企业全量信息获取
 */
func (client *Client) QueryRtopCompanyEx(request *QueryRtopCompanyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryRtopCompanyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryRtopCompanyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.rtop.company.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 标签配置全量信息获取
rtop_company_tag_filter_config
 * Summary: 标签配置全量信息获取
*/
func (client *Client) QueryRtopRisklabelFilter(request *QueryRtopRisklabelFilterRequest) (_result *QueryRtopRisklabelFilterResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryRtopRisklabelFilterResponse{}
	_body, _err := client.QueryRtopRisklabelFilterEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 标签配置全量信息获取
rtop_company_tag_filter_config
 * Summary: 标签配置全量信息获取
*/
func (client *Client) QueryRtopRisklabelFilterEx(request *QueryRtopRisklabelFilterRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryRtopRisklabelFilterResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryRtopRisklabelFilterResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.rtop.risklabel.filter.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 用于鹰眼项目舆情同步
 * Summary: 鹰眼项目舆情同步
 */
func (client *Client) PullRegtechNews(request *PullRegtechNewsRequest) (_result *PullRegtechNewsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PullRegtechNewsResponse{}
	_body, _err := client.PullRegtechNewsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 用于鹰眼项目舆情同步
 * Summary: 鹰眼项目舆情同步
 */
func (client *Client) PullRegtechNewsEx(request *PullRegtechNewsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PullRegtechNewsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PullRegtechNewsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.regtech.news.pull"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查看企业反馈
 * Summary: 查看企业反馈
 */
func (client *Client) QueryRtopCompanyFeedback(request *QueryRtopCompanyFeedbackRequest) (_result *QueryRtopCompanyFeedbackResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryRtopCompanyFeedbackResponse{}
	_body, _err := client.QueryRtopCompanyFeedbackEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查看企业反馈
 * Summary: 查看企业反馈
 */
func (client *Client) QueryRtopCompanyFeedbackEx(request *QueryRtopCompanyFeedbackRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryRtopCompanyFeedbackResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryRtopCompanyFeedbackResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.rtop.company.feedback.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 全局动态中的预警企业详细列表查询
 * Summary: 全局动态中的预警企业详细列表查询
 */
func (client *Client) QueryRtopCompanyAlarm(request *QueryRtopCompanyAlarmRequest) (_result *QueryRtopCompanyAlarmResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryRtopCompanyAlarmResponse{}
	_body, _err := client.QueryRtopCompanyAlarmEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 全局动态中的预警企业详细列表查询
 * Summary: 全局动态中的预警企业详细列表查询
 */
func (client *Client) QueryRtopCompanyAlarmEx(request *QueryRtopCompanyAlarmRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryRtopCompanyAlarmResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryRtopCompanyAlarmResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.rtop.company.alarm.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询全局动态中的企业列表里的全部列表
 * Summary: 查询全局动态中的企业列表里的全部列表
 */
func (client *Client) QueryRtopCompanyRisky(request *QueryRtopCompanyRiskyRequest) (_result *QueryRtopCompanyRiskyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryRtopCompanyRiskyResponse{}
	_body, _err := client.QueryRtopCompanyRiskyEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询全局动态中的企业列表里的全部列表
 * Summary: 查询全局动态中的企业列表里的全部列表
 */
func (client *Client) QueryRtopCompanyRiskyEx(request *QueryRtopCompanyRiskyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryRtopCompanyRiskyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryRtopCompanyRiskyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.rtop.company.risky.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询企业列表
 * Summary: 查询企业列表
 */
func (client *Client) QueryRtopCompanyList(request *QueryRtopCompanyListRequest) (_result *QueryRtopCompanyListResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryRtopCompanyListResponse{}
	_body, _err := client.QueryRtopCompanyListEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询企业列表
 * Summary: 查询企业列表
 */
func (client *Client) QueryRtopCompanyListEx(request *QueryRtopCompanyListRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryRtopCompanyListResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryRtopCompanyListResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.rtop.company.list.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 标签配置全量信息获取
 * Summary: 标签配置全量信息获取
 */
func (client *Client) QueryRtopRisklabelConfig(request *QueryRtopRisklabelConfigRequest) (_result *QueryRtopRisklabelConfigResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryRtopRisklabelConfigResponse{}
	_body, _err := client.QueryRtopRisklabelConfigEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 标签配置全量信息获取
 * Summary: 标签配置全量信息获取
 */
func (client *Client) QueryRtopRisklabelConfigEx(request *QueryRtopRisklabelConfigRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryRtopRisklabelConfigResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryRtopRisklabelConfigResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.rtop.risklabel.config.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 企业风险标签信息查询
 * Summary: 企业风险标签信息查询
 */
func (client *Client) QueryRtopCompanyRisk(request *QueryRtopCompanyRiskRequest) (_result *QueryRtopCompanyRiskResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryRtopCompanyRiskResponse{}
	_body, _err := client.QueryRtopCompanyRiskEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 企业风险标签信息查询
 * Summary: 企业风险标签信息查询
 */
func (client *Client) QueryRtopCompanyRiskEx(request *QueryRtopCompanyRiskRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryRtopCompanyRiskResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryRtopCompanyRiskResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.rtop.company.risk.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查看重点关联企业
 * Summary: 重点关联企业
 */
func (client *Client) ListRtopCompanyRelated(request *ListRtopCompanyRelatedRequest) (_result *ListRtopCompanyRelatedResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListRtopCompanyRelatedResponse{}
	_body, _err := client.ListRtopCompanyRelatedEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查看重点关联企业
 * Summary: 重点关联企业
 */
func (client *Client) ListRtopCompanyRelatedEx(request *ListRtopCompanyRelatedRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListRtopCompanyRelatedResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListRtopCompanyRelatedResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.rtop.company.related.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 风险标签图片查询
 * Summary: 风险标签图片查询
 */
func (client *Client) QueryRtopTagImage(request *QueryRtopTagImageRequest) (_result *QueryRtopTagImageResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryRtopTagImageResponse{}
	_body, _err := client.QueryRtopTagImageEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 风险标签图片查询
 * Summary: 风险标签图片查询
 */
func (client *Client) QueryRtopTagImageEx(request *QueryRtopTagImageRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryRtopTagImageResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryRtopTagImageResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.rtop.tag.image.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询用户收藏企业列表
 * Summary: 查询用户收藏企业列表
 */
func (client *Client) ListRtopStarCompany(request *ListRtopStarCompanyRequest) (_result *ListRtopStarCompanyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListRtopStarCompanyResponse{}
	_body, _err := client.ListRtopStarCompanyEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询用户收藏企业列表
 * Summary: 查询用户收藏企业列表
 */
func (client *Client) ListRtopStarCompanyEx(request *ListRtopStarCompanyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListRtopStarCompanyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListRtopStarCompanyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.rtop.star.company.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 策略咨询服务输出(saas)
 * Summary: 策略咨询服务输出(saas)
 */
func (client *Client) QueryRpSecurityPolicy(request *QueryRpSecurityPolicyRequest) (_result *QueryRpSecurityPolicyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryRpSecurityPolicyResponse{}
	_body, _err := client.QueryRpSecurityPolicyEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 策略咨询服务输出(saas)
 * Summary: 策略咨询服务输出(saas)
 */
func (client *Client) QueryRpSecurityPolicyEx(request *QueryRpSecurityPolicyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryRpSecurityPolicyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryRpSecurityPolicyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.rp.security.policy.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 风控快照查询
 * Summary: 风控事件快照查询
 */
func (client *Client) QuerySnapshotEvent(request *QuerySnapshotEventRequest) (_result *QuerySnapshotEventResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QuerySnapshotEventResponse{}
	_body, _err := client.QuerySnapshotEventEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 风控快照查询
 * Summary: 风控事件快照查询
 */
func (client *Client) QuerySnapshotEventEx(request *QuerySnapshotEventRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QuerySnapshotEventResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QuerySnapshotEventResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.snapshot.event.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 营销盾批量参数文件上传接口
 * Summary: 营销盾参数文件上传
 */
func (client *Client) UploadUmktParamsFile(request *UploadUmktParamsFileRequest) (_result *UploadUmktParamsFileResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UploadUmktParamsFileResponse{}
	_body, _err := client.UploadUmktParamsFileEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 营销盾批量参数文件上传接口
 * Summary: 营销盾参数文件上传
 */
func (client *Client) UploadUmktParamsFileEx(request *UploadUmktParamsFileRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UploadUmktParamsFileResponse, _err error) {
	if !tea.BoolValue(util.IsUnset(request.FileObject)) {
		uploadReq := &CreateAntcloudGatewayxFileUploadRequest{
			AuthToken: request.AuthToken,
			ApiCode:   tea.String("riskplus.umkt.params.file.upload"),
			FileName:  request.FileObjectName,
		}
		uploadResp, _err := client.CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime)
		if _err != nil {
			return _result, _err
		}

		if !tea.BoolValue(antchainutil.IsSuccess(uploadResp.ResultCode, tea.String("ok"))) {
			uploadUmktParamsFileResponse := &UploadUmktParamsFileResponse{
				ReqMsgId:   uploadResp.ReqMsgId,
				ResultCode: uploadResp.ResultCode,
				ResultMsg:  uploadResp.ResultMsg,
			}
			_result = uploadUmktParamsFileResponse
			return _result, _err
		}

		uploadHeaders := antchainutil.ParseUploadHeaders(uploadResp.UploadHeaders)
		_err = antchainutil.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl)
		if _err != nil {
			return _result, _err
		}
		request.FileId = uploadResp.FileId
	}

	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UploadUmktParamsFileResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.umkt.params.file.upload"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 营销盾实时营销服务，支持批量
 * Summary: 营销盾实时营销服务
 */
func (client *Client) BatchqueryUmktRtMarketing(request *BatchqueryUmktRtMarketingRequest) (_result *BatchqueryUmktRtMarketingResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &BatchqueryUmktRtMarketingResponse{}
	_body, _err := client.BatchqueryUmktRtMarketingEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 营销盾实时营销服务，支持批量
 * Summary: 营销盾实时营销服务
 */
func (client *Client) BatchqueryUmktRtMarketingEx(request *BatchqueryUmktRtMarketingRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *BatchqueryUmktRtMarketingResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &BatchqueryUmktRtMarketingResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.umkt.rt.marketing.batchquery"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 梦网富信投放事件通知
 * Summary: 梦网富信投放事件通知
 */
func (client *Client) SyncUmktRtEventresult(request *SyncUmktRtEventresultRequest) (_result *SyncUmktRtEventresultResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SyncUmktRtEventresultResponse{}
	_body, _err := client.SyncUmktRtEventresultEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 梦网富信投放事件通知
 * Summary: 梦网富信投放事件通知
 */
func (client *Client) SyncUmktRtEventresultEx(request *SyncUmktRtEventresultRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SyncUmktRtEventresultResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SyncUmktRtEventresultResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.umkt.rt.eventresult.sync"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 营销盾场景租户信息上传or更新
 * Summary: 营销盾场景租户信息上传or更新
 */
func (client *Client) ImportUmktSceneUpload(request *ImportUmktSceneUploadRequest) (_result *ImportUmktSceneUploadResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ImportUmktSceneUploadResponse{}
	_body, _err := client.ImportUmktSceneUploadEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 营销盾场景租户信息上传or更新
 * Summary: 营销盾场景租户信息上传or更新
 */
func (client *Client) ImportUmktSceneUploadEx(request *ImportUmktSceneUploadRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ImportUmktSceneUploadResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ImportUmktSceneUploadResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.umkt.scene.upload.import"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 富信贴尾实时圈客
 * Summary: 富信贴尾实时圈客
 */
func (client *Client) BatchqueryUmktRtTailmarketing(request *BatchqueryUmktRtTailmarketingRequest) (_result *BatchqueryUmktRtTailmarketingResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &BatchqueryUmktRtTailmarketingResponse{}
	_body, _err := client.BatchqueryUmktRtTailmarketingEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 富信贴尾实时圈客
 * Summary: 富信贴尾实时圈客
 */
func (client *Client) BatchqueryUmktRtTailmarketingEx(request *BatchqueryUmktRtTailmarketingRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *BatchqueryUmktRtTailmarketingResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &BatchqueryUmktRtTailmarketingResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.umkt.rt.tailmarketing.batchquery"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 实时圈客场景策略测试
 * Summary: 实时圈客场景策略测试功能
 */
func (client *Client) QueryUmktScenestrategyTest(request *QueryUmktScenestrategyTestRequest) (_result *QueryUmktScenestrategyTestResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryUmktScenestrategyTestResponse{}
	_body, _err := client.QueryUmktScenestrategyTestEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 实时圈客场景策略测试
 * Summary: 实时圈客场景策略测试功能
 */
func (client *Client) QueryUmktScenestrategyTestEx(request *QueryUmktScenestrategyTestRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryUmktScenestrategyTestResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryUmktScenestrategyTestResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.umkt.scenestrategy.test.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建HTTP PUT提交的文件上传
 * Summary: 文件上传创建
 */
func (client *Client) CreateAntcloudGatewayxFileUpload(request *CreateAntcloudGatewayxFileUploadRequest) (_result *CreateAntcloudGatewayxFileUploadResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateAntcloudGatewayxFileUploadResponse{}
	_body, _err := client.CreateAntcloudGatewayxFileUploadEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建HTTP PUT提交的文件上传
 * Summary: 文件上传创建
 */
func (client *Client) CreateAntcloudGatewayxFileUploadEx(request *CreateAntcloudGatewayxFileUploadRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateAntcloudGatewayxFileUploadResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateAntcloudGatewayxFileUploadResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.gatewayx.file.upload.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
