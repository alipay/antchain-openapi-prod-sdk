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
	// 当前用户，最大 64 字符
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
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

func (s *QueryGwchildinsuranceProfilelatestRequest) SetUserId(v string) *QueryGwchildinsuranceProfilelatestRequest {
	s.UserId = &v
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
	TenanatId *string `json:"tenanat_id,omitempty" xml:"tenanat_id,omitempty" require:"true"`
	// 当前用户，最大 64 字符
	UserId *string `json:"user_id,omitempty" xml:"user_id,omitempty" require:"true"`
	// 当前会话，最大 64 字符
	SessionId *string `json:"session_id,omitempty" xml:"session_id,omitempty" require:"true"`
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

func (s *QueryGwchildinsuranceProfiledetailRequest) SetTenanatId(v string) *QueryGwchildinsuranceProfiledetailRequest {
	s.TenanatId = &v
	return s
}

func (s *QueryGwchildinsuranceProfiledetailRequest) SetUserId(v string) *QueryGwchildinsuranceProfiledetailRequest {
	s.UserId = &v
	return s
}

func (s *QueryGwchildinsuranceProfiledetailRequest) SetSessionId(v string) *QueryGwchildinsuranceProfiledetailRequest {
	s.SessionId = &v
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
				"sdk_version":      tea.String("1.0.4"),
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
