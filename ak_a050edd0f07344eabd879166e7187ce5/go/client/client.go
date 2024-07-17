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

// 播报内容数据结构
type Output struct {
	// 交互类型多媒体节点使用
	//
	InteractionType *string `json:"interaction_type,omitempty" xml:"interaction_type,omitempty" require:"true"`
	// 播报内容类型
	ContentKey *string `json:"content_key,omitempty" xml:"content_key,omitempty" require:"true"`
	// 合成的播报内容或者是录音的文件地址
	Content *string `json:"content,omitempty" xml:"content,omitempty" require:"true"`
	// 视频文件id
	VideoFileId *string `json:"video_file_id,omitempty" xml:"video_file_id,omitempty" require:"true"`
	// 视频文件播放长度毫秒
	VideoFileContentTime *int64 `json:"video_file_content_time,omitempty" xml:"video_file_content_time,omitempty" require:"true"`
	// 扩展信息
	ExtInfo *string `json:"ext_info,omitempty" xml:"ext_info,omitempty" require:"true"`
	// key为上面content中的变量value为名称
	VariableMap *string `json:"variable_map,omitempty" xml:"variable_map,omitempty" require:"true"`
	// 视频文件code
	VideoCode *string `json:"video_code,omitempty" xml:"video_code,omitempty" require:"true"`
	// 语音文件code
	VoiceCode *string `json:"voice_code,omitempty" xml:"voice_code,omitempty" require:"true"`
	// 输出内容list
	ContentList []*string `json:"content_list,omitempty" xml:"content_list,omitempty" require:"true" type:"Repeated"`
}

func (s Output) String() string {
	return tea.Prettify(s)
}

func (s Output) GoString() string {
	return s.String()
}

func (s *Output) SetInteractionType(v string) *Output {
	s.InteractionType = &v
	return s
}

func (s *Output) SetContentKey(v string) *Output {
	s.ContentKey = &v
	return s
}

func (s *Output) SetContent(v string) *Output {
	s.Content = &v
	return s
}

func (s *Output) SetVideoFileId(v string) *Output {
	s.VideoFileId = &v
	return s
}

func (s *Output) SetVideoFileContentTime(v int64) *Output {
	s.VideoFileContentTime = &v
	return s
}

func (s *Output) SetExtInfo(v string) *Output {
	s.ExtInfo = &v
	return s
}

func (s *Output) SetVariableMap(v string) *Output {
	s.VariableMap = &v
	return s
}

func (s *Output) SetVideoCode(v string) *Output {
	s.VideoCode = &v
	return s
}

func (s *Output) SetVoiceCode(v string) *Output {
	s.VoiceCode = &v
	return s
}

func (s *Output) SetContentList(v []*string) *Output {
	s.ContentList = v
	return s
}

