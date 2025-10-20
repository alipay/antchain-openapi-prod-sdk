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
	ToolList *ToolInfoVO `json:"tool_list,omitempty" xml:"tool_list,omitempty" require:"true"`
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

func (s *DigitalGatewayMCPDetailVO) SetToolList(v *ToolInfoVO) *DigitalGatewayMCPDetailVO {
	s.ToolList = v
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

type StartOpenaiChatRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 参数内容为 ChatCompletionRequest 的 JSON 字符串
	ChatCompletionRequest *string `json:"chat_completion_request,omitempty" xml:"chat_completion_request,omitempty" require:"true"`
}

func (s StartOpenaiChatRequest) String() string {
	return tea.Prettify(s)
}

func (s StartOpenaiChatRequest) GoString() string {
	return s.String()
}

func (s *StartOpenaiChatRequest) SetAuthToken(v string) *StartOpenaiChatRequest {
	s.AuthToken = &v
	return s
}

func (s *StartOpenaiChatRequest) SetProductInstanceId(v string) *StartOpenaiChatRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *StartOpenaiChatRequest) SetChatCompletionRequest(v string) *StartOpenaiChatRequest {
	s.ChatCompletionRequest = &v
	return s
}

type StartOpenaiChatResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 会话结果
	ChatCompletionObject *string `json:"chat_completion_object,omitempty" xml:"chat_completion_object,omitempty"`
}

func (s StartOpenaiChatResponse) String() string {
	return tea.Prettify(s)
}

func (s StartOpenaiChatResponse) GoString() string {
	return s.String()
}

func (s *StartOpenaiChatResponse) SetReqMsgId(v string) *StartOpenaiChatResponse {
	s.ReqMsgId = &v
	return s
}

func (s *StartOpenaiChatResponse) SetResultCode(v string) *StartOpenaiChatResponse {
	s.ResultCode = &v
	return s
}

func (s *StartOpenaiChatResponse) SetResultMsg(v string) *StartOpenaiChatResponse {
	s.ResultMsg = &v
	return s
}

func (s *StartOpenaiChatResponse) SetChatCompletionObject(v string) *StartOpenaiChatResponse {
	s.ChatCompletionObject = &v
	return s
}

type StartAgentChatRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 请求内容，内容为 AgentChatReq 对象的json字符串
	AgentChatRequest *string `json:"agent_chat_request,omitempty" xml:"agent_chat_request,omitempty" require:"true"`
}

func (s StartAgentChatRequest) String() string {
	return tea.Prettify(s)
}

func (s StartAgentChatRequest) GoString() string {
	return s.String()
}

func (s *StartAgentChatRequest) SetAuthToken(v string) *StartAgentChatRequest {
	s.AuthToken = &v
	return s
}

func (s *StartAgentChatRequest) SetProductInstanceId(v string) *StartAgentChatRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *StartAgentChatRequest) SetAgentChatRequest(v string) *StartAgentChatRequest {
	s.AgentChatRequest = &v
	return s
}

type StartAgentChatResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 会话结果
	ChatCompletionObject *string `json:"chat_completion_object,omitempty" xml:"chat_completion_object,omitempty"`
}

func (s StartAgentChatResponse) String() string {
	return tea.Prettify(s)
}

func (s StartAgentChatResponse) GoString() string {
	return s.String()
}

func (s *StartAgentChatResponse) SetReqMsgId(v string) *StartAgentChatResponse {
	s.ReqMsgId = &v
	return s
}

func (s *StartAgentChatResponse) SetResultCode(v string) *StartAgentChatResponse {
	s.ResultCode = &v
	return s
}

func (s *StartAgentChatResponse) SetResultMsg(v string) *StartAgentChatResponse {
	s.ResultMsg = &v
	return s
}

func (s *StartAgentChatResponse) SetChatCompletionObject(v string) *StartAgentChatResponse {
	s.ChatCompletionObject = &v
	return s
}

type StartAgentCchatRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 请求内容，内容为 AgentChatReq 对象的json字符串
	AgentChatRequest *string `json:"agent_chat_request,omitempty" xml:"agent_chat_request,omitempty" require:"true"`
}

func (s StartAgentCchatRequest) String() string {
	return tea.Prettify(s)
}

func (s StartAgentCchatRequest) GoString() string {
	return s.String()
}

func (s *StartAgentCchatRequest) SetAuthToken(v string) *StartAgentCchatRequest {
	s.AuthToken = &v
	return s
}

func (s *StartAgentCchatRequest) SetProductInstanceId(v string) *StartAgentCchatRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *StartAgentCchatRequest) SetAgentChatRequest(v string) *StartAgentCchatRequest {
	s.AgentChatRequest = &v
	return s
}

type StartAgentCchatResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 会话结果
	ChatCompletionObject *string `json:"chat_completion_object,omitempty" xml:"chat_completion_object,omitempty"`
}

func (s StartAgentCchatResponse) String() string {
	return tea.Prettify(s)
}

func (s StartAgentCchatResponse) GoString() string {
	return s.String()
}

func (s *StartAgentCchatResponse) SetReqMsgId(v string) *StartAgentCchatResponse {
	s.ReqMsgId = &v
	return s
}

func (s *StartAgentCchatResponse) SetResultCode(v string) *StartAgentCchatResponse {
	s.ResultCode = &v
	return s
}

func (s *StartAgentCchatResponse) SetResultMsg(v string) *StartAgentCchatResponse {
	s.ResultMsg = &v
	return s
}

func (s *StartAgentCchatResponse) SetChatCompletionObject(v string) *StartAgentCchatResponse {
	s.ChatCompletionObject = &v
	return s
}

type PagequeryAgentMcplistRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 空间ID
	SpaceId *string `json:"space_id,omitempty" xml:"space_id,omitempty" require:"true"`
	// 查询条件
	Query *string `json:"query,omitempty" xml:"query,omitempty"`
	// 页码
	PageNum *int64 `json:"page_num,omitempty" xml:"page_num,omitempty" require:"true"`
	// 分页大小
	PageSize *int64 `json:"page_size,omitempty" xml:"page_size,omitempty" require:"true"`
}

func (s PagequeryAgentMcplistRequest) String() string {
	return tea.Prettify(s)
}

func (s PagequeryAgentMcplistRequest) GoString() string {
	return s.String()
}

func (s *PagequeryAgentMcplistRequest) SetAuthToken(v string) *PagequeryAgentMcplistRequest {
	s.AuthToken = &v
	return s
}

func (s *PagequeryAgentMcplistRequest) SetProductInstanceId(v string) *PagequeryAgentMcplistRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *PagequeryAgentMcplistRequest) SetSpaceId(v string) *PagequeryAgentMcplistRequest {
	s.SpaceId = &v
	return s
}

func (s *PagequeryAgentMcplistRequest) SetQuery(v string) *PagequeryAgentMcplistRequest {
	s.Query = &v
	return s
}

func (s *PagequeryAgentMcplistRequest) SetPageNum(v int64) *PagequeryAgentMcplistRequest {
	s.PageNum = &v
	return s
}

func (s *PagequeryAgentMcplistRequest) SetPageSize(v int64) *PagequeryAgentMcplistRequest {
	s.PageSize = &v
	return s
}

type PagequeryAgentMcplistResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// MyMCP分页对象
	Data *MyMcpPageRestult `json:"data,omitempty" xml:"data,omitempty"`
}

func (s PagequeryAgentMcplistResponse) String() string {
	return tea.Prettify(s)
}

func (s PagequeryAgentMcplistResponse) GoString() string {
	return s.String()
}

func (s *PagequeryAgentMcplistResponse) SetReqMsgId(v string) *PagequeryAgentMcplistResponse {
	s.ReqMsgId = &v
	return s
}

func (s *PagequeryAgentMcplistResponse) SetResultCode(v string) *PagequeryAgentMcplistResponse {
	s.ResultCode = &v
	return s
}

