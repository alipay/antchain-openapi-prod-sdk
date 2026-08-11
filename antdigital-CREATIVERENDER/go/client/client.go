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

// DataPart represents a structured blob.
type DataPart struct {
	// A JSON object containing arbitrary data.
	// example:
	//
	// data
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
}

func (s DataPart) String() string {
	return tea.Prettify(s)
}

func (s DataPart) GoString() string {
	return s.String()
}

func (s *DataPart) SetData(v string) *DataPart {
	s.Data = &v
	return s
}

// Part represents a container for a section of communication content.
type Part struct {
	// the string content of the text part.
	// example:
	//
	// content
	Text *string `json:"text,omitempty" xml:"text,omitempty"`
	// The structured data content.
	Data *DataPart `json:"data,omitempty" xml:"data,omitempty"`
}

func (s Part) String() string {
	return tea.Prettify(s)
}

func (s Part) GoString() string {
	return s.String()
}

func (s *Part) SetText(v string) *Part {
	s.Text = &v
	return s
}

func (s *Part) SetData(v *DataPart) *Part {
	s.Data = v
	return s
}

// Message is one unit of communication between client and server.
type Message struct {
	// Parts is the container of the message content.
	Parts []*Part `json:"parts,omitempty" xml:"parts,omitempty" type:"Repeated"`
	// Identifies the sender of the message.
	// USER role refers to communication from the client to the server.
	// AGENT role refers to communication from the server to the client.
	// example:
	//
	// USER
	Role *string `json:"role,omitempty" xml:"role,omitempty"`
	// The context id of the message. This is optional and if set, the message will be associated with the given context(a specific conversation or session).
	// example:
	//
	// contextid
	ContextId *string `json:"context_id,omitempty" xml:"context_id,omitempty"`
}

func (s Message) String() string {
	return tea.Prettify(s)
}

func (s Message) GoString() string {
	return s.String()
}

func (s *Message) SetParts(v []*Part) *Message {
	s.Parts = v
	return s
}

func (s *Message) SetRole(v string) *Message {
	s.Role = &v
	return s
}

func (s *Message) SetContextId(v string) *Message {
	s.ContextId = &v
	return s
}

// Artifacts represent task outputs.
type Artifact struct {
	// The content of the artifact. Must contain at least one part.
	Parts []*Part `json:"parts,omitempty" xml:"parts,omitempty" type:"Repeated"`
}

func (s Artifact) String() string {
	return tea.Prettify(s)
}

func (s Artifact) GoString() string {
	return s.String()
}

func (s *Artifact) SetParts(v []*Part) *Artifact {
	s.Parts = v
	return s
}

// A container for the status of a task
type TaskStatus struct {
	// The current state of this task.
	// example:
	//
	// TASK_STATE_COMPLETED
	State *string `json:"state,omitempty" xml:"state,omitempty" require:"true"`
	// A message associated with the status.
	Message *Message `json:"message,omitempty" xml:"message,omitempty" require:"true"`
}

func (s TaskStatus) String() string {
	return tea.Prettify(s)
}

func (s TaskStatus) GoString() string {
	return s.String()
}

func (s *TaskStatus) SetState(v string) *TaskStatus {
	s.State = &v
	return s
}

func (s *TaskStatus) SetMessage(v *Message) *TaskStatus {
	s.Message = v
	return s
}

// ASSISTANT 消息特有信息
type AssistantExtra struct {
	// 任务id
	// example:
	//
	// M_d3f7859e845a4ed58bedc446fec32427
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty"`
	// 生图状态
	// example:
	//
	// PROCESSING
	RenderStatus *string `json:"render_status,omitempty" xml:"render_status,omitempty"`
	// 生图结果
	// example:
	//
	// undefined
	ResultUrl []*string `json:"result_url,omitempty" xml:"result_url,omitempty" type:"Repeated"`
}

func (s AssistantExtra) String() string {
	return tea.Prettify(s)
}

func (s AssistantExtra) GoString() string {
	return s.String()
}

func (s *AssistantExtra) SetTaskId(v string) *AssistantExtra {
	s.TaskId = &v
	return s
}