// 动作节点数据结构
type Input struct {
	// 参数唯一id
	FeId *string `json:"fe_id,omitempty" xml:"fe_id,omitempty" require:"true"`
	// 因子的id
	Id *int64 `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 参数的code
	Code *string `json:"code,omitempty" xml:"code,omitempty" require:"true"`
	// 参数的名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 参数取值
	Value []*string `json:"value,omitempty" xml:"value,omitempty" require:"true" type:"Repeated"`
	// 参数的值类型
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 是否使用自定义值
	Custom *bool `json:"custom,omitempty" xml:"custom,omitempty" require:"true"`
	// 是否多选
	Multiple *bool `json:"multiple,omitempty" xml:"multiple,omitempty" require:"true"`
}

func (s Input) String() string {
	return tea.Prettify(s)
}

func (s Input) GoString() string {
	return s.String()
}

func (s *Input) SetFeId(v string) *Input {
	s.FeId = &v
	return s
}

func (s *Input) SetId(v int64) *Input {
	s.Id = &v
	return s
}

func (s *Input) SetCode(v string) *Input {
	s.Code = &v
	return s
}

func (s *Input) SetName(v string) *Input {
	s.Name = &v
	return s
}

func (s *Input) SetValue(v []*string) *Input {
	s.Value = v
	return s
}

func (s *Input) SetType(v string) *Input {
	s.Type = &v
	return s
}

func (s *Input) SetCustom(v bool) *Input {
	s.Custom = &v
	return s
}

func (s *Input) SetMultiple(v bool) *Input {
	s.Multiple = &v
	return s
}

// 交互节点数据结构
type OutputGroup struct {
	// 子节点id
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 自节点名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 快捷条件选择类型
	ConditionType *string `json:"condition_type,omitempty" xml:"condition_type,omitempty" require:"true"`
	// 条件表达式
	ConditionConfig []*string `json:"condition_config,omitempty" xml:"condition_config,omitempty" require:"true" type:"Repeated"`
	// 子节点下的播报内容
	ContentList []*Output `json:"content_list,omitempty" xml:"content_list,omitempty" require:"true" type:"Repeated"`
	// 重试播报时的优先级
	Priority *int64 `json:"priority,omitempty" xml:"priority,omitempty" require:"true"`
}

func (s OutputGroup) String() string {
	return tea.Prettify(s)
}

func (s OutputGroup) GoString() string {
	return s.String()
}

func (s *OutputGroup) SetId(v string) *OutputGroup {
	s.Id = &v
	return s
}

func (s *OutputGroup) SetName(v string) *OutputGroup {
	s.Name = &v
	return s
}

func (s *OutputGroup) SetConditionType(v string) *OutputGroup {
	s.ConditionType = &v
	return s
}

func (s *OutputGroup) SetConditionConfig(v []*string) *OutputGroup {
	s.ConditionConfig = v
	return s
}

func (s *OutputGroup) SetContentList(v []*Output) *OutputGroup {
	s.ContentList = v
	return s
}

func (s *OutputGroup) SetPriority(v int64) *OutputGroup {
	s.Priority = &v
	return s
}

// 节点配置信息数据结构
type NodeInfo struct {
	// 业务标签
	BizTag *Output `json:"biz_tag,omitempty" xml:"biz_tag,omitempty" require:"true"`
	// 节点子类型
	SubType *string `json:"sub_type,omitempty" xml:"sub_type,omitempty" require:"true"`
	// 人工类型
	TransferTargetType *string `json:"transfer_target_type,omitempty" xml:"transfer_target_type,omitempty" require:"true"`
	// 路由点
	TransferData *string `json:"transfer_data,omitempty" xml:"transfer_data,omitempty" require:"true"`
	// 技能组
	SkillGroupNo *string `json:"skill_group_no,omitempty" xml:"skill_group_no,omitempty" require:"true"`
	// 扩展信息
	ExtInfo *string `json:"ext_info,omitempty" xml:"ext_info,omitempty" require:"true"`
	// 业务达成
	BizAchieve *bool `json:"biz_achieve,omitempty" xml:"biz_achieve,omitempty" require:"true"`
	// 音色
	VoiceType *string `json:"voice_type,omitempty" xml:"voice_type,omitempty" require:"true"`
	// 模型类型
	ModelType *string `json:"model_type,omitempty" xml:"model_type,omitempty" require:"true"`
	// 分类模型id
	ModelId *string `json:"model_id,omitempty" xml:"model_id,omitempty" require:"true"`
	// llm意图识别列表配置
	LlmLabels []*string `json:"llm_labels,omitempty" xml:"llm_labels,omitempty" require:"true" type:"Repeated"`
	// 是否必填
	Required *bool `json:"required,omitempty" xml:"required,omitempty" require:"true"`
	// 失败后重复次数
	RepeatTime *int64 `json:"repeat_time,omitempty" xml:"repeat_time,omitempty" require:"true"`
	// 是否允许重试话术打断
	Interruptable *bool `json:"interruptable,omitempty" xml:"interruptable,omitempty" require:"true"`
	// sts配置
	Sts *string `json:"sts,omitempty" xml:"sts,omitempty" require:"true"`
	// appkey
	Appkey *string `json:"appkey,omitempty" xml:"appkey,omitempty" require:"true"`
	// 交互组件后置
	PostInteractionComponent *bool `json:"post_interaction_component,omitempty" xml:"post_interaction_component,omitempty" require:"true"`
	// 话术选择策略
	CorpusChooseStrategy *string `json:"corpus_choose_strategy,omitempty" xml:"corpus_choose_strategy,omitempty" require:"true"`
	// 话术选择策略模型的地址
	CorpusChooseModelUrl *string `json:"corpus_choose_model_url,omitempty" xml:"corpus_choose_model_url,omitempty" require:"true"`
	// 话术选择策略模型类型
	CorpusChooseModelType *string `json:"corpus_choose_model_type,omitempty" xml:"corpus_choose_model_type,omitempty" require:"true"`
	// 全局意图
	GlobalIntention *bool `json:"global_intention,omitempty" xml:"global_intention,omitempty" require:"true"`
	// 命中全局意图后需要播报的内容
	GlobalIntentionReply *Output `json:"global_intention_reply,omitempty" xml:"global_intention_reply,omitempty" require:"true"`
	// 按键类型
	ButtonType *string `json:"button_type,omitempty" xml:"button_type,omitempty" require:"true"`
	// 按键位数
	ButtonDigit *int64 `json:"button_digit,omitempty" xml:"button_digit,omitempty" require:"true"`
	// 结束按键
	ButtonTerminator *string `json:"button_terminator,omitempty" xml:"button_terminator,omitempty" require:"true"`
	// 收号超时时间
	ButtonTimeout *int64 `json:"button_timeout,omitempty" xml:"button_timeout,omitempty" require:"true"`
	// 收号校验规则
	ButtonValidator *string `json:"button_validator,omitempty" xml:"button_validator,omitempty" require:"true"`
	// 静态菜单配置
	StaticKeys []*string `json:"static_keys,omitempty" xml:"static_keys,omitempty" require:"true" type:"Repeated"`
	// 是否支持按键返回上一级
	StaticKeyPrevious *bool `json:"static_key_previous,omitempty" xml:"static_key_previous,omitempty" require:"true"`
	// 是否支持按键重播
	StaticKeyRepeat *bool `json:"static_key_repeat,omitempty" xml:"static_key_repeat,omitempty" require:"true"`
	// 是否跳过用户输入的错误校验
	StaticKeySkipInputCheck *bool `json:"static_key_skip_input_check,omitempty" xml:"static_key_skip_input_check,omitempty" require:"true"`
	// 只有客权的静态菜单开发
	Round *bool `json:"round,omitempty" xml:"round,omitempty" require:"true"`
	// 静态菜单语言
	Language *string `json:"language,omitempty" xml:"language,omitempty" require:"true"`
	// 实例码
	IeInstanceCode *string `json:"ie_instance_code,omitempty" xml:"ie_instance_code,omitempty" require:"true"`
	// 子流程ID
	SubFlowFeId *string `json:"sub_flow_fe_id,omitempty" xml:"sub_flow_fe_id,omitempty" require:"true"`
	// 动态子流程id值
	SubFlowDynamicId *string `json:"sub_flow_dynamic_id,omitempty" xml:"sub_flow_dynamic_id,omitempty" require:"true"`
	// 输入参数配置
	SubFlowInput []*Input `json:"sub_flow_input,omitempty" xml:"sub_flow_input,omitempty" require:"true" type:"Repeated"`
	// 开始节点参数
	StartParams []*Input `json:"start_params,omitempty" xml:"start_params,omitempty" require:"true" type:"Repeated"`
	// 和ouput中的interactionType保持一致
	AllowInteractionTypes []*string `json:"allow_interaction_types,omitempty" xml:"allow_interaction_types,omitempty" require:"true" type:"Repeated"`
	// 需要共享上下文的虚拟因子列表
	ShareFactors []*Input `json:"share_factors,omitempty" xml:"share_factors,omitempty" require:"true" type:"Repeated"`
}

func (s NodeInfo) String() string {
	return tea.Prettify(s)
}

func (s NodeInfo) GoString() string {
	return s.String()
}

func (s *NodeInfo) SetBizTag(v *Output) *NodeInfo {
	s.BizTag = v
	return s
}

func (s *NodeInfo) SetSubType(v string) *NodeInfo {
	s.SubType = &v
	return s
}

func (s *NodeInfo) SetTransferTargetType(v string) *NodeInfo {
	s.TransferTargetType = &v
	return s
}

func (s *NodeInfo) SetTransferData(v string) *NodeInfo {
	s.TransferData = &v
	return s
}

func (s *NodeInfo) SetSkillGroupNo(v string) *NodeInfo {
	s.SkillGroupNo = &v
	return s
}

func (s *NodeInfo) SetExtInfo(v string) *NodeInfo {
	s.ExtInfo = &v
	return s
}

func (s *NodeInfo) SetBizAchieve(v bool) *NodeInfo {
	s.BizAchieve = &v
	return s
}

func (s *NodeInfo) SetVoiceType(v string) *NodeInfo {
	s.VoiceType = &v
	return s
}

func (s *NodeInfo) SetModelType(v string) *NodeInfo {
	s.ModelType = &v
	return s
}

func (s *NodeInfo) SetModelId(v string) *NodeInfo {
	s.ModelId = &v
	return s
}

func (s *NodeInfo) SetLlmLabels(v []*string) *NodeInfo {
	s.LlmLabels = v
	return s
}

func (s *NodeInfo) SetRequired(v bool) *NodeInfo {
	s.Required = &v
	return s
}

func (s *NodeInfo) SetRepeatTime(v int64) *NodeInfo {
	s.RepeatTime = &v
	return s
}

func (s *NodeInfo) SetInterruptable(v bool) *NodeInfo {
	s.Interruptable = &v
	return s
}

func (s *NodeInfo) SetSts(v string) *NodeInfo {
	s.Sts = &v
	return s
}

func (s *NodeInfo) SetAppkey(v string) *NodeInfo {
	s.Appkey = &v
	return s
}

func (s *NodeInfo) SetPostInteractionComponent(v bool) *NodeInfo {
	s.PostInteractionComponent = &v
	return s
}

func (s *NodeInfo) SetCorpusChooseStrategy(v string) *NodeInfo {
	s.CorpusChooseStrategy = &v
	return s
}

func (s *NodeInfo) SetCorpusChooseModelUrl(v string) *NodeInfo {
	s.CorpusChooseModelUrl = &v
	return s
}

func (s *NodeInfo) SetCorpusChooseModelType(v string) *NodeInfo {
	s.CorpusChooseModelType = &v
	return s
}

func (s *NodeInfo) SetGlobalIntention(v bool) *NodeInfo {
	s.GlobalIntention = &v
	return s
}

func (s *NodeInfo) SetGlobalIntentionReply(v *Output) *NodeInfo {
	s.GlobalIntentionReply = v
	return s
}

func (s *NodeInfo) SetButtonType(v string) *NodeInfo {
	s.ButtonType = &v
	return s
}

func (s *NodeInfo) SetButtonDigit(v int64) *NodeInfo {
	s.ButtonDigit = &v
	return s
}

func (s *NodeInfo) SetButtonTerminator(v string) *NodeInfo {
	s.ButtonTerminator = &v
	return s
}

func (s *NodeInfo) SetButtonTimeout(v int64) *NodeInfo {
	s.ButtonTimeout = &v
	return s
}

func (s *NodeInfo) SetButtonValidator(v string) *NodeInfo {
	s.ButtonValidator = &v
	return s
}

func (s *NodeInfo) SetStaticKeys(v []*string) *NodeInfo {
	s.StaticKeys = v
	return s
}

func (s *NodeInfo) SetStaticKeyPrevious(v bool) *NodeInfo {
	s.StaticKeyPrevious = &v
	return s
}

func (s *NodeInfo) SetStaticKeyRepeat(v bool) *NodeInfo {
	s.StaticKeyRepeat = &v
	return s
}

func (s *NodeInfo) SetStaticKeySkipInputCheck(v bool) *NodeInfo {
	s.StaticKeySkipInputCheck = &v
	return s
}

func (s *NodeInfo) SetRound(v bool) *NodeInfo {
	s.Round = &v
	return s
}

func (s *NodeInfo) SetLanguage(v string) *NodeInfo {
	s.Language = &v
	return s
}

func (s *NodeInfo) SetIeInstanceCode(v string) *NodeInfo {
	s.IeInstanceCode = &v
	return s
}

func (s *NodeInfo) SetSubFlowFeId(v string) *NodeInfo {
	s.SubFlowFeId = &v
	return s
}

func (s *NodeInfo) SetSubFlowDynamicId(v string) *NodeInfo {
	s.SubFlowDynamicId = &v
	return s
}

func (s *NodeInfo) SetSubFlowInput(v []*Input) *NodeInfo {
	s.SubFlowInput = v
	return s
}

func (s *NodeInfo) SetStartParams(v []*Input) *NodeInfo {
	s.StartParams = v
	return s
}

func (s *NodeInfo) SetAllowInteractionTypes(v []*string) *NodeInfo {
	s.AllowInteractionTypes = v
	return s
}

func (s *NodeInfo) SetShareFactors(v []*Input) *NodeInfo {
	s.ShareFactors = v
	return s
}

// 前端图形相关
type Shape struct {
	// 边的样式
	Shape *string `json:"shape,omitempty" xml:"shape,omitempty" require:"true"`
	// edgeId
	EdgeId *string `json:"edge_id,omitempty" xml:"edge_id,omitempty" require:"true"`
	// 边起点的锚点位置
	SourceAnchor *int64 `json:"source_anchor,omitempty" xml:"source_anchor,omitempty" require:"true"`
	// 边终点的锚点位置
	TargetAnchor *int64 `json:"target_anchor,omitempty" xml:"target_anchor,omitempty" require:"true"`
}

func (s Shape) String() string {
	return tea.Prettify(s)
}

func (s Shape) GoString() string {
	return s.String()
}

func (s *Shape) SetShape(v string) *Shape {
	s.Shape = &v
	return s
}

func (s *Shape) SetEdgeId(v string) *Shape {
	s.EdgeId = &v
	return s
}

func (s *Shape) SetSourceAnchor(v int64) *Shape {
	s.SourceAnchor = &v
	return s
}

func (s *Shape) SetTargetAnchor(v int64) *Shape {
	s.TargetAnchor = &v
	return s
}

// 流程数据结构
type Edge struct {
	// 边的id，这个是前端生成的，用于图关系
	EdgeId *string `json:"edge_id,omitempty" xml:"edge_id,omitempty" require:"true"`
	// key为上面content中的变量value为名称
	VariableMap *string `json:"variable_map,omitempty" xml:"variable_map,omitempty" require:"true"`
	// 边的规则表达式
	FrontConditionExpression []*string `json:"front_condition_expression,omitempty" xml:"front_condition_expression,omitempty" require:"true" type:"Repeated"`
	// 前端图形相关
	Shape *Shape `json:"shape,omitempty" xml:"shape,omitempty" require:"true"`
	// 边连接的上一个节点的feId
	Source *string `json:"source,omitempty" xml:"source,omitempty" require:"true"`
	// 边连接的下一个节点的feId
	Target *string `json:"target,omitempty" xml:"target,omitempty" require:"true"`
	// 优先级，0~999
	Priority *int64 `json:"priority,omitempty" xml:"priority,omitempty" require:"true"`
}

func (s Edge) String() string {
	return tea.Prettify(s)
}

func (s Edge) GoString() string {
	return s.String()
}

func (s *Edge) SetEdgeId(v string) *Edge {
	s.EdgeId = &v
	return s
}

func (s *Edge) SetVariableMap(v string) *Edge {
	s.VariableMap = &v
	return s
}

func (s *Edge) SetFrontConditionExpression(v []*string) *Edge {
	s.FrontConditionExpression = v
	return s
}

func (s *Edge) SetShape(v *Shape) *Edge {
	s.Shape = v
	return s
}

func (s *Edge) SetSource(v string) *Edge {
	s.Source = &v
	return s
}

func (s *Edge) SetTarget(v string) *Edge {
	s.Target = &v
	return s
}

func (s *Edge) SetPriority(v int64) *Edge {
	s.Priority = &v
	return s
}

// 节点数据结构
type Node struct {
	// 节点的id
	NodeId *string `json:"node_id,omitempty" xml:"node_id,omitempty" require:"true"`
	// 节点名称
	NodeName *string `json:"node_name,omitempty" xml:"node_name,omitempty" require:"true"`
	// 节点类型
	NodeType *string `json:"node_type,omitempty" xml:"node_type,omitempty" require:"true"`
	// 节点在画布的横向位置
	X *int64 `json:"x,omitempty" xml:"x,omitempty" require:"true"`
	// 节点在画布的纵向位置
	Y *int64 `json:"y,omitempty" xml:"y,omitempty" require:"true"`
	// 节点配置信息
	NodeInfo *NodeInfo `json:"node_info,omitempty" xml:"node_info,omitempty" require:"true"`
	// 交互节点的首问播报
	NodeOutputs *Output `json:"node_outputs,omitempty" xml:"node_outputs,omitempty" require:"true"`
	// 交互节点的新的首问播报
	FirstOutputs []*Output `json:"first_outputs,omitempty" xml:"first_outputs,omitempty" require:"true" type:"Repeated"`
	// 视频首句播报配置
	NodeVideoOutput *Output `json:"node_video_output,omitempty" xml:"node_video_output,omitempty" require:"true"`
	// 视频结束配置
	EndVideoOutput *OutputGroup `json:"end_video_output,omitempty" xml:"end_video_output,omitempty" require:"true"`
}

func (s Node) String() string {
	return tea.Prettify(s)
}

func (s Node) GoString() string {
	return s.String()
}

func (s *Node) SetNodeId(v string) *Node {
	s.NodeId = &v
	return s
}

func (s *Node) SetNodeName(v string) *Node {
	s.NodeName = &v
	return s
}

func (s *Node) SetNodeType(v string) *Node {
	s.NodeType = &v
	return s
}

func (s *Node) SetX(v int64) *Node {
	s.X = &v
	return s
}

func (s *Node) SetY(v int64) *Node {
	s.Y = &v
	return s
}

func (s *Node) SetNodeInfo(v *NodeInfo) *Node {
	s.NodeInfo = v
	return s
}

func (s *Node) SetNodeOutputs(v *Output) *Node {
	s.NodeOutputs = v
	return s
}

func (s *Node) SetFirstOutputs(v []*Output) *Node {
	s.FirstOutputs = v
	return s
}

func (s *Node) SetNodeVideoOutput(v *Output) *Node {
	s.NodeVideoOutput = v
	return s
}

func (s *Node) SetEndVideoOutput(v *OutputGroup) *Node {
	s.EndVideoOutput = v
	return s
}

// 其他统计类数据
type Page struct {
	// 页码
	CurrenyPage *int64 `json:"curreny_page,omitempty" xml:"curreny_page,omitempty" require:"true"`
	// 每页数据个数
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
	// 总页数
	Total *int64 `json:"total,omitempty" xml:"total,omitempty" require:"true"`
}

func (s Page) String() string {
	return tea.Prettify(s)
}

func (s Page) GoString() string {
	return s.String()
}

func (s *Page) SetCurrenyPage(v int64) *Page {
	s.CurrenyPage = &v
	return s
}

func (s *Page) SetPageSize(v int64) *Page {
	s.PageSize = &v
	return s
}

func (s *Page) SetTotal(v int64) *Page {
	s.Total = &v
	return s
}

// 流程详情返回体
type OutboundDialogFlowDetailResponseData struct {
	// 数据库自增id
	Id *int64 `json:"id,omitempty" xml:"id,omitempty"`
	// 前端生成的随机字符串id
	FeId *string `json:"fe_id,omitempty" xml:"fe_id,omitempty" require:"true"`
	// 流程名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 流程当前版本号
	Version *int64 `json:"version,omitempty" xml:"version,omitempty" require:"true"`
	// 流程版本号集合
	Versions []*int64 `json:"versions,omitempty" xml:"versions,omitempty" require:"true" type:"Repeated"`
	// 全局配置
	GlobalConfig *string `json:"global_config,omitempty" xml:"global_config,omitempty" require:"true"`
	// 流程类型
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 暂存code
	TemporaryStorageCode *string `json:"temporary_storage_code,omitempty" xml:"temporary_storage_code,omitempty" require:"true"`
	// 视频播报类型
	FlowInteractiveType *string `json:"flow_interactive_type,omitempty" xml:"flow_interactive_type,omitempty" require:"true"`
	// 流程图边数据
	Edges []*Edge `json:"edges,omitempty" xml:"edges,omitempty" require:"true" type:"Repeated"`
	// 流程图节点数据
	Nodes []*Node `json:"nodes,omitempty" xml:"nodes,omitempty" require:"true" type:"Repeated"`
}

func (s OutboundDialogFlowDetailResponseData) String() string {
	return tea.Prettify(s)
}

func (s OutboundDialogFlowDetailResponseData) GoString() string {
	return s.String()
}

func (s *OutboundDialogFlowDetailResponseData) SetId(v int64) *OutboundDialogFlowDetailResponseData {
	s.Id = &v
	return s
}

func (s *OutboundDialogFlowDetailResponseData) SetFeId(v string) *OutboundDialogFlowDetailResponseData {
	s.FeId = &v
	return s
}

func (s *OutboundDialogFlowDetailResponseData) SetName(v string) *OutboundDialogFlowDetailResponseData {
	s.Name = &v
	return s
}

func (s *OutboundDialogFlowDetailResponseData) SetVersion(v int64) *OutboundDialogFlowDetailResponseData {
	s.Version = &v
	return s
}

func (s *OutboundDialogFlowDetailResponseData) SetVersions(v []*int64) *OutboundDialogFlowDetailResponseData {
	s.Versions = v
	return s
}

func (s *OutboundDialogFlowDetailResponseData) SetGlobalConfig(v string) *OutboundDialogFlowDetailResponseData {
	s.GlobalConfig = &v
	return s
}

func (s *OutboundDialogFlowDetailResponseData) SetType(v string) *OutboundDialogFlowDetailResponseData {
	s.Type = &v
	return s
}

func (s *OutboundDialogFlowDetailResponseData) SetTemporaryStorageCode(v string) *OutboundDialogFlowDetailResponseData {
	s.TemporaryStorageCode = &v
	return s
}

func (s *OutboundDialogFlowDetailResponseData) SetFlowInteractiveType(v string) *OutboundDialogFlowDetailResponseData {
	s.FlowInteractiveType = &v
	return s
}

func (s *OutboundDialogFlowDetailResponseData) SetEdges(v []*Edge) *OutboundDialogFlowDetailResponseData {
	s.Edges = v
	return s
}

func (s *OutboundDialogFlowDetailResponseData) SetNodes(v []*Node) *OutboundDialogFlowDetailResponseData {
	s.Nodes = v
	return s
}

// 收单返回结构体
type OutboundPhoneResponseData struct {
	// 通话唯一ID
	Acid *string `json:"acid,omitempty" xml:"acid,omitempty"`
	// 是否同步
	Asyn *bool `json:"asyn,omitempty" xml:"asyn,omitempty"`
	// 外呼ID
	OutcallRequestId *string `json:"outcall_request_id,omitempty" xml:"outcall_request_id,omitempty"`
	// 外呼DB的ID
	AsynDbId *string `json:"asyn_db_id,omitempty" xml:"asyn_db_id,omitempty"`
}

func (s OutboundPhoneResponseData) String() string {
	return tea.Prettify(s)
}

func (s OutboundPhoneResponseData) GoString() string {
	return s.String()
}

func (s *OutboundPhoneResponseData) SetAcid(v string) *OutboundPhoneResponseData {
	s.Acid = &v
	return s
}

func (s *OutboundPhoneResponseData) SetAsyn(v bool) *OutboundPhoneResponseData {
	s.Asyn = &v
	return s
}

func (s *OutboundPhoneResponseData) SetOutcallRequestId(v string) *OutboundPhoneResponseData {
	s.OutcallRequestId = &v
	return s
}

func (s *OutboundPhoneResponseData) SetAsynDbId(v string) *OutboundPhoneResponseData {
	s.AsynDbId = &v
	return s
}

// 任务列表返回体
type OutboundTaskListResponseData struct {
	// 任务数据库id
	Id *int64 `json:"id,omitempty" xml:"id,omitempty"`
	// 任务名称
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 任务id
	Code *string `json:"code,omitempty" xml:"code,omitempty"`
	// 流程前端id/流程code
	FlowFeld *string `json:"flow_feld,omitempty" xml:"flow_feld,omitempty"`
	// 流程id
	FlowId *int64 `json:"flow_id,omitempty" xml:"flow_id,omitempty"`
	// 流程名称
	FlowName *string `json:"flow_name,omitempty" xml:"flow_name,omitempty"`
	// 流程环境区分
	// PRE——预发
	// PUB——线上
	FlowEnv *string `json:"flow_env,omitempty" xml:"flow_env,omitempty"`
	// 规则id
	RuleId *int64 `json:"rule_id,omitempty" xml:"rule_id,omitempty"`
	// 规则名称
	RuleName *string `json:"rule_name,omitempty" xml:"rule_name,omitempty"`
	// 状态
	// USING-启用
	// UNUSED-不启用
	// DELETED-已删除
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 当前任务版本号
	Version *int64 `json:"version,omitempty" xml:"version,omitempty"`
	// 当前引用流程版本号
	FlowVersion *int64 `json:"flow_version,omitempty" xml:"flow_version,omitempty"`
	// 流程最新的版本号
	FlowLatestVersion *int64 `json:"flow_latest_version,omitempty" xml:"flow_latest_version,omitempty"`
	// 当前引用规则版本号
	RuleVersion *int64 `json:"rule_version,omitempty" xml:"rule_version,omitempty"`
	// 规则最新的版本号
	RuleLatestVersion *int64 `json:"rule_latest_version,omitempty" xml:"rule_latest_version,omitempty"`
	// 任务最新的版本号
	LatestVersion *int64 `json:"latest_version,omitempty" xml:"latest_version,omitempty"`
	// 任务线上版本号
	PubVersion *int64 `json:"pub_version,omitempty" xml:"pub_version,omitempty"`
	// 任务是否在发布流程中
	Publishing *bool `json:"publishing,omitempty" xml:"publishing,omitempty" require:"true"`
}

func (s OutboundTaskListResponseData) String() string {
	return tea.Prettify(s)
}

func (s OutboundTaskListResponseData) GoString() string {
	return s.String()
}

func (s *OutboundTaskListResponseData) SetId(v int64) *OutboundTaskListResponseData {
	s.Id = &v
	return s
}

func (s *OutboundTaskListResponseData) SetName(v string) *OutboundTaskListResponseData {
	s.Name = &v
	return s
}

func (s *OutboundTaskListResponseData) SetCode(v string) *OutboundTaskListResponseData {
	s.Code = &v
	return s
}

func (s *OutboundTaskListResponseData) SetFlowFeld(v string) *OutboundTaskListResponseData {
	s.FlowFeld = &v
	return s
}

func (s *OutboundTaskListResponseData) SetFlowId(v int64) *OutboundTaskListResponseData {
	s.FlowId = &v
	return s
}

func (s *OutboundTaskListResponseData) SetFlowName(v string) *OutboundTaskListResponseData {
	s.FlowName = &v
	return s
}

func (s *OutboundTaskListResponseData) SetFlowEnv(v string) *OutboundTaskListResponseData {
	s.FlowEnv = &v
	return s
}

func (s *OutboundTaskListResponseData) SetRuleId(v int64) *OutboundTaskListResponseData {
	s.RuleId = &v
	return s
}

func (s *OutboundTaskListResponseData) SetRuleName(v string) *OutboundTaskListResponseData {
	s.RuleName = &v
	return s
}

func (s *OutboundTaskListResponseData) SetStatus(v string) *OutboundTaskListResponseData {
	s.Status = &v
	return s
}

func (s *OutboundTaskListResponseData) SetVersion(v int64) *OutboundTaskListResponseData {
	s.Version = &v
	return s
}

func (s *OutboundTaskListResponseData) SetFlowVersion(v int64) *OutboundTaskListResponseData {
	s.FlowVersion = &v
	return s
}

func (s *OutboundTaskListResponseData) SetFlowLatestVersion(v int64) *OutboundTaskListResponseData {
	s.FlowLatestVersion = &v
	return s
}

func (s *OutboundTaskListResponseData) SetRuleVersion(v int64) *OutboundTaskListResponseData {
	s.RuleVersion = &v
	return s
}

func (s *OutboundTaskListResponseData) SetRuleLatestVersion(v int64) *OutboundTaskListResponseData {
	s.RuleLatestVersion = &v
	return s
}

func (s *OutboundTaskListResponseData) SetLatestVersion(v int64) *OutboundTaskListResponseData {
	s.LatestVersion = &v
	return s
}

func (s *OutboundTaskListResponseData) SetPubVersion(v int64) *OutboundTaskListResponseData {
	s.PubVersion = &v
	return s
}

func (s *OutboundTaskListResponseData) SetPublishing(v bool) *OutboundTaskListResponseData {
	s.Publishing = &v
	return s
}

type ImportAntchainAioOutboundPhoneRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 任务ID
	TaskCode *string `json:"task_code,omitempty" xml:"task_code,omitempty" require:"true"`
	// 收单手机号
	UserPhone *string `json:"user_phone,omitempty" xml:"user_phone,omitempty" require:"true"`
	// 用户ID
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty"`
	// 幂等控制参数，可以为空。为空时不进行幂等控
	IdempotenceId *string `json:"idempotence_id,omitempty" xml:"idempotence_id,omitempty"`
	// 业务系统在外呼时传入额外参数,json格式
	BizExtInfo *string `json:"biz_ext_info,omitempty" xml:"biz_ext_info,omitempty"`
	// 计划外呼执行时间时间戳。默认为当前时间。单位毫秒
	OutcallTimestamp *int64 `json:"outcall_timestamp,omitempty" xml:"outcall_timestamp,omitempty"`
	// 计划外呼过期时间戳。 必须填写，一般为当天22:30左右。单位毫秒
	ExpirationTimestamp *int64 `json:"expiration_timestamp,omitempty" xml:"expiration_timestamp,omitempty" require:"true"`
}

