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

// 任务统计
type TaskCount struct {
	// 总数量
	TotalCount *int64 `json:"total_count,omitempty" xml:"total_count,omitempty" require:"true"`
	// 成功数量
	SuccessCount *int64 `json:"success_count,omitempty" xml:"success_count,omitempty" require:"true"`
	// 处理中的数量
	ProcessingCount *int64 `json:"processing_count,omitempty" xml:"processing_count,omitempty" require:"true"`
	// 失败数量
	FailureCount *int64 `json:"failure_count,omitempty" xml:"failure_count,omitempty" require:"true"`
}

func (s TaskCount) String() string {
	return tea.Prettify(s)
}

func (s TaskCount) GoString() string {
	return s.String()
}

func (s *TaskCount) SetTotalCount(v int64) *TaskCount {
	s.TotalCount = &v
	return s
}

func (s *TaskCount) SetSuccessCount(v int64) *TaskCount {
	s.SuccessCount = &v
	return s
}

func (s *TaskCount) SetProcessingCount(v int64) *TaskCount {
	s.ProcessingCount = &v
	return s
}

func (s *TaskCount) SetFailureCount(v int64) *TaskCount {
	s.FailureCount = &v
	return s
}

// 事件租户
type EventTenant struct {
	// 智科租户2088 ID，tenant_id/tenant_name二选一
	TenantId *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
	// 租户8位字母，tenant_id/tenant_name二选一
	TenantName *string `json:"tenant_name,omitempty" xml:"tenant_name,omitempty"`
}

func (s EventTenant) String() string {
	return tea.Prettify(s)
}

func (s EventTenant) GoString() string {
	return s.String()
}

func (s *EventTenant) SetTenantId(v string) *EventTenant {
	s.TenantId = &v
	return s
}

func (s *EventTenant) SetTenantName(v string) *EventTenant {
	s.TenantName = &v
	return s
}

// 事件资源
type EventResource struct {
	// 资源类型
	Type *string `json:"type,omitempty" xml:"type,omitempty" require:"true"`
	// 实例ID
	Value *string `json:"value,omitempty" xml:"value,omitempty" require:"true"`
}

func (s EventResource) String() string {
	return tea.Prettify(s)
}

func (s EventResource) GoString() string {
	return s.String()
}

func (s *EventResource) SetType(v string) *EventResource {
	s.Type = &v
	return s
}

func (s *EventResource) SetValue(v string) *EventResource {
	s.Value = &v
	return s
}

// 键值对
type KeyValuePair struct {
	// 键
	Key *string `json:"key,omitempty" xml:"key,omitempty" require:"true"`
	// 值
	Value *string `json:"value,omitempty" xml:"value,omitempty" require:"true"`
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

// 事件接收人
type EventReceiver struct {
	// 接收人的有效联系方式
	Receiver *string `json:"receiver,omitempty" xml:"receiver,omitempty" require:"true"`
	// 接收人联系方式的类型
	ReceiverType *string `json:"receiver_type,omitempty" xml:"receiver_type,omitempty" require:"true"`
	// 消息发送类型
	MsgType *string `json:"msg_type,omitempty" xml:"msg_type,omitempty" require:"true"`
}

func (s EventReceiver) String() string {
	return tea.Prettify(s)
}

func (s EventReceiver) GoString() string {
	return s.String()
}

func (s *EventReceiver) SetReceiver(v string) *EventReceiver {
	s.Receiver = &v
	return s
}

func (s *EventReceiver) SetReceiverType(v string) *EventReceiver {
	s.ReceiverType = &v
	return s
}

func (s *EventReceiver) SetMsgType(v string) *EventReceiver {
	s.MsgType = &v
	return s
}

type ImportEventMetadataRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 元数据文本
	Content *string `json:"content,omitempty" xml:"content,omitempty" require:"true"`
}

func (s ImportEventMetadataRequest) String() string {
	return tea.Prettify(s)
}

func (s ImportEventMetadataRequest) GoString() string {
	return s.String()
}

func (s *ImportEventMetadataRequest) SetAuthToken(v string) *ImportEventMetadataRequest {
	s.AuthToken = &v
	return s
}

func (s *ImportEventMetadataRequest) SetContent(v string) *ImportEventMetadataRequest {
	s.Content = &v
	return s
}

type ImportEventMetadataResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s ImportEventMetadataResponse) String() string {
	return tea.Prettify(s)
}

func (s ImportEventMetadataResponse) GoString() string {
	return s.String()
}

func (s *ImportEventMetadataResponse) SetReqMsgId(v string) *ImportEventMetadataResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ImportEventMetadataResponse) SetResultCode(v string) *ImportEventMetadataResponse {
	s.ResultCode = &v
	return s
}

func (s *ImportEventMetadataResponse) SetResultMsg(v string) *ImportEventMetadataResponse {
	s.ResultMsg = &v
	return s
}

type ExportEventMetadataRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 事件码
	EventCode *string `json:"event_code,omitempty" xml:"event_code,omitempty" require:"true"`
}

func (s ExportEventMetadataRequest) String() string {
	return tea.Prettify(s)
}

func (s ExportEventMetadataRequest) GoString() string {
	return s.String()
}

func (s *ExportEventMetadataRequest) SetAuthToken(v string) *ExportEventMetadataRequest {
	s.AuthToken = &v
	return s
}

func (s *ExportEventMetadataRequest) SetEventCode(v string) *ExportEventMetadataRequest {
	s.EventCode = &v
	return s
}

type ExportEventMetadataResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 事件码元数据
	Content *string `json:"content,omitempty" xml:"content,omitempty"`
}

func (s ExportEventMetadataResponse) String() string {
	return tea.Prettify(s)
}

func (s ExportEventMetadataResponse) GoString() string {
	return s.String()
}

func (s *ExportEventMetadataResponse) SetReqMsgId(v string) *ExportEventMetadataResponse {
	s.ReqMsgId = &v
	return s
}

func (s *ExportEventMetadataResponse) SetResultCode(v string) *ExportEventMetadataResponse {
	s.ResultCode = &v
	return s
}

func (s *ExportEventMetadataResponse) SetResultMsg(v string) *ExportEventMetadataResponse {
	s.ResultMsg = &v
	return s
}

func (s *ExportEventMetadataResponse) SetContent(v string) *ExportEventMetadataResponse {
	s.Content = &v
	return s
}

type SendEventAsyncRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 事件码
	EventCode *string `json:"event_code,omitempty" xml:"event_code,omitempty" require:"true"`
	// 事件上下文，用于填充消息模板里的参数
	EventParams []*KeyValuePair `json:"event_params,omitempty" xml:"event_params,omitempty" type:"Repeated"`
	// 消息接收人，对应自定义人群
	EventReceivers []*EventReceiver `json:"event_receivers,omitempty" xml:"event_receivers,omitempty" type:"Repeated"`
	// 租户信息，对应智科用户群组
	EventTenant *EventTenant `json:"event_tenant,omitempty" xml:"event_tenant,omitempty"`
	// 事件资源，据此查询相关的内部小二群组
	EventResources []*EventResource `json:"event_resources,omitempty" xml:"event_resources,omitempty" type:"Repeated"`
	// 发送方，用于查询结果，可以是系统名、产品码、员工工号等等
	Sender *string `json:"sender,omitempty" xml:"sender,omitempty" require:"true"`
	// 描述sender
	SenderName *string `json:"sender_name,omitempty" xml:"sender_name,omitempty"`
}

func (s SendEventAsyncRequest) String() string {
	return tea.Prettify(s)
}

func (s SendEventAsyncRequest) GoString() string {
	return s.String()
}

func (s *SendEventAsyncRequest) SetAuthToken(v string) *SendEventAsyncRequest {
	s.AuthToken = &v
	return s
}

func (s *SendEventAsyncRequest) SetEventCode(v string) *SendEventAsyncRequest {
	s.EventCode = &v
	return s
}

func (s *SendEventAsyncRequest) SetEventParams(v []*KeyValuePair) *SendEventAsyncRequest {
	s.EventParams = v
	return s
}

func (s *SendEventAsyncRequest) SetEventReceivers(v []*EventReceiver) *SendEventAsyncRequest {
	s.EventReceivers = v
	return s
}

func (s *SendEventAsyncRequest) SetEventTenant(v *EventTenant) *SendEventAsyncRequest {
	s.EventTenant = v
	return s
}

func (s *SendEventAsyncRequest) SetEventResources(v []*EventResource) *SendEventAsyncRequest {
	s.EventResources = v
	return s
}

