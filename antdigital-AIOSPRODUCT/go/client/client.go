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

type QueryGwdefaultChatstreamRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 用户标识
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 业务配置标识（必传），决定模型、策略、提示词
	AgentCode *string `json:"agent_code,omitempty" xml:"agent_code,omitempty" require:"true"`
	// 用户输入
	Message *string `json:"message,omitempty" xml:"message,omitempty" require:"true"`
	// 会话标识（可选），新会话不传，继续会话传
	SessionId *string `json:"session_id,omitempty" xml:"session_id,omitempty"`
	// 扩展字段（可选），用于后端服务直接调用时指定技术参数
	ExtInfo *string `json:"ext_info,omitempty" xml:"ext_info,omitempty"`
	// 标签过滤字段（可选），用于按标签过滤生效的 expertAgents/skills/tools。
	TagInfo *string `json:"tag_info,omitempty" xml:"tag_info,omitempty"`
	// 由业务指定不同的 gateway_code
	GatewayCode *string `json:"gateway_code,omitempty" xml:"gateway_code,omitempty"`
}

func (s QueryGwdefaultChatstreamRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryGwdefaultChatstreamRequest) GoString() string {
	return s.String()
}

func (s *QueryGwdefaultChatstreamRequest) SetAuthToken(v string) *QueryGwdefaultChatstreamRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryGwdefaultChatstreamRequest) SetProductInstanceId(v string) *QueryGwdefaultChatstreamRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryGwdefaultChatstreamRequest) SetUserId(v string) *QueryGwdefaultChatstreamRequest {
	s.UserId = &v
	return s
}

func (s *QueryGwdefaultChatstreamRequest) SetTenantId(v string) *QueryGwdefaultChatstreamRequest {
	s.TenantId = &v
	return s
}

func (s *QueryGwdefaultChatstreamRequest) SetAgentCode(v string) *QueryGwdefaultChatstreamRequest {
	s.AgentCode = &v
	return s
}

func (s *QueryGwdefaultChatstreamRequest) SetMessage(v string) *QueryGwdefaultChatstreamRequest {
	s.Message = &v
	return s
}

func (s *QueryGwdefaultChatstreamRequest) SetSessionId(v string) *QueryGwdefaultChatstreamRequest {
	s.SessionId = &v
	return s
}

func (s *QueryGwdefaultChatstreamRequest) SetExtInfo(v string) *QueryGwdefaultChatstreamRequest {
	s.ExtInfo = &v
	return s
}

func (s *QueryGwdefaultChatstreamRequest) SetTagInfo(v string) *QueryGwdefaultChatstreamRequest {
	s.TagInfo = &v
	return s
}

func (s *QueryGwdefaultChatstreamRequest) SetGatewayCode(v string) *QueryGwdefaultChatstreamRequest {
	s.GatewayCode = &v
	return s
}

type QueryGwdefaultChatstreamResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 会话id
	SessionId *string `json:"session_id,omitempty" xml:"session_id,omitempty"`
	// 整体成功标志，默认 true
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
	// 固定chat_result
	Type *string `json:"type,omitempty" xml:"type,omitempty"`
	// 查询 ID；多为空串
	QueryId *string `json:"query_id,omitempty" xml:"query_id,omitempty"`
	// true=流式中间批次；false=收尾批次
	HasStream *bool `json:"has_stream,omitempty" xml:"has_stream,omitempty"`
	// 正文流
	ChatList *string `json:"chat_list,omitempty" xml:"chat_list,omitempty"`
	// 推荐问题（SUG），仅收尾批次非空
	SugList *string `json:"sug_list,omitempty" xml:"sug_list,omitempty"`
	// 全量引用（REF），仅收尾批次非空
	RefList *string `json:"ref_list,omitempty" xml:"ref_list,omitempty"`
	// 页脚卡片（FOOTER_CARD 已改写为 CARD），仅收尾批次非空
	FooterList *string `json:"footer_list,omitempty" xml:"footer_list,omitempty"`
	// token/耗时信息；仅携带 callbackInfo 的批次才有
	CallBackInfo *string `json:"call_back_info,omitempty" xml:"call_back_info,omitempty"`
}

func (s QueryGwdefaultChatstreamResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryGwdefaultChatstreamResponse) GoString() string {
	return s.String()
}

func (s *QueryGwdefaultChatstreamResponse) SetReqMsgId(v string) *QueryGwdefaultChatstreamResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryGwdefaultChatstreamResponse) SetResultCode(v string) *QueryGwdefaultChatstreamResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryGwdefaultChatstreamResponse) SetResultMsg(v string) *QueryGwdefaultChatstreamResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryGwdefaultChatstreamResponse) SetSessionId(v string) *QueryGwdefaultChatstreamResponse {
	s.SessionId = &v
	return s
}

func (s *QueryGwdefaultChatstreamResponse) SetSuccess(v bool) *QueryGwdefaultChatstreamResponse {
	s.Success = &v
	return s
}

func (s *QueryGwdefaultChatstreamResponse) SetType(v string) *QueryGwdefaultChatstreamResponse {
	s.Type = &v
	return s
}

func (s *QueryGwdefaultChatstreamResponse) SetQueryId(v string) *QueryGwdefaultChatstreamResponse {
	s.QueryId = &v
	return s
}

func (s *QueryGwdefaultChatstreamResponse) SetHasStream(v bool) *QueryGwdefaultChatstreamResponse {
	s.HasStream = &v
	return s
}

func (s *QueryGwdefaultChatstreamResponse) SetChatList(v string) *QueryGwdefaultChatstreamResponse {
	s.ChatList = &v
	return s
}

func (s *QueryGwdefaultChatstreamResponse) SetSugList(v string) *QueryGwdefaultChatstreamResponse {
	s.SugList = &v
	return s
}

func (s *QueryGwdefaultChatstreamResponse) SetRefList(v string) *QueryGwdefaultChatstreamResponse {
	s.RefList = &v
	return s
}

func (s *QueryGwdefaultChatstreamResponse) SetFooterList(v string) *QueryGwdefaultChatstreamResponse {
	s.FooterList = &v
	return s
}

func (s *QueryGwdefaultChatstreamResponse) SetCallBackInfo(v string) *QueryGwdefaultChatstreamResponse {
	s.CallBackInfo = &v
	return s
}

type QueryGwdefaultChatRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 用户标识
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 业务配置标识（必传），决定模型、策略、提示词
	AgentCode *string `json:"agent_code,omitempty" xml:"agent_code,omitempty" require:"true"`
	// 用户输入
	Message *string `json:"message,omitempty" xml:"message,omitempty" require:"true"`
	// 会话标识（可选），新会话不传，继续会话传
	SessionId *string `json:"session_id,omitempty" xml:"session_id,omitempty"`
	// 扩展字段（可选），用于后端服务直接调用时指定技术参数
	ExtInfo *string `json:"ext_info,omitempty" xml:"ext_info,omitempty"`
	// 标签过滤字段（可选），用于按标签过滤生效的 expertAgents/skills/tools
	TagInfo *string `json:"tag_info,omitempty" xml:"tag_info,omitempty"`
	// 由业务指定不同的 gateway_code
	GatewayCode *string `json:"gateway_code,omitempty" xml:"gateway_code,omitempty"`
}

func (s QueryGwdefaultChatRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryGwdefaultChatRequest) GoString() string {
	return s.String()
}

func (s *QueryGwdefaultChatRequest) SetAuthToken(v string) *QueryGwdefaultChatRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryGwdefaultChatRequest) SetProductInstanceId(v string) *QueryGwdefaultChatRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryGwdefaultChatRequest) SetUserId(v string) *QueryGwdefaultChatRequest {
	s.UserId = &v
	return s
}

func (s *QueryGwdefaultChatRequest) SetTenantId(v string) *QueryGwdefaultChatRequest {
	s.TenantId = &v
	return s
}

func (s *QueryGwdefaultChatRequest) SetAgentCode(v string) *QueryGwdefaultChatRequest {
	s.AgentCode = &v
	return s
}

func (s *QueryGwdefaultChatRequest) SetMessage(v string) *QueryGwdefaultChatRequest {
	s.Message = &v
	return s
}

func (s *QueryGwdefaultChatRequest) SetSessionId(v string) *QueryGwdefaultChatRequest {
	s.SessionId = &v
	return s
}

func (s *QueryGwdefaultChatRequest) SetExtInfo(v string) *QueryGwdefaultChatRequest {
	s.ExtInfo = &v
	return s
}

func (s *QueryGwdefaultChatRequest) SetTagInfo(v string) *QueryGwdefaultChatRequest {
	s.TagInfo = &v
	return s
}

func (s *QueryGwdefaultChatRequest) SetGatewayCode(v string) *QueryGwdefaultChatRequest {
	s.GatewayCode = &v
	return s
}

type QueryGwdefaultChatResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 会话id
	SessionId *string `json:"session_id,omitempty" xml:"session_id,omitempty"`
	// 业务配置标识（必传），决定模型、策略、提示词
	AgentCode *string `json:"agent_code,omitempty" xml:"agent_code,omitempty"`
	// 回答
	Answer *string `json:"answer,omitempty" xml:"answer,omitempty"`
	// 链路id
	TraceId *string `json:"trace_id,omitempty" xml:"trace_id,omitempty"`
	// 附加信息
	Metadata *string `json:"metadata,omitempty" xml:"metadata,omitempty"`
}

func (s QueryGwdefaultChatResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryGwdefaultChatResponse) GoString() string {
	return s.String()
}

func (s *QueryGwdefaultChatResponse) SetReqMsgId(v string) *QueryGwdefaultChatResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryGwdefaultChatResponse) SetResultCode(v string) *QueryGwdefaultChatResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryGwdefaultChatResponse) SetResultMsg(v string) *QueryGwdefaultChatResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryGwdefaultChatResponse) SetSessionId(v string) *QueryGwdefaultChatResponse {
	s.SessionId = &v
	return s
}

func (s *QueryGwdefaultChatResponse) SetAgentCode(v string) *QueryGwdefaultChatResponse {
	s.AgentCode = &v
	return s
}

func (s *QueryGwdefaultChatResponse) SetAnswer(v string) *QueryGwdefaultChatResponse {
	s.Answer = &v
	return s
}

func (s *QueryGwdefaultChatResponse) SetTraceId(v string) *QueryGwdefaultChatResponse {
	s.TraceId = &v
	return s
}

func (s *QueryGwdefaultChatResponse) SetMetadata(v string) *QueryGwdefaultChatResponse {
	s.Metadata = &v
	return s
}

type QueryGwchildinsuranceChatstreamRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 用户标识
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 业务配置标识（必传），决定模型、策略、提示词
	AgentCode *string `json:"agent_code,omitempty" xml:"agent_code,omitempty" require:"true"`
	// 用户输入
	Message *string `json:"message,omitempty" xml:"message,omitempty" require:"true"`
	// 会话标识（可选），新会话不传，继续会话传
	SessionId *string `json:"session_id,omitempty" xml:"session_id,omitempty"`
	// 扩展字段（可选），用于后端服务直接调用时指定技术参数
	ExtInfo *string `json:"ext_info,omitempty" xml:"ext_info,omitempty"`
	// 标签过滤字段（可选），用于按标签过滤生效的 expertAgents/skills/tools
	TagInfo *string `json:"tag_info,omitempty" xml:"tag_info,omitempty"`
}

func (s QueryGwchildinsuranceChatstreamRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryGwchildinsuranceChatstreamRequest) GoString() string {
	return s.String()
}

func (s *QueryGwchildinsuranceChatstreamRequest) SetAuthToken(v string) *QueryGwchildinsuranceChatstreamRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryGwchildinsuranceChatstreamRequest) SetProductInstanceId(v string) *QueryGwchildinsuranceChatstreamRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryGwchildinsuranceChatstreamRequest) SetUserId(v string) *QueryGwchildinsuranceChatstreamRequest {
	s.UserId = &v
	return s
}

func (s *QueryGwchildinsuranceChatstreamRequest) SetTenantId(v string) *QueryGwchildinsuranceChatstreamRequest {
	s.TenantId = &v
	return s
}

func (s *QueryGwchildinsuranceChatstreamRequest) SetAgentCode(v string) *QueryGwchildinsuranceChatstreamRequest {
	s.AgentCode = &v
	return s
}

func (s *QueryGwchildinsuranceChatstreamRequest) SetMessage(v string) *QueryGwchildinsuranceChatstreamRequest {
	s.Message = &v
	return s
}

func (s *QueryGwchildinsuranceChatstreamRequest) SetSessionId(v string) *QueryGwchildinsuranceChatstreamRequest {
	s.SessionId = &v
	return s
}

func (s *QueryGwchildinsuranceChatstreamRequest) SetExtInfo(v string) *QueryGwchildinsuranceChatstreamRequest {
	s.ExtInfo = &v
	return s
}

func (s *QueryGwchildinsuranceChatstreamRequest) SetTagInfo(v string) *QueryGwchildinsuranceChatstreamRequest {
	s.TagInfo = &v
	return s
}

type QueryGwchildinsuranceChatstreamResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 会话id
	SessionId *string `json:"session_id,omitempty" xml:"session_id,omitempty"`
	// 整体成功标志，默认 true
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
	// 固定chat_result
	Type *string `json:"type,omitempty" xml:"type,omitempty"`
	// 查询 ID；多为空串
	QueryId *string `json:"query_id,omitempty" xml:"query_id,omitempty"`
	// true=流式中间批次；false=收尾批次
	HasStream *bool `json:"has_stream,omitempty" xml:"has_stream,omitempty"`
	// 正文流
	ChatList *string `json:"chat_list,omitempty" xml:"chat_list,omitempty"`
	// 推荐问题（SUG），仅收尾批次非空
	SugList *string `json:"sug_list,omitempty" xml:"sug_list,omitempty"`
	// 全量引用（REF），仅收尾批次非空
	RefList *string `json:"ref_list,omitempty" xml:"ref_list,omitempty"`
	// 页脚卡片（FOOTER_CARD 已改写为 CARD），仅收尾批次非空
	FooterList *string `json:"footer_list,omitempty" xml:"footer_list,omitempty"`
	// token/耗时信息；仅携带 callbackInfo 的批次才有
	CallBackInfo *string `json:"call_back_info,omitempty" xml:"call_back_info,omitempty"`
}

func (s QueryGwchildinsuranceChatstreamResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryGwchildinsuranceChatstreamResponse) GoString() string {
	return s.String()
}

func (s *QueryGwchildinsuranceChatstreamResponse) SetReqMsgId(v string) *QueryGwchildinsuranceChatstreamResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryGwchildinsuranceChatstreamResponse) SetResultCode(v string) *QueryGwchildinsuranceChatstreamResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryGwchildinsuranceChatstreamResponse) SetResultMsg(v string) *QueryGwchildinsuranceChatstreamResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryGwchildinsuranceChatstreamResponse) SetSessionId(v string) *QueryGwchildinsuranceChatstreamResponse {
	s.SessionId = &v
	return s
}

func (s *QueryGwchildinsuranceChatstreamResponse) SetSuccess(v bool) *QueryGwchildinsuranceChatstreamResponse {
	s.Success = &v
	return s
}

func (s *QueryGwchildinsuranceChatstreamResponse) SetType(v string) *QueryGwchildinsuranceChatstreamResponse {
	s.Type = &v
	return s
}

func (s *QueryGwchildinsuranceChatstreamResponse) SetQueryId(v string) *QueryGwchildinsuranceChatstreamResponse {
	s.QueryId = &v
	return s
}

func (s *QueryGwchildinsuranceChatstreamResponse) SetHasStream(v bool) *QueryGwchildinsuranceChatstreamResponse {
	s.HasStream = &v
	return s
}

func (s *QueryGwchildinsuranceChatstreamResponse) SetChatList(v string) *QueryGwchildinsuranceChatstreamResponse {
	s.ChatList = &v
	return s
}

func (s *QueryGwchildinsuranceChatstreamResponse) SetSugList(v string) *QueryGwchildinsuranceChatstreamResponse {
	s.SugList = &v
	return s
}

func (s *QueryGwchildinsuranceChatstreamResponse) SetRefList(v string) *QueryGwchildinsuranceChatstreamResponse {
	s.RefList = &v
	return s
}

func (s *QueryGwchildinsuranceChatstreamResponse) SetFooterList(v string) *QueryGwchildinsuranceChatstreamResponse {
	s.FooterList = &v
	return s
}

func (s *QueryGwchildinsuranceChatstreamResponse) SetCallBackInfo(v string) *QueryGwchildinsuranceChatstreamResponse {
	s.CallBackInfo = &v
	return s
}

type QueryGwchildinsuranceChatRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 用户标识
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 业务配置标识（必传），决定模型、策略、提示词
	AgentCode *string `json:"agent_code,omitempty" xml:"agent_code,omitempty" require:"true"`
	// 用户输入
	Message *string `json:"message,omitempty" xml:"message,omitempty" require:"true"`
	// 会话标识（可选），新会话不传，继续会话传
	SessionId *string `json:"session_id,omitempty" xml:"session_id,omitempty"`
	// 扩展字段（可选），用于后端服务直接调用时指定技术参数
	ExtInfo *string `json:"ext_info,omitempty" xml:"ext_info,omitempty"`
	// 标签过滤字段（可选），用于按标签过滤生效的 expertAgents/skills/tools
	TagInfo *string `json:"tag_info,omitempty" xml:"tag_info,omitempty"`
}

func (s QueryGwchildinsuranceChatRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryGwchildinsuranceChatRequest) GoString() string {
	return s.String()
}

func (s *QueryGwchildinsuranceChatRequest) SetAuthToken(v string) *QueryGwchildinsuranceChatRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryGwchildinsuranceChatRequest) SetProductInstanceId(v string) *QueryGwchildinsuranceChatRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryGwchildinsuranceChatRequest) SetUserId(v string) *QueryGwchildinsuranceChatRequest {
	s.UserId = &v
	return s
}

func (s *QueryGwchildinsuranceChatRequest) SetTenantId(v string) *QueryGwchildinsuranceChatRequest {
	s.TenantId = &v
	return s
}

func (s *QueryGwchildinsuranceChatRequest) SetAgentCode(v string) *QueryGwchildinsuranceChatRequest {
	s.AgentCode = &v
	return s
}

func (s *QueryGwchildinsuranceChatRequest) SetMessage(v string) *QueryGwchildinsuranceChatRequest {
	s.Message = &v
	return s
}

func (s *QueryGwchildinsuranceChatRequest) SetSessionId(v string) *QueryGwchildinsuranceChatRequest {
	s.SessionId = &v
	return s
}

func (s *QueryGwchildinsuranceChatRequest) SetExtInfo(v string) *QueryGwchildinsuranceChatRequest {
	s.ExtInfo = &v
	return s
}

func (s *QueryGwchildinsuranceChatRequest) SetTagInfo(v string) *QueryGwchildinsuranceChatRequest {
	s.TagInfo = &v
	return s
}

type QueryGwchildinsuranceChatResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 会话id
	SessionId *string `json:"session_id,omitempty" xml:"session_id,omitempty"`
	// 业务配置标识（必传），决定模型、策略、提示词
	AgentCode *string `json:"agent_code,omitempty" xml:"agent_code,omitempty"`
	// 回答
	Answer *string `json:"answer,omitempty" xml:"answer,omitempty"`
	// 链路id
	TraceId *string `json:"trace_id,omitempty" xml:"trace_id,omitempty"`
	// 附加信息
	Metadata *string `json:"metadata,omitempty" xml:"metadata,omitempty"`
}

func (s QueryGwchildinsuranceChatResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryGwchildinsuranceChatResponse) GoString() string {
	return s.String()
}

func (s *QueryGwchildinsuranceChatResponse) SetReqMsgId(v string) *QueryGwchildinsuranceChatResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryGwchildinsuranceChatResponse) SetResultCode(v string) *QueryGwchildinsuranceChatResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryGwchildinsuranceChatResponse) SetResultMsg(v string) *QueryGwchildinsuranceChatResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryGwchildinsuranceChatResponse) SetSessionId(v string) *QueryGwchildinsuranceChatResponse {
	s.SessionId = &v
	return s
}

func (s *QueryGwchildinsuranceChatResponse) SetAgentCode(v string) *QueryGwchildinsuranceChatResponse {
	s.AgentCode = &v
	return s
}

func (s *QueryGwchildinsuranceChatResponse) SetAnswer(v string) *QueryGwchildinsuranceChatResponse {
	s.Answer = &v
	return s
}

func (s *QueryGwchildinsuranceChatResponse) SetTraceId(v string) *QueryGwchildinsuranceChatResponse {
	s.TraceId = &v
	return s
}

func (s *QueryGwchildinsuranceChatResponse) SetMetadata(v string) *QueryGwchildinsuranceChatResponse {
	s.Metadata = &v
	return s
}

type QueryGwchildinsuranceProfilelatestRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 当前联调租户；必须精确命中 finaigateway 发布白名单
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 请求输入
	RequestData *string `json:"request_data,omitempty" xml:"request_data,omitempty" require:"true"`
}

func (s QueryGwchildinsuranceProfilelatestRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryGwchildinsuranceProfilelatestRequest) GoString() string {
	return s.String()
}

func (s *QueryGwchildinsuranceProfilelatestRequest) SetAuthToken(v string) *QueryGwchildinsuranceProfilelatestRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryGwchildinsuranceProfilelatestRequest) SetProductInstanceId(v string) *QueryGwchildinsuranceProfilelatestRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryGwchildinsuranceProfilelatestRequest) SetTenantId(v string) *QueryGwchildinsuranceProfilelatestRequest {
	s.TenantId = &v
	return s
}

func (s *QueryGwchildinsuranceProfilelatestRequest) SetRequestData(v string) *QueryGwchildinsuranceProfilelatestRequest {
	s.RequestData = &v
	return s
}

type QueryGwchildinsuranceProfilelatestResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 接口返回数据对象
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
	// 消息
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 接口整体执行情况
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s QueryGwchildinsuranceProfilelatestResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryGwchildinsuranceProfilelatestResponse) GoString() string {
	return s.String()
}

func (s *QueryGwchildinsuranceProfilelatestResponse) SetReqMsgId(v string) *QueryGwchildinsuranceProfilelatestResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryGwchildinsuranceProfilelatestResponse) SetResultCode(v string) *QueryGwchildinsuranceProfilelatestResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryGwchildinsuranceProfilelatestResponse) SetResultMsg(v string) *QueryGwchildinsuranceProfilelatestResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryGwchildinsuranceProfilelatestResponse) SetData(v string) *QueryGwchildinsuranceProfilelatestResponse {
	s.Data = &v
	return s
}

func (s *QueryGwchildinsuranceProfilelatestResponse) SetMessage(v string) *QueryGwchildinsuranceProfilelatestResponse {
	s.Message = &v
	return s
}

func (s *QueryGwchildinsuranceProfilelatestResponse) SetSuccess(v bool) *QueryGwchildinsuranceProfilelatestResponse {
	s.Success = &v
	return s
}

type QueryGwchildinsuranceProfiledetailRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 当前联调租户；必须精确命中 finaigateway 发布白名单
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 输入参数
	RequestData *string `json:"request_data,omitempty" xml:"request_data,omitempty" require:"true"`
}

func (s QueryGwchildinsuranceProfiledetailRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryGwchildinsuranceProfiledetailRequest) GoString() string {
	return s.String()
}

func (s *QueryGwchildinsuranceProfiledetailRequest) SetAuthToken(v string) *QueryGwchildinsuranceProfiledetailRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryGwchildinsuranceProfiledetailRequest) SetProductInstanceId(v string) *QueryGwchildinsuranceProfiledetailRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryGwchildinsuranceProfiledetailRequest) SetTenantId(v string) *QueryGwchildinsuranceProfiledetailRequest {
	s.TenantId = &v
	return s
}

func (s *QueryGwchildinsuranceProfiledetailRequest) SetRequestData(v string) *QueryGwchildinsuranceProfiledetailRequest {
	s.RequestData = &v
	return s
}

type QueryGwchildinsuranceProfiledetailResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 接口返回数据对象
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
	// 消息
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 接口整体执行情况
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s QueryGwchildinsuranceProfiledetailResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryGwchildinsuranceProfiledetailResponse) GoString() string {
	return s.String()
}

func (s *QueryGwchildinsuranceProfiledetailResponse) SetReqMsgId(v string) *QueryGwchildinsuranceProfiledetailResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryGwchildinsuranceProfiledetailResponse) SetResultCode(v string) *QueryGwchildinsuranceProfiledetailResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryGwchildinsuranceProfiledetailResponse) SetResultMsg(v string) *QueryGwchildinsuranceProfiledetailResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryGwchildinsuranceProfiledetailResponse) SetData(v string) *QueryGwchildinsuranceProfiledetailResponse {
	s.Data = &v
	return s
}

func (s *QueryGwchildinsuranceProfiledetailResponse) SetMessage(v string) *QueryGwchildinsuranceProfiledetailResponse {
	s.Message = &v
	return s
}

func (s *QueryGwchildinsuranceProfiledetailResponse) SetSuccess(v bool) *QueryGwchildinsuranceProfiledetailResponse {
	s.Success = &v
	return s
}

type SaveGwchildinsuranceProfileRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 仅供 finaigateway 白名单校验和建立租户 Header，转发前删除
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 请求参数
	RequestData *string `json:"request_data,omitempty" xml:"request_data,omitempty" require:"true"`
}

func (s SaveGwchildinsuranceProfileRequest) String() string {
	return tea.Prettify(s)
}

func (s SaveGwchildinsuranceProfileRequest) GoString() string {
	return s.String()
}

func (s *SaveGwchildinsuranceProfileRequest) SetAuthToken(v string) *SaveGwchildinsuranceProfileRequest {
	s.AuthToken = &v
	return s
}

func (s *SaveGwchildinsuranceProfileRequest) SetProductInstanceId(v string) *SaveGwchildinsuranceProfileRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SaveGwchildinsuranceProfileRequest) SetTenantId(v string) *SaveGwchildinsuranceProfileRequest {
	s.TenantId = &v
	return s
}