func (s *AssistantExtra) SetRenderStatus(v string) *AssistantExtra {
	s.RenderStatus = &v
	return s
}

func (s *AssistantExtra) SetResultUrl(v []*string) *AssistantExtra {
	s.ResultUrl = v
	return s
}

// 参考样式素材引用
type CreativeAssetRef struct {
	// 素材来源
	// example:
	//
	// URL
	SourceType *string `json:"source_type,omitempty" xml:"source_type,omitempty" require:"true"`
	// 素材ID，只有素材来源于creative的素材库中才需要填入
	// example:
	//
	// 5bf62f7dd73b4efa8dea7a2665cd2173
	MaterialId *string `json:"material_id,omitempty" xml:"material_id,omitempty"`
	// 可公网访问的素材url地址
	// example:
	//
	// https://mdn.alipayobjects.com/wofi_creative/afts/file/80mwSruGUE4AAAAAAAAAAAAA-FZ4AQJr
	Url *string `json:"url,omitempty" xml:"url,omitempty"`
	// 使用提示
	// example:
	//
	// 二维码保持清晰
	UsageHint *string `json:"usage_hint,omitempty" xml:"usage_hint,omitempty"`
}

func (s CreativeAssetRef) String() string {
	return tea.Prettify(s)
}

func (s CreativeAssetRef) GoString() string {
	return s.String()
}

func (s *CreativeAssetRef) SetSourceType(v string) *CreativeAssetRef {
	s.SourceType = &v
	return s
}

func (s *CreativeAssetRef) SetMaterialId(v string) *CreativeAssetRef {
	s.MaterialId = &v
	return s
}

func (s *CreativeAssetRef) SetUrl(v string) *CreativeAssetRef {
	s.Url = &v
	return s
}

func (s *CreativeAssetRef) SetUsageHint(v string) *CreativeAssetRef {
	s.UsageHint = &v
	return s
}

// Task is the core unit of action for A2A. It has a current status and when results are created for the task they are stored in the artifact.
type Task struct {
	// Unique identifier (e.g. UUID) for the task, generated by the server for a new task.
	// example:
	//
	// 6c7a3d8f9e544c5ab3e17f2a1b9c4e8d
	Id *string `json:"id,omitempty" xml:"id,omitempty" require:"true"`
	// Unique identifier (e.g. UUID) for the contextual collection of interactions (tasks and messages). Created by the A2A server.
	// example:
	//
	// contextid
	ContextId *string `json:"context_id,omitempty" xml:"context_id,omitempty"`
	// The current status of a Task, including state and a message.
	Status *TaskStatus `json:"status,omitempty" xml:"status,omitempty" require:"true"`
	// A set of output artifacts for a Task.
	Artifacts []*Artifact `json:"artifacts,omitempty" xml:"artifacts,omitempty" require:"true" type:"Repeated"`
}

func (s Task) String() string {
	return tea.Prettify(s)
}

func (s Task) GoString() string {
	return s.String()
}

func (s *Task) SetId(v string) *Task {
	s.Id = &v
	return s
}

func (s *Task) SetContextId(v string) *Task {
	s.ContextId = &v
	return s
}

func (s *Task) SetStatus(v *TaskStatus) *Task {
	s.Status = v
	return s
}

func (s *Task) SetArtifacts(v []*Artifact) *Task {
	s.Artifacts = v
	return s
}

type ExecAntcloudMarketingagentChatCreativeRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 会话ID，如需支持多轮对话，需要传入之前的会话ID
	SessionId *string `json:"session_id,omitempty" xml:"session_id,omitempty"`
	// 服务类型（默认IMAGE_RENDER）
	EntryType *string `json:"entry_type,omitempty" xml:"entry_type,omitempty"`
	// 表达用户意图
	Prompt *string `json:"prompt,omitempty" xml:"prompt,omitempty" require:"true"`
	// 参考样式
	ReferenceStyle *CreativeAssetRef `json:"reference_style,omitempty" xml:"reference_style,omitempty"`
	// 输入元素
	InputElements []*CreativeAssetRef `json:"input_elements,omitempty" xml:"input_elements,omitempty" type:"Repeated"`
	// 使用场景
	Scene *string `json:"scene,omitempty" xml:"scene,omitempty"`
	// 生图宽度
	Width *int64 `json:"width,omitempty" xml:"width,omitempty"`
	// 生图高度
	Height *int64 `json:"height,omitempty" xml:"height,omitempty"`
}

