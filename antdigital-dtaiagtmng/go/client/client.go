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

// Agent对话-对应的工具/工作流参数列表
type ToolOptionParam struct {
	// 参数名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 参数code
	Code *string `json:"code,omitempty" xml:"code,omitempty" require:"true"`
	// 参数描述
	Desc *string `json:"desc,omitempty" xml:"desc,omitempty" require:"true"`
	// 参数值
	Value *string `json:"value,omitempty" xml:"value,omitempty" require:"true"`
}

func (s ToolOptionParam) String() string {
	return tea.Prettify(s)
}

func (s ToolOptionParam) GoString() string {
	return s.String()
}

func (s *ToolOptionParam) SetName(v string) *ToolOptionParam {
	s.Name = &v
	return s
}

func (s *ToolOptionParam) SetCode(v string) *ToolOptionParam {
	s.Code = &v
	return s
}

func (s *ToolOptionParam) SetDesc(v string) *ToolOptionParam {
	s.Desc = &v
	return s
}

func (s *ToolOptionParam) SetValue(v string) *ToolOptionParam {
	s.Value = &v
	return s
}

// 对话界面思维链显示标题结构
type ThoughtChainDisplay struct {
	// 思维链显示状态
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 思维链显示名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 思维链类型
	SubType *string `json:"sub_type,omitempty" xml:"sub_type,omitempty" require:"true"`
	// 思维链图标
	Icon *string `json:"icon,omitempty" xml:"icon,omitempty" require:"true"`
	// 思维链模块额外信息
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty" require:"true"`
}

func (s ThoughtChainDisplay) String() string {
	return tea.Prettify(s)
}

func (s ThoughtChainDisplay) GoString() string {
	return s.String()
}

func (s *ThoughtChainDisplay) SetStatus(v string) *ThoughtChainDisplay {
	s.Status = &v
	return s
}

func (s *ThoughtChainDisplay) SetName(v string) *ThoughtChainDisplay {
	s.Name = &v
	return s
}

func (s *ThoughtChainDisplay) SetSubType(v string) *ThoughtChainDisplay {
	s.SubType = &v
	return s
}

func (s *ThoughtChainDisplay) SetIcon(v string) *ThoughtChainDisplay {
	s.Icon = &v
	return s
}

func (s *ThoughtChainDisplay) SetResultMsg(v string) *ThoughtChainDisplay {
	s.ResultMsg = &v
	return s
}

// Agent对话详情-思维链-内容
type ThoughtChainContent struct {
	// id
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// source
	Source *string `json:"source,omitempty" xml:"source,omitempty" require:"true"`
	// children
	Children *string `json:"children,omitempty" xml:"children,omitempty" require:"true"`
	// timeConsuming
	TimeConsuming *string `json:"time_consuming,omitempty" xml:"time_consuming,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// timeConsumingEpoch
	TimeConsumingEpoch *int64 `json:"time_consuming_epoch,omitempty" xml:"time_consuming_epoch,omitempty" require:"true"`
	// latency
	Latency *int64 `json:"latency,omitempty" xml:"latency,omitempty" require:"true"`
	// type
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
}

func (s ThoughtChainContent) String() string {
	return tea.Prettify(s)
}

func (s ThoughtChainContent) GoString() string {
	return s.String()
}

func (s *ThoughtChainContent) SetId(v string) *ThoughtChainContent {
	s.Id = &v
	return s
}

func (s *ThoughtChainContent) SetSource(v string) *ThoughtChainContent {
	s.Source = &v
	return s
}

func (s *ThoughtChainContent) SetChildren(v string) *ThoughtChainContent {
	s.Children = &v
	return s
}

func (s *ThoughtChainContent) SetTimeConsuming(v string) *ThoughtChainContent {
	s.TimeConsuming = &v
	return s
}

func (s *ThoughtChainContent) SetTimeConsumingEpoch(v int64) *ThoughtChainContent {
	s.TimeConsumingEpoch = &v
	return s
}

func (s *ThoughtChainContent) SetLatency(v int64) *ThoughtChainContent {
	s.Latency = &v
	return s
}

func (s *ThoughtChainContent) SetType(v string) *ThoughtChainContent {
	s.Type = &v
	return s
}

// Agent对话-记忆参数列表
//
type AgentVariable struct {
	// 变量对应的id
	Id *int64 `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 变量名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 变量code
	Code *string `json:"code,omitempty" xml:"code,omitempty" require:"true"`
	// 变量描述
	Desc *string `json:"desc,omitempty" xml:"desc,omitempty" require:"true"`
	// 变量值
	Value *string `json:"value,omitempty" xml:"value,omitempty" require:"true"`
	// 变量值更新时间
	UpdateTime *string `json:"update_time,omitempty" xml:"update_time,omitempty" require:"true"`
	// "business", "业务参数"
	// "memory", "记忆参数"
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 是否模型可见
	ShowToModel *bool `json:"show_to_model,omitempty" xml:"show_to_model,omitempty" require:"true"`
}

func (s AgentVariable) String() string {
	return tea.Prettify(s)
}

func (s AgentVariable) GoString() string {
	return s.String()
}

func (s *AgentVariable) SetId(v int64) *AgentVariable {
	s.Id = &v
	return s
}

func (s *AgentVariable) SetName(v string) *AgentVariable {
	s.Name = &v
	return s
}

func (s *AgentVariable) SetCode(v string) *AgentVariable {
	s.Code = &v
	return s
}

func (s *AgentVariable) SetDesc(v string) *AgentVariable {
	s.Desc = &v
	return s
}

func (s *AgentVariable) SetValue(v string) *AgentVariable {
	s.Value = &v
	return s
}

func (s *AgentVariable) SetUpdateTime(v string) *AgentVariable {
	s.UpdateTime = &v
	return s
}

func (s *AgentVariable) SetType(v string) *AgentVariable {
	s.Type = &v
	return s
}

func (s *AgentVariable) SetShowToModel(v bool) *AgentVariable {
	s.ShowToModel = &v
	return s
}

// Agent对话-引用工具/工作流列表
type ToolOptionInfo struct {
	// plugin = 工具；workflow = 工作流
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 对应的工具/工作流名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 对应的工具/工作流名称
	Code *string `json:"code,omitempty" xml:"code,omitempty" require:"true"`
	// 对应的工具/工作流参数列表
	Params []*ToolOptionParam `json:"params,omitempty" xml:"params,omitempty" require:"true" type:"Repeated"`
}

func (s ToolOptionInfo) String() string {
	return tea.Prettify(s)
}

func (s ToolOptionInfo) GoString() string {
	return s.String()
}

func (s *ToolOptionInfo) SetType(v string) *ToolOptionInfo {
	s.Type = &v
	return s
}

func (s *ToolOptionInfo) SetName(v string) *ToolOptionInfo {
	s.Name = &v
	return s
}

func (s *ToolOptionInfo) SetCode(v string) *ToolOptionInfo {
	s.Code = &v
	return s
}

func (s *ToolOptionInfo) SetParams(v []*ToolOptionParam) *ToolOptionInfo {
	s.Params = v
	return s
}

// Agent对话详情-思维链信息详情列表
type ThoughtChainDisplayUnit struct {
	// 思维链模块id
	//
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 思维链模块状态：success or fail
	//
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 思维链模块额外信息
	//
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty" require:"true"`
	// 思维链模块耗时
	//
	Latency *int64 `json:"latency,omitempty" xml:"latency,omitempty" require:"true"`
	// 思维链模块时间戳 (思维链本身的时间戳)
	//
	Timestamp *int64 `json:"timestamp,omitempty" xml:"timestamp,omitempty" require:"true"`
	// 思维链对应操作开始执行时间戳 (optional)
	//
	StartTimestamp *int64 `json:"start_timestamp,omitempty" xml:"start_timestamp,omitempty" require:"true"`
	// 思维链对应操作开始输出时间戳 (optional)
	//
	OutputTimestamp *int64 `json:"output_timestamp,omitempty" xml:"output_timestamp,omitempty" require:"true"`
	// 思维链对应操作结束执行时间戳 (optional)
	//
	EndTimestamp *int64 `json:"end_timestamp,omitempty" xml:"end_timestamp,omitempty" require:"true"`
	// 思维链对应过程总模型token耗费 (optional)
	//
	TokenCost *int64 `json:"token_cost,omitempty" xml:"token_cost,omitempty" require:"true"`
	// 思维链对应过程输入模型token耗费 (optional)
	//
	InputTokenCost *int64 `json:"input_token_cost,omitempty" xml:"input_token_cost,omitempty" require:"true"`
	// 思维链对应过程输出模型token耗费 (optional)
	//
	OutputTokenCost *int64 `json:"output_token_cost,omitempty" xml:"output_token_cost,omitempty" require:"true"`
	// 思维链模块显示名称
	//
	DisplayName *string `json:"display_name,omitempty" xml:"display_name,omitempty" require:"true"`
	// 思维链模块是否为进行中阶段的输出
	//
	IsRunning *bool `json:"is_running,omitempty" xml:"is_running,omitempty" require:"true"`
	// 思维链模块类型：DECISION or GENERATE
	//
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 思维链模块子类型：content_search 知识查询 / llm 大模型 / tool 工具 / workflow 工作流 / end 结束 / parameter 参数处理
	//
	SubType *string `json:"sub_type,omitempty" xml:"sub_type,omitempty" require:"true"`
	// 思维链模块子类型关联id。如果是工具，那就是 platform_api_plugin 表的 id；如果是工作流，那就是 platform_intent 表的 id
	//
	RefResourceId *int64 `json:"ref_resource_id,omitempty" xml:"ref_resource_id,omitempty" require:"true"`
	// 思维链模块子类型关联code，一般是工具或工作流类型对应的code
	//
	RefResourceCode *string `json:"ref_resource_code,omitempty" xml:"ref_resource_code,omitempty" require:"true"`
	// 思维链模块子类型关联图标
	//
	RefResourceIcon *string `json:"ref_resource_icon,omitempty" xml:"ref_resource_icon,omitempty" require:"true"`
	// 思维链模块子类型为工作流时的版本，仅当子类型为工作流时赋值
	//
	RefWorkflowBuildVersion *string `json:"ref_workflow_build_version,omitempty" xml:"ref_workflow_build_version,omitempty" require:"true"`
	// 思维链模块子类型为工作流时的运行实例id，仅当子类型为工作流且 refWorkflowBuildVersion 以 NEW 开头时赋值
	//
	RefWorkflowRuntimeInstanceId *string `json:"ref_workflow_runtime_instance_id,omitempty" xml:"ref_workflow_runtime_instance_id,omitempty" require:"true"`
	// 思维链模块入参信息，JSON字符串格式
	//
	InputJsonString *string `json:"input_json_string,omitempty" xml:"input_json_string,omitempty" require:"true"`
	// 思维链模块出参信息，JSON字符串格式
	//
	OutputJsonString *string `json:"output_json_string,omitempty" xml:"output_json_string,omitempty" require:"true"`
	// 思维链模块额外消息信息 (如内置工具过程展现内容)，JSON字符串格式
	//
	ExtraInfoJsonString *string `json:"extra_info_json_string,omitempty" xml:"extra_info_json_string,omitempty" require:"true"`
}

func (s ThoughtChainDisplayUnit) String() string {
	return tea.Prettify(s)
}

func (s ThoughtChainDisplayUnit) GoString() string {
	return s.String()
}

func (s *ThoughtChainDisplayUnit) SetId(v string) *ThoughtChainDisplayUnit {
	s.Id = &v
	return s
}

func (s *ThoughtChainDisplayUnit) SetStatus(v string) *ThoughtChainDisplayUnit {
	s.Status = &v
	return s
}

func (s *ThoughtChainDisplayUnit) SetResultMsg(v string) *ThoughtChainDisplayUnit {
	s.ResultMsg = &v
	return s
}

func (s *ThoughtChainDisplayUnit) SetLatency(v int64) *ThoughtChainDisplayUnit {
	s.Latency = &v
	return s
}

func (s *ThoughtChainDisplayUnit) SetTimestamp(v int64) *ThoughtChainDisplayUnit {
	s.Timestamp = &v
	return s
}

func (s *ThoughtChainDisplayUnit) SetStartTimestamp(v int64) *ThoughtChainDisplayUnit {
	s.StartTimestamp = &v
	return s
}

func (s *ThoughtChainDisplayUnit) SetOutputTimestamp(v int64) *ThoughtChainDisplayUnit {
	s.OutputTimestamp = &v
	return s
}

func (s *ThoughtChainDisplayUnit) SetEndTimestamp(v int64) *ThoughtChainDisplayUnit {
	s.EndTimestamp = &v
	return s
}

func (s *ThoughtChainDisplayUnit) SetTokenCost(v int64) *ThoughtChainDisplayUnit {
	s.TokenCost = &v
	return s
}

func (s *ThoughtChainDisplayUnit) SetInputTokenCost(v int64) *ThoughtChainDisplayUnit {
	s.InputTokenCost = &v
	return s
}

func (s *ThoughtChainDisplayUnit) SetOutputTokenCost(v int64) *ThoughtChainDisplayUnit {
	s.OutputTokenCost = &v
	return s
}