func (s *SaveGwchildinsuranceProfileRequest) SetRequestData(v string) *SaveGwchildinsuranceProfileRequest {
	s.RequestData = &v
	return s
}

type SaveGwchildinsuranceProfileResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// data
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
	// 消息
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 接口整体执行情况
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s SaveGwchildinsuranceProfileResponse) String() string {
	return tea.Prettify(s)
}

func (s SaveGwchildinsuranceProfileResponse) GoString() string {
	return s.String()
}

func (s *SaveGwchildinsuranceProfileResponse) SetReqMsgId(v string) *SaveGwchildinsuranceProfileResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SaveGwchildinsuranceProfileResponse) SetResultCode(v string) *SaveGwchildinsuranceProfileResponse {
	s.ResultCode = &v
	return s
}

func (s *SaveGwchildinsuranceProfileResponse) SetResultMsg(v string) *SaveGwchildinsuranceProfileResponse {
	s.ResultMsg = &v
	return s
}

func (s *SaveGwchildinsuranceProfileResponse) SetData(v string) *SaveGwchildinsuranceProfileResponse {
	s.Data = &v
	return s
}

func (s *SaveGwchildinsuranceProfileResponse) SetMessage(v string) *SaveGwchildinsuranceProfileResponse {
	s.Message = &v
	return s
}

func (s *SaveGwchildinsuranceProfileResponse) SetSuccess(v bool) *SaveGwchildinsuranceProfileResponse {
	s.Success = &v
	return s
}

type QueryGwchildinsuranceSolutionkycdetailRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 当前联调租户；必须精确命中 finaigateway 发布白名单
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 输入参数
	RequestData *string `json:"request_data,omitempty" xml:"request_data,omitempty" require:"true"`
}

func (s QueryGwchildinsuranceSolutionkycdetailRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryGwchildinsuranceSolutionkycdetailRequest) GoString() string {
	return s.String()
}

func (s *QueryGwchildinsuranceSolutionkycdetailRequest) SetAuthToken(v string) *QueryGwchildinsuranceSolutionkycdetailRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryGwchildinsuranceSolutionkycdetailRequest) SetProductInstanceId(v string) *QueryGwchildinsuranceSolutionkycdetailRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryGwchildinsuranceSolutionkycdetailRequest) SetTenantId(v string) *QueryGwchildinsuranceSolutionkycdetailRequest {
	s.TenantId = &v
	return s
}

func (s *QueryGwchildinsuranceSolutionkycdetailRequest) SetRequestData(v string) *QueryGwchildinsuranceSolutionkycdetailRequest {
	s.RequestData = &v
	return s
}

type QueryGwchildinsuranceSolutionkycdetailResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务数据 JSON 字符串
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
	// 成功时允许为 null，失败时返回可理解原因
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 业务处理是否成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s QueryGwchildinsuranceSolutionkycdetailResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryGwchildinsuranceSolutionkycdetailResponse) GoString() string {
	return s.String()
}

func (s *QueryGwchildinsuranceSolutionkycdetailResponse) SetReqMsgId(v string) *QueryGwchildinsuranceSolutionkycdetailResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryGwchildinsuranceSolutionkycdetailResponse) SetResultCode(v string) *QueryGwchildinsuranceSolutionkycdetailResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryGwchildinsuranceSolutionkycdetailResponse) SetResultMsg(v string) *QueryGwchildinsuranceSolutionkycdetailResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryGwchildinsuranceSolutionkycdetailResponse) SetData(v string) *QueryGwchildinsuranceSolutionkycdetailResponse {
	s.Data = &v
	return s
}

func (s *QueryGwchildinsuranceSolutionkycdetailResponse) SetMessage(v string) *QueryGwchildinsuranceSolutionkycdetailResponse {
	s.Message = &v
	return s
}

func (s *QueryGwchildinsuranceSolutionkycdetailResponse) SetSuccess(v bool) *QueryGwchildinsuranceSolutionkycdetailResponse {
	s.Success = &v
	return s
}

type SaveGwchildinsuranceSolutionkycRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户标识；当前联调必须命中 finaigateway 发布白名单
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 当前业务请求对象的 JSON 字符串
	RequestData *string `json:"request_data,omitempty" xml:"request_data,omitempty" require:"true"`
}

func (s SaveGwchildinsuranceSolutionkycRequest) String() string {
	return tea.Prettify(s)
}

func (s SaveGwchildinsuranceSolutionkycRequest) GoString() string {
	return s.String()
}

func (s *SaveGwchildinsuranceSolutionkycRequest) SetAuthToken(v string) *SaveGwchildinsuranceSolutionkycRequest {
	s.AuthToken = &v
	return s
}

func (s *SaveGwchildinsuranceSolutionkycRequest) SetProductInstanceId(v string) *SaveGwchildinsuranceSolutionkycRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SaveGwchildinsuranceSolutionkycRequest) SetTenantId(v string) *SaveGwchildinsuranceSolutionkycRequest {
	s.TenantId = &v
	return s
}

func (s *SaveGwchildinsuranceSolutionkycRequest) SetRequestData(v string) *SaveGwchildinsuranceSolutionkycRequest {
	s.RequestData = &v
	return s
}

type SaveGwchildinsuranceSolutionkycResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务数据 JSON 字符串
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
	// 成功时允许为 null，失败时返回可理解原因
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 业务处理是否成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s SaveGwchildinsuranceSolutionkycResponse) String() string {
	return tea.Prettify(s)
}

func (s SaveGwchildinsuranceSolutionkycResponse) GoString() string {
	return s.String()
}

func (s *SaveGwchildinsuranceSolutionkycResponse) SetReqMsgId(v string) *SaveGwchildinsuranceSolutionkycResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SaveGwchildinsuranceSolutionkycResponse) SetResultCode(v string) *SaveGwchildinsuranceSolutionkycResponse {
	s.ResultCode = &v
	return s
}

func (s *SaveGwchildinsuranceSolutionkycResponse) SetResultMsg(v string) *SaveGwchildinsuranceSolutionkycResponse {
	s.ResultMsg = &v
	return s
}

func (s *SaveGwchildinsuranceSolutionkycResponse) SetData(v string) *SaveGwchildinsuranceSolutionkycResponse {
	s.Data = &v
	return s
}

func (s *SaveGwchildinsuranceSolutionkycResponse) SetMessage(v string) *SaveGwchildinsuranceSolutionkycResponse {
	s.Message = &v
	return s
}

func (s *SaveGwchildinsuranceSolutionkycResponse) SetSuccess(v bool) *SaveGwchildinsuranceSolutionkycResponse {
	s.Success = &v
	return s
}

type QueryGwmcpdefaultChatRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 用户标识
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
	// 租户标识
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 业务配置标识（必传），决定模型、策略、提示词
	AgentCode *string `json:"agent_code,omitempty" xml:"agent_code,omitempty" require:"true"`
	// 用户输入
	Message *string `json:"message,omitempty" xml:"message,omitempty" require:"true"`
	// 会话标识（可选），新会话不传，继续会话传
	SessionId *string `json:"session_id,omitempty" xml:"session_id,omitempty"`
	// 扩展字段（可选），用于后端服务直接调用时指定技术参数
	ExtInfo *string `json:"ext_info,omitempty" xml:"ext_info,omitempty"`
	// 标签过滤字段（可选），用于按标签过滤生效的 expertAgents/skills/tools
	TagInfo *string `json:"tag_info,omitempty" xml:"tag_info,omitempty"`
	// 由业务指定不同的 gateway_code
	GatewayCode *string `json:"gateway_code,omitempty" xml:"gateway_code,omitempty"`
}

func (s QueryGwmcpdefaultChatRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryGwmcpdefaultChatRequest) GoString() string {
	return s.String()
}

func (s *QueryGwmcpdefaultChatRequest) SetAuthToken(v string) *QueryGwmcpdefaultChatRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryGwmcpdefaultChatRequest) SetProductInstanceId(v string) *QueryGwmcpdefaultChatRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryGwmcpdefaultChatRequest) SetUserId(v string) *QueryGwmcpdefaultChatRequest {
	s.UserId = &v
	return s
}

func (s *QueryGwmcpdefaultChatRequest) SetTenantId(v string) *QueryGwmcpdefaultChatRequest {
	s.TenantId = &v
	return s
}

func (s *QueryGwmcpdefaultChatRequest) SetAgentCode(v string) *QueryGwmcpdefaultChatRequest {
	s.AgentCode = &v
	return s
}

func (s *QueryGwmcpdefaultChatRequest) SetMessage(v string) *QueryGwmcpdefaultChatRequest {
	s.Message = &v
	return s
}

func (s *QueryGwmcpdefaultChatRequest) SetSessionId(v string) *QueryGwmcpdefaultChatRequest {
	s.SessionId = &v
	return s
}

func (s *QueryGwmcpdefaultChatRequest) SetExtInfo(v string) *QueryGwmcpdefaultChatRequest {
	s.ExtInfo = &v
	return s
}

func (s *QueryGwmcpdefaultChatRequest) SetTagInfo(v string) *QueryGwmcpdefaultChatRequest {
	s.TagInfo = &v
	return s
}

func (s *QueryGwmcpdefaultChatRequest) SetGatewayCode(v string) *QueryGwmcpdefaultChatRequest {
	s.GatewayCode = &v
	return s
}

type QueryGwmcpdefaultChatResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 会话id
	SessionId *string `json:"session_id,omitempty" xml:"session_id,omitempty"`
	// 业务配置标识（必传），决定模型、策略、提示词
	AgentCode *string `json:"agent_code,omitempty" xml:"agent_code,omitempty"`
	// 回答
	Answer *string `json:"answer,omitempty" xml:"answer,omitempty"`
	// 链路id
	TraceId *string `json:"trace_id,omitempty" xml:"trace_id,omitempty"`
	// 附加信息
	Metadata *string `json:"metadata,omitempty" xml:"metadata,omitempty"`
}

func (s QueryGwmcpdefaultChatResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryGwmcpdefaultChatResponse) GoString() string {
	return s.String()
}

func (s *QueryGwmcpdefaultChatResponse) SetReqMsgId(v string) *QueryGwmcpdefaultChatResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryGwmcpdefaultChatResponse) SetResultCode(v string) *QueryGwmcpdefaultChatResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryGwmcpdefaultChatResponse) SetResultMsg(v string) *QueryGwmcpdefaultChatResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryGwmcpdefaultChatResponse) SetSessionId(v string) *QueryGwmcpdefaultChatResponse {
	s.SessionId = &v
	return s
}

func (s *QueryGwmcpdefaultChatResponse) SetAgentCode(v string) *QueryGwmcpdefaultChatResponse {
	s.AgentCode = &v
	return s
}

func (s *QueryGwmcpdefaultChatResponse) SetAnswer(v string) *QueryGwmcpdefaultChatResponse {
	s.Answer = &v
	return s
}

func (s *QueryGwmcpdefaultChatResponse) SetTraceId(v string) *QueryGwmcpdefaultChatResponse {
	s.TraceId = &v
	return s
}

func (s *QueryGwmcpdefaultChatResponse) SetMetadata(v string) *QueryGwmcpdefaultChatResponse {
	s.Metadata = &v
	return s
}

type SaveGwchildinsurancePlanningtargetsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户标识，沿用已发布 Profile API 的租户校验。
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// JSON 字符串形式的业务请求；必须是单层 JSON 字符串，不能再次序列化成二层 JSON 字符串。
	RequestData *string `json:"request_data,omitempty" xml:"request_data,omitempty" require:"true"`
}

func (s SaveGwchildinsurancePlanningtargetsRequest) String() string {
	return tea.Prettify(s)
}

func (s SaveGwchildinsurancePlanningtargetsRequest) GoString() string {
	return s.String()
}

func (s *SaveGwchildinsurancePlanningtargetsRequest) SetAuthToken(v string) *SaveGwchildinsurancePlanningtargetsRequest {
	s.AuthToken = &v
	return s
}

func (s *SaveGwchildinsurancePlanningtargetsRequest) SetProductInstanceId(v string) *SaveGwchildinsurancePlanningtargetsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SaveGwchildinsurancePlanningtargetsRequest) SetTenantId(v string) *SaveGwchildinsurancePlanningtargetsRequest {
	s.TenantId = &v
	return s
}

func (s *SaveGwchildinsurancePlanningtargetsRequest) SetRequestData(v string) *SaveGwchildinsurancePlanningtargetsRequest {
	s.RequestData = &v
	return s
}

type SaveGwchildinsurancePlanningtargetsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务数据 JSON 字符串；内容为 Planning Targets 业务对象
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
	// 成功时允许为 `null`，失败时返回可理解原因。
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 业务处理是否成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s SaveGwchildinsurancePlanningtargetsResponse) String() string {
	return tea.Prettify(s)
}

func (s SaveGwchildinsurancePlanningtargetsResponse) GoString() string {
	return s.String()
}