func (s ExecAntcloudMarketingagentChatCreativeRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecAntcloudMarketingagentChatCreativeRequest) GoString() string {
	return s.String()
}

func (s *ExecAntcloudMarketingagentChatCreativeRequest) SetAuthToken(v string) *ExecAntcloudMarketingagentChatCreativeRequest {
	s.AuthToken = &v
	return s
}

func (s *ExecAntcloudMarketingagentChatCreativeRequest) SetSessionId(v string) *ExecAntcloudMarketingagentChatCreativeRequest {
	s.SessionId = &v
	return s
}

func (s *ExecAntcloudMarketingagentChatCreativeRequest) SetEntryType(v string) *ExecAntcloudMarketingagentChatCreativeRequest {
	s.EntryType = &v
	return s
}

func (s *ExecAntcloudMarketingagentChatCreativeRequest) SetPrompt(v string) *ExecAntcloudMarketingagentChatCreativeRequest {
	s.Prompt = &v
	return s
}

func (s *ExecAntcloudMarketingagentChatCreativeRequest) SetReferenceStyle(v *CreativeAssetRef) *ExecAntcloudMarketingagentChatCreativeRequest {
	s.ReferenceStyle = v
	return s
}

func (s *ExecAntcloudMarketingagentChatCreativeRequest) SetInputElements(v []*CreativeAssetRef) *ExecAntcloudMarketingagentChatCreativeRequest {
	s.InputElements = v
	return s
}

func (s *ExecAntcloudMarketingagentChatCreativeRequest) SetScene(v string) *ExecAntcloudMarketingagentChatCreativeRequest {
	s.Scene = &v
	return s
}

func (s *ExecAntcloudMarketingagentChatCreativeRequest) SetWidth(v int64) *ExecAntcloudMarketingagentChatCreativeRequest {
	s.Width = &v
	return s
}

func (s *ExecAntcloudMarketingagentChatCreativeRequest) SetHeight(v int64) *ExecAntcloudMarketingagentChatCreativeRequest {
	s.Height = &v
	return s
}

type ExecAntcloudMarketingagentChatCreativeResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 消息ID
	MessageId *string `json:"message_id,omitempty" xml:"message_id,omitempty"`
	// 所属会话ID
	SessionId *string `json:"session_id,omitempty" xml:"session_id,omitempty"`
	// 消息角色
	Role *string `json:"role,omitempty" xml:"role,omitempty"`
	// 消息状态
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 消息内容
	Content *string `json:"content,omitempty" xml:"content,omitempty"`
	// ASSISTANT消息的额外信息
	AssistantExtra *AssistantExtra `json:"assistant_extra,omitempty" xml:"assistant_extra,omitempty"`
}

func (s ExecAntcloudMarketingagentChatCreativeResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecAntcloudMarketingagentChatCreativeResponse) GoString() string {
	return s.String()
}

func (s *ExecAntcloudMarketingagentChatCreativeResponse) SetReqMsgId(v string) *ExecAntcloudMarketingagentChatCreativeResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ExecAntcloudMarketingagentChatCreativeResponse) SetResultCode(v string) *ExecAntcloudMarketingagentChatCreativeResponse {
	s.ResultCode = &v
	return s
}

func (s *ExecAntcloudMarketingagentChatCreativeResponse) SetResultMsg(v string) *ExecAntcloudMarketingagentChatCreativeResponse {
	s.ResultMsg = &v
	return s
}

func (s *ExecAntcloudMarketingagentChatCreativeResponse) SetMessageId(v string) *ExecAntcloudMarketingagentChatCreativeResponse {
	s.MessageId = &v
	return s
}

