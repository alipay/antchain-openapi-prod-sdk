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
	MaxIdleTimeMillis *int64 `json:"maxIdleTimeMillis,omitempty" xml:"maxIdleTimeMillis,omitempty"`
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

func (s *Config) SetMaxIdleTimeMillis(v int64) *Config {
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

// AiExtraAttr
type AiExtraAttr struct {
	// time_range_thres
	TimeRangeThres *string `json:"time_range_thres,omitempty" xml:"time_range_thres,omitempty"`
	// abnormal_value_thres
	AbnormalValueThres *string `json:"abnormal_value_thres,omitempty" xml:"abnormal_value_thres,omitempty"`
	// value_range_thres
	ValueRangeThres *string `json:"value_range_thres,omitempty" xml:"value_range_thres,omitempty"`
	// algo_score_thres
	AlgoScoreThres *string `json:"algo_score_thres,omitempty" xml:"algo_score_thres,omitempty"`
}

func (s AiExtraAttr) String() string {
	return tea.Prettify(s)
}

func (s AiExtraAttr) GoString() string {
	return s.String()
}

func (s *AiExtraAttr) SetTimeRangeThres(v string) *AiExtraAttr {
	s.TimeRangeThres = &v
	return s
}

func (s *AiExtraAttr) SetAbnormalValueThres(v string) *AiExtraAttr {
	s.AbnormalValueThres = &v
	return s
}

func (s *AiExtraAttr) SetValueRangeThres(v string) *AiExtraAttr {
	s.ValueRangeThres = &v
	return s
}

func (s *AiExtraAttr) SetAlgoScoreThres(v string) *AiExtraAttr {
	s.AlgoScoreThres = &v
	return s
}

// Threshold
type Threshold struct {
	// level1
	Level1 *string `json:"level1,omitempty" xml:"level1,omitempty"`
	// level2
	Level2 *string `json:"level2,omitempty" xml:"level2,omitempty"`
	// level3
	Level3 *string `json:"level3,omitempty" xml:"level3,omitempty"`
	// im
	Im *string `json:"im,omitempty" xml:"im,omitempty"`
	// sms
	Sms *string `json:"sms,omitempty" xml:"sms,omitempty"`
	// control_plan
	ControlPlan *string `json:"control_plan,omitempty" xml:"control_plan,omitempty"`
}

func (s Threshold) String() string {
	return tea.Prettify(s)
}

func (s Threshold) GoString() string {
	return s.String()
}

func (s *Threshold) SetLevel1(v string) *Threshold {
	s.Level1 = &v
	return s
}

func (s *Threshold) SetLevel2(v string) *Threshold {
	s.Level2 = &v
	return s
}

func (s *Threshold) SetLevel3(v string) *Threshold {
	s.Level3 = &v
	return s
}

func (s *Threshold) SetIm(v string) *Threshold {
	s.Im = &v
	return s
}

func (s *Threshold) SetSms(v string) *Threshold {
	s.Sms = &v
	return s
}

func (s *Threshold) SetControlPlan(v string) *Threshold {
	s.ControlPlan = &v
	return s
}

// DimFilter
type DimFilter struct {
	// dim_index
	DimIndex *int64 `json:"dim_index,omitempty" xml:"dim_index,omitempty"`
	// dim_name
	DimName *string `json:"dim_name,omitempty" xml:"dim_name,omitempty"`
	// white_names
	WhiteNames []*string `json:"white_names,omitempty" xml:"white_names,omitempty" type:"Repeated"`
	// black_names
	BlackNames []*string `json:"black_names,omitempty" xml:"black_names,omitempty" type:"Repeated"`
}

func (s DimFilter) String() string {
	return tea.Prettify(s)
}

func (s DimFilter) GoString() string {
	return s.String()
}

func (s *DimFilter) SetDimIndex(v int64) *DimFilter {
	s.DimIndex = &v
	return s
}

func (s *DimFilter) SetDimName(v string) *DimFilter {
	s.DimName = &v
	return s
}

func (s *DimFilter) SetWhiteNames(v []*string) *DimFilter {
	s.WhiteNames = v
	return s
}

func (s *DimFilter) SetBlackNames(v []*string) *DimFilter {
	s.BlackNames = v
	return s
}

// TimeFilter
type TimeFilter struct {
	// from
	From *string `json:"from,omitempty" xml:"from,omitempty"`
	// to
	To *string `json:"to,omitempty" xml:"to,omitempty"`
	// weeks
	Weeks []*int64 `json:"weeks,omitempty" xml:"weeks,omitempty" type:"Repeated"`
}

func (s TimeFilter) String() string {
	return tea.Prettify(s)
}

func (s TimeFilter) GoString() string {
	return s.String()
}

func (s *TimeFilter) SetFrom(v string) *TimeFilter {
	s.From = &v
	return s
}

func (s *TimeFilter) SetTo(v string) *TimeFilter {
	s.To = &v
	return s
}

func (s *TimeFilter) SetWeeks(v []*int64) *TimeFilter {
	s.Weeks = v
	return s
}

// Trigger
type Trigger struct {
	// value_field
	ValueField *string `json:"value_field,omitempty" xml:"value_field,omitempty"`
	// value_index
	ValueIndex *int64 `json:"value_index,omitempty" xml:"value_index,omitempty"`
	// type
	Type *string `json:"type,omitempty" xml:"type,omitempty"`
	// n
	N *int64 `json:"n,omitempty" xml:"n,omitempty"`
	// compare
	Compare *string `json:"compare,omitempty" xml:"compare,omitempty"`
	// compare_percent
	ComparePercent *string `json:"compare_percent,omitempty" xml:"compare_percent,omitempty"`
	// threshold
	Threshold *Threshold `json:"threshold,omitempty" xml:"threshold,omitempty"`
	// threshold_copy
	ThresholdCopy *Threshold `json:"threshold_copy,omitempty" xml:"threshold_copy,omitempty"`
	// value_is_percent
	ValueIsPercent *bool `json:"value_is_percent,omitempty" xml:"value_is_percent,omitempty"`
}

func (s Trigger) String() string {
	return tea.Prettify(s)
}

func (s Trigger) GoString() string {
	return s.String()
}

func (s *Trigger) SetValueField(v string) *Trigger {
	s.ValueField = &v
	return s
}

func (s *Trigger) SetValueIndex(v int64) *Trigger {
	s.ValueIndex = &v
	return s
}

func (s *Trigger) SetType(v string) *Trigger {
	s.Type = &v
	return s
}

func (s *Trigger) SetN(v int64) *Trigger {
	s.N = &v
	return s
}

func (s *Trigger) SetCompare(v string) *Trigger {
	s.Compare = &v
	return s
}

func (s *Trigger) SetComparePercent(v string) *Trigger {
	s.ComparePercent = &v
	return s
}

func (s *Trigger) SetThreshold(v *Threshold) *Trigger {
	s.Threshold = v
	return s
}

func (s *Trigger) SetThresholdCopy(v *Threshold) *Trigger {
	s.ThresholdCopy = v
	return s
}

func (s *Trigger) SetValueIsPercent(v bool) *Trigger {
	s.ValueIsPercent = &v
	return s
}

// ControlPlan
type ControlPlan struct {
	// action_id
	ActionId *int64 `json:"action_id,omitempty" xml:"action_id,omitempty"`
	// name
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// plugin_type
	PluginType *string `json:"plugin_type,omitempty" xml:"plugin_type,omitempty"`
	// plugin_id
	PluginId *string `json:"plugin_id,omitempty" xml:"plugin_id,omitempty"`
	// file_id
	FileId *int64 `json:"file_id,omitempty" xml:"file_id,omitempty"`
	// ds_name
	DsName *string `json:"ds_name,omitempty" xml:"ds_name,omitempty"`
}

func (s ControlPlan) String() string {
	return tea.Prettify(s)
}

func (s ControlPlan) GoString() string {
	return s.String()
}

func (s *ControlPlan) SetActionId(v int64) *ControlPlan {
	s.ActionId = &v
	return s
}

func (s *ControlPlan) SetName(v string) *ControlPlan {
	s.Name = &v
	return s
}

func (s *ControlPlan) SetPluginType(v string) *ControlPlan {
	s.PluginType = &v
	return s
}

func (s *ControlPlan) SetPluginId(v string) *ControlPlan {
	s.PluginId = &v
	return s
}

func (s *ControlPlan) SetFileId(v int64) *ControlPlan {
	s.FileId = &v
	return s
}

func (s *ControlPlan) SetDsName(v string) *ControlPlan {
	s.DsName = &v
	return s
}

// TimeRange
type TimeRange struct {
	// start
	Start *int64 `json:"start,omitempty" xml:"start,omitempty"`
	// end
	End *int64 `json:"end,omitempty" xml:"end,omitempty"`
}

func (s TimeRange) String() string {
	return tea.Prettify(s)
}

func (s TimeRange) GoString() string {
	return s.String()
}

func (s *TimeRange) SetStart(v int64) *TimeRange {
	s.Start = &v
	return s
}

func (s *TimeRange) SetEnd(v int64) *TimeRange {
	s.End = &v
	return s
}

// AiAlarmParams
type AiAlarmParams struct {
	// value_fields
	ValueFields []*string `json:"value_fields,omitempty" xml:"value_fields,omitempty" type:"Repeated"`
	// ai_algo_code
	AiAlgoCode *string `json:"ai_algo_code,omitempty" xml:"ai_algo_code,omitempty"`
	// ai_extra_attr
	AiExtraAttr *AiExtraAttr `json:"ai_extra_attr,omitempty" xml:"ai_extra_attr,omitempty"`
}

func (s AiAlarmParams) String() string {
	return tea.Prettify(s)
}

func (s AiAlarmParams) GoString() string {
	return s.String()
}

func (s *AiAlarmParams) SetValueFields(v []*string) *AiAlarmParams {
	s.ValueFields = v
	return s
}

func (s *AiAlarmParams) SetAiAlgoCode(v string) *AiAlarmParams {
	s.AiAlgoCode = &v
	return s
}

func (s *AiAlarmParams) SetAiExtraAttr(v *AiExtraAttr) *AiAlarmParams {
	s.AiExtraAttr = v
	return s
}

// Rule
type Rule struct {
	// ai_alarm_params
	AiAlarmParams *AiAlarmParams `json:"ai_alarm_params,omitempty" xml:"ai_alarm_params,omitempty"`
	// name
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// run_type
	RunType *string `json:"run_type,omitempty" xml:"run_type,omitempty"`
	// cal_time_range
	CalTimeRange *TimeRange `json:"cal_time_range,omitempty" xml:"cal_time_range,omitempty"`
	// exclude_data_time_range
	ExcludeDataTimeRange *TimeRange `json:"exclude_data_time_range,omitempty" xml:"exclude_data_time_range,omitempty"`
	// dim_filters
	DimFilters []*DimFilter `json:"dim_filters,omitempty" xml:"dim_filters,omitempty" type:"Repeated"`
	// time_filter
	TimeFilter *TimeFilter `json:"time_filter,omitempty" xml:"time_filter,omitempty"`
	// triggers
	Triggers []*Trigger `json:"triggers,omitempty" xml:"triggers,omitempty" type:"Repeated"`
	// andor
	Andor *string `json:"andor,omitempty" xml:"andor,omitempty"`
	// control_plan_auto
	ControlPlanAuto *bool `json:"control_plan_auto,omitempty" xml:"control_plan_auto,omitempty"`
	// control_plans
	ControlPlans []*ControlPlan `json:"control_plans,omitempty" xml:"control_plans,omitempty" type:"Repeated"`
	// function_id
	FunctionId *int64 `json:"function_id,omitempty" xml:"function_id,omitempty"`
	// from_tmp_rule
	FromTmpRule *int64 `json:"from_tmp_rule,omitempty" xml:"from_tmp_rule,omitempty"`
	// rule_type
	RuleType *string `json:"rule_type,omitempty" xml:"rule_type,omitempty"`
	// ports
	Ports []*string `json:"ports,omitempty" xml:"ports,omitempty" type:"Repeated"`
	// group_by
	GroupBy []*string `json:"group_by,omitempty" xml:"group_by,omitempty" type:"Repeated"`
}

func (s Rule) String() string {
	return tea.Prettify(s)
}

func (s Rule) GoString() string {
	return s.String()
}

func (s *Rule) SetAiAlarmParams(v *AiAlarmParams) *Rule {
	s.AiAlarmParams = v
	return s
}

func (s *Rule) SetName(v string) *Rule {
	s.Name = &v
	return s
}

func (s *Rule) SetRunType(v string) *Rule {
	s.RunType = &v
	return s
}

func (s *Rule) SetCalTimeRange(v *TimeRange) *Rule {
	s.CalTimeRange = v
	return s
}

func (s *Rule) SetExcludeDataTimeRange(v *TimeRange) *Rule {
	s.ExcludeDataTimeRange = v
	return s
}

func (s *Rule) SetDimFilters(v []*DimFilter) *Rule {
	s.DimFilters = v
	return s
}

func (s *Rule) SetTimeFilter(v *TimeFilter) *Rule {
	s.TimeFilter = v
	return s
}

func (s *Rule) SetTriggers(v []*Trigger) *Rule {
	s.Triggers = v
	return s
}

func (s *Rule) SetAndor(v string) *Rule {
	s.Andor = &v
	return s
}

func (s *Rule) SetControlPlanAuto(v bool) *Rule {
	s.ControlPlanAuto = &v
	return s
}

func (s *Rule) SetControlPlans(v []*ControlPlan) *Rule {
	s.ControlPlans = v
	return s
}

func (s *Rule) SetFunctionId(v int64) *Rule {
	s.FunctionId = &v
	return s
}

func (s *Rule) SetFromTmpRule(v int64) *Rule {
	s.FromTmpRule = &v
	return s
}

func (s *Rule) SetRuleType(v string) *Rule {
	s.RuleType = &v
	return s
}

func (s *Rule) SetPorts(v []*string) *Rule {
	s.Ports = v
	return s
}

func (s *Rule) SetGroupBy(v []*string) *Rule {
	s.GroupBy = v
	return s
}

// Model
type Model struct {
	// rules
	Rules []*Rule `json:"rules,omitempty" xml:"rules,omitempty" type:"Repeated"`
	// batch_rule_id
	BatchRuleId *string `json:"batch_rule_id,omitempty" xml:"batch_rule_id,omitempty"`
}

func (s Model) String() string {
	return tea.Prettify(s)
}

func (s Model) GoString() string {
	return s.String()
}

func (s *Model) SetRules(v []*Rule) *Model {
	s.Rules = v
	return s
}

func (s *Model) SetBatchRuleId(v string) *Model {
	s.BatchRuleId = &v
	return s
}

// StackState
type StackState struct {
	// state
	State *string `json:"state,omitempty" xml:"state,omitempty"`
	// values
	Values []*string `json:"values,omitempty" xml:"values,omitempty" type:"Repeated"`
	// is_black
	IsBlack *bool `json:"is_black,omitempty" xml:"is_black,omitempty"`
}

func (s StackState) String() string {
	return tea.Prettify(s)
}

func (s StackState) GoString() string {
	return s.String()
}

func (s *StackState) SetState(v string) *StackState {
	s.State = &v
	return s
}

func (s *StackState) SetValues(v []*string) *StackState {
	s.Values = v
	return s
}

func (s *StackState) SetIsBlack(v bool) *StackState {
	s.IsBlack = &v
	return s
}

// AlarmHistory
type AlarmHistory struct {
	// alarm_level
	AlarmLevel *int64 `json:"alarm_level,omitempty" xml:"alarm_level,omitempty"`
	// alarmPkgId
	AlarmPkgId *int64 `json:"alarm_pkg_id,omitempty" xml:"alarm_pkg_id,omitempty"`
	// alarm_rule_name
	AlarmRuleName *string `json:"alarm_rule_name,omitempty" xml:"alarm_rule_name,omitempty"`
	// alarmSourceType
	AlarmSourceType *string `json:"alarm_source_type,omitempty" xml:"alarm_source_type,omitempty"`
	// alarm_time
	AlarmTime *int64 `json:"alarm_time,omitempty" xml:"alarm_time,omitempty"`
	// biz_domain_id
	BizDomainId *int64 `json:"biz_domain_id,omitempty" xml:"biz_domain_id,omitempty"`
	// context
	Context *string `json:"context,omitempty" xml:"context,omitempty"`
	// custom_plugin_id
	CustomPluginId *int64 `json:"custom_plugin_id,omitempty" xml:"custom_plugin_id,omitempty"`
	// id
	Id *int64 `json:"id,omitempty" xml:"id,omitempty"`
	// meta_group_id
	MetaGroupId *int64 `json:"meta_group_id,omitempty" xml:"meta_group_id,omitempty"`
	// msg
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty"`
	// stack_entity_id
	StackEntityId *int64 `json:"stack_entity_id,omitempty" xml:"stack_entity_id,omitempty"`
	// stack_id
	StackId *int64 `json:"stack_id,omitempty" xml:"stack_id,omitempty"`
	// stack_monitor_item_name
	StackMonitorItemName *string `json:"stack_monitor_item_name,omitempty" xml:"stack_monitor_item_name,omitempty"`
	// stack_universal_table_id
	StackUniversalTableId *string `json:"stack_universal_table_id,omitempty" xml:"stack_universal_table_id,omitempty"`
	// tag_value_id
	TagValueId *int64 `json:"tag_value_id,omitempty" xml:"tag_value_id,omitempty"`
	// tenant_id
	TenantId *int64 `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// workspace_id
	WorkspaceId *int64 `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s AlarmHistory) String() string {
	return tea.Prettify(s)
}

func (s AlarmHistory) GoString() string {
	return s.String()
}

func (s *AlarmHistory) SetAlarmLevel(v int64) *AlarmHistory {
	s.AlarmLevel = &v
	return s
}

func (s *AlarmHistory) SetAlarmPkgId(v int64) *AlarmHistory {
	s.AlarmPkgId = &v
	return s
}

func (s *AlarmHistory) SetAlarmRuleName(v string) *AlarmHistory {
	s.AlarmRuleName = &v
	return s
}

func (s *AlarmHistory) SetAlarmSourceType(v string) *AlarmHistory {
	s.AlarmSourceType = &v
	return s
}

func (s *AlarmHistory) SetAlarmTime(v int64) *AlarmHistory {
	s.AlarmTime = &v
	return s
}

func (s *AlarmHistory) SetBizDomainId(v int64) *AlarmHistory {
	s.BizDomainId = &v
	return s
}

func (s *AlarmHistory) SetContext(v string) *AlarmHistory {
	s.Context = &v
	return s
}

func (s *AlarmHistory) SetCustomPluginId(v int64) *AlarmHistory {
	s.CustomPluginId = &v
	return s
}

func (s *AlarmHistory) SetId(v int64) *AlarmHistory {
	s.Id = &v
	return s
}

func (s *AlarmHistory) SetMetaGroupId(v int64) *AlarmHistory {
	s.MetaGroupId = &v
	return s
}

func (s *AlarmHistory) SetMsg(v string) *AlarmHistory {
	s.Msg = &v
	return s
}

func (s *AlarmHistory) SetStackEntityId(v int64) *AlarmHistory {
	s.StackEntityId = &v
	return s
}

func (s *AlarmHistory) SetStackId(v int64) *AlarmHistory {
	s.StackId = &v
	return s
}

func (s *AlarmHistory) SetStackMonitorItemName(v string) *AlarmHistory {
	s.StackMonitorItemName = &v
	return s
}

func (s *AlarmHistory) SetStackUniversalTableId(v string) *AlarmHistory {
	s.StackUniversalTableId = &v
	return s
}

func (s *AlarmHistory) SetTagValueId(v int64) *AlarmHistory {
	s.TagValueId = &v
	return s
}

func (s *AlarmHistory) SetTenantId(v int64) *AlarmHistory {
	s.TenantId = &v
	return s
}

func (s *AlarmHistory) SetWorkspaceId(v int64) *AlarmHistory {
	s.WorkspaceId = &v
	return s
}

// OpsFilter
type OpsFilter struct {
	// black
	Black *bool `json:"black,omitempty" xml:"black,omitempty"`
	// names
	Names []*string `json:"names,omitempty" xml:"names,omitempty" type:"Repeated"`
}

func (s OpsFilter) String() string {
	return tea.Prettify(s)
}

func (s OpsFilter) GoString() string {
	return s.String()
}

func (s *OpsFilter) SetBlack(v bool) *OpsFilter {
	s.Black = &v
	return s
}

func (s *OpsFilter) SetNames(v []*string) *OpsFilter {
	s.Names = v
	return s
}

// 对应Map结构
type KeySet struct {
	// key
	Key *string `json:"key,omitempty" xml:"key,omitempty"`
	// value
	Value *string `json:"value,omitempty" xml:"value,omitempty"`
}

func (s KeySet) String() string {
	return tea.Prettify(s)
}

func (s KeySet) GoString() string {
	return s.String()
}

func (s *KeySet) SetKey(v string) *KeySet {
	s.Key = &v
	return s
}

func (s *KeySet) SetValue(v string) *KeySet {
	s.Value = &v
	return s
}

// AlarmDO
type AlarmDO struct {
	// model
	Model *Model `json:"model,omitempty" xml:"model,omitempty"`
	// level
	Level *string `json:"level,omitempty" xml:"level,omitempty"`
	// frequency
	Frequency *int64 `json:"frequency,omitempty" xml:"frequency,omitempty"`
	// silent_minute
	SilentMinute *string `json:"silent_minute,omitempty" xml:"silent_minute,omitempty"`
	// emergency_copy
	EmergencyCopy *string `json:"emergency_copy,omitempty" xml:"emergency_copy,omitempty"`
	// emergency_url
	EmergencyUrl *string `json:"emergency_url,omitempty" xml:"emergency_url,omitempty"`
	// time_zone
	TimeZone *string `json:"time_zone,omitempty" xml:"time_zone,omitempty"`
	// time_zone_custom
	TimeZoneCustom *bool `json:"time_zone_custom,omitempty" xml:"time_zone_custom,omitempty"`
}

func (s AlarmDO) String() string {
	return tea.Prettify(s)
}

func (s AlarmDO) GoString() string {
	return s.String()
}

func (s *AlarmDO) SetModel(v *Model) *AlarmDO {
	s.Model = v
	return s
}

func (s *AlarmDO) SetLevel(v string) *AlarmDO {
	s.Level = &v
	return s
}

func (s *AlarmDO) SetFrequency(v int64) *AlarmDO {
	s.Frequency = &v
	return s
}

func (s *AlarmDO) SetSilentMinute(v string) *AlarmDO {
	s.SilentMinute = &v
	return s
}

func (s *AlarmDO) SetEmergencyCopy(v string) *AlarmDO {
	s.EmergencyCopy = &v
	return s
}

func (s *AlarmDO) SetEmergencyUrl(v string) *AlarmDO {
	s.EmergencyUrl = &v
	return s
}

func (s *AlarmDO) SetTimeZone(v string) *AlarmDO {
	s.TimeZone = &v
	return s
}

func (s *AlarmDO) SetTimeZoneCustom(v bool) *AlarmDO {
	s.TimeZoneCustom = &v
	return s
}

// Metrics 中的一个 field
type TimeSeriesMetricsField struct {
	// Field key
	Key *string `json:"key,omitempty" xml:"key,omitempty"`
	// Field value
	Value *string `json:"value,omitempty" xml:"value,omitempty"`
}

func (s TimeSeriesMetricsField) String() string {
	return tea.Prettify(s)
}

func (s TimeSeriesMetricsField) GoString() string {
	return s.String()
}

func (s *TimeSeriesMetricsField) SetKey(v string) *TimeSeriesMetricsField {
	s.Key = &v
	return s
}

func (s *TimeSeriesMetricsField) SetValue(v string) *TimeSeriesMetricsField {
	s.Value = &v
	return s
}

// TopAlarmDO
type TopAlarmDO struct {
	// error
	Error *string `json:"error,omitempty" xml:"error,omitempty"`
	// error_count
	ErrorCount *int64 `json:"error_count,omitempty" xml:"error_count,omitempty"`
	// warn
	Warn *string `json:"warn,omitempty" xml:"warn,omitempty"`
	// warn_count
	WarnCount *int64 `json:"warn_count,omitempty" xml:"warn_count,omitempty"`
	// alarm_level
	AlarmLevel *int64 `json:"alarm_level,omitempty" xml:"alarm_level,omitempty"`
	// max_alarm_count
	MaxAlarmCount *int64 `json:"max_alarm_count,omitempty" xml:"max_alarm_count,omitempty"`
	// emergency_copy
	EmergencyCopy *string `json:"emergency_copy,omitempty" xml:"emergency_copy,omitempty"`
	// emergency_url
	EmergencyUrl *string `json:"emergency_url,omitempty" xml:"emergency_url,omitempty"`
}

func (s TopAlarmDO) String() string {
	return tea.Prettify(s)
}

func (s TopAlarmDO) GoString() string {
	return s.String()
}

func (s *TopAlarmDO) SetError(v string) *TopAlarmDO {
	s.Error = &v
	return s
}

func (s *TopAlarmDO) SetErrorCount(v int64) *TopAlarmDO {
	s.ErrorCount = &v
	return s
}

func (s *TopAlarmDO) SetWarn(v string) *TopAlarmDO {
	s.Warn = &v
	return s
}

func (s *TopAlarmDO) SetWarnCount(v int64) *TopAlarmDO {
	s.WarnCount = &v
	return s
}

func (s *TopAlarmDO) SetAlarmLevel(v int64) *TopAlarmDO {
	s.AlarmLevel = &v
	return s
}

func (s *TopAlarmDO) SetMaxAlarmCount(v int64) *TopAlarmDO {
	s.MaxAlarmCount = &v
	return s
}

func (s *TopAlarmDO) SetEmergencyCopy(v string) *TopAlarmDO {
	s.EmergencyCopy = &v
	return s
}

func (s *TopAlarmDO) SetEmergencyUrl(v string) *TopAlarmDO {
	s.EmergencyUrl = &v
	return s
}

// PontusTrendRequest
type PontusTrendRequest struct {
	// token
	Token *string `json:"token,omitempty" xml:"token,omitempty"`
	// metric_table
	MetricTable *string `json:"metric_table,omitempty" xml:"metric_table,omitempty"`
	// site_env
	SiteEnv *string `json:"site_env,omitempty" xml:"site_env,omitempty"`
	// view_id
	ViewId *string `json:"view_id,omitempty" xml:"view_id,omitempty"`
	// period_type
	PeriodType *string `json:"period_type,omitempty" xml:"period_type,omitempty"`
	// extraDimNames
	ExtraDimNames []*string `json:"extra_dim_names,omitempty" xml:"extra_dim_names,omitempty" type:"Repeated"`
	// metric_filter
	MetricFilter *string `json:"metric_filter,omitempty" xml:"metric_filter,omitempty"`
	// start
	Start *int64 `json:"start,omitempty" xml:"start,omitempty"`
	// end
	End *int64 `json:"end,omitempty" xml:"end,omitempty"`
	// dim_conditions_list
	DimConditionsList []*KeySet `json:"dim_conditions_list,omitempty" xml:"dim_conditions_list,omitempty" type:"Repeated"`
	// dim_expression
	DimExpression *KeySet `json:"dim_expression,omitempty" xml:"dim_expression,omitempty"`
	// dim_expression_list
	DimExpressionList []*KeySet `json:"dim_expression_list,omitempty" xml:"dim_expression_list,omitempty" type:"Repeated"`
}

func (s PontusTrendRequest) String() string {
	return tea.Prettify(s)
}

func (s PontusTrendRequest) GoString() string {
	return s.String()
}

func (s *PontusTrendRequest) SetToken(v string) *PontusTrendRequest {
	s.Token = &v
	return s
}

func (s *PontusTrendRequest) SetMetricTable(v string) *PontusTrendRequest {
	s.MetricTable = &v
	return s
}

func (s *PontusTrendRequest) SetSiteEnv(v string) *PontusTrendRequest {
	s.SiteEnv = &v
	return s
}

func (s *PontusTrendRequest) SetViewId(v string) *PontusTrendRequest {
	s.ViewId = &v
	return s
}

func (s *PontusTrendRequest) SetPeriodType(v string) *PontusTrendRequest {
	s.PeriodType = &v
	return s
}

func (s *PontusTrendRequest) SetExtraDimNames(v []*string) *PontusTrendRequest {
	s.ExtraDimNames = v
	return s
}

func (s *PontusTrendRequest) SetMetricFilter(v string) *PontusTrendRequest {
	s.MetricFilter = &v
	return s
}

func (s *PontusTrendRequest) SetStart(v int64) *PontusTrendRequest {
	s.Start = &v
	return s
}

func (s *PontusTrendRequest) SetEnd(v int64) *PontusTrendRequest {
	s.End = &v
	return s
}

func (s *PontusTrendRequest) SetDimConditionsList(v []*KeySet) *PontusTrendRequest {
	s.DimConditionsList = v
	return s
}

func (s *PontusTrendRequest) SetDimExpression(v *KeySet) *PontusTrendRequest {
	s.DimExpression = v
	return s
}

func (s *PontusTrendRequest) SetDimExpressionList(v []*KeySet) *PontusTrendRequest {
	s.DimExpressionList = v
	return s
}

// AlarmHistoryListKeySet
type AlarmHistoryListKeySet struct {
	// key
	Key *string `json:"key,omitempty" xml:"key,omitempty"`
	// AlarmHistoryListKeySet
	Value []*AlarmHistory `json:"value,omitempty" xml:"value,omitempty" type:"Repeated"`
}

func (s AlarmHistoryListKeySet) String() string {
	return tea.Prettify(s)
}

func (s AlarmHistoryListKeySet) GoString() string {
	return s.String()
}

func (s *AlarmHistoryListKeySet) SetKey(v string) *AlarmHistoryListKeySet {
	s.Key = &v
	return s
}

func (s *AlarmHistoryListKeySet) SetValue(v []*AlarmHistory) *AlarmHistoryListKeySet {
	s.Value = v
	return s
}

// OpsmetaSchema
type OpsmetaSchema struct {
	// envs
	Envs []*string `json:"envs,omitempty" xml:"envs,omitempty" type:"Repeated"`
	// idc
	Idc *OpsFilter `json:"idc,omitempty" xml:"idc,omitempty"`
	// ldc
	Ldc *OpsFilter `json:"ldc,omitempty" xml:"ldc,omitempty"`
	// server
	Server *OpsFilter `json:"server,omitempty" xml:"server,omitempty"`
}

func (s OpsmetaSchema) String() string {
	return tea.Prettify(s)
}

func (s OpsmetaSchema) GoString() string {
	return s.String()
}

func (s *OpsmetaSchema) SetEnvs(v []*string) *OpsmetaSchema {
	s.Envs = v
	return s
}

func (s *OpsmetaSchema) SetIdc(v *OpsFilter) *OpsmetaSchema {
	s.Idc = v
	return s
}

func (s *OpsmetaSchema) SetLdc(v *OpsFilter) *OpsmetaSchema {
	s.Ldc = v
	return s
}

func (s *OpsmetaSchema) SetServer(v *OpsFilter) *OpsmetaSchema {
	s.Server = v
	return s
}

// Metrics 中具体时间点的数据
type TimeSeriesMetricsPoint struct {
	// 时间戳 (毫秒)
	Timestamp *int64 `json:"timestamp,omitempty" xml:"timestamp,omitempty"`
	// Metrics 某时间点的具体值
	Value []*TimeSeriesMetricsField `json:"value,omitempty" xml:"value,omitempty" type:"Repeated"`
}

func (s TimeSeriesMetricsPoint) String() string {
	return tea.Prettify(s)
}

func (s TimeSeriesMetricsPoint) GoString() string {
	return s.String()
}

func (s *TimeSeriesMetricsPoint) SetTimestamp(v int64) *TimeSeriesMetricsPoint {
	s.Timestamp = &v
	return s
}

func (s *TimeSeriesMetricsPoint) SetValue(v []*TimeSeriesMetricsField) *TimeSeriesMetricsPoint {
	s.Value = v
	return s
}

// AlarmTypeStatsVO
type AlarmTypeStatsVO struct {
	// custom_plugin
	CustomPlugin *int64 `json:"custom_plugin,omitempty" xml:"custom_plugin,omitempty"`
	// meta_group
	MetaGroup *int64 `json:"meta_group,omitempty" xml:"meta_group,omitempty"`
	// stack_universal_table
	StackUniversalTable *int64 `json:"stack_universal_table,omitempty" xml:"stack_universal_table,omitempty"`
}

func (s AlarmTypeStatsVO) String() string {
	return tea.Prettify(s)
}

func (s AlarmTypeStatsVO) GoString() string {
	return s.String()
}

func (s *AlarmTypeStatsVO) SetCustomPlugin(v int64) *AlarmTypeStatsVO {
	s.CustomPlugin = &v
	return s
}

func (s *AlarmTypeStatsVO) SetMetaGroup(v int64) *AlarmTypeStatsVO {
	s.MetaGroup = &v
	return s
}

func (s *AlarmTypeStatsVO) SetStackUniversalTable(v int64) *AlarmTypeStatsVO {
	s.StackUniversalTable = &v
	return s
}

// SaveSchema
type SaveSchema struct {
	// capacity
	Capacity *int64 `json:"capacity,omitempty" xml:"capacity,omitempty"`
	// reserved
	Reserved *string `json:"reserved,omitempty" xml:"reserved,omitempty"`
	// max_key_size
	MaxKeySize *int64 `json:"max_key_size,omitempty" xml:"max_key_size,omitempty"`
}

func (s SaveSchema) String() string {
	return tea.Prettify(s)
}

func (s SaveSchema) GoString() string {
	return s.String()
}

func (s *SaveSchema) SetCapacity(v int64) *SaveSchema {
	s.Capacity = &v
	return s
}

func (s *SaveSchema) SetReserved(v string) *SaveSchema {
	s.Reserved = &v
	return s
}

func (s *SaveSchema) SetMaxKeySize(v int64) *SaveSchema {
	s.MaxKeySize = &v
	return s
}

// AlarmNotifyStats
type AlarmNotifyStats struct {
	// alarm_time
	AlarmTime *int64 `json:"alarm_time,omitempty" xml:"alarm_time,omitempty"`
	// count
	Count *int64 `json:"count,omitempty" xml:"count,omitempty"`
	// notify_channel
	NotifyChannel *string `json:"notify_channel,omitempty" xml:"notify_channel,omitempty"`
}

func (s AlarmNotifyStats) String() string {
	return tea.Prettify(s)
}

func (s AlarmNotifyStats) GoString() string {
	return s.String()
}

func (s *AlarmNotifyStats) SetAlarmTime(v int64) *AlarmNotifyStats {
	s.AlarmTime = &v
	return s
}

func (s *AlarmNotifyStats) SetCount(v int64) *AlarmNotifyStats {
	s.Count = &v
	return s
}

func (s *AlarmNotifyStats) SetNotifyChannel(v string) *AlarmNotifyStats {
	s.NotifyChannel = &v
	return s
}

// KV对
type KeyValuePair struct {
	// key
	Key *string `json:"key,omitempty" xml:"key,omitempty"`
	// value
	Value *string `json:"value,omitempty" xml:"value,omitempty"`
}

func (s KeyValuePair) String() string {
	return tea.Prettify(s)
}

func (s KeyValuePair) GoString() string {
	return s.String()
}

func (s *KeyValuePair) SetKey(v string) *KeyValuePair {
	s.Key = &v
	return s
}

func (s *KeyValuePair) SetValue(v string) *KeyValuePair {
	s.Value = &v
	return s
}

// AlarmLevelStatsVO
type AlarmLevelStatsVO struct {
	// l0
	L0 *int64 `json:"l0,omitempty" xml:"l0,omitempty"`
	// l1
	L1 *int64 `json:"l1,omitempty" xml:"l1,omitempty"`
	// l2
	L2 *int64 `json:"l2,omitempty" xml:"l2,omitempty"`
}

func (s AlarmLevelStatsVO) String() string {
	return tea.Prettify(s)
}

func (s AlarmLevelStatsVO) GoString() string {
	return s.String()
}

func (s *AlarmLevelStatsVO) SetL0(v int64) *AlarmLevelStatsVO {
	s.L0 = &v
	return s
}

func (s *AlarmLevelStatsVO) SetL1(v int64) *AlarmLevelStatsVO {
	s.L1 = &v
	return s
}

func (s *AlarmLevelStatsVO) SetL2(v int64) *AlarmLevelStatsVO {
	s.L2 = &v
	return s
}

// PageQuery
type PageQuery struct {
	// page_size
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// page_index
	PageIndex *int64 `json:"page_index,omitempty" xml:"page_index,omitempty"`
	// cur_index
	CurIndex *int64 `json:"cur_index,omitempty" xml:"cur_index,omitempty"`
}

func (s PageQuery) String() string {
	return tea.Prettify(s)
}

func (s PageQuery) GoString() string {
	return s.String()
}

func (s *PageQuery) SetPageSize(v int64) *PageQuery {
	s.PageSize = &v
	return s
}

func (s *PageQuery) SetPageIndex(v int64) *PageQuery {
	s.PageIndex = &v
	return s
}

func (s *PageQuery) SetCurIndex(v int64) *PageQuery {
	s.CurIndex = &v
	return s
}

// FolderPath
type FolderPath struct {
	// id
	Id *int64 `json:"id,omitempty" xml:"id,omitempty"`
	// name
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// v
	Type *string `json:"type,omitempty" xml:"type,omitempty"`
}

func (s FolderPath) String() string {
	return tea.Prettify(s)
}

func (s FolderPath) GoString() string {
	return s.String()
}

func (s *FolderPath) SetId(v int64) *FolderPath {
	s.Id = &v
	return s
}

func (s *FolderPath) SetName(v string) *FolderPath {
	s.Name = &v
	return s
}

func (s *FolderPath) SetType(v string) *FolderPath {
	s.Type = &v
	return s
}

// AlarmPkgDO
type AlarmPkgDO struct {
	// biz_groupby_name
	BizGroupbyName *string `json:"biz_groupby_name,omitempty" xml:"biz_groupby_name,omitempty"`
	// id
	Id *int64 `json:"id,omitempty" xml:"id,omitempty"`
	// name
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// stack_metric_group_metric_table
	StackMetricGroupMetricTable *string `json:"stack_metric_group_metric_table,omitempty" xml:"stack_metric_group_metric_table,omitempty"`
	// tag_value
	TagValue *string `json:"tag_value,omitempty" xml:"tag_value,omitempty"`
	// uuid
	Uuid *string `json:"uuid,omitempty" xml:"uuid,omitempty"`
	// alarm
	Alarm *AlarmDO `json:"alarm,omitempty" xml:"alarm,omitempty"`
	// top_alarm
	TopAlarm *TopAlarmDO `json:"top_alarm,omitempty" xml:"top_alarm,omitempty"`
}

func (s AlarmPkgDO) String() string {
	return tea.Prettify(s)
}

func (s AlarmPkgDO) GoString() string {
	return s.String()
}

func (s *AlarmPkgDO) SetBizGroupbyName(v string) *AlarmPkgDO {
	s.BizGroupbyName = &v
	return s
}

func (s *AlarmPkgDO) SetId(v int64) *AlarmPkgDO {
	s.Id = &v
	return s
}

func (s *AlarmPkgDO) SetName(v string) *AlarmPkgDO {
	s.Name = &v
	return s
}

func (s *AlarmPkgDO) SetStackMetricGroupMetricTable(v string) *AlarmPkgDO {
	s.StackMetricGroupMetricTable = &v
	return s
}

func (s *AlarmPkgDO) SetTagValue(v string) *AlarmPkgDO {
	s.TagValue = &v
	return s
}

func (s *AlarmPkgDO) SetUuid(v string) *AlarmPkgDO {
	s.Uuid = &v
	return s
}

func (s *AlarmPkgDO) SetAlarm(v *AlarmDO) *AlarmPkgDO {
	s.Alarm = v
	return s
}

func (s *AlarmPkgDO) SetTopAlarm(v *TopAlarmDO) *AlarmPkgDO {
	s.TopAlarm = v
	return s
}

// StatusDO
type StatusDO struct {
	// creater
	Creater *string `json:"creater,omitempty" xml:"creater,omitempty"`
	// create_time
	CreateTime *int64 `json:"create_time,omitempty" xml:"create_time,omitempty"`
	// operator
	Operator *string `json:"operator,omitempty" xml:"operator,omitempty"`
	// update_time
	UpdateTime *int64 `json:"update_time,omitempty" xml:"update_time,omitempty"`
	// status_desc
	StatusDesc *string `json:"status_desc,omitempty" xml:"status_desc,omitempty"`
	// compute_close
	ComputeClose *bool `json:"compute_close,omitempty" xml:"compute_close,omitempty"`
	// degrade_reason
	DegradeReason *string `json:"degrade_reason,omitempty" xml:"degrade_reason,omitempty"`
	// degrade_operator
	DegradeOperator *string `json:"degrade_operator,omitempty" xml:"degrade_operator,omitempty"`
	// degrade_time
	DegradeTime *string `json:"degrade_time,omitempty" xml:"degrade_time,omitempty"`
	// degrade_time_v2
	DegradeTimeV2 *int64 `json:"degrade_time_v2,omitempty" xml:"degrade_time_v2,omitempty"`
}

func (s StatusDO) String() string {
	return tea.Prettify(s)
}

func (s StatusDO) GoString() string {
	return s.String()
}

func (s *StatusDO) SetCreater(v string) *StatusDO {
	s.Creater = &v
	return s
}

func (s *StatusDO) SetCreateTime(v int64) *StatusDO {
	s.CreateTime = &v
	return s
}

func (s *StatusDO) SetOperator(v string) *StatusDO {
	s.Operator = &v
	return s
}

func (s *StatusDO) SetUpdateTime(v int64) *StatusDO {
	s.UpdateTime = &v
	return s
}

func (s *StatusDO) SetStatusDesc(v string) *StatusDO {
	s.StatusDesc = &v
	return s
}

func (s *StatusDO) SetComputeClose(v bool) *StatusDO {
	s.ComputeClose = &v
	return s
}

func (s *StatusDO) SetDegradeReason(v string) *StatusDO {
	s.DegradeReason = &v
	return s
}

func (s *StatusDO) SetDegradeOperator(v string) *StatusDO {
	s.DegradeOperator = &v
	return s
}

func (s *StatusDO) SetDegradeTime(v string) *StatusDO {
	s.DegradeTime = &v
	return s
}

func (s *StatusDO) SetDegradeTimeV2(v int64) *StatusDO {
	s.DegradeTimeV2 = &v
	return s
}

// Condition
type Condition struct {
	// plugin
	Plugin *string `json:"plugin,omitempty" xml:"plugin,omitempty"`
	// content_type
	ContentType *string `json:"content_type,omitempty" xml:"content_type,omitempty"`
	// tag
	Tag *string `json:"tag,omitempty" xml:"tag,omitempty"`
	// ds_id
	DsId *string `json:"ds_id,omitempty" xml:"ds_id,omitempty"`
	// new_cp_id
	NewCpId *string `json:"new_cp_id,omitempty" xml:"new_cp_id,omitempty"`
	// start
	Start *int64 `json:"start,omitempty" xml:"start,omitempty"`
	// end
	End *int64 `json:"end,omitempty" xml:"end,omitempty"`
	// tick_interval
	TickInterval *int64 `json:"tick_interval,omitempty" xml:"tick_interval,omitempty"`
	// use_new
	UseNew *bool `json:"use_new,omitempty" xml:"use_new,omitempty"`
	// groupby
	Groupby []*string `json:"groupby,omitempty" xml:"groupby,omitempty" type:"Repeated"`
	// values
	Values []*KeySet `json:"values,omitempty" xml:"values,omitempty" type:"Repeated"`
	// tenant_id
	TenantId *int64 `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// workspace_id
	WorkspaceId *int64 `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
	// am_old_data_struct
	AmOldDataStruct *bool `json:"am_old_data_struct,omitempty" xml:"am_old_data_struct,omitempty"`
	// am_is_spm
	AmIsSpm *bool `json:"am_is_spm,omitempty" xml:"am_is_spm,omitempty"`
	// old_ds_id
	OldDsId *string `json:"old_ds_id,omitempty" xml:"old_ds_id,omitempty"`
}

func (s Condition) String() string {
	return tea.Prettify(s)
}

func (s Condition) GoString() string {
	return s.String()
}

func (s *Condition) SetPlugin(v string) *Condition {
	s.Plugin = &v
	return s
}

func (s *Condition) SetContentType(v string) *Condition {
	s.ContentType = &v
	return s
}

func (s *Condition) SetTag(v string) *Condition {
	s.Tag = &v
	return s
}

func (s *Condition) SetDsId(v string) *Condition {
	s.DsId = &v
	return s
}

func (s *Condition) SetNewCpId(v string) *Condition {
	s.NewCpId = &v
	return s
}

func (s *Condition) SetStart(v int64) *Condition {
	s.Start = &v
	return s
}

func (s *Condition) SetEnd(v int64) *Condition {
	s.End = &v
	return s
}

func (s *Condition) SetTickInterval(v int64) *Condition {
	s.TickInterval = &v
	return s
}

func (s *Condition) SetUseNew(v bool) *Condition {
	s.UseNew = &v
	return s
}

func (s *Condition) SetGroupby(v []*string) *Condition {
	s.Groupby = v
	return s
}

func (s *Condition) SetValues(v []*KeySet) *Condition {
	s.Values = v
	return s
}

func (s *Condition) SetTenantId(v int64) *Condition {
	s.TenantId = &v
	return s
}

func (s *Condition) SetWorkspaceId(v int64) *Condition {
	s.WorkspaceId = &v
	return s
}

func (s *Condition) SetAmOldDataStruct(v bool) *Condition {
	s.AmOldDataStruct = &v
	return s
}

func (s *Condition) SetAmIsSpm(v bool) *Condition {
	s.AmIsSpm = &v
	return s
}

func (s *Condition) SetOldDsId(v string) *Condition {
	s.OldDsId = &v
	return s
}

// StackExpression
type StackExpression struct {
	// states
	States []*StackState `json:"states,omitempty" xml:"states,omitempty" type:"Repeated"`
	// andor
	Andor *bool `json:"andor,omitempty" xml:"andor,omitempty"`
}

func (s StackExpression) String() string {
	return tea.Prettify(s)
}

func (s StackExpression) GoString() string {
	return s.String()
}

func (s *StackExpression) SetStates(v []*StackState) *StackExpression {
	s.States = v
	return s
}

func (s *StackExpression) SetAndor(v bool) *StackExpression {
	s.Andor = &v
	return s
}

// IpFileOs
type IpFileOs struct {
	// error_msg
	ErrorMsg *string `json:"error_msg,omitempty" xml:"error_msg,omitempty"`
	// ip
	Ip *string `json:"ip,omitempty" xml:"ip,omitempty"`
	// next_file_id
	NextFileId *string `json:"next_file_id,omitempty" xml:"next_file_id,omitempty"`
	// next_offset
	NextOffset *int64 `json:"next_offset,omitempty" xml:"next_offset,omitempty"`
	// uuid
	Uuid *string `json:"uuid,omitempty" xml:"uuid,omitempty"`
}

func (s IpFileOs) String() string {
	return tea.Prettify(s)
}

func (s IpFileOs) GoString() string {
	return s.String()
}

func (s *IpFileOs) SetErrorMsg(v string) *IpFileOs {
	s.ErrorMsg = &v
	return s
}

func (s *IpFileOs) SetIp(v string) *IpFileOs {
	s.Ip = &v
	return s
}

func (s *IpFileOs) SetNextFileId(v string) *IpFileOs {
	s.NextFileId = &v
	return s
}

func (s *IpFileOs) SetNextOffset(v int64) *IpFileOs {
	s.NextOffset = &v
	return s
}

func (s *IpFileOs) SetUuid(v string) *IpFileOs {
	s.Uuid = &v
	return s
}

// AlarmHistoryListKeySetMap
type AlarmHistoryListKeySetMap struct {
	// key
	Key *string `json:"key,omitempty" xml:"key,omitempty"`
	// value
	Entity []*AlarmHistoryListKeySet `json:"entity,omitempty" xml:"entity,omitempty" type:"Repeated"`
}

func (s AlarmHistoryListKeySetMap) String() string {
	return tea.Prettify(s)
}

func (s AlarmHistoryListKeySetMap) GoString() string {
	return s.String()
}

func (s *AlarmHistoryListKeySetMap) SetKey(v string) *AlarmHistoryListKeySetMap {
	s.Key = &v
	return s
}

func (s *AlarmHistoryListKeySetMap) SetEntity(v []*AlarmHistoryListKeySet) *AlarmHistoryListKeySetMap {
	s.Entity = v
	return s
}

// 只包含一个string value的结构体, 用于解决阿里云POP OpenAPI的限制问题.
type StringValue struct {
	// value
	Value *string `json:"value,omitempty" xml:"value,omitempty"`
}

func (s StringValue) String() string {
	return tea.Prettify(s)
}

func (s StringValue) GoString() string {
	return s.String()
}

func (s *StringValue) SetValue(v string) *StringValue {
	s.Value = &v
	return s
}

// AlarmTypeStatsVOKeySet
type AlarmTypeStatsVOKeySet struct {
	// key
	Key *string `json:"key,omitempty" xml:"key,omitempty"`
	// value
	Value *AlarmTypeStatsVO `json:"value,omitempty" xml:"value,omitempty"`
}

func (s AlarmTypeStatsVOKeySet) String() string {
	return tea.Prettify(s)
}

func (s AlarmTypeStatsVOKeySet) GoString() string {
	return s.String()
}

func (s *AlarmTypeStatsVOKeySet) SetKey(v string) *AlarmTypeStatsVOKeySet {
	s.Key = &v
	return s
}

func (s *AlarmTypeStatsVOKeySet) SetValue(v *AlarmTypeStatsVO) *AlarmTypeStatsVOKeySet {
	s.Value = v
	return s
}

// AlarmAppStats
type AlarmAppStats struct {
	// app
	App *string `json:"app,omitempty" xml:"app,omitempty"`
	// alarm_level
	AlarmLevel *int64 `json:"alarm_level,omitempty" xml:"alarm_level,omitempty"`
	// count
	Count *int64 `json:"count,omitempty" xml:"count,omitempty"`
	// stack_universal_table_id
	StackUniversalTableId *string `json:"stack_universal_table_id,omitempty" xml:"stack_universal_table_id,omitempty"`
}

func (s AlarmAppStats) String() string {
	return tea.Prettify(s)
}

func (s AlarmAppStats) GoString() string {
	return s.String()
}

func (s *AlarmAppStats) SetApp(v string) *AlarmAppStats {
	s.App = &v
	return s
}

func (s *AlarmAppStats) SetAlarmLevel(v int64) *AlarmAppStats {
	s.AlarmLevel = &v
	return s
}

func (s *AlarmAppStats) SetCount(v int64) *AlarmAppStats {
	s.Count = &v
	return s
}

func (s *AlarmAppStats) SetStackUniversalTableId(v string) *AlarmAppStats {
	s.StackUniversalTableId = &v
	return s
}

// FolderRequestCmd
type FolderRequestCmd struct {
	// custom_plugin_id
	CustomPluginId *int64 `json:"custom_plugin_id,omitempty" xml:"custom_plugin_id,omitempty"`
	// folder_id
	FolderId *int64 `json:"folder_id,omitempty" xml:"folder_id,omitempty"`
	// include_me
	IncludeMe *bool `json:"include_me,omitempty" xml:"include_me,omitempty"`
	// include_plugin_name
	IncludePluginName *bool `json:"include_plugin_name,omitempty" xml:"include_plugin_name,omitempty"`
}

func (s FolderRequestCmd) String() string {
	return tea.Prettify(s)
}

func (s FolderRequestCmd) GoString() string {
	return s.String()
}

func (s *FolderRequestCmd) SetCustomPluginId(v int64) *FolderRequestCmd {
	s.CustomPluginId = &v
	return s
}

func (s *FolderRequestCmd) SetFolderId(v int64) *FolderRequestCmd {
	s.FolderId = &v
	return s
}

func (s *FolderRequestCmd) SetIncludeMe(v bool) *FolderRequestCmd {
	s.IncludeMe = &v
	return s
}

func (s *FolderRequestCmd) SetIncludePluginName(v bool) *FolderRequestCmd {
	s.IncludePluginName = &v
	return s
}

// LongKeySet
type LongKeySet struct {
	// key
	Key *string `json:"key,omitempty" xml:"key,omitempty"`
	// value
	Value *int64 `json:"value,omitempty" xml:"value,omitempty"`
}

func (s LongKeySet) String() string {
	return tea.Prettify(s)
}

func (s LongKeySet) GoString() string {
	return s.String()
}

func (s *LongKeySet) SetKey(v string) *LongKeySet {
	s.Key = &v
	return s
}

func (s *LongKeySet) SetValue(v int64) *LongKeySet {
	s.Value = &v
	return s
}

// 单链路树状图树节点
type TraceTreeItem struct {
	// 应用名
	App *string `json:"app,omitempty" xml:"app,omitempty"`
	// 组件类型
	Component *string `json:"component,omitempty" xml:"component,omitempty"`
	// 耗时, 毫秒
	Duration *int64 `json:"duration,omitempty" xml:"duration,omitempty"`
	// 机房信息
	Idc *string `json:"idc,omitempty" xml:"idc,omitempty"`
	// 描述信息
	Info *string `json:"info,omitempty" xml:"info,omitempty"`
	// ip
	Ip *string `json:"ip,omitempty" xml:"ip,omitempty"`
	// 对应的span的类型 枚举类型 CLIENT SERVER CONSUMER PRODUCER
	Kind *string `json:"kind,omitempty" xml:"kind,omitempty"`
	// parent span id
	ParentId *string `json:"parent_id,omitempty" xml:"parent_id,omitempty"`
	// 请求体字节大小, 如果取不到就为-1
	RequestSize *int64 `json:"request_size,omitempty" xml:"request_size,omitempty"`
	// 响应体大小, 如果取不到就为-1
	ResponseSize *int64 `json:"response_size,omitempty" xml:"response_size,omitempty"`
	// span id
	SpanId *string `json:"span_id,omitempty" xml:"span_id,omitempty"`
	// 开始时间, 毫秒时间戳
	StartTime *int64 `json:"start_time,omitempty" xml:"start_time,omitempty"`
	// 状态码
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 键值对
	Tags []*KeySet `json:"tags,omitempty" xml:"tags,omitempty" type:"Repeated"`
	// 节点的id, 没有业务语义, 用于帮助前端还原树状结构
	TreeId *int64 `json:"tree_id,omitempty" xml:"tree_id,omitempty"`
	// 父节点的id, 如果为0表示这是一个顶级节点, 没有业务语义, 用于帮助前端还原树状结构
	TreeParentId *int64 `json:"tree_parent_id,omitempty" xml:"tree_parent_id,omitempty"`
	// 单元化信息
	Unit *string `json:"unit,omitempty" xml:"unit,omitempty"`
}

func (s TraceTreeItem) String() string {
	return tea.Prettify(s)
}

func (s TraceTreeItem) GoString() string {
	return s.String()
}

func (s *TraceTreeItem) SetApp(v string) *TraceTreeItem {
	s.App = &v
	return s
}

func (s *TraceTreeItem) SetComponent(v string) *TraceTreeItem {
	s.Component = &v
	return s
}

func (s *TraceTreeItem) SetDuration(v int64) *TraceTreeItem {
	s.Duration = &v
	return s
}

func (s *TraceTreeItem) SetIdc(v string) *TraceTreeItem {
	s.Idc = &v
	return s
}

func (s *TraceTreeItem) SetInfo(v string) *TraceTreeItem {
	s.Info = &v
	return s
}

func (s *TraceTreeItem) SetIp(v string) *TraceTreeItem {
	s.Ip = &v
	return s
}

func (s *TraceTreeItem) SetKind(v string) *TraceTreeItem {
	s.Kind = &v
	return s
}

func (s *TraceTreeItem) SetParentId(v string) *TraceTreeItem {
	s.ParentId = &v
	return s
}

func (s *TraceTreeItem) SetRequestSize(v int64) *TraceTreeItem {
	s.RequestSize = &v
	return s
}

func (s *TraceTreeItem) SetResponseSize(v int64) *TraceTreeItem {
	s.ResponseSize = &v
	return s
}

func (s *TraceTreeItem) SetSpanId(v string) *TraceTreeItem {
	s.SpanId = &v
	return s
}

func (s *TraceTreeItem) SetStartTime(v int64) *TraceTreeItem {
	s.StartTime = &v
	return s
}

func (s *TraceTreeItem) SetStatus(v string) *TraceTreeItem {
	s.Status = &v
	return s
}

func (s *TraceTreeItem) SetTags(v []*KeySet) *TraceTreeItem {
	s.Tags = v
	return s
}

func (s *TraceTreeItem) SetTreeId(v int64) *TraceTreeItem {
	s.TreeId = &v
	return s
}

func (s *TraceTreeItem) SetTreeParentId(v int64) *TraceTreeItem {
	s.TreeParentId = &v
	return s
}

func (s *TraceTreeItem) SetUnit(v string) *TraceTreeItem {
	s.Unit = &v
	return s
}

// ErrorRealte
type ErrorRealte struct {
	// ips
	Ips []*string `json:"ips,omitempty" xml:"ips,omitempty" type:"Repeated"`
	// log_paths
	LogPaths []*string `json:"log_paths,omitempty" xml:"log_paths,omitempty" type:"Repeated"`
}

func (s ErrorRealte) String() string {
	return tea.Prettify(s)
}

func (s ErrorRealte) GoString() string {
	return s.String()
}

func (s *ErrorRealte) SetIps(v []*string) *ErrorRealte {
	s.Ips = v
	return s
}

func (s *ErrorRealte) SetLogPaths(v []*string) *ErrorRealte {
	s.LogPaths = v
	return s
}

// FolderPaths
type FolderPaths struct {
	// paths
	Paths []*FolderPath `json:"paths,omitempty" xml:"paths,omitempty" type:"Repeated"`
}

func (s FolderPaths) String() string {
	return tea.Prettify(s)
}

func (s FolderPaths) GoString() string {
	return s.String()
}

func (s *FolderPaths) SetPaths(v []*FolderPath) *FolderPaths {
	s.Paths = v
	return s
}

// CallErrorMessage
type CallErrorMessage struct {
	// error_code
	ErrorCode *string `json:"error_code,omitempty" xml:"error_code,omitempty"`
	// message
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// cause
	Cause *string `json:"cause,omitempty" xml:"cause,omitempty"`
}

func (s CallErrorMessage) String() string {
	return tea.Prettify(s)
}

func (s CallErrorMessage) GoString() string {
	return s.String()
}

func (s *CallErrorMessage) SetErrorCode(v string) *CallErrorMessage {
	s.ErrorCode = &v
	return s
}

func (s *CallErrorMessage) SetMessage(v string) *CallErrorMessage {
	s.Message = &v
	return s
}

func (s *CallErrorMessage) SetCause(v string) *CallErrorMessage {
	s.Cause = &v
	return s
}

// 时序指标数据, 相当于一条时间线
type TimeSeriesMetrics struct {
	// 开始时间, 毫秒时间戳
	StartTime *int64 `json:"start_time,omitempty" xml:"start_time,omitempty"`
	// 结束时间, 毫秒时间戳
	EndTime *int64 `json:"end_time,omitempty" xml:"end_time,omitempty"`
	// 标识 metrics，类似 sql 查询条件
	Tags []*KeyValuePair `json:"tags,omitempty" xml:"tags,omitempty" type:"Repeated"`
	// 指标的分类
	Type *string `json:"type,omitempty" xml:"type,omitempty"`
	// Metrics 多个 point 的集合
	Values []*TimeSeriesMetricsPoint `json:"values,omitempty" xml:"values,omitempty" type:"Repeated"`
}

func (s TimeSeriesMetrics) String() string {
	return tea.Prettify(s)
}

func (s TimeSeriesMetrics) GoString() string {
	return s.String()
}

func (s *TimeSeriesMetrics) SetStartTime(v int64) *TimeSeriesMetrics {
	s.StartTime = &v
	return s
}

func (s *TimeSeriesMetrics) SetEndTime(v int64) *TimeSeriesMetrics {
	s.EndTime = &v
	return s
}

func (s *TimeSeriesMetrics) SetTags(v []*KeyValuePair) *TimeSeriesMetrics {
	s.Tags = v
	return s
}

func (s *TimeSeriesMetrics) SetType(v string) *TimeSeriesMetrics {
	s.Type = &v
	return s
}

func (s *TimeSeriesMetrics) SetValues(v []*TimeSeriesMetricsPoint) *TimeSeriesMetrics {
	s.Values = v
	return s
}

// 链路搜索页面的tags配置项
type TraceSpanSearchTagConfig struct {
	// 字段的key
	Key *string `json:"key,omitempty" xml:"key,omitempty"`
	// 中文标签
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 是否支持多选
	Multiple *bool `json:"multiple,omitempty" xml:"multiple,omitempty"`
	// 如果该数组非空, 那么表明用户只能从数组给定的值中进行选择, 否则意味着用户可以随意填写.
	Values []*string `json:"values,omitempty" xml:"values,omitempty" type:"Repeated"`
}

func (s TraceSpanSearchTagConfig) String() string {
	return tea.Prettify(s)
}

func (s TraceSpanSearchTagConfig) GoString() string {
	return s.String()
}

func (s *TraceSpanSearchTagConfig) SetKey(v string) *TraceSpanSearchTagConfig {
	s.Key = &v
	return s
}

func (s *TraceSpanSearchTagConfig) SetName(v string) *TraceSpanSearchTagConfig {
	s.Name = &v
	return s
}

func (s *TraceSpanSearchTagConfig) SetMultiple(v bool) *TraceSpanSearchTagConfig {
	s.Multiple = &v
	return s
}

func (s *TraceSpanSearchTagConfig) SetValues(v []*string) *TraceSpanSearchTagConfig {
	s.Values = v
	return s
}

// RequestParams
type RequestParams struct {
	// req_type
	ReqType *string `json:"req_type,omitempty" xml:"req_type,omitempty"`
	// condition
	Condition *Condition `json:"condition,omitempty" xml:"condition,omitempty"`
	// dimCondition
	DimCondition *PontusTrendRequest `json:"dim_condition,omitempty" xml:"dim_condition,omitempty"`
	// tenant
	Tenant *string `json:"tenant,omitempty" xml:"tenant,omitempty"`
	// zones
	Zones *string `json:"zones,omitempty" xml:"zones,omitempty"`
	// from_front
	FromFront *bool `json:"from_front,omitempty" xml:"from_front,omitempty"`
	// fuzzy
	Fuzzy *bool `json:"fuzzy,omitempty" xml:"fuzzy,omitempty"`
	// validKeyCount
	ValidKeyCount *int64 `json:"valid_key_count,omitempty" xml:"valid_key_count,omitempty"`
	// can_switch
	CanSwitch *bool `json:"can_switch,omitempty" xml:"can_switch,omitempty"`
}

func (s RequestParams) String() string {
	return tea.Prettify(s)
}

func (s RequestParams) GoString() string {
	return s.String()
}

func (s *RequestParams) SetReqType(v string) *RequestParams {
	s.ReqType = &v
	return s
}

func (s *RequestParams) SetCondition(v *Condition) *RequestParams {
	s.Condition = v
	return s
}

func (s *RequestParams) SetDimCondition(v *PontusTrendRequest) *RequestParams {
	s.DimCondition = v
	return s
}

func (s *RequestParams) SetTenant(v string) *RequestParams {
	s.Tenant = &v
	return s
}

func (s *RequestParams) SetZones(v string) *RequestParams {
	s.Zones = &v
	return s
}

func (s *RequestParams) SetFromFront(v bool) *RequestParams {
	s.FromFront = &v
	return s
}

func (s *RequestParams) SetFuzzy(v bool) *RequestParams {
	s.Fuzzy = &v
	return s
}

func (s *RequestParams) SetValidKeyCount(v int64) *RequestParams {
	s.ValidKeyCount = &v
	return s
}

func (s *RequestParams) SetCanSwitch(v bool) *RequestParams {
	s.CanSwitch = &v
	return s
}

// 拓扑节点
type TopologyNode struct {
	// 应用名
	App *string `json:"app,omitempty" xml:"app,omitempty"`
	// 节点类型: APP DB MQ CACHE
	Type *string `json:"type,omitempty" xml:"type,omitempty"`
	// 节点id
	Id *string `json:"id,omitempty" xml:"id,omitempty"`
}

func (s TopologyNode) String() string {
	return tea.Prettify(s)
}

func (s TopologyNode) GoString() string {
	return s.String()
}

func (s *TopologyNode) SetApp(v string) *TopologyNode {
	s.App = &v
	return s
}

func (s *TopologyNode) SetType(v string) *TopologyNode {
	s.Type = &v
	return s
}

func (s *TopologyNode) SetId(v string) *TopologyNode {
	s.Id = &v
	return s
}

// 应用DO
type AppDO struct {
	// 应用名称
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
}

func (s AppDO) String() string {
	return tea.Prettify(s)
}

func (s AppDO) GoString() string {
	return s.String()
}

func (s *AppDO) SetName(v string) *AppDO {
	s.Name = &v
	return s
}

// 拓扑边
type TopologyEdge struct {
	// id
	Id *string `json:"id,omitempty" xml:"id,omitempty"`
	// source节点的id
	Source *string `json:"source,omitempty" xml:"source,omitempty"`
	// target节点的id
	Target *string `json:"target,omitempty" xml:"target,omitempty"`
}

func (s TopologyEdge) String() string {
	return tea.Prettify(s)
}

func (s TopologyEdge) GoString() string {
	return s.String()
}

func (s *TopologyEdge) SetId(v string) *TopologyEdge {
	s.Id = &v
	return s
}

func (s *TopologyEdge) SetSource(v string) *TopologyEdge {
	s.Source = &v
	return s
}

func (s *TopologyEdge) SetTarget(v string) *TopologyEdge {
	s.Target = &v
	return s
}

// AppStats
type AppStats struct {
	// app_list
	AppList []*string `json:"app_list,omitempty" xml:"app_list,omitempty" type:"Repeated"`
	// page_query
	PageQuery *PageQuery `json:"page_query,omitempty" xml:"page_query,omitempty"`
}

func (s AppStats) String() string {
	return tea.Prettify(s)
}

func (s AppStats) GoString() string {
	return s.String()
}

func (s *AppStats) SetAppList(v []*string) *AppStats {
	s.AppList = v
	return s
}

func (s *AppStats) SetPageQuery(v *PageQuery) *AppStats {
	s.PageQuery = v
	return s
}

// UniversalBodyCmd
type UniversalBodyCmd struct {
	// body
	Body *string `json:"body,omitempty" xml:"body,omitempty"`
	// id
	Id *int64 `json:"id,omitempty" xml:"id,omitempty"`
	// model_name
	ModelName *string `json:"model_name,omitempty" xml:"model_name,omitempty"`
	// op
	Op *string `json:"op,omitempty" xml:"op,omitempty"`
	// parse_long_text
	ParseLongText *bool `json:"parse_long_text,omitempty" xml:"parse_long_text,omitempty"`
	// page_size
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// page_index
	PageIndex *int64 `json:"page_index,omitempty" xml:"page_index,omitempty"`
	// cur_index
	CurIndex *int64 `json:"cur_index,omitempty" xml:"cur_index,omitempty"`
}

func (s UniversalBodyCmd) String() string {
	return tea.Prettify(s)
}

func (s UniversalBodyCmd) GoString() string {
	return s.String()
}

func (s *UniversalBodyCmd) SetBody(v string) *UniversalBodyCmd {
	s.Body = &v
	return s
}

func (s *UniversalBodyCmd) SetId(v int64) *UniversalBodyCmd {
	s.Id = &v
	return s
}

func (s *UniversalBodyCmd) SetModelName(v string) *UniversalBodyCmd {
	s.ModelName = &v
	return s
}

func (s *UniversalBodyCmd) SetOp(v string) *UniversalBodyCmd {
	s.Op = &v
	return s
}

func (s *UniversalBodyCmd) SetParseLongText(v bool) *UniversalBodyCmd {
	s.ParseLongText = &v
	return s
}

func (s *UniversalBodyCmd) SetPageSize(v int64) *UniversalBodyCmd {
	s.PageSize = &v
	return s
}

func (s *UniversalBodyCmd) SetPageIndex(v int64) *UniversalBodyCmd {
	s.PageIndex = &v
	return s
}

func (s *UniversalBodyCmd) SetCurIndex(v int64) *UniversalBodyCmd {
	s.CurIndex = &v
	return s
}

// AlarmLevelStatsVOKeySet
type AlarmLevelStatsVOKeySet struct {
	// key
	Key *string `json:"key,omitempty" xml:"key,omitempty"`
	// value
	Value *AlarmLevelStatsVO `json:"value,omitempty" xml:"value,omitempty"`
}

func (s AlarmLevelStatsVOKeySet) String() string {
	return tea.Prettify(s)
}

func (s AlarmLevelStatsVOKeySet) GoString() string {
	return s.String()
}

func (s *AlarmLevelStatsVOKeySet) SetKey(v string) *AlarmLevelStatsVOKeySet {
	s.Key = &v
	return s
}

func (s *AlarmLevelStatsVOKeySet) SetValue(v *AlarmLevelStatsVO) *AlarmLevelStatsVOKeySet {
	s.Value = v
	return s
}

// PluginModelDO
type PluginModelDO struct {
	// id
	Id *int64 `json:"id,omitempty" xml:"id,omitempty"`
	// parent_folder_id
	ParentFolderId *int64 `json:"parent_folder_id,omitempty" xml:"parent_folder_id,omitempty"`
	// plugin_id
	PluginId *int64 `json:"plugin_id,omitempty" xml:"plugin_id,omitempty"`
	// plugin_type
	PluginType *string `json:"plugin_type,omitempty" xml:"plugin_type,omitempty"`
	// name
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// xflush_apps
	XflushApps *string `json:"xflush_apps,omitempty" xml:"xflush_apps,omitempty"`
	// stack_expression
	StackExpression *StackExpression `json:"stack_expression,omitempty" xml:"stack_expression,omitempty"`
	// cal_conf
	CalConf *string `json:"cal_conf,omitempty" xml:"cal_conf,omitempty"`
	// opsmeta_schema
	OpsmetaSchema *OpsmetaSchema `json:"opsmeta_schema,omitempty" xml:"opsmeta_schema,omitempty"`
	// save_schema
	SaveSchema *SaveSchema `json:"save_schema,omitempty" xml:"save_schema,omitempty"`
	// status
	Status *StatusDO `json:"status,omitempty" xml:"status,omitempty"`
	// outside_domain_id
	OutsideDomainId *int64 `json:"outside_domain_id,omitempty" xml:"outside_domain_id,omitempty"`
	// old_folder_id
	OldFolderId *int64 `json:"old_folder_id,omitempty" xml:"old_folder_id,omitempty"`
	// tenant_id
	TenantId *int64 `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// workspace_id
	WorkspaceId *int64 `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
	// biz_domain_id
	BizDomainId *int64 `json:"biz_domain_id,omitempty" xml:"biz_domain_id,omitempty"`
	// creater
	Creater *string `json:"creater,omitempty" xml:"creater,omitempty"`
	// gmt_create
	GmtCreate *int64 `json:"gmt_create,omitempty" xml:"gmt_create,omitempty"`
	// modifier
	Modifier *string `json:"modifier,omitempty" xml:"modifier,omitempty"`
	// gmt_modified
	GmtModified *int64 `json:"gmt_modified,omitempty" xml:"gmt_modified,omitempty"`
	// alarm_pkgs
	AlarmPkgs []*AlarmPkgDO `json:"alarm_pkgs,omitempty" xml:"alarm_pkgs,omitempty" type:"Repeated"`
	// noc
	Noc *string `json:"noc,omitempty" xml:"noc,omitempty"`
	// position
	Position *string `json:"position,omitempty" xml:"position,omitempty"`
	// alarmed
	Alarmed *bool `json:"alarmed,omitempty" xml:"alarmed,omitempty"`
	// recent_alarm_history_id
	RecentAlarmHistoryId *string `json:"recent_alarm_history_id,omitempty" xml:"recent_alarm_history_id,omitempty"`
	// recent_alarm
	RecentAlarm *int64 `json:"recent_alarm,omitempty" xml:"recent_alarm,omitempty"`
	// key_cms
	KeyCms *bool `json:"key_cms,omitempty" xml:"key_cms,omitempty"`
	// key_cms_sort
	KeyCmsSort *int64 `json:"key_cms_sort,omitempty" xml:"key_cms_sort,omitempty"`
	// status_desc
	StatusDesc *string `json:"status_desc,omitempty" xml:"status_desc,omitempty"`
	// data_from
	DataFrom *int64 `json:"data_from,omitempty" xml:"data_from,omitempty"`
	// data_to
	DataTo *int64 `json:"data_to,omitempty" xml:"data_to,omitempty"`
	// from_source
	FromSource *string `json:"from_source,omitempty" xml:"from_source,omitempty"`
}

func (s PluginModelDO) String() string {
	return tea.Prettify(s)
}

func (s PluginModelDO) GoString() string {
	return s.String()
}

func (s *PluginModelDO) SetId(v int64) *PluginModelDO {
	s.Id = &v
	return s
}

func (s *PluginModelDO) SetParentFolderId(v int64) *PluginModelDO {
	s.ParentFolderId = &v
	return s
}

func (s *PluginModelDO) SetPluginId(v int64) *PluginModelDO {
	s.PluginId = &v
	return s
}

func (s *PluginModelDO) SetPluginType(v string) *PluginModelDO {
	s.PluginType = &v
	return s
}

func (s *PluginModelDO) SetName(v string) *PluginModelDO {
	s.Name = &v
	return s
}

func (s *PluginModelDO) SetXflushApps(v string) *PluginModelDO {
	s.XflushApps = &v
	return s
}

func (s *PluginModelDO) SetStackExpression(v *StackExpression) *PluginModelDO {
	s.StackExpression = v
	return s
}

func (s *PluginModelDO) SetCalConf(v string) *PluginModelDO {
	s.CalConf = &v
	return s
}

func (s *PluginModelDO) SetOpsmetaSchema(v *OpsmetaSchema) *PluginModelDO {
	s.OpsmetaSchema = v
	return s
}

func (s *PluginModelDO) SetSaveSchema(v *SaveSchema) *PluginModelDO {
	s.SaveSchema = v
	return s
}

func (s *PluginModelDO) SetStatus(v *StatusDO) *PluginModelDO {
	s.Status = v
	return s
}

func (s *PluginModelDO) SetOutsideDomainId(v int64) *PluginModelDO {
	s.OutsideDomainId = &v
	return s
}

func (s *PluginModelDO) SetOldFolderId(v int64) *PluginModelDO {
	s.OldFolderId = &v
	return s
}

func (s *PluginModelDO) SetTenantId(v int64) *PluginModelDO {
	s.TenantId = &v
	return s
}

func (s *PluginModelDO) SetWorkspaceId(v int64) *PluginModelDO {
	s.WorkspaceId = &v
	return s
}

func (s *PluginModelDO) SetBizDomainId(v int64) *PluginModelDO {
	s.BizDomainId = &v
	return s
}

func (s *PluginModelDO) SetCreater(v string) *PluginModelDO {
	s.Creater = &v
	return s
}

func (s *PluginModelDO) SetGmtCreate(v int64) *PluginModelDO {
	s.GmtCreate = &v
	return s
}

func (s *PluginModelDO) SetModifier(v string) *PluginModelDO {
	s.Modifier = &v
	return s
}

func (s *PluginModelDO) SetGmtModified(v int64) *PluginModelDO {
	s.GmtModified = &v
	return s
}

func (s *PluginModelDO) SetAlarmPkgs(v []*AlarmPkgDO) *PluginModelDO {
	s.AlarmPkgs = v
	return s
}

func (s *PluginModelDO) SetNoc(v string) *PluginModelDO {
	s.Noc = &v
	return s
}

func (s *PluginModelDO) SetPosition(v string) *PluginModelDO {
	s.Position = &v
	return s
}

func (s *PluginModelDO) SetAlarmed(v bool) *PluginModelDO {
	s.Alarmed = &v
	return s
}

func (s *PluginModelDO) SetRecentAlarmHistoryId(v string) *PluginModelDO {
	s.RecentAlarmHistoryId = &v
	return s
}

func (s *PluginModelDO) SetRecentAlarm(v int64) *PluginModelDO {
	s.RecentAlarm = &v
	return s
}

func (s *PluginModelDO) SetKeyCms(v bool) *PluginModelDO {
	s.KeyCms = &v
	return s
}

func (s *PluginModelDO) SetKeyCmsSort(v int64) *PluginModelDO {
	s.KeyCmsSort = &v
	return s
}

func (s *PluginModelDO) SetStatusDesc(v string) *PluginModelDO {
	s.StatusDesc = &v
	return s
}

func (s *PluginModelDO) SetDataFrom(v int64) *PluginModelDO {
	s.DataFrom = &v
	return s
}

func (s *PluginModelDO) SetDataTo(v int64) *PluginModelDO {
	s.DataTo = &v
	return s
}

func (s *PluginModelDO) SetFromSource(v string) *PluginModelDO {
	s.FromSource = &v
	return s
}

// trace span
type TraceSpan struct {
	// 组件类型
	Component *string `json:"component,omitempty" xml:"component,omitempty"`
	// 毫秒耗时
	Duration *int64 `json:"duration,omitempty" xml:"duration,omitempty"`
	// 服务描述信息
	Info *string `json:"info,omitempty" xml:"info,omitempty"`
	// span kind, CLIENT SERVER PRODUCER CONSUMER
	Kind *string `json:"kind,omitempty" xml:"kind,omitempty"`
	// local endpoint ip
	LocalIp *string `json:"local_ip,omitempty" xml:"local_ip,omitempty"`
	// local endpoint service name
	LocalServiceName *string `json:"local_service_name,omitempty" xml:"local_service_name,omitempty"`
	// local idc name
	LocalIdcName *string `json:"local_idc_name,omitempty" xml:"local_idc_name,omitempty"`
	// local cell name
	LocalCellName *string `json:"local_cell_name,omitempty" xml:"local_cell_name,omitempty"`
	// name
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// parent_id
	ParentId *string `json:"parent_id,omitempty" xml:"parent_id,omitempty"`
	// remote endpoint ip
	RemoteIp *string `json:"remote_ip,omitempty" xml:"remote_ip,omitempty"`
	// remote endpoint service name
	RemoteServiceName *string `json:"remote_service_name,omitempty" xml:"remote_service_name,omitempty"`
	// remote idc name
	RemoteIdcName *string `json:"remote_idc_name,omitempty" xml:"remote_idc_name,omitempty"`
	// remote cell name
	RemoteCellName *string `json:"remote_cell_name,omitempty" xml:"remote_cell_name,omitempty"`
	// span_id
	SpanId *string `json:"span_id,omitempty" xml:"span_id,omitempty"`
	// 开始时间, 毫秒时间戳
	StartTime *int64 `json:"start_time,omitempty" xml:"start_time,omitempty"`
	// 状态码
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// span tags, 是关于span的键值对
	Tags []*KeySet `json:"tags,omitempty" xml:"tags,omitempty" type:"Repeated"`
	// trace id
	TraceId *string `json:"trace_id,omitempty" xml:"trace_id,omitempty"`
}

func (s TraceSpan) String() string {
	return tea.Prettify(s)
}

func (s TraceSpan) GoString() string {
	return s.String()
}

func (s *TraceSpan) SetComponent(v string) *TraceSpan {
	s.Component = &v
	return s
}

func (s *TraceSpan) SetDuration(v int64) *TraceSpan {
	s.Duration = &v
	return s
}

func (s *TraceSpan) SetInfo(v string) *TraceSpan {
	s.Info = &v
	return s
}

func (s *TraceSpan) SetKind(v string) *TraceSpan {
	s.Kind = &v
	return s
}

func (s *TraceSpan) SetLocalIp(v string) *TraceSpan {
	s.LocalIp = &v
	return s
}

func (s *TraceSpan) SetLocalServiceName(v string) *TraceSpan {
	s.LocalServiceName = &v
	return s
}

func (s *TraceSpan) SetLocalIdcName(v string) *TraceSpan {
	s.LocalIdcName = &v
	return s
}

func (s *TraceSpan) SetLocalCellName(v string) *TraceSpan {
	s.LocalCellName = &v
	return s
}

func (s *TraceSpan) SetName(v string) *TraceSpan {
	s.Name = &v
	return s
}

func (s *TraceSpan) SetParentId(v string) *TraceSpan {
	s.ParentId = &v
	return s
}

func (s *TraceSpan) SetRemoteIp(v string) *TraceSpan {
	s.RemoteIp = &v
	return s
}

func (s *TraceSpan) SetRemoteServiceName(v string) *TraceSpan {
	s.RemoteServiceName = &v
	return s
}

func (s *TraceSpan) SetRemoteIdcName(v string) *TraceSpan {
	s.RemoteIdcName = &v
	return s
}

func (s *TraceSpan) SetRemoteCellName(v string) *TraceSpan {
	s.RemoteCellName = &v
	return s
}

func (s *TraceSpan) SetSpanId(v string) *TraceSpan {
	s.SpanId = &v
	return s
}

func (s *TraceSpan) SetStartTime(v int64) *TraceSpan {
	s.StartTime = &v
	return s
}

func (s *TraceSpan) SetStatus(v string) *TraceSpan {
	s.Status = &v
	return s
}

func (s *TraceSpan) SetTags(v []*KeySet) *TraceSpan {
	s.Tags = v
	return s
}

func (s *TraceSpan) SetTraceId(v string) *TraceSpan {
	s.TraceId = &v
	return s
}

// ModelTreeNode
type ModelTreeNode struct {
	// name
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// id
	Id *int64 `json:"id,omitempty" xml:"id,omitempty"`
	// plugin_name
	PluginName *string `json:"plugin_name,omitempty" xml:"plugin_name,omitempty"`
	// type
	Type *string `json:"type,omitempty" xml:"type,omitempty"`
}

func (s ModelTreeNode) String() string {
	return tea.Prettify(s)
}

func (s ModelTreeNode) GoString() string {
	return s.String()
}

func (s *ModelTreeNode) SetName(v string) *ModelTreeNode {
	s.Name = &v
	return s
}

func (s *ModelTreeNode) SetId(v int64) *ModelTreeNode {
	s.Id = &v
	return s
}

func (s *ModelTreeNode) SetPluginName(v string) *ModelTreeNode {
	s.PluginName = &v
	return s
}

func (s *ModelTreeNode) SetType(v string) *ModelTreeNode {
	s.Type = &v
	return s
}

// AlarmNotifyStatsKeySet
type AlarmNotifyStatsKeySet struct {
	// key
	Key *string `json:"key,omitempty" xml:"key,omitempty"`
	// value
	Value *AlarmNotifyStats `json:"value,omitempty" xml:"value,omitempty"`
}

func (s AlarmNotifyStatsKeySet) String() string {
	return tea.Prettify(s)
}

func (s AlarmNotifyStatsKeySet) GoString() string {
	return s.String()
}

func (s *AlarmNotifyStatsKeySet) SetKey(v string) *AlarmNotifyStatsKeySet {
	s.Key = &v
	return s
}

func (s *AlarmNotifyStatsKeySet) SetValue(v *AlarmNotifyStats) *AlarmNotifyStatsKeySet {
	s.Value = v
	return s
}

type QueryRmsAgentloglocateRequest struct {
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// app_id
	AppId *string `json:"app_id,omitempty" xml:"app_id,omitempty"`
	// batch_ip_files
	BatchIpFiles []*IpFileOs `json:"batch_ip_files,omitempty" xml:"batch_ip_files,omitempty" type:"Repeated"`
	// charset_str
	CharsetStr *string `json:"charset_str,omitempty" xml:"charset_str,omitempty"`
	// error_msg
	ErrorMsg *string `json:"error_msg,omitempty" xml:"error_msg,omitempty"`
	// ips
	Ips []*string `json:"ips,omitempty" xml:"ips,omitempty" type:"Repeated"`
	// ip_file
	IpFile *IpFileOs `json:"ip_file,omitempty" xml:"ip_file,omitempty"`
	// is_batch
	IsBatch *bool `json:"is_batch,omitempty" xml:"is_batch,omitempty"`
	// log_path
	LogPath *string `json:"log_path,omitempty" xml:"log_path,omitempty"`
	// log_paths
	LogPaths []*string `json:"log_paths,omitempty" xml:"log_paths,omitempty" type:"Repeated"`
	// time
	Time *int64 `json:"time,omitempty" xml:"time,omitempty"`
}

func (s QueryRmsAgentloglocateRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryRmsAgentloglocateRequest) GoString() string {
	return s.String()
}

func (s *QueryRmsAgentloglocateRequest) SetAuthToken(v string) *QueryRmsAgentloglocateRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryRmsAgentloglocateRequest) SetAppId(v string) *QueryRmsAgentloglocateRequest {
	s.AppId = &v
	return s
}