func (s *SaveGwchildinsurancePlanningtargetsResponse) SetReqMsgId(v string) *SaveGwchildinsurancePlanningtargetsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SaveGwchildinsurancePlanningtargetsResponse) SetResultCode(v string) *SaveGwchildinsurancePlanningtargetsResponse {
	s.ResultCode = &v
	return s
}

func (s *SaveGwchildinsurancePlanningtargetsResponse) SetResultMsg(v string) *SaveGwchildinsurancePlanningtargetsResponse {
	s.ResultMsg = &v
	return s
}

func (s *SaveGwchildinsurancePlanningtargetsResponse) SetData(v string) *SaveGwchildinsurancePlanningtargetsResponse {
	s.Data = &v
	return s
}

func (s *SaveGwchildinsurancePlanningtargetsResponse) SetMessage(v string) *SaveGwchildinsurancePlanningtargetsResponse {
	s.Message = &v
	return s
}

func (s *SaveGwchildinsurancePlanningtargetsResponse) SetSuccess(v bool) *SaveGwchildinsurancePlanningtargetsResponse {
	s.Success = &v
	return s
}

type QueryGwchildinsurancePlanningtargetsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户标识，当前使用 CONSOLE_DEFAULT
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// JSON 字符串形式的业务请求
	RequestData *string `json:"request_data,omitempty" xml:"request_data,omitempty" require:"true"`
}

func (s QueryGwchildinsurancePlanningtargetsRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryGwchildinsurancePlanningtargetsRequest) GoString() string {
	return s.String()
}

func (s *QueryGwchildinsurancePlanningtargetsRequest) SetAuthToken(v string) *QueryGwchildinsurancePlanningtargetsRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryGwchildinsurancePlanningtargetsRequest) SetProductInstanceId(v string) *QueryGwchildinsurancePlanningtargetsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryGwchildinsurancePlanningtargetsRequest) SetTenantId(v string) *QueryGwchildinsurancePlanningtargetsRequest {
	s.TenantId = &v
	return s
}

func (s *QueryGwchildinsurancePlanningtargetsRequest) SetRequestData(v string) *QueryGwchildinsurancePlanningtargetsRequest {
	s.RequestData = &v
	return s
}

type QueryGwchildinsurancePlanningtargetsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务数据 JSON 字符串
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
	// 成功时允许为 null，失败时返回可理解原因
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 业务处理是否成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s QueryGwchildinsurancePlanningtargetsResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryGwchildinsurancePlanningtargetsResponse) GoString() string {
	return s.String()
}

func (s *QueryGwchildinsurancePlanningtargetsResponse) SetReqMsgId(v string) *QueryGwchildinsurancePlanningtargetsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryGwchildinsurancePlanningtargetsResponse) SetResultCode(v string) *QueryGwchildinsurancePlanningtargetsResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryGwchildinsurancePlanningtargetsResponse) SetResultMsg(v string) *QueryGwchildinsurancePlanningtargetsResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryGwchildinsurancePlanningtargetsResponse) SetData(v string) *QueryGwchildinsurancePlanningtargetsResponse {
	s.Data = &v
	return s
}

func (s *QueryGwchildinsurancePlanningtargetsResponse) SetMessage(v string) *QueryGwchildinsurancePlanningtargetsResponse {
	s.Message = &v
	return s
}

func (s *QueryGwchildinsurancePlanningtargetsResponse) SetSuccess(v bool) *QueryGwchildinsurancePlanningtargetsResponse {
	s.Success = &v
	return s
}

type QueryGwchildinsurancePlanningtargetslatestRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户标识，沿用已发布 Profile API 的租户校验。
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// JSON 字符串形式的业务请求；必须是单层 JSON 字符串，不能再次序列化成二层 JSON 字符串。
	RequestData *string `json:"request_data,omitempty" xml:"request_data,omitempty" require:"true"`
}

func (s QueryGwchildinsurancePlanningtargetslatestRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryGwchildinsurancePlanningtargetslatestRequest) GoString() string {
	return s.String()
}

func (s *QueryGwchildinsurancePlanningtargetslatestRequest) SetAuthToken(v string) *QueryGwchildinsurancePlanningtargetslatestRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryGwchildinsurancePlanningtargetslatestRequest) SetProductInstanceId(v string) *QueryGwchildinsurancePlanningtargetslatestRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryGwchildinsurancePlanningtargetslatestRequest) SetTenantId(v string) *QueryGwchildinsurancePlanningtargetslatestRequest {
	s.TenantId = &v
	return s
}

func (s *QueryGwchildinsurancePlanningtargetslatestRequest) SetRequestData(v string) *QueryGwchildinsurancePlanningtargetslatestRequest {
	s.RequestData = &v
	return s
}

type QueryGwchildinsurancePlanningtargetslatestResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务数据 JSON 字符串；内容为 Planning Targets 业务对象。
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
	// 成功时允许为 null，失败时返回可理解原因。
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 业务处理是否成功。
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s QueryGwchildinsurancePlanningtargetslatestResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryGwchildinsurancePlanningtargetslatestResponse) GoString() string {
	return s.String()
}

func (s *QueryGwchildinsurancePlanningtargetslatestResponse) SetReqMsgId(v string) *QueryGwchildinsurancePlanningtargetslatestResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryGwchildinsurancePlanningtargetslatestResponse) SetResultCode(v string) *QueryGwchildinsurancePlanningtargetslatestResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryGwchildinsurancePlanningtargetslatestResponse) SetResultMsg(v string) *QueryGwchildinsurancePlanningtargetslatestResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryGwchildinsurancePlanningtargetslatestResponse) SetData(v string) *QueryGwchildinsurancePlanningtargetslatestResponse {
	s.Data = &v
	return s
}

func (s *QueryGwchildinsurancePlanningtargetslatestResponse) SetMessage(v string) *QueryGwchildinsurancePlanningtargetslatestResponse {
	s.Message = &v
	return s
}

func (s *QueryGwchildinsurancePlanningtargetslatestResponse) SetSuccess(v bool) *QueryGwchildinsurancePlanningtargetslatestResponse {
	s.Success = &v
	return s
}

type QueryGwchildinsuranceRecommendationplandetailRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 当前联调租户；必须精确命中 finaigateway 发布白名单
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 输入参数
	RequestData *string `json:"request_data,omitempty" xml:"request_data,omitempty" require:"true"`
}

func (s QueryGwchildinsuranceRecommendationplandetailRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryGwchildinsuranceRecommendationplandetailRequest) GoString() string {
	return s.String()
}

func (s *QueryGwchildinsuranceRecommendationplandetailRequest) SetAuthToken(v string) *QueryGwchildinsuranceRecommendationplandetailRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryGwchildinsuranceRecommendationplandetailRequest) SetProductInstanceId(v string) *QueryGwchildinsuranceRecommendationplandetailRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryGwchildinsuranceRecommendationplandetailRequest) SetTenantId(v string) *QueryGwchildinsuranceRecommendationplandetailRequest {
	s.TenantId = &v
	return s
}

func (s *QueryGwchildinsuranceRecommendationplandetailRequest) SetRequestData(v string) *QueryGwchildinsuranceRecommendationplandetailRequest {
	s.RequestData = &v
	return s
}

type QueryGwchildinsuranceRecommendationplandetailResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务数据 JSON 字符串
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
	// 成功时允许为 null，失败时返回可理解原因
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 业务处理是否成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s QueryGwchildinsuranceRecommendationplandetailResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryGwchildinsuranceRecommendationplandetailResponse) GoString() string {
	return s.String()
}

func (s *QueryGwchildinsuranceRecommendationplandetailResponse) SetReqMsgId(v string) *QueryGwchildinsuranceRecommendationplandetailResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryGwchildinsuranceRecommendationplandetailResponse) SetResultCode(v string) *QueryGwchildinsuranceRecommendationplandetailResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryGwchildinsuranceRecommendationplandetailResponse) SetResultMsg(v string) *QueryGwchildinsuranceRecommendationplandetailResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryGwchildinsuranceRecommendationplandetailResponse) SetData(v string) *QueryGwchildinsuranceRecommendationplandetailResponse {
	s.Data = &v
	return s
}

func (s *QueryGwchildinsuranceRecommendationplandetailResponse) SetMessage(v string) *QueryGwchildinsuranceRecommendationplandetailResponse {
	s.Message = &v
	return s
}

func (s *QueryGwchildinsuranceRecommendationplandetailResponse) SetSuccess(v bool) *QueryGwchildinsuranceRecommendationplandetailResponse {
	s.Success = &v
	return s
}

type SaveGwchildinsuranceRecommendationplanadjustRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 当前联调租户；必须精确命中 finaigateway 发布白名单
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 输入参数
	RequestData *string `json:"request_data,omitempty" xml:"request_data,omitempty" require:"true"`
}

func (s SaveGwchildinsuranceRecommendationplanadjustRequest) String() string {
	return tea.Prettify(s)
}

func (s SaveGwchildinsuranceRecommendationplanadjustRequest) GoString() string {
	return s.String()
}

func (s *SaveGwchildinsuranceRecommendationplanadjustRequest) SetAuthToken(v string) *SaveGwchildinsuranceRecommendationplanadjustRequest {
	s.AuthToken = &v
	return s
}

func (s *SaveGwchildinsuranceRecommendationplanadjustRequest) SetProductInstanceId(v string) *SaveGwchildinsuranceRecommendationplanadjustRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SaveGwchildinsuranceRecommendationplanadjustRequest) SetTenantId(v string) *SaveGwchildinsuranceRecommendationplanadjustRequest {
	s.TenantId = &v
	return s
}

func (s *SaveGwchildinsuranceRecommendationplanadjustRequest) SetRequestData(v string) *SaveGwchildinsuranceRecommendationplanadjustRequest {
	s.RequestData = &v
	return s
}

type SaveGwchildinsuranceRecommendationplanadjustResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务数据 JSON 字符串
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
	// 成功时允许为 null，失败时返回可理解原因
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 业务处理是否成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s SaveGwchildinsuranceRecommendationplanadjustResponse) String() string {
	return tea.Prettify(s)
}

func (s SaveGwchildinsuranceRecommendationplanadjustResponse) GoString() string {
	return s.String()
}

func (s *SaveGwchildinsuranceRecommendationplanadjustResponse) SetReqMsgId(v string) *SaveGwchildinsuranceRecommendationplanadjustResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SaveGwchildinsuranceRecommendationplanadjustResponse) SetResultCode(v string) *SaveGwchildinsuranceRecommendationplanadjustResponse {
	s.ResultCode = &v
	return s
}

func (s *SaveGwchildinsuranceRecommendationplanadjustResponse) SetResultMsg(v string) *SaveGwchildinsuranceRecommendationplanadjustResponse {
	s.ResultMsg = &v
	return s
}

func (s *SaveGwchildinsuranceRecommendationplanadjustResponse) SetData(v string) *SaveGwchildinsuranceRecommendationplanadjustResponse {
	s.Data = &v
	return s
}

func (s *SaveGwchildinsuranceRecommendationplanadjustResponse) SetMessage(v string) *SaveGwchildinsuranceRecommendationplanadjustResponse {
	s.Message = &v
	return s
}

func (s *SaveGwchildinsuranceRecommendationplanadjustResponse) SetSuccess(v bool) *SaveGwchildinsuranceRecommendationplanadjustResponse {
	s.Success = &v
	return s
}

type SaveGwchildinsuranceRecommendationplanconfirmRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 当前联调租户；必须精确命中 finaigateway 发布白名单
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 输入参数
	RequestData *string `json:"request_data,omitempty" xml:"request_data,omitempty" require:"true"`
}

func (s SaveGwchildinsuranceRecommendationplanconfirmRequest) String() string {
	return tea.Prettify(s)
}

func (s SaveGwchildinsuranceRecommendationplanconfirmRequest) GoString() string {
	return s.String()
}

func (s *SaveGwchildinsuranceRecommendationplanconfirmRequest) SetAuthToken(v string) *SaveGwchildinsuranceRecommendationplanconfirmRequest {
	s.AuthToken = &v
	return s
}

func (s *SaveGwchildinsuranceRecommendationplanconfirmRequest) SetProductInstanceId(v string) *SaveGwchildinsuranceRecommendationplanconfirmRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SaveGwchildinsuranceRecommendationplanconfirmRequest) SetTenantId(v string) *SaveGwchildinsuranceRecommendationplanconfirmRequest {
	s.TenantId = &v
	return s
}

func (s *SaveGwchildinsuranceRecommendationplanconfirmRequest) SetRequestData(v string) *SaveGwchildinsuranceRecommendationplanconfirmRequest {
	s.RequestData = &v
	return s
}

type SaveGwchildinsuranceRecommendationplanconfirmResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务数据 JSON 字符串
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
	// 成功时允许为 null，失败时返回可理解原因
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 业务处理是否成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s SaveGwchildinsuranceRecommendationplanconfirmResponse) String() string {
	return tea.Prettify(s)
}

func (s SaveGwchildinsuranceRecommendationplanconfirmResponse) GoString() string {
	return s.String()
}

func (s *SaveGwchildinsuranceRecommendationplanconfirmResponse) SetReqMsgId(v string) *SaveGwchildinsuranceRecommendationplanconfirmResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SaveGwchildinsuranceRecommendationplanconfirmResponse) SetResultCode(v string) *SaveGwchildinsuranceRecommendationplanconfirmResponse {
	s.ResultCode = &v
	return s
}