func (s *PagequeryAgentMcplistResponse) SetResultMsg(v string) *PagequeryAgentMcplistResponse {
	s.ResultMsg = &v
	return s
}

func (s *PagequeryAgentMcplistResponse) SetData(v *MyMcpPageRestult) *PagequeryAgentMcplistResponse {
	s.Data = v
	return s
}

type DetailAgentMcpRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 空间id
	SpaceId *string `json:"space_id,omitempty" xml:"space_id,omitempty" require:"true"`
	// 平台serverId
	ServerId *string `json:"server_id,omitempty" xml:"server_id,omitempty" require:"true"`
}

func (s DetailAgentMcpRequest) String() string {
	return tea.Prettify(s)
}

func (s DetailAgentMcpRequest) GoString() string {
	return s.String()
}

func (s *DetailAgentMcpRequest) SetAuthToken(v string) *DetailAgentMcpRequest {
	s.AuthToken = &v
	return s
}

func (s *DetailAgentMcpRequest) SetProductInstanceId(v string) *DetailAgentMcpRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DetailAgentMcpRequest) SetSpaceId(v string) *DetailAgentMcpRequest {
	s.SpaceId = &v
	return s
}

func (s *DetailAgentMcpRequest) SetServerId(v string) *DetailAgentMcpRequest {
	s.ServerId = &v
	return s
}

type DetailAgentMcpResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// MCP详情接口返回Result
	Data *MCPDetailCommonResult `json:"data,omitempty" xml:"data,omitempty"`
}

func (s DetailAgentMcpResponse) String() string {
	return tea.Prettify(s)
}

func (s DetailAgentMcpResponse) GoString() string {
	return s.String()
}

func (s *DetailAgentMcpResponse) SetReqMsgId(v string) *DetailAgentMcpResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DetailAgentMcpResponse) SetResultCode(v string) *DetailAgentMcpResponse {
	s.ResultCode = &v
	return s
}

func (s *DetailAgentMcpResponse) SetResultMsg(v string) *DetailAgentMcpResponse {
	s.ResultMsg = &v
	return s
}

func (s *DetailAgentMcpResponse) SetData(v *MCPDetailCommonResult) *DetailAgentMcpResponse {
	s.Data = v
	return s
}

type StartAgentTaskRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 请求内容，内容为 TaskChatReq 对象的json字符串
	TaskChatReq *string `json:"task_chat_req,omitempty" xml:"task_chat_req,omitempty" require:"true"`
}

func (s StartAgentTaskRequest) String() string {
	return tea.Prettify(s)
}

func (s StartAgentTaskRequest) GoString() string {
	return s.String()
}

func (s *StartAgentTaskRequest) SetAuthToken(v string) *StartAgentTaskRequest {
	s.AuthToken = &v
	return s
}

func (s *StartAgentTaskRequest) SetProductInstanceId(v string) *StartAgentTaskRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *StartAgentTaskRequest) SetTaskChatReq(v string) *StartAgentTaskRequest {
	s.TaskChatReq = &v
	return s
}

type StartAgentTaskResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 会话结果
	ChatCompletionObject *string `json:"chat_completion_object,omitempty" xml:"chat_completion_object,omitempty"`
}

func (s StartAgentTaskResponse) String() string {
	return tea.Prettify(s)
}

func (s StartAgentTaskResponse) GoString() string {
	return s.String()
}

func (s *StartAgentTaskResponse) SetReqMsgId(v string) *StartAgentTaskResponse {
	s.ReqMsgId = &v
	return s
}

func (s *StartAgentTaskResponse) SetResultCode(v string) *StartAgentTaskResponse {
	s.ResultCode = &v
	return s
}

func (s *StartAgentTaskResponse) SetResultMsg(v string) *StartAgentTaskResponse {
	s.ResultMsg = &v
	return s
}