func (s *QueryRmsAgentloglocateRequest) SetBatchIpFiles(v []*IpFileOs) *QueryRmsAgentloglocateRequest {
	s.BatchIpFiles = v
	return s
}

func (s *QueryRmsAgentloglocateRequest) SetCharsetStr(v string) *QueryRmsAgentloglocateRequest {
	s.CharsetStr = &v
	return s
}

func (s *QueryRmsAgentloglocateRequest) SetErrorMsg(v string) *QueryRmsAgentloglocateRequest {
	s.ErrorMsg = &v
	return s
}

func (s *QueryRmsAgentloglocateRequest) SetIps(v []*string) *QueryRmsAgentloglocateRequest {
	s.Ips = v
	return s
}

func (s *QueryRmsAgentloglocateRequest) SetIpFile(v *IpFileOs) *QueryRmsAgentloglocateRequest {
	s.IpFile = v
	return s
}

func (s *QueryRmsAgentloglocateRequest) SetIsBatch(v bool) *QueryRmsAgentloglocateRequest {
	s.IsBatch = &v
	return s
}

func (s *QueryRmsAgentloglocateRequest) SetLogPath(v string) *QueryRmsAgentloglocateRequest {
	s.LogPath = &v
	return s
}

func (s *QueryRmsAgentloglocateRequest) SetLogPaths(v []*string) *QueryRmsAgentloglocateRequest {
	s.LogPaths = v
	return s
}