func (s ImportAntchainAioOutboundPhoneRequest) String() string {
	return tea.Prettify(s)
}

func (s ImportAntchainAioOutboundPhoneRequest) GoString() string {
	return s.String()
}

func (s *ImportAntchainAioOutboundPhoneRequest) SetAuthToken(v string) *ImportAntchainAioOutboundPhoneRequest {
	s.AuthToken = &v
	return s
}

func (s *ImportAntchainAioOutboundPhoneRequest) SetProductInstanceId(v string) *ImportAntchainAioOutboundPhoneRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ImportAntchainAioOutboundPhoneRequest) SetTaskCode(v string) *ImportAntchainAioOutboundPhoneRequest {
	s.TaskCode = &v
	return s
}

func (s *ImportAntchainAioOutboundPhoneRequest) SetUserPhone(v string) *ImportAntchainAioOutboundPhoneRequest {
	s.UserPhone = &v
	return s
}

func (s *ImportAntchainAioOutboundPhoneRequest) SetUserId(v string) *ImportAntchainAioOutboundPhoneRequest {
	s.UserId = &v
	return s
}

func (s *ImportAntchainAioOutboundPhoneRequest) SetIdempotenceId(v string) *ImportAntchainAioOutboundPhoneRequest {
	s.IdempotenceId = &v
	return s
}