func (s *ThoughtChainDisplayUnit) SetDisplayName(v string) *ThoughtChainDisplayUnit {
	s.DisplayName = &v
	return s
}

func (s *ThoughtChainDisplayUnit) SetIsRunning(v bool) *ThoughtChainDisplayUnit {
	s.IsRunning = &v
	return s
}

func (s *ThoughtChainDisplayUnit) SetType(v string) *ThoughtChainDisplayUnit {
	s.Type = &v
	return s
}

func (s *ThoughtChainDisplayUnit) SetSubType(v string) *ThoughtChainDisplayUnit {
	s.SubType = &v
	return s
}

func (s *ThoughtChainDisplayUnit) SetRefResourceId(v int64) *ThoughtChainDisplayUnit {
	s.RefResourceId = &v
	return s
}

func (s *ThoughtChainDisplayUnit) SetRefResourceCode(v string) *ThoughtChainDisplayUnit {
	s.RefResourceCode = &v
	return s
}

func (s *ThoughtChainDisplayUnit) SetRefResourceIcon(v string) *ThoughtChainDisplayUnit {
	s.RefResourceIcon = &v
	return s
}

func (s *ThoughtChainDisplayUnit) SetRefWorkflowBuildVersion(v string) *ThoughtChainDisplayUnit {
	s.RefWorkflowBuildVersion = &v
	return s
}

func (s *ThoughtChainDisplayUnit) SetRefWorkflowRuntimeInstanceId(v string) *ThoughtChainDisplayUnit {
	s.RefWorkflowRuntimeInstanceId = &v
	return s
}

func (s *ThoughtChainDisplayUnit) SetInputJsonString(v string) *ThoughtChainDisplayUnit {
	s.InputJsonString = &v
	return s
}

func (s *ThoughtChainDisplayUnit) SetOutputJsonString(v string) *ThoughtChainDisplayUnit {
	s.OutputJsonString = &v
	return s
}

func (s *ThoughtChainDisplayUnit) SetExtraInfoJsonString(v string) *ThoughtChainDisplayUnit {
	s.ExtraInfoJsonString = &v
	return s
}

// 文件附件信息
type AttachFile struct {
	// 文件Id
	//
	FileId *string `json:"file_id,omitempty" xml:"file_id,omitempty" require:"true"`
	// 文件名称
	//
	FileName *string `json:"file_name,omitempty" xml:"file_name,omitempty" require:"true"`
	// 文件类型
	//
	FileType *string `json:"file_type,omitempty" xml:"file_type,omitempty" require:"true"`
	// 文件来源
	//
	FileSource *string `json:"file_source,omitempty" xml:"file_source,omitempty" require:"true"`
	// 文件链接
	//
	FileUrl *string `json:"file_url,omitempty" xml:"file_url,omitempty" require:"true"`
	// 文件总结
	//
	FileSummary *string `json:"file_summary,omitempty" xml:"file_summary,omitempty" require:"true"`
	// 上传时间
	//
	OperateTime *string `json:"operate_time,omitempty" xml:"operate_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// Map<String, String>	扩展信息
	//
	ExtInfo *string `json:"ext_info,omitempty" xml:"ext_info,omitempty" require:"true"`
	// 文件大小
	//
	FileSize *string `json:"file_size,omitempty" xml:"file_size,omitempty" require:"true"`
	// 内容库 dbId, 用于检索
	//
	ContentId *string `json:"content_id,omitempty" xml:"content_id,omitempty" require:"true"`
}

func (s AttachFile) String() string {
	return tea.Prettify(s)
}

func (s AttachFile) GoString() string {
	return s.String()
}

func (s *AttachFile) SetFileId(v string) *AttachFile {
	s.FileId = &v
	return s
}

func (s *AttachFile) SetFileName(v string) *AttachFile {
	s.FileName = &v
	return s
}

func (s *AttachFile) SetFileType(v string) *AttachFile {
	s.FileType = &v
	return s
}

func (s *AttachFile) SetFileSource(v string) *AttachFile {
	s.FileSource = &v
	return s
}

func (s *AttachFile) SetFileUrl(v string) *AttachFile {
	s.FileUrl = &v
	return s
}

func (s *AttachFile) SetFileSummary(v string) *AttachFile {
	s.FileSummary = &v
	return s
}

func (s *AttachFile) SetOperateTime(v string) *AttachFile {
	s.OperateTime = &v
	return s
}

func (s *AttachFile) SetExtInfo(v string) *AttachFile {
	s.ExtInfo = &v
	return s
}

func (s *AttachFile) SetFileSize(v string) *AttachFile {
	s.FileSize = &v
	return s
}

func (s *AttachFile) SetContentId(v string) *AttachFile {
	s.ContentId = &v
	return s
}

// 卡片/模版类型：行动点列表
type TemplateAction struct {
	// name
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
}

func (s TemplateAction) String() string {
	return tea.Prettify(s)
}

func (s TemplateAction) GoString() string {
	return s.String()
}

func (s *TemplateAction) SetName(v string) *TemplateAction {
	s.Name = &v
	return s
}

// Agent 运行思维链
type ThoughtChainInfo struct {
	// 思维链id
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// "success" | "error" | "loading" | "abort" | "done"
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// 内容
	Content []*ThoughtChainContent `json:"content,omitempty" xml:"content,omitempty" require:"true" type:"Repeated"`
}

func (s ThoughtChainInfo) String() string {
	return tea.Prettify(s)
}

func (s ThoughtChainInfo) GoString() string {
	return s.String()
}

func (s *ThoughtChainInfo) SetId(v string) *ThoughtChainInfo {
	s.Id = &v
	return s
}

func (s *ThoughtChainInfo) SetStatus(v string) *ThoughtChainInfo {
	s.Status = &v
	return s
}

func (s *ThoughtChainInfo) SetContent(v []*ThoughtChainContent) *ThoughtChainInfo {
	s.Content = v
	return s
}

// Agent 运行相关信息
type AgentChatLogInfo struct {
	// 记忆参数列表
	//
	ContextVariableList []*AgentVariable `json:"context_variable_list,omitempty" xml:"context_variable_list,omitempty" require:"true" type:"Repeated"`
	// 引用工具/工作流列表
	//
	ToolOptionList []*ToolOptionInfo `json:"tool_option_list,omitempty" xml:"tool_option_list,omitempty" require:"true" type:"Repeated"`
	// 对话界面思维链显示标题结构
	ThoughtChainDisplay *ThoughtChainDisplay `json:"thought_chain_display,omitempty" xml:"thought_chain_display,omitempty" require:"true"`
	// 思维链信息详情列表
	//
	ThoughtChainDisplayUnitList []*ThoughtChainDisplayUnit `json:"thought_chain_display_unit_list,omitempty" xml:"thought_chain_display_unit_list,omitempty" require:"true" type:"Repeated"`
	// 该思维链有回答环节
	//
	HasResponseType *bool `json:"has_response_type,omitempty" xml:"has_response_type,omitempty" require:"true"`
}

func (s AgentChatLogInfo) String() string {
	return tea.Prettify(s)
}

func (s AgentChatLogInfo) GoString() string {
	return s.String()
}

func (s *AgentChatLogInfo) SetContextVariableList(v []*AgentVariable) *AgentChatLogInfo {
	s.ContextVariableList = v
	return s
}

func (s *AgentChatLogInfo) SetToolOptionList(v []*ToolOptionInfo) *AgentChatLogInfo {
	s.ToolOptionList = v
	return s
}

func (s *AgentChatLogInfo) SetThoughtChainDisplay(v *ThoughtChainDisplay) *AgentChatLogInfo {
	s.ThoughtChainDisplay = v
	return s
}

func (s *AgentChatLogInfo) SetThoughtChainDisplayUnitList(v []*ThoughtChainDisplayUnit) *AgentChatLogInfo {
	s.ThoughtChainDisplayUnitList = v
	return s
}

func (s *AgentChatLogInfo) SetHasResponseType(v bool) *AgentChatLogInfo {
	s.HasResponseType = &v
	return s
}

// Agent详情 --> 隶属multi-agent的sub agents --> edges 信息
type MultiAgentEdge struct {
	// edge 指向的下个agent instance id
	//
	NextInstanceId *string `json:"next_instance_id,omitempty" xml:"next_instance_id,omitempty" require:"true"`
	// 跳到next agent的prompt
	//
	Prompt *string `json:"prompt,omitempty" xml:"prompt,omitempty" require:"true"`
}

func (s MultiAgentEdge) String() string {
	return tea.Prettify(s)
}

func (s MultiAgentEdge) GoString() string {
	return s.String()
}

func (s *MultiAgentEdge) SetNextInstanceId(v string) *MultiAgentEdge {
	s.NextInstanceId = &v
	return s
}

func (s *MultiAgentEdge) SetPrompt(v string) *MultiAgentEdge {
	s.Prompt = &v
	return s
}

// Agent对话详情-文档类型：文档参考片段列表
type DocumentReferenceInfo struct {
	// title
	Title *string `json:"title,omitempty" xml:"title,omitempty" require:"true"`
	// address
	Address *string `json:"address,omitempty" xml:"address,omitempty" require:"true"`
	// score 浮点类型
	Score *string `json:"score,omitempty" xml:"score,omitempty" require:"true"`
	// content
	Content *string `json:"content,omitempty" xml:"content,omitempty" require:"true"`
	// type	SearchSceneEnum
	// LLM_CHUNK,
	//     FAQ,
	//     LLM_TABLE;
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
}

func (s DocumentReferenceInfo) String() string {
	return tea.Prettify(s)
}

func (s DocumentReferenceInfo) GoString() string {
	return s.String()
}

func (s *DocumentReferenceInfo) SetTitle(v string) *DocumentReferenceInfo {
	s.Title = &v
	return s
}

func (s *DocumentReferenceInfo) SetAddress(v string) *DocumentReferenceInfo {
	s.Address = &v
	return s
}

func (s *DocumentReferenceInfo) SetScore(v string) *DocumentReferenceInfo {
	s.Score = &v
	return s
}

func (s *DocumentReferenceInfo) SetContent(v string) *DocumentReferenceInfo {
	s.Content = &v
	return s
}

func (s *DocumentReferenceInfo) SetType(v string) *DocumentReferenceInfo {
	s.Type = &v
	return s
}

// 知识类型：知识点列表
type KnowledgeTitleInfo struct {
	// title
	Title *string `json:"title,omitempty" xml:"title,omitempty" require:"true"`
	// score 浮点类型
	Score *string `json:"score,omitempty" xml:"score,omitempty" require:"true"`
}

func (s KnowledgeTitleInfo) String() string {
	return tea.Prettify(s)
}

func (s KnowledgeTitleInfo) GoString() string {
	return s.String()
}

func (s *KnowledgeTitleInfo) SetTitle(v string) *KnowledgeTitleInfo {
	s.Title = &v
	return s
}

func (s *KnowledgeTitleInfo) SetScore(v string) *KnowledgeTitleInfo {
	s.Score = &v
	return s
}

// Agent详情 --> 隶属multi-agent的sub agents --> 坐标信息
type DraftPosition struct {
	// x 浮点类型
	X *string `json:"x,omitempty" xml:"x,omitempty" require:"true"`
	// y 浮点类型
	Y *string `json:"y,omitempty" xml:"y,omitempty" require:"true"`
}

func (s DraftPosition) String() string {
	return tea.Prettify(s)
}

func (s DraftPosition) GoString() string {
	return s.String()
}

func (s *DraftPosition) SetX(v string) *DraftPosition {
	s.X = &v
	return s
}

func (s *DraftPosition) SetY(v string) *DraftPosition {
	s.Y = &v
	return s
}

// 工具入参的json schema
type JsonSchema struct {
	// 工具属性，Map<String, Object> 类型，适配网关透出，使用字符串方式存储
	PropertiesJson *string `json:"properties_json,omitempty" xml:"properties_json,omitempty" require:"true"`
	// 类型
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 必填项
	Required []*string `json:"required,omitempty" xml:"required,omitempty" require:"true" type:"Repeated"`
	// 是否允许额外属性
	AdditionalProperties *bool `json:"additional_properties,omitempty" xml:"additional_properties,omitempty" require:"true"`
}

func (s JsonSchema) String() string {
	return tea.Prettify(s)
}

func (s JsonSchema) GoString() string {
	return s.String()
}

func (s *JsonSchema) SetPropertiesJson(v string) *JsonSchema {
	s.PropertiesJson = &v
	return s
}

func (s *JsonSchema) SetType(v string) *JsonSchema {
	s.Type = &v
	return s
}

func (s *JsonSchema) SetRequired(v []*string) *JsonSchema {
	s.Required = v
	return s
}

func (s *JsonSchema) SetAdditionalProperties(v bool) *JsonSchema {
	s.AdditionalProperties = &v
	return s
}

// Agent对话历史列表
type SingleAgentChatHistoryPreview struct {
	// 数据库id
	//
	Id *int64 `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 会话id
	//
	SessionId *string `json:"session_id,omitempty" xml:"session_id,omitempty" require:"true"`
	// 会话开始时间
	//
	AskTime *string `json:"ask_time,omitempty" xml:"ask_time,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 前端展示的时间
	//
	DisplayTime *string `json:"display_time,omitempty" xml:"display_time,omitempty" require:"true"`
	// 会话在列表中的显示内容
	//
	SessionIdentifier *string `json:"session_identifier,omitempty" xml:"session_identifier,omitempty" require:"true"`
	// 消息类型（chat/pushMessage）
	//
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 推送的消息内容
	//
	TextResponse *string `json:"text_response,omitempty" xml:"text_response,omitempty" require:"true"`
	// 推送时间
	//
	TimestampDisplay *string `json:"timestamp_display,omitempty" xml:"timestamp_display,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 返回类型
	//
	DisplayResponseType *string `json:"display_response_type,omitempty" xml:"display_response_type,omitempty" require:"true"`
	// 附件文件
	//
	Files []*AttachFile `json:"files,omitempty" xml:"files,omitempty" require:"true" type:"Repeated"`
}