func (s *QueryRmsAgentloglocateRequest) SetTime(v int64) *QueryRmsAgentloglocateRequest {
	s.Time = &v
	return s
}

type QueryRmsAgentloglocateResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// success
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
	// error_message
	ErrorMessage *CallErrorMessage `json:"error_message,omitempty" xml:"error_message,omitempty"`
	// result
	Result *string `json:"result,omitempty" xml:"result,omitempty"`
}

func (s QueryRmsAgentloglocateResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryRmsAgentloglocateResponse) GoString() string {
	return s.String()
}

func (s *QueryRmsAgentloglocateResponse) SetReqMsgId(v string) *QueryRmsAgentloglocateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryRmsAgentloglocateResponse) SetResultCode(v string) *QueryRmsAgentloglocateResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryRmsAgentloglocateResponse) SetResultMsg(v string) *QueryRmsAgentloglocateResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryRmsAgentloglocateResponse) SetSuccess(v bool) *QueryRmsAgentloglocateResponse {
	s.Success = &v
	return s
}

func (s *QueryRmsAgentloglocateResponse) SetErrorMessage(v *CallErrorMessage) *QueryRmsAgentloglocateResponse {
	s.ErrorMessage = v
	return s
}

func (s *QueryRmsAgentloglocateResponse) SetResult(v string) *QueryRmsAgentloglocateResponse {
	s.Result = &v
	return s
}

type QueryRmsAgenttailRequest struct {
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// tenant_id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// app_name
	AppName *string `json:"app_name,omitempty" xml:"app_name,omitempty"`
	// prefer_host
	PreferHost *string `json:"prefer_host,omitempty" xml:"prefer_host,omitempty"`
	// full_path
	FullPath *string `json:"full_path,omitempty" xml:"full_path,omitempty"`
	// scan_dirs
	ScanDirs []*string `json:"scan_dirs,omitempty" xml:"scan_dirs,omitempty" type:"Repeated"`
	// need_bytes
	NeedBytes *int64 `json:"need_bytes,omitempty" xml:"need_bytes,omitempty"`
	// line_break_str
	LineBreakStr *string `json:"line_break_str,omitempty" xml:"line_break_str,omitempty"`
	// extra_suffixs
	ExtraSuffixs []*string `json:"extra_suffixs,omitempty" xml:"extra_suffixs,omitempty" type:"Repeated"`
	// charset_str
	CharsetStr *string `json:"charset_str,omitempty" xml:"charset_str,omitempty"`
}

func (s QueryRmsAgenttailRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryRmsAgenttailRequest) GoString() string {
	return s.String()
}

func (s *QueryRmsAgenttailRequest) SetAuthToken(v string) *QueryRmsAgenttailRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryRmsAgenttailRequest) SetTenantId(v string) *QueryRmsAgenttailRequest {
	s.TenantId = &v
	return s
}

func (s *QueryRmsAgenttailRequest) SetAppName(v string) *QueryRmsAgenttailRequest {
	s.AppName = &v
	return s
}

func (s *QueryRmsAgenttailRequest) SetPreferHost(v string) *QueryRmsAgenttailRequest {
	s.PreferHost = &v
	return s
}

func (s *QueryRmsAgenttailRequest) SetFullPath(v string) *QueryRmsAgenttailRequest {
	s.FullPath = &v
	return s
}