func (s *ImportAntchainAioOutboundPhoneRequest) SetBizExtInfo(v string) *ImportAntchainAioOutboundPhoneRequest {
	s.BizExtInfo = &v
	return s
}

func (s *ImportAntchainAioOutboundPhoneRequest) SetOutcallTimestamp(v int64) *ImportAntchainAioOutboundPhoneRequest {
	s.OutcallTimestamp = &v
	return s
}

func (s *ImportAntchainAioOutboundPhoneRequest) SetExpirationTimestamp(v int64) *ImportAntchainAioOutboundPhoneRequest {
	s.ExpirationTimestamp = &v
	return s
}

type ImportAntchainAioOutboundPhoneResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 返回结果
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
	// 返回码
	Code *string `json:"code,omitempty" xml:"code,omitempty"`
	// 描述
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 内容
	Data *OutboundPhoneResponseData `json:"data,omitempty" xml:"data,omitempty"`
}

func (s ImportAntchainAioOutboundPhoneResponse) String() string {
	return tea.Prettify(s)
}

func (s ImportAntchainAioOutboundPhoneResponse) GoString() string {
	return s.String()
}

func (s *ImportAntchainAioOutboundPhoneResponse) SetReqMsgId(v string) *ImportAntchainAioOutboundPhoneResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ImportAntchainAioOutboundPhoneResponse) SetResultCode(v string) *ImportAntchainAioOutboundPhoneResponse {
	s.ResultCode = &v
	return s
}