func (s *StartAgentTaskResponse) SetChatCompletionObject(v string) *StartAgentTaskResponse {
	s.ChatCompletionObject = &v
	return s
}

type StopAgentTaskRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 请求内容，内容为 task_event_req 对象的json字符串
	TaskEventReq *string `json:"task_event_req,omitempty" xml:"task_event_req,omitempty" require:"true"`
}

func (s StopAgentTaskRequest) String() string {
	return tea.Prettify(s)
}

func (s StopAgentTaskRequest) GoString() string {
	return s.String()
}

func (s *StopAgentTaskRequest) SetAuthToken(v string) *StopAgentTaskRequest {
	s.AuthToken = &v
	return s
}

func (s *StopAgentTaskRequest) SetProductInstanceId(v string) *StopAgentTaskRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *StopAgentTaskRequest) SetTaskEventReq(v string) *StopAgentTaskRequest {
	s.TaskEventReq = &v
	return s
}

type StopAgentTaskResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// success
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s StopAgentTaskResponse) String() string {
	return tea.Prettify(s)
}

func (s StopAgentTaskResponse) GoString() string {
	return s.String()
}

func (s *StopAgentTaskResponse) SetReqMsgId(v string) *StopAgentTaskResponse {
	s.ReqMsgId = &v
	return s
}

func (s *StopAgentTaskResponse) SetResultCode(v string) *StopAgentTaskResponse {
	s.ResultCode = &v
	return s
}

func (s *StopAgentTaskResponse) SetResultMsg(v string) *StopAgentTaskResponse {
	s.ResultMsg = &v
	return s
}

func (s *StopAgentTaskResponse) SetSuccess(v bool) *StopAgentTaskResponse {
	s.Success = &v
	return s
}

type OperateAgentTaskRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 请求内容，内容为 task_event_req 对象的json字符串
	TaskEventReq *string `json:"task_event_req,omitempty" xml:"task_event_req,omitempty" require:"true"`
}

func (s OperateAgentTaskRequest) String() string {
	return tea.Prettify(s)
}

func (s OperateAgentTaskRequest) GoString() string {
	return s.String()
}

func (s *OperateAgentTaskRequest) SetAuthToken(v string) *OperateAgentTaskRequest {
	s.AuthToken = &v
	return s
}

func (s *OperateAgentTaskRequest) SetProductInstanceId(v string) *OperateAgentTaskRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *OperateAgentTaskRequest) SetTaskEventReq(v string) *OperateAgentTaskRequest {
	s.TaskEventReq = &v
	return s
}

type OperateAgentTaskResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 会话结果
	//
	TaskMessages *string `json:"task_messages,omitempty" xml:"task_messages,omitempty"`
}

func (s OperateAgentTaskResponse) String() string {
	return tea.Prettify(s)
}

func (s OperateAgentTaskResponse) GoString() string {
	return s.String()
}

func (s *OperateAgentTaskResponse) SetReqMsgId(v string) *OperateAgentTaskResponse {
	s.ReqMsgId = &v
	return s
}

func (s *OperateAgentTaskResponse) SetResultCode(v string) *OperateAgentTaskResponse {
	s.ResultCode = &v
	return s
}

func (s *OperateAgentTaskResponse) SetResultMsg(v string) *OperateAgentTaskResponse {
	s.ResultMsg = &v
	return s
}