func (s *SaveGwchildinsuranceRecommendationplanconfirmResponse) SetResultMsg(v string) *SaveGwchildinsuranceRecommendationplanconfirmResponse {
	s.ResultMsg = &v
	return s
}

func (s *SaveGwchildinsuranceRecommendationplanconfirmResponse) SetData(v string) *SaveGwchildinsuranceRecommendationplanconfirmResponse {
	s.Data = &v
	return s
}

func (s *SaveGwchildinsuranceRecommendationplanconfirmResponse) SetMessage(v string) *SaveGwchildinsuranceRecommendationplanconfirmResponse {
	s.Message = &v
	return s
}

func (s *SaveGwchildinsuranceRecommendationplanconfirmResponse) SetSuccess(v bool) *SaveGwchildinsuranceRecommendationplanconfirmResponse {
	s.Success = &v
	return s
}

type QueryGwchildinsuranceRecommendationplanhistoryRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 当前联调租户；必须精确命中 finaigateway 发布白名单
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 输入参数
	RequestData *string `json:"request_data,omitempty" xml:"request_data,omitempty" require:"true"`
}

func (s QueryGwchildinsuranceRecommendationplanhistoryRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryGwchildinsuranceRecommendationplanhistoryRequest) GoString() string {
	return s.String()
}

func (s *QueryGwchildinsuranceRecommendationplanhistoryRequest) SetAuthToken(v string) *QueryGwchildinsuranceRecommendationplanhistoryRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryGwchildinsuranceRecommendationplanhistoryRequest) SetProductInstanceId(v string) *QueryGwchildinsuranceRecommendationplanhistoryRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryGwchildinsuranceRecommendationplanhistoryRequest) SetTenantId(v string) *QueryGwchildinsuranceRecommendationplanhistoryRequest {
	s.TenantId = &v
	return s
}

func (s *QueryGwchildinsuranceRecommendationplanhistoryRequest) SetRequestData(v string) *QueryGwchildinsuranceRecommendationplanhistoryRequest {
	s.RequestData = &v
	return s
}

type QueryGwchildinsuranceRecommendationplanhistoryResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务数据 JSON 字符串
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
	// 成功时允许为 null，失败时返回可理解原因
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 业务处理是否成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s QueryGwchildinsuranceRecommendationplanhistoryResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryGwchildinsuranceRecommendationplanhistoryResponse) GoString() string {
	return s.String()
}

func (s *QueryGwchildinsuranceRecommendationplanhistoryResponse) SetReqMsgId(v string) *QueryGwchildinsuranceRecommendationplanhistoryResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryGwchildinsuranceRecommendationplanhistoryResponse) SetResultCode(v string) *QueryGwchildinsuranceRecommendationplanhistoryResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryGwchildinsuranceRecommendationplanhistoryResponse) SetResultMsg(v string) *QueryGwchildinsuranceRecommendationplanhistoryResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryGwchildinsuranceRecommendationplanhistoryResponse) SetData(v string) *QueryGwchildinsuranceRecommendationplanhistoryResponse {
	s.Data = &v
	return s
}

func (s *QueryGwchildinsuranceRecommendationplanhistoryResponse) SetMessage(v string) *QueryGwchildinsuranceRecommendationplanhistoryResponse {
	s.Message = &v
	return s
}

func (s *QueryGwchildinsuranceRecommendationplanhistoryResponse) SetSuccess(v bool) *QueryGwchildinsuranceRecommendationplanhistoryResponse {
	s.Success = &v
	return s
}

type SaveGwchildinsuranceActivetargetRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 当前联调租户；必须精确命中 finaigateway 发布白名单
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 输入参数
	RequestData *string `json:"request_data,omitempty" xml:"request_data,omitempty" require:"true"`
}

func (s SaveGwchildinsuranceActivetargetRequest) String() string {
	return tea.Prettify(s)
}

func (s SaveGwchildinsuranceActivetargetRequest) GoString() string {
	return s.String()
}

func (s *SaveGwchildinsuranceActivetargetRequest) SetAuthToken(v string) *SaveGwchildinsuranceActivetargetRequest {
	s.AuthToken = &v
	return s
}

func (s *SaveGwchildinsuranceActivetargetRequest) SetProductInstanceId(v string) *SaveGwchildinsuranceActivetargetRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *SaveGwchildinsuranceActivetargetRequest) SetTenantId(v string) *SaveGwchildinsuranceActivetargetRequest {
	s.TenantId = &v
	return s
}

func (s *SaveGwchildinsuranceActivetargetRequest) SetRequestData(v string) *SaveGwchildinsuranceActivetargetRequest {
	s.RequestData = &v
	return s
}

type SaveGwchildinsuranceActivetargetResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务数据 JSON 字符串
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
	// 成功时允许为 null，失败时返回可理解原因
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 业务处理是否成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s SaveGwchildinsuranceActivetargetResponse) String() string {
	return tea.Prettify(s)
}

func (s SaveGwchildinsuranceActivetargetResponse) GoString() string {
	return s.String()
}

func (s *SaveGwchildinsuranceActivetargetResponse) SetReqMsgId(v string) *SaveGwchildinsuranceActivetargetResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SaveGwchildinsuranceActivetargetResponse) SetResultCode(v string) *SaveGwchildinsuranceActivetargetResponse {
	s.ResultCode = &v
	return s
}

func (s *SaveGwchildinsuranceActivetargetResponse) SetResultMsg(v string) *SaveGwchildinsuranceActivetargetResponse {
	s.ResultMsg = &v
	return s
}

func (s *SaveGwchildinsuranceActivetargetResponse) SetData(v string) *SaveGwchildinsuranceActivetargetResponse {
	s.Data = &v
	return s
}

func (s *SaveGwchildinsuranceActivetargetResponse) SetMessage(v string) *SaveGwchildinsuranceActivetargetResponse {
	s.Message = &v
	return s
}

func (s *SaveGwchildinsuranceActivetargetResponse) SetSuccess(v bool) *SaveGwchildinsuranceActivetargetResponse {
	s.Success = &v
	return s
}

type QueryGwchildinsuranceActivetargetRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 当前联调租户；必须精确命中 finaigateway 发布白名单
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 输入参数
	RequestData *string `json:"request_data,omitempty" xml:"request_data,omitempty" require:"true"`
}

func (s QueryGwchildinsuranceActivetargetRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryGwchildinsuranceActivetargetRequest) GoString() string {
	return s.String()
}

func (s *QueryGwchildinsuranceActivetargetRequest) SetAuthToken(v string) *QueryGwchildinsuranceActivetargetRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryGwchildinsuranceActivetargetRequest) SetProductInstanceId(v string) *QueryGwchildinsuranceActivetargetRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryGwchildinsuranceActivetargetRequest) SetTenantId(v string) *QueryGwchildinsuranceActivetargetRequest {
	s.TenantId = &v
	return s
}

func (s *QueryGwchildinsuranceActivetargetRequest) SetRequestData(v string) *QueryGwchildinsuranceActivetargetRequest {
	s.RequestData = &v
	return s
}

type QueryGwchildinsuranceActivetargetResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务数据 JSON 字符串
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
	// 成功时允许为 null，失败时返回可理解原因
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 业务处理是否成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s QueryGwchildinsuranceActivetargetResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryGwchildinsuranceActivetargetResponse) GoString() string {
	return s.String()
}

func (s *QueryGwchildinsuranceActivetargetResponse) SetReqMsgId(v string) *QueryGwchildinsuranceActivetargetResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryGwchildinsuranceActivetargetResponse) SetResultCode(v string) *QueryGwchildinsuranceActivetargetResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryGwchildinsuranceActivetargetResponse) SetResultMsg(v string) *QueryGwchildinsuranceActivetargetResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryGwchildinsuranceActivetargetResponse) SetData(v string) *QueryGwchildinsuranceActivetargetResponse {
	s.Data = &v
	return s
}

func (s *QueryGwchildinsuranceActivetargetResponse) SetMessage(v string) *QueryGwchildinsuranceActivetargetResponse {
	s.Message = &v
	return s
}

func (s *QueryGwchildinsuranceActivetargetResponse) SetSuccess(v bool) *QueryGwchildinsuranceActivetargetResponse {
	s.Success = &v
	return s
}

type QueryGwchildinsuranceRecommendationcandidateRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 租户
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 请求
	RequestData *string `json:"request_data,omitempty" xml:"request_data,omitempty" require:"true"`
}

func (s QueryGwchildinsuranceRecommendationcandidateRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryGwchildinsuranceRecommendationcandidateRequest) GoString() string {
	return s.String()
}

func (s *QueryGwchildinsuranceRecommendationcandidateRequest) SetAuthToken(v string) *QueryGwchildinsuranceRecommendationcandidateRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryGwchildinsuranceRecommendationcandidateRequest) SetProductInstanceId(v string) *QueryGwchildinsuranceRecommendationcandidateRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryGwchildinsuranceRecommendationcandidateRequest) SetTenantId(v string) *QueryGwchildinsuranceRecommendationcandidateRequest {
	s.TenantId = &v
	return s
}

func (s *QueryGwchildinsuranceRecommendationcandidateRequest) SetRequestData(v string) *QueryGwchildinsuranceRecommendationcandidateRequest {
	s.RequestData = &v
	return s
}

type QueryGwchildinsuranceRecommendationcandidateResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务数据 JSON 字符串
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
	// 成功时允许为 null，失败时返回可理解原因
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 业务处理是否成功
	Success *bool `json:"success,omitempty" xml:"success,omitempty"`
}

func (s QueryGwchildinsuranceRecommendationcandidateResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryGwchildinsuranceRecommendationcandidateResponse) GoString() string {
	return s.String()
}

func (s *QueryGwchildinsuranceRecommendationcandidateResponse) SetReqMsgId(v string) *QueryGwchildinsuranceRecommendationcandidateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryGwchildinsuranceRecommendationcandidateResponse) SetResultCode(v string) *QueryGwchildinsuranceRecommendationcandidateResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryGwchildinsuranceRecommendationcandidateResponse) SetResultMsg(v string) *QueryGwchildinsuranceRecommendationcandidateResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryGwchildinsuranceRecommendationcandidateResponse) SetData(v string) *QueryGwchildinsuranceRecommendationcandidateResponse {
	s.Data = &v
	return s
}

func (s *QueryGwchildinsuranceRecommendationcandidateResponse) SetMessage(v string) *QueryGwchildinsuranceRecommendationcandidateResponse {
	s.Message = &v
	return s
}

func (s *QueryGwchildinsuranceRecommendationcandidateResponse) SetSuccess(v bool) *QueryGwchildinsuranceRecommendationcandidateResponse {
	s.Success = &v
	return s
}

type ResetGwchildinsuranceRecommendationcandidateRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 当前联调租户；必须精确命中 finaigateway 发布白名单
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 输入参数
	RequestData *string `json:"request_data,omitempty" xml:"request_data,omitempty" require:"true"`
}

func (s ResetGwchildinsuranceRecommendationcandidateRequest) String() string {
	return tea.Prettify(s)
}

func (s ResetGwchildinsuranceRecommendationcandidateRequest) GoString() string {
	return s.String()
}

func (s *ResetGwchildinsuranceRecommendationcandidateRequest) SetAuthToken(v string) *ResetGwchildinsuranceRecommendationcandidateRequest {
	s.AuthToken = &v
	return s
}

func (s *ResetGwchildinsuranceRecommendationcandidateRequest) SetProductInstanceId(v string) *ResetGwchildinsuranceRecommendationcandidateRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ResetGwchildinsuranceRecommendationcandidateRequest) SetTenantId(v string) *ResetGwchildinsuranceRecommendationcandidateRequest {
	s.TenantId = &v
	return s
}

func (s *ResetGwchildinsuranceRecommendationcandidateRequest) SetRequestData(v string) *ResetGwchildinsuranceRecommendationcandidateRequest {
	s.RequestData = &v
	return s
}

type ResetGwchildinsuranceRecommendationcandidateResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务数据 JSON 字符串
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
	// 成功时允许为 null，失败时返回可理解原因
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 业务处理是否成功
	Success *string `json:"success,omitempty" xml:"success,omitempty"`
}

func (s ResetGwchildinsuranceRecommendationcandidateResponse) String() string {
	return tea.Prettify(s)
}

func (s ResetGwchildinsuranceRecommendationcandidateResponse) GoString() string {
	return s.String()
}

func (s *ResetGwchildinsuranceRecommendationcandidateResponse) SetReqMsgId(v string) *ResetGwchildinsuranceRecommendationcandidateResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ResetGwchildinsuranceRecommendationcandidateResponse) SetResultCode(v string) *ResetGwchildinsuranceRecommendationcandidateResponse {
	s.ResultCode = &v
	return s
}

func (s *ResetGwchildinsuranceRecommendationcandidateResponse) SetResultMsg(v string) *ResetGwchildinsuranceRecommendationcandidateResponse {
	s.ResultMsg = &v
	return s
}