func (s *ExecAntcloudMarketingagentChatCreativeResponse) SetSessionId(v string) *ExecAntcloudMarketingagentChatCreativeResponse {
	s.SessionId = &v
	return s
}

func (s *ExecAntcloudMarketingagentChatCreativeResponse) SetRole(v string) *ExecAntcloudMarketingagentChatCreativeResponse {
	s.Role = &v
	return s
}

func (s *ExecAntcloudMarketingagentChatCreativeResponse) SetStatus(v string) *ExecAntcloudMarketingagentChatCreativeResponse {
	s.Status = &v
	return s
}

func (s *ExecAntcloudMarketingagentChatCreativeResponse) SetContent(v string) *ExecAntcloudMarketingagentChatCreativeResponse {
	s.Content = &v
	return s
}

func (s *ExecAntcloudMarketingagentChatCreativeResponse) SetAssistantExtra(v *AssistantExtra) *ExecAntcloudMarketingagentChatCreativeResponse {
	s.AssistantExtra = v
	return s
}

type ExecAntcloudMarketingagentCreativeChatRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 会话ID，如需支持多轮对话，需要传入之前的会话ID
	SessionId *string `json:"session_id,omitempty" xml:"session_id,omitempty"`
	// 服务类型（默认IMAGE_RENDER）
	EntryType *string `json:"entry_type,omitempty" xml:"entry_type,omitempty"`
	// 表达用户意图
	Prompt *string `json:"prompt,omitempty" xml:"prompt,omitempty" require:"true"`
	// 参考样式
	ReferenceStyle *CreativeAssetRef `json:"reference_style,omitempty" xml:"reference_style,omitempty"`
	// 输入元素
	InputElements []*AssistantExtra `json:"input_elements,omitempty" xml:"input_elements,omitempty" type:"Repeated"`
	// 使用场景
	Scene *string `json:"scene,omitempty" xml:"scene,omitempty"`
	// 生图宽度
	Width *string `json:"width,omitempty" xml:"width,omitempty"`
	// 生图高度
	Height *string `json:"height,omitempty" xml:"height,omitempty"`
}

func (s ExecAntcloudMarketingagentCreativeChatRequest) String() string {
	return tea.Prettify(s)
}

func (s ExecAntcloudMarketingagentCreativeChatRequest) GoString() string {
	return s.String()
}

func (s *ExecAntcloudMarketingagentCreativeChatRequest) SetAuthToken(v string) *ExecAntcloudMarketingagentCreativeChatRequest {
	s.AuthToken = &v
	return s
}

func (s *ExecAntcloudMarketingagentCreativeChatRequest) SetSessionId(v string) *ExecAntcloudMarketingagentCreativeChatRequest {
	s.SessionId = &v
	return s
}

func (s *ExecAntcloudMarketingagentCreativeChatRequest) SetEntryType(v string) *ExecAntcloudMarketingagentCreativeChatRequest {
	s.EntryType = &v
	return s
}

func (s *ExecAntcloudMarketingagentCreativeChatRequest) SetPrompt(v string) *ExecAntcloudMarketingagentCreativeChatRequest {
	s.Prompt = &v
	return s
}

func (s *ExecAntcloudMarketingagentCreativeChatRequest) SetReferenceStyle(v *CreativeAssetRef) *ExecAntcloudMarketingagentCreativeChatRequest {
	s.ReferenceStyle = v
	return s
}

func (s *ExecAntcloudMarketingagentCreativeChatRequest) SetInputElements(v []*AssistantExtra) *ExecAntcloudMarketingagentCreativeChatRequest {
	s.InputElements = v
	return s
}

func (s *ExecAntcloudMarketingagentCreativeChatRequest) SetScene(v string) *ExecAntcloudMarketingagentCreativeChatRequest {
	s.Scene = &v
	return s
}

func (s *ExecAntcloudMarketingagentCreativeChatRequest) SetWidth(v string) *ExecAntcloudMarketingagentCreativeChatRequest {
	s.Width = &v
	return s
}

func (s *ExecAntcloudMarketingagentCreativeChatRequest) SetHeight(v string) *ExecAntcloudMarketingagentCreativeChatRequest {
	s.Height = &v
	return s
}