func (s *ImportAntchainAioOutboundPhoneResponse) SetResultMsg(v string) *ImportAntchainAioOutboundPhoneResponse {
	s.ResultMsg = &v
	return s
}

func (s *ImportAntchainAioOutboundPhoneResponse) SetSuccess(v bool) *ImportAntchainAioOutboundPhoneResponse {
	s.Success = &v
	return s
}

func (s *ImportAntchainAioOutboundPhoneResponse) SetCode(v string) *ImportAntchainAioOutboundPhoneResponse {
	s.Code = &v
	return s
}

func (s *ImportAntchainAioOutboundPhoneResponse) SetMessage(v string) *ImportAntchainAioOutboundPhoneResponse {
	s.Message = &v
	return s
}

func (s *ImportAntchainAioOutboundPhoneResponse) SetData(v *OutboundPhoneResponseData) *ImportAntchainAioOutboundPhoneResponse {
	s.Data = v
	return s
}

type QueryAntchainAioOutboundTaskRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 任务名称
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 外呼流程id
	FlowId *int64 `json:"flow_id,omitempty" xml:"flow_id,omitempty"`
	// 环境区分
	Env *string `json:"env,omitempty" xml:"env,omitempty" require:"true"`
	// 与env对应
	LdcName *string `json:"ldc_name,omitempty" xml:"ldc_name,omitempty" require:"true"`
	// 根据状态过滤数据
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 租户id
	TntInstId *string `json:"tnt_inst_id,omitempty" xml:"tnt_inst_id,omitempty" require:"true"`
	// 业务id
	BizCode *string `json:"biz_code,omitempty" xml:"biz_code,omitempty" require:"true"`
	// 当前页码
	CurrentPage *int64 `json:"current_page,omitempty" xml:"current_page,omitempty" require:"true"`
	// 每页数据个数
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
}

func (s QueryAntchainAioOutboundTaskRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAntchainAioOutboundTaskRequest) GoString() string {
	return s.String()
}

func (s *QueryAntchainAioOutboundTaskRequest) SetAuthToken(v string) *QueryAntchainAioOutboundTaskRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAntchainAioOutboundTaskRequest) SetProductInstanceId(v string) *QueryAntchainAioOutboundTaskRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAntchainAioOutboundTaskRequest) SetName(v string) *QueryAntchainAioOutboundTaskRequest {
	s.Name = &v
	return s
}

func (s *QueryAntchainAioOutboundTaskRequest) SetFlowId(v int64) *QueryAntchainAioOutboundTaskRequest {
	s.FlowId = &v
	return s
}

func (s *QueryAntchainAioOutboundTaskRequest) SetEnv(v string) *QueryAntchainAioOutboundTaskRequest {
	s.Env = &v
	return s
}

func (s *QueryAntchainAioOutboundTaskRequest) SetLdcName(v string) *QueryAntchainAioOutboundTaskRequest {
	s.LdcName = &v
	return s
}

func (s *QueryAntchainAioOutboundTaskRequest) SetStatus(v string) *QueryAntchainAioOutboundTaskRequest {
	s.Status = &v
	return s
}

func (s *QueryAntchainAioOutboundTaskRequest) SetTntInstId(v string) *QueryAntchainAioOutboundTaskRequest {
	s.TntInstId = &v
	return s
}