func (s SingleAgentChatHistoryPreview) String() string {
	return tea.Prettify(s)
}

func (s SingleAgentChatHistoryPreview) GoString() string {
	return s.String()
}

func (s *SingleAgentChatHistoryPreview) SetId(v int64) *SingleAgentChatHistoryPreview {
	s.Id = &v
	return s
}

func (s *SingleAgentChatHistoryPreview) SetSessionId(v string) *SingleAgentChatHistoryPreview {
	s.SessionId = &v
	return s
}

func (s *SingleAgentChatHistoryPreview) SetAskTime(v string) *SingleAgentChatHistoryPreview {
	s.AskTime = &v
	return s
}

func (s *SingleAgentChatHistoryPreview) SetDisplayTime(v string) *SingleAgentChatHistoryPreview {
	s.DisplayTime = &v
	return s
}

func (s *SingleAgentChatHistoryPreview) SetSessionIdentifier(v string) *SingleAgentChatHistoryPreview {
	s.SessionIdentifier = &v
	return s
}

func (s *SingleAgentChatHistoryPreview) SetType(v string) *SingleAgentChatHistoryPreview {
	s.Type = &v
	return s
}

func (s *SingleAgentChatHistoryPreview) SetTextResponse(v string) *SingleAgentChatHistoryPreview {
	s.TextResponse = &v
	return s
}

func (s *SingleAgentChatHistoryPreview) SetTimestampDisplay(v string) *SingleAgentChatHistoryPreview {
	s.TimestampDisplay = &v
	return s
}

func (s *SingleAgentChatHistoryPreview) SetDisplayResponseType(v string) *SingleAgentChatHistoryPreview {
	s.DisplayResponseType = &v
	return s
}

func (s *SingleAgentChatHistoryPreview) SetFiles(v []*AttachFile) *SingleAgentChatHistoryPreview {
	s.Files = v
	return s
}

// Agent详情-Agent模型配置表
//
type AgentModelParams struct {
	// 模型类型 AgentModelTypeEnum - DECISION: 决策模型 - GENERATE: 生成模型 - E2E: 端到端模型 - RAG: 检索生成模型
	//
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 模型版本 {model}/{version}#{adapter}
	//
	Model *string `json:"model,omitempty" xml:"model,omitempty" require:"true"`
	// 生成策略预设配置 AgentModelPresetEnum - FLEXIBLE: 灵活 - NORMAL: 正常 - STRICT: 严格
	//
	PresetIndex *string `json:"preset_index,omitempty" xml:"preset_index,omitempty" require:"true"`
	// temperature 浮点类型
	//
	Temperature *string `json:"temperature,omitempty" xml:"temperature,omitempty" require:"true"`
	// top_k
	TopK *int64 `json:"top_k,omitempty" xml:"top_k,omitempty" require:"true"`
	// top_p 浮点类型
	TopP *string `json:"top_p,omitempty" xml:"top_p,omitempty" require:"true"`
	// doSample
	DoSample *bool `json:"do_sample,omitempty" xml:"do_sample,omitempty" require:"true"`
	// beam_width
	BeamWidth *int64 `json:"beam_width,omitempty" xml:"beam_width,omitempty" require:"true"`
	// 最大输出长度
	//
	MaxOutToken *int64 `json:"max_out_token,omitempty" xml:"max_out_token,omitempty" require:"true"`
	// 是否为支持 function call 的模型
	//
	FunctionCall *bool `json:"function_call,omitempty" xml:"function_call,omitempty" require:"true"`
	// 自定义推理服务url
	//
	CustomUrl *string `json:"custom_url,omitempty" xml:"custom_url,omitempty" require:"true"`
	// 是否平台官方模型
	//
	BailingOfficial *bool `json:"bailing_official,omitempty" xml:"bailing_official,omitempty" require:"true"`
}

func (s AgentModelParams) String() string {
	return tea.Prettify(s)
}

func (s AgentModelParams) GoString() string {
	return s.String()
}

func (s *AgentModelParams) SetType(v string) *AgentModelParams {
	s.Type = &v
	return s
}

func (s *AgentModelParams) SetModel(v string) *AgentModelParams {
	s.Model = &v
	return s
}

func (s *AgentModelParams) SetPresetIndex(v string) *AgentModelParams {
	s.PresetIndex = &v
	return s
}

func (s *AgentModelParams) SetTemperature(v string) *AgentModelParams {
	s.Temperature = &v
	return s
}

func (s *AgentModelParams) SetTopK(v int64) *AgentModelParams {
	s.TopK = &v
	return s
}

func (s *AgentModelParams) SetTopP(v string) *AgentModelParams {
	s.TopP = &v
	return s
}

func (s *AgentModelParams) SetDoSample(v bool) *AgentModelParams {
	s.DoSample = &v
	return s
}

func (s *AgentModelParams) SetBeamWidth(v int64) *AgentModelParams {
	s.BeamWidth = &v
	return s
}

func (s *AgentModelParams) SetMaxOutToken(v int64) *AgentModelParams {
	s.MaxOutToken = &v
	return s
}

func (s *AgentModelParams) SetFunctionCall(v bool) *AgentModelParams {
	s.FunctionCall = &v
	return s
}

func (s *AgentModelParams) SetCustomUrl(v string) *AgentModelParams {
	s.CustomUrl = &v
	return s
}

func (s *AgentModelParams) SetBailingOfficial(v bool) *AgentModelParams {
	s.BailingOfficial = &v
	return s
}

// 工具列表vo
type ToolInfoVO struct {
	// 工具名称
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// 工具描述
	Description *string `json:"description,omitempty" xml:"description,omitempty" require:"true"`
	// 工具入参的json schema
	InputSchema *JsonSchema `json:"input_schema,omitempty" xml:"input_schema,omitempty" require:"true"`
}

func (s ToolInfoVO) String() string {
	return tea.Prettify(s)
}

func (s ToolInfoVO) GoString() string {
	return s.String()
}

func (s *ToolInfoVO) SetName(v string) *ToolInfoVO {
	s.Name = &v
	return s
}

func (s *ToolInfoVO) SetDescription(v string) *ToolInfoVO {
	s.Description = &v
	return s
}

func (s *ToolInfoVO) SetInputSchema(v *JsonSchema) *ToolInfoVO {
	s.InputSchema = v
	return s
}

// Agent详情查询-隶属multi-agent的sub agents
type SubAgentInfo struct {
	// agent主键id
	//
	Id *int64 `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// agent code
	//
	UniqueCode *string `json:"unique_code,omitempty" xml:"unique_code,omitempty" require:"true"`
	// 场景描述
	//
	Scene *string `json:"scene,omitempty" xml:"scene,omitempty" require:"true"`
	// 调用示例 话术
	//
	Scripting []*string `json:"scripting,omitempty" xml:"scripting,omitempty" require:"true" type:"Repeated"`
	// 是否默认展示
	//
	IsDefault *bool `json:"is_default,omitempty" xml:"is_default,omitempty" require:"true"`
	// 实例id
	//
	InstanceId *string `json:"instance_id,omitempty" xml:"instance_id,omitempty" require:"true"`
	// edges 信息
	//
	Edges []*MultiAgentEdge `json:"edges,omitempty" xml:"edges,omitempty" require:"true" type:"Repeated"`
	// 坐标信息
	//
	Position *DraftPosition `json:"position,omitempty" xml:"position,omitempty" require:"true"`
	// agent 来源类型
	//
	AgentSource *string `json:"agent_source,omitempty" xml:"agent_source,omitempty" require:"true"`
}

func (s SubAgentInfo) String() string {
	return tea.Prettify(s)
}

func (s SubAgentInfo) GoString() string {
	return s.String()
}

func (s *SubAgentInfo) SetId(v int64) *SubAgentInfo {
	s.Id = &v
	return s
}

func (s *SubAgentInfo) SetUniqueCode(v string) *SubAgentInfo {
	s.UniqueCode = &v
	return s
}

func (s *SubAgentInfo) SetScene(v string) *SubAgentInfo {
	s.Scene = &v
	return s
}

func (s *SubAgentInfo) SetScripting(v []*string) *SubAgentInfo {
	s.Scripting = v
	return s
}

func (s *SubAgentInfo) SetIsDefault(v bool) *SubAgentInfo {
	s.IsDefault = &v
	return s
}

func (s *SubAgentInfo) SetInstanceId(v string) *SubAgentInfo {
	s.InstanceId = &v
	return s
}

func (s *SubAgentInfo) SetEdges(v []*MultiAgentEdge) *SubAgentInfo {
	s.Edges = v
	return s
}

func (s *SubAgentInfo) SetPosition(v *DraftPosition) *SubAgentInfo {
	s.Position = v
	return s
}

func (s *SubAgentInfo) SetAgentSource(v string) *SubAgentInfo {
	s.AgentSource = &v
	return s
}

// Agent详情查询-Agent关联配置信息表
type AgentRefPluginInfo struct {
	// 工具id
	//
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 构建版本号
	//
	BuildVersion *string `json:"build_version,omitempty" xml:"build_version,omitempty" require:"true"`
	// 入参预设值表 Map<String,String> 格式
	ParamValueMap *string `json:"param_value_map,omitempty" xml:"param_value_map,omitempty" require:"true"`
	// 关联的语料
	Corpus []*string `json:"corpus,omitempty" xml:"corpus,omitempty" require:"true" type:"Repeated"`
}

func (s AgentRefPluginInfo) String() string {
	return tea.Prettify(s)
}

func (s AgentRefPluginInfo) GoString() string {
	return s.String()
}

func (s *AgentRefPluginInfo) SetId(v string) *AgentRefPluginInfo {
	s.Id = &v
	return s
}

func (s *AgentRefPluginInfo) SetBuildVersion(v string) *AgentRefPluginInfo {
	s.BuildVersion = &v
	return s
}

func (s *AgentRefPluginInfo) SetParamValueMap(v string) *AgentRefPluginInfo {
	s.ParamValueMap = &v
	return s
}

func (s *AgentRefPluginInfo) SetCorpus(v []*string) *AgentRefPluginInfo {
	s.Corpus = v
	return s
}

// Agent详情-Agent安全审核配置
type AgentSecConfig struct {
	// 是否打开安全审核
	EnableSecCheck *bool `json:"enable_sec_check,omitempty" xml:"enable_sec_check,omitempty" require:"true"`
	// 安全提供方:平台配置 大安全、天鉴等
	SecProvider *string `json:"sec_provider,omitempty" xml:"sec_provider,omitempty" require:"true"`
}

func (s AgentSecConfig) String() string {
	return tea.Prettify(s)
}

func (s AgentSecConfig) GoString() string {
	return s.String()
}

func (s *AgentSecConfig) SetEnableSecCheck(v bool) *AgentSecConfig {
	s.EnableSecCheck = &v
	return s
}

func (s *AgentSecConfig) SetSecProvider(v string) *AgentSecConfig {
	s.SecProvider = &v
	return s
}

// 对话详细信息
type DisplayResponseContent struct {
	// 【对话历史展示专用】对话历史展示类型，枚举值：QUERY("用户输入"), RESPONSE("回复")
	//
	ChatHistoryDisplayTypeEnum *string `json:"chat_history_display_type_enum,omitempty" xml:"chat_history_display_type_enum,omitempty" require:"true"`
	// 展示类型，前端根据此类型读取相关字段进行展示，枚举值：TEXT("文本"), CARD("卡片"), TEMPLATE("模版"), MARKDOWN("Markdown模版"), KNOWLEDGE("知识点"), DOCUMENT("文档"), PLUGIN("插件"), DEFAULT("兜底"), ERROR("异常")
	//
	DisplayResponseType *string `json:"display_response_type,omitempty" xml:"display_response_type,omitempty" require:"true"`
	// content 日志原文
	RawContent *string `json:"raw_content,omitempty" xml:"raw_content,omitempty" require:"true"`
	// Map<String, Object> 元数据kv对
	//
	KvMap *string `json:"kv_map,omitempty" xml:"kv_map,omitempty" require:"true"`
	// 关联节点id
	//
	RefNodeId *string `json:"ref_node_id,omitempty" xml:"ref_node_id,omitempty" require:"true"`
	// 关联节点信息
	//
	SpmData *string `json:"spm_data,omitempty" xml:"spm_data,omitempty" require:"true"`
	// 关联意图domain+intent
	//
	DomainIntent *string `json:"domain_intent,omitempty" xml:"domain_intent,omitempty" require:"true"`
	// 文本回复内容，非文本类型的机器人回复展现也使用该字段
	//
	TextResponse *string `json:"text_response,omitempty" xml:"text_response,omitempty" require:"true"`
	// 卡片/模版类型：行动点列表
	//
	TemplateActionList []*TemplateAction `json:"template_action_list,omitempty" xml:"template_action_list,omitempty" require:"true" type:"Repeated"`
	// 模版/卡片类型: 序号
	//
	Order *int64 `json:"order,omitempty" xml:"order,omitempty" require:"true"`
	// 模版类型：模版id
	//
	TemplateId *string `json:"template_id,omitempty" xml:"template_id,omitempty" require:"true"`
	// 模版类型：模版名称
	//
	TemplateName *string `json:"template_name,omitempty" xml:"template_name,omitempty" require:"true"`
	// 模版类型：模版 responseId
	//
	TemplateResponseId *string `json:"template_response_id,omitempty" xml:"template_response_id,omitempty" require:"true"`
	// 模版类型：模版预览图地址
	//
	TemplatePictureUrl *string `json:"template_picture_url,omitempty" xml:"template_picture_url,omitempty" require:"true"`
	// 卡片类型：卡片 responseId
	//
	CardResponseId *string `json:"card_response_id,omitempty" xml:"card_response_id,omitempty" require:"true"`
	// 卡片类型：卡片ID
	//
	CardId *string `json:"card_id,omitempty" xml:"card_id,omitempty" require:"true"`
	// 卡片类型：卡片版本
	//
	CardVersion *string `json:"card_version,omitempty" xml:"card_version,omitempty" require:"true"`
	// Markdown 类型：消息标题
	//
	MsgTitle *string `json:"msg_title,omitempty" xml:"msg_title,omitempty" require:"true"`
	// Markdown 类型：消息内容
	//
	MsgContent *string `json:"msg_content,omitempty" xml:"msg_content,omitempty" require:"true"`
	// 知识类型：知识点列表
	//
	KnowledgeTitleList []*KnowledgeTitleInfo `json:"knowledge_title_list,omitempty" xml:"knowledge_title_list,omitempty" require:"true" type:"Repeated"`
	// 文档类型：文档参考片段列表
	//
	DocumentReferenceList []*DocumentReferenceInfo `json:"document_reference_list,omitempty" xml:"document_reference_list,omitempty" require:"true" type:"Repeated"`
	// 建议/关联问题列表
	//
	Suggestions []*string `json:"suggestions,omitempty" xml:"suggestions,omitempty" require:"true" type:"Repeated"`
	// 响应单元id
	//
	UnitId *string `json:"unit_id,omitempty" xml:"unit_id,omitempty" require:"true"`
	// 响应序号
	//
	Index *int64 `json:"index,omitempty" xml:"index,omitempty" require:"true"`
	// 是还在加载
	//
	Loading *bool `json:"loading,omitempty" xml:"loading,omitempty" require:"true"`
	// 运行时间戳，用于计算耗时
	//
	Timestamp *int64 `json:"timestamp,omitempty" xml:"timestamp,omitempty" require:"true"`
	// 运行时间戳，展示格式（已废弃）
	//
	TimestampDisplay *string `json:"timestamp_display,omitempty" xml:"timestamp_display,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// 响应控制码，用于标识是否被安全拦截或者正常生成
	//
	ReplyCmd *string `json:"reply_cmd,omitempty" xml:"reply_cmd,omitempty" require:"true"`
	// 附件列表
	//
	Files []*AttachFile `json:"files,omitempty" xml:"files,omitempty" require:"true" type:"Repeated"`
	// Agent 运行思维链
	ThoughtChain *ThoughtChainInfo `json:"thought_chain,omitempty" xml:"thought_chain,omitempty" require:"true"`
	// AgentChatLogInfo. Agent 运行相关信息
	//
	AgentChatLogInfo *AgentChatLogInfo `json:"agent_chat_log_info,omitempty" xml:"agent_chat_log_info,omitempty" require:"true"`
	// chat_id
	ChatId *string `json:"chat_id,omitempty" xml:"chat_id,omitempty" require:"true"`
	// session_id
	SessionId *string `json:"session_id,omitempty" xml:"session_id,omitempty" require:"true"`
}