func (s *SendEventAsyncRequest) SetSender(v string) *SendEventAsyncRequest {
	s.Sender = &v
	return s
}

func (s *SendEventAsyncRequest) SetSenderName(v string) *SendEventAsyncRequest {
	s.SenderName = &v
	return s
}

type SendEventAsyncResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 事件ID
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty"`
}

func (s SendEventAsyncResponse) String() string {
	return tea.Prettify(s)
}

func (s SendEventAsyncResponse) GoString() string {
	return s.String()
}

func (s *SendEventAsyncResponse) SetReqMsgId(v string) *SendEventAsyncResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SendEventAsyncResponse) SetResultCode(v string) *SendEventAsyncResponse {
	s.ResultCode = &v
	return s
}

func (s *SendEventAsyncResponse) SetResultMsg(v string) *SendEventAsyncResponse {
	s.ResultMsg = &v
	return s
}

func (s *SendEventAsyncResponse) SetTaskId(v string) *SendEventAsyncResponse {
	s.TaskId = &v
	return s
}

type SendEventDirectRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 事件码
	EventCode *string `json:"event_code,omitempty" xml:"event_code,omitempty" require:"true"`
	// 事件参数
	EventParams []*KeyValuePair `json:"event_params,omitempty" xml:"event_params,omitempty" type:"Repeated"`
	// 接收者
	EventReceiver *EventReceiver `json:"event_receiver,omitempty" xml:"event_receiver,omitempty" require:"true"`
	// 发送方，用于查询结果，可以是系统名、产品码、员工工号等等
	Sender *string `json:"sender,omitempty" xml:"sender,omitempty" require:"true"`
	// 用于描述sender
	SenderName *string `json:"sender_name,omitempty" xml:"sender_name,omitempty"`
}

func (s SendEventDirectRequest) String() string {
	return tea.Prettify(s)
}

func (s SendEventDirectRequest) GoString() string {
	return s.String()
}

func (s *SendEventDirectRequest) SetAuthToken(v string) *SendEventDirectRequest {
	s.AuthToken = &v
	return s
}

func (s *SendEventDirectRequest) SetEventCode(v string) *SendEventDirectRequest {
	s.EventCode = &v
	return s
}

func (s *SendEventDirectRequest) SetEventParams(v []*KeyValuePair) *SendEventDirectRequest {
	s.EventParams = v
	return s
}

func (s *SendEventDirectRequest) SetEventReceiver(v *EventReceiver) *SendEventDirectRequest {
	s.EventReceiver = v
	return s
}

func (s *SendEventDirectRequest) SetSender(v string) *SendEventDirectRequest {
	s.Sender = &v
	return s
}

func (s *SendEventDirectRequest) SetSenderName(v string) *SendEventDirectRequest {
	s.SenderName = &v
	return s
}

type SendEventDirectResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 事件ID
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty"`
}

func (s SendEventDirectResponse) String() string {
	return tea.Prettify(s)
}

func (s SendEventDirectResponse) GoString() string {
	return s.String()
}

func (s *SendEventDirectResponse) SetReqMsgId(v string) *SendEventDirectResponse {
	s.ReqMsgId = &v
	return s
}

func (s *SendEventDirectResponse) SetResultCode(v string) *SendEventDirectResponse {
	s.ResultCode = &v
	return s
}

func (s *SendEventDirectResponse) SetResultMsg(v string) *SendEventDirectResponse {
	s.ResultMsg = &v
	return s
}

func (s *SendEventDirectResponse) SetTaskId(v string) *SendEventDirectResponse {
	s.TaskId = &v
	return s
}

type CountTaskMessageRequest struct {
	// OAuth模式下的授权token
	AuthToken *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	// 24位任务id
	TaskId *string `json:"task_id,omitempty" xml:"task_id,omitempty" require:"true"`
}

func (s CountTaskMessageRequest) String() string {
	return tea.Prettify(s)
}

func (s CountTaskMessageRequest) GoString() string {
	return s.String()
}

func (s *CountTaskMessageRequest) SetAuthToken(v string) *CountTaskMessageRequest {
	s.AuthToken = &v
	return s
}

func (s *CountTaskMessageRequest) SetTaskId(v string) *CountTaskMessageRequest {
	s.TaskId = &v
	return s
}