func (s *ResetGwchildinsuranceRecommendationcandidateResponse) SetData(v string) *ResetGwchildinsuranceRecommendationcandidateResponse {
	s.Data = &v
	return s
}

func (s *ResetGwchildinsuranceRecommendationcandidateResponse) SetMessage(v string) *ResetGwchildinsuranceRecommendationcandidateResponse {
	s.Message = &v
	return s
}

func (s *ResetGwchildinsuranceRecommendationcandidateResponse) SetSuccess(v string) *ResetGwchildinsuranceRecommendationcandidateResponse {
	s.Success = &v
	return s
}

type QueryGwchildinsuranceCompareproductlistRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 当前联调租户；必须精确命中 finaigateway 发布白名单
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 输入参数
	RequestData *string `json:"request_data,omitempty" xml:"request_data,omitempty"`
}

func (s QueryGwchildinsuranceCompareproductlistRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryGwchildinsuranceCompareproductlistRequest) GoString() string {
	return s.String()
}

func (s *QueryGwchildinsuranceCompareproductlistRequest) SetAuthToken(v string) *QueryGwchildinsuranceCompareproductlistRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryGwchildinsuranceCompareproductlistRequest) SetProductInstanceId(v string) *QueryGwchildinsuranceCompareproductlistRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryGwchildinsuranceCompareproductlistRequest) SetTenantId(v string) *QueryGwchildinsuranceCompareproductlistRequest {
	s.TenantId = &v
	return s
}

func (s *QueryGwchildinsuranceCompareproductlistRequest) SetRequestData(v string) *QueryGwchildinsuranceCompareproductlistRequest {
	s.RequestData = &v
	return s
}

type QueryGwchildinsuranceCompareproductlistResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务数据 JSON 字符串
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
	// 成功时允许为 null，失败时返回可理解原因
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 业务处理是否成功
	Success *string `json:"success,omitempty" xml:"success,omitempty"`
}

func (s QueryGwchildinsuranceCompareproductlistResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryGwchildinsuranceCompareproductlistResponse) GoString() string {
	return s.String()
}

func (s *QueryGwchildinsuranceCompareproductlistResponse) SetReqMsgId(v string) *QueryGwchildinsuranceCompareproductlistResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryGwchildinsuranceCompareproductlistResponse) SetResultCode(v string) *QueryGwchildinsuranceCompareproductlistResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryGwchildinsuranceCompareproductlistResponse) SetResultMsg(v string) *QueryGwchildinsuranceCompareproductlistResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryGwchildinsuranceCompareproductlistResponse) SetData(v string) *QueryGwchildinsuranceCompareproductlistResponse {
	s.Data = &v
	return s
}

func (s *QueryGwchildinsuranceCompareproductlistResponse) SetMessage(v string) *QueryGwchildinsuranceCompareproductlistResponse {
	s.Message = &v
	return s
}

func (s *QueryGwchildinsuranceCompareproductlistResponse) SetSuccess(v string) *QueryGwchildinsuranceCompareproductlistResponse {
	s.Success = &v
	return s
}

type QueryGwchildinsuranceCompareproductdetailRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 当前联调租户；必须精确命中 finaigateway 发布白名单
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 输入参数
	RequestData *string `json:"request_data,omitempty" xml:"request_data,omitempty"`
}

func (s QueryGwchildinsuranceCompareproductdetailRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryGwchildinsuranceCompareproductdetailRequest) GoString() string {
	return s.String()
}

func (s *QueryGwchildinsuranceCompareproductdetailRequest) SetAuthToken(v string) *QueryGwchildinsuranceCompareproductdetailRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryGwchildinsuranceCompareproductdetailRequest) SetProductInstanceId(v string) *QueryGwchildinsuranceCompareproductdetailRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryGwchildinsuranceCompareproductdetailRequest) SetTenantId(v string) *QueryGwchildinsuranceCompareproductdetailRequest {
	s.TenantId = &v
	return s
}

func (s *QueryGwchildinsuranceCompareproductdetailRequest) SetRequestData(v string) *QueryGwchildinsuranceCompareproductdetailRequest {
	s.RequestData = &v
	return s
}

type QueryGwchildinsuranceCompareproductdetailResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务数据 JSON 字符串
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
	// 成功时允许为 null，失败时返回可理解原因
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 业务处理是否成功
	Success *string `json:"success,omitempty" xml:"success,omitempty"`
}

func (s QueryGwchildinsuranceCompareproductdetailResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryGwchildinsuranceCompareproductdetailResponse) GoString() string {
	return s.String()
}

func (s *QueryGwchildinsuranceCompareproductdetailResponse) SetReqMsgId(v string) *QueryGwchildinsuranceCompareproductdetailResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryGwchildinsuranceCompareproductdetailResponse) SetResultCode(v string) *QueryGwchildinsuranceCompareproductdetailResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryGwchildinsuranceCompareproductdetailResponse) SetResultMsg(v string) *QueryGwchildinsuranceCompareproductdetailResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryGwchildinsuranceCompareproductdetailResponse) SetData(v string) *QueryGwchildinsuranceCompareproductdetailResponse {
	s.Data = &v
	return s
}

func (s *QueryGwchildinsuranceCompareproductdetailResponse) SetMessage(v string) *QueryGwchildinsuranceCompareproductdetailResponse {
	s.Message = &v
	return s
}

func (s *QueryGwchildinsuranceCompareproductdetailResponse) SetSuccess(v string) *QueryGwchildinsuranceCompareproductdetailResponse {
	s.Success = &v
	return s
}

type QueryGwchildinsuranceCompareproductlistidsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 当前联调租户；必须精确命中 finaigateway 发布白名单
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 输入参数
	RequestData *string `json:"request_data,omitempty" xml:"request_data,omitempty" require:"true"`
}

func (s QueryGwchildinsuranceCompareproductlistidsRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryGwchildinsuranceCompareproductlistidsRequest) GoString() string {
	return s.String()
}

func (s *QueryGwchildinsuranceCompareproductlistidsRequest) SetAuthToken(v string) *QueryGwchildinsuranceCompareproductlistidsRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryGwchildinsuranceCompareproductlistidsRequest) SetProductInstanceId(v string) *QueryGwchildinsuranceCompareproductlistidsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryGwchildinsuranceCompareproductlistidsRequest) SetTenantId(v string) *QueryGwchildinsuranceCompareproductlistidsRequest {
	s.TenantId = &v
	return s
}

func (s *QueryGwchildinsuranceCompareproductlistidsRequest) SetRequestData(v string) *QueryGwchildinsuranceCompareproductlistidsRequest {
	s.RequestData = &v
	return s
}

type QueryGwchildinsuranceCompareproductlistidsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务数据 JSON 字符串
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
	// 成功时允许为 null，失败时返回可理解原因
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 业务处理是否成功
	Success *string `json:"success,omitempty" xml:"success,omitempty"`
}

func (s QueryGwchildinsuranceCompareproductlistidsResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryGwchildinsuranceCompareproductlistidsResponse) GoString() string {
	return s.String()
}

func (s *QueryGwchildinsuranceCompareproductlistidsResponse) SetReqMsgId(v string) *QueryGwchildinsuranceCompareproductlistidsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryGwchildinsuranceCompareproductlistidsResponse) SetResultCode(v string) *QueryGwchildinsuranceCompareproductlistidsResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryGwchildinsuranceCompareproductlistidsResponse) SetResultMsg(v string) *QueryGwchildinsuranceCompareproductlistidsResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryGwchildinsuranceCompareproductlistidsResponse) SetData(v string) *QueryGwchildinsuranceCompareproductlistidsResponse {
	s.Data = &v
	return s
}

func (s *QueryGwchildinsuranceCompareproductlistidsResponse) SetMessage(v string) *QueryGwchildinsuranceCompareproductlistidsResponse {
	s.Message = &v
	return s
}

func (s *QueryGwchildinsuranceCompareproductlistidsResponse) SetSuccess(v string) *QueryGwchildinsuranceCompareproductlistidsResponse {
	s.Success = &v
	return s
}

type QueryGwchildinsuranceCompareproductbyidsRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 当前联调租户；必须精确命中 finaigateway 发布白名单
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 输入参数
	RequestData *string `json:"request_data,omitempty" xml:"request_data,omitempty" require:"true"`
}

func (s QueryGwchildinsuranceCompareproductbyidsRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryGwchildinsuranceCompareproductbyidsRequest) GoString() string {
	return s.String()
}

func (s *QueryGwchildinsuranceCompareproductbyidsRequest) SetAuthToken(v string) *QueryGwchildinsuranceCompareproductbyidsRequest {
	s.AuthToken = &v
	return s
}

func (s *QueryGwchildinsuranceCompareproductbyidsRequest) SetProductInstanceId(v string) *QueryGwchildinsuranceCompareproductbyidsRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *QueryGwchildinsuranceCompareproductbyidsRequest) SetTenantId(v string) *QueryGwchildinsuranceCompareproductbyidsRequest {
	s.TenantId = &v
	return s
}

func (s *QueryGwchildinsuranceCompareproductbyidsRequest) SetRequestData(v string) *QueryGwchildinsuranceCompareproductbyidsRequest {
	s.RequestData = &v
	return s
}

type QueryGwchildinsuranceCompareproductbyidsResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务数据 JSON 字符串
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
	// 成功时允许为 null，失败时返回可理解原因
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 业务处理是否成功
	Success *string `json:"success,omitempty" xml:"success,omitempty"`
}

func (s QueryGwchildinsuranceCompareproductbyidsResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryGwchildinsuranceCompareproductbyidsResponse) GoString() string {
	return s.String()
}

func (s *QueryGwchildinsuranceCompareproductbyidsResponse) SetReqMsgId(v string) *QueryGwchildinsuranceCompareproductbyidsResponse {
	s.ReqMsgId = &v
	return s
}

func (s *QueryGwchildinsuranceCompareproductbyidsResponse) SetResultCode(v string) *QueryGwchildinsuranceCompareproductbyidsResponse {
	s.ResultCode = &v
	return s
}

func (s *QueryGwchildinsuranceCompareproductbyidsResponse) SetResultMsg(v string) *QueryGwchildinsuranceCompareproductbyidsResponse {
	s.ResultMsg = &v
	return s
}

func (s *QueryGwchildinsuranceCompareproductbyidsResponse) SetData(v string) *QueryGwchildinsuranceCompareproductbyidsResponse {
	s.Data = &v
	return s
}

func (s *QueryGwchildinsuranceCompareproductbyidsResponse) SetMessage(v string) *QueryGwchildinsuranceCompareproductbyidsResponse {
	s.Message = &v
	return s
}

func (s *QueryGwchildinsuranceCompareproductbyidsResponse) SetSuccess(v string) *QueryGwchildinsuranceCompareproductbyidsResponse {
	s.Success = &v
	return s
}

type DetailGwchildinsuranceOptionalresponsibilityplanRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 当前联调租户；必须精确命中 finaigateway 发布白名单
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 输入参数
	RequestData *string `json:"request_data,omitempty" xml:"request_data,omitempty" require:"true"`
}

func (s DetailGwchildinsuranceOptionalresponsibilityplanRequest) String() string {
	return tea.Prettify(s)
}

func (s DetailGwchildinsuranceOptionalresponsibilityplanRequest) GoString() string {
	return s.String()
}

func (s *DetailGwchildinsuranceOptionalresponsibilityplanRequest) SetAuthToken(v string) *DetailGwchildinsuranceOptionalresponsibilityplanRequest {
	s.AuthToken = &v
	return s
}

func (s *DetailGwchildinsuranceOptionalresponsibilityplanRequest) SetProductInstanceId(v string) *DetailGwchildinsuranceOptionalresponsibilityplanRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *DetailGwchildinsuranceOptionalresponsibilityplanRequest) SetTenantId(v string) *DetailGwchildinsuranceOptionalresponsibilityplanRequest {
	s.TenantId = &v
	return s
}

func (s *DetailGwchildinsuranceOptionalresponsibilityplanRequest) SetRequestData(v string) *DetailGwchildinsuranceOptionalresponsibilityplanRequest {
	s.RequestData = &v
	return s
}

type DetailGwchildinsuranceOptionalresponsibilityplanResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务数据 JSON 字符串
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
	// 成功时允许为 null，失败时返回可理解原因
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 业务处理是否成功
	Success *string `json:"success,omitempty" xml:"success,omitempty"`
}

func (s DetailGwchildinsuranceOptionalresponsibilityplanResponse) String() string {
	return tea.Prettify(s)
}

func (s DetailGwchildinsuranceOptionalresponsibilityplanResponse) GoString() string {
	return s.String()
}

func (s *DetailGwchildinsuranceOptionalresponsibilityplanResponse) SetReqMsgId(v string) *DetailGwchildinsuranceOptionalresponsibilityplanResponse {
	s.ReqMsgId = &v
	return s
}

func (s *DetailGwchildinsuranceOptionalresponsibilityplanResponse) SetResultCode(v string) *DetailGwchildinsuranceOptionalresponsibilityplanResponse {
	s.ResultCode = &v
	return s
}