func (s DisplayResponseContent) String() string {
	return tea.Prettify(s)
}

func (s DisplayResponseContent) GoString() string {
	return s.String()
}

func (s *DisplayResponseContent) SetChatHistoryDisplayTypeEnum(v string) *DisplayResponseContent {
	s.ChatHistoryDisplayTypeEnum = &v
	return s
}

func (s *DisplayResponseContent) SetDisplayResponseType(v string) *DisplayResponseContent {
	s.DisplayResponseType = &v
	return s
}

func (s *DisplayResponseContent) SetRawContent(v string) *DisplayResponseContent {
	s.RawContent = &v
	return s
}

func (s *DisplayResponseContent) SetKvMap(v string) *DisplayResponseContent {
	s.KvMap = &v
	return s
}

func (s *DisplayResponseContent) SetRefNodeId(v string) *DisplayResponseContent {
	s.RefNodeId = &v
	return s
}

func (s *DisplayResponseContent) SetSpmData(v string) *DisplayResponseContent {
	s.SpmData = &v
	return s
}

func (s *DisplayResponseContent) SetDomainIntent(v string) *DisplayResponseContent {
	s.DomainIntent = &v
	return s
}

func (s *DisplayResponseContent) SetTextResponse(v string) *DisplayResponseContent {
	s.TextResponse = &v
	return s
}

func (s *DisplayResponseContent) SetTemplateActionList(v []*TemplateAction) *DisplayResponseContent {
	s.TemplateActionList = v
	return s
}

func (s *DisplayResponseContent) SetOrder(v int64) *DisplayResponseContent {
	s.Order = &v
	return s
}

func (s *DisplayResponseContent) SetTemplateId(v string) *DisplayResponseContent {
	s.TemplateId = &v
	return s
}

func (s *DisplayResponseContent) SetTemplateName(v string) *DisplayResponseContent {
	s.TemplateName = &v
	return s
}

func (s *DisplayResponseContent) SetTemplateResponseId(v string) *DisplayResponseContent {
	s.TemplateResponseId = &v
	return s
}

func (s *DisplayResponseContent) SetTemplatePictureUrl(v string) *DisplayResponseContent {
	s.TemplatePictureUrl = &v
	return s
}

func (s *DisplayResponseContent) SetCardResponseId(v string) *DisplayResponseContent {
	s.CardResponseId = &v
	return s
}

func (s *DisplayResponseContent) SetCardId(v string) *DisplayResponseContent {
	s.CardId = &v
	return s
}

func (s *DisplayResponseContent) SetCardVersion(v string) *DisplayResponseContent {
	s.CardVersion = &v
	return s
}

func (s *DisplayResponseContent) SetMsgTitle(v string) *DisplayResponseContent {
	s.MsgTitle = &v
	return s
}

func (s *DisplayResponseContent) SetMsgContent(v string) *DisplayResponseContent {
	s.MsgContent = &v
	return s
}

func (s *DisplayResponseContent) SetKnowledgeTitleList(v []*KnowledgeTitleInfo) *DisplayResponseContent {
	s.KnowledgeTitleList = v
	return s
}

func (s *DisplayResponseContent) SetDocumentReferenceList(v []*DocumentReferenceInfo) *DisplayResponseContent {
	s.DocumentReferenceList = v
	return s
}

func (s *DisplayResponseContent) SetSuggestions(v []*string) *DisplayResponseContent {
	s.Suggestions = v
	return s
}

func (s *DisplayResponseContent) SetUnitId(v string) *DisplayResponseContent {
	s.UnitId = &v
	return s
}

func (s *DisplayResponseContent) SetIndex(v int64) *DisplayResponseContent {
	s.Index = &v
	return s
}

func (s *DisplayResponseContent) SetLoading(v bool) *DisplayResponseContent {
	s.Loading = &v
	return s
}

func (s *DisplayResponseContent) SetTimestamp(v int64) *DisplayResponseContent {
	s.Timestamp = &v
	return s
}

func (s *DisplayResponseContent) SetTimestampDisplay(v string) *DisplayResponseContent {
	s.TimestampDisplay = &v
	return s
}

func (s *DisplayResponseContent) SetReplyCmd(v string) *DisplayResponseContent {
	s.ReplyCmd = &v
	return s
}

func (s *DisplayResponseContent) SetFiles(v []*AttachFile) *DisplayResponseContent {
	s.Files = v
	return s
}

func (s *DisplayResponseContent) SetThoughtChain(v *ThoughtChainInfo) *DisplayResponseContent {
	s.ThoughtChain = v
	return s
}

func (s *DisplayResponseContent) SetAgentChatLogInfo(v *AgentChatLogInfo) *DisplayResponseContent {
	s.AgentChatLogInfo = v
	return s
}

func (s *DisplayResponseContent) SetChatId(v string) *DisplayResponseContent {
	s.ChatId = &v
	return s
}

func (s *DisplayResponseContent) SetSessionId(v string) *DisplayResponseContent {
	s.SessionId = &v
	return s
}

// Agent历史对话信息列表vo
type AgentChatHistoryPreviewVO struct {
	// 对话历史列表
	SessionList []*SingleAgentChatHistoryPreview `json:"session_list,omitempty" xml:"session_list,omitempty" require:"true" type:"Repeated"`
}

func (s AgentChatHistoryPreviewVO) String() string {
	return tea.Prettify(s)
}

func (s AgentChatHistoryPreviewVO) GoString() string {
	return s.String()
}

func (s *AgentChatHistoryPreviewVO) SetSessionList(v []*SingleAgentChatHistoryPreview) *AgentChatHistoryPreviewVO {
	s.SessionList = v
	return s
}

// 知识库-文件上传响应内容
type UploadAttachmentFileVO struct {
	// 上传结果
	//
	UploadStatus *string `json:"upload_status,omitempty" xml:"upload_status,omitempty" require:"true"`
	// 文件URL
	FileUrl *string `json:"file_url,omitempty" xml:"file_url,omitempty" require:"true"`
	// file_id
	FileId *string `json:"file_id,omitempty" xml:"file_id,omitempty" require:"true"`
	// 文件类型
	FileType *string `json:"file_type,omitempty" xml:"file_type,omitempty" require:"true"`
	// 文件名
	FileName *string `json:"file_name,omitempty" xml:"file_name,omitempty" require:"true"`
	// 附件大小
	//
	FileSize *int64 `json:"file_size,omitempty" xml:"file_size,omitempty" require:"true"`
	// 内容库 ID（用于检索）
	//
	ContentId *string `json:"content_id,omitempty" xml:"content_id,omitempty" require:"true"`
	// 错误信息
	//
	ErrorMessage *string `json:"error_message,omitempty" xml:"error_message,omitempty" require:"true"`
}

func (s UploadAttachmentFileVO) String() string {
	return tea.Prettify(s)
}

func (s UploadAttachmentFileVO) GoString() string {
	return s.String()
}

func (s *UploadAttachmentFileVO) SetUploadStatus(v string) *UploadAttachmentFileVO {
	s.UploadStatus = &v
	return s
}

func (s *UploadAttachmentFileVO) SetFileUrl(v string) *UploadAttachmentFileVO {
	s.FileUrl = &v
	return s
}

func (s *UploadAttachmentFileVO) SetFileId(v string) *UploadAttachmentFileVO {
	s.FileId = &v
	return s
}

func (s *UploadAttachmentFileVO) SetFileType(v string) *UploadAttachmentFileVO {
	s.FileType = &v
	return s
}

func (s *UploadAttachmentFileVO) SetFileName(v string) *UploadAttachmentFileVO {
	s.FileName = &v
	return s
}

func (s *UploadAttachmentFileVO) SetFileSize(v int64) *UploadAttachmentFileVO {
	s.FileSize = &v
	return s
}

func (s *UploadAttachmentFileVO) SetContentId(v string) *UploadAttachmentFileVO {
	s.ContentId = &v
	return s
}

func (s *UploadAttachmentFileVO) SetErrorMessage(v string) *UploadAttachmentFileVO {
	s.ErrorMessage = &v
	return s
}