func (s *QueryAntchainAioOutboundTaskRequest) SetBizCode(v string) *QueryAntchainAioOutboundTaskRequest {
	s.BizCode = &v
	return s
}

func (s *QueryAntchainAioOutboundTaskRequest) SetCurrentPage(v int64) *QueryAntchainAioOutboundTaskRequest {
	s.CurrentPage = &v
	return s
}

func (s *QueryAntchainAioOutboundTaskRequest) SetPageSize(v int64) *QueryAntchainAioOutboundTaskRequest {
	s.PageSize = &v
	return s
}

type QueryAntchainAioOutboundTaskResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 请求是否成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
	// 请求结果说明
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 接口业务数据
	Data []*OutboundTaskListResponseData `json:"data,omitempty" xml:"data,omitempty" type:"Repeated"`
	// 其他统计类数据
	Stat *Page `json:"stat,omitempty" xml:"stat,omitempty"`
}

func (s QueryAntchainAioOutboundTaskResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAntchainAioOutboundTaskResponse) GoString() string {
	return s.String()
}

func (s *QueryAntchainAioOutboundTaskResponse) SetReqMsgId(v string) *QueryAntchainAioOutboundTaskResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAntchainAioOutboundTaskResponse) SetResultCode(v string) *QueryAntchainAioOutboundTaskResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAntchainAioOutboundTaskResponse) SetResultMsg(v string) *QueryAntchainAioOutboundTaskResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAntchainAioOutboundTaskResponse) SetSuccess(v bool) *QueryAntchainAioOutboundTaskResponse {
	s.Success = &v
	return s
}

func (s *QueryAntchainAioOutboundTaskResponse) SetMessage(v string) *QueryAntchainAioOutboundTaskResponse {
	s.Message = &v
	return s
}

func (s *QueryAntchainAioOutboundTaskResponse) SetData(v []*OutboundTaskListResponseData) *QueryAntchainAioOutboundTaskResponse {
	s.Data = v
	return s
}

func (s *QueryAntchainAioOutboundTaskResponse) SetStat(v *Page) *QueryAntchainAioOutboundTaskResponse {
	s.Stat = v
	return s
}

type QueryAntchainAioOutboundDialogflowRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 任务id
	Id *int64 `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 租户id
	TntInstId *string `json:"tnt_inst_id,omitempty" xml:"tnt_inst_id,omitempty" require:"true"`
	// 业务id
	BizCode *string `json:"biz_code,omitempty" xml:"biz_code,omitempty" require:"true"`
}

func (s QueryAntchainAioOutboundDialogflowRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAntchainAioOutboundDialogflowRequest) GoString() string {
	return s.String()
}

func (s *QueryAntchainAioOutboundDialogflowRequest) SetAuthToken(v string) *QueryAntchainAioOutboundDialogflowRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAntchainAioOutboundDialogflowRequest) SetProductInstanceId(v string) *QueryAntchainAioOutboundDialogflowRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAntchainAioOutboundDialogflowRequest) SetId(v int64) *QueryAntchainAioOutboundDialogflowRequest {
	s.Id = &v
	return s
}

func (s *QueryAntchainAioOutboundDialogflowRequest) SetTntInstId(v string) *QueryAntchainAioOutboundDialogflowRequest {
	s.TntInstId = &v
	return s
}

func (s *QueryAntchainAioOutboundDialogflowRequest) SetBizCode(v string) *QueryAntchainAioOutboundDialogflowRequest {
	s.BizCode = &v
	return s
}

type QueryAntchainAioOutboundDialogflowResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 请求是否成功
	//
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
	// 请求结果说明
	//
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 接口业务数据
	//
	Data *OutboundDialogFlowDetailResponseData `json:"data,omitempty" xml:"data,omitempty"`
	// traceId
	TraceId *string `json:"trace_id,omitempty" xml:"trace_id,omitempty"`
}

func (s QueryAntchainAioOutboundDialogflowResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAntchainAioOutboundDialogflowResponse) GoString() string {
	return s.String()
}

func (s *QueryAntchainAioOutboundDialogflowResponse) SetReqMsgId(v string) *QueryAntchainAioOutboundDialogflowResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAntchainAioOutboundDialogflowResponse) SetResultCode(v string) *QueryAntchainAioOutboundDialogflowResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAntchainAioOutboundDialogflowResponse) SetResultMsg(v string) *QueryAntchainAioOutboundDialogflowResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAntchainAioOutboundDialogflowResponse) SetSuccess(v bool) *QueryAntchainAioOutboundDialogflowResponse {
	s.Success = &v
	return s
}

func (s *QueryAntchainAioOutboundDialogflowResponse) SetMessage(v string) *QueryAntchainAioOutboundDialogflowResponse {
	s.Message = &v
	return s
}

func (s *QueryAntchainAioOutboundDialogflowResponse) SetData(v *OutboundDialogFlowDetailResponseData) *QueryAntchainAioOutboundDialogflowResponse {
	s.Data = v
	return s
}

func (s *QueryAntchainAioOutboundDialogflowResponse) SetTraceId(v string) *QueryAntchainAioOutboundDialogflowResponse {
	s.TraceId = &v
	return s
}

type QueryAntchainAioOutboundRecordurlRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户id
	TntInstId *string `json:"tnt_inst_id,omitempty" xml:"tnt_inst_id,omitempty" require:"true"`
	// 业务code
	BizCode *string `json:"biz_code,omitempty" xml:"biz_code,omitempty" require:"true"`
	// acid
	Acid *string `json:"acid,omitempty" xml:"acid,omitempty"`
	// callRequestId
	CallRequestId *string `json:"call_request_id,omitempty" xml:"call_request_id,omitempty"`
}

func (s QueryAntchainAioOutboundRecordurlRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAntchainAioOutboundRecordurlRequest) GoString() string {
	return s.String()
}

func (s *QueryAntchainAioOutboundRecordurlRequest) SetAuthToken(v string) *QueryAntchainAioOutboundRecordurlRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAntchainAioOutboundRecordurlRequest) SetProductInstanceId(v string) *QueryAntchainAioOutboundRecordurlRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAntchainAioOutboundRecordurlRequest) SetTntInstId(v string) *QueryAntchainAioOutboundRecordurlRequest {
	s.TntInstId = &v
	return s
}

func (s *QueryAntchainAioOutboundRecordurlRequest) SetBizCode(v string) *QueryAntchainAioOutboundRecordurlRequest {
	s.BizCode = &v
	return s
}

func (s *QueryAntchainAioOutboundRecordurlRequest) SetAcid(v string) *QueryAntchainAioOutboundRecordurlRequest {
	s.Acid = &v
	return s
}

func (s *QueryAntchainAioOutboundRecordurlRequest) SetCallRequestId(v string) *QueryAntchainAioOutboundRecordurlRequest {
	s.CallRequestId = &v
	return s
}

type QueryAntchainAioOutboundRecordurlResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 请求是否成功
	//
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
	// 请求结果说明
	//
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 录音下载地址
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QueryAntchainAioOutboundRecordurlResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAntchainAioOutboundRecordurlResponse) GoString() string {
	return s.String()
}

func (s *QueryAntchainAioOutboundRecordurlResponse) SetReqMsgId(v string) *QueryAntchainAioOutboundRecordurlResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAntchainAioOutboundRecordurlResponse) SetResultCode(v string) *QueryAntchainAioOutboundRecordurlResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAntchainAioOutboundRecordurlResponse) SetResultMsg(v string) *QueryAntchainAioOutboundRecordurlResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAntchainAioOutboundRecordurlResponse) SetSuccess(v bool) *QueryAntchainAioOutboundRecordurlResponse {
	s.Success = &v
	return s
}

func (s *QueryAntchainAioOutboundRecordurlResponse) SetMessage(v string) *QueryAntchainAioOutboundRecordurlResponse {
	s.Message = &v
	return s
}

func (s *QueryAntchainAioOutboundRecordurlResponse) SetData(v string) *QueryAntchainAioOutboundRecordurlResponse {
	s.Data = &v
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
				"_prod_code":       tea.String("ak_a050edd0f07344eabd879166e7187ce5"),
				"_prod_channel":    tea.String("saas"),
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
 * Description: 外呼收单接口
 * Summary: 外呼收单接口
 */
func (client *Client) ImportAntchainAioOutboundPhone(request *ImportAntchainAioOutboundPhoneRequest) (_result *ImportAntchainAioOutboundPhoneResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ImportAntchainAioOutboundPhoneResponse{}
	_body, _err := client.ImportAntchainAioOutboundPhoneEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 外呼收单接口
 * Summary: 外呼收单接口
 */
func (client *Client) ImportAntchainAioOutboundPhoneEx(request *ImportAntchainAioOutboundPhoneRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ImportAntchainAioOutboundPhoneResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ImportAntchainAioOutboundPhoneResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.aio.outbound.phone.import"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 任务列表接口
 * Summary: 任务列表接口
 */
func (client *Client) QueryAntchainAioOutboundTask(request *QueryAntchainAioOutboundTaskRequest) (_result *QueryAntchainAioOutboundTaskResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAntchainAioOutboundTaskResponse{}
	_body, _err := client.QueryAntchainAioOutboundTaskEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 任务列表接口
 * Summary: 任务列表接口
 */
func (client *Client) QueryAntchainAioOutboundTaskEx(request *QueryAntchainAioOutboundTaskRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAntchainAioOutboundTaskResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAntchainAioOutboundTaskResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.aio.outbound.task.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 话术详情
 * Summary: 话术详情
 */
func (client *Client) QueryAntchainAioOutboundDialogflow(request *QueryAntchainAioOutboundDialogflowRequest) (_result *QueryAntchainAioOutboundDialogflowResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAntchainAioOutboundDialogflowResponse{}
	_body, _err := client.QueryAntchainAioOutboundDialogflowEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 话术详情
 * Summary: 话术详情
 */
func (client *Client) QueryAntchainAioOutboundDialogflowEx(request *QueryAntchainAioOutboundDialogflowRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAntchainAioOutboundDialogflowResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAntchainAioOutboundDialogflowResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.aio.outbound.dialogflow.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 录音下载
 * Summary: 录音下载接口
 */
func (client *Client) QueryAntchainAioOutboundRecordurl(request *QueryAntchainAioOutboundRecordurlRequest) (_result *QueryAntchainAioOutboundRecordurlResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAntchainAioOutboundRecordurlResponse{}
	_body, _err := client.QueryAntchainAioOutboundRecordurlEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 录音下载
 * Summary: 录音下载接口
 */
func (client *Client) QueryAntchainAioOutboundRecordurlEx(request *QueryAntchainAioOutboundRecordurlRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAntchainAioOutboundRecordurlResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAntchainAioOutboundRecordurlResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antchain.aio.outbound.recordurl.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