func (s *DetailGwchildinsuranceOptionalresponsibilityplanResponse) SetResultMsg(v string) *DetailGwchildinsuranceOptionalresponsibilityplanResponse {
	s.ResultMsg = &v
	return s
}

func (s *DetailGwchildinsuranceOptionalresponsibilityplanResponse) SetData(v string) *DetailGwchildinsuranceOptionalresponsibilityplanResponse {
	s.Data = &v
	return s
}

func (s *DetailGwchildinsuranceOptionalresponsibilityplanResponse) SetMessage(v string) *DetailGwchildinsuranceOptionalresponsibilityplanResponse {
	s.Message = &v
	return s
}

func (s *DetailGwchildinsuranceOptionalresponsibilityplanResponse) SetSuccess(v string) *DetailGwchildinsuranceOptionalresponsibilityplanResponse {
	s.Success = &v
	return s
}

type ResolveGwchildinsuranceOptionalresponsibilityplanRequest struct {
	// OAuth模式下的授权token
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	// 当前联调租户；必须精确命中 finaigateway 发布白名单
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty" require:"true"`
	// 输入参数
	RequestData *string `json:"request_data,omitempty" xml:"request_data,omitempty" require:"true"`
}

func (s ResolveGwchildinsuranceOptionalresponsibilityplanRequest) String() string {
	return tea.Prettify(s)
}

func (s ResolveGwchildinsuranceOptionalresponsibilityplanRequest) GoString() string {
	return s.String()
}

func (s *ResolveGwchildinsuranceOptionalresponsibilityplanRequest) SetAuthToken(v string) *ResolveGwchildinsuranceOptionalresponsibilityplanRequest {
	s.AuthToken = &v
	return s
}

func (s *ResolveGwchildinsuranceOptionalresponsibilityplanRequest) SetProductInstanceId(v string) *ResolveGwchildinsuranceOptionalresponsibilityplanRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *ResolveGwchildinsuranceOptionalresponsibilityplanRequest) SetTenantId(v string) *ResolveGwchildinsuranceOptionalresponsibilityplanRequest {
	s.TenantId = &v
	return s
}

func (s *ResolveGwchildinsuranceOptionalresponsibilityplanRequest) SetRequestData(v string) *ResolveGwchildinsuranceOptionalresponsibilityplanRequest {
	s.RequestData = &v
	return s
}

type ResolveGwchildinsuranceOptionalresponsibilityplanResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 业务数据 JSON 字符串
	Data *string `json:"data,omitempty" xml:"data,omitempty"`
	// 成功时允许为 null，失败时返回可理解原因
	Message *string `json:"message,omitempty" xml:"message,omitempty"`
	// 业务处理是否成功
	Success *string `json:"success,omitempty" xml:"success,omitempty"`
}

func (s ResolveGwchildinsuranceOptionalresponsibilityplanResponse) String() string {
	return tea.Prettify(s)
}

func (s ResolveGwchildinsuranceOptionalresponsibilityplanResponse) GoString() string {
	return s.String()
}

func (s *ResolveGwchildinsuranceOptionalresponsibilityplanResponse) SetReqMsgId(v string) *ResolveGwchildinsuranceOptionalresponsibilityplanResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ResolveGwchildinsuranceOptionalresponsibilityplanResponse) SetResultCode(v string) *ResolveGwchildinsuranceOptionalresponsibilityplanResponse {
	s.ResultCode = &v
	return s
}

func (s *ResolveGwchildinsuranceOptionalresponsibilityplanResponse) SetResultMsg(v string) *ResolveGwchildinsuranceOptionalresponsibilityplanResponse {
	s.ResultMsg = &v
	return s
}

func (s *ResolveGwchildinsuranceOptionalresponsibilityplanResponse) SetData(v string) *ResolveGwchildinsuranceOptionalresponsibilityplanResponse {
	s.Data = &v
	return s
}

func (s *ResolveGwchildinsuranceOptionalresponsibilityplanResponse) SetMessage(v string) *ResolveGwchildinsuranceOptionalresponsibilityplanResponse {
	s.Message = &v
	return s
}

