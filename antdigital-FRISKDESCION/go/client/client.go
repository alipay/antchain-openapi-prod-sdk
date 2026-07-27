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

// air引擎输出infoCode
type AirInfoCodes struct {
	// infoCode
	// example:
	//
	// name
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// infoCode描述
	// example:
	//
	// xxx
	Description *string `json:"description,omitempty" xml:"description,omitempty"`
}

func (s AirInfoCodes) String() string {
	return tea.Prettify(s)
}

func (s AirInfoCodes) GoString() string {
	return s.String()
}

func (s *AirInfoCodes) SetName(v string) *AirInfoCodes {
	s.Name = &v
	return s
}

func (s *AirInfoCodes) SetDescription(v string) *AirInfoCodes {
	s.Description = &v
	return s
}

// 企业风险等级分布统计
type RtopLevelDistribution struct {
	// 统计值
	// example:
	//
	// 10
	Count *int `json:"count,omitempty" xml:"count,omitempty" require:"true"`
	// 等级
	// example:
	//
	// EX_HIGH_RISK
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
	// example:
	//
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

// air引擎决策流输出信息
type AirDecisionFlows struct {
	// 决策结果
	// example:
	//
	// review
	Decision *string `json:"decision,omitempty" xml:"decision,omitempty"`
	// air引擎输出的infoCodes信息
	// example:
	//
	// info_codes
	InfoCodes []*AirInfoCodes `json:"info_codes,omitempty" xml:"info_codes,omitempty" type:"Repeated"`
	// 策略名称
	// example:
	//
	// name
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
}

func (s AirDecisionFlows) String() string {
	return tea.Prettify(s)
}

func (s AirDecisionFlows) GoString() string {
	return s.String()
}

func (s *AirDecisionFlows) SetDecision(v string) *AirDecisionFlows {
	s.Decision = &v
	return s
}

func (s *AirDecisionFlows) SetInfoCodes(v []*AirInfoCodes) *AirDecisionFlows {
	s.InfoCodes = v
	return s
}

func (s *AirDecisionFlows) SetName(v string) *AirDecisionFlows {
	s.Name = &v
	return s
}

// 营销盾半圈投返回节点关联任务信息
type UmktCampaignRelationTaskInfo struct {
	// 关联资源id
	// example:
	//
	// bizCode1
	ResourceId *string `json:"resource_id,omitempty" xml:"resource_id,omitempty" require:"true"`
	// 任务状态
	// WFE-待执行
	// D - 已完成
	// ECN - 执行中
	// C - 取消
	// F - 执行失败
	// example:
	//
	// D
	TaskStatus *string `json:"task_status,omitempty" xml:"task_status,omitempty" require:"true"`
	// 错误信息
	// example:
	//
	// odps2oss执行失败
	ErrMsg *string `json:"err_msg,omitempty" xml:"err_msg,omitempty" require:"true"`
}

func (s UmktCampaignRelationTaskInfo) String() string {
	return tea.Prettify(s)
}

func (s UmktCampaignRelationTaskInfo) GoString() string {
	return s.String()
}

func (s *UmktCampaignRelationTaskInfo) SetResourceId(v string) *UmktCampaignRelationTaskInfo {
	s.ResourceId = &v
	return s
}

func (s *UmktCampaignRelationTaskInfo) SetTaskStatus(v string) *UmktCampaignRelationTaskInfo {
	s.TaskStatus = &v
	return s
}

func (s *UmktCampaignRelationTaskInfo) SetErrMsg(v string) *UmktCampaignRelationTaskInfo {
	s.ErrMsg = &v
	return s
}

// 删除参数
type OutParams struct {
	// 输出参数
	// example:
	//
	// rate
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 参数描述
	// example:
	//
	// 率利
	Desc *string `json:"desc,omitempty" xml:"desc,omitempty" require:"true"`
	// 参数值
	// example:
	//
	// accept
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

// 安全场景参数
type SecurityScene struct {
	// 接入渠道
	// example:
	//
	// web
	AccessChannel *string `json:"access_channel,omitempty" xml:"access_channel,omitempty"`
	// 事件信息
	CtuParams *string `json:"ctu_params,omitempty" xml:"ctu_params,omitempty"`
	// 产品名称
	// example:
	//
	// mobile_cashier
	ProductName *string `json:"product_name,omitempty" xml:"product_name,omitempty"`
	// 产品节点
	// example:
	//
	// code
	ProductNode *string `json:"product_node,omitempty" xml:"product_node,omitempty"`
	// 扩展参数
	// example:
	//
	// 1234
	SecuritySceneParams *string `json:"security_scene_params,omitempty" xml:"security_scene_params,omitempty"`
	// 系统名称
	// example:
	//
	// mobilecashier
	SystemName *string `json:"system_name,omitempty" xml:"system_name,omitempty"`
	// 总金额
	// example:
	//
	// 10.0
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
	// example:
	//
	// 1
	Kind *string `json:"kind,omitempty" xml:"kind,omitempty" require:"true"`
	// 联系人姓名
	// example:
	//
	// 张三
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 联系人手机号
	// example:
	//
	// 12345
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
	// example:
	//
	// aft_v3
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 变量值
	// example:
	//
	// 4.0
	Value *string `json:"value,omitempty" xml:"value,omitempty" require:"true"`
	// 变量值类型
	// example:
	//
	// Double
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
	// example:
	//
	// 1
	RuleWeight *string `json:"rule_weight,omitempty" xml:"rule_weight,omitempty" require:"true"`
	// 反欺诈风险数据服务命中规则名称
	// example:
	//
	// 贷款车辆厂商指导价与实际不符
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

// 经营数据
type EcMonthData struct {
	// 月份格式为YYYYMM
	// example:
	//
	// 202210
	Month *string `json:"month,omitempty" xml:"month,omitempty" require:"true"`
	// 实际结算金额/销售收入 单位：元，格式：数字，小数点后两位
	// example:
	//
	// 22300000.00
	PurchaseAmount *int64 `json:"purchase_amount,omitempty" xml:"purchase_amount,omitempty" require:"true"`
	// GMV，单位：元，格式：数字，小数点后两位
	// example:
	//
	// 22300000.00
	Gmv *int64 `json:"gmv,omitempty" xml:"gmv,omitempty" require:"true"`
	// 退货率。单位：%，格式：数字，小数点后两位
	// example:
	//
	// 3.08
	RetRate *int64 `json:"ret_rate,omitempty" xml:"ret_rate,omitempty" require:"true"`
}

func (s EcMonthData) String() string {
	return tea.Prettify(s)
}

func (s EcMonthData) GoString() string {
	return s.String()
}

func (s *EcMonthData) SetMonth(v string) *EcMonthData {
	s.Month = &v
	return s
}

func (s *EcMonthData) SetPurchaseAmount(v int64) *EcMonthData {
	s.PurchaseAmount = &v
	return s
}

func (s *EcMonthData) SetGmv(v int64) *EcMonthData {
	s.Gmv = &v
	return s
}

func (s *EcMonthData) SetRetRate(v int64) *EcMonthData {
	s.RetRate = &v
	return s
}

// 回流事件记录属性项
type BackflowEventRecordProperty struct {
	// 属性code
	// example:
	//
	// mobile
	Key *string `json:"key,omitempty" xml:"key,omitempty" require:"true"`
	// 属性value，统一为字符串
	// example:
	//
	// 18941147005
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

// 月供
type TermDetail struct {
	// 期数
	// example:
	//
	// 1
	Term *string `json:"term,omitempty" xml:"term,omitempty" require:"true"`
	// 期供金额
	// example:
	//
	// 1999.98
	TermAmount *int64 `json:"term_amount,omitempty" xml:"term_amount,omitempty" require:"true"`
	// 当期本金
	// example:
	//
	// 1999.98
	TermPrincipal *int64 `json:"term_principal,omitempty" xml:"term_principal,omitempty" require:"true"`
	// 当期利息（分期产生的利息/手续费）
	// example:
	//
	// 1999.98
	TermFee *int64 `json:"term_fee,omitempty" xml:"term_fee,omitempty" require:"true"`
	// 应还款日期
	// example:
	//
	// yyyy-MM-dd
	SettleDate *string `json:"settle_date,omitempty" xml:"settle_date,omitempty" require:"true"`
	// 罚息
	// example:
	//
	// 1999.98
	Penalty *int64 `json:"penalty,omitempty" xml:"penalty,omitempty"`
	// 担保费
	// example:
	//
	// 1999.98
	GuaranteeFee *int64 `json:"guarantee_fee,omitempty" xml:"guarantee_fee,omitempty"`
	// 违约金
	// example:
	//
	// 1999.98
	LiquidatedDamages *int64 `json:"liquidated_damages,omitempty" xml:"liquidated_damages,omitempty"`
	// 服务费
	// example:
	//
	// 1999.98
	ServerFee *int64 `json:"server_fee,omitempty" xml:"server_fee,omitempty"`
	// 减免金额
	// example:
	//
	// 1999.98
	DeductAmount *int64 `json:"deduct_amount,omitempty" xml:"deduct_amount,omitempty"`
}

func (s TermDetail) String() string {
	return tea.Prettify(s)
}

func (s TermDetail) GoString() string {
	return s.String()
}

func (s *TermDetail) SetTerm(v string) *TermDetail {
	s.Term = &v
	return s
}

func (s *TermDetail) SetTermAmount(v int64) *TermDetail {
	s.TermAmount = &v
	return s
}

func (s *TermDetail) SetTermPrincipal(v int64) *TermDetail {
	s.TermPrincipal = &v
	return s
}

func (s *TermDetail) SetTermFee(v int64) *TermDetail {
	s.TermFee = &v
	return s
}

func (s *TermDetail) SetSettleDate(v string) *TermDetail {
	s.SettleDate = &v
	return s
}

func (s *TermDetail) SetPenalty(v int64) *TermDetail {
	s.Penalty = &v
	return s
}

func (s *TermDetail) SetGuaranteeFee(v int64) *TermDetail {
	s.GuaranteeFee = &v
	return s
}

func (s *TermDetail) SetLiquidatedDamages(v int64) *TermDetail {
	s.LiquidatedDamages = &v
	return s
}

func (s *TermDetail) SetServerFee(v int64) *TermDetail {
	s.ServerFee = &v
	return s
}

func (s *TermDetail) SetDeductAmount(v int64) *TermDetail {
	s.DeductAmount = &v
	return s
}

// 营销盾批量查询单条结果
type BaseCustomerUmktInfoModel struct {
	// 用户凭证
	// example:
	//
	// 15011111605
	CustomerKey *string `json:"customer_key,omitempty" xml:"customer_key,omitempty"`
	// 输入模板
	// example:
	//
	// MOBILE
	QueryTemplate *string `json:"query_template,omitempty" xml:"query_template,omitempty"`
	// 实时营销结果
	// example:
	//
	// 1
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

// 营销盾半圈投节点任务信息
type UmktCampaignNodeTaskInfo struct {
	// 节点id
	// example:
	//
	// xxxxx
	NodeId *string `json:"node_id,omitempty" xml:"node_id,omitempty" require:"true"`
	// 节点任务状态
	// example:
	//
	// D
	NodeTaskStatus *string `json:"node_task_status,omitempty" xml:"node_task_status,omitempty" require:"true"`
	// 节点任务执行日期 yyyy-MM-dd格式
	// example:
	//
	// 2025-12-25
	ExecDate *string `json:"exec_date,omitempty" xml:"exec_date,omitempty" require:"true"`
	// 节点任务关联资源任务列表
	// example:
	//
	// [{"resourceId":"bizCode","taskStatus":"D"}]
	RelTaskList []*UmktCampaignRelationTaskInfo `json:"rel_task_list,omitempty" xml:"rel_task_list,omitempty" require:"true" type:"Repeated"`
}

func (s UmktCampaignNodeTaskInfo) String() string {
	return tea.Prettify(s)
}

func (s UmktCampaignNodeTaskInfo) GoString() string {
	return s.String()
}

func (s *UmktCampaignNodeTaskInfo) SetNodeId(v string) *UmktCampaignNodeTaskInfo {
	s.NodeId = &v
	return s
}

func (s *UmktCampaignNodeTaskInfo) SetNodeTaskStatus(v string) *UmktCampaignNodeTaskInfo {
	s.NodeTaskStatus = &v
	return s
}

func (s *UmktCampaignNodeTaskInfo) SetExecDate(v string) *UmktCampaignNodeTaskInfo {
	s.ExecDate = &v
	return s
}

func (s *UmktCampaignNodeTaskInfo) SetRelTaskList(v []*UmktCampaignRelationTaskInfo) *UmktCampaignNodeTaskInfo {
	s.RelTaskList = v
	return s
}

// 企业类型分布统计
type RtopTypeDistribution struct {
	// 统计值
	// example:
	//
	// 10
	Count *int `json:"count,omitempty" xml:"count,omitempty" require:"true"`
	// 当前类型下的等级分布
	// example:
	//
	// undefined
	LevelDistribution []*RtopLevelDistribution `json:"levelDistribution,omitempty" xml:"levelDistribution,omitempty" require:"true" type:"Repeated"`
	// 类型
	// example:
	//
	// MLM
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

// 营销盾离线圈客任务详细信息
type UmktOfflineDecisionTaskDetailInfo struct {
	// 任务id
	// example:
	//
	// 1
	TaskId *int64 `json:"task_id,omitempty" xml:"task_id,omitempty" require:"true"`
	// 圈客计划id
	DecisionPlanId *int64 `json:"decision_plan_id,omitempty" xml:"decision_plan_id,omitempty" require:"true"`
	// 圈客结果状态
	// example:
	//
	// D
	DecisionResultStatus *string `json:"decision_result_status,omitempty" xml:"decision_result_status,omitempty" require:"true"`
	// 圈客结果状态描述
	// example:
	//
	// 已完成
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

// 还款账单明细Object
type BillDetail struct {
	// 对账流水号，在扣款回盘文件中返回，用于对账
	// example:
	//
	// xxxx
	SerialNumber *string `json:"serial_number,omitempty" xml:"serial_number,omitempty"`
	// 还款期数
	// example:
	//
	// 1
	RpyTerm *int64 `json:"rpy_term,omitempty" xml:"rpy_term,omitempty" require:"true"`
	// 账单维度的还款总额（单位：分），单笔账单本利罚之和
	// example:
	//
	// 1999.98
	RpyAmt *int64 `json:"rpy_amt,omitempty" xml:"rpy_amt,omitempty" require:"true"`
	// 实还本金（单位：分）
	// example:
	//
	// 1999.98
	RpyPrincipal *int64 `json:"rpy_principal,omitempty" xml:"rpy_principal,omitempty" require:"true"`
	// 实还利息（单位：分）
	// example:
	//
	// 1999.98
	RpyFeeAmt *int64 `json:"rpy_fee_amt,omitempty" xml:"rpy_fee_amt,omitempty" require:"true"`
	// 实还罚息（单位：分）
	// example:
	//
	// 1999.98
	RpyMuclt *int64 `json:"rpy_muclt,omitempty" xml:"rpy_muclt,omitempty" require:"true"`
	// 其他科目金额，可能会其他类型的金额,用json数组的格式提高扩展性，涉及到保费和咨询服务费的项目，需要提供此字段。
	//
	// example:
	//
	// [{"fee":"费用（单位：分）","type":"（费用大项）1:保费, 2:信用评估费类","subType":"费用子项） 57:担保咨询服务费（属于信用评估费类型）  50:信用评估费（属于信用评估费类型）  40保费","insureMode":"分期乐内部担保模式号"}]
	OtherInfo *string `json:"other_info,omitempty" xml:"other_info,omitempty"`
	// 用户实还日，用户主动发起是当前日；定时扣款是应还日，格式=yyyy-MM-dd
	// example:
	//
	// yyyy-MM-dd
	RpyDate *string `json:"rpy_date,omitempty" xml:"rpy_date,omitempty"`
}

func (s BillDetail) String() string {
	return tea.Prettify(s)
}

func (s BillDetail) GoString() string {
	return s.String()
}

func (s *BillDetail) SetSerialNumber(v string) *BillDetail {
	s.SerialNumber = &v
	return s
}

func (s *BillDetail) SetRpyTerm(v int64) *BillDetail {
	s.RpyTerm = &v
	return s
}

func (s *BillDetail) SetRpyAmt(v int64) *BillDetail {
	s.RpyAmt = &v
	return s
}

func (s *BillDetail) SetRpyPrincipal(v int64) *BillDetail {
	s.RpyPrincipal = &v
	return s
}

func (s *BillDetail) SetRpyFeeAmt(v int64) *BillDetail {
	s.RpyFeeAmt = &v
	return s
}

func (s *BillDetail) SetRpyMuclt(v int64) *BillDetail {
	s.RpyMuclt = &v
	return s
}

func (s *BillDetail) SetOtherInfo(v string) *BillDetail {
	s.OtherInfo = &v
	return s
}

func (s *BillDetail) SetRpyDate(v string) *BillDetail {
	s.RpyDate = &v
	return s
}

// 电商支用订单详情
type EcLoanAppls struct {
	// 客户ID
	// example:
	//
	// 232
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
	// 申请单号 系统的申请单号
	// example:
	//
	// 1232
	OrderNo *string `json:"order_no,omitempty" xml:"order_no,omitempty" require:"true"`
	// 提款单状态
	// example:
	//
	// 1
	OrderStatus *string `json:"order_status,omitempty" xml:"order_status,omitempty" require:"true"`
	// 借据号
	// example:
	//
	// 123
	LoanNo *string `json:"loan_no,omitempty" xml:"loan_no,omitempty" require:"true"`
}

func (s EcLoanAppls) String() string {
	return tea.Prettify(s)
}

func (s EcLoanAppls) GoString() string {
	return s.String()
}

func (s *EcLoanAppls) SetUserId(v string) *EcLoanAppls {
	s.UserId = &v
	return s
}

func (s *EcLoanAppls) SetOrderNo(v string) *EcLoanAppls {
	s.OrderNo = &v
	return s
}

func (s *EcLoanAppls) SetOrderStatus(v string) *EcLoanAppls {
	s.OrderStatus = &v
	return s
}

func (s *EcLoanAppls) SetLoanNo(v string) *EcLoanAppls {
	s.LoanNo = &v
	return s
}

// 营销盾触达媒介参数信息
type ActionParamInfo struct {
	// 触达媒介类型
	// example:
	//
	// ROBOT_CALL
	ContentType *string `json:"content_type,omitempty" xml:"content_type,omitempty" require:"true"`
	// 触达媒介参数列表
	// example:
	//
	// ["a","b"]
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
	// example:
	//
	// XXX公司法人发生变更
	TagExplanation *string `json:"tag_explanation,omitempty" xml:"tag_explanation,omitempty" require:"true"`
	// 标签名称
	// example:
	//
	// 法人变更
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
	// example:
	//
	// reject
	Decision *string `json:"decision,omitempty" xml:"decision,omitempty" require:"true"`
	// infocodes
	// example:
	//
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

// 用户混合营销决策结果
type RpspInfoModel struct {
	// 流量分层计划code
	// example:
	//
	// planCode1
	PlanCode *string `json:"plan_code,omitempty" xml:"plan_code,omitempty" require:"true"`
	// 场景策略Id
	// example:
	//
	// 15000
	SceneStrategyId *int64 `json:"scene_strategy_id,omitempty" xml:"scene_strategy_id,omitempty" require:"true"`
	// 客群分层结果
	// example:
	//
	// 1
	RpspResult *string `json:"rpsp_result,omitempty" xml:"rpsp_result,omitempty" require:"true"`
	//
	// json 结构的营销额外输出信息
	// example:
	//
	// {"f_01":"95.0"}
	RpspOutPutInfo *string `json:"rpsp_out_put_info,omitempty" xml:"rpsp_out_put_info,omitempty" require:"true"`
}

func (s RpspInfoModel) String() string {
	return tea.Prettify(s)
}

func (s RpspInfoModel) GoString() string {
	return s.String()
}

func (s *RpspInfoModel) SetPlanCode(v string) *RpspInfoModel {
	s.PlanCode = &v
	return s
}

func (s *RpspInfoModel) SetSceneStrategyId(v int64) *RpspInfoModel {
	s.SceneStrategyId = &v
	return s
}

func (s *RpspInfoModel) SetRpspResult(v string) *RpspInfoModel {
	s.RpspResult = &v
	return s
}

func (s *RpspInfoModel) SetRpspOutPutInfo(v string) *RpspInfoModel {
	s.RpspOutPutInfo = &v
	return s
}

// 客户历史交易信息
type HisTranInfo struct {
	// 维修单号
	RepairNo *string `json:"repair_no,omitempty" xml:"repair_no,omitempty"`
	// 购买日期
	BuyDate *string `json:"buy_date,omitempty" xml:"buy_date,omitempty"`
	// 商品型号
	CommType *string `json:"comm_type,omitempty" xml:"comm_type,omitempty"`
	// 商品金额
	CommAmount *string `json:"comm_amount,omitempty" xml:"comm_amount,omitempty"`
	// 维修时间
	RepairTime *string `json:"repair_time,omitempty" xml:"repair_time,omitempty"`
	// 是否联保
	IsJoint *string `json:"is_joint,omitempty" xml:"is_joint,omitempty"`
	// 合计费用(每笔历史交易的合计费用)
	TotalCost *string `json:"total_cost,omitempty" xml:"total_cost,omitempty"`
}

func (s HisTranInfo) String() string {
	return tea.Prettify(s)
}

func (s HisTranInfo) GoString() string {
	return s.String()
}

func (s *HisTranInfo) SetRepairNo(v string) *HisTranInfo {
	s.RepairNo = &v
	return s
}

func (s *HisTranInfo) SetBuyDate(v string) *HisTranInfo {
	s.BuyDate = &v
	return s
}

func (s *HisTranInfo) SetCommType(v string) *HisTranInfo {
	s.CommType = &v
	return s
}

func (s *HisTranInfo) SetCommAmount(v string) *HisTranInfo {
	s.CommAmount = &v
	return s
}

func (s *HisTranInfo) SetRepairTime(v string) *HisTranInfo {
	s.RepairTime = &v
	return s
}

func (s *HisTranInfo) SetIsJoint(v string) *HisTranInfo {
	s.IsJoint = &v
	return s
}

func (s *HisTranInfo) SetTotalCost(v string) *HisTranInfo {
	s.TotalCost = &v
	return s
}

// 优惠券信息
type CouponInfo struct {
	// 优惠券Id
	// example:
	//
	// 123
	CouponId *string `json:"coupon_id,omitempty" xml:"coupon_id,omitempty" require:"true"`
	// 优惠券名称
	// example:
	//
	// 折扣券
	CouponName *string `json:"coupon_name,omitempty" xml:"coupon_name,omitempty" require:"true"`
	// 优惠券状态
	// unUsed-未使用
	// Used-已使用
	// Expired-过期
	// example:
	//
	// 0
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 使用场景
	// 01-提款使用
	// 02-还款使用
	// example:
	//
	// 01
	UseCondition *string `json:"use_condition,omitempty" xml:"use_condition,omitempty" require:"true"`
	// 优惠码
	// example:
	//
	// 123
	CouponCode *string `json:"coupon_code,omitempty" xml:"coupon_code,omitempty"`
	// 优惠券类型
	// 01-金额优惠
	// 02-天数优惠
	// 03-折扣优惠
	// 04-期数优惠
	// 05-固定利率
	// example:
	//
	// 03
	CouponType *string `json:"coupon_type,omitempty" xml:"coupon_type,omitempty"`
	// 优惠券面额
	// coupon_type=01 时为优惠金额
	// coupon_type=02 时为减免天数
	// coupon_type=03 时为折扣值（如6 折）
	// coupon_type=04 时为减免期数
	// coupon_type=05 时为折扣值（如 8.88 为利率8.88%）
	// example:
	//
	// 01
	CouponValue *string `json:"coupon_value,omitempty" xml:"coupon_value,omitempty"`
	// 当 coupon_type=01 时，才会有优惠金额
	// example:
	//
	// 1
	CouponAmount *string `json:"coupon_amount,omitempty" xml:"coupon_amount,omitempty"`
	// 过期时间yyyy-MM-dd HH:mm:ss
	// example:
	//
	// yyyy-MM-dd HH:mm:ss
	ExpiredTime *string `json:"expired_time,omitempty" xml:"expired_time,omitempty"`
	// 生效时间yyyy-MM-dd HH:mm:ss
	// example:
	//
	// yyyy-MM-dd HH:mm:ss
	EffectiveTime *string `json:"effective_time,omitempty" xml:"effective_time,omitempty"`
	// 使用规则
	// example:
	//
	// 使用规则
	UseDetail *string `json:"use_detail,omitempty" xml:"use_detail,omitempty"`
	// 贷款最低金额
	// example:
	//
	// 10
	MinAmount *string `json:"min_amount,omitempty" xml:"min_amount,omitempty"`
	// 贷款最高金额
	// example:
	//
	// 100
	MaxAmount *string `json:"max_amount,omitempty" xml:"max_amount,omitempty"`
	// 最低贷款期数
	// example:
	//
	// 1
	MinPeriod *string `json:"min_period,omitempty" xml:"min_period,omitempty"`
	// 最高贷款期数
	// example:
	//
	// 12
	MaxPeriod *string `json:"max_period,omitempty" xml:"max_period,omitempty"`
	// 贷款最低期限天数
	// example:
	//
	// 30
	MinDay *string `json:"min_day,omitempty" xml:"min_day,omitempty"`
	// 还款方式
	// 1-等额本息
	// 2-等额本金
	// 3-等本等费
	// 4-按期付息到期还本
	// 5-到期一次性还本付息
	// 6-等本等费-总费率
	// 7-等额本息(长期)
	// example:
	//
	// 1
	RepaymentMethod *string `json:"repayment_method,omitempty" xml:"repayment_method,omitempty"`
	// 是否有贷款期数要求
	// 0：否
	// 1：是
	// example:
	//
	// 0
	IsPeriodLimit *string `json:"is_period_limit,omitempty" xml:"is_period_limit,omitempty"`
	// 贷款期限要求还款条件
	// 01：可提前还款
	// 02：不可提前还款
	// isPeriodLimit=1 && repayCondition=01 代表：有可提前还款锁期
	// isPeriodLimit=1 && repayCondition=02 代表：有不可提前还款锁期
	// example:
	//
	// 01
	RepayCondition *string `json:"repay_condition,omitempty" xml:"repay_condition,omitempty"`
	// 还款场景
	// 01-到期还款
	// 02-即期还款
	// example:
	//
	// 01
	RepayWays *string `json:"repay_ways,omitempty" xml:"repay_ways,omitempty"`
	// 优惠模板Id
	// example:
	//
	// 123
	CouponModelNo *string `json:"coupon_model_no,omitempty" xml:"coupon_model_no,omitempty"`
	// 至到期:X年X月X日
	// 0：不是至到期券
	// 1：是至到期券
	// example:
	//
	// X年X月X日
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
	// example:
	//
	// 1
	SceneStrategyId *int64 `json:"scene_strategy_id,omitempty" xml:"scene_strategy_id,omitempty" require:"true"`
	// 实时营销结果
	// example:
	//
	// 1
	UmktResult *int64 `json:"umkt_result,omitempty" xml:"umkt_result,omitempty" require:"true"`
	// json 结构的营销额外输出信息
	// example:
	//
	// {"f_01":"95.0"}
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
	// example:
	//
	// CMN00010
	TagId *string `json:"tag_id,omitempty" xml:"tag_id,omitempty" require:"true"`
	// 标签名称
	// example:
	//
	// 网站失联
	TagName *string `json:"tag_name,omitempty" xml:"tag_name,omitempty" require:"true"`
	// 标签类型
	// example:
	//
	// CMN
	TagType *string `json:"tag_type,omitempty" xml:"tag_type,omitempty"`
	// 标签文本
	// example:
	//
	// 网站失联
	TagText *string `json:"tag_text,omitempty" xml:"tag_text,omitempty"`
	// 线索概览
	// example:
	//
	// 企业已列入经营异常名录
	TagClue *string `json:"tag_clue,omitempty" xml:"tag_clue,omitempty"`
	// 线索明细类型
	// example:
	//
	// 01
	ClueDetailType *string `json:"clue_detail_type,omitempty" xml:"clue_detail_type,omitempty"`
	// 线索明细
	// example:
	//
	// 通过登记的住所或者经营场所无法联系
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
	// example:
	//
	// 1
	ActionDriverCode *int64 `json:"action_driver_code,omitempty" xml:"action_driver_code,omitempty"`
	// 成功数
	// example:
	//
	// 123
	SuccessCount *int64 `json:"success_count,omitempty" xml:"success_count,omitempty"`
	// 失败数
	// example:
	//
	// 123
	FailCount *int64 `json:"fail_count,omitempty" xml:"fail_count,omitempty"`
	// 待触达的手机号数
	// example:
	//
	// 0
	WaitingSubTaskCount *int64 `json:"waiting_sub_task_count,omitempty" xml:"waiting_sub_task_count,omitempty"`
	// 已收到的回执数
	// example:
	//
	// 10
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

// air引擎输出的决策域信息
type AirDomainInfos struct {
	// 决策域信息
	// example:
	//
	// air_domain
	DomainCode *string `json:"domain_code,omitempty" xml:"domain_code,omitempty"`
	// 决策域信息
	// example:
	//
	// review
	DomainDecision *string `json:"domain_decision,omitempty" xml:"domain_decision,omitempty"`
	// 决策流输出
	// example:
	//
	// [{"decision":"review","name":"租赁测试策略"}]
	DecisionFlows []*AirDecisionFlows `json:"decision_flows,omitempty" xml:"decision_flows,omitempty" type:"Repeated"`
}

func (s AirDomainInfos) String() string {
	return tea.Prettify(s)
}

func (s AirDomainInfos) GoString() string {
	return s.String()
}

func (s *AirDomainInfos) SetDomainCode(v string) *AirDomainInfos {
	s.DomainCode = &v
	return s
}

func (s *AirDomainInfos) SetDomainDecision(v string) *AirDomainInfos {
	s.DomainDecision = &v
	return s
}

func (s *AirDomainInfos) SetDecisionFlows(v []*AirDecisionFlows) *AirDomainInfos {
	s.DecisionFlows = v
	return s
}

// 反欺诈风险数据服务规则细节信息
type RuleDetail struct {
	// 规则细节名称
	// example:
	//
	// 出现次数
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 规则细节值
	// example:
	//
	// 19
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

// Flow 成功后的产出列表。运行中或失败时为空。
type FlowRunOutput struct {
	// Flow 输出定义中的稳定字段标识。
	// example:
	//
	// summary
	OutputKey *string `json:"output_key,omitempty" xml:"output_key,omitempty" require:"true"`
	// 输出类型，支持 STRING、NUMBER、BOOLEAN、JSON、FILE。
	// example:
	//
	// STRING
	OutputType *string `json:"output_type,omitempty" xml:"output_type,omitempty" require:"true"`
	// 输出值。FILE 类型直接返回短期下载地址；JSON 类型返回 JSON 字符串；其他类型返回对应值的字符串形式。
	// example:
	//
	// 风险较低
	Value *string `json:"value,omitempty" xml:"value,omitempty" require:"true"`
}

func (s FlowRunOutput) String() string {
	return tea.Prettify(s)
}

func (s FlowRunOutput) GoString() string {
	return s.String()
}

func (s *FlowRunOutput) SetOutputKey(v string) *FlowRunOutput {
	s.OutputKey = &v
	return s
}

func (s *FlowRunOutput) SetOutputType(v string) *FlowRunOutput {
	s.OutputType = &v
	return s
}

func (s *FlowRunOutput) SetValue(v string) *FlowRunOutput {
	s.Value = &v
	return s
}

// 补充信息
type Additional struct {
	// 骑手标识；1-骑手
	// example:
	//
	// 1
	Deliveryman *string `json:"deliveryman,omitempty" xml:"deliveryman,omitempty"`
}

func (s Additional) String() string {
	return tea.Prettify(s)
}

func (s Additional) GoString() string {
	return s.String()
}

func (s *Additional) SetDeliveryman(v string) *Additional {
	s.Deliveryman = &v
	return s
}

// 天枢系统专用RepayResult结构体
type RepayResult struct {
	// 客户编码
	// example:
	//
	// xxx
	CustomNo *string `json:"custom_no,omitempty" xml:"custom_no,omitempty" require:"true"`
	// 当前期数
	// example:
	//
	// 1
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
	// example:
	//
	// sss
	ReceiptNo *string `json:"receipt_no,omitempty" xml:"receipt_no,omitempty" require:"true"`
	// 还款状态1：已还清 2 未还 3 部分还款
	// example:
	//
	// 1
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 应还日期
	// example:
	//
	// 2018-10-10T10:10:00Z
	SettleDate *string `json:"settle_date,omitempty" xml:"settle_date,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 还款日期
	// example:
	//
	// 2018-10-10T10:10:00Z
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
	// example:
	//
	// 贷款车辆存在异常关联记录
	RiskGroupDesc *string `json:"risk_group_desc,omitempty" xml:"risk_group_desc,omitempty" require:"true"`
	// 反欺诈风险数据服务风险组名
	// example:
	//
	// 存在异常关联
	RiskGroup *string `json:"risk_group,omitempty" xml:"risk_group,omitempty" require:"true"`
	// 反欺诈风险数据服务风险组类别
	// example:
	//
	// 车辆风险
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
	// example:
	//
	// 123
	Id *int64 `json:"id,omitempty" xml:"id,omitempty"`
	// 渠道编码
	// example:
	//
	// 123
	ChannelCode *string `json:"channel_code,omitempty" xml:"channel_code,omitempty"`
	// 渠道id
	// example:
	//
	// 123AA
	ChannelNo *string `json:"channel_no,omitempty" xml:"channel_no,omitempty"`
	// 客户号
	// example:
	//
	// PCM123
	CustomerNo *string `json:"customer_no,omitempty" xml:"customer_no,omitempty"`
	// 创建时间
	// example:
	//
	// 2018-10-10T10:10:00Z
	CreateTime *string `json:"create_time,omitempty" xml:"create_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 更新时间
	// example:
	//
	// 2018-10-10T10:10:00Z
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
	// example:
	//
	// 5617
	SceneStrategyId *string `json:"scene_strategy_id,omitempty" xml:"scene_strategy_id,omitempty" require:"true"`
	// 计划名称
	// example:
	//
	// 测试计划名称
	SceneStrategyName *string `json:"scene_strategy_name,omitempty" xml:"scene_strategy_name,omitempty" require:"true"`
	// 模板内容
	// example:
	//
	// 测试模版内容
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
	// example:
	//
	// 1
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

// 测试
type TestStruct struct {
	// 测试
	TestField []*SecurityScene `json:"test_field,omitempty" xml:"test_field,omitempty" require:"true" type:"Repeated"`
}

func (s TestStruct) String() string {
	return tea.Prettify(s)
}

func (s TestStruct) GoString() string {
	return s.String()
}

func (s *TestStruct) SetTestField(v []*SecurityScene) *TestStruct {
	s.TestField = v
	return s
}

// 天枢系统专用Material结构体
type Material struct {
	// 资料类型0-风控报告1-合同2-图片3-附件
	// example:
	//
	// 0
	MType *string `json:"m_type,omitempty" xml:"m_type,omitempty" require:"true"`
	// 大类编码00-风控报告10-合同20身份证图片26人脸图片30-附件
	// example:
	//
	// 00
	BigCode *string `json:"big_code,omitempty" xml:"big_code,omitempty" require:"true"`
	// 小类编码
	// 201-身份证人脸面202身份证国徽面212-活体人脸图片
	// example:
	//
	// 201
	SmallCode *string `json:"small_code,omitempty" xml:"small_code,omitempty" require:"true"`
	// 资料名称
	// example:
	//
	// 资料名称
	MeterialName *string `json:"meterial_name,omitempty" xml:"meterial_name,omitempty" require:"true"`
	// 文件地址
	// example:
	//
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
	// example:
	//
	// true, false
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
	// example:
	//
	// [{}]
	Contacts []*Contact `json:"contacts,omitempty" xml:"contacts,omitempty" require:"true" type:"Repeated"`
	// 人脸对比分
	// example:
	//
	// x
	FacePoint *string `json:"face_point,omitempty" xml:"face_point,omitempty"`
	// 活体供应商
	// example:
	//
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
	// example:
	//
	// 1
	Period *int64 `json:"period,omitempty" xml:"period,omitempty" require:"true"`
	// 实还总额
	// example:
	//
	// 1
	Amount *int64 `json:"amount,omitempty" xml:"amount,omitempty" require:"true"`
	// 实还本金
	// example:
	//
	// 1
	Principal *int64 `json:"principal,omitempty" xml:"principal,omitempty" require:"true"`
	// 实还利息
	// example:
	//
	// 1
	Interest *int64 `json:"interest,omitempty" xml:"interest,omitempty" require:"true"`
	// 实还通道手续费
	// example:
	//
	// 1
	ChannelAmt *int64 `json:"channel_amt,omitempty" xml:"channel_amt,omitempty" require:"true"`
	// 实还手续费
	// example:
	//
	// 1
	Fee *int64 `json:"fee,omitempty" xml:"fee,omitempty" require:"true"`
	// 实收罚息
	// example:
	//
	// 1
	Punish *int64 `json:"punish,omitempty" xml:"punish,omitempty" require:"true"`
	// 担保费
	// example:
	//
	// 1
	GuaranteeFee *int64 `json:"guarantee_fee,omitempty" xml:"guarantee_fee,omitempty" require:"true"`
	// 违约金
	// example:
	//
	// 1
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
	// example:
	//
	// {}
	Params *string `json:"params,omitempty" xml:"params,omitempty" require:"true"`
	// 请求数据类型
	// example:
	//
	// IP
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 请求数据版本
	// example:
	//
	// 1.0
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
	// example:
	//
	// 0
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 总额度
	// example:
	//
	// 100
	CreditAmount *int64 `json:"credit_amount,omitempty" xml:"credit_amount,omitempty"`
	// 可用额度
	// example:
	//
	// 100
	AvailableAmount *int64 `json:"available_amount,omitempty" xml:"available_amount,omitempty"`
	// 待还总金额
	// example:
	//
	// 100
	ShouldPayAmount *int64 `json:"should_pay_amount,omitempty" xml:"should_pay_amount,omitempty"`
	// 逾期总金额
	OverdueAmount *int64 `json:"overdue_amount,omitempty" xml:"overdue_amount,omitempty"`
	// 下一期应还金额
	NextPeriodAmount *int64 `json:"next_period_amount,omitempty" xml:"next_period_amount,omitempty"`
	// 下一期还款时间yyyy-MM-dd
	// example:
	//
	// yyyy-MM-dd
	NextPeriodRepayTime *string `json:"next_period_repay_time,omitempty" xml:"next_period_repay_time,omitempty"`
	// 下次可授信时间yyyy-MM-dd
	// example:
	//
	// yyyy-MM-dd
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
	// example:
	//
	// accept
	Decision *string `json:"decision,omitempty" xml:"decision,omitempty" require:"true"`
	// 场景code
	// example:
	//
	// ANFAPP
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
	// example:
	//
	// 1
	SceneStrategyId *int64 `json:"scene_strategy_id,omitempty" xml:"scene_strategy_id,omitempty" require:"true"`
	// 场景策略名称
	// example:
	//
	// 蚂蚁营销
	SceneStrategyName *string `json:"scene_strategy_name,omitempty" xml:"scene_strategy_name,omitempty" require:"true"`
	// 场景策略状态
	// example:
	//
	// ONLINE
	SceneStrategyStatus *string `json:"scene_strategy_status,omitempty" xml:"scene_strategy_status,omitempty" require:"true"`
	// 创建时间
	// example:
	//
	// 2018-10-10T10:10:00Z
	GmtCreate *string `json:"gmt_create,omitempty" xml:"gmt_create,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 修改时间
	// example:
	//
	// 2018-10-10T10:10:00Z
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
	// example:
	//
	// s d d f d f
	ClueDetailType *string `json:"clue_detail_type,omitempty" xml:"clue_detail_type,omitempty" require:"true"`
	// odps数据产出时间，冗余字段，业务上不需要，以备错误排查
	// example:
	//
	// 20190823
	Dt *string `json:"dt,omitempty" xml:"dt,omitempty"`
	// 数据产生时间
	// example:
	//
	// yyyy-MM-dd hh:mm:ss
	GmtCreate *string `json:"gmt_create,omitempty" xml:"gmt_create,omitempty" require:"true"`
	// 记录唯一ID
	// example:
	//
	// 1
	Id *int64 `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 0-正常 1-删除
	// example:
	//
	// is_deleted
	IsDeleted *int64 `json:"is_deleted,omitempty" xml:"is_deleted,omitempty" require:"true"`
	// 企业ID
	// example:
	//
	// A123445
	MctOneId *string `json:"mct_one_id,omitempty" xml:"mct_one_id,omitempty" require:"true"`
	// 操作人ID
	// example:
	//
	// 123
	OperatorId *string `json:"operator_id,omitempty" xml:"operator_id,omitempty" require:"true"`
	// 操作类型
	// add、delete、update
	// example:
	//
	// add
	OpType *string `json:"op_type,omitempty" xml:"op_type,omitempty" require:"true"`
	// 企业名称
	// example:
	//
	// 东方财富公司
	OrgName *string `json:"org_name,omitempty" xml:"org_name,omitempty" require:"true"`
	// 线索类型
	// example:
	//
	// 列表
	RiskDetailType *string `json:"risk_detail_type,omitempty" xml:"risk_detail_type,omitempty" require:"true"`
	// 风险维度
	//
	// example:
	//
	// 风险维度
	RiskDimensionType *string `json:"risk_dimension_type,omitempty" xml:"risk_dimension_type,omitempty" require:"true"`
	// 线索概览
	// example:
	//
	// s d f g
	TagClue *string `json:"tag_clue,omitempty" xml:"tag_clue,omitempty" require:"true"`
	// 线索明细
	// example:
	//
	// 11
	TagClueDetail *string `json:"tag_clue_detail,omitempty" xml:"tag_clue_detail,omitempty" require:"true"`
	// 标签ID
	// example:
	//
	// NM23
	TagId *string `json:"tag_id,omitempty" xml:"tag_id,omitempty" require:"true"`
	// 线索列表表头，英文逗号分隔
	//
	// example:
	//
	// 日期
	TagListHeaders *string `json:"tag_list_headers,omitempty" xml:"tag_list_headers,omitempty" require:"true"`
	// 标签列表，排序字段
	// example:
	//
	// 日期
	TagListOrderColumn *string `json:"tag_list_order_column,omitempty" xml:"tag_list_order_column,omitempty" require:"true"`
	// 标签列表排序方式
	// example:
	//
	// 顺序
	TagListOrderType *string `json:"tag_list_order_type,omitempty" xml:"tag_list_order_type,omitempty" require:"true"`
	// 标签文本
	// example:
	//
	// 1233
	TagText *string `json:"tag_text,omitempty" xml:"tag_text,omitempty" require:"true"`
	// 趋势图表名
	// example:
	//
	// XX趋势图
	TagTrendChartName *string `json:"tag_trend_chart_name,omitempty" xml:"tag_trend_chart_name,omitempty" require:"true"`
	// 数据同步到公有云时间(业务上赋值当天)
	// example:
	//
	// 20190823
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

// 二级商户入驻结果
type SubMerchantOrder struct {
	// 是否开通线上预授权，
	// TRUE/FALSE
	// example:
	//
	// xxxx
	AppPreAuth *string `json:"app_pre_auth,omitempty" xml:"app_pre_auth,omitempty"`
	// 申请单创建时间
	// example:
	//
	// xxxx
	ApplyTime *string `json:"apply_time,omitempty" xml:"apply_time,omitempty" require:"true"`
	// 本申请单的请求类型，
	// 商户预校验: ZHIFUTONG_CONSULT
	// 商户创建: ZHIFUTONG_CREATE
	// 商户修改: ZHIFUTONG_MODIFY
	//
	// example:
	//
	// xxxx
	ApplyType *string `json:"apply_type,omitempty" xml:"apply_type,omitempty" require:"true"`
	// 进件生成的卡编号，在发起结算时可以作为结算账号
	// example:
	//
	// xxxx
	CardAliasNo *string `json:"card_alias_no,omitempty" xml:"card_alias_no,omitempty"`
	// 外部商户id
	// example:
	//
	// xxxx
	ExternalId *string `json:"external_id,omitempty" xml:"external_id,omitempty" require:"true"`
	// 是否开通线下预授权，
	// TRUE/FALSE
	// example:
	//
	// xxxx
	FacePreAuth *string `json:"face_pre_auth,omitempty" xml:"face_pre_auth,omitempty"`
	// 风控审核状态，
	// CREATE: 已创建待审批
	// SKIP: 跳过风控审批步骤
	// PASS: 风控审核通过
	// REJECT: 风控审批拒绝
	//
	// example:
	//
	// xxxx
	FkAudit *string `json:"fk_audit,omitempty" xml:"fk_audit,omitempty"`
	// 风控审批备注
	// example:
	//
	// xxxx
	FkAuditMemo *string `json:"fk_audit_memo,omitempty" xml:"fk_audit_memo,omitempty"`
	// 判断个人当面付权限版本，
	// TRUE: 表示是标准版
	// FALSE: 表示受限版
	//
	// example:
	//
	// xxxx
	IsFaceLimit *string `json:"is_face_limit,omitempty" xml:"is_face_limit,omitempty"`
	// 客资审核状态，
	// CREATE: 已创建待审批
	// SKIP: 跳过客资审批步骤
	// PASS: 客资审核通过
	// REJECT: 客资审批拒绝
	// example:
	//
	// xxxx
	KzAudit *string `json:"kz_audit,omitempty" xml:"kz_audit,omitempty"`
	// 客资审批备注
	// example:
	//
	// xxxx
	KzAuditMemo *string `json:"kz_audit_memo,omitempty" xml:"kz_audit_memo,omitempty"`
	// 进件时填写的商户名称
	// example:
	//
	// xxxx
	MerchantName *string `json:"merchant_name,omitempty" xml:"merchant_name,omitempty"`
	// 入驻申请单号
	// example:
	//
	// xxxx
	OrderId *string `json:"order_id,omitempty" xml:"order_id,omitempty" require:"true"`
	// 申请单处理失败时，通过此此段返回具体的失败理由，
	// 与kf_audit_memo和kz_audit_memo配合使用
	// example:
	//
	// xxxx
	Reason *string `json:"reason,omitempty" xml:"reason,omitempty"`
	// 签约支付宝账号（脱敏）
	// example:
	//
	// xxxx
	SafeBindingLogonId *string `json:"safe_binding_logon_id,omitempty" xml:"safe_binding_logon_id,omitempty"`
	// 二级商户id，当总体申请状态status为99时，smid才算进件完成
	// example:
	//
	// xxxx
	Smid *string `json:"smid,omitempty" xml:"smid,omitempty"`
	// 申请总体状态，
	// 99: 已完结
	// -1: 失败
	// 031: 审核中
	// example:
	//
	// xxxx
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 二级商户确认状态，
	// CREATE: 已发起二级商户确认
	// SKIP: 无需确认
	// FAIL: 签约失败
	// NOT_CONFIRM: 商户未确认
	// FINISH: 签约完成
	// example:
	//
	// xxxx
	SubConfirm *string `json:"sub_confirm,omitempty" xml:"sub_confirm,omitempty"`
}

func (s SubMerchantOrder) String() string {
	return tea.Prettify(s)
}

func (s SubMerchantOrder) GoString() string {
	return s.String()
}

func (s *SubMerchantOrder) SetAppPreAuth(v string) *SubMerchantOrder {
	s.AppPreAuth = &v
	return s
}

func (s *SubMerchantOrder) SetApplyTime(v string) *SubMerchantOrder {
	s.ApplyTime = &v
	return s
}

func (s *SubMerchantOrder) SetApplyType(v string) *SubMerchantOrder {
	s.ApplyType = &v
	return s
}

func (s *SubMerchantOrder) SetCardAliasNo(v string) *SubMerchantOrder {
	s.CardAliasNo = &v
	return s
}

func (s *SubMerchantOrder) SetExternalId(v string) *SubMerchantOrder {
	s.ExternalId = &v
	return s
}

func (s *SubMerchantOrder) SetFacePreAuth(v string) *SubMerchantOrder {
	s.FacePreAuth = &v
	return s
}

func (s *SubMerchantOrder) SetFkAudit(v string) *SubMerchantOrder {
	s.FkAudit = &v
	return s
}

func (s *SubMerchantOrder) SetFkAuditMemo(v string) *SubMerchantOrder {
	s.FkAuditMemo = &v
	return s
}

func (s *SubMerchantOrder) SetIsFaceLimit(v string) *SubMerchantOrder {
	s.IsFaceLimit = &v
	return s
}

func (s *SubMerchantOrder) SetKzAudit(v string) *SubMerchantOrder {
	s.KzAudit = &v
	return s
}

func (s *SubMerchantOrder) SetKzAuditMemo(v string) *SubMerchantOrder {
	s.KzAuditMemo = &v
	return s
}

func (s *SubMerchantOrder) SetMerchantName(v string) *SubMerchantOrder {
	s.MerchantName = &v
	return s
}

func (s *SubMerchantOrder) SetOrderId(v string) *SubMerchantOrder {
	s.OrderId = &v
	return s
}

func (s *SubMerchantOrder) SetReason(v string) *SubMerchantOrder {
	s.Reason = &v
	return s
}

func (s *SubMerchantOrder) SetSafeBindingLogonId(v string) *SubMerchantOrder {
	s.SafeBindingLogonId = &v
	return s
}

func (s *SubMerchantOrder) SetSmid(v string) *SubMerchantOrder {
	s.Smid = &v
	return s
}

func (s *SubMerchantOrder) SetStatus(v string) *SubMerchantOrder {
	s.Status = &v
	return s
}

func (s *SubMerchantOrder) SetSubConfirm(v string) *SubMerchantOrder {
	s.SubConfirm = &v
	return s
}

// 企业反馈
type RtopCompanyFeedback struct {
	// 主键
	Id *int64 `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 企业ID
	// example:
	//
	// 1
	CompanyId *string `json:"company_id,omitempty" xml:"company_id,omitempty" require:"true"`
	// 反馈原因
	// example:
	//
	// 1
	FeedbackReason *string `json:"feedback_reason,omitempty" xml:"feedback_reason,omitempty" require:"true"`
	// 反馈原因详情
	// example:
	//
	// 1
	FeedbackReasonDetail *string `json:"feedback_reason_detail,omitempty" xml:"feedback_reason_detail,omitempty" require:"true"`
	// 评论
	// example:
	//
	// 1
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
	// example:
	//
	// 0
	Code *int64 `json:"code,omitempty" xml:"code,omitempty" require:"true"`
	// true代表上传成功，false代表上传失败
	// example:
	//
	// true, false
	Success *bool `json:"success,omitempty" xml:"success,omitempty" require:"true"`
	// 上文件传成功
	// example:
	//
	// OK
	Resultmsg *string `json:"resultmsg,omitempty" xml:"resultmsg,omitempty" require:"true"`
	// 文件上传结果
	// example:
	//
	// [fileInfoReceive api success!]
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

// qmp分层信息
type DecisionInfo struct {
	// 状态
	// example:
	//
	// DECISION_SUCCESS
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 计划配置ID
	// example:
	//
	// 1
	OfflineDecisionPlanId *int64 `json:"offline_decision_plan_id,omitempty" xml:"offline_decision_plan_id,omitempty" require:"true"`
	// 总数量
	// example:
	//
	// 111
	TotalNum *int64 `json:"total_num,omitempty" xml:"total_num,omitempty" require:"true"`
	// 分层结果数
	// example:
	//
	// 12
	DecisionNum *int64 `json:"decision_num,omitempty" xml:"decision_num,omitempty" require:"true"`
	// 文件路径
	// example:
	//
	// https://test-oss.oss-cn-shang
	FileUrl *string `json:"file_url,omitempty" xml:"file_url,omitempty" require:"true"`
	// 返回结果节点id
	// example:
	//
	// 123
	ReturnResultId *int64 `json:"return_result_id,omitempty" xml:"return_result_id,omitempty"`
}

func (s DecisionInfo) String() string {
	return tea.Prettify(s)
}

func (s DecisionInfo) GoString() string {
	return s.String()
}

func (s *DecisionInfo) SetStatus(v string) *DecisionInfo {
	s.Status = &v
	return s
}

func (s *DecisionInfo) SetOfflineDecisionPlanId(v int64) *DecisionInfo {
	s.OfflineDecisionPlanId = &v
	return s
}

func (s *DecisionInfo) SetTotalNum(v int64) *DecisionInfo {
	s.TotalNum = &v
	return s
}

func (s *DecisionInfo) SetDecisionNum(v int64) *DecisionInfo {
	s.DecisionNum = &v
	return s
}

func (s *DecisionInfo) SetFileUrl(v string) *DecisionInfo {
	s.FileUrl = &v
	return s
}

func (s *DecisionInfo) SetReturnResultId(v int64) *DecisionInfo {
	s.ReturnResultId = &v
	return s
}

// 监测企业的特征信息
type RtopMonitorCompanyFeature struct {
	// 特征的描述
	// example:
	//
	// 有企业地址变更历史，变更过经营范围
	Description *string `json:"description,omitempty" xml:"description,omitempty"`
	// 特征的名称
	// example:
	//
	// 关联风险
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 特征里的风险标签列表
	RiskTags []*string `json:"risk_tags,omitempty" xml:"risk_tags,omitempty" type:"Repeated"`
	// 特征的评分
	// example:
	//
	// 80
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
	// example:
	//
	// place_type
	PlaceType *string `json:"place_type,omitempty" xml:"place_type,omitempty"`
	// 区域
	// example:
	//
	// 天津市
	PlaceName *string `json:"place_name,omitempty" xml:"place_name,omitempty"`
	// 企业唯一id
	// example:
	//
	// mct_one_id
	MctOneId *string `json:"mct_one_id,omitempty" xml:"mct_one_id,omitempty"`
	// 企业统一社会信用代码
	// example:
	//
	// uc_code
	UcCode *string `json:"uc_code,omitempty" xml:"uc_code,omitempty"`
	// 工商注册号
	// example:
	//
	// reg_no
	RegNo *string `json:"reg_no,omitempty" xml:"reg_no,omitempty"`
	// 组织机构代码
	// example:
	//
	// org_code
	OrgCode *string `json:"org_code,omitempty" xml:"org_code,omitempty"`
	// 企业名
	// example:
	//
	// org_name
	OrgName *string `json:"org_name,omitempty" xml:"org_name,omitempty"`
	// 风险评分
	// example:
	//
	// risk_score
	RiskScore *string `json:"risk_score,omitempty" xml:"risk_score,omitempty"`
	// 风险变化程度排序，根据分值波动大小，标签变更次数排序
	// example:
	//
	// risk_shift_rank
	RiskShiftRank *string `json:"risk_shift_rank,omitempty" xml:"risk_shift_rank,omitempty"`
	// 风险定性
	// example:
	//
	// risk_type
	RiskType *string `json:"risk_type,omitempty" xml:"risk_type,omitempty"`
	// 风险标签id列表
	RiskTagsId []*string `json:"risk_tags_id,omitempty" xml:"risk_tags_id,omitempty" type:"Repeated"`
	// 线索
	// example:
	//
	// tags_clue
	TagsClue *string `json:"tags_clue,omitempty" xml:"tags_clue,omitempty"`
	// 风险线索明细
	// example:
	//
	// tags_clue_detail
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
	// example:
	//
	// 2
	AnnualReportCount *int64 `json:"annual_report_count,omitempty" xml:"annual_report_count,omitempty"`
	// 年报是否发生股权转让
	// example:
	//
	// true
	AnnualReportHasEquityTransfer *bool `json:"annual_report_has_equity_transfer,omitempty" xml:"annual_report_has_equity_transfer,omitempty"`
	// 年报是否对外提供担保
	// example:
	//
	// true
	AnnualReportHasExternalGuarantee *bool `json:"annual_report_has_external_guarantee,omitempty" xml:"annual_report_has_external_guarantee,omitempty"`
	// 年报是否对外投资
	// example:
	//
	// true
	AnnualReportHasExternalInvest *bool `json:"annual_report_has_external_invest,omitempty" xml:"annual_report_has_external_invest,omitempty"`
	// 营业总收入中主营业务收入
	// example:
	//
	// 1000
	AnnualReportMainBusinessIncome *string `json:"annual_report_main_business_income,omitempty" xml:"annual_report_main_business_income,omitempty"`
	// 年报净利润
	// example:
	//
	// 1000
	AnnualReportNetProfit *string `json:"annual_report_net_profit,omitempty" xml:"annual_report_net_profit,omitempty"`
	// 年报发布日期
	// example:
	//
	// 2018-09-09
	AnnualReportReleaseDate *string `json:"annual_report_release_date,omitempty" xml:"annual_report_release_date,omitempty"`
	// 年报股东实缴出资额（万元（实缴出资额用两个冒号::分割）
	// example:
	//
	// 100::200:2
	AnnualReportShActualPaid *string `json:"annual_report_sh_actual_paid,omitempty" xml:"annual_report_sh_actual_paid,omitempty"`
	// 年报公司人数
	// example:
	//
	// 200
	AnnualReportStaffCount *int64 `json:"annual_report_staff_count,omitempty" xml:"annual_report_staff_count,omitempty"`
	// 资产总额
	// example:
	//
	// 1000
	AnnualReportTotalAssets *string `json:"annual_report_total_assets,omitempty" xml:"annual_report_total_assets,omitempty"`
	// 负债总额
	// example:
	//
	// 1000
	AnnualReportTotalLiabilities *string `json:"annual_report_total_liabilities,omitempty" xml:"annual_report_total_liabilities,omitempty"`
	// 营业总收入
	// example:
	//
	// 1000
	AnnualReportTotalOperatingIncome *string `json:"annual_report_total_operating_income,omitempty" xml:"annual_report_total_operating_income,omitempty"`
	// 年报所有者权益合计
	// example:
	//
	// 1000
	AnnualReportTotalOwnerEquity *string `json:"annual_report_total_owner_equity,omitempty" xml:"annual_report_total_owner_equity,omitempty"`
	// 年报利润总额
	// example:
	//
	// 1000
	AnnualReportTotalProfit *string `json:"annual_report_total_profit,omitempty" xml:"annual_report_total_profit,omitempty"`
	// 纳税总额
	// example:
	//
	// 1000
	AnnualReportTotalTax *string `json:"annual_report_total_tax,omitempty" xml:"annual_report_total_tax,omitempty"`
	// 年报报送年度
	// example:
	//
	// 2018
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

// 查询结果
type CustomerRpspInfosModel struct {
	// 归属用户的混合分层决策结果
	RpspResults []*RpspInfoModel `json:"rpsp_results,omitempty" xml:"rpsp_results,omitempty" require:"true" type:"Repeated"`
	// 用户凭证
	// example:
	//
	// 8002c3d97e7d4d20a0647c75dfab1efe
	CustomerKey *string `json:"customer_key,omitempty" xml:"customer_key,omitempty" require:"true"`
}

func (s CustomerRpspInfosModel) String() string {
	return tea.Prettify(s)
}

func (s CustomerRpspInfosModel) GoString() string {
	return s.String()
}

func (s *CustomerRpspInfosModel) SetRpspResults(v []*RpspInfoModel) *CustomerRpspInfosModel {
	s.RpspResults = v
	return s
}

func (s *CustomerRpspInfosModel) SetCustomerKey(v string) *CustomerRpspInfosModel {
	s.CustomerKey = &v
	return s
}

// 信护盾产品查询信息
type QueryInfo struct {
	// key
	// example:
	//
	// key
	Key *string `json:"key,omitempty" xml:"key,omitempty"`
	// value
	// example:
	//
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
	// example:
	//
	// 1
	CompanyId *string `json:"company_id,omitempty" xml:"company_id,omitempty" require:"true"`
	// 异动分数
	// example:
	//
	// 1
	ChangeScore *string `json:"change_score,omitempty" xml:"change_score,omitempty" require:"true"`
	// 异动程度
	// example:
	//
	// 1
	ChangeLevel *string `json:"change_level,omitempty" xml:"change_level,omitempty" require:"true"`
	// 新增企业的时间
	// example:
	//
	// 2018-10-10T10:10:00Z
	NewAddedTime *string `json:"new_added_time,omitempty" xml:"new_added_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 总公司注册地
	// example:
	//
	// 1
	HeadRegisterPlace *string `json:"head_register_place,omitempty" xml:"head_register_place,omitempty" require:"true"`
	// 数据的时间
	// example:
	//
	// 1
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
type ZhimaQueryResp struct {
	// 认证的企业证件号
	// example:
	//
	// 91330000327827106L
	EpCertNo *string `json:"ep_cert_no,omitempty" xml:"ep_cert_no,omitempty"`
	// 认证的企业名
	// example:
	//
	// 芝麻信用管理有限公司
	EpName *string `json:"ep_name,omitempty" xml:"ep_name,omitempty"`
	// 认证不通过的错误码
	// example:
	//
	// BIZ_LICENSE_LEGAL_INFO_NO_MATCH
	FailedCode *string `json:"failed_code,omitempty" xml:"failed_code,omitempty"`
	// 认证是否通过，通过为true，不通过为false
	// example:
	//
	// “true“,”false”
	Passed *string `json:"passed,omitempty" xml:"passed,omitempty"`
	//  10000是成功，其余是失败
	// example:
	//
	// OK/40002
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty" require:"true"`
	//
	// example:
	//
	// Success/Invalid Arguments
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty" require:"true"`
	//
	// example:
	//
	// isv.invalid-app-id
	SubCode *string `json:"sub_code,omitempty" xml:"sub_code,omitempty"`
	//
	// example:
	//
	// 无效的AppID参数
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
	// example:
	//
	// 杭州市
	ActiveCity *string `json:"active_city,omitempty" xml:"active_city,omitempty"`
	// 活跃县
	// example:
	//
	// 西湖区
	ActiveCounty *string `json:"active_county,omitempty" xml:"active_county,omitempty"`
	// 活跃省
	// example:
	//
	// 浙江省
	ActiveProvince *string `json:"active_province,omitempty" xml:"active_province,omitempty"`
	// 风险标签
	ClueTags []*string `json:"clue_tags,omitempty" xml:"clue_tags,omitempty" type:"Repeated"`
	// 企业ID
	// example:
	//
	// 123456789
	CompanyId *string `json:"company_id,omitempty" xml:"company_id,omitempty" require:"true"`
	// 企业名称
	// example:
	//
	// XXXXX有限公司
	CompanyName *string `json:"company_name,omitempty" xml:"company_name,omitempty" require:"true"`
	// 风险等级
	// example:
	//
	// EX_HIGH_RISK
	CrowdRiskLevel *string `json:"crowd_risk_level,omitempty" xml:"crowd_risk_level,omitempty"`
	// 涉众风险分数
	// example:
	//
	// 80
	CrowdRiskScore *int64 `json:"crowd_risk_score,omitempty" xml:"crowd_risk_score,omitempty"`
	// 涉众风险类型
	// example:
	//
	// MLM
	CrowdRiskType *string `json:"crowd_risk_type,omitempty" xml:"crowd_risk_type,omitempty"`
	// 发现时间
	// example:
	//
	// 2018-07-15
	DetectedTime *string `json:"detected_time,omitempty" xml:"detected_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 影响金额
	// example:
	//
	// 100
	MoneyInvolved *int64 `json:"money_involved,omitempty" xml:"money_involved,omitempty"`
	// 影响人数
	// example:
	//
	// 100
	PeopleInvolved *int64 `json:"people_involved,omitempty" xml:"people_involved,omitempty"`
	// 注册市
	// example:
	//
	// 杭州市
	RegisteredCity *string `json:"registered_city,omitempty" xml:"registered_city,omitempty"`
	// 注册县
	// example:
	//
	// 西湖区
	RegisteredCounty *string `json:"registered_county,omitempty" xml:"registered_county,omitempty"`
	// 注册省
	// example:
	//
	// 浙江省
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

// 天枢-电商-申请人信息
type EcApplicantPersonInfo struct {
	// 如果合作方传输，会在我行H5进件页面反显展示
	// example:
	//
	// 张三
	ApplicantName *string `json:"applicant_name,omitempty" xml:"applicant_name,omitempty"`
	// 申请人身份证号码
	// example:
	//
	// 6230582100000003260
	IdNo *string `json:"id_no,omitempty" xml:"id_no,omitempty"`
}

func (s EcApplicantPersonInfo) String() string {
	return tea.Prettify(s)
}

func (s EcApplicantPersonInfo) GoString() string {
	return s.String()
}

func (s *EcApplicantPersonInfo) SetApplicantName(v string) *EcApplicantPersonInfo {
	s.ApplicantName = &v
	return s
}

func (s *EcApplicantPersonInfo) SetIdNo(v string) *EcApplicantPersonInfo {
	s.IdNo = &v
	return s
}

// 回执统计结果
type StatisticResult struct {
	// 有效任务总数量
	// example:
	//
	// 123
	ValidCount *int64 `json:"valid_count,omitempty" xml:"valid_count,omitempty" require:"true"`
	// 各类actionDriverCode的统计结果集合
	// example:
	//
	// List<StatisticInfoDetail>
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
	// example:
	//
	// 1
	Id *int64 `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 线索ID
	// example:
	//
	// 124
	TagId *string `json:"tag_id,omitempty" xml:"tag_id,omitempty" require:"true"`
	// 标签文本
	// example:
	//
	// 233444
	TagText *string `json:"tag_text,omitempty" xml:"tag_text,omitempty" require:"true"`
	// 风险维度
	// example:
	//
	// 风险维度
	RiskDimensionType *string `json:"risk_dimension_type,omitempty" xml:"risk_dimension_type,omitempty" require:"true"`
	// 线索类型
	// example:
	//
	// 列表
	RiskDetailType *string `json:"risk_detail_type,omitempty" xml:"risk_detail_type,omitempty" require:"true"`
	// 趋势图表名
	// example:
	//
	// XX趋势图
	TagTrendChartName *string `json:"tag_trend_chart_name,omitempty" xml:"tag_trend_chart_name,omitempty" require:"true"`
	// 线索列表表头，英文逗号分隔
	// example:
	//
	// 日期
	TagListHeaders *string `json:"tag_list_headers,omitempty" xml:"tag_list_headers,omitempty" require:"true"`
	// 标签列表，排序字段
	// example:
	//
	// 日期
	TagListOrderColumn *string `json:"tag_list_order_column,omitempty" xml:"tag_list_order_column,omitempty" require:"true"`
	// 标签列表排序方式
	// example:
	//
	// 顺序
	TagListOrderType *string `json:"tag_list_order_type,omitempty" xml:"tag_list_order_type,omitempty" require:"true"`
	// 标记删除
	// example:
	//
	// 0
	IsDelete *int64 `json:"is_delete,omitempty" xml:"is_delete,omitempty" require:"true"`
	// 创建时间
	// example:
	//
	// 2018-10-10T10:10:00Z
	GmtCreate *string `json:"gmt_create,omitempty" xml:"gmt_create,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 修改时间
	// example:
	//
	// 2018-10-10T10:10:00Z
	GmtModified *string `json:"gmt_modified,omitempty" xml:"gmt_modified,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 操作人ID
	// example:
	//
	// 1233
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

// 输出参数
type OutParam struct {
	// 输出参数名称
	// example:
	//
	// creditLimit
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 输出参数值
	// example:
	//
	// 19000
	Value *string `json:"value,omitempty" xml:"value,omitempty"`
}

func (s OutParam) String() string {
	return tea.Prettify(s)
}

func (s OutParam) GoString() string {
	return s.String()
}

func (s *OutParam) SetName(v string) *OutParam {
	s.Name = &v
	return s
}

func (s *OutParam) SetValue(v string) *OutParam {
	s.Value = &v
	return s
}

// 策略详情
type StrategyDetails struct {
	// 策略id
	// example:
	//
	// 1
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 策略名称
	// example:
	//
	// 策略名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 决策结果
	// example:
	//
	// accept
	Decision *string `json:"decision,omitempty" xml:"decision,omitempty" require:"true"`
	// 场景码
	// example:
	//
	// scene_code
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
	// example:
	//
	// reject
	Decision *string `json:"decision,omitempty" xml:"decision,omitempty" require:"true"`
	// 反欺诈风险数据服务风险分
	// example:
	//
	// 100.0
	RiskScore *int64 `json:"risk_score,omitempty" xml:"risk_score,omitempty" require:"true"`
	// 反欺诈风险数据服务场景码
	// example:
	//
	// EC_TEST
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
	// example:
	//
	// above20
	Age *string `json:"age,omitempty" xml:"age,omitempty" require:"true"`
	// 统计值
	// example:
	//
	// 10
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

// 客群详细信息
type CustomerInfo struct {
	// 查询的用户凭证列表
	// example:
	//
	// 15022321363
	CustomerKey *string `json:"customer_key,omitempty" xml:"customer_key,omitempty" require:"true"`
	// 客户属性的额外信息
	// example:
	//
	// {"test_score": 22.0}
	Properties *string `json:"properties,omitempty" xml:"properties,omitempty"`
}

func (s CustomerInfo) String() string {
	return tea.Prettify(s)
}

func (s CustomerInfo) GoString() string {
	return s.String()
}

func (s *CustomerInfo) SetCustomerKey(v string) *CustomerInfo {
	s.CustomerKey = &v
	return s
}

func (s *CustomerInfo) SetProperties(v string) *CustomerInfo {
	s.Properties = &v
	return s
}

// 企业信息
type CompanyInfo struct {
	// 活跃地json
	// example:
	//
	// 活跃地json
	ActiveAddrJson *string `json:"active_addr_json,omitempty" xml:"active_addr_json,omitempty" require:"true"`
	// 活跃市(字段停用)
	// example:
	//
	// 活跃市(字段停用)
	ActiveCity *string `json:"active_city,omitempty" xml:"active_city,omitempty" require:"true"`
	// 活跃县(字段停用)
	// example:
	//
	// 活跃县(字段停用)
	ActiveCounty *string `json:"active_county,omitempty" xml:"active_county,omitempty" require:"true"`
	// 活跃省(字段停用)
	// example:
	//
	// 活跃省(字段停用)
	ActiveProvince *string `json:"active_province,omitempty" xml:"active_province,omitempty" require:"true"`
	// 类经融行业分类
	// example:
	//
	// 类金融
	Categories *string `json:"categories,omitempty" xml:"categories,omitempty" require:"true"`
	// 核准日期
	// example:
	//
	// 20191023
	CheckDate *string `json:"check_date,omitempty" xml:"check_date,omitempty" require:"true"`
	// 删除标志
	// example:
	//
	// 0
	DelFlag *string `json:"del_flag,omitempty" xml:"del_flag,omitempty" require:"true"`
	// odps数据产生时间，业务上不关心
	// example:
	//
	// 20190922
	Dt *string `json:"dt,omitempty" xml:"dt,omitempty" require:"true"`
	// 企业曾用名
	// example:
	//
	// [123,45tee]
	FormerOrgNames *string `json:"former_org_names,omitempty" xml:"former_org_names,omitempty" require:"true"`
	// {"mct_one_id":"ID1","org_name":"总公司名称1"}
	// example:
	//
	// 总公司,json格式
	HeadOffice *string `json:"head_office,omitempty" xml:"head_office,omitempty" require:"true"`
	// 记录ID
	// example:
	//
	// 1
	Id *int64 `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 影响金额
	// example:
	//
	// 300
	InvolvedAmount *int64 `json:"involved_amount,omitempty" xml:"involved_amount,omitempty" require:"true"`
	// 影响人数
	// example:
	//
	// 100
	InvolvedPeople *int64 `json:"involved_people,omitempty" xml:"involved_people,omitempty" require:"true"`
	// 重要关联企业,json格式
	// example:
	//
	// [{"mct_one_id":"ID1","org_name":"企业名称1","relation_desc":"关联描述1"},{"mct_one_id":"ID2","org_name":"企业名称2","relation_desc":"关联描述2"}]
	KeyRelaOrgs *string `json:"key_rela_orgs,omitempty" xml:"key_rela_orgs,omitempty" require:"true"`
	// 法人
	// example:
	//
	// 张三
	LegalRepresentative *string `json:"legal_representative,omitempty" xml:"legal_representative,omitempty" require:"true"`
	// 企业ID
	// example:
	//
	// 12
	MctOneId *string `json:"mct_one_id,omitempty" xml:"mct_one_id,omitempty" require:"true"`
	// 经营地json
	// example:
	//
	// 经营地json
	OperatingAddrJson *string `json:"operating_addr_json,omitempty" xml:"operating_addr_json,omitempty" require:"true"`
	// 经营市(字段停用)
	// example:
	//
	// 经营市(字段停用)
	OperatingCity *string `json:"operating_city,omitempty" xml:"operating_city,omitempty" require:"true"`
	// 经营县(字段停用)
	// example:
	//
	// 经营县(字段停用)
	OperatingCounty *string `json:"operating_county,omitempty" xml:"operating_county,omitempty" require:"true"`
	// 经营地址(字段停用)
	// example:
	//
	// 经营地址(字段停用)
	OperatingPlace *string `json:"operating_place,omitempty" xml:"operating_place,omitempty" require:"true"`
	// 经营省(字段停用)
	// example:
	//
	// operating_province
	OperatingProvince *string `json:"operating_province,omitempty" xml:"operating_province,omitempty" require:"true"`
	// 营运状态(1:营运0:不营运)
	// example:
	//
	// 1
	OprtActvState *string `json:"oprt_actv_state,omitempty" xml:"oprt_actv_state,omitempty" require:"true"`
	// 经营期限至
	// example:
	//
	// 20210201
	OprtEndDate *string `json:"oprt_end_date,omitempty" xml:"oprt_end_date,omitempty" require:"true"`
	// 经营范围
	// example:
	//
	// 工商
	OprtScope *string `json:"oprt_scope,omitempty" xml:"oprt_scope,omitempty" require:"true"`
	// 经营期限自
	// example:
	//
	// 20190201
	OprtStartDate *string `json:"oprt_start_date,omitempty" xml:"oprt_start_date,omitempty" require:"true"`
	// 操作类型
	//
	// example:
	//
	// add、delete、update
	OpType *string `json:"op_type,omitempty" xml:"op_type,omitempty" require:"true"`
	// 组织机构代码
	// example:
	//
	// 246667
	OrgCode *string `json:"org_code,omitempty" xml:"org_code,omitempty" require:"true"`
	// 电子邮箱
	// example:
	//
	// werr@163.com
	OrgEmail *string `json:"org_email,omitempty" xml:"org_email,omitempty" require:"true"`
	// 企业名
	// example:
	//
	// 恒生电子
	OrgName *string `json:"org_name,omitempty" xml:"org_name,omitempty" require:"true"`
	// 注册资本折人民币(万元)
	// example:
	//
	// 3000000000
	OrgRegCptlRmb *string `json:"org_reg_cptl_rmb,omitempty" xml:"org_reg_cptl_rmb,omitempty" require:"true"`
	// 企业状态
	// example:
	//
	// 正常
	OrgState *string `json:"org_state,omitempty" xml:"org_state,omitempty" require:"true"`
	// 联系电话
	// example:
	//
	// 1234567
	OrgTel *string `json:"org_tel,omitempty" xml:"org_tel,omitempty" require:"true"`
	// 企业类型
	// example:
	//
	// 工商
	OrgType *string `json:"org_type,omitempty" xml:"org_type,omitempty" require:"true"`
	// 平台名
	// example:
	//
	// p2p平台
	PlatformName *string `json:"platform_name,omitempty" xml:"platform_name,omitempty" require:"true"`
	// 平台状态
	// example:
	//
	// 平台状态
	PlatformStates *string `json:"platform_states,omitempty" xml:"platform_states,omitempty" require:"true"`
	// 注册资本币种
	// example:
	//
	// 人名币
	RegisterCapitalCurrency *string `json:"register_capital_currency,omitempty" xml:"register_capital_currency,omitempty" require:"true"`
	// 注册资本值
	// example:
	//
	// 2300000
	RegisterCapitalValue *string `json:"register_capital_value,omitempty" xml:"register_capital_value,omitempty" require:"true"`
	// 注册市
	// example:
	//
	// 宣城市
	RegisterCity *string `json:"register_city,omitempty" xml:"register_city,omitempty" require:"true"`
	// 注册区县
	// example:
	//
	// 南海区
	RegisterCounty *string `json:"register_county,omitempty" xml:"register_county,omitempty" require:"true"`
	// 注册时间
	// example:
	//
	// 20110203
	RegisterDate *string `json:"register_date,omitempty" xml:"register_date,omitempty" require:"true"`
	// 注册地址
	// example:
	//
	// 江苏省
	RegisterPlace *string `json:"register_place,omitempty" xml:"register_place,omitempty" require:"true"`
	// 注册省
	// example:
	//
	// 安徽省
	RegisterProvince *string `json:"register_province,omitempty" xml:"register_province,omitempty" require:"true"`
	// 登记机关
	// example:
	//
	// XX金融办
	RegistrationAuthority *string `json:"registration_authority,omitempty" xml:"registration_authority,omitempty" require:"true"`
	// 工商注册号
	// example:
	//
	// 23456667
	RegNo *string `json:"reg_no,omitempty" xml:"reg_no,omitempty" require:"true"`
	// 风报企业ID
	// example:
	//
	// 1234
	RiskstormCompanyId *string `json:"riskstorm_company_id,omitempty" xml:"riskstorm_company_id,omitempty" require:"true"`
	// 风险维度
	// example:
	//
	// 风险维度
	RiskFactors *string `json:"risk_factors,omitempty" xml:"risk_factors,omitempty" require:"true"`
	// 风险图谱可视化数据
	// example:
	//
	// 风险图谱可视化数据
	RiskGraphJson *string `json:"risk_graph_json,omitempty" xml:"risk_graph_json,omitempty" require:"true"`
	// 风险报文
	// example:
	//
	// 风险报文
	RiskMessage *string `json:"risk_message,omitempty" xml:"risk_message,omitempty" require:"true"`
	// 风险指数
	// example:
	//
	// 80
	RiskScore *int64 `json:"risk_score,omitempty" xml:"risk_score,omitempty" require:"true"`
	// 风险指数，按日的趋势图
	// example:
	//
	// 风险指数
	RiskScoreTrend *string `json:"risk_score_trend,omitempty" xml:"risk_score_trend,omitempty" require:"true"`
	// 风险指数周波动
	// example:
	//
	// 2.3
	RiskScoreWeeklyFloat *int64 `json:"risk_score_weekly_float,omitempty" xml:"risk_score_weekly_float,omitempty" require:"true"`
	// 风险标签(字段停用)
	// example:
	//
	// 经营异常
	RiskTags *string `json:"risk_tags,omitempty" xml:"risk_tags,omitempty" require:"true"`
	// 风险标签ID
	// example:
	//
	// NM12,NM34
	RiskTagsId *string `json:"risk_tags_id,omitempty" xml:"risk_tags_id,omitempty" require:"true"`
	// 风险定性
	// example:
	//
	// 风险定性
	RiskType *string `json:"risk_type,omitempty" xml:"risk_type,omitempty" require:"true"`
	// 搜索内容
	// example:
	//
	// 隐隐科技
	SearchContent *string `json:"search_content,omitempty" xml:"search_content,omitempty" require:"true"`
	// 传播人次
	// example:
	//
	// 传播人次
	SpreadNumber *int64 `json:"spread_number,omitempty" xml:"spread_number,omitempty" require:"true"`
	// 影响地区人次分布,json格式如下
	// example:
	//
	// [{"place_type":"prov","active_info":[{"place_name":"省1","num":3690},{"place_name":"省2","num":3680}]},{"place_type":"city","active_info":[{"place_name":"市1","num":3690},{"place_name":"市2","num":3680}]}]
	SpreadNumDistribution *string `json:"spread_num_distribution,omitempty" xml:"spread_num_distribution,omitempty" require:"true"`
	// 社会统一信用代码
	// example:
	//
	// 2456787878
	UcCode *string `json:"uc_code,omitempty" xml:"uc_code,omitempty" require:"true"`
	// 公有云数据库产生时间
	// example:
	//
	// 20190923
	UpdateDate *string `json:"update_date,omitempty" xml:"update_date,omitempty" require:"true"`
	// 平台json
	// example:
	//
	//  [{"platform_name":"ptp","platform_states":"平台状态"}]
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
	// example:
	//
	// 12345
	EventId *string `json:"event_id,omitempty" xml:"event_id,omitempty" require:"true"`
	// 营销计划id
	// example:
	//
	// 12345
	PlanId *string `json:"plan_id,omitempty" xml:"plan_id,omitempty" require:"true"`
	// 消息id
	// example:
	//
	// 1122
	MsgId *string `json:"msg_id,omitempty" xml:"msg_id,omitempty" require:"true"`
	// 事件时间
	// example:
	//
	// yyyy-MM-dd HH:mm:ss.SSS
	EventTime *string `json:"event_time,omitempty" xml:"event_time,omitempty" require:"true"`
	// 事件类型：1为富信贴尾
	// example:
	//
	// 1
	EventType *int64 `json:"event_type,omitempty" xml:"event_type,omitempty" require:"true"`
	// 1为成功 2为失败
	// example:
	//
	// 1
	State *int64 `json:"state,omitempty" xml:"state,omitempty" require:"true"`
	// 用户key类型
	// example:
	//
	// MOBILE
	KeyType *string `json:"key_type,omitempty" xml:"key_type,omitempty" require:"true"`
	// 手机号
	// example:
	//
	// 15012340000
	CustomerKey *string `json:"customer_key,omitempty" xml:"customer_key,omitempty" require:"true"`
	// 扩展字段
	// example:
	//
	// {"operator":"CMCC"}
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
	// example:
	//
	// true, false
	Success *bool `json:"success,omitempty" xml:"success,omitempty" require:"true"`
	// 结果描述
	// example:
	//
	// success
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty" require:"true"`
	// 结果码
	// example:
	//
	// 0
	ResponseCode *string `json:"response_code,omitempty" xml:"response_code,omitempty" require:"true"`
	// 具体返回值.jsonString形式
	// example:
	//
	// {"a":1}
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

// 渠道扩展信息
type PetCashierApplyExtInfo struct {
	// 门店名称
	StoreName *string `json:"store_name,omitempty" xml:"store_name,omitempty"`
	// 门店id
	StoreId *string `json:"store_id,omitempty" xml:"store_id,omitempty"`
	// 门店社会统一信用代码
	StoreSocialCode *string `json:"store_social_code,omitempty" xml:"store_social_code,omitempty"`
	// 门店地址
	StoreAddress *string `json:"store_address,omitempty" xml:"store_address,omitempty"`
	// 门店地址省
	StoreAddrProv *string `json:"store_addr_prov,omitempty" xml:"store_addr_prov,omitempty"`
	// 门店地址市
	StoreAddrCity *string `json:"store_addr_city,omitempty" xml:"store_addr_city,omitempty"`
	// 门店地址区
	StoreAddrDstc *string `json:"store_addr_dstc,omitempty" xml:"store_addr_dstc,omitempty"`
	// 厂商社会信用代码
	VendorSocialCode *string `json:"vendor_social_code,omitempty" xml:"vendor_social_code,omitempty" require:"true"`
	// 厂商名称
	VendorName *string `json:"vendor_name,omitempty" xml:"vendor_name,omitempty" require:"true"`
	// 商品型号
	CommModel *string `json:"comm_model,omitempty" xml:"comm_model,omitempty" require:"true"`
	// 商品总价(包含定金)	String
	TotalPrice *string `json:"total_price,omitempty" xml:"total_price,omitempty"`
	// 已付定金
	FirstPayAmount *string `json:"first_pay_amount,omitempty" xml:"first_pay_amount,omitempty"`
	// 已付货款
	OrderPaidAmount *string `json:"order_paid_amount,omitempty" xml:"order_paid_amount,omitempty"`
	// 客户历史交易信息
	HisTranInfo []*HisTranInfo `json:"his_tran_info,omitempty" xml:"his_tran_info,omitempty" type:"Repeated"`
}

func (s PetCashierApplyExtInfo) String() string {
	return tea.Prettify(s)
}

func (s PetCashierApplyExtInfo) GoString() string {
	return s.String()
}

func (s *PetCashierApplyExtInfo) SetStoreName(v string) *PetCashierApplyExtInfo {
	s.StoreName = &v
	return s
}

func (s *PetCashierApplyExtInfo) SetStoreId(v string) *PetCashierApplyExtInfo {
	s.StoreId = &v
	return s
}

func (s *PetCashierApplyExtInfo) SetStoreSocialCode(v string) *PetCashierApplyExtInfo {
	s.StoreSocialCode = &v
	return s
}

func (s *PetCashierApplyExtInfo) SetStoreAddress(v string) *PetCashierApplyExtInfo {
	s.StoreAddress = &v
	return s
}

func (s *PetCashierApplyExtInfo) SetStoreAddrProv(v string) *PetCashierApplyExtInfo {
	s.StoreAddrProv = &v
	return s
}

func (s *PetCashierApplyExtInfo) SetStoreAddrCity(v string) *PetCashierApplyExtInfo {
	s.StoreAddrCity = &v
	return s
}

func (s *PetCashierApplyExtInfo) SetStoreAddrDstc(v string) *PetCashierApplyExtInfo {
	s.StoreAddrDstc = &v
	return s
}

func (s *PetCashierApplyExtInfo) SetVendorSocialCode(v string) *PetCashierApplyExtInfo {
	s.VendorSocialCode = &v
	return s
}

func (s *PetCashierApplyExtInfo) SetVendorName(v string) *PetCashierApplyExtInfo {
	s.VendorName = &v
	return s
}

func (s *PetCashierApplyExtInfo) SetCommModel(v string) *PetCashierApplyExtInfo {
	s.CommModel = &v
	return s
}

func (s *PetCashierApplyExtInfo) SetTotalPrice(v string) *PetCashierApplyExtInfo {
	s.TotalPrice = &v
	return s
}

func (s *PetCashierApplyExtInfo) SetFirstPayAmount(v string) *PetCashierApplyExtInfo {
	s.FirstPayAmount = &v
	return s
}

func (s *PetCashierApplyExtInfo) SetOrderPaidAmount(v string) *PetCashierApplyExtInfo {
	s.OrderPaidAmount = &v
	return s
}

func (s *PetCashierApplyExtInfo) SetHisTranInfo(v []*HisTranInfo) *PetCashierApplyExtInfo {
	s.HisTranInfo = v
	return s
}

// 申请人信息
type ApplicantPersonInfo struct {
	// 申请人姓名
	// example:
	//
	// 张三
	ApplicantName *string `json:"applicant_name,omitempty" xml:"applicant_name,omitempty"`
	// 申请人身份证号码
	// example:
	//
	// 6230582100000003260
	IdNo *string `json:"id_no,omitempty" xml:"id_no,omitempty"`
}

func (s ApplicantPersonInfo) String() string {
	return tea.Prettify(s)
}

func (s ApplicantPersonInfo) GoString() string {
	return s.String()
}

func (s *ApplicantPersonInfo) SetApplicantName(v string) *ApplicantPersonInfo {
	s.ApplicantName = &v
	return s
}

func (s *ApplicantPersonInfo) SetIdNo(v string) *ApplicantPersonInfo {
	s.IdNo = &v
	return s
}

// 门店账户信息
type StoreAccountInfo struct {
	// 结算银行卡号
	// example:
	//
	// 2023343380112
	BankCardNo *string `json:"bank_card_no,omitempty" xml:"bank_card_no,omitempty" require:"true"`
	// 结算银行账户名称
	// example:
	//
	// 交通银行
	BankAccountName *string `json:"bank_account_name,omitempty" xml:"bank_account_name,omitempty" require:"true"`
	// 结算银行code
	// example:
	//
	// ICBC
	BankCode *string `json:"bank_code,omitempty" xml:"bank_code,omitempty" require:"true"`
	// 商户号(支付通道给的商户编号)
	// example:
	//
	// 202334332380
	MerchantNo *string `json:"merchant_no,omitempty" xml:"merchant_no,omitempty" require:"true"`
	// 银行虚拟户卡号(监管户的账户信息)
	// example:
	//
	// 3242352345234
	EVirtualBankCardNo *string `json:"e_virtual_bank_card_no,omitempty" xml:"e_virtual_bank_card_no,omitempty" require:"true"`
	// 银行虚拟户账户名称(监管户的账户信息)
	// example:
	//
	// 账户1
	EVirtualBankAccountName *string `json:"e_virtual_bank_account_name,omitempty" xml:"e_virtual_bank_account_name,omitempty" require:"true"`
	// 银行虚拟户银行code(监管户的账户信息)
	// example:
	//
	// SEFG
	EVirtualBankCode *string `json:"e_virtual_bank_code,omitempty" xml:"e_virtual_bank_code,omitempty" require:"true"`
}

func (s StoreAccountInfo) String() string {
	return tea.Prettify(s)
}

func (s StoreAccountInfo) GoString() string {
	return s.String()
}

func (s *StoreAccountInfo) SetBankCardNo(v string) *StoreAccountInfo {
	s.BankCardNo = &v
	return s
}

func (s *StoreAccountInfo) SetBankAccountName(v string) *StoreAccountInfo {
	s.BankAccountName = &v
	return s
}

func (s *StoreAccountInfo) SetBankCode(v string) *StoreAccountInfo {
	s.BankCode = &v
	return s
}

func (s *StoreAccountInfo) SetMerchantNo(v string) *StoreAccountInfo {
	s.MerchantNo = &v
	return s
}

func (s *StoreAccountInfo) SetEVirtualBankCardNo(v string) *StoreAccountInfo {
	s.EVirtualBankCardNo = &v
	return s
}

func (s *StoreAccountInfo) SetEVirtualBankAccountName(v string) *StoreAccountInfo {
	s.EVirtualBankAccountName = &v
	return s
}

func (s *StoreAccountInfo) SetEVirtualBankCode(v string) *StoreAccountInfo {
	s.EVirtualBankCode = &v
	return s
}

// 客户信息结果
type CustomInfoResult struct {
	// 社会信用代码
	// example:
	//
	// 923231293311125216
	CreditCode *string `json:"credit_code,omitempty" xml:"credit_code,omitempty" require:"true"`
	// 公司名称
	// example:
	//
	// 测试查询科技有限公司
	CompanyName *string `json:"company_name,omitempty" xml:"company_name,omitempty" require:"true"`
	// 法人姓名
	// example:
	//
	// 王华
	LegalName *string `json:"legal_name,omitempty" xml:"legal_name,omitempty" require:"true"`
	// 身份证号
	// example:
	//
	// 320101111111111111
	IdCard *string `json:"id_card,omitempty" xml:"id_card,omitempty" require:"true"`
	// 手机号
	// example:
	//
	// 15899998888
	PhoneNumber *string `json:"phone_number,omitempty" xml:"phone_number,omitempty" require:"true"`
	// 账号
	// example:
	//
	// 111111111
	Account *string `json:"account,omitempty" xml:"account,omitempty" require:"true"`
	// 密码
	// example:
	//
	// 1111111
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
	// example:
	//
	// 1
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
	// example:
	//
	// xxxxx
	ApplyNo *string `json:"apply_no,omitempty" xml:"apply_no,omitempty"`
	// 资金方编号
	// example:
	//
	// xxxxx
	FundCode *string `json:"fund_code,omitempty" xml:"fund_code,omitempty"`
	// 资金方名称
	// example:
	//
	// xxxxx
	FundName *string `json:"fund_name,omitempty" xml:"fund_name,omitempty"`
	// 贷款利率
	// example:
	//
	// xxxxx
	RateValue *int64 `json:"rate_value,omitempty" xml:"rate_value,omitempty"`
	// 贷款日利率
	// example:
	//
	// xxxxx
	RateValueDay *int64 `json:"rate_value_day,omitempty" xml:"rate_value_day,omitempty"`
	// 年天数
	// example:
	//
	// xxxxx
	DaysNumYear *int64 `json:"days_num_year,omitempty" xml:"days_num_year,omitempty"`
	// 总授信额度
	// example:
	//
	// xxxxx
	TotalAmount *int64 `json:"total_amount,omitempty" xml:"total_amount,omitempty"`
	// 可用额度
	// example:
	//
	// xxxxx
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

// 退款订单信息
type RefoundGoodOrderInfo struct {
	// 商城订单号
	// example:
	//
	// 2023343380112
	GoodsOrderNo *string `json:"goods_order_no,omitempty" xml:"goods_order_no,omitempty" require:"true"`
	// 退款金额
	// example:
	//
	// 1000.00
	Amount *string `json:"amount,omitempty" xml:"amount,omitempty" require:"true"`
}

func (s RefoundGoodOrderInfo) String() string {
	return tea.Prettify(s)
}

func (s RefoundGoodOrderInfo) GoString() string {
	return s.String()
}

func (s *RefoundGoodOrderInfo) SetGoodsOrderNo(v string) *RefoundGoodOrderInfo {
	s.GoodsOrderNo = &v
	return s
}

func (s *RefoundGoodOrderInfo) SetAmount(v string) *RefoundGoodOrderInfo {
	s.Amount = &v
	return s
}

// 风险基因-点
type RtopRiskGeneNode struct {
	// 主企业唯一ID
	// example:
	//
	// 1
	MainCompanyId *string `json:"main_company_id,omitempty" xml:"main_company_id,omitempty"`
	// 主企业名称
	// example:
	//
	// 1
	MainCompanyName *string `json:"main_company_name,omitempty" xml:"main_company_name,omitempty"`
	// 节点唯一ID
	// example:
	//
	// 1
	NodeId *string `json:"node_id,omitempty" xml:"node_id,omitempty"`
	// 节点名称
	// example:
	//
	// 1
	NodeName *string `json:"node_name,omitempty" xml:"node_name,omitempty"`
	// 节点证件号码
	// example:
	//
	// 1
	NodeCertNo *string `json:"node_cert_no,omitempty" xml:"node_cert_no,omitempty"`
	// 节点类型，枚举值
	// example:
	//
	// company
	NodeType *string `json:"node_type,omitempty" xml:"node_type,omitempty"`
	// 节点扩展信息
	// example:
	//
	// 节点扩展信息
	NodeExtJson *string `json:"node_ext_json,omitempty" xml:"node_ext_json,omitempty"`
	// 基因模式
	// example:
	//
	// risk_label
	RiskLabel *string `json:"risk_label,omitempty" xml:"risk_label,omitempty"`
	// 基因模式
	// example:
	//
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
	// example:
	//
	// 杭州市
	City *string `json:"city,omitempty" xml:"city,omitempty" require:"true"`
	// 统计值
	// example:
	//
	// 10
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

// 天枢-电商-授信补充-拓展字段
type EcBizContend struct {
	// 企业名称
	// example:
	//
	// 张三的贸易有限公司
	DtEnterpriseName *string `json:"dt_enterprise_name,omitempty" xml:"dt_enterprise_name,omitempty" require:"true"`
	// 企业社会信用代码
	// example:
	//
	// 91234500123400000R
	DtSocialCreditno *string `json:"dt_social_creditno,omitempty" xml:"dt_social_creditno,omitempty" require:"true"`
	// 是否有关联关系Y/N
	// example:
	//
	// Y
	DtContractFlag *string `json:"dt_contract_flag,omitempty" xml:"dt_contract_flag,omitempty" require:"true"`
	// 固定经营场所地址
	// example:
	//
	// 广东省深圳市区福田区
	DtFixedManageArea *string `json:"dt_fixed_manage_area,omitempty" xml:"dt_fixed_manage_area,omitempty"`
	// 近1个月商户在电商平台的交易额（GMV）
	// example:
	//
	// 10000234
	DtMerchtAtEmrchPlfLimitLt1m *string `json:"dt_mercht_at_emrch_plf_limit_lt_1m,omitempty" xml:"dt_mercht_at_emrch_plf_limit_lt_1m,omitempty"`
	// 近6个月的月均GMV
	// example:
	//
	// 10000234
	DtAvgGmvLt6m *string `json:"dt_avg_gmv_lt_6m,omitempty" xml:"dt_avg_gmv_lt_6m,omitempty" require:"true"`
	// 近6个月平均退货率
	// example:
	//
	// 8
	DtAvgRetRateLt6m *string `json:"dt_avg_ret_rate_lt_6m,omitempty" xml:"dt_avg_ret_rate_lt_6m,omitempty" require:"true"`
	// 近12个月平均退货率
	// example:
	//
	// 10
	DtAvgRetRateLt12m *string `json:"dt_avg_ret_rate_lt_12m,omitempty" xml:"dt_avg_ret_rate_lt_12m,omitempty" require:"true"`
	// 退货率的季度均值
	// example:
	//
	// 10
	DtRetRateQtrAvgVal *string `json:"dt_ret_rate_qtr_avg_val,omitempty" xml:"dt_ret_rate_qtr_avg_val,omitempty"`
	// 近3个月累计违规处罚金额
	// example:
	//
	// 200.00
	DtAccuFoulPunishAmtLt3m *string `json:"dt_accu_foul_punish_amt_lt_3m,omitempty" xml:"dt_accu_foul_punish_amt_lt_3m,omitempty" require:"true"`
	// 是否有重大违规或交易违约
	// example:
	//
	// Y
	DtIsHaveMajorFoulOrTxnDeflt *string `json:"dt_is_have_major_foul_or_txn_deflt,omitempty" xml:"dt_is_have_major_foul_or_txn_deflt,omitempty" require:"true"`
	// 过往是否有刷单等虚假贸易记录
	// example:
	//
	// Y
	DtHisHaveSngEtcVtlFakeTradeRcrd *string `json:"dt_his_have_sng_etc_vtl_fake_trade_rcrd,omitempty" xml:"dt_his_have_sng_etc_vtl_fake_trade_rcrd,omitempty" require:"true"`
	// 合作时长表
	// example:
	//
	// 抖音：24；天猫：12
	DtCoDuranTab *string `json:"dt_co_duran_tab,omitempty" xml:"dt_co_duran_tab,omitempty" require:"true"`
	// 店铺经营品类（准入非翡翠/玉石类、黄金／彩宝／钻石／珍珠类、钟表类、珠宝／文玩类、房产/汽车、汽车售后服务、奢侈品、虚拟/服务、二手、到店美食、物流服务类）
	// example:
	//
	// 玉石类
	DtEntCustSeg *string `json:"dt_ent_cust_seg,omitempty" xml:"dt_ent_cust_seg,omitempty" require:"true"`
	// 店铺名称
	// example:
	//
	// 张三的抖音小店
	DtShopName *string `json:"dt_shop_name,omitempty" xml:"dt_shop_name,omitempty" require:"true"`
	// 近12个月经营数据
	MonthData []*EcMonthData `json:"month_data,omitempty" xml:"month_data,omitempty" require:"true" type:"Repeated"`
}

func (s EcBizContend) String() string {
	return tea.Prettify(s)
}

func (s EcBizContend) GoString() string {
	return s.String()
}

func (s *EcBizContend) SetDtEnterpriseName(v string) *EcBizContend {
	s.DtEnterpriseName = &v
	return s
}

func (s *EcBizContend) SetDtSocialCreditno(v string) *EcBizContend {
	s.DtSocialCreditno = &v
	return s
}

func (s *EcBizContend) SetDtContractFlag(v string) *EcBizContend {
	s.DtContractFlag = &v
	return s
}

func (s *EcBizContend) SetDtFixedManageArea(v string) *EcBizContend {
	s.DtFixedManageArea = &v
	return s
}

func (s *EcBizContend) SetDtMerchtAtEmrchPlfLimitLt1m(v string) *EcBizContend {
	s.DtMerchtAtEmrchPlfLimitLt1m = &v
	return s
}

func (s *EcBizContend) SetDtAvgGmvLt6m(v string) *EcBizContend {
	s.DtAvgGmvLt6m = &v
	return s
}

func (s *EcBizContend) SetDtAvgRetRateLt6m(v string) *EcBizContend {
	s.DtAvgRetRateLt6m = &v
	return s
}

func (s *EcBizContend) SetDtAvgRetRateLt12m(v string) *EcBizContend {
	s.DtAvgRetRateLt12m = &v
	return s
}

func (s *EcBizContend) SetDtRetRateQtrAvgVal(v string) *EcBizContend {
	s.DtRetRateQtrAvgVal = &v
	return s
}

func (s *EcBizContend) SetDtAccuFoulPunishAmtLt3m(v string) *EcBizContend {
	s.DtAccuFoulPunishAmtLt3m = &v
	return s
}

func (s *EcBizContend) SetDtIsHaveMajorFoulOrTxnDeflt(v string) *EcBizContend {
	s.DtIsHaveMajorFoulOrTxnDeflt = &v
	return s
}

func (s *EcBizContend) SetDtHisHaveSngEtcVtlFakeTradeRcrd(v string) *EcBizContend {
	s.DtHisHaveSngEtcVtlFakeTradeRcrd = &v
	return s
}

func (s *EcBizContend) SetDtCoDuranTab(v string) *EcBizContend {
	s.DtCoDuranTab = &v
	return s
}

func (s *EcBizContend) SetDtEntCustSeg(v string) *EcBizContend {
	s.DtEntCustSeg = &v
	return s
}

func (s *EcBizContend) SetDtShopName(v string) *EcBizContend {
	s.DtShopName = &v
	return s
}

func (s *EcBizContend) SetMonthData(v []*EcMonthData) *EcBizContend {
	s.MonthData = v
	return s
}

// 天枢文件信息统一结构体
type DubheFileInfo struct {
	// 文件访问路径
	// example:
	//
	// https://aa.bb.png?expiredtime=xx
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
	// example:
	//
	// 8002c3d97e7d4d20a0647c75dfab1efe
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
type ModelDetails struct {
	// 风险场景编码
	// example:
	//
	// scene_code
	SceneCode *string `json:"scene_code,omitempty" xml:"scene_code,omitempty" require:"true"`
	// 该风险场景的风险分值
	//
	// example:
	//
	// 90
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
	// example:
	//
	// D2024082100001
	FundCode *string `json:"fund_code,omitempty" xml:"fund_code,omitempty" require:"true"`
	// 资金方简称
	// example:
	//
	// 杭银消金
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
	// example:
	//
	// 2018-10-10T10:10:00Z
	GmtCreate *string `json:"gmt_create,omitempty" xml:"gmt_create,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 修改时间
	// example:
	//
	// 2018-10-10T10:10:00Z
	GmtModified *string `json:"gmt_modified,omitempty" xml:"gmt_modified,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// id
	// example:
	//
	// 1
	Id *int64 `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 是否为基本筛选标签
	// example:
	//
	// 1
	IsBase *int64 `json:"is_base,omitempty" xml:"is_base,omitempty" require:"true"`
	// 标记删除
	// example:
	//
	// 0
	IsDelete *int64 `json:"is_delete,omitempty" xml:"is_delete,omitempty" require:"true"`
	// 操作人员ID
	// example:
	//
	// 1
	OperatorId *string `json:"operator_id,omitempty" xml:"operator_id,omitempty" require:"true"`
	// 地区名
	// example:
	//
	// place_name
	PlaceName *string `json:"place_name,omitempty" xml:"place_name,omitempty" require:"true"`
	// 地区类型
	// example:
	//
	// place_type
	PlaceType *string `json:"place_type,omitempty" xml:"place_type,omitempty" require:"true"`
	// 标签ID
	// example:
	//
	// 1
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
	// example:
	//
	// 12345
	CustomerKey *string `json:"customer_key,omitempty" xml:"customer_key,omitempty" require:"true"`
	// 用户维度透传字段
	// example:
	//
	// 12345
	CustomerOutInfo *string `json:"customer_out_info,omitempty" xml:"customer_out_info,omitempty"`
	// 外呼话术变量字段
	// example:
	//
	// {"key1":"v1"}
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
	// example:
	//
	// xxx
	JobType *string `json:"job_type,omitempty" xml:"job_type,omitempty"`
	// 职务
	// example:
	//
	// xxx
	WorkPosition *string `json:"work_position,omitempty" xml:"work_position,omitempty"`
	// 工作年限
	// example:
	//
	// 2
	JobLife *string `json:"job_life,omitempty" xml:"job_life,omitempty"`
	// 本单位工作年限
	// example:
	//
	// 1
	CurrentJobLife *int64 `json:"current_job_life,omitempty" xml:"current_job_life,omitempty"`
	// 公司名称
	// example:
	//
	// xxx
	CompanyName *string `json:"company_name,omitempty" xml:"company_name,omitempty"`
	// 公司行业类型
	// example:
	//
	// xx
	CompanyIndustryType *string `json:"company_industry_type,omitempty" xml:"company_industry_type,omitempty"`
	// 公司电话
	// example:
	//
	// 111
	CompanyTel *string `json:"company_tel,omitempty" xml:"company_tel,omitempty"`
	// 公司省份
	// example:
	//
	// 浙江
	CompanyProvince *string `json:"company_province,omitempty" xml:"company_province,omitempty"`
	// 公司城市
	// example:
	//
	// 公司城市
	CompanyCity *string `json:"company_city,omitempty" xml:"company_city,omitempty"`
	// 公司区域
	// example:
	//
	// 公司区域
	CompanyArea *string `json:"company_area,omitempty" xml:"company_area,omitempty"`
	// 公司街道
	// example:
	//
	// 公司街道
	CompanyStreet *string `json:"company_street,omitempty" xml:"company_street,omitempty"`
	// 公司详细地址
	// example:
	//
	// 公司详细地址
	CompanyAddress *string `json:"company_address,omitempty" xml:"company_address,omitempty"`
	// 年收入
	// example:
	//
	// 年收入
	YearSalary *int64 `json:"year_salary,omitempty" xml:"year_salary,omitempty"`
	// 贷款用户所属行业类别
	// example:
	//
	// 1
	InduInvol *string `json:"indu_invol,omitempty" xml:"indu_invol,omitempty"`
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

func (s *JobInfo) SetInduInvol(v string) *JobInfo {
	s.InduInvol = &v
	return s
}

// 天枢系统居住信息结构体
type LiveInfo struct {
	// 居住省份
	// example:
	//
	// 居住省份
	LiveProvince *string `json:"live_province,omitempty" xml:"live_province,omitempty"`
	// 居住城市
	// example:
	//
	// 居住城市
	LiveCity *string `json:"live_city,omitempty" xml:"live_city,omitempty"`
	// 居住区域
	// example:
	//
	// 居住区域
	LiveArea *string `json:"live_area,omitempty" xml:"live_area,omitempty"`
	// 居住街道
	// example:
	//
	// 居住街道
	LiveStreet *string `json:"live_street,omitempty" xml:"live_street,omitempty"`
	// 居住详细地址
	// example:
	//
	// 居住详细地址
	LiveAddress *string `json:"live_address,omitempty" xml:"live_address,omitempty"`
	// 居住年限
	// example:
	//
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
	// example:
	//
	// 10
	LabelCount *int `json:"label_count,omitempty" xml:"label_count,omitempty" require:"true"`
	// 标签id
	// example:
	//
	// cancelled
	LabelId *string `json:"label_id,omitempty" xml:"label_id,omitempty" require:"true"`
	// 标签名称
	// example:
	//
	// 注销
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

// 补充材料
type SupplementFile struct {
	// 材料类型：
	// 301-行驶证正本
	// 302-行驶证副本
	// 303-车辆产证（摩托车二手车）
	//
	// example:
	//
	// xxx
	FileType *string `json:"file_type,omitempty" xml:"file_type,omitempty" require:"true"`
	// 材料url
	// example:
	//
	// xxx
	FileUrl *string `json:"file_url,omitempty" xml:"file_url,omitempty" require:"true"`
	// 材料名称/描述
	// example:
	//
	// xxx
	FileDesc *string `json:"file_desc,omitempty" xml:"file_desc,omitempty"`
	// 材料后缀，如png/jpg/jpeg
	// example:
	//
	// png
	FileSuffix *string `json:"file_suffix,omitempty" xml:"file_suffix,omitempty"`
}

func (s SupplementFile) String() string {
	return tea.Prettify(s)
}

func (s SupplementFile) GoString() string {
	return s.String()
}

func (s *SupplementFile) SetFileType(v string) *SupplementFile {
	s.FileType = &v
	return s
}

func (s *SupplementFile) SetFileUrl(v string) *SupplementFile {
	s.FileUrl = &v
	return s
}

func (s *SupplementFile) SetFileDesc(v string) *SupplementFile {
	s.FileDesc = &v
	return s
}

func (s *SupplementFile) SetFileSuffix(v string) *SupplementFile {
	s.FileSuffix = &v
	return s
}

// 芝麻四要素认证接口
type ZhimaIdentifyResp struct {
	// 唯一ID，接口正常的话有此字段
	// example:
	//
	// ZM201505190ad422641448624704506270407
	BizNo *string `json:"biz_no,omitempty" xml:"biz_no,omitempty"`
	// 带参数的回调地址，接口正常的话有此字段
	// example:
	//
	// http://zmmcportal.stable.zhimaxy.net/index.htm?biz_content=%7B%22biz_no%22%3A%225f491814480fafe7dc0779a1c452c9f7%22%7D&sign=dsgdsfhgdsfh
	CertifyUrl *string `json:"certify_url,omitempty" xml:"certify_url,omitempty"`
	// 蚂蚁调用芝麻的错误码
	// example:
	//
	// OK
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty" require:"true"`
	// 蚂蚁调用芝麻的结果描述
	// example:
	//
	// Success/Invalid Arguments
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty" require:"true"`
	// 蚂蚁调用芝麻的错误码
	// example:
	//
	// isv.invalid-app-id
	SubCode *string `json:"sub_code,omitempty" xml:"sub_code,omitempty"`
	// 蚂蚁调用芝麻信息
	// example:
	//
	// 无效的AppID参数
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
	// example:
	//
	// SMS_NOTIFICATION
	TemplateType *string `json:"template_type,omitempty" xml:"template_type,omitempty"`
	// 模板名称
	// example:
	//
	// 扩展码测试
	TemplateName *string `json:"template_name,omitempty" xml:"template_name,omitempty"`
	// 模板内容
	// example:
	//
	// 扩展码测试
	TemplateContent *string `json:"template_content,omitempty" xml:"template_content,omitempty"`
	// 审批状态
	// example:
	//
	// APPROVED
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 模版code
	// example:
	//
	// SMS_2306XXXX
	TemplateCode *string `json:"template_code,omitempty" xml:"template_code,omitempty"`
	// 审核未通过原因
	// example:
	//
	// 失败原因
	FailReason *string `json:"fail_reason,omitempty" xml:"fail_reason,omitempty"`
	// 短信创建时间
	// example:
	//
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
	// example:
	//
	// yidun_aft_v3
	VariableName *string `json:"variable_name,omitempty" xml:"variable_name,omitempty" require:"true"`
	// 输出变量值
	// example:
	//
	// 66.6
	VariableValue *string `json:"variable_value,omitempty" xml:"variable_value,omitempty" require:"true"`
	// 输出变量值类型
	// example:
	//
	// Double
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
	// example:
	//
	// 行业整体趋势仍向好,白酒2Q18营收增速略回落,大众品龙头竞争力强化
	DocContent *string `json:"doc_content,omitempty" xml:"doc_content,omitempty" require:"true"`
	// 舆情的id
	// example:
	//
	// 1843266597720304871
	DocId *string `json:"doc_id,omitempty" xml:"doc_id,omitempty" require:"true"`
	// 舆情的标题
	// example:
	//
	// 扫IC网获金证引擎战略投资;产业+互联网+金融;推进电子产业资源整合_搜狐科技_搜狐网
	DocTitle *string `json:"doc_title,omitempty" xml:"doc_title,omitempty" require:"true"`
	// 舆情的url
	// example:
	//
	// http://istock.jrj.com.cn/article,yanbao,30483668.html
	DocUrl *string `json:"doc_url,omitempty" xml:"doc_url,omitempty" require:"true"`
	// 情感得分
	// example:
	//
	// 2.80
	EmotionScore *string `json:"emotion_score,omitempty" xml:"emotion_score,omitempty"`
	// 实体相关度得分
	// example:
	//
	// 0.71
	EntityRelevancyScore *string `json:"entity_relevancy_score,omitempty" xml:"entity_relevancy_score,omitempty"`
	// 命中的关键词
	HitKeywords *string `json:"hit_keywords,omitempty" xml:"hit_keywords,omitempty"`
	// 媒体影响力得分
	// example:
	//
	// 6.90
	MediaInfluenceScore *string `json:"media_influence_score,omitempty" xml:"media_influence_score,omitempty"`
	// 来源媒体
	// example:
	//
	// 东方媒体
	MediaName *string `json:"media_name,omitempty" xml:"media_name,omitempty" require:"true"`
	// 媒体传播得分
	// example:
	//
	// 0.60
	MediaPropagationScore *string `json:"media_propagation_score,omitempty" xml:"media_propagation_score,omitempty"`
	// 舆情的发布时间
	// example:
	//
	// 2018-07-15
	PublishTime *string `json:"publish_time,omitempty" xml:"publish_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 相似文章数
	// example:
	//
	// 2
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
	// example:
	//
	// 696108134003934432^0
	BizId *string `json:"biz_id,omitempty" xml:"biz_id,omitempty" require:"true"`
	// 请求状态码; OK表示成功, 其他表示失败
	// example:
	//
	// OK
	Code *string `json:"code,omitempty" xml:"code,omitempty" require:"true"`
	// 是否调用接口成功的描述
	// example:
	//
	// OK
	Message *string `json:"message,omitempty" xml:"message,omitempty" require:"true"`
	// 请求ID
	// example:
	//
	// EF2DE797-B632-5DCF-8502-600959436E77
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

// 营销盾圈投任务信息
type UmktCampaignTaskInfo struct {
	// 任务唯一id
	// example:
	//
	// xxx-xxx-xxx
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty" require:"true"`
	// 圈投任务执行日期，yyyy-MM-dd格式
	// example:
	//
	// 2025-12-25
	ExecDate *string `json:"exec_date,omitempty" xml:"exec_date,omitempty" require:"true"`
	// 圈投任务执行批次
	// example:
	//
	// 202512250020
	ExecBatch *string `json:"exec_batch,omitempty" xml:"exec_batch,omitempty" require:"true"`
	// 圈投任务状态
	// example:
	//
	// D
	CampaignTaskStatus *string `json:"campaign_task_status,omitempty" xml:"campaign_task_status,omitempty" require:"true"`
	// 节点任务列表
	// example:
	//
	// [{"nodeId":"35d2171b68fd472c8f4cc5c293985d37","execDate":"","nodeTaskStatus":"F","relTaskList":[{"resourceId":"1007", "taskStatus":"F","errMsg":"上游节点执行失败"}]}
	NodeTaskList []*UmktCampaignNodeTaskInfo `json:"node_task_list,omitempty" xml:"node_task_list,omitempty" require:"true" type:"Repeated"`
}

func (s UmktCampaignTaskInfo) String() string {
	return tea.Prettify(s)
}

func (s UmktCampaignTaskInfo) GoString() string {
	return s.String()
}

func (s *UmktCampaignTaskInfo) SetTaskId(v string) *UmktCampaignTaskInfo {
	s.TaskId = &v
	return s
}

func (s *UmktCampaignTaskInfo) SetExecDate(v string) *UmktCampaignTaskInfo {
	s.ExecDate = &v
	return s
}

func (s *UmktCampaignTaskInfo) SetExecBatch(v string) *UmktCampaignTaskInfo {
	s.ExecBatch = &v
	return s
}

func (s *UmktCampaignTaskInfo) SetCampaignTaskStatus(v string) *UmktCampaignTaskInfo {
	s.CampaignTaskStatus = &v
	return s
}

func (s *UmktCampaignTaskInfo) SetNodeTaskList(v []*UmktCampaignNodeTaskInfo) *UmktCampaignTaskInfo {
	s.NodeTaskList = v
	return s
}

// 天枢系统专用ReceiptInfo结构体
type ReceiptInfo struct {
	// 客户名
	// example:
	//
	// XXX
	CustomName *string `json:"custom_name,omitempty" xml:"custom_name,omitempty" require:"true"`
	// 证件号码
	// example:
	//
	// xxx
	CardNo *string `json:"card_no,omitempty" xml:"card_no,omitempty" require:"true"`
	// 手机号
	// example:
	//
	// 166****1234
	Mobile *string `json:"mobile,omitempty" xml:"mobile,omitempty" require:"true"`
	// 贷款金额
	// example:
	//
	// 1234
	ApplyAmount *int64 `json:"apply_amount,omitempty" xml:"apply_amount,omitempty" require:"true"`
	// 发放金额
	// example:
	//
	// 1234
	LoanAmount *int64 `json:"loan_amount,omitempty" xml:"loan_amount,omitempty" require:"true"`
	// 期数
	// example:
	//
	// 12
	Period *int64 `json:"period,omitempty" xml:"period,omitempty" require:"true"`
	// 当前期数
	// example:
	//
	// 12
	CurPeriod *int64 `json:"cur_period,omitempty" xml:"cur_period,omitempty" require:"true"`
	// 还款方式1：等额本息，2：等额本金，3：按月付息到期还本，4：利随本清，5：自由还款
	// example:
	//
	// 1
	RepayType *string `json:"repay_type,omitempty" xml:"repay_type,omitempty" require:"true"`
	// 还款日
	// example:
	//
	// XXXX.XX.XX
	RepayDate *string `json:"repay_date,omitempty" xml:"repay_date,omitempty" require:"true"`
	// 放款时间
	// example:
	//
	// 2018-10-10T10:10:00Z
	LoanTime *string `json:"loan_time,omitempty" xml:"loan_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 借据状态0：未还清，1：已还清，2：已提前还清
	// example:
	//
	// 0
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 已还本金
	// example:
	//
	// 1234
	AlreadyCorpus *int64 `json:"already_corpus,omitempty" xml:"already_corpus,omitempty" require:"true"`
	// 已还利息
	// example:
	//
	// 50
	AlreadyAccrual *int64 `json:"already_accrual,omitempty" xml:"already_accrual,omitempty" require:"true"`
	// 结清日期
	// example:
	//
	// 2018-10-10T10:10:00Z
	AlreadyDate *string `json:"already_date,omitempty" xml:"already_date,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 审批状态0：通过 1：拒绝 2：审批中 3：失败
	// example:
	//
	// 0
	WorkflowStatus *string `json:"workflow_status,omitempty" xml:"workflow_status,omitempty" require:"true"`
	// 借据编号
	// example:
	//
	// 145785
	ReceiptNo *string `json:"receipt_no,omitempty" xml:"receipt_no,omitempty" require:"true"`
	// 放款状态(0：放款成功 1：放款失败 2：放款异常 3：放款中）
	// example:
	//
	// 0
	LoanStatus *string `json:"loan_status,omitempty" xml:"loan_status,omitempty"`
	// 业务类型 1：现金贷（默认）、2：分期付
	// example:
	//
	// 1
	ProdType *string `json:"prod_type,omitempty" xml:"prod_type,omitempty"`
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

func (s *ReceiptInfo) SetLoanStatus(v string) *ReceiptInfo {
	s.LoanStatus = &v
	return s
}

func (s *ReceiptInfo) SetProdType(v string) *ReceiptInfo {
	s.ProdType = &v
	return s
}

// 天枢系统专用RepayRef结构体
type RepayRef struct {
	// 客户编码
	// example:
	//
	// xxx
	CustomNo *string `json:"custom_no,omitempty" xml:"custom_no,omitempty" require:"true"`
	// 当前期数
	// example:
	//
	// xx
	Period *string `json:"period,omitempty" xml:"period,omitempty" require:"true"`
	// 应还总额
	// example:
	//
	// 1
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
	// example:
	//
	// xx
	ReceiptNo *string `json:"receipt_no,omitempty" xml:"receipt_no,omitempty" require:"true"`
	// 还款状态1：已还清 2 未还 3 部分还款
	// example:
	//
	// 1
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 应还日期
	// example:
	//
	// 2018-10-10T10:10:00Z
	SettleDate *string `json:"settle_date,omitempty" xml:"settle_date,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 还款日期
	// example:
	//
	// 2018-10-10T10:10:00Z
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
	// example:
	//
	// 123AA
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty" require:"true"`
	// 业务响应Json
	// example:
	//
	// {"a":"b"}
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
	// example:
	//
	// 广东省珠海市前山金鸡西路
	OperatingPlace *string `json:"operating_place,omitempty" xml:"operating_place,omitempty"`
	// 经营省份
	// example:
	//
	// 湖北省
	OperatingProvince *string `json:"operating_province,omitempty" xml:"operating_province,omitempty"`
	// 企业名称
	// example:
	//
	// 珠海格力电器股份有限公司
	OrgName *string `json:"org_name,omitempty" xml:"org_name,omitempty"`
	// 风险分数
	// example:
	//
	// 80
	RiskScore *int64 `json:"risk_score,omitempty" xml:"risk_score,omitempty"`
	// 风险标签
	// example:
	//
	// ["内部被投诉","法定代表人名下企业超过6家"]
	RiskTags []*string `json:"risk_tags,omitempty" xml:"risk_tags,omitempty" type:"Repeated"`
	// 风险线索
	RiskTagDetails []*RtopRiskTag `json:"risk_tag_details,omitempty" xml:"risk_tag_details,omitempty" type:"Repeated"`
	// 风险标签Id集合
	// example:
	//
	// ["CMN00025", "CMN00011"]
	RiskTagIds []*string `json:"risk_tag_ids,omitempty" xml:"risk_tag_ids,omitempty" type:"Repeated"`
	// 统一社会信用代码
	// example:
	//
	// 91440400192548256N
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
	// example:
	//
	// 1
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
	// example:
	//
	// 10
	Count *int `json:"count,omitempty" xml:"count,omitempty" require:"true"`
	// 年龄
	// example:
	//
	// 2018-09-09
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
	// example:
	//
	// 张三
	CustomName *string `json:"custom_name,omitempty" xml:"custom_name,omitempty" require:"true"`
	// 身份证号码(18位)
	// example:
	//
	// 1234555
	CardNo *string `json:"card_no,omitempty" xml:"card_no,omitempty" require:"true"`
	// 1-身份证
	// example:
	//
	// 1
	IdType *string `json:"id_type,omitempty" xml:"id_type,omitempty" require:"true"`
	// 证件开始日期(格式：YYYY-MM-DD)
	//
	// example:
	//
	// YYYY-MM-DD
	CertSignDate *string `json:"cert_sign_date,omitempty" xml:"cert_sign_date,omitempty" require:"true"`
	// 格式：YYYY-MM-DD，身份证有效期为长期的送: 9999-12-31
	// example:
	//
	// YYYY-MM-DD
	CertValidate *string `json:"cert_validate,omitempty" xml:"cert_validate,omitempty" require:"true"`
	// 证件地址
	// example:
	//
	// 浙江
	CertAdr *string `json:"cert_adr,omitempty" xml:"cert_adr,omitempty" require:"true"`
	// 手机号
	// example:
	//
	// 12344
	Mobile *string `json:"mobile,omitempty" xml:"mobile,omitempty" require:"true"`
	// 学历
	// example:
	//
	// 本科
	Education *string `json:"education,omitempty" xml:"education,omitempty"`
	// 所在省份 汉字
	// example:
	//
	// 浙江
	Province *string `json:"province,omitempty" xml:"province,omitempty"`
	// 所在城市 汉字
	// example:
	//
	// 杭州
	City *string `json:"city,omitempty" xml:"city,omitempty"`
	// 地区名称 汉字
	// example:
	//
	// xxx
	Area *string `json:"area,omitempty" xml:"area,omitempty"`
	// 详细地址
	// example:
	//
	// xxx
	Address *string `json:"address,omitempty" xml:"address,omitempty"`
	// 性别M-男
	// F-女
	// example:
	//
	// M
	Sex *string `json:"sex,omitempty" xml:"sex,omitempty"`
	// 民族
	// example:
	//
	// 汉
	Nation *string `json:"nation,omitempty" xml:"nation,omitempty"`
	// 婚姻状态：00-未婚，01-已婚，02-离婚，03-丧偶，99-未知
	// example:
	//
	// 00
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
	// example:
	//
	// 场景code
	SceneCode *string `json:"scene_code,omitempty" xml:"scene_code,omitempty" require:"true"`
	// 拒绝
	// example:
	//
	// reject
	SceneDecision *string `json:"scene_decision,omitempty" xml:"scene_decision,omitempty" require:"true"`
	// decision_flow
	// example:
	//
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
	// example:
	//
	// "186123456789"
	CustomerKey *string `json:"customer_key,omitempty" xml:"customer_key,omitempty" require:"true"`
	// 渠道参数
	// example:
	//
	// "{"name":"苹果","code":"5643","num":"5"}"
	ChannelParams *string `json:"channel_params,omitempty" xml:"channel_params,omitempty" require:"true"`
	// 用户透传字段
	// example:
	//
	// "[{"name":"zhangshan"}]"
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
	// example:
	//
	// 工商银行
	BankName *string `json:"bank_name,omitempty" xml:"bank_name,omitempty" require:"true"`
	// 银行编码
	// example:
	//
	// ICBC
	BankCode *string `json:"bank_code,omitempty" xml:"bank_code,omitempty" require:"true"`
	// 银行卡号
	// example:
	//
	// 6226211215645646
	BankCardNo *string `json:"bank_card_no,omitempty" xml:"bank_card_no,omitempty" require:"true"`
	// 是否已签约
	// example:
	//
	// Y/N
	Signed *string `json:"signed,omitempty" xml:"signed,omitempty"`
	// 是否为账户代扣银行卡
	// example:
	//
	// Y/N
	AcctBankCard *string `json:"acct_bank_card,omitempty" xml:"acct_bank_card,omitempty"`
	// 协议号
	// example:
	//
	// 202515300000000000000158463
	ProtocolNo *string `json:"protocol_no,omitempty" xml:"protocol_no,omitempty"`
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

func (s *CustomerBankCardInfo) SetProtocolNo(v string) *CustomerBankCardInfo {
	s.ProtocolNo = &v
	return s
}

// 期数费用
type InstallmentTrial struct {
	// 总期数
	// example:
	//
	// 12
	TotalPeriod *string `json:"total_period,omitempty" xml:"total_period,omitempty" require:"true"`
	// 分期应还总金额
	// example:
	//
	// 1999.98
	TotalAmount *int64 `json:"total_amount,omitempty" xml:"total_amount,omitempty" require:"true"`
	// 总利息（分期产生的利息/手续费）
	// example:
	//
	// 1999.98
	TotalFee *int64 `json:"total_fee,omitempty" xml:"total_fee,omitempty" require:"true"`
	// 期费率，精确到小数点后四位0.1250，表示年利率为12.5%
	// example:
	//
	// 0.1250
	FeeRate *int64 `json:"fee_rate,omitempty" xml:"fee_rate,omitempty" require:"true"`
	// 年利率，精确到小数点后四位0.1250，表示年利率为12.5%
	// example:
	//
	// 0.1250
	YearRate *int64 `json:"year_rate,omitempty" xml:"year_rate,omitempty" require:"true"`
	// 月供列表
	TermDetailList []*TermDetail `json:"term_detail_list,omitempty" xml:"term_detail_list,omitempty" require:"true" type:"Repeated"`
	// 是否最优标识
	// example:
	//
	// true, false
	Optimal *bool `json:"optimal,omitempty" xml:"optimal,omitempty"`
	// 总罚息
	// example:
	//
	// 1999.98
	TotalPenalty *int64 `json:"total_penalty,omitempty" xml:"total_penalty,omitempty"`
	// 总担保费
	// example:
	//
	// 1999.98
	TotalGuaranteeFee *int64 `json:"total_guarantee_fee,omitempty" xml:"total_guarantee_fee,omitempty"`
	// 总违约金
	// example:
	//
	// 1999.98
	TotalLiquidatedDamages *int64 `json:"total_liquidated_damages,omitempty" xml:"total_liquidated_damages,omitempty"`
	// 总服务费
	// example:
	//
	// 1999.98
	TotalServerFee *int64 `json:"total_server_fee,omitempty" xml:"total_server_fee,omitempty"`
	// 费率折扣，0.95：九五折；0：免息；1/null：不打折
	// example:
	//
	// 0.95
	Discount *int64 `json:"discount,omitempty" xml:"discount,omitempty"`
	// 总减免金额
	// example:
	//
	// 1999.98
	TotalDeductAmount *int64 `json:"total_deduct_amount,omitempty" xml:"total_deduct_amount,omitempty"`
}

func (s InstallmentTrial) String() string {
	return tea.Prettify(s)
}

func (s InstallmentTrial) GoString() string {
	return s.String()
}

func (s *InstallmentTrial) SetTotalPeriod(v string) *InstallmentTrial {
	s.TotalPeriod = &v
	return s
}

func (s *InstallmentTrial) SetTotalAmount(v int64) *InstallmentTrial {
	s.TotalAmount = &v
	return s
}

func (s *InstallmentTrial) SetTotalFee(v int64) *InstallmentTrial {
	s.TotalFee = &v
	return s
}

func (s *InstallmentTrial) SetFeeRate(v int64) *InstallmentTrial {
	s.FeeRate = &v
	return s
}

func (s *InstallmentTrial) SetYearRate(v int64) *InstallmentTrial {
	s.YearRate = &v
	return s
}

func (s *InstallmentTrial) SetTermDetailList(v []*TermDetail) *InstallmentTrial {
	s.TermDetailList = v
	return s
}

func (s *InstallmentTrial) SetOptimal(v bool) *InstallmentTrial {
	s.Optimal = &v
	return s
}

func (s *InstallmentTrial) SetTotalPenalty(v int64) *InstallmentTrial {
	s.TotalPenalty = &v
	return s
}

func (s *InstallmentTrial) SetTotalGuaranteeFee(v int64) *InstallmentTrial {
	s.TotalGuaranteeFee = &v
	return s
}

func (s *InstallmentTrial) SetTotalLiquidatedDamages(v int64) *InstallmentTrial {
	s.TotalLiquidatedDamages = &v
	return s
}

func (s *InstallmentTrial) SetTotalServerFee(v int64) *InstallmentTrial {
	s.TotalServerFee = &v
	return s
}

func (s *InstallmentTrial) SetDiscount(v int64) *InstallmentTrial {
	s.Discount = &v
	return s
}

func (s *InstallmentTrial) SetTotalDeductAmount(v int64) *InstallmentTrial {
	s.TotalDeductAmount = &v
	return s
}

// 天枢-电商-借据详情
type EcLoanDetail struct {
	// 借据号
	// example:
	//
	// ACCAL202301120798255316102054428
	LoanAcctNo *string `json:"loan_acct_no,omitempty" xml:"loan_acct_no,omitempty" require:"true"`
	// 贷款金额
	// example:
	//
	// 1.23
	LoanAmt *int64 `json:"loan_amt,omitempty" xml:"loan_amt,omitempty" require:"true"`
	// 贷款发放日
	// example:
	//
	// 2023/05/01
	LoanStartDate *string `json:"loan_start_date,omitempty" xml:"loan_start_date,omitempty" require:"true"`
	// 贷款到期日
	// example:
	//
	// 2023/05/01
	LoanEndDate *string `json:"loan_end_date,omitempty" xml:"loan_end_date,omitempty" require:"true"`
	// 利率类型
	// example:
	//
	// 1
	RateType *string `json:"rate_type,omitempty" xml:"rate_type,omitempty" require:"true"`
	// 利率单位
	// example:
	//
	// 1
	RateUnit *string `json:"rate_unit,omitempty" xml:"rate_unit,omitempty" require:"true"`
	// 贷款利率 年化利率(%)
	// example:
	//
	// 1.23
	LoanIntRate *string `json:"loan_int_rate,omitempty" xml:"loan_int_rate,omitempty" require:"true"`
	// 当前剩余本金
	// example:
	//
	// 1.23
	CurrRemainCorpus *string `json:"curr_remain_corpus,omitempty" xml:"curr_remain_corpus,omitempty" require:"true"`
	// 还款方式
	// example:
	//
	// 1
	LoanRepayType *string `json:"loan_repay_type,omitempty" xml:"loan_repay_type,omitempty" require:"true"`
	// 最后一次计息日
	// example:
	//
	// 2023/05/01
	LastCountIntDate *string `json:"last_count_int_date,omitempty" xml:"last_count_int_date,omitempty" require:"true"`
	// 当前期数
	// example:
	//
	// 25
	CurrentTerm *string `json:"current_term,omitempty" xml:"current_term,omitempty" require:"true"`
	// 当期应还日期
	// example:
	//
	// 2023/05/01
	CurRepayDay *string `json:"cur_repay_day,omitempty" xml:"cur_repay_day,omitempty" require:"true"`
	// 对应期次应还金额
	// example:
	//
	// 1.23
	CurRemainAmt *int64 `json:"cur_remain_amt,omitempty" xml:"cur_remain_amt,omitempty" require:"true"`
	// 当期已还总额
	// example:
	//
	// 1.23
	CurrentPaidAmt *int64 `json:"current_paid_amt,omitempty" xml:"current_paid_amt,omitempty" require:"true"`
	// 对应期次应还本金
	// example:
	//
	// 1.23
	CurPrincipalAmount *int64 `json:"cur_principal_amount,omitempty" xml:"cur_principal_amount,omitempty" require:"true"`
	// 对应期次已还本金
	// example:
	//
	// 1.23
	ActPrincipalAmount *int64 `json:"act_principal_amount,omitempty" xml:"act_principal_amount,omitempty" require:"true"`
	// 对应期次应还利息
	// example:
	//
	// 1.23
	CurInterestAmount *int64 `json:"cur_interest_amount,omitempty" xml:"cur_interest_amount,omitempty" require:"true"`
	// 对应期次已还利息
	// example:
	//
	// 1.23
	ActInterestAmount *int64 `json:"act_interest_amount,omitempty" xml:"act_interest_amount,omitempty" require:"true"`
	// 对应期次应还正常利息
	// example:
	//
	// 1.23
	CurNormalInterestAmt *int64 `json:"cur_normal_interest_amt,omitempty" xml:"cur_normal_interest_amt,omitempty" require:"true"`
	// 对应期次已还正常利息
	// example:
	//
	// 1.23
	ActCurNormalInterestAmt *int64 `json:"act_cur_normal_interest_amt,omitempty" xml:"act_cur_normal_interest_amt,omitempty" require:"true"`
	// 对应期次应还罚息
	// example:
	//
	// 1.23
	CurPrincipalPenaltyAmt *int64 `json:"cur_principal_penalty_amt,omitempty" xml:"cur_principal_penalty_amt,omitempty" require:"true"`
	// 对应期次已还罚息
	// example:
	//
	// 1.23
	ActCurPrincipalPenaltyAmt *int64 `json:"act_cur_principal_penalty_amt,omitempty" xml:"act_cur_principal_penalty_amt,omitempty" require:"true"`
	// 对应期次应还复利
	// example:
	//
	// 1.23
	CurInterestPenaltyAmt *int64 `json:"cur_interest_penalty_amt,omitempty" xml:"cur_interest_penalty_amt,omitempty" require:"true"`
	// 对应期次已还复利
	// example:
	//
	// 1.23
	ActCurInterestPenaltyAmt *int64 `json:"act_cur_interest_penalty_amt,omitempty" xml:"act_cur_interest_penalty_amt,omitempty" require:"true"`
	// 总期数
	// example:
	//
	// 1
	TotalNum *string `json:"total_num,omitempty" xml:"total_num,omitempty" require:"true"`
	// 借据状态
	// example:
	//
	// 1
	LoanStatus *string `json:"loan_status,omitempty" xml:"loan_status,omitempty" require:"true"`
	// 总欠款本息
	// example:
	//
	// 1.23
	TotalOweCorpusInterest *string `json:"total_owe_corpus_interest,omitempty" xml:"total_owe_corpus_interest,omitempty" require:"true"`
}

func (s EcLoanDetail) String() string {
	return tea.Prettify(s)
}

func (s EcLoanDetail) GoString() string {
	return s.String()
}

func (s *EcLoanDetail) SetLoanAcctNo(v string) *EcLoanDetail {
	s.LoanAcctNo = &v
	return s
}

func (s *EcLoanDetail) SetLoanAmt(v int64) *EcLoanDetail {
	s.LoanAmt = &v
	return s
}

func (s *EcLoanDetail) SetLoanStartDate(v string) *EcLoanDetail {
	s.LoanStartDate = &v
	return s
}

func (s *EcLoanDetail) SetLoanEndDate(v string) *EcLoanDetail {
	s.LoanEndDate = &v
	return s
}

func (s *EcLoanDetail) SetRateType(v string) *EcLoanDetail {
	s.RateType = &v
	return s
}

func (s *EcLoanDetail) SetRateUnit(v string) *EcLoanDetail {
	s.RateUnit = &v
	return s
}

func (s *EcLoanDetail) SetLoanIntRate(v string) *EcLoanDetail {
	s.LoanIntRate = &v
	return s
}

func (s *EcLoanDetail) SetCurrRemainCorpus(v string) *EcLoanDetail {
	s.CurrRemainCorpus = &v
	return s
}

func (s *EcLoanDetail) SetLoanRepayType(v string) *EcLoanDetail {
	s.LoanRepayType = &v
	return s
}

func (s *EcLoanDetail) SetLastCountIntDate(v string) *EcLoanDetail {
	s.LastCountIntDate = &v
	return s
}

func (s *EcLoanDetail) SetCurrentTerm(v string) *EcLoanDetail {
	s.CurrentTerm = &v
	return s
}

func (s *EcLoanDetail) SetCurRepayDay(v string) *EcLoanDetail {
	s.CurRepayDay = &v
	return s
}

func (s *EcLoanDetail) SetCurRemainAmt(v int64) *EcLoanDetail {
	s.CurRemainAmt = &v
	return s
}

func (s *EcLoanDetail) SetCurrentPaidAmt(v int64) *EcLoanDetail {
	s.CurrentPaidAmt = &v
	return s
}

func (s *EcLoanDetail) SetCurPrincipalAmount(v int64) *EcLoanDetail {
	s.CurPrincipalAmount = &v
	return s
}

func (s *EcLoanDetail) SetActPrincipalAmount(v int64) *EcLoanDetail {
	s.ActPrincipalAmount = &v
	return s
}

func (s *EcLoanDetail) SetCurInterestAmount(v int64) *EcLoanDetail {
	s.CurInterestAmount = &v
	return s
}

func (s *EcLoanDetail) SetActInterestAmount(v int64) *EcLoanDetail {
	s.ActInterestAmount = &v
	return s
}

func (s *EcLoanDetail) SetCurNormalInterestAmt(v int64) *EcLoanDetail {
	s.CurNormalInterestAmt = &v
	return s
}

func (s *EcLoanDetail) SetActCurNormalInterestAmt(v int64) *EcLoanDetail {
	s.ActCurNormalInterestAmt = &v
	return s
}

func (s *EcLoanDetail) SetCurPrincipalPenaltyAmt(v int64) *EcLoanDetail {
	s.CurPrincipalPenaltyAmt = &v
	return s
}

func (s *EcLoanDetail) SetActCurPrincipalPenaltyAmt(v int64) *EcLoanDetail {
	s.ActCurPrincipalPenaltyAmt = &v
	return s
}

func (s *EcLoanDetail) SetCurInterestPenaltyAmt(v int64) *EcLoanDetail {
	s.CurInterestPenaltyAmt = &v
	return s
}

func (s *EcLoanDetail) SetActCurInterestPenaltyAmt(v int64) *EcLoanDetail {
	s.ActCurInterestPenaltyAmt = &v
	return s
}

func (s *EcLoanDetail) SetTotalNum(v string) *EcLoanDetail {
	s.TotalNum = &v
	return s
}

func (s *EcLoanDetail) SetLoanStatus(v string) *EcLoanDetail {
	s.LoanStatus = &v
	return s
}

func (s *EcLoanDetail) SetTotalOweCorpusInterest(v string) *EcLoanDetail {
	s.TotalOweCorpusInterest = &v
	return s
}

// 营销盾离线圈客执行批次信息
type UmktOfflineDecisionTaskExecBatchInfo struct {
	// 执行批次
	// example:
	//
	// 202501011930
	ExecBatch *string `json:"exec_batch,omitempty" xml:"exec_batch,omitempty" require:"true"`
	// 批次下任务列表
	OfflineDecisionTaskDetailInfoList []*UmktOfflineDecisionTaskDetailInfo `json:"offline_decision_task_detail_info_list,omitempty" xml:"offline_decision_task_detail_info_list,omitempty" require:"true" type:"Repeated"`
}

func (s UmktOfflineDecisionTaskExecBatchInfo) String() string {
	return tea.Prettify(s)
}

func (s UmktOfflineDecisionTaskExecBatchInfo) GoString() string {
	return s.String()
}

func (s *UmktOfflineDecisionTaskExecBatchInfo) SetExecBatch(v string) *UmktOfflineDecisionTaskExecBatchInfo {
	s.ExecBatch = &v
	return s
}

func (s *UmktOfflineDecisionTaskExecBatchInfo) SetOfflineDecisionTaskDetailInfoList(v []*UmktOfflineDecisionTaskDetailInfo) *UmktOfflineDecisionTaskExecBatchInfo {
	s.OfflineDecisionTaskDetailInfoList = v
	return s
}

// 供应商
type Supplier struct {
	// 供应商id
	// example:
	//
	// 111
	SupplierId *string `json:"supplier_id,omitempty" xml:"supplier_id,omitempty" require:"true"`
	// 供应商名字
	// example:
	//
	// ANTCLOUD
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
	// example:
	//
	// key
	Key *string `json:"key,omitempty" xml:"key,omitempty"`
	// value
	// example:
	//
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
	// example:
	//
	// true
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
	// example:
	//
	// R2022xxxxxx
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
	// example:
	//
	// true, false
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
	// example:
	//
	// 决策指标id
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 决策服务id
	// example:
	//
	// 700002
	ServiceId *string `json:"service_id,omitempty" xml:"service_id,omitempty" require:"true"`
	// 属性名
	// example:
	//
	// weight
	PropertyName *string `json:"property_name,omitempty" xml:"property_name,omitempty" require:"true"`
	// 属性值或指标值
	// example:
	//
	// 100
	PropertyValue *string `json:"property_value,omitempty" xml:"property_value,omitempty"`
	// 决策租户
	// example:
	//
	// DEFAULT
	DecisionTenant *string `json:"decision_tenant,omitempty" xml:"decision_tenant,omitempty"`
	// 创建时间，格式:yyyy-MM-dd HH:mm:ss
	// example:
	//
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
	// example:
	//
	// 授信协议
	Title *string `json:"title,omitempty" xml:"title,omitempty" require:"true"`
	// 协议地址
	// example:
	//
	// http:xxxxxxxx
	AgreementUrl *string `json:"agreement_url,omitempty" xml:"agreement_url,omitempty"`
	// 协议文件Base64
	// example:
	//
	// 111
	FileBase64 *string `json:"file_base64,omitempty" xml:"file_base64,omitempty"`
	// 协议图片文件base64集合
	// example:
	//
	// 111111
	PicFileBase64List []*string `json:"pic_file_base64_list,omitempty" xml:"pic_file_base64_list,omitempty" type:"Repeated"`
	// 图片文件oss集合
	PicOssPathList []*string `json:"pic_oss_path_list,omitempty" xml:"pic_oss_path_list,omitempty" type:"Repeated"`
	// 机构名称
	// example:
	//
	// 杭银
	OrganizationName *string `json:"organization_name,omitempty" xml:"organization_name,omitempty" require:"true"`
	// 协议类型-code
	// example:
	//
	// APPLY
	FileType *string `json:"file_type,omitempty" xml:"file_type,omitempty" require:"true"`
	// 协议类型-名称
	// example:
	//
	// 授信协议
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

// 贷后异常监控
type LoanMonitorCust struct {
	// 合同编号
	// example:
	//
	// CONT20230314000000143225
	ContractNo *string `json:"contract_no,omitempty" xml:"contract_no,omitempty" require:"true"`
	// 商户GMV 单位：元
	// example:
	//
	// 5000000.00
	GrossMercVolume *string `json:"gross_merc_volume,omitempty" xml:"gross_merc_volume,omitempty" require:"true"`
	// 实际销售结算金额 单位：元，格式：数字，小数点后两位
	// example:
	//
	// 5000000.00
	ActSaleAmt *string `json:"act_sale_amt,omitempty" xml:"act_sale_amt,omitempty" require:"true"`
	// 退货率 单位：%
	// example:
	//
	// 20
	ReturnRate *string `json:"return_rate,omitempty" xml:"return_rate,omitempty" require:"true"`
	// 已发货未收款金额 单位：元，格式：数字，小数点后两位
	// example:
	//
	// 5000000.00
	AccountsReceivable *string `json:"accounts_receivable,omitempty" xml:"accounts_receivable,omitempty" require:"true"`
}

func (s LoanMonitorCust) String() string {
	return tea.Prettify(s)
}

func (s LoanMonitorCust) GoString() string {
	return s.String()
}

func (s *LoanMonitorCust) SetContractNo(v string) *LoanMonitorCust {
	s.ContractNo = &v
	return s
}

func (s *LoanMonitorCust) SetGrossMercVolume(v string) *LoanMonitorCust {
	s.GrossMercVolume = &v
	return s
}

func (s *LoanMonitorCust) SetActSaleAmt(v string) *LoanMonitorCust {
	s.ActSaleAmt = &v
	return s
}

func (s *LoanMonitorCust) SetReturnRate(v string) *LoanMonitorCust {
	s.ReturnRate = &v
	return s
}

func (s *LoanMonitorCust) SetAccountsReceivable(v string) *LoanMonitorCust {
	s.AccountsReceivable = &v
	return s
}

// 天枢-电商-企业信息
type EcEnterpriseInfo struct {
	// 企业名称
	// example:
	//
	// 张三的贸易有限公司
	EntName *string `json:"ent_name,omitempty" xml:"ent_name,omitempty" require:"true"`
	// 申请企业证件类型
	// example:
	//
	// Ent04
	EntIdType *string `json:"ent_id_type,omitempty" xml:"ent_id_type,omitempty" require:"true"`
	// 客户企业的统一社会信用代码，有企业信息则必输
	// example:
	//
	// 91234500123400000R
	EntIdNo *string `json:"ent_id_no,omitempty" xml:"ent_id_no,omitempty" require:"true"`
}

func (s EcEnterpriseInfo) String() string {
	return tea.Prettify(s)
}

func (s EcEnterpriseInfo) GoString() string {
	return s.String()
}

func (s *EcEnterpriseInfo) SetEntName(v string) *EcEnterpriseInfo {
	s.EntName = &v
	return s
}

func (s *EcEnterpriseInfo) SetEntIdType(v string) *EcEnterpriseInfo {
	s.EntIdType = &v
	return s
}

func (s *EcEnterpriseInfo) SetEntIdNo(v string) *EcEnterpriseInfo {
	s.EntIdNo = &v
	return s
}

// 机构平台通知响应结果
type DefinInnerChannelNotifyResult struct {
	// 请求编号
	// example:
	//
	// aaaa
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty" require:"true"`
	// 业务响应Json
	// example:
	//
	// {"a":"b"}
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

// 门店信息
type StoreInfo struct {
	// 品牌
	// example:
	//
	// xxx
	StoreBrand *string `json:"store_brand,omitempty" xml:"store_brand,omitempty" require:"true"`
	// 品牌，商户入驻时需填写，
	// TBJHF: 赛鸽出行
	// AIJNBJ: 智迈电动车
	// KJOKJBO: 金箭出行
	// IFJRJTIJ: 骑士智行
	// KVMPOH: 巨龙智行
	// NPGBRVBO: 摩生态A
	// example:
	//
	// IFJRJTIJ
	TrafficPlatform *string `json:"traffic_platform,omitempty" xml:"traffic_platform,omitempty"`
	// 门店ID
	// example:
	//
	// xxxx
	StoreId *string `json:"store_id,omitempty" xml:"store_id,omitempty" require:"true"`
	// 门店名称
	// example:
	//
	// xxxx
	StoreName *string `json:"store_name,omitempty" xml:"store_name,omitempty" require:"true"`
	// 统一社会信用代码
	// example:
	//
	// xxx
	Usci *string `json:"usci,omitempty" xml:"usci,omitempty" require:"true"`
	// 门店-省，浙江省
	// example:
	//
	// 浙江省
	Province *string `json:"province,omitempty" xml:"province,omitempty" require:"true"`
	// 省编码
	// example:
	//
	// 100001
	ProvinceCode *string `json:"province_code,omitempty" xml:"province_code,omitempty"`
	// 门店-市，杭州市
	// example:
	//
	// 杭州市
	City *string `json:"city,omitempty" xml:"city,omitempty" require:"true"`
	// 市编码
	// example:
	//
	// xxxx
	CityCode *string `json:"city_code,omitempty" xml:"city_code,omitempty"`
	// 门店-区，滨江区
	// example:
	//
	// 滨江区
	District *string `json:"district,omitempty" xml:"district,omitempty" require:"true"`
	// 区编码
	// example:
	//
	// xxx
	DistrictCode *string `json:"district_code,omitempty" xml:"district_code,omitempty"`
	// 门店-详细地址，
	// 望江路万达广场一层001号
	// example:
	//
	// 望江路万达广场一层001号
	Address *string `json:"address,omitempty" xml:"address,omitempty" require:"true"`
	// 门店-经度
	// example:
	//
	// xxxx
	Longitude *string `json:"longitude,omitempty" xml:"longitude,omitempty"`
	// 门店-纬度
	// example:
	//
	// xxxx
	Latitude *string `json:"latitude,omitempty" xml:"latitude,omitempty"`
	// 营业执照-开始时间，yyyy-MM-dd
	// example:
	//
	// yyyy-MM-dd
	StoreStartDate *string `json:"store_start_date,omitempty" xml:"store_start_date,omitempty" require:"true"`
	// 营业执照-结束时间，yyyy-MM-dd，长期上送：9999-12-31
	// example:
	//
	// yyyy-MM-dd
	StoreEndDate *string `json:"store_end_date,omitempty" xml:"store_end_date,omitempty" require:"true"`
	// 门店类型，
	// 个体: 个体工商户；企业
	// example:
	//
	// 个体
	StoreType *string `json:"store_type,omitempty" xml:"store_type,omitempty" require:"true"`
	// 法人-姓名
	// example:
	//
	// xxx
	LegalPersonName *string `json:"legal_person_name,omitempty" xml:"legal_person_name,omitempty" require:"true"`
	// 法人-身份证号
	// example:
	//
	// xxx
	LegalPersonIdCard *string `json:"legal_person_id_card,omitempty" xml:"legal_person_id_card,omitempty" require:"true"`
	// 法人-手机号
	// example:
	//
	// xxx
	LegalPersonMobile *string `json:"legal_person_mobile,omitempty" xml:"legal_person_mobile,omitempty" require:"true"`
	// 法人-身份证有效期，，身份证反面格式：如yyyy.MM.dd-长期
	// example:
	//
	// yyyy.MM.dd-长期
	EffectiveDate *string `json:"effective_date,omitempty" xml:"effective_date,omitempty" require:"true"`
	// 对公-开户行名称
	// example:
	//
	// xxx
	BankName *string `json:"bank_name,omitempty" xml:"bank_name,omitempty"`
	// 对公-开户行编码
	// example:
	//
	// ICBC
	BankCode *string `json:"bank_code,omitempty" xml:"bank_code,omitempty"`
	// 对公-支行名称
	// example:
	//
	// xxx
	BranchName *string `json:"branch_name,omitempty" xml:"branch_name,omitempty"`
	// 对公-联行号
	// example:
	//
	// xxx
	CnapsCode *string `json:"cnaps_code,omitempty" xml:"cnaps_code,omitempty"`
	// 对公-银行账户名称
	// example:
	//
	// xxx
	AccountName *string `json:"account_name,omitempty" xml:"account_name,omitempty"`
	// 对公-银行账户号
	// example:
	//
	// xxx
	AccountNumber *string `json:"account_number,omitempty" xml:"account_number,omitempty"`
	// 对公-开户行所在省，浙江
	// example:
	//
	// 浙江
	BankProvince *string `json:"bank_province,omitempty" xml:"bank_province,omitempty"`
	// 对公-开户行所在市，杭州
	// example:
	//
	// 杭州
	BankCity *string `json:"bank_city,omitempty" xml:"bank_city,omitempty"`
	// 对私-银行卡号
	// example:
	//
	// xxxx
	PayeeBankCard *string `json:"payee_bank_card,omitempty" xml:"payee_bank_card,omitempty"`
	// 对私-银行名称
	// example:
	//
	// xxx
	PayeeBankName *string `json:"payee_bank_name,omitempty" xml:"payee_bank_name,omitempty"`
	// 对私-银行编码
	// example:
	//
	// ICBC
	PayeeBankCode *string `json:"payee_bank_code,omitempty" xml:"payee_bank_code,omitempty"`
	// 蚂蚁数科入驻账号
	// example:
	//
	// xxxx
	LoginTenant *string `json:"login_tenant,omitempty" xml:"login_tenant,omitempty"`
	// 入驻时间
	// example:
	//
	// yyyy-MM-dd
	LoginDate *string `json:"login_date,omitempty" xml:"login_date,omitempty"`
	// 结算支付宝账户，交易资金结算的具体支付宝账号，商户入驻时必填
	// example:
	//
	// xxxx@126.com
	AlipayLogonId *string `json:"alipay_logon_id,omitempty" xml:"alipay_logon_id,omitempty"`
	// 支付宝openId
	// example:
	//
	// xxxx
	InfoSourceOpenId *string `json:"info_source_open_id,omitempty" xml:"info_source_open_id,omitempty"`
	// 签约支付宝账户，商户入驻时必填（接收支付宝下发的签约协议）
	// example:
	//
	// xxx
	BindingAlipayLogonId *string `json:"binding_alipay_logon_id,omitempty" xml:"binding_alipay_logon_id,omitempty"`
}

func (s StoreInfo) String() string {
	return tea.Prettify(s)
}

func (s StoreInfo) GoString() string {
	return s.String()
}

func (s *StoreInfo) SetStoreBrand(v string) *StoreInfo {
	s.StoreBrand = &v
	return s
}

func (s *StoreInfo) SetTrafficPlatform(v string) *StoreInfo {
	s.TrafficPlatform = &v
	return s
}

func (s *StoreInfo) SetStoreId(v string) *StoreInfo {
	s.StoreId = &v
	return s
}

func (s *StoreInfo) SetStoreName(v string) *StoreInfo {
	s.StoreName = &v
	return s
}

func (s *StoreInfo) SetUsci(v string) *StoreInfo {
	s.Usci = &v
	return s
}

func (s *StoreInfo) SetProvince(v string) *StoreInfo {
	s.Province = &v
	return s
}

func (s *StoreInfo) SetProvinceCode(v string) *StoreInfo {
	s.ProvinceCode = &v
	return s
}

func (s *StoreInfo) SetCity(v string) *StoreInfo {
	s.City = &v
	return s
}

func (s *StoreInfo) SetCityCode(v string) *StoreInfo {
	s.CityCode = &v
	return s
}

func (s *StoreInfo) SetDistrict(v string) *StoreInfo {
	s.District = &v
	return s
}

func (s *StoreInfo) SetDistrictCode(v string) *StoreInfo {
	s.DistrictCode = &v
	return s
}

func (s *StoreInfo) SetAddress(v string) *StoreInfo {
	s.Address = &v
	return s
}

func (s *StoreInfo) SetLongitude(v string) *StoreInfo {
	s.Longitude = &v
	return s
}

func (s *StoreInfo) SetLatitude(v string) *StoreInfo {
	s.Latitude = &v
	return s
}

func (s *StoreInfo) SetStoreStartDate(v string) *StoreInfo {
	s.StoreStartDate = &v
	return s
}

func (s *StoreInfo) SetStoreEndDate(v string) *StoreInfo {
	s.StoreEndDate = &v
	return s
}

func (s *StoreInfo) SetStoreType(v string) *StoreInfo {
	s.StoreType = &v
	return s
}

func (s *StoreInfo) SetLegalPersonName(v string) *StoreInfo {
	s.LegalPersonName = &v
	return s
}

func (s *StoreInfo) SetLegalPersonIdCard(v string) *StoreInfo {
	s.LegalPersonIdCard = &v
	return s
}

func (s *StoreInfo) SetLegalPersonMobile(v string) *StoreInfo {
	s.LegalPersonMobile = &v
	return s
}

func (s *StoreInfo) SetEffectiveDate(v string) *StoreInfo {
	s.EffectiveDate = &v
	return s
}

func (s *StoreInfo) SetBankName(v string) *StoreInfo {
	s.BankName = &v
	return s
}

func (s *StoreInfo) SetBankCode(v string) *StoreInfo {
	s.BankCode = &v
	return s
}

func (s *StoreInfo) SetBranchName(v string) *StoreInfo {
	s.BranchName = &v
	return s
}

func (s *StoreInfo) SetCnapsCode(v string) *StoreInfo {
	s.CnapsCode = &v
	return s
}

func (s *StoreInfo) SetAccountName(v string) *StoreInfo {
	s.AccountName = &v
	return s
}

func (s *StoreInfo) SetAccountNumber(v string) *StoreInfo {
	s.AccountNumber = &v
	return s
}

func (s *StoreInfo) SetBankProvince(v string) *StoreInfo {
	s.BankProvince = &v
	return s
}

func (s *StoreInfo) SetBankCity(v string) *StoreInfo {
	s.BankCity = &v
	return s
}

func (s *StoreInfo) SetPayeeBankCard(v string) *StoreInfo {
	s.PayeeBankCard = &v
	return s
}

func (s *StoreInfo) SetPayeeBankName(v string) *StoreInfo {
	s.PayeeBankName = &v
	return s
}

func (s *StoreInfo) SetPayeeBankCode(v string) *StoreInfo {
	s.PayeeBankCode = &v
	return s
}

func (s *StoreInfo) SetLoginTenant(v string) *StoreInfo {
	s.LoginTenant = &v
	return s
}

func (s *StoreInfo) SetLoginDate(v string) *StoreInfo {
	s.LoginDate = &v
	return s
}

func (s *StoreInfo) SetAlipayLogonId(v string) *StoreInfo {
	s.AlipayLogonId = &v
	return s
}

func (s *StoreInfo) SetInfoSourceOpenId(v string) *StoreInfo {
	s.InfoSourceOpenId = &v
	return s
}

func (s *StoreInfo) SetBindingAlipayLogonId(v string) *StoreInfo {
	s.BindingAlipayLogonId = &v
	return s
}

// 批量回溯结果内容
type ResultItem struct {
	// dataId
	// example:
	//
	// 46052e46721417297df682ef88a8ab91
	DataId *string `json:"data_id,omitempty" xml:"data_id,omitempty" require:"true"`
	// 分值
	// example:
	//
	// 0.32223
	Score *string `json:"score,omitempty" xml:"score,omitempty" require:"true"`
	// 特征值
	// example:
	//
	// {"feature1":0.223,"feature2":0.33,"feature3":0.323}
	FeatureJson *string `json:"feature_json,omitempty" xml:"feature_json,omitempty"`
	// 单调样本数据处理结果
	// 初始化/处理中/成功/失败
	// example:
	//
	// INIT/PROCESS/SUCCESS/FAIL
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 各个子分
	// example:
	//
	// {"score1":0.22233,"score2":0.34234,"score3":0.34343}
	ScoreJson *string `json:"score_json,omitempty" xml:"score_json,omitempty" require:"true"`
}

func (s ResultItem) String() string {
	return tea.Prettify(s)
}

func (s ResultItem) GoString() string {
	return s.String()
}

func (s *ResultItem) SetDataId(v string) *ResultItem {
	s.DataId = &v
	return s
}

func (s *ResultItem) SetScore(v string) *ResultItem {
	s.Score = &v
	return s
}

func (s *ResultItem) SetFeatureJson(v string) *ResultItem {
	s.FeatureJson = &v
	return s
}

func (s *ResultItem) SetStatus(v string) *ResultItem {
	s.Status = &v
	return s
}

func (s *ResultItem) SetScoreJson(v string) *ResultItem {
	s.ScoreJson = &v
	return s
}

// 批量决策单主体查询结果
type BatchQueryResult struct {
	// 查询主体
	// example:
	//
	// test
	QueryKey *string `json:"query_key,omitempty" xml:"query_key,omitempty" require:"true"`
	// 单用户决策结果
	// example:
	//
	// accept
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
	// example:
	//
	// 请求透传字段
	ExtInfo *string `json:"ext_info,omitempty" xml:"ext_info,omitempty" require:"true"`
	// 成功触达：OK；未触达：AI_ROBOT_CALL_REQUEST_NOT_EXIST
	// example:
	//
	// OK
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty" require:"true"`
	// 外呼号码
	// example:
	//
	// 130XXXXXX
	CustomerKey *string `json:"customer_key,omitempty" xml:"customer_key,omitempty" require:"true"`
	// 呼叫次数
	// example:
	//
	// 1
	CurrentCallTimes *int64 `json:"current_call_times,omitempty" xml:"current_call_times,omitempty" require:"true"`
	// 号码模版
	// example:
	//
	// MOBILE/MOBILE/CUSTOMER_ENCRY
	KeyTemplate *string `json:"key_template,omitempty" xml:"key_template,omitempty" require:"true"`
	// 导入号码时返回的批次号
	// example:
	//
	// 1
	BatchId *string `json:"batch_id,omitempty" xml:"batch_id,omitempty" require:"true"`
	// 2001:批量-预测外呼，2002:批量-AI外呼-不转人工，2003:批量-AI外呼-接通转人工，2004: 批量-AI外呼-智能转人工,2005:批量-语音通知
	// example:
	//
	// 2001
	CallType *int64 `json:"call_type,omitempty" xml:"call_type,omitempty" require:"true"`
	// 用户自定义标签
	// example:
	//
	// tag
	Tag *string `json:"tag,omitempty" xml:"tag,omitempty"`
	// 外呼id
	// example:
	//
	// 9b2eb6b8
	CallId *string `json:"call_id,omitempty" xml:"call_id,omitempty" require:"true"`
	// 外呼任务编号
	// example:
	//
	// 1
	TaskId *int64 `json:"task_id,omitempty" xml:"task_id,omitempty" require:"true"`
	// AI话术ID
	// example:
	//
	// 1
	TemplateId *int64 `json:"template_id,omitempty" xml:"template_id,omitempty"`
	// 外呼状态编码
	// example:
	//
	// 1
	StatusCode *int64 `json:"status_code,omitempty" xml:"status_code,omitempty" require:"true"`
	// 外呼状态描述
	// example:
	//
	// 1
	StatusDescription *string `json:"status_description,omitempty" xml:"status_description,omitempty" require:"true"`
	// 转人工状态编码
	// example:
	//
	// 1
	TransferStatusCode *int64 `json:"transfer_status_code,omitempty" xml:"transfer_status_code,omitempty" require:"true"`
	// 转人工状态
	// example:
	//
	// 0
	TransferStatus *string `json:"transfer_status,omitempty" xml:"transfer_status,omitempty" require:"true"`
	// 分配坐席ID
	AgentId *int64 `json:"agent_id,omitempty" xml:"agent_id,omitempty"`
	// 坐席在贵司业务系统唯一标识，用于查询对应agentId；可以为空。
	// example:
	//
	// a
	AgentTag *string `json:"agent_tag,omitempty" xml:"agent_tag,omitempty"`
	// 坐席分机号
	// example:
	//
	// a
	AgentExtension *string `json:"agent_extension,omitempty" xml:"agent_extension,omitempty"`
	// 导入时间
	// example:
	//
	// 2019-01-09 14:14:19
	ImportTime *string `json:"import_time,omitempty" xml:"import_time,omitempty" require:"true"`
	// 开始通话时间
	// example:
	//
	// 2019-01-09 14:14:19
	CallBeginTime *string `json:"call_begin_time,omitempty" xml:"call_begin_time,omitempty" require:"true"`
	// 振铃时长，单位ms
	// example:
	//
	// 10
	RingTime *int64 `json:"ring_time,omitempty" xml:"ring_time,omitempty" require:"true"`
	// 接通时间
	// example:
	//
	// 2019-01-09 14:14:19
	AnswerTime *string `json:"answer_time,omitempty" xml:"answer_time,omitempty"`
	// 通话时长，单位：大于1分钟，显示分钟秒，小于1分钟，显示秒
	// example:
	//
	// 1
	SpeakingTime *string `json:"speaking_time,omitempty" xml:"speaking_time,omitempty" require:"true"`
	// 通话时长，单位：秒
	// example:
	//
	// 1
	SpeakingDuration *int64 `json:"speaking_duration,omitempty" xml:"speaking_duration,omitempty" require:"true"`
	// 挂断时间
	// example:
	//
	// 2019-01-09 14:14:19
	HangupTime *string `json:"hangup_time,omitempty" xml:"hangup_time,omitempty" require:"true"`
	// 对话轮次
	// example:
	//
	// 1
	SpeakingTurns *int64 `json:"speaking_turns,omitempty" xml:"speaking_turns,omitempty" require:"true"`
	// 人工通话时长，单位：大于1分钟，显示分钟秒，小于1分钟，显示秒
	// example:
	//
	// 1
	AgentSpeakingTime *string `json:"agent_speaking_time,omitempty" xml:"agent_speaking_time,omitempty" require:"true"`
	// 人工通话时长，单位：秒
	// example:
	//
	// 1
	AgentSpeakingDuration *int64 `json:"agent_speaking_duration,omitempty" xml:"agent_speaking_duration,omitempty" require:"true"`
	// 意向标签
	// example:
	//
	// C
	IntentTag *string `json:"intent_tag,omitempty" xml:"intent_tag,omitempty" require:"true"`
	// 意向说明
	// example:
	//
	// 确认本人,未承诺还款
	IntentDescription *string `json:"intent_description,omitempty" xml:"intent_description,omitempty" require:"true"`
	// 个性标签
	// example:
	//
	// 投诉,非本人
	IndividualTag *string `json:"individual_tag,omitempty" xml:"individual_tag,omitempty"`
	// 回复关键词
	// example:
	//
	// 链接,利息
	Keywords *string `json:"keywords,omitempty" xml:"keywords,omitempty"`
	// 挂机方式，AI挂机1，坐席挂机2，客户挂机3
	// example:
	//
	// 1
	HungupType *int64 `json:"hungup_type,omitempty" xml:"hungup_type,omitempty" require:"true"`
	// 挂机短信，可选值：1、2
	// 1:发送，2:不发送
	// example:
	//
	// 1
	Sms *string `json:"sms,omitempty" xml:"sms,omitempty" require:"true"`
	// 对话录音，URL，可以为空
	// example:
	//
	// 1
	ChatRecord *string `json:"chat_record,omitempty" xml:"chat_record,omitempty"`
	// 聊天记录，可以为空
	// example:
	//
	// {}
	Chats *string `json:"chats,omitempty" xml:"chats,omitempty"`
	// 可选值：0、1
	// 0:不添加，1:添加
	// example:
	//
	// 1
	AddWx *int64 `json:"add_wx,omitempty" xml:"add_wx,omitempty"`
	// 加微进度，可选值：已申请、加微成功
	// example:
	//
	// 已申请
	AddWxStatus *string `json:"add_wx_status,omitempty" xml:"add_wx_status,omitempty"`
	// 是否接通重呼，可选值：0、1
	// 0正常外呼，1接通重呼
	// example:
	//
	// 1
	AnswerRecall *int64 `json:"answer_recall,omitempty" xml:"answer_recall,omitempty" require:"true"`
	// 导入号码时的参数值
	// example:
	//
	// {"电话号码":"13100000000"}
	Properties *string `json:"properties,omitempty" xml:"properties,omitempty"`
	// 导入号码时的业务参数值，原样返回
	// example:
	//
	// a
	BizProperties *string `json:"biz_properties,omitempty" xml:"biz_properties,omitempty"`
	// 拦截原因：当状态为已拦截时，可选值：黑名单拦截，灰名单拦截，异常号码拦截
	// example:
	//
	// 黑名单拦截
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

// 商城订单信息
type GoodsOrderInfo struct {
	// 商城订单号
	// example:
	//
	// 2023343380112
	GoodsOrderNo *string `json:"goods_order_no,omitempty" xml:"goods_order_no,omitempty" require:"true"`
	// 消费金额
	// example:
	//
	// 1000.00
	Amount *string `json:"amount,omitempty" xml:"amount,omitempty" require:"true"`
}

func (s GoodsOrderInfo) String() string {
	return tea.Prettify(s)
}

func (s GoodsOrderInfo) GoString() string {
	return s.String()
}

func (s *GoodsOrderInfo) SetGoodsOrderNo(v string) *GoodsOrderInfo {
	s.GoodsOrderNo = &v
	return s
}

func (s *GoodsOrderInfo) SetAmount(v string) *GoodsOrderInfo {
	s.Amount = &v
	return s
}

// 支付方式锁定结果
type PayMethodLockResult struct {
	// 签约结果
	// example:
	//
	// 0、1
	SignStatus *string `json:"sign_status,omitempty" xml:"sign_status,omitempty" require:"true"`
	// 账号
	// example:
	//
	// userId
	AccountId *string `json:"account_id,omitempty" xml:"account_id,omitempty" require:"true"`
	// 登录号
	// example:
	//
	// userIdA
	LoginId *string `json:"login_id,omitempty" xml:"login_id,omitempty" require:"true"`
	// 支付公司
	// example:
	//
	// AliPay
	PayChannel *string `json:"pay_channel,omitempty" xml:"pay_channel,omitempty" require:"true"`
	// 绑定账号名称
	// example:
	//
	// someName
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
	// example:
	//
	// 123123
	RelationNo *string `json:"relation_no,omitempty" xml:"relation_no,omitempty" require:"true"`
	// 合同编号
	// example:
	//
	// 123123
	ContractNo *string `json:"contract_no,omitempty" xml:"contract_no,omitempty" require:"true"`
	// 合同名称
	// example:
	//
	// 用信合同
	ContractName *string `json:"contract_name,omitempty" xml:"contract_name,omitempty" require:"true"`
	// 合同类型
	// example:
	//
	// 0
	ContractType *string `json:"contract_type,omitempty" xml:"contract_type,omitempty" require:"true"`
	// 客户编号
	// example:
	//
	// PCM123xxxx
	CustomNo *string `json:"custom_no,omitempty" xml:"custom_no,omitempty" require:"true"`
	// 合同存放目录
	// example:
	//
	// https://11111
	SavePath *string `json:"save_path,omitempty" xml:"save_path,omitempty" require:"true"`
	// 合同金额
	ContractAmount *int64 `json:"contract_amount,omitempty" xml:"contract_amount,omitempty" require:"true"`
	// 用信合同编号
	// example:
	//
	// 123123
	DisburseContractNo *string `json:"disburse_contract_no,omitempty" xml:"disburse_contract_no,omitempty" require:"true"`
	// 授信合同编号
	// example:
	//
	// 123123
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

// 批量请求响应的结构体
type ResItem struct {
	// 客户侧样本唯一id用于映射
	// example:
	//
	// 077e5fc68135bd8e8223a094029d4cee
	SampleId *string `json:"sample_id,omitempty" xml:"sample_id,omitempty" require:"true"`
	// 蚂蚁侧对应样本唯一id，与客户侧形成映射关系，查询时需要携带该id
	// example:
	//
	// 46052e46721417297df682ef88a8ab91
	DataId *string `json:"data_id,omitempty" xml:"data_id,omitempty" require:"true"`
}

func (s ResItem) String() string {
	return tea.Prettify(s)
}

func (s ResItem) GoString() string {
	return s.String()
}

func (s *ResItem) SetSampleId(v string) *ResItem {
	s.SampleId = &v
	return s
}

func (s *ResItem) SetDataId(v string) *ResItem {
	s.DataId = &v
	return s
}

// 代扣明细
type WithholdDetailItem struct {
	// 贷款申请编号
	// example:
	//
	// xxxx
	AssetId *string `json:"asset_id,omitempty" xml:"asset_id,omitempty" require:"true"`
	// 放款编号/借据号
	// example:
	//
	// xxxx
	CapitalLoanNo *string `json:"capital_loan_no,omitempty" xml:"capital_loan_no,omitempty" require:"true"`
	// 订单维度的实还总额,保留两位有效数字
	// 单笔订单代扣的总额(单位:分)
	// example:
	//
	// 1999.98
	RpyTotalAmt *int64 `json:"rpy_total_amt,omitempty" xml:"rpy_total_amt,omitempty" require:"true"`
	// 还款类型，0-待还、1-正常还款、2-部分提前还、 3-逾期还款 、4-全部提前还 、5-坏账代偿、 6-回购
	// example:
	//
	// 1
	RpyTpe *int64 `json:"rpy_tpe,omitempty" xml:"rpy_tpe,omitempty" require:"true"`
	// 代扣日期，用户实还日，用户主动发起是当前日；定时扣款是应还日，格式=yyyy-MM-dd
	// example:
	//
	// yyyy-MM-dd
	RpyDate *string `json:"rpy_date,omitempty" xml:"rpy_date,omitempty" require:"true"`
	// 还款账单明细,如果是提前结清,会有多条
	// example:
	//
	// [{}]
	BillDetails []*BillDetail `json:"bill_details,omitempty" xml:"bill_details,omitempty" require:"true" type:"Repeated"`
}

func (s WithholdDetailItem) String() string {
	return tea.Prettify(s)
}

func (s WithholdDetailItem) GoString() string {
	return s.String()
}

func (s *WithholdDetailItem) SetAssetId(v string) *WithholdDetailItem {
	s.AssetId = &v
	return s
}

func (s *WithholdDetailItem) SetCapitalLoanNo(v string) *WithholdDetailItem {
	s.CapitalLoanNo = &v
	return s
}

func (s *WithholdDetailItem) SetRpyTotalAmt(v int64) *WithholdDetailItem {
	s.RpyTotalAmt = &v
	return s
}

func (s *WithholdDetailItem) SetRpyTpe(v int64) *WithholdDetailItem {
	s.RpyTpe = &v
	return s
}

func (s *WithholdDetailItem) SetRpyDate(v string) *WithholdDetailItem {
	s.RpyDate = &v
	return s
}

func (s *WithholdDetailItem) SetBillDetails(v []*BillDetail) *WithholdDetailItem {
	s.BillDetails = v
	return s
}

// 天枢-电商-跳转链接
type EcLinkUrl struct {
	// 根据传输的操作类型，返回对应的URL地址
	// example:
	//
	// SQ202301291615023
	UrlId *string `json:"url_id,omitempty" xml:"url_id,omitempty"`
	// 免登场景下，给到开放银行和对公认证中心的链接ID,如果对方没有，没办法以免登的形式进入银行页面。
	// example:
	//
	// APPL20200826000000250721
	H5id *string `json:"h5id,omitempty" xml:"h5id,omitempty"`
	// 免登场景下，给到对公认证中心的数据，后续KYB需要拿到这个数据进行校验，否则会无法跳转指定地址。
	// example:
	//
	// 1
	State *string `json:"state,omitempty" xml:"state,omitempty"`
}

func (s EcLinkUrl) String() string {
	return tea.Prettify(s)
}

func (s EcLinkUrl) GoString() string {
	return s.String()
}

func (s *EcLinkUrl) SetUrlId(v string) *EcLinkUrl {
	s.UrlId = &v
	return s
}

func (s *EcLinkUrl) SetH5id(v string) *EcLinkUrl {
	s.H5id = &v
	return s
}

func (s *EcLinkUrl) SetState(v string) *EcLinkUrl {
	s.State = &v
	return s
}

// ai外呼回调详情
type AICallbackMessage struct {
	// 批次号
	// example:
	//
	// 5de2ccbf87914544afb57a77e39ec023
	BatchId *string `json:"batch_id,omitempty" xml:"batch_id,omitempty"`
	// 用户标签
	// example:
	//
	// 阿松大
	Tag *string `json:"tag,omitempty" xml:"tag,omitempty" require:"true"`
	// 外呼id
	// example:
	//
	// CALLID
	CallId *string `json:"call_id,omitempty" xml:"call_id,omitempty" require:"true"`
	// 外呼的话术模板Id
	// example:
	//
	// 7
	TemplateId *int64 `json:"template_id,omitempty" xml:"template_id,omitempty"`
	// 外呼状态编码
	// example:
	//
	// 1
	StatusCode *int64 `json:"status_code,omitempty" xml:"status_code,omitempty" require:"true"`
	// 外呼状态描述
	// example:
	//
	// 已接听
	StatusDescription *string `json:"status_description,omitempty" xml:"status_description,omitempty" require:"true"`
	// 导入时间
	// example:
	//
	// 2019-11-23 14:47:06
	ImportTime *string `json:"import_time,omitempty" xml:"import_time,omitempty" require:"true"`
	// 开始通话时间
	// example:
	//
	// 2019-11-23 14:47:06
	CallBeginTime *string `json:"call_begin_time,omitempty" xml:"call_begin_time,omitempty" require:"true"`
	// 振铃时长, 单位毫秒
	// example:
	//
	// 2000
	RingTime *int64 `json:"ring_time,omitempty" xml:"ring_time,omitempty" require:"true"`
	// 接通时间
	// example:
	//
	// 2019-01-09 14:14:19
	AnswerTime *string `json:"answer_time,omitempty" xml:"answer_time,omitempty" require:"true"`
	// AI通话时长,单位s
	// example:
	//
	// 20
	SpeakingDuration *int64 `json:"speaking_duration,omitempty" xml:"speaking_duration,omitempty" require:"true"`
	// 挂断时间
	// example:
	//
	// 2019-01-09 14:14:19
	HangupTime *string `json:"hangup_time,omitempty" xml:"hangup_time,omitempty" require:"true"`
	// 对话轮次
	// example:
	//
	// 5
	SpeakingTurns *int64 `json:"speaking_turns,omitempty" xml:"speaking_turns,omitempty" require:"true"`
	// 意向标签
	// example:
	//
	// C
	IntentTag *string `json:"intent_tag,omitempty" xml:"intent_tag,omitempty" require:"true"`
	// 意向说明
	// example:
	//
	// 确认本人,未承诺还款
	IntentDescription *string `json:"intent_description,omitempty" xml:"intent_description,omitempty" require:"true"`
	// 个性标签
	// example:
	//
	// a
	IndividualTag *string `json:"individual_tag,omitempty" xml:"individual_tag,omitempty" require:"true"`
	// 回复关键词
	// example:
	//
	// 利息
	Keywords *string `json:"keywords,omitempty" xml:"keywords,omitempty" require:"true"`
	// 对话录音
	// example:
	//
	// 录音url
	ChatRecord *string `json:"chat_record,omitempty" xml:"chat_record,omitempty"`
	// 参数值
	// example:
	//
	// {"电话号码":"13100000000"}
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

// 天枢-电商-还款试算结果
type EcRepayTrial struct {
	// 合同编号
	// example:
	//
	// 123
	ContractNo *string `json:"contract_no,omitempty" xml:"contract_no,omitempty"`
	// 数字格式,精确到分。借据已结清,会返回还款总金额为0
	// example:
	//
	// 23
	TotalAmount *string `json:"total_amount,omitempty" xml:"total_amount,omitempty"`
	// 利息数字格式,精确到分
	// example:
	//
	// 1.23
	InterestAmount *string `json:"interest_amount,omitempty" xml:"interest_amount,omitempty"`
	// 本金 数字格式,精确到分
	// example:
	//
	// 2.35
	PrincipalAmount *string `json:"principal_amount,omitempty" xml:"principal_amount,omitempty"`
	// 罚息 数字格式,精确到分
	// example:
	//
	// 1.23
	PenaltyInterestAmount *string `json:"penalty_interest_amount,omitempty" xml:"penalty_interest_amount,omitempty"`
	// 复利 数字格式,精确到分
	// example:
	//
	// 1.23
	CompoundInterestAmount *string `json:"compound_interest_amount,omitempty" xml:"compound_interest_amount,omitempty"`
}

func (s EcRepayTrial) String() string {
	return tea.Prettify(s)
}

func (s EcRepayTrial) GoString() string {
	return s.String()
}

func (s *EcRepayTrial) SetContractNo(v string) *EcRepayTrial {
	s.ContractNo = &v
	return s
}

func (s *EcRepayTrial) SetTotalAmount(v string) *EcRepayTrial {
	s.TotalAmount = &v
	return s
}

func (s *EcRepayTrial) SetInterestAmount(v string) *EcRepayTrial {
	s.InterestAmount = &v
	return s
}

func (s *EcRepayTrial) SetPrincipalAmount(v string) *EcRepayTrial {
	s.PrincipalAmount = &v
	return s
}

func (s *EcRepayTrial) SetPenaltyInterestAmount(v string) *EcRepayTrial {
	s.PenaltyInterestAmount = &v
	return s
}

func (s *EcRepayTrial) SetCompoundInterestAmount(v string) *EcRepayTrial {
	s.CompoundInterestAmount = &v
	return s
}

// 决策场景信息
type AirDfSceneInfos struct {
	// 决策场景结果
	// example:
	//
	// review
	SceneDecision *string `json:"scene_decision,omitempty" xml:"scene_decision,omitempty"`
	// 决策场景
	// example:
	//
	// air_scene
	SceneCode *string `json:"scene_code,omitempty" xml:"scene_code,omitempty"`
	// 决策域信息
	// example:
	//
	// [{"decision_flows":[{"decision":"review","name":"租赁测试策略"}],"domain_decision":"review","domain_code":"lease_domain"}]
	DomainInfos []*AirDomainInfos `json:"domain_infos,omitempty" xml:"domain_infos,omitempty" type:"Repeated"`
}

func (s AirDfSceneInfos) String() string {
	return tea.Prettify(s)
}

func (s AirDfSceneInfos) GoString() string {
	return s.String()
}

func (s *AirDfSceneInfos) SetSceneDecision(v string) *AirDfSceneInfos {
	s.SceneDecision = &v
	return s
}

func (s *AirDfSceneInfos) SetSceneCode(v string) *AirDfSceneInfos {
	s.SceneCode = &v
	return s
}

func (s *AirDfSceneInfos) SetDomainInfos(v []*AirDomainInfos) *AirDfSceneInfos {
	s.DomainInfos = v
	return s
}

// 预警企业
type RtopCompanyAlarm struct {
	// 企业ID
	// example:
	//
	// 1
	CompanyId *string `json:"company_id,omitempty" xml:"company_id,omitempty" require:"true"`
	// 预警类型
	// example:
	//
	// 1
	AlarmType *string `json:"alarm_type,omitempty" xml:"alarm_type,omitempty" require:"true"`
	// 预警序号
	// example:
	//
	// 1
	AlarmIdx *string `json:"alarm_idx,omitempty" xml:"alarm_idx,omitempty" require:"true"`
	// 预警日期
	// example:
	//
	// 1
	AlarmDate *string `json:"alarm_date,omitempty" xml:"alarm_date,omitempty" require:"true"`
	// 预警标识，是否需要预警
	// example:
	//
	// 1
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

// 天枢-电商-还款明细查询
type EcRepayQuery struct {
	// 合同编号
	// example:
	//
	// 91234500123400000R
	ContractNo *string `json:"contract_no,omitempty" xml:"contract_no,omitempty" require:"true"`
	// 借据号
	// example:
	//
	// 91234500123400000R
	LoanNo *string `json:"loan_no,omitempty" xml:"loan_no,omitempty" require:"true"`
	// 贷款金额
	// example:
	//
	// 25.34
	Loanamt *string `json:"loanamt,omitempty" xml:"loanamt,omitempty" require:"true"`
	// 实时借据状态
	// example:
	//
	// 1
	LoanStatus *string `json:"loan_status,omitempty" xml:"loan_status,omitempty" require:"true"`
	// 总期次
	// example:
	//
	// 25
	TotalNum *string `json:"total_num,omitempty" xml:"total_num,omitempty" require:"true"`
	// 还款方式
	// example:
	//
	// 1
	RepayType *string `json:"repay_type,omitempty" xml:"repay_type,omitempty"`
	// 应还总金额
	// example:
	//
	// 25.34
	RepayAmount *string `json:"repay_amount,omitempty" xml:"repay_amount,omitempty"`
	// 实还总金额
	// example:
	//
	// 2.34
	ActualSum *string `json:"actual_sum,omitempty" xml:"actual_sum,omitempty"`
	// 这笔借据所在期次的还款日。格式:yyyy/MM/dd
	// example:
	//
	// 2023/05/01
	Duedate *string `json:"duedate,omitempty" xml:"duedate,omitempty"`
	// 实还日期 格式:yyyy/MM/dd
	// example:
	//
	// 2023/05/01
	ActualpayDate *string `json:"actualpay_date,omitempty" xml:"actualpay_date,omitempty"`
	// 应还本金 单位:元,格式:数字,小数点后两位
	// example:
	//
	// 1.23
	Corpus *string `json:"corpus,omitempty" xml:"corpus,omitempty"`
	// 实还本金 单位:元,格式:数字,小数点后两位
	// example:
	//
	// 1.23
	ActualPayprincipalAmt *string `json:"actual_payprincipal_amt,omitempty" xml:"actual_payprincipal_amt,omitempty"`
	// 应还利息 单位:元,格式:数字,小数点后两位
	// example:
	//
	// 1.23
	Interest *string `json:"interest,omitempty" xml:"interest,omitempty"`
	// 实还利息 单位:元,格式:数字,小数点后两位
	// example:
	//
	// 1.23
	ActualPayinterestAmt *string `json:"actual_payinterest_amt,omitempty" xml:"actual_payinterest_amt,omitempty"`
	// 应还罚息 单位:元,格式:数字,小数点后两位
	// example:
	//
	// 1.23
	PayPrincipalPenaltyAmt *string `json:"pay_principal_penalty_amt,omitempty" xml:"pay_principal_penalty_amt,omitempty"`
	// 实还罚息 单位:元,格式:数字,小数点后两位
	// example:
	//
	// 1.23
	ActualPayprincipalPenaltyAmt *string `json:"actual_payprincipal_penalty_amt,omitempty" xml:"actual_payprincipal_penalty_amt,omitempty"`
	// 应还复利 单位:元,格式:数字,小数点后两位
	// example:
	//
	// 1.23
	PayInterestPenaltyAmt *string `json:"pay_interest_penalty_amt,omitempty" xml:"pay_interest_penalty_amt,omitempty"`
	// 实还复利 单位:元,格式:数字,小数点后两位
	// example:
	//
	// 1.23
	ActualPayinterestPenaltyAmt *string `json:"actual_payinterest_penalty_amt,omitempty" xml:"actual_payinterest_penalty_amt,omitempty"`
	// 应还贴息利息 单位:元,格式:数字,小数点后两位
	// example:
	//
	// 1.23
	PaySplitinterestAmt *string `json:"pay_splitinterest_amt,omitempty" xml:"pay_splitinterest_amt,omitempty"`
	// 实还贴息利息 单位:元,格式:数字,小数点后两位
	// example:
	//
	// 1.23
	ActualPaysplitinterestAmt *string `json:"actual_paysplitinterest_amt,omitempty" xml:"actual_paysplitinterest_amt,omitempty"`
	// 币种
	// example:
	//
	// RMB
	Currency *string `json:"currency,omitempty" xml:"currency,omitempty"`
	// 还款期次 这笔还款对应期次。单位:整数
	// example:
	//
	// 25
	RepaymentNum *string `json:"repayment_num,omitempty" xml:"repayment_num,omitempty"`
	// 优惠金额 单位:元,格式:数字,小数点后两位
	// example:
	//
	// 1.23
	ReduceAmt *string `json:"reduce_amt,omitempty" xml:"reduce_amt,omitempty"`
	// 还款类型
	// example:
	//
	// 1
	BillType *string `json:"bill_type,omitempty" xml:"bill_type,omitempty"`
	// 流水号
	// example:
	//
	// PANO124414515555
	TransactionNo *string `json:"transaction_no,omitempty" xml:"transaction_no,omitempty" require:"true"`
	// 还款交易流水号 若为还款，则与还款通知流水保持一致
	// example:
	//
	// PANO124414515555
	TransactionSerialno *string `json:"transaction_serialno,omitempty" xml:"transaction_serialno,omitempty" require:"true"`
	// 是否附言还款
	// example:
	//
	// 1
	Remark *string `json:"remark,omitempty" xml:"remark,omitempty"`
}

func (s EcRepayQuery) String() string {
	return tea.Prettify(s)
}

func (s EcRepayQuery) GoString() string {
	return s.String()
}

func (s *EcRepayQuery) SetContractNo(v string) *EcRepayQuery {
	s.ContractNo = &v
	return s
}

func (s *EcRepayQuery) SetLoanNo(v string) *EcRepayQuery {
	s.LoanNo = &v
	return s
}

func (s *EcRepayQuery) SetLoanamt(v string) *EcRepayQuery {
	s.Loanamt = &v
	return s
}

func (s *EcRepayQuery) SetLoanStatus(v string) *EcRepayQuery {
	s.LoanStatus = &v
	return s
}

func (s *EcRepayQuery) SetTotalNum(v string) *EcRepayQuery {
	s.TotalNum = &v
	return s
}

func (s *EcRepayQuery) SetRepayType(v string) *EcRepayQuery {
	s.RepayType = &v
	return s
}

func (s *EcRepayQuery) SetRepayAmount(v string) *EcRepayQuery {
	s.RepayAmount = &v
	return s
}

func (s *EcRepayQuery) SetActualSum(v string) *EcRepayQuery {
	s.ActualSum = &v
	return s
}

func (s *EcRepayQuery) SetDuedate(v string) *EcRepayQuery {
	s.Duedate = &v
	return s
}

func (s *EcRepayQuery) SetActualpayDate(v string) *EcRepayQuery {
	s.ActualpayDate = &v
	return s
}

func (s *EcRepayQuery) SetCorpus(v string) *EcRepayQuery {
	s.Corpus = &v
	return s
}

func (s *EcRepayQuery) SetActualPayprincipalAmt(v string) *EcRepayQuery {
	s.ActualPayprincipalAmt = &v
	return s
}

func (s *EcRepayQuery) SetInterest(v string) *EcRepayQuery {
	s.Interest = &v
	return s
}

func (s *EcRepayQuery) SetActualPayinterestAmt(v string) *EcRepayQuery {
	s.ActualPayinterestAmt = &v
	return s
}

func (s *EcRepayQuery) SetPayPrincipalPenaltyAmt(v string) *EcRepayQuery {
	s.PayPrincipalPenaltyAmt = &v
	return s
}

func (s *EcRepayQuery) SetActualPayprincipalPenaltyAmt(v string) *EcRepayQuery {
	s.ActualPayprincipalPenaltyAmt = &v
	return s
}

func (s *EcRepayQuery) SetPayInterestPenaltyAmt(v string) *EcRepayQuery {
	s.PayInterestPenaltyAmt = &v
	return s
}

func (s *EcRepayQuery) SetActualPayinterestPenaltyAmt(v string) *EcRepayQuery {
	s.ActualPayinterestPenaltyAmt = &v
	return s
}

func (s *EcRepayQuery) SetPaySplitinterestAmt(v string) *EcRepayQuery {
	s.PaySplitinterestAmt = &v
	return s
}

func (s *EcRepayQuery) SetActualPaysplitinterestAmt(v string) *EcRepayQuery {
	s.ActualPaysplitinterestAmt = &v
	return s
}

func (s *EcRepayQuery) SetCurrency(v string) *EcRepayQuery {
	s.Currency = &v
	return s
}

func (s *EcRepayQuery) SetRepaymentNum(v string) *EcRepayQuery {
	s.RepaymentNum = &v
	return s
}

func (s *EcRepayQuery) SetReduceAmt(v string) *EcRepayQuery {
	s.ReduceAmt = &v
	return s
}

func (s *EcRepayQuery) SetBillType(v string) *EcRepayQuery {
	s.BillType = &v
	return s
}

func (s *EcRepayQuery) SetTransactionNo(v string) *EcRepayQuery {
	s.TransactionNo = &v
	return s
}

func (s *EcRepayQuery) SetTransactionSerialno(v string) *EcRepayQuery {
	s.TransactionSerialno = &v
	return s
}

func (s *EcRepayQuery) SetRemark(v string) *EcRepayQuery {
	s.Remark = &v
	return s
}

// 流量方还款计划通知Object
type RepayPlanNotifyItem struct {
	// 当前期数
	// example:
	//
	// 1
	LoanTerm *int64 `json:"loan_term,omitempty" xml:"loan_term,omitempty" require:"true"`
	// 应还日，yyyy-MM-dd
	// example:
	//
	// yyyy-MM-dd
	ExpectRepayDate *string `json:"expect_repay_date,omitempty" xml:"expect_repay_date,omitempty" require:"true"`
	// 应还总额(元)
	// example:
	//
	// 1999.98
	ExpectRepayAmount *int64 `json:"expect_repay_amount,omitempty" xml:"expect_repay_amount,omitempty" require:"true"`
	// 应还本金(元)
	// example:
	//
	// 1999.98
	ExpectRepayPrincipal *int64 `json:"expect_repay_principal,omitempty" xml:"expect_repay_principal,omitempty" require:"true"`
	// 应还利息(元)
	// example:
	//
	// 1999.98
	ExpectRepayInterest *int64 `json:"expect_repay_interest,omitempty" xml:"expect_repay_interest,omitempty" require:"true"`
	// 应还担保费(元)
	// example:
	//
	// 1999.98
	ExpectRepayGuarantee *int64 `json:"expect_repay_guarantee,omitempty" xml:"expect_repay_guarantee,omitempty"`
	// 起息日，格式 YYYY-MM-DD
	// example:
	//
	// yyyy-MM-dd
	InterestStartDate *string `json:"interest_start_date,omitempty" xml:"interest_start_date,omitempty"`
	// 实还总额(元)，如未还则传0
	// example:
	//
	// 1999.98
	RepayAmount *int64 `json:"repay_amount,omitempty" xml:"repay_amount,omitempty"`
	// 已还本金(元)，如未还则传0
	// example:
	//
	// 1999.98
	RepaidPrincipal *int64 `json:"repaid_principal,omitempty" xml:"repaid_principal,omitempty"`
	// 已还利息(元)，如未还则传0
	// example:
	//
	// 1999.98
	RepaidInterest *int64 `json:"repaid_interest,omitempty" xml:"repaid_interest,omitempty"`
	// 应还罚息(元)，
	// example:
	//
	// 1999.98
	ExpectRepayMuclt *int64 `json:"expect_repay_muclt,omitempty" xml:"expect_repay_muclt,omitempty"`
	// 已还罚息(元)，如未还则传0
	// example:
	//
	// 1999.98
	RepaidPenalty *int64 `json:"repaid_penalty,omitempty" xml:"repaid_penalty,omitempty"`
	// 状态标志
	// 0-正常未到期
	// 1-正常已还清
	// 2-逾期
	// example:
	//
	// 0
	ScheduleStatus *string `json:"schedule_status,omitempty" xml:"schedule_status,omitempty"`
}

func (s RepayPlanNotifyItem) String() string {
	return tea.Prettify(s)
}

func (s RepayPlanNotifyItem) GoString() string {
	return s.String()
}

func (s *RepayPlanNotifyItem) SetLoanTerm(v int64) *RepayPlanNotifyItem {
	s.LoanTerm = &v
	return s
}

func (s *RepayPlanNotifyItem) SetExpectRepayDate(v string) *RepayPlanNotifyItem {
	s.ExpectRepayDate = &v
	return s
}

func (s *RepayPlanNotifyItem) SetExpectRepayAmount(v int64) *RepayPlanNotifyItem {
	s.ExpectRepayAmount = &v
	return s
}

func (s *RepayPlanNotifyItem) SetExpectRepayPrincipal(v int64) *RepayPlanNotifyItem {
	s.ExpectRepayPrincipal = &v
	return s
}

func (s *RepayPlanNotifyItem) SetExpectRepayInterest(v int64) *RepayPlanNotifyItem {
	s.ExpectRepayInterest = &v
	return s
}

func (s *RepayPlanNotifyItem) SetExpectRepayGuarantee(v int64) *RepayPlanNotifyItem {
	s.ExpectRepayGuarantee = &v
	return s
}

func (s *RepayPlanNotifyItem) SetInterestStartDate(v string) *RepayPlanNotifyItem {
	s.InterestStartDate = &v
	return s
}

func (s *RepayPlanNotifyItem) SetRepayAmount(v int64) *RepayPlanNotifyItem {
	s.RepayAmount = &v
	return s
}

func (s *RepayPlanNotifyItem) SetRepaidPrincipal(v int64) *RepayPlanNotifyItem {
	s.RepaidPrincipal = &v
	return s
}

func (s *RepayPlanNotifyItem) SetRepaidInterest(v int64) *RepayPlanNotifyItem {
	s.RepaidInterest = &v
	return s
}

func (s *RepayPlanNotifyItem) SetExpectRepayMuclt(v int64) *RepayPlanNotifyItem {
	s.ExpectRepayMuclt = &v
	return s
}

func (s *RepayPlanNotifyItem) SetRepaidPenalty(v int64) *RepayPlanNotifyItem {
	s.RepaidPenalty = &v
	return s
}

func (s *RepayPlanNotifyItem) SetScheduleStatus(v string) *RepayPlanNotifyItem {
	s.ScheduleStatus = &v
	return s
}

// 天枢系统-二级商户交易退款查询结果-分期付
type TradeRefundResult struct {
	// 退款请求编号
	// example:
	//
	// 20880002000001
	RequestNo *string `json:"request_no,omitempty" xml:"request_no,omitempty" require:"true"`
	// 退款金额
	// example:
	//
	// 30
	RefundAmount *int64 `json:"refund_amount,omitempty" xml:"refund_amount,omitempty" require:"true"`
	// 退款原因
	// example:
	//
	// 不想要了
	RefundReason *string `json:"refund_reason,omitempty" xml:"refund_reason,omitempty" require:"true"`
	// 退款状态
	// example:
	//
	// REFUND_SUCCESS
	RefundStatus *string `json:"refund_status,omitempty" xml:"refund_status,omitempty" require:"true"`
	// 退款失败原因
	// example:
	//
	// 参数异常
	RefundFailReason *string `json:"refund_fail_reason,omitempty" xml:"refund_fail_reason,omitempty" require:"true"`
}

func (s TradeRefundResult) String() string {
	return tea.Prettify(s)
}

func (s TradeRefundResult) GoString() string {
	return s.String()
}

func (s *TradeRefundResult) SetRequestNo(v string) *TradeRefundResult {
	s.RequestNo = &v
	return s
}

func (s *TradeRefundResult) SetRefundAmount(v int64) *TradeRefundResult {
	s.RefundAmount = &v
	return s
}

func (s *TradeRefundResult) SetRefundReason(v string) *TradeRefundResult {
	s.RefundReason = &v
	return s
}

func (s *TradeRefundResult) SetRefundStatus(v string) *TradeRefundResult {
	s.RefundStatus = &v
	return s
}

func (s *TradeRefundResult) SetRefundFailReason(v string) *TradeRefundResult {
	s.RefundFailReason = &v
	return s
}

// 企业影响人数性别分布统计
type RtopGenderDistribution struct {
	// 统计值
	// example:
	//
	// 10
	Count *int `json:"count,omitempty" xml:"count,omitempty" require:"true"`
	// 性别
	// example:
	//
	// MALE
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

// 天枢-电商-额度返回
type DubheEcQuota struct {
	// 交易流水号,与上面的交易流水号一致
	// example:
	//
	// JJBH136433239635646977
	TransactionNo *string `json:"transaction_no,omitempty" xml:"transaction_no,omitempty" require:"true"`
	// 业务状态同步接口中，客户签约成功后的合同编号，在后续查询类接口都需要使用。
	// example:
	//
	// CONT20230213000000146577
	ContractNo *string `json:"contract_no,omitempty" xml:"contract_no,omitempty" require:"true"`
	// 客户对应合同的总额度，单位：元，格式：数字，小数点后两位。
	// example:
	//
	// 1
	Amt *int64 `json:"amt,omitempty" xml:"amt,omitempty" require:"true"`
	// 客户对应合同的可用额度，单位：元，格式：数字，小数点后两位
	// example:
	//
	// 1
	AvailCreditAmt *int64 `json:"avail_credit_amt,omitempty" xml:"avail_credit_amt,omitempty" require:"true"`
	// 客户对应合同的已用额度，单位：元，格式：数字，小数点后两位
	// example:
	//
	// 1.01
	EngrossAmt *int64 `json:"engross_amt,omitempty" xml:"engross_amt,omitempty" require:"true"`
	// 合同目前的额度状态
	// example:
	//
	// 1
	CreditStatus *string `json:"credit_status,omitempty" xml:"credit_status,omitempty" require:"true"`
	// 授信开始时间  格式: yyyy/MM/dd。额度有效时返回
	// example:
	//
	// 2023/02/01
	ContractEffectDate *string `json:"contract_effect_date,omitempty" xml:"contract_effect_date,omitempty"`
	// 授信结束时间 格式:yyyy/MM/dd。额度有效时返回
	// example:
	//
	// 2023/05/01
	MaturityDate *string `json:"maturity_date,omitempty" xml:"maturity_date,omitempty"`
}

func (s DubheEcQuota) String() string {
	return tea.Prettify(s)
}

func (s DubheEcQuota) GoString() string {
	return s.String()
}

func (s *DubheEcQuota) SetTransactionNo(v string) *DubheEcQuota {
	s.TransactionNo = &v
	return s
}

func (s *DubheEcQuota) SetContractNo(v string) *DubheEcQuota {
	s.ContractNo = &v
	return s
}

func (s *DubheEcQuota) SetAmt(v int64) *DubheEcQuota {
	s.Amt = &v
	return s
}

func (s *DubheEcQuota) SetAvailCreditAmt(v int64) *DubheEcQuota {
	s.AvailCreditAmt = &v
	return s
}

func (s *DubheEcQuota) SetEngrossAmt(v int64) *DubheEcQuota {
	s.EngrossAmt = &v
	return s
}

func (s *DubheEcQuota) SetCreditStatus(v string) *DubheEcQuota {
	s.CreditStatus = &v
	return s
}

func (s *DubheEcQuota) SetContractEffectDate(v string) *DubheEcQuota {
	s.ContractEffectDate = &v
	return s
}

func (s *DubheEcQuota) SetMaturityDate(v string) *DubheEcQuota {
	s.MaturityDate = &v
	return s
}

// 卡短解析服务返回参数
type ShortUrlInfo struct {
	// 支持卡片短信的手机号
	// example:
	//
	// 15012345678
	Mobile *string `json:"mobile,omitempty" xml:"mobile,omitempty" require:"true"`
	// 解析生成的短链
	// example:
	//
	// https://www.alipay.com/F49v0ifM
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
	// example:
	//
	// true, false
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

// 订单车辆信息
type VehicleInfo struct {
	// 流量方购物订单号
	// example:
	//
	// xxxx
	BizOrderNo *string `json:"biz_order_no,omitempty" xml:"biz_order_no,omitempty" require:"true"`
	// 订单[分期]金额，单位：元
	// example:
	//
	// 199.88
	TradeAmount *string `json:"trade_amount,omitempty" xml:"trade_amount,omitempty" require:"true"`
	// 订单分期金额，单位：元
	// example:
	//
	// 188.88
	InstallmentAmount *string `json:"installment_amount,omitempty" xml:"installment_amount,omitempty"`
	// 首付金额，单位：元
	// example:
	//
	// 199.00
	DownPayment *string `json:"down_payment,omitempty" xml:"down_payment,omitempty"`
	// pad设备提供
	// example:
	//
	// xxx
	WifiMac *string `json:"wifi_mac,omitempty" xml:"wifi_mac,omitempty"`
	// pad-经度
	// example:
	//
	// xxxx
	Longitude *string `json:"longitude,omitempty" xml:"longitude,omitempty"`
	// pad-纬度
	// example:
	//
	// xxx
	Latitude *string `json:"latitude,omitempty" xml:"latitude,omitempty"`
	// 车辆类型（摩托车）：1-新车、0-二手车
	// example:
	//
	// 0
	VehicleType *string `json:"vehicle_type,omitempty" xml:"vehicle_type,omitempty"`
	// SN码/中控号(授信后放款前)
	// example:
	//
	// xxx
	Sn *string `json:"sn,omitempty" xml:"sn,omitempty"`
	// 车驾号(授信后放款前)
	// example:
	//
	// xxx
	FrameNo *string `json:"frame_no,omitempty" xml:"frame_no,omitempty"`
	// SKU ID
	// example:
	//
	// xxxx
	Sku *string `json:"sku,omitempty" xml:"sku,omitempty" require:"true"`
	// 颜色
	// example:
	//
	// xxxx
	Color *string `json:"color,omitempty" xml:"color,omitempty"`
	// 车型关键词
	// example:
	//
	// xxx
	ModelKeyword *string `json:"model_keyword,omitempty" xml:"model_keyword,omitempty"`
	// 续航里程
	// example:
	//
	// 1024
	Range *string `json:"range,omitempty" xml:"range,omitempty"`
	// 新车指导价，单位：元
	// example:
	//
	// 199.88
	GuidePrice *string `json:"guide_price,omitempty" xml:"guide_price,omitempty" require:"true"`
	// 售价，单位：元
	// example:
	//
	// 1999.98
	SellingPrice *string `json:"selling_price,omitempty" xml:"selling_price,omitempty" require:"true"`
	// 品牌
	// example:
	//
	// xxxx
	Brand *string `json:"brand,omitempty" xml:"brand,omitempty"`
	// 车型
	// example:
	//
	// xxxx
	Model *string `json:"model,omitempty" xml:"model,omitempty"`
	// 年款，yyyy
	// example:
	//
	// yyyy
	ModelYear *string `json:"model_year,omitempty" xml:"model_year,omitempty"`
	// 公里数，Odometer
	// example:
	//
	// xxxx
	Odo *string `json:"odo,omitempty" xml:"odo,omitempty"`
	// 首次上牌时间
	// example:
	//
	// xxxx
	FirstRegDate *string `json:"first_reg_date,omitempty" xml:"first_reg_date,omitempty"`
	// 过户次数，Ownership Transfer Records
	// example:
	//
	// xxxx
	Otr *string `json:"otr,omitempty" xml:"otr,omitempty"`
	// 配件信息
	// example:
	//
	// xxxx
	Parts *string `json:"parts,omitempty" xml:"parts,omitempty"`
}

func (s VehicleInfo) String() string {
	return tea.Prettify(s)
}

func (s VehicleInfo) GoString() string {
	return s.String()
}

func (s *VehicleInfo) SetBizOrderNo(v string) *VehicleInfo {
	s.BizOrderNo = &v
	return s
}

func (s *VehicleInfo) SetTradeAmount(v string) *VehicleInfo {
	s.TradeAmount = &v
	return s
}

func (s *VehicleInfo) SetInstallmentAmount(v string) *VehicleInfo {
	s.InstallmentAmount = &v
	return s
}

func (s *VehicleInfo) SetDownPayment(v string) *VehicleInfo {
	s.DownPayment = &v
	return s
}

func (s *VehicleInfo) SetWifiMac(v string) *VehicleInfo {
	s.WifiMac = &v
	return s
}

func (s *VehicleInfo) SetLongitude(v string) *VehicleInfo {
	s.Longitude = &v
	return s
}

func (s *VehicleInfo) SetLatitude(v string) *VehicleInfo {
	s.Latitude = &v
	return s
}

func (s *VehicleInfo) SetVehicleType(v string) *VehicleInfo {
	s.VehicleType = &v
	return s
}

func (s *VehicleInfo) SetSn(v string) *VehicleInfo {
	s.Sn = &v
	return s
}

func (s *VehicleInfo) SetFrameNo(v string) *VehicleInfo {
	s.FrameNo = &v
	return s
}

func (s *VehicleInfo) SetSku(v string) *VehicleInfo {
	s.Sku = &v
	return s
}

func (s *VehicleInfo) SetColor(v string) *VehicleInfo {
	s.Color = &v
	return s
}

func (s *VehicleInfo) SetModelKeyword(v string) *VehicleInfo {
	s.ModelKeyword = &v
	return s
}

func (s *VehicleInfo) SetRange(v string) *VehicleInfo {
	s.Range = &v
	return s
}

func (s *VehicleInfo) SetGuidePrice(v string) *VehicleInfo {
	s.GuidePrice = &v
	return s
}

func (s *VehicleInfo) SetSellingPrice(v string) *VehicleInfo {
	s.SellingPrice = &v
	return s
}

func (s *VehicleInfo) SetBrand(v string) *VehicleInfo {
	s.Brand = &v
	return s
}

func (s *VehicleInfo) SetModel(v string) *VehicleInfo {
	s.Model = &v
	return s
}

func (s *VehicleInfo) SetModelYear(v string) *VehicleInfo {
	s.ModelYear = &v
	return s
}

func (s *VehicleInfo) SetOdo(v string) *VehicleInfo {
	s.Odo = &v
	return s
}

func (s *VehicleInfo) SetFirstRegDate(v string) *VehicleInfo {
	s.FirstRegDate = &v
	return s
}

func (s *VehicleInfo) SetOtr(v string) *VehicleInfo {
	s.Otr = &v
	return s
}

func (s *VehicleInfo) SetParts(v string) *VehicleInfo {
	s.Parts = &v
	return s
}

// 企管盾票税决策服务
type RdaasTaxDecsionService struct {
	// 决策服务id
	// example:
	//
	// 1
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 产品编码
	// example:
	//
	// 13
	ServiceName *string `json:"service_name,omitempty" xml:"service_name,omitempty" require:"true"`
	// 区域编码
	// example:
	//
	// SJ_ALL
	ServiceZone *string `json:"service_zone,omitempty" xml:"service_zone,omitempty"`
	// 渠道
	// example:
	//
	// HZSZKJ
	Channel *string `json:"channel,omitempty" xml:"channel,omitempty"`
	// 决策租户
	// example:
	//
	// DEFAULT
	DecisionTenant *string `json:"decision_tenant,omitempty" xml:"decision_tenant,omitempty"`
	// 是否启用
	// example:
	//
	// enabled
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 创建时间，格式:yyyy-MM-dd HH:mm:ss
	// example:
	//
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
	// example:
	//
	// 10.214.138.14
	ClientIp *string `json:"client_ip,omitempty" xml:"client_ip,omitempty"`
	// 客户端UMID
	// example:
	//
	// WV1bz5927da956db072d3001792dcc67e
	ClientPcidguid *string `json:"client_pcidguid,omitempty" xml:"client_pcidguid,omitempty"`
	// 服务器名
	// example:
	//
	// server
	ServerName *string `json:"server_name,omitempty" xml:"server_name,omitempty"`
	// 会话ID
	// example:
	//
	// RZ1 2cz9oSg1GTGtGp9CwYtBbZMcD8DmobilecashierRZ12
	SessionId *string `json:"session_id,omitempty" xml:"session_id,omitempty"`
	// 用户ID
	// example:
	//
	// 2088522384403582
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

// 天枢-电商-授信查询
type EcCreditQuery struct {
	// 外部申请编号
	// example:
	//
	// SQ202301291615023
	ThirdApplyNo *string `json:"third_apply_no,omitempty" xml:"third_apply_no,omitempty"`
	// 银行审批流水号
	// example:
	//
	// APPL20200826000000250721
	ApplyNo *string `json:"apply_no,omitempty" xml:"apply_no,omitempty"`
	// 业务审批状态
	// example:
	//
	// APPROVING
	ApplyStatus *string `json:"apply_status,omitempty" xml:"apply_status,omitempty" require:"true"`
	// 合同编号
	// example:
	//
	// CONT20230314000000143225
	ContractNo *string `json:"contract_no,omitempty" xml:"contract_no,omitempty"`
	// 授信开始时间 格式yyyyMMdd
	// example:
	//
	// 20221010
	AmountStartDate *string `json:"amount_start_date,omitempty" xml:"amount_start_date,omitempty"`
	// 授信结束时间 yyyyMMdd
	// example:
	//
	// 20231010
	AmountEndDate *string `json:"amount_end_date,omitempty" xml:"amount_end_date,omitempty"`
	// 审批金额
	// example:
	//
	// 5000000.00
	ApproveAmount *string `json:"approve_amount,omitempty" xml:"approve_amount,omitempty"`
	// 否决原因
	// example:
	//
	// 审批否决
	DenyReason *string `json:"deny_reason,omitempty" xml:"deny_reason,omitempty"`
	// 提还款账号
	// example:
	//
	// 6230580199590683459
	BankCardNo *string `json:"bank_card_no,omitempty" xml:"bank_card_no,omitempty"`
	// 提还款账号联行号
	// example:
	//
	// 307331002509
	BankCardBranchCode *string `json:"bank_card_branch_code,omitempty" xml:"bank_card_branch_code,omitempty"`
	// 账号开户行行名称
	// example:
	//
	// 平安银行杭州分行
	PublicAccountBankname *string `json:"public_account_bankname,omitempty" xml:"public_account_bankname,omitempty"`
	// 审批通过时间 审批通过必填(格式: yyyy-MM-dd HH:mm:ss)
	// example:
	//
	// 2023-05-01 01:01:01
	ApproveTime *string `json:"approve_time,omitempty" xml:"approve_time,omitempty"`
}

func (s EcCreditQuery) String() string {
	return tea.Prettify(s)
}

func (s EcCreditQuery) GoString() string {
	return s.String()
}

func (s *EcCreditQuery) SetThirdApplyNo(v string) *EcCreditQuery {
	s.ThirdApplyNo = &v
	return s
}

func (s *EcCreditQuery) SetApplyNo(v string) *EcCreditQuery {
	s.ApplyNo = &v
	return s
}

func (s *EcCreditQuery) SetApplyStatus(v string) *EcCreditQuery {
	s.ApplyStatus = &v
	return s
}

func (s *EcCreditQuery) SetContractNo(v string) *EcCreditQuery {
	s.ContractNo = &v
	return s
}

func (s *EcCreditQuery) SetAmountStartDate(v string) *EcCreditQuery {
	s.AmountStartDate = &v
	return s
}

func (s *EcCreditQuery) SetAmountEndDate(v string) *EcCreditQuery {
	s.AmountEndDate = &v
	return s
}

func (s *EcCreditQuery) SetApproveAmount(v string) *EcCreditQuery {
	s.ApproveAmount = &v
	return s
}

func (s *EcCreditQuery) SetDenyReason(v string) *EcCreditQuery {
	s.DenyReason = &v
	return s
}

func (s *EcCreditQuery) SetBankCardNo(v string) *EcCreditQuery {
	s.BankCardNo = &v
	return s
}

func (s *EcCreditQuery) SetBankCardBranchCode(v string) *EcCreditQuery {
	s.BankCardBranchCode = &v
	return s
}

func (s *EcCreditQuery) SetPublicAccountBankname(v string) *EcCreditQuery {
	s.PublicAccountBankname = &v
	return s
}

func (s *EcCreditQuery) SetApproveTime(v string) *EcCreditQuery {
	s.ApproveTime = &v
	return s
}

// 营销盾实时圈客结果返回model
type CustomerUmktInfoModel struct {
	// 基本圈客结果信息
	BaseInfo *BaseCustomerUmktInfoModel `json:"base_info,omitempty" xml:"base_info,omitempty" require:"true"`
	// 额外的营销分结果
	// example:
	//
	// {"f_01":"95.0"}
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
	// example:
	//
	// 福州北辰智创投资中心
	CompanyName *string `json:"company_name,omitempty" xml:"company_name,omitempty" require:"true"`
	// 企业对应的舆情数量
	// example:
	//
	// 10
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
	// example:
	//
	// 某店铺
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 店铺id
	// example:
	//
	// 2022091300001
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 0:成功
	// 1:失败
	// 2:处理中
	// example:
	//
	// 0
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
	// example:
	//
	// 10
	Count *int64 `json:"count,omitempty" xml:"count,omitempty" require:"true"`
	// 地区
	// example:
	//
	// ​西湖区
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
	// example:
	//
	// 0
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 用信申请订单号
	// example:
	//
	// 123123
	RelationNo *string `json:"relation_no,omitempty" xml:"relation_no,omitempty"`
	// 结清证明url
	// example:
	//
	// https://www.example.com/ffff.pdf?expire=111111
	CertificateUrl *string `json:"certificate_url,omitempty" xml:"certificate_url,omitempty"`
	// 结清证明文件Base64
	// example:
	//
	// BEAKENMCT...
	CertificateBase64 *string `json:"certificate_base64,omitempty" xml:"certificate_base64,omitempty"`
	// 说明
	// example:
	//
	// 已开具
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

// 机构侧最高可用额度
type FundInfo struct {
	// 资金方编号
	// example:
	//
	// D20250701000000001
	FundCode *string `json:"fund_code,omitempty" xml:"fund_code,omitempty" require:"true"`
	// 资金方简称
	// example:
	//
	// 科融
	AbbreFundName *string `json:"abbre_fund_name,omitempty" xml:"abbre_fund_name,omitempty" require:"true"`
	// 额度状态
	// example:
	//
	// 0
	CreditStatus *string `json:"credit_status,omitempty" xml:"credit_status,omitempty" require:"true"`
	// 授信总额度
	// example:
	//
	// 200000
	CreditAmount *string `json:"credit_amount,omitempty" xml:"credit_amount,omitempty"`
	// 剩余可用余额
	// example:
	//
	// 200000
	RestAmount *string `json:"rest_amount,omitempty" xml:"rest_amount,omitempty"`
	// 年利率
	// example:
	//
	// 0.1250
	YearInterestRate *string `json:"year_interest_rate,omitempty" xml:"year_interest_rate,omitempty"`
}

func (s FundInfo) String() string {
	return tea.Prettify(s)
}

func (s FundInfo) GoString() string {
	return s.String()
}

func (s *FundInfo) SetFundCode(v string) *FundInfo {
	s.FundCode = &v
	return s
}

func (s *FundInfo) SetAbbreFundName(v string) *FundInfo {
	s.AbbreFundName = &v
	return s
}

func (s *FundInfo) SetCreditStatus(v string) *FundInfo {
	s.CreditStatus = &v
	return s
}

func (s *FundInfo) SetCreditAmount(v string) *FundInfo {
	s.CreditAmount = &v
	return s
}

func (s *FundInfo) SetRestAmount(v string) *FundInfo {
	s.RestAmount = &v
	return s
}

func (s *FundInfo) SetYearInterestRate(v string) *FundInfo {
	s.YearInterestRate = &v
	return s
}

// 涉众风险企业特征
type RtopCrowdRiskFeatureResp struct {
	// 特征标签列表
	ClueTags []*RtopCrowdRiskFeatureTag `json:"clue_tags,omitempty" xml:"clue_tags,omitempty" type:"Repeated"`
	// 特征名称
	// example:
	//
	// 工商风险维度
	FeatureName *string `json:"feature_name,omitempty" xml:"feature_name,omitempty" require:"true"`
	// 特征​分数
	// example:
	//
	// 10
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
	// example:
	//
	// 1032
	DecisionPlanId *string `json:"decision_plan_id,omitempty" xml:"decision_plan_id,omitempty" require:"true"`
	// 离线圈客执行任务状态
	// example:
	//
	// ECN
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

// 批量样本三要素
type Item struct {
	// 样本唯一id
	// example:
	//
	// 7ef15c83-57b4-4932-9180-35b11b102075
	SampleId *string `json:"sample_id,omitempty" xml:"sample_id,omitempty" require:"true"`
	// 小写加密身份证（身份证如果有X，要大写再生成MD5）
	// example:
	//
	// 51db170b113f8c57533ae28605f2b76b
	CertNo *string `json:"cert_no,omitempty" xml:"cert_no,omitempty" require:"true"`
	// 手机号加密
	// example:
	//
	// 077e5fc68135bd8e8223a094029d4cee
	Mobile *string `json:"mobile,omitempty" xml:"mobile,omitempty" require:"true"`
	// 回溯日期（yyyyMMdd格式）
	// example:
	//
	// 20260620
	SampleBackDate *string `json:"sample_back_date,omitempty" xml:"sample_back_date,omitempty"`
}

func (s Item) String() string {
	return tea.Prettify(s)
}

func (s Item) GoString() string {
	return s.String()
}

func (s *Item) SetSampleId(v string) *Item {
	s.SampleId = &v
	return s
}

func (s *Item) SetCertNo(v string) *Item {
	s.CertNo = &v
	return s
}

func (s *Item) SetMobile(v string) *Item {
	s.Mobile = &v
	return s
}

func (s *Item) SetSampleBackDate(v string) *Item {
	s.SampleBackDate = &v
	return s
}

// 用户分层信息
type UserClassifyInfo struct {
	// 版本号
	// example:
	//
	// V1
	Version *string `json:"version,omitempty" xml:"version,omitempty" require:"true"`
	// 流量分层
	// example:
	//
	// A: <6% B: 6%~12% C:12%~18% D:18%~24% E:24%~36% F:>36% R:不分发（黑名单类）
	RateClassify *string `json:"rate_classify,omitempty" xml:"rate_classify,omitempty" require:"true"`
	// 流量扩展分层1
	// example:
	//
	// 123123
	ClassifyExt1 *string `json:"classify_ext1,omitempty" xml:"classify_ext1,omitempty"`
	// 流量扩展分层2
	// example:
	//
	// 123
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
	// example:
	//
	// true, false
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

// 可信联系方式查询
type CreditShieldFixContactResult struct {
	// 1-查得，0-未查得
	// example:
	//
	// 1
	Result *string `json:"result,omitempty" xml:"result,omitempty" require:"true"`
	// 查得手机号md5
	// example:
	//
	// [手机号md5]
	Phones []*string `json:"phones,omitempty" xml:"phones,omitempty" type:"Repeated"`
}

func (s CreditShieldFixContactResult) String() string {
	return tea.Prettify(s)
}

func (s CreditShieldFixContactResult) GoString() string {
	return s.String()
}

func (s *CreditShieldFixContactResult) SetResult(v string) *CreditShieldFixContactResult {
	s.Result = &v
	return s
}

func (s *CreditShieldFixContactResult) SetPhones(v []*string) *CreditShieldFixContactResult {
	s.Phones = v
	return s
}

// 天枢系统专用CreditAmount结构体
type CreditAmount struct {
	// 授信额度
	// example:
	//
	// 1
	CreditAmount *int64 `json:"credit_amount,omitempty" xml:"credit_amount,omitempty" require:"true"`
	// 授信余额
	// example:
	//
	// 1
	RestAmount *int64 `json:"rest_amount,omitempty" xml:"rest_amount,omitempty" require:"true"`
	// 发放日期
	PayDate *string `json:"pay_date,omitempty" xml:"pay_date,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 到期日期
	ExpireDate *string `json:"expire_date,omitempty" xml:"expire_date,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 利率单位(1:年，2：月，3：日)
	// example:
	//
	// 1
	RateUnit *string `json:"rate_unit,omitempty" xml:"rate_unit,omitempty" require:"true"`
	// 执行利率,利率值，单位%
	// 年化5%，rateValue=5
	//
	RateValue *int64 `json:"rate_value,omitempty" xml:"rate_value,omitempty" require:"true"`
	// 还款方式1等额本息2等额本金3先息后本4一次性利随本清5只还本金6等本等息
	// example:
	//
	// 1
	RepayWay *string `json:"repay_way,omitempty" xml:"repay_way,omitempty" require:"true"`
	// 状态0-正常 1-冻结 2-终止
	// example:
	//
	// 0
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 发放日期（兼容字段）
	// example:
	//
	// yyyy-MM-dd
	PayDateSup *string `json:"pay_date_sup,omitempty" xml:"pay_date_sup,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 到期日期（兼容字段）
	// example:
	//
	// yyyy-MM-dd
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

// 天枢-电商-支用查询
type EcLoanQuery struct {
	// 总条数
	// example:
	//
	// 25
	TotalCount *string `json:"total_count,omitempty" xml:"total_count,omitempty" require:"true"`
	// 订单数组
	LoanAppls []*EcLoanAppls `json:"loan_appls,omitempty" xml:"loan_appls,omitempty" require:"true" type:"Repeated"`
}

func (s EcLoanQuery) String() string {
	return tea.Prettify(s)
}

func (s EcLoanQuery) GoString() string {
	return s.String()
}

func (s *EcLoanQuery) SetTotalCount(v string) *EcLoanQuery {
	s.TotalCount = &v
	return s
}

func (s *EcLoanQuery) SetLoanAppls(v []*EcLoanAppls) *EcLoanQuery {
	s.LoanAppls = v
	return s
}

// 风控事件咨询查询入参
type EventInfo struct {
	// 事件编码
	// example:
	//
	// face_attack_strategy
	EventCode *string `json:"event_code,omitempty" xml:"event_code,omitempty" require:"true"`
	// 事件产生时间
	// example:
	//
	// 1686215967914
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
	// example:
	//
	// 1
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
	// example:
	//
	// 2018-10-10T10:10:00Z
	RepayTime *string `json:"repay_time,omitempty" xml:"repay_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 计息开始时间
	// example:
	//
	// 2018-10-10T10:10:00Z
	StartTime *string `json:"start_time,omitempty" xml:"start_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 计息结束时间
	// example:
	//
	// 2018-10-10T10:10:00Z
	EndTime *string `json:"end_time,omitempty" xml:"end_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 试算编号
	// example:
	//
	// ss
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
	// example:
	//
	// true, false
	ApplyFlag *bool `json:"apply_flag,omitempty" xml:"apply_flag,omitempty"`
	// 0:通过； 1:拒绝； 2:处理中；
	// example:
	//
	// 0
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 拒绝原因
	// example:
	//
	// xxxxxxxx
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
	// example:
	//
	// 1
	SceneStrategyId *int64 `json:"scene_strategy_id,omitempty" xml:"scene_strategy_id,omitempty" require:"true"`
	// 营销名称
	// example:
	//
	// 蚂蚁营销
	SceneStrategyName *string `json:"scene_strategy_name,omitempty" xml:"scene_strategy_name,omitempty" require:"true"`
	// 营销状态
	// example:
	//
	// PASS
	SceneStrategyStatus *string `json:"scene_strategy_status,omitempty" xml:"scene_strategy_status,omitempty" require:"true"`
	// 渠道id
	// example:
	//
	// 3
	ActionDriverCode *int64 `json:"action_driver_code,omitempty" xml:"action_driver_code,omitempty" require:"true"`
	// 渠道类型
	// example:
	//
	// ROBOT_CALL
	ChannelCode *string `json:"channel_code,omitempty" xml:"channel_code,omitempty" require:"true"`
	// 创建时间
	// example:
	//
	// 2018-10-10T10:10:00Z
	GmtCreate *string `json:"gmt_create,omitempty" xml:"gmt_create,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 修改时间
	GmtModified *string `json:"gmt_modified,omitempty" xml:"gmt_modified,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 场景策略入参名
	ActionParamInfo []*string `json:"action_param_info,omitempty" xml:"action_param_info,omitempty" type:"Repeated"`
	// 参数查询是否完成
	// example:
	//
	// true, false
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

type PushRiskplusTdiaiworkshopcloudTestRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
}

func (s PushRiskplusTdiaiworkshopcloudTestRequest) String() string {
	return tea.Prettify(s)
}

func (s PushRiskplusTdiaiworkshopcloudTestRequest) GoString() string {
	return s.String()
}

func (s *PushRiskplusTdiaiworkshopcloudTestRequest) SetAuthToken(v string) *PushRiskplusTdiaiworkshopcloudTestRequest {
	s.AuthToken = &v
	return s
}

func (s *PushRiskplusTdiaiworkshopcloudTestRequest) SetProductInstanceId(v string) *PushRiskplusTdiaiworkshopcloudTestRequest {
	s.ProductInstanceId = &v
	return s
}

type PushRiskplusTdiaiworkshopcloudTestResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s PushRiskplusTdiaiworkshopcloudTestResponse) String() string {
	return tea.Prettify(s)
}

func (s PushRiskplusTdiaiworkshopcloudTestResponse) GoString() string {
	return s.String()
}

func (s *PushRiskplusTdiaiworkshopcloudTestResponse) SetReqMsgId(v string) *PushRiskplusTdiaiworkshopcloudTestResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PushRiskplusTdiaiworkshopcloudTestResponse) SetResultCode(v string) *PushRiskplusTdiaiworkshopcloudTestResponse {
	s.ResultCode = &v
	return s
}

func (s *PushRiskplusTdiaiworkshopcloudTestResponse) SetResultMsg(v string) *PushRiskplusTdiaiworkshopcloudTestResponse {
	s.ResultMsg = &v
	return s
}

type QueryRiskplusTdiaiworkshopcloudBatchRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 商品码（事件码）蚂蚁侧提供
	EventCode *string `json:"event_code,omitempty" xml:"event_code,omitempty" require:"true"`
	// 产品code
	DispModelCode *string `json:"disp_model_code,omitempty" xml:"disp_model_code,omitempty" require:"true"`
	// 要查询的dataIdList
	QueryDataIdList []*string `json:"query_data_id_list,omitempty" xml:"query_data_id_list,omitempty" require:"true" type:"Repeated"`
}

func (s QueryRiskplusTdiaiworkshopcloudBatchRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryRiskplusTdiaiworkshopcloudBatchRequest) GoString() string {
	return s.String()
}

func (s *QueryRiskplusTdiaiworkshopcloudBatchRequest) SetAuthToken(v string) *QueryRiskplusTdiaiworkshopcloudBatchRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryRiskplusTdiaiworkshopcloudBatchRequest) SetProductInstanceId(v string) *QueryRiskplusTdiaiworkshopcloudBatchRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryRiskplusTdiaiworkshopcloudBatchRequest) SetEventCode(v string) *QueryRiskplusTdiaiworkshopcloudBatchRequest {
	s.EventCode = &v
	return s
}

func (s *QueryRiskplusTdiaiworkshopcloudBatchRequest) SetDispModelCode(v string) *QueryRiskplusTdiaiworkshopcloudBatchRequest {
	s.DispModelCode = &v
	return s
}

func (s *QueryRiskplusTdiaiworkshopcloudBatchRequest) SetQueryDataIdList(v []*string) *QueryRiskplusTdiaiworkshopcloudBatchRequest {
	s.QueryDataIdList = v
	return s
}

type QueryRiskplusTdiaiworkshopcloudBatchResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 样本回溯结果
	SampleResult []*ResultItem `json:"sample_result,omitempty" xml:"sample_result,omitempty" type:"Repeated"`
}

func (s QueryRiskplusTdiaiworkshopcloudBatchResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryRiskplusTdiaiworkshopcloudBatchResponse) GoString() string {
	return s.String()
}

func (s *QueryRiskplusTdiaiworkshopcloudBatchResponse) SetReqMsgId(v string) *QueryRiskplusTdiaiworkshopcloudBatchResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryRiskplusTdiaiworkshopcloudBatchResponse) SetResultCode(v string) *QueryRiskplusTdiaiworkshopcloudBatchResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryRiskplusTdiaiworkshopcloudBatchResponse) SetResultMsg(v string) *QueryRiskplusTdiaiworkshopcloudBatchResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryRiskplusTdiaiworkshopcloudBatchResponse) SetSampleResult(v []*ResultItem) *QueryRiskplusTdiaiworkshopcloudBatchResponse {
	s.SampleResult = v
	return s
}

type PushRiskplusTdiaiworkshopcloudBatchRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 商品码（事件码）
	EventCode *string `json:"event_code,omitempty" xml:"event_code,omitempty" require:"true"`
	// 产品码
	DispModelCode *string `json:"disp_model_code,omitempty" xml:"disp_model_code,omitempty" require:"true"`
	// 业务码
	BusinessType *string `json:"business_type,omitempty" xml:"business_type,omitempty" require:"true"`
	// 加密方式
	HashType *string `json:"hash_type,omitempty" xml:"hash_type,omitempty" require:"true"`
	// 请求唯一id，幂等设计
	RequestId *string `json:"request_id,omitempty" xml:"request_id,omitempty" require:"true"`
	// 样本结构体
	SampleList []*Item `json:"sample_list,omitempty" xml:"sample_list,omitempty" require:"true" type:"Repeated"`
	// 回溯日期
	BackDate *string `json:"back_date,omitempty" xml:"back_date,omitempty"`
	// 回调地址
	CallbackUrl *string `json:"callback_url,omitempty" xml:"callback_url,omitempty"`
}

func (s PushRiskplusTdiaiworkshopcloudBatchRequest) String() string {
	return tea.Prettify(s)
}

func (s PushRiskplusTdiaiworkshopcloudBatchRequest) GoString() string {
	return s.String()
}

func (s *PushRiskplusTdiaiworkshopcloudBatchRequest) SetAuthToken(v string) *PushRiskplusTdiaiworkshopcloudBatchRequest {
	s.AuthToken = &v
	return s
}

func (s *PushRiskplusTdiaiworkshopcloudBatchRequest) SetProductInstanceId(v string) *PushRiskplusTdiaiworkshopcloudBatchRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PushRiskplusTdiaiworkshopcloudBatchRequest) SetEventCode(v string) *PushRiskplusTdiaiworkshopcloudBatchRequest {
	s.EventCode = &v
	return s
}

func (s *PushRiskplusTdiaiworkshopcloudBatchRequest) SetDispModelCode(v string) *PushRiskplusTdiaiworkshopcloudBatchRequest {
	s.DispModelCode = &v
	return s
}

func (s *PushRiskplusTdiaiworkshopcloudBatchRequest) SetBusinessType(v string) *PushRiskplusTdiaiworkshopcloudBatchRequest {
	s.BusinessType = &v
	return s
}

func (s *PushRiskplusTdiaiworkshopcloudBatchRequest) SetHashType(v string) *PushRiskplusTdiaiworkshopcloudBatchRequest {
	s.HashType = &v
	return s
}

func (s *PushRiskplusTdiaiworkshopcloudBatchRequest) SetRequestId(v string) *PushRiskplusTdiaiworkshopcloudBatchRequest {
	s.RequestId = &v
	return s
}

func (s *PushRiskplusTdiaiworkshopcloudBatchRequest) SetSampleList(v []*Item) *PushRiskplusTdiaiworkshopcloudBatchRequest {
	s.SampleList = v
	return s
}

func (s *PushRiskplusTdiaiworkshopcloudBatchRequest) SetBackDate(v string) *PushRiskplusTdiaiworkshopcloudBatchRequest {
	s.BackDate = &v
	return s
}

func (s *PushRiskplusTdiaiworkshopcloudBatchRequest) SetCallbackUrl(v string) *PushRiskplusTdiaiworkshopcloudBatchRequest {
	s.CallbackUrl = &v
	return s
}

type PushRiskplusTdiaiworkshopcloudBatchResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 批量请求响应结果
	SampleIdList []*ResItem `json:"sample_id_list,omitempty" xml:"sample_id_list,omitempty" type:"Repeated"`
}

func (s PushRiskplusTdiaiworkshopcloudBatchResponse) String() string {
	return tea.Prettify(s)
}

func (s PushRiskplusTdiaiworkshopcloudBatchResponse) GoString() string {
	return s.String()
}

func (s *PushRiskplusTdiaiworkshopcloudBatchResponse) SetReqMsgId(v string) *PushRiskplusTdiaiworkshopcloudBatchResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PushRiskplusTdiaiworkshopcloudBatchResponse) SetResultCode(v string) *PushRiskplusTdiaiworkshopcloudBatchResponse {
	s.ResultCode = &v
	return s
}

func (s *PushRiskplusTdiaiworkshopcloudBatchResponse) SetResultMsg(v string) *PushRiskplusTdiaiworkshopcloudBatchResponse {
	s.ResultMsg = &v
	return s
}

func (s *PushRiskplusTdiaiworkshopcloudBatchResponse) SetSampleIdList(v []*ResItem) *PushRiskplusTdiaiworkshopcloudBatchResponse {
	s.SampleIdList = v
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
				"_prod_code":       tea.String("FRISKDESCION"),
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

// Description:
//
// Description: 接口创建测试
//
// Summary: 接口创建测试
func (client *Client) PushRiskplusTdiaiworkshopcloudTest(request *PushRiskplusTdiaiworkshopcloudTestRequest) (_result *PushRiskplusTdiaiworkshopcloudTestResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PushRiskplusTdiaiworkshopcloudTestResponse{}
	_body, _err := client.PushRiskplusTdiaiworkshopcloudTestEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 接口创建测试
//
// Summary: 接口创建测试
func (client *Client) PushRiskplusTdiaiworkshopcloudTestEx(request *PushRiskplusTdiaiworkshopcloudTestRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PushRiskplusTdiaiworkshopcloudTestResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PushRiskplusTdiaiworkshopcloudTestResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.tdiaiworkshopcloud.test.push"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 风控离线批量样本数据查询接口
//
// Summary: 风控离线批量样本数据查询接口
func (client *Client) QueryRiskplusTdiaiworkshopcloudBatch(request *QueryRiskplusTdiaiworkshopcloudBatchRequest) (_result *QueryRiskplusTdiaiworkshopcloudBatchResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryRiskplusTdiaiworkshopcloudBatchResponse{}
	_body, _err := client.QueryRiskplusTdiaiworkshopcloudBatchEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 风控离线批量样本数据查询接口
//
// Summary: 风控离线批量样本数据查询接口
func (client *Client) QueryRiskplusTdiaiworkshopcloudBatchEx(request *QueryRiskplusTdiaiworkshopcloudBatchRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryRiskplusTdiaiworkshopcloudBatchResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryRiskplusTdiaiworkshopcloudBatchResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.tdiaiworkshopcloud.batch.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 风控离线批量样本数据上传接口
//
// Summary: 风控离线批量样本数据上传接口
func (client *Client) PushRiskplusTdiaiworkshopcloudBatch(request *PushRiskplusTdiaiworkshopcloudBatchRequest) (_result *PushRiskplusTdiaiworkshopcloudBatchResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PushRiskplusTdiaiworkshopcloudBatchResponse{}
	_body, _err := client.PushRiskplusTdiaiworkshopcloudBatchEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 风控离线批量样本数据上传接口
//
// Summary: 风控离线批量样本数据上传接口
func (client *Client) PushRiskplusTdiaiworkshopcloudBatchEx(request *PushRiskplusTdiaiworkshopcloudBatchRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PushRiskplusTdiaiworkshopcloudBatchResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PushRiskplusTdiaiworkshopcloudBatchResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("riskplus.tdiaiworkshopcloud.batch.push"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