type ExecAntcloudMarketingagentCreativeChatResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 消息ID
	MessageId *string `json:"message_id,omitempty" xml:"message_id,omitempty"`
	// 所属会话ID
	SessionId *string `json:"session_id,omitempty" xml:"session_id,omitempty"`
	// 消息角色
	Role *string `json:"role,omitempty" xml:"role,omitempty"`
	// 消息状态
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 消息内容
	Content *string `json:"content,omitempty" xml:"content,omitempty"`
	// ASSISTANT消息的额外信息
	AssistantExtra *AssistantExtra `json:"assistant_extra,omitempty" xml:"assistant_extra,omitempty"`
}

func (s ExecAntcloudMarketingagentCreativeChatResponse) String() string {
	return tea.Prettify(s)
}

func (s ExecAntcloudMarketingagentCreativeChatResponse) GoString() string {
	return s.String()
}

func (s *ExecAntcloudMarketingagentCreativeChatResponse) SetReqMsgId(v string) *ExecAntcloudMarketingagentCreativeChatResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ExecAntcloudMarketingagentCreativeChatResponse) SetResultCode(v string) *ExecAntcloudMarketingagentCreativeChatResponse {
	s.ResultCode = &v
	return s
}

func (s *ExecAntcloudMarketingagentCreativeChatResponse) SetResultMsg(v string) *ExecAntcloudMarketingagentCreativeChatResponse {
	s.ResultMsg = &v
	return s
}

func (s *ExecAntcloudMarketingagentCreativeChatResponse) SetMessageId(v string) *ExecAntcloudMarketingagentCreativeChatResponse {
	s.MessageId = &v
	return s
}

func (s *ExecAntcloudMarketingagentCreativeChatResponse) SetSessionId(v string) *ExecAntcloudMarketingagentCreativeChatResponse {
	s.SessionId = &v
	return s
}

func (s *ExecAntcloudMarketingagentCreativeChatResponse) SetRole(v string) *ExecAntcloudMarketingagentCreativeChatResponse {
	s.Role = &v
	return s
}

func (s *ExecAntcloudMarketingagentCreativeChatResponse) SetStatus(v string) *ExecAntcloudMarketingagentCreativeChatResponse {
	s.Status = &v
	return s
}

func (s *ExecAntcloudMarketingagentCreativeChatResponse) SetContent(v string) *ExecAntcloudMarketingagentCreativeChatResponse {
	s.Content = &v
	return s
}

func (s *ExecAntcloudMarketingagentCreativeChatResponse) SetAssistantExtra(v *AssistantExtra) *ExecAntcloudMarketingagentCreativeChatResponse {
	s.AssistantExtra = v
	return s
}

type QueryAntcloudMarketingagentCreativeResultRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 消息ID
	MessageId *string `json:"message_id,omitempty" xml:"message_id,omitempty" require:"true"`
}

func (s QueryAntcloudMarketingagentCreativeResultRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryAntcloudMarketingagentCreativeResultRequest) GoString() string {
	return s.String()
}

func (s *QueryAntcloudMarketingagentCreativeResultRequest) SetAuthToken(v string) *QueryAntcloudMarketingagentCreativeResultRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryAntcloudMarketingagentCreativeResultRequest) SetMessageId(v string) *QueryAntcloudMarketingagentCreativeResultRequest {
	s.MessageId = &v
	return s
}

type QueryAntcloudMarketingagentCreativeResultResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 会话ID
	SessionId *string `json:"session_id,omitempty" xml:"session_id,omitempty"`
	// 消息ID
	MessageId *string `json:"message_id,omitempty" xml:"message_id,omitempty"`
	// 消息状态
	Status *string `json:"status,omitempty" xml:"status,omitempty"`
	// 消息内容
	Content *string `json:"content,omitempty" xml:"content,omitempty"`
	// agent消息扩展信息
	AssistantExtra *AssistantExtra `json:"assistant_extra,omitempty" xml:"assistant_extra,omitempty"`
}