func (s *OperateAgentTaskResponse) SetTaskMessages(v string) *OperateAgentTaskResponse {
	s.TaskMessages = &v
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
				"sdk_version":      tea.String("1.3.0"),
				"_prod_code":       tea.String("DTAIAGT"),
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
 * Description: 大模型流式/同步对话接口
 * Summary: 大模型流式/同步对话接口
 */
func (client *Client) StartOpenaiChat(request *StartOpenaiChatRequest) (_result *StartOpenaiChatResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &StartOpenaiChatResponse{}
	_body, _err := client.StartOpenaiChatEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 大模型流式/同步对话接口
 * Summary: 大模型流式/同步对话接口
 */
func (client *Client) StartOpenaiChatEx(request *StartOpenaiChatRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *StartOpenaiChatResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &StartOpenaiChatResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.dtaiagt.openai.chat.start"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 智能体流式对话接口
 * Summary: 智能体流式对话接口
 */
func (client *Client) StartAgentChat(request *StartAgentChatRequest) (_result *StartAgentChatResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &StartAgentChatResponse{}
	_body, _err := client.StartAgentChatEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 智能体流式对话接口
 * Summary: 智能体流式对话接口
 */
func (client *Client) StartAgentChatEx(request *StartAgentChatRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *StartAgentChatResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &StartAgentChatResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.dtaiagt.agent.chat.start"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 智能体同步对话接口
 * Summary: 智能体同步对话接口
 */
func (client *Client) StartAgentCchat(request *StartAgentCchatRequest) (_result *StartAgentCchatResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &StartAgentCchatResponse{}
	_body, _err := client.StartAgentCchatEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 智能体同步对话接口
 * Summary: 智能体同步对话接口
 */
func (client *Client) StartAgentCchatEx(request *StartAgentCchatRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *StartAgentCchatResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &StartAgentCchatResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.dtaiagt.agent.cchat.start"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 查询已订阅的mcp清单
 * Summary: 查询已订阅的mcp清单
 */
func (client *Client) PagequeryAgentMcplist(request *PagequeryAgentMcplistRequest) (_result *PagequeryAgentMcplistResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &PagequeryAgentMcplistResponse{}
	_body, _err := client.PagequeryAgentMcplistEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询已订阅的mcp清单
 * Summary: 查询已订阅的mcp清单
 */
func (client *Client) PagequeryAgentMcplistEx(request *PagequeryAgentMcplistRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *PagequeryAgentMcplistResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &PagequeryAgentMcplistResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.dtaiagt.agent.mcplist.pagequery"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: mcp详情
 * Summary: mcp详情
 */
func (client *Client) DetailAgentMcp(request *DetailAgentMcpRequest) (_result *DetailAgentMcpResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DetailAgentMcpResponse{}
	_body, _err := client.DetailAgentMcpEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: mcp详情
 * Summary: mcp详情
 */
func (client *Client) DetailAgentMcpEx(request *DetailAgentMcpRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DetailAgentMcpResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DetailAgentMcpResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.dtaiagt.agent.mcp.detail"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 长任务对话，发起任务&重连任务
 * Summary: 长任务对话
 */
func (client *Client) StartAgentTask(request *StartAgentTaskRequest) (_result *StartAgentTaskResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &StartAgentTaskResponse{}
	_body, _err := client.StartAgentTaskEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 长任务对话，发起任务&重连任务
 * Summary: 长任务对话
 */
func (client *Client) StartAgentTaskEx(request *StartAgentTaskRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *StartAgentTaskResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &StartAgentTaskResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.dtaiagt.agent.task.start"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 终止任务
 * Summary: 终止任务
 */
func (client *Client) StopAgentTask(request *StopAgentTaskRequest) (_result *StopAgentTaskResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &StopAgentTaskResponse{}
	_body, _err := client.StopAgentTaskEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 终止任务
 * Summary: 终止任务
 */
func (client *Client) StopAgentTaskEx(request *StopAgentTaskRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *StopAgentTaskResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &StopAgentTaskResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.dtaiagt.agent.task.stop"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取前序消息流
 * Summary: 获取前序消息流
 */
func (client *Client) OperateAgentTask(request *OperateAgentTaskRequest) (_result *OperateAgentTaskResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &OperateAgentTaskResponse{}
	_body, _err := client.OperateAgentTaskEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取前序消息流
 * Summary: 获取前序消息流
 */
func (client *Client) OperateAgentTaskEx(request *OperateAgentTaskRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *OperateAgentTaskResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &OperateAgentTaskResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.dtaiagt.agent.task.operate"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