func (s *QueryRmsAgenttailRequest) SetScanDirs(v []*string) *QueryRmsAgenttailRequest {
	s.ScanDirs = v
	return s
}

func (s *QueryRmsAgenttailRequest) SetNeedBytes(v int64) *QueryRmsAgenttailRequest {
	s.NeedBytes = &v
	return s
}

func (s *QueryRmsAgenttailRequest) SetLineBreakStr(v string) *QueryRmsAgenttailRequest {
	s.LineBreakStr = &v
	return s
}

func (s *QueryRmsAgenttailRequest) SetExtraSuffixs(v []*string) *QueryRmsAgenttailRequest {
	s.ExtraSuffixs = v
	return s
}

func (s *QueryRmsAgenttailRequest) SetCharsetStr(v string) *QueryRmsAgenttailRequest {
	s.CharsetStr = &v
	return s
}

type QueryRmsAgenttailResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// success
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
	// error_message
	ErrorMessage *CallErrorMessage `json:"error_message,omitempty" xml:"error_message,omitempty"`
	// result
	Result *string `json:"result,omitempty" xml:"result,omitempty"`
}

func (s QueryRmsAgenttailResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryRmsAgenttailResponse) GoString() string {
	return s.String()
}

func (s *QueryRmsAgenttailResponse) SetReqMsgId(v string) *QueryRmsAgenttailResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryRmsAgenttailResponse) SetResultCode(v string) *QueryRmsAgenttailResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryRmsAgenttailResponse) SetResultMsg(v string) *QueryRmsAgenttailResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryRmsAgenttailResponse) SetSuccess(v bool) *QueryRmsAgenttailResponse {
	s.Success = &v
	return s
}

func (s *QueryRmsAgenttailResponse) SetErrorMessage(v *CallErrorMessage) *QueryRmsAgenttailResponse {
	s.ErrorMessage = v
	return s
}

func (s *QueryRmsAgenttailResponse) SetResult(v string) *QueryRmsAgenttailResponse {
	s.Result = &v
	return s
}

type QueryRmsAgentbrowserRequest struct {
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// app_name
	AppName *string `json:"app_name,omitempty" xml:"app_name,omitempty"`
	// extra_suffixs
	ExtraSuffixs []*string `json:"extra_suffixs,omitempty" xml:"extra_suffixs,omitempty" type:"Repeated"`
	// scan_dirs
	ScanDirs []*string `json:"scan_dirs,omitempty" xml:"scan_dirs,omitempty" type:"Repeated"`
	// prefer_host
	PreferHost *string `json:"prefer_host,omitempty" xml:"prefer_host,omitempty"`
	// tenant_id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
}

func (s QueryRmsAgentbrowserRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryRmsAgentbrowserRequest) GoString() string {
	return s.String()
}

func (s *QueryRmsAgentbrowserRequest) SetAuthToken(v string) *QueryRmsAgentbrowserRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryRmsAgentbrowserRequest) SetAppName(v string) *QueryRmsAgentbrowserRequest {
	s.AppName = &v
	return s
}

func (s *QueryRmsAgentbrowserRequest) SetExtraSuffixs(v []*string) *QueryRmsAgentbrowserRequest {
	s.ExtraSuffixs = v
	return s
}

func (s *QueryRmsAgentbrowserRequest) SetScanDirs(v []*string) *QueryRmsAgentbrowserRequest {
	s.ScanDirs = v
	return s
}

func (s *QueryRmsAgentbrowserRequest) SetPreferHost(v string) *QueryRmsAgentbrowserRequest {
	s.PreferHost = &v
	return s
}

func (s *QueryRmsAgentbrowserRequest) SetTenantId(v string) *QueryRmsAgentbrowserRequest {
	s.TenantId = &v
	return s
}

type QueryRmsAgentbrowserResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// success
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
	// error_message
	ErrorMessage *CallErrorMessage `json:"error_message,omitempty" xml:"error_message,omitempty"`
	// result
	Result *string `json:"result,omitempty" xml:"result,omitempty"`
}

func (s QueryRmsAgentbrowserResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryRmsAgentbrowserResponse) GoString() string {
	return s.String()
}

func (s *QueryRmsAgentbrowserResponse) SetReqMsgId(v string) *QueryRmsAgentbrowserResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryRmsAgentbrowserResponse) SetResultCode(v string) *QueryRmsAgentbrowserResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryRmsAgentbrowserResponse) SetResultMsg(v string) *QueryRmsAgentbrowserResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryRmsAgentbrowserResponse) SetSuccess(v bool) *QueryRmsAgentbrowserResponse {
	s.Success = &v
	return s
}

func (s *QueryRmsAgentbrowserResponse) SetErrorMessage(v *CallErrorMessage) *QueryRmsAgentbrowserResponse {
	s.ErrorMessage = v
	return s
}

func (s *QueryRmsAgentbrowserResponse) SetResult(v string) *QueryRmsAgentbrowserResponse {
	s.Result = &v
	return s
}

type QueryRmsAlarmhistorytypeRequest struct {
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// from
	From *int64 `json:"from,omitempty" xml:"from,omitempty"`
	// to
	To *int64 `json:"to,omitempty" xml:"to,omitempty"`
}

func (s QueryRmsAlarmhistorytypeRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryRmsAlarmhistorytypeRequest) GoString() string {
	return s.String()
}

func (s *QueryRmsAlarmhistorytypeRequest) SetAuthToken(v string) *QueryRmsAlarmhistorytypeRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryRmsAlarmhistorytypeRequest) SetFrom(v int64) *QueryRmsAlarmhistorytypeRequest {
	s.From = &v
	return s
}

func (s *QueryRmsAlarmhistorytypeRequest) SetTo(v int64) *QueryRmsAlarmhistorytypeRequest {
	s.To = &v
	return s
}

type QueryRmsAlarmhistorytypeResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data []*AlarmTypeStatsVOKeySet `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
	// error_code
	ErrorCode *string `json:"error_code,omitempty" xml:"error_code,omitempty"`
	// rid
	Rid *string `json:"rid,omitempty" xml:"rid,omitempty"`
	// success
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s QueryRmsAlarmhistorytypeResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryRmsAlarmhistorytypeResponse) GoString() string {
	return s.String()
}

func (s *QueryRmsAlarmhistorytypeResponse) SetReqMsgId(v string) *QueryRmsAlarmhistorytypeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryRmsAlarmhistorytypeResponse) SetResultCode(v string) *QueryRmsAlarmhistorytypeResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryRmsAlarmhistorytypeResponse) SetResultMsg(v string) *QueryRmsAlarmhistorytypeResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryRmsAlarmhistorytypeResponse) SetData(v []*AlarmTypeStatsVOKeySet) *QueryRmsAlarmhistorytypeResponse {
	s.Data = v
	return s
}

func (s *QueryRmsAlarmhistorytypeResponse) SetErrorCode(v string) *QueryRmsAlarmhistorytypeResponse {
	s.ErrorCode = &v
	return s
}

func (s *QueryRmsAlarmhistorytypeResponse) SetRid(v string) *QueryRmsAlarmhistorytypeResponse {
	s.Rid = &v
	return s
}

func (s *QueryRmsAlarmhistorytypeResponse) SetSuccess(v bool) *QueryRmsAlarmhistorytypeResponse {
	s.Success = &v
	return s
}

type QueryRmsAlarmhistorylevelRequest struct {
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// from
	From *int64 `json:"from,omitempty" xml:"from,omitempty"`
	// to
	To *int64 `json:"to,omitempty" xml:"to,omitempty"`
}

func (s QueryRmsAlarmhistorylevelRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryRmsAlarmhistorylevelRequest) GoString() string {
	return s.String()
}

func (s *QueryRmsAlarmhistorylevelRequest) SetAuthToken(v string) *QueryRmsAlarmhistorylevelRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryRmsAlarmhistorylevelRequest) SetFrom(v int64) *QueryRmsAlarmhistorylevelRequest {
	s.From = &v
	return s
}

func (s *QueryRmsAlarmhistorylevelRequest) SetTo(v int64) *QueryRmsAlarmhistorylevelRequest {
	s.To = &v
	return s
}

type QueryRmsAlarmhistorylevelResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data []*AlarmLevelStatsVOKeySet `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
	// error_code
	ErrorCode *string `json:"error_code,omitempty" xml:"error_code,omitempty"`
	// rid
	Rid *string `json:"rid,omitempty" xml:"rid,omitempty"`
	// success
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s QueryRmsAlarmhistorylevelResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryRmsAlarmhistorylevelResponse) GoString() string {
	return s.String()
}

func (s *QueryRmsAlarmhistorylevelResponse) SetReqMsgId(v string) *QueryRmsAlarmhistorylevelResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryRmsAlarmhistorylevelResponse) SetResultCode(v string) *QueryRmsAlarmhistorylevelResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryRmsAlarmhistorylevelResponse) SetResultMsg(v string) *QueryRmsAlarmhistorylevelResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryRmsAlarmhistorylevelResponse) SetData(v []*AlarmLevelStatsVOKeySet) *QueryRmsAlarmhistorylevelResponse {
	s.Data = v
	return s
}

func (s *QueryRmsAlarmhistorylevelResponse) SetErrorCode(v string) *QueryRmsAlarmhistorylevelResponse {
	s.ErrorCode = &v
	return s
}

func (s *QueryRmsAlarmhistorylevelResponse) SetRid(v string) *QueryRmsAlarmhistorylevelResponse {
	s.Rid = &v
	return s
}

func (s *QueryRmsAlarmhistorylevelResponse) SetSuccess(v bool) *QueryRmsAlarmhistorylevelResponse {
	s.Success = &v
	return s
}

type QueryRmsNotifyhistoryRequest struct {
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// from
	From *int64 `json:"from,omitempty" xml:"from,omitempty"`
	// login_name
	LoginName *string `json:"login_name,omitempty" xml:"login_name,omitempty"`
	// to
	To *int64 `json:"to,omitempty" xml:"to,omitempty"`
}

func (s QueryRmsNotifyhistoryRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryRmsNotifyhistoryRequest) GoString() string {
	return s.String()
}

func (s *QueryRmsNotifyhistoryRequest) SetAuthToken(v string) *QueryRmsNotifyhistoryRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryRmsNotifyhistoryRequest) SetFrom(v int64) *QueryRmsNotifyhistoryRequest {
	s.From = &v
	return s
}

func (s *QueryRmsNotifyhistoryRequest) SetLoginName(v string) *QueryRmsNotifyhistoryRequest {
	s.LoginName = &v
	return s
}

func (s *QueryRmsNotifyhistoryRequest) SetTo(v int64) *QueryRmsNotifyhistoryRequest {
	s.To = &v
	return s
}

type QueryRmsNotifyhistoryResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data []*AlarmNotifyStats `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
	// error_code
	ErrorCode *string `json:"error_code,omitempty" xml:"error_code,omitempty"`
	// rid
	Rid *string `json:"rid,omitempty" xml:"rid,omitempty"`
	// success
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s QueryRmsNotifyhistoryResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryRmsNotifyhistoryResponse) GoString() string {
	return s.String()
}

func (s *QueryRmsNotifyhistoryResponse) SetReqMsgId(v string) *QueryRmsNotifyhistoryResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryRmsNotifyhistoryResponse) SetResultCode(v string) *QueryRmsNotifyhistoryResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryRmsNotifyhistoryResponse) SetResultMsg(v string) *QueryRmsNotifyhistoryResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryRmsNotifyhistoryResponse) SetData(v []*AlarmNotifyStats) *QueryRmsNotifyhistoryResponse {
	s.Data = v
	return s
}

func (s *QueryRmsNotifyhistoryResponse) SetErrorCode(v string) *QueryRmsNotifyhistoryResponse {
	s.ErrorCode = &v
	return s
}

func (s *QueryRmsNotifyhistoryResponse) SetRid(v string) *QueryRmsNotifyhistoryResponse {
	s.Rid = &v
	return s
}

func (s *QueryRmsNotifyhistoryResponse) SetSuccess(v bool) *QueryRmsNotifyhistoryResponse {
	s.Success = &v
	return s
}

type QueryRmsStackentityRequest struct {
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
}

func (s QueryRmsStackentityRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryRmsStackentityRequest) GoString() string {
	return s.String()
}

func (s *QueryRmsStackentityRequest) SetAuthToken(v string) *QueryRmsStackentityRequest {
	s.AuthToken = &v
	return s
}

type QueryRmsStackentityResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data []*LongKeySet `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
	// error_code
	ErrorCode *string `json:"error_code,omitempty" xml:"error_code,omitempty"`
	// rid
	Rid *string `json:"rid,omitempty" xml:"rid,omitempty"`
	// success
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s QueryRmsStackentityResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryRmsStackentityResponse) GoString() string {
	return s.String()
}

func (s *QueryRmsStackentityResponse) SetReqMsgId(v string) *QueryRmsStackentityResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryRmsStackentityResponse) SetResultCode(v string) *QueryRmsStackentityResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryRmsStackentityResponse) SetResultMsg(v string) *QueryRmsStackentityResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryRmsStackentityResponse) SetData(v []*LongKeySet) *QueryRmsStackentityResponse {
	s.Data = v
	return s
}

func (s *QueryRmsStackentityResponse) SetErrorCode(v string) *QueryRmsStackentityResponse {
	s.ErrorCode = &v
	return s
}

func (s *QueryRmsStackentityResponse) SetRid(v string) *QueryRmsStackentityResponse {
	s.Rid = &v
	return s
}

func (s *QueryRmsStackentityResponse) SetSuccess(v bool) *QueryRmsStackentityResponse {
	s.Success = &v
	return s
}

type QueryRmsAlarmhistoryappcountRequest struct {
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// app_list
	AppList *AppStats `json:"app_list,omitempty" xml:"app_list,omitempty"`
	// from
	From *int64 `json:"from,omitempty" xml:"from,omitempty"`
	// to
	To *int64 `json:"to,omitempty" xml:"to,omitempty"`
}

func (s QueryRmsAlarmhistoryappcountRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryRmsAlarmhistoryappcountRequest) GoString() string {
	return s.String()
}

func (s *QueryRmsAlarmhistoryappcountRequest) SetAuthToken(v string) *QueryRmsAlarmhistoryappcountRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryRmsAlarmhistoryappcountRequest) SetAppList(v *AppStats) *QueryRmsAlarmhistoryappcountRequest {
	s.AppList = v
	return s
}

func (s *QueryRmsAlarmhistoryappcountRequest) SetFrom(v int64) *QueryRmsAlarmhistoryappcountRequest {
	s.From = &v
	return s
}

func (s *QueryRmsAlarmhistoryappcountRequest) SetTo(v int64) *QueryRmsAlarmhistoryappcountRequest {
	s.To = &v
	return s
}

type QueryRmsAlarmhistoryappcountResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data []*AlarmAppStats `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
	// error_code
	ErrorCode *string `json:"error_code,omitempty" xml:"error_code,omitempty"`
	// rid
	Rid *string `json:"rid,omitempty" xml:"rid,omitempty"`
	// success
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s QueryRmsAlarmhistoryappcountResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryRmsAlarmhistoryappcountResponse) GoString() string {
	return s.String()
}

func (s *QueryRmsAlarmhistoryappcountResponse) SetReqMsgId(v string) *QueryRmsAlarmhistoryappcountResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryRmsAlarmhistoryappcountResponse) SetResultCode(v string) *QueryRmsAlarmhistoryappcountResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryRmsAlarmhistoryappcountResponse) SetResultMsg(v string) *QueryRmsAlarmhistoryappcountResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryRmsAlarmhistoryappcountResponse) SetData(v []*AlarmAppStats) *QueryRmsAlarmhistoryappcountResponse {
	s.Data = v
	return s
}

func (s *QueryRmsAlarmhistoryappcountResponse) SetErrorCode(v string) *QueryRmsAlarmhistoryappcountResponse {
	s.ErrorCode = &v
	return s
}

func (s *QueryRmsAlarmhistoryappcountResponse) SetRid(v string) *QueryRmsAlarmhistoryappcountResponse {
	s.Rid = &v
	return s
}

func (s *QueryRmsAlarmhistoryappcountResponse) SetSuccess(v bool) *QueryRmsAlarmhistoryappcountResponse {
	s.Success = &v
	return s
}

type QueryRmsAlarmhistoryappstatsRequest struct {
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// app_list
	AppList *AppStats `json:"app_list,omitempty" xml:"app_list,omitempty"`
	// from
	From *int64 `json:"from,omitempty" xml:"from,omitempty"`
	// to
	To *int64 `json:"to,omitempty" xml:"to,omitempty"`
}

func (s QueryRmsAlarmhistoryappstatsRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryRmsAlarmhistoryappstatsRequest) GoString() string {
	return s.String()
}

func (s *QueryRmsAlarmhistoryappstatsRequest) SetAuthToken(v string) *QueryRmsAlarmhistoryappstatsRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryRmsAlarmhistoryappstatsRequest) SetAppList(v *AppStats) *QueryRmsAlarmhistoryappstatsRequest {
	s.AppList = v
	return s
}

func (s *QueryRmsAlarmhistoryappstatsRequest) SetFrom(v int64) *QueryRmsAlarmhistoryappstatsRequest {
	s.From = &v
	return s
}

func (s *QueryRmsAlarmhistoryappstatsRequest) SetTo(v int64) *QueryRmsAlarmhistoryappstatsRequest {
	s.To = &v
	return s
}

type QueryRmsAlarmhistoryappstatsResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data []*AlarmHistoryListKeySetMap `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
	// error_code
	ErrorCode *string `json:"error_code,omitempty" xml:"error_code,omitempty"`
	// rid
	Rid *string `json:"rid,omitempty" xml:"rid,omitempty"`
	// success
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s QueryRmsAlarmhistoryappstatsResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryRmsAlarmhistoryappstatsResponse) GoString() string {
	return s.String()
}

func (s *QueryRmsAlarmhistoryappstatsResponse) SetReqMsgId(v string) *QueryRmsAlarmhistoryappstatsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryRmsAlarmhistoryappstatsResponse) SetResultCode(v string) *QueryRmsAlarmhistoryappstatsResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryRmsAlarmhistoryappstatsResponse) SetResultMsg(v string) *QueryRmsAlarmhistoryappstatsResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryRmsAlarmhistoryappstatsResponse) SetData(v []*AlarmHistoryListKeySetMap) *QueryRmsAlarmhistoryappstatsResponse {
	s.Data = v
	return s
}

func (s *QueryRmsAlarmhistoryappstatsResponse) SetErrorCode(v string) *QueryRmsAlarmhistoryappstatsResponse {
	s.ErrorCode = &v
	return s
}

func (s *QueryRmsAlarmhistoryappstatsResponse) SetRid(v string) *QueryRmsAlarmhistoryappstatsResponse {
	s.Rid = &v
	return s
}

func (s *QueryRmsAlarmhistoryappstatsResponse) SetSuccess(v bool) *QueryRmsAlarmhistoryappstatsResponse {
	s.Success = &v
	return s
}

type QueryRmsAppstatspageableRequest struct {
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// app_list
	AppList *AppStats `json:"app_list,omitempty" xml:"app_list,omitempty"`
	// from
	From *int64 `json:"from,omitempty" xml:"from,omitempty"`
	// to
	To *int64 `json:"to,omitempty" xml:"to,omitempty"`
}

func (s QueryRmsAppstatspageableRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryRmsAppstatspageableRequest) GoString() string {
	return s.String()
}

func (s *QueryRmsAppstatspageableRequest) SetAuthToken(v string) *QueryRmsAppstatspageableRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryRmsAppstatspageableRequest) SetAppList(v *AppStats) *QueryRmsAppstatspageableRequest {
	s.AppList = v
	return s
}

func (s *QueryRmsAppstatspageableRequest) SetFrom(v int64) *QueryRmsAppstatspageableRequest {
	s.From = &v
	return s
}

func (s *QueryRmsAppstatspageableRequest) SetTo(v int64) *QueryRmsAppstatspageableRequest {
	s.To = &v
	return s
}

type QueryRmsAppstatspageableResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data []*AlarmHistoryListKeySetMap `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
	// error_code
	ErrorCode *string `json:"error_code,omitempty" xml:"error_code,omitempty"`
	// rid
	Rid *string `json:"rid,omitempty" xml:"rid,omitempty"`
	// success
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s QueryRmsAppstatspageableResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryRmsAppstatspageableResponse) GoString() string {
	return s.String()
}

func (s *QueryRmsAppstatspageableResponse) SetReqMsgId(v string) *QueryRmsAppstatspageableResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryRmsAppstatspageableResponse) SetResultCode(v string) *QueryRmsAppstatspageableResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryRmsAppstatspageableResponse) SetResultMsg(v string) *QueryRmsAppstatspageableResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryRmsAppstatspageableResponse) SetData(v []*AlarmHistoryListKeySetMap) *QueryRmsAppstatspageableResponse {
	s.Data = v
	return s
}

func (s *QueryRmsAppstatspageableResponse) SetErrorCode(v string) *QueryRmsAppstatspageableResponse {
	s.ErrorCode = &v
	return s
}

func (s *QueryRmsAppstatspageableResponse) SetRid(v string) *QueryRmsAppstatspageableResponse {
	s.Rid = &v
	return s
}

func (s *QueryRmsAppstatspageableResponse) SetSuccess(v bool) *QueryRmsAppstatspageableResponse {
	s.Success = &v
	return s
}

type QueryRmsLogreaderrorRequest struct {
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// app
	App *string `json:"app,omitempty" xml:"app,omitempty"`
	// time
	Time *int64 `json:"time,omitempty" xml:"time,omitempty"`
}

func (s QueryRmsLogreaderrorRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryRmsLogreaderrorRequest) GoString() string {
	return s.String()
}

func (s *QueryRmsLogreaderrorRequest) SetAuthToken(v string) *QueryRmsLogreaderrorRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryRmsLogreaderrorRequest) SetApp(v string) *QueryRmsLogreaderrorRequest {
	s.App = &v
	return s
}

func (s *QueryRmsLogreaderrorRequest) SetTime(v int64) *QueryRmsLogreaderrorRequest {
	s.Time = &v
	return s
}

type QueryRmsLogreaderrorResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *ErrorRealte `json:"data,omitempty" xml:"data,omitempty"`
	// error_code
	ErrorCode *string `json:"error_code,omitempty" xml:"error_code,omitempty"`
	// rid
	Rid *string `json:"rid,omitempty" xml:"rid,omitempty"`
	// success
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s QueryRmsLogreaderrorResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryRmsLogreaderrorResponse) GoString() string {
	return s.String()
}

func (s *QueryRmsLogreaderrorResponse) SetReqMsgId(v string) *QueryRmsLogreaderrorResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryRmsLogreaderrorResponse) SetResultCode(v string) *QueryRmsLogreaderrorResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryRmsLogreaderrorResponse) SetResultMsg(v string) *QueryRmsLogreaderrorResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryRmsLogreaderrorResponse) SetData(v *ErrorRealte) *QueryRmsLogreaderrorResponse {
	s.Data = v
	return s
}

func (s *QueryRmsLogreaderrorResponse) SetErrorCode(v string) *QueryRmsLogreaderrorResponse {
	s.ErrorCode = &v
	return s
}

func (s *QueryRmsLogreaderrorResponse) SetRid(v string) *QueryRmsLogreaderrorResponse {
	s.Rid = &v
	return s
}

func (s *QueryRmsLogreaderrorResponse) SetSuccess(v bool) *QueryRmsLogreaderrorResponse {
	s.Success = &v
	return s
}

type QueryRmsUniversalreadRequest struct {
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// cmds
	Cmds []*UniversalBodyCmd `json:"cmds,omitempty" xml:"cmds,omitempty" type:"Repeated"`
	// rid
	Rid *string `json:"rid,omitempty" xml:"rid,omitempty"`
}

func (s QueryRmsUniversalreadRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryRmsUniversalreadRequest) GoString() string {
	return s.String()
}

func (s *QueryRmsUniversalreadRequest) SetAuthToken(v string) *QueryRmsUniversalreadRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryRmsUniversalreadRequest) SetCmds(v []*UniversalBodyCmd) *QueryRmsUniversalreadRequest {
	s.Cmds = v
	return s
}

func (s *QueryRmsUniversalreadRequest) SetRid(v string) *QueryRmsUniversalreadRequest {
	s.Rid = &v
	return s
}

type QueryRmsUniversalreadResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data []*string `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
	// error_code
	ErrorCode *string `json:"error_code,omitempty" xml:"error_code,omitempty"`
	// rid
	Rid *string `json:"rid,omitempty" xml:"rid,omitempty"`
	// success
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s QueryRmsUniversalreadResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryRmsUniversalreadResponse) GoString() string {
	return s.String()
}

func (s *QueryRmsUniversalreadResponse) SetReqMsgId(v string) *QueryRmsUniversalreadResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryRmsUniversalreadResponse) SetResultCode(v string) *QueryRmsUniversalreadResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryRmsUniversalreadResponse) SetResultMsg(v string) *QueryRmsUniversalreadResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryRmsUniversalreadResponse) SetData(v []*string) *QueryRmsUniversalreadResponse {
	s.Data = v
	return s
}

func (s *QueryRmsUniversalreadResponse) SetErrorCode(v string) *QueryRmsUniversalreadResponse {
	s.ErrorCode = &v
	return s
}

func (s *QueryRmsUniversalreadResponse) SetRid(v string) *QueryRmsUniversalreadResponse {
	s.Rid = &v
	return s
}

func (s *QueryRmsUniversalreadResponse) SetSuccess(v bool) *QueryRmsUniversalreadResponse {
	s.Success = &v
	return s
}

type QueryRmsUniversalwriteRequest struct {
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// cmds
	Cmds []*UniversalBodyCmd `json:"cmds,omitempty" xml:"cmds,omitempty" type:"Repeated"`
	// rid
	Rid *string `json:"rid,omitempty" xml:"rid,omitempty"`
}

func (s QueryRmsUniversalwriteRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryRmsUniversalwriteRequest) GoString() string {
	return s.String()
}

func (s *QueryRmsUniversalwriteRequest) SetAuthToken(v string) *QueryRmsUniversalwriteRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryRmsUniversalwriteRequest) SetCmds(v []*UniversalBodyCmd) *QueryRmsUniversalwriteRequest {
	s.Cmds = v
	return s
}

func (s *QueryRmsUniversalwriteRequest) SetRid(v string) *QueryRmsUniversalwriteRequest {
	s.Rid = &v
	return s
}

type QueryRmsUniversalwriteResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data []*string `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
	// error_code
	ErrorCode *string `json:"error_code,omitempty" xml:"error_code,omitempty"`
	// rid
	Rid *string `json:"rid,omitempty" xml:"rid,omitempty"`
	// success
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s QueryRmsUniversalwriteResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryRmsUniversalwriteResponse) GoString() string {
	return s.String()
}

func (s *QueryRmsUniversalwriteResponse) SetReqMsgId(v string) *QueryRmsUniversalwriteResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryRmsUniversalwriteResponse) SetResultCode(v string) *QueryRmsUniversalwriteResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryRmsUniversalwriteResponse) SetResultMsg(v string) *QueryRmsUniversalwriteResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryRmsUniversalwriteResponse) SetData(v []*string) *QueryRmsUniversalwriteResponse {
	s.Data = v
	return s
}

func (s *QueryRmsUniversalwriteResponse) SetErrorCode(v string) *QueryRmsUniversalwriteResponse {
	s.ErrorCode = &v
	return s
}

func (s *QueryRmsUniversalwriteResponse) SetRid(v string) *QueryRmsUniversalwriteResponse {
	s.Rid = &v
	return s
}

func (s *QueryRmsUniversalwriteResponse) SetSuccess(v bool) *QueryRmsUniversalwriteResponse {
	s.Success = &v
	return s
}

type CreateRmsPluginRequest struct {
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// body
	Body *string `json:"body,omitempty" xml:"body,omitempty"`
	// file_id
	FileId *int64 `json:"file_id,omitempty" xml:"file_id,omitempty"`
	// id
	Id *int64 `json:"id,omitempty" xml:"id,omitempty"`
	// outside_bizdomain
	OutsideBizdomain *string `json:"outside_bizdomain,omitempty" xml:"outside_bizdomain,omitempty"`
	// plugin_id
	PluginId *int64 `json:"plugin_id,omitempty" xml:"plugin_id,omitempty"`
	// table
	Table *string `json:"table,omitempty" xml:"table,omitempty"`
}

func (s CreateRmsPluginRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateRmsPluginRequest) GoString() string {
	return s.String()
}

func (s *CreateRmsPluginRequest) SetAuthToken(v string) *CreateRmsPluginRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateRmsPluginRequest) SetBody(v string) *CreateRmsPluginRequest {
	s.Body = &v
	return s
}

func (s *CreateRmsPluginRequest) SetFileId(v int64) *CreateRmsPluginRequest {
	s.FileId = &v
	return s
}

func (s *CreateRmsPluginRequest) SetId(v int64) *CreateRmsPluginRequest {
	s.Id = &v
	return s
}

func (s *CreateRmsPluginRequest) SetOutsideBizdomain(v string) *CreateRmsPluginRequest {
	s.OutsideBizdomain = &v
	return s
}

func (s *CreateRmsPluginRequest) SetPluginId(v int64) *CreateRmsPluginRequest {
	s.PluginId = &v
	return s
}

func (s *CreateRmsPluginRequest) SetTable(v string) *CreateRmsPluginRequest {
	s.Table = &v
	return s
}

type CreateRmsPluginResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *bool `json:"data,omitempty" xml:"data,omitempty"`
	// error_code
	ErrorCode *string `json:"error_code,omitempty" xml:"error_code,omitempty"`
	// rid
	Rid *string `json:"rid,omitempty" xml:"rid,omitempty"`
	// success
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s CreateRmsPluginResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateRmsPluginResponse) GoString() string {
	return s.String()
}

func (s *CreateRmsPluginResponse) SetReqMsgId(v string) *CreateRmsPluginResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateRmsPluginResponse) SetResultCode(v string) *CreateRmsPluginResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateRmsPluginResponse) SetResultMsg(v string) *CreateRmsPluginResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateRmsPluginResponse) SetData(v bool) *CreateRmsPluginResponse {
	s.Data = &v
	return s
}

func (s *CreateRmsPluginResponse) SetErrorCode(v string) *CreateRmsPluginResponse {
	s.ErrorCode = &v
	return s
}

func (s *CreateRmsPluginResponse) SetRid(v string) *CreateRmsPluginResponse {
	s.Rid = &v
	return s
}

func (s *CreateRmsPluginResponse) SetSuccess(v bool) *CreateRmsPluginResponse {
	s.Success = &v
	return s
}

type DeleteRmsPluginRequest struct {
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// body
	Body *string `json:"body,omitempty" xml:"body,omitempty"`
	// file_id
	FileId *int64 `json:"file_id,omitempty" xml:"file_id,omitempty"`
	// id
	Id *int64 `json:"id,omitempty" xml:"id,omitempty"`
	// outside_bizdomain
	OutsideBizdomain *string `json:"outside_bizdomain,omitempty" xml:"outside_bizdomain,omitempty"`
	// plugin_id
	PluginId *int64 `json:"plugin_id,omitempty" xml:"plugin_id,omitempty"`
	// table
	Table *string `json:"table,omitempty" xml:"table,omitempty"`
}

func (s DeleteRmsPluginRequest) String() string {
	return tea.Prettify(s)
}

func (s DeleteRmsPluginRequest) GoString() string {
	return s.String()
}

func (s *DeleteRmsPluginRequest) SetAuthToken(v string) *DeleteRmsPluginRequest {
	s.AuthToken = &v
	return s
}

func (s *DeleteRmsPluginRequest) SetBody(v string) *DeleteRmsPluginRequest {
	s.Body = &v
	return s
}

func (s *DeleteRmsPluginRequest) SetFileId(v int64) *DeleteRmsPluginRequest {
	s.FileId = &v
	return s
}

func (s *DeleteRmsPluginRequest) SetId(v int64) *DeleteRmsPluginRequest {
	s.Id = &v
	return s
}

func (s *DeleteRmsPluginRequest) SetOutsideBizdomain(v string) *DeleteRmsPluginRequest {
	s.OutsideBizdomain = &v
	return s
}

func (s *DeleteRmsPluginRequest) SetPluginId(v int64) *DeleteRmsPluginRequest {
	s.PluginId = &v
	return s
}

func (s *DeleteRmsPluginRequest) SetTable(v string) *DeleteRmsPluginRequest {
	s.Table = &v
	return s
}

type DeleteRmsPluginResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *bool `json:"data,omitempty" xml:"data,omitempty"`
	// error_code
	ErrorCode *string `json:"error_code,omitempty" xml:"error_code,omitempty"`
	// rid
	Rid *string `json:"rid,omitempty" xml:"rid,omitempty"`
	// success
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s DeleteRmsPluginResponse) String() string {
	return tea.Prettify(s)
}

func (s DeleteRmsPluginResponse) GoString() string {
	return s.String()
}

func (s *DeleteRmsPluginResponse) SetReqMsgId(v string) *DeleteRmsPluginResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DeleteRmsPluginResponse) SetResultCode(v string) *DeleteRmsPluginResponse {
	s.ResultCode = &v
	return s
}

func (s *DeleteRmsPluginResponse) SetResultMsg(v string) *DeleteRmsPluginResponse {
	s.ResultMsg = &v
	return s
}

func (s *DeleteRmsPluginResponse) SetData(v bool) *DeleteRmsPluginResponse {
	s.Data = &v
	return s
}

func (s *DeleteRmsPluginResponse) SetErrorCode(v string) *DeleteRmsPluginResponse {
	s.ErrorCode = &v
	return s
}

func (s *DeleteRmsPluginResponse) SetRid(v string) *DeleteRmsPluginResponse {
	s.Rid = &v
	return s
}

func (s *DeleteRmsPluginResponse) SetSuccess(v bool) *DeleteRmsPluginResponse {
	s.Success = &v
	return s
}

type CloseRmsPluginRequest struct {
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// body
	Body *string `json:"body,omitempty" xml:"body,omitempty"`
	// file_id
	FileId *int64 `json:"file_id,omitempty" xml:"file_id,omitempty"`
	// id
	Id *int64 `json:"id,omitempty" xml:"id,omitempty"`
	// outside_bizdomain
	OutsideBizdomain *string `json:"outside_bizdomain,omitempty" xml:"outside_bizdomain,omitempty"`
	// plugin_id
	PluginId *int64 `json:"plugin_id,omitempty" xml:"plugin_id,omitempty"`
	// table
	Table *string `json:"table,omitempty" xml:"table,omitempty"`
}

func (s CloseRmsPluginRequest) String() string {
	return tea.Prettify(s)
}

func (s CloseRmsPluginRequest) GoString() string {
	return s.String()
}

func (s *CloseRmsPluginRequest) SetAuthToken(v string) *CloseRmsPluginRequest {
	s.AuthToken = &v
	return s
}

func (s *CloseRmsPluginRequest) SetBody(v string) *CloseRmsPluginRequest {
	s.Body = &v
	return s
}

func (s *CloseRmsPluginRequest) SetFileId(v int64) *CloseRmsPluginRequest {
	s.FileId = &v
	return s
}

func (s *CloseRmsPluginRequest) SetId(v int64) *CloseRmsPluginRequest {
	s.Id = &v
	return s
}

func (s *CloseRmsPluginRequest) SetOutsideBizdomain(v string) *CloseRmsPluginRequest {
	s.OutsideBizdomain = &v
	return s
}

func (s *CloseRmsPluginRequest) SetPluginId(v int64) *CloseRmsPluginRequest {
	s.PluginId = &v
	return s
}

func (s *CloseRmsPluginRequest) SetTable(v string) *CloseRmsPluginRequest {
	s.Table = &v
	return s
}

type CloseRmsPluginResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *bool `json:"data,omitempty" xml:"data,omitempty"`
	// error_code
	ErrorCode *string `json:"error_code,omitempty" xml:"error_code,omitempty"`
	// rid
	Rid *string `json:"rid,omitempty" xml:"rid,omitempty"`
	// success
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s CloseRmsPluginResponse) String() string {
	return tea.Prettify(s)
}

func (s CloseRmsPluginResponse) GoString() string {
	return s.String()
}

func (s *CloseRmsPluginResponse) SetReqMsgId(v string) *CloseRmsPluginResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CloseRmsPluginResponse) SetResultCode(v string) *CloseRmsPluginResponse {
	s.ResultCode = &v
	return s
}

func (s *CloseRmsPluginResponse) SetResultMsg(v string) *CloseRmsPluginResponse {
	s.ResultMsg = &v
	return s
}

func (s *CloseRmsPluginResponse) SetData(v bool) *CloseRmsPluginResponse {
	s.Data = &v
	return s
}

func (s *CloseRmsPluginResponse) SetErrorCode(v string) *CloseRmsPluginResponse {
	s.ErrorCode = &v
	return s
}

func (s *CloseRmsPluginResponse) SetRid(v string) *CloseRmsPluginResponse {
	s.Rid = &v
	return s
}

func (s *CloseRmsPluginResponse) SetSuccess(v bool) *CloseRmsPluginResponse {
	s.Success = &v
	return s
}

type OpenRmsPluginRequest struct {
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// body
	Body *string `json:"body,omitempty" xml:"body,omitempty"`
	// file_id
	FileId *int64 `json:"file_id,omitempty" xml:"file_id,omitempty"`
	// id
	Id *int64 `json:"id,omitempty" xml:"id,omitempty"`
	// outside_bizdomain
	OutsideBizdomain *string `json:"outside_bizdomain,omitempty" xml:"outside_bizdomain,omitempty"`
	// plugin_id
	PluginId *int64 `json:"plugin_id,omitempty" xml:"plugin_id,omitempty"`
	// table
	Table *string `json:"table,omitempty" xml:"table,omitempty"`
}

func (s OpenRmsPluginRequest) String() string {
	return tea.Prettify(s)
}

func (s OpenRmsPluginRequest) GoString() string {
	return s.String()
}

func (s *OpenRmsPluginRequest) SetAuthToken(v string) *OpenRmsPluginRequest {
	s.AuthToken = &v
	return s
}

func (s *OpenRmsPluginRequest) SetBody(v string) *OpenRmsPluginRequest {
	s.Body = &v
	return s
}

func (s *OpenRmsPluginRequest) SetFileId(v int64) *OpenRmsPluginRequest {
	s.FileId = &v
	return s
}

func (s *OpenRmsPluginRequest) SetId(v int64) *OpenRmsPluginRequest {
	s.Id = &v
	return s
}

func (s *OpenRmsPluginRequest) SetOutsideBizdomain(v string) *OpenRmsPluginRequest {
	s.OutsideBizdomain = &v
	return s
}

func (s *OpenRmsPluginRequest) SetPluginId(v int64) *OpenRmsPluginRequest {
	s.PluginId = &v
	return s
}

func (s *OpenRmsPluginRequest) SetTable(v string) *OpenRmsPluginRequest {
	s.Table = &v
	return s
}

type OpenRmsPluginResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *bool `json:"data,omitempty" xml:"data,omitempty"`
	// error_code
	ErrorCode *string `json:"error_code,omitempty" xml:"error_code,omitempty"`
	// rid
	Rid *string `json:"rid,omitempty" xml:"rid,omitempty"`
	// success
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s OpenRmsPluginResponse) String() string {
	return tea.Prettify(s)
}

func (s OpenRmsPluginResponse) GoString() string {
	return s.String()
}

func (s *OpenRmsPluginResponse) SetReqMsgId(v string) *OpenRmsPluginResponse {
	s.ReqMsgId = &v
	return s
}

func (s *OpenRmsPluginResponse) SetResultCode(v string) *OpenRmsPluginResponse {
	s.ResultCode = &v
	return s
}

func (s *OpenRmsPluginResponse) SetResultMsg(v string) *OpenRmsPluginResponse {
	s.ResultMsg = &v
	return s
}

func (s *OpenRmsPluginResponse) SetData(v bool) *OpenRmsPluginResponse {
	s.Data = &v
	return s
}

func (s *OpenRmsPluginResponse) SetErrorCode(v string) *OpenRmsPluginResponse {
	s.ErrorCode = &v
	return s
}

func (s *OpenRmsPluginResponse) SetRid(v string) *OpenRmsPluginResponse {
	s.Rid = &v
	return s
}

func (s *OpenRmsPluginResponse) SetSuccess(v bool) *OpenRmsPluginResponse {
	s.Success = &v
	return s
}

type UpdateRmsPluginRequest struct {
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// body
	Body *string `json:"body,omitempty" xml:"body,omitempty"`
	// file_id
	FileId *int64 `json:"file_id,omitempty" xml:"file_id,omitempty"`
	// id
	Id *int64 `json:"id,omitempty" xml:"id,omitempty"`
	// outside_bizdomain
	OutsideBizdomain *string `json:"outside_bizdomain,omitempty" xml:"outside_bizdomain,omitempty"`
	// plugin_id
	PluginId *int64 `json:"plugin_id,omitempty" xml:"plugin_id,omitempty"`
	// table
	Table *string `json:"table,omitempty" xml:"table,omitempty"`
}

func (s UpdateRmsPluginRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateRmsPluginRequest) GoString() string {
	return s.String()
}

func (s *UpdateRmsPluginRequest) SetAuthToken(v string) *UpdateRmsPluginRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateRmsPluginRequest) SetBody(v string) *UpdateRmsPluginRequest {
	s.Body = &v
	return s
}

func (s *UpdateRmsPluginRequest) SetFileId(v int64) *UpdateRmsPluginRequest {
	s.FileId = &v
	return s
}

func (s *UpdateRmsPluginRequest) SetId(v int64) *UpdateRmsPluginRequest {
	s.Id = &v
	return s
}

func (s *UpdateRmsPluginRequest) SetOutsideBizdomain(v string) *UpdateRmsPluginRequest {
	s.OutsideBizdomain = &v
	return s
}

func (s *UpdateRmsPluginRequest) SetPluginId(v int64) *UpdateRmsPluginRequest {
	s.PluginId = &v
	return s
}

func (s *UpdateRmsPluginRequest) SetTable(v string) *UpdateRmsPluginRequest {
	s.Table = &v
	return s
}

type UpdateRmsPluginResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *bool `json:"data,omitempty" xml:"data,omitempty"`
	// error_code
	ErrorCode *string `json:"error_code,omitempty" xml:"error_code,omitempty"`
	// rid
	Rid *string `json:"rid,omitempty" xml:"rid,omitempty"`
	// success
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s UpdateRmsPluginResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateRmsPluginResponse) GoString() string {
	return s.String()
}

func (s *UpdateRmsPluginResponse) SetReqMsgId(v string) *UpdateRmsPluginResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateRmsPluginResponse) SetResultCode(v string) *UpdateRmsPluginResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateRmsPluginResponse) SetResultMsg(v string) *UpdateRmsPluginResponse {
	s.ResultMsg = &v
	return s
}

func (s *UpdateRmsPluginResponse) SetData(v bool) *UpdateRmsPluginResponse {
	s.Data = &v
	return s
}

func (s *UpdateRmsPluginResponse) SetErrorCode(v string) *UpdateRmsPluginResponse {
	s.ErrorCode = &v
	return s
}

func (s *UpdateRmsPluginResponse) SetRid(v string) *UpdateRmsPluginResponse {
	s.Rid = &v
	return s
}

func (s *UpdateRmsPluginResponse) SetSuccess(v bool) *UpdateRmsPluginResponse {
	s.Success = &v
	return s
}

type QueryRmsPluginbytypeRequest struct {
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// body
	Body *string `json:"body,omitempty" xml:"body,omitempty"`
	// file_id
	FileId *int64 `json:"file_id,omitempty" xml:"file_id,omitempty"`
	// id
	Id *int64 `json:"id,omitempty" xml:"id,omitempty"`
	// outside_bizdomain
	OutsideBizdomain *string `json:"outside_bizdomain,omitempty" xml:"outside_bizdomain,omitempty"`
	// plugin_id
	PluginId *int64 `json:"plugin_id,omitempty" xml:"plugin_id,omitempty"`
	// table
	Table *string `json:"table,omitempty" xml:"table,omitempty"`
}

func (s QueryRmsPluginbytypeRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryRmsPluginbytypeRequest) GoString() string {
	return s.String()
}

func (s *QueryRmsPluginbytypeRequest) SetAuthToken(v string) *QueryRmsPluginbytypeRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryRmsPluginbytypeRequest) SetBody(v string) *QueryRmsPluginbytypeRequest {
	s.Body = &v
	return s
}

func (s *QueryRmsPluginbytypeRequest) SetFileId(v int64) *QueryRmsPluginbytypeRequest {
	s.FileId = &v
	return s
}

func (s *QueryRmsPluginbytypeRequest) SetId(v int64) *QueryRmsPluginbytypeRequest {
	s.Id = &v
	return s
}

func (s *QueryRmsPluginbytypeRequest) SetOutsideBizdomain(v string) *QueryRmsPluginbytypeRequest {
	s.OutsideBizdomain = &v
	return s
}

func (s *QueryRmsPluginbytypeRequest) SetPluginId(v int64) *QueryRmsPluginbytypeRequest {
	s.PluginId = &v
	return s
}

func (s *QueryRmsPluginbytypeRequest) SetTable(v string) *QueryRmsPluginbytypeRequest {
	s.Table = &v
	return s
}

type QueryRmsPluginbytypeResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data []*PluginModelDO `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
	// error_code
	ErrorCode *string `json:"error_code,omitempty" xml:"error_code,omitempty"`
	// rid
	Rid *string `json:"rid,omitempty" xml:"rid,omitempty"`
	// success
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s QueryRmsPluginbytypeResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryRmsPluginbytypeResponse) GoString() string {
	return s.String()
}

func (s *QueryRmsPluginbytypeResponse) SetReqMsgId(v string) *QueryRmsPluginbytypeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryRmsPluginbytypeResponse) SetResultCode(v string) *QueryRmsPluginbytypeResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryRmsPluginbytypeResponse) SetResultMsg(v string) *QueryRmsPluginbytypeResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryRmsPluginbytypeResponse) SetData(v []*PluginModelDO) *QueryRmsPluginbytypeResponse {
	s.Data = v
	return s
}

func (s *QueryRmsPluginbytypeResponse) SetErrorCode(v string) *QueryRmsPluginbytypeResponse {
	s.ErrorCode = &v
	return s
}

func (s *QueryRmsPluginbytypeResponse) SetRid(v string) *QueryRmsPluginbytypeResponse {
	s.Rid = &v
	return s
}

func (s *QueryRmsPluginbytypeResponse) SetSuccess(v bool) *QueryRmsPluginbytypeResponse {
	s.Success = &v
	return s
}

type QueryRmsPluginbyfolderRequest struct {
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// body
	Body *string `json:"body,omitempty" xml:"body,omitempty"`
	// file_id
	FileId *int64 `json:"file_id,omitempty" xml:"file_id,omitempty"`
	// id
	Id *int64 `json:"id,omitempty" xml:"id,omitempty"`
	// outside_bizdomain
	OutsideBizdomain *string `json:"outside_bizdomain,omitempty" xml:"outside_bizdomain,omitempty"`
	// plugin_id
	PluginId *int64 `json:"plugin_id,omitempty" xml:"plugin_id,omitempty"`
	// table
	Table *string `json:"table,omitempty" xml:"table,omitempty"`
}

func (s QueryRmsPluginbyfolderRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryRmsPluginbyfolderRequest) GoString() string {
	return s.String()
}

func (s *QueryRmsPluginbyfolderRequest) SetAuthToken(v string) *QueryRmsPluginbyfolderRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryRmsPluginbyfolderRequest) SetBody(v string) *QueryRmsPluginbyfolderRequest {
	s.Body = &v
	return s
}

func (s *QueryRmsPluginbyfolderRequest) SetFileId(v int64) *QueryRmsPluginbyfolderRequest {
	s.FileId = &v
	return s
}

func (s *QueryRmsPluginbyfolderRequest) SetId(v int64) *QueryRmsPluginbyfolderRequest {
	s.Id = &v
	return s
}

func (s *QueryRmsPluginbyfolderRequest) SetOutsideBizdomain(v string) *QueryRmsPluginbyfolderRequest {
	s.OutsideBizdomain = &v
	return s
}

func (s *QueryRmsPluginbyfolderRequest) SetPluginId(v int64) *QueryRmsPluginbyfolderRequest {
	s.PluginId = &v
	return s
}

func (s *QueryRmsPluginbyfolderRequest) SetTable(v string) *QueryRmsPluginbyfolderRequest {
	s.Table = &v
	return s
}

type QueryRmsPluginbyfolderResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data []*ModelTreeNode `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
	// error_code
	ErrorCode *string `json:"error_code,omitempty" xml:"error_code,omitempty"`
	// rid
	Rid *string `json:"rid,omitempty" xml:"rid,omitempty"`
	// success
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s QueryRmsPluginbyfolderResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryRmsPluginbyfolderResponse) GoString() string {
	return s.String()
}

func (s *QueryRmsPluginbyfolderResponse) SetReqMsgId(v string) *QueryRmsPluginbyfolderResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryRmsPluginbyfolderResponse) SetResultCode(v string) *QueryRmsPluginbyfolderResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryRmsPluginbyfolderResponse) SetResultMsg(v string) *QueryRmsPluginbyfolderResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryRmsPluginbyfolderResponse) SetData(v []*ModelTreeNode) *QueryRmsPluginbyfolderResponse {
	s.Data = v
	return s
}

func (s *QueryRmsPluginbyfolderResponse) SetErrorCode(v string) *QueryRmsPluginbyfolderResponse {
	s.ErrorCode = &v
	return s
}

func (s *QueryRmsPluginbyfolderResponse) SetRid(v string) *QueryRmsPluginbyfolderResponse {
	s.Rid = &v
	return s
}

func (s *QueryRmsPluginbyfolderResponse) SetSuccess(v bool) *QueryRmsPluginbyfolderResponse {
	s.Success = &v
	return s
}

type QueryRmsPluginRequest struct {
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// body
	Body *string `json:"body,omitempty" xml:"body,omitempty"`
	// file_id
	FileId *int64 `json:"file_id,omitempty" xml:"file_id,omitempty"`
	// id
	Id *int64 `json:"id,omitempty" xml:"id,omitempty"`
	// outside_bizdomain
	OutsideBizdomain *string `json:"outside_bizdomain,omitempty" xml:"outside_bizdomain,omitempty"`
	// plugin_id
	PluginId *int64 `json:"plugin_id,omitempty" xml:"plugin_id,omitempty"`
	// table
	Table *string `json:"table,omitempty" xml:"table,omitempty"`
}

func (s QueryRmsPluginRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryRmsPluginRequest) GoString() string {
	return s.String()
}

func (s *QueryRmsPluginRequest) SetAuthToken(v string) *QueryRmsPluginRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryRmsPluginRequest) SetBody(v string) *QueryRmsPluginRequest {
	s.Body = &v
	return s
}

func (s *QueryRmsPluginRequest) SetFileId(v int64) *QueryRmsPluginRequest {
	s.FileId = &v
	return s
}

func (s *QueryRmsPluginRequest) SetId(v int64) *QueryRmsPluginRequest {
	s.Id = &v
	return s
}

func (s *QueryRmsPluginRequest) SetOutsideBizdomain(v string) *QueryRmsPluginRequest {
	s.OutsideBizdomain = &v
	return s
}

func (s *QueryRmsPluginRequest) SetPluginId(v int64) *QueryRmsPluginRequest {
	s.PluginId = &v
	return s
}

func (s *QueryRmsPluginRequest) SetTable(v string) *QueryRmsPluginRequest {
	s.Table = &v
	return s
}

type QueryRmsPluginResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *PluginModelDO `json:"data,omitempty" xml:"data,omitempty"`
	// error_code
	ErrorCode *string `json:"error_code,omitempty" xml:"error_code,omitempty"`
	// rid
	Rid *string `json:"rid,omitempty" xml:"rid,omitempty"`
	// success
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s QueryRmsPluginResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryRmsPluginResponse) GoString() string {
	return s.String()
}

func (s *QueryRmsPluginResponse) SetReqMsgId(v string) *QueryRmsPluginResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryRmsPluginResponse) SetResultCode(v string) *QueryRmsPluginResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryRmsPluginResponse) SetResultMsg(v string) *QueryRmsPluginResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryRmsPluginResponse) SetData(v *PluginModelDO) *QueryRmsPluginResponse {
	s.Data = v
	return s
}

func (s *QueryRmsPluginResponse) SetErrorCode(v string) *QueryRmsPluginResponse {
	s.ErrorCode = &v
	return s
}

func (s *QueryRmsPluginResponse) SetRid(v string) *QueryRmsPluginResponse {
	s.Rid = &v
	return s
}

func (s *QueryRmsPluginResponse) SetSuccess(v bool) *QueryRmsPluginResponse {
	s.Success = &v
	return s
}

type QueryRmsPlugintestRequest struct {
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// body
	Body *string `json:"body,omitempty" xml:"body,omitempty"`
	// file_id
	FileId *int64 `json:"file_id,omitempty" xml:"file_id,omitempty"`
	// id
	Id *int64 `json:"id,omitempty" xml:"id,omitempty"`
	// outside_bizdomain
	OutsideBizdomain *string `json:"outside_bizdomain,omitempty" xml:"outside_bizdomain,omitempty"`
	// plugin_id
	PluginId *int64 `json:"plugin_id,omitempty" xml:"plugin_id,omitempty"`
	// table
	Table *string `json:"table,omitempty" xml:"table,omitempty"`
}

func (s QueryRmsPlugintestRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryRmsPlugintestRequest) GoString() string {
	return s.String()
}

func (s *QueryRmsPlugintestRequest) SetAuthToken(v string) *QueryRmsPlugintestRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryRmsPlugintestRequest) SetBody(v string) *QueryRmsPlugintestRequest {
	s.Body = &v
	return s
}

func (s *QueryRmsPlugintestRequest) SetFileId(v int64) *QueryRmsPlugintestRequest {
	s.FileId = &v
	return s
}

func (s *QueryRmsPlugintestRequest) SetId(v int64) *QueryRmsPlugintestRequest {
	s.Id = &v
	return s
}

func (s *QueryRmsPlugintestRequest) SetOutsideBizdomain(v string) *QueryRmsPlugintestRequest {
	s.OutsideBizdomain = &v
	return s
}

func (s *QueryRmsPlugintestRequest) SetPluginId(v int64) *QueryRmsPlugintestRequest {
	s.PluginId = &v
	return s
}

func (s *QueryRmsPlugintestRequest) SetTable(v string) *QueryRmsPlugintestRequest {
	s.Table = &v
	return s
}

type QueryRmsPlugintestResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *Threshold `json:"data,omitempty" xml:"data,omitempty"`
	// error_code
	ErrorCode *string `json:"error_code,omitempty" xml:"error_code,omitempty"`
	// rid
	Rid *string `json:"rid,omitempty" xml:"rid,omitempty"`
	// success
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s QueryRmsPlugintestResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryRmsPlugintestResponse) GoString() string {
	return s.String()
}

func (s *QueryRmsPlugintestResponse) SetReqMsgId(v string) *QueryRmsPlugintestResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryRmsPlugintestResponse) SetResultCode(v string) *QueryRmsPlugintestResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryRmsPlugintestResponse) SetResultMsg(v string) *QueryRmsPlugintestResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryRmsPlugintestResponse) SetData(v *Threshold) *QueryRmsPlugintestResponse {
	s.Data = v
	return s
}

func (s *QueryRmsPlugintestResponse) SetErrorCode(v string) *QueryRmsPlugintestResponse {
	s.ErrorCode = &v
	return s
}

func (s *QueryRmsPlugintestResponse) SetRid(v string) *QueryRmsPlugintestResponse {
	s.Rid = &v
	return s
}

func (s *QueryRmsPlugintestResponse) SetSuccess(v bool) *QueryRmsPlugintestResponse {
	s.Success = &v
	return s
}

type QueryRmsPathRequest struct {
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// requests
	Requests []*FolderRequestCmd `json:"requests,omitempty" xml:"requests,omitempty" type:"Repeated"`
}

func (s QueryRmsPathRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryRmsPathRequest) GoString() string {
	return s.String()
}

func (s *QueryRmsPathRequest) SetAuthToken(v string) *QueryRmsPathRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryRmsPathRequest) SetRequests(v []*FolderRequestCmd) *QueryRmsPathRequest {
	s.Requests = v
	return s
}

type QueryRmsPathResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data []*FolderPaths `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
	// error_code
	ErrorCode *string `json:"error_code,omitempty" xml:"error_code,omitempty"`
	// rid
	Rid *string `json:"rid,omitempty" xml:"rid,omitempty"`
	// success
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s QueryRmsPathResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryRmsPathResponse) GoString() string {
	return s.String()
}

func (s *QueryRmsPathResponse) SetReqMsgId(v string) *QueryRmsPathResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryRmsPathResponse) SetResultCode(v string) *QueryRmsPathResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryRmsPathResponse) SetResultMsg(v string) *QueryRmsPathResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryRmsPathResponse) SetData(v []*FolderPaths) *QueryRmsPathResponse {
	s.Data = v
	return s
}

func (s *QueryRmsPathResponse) SetErrorCode(v string) *QueryRmsPathResponse {
	s.ErrorCode = &v
	return s
}

func (s *QueryRmsPathResponse) SetRid(v string) *QueryRmsPathResponse {
	s.Rid = &v
	return s
}

func (s *QueryRmsPathResponse) SetSuccess(v bool) *QueryRmsPathResponse {
	s.Success = &v
	return s
}

type ExecRmsUniversalcleankeyRequest struct {
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// req_params
	ReqParams []*KeySet `json:"req_params,omitempty" xml:"req_params,omitempty" type:"Repeated"`
	// tenant_id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
}

func (s ExecRmsUniversalcleankeyRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecRmsUniversalcleankeyRequest) GoString() string {
	return s.String()
}

func (s *ExecRmsUniversalcleankeyRequest) SetAuthToken(v string) *ExecRmsUniversalcleankeyRequest {
	s.AuthToken = &v
	return s
}

func (s *ExecRmsUniversalcleankeyRequest) SetReqParams(v []*KeySet) *ExecRmsUniversalcleankeyRequest {
	s.ReqParams = v
	return s
}

func (s *ExecRmsUniversalcleankeyRequest) SetTenantId(v string) *ExecRmsUniversalcleankeyRequest {
	s.TenantId = &v
	return s
}

type ExecRmsUniversalcleankeyResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// error_message
	ErrorMessage *CallErrorMessage `json:"error_message,omitempty" xml:"error_message,omitempty"`
	// part_suc
	PartSuc *bool `json:"part_suc,omitempty" xml:"part_suc,omitempty"`
	// result
	Result *string `json:"result,omitempty" xml:"result,omitempty"`
	// success
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s ExecRmsUniversalcleankeyResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecRmsUniversalcleankeyResponse) GoString() string {
	return s.String()
}

func (s *ExecRmsUniversalcleankeyResponse) SetReqMsgId(v string) *ExecRmsUniversalcleankeyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ExecRmsUniversalcleankeyResponse) SetResultCode(v string) *ExecRmsUniversalcleankeyResponse {
	s.ResultCode = &v
	return s
}

func (s *ExecRmsUniversalcleankeyResponse) SetResultMsg(v string) *ExecRmsUniversalcleankeyResponse {
	s.ResultMsg = &v
	return s
}