// Agent详情查询VO
type AgentVO struct {
	// Agent的唯一标识符
	Id *int64 `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// Agent唯一uid
	//
	UniqueCode *string `json:"unique_code,omitempty" xml:"unique_code,omitempty" require:"true"`
	// Agent名称
	//
	Name *string `json:"name,omitempty" xml:"name,omitempty" require:"true"`
	// Agent 版本
	//
	AgentVersion *string `json:"agent_version,omitempty" xml:"agent_version,omitempty" require:"true"`
	// Agent类型 "multi", "多智能体应用" "workflow", "工作流应用""lite", "轻量应用"  "external", "外部应用"
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// Agent描述
	//
	Description *string `json:"description,omitempty" xml:"description,omitempty" require:"true"`
	// Agent创建人
	//
	Creator *string `json:"creator,omitempty" xml:"creator,omitempty" require:"true"`
	// Agent创建时间
	//
	GmtCreate *string `json:"gmt_create,omitempty" xml:"gmt_create,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// Agent编辑时间
	//
	GmtModified *string `json:"gmt_modified,omitempty" xml:"gmt_modified,omitempty" require:"true" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// Agent安全审核配置
	//
	SecConfig *AgentSecConfig `json:"sec_config,omitempty" xml:"sec_config,omitempty" require:"true"`
	// 欢迎语
	//
	Welcome *string `json:"welcome,omitempty" xml:"welcome,omitempty" require:"true"`
	// 是否展示关联问题
	//
	ShowRelatedQuestions *bool `json:"show_related_questions,omitempty" xml:"show_related_questions,omitempty" require:"true"`
	// 关联问题自定义prompt
	//
	RelatedQuestionPrompt *string `json:"related_question_prompt,omitempty" xml:"related_question_prompt,omitempty" require:"true"`
	// 额外信息 ，Map<String, Object>
	ExtraInfo *string `json:"extra_info,omitempty" xml:"extra_info,omitempty" require:"true"`
	// extra_info (额外信息) 字段的json形式，格式为：Map<String, Object>
	ExtraInfoJson *string `json:"extra_info_json,omitempty" xml:"extra_info_json,omitempty" require:"true"`
	// 交互类型 VOICE / AVATAR / VIDEO
	//
	InteractionType *string `json:"interaction_type,omitempty" xml:"interaction_type,omitempty" require:"true"`
	// 音色
	//
	Voice *string `json:"voice,omitempty" xml:"voice,omitempty" require:"true"`
	// agent模型版本 {model}/{version}#{adapter} (deprecated)
	//
	Model *string `json:"model,omitempty" xml:"model,omitempty" require:"true"`
	// Agent模型配置表
	//
	ModelList []*AgentModelParams `json:"model_list,omitempty" xml:"model_list,omitempty" require:"true" type:"Repeated"`
	// Agent关联知识库ID列表
	//
	RefLibraryIds []*string `json:"ref_library_ids,omitempty" xml:"ref_library_ids,omitempty" require:"true" type:"Repeated"`
	// Agent关联插件信息表, key为插件主键id, value为信息
	//
	RefPlugins []*AgentRefPluginInfo `json:"ref_plugins,omitempty" xml:"ref_plugins,omitempty" require:"true" type:"Repeated"`
	// 关联的mcpServer
	//
	RefMcpServers []*AgentRefPluginInfo `json:"ref_mcp_servers,omitempty" xml:"ref_mcp_servers,omitempty" require:"true" type:"Repeated"`
	// 隶属multi-agent的sub agents
	//
	SubAgents []*SubAgentInfo `json:"sub_agents,omitempty" xml:"sub_agents,omitempty" require:"true" type:"Repeated"`
	// Agent关联workflow信息表, key为intent wutong id, value为信息
	//
	RefWorkflows []*AgentRefPluginInfo `json:"ref_workflows,omitempty" xml:"ref_workflows,omitempty" require:"true" type:"Repeated"`
	// 关联卡片id列表
	//
	RefCardIds []*string `json:"ref_card_ids,omitempty" xml:"ref_card_ids,omitempty" require:"true" type:"Repeated"`
}

func (s AgentVO) String() string {
	return tea.Prettify(s)
}

func (s AgentVO) GoString() string {
	return s.String()
}

func (s *AgentVO) SetId(v int64) *AgentVO {
	s.Id = &v
	return s
}

func (s *AgentVO) SetUniqueCode(v string) *AgentVO {
	s.UniqueCode = &v
	return s
}

func (s *AgentVO) SetName(v string) *AgentVO {
	s.Name = &v
	return s
}

func (s *AgentVO) SetAgentVersion(v string) *AgentVO {
	s.AgentVersion = &v
	return s
}

func (s *AgentVO) SetType(v string) *AgentVO {
	s.Type = &v
	return s
}

func (s *AgentVO) SetDescription(v string) *AgentVO {
	s.Description = &v
	return s
}

func (s *AgentVO) SetCreator(v string) *AgentVO {
	s.Creator = &v
	return s
}

func (s *AgentVO) SetGmtCreate(v string) *AgentVO {
	s.GmtCreate = &v
	return s
}

func (s *AgentVO) SetGmtModified(v string) *AgentVO {
	s.GmtModified = &v
	return s
}

func (s *AgentVO) SetSecConfig(v *AgentSecConfig) *AgentVO {
	s.SecConfig = v
	return s
}

func (s *AgentVO) SetWelcome(v string) *AgentVO {
	s.Welcome = &v
	return s
}

func (s *AgentVO) SetShowRelatedQuestions(v bool) *AgentVO {
	s.ShowRelatedQuestions = &v
	return s
}

func (s *AgentVO) SetRelatedQuestionPrompt(v string) *AgentVO {
	s.RelatedQuestionPrompt = &v
	return s
}

func (s *AgentVO) SetExtraInfo(v string) *AgentVO {
	s.ExtraInfo = &v
	return s
}

func (s *AgentVO) SetExtraInfoJson(v string) *AgentVO {
	s.ExtraInfoJson = &v
	return s
}

func (s *AgentVO) SetInteractionType(v string) *AgentVO {
	s.InteractionType = &v
	return s
}

func (s *AgentVO) SetVoice(v string) *AgentVO {
	s.Voice = &v
	return s
}

func (s *AgentVO) SetModel(v string) *AgentVO {
	s.Model = &v
	return s
}

func (s *AgentVO) SetModelList(v []*AgentModelParams) *AgentVO {
	s.ModelList = v
	return s
}

func (s *AgentVO) SetRefLibraryIds(v []*string) *AgentVO {
	s.RefLibraryIds = v
	return s
}

func (s *AgentVO) SetRefPlugins(v []*AgentRefPluginInfo) *AgentVO {
	s.RefPlugins = v
	return s
}

func (s *AgentVO) SetRefMcpServers(v []*AgentRefPluginInfo) *AgentVO {
	s.RefMcpServers = v
	return s
}

func (s *AgentVO) SetSubAgents(v []*SubAgentInfo) *AgentVO {
	s.SubAgents = v
	return s
}

func (s *AgentVO) SetRefWorkflows(v []*AgentRefPluginInfo) *AgentVO {
	s.RefWorkflows = v
	return s
}

func (s *AgentVO) SetRefCardIds(v []*string) *AgentVO {
	s.RefCardIds = v
	return s
}

// MyMCP page分页内容信息
type DigitalGatewayMCPPageVO struct {
	// 空间id
	SpaceId *string `json:"space_id,omitempty" xml:"space_id,omitempty" require:"true"`
	// server_id
	ServerId *string `json:"server_id,omitempty" xml:"server_id,omitempty" require:"true"`
	// server_code
	ServerCode *string `json:"server_code,omitempty" xml:"server_code,omitempty" require:"true"`
	// server_name
	ServerName *string `json:"server_name,omitempty" xml:"server_name,omitempty" require:"true"`
	// icon
	Icon *string `json:"icon,omitempty" xml:"icon,omitempty" require:"true"`
	// description
	Description *string `json:"description,omitempty" xml:"description,omitempty" require:"true"`
	//  mcp分类
	Categories []*string `json:"categories,omitempty" xml:"categories,omitempty" require:"true" type:"Repeated"`
}

func (s DigitalGatewayMCPPageVO) String() string {
	return tea.Prettify(s)
}

func (s DigitalGatewayMCPPageVO) GoString() string {
	return s.String()
}

func (s *DigitalGatewayMCPPageVO) SetSpaceId(v string) *DigitalGatewayMCPPageVO {
	s.SpaceId = &v
	return s
}

func (s *DigitalGatewayMCPPageVO) SetServerId(v string) *DigitalGatewayMCPPageVO {
	s.ServerId = &v
	return s
}

func (s *DigitalGatewayMCPPageVO) SetServerCode(v string) *DigitalGatewayMCPPageVO {
	s.ServerCode = &v
	return s
}

func (s *DigitalGatewayMCPPageVO) SetServerName(v string) *DigitalGatewayMCPPageVO {
	s.ServerName = &v
	return s
}

func (s *DigitalGatewayMCPPageVO) SetIcon(v string) *DigitalGatewayMCPPageVO {
	s.Icon = &v
	return s
}

func (s *DigitalGatewayMCPPageVO) SetDescription(v string) *DigitalGatewayMCPPageVO {
	s.Description = &v
	return s
}

func (s *DigitalGatewayMCPPageVO) SetCategories(v []*string) *DigitalGatewayMCPPageVO {
	s.Categories = v
	return s
}

// 根据sessionId查询历史对话信息
type DisplaySingleSessionHistoryVO struct {
	// 展示内容列表，入参和出参放在一起，方便前端展示
	ContentList []*DisplayResponseContent `json:"content_list,omitempty" xml:"content_list,omitempty" require:"true" type:"Repeated"`
}

func (s DisplaySingleSessionHistoryVO) String() string {
	return tea.Prettify(s)
}

func (s DisplaySingleSessionHistoryVO) GoString() string {
	return s.String()
}

func (s *DisplaySingleSessionHistoryVO) SetContentList(v []*DisplayResponseContent) *DisplaySingleSessionHistoryVO {
	s.ContentList = v
	return s
}

// 知识库-任务列表对象
type ContentTask struct {
	// 任务ID
	Id *int64 `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 任务名称
	TaskName *string `json:"task_name,omitempty" xml:"task_name,omitempty" require:"true"`
	// 任务类型
	TaskType *string `json:"task_type,omitempty" xml:"task_type,omitempty" require:"true"`
	// 任务状态:
	Status *string `json:"status,omitempty" xml:"status,omitempty" require:"true"`
}

func (s ContentTask) String() string {
	return tea.Prettify(s)
}

func (s ContentTask) GoString() string {
	return s.String()
}

func (s *ContentTask) SetId(v int64) *ContentTask {
	s.Id = &v
	return s
}

func (s *ContentTask) SetTaskName(v string) *ContentTask {
	s.TaskName = &v
	return s
}

func (s *ContentTask) SetTaskType(v string) *ContentTask {
	s.TaskType = &v
	return s
}

func (s *ContentTask) SetStatus(v string) *ContentTask {
	s.Status = &v
	return s
}

// 异常对象
type BizErrorInfo struct {
	// code
	Code *string `json:"code,omitempty" xml:"code,omitempty" require:"true"`
	// 异常信息
	ErrorMsg *string `json:"error_msg,omitempty" xml:"error_msg,omitempty"`
	// params
	Params *string `json:"params,omitempty" xml:"params,omitempty"`
}

func (s BizErrorInfo) String() string {
	return tea.Prettify(s)
}

func (s BizErrorInfo) GoString() string {
	return s.String()
}

func (s *BizErrorInfo) SetCode(v string) *BizErrorInfo {
	s.Code = &v
	return s
}

func (s *BizErrorInfo) SetErrorMsg(v string) *BizErrorInfo {
	s.ErrorMsg = &v
	return s
}

func (s *BizErrorInfo) SetParams(v string) *BizErrorInfo {
	s.Params = &v
	return s
}

// 我的MCP详情VO
type DigitalGatewayMCPDetailVO struct {
	// server_host
	ServerHost *string `json:"server_host,omitempty" xml:"server_host,omitempty" require:"true"`
	// server请求协议
	TransportProtocol *string `json:"transport_protocol,omitempty" xml:"transport_protocol,omitempty" require:"true"`
	// 网关请求令牌
	ServerToken *string `json:"server_token,omitempty" xml:"server_token,omitempty" require:"true"`
	// 空间id
	SpaceId *string `json:"space_id,omitempty" xml:"space_id,omitempty" require:"true"`
	// server_id
	ServerId *string `json:"server_id,omitempty" xml:"server_id,omitempty" require:"true"`
	// server_code
	ServerCode *string `json:"server_code,omitempty" xml:"server_code,omitempty" require:"true"`
	// server名称
	ServerName *string `json:"server_name,omitempty" xml:"server_name,omitempty" require:"true"`
	// icon
	Icon *string `json:"icon,omitempty" xml:"icon,omitempty" require:"true"`
	// server描述
	Description *string `json:"description,omitempty" xml:"description,omitempty" require:"true"`
	// mcp上架信息（富文本）
	Docs *string `json:"docs,omitempty" xml:"docs,omitempty" require:"true"`
	// 工具列表
	ToolList []*ToolInfoVO `json:"tool_list,omitempty" xml:"tool_list,omitempty" require:"true" type:"Repeated"`
}

func (s DigitalGatewayMCPDetailVO) String() string {
	return tea.Prettify(s)
}

func (s DigitalGatewayMCPDetailVO) GoString() string {
	return s.String()
}

func (s *DigitalGatewayMCPDetailVO) SetServerHost(v string) *DigitalGatewayMCPDetailVO {
	s.ServerHost = &v
	return s
}