func (s QueryAntcloudMarketingagentCreativeResultResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryAntcloudMarketingagentCreativeResultResponse) GoString() string {
	return s.String()
}

func (s *QueryAntcloudMarketingagentCreativeResultResponse) SetReqMsgId(v string) *QueryAntcloudMarketingagentCreativeResultResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryAntcloudMarketingagentCreativeResultResponse) SetResultCode(v string) *QueryAntcloudMarketingagentCreativeResultResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryAntcloudMarketingagentCreativeResultResponse) SetResultMsg(v string) *QueryAntcloudMarketingagentCreativeResultResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryAntcloudMarketingagentCreativeResultResponse) SetSessionId(v string) *QueryAntcloudMarketingagentCreativeResultResponse {
	s.SessionId = &v
	return s
}

func (s *QueryAntcloudMarketingagentCreativeResultResponse) SetMessageId(v string) *QueryAntcloudMarketingagentCreativeResultResponse {
	s.MessageId = &v
	return s
}

func (s *QueryAntcloudMarketingagentCreativeResultResponse) SetStatus(v string) *QueryAntcloudMarketingagentCreativeResultResponse {
	s.Status = &v
	return s
}

func (s *QueryAntcloudMarketingagentCreativeResultResponse) SetContent(v string) *QueryAntcloudMarketingagentCreativeResultResponse {
	s.Content = &v
	return s
}

func (s *QueryAntcloudMarketingagentCreativeResultResponse) SetAssistantExtra(v *AssistantExtra) *QueryAntcloudMarketingagentCreativeResultResponse {
	s.AssistantExtra = v
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
				"sdk_version":      tea.String("2.0.3"),
				"_prod_code":       tea.String("CREATIVERENDER"),
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
// Description: 创意素材中心chat生图接口
//
// Summary: 创意素材中心chat生图接口
func (client *Client) ExecAntcloudMarketingagentChatCreative(request *ExecAntcloudMarketingagentChatCreativeRequest) (_result *ExecAntcloudMarketingagentChatCreativeResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ExecAntcloudMarketingagentChatCreativeResponse{}
	_body, _err := client.ExecAntcloudMarketingagentChatCreativeEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 创意素材中心chat生图接口
//
// Summary: 创意素材中心chat生图接口
func (client *Client) ExecAntcloudMarketingagentChatCreativeEx(request *ExecAntcloudMarketingagentChatCreativeRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ExecAntcloudMarketingagentChatCreativeResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecAntcloudMarketingagentChatCreativeResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.marketingagent.chat.creative.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 创意素材chat接口
//
// Summary: 创意素材chat接口
func (client *Client) ExecAntcloudMarketingagentCreativeChat(request *ExecAntcloudMarketingagentCreativeChatRequest) (_result *ExecAntcloudMarketingagentCreativeChatResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ExecAntcloudMarketingagentCreativeChatResponse{}
	_body, _err := client.ExecAntcloudMarketingagentCreativeChatEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 创意素材chat接口
//
// Summary: 创意素材chat接口
func (client *Client) ExecAntcloudMarketingagentCreativeChatEx(request *ExecAntcloudMarketingagentCreativeChatRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ExecAntcloudMarketingagentCreativeChatResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExecAntcloudMarketingagentCreativeChatResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.marketingagent.creative.chat.exec"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: chat结果查询接口
//
// Summary: chat结果查询接口
func (client *Client) QueryAntcloudMarketingagentCreativeResult(request *QueryAntcloudMarketingagentCreativeResultRequest) (_result *QueryAntcloudMarketingagentCreativeResultResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryAntcloudMarketingagentCreativeResultResponse{}
	_body, _err := client.QueryAntcloudMarketingagentCreativeResultEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: chat结果查询接口
//
// Summary: chat结果查询接口
func (client *Client) QueryAntcloudMarketingagentCreativeResultEx(request *QueryAntcloudMarketingagentCreativeResultRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryAntcloudMarketingagentCreativeResultResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryAntcloudMarketingagentCreativeResultResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.marketingagent.creative.result.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