func (s *ExecRmsUniversalcleankeyResponse) SetErrorMessage(v *CallErrorMessage) *ExecRmsUniversalcleankeyResponse {
	s.ErrorMessage = v
	return s
}

func (s *ExecRmsUniversalcleankeyResponse) SetPartSuc(v bool) *ExecRmsUniversalcleankeyResponse {
	s.PartSuc = &v
	return s
}

func (s *ExecRmsUniversalcleankeyResponse) SetResult(v string) *ExecRmsUniversalcleankeyResponse {
	s.Result = &v
	return s
}

func (s *ExecRmsUniversalcleankeyResponse) SetSuccess(v bool) *ExecRmsUniversalcleankeyResponse {
	s.Success = &v
	return s
}

type QueryRmsUniversalRequest struct {
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// post_body
	PostBody *string `json:"post_body,omitempty" xml:"post_body,omitempty"`
	// tenant_id
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
}

func (s QueryRmsUniversalRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryRmsUniversalRequest) GoString() string {
	return s.String()
}

func (s *QueryRmsUniversalRequest) SetAuthToken(v string) *QueryRmsUniversalRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryRmsUniversalRequest) SetPostBody(v string) *QueryRmsUniversalRequest {
	s.PostBody = &v
	return s
}

func (s *QueryRmsUniversalRequest) SetTenantId(v string) *QueryRmsUniversalRequest {
	s.TenantId = &v
	return s
}

type QueryRmsUniversalResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// result
	Result *string `json:"result,omitempty" xml:"result,omitempty"`
}

func (s QueryRmsUniversalResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryRmsUniversalResponse) GoString() string {
	return s.String()
}

func (s *QueryRmsUniversalResponse) SetReqMsgId(v string) *QueryRmsUniversalResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryRmsUniversalResponse) SetResultCode(v string) *QueryRmsUniversalResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryRmsUniversalResponse) SetResultMsg(v string) *QueryRmsUniversalResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryRmsUniversalResponse) SetResult(v string) *QueryRmsUniversalResponse {
	s.Result = &v
	return s
}

type QueryRmsTracespanRequest struct {
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 如果指定了app, 那么是 localServiceName or remoteServiceName 的效果, 任何一个命中了都行
	App *string `json:"app,omitempty" xml:"app,omitempty"`
	// 最大的毫秒开始时间戳
	EndTime *int64 `json:"end_time,omitempty" xml:"end_time,omitempty"`
	// 万能扩展字段
	Extensions []*KeySet `json:"extensions,omitempty" xml:"extensions,omitempty" type:"Repeated"`
	// 最大毫秒耗时
	MaxDuration *int64 `json:"max_duration,omitempty" xml:"max_duration,omitempty"`
	// 最小毫秒耗时
	MinDuration *int64 `json:"min_duration,omitempty" xml:"min_duration,omitempty"`
	// 分页号
	PageNumber *int64 `json:"page_number,omitempty" xml:"page_number,omitempty"`
	// 分页大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// 搜索的毫秒开始时间戳
	StartTime *int64 `json:"start_time,omitempty" xml:"start_time,omitempty"`
	// 结果码
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 用来动态传递一些tags或条件匹配, 有一些key是保留的, 服务端会进行特殊解释, 其他的则会认为是要对tags做精确匹配.
	Tags []*KeySet `json:"tags,omitempty" xml:"tags,omitempty" type:"Repeated"`
	// 按traceId搜索时会用到 此时其他条件自动失效
	TraceId *string `json:"trace_id,omitempty" xml:"trace_id,omitempty"`
	// workspace_id
	WorkspaceId *int64 `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
}

func (s QueryRmsTracespanRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryRmsTracespanRequest) GoString() string {
	return s.String()
}

func (s *QueryRmsTracespanRequest) SetAuthToken(v string) *QueryRmsTracespanRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryRmsTracespanRequest) SetApp(v string) *QueryRmsTracespanRequest {
	s.App = &v
	return s
}

func (s *QueryRmsTracespanRequest) SetEndTime(v int64) *QueryRmsTracespanRequest {
	s.EndTime = &v
	return s
}

func (s *QueryRmsTracespanRequest) SetExtensions(v []*KeySet) *QueryRmsTracespanRequest {
	s.Extensions = v
	return s
}

func (s *QueryRmsTracespanRequest) SetMaxDuration(v int64) *QueryRmsTracespanRequest {
	s.MaxDuration = &v
	return s
}

func (s *QueryRmsTracespanRequest) SetMinDuration(v int64) *QueryRmsTracespanRequest {
	s.MinDuration = &v
	return s
}

func (s *QueryRmsTracespanRequest) SetPageNumber(v int64) *QueryRmsTracespanRequest {
	s.PageNumber = &v
	return s
}

func (s *QueryRmsTracespanRequest) SetPageSize(v int64) *QueryRmsTracespanRequest {
	s.PageSize = &v
	return s
}

func (s *QueryRmsTracespanRequest) SetStartTime(v int64) *QueryRmsTracespanRequest {
	s.StartTime = &v
	return s
}

func (s *QueryRmsTracespanRequest) SetStatus(v string) *QueryRmsTracespanRequest {
	s.Status = &v
	return s
}

func (s *QueryRmsTracespanRequest) SetTags(v []*KeySet) *QueryRmsTracespanRequest {
	s.Tags = v
	return s
}

func (s *QueryRmsTracespanRequest) SetTraceId(v string) *QueryRmsTracespanRequest {
	s.TraceId = &v
	return s
}

func (s *QueryRmsTracespanRequest) SetWorkspaceId(v int64) *QueryRmsTracespanRequest {
	s.WorkspaceId = &v
	return s
}

type QueryRmsTracespanResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 分页号
	PageNumber *int64 `json:"page_number,omitempty" xml:"page_number,omitempty"`
	// 分页大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// 搜索出的spans, 查无结果时为空数组
	Spans []*TraceSpan `json:"spans,omitempty" xml:"spans,omitempty" type:"Repeated"`
	// 总页数
	TotalPage *int64 `json:"total_page,omitempty" xml:"total_page,omitempty"`
}

func (s QueryRmsTracespanResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryRmsTracespanResponse) GoString() string {
	return s.String()
}

func (s *QueryRmsTracespanResponse) SetReqMsgId(v string) *QueryRmsTracespanResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryRmsTracespanResponse) SetResultCode(v string) *QueryRmsTracespanResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryRmsTracespanResponse) SetResultMsg(v string) *QueryRmsTracespanResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryRmsTracespanResponse) SetPageNumber(v int64) *QueryRmsTracespanResponse {
	s.PageNumber = &v
	return s
}

func (s *QueryRmsTracespanResponse) SetPageSize(v int64) *QueryRmsTracespanResponse {
	s.PageSize = &v
	return s
}

func (s *QueryRmsTracespanResponse) SetSpans(v []*TraceSpan) *QueryRmsTracespanResponse {
	s.Spans = v
	return s
}

func (s *QueryRmsTracespanResponse) SetTotalPage(v int64) *QueryRmsTracespanResponse {
	s.TotalPage = &v
	return s
}

type GetRmsTracespanqueryconfigRequest struct {
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
}

func (s GetRmsTracespanqueryconfigRequest) String() string {
	return tea.Prettify(s)
}

func (s GetRmsTracespanqueryconfigRequest) GoString() string {
	return s.String()
}

func (s *GetRmsTracespanqueryconfigRequest) SetAuthToken(v string) *GetRmsTracespanqueryconfigRequest {
	s.AuthToken = &v
	return s
}

type GetRmsTracespanqueryconfigResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 支持的tags列表
	TagConfigs []*TraceSpanSearchTagConfig `json:"tag_configs,omitempty" xml:"tag_configs,omitempty" type:"Repeated"`
}

func (s GetRmsTracespanqueryconfigResponse) String() string {
	return tea.Prettify(s)
}

func (s GetRmsTracespanqueryconfigResponse) GoString() string {
	return s.String()
}

func (s *GetRmsTracespanqueryconfigResponse) SetReqMsgId(v string) *GetRmsTracespanqueryconfigResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetRmsTracespanqueryconfigResponse) SetResultCode(v string) *GetRmsTracespanqueryconfigResponse {
	s.ResultCode = &v
	return s
}

func (s *GetRmsTracespanqueryconfigResponse) SetResultMsg(v string) *GetRmsTracespanqueryconfigResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetRmsTracespanqueryconfigResponse) SetTagConfigs(v []*TraceSpanSearchTagConfig) *GetRmsTracespanqueryconfigResponse {
	s.TagConfigs = v
	return s
}

type DescribeRmsTracetreeRequest struct {
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// trace_id
	TraceId *string `json:"trace_id,omitempty" xml:"trace_id,omitempty"`
}

func (s DescribeRmsTracetreeRequest) String() string {
	return tea.Prettify(s)
}

func (s DescribeRmsTracetreeRequest) GoString() string {
	return s.String()
}

func (s *DescribeRmsTracetreeRequest) SetAuthToken(v string) *DescribeRmsTracetreeRequest {
	s.AuthToken = &v
	return s
}

func (s *DescribeRmsTracetreeRequest) SetTraceId(v string) *DescribeRmsTracetreeRequest {
	s.TraceId = &v
	return s
}

type DescribeRmsTracetreeResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 树状图结构体
	// 找不到数据时 trace_tree_items 为空数组, 并不会报错
	TraceTreeItems []*TraceTreeItem `json:"trace_tree_items,omitempty" xml:"trace_tree_items,omitempty" type:"Repeated"`
}

func (s DescribeRmsTracetreeResponse) String() string {
	return tea.Prettify(s)
}

func (s DescribeRmsTracetreeResponse) GoString() string {
	return s.String()
}

func (s *DescribeRmsTracetreeResponse) SetReqMsgId(v string) *DescribeRmsTracetreeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DescribeRmsTracetreeResponse) SetResultCode(v string) *DescribeRmsTracetreeResponse {
	s.ResultCode = &v
	return s
}

func (s *DescribeRmsTracetreeResponse) SetResultMsg(v string) *DescribeRmsTracetreeResponse {
	s.ResultMsg = &v
	return s
}

func (s *DescribeRmsTracetreeResponse) SetTraceTreeItems(v []*TraceTreeItem) *DescribeRmsTracetreeResponse {
	s.TraceTreeItems = v
	return s
}

type CallbackSpiCompletecommodityRequest struct {
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 南天门的请求体都是做成json字符串放在data字段里
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s CallbackSpiCompletecommodityRequest) String() string {
	return tea.Prettify(s)
}

func (s CallbackSpiCompletecommodityRequest) GoString() string {
	return s.String()
}

func (s *CallbackSpiCompletecommodityRequest) SetAuthToken(v string) *CallbackSpiCompletecommodityRequest {
	s.AuthToken = &v
	return s
}

func (s *CallbackSpiCompletecommodityRequest) SetData(v string) *CallbackSpiCompletecommodityRequest {
	s.Data = &v
	return s
}

type CallbackSpiCompletecommodityResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// code
	Code *string `json:"code,omitempty" xml:"code,omitempty"`
	// data
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
	// message
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// synchro
	Synchro *string `json:"synchro,omitempty" xml:"synchro,omitempty"`
	// success
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s CallbackSpiCompletecommodityResponse) String() string {
	return tea.Prettify(s)
}

func (s CallbackSpiCompletecommodityResponse) GoString() string {
	return s.String()
}

func (s *CallbackSpiCompletecommodityResponse) SetReqMsgId(v string) *CallbackSpiCompletecommodityResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CallbackSpiCompletecommodityResponse) SetResultCode(v string) *CallbackSpiCompletecommodityResponse {
	s.ResultCode = &v
	return s
}

func (s *CallbackSpiCompletecommodityResponse) SetResultMsg(v string) *CallbackSpiCompletecommodityResponse {
	s.ResultMsg = &v
	return s
}

func (s *CallbackSpiCompletecommodityResponse) SetCode(v string) *CallbackSpiCompletecommodityResponse {
	s.Code = &v
	return s
}

func (s *CallbackSpiCompletecommodityResponse) SetData(v string) *CallbackSpiCompletecommodityResponse {
	s.Data = &v
	return s
}

func (s *CallbackSpiCompletecommodityResponse) SetMessage(v string) *CallbackSpiCompletecommodityResponse {
	s.Message = &v
	return s
}

func (s *CallbackSpiCompletecommodityResponse) SetSynchro(v string) *CallbackSpiCompletecommodityResponse {
	s.Synchro = &v
	return s
}

func (s *CallbackSpiCompletecommodityResponse) SetSuccess(v bool) *CallbackSpiCompletecommodityResponse {
	s.Success = &v
	return s
}

type CallbackSpiPayordercallbackRequest struct {
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 南天门支付后回调请求, 见 http://help.aliyun-inc.com/internaldoc/detail/134798.html?spm=ntm.workbench-devPlatform-extendPoint.0.0.42a919afQhBhEB.
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s CallbackSpiPayordercallbackRequest) String() string {
	return tea.Prettify(s)
}

func (s CallbackSpiPayordercallbackRequest) GoString() string {
	return s.String()
}

func (s *CallbackSpiPayordercallbackRequest) SetAuthToken(v string) *CallbackSpiPayordercallbackRequest {
	s.AuthToken = &v
	return s
}

func (s *CallbackSpiPayordercallbackRequest) SetData(v string) *CallbackSpiPayordercallbackRequest {
	s.Data = &v
	return s
}

type CallbackSpiPayordercallbackResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// code
	Code *string `json:"code,omitempty" xml:"code,omitempty"`
	// data
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
	// message
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// synchro
	Synchro *string `json:"synchro,omitempty" xml:"synchro,omitempty"`
	// success
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s CallbackSpiPayordercallbackResponse) String() string {
	return tea.Prettify(s)
}

func (s CallbackSpiPayordercallbackResponse) GoString() string {
	return s.String()
}

func (s *CallbackSpiPayordercallbackResponse) SetReqMsgId(v string) *CallbackSpiPayordercallbackResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CallbackSpiPayordercallbackResponse) SetResultCode(v string) *CallbackSpiPayordercallbackResponse {
	s.ResultCode = &v
	return s
}

func (s *CallbackSpiPayordercallbackResponse) SetResultMsg(v string) *CallbackSpiPayordercallbackResponse {
	s.ResultMsg = &v
	return s
}

func (s *CallbackSpiPayordercallbackResponse) SetCode(v string) *CallbackSpiPayordercallbackResponse {
	s.Code = &v
	return s
}

func (s *CallbackSpiPayordercallbackResponse) SetData(v string) *CallbackSpiPayordercallbackResponse {
	s.Data = &v
	return s
}

func (s *CallbackSpiPayordercallbackResponse) SetMessage(v string) *CallbackSpiPayordercallbackResponse {
	s.Message = &v
	return s
}

func (s *CallbackSpiPayordercallbackResponse) SetSynchro(v string) *CallbackSpiPayordercallbackResponse {
	s.Synchro = &v
	return s
}

func (s *CallbackSpiPayordercallbackResponse) SetSuccess(v bool) *CallbackSpiPayordercallbackResponse {
	s.Success = &v
	return s
}

type CallbackSpiCompleteorderparamRequest struct {
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// data
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s CallbackSpiCompleteorderparamRequest) String() string {
	return tea.Prettify(s)
}

func (s CallbackSpiCompleteorderparamRequest) GoString() string {
	return s.String()
}

func (s *CallbackSpiCompleteorderparamRequest) SetAuthToken(v string) *CallbackSpiCompleteorderparamRequest {
	s.AuthToken = &v
	return s
}

func (s *CallbackSpiCompleteorderparamRequest) SetData(v string) *CallbackSpiCompleteorderparamRequest {
	s.Data = &v
	return s
}

type CallbackSpiCompleteorderparamResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// code
	Code *string `json:"code,omitempty" xml:"code,omitempty"`
	// data
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
	// message
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// synchro
	Synchro *string `json:"synchro,omitempty" xml:"synchro,omitempty"`
	// success
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s CallbackSpiCompleteorderparamResponse) String() string {
	return tea.Prettify(s)
}

func (s CallbackSpiCompleteorderparamResponse) GoString() string {
	return s.String()
}

func (s *CallbackSpiCompleteorderparamResponse) SetReqMsgId(v string) *CallbackSpiCompleteorderparamResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CallbackSpiCompleteorderparamResponse) SetResultCode(v string) *CallbackSpiCompleteorderparamResponse {
	s.ResultCode = &v
	return s
}

func (s *CallbackSpiCompleteorderparamResponse) SetResultMsg(v string) *CallbackSpiCompleteorderparamResponse {
	s.ResultMsg = &v
	return s
}

func (s *CallbackSpiCompleteorderparamResponse) SetCode(v string) *CallbackSpiCompleteorderparamResponse {
	s.Code = &v
	return s
}

func (s *CallbackSpiCompleteorderparamResponse) SetData(v string) *CallbackSpiCompleteorderparamResponse {
	s.Data = &v
	return s
}

func (s *CallbackSpiCompleteorderparamResponse) SetMessage(v string) *CallbackSpiCompleteorderparamResponse {
	s.Message = &v
	return s
}

func (s *CallbackSpiCompleteorderparamResponse) SetSynchro(v string) *CallbackSpiCompleteorderparamResponse {
	s.Synchro = &v
	return s
}

func (s *CallbackSpiCompleteorderparamResponse) SetSuccess(v bool) *CallbackSpiCompleteorderparamResponse {
	s.Success = &v
	return s
}

type CallbackSpiVerifyRequest struct {
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// data
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s CallbackSpiVerifyRequest) String() string {
	return tea.Prettify(s)
}

func (s CallbackSpiVerifyRequest) GoString() string {
	return s.String()
}

func (s *CallbackSpiVerifyRequest) SetAuthToken(v string) *CallbackSpiVerifyRequest {
	s.AuthToken = &v
	return s
}

func (s *CallbackSpiVerifyRequest) SetData(v string) *CallbackSpiVerifyRequest {
	s.Data = &v
	return s
}

type CallbackSpiVerifyResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// code
	Code *string `json:"code,omitempty" xml:"code,omitempty"`
	// data
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
	// message
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// synchro
	Synchro *string `json:"synchro,omitempty" xml:"synchro,omitempty"`
	// success
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s CallbackSpiVerifyResponse) String() string {
	return tea.Prettify(s)
}

func (s CallbackSpiVerifyResponse) GoString() string {
	return s.String()
}

func (s *CallbackSpiVerifyResponse) SetReqMsgId(v string) *CallbackSpiVerifyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CallbackSpiVerifyResponse) SetResultCode(v string) *CallbackSpiVerifyResponse {
	s.ResultCode = &v
	return s
}

func (s *CallbackSpiVerifyResponse) SetResultMsg(v string) *CallbackSpiVerifyResponse {
	s.ResultMsg = &v
	return s
}

func (s *CallbackSpiVerifyResponse) SetCode(v string) *CallbackSpiVerifyResponse {
	s.Code = &v
	return s
}

func (s *CallbackSpiVerifyResponse) SetData(v string) *CallbackSpiVerifyResponse {
	s.Data = &v
	return s
}

func (s *CallbackSpiVerifyResponse) SetMessage(v string) *CallbackSpiVerifyResponse {
	s.Message = &v
	return s
}

func (s *CallbackSpiVerifyResponse) SetSynchro(v string) *CallbackSpiVerifyResponse {
	s.Synchro = &v
	return s
}

func (s *CallbackSpiVerifyResponse) SetSuccess(v bool) *CallbackSpiVerifyResponse {
	s.Success = &v
	return s
}

type CallbackSpiRefundRequest struct {
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// data
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s CallbackSpiRefundRequest) String() string {
	return tea.Prettify(s)
}

func (s CallbackSpiRefundRequest) GoString() string {
	return s.String()
}

func (s *CallbackSpiRefundRequest) SetAuthToken(v string) *CallbackSpiRefundRequest {
	s.AuthToken = &v
	return s
}

func (s *CallbackSpiRefundRequest) SetData(v string) *CallbackSpiRefundRequest {
	s.Data = &v
	return s
}

type CallbackSpiRefundResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// code
	Code *string `json:"code,omitempty" xml:"code,omitempty"`
	// data
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
	// message
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// synchro
	Synchro *string `json:"synchro,omitempty" xml:"synchro,omitempty"`
	// success
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s CallbackSpiRefundResponse) String() string {
	return tea.Prettify(s)
}

func (s CallbackSpiRefundResponse) GoString() string {
	return s.String()
}

func (s *CallbackSpiRefundResponse) SetReqMsgId(v string) *CallbackSpiRefundResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CallbackSpiRefundResponse) SetResultCode(v string) *CallbackSpiRefundResponse {
	s.ResultCode = &v
	return s
}

func (s *CallbackSpiRefundResponse) SetResultMsg(v string) *CallbackSpiRefundResponse {
	s.ResultMsg = &v
	return s
}

func (s *CallbackSpiRefundResponse) SetCode(v string) *CallbackSpiRefundResponse {
	s.Code = &v
	return s
}

func (s *CallbackSpiRefundResponse) SetData(v string) *CallbackSpiRefundResponse {
	s.Data = &v
	return s
}

func (s *CallbackSpiRefundResponse) SetMessage(v string) *CallbackSpiRefundResponse {
	s.Message = &v
	return s
}

func (s *CallbackSpiRefundResponse) SetSynchro(v string) *CallbackSpiRefundResponse {
	s.Synchro = &v
	return s
}

func (s *CallbackSpiRefundResponse) SetSuccess(v bool) *CallbackSpiRefundResponse {
	s.Success = &v
	return s
}

type CallbackSpiLifecycleRequest struct {
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// data
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s CallbackSpiLifecycleRequest) String() string {
	return tea.Prettify(s)
}

func (s CallbackSpiLifecycleRequest) GoString() string {
	return s.String()
}

func (s *CallbackSpiLifecycleRequest) SetAuthToken(v string) *CallbackSpiLifecycleRequest {
	s.AuthToken = &v
	return s
}

func (s *CallbackSpiLifecycleRequest) SetData(v string) *CallbackSpiLifecycleRequest {
	s.Data = &v
	return s
}

type CallbackSpiLifecycleResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// code
	Code *string `json:"code,omitempty" xml:"code,omitempty"`
	// data
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
	// message
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// a synchro
	Synchro *string `json:"synchro,omitempty" xml:"synchro,omitempty"`
	// success
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s CallbackSpiLifecycleResponse) String() string {
	return tea.Prettify(s)
}

func (s CallbackSpiLifecycleResponse) GoString() string {
	return s.String()
}

func (s *CallbackSpiLifecycleResponse) SetReqMsgId(v string) *CallbackSpiLifecycleResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CallbackSpiLifecycleResponse) SetResultCode(v string) *CallbackSpiLifecycleResponse {
	s.ResultCode = &v
	return s
}

func (s *CallbackSpiLifecycleResponse) SetResultMsg(v string) *CallbackSpiLifecycleResponse {
	s.ResultMsg = &v
	return s
}

func (s *CallbackSpiLifecycleResponse) SetCode(v string) *CallbackSpiLifecycleResponse {
	s.Code = &v
	return s
}

func (s *CallbackSpiLifecycleResponse) SetData(v string) *CallbackSpiLifecycleResponse {
	s.Data = &v
	return s
}

func (s *CallbackSpiLifecycleResponse) SetMessage(v string) *CallbackSpiLifecycleResponse {
	s.Message = &v
	return s
}

func (s *CallbackSpiLifecycleResponse) SetSynchro(v string) *CallbackSpiLifecycleResponse {
	s.Synchro = &v
	return s
}

func (s *CallbackSpiLifecycleResponse) SetSuccess(v bool) *CallbackSpiLifecycleResponse {
	s.Success = &v
	return s
}

type DescribeRmsTimeseriesmetricsRequest struct {
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// sum或none
	Aggregator *string `json:"aggregator,omitempty" xml:"aggregator,omitempty"`
	// 结束毫秒时间戳
	EndTime *int64 `json:"end_time,omitempty" xml:"end_time,omitempty"`
	// metrics字段名称
	Metrics []*StringValue `json:"metrics,omitempty" xml:"metrics,omitempty" type:"Repeated"`
	// 开始毫秒时间戳
	StartTime *int64 `json:"start_time,omitempty" xml:"start_time,omitempty"`
	// 扩展字段tags
	Tags []*KeyValuePair `json:"tags,omitempty" xml:"tags,omitempty" type:"Repeated"`
	// metrics类型
	Type *string `json:"type,omitempty" xml:"type,omitempty"`
	// workspace_id或workspace_name选填一个
	WorkspaceId *int64 `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
	// workspace_id或workspace_name选填一个
	WorkspaceName *string `json:"workspace_name,omitempty" xml:"workspace_name,omitempty"`
}

func (s DescribeRmsTimeseriesmetricsRequest) String() string {
	return tea.Prettify(s)
}

func (s DescribeRmsTimeseriesmetricsRequest) GoString() string {
	return s.String()
}

func (s *DescribeRmsTimeseriesmetricsRequest) SetAuthToken(v string) *DescribeRmsTimeseriesmetricsRequest {
	s.AuthToken = &v
	return s
}

func (s *DescribeRmsTimeseriesmetricsRequest) SetAggregator(v string) *DescribeRmsTimeseriesmetricsRequest {
	s.Aggregator = &v
	return s
}

func (s *DescribeRmsTimeseriesmetricsRequest) SetEndTime(v int64) *DescribeRmsTimeseriesmetricsRequest {
	s.EndTime = &v
	return s
}

func (s *DescribeRmsTimeseriesmetricsRequest) SetMetrics(v []*StringValue) *DescribeRmsTimeseriesmetricsRequest {
	s.Metrics = v
	return s
}

func (s *DescribeRmsTimeseriesmetricsRequest) SetStartTime(v int64) *DescribeRmsTimeseriesmetricsRequest {
	s.StartTime = &v
	return s
}

func (s *DescribeRmsTimeseriesmetricsRequest) SetTags(v []*KeyValuePair) *DescribeRmsTimeseriesmetricsRequest {
	s.Tags = v
	return s
}

func (s *DescribeRmsTimeseriesmetricsRequest) SetType(v string) *DescribeRmsTimeseriesmetricsRequest {
	s.Type = &v
	return s
}

func (s *DescribeRmsTimeseriesmetricsRequest) SetWorkspaceId(v int64) *DescribeRmsTimeseriesmetricsRequest {
	s.WorkspaceId = &v
	return s
}

func (s *DescribeRmsTimeseriesmetricsRequest) SetWorkspaceName(v string) *DescribeRmsTimeseriesmetricsRequest {
	s.WorkspaceName = &v
	return s
}

type DescribeRmsTimeseriesmetricsResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// metrics reulsts
	Results []*TimeSeriesMetrics `json:"results,omitempty" xml:"results,omitempty" type:"Repeated"`
}

func (s DescribeRmsTimeseriesmetricsResponse) String() string {
	return tea.Prettify(s)
}

func (s DescribeRmsTimeseriesmetricsResponse) GoString() string {
	return s.String()
}

func (s *DescribeRmsTimeseriesmetricsResponse) SetReqMsgId(v string) *DescribeRmsTimeseriesmetricsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DescribeRmsTimeseriesmetricsResponse) SetResultCode(v string) *DescribeRmsTimeseriesmetricsResponse {
	s.ResultCode = &v
	return s
}

func (s *DescribeRmsTimeseriesmetricsResponse) SetResultMsg(v string) *DescribeRmsTimeseriesmetricsResponse {
	s.ResultMsg = &v
	return s
}

func (s *DescribeRmsTimeseriesmetricsResponse) SetResults(v []*TimeSeriesMetrics) *DescribeRmsTimeseriesmetricsResponse {
	s.Results = v
	return s
}

type DescribeRmsTopologyRequest struct {
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 结束毫秒时间戳
	EndTime *int64 `json:"end_time,omitempty" xml:"end_time,omitempty"`
	// 开始毫秒时间戳
	StartTime *int64 `json:"start_time,omitempty" xml:"start_time,omitempty"`
	// workspace_id或workspace_name二选一
	WorkspaceId *int64 `json:"workspace_id,omitempty" xml:"workspace_id,omitempty"`
	// workspace_id或workspace_name二选一
	WorkspaceName *string `json:"workspace_name,omitempty" xml:"workspace_name,omitempty"`
}

func (s DescribeRmsTopologyRequest) String() string {
	return tea.Prettify(s)
}

func (s DescribeRmsTopologyRequest) GoString() string {
	return s.String()
}

func (s *DescribeRmsTopologyRequest) SetAuthToken(v string) *DescribeRmsTopologyRequest {
	s.AuthToken = &v
	return s
}

func (s *DescribeRmsTopologyRequest) SetEndTime(v int64) *DescribeRmsTopologyRequest {
	s.EndTime = &v
	return s
}

func (s *DescribeRmsTopologyRequest) SetStartTime(v int64) *DescribeRmsTopologyRequest {
	s.StartTime = &v
	return s
}

func (s *DescribeRmsTopologyRequest) SetWorkspaceId(v int64) *DescribeRmsTopologyRequest {
	s.WorkspaceId = &v
	return s
}

func (s *DescribeRmsTopologyRequest) SetWorkspaceName(v string) *DescribeRmsTopologyRequest {
	s.WorkspaceName = &v
	return s
}

type DescribeRmsTopologyResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 拓扑节点
	Nodes []*TopologyNode `json:"nodes,omitempty" xml:"nodes,omitempty" type:"Repeated"`
	// 拓扑边
	Edges []*TopologyEdge `json:"edges,omitempty" xml:"edges,omitempty" type:"Repeated"`
	// 节点性能指标
	NodeMetrics []*TimeSeriesMetrics `json:"node_metrics,omitempty" xml:"node_metrics,omitempty" type:"Repeated"`
	// 边性能指标
	EdgeMetrics []*TimeSeriesMetrics `json:"edge_metrics,omitempty" xml:"edge_metrics,omitempty" type:"Repeated"`
}

func (s DescribeRmsTopologyResponse) String() string {
	return tea.Prettify(s)
}