func (s *DigitalGatewayMCPDetailVO) SetTransportProtocol(v string) *DigitalGatewayMCPDetailVO {
	s.TransportProtocol = &v
	return s
}

func (s *DigitalGatewayMCPDetailVO) SetServerToken(v string) *DigitalGatewayMCPDetailVO {
	s.ServerToken = &v
	return s
}

func (s *DigitalGatewayMCPDetailVO) SetSpaceId(v string) *DigitalGatewayMCPDetailVO {
	s.SpaceId = &v
	return s
}

func (s *DigitalGatewayMCPDetailVO) SetServerId(v string) *DigitalGatewayMCPDetailVO {
	s.ServerId = &v
	return s
}

func (s *DigitalGatewayMCPDetailVO) SetServerCode(v string) *DigitalGatewayMCPDetailVO {
	s.ServerCode = &v
	return s
}

func (s *DigitalGatewayMCPDetailVO) SetServerName(v string) *DigitalGatewayMCPDetailVO {
	s.ServerName = &v
	return s
}

func (s *DigitalGatewayMCPDetailVO) SetIcon(v string) *DigitalGatewayMCPDetailVO {
	s.Icon = &v
	return s
}

func (s *DigitalGatewayMCPDetailVO) SetDescription(v string) *DigitalGatewayMCPDetailVO {
	s.Description = &v
	return s
}

func (s *DigitalGatewayMCPDetailVO) SetDocs(v string) *DigitalGatewayMCPDetailVO {
	s.Docs = &v
	return s
}

func (s *DigitalGatewayMCPDetailVO) SetToolList(v []*ToolInfoVO) *DigitalGatewayMCPDetailVO {
	s.ToolList = v
	return s
}

// 知识库-文档列表-文档分页对象
type ContentFile struct {
	// 文档所属知识库ID
	LibraryId *int64 `json:"library_id,omitempty" xml:"library_id,omitempty"`
	// 文档ID
	Id *int64 `json:"id,omitempty" xml:"id,omitempty"`
	// 文档文件名
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 文档类型
	Typ *string `json:"typ,omitempty" xml:"typ,omitempty"`
	// 文档标签列表
	TagList []*string `json:"tag_list,omitempty" xml:"tag_list,omitempty" type:"Repeated"`
	// 发布状态
	PublishStatus *string `json:"publish_status,omitempty" xml:"publish_status,omitempty"`
}

func (s ContentFile) String() string {
	return tea.Prettify(s)
}

func (s ContentFile) GoString() string {
	return s.String()
}

func (s *ContentFile) SetLibraryId(v int64) *ContentFile {
	s.LibraryId = &v
	return s
}

func (s *ContentFile) SetId(v int64) *ContentFile {
	s.Id = &v
	return s
}

func (s *ContentFile) SetName(v string) *ContentFile {
	s.Name = &v
	return s
}

func (s *ContentFile) SetTyp(v string) *ContentFile {
	s.Typ = &v
	return s
}

func (s *ContentFile) SetTagList(v []*string) *ContentFile {
	s.TagList = v
	return s
}

func (s *ContentFile) SetPublishStatus(v string) *ContentFile {
	s.PublishStatus = &v
	return s
}

// StringResult
type StringResult struct {
	// success
	Success *bool `json:"success,omitempty" xml:"success,omitempty" require:"true"`
	// code
	Code *string `json:"code,omitempty" xml:"code,omitempty" require:"true"`
	// msg
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty" require:"true"`
	// trace_id
	TraceId *string `json:"trace_id,omitempty" xml:"trace_id,omitempty" require:"true"`
	// req_id
	ReqId *string `json:"req_id,omitempty" xml:"req_id,omitempty" require:"true"`
	// 接口返回值
	Result *string `json:"result,omitempty" xml:"result,omitempty" require:"true"`
}

func (s StringResult) String() string {
	return tea.Prettify(s)
}

func (s StringResult) GoString() string {
	return s.String()
}

func (s *StringResult) SetSuccess(v bool) *StringResult {
	s.Success = &v
	return s
}

func (s *StringResult) SetCode(v string) *StringResult {
	s.Code = &v
	return s
}

func (s *StringResult) SetMsg(v string) *StringResult {
	s.Msg = &v
	return s
}

func (s *StringResult) SetTraceId(v string) *StringResult {
	s.TraceId = &v
	return s
}

func (s *StringResult) SetReqId(v string) *StringResult {
	s.ReqId = &v
	return s
}

func (s *StringResult) SetResult(v string) *StringResult {
	s.Result = &v
	return s
}

// 查看会话的历史会话信息result结果
type AgentChatHistoryForSessionIdResult struct {
	// success
	Success *bool `json:"success,omitempty" xml:"success,omitempty" require:"true"`
	// code
	Code *string `json:"code,omitempty" xml:"code,omitempty" require:"true"`
	// msg
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty" require:"true"`
	// trace_id
	TraceId *string `json:"trace_id,omitempty" xml:"trace_id,omitempty" require:"true"`
	// req_id
	ReqId *string `json:"req_id,omitempty" xml:"req_id,omitempty" require:"true"`
	// 对话历史
	//
	Result *DisplaySingleSessionHistoryVO `json:"result,omitempty" xml:"result,omitempty" require:"true"`
}

func (s AgentChatHistoryForSessionIdResult) String() string {
	return tea.Prettify(s)
}

func (s AgentChatHistoryForSessionIdResult) GoString() string {
	return s.String()
}

func (s *AgentChatHistoryForSessionIdResult) SetSuccess(v bool) *AgentChatHistoryForSessionIdResult {
	s.Success = &v
	return s
}

func (s *AgentChatHistoryForSessionIdResult) SetCode(v string) *AgentChatHistoryForSessionIdResult {
	s.Code = &v
	return s
}

func (s *AgentChatHistoryForSessionIdResult) SetMsg(v string) *AgentChatHistoryForSessionIdResult {
	s.Msg = &v
	return s
}

func (s *AgentChatHistoryForSessionIdResult) SetTraceId(v string) *AgentChatHistoryForSessionIdResult {
	s.TraceId = &v
	return s
}

func (s *AgentChatHistoryForSessionIdResult) SetReqId(v string) *AgentChatHistoryForSessionIdResult {
	s.ReqId = &v
	return s
}

func (s *AgentChatHistoryForSessionIdResult) SetResult(v *DisplaySingleSessionHistoryVO) *AgentChatHistoryForSessionIdResult {
	s.Result = v
	return s
}

// Agent查询对话列表,Result
type AgentChatHistoryPreviewListResult struct {
	// 请求处理结果
	//
	Success *bool `json:"success,omitempty" xml:"success,omitempty" require:"true"`
	// 返回结果编码
	//
	Code *string `json:"code,omitempty" xml:"code,omitempty" require:"true"`
	// 返回结果信息
	//
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty" require:"true"`
	// trace_id
	TraceId *string `json:"trace_id,omitempty" xml:"trace_id,omitempty" require:"true"`
	// req_id
	ReqId *string `json:"req_id,omitempty" xml:"req_id,omitempty" require:"true"`
	// 对话历史
	Result *AgentChatHistoryPreviewVO `json:"result,omitempty" xml:"result,omitempty" require:"true"`
}

func (s AgentChatHistoryPreviewListResult) String() string {
	return tea.Prettify(s)
}

func (s AgentChatHistoryPreviewListResult) GoString() string {
	return s.String()
}

func (s *AgentChatHistoryPreviewListResult) SetSuccess(v bool) *AgentChatHistoryPreviewListResult {
	s.Success = &v
	return s
}

func (s *AgentChatHistoryPreviewListResult) SetCode(v string) *AgentChatHistoryPreviewListResult {
	s.Code = &v
	return s
}

func (s *AgentChatHistoryPreviewListResult) SetMsg(v string) *AgentChatHistoryPreviewListResult {
	s.Msg = &v
	return s
}

func (s *AgentChatHistoryPreviewListResult) SetTraceId(v string) *AgentChatHistoryPreviewListResult {
	s.TraceId = &v
	return s
}

func (s *AgentChatHistoryPreviewListResult) SetReqId(v string) *AgentChatHistoryPreviewListResult {
	s.ReqId = &v
	return s
}

func (s *AgentChatHistoryPreviewListResult) SetResult(v *AgentChatHistoryPreviewVO) *AgentChatHistoryPreviewListResult {
	s.Result = v
	return s
}

// 知识库-任务列表result
type LibraryContentTaskPageResult struct {
	// 请求处理结果标识
	Success *bool `json:"success,omitempty" xml:"success,omitempty" require:"true"`
	// 业务状态码
	Code *string `json:"code,omitempty" xml:"code,omitempty" require:"true"`
	// 返回消息
	Message *string `json:"message,omitempty" xml:"message,omitempty" require:"true"`
	// 请求链路追踪ID
	TraceId *string `json:"trace_id,omitempty" xml:"trace_id,omitempty" require:"true"`
	// 符合查询条件的总记录数
	TotalCount *int64 `json:"total_count,omitempty" xml:"total_count,omitempty" require:"true"`
	// 当前返回数据的页码
	CurrentPage *int64 `json:"current_page,omitempty" xml:"current_page,omitempty" require:"true"`
	// 实际返回的每页记录数
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
	// 任务数据列表
	Result []*ContentTask `json:"result,omitempty" xml:"result,omitempty" require:"true" type:"Repeated"`
}

func (s LibraryContentTaskPageResult) String() string {
	return tea.Prettify(s)
}

func (s LibraryContentTaskPageResult) GoString() string {
	return s.String()
}

func (s *LibraryContentTaskPageResult) SetSuccess(v bool) *LibraryContentTaskPageResult {
	s.Success = &v
	return s
}

func (s *LibraryContentTaskPageResult) SetCode(v string) *LibraryContentTaskPageResult {
	s.Code = &v
	return s
}

func (s *LibraryContentTaskPageResult) SetMessage(v string) *LibraryContentTaskPageResult {
	s.Message = &v
	return s
}

func (s *LibraryContentTaskPageResult) SetTraceId(v string) *LibraryContentTaskPageResult {
	s.TraceId = &v
	return s
}

func (s *LibraryContentTaskPageResult) SetTotalCount(v int64) *LibraryContentTaskPageResult {
	s.TotalCount = &v
	return s
}

func (s *LibraryContentTaskPageResult) SetCurrentPage(v int64) *LibraryContentTaskPageResult {
	s.CurrentPage = &v
	return s
}

func (s *LibraryContentTaskPageResult) SetPageSize(v int64) *LibraryContentTaskPageResult {
	s.PageSize = &v
	return s
}

func (s *LibraryContentTaskPageResult) SetResult(v []*ContentTask) *LibraryContentTaskPageResult {
	s.Result = v
	return s
}

// 知识库文件上传响应Result
type LibraryUploadFileResult struct {
	// 请求处理结果标识
	Success *bool `json:"success,omitempty" xml:"success,omitempty" require:"true"`
	// 业务状态码
	Code *string `json:"code,omitempty" xml:"code,omitempty" require:"true"`
	// 返回消息
	Message *string `json:"message,omitempty" xml:"message,omitempty" require:"true"`
	// 请求链路追踪ID
	TraceId *string `json:"trace_id,omitempty" xml:"trace_id,omitempty" require:"true"`
	// 文件上传响应对象
	Result *UploadAttachmentFileVO `json:"result,omitempty" xml:"result,omitempty" require:"true"`
}

func (s LibraryUploadFileResult) String() string {
	return tea.Prettify(s)
}

func (s LibraryUploadFileResult) GoString() string {
	return s.String()
}

func (s *LibraryUploadFileResult) SetSuccess(v bool) *LibraryUploadFileResult {
	s.Success = &v
	return s
}

func (s *LibraryUploadFileResult) SetCode(v string) *LibraryUploadFileResult {
	s.Code = &v
	return s
}

func (s *LibraryUploadFileResult) SetMessage(v string) *LibraryUploadFileResult {
	s.Message = &v
	return s
}

func (s *LibraryUploadFileResult) SetTraceId(v string) *LibraryUploadFileResult {
	s.TraceId = &v
	return s
}

func (s *LibraryUploadFileResult) SetResult(v *UploadAttachmentFileVO) *LibraryUploadFileResult {
	s.Result = v
	return s
}

// 我订阅的MCP分页对象
type MyMcpPageRestult struct {
	// total_count
	TotalCount *int64 `json:"total_count,omitempty" xml:"total_count,omitempty" require:"true"`
	// current_page
	CurrentPage *int64 `json:"current_page,omitempty" xml:"current_page,omitempty" require:"true"`
	// trace_id
	TraceId *string `json:"trace_id,omitempty" xml:"trace_id,omitempty" require:"true"`
	// success
	Success *bool `json:"success,omitempty" xml:"success,omitempty" require:"true"`
	// code
	Code *string `json:"code,omitempty" xml:"code,omitempty" require:"true"`
	// msg
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty" require:"true"`
	// req_id
	ReqId *string `json:"req_id,omitempty" xml:"req_id,omitempty" require:"true"`
	// MCP分页内容
	Result []*DigitalGatewayMCPPageVO `json:"result,omitempty" xml:"result,omitempty" require:"true" type:"Repeated"`
}

