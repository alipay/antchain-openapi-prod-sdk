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

// 批量查询输出模型分
type BatchQueryOutputModelInfo struct {
	// 变量名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 变量值
	Value *string `json:"value,omitempty" xml:"value,omitempty" require:"true"`
	// 变量值类型
	ValueType *string `json:"value_type,omitempty" xml:"value_type,omitempty" require:"true"`
}

func (s BatchQueryOutputModelInfo) String() string {
	return tea.Prettify(s)
}

func (s BatchQueryOutputModelInfo) GoString() string {
	return s.String()
}

func (s *BatchQueryOutputModelInfo) SetName(v string) *BatchQueryOutputModelInfo {
	s.Name = &v
	return s
}

func (s *BatchQueryOutputModelInfo) SetValue(v string) *BatchQueryOutputModelInfo {
	s.Value = &v
	return s
}

func (s *BatchQueryOutputModelInfo) SetValueType(v string) *BatchQueryOutputModelInfo {
	s.ValueType = &v
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

// 回流事件记录属性项
type BackflowEventRecordProperty struct {
	// 属性code
	Key *string `json:"key,omitempty" xml:"key,omitempty" require:"true"`
	// 属性value，统一为字符串
	Value *string `json:"value,omitempty" xml:"value,omitempty" require:"true"`
}

func (s BackflowEventRecordProperty) String() string {
	return tea.Prettify(s)
}

func (s BackflowEventRecordProperty) GoString() string {
	return s.String()
}

func (s *BackflowEventRecordProperty) SetKey(v string) *BackflowEventRecordProperty {
	s.Key = &v
	return s
}

func (s *BackflowEventRecordProperty) SetValue(v string) *BackflowEventRecordProperty {
	s.Value = &v
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

// 营销盾触达媒介参数信息
type ActionParamInfo struct {
	// 触达媒介类型
	ContentType *string `json:"content_type,omitempty" xml:"content_type,omitempty" require:"true"`
	// 触达媒介参数列表
	ActionParam []*string `json:"action_param,omitempty" xml:"action_param,omitempty" require:"true" type:"Repeated"`
}

func (s ActionParamInfo) String() string {
	return tea.Prettify(s)
}

func (s ActionParamInfo) GoString() string {
	return s.String()
}

func (s *ActionParamInfo) SetContentType(v string) *ActionParamInfo {
	s.ContentType = &v
	return s
}

func (s *ActionParamInfo) SetActionParam(v []*string) *ActionParamInfo {
	s.ActionParam = v
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

// 优惠券信息
type CouponInfo struct {
	// 优惠券Id
	CouponId *string `json:"coupon_id,omitempty" xml:"coupon_id,omitempty" require:"true"`
	// 优惠券名称
	CouponName *string `json:"coupon_name,omitempty" xml:"coupon_name,omitempty" require:"true"`
	// 优惠券状态
	// unUsed-未使用
	// Used-已使用
	// Expired-过期
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 使用场景
	// 01-提款使用
	// 02-还款使用
	UseCondition *string `json:"use_condition,omitempty" xml:"use_condition,omitempty" require:"true"`
	// 优惠码
	CouponCode *string `json:"coupon_code,omitempty" xml:"coupon_code,omitempty"`
	// 优惠券类型
	// 01-金额优惠
	// 02-天数优惠
	// 03-折扣优惠
	// 04-期数优惠
	// 05-固定利率
	CouponType *string `json:"coupon_type,omitempty" xml:"coupon_type,omitempty"`
	// 优惠券面额
	// coupon_type=01 时为优惠金额
	// coupon_type=02 时为减免天数
	// coupon_type=03 时为折扣值（如6 折）
	// coupon_type=04 时为减免期数
	// coupon_type=05 时为折扣值（如 8.88 为利率8.88%）
	CouponValue *string `json:"coupon_value,omitempty" xml:"coupon_value,omitempty"`
	// 当 coupon_type=01 时，才会有优惠金额
	CouponAmount *string `json:"coupon_amount,omitempty" xml:"coupon_amount,omitempty"`
	// 过期时间yyyy-MM-dd HH:mm:ss
	ExpiredTime *string `json:"expired_time,omitempty" xml:"expired_time,omitempty"`
	// 生效时间yyyy-MM-dd HH:mm:ss
	EffectiveTime *string `json:"effective_time,omitempty" xml:"effective_time,omitempty"`
	// 使用规则
	UseDetail *string `json:"use_detail,omitempty" xml:"use_detail,omitempty"`
	// 贷款最低金额
	MinAmount *string `json:"min_amount,omitempty" xml:"min_amount,omitempty"`
	// 贷款最高金额
	MaxAmount *string `json:"max_amount,omitempty" xml:"max_amount,omitempty"`
	// 最低贷款期数
	MinPeriod *string `json:"min_period,omitempty" xml:"min_period,omitempty"`
	// 最高贷款期数
	MaxPeriod *string `json:"max_period,omitempty" xml:"max_period,omitempty"`
	// 贷款最低期限天数
	MinDay *string `json:"min_day,omitempty" xml:"min_day,omitempty"`
	// 还款方式
	// 1-等额本息
	// 2-等额本金
	// 3-等本等费
	// 4-按期付息到期还本
	// 5-到期一次性还本付息
	// 6-等本等费-总费率
	// 7-等额本息(长期)
	RepaymentMethod *string `json:"repayment_method,omitempty" xml:"repayment_method,omitempty"`
	// 是否有贷款期数要求
	// 0：否
	// 1：是
	IsPeriodLimit *string `json:"is_period_limit,omitempty" xml:"is_period_limit,omitempty"`
	// 贷款期限要求还款条件
	// 01：可提前还款
	// 02：不可提前还款
	// isPeriodLimit=1 && repayCondition=01 代表：有可提前还款锁期
	// isPeriodLimit=1 && repayCondition=02 代表：有不可提前还款锁期
	RepayCondition *string `json:"repay_condition,omitempty" xml:"repay_condition,omitempty"`
	// 还款场景
	// 01-到期还款
	// 02-即期还款
	RepayWays *string `json:"repay_ways,omitempty" xml:"repay_ways,omitempty"`
	// 优惠模板Id
	CouponModelNo *string `json:"coupon_model_no,omitempty" xml:"coupon_model_no,omitempty"`
	// 至到期:X年X月X日
	// 0：不是至到期券
	// 1：是至到期券
	ToMaturity *string `json:"to_maturity,omitempty" xml:"to_maturity,omitempty"`
}

func (s CouponInfo) String() string {
	return tea.Prettify(s)
}

func (s CouponInfo) GoString() string {
	return s.String()
}

func (s *CouponInfo) SetCouponId(v string) *CouponInfo {
	s.CouponId = &v
	return s
}

func (s *CouponInfo) SetCouponName(v string) *CouponInfo {
	s.CouponName = &v
	return s
}

func (s *CouponInfo) SetStatus(v string) *CouponInfo {
	s.Status = &v
	return s
}

func (s *CouponInfo) SetUseCondition(v string) *CouponInfo {
	s.UseCondition = &v
	return s
}

func (s *CouponInfo) SetCouponCode(v string) *CouponInfo {
	s.CouponCode = &v
	return s
}

func (s *CouponInfo) SetCouponType(v string) *CouponInfo {
	s.CouponType = &v
	return s
}

func (s *CouponInfo) SetCouponValue(v string) *CouponInfo {
	s.CouponValue = &v
	return s
}

func (s *CouponInfo) SetCouponAmount(v string) *CouponInfo {
	s.CouponAmount = &v
	return s
}

func (s *CouponInfo) SetExpiredTime(v string) *CouponInfo {
	s.ExpiredTime = &v
	return s
}

func (s *CouponInfo) SetEffectiveTime(v string) *CouponInfo {
	s.EffectiveTime = &v
	return s
}

func (s *CouponInfo) SetUseDetail(v string) *CouponInfo {
	s.UseDetail = &v
	return s
}

func (s *CouponInfo) SetMinAmount(v string) *CouponInfo {
	s.MinAmount = &v
	return s
}

func (s *CouponInfo) SetMaxAmount(v string) *CouponInfo {
	s.MaxAmount = &v
	return s
}

func (s *CouponInfo) SetMinPeriod(v string) *CouponInfo {
	s.MinPeriod = &v
	return s
}

func (s *CouponInfo) SetMaxPeriod(v string) *CouponInfo {
	s.MaxPeriod = &v
	return s
}

func (s *CouponInfo) SetMinDay(v string) *CouponInfo {
	s.MinDay = &v
	return s
}

func (s *CouponInfo) SetRepaymentMethod(v string) *CouponInfo {
	s.RepaymentMethod = &v
	return s
}

func (s *CouponInfo) SetIsPeriodLimit(v string) *CouponInfo {
	s.IsPeriodLimit = &v
	return s
}

func (s *CouponInfo) SetRepayCondition(v string) *CouponInfo {
	s.RepayCondition = &v
	return s
}

func (s *CouponInfo) SetRepayWays(v string) *CouponInfo {
	s.RepayWays = &v
	return s
}

func (s *CouponInfo) SetCouponModelNo(v string) *CouponInfo {
	s.CouponModelNo = &v
	return s
}

func (s *CouponInfo) SetToMaturity(v string) *CouponInfo {
	s.ToMaturity = &v
	return s
}

// 用户的混合策略圈客结果
type UmktInfoModel struct {
	// 场景策略id
	SceneStrategyId *int64 `json:"scene_strategy_id,omitempty" xml:"scene_strategy_id,omitempty" require:"true"`
	// 实时营销结果
	UmktResult *int64 `json:"umkt_result,omitempty" xml:"umkt_result,omitempty" require:"true"`
	// json 结构的营销额外输出信息
	UmktOutPutInfo *string `json:"umkt_out_put_info,omitempty" xml:"umkt_out_put_info,omitempty" require:"true"`
}

func (s UmktInfoModel) String() string {
	return tea.Prettify(s)
}

func (s UmktInfoModel) GoString() string {
	return s.String()
}

func (s *UmktInfoModel) SetSceneStrategyId(v int64) *UmktInfoModel {
	s.SceneStrategyId = &v
	return s
}

func (s *UmktInfoModel) SetUmktResult(v int64) *UmktInfoModel {
	s.UmktResult = &v
	return s
}

func (s *UmktInfoModel) SetUmktOutPutInfo(v string) *UmktInfoModel {
	s.UmktOutPutInfo = &v
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

// 回执统计数据详情
type StatisticInfoDetail struct {
	// actionDriverCode类型
	ActionDriverCode *int64 `json:"action_driver_code,omitempty" xml:"action_driver_code,omitempty"`
	// 成功数
	SuccessCount *int64 `json:"success_count,omitempty" xml:"success_count,omitempty"`
	// 失败数
	FailCount *int64 `json:"fail_count,omitempty" xml:"fail_count,omitempty"`
	// 待触达的手机号数
	WaitingSubTaskCount *int64 `json:"waiting_sub_task_count,omitempty" xml:"waiting_sub_task_count,omitempty"`
	// 已收到的回执数
	TotalCount *int64 `json:"total_count,omitempty" xml:"total_count,omitempty"`
}

func (s StatisticInfoDetail) String() string {
	return tea.Prettify(s)
}

func (s StatisticInfoDetail) GoString() string {
	return s.String()
}

func (s *StatisticInfoDetail) SetActionDriverCode(v int64) *StatisticInfoDetail {
	s.ActionDriverCode = &v
	return s
}

func (s *StatisticInfoDetail) SetSuccessCount(v int64) *StatisticInfoDetail {
	s.SuccessCount = &v
	return s
}

func (s *StatisticInfoDetail) SetFailCount(v int64) *StatisticInfoDetail {
	s.FailCount = &v
	return s
}

func (s *StatisticInfoDetail) SetWaitingSubTaskCount(v int64) *StatisticInfoDetail {
	s.WaitingSubTaskCount = &v
	return s
}

func (s *StatisticInfoDetail) SetTotalCount(v int64) *StatisticInfoDetail {
	s.TotalCount = &v
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
	// 已还担保费
	AlreadyGuaranteeFee *int64 `json:"already_guarantee_fee,omitempty" xml:"already_guarantee_fee,omitempty" require:"true"`
	// 已还违约金
	AlreadyLiquidatedDamages *int64 `json:"already_liquidated_damages,omitempty" xml:"already_liquidated_damages,omitempty" require:"true"`
	// 当期剩余担保费
	RestGuaranteeFee *int64 `json:"rest_guarantee_fee,omitempty" xml:"rest_guarantee_fee,omitempty" require:"true"`
	// 当期剩余违约金
	RestLiquidatedDamages *int64 `json:"rest_liquidated_damages,omitempty" xml:"rest_liquidated_damages,omitempty" require:"true"`
	// 应还担保费
	NeedGuaranteeFee *int64 `json:"need_guarantee_fee,omitempty" xml:"need_guarantee_fee,omitempty" require:"true"`
	// 应还违约金
	NeedLiquidatedDamages *int64 `json:"need_liquidated_damages,omitempty" xml:"need_liquidated_damages,omitempty" require:"true"`
	// 逾期天数
	OverdueDays *int64 `json:"overdue_days,omitempty" xml:"overdue_days,omitempty" require:"true"`
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

func (s *RepayResult) SetAlreadyGuaranteeFee(v int64) *RepayResult {
	s.AlreadyGuaranteeFee = &v
	return s
}

func (s *RepayResult) SetAlreadyLiquidatedDamages(v int64) *RepayResult {
	s.AlreadyLiquidatedDamages = &v
	return s
}

func (s *RepayResult) SetRestGuaranteeFee(v int64) *RepayResult {
	s.RestGuaranteeFee = &v
	return s
}

func (s *RepayResult) SetRestLiquidatedDamages(v int64) *RepayResult {
	s.RestLiquidatedDamages = &v
	return s
}

func (s *RepayResult) SetNeedGuaranteeFee(v int64) *RepayResult {
	s.NeedGuaranteeFee = &v
	return s
}

func (s *RepayResult) SetNeedLiquidatedDamages(v int64) *RepayResult {
	s.NeedLiquidatedDamages = &v
	return s
}

func (s *RepayResult) SetOverdueDays(v int64) *RepayResult {
	s.OverdueDays = &v
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

// 短信模板
type SmsTemplate struct {
	// 场景策略ID
	SceneStrategyId *string `json:"scene_strategy_id,omitempty" xml:"scene_strategy_id,omitempty" require:"true"`
	// 计划名称
	SceneStrategyName *string `json:"scene_strategy_name,omitempty" xml:"scene_strategy_name,omitempty" require:"true"`
	// 模板内容
	TemplateContent *string `json:"template_content,omitempty" xml:"template_content,omitempty" require:"true"`
}

func (s SmsTemplate) String() string {
	return tea.Prettify(s)
}

func (s SmsTemplate) GoString() string {
	return s.String()
}

func (s *SmsTemplate) SetSceneStrategyId(v string) *SmsTemplate {
	s.SceneStrategyId = &v
	return s
}

func (s *SmsTemplate) SetSceneStrategyName(v string) *SmsTemplate {
	s.SceneStrategyName = &v
	return s
}

func (s *SmsTemplate) SetTemplateContent(v string) *SmsTemplate {
	s.TemplateContent = &v
	return s
}

// 回流事件记录
type BackflowEventRecord struct {
	// 回流事件部分分组后的记录list
	Properties []*BackflowEventRecordProperty `json:"properties,omitempty" xml:"properties,omitempty" require:"true" type:"Repeated"`
}

func (s BackflowEventRecord) String() string {
	return tea.Prettify(s)
}

func (s BackflowEventRecord) GoString() string {
	return s.String()
}

func (s *BackflowEventRecord) SetProperties(v []*BackflowEventRecordProperty) *BackflowEventRecord {
	s.Properties = v
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

// 还款信息列表
type RepayInfos struct {
	// 期次
	Period *int64 `json:"period,omitempty" xml:"period,omitempty" require:"true"`
	// 实还总额
	Amount *int64 `json:"amount,omitempty" xml:"amount,omitempty" require:"true"`
	// 实还本金
	Principal *int64 `json:"principal,omitempty" xml:"principal,omitempty" require:"true"`
	// 实还利息
	Interest *int64 `json:"interest,omitempty" xml:"interest,omitempty" require:"true"`
	// 实还通道手续费
	ChannelAmt *int64 `json:"channel_amt,omitempty" xml:"channel_amt,omitempty" require:"true"`
	// 实还手续费
	Fee *int64 `json:"fee,omitempty" xml:"fee,omitempty" require:"true"`
	// 实收罚息
	Punish *int64 `json:"punish,omitempty" xml:"punish,omitempty" require:"true"`
	// 担保费
	GuaranteeFee *int64 `json:"guarantee_fee,omitempty" xml:"guarantee_fee,omitempty" require:"true"`
	// 违约金
	LiquidatedDamages *int64 `json:"liquidated_damages,omitempty" xml:"liquidated_damages,omitempty" require:"true"`
}

func (s RepayInfos) String() string {
	return tea.Prettify(s)
}

func (s RepayInfos) GoString() string {
	return s.String()
}

func (s *RepayInfos) SetPeriod(v int64) *RepayInfos {
	s.Period = &v
	return s
}

func (s *RepayInfos) SetAmount(v int64) *RepayInfos {
	s.Amount = &v
	return s
}

func (s *RepayInfos) SetPrincipal(v int64) *RepayInfos {
	s.Principal = &v
	return s
}

func (s *RepayInfos) SetInterest(v int64) *RepayInfos {
	s.Interest = &v
	return s
}

func (s *RepayInfos) SetChannelAmt(v int64) *RepayInfos {
	s.ChannelAmt = &v
	return s
}

func (s *RepayInfos) SetFee(v int64) *RepayInfos {
	s.Fee = &v
	return s
}

func (s *RepayInfos) SetPunish(v int64) *RepayInfos {
	s.Punish = &v
	return s
}

func (s *RepayInfos) SetGuaranteeFee(v int64) *RepayInfos {
	s.GuaranteeFee = &v
	return s
}

func (s *RepayInfos) SetLiquidatedDamages(v int64) *RepayInfos {
	s.LiquidatedDamages = &v
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

// 天枢用户聚合状态信息
type UserAggregationInfo struct {
	// 状态
	// 0: 未授信
	// 1: 授信中
	// 2: 已授信未支用
	// 3: 支用中
	// 4: 已支用
	// 5: 借据逾期
	// 6: 授信过期
	// 7: 授信冻结
	// 8: 可重新授信
	// 9: 授信拒绝
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 总额度
	CreditAmount *int64 `json:"credit_amount,omitempty" xml:"credit_amount,omitempty"`
	// 可用额度
	AvailableAmount *int64 `json:"available_amount,omitempty" xml:"available_amount,omitempty"`
	// 待还总金额
	ShouldPayAmount *int64 `json:"should_pay_amount,omitempty" xml:"should_pay_amount,omitempty"`
	// 逾期总金额
	OverdueAmount *int64 `json:"overdue_amount,omitempty" xml:"overdue_amount,omitempty"`
	// 下一期应还金额
	NextPeriodAmount *int64 `json:"next_period_amount,omitempty" xml:"next_period_amount,omitempty"`
	// 下一期还款时间yyyy-MM-dd
	NextPeriodRepayTime *string `json:"next_period_repay_time,omitempty" xml:"next_period_repay_time,omitempty"`
	// 下次可授信时间yyyy-MM-dd
	NextApplyTime *string `json:"next_apply_time,omitempty" xml:"next_apply_time,omitempty"`
	// 优惠券列表
	CouponList []*CouponInfo `json:"coupon_list,omitempty" xml:"coupon_list,omitempty" type:"Repeated"`
}

func (s UserAggregationInfo) String() string {
	return tea.Prettify(s)
}

func (s UserAggregationInfo) GoString() string {
	return s.String()
}

func (s *UserAggregationInfo) SetStatus(v string) *UserAggregationInfo {
	s.Status = &v
	return s
}

func (s *UserAggregationInfo) SetCreditAmount(v int64) *UserAggregationInfo {
	s.CreditAmount = &v
	return s
}

func (s *UserAggregationInfo) SetAvailableAmount(v int64) *UserAggregationInfo {
	s.AvailableAmount = &v
	return s
}

func (s *UserAggregationInfo) SetShouldPayAmount(v int64) *UserAggregationInfo {
	s.ShouldPayAmount = &v
	return s
}

func (s *UserAggregationInfo) SetOverdueAmount(v int64) *UserAggregationInfo {
	s.OverdueAmount = &v
	return s
}

func (s *UserAggregationInfo) SetNextPeriodAmount(v int64) *UserAggregationInfo {
	s.NextPeriodAmount = &v
	return s
}

func (s *UserAggregationInfo) SetNextPeriodRepayTime(v string) *UserAggregationInfo {
	s.NextPeriodRepayTime = &v
	return s
}

func (s *UserAggregationInfo) SetNextApplyTime(v string) *UserAggregationInfo {
	s.NextApplyTime = &v
	return s
}

func (s *UserAggregationInfo) SetCouponList(v []*CouponInfo) *UserAggregationInfo {
	s.CouponList = v
	return s
}

// 场景决策列表
type SceneInfos struct {
	// 决策结果
	Decision *string `json:"decision,omitempty" xml:"decision,omitempty" require:"true"`
	// 场景code
	SceneCode *string `json:"scene_code,omitempty" xml:"scene_code,omitempty" require:"true"`
}

func (s SceneInfos) String() string {
	return tea.Prettify(s)
}

func (s SceneInfos) GoString() string {
	return s.String()
}

func (s *SceneInfos) SetDecision(v string) *SceneInfos {
	s.Decision = &v
	return s
}

func (s *SceneInfos) SetSceneCode(v string) *SceneInfos {
	s.SceneCode = &v
	return s
}

// 触达策略信息
type ActionPlanDetailInfo struct {
	// 场景策略id
	SceneStrategyId *int64 `json:"scene_strategy_id,omitempty" xml:"scene_strategy_id,omitempty" require:"true"`
	// 场景策略名称
	SceneStrategyName *string `json:"scene_strategy_name,omitempty" xml:"scene_strategy_name,omitempty" require:"true"`
	// 场景策略状态
	SceneStrategyStatus *string `json:"scene_strategy_status,omitempty" xml:"scene_strategy_status,omitempty" require:"true"`
	// 创建时间
	GmtCreate *string `json:"gmt_create,omitempty" xml:"gmt_create,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 修改时间
	GmtModified *string `json:"gmt_modified,omitempty" xml:"gmt_modified,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 触达媒介参数信息
	ActionParamInfo []*ActionParamInfo `json:"action_param_info,omitempty" xml:"action_param_info,omitempty" require:"true" type:"Repeated"`
}

func (s ActionPlanDetailInfo) String() string {
	return tea.Prettify(s)
}

func (s ActionPlanDetailInfo) GoString() string {
	return s.String()
}

func (s *ActionPlanDetailInfo) SetSceneStrategyId(v int64) *ActionPlanDetailInfo {
	s.SceneStrategyId = &v
	return s
}

func (s *ActionPlanDetailInfo) SetSceneStrategyName(v string) *ActionPlanDetailInfo {
	s.SceneStrategyName = &v
	return s
}

func (s *ActionPlanDetailInfo) SetSceneStrategyStatus(v string) *ActionPlanDetailInfo {
	s.SceneStrategyStatus = &v
	return s
}

func (s *ActionPlanDetailInfo) SetGmtCreate(v string) *ActionPlanDetailInfo {
	s.GmtCreate = &v
	return s
}

func (s *ActionPlanDetailInfo) SetGmtModified(v string) *ActionPlanDetailInfo {
	s.GmtModified = &v
	return s
}

func (s *ActionPlanDetailInfo) SetActionParamInfo(v []*ActionParamInfo) *ActionPlanDetailInfo {
	s.ActionParamInfo = v
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

// 上传文件运行结果
type RuntimeResult struct {
	// 上传成功
	Code *int64 `json:"code,omitempty" xml:"code,omitempty" require:"true"`
	// true代表上传成功，false代表上传失败
	Success *bool `json:"success,omitempty" xml:"success,omitempty" require:"true"`
	// 上文件传成功
	Resultmsg *string `json:"resultmsg,omitempty" xml:"resultmsg,omitempty" require:"true"`
	// 文件上传结果
	Data *string `json:"data,omitempty" xml:"data,omitempty" require:"true"`
}

func (s RuntimeResult) String() string {
	return tea.Prettify(s)
}

func (s RuntimeResult) GoString() string {
	return s.String()
}

func (s *RuntimeResult) SetCode(v int64) *RuntimeResult {
	s.Code = &v
	return s
}

func (s *RuntimeResult) SetSuccess(v bool) *RuntimeResult {
	s.Success = &v
	return s
}

func (s *RuntimeResult) SetResultmsg(v string) *RuntimeResult {
	s.Resultmsg = &v
	return s
}

func (s *RuntimeResult) SetData(v string) *RuntimeResult {
	s.Data = &v
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

// 信护盾产品查询信息
type QueryInfo struct {
	// key
	Key *string `json:"key,omitempty" xml:"key,omitempty"`
	// value
	Value *string `json:"value,omitempty" xml:"value,omitempty"`
}

func (s QueryInfo) String() string {
	return tea.Prettify(s)
}

func (s QueryInfo) GoString() string {
	return s.String()
}

func (s *QueryInfo) SetKey(v string) *QueryInfo {
	s.Key = &v
	return s
}

func (s *QueryInfo) SetValue(v string) *QueryInfo {
	s.Value = &v
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

// 回执统计结果
type StatisticResult struct {
	// 有效任务总数量
	ValidCount *int64 `json:"valid_count,omitempty" xml:"valid_count,omitempty" require:"true"`
	// 各类actionDriverCode的统计结果集合
	StatisticInfoDetailList []*StatisticInfoDetail `json:"statistic_info_detail_list,omitempty" xml:"statistic_info_detail_list,omitempty" require:"true" type:"Repeated"`
}

func (s StatisticResult) String() string {
	return tea.Prettify(s)
}

func (s StatisticResult) GoString() string {
	return s.String()
}

func (s *StatisticResult) SetValidCount(v int64) *StatisticResult {
	s.ValidCount = &v
	return s
}

func (s *StatisticResult) SetStatisticInfoDetailList(v []*StatisticInfoDetail) *StatisticResult {
	s.StatisticInfoDetailList = v
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

// 营销盾离线圈客任务详细信息
type UmktOfflineDecisionTaskDetailInfo struct {
	// 任务id
	TaskId *int64 `json:"task_id,omitempty" xml:"task_id,omitempty" require:"true"`
	// 圈客计划id
	DecisionPlanId *int64 `json:"decision_plan_id,omitempty" xml:"decision_plan_id,omitempty" require:"true"`
	// 圈客结果状态
	DecisionResultStatus *string `json:"decision_result_status,omitempty" xml:"decision_result_status,omitempty" require:"true"`
	// 圈客结果状态描述
	StatusRemark *string `json:"status_remark,omitempty" xml:"status_remark,omitempty" require:"true"`
}

func (s UmktOfflineDecisionTaskDetailInfo) String() string {
	return tea.Prettify(s)
}

func (s UmktOfflineDecisionTaskDetailInfo) GoString() string {
	return s.String()
}

func (s *UmktOfflineDecisionTaskDetailInfo) SetTaskId(v int64) *UmktOfflineDecisionTaskDetailInfo {
	s.TaskId = &v
	return s
}

func (s *UmktOfflineDecisionTaskDetailInfo) SetDecisionPlanId(v int64) *UmktOfflineDecisionTaskDetailInfo {
	s.DecisionPlanId = &v
	return s
}

func (s *UmktOfflineDecisionTaskDetailInfo) SetDecisionResultStatus(v string) *UmktOfflineDecisionTaskDetailInfo {
	s.DecisionResultStatus = &v
	return s
}

func (s *UmktOfflineDecisionTaskDetailInfo) SetStatusRemark(v string) *UmktOfflineDecisionTaskDetailInfo {
	s.StatusRemark = &v
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

// 客户信息结果
type CustomInfoResult struct {
	// 社会信用代码
	CreditCode *string `json:"credit_code,omitempty" xml:"credit_code,omitempty" require:"true"`
	// 公司名称
	CompanyName *string `json:"company_name,omitempty" xml:"company_name,omitempty" require:"true"`
	// 法人姓名
	LegalName *string `json:"legal_name,omitempty" xml:"legal_name,omitempty" require:"true"`
	// 身份证号
	IdCard *string `json:"id_card,omitempty" xml:"id_card,omitempty" require:"true"`
	// 手机号
	PhoneNumber *string `json:"phone_number,omitempty" xml:"phone_number,omitempty" require:"true"`
	// 账号
	Account *string `json:"account,omitempty" xml:"account,omitempty" require:"true"`
	// 密码
	Password *string `json:"password,omitempty" xml:"password,omitempty" require:"true"`
}

func (s CustomInfoResult) String() string {
	return tea.Prettify(s)
}

func (s CustomInfoResult) GoString() string {
	return s.String()
}

func (s *CustomInfoResult) SetCreditCode(v string) *CustomInfoResult {
	s.CreditCode = &v
	return s
}

func (s *CustomInfoResult) SetCompanyName(v string) *CustomInfoResult {
	s.CompanyName = &v
	return s
}

func (s *CustomInfoResult) SetLegalName(v string) *CustomInfoResult {
	s.LegalName = &v
	return s
}

func (s *CustomInfoResult) SetIdCard(v string) *CustomInfoResult {
	s.IdCard = &v
	return s
}

func (s *CustomInfoResult) SetPhoneNumber(v string) *CustomInfoResult {
	s.PhoneNumber = &v
	return s
}

func (s *CustomInfoResult) SetAccount(v string) *CustomInfoResult {
	s.Account = &v
	return s
}

func (s *CustomInfoResult) SetPassword(v string) *CustomInfoResult {
	s.Password = &v
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

// 授信信息
type ApplyInfo struct {
	// 授信编号
	ApplyNo *string `json:"apply_no,omitempty" xml:"apply_no,omitempty"`
	// 资金方编号
	FundCode *string `json:"fund_code,omitempty" xml:"fund_code,omitempty"`
	// 资金方名称
	FundName *string `json:"fund_name,omitempty" xml:"fund_name,omitempty"`
	// 贷款利率
	RateValue *int64 `json:"rate_value,omitempty" xml:"rate_value,omitempty"`
	// 贷款日利率
	RateValueDay *int64 `json:"rate_value_day,omitempty" xml:"rate_value_day,omitempty"`
	// 年天数
	DaysNumYear *int64 `json:"days_num_year,omitempty" xml:"days_num_year,omitempty"`
	// 总授信额度
	TotalAmount *int64 `json:"total_amount,omitempty" xml:"total_amount,omitempty"`
	// 可用额度
	BalanceAmount *int64 `json:"balance_amount,omitempty" xml:"balance_amount,omitempty"`
}

func (s ApplyInfo) String() string {
	return tea.Prettify(s)
}

func (s ApplyInfo) GoString() string {
	return s.String()
}

func (s *ApplyInfo) SetApplyNo(v string) *ApplyInfo {
	s.ApplyNo = &v
	return s
}

func (s *ApplyInfo) SetFundCode(v string) *ApplyInfo {
	s.FundCode = &v
	return s
}

func (s *ApplyInfo) SetFundName(v string) *ApplyInfo {
	s.FundName = &v
	return s
}

func (s *ApplyInfo) SetRateValue(v int64) *ApplyInfo {
	s.RateValue = &v
	return s
}

func (s *ApplyInfo) SetRateValueDay(v int64) *ApplyInfo {
	s.RateValueDay = &v
	return s
}

func (s *ApplyInfo) SetDaysNumYear(v int64) *ApplyInfo {
	s.DaysNumYear = &v
	return s
}

func (s *ApplyInfo) SetTotalAmount(v int64) *ApplyInfo {
	s.TotalAmount = &v
	return s
}

func (s *ApplyInfo) SetBalanceAmount(v int64) *ApplyInfo {
	s.BalanceAmount = &v
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

// 混合批量营销圈客结果
type CustomerUmktInfosModel struct {
	// 归属用户的混合营销决策结果
	UmktResults []*UmktInfoModel `json:"umkt_results,omitempty" xml:"umkt_results,omitempty" require:"true" type:"Repeated"`
	// 用户凭证
	CustomerKey *string `json:"customer_key,omitempty" xml:"customer_key,omitempty" require:"true"`
}

func (s CustomerUmktInfosModel) String() string {
	return tea.Prettify(s)
}

func (s CustomerUmktInfosModel) GoString() string {
	return s.String()
}

func (s *CustomerUmktInfosModel) SetUmktResults(v []*UmktInfoModel) *CustomerUmktInfosModel {
	s.UmktResults = v
	return s
}

func (s *CustomerUmktInfosModel) SetCustomerKey(v string) *CustomerUmktInfosModel {
	s.CustomerKey = &v
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

// 资金方信息
type GwFundRouterResult struct {
	// 资金方代码
	FundCode *string `json:"fund_code,omitempty" xml:"fund_code,omitempty" require:"true"`
	// 资金方简称
	AbbreFundName *string `json:"abbre_fund_name,omitempty" xml:"abbre_fund_name,omitempty" require:"true"`
}

func (s GwFundRouterResult) String() string {
	return tea.Prettify(s)
}

func (s GwFundRouterResult) GoString() string {
	return s.String()
}

func (s *GwFundRouterResult) SetFundCode(v string) *GwFundRouterResult {
	s.FundCode = &v
	return s
}

func (s *GwFundRouterResult) SetAbbreFundName(v string) *GwFundRouterResult {
	s.AbbreFundName = &v
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

// AI外呼每个用户维度的参数信息
type RobotCallCustomerParam struct {
	// 手机号/手机号md5
	CustomerKey *string `json:"customer_key,omitempty" xml:"customer_key,omitempty" require:"true"`
	// 用户维度透传字段
	CustomerOutInfo *string `json:"customer_out_info,omitempty" xml:"customer_out_info,omitempty"`
	// 外呼话术变量字段
	Properties *string `json:"properties,omitempty" xml:"properties,omitempty"`
}

func (s RobotCallCustomerParam) String() string {
	return tea.Prettify(s)
}

func (s RobotCallCustomerParam) GoString() string {
	return s.String()
}

func (s *RobotCallCustomerParam) SetCustomerKey(v string) *RobotCallCustomerParam {
	s.CustomerKey = &v
	return s
}

func (s *RobotCallCustomerParam) SetCustomerOutInfo(v string) *RobotCallCustomerParam {
	s.CustomerOutInfo = &v
	return s
}

func (s *RobotCallCustomerParam) SetProperties(v string) *RobotCallCustomerParam {
	s.Properties = &v
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

// 短信模板内容
type CpaasSmsTemplate struct {
	// 模板类型
	TemplateType *string `json:"template_type,omitempty" xml:"template_type,omitempty"`
	// 模板名称
	TemplateName *string `json:"template_name,omitempty" xml:"template_name,omitempty"`
	// 模板内容
	TemplateContent *string `json:"template_content,omitempty" xml:"template_content,omitempty"`
	// 审批状态
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 模版code
	TemplateCode *string `json:"template_code,omitempty" xml:"template_code,omitempty"`
	// 审核未通过原因
	FailReason *string `json:"fail_reason,omitempty" xml:"fail_reason,omitempty"`
	// 短信创建时间
	CreateTime *string `json:"create_time,omitempty" xml:"create_time,omitempty"`
}

func (s CpaasSmsTemplate) String() string {
	return tea.Prettify(s)
}

func (s CpaasSmsTemplate) GoString() string {
	return s.String()
}

func (s *CpaasSmsTemplate) SetTemplateType(v string) *CpaasSmsTemplate {
	s.TemplateType = &v
	return s
}

func (s *CpaasSmsTemplate) SetTemplateName(v string) *CpaasSmsTemplate {
	s.TemplateName = &v
	return s
}

func (s *CpaasSmsTemplate) SetTemplateContent(v string) *CpaasSmsTemplate {
	s.TemplateContent = &v
	return s
}

func (s *CpaasSmsTemplate) SetStatus(v string) *CpaasSmsTemplate {
	s.Status = &v
	return s
}

func (s *CpaasSmsTemplate) SetTemplateCode(v string) *CpaasSmsTemplate {
	s.TemplateCode = &v
	return s
}

func (s *CpaasSmsTemplate) SetFailReason(v string) *CpaasSmsTemplate {
	s.FailReason = &v
	return s
}

func (s *CpaasSmsTemplate) SetCreateTime(v string) *CpaasSmsTemplate {
	s.CreateTime = &v
	return s
}

// 输出变量列表
type VariableDetails struct {
	// 输出变量名称
	VariableName *string `json:"variable_name,omitempty" xml:"variable_name,omitempty" require:"true"`
	// 输出变量值
	VariableValue *string `json:"variable_value,omitempty" xml:"variable_value,omitempty" require:"true"`
	// 输出变量值类型
	VariableType *string `json:"variable_type,omitempty" xml:"variable_type,omitempty" require:"true"`
}

func (s VariableDetails) String() string {
	return tea.Prettify(s)
}

func (s VariableDetails) GoString() string {
	return s.String()
}

func (s *VariableDetails) SetVariableName(v string) *VariableDetails {
	s.VariableName = &v
	return s
}

func (s *VariableDetails) SetVariableValue(v string) *VariableDetails {
	s.VariableValue = &v
	return s
}

func (s *VariableDetails) SetVariableType(v string) *VariableDetails {
	s.VariableType = &v
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

func (s *RepayRef) SetNeedCorpus(v int64) *RepayRef {
	s.NeedCorpus = &v
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

// 回调通用返回体
type CommonNotyfyResult struct {
	// 请求id
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty" require:"true"`
	// 业务响应Json
	BizResponse *string `json:"biz_response,omitempty" xml:"biz_response,omitempty" require:"true"`
}

func (s CommonNotyfyResult) String() string {
	return tea.Prettify(s)
}

func (s CommonNotyfyResult) GoString() string {
	return s.String()
}

func (s *CommonNotyfyResult) SetRequestId(v string) *CommonNotyfyResult {
	s.RequestId = &v
	return s
}

func (s *CommonNotyfyResult) SetBizResponse(v string) *CommonNotyfyResult {
	s.BizResponse = &v
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

// 还款方式/借款期数信息
type PlatformRepayTypeInfo struct {
	// 1：等额本息
	// 2：等额本金
	// 3：按期付息到期还本（先息后本）
	RepayType *string `json:"repay_type,omitempty" xml:"repay_type,omitempty" require:"true"`
	// {”1“，”2“}
	Periods []*string `json:"periods,omitempty" xml:"periods,omitempty" require:"true" type:"Repeated"`
}

func (s PlatformRepayTypeInfo) String() string {
	return tea.Prettify(s)
}

func (s PlatformRepayTypeInfo) GoString() string {
	return s.String()
}

func (s *PlatformRepayTypeInfo) SetRepayType(v string) *PlatformRepayTypeInfo {
	s.RepayType = &v
	return s
}

func (s *PlatformRepayTypeInfo) SetPeriods(v []*string) *PlatformRepayTypeInfo {
	s.Periods = v
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
	Education *string `json:"education,omitempty" xml:"education,omitempty"`
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
	// 婚姻状态：00-未婚，01-已婚，02-离婚，03-丧偶，99-未知
	MaritalStatus *string `json:"marital_status,omitempty" xml:"marital_status,omitempty"`
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

func (s *PersonalInfo) SetMaritalStatus(v string) *PersonalInfo {
	s.MaritalStatus = &v
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

// 用户凭证信息
type CustomerDetail struct {
	// 用户标识
	CustomerKey *string `json:"customer_key,omitempty" xml:"customer_key,omitempty" require:"true"`
	// 渠道参数
	ChannelParams *string `json:"channel_params,omitempty" xml:"channel_params,omitempty" require:"true"`
	// 用户透传字段
	ExtInfo *string `json:"ext_info,omitempty" xml:"ext_info,omitempty" require:"true"`
}

func (s CustomerDetail) String() string {
	return tea.Prettify(s)
}

func (s CustomerDetail) GoString() string {
	return s.String()
}

func (s *CustomerDetail) SetCustomerKey(v string) *CustomerDetail {
	s.CustomerKey = &v
	return s
}

func (s *CustomerDetail) SetChannelParams(v string) *CustomerDetail {
	s.ChannelParams = &v
	return s
}

func (s *CustomerDetail) SetExtInfo(v string) *CustomerDetail {
	s.ExtInfo = &v
	return s
}

// 用户绑定银行卡列表
type CustomerBankCardInfo struct {
	// 银行名称
	BankName *string `json:"bank_name,omitempty" xml:"bank_name,omitempty" require:"true"`
	// 银行编码
	BankCode *string `json:"bank_code,omitempty" xml:"bank_code,omitempty" require:"true"`
	// 银行卡号
	BankCardNo *string `json:"bank_card_no,omitempty" xml:"bank_card_no,omitempty" require:"true"`
	// 是否已签约
	Signed *string `json:"signed,omitempty" xml:"signed,omitempty"`
	// 是否为账户代扣银行卡
	AcctBankCard *string `json:"acct_bank_card,omitempty" xml:"acct_bank_card,omitempty"`
}

func (s CustomerBankCardInfo) String() string {
	return tea.Prettify(s)
}

func (s CustomerBankCardInfo) GoString() string {
	return s.String()
}

func (s *CustomerBankCardInfo) SetBankName(v string) *CustomerBankCardInfo {
	s.BankName = &v
	return s
}

func (s *CustomerBankCardInfo) SetBankCode(v string) *CustomerBankCardInfo {
	s.BankCode = &v
	return s
}

func (s *CustomerBankCardInfo) SetBankCardNo(v string) *CustomerBankCardInfo {
	s.BankCardNo = &v
	return s
}

func (s *CustomerBankCardInfo) SetSigned(v string) *CustomerBankCardInfo {
	s.Signed = &v
	return s
}

func (s *CustomerBankCardInfo) SetAcctBankCard(v string) *CustomerBankCardInfo {
	s.AcctBankCard = &v
	return s
}

// 供应商
type Supplier struct {
	// 供应商id
	SupplierId *string `json:"supplier_id,omitempty" xml:"supplier_id,omitempty" require:"true"`
	// 供应商名字
	SupplierName *string `json:"supplier_name,omitempty" xml:"supplier_name,omitempty" require:"true"`
}

func (s Supplier) String() string {
	return tea.Prettify(s)
}

func (s Supplier) GoString() string {
	return s.String()
}

func (s *Supplier) SetSupplierId(v string) *Supplier {
	s.SupplierId = &v
	return s
}

func (s *Supplier) SetSupplierName(v string) *Supplier {
	s.SupplierName = &v
	return s
}

// 查询结果
type QueryResult struct {
	// key
	Key *string `json:"key,omitempty" xml:"key,omitempty"`
	// value
	Value *string `json:"value,omitempty" xml:"value,omitempty"`
}

func (s QueryResult) String() string {
	return tea.Prettify(s)
}

func (s QueryResult) GoString() string {
	return s.String()
}

func (s *QueryResult) SetKey(v string) *QueryResult {
	s.Key = &v
	return s
}

func (s *QueryResult) SetValue(v string) *QueryResult {
	s.Value = &v
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

// 企管盾票税交接决策服务指标
type RdaasTaxDecsionServiceIndicator struct {
	// 决策指标id
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 决策服务id
	ServiceId *string `json:"service_id,omitempty" xml:"service_id,omitempty" require:"true"`
	// 属性名
	PropertyName *string `json:"property_name,omitempty" xml:"property_name,omitempty" require:"true"`
	// 属性值或指标值
	PropertyValue *string `json:"property_value,omitempty" xml:"property_value,omitempty"`
	// 决策租户
	DecisionTenant *string `json:"decision_tenant,omitempty" xml:"decision_tenant,omitempty"`
	// 创建时间，格式:yyyy-MM-dd HH:mm:ss
	CreateTime *string `json:"create_time,omitempty" xml:"create_time,omitempty"`
}

func (s RdaasTaxDecsionServiceIndicator) String() string {
	return tea.Prettify(s)
}

func (s RdaasTaxDecsionServiceIndicator) GoString() string {
	return s.String()
}

func (s *RdaasTaxDecsionServiceIndicator) SetId(v string) *RdaasTaxDecsionServiceIndicator {
	s.Id = &v
	return s
}

func (s *RdaasTaxDecsionServiceIndicator) SetServiceId(v string) *RdaasTaxDecsionServiceIndicator {
	s.ServiceId = &v
	return s
}

func (s *RdaasTaxDecsionServiceIndicator) SetPropertyName(v string) *RdaasTaxDecsionServiceIndicator {
	s.PropertyName = &v
	return s
}

func (s *RdaasTaxDecsionServiceIndicator) SetPropertyValue(v string) *RdaasTaxDecsionServiceIndicator {
	s.PropertyValue = &v
	return s
}

func (s *RdaasTaxDecsionServiceIndicator) SetDecisionTenant(v string) *RdaasTaxDecsionServiceIndicator {
	s.DecisionTenant = &v
	return s
}

func (s *RdaasTaxDecsionServiceIndicator) SetCreateTime(v string) *RdaasTaxDecsionServiceIndicator {
	s.CreateTime = &v
	return s
}

// 天枢预览协议信息
type GetAgreementUrlResponseData struct {
	// 协议标题
	Title *string `json:"title,omitempty" xml:"title,omitempty" require:"true"`
	// 协议地址
	AgreementUrl *string `json:"agreement_url,omitempty" xml:"agreement_url,omitempty"`
	// 协议文件Base64
	FileBase64 *string `json:"file_base64,omitempty" xml:"file_base64,omitempty"`
	// 协议图片文件base64集合
	PicFileBase64List []*string `json:"pic_file_base64_list,omitempty" xml:"pic_file_base64_list,omitempty" type:"Repeated"`
	// 图片文件oss集合
	PicOssPathList []*string `json:"pic_oss_path_list,omitempty" xml:"pic_oss_path_list,omitempty" type:"Repeated"`
	// 机构名称
	OrganizationName *string `json:"organization_name,omitempty" xml:"organization_name,omitempty" require:"true"`
	// 协议类型-code
	FileType *string `json:"file_type,omitempty" xml:"file_type,omitempty" require:"true"`
	// 协议类型-名称
	FileTypeName *string `json:"file_type_name,omitempty" xml:"file_type_name,omitempty" require:"true"`
}

func (s GetAgreementUrlResponseData) String() string {
	return tea.Prettify(s)
}

func (s GetAgreementUrlResponseData) GoString() string {
	return s.String()
}

func (s *GetAgreementUrlResponseData) SetTitle(v string) *GetAgreementUrlResponseData {
	s.Title = &v
	return s
}

func (s *GetAgreementUrlResponseData) SetAgreementUrl(v string) *GetAgreementUrlResponseData {
	s.AgreementUrl = &v
	return s
}

func (s *GetAgreementUrlResponseData) SetFileBase64(v string) *GetAgreementUrlResponseData {
	s.FileBase64 = &v
	return s
}

func (s *GetAgreementUrlResponseData) SetPicFileBase64List(v []*string) *GetAgreementUrlResponseData {
	s.PicFileBase64List = v
	return s
}

func (s *GetAgreementUrlResponseData) SetPicOssPathList(v []*string) *GetAgreementUrlResponseData {
	s.PicOssPathList = v
	return s
}

func (s *GetAgreementUrlResponseData) SetOrganizationName(v string) *GetAgreementUrlResponseData {
	s.OrganizationName = &v
	return s
}

func (s *GetAgreementUrlResponseData) SetFileType(v string) *GetAgreementUrlResponseData {
	s.FileType = &v
	return s
}

func (s *GetAgreementUrlResponseData) SetFileTypeName(v string) *GetAgreementUrlResponseData {
	s.FileTypeName = &v
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

// 批量决策单主体查询结果
type BatchQueryResult struct {
	// 查询主体
	QueryKey *string `json:"query_key,omitempty" xml:"query_key,omitempty" require:"true"`
	// 单用户决策结果
	Decision *string `json:"decision,omitempty" xml:"decision,omitempty" require:"true"`
	// 输出变量信息
	OutputInfo *BatchQueryOutputModelInfo `json:"output_info,omitempty" xml:"output_info,omitempty" require:"true"`
}

func (s BatchQueryResult) String() string {
	return tea.Prettify(s)
}

func (s BatchQueryResult) GoString() string {
	return s.String()
}

func (s *BatchQueryResult) SetQueryKey(v string) *BatchQueryResult {
	s.QueryKey = &v
	return s
}

func (s *BatchQueryResult) SetDecision(v string) *BatchQueryResult {
	s.Decision = &v
	return s
}

func (s *BatchQueryResult) SetOutputInfo(v *BatchQueryOutputModelInfo) *BatchQueryResult {
	s.OutputInfo = v
	return s
}

// 营销盾外呼记录
type CommonRobotCallDetail struct {
	// 客户请求时的透传字段
	ExtInfo *string `json:"ext_info,omitempty" xml:"ext_info,omitempty" require:"true"`
	// 成功触达：OK；未触达：AI_ROBOT_CALL_REQUEST_NOT_EXIST
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty" require:"true"`
	// 外呼号码
	CustomerKey *string `json:"customer_key,omitempty" xml:"customer_key,omitempty" require:"true"`
	// 呼叫次数
	CurrentCallTimes *int64 `json:"current_call_times,omitempty" xml:"current_call_times,omitempty" require:"true"`
	// 号码模版
	KeyTemplate *string `json:"key_template,omitempty" xml:"key_template,omitempty" require:"true"`
	// 导入号码时返回的批次号
	BatchId *string `json:"batch_id,omitempty" xml:"batch_id,omitempty" require:"true"`
	// 2001:批量-预测外呼，2002:批量-AI外呼-不转人工，2003:批量-AI外呼-接通转人工，2004: 批量-AI外呼-智能转人工,2005:批量-语音通知
	CallType *int64 `json:"call_type,omitempty" xml:"call_type,omitempty" require:"true"`
	// 用户自定义标签
	Tag *string `json:"tag,omitempty" xml:"tag,omitempty"`
	// 外呼id
	CallId *string `json:"call_id,omitempty" xml:"call_id,omitempty" require:"true"`
	// 外呼任务编号
	TaskId *int64 `json:"task_id,omitempty" xml:"task_id,omitempty" require:"true"`
	// AI话术ID
	TemplateId *int64 `json:"template_id,omitempty" xml:"template_id,omitempty"`
	// 外呼状态编码
	StatusCode *int64 `json:"status_code,omitempty" xml:"status_code,omitempty" require:"true"`
	// 外呼状态描述
	StatusDescription *string `json:"status_description,omitempty" xml:"status_description,omitempty" require:"true"`
	// 转人工状态编码
	TransferStatusCode *int64 `json:"transfer_status_code,omitempty" xml:"transfer_status_code,omitempty" require:"true"`
	// 转人工状态
	TransferStatus *string `json:"transfer_status,omitempty" xml:"transfer_status,omitempty" require:"true"`
	// 分配坐席ID
	AgentId *int64 `json:"agent_id,omitempty" xml:"agent_id,omitempty"`
	// 坐席在贵司业务系统唯一标识，用于查询对应agentId；可以为空。
	AgentTag *string `json:"agent_tag,omitempty" xml:"agent_tag,omitempty"`
	// 坐席分机号
	AgentExtension *string `json:"agent_extension,omitempty" xml:"agent_extension,omitempty"`
	// 导入时间
	ImportTime *string `json:"import_time,omitempty" xml:"import_time,omitempty" require:"true"`
	// 开始通话时间
	CallBeginTime *string `json:"call_begin_time,omitempty" xml:"call_begin_time,omitempty" require:"true"`
	// 振铃时长，单位ms
	RingTime *int64 `json:"ring_time,omitempty" xml:"ring_time,omitempty" require:"true"`
	// 接通时间
	AnswerTime *string `json:"answer_time,omitempty" xml:"answer_time,omitempty"`
	// 通话时长，单位：大于1分钟，显示分钟秒，小于1分钟，显示秒
	SpeakingTime *string `json:"speaking_time,omitempty" xml:"speaking_time,omitempty" require:"true"`
	// 通话时长，单位：秒
	SpeakingDuration *int64 `json:"speaking_duration,omitempty" xml:"speaking_duration,omitempty" require:"true"`
	// 挂断时间
	HangupTime *string `json:"hangup_time,omitempty" xml:"hangup_time,omitempty" require:"true"`
	// 对话轮次
	SpeakingTurns *int64 `json:"speaking_turns,omitempty" xml:"speaking_turns,omitempty" require:"true"`
	// 人工通话时长，单位：大于1分钟，显示分钟秒，小于1分钟，显示秒
	AgentSpeakingTime *string `json:"agent_speaking_time,omitempty" xml:"agent_speaking_time,omitempty" require:"true"`
	// 人工通话时长，单位：秒
	AgentSpeakingDuration *int64 `json:"agent_speaking_duration,omitempty" xml:"agent_speaking_duration,omitempty" require:"true"`
	// 意向标签
	IntentTag *string `json:"intent_tag,omitempty" xml:"intent_tag,omitempty" require:"true"`
	// 意向说明
	IntentDescription *string `json:"intent_description,omitempty" xml:"intent_description,omitempty" require:"true"`
	// 个性标签
	IndividualTag *string `json:"individual_tag,omitempty" xml:"individual_tag,omitempty"`
	// 回复关键词
	Keywords *string `json:"keywords,omitempty" xml:"keywords,omitempty"`
	// 挂机方式，AI挂机1，坐席挂机2，客户挂机3
	HungupType *int64 `json:"hungup_type,omitempty" xml:"hungup_type,omitempty" require:"true"`
	// 挂机短信，可选值：1、2
	// 1:发送，2:不发送
	Sms *string `json:"sms,omitempty" xml:"sms,omitempty" require:"true"`
	// 对话录音，URL，可以为空
	ChatRecord *string `json:"chat_record,omitempty" xml:"chat_record,omitempty"`
	// 聊天记录，可以为空
	Chats *string `json:"chats,omitempty" xml:"chats,omitempty"`
	// 可选值：0、1
	// 0:不添加，1:添加
	AddWx *int64 `json:"add_wx,omitempty" xml:"add_wx,omitempty"`
	// 加微进度，可选值：已申请、加微成功
	AddWxStatus *string `json:"add_wx_status,omitempty" xml:"add_wx_status,omitempty"`
	// 是否接通重呼，可选值：0、1
	// 0正常外呼，1接通重呼
	AnswerRecall *int64 `json:"answer_recall,omitempty" xml:"answer_recall,omitempty" require:"true"`
	// 导入号码时的参数值
	Properties *string `json:"properties,omitempty" xml:"properties,omitempty"`
	// 导入号码时的业务参数值，原样返回
	BizProperties *string `json:"biz_properties,omitempty" xml:"biz_properties,omitempty"`
	// 拦截原因：当状态为已拦截时，可选值：黑名单拦截，灰名单拦截，异常号码拦截
	InterceptReason *string `json:"intercept_reason,omitempty" xml:"intercept_reason,omitempty"`
}

func (s CommonRobotCallDetail) String() string {
	return tea.Prettify(s)
}

func (s CommonRobotCallDetail) GoString() string {
	return s.String()
}

func (s *CommonRobotCallDetail) SetExtInfo(v string) *CommonRobotCallDetail {
	s.ExtInfo = &v
	return s
}

func (s *CommonRobotCallDetail) SetResultCode(v string) *CommonRobotCallDetail {
	s.ResultCode = &v
	return s
}

func (s *CommonRobotCallDetail) SetCustomerKey(v string) *CommonRobotCallDetail {
	s.CustomerKey = &v
	return s
}

func (s *CommonRobotCallDetail) SetCurrentCallTimes(v int64) *CommonRobotCallDetail {
	s.CurrentCallTimes = &v
	return s
}

func (s *CommonRobotCallDetail) SetKeyTemplate(v string) *CommonRobotCallDetail {
	s.KeyTemplate = &v
	return s
}

func (s *CommonRobotCallDetail) SetBatchId(v string) *CommonRobotCallDetail {
	s.BatchId = &v
	return s
}

func (s *CommonRobotCallDetail) SetCallType(v int64) *CommonRobotCallDetail {
	s.CallType = &v
	return s
}

func (s *CommonRobotCallDetail) SetTag(v string) *CommonRobotCallDetail {
	s.Tag = &v
	return s
}

func (s *CommonRobotCallDetail) SetCallId(v string) *CommonRobotCallDetail {
	s.CallId = &v
	return s
}

func (s *CommonRobotCallDetail) SetTaskId(v int64) *CommonRobotCallDetail {
	s.TaskId = &v
	return s
}

func (s *CommonRobotCallDetail) SetTemplateId(v int64) *CommonRobotCallDetail {
	s.TemplateId = &v
	return s
}

func (s *CommonRobotCallDetail) SetStatusCode(v int64) *CommonRobotCallDetail {
	s.StatusCode = &v
	return s
}

func (s *CommonRobotCallDetail) SetStatusDescription(v string) *CommonRobotCallDetail {
	s.StatusDescription = &v
	return s
}

func (s *CommonRobotCallDetail) SetTransferStatusCode(v int64) *CommonRobotCallDetail {
	s.TransferStatusCode = &v
	return s
}

func (s *CommonRobotCallDetail) SetTransferStatus(v string) *CommonRobotCallDetail {
	s.TransferStatus = &v
	return s
}

func (s *CommonRobotCallDetail) SetAgentId(v int64) *CommonRobotCallDetail {
	s.AgentId = &v
	return s
}

func (s *CommonRobotCallDetail) SetAgentTag(v string) *CommonRobotCallDetail {
	s.AgentTag = &v
	return s
}

func (s *CommonRobotCallDetail) SetAgentExtension(v string) *CommonRobotCallDetail {
	s.AgentExtension = &v
	return s
}

func (s *CommonRobotCallDetail) SetImportTime(v string) *CommonRobotCallDetail {
	s.ImportTime = &v
	return s
}

func (s *CommonRobotCallDetail) SetCallBeginTime(v string) *CommonRobotCallDetail {
	s.CallBeginTime = &v
	return s
}

func (s *CommonRobotCallDetail) SetRingTime(v int64) *CommonRobotCallDetail {
	s.RingTime = &v
	return s
}

func (s *CommonRobotCallDetail) SetAnswerTime(v string) *CommonRobotCallDetail {
	s.AnswerTime = &v
	return s
}

func (s *CommonRobotCallDetail) SetSpeakingTime(v string) *CommonRobotCallDetail {
	s.SpeakingTime = &v
	return s
}

func (s *CommonRobotCallDetail) SetSpeakingDuration(v int64) *CommonRobotCallDetail {
	s.SpeakingDuration = &v
	return s
}

func (s *CommonRobotCallDetail) SetHangupTime(v string) *CommonRobotCallDetail {
	s.HangupTime = &v
	return s
}

func (s *CommonRobotCallDetail) SetSpeakingTurns(v int64) *CommonRobotCallDetail {
	s.SpeakingTurns = &v
	return s
}

func (s *CommonRobotCallDetail) SetAgentSpeakingTime(v string) *CommonRobotCallDetail {
	s.AgentSpeakingTime = &v
	return s
}

func (s *CommonRobotCallDetail) SetAgentSpeakingDuration(v int64) *CommonRobotCallDetail {
	s.AgentSpeakingDuration = &v
	return s
}

func (s *CommonRobotCallDetail) SetIntentTag(v string) *CommonRobotCallDetail {
	s.IntentTag = &v
	return s
}

func (s *CommonRobotCallDetail) SetIntentDescription(v string) *CommonRobotCallDetail {
	s.IntentDescription = &v
	return s
}

func (s *CommonRobotCallDetail) SetIndividualTag(v string) *CommonRobotCallDetail {
	s.IndividualTag = &v
	return s
}

func (s *CommonRobotCallDetail) SetKeywords(v string) *CommonRobotCallDetail {
	s.Keywords = &v
	return s
}

func (s *CommonRobotCallDetail) SetHungupType(v int64) *CommonRobotCallDetail {
	s.HungupType = &v
	return s
}

func (s *CommonRobotCallDetail) SetSms(v string) *CommonRobotCallDetail {
	s.Sms = &v
	return s
}

func (s *CommonRobotCallDetail) SetChatRecord(v string) *CommonRobotCallDetail {
	s.ChatRecord = &v
	return s
}

func (s *CommonRobotCallDetail) SetChats(v string) *CommonRobotCallDetail {
	s.Chats = &v
	return s
}

func (s *CommonRobotCallDetail) SetAddWx(v int64) *CommonRobotCallDetail {
	s.AddWx = &v
	return s
}

func (s *CommonRobotCallDetail) SetAddWxStatus(v string) *CommonRobotCallDetail {
	s.AddWxStatus = &v
	return s
}

func (s *CommonRobotCallDetail) SetAnswerRecall(v int64) *CommonRobotCallDetail {
	s.AnswerRecall = &v
	return s
}

func (s *CommonRobotCallDetail) SetProperties(v string) *CommonRobotCallDetail {
	s.Properties = &v
	return s
}

func (s *CommonRobotCallDetail) SetBizProperties(v string) *CommonRobotCallDetail {
	s.BizProperties = &v
	return s
}

func (s *CommonRobotCallDetail) SetInterceptReason(v string) *CommonRobotCallDetail {
	s.InterceptReason = &v
	return s
}

// 支付方式锁定结果
type PayMethodLockResult struct {
	// 签约结果
	SignStatus *string `json:"sign_status,omitempty" xml:"sign_status,omitempty" require:"true"`
	// 账号
	AccountId *string `json:"account_id,omitempty" xml:"account_id,omitempty" require:"true"`
	// 登录号
	LoginId *string `json:"login_id,omitempty" xml:"login_id,omitempty" require:"true"`
	// 支付公司
	PayChannel *string `json:"pay_channel,omitempty" xml:"pay_channel,omitempty" require:"true"`
	// 绑定账号名称
	AccountName *string `json:"account_name,omitempty" xml:"account_name,omitempty" require:"true"`
}

func (s PayMethodLockResult) String() string {
	return tea.Prettify(s)
}

func (s PayMethodLockResult) GoString() string {
	return s.String()
}

func (s *PayMethodLockResult) SetSignStatus(v string) *PayMethodLockResult {
	s.SignStatus = &v
	return s
}

func (s *PayMethodLockResult) SetAccountId(v string) *PayMethodLockResult {
	s.AccountId = &v
	return s
}

func (s *PayMethodLockResult) SetLoginId(v string) *PayMethodLockResult {
	s.LoginId = &v
	return s
}

func (s *PayMethodLockResult) SetPayChannel(v string) *PayMethodLockResult {
	s.PayChannel = &v
	return s
}

func (s *PayMethodLockResult) SetAccountName(v string) *PayMethodLockResult {
	s.AccountName = &v
	return s
}

// 天枢合同
type Contract struct {
	// 关联编号
	RelationNo *string `json:"relation_no,omitempty" xml:"relation_no,omitempty" require:"true"`
	// 合同编号
	ContractNo *string `json:"contract_no,omitempty" xml:"contract_no,omitempty" require:"true"`
	// 合同名称
	ContractName *string `json:"contract_name,omitempty" xml:"contract_name,omitempty" require:"true"`
	// 合同类型
	ContractType *string `json:"contract_type,omitempty" xml:"contract_type,omitempty" require:"true"`
	// 客户编号
	CustomNo *string `json:"custom_no,omitempty" xml:"custom_no,omitempty" require:"true"`
	// 合同存放目录
	SavePath *string `json:"save_path,omitempty" xml:"save_path,omitempty" require:"true"`
	// 合同金额
	ContractAmount *int64 `json:"contract_amount,omitempty" xml:"contract_amount,omitempty" require:"true"`
	// 用信合同编号
	DisburseContractNo *string `json:"disburse_contract_no,omitempty" xml:"disburse_contract_no,omitempty" require:"true"`
	// 授信合同编号
	CreditContractNo *string `json:"credit_contract_no,omitempty" xml:"credit_contract_no,omitempty" require:"true"`
}

func (s Contract) String() string {
	return tea.Prettify(s)
}

func (s Contract) GoString() string {
	return s.String()
}

func (s *Contract) SetRelationNo(v string) *Contract {
	s.RelationNo = &v
	return s
}

func (s *Contract) SetContractNo(v string) *Contract {
	s.ContractNo = &v
	return s
}

func (s *Contract) SetContractName(v string) *Contract {
	s.ContractName = &v
	return s
}

func (s *Contract) SetContractType(v string) *Contract {
	s.ContractType = &v
	return s
}

func (s *Contract) SetCustomNo(v string) *Contract {
	s.CustomNo = &v
	return s
}

func (s *Contract) SetSavePath(v string) *Contract {
	s.SavePath = &v
	return s
}

func (s *Contract) SetContractAmount(v int64) *Contract {
	s.ContractAmount = &v
	return s
}

func (s *Contract) SetDisburseContractNo(v string) *Contract {
	s.DisburseContractNo = &v
	return s
}

func (s *Contract) SetCreditContractNo(v string) *Contract {
	s.CreditContractNo = &v
	return s
}

// ai外呼回调详情
type AICallbackMessage struct {
	// 批次号
	BatchId *string `json:"batch_id,omitempty" xml:"batch_id,omitempty"`
	// 用户标签
	Tag *string `json:"tag,omitempty" xml:"tag,omitempty" require:"true"`
	// 外呼id
	CallId *string `json:"call_id,omitempty" xml:"call_id,omitempty" require:"true"`
	// 外呼的话术模板Id
	TemplateId *int64 `json:"template_id,omitempty" xml:"template_id,omitempty"`
	// 外呼状态编码
	StatusCode *int64 `json:"status_code,omitempty" xml:"status_code,omitempty" require:"true"`
	// 外呼状态描述
	StatusDescription *string `json:"status_description,omitempty" xml:"status_description,omitempty" require:"true"`
	// 导入时间
	ImportTime *string `json:"import_time,omitempty" xml:"import_time,omitempty" require:"true"`
	// 开始通话时间
	CallBeginTime *string `json:"call_begin_time,omitempty" xml:"call_begin_time,omitempty" require:"true"`
	// 振铃时长, 单位毫秒
	RingTime *int64 `json:"ring_time,omitempty" xml:"ring_time,omitempty" require:"true"`
	// 接通时间
	AnswerTime *string `json:"answer_time,omitempty" xml:"answer_time,omitempty" require:"true"`
	// AI通话时长,单位s
	SpeakingDuration *int64 `json:"speaking_duration,omitempty" xml:"speaking_duration,omitempty" require:"true"`
	// 挂断时间
	HangupTime *string `json:"hangup_time,omitempty" xml:"hangup_time,omitempty" require:"true"`
	// 对话轮次
	SpeakingTurns *int64 `json:"speaking_turns,omitempty" xml:"speaking_turns,omitempty" require:"true"`
	// 意向标签
	IntentTag *string `json:"intent_tag,omitempty" xml:"intent_tag,omitempty" require:"true"`
	// 意向说明
	IntentDescription *string `json:"intent_description,omitempty" xml:"intent_description,omitempty" require:"true"`
	// 个性标签
	IndividualTag *string `json:"individual_tag,omitempty" xml:"individual_tag,omitempty" require:"true"`
	// 回复关键词
	Keywords *string `json:"keywords,omitempty" xml:"keywords,omitempty" require:"true"`
	// 对话录音
	ChatRecord *string `json:"chat_record,omitempty" xml:"chat_record,omitempty"`
	// 参数值
	Properties *string `json:"properties,omitempty" xml:"properties,omitempty" require:"true"`
}

func (s AICallbackMessage) String() string {
	return tea.Prettify(s)
}

func (s AICallbackMessage) GoString() string {
	return s.String()
}

func (s *AICallbackMessage) SetBatchId(v string) *AICallbackMessage {
	s.BatchId = &v
	return s
}

func (s *AICallbackMessage) SetTag(v string) *AICallbackMessage {
	s.Tag = &v
	return s
}

func (s *AICallbackMessage) SetCallId(v string) *AICallbackMessage {
	s.CallId = &v
	return s
}

func (s *AICallbackMessage) SetTemplateId(v int64) *AICallbackMessage {
	s.TemplateId = &v
	return s
}

func (s *AICallbackMessage) SetStatusCode(v int64) *AICallbackMessage {
	s.StatusCode = &v
	return s
}

func (s *AICallbackMessage) SetStatusDescription(v string) *AICallbackMessage {
	s.StatusDescription = &v
	return s
}

func (s *AICallbackMessage) SetImportTime(v string) *AICallbackMessage {
	s.ImportTime = &v
	return s
}

func (s *AICallbackMessage) SetCallBeginTime(v string) *AICallbackMessage {
	s.CallBeginTime = &v
	return s
}

func (s *AICallbackMessage) SetRingTime(v int64) *AICallbackMessage {
	s.RingTime = &v
	return s
}

func (s *AICallbackMessage) SetAnswerTime(v string) *AICallbackMessage {
	s.AnswerTime = &v
	return s
}

func (s *AICallbackMessage) SetSpeakingDuration(v int64) *AICallbackMessage {
	s.SpeakingDuration = &v
	return s
}

func (s *AICallbackMessage) SetHangupTime(v string) *AICallbackMessage {
	s.HangupTime = &v
	return s
}

func (s *AICallbackMessage) SetSpeakingTurns(v int64) *AICallbackMessage {
	s.SpeakingTurns = &v
	return s
}

func (s *AICallbackMessage) SetIntentTag(v string) *AICallbackMessage {
	s.IntentTag = &v
	return s
}

func (s *AICallbackMessage) SetIntentDescription(v string) *AICallbackMessage {
	s.IntentDescription = &v
	return s
}

func (s *AICallbackMessage) SetIndividualTag(v string) *AICallbackMessage {
	s.IndividualTag = &v
	return s
}

func (s *AICallbackMessage) SetKeywords(v string) *AICallbackMessage {
	s.Keywords = &v
	return s
}

func (s *AICallbackMessage) SetChatRecord(v string) *AICallbackMessage {
	s.ChatRecord = &v
	return s
}

func (s *AICallbackMessage) SetProperties(v string) *AICallbackMessage {
	s.Properties = &v
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

// 卡短解析服务返回参数
type ShortUrlInfo struct {
	// 支持卡片短信的手机号
	Mobile *string `json:"mobile,omitempty" xml:"mobile,omitempty" require:"true"`
	// 解析生成的短链
	ShortUrl *string `json:"short_url,omitempty" xml:"short_url,omitempty" require:"true"`
}

func (s ShortUrlInfo) String() string {
	return tea.Prettify(s)
}

func (s ShortUrlInfo) GoString() string {
	return s.String()
}

func (s *ShortUrlInfo) SetMobile(v string) *ShortUrlInfo {
	s.Mobile = &v
	return s
}

func (s *ShortUrlInfo) SetShortUrl(v string) *ShortUrlInfo {
	s.ShortUrl = &v
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

// 企管盾票税决策服务
type RdaasTaxDecsionService struct {
	// 决策服务id
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 产品编码
	ServiceName *string `json:"service_name,omitempty" xml:"service_name,omitempty" require:"true"`
	// 区域编码
	ServiceZone *string `json:"service_zone,omitempty" xml:"service_zone,omitempty"`
	// 渠道
	Channel *string `json:"channel,omitempty" xml:"channel,omitempty"`
	// 决策租户
	DecisionTenant *string `json:"decision_tenant,omitempty" xml:"decision_tenant,omitempty"`
	// 是否启用
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 创建时间，格式:yyyy-MM-dd HH:mm:ss
	CreateTime *string `json:"create_time,omitempty" xml:"create_time,omitempty"`
}

func (s RdaasTaxDecsionService) String() string {
	return tea.Prettify(s)
}

func (s RdaasTaxDecsionService) GoString() string {
	return s.String()
}

func (s *RdaasTaxDecsionService) SetId(v string) *RdaasTaxDecsionService {
	s.Id = &v
	return s
}

func (s *RdaasTaxDecsionService) SetServiceName(v string) *RdaasTaxDecsionService {
	s.ServiceName = &v
	return s
}

func (s *RdaasTaxDecsionService) SetServiceZone(v string) *RdaasTaxDecsionService {
	s.ServiceZone = &v
	return s
}

func (s *RdaasTaxDecsionService) SetChannel(v string) *RdaasTaxDecsionService {
	s.Channel = &v
	return s
}

func (s *RdaasTaxDecsionService) SetDecisionTenant(v string) *RdaasTaxDecsionService {
	s.DecisionTenant = &v
	return s
}

func (s *RdaasTaxDecsionService) SetStatus(v string) *RdaasTaxDecsionService {
	s.Status = &v
	return s
}

func (s *RdaasTaxDecsionService) SetCreateTime(v string) *RdaasTaxDecsionService {
	s.CreateTime = &v
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

// 商户资金链锁定结果
type FundChainLockResult struct {
	// 店铺名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 店铺id
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 0:成功
	// 1:失败
	// 2:处理中
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
}

func (s FundChainLockResult) String() string {
	return tea.Prettify(s)
}

func (s FundChainLockResult) GoString() string {
	return s.String()
}

func (s *FundChainLockResult) SetName(v string) *FundChainLockResult {
	s.Name = &v
	return s
}

func (s *FundChainLockResult) SetId(v string) *FundChainLockResult {
	s.Id = &v
	return s
}

func (s *FundChainLockResult) SetStatus(v string) *FundChainLockResult {
	s.Status = &v
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

// 结清证明响应实体
type CertificateInfo struct {
	// 结清证明开具结果，0：有结清证明、1：无结清证明、2：开具中、3：暂不支持开具
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 用信申请订单号
	RelationNo *string `json:"relation_no,omitempty" xml:"relation_no,omitempty"`
	// 结清证明url
	CertificateUrl *string `json:"certificate_url,omitempty" xml:"certificate_url,omitempty"`
	// 结清证明文件Base64
	CertificateBase64 *string `json:"certificate_base64,omitempty" xml:"certificate_base64,omitempty"`
	// 说明
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
}

func (s CertificateInfo) String() string {
	return tea.Prettify(s)
}

func (s CertificateInfo) GoString() string {
	return s.String()
}

func (s *CertificateInfo) SetStatus(v string) *CertificateInfo {
	s.Status = &v
	return s
}

func (s *CertificateInfo) SetRelationNo(v string) *CertificateInfo {
	s.RelationNo = &v
	return s
}

func (s *CertificateInfo) SetCertificateUrl(v string) *CertificateInfo {
	s.CertificateUrl = &v
	return s
}

func (s *CertificateInfo) SetCertificateBase64(v string) *CertificateInfo {
	s.CertificateBase64 = &v
	return s
}

func (s *CertificateInfo) SetMessage(v string) *CertificateInfo {
	s.Message = &v
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

// 离线圈客计划详细
type OfflineDecisionPlanDetail struct {
	// 圈客计划ID
	DecisionPlanId *string `json:"decision_plan_id,omitempty" xml:"decision_plan_id,omitempty" require:"true"`
	// 离线圈客执行任务状态
	DecisionResultStatus *string `json:"decision_result_status,omitempty" xml:"decision_result_status,omitempty" require:"true"`
}

func (s OfflineDecisionPlanDetail) String() string {
	return tea.Prettify(s)
}

func (s OfflineDecisionPlanDetail) GoString() string {
	return s.String()
}

func (s *OfflineDecisionPlanDetail) SetDecisionPlanId(v string) *OfflineDecisionPlanDetail {
	s.DecisionPlanId = &v
	return s
}

func (s *OfflineDecisionPlanDetail) SetDecisionResultStatus(v string) *OfflineDecisionPlanDetail {
	s.DecisionResultStatus = &v
	return s
}

// 用户分层信息
type UserClassifyInfo struct {
	// 版本号
	Version *string `json:"version,omitempty" xml:"version,omitempty" require:"true"`
	// 流量分层
	RateClassify *string `json:"rate_classify,omitempty" xml:"rate_classify,omitempty" require:"true"`
	// 流量扩展分层1
	ClassifyExt1 *string `json:"classify_ext1,omitempty" xml:"classify_ext1,omitempty"`
	// 流量扩展分层2
	ClassifyExt2 *string `json:"classify_ext2,omitempty" xml:"classify_ext2,omitempty"`
}

func (s UserClassifyInfo) String() string {
	return tea.Prettify(s)
}

func (s UserClassifyInfo) GoString() string {
	return s.String()
}

func (s *UserClassifyInfo) SetVersion(v string) *UserClassifyInfo {
	s.Version = &v
	return s
}

func (s *UserClassifyInfo) SetRateClassify(v string) *UserClassifyInfo {
	s.RateClassify = &v
	return s
}

func (s *UserClassifyInfo) SetClassifyExt1(v string) *UserClassifyInfo {
	s.ClassifyExt1 = &v
	return s
}

func (s *UserClassifyInfo) SetClassifyExt2(v string) *UserClassifyInfo {
	s.ClassifyExt2 = &v
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
	// 发放日期（兼容字段）
	PayDateSup *string `json:"pay_date_sup,omitempty" xml:"pay_date_sup,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 到期日期（兼容字段）
	ExpireDateSup *string `json:"expire_date_sup,omitempty" xml:"expire_date_sup,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
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

func (s *CreditAmount) SetPayDateSup(v string) *CreditAmount {
	s.PayDateSup = &v
	return s
}

func (s *CreditAmount) SetExpireDateSup(v string) *CreditAmount {
	s.ExpireDateSup = &v
	return s
}

// 风控事件咨询查询入参
type EventInfo struct {
	// 事件编码
	EventCode *string `json:"event_code,omitempty" xml:"event_code,omitempty" require:"true"`
	// 事件产生时间
	GmtOccur *string `json:"gmt_occur,omitempty" xml:"gmt_occur,omitempty" require:"true"`
}

func (s EventInfo) String() string {
	return tea.Prettify(s)
}

func (s EventInfo) GoString() string {
	return s.String()
}

func (s *EventInfo) SetEventCode(v string) *EventInfo {
	s.EventCode = &v
	return s
}

func (s *EventInfo) SetGmtOccur(v string) *EventInfo {
	s.GmtOccur = &v
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
	// 优惠后应还金额
	DiscountAfterNeedAmt *int64 `json:"discount_after_need_amt,omitempty" xml:"discount_after_need_amt,omitempty"`
	// 优惠后应还利息
	DiscountAfterInterest *int64 `json:"discount_after_interest,omitempty" xml:"discount_after_interest,omitempty"`
	// 优惠利息
	DiscountInterest *int64 `json:"discount_interest,omitempty" xml:"discount_interest,omitempty"`
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

func (s *RepayTrail) SetDiscountAfterNeedAmt(v int64) *RepayTrail {
	s.DiscountAfterNeedAmt = &v
	return s
}

func (s *RepayTrail) SetDiscountAfterInterest(v int64) *RepayTrail {
	s.DiscountAfterInterest = &v
	return s
}

func (s *RepayTrail) SetDiscountInterest(v int64) *RepayTrail {
	s.DiscountInterest = &v
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

// 营销盾租户触达策略计划信息
type TenantActionPlanInfo struct {
	// 场景策略id
	SceneStrategyId *int64 `json:"scene_strategy_id,omitempty" xml:"scene_strategy_id,omitempty" require:"true"`
	// 营销名称
	SceneStrategyName *string `json:"scene_strategy_name,omitempty" xml:"scene_strategy_name,omitempty" require:"true"`
	// 营销状态
	SceneStrategyStatus *string `json:"scene_strategy_status,omitempty" xml:"scene_strategy_status,omitempty" require:"true"`
	// 渠道id
	ActionDriverCode *int64 `json:"action_driver_code,omitempty" xml:"action_driver_code,omitempty" require:"true"`
	// 渠道类型
	ChannelCode *string `json:"channel_code,omitempty" xml:"channel_code,omitempty" require:"true"`
	// 创建时间
	GmtCreate *string `json:"gmt_create,omitempty" xml:"gmt_create,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 修改时间
	GmtModified *string `json:"gmt_modified,omitempty" xml:"gmt_modified,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 场景策略入参名
	ActionParamInfo []*string `json:"action_param_info,omitempty" xml:"action_param_info,omitempty" type:"Repeated"`
	// 参数查询是否完成
	IsParamQueryDone *bool `json:"is_param_query_done,omitempty" xml:"is_param_query_done,omitempty"`
}

func (s TenantActionPlanInfo) String() string {
	return tea.Prettify(s)
}

func (s TenantActionPlanInfo) GoString() string {
	return s.String()
}

func (s *TenantActionPlanInfo) SetSceneStrategyId(v int64) *TenantActionPlanInfo {
	s.SceneStrategyId = &v
	return s
}

func (s *TenantActionPlanInfo) SetSceneStrategyName(v string) *TenantActionPlanInfo {
	s.SceneStrategyName = &v
	return s
}

func (s *TenantActionPlanInfo) SetSceneStrategyStatus(v string) *TenantActionPlanInfo {
	s.SceneStrategyStatus = &v
	return s
}

func (s *TenantActionPlanInfo) SetActionDriverCode(v int64) *TenantActionPlanInfo {
	s.ActionDriverCode = &v
	return s
}

func (s *TenantActionPlanInfo) SetChannelCode(v string) *TenantActionPlanInfo {
	s.ChannelCode = &v
	return s
}

func (s *TenantActionPlanInfo) SetGmtCreate(v string) *TenantActionPlanInfo {
	s.GmtCreate = &v
	return s
}

func (s *TenantActionPlanInfo) SetGmtModified(v string) *TenantActionPlanInfo {
	s.GmtModified = &v
	return s
}

func (s *TenantActionPlanInfo) SetActionParamInfo(v []*string) *TenantActionPlanInfo {
	s.ActionParamInfo = v
	return s
}

func (s *TenantActionPlanInfo) SetIsParamQueryDone(v bool) *TenantActionPlanInfo {
	s.IsParamQueryDone = &v
	return s
}

type PushQmpBackflowEventRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 回流事件id，对应租户回流事件id
	EventId *int64 `json:"event_id,omitempty" xml:"event_id,omitempty" require:"true"`
	// 回流事件记录列表
	EventRecords []*BackflowEventRecord `json:"event_records,omitempty" xml:"event_records,omitempty" require:"true" type:"Repeated"`
}

func (s PushQmpBackflowEventRequest) String() string {
	return tea.Prettify(s)
}

func (s PushQmpBackflowEventRequest) GoString() string {
	return s.String()
}

func (s *PushQmpBackflowEventRequest) SetAuthToken(v string) *PushQmpBackflowEventRequest {
	s.AuthToken = &v
	return s
}

func (s *PushQmpBackflowEventRequest) SetProductInstanceId(v string) *PushQmpBackflowEventRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PushQmpBackflowEventRequest) SetEventId(v int64) *PushQmpBackflowEventRequest {
	s.EventId = &v
	return s
}

func (s *PushQmpBackflowEventRequest) SetEventRecords(v []*BackflowEventRecord) *PushQmpBackflowEventRequest {
	s.EventRecords = v
	return s
}

type PushQmpBackflowEventResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s PushQmpBackflowEventResponse) String() string {
	return tea.Prettify(s)
}

func (s PushQmpBackflowEventResponse) GoString() string {
	return s.String()
}

func (s *PushQmpBackflowEventResponse) SetReqMsgId(v string) *PushQmpBackflowEventResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PushQmpBackflowEventResponse) SetResultCode(v string) *PushQmpBackflowEventResponse {
	s.ResultCode = &v
	return s
}

func (s *PushQmpBackflowEventResponse) SetResultMsg(v string) *PushQmpBackflowEventResponse {
	s.ResultMsg = &v
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
				"sdk_version":      tea.String("1.0.1"),
				"_prod_code":       tea.String("RISKPLUS"),
				"_prod_channel":    tea.String("undefined"),
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
 * Description: 蚁盾业务回流事件推送
 * Summary: 蚁盾业务回流事件推送
 */
func (client *Client) PushQmpBackflowEvent(request *PushQmpBackflowEventRequest) (_result *PushQmpBackflowEventResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PushQmpBackflowEventResponse{}
	_body, _err := client.PushQmpBackflowEventEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 蚁盾业务回流事件推送
 * Summary: 蚁盾业务回流事件推送
 */
func (client *Client) PushQmpBackflowEventEx(request *PushQmpBackflowEventRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PushQmpBackflowEventResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PushQmpBackflowEventResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.qmp.backflow.event.push"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