func (s DescribeRmsTopologyResponse) GoString() string {
	return s.String()
}

func (s *DescribeRmsTopologyResponse) SetReqMsgId(v string) *DescribeRmsTopologyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DescribeRmsTopologyResponse) SetResultCode(v string) *DescribeRmsTopologyResponse {
	s.ResultCode = &v
	return s
}

func (s *DescribeRmsTopologyResponse) SetResultMsg(v string) *DescribeRmsTopologyResponse {
	s.ResultMsg = &v
	return s
}

func (s *DescribeRmsTopologyResponse) SetNodes(v []*TopologyNode) *DescribeRmsTopologyResponse {
	s.Nodes = v
	return s
}

func (s *DescribeRmsTopologyResponse) SetEdges(v []*TopologyEdge) *DescribeRmsTopologyResponse {
	s.Edges = v
	return s
}

func (s *DescribeRmsTopologyResponse) SetNodeMetrics(v []*TimeSeriesMetrics) *DescribeRmsTopologyResponse {
	s.NodeMetrics = v
	return s
}

func (s *DescribeRmsTopologyResponse) SetEdgeMetrics(v []*TimeSeriesMetrics) *DescribeRmsTopologyResponse {
	s.EdgeMetrics = v
	return s
}

type QueryMetricsRequest struct {
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 开始时间
	Start *int64 `json:"start,omitempty" xml:"start,omitempty"`
	// 结束时间
	End *int64 `json:"end,omitempty" xml:"end,omitempty"`
	// 插件类型
	Plugin *string `json:"plugin,omitempty" xml:"plugin,omitempty"`
	// 监控指标 ID
	DsId *int64 `json:"ds_id,omitempty" xml:"ds_id,omitempty"`
	// contentType
	ContentType *string `json:"content_type,omitempty" xml:"content_type,omitempty"`
	// 工作空间
	WorkspaceName *string `json:"workspace_name,omitempty" xml:"workspace_name,omitempty"`
}

func (s QueryMetricsRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryMetricsRequest) GoString() string {
	return s.String()
}

func (s *QueryMetricsRequest) SetAuthToken(v string) *QueryMetricsRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryMetricsRequest) SetStart(v int64) *QueryMetricsRequest {
	s.Start = &v
	return s
}

func (s *QueryMetricsRequest) SetEnd(v int64) *QueryMetricsRequest {
	s.End = &v
	return s
}

func (s *QueryMetricsRequest) SetPlugin(v string) *QueryMetricsRequest {
	s.Plugin = &v
	return s
}

func (s *QueryMetricsRequest) SetDsId(v int64) *QueryMetricsRequest {
	s.DsId = &v
	return s
}

func (s *QueryMetricsRequest) SetContentType(v string) *QueryMetricsRequest {
	s.ContentType = &v
	return s
}

func (s *QueryMetricsRequest) SetWorkspaceName(v string) *QueryMetricsRequest {
	s.WorkspaceName = &v
	return s
}

type QueryMetricsResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 查询数据结果
	Result *string `json:"result,omitempty" xml:"result,omitempty"`
}

func (s QueryMetricsResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryMetricsResponse) GoString() string {
	return s.String()
}

func (s *QueryMetricsResponse) SetReqMsgId(v string) *QueryMetricsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryMetricsResponse) SetResultCode(v string) *QueryMetricsResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryMetricsResponse) SetResultMsg(v string) *QueryMetricsResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryMetricsResponse) SetResult(v string) *QueryMetricsResponse {
	s.Result = &v
	return s
}

type QueryTraceSpanRequest struct {
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 按traceId搜索时会用到 此时其他条件自动失效
	TraceId *string `json:"trace_id,omitempty" xml:"trace_id,omitempty"`
	// 如果指定了app, 那么是 localServiceName or remoteServiceName 的效果, 任何一个命中了都行
	App *string `json:"app,omitempty" xml:"app,omitempty"`
	// 搜索的毫秒开始时间戳
	StartTime *int64 `json:"start_time,omitempty" xml:"start_time,omitempty"`
	// 最大的毫秒开始时间戳
	EndTime *int64 `json:"end_time,omitempty" xml:"end_time,omitempty"`
	// 最小毫秒耗时
	MinDuration *int64 `json:"min_duration,omitempty" xml:"min_duration,omitempty"`
	// 最大毫秒耗时
	MaxDuration *int64 `json:"max_duration,omitempty" xml:"max_duration,omitempty"`
	// 分页号
	CurrentPage *int64 `json:"current_page,omitempty" xml:"current_page,omitempty"`
	// 每页记录条数
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// 用来动态传递一些tags或条件匹配, 有一些key是保留的, 服务端会进行特殊解释, 其他的则会认为是要对tags做精确匹配.
	Tags []*KeySet `json:"tags,omitempty" xml:"tags,omitempty" type:"Repeated"`
	// 工作空间
	WorkspaceName *string `json:"workspace_name,omitempty" xml:"workspace_name,omitempty"`
}

func (s QueryTraceSpanRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryTraceSpanRequest) GoString() string {
	return s.String()
}

func (s *QueryTraceSpanRequest) SetAuthToken(v string) *QueryTraceSpanRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryTraceSpanRequest) SetTraceId(v string) *QueryTraceSpanRequest {
	s.TraceId = &v
	return s
}

func (s *QueryTraceSpanRequest) SetApp(v string) *QueryTraceSpanRequest {
	s.App = &v
	return s
}

func (s *QueryTraceSpanRequest) SetStartTime(v int64) *QueryTraceSpanRequest {
	s.StartTime = &v
	return s
}

func (s *QueryTraceSpanRequest) SetEndTime(v int64) *QueryTraceSpanRequest {
	s.EndTime = &v
	return s
}

func (s *QueryTraceSpanRequest) SetMinDuration(v int64) *QueryTraceSpanRequest {
	s.MinDuration = &v
	return s
}

func (s *QueryTraceSpanRequest) SetMaxDuration(v int64) *QueryTraceSpanRequest {
	s.MaxDuration = &v
	return s
}

func (s *QueryTraceSpanRequest) SetCurrentPage(v int64) *QueryTraceSpanRequest {
	s.CurrentPage = &v
	return s
}

func (s *QueryTraceSpanRequest) SetPageSize(v int64) *QueryTraceSpanRequest {
	s.PageSize = &v
	return s
}

func (s *QueryTraceSpanRequest) SetTags(v []*KeySet) *QueryTraceSpanRequest {
	s.Tags = v
	return s
}

func (s *QueryTraceSpanRequest) SetWorkspaceName(v string) *QueryTraceSpanRequest {
	s.WorkspaceName = &v
	return s
}

type QueryTraceSpanResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 分页号
	PageNumber *int64 `json:"page_number,omitempty" xml:"page_number,omitempty"`
	// 分页大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// 总页数
	TotalPage *int64 `json:"total_page,omitempty" xml:"total_page,omitempty"`
	// 查询总数
	TotalNumber *int64 `json:"total_number,omitempty" xml:"total_number,omitempty"`
	// 搜索出的spans, 查无结果时为空数组
	Spans []*TraceSpan `json:"spans,omitempty" xml:"spans,omitempty" type:"Repeated"`
}

func (s QueryTraceSpanResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryTraceSpanResponse) GoString() string {
	return s.String()
}

func (s *QueryTraceSpanResponse) SetReqMsgId(v string) *QueryTraceSpanResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryTraceSpanResponse) SetResultCode(v string) *QueryTraceSpanResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryTraceSpanResponse) SetResultMsg(v string) *QueryTraceSpanResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryTraceSpanResponse) SetPageNumber(v int64) *QueryTraceSpanResponse {
	s.PageNumber = &v
	return s
}

func (s *QueryTraceSpanResponse) SetPageSize(v int64) *QueryTraceSpanResponse {
	s.PageSize = &v
	return s
}

func (s *QueryTraceSpanResponse) SetTotalPage(v int64) *QueryTraceSpanResponse {
	s.TotalPage = &v
	return s
}

func (s *QueryTraceSpanResponse) SetTotalNumber(v int64) *QueryTraceSpanResponse {
	s.TotalNumber = &v
	return s
}

func (s *QueryTraceSpanResponse) SetSpans(v []*TraceSpan) *QueryTraceSpanResponse {
	s.Spans = v
	return s
}

type ListAppRequest struct {
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 实际SQL查询时LIMIT的第一个字段
	CurrentPage *int64 `json:"current_page,omitempty" xml:"current_page,omitempty"`
	// 页面大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty"`
	// 工作空间
	WorkspaceName *string `json:"workspace_name,omitempty" xml:"workspace_name,omitempty"`
}

func (s ListAppRequest) String() string {
	return tea.Prettify(s)
}

func (s ListAppRequest) GoString() string {
	return s.String()
}

func (s *ListAppRequest) SetAuthToken(v string) *ListAppRequest {
	s.AuthToken = &v
	return s
}

func (s *ListAppRequest) SetCurrentPage(v int64) *ListAppRequest {
	s.CurrentPage = &v
	return s
}

func (s *ListAppRequest) SetPageSize(v int64) *ListAppRequest {
	s.PageSize = &v
	return s
}

func (s *ListAppRequest) SetWorkspaceName(v string) *ListAppRequest {
	s.WorkspaceName = &v
	return s
}

type ListAppResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回结果：应用列表
	Result []*AppDO `json:"result,omitempty" xml:"result,omitempty" type:"Repeated"`
}

func (s ListAppResponse) String() string {
	return tea.Prettify(s)
}

func (s ListAppResponse) GoString() string {
	return s.String()
}

func (s *ListAppResponse) SetReqMsgId(v string) *ListAppResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ListAppResponse) SetResultCode(v string) *ListAppResponse {
	s.ResultCode = &v
	return s
}

func (s *ListAppResponse) SetResultMsg(v string) *ListAppResponse {
	s.ResultMsg = &v
	return s
}

func (s *ListAppResponse) SetResult(v []*AppDO) *ListAppResponse {
	s.Result = v
	return s
}

type CreateCustompluginRequest struct {
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 工作空间
	WorkspaceName *string `json:"workspace_name,omitempty" xml:"workspace_name,omitempty"`
	// 监控产品类型
	PluginType *string `json:"plugin_type,omitempty" xml:"plugin_type,omitempty"`
	// 监控配置名
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 父级文件夹 ID
	ParentFolderId *int64 `json:"parent_folder_id,omitempty" xml:"parent_folder_id,omitempty"`
	// 是否生效
	IsOpen *bool `json:"is_open,omitempty" xml:"is_open,omitempty"`
	// 告警套餐
	AlarmPkgs *AlarmPkgDO `json:"alarm_pkgs,omitempty" xml:"alarm_pkgs,omitempty"`
}

func (s CreateCustompluginRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateCustompluginRequest) GoString() string {
	return s.String()
}

func (s *CreateCustompluginRequest) SetAuthToken(v string) *CreateCustompluginRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateCustompluginRequest) SetWorkspaceName(v string) *CreateCustompluginRequest {
	s.WorkspaceName = &v
	return s
}

func (s *CreateCustompluginRequest) SetPluginType(v string) *CreateCustompluginRequest {
	s.PluginType = &v
	return s
}

func (s *CreateCustompluginRequest) SetName(v string) *CreateCustompluginRequest {
	s.Name = &v
	return s
}

func (s *CreateCustompluginRequest) SetParentFolderId(v int64) *CreateCustompluginRequest {
	s.ParentFolderId = &v
	return s
}

func (s *CreateCustompluginRequest) SetIsOpen(v bool) *CreateCustompluginRequest {
	s.IsOpen = &v
	return s
}

func (s *CreateCustompluginRequest) SetAlarmPkgs(v *AlarmPkgDO) *CreateCustompluginRequest {
	s.AlarmPkgs = v
	return s
}

type CreateCustompluginResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CreateCustompluginResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateCustompluginResponse) GoString() string {
	return s.String()
}

func (s *CreateCustompluginResponse) SetReqMsgId(v string) *CreateCustompluginResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateCustompluginResponse) SetResultCode(v string) *CreateCustompluginResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateCustompluginResponse) SetResultMsg(v string) *CreateCustompluginResponse {
	s.ResultMsg = &v
	return s
}

type DeleteCustompluginRequest struct {
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 监控产品类型
	PluginType *string `json:"plugin_type,omitempty" xml:"plugin_type,omitempty"`
	// id
	Id *int64 `json:"id,omitempty" xml:"id,omitempty"`
	// 工作空间
	WorkspaceName *string `json:"workspace_name,omitempty" xml:"workspace_name,omitempty"`
}

func (s DeleteCustompluginRequest) String() string {
	return tea.Prettify(s)
}

func (s DeleteCustompluginRequest) GoString() string {
	return s.String()
}

func (s *DeleteCustompluginRequest) SetAuthToken(v string) *DeleteCustompluginRequest {
	s.AuthToken = &v
	return s
}

func (s *DeleteCustompluginRequest) SetPluginType(v string) *DeleteCustompluginRequest {
	s.PluginType = &v
	return s
}

func (s *DeleteCustompluginRequest) SetId(v int64) *DeleteCustompluginRequest {
	s.Id = &v
	return s
}

func (s *DeleteCustompluginRequest) SetWorkspaceName(v string) *DeleteCustompluginRequest {
	s.WorkspaceName = &v
	return s
}

type DeleteCustompluginResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s DeleteCustompluginResponse) String() string {
	return tea.Prettify(s)
}

func (s DeleteCustompluginResponse) GoString() string {
	return s.String()
}

func (s *DeleteCustompluginResponse) SetReqMsgId(v string) *DeleteCustompluginResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DeleteCustompluginResponse) SetResultCode(v string) *DeleteCustompluginResponse {
	s.ResultCode = &v
	return s
}

func (s *DeleteCustompluginResponse) SetResultMsg(v string) *DeleteCustompluginResponse {
	s.ResultMsg = &v
	return s
}

type CreateFolderRequest struct {
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 工作空间
	WorkspaceName *string `json:"workspace_name,omitempty" xml:"workspace_name,omitempty"`
	// 文件夹名称
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 父级文件夹id
	ParentFolderId *int64 `json:"parent_folder_id,omitempty" xml:"parent_folder_id,omitempty"`
}

func (s CreateFolderRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateFolderRequest) GoString() string {
	return s.String()
}

func (s *CreateFolderRequest) SetAuthToken(v string) *CreateFolderRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateFolderRequest) SetWorkspaceName(v string) *CreateFolderRequest {
	s.WorkspaceName = &v
	return s
}

func (s *CreateFolderRequest) SetName(v string) *CreateFolderRequest {
	s.Name = &v
	return s
}

func (s *CreateFolderRequest) SetParentFolderId(v int64) *CreateFolderRequest {
	s.ParentFolderId = &v
	return s
}

type CreateFolderResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 文件夹 ID
	FolderId *int64 `json:"folder_id,omitempty" xml:"folder_id,omitempty"`
}

func (s CreateFolderResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateFolderResponse) GoString() string {
	return s.String()
}

func (s *CreateFolderResponse) SetReqMsgId(v string) *CreateFolderResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateFolderResponse) SetResultCode(v string) *CreateFolderResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateFolderResponse) SetResultMsg(v string) *CreateFolderResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateFolderResponse) SetFolderId(v int64) *CreateFolderResponse {
	s.FolderId = &v
	return s
}

type UpdateFolderRequest struct {
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 文件夹id
	Id *int64 `json:"id,omitempty" xml:"id,omitempty"`
	// 文件夹新名称
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 工作空间
	WorkspaceName *string `json:"workspace_name,omitempty" xml:"workspace_name,omitempty"`
}

func (s UpdateFolderRequest) String() string {
	return tea.Prettify(s)
}

func (s UpdateFolderRequest) GoString() string {
	return s.String()
}

func (s *UpdateFolderRequest) SetAuthToken(v string) *UpdateFolderRequest {
	s.AuthToken = &v
	return s
}

func (s *UpdateFolderRequest) SetId(v int64) *UpdateFolderRequest {
	s.Id = &v
	return s
}

func (s *UpdateFolderRequest) SetName(v string) *UpdateFolderRequest {
	s.Name = &v
	return s
}

func (s *UpdateFolderRequest) SetWorkspaceName(v string) *UpdateFolderRequest {
	s.WorkspaceName = &v
	return s
}

type UpdateFolderResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s UpdateFolderResponse) String() string {
	return tea.Prettify(s)
}

func (s UpdateFolderResponse) GoString() string {
	return s.String()
}

func (s *UpdateFolderResponse) SetReqMsgId(v string) *UpdateFolderResponse {
	s.ReqMsgId = &v
	return s
}

func (s *UpdateFolderResponse) SetResultCode(v string) *UpdateFolderResponse {
	s.ResultCode = &v
	return s
}

func (s *UpdateFolderResponse) SetResultMsg(v string) *UpdateFolderResponse {
	s.ResultMsg = &v
	return s
}

type QueryTraceConfigRequest struct {
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 工作空间
	WorkspaceName *string `json:"workspace_name,omitempty" xml:"workspace_name,omitempty"`
}

func (s QueryTraceConfigRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryTraceConfigRequest) GoString() string {
	return s.String()
}

func (s *QueryTraceConfigRequest) SetAuthToken(v string) *QueryTraceConfigRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryTraceConfigRequest) SetWorkspaceName(v string) *QueryTraceConfigRequest {
	s.WorkspaceName = &v
	return s
}

type QueryTraceConfigResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 链路配置
	Tags []*TraceSpanSearchTagConfig `json:"tags,omitempty" xml:"tags,omitempty" type:"Repeated"`
}

func (s QueryTraceConfigResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryTraceConfigResponse) GoString() string {
	return s.String()
}

func (s *QueryTraceConfigResponse) SetReqMsgId(v string) *QueryTraceConfigResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryTraceConfigResponse) SetResultCode(v string) *QueryTraceConfigResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryTraceConfigResponse) SetResultMsg(v string) *QueryTraceConfigResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryTraceConfigResponse) SetTags(v []*TraceSpanSearchTagConfig) *QueryTraceConfigResponse {
	s.Tags = v
	return s
}

type QueryFolderPathRequest struct {
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 自定义监控 ID
	CustomPluginId *int64 `json:"custom_plugin_id,omitempty" xml:"custom_plugin_id,omitempty"`
	// 文件夹 ID
	FolderId *int64 `json:"folder_id,omitempty" xml:"folder_id,omitempty"`
	// 是否包含插件名
	IncludePluginName *bool `json:"include_plugin_name,omitempty" xml:"include_plugin_name,omitempty"`
}

func (s QueryFolderPathRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryFolderPathRequest) GoString() string {
	return s.String()
}

func (s *QueryFolderPathRequest) SetAuthToken(v string) *QueryFolderPathRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryFolderPathRequest) SetCustomPluginId(v int64) *QueryFolderPathRequest {
	s.CustomPluginId = &v
	return s
}

func (s *QueryFolderPathRequest) SetFolderId(v int64) *QueryFolderPathRequest {
	s.FolderId = &v
	return s
}

func (s *QueryFolderPathRequest) SetIncludePluginName(v bool) *QueryFolderPathRequest {
	s.IncludePluginName = &v
	return s
}

type QueryFolderPathResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 文件夹路径
	Paths []*FolderPath `json:"paths,omitempty" xml:"paths,omitempty" type:"Repeated"`
}

func (s QueryFolderPathResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryFolderPathResponse) GoString() string {
	return s.String()
}

func (s *QueryFolderPathResponse) SetReqMsgId(v string) *QueryFolderPathResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryFolderPathResponse) SetResultCode(v string) *QueryFolderPathResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryFolderPathResponse) SetResultMsg(v string) *QueryFolderPathResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryFolderPathResponse) SetPaths(v []*FolderPath) *QueryFolderPathResponse {
	s.Paths = v
	return s
}

type QueryTraceDetailRequest struct {
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 工作空间
	WorkspaceName *string `json:"workspace_name,omitempty" xml:"workspace_name,omitempty"`
	// traceId
	TraceId *string `json:"trace_id,omitempty" xml:"trace_id,omitempty"`
	// 备选的入口ip
	BackupEntryip *string `json:"backup_entryip,omitempty" xml:"backup_entryip,omitempty"`
	// 是否为第一次查询
	FirstQuery *bool `json:"first_query,omitempty" xml:"first_query,omitempty"`
}

func (s QueryTraceDetailRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryTraceDetailRequest) GoString() string {
	return s.String()
}

func (s *QueryTraceDetailRequest) SetAuthToken(v string) *QueryTraceDetailRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryTraceDetailRequest) SetWorkspaceName(v string) *QueryTraceDetailRequest {
	s.WorkspaceName = &v
	return s
}

func (s *QueryTraceDetailRequest) SetTraceId(v string) *QueryTraceDetailRequest {
	s.TraceId = &v
	return s
}

func (s *QueryTraceDetailRequest) SetBackupEntryip(v string) *QueryTraceDetailRequest {
	s.BackupEntryip = &v
	return s
}

func (s *QueryTraceDetailRequest) SetFirstQuery(v bool) *QueryTraceDetailRequest {
	s.FirstQuery = &v
	return s
}

type QueryTraceDetailResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// TaceTreeItem
	TraceTreeItem *TraceTreeItem `json:"trace_tree_item,omitempty" xml:"trace_tree_item,omitempty"`
}

func (s QueryTraceDetailResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryTraceDetailResponse) GoString() string {
	return s.String()
}

func (s *QueryTraceDetailResponse) SetReqMsgId(v string) *QueryTraceDetailResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryTraceDetailResponse) SetResultCode(v string) *QueryTraceDetailResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryTraceDetailResponse) SetResultMsg(v string) *QueryTraceDetailResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryTraceDetailResponse) SetTraceTreeItem(v *TraceTreeItem) *QueryTraceDetailResponse {
	s.TraceTreeItem = v
	return s
}

type QueryTraceTopologyRequest struct {
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 结束毫秒时间戳
	EndTime *int64 `json:"end_time,omitempty" xml:"end_time,omitempty"`
	// 开始毫秒时间戳
	StartTime *int64 `json:"start_time,omitempty" xml:"start_time,omitempty"`
	// 工作空间
	WorkspaceName *string `json:"workspace_name,omitempty" xml:"workspace_name,omitempty"`
	// app
	App *string `json:"app,omitempty" xml:"app,omitempty"`
	// trace_id
	TraceId *string `json:"trace_id,omitempty" xml:"trace_id,omitempty"`
}

func (s QueryTraceTopologyRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryTraceTopologyRequest) GoString() string {
	return s.String()
}

func (s *QueryTraceTopologyRequest) SetAuthToken(v string) *QueryTraceTopologyRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryTraceTopologyRequest) SetEndTime(v int64) *QueryTraceTopologyRequest {
	s.EndTime = &v
	return s
}

func (s *QueryTraceTopologyRequest) SetStartTime(v int64) *QueryTraceTopologyRequest {
	s.StartTime = &v
	return s
}

func (s *QueryTraceTopologyRequest) SetWorkspaceName(v string) *QueryTraceTopologyRequest {
	s.WorkspaceName = &v
	return s
}

func (s *QueryTraceTopologyRequest) SetApp(v string) *QueryTraceTopologyRequest {
	s.App = &v
	return s
}

func (s *QueryTraceTopologyRequest) SetTraceId(v string) *QueryTraceTopologyRequest {
	s.TraceId = &v
	return s
}

type QueryTraceTopologyResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 拓扑节点
	Nodes *TopologyNode `json:"nodes,omitempty" xml:"nodes,omitempty"`
	// 拓扑边
	Edges *TopologyEdge `json:"edges,omitempty" xml:"edges,omitempty"`
	// 节点性能指标
	NodeMetrics *TimeSeriesMetrics `json:"node_metrics,omitempty" xml:"node_metrics,omitempty"`
	// 边性能指标
	EdgeMetrics *TimeSeriesMetrics `json:"edge_metrics,omitempty" xml:"edge_metrics,omitempty"`
}

func (s QueryTraceTopologyResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryTraceTopologyResponse) GoString() string {
	return s.String()
}

func (s *QueryTraceTopologyResponse) SetReqMsgId(v string) *QueryTraceTopologyResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryTraceTopologyResponse) SetResultCode(v string) *QueryTraceTopologyResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryTraceTopologyResponse) SetResultMsg(v string) *QueryTraceTopologyResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryTraceTopologyResponse) SetNodes(v *TopologyNode) *QueryTraceTopologyResponse {
	s.Nodes = v
	return s
}

func (s *QueryTraceTopologyResponse) SetEdges(v *TopologyEdge) *QueryTraceTopologyResponse {
	s.Edges = v
	return s
}

func (s *QueryTraceTopologyResponse) SetNodeMetrics(v *TimeSeriesMetrics) *QueryTraceTopologyResponse {
	s.NodeMetrics = v
	return s
}

func (s *QueryTraceTopologyResponse) SetEdgeMetrics(v *TimeSeriesMetrics) *QueryTraceTopologyResponse {
	s.EdgeMetrics = v
	return s
}

type QueryTraceMetricsRequest struct {
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// sum或none
	Aggregator *string `json:"aggregator,omitempty" xml:"aggregator,omitempty"`
	// 结束毫秒时间戳
	EndTime *int64 `json:"end_time,omitempty" xml:"end_time,omitempty"`
	// 开始毫秒时间戳
	StartTime *int64 `json:"start_time,omitempty" xml:"start_time,omitempty"`
	// metrics字段名称
	Metrics []*string `json:"metrics,omitempty" xml:"metrics,omitempty" type:"Repeated"`
	// 扩展字段tags
	Tags []*KeyValuePair `json:"tags,omitempty" xml:"tags,omitempty" type:"Repeated"`
	// metrics类型
	Type *string `json:"type,omitempty" xml:"type,omitempty"`
	// 工作空间
	WorkspaceName *string `json:"workspace_name,omitempty" xml:"workspace_name,omitempty"`
}

func (s QueryTraceMetricsRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryTraceMetricsRequest) GoString() string {
	return s.String()
}

func (s *QueryTraceMetricsRequest) SetAuthToken(v string) *QueryTraceMetricsRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryTraceMetricsRequest) SetAggregator(v string) *QueryTraceMetricsRequest {
	s.Aggregator = &v
	return s
}

func (s *QueryTraceMetricsRequest) SetEndTime(v int64) *QueryTraceMetricsRequest {
	s.EndTime = &v
	return s
}

func (s *QueryTraceMetricsRequest) SetStartTime(v int64) *QueryTraceMetricsRequest {
	s.StartTime = &v
	return s
}

func (s *QueryTraceMetricsRequest) SetMetrics(v []*string) *QueryTraceMetricsRequest {
	s.Metrics = v
	return s
}

func (s *QueryTraceMetricsRequest) SetTags(v []*KeyValuePair) *QueryTraceMetricsRequest {
	s.Tags = v
	return s
}

func (s *QueryTraceMetricsRequest) SetType(v string) *QueryTraceMetricsRequest {
	s.Type = &v
	return s
}

func (s *QueryTraceMetricsRequest) SetWorkspaceName(v string) *QueryTraceMetricsRequest {
	s.WorkspaceName = &v
	return s
}

type QueryTraceMetricsResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// metrics reulsts
	Result *TimeSeriesMetrics `json:"result,omitempty" xml:"result,omitempty"`
}

func (s QueryTraceMetricsResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryTraceMetricsResponse) GoString() string {
	return s.String()
}

func (s *QueryTraceMetricsResponse) SetReqMsgId(v string) *QueryTraceMetricsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryTraceMetricsResponse) SetResultCode(v string) *QueryTraceMetricsResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryTraceMetricsResponse) SetResultMsg(v string) *QueryTraceMetricsResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryTraceMetricsResponse) SetResult(v *TimeSeriesMetrics) *QueryTraceMetricsResponse {
	s.Result = v
	return s
}

type GetCustompluginRequest struct {
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 工作空间
	WorkspaceName *string `json:"workspace_name,omitempty" xml:"workspace_name,omitempty"`
	// 自定义监控指标 ID
	Id *int64 `json:"id,omitempty" xml:"id,omitempty"`
	// 类型
	PluginType *string `json:"plugin_type,omitempty" xml:"plugin_type,omitempty"`
}

func (s GetCustompluginRequest) String() string {
	return tea.Prettify(s)
}

func (s GetCustompluginRequest) GoString() string {
	return s.String()
}

func (s *GetCustompluginRequest) SetAuthToken(v string) *GetCustompluginRequest {
	s.AuthToken = &v
	return s
}

func (s *GetCustompluginRequest) SetWorkspaceName(v string) *GetCustompluginRequest {
	s.WorkspaceName = &v
	return s
}

func (s *GetCustompluginRequest) SetId(v int64) *GetCustompluginRequest {
	s.Id = &v
	return s
}

func (s *GetCustompluginRequest) SetPluginType(v string) *GetCustompluginRequest {
	s.PluginType = &v
	return s
}

type GetCustompluginResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// ID
	Id *int64 `json:"id,omitempty" xml:"id,omitempty"`
	// 自定义监控名称
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 是否有报警
	Alarmed *bool `json:"alarmed,omitempty" xml:"alarmed,omitempty"`
	// 监控类型id
	PluginId *int64 `json:"plugin_id,omitempty" xml:"plugin_id,omitempty"`
	// 监控类型
	PluginType *string `json:"plugin_type,omitempty" xml:"plugin_type,omitempty"`
	// 创建者
	Creator *string `json:"creator,omitempty" xml:"creator,omitempty"`
	// 最后修改者
	Modifier *string `json:"modifier,omitempty" xml:"modifier,omitempty"`
	// 创建时间戳
	GmtCreate *int64 `json:"gmt_create,omitempty" xml:"gmt_create,omitempty"`
	// 最后修改时间 - 时间戳
	GmtModified *int64 `json:"gmt_modified,omitempty" xml:"gmt_modified,omitempty"`
	// 告警套餐列表
	AlarmPkgs []*AlarmPkgDO `json:"alarm_pkgs,omitempty" xml:"alarm_pkgs,omitempty" type:"Repeated"`
}