func (s MyMcpPageRestult) String() string {
	return tea.Prettify(s)
}

func (s MyMcpPageRestult) GoString() string {
	return s.String()
}

func (s *MyMcpPageRestult) SetTotalCount(v int64) *MyMcpPageRestult {
	s.TotalCount = &v
	return s
}

func (s *MyMcpPageRestult) SetCurrentPage(v int64) *MyMcpPageRestult {
	s.CurrentPage = &v
	return s
}

func (s *MyMcpPageRestult) SetTraceId(v string) *MyMcpPageRestult {
	s.TraceId = &v
	return s
}

func (s *MyMcpPageRestult) SetSuccess(v bool) *MyMcpPageRestult {
	s.Success = &v
	return s
}

func (s *MyMcpPageRestult) SetCode(v string) *MyMcpPageRestult {
	s.Code = &v
	return s
}

func (s *MyMcpPageRestult) SetMsg(v string) *MyMcpPageRestult {
	s.Msg = &v
	return s
}

func (s *MyMcpPageRestult) SetReqId(v string) *MyMcpPageRestult {
	s.ReqId = &v
	return s
}

func (s *MyMcpPageRestult) SetResult(v []*DigitalGatewayMCPPageVO) *MyMcpPageRestult {
	s.Result = v
	return s
}

// 简单返回类
type SimpleResult struct {
	// success
	Success *bool `json:"success,omitempty" xml:"success,omitempty" require:"true"`
	// 返回结果编码 “ok”
	Code *string `json:"code,omitempty" xml:"code,omitempty" require:"true"`
	// 返回结果信息
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty" require:"true"`
	// trace_id
	TraceId *string `json:"trace_id,omitempty" xml:"trace_id,omitempty" require:"true"`
	// req_id
	ReqId *string `json:"req_id,omitempty" xml:"req_id,omitempty" require:"true"`
}

func (s SimpleResult) String() string {
	return tea.Prettify(s)
}

func (s SimpleResult) GoString() string {
	return s.String()
}

func (s *SimpleResult) SetSuccess(v bool) *SimpleResult {
	s.Success = &v
	return s
}

func (s *SimpleResult) SetCode(v string) *SimpleResult {
	s.Code = &v
	return s
}

func (s *SimpleResult) SetMsg(v string) *SimpleResult {
	s.Msg = &v
	return s
}

func (s *SimpleResult) SetTraceId(v string) *SimpleResult {
	s.TraceId = &v
	return s
}

func (s *SimpleResult) SetReqId(v string) *SimpleResult {
	s.ReqId = &v
	return s
}

// 知识库-文档-切片result对象
type LibraryDocBatchSplitResult struct {
	// 请求是否成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty" require:"true"`
	// 业务状态码
	Code *string `json:"code,omitempty" xml:"code,omitempty" require:"true"`
	// 返回消息
	Message *string `json:"message,omitempty" xml:"message,omitempty" require:"true"`
	// 请求链路追踪ID
	TraceId *string `json:"trace_id,omitempty" xml:"trace_id,omitempty" require:"true"`
	// 任务ID，可用于异步任务追踪
	Result *int64 `json:"result,omitempty" xml:"result,omitempty" require:"true"`
}

func (s LibraryDocBatchSplitResult) String() string {
	return tea.Prettify(s)
}

func (s LibraryDocBatchSplitResult) GoString() string {
	return s.String()
}

func (s *LibraryDocBatchSplitResult) SetSuccess(v bool) *LibraryDocBatchSplitResult {
	s.Success = &v
	return s
}

func (s *LibraryDocBatchSplitResult) SetCode(v string) *LibraryDocBatchSplitResult {
	s.Code = &v
	return s
}

func (s *LibraryDocBatchSplitResult) SetMessage(v string) *LibraryDocBatchSplitResult {
	s.Message = &v
	return s
}

func (s *LibraryDocBatchSplitResult) SetTraceId(v string) *LibraryDocBatchSplitResult {
	s.TraceId = &v
	return s
}

func (s *LibraryDocBatchSplitResult) SetResult(v int64) *LibraryDocBatchSplitResult {
	s.Result = &v
	return s
}

// 知识库-文档切片-文件信息
type FileReq struct {
	// 导入文件地址
	Url *string `json:"url,omitempty" xml:"url,omitempty" require:"true"`
	// 文件名称
	FileName *string `json:"file_name,omitempty" xml:"file_name,omitempty" require:"true"`
	// 文件类型，不设置使用全局类型
	FileType *string `json:"file_type,omitempty" xml:"file_type,omitempty" require:"true"`
	// 文件标签列表（用于AI参考）
	TagList []*string `json:"tag_list,omitempty" xml:"tag_list,omitempty" type:"Repeated"`
}

func (s FileReq) String() string {
	return tea.Prettify(s)
}

func (s FileReq) GoString() string {
	return s.String()
}

func (s *FileReq) SetUrl(v string) *FileReq {
	s.Url = &v
	return s
}

func (s *FileReq) SetFileName(v string) *FileReq {
	s.FileName = &v
	return s
}

func (s *FileReq) SetFileType(v string) *FileReq {
	s.FileType = &v
	return s
}

func (s *FileReq) SetTagList(v []*string) *FileReq {
	s.TagList = v
	return s
}

// MCP详情查询返回Result对象
type MCPDetailCommonResult struct {
	// MCP详情信息
	Result *DigitalGatewayMCPDetailVO `json:"result,omitempty" xml:"result,omitempty" require:"true"`
	// success
	Success *bool `json:"success,omitempty" xml:"success,omitempty" require:"true"`
	// code
	Code *string `json:"code,omitempty" xml:"code,omitempty" require:"true"`
	// msg
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty" require:"true"`
	// trace_id
	TraceId *string `json:"trace_id,omitempty" xml:"trace_id,omitempty" require:"true"`
	// req_id
	ReqId *string `json:"req_id,omitempty" xml:"req_id,omitempty" require:"true"`
	// 异常对象
	BizError *BizErrorInfo `json:"biz_error,omitempty" xml:"biz_error,omitempty" require:"true"`
}

func (s MCPDetailCommonResult) String() string {
	return tea.Prettify(s)
}

func (s MCPDetailCommonResult) GoString() string {
	return s.String()
}

func (s *MCPDetailCommonResult) SetResult(v *DigitalGatewayMCPDetailVO) *MCPDetailCommonResult {
	s.Result = v
	return s
}

func (s *MCPDetailCommonResult) SetSuccess(v bool) *MCPDetailCommonResult {
	s.Success = &v
	return s
}

func (s *MCPDetailCommonResult) SetCode(v string) *MCPDetailCommonResult {
	s.Code = &v
	return s
}

func (s *MCPDetailCommonResult) SetMsg(v string) *MCPDetailCommonResult {
	s.Msg = &v
	return s
}

func (s *MCPDetailCommonResult) SetTraceId(v string) *MCPDetailCommonResult {
	s.TraceId = &v
	return s
}

func (s *MCPDetailCommonResult) SetReqId(v string) *MCPDetailCommonResult {
	s.ReqId = &v
	return s
}

func (s *MCPDetailCommonResult) SetBizError(v *BizErrorInfo) *MCPDetailCommonResult {
	s.BizError = v
	return s
}

// MarketRichDetailVO 网关对象
type GatewayMarketRichDetailVO struct {
	// 市场条目 ID
	Id *int64 `json:"id,omitempty" xml:"id,omitempty"`
	// 资产类型（skill / package / agent / workflow / tool / card / mcp）
	Type *string `json:"type,omitempty" xml:"type,omitempty"`
	// 名称
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 描述
	Description *string `json:"description,omitempty" xml:"description,omitempty"`
	// ref_id
	RefId *int64 `json:"ref_id,omitempty" xml:"ref_id,omitempty"`
	// tags
	Tags []*string `json:"tags,omitempty" xml:"tags,omitempty" type:"Repeated"`
	// labels
	Labels []*string `json:"labels,omitempty" xml:"labels,omitempty" type:"Repeated"`
	// creator
	Creator *string `json:"creator,omitempty" xml:"creator,omitempty"`
	// download_count
	DownloadCount *int64 `json:"download_count,omitempty" xml:"download_count,omitempty"`
	// view_count
	ViewCount *int64 `json:"view_count,omitempty" xml:"view_count,omitempty"`
	// subscription_count
	SubscriptionCount *int64 `json:"subscription_count,omitempty" xml:"subscription_count,omitempty"`
	// recommend_flag
	RecommendFlag *bool `json:"recommend_flag,omitempty" xml:"recommend_flag,omitempty"`
	// status
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// subscription_status
	SubscriptionStatus *string `json:"subscription_status,omitempty" xml:"subscription_status,omitempty"`
	// channels
	Channels *string `json:"channels,omitempty" xml:"channels,omitempty"`
	// downloadable
	Downloadable *bool `json:"downloadable,omitempty" xml:"downloadable,omitempty"`
	// gmt_create
	GmtCreate *string `json:"gmt_create,omitempty" xml:"gmt_create,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// gmt_modified
	GmtModified *string `json:"gmt_modified,omitempty" xml:"gmt_modified,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})"`
	// version
	Version *string `json:"version,omitempty" xml:"version,omitempty"`
	// source
	Source *string `json:"source,omitempty" xml:"source,omitempty"`
	// meta
	Meta *string `json:"meta,omitempty" xml:"meta,omitempty"`
	// ext
	Ext *string `json:"ext,omitempty" xml:"ext,omitempty"`
	// modifier
	Modifier *string `json:"modifier,omitempty" xml:"modifier,omitempty"`
	// download_url
	DownloadUrl *string `json:"download_url,omitempty" xml:"download_url,omitempty"`
	// ext_parsed
	ExtParsed *string `json:"ext_parsed,omitempty" xml:"ext_parsed,omitempty"`
}

func (s GatewayMarketRichDetailVO) String() string {
	return tea.Prettify(s)
}

func (s GatewayMarketRichDetailVO) GoString() string {
	return s.String()
}

func (s *GatewayMarketRichDetailVO) SetId(v int64) *GatewayMarketRichDetailVO {
	s.Id = &v
	return s
}

func (s *GatewayMarketRichDetailVO) SetType(v string) *GatewayMarketRichDetailVO {
	s.Type = &v
	return s
}

func (s *GatewayMarketRichDetailVO) SetName(v string) *GatewayMarketRichDetailVO {
	s.Name = &v
	return s
}

func (s *GatewayMarketRichDetailVO) SetDescription(v string) *GatewayMarketRichDetailVO {
	s.Description = &v
	return s
}

func (s *GatewayMarketRichDetailVO) SetRefId(v int64) *GatewayMarketRichDetailVO {
	s.RefId = &v
	return s
}

func (s *GatewayMarketRichDetailVO) SetTags(v []*string) *GatewayMarketRichDetailVO {
	s.Tags = v
	return s
}

func (s *GatewayMarketRichDetailVO) SetLabels(v []*string) *GatewayMarketRichDetailVO {
	s.Labels = v
	return s
}

func (s *GatewayMarketRichDetailVO) SetCreator(v string) *GatewayMarketRichDetailVO {
	s.Creator = &v
	return s
}

func (s *GatewayMarketRichDetailVO) SetDownloadCount(v int64) *GatewayMarketRichDetailVO {
	s.DownloadCount = &v
	return s
}

func (s *GatewayMarketRichDetailVO) SetViewCount(v int64) *GatewayMarketRichDetailVO {
	s.ViewCount = &v
	return s
}

func (s *GatewayMarketRichDetailVO) SetSubscriptionCount(v int64) *GatewayMarketRichDetailVO {
	s.SubscriptionCount = &v
	return s
}

func (s *GatewayMarketRichDetailVO) SetRecommendFlag(v bool) *GatewayMarketRichDetailVO {
	s.RecommendFlag = &v
	return s
}

func (s *GatewayMarketRichDetailVO) SetStatus(v string) *GatewayMarketRichDetailVO {
	s.Status = &v
	return s
}

func (s *GatewayMarketRichDetailVO) SetSubscriptionStatus(v string) *GatewayMarketRichDetailVO {
	s.SubscriptionStatus = &v
	return s
}

func (s *GatewayMarketRichDetailVO) SetChannels(v string) *GatewayMarketRichDetailVO {
	s.Channels = &v
	return s
}

func (s *GatewayMarketRichDetailVO) SetDownloadable(v bool) *GatewayMarketRichDetailVO {
	s.Downloadable = &v
	return s
}

func (s *GatewayMarketRichDetailVO) SetGmtCreate(v string) *GatewayMarketRichDetailVO {
	s.GmtCreate = &v
	return s
}

func (s *GatewayMarketRichDetailVO) SetGmtModified(v string) *GatewayMarketRichDetailVO {
	s.GmtModified = &v
	return s
}

func (s *GatewayMarketRichDetailVO) SetVersion(v string) *GatewayMarketRichDetailVO {
	s.Version = &v
	return s
}

func (s *GatewayMarketRichDetailVO) SetSource(v string) *GatewayMarketRichDetailVO {
	s.Source = &v
	return s
}

func (s *GatewayMarketRichDetailVO) SetMeta(v string) *GatewayMarketRichDetailVO {
	s.Meta = &v
	return s
}

func (s *GatewayMarketRichDetailVO) SetExt(v string) *GatewayMarketRichDetailVO {
	s.Ext = &v
	return s
}

func (s *GatewayMarketRichDetailVO) SetModifier(v string) *GatewayMarketRichDetailVO {
	s.Modifier = &v
	return s
}

func (s *GatewayMarketRichDetailVO) SetDownloadUrl(v string) *GatewayMarketRichDetailVO {
	s.DownloadUrl = &v
	return s
}

func (s *GatewayMarketRichDetailVO) SetExtParsed(v string) *GatewayMarketRichDetailVO {
	s.ExtParsed = &v
	return s
}

// 删除Agent会话 Result
type DeleteSessionFromAgentChatHistoryResult struct {
	// success
	Success *bool `json:"success,omitempty" xml:"success,omitempty" require:"true"`
	// code
	Code *string `json:"code,omitempty" xml:"code,omitempty" require:"true"`
	// 返回结果信息
	//
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty" require:"true"`
	// trace_id
	TraceId *string `json:"trace_id,omitempty" xml:"trace_id,omitempty" require:"true"`
	// req_id
	ReqId *string `json:"req_id,omitempty" xml:"req_id,omitempty" require:"true"`
}