type CountTaskMessageResponse struct {
	// 请求唯一ID，用于链路跟踪和问题排查
	ReqMsgId *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	// 结果码，一般OK表示调用成功
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	// 异常信息的文本描述
	ResultMsg *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 事件码
	EventCode *string `json:"event_code,omitempty" xml:"event_code,omitempty"`
	// 任务状态
	TaskState *string `json:"task_state,omitempty" xml:"task_state,omitempty"`
	// 消息发送统计
	MessageCount *TaskCount `json:"message_count,omitempty" xml:"message_count,omitempty"`
}

func (s CountTaskMessageResponse) String() string {
	return tea.Prettify(s)
}

func (s CountTaskMessageResponse) GoString() string {
	return s.String()
}

func (s *CountTaskMessageResponse) SetReqMsgId(v string) *CountTaskMessageResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CountTaskMessageResponse) SetResultCode(v string) *CountTaskMessageResponse {
	s.ResultCode = &v
	return s
}

func (s *CountTaskMessageResponse) SetResultMsg(v string) *CountTaskMessageResponse {
	s.ResultMsg = &v
	return s
}

func (s *CountTaskMessageResponse) SetEventCode(v string) *CountTaskMessageResponse {
	s.EventCode = &v
	return s
}

func (s *CountTaskMessageResponse) SetTaskState(v string) *CountTaskMessageResponse {
	s.TaskState = &v
	return s
}

func (s *CountTaskMessageResponse) SetMessageCount(v *TaskCount) *CountTaskMessageResponse {
	s.MessageCount = v
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
				"sdk_version":      tea.String("1.0.4"),
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
 * Description: 事件元数据导入
 * Summary: 事件元数据导入
 */
func (client *Client) ImportEventMetadata(request *ImportEventMetadataRequest) (_result *ImportEventMetadataResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ImportEventMetadataResponse{}
	_body, _err := client.ImportEventMetadataEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 事件元数据导入
 * Summary: 事件元数据导入
 */
func (client *Client) ImportEventMetadataEx(request *ImportEventMetadataRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ImportEventMetadataResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ImportEventMetadataResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.notification.event.metadata.import"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 事件元数据导出
 * Summary: 事件元数据导出
 */
func (client *Client) ExportEventMetadata(request *ExportEventMetadataRequest) (_result *ExportEventMetadataResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &ExportEventMetadataResponse{}
	_body, _err := client.ExportEventMetadataEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 事件元数据导出
 * Summary: 事件元数据导出
 */
func (client *Client) ExportEventMetadataEx(request *ExportEventMetadataRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *ExportEventMetadataResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ExportEventMetadataResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.notification.event.metadata.export"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 发送事件(异步执行)
 * Summary: 发送事件(异步执行)
 */
func (client *Client) SendEventAsync(request *SendEventAsyncRequest) (_result *SendEventAsyncResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SendEventAsyncResponse{}
	_body, _err := client.SendEventAsyncEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 发送事件(异步执行)
 * Summary: 发送事件(异步执行)
 */
func (client *Client) SendEventAsyncEx(request *SendEventAsyncRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SendEventAsyncResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SendEventAsyncResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.notification.event.async.send"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 直发事件(同步调用)
 * Summary: 直发事件(同步调用)
 */
func (client *Client) SendEventDirect(request *SendEventDirectRequest) (_result *SendEventDirectResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &SendEventDirectResponse{}
	_body, _err := client.SendEventDirectEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 直发事件(同步调用)
 * Summary: 直发事件(同步调用)
 */
func (client *Client) SendEventDirectEx(request *SendEventDirectRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *SendEventDirectResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &SendEventDirectResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.notification.event.direct.send"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 获取事件发送结果
 * Summary: 获取事件发送结果
 */
func (client *Client) CountTaskMessage(request *CountTaskMessageRequest) (_result *CountTaskMessageResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	headers := make(map[string]*string)
	_result = &CountTaskMessageResponse{}
	_body, _err := client.CountTaskMessageEx(request, headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 获取事件发送结果
 * Summary: 获取事件发送结果
 */
func (client *Client) CountTaskMessageEx(request *CountTaskMessageRequest, headers map[string]*string, runtime *util.RuntimeOptions) (_result *CountTaskMessageResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CountTaskMessageResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.notification.task.message.count"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), headers, runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}