func (s GetCustompluginResponse) String() string {
	return tea.Prettify(s)
}

func (s GetCustompluginResponse) GoString() string {
	return s.String()
}

func (s *GetCustompluginResponse) SetReqMsgId(v string) *GetCustompluginResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetCustompluginResponse) SetResultCode(v string) *GetCustompluginResponse {
	s.ResultCode = &v
	return s
}

func (s *GetCustompluginResponse) SetResultMsg(v string) *GetCustompluginResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetCustompluginResponse) SetId(v int64) *GetCustompluginResponse {
	s.Id = &v
	return s
}

func (s *GetCustompluginResponse) SetName(v string) *GetCustompluginResponse {
	s.Name = &v
	return s
}

func (s *GetCustompluginResponse) SetAlarmed(v bool) *GetCustompluginResponse {
	s.Alarmed = &v
	return s
}

func (s *GetCustompluginResponse) SetPluginId(v int64) *GetCustompluginResponse {
	s.PluginId = &v
	return s
}

func (s *GetCustompluginResponse) SetPluginType(v string) *GetCustompluginResponse {
	s.PluginType = &v
	return s
}

func (s *GetCustompluginResponse) SetCreator(v string) *GetCustompluginResponse {
	s.Creator = &v
	return s
}

func (s *GetCustompluginResponse) SetModifier(v string) *GetCustompluginResponse {
	s.Modifier = &v
	return s
}

func (s *GetCustompluginResponse) SetGmtCreate(v int64) *GetCustompluginResponse {
	s.GmtCreate = &v
	return s
}

func (s *GetCustompluginResponse) SetGmtModified(v int64) *GetCustompluginResponse {
	s.GmtModified = &v
	return s
}

func (s *GetCustompluginResponse) SetAlarmPkgs(v []*AlarmPkgDO) *GetCustompluginResponse {
	s.AlarmPkgs = v
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
func (client *Client) DoRequest(version *string, action *string, protocol *string, method *string, pathname *string, request map[string]interface{}, headers map[string]*string, runtime *util.RuntimeOptions) (_result map[string]interface{}, _err error) {
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
				"method":           action,
				"version":          version,
				"sign_type":        tea.String("HmacSHA1"),
				"req_time":         antchainutil.GetTimestamp(),
				"req_msg_id":       antchainutil.GetNonce(),
				"access_key":       client.AccessKeyId,
				"base_sdk_version": tea.String("TeaSDK-2.0"),
				"sdk_version":      tea.String("1.1.0"),
			}
			if !tea.BoolValue(util.Empty(client.SecurityToken)) {
				request_.Query["security_token"] = client.SecurityToken
			}

			request_.Headers = tea.Merge(map[string]*string{
				"host":       util.DefaultString(client.Endpoint, tea.String("undefined")),
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
 * Description: /agent/logLocate
 * Summary: /agent/logLocate
 */
func (client *Client) QueryRmsAgentloglocate(request *QueryRmsAgentloglocateRequest) (_result *QueryRmsAgentloglocateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryRmsAgentloglocateResponse{}
	_body, _err := client.QueryRmsAgentloglocateEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: /agent/logLocate
 * Summary: /agent/logLocate
 */
func (client *Client) QueryRmsAgentloglocateEx(request *QueryRmsAgentloglocateRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryRmsAgentloglocateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryRmsAgentloglocateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.monitor.rms.agentloglocate.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: /agent/tail
 * Summary: /agent/tail
 */
func (client *Client) QueryRmsAgenttail(request *QueryRmsAgenttailRequest) (_result *QueryRmsAgenttailResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryRmsAgenttailResponse{}
	_body, _err := client.QueryRmsAgenttailEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: /agent/tail
 * Summary: /agent/tail
 */
func (client *Client) QueryRmsAgenttailEx(request *QueryRmsAgenttailRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryRmsAgenttailResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryRmsAgenttailResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.monitor.rms.agenttail.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: /agent/browser
 * Summary: /agent/browser
 */
func (client *Client) QueryRmsAgentbrowser(request *QueryRmsAgentbrowserRequest) (_result *QueryRmsAgentbrowserResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryRmsAgentbrowserResponse{}
	_body, _err := client.QueryRmsAgentbrowserEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: /agent/browser
 * Summary: /agent/browser
 */
func (client *Client) QueryRmsAgentbrowserEx(request *QueryRmsAgentbrowserRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryRmsAgentbrowserResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryRmsAgentbrowserResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.monitor.rms.agentbrowser.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: rms.alarmhistorytype.query
 * Summary: alarmTypeStats
 */
func (client *Client) QueryRmsAlarmhistorytype(request *QueryRmsAlarmhistorytypeRequest) (_result *QueryRmsAlarmhistorytypeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryRmsAlarmhistorytypeResponse{}
	_body, _err := client.QueryRmsAlarmhistorytypeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: rms.alarmhistorytype.query
 * Summary: alarmTypeStats
 */
func (client *Client) QueryRmsAlarmhistorytypeEx(request *QueryRmsAlarmhistorytypeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryRmsAlarmhistorytypeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryRmsAlarmhistorytypeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.monitor.rms.alarmhistorytype.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: alarmLevelStats
 * Summary: alarmLevelStats
 */
func (client *Client) QueryRmsAlarmhistorylevel(request *QueryRmsAlarmhistorylevelRequest) (_result *QueryRmsAlarmhistorylevelResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryRmsAlarmhistorylevelResponse{}
	_body, _err := client.QueryRmsAlarmhistorylevelEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: alarmLevelStats
 * Summary: alarmLevelStats
 */
func (client *Client) QueryRmsAlarmhistorylevelEx(request *QueryRmsAlarmhistorylevelRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryRmsAlarmhistorylevelResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryRmsAlarmhistorylevelResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.monitor.rms.alarmhistorylevel.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: /stats/notify/history
 * Summary: notifyHistoryStatsV2
 */
func (client *Client) QueryRmsNotifyhistory(request *QueryRmsNotifyhistoryRequest) (_result *QueryRmsNotifyhistoryResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryRmsNotifyhistoryResponse{}
	_body, _err := client.QueryRmsNotifyhistoryEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: /stats/notify/history
 * Summary: notifyHistoryStatsV2
 */
func (client *Client) QueryRmsNotifyhistoryEx(request *QueryRmsNotifyhistoryRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryRmsNotifyhistoryResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryRmsNotifyhistoryResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.monitor.rms.notifyhistory.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: /stats/stack/entity
 * Summary: stackEntityStats
 */
func (client *Client) QueryRmsStackentity(request *QueryRmsStackentityRequest) (_result *QueryRmsStackentityResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryRmsStackentityResponse{}
	_body, _err := client.QueryRmsStackentityEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: /stats/stack/entity
 * Summary: stackEntityStats
 */
func (client *Client) QueryRmsStackentityEx(request *QueryRmsStackentityRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryRmsStackentityResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryRmsStackentityResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.monitor.rms.stackentity.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: /stats/alarm/history/appCount
 * Summary: alarmHistoryAppCount
 */
func (client *Client) QueryRmsAlarmhistoryappcount(request *QueryRmsAlarmhistoryappcountRequest) (_result *QueryRmsAlarmhistoryappcountResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryRmsAlarmhistoryappcountResponse{}
	_body, _err := client.QueryRmsAlarmhistoryappcountEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: /stats/alarm/history/appCount
 * Summary: alarmHistoryAppCount
 */
func (client *Client) QueryRmsAlarmhistoryappcountEx(request *QueryRmsAlarmhistoryappcountRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryRmsAlarmhistoryappcountResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryRmsAlarmhistoryappcountResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.monitor.rms.alarmhistoryappcount.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: /alarm/history/appStats
 * Summary: alarmHistoryAppStats
 */
func (client *Client) QueryRmsAlarmhistoryappstats(request *QueryRmsAlarmhistoryappstatsRequest) (_result *QueryRmsAlarmhistoryappstatsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryRmsAlarmhistoryappstatsResponse{}
	_body, _err := client.QueryRmsAlarmhistoryappstatsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: /alarm/history/appStats
 * Summary: alarmHistoryAppStats
 */
func (client *Client) QueryRmsAlarmhistoryappstatsEx(request *QueryRmsAlarmhistoryappstatsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryRmsAlarmhistoryappstatsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryRmsAlarmhistoryappstatsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.monitor.rms.alarmhistoryappstats.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: /alarm/history/appStatsPageable
 * Summary: appstatspageable
 */
func (client *Client) QueryRmsAppstatspageable(request *QueryRmsAppstatspageableRequest) (_result *QueryRmsAppstatspageableResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryRmsAppstatspageableResponse{}
	_body, _err := client.QueryRmsAppstatspageableEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: /alarm/history/appStatsPageable
 * Summary: appstatspageable
 */
func (client *Client) QueryRmsAppstatspageableEx(request *QueryRmsAppstatspageableRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryRmsAppstatspageableResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryRmsAppstatspageableResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.monitor.rms.appstatspageable.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: /logread/error
 * Summary: /logread/error
 */
func (client *Client) QueryRmsLogreaderror(request *QueryRmsLogreaderrorRequest) (_result *QueryRmsLogreaderrorResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryRmsLogreaderrorResponse{}
	_body, _err := client.QueryRmsLogreaderrorEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: /logread/error
 * Summary: /logread/error
 */
func (client *Client) QueryRmsLogreaderrorEx(request *QueryRmsLogreaderrorRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryRmsLogreaderrorResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryRmsLogreaderrorResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.monitor.rms.logreaderror.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: /universal/read
 * Summary: /universal/read
 */
func (client *Client) QueryRmsUniversalread(request *QueryRmsUniversalreadRequest) (_result *QueryRmsUniversalreadResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryRmsUniversalreadResponse{}
	_body, _err := client.QueryRmsUniversalreadEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: /universal/read
 * Summary: /universal/read
 */
func (client *Client) QueryRmsUniversalreadEx(request *QueryRmsUniversalreadRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryRmsUniversalreadResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryRmsUniversalreadResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.monitor.rms.universalread.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: /universal/write
 * Summary: /universal/write
 */
func (client *Client) QueryRmsUniversalwrite(request *QueryRmsUniversalwriteRequest) (_result *QueryRmsUniversalwriteResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryRmsUniversalwriteResponse{}
	_body, _err := client.QueryRmsUniversalwriteEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: /universal/write
 * Summary: /universal/write
 */
func (client *Client) QueryRmsUniversalwriteEx(request *QueryRmsUniversalwriteRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryRmsUniversalwriteResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryRmsUniversalwriteResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.monitor.rms.universalwrite.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: /modeling/plugin/create
 * Summary: create
 */
func (client *Client) CreateRmsPlugin(request *CreateRmsPluginRequest) (_result *CreateRmsPluginResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateRmsPluginResponse{}
	_body, _err := client.CreateRmsPluginEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: /modeling/plugin/create
 * Summary: create
 */
func (client *Client) CreateRmsPluginEx(request *CreateRmsPluginRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateRmsPluginResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateRmsPluginResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.monitor.rms.plugin.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: /modeling/plugin/delete
 * Summary: delete
 */
func (client *Client) DeleteRmsPlugin(request *DeleteRmsPluginRequest) (_result *DeleteRmsPluginResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DeleteRmsPluginResponse{}
	_body, _err := client.DeleteRmsPluginEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: /modeling/plugin/delete
 * Summary: delete
 */
func (client *Client) DeleteRmsPluginEx(request *DeleteRmsPluginRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DeleteRmsPluginResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DeleteRmsPluginResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.monitor.rms.plugin.delete"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: /modeling/plugin/close
 * Summary: close
 */
func (client *Client) CloseRmsPlugin(request *CloseRmsPluginRequest) (_result *CloseRmsPluginResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CloseRmsPluginResponse{}
	_body, _err := client.CloseRmsPluginEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: /modeling/plugin/close
 * Summary: close
 */
func (client *Client) CloseRmsPluginEx(request *CloseRmsPluginRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CloseRmsPluginResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CloseRmsPluginResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.monitor.rms.plugin.close"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: /modeling/plugin/open
 * Summary: open
 */
func (client *Client) OpenRmsPlugin(request *OpenRmsPluginRequest) (_result *OpenRmsPluginResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &OpenRmsPluginResponse{}
	_body, _err := client.OpenRmsPluginEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: /modeling/plugin/open
 * Summary: open
 */
func (client *Client) OpenRmsPluginEx(request *OpenRmsPluginRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *OpenRmsPluginResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &OpenRmsPluginResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.monitor.rms.plugin.open"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: /modeling/plugin/update
 * Summary: update
 */
func (client *Client) UpdateRmsPlugin(request *UpdateRmsPluginRequest) (_result *UpdateRmsPluginResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateRmsPluginResponse{}
	_body, _err := client.UpdateRmsPluginEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: /modeling/plugin/update
 * Summary: update
 */
func (client *Client) UpdateRmsPluginEx(request *UpdateRmsPluginRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateRmsPluginResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateRmsPluginResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.monitor.rms.plugin.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: /modeling/plugin/queryByPluginType
 * Summary: queryByPluginType
 */
func (client *Client) QueryRmsPluginbytype(request *QueryRmsPluginbytypeRequest) (_result *QueryRmsPluginbytypeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryRmsPluginbytypeResponse{}
	_body, _err := client.QueryRmsPluginbytypeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: /modeling/plugin/queryByPluginType
 * Summary: queryByPluginType
 */
func (client *Client) QueryRmsPluginbytypeEx(request *QueryRmsPluginbytypeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryRmsPluginbytypeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryRmsPluginbytypeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.monitor.rms.pluginbytype.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: /modeling/plugin/queryByFolder
 * Summary: queryByFolder
 */
func (client *Client) QueryRmsPluginbyfolder(request *QueryRmsPluginbyfolderRequest) (_result *QueryRmsPluginbyfolderResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryRmsPluginbyfolderResponse{}
	_body, _err := client.QueryRmsPluginbyfolderEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: /modeling/plugin/queryByFolder
 * Summary: queryByFolder
 */
func (client *Client) QueryRmsPluginbyfolderEx(request *QueryRmsPluginbyfolderRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryRmsPluginbyfolderResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryRmsPluginbyfolderResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.monitor.rms.pluginbyfolder.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: /modeling/plugin/query
 * Summary: query
 */
func (client *Client) QueryRmsPlugin(request *QueryRmsPluginRequest) (_result *QueryRmsPluginResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryRmsPluginResponse{}
	_body, _err := client.QueryRmsPluginEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: /modeling/plugin/query
 * Summary: query
 */
func (client *Client) QueryRmsPluginEx(request *QueryRmsPluginRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryRmsPluginResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryRmsPluginResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.monitor.rms.plugin.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: /modeling/plugin/querytest
 * Summary: querytest
 */
func (client *Client) QueryRmsPlugintest(request *QueryRmsPlugintestRequest) (_result *QueryRmsPlugintestResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryRmsPlugintestResponse{}
	_body, _err := client.QueryRmsPlugintestEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: /modeling/plugin/querytest
 * Summary: querytest
 */
func (client *Client) QueryRmsPlugintestEx(request *QueryRmsPlugintestRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryRmsPlugintestResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryRmsPlugintestResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.monitor.rms.plugintest.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: /modeling/folder/path
 * Summary: queryPath
 */
func (client *Client) QueryRmsPath(request *QueryRmsPathRequest) (_result *QueryRmsPathResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryRmsPathResponse{}
	_body, _err := client.QueryRmsPathEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: /modeling/folder/path
 * Summary: queryPath
 */
func (client *Client) QueryRmsPathEx(request *QueryRmsPathRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryRmsPathResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryRmsPathResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.monitor.rms.path.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: /{tenantId}/webapi/cleankey
 * Summary: cleankey
 */
func (client *Client) ExecRmsUniversalcleankey(request *ExecRmsUniversalcleankeyRequest) (_result *ExecRmsUniversalcleankeyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ExecRmsUniversalcleankeyResponse{}
	_body, _err := client.ExecRmsUniversalcleankeyEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: /{tenantId}/webapi/cleankey
 * Summary: cleankey
 */
func (client *Client) ExecRmsUniversalcleankeyEx(request *ExecRmsUniversalcleankeyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ExecRmsUniversalcleankeyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecRmsUniversalcleankeyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.monitor.rms.universalcleankey.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: /{tenantId}/universalQuery
 * Summary: universalQuery
 */
func (client *Client) QueryRmsUniversal(request *QueryRmsUniversalRequest) (_result *QueryRmsUniversalResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryRmsUniversalResponse{}
	_body, _err := client.QueryRmsUniversalEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: /{tenantId}/universalQuery
 * Summary: universalQuery
 */
func (client *Client) QueryRmsUniversalEx(request *QueryRmsUniversalRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryRmsUniversalResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryRmsUniversalResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.monitor.rms.universal.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 链路搜索
 * Summary: 链路搜索
 */
func (client *Client) QueryRmsTracespan(request *QueryRmsTracespanRequest) (_result *QueryRmsTracespanResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryRmsTracespanResponse{}
	_body, _err := client.QueryRmsTracespanEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 链路搜索
 * Summary: 链路搜索
 */
func (client *Client) QueryRmsTracespanEx(request *QueryRmsTracespanRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryRmsTracespanResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryRmsTracespanResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.monitor.rms.tracespan.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询链路搜索页面的配置
 * Summary: 查询链路搜索页面的配置
 */
func (client *Client) GetRmsTracespanqueryconfig(request *GetRmsTracespanqueryconfigRequest) (_result *GetRmsTracespanqueryconfigResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetRmsTracespanqueryconfigResponse{}
	_body, _err := client.GetRmsTracespanqueryconfigEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询链路搜索页面的配置
 * Summary: 查询链路搜索页面的配置
 */
func (client *Client) GetRmsTracespanqueryconfigEx(request *GetRmsTracespanqueryconfigRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetRmsTracespanqueryconfigResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetRmsTracespanqueryconfigResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.monitor.rms.tracespanqueryconfig.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 单链路树状图查询
 * Summary: 单链路树状图查询
 */
func (client *Client) DescribeRmsTracetree(request *DescribeRmsTracetreeRequest) (_result *DescribeRmsTracetreeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DescribeRmsTracetreeResponse{}
	_body, _err := client.DescribeRmsTracetreeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 单链路树状图查询
 * Summary: 单链路树状图查询
 */
func (client *Client) DescribeRmsTracetreeEx(request *DescribeRmsTracetreeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DescribeRmsTracetreeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DescribeRmsTracetreeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.monitor.rms.tracetree.describe"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 南天门 - 商品补全接口
 * Summary: 南天门 - 商品补全接口
 */
func (client *Client) CallbackSpiCompletecommodity(request *CallbackSpiCompletecommodityRequest) (_result *CallbackSpiCompletecommodityResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CallbackSpiCompletecommodityResponse{}
	_body, _err := client.CallbackSpiCompletecommodityEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 南天门 - 商品补全接口
 * Summary: 南天门 - 商品补全接口
 */
func (client *Client) CallbackSpiCompletecommodityEx(request *CallbackSpiCompletecommodityRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CallbackSpiCompletecommodityResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CallbackSpiCompletecommodityResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.monitor.spi.completecommodity.callback"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 南天门 - 支付后回调
 * Summary: 南天门 - 支付后回调
 */
func (client *Client) CallbackSpiPayordercallback(request *CallbackSpiPayordercallbackRequest) (_result *CallbackSpiPayordercallbackResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CallbackSpiPayordercallbackResponse{}
	_body, _err := client.CallbackSpiPayordercallbackEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 南天门 - 支付后回调
 * Summary: 南天门 - 支付后回调
 */
func (client *Client) CallbackSpiPayordercallbackEx(request *CallbackSpiPayordercallbackRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CallbackSpiPayordercallbackResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CallbackSpiPayordercallbackResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.monitor.spi.payordercallback.callback"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 南天门 - 补全订单
 * Summary: 南天门 - 补全订单
 */
func (client *Client) CallbackSpiCompleteorderparam(request *CallbackSpiCompleteorderparamRequest) (_result *CallbackSpiCompleteorderparamResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CallbackSpiCompleteorderparamResponse{}
	_body, _err := client.CallbackSpiCompleteorderparamEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 南天门 - 补全订单
 * Summary: 南天门 - 补全订单
 */
func (client *Client) CallbackSpiCompleteorderparamEx(request *CallbackSpiCompleteorderparamRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CallbackSpiCompleteorderparamResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CallbackSpiCompleteorderparamResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.monitor.spi.completeorderparam.callback"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 南天门 - 订单校验回调
 * Summary: 南天门 - 订单校验回调
 */
func (client *Client) CallbackSpiVerify(request *CallbackSpiVerifyRequest) (_result *CallbackSpiVerifyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CallbackSpiVerifyResponse{}
	_body, _err := client.CallbackSpiVerifyEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 南天门 - 订单校验回调
 * Summary: 南天门 - 订单校验回调
 */
func (client *Client) CallbackSpiVerifyEx(request *CallbackSpiVerifyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CallbackSpiVerifyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CallbackSpiVerifyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.monitor.spi.verify.callback"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 南天门 - 退款
 * Summary: 南天门 - 退款
 */
func (client *Client) CallbackSpiRefund(request *CallbackSpiRefundRequest) (_result *CallbackSpiRefundResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CallbackSpiRefundResponse{}
	_body, _err := client.CallbackSpiRefundEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 南天门 - 退款
 * Summary: 南天门 - 退款
 */
func (client *Client) CallbackSpiRefundEx(request *CallbackSpiRefundRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CallbackSpiRefundResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CallbackSpiRefundResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.monitor.spi.refund.callback"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 南天门 - 商品实例生命周期回调
 * Summary: 南天门 - 商品实例生命周期回调
 */
func (client *Client) CallbackSpiLifecycle(request *CallbackSpiLifecycleRequest) (_result *CallbackSpiLifecycleResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CallbackSpiLifecycleResponse{}
	_body, _err := client.CallbackSpiLifecycleEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 南天门 - 商品实例生命周期回调
 * Summary: 南天门 - 商品实例生命周期回调
 */
func (client *Client) CallbackSpiLifecycleEx(request *CallbackSpiLifecycleRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CallbackSpiLifecycleResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CallbackSpiLifecycleResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.monitor.spi.lifecycle.callback"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询时序指标
 * Summary: 查询时序指标
 */
func (client *Client) DescribeRmsTimeseriesmetrics(request *DescribeRmsTimeseriesmetricsRequest) (_result *DescribeRmsTimeseriesmetricsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DescribeRmsTimeseriesmetricsResponse{}
	_body, _err := client.DescribeRmsTimeseriesmetricsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询时序指标
 * Summary: 查询时序指标
 */
func (client *Client) DescribeRmsTimeseriesmetricsEx(request *DescribeRmsTimeseriesmetricsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DescribeRmsTimeseriesmetricsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DescribeRmsTimeseriesmetricsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.monitor.rms.timeseriesmetrics.describe"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取调用拓扑
 * Summary: 获取调用拓扑
 */
func (client *Client) DescribeRmsTopology(request *DescribeRmsTopologyRequest) (_result *DescribeRmsTopologyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DescribeRmsTopologyResponse{}
	_body, _err := client.DescribeRmsTopologyEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取调用拓扑
 * Summary: 获取调用拓扑
 */
func (client *Client) DescribeRmsTopologyEx(request *DescribeRmsTopologyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DescribeRmsTopologyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DescribeRmsTopologyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.monitor.rms.topology.describe"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 监控指标数据查询
 * Summary: 监控指标数据查询
 */
func (client *Client) QueryMetrics(request *QueryMetricsRequest) (_result *QueryMetricsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryMetricsResponse{}
	_body, _err := client.QueryMetricsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 监控指标数据查询
 * Summary: 监控指标数据查询
 */
func (client *Client) QueryMetricsEx(request *QueryMetricsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryMetricsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryMetricsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.monitor.metrics.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 链路Span查询搜索
 * Summary: 链路查询
 */
func (client *Client) QueryTraceSpan(request *QueryTraceSpanRequest) (_result *QueryTraceSpanResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryTraceSpanResponse{}
	_body, _err := client.QueryTraceSpanEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 链路Span查询搜索
 * Summary: 链路查询
 */
func (client *Client) QueryTraceSpanEx(request *QueryTraceSpanRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryTraceSpanResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryTraceSpanResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.monitor.trace.span.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取应用列表
 * Summary: 获取应用列表
 */
func (client *Client) ListApp(request *ListAppRequest) (_result *ListAppResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ListAppResponse{}
	_body, _err := client.ListAppEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取应用列表
 * Summary: 获取应用列表
 */
func (client *Client) ListAppEx(request *ListAppRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ListAppResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ListAppResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.monitor.app.list"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建自定义监控指标
 * Summary: 创建自定义监控指标
 */
func (client *Client) CreateCustomplugin(request *CreateCustompluginRequest) (_result *CreateCustompluginResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateCustompluginResponse{}
	_body, _err := client.CreateCustompluginEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建自定义监控指标
 * Summary: 创建自定义监控指标
 */
func (client *Client) CreateCustompluginEx(request *CreateCustompluginRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateCustompluginResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateCustompluginResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.monitor.customplugin.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 删除自定义监控指标
 * Summary: 删除自定义监控指标
 */
func (client *Client) DeleteCustomplugin(request *DeleteCustompluginRequest) (_result *DeleteCustompluginResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DeleteCustompluginResponse{}
	_body, _err := client.DeleteCustompluginEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 删除自定义监控指标
 * Summary: 删除自定义监控指标
 */
func (client *Client) DeleteCustompluginEx(request *DeleteCustompluginRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DeleteCustompluginResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DeleteCustompluginResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.monitor.customplugin.delete"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 自定义监控 - 添加文件夹
 * Summary: 自定义监控 - 添加文件夹
 */
func (client *Client) CreateFolder(request *CreateFolderRequest) (_result *CreateFolderResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CreateFolderResponse{}
	_body, _err := client.CreateFolderEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 自定义监控 - 添加文件夹
 * Summary: 自定义监控 - 添加文件夹
 */
func (client *Client) CreateFolderEx(request *CreateFolderRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CreateFolderResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateFolderResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.monitor.folder.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 自定义监控 - 文件夹更新
 * Summary: 自定义监控 - 文件夹更新
 */
func (client *Client) UpdateFolder(request *UpdateFolderRequest) (_result *UpdateFolderResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &UpdateFolderResponse{}
	_body, _err := client.UpdateFolderEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 自定义监控 - 文件夹更新
 * Summary: 自定义监控 - 文件夹更新
 */
func (client *Client) UpdateFolderEx(request *UpdateFolderRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *UpdateFolderResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &UpdateFolderResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.monitor.folder.update"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 链路查询时可选参数的配置查询
 * Summary: 链路查询时可选参数的配置查询
 */
func (client *Client) QueryTraceConfig(request *QueryTraceConfigRequest) (_result *QueryTraceConfigResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryTraceConfigResponse{}
	_body, _err := client.QueryTraceConfigEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 链路查询时可选参数的配置查询
 * Summary: 链路查询时可选参数的配置查询
 */
func (client *Client) QueryTraceConfigEx(request *QueryTraceConfigRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryTraceConfigResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryTraceConfigResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.monitor.trace.config.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询文件夹路径
 * Summary: 查询文件夹路径
 */
func (client *Client) QueryFolderPath(request *QueryFolderPathRequest) (_result *QueryFolderPathResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryFolderPathResponse{}
	_body, _err := client.QueryFolderPathEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询文件夹路径
 * Summary: 查询文件夹路径
 */
func (client *Client) QueryFolderPathEx(request *QueryFolderPathRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryFolderPathResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryFolderPathResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.monitor.folder.path.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询链路详情
 * Summary: 查询链路详情
 */
func (client *Client) QueryTraceDetail(request *QueryTraceDetailRequest) (_result *QueryTraceDetailResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryTraceDetailResponse{}
	_body, _err := client.QueryTraceDetailEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询链路详情
 * Summary: 查询链路详情
 */
func (client *Client) QueryTraceDetailEx(request *QueryTraceDetailRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryTraceDetailResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryTraceDetailResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.monitor.trace.detail.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取链路拓扑图
 * Summary: 获取链路拓扑图
 */
func (client *Client) QueryTraceTopology(request *QueryTraceTopologyRequest) (_result *QueryTraceTopologyResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryTraceTopologyResponse{}
	_body, _err := client.QueryTraceTopologyEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取链路拓扑图
 * Summary: 获取链路拓扑图
 */
func (client *Client) QueryTraceTopologyEx(request *QueryTraceTopologyRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryTraceTopologyResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryTraceTopologyResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.monitor.trace.topology.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询链路关联指标
 * Summary: 查询链路关联指标
 */
func (client *Client) QueryTraceMetrics(request *QueryTraceMetricsRequest) (_result *QueryTraceMetricsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryTraceMetricsResponse{}
	_body, _err := client.QueryTraceMetricsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询链路关联指标
 * Summary: 查询链路关联指标
 */
func (client *Client) QueryTraceMetricsEx(request *QueryTraceMetricsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryTraceMetricsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryTraceMetricsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.monitor.trace.metrics.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取自定义监控指标详情
 * Summary: 获取自定义监控指标详情
 */
func (client *Client) GetCustomplugin(request *GetCustompluginRequest) (_result *GetCustompluginResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &GetCustompluginResponse{}
	_body, _err := client.GetCustompluginEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取自定义监控指标详情
 * Summary: 获取自定义监控指标详情
 */
func (client *Client) GetCustompluginEx(request *GetCustompluginRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *GetCustompluginResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetCustompluginResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.monitor.customplugin.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