func (s *ResolveGwchildinsuranceOptionalresponsibilityplanResponse) SetSuccess(v string) *ResolveGwchildinsuranceOptionalresponsibilityplanResponse {
	s.Success = &v
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
				"sdk_version":      tea.String("1.0.16"),
				"_prod_code":       tea.String("AIOSPRODUCT"),
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
// Description: AIOS GwDefault流式输出
//
// Summary: AIOS GwDefault流式输出
func (client *Client) QueryGwdefaultChatstream(request *QueryGwdefaultChatstreamRequest) (_result *QueryGwdefaultChatstreamResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryGwdefaultChatstreamResponse{}
	_body, _err := client.QueryGwdefaultChatstreamEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: AIOS GwDefault流式输出
//
// Summary: AIOS GwDefault流式输出
func (client *Client) QueryGwdefaultChatstreamEx(request *QueryGwdefaultChatstreamRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryGwdefaultChatstreamResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryGwdefaultChatstreamResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.aiosproduct.gwdefault.chatstream.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: AIOS同步对话
//
// Summary: AIOS同步对话
func (client *Client) QueryGwdefaultChat(request *QueryGwdefaultChatRequest) (_result *QueryGwdefaultChatResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryGwdefaultChatResponse{}
	_body, _err := client.QueryGwdefaultChatEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: AIOS同步对话
//
// Summary: AIOS同步对话
func (client *Client) QueryGwdefaultChatEx(request *QueryGwdefaultChatRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryGwdefaultChatResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryGwdefaultChatResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.aiosproduct.gwdefault.chat.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: AIOS 少儿保险 流式对话
//
// Summary: AIOS 少儿保险 流式对话
func (client *Client) QueryGwchildinsuranceChatstream(request *QueryGwchildinsuranceChatstreamRequest) (_result *QueryGwchildinsuranceChatstreamResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryGwchildinsuranceChatstreamResponse{}
	_body, _err := client.QueryGwchildinsuranceChatstreamEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: AIOS 少儿保险 流式对话
//
// Summary: AIOS 少儿保险 流式对话
func (client *Client) QueryGwchildinsuranceChatstreamEx(request *QueryGwchildinsuranceChatstreamRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryGwchildinsuranceChatstreamResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryGwchildinsuranceChatstreamResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.aiosproduct.gwchildinsurance.chatstream.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: AIOS 少儿保险 非流式对话
//
// Summary: AIOS 少儿保险 非流式对话
func (client *Client) QueryGwchildinsuranceChat(request *QueryGwchildinsuranceChatRequest) (_result *QueryGwchildinsuranceChatResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryGwchildinsuranceChatResponse{}
	_body, _err := client.QueryGwchildinsuranceChatEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: AIOS 少儿保险 非流式对话
//
// Summary: AIOS 少儿保险 非流式对话
func (client *Client) QueryGwchildinsuranceChatEx(request *QueryGwchildinsuranceChatRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryGwchildinsuranceChatResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryGwchildinsuranceChatResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.aiosproduct.gwchildinsurance.chat.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 少儿保险最近档案查询
//
// Summary: 少儿保险最近档案查询
func (client *Client) QueryGwchildinsuranceProfilelatest(request *QueryGwchildinsuranceProfilelatestRequest) (_result *QueryGwchildinsuranceProfilelatestResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryGwchildinsuranceProfilelatestResponse{}
	_body, _err := client.QueryGwchildinsuranceProfilelatestEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 少儿保险最近档案查询
//
// Summary: 少儿保险最近档案查询
func (client *Client) QueryGwchildinsuranceProfilelatestEx(request *QueryGwchildinsuranceProfilelatestRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryGwchildinsuranceProfilelatestResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryGwchildinsuranceProfilelatestResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.aiosproduct.gwchildinsurance.profilelatest.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 少儿保险当前会话档案查询
//
// Summary: 少儿保险当前会话档案查询
func (client *Client) QueryGwchildinsuranceProfiledetail(request *QueryGwchildinsuranceProfiledetailRequest) (_result *QueryGwchildinsuranceProfiledetailResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryGwchildinsuranceProfiledetailResponse{}
	_body, _err := client.QueryGwchildinsuranceProfiledetailEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 少儿保险当前会话档案查询
//
// Summary: 少儿保险当前会话档案查询
func (client *Client) QueryGwchildinsuranceProfiledetailEx(request *QueryGwchildinsuranceProfiledetailRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryGwchildinsuranceProfiledetailResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryGwchildinsuranceProfiledetailResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.aiosproduct.gwchildinsurance.profiledetail.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 少儿保险家庭与孩子档案保存
//
// Summary: 少儿保险家庭与孩子档案保存
func (client *Client) SaveGwchildinsuranceProfile(request *SaveGwchildinsuranceProfileRequest) (_result *SaveGwchildinsuranceProfileResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SaveGwchildinsuranceProfileResponse{}
	_body, _err := client.SaveGwchildinsuranceProfileEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 少儿保险家庭与孩子档案保存
//
// Summary: 少儿保险家庭与孩子档案保存
func (client *Client) SaveGwchildinsuranceProfileEx(request *SaveGwchildinsuranceProfileRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SaveGwchildinsuranceProfileResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SaveGwchildinsuranceProfileResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.aiosproduct.gwchildinsurance.profile.save"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 少儿保险 KYC 查询
//
// Summary: 少儿保险 KYC 查询
func (client *Client) QueryGwchildinsuranceSolutionkycdetail(request *QueryGwchildinsuranceSolutionkycdetailRequest) (_result *QueryGwchildinsuranceSolutionkycdetailResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryGwchildinsuranceSolutionkycdetailResponse{}
	_body, _err := client.QueryGwchildinsuranceSolutionkycdetailEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 少儿保险 KYC 查询
//
// Summary: 少儿保险 KYC 查询
func (client *Client) QueryGwchildinsuranceSolutionkycdetailEx(request *QueryGwchildinsuranceSolutionkycdetailRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryGwchildinsuranceSolutionkycdetailResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryGwchildinsuranceSolutionkycdetailResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.aiosproduct.gwchildinsurance.solutionkycdetail.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 少儿保险 KYC 保存
//
// Summary: 少儿保险 KYC 保存
func (client *Client) SaveGwchildinsuranceSolutionkyc(request *SaveGwchildinsuranceSolutionkycRequest) (_result *SaveGwchildinsuranceSolutionkycResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SaveGwchildinsuranceSolutionkycResponse{}
	_body, _err := client.SaveGwchildinsuranceSolutionkycEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 少儿保险 KYC 保存
//
// Summary: 少儿保险 KYC 保存
func (client *Client) SaveGwchildinsuranceSolutionkycEx(request *SaveGwchildinsuranceSolutionkycRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SaveGwchildinsuranceSolutionkycResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SaveGwchildinsuranceSolutionkycResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.aiosproduct.gwchildinsurance.solutionkyc.save"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: mcp网关调用
//
// Summary: mcp网关调用
func (client *Client) QueryGwmcpdefaultChat(request *QueryGwmcpdefaultChatRequest) (_result *QueryGwmcpdefaultChatResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryGwmcpdefaultChatResponse{}
	_body, _err := client.QueryGwmcpdefaultChatEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: mcp网关调用
//
// Summary: mcp网关调用
func (client *Client) QueryGwmcpdefaultChatEx(request *QueryGwmcpdefaultChatRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryGwmcpdefaultChatResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryGwmcpdefaultChatResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.aiosproduct.gwmcpdefault.chat.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 根据最新画像版本，保存指定用户、指定会话参与保险规划的稳定 `childIds`，并返回最新规划上下文。调用方必须传 `profileVersion`、`childIds`、`idempotencyKey`；不按昵称或数组位置选择。
//
// Summary: 根据最新画像版本，保存指定用户、指定会话参与保险规划的稳定 `childIds`，并返回最新规划上下文。调用方必须传 `profileVersion`、`childIds`、`idempotencyKey`；不按昵称或数组位置选择。
func (client *Client) SaveGwchildinsurancePlanningtargets(request *SaveGwchildinsurancePlanningtargetsRequest) (_result *SaveGwchildinsurancePlanningtargetsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SaveGwchildinsurancePlanningtargetsResponse{}
	_body, _err := client.SaveGwchildinsurancePlanningtargetsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 根据最新画像版本，保存指定用户、指定会话参与保险规划的稳定 `childIds`，并返回最新规划上下文。调用方必须传 `profileVersion`、`childIds`、`idempotencyKey`；不按昵称或数组位置选择。
//
// Summary: 根据最新画像版本，保存指定用户、指定会话参与保险规划的稳定 `childIds`，并返回最新规划上下文。调用方必须传 `profileVersion`、`childIds`、`idempotencyKey`；不按昵称或数组位置选择。
func (client *Client) SaveGwchildinsurancePlanningtargetsEx(request *SaveGwchildinsurancePlanningtargetsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SaveGwchildinsurancePlanningtargetsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SaveGwchildinsurancePlanningtargetsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.aiosproduct.gwchildinsurance.planningtargets.save"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 查询指定用户和会话当前生效的少儿保险规划目标。
//
// Summary: 查询指定用户和会话当前生效的少儿保险规划目标。
func (client *Client) QueryGwchildinsurancePlanningtargets(request *QueryGwchildinsurancePlanningtargetsRequest) (_result *QueryGwchildinsurancePlanningtargetsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryGwchildinsurancePlanningtargetsResponse{}
	_body, _err := client.QueryGwchildinsurancePlanningtargetsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 查询指定用户和会话当前生效的少儿保险规划目标。
//
// Summary: 查询指定用户和会话当前生效的少儿保险规划目标。
func (client *Client) QueryGwchildinsurancePlanningtargetsEx(request *QueryGwchildinsurancePlanningtargetsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryGwchildinsurancePlanningtargetsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryGwchildinsurancePlanningtargetsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.aiosproduct.gwchildinsurance.planningtargets.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 查询最近选择的孩子
//
// Summary: 查询最近选择的孩子
func (client *Client) QueryGwchildinsurancePlanningtargetslatest(request *QueryGwchildinsurancePlanningtargetslatestRequest) (_result *QueryGwchildinsurancePlanningtargetslatestResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryGwchildinsurancePlanningtargetslatestResponse{}
	_body, _err := client.QueryGwchildinsurancePlanningtargetslatestEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 查询最近选择的孩子
//
// Summary: 查询最近选择的孩子
func (client *Client) QueryGwchildinsurancePlanningtargetslatestEx(request *QueryGwchildinsurancePlanningtargetslatestRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryGwchildinsurancePlanningtargetslatestResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryGwchildinsurancePlanningtargetslatestResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.aiosproduct.gwchildinsurance.planningtargetslatest.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 查询推荐方案详情
//
// Summary: 查询推荐方案详情
func (client *Client) QueryGwchildinsuranceRecommendationplandetail(request *QueryGwchildinsuranceRecommendationplandetailRequest) (_result *QueryGwchildinsuranceRecommendationplandetailResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryGwchildinsuranceRecommendationplandetailResponse{}
	_body, _err := client.QueryGwchildinsuranceRecommendationplandetailEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 查询推荐方案详情
//
// Summary: 查询推荐方案详情
func (client *Client) QueryGwchildinsuranceRecommendationplandetailEx(request *QueryGwchildinsuranceRecommendationplandetailRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryGwchildinsuranceRecommendationplandetailResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryGwchildinsuranceRecommendationplandetailResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.aiosproduct.gwchildinsurance.recommendationplandetail.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 保存H5调整后的方案版本
//
// Summary: 保存H5调整后的方案版本
func (client *Client) SaveGwchildinsuranceRecommendationplanadjust(request *SaveGwchildinsuranceRecommendationplanadjustRequest) (_result *SaveGwchildinsuranceRecommendationplanadjustResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SaveGwchildinsuranceRecommendationplanadjustResponse{}
	_body, _err := client.SaveGwchildinsuranceRecommendationplanadjustEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 保存H5调整后的方案版本
//
// Summary: 保存H5调整后的方案版本
func (client *Client) SaveGwchildinsuranceRecommendationplanadjustEx(request *SaveGwchildinsuranceRecommendationplanadjustRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SaveGwchildinsuranceRecommendationplanadjustResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SaveGwchildinsuranceRecommendationplanadjustResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.aiosproduct.gwchildinsurance.recommendationplanadjust.save"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 确认方案及最终价格
//
// Summary: 确认方案及最终价格
func (client *Client) SaveGwchildinsuranceRecommendationplanconfirm(request *SaveGwchildinsuranceRecommendationplanconfirmRequest) (_result *SaveGwchildinsuranceRecommendationplanconfirmResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SaveGwchildinsuranceRecommendationplanconfirmResponse{}
	_body, _err := client.SaveGwchildinsuranceRecommendationplanconfirmEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 确认方案及最终价格
//
// Summary: 确认方案及最终价格
func (client *Client) SaveGwchildinsuranceRecommendationplanconfirmEx(request *SaveGwchildinsuranceRecommendationplanconfirmRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SaveGwchildinsuranceRecommendationplanconfirmResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SaveGwchildinsuranceRecommendationplanconfirmResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.aiosproduct.gwchildinsurance.recommendationplanconfirm.save"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 查询历史推荐方案
//
// Summary: 查询历史推荐方案
func (client *Client) QueryGwchildinsuranceRecommendationplanhistory(request *QueryGwchildinsuranceRecommendationplanhistoryRequest) (_result *QueryGwchildinsuranceRecommendationplanhistoryResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryGwchildinsuranceRecommendationplanhistoryResponse{}
	_body, _err := client.QueryGwchildinsuranceRecommendationplanhistoryEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 查询历史推荐方案
//
// Summary: 查询历史推荐方案
func (client *Client) QueryGwchildinsuranceRecommendationplanhistoryEx(request *QueryGwchildinsuranceRecommendationplanhistoryRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryGwchildinsuranceRecommendationplanhistoryResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryGwchildinsuranceRecommendationplanhistoryResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.aiosproduct.gwchildinsurance.recommendationplanhistory.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 少儿保险当前孩子设置
//
// Summary: 少儿保险当前孩子设置
func (client *Client) SaveGwchildinsuranceActivetarget(request *SaveGwchildinsuranceActivetargetRequest) (_result *SaveGwchildinsuranceActivetargetResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SaveGwchildinsuranceActivetargetResponse{}
	_body, _err := client.SaveGwchildinsuranceActivetargetEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 少儿保险当前孩子设置
//
// Summary: 少儿保险当前孩子设置
func (client *Client) SaveGwchildinsuranceActivetargetEx(request *SaveGwchildinsuranceActivetargetRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SaveGwchildinsuranceActivetargetResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SaveGwchildinsuranceActivetargetResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.aiosproduct.gwchildinsurance.activetarget.save"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 少儿保险当前孩子查询
//
// Summary: 少儿保险当前孩子查询
func (client *Client) QueryGwchildinsuranceActivetarget(request *QueryGwchildinsuranceActivetargetRequest) (_result *QueryGwchildinsuranceActivetargetResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryGwchildinsuranceActivetargetResponse{}
	_body, _err := client.QueryGwchildinsuranceActivetargetEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 少儿保险当前孩子查询
//
// Summary: 少儿保险当前孩子查询
func (client *Client) QueryGwchildinsuranceActivetargetEx(request *QueryGwchildinsuranceActivetargetRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryGwchildinsuranceActivetargetResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryGwchildinsuranceActivetargetResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.aiosproduct.gwchildinsurance.activetarget.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 少儿保险推荐候选详情查询
//
// Summary: 少儿保险推荐候选详情查询
func (client *Client) QueryGwchildinsuranceRecommendationcandidate(request *QueryGwchildinsuranceRecommendationcandidateRequest) (_result *QueryGwchildinsuranceRecommendationcandidateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryGwchildinsuranceRecommendationcandidateResponse{}
	_body, _err := client.QueryGwchildinsuranceRecommendationcandidateEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 少儿保险推荐候选详情查询
//
// Summary: 少儿保险推荐候选详情查询
func (client *Client) QueryGwchildinsuranceRecommendationcandidateEx(request *QueryGwchildinsuranceRecommendationcandidateRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryGwchildinsuranceRecommendationcandidateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryGwchildinsuranceRecommendationcandidateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.aiosproduct.gwchildinsurance.recommendationcandidate.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 选择预览
//
// Summary: 选择预览
func (client *Client) ResetGwchildinsuranceRecommendationcandidate(request *ResetGwchildinsuranceRecommendationcandidateRequest) (_result *ResetGwchildinsuranceRecommendationcandidateResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ResetGwchildinsuranceRecommendationcandidateResponse{}
	_body, _err := client.ResetGwchildinsuranceRecommendationcandidateEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 选择预览
//
// Summary: 选择预览
func (client *Client) ResetGwchildinsuranceRecommendationcandidateEx(request *ResetGwchildinsuranceRecommendationcandidateRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ResetGwchildinsuranceRecommendationcandidateResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ResetGwchildinsuranceRecommendationcandidateResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.aiosproduct.gwchildinsurance.recommendationcandidate.reset"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 商品对比列表查询
//
// Summary: 商品对比列表查询
func (client *Client) QueryGwchildinsuranceCompareproductlist(request *QueryGwchildinsuranceCompareproductlistRequest) (_result *QueryGwchildinsuranceCompareproductlistResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryGwchildinsuranceCompareproductlistResponse{}
	_body, _err := client.QueryGwchildinsuranceCompareproductlistEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 商品对比列表查询
//
// Summary: 商品对比列表查询
func (client *Client) QueryGwchildinsuranceCompareproductlistEx(request *QueryGwchildinsuranceCompareproductlistRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryGwchildinsuranceCompareproductlistResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryGwchildinsuranceCompareproductlistResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.aiosproduct.gwchildinsurance.compareproductlist.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 商品对比详情查询
//
// Summary: 商品对比详情查询
func (client *Client) QueryGwchildinsuranceCompareproductdetail(request *QueryGwchildinsuranceCompareproductdetailRequest) (_result *QueryGwchildinsuranceCompareproductdetailResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryGwchildinsuranceCompareproductdetailResponse{}
	_body, _err := client.QueryGwchildinsuranceCompareproductdetailEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 商品对比详情查询
//
// Summary: 商品对比详情查询
func (client *Client) QueryGwchildinsuranceCompareproductdetailEx(request *QueryGwchildinsuranceCompareproductdetailRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryGwchildinsuranceCompareproductdetailResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryGwchildinsuranceCompareproductdetailResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.aiosproduct.gwchildinsurance.compareproductdetail.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 产品对比 ID 列表查询
//
// Summary: 产品对比 ID 列表查询
func (client *Client) QueryGwchildinsuranceCompareproductlistids(request *QueryGwchildinsuranceCompareproductlistidsRequest) (_result *QueryGwchildinsuranceCompareproductlistidsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryGwchildinsuranceCompareproductlistidsResponse{}
	_body, _err := client.QueryGwchildinsuranceCompareproductlistidsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 产品对比 ID 列表查询
//
// Summary: 产品对比 ID 列表查询
func (client *Client) QueryGwchildinsuranceCompareproductlistidsEx(request *QueryGwchildinsuranceCompareproductlistidsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryGwchildinsuranceCompareproductlistidsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryGwchildinsuranceCompareproductlistidsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.aiosproduct.gwchildinsurance.compareproductlistids.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 按 ID 获取产品对比数据
//
// Summary: 按 ID 获取产品对比数据
func (client *Client) QueryGwchildinsuranceCompareproductbyids(request *QueryGwchildinsuranceCompareproductbyidsRequest) (_result *QueryGwchildinsuranceCompareproductbyidsResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &QueryGwchildinsuranceCompareproductbyidsResponse{}
	_body, _err := client.QueryGwchildinsuranceCompareproductbyidsEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 按 ID 获取产品对比数据
//
// Summary: 按 ID 获取产品对比数据
func (client *Client) QueryGwchildinsuranceCompareproductbyidsEx(request *QueryGwchildinsuranceCompareproductbyidsRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *QueryGwchildinsuranceCompareproductbyidsResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryGwchildinsuranceCompareproductbyidsResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.aiosproduct.gwchildinsurance.compareproductbyids.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 可选责任计划详情查询
//
// Summary: 可选责任计划详情查询
func (client *Client) DetailGwchildinsuranceOptionalresponsibilityplan(request *DetailGwchildinsuranceOptionalresponsibilityplanRequest) (_result *DetailGwchildinsuranceOptionalresponsibilityplanResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &DetailGwchildinsuranceOptionalresponsibilityplanResponse{}
	_body, _err := client.DetailGwchildinsuranceOptionalresponsibilityplanEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 可选责任计划详情查询
//
// Summary: 可选责任计划详情查询
func (client *Client) DetailGwchildinsuranceOptionalresponsibilityplanEx(request *DetailGwchildinsuranceOptionalresponsibilityplanRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *DetailGwchildinsuranceOptionalresponsibilityplanResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &DetailGwchildinsuranceOptionalresponsibilityplanResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.aiosproduct.gwchildinsurance.optionalresponsibilityplan.detail"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

// Description:
//
// Description: 可选责任计划按因子反查
//
// Summary: 可选责任计划按因子反查
func (client *Client) ResolveGwchildinsuranceOptionalresponsibilityplan(request *ResolveGwchildinsuranceOptionalresponsibilityplanRequest) (_result *ResolveGwchildinsuranceOptionalresponsibilityplanResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ResolveGwchildinsuranceOptionalresponsibilityplanResponse{}
	_body, _err := client.ResolveGwchildinsuranceOptionalresponsibilityplanEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

// Description:
//
// Description: 可选责任计划按因子反查
//
// Summary: 可选责任计划按因子反查
func (client *Client) ResolveGwchildinsuranceOptionalresponsibilityplanEx(request *ResolveGwchildinsuranceOptionalresponsibilityplanRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ResolveGwchildinsuranceOptionalresponsibilityplanResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ResolveGwchildinsuranceOptionalresponsibilityplanResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antdigital.aiosproduct.gwchildinsurance.optionalresponsibilityplan.resolve"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