func (s DeleteSessionFromAgentChatHistoryResult) String() string {
	return tea.Prettify(s)
}

func (s DeleteSessionFromAgentChatHistoryResult) GoString() string {
	return s.String()
}

func (s *DeleteSessionFromAgentChatHistoryResult) SetSuccess(v bool) *DeleteSessionFromAgentChatHistoryResult {
	s.Success = &v
	return s
}

func (s *DeleteSessionFromAgentChatHistoryResult) SetCode(v string) *DeleteSessionFromAgentChatHistoryResult {
	s.Code = &v
	return s
}

func (s *DeleteSessionFromAgentChatHistoryResult) SetMsg(v string) *DeleteSessionFromAgentChatHistoryResult {
	s.Msg = &v
	return s
}

func (s *DeleteSessionFromAgentChatHistoryResult) SetTraceId(v string) *DeleteSessionFromAgentChatHistoryResult {
	s.TraceId = &v
	return s
}

func (s *DeleteSessionFromAgentChatHistoryResult) SetReqId(v string) *DeleteSessionFromAgentChatHistoryResult {
	s.ReqId = &v
	return s
}

// Agent对话-上传文件 Result
type UploadAttachmentFileResult struct {
	// success
	Success *bool `json:"success,omitempty" xml:"success,omitempty" require:"true"`
	// code
	Code *string `json:"code,omitempty" xml:"code,omitempty" require:"true"`
	// msg
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty" require:"true"`
	// trace_id
	TraceId *string `json:"trace_id,omitempty" xml:"trace_id,omitempty" require:"true"`
	// req_id
	ReqId *string `json:"req_id,omitempty" xml:"req_id,omitempty" require:"true"`
	// 上传解析结果
	//
	Result *UploadAttachmentFileVO `json:"result,omitempty" xml:"result,omitempty" require:"true"`
}

func (s UploadAttachmentFileResult) String() string {
	return tea.Prettify(s)
}

func (s UploadAttachmentFileResult) GoString() string {
	return s.String()
}

func (s *UploadAttachmentFileResult) SetSuccess(v bool) *UploadAttachmentFileResult {
	s.Success = &v
	return s
}

func (s *UploadAttachmentFileResult) SetCode(v string) *UploadAttachmentFileResult {
	s.Code = &v
	return s
}

func (s *UploadAttachmentFileResult) SetMsg(v string) *UploadAttachmentFileResult {
	s.Msg = &v
	return s
}

func (s *UploadAttachmentFileResult) SetTraceId(v string) *UploadAttachmentFileResult {
	s.TraceId = &v
	return s
}

func (s *UploadAttachmentFileResult) SetReqId(v string) *UploadAttachmentFileResult {
	s.ReqId = &v
	return s
}

func (s *UploadAttachmentFileResult) SetResult(v *UploadAttachmentFileVO) *UploadAttachmentFileResult {
	s.Result = v
	return s
}

// MCP已订阅清单Request
type MCPServerQueryPageGatewayRequest struct {
	// 空间id
	SpaceId *string `json:"space_id,omitempty" xml:"space_id,omitempty" require:"true"`
	// 运行模式
	RunMode *string `json:"run_mode,omitempty" xml:"run_mode,omitempty"`
	// 来源
	Source *string `json:"source,omitempty" xml:"source,omitempty"`
	// 查询条件
	Query *string `json:"query,omitempty" xml:"query,omitempty"`
	// 页码
	PageNum *int64 `json:"page_num,omitempty" xml:"page_num,omitempty" require:"true"`
	// 分页大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
}

func (s MCPServerQueryPageGatewayRequest) String() string {
	return tea.Prettify(s)
}

func (s MCPServerQueryPageGatewayRequest) GoString() string {
	return s.String()
}

func (s *MCPServerQueryPageGatewayRequest) SetSpaceId(v string) *MCPServerQueryPageGatewayRequest {
	s.SpaceId = &v
	return s
}

func (s *MCPServerQueryPageGatewayRequest) SetRunMode(v string) *MCPServerQueryPageGatewayRequest {
	s.RunMode = &v
	return s
}

func (s *MCPServerQueryPageGatewayRequest) SetSource(v string) *MCPServerQueryPageGatewayRequest {
	s.Source = &v
	return s
}

func (s *MCPServerQueryPageGatewayRequest) SetQuery(v string) *MCPServerQueryPageGatewayRequest {
	s.Query = &v
	return s
}

func (s *MCPServerQueryPageGatewayRequest) SetPageNum(v int64) *MCPServerQueryPageGatewayRequest {
	s.PageNum = &v
	return s
}

func (s *MCPServerQueryPageGatewayRequest) SetPageSize(v int64) *MCPServerQueryPageGatewayRequest {
	s.PageSize = &v
	return s
}

// 获取 Agent 详情 Result
type AgentDtailResult struct {
	// success
	Success *bool `json:"success,omitempty" xml:"success,omitempty" require:"true"`
	// code
	Code *string `json:"code,omitempty" xml:"code,omitempty" require:"true"`
	// msg
	Msg *string `json:"msg,omitempty" xml:"msg,omitempty" require:"true"`
	// trace_id
	TraceId *string `json:"trace_id,omitempty" xml:"trace_id,omitempty" require:"true"`
	// req_id
	ReqId *string `json:"req_id,omitempty" xml:"req_id,omitempty" require:"true"`
	// 返回结果
	//
	Result *AgentVO `json:"result,omitempty" xml:"result,omitempty" require:"true"`
}

func (s AgentDtailResult) String() string {
	return tea.Prettify(s)
}

func (s AgentDtailResult) GoString() string {
	return s.String()
}

func (s *AgentDtailResult) SetSuccess(v bool) *AgentDtailResult {
	s.Success = &v
	return s
}

func (s *AgentDtailResult) SetCode(v string) *AgentDtailResult {
	s.Code = &v
	return s
}

func (s *AgentDtailResult) SetMsg(v string) *AgentDtailResult {
	s.Msg = &v
	return s
}

func (s *AgentDtailResult) SetTraceId(v string) *AgentDtailResult {
	s.TraceId = &v
	return s
}

func (s *AgentDtailResult) SetReqId(v string) *AgentDtailResult {
	s.ReqId = &v
	return s
}

func (s *AgentDtailResult) SetResult(v *AgentVO) *AgentDtailResult {
	s.Result = v
	return s
}

// 知识库-文档列表-分页对象
type LibraryDocPageResult struct {
	// 请求处理结果标识
	Success *bool `json:"success,omitempty" xml:"success,omitempty" require:"true"`
	// 业务状态码
	Code *string `json:"code,omitempty" xml:"code,omitempty" require:"true"`
	// 返回消息
	Message *string `json:"message,omitempty" xml:"message,omitempty" require:"true"`
	// 请求链路追踪ID
	TraceId *string `json:"trace_id,omitempty" xml:"trace_id,omitempty" require:"true"`
	// 符合查询条件的总记录数
	TotalCount *int64 `json:"total_count,omitempty" xml:"total_count,omitempty" require:"true"`
	// 当前返回数据的页码
	CurrentPage *int64 `json:"current_page,omitempty" xml:"current_page,omitempty" require:"true"`
	// 分页大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
	// 文档数据列表
	Result []*ContentFile `json:"result,omitempty" xml:"result,omitempty" require:"true" type:"Repeated"`
}

func (s LibraryDocPageResult) String() string {
	return tea.Prettify(s)
}

func (s LibraryDocPageResult) GoString() string {
	return s.String()
}

func (s *LibraryDocPageResult) SetSuccess(v bool) *LibraryDocPageResult {
	s.Success = &v
	return s
}

func (s *LibraryDocPageResult) SetCode(v string) *LibraryDocPageResult {
	s.Code = &v
	return s
}

func (s *LibraryDocPageResult) SetMessage(v string) *LibraryDocPageResult {
	s.Message = &v
	return s
}

func (s *LibraryDocPageResult) SetTraceId(v string) *LibraryDocPageResult {
	s.TraceId = &v
	return s
}

func (s *LibraryDocPageResult) SetTotalCount(v int64) *LibraryDocPageResult {
	s.TotalCount = &v
	return s
}

func (s *LibraryDocPageResult) SetCurrentPage(v int64) *LibraryDocPageResult {
	s.CurrentPage = &v
	return s
}

func (s *LibraryDocPageResult) SetPageSize(v int64) *LibraryDocPageResult {
	s.PageSize = &v
	return s
}

func (s *LibraryDocPageResult) SetResult(v []*ContentFile) *LibraryDocPageResult {
	s.Result = v
	return s
}

type QueryAntdigitalDtaiagtMarketRichdetailRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 市场条目 ID，必填
	Id *int64 `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// 当前空间 ID（用于判断订阅状态），非必填
	BotId *int64 `json:"bot_id,omitempty" xml:"bot_id,omitempty"`
}

func (s QueryAntdigitalDtaiagtMarketRichdetailRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAntdigitalDtaiagtMarketRichdetailRequest) GoString() string {
	return s.String()
}

func (s *QueryAntdigitalDtaiagtMarketRichdetailRequest) SetAuthToken(v string) *QueryAntdigitalDtaiagtMarketRichdetailRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAntdigitalDtaiagtMarketRichdetailRequest) SetProductInstanceId(v string) *QueryAntdigitalDtaiagtMarketRichdetailRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryAntdigitalDtaiagtMarketRichdetailRequest) SetId(v int64) *QueryAntdigitalDtaiagtMarketRichdetailRequest {
	s.Id = &v
	return s
}

func (s *QueryAntdigitalDtaiagtMarketRichdetailRequest) SetBotId(v int64) *QueryAntdigitalDtaiagtMarketRichdetailRequest {
	s.BotId = &v
	return s
}

type QueryAntdigitalDtaiagtMarketRichdetailResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// Agentar Result
	Data *StringResult `json:"data,omitempty" xml:"data,omitempty"`
}

func (s QueryAntdigitalDtaiagtMarketRichdetailResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAntdigitalDtaiagtMarketRichdetailResponse) GoString() string {
	return s.String()
}

func (s *QueryAntdigitalDtaiagtMarketRichdetailResponse) SetReqMsgId(v string) *QueryAntdigitalDtaiagtMarketRichdetailResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAntdigitalDtaiagtMarketRichdetailResponse) SetResultCode(v string) *QueryAntdigitalDtaiagtMarketRichdetailResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAntdigitalDtaiagtMarketRichdetailResponse) SetResultMsg(v string) *QueryAntdigitalDtaiagtMarketRichdetailResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAntdigitalDtaiagtMarketRichdetailResponse) SetData(v *StringResult) *QueryAntdigitalDtaiagtMarketRichdetailResponse {
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
				"sdk_version":      tea.String("1.0.0"),
				"_prod_code":       tea.String("DTAIAGTMNG"),
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
 * Description: 通用市场列表查询
 * Summary: 通用市场列表查询
 */
func (client *Client) QueryAntdigitalDtaiagtMarketRichdetail(request *QueryAntdigitalDtaiagtMarketRichdetailRequest) (_result *QueryAntdigitalDtaiagtMarketRichdetailResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAntdigitalDtaiagtMarketRichdetailResponse{}
	_body, _err := client.QueryAntdigitalDtaiagtMarketRichdetailEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 通用市场列表查询
 * Summary: 通用市场列表查询
 */
func (client *Client) QueryAntdigitalDtaiagtMarketRichdetailEx(request *QueryAntdigitalDtaiagtMarketRichdetailRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAntdigitalDtaiagtMarketRichdetailResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAntdigitalDtaiagtMarketRichdetailResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.dtaiagt.market.richdetail.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
